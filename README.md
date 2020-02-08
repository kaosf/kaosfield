# kaosfield

My site [kaosfield](https://www.kaosfield.net) contents and builder for distribution.

Build with:

- [pug](https://pugjs.org/)

## How to build

Install Node.js.

```sh
nodenv install 13.8.0
# or any other methods as you like.
```

Install dependencies.

```sh
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

## License

[CC BY-NC-SA 4.0](http://creativecommons.org/licenses/by-nc-sa/4.0/)

Copyright (C) 2001-2020 ka
