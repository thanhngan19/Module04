<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: thanhngan
  Date: 10/5/2023
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
          crossorigin="anonymous">
    <style>
        h4, h5, h6 {
            text-align: center;
        }

        table {
            width: 100%;
        }


    </style>
</head>
<body>

<div class="container">
    <div class="row">
        <h4>TỜ KHAI Y TẾ</h4>
        <h5>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG THÔNG TIN CỦA ANH/ CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHONG CHỐNG
            DỊCH BỆNH </h5>
        <h6 style="color:rgb(255,0,0)">Khuyến cáo: Khai báo thông tin sai </h6>
        <form:form modelAttribute="newForm" method="post" action="/show/create">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label"><b>Họ tên (Ghi chữ in hoa)</b></label>
            <form:input path="name" type="text" class="form-control" id="exampleInputEmail1"
                        aria-describedby="emailHelp"/>
        </div>
        <table>
            <tr>
                <td>
                    <div class="mb-3 size radio">
                        <label for="exampleInputPassword1" class="form-label"><b>Năm Sinh</b></label>
                        <form:select path="birthday" items="${year}" class="form-control" name="category"
                                     id="category"/>
                    </div>
                </td>
                <td>
                    <div class="mb-3 radio">
                        <label for="exampleInputPassword1" class="form-label"><b>Giới tính</b></label>
                        <form:select path="gender" items="${gender1}" class="form-control" name="category"
                                     id="category"/>
                    </div>
                </td>
                <td>
                    <div class="mb-3 radio">
                        <label for="exampleInputPassword2" class="form-label"><b>Quốc Tịch</b></label>
                        <form:select path="nationality" items="${nationality1}" class="form-control" name="category"
                                     id="category"/>
                    </div>
                </td>
            </tr>
        </table>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label"><b>Số hộ chiếu,chứng minh nhân dân hoặc giấy thông hành
                khác</b></label>
            <form:input path="CMND" type="text" class="form-control" id="exampleInputEmail1"
                        aria-describedby="emailHelp"/>
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label"><b>Thông tin đi lại</b></label> <br>
            <form:radiobuttons path="vehicle" items="${vehicle1}"/>
        </div>

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label"><b>Số hiệu phương tiện số ghế</b></label>
            <form:input path="idVehicle" type="text" class="form-control" id="exampleInputEmail1"
                        aria-describedby="emailHelp"/>
        </div>

        <table>
            <tr>
                <label for="exampleInputPassword1" class="form-label"><b>Ngày Khởi Hành</b></label>
            </tr>
            <tr>
                <td>
                    <div class="mb-3 size ">

                        <form:select path="date" items="${day1}" class="form-control" name="category"
                                     id="category"/>
                    </div>
                </td>

                <td>
                    <div class="mb-3 size ">
                        <label for="exampleInputPassword1" class="form-label">       </label>
                        <form:select path="month" items="${month1}" class="form-control" name="category"
                                     id="category"/>
                    </div>
                </td>

                <td>
                    <div class="mb-3 size ">
                        <label for="exampleInputPassword1" class="form-label">     </label>
                        <form:select path="year" items="${year1}" class="form-control" name="category"
                                     id="category"/>
                    </div>
                </td>
            </tr>
        </table>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label"><b>Trong 14 ngày qua anh chị có đi đến nơi nào khác không</b></label>
            <form:input path="city" type="text" class="form-control" id="exampleInputEmail1"
                        aria-describedby="emailHelp"/>
        </div>
        <br>
        <h5 style="text-align: left">ĐỊA CHỈ LIÊN LẠC</h5>
                <table>
                    <tr>
                        <td>
                            <div class="mb-3 radio">
                                <label for="exampleInputPassword1" class="form-label"><b>Tỉnh/Thành</b></label>
                                <form:input path="province"  class="form-control" name="category"
                                             id="category" type="text"/>
                            </div>
                        </td>
                        <td>
                            <div class="mb-3 radio">
                                <label for="exampleInputPassword1" class="form-label"><b>Quận/Huyện</b></label>
                                <form:input path="district"  class="form-control" name="category"
                                             id="category"/>
                            </div>
                        </td>
                        <td>
                            <div class="mb-3 radio">
                                <label for="exampleInputPassword1" class="form-label"><b>Phường/Xã</b></label>
                                <form:input path="ward"  class="form-control" name="category"
                                             id="category"/>
                            </div>
                        </td>
                    </tr>
                </table>
        <div class="mb-3 radio">
            <label for="exampleInputPassword1" class="form-label"><b>Địa chỉ nơi ở</b></label>
            <form:input path="address"  class="form-control" name="category"
                        id="category" type="text"/>
        </div>
        <table>
            <tr>
                <td>
                    <div class="mb-3 radio">
                        <label for="exampleInputPassword1" class="form-label"><b>Điện thoại</b></label>
                        <form:input path="phoneNumber"  class="form-control" name="category"
                                    id="category" type="text"/>
                    </div>
                </td>
                <td>
                    <div class="mb-3 radio">
                        <label for="exampleInputPassword1" class="form-label"><b>Email</b></label>
                        <form:input path="email"  class="form-control" name="category"
                                    id="category" type="text"/>
                    </div>
                </td>
            </tr>
        </table>
        <br>
        <h6 style="text-align: left">Trong 14 ngày qua anh/chị có xuất hiện dấu hiệu nào sau đây hay không</h6>

    </div>
</div>
</form:form>
</body>
</html>
