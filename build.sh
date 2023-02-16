npx pug3 src --out static
rsync -acv --delete static/* target
rsync -acv --delete static/.well-known target
