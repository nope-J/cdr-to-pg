
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <script type="text/javascript">


    </script>
</head>

<body>
    <form action="${ctx}/cdr/addMissing.do">
        <table>
            <tr>
                <td>添加丢失数据</td>
                <td>日期格式（yyyyMMdd）</td>
            </tr>

            <tr>
                <td><input type="submit" value="添加"/></td>
                <td><input name="fileKey" /></td>
            </tr>
        </table>
    </form>
</body>
</html>