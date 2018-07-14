import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crawl the web to get Manong's url.
 * @author Jelif
 * @date 2018-07-14
 */
public class ManongMagzineSpyder {
    private static final Pattern LEVEL1_ITEM_PATTERN = Pattern.compile("<a href=\"(.*?)\" title=\"(码农.*?)\">");
    private static final Pattern LEVEL2_ITEM_PATTERN = Pattern.compile("href=\"(/book/download/.*?)\"");


    private static final String BASE_URL = "http://www.ituring.com.cn";
    private static final String SCARPE_URL = BASE_URL + "/menu/books?q=码农&page=";

    private static LinkedHashMap<String,String> parsedData = new LinkedHashMap<>();
    private static LinkedHashMap<String,String> finalData = new LinkedHashMap<>();

    public static void main(String[] args) {
        level1Scrape();
        level2Scrape();
        outputDownloadScript();
    }

    private static void level1Scrape(){
        int i = 0;
        while (true){
            try(InputStream inputStream = new URL(SCARPE_URL + i++).openStream()){
                String html = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
                Matcher matcher = LEVEL1_ITEM_PATTERN.matcher(html);
                boolean findFlag = false;
                while (matcher.find()) {
                    findFlag = true;
                    parsedData.put(UnescapeUtil.unescape(matcher.group(2)),BASE_URL + matcher.group(1));
                }
                if (!findFlag){
                    break;
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void level2Scrape(){
        for (String key:parsedData.keySet()){
            try(InputStream inputStream = new URL(parsedData.get(key)).openStream()){
                String html = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
                Matcher matcher = LEVEL2_ITEM_PATTERN.matcher(html);
                boolean findFlag = false;
                while (matcher.find()) {
                    findFlag = true;
                    finalData.put(key, BASE_URL+matcher.group(1));
                }
                System.out.println(findFlag?"+"+key:"-"+key);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void outputDownloadScript(){
        for (String key:finalData.keySet()){
            System.out.println(String.format("wget '%s' -O '%s'", finalData.get(key), key+".pdf"));
        }
    }
}
