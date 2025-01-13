npx pug3 src --out static
npx css-minify -f css/style.css -o . && mv style.min.css static/stylesheets/style.css
