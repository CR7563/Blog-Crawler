<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
	function checkData(){
		var q=document.getElementById("q").value.trim();
		if(q==null || q==""){
			alert("请输入您要查询的关键字！");
			return false;
		}else{
			return true;
		}
	}
</script>
<div class="row">
	<div class="col-md-12" style="padding-top: 10px">
		<nav class="navbar navbar-default">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="${pageContext.request.contextPath}/index.html"><font color="black"><strong>首页</strong></font></a>
		    </div>

		    <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" >
		      <ul class="nav navbar-nav">
		        <li><a href="${pageContext.request.contextPath}/aboutMe.html"><font color="black"><strong>关于本站</strong></font></a></li>
		        <li><a href="http://www.java1234.com/javapachongxuexiluxiantu.html" target="_blank"><font color="red"><strong>Java爬虫学习路线图</strong></font></a></li>
		      </ul>
		      <form action="http://zhannei.baidu.com/cse/search" target='_blank' class="navbar-form navbar-right" role="search" method="get" onsubmit="return checkData()">
		        <div class="form-group" >
                             <input type="hidden" name="s" value="12460614923704529778">      
                             <input type="hidden" name="entry" value="1">    
		          <input type="text" id="q" name="q"  class="form-control" placeholder="请输入要查询的关键字...">
		        </div>
		        <button type="submit" class="btn btn-default">搜索</button>
		      </form>
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
	</div>
</div>