set -x
lein run
mkdir -p target/site
cd target/site
npm install crypto-js@3.1.6
cd ../../
cp -r resources/public/* target/site
