(defproject wiseloong/child "0.1.0-SNAPSHOT"
  :description "wiseloong-子项目测试"
  :url "www.wiseloong.com"
  :license {:name "wiseloong"}

  :parent-project {:coords  [wiseloong/root "0.1.0-SNAPSHOT"]
                   :inherit [:managed-dependencies]}

  :plugins [[lein-parent "0.3.5"]]

  :dependencies [[ring "1.6.1"]
                 ;[ring/ring-core]
                 ])
