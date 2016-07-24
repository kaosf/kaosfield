(def rsync-command
  ;; Deploy to AWS S3
  ; ["aws" "s3" "sync" "target" "s3://foo.mydomain.com" "--exclude" "\".git/*\""]
  ;; Deploy to my own VPS or a rental server
  ["rsync" "-avz" "-e" "ssh" "--delete" "target" "123.45.67.890:www"]
  )

(defn run-rsync []
  (apply shell/sh rsync-command))

(defn deploy []
  (let [{exit :exit out :out err :err} (run-rsync)]
    (if (= exit 0)
      (println "Deployment succeeded!")
      ((println "Exit code:" exit)
       (println "Output:\n" out)
       (println "Error:\n" err)))))
