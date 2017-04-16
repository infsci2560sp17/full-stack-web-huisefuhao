

/*=============================================================
    Authour URI: www.binarytheme.com
    License: Commons Attribution 3.0

    http://creativecommons.org/licenses/by/3.0/

    100% Free To use For Personal And Commercial Use.
    IN EXCHANGE JUST GIVE US CREDIT US AND TELL YOUR FRIENDS ABOUT US
   
    ========================================================  */

(function ($) {
    "use strict";
    var mainApp = {

        mainFun: function () {
            /*====================================
               SLIDER SCRIPTS
               ======================================*/
            $('#carousel-slider').carousel({
                interval: 3000 //TIME IN MILLI SECONDS
            });
            /*====================================
                SCROLLING SCRIPTS
                ======================================*/

            $(function () {
                $('.scrollclass a').bind('click', function (event) { //just pass scrollclass in design and start scrolling
                    var $anchor = $(this);
                    $('html, body').stop().animate({
                        scrollTop: $($anchor.attr('href')).offset().top
                    }, 1200, 'easeInOutExpo');
                    event.preventDefault();
                });
            });
            /*====================================
            VAGAS SLIDESHOW SCRIPTS
            ======================================*/
            $(function () {
                $.vegas('slideshow', {
                    backgrounds: [
                      { src: "1.jpg", fade: 1000, delay: 9000 }, 
                      { src: "../1.jpg", fade: 1000, delay: 9000 }, 
                      { src: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1492976621&di=810902f947112291c1c21a1e46aa35dc&imgtype=jpg&er=1&src=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fitem%2F201210%2F21%2F20121021202014_kAAr3.thumb.600_0.jpeg", fade: 1000, delay: 9000 }, 
                      { src: "../../img/2.jpg", fade: 1000, delay: 9000 }, 
                      { src: "/img/3.jpg", fade: 1000, delay: 9000 }, 
                        
                     
                    ]
                })('overlay', {
                    /** SLIDESHOW OVERLAY IMAGE **/
                    src: 'assets/plugins/vegas/overlays/03.png' // THERE ARE TOTAL 01 TO 15 .png IMAGES AT THE PATH GIVEN, WHICH YOU CAN USE HERE
                });

            });

          

            /*====================================
               WRITE YOUR SCRIPTS BELOW 
           ======================================*/





        },

        initialization: function () {
            mainApp.mainFun();

        }

    };
    // Initializing ///

    $(document).ready(function () {
        mainApp.mainFun();
    });

}(jQuery));



