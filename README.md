# kaosfield

My homepage powered by Clojure.

[kaosfield](http://www.kaosfield.net)

[Hosted on Heroku](http://ka-ring.herokuapp.com)

## Notes

### Cedar version migration (on 2014-04-08)

Upgrade Cedar version from 10 to 14.

```sh
heroku stack
#=>
# === ka-ring Available Stacks
#   cedar-14
# * cedar-10

heroku stack:set cedar-14
```

Ref. [Migrating to the Celadon Cedar-14 Stack | Heroku Dev Center](https://devcenter.heroku.com/articles/cedar-14-migration)

## License

[MIT](http://opensource.org/licenses/MIT)

Copyright (C) 2014 ka
