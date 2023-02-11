all:
	npm run build

test:
	echo Do nothing.

release:
	test -f deploy.sh && bash deploy.sh
