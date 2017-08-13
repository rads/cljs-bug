# cljs-bug

## 1.9.854

```
cljs-bug $ rm -rf out && java -cp cljs-1.9.854.jar:src clojure.main build_with_bug.clj && node out/main.js a b c
args: nil

cljs-bug $ rm -rf out && java -cp cljs-1.9.854.jar:src clojure.main build_without_bug.clj && node out/main.js a b c
args: (a b c)
```

## 1.9.671

```
cljs-bug $ rm -rf out && java -cp cljs-1.9.671.jar:src clojure.main build_with_bug.clj && node out/main.js a b c
args: (a b c)

cljs-bug $ rm -rf out && java -cp cljs-1.9.671.jar:src clojure.main build_without_bug.clj && node out/main.js a b c
args: (a b c)
```
