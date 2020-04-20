

$("body").on("click",".navbar .navbar-collapse .navbar-nav nav-item",function(){
    $(this).addClass("active");
});

$(document).ready(function () {
    $('.navbar .navbar-collapse .navbar-nav a').click(function(e) {

        $('a').removeClass('active');

        var $parent = $(this).parent();
        if (!$parent.hasClass('active')) {
            $parent.addClass('active');
        }
    });
});