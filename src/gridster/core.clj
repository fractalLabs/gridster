(ns gridster.core
  (:use [hiccup core page element]))

;gridster.add_widget('<li class="new">The HTML of the widget...</li>', 1, 1);
(def css-includes (include-css "http://static.fractalmedia.mx/gridster/jquery.gridster.min.css"
                         "http://static.fractalmedia.mx/gridster/style.css"
                         "http://fonts.googleapis.com/css?family=Rancho"))

(def js-includes (include-js "http://static.fractalmedia.mx/gridster/jquery-1.7.2.min.js"
                             "http://static.fractalmedia.mx/gridster/jquery.gridster.js"))
;TODO parametrizar tamanios
;original: margins 10 10, base dimensions 140 140 chidas 420 420 8 8. previo 288 288
(def le-js [:script {:type "text/javascript"}
"var gridster;
  $(function(){
    gridster = $(\".gridster > ul\").gridster({
        widget_margins: [8, 8],
        widget_base_dimensions: [500, 500],
        min_cols: 3
    }).data('gridster');});" ])

;le quito esto a gridster para que no este chingando, nadamas hay q hacer un div class=gridster
(def le-mini-main-div  [:div {:class "gridster" :id "grid"} [:ul {:style "height: 480px; position: relative;"} ]])

(def le-micro-div [:div#gridster.gridster [:ul]])

(defn gridster 
  ([] (html css-includes
            js-includes
	    le-micro-div
            le-js))
  ([coll] (html css-includes js-includes le-js
  	  	[:div#gridster.gridster (vec (conj (map #(str "<li data-row='1' data-col='1' data-sizex='1' data-sizey='1'>" % "</li>") coll) "ul"))])))

