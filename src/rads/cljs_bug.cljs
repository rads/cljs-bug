(ns rads.cljs-bug)

(defn -main [& args]
  (enable-console-print!)
  (println "args:" args))

(set! *main-cli-fn* -main)
