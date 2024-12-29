## Calculate SHA256

```sh
wget 'https://cdn.jsdelivr.net/npm/nostr-zap@0.21.0'
sha256sum nostr-zap@0.21.0 #=> 68dc10e9707b8a304168c7a94b86b507e6b16f952be58ca136a3c28013b371c8
echo -n 68dc10e9707b8a304168c7a94b86b507e6b16f952be58ca136a3c28013b371c8 | xxd -r -p | base64 #=> aNwQ6XB7ijBBaMepS4a1B+axb5Ur5YyhNqPCgBOzccg=

wget 'https://cdn.jsdelivr.net/npm/nostr-zap-view@1'
sha256sum nostr-zap-view@1 #=> 14e791cc6ae4220065ba768931f27920e492d48e421437c366c81cd6b5f2d460
echo -n 14e791cc6ae4220065ba768931f27920e492d48e421437c366c81cd6b5f2d460 | xxd -r -p | base64 #=> FOeRzGrkIgBlunaJMfJ5IOSS1I5CFDfDZsgc1rXy1GA=
```

## References

- [Subresource Integrity \- Security on the web \| MDN](https://developer.mozilla.org/en-US/docs/Web/Security/Subresource_Integrity)
- [bash \- How to generate a SHA\-256 hash in base64 format from commandline? \- Super User](https://superuser.com/questions/1367616/how-to-generate-a-sha-256-hash-in-base64-format-from-commandline)
