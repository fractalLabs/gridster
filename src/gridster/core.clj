(ns gridster.core
  (:use [hiccup core page element]))


(def le-css [:style {:type "text/css"} " [data-col=\"7\"] { left:970px;}  [data-col=\"6\"] { left:810px;}  [data-col=\"5\"] { left:650px;}  [data-col=\"4\"] { left:490px;}  [data-col=\"3\"] { left:330px;}  [data-col=\"2\"] { left:170px;}  [data-col=\"1\"] { left:10px;}  [data-row=\"16\"] { top:2410px;}  [data-row=\"15\"] { top:2250px;}  [data-row=\"14\"] { top:2090px;}  [data-row=\"13\"] { top:1930px;}  [data-row=\"12\"] { top:1770px;}  [data-row=\"11\"] { top:1610px;}  [data-row=\"10\"] { top:1450px;}  [data-row=\"9\"] { top:1290px;}  [data-row=\"8\"] { top:1130px;}  [data-row=\"7\"] { top:970px;}  [data-row=\"6\"] { top:810px;}  [data-row=\"5\"] { top:650px;}  [data-row=\"4\"] { top:490px;}  [data-row=\"3\"] { top:330px;}  [data-row=\"2\"] { top:170px;}  [data-row=\"1\"] { top:10px;}  [data-sizey=\"1\"] { height:140px;} [data-sizey=\"2\"] { height:300px;} [data-sizey=\"3\"] { height:460px;} [data-sizey=\"4\"] { height:620px;} [data-sizey=\"5\"] { height:780px;} [data-sizey=\"6\"] { height:940px;} [data-sizey=\"7\"] { height:1100px;} [data-sizey=\"8\"] { height:1260px;} [data-sizey=\"9\"] { height:1420px;} [data-sizey=\"10\"] { height:1580px;} [data-sizey=\"11\"] { height:1740px;} [data-sizey=\"12\"] { height:1900px;} [data-sizey=\"13\"] { height:2060px;} [data-sizey=\"14\"] { height:2220px;} [data-sizey=\"15\"] { height:2380px;} [data-sizex=\"1\"] { width:140px;} [data-sizex=\"2\"] { width:300px;} [data-sizex=\"3\"] { width:460px;} [data-sizex=\"4\"] { width:620px;} [data-sizex=\"5\"] { width:780px;} [data-sizex=\"6\"] { width:940px;}"])

(def le-head [:head {} [:meta {:charset "utf-8"}] [:meta {:http-equiv "X-UA-Compatible", :content "IE=edge,chrome=1"}] [:link {:rel "stylesheet", :type "text/css", :href "http://static.fractalmedia.mx/gridster/jquery.gridster.min.css"}] [:link {:rel "stylesheet", :href "http://static.fractalmedia.mx/gridster/style.css"}] [:link {:href "http://fonts.googleapis.com/css?family=Rancho", :rel "stylesheet", :type "text/css"}]])

;original: margins 10 10, base dimensions 140 140 chidas 420 420 8 8
(def le-js [:script {:type "text/javascript"}
"var gridster;
  $(function(){
    gridster = $(\".gridster > ul\").gridster({
        widget_margins: [8, 8],
        widget_base_dimensions: [288, 288],
        min_cols: 3
    }).data('gridster');
  });"])

(def le-main-div  [:div {:role "main"} [:section {:class "demo"} [:div {:class "gridster ready"} [:ul {:style "height: 480px; position: relative;"}  [:li {:data-row "1", :data-col "2", :data-sizex "2", :data-sizey "1", :class "gs_w", :style "position: absolute;"}]  [:li {:data-row "1", :data-col "1", :data-sizex "1", :data-sizey "1", :class "gs_w", :style "position: absolute;"}]  [:li {:data-row "3", :data-col "3", :data-sizex "2", :data-sizey "1", :class "gs_w", :style "position: absolute;"}]  [:li {:data-row "1", :data-col "5", :data-sizex "2", :data-sizey "2", :class "gs_w", :style "position: absolute;"}] [:li {:class "gs_w", :data-row "2", :data-col "3", :data-sizex "1", :data-sizey "1", :style "position: absolute;"}] [:li {:data-row "3", :data-col "5", :data-sizex "2", :data-sizey "1", :class "gs_w", :style "position: absolute;"}] [:li {:data-row "2", :data-col "1", :data-sizex "1", :data-sizey "1", :class "gs_w", :style "position: absolute;"}] [:li {:data-row "2", :data-col "2", :data-sizex "1", :data-sizey "1", :class "gs_w", :style "position: absolute;"}] [:li {:data-row "3", :data-col "2", :data-sizex "1", :data-sizey "1", :class "gs_w player-revert", :style "position: absolute;"}]  [:li {:data-row "3", :data-col "1", :data-sizex "1", :data-sizey "1", :class "gs_w", :style "position: absolute;"}] [:li {:data-row "1", :data-col "4", :data-sizex "1", :data-sizey "2", :class "gs_w", :style "position: absolute;"}]]]]])
  
(def le-hiccup (html [:html {:class "no-js", :lang "en"}
  le-head
  [:body {} le-main-div [:script {:type "text/javascript", :src "http://static.fractalmedia.mx/gridster/jquery-1.7.2.min.js"}] [:script {:src "http://static.fractalmedia.mx/gridster/jquery.gridster.js", :type "text/javascript", :charset "utf-8"}] le-js]]))

(def le-mini-main-div  [:div {:class "gridster ready" :id "grid"} [:ul {:style "height: 480px; position: relative;"} ]])

(def le-hiccup2 (html [:html le-head
                       [:body {}
                        le-mini-main-div
                        [:script {:type "text/javascript", :src "http://static.fractalmedia.mx/gridster/jquery-1.7.2.min.js"}] "\n" [:script {:src "http://static.fractalmedia.mx/gridster/jquery.gridster.js", :type "text/javascript", :charset "utf-8"}] le-js]]))
