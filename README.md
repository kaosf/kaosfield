# kaosfield

My site [kaosfield](https://www.kaosfield.net/) contents and builder for distribution.

Build with:

- [pug](https://pugjs.org/)

## How to build

Install Node.js and dependencies.

```sh
asdf install
npm i
```

Build.

```sh
npm run build
```

Deployment.

```sh
cp deploy.sh.example deploy.sh
# Edit deploy.sh
npm run deploy
```

## How to inline CSS and image

```sh
npx css-minify -f static/stylesheets/style.css -o . && cat style.min.css && rm -f style.min.css
```

Inline it into `<style>...here...</style>`.

```sh
base64 static/icon.webp | tr -d '\n'
```

Inline it into `<img src="data:image/webp;base64,...here..."></img>`.

## License

[CC BY-NC-SA 4.0](http://creativecommons.org/licenses/by-nc-sa/4.0/)

Copyright (C) 2001-2025 ka
