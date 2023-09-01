all: build

build:
	npm run build

test:
	echo Do nothing.

release: build
	npm run deploy
