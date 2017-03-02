(function(document, window, $) {
  'use strict';
  var Site = window.Site;
  $(document).ready(function() {
    Site.run();

    $('.imoveis').hide();
    
    // Markers
    // ------------------
    (function() {
      var map = new GMaps({
        div: '#markersGmap',
        lat: -30.033561,
        lng: -51.230082
      });
      
      $('.imoveis').each(function(index){
    	  console.log();
    	  map.addMarker({
    	        lat: $(this).find('.lat').text(),
    	        lng: $(this).find('.lon').text(),
    	        infoWindow: {
    	          content: '<p>' + $(this).find('.des').text() + '</p>'
    	        }
    	      });
      });
    })();
  });
})(document, window, jQuery);
