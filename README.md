# kaosfield

My site [kaosfield](https://www.kaosfield.net) contents and builder for distribution.

Build with:

- [pug](https://pugjs.org/)

## How to build

Install Node.js and Yarn.

```sh
nodenv install 13.8.0
# or any other methods as you like.
```

Refer [the official installation guide](https://classic.yarnpkg.com/en/docs/install#debian-stable)
and install Yarn.

Install dependencies.

```sh
yarn
```

Build.

```sh
yarn build
```

Deployment.

```sh
cp deploy.sh.example deploy.sh
# Edit deploy.sh
yarn deploy
```

## License

[CC BY-NC-SA 4.0](http://creativecommons.org/licenses/by-nc-sa/4.0/)

Copyright (C) 2001-2021 ka
