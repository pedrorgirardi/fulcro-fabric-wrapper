(ns fulcro-fabric-wrapper.intro
  (:require [devcards.core :as rc :refer-macros [defcard]]
            [fulcro-fabric-wrapper.ui.components :as comp]))

(defcard SVGPlaceholder
  "# SVG Placeholder"
  (comp/ui-placeholder {:w 200 :h 200}))
