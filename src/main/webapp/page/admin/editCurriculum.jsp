<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <meta charset="utf-8">
    <title>编辑学生</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui-v2.6.3/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/public.css" media="all">
    <style>
        body {
            background-color: #ffffff;
        }
    </style>
</head>
<body>
<div class="layuimini-container">
    <div class="layuimini-main">

        <form class="layui-form" action="${pageContext.request.contextPath}/updateCur" method="post">
            <div class="layui-form-item" hidden>
                <label class="layui-form-label">课程编号</label>
                <div class="layui-input-block">
                    <input type="text" id="curId" name="curId" autocomplete="off" placeholder="学生学号" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">课程名称</label>
                <div class="layui-input-block">
                    <input type="text" name="curName"  autocomplete="off" placeholder="密码" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">先修课</label>
                <div class="layui-input-block">
                    <input type="text" name="curBefore"  autocomplete="off" placeholder="姓名" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">学分</label>
                <div class="layui-input-block">
                    <input type="text" name="curScore"  autocomplete="off" placeholder="性别" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">负责教师编号</label>
                <div class="layui-input-block">
                    <input type="text" name="teaId"  autocomplete="off" placeholder="身份证号" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script src="${pageContext.request.contextPath}/lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form','jquery'], function () {
        var form = layui.form,
            layer = layui.layer,
            $ = layui.$;
        $("#curId").val(parent.curId)
        //监听提交
        form.on('submit(saveBtn)', function (data) {
            var index = layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            }, function () {
                // 关闭弹出层
                layer.close(index);
                var iframeIndex = parent.layer.getFrameIndex(window.name);
                parent.layer.close(iframeIndex);

            });

            return false;
        });

    });
</script>
</body>
</html>