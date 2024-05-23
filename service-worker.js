/**
 * Welcome to your Workbox-powered service worker!
 *
 * You'll need to register this file in your web app and you should
 * disable HTTP caching for this file too.
 * See https://goo.gl/nhQhGp
 *
 * The rest of the code is auto-generated. Please don't update this file
 * directly; instead, make changes to your Workbox build configuration
 * and re-run your build process.
 * See https://goo.gl/2aRDsh
 */

importScripts("https://storage.googleapis.com/workbox-cdn/releases/4.3.1/workbox-sw.js");

self.addEventListener('message', (event) => {
  if (event.data && event.data.type === 'SKIP_WAITING') {
    self.skipWaiting();
  }
});

/**
 * The workboxSW.precacheAndRoute() method efficiently caches and responds to
 * requests for URLs in the manifest.
 * See https://goo.gl/S9QRab
 */
self.__precacheManifest = [
  {
    "url": "03-01.jpg",
    "revision": "61ccd31b9a99e4dc0b2115d7a181dc71"
  },
  {
    "url": "03-02.jpg",
    "revision": "0e42c83dcc174ebfdbb611ab0956fcd9"
  },
  {
    "url": "03-03.jpg",
    "revision": "dd23072447e0798b536bd162235d14c3"
  },
  {
    "url": "03-04.jpg",
    "revision": "661a64ee2776ef94b23ba82f7ee50969"
  },
  {
    "url": "03-05.jpg",
    "revision": "6f52dcb2ccb40af28a65a4b796eb918d"
  },
  {
    "url": "03-06.jpg",
    "revision": "2643698d9412e41a449c1edee719fb29"
  },
  {
    "url": "03-07.jpg",
    "revision": "c4a788f41d803f8b9bddb5adc0513be6"
  },
  {
    "url": "03-08.jpg",
    "revision": "4c810503ec4bc1adfd29904056fc2886"
  },
  {
    "url": "03-09.jpg",
    "revision": "9c798bc91f80f84b6b0e7f7fba26d65b"
  },
  {
    "url": "03-10.jpg",
    "revision": "bb5b18b65591e9d058edbc14b02c6ba5"
  },
  {
    "url": "03-11.jpg",
    "revision": "6a88d8f48c63e79c72ec45ae84a8d9ff"
  },
  {
    "url": "04-01.jpg",
    "revision": "4bbafd5dd4000461cef55f669139b17b"
  },
  {
    "url": "05-01.jpg",
    "revision": "8d54b111a4b6b5fb4cd39e4c7261b927"
  },
  {
    "url": "06-01.jpg",
    "revision": "cf2dab320c48c5ead6fe105863629e4e"
  },
  {
    "url": "06-02.jpg",
    "revision": "aa286f8fd6540b7a7b6d36392a63f505"
  },
  {
    "url": "06-03.jpg",
    "revision": "239fa5fb2a9063f1e261ae2db81fceef"
  },
  {
    "url": "06-04.jpg",
    "revision": "a2dbf924afd6a8580ce4a2d2bcd6e049"
  },
  {
    "url": "06-05.jpg",
    "revision": "22f4f542b283cdc3d027eb664424d3c8"
  },
  {
    "url": "06-06.jpg",
    "revision": "12017ddd5b9179e8f53e93044acee998"
  },
  {
    "url": "06-07.jpg",
    "revision": "1ded65fc56da9f0008ae4ef2eacc8175"
  },
  {
    "url": "1.jpg",
    "revision": "f1ea37a492254cc85dd6fd1e89b1a6b4"
  },
  {
    "url": "1.png",
    "revision": "d41d8cd98f00b204e9800998ecf8427e"
  },
  {
    "url": "12-01.jpg",
    "revision": "cc85570b3c89f73291af87791115986a"
  },
  {
    "url": "12-02.jpg",
    "revision": "f2b24c5c4beb21d5302c64b59445927a"
  },
  {
    "url": "12-03.jpg",
    "revision": "61fe98dff39d0887978deb0af605571b"
  },
  {
    "url": "12-04.jpg",
    "revision": "ff2468e7fbb03e034be0ffd7312dc7d9"
  },
  {
    "url": "12-05.jpg",
    "revision": "a126fe17514d81279c677666fd459d9d"
  },
  {
    "url": "12-06.jpg",
    "revision": "c25686b2f77ac7c5a2d4706f43e40132"
  },
  {
    "url": "12-07.jpg",
    "revision": "de17f3eb1df503250bcf1a5a4b533eec"
  },
  {
    "url": "12-08.jpg",
    "revision": "f3b58c768c18919a6fa2ab59ea6627db"
  },
  {
    "url": "13-01.jpg",
    "revision": "b22f06060909d43d796a8ffd4b0743a0"
  },
  {
    "url": "13-02.jpg",
    "revision": "2d2bca0518716a8dfaf37ef5c15e54ee"
  },
  {
    "url": "13-03.jpg",
    "revision": "fec1a3db903dc05c462fb6f384a400d6"
  },
  {
    "url": "2.jpg",
    "revision": "572bc2e4ef3efb7c81bbbcac5f09147b"
  },
  {
    "url": "3.jpg",
    "revision": "248757985bb49f73624c6923057530ac"
  },
  {
    "url": "4.jpg",
    "revision": "407c52446e2e463c4f8e494d52dbe485"
  },
  {
    "url": "404.html",
    "revision": "dbdcde2e285140131115a03580532293"
  },
  {
    "url": "5.jpg",
    "revision": "7e861769b640afa00fcc0ac4b72d9c52"
  },
  {
    "url": "answers_for_lq/lab1.html",
    "revision": "60d13c39fbe0a090ebe1a306df67602d"
  },
  {
    "url": "answers_for_lq/lab2.html",
    "revision": "1ddee88245ab92c98012b63348c88cfe"
  },
  {
    "url": "answers_for_lq/lab3.html",
    "revision": "3c9e84d1f4d59b58804c346042946ae4"
  },
  {
    "url": "answers_for_lq/lab4.html",
    "revision": "523297f8e431d3e327eba4e61839abfc"
  },
  {
    "url": "answers_for_lq/lab5.html",
    "revision": "25671a449c838560fa67c7b2611953b6"
  },
  {
    "url": "answers_for_lq/lab6.html",
    "revision": "77d608386a06e131d1bd85bd708e3cb7"
  },
  {
    "url": "api/index.html",
    "revision": "9b2d74b75e7327e1e0a44a314d84dd88"
  },
  {
    "url": "assets/css/0.styles.2e818263.css",
    "revision": "f30b1702ab04d75ab0e5cc4cde86042a"
  },
  {
    "url": "assets/img/relational_schema.621cba84.png",
    "revision": "621cba84f7979dad440af597145e1bbe"
  },
  {
    "url": "assets/img/search.83621669.svg",
    "revision": "83621669651b9a3d4bf64d1a670ad856"
  },
  {
    "url": "assets/js/10.b2815479.js",
    "revision": "a84a03024404eadd05a5ce745ded599a"
  },
  {
    "url": "assets/js/11.090e2359.js",
    "revision": "1b60fb465d38d703a66232e33126b1a2"
  },
  {
    "url": "assets/js/12.4d2ae5e0.js",
    "revision": "c804db57ccd0a8a639efd97b0166b7bd"
  },
  {
    "url": "assets/js/13.ab40e37a.js",
    "revision": "7924bdeeacd9987fa27aa026763dd5e4"
  },
  {
    "url": "assets/js/14.850df738.js",
    "revision": "b6d6e4c82ddae9d9958304d25ece3b0b"
  },
  {
    "url": "assets/js/15.527a7eeb.js",
    "revision": "bf5213581afa90f5a186d96e522e6c20"
  },
  {
    "url": "assets/js/16.32799145.js",
    "revision": "ef8721b7286ba82449571143cddbc6bb"
  },
  {
    "url": "assets/js/17.c69ee710.js",
    "revision": "85c4baa9a37ae3f1e3eb62a8d9218e99"
  },
  {
    "url": "assets/js/18.04363a56.js",
    "revision": "dc0ba527f8cd441d6577d0e20ee9aa89"
  },
  {
    "url": "assets/js/19.cca8035d.js",
    "revision": "283f286786db16aa693495bd2bd29910"
  },
  {
    "url": "assets/js/2.3e37f2f0.js",
    "revision": "4cb9cba76e7a882cfe08aedb5aabc2f9"
  },
  {
    "url": "assets/js/20.a648e7d2.js",
    "revision": "2582dfe7921c4227b5365119f52b0574"
  },
  {
    "url": "assets/js/21.04f99d65.js",
    "revision": "947d5931d8775500e6ad4971570c5d1e"
  },
  {
    "url": "assets/js/22.9807c6bf.js",
    "revision": "004050150c1e28f5a8e821d335998e14"
  },
  {
    "url": "assets/js/23.b3a8fd97.js",
    "revision": "67eee2196d8f341a1631a9aa38b4729b"
  },
  {
    "url": "assets/js/24.cde95c23.js",
    "revision": "6381b7826426ab67f6d2d3139c77ed32"
  },
  {
    "url": "assets/js/25.589ae2d5.js",
    "revision": "c44d8e44a05c49d265d2c01bd9d9650b"
  },
  {
    "url": "assets/js/26.4acf6b5a.js",
    "revision": "bc4ad34d7985995678718f41d3265db2"
  },
  {
    "url": "assets/js/27.220a344e.js",
    "revision": "2cc5ffd665c0fde49b097f15cf274170"
  },
  {
    "url": "assets/js/28.f5a40ee4.js",
    "revision": "95ed19aab678b927a83161a772460983"
  },
  {
    "url": "assets/js/29.2522c5c4.js",
    "revision": "d93f893168e0bad29e17de875cf0b245"
  },
  {
    "url": "assets/js/3.b46061b3.js",
    "revision": "f3c10fa042555fcd5887886d5a37b8d0"
  },
  {
    "url": "assets/js/30.a4c361d4.js",
    "revision": "d42e097fc1d2071336a2c73546e9ff1c"
  },
  {
    "url": "assets/js/31.6a0a5e5a.js",
    "revision": "c09158e1af84281baa900577da497504"
  },
  {
    "url": "assets/js/33.c292e60f.js",
    "revision": "29a74b8ec2eae31e0370eb5273d3c7e5"
  },
  {
    "url": "assets/js/4.a158fe79.js",
    "revision": "260bc098c6e3f0fde4e8270453210043"
  },
  {
    "url": "assets/js/5.d483a4b2.js",
    "revision": "8c5558802232cfc3c67c6308ca15f8a0"
  },
  {
    "url": "assets/js/6.a476fcc1.js",
    "revision": "cebc7508aee7913cd4655fcacd97e5fa"
  },
  {
    "url": "assets/js/7.e55fe1b2.js",
    "revision": "8a61d8b93a98be69befd44f5ee37ac19"
  },
  {
    "url": "assets/js/8.eb882451.js",
    "revision": "c4b0371bb4b144da570d94462d6da6c6"
  },
  {
    "url": "assets/js/9.49266d02.js",
    "revision": "484089610ffd293184aa6856189d799a"
  },
  {
    "url": "assets/js/app.7612cb4e.js",
    "revision": "a3513c24120901cecb3c85b8f620a159"
  },
  {
    "url": "conclusion/index.html",
    "revision": "42fd2f2cdf948b257cf4099d568868fa"
  },
  {
    "url": "design/index.html",
    "revision": "7dd85b465ff91a3fdb2474a4d0931037"
  },
  {
    "url": "index.html",
    "revision": "98635df3eeaaee649ed43d8aa7472aef"
  },
  {
    "url": "intro/index.html",
    "revision": "7a9babf7c5efd47e3adb53d5e3fbb741"
  },
  {
    "url": "license.html",
    "revision": "c6ae94487788630ac26fdec72cecb7f2"
  },
  {
    "url": "myAvatar.png",
    "revision": "b76db1e62eb8e7fca02a487eb3eac10c"
  },
  {
    "url": "requirements/index.html",
    "revision": "0e48a5184417ec96d44ee76935b3db2b"
  },
  {
    "url": "requirements/stakeholders-needs.html",
    "revision": "59786e6c468d796cd627b612879b6785"
  },
  {
    "url": "requirements/state-of-the-art.html",
    "revision": "3b32848d4d535886196ad28a5e6b52a1"
  },
  {
    "url": "software/index.html",
    "revision": "73c5646a989b7d166ecd3daefa1229d1"
  },
  {
    "url": "test/index.html",
    "revision": "dc476c7836892c858af72072e93eb18d"
  },
  {
    "url": "use cases/index.html",
    "revision": "0da70e2a422fd4c2c80435ed23b3f28d"
  }
].concat(self.__precacheManifest || []);
workbox.precaching.precacheAndRoute(self.__precacheManifest, {});
addEventListener('message', event => {
  const replyPort = event.ports[0]
  const message = event.data
  if (replyPort && message && message.type === 'skip-waiting') {
    event.waitUntil(
      self.skipWaiting().then(
        () => replyPort.postMessage({ error: null }),
        error => replyPort.postMessage({ error })
      )
    )
  }
})
