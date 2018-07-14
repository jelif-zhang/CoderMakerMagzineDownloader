This project can generate scripts to download Manong magzine.

Just call `java ManongMagzineSpyder` and the console will print which volume is being processed, and finally you'll get some commands using `wget` utility.

Execute these commands and those magzines will be downloaded.

For convenience, I list these command here(note that 3 volumes are missing because there is no associated download link on web page):

```
wget 'http://www.ituring.com.cn/book/download/b4f7e3d8-bd0d-46dc-9885-82220aaf91b1' -O '码农·打破“性能”瓶颈（第31期）.pdf'
wget 'http://www.ituring.com.cn/book/download/c8e97fbb-f68f-41c4-9140-f5764f2c9e7f' -O '码农·解锁机器学习（第30期）.pdf'
wget 'http://www.ituring.com.cn/book/download/17d50c68-200c-432d-8ba0-9c07f0bdc140' -O '码农·宇宙的故事（第29期）.pdf'
wget 'http://www.ituring.com.cn/book/download/1846e4c4-eed7-4cc1-8462-7a3a972c189f' -O '码农·“安全”攻防术（第28期）.pdf'
wget 'http://www.ituring.com.cn/book/download/59d4e541-6e0f-4789-bfb3-8ae4e86ba903' -O '码农增刊·告别拖延，拥抱高效!.pdf'
wget 'http://www.ituring.com.cn/book/download/191bae13-cfc9-4802-b118-c28075bad409' -O '码农·走进设计（第25期）.pdf'
wget 'http://www.ituring.com.cn/book/download/0f86a36f-6eb7-4781-b44f-942ad0a4ee02' -O '码农·数据技能（第24期）.pdf'
wget 'http://www.ituring.com.cn/book/download/d54bc683-8d59-425b-b093-056abd131b86' -O '码农·美妙的数学（第23期）.pdf'
wget 'http://www.ituring.com.cn/book/download/1fc5386a-66aa-4a1e-83bb-244a33c37b75' -O '码农·码农论剑（第22期）.pdf'
wget 'http://www.ituring.com.cn/book/download/2ea5e4fb-f566-44c6-bc5d-230f60412096' -O '码农增刊·硅谷之火.pdf'
wget 'http://www.ituring.com.cn/book/download/d8fb625d-1404-4fe0-a520-4197763dbfcd' -O '码农·A Swift Tour（第21期）.pdf'
wget 'http://www.ituring.com.cn/book/download/1d07abe0-584f-40f3-b060-ee7d9f7037f4' -O '码农·Docker云图（第20期）.pdf'
wget 'http://www.ituring.com.cn/book/download/862b6349-aa26-465d-92d0-cbbced3a91b1' -O '码农·Android好手（第19期）.pdf'
wget 'http://www.ituring.com.cn/book/download/a49855f2-a370-49bc-b8ca-4a86d18a3703' -O '码农· Hello Node（第18期）.pdf'
wget 'http://www.ituring.com.cn/book/download/a131f6e3-3a18-4d29-9bd4-cebb6a45ab4e' -O '码农增刊·游戏人生.pdf'
wget 'http://www.ituring.com.cn/book/download/4da8fa0a-4a6b-46be-88fd-45d5a65fb1ff' -O '码农·如何成为一位数据科学家（第17期）.pdf'
wget 'http://www.ituring.com.cn/book/download/15e171d6-0c4b-477b-89a5-aacaa38105fb' -O '码农·进击的Java（第16期）.pdf'
wget 'http://www.ituring.com.cn/book/download/4ba12d6c-4d22-4c55-9627-7790db9848b5' -O '码农增刊·码农好爸爸.pdf'
wget 'http://www.ituring.com.cn/book/download/56b5fd51-70b7-450e-8b15-a644e4bcdc5c' -O '码农·CTO长成记（第15期）.pdf'
wget 'http://www.ituring.com.cn/book/download/289f7a50-b8b4-4f77-b8e4-03085234ecf3' -O '码农·Web App不权威指南（第14期）.pdf'
wget 'http://www.ituring.com.cn/book/download/a2b656ed-04e8-4b1b-bdcb-a6812f502d9b' -O '码农增刊·Linus与Linux.pdf'
wget 'http://www.ituring.com.cn/book/download/4af6370f-e769-4b8c-a21b-6ca38629f7a6' -O '码农·Lisp面面观（第13期）.pdf'
wget 'http://www.ituring.com.cn/book/download/dc58ccbd-1c54-40c4-8f9f-bae94d6f14a4' -O '码农·JavaScript第二季（第12期）.pdf'
wget 'http://www.ituring.com.cn/book/download/8dd6429f-53ad-4af5-b8af-12f188a2745b' -O '码农·设计者的品味（第11期）.pdf'
wget 'http://www.ituring.com.cn/book/download/e32de12a-412b-46f8-b3ca-e8b82c753d94' -O '码农增刊·2014新年特刊.pdf'
wget 'http://www.ituring.com.cn/book/download/402c5b12-c3e4-40ae-bd1d-0768eef970bf' -O '码农·你的Mac（第9期）.pdf'
wget 'http://www.ituring.com.cn/book/download/08c2c731-707f-4d51-811e-66310ef0b56a' -O '码农·码农的面试（第8期）.pdf'
wget 'http://www.ituring.com.cn/book/download/ce2f9859-9a2d-4faf-a25c-f510ccdcce35' -O '码农·从Python开始（第7期）.pdf'
wget 'http://www.ituring.com.cn/book/download/cbeec8c2-00e6-4ef0-8919-6a385619ef49' -O '码农·网络“安全”（第6期）.pdf'
wget 'http://www.ituring.com.cn/book/download/49561cb8-a933-4ffb-a08e-6c43fc946fc5' -O '码农·App创富传奇（第5期）.pdf'
wget 'http://www.ituring.com.cn/book/download/d38410cd-051c-4654-bc8a-24c3f970af48' -O '码农·活的信息（第4期）.pdf'
wget 'http://www.ituring.com.cn/book/download/9833a84d-c97d-493d-b129-2d51d9d31239' -O '码农·开源意味着什么？（第3期）.pdf'
wget 'http://www.ituring.com.cn/book/download/2bf881a2-37c8-422a-9fde-a0f3bed02215' -O '码农·JavaScript（第2期）.pdf'
wget 'http://www.ituring.com.cn/book/download/d719d93a-5e3b-41de-bd1b-f271383e48b5' -O '码农·算法（第1期）.pdf'
```