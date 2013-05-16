(ns gridster.core
  (:use [hiccup core page element]))

;gridster.add_widget('<li class="new">The HTML of the widget...</li>', 1, 1);
(def css-includes (include-css "http://static.fractalmedia.mx/gridster/jquery.gridster.min.css"
                         "http://static.fractalmedia.mx/gridster/style.css"
                         "http://fonts.googleapis.com/css?family=Rancho"))

(def js-includes (include-js "http://static.fractalmedia.mx/gridster/jquery-1.7.2.min.js"
                             "http://static.fractalmedia.mx/gridster/jquery.gridster.js"))
;TODO parametrizar tamanios
;original: margins 10 10, base dimensions 140 140 chidas 420 420 8 8
(def le-js [:script {:type "text/javascript"}
"var gridster;
  $(function(){
    gridster = $(\".gridster > ul\").gridster({
        widget_margins: [8, 8],
        widget_base_dimensions: [288, 288],
        min_cols: 3
    }).data('gridster');});" ])

(def le-mini-main-div  [:div {:class "gridster ready" :id "grid"} [:ul {:style "height: 480px; position: relative;"} ]])

(def le-hiccup2 (html css-includes
                      le-mini-main-div
                      js-includes
                      le-js))
