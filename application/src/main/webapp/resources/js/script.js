/**
 * Created by k.mozafari on 8/16/2016.
 */

$(function () {
    $.ajaxSetup({headers: {'X-CSRF-Token': csrfToken}});

    //ajax('/admin/user/add', 'post', function () {
    //    var roles = $("input[name='roles']:checked").map(function () {
    //        return this.value;
    //    }).get();
    //    var data = {
    //        'userId': $('#name').val(),
    //        'password': $('#password').val(),
    //        'roles': roles
    //    };
    //    return data;
    //}, function () {
    //    console.log("ssssssssss");
    //});

//    $("#add_user_button").click(function (event) {
//            var roles = $("input[name='roles']:checked").map(function () {
//                return this.value;
//            }).get();
//            var data = {
//                'userId': $('#name').val(),
//                'password': $('#password').val(),
//                'roles': roles
//            };
//            $.ajax({
//                url: '/admin/user/add',
//                dataType: 'json',
//                type: 'post',
//                contentType: 'application/json',
//                data: JSON.stringify(data),
//                success: function () {
//                    console.log("ssssssssss");
//                }
//            });
//        }
//    )
});

//
//function ajax(element, url, type, data, successCallback) {
//    element.click(function (e) {
//        $.ajax({
//            url: url,
//            dataType: 'json',
//            type: type,
//            contentType: 'application/json',
//            data: JSON.stringify(data),
//            success: successCallback
//        });
//    });
//}


function ajax(url, type, data, successCallback) {
    $.ajax({
        url: url,
        dataType: 'json',
        type: type,
        contentType: 'application/json',
        data: JSON.stringify(data()),
        success: successCallback
    });
}

