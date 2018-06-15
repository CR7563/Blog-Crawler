<script type="text/javascript" src="${pageContext.request.contextPath}/static/ueditor/third-party/SyntaxHighlighter/shCore.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/ueditor/third-party/SyntaxHighlighter/shCoreDefault.css">
<script type="text/javascript">
    SyntaxHighlighter.all();
</script>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<script type="text/javascript">

	function submitData(){
		var content=$("#content").val();
		var imageCode=$("#imageCode").val();
		if(content==null || content==''){
			alert("请输入评论内容！");
		}else if(imageCode==null || imageCode==''){
			alert("请填写验证码！");
		}else{
			$.post("${pageContext.request.contextPath}/comment/save.do",{'content':content,'imageCode':imageCode,'blog.id':'${blog.id}'},function(result){
				if(result.success){
					window.location.reload();
					alert("评论已提交成功，审核通过后显示！");
				}else{
					alert(result.errorInfo);
				}
			},"json");
		}
	}
	

</script>
<div class="data_list">
	<div class="data_list_title">
		<img src="${pageContext.request.contextPath}/static/images/blog_show_icon.png"/>
		帖子信息
	</div>
	<div>
	   <div class="article_title"><h3><strong>${article.title }</strong></h3></div>
	   <div style="padding-left: 330px;padding-bottom: 20px;padding-top: 10px">
		<div class="bshare-custom"><a title="分享到QQ空间" class="bshare-qzone"></a><a title="分享到新浪微博" class="bshare-sinaminiblog"></a><a title="分享到人人网" class="bshare-renren"></a><a title="分享到腾讯微博" class="bshare-qqmb"></a><a title="分享到网易微博" class="bshare-neteasemb"></a><a title="更多平台" class="bshare-more bshare-more-icon more-style-addthis"></a><span class="BSHARE_COUNT bshare-share-count">0</span></div><script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=1&amp;lang=zh"></script><script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/bshareC0.js"></script>
	   </div>
		<div class="article_info">
			转载自：<a href="${article.orUrl}" target="_blank">互联网</a>&nbsp;&nbsp;发布时间：『 <fmt:formatDate value="${article.releaseDate }" type="date" pattern="yyyy-MM-dd HH:mm"/>』&nbsp;&nbsp;帖子类别：${article.arcType.typeName}&nbsp;&nbsp;阅读(${article.clickHit}) 
		</div>
		<div class="article_content">
			${article.content }
		</div>
		<div class="article_keyWord">
			<font><strong>关键字：</strong></font>
			<c:choose>
				<c:when test="${tags==null}">
					&nbsp;&nbsp;无
				</c:when>
				<c:otherwise>
					<c:forEach var="tag" items="${tags }">
						&nbsp;&nbsp;<a href="http://zhannei.baidu.com/cse/search?q=${tag }&s=12460614923704529778&entry=1" target="_blank">${tag }</a>&nbsp;&nbsp;
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</div>
		<div class="article_lastAndNextPage">
			${pageCode }
		</div>
	</div>
</div>

<div>
	<!--PC版-->
	<div id="SOHUCS" sid="76"></div>
	<script charset="utf-8" type="text/javascript" src="http://changyan.sohu.com/upload/changyan.js" ></script>
	<script type="text/javascript">
	window.changyan.api.config({
	appid: 'cysGfqVIm',
	conf: 'prod_b63f4160d3c1165b9a6d353811cc8e2d'
	});
	</script>
</div>
