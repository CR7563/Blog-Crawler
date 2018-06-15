# Blog-Crawler
## 爬虫实现原理
### 网络爬虫的整体执行流程：
1） 确定一个（多个）种子网页<br>
2） 进行数据的内容提取<br>
3） 将网页中的关联网页连接提取出来<br>
4） 将尚未爬取的关联网页内容放到一个队列中<br>
5） 从队列中取出一个待爬取的页面，判断之前是否爬过。<br>
6） 把没有爬过的进行爬取，并进行之前的重复操作。<br>
7） 直到队列中没有新的内容，爬虫执行结束。<br>

### 完成爬虫时，会有一些概念必须知道的：<br>
1） 深度（depth）：一般来说，表示从种子页到当前页的打开连接数，一般建议不要超过5层。<br>
2） 广度（宽度）优先和深度优先：表示爬取时的优先级。建议使用广度优先，按深度的层级来顺序爬取。<br>
### 接下来可以在网页的数据上下手了。
先实现一个单网页数据提取的功能。<br>
使用的技术可以有以下几类：<br>
1） 原生代码实现：<br>
　　a) URL类<br>
2） 使用第三方的URL库<br>
　　a) HttpClient库<br>
3） 开源爬虫框架<br>
　　a) Heritrix<br>
　　b) Nutch<br>
![](https://i.loli.net/2018/06/16/5b23ef6d7b2a0.png)
下面尝试将这个网页的源代码保存成为本地的一个文本文件，以便后续做离线分析。<br>
如果想根据条件提取网页中的内容信息，那么就需要使用Java的正则表达式。<br>
正则表达式Java.util包下提供了Pattern和Matcher这两个类，可以根据我们给定的条件来进行数据的匹配和提取。<br>
通过Pattern类中提供的规则字符或字符串，我们需要自己拼凑出我们的匹配规则。<br>
正则表达式最常用的地方是用来做表单提交的数据格式验证的。<br><br>
通过正则表达式完成超连接的连接匹配和提取对爬取的HTML页面来说，如果想提取连接地址，就必须找到所有超连接的标签和对应的属性。<br>

超连接标签是<a></a>，保存连接的属性是：href。<br>
<a href=”…”>…</a> <br>
规则：<br>
<a .*href=.+</a> <br>
## 控制台显示
![](https://i.loli.net/2018/06/16/5b23efa796253.png)
## 客户端
![](https://i.loli.net/2018/06/16/5b23efbe3826b.png)
![](https://i.loli.net/2018/06/16/5b23efd817c29.png)
爬取的博客内容：
![](https://i.loli.net/2018/06/16/5b23f0de3c2a7.png)
## 表数据
![](https://i.loli.net/2018/06/16/5b23f0864add2.png)
## 代码结构
![](https://i.loli.net/2018/06/16/5b23f0266466f.png)
## 总结：
对于数据爬取，用到了线程，类集处理，继承，正则表达式等各方面的知识，从一个网页以深度为主，广度为基本进行爬取，获取每一个网页的源代码.<br>

1、给出一个网页链接；<br>

2、用URL类本地连接，用字符流进行读取，并写入到本地；<br>

3、利用正则表达式在按行读取时获取该网页所存在的所有链接，以便进行深度+1的数据收集；<br>

4、利用递归的方法，借助容器list，Set，Map来对链接进行爬取和未爬取得划分；<br>

5、每次爬取一个网页时，所获得的所有链接在当前基础上深度+1，并且从未爬取队列中移除，加入到已爬取队列中；<br>

6、为提升性能，在进行递归的时候，可以利用线程，复写Thread的run()方法，用多线程进行网页数据爬取；<br>

7、直到爬取得网页深度达到你期望的深度时，爬取结束，此时可以查看本地目录生成的文件；<br>

8、后续对本地生成的文件进行数据分析，即可获取你想要的信息。<br>









