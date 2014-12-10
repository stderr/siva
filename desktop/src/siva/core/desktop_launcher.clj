(ns siva.core.desktop-launcher
  (:require [siva.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. siva "siva" 800 600)
  (Keyboard/enableRepeatEvents true))
