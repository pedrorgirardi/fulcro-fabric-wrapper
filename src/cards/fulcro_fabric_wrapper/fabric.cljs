(ns fulcro-fabric-wrapper.fabric
  (:require [devcards.core :refer-macros [defcard]]

            [fulcro.client.dom :as dom]

            ["react" :as react]
            ["@uifabric/icons" :as icons]
            ["office-ui-fabric-react/lib/Button" :as button]
            ["office-ui-fabric-react/lib/Checkbox" :as checkbox]))

; https://github.com/OfficeDev/office-ui-fabric-react/wiki/Using-icons
(icons/initializeIcons)

(defn fabric [class]
  (fn [props & children]
    (apply react/createElement class props children)))


(def ui-default-button (fabric button/DefaultButton))

(def ui-primary-button (fabric button/PrimaryButton))

(def ui-checkbox (fabric checkbox/Checkbox))


(defcard default-button
  "[Button](https://developer.microsoft.com/en-us/fabric#/components/button)"
  (dom/div nil
    (ui-default-button #js {:text "Default button"})))


(defcard primary-button
  "[Button](https://developer.microsoft.com/en-us/fabric#/components/button)"
  (ui-primary-button #js {:text "Primary button"}))


(defcard checkbox-checked
  "[Checkbox](https://developer.microsoft.com/en-us/fabric#/components/checkbox)"
  (ui-checkbox #js {:checked true}))


(defcard checkbox-unchecked
  "[Checkbox](https://developer.microsoft.com/en-us/fabric#/components/checkbox)"
  (ui-checkbox #js {:checked false}))
