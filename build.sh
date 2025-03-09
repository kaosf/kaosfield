npx pug3 src --out static
npx css-minify -f css/style.css -o . && mv style.min.css static/stylesheets/style.css
sha256sum static/icon.webp static/index.html static/qr.png static/stylesheets/style.css > checksum.sha256
