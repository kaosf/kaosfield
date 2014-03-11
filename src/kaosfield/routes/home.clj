(ns kaosfield.routes.home
  (:use compojure.core)
  (:require [kaosfield.views.layout :as layout]
            [kaosfield.util :as util]
            [hiccup.core]))

(def html
  (hiccup.core/html
    [:h2 "profile"]
    [:a {:href "http://gravatar.com/ka000"}
     [:img {:src "https://gravatar.com/avatar/884be098693425b409d25aaec5091de8?s=150"
            :alt "Gravatar"
            :width 150
            :height 150
            :style "border-radius: 15px"}]]
    [:ul
     [:li "name: ka (か)"]
     [:li "email: "]
     [:li "birthday: 1986-11-21"]]
    [:h2 "personal links"]
    [:ul
     [:li "Gravater: "
      [:a {:href "http://gravatar.com/ka000"} "ka000"]]
     [:li "GitHub: "
      [:a {:href "https://github.com/kaosf"} "kaosf"]]
     [:li "Bitbucket: "
      [:a {:href "https://bitbucket.org/kaosf"} "kaosf"]]
     [:li "Twitter: "
      [:a {:href "https://twitter.com/ka_"} "@ka_"]]
      [:ul
       [:li
        [:a {:href "http://twilog.org/ka_"} "Twilog"]]
       [:li
        [:a {:href "http://twitpic.com/photos/ka_"} "Twitpic"]]
       [:li
        [:a {:href "http://favstar.fm/users/ka_/recent"} "Favstar"]]]
     [:li "Qiita: "
      [:a {:href "http://qiita.com/users/ka_"} "ka_"]]
     [:li "Tumblr: "
      [:a {:href "http://kaosf.tumblr.com/"} "kaosf"]]
     [:li "Facebook: "
      [:a {:href "http://www.facebook.com/profile.php?id=100001727621039"} "Kasu Unko"]]
     [:li "Google+: "
      [:a {:href "https://plus.google.com/u/0/112376057736762975129/about"} "Kasu Unko"]]
     [:li [:a {:href "http://www.orkut.com/Main#Profile?uid=11721394279592984988"} "orkut"]]
     [:li "Hatena::Diary: "
      [:a {:href ""} "kaosf"]]
     [:li [:a {:href "http://sns.jubeat.info/?m=pc&a=page_f_home&target_c_member_id=677"} "jubeat SNS"]]
     [:li [:a {:href "http://mixi.jp/show_friend.pl?id=347551"} "mixi"]]]
    [:h2 "contents"]
    [:ul
     [:li "Old Diary Log"]
     [:li "Tougenkyou - やり込みサイト桃源郷コンテンツ (更新停止)"]
     [:li [:a {:href "http://experiment.kaosfield.net"} "Experimental Apps - 実験アプリとか置き場"]]]
    [:p "This site is powered by "
     [:a {:href "http://clojure.org"} "Clojure"]
     ", "
     [:a {:href "http://leiningen.org"} "Leiningen"]
     ", "
     [:a {:href "https://github.com/ring-clojure"} "Ring"]
     " and "
     [:a {:href "https://www.heroku.com"} "Heroku"]
     "."]
    [:p "Source code is " [:a {:href "https://github.com/kaosf/homepage-powered-by-luminus"} "here"] "!"]
    ))

(defn home-page []
  (layout/render
    "home.html" {:content html}))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page)))
