(ns fulcro-fabric-wrapper.client-test-main
  (:require fulcro-fabric-wrapper.tests-to-run
            [fulcro-spec.selectors :as sel]
            [fulcro-spec.suite :as suite]))

(enable-console-print!)

(suite/def-test-suite client-tests {:ns-regex #"fulcro-fabric-wrapper..*-spec"}
  {:default   #{::sel/none :focused}
   :available #{:focused}})

