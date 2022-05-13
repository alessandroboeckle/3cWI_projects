$(document).ready(function () {
    console.log("ready...");
    $("#button_send_name").click(function () {
        console.log("button_send_name called");
        var name = $("#name").val()
        console.log("name: " + name);

        $.ajax({
            type: "POST",
            url: "/sayhello",
            data: {"name": name},
            cache: false,
            success: function (data) {
                var result = $.parseJSON(data);
                $("#result_name").text(result.salutation + ' ' + result.name);
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert("Status: " + textStatus);
                alert("Error: " + errorThrown);
            }
        });
    });

    $("#button_send_age").click(function () {
        console.log("button_send_age called");
        var age = $("#age").val()
        console.log("age: " + age);

        $.ajax({
            type: "POST",
            url: "/age",
            data: {"age": age},
            cache: false,
            success: function (data) {
                var result = $.parseJSON(data);
                $("#result_age").text(result.salutation + ' ' + result.age);
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert("Status: " + textStatus);
                alert("Error: " + errorThrown);
            }
        });
    });
});	    
