function saveVipId(id) {
    $.ajax({
        url : "http://127.0.0.1:8080/travel/admin/saveVip",
        type : "POST",
        async : true,
        dataType : "text",
        data : {"id":id},
        success : function (req) {
            if (req == "success"){
                alert("修改成功！");
            } else {
                alert("修改失败，请重试！");
            }
            window.location.reload();
        },
        error : function () {
            alert("修改失败，请重试！");
            window.location.reload();
        },
    });
}
function deleteVipId(id) {
    $.ajax({
        url : "http://127.0.0.1:8080/travel/admin/deleteVip",
        type : "POST",
        async : true,
        dataType : "text",
        data : {"id":id},
        success : function (req) {
            if (req == "success"){
                alert("修改成功！");
            } else {
                alert("修改失败，请重试！");
            }
            window.location.reload();
        },
        error : function () {
            alert("修改失败，请重试！");
            window.location.reload();
        },
    });
}
function saveAgencyId(id) {
    $.ajax({
        url : "http://127.0.0.1:8080/travel/admin/saveAgency",
        type : "POST",
        async : true,
        dataType : "text",
        data : {"id":id},
        success : function (req) {
            if (req == "success"){
                alert("修改成功！");
            } else {
                alert("修改失败，请重试！");
            }
            window.location.reload();
        },
        error : function () {
            alert("修改失败，请重试！");
            window.location.reload();
        },
    });
}
function deleteAgencyId(id) {
    $.ajax({
        url : "http://127.0.0.1:8080/travel/admin/deleteAgency",
        type : "POST",
        async : true,
        dataType : "text",
        data : {"id":id},
        success : function (req) {
            if (req == "success"){
                alert("修改成功！");
            } else {
                alert("修改失败，请重试！");
            }
            window.location.reload();
        },
        error : function () {
            alert("修改失败，请重试！");
            window.location.reload();
        },
    });
}