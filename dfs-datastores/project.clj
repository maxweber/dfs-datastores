(defproject com.backtype/dfs-datastores "1.3.7-SNAPSHOT"
  :description "Dead-simple vertical partitioning, compression, appends, and consolidation of data on a distributed filesystem."
  :url "https://github.com/nathanmarz/dfs-datastores"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.slf4j/slf4j-api "1.6.6"]
                 [jvyaml/jvyaml "1.0.0"]
                 [com.google.guava/guava "13.0"]]
  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
                                    :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots"
                                     :creds :gpg}}
  :scm {:dir ".."}
  :pom-addition [:developers
                 [:developer
                  [:name "Nathan Marz"]
                  [:url "http://twitter.com/nathanmarz"]]
                 [:developer
                  [:name "Soren Macbeth"]
                  [:url "http://twitter.com/sorenmacbeth"]]
                 [:developer
                  [:name "Sam Ritchie"]
                  [:url "http://twitter.com/sritchie"]]]
  :javac-options ["-source" "1.6" "-target" "1.6"]
  :java-source-paths ["src/main/java" "src/test/java"]
  :junit ["src/test/java"]
  :profiles {:dev
             {:dependencies [[org.slf4j/slf4j-log4j12 "1.6.6"]]
              :plugins [[lein-junit "1.1.5"]]}
             :provided
             {:dependencies [[org.apache.hadoop/hadoop-core "1.0.3"]]}})
