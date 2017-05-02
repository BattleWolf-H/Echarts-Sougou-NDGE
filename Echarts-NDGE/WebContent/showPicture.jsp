<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 引入Jquery包 -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!-- 引入Echarts包 -->
<script type="text/javascript" src="js/echarts.min.js"></script>

</head>
<body bgcolor="#F0F0F0">
<h1 align="center">南丁格尔玫瑰图</h1><br>
<hr>
    <br/>
    	<div id="main" style="width: 1400px;height:1000px;"></div>

</body>
<script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        myChart.setOption({
        		    title : {
        		        text: '本数据来自搜狗热搜榜---2017.04.27',
        		        x:'center'
        		    },
        		    tooltip : {
        		        trigger: 'item',
        		        formatter: "{a} <br/>{b} : {c} ({d}%)"
        		    },
        		    toolbox: {
        		        show : true,
        		        feature : {
        		            mark : {show: true},
        		            dataView : {show: true, readOnly: false},
        		            magicType : {
        		                show: true,
        		                type: ['pie', 'funnel']
        		            },
        		            restore : {show: true},
        		            saveAsImage : {show: true}
        		        }
        		    },
        		    calculable : true,
        		    series : [
        		        {
        		            name:'热门电影',
        		            type:'pie',
        		            radius : [30, 110],
        		            center : ['20%', '20%'],
        		            roseType : 'area',
        		            data:[]
        		        },
        		        {
        		            name:'热门动漫',
        		            type:'pie',
        		            radius : [30, 110],
        		            center : ['50%', '20%'],
        		            roseType : 'area',
        		            data:[]
        		        },
        		        {
        		            name:'热门小说',
        		            type:'pie',
        		            radius : [30, 110],
        		            center : ['80%', '20%'],
        		            roseType : 'area',
        		            data:[]
        		        },
        		        {
        		            name:'热门人物',
        		            type:'pie',
        		            radius : [30, 110],
        		            center : ['20%', '50%'],
        		            roseType : 'area',
        		            data:[]
        		        },
        		        {
        		            name:'热门汽车',
        		            type:'pie',
        		            radius : [30, 110],
        		            center : ['50%', '50%'],
        		            roseType : 'area',
        		            data:[]
        		        },
        		        {
        		            name:'热门游戏',
        		            type:'pie',
        		            radius : [30, 110],
        		            center : ['80%', '50%'],
        		            roseType : 'area',
        		            data:[]
        		        },
        		        {
        		            name:'热门音乐',
        		            type:'pie',
        		            radius : [30, 110],
        		            center : ['20%', '80%'],
        		            roseType : 'area',
        		            data:[]
        		        },
        		        {
        		            name:'热门电视剧',
        		            type:'pie',
        		            radius : [30, 110],
        		            center : ['50%', '80%'],
        		            roseType : 'area',
        		            data:[]
        		        },
        		        {
        		            name:'热门综艺',
        		            type:'pie',
        		            radius : [30, 110],
        		            center : ['80%', '80%'],
        		            roseType : 'area',
        		            data:[]
        		        }
        		    ]

		});
		
		// 异步加载数据
		var info = {"opt": "pie"};
		$.post("./getData", info, function(data){
			var dat=data.split("?");
			var dat0=JSON.parse(dat[0]);
			var dat1=JSON.parse(dat[1]);
			var dat2=JSON.parse(dat[2]);
			var dat3=JSON.parse(dat[3]);
			var dat4=JSON.parse(dat[4]);
			var dat5=JSON.parse(dat[5]);
			var dat6=JSON.parse(dat[6]);
			var dat7=JSON.parse(dat[7]);
			var dat8=JSON.parse(dat[8]);
			
			/* for(var i=0; i < data.length; i++){
				mapOnlyKey.push( data[i].name);
				mapKeyValue.push({"value":data[i].value, "name": data[i].name });
				mapOnlyValue.push( data[i].value );
			}
		    console.log(mapOnlyKey);
		    console.log(mapKeyValue);
		    console.log(mapOnlyValue);
		    alert(mapKeyValue); */
		    // 填入数据
		    myChart.setOption({
		        
		        series: [{
		            data: dat0
		        },
		        {
		            data: dat1
		        },
		        {
		            data: dat2
		        },
		        {
		            data: dat3
		        },
		        {
		            data: dat4
		        },
		        {
		            data: dat5
		        },
		        {
		            data: dat6
		        },
		        {
		            data: dat7
		        },
		        {
		            data: dat8
		        }
		        ]
		    });
        // 使用刚指定的配置项和数据显示图表。
		});
		
    </script>

</html>