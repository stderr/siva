(defproject siva "0.0.1"
  :description "A rogue-based roleplaying game"
  
  :dependencies [[com.badlogicgames.gdx/gdx "1.4.1"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl "1.4.1"]
                 [com.badlogicgames.gdx/gdx-box2d "1.4.1"]
                 [com.badlogicgames.gdx/gdx-box2d-platform "1.4.1"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-bullet "1.4.1"]
                 [com.badlogicgames.gdx/gdx-bullet-platform "1.4.1"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-platform "1.4.1"
                  :classifier "natives-desktop"]
                 [org.clojure/clojure "1.6.0"]
                 [play-clj "0.4.2"]]
  
  :source-paths ["src" "src-common"]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [siva.core.desktop-launcher]
  :main siva.core.desktop-launcher)
