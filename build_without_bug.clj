(require '[cljs.build.api :as build])

(build/build "src" {:output-to "out/main.js"
                    :main 'rads.cljs-bug
                    :target :nodejs
                    :optimizations :none})
