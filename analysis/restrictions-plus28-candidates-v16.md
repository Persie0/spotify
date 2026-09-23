# Restrictions `+0x28` producer candidate binding v16

Focus: identify concrete vtables whose `+0x28` method could be called at `e930da` and write/produce the receiver pair later read from `[rsp+0x390]/[rsp+0x398]`. Static provenance only.

## Scored candidate AP/vtable rows with populated `+0x28`

| score | AP base | +0x00 | +0x08 | +0x10 | +0x20 | +0x28 | +0x78 | +0xa0 | +0xa8 | tags |
|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---|
| 23 | `0x1854998` | `0x1903f98` | `-` | `-` | `0xaae5e8` | `0x1145c8a` | `-` | `0x174f1dc` | `0x1146a50` | `0x390, 0x398, 0x410, rsp+0x` |
| 21 | `0x181bf48` | `0xc81db4` | `-` | `-` | `0xc82cc6` | `0xc85d5e` | `0xc842ac` | `0xc842ac` | `0xc84a92` | `0x390, 0x398, e99, rsp+0x` |
| 21 | `0x182d060` | `0xe0685c` | `0xe06c12` | `0xe06fda` | `0xe0774a` | `0xe07ad0` | `0xe09e14` | `0xe0a80e` | `0xe0a81e` | `0x390, 0x398, [rax+0xa8], rsp+0x` |
| 21 | `0x182d068` | `0xe06c12` | `0xe06fda` | `0xe07392` | `0xe07ad0` | `0xe07e86` | `0xe09e2e` | `0xe0a81e` | `0xe0a844` | `0x390, 0x398, [rax+0xa8], rsp+0x` |
| 21 | `0x182d070` | `0xe06fda` | `0xe07392` | `0xe0774a` | `0xe07e86` | `0xe081c0` | `0xe0a0f2` | `0xe0a844` | `0xe0a85e` | `0x390, 0x398, [rax+0xa8], rsp+0x` |
| 21 | `0x185ac20` | `0x11d2718` | `0x11d27e6` | `0x11d2902` | `0x11d2b20` | `0x11d2d28` | `0x11d3f24` | `0xada1e4` | `0x11d01be` | `0x390, 0x398, e99, rsp+0x` |
| 21 | `0x18b08d0` | `0xa7e38c` | `0xa7e3a2` | `0xa7e3b8` | `0xa7e64a` | `0xa7e734` | `0xa7fb31` | `0xa816cf` | `0xa816e5` | `0x390, 0x398, e99, rsp+0x` |
| 21 | `0x18b08d8` | `0xa7e3a2` | `0xa7e3b8` | `0xa7e560` | `0xa7e734` | `0xa7e773` | `0xa8164d` | `0xa816e5` | `0xa816fb` | `0x390, 0x398, e99, rsp+0x` |
| 17 | `0x1800910` | `0xacc504` | `0xacc516` | `0xacc51e` | `0xacc5b8` | `0xacc64a` | `0xacc752` | `0xa50370` | `0xacc824` | `0x390, 0x398, rsp+0x` |
| 17 | `0x1800918` | `0xacc516` | `0xacc51e` | `0xacc526` | `0xacc64a` | `0xacc652` | `0xacc75c` | `0xacc824` | `-` | `0x390, 0x398, rsp+0x` |
| 17 | `0x1815d48` | `0xc15176` | `0xc15352` | `-` | `0xc15a82` | `0xc15b3c` | `-` | `-` | `-` | `0x390, 0x398, rsp+0x` |
| 17 | `0x1815d50` | `0xc15352` | `-` | `-` | `0xc15b3c` | `0xc15b4e` | `0xc18124` | `-` | `0xc1a370` | `0x390, 0x398, rsp+0x` |
| 17 | `0x1826c28` | `0xd8617e` | `0xd8618a` | `0xd86192` | `0xd861d8` | `0xd86436` | `0xd8710c` | `0xd87d8c` | `0xd87d94` | `0x390, 0x398, rsp+0x` |
| 17 | `0x182cf18` | `0xe0266a` | `0xe02674` | `0xe0267e` | `0xe030bc` | `0xe03140` | `0xe03a46` | `0xe03b26` | `0xe03b36` | `0x390, 0x398, rsp+0x` |
| 17 | `0x182cf20` | `0xe02674` | `0xe0267e` | `0xe0302a` | `0xe03140` | `0xe033b8` | `0xe03a5c` | `0xe03b36` | `0xe03b44` | `0x390, 0x398, rsp+0x` |
| 17 | `0x183b6e8` | `0xf36c28` | `0xf36c8e` | `0xf36ca0` | `0xf37050` | `0xf370ac` | `-` | `-` | `-` | `0x390, 0x398, rsp+0x` |
| 17 | `0x183ea98` | `0xf9c03a` | `0xf9c29a` | `0xb3d784` | `0xf24bfe` | `0xf9ca6a` | `0xf99daa` | `0xfb00aa` | `0xfb0152` | `0x390, 0x398, rsp+0x` |
| 17 | `0x1840e00` | `0xfb12ae` | `0xfb13c0` | `0xfb14a6` | `0xfb16bc` | `0xfc14bc` | `0xfb1de8` | `0x9d7de0` | `0xfc1ce4` | `0x390, 0x398, rsp+0x` |
| 17 | `0x1849578` | `0x9d7de0` | `0xa50370` | `0x10765ea` | `0x10765fa` | `0x1076606` | `0x1077baa` | `-` | `-` | `0x390, 0x398, rsp+0x` |
| 17 | `0x185a918` | `0x11ca390` | `0xada1e4` | `0x11ca558` | `-` | `0x11d4aba` | `0x11d52d0` | `0x11d535a` | `0x9d81d0` | `0x390, 0x398, rsp+0x` |
| 17 | `0x185c920` | `0x9d7de0` | `0x1211a42` | `0xc5904a` | `-` | `0x1212354` | `0x121575a` | `-` | `0x12154b4` | `0x390, 0x398, rsp+0x` |
| 17 | `0x186b018` | `0x13b9264` | `0x13b9284` | `0x13b92a8` | `0xaa712a` | `0x13b9494` | `0x13b569a` | `-` | `0x9d7de0` | `0x390, 0x398, rsp+0x` |
| 17 | `0x1871050` | `0x1434532` | `0x1434676` | `0x1434776` | `0x1434c06` | `0x1434e68` | `0xa50370` | `0x14379be` | `-` | `0x390, 0x398, rsp+0x` |
| 17 | `0x18754b0` | `0xcca988` | `-` | `-` | `0xa50370` | `0x147c894` | `0x9d7de0` | `0x9d7de0` | `0xa50370` | `0x390, 0x398, rsp+0x` |
| 17 | `0x18b0eb0` | `0xa8996d` | `0xa89aa9` | `0xa89be5` | `0xa89d28` | `0xa89e51` | `0xa8a57f` | `0xa8a973` | `0xa8a9c5` | `0x390, 0x398, rsp+0x` |
| 16 | `0x18008e0` | `0x9d7de0` | `-` | `0xa50370` | `-` | `0xacc442` | `0xacc730` | `-` | `0xacc752` | `0x390, 0x398` |
| 15 | `0x18319b8` | `0xe993ae` | `-` | `0xa50370` | `-` | `0xe992a2` | `0xa50370` | `0xe9929a` | `-` | `e99, known-candidate-region, rsp+0x, target-e99` |
| 15 | `0x18319c8` | `0xa50370` | `-` | `-` | `0xe992b6` | `0xe992c8` | `0xe99288` | `-` | `0xeaaf4c` | `e99, known-candidate-region, rsp+0x, target-e99` |
| 15 | `0x1831a30` | `0xa50370` | `0xe9926a` | `0xe99288` | `0xa50370` | `0xe9929a` | `0x9d7de0` | `-` | `-` | `e99, known-candidate-region, rsp+0x, target-e99` |
| 15 | `0x184c338` | `0x18f6fc0` | `0x18f7078` | `0x18f7008` | `-` | `0x10a2082` | `0x10a2bc4` | `0x9d7de0` | `0xa50370` | `0x398, 0x410, rsp+0x` |
| 15 | `0x18856d0` | `0x15caf42` | `0x15caf54` | `0x15caff6` | `0x15cb08c` | `0x15cb0f2` | `0x15cbd1e` | `0x15cadec` | `0x15cbd52` | `0x390, 0x410, rsp+0x` |
| 14 | `0x1831980` | `0x9d7de0` | `0xa50370` | `0xea657c` | `-` | `0xe9938c` | `0xe99368` | `-` | `0x9d7de0` | `e99, known-candidate-region, target-e99` |
| 14 | `0x1831988` | `0xa50370` | `0xea657c` | `-` | `0xe9938c` | `0xe9939c` | `0xad6470` | `0x9d7de0` | `0xa50370` | `e99, known-candidate-region, target-e99` |
| 14 | `0x1831990` | `0xea657c` | `-` | `-` | `0xe9939c` | `0xe993ae` | `0xad647a` | `0xa50370` | `0xe9926a` | `e99, known-candidate-region, target-e99` |
| 14 | `0x18319e8` | `0xe992b6` | `0xe992c8` | `0xe99368` | `0xad647a` | `0xe99382` | `-` | `-` | `0xa50370` | `e99, known-candidate-region, target-e99` |
| 14 | `0x1831a10` | `0xe99382` | `-` | `-` | `0xa50370` | `0xe9926a` | `-` | `0xa50370` | `0xeaba9e` | `e99, known-candidate-region, target-e99` |
| 14 | `0x188bdb8` | `0x160ac9a` | `0x160acac` | `0x160ad4c` | `0xad647a` | `0xe99382` | `-` | `0x160d4dc` | `0x160d4e2` | `e99, known-candidate-region, target-e99` |
| 14 | `0x188ff68` | `0x162cc68` | `0x1680812` | `0x9d81d0` | `0x11665d4` | `0x162cd8a` | `0x162c3d6` | `0x162c422` | `0x162c430` | `[rax+0xa0], [rax+0xa8], known-candidate-region, rsp+0x` |
| 14 | `0x188ff70` | `0x1680812` | `0x9d81d0` | `0x11665c4` | `0x162cd8a` | `0x162cda4` | `0x162c3e4` | `0x162c430` | `0x162c43e` | `[rax+0xa0], [rax+0xa8], known-candidate-region, rsp+0x` |
| 14 | `0x1890240` | `0x162d6c0` | `0x162d6d6` | `0x162d6e2` | `0x162d75c` | `0x162d7b2` | `-` | `0x9d81d0` | `0x9d81d0` | `[rax+0xa0], [rax+0xa8], known-candidate-region, rsp+0x` |
| 14 | `0x1890248` | `0x162d6d6` | `0x162d6e2` | `0x162d6ee` | `0x162d7b2` | `0x162d7be` | `-` | `0x9d81d0` | `0x9d81d0` | `[rax+0xa0], [rax+0xa8], known-candidate-region, rsp+0x` |
| 14 | `0x1890260` | `0x162d75c` | `0x162d7b2` | `0x162d7be` | `0x11665d4` | `0x162d7ca` | `0x9d81d0` | `-` | `0x162f404` | `[rax+0xa0], [rax+0xa8], known-candidate-region, rsp+0x` |
| 14 | `0x1890268` | `0x162d7b2` | `0x162d7be` | `0x11665c4` | `0x162d7ca` | `0x162d7e4` | `0x9d81d0` | `0x162f404` | `0xa02220` | `[rax+0xa0], [rax+0xa8], known-candidate-region, rsp+0x` |
| 14 | `0x1890468` | `0x17adb94` | `-` | `-` | `0x1635176` | `0xe99382` | `0x1635300` | `0x9d7de0` | `0x163535a` | `e99, known-candidate-region, target-e99` |
| 14 | `0x18af480` | `0xa924d2` | `0xa924de` | `0xa924ea` | `0xa92502` | `0xa92954` | `0xa929cc` | `0xa92c40` | `0xa92c4c` | `0x390, 0x410` |
| 14 | `0x18af488` | `0xa924de` | `0xa924ea` | `0xa924f6` | `0xa92954` | `0xa92960` | `0xa929d8` | `0xa92c4c` | `0xa92c58` | `0x390, 0x410` |
| 14 | `0x18af490` | `0xa924ea` | `0xa924f6` | `0xa92502` | `0xa92960` | `0xa9296c` | `0xa929e4` | `0xa92c58` | `0xa92fd4` | `0x390, 0x410` |
| 14 | `0x18af498` | `0xa924f6` | `0xa92502` | `0xa92954` | `0xa9296c` | `0xa92978` | `0xa929f0` | `0xa92fd4` | `0xa931f0` | `0x390, 0x410` |
| 14 | `0x18af4a0` | `0xa92502` | `0xa92954` | `0xa92960` | `0xa92978` | `0xa92984` | `0xa929fc` | `0xa931f0` | `0xa931fc` | `0x390, 0x410` |
| 14 | `0x18af4a8` | `0xa92954` | `0xa92960` | `0xa9296c` | `0xa92984` | `0xa92990` | `0xa92c40` | `0xa931fc` | `0xa93208` | `0x390, 0x410` |
| 14 | `0x18af4b0` | `0xa92960` | `0xa9296c` | `0xa92978` | `0xa92990` | `0xa9299c` | `0xa92c4c` | `0xa93208` | `0xa9322e` | `0x390, 0x410` |
| 14 | `0x18af4b8` | `0xa9296c` | `0xa92978` | `0xa92984` | `0xa9299c` | `0xa929a8` | `0xa92c58` | `0xa9322e` | `0xa93254` | `0x390, 0x410` |
| 14 | `0x18af4c0` | `0xa92978` | `0xa92984` | `0xa92990` | `0xa929a8` | `0xa929b4` | `0xa92fd4` | `0xa93254` | `0xa93260` | `0x390, 0x410` |
| 14 | `0x18af4c8` | `0xa92984` | `0xa92990` | `0xa9299c` | `0xa929b4` | `0xa929c0` | `0xa931f0` | `0xa93260` | `0xa9335b` | `0x390, 0x410` |
| 14 | `0x18af4d0` | `0xa92990` | `0xa9299c` | `0xa929a8` | `0xa929c0` | `0xa929cc` | `0xa931fc` | `0xa9335b` | `0xa934a6` | `0x390, 0x410` |
| 14 | `0x18af4d8` | `0xa9299c` | `0xa929a8` | `0xa929b4` | `0xa929cc` | `0xa929d8` | `0xa93208` | `0xa934a6` | `0xa947b9` | `0x390, 0x410` |
| 14 | `0x18af4e0` | `0xa929a8` | `0xa929b4` | `0xa929c0` | `0xa929d8` | `0xa929e4` | `0xa9322e` | `0xa947b9` | `0xa947c5` | `0x390, 0x410` |
| 14 | `0x18af4e8` | `0xa929b4` | `0xa929c0` | `0xa929cc` | `0xa929e4` | `0xa929f0` | `0xa93254` | `0xa947c5` | `0xa947d1` | `0x390, 0x410` |
| 14 | `0x18af4f0` | `0xa929c0` | `0xa929cc` | `0xa929d8` | `0xa929f0` | `0xa929fc` | `0xa93260` | `0xa947d1` | `0xa947dd` | `0x390, 0x410` |
| 14 | `0x18b0bc8` | `0xa82647` | `0xa82661` | `0xa8267b` | `0xa8274f` | `0xa827c3` | `0xa844f9` | `0xa84686` | `0xa846b4` | `0x390, 0x410` |
| 14 | `0x18b0bd0` | `0xa82661` | `0xa8267b` | `0xa826d1` | `0xa827c3` | `0xa82837` | `0xa845ce` | `0xa846b4` | `0xa846e2` | `0x390, 0x410` |
| 14 | `0x18b0bd8` | `0xa8267b` | `0xa826d1` | `0xa8274f` | `0xa82837` | `0xa82865` | `0xa845fc` | `0xa846e2` | `0xa84710` | `0x390, 0x410` |
| 14 | `0x18b0be0` | `0xa826d1` | `0xa8274f` | `0xa827c3` | `0xa82865` | `0xa82893` | `0xa8462a` | `0xa84710` | `0xa8473e` | `0x390, 0x410` |
| 14 | `0x18b1168` | `0xa9276e` | `0xa92784` | `0xa927f8` | `0xa928e0` | `0xa92a08` | `0xa9323a` | `0xa934b2` | `0xa93694` | `0x390, 0x410` |
| 14 | `0x18b1170` | `0xa92784` | `0xa927f8` | `0xa9286c` | `0xa92a08` | `0xa92a7c` | `0xa9326c` | `0xa93694` | `0xa936f4` | `0x390, 0x410` |
| 14 | `0x18b1178` | `0xa927f8` | `0xa9286c` | `0xa928e0` | `0xa92a7c` | `0xa92af0` | `0xa93341` | `0xa936f4` | `0xa93722` | `0x390, 0x410` |
| 13 | `0x1812b38` | `0xbdd8d8` | `0xbdd990` | `0xbdd99a` | `0xbddacc` | `0xbddb90` | `-` | `0x9d7de0` | `0xa50370` | `0x390, [rax+0xa0], rsp+0x` |
| 13 | `0x182d030` | `0xe052ba` | `0xe055f8` | `0xe05608` | `0xe05f64` | `0xe06522` | `0xe0883e` | `0xe09b30` | `0xe09e14` | `0x398, [rax+0xa8], rsp+0x` |
| 13 | `0x182d038` | `0xe055f8` | `0xe05608` | `0xe05942` | `0xe06522` | `0xe0685c` | `0xe08b82` | `0xe09e14` | `0xe09e2e` | `0x398, [rax+0xa8], rsp+0x` |
| 13 | `0x182d040` | `0xe05608` | `0xe05942` | `0xe05f64` | `0xe0685c` | `0xe06c12` | `0xe092ea` | `0xe09e2e` | `0xe0a0f2` | `0x398, [rax+0xa8], rsp+0x` |
| 13 | `0x1869bd0` | `0x1066dbe` | `0x1399408` | `0x1390682` | `-` | `0x139ec1a` | `0x1390866` | `0x9d7de0` | `0xa50370` | `0x390, e99, rsp+0x` |
| 13 | `0x1869bd8` | `0x1399408` | `0x1390682` | `-` | `0x139ec1a` | `0x139ec24` | `0x9d7de0` | `0xa50370` | `0x139efe6` | `0x390, e99, rsp+0x` |
| 13 | `0x18717b0` | `0x1441fde` | `0x1441fea` | `0x1441ff6` | `-` | `0x1442590` | `0x1442572` | `-` | `-` | `0x390, [rax+0xa0], rsp+0x` |
| 13 | `0x18717b8` | `0x1441fea` | `0x1441ff6` | `-` | `0x1442590` | `0x14425c6` | `0x9d7de0` | `-` | `0xa0da20` | `0x390, [rax+0xa0], rsp+0x` |
| 13 | `0x1871818` | `0xa50370` | `0x1442552` | `0x1442572` | `0xa50370` | `0x1442586` | `-` | `0x14427a2` | `0x14427b0` | `0x390, [rax+0xa0], rsp+0x` |
| 13 | `0x187f2c8` | `0x154aeac` | `0x154af4c` | `0xad6470` | `0x154af66` | `0x154ae7c` | `0x154adca` | `0x154b84a` | `0x154b8b0` | `0x390, e99, rsp+0x` |
| 13 | `0x1890100` | `0x162d3da` | `0x1680812` | `0x9d81d0` | `0x11665d4` | `0x116675e` | `0x162d530` | `0x162d59a` | `0x162d5a8` | `[rax+0xa0], [rax+0xa8], known-candidate-region` |
| 13 | `0x1890108` | `0x1680812` | `0x9d81d0` | `0x11665c4` | `0x116675e` | `0x116676e` | `0x162d53e` | `0x162d5a8` | `0x162d5b8` | `[rax+0xa0], [rax+0xa8], known-candidate-region` |
| 13 | `0x18aefc8` | `0xa8489a` | `0xa848bc` | `0xa84952` | `0xa84980` | `0xa84d76` | `0xa84e1e` | `0xa852ab` | `0xa852b7` | `0x390, e99, rsp+0x` |
| 13 | `0x18b0ce0` | `0xa8495e` | `0xa8498c` | `0xa84ac5` | `0xa84b96` | `0xa84d06` | `0xa85170` | `0xa852c3` | `0xa858ff` | `0x390, e99, rsp+0x` |
| 13 | `0x18b0ce8` | `0xa8498c` | `0xa84ac5` | `0xa84b80` | `0xa84d06` | `0xa84d1c` | `0xa851e4` | `0xa858ff` | `0xa85a0e` | `0x390, e99, rsp+0x` |
| 13 | `0x18b0cf0` | `0xa84ac5` | `0xa84b80` | `0xa84b96` | `0xa84d1c` | `0xa84d32` | `0xa85258` | `0xa85a0e` | `0xa85a48` | `0x390, e99, rsp+0x` |
| 13 | `0x18b0cf8` | `0xa84b80` | `0xa84b96` | `0xa84d06` | `0xa84d32` | `0xa84d48` | `0xa8527f` | `0xa85a48` | `0xa86430` | `0x390, e99, rsp+0x` |
| 13 | `0x1950940` | `0x19509a0` | `-` | `-` | `-` | `0x161319c` | `-` | `-` | `-` | `0x390, [rax+0xa0], rsp+0x` |
| 12 | `0x180ee18` | `0xbc2f94` | `0xbc1ea6` | `0xbbdac6` | `0xbc3348` | `0xbbee56` | `0xbc507a` | `0xbc1b36` | `0xbc4f66` | `0x390, e99` |
| 12 | `0x1810340` | `0xbbdfdc` | `0xbbd1a0` | `0xbbceb2` | `0xbbc07c` | `0xbbee50` | `0xbc013e` | `0xbc4ede` | `0xbc0912` | `0x390, e99` |
| 12 | `0x1851d78` | `0x111f98c` | `-` | `0xa50370` | `-` | `0x1122e34` | `0xa50370` | `0xa50370` | `0x1122c22` | `0x398, e99` |
| 12 | `0x1863e28` | `0xb7d2b6` | `0x12fe892` | `0x12fe8a2` | `0x12fe8b6` | `0x12fe8d4` | `0x1300216` | `-` | `-` | `0x398, e99` |
| 11 | `0x1813498` | `0xa50370` | `0xbf5bd6` | `0xbf5bf6` | `0xa50370` | `0xbf5c0a` | `0xbf53f4` | `0xbf5468` | `0xbf547c` | `0x410, [rax+0xa8], rsp+0x` |
| 11 | `0x18213a8` | `0xcf7dfe` | `0xcf7e10` | `0xcf7e56` | `0xaae9bc` | `0xcf7e94` | `0xcf8cb0` | `0xcf938a` | `0xcf939c` | `0x410, e99, rsp+0x` |
| 11 | `0x1831a90` | `0xa50370` | `-` | `-` | `0xa50370` | `0xeaba9e` | `-` | `0xeaba4c` | `0xaae9b2` | `17da794, known-candidate-region, rsp+0x` |
| 11 | `0x1831ac8` | `0xeabc4e` | `-` | `-` | `0xeaba80` | `0xeaba92` | `0xaae9bc` | `0xeab102` | `0xeab114` | `17da794, known-candidate-region, rsp+0x` |
| 11 | `0x1854eb0` | `0x9d7de0` | `0xa50370` | `0x1147c04` | `0x1147c14` | `0x1147c20` | `0x114971c` | `0xb92a3a` | `0x11497fc` | `0x410, e99, rsp+0x` |
| 10 | `0x1815de0` | `0x9d7de0` | `-` | `-` | `0xc1a472` | `0xc1a484` | `0xc1aa70` | `0xc1ad1a` | `0xc1ad3e` | `17da794, [rax+0xa0], rsp+0x` |
| 10 | `0x1815f18` | `0xc1ad12` | `0xc1ad02` | `0x9d81d0` | `-` | `0xc1de30` | `-` | `-` | `-` | `17da794, e99, rsp+0x` |
| 10 | `0x18196c8` | `0x9d7de0` | `0xa50370` | `0xc52dca` | `0xc52dda` | `0xc52de6` | `0x9d7de0` | `0xc53490` | `-` | `17da794, e99, rsp+0x` |
| 10 | `0x1820048` | `0xce4afa` | `0xce4b66` | `0xce4bd2` | `0xce4caa` | `0xce4e38` | `0xce6870` | `0xce6b52` | `0xce6ba0` | `17da794, e99, rsp+0x` |
| 10 | `0x1823290` | `0xa50370` | `0xd2b852` | `0xd2b872` | `0xa50370` | `0xd2b886` | `-` | `0xac3ae0` | `0xbf7896` | `17da794, [rax+0xa8], rsp+0x` |
| 10 | `0x182c148` | `0x18e84e0` | `0x18e8580` | `0x18e8508` | `-` | `0xdf9bf0` | `-` | `0x1066dbe` | `0xdfadfe` | `17da794, [rax+0xa0], rsp+0x` |
| 10 | `0x182c150` | `0x18e8580` | `0x18e8508` | `-` | `0xdf9bf0` | `0xdf9c0e` | `0x15e3be4` | `0xdfadfe` | `0xdfaec0` | `17da794, [rax+0xa0], rsp+0x` |
| 10 | `0x182c170` | `0xdf9bf0` | `0xdf9c0e` | `0xdfb62c` | `0x1066dbe` | `0xdf9c20` | `0x1066dbe` | `0xdfb0f2` | `0xdfb198` | `17da794, [rax+0xa0], rsp+0x` |
| 10 | `0x184aac0` | `0xaae5e8` | `0x1092d8e` | `0xaa8e00` | `0x1091c74` | `0x1091e24` | `0x10928c2` | `-` | `0x1093664` | `17da794, e99, rsp+0x` |
| 10 | `0x1853cf8` | `0x15e3be4` | `0xaae5e8` | `0x113d0d8` | `0x1066dbe` | `0x113be72` | `0xaae9b2` | `0x113ce36` | `0x113ce4a` | `17da794, e99, rsp+0x` |
| 10 | `0x1855a90` | `0x115f05c` | `0x115f12c` | `-` | `0x115ff96` | `0x1160014` | `0xa50370` | `0xa50370` | `0x115ff4c` | `17da794, [rax+0xa8], rsp+0x` |
| 10 | `0x1855a98` | `0x115f12c` | `-` | `-` | `0x1160014` | `0x1160026` | `0x1160258` | `0x115ff4c` | `0x115ff6c` | `17da794, [rax+0xa8], rsp+0x` |
| 10 | `0x1855e60` | `0x1168586` | `0x9d7de0` | `-` | `0x1169570` | `0x1169606` | `0xa50370` | `0xa50370` | `0x1169526` | `17da794, [rax+0xa8], rsp+0x` |
| 10 | `0x1855e68` | `0x9d7de0` | `-` | `-` | `0x1169606` | `0x1169618` | `0x11698ce` | `0x1169526` | `0x1169546` | `17da794, [rax+0xa8], rsp+0x` |
| 10 | `0x1855f20` | `0xa50370` | `0x116955a` | `-` | `0x1169db0` | `0x1169e22` | `-` | `-` | `-` | `17da794, [rax+0xa8], rsp+0x` |
| 10 | `0x1855f28` | `0x116955a` | `-` | `-` | `0x1169e22` | `0x1169e34` | `0x116face` | `-` | `0x9d7de0` | `17da794, [rax+0xa8], rsp+0x` |
| 10 | `0x1855f80` | `0x1169fba` | `0x9d7de0` | `-` | `0x116face` | `0x116fb58` | `0xa50370` | `0xa50370` | `0x116f198` | `17da794, e99, rsp+0x` |
| 10 | `0x1855f88` | `0x9d7de0` | `-` | `-` | `0x116fb58` | `0x116fb6a` | `0x117018a` | `0x116f198` | `0x116f1b8` | `17da794, e99, rsp+0x` |
| 10 | `0x188bf08` | `0x160e1b0` | `0x160e1c2` | `-` | `0x160ddd8` | `0x160ddfc` | `0x16104d8` | `0x16105ee` | `0xa10b90` | `e99, known-candidate-region, rsp+0x` |
| 10 | `0x188bf10` | `0x160e1c2` | `-` | `-` | `0x160ddfc` | `0x160de0e` | `0x16104ee` | `0xa10b90` | `0x16105fe` | `e99, known-candidate-region, rsp+0x` |
| 10 | `0x188ff78` | `0x9d81d0` | `0x11665c4` | `0x11665d4` | `0x162cda4` | `0x162cdbe` | `0x162c3f4` | `0x162c43e` | `0x162c454` | `[rax+0xa8], known-candidate-region, rsp+0x` |
| 10 | `0x1890030` | `0x162c470` | `0xaf6576` | `0x162c486` | `-` | `0x162d060` | `0x162d1d4` | `0x11666e8` | `0x11666f2` | `[rax+0xa0], known-candidate-region, rsp+0x` |
| 10 | `0x1890038` | `0xaf6576` | `0x162c486` | `-` | `0x162d060` | `0x162d07a` | `0x162d210` | `0x11666f2` | `0x11666fc` | `[rax+0xa0], known-candidate-region, rsp+0x` |
| 10 | `0x1890040` | `0x162c486` | `-` | `-` | `0x162d07a` | `0x162d08c` | `0x162d24c` | `0x11666fc` | `0x162d2f4` | `[rax+0xa0], known-candidate-region, rsp+0x` |
| 10 | `0x1890270` | `0x162d7be` | `0x11665c4` | `0x11665d4` | `0x162d7e4` | `0x162d7fe` | `0x9d81d0` | `0xa02220` | `-` | `[rax+0xa8], known-candidate-region, rsp+0x` |
| 9 | `0x17fd188` | `0xa50370` | `0xa7bd6c` | `0xa7bf28` | `0xa7bfb4` | `0xa7bff0` | `0x451f74` | `0x37f3af` | `0x34bd6d` | `0x390, rsp+0x` |
| 9 | `0x17fd190` | `0xa7bd6c` | `0xa7bf28` | `0xa7bf6a` | `0xa7bff0` | `0xa7c08a` | `0xa7c4b6` | `0x34bd6d` | `0xa9fdea` | `0x398, rsp+0x` |
| 9 | `0x17fe410` | `0xab0550` | `-` | `-` | `0xa50370` | `0xab0b00` | `0xab12a6` | `0xab1316` | `0xab1328` | `0x390, rsp+0x` |
| 9 | `0x18008f0` | `0xa50370` | `-` | `-` | `0xacc504` | `0xacc516` | `0xacc74a` | `0xacc75c` | `-` | `0x390, rsp+0x` |
| 9 | `0x1800908` | `0xacc442` | `0xacc504` | `0xacc516` | `0xacc526` | `0xacc5b8` | `-` | `0x9d7de0` | `0xa50370` | `0x398, rsp+0x` |
| 9 | `0x1809410` | `0xb2cd6e` | `0xb2d16c` | `0xb2d56a` | `0xb2dd2e` | `0xb2e170` | `0xb2fa8e` | `-` | `-` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x1809418` | `0xb2d16c` | `0xb2d56a` | `0xb2d954` | `0xb2e170` | `0xb2e624` | `0xb2fa98` | `-` | `0xb326dc` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x180dad0` | `0x9d7de0` | `0xa50370` | `0xb7d0ea` | `-` | `0xb834e8` | `0xa50370` | `0xb829ea` | `-` | `0x398, rsp+0x` |
| 9 | `0x180e1f0` | `0xac3ae0` | `-` | `-` | `0xa50370` | `0xb8b412` | `0xb8d6b4` | `-` | `0x9d7de0` | `0x398, rsp+0x` |
| 9 | `0x180e208` | `0x9d7de0` | `0xa50370` | `0xb8b412` | `0xa5bbf0` | `0xb8b422` | `0x349099` | `0x9d7de0` | `0x9d7de0` | `0x398, rsp+0x` |
| 9 | `0x18123b0` | `0xa50370` | `0xbd3050` | `0xbd3078` | `0xa50370` | `0xbd3094` | `-` | `0xbd2dfa` | `0x9d7de0` | `0x390, rsp+0x` |
| 9 | `0x1812ac8` | `0xbd9ad0` | `0xbd9b38` | `0xbd9b4a` | `0xbd7a10` | `0xbdc4c0` | `0xbdd990` | `0xbddc08` | `0xbddc16` | `0x390, rsp+0x` |
| 9 | `0x1812b18` | `0xbdd89e` | `0xbdd8ac` | `0xbdd8ba` | `0xbdd8d8` | `0xbdd990` | `0x9d81d0` | `-` | `0xbd9a76` | `0x390, rsp+0x` |
| 9 | `0x1812b20` | `0xbdd8ac` | `0xbdd8ba` | `0xbdd8ce` | `0xbdd990` | `0xbdd99a` | `0x9d81d0` | `0xbd9a76` | `0xbd9a94` | `0x390, rsp+0x` |
| 9 | `0x1812b28` | `0xbdd8ba` | `0xbdd8ce` | `0xbdd8d8` | `0xbdd99a` | `0xbdd9aa` | `0xa5bbf0` | `0xbd9a94` | `0xbd9ab2` | `0x390, rsp+0x` |
| 9 | `0x1812b30` | `0xbdd8ce` | `0xbdd8d8` | `0xbdd990` | `0xbdd9aa` | `0xbddacc` | `0xbddc68` | `0xbd9ab2` | `0x9d7de0` | `0x390, rsp+0x` |
| 9 | `0x18192c8` | `0xc4d890` | `0xc4d9e8` | `-` | `0xc4db4a` | `0xc4db6c` | `0xc4e0b6` | `0xc4deaa` | `0xc4df4a` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x18192d0` | `0xc4d9e8` | `-` | `-` | `0xc4db6c` | `0xc4db7e` | `-` | `0xc4df4a` | `0xad6470` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x181bc98` | `0x9d7de0` | `0xa50370` | `0xc8049a` | `0xc804aa` | `0xc804b6` | `0xc44ebc` | `0x9d7de0` | `0xa50370` | `0x398, rsp+0x` |
| 9 | `0x181f7a0` | `0xcc4e4c` | `0xcc4eba` | `0xcc4eea` | `0xcc4ef2` | `0xcc4fdc` | `-` | `0x9d7de0` | `0xa50370` | `0x390, rsp+0x` |
| 9 | `0x181f7a8` | `0xcc4eba` | `0xcc4eea` | `0xcc4eea` | `0xcc4fdc` | `0xcc5322` | `0x9d7de0` | `0xa50370` | `0xcc94a6` | `0x390, rsp+0x` |
| 9 | `0x1820ff0` | `0xa50370` | `0xcf3944` | `-` | `0xcf5bf2` | `0xcf5c44` | `0xcf6b0c` | `0xcf67f8` | `0xcf680c` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x1820ff8` | `0xcf3944` | `-` | `-` | `0xcf5c44` | `0xcf5c56` | `0xcf6b16` | `0xcf680c` | `0xcf681e` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x1821f80` | `0x9d7de0` | `0xa50370` | `0xd077ba` | `0xd077ca` | `0xd077d6` | `-` | `0xd092a6` | `0x9d7de0` | `0x390, rsp+0x` |
| 9 | `0x1826b08` | `0xd82046` | `0xaf6576` | `0xca5c00` | `0xd821ec` | `0xd82226` | `0xd83da6` | `0xd851bc` | `0xa4b870` | `0x398, rsp+0x` |
| 9 | `0x1826b10` | `0xaf6576` | `0xca5c00` | `0xd821e4` | `0xd82226` | `0xd82b7c` | `0xd84c9c` | `0xa4b870` | `0xd85336` | `0x390, rsp+0x` |
| 9 | `0x1829bd8` | `0xdc5bea` | `0xdc5c00` | `-` | `0xdc6006` | `0xdc612c` | `0xa50370` | `0xdc6d58` | `0xdc6d6a` | `0x390, rsp+0x` |
| 9 | `0x1829be0` | `0xdc5c00` | `-` | `-` | `0xdc612c` | `0xdc613e` | `0xdc5538` | `0xdc6d6a` | `0xdc724a` | `0x390, rsp+0x` |
| 9 | `0x182d230` | `0xa7a3c8` | `0xe0b24a` | `-` | `0xe0d50c` | `0xe0d616` | `0xe108a6` | `0x342a40` | `-` | `0x390, rsp+0x` |
| 9 | `0x182d238` | `0xe0b24a` | `-` | `-` | `0xe0d616` | `0xe0d628` | `0xe108de` | `-` | `0x36d49a` | `0x390, rsp+0x` |
| 9 | `0x182d720` | `0xe22cd8` | `0xe22ee4` | `0xe22f50` | `0xe23080` | `0xe233f6` | `0xe23d96` | `0xe23e8c` | `0xe23f52` | `0x390, rsp+0x` |
| 9 | `0x182d820` | `0x385116` | `0x3666e6` | `-` | `0xe2718a` | `0xe29802` | `0xe2b702` | `-` | `0x9d7de0` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x182d828` | `0x3666e6` | `-` | `-` | `0xe29802` | `0xe29ad8` | `0xe2b892` | `0x9d7de0` | `0xa50370` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x182d858` | `0xe29cde` | `0xe2a00c` | `0xe2a462` | `0xe2ac00` | `0xe2af9c` | `0xa50370` | `0xe2ec3a` | `-` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x182d860` | `0xe2a00c` | `0xe2a462` | `0xe2a864` | `0xe2af9c` | `0xe2b312` | `0xe2ec06` | `-` | `-` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x182d868` | `0xe2a462` | `0xe2a864` | `0xe2ac00` | `0xe2b312` | `0xe2b59c` | `0xe2ec26` | `-` | `0x9d7de0` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x182d870` | `0xe2a864` | `0xe2ac00` | `0xe2af9c` | `0xe2b59c` | `0xe2b702` | `0x9d7de0` | `0x9d7de0` | `0xa50370` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x182e0d0` | `0xe3b5b0` | `-` | `0xa50370` | `-` | `0xe3dab8` | `0x9d7de0` | `0x9d7de0` | `0xa50370` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x182e3d0` | `0xe45b36` | `0xe45d76` | `0xe45d82` | `-` | `0xe49486` | `0xe4abc4` | `0xe4aec0` | `-` | `0x390, rsp+0x` |
| 9 | `0x182f198` | `0xe6dd12` | `0xe6dd52` | `0xe6dd64` | `0xe6df64` | `0xe6e326` | `0xe6fc18` | `0xe6f7b0` | `0xe6f850` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x182f398` | `0xe71850` | `0xe71a4e` | `0xe71fee` | `0xb8adae` | `0xe72122` | `0x9d81d0` | `-` | `0x9d7de0` | `0x398, rsp+0x` |
| 9 | `0x18307c8` | `0xaaaedc` | `0xaaaee6` | `0xe80c88` | `-` | `0xe80d56` | `0xad6470` | `0xe811d8` | `0xe811ec` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x18307d0` | `0xaaaee6` | `0xe80c88` | `-` | `0xe80d56` | `0xe80d6a` | `0xad647a` | `0xe811ec` | `0xe811fe` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x18307d8` | `0xe80c88` | `-` | `-` | `0xe80d6a` | `0xe80d7c` | `0xe814a6` | `0xe811fe` | `0xe8129e` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x18312e0` | `0xa50370` | `0xb48808` | `-` | `0xe8f66e` | `0xe8f6a2` | `0xe8f1e8` | `-` | `-` | `rsp+0x, target-local-e9` |
| 9 | `0x1831308` | `0xe8f6a2` | `0x9d7de0` | `0x9d7de0` | `0xca5c00` | `0xe8f874` | `-` | `0xeabdd0` | `0xeabdd8` | `rsp+0x, target-local-e9` |
| 9 | `0x1831378` | `0xe8f23c` | `-` | `-` | `0xa50370` | `0xe8f87c` | `-` | `-` | `-` | `rsp+0x, target-local-e9` |
| 9 | `0x1833808` | `0xecb210` | `0xecb2a6` | `0xecb340` | `0xbd80cc` | `0xecb468` | `0xc578ae` | `0xecbaac` | `0xecbabc` | `[rax+0xa0], [rax+0xa8], rsp+0x` |
| 9 | `0x1833ca8` | `0xecb210` | `0xecb2a6` | `0xecb340` | `0xbd80cc` | `0xecb468` | `0xc578ae` | `-` | `-` | `[rax+0xa0], [rax+0xa8], rsp+0x` |
| 9 | `0x1834340` | `0xecc958` | `0xecc96c` | `0xecc97e` | `0xecca38` | `0xecca42` | `0x43d318` | `0x43d318` | `0x43d318` | `0x390, rsp+0x` |
| 9 | `0x1834348` | `0xecc96c` | `0xecc97e` | `0xecca1e` | `0xecca42` | `0xecca58` | `0x19f4930` | `0x43d318` | `0x19f4990` | `0x390, rsp+0x` |
| 9 | `0x18344a8` | `0xaf6576` | `0xec70f2` | `0x9d81d0` | `0x9d7de0` | `0xed0a70` | `0xed2ba2` | `0x9d7de0` | `0xed2d36` | `0x390, rsp+0x` |
| 9 | `0x1843db0` | `0xfedd76` | `0xfedd80` | `0xfedd96` | `-` | `0xfedf2c` | `0xfee744` | `0xa50370` | `0xfee5ce` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x1843db8` | `0xfedd80` | `0xfedd96` | `-` | `0xfedf2c` | `0xfedf64` | `0xfee75a` | `0xfee5ce` | `0xfee5ee` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x1843dc0` | `0xfedd96` | `-` | `-` | `0xfedf64` | `0xfedf76` | `-` | `0xfee5ee` | `0x9d7de0` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x1844800` | `0x1006db0` | `-` | `-` | `0x1007f5c` | `0x1007f6e` | `0x10089d0` | `0x1008444` | `0x1008464` | `e99, known-candidate-region` |
| 9 | `0x1844828` | `0x1007f6e` | `-` | `0xa50370` | `-` | `0x1007f78` | `0x1008444` | `-` | `-` | `e99, known-candidate-region` |
| 9 | `0x1849958` | `0x9d7de0` | `0xa50370` | `0x107efbe` | `-` | `0x107faa8` | `-` | `0x108002e` | `0xaae9b2` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x184c508` | `0x10a3c9e` | `0x10a3cb2` | `-` | `0x10a44d0` | `0x10a44f6` | `-` | `0xb79962` | `0xb7996c` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x184c510` | `0x10a3cb2` | `-` | `-` | `0x10a44f6` | `0x10a4508` | `0x10a4954` | `0xb7996c` | `0x10a4a34` | `[rax+0xa0], e99, rsp+0x` |
| 9 | `0x184ea90` | `0x10d4edc` | `0x10d4ef6` | `0x10d4f22` | `0x10d4f50` | `0xe8f874` | `0x10d4dee` | `0x10d53c0` | `0xfef81e` | `rsp+0x, target-local-e9` |
| 9 | `0x1850400` | `0x9d7de0` | `0x9d7de0` | `0x9d7de0` | `0x9d7de0` | `0x10f80ba` | `0x155e790` | `0x10f9884` | `0x10f9924` | `0x398, rsp+0x` |

## Candidate `+0x28` method windows

### AP `0x1854998` +0x28 -> `0x1145c8a` score 23

```text
 1145c8a:	55                   	push   rbp
 1145c8b:	41 57                	push   r15
 1145c8d:	41 56                	push   r14
 1145c8f:	41 55                	push   r13
 1145c91:	41 54                	push   r12
 1145c93:	53                   	push   rbx
 1145c94:	48 81 ec d8 05 00 00 	sub    rsp,0x5d8
 1145c9b:	49 89 cf             	mov    r15,rcx
 1145c9e:	49 89 d4             	mov    r12,rdx
 1145ca1:	49 89 f6             	mov    r14,rsi
 1145ca4:	48 89 fb             	mov    rbx,rdi
 1145ca7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1145cae:	00 00
 1145cb0:	48 89 84 24 d0 05 00 	mov    QWORD PTR [rsp+0x5d0],rax
 1145cb7:	00
 1145cb8:	48 83 c6 08          	add    rsi,0x8
 1145cbc:	48 89 d7             	mov    rdi,rdx
 1145cbf:	e8 2a 9a 95 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 1145cc4:	84 c0                	test   al,al
 1145cc6:	0f 84 9c 02 00 00    	je     1145f68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d37e>
 1145ccc:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
 1145cd1:	e8 0b ba 49 00       	call   15e16e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426c65>
 1145cd6:	3d aa 20 a0 83       	cmp    eax,0x83a020aa
 1145cdb:	0f 84 02 06 00 00    	je     11462e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d6f9>
 1145ce1:	3d f4 42 2a 9d       	cmp    eax,0x9d2a42f4
 1145ce6:	0f 84 5f 07 00 00    	je     114644b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d861>
 1145cec:	3d fd d3 59 dc       	cmp    eax,0xdc59d3fd
 1145cf1:	0f 84 a6 06 00 00    	je     114639d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d7b3>
 1145cf7:	3d fc 74 ec 0c       	cmp    eax,0xcec74fc
 1145cfc:	0f 84 88 02 00 00    	je     1145f8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d3a0>
 1145d02:	3d 67 6b 25 3d       	cmp    eax,0x3d256b67
 1145d07:	0f 84 0d 04 00 00    	je     114611a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d530>
 1145d0d:	3d 46 e2 32 34       	cmp    eax,0x3432e246
 1145d12:	0f 84 28 03 00 00    	je     1146040 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d456>
 1145d18:	3d e4 bc 16 32       	cmp    eax,0x3216bce4
 1145d1d:	0f 85 45 02 00 00    	jne    1145f68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d37e>
 1145d23:	0f 57 c0             	xorps  xmm0,xmm0
 1145d26:	4c 8d ac 24 98 04 00 	lea    r13,[rsp+0x498]
 1145d2d:	00
 1145d2e:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
 1145d33:	48 8d 05 2e ef 70 00 	lea    rax,[rip+0x70ef2e]        # 1854c68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11350>
 1145d3a:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
 1145d3e:	41 83 65 18 00       	and    DWORD PTR [r13+0x18],0x0
 1145d43:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
 1145d48:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
 1145d4d:	48 8d 2d a4 9a 2f ff 	lea    rbp,[rip+0xffffffffff2f9aa4]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 1145d54:	49 89 6d 38          	mov    QWORD PTR [r13+0x38],rbp
 1145d58:	49 89 6d 40          	mov    QWORD PTR [r13+0x40],rbp
 1145d5c:	49 89 6d 48          	mov    QWORD PTR [r13+0x48],rbp
 1145d60:	49 89 6d 50          	mov    QWORD PTR [r13+0x50],rbp
 1145d64:	49 89 6d 58          	mov    QWORD PTR [r13+0x58],rbp
 1145d68:	49 89 6d 60          	mov    QWORD PTR [r13+0x60],rbp
 1145d6c:	49 89 6d 68          	mov    QWORD PTR [r13+0x68],rbp
 1145d70:	49 89 6d 70          	mov    QWORD PTR [r13+0x70],rbp
 1145d74:	49 89 6d 78          	mov    QWORD PTR [r13+0x78],rbp
 1145d78:	49 89 ad 80 00 00 00 	mov    QWORD PTR [r13+0x80],rbp
 1145d7f:	49 89 ad 88 00 00 00 	mov    QWORD PTR [r13+0x88],rbp
 1145d86:	49 89 ad 90 00 00 00 	mov    QWORD PTR [r13+0x90],rbp
 1145d8d:	49 89 ad 98 00 00 00 	mov    QWORD PTR [r13+0x98],rbp
 1145d94:	49 89 ad a0 00 00 00 	mov    QWORD PTR [r13+0xa0],rbp
 1145d9b:	49 89 ad a8 00 00 00 	mov    QWORD PTR [r13+0xa8],rbp
 1145da2:	49 89 ad e0 00 00 00 	mov    QWORD PTR [r13+0xe0],rbp
 1145da9:	49 89 ad e8 00 00 00 	mov    QWORD PTR [r13+0xe8],rbp
 1145db0:	49 89 ad f0 00 00 00 	mov    QWORD PTR [r13+0xf0],rbp
 1145db7:	49 89 ad f8 00 00 00 	mov    QWORD PTR [r13+0xf8],rbp
 1145dbe:	49 89 ad 00 01 00 00 	mov    QWORD PTR [r13+0x100],rbp
 1145dc5:	49 89 ad 08 01 00 00 	mov    QWORD PTR [r13+0x108],rbp
 1145dcc:	49 89 ad 10 01 00 00 	mov    QWORD PTR [r13+0x110],rbp
 1145dd3:	49 89 ad 18 01 00 00 	mov    QWORD PTR [r13+0x118],rbp
 1145dda:	41 0f 11 85 cc 00 00 	movups XMMWORD PTR [r13+0xcc],xmm0
 1145de1:	00
 1145de2:	41 0f 11 85 c0 00 00 	movups XMMWORD PTR [r13+0xc0],xmm0
 1145de9:	00
 1145dea:	41 0f 11 85 b0 00 00 	movups XMMWORD PTR [r13+0xb0],xmm0
 1145df1:	00
 1145df2:	41 0f 11 85 20 01 00 	movups XMMWORD PTR [r13+0x120],xmm0
 1145df9:	00
 1145dfa:	49 83 a5 30 01 00 00 	and    QWORD PTR [r13+0x130],0x0
 1145e01:	00
 1145e02:	49 83 c4 30          	add    r12,0x30
 1145e06:	4c 89 e7             	mov    rdi,r12
 1145e09:	e8 28 5a 93 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1145e0e:	4c 89 ef             	mov    rdi,r13
 1145e11:	48 89 c6             	mov    rsi,rax
 1145e14:	e8 39 9a 63 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 1145e19:	0f 57 c0             	xorps  xmm0,xmm0
 1145e1c:	84 c0                	test   al,al
 1145e1e:	0f 84 5d 08 00 00    	je     1146681 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30da97>
 1145e24:	0f 11 84 24 68 03 00 	movups XMMWORD PTR [rsp+0x368],xmm0
 1145e2b:	00
 1145e2c:	48 8d 05 35 ee 70 00 	lea    rax,[rip+0x70ee35]        # 1854c68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11350>
 1145e33:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
 1145e3a:	00
 1145e3b:	83 a4 24 78 03 00 00 	and    DWORD PTR [rsp+0x378],0x0
 1145e42:	00
 1145e43:	0f 11 84 24 80 03 00 	movups XMMWORD PTR [rsp+0x380],xmm0
 1145e4a:	00
 1145e4b:	48 83 a4 24 90 03 00 	and    QWORD PTR [rsp+0x390],0x0
 1145e52:	00 00
 1145e54:	48 89 ac 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rbp
 1145e5b:	00
 1145e5c:	48 89 ac 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],rbp
 1145e63:	00
 1145e64:	48 89 ac 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],rbp
 1145e6b:	00
 1145e6c:	48 89 ac 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbp
 1145e73:	00
 1145e74:	48 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rbp
 1145e7b:	00
 1145e7c:	48 89 ac 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rbp
 1145e83:	00
 1145e84:	48 89 ac 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],rbp
 1145e8b:	00
 1145e8c:	48 89 ac 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],rbp
 1145e93:	00
 1145e94:	48 89 ac 24 d8 03 00 	mov    QWORD PTR [rsp+0x3d8],rbp
 1145e9b:	00
 1145e9c:	48 89 ac 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rbp
 1145ea3:	00
 1145ea4:	48 89 ac 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rbp
 1145eab:	00
 1145eac:	48 89 ac 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],rbp
 1145eb3:	00
 1145eb4:	48 89 ac 24 f8 03 00 	mov    QWORD PTR [rsp+0x3f8],rbp
 1145ebb:	00
 1145ebc:	48 89 ac 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rbp
 1145ec3:	00
 1145ec4:	48 89 ac 24 08 04 00 	mov    QWORD PTR [rsp+0x408],rbp
 1145ecb:	00
 1145ecc:	48 89 ac 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rbp
 1145ed3:	00
 1145ed4:	48 89 ac 24 48 04 00 	mov    QWORD PTR [rsp+0x448],rbp
 1145edb:	00
 1145edc:	48 89 ac 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rbp
 1145ee3:	00
 1145ee4:	48 89 ac 24 58 04 00 	mov    QWORD PTR [rsp+0x458],rbp
 1145eeb:	00
 1145eec:	48 89 ac 24 60 04 00 	mov    QWORD PTR [rsp+0x460],rbp
 1145ef3:	00
 1145ef4:	48 89 ac 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rbp
 1145efb:	00
 1145efc:	48 89 ac 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rbp
 1145f03:	00
 1145f04:	48 89 ac 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rbp
 1145f0b:	00
 1145f0c:	0f 11 84 24 2c 04 00 	movups XMMWORD PTR [rsp+0x42c],xmm0
 1145f13:	00
 1145f14:	0f 11 84 24 20 04 00 	movups XMMWORD PTR [rsp+0x420],xmm0
 1145f1b:	00
 1145f1c:	0f 11 84 24 10 04 00 	movups XMMWORD PTR [rsp+0x410],xmm0
 1145f23:	00
 1145f24:	48 83 a4 24 90 04 00 	and    QWORD PTR [rsp+0x490],0x0
 1145f2b:	00 00
 1145f2d:	0f 11 84 24 80 04 00 	movups XMMWORD PTR [rsp+0x480],xmm0
 1145f34:	00
 1145f35:	48 8b 84 24 a0 04 00 	mov    rax,QWORD PTR [rsp+0x4a0]
 1145f3c:	00
 1145f3d:	a8 01                	test   al,0x1
 1145f3f:	0f 85 ce 0a 00 00    	jne    1146a13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30de29>
 1145f45:	48 85 c0             	test   rax,rax
```
### AP `0x181bf48` +0x28 -> `0xc85d5e` score 21

```text
  c85d5e:	55                   	push   rbp
  c85d5f:	41 57                	push   r15
  c85d61:	41 56                	push   r14
  c85d63:	41 55                	push   r13
  c85d65:	41 54                	push   r12
  c85d67:	53                   	push   rbx
  c85d68:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  c85d6f:	49 89 cf             	mov    r15,rcx
  c85d72:	49 89 d4             	mov    r12,rdx
  c85d75:	49 89 f6             	mov    r14,rsi
  c85d78:	48 89 fb             	mov    rbx,rdi
  c85d7b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c85d82:	00 00
  c85d84:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  c85d8b:	00
  c85d8c:	48 83 c6 08          	add    rsi,0x8
  c85d90:	48 89 d7             	mov    rdi,rdx
  c85d93:	e8 56 99 e1 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
  c85d98:	84 c0                	test   al,al
  c85d9a:	0f 84 34 01 00 00    	je     c85ed4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2e74>
  c85da0:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  c85da5:	e8 37 b9 95 00       	call   15e16e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426c65>
  c85daa:	3d 40 44 98 90       	cmp    eax,0x90984440
  c85daf:	0f 84 cd 06 00 00    	je     c86482 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3422>
  c85db5:	3d 01 a1 61 97       	cmp    eax,0x9761a101
  c85dba:	0f 84 84 02 00 00    	je     c86044 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2fe4>
  c85dc0:	3d 4e e3 bf a7       	cmp    eax,0xa7bfe34e
  c85dc5:	0f 84 2b 01 00 00    	je     c85ef6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2e96>
  c85dcb:	3d 15 06 8c ac       	cmp    eax,0xac8c0615
  c85dd0:	0f 84 e1 07 00 00    	je     c865b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3557>
  c85dd6:	3d f5 2e 02 fd       	cmp    eax,0xfd022ef5
  c85ddb:	0f 84 ec 02 00 00    	je     c860cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d306d>
  c85de1:	3d 7d 61 74 79       	cmp    eax,0x7974617d
  c85de6:	0f 84 72 08 00 00    	je     c8665e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d35fe>
  c85dec:	3d 28 b3 dc 0c       	cmp    eax,0xcdcb328
  c85df1:	0f 84 05 05 00 00    	je     c862fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d329c>
  c85df7:	3d 97 bb 51 23       	cmp    eax,0x2351bb97
  c85dfc:	0f 84 0d 07 00 00    	je     c8650f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d34af>
  c85e02:	3d b9 e2 5f 4b       	cmp    eax,0x4b5fe2b9
  c85e07:	0f 84 b5 05 00 00    	je     c863c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3362>
  c85e0d:	3d 5c 63 4b 4e       	cmp    eax,0x4e4b635c
  c85e12:	0f 84 9e 01 00 00    	je     c85fb6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2f56>
  c85e18:	3d 0f d6 9b 68       	cmp    eax,0x689bd60f
  c85e1d:	0f 84 38 04 00 00    	je     c8625b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d31fb>
  c85e23:	3d 2e db aa 73       	cmp    eax,0x73aadb2e
  c85e28:	0f 84 5e 03 00 00    	je     c8618c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d312c>
  c85e2e:	3d 3c 8b 1c 0b       	cmp    eax,0xb1c8b3c
  c85e33:	0f 85 9b 00 00 00    	jne    c85ed4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2e74>
  c85e39:	4c 8d ac 24 08 03 00 	lea    r13,[rsp+0x308]
  c85e40:	00
  c85e41:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
  c85e46:	48 8d 2d 13 67 b9 00 	lea    rbp,[rip+0xb96713]        # 181c560 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12220>
  c85e4d:	49 89 6d 00          	mov    QWORD PTR [r13+0x0],rbp
  c85e51:	49 83 c4 30          	add    r12,0x30
  c85e55:	0f 57 c0             	xorps  xmm0,xmm0
  c85e58:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0
  c85e5d:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
  c85e62:	4c 89 e7             	mov    rdi,r12
  c85e65:	e8 cc 59 df ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c85e6a:	4c 89 ef             	mov    rdi,r13
  c85e6d:	48 89 c6             	mov    rsi,rax
  c85e70:	e8 dd 99 af 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
  c85e75:	84 c0                	test   al,al
  c85e77:	0f 84 c8 08 00 00    	je     c86745 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d36e5>
  c85e7d:	48 83 a4 24 68 03 00 	and    QWORD PTR [rsp+0x368],0x0
  c85e84:	00 00
  c85e86:	48 89 ac 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rbp
  c85e8d:	00
  c85e8e:	0f 57 c0             	xorps  xmm0,xmm0
  c85e91:	0f 11 84 24 70 03 00 	movups XMMWORD PTR [rsp+0x370],xmm0
  c85e98:	00
  c85e99:	0f 11 84 24 80 03 00 	movups XMMWORD PTR [rsp+0x380],xmm0
  c85ea0:	00
  c85ea1:	48 8b 84 24 10 03 00 	mov    rax,QWORD PTR [rsp+0x310]
  c85ea8:	00
  c85ea9:	a8 01                	test   al,0x1
  c85eab:	0f 85 3b 0f 00 00    	jne    c86dec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3d8c>
  c85eb1:	48 85 c0             	test   rax,rax
  c85eb4:	0f 84 64 0b 00 00    	je     c86a1e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d39be>
  c85eba:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
  c85ec1:	00
  c85ec2:	48 8d b4 24 08 03 00 	lea    rsi,[rsp+0x308]
  c85ec9:	00
  c85eca:	e8 91 8b ac 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
  c85ecf:	e9 82 0b 00 00       	jmp    c86a56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d39f6>
  c85ed4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c85edb:	00 00
  c85edd:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  c85ee4:	00
  c85ee5:	0f 85 49 0f 00 00    	jne    c86e34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3dd4>
  c85eeb:	0f 57 c0             	xorps  xmm0,xmm0
  c85eee:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  c85ef1:	e9 b1 0e 00 00       	jmp    c86da7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3d47>
  c85ef6:	0f 57 c0             	xorps  xmm0,xmm0
  c85ef9:	4c 8d ac 24 08 03 00 	lea    r13,[rsp+0x308]
  c85f00:	00
  c85f01:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
  c85f06:	48 8d 05 d3 62 b9 00 	lea    rax,[rip+0xb962d3]        # 181c1e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11ea0>
  c85f0d:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  c85f11:	48 8d 2d e0 98 7b ff 	lea    rbp,[rip+0xffffffffff7b98e0]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
  c85f18:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
  c85f1c:	49 89 6d 20          	mov    QWORD PTR [r13+0x20],rbp
  c85f20:	49 89 6d 28          	mov    QWORD PTR [r13+0x28],rbp
  c85f24:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
  c85f29:	49 83 c4 30          	add    r12,0x30
  c85f2d:	4c 89 e7             	mov    rdi,r12
  c85f30:	e8 01 59 df ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c85f35:	4c 89 ef             	mov    rdi,r13
  c85f38:	48 89 c6             	mov    rsi,rax
  c85f3b:	e8 12 99 af 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
  c85f40:	0f 57 c0             	xorps  xmm0,xmm0
  c85f43:	84 c0                	test   al,al
  c85f45:	0f 84 bc 07 00 00    	je     c86707 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d36a7>
  c85f4b:	0f 11 84 24 90 01 00 	movups XMMWORD PTR [rsp+0x190],xmm0
  c85f52:	00
  c85f53:	48 8d 05 86 62 b9 00 	lea    rax,[rip+0xb96286]        # 181c1e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11ea0>
  c85f5a:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
  c85f61:	00
  c85f62:	48 89 ac 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rbp
  c85f69:	00
  c85f6a:	48 89 ac 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rbp
  c85f71:	00
  c85f72:	48 89 ac 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rbp
  c85f79:	00
  c85f7a:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
  c85f81:	00 00
  c85f83:	48 8b 84 24 10 03 00 	mov    rax,QWORD PTR [rsp+0x310]
  c85f8a:	00
  c85f8b:	a8 01                	test   al,0x1
  c85f8d:	0f 85 29 0e 00 00    	jne    c86dbc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3d5c>
  c85f93:	48 85 c0             	test   rax,rax
  c85f96:	0f 84 cc 07 00 00    	je     c86768 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3708>
  c85f9c:	48 8d bc 24 88 01 00 	lea    rdi,[rsp+0x188]
  c85fa3:	00
  c85fa4:	48 8d b4 24 08 03 00 	lea    rsi,[rsp+0x308]
  c85fab:	00
  c85fac:	e8 af 8a ac 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
  c85fb1:	e9 ea 07 00 00       	jmp    c867a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3740>
  c85fb6:	4c 8d ac 24 08 03 00 	lea    r13,[rsp+0x308]
  c85fbd:	00
  c85fbe:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
  c85fc3:	48 8d 05 d6 64 b9 00 	lea    rax,[rip+0xb964d6]        # 181c4a0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12160>
  c85fca:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  c85fce:	49 83 c4 30          	add    r12,0x30
  c85fd2:	0f 57 c0             	xorps  xmm0,xmm0
  c85fd5:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0
  c85fda:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
  c85fdf:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
  c85fe4:	4c 89 e7             	mov    rdi,r12
  c85fe7:	e8 4a 58 df ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c85fec:	4c 89 ef             	mov    rdi,r13
  c85fef:	48 89 c6             	mov    rsi,rax
  c85ff2:	e8 5b 98 af 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
  c85ff7:	84 c0                	test   al,al
  c85ff9:	0f 84 e8 06 00 00    	je     c866e7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3687>
  c85fff:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  c86006:	00
  c86007:	48 8d b4 24 08 03 00 	lea    rsi,[rsp+0x308]
  c8600e:	00
  c8600f:	e8 b2 0f 00 00       	call   c86fc6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3f66>
```
### AP `0x182d060` +0x28 -> `0xe07ad0` score 21

```text
  e07ad0:	55                   	push   rbp
  e07ad1:	41 57                	push   r15
  e07ad3:	41 56                	push   r14
  e07ad5:	41 55                	push   r13
  e07ad7:	41 54                	push   r12
  e07ad9:	53                   	push   rbx
  e07ada:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e07ae1:	48 89 d3             	mov    rbx,rdx
  e07ae4:	49 89 f7             	mov    r15,rsi
  e07ae7:	49 89 fe             	mov    r14,rdi
  e07aea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e07af1:	00 00
  e07af3:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e07afa:	00
  e07afb:	e8 c7 2d 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
  e07b00:	41 0f b6 4f 03       	movzx  ecx,BYTE PTR [r15+0x3]
  e07b05:	41 0f b6 57 02       	movzx  edx,BYTE PTR [r15+0x2]
  e07b0a:	4c 8d a4 24 60 03 00 	lea    r12,[rsp+0x360]
  e07b11:	00
  e07b12:	6a 10                	push   0x10
  e07b14:	41 58                	pop    r8
  e07b16:	4c 89 e7             	mov    rdi,r12
  e07b19:	4c 89 f6             	mov    rsi,r14
  e07b1c:	e8 fb 38 00 00       	call   e0b41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd84a2>
  e07b21:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e07b27:	74 2a                	je     e07b53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4bd9>
  e07b29:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
  e07b2d:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
  e07b34:	00
  e07b35:	e8 56 62 cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e07b3a:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e07b41:	00
  e07b42:	8b b4 24 88 03 00 00 	mov    esi,DWORD PTR [rsp+0x388]
  e07b49:	e8 98 39 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e07b4e:	e9 65 02 00 00       	jmp    e07db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4e3e>
  e07b53:	4c 8d ac 24 60 03 00 	lea    r13,[rsp+0x360]
  e07b5a:	00
  e07b5b:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
  e07b5f:	31 f6                	xor    esi,esi
  e07b61:	e8 80 39 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e07b66:	4d 8d 67 18          	lea    r12,[r15+0x18]
  e07b6a:	4c 89 e7             	mov    rdi,r12
  e07b6d:	e8 0d 59 05 00       	call   e5d47f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24895>
  e07b72:	4c 89 ef             	mov    rdi,r13
  e07b75:	4c 89 fe             	mov    rsi,r15
  e07b78:	e8 73 84 86 00       	call   166fff0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2415c>
  e07b7d:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e07b81:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
  e07b85:	48 89 e5             	mov    rbp,rsp
  e07b88:	48 89 ef             	mov    rdi,rbp
  e07b8b:	e8 75 2e 00 00       	call   e0aa05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a8b>
  e07b90:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e07b94:	e8 c7 6b 9e 00       	call   17ee760 <free@plt>
  e07b99:	49 8b be f0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1f0]
  e07ba0:	48 89 ee             	mov    rsi,rbp
  e07ba3:	e8 70 2e 00 00       	call   e0aa18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a9e>
  e07ba8:	84 c0                	test   al,al
  e07baa:	0f 84 93 00 00 00    	je     e07c43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4cc9>
  e07bb0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e07bb5:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  e07bba:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  e07bbe:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  e07bc3:	0f 57 c0             	xorps  xmm0,xmm0
  e07bc6:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  e07bca:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  e07bd0:	49 8d 76 10          	lea    rsi,[r14+0x10]
  e07bd4:	4c 8d bc 24 f0 02 00 	lea    r15,[rsp+0x2f0]
  e07bdb:	00
  e07bdc:	4c 89 ff             	mov    rdi,r15
  e07bdf:	48 89 da             	mov    rdx,rbx
  e07be2:	e8 4a 2e 00 00       	call   e0aa31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ab7>
  e07be7:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
  e07bee:	00
  e07bef:	4c 89 fe             	mov    rsi,r15
  e07bf2:	e8 55 2e 00 00       	call   e0aa4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ad2>
  e07bf7:	49 81 c6 d0 01 00 00 	add    r14,0x1d0
  e07bfe:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
  e07c03:	4c 8d bc 24 30 03 00 	lea    r15,[rsp+0x330]
  e07c0a:	00
  e07c0b:	4c 89 f7             	mov    rdi,r14
  e07c0e:	48 89 de             	mov    rsi,rbx
  e07c11:	4c 89 fa             	mov    rdx,r15
  e07c14:	e8 ef 2e 00 00       	call   e0ab08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7b8e>
  e07c19:	4c 89 ff             	mov    rdi,r15
  e07c1c:	e8 49 23 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07c21:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  e07c28:	00
  e07c29:	e8 3c 23 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07c2e:	48 89 df             	mov    rdi,rbx
  e07c31:	e8 5a 62 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07c36:	48 89 e7             	mov    rdi,rsp
  e07c39:	e8 52 62 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07c3e:	e9 75 01 00 00       	jmp    e07db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4e3e>
  e07c43:	48 89 e7             	mov    rdi,rsp
  e07c46:	e8 45 62 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07c4b:	41 8a 86 e8 02 00 00 	mov    al,BYTE PTR [r14+0x2e8]
  e07c52:	a8 01                	test   al,0x1
  e07c54:	0f 85 df 00 00 00    	jne    e07d39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4dbf>
  e07c5a:	4d 8d ae d8 13 00 00 	lea    r13,[r14+0x13d8]
  e07c61:	e8 e0 2f 9d 00       	call   17dac46 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a67>
  e07c66:	4c 89 ef             	mov    rdi,r13
  e07c69:	48 89 c6             	mov    rsi,rax
  e07c6c:	e8 e1 fc 9c 00       	call   17d7952 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3773>
  e07c71:	84 c0                	test   al,al
  e07c73:	0f 84 f8 00 00 00    	je     e07d71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4df7>
  e07c79:	49 8b be 50 03 00 00 	mov    rdi,QWORD PTR [r14+0x350]
  e07c80:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e07c83:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e07c89:	49 8d 7f 68          	lea    rdi,[r15+0x68]
  e07c8d:	48 89 c6             	mov    rsi,rax
  e07c90:	e8 eb 63 9e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  e07c95:	49 89 e5             	mov    r13,rsp
  e07c98:	4c 89 ef             	mov    rdi,r13
  e07c9b:	4c 89 fe             	mov    rsi,r15
  e07c9e:	e8 4d 83 86 00       	call   166fff0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2415c>
  e07ca3:	4d 8b be 50 03 00 00 	mov    r15,QWORD PTR [r14+0x350]
  e07caa:	48 8d 6c 24 38       	lea    rbp,[rsp+0x38]
  e07caf:	48 89 ef             	mov    rdi,rbp
  e07cb2:	4c 89 e6             	mov    rsi,r12
  e07cb5:	e8 c4 41 86 00       	call   166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
  e07cba:	48 8d 35 df 4a 55 ff 	lea    rsi,[rip+0xffffffffff554adf]        # 35c7a0 <_ZTSSt12bad_any_cast@@Base-0x33a28>
  e07cc1:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e07cc8:	00
  e07cc9:	48 89 ea             	mov    rdx,rbp
  e07ccc:	e8 89 57 05 00       	call   e5d45a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24870>
  e07cd1:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
  e07cd5:	4d 8b 6d 08          	mov    r13,QWORD PTR [r13+0x8]
  e07cd9:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
  e07ce0:	00
  e07ce1:	4c 89 f6             	mov    rsi,r14
  e07ce4:	48 89 da             	mov    rdx,rbx
  e07ce7:	e8 c2 2e 00 00       	call   e0abae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7c34>
  e07cec:	4d 29 e5             	sub    r13,r12
  e07cef:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e07cf2:	48 8d 9c 24 d8 00 00 	lea    rbx,[rsp+0xd8]
  e07cf9:	00
  e07cfa:	4c 8d b4 24 60 03 00 	lea    r14,[rsp+0x360]
  e07d01:	00
  e07d02:	4c 89 ff             	mov    rdi,r15
  e07d05:	48 89 de             	mov    rsi,rbx
  e07d08:	4c 89 e2             	mov    rdx,r12
  e07d0b:	4c 89 e9             	mov    rcx,r13
  e07d0e:	4d 89 f0             	mov    r8,r14
  e07d11:	ff 50 48             	call   QWORD PTR [rax+0x48]
  e07d14:	4c 89 f7             	mov    rdi,r14
  e07d17:	e8 4e 22 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07d1c:	48 89 df             	mov    rdi,rbx
  e07d1f:	e8 92 d0 fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e07d24:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e07d29:	e8 aa 42 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e07d2e:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e07d32:	e8 29 6a 9e 00       	call   17ee760 <free@plt>
  e07d37:	eb 7f                	jmp    e07db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4e3e>
  e07d39:	4d 8b b6 40 03 00 00 	mov    r14,QWORD PTR [r14+0x340]
  e07d40:	4c 8d a4 24 38 02 00 	lea    r12,[rsp+0x238]
  e07d47:	00
  e07d48:	4c 89 e7             	mov    rdi,r12
  e07d4b:	4c 89 fe             	mov    rsi,r15
  e07d4e:	e8 ef fc 85 00       	call   1667a42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbae>
  e07d53:	49 8b 06             	mov    rax,QWORD PTR [r14]
```
### AP `0x182d068` +0x28 -> `0xe07e86` score 21

```text
  e07e86:	55                   	push   rbp
  e07e87:	41 57                	push   r15
  e07e89:	41 56                	push   r14
  e07e8b:	41 55                	push   r13
  e07e8d:	41 54                	push   r12
  e07e8f:	53                   	push   rbx
  e07e90:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e07e97:	49 89 d6             	mov    r14,rdx
  e07e9a:	49 89 f7             	mov    r15,rsi
  e07e9d:	48 89 fb             	mov    rbx,rdi
  e07ea0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e07ea7:	00 00
  e07ea9:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e07eb0:	00
  e07eb1:	e8 11 2a 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
  e07eb6:	41 0f b6 4f 03       	movzx  ecx,BYTE PTR [r15+0x3]
  e07ebb:	41 0f b6 57 02       	movzx  edx,BYTE PTR [r15+0x2]
  e07ec0:	4c 8d a4 24 60 03 00 	lea    r12,[rsp+0x360]
  e07ec7:	00
  e07ec8:	6a 0d                	push   0xd
  e07eca:	41 58                	pop    r8
  e07ecc:	4c 89 e7             	mov    rdi,r12
  e07ecf:	48 89 de             	mov    rsi,rbx
  e07ed2:	e8 45 35 00 00       	call   e0b41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd84a2>
  e07ed7:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e07edd:	74 2a                	je     e07f09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4f8f>
  e07edf:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  e07ee3:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
  e07eea:	00
  e07eeb:	e8 a0 5e cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e07ef0:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e07ef7:	00
  e07ef8:	8b b4 24 88 03 00 00 	mov    esi,DWORD PTR [rsp+0x388]
  e07eff:	e8 e2 35 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e07f04:	e9 fc 01 00 00       	jmp    e08105 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd518b>
  e07f09:	4c 8d ac 24 60 03 00 	lea    r13,[rsp+0x360]
  e07f10:	00
  e07f11:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
  e07f15:	31 f6                	xor    esi,esi
  e07f17:	e8 ca 35 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e07f1c:	4d 8d 67 18          	lea    r12,[r15+0x18]
  e07f20:	4c 89 e7             	mov    rdi,r12
  e07f23:	e8 57 55 05 00       	call   e5d47f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24895>
  e07f28:	4c 89 ef             	mov    rdi,r13
  e07f2b:	4c 89 fe             	mov    rsi,r15
  e07f2e:	e8 c3 81 86 00       	call   16700f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24262>
  e07f33:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e07f37:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
  e07f3b:	48 89 e5             	mov    rbp,rsp
  e07f3e:	48 89 ef             	mov    rdi,rbp
  e07f41:	e8 bf 2a 00 00       	call   e0aa05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a8b>
  e07f46:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e07f4a:	e8 11 68 9e 00       	call   17ee760 <free@plt>
  e07f4f:	48 8b bb f0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1f0]
  e07f56:	48 89 ee             	mov    rsi,rbp
  e07f59:	e8 ba 2a 00 00       	call   e0aa18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a9e>
  e07f5e:	84 c0                	test   al,al
  e07f60:	0f 84 93 00 00 00    	je     e07ff9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd507f>
  e07f66:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e07f6b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  e07f70:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  e07f74:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  e07f79:	0f 57 c0             	xorps  xmm0,xmm0
  e07f7c:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  e07f80:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  e07f86:	48 8d 73 10          	lea    rsi,[rbx+0x10]
  e07f8a:	4c 8d bc 24 f0 02 00 	lea    r15,[rsp+0x2f0]
  e07f91:	00
  e07f92:	4c 89 ff             	mov    rdi,r15
  e07f95:	4c 89 f2             	mov    rdx,r14
  e07f98:	e8 94 2a 00 00       	call   e0aa31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ab7>
  e07f9d:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
  e07fa4:	00
  e07fa5:	4c 89 fe             	mov    rsi,r15
  e07fa8:	e8 9f 2a 00 00       	call   e0aa4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ad2>
  e07fad:	48 81 c3 d0 01 00 00 	add    rbx,0x1d0
  e07fb4:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  e07fb9:	4c 8d bc 24 30 03 00 	lea    r15,[rsp+0x330]
  e07fc0:	00
  e07fc1:	48 89 df             	mov    rdi,rbx
  e07fc4:	4c 89 f6             	mov    rsi,r14
  e07fc7:	4c 89 fa             	mov    rdx,r15
  e07fca:	e8 39 2b 00 00       	call   e0ab08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7b8e>
  e07fcf:	4c 89 ff             	mov    rdi,r15
  e07fd2:	e8 93 1f c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07fd7:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  e07fde:	00
  e07fdf:	e8 86 1f c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07fe4:	4c 89 f7             	mov    rdi,r14
  e07fe7:	e8 a4 5e 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07fec:	48 89 e7             	mov    rdi,rsp
  e07fef:	e8 9c 5e 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07ff4:	e9 0c 01 00 00       	jmp    e08105 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd518b>
  e07ff9:	48 89 e7             	mov    rdi,rsp
  e07ffc:	e8 8f 5e 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e08001:	8a 83 e8 02 00 00    	mov    al,BYTE PTR [rbx+0x2e8]
  e08007:	a8 01                	test   al,0x1
  e08009:	0f 85 c0 00 00 00    	jne    e080cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5155>
  e0800f:	48 8b bb 50 03 00 00 	mov    rdi,QWORD PTR [rbx+0x350]
  e08016:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e08019:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e0801f:	49 8d 7f 68          	lea    rdi,[r15+0x68]
  e08023:	48 89 c6             	mov    rsi,rax
  e08026:	e8 55 60 9e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  e0802b:	49 89 e5             	mov    r13,rsp
  e0802e:	4c 89 ef             	mov    rdi,r13
  e08031:	4c 89 fe             	mov    rsi,r15
  e08034:	e8 bd 80 86 00       	call   16700f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24262>
  e08039:	4c 8b bb 50 03 00 00 	mov    r15,QWORD PTR [rbx+0x350]
  e08040:	48 8d 6c 24 38       	lea    rbp,[rsp+0x38]
  e08045:	48 89 ef             	mov    rdi,rbp
  e08048:	4c 89 e6             	mov    rsi,r12
  e0804b:	e8 2e 3e 86 00       	call   166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
  e08050:	48 8d 35 1c 4c 54 ff 	lea    rsi,[rip+0xffffffffff544c1c]        # 34cc73 <_ZTSSt12bad_any_cast@@Base-0x43555>
  e08057:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e0805e:	00
  e0805f:	48 89 ea             	mov    rdx,rbp
  e08062:	e8 f3 53 05 00       	call   e5d45a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24870>
  e08067:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
  e0806b:	4d 8b 6d 08          	mov    r13,QWORD PTR [r13+0x8]
  e0806f:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
  e08076:	00
  e08077:	48 89 de             	mov    rsi,rbx
  e0807a:	4c 89 f2             	mov    rdx,r14
  e0807d:	e8 2c 2b 00 00       	call   e0abae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7c34>
  e08082:	4d 29 e5             	sub    r13,r12
  e08085:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e08088:	48 8d 9c 24 d8 00 00 	lea    rbx,[rsp+0xd8]
  e0808f:	00
  e08090:	4c 8d b4 24 60 03 00 	lea    r14,[rsp+0x360]
  e08097:	00
  e08098:	4c 89 ff             	mov    rdi,r15
  e0809b:	48 89 de             	mov    rsi,rbx
  e0809e:	4c 89 e2             	mov    rdx,r12
  e080a1:	4c 89 e9             	mov    rcx,r13
  e080a4:	4d 89 f0             	mov    r8,r14
  e080a7:	ff 50 48             	call   QWORD PTR [rax+0x48]
  e080aa:	4c 89 f7             	mov    rdi,r14
  e080ad:	e8 b8 1e c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e080b2:	48 89 df             	mov    rdi,rbx
  e080b5:	e8 fc cc fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e080ba:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e080bf:	e8 14 3f 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e080c4:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e080c8:	e8 93 66 9e 00       	call   17ee760 <free@plt>
  e080cd:	eb 36                	jmp    e08105 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd518b>
  e080cf:	48 8b 9b 40 03 00 00 	mov    rbx,QWORD PTR [rbx+0x340]
  e080d6:	4c 8d a4 24 38 02 00 	lea    r12,[rsp+0x238]
  e080dd:	00
  e080de:	4c 89 e7             	mov    rdi,r12
  e080e1:	4c 89 fe             	mov    rsi,r15
  e080e4:	e8 59 f9 85 00       	call   1667a42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbae>
  e080e9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e080ec:	48 89 df             	mov    rdi,rbx
  e080ef:	4c 89 e6             	mov    rsi,r12
  e080f2:	4c 89 f2             	mov    rdx,r14
  e080f5:	ff 50 70             	call   QWORD PTR [rax+0x70]
  e080f8:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  e080ff:	00
  e08100:	e8 d3 3e 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
```
### AP `0x182d070` +0x28 -> `0xe081c0` score 21

```text
  e081c0:	55                   	push   rbp
  e081c1:	41 57                	push   r15
  e081c3:	41 56                	push   r14
  e081c5:	41 55                	push   r13
  e081c7:	41 54                	push   r12
  e081c9:	53                   	push   rbx
  e081ca:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e081d1:	49 89 d6             	mov    r14,rdx
  e081d4:	49 89 f7             	mov    r15,rsi
  e081d7:	48 89 fb             	mov    rbx,rdi
  e081da:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e081e1:	00 00
  e081e3:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e081ea:	00
  e081eb:	e8 d7 26 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
  e081f0:	41 0f b6 4f 03       	movzx  ecx,BYTE PTR [r15+0x3]
  e081f5:	41 0f b6 57 02       	movzx  edx,BYTE PTR [r15+0x2]
  e081fa:	4c 8d a4 24 60 03 00 	lea    r12,[rsp+0x360]
  e08201:	00
  e08202:	6a 0e                	push   0xe
  e08204:	41 58                	pop    r8
  e08206:	4c 89 e7             	mov    rdi,r12
  e08209:	48 89 de             	mov    rsi,rbx
  e0820c:	e8 0b 32 00 00       	call   e0b41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd84a2>
  e08211:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e08217:	74 2a                	je     e08243 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd52c9>
  e08219:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  e0821d:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
  e08224:	00
  e08225:	e8 66 5b cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e0822a:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e08231:	00
  e08232:	8b b4 24 88 03 00 00 	mov    esi,DWORD PTR [rsp+0x388]
  e08239:	e8 a8 32 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e0823e:	e9 fc 01 00 00       	jmp    e0843f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd54c5>
  e08243:	4c 8d ac 24 60 03 00 	lea    r13,[rsp+0x360]
  e0824a:	00
  e0824b:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
  e0824f:	31 f6                	xor    esi,esi
  e08251:	e8 90 32 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e08256:	4d 8d 67 18          	lea    r12,[r15+0x18]
  e0825a:	4c 89 e7             	mov    rdi,r12
  e0825d:	e8 1d 52 05 00       	call   e5d47f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24895>
  e08262:	4c 89 ef             	mov    rdi,r13
  e08265:	4c 89 fe             	mov    rsi,r15
  e08268:	e8 8f 7f 86 00       	call   16701fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24368>
  e0826d:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e08271:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
  e08275:	48 89 e5             	mov    rbp,rsp
  e08278:	48 89 ef             	mov    rdi,rbp
  e0827b:	e8 85 27 00 00       	call   e0aa05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a8b>
  e08280:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e08284:	e8 d7 64 9e 00       	call   17ee760 <free@plt>
  e08289:	48 8b bb f0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1f0]
  e08290:	48 89 ee             	mov    rsi,rbp
  e08293:	e8 80 27 00 00       	call   e0aa18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a9e>
  e08298:	84 c0                	test   al,al
  e0829a:	0f 84 93 00 00 00    	je     e08333 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd53b9>
  e082a0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e082a5:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  e082aa:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  e082ae:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  e082b3:	0f 57 c0             	xorps  xmm0,xmm0
  e082b6:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  e082ba:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  e082c0:	48 8d 73 10          	lea    rsi,[rbx+0x10]
  e082c4:	4c 8d bc 24 f0 02 00 	lea    r15,[rsp+0x2f0]
  e082cb:	00
  e082cc:	4c 89 ff             	mov    rdi,r15
  e082cf:	4c 89 f2             	mov    rdx,r14
  e082d2:	e8 5a 27 00 00       	call   e0aa31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ab7>
  e082d7:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
  e082de:	00
  e082df:	4c 89 fe             	mov    rsi,r15
  e082e2:	e8 65 27 00 00       	call   e0aa4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ad2>
  e082e7:	48 81 c3 d0 01 00 00 	add    rbx,0x1d0
  e082ee:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  e082f3:	4c 8d bc 24 30 03 00 	lea    r15,[rsp+0x330]
  e082fa:	00
  e082fb:	48 89 df             	mov    rdi,rbx
  e082fe:	4c 89 f6             	mov    rsi,r14
  e08301:	4c 89 fa             	mov    rdx,r15
  e08304:	e8 ff 27 00 00       	call   e0ab08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7b8e>
  e08309:	4c 89 ff             	mov    rdi,r15
  e0830c:	e8 59 1c c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e08311:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  e08318:	00
  e08319:	e8 4c 1c c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e0831e:	4c 89 f7             	mov    rdi,r14
  e08321:	e8 6a 5b 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e08326:	48 89 e7             	mov    rdi,rsp
  e08329:	e8 62 5b 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e0832e:	e9 0c 01 00 00       	jmp    e0843f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd54c5>
  e08333:	48 89 e7             	mov    rdi,rsp
  e08336:	e8 55 5b 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e0833b:	8a 83 e8 02 00 00    	mov    al,BYTE PTR [rbx+0x2e8]
  e08341:	a8 01                	test   al,0x1
  e08343:	0f 85 c0 00 00 00    	jne    e08409 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd548f>
  e08349:	48 8b bb 50 03 00 00 	mov    rdi,QWORD PTR [rbx+0x350]
  e08350:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e08353:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e08359:	49 8d 7f 68          	lea    rdi,[r15+0x68]
  e0835d:	48 89 c6             	mov    rsi,rax
  e08360:	e8 1b 5d 9e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  e08365:	49 89 e5             	mov    r13,rsp
  e08368:	4c 89 ef             	mov    rdi,r13
  e0836b:	4c 89 fe             	mov    rsi,r15
  e0836e:	e8 89 7e 86 00       	call   16701fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24368>
  e08373:	4c 8b bb 50 03 00 00 	mov    r15,QWORD PTR [rbx+0x350]
  e0837a:	48 8d 6c 24 38       	lea    rbp,[rsp+0x38]
  e0837f:	48 89 ef             	mov    rdi,rbp
  e08382:	4c 89 e6             	mov    rsi,r12
  e08385:	e8 f4 3a 86 00       	call   166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
  e0838a:	48 8d 35 af 1c 56 ff 	lea    rsi,[rip+0xffffffffff561caf]        # 36a040 <_ZTSSt12bad_any_cast@@Base-0x26188>
  e08391:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e08398:	00
  e08399:	48 89 ea             	mov    rdx,rbp
  e0839c:	e8 b9 50 05 00       	call   e5d45a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24870>
  e083a1:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
  e083a5:	4d 8b 6d 08          	mov    r13,QWORD PTR [r13+0x8]
  e083a9:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
  e083b0:	00
  e083b1:	48 89 de             	mov    rsi,rbx
  e083b4:	4c 89 f2             	mov    rdx,r14
  e083b7:	e8 f2 27 00 00       	call   e0abae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7c34>
  e083bc:	4d 29 e5             	sub    r13,r12
  e083bf:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e083c2:	48 8d 9c 24 d8 00 00 	lea    rbx,[rsp+0xd8]
  e083c9:	00
  e083ca:	4c 8d b4 24 60 03 00 	lea    r14,[rsp+0x360]
  e083d1:	00
  e083d2:	4c 89 ff             	mov    rdi,r15
  e083d5:	48 89 de             	mov    rsi,rbx
  e083d8:	4c 89 e2             	mov    rdx,r12
  e083db:	4c 89 e9             	mov    rcx,r13
  e083de:	4d 89 f0             	mov    r8,r14
  e083e1:	ff 50 48             	call   QWORD PTR [rax+0x48]
  e083e4:	4c 89 f7             	mov    rdi,r14
  e083e7:	e8 7e 1b c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e083ec:	48 89 df             	mov    rdi,rbx
  e083ef:	e8 c2 c9 fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e083f4:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e083f9:	e8 da 3b 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e083fe:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e08402:	e8 59 63 9e 00       	call   17ee760 <free@plt>
  e08407:	eb 36                	jmp    e0843f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd54c5>
  e08409:	48 8b 9b 40 03 00 00 	mov    rbx,QWORD PTR [rbx+0x340]
  e08410:	4c 8d a4 24 38 02 00 	lea    r12,[rsp+0x238]
  e08417:	00
  e08418:	4c 89 e7             	mov    rdi,r12
  e0841b:	4c 89 fe             	mov    rsi,r15
  e0841e:	e8 1f f6 85 00       	call   1667a42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbae>
  e08423:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e08426:	48 89 df             	mov    rdi,rbx
  e08429:	4c 89 e6             	mov    rsi,r12
  e0842c:	4c 89 f2             	mov    rdx,r14
  e0842f:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e08432:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  e08439:	00
  e0843a:	e8 99 3b 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
```
### AP `0x185ac20` +0x28 -> `0x11d2d28` score 21

```text
 11d2d28:	55                   	push   rbp
 11d2d29:	41 57                	push   r15
 11d2d2b:	41 56                	push   r14
 11d2d2d:	41 55                	push   r13
 11d2d2f:	41 54                	push   r12
 11d2d31:	53                   	push   rbx
 11d2d32:	48 81 ec b8 01 00 00 	sub    rsp,0x1b8
 11d2d39:	49 89 f7             	mov    r15,rsi
 11d2d3c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11d2d43:	00 00
 11d2d45:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
 11d2d4c:	00
 11d2d4d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11d2d50:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 11d2d53:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
 11d2d57:	48 83 c6 10          	add    rsi,0x10
 11d2d5b:	48 8b 40 48          	mov    rax,QWORD PTR [rax+0x48]
 11d2d5f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 11d2d64:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
 11d2d6b:	00
 11d2d6c:	e8 1f 75 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11d2d71:	41 8b 47 18          	mov    eax,DWORD PTR [r15+0x18]
 11d2d75:	b9 ff ff ff ff       	mov    ecx,0xffffffff
 11d2d7a:	48 39 c8             	cmp    rax,rcx
 11d2d7d:	0f 84 7d 06 00 00    	je     11d3400 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18984>
 11d2d83:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 11d2d88:	48 8b 99 80 03 00 00 	mov    rbx,QWORD PTR [rcx+0x380]
 11d2d8f:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
 11d2d94:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
 11d2d9b:	00
 11d2d9c:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 11d2d9f:	48 8d 0d ea 7f 68 00 	lea    rcx,[rip+0x687fea]        # 185ad90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17478>
 11d2da6:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
 11d2dad:	00
 11d2dae:	4c 89 fa             	mov    rdx,r15
 11d2db1:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
 11d2db4:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11d2db9:	0f 10 80 08 03 00 00 	movups xmm0,XMMWORD PTR [rax+0x308]
 11d2dc0:	0f 29 84 24 40 01 00 	movaps XMMWORD PTR [rsp+0x140],xmm0
 11d2dc7:	00
 11d2dc8:	c6 84 24 50 01 00 00 	mov    BYTE PTR [rsp+0x150],0x1
 11d2dcf:	01
 11d2dd0:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 11d2dd7:	00
 11d2dd8:	48 8d b4 24 80 01 00 	lea    rsi,[rsp+0x180]
 11d2ddf:	00
 11d2de0:	e8 ab 74 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11d2de5:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
 11d2dec:	00
 11d2ded:	4c 89 f7             	mov    rdi,r14
 11d2df0:	4c 89 fe             	mov    rsi,r15
 11d2df3:	e8 d4 16 00 00       	call   11d44cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a50>
 11d2df8:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 11d2dff:	00 00
 11d2e01:	48 83 a4 24 30 01 00 	and    QWORD PTR [rsp+0x130],0x0
 11d2e08:	00 00
 11d2e0a:	6a 50                	push   0x50
 11d2e0c:	5f                   	pop    rdi
 11d2e0d:	e8 ee b0 61 00       	call   17edf00 <_Znwm@plt>
 11d2e12:	49 89 c4             	mov    r12,rax
 11d2e15:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
 11d2e1c:	00
 11d2e1d:	48 89 c7             	mov    rdi,rax
 11d2e20:	e8 6b 74 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11d2e25:	4c 89 e7             	mov    rdi,r12
 11d2e28:	48 83 c7 30          	add    rdi,0x30
 11d2e2c:	4c 89 f6             	mov    rsi,r14
 11d2e2f:	e8 02 d4 ff ff       	call   11d0236 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x157ba>
 11d2e34:	4c 89 a4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r12
 11d2e3b:	00
 11d2e3c:	48 8d 05 1b 17 00 00 	lea    rax,[rip+0x171b]        # 11d455e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ae2>
 11d2e43:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
 11d2e4a:	00
 11d2e4b:	48 8d 05 36 17 00 00 	lea    rax,[rip+0x1736]        # 11d4588 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b0c>
 11d2e52:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
 11d2e59:	00
 11d2e5a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 11d2e5f:	48 8d b4 24 80 01 00 	lea    rsi,[rsp+0x180]
 11d2e66:	00
 11d2e67:	e8 24 74 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11d2e6c:	4c 8d b4 24 90 00 00 	lea    r14,[rsp+0x90]
 11d2e73:	00
 11d2e74:	4c 89 f7             	mov    rdi,r14
 11d2e77:	4c 89 fe             	mov    rsi,r15
 11d2e7a:	e8 4d 16 00 00       	call   11d44cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a50>
 11d2e7f:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
 11d2e86:	00 00
 11d2e88:	48 83 a4 24 c0 00 00 	and    QWORD PTR [rsp+0xc0],0x0
 11d2e8f:	00 00
 11d2e91:	6a 50                	push   0x50
 11d2e93:	5f                   	pop    rdi
 11d2e94:	e8 67 b0 61 00       	call   17edf00 <_Znwm@plt>
 11d2e99:	49 89 c4             	mov    r12,rax
 11d2e9c:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
 11d2ea1:	48 89 c7             	mov    rdi,rax
 11d2ea4:	e8 e7 73 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11d2ea9:	4c 89 e7             	mov    rdi,r12
 11d2eac:	48 83 c7 30          	add    rdi,0x30
 11d2eb0:	4c 89 f6             	mov    rsi,r14
 11d2eb3:	e8 7e d3 ff ff       	call   11d0236 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x157ba>
 11d2eb8:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
 11d2ebf:	00
 11d2ec0:	4d 89 21             	mov    QWORD PTR [r9],r12
 11d2ec3:	48 8d 05 94 16 00 00 	lea    rax,[rip+0x1694]        # 11d455e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ae2>
 11d2eca:	49 89 41 10          	mov    QWORD PTR [r9+0x10],rax
 11d2ece:	48 8d 05 5f 17 00 00 	lea    rax,[rip+0x175f]        # 11d4634 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bb8>
 11d2ed5:	49 89 41 18          	mov    QWORD PTR [r9+0x18],rax
 11d2ed9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11d2edc:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
 11d2ee0:	8a 8c 24 50 01 00 00 	mov    cl,BYTE PTR [rsp+0x150]
 11d2ee7:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl
 11d2eeb:	0f 28 84 24 40 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x140]
 11d2ef2:	00
 11d2ef3:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 11d2ef7:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 11d2efc:	48 8d 94 24 58 01 00 	lea    rdx,[rsp+0x158]
 11d2f03:	00
 11d2f04:	4c 8d 84 24 20 01 00 	lea    r8,[rsp+0x120]
 11d2f0b:	00
 11d2f0c:	48 89 de             	mov    rsi,rbx
 11d2f0f:	31 c9                	xor    ecx,ecx
 11d2f11:	ff d0                	call   rax
 11d2f13:	4c 89 ff             	mov    rdi,r15
 11d2f16:	e8 b9 17 00 00       	call   11d46d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c58>
 11d2f1b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 11d2f20:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11d2f25:	48 8d 98 90 03 00 00 	lea    rbx,[rax+0x390]
 11d2f2c:	48 8b a8 98 03 00 00 	mov    rbp,QWORD PTR [rax+0x398]
 11d2f33:	48 85 ed             	test   rbp,rbp
 11d2f36:	74 16                	je     11d2f4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184d2>
 11d2f38:	f3 4c 0f b8 f5       	popcnt r14,rbp
 11d2f3d:	49 83 fe 01          	cmp    r14,0x1
 11d2f41:	77 0d                	ja     11d2f50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184d4>
 11d2f43:	4c 8d 65 ff          	lea    r12,[rbp-0x1]
 11d2f47:	4c 23 64 24 28       	and    r12,QWORD PTR [rsp+0x28]
 11d2f4c:	eb 1c                	jmp    11d2f6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184ee>
 11d2f4e:	eb 7f                	jmp    11d2fcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18553>
 11d2f50:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 11d2f55:	49 89 c4             	mov    r12,rax
 11d2f58:	48 39 e8             	cmp    rax,rbp
 11d2f5b:	72 0d                	jb     11d2f6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184ee>
 11d2f5d:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 11d2f62:	31 d2                	xor    edx,edx
 11d2f64:	48 f7 f5             	div    rbp
 11d2f67:	49 89 d4             	mov    r12,rdx
 11d2f6a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11d2f6d:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
 11d2f71:	48 85 c0             	test   rax,rax
 11d2f74:	74 59                	je     11d2fcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18553>
 11d2f76:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 11d2f79:	4d 85 ed             	test   r13,r13
 11d2f7c:	74 51                	je     11d2fcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18553>
 11d2f7e:	48 8d 45 ff          	lea    rax,[rbp-0x1]
 11d2f82:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 11d2f87:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 11d2f8b:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
 11d2f90:	75 15                	jne    11d2fa7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1852b>
 11d2f92:	49 8d 7d 10          	lea    rdi,[r13+0x10]
 11d2f96:	4c 89 fe             	mov    rsi,r15
 11d2f99:	e8 a7 17 00 00       	call   11d4745 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cc9>
```
### AP `0x18b08d0` +0x28 -> `0xa7e734` score 21

```text
  a7e734:	53                   	push   rbx
  a7e735:	48 8d 1d 6c 67 f6 00 	lea    rbx,[rip+0xf6676c]        # 19e4ea8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x18d8>
  a7e73c:	48 8d 35 fc e5 94 ff 	lea    rsi,[rip+0xffffffffff94e5fc]        # 3ccd3f <_ZTSN5boost9exceptionE@@Base+0x2d721>
  a7e743:	48 8d 0d fb e5 94 ff 	lea    rcx,[rip+0xffffffffff94e5fb]        # 3ccd45 <_ZTSN5boost9exceptionE@@Base+0x2d727>
  a7e74a:	6a 05                	push   0x5
  a7e74c:	5a                   	pop    rdx
  a7e74d:	6a 02                	push   0x2
  a7e74f:	41 59                	pop    r9
  a7e751:	48 89 df             	mov    rdi,rbx
  a7e754:	49 89 d0             	mov    r8,rdx
  a7e757:	e8 46 b3 0d 00       	call   b59aa2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6a42>
  a7e75c:	48 8d 3d 25 4d c0 00 	lea    rdi,[rip+0xc04d25]        # 1683488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375f4>
  a7e763:	48 8d 15 96 58 d7 00 	lea    rdx,[rip+0xd75896]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a7e76a:	48 89 de             	mov    rsi,rbx
  a7e76d:	5b                   	pop    rbx
  a7e76e:	e9 ed f6 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a7e773:	55                   	push   rbp
  a7e774:	41 57                	push   r15
  a7e776:	41 56                	push   r14
  a7e778:	41 55                	push   r13
  a7e77a:	41 54                	push   r12
  a7e77c:	53                   	push   rbx
  a7e77d:	48 81 ec 98 04 00 00 	sub    rsp,0x498
  a7e784:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7e78b:	00 00
  a7e78d:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
  a7e794:	00
  a7e795:	48 8d 35 38 da 8d ff 	lea    rsi,[rip+0xffffffffff8dda38]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e79c:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  a7e7a3:	00
  a7e7a4:	e8 d5 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e7a9:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
  a7e7b0:	00
  a7e7b1:	48 8d 35 cc a3 8d ff 	lea    rsi,[rip+0xffffffffff8da3cc]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e7b8:	e8 c1 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e7bd:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  a7e7c4:	00
  a7e7c5:	48 8d b4 24 00 03 00 	lea    rsi,[rsp+0x300]
  a7e7cc:	00
  a7e7cd:	6a 02                	push   0x2
  a7e7cf:	5a                   	pop    rdx
  a7e7d0:	e8 83 8c 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e7d5:	48 8d bc 24 38 03 00 	lea    rdi,[rsp+0x338]
  a7e7dc:	00
  a7e7dd:	66 c7 47 f8 08 00    	mov    WORD PTR [rdi-0x8],0x8
  a7e7e3:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
  a7e7ea:	00
  a7e7eb:	e8 08 8d 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e7f0:	48 8d 9c 24 50 03 00 	lea    rbx,[rsp+0x350]
  a7e7f7:	00
  a7e7f8:	48 8d 35 d5 d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd9d5]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e7ff:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
  a7e806:	00
  a7e807:	e8 72 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e80c:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
  a7e813:	00
  a7e814:	48 8d 35 69 a3 8d ff 	lea    rsi,[rip+0xffffffffff8da369]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e81b:	e8 5e b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e820:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  a7e827:	00
  a7e828:	48 8d b4 24 d0 02 00 	lea    rsi,[rsp+0x2d0]
  a7e82f:	00
  a7e830:	6a 02                	push   0x2
  a7e832:	5a                   	pop    rdx
  a7e833:	e8 20 8c 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e838:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
  a7e83f:	00
  a7e840:	66 c7 47 f8 09 00    	mov    WORD PTR [rdi-0x8],0x9
  a7e846:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  a7e84d:	00
  a7e84e:	e8 a5 8c 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e853:	48 8d 9c 24 70 03 00 	lea    rbx,[rsp+0x370]
  a7e85a:	00
  a7e85b:	48 8d 35 72 d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd972]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e862:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
  a7e869:	00
  a7e86a:	e8 0f b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e86f:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
  a7e876:	00
  a7e877:	48 8d 35 06 a3 8d ff 	lea    rsi,[rip+0xffffffffff8da306]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e87e:	e8 fb b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e883:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  a7e88a:	00
  a7e88b:	48 8d b4 24 a0 02 00 	lea    rsi,[rsp+0x2a0]
  a7e892:	00
  a7e893:	6a 02                	push   0x2
  a7e895:	5a                   	pop    rdx
  a7e896:	e8 bd 8b 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e89b:	48 8d bc 24 78 03 00 	lea    rdi,[rsp+0x378]
  a7e8a2:	00
  a7e8a3:	66 c7 47 f8 0a 00    	mov    WORD PTR [rdi-0x8],0xa
  a7e8a9:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
  a7e8b0:	00
  a7e8b1:	e8 42 8c 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e8b6:	48 8d 9c 24 90 03 00 	lea    rbx,[rsp+0x390]
  a7e8bd:	00
  a7e8be:	48 8d 35 0f d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd90f]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e8c5:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
  a7e8cc:	00
  a7e8cd:	e8 ac b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e8d2:	48 8d bc 24 88 02 00 	lea    rdi,[rsp+0x288]
  a7e8d9:	00
  a7e8da:	48 8d 35 a3 a2 8d ff 	lea    rsi,[rip+0xffffffffff8da2a3]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e8e1:	e8 98 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e8e6:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
  a7e8ed:	00
  a7e8ee:	48 8d b4 24 70 02 00 	lea    rsi,[rsp+0x270]
  a7e8f5:	00
  a7e8f6:	6a 02                	push   0x2
  a7e8f8:	5a                   	pop    rdx
  a7e8f9:	e8 5a 8b 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e8fe:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
  a7e905:	00
  a7e906:	66 c7 47 f8 0b 00    	mov    WORD PTR [rdi-0x8],0xb
  a7e90c:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
  a7e913:	00
  a7e914:	e8 df 8b 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e919:	48 8d 9c 24 b0 03 00 	lea    rbx,[rsp+0x3b0]
  a7e920:	00
  a7e921:	48 8d 35 ac d8 8d ff 	lea    rsi,[rip+0xffffffffff8dd8ac]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e928:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
  a7e92f:	00
  a7e930:	e8 49 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e935:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
  a7e93c:	00
  a7e93d:	48 8d 35 40 a2 8d ff 	lea    rsi,[rip+0xffffffffff8da240]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e944:	e8 35 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e949:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  a7e950:	00
  a7e951:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
  a7e958:	00
  a7e959:	6a 02                	push   0x2
  a7e95b:	5a                   	pop    rdx
  a7e95c:	e8 f7 8a 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e961:	48 8d bc 24 b8 03 00 	lea    rdi,[rsp+0x3b8]
  a7e968:	00
  a7e969:	66 c7 47 f8 0c 00    	mov    WORD PTR [rdi-0x8],0xc
  a7e96f:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
  a7e976:	00
  a7e977:	e8 7c 8b 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e97c:	48 8d 9c 24 d0 03 00 	lea    rbx,[rsp+0x3d0]
  a7e983:	00
  a7e984:	48 8d 35 49 d8 8d ff 	lea    rsi,[rip+0xffffffffff8dd849]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e98b:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
  a7e992:	00
  a7e993:	e8 e6 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e998:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
  a7e99f:	00
  a7e9a0:	48 8d 35 dd a1 8d ff 	lea    rsi,[rip+0xffffffffff8da1dd]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e9a7:	e8 d2 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e9ac:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
  a7e9b1:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
  a7e9b8:	00
  a7e9b9:	6a 02                	push   0x2
  a7e9bb:	5a                   	pop    rdx
  a7e9bc:	e8 97 8a 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e9c1:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  a7e9c8:	00
  a7e9c9:	66 c7 47 f8 11 00    	mov    WORD PTR [rdi-0x8],0x11
  a7e9cf:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
```
### AP `0x18b08d8` +0x28 -> `0xa7e773` score 21

```text
  a7e773:	55                   	push   rbp
  a7e774:	41 57                	push   r15
  a7e776:	41 56                	push   r14
  a7e778:	41 55                	push   r13
  a7e77a:	41 54                	push   r12
  a7e77c:	53                   	push   rbx
  a7e77d:	48 81 ec 98 04 00 00 	sub    rsp,0x498
  a7e784:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7e78b:	00 00
  a7e78d:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
  a7e794:	00
  a7e795:	48 8d 35 38 da 8d ff 	lea    rsi,[rip+0xffffffffff8dda38]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e79c:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  a7e7a3:	00
  a7e7a4:	e8 d5 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e7a9:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
  a7e7b0:	00
  a7e7b1:	48 8d 35 cc a3 8d ff 	lea    rsi,[rip+0xffffffffff8da3cc]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e7b8:	e8 c1 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e7bd:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  a7e7c4:	00
  a7e7c5:	48 8d b4 24 00 03 00 	lea    rsi,[rsp+0x300]
  a7e7cc:	00
  a7e7cd:	6a 02                	push   0x2
  a7e7cf:	5a                   	pop    rdx
  a7e7d0:	e8 83 8c 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e7d5:	48 8d bc 24 38 03 00 	lea    rdi,[rsp+0x338]
  a7e7dc:	00
  a7e7dd:	66 c7 47 f8 08 00    	mov    WORD PTR [rdi-0x8],0x8
  a7e7e3:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
  a7e7ea:	00
  a7e7eb:	e8 08 8d 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e7f0:	48 8d 9c 24 50 03 00 	lea    rbx,[rsp+0x350]
  a7e7f7:	00
  a7e7f8:	48 8d 35 d5 d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd9d5]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e7ff:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
  a7e806:	00
  a7e807:	e8 72 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e80c:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
  a7e813:	00
  a7e814:	48 8d 35 69 a3 8d ff 	lea    rsi,[rip+0xffffffffff8da369]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e81b:	e8 5e b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e820:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  a7e827:	00
  a7e828:	48 8d b4 24 d0 02 00 	lea    rsi,[rsp+0x2d0]
  a7e82f:	00
  a7e830:	6a 02                	push   0x2
  a7e832:	5a                   	pop    rdx
  a7e833:	e8 20 8c 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e838:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
  a7e83f:	00
  a7e840:	66 c7 47 f8 09 00    	mov    WORD PTR [rdi-0x8],0x9
  a7e846:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  a7e84d:	00
  a7e84e:	e8 a5 8c 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e853:	48 8d 9c 24 70 03 00 	lea    rbx,[rsp+0x370]
  a7e85a:	00
  a7e85b:	48 8d 35 72 d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd972]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e862:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
  a7e869:	00
  a7e86a:	e8 0f b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e86f:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
  a7e876:	00
  a7e877:	48 8d 35 06 a3 8d ff 	lea    rsi,[rip+0xffffffffff8da306]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e87e:	e8 fb b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e883:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  a7e88a:	00
  a7e88b:	48 8d b4 24 a0 02 00 	lea    rsi,[rsp+0x2a0]
  a7e892:	00
  a7e893:	6a 02                	push   0x2
  a7e895:	5a                   	pop    rdx
  a7e896:	e8 bd 8b 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e89b:	48 8d bc 24 78 03 00 	lea    rdi,[rsp+0x378]
  a7e8a2:	00
  a7e8a3:	66 c7 47 f8 0a 00    	mov    WORD PTR [rdi-0x8],0xa
  a7e8a9:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
  a7e8b0:	00
  a7e8b1:	e8 42 8c 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e8b6:	48 8d 9c 24 90 03 00 	lea    rbx,[rsp+0x390]
  a7e8bd:	00
  a7e8be:	48 8d 35 0f d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd90f]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e8c5:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
  a7e8cc:	00
  a7e8cd:	e8 ac b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e8d2:	48 8d bc 24 88 02 00 	lea    rdi,[rsp+0x288]
  a7e8d9:	00
  a7e8da:	48 8d 35 a3 a2 8d ff 	lea    rsi,[rip+0xffffffffff8da2a3]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e8e1:	e8 98 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e8e6:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
  a7e8ed:	00
  a7e8ee:	48 8d b4 24 70 02 00 	lea    rsi,[rsp+0x270]
  a7e8f5:	00
  a7e8f6:	6a 02                	push   0x2
  a7e8f8:	5a                   	pop    rdx
  a7e8f9:	e8 5a 8b 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e8fe:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
  a7e905:	00
  a7e906:	66 c7 47 f8 0b 00    	mov    WORD PTR [rdi-0x8],0xb
  a7e90c:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
  a7e913:	00
  a7e914:	e8 df 8b 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e919:	48 8d 9c 24 b0 03 00 	lea    rbx,[rsp+0x3b0]
  a7e920:	00
  a7e921:	48 8d 35 ac d8 8d ff 	lea    rsi,[rip+0xffffffffff8dd8ac]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e928:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
  a7e92f:	00
  a7e930:	e8 49 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e935:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
  a7e93c:	00
  a7e93d:	48 8d 35 40 a2 8d ff 	lea    rsi,[rip+0xffffffffff8da240]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e944:	e8 35 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e949:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  a7e950:	00
  a7e951:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
  a7e958:	00
  a7e959:	6a 02                	push   0x2
  a7e95b:	5a                   	pop    rdx
  a7e95c:	e8 f7 8a 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e961:	48 8d bc 24 b8 03 00 	lea    rdi,[rsp+0x3b8]
  a7e968:	00
  a7e969:	66 c7 47 f8 0c 00    	mov    WORD PTR [rdi-0x8],0xc
  a7e96f:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
  a7e976:	00
  a7e977:	e8 7c 8b 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e97c:	48 8d 9c 24 d0 03 00 	lea    rbx,[rsp+0x3d0]
  a7e983:	00
  a7e984:	48 8d 35 49 d8 8d ff 	lea    rsi,[rip+0xffffffffff8dd849]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e98b:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
  a7e992:	00
  a7e993:	e8 e6 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e998:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
  a7e99f:	00
  a7e9a0:	48 8d 35 dd a1 8d ff 	lea    rsi,[rip+0xffffffffff8da1dd]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e9a7:	e8 d2 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e9ac:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
  a7e9b1:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
  a7e9b8:	00
  a7e9b9:	6a 02                	push   0x2
  a7e9bb:	5a                   	pop    rdx
  a7e9bc:	e8 97 8a 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e9c1:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  a7e9c8:	00
  a7e9c9:	66 c7 47 f8 11 00    	mov    WORD PTR [rdi-0x8],0x11
  a7e9cf:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
  a7e9d4:	e8 1f 8b 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e9d9:	48 8d 9c 24 f0 03 00 	lea    rbx,[rsp+0x3f0]
  a7e9e0:	00
  a7e9e1:	48 8d 35 ec d7 8d ff 	lea    rsi,[rip+0xffffffffff8dd7ec]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e9e8:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
  a7e9ef:	00
  a7e9f0:	e8 89 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e9f5:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
  a7e9fc:	00
  a7e9fd:	48 8d 35 80 a1 8d ff 	lea    rsi,[rip+0xffffffffff8da180]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7ea04:	e8 75 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7ea09:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  a7ea0e:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
  a7ea15:	00
  a7ea16:	6a 02                	push   0x2
  a7ea18:	5a                   	pop    rdx
```
### AP `0x1800910` +0x28 -> `0xacc64a` score 17

```text
  acc64a:	48 8b 87 f0 02 00 00 	mov    rax,QWORD PTR [rdi+0x2f0]
  acc651:	c3                   	ret
  acc652:	41 56                	push   r14
  acc654:	53                   	push   rbx
  acc655:	48 83 ec 18          	sub    rsp,0x18
  acc659:	48 89 fb             	mov    rbx,rdi
  acc65c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  acc663:	00 00
  acc665:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  acc66a:	49 89 e6             	mov    r14,rsp
  acc66d:	4c 89 f7             	mov    rdi,r14
  acc670:	e8 77 84 d0 00       	call   17d4aec <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x90d>
  acc675:	4d 8b 36             	mov    r14,QWORD PTR [r14]
  acc678:	48 8b b3 90 03 00 00 	mov    rsi,QWORD PTR [rbx+0x390]
  acc67f:	48 85 f6             	test   rsi,rsi
  acc682:	74 08                	je     acc68c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1962c>
  acc684:	4c 89 f7             	mov    rdi,r14
  acc687:	e8 a0 78 03 00       	call   b03f2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x50ecc>
  acc68c:	48 8b b3 98 03 00 00 	mov    rsi,QWORD PTR [rbx+0x398]
  acc693:	48 85 f6             	test   rsi,rsi
  acc696:	74 08                	je     acc6a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19640>
  acc698:	4c 89 f7             	mov    rdi,r14
  acc69b:	e8 ae 34 03 00       	call   affb4e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4caee>
  acc6a0:	8a 44 24 08          	mov    al,BYTE PTR [rsp+0x8]
  acc6a4:	8a 4c 24 09          	mov    cl,BYTE PTR [rsp+0x9]
  acc6a8:	64 48 8b 14 25 28 00 	mov    rdx,QWORD PTR fs:0x28
  acc6af:	00 00
  acc6b1:	48 3b 54 24 10       	cmp    rdx,QWORD PTR [rsp+0x10]
  acc6b6:	75 12                	jne    acc6ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1966a>
  acc6b8:	0f b6 f8             	movzx  edi,al
  acc6bb:	0f b6 f1             	movzx  esi,cl
  acc6be:	48 83 c4 18          	add    rsp,0x18
  acc6c2:	5b                   	pop    rbx
  acc6c3:	41 5e                	pop    r14
  acc6c5:	e9 fc 84 d0 00       	jmp    17d4bc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x9e7>
  acc6ca:	e8 e1 33 d2 00       	call   17efab0 <__stack_chk_fail@plt>
  acc6cf:	cc                   	int3
```
### AP `0x1800918` +0x28 -> `0xacc652` score 17

```text
  acc652:	41 56                	push   r14
  acc654:	53                   	push   rbx
  acc655:	48 83 ec 18          	sub    rsp,0x18
  acc659:	48 89 fb             	mov    rbx,rdi
  acc65c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  acc663:	00 00
  acc665:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  acc66a:	49 89 e6             	mov    r14,rsp
  acc66d:	4c 89 f7             	mov    rdi,r14
  acc670:	e8 77 84 d0 00       	call   17d4aec <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x90d>
  acc675:	4d 8b 36             	mov    r14,QWORD PTR [r14]
  acc678:	48 8b b3 90 03 00 00 	mov    rsi,QWORD PTR [rbx+0x390]
  acc67f:	48 85 f6             	test   rsi,rsi
  acc682:	74 08                	je     acc68c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1962c>
  acc684:	4c 89 f7             	mov    rdi,r14
  acc687:	e8 a0 78 03 00       	call   b03f2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x50ecc>
  acc68c:	48 8b b3 98 03 00 00 	mov    rsi,QWORD PTR [rbx+0x398]
  acc693:	48 85 f6             	test   rsi,rsi
  acc696:	74 08                	je     acc6a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19640>
  acc698:	4c 89 f7             	mov    rdi,r14
  acc69b:	e8 ae 34 03 00       	call   affb4e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4caee>
  acc6a0:	8a 44 24 08          	mov    al,BYTE PTR [rsp+0x8]
  acc6a4:	8a 4c 24 09          	mov    cl,BYTE PTR [rsp+0x9]
  acc6a8:	64 48 8b 14 25 28 00 	mov    rdx,QWORD PTR fs:0x28
  acc6af:	00 00
  acc6b1:	48 3b 54 24 10       	cmp    rdx,QWORD PTR [rsp+0x10]
  acc6b6:	75 12                	jne    acc6ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1966a>
  acc6b8:	0f b6 f8             	movzx  edi,al
  acc6bb:	0f b6 f1             	movzx  esi,cl
  acc6be:	48 83 c4 18          	add    rsp,0x18
  acc6c2:	5b                   	pop    rbx
  acc6c3:	41 5e                	pop    r14
  acc6c5:	e9 fc 84 d0 00       	jmp    17d4bc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x9e7>
  acc6ca:	e8 e1 33 d2 00       	call   17efab0 <__stack_chk_fail@plt>
  acc6cf:	cc                   	int3
```
### AP `0x1815d48` +0x28 -> `0xc15b3c` score 17

```text
  c15b3c:	53                   	push   rbx
  c15b3d:	48 89 fb             	mov    rbx,rdi
  c15b40:	e8 3d ff ff ff       	call   c15a82 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162a22>
  c15b45:	48 89 df             	mov    rdi,rbx
  c15b48:	5b                   	pop    rbx
  c15b49:	e9 d2 83 bd 00       	jmp    17edf20 <_ZdlPv@plt>
  c15b4e:	55                   	push   rbp
  c15b4f:	41 57                	push   r15
  c15b51:	41 56                	push   r14
  c15b53:	41 55                	push   r13
  c15b55:	41 54                	push   r12
  c15b57:	53                   	push   rbx
  c15b58:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  c15b5f:	49 89 fe             	mov    r14,rdi
  c15b62:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c15b69:	00 00
  c15b6b:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  c15b72:	00
  c15b73:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
  c15b79:	0f 57 c0             	xorps  xmm0,xmm0
  c15b7c:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
  c15b81:	8b b7 a0 00 00 00    	mov    esi,DWORD PTR [rdi+0xa0]
  c15b87:	85 f6                	test   esi,esi
  c15b89:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
  c15b8e:	0f 8e 57 03 00 00    	jle    c15eeb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162e8b>
  c15b94:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  c15b99:	e8 22 e1 ff ff       	call   c13cc0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x160c60>
  c15b9e:	49 8d 86 98 00 00 00 	lea    rax,[r14+0x98]
  c15ba5:	49 8b 8e 98 00 00 00 	mov    rcx,QWORD PTR [r14+0x98]
  c15bac:	4c 89 f2             	mov    rdx,r14
  c15baf:	49 89 ce             	mov    r14,rcx
  c15bb2:	49 83 c6 07          	add    r14,0x7
  c15bb6:	f6 c1 01             	test   cl,0x1
  c15bb9:	4c 0f 44 f0          	cmove  r14,rax
  c15bbd:	48 63 82 a0 00 00 00 	movsxd rax,DWORD PTR [rdx+0xa0]
  c15bc4:	48 85 c0             	test   rax,rax
  c15bc7:	0f 84 9f 03 00 00    	je     c15f6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162f0c>
  c15bcd:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
  c15bd2:	48 8d 91 48 01 00 00 	lea    rdx,[rcx+0x148]
  c15bd9:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
  c15bde:	4d 8d 2c c6          	lea    r13,[r14+rax*8]
  c15be2:	48 8d 81 58 01 00 00 	lea    rax,[rcx+0x158]
  c15be9:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  c15bee:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
  c15bf3:	49 8b 1e             	mov    rbx,QWORD PTR [r14]
  c15bf6:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  c15bfb:	e8 5a 11 00 00       	call   c16d5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163cfa>
  c15c00:	49 89 c7             	mov    r15,rax
  c15c03:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  c15c07:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
  c15c0b:	e8 26 5c e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c15c10:	4c 89 ff             	mov    rdi,r15
  c15c13:	48 89 c6             	mov    rsi,rax
  c15c16:	e8 25 f8 aa 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
  c15c1b:	84 c0                	test   al,al
  c15c1d:	0f 84 e0 05 00 00    	je     c16203 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1631a3>
  c15c23:	f6 43 10 02          	test   BYTE PTR [rbx+0x10],0x2
  c15c27:	0f 84 a5 02 00 00    	je     c15ed2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162e72>
  c15c2d:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
  c15c31:	48 85 c9             	test   rcx,rcx
  c15c34:	48 8d 05 8d 0d db 00 	lea    rax,[rip+0xdb0d8d]        # 19c69c8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x8f610>
  c15c3b:	48 0f 44 c8          	cmove  rcx,rax
  c15c3f:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
  c15c44:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]
  c15c48:	49 83 e7 fc          	and    r15,0xfffffffffffffffc
  c15c4c:	4c 89 ff             	mov    rdi,r15
  c15c4f:	e8 6c 9a e8 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
  c15c54:	49 89 c4             	mov    r12,rax
  c15c57:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  c15c5c:	48 8b 98 50 01 00 00 	mov    rbx,QWORD PTR [rax+0x150]
  c15c63:	48 85 db             	test   rbx,rbx
  c15c66:	0f 84 98 00 00 00    	je     c15d04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162ca4>
  c15c6c:	f3 4c 0f b8 eb       	popcnt r13,rbx
  c15c71:	49 83 fd 01          	cmp    r13,0x1
  c15c75:	77 09                	ja     c15c80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c20>
  c15c77:	48 8d 53 ff          	lea    rdx,[rbx-0x1]
  c15c7b:	4c 21 e2             	and    rdx,r12
  c15c7e:	eb 10                	jmp    c15c90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c30>
  c15c80:	4c 89 e2             	mov    rdx,r12
  c15c83:	49 39 dc             	cmp    r12,rbx
  c15c86:	72 08                	jb     c15c90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c30>
  c15c88:	4c 89 e0             	mov    rax,r12
  c15c8b:	31 d2                	xor    edx,edx
  c15c8d:	48 f7 f3             	div    rbx
  c15c90:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
  c15c95:	48 8b 00             	mov    rax,QWORD PTR [rax]
  c15c98:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
  c15c9d:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
  c15ca1:	48 85 c0             	test   rax,rax
  c15ca4:	74 59                	je     c15cff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c9f>
  c15ca6:	48 8b 28             	mov    rbp,QWORD PTR [rax]
  c15ca9:	48 85 ed             	test   rbp,rbp
  c15cac:	74 51                	je     c15cff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c9f>
  c15cae:	48 8d 43 ff          	lea    rax,[rbx-0x1]
  c15cb2:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  c15cb7:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
  c15cbb:	4c 39 e0             	cmp    rax,r12
  c15cbe:	75 15                	jne    c15cd5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c75>
  c15cc0:	48 8d 7d 10          	lea    rdi,[rbp+0x10]
  c15cc4:	4c 89 fe             	mov    rsi,r15
  c15cc7:	e8 22 9a e8 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
  c15ccc:	84 c0                	test   al,al
  c15cce:	74 26                	je     c15cf6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c96>
  c15cd0:	e9 0f 02 00 00       	jmp    c15ee4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162e84>
  c15cd5:	41 83 fd 01          	cmp    r13d,0x1
  c15cd9:	77 07                	ja     c15ce2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c82>
  c15cdb:	48 23 44 24 38       	and    rax,QWORD PTR [rsp+0x38]
  c15ce0:	eb 0d                	jmp    c15cef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c8f>
  c15ce2:	48 39 d8             	cmp    rax,rbx
  c15ce5:	72 08                	jb     c15cef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c8f>
  c15ce7:	31 d2                	xor    edx,edx
  c15ce9:	48 f7 f3             	div    rbx
  c15cec:	48 89 d0             	mov    rax,rdx
  c15cef:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
  c15cf4:	75 09                	jne    c15cff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c9f>
  c15cf6:	48 8b 6d 00          	mov    rbp,QWORD PTR [rbp+0x0]
  c15cfa:	48 85 ed             	test   rbp,rbp
  c15cfd:	75 b8                	jne    c15cb7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c57>
  c15cff:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
  c15d04:	6a 30                	push   0x30
  c15d06:	5f                   	pop    rdi
  c15d07:	e8 f4 81 bd 00       	call   17edf00 <_Znwm@plt>
  c15d0c:	48 89 c5             	mov    rbp,rax
  c15d0f:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
  c15d16:	00
  c15d17:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
  c15d1c:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
  c15d23:	00
  c15d24:	48 83 65 00 00       	and    QWORD PTR [rbp+0x0],0x0
  c15d29:	c6 84 24 d0 01 00 00 	mov    BYTE PTR [rsp+0x1d0],0x0
  c15d30:	00
  c15d31:	4c 89 65 08          	mov    QWORD PTR [rbp+0x8],r12
  c15d35:	48 89 ef             	mov    rdi,rbp
  c15d38:	48 83 c7 10          	add    rdi,0x10
  c15d3c:	4c 89 fe             	mov    rsi,r15
  c15d3f:	e8 fc 81 bd 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  c15d44:	48 83 65 28 00       	and    QWORD PTR [rbp+0x28],0x0
  c15d49:	c6 84 24 d0 01 00 00 	mov    BYTE PTR [rsp+0x1d0],0x1
  c15d50:	01
  c15d51:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  c15d56:	48 8b 80 60 01 00 00 	mov    rax,QWORD PTR [rax+0x160]
  c15d5d:	48 ff c0             	inc    rax
  c15d60:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
  c15d65:	78 07                	js     c15d6e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162d0e>
  c15d67:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
  c15d6c:	eb 15                	jmp    c15d83 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162d23>
  c15d6e:	48 89 c1             	mov    rcx,rax
  c15d71:	48 d1 e9             	shr    rcx,1
  c15d74:	83 e0 01             	and    eax,0x1
  c15d77:	48 09 c8             	or     rax,rcx
  c15d7a:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
  c15d7f:	f3 0f 58 c0          	addss  xmm0,xmm0
  c15d83:	48 89 d9             	mov    rcx,rbx
  c15d86:	48 d1 e9             	shr    rcx,1
  c15d89:	89 d8                	mov    eax,ebx
  c15d8b:	83 e0 01             	and    eax,0x1
  c15d8e:	48 09 c8             	or     rax,rcx
  c15d91:	48 85 db             	test   rbx,rbx
  c15d94:	78 07                	js     c15d9d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162d3d>
  c15d96:	f3 48 0f 2a d3       	cvtsi2ss xmm2,rbx
```
### AP `0x1815d50` +0x28 -> `0xc15b4e` score 17

```text
  c15b4e:	55                   	push   rbp
  c15b4f:	41 57                	push   r15
  c15b51:	41 56                	push   r14
  c15b53:	41 55                	push   r13
  c15b55:	41 54                	push   r12
  c15b57:	53                   	push   rbx
  c15b58:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  c15b5f:	49 89 fe             	mov    r14,rdi
  c15b62:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c15b69:	00 00
  c15b6b:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  c15b72:	00
  c15b73:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
  c15b79:	0f 57 c0             	xorps  xmm0,xmm0
  c15b7c:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
  c15b81:	8b b7 a0 00 00 00    	mov    esi,DWORD PTR [rdi+0xa0]
  c15b87:	85 f6                	test   esi,esi
  c15b89:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
  c15b8e:	0f 8e 57 03 00 00    	jle    c15eeb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162e8b>
  c15b94:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  c15b99:	e8 22 e1 ff ff       	call   c13cc0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x160c60>
  c15b9e:	49 8d 86 98 00 00 00 	lea    rax,[r14+0x98]
  c15ba5:	49 8b 8e 98 00 00 00 	mov    rcx,QWORD PTR [r14+0x98]
  c15bac:	4c 89 f2             	mov    rdx,r14
  c15baf:	49 89 ce             	mov    r14,rcx
  c15bb2:	49 83 c6 07          	add    r14,0x7
  c15bb6:	f6 c1 01             	test   cl,0x1
  c15bb9:	4c 0f 44 f0          	cmove  r14,rax
  c15bbd:	48 63 82 a0 00 00 00 	movsxd rax,DWORD PTR [rdx+0xa0]
  c15bc4:	48 85 c0             	test   rax,rax
  c15bc7:	0f 84 9f 03 00 00    	je     c15f6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162f0c>
  c15bcd:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
  c15bd2:	48 8d 91 48 01 00 00 	lea    rdx,[rcx+0x148]
  c15bd9:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
  c15bde:	4d 8d 2c c6          	lea    r13,[r14+rax*8]
  c15be2:	48 8d 81 58 01 00 00 	lea    rax,[rcx+0x158]
  c15be9:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  c15bee:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
  c15bf3:	49 8b 1e             	mov    rbx,QWORD PTR [r14]
  c15bf6:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  c15bfb:	e8 5a 11 00 00       	call   c16d5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163cfa>
  c15c00:	49 89 c7             	mov    r15,rax
  c15c03:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  c15c07:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
  c15c0b:	e8 26 5c e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c15c10:	4c 89 ff             	mov    rdi,r15
  c15c13:	48 89 c6             	mov    rsi,rax
  c15c16:	e8 25 f8 aa 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
  c15c1b:	84 c0                	test   al,al
  c15c1d:	0f 84 e0 05 00 00    	je     c16203 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1631a3>
  c15c23:	f6 43 10 02          	test   BYTE PTR [rbx+0x10],0x2
  c15c27:	0f 84 a5 02 00 00    	je     c15ed2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162e72>
  c15c2d:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
  c15c31:	48 85 c9             	test   rcx,rcx
  c15c34:	48 8d 05 8d 0d db 00 	lea    rax,[rip+0xdb0d8d]        # 19c69c8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x8f610>
  c15c3b:	48 0f 44 c8          	cmove  rcx,rax
  c15c3f:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
  c15c44:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]
  c15c48:	49 83 e7 fc          	and    r15,0xfffffffffffffffc
  c15c4c:	4c 89 ff             	mov    rdi,r15
  c15c4f:	e8 6c 9a e8 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
  c15c54:	49 89 c4             	mov    r12,rax
  c15c57:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  c15c5c:	48 8b 98 50 01 00 00 	mov    rbx,QWORD PTR [rax+0x150]
  c15c63:	48 85 db             	test   rbx,rbx
  c15c66:	0f 84 98 00 00 00    	je     c15d04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162ca4>
  c15c6c:	f3 4c 0f b8 eb       	popcnt r13,rbx
  c15c71:	49 83 fd 01          	cmp    r13,0x1
  c15c75:	77 09                	ja     c15c80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c20>
  c15c77:	48 8d 53 ff          	lea    rdx,[rbx-0x1]
  c15c7b:	4c 21 e2             	and    rdx,r12
  c15c7e:	eb 10                	jmp    c15c90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c30>
  c15c80:	4c 89 e2             	mov    rdx,r12
  c15c83:	49 39 dc             	cmp    r12,rbx
  c15c86:	72 08                	jb     c15c90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c30>
  c15c88:	4c 89 e0             	mov    rax,r12
  c15c8b:	31 d2                	xor    edx,edx
  c15c8d:	48 f7 f3             	div    rbx
  c15c90:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
  c15c95:	48 8b 00             	mov    rax,QWORD PTR [rax]
  c15c98:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
  c15c9d:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
  c15ca1:	48 85 c0             	test   rax,rax
  c15ca4:	74 59                	je     c15cff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c9f>
  c15ca6:	48 8b 28             	mov    rbp,QWORD PTR [rax]
  c15ca9:	48 85 ed             	test   rbp,rbp
  c15cac:	74 51                	je     c15cff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c9f>
  c15cae:	48 8d 43 ff          	lea    rax,[rbx-0x1]
  c15cb2:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  c15cb7:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
  c15cbb:	4c 39 e0             	cmp    rax,r12
  c15cbe:	75 15                	jne    c15cd5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c75>
  c15cc0:	48 8d 7d 10          	lea    rdi,[rbp+0x10]
  c15cc4:	4c 89 fe             	mov    rsi,r15
  c15cc7:	e8 22 9a e8 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
  c15ccc:	84 c0                	test   al,al
  c15cce:	74 26                	je     c15cf6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c96>
  c15cd0:	e9 0f 02 00 00       	jmp    c15ee4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162e84>
  c15cd5:	41 83 fd 01          	cmp    r13d,0x1
  c15cd9:	77 07                	ja     c15ce2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c82>
  c15cdb:	48 23 44 24 38       	and    rax,QWORD PTR [rsp+0x38]
  c15ce0:	eb 0d                	jmp    c15cef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c8f>
  c15ce2:	48 39 d8             	cmp    rax,rbx
  c15ce5:	72 08                	jb     c15cef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c8f>
  c15ce7:	31 d2                	xor    edx,edx
  c15ce9:	48 f7 f3             	div    rbx
  c15cec:	48 89 d0             	mov    rax,rdx
  c15cef:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
  c15cf4:	75 09                	jne    c15cff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c9f>
  c15cf6:	48 8b 6d 00          	mov    rbp,QWORD PTR [rbp+0x0]
  c15cfa:	48 85 ed             	test   rbp,rbp
  c15cfd:	75 b8                	jne    c15cb7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162c57>
  c15cff:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
  c15d04:	6a 30                	push   0x30
  c15d06:	5f                   	pop    rdi
  c15d07:	e8 f4 81 bd 00       	call   17edf00 <_Znwm@plt>
  c15d0c:	48 89 c5             	mov    rbp,rax
  c15d0f:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
  c15d16:	00
  c15d17:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
  c15d1c:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
  c15d23:	00
  c15d24:	48 83 65 00 00       	and    QWORD PTR [rbp+0x0],0x0
  c15d29:	c6 84 24 d0 01 00 00 	mov    BYTE PTR [rsp+0x1d0],0x0
  c15d30:	00
  c15d31:	4c 89 65 08          	mov    QWORD PTR [rbp+0x8],r12
  c15d35:	48 89 ef             	mov    rdi,rbp
  c15d38:	48 83 c7 10          	add    rdi,0x10
  c15d3c:	4c 89 fe             	mov    rsi,r15
  c15d3f:	e8 fc 81 bd 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  c15d44:	48 83 65 28 00       	and    QWORD PTR [rbp+0x28],0x0
  c15d49:	c6 84 24 d0 01 00 00 	mov    BYTE PTR [rsp+0x1d0],0x1
  c15d50:	01
  c15d51:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  c15d56:	48 8b 80 60 01 00 00 	mov    rax,QWORD PTR [rax+0x160]
  c15d5d:	48 ff c0             	inc    rax
  c15d60:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
  c15d65:	78 07                	js     c15d6e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162d0e>
  c15d67:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
  c15d6c:	eb 15                	jmp    c15d83 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162d23>
  c15d6e:	48 89 c1             	mov    rcx,rax
  c15d71:	48 d1 e9             	shr    rcx,1
  c15d74:	83 e0 01             	and    eax,0x1
  c15d77:	48 09 c8             	or     rax,rcx
  c15d7a:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
  c15d7f:	f3 0f 58 c0          	addss  xmm0,xmm0
  c15d83:	48 89 d9             	mov    rcx,rbx
  c15d86:	48 d1 e9             	shr    rcx,1
  c15d89:	89 d8                	mov    eax,ebx
  c15d8b:	83 e0 01             	and    eax,0x1
  c15d8e:	48 09 c8             	or     rax,rcx
  c15d91:	48 85 db             	test   rbx,rbx
  c15d94:	78 07                	js     c15d9d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162d3d>
  c15d96:	f3 48 0f 2a d3       	cvtsi2ss xmm2,rbx
  c15d9b:	eb 09                	jmp    c15da6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162d46>
  c15d9d:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
  c15da2:	f3 0f 58 d2          	addss  xmm2,xmm2
  c15da6:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  c15dab:	f3 0f 10 88 68 01 00 	movss  xmm1,DWORD PTR [rax+0x168]
  c15db2:	00
```
### AP `0x1826c28` +0x28 -> `0xd86436` score 17

```text
  d86436:	55                   	push   rbp
  d86437:	41 57                	push   r15
  d86439:	41 56                	push   r14
  d8643b:	41 55                	push   r13
  d8643d:	41 54                	push   r12
  d8643f:	53                   	push   rbx
  d86440:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
  d86447:	49 89 f6             	mov    r14,rsi
  d8644a:	49 89 ff             	mov    r15,rdi
  d8644d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d86454:	00 00
  d86456:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
  d8645d:	00
  d8645e:	6a 14                	push   0x14
  d86460:	5e                   	pop    rsi
  d86461:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
  d86466:	48 89 d7             	mov    rdi,rdx
  d86469:	e8 30 f8 f1 ff       	call   ca5c9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f2c3e>
  d8646e:	49 8b ae a0 03 00 00 	mov    rbp,QWORD PTR [r14+0x3a0]
  d86475:	6a 01                	push   0x1
  d86477:	41 5d                	pop    r13
  d86479:	48 85 ed             	test   rbp,rbp
  d8647c:	0f 84 a1 00 00 00    	je     d86523 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x535a9>
  d86482:	49 89 c4             	mov    r12,rax
  d86485:	f3 48 0f b8 dd       	popcnt rbx,rbp
  d8648a:	48 83 fb 01          	cmp    rbx,0x1
  d8648e:	77 09                	ja     d86499 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5351f>
  d86490:	4c 8d 6d ff          	lea    r13,[rbp-0x1]
  d86494:	4d 21 e5             	and    r13,r12
  d86497:	eb 15                	jmp    d864ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53534>
  d86499:	49 39 ec             	cmp    r12,rbp
  d8649c:	73 05                	jae    d864a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53529>
  d8649e:	4d 89 e5             	mov    r13,r12
  d864a1:	eb 0b                	jmp    d864ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53534>
  d864a3:	4c 89 e0             	mov    rax,r12
  d864a6:	31 d2                	xor    edx,edx
  d864a8:	48 f7 f5             	div    rbp
  d864ab:	49 89 d5             	mov    r13,rdx
  d864ae:	49 8b 86 98 03 00 00 	mov    rax,QWORD PTR [r14+0x398]
  d864b5:	4a 8b 04 e8          	mov    rax,QWORD PTR [rax+r13*8]
  d864b9:	48 85 c0             	test   rax,rax
  d864bc:	74 61                	je     d8651f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x535a5>
  d864be:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
  d864c3:	4c 8b 38             	mov    r15,QWORD PTR [rax]
  d864c6:	4d 85 ff             	test   r15,r15
  d864c9:	74 4f                	je     d8651a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x535a0>
  d864cb:	48 8d 45 ff          	lea    rax,[rbp-0x1]
  d864cf:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  d864d4:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
  d864d8:	49 39 c4             	cmp    r12,rax
  d864db:	75 17                	jne    d864f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5357a>
  d864dd:	49 8d 7f 10          	lea    rdi,[r15+0x10]
  d864e1:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  d864e6:	e8 d6 3e ec ff       	call   c4a3c1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x197361>
  d864eb:	84 c0                	test   al,al
  d864ed:	74 23                	je     d86512 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53598>
  d864ef:	e9 b3 02 00 00       	jmp    d867a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5382d>
  d864f4:	83 fb 01             	cmp    ebx,0x1
  d864f7:	77 07                	ja     d86500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53586>
  d864f9:	48 23 44 24 18       	and    rax,QWORD PTR [rsp+0x18]
  d864fe:	eb 0d                	jmp    d8650d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53593>
  d86500:	48 39 e8             	cmp    rax,rbp
  d86503:	72 08                	jb     d8650d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53593>
  d86505:	31 d2                	xor    edx,edx
  d86507:	48 f7 f5             	div    rbp
  d8650a:	48 89 d0             	mov    rax,rdx
  d8650d:	4c 39 e8             	cmp    rax,r13
  d86510:	75 08                	jne    d8651a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x535a0>
  d86512:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
  d86515:	4d 85 ff             	test   r15,r15
  d86518:	75 ba                	jne    d864d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5355a>
  d8651a:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
  d8651f:	6a 01                	push   0x1
  d86521:	41 5d                	pop    r13
  d86523:	41 80 be e9 01 00 00 	cmp    BYTE PTR [r14+0x1e9],0x0
  d8652a:	00
  d8652b:	75 4f                	jne    d8657c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53602>
  d8652d:	4c 89 f7             	mov    rdi,r14
  d86530:	e8 0b 35 00 00       	call   d89a40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ac6>
  d86535:	89 c5                	mov    ebp,eax
  d86537:	41 83 be 1c 02 00 00 	cmp    DWORD PTR [r14+0x21c],0x0
  d8653e:	00
  d8653f:	7e 30                	jle    d86571 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x535f7>
  d86541:	41 83 be 20 02 00 00 	cmp    DWORD PTR [r14+0x220],0x0
  d86548:	00
  d86549:	74 26                	je     d86571 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x535f7>
  d8654b:	49 8b be 18 01 00 00 	mov    rdi,QWORD PTR [r14+0x118]
  d86552:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d86555:	ff 50 38             	call   QWORD PTR [rax+0x38]
  d86558:	41 2b 86 20 02 00 00 	sub    eax,DWORD PTR [r14+0x220]
  d8655f:	41 69 8e 1c 02 00 00 	imul   ecx,DWORD PTR [r14+0x21c],0x3e8
  d86566:	e8 03 00 00
  d8656a:	39 c8                	cmp    eax,ecx
  d8656c:	0f 92 c0             	setb   al
  d8656f:	eb 02                	jmp    d86573 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x535f9>
  d86571:	31 c0                	xor    eax,eax
  d86573:	40 08 c5             	or     bpl,al
  d86576:	0f 84 51 01 00 00    	je     d866cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53753>
  d8657c:	48 8d 35 4f d0 5e ff 	lea    rsi,[rip+0xffffffffff5ed04f]        # 3735d2 <_ZTSSt12bad_any_cast@@Base-0x1cbf6>
  d86583:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
  d86588:	4c 89 e7             	mov    rdi,r12
  d8658b:	e8 ee 34 cf ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  d86590:	4c 89 f7             	mov    rdi,r14
  d86593:	4c 89 e6             	mov    rsi,r12
  d86596:	e8 3d 28 00 00       	call   d88dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e5e>
  d8659b:	89 c5                	mov    ebp,eax
  d8659d:	31 db                	xor    ebx,ebx
  d8659f:	84 c0                	test   al,al
  d865a1:	74 1a                	je     d865bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53643>
  d865a3:	49 8b be f0 02 00 00 	mov    rdi,QWORD PTR [r14+0x2f0]
  d865aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d865ad:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
  d865b2:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  d865b7:	ff 50 18             	call   QWORD PTR [rax+0x18]
  d865ba:	0f b6 d8             	movzx  ebx,al
  d865bd:	41 80 be 90 03 00 00 	cmp    BYTE PTR [r14+0x390],0x0
  d865c4:	00
  d865c5:	74 34                	je     d865fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53681>
  d865c7:	49 8d be 08 03 00 00 	lea    rdi,[r14+0x308]
  d865ce:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  d865d3:	e8 e9 3d ec ff       	call   c4a3c1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x197361>
  d865d8:	84 c0                	test   al,al
  d865da:	74 1f                	je     d865fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53681>
  d865dc:	41 0f 10 86 1c 03 00 	movups xmm0,XMMWORD PTR [r14+0x31c]
  d865e3:	00
  d865e4:	41 0f 10 8e 28 03 00 	movups xmm1,XMMWORD PTR [r14+0x328]
  d865eb:	00
  d865ec:	0f 11 4c 24 6c       	movups XMMWORD PTR [rsp+0x6c],xmm1
  d865f1:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
  d865f6:	83 cb 02             	or     ebx,0x2
  d865f9:	eb 07                	jmp    d86602 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53688>
  d865fb:	85 db                	test   ebx,ebx
  d865fd:	74 22                	je     d86621 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x536a7>
  d865ff:	6a 01                	push   0x1
  d86601:	5b                   	pop    rbx
  d86602:	0f 10 44 24 6c       	movups xmm0,XMMWORD PTR [rsp+0x6c]
  d86607:	41 0f 11 47 0c       	movups XMMWORD PTR [r15+0xc],xmm0
  d8660c:	0f 28 44 24 60       	movaps xmm0,XMMWORD PTR [rsp+0x60]
  d86611:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
  d86615:	45 89 6f 1c          	mov    DWORD PTR [r15+0x1c],r13d
  d86619:	41 89 5f 20          	mov    DWORD PTR [r15+0x20],ebx
  d8661d:	b0 01                	mov    al,0x1
  d8661f:	eb 72                	jmp    d86693 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53719>
  d86621:	40 84 ed             	test   bpl,bpl
  d86624:	75 67                	jne    d8668d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53713>
  d86626:	49 8b be f0 02 00 00 	mov    rdi,QWORD PTR [r14+0x2f0]
  d8662d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d86630:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  d86635:	ff 50 20             	call   QWORD PTR [rax+0x20]
  d86638:	84 c0                	test   al,al
  d8663a:	74 51                	je     d8668d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53713>
  d8663c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  d86641:	e8 f0 51 cf ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  d86646:	49 89 c4             	mov    r12,rax
  d86649:	49 89 d5             	mov    r13,rdx
  d8664c:	48 8d ac 24 87 00 00 	lea    rbp,[rsp+0x87]
  d86653:	00
  d86654:	48 89 ef             	mov    rdi,rbp
  d86657:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  d8665c:	e8 d3 1b d2 ff       	call   aa8234 <JNI_OnUnload@@Base+0x2fb01>
```
### AP `0x182cf18` +0x28 -> `0xe03140` score 17

```text
  e03140:	55                   	push   rbp
  e03141:	41 57                	push   r15
  e03143:	41 56                	push   r14
  e03145:	41 55                	push   r13
  e03147:	41 54                	push   r12
  e03149:	53                   	push   rbx
  e0314a:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e03151:	4d 89 c7             	mov    r15,r8
  e03154:	48 89 cb             	mov    rbx,rcx
  e03157:	49 89 f6             	mov    r14,rsi
  e0315a:	49 89 fc             	mov    r12,rdi
  e0315d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e03164:	00 00
  e03166:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e0316d:	00
  e0316e:	48 8b 77 30          	mov    rsi,QWORD PTR [rdi+0x30]
  e03172:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e03175:	4c 8d ac 24 a8 00 00 	lea    r13,[rsp+0xa8]
  e0317c:	00
  e0317d:	4c 89 ef             	mov    rdi,r13
  e03180:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e03183:	41 80 bd e0 02 00 00 	cmp    BYTE PTR [r13+0x2e0],0x0
  e0318a:	00
  e0318b:	0f 84 83 01 00 00    	je     e03314 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd039a>
  e03191:	49 8b 54 24 10       	mov    rdx,QWORD PTR [r12+0x10]
  e03196:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
  e0319b:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
  e031a2:	00
  e031a3:	4c 89 ef             	mov    rdi,r13
  e031a6:	e8 ef 13 00 00       	call   e0459a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1620>
  e031ab:	41 80 7d 18 00       	cmp    BYTE PTR [r13+0x18],0x0
  e031b0:	0f 84 7b 01 00 00    	je     e03331 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd03b7>
  e031b6:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  e031ba:	e8 c0 a2 05 00       	call   e5d47f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24895>
  e031bf:	0f 57 c0             	xorps  xmm0,xmm0
  e031c2:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  e031c6:	4d 8b ac 24 a8 01 00 	mov    r13,QWORD PTR [r12+0x1a8]
  e031cd:	00
  e031ce:	4d 85 ed             	test   r13,r13
  e031d1:	74 42                	je     e03215 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd029b>
  e031d3:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  e031d8:	e8 75 29 d4 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
  e031dd:	48 8d 8c 24 c8 00 00 	lea    rcx,[rsp+0xc8]
  e031e4:	00
  e031e5:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e031e9:	48 8d 6c 24 30       	lea    rbp,[rsp+0x30]
  e031ee:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
  e031f3:	48 89 ef             	mov    rdi,rbp
  e031f6:	4c 89 ee             	mov    rsi,r13
  e031f9:	31 d2                	xor    edx,edx
  e031fb:	49 89 d9             	mov    r9,rbx
  e031fe:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e03201:	48 89 e7             	mov    rdi,rsp
  e03204:	48 89 ee             	mov    rsi,rbp
  e03207:	e8 ca 51 cd ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>
  e0320c:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
  e03210:	e8 9d b2 c9 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e03215:	4d 8b 6c 24 40       	mov    r13,QWORD PTR [r12+0x40]
  e0321a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  e0321f:	e8 2e 29 d4 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
  e03224:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  e03229:	4c 89 fe             	mov    rsi,r15
  e0322c:	e8 5f 70 c7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e03231:	49 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [r12+0x1b0]
  e03238:	00
  e03239:	41 0f 10 84 24 a8 01 	movups xmm0,XMMWORD PTR [r12+0x1a8]
  e03240:	00 00
  e03242:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
  e03247:	48 85 c0             	test   rax,rax
  e0324a:	74 05                	je     e03251 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd02d7>
  e0324c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e03251:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e03256:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  e0325a:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
  e0325f:	48 85 c0             	test   rax,rax
  e03262:	74 05                	je     e03269 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd02ef>
  e03264:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e03269:	48 83 a4 24 88 00 00 	and    QWORD PTR [rsp+0x88],0x0
  e03270:	00 00
  e03272:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
  e03279:	00 00
  e0327b:	6a 50                	push   0x50
  e0327d:	5f                   	pop    rdi
  e0327e:	e8 7d ac 9e 00       	call   17edf00 <_Znwm@plt>
  e03283:	49 89 c7             	mov    r15,rax
  e03286:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  e0328b:	48 89 c7             	mov    rdi,rax
  e0328e:	e8 fd 6f c7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e03293:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]
  e0329a:	00
  e0329b:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
  e032a0:	0f 28 00             	movaps xmm0,XMMWORD PTR [rax]
  e032a3:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
  e032a8:	0f 57 c0             	xorps  xmm0,xmm0
  e032ab:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
  e032ae:	0f 28 48 10          	movaps xmm1,XMMWORD PTR [rax+0x10]
  e032b2:	41 0f 11 4f 40       	movups XMMWORD PTR [r15+0x40],xmm1
  e032b7:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
  e032bb:	4c 8d 8c 24 88 00 00 	lea    r9,[rsp+0x88]
  e032c2:	00
  e032c3:	4d 89 39             	mov    QWORD PTR [r9],r15
  e032c6:	48 8d 05 63 15 00 00 	lea    rax,[rip+0x1563]        # e04830 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd18b6>
  e032cd:	49 89 41 10          	mov    QWORD PTR [r9+0x10],rax
  e032d1:	48 8d 05 0c 17 00 00 	lea    rax,[rip+0x170c]        # e049e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1a6a>
  e032d8:	49 89 41 18          	mov    QWORD PTR [r9+0x18],rax
  e032dc:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e032e0:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
  e032e5:	4c 89 ef             	mov    rdi,r13
  e032e8:	4c 89 f6             	mov    rsi,r14
  e032eb:	48 89 d9             	mov    rcx,rbx
  e032ee:	ff 50 70             	call   QWORD PTR [rax+0x70]
  e032f1:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
  e032f8:	00
  e032f9:	e8 be 13 00 00       	call   e046bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1742>
  e032fe:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  e03303:	e8 bc 16 00 00       	call   e049c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1a4a>
  e03308:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  e0330d:	e8 a0 b1 c9 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e03312:	eb 38                	jmp    e0334c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd03d2>
  e03314:	48 b8 00 00 00 00 05 	movabs rax,0x500000000
  e0331b:	00 00 00
  e0331e:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  e03323:	48 89 06             	mov    QWORD PTR [rsi],rax
  e03326:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
  e0332a:	e8 61 aa cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e0332f:	eb 25                	jmp    e03356 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd03dc>
  e03331:	48 b8 00 00 00 00 05 	movabs rax,0x500000000
  e03338:	00 00 00
  e0333b:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  e03340:	48 89 06             	mov    QWORD PTR [rsi],rax
  e03343:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
  e03347:	e8 44 aa cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e0334c:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  e03351:	e8 da 39 ca ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e03356:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
  e0335d:	00
  e0335e:	e8 75 f4 fe ff       	call   df27d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf85e>
  e03363:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e0336a:	00 00
  e0336c:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e03373:	00
  e03374:	75 12                	jne    e03388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd040e>
  e03376:	48 81 c4 98 03 00 00 	add    rsp,0x398
  e0337d:	5b                   	pop    rbx
  e0337e:	41 5c                	pop    r12
  e03380:	41 5d                	pop    r13
  e03382:	41 5e                	pop    r14
  e03384:	41 5f                	pop    r15
  e03386:	5d                   	pop    rbp
  e03387:	c3                   	ret
```
### AP `0x182cf20` +0x28 -> `0xe033b8` score 17

```text
  e033b8:	55                   	push   rbp
  e033b9:	41 57                	push   r15
  e033bb:	41 56                	push   r14
  e033bd:	41 55                	push   r13
  e033bf:	41 54                	push   r12
  e033c1:	53                   	push   rbx
  e033c2:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e033c9:	4d 89 c7             	mov    r15,r8
  e033cc:	48 89 cb             	mov    rbx,rcx
  e033cf:	49 89 f6             	mov    r14,rsi
  e033d2:	49 89 fc             	mov    r12,rdi
  e033d5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e033dc:	00 00
  e033de:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e033e5:	00
  e033e6:	48 8b 77 30          	mov    rsi,QWORD PTR [rdi+0x30]
  e033ea:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e033ed:	4c 8d ac 24 a8 00 00 	lea    r13,[rsp+0xa8]
  e033f4:	00
  e033f5:	4c 89 ef             	mov    rdi,r13
  e033f8:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e033fb:	41 80 bd e0 02 00 00 	cmp    BYTE PTR [r13+0x2e0],0x0
  e03402:	00
  e03403:	0f 84 84 01 00 00    	je     e0358d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd0613>
  e03409:	49 8b 54 24 10       	mov    rdx,QWORD PTR [r12+0x10]
  e0340e:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
  e03413:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
  e0341a:	00
  e0341b:	4c 89 ef             	mov    rdi,r13
  e0341e:	e8 77 11 00 00       	call   e0459a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1620>
  e03423:	41 80 7d 18 00       	cmp    BYTE PTR [r13+0x18],0x0
  e03428:	0f 84 7c 01 00 00    	je     e035aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd0630>
  e0342e:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  e03432:	e8 48 a0 05 00       	call   e5d47f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24895>
  e03437:	0f 57 c0             	xorps  xmm0,xmm0
  e0343a:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  e0343e:	4d 8b ac 24 a8 01 00 	mov    r13,QWORD PTR [r12+0x1a8]
  e03445:	00
  e03446:	4d 85 ed             	test   r13,r13
  e03449:	74 43                	je     e0348e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd0514>
  e0344b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  e03450:	e8 fd 26 d4 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
  e03455:	48 8d 8c 24 c8 00 00 	lea    rcx,[rsp+0xc8]
  e0345c:	00
  e0345d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e03461:	48 8d 6c 24 30       	lea    rbp,[rsp+0x30]
  e03466:	6a 01                	push   0x1
  e03468:	5a                   	pop    rdx
  e03469:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
  e0346e:	48 89 ef             	mov    rdi,rbp
  e03471:	4c 89 ee             	mov    rsi,r13
  e03474:	49 89 d9             	mov    r9,rbx
  e03477:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e0347a:	48 89 e7             	mov    rdi,rsp
  e0347d:	48 89 ee             	mov    rsi,rbp
  e03480:	e8 51 4f cd ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>
  e03485:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
  e03489:	e8 24 b0 c9 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e0348e:	4d 8b 6c 24 40       	mov    r13,QWORD PTR [r12+0x40]
  e03493:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  e03498:	e8 b5 26 d4 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
  e0349d:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  e034a2:	4c 89 fe             	mov    rsi,r15
  e034a5:	e8 e6 6d c7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e034aa:	49 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [r12+0x1b0]
  e034b1:	00
  e034b2:	41 0f 10 84 24 a8 01 	movups xmm0,XMMWORD PTR [r12+0x1a8]
  e034b9:	00 00
  e034bb:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
  e034c0:	48 85 c0             	test   rax,rax
  e034c3:	74 05                	je     e034ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd0550>
  e034c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e034ca:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e034cf:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  e034d3:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
  e034d8:	48 85 c0             	test   rax,rax
  e034db:	74 05                	je     e034e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd0568>
  e034dd:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e034e2:	48 83 a4 24 88 00 00 	and    QWORD PTR [rsp+0x88],0x0
  e034e9:	00 00
  e034eb:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
  e034f2:	00 00
  e034f4:	6a 50                	push   0x50
  e034f6:	5f                   	pop    rdi
  e034f7:	e8 04 aa 9e 00       	call   17edf00 <_Znwm@plt>
  e034fc:	49 89 c7             	mov    r15,rax
  e034ff:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  e03504:	48 89 c7             	mov    rdi,rax
  e03507:	e8 84 6d c7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e0350c:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]
  e03513:	00
  e03514:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
  e03519:	0f 28 00             	movaps xmm0,XMMWORD PTR [rax]
  e0351c:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
  e03521:	0f 57 c0             	xorps  xmm0,xmm0
  e03524:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
  e03527:	0f 28 48 10          	movaps xmm1,XMMWORD PTR [rax+0x10]
  e0352b:	41 0f 11 4f 40       	movups XMMWORD PTR [r15+0x40],xmm1
  e03530:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
  e03534:	4c 8d 8c 24 88 00 00 	lea    r9,[rsp+0x88]
  e0353b:	00
  e0353c:	4d 89 39             	mov    QWORD PTR [r9],r15
  e0353f:	48 8d 05 ea 12 00 00 	lea    rax,[rip+0x12ea]        # e04830 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd18b6>
  e03546:	49 89 41 10          	mov    QWORD PTR [r9+0x10],rax
  e0354a:	48 8d 05 09 13 00 00 	lea    rax,[rip+0x1309]        # e0485a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd18e0>
  e03551:	49 89 41 18          	mov    QWORD PTR [r9+0x18],rax
  e03555:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e03559:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
  e0355e:	4c 89 ef             	mov    rdi,r13
  e03561:	4c 89 f6             	mov    rsi,r14
  e03564:	48 89 d9             	mov    rcx,rbx
  e03567:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e0356a:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
  e03571:	00
  e03572:	e8 45 11 00 00       	call   e046bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1742>
  e03577:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  e0357c:	e8 43 14 00 00       	call   e049c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1a4a>
  e03581:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  e03586:	e8 27 af c9 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e0358b:	eb 38                	jmp    e035c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd064b>
  e0358d:	48 b8 00 00 00 00 04 	movabs rax,0x400000000
  e03594:	00 00 00
  e03597:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  e0359c:	48 89 06             	mov    QWORD PTR [rsi],rax
  e0359f:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
  e035a3:	e8 e8 a7 cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e035a8:	eb 25                	jmp    e035cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd0655>
  e035aa:	48 b8 00 00 00 00 04 	movabs rax,0x400000000
  e035b1:	00 00 00
  e035b4:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  e035b9:	48 89 06             	mov    QWORD PTR [rsi],rax
  e035bc:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
  e035c0:	e8 cb a7 cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e035c5:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  e035ca:	e8 61 37 ca ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e035cf:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
  e035d6:	00
  e035d7:	e8 fc f1 fe ff       	call   df27d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf85e>
  e035dc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e035e3:	00 00
  e035e5:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e035ec:	00
  e035ed:	75 12                	jne    e03601 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd0687>
  e035ef:	48 81 c4 98 03 00 00 	add    rsp,0x398
  e035f6:	5b                   	pop    rbx
  e035f7:	41 5c                	pop    r12
  e035f9:	41 5d                	pop    r13
  e035fb:	41 5e                	pop    r14
  e035fd:	41 5f                	pop    r15
  e035ff:	5d                   	pop    rbp
  e03600:	c3                   	ret
```
### AP `0x183b6e8` +0x28 -> `0xf370ac` score 17

```text
  f370ac:	55                   	push   rbp
  f370ad:	41 57                	push   r15
  f370af:	41 56                	push   r14
  f370b1:	41 55                	push   r13
  f370b3:	41 54                	push   r12
  f370b5:	53                   	push   rbx
  f370b6:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  f370bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f370c4:	00 00
  f370c6:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  f370cd:	00
  f370ce:	48 8d 84 24 18 02 00 	lea    rax,[rsp+0x218]
  f370d5:	00
  f370d6:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
  f370db:	49 89 f6             	mov    r14,rsi
  f370de:	48 89 fb             	mov    rbx,rdi
  f370e1:	48 8d 0d 50 52 96 00 	lea    rcx,[rip+0x965250]        # 189c338 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x9278>
  f370e8:	48 89 08             	mov    QWORD PTR [rax],rcx
  f370eb:	0f 57 c0             	xorps  xmm0,xmm0
  f370ee:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
  f370f2:	48 8d 0d 9f 62 a5 00 	lea    rcx,[rip+0xa5629f]        # 198d398 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x55fe0>
  f370f9:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
  f370fd:	0f 28 0d cc 6b 45 ff 	movaps xmm1,XMMWORD PTR [rip+0xffffffffff456bcc]        # 38dcd0 <_ZTSSt12bad_any_cast@@Base-0x24f8>
  f37104:	0f 11 48 28          	movups XMMWORD PTR [rax+0x28],xmm1
  f37108:	48 8d 0d b9 84 50 ff 	lea    rcx,[rip+0xffffffffff5084b9]        # 43f5c8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x51d4>
  f3710f:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
  f37113:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
  f37117:	66 83 60 50 00       	and    WORD PTR [rax+0x50],0x0
  f3711c:	48 89 d7             	mov    rdi,rdx
  f3711f:	48 89 c6             	mov    rsi,rax
  f37122:	e8 67 c4 07 00       	call   fb358e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a9a4>
  f37127:	84 c0                	test   al,al
  f37129:	0f 84 fb 00 00 00    	je     f3722a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfe640>
  f3712f:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
  f37136:	00
  f37137:	e8 ce d8 bf ff       	call   b34a0a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x819aa>
  f3713c:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
  f37141:	4c 89 ff             	mov    rdi,r15
  f37144:	48 89 c6             	mov    rsi,rax
  f37147:	e8 d6 1d fe ff       	call   f18f22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0338>
  f3714c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  f37151:	4c 89 fe             	mov    rsi,r15
  f37154:	e8 b1 c3 07 00       	call   fb350a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a920>
  f37159:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  f3715e:	e8 2f 8a b8 ff       	call   abfb92 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb32>
  f37163:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
  f3716a:	00
  f3716b:	e8 ca 36 00 00       	call   f3a83a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101c50>
  f37170:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
  f37177:	00
  f37178:	48 89 c6             	mov    rsi,rax
  f3717b:	e8 29 53 62 00       	call   155c4a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a1a2d>
  f37180:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
  f37184:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  f37187:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  f3718c:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
  f37191:	ff 90 70 01 00 00    	call   QWORD PTR [rax+0x170]
  f37197:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
  f3719c:	48 8d b4 24 18 02 00 	lea    rsi,[rsp+0x218]
  f371a3:	00
  f371a4:	e8 c1 36 00 00       	call   f3a86a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101c80>
  f371a9:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
  f371b0:	00
  f371b1:	49 83 c6 10          	add    r14,0x10
  f371b5:	4c 89 f6             	mov    rsi,r14
  f371b8:	e8 9d 4c d5 ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  f371bd:	4c 8d a4 24 d8 00 00 	lea    r12,[rsp+0xd8]
  f371c4:	00
  f371c5:	48 8d b4 24 78 01 00 	lea    rsi,[rsp+0x178]
  f371cc:	00
  f371cd:	4c 89 e7             	mov    rdi,r12
  f371d0:	e8 3b 4e 73 00       	call   166c010 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2017c>
  f371d5:	48 83 7c 24 10 00    	cmp    QWORD PTR [rsp+0x10],0x0
  f371db:	74 7d                	je     f3725a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfe670>
  f371dd:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
  f371e2:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  f371e7:	e8 40 17 00 00       	call   f3892c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xffd42>
  f371ec:	48 8b 6c 24 60       	mov    rbp,QWORD PTR [rsp+0x60]
  f371f1:	48 8d 7d 08          	lea    rdi,[rbp+0x8]
  f371f5:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  f371fa:	e8 37 79 ba ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  f371ff:	4c 8b 74 24 68       	mov    r14,QWORD PTR [rsp+0x68]
  f37204:	4d 85 f6             	test   r14,r14
  f37207:	74 5e                	je     f37267 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfe67d>
  f37209:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  f3720e:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
  f37213:	48 89 ac 24 70 02 00 	mov    QWORD PTR [rsp+0x270],rbp
  f3721a:	00
  f3721b:	4c 89 b4 24 78 02 00 	mov    QWORD PTR [rsp+0x278],r14
  f37222:	00
  f37223:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  f37228:	eb 53                	jmp    f3727d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfe693>
  f3722a:	49 83 c6 08          	add    r14,0x8
  f3722e:	4c 8d bc 24 70 02 00 	lea    r15,[rsp+0x270]
  f37235:	00
  f37236:	4c 89 ff             	mov    rdi,r15
  f37239:	4c 89 f6             	mov    rsi,r14
  f3723c:	e8 41 0d 00 00       	call   f37f82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xff398>
  f37241:	48 89 df             	mov    rdi,rbx
  f37244:	4c 89 fe             	mov    rsi,r15
  f37247:	e8 44 34 00 00       	call   f3a690 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101aa6>
  f3724c:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  f37250:	e8 31 72 b6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f37255:	e9 98 01 00 00       	jmp    f373f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfe808>
  f3725a:	0f 57 c0             	xorps  xmm0,xmm0
  f3725d:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  f37262:	e9 47 01 00 00       	jmp    f373ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfe7c4>
  f37267:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
  f3726c:	48 89 ac 24 70 02 00 	mov    QWORD PTR [rsp+0x270],rbp
  f37273:	00
  f37274:	48 83 a4 24 78 02 00 	and    QWORD PTR [rsp+0x278],0x0
  f3727b:	00 00
  f3727d:	4c 8d ac 24 80 02 00 	lea    r13,[rsp+0x280]
  f37284:	00
  f37285:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
  f3728a:	4c 89 ef             	mov    rdi,r13
  f3728d:	e8 5e 36 00 00       	call   f3a8f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101d06>
  f37292:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
  f37299:	00
  f3729a:	0f 10 84 24 c8 00 00 	movups xmm0,XMMWORD PTR [rsp+0xc8]
  f372a1:	00
  f372a2:	0f 11 84 24 d8 02 00 	movups XMMWORD PTR [rsp+0x2d8],xmm0
  f372a9:	00
  f372aa:	48 85 c0             	test   rax,rax
  f372ad:	74 05                	je     f372b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfe6ca>
  f372af:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  f372b4:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
  f372bb:	00
  f372bc:	4c 89 e6             	mov    rsi,r12
  f372bf:	e8 4c 4d 73 00       	call   166c010 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2017c>
  f372c4:	bf 28 01 00 00       	mov    edi,0x128
  f372c9:	e8 32 6c 8b 00       	call   17edf00 <_Znwm@plt>
  f372ce:	49 89 c4             	mov    r12,rax
  f372d1:	4c 8d bc 24 d8 02 00 	lea    r15,[rsp+0x2d8]
  f372d8:	00
  f372d9:	49 8b 47 98          	mov    rax,QWORD PTR [r15-0x68]
  f372dd:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  f372e2:	49 8b 47 a0          	mov    rax,QWORD PTR [r15-0x60]
  f372e6:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  f372eb:	48 85 c0             	test   rax,rax
  f372ee:	74 05                	je     f372f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfe70b>
  f372f0:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  f372f5:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
  f372fa:	4c 89 ee             	mov    rsi,r13
  f372fd:	e8 68 35 00 00       	call   f3a86a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101c80>
  f37302:	4c 8d ac 24 70 02 00 	lea    r13,[rsp+0x270]
  f37309:	00
  f3730a:	41 0f 10 45 68       	movups xmm0,XMMWORD PTR [r13+0x68]
  f3730f:	41 0f 11 44 24 78    	movups XMMWORD PTR [r12+0x78],xmm0
  f37315:	0f 57 c0             	xorps  xmm0,xmm0
  f37318:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
  f3731c:	4c 89 e7             	mov    rdi,r12
  f3731f:	48 81 c7 88 00 00 00 	add    rdi,0x88
  f37326:	48 8d b4 24 e8 02 00 	lea    rsi,[rsp+0x2e8]
  f3732d:	00
  f3732e:	e8 4b 4b 73 00       	call   166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
  f37333:	48 8d 05 34 36 00 00 	lea    rax,[rip+0x3634]        # f3a96e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101d84>
  f3733a:	49 89 04 24          	mov    QWORD PTR [r12],rax
  f3733e:	48 8d 05 71 3a 00 00 	lea    rax,[rip+0x3a71]        # f3adb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1021cc>
  f37345:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
```
### AP `0x183ea98` +0x28 -> `0xf9ca6a` score 17

```text
  f9ca6a:	55                   	push   rbp
  f9ca6b:	41 57                	push   r15
  f9ca6d:	41 56                	push   r14
  f9ca6f:	41 55                	push   r13
  f9ca71:	41 54                	push   r12
  f9ca73:	53                   	push   rbx
  f9ca74:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  f9ca7b:	49 89 d4             	mov    r12,rdx
  f9ca7e:	49 89 f6             	mov    r14,rsi
  f9ca81:	48 89 fb             	mov    rbx,rdi
  f9ca84:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f9ca8b:	00 00
  f9ca8d:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  f9ca94:	00
  f9ca95:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
  f9ca99:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  f9ca9c:	4c 8d bc 24 50 02 00 	lea    r15,[rsp+0x250]
  f9caa3:	00
  f9caa4:	4c 89 ff             	mov    rdi,r15
  f9caa7:	ff 10                	call   QWORD PTR [rax]
  f9caa9:	41 8a af f0 00 00 00 	mov    bpl,BYTE PTR [r15+0xf0]
  f9cab0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  f9cab4:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
  f9cabb:	00
  f9cabc:	4c 89 e6             	mov    rsi,r12
  f9cabf:	ff 10                	call   QWORD PTR [rax]
  f9cac1:	4d 8d 7e 08          	lea    r15,[r14+0x8]
  f9cac5:	40 84 ed             	test   bpl,bpl
  f9cac8:	40 0f 95 c5          	setne  bpl
  f9cacc:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
  f9cad3:	00
  f9cad4:	80 bf f0 00 00 00 00 	cmp    BYTE PTR [rdi+0xf0],0x0
  f9cadb:	41 0f 95 c5          	setne  r13b
  f9cadf:	e8 9c 88 f6 ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
  f9cae4:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  f9caeb:	00
  f9caec:	e8 8f 88 f6 ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
  f9caf1:	44 38 ed             	cmp    bpl,r13b
  f9caf4:	74 12                	je     f9cb08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163f1e>
  f9caf6:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  f9cafb:	4c 89 fe             	mov    rsi,r15
  f9cafe:	e8 b5 d2 ff ff       	call   f99db8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1611ce>
  f9cb03:	e9 43 02 00 00       	jmp    f9cd4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164161>
  f9cb08:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  f9cb0f:	00
  f9cb10:	4c 89 e6             	mov    rsi,r12
  f9cb13:	e8 36 08 00 00       	call   f9d34e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164764>
  f9cb18:	49 8b 76 20          	mov    rsi,QWORD PTR [r14+0x20]
  f9cb1c:	4d 8b 66 28          	mov    r12,QWORD PTR [r14+0x28]
  f9cb20:	4d 85 e4             	test   r12,r12
  f9cb23:	74 06                	je     f9cb2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163f41>
  f9cb25:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
  f9cb2b:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  f9cb32:	00
  f9cb33:	e8 16 08 00 00       	call   f9d34e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164764>
  f9cb38:	4c 89 e7             	mov    rdi,r12
  f9cb3b:	e8 46 19 b0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f9cb40:	44 8a ac 24 18 01 00 	mov    r13b,BYTE PTR [rsp+0x118]
  f9cb47:	00
  f9cb48:	40 8a ac 24 c8 00 00 	mov    bpl,BYTE PTR [rsp+0xc8]
  f9cb4f:	00
  f9cb50:	45 84 ed             	test   r13b,r13b
  f9cb53:	74 33                	je     f9cb88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163f9e>
  f9cb55:	40 84 ed             	test   bpl,bpl
  f9cb58:	74 6a                	je     f9cbc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163fda>
  f9cb5a:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  f9cb61:	00
  f9cb62:	e8 ee 6e f6 ff       	call   f03a55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcae6b>
  f9cb67:	49 89 c4             	mov    r12,rax
  f9cb6a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  f9cb71:	00
  f9cb72:	e8 de 6e f6 ff       	call   f03a55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcae6b>
  f9cb77:	4c 89 e7             	mov    rdi,r12
  f9cb7a:	48 89 c6             	mov    rsi,rax
  f9cb7d:	e8 6c 2b b0 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
  f9cb82:	84 c0                	test   al,al
  f9cb84:	75 4a                	jne    f9cbd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163fe6>
  f9cb86:	eb 5c                	jmp    f9cbe4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163ffa>
  f9cb88:	40 84 ed             	test   bpl,bpl
  f9cb8b:	74 3e                	je     f9cbcb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163fe1>
  f9cb8d:	4c 89 f7             	mov    rdi,r14
  f9cb90:	e8 e7 08 00 00       	call   f9d47c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164892>
  f9cb95:	41 80 be 9d 01 00 00 	cmp    BYTE PTR [r14+0x19d],0x0
  f9cb9c:	00
  f9cb9d:	0f 95 c1             	setne  cl
  f9cba0:	84 c8                	test   al,cl
  f9cba2:	0f 84 4e 01 00 00    	je     f9ccf6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16410c>
  f9cba8:	44 8a ac 24 18 01 00 	mov    r13b,BYTE PTR [rsp+0x118]
  f9cbaf:	00
  f9cbb0:	40 8a ac 24 c8 00 00 	mov    bpl,BYTE PTR [rsp+0xc8]
  f9cbb7:	00
  f9cbb8:	45 84 ed             	test   r13b,r13b
  f9cbbb:	74 13                	je     f9cbd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163fe6>
  f9cbbd:	40 84 ed             	test   bpl,bpl
  f9cbc0:	75 98                	jne    f9cb5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163f70>
  f9cbc2:	eb 0c                	jmp    f9cbd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163fe6>
  f9cbc4:	41 b5 01             	mov    r13b,0x1
  f9cbc7:	31 ed                	xor    ebp,ebp
  f9cbc9:	eb 05                	jmp    f9cbd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163fe6>
  f9cbcb:	31 ed                	xor    ebp,ebp
  f9cbcd:	45 31 ed             	xor    r13d,r13d
  f9cbd0:	45 84 ed             	test   r13b,r13b
  f9cbd3:	0f 95 c0             	setne  al
  f9cbd6:	40 84 ed             	test   bpl,bpl
  f9cbd9:	0f 94 c1             	sete   cl
  f9cbdc:	30 c1                	xor    cl,al
  f9cbde:	0f 85 40 01 00 00    	jne    f9cd24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16413a>
  f9cbe4:	49 83 be 90 00 00 00 	cmp    QWORD PTR [r14+0x90],0x0
  f9cbeb:	00
  f9cbec:	0f 84 32 01 00 00    	je     f9cd24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16413a>
  f9cbf2:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  f9cbf6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  f9cbf9:	ff 50 20             	call   QWORD PTR [rax+0x20]
  f9cbfc:	84 c0                	test   al,al
  f9cbfe:	0f 85 20 01 00 00    	jne    f9cd24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16413a>
  f9cc04:	41 80 be 88 01 00 00 	cmp    BYTE PTR [r14+0x188],0x0
  f9cc0b:	00
  f9cc0c:	0f 85 12 01 00 00    	jne    f9cd24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16413a>
  f9cc12:	49 8b 06             	mov    rax,QWORD PTR [r14]
  f9cc15:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  f9cc1c:	00
  f9cc1d:	4c 89 f6             	mov    rsi,r14
  f9cc20:	ff 10                	call   QWORD PTR [rax]
  f9cc22:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  f9cc29:	00
  f9cc2a:	40 8a af f0 00 00 00 	mov    bpl,BYTE PTR [rdi+0xf0]
  f9cc31:	e8 4a 87 f6 ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
  f9cc36:	49 83 c6 10          	add    r14,0x10
  f9cc3a:	40 84 ed             	test   bpl,bpl
  f9cc3d:	0f 84 c8 04 00 00    	je     f9d10b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164521>
  f9cc43:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  f9cc48:	4c 89 f6             	mov    rsi,r14
  f9cc4b:	e8 0a f2 ce ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  f9cc50:	0f 57 c0             	xorps  xmm0,xmm0
  f9cc53:	4c 8d b4 24 20 01 00 	lea    r14,[rsp+0x120]
  f9cc5a:	00
  f9cc5b:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
  f9cc5f:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  f9cc64:	4c 8d a4 24 50 02 00 	lea    r12,[rsp+0x250]
  f9cc6b:	00
  f9cc6c:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
  f9cc71:	4c 89 e7             	mov    rdi,r12
  f9cc74:	4c 89 fe             	mov    rsi,r15
  f9cc77:	4c 89 f2             	mov    rdx,r14
  f9cc7a:	e8 db 83 f8 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  f9cc7f:	48 8d 05 d2 5c a5 00 	lea    rax,[rip+0xa55cd2]        # 19f2958 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xa17>
  f9cc86:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  f9cc8a:	48 8d 6c 24 50       	lea    rbp,[rsp+0x50]
  f9cc8f:	b9 d9 00 00 00       	mov    ecx,0xd9
  f9cc94:	48 89 ef             	mov    rdi,rbp
  f9cc97:	4c 89 e6             	mov    rsi,r12
  f9cc9a:	31 d2                	xor    edx,edx
  f9cc9c:	45 31 c0             	xor    r8d,r8d
  f9cc9f:	45 31 c9             	xor    r9d,r9d
  f9cca2:	e8 df 0b 00 00       	call   f9d886 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164c9c>
  f9cca7:	4c 8d 6c 24 70       	lea    r13,[rsp+0x70]
  f9ccac:	4c 89 ef             	mov    rdi,r13
  f9ccaf:	48 89 ee             	mov    rsi,rbp
  f9ccb2:	e8 03 8e f7 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  f9ccb7:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
```
### AP `0x1840e00` +0x28 -> `0xfc14bc` score 17

```text
  fc14bc:	55                   	push   rbp
  fc14bd:	41 57                	push   r15
  fc14bf:	41 56                	push   r14
  fc14c1:	41 55                	push   r13
  fc14c3:	41 54                	push   r12
  fc14c5:	53                   	push   rbx
  fc14c6:	48 81 ec b8 07 00 00 	sub    rsp,0x7b8
  fc14cd:	49 89 cf             	mov    r15,rcx
  fc14d0:	49 89 d4             	mov    r12,rdx
  fc14d3:	49 89 f5             	mov    r13,rsi
  fc14d6:	49 89 fe             	mov    r14,rdi
  fc14d9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fc14e0:	00 00
  fc14e2:	48 89 84 24 b0 07 00 	mov    QWORD PTR [rsp+0x7b0],rax
  fc14e9:	00
  fc14ea:	48 8d 35 8c a9 36 ff 	lea    rsi,[rip+0xffffffffff36a98c]        # 32be7d <_ZTSSt12bad_any_cast@@Base-0x6434b>
  fc14f1:	48 89 d7             	mov    rdi,rdx
  fc14f4:	e8 56 a3 ab ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  fc14f9:	84 c0                	test   al,al
  fc14fb:	0f 84 9d 04 00 00    	je     fc199e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x188db4>
  fc1501:	49 8b 7d 20          	mov    rdi,QWORD PTR [r13+0x20]
  fc1505:	e8 5c 1f 00 00       	call   fc3466 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a87c>
  fc150a:	84 c0                	test   al,al
  fc150c:	0f 84 8c 04 00 00    	je     fc199e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x188db4>
  fc1512:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
  fc1517:	49 8b 75 20          	mov    rsi,QWORD PTR [r13+0x20]
  fc151b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fc151e:	4c 8d b4 24 68 02 00 	lea    r14,[rsp+0x268]
  fc1525:	00
  fc1526:	4c 89 f7             	mov    rdi,r14
  fc1529:	ff 10                	call   QWORD PTR [rax]
  fc152b:	41 80 be f0 00 00 00 	cmp    BYTE PTR [r14+0xf0],0x0
  fc1532:	00
  fc1533:	0f 84 9b 04 00 00    	je     fc19d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x188dea>
  fc1539:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  fc153e:	48 8d b4 24 68 02 00 	lea    rsi,[rsp+0x268]
  fc1545:	00
  fc1546:	e8 f5 c9 82 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  fc154b:	41 0f 10 47 58       	movups xmm0,XMMWORD PTR [r15+0x58]
  fc1550:	0f 29 84 24 50 02 00 	movaps XMMWORD PTR [rsp+0x250],xmm0
  fc1557:	00
  fc1558:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  fc155f:	00
  fc1560:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
  fc1565:	e8 d6 c9 82 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  fc156a:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
  fc1571:	00
  fc1572:	48 8d b4 24 68 02 00 	lea    rsi,[rsp+0x268]
  fc1579:	00
  fc157a:	e8 45 66 f5 ff       	call   f17bc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdefda>
  fc157f:	8a 84 24 58 02 00 00 	mov    al,BYTE PTR [rsp+0x258]
  fc1586:	88 84 24 48 02 00 00 	mov    BYTE PTR [rsp+0x248],al
  fc158d:	48 8b 84 24 50 02 00 	mov    rax,QWORD PTR [rsp+0x250]
  fc1594:	00
  fc1595:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
  fc159c:	00
  fc159d:	49 83 c5 10          	add    r13,0x10
  fc15a1:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  fc15a6:	4c 89 ee             	mov    rsi,r13
  fc15a9:	e8 ac a8 cc ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fc15ae:	0f 57 c0             	xorps  xmm0,xmm0
  fc15b1:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
  fc15b6:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
  fc15b9:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
  fc15be:	4c 8d 74 24 78       	lea    r14,[rsp+0x78]
  fc15c3:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
  fc15c8:	4c 89 f7             	mov    rdi,r14
  fc15cb:	e8 8a 3a f6 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  fc15d0:	4c 8d ac 24 b0 00 00 	lea    r13,[rsp+0xb0]
  fc15d7:	00
  fc15d8:	6a 01                	push   0x1
  fc15da:	5a                   	pop    rdx
  fc15db:	4c 89 ef             	mov    rdi,r13
  fc15de:	4c 89 f6             	mov    rsi,r14
  fc15e1:	e8 e0 0f 00 00       	call   fc25c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1899dc>
  fc15e6:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
  fc15ea:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  fc15f1:	00
  fc15f2:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
  fc15f9:	00
  fc15fa:	e8 41 c9 82 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  fc15ff:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  fc1606:	00
  fc1607:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  fc160b:	48 89 84 24 70 03 00 	mov    QWORD PTR [rsp+0x370],rax
  fc1612:	00
  fc1613:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
  fc1616:	0f 29 84 24 60 03 00 	movaps XMMWORD PTR [rsp+0x360],xmm0
  fc161d:	00
  fc161e:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
  fc1623:	0f 57 c0             	xorps  xmm0,xmm0
  fc1626:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  fc1629:	0f 11 84 24 78 03 00 	movups XMMWORD PTR [rsp+0x378],xmm0
  fc1630:	00
  fc1631:	0f 11 84 24 88 03 00 	movups XMMWORD PTR [rsp+0x388],xmm0
  fc1638:	00
  fc1639:	0f 11 84 24 98 03 00 	movups XMMWORD PTR [rsp+0x398],xmm0
  fc1640:	00
  fc1641:	e8 4a c8 82 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fc1646:	49 8d 75 30          	lea    rsi,[r13+0x30]
  fc164a:	0f 28 84 24 60 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x360]
  fc1651:	00
  fc1652:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
  fc1659:	00
  fc165a:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
  fc165d:	48 8b 84 24 70 03 00 	mov    rax,QWORD PTR [rsp+0x370]
  fc1664:	00
  fc1665:	48 83 a4 24 70 03 00 	and    QWORD PTR [rsp+0x370],0x0
  fc166c:	00 00
  fc166e:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
  fc1672:	0f 57 c9             	xorps  xmm1,xmm1
  fc1675:	0f 29 8c 24 60 03 00 	movaps XMMWORD PTR [rsp+0x360],xmm1
  fc167c:	00
  fc167d:	0f 10 84 24 78 03 00 	movups xmm0,XMMWORD PTR [rsp+0x378]
  fc1684:	00
  fc1685:	0f 11 42 18          	movups XMMWORD PTR [rdx+0x18],xmm0
  fc1689:	0f 10 84 24 88 03 00 	movups xmm0,XMMWORD PTR [rsp+0x388]
  fc1690:	00
  fc1691:	48 83 a4 24 88 03 00 	and    QWORD PTR [rsp+0x388],0x0
  fc1698:	00 00
  fc169a:	0f 11 42 28          	movups XMMWORD PTR [rdx+0x28],xmm0
  fc169e:	0f 11 8c 24 78 03 00 	movups XMMWORD PTR [rsp+0x378],xmm1
  fc16a5:	00
  fc16a6:	0f 10 84 24 98 03 00 	movups xmm0,XMMWORD PTR [rsp+0x398]
  fc16ad:	00
  fc16ae:	0f 11 42 38          	movups XMMWORD PTR [rdx+0x38],xmm0
  fc16b2:	0f 29 8c 24 90 03 00 	movaps XMMWORD PTR [rsp+0x390],xmm1
  fc16b9:	00
  fc16ba:	48 83 a4 24 a0 03 00 	and    QWORD PTR [rsp+0x3a0],0x0
  fc16c1:	00 00
  fc16c3:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
  fc16ca:	00
  fc16cb:	e8 0e dc 01 00       	call   fdf2de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66f4>
  fc16d0:	49 8d 7d 58          	lea    rdi,[r13+0x58]
  fc16d4:	4c 8d b4 24 80 05 00 	lea    r14,[rsp+0x580]
  fc16db:	00
  fc16dc:	4c 89 f6             	mov    rsi,r14
  fc16df:	e8 8e ff f8 ff       	call   f51672 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118a88>
  fc16e4:	4c 89 f7             	mov    rdi,r14
  fc16e7:	e8 a2 3c f4 ff       	call   f0538e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc7a4>
  fc16ec:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  fc16f3:	00
  fc16f4:	e8 95 cc 0e 00       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
  fc16f9:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
  fc1700:	00
  fc1701:	49 8d bd a0 00 00 00 	lea    rdi,[r13+0xa0]
  fc1708:	e8 73 c9 82 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  fc170d:	49 8d bd 28 01 00 00 	lea    rdi,[r13+0x128]
  fc1714:	48 8d 35 8d b3 47 ff 	lea    rsi,[rip+0xffffffffff47b38d]        # 43caa8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x26b4>
  fc171b:	e8 98 60 f0 ff       	call   ec77b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ebce>
  fc1720:	48 8d 35 f9 04 49 ff 	lea    rsi,[rip+0xffffffffff4904f9]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
  fc1727:	48 89 c7             	mov    rdi,rax
  fc172a:	e8 51 c8 82 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
  fc172f:	48 8d 84 24 40 02 00 	lea    rax,[rsp+0x240]
  fc1736:	00
  fc1737:	8a 48 08             	mov    cl,BYTE PTR [rax+0x8]
  fc173a:	41 88 8d 60 01 00 00 	mov    BYTE PTR [r13+0x160],cl
  fc1741:	48 8b 00             	mov    rax,QWORD PTR [rax]
  fc1744:	49 89 85 58 01 00 00 	mov    QWORD PTR [r13+0x158],rax
  fc174b:	41 c6 85 50 01 00 00 	mov    BYTE PTR [r13+0x150],0x1
```
### AP `0x1849578` +0x28 -> `0x1076606` score 17

```text
 1076606:	55                   	push   rbp
 1076607:	41 57                	push   r15
 1076609:	41 56                	push   r14
 107660b:	41 55                	push   r13
 107660d:	41 54                	push   r12
 107660f:	53                   	push   rbx
 1076610:	48 81 ec 98 03 00 00 	sub    rsp,0x398
 1076617:	49 89 ce             	mov    r14,rcx
 107661a:	48 89 d3             	mov    rbx,rdx
 107661d:	49 89 fc             	mov    r12,rdi
 1076620:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1076627:	00 00
 1076629:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
 1076630:	00
 1076631:	48 89 cf             	mov    rdi,rcx
 1076634:	e8 6b b2 b9 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
 1076639:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 1076640:	00
 1076641:	4c 89 f7             	mov    rdi,r14
 1076644:	e8 4b 19 b1 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
 1076649:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
 1076650:	00
 1076651:	4c 89 f7             	mov    rdi,r14
 1076654:	e8 47 cc ae ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
 1076659:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 107665e:	4c 89 f7             	mov    rdi,r14
 1076661:	e8 3e b1 b9 ff       	call   c117a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e744>
 1076666:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 107666b:	4c 89 f7             	mov    rdi,r14
 107666e:	e8 b3 b0 b9 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
 1076673:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 107667a:	00
 107667b:	4c 89 f7             	mov    rdi,r14
 107667e:	e8 a1 b1 b9 ff       	call   c11824 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7c4>
 1076683:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 107668a:	00
 107668b:	4c 89 f7             	mov    rdi,r14
 107668e:	e8 09 b3 d6 ff       	call   de199c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaea22>
 1076693:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
 1076698:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 107669c:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
 10766a0:	ba 8c 00 00 00       	mov    edx,0x8c
 10766a5:	e8 34 bc ae ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 10766aa:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10766ad:	48 8b 80 60 04 00 00 	mov    rax,QWORD PTR [rax+0x460]
 10766b4:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
 10766b9:	48 85 c0             	test   rax,rax
 10766bc:	0f 84 92 0d 00 00    	je     1077454 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23e86a>
 10766c2:	4c 89 f7             	mov    rdi,r14
 10766c5:	e8 4a 19 b1 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
 10766ca:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 10766cf:	4c 89 f7             	mov    rdi,r14
 10766d2:	e8 b7 05 c4 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
 10766d7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 10766dc:	4c 89 f7             	mov    rdi,r14
 10766df:	e8 6c b0 b9 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
 10766e4:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 10766eb:	00
 10766ec:	4c 89 f7             	mov    rdi,r14
 10766ef:	e8 da b0 b9 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
 10766f4:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10766f9:	4c 89 f7             	mov    rdi,r14
 10766fc:	e8 4f 84 ff ff       	call   106eb50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235f66>
 1076701:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 1076706:	4c 89 f7             	mov    rdi,r14
 1076709:	e8 ac 0f 00 00       	call   10776ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23ead0>
 107670e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 1076713:	4c 89 f7             	mov    rdi,r14
 1076716:	e8 df b0 b9 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
 107671b:	49 89 c5             	mov    r13,rax
 107671e:	4c 89 f7             	mov    rdi,r14
 1076721:	e8 c0 0f 00 00       	call   10776e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23eafc>
 1076726:	48 89 c5             	mov    rbp,rax
 1076729:	4c 89 f7             	mov    rdi,r14
 107672c:	e8 4b 84 ff ff       	call   106eb7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235f92>
 1076731:	49 89 c7             	mov    r15,rax
 1076734:	4c 89 f7             	mov    rdi,r14
 1076737:	e8 14 b1 b9 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
 107673c:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
 1076743:	00
 1076744:	4c 89 f7             	mov    rdi,r14
 1076747:	e8 84 84 ff ff       	call   106ebd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235fe6>
 107674c:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 1076751:	4c 89 f7             	mov    rdi,r14
 1076754:	e8 4d 84 ff ff       	call   106eba6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235fbc>
 1076759:	49 89 c6             	mov    r14,rax
 107675c:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
 1076760:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 1076765:	48 8b 73 58          	mov    rsi,QWORD PTR [rbx+0x58]
 1076769:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 107676c:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
 1076773:	00
 1076774:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1076777:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
 107677e:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
 1076785:	00
 1076786:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 107678a:	4c 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r13
 1076791:	00
 1076792:	4c 89 ef             	mov    rdi,r13
 1076795:	ff 50 30             	call   QWORD PTR [rax+0x30]
 1076798:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
 107679f:	00
 10767a0:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
 10767a4:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
 10767a8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10767ad:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10767b1:	48 89 ef             	mov    rdi,rbp
 10767b4:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10767b7:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
 10767be:	00
 10767bf:	48 89 9c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rbx
 10767c6:	00
 10767c7:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10767ca:	4c 89 ff             	mov    rdi,r15
 10767cd:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10767d0:	48 89 c5             	mov    rbp,rax
 10767d3:	48 8b 9c 24 c0 00 00 	mov    rbx,QWORD PTR [rsp+0xc0]
 10767da:	00
 10767db:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10767de:	48 89 df             	mov    rdi,rbx
 10767e1:	ff 50 68             	call   QWORD PTR [rax+0x68]
 10767e4:	49 89 c7             	mov    r15,rax
 10767e7:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10767ea:	4c 89 f7             	mov    rdi,r14
 10767ed:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10767f0:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
 10767f7:	00
 10767f8:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10767fb:	4c 89 f7             	mov    rdi,r14
 10767fe:	ff 50 40             	call   QWORD PTR [rax+0x40]
 1076801:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
 1076808:	00
 1076809:	6a 28                	push   0x28
 107680b:	5f                   	pop    rdi
 107680c:	e8 ef 76 77 00       	call   17edf00 <_Znwm@plt>
 1076811:	49 89 c6             	mov    r14,rax
 1076814:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1076819:	48 8b 80 0c 01 00 00 	mov    rax,QWORD PTR [rax+0x10c]
 1076820:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
 1076827:	00
 1076828:	48 8d 35 4c c5 2d ff 	lea    rsi,[rip+0xffffffffff2dc54c]        # 352d7b <_ZTSSt12bad_any_cast@@Base-0x3d44d>
 107682f:	48 8d bc 24 a8 01 00 	lea    rdi,[rsp+0x1a8]
 1076836:	00
 1076837:	4c 89 b4 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r14
 107683e:	00
 107683f:	e8 3a 32 a0 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1076844:	41 c6 46 08 00       	mov    BYTE PTR [r14+0x8],0x0
 1076849:	48 8d 05 68 2d 7d 00 	lea    rax,[rip+0x7d2d68]        # 18495b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5ca0>
 1076850:	49 89 06             	mov    QWORD PTR [r14],rax
 1076853:	4c 89 f0             	mov    rax,r14
 1076856:	48 83 c0 20          	add    rax,0x20
 107685a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 107685f:	66 0f ef c0          	pxor   xmm0,xmm0
 1076863:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
 1076869:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
 107686e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1076871:	48 89 df             	mov    rdi,rbx
 1076874:	ff 50 48             	call   QWORD PTR [rax+0x48]
 1076877:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
```
### AP `0x185a918` +0x28 -> `0x11d4aba` score 17

```text
 11d4aba:	55                   	push   rbp
 11d4abb:	41 57                	push   r15
 11d4abd:	41 56                	push   r14
 11d4abf:	41 55                	push   r13
 11d4ac1:	41 54                	push   r12
 11d4ac3:	53                   	push   rbx
 11d4ac4:	48 83 ec 58          	sub    rsp,0x58
 11d4ac8:	48 89 fb             	mov    rbx,rdi
 11d4acb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11d4ad2:	00 00
 11d4ad4:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 11d4ad9:	48 8d 05 60 5e 68 00 	lea    rax,[rip+0x685e60]        # 185a940 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17028>
 11d4ae0:	48 89 07             	mov    QWORD PTR [rdi],rax
 11d4ae3:	48 81 c7 48 04 00 00 	add    rdi,0x448
 11d4aea:	e8 37 9e 8d ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
 11d4aef:	48 8b bb c8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3c8]
 11d4af6:	48 85 ff             	test   rdi,rdi
 11d4af9:	74 0d                	je     11d4b08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a08c>
 11d4afb:	48 8d b3 d0 03 00 00 	lea    rsi,[rbx+0x3d0]
 11d4b02:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11d4b05:	ff 50 18             	call   QWORD PTR [rax+0x18]
 11d4b08:	48 8b bb e0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe0]
 11d4b0f:	48 85 ff             	test   rdi,rdi
 11d4b12:	74 05                	je     11d4b19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a09d>
 11d4b14:	e8 45 c6 ff ff       	call   11d115e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166e2>
 11d4b19:	4c 8d bb 90 03 00 00 	lea    r15,[rbx+0x390]
 11d4b20:	48 83 bb a8 03 00 00 	cmp    QWORD PTR [rbx+0x3a8],0x0
 11d4b27:	00
 11d4b28:	74 3a                	je     11d4b64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0e8>
 11d4b2a:	48 8b bb a0 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3a0]
 11d4b31:	e8 28 b3 ff ff       	call   11cfe5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x153e2>
 11d4b36:	48 83 a3 a0 03 00 00 	and    QWORD PTR [rbx+0x3a0],0x0
 11d4b3d:	00
 11d4b3e:	48 8b 83 98 03 00 00 	mov    rax,QWORD PTR [rbx+0x398]
 11d4b45:	48 85 c0             	test   rax,rax
 11d4b48:	74 12                	je     11d4b5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0e0>
 11d4b4a:	31 c9                	xor    ecx,ecx
 11d4b4c:	49 8b 17             	mov    rdx,QWORD PTR [r15]
 11d4b4f:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
 11d4b54:	48 ff c1             	inc    rcx
 11d4b57:	48 39 c8             	cmp    rax,rcx
 11d4b5a:	75 f0                	jne    11d4b4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0d0>
 11d4b5c:	48 83 a3 a8 03 00 00 	and    QWORD PTR [rbx+0x3a8],0x0
 11d4b63:	00
 11d4b64:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]
 11d4b6b:	48 85 ff             	test   rdi,rdi
 11d4b6e:	74 05                	je     11d4b75 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0f9>
 11d4b70:	e8 fd b4 00 00       	call   11e0072 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255f6>
 11d4b75:	4c 8d ab e0 00 00 00 	lea    r13,[rbx+0xe0]
 11d4b7c:	4c 89 ef             	mov    rdi,r13
 11d4b7f:	31 f6                	xor    esi,esi
 11d4b81:	e8 04 9e ff ff       	call   11ce98a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13f0e>
 11d4b86:	48 8b 83 a8 01 00 00 	mov    rax,QWORD PTR [rbx+0x1a8]
 11d4b8d:	48 8b 00             	mov    rax,QWORD PTR [rax]
 11d4b90:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
 11d4b94:	0f 57 c0             	xorps  xmm0,xmm0
 11d4b97:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
 11d4b9b:	e8 e6 98 8c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11d4ba0:	48 8b 83 e8 02 00 00 	mov    rax,QWORD PTR [rbx+0x2e8]
 11d4ba7:	48 8b 00             	mov    rax,QWORD PTR [rax]
 11d4baa:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
 11d4bae:	0f 57 c0             	xorps  xmm0,xmm0
 11d4bb1:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 11d4bb5:	e8 cc 98 8c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11d4bba:	48 83 bb b8 01 00 00 	cmp    QWORD PTR [rbx+0x1b8],0x0
 11d4bc1:	00
 11d4bc2:	74 53                	je     11d4c17 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a19b>
 11d4bc4:	4c 8d b3 38 01 00 00 	lea    r14,[rbx+0x138]
 11d4bcb:	4c 89 f7             	mov    rdi,r14
 11d4bce:	e8 1d 95 61 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
 11d4bd3:	4c 8d a3 f8 00 00 00 	lea    r12,[rbx+0xf8]
 11d4bda:	48 8b bb f8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xf8]
 11d4be1:	e8 c6 0c 99 ff       	call   b658ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb284c>
 11d4be6:	4c 89 a3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r12
 11d4bed:	0f 57 c0             	xorps  xmm0,xmm0
 11d4bf0:	0f 11 83 f8 00 00 00 	movups XMMWORD PTR [rbx+0xf8],xmm0
 11d4bf7:	48 8d bb 08 01 00 00 	lea    rdi,[rbx+0x108]
 11d4bfe:	e8 6d 29 8e ff       	call   ab7570 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4510>
 11d4c03:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 11d4c0a:	e8 4f a9 a1 ff       	call   bef55e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13c4fe>
 11d4c0f:	4c 89 f7             	mov    rdi,r14
 11d4c12:	e8 e9 94 61 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>
 11d4c17:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 11d4c1b:	48 8b 83 a0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1a0]
 11d4c22:	48 83 a3 a0 01 00 00 	and    QWORD PTR [rbx+0x1a0],0x0
 11d4c29:	00
 11d4c2a:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
 11d4c30:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 11d4c35:	48 89 06             	mov    QWORD PTR [rsi],rax
 11d4c38:	48 8d 05 6f 0b 00 00 	lea    rax,[rip+0xb6f]        # 11d57ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad32>
 11d4c3f:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
 11d4c43:	48 8d 05 86 0b 00 00 	lea    rax,[rip+0xb86]        # 11d57d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad54>
 11d4c4a:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 11d4c4e:	4c 8d 25 c3 cf 27 ff 	lea    r12,[rip+0xffffffffff27cfc3]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 11d4c55:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
 11d4c5a:	4c 89 22             	mov    QWORD PTR [rdx],r12
 11d4c5d:	4c 89 62 08          	mov    QWORD PTR [rdx+0x8],r12
 11d4c61:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
 11d4c66:	e8 ac a1 47 00       	call   164ee17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f83>
 11d4c6b:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
 11d4c70:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
 11d4c75:	4c 89 f7             	mov    rdi,r14
 11d4c78:	e8 21 26 8d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 11d4c7d:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 11d4c82:	e8 41 b1 ff ff       	call   11cfdc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1534c>
 11d4c87:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 11d4c8b:	48 8b 83 e0 02 00 00 	mov    rax,QWORD PTR [rbx+0x2e0]
 11d4c92:	48 83 a3 e0 02 00 00 	and    QWORD PTR [rbx+0x2e0],0x0
 11d4c99:	00
 11d4c9a:	49 89 06             	mov    QWORD PTR [r14],rax
 11d4c9d:	48 8d 05 de 7b f6 ff 	lea    rax,[rip+0xfffffffffff67bde]        # 113c882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x303c98>
 11d4ca4:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 11d4ca8:	48 8d 05 79 51 8a ff 	lea    rax,[rip+0xffffffffff8a5179]        # a79e28 <JNI_OnUnload@@Base+0x16f5>
 11d4caf:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 11d4cb3:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
 11d4cb8:	4c 89 22             	mov    QWORD PTR [rdx],r12
 11d4cbb:	4c 89 62 08          	mov    QWORD PTR [rdx+0x8],r12
 11d4cbf:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
 11d4cc4:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 11d4cc9:	e8 49 a1 47 00       	call   164ee17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f83>
 11d4cce:	48 8d ab b8 01 00 00 	lea    rbp,[rbx+0x1b8]
 11d4cd5:	4c 8d ab a8 01 00 00 	lea    r13,[rbx+0x1a8]
 11d4cdc:	4c 8d a3 e8 02 00 00 	lea    r12,[rbx+0x2e8]
 11d4ce3:	48 8d 83 a0 01 00 00 	lea    rax,[rbx+0x1a0]
 11d4cea:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 11d4cee:	4c 8d b3 e0 02 00 00 	lea    r14,[rbx+0x2e0]
 11d4cf5:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 11d4cfa:	e8 9f 25 8d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 11d4cff:	48 8d bb d0 04 00 00 	lea    rdi,[rbx+0x4d0]
 11d4d06:	e8 61 af ff ff       	call   11cfc6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x151f0>
 11d4d0b:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
 11d4d12:	e8 79 8a ff ff       	call   11cd790 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12d14>
 11d4d17:	48 8d bb b8 04 00 00 	lea    rdi,[rbx+0x4b8]
 11d4d1e:	e8 23 ca 5e 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
 11d4d23:	48 8d bb a8 04 00 00 	lea    rdi,[rbx+0x4a8]
 11d4d2a:	e8 17 ca 5e 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
 11d4d2f:	48 8b bb 70 04 00 00 	mov    rdi,QWORD PTR [rbx+0x470]
 11d4d36:	e8 4b 97 8c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11d4d3b:	48 8b bb 60 04 00 00 	mov    rdi,QWORD PTR [rbx+0x460]
 11d4d42:	e8 3f 97 8c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11d4d47:	48 8b bb 50 04 00 00 	mov    rdi,QWORD PTR [rbx+0x450]
 11d4d4e:	e8 33 97 8c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11d4d53:	48 8d bb d0 03 00 00 	lea    rdi,[rbx+0x3d0]
 11d4d5a:	e8 ff 3b 8f ff       	call   ac895e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x158fe>
 11d4d5f:	48 8d bb b8 03 00 00 	lea    rdi,[rbx+0x3b8]
 11d4d66:	e8 01 46 ff ff       	call   11c936c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe8f0>
 11d4d6b:	4c 89 ff             	mov    rdi,r15
 11d4d6e:	e8 1f af ff ff       	call   11cfc92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15216>
 11d4d73:	48 8b bb 88 03 00 00 	mov    rdi,QWORD PTR [rbx+0x388]
 11d4d7a:	e8 07 97 8c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11d4d7f:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
 11d4d86:	e8 3f 55 8a ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 11d4d8b:	48 8d bb 58 03 00 00 	lea    rdi,[rbx+0x358]
 11d4d92:	e8 23 52 ff ff       	call   11c9fba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf53e>
 11d4d97:	48 8d bb 18 03 00 00 	lea    rdi,[rbx+0x318]
 11d4d9e:	e8 ed 90 61 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11d4da3:	48 8d bb 00 03 00 00 	lea    rdi,[rbx+0x300]
 11d4daa:	e8 79 50 8a ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 11d4daf:	48 8d bb f8 02 00 00 	lea    rdi,[rbx+0x2f8]
 11d4db6:	e8 ad 88 ff ff       	call   11cd668 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12bec>
```
### AP `0x185c920` +0x28 -> `0x1212354` score 17

```text
 1212354:	53                   	push   rbx
 1212355:	48 89 fb             	mov    rbx,rdi
 1212358:	48 81 c7 b8 03 00 00 	add    rdi,0x3b8
 121235f:	e8 18 ce 95 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 1212364:	48 8d bb a8 03 00 00 	lea    rdi,[rbx+0x3a8]
 121236b:	e8 64 78 5c 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 1212370:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
 1212377:	e8 58 78 5c 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 121237c:	48 8b bb 78 03 00 00 	mov    rdi,QWORD PTR [rbx+0x378]
 1212383:	e8 fe c0 88 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1212388:	80 bb 68 03 00 00 00 	cmp    BYTE PTR [rbx+0x368],0x0
 121238f:	74 0c                	je     121239d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57921>
 1212391:	48 8d bb 30 02 00 00 	lea    rdi,[rbx+0x230]
 1212398:	e8 23 2f 00 00       	call   12152c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a844>
 121239d:	48 8d bb d8 01 00 00 	lea    rdi,[rbx+0x1d8]
 12123a4:	e8 bd 7a 5c 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 12123a9:	48 8b bb 48 01 00 00 	mov    rdi,QWORD PTR [rbx+0x148]
 12123b0:	e8 d1 c0 88 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 12123b5:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]
 12123bc:	e8 a9 7b 86 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 12123c1:	48 83 c3 38          	add    rbx,0x38
 12123c5:	48 89 df             	mov    rdi,rbx
 12123c8:	5b                   	pop    rbx
 12123c9:	e9 48 40 fe ff       	jmp    11f6416 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b99a>
 12123ce:	53                   	push   rbx
 12123cf:	48 89 fb             	mov    rbx,rdi
 12123d2:	e8 7d ff ff ff       	call   1212354 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x578d8>
 12123d7:	48 89 df             	mov    rdi,rbx
 12123da:	5b                   	pop    rbx
 12123db:	e9 40 bb 5d 00       	jmp    17edf20 <_ZdlPv@plt>
 12123e0:	55                   	push   rbp
 12123e1:	41 57                	push   r15
 12123e3:	41 56                	push   r14
 12123e5:	41 55                	push   r13
 12123e7:	41 54                	push   r12
 12123e9:	53                   	push   rbx
 12123ea:	48 81 ec d8 0c 00 00 	sub    rsp,0xcd8
 12123f1:	4c 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r8
 12123f8:	00
 12123f9:	48 89 cb             	mov    rbx,rcx
 12123fc:	48 89 54 24 20       	mov    QWORD PTR [rsp+0x20],rdx
 1212401:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
 1212406:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 121240d:	00 00
 121240f:	48 89 84 24 d0 0c 00 	mov    QWORD PTR [rsp+0xcd0],rax
 1212416:	00
 1212417:	c6 86 90 03 00 00 01 	mov    BYTE PTR [rsi+0x390],0x1
 121241e:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
 1212423:	48 8b 7e 68          	mov    rdi,QWORD PTR [rsi+0x68]
 1212427:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 121242a:	ff 50 30             	call   QWORD PTR [rax+0x30]
 121242d:	31 ed                	xor    ebp,ebp
 121242f:	4c 8d b4 24 88 01 00 	lea    r14,[rsp+0x188]
 1212436:	00
 1212437:	41 88 2e             	mov    BYTE PTR [r14],bpl
 121243a:	41 88 6e 60          	mov    BYTE PTR [r14+0x60],bpl
 121243e:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
 1212443:	4c 89 ff             	mov    rdi,r15
 1212446:	31 f6                	xor    esi,esi
 1212448:	4c 89 f2             	mov    rdx,r14
 121244b:	e8 7e f7 ff ff       	call   1211bce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57152>
 1212450:	4c 89 f7             	mov    rdi,r14
 1212453:	e8 20 57 ff ff       	call   1207b78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d0fc>
 1212458:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
 121245f:	00
 1212460:	4c 89 7f f8          	mov    QWORD PTR [rdi-0x8],r15
 1212464:	48 89 de             	mov    rsi,rbx
 1212467:	e8 1e 2b 00 00       	call   1214f8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a50e>
 121246c:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
 1212471:	41 38 ac 24 7d 06 00 	cmp    BYTE PTR [r12+0x67d],bpl
 1212478:	00
 1212479:	74 1f                	je     121249a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57a1e>
 121247b:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
 121247f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1212482:	ff 90 90 01 00 00    	call   QWORD PTR [rax+0x190]
 1212488:	84 c0                	test   al,al
 121248a:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
 121248f:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
 1212494:	0f 84 a7 00 00 00    	je     1212541 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57ac5>
 121249a:	49 8b 84 24 88 06 00 	mov    rax,QWORD PTR [r12+0x688]
 12124a1:	00
 12124a2:	49 3b 84 24 90 06 00 	cmp    rax,QWORD PTR [r12+0x690]
 12124a9:	00
 12124aa:	0f 84 3b 01 00 00    	je     12125eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57b6f>
 12124b0:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
 12124b4:	49 8b 74 24 1c       	mov    rsi,QWORD PTR [r12+0x1c]
 12124b9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12124bc:	ff 50 18             	call   QWORD PTR [rax+0x18]
 12124bf:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
 12124c3:	49 8d ac 24 a0 06 00 	lea    rbp,[r12+0x6a0]
 12124ca:	00
 12124cb:	49 8b b4 24 18 07 00 	mov    rsi,QWORD PTR [r12+0x718]
 12124d2:	00
 12124d3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12124d6:	ff 50 20             	call   QWORD PTR [rax+0x20]
 12124d9:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
 12124dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12124e0:	4c 89 e6             	mov    rsi,r12
 12124e3:	ff 50 18             	call   QWORD PTR [rax+0x18]
 12124e6:	41 80 bc 24 f0 06 00 	cmp    BYTE PTR [r12+0x6f0],0x0
 12124ed:	00 00
 12124ef:	0f 84 c0 02 00 00    	je     12127b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57d39>
 12124f5:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
 12124fa:	49 8b 9c 24 88 06 00 	mov    rbx,QWORD PTR [r12+0x688]
 1212501:	00
 1212502:	4d 8b bc 24 90 06 00 	mov    r15,QWORD PTR [r12+0x690]
 1212509:	00
 121250a:	49 89 dd             	mov    r13,rbx
 121250d:	4c 39 fb             	cmp    rbx,r15
 1212510:	0f 84 0b 02 00 00    	je     1212721 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57ca5>
 1212516:	49 89 de             	mov    r14,rbx
 1212519:	49 8d 7e 18          	lea    rdi,[r14+0x18]
 121251d:	48 89 ee             	mov    rsi,rbp
 1212520:	e8 c9 d1 88 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 1212525:	84 c0                	test   al,al
 1212527:	0f 85 df 01 00 00    	jne    121270c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57c90>
 121252d:	49 81 c6 d0 02 00 00 	add    r14,0x2d0
 1212534:	4d 39 fe             	cmp    r14,r15
 1212537:	75 e0                	jne    1212519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57a9d>
 1212539:	4d 89 fd             	mov    r13,r15
 121253c:	e9 e0 01 00 00       	jmp    1212721 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57ca5>
 1212541:	0f 10 05 18 7a 7d 00 	movups xmm0,XMMWORD PTR [rip+0x7d7a18]        # 19e9f60 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xb98>
 1212548:	4c 8d b4 24 30 03 00 	lea    r14,[rsp+0x330]
 121254f:	00
 1212550:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
 1212554:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
 121255b:	00
 121255c:	4c 89 f6             	mov    rsi,r14
 121255f:	e8 6e 2a 00 00       	call   1214fd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a556>
 1212564:	49 8b 5f 70          	mov    rbx,QWORD PTR [r15+0x70]
 1212568:	0f 10 05 f1 79 7d 00 	movups xmm0,XMMWORD PTR [rip+0x7d79f1]        # 19e9f60 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xb98>
 121256f:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
 1212573:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
 121257a:	00
 121257b:	4c 89 e6             	mov    rsi,r12
 121257e:	e8 bd b9 5d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1212583:	48 8d 84 24 78 03 00 	lea    rax,[rsp+0x378]
 121258a:	00
 121258b:	48 83 60 f0 00       	and    QWORD PTR [rax-0x10],0x0
 1212590:	0f 57 c0             	xorps  xmm0,xmm0
 1212593:	0f 11 40 e0          	movups XMMWORD PTR [rax-0x20],xmm0
 1212597:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 121259a:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 121259e:	66 83 60 10 00       	and    WORD PTR [rax+0x10],0x0
 12125a3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 12125a6:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
 12125ad:	00
 12125ae:	48 89 df             	mov    rdi,rbx
 12125b1:	ff 50 18             	call   QWORD PTR [rax+0x18]
 12125b4:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
 12125bb:	00
 12125bc:	e8 0d 6d fe ff       	call   11f92ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e852>
 12125c1:	48 8d 1d c8 79 7d 00 	lea    rbx,[rip+0x7d79c8]        # 19e9f90 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xbc8>
 12125c8:	4c 8b 7c 24 58       	mov    r15,QWORD PTR [rsp+0x58]
 12125cd:	49 89 1f             	mov    QWORD PTR [r15],rbx
 12125d0:	6a 20                	push   0x20
 12125d2:	5f                   	pop    rdi
 12125d3:	e8 28 b9 5d 00       	call   17edf00 <_Znwm@plt>
 12125d8:	0f 57 c0             	xorps  xmm0,xmm0
 12125db:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
```
### AP `0x186b018` +0x28 -> `0x13b9494` score 17

```text
 13b9494:	41 57                	push   r15
 13b9496:	41 56                	push   r14
 13b9498:	53                   	push   rbx
 13b9499:	48 83 ec 20          	sub    rsp,0x20
 13b949d:	49 89 f6             	mov    r14,rsi
 13b94a0:	48 89 fb             	mov    rbx,rdi
 13b94a3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 13b94aa:	00 00
 13b94ac:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 13b94b1:	e8 c4 51 ff ff       	call   13ae67a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f3bfe>
 13b94b6:	e8 19 d9 24 00       	call   1606dd4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f42>
 13b94bb:	49 8d b6 98 02 00 00 	lea    rsi,[r14+0x298]
 13b94c2:	48 89 df             	mov    rdi,rbx
 13b94c5:	e8 7e 06 fe ff       	call   1399b48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1df0cc>
 13b94ca:	41 8b 8e 94 03 00 00 	mov    ecx,DWORD PTR [r14+0x394]
 13b94d1:	48 85 c9             	test   rcx,rcx
 13b94d4:	74 15                	je     13b94eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fea6f>
 13b94d6:	41 8b 86 98 03 00 00 	mov    eax,DWORD PTR [r14+0x398]
 13b94dd:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
 13b94e4:	31 d2                	xor    edx,edx
 13b94e6:	48 f7 f1             	div    rcx
 13b94e9:	eb 02                	jmp    13b94ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fea71>
 13b94eb:	31 c0                	xor    eax,eax
 13b94ed:	89 43 58             	mov    DWORD PTR [rbx+0x58],eax
 13b94f0:	41 8b 86 90 03 00 00 	mov    eax,DWORD PTR [r14+0x390]
 13b94f7:	89 c1                	mov    ecx,eax
 13b94f9:	41 2b 8e 88 03 00 00 	sub    ecx,DWORD PTR [r14+0x388]
 13b9500:	85 c0                	test   eax,eax
 13b9502:	0f 44 c8             	cmove  ecx,eax
 13b9505:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
 13b9509:	0f 95 43 18          	setne  BYTE PTR [rbx+0x18]
 13b950d:	41 8b 86 d8 01 00 00 	mov    eax,DWORD PTR [r14+0x1d8]
 13b9514:	ff c8                	dec    eax
 13b9516:	83 f8 06             	cmp    eax,0x6
 13b9519:	77 12                	ja     13b952d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1feab1>
 13b951b:	89 c0                	mov    eax,eax
 13b951d:	48 8d 0d 6c 51 02 ff 	lea    rcx,[rip+0xffffffffff02516c]        # 3de690 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x40df>
 13b9524:	48 63 34 81          	movsxd rsi,DWORD PTR [rcx+rax*4]
 13b9528:	48 01 ce             	add    rsi,rcx
 13b952b:	eb 07                	jmp    13b9534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1feab8>
 13b952d:	48 8d 35 e4 86 09 ff 	lea    rsi,[rip+0xffffffffff0986e4]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 13b9534:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 13b9538:	e8 43 4a 43 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
 13b953d:	49 63 86 a4 01 00 00 	movsxd rax,DWORD PTR [r14+0x1a4]
 13b9544:	31 c9                	xor    ecx,ecx
 13b9546:	41 80 be a8 01 00 00 	cmp    BYTE PTR [r14+0x1a8],0x1
 13b954d:	01
 13b954e:	48 19 c9             	sbb    rcx,rcx
 13b9551:	48 09 c1             	or     rcx,rax
 13b9554:	48 89 4b 60          	mov    QWORD PTR [rbx+0x60],rcx
 13b9558:	49 8b be 90 00 00 00 	mov    rdi,QWORD PTR [r14+0x90]
 13b955f:	48 85 ff             	test   rdi,rdi
 13b9562:	74 2f                	je     13b9593 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1feb17>
 13b9564:	e8 51 4d 00 00       	call   13be2ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20383e>
 13b9569:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
 13b956d:	49 8b be 90 00 00 00 	mov    rdi,QWORD PTR [r14+0x90]
 13b9574:	e8 71 4d 00 00       	call   13be2ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20386e>
 13b9579:	89 43 68             	mov    DWORD PTR [rbx+0x68],eax
 13b957c:	49 8b 86 90 00 00 00 	mov    rax,QWORD PTR [r14+0x90]
 13b9583:	8b 80 84 04 00 00    	mov    eax,DWORD PTR [rax+0x484]
 13b9589:	89 43 5c             	mov    DWORD PTR [rbx+0x5c],eax
 13b958c:	e8 59 d8 24 00       	call   1606dea <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f58>
 13b9591:	eb 4b                	jmp    13b95de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1feb62>
 13b9593:	e8 52 d8 24 00       	call   1606dea <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f58>
 13b9598:	4d 8d be 50 06 00 00 	lea    r15,[r14+0x650]
 13b959f:	4c 89 ff             	mov    rdi,r15
 13b95a2:	e8 b7 9a ff ff       	call   13b305e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f85e2>
 13b95a7:	49 8b 86 30 06 00 00 	mov    rax,QWORD PTR [r14+0x630]
 13b95ae:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
 13b95b2:	49 69 86 38 06 00 00 	imul   rax,QWORD PTR [r14+0x638],0x3e8
 13b95b9:	e8 03 00 00
 13b95bd:	48 99                	cqo
 13b95bf:	49 f7 be 40 06 00 00 	idiv   QWORD PTR [r14+0x640]
 13b95c6:	89 43 68             	mov    DWORD PTR [rbx+0x68],eax
 13b95c9:	41 8b 86 4c 06 00 00 	mov    eax,DWORD PTR [r14+0x64c]
 13b95d0:	89 43 5c             	mov    DWORD PTR [rbx+0x5c],eax
 13b95d3:	6a 01                	push   0x1
 13b95d5:	5e                   	pop    rsi
 13b95d6:	4c 89 ff             	mov    rdi,r15
 13b95d9:	e8 5c 5f 7a ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
 13b95de:	49 83 7e 48 00       	cmp    QWORD PTR [r14+0x48],0x0
 13b95e3:	74 39                	je     13b961e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1feba2>
 13b95e5:	49 8d 7e 20          	lea    rdi,[r14+0x20]
 13b95e9:	0f 57 c0             	xorps  xmm0,xmm0
 13b95ec:	49 89 e7             	mov    r15,rsp
 13b95ef:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
 13b95f3:	e8 f6 36 15 00       	call   150ccee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352272>
 13b95f8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 13b95fb:	48 89 c7             	mov    rdi,rax
 13b95fe:	4c 89 fe             	mov    rsi,r15
 13b9601:	ff 51 58             	call   QWORD PTR [rcx+0x58]
 13b9604:	8b 04 24             	mov    eax,DWORD PTR [rsp]
 13b9607:	89 c1                	mov    ecx,eax
 13b9609:	41 2b 8e 84 03 00 00 	sub    ecx,DWORD PTR [r14+0x384]
 13b9610:	85 c0                	test   eax,eax
 13b9612:	0f 44 c8             	cmove  ecx,eax
 13b9615:	48 89 0b             	mov    QWORD PTR [rbx],rcx
 13b9618:	0f 95 43 08          	setne  BYTE PTR [rbx+0x8]
 13b961c:	eb 0a                	jmp    13b9628 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1febac>
 13b961e:	80 7b 08 00          	cmp    BYTE PTR [rbx+0x8],0x0
 13b9622:	74 04                	je     13b9628 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1febac>
 13b9624:	c6 43 08 00          	mov    BYTE PTR [rbx+0x8],0x0
 13b9628:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 13b962f:	00 00
 13b9631:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 13b9636:	75 3c                	jne    13b9674 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1febf8>
 13b9638:	48 89 d8             	mov    rax,rbx
 13b963b:	48 83 c4 20          	add    rsp,0x20
 13b963f:	5b                   	pop    rbx
 13b9640:	41 5e                	pop    r14
 13b9642:	41 5f                	pop    r15
 13b9644:	c3                   	ret
```
### AP `0x1871050` +0x28 -> `0x1434e68` score 17

```text
 1434e68:	41 57                	push   r15
 1434e6a:	41 56                	push   r14
 1434e6c:	41 54                	push   r12
 1434e6e:	53                   	push   rbx
 1434e6f:	48 81 ec 98 03 00 00 	sub    rsp,0x398
 1434e76:	49 89 d7             	mov    r15,rdx
 1434e79:	48 89 f3             	mov    rbx,rsi
 1434e7c:	49 89 fe             	mov    r14,rdi
 1434e7f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1434e86:	00 00
 1434e88:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
 1434e8f:	00
 1434e90:	83 a4 24 78 03 00 00 	and    DWORD PTR [rsp+0x378],0x0
 1434e97:	00
 1434e98:	48 83 a4 24 80 03 00 	and    QWORD PTR [rsp+0x380],0x0
 1434e9f:	00 00
 1434ea1:	48 c7 84 24 88 03 00 	mov    QWORD PTR [rsp+0x388],0x1
 1434ea8:	00 01 00 00 00
 1434ead:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
 1434eb2:	4c 89 e7             	mov    rdi,r12
 1434eb5:	48 89 ce             	mov    rsi,rcx
 1434eb8:	e8 6f 7a 8b ff       	call   cec92c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2398cc>
 1434ebd:	48 8b 84 24 88 03 00 	mov    rax,QWORD PTR [rsp+0x388]
 1434ec4:	00
 1434ec5:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 1434eca:	0f 10 84 24 68 03 00 	movups xmm0,XMMWORD PTR [rsp+0x368]
 1434ed1:	00
 1434ed2:	0f 10 8c 24 78 03 00 	movups xmm1,XMMWORD PTR [rsp+0x378]
 1434ed9:	00
 1434eda:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
 1434edf:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 1434ee3:	4c 89 f7             	mov    rdi,r14
 1434ee6:	4c 89 fe             	mov    rsi,r15
 1434ee9:	4c 89 e2             	mov    rdx,r12
 1434eec:	e8 41 f6 ff ff       	call   1434532 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279ab6>
 1434ef1:	4c 89 e7             	mov    rdi,r12
 1434ef4:	e8 4b 13 8a ff       	call   cd6244 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2231e4>
 1434ef9:	49 8d 7e 50          	lea    rdi,[r14+0x50]
 1434efd:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 1434f02:	4c 89 3e             	mov    QWORD PTR [rsi],r15
 1434f05:	e8 e4 2f 00 00       	call   1437eee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d472>
 1434f0a:	48 89 18             	mov    QWORD PTR [rax],rbx
 1434f0d:	4c 89 f7             	mov    rdi,r14
 1434f10:	48 89 de             	mov    rsi,rbx
 1434f13:	e8 5e f8 ff ff       	call   1434776 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279cfa>
 1434f18:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1434f1f:	00 00
 1434f21:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
 1434f28:	00
 1434f29:	75 0f                	jne    1434f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a4be>
 1434f2b:	48 81 c4 98 03 00 00 	add    rsp,0x398
 1434f32:	5b                   	pop    rbx
 1434f33:	41 5c                	pop    r12
 1434f35:	41 5e                	pop    r14
 1434f37:	41 5f                	pop    r15
 1434f39:	c3                   	ret
```
### AP `0x18754b0` +0x28 -> `0x147c894` score 17

```text
 147c894:	6a 10                	push   0x10
 147c896:	58                   	pop    rax
 147c897:	c3                   	ret
 147c898:	55                   	push   rbp
 147c899:	53                   	push   rbx
 147c89a:	50                   	push   rax
 147c89b:	48 89 f3             	mov    rbx,rsi
 147c89e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 147c8a1:	6a 01                	push   0x1
 147c8a3:	5d                   	pop    rbp
 147c8a4:	48 89 f7             	mov    rdi,rsi
 147c8a7:	89 ee                	mov    esi,ebp
 147c8a9:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
 147c8af:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 147c8b2:	48 89 df             	mov    rdi,rbx
 147c8b5:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
 147c8bb:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 147c8be:	48 89 df             	mov    rdi,rbx
 147c8c1:	89 ee                	mov    esi,ebp
 147c8c3:	ff 50 40             	call   QWORD PTR [rax+0x40]
 147c8c6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 147c8c9:	48 89 df             	mov    rdi,rbx
 147c8cc:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
 147c8d2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 147c8d5:	48 89 df             	mov    rdi,rbx
 147c8d8:	48 83 c4 08          	add    rsp,0x8
 147c8dc:	5b                   	pop    rbx
 147c8dd:	5d                   	pop    rbp
 147c8de:	ff a0 90 01 00 00    	jmp    QWORD PTR [rax+0x190]
 147c8e4:	48 89 c7             	mov    rdi,rax
 147c8e7:	e8 b9 d1 5f ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 147c8ec:	55                   	push   rbp
 147c8ed:	41 57                	push   r15
 147c8ef:	41 56                	push   r14
 147c8f1:	41 55                	push   r13
 147c8f3:	41 54                	push   r12
 147c8f5:	53                   	push   rbx
 147c8f6:	48 81 ec 98 03 00 00 	sub    rsp,0x398
 147c8fd:	48 89 cb             	mov    rbx,rcx
 147c900:	49 89 d7             	mov    r15,rdx
 147c903:	49 89 fe             	mov    r14,rdi
 147c906:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 147c90d:	00 00
 147c90f:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
 147c916:	00
 147c917:	48 8b 01             	mov    rax,QWORD PTR [rcx]
 147c91a:	48 89 cf             	mov    rdi,rcx
 147c91d:	ff 50 50             	call   QWORD PTR [rax+0x50]
 147c920:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 147c925:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 147c928:	48 89 df             	mov    rdi,rbx
 147c92b:	ff 50 48             	call   QWORD PTR [rax+0x48]
 147c92e:	49 89 c5             	mov    r13,rax
 147c931:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 147c934:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
 147c939:	48 89 df             	mov    rdi,rbx
 147c93c:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
 147c942:	8a 58 18             	mov    bl,BYTE PTR [rax+0x18]
 147c945:	40 8a 68 19          	mov    bpl,BYTE PTR [rax+0x19]
 147c949:	31 c0                	xor    eax,eax
 147c94b:	88 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],al
 147c952:	88 84 24 c0 00 00 00 	mov    BYTE PTR [rsp+0xc0],al
 147c959:	41 38 47 48          	cmp    BYTE PTR [r15+0x48],al
 147c95d:	0f 84 7f 03 00 00    	je     147cce2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c2266>
 147c963:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
 147c968:	48 8d bc 24 68 02 00 	lea    rdi,[rsp+0x268]
 147c96f:	00
 147c970:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
 147c975:	4c 89 fe             	mov    rsi,r15
 147c978:	e8 43 87 d9 ff       	call   12150c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a644>
 147c97d:	40 84 ed             	test   bpl,bpl
 147c980:	0f 95 c0             	setne  al
 147c983:	84 db                	test   bl,bl
 147c985:	0f 95 c1             	setne  cl
 147c988:	80 bc 24 b0 02 00 00 	cmp    BYTE PTR [rsp+0x2b0],0x0
 147c98f:	00
 147c990:	0f 84 35 03 00 00    	je     147cccb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c224f>
 147c996:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
 147c99b:	48 8d 9a a0 00 00 00 	lea    rbx,[rdx+0xa0]
 147c9a2:	48 81 c2 f0 00 00 00 	add    rdx,0xf0
 147c9a9:	48 89 54 24 28       	mov    QWORD PTR [rsp+0x28],rdx
 147c9ae:	20 c8                	and    al,cl
 147c9b0:	4c 8d a4 24 68 02 00 	lea    r12,[rsp+0x268]
 147c9b7:	00
 147c9b8:	4c 8d b4 24 b8 02 00 	lea    r14,[rsp+0x2b8]
 147c9bf:	00
 147c9c0:	0f b6 c0             	movzx  eax,al
 147c9c3:	89 44 24 14          	mov    DWORD PTR [rsp+0x14],eax
 147c9c7:	45 31 ff             	xor    r15d,r15d
 147c9ca:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
 147c9cf:	48 89 df             	mov    rdi,rbx
 147c9d2:	4c 89 e6             	mov    rsi,r12
 147c9d5:	e8 78 a4 ff ff       	call   1476e52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc3d6>
 147c9da:	4c 89 e6             	mov    rsi,r12
 147c9dd:	49 89 c4             	mov    r12,rax
 147c9e0:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 147c9e5:	e8 68 a4 ff ff       	call   1476e52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc3d6>
 147c9ea:	48 89 c5             	mov    rbp,rax
 147c9ed:	48 85 c0             	test   rax,rax
 147c9f0:	74 10                	je     147ca02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1f86>
 147c9f2:	48 89 df             	mov    rdi,rbx
 147c9f5:	48 89 ee             	mov    rsi,rbp
 147c9f8:	e8 55 a4 ff ff       	call   1476e52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc3d6>
 147c9fd:	48 89 c3             	mov    rbx,rax
 147ca00:	eb 02                	jmp    147ca04 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1f88>
 147ca02:	31 db                	xor    ebx,ebx
 147ca04:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15
 147ca0b:	00
 147ca0c:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
 147ca13:	00
 147ca14:	4c 89 f7             	mov    rdi,r14
 147ca17:	4c 89 fe             	mov    rsi,r15
 147ca1a:	4c 89 e2             	mov    rdx,r12
 147ca1d:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
 147ca22:	4c 89 f9             	mov    rcx,r15
 147ca25:	4d 89 e8             	mov    r8,r13
 147ca28:	e8 56 03 00 00       	call   147cd83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c2307>
 147ca2d:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
 147ca34:	00
 147ca35:	4c 89 e6             	mov    rsi,r12
 147ca38:	48 89 da             	mov    rdx,rbx
 147ca3b:	4c 89 f9             	mov    rcx,r15
 147ca3e:	4d 89 e8             	mov    r8,r13
 147ca41:	e8 3d 03 00 00       	call   147cd83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c2307>
 147ca46:	83 bc 24 28 03 00 00 	cmp    DWORD PTR [rsp+0x328],0xf
 147ca4d:	0f
 147ca4e:	75 3a                	jne    147ca8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c200e>
 147ca50:	83 a4 24 28 01 00 00 	and    DWORD PTR [rsp+0x128],0x0
 147ca57:	00
 147ca58:	31 c0                	xor    eax,eax
 147ca5a:	88 84 24 30 01 00 00 	mov    BYTE PTR [rsp+0x130],al
 147ca61:	88 84 24 88 01 00 00 	mov    BYTE PTR [rsp+0x188],al
 147ca68:	48 8d bc 24 28 03 00 	lea    rdi,[rsp+0x328]
 147ca6f:	00
 147ca70:	48 8d b4 24 28 01 00 	lea    rsi,[rsp+0x128]
 147ca77:	00
 147ca78:	e8 39 30 a5 ff       	call   ecfab6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96ecc>
 147ca7d:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
 147ca84:	00
 147ca85:	e8 68 30 a5 ff       	call   ecfaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96f08>
 147ca8a:	83 bc 24 00 02 00 00 	cmp    DWORD PTR [rsp+0x200],0xf
 147ca91:	0f
 147ca92:	75 3a                	jne    147cace <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c2052>
 147ca94:	83 a4 24 28 01 00 00 	and    DWORD PTR [rsp+0x128],0x0
 147ca9b:	00
 147ca9c:	31 c0                	xor    eax,eax
 147ca9e:	88 84 24 30 01 00 00 	mov    BYTE PTR [rsp+0x130],al
 147caa5:	88 84 24 88 01 00 00 	mov    BYTE PTR [rsp+0x188],al
 147caac:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
 147cab3:	00
 147cab4:	48 8d b4 24 28 01 00 	lea    rsi,[rsp+0x128]
 147cabb:	00
 147cabc:	e8 f5 2f a5 ff       	call   ecfab6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96ecc>
 147cac1:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
 147cac8:	00
 147cac9:	e8 24 30 a5 ff       	call   ecfaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96f08>
 147cace:	8b b4 24 e4 02 00 00 	mov    esi,DWORD PTR [rsp+0x2e4]
 147cad5:	8b 8c 24 c4 02 00 00 	mov    ecx,DWORD PTR [rsp+0x2c4]
 147cadc:	44 8b 84 24 d0 02 00 	mov    r8d,DWORD PTR [rsp+0x2d0]
 147cae3:	00
```
### AP `0x18b0eb0` +0x28 -> `0xa89e51` score 17

```text
  a89e51:	53                   	push   rbx
  a89e52:	48 83 ec 20          	sub    rsp,0x20
  a89e56:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a89e5d:	00 00
  a89e5f:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  a89e64:	48 8d 05 a2 0d 95 ff 	lea    rax,[rip+0xffffffffff950da2]        # 3dac0d <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x65c>
  a89e6b:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  a89e70:	48 89 06             	mov    QWORD PTR [rsi],rax
  a89e73:	c7 46 08 95 29 fa 25 	mov    DWORD PTR [rsi+0x8],0x25fa2995
  a89e7a:	48 8d 1d 6f f8 f5 00 	lea    rbx,[rip+0xf5f86f]        # 19e96f0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x328>
  a89e81:	48 89 df             	mov    rdi,rbx
  a89e84:	e8 21 7f d3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a89e89:	48 8b 3d b0 7b e2 00 	mov    rdi,QWORD PTR [rip+0xe27bb0]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a89e90:	48 8d 15 69 a1 d6 00 	lea    rdx,[rip+0xd6a169]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a89e97:	48 89 de             	mov    rsi,rbx
  a89e9a:	e8 c1 3f d6 00       	call   17ede60 <__cxa_atexit@plt>
  a89e9f:	48 8d 05 70 0d 95 ff 	lea    rax,[rip+0xffffffffff950d70]        # 3dac16 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x665>
  a89ea6:	48 89 05 5b f8 f5 00 	mov    QWORD PTR [rip+0xf5f85b],rax        # 19e9708 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x340>
  a89ead:	c7 05 59 f8 f5 00 85 	mov    DWORD PTR [rip+0xf5f859],0xe74fa885        # 19e9710 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x348>
  a89eb4:	a8 4f e7
  a89eb7:	48 8d 05 65 0d 95 ff 	lea    rax,[rip+0xffffffffff950d65]        # 3dac23 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x672>
  a89ebe:	48 89 05 53 f8 f5 00 	mov    QWORD PTR [rip+0xf5f853],rax        # 19e9718 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x350>
  a89ec5:	c7 05 51 f8 f5 00 dd 	mov    DWORD PTR [rip+0xf5f851],0xdd7154dd        # 19e9720 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x358>
  a89ecc:	54 71 dd
  a89ecf:	48 8d 05 68 0d 95 ff 	lea    rax,[rip+0xffffffffff950d68]        # 3dac3e <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x68d>
  a89ed6:	48 89 05 4b f8 f5 00 	mov    QWORD PTR [rip+0xf5f84b],rax        # 19e9728 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x360>
  a89edd:	c7 05 49 f8 f5 00 7f 	mov    DWORD PTR [rip+0xf5f849],0x41c0e47f        # 19e9730 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x368>
  a89ee4:	e4 c0 41
  a89ee7:	48 8d 05 6b 0d 95 ff 	lea    rax,[rip+0xffffffffff950d6b]        # 3dac59 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x6a8>
  a89eee:	48 89 05 43 f8 f5 00 	mov    QWORD PTR [rip+0xf5f843],rax        # 19e9738 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x370>
  a89ef5:	c7 05 41 f8 f5 00 0c 	mov    DWORD PTR [rip+0xf5f841],0xce2ec60c        # 19e9740 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x378>
  a89efc:	c6 2e ce
  a89eff:	48 8d 05 6c 0d 95 ff 	lea    rax,[rip+0xffffffffff950d6c]        # 3dac72 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x6c1>
  a89f06:	48 89 05 3b f8 f5 00 	mov    QWORD PTR [rip+0xf5f83b],rax        # 19e9748 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x380>
  a89f0d:	c7 05 39 f8 f5 00 41 	mov    DWORD PTR [rip+0xf5f839],0x1384ee41        # 19e9750 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x388>
  a89f14:	ee 84 13
  a89f17:	48 8d 05 70 0d 95 ff 	lea    rax,[rip+0xffffffffff950d70]        # 3dac8e <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x6dd>
  a89f1e:	48 89 05 33 f8 f5 00 	mov    QWORD PTR [rip+0xf5f833],rax        # 19e9758 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x390>
  a89f25:	c7 05 31 f8 f5 00 7b 	mov    DWORD PTR [rip+0xf5f831],0x49e8767b        # 19e9760 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x398>
  a89f2c:	76 e8 49
  a89f2f:	48 8d 05 7c 0d 95 ff 	lea    rax,[rip+0xffffffffff950d7c]        # 3dacb2 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x701>
  a89f36:	48 89 05 2b f8 f5 00 	mov    QWORD PTR [rip+0xf5f82b],rax        # 19e9768 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x3a0>
  a89f3d:	c7 05 29 f8 f5 00 a8 	mov    DWORD PTR [rip+0xf5f829],0x43bf81a8        # 19e9770 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x3a8>
  a89f44:	81 bf 43
  a89f47:	48 8d 05 82 0d 95 ff 	lea    rax,[rip+0xffffffffff950d82]        # 3dacd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x71f>
  a89f4e:	48 89 05 23 f8 f5 00 	mov    QWORD PTR [rip+0xf5f823],rax        # 19e9778 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x3b0>
  a89f55:	c7 05 21 f8 f5 00 13 	mov    DWORD PTR [rip+0xf5f821],0x91121513        # 19e9780 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x3b8>
  a89f5c:	15 12 91
  a89f5f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a89f66:	00 00
  a89f68:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  a89f6d:	75 06                	jne    a89f75 <JNI_OnUnload@@Base+0x11842>
  a89f6f:	48 83 c4 20          	add    rsp,0x20
  a89f73:	5b                   	pop    rbx
  a89f74:	c3                   	ret
```
### AP `0x18008e0` +0x28 -> `0xacc442` score 16

```text
  acc442:	53                   	push   rbx
  acc443:	48 89 fb             	mov    rbx,rdi
  acc446:	48 8d 05 bb 44 d3 00 	lea    rax,[rip+0xd344bb]        # 1800908 <_ZTIN4asio22service_already_existsE@@Base+0x20f0>
  acc44d:	48 89 07             	mov    QWORD PTR [rdi],rax
  acc450:	48 8d 05 31 45 d3 00 	lea    rax,[rip+0xd34531]        # 1800988 <_ZTIN4asio22service_already_existsE@@Base+0x2170>
  acc457:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
  acc45b:	48 81 c7 98 03 00 00 	add    rdi,0x398
  acc462:	e8 a5 8f d0 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
  acc467:	48 8d bb 90 03 00 00 	lea    rdi,[rbx+0x390]
  acc46e:	e8 99 8f d0 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
  acc473:	48 8d bb 88 03 00 00 	lea    rdi,[rbx+0x388]
  acc47a:	e8 2d e6 9d 00       	call   14aaaac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f0030>
  acc47f:	48 8d bb 80 03 00 00 	lea    rdi,[rbx+0x380]
  acc486:	e8 21 e6 9d 00       	call   14aaaac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f0030>
  acc48b:	48 8b bb 78 03 00 00 	mov    rdi,QWORD PTR [rbx+0x378]
  acc492:	e8 ef 1f fd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  acc497:	48 8d bb 68 03 00 00 	lea    rdi,[rbx+0x368]
  acc49e:	e8 4d 69 06 00       	call   b32df0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7fd90>
  acc4a3:	48 8d bb 58 03 00 00 	lea    rdi,[rbx+0x358]
  acc4aa:	e8 61 fe ff ff       	call   acc310 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192b0>
  acc4af:	48 8d bb 50 03 00 00 	lea    rdi,[rbx+0x350]
  acc4b6:	e8 8b 99 00 00       	call   ad5e46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22de6>
  acc4bb:	48 8b bb 40 03 00 00 	mov    rdi,QWORD PTR [rbx+0x340]
  acc4c2:	e8 bf 1f fd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  acc4c7:	48 8b bb 30 03 00 00 	mov    rdi,QWORD PTR [rbx+0x330]
  acc4ce:	e8 b3 1f fd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  acc4d3:	48 8d bb 00 03 00 00 	lea    rdi,[rbx+0x300]
  acc4da:	e8 71 1b d2 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  acc4df:	48 8d bb f8 02 00 00 	lea    rdi,[rbx+0x2f8]
  acc4e6:	e8 3d d9 fa ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  acc4eb:	48 8d bb 50 02 00 00 	lea    rdi,[rbx+0x250]
  acc4f2:	e8 35 55 00 00       	call   ad1a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e9cc>
  acc4f7:	48 83 c3 10          	add    rbx,0x10
  acc4fb:	48 89 df             	mov    rdi,rbx
  acc4fe:	5b                   	pop    rbx
  acc4ff:	e9 22 fe ff ff       	jmp    acc326 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c6>
  acc504:	53                   	push   rbx
  acc505:	48 89 fb             	mov    rbx,rdi
  acc508:	e8 35 ff ff ff       	call   acc442 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x193e2>
  acc50d:	48 89 df             	mov    rdi,rbx
  acc510:	5b                   	pop    rbx
  acc511:	e9 0a 1a d2 00       	jmp    17edf20 <_ZdlPv@plt>
  acc516:	48 8d 87 48 03 00 00 	lea    rax,[rdi+0x348]
  acc51d:	c3                   	ret
```
### AP `0x18319b8` +0x28 -> `0xe992a2` score 15

```text
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
```
### AP `0x18319c8` +0x28 -> `0xe992c8` score 15

```text
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
```
### AP `0x1831a30` +0x28 -> `0xe9929a` score 15

```text
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
```
### AP `0x184c338` +0x28 -> `0x10a2082` score 15

```text
 10a2082:	53                   	push   rbx
 10a2083:	48 89 fb             	mov    rbx,rdi
 10a2086:	48 8d 05 d3 a2 7a 00 	lea    rax,[rip+0x7aa2d3]        # 184c360 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8a48>
 10a208d:	48 89 07             	mov    QWORD PTR [rdi],rax
 10a2090:	48 81 c7 c8 04 00 00 	add    rdi,0x4c8
 10a2097:	e8 e0 d0 ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 10a209c:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
 10a20a3:	e8 be 7d 73 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10a20a8:	48 8d bb 18 04 00 00 	lea    rdi,[rbx+0x418]
 10a20af:	e8 b2 7d 73 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10a20b4:	48 8b bb 10 04 00 00 	mov    rdi,QWORD PTR [rbx+0x410]
 10a20bb:	e8 c6 c3 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a20c0:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
 10a20c7:	e8 9e 67 54 00       	call   15e886a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ddee>
 10a20cc:	48 8d bb 88 03 00 00 	lea    rdi,[rbx+0x388]
 10a20d3:	e8 ae f4 ff ff       	call   10a1586 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26899c>
 10a20d8:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
 10a20df:	e8 c0 f4 ff ff       	call   10a15a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2689ba>
 10a20e4:	48 8d bb 70 03 00 00 	lea    rdi,[rbx+0x370]
 10a20eb:	e8 e8 f4 ff ff       	call   10a15d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2689ee>
 10a20f0:	48 8d bb f8 01 00 00 	lea    rdi,[rbx+0x1f8]
 10a20f7:	e8 0a 58 54 00       	call   15e7906 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ce8a>
 10a20fc:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
 10a2103:	e8 fe 57 54 00       	call   15e7906 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ce8a>
 10a2108:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
 10a210c:	e8 75 c3 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a2111:	48 8b 7b 68          	mov    rdi,QWORD PTR [rbx+0x68]
 10a2115:	e8 6c c3 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a211a:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
 10a211e:	e8 47 7e 9d ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10a2123:	48 83 c3 08          	add    rbx,0x8
 10a2127:	48 89 df             	mov    rdi,rbx
 10a212a:	5b                   	pop    rbx
 10a212b:	e9 60 bd 74 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a2130:	53                   	push   rbx
 10a2131:	48 89 fb             	mov    rbx,rdi
 10a2134:	e8 49 ff ff ff       	call   10a2082 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269498>
 10a2139:	48 89 df             	mov    rdi,rbx
 10a213c:	5b                   	pop    rbx
 10a213d:	e9 de bd 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10a2142:	41 57                	push   r15
 10a2144:	41 56                	push   r14
 10a2146:	53                   	push   rbx
 10a2147:	48 83 ec 20          	sub    rsp,0x20
 10a214b:	49 89 f6             	mov    r14,rsi
 10a214e:	48 89 fb             	mov    rbx,rdi
 10a2151:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a2158:	00 00
 10a215a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10a215f:	48 8b 76 70          	mov    rsi,QWORD PTR [rsi+0x70]
 10a2163:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
 10a2168:	4c 89 ff             	mov    rdi,r15
 10a216b:	e8 7c e3 5d 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
 10a2170:	49 8b 17             	mov    rdx,QWORD PTR [r15]
 10a2173:	48 85 d2             	test   rdx,rdx
 10a2176:	74 11                	je     10a2189 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26959f>
 10a2178:	49 83 ee 80          	sub    r14,0xffffffffffffff80
 10a217c:	48 89 df             	mov    rdi,rbx
 10a217f:	4c 89 f6             	mov    rsi,r14
 10a2182:	e8 f7 63 54 00       	call   15e857e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42db02>
 10a2187:	eb 04                	jmp    10a218d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2695a3>
 10a2189:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10a218d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 10a2192:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a2199:	00 00
 10a219b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 10a21a0:	75 37                	jne    10a21d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2695ef>
 10a21a2:	e8 df c2 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a21a7:	48 89 d8             	mov    rax,rbx
 10a21aa:	48 83 c4 20          	add    rsp,0x20
 10a21ae:	5b                   	pop    rbx
 10a21af:	41 5e                	pop    r14
 10a21b1:	41 5f                	pop    r15
 10a21b3:	c3                   	ret
```
### AP `0x18856d0` +0x28 -> `0x15cb0f2` score 15

```text
 15cb0f2:	55                   	push   rbp
 15cb0f3:	41 57                	push   r15
 15cb0f5:	41 56                	push   r14
 15cb0f7:	41 55                	push   r13
 15cb0f9:	41 54                	push   r12
 15cb0fb:	53                   	push   rbx
 15cb0fc:	48 83 ec 38          	sub    rsp,0x38
 15cb100:	49 89 d7             	mov    r15,rdx
 15cb103:	49 89 f6             	mov    r14,rsi
 15cb106:	48 89 fb             	mov    rbx,rdi
 15cb109:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15cb110:	00 00
 15cb112:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 15cb117:	0f 10 86 d8 00 00 00 	movups xmm0,XMMWORD PTR [rsi+0xd8]
 15cb11e:	0f 11 44 24 08       	movups XMMWORD PTR [rsp+0x8],xmm0
 15cb123:	83 f9 0b             	cmp    ecx,0xb
 15cb126:	77 5d                	ja     15cb185 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410709>
 15cb128:	89 cd                	mov    ebp,ecx
 15cb12a:	41 89 cd             	mov    r13d,ecx
 15cb12d:	48 8d 05 84 e2 dc fe 	lea    rax,[rip+0xfffffffffedce284]        # 3993b8 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x5f99>
 15cb134:	4a 63 0c a8          	movsxd rcx,DWORD PTR [rax+r13*4]
 15cb138:	48 01 c1             	add    rcx,rax
 15cb13b:	ff e1                	jmp    rcx
 15cb13d:	49 81 c6 70 01 00 00 	add    r14,0x170
 15cb144:	e9 fb 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb149:	49 81 c6 80 02 00 00 	add    r14,0x280
 15cb150:	e9 ef 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb155:	49 81 c6 08 03 00 00 	add    r14,0x308
 15cb15c:	e9 d7 00 00 00       	jmp    15cb238 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107bc>
 15cb161:	49 81 c6 f8 01 00 00 	add    r14,0x1f8
 15cb168:	e9 d7 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb16d:	49 81 c6 90 03 00 00 	add    r14,0x390
 15cb174:	e9 cb 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb179:	49 81 c6 90 03 00 00 	add    r14,0x390
 15cb180:	e9 b3 00 00 00       	jmp    15cb238 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107bc>
 15cb185:	48 8d 35 92 57 d7 fe 	lea    rsi,[rip+0xfffffffffed75792]        # 34091e <_ZTSSt12bad_any_cast@@Base-0x4f8aa>
 15cb18c:	48 8d 0d e9 6d e8 fe 	lea    rcx,[rip+0xfffffffffee86de9]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 15cb193:	49 89 e4             	mov    r12,rsp
 15cb196:	6a 31                	push   0x31
 15cb198:	5a                   	pop    rdx
 15cb199:	4c 89 e7             	mov    rdi,r12
 15cb19c:	45 31 c0             	xor    r8d,r8d
 15cb19f:	e8 42 61 b6 ff       	call   11312e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f86fc>
 15cb1a4:	49 81 c6 f8 01 00 00 	add    r14,0x1f8
 15cb1ab:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb1b0:	4c 89 fe             	mov    rsi,r15
 15cb1b3:	4c 89 e2             	mov    rdx,r12
 15cb1b6:	4c 89 f1             	mov    rcx,r14
 15cb1b9:	e8 f1 9d ff ff       	call   15c4faf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a533>
 15cb1be:	bf f0 01 00 00       	mov    edi,0x1f0
 15cb1c3:	e8 38 2d 22 00       	call   17edf00 <_Znwm@plt>
 15cb1c8:	49 89 c7             	mov    r15,rax
 15cb1cb:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 15cb1d0:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 15cb1d6:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 15cb1db:	48 89 06             	mov    QWORD PTR [rsi],rax
 15cb1de:	6a 01                	push   0x1
 15cb1e0:	59                   	pop    rcx
 15cb1e1:	4c 89 ff             	mov    rdi,r15
 15cb1e4:	4c 89 f2             	mov    rdx,r14
 15cb1e7:	e8 a4 18 00 00       	call   15cca90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x412014>
 15cb1ec:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 15cb1f1:	e8 70 9f ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb1f6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 15cb1fb:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 15cb1ff:	4c 89 3b             	mov    QWORD PTR [rbx],r15
 15cb202:	e8 0f 19 00 00       	call   15ccb16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41209a>
 15cb207:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb20c:	e8 55 9f ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb211:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 15cb215:	e8 d2 b4 4e ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 15cb21a:	e9 ef 00 00 00       	jmp    15cb30e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410892>
 15cb21f:	49 81 c6 80 02 00 00 	add    r14,0x280
 15cb226:	eb 10                	jmp    15cb238 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107bc>
 15cb228:	49 81 c6 08 03 00 00 	add    r14,0x308
 15cb22f:	eb 13                	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb231:	49 81 c6 18 04 00 00 	add    r14,0x418
 15cb238:	41 b4 01             	mov    r12b,0x1
 15cb23b:	eb 0a                	jmp    15cb247 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107cb>
 15cb23d:	49 81 c6 18 04 00 00 	add    r14,0x418
 15cb244:	45 31 e4             	xor    r12d,r12d
 15cb247:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb24c:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
 15cb251:	4c 89 fe             	mov    rsi,r15
 15cb254:	4c 89 f1             	mov    rcx,r14
 15cb257:	e8 4a 9f ff ff       	call   15c51a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a72a>
 15cb25c:	bf f0 01 00 00       	mov    edi,0x1f0
 15cb261:	e8 9a 2c 22 00       	call   17edf00 <_Znwm@plt>
 15cb266:	49 89 c7             	mov    r15,rax
 15cb269:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 15cb26e:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 15cb274:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 15cb279:	48 89 06             	mov    QWORD PTR [rsi],rax
 15cb27c:	4c 89 ff             	mov    rdi,r15
 15cb27f:	4c 89 f2             	mov    rdx,r14
 15cb282:	89 e9                	mov    ecx,ebp
 15cb284:	e8 07 18 00 00       	call   15cca90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x412014>
 15cb289:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
 15cb28e:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 15cb293:	e8 ce 9e ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb298:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb29d:	e8 c4 9e ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb2a2:	45 84 e4             	test   r12b,r12b
 15cb2a5:	74 54                	je     15cb2fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41087f>
 15cb2a7:	bf d8 00 00 00       	mov    edi,0xd8
 15cb2ac:	e8 4f 2c 22 00       	call   17edf00 <_Znwm@plt>
 15cb2b1:	49 89 c4             	mov    r12,rax
 15cb2b4:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
 15cb2ba:	48 8d 05 57 ee e6 fe 	lea    rax,[rip+0xfffffffffee6ee57]        # 43a118 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5fb67>
 15cb2c1:	42 8b 0c a8          	mov    ecx,DWORD PTR [rax+r13*4]
 15cb2c5:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 15cb2ca:	4c 89 3e             	mov    QWORD PTR [rsi],r15
 15cb2cd:	4c 89 e7             	mov    rdi,r12
 15cb2d0:	4c 89 f2             	mov    rdx,r14
 15cb2d3:	e8 5e 18 00 00       	call   15ccb36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4120ba>
 15cb2d8:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 15cb2dd:	48 85 ff             	test   rdi,rdi
 15cb2e0:	74 06                	je     15cb2e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41086c>
 15cb2e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 15cb2e5:	ff 50 08             	call   QWORD PTR [rax+0x8]
 15cb2e8:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb2ed:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 15cb2f1:	4c 89 23             	mov    QWORD PTR [rbx],r12
 15cb2f4:	e8 c3 18 00 00       	call   15ccbbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x412140>
 15cb2f9:	eb 09                	jmp    15cb304 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410888>
 15cb2fb:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
 15cb301:	4c 89 3b             	mov    QWORD PTR [rbx],r15
 15cb304:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 15cb309:	e8 08 18 00 00       	call   15ccb16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41209a>
 15cb30e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15cb315:	00 00
 15cb317:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 15cb31c:	0f 85 ae 00 00 00    	jne    15cb3d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410954>
 15cb322:	48 89 d8             	mov    rax,rbx
 15cb325:	48 83 c4 38          	add    rsp,0x38
 15cb329:	5b                   	pop    rbx
 15cb32a:	41 5c                	pop    r12
 15cb32c:	41 5d                	pop    r13
 15cb32e:	41 5e                	pop    r14
 15cb330:	41 5f                	pop    r15
 15cb332:	5d                   	pop    rbp
 15cb333:	c3                   	ret
```
### AP `0x1831980` +0x28 -> `0xe9938c` score 14

```text
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
```
### AP `0x1831988` +0x28 -> `0xe9939c` score 14

```text
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
```
### AP `0x1831990` +0x28 -> `0xe993ae` score 14

```text
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
```
### AP `0x18319e8` +0x28 -> `0xe99382` score 14

```text
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
```
### AP `0x1831a10` +0x28 -> `0xe9926a` score 14

```text
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
```
### AP `0x188ff68` +0x28 -> `0x162cd8a` score 14

```text
 162cd8a:	48 8b 87 80 01 00 00 	mov    rax,QWORD PTR [rdi+0x180]
 162cd91:	48 8b b8 90 00 00 00 	mov    rdi,QWORD PTR [rax+0x90]
 162cd98:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162cd9b:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
 162cda2:	ff e0                	jmp    rax
 162cda4:	48 8b 87 80 01 00 00 	mov    rax,QWORD PTR [rdi+0x180]
 162cdab:	48 8b b8 90 00 00 00 	mov    rdi,QWORD PTR [rax+0x90]
 162cdb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162cdb5:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
 162cdbc:	ff e0                	jmp    rax
 162cdbe:	48 8b 87 80 01 00 00 	mov    rax,QWORD PTR [rdi+0x180]
 162cdc5:	48 8b b8 90 00 00 00 	mov    rdi,QWORD PTR [rax+0x90]
 162cdcc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162cdcf:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
 162cdd6:	ff e0                	jmp    rax
 162cdd8:	55                   	push   rbp
 162cdd9:	41 57                	push   r15
 162cddb:	41 56                	push   r14
 162cddd:	41 55                	push   r13
 162cddf:	41 54                	push   r12
 162cde1:	53                   	push   rbx
 162cde2:	48 83 ec 38          	sub    rsp,0x38
 162cde6:	49 89 ce             	mov    r14,rcx
 162cde9:	49 89 d7             	mov    r15,rdx
 162cdec:	48 89 fb             	mov    rbx,rdi
 162cdef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162cdf6:	00 00
 162cdf8:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 162cdfd:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
 162ce02:	48 8d 04 0a          	lea    rax,[rdx+rcx*1]
 162ce06:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 162ce0b:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
 162ce10:	8b 86 88 01 00 00    	mov    eax,DWORD PTR [rsi+0x188]
 162ce16:	48 8d 0c 02          	lea    rcx,[rdx+rax*1]
 162ce1a:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 162ce1f:	4c 39 f0             	cmp    rax,r14
 162ce22:	0f 8d 95 00 00 00    	jge    162cebd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2802b>
 162ce28:	4d 89 c4             	mov    r12,r8
 162ce2b:	49 89 f5             	mov    r13,rsi
 162ce2e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 162ce33:	e8 fa 6b 05 00       	call   1683a32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b9e>
 162ce38:	85 c0                	test   eax,eax
 162ce3a:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
 162ce3f:	74 0c                	je     162ce4d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27fbb>
 162ce41:	83 f8 01             	cmp    eax,0x1
 162ce44:	49 81 c5 78 01 00 00 	add    r13,0x178
 162ce4b:	eb 07                	jmp    162ce54 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27fc2>
 162ce4d:	49 81 c5 70 01 00 00 	add    r13,0x170
 162ce54:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
 162ce58:	4d 8d 6c 24 08       	lea    r13,[r12+0x8]
 162ce5d:	4c 89 ef             	mov    rdi,r13
 162ce60:	e8 eb cd 52 ff       	call   b59c50 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6bf0>
 162ce65:	41 8b 6c 24 10       	mov    ebp,DWORD PTR [r12+0x10]
 162ce6a:	41 03 6c 24 0c       	add    ebp,DWORD PTR [r12+0xc]
 162ce6f:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
 162ce74:	4c 89 ef             	mov    rdi,r13
 162ce77:	89 ea                	mov    edx,ebp
 162ce79:	e8 40 69 05 00       	call   16837be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3792a>
 162ce7e:	39 e8                	cmp    eax,ebp
 162ce80:	75 3b                	jne    162cebd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2802b>
 162ce82:	49 8b 54 24 18       	mov    rdx,QWORD PTR [r12+0x18]
 162ce87:	49 8b 4c 24 20       	mov    rcx,QWORD PTR [r12+0x20]
 162ce8c:	49 8b b4 24 90 00 00 	mov    rsi,QWORD PTR [r12+0x90]
 162ce93:	00
 162ce94:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 162ce97:	48 8b 80 b0 00 00 00 	mov    rax,QWORD PTR [rax+0xb0]
 162ce9e:	64 48 8b 3c 25 28 00 	mov    rdi,QWORD PTR fs:0x28
 162cea5:	00 00
 162cea7:	48 3b 7c 24 30       	cmp    rdi,QWORD PTR [rsp+0x30]
 162ceac:	75 49                	jne    162cef7 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28065>
 162ceae:	48 29 d1             	sub    rcx,rdx
 162ceb1:	48 89 df             	mov    rdi,rbx
 162ceb4:	4c 8b 44 24 08       	mov    r8,QWORD PTR [rsp+0x8]
 162ceb9:	ff d0                	call   rax
 162cebb:	eb 28                	jmp    162cee5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28053>
 162cebd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162cec4:	00 00
 162cec6:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 162cecb:	75 2a                	jne    162cef7 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28065>
 162cecd:	48 8d 0d a8 50 e2 fe 	lea    rcx,[rip+0xfffffffffee250a8]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 162ced4:	48 89 df             	mov    rdi,rbx
 162ced7:	4c 89 fe             	mov    rsi,r15
 162ceda:	4c 89 f2             	mov    rdx,r14
 162cedd:	45 31 c0             	xor    r8d,r8d
 162cee0:	e8 97 92 48 ff       	call   ab617c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x311c>
 162cee5:	48 89 d8             	mov    rax,rbx
 162cee8:	48 83 c4 38          	add    rsp,0x38
 162ceec:	5b                   	pop    rbx
 162ceed:	41 5c                	pop    r12
 162ceef:	41 5d                	pop    r13
 162cef1:	41 5e                	pop    r14
 162cef3:	41 5f                	pop    r15
 162cef5:	5d                   	pop    rbp
 162cef6:	c3                   	ret
```
### AP `0x188ff70` +0x28 -> `0x162cda4` score 14

```text
 162cda4:	48 8b 87 80 01 00 00 	mov    rax,QWORD PTR [rdi+0x180]
 162cdab:	48 8b b8 90 00 00 00 	mov    rdi,QWORD PTR [rax+0x90]
 162cdb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162cdb5:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
 162cdbc:	ff e0                	jmp    rax
 162cdbe:	48 8b 87 80 01 00 00 	mov    rax,QWORD PTR [rdi+0x180]
 162cdc5:	48 8b b8 90 00 00 00 	mov    rdi,QWORD PTR [rax+0x90]
 162cdcc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162cdcf:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
 162cdd6:	ff e0                	jmp    rax
 162cdd8:	55                   	push   rbp
 162cdd9:	41 57                	push   r15
 162cddb:	41 56                	push   r14
 162cddd:	41 55                	push   r13
 162cddf:	41 54                	push   r12
 162cde1:	53                   	push   rbx
 162cde2:	48 83 ec 38          	sub    rsp,0x38
 162cde6:	49 89 ce             	mov    r14,rcx
 162cde9:	49 89 d7             	mov    r15,rdx
 162cdec:	48 89 fb             	mov    rbx,rdi
 162cdef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162cdf6:	00 00
 162cdf8:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 162cdfd:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
 162ce02:	48 8d 04 0a          	lea    rax,[rdx+rcx*1]
 162ce06:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 162ce0b:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
 162ce10:	8b 86 88 01 00 00    	mov    eax,DWORD PTR [rsi+0x188]
 162ce16:	48 8d 0c 02          	lea    rcx,[rdx+rax*1]
 162ce1a:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 162ce1f:	4c 39 f0             	cmp    rax,r14
 162ce22:	0f 8d 95 00 00 00    	jge    162cebd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2802b>
 162ce28:	4d 89 c4             	mov    r12,r8
 162ce2b:	49 89 f5             	mov    r13,rsi
 162ce2e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 162ce33:	e8 fa 6b 05 00       	call   1683a32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b9e>
 162ce38:	85 c0                	test   eax,eax
 162ce3a:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
 162ce3f:	74 0c                	je     162ce4d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27fbb>
 162ce41:	83 f8 01             	cmp    eax,0x1
 162ce44:	49 81 c5 78 01 00 00 	add    r13,0x178
 162ce4b:	eb 07                	jmp    162ce54 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27fc2>
 162ce4d:	49 81 c5 70 01 00 00 	add    r13,0x170
 162ce54:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
 162ce58:	4d 8d 6c 24 08       	lea    r13,[r12+0x8]
 162ce5d:	4c 89 ef             	mov    rdi,r13
 162ce60:	e8 eb cd 52 ff       	call   b59c50 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6bf0>
 162ce65:	41 8b 6c 24 10       	mov    ebp,DWORD PTR [r12+0x10]
 162ce6a:	41 03 6c 24 0c       	add    ebp,DWORD PTR [r12+0xc]
 162ce6f:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
 162ce74:	4c 89 ef             	mov    rdi,r13
 162ce77:	89 ea                	mov    edx,ebp
 162ce79:	e8 40 69 05 00       	call   16837be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3792a>
 162ce7e:	39 e8                	cmp    eax,ebp
 162ce80:	75 3b                	jne    162cebd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2802b>
 162ce82:	49 8b 54 24 18       	mov    rdx,QWORD PTR [r12+0x18]
 162ce87:	49 8b 4c 24 20       	mov    rcx,QWORD PTR [r12+0x20]
 162ce8c:	49 8b b4 24 90 00 00 	mov    rsi,QWORD PTR [r12+0x90]
 162ce93:	00
 162ce94:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 162ce97:	48 8b 80 b0 00 00 00 	mov    rax,QWORD PTR [rax+0xb0]
 162ce9e:	64 48 8b 3c 25 28 00 	mov    rdi,QWORD PTR fs:0x28
 162cea5:	00 00
 162cea7:	48 3b 7c 24 30       	cmp    rdi,QWORD PTR [rsp+0x30]
 162ceac:	75 49                	jne    162cef7 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28065>
 162ceae:	48 29 d1             	sub    rcx,rdx
 162ceb1:	48 89 df             	mov    rdi,rbx
 162ceb4:	4c 8b 44 24 08       	mov    r8,QWORD PTR [rsp+0x8]
 162ceb9:	ff d0                	call   rax
 162cebb:	eb 28                	jmp    162cee5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28053>
 162cebd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162cec4:	00 00
 162cec6:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 162cecb:	75 2a                	jne    162cef7 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28065>
 162cecd:	48 8d 0d a8 50 e2 fe 	lea    rcx,[rip+0xfffffffffee250a8]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 162ced4:	48 89 df             	mov    rdi,rbx
 162ced7:	4c 89 fe             	mov    rsi,r15
 162ceda:	4c 89 f2             	mov    rdx,r14
 162cedd:	45 31 c0             	xor    r8d,r8d
 162cee0:	e8 97 92 48 ff       	call   ab617c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x311c>
 162cee5:	48 89 d8             	mov    rax,rbx
 162cee8:	48 83 c4 38          	add    rsp,0x38
 162ceec:	5b                   	pop    rbx
 162ceed:	41 5c                	pop    r12
 162ceef:	41 5d                	pop    r13
 162cef1:	41 5e                	pop    r14
 162cef3:	41 5f                	pop    r15
 162cef5:	5d                   	pop    rbp
 162cef6:	c3                   	ret
```
### AP `0x1890240` +0x28 -> `0x162d7b2` score 14

```text
 162d7b2:	48 81 c7 b0 01 00 00 	add    rdi,0x1b0
 162d7b9:	e9 fe 48 05 00       	jmp    16820bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36228>
 162d7be:	48 81 c7 b0 01 00 00 	add    rdi,0x1b0
 162d7c5:	e9 4c 49 05 00       	jmp    1682116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36282>
 162d7ca:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 162d7d1:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
 162d7d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162d7db:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
 162d7e2:	ff e0                	jmp    rax
 162d7e4:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 162d7eb:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
 162d7f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162d7f5:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
 162d7fc:	ff e0                	jmp    rax
 162d7fe:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 162d805:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
 162d80c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162d80f:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
 162d816:	ff e0                	jmp    rax
 162d818:	55                   	push   rbp
 162d819:	41 57                	push   r15
 162d81b:	41 56                	push   r14
 162d81d:	41 55                	push   r13
 162d81f:	41 54                	push   r12
 162d821:	53                   	push   rbx
 162d822:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
 162d829:	4c 89 44 24 08       	mov    QWORD PTR [rsp+0x8],r8
 162d82e:	49 89 ce             	mov    r14,rcx
 162d831:	49 89 d7             	mov    r15,rdx
 162d834:	49 89 f5             	mov    r13,rsi
 162d837:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
 162d83b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162d842:	00 00
 162d844:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
 162d84b:	00
 162d84c:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
 162d851:	48 89 55 00          	mov    QWORD PTR [rbp+0x0],rdx
 162d855:	48 89 4d 08          	mov    QWORD PTR [rbp+0x8],rcx
 162d859:	4c 8d 66 40          	lea    r12,[rsi+0x40]
 162d85d:	48 83 c6 58          	add    rsi,0x58
 162d861:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
 162d866:	48 89 df             	mov    rdi,rbx
 162d869:	e8 22 cb 52 ff       	call   b5a390 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa7330>
 162d86e:	48 8d 4c 24 14       	lea    rcx,[rsp+0x14]
 162d873:	83 21 00             	and    DWORD PTR [rcx],0x0
 162d876:	4c 89 e7             	mov    rdi,r12
 162d879:	48 89 ee             	mov    rsi,rbp
 162d87c:	48 89 da             	mov    rdx,rbx
 162d87f:	e8 04 4d 05 00       	call   1682588 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f4>
 162d884:	84 c0                	test   al,al
 162d886:	74 4b                	je     162d8d3 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a41>
 162d888:	83 7c 24 14 00       	cmp    DWORD PTR [rsp+0x14],0x0
 162d88d:	74 55                	je     162d8e4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a52>
 162d88f:	49 8d 9d f8 00 00 00 	lea    rbx,[r13+0xf8]
 162d896:	49 8d b5 10 01 00 00 	lea    rsi,[r13+0x110]
 162d89d:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 162d8a2:	4c 89 e7             	mov    rdi,r12
 162d8a5:	e8 e8 5b 05 00       	call   1683492 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375fe>
 162d8aa:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 162d8af:	48 8d 4c 24 14       	lea    rcx,[rsp+0x14]
 162d8b4:	48 89 df             	mov    rdi,rbx
 162d8b7:	4c 89 e2             	mov    rdx,r12
 162d8ba:	e8 c9 4c 05 00       	call   1682588 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f4>
 162d8bf:	84 c0                	test   al,al
 162d8c1:	74 50                	je     162d913 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a81>
 162d8c3:	83 7c 24 14 01       	cmp    DWORD PTR [rsp+0x14],0x1
 162d8c8:	75 49                	jne    162d913 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a81>
 162d8ca:	49 81 c5 a8 01 00 00 	add    r13,0x1a8
 162d8d1:	eb 18                	jmp    162d8eb <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a59>
 162d8d3:	48 8d 3d f8 78 d5 fe 	lea    rdi,[rip+0xfffffffffed578f8]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d8da:	6a 0e                	push   0xe
 162d8dc:	5e                   	pop    rsi
 162d8dd:	e8 2e 0c 1c 00       	call   17ee510 <__strlen_chk@plt>
 162d8e2:	eb 3e                	jmp    162d922 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a90>
 162d8e4:	49 81 c5 f0 00 00 00 	add    r13,0xf0
 162d8eb:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
 162d8ef:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
 162d8f4:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
 162d8f9:	48 29 d1             	sub    rcx,rdx
 162d8fc:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 162d8ff:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 162d903:	48 89 df             	mov    rdi,rbx
 162d906:	4c 8b 44 24 08       	mov    r8,QWORD PTR [rsp+0x8]
 162d90b:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 162d911:	eb 2b                	jmp    162d93e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28aac>
 162d913:	48 8d 3d b8 78 d5 fe 	lea    rdi,[rip+0xfffffffffed578b8]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d91a:	6a 0e                	push   0xe
 162d91c:	5e                   	pop    rsi
 162d91d:	e8 ee 0b 1c 00       	call   17ee510 <__strlen_chk@plt>
 162d922:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 162d926:	48 8d 35 a5 78 d5 fe 	lea    rsi,[rip+0xfffffffffed578a5]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d92d:	48 89 df             	mov    rdi,rbx
 162d930:	48 89 c2             	mov    rdx,rax
 162d933:	4c 89 f9             	mov    rcx,r15
 162d936:	4d 89 f0             	mov    r8,r14
 162d939:	e8 ec 5c f9 ff       	call   15c362a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408bae>
 162d93e:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 162d943:	e8 ac 59 05 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
 162d948:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162d94f:	00 00
 162d951:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
 162d958:	00
 162d959:	75 41                	jne    162d99c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28b0a>
 162d95b:	48 89 d8             	mov    rax,rbx
 162d95e:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
 162d965:	5b                   	pop    rbx
 162d966:	41 5c                	pop    r12
 162d968:	41 5d                	pop    r13
 162d96a:	41 5e                	pop    r14
 162d96c:	41 5f                	pop    r15
 162d96e:	5d                   	pop    rbp
 162d96f:	c3                   	ret
```
### AP `0x1890248` +0x28 -> `0x162d7be` score 14

```text
 162d7be:	48 81 c7 b0 01 00 00 	add    rdi,0x1b0
 162d7c5:	e9 4c 49 05 00       	jmp    1682116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36282>
 162d7ca:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 162d7d1:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
 162d7d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162d7db:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
 162d7e2:	ff e0                	jmp    rax
 162d7e4:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 162d7eb:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
 162d7f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162d7f5:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
 162d7fc:	ff e0                	jmp    rax
 162d7fe:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 162d805:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
 162d80c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162d80f:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
 162d816:	ff e0                	jmp    rax
 162d818:	55                   	push   rbp
 162d819:	41 57                	push   r15
 162d81b:	41 56                	push   r14
 162d81d:	41 55                	push   r13
 162d81f:	41 54                	push   r12
 162d821:	53                   	push   rbx
 162d822:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
 162d829:	4c 89 44 24 08       	mov    QWORD PTR [rsp+0x8],r8
 162d82e:	49 89 ce             	mov    r14,rcx
 162d831:	49 89 d7             	mov    r15,rdx
 162d834:	49 89 f5             	mov    r13,rsi
 162d837:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
 162d83b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162d842:	00 00
 162d844:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
 162d84b:	00
 162d84c:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
 162d851:	48 89 55 00          	mov    QWORD PTR [rbp+0x0],rdx
 162d855:	48 89 4d 08          	mov    QWORD PTR [rbp+0x8],rcx
 162d859:	4c 8d 66 40          	lea    r12,[rsi+0x40]
 162d85d:	48 83 c6 58          	add    rsi,0x58
 162d861:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
 162d866:	48 89 df             	mov    rdi,rbx
 162d869:	e8 22 cb 52 ff       	call   b5a390 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa7330>
 162d86e:	48 8d 4c 24 14       	lea    rcx,[rsp+0x14]
 162d873:	83 21 00             	and    DWORD PTR [rcx],0x0
 162d876:	4c 89 e7             	mov    rdi,r12
 162d879:	48 89 ee             	mov    rsi,rbp
 162d87c:	48 89 da             	mov    rdx,rbx
 162d87f:	e8 04 4d 05 00       	call   1682588 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f4>
 162d884:	84 c0                	test   al,al
 162d886:	74 4b                	je     162d8d3 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a41>
 162d888:	83 7c 24 14 00       	cmp    DWORD PTR [rsp+0x14],0x0
 162d88d:	74 55                	je     162d8e4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a52>
 162d88f:	49 8d 9d f8 00 00 00 	lea    rbx,[r13+0xf8]
 162d896:	49 8d b5 10 01 00 00 	lea    rsi,[r13+0x110]
 162d89d:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 162d8a2:	4c 89 e7             	mov    rdi,r12
 162d8a5:	e8 e8 5b 05 00       	call   1683492 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375fe>
 162d8aa:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 162d8af:	48 8d 4c 24 14       	lea    rcx,[rsp+0x14]
 162d8b4:	48 89 df             	mov    rdi,rbx
 162d8b7:	4c 89 e2             	mov    rdx,r12
 162d8ba:	e8 c9 4c 05 00       	call   1682588 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f4>
 162d8bf:	84 c0                	test   al,al
 162d8c1:	74 50                	je     162d913 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a81>
 162d8c3:	83 7c 24 14 01       	cmp    DWORD PTR [rsp+0x14],0x1
 162d8c8:	75 49                	jne    162d913 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a81>
 162d8ca:	49 81 c5 a8 01 00 00 	add    r13,0x1a8
 162d8d1:	eb 18                	jmp    162d8eb <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a59>
 162d8d3:	48 8d 3d f8 78 d5 fe 	lea    rdi,[rip+0xfffffffffed578f8]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d8da:	6a 0e                	push   0xe
 162d8dc:	5e                   	pop    rsi
 162d8dd:	e8 2e 0c 1c 00       	call   17ee510 <__strlen_chk@plt>
 162d8e2:	eb 3e                	jmp    162d922 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a90>
 162d8e4:	49 81 c5 f0 00 00 00 	add    r13,0xf0
 162d8eb:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
 162d8ef:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
 162d8f4:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
 162d8f9:	48 29 d1             	sub    rcx,rdx
 162d8fc:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 162d8ff:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 162d903:	48 89 df             	mov    rdi,rbx
 162d906:	4c 8b 44 24 08       	mov    r8,QWORD PTR [rsp+0x8]
 162d90b:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 162d911:	eb 2b                	jmp    162d93e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28aac>
 162d913:	48 8d 3d b8 78 d5 fe 	lea    rdi,[rip+0xfffffffffed578b8]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d91a:	6a 0e                	push   0xe
 162d91c:	5e                   	pop    rsi
 162d91d:	e8 ee 0b 1c 00       	call   17ee510 <__strlen_chk@plt>
 162d922:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 162d926:	48 8d 35 a5 78 d5 fe 	lea    rsi,[rip+0xfffffffffed578a5]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d92d:	48 89 df             	mov    rdi,rbx
 162d930:	48 89 c2             	mov    rdx,rax
 162d933:	4c 89 f9             	mov    rcx,r15
 162d936:	4d 89 f0             	mov    r8,r14
 162d939:	e8 ec 5c f9 ff       	call   15c362a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408bae>
 162d93e:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 162d943:	e8 ac 59 05 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
 162d948:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162d94f:	00 00
 162d951:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
 162d958:	00
 162d959:	75 41                	jne    162d99c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28b0a>
 162d95b:	48 89 d8             	mov    rax,rbx
 162d95e:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
 162d965:	5b                   	pop    rbx
 162d966:	41 5c                	pop    r12
 162d968:	41 5d                	pop    r13
 162d96a:	41 5e                	pop    r14
 162d96c:	41 5f                	pop    r15
 162d96e:	5d                   	pop    rbp
 162d96f:	c3                   	ret
```
### AP `0x1890260` +0x28 -> `0x162d7ca` score 14

```text
 162d7ca:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 162d7d1:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
 162d7d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162d7db:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
 162d7e2:	ff e0                	jmp    rax
 162d7e4:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 162d7eb:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
 162d7f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162d7f5:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
 162d7fc:	ff e0                	jmp    rax
 162d7fe:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 162d805:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
 162d80c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162d80f:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
 162d816:	ff e0                	jmp    rax
 162d818:	55                   	push   rbp
 162d819:	41 57                	push   r15
 162d81b:	41 56                	push   r14
 162d81d:	41 55                	push   r13
 162d81f:	41 54                	push   r12
 162d821:	53                   	push   rbx
 162d822:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
 162d829:	4c 89 44 24 08       	mov    QWORD PTR [rsp+0x8],r8
 162d82e:	49 89 ce             	mov    r14,rcx
 162d831:	49 89 d7             	mov    r15,rdx
 162d834:	49 89 f5             	mov    r13,rsi
 162d837:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
 162d83b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162d842:	00 00
 162d844:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
 162d84b:	00
 162d84c:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
 162d851:	48 89 55 00          	mov    QWORD PTR [rbp+0x0],rdx
 162d855:	48 89 4d 08          	mov    QWORD PTR [rbp+0x8],rcx
 162d859:	4c 8d 66 40          	lea    r12,[rsi+0x40]
 162d85d:	48 83 c6 58          	add    rsi,0x58
 162d861:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
 162d866:	48 89 df             	mov    rdi,rbx
 162d869:	e8 22 cb 52 ff       	call   b5a390 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa7330>
 162d86e:	48 8d 4c 24 14       	lea    rcx,[rsp+0x14]
 162d873:	83 21 00             	and    DWORD PTR [rcx],0x0
 162d876:	4c 89 e7             	mov    rdi,r12
 162d879:	48 89 ee             	mov    rsi,rbp
 162d87c:	48 89 da             	mov    rdx,rbx
 162d87f:	e8 04 4d 05 00       	call   1682588 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f4>
 162d884:	84 c0                	test   al,al
 162d886:	74 4b                	je     162d8d3 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a41>
 162d888:	83 7c 24 14 00       	cmp    DWORD PTR [rsp+0x14],0x0
 162d88d:	74 55                	je     162d8e4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a52>
 162d88f:	49 8d 9d f8 00 00 00 	lea    rbx,[r13+0xf8]
 162d896:	49 8d b5 10 01 00 00 	lea    rsi,[r13+0x110]
 162d89d:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 162d8a2:	4c 89 e7             	mov    rdi,r12
 162d8a5:	e8 e8 5b 05 00       	call   1683492 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375fe>
 162d8aa:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 162d8af:	48 8d 4c 24 14       	lea    rcx,[rsp+0x14]
 162d8b4:	48 89 df             	mov    rdi,rbx
 162d8b7:	4c 89 e2             	mov    rdx,r12
 162d8ba:	e8 c9 4c 05 00       	call   1682588 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f4>
 162d8bf:	84 c0                	test   al,al
 162d8c1:	74 50                	je     162d913 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a81>
 162d8c3:	83 7c 24 14 01       	cmp    DWORD PTR [rsp+0x14],0x1
 162d8c8:	75 49                	jne    162d913 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a81>
 162d8ca:	49 81 c5 a8 01 00 00 	add    r13,0x1a8
 162d8d1:	eb 18                	jmp    162d8eb <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a59>
 162d8d3:	48 8d 3d f8 78 d5 fe 	lea    rdi,[rip+0xfffffffffed578f8]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d8da:	6a 0e                	push   0xe
 162d8dc:	5e                   	pop    rsi
 162d8dd:	e8 2e 0c 1c 00       	call   17ee510 <__strlen_chk@plt>
 162d8e2:	eb 3e                	jmp    162d922 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a90>
 162d8e4:	49 81 c5 f0 00 00 00 	add    r13,0xf0
 162d8eb:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
 162d8ef:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
 162d8f4:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
 162d8f9:	48 29 d1             	sub    rcx,rdx
 162d8fc:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 162d8ff:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 162d903:	48 89 df             	mov    rdi,rbx
 162d906:	4c 8b 44 24 08       	mov    r8,QWORD PTR [rsp+0x8]
 162d90b:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 162d911:	eb 2b                	jmp    162d93e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28aac>
 162d913:	48 8d 3d b8 78 d5 fe 	lea    rdi,[rip+0xfffffffffed578b8]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d91a:	6a 0e                	push   0xe
 162d91c:	5e                   	pop    rsi
 162d91d:	e8 ee 0b 1c 00       	call   17ee510 <__strlen_chk@plt>
 162d922:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 162d926:	48 8d 35 a5 78 d5 fe 	lea    rsi,[rip+0xfffffffffed578a5]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d92d:	48 89 df             	mov    rdi,rbx
 162d930:	48 89 c2             	mov    rdx,rax
 162d933:	4c 89 f9             	mov    rcx,r15
 162d936:	4d 89 f0             	mov    r8,r14
 162d939:	e8 ec 5c f9 ff       	call   15c362a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408bae>
 162d93e:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 162d943:	e8 ac 59 05 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
 162d948:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162d94f:	00 00
 162d951:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
 162d958:	00
 162d959:	75 41                	jne    162d99c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28b0a>
 162d95b:	48 89 d8             	mov    rax,rbx
 162d95e:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
 162d965:	5b                   	pop    rbx
 162d966:	41 5c                	pop    r12
 162d968:	41 5d                	pop    r13
 162d96a:	41 5e                	pop    r14
 162d96c:	41 5f                	pop    r15
 162d96e:	5d                   	pop    rbp
 162d96f:	c3                   	ret
```
### AP `0x1890268` +0x28 -> `0x162d7e4` score 14

```text
 162d7e4:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 162d7eb:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
 162d7f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162d7f5:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
 162d7fc:	ff e0                	jmp    rax
 162d7fe:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 162d805:	48 8b b8 b0 00 00 00 	mov    rdi,QWORD PTR [rax+0xb0]
 162d80c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 162d80f:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
 162d816:	ff e0                	jmp    rax
 162d818:	55                   	push   rbp
 162d819:	41 57                	push   r15
 162d81b:	41 56                	push   r14
 162d81d:	41 55                	push   r13
 162d81f:	41 54                	push   r12
 162d821:	53                   	push   rbx
 162d822:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
 162d829:	4c 89 44 24 08       	mov    QWORD PTR [rsp+0x8],r8
 162d82e:	49 89 ce             	mov    r14,rcx
 162d831:	49 89 d7             	mov    r15,rdx
 162d834:	49 89 f5             	mov    r13,rsi
 162d837:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
 162d83b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162d842:	00 00
 162d844:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
 162d84b:	00
 162d84c:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
 162d851:	48 89 55 00          	mov    QWORD PTR [rbp+0x0],rdx
 162d855:	48 89 4d 08          	mov    QWORD PTR [rbp+0x8],rcx
 162d859:	4c 8d 66 40          	lea    r12,[rsi+0x40]
 162d85d:	48 83 c6 58          	add    rsi,0x58
 162d861:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
 162d866:	48 89 df             	mov    rdi,rbx
 162d869:	e8 22 cb 52 ff       	call   b5a390 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa7330>
 162d86e:	48 8d 4c 24 14       	lea    rcx,[rsp+0x14]
 162d873:	83 21 00             	and    DWORD PTR [rcx],0x0
 162d876:	4c 89 e7             	mov    rdi,r12
 162d879:	48 89 ee             	mov    rsi,rbp
 162d87c:	48 89 da             	mov    rdx,rbx
 162d87f:	e8 04 4d 05 00       	call   1682588 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f4>
 162d884:	84 c0                	test   al,al
 162d886:	74 4b                	je     162d8d3 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a41>
 162d888:	83 7c 24 14 00       	cmp    DWORD PTR [rsp+0x14],0x0
 162d88d:	74 55                	je     162d8e4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a52>
 162d88f:	49 8d 9d f8 00 00 00 	lea    rbx,[r13+0xf8]
 162d896:	49 8d b5 10 01 00 00 	lea    rsi,[r13+0x110]
 162d89d:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 162d8a2:	4c 89 e7             	mov    rdi,r12
 162d8a5:	e8 e8 5b 05 00       	call   1683492 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375fe>
 162d8aa:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 162d8af:	48 8d 4c 24 14       	lea    rcx,[rsp+0x14]
 162d8b4:	48 89 df             	mov    rdi,rbx
 162d8b7:	4c 89 e2             	mov    rdx,r12
 162d8ba:	e8 c9 4c 05 00       	call   1682588 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f4>
 162d8bf:	84 c0                	test   al,al
 162d8c1:	74 50                	je     162d913 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a81>
 162d8c3:	83 7c 24 14 01       	cmp    DWORD PTR [rsp+0x14],0x1
 162d8c8:	75 49                	jne    162d913 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a81>
 162d8ca:	49 81 c5 a8 01 00 00 	add    r13,0x1a8
 162d8d1:	eb 18                	jmp    162d8eb <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a59>
 162d8d3:	48 8d 3d f8 78 d5 fe 	lea    rdi,[rip+0xfffffffffed578f8]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d8da:	6a 0e                	push   0xe
 162d8dc:	5e                   	pop    rsi
 162d8dd:	e8 2e 0c 1c 00       	call   17ee510 <__strlen_chk@plt>
 162d8e2:	eb 3e                	jmp    162d922 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28a90>
 162d8e4:	49 81 c5 f0 00 00 00 	add    r13,0xf0
 162d8eb:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
 162d8ef:	48 8b 54 24 38       	mov    rdx,QWORD PTR [rsp+0x38]
 162d8f4:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
 162d8f9:	48 29 d1             	sub    rcx,rdx
 162d8fc:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 162d8ff:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 162d903:	48 89 df             	mov    rdi,rbx
 162d906:	4c 8b 44 24 08       	mov    r8,QWORD PTR [rsp+0x8]
 162d90b:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 162d911:	eb 2b                	jmp    162d93e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28aac>
 162d913:	48 8d 3d b8 78 d5 fe 	lea    rdi,[rip+0xfffffffffed578b8]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d91a:	6a 0e                	push   0xe
 162d91c:	5e                   	pop    rsi
 162d91d:	e8 ee 0b 1c 00       	call   17ee510 <__strlen_chk@plt>
 162d922:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
 162d926:	48 8d 35 a5 78 d5 fe 	lea    rsi,[rip+0xfffffffffed578a5]        # 3851d2 <_ZTSSt12bad_any_cast@@Base-0xaff6>
 162d92d:	48 89 df             	mov    rdi,rbx
 162d930:	48 89 c2             	mov    rdx,rax
 162d933:	4c 89 f9             	mov    rcx,r15
 162d936:	4d 89 f0             	mov    r8,r14
 162d939:	e8 ec 5c f9 ff       	call   15c362a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408bae>
 162d93e:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 162d943:	e8 ac 59 05 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
 162d948:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 162d94f:	00 00
 162d951:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
 162d958:	00
 162d959:	75 41                	jne    162d99c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28b0a>
 162d95b:	48 89 d8             	mov    rax,rbx
 162d95e:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
 162d965:	5b                   	pop    rbx
 162d966:	41 5c                	pop    r12
 162d968:	41 5d                	pop    r13
 162d96a:	41 5e                	pop    r14
 162d96c:	41 5f                	pop    r15
 162d96e:	5d                   	pop    rbp
 162d96f:	c3                   	ret
```
### AP `0x18af480` +0x28 -> `0xa92954` score 14

```text
  a92954:	48 8d 3d 55 cc e8 00 	lea    rdi,[rip+0xe8cc55]        # 191f5b0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x669c0>
  a9295b:	e9 67 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92960:	48 8d 3d 09 cf e8 00 	lea    rdi,[rip+0xe8cf09]        # 191f870 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x66c80>
  a92967:	e9 5b 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a9296c:	48 8d 3d 8d d9 e8 00 	lea    rdi,[rip+0xe8d98d]        # 1920300 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x67710>
  a92973:	e9 4f 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92978:	48 8d 3d 49 dc e8 00 	lea    rdi,[rip+0xe8dc49]        # 19205c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x679d8>
  a9297f:	e9 43 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92984:	48 8d 3d d5 e1 e8 00 	lea    rdi,[rip+0xe8e1d5]        # 1920b60 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x67f70>
  a9298b:	e9 37 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92990:	48 8d 3d 81 e6 e8 00 	lea    rdi,[rip+0xe8e681]        # 1921018 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x68428>
  a92997:	e9 2b 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a9299c:	48 8d 3d 2d f9 e8 00 	lea    rdi,[rip+0xe8f92d]        # 19222d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x696e0>
  a929a3:	e9 1f 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929a8:	48 8d 3d 59 08 e9 00 	lea    rdi,[rip+0xe90859]        # 1923208 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6a618>
  a929af:	e9 13 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929b4:	48 8d 3d 2d 10 e9 00 	lea    rdi,[rip+0xe9102d]        # 19239e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6adf8>
  a929bb:	e9 07 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929c0:	48 8d 3d 49 18 e9 00 	lea    rdi,[rip+0xe91849]        # 1924210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b620>
  a929c7:	e9 fb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929cc:	48 8d 3d e5 1c e9 00 	lea    rdi,[rip+0xe91ce5]        # 19246b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6bac8>
  a929d3:	e9 ef 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
```
### AP `0x18af488` +0x28 -> `0xa92960` score 14

```text
  a92960:	48 8d 3d 09 cf e8 00 	lea    rdi,[rip+0xe8cf09]        # 191f870 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x66c80>
  a92967:	e9 5b 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a9296c:	48 8d 3d 8d d9 e8 00 	lea    rdi,[rip+0xe8d98d]        # 1920300 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x67710>
  a92973:	e9 4f 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92978:	48 8d 3d 49 dc e8 00 	lea    rdi,[rip+0xe8dc49]        # 19205c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x679d8>
  a9297f:	e9 43 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92984:	48 8d 3d d5 e1 e8 00 	lea    rdi,[rip+0xe8e1d5]        # 1920b60 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x67f70>
  a9298b:	e9 37 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92990:	48 8d 3d 81 e6 e8 00 	lea    rdi,[rip+0xe8e681]        # 1921018 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x68428>
  a92997:	e9 2b 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a9299c:	48 8d 3d 2d f9 e8 00 	lea    rdi,[rip+0xe8f92d]        # 19222d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x696e0>
  a929a3:	e9 1f 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929a8:	48 8d 3d 59 08 e9 00 	lea    rdi,[rip+0xe90859]        # 1923208 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6a618>
  a929af:	e9 13 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929b4:	48 8d 3d 2d 10 e9 00 	lea    rdi,[rip+0xe9102d]        # 19239e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6adf8>
  a929bb:	e9 07 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929c0:	48 8d 3d 49 18 e9 00 	lea    rdi,[rip+0xe91849]        # 1924210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b620>
  a929c7:	e9 fb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929cc:	48 8d 3d e5 1c e9 00 	lea    rdi,[rip+0xe91ce5]        # 19246b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6bac8>
  a929d3:	e9 ef 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
```
### AP `0x18af490` +0x28 -> `0xa9296c` score 14

```text
  a9296c:	48 8d 3d 8d d9 e8 00 	lea    rdi,[rip+0xe8d98d]        # 1920300 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x67710>
  a92973:	e9 4f 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92978:	48 8d 3d 49 dc e8 00 	lea    rdi,[rip+0xe8dc49]        # 19205c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x679d8>
  a9297f:	e9 43 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92984:	48 8d 3d d5 e1 e8 00 	lea    rdi,[rip+0xe8e1d5]        # 1920b60 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x67f70>
  a9298b:	e9 37 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92990:	48 8d 3d 81 e6 e8 00 	lea    rdi,[rip+0xe8e681]        # 1921018 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x68428>
  a92997:	e9 2b 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a9299c:	48 8d 3d 2d f9 e8 00 	lea    rdi,[rip+0xe8f92d]        # 19222d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x696e0>
  a929a3:	e9 1f 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929a8:	48 8d 3d 59 08 e9 00 	lea    rdi,[rip+0xe90859]        # 1923208 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6a618>
  a929af:	e9 13 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929b4:	48 8d 3d 2d 10 e9 00 	lea    rdi,[rip+0xe9102d]        # 19239e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6adf8>
  a929bb:	e9 07 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929c0:	48 8d 3d 49 18 e9 00 	lea    rdi,[rip+0xe91849]        # 1924210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b620>
  a929c7:	e9 fb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929cc:	48 8d 3d e5 1c e9 00 	lea    rdi,[rip+0xe91ce5]        # 19246b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6bac8>
  a929d3:	e9 ef 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
```
### AP `0x18af498` +0x28 -> `0xa92978` score 14

```text
  a92978:	48 8d 3d 49 dc e8 00 	lea    rdi,[rip+0xe8dc49]        # 19205c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x679d8>
  a9297f:	e9 43 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92984:	48 8d 3d d5 e1 e8 00 	lea    rdi,[rip+0xe8e1d5]        # 1920b60 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x67f70>
  a9298b:	e9 37 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92990:	48 8d 3d 81 e6 e8 00 	lea    rdi,[rip+0xe8e681]        # 1921018 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x68428>
  a92997:	e9 2b 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a9299c:	48 8d 3d 2d f9 e8 00 	lea    rdi,[rip+0xe8f92d]        # 19222d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x696e0>
  a929a3:	e9 1f 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929a8:	48 8d 3d 59 08 e9 00 	lea    rdi,[rip+0xe90859]        # 1923208 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6a618>
  a929af:	e9 13 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929b4:	48 8d 3d 2d 10 e9 00 	lea    rdi,[rip+0xe9102d]        # 19239e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6adf8>
  a929bb:	e9 07 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929c0:	48 8d 3d 49 18 e9 00 	lea    rdi,[rip+0xe91849]        # 1924210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b620>
  a929c7:	e9 fb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929cc:	48 8d 3d e5 1c e9 00 	lea    rdi,[rip+0xe91ce5]        # 19246b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6bac8>
  a929d3:	e9 ef 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
```
### AP `0x18af4a0` +0x28 -> `0xa92984` score 14

```text
  a92984:	48 8d 3d d5 e1 e8 00 	lea    rdi,[rip+0xe8e1d5]        # 1920b60 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x67f70>
  a9298b:	e9 37 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92990:	48 8d 3d 81 e6 e8 00 	lea    rdi,[rip+0xe8e681]        # 1921018 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x68428>
  a92997:	e9 2b 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a9299c:	48 8d 3d 2d f9 e8 00 	lea    rdi,[rip+0xe8f92d]        # 19222d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x696e0>
  a929a3:	e9 1f 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929a8:	48 8d 3d 59 08 e9 00 	lea    rdi,[rip+0xe90859]        # 1923208 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6a618>
  a929af:	e9 13 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929b4:	48 8d 3d 2d 10 e9 00 	lea    rdi,[rip+0xe9102d]        # 19239e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6adf8>
  a929bb:	e9 07 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929c0:	48 8d 3d 49 18 e9 00 	lea    rdi,[rip+0xe91849]        # 1924210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b620>
  a929c7:	e9 fb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929cc:	48 8d 3d e5 1c e9 00 	lea    rdi,[rip+0xe91ce5]        # 19246b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6bac8>
  a929d3:	e9 ef 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
```
### AP `0x18af4a8` +0x28 -> `0xa92990` score 14

```text
  a92990:	48 8d 3d 81 e6 e8 00 	lea    rdi,[rip+0xe8e681]        # 1921018 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x68428>
  a92997:	e9 2b 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a9299c:	48 8d 3d 2d f9 e8 00 	lea    rdi,[rip+0xe8f92d]        # 19222d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x696e0>
  a929a3:	e9 1f 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929a8:	48 8d 3d 59 08 e9 00 	lea    rdi,[rip+0xe90859]        # 1923208 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6a618>
  a929af:	e9 13 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929b4:	48 8d 3d 2d 10 e9 00 	lea    rdi,[rip+0xe9102d]        # 19239e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6adf8>
  a929bb:	e9 07 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929c0:	48 8d 3d 49 18 e9 00 	lea    rdi,[rip+0xe91849]        # 1924210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b620>
  a929c7:	e9 fb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929cc:	48 8d 3d e5 1c e9 00 	lea    rdi,[rip+0xe91ce5]        # 19246b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6bac8>
  a929d3:	e9 ef 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
```
### AP `0x18af4b0` +0x28 -> `0xa9299c` score 14

```text
  a9299c:	48 8d 3d 2d f9 e8 00 	lea    rdi,[rip+0xe8f92d]        # 19222d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x696e0>
  a929a3:	e9 1f 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929a8:	48 8d 3d 59 08 e9 00 	lea    rdi,[rip+0xe90859]        # 1923208 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6a618>
  a929af:	e9 13 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929b4:	48 8d 3d 2d 10 e9 00 	lea    rdi,[rip+0xe9102d]        # 19239e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6adf8>
  a929bb:	e9 07 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929c0:	48 8d 3d 49 18 e9 00 	lea    rdi,[rip+0xe91849]        # 1924210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b620>
  a929c7:	e9 fb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929cc:	48 8d 3d e5 1c e9 00 	lea    rdi,[rip+0xe91ce5]        # 19246b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6bac8>
  a929d3:	e9 ef 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
```
### AP `0x18af4b8` +0x28 -> `0xa929a8` score 14

```text
  a929a8:	48 8d 3d 59 08 e9 00 	lea    rdi,[rip+0xe90859]        # 1923208 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6a618>
  a929af:	e9 13 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929b4:	48 8d 3d 2d 10 e9 00 	lea    rdi,[rip+0xe9102d]        # 19239e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6adf8>
  a929bb:	e9 07 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929c0:	48 8d 3d 49 18 e9 00 	lea    rdi,[rip+0xe91849]        # 1924210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b620>
  a929c7:	e9 fb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929cc:	48 8d 3d e5 1c e9 00 	lea    rdi,[rip+0xe91ce5]        # 19246b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6bac8>
  a929d3:	e9 ef 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c64:	53                   	push   rbx
  a92c65:	48 8d 1d 44 c1 f5 00 	lea    rbx,[rip+0xf5c144]        # 19eedb0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4e0>
```
### AP `0x18af4c0` +0x28 -> `0xa929b4` score 14

```text
  a929b4:	48 8d 3d 2d 10 e9 00 	lea    rdi,[rip+0xe9102d]        # 19239e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6adf8>
  a929bb:	e9 07 4b cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929c0:	48 8d 3d 49 18 e9 00 	lea    rdi,[rip+0xe91849]        # 1924210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b620>
  a929c7:	e9 fb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929cc:	48 8d 3d e5 1c e9 00 	lea    rdi,[rip+0xe91ce5]        # 19246b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6bac8>
  a929d3:	e9 ef 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c64:	53                   	push   rbx
  a92c65:	48 8d 1d 44 c1 f5 00 	lea    rbx,[rip+0xf5c144]        # 19eedb0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4e0>
  a92c6c:	48 8d 35 00 a4 8a ff 	lea    rsi,[rip+0xffffffffff8aa400]        # 33d073 <_ZTSSt12bad_any_cast@@Base-0x53155>
  a92c73:	48 89 df             	mov    rdi,rbx
```
### AP `0x18af4c8` +0x28 -> `0xa929c0` score 14

```text
  a929c0:	48 8d 3d 49 18 e9 00 	lea    rdi,[rip+0xe91849]        # 1924210 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6b620>
  a929c7:	e9 fb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929cc:	48 8d 3d e5 1c e9 00 	lea    rdi,[rip+0xe91ce5]        # 19246b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6bac8>
  a929d3:	e9 ef 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c64:	53                   	push   rbx
  a92c65:	48 8d 1d 44 c1 f5 00 	lea    rbx,[rip+0xf5c144]        # 19eedb0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4e0>
  a92c6c:	48 8d 35 00 a4 8a ff 	lea    rsi,[rip+0xffffffffff8aa400]        # 33d073 <_ZTSSt12bad_any_cast@@Base-0x53155>
  a92c73:	48 89 df             	mov    rdi,rbx
  a92c76:	e8 03 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c7b:	48 8b 3d be ed e1 00 	mov    rdi,QWORD PTR [rip+0xe1edbe]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
```
### AP `0x18af4d0` +0x28 -> `0xa929cc` score 14

```text
  a929cc:	48 8d 3d e5 1c e9 00 	lea    rdi,[rip+0xe91ce5]        # 19246b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6bac8>
  a929d3:	e9 ef 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c64:	53                   	push   rbx
  a92c65:	48 8d 1d 44 c1 f5 00 	lea    rbx,[rip+0xf5c144]        # 19eedb0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4e0>
  a92c6c:	48 8d 35 00 a4 8a ff 	lea    rsi,[rip+0xffffffffff8aa400]        # 33d073 <_ZTSSt12bad_any_cast@@Base-0x53155>
  a92c73:	48 89 df             	mov    rdi,rbx
  a92c76:	e8 03 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c7b:	48 8b 3d be ed e1 00 	mov    rdi,QWORD PTR [rip+0xe1edbe]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c82:	48 8d 15 77 13 d6 00 	lea    rdx,[rip+0xd61377]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c89:	48 89 de             	mov    rsi,rbx
```
### AP `0x18af4d8` +0x28 -> `0xa929d8` score 14

```text
  a929d8:	48 8d 3d 69 22 e9 00 	lea    rdi,[rip+0xe92269]        # 1924c48 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c058>
  a929df:	e9 e3 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c64:	53                   	push   rbx
  a92c65:	48 8d 1d 44 c1 f5 00 	lea    rbx,[rip+0xf5c144]        # 19eedb0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4e0>
  a92c6c:	48 8d 35 00 a4 8a ff 	lea    rsi,[rip+0xffffffffff8aa400]        # 33d073 <_ZTSSt12bad_any_cast@@Base-0x53155>
  a92c73:	48 89 df             	mov    rdi,rbx
  a92c76:	e8 03 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c7b:	48 8b 3d be ed e1 00 	mov    rdi,QWORD PTR [rip+0xe1edbe]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c82:	48 8d 15 77 13 d6 00 	lea    rdx,[rip+0xd61377]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c89:	48 89 de             	mov    rsi,rbx
  a92c8c:	5b                   	pop    rbx
  a92c8d:	e9 ce b1 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
```
### AP `0x18af4e0` +0x28 -> `0xa929e4` score 14

```text
  a929e4:	48 8d 3d 1d 26 e9 00 	lea    rdi,[rip+0xe9261d]        # 1925008 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c418>
  a929eb:	e9 d7 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c64:	53                   	push   rbx
  a92c65:	48 8d 1d 44 c1 f5 00 	lea    rbx,[rip+0xf5c144]        # 19eedb0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4e0>
  a92c6c:	48 8d 35 00 a4 8a ff 	lea    rsi,[rip+0xffffffffff8aa400]        # 33d073 <_ZTSSt12bad_any_cast@@Base-0x53155>
  a92c73:	48 89 df             	mov    rdi,rbx
  a92c76:	e8 03 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c7b:	48 8b 3d be ed e1 00 	mov    rdi,QWORD PTR [rip+0xe1edbe]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c82:	48 8d 15 77 13 d6 00 	lea    rdx,[rip+0xd61377]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c89:	48 89 de             	mov    rsi,rbx
  a92c8c:	5b                   	pop    rbx
  a92c8d:	e9 ce b1 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c92:	55                   	push   rbp
  a92c93:	41 57                	push   r15
```
### AP `0x18af4e8` +0x28 -> `0xa929f0` score 14

```text
  a929f0:	48 8d 3d 59 29 e9 00 	lea    rdi,[rip+0xe92959]        # 1925350 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6c760>
  a929f7:	e9 cb 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c64:	53                   	push   rbx
  a92c65:	48 8d 1d 44 c1 f5 00 	lea    rbx,[rip+0xf5c144]        # 19eedb0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4e0>
  a92c6c:	48 8d 35 00 a4 8a ff 	lea    rsi,[rip+0xffffffffff8aa400]        # 33d073 <_ZTSSt12bad_any_cast@@Base-0x53155>
  a92c73:	48 89 df             	mov    rdi,rbx
  a92c76:	e8 03 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c7b:	48 8b 3d be ed e1 00 	mov    rdi,QWORD PTR [rip+0xe1edbe]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c82:	48 8d 15 77 13 d6 00 	lea    rdx,[rip+0xd61377]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c89:	48 89 de             	mov    rsi,rbx
  a92c8c:	5b                   	pop    rbx
  a92c8d:	e9 ce b1 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c92:	55                   	push   rbp
  a92c93:	41 57                	push   r15
  a92c95:	41 56                	push   r14
  a92c97:	41 55                	push   r13
```
### AP `0x18af4f0` +0x28 -> `0xa929fc` score 14

```text
  a929fc:	48 8d 3d bd 32 e9 00 	lea    rdi,[rip+0xe932bd]        # 1925cc0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6d0d0>
  a92a03:	e9 bf 4a cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c64:	53                   	push   rbx
  a92c65:	48 8d 1d 44 c1 f5 00 	lea    rbx,[rip+0xf5c144]        # 19eedb0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4e0>
  a92c6c:	48 8d 35 00 a4 8a ff 	lea    rsi,[rip+0xffffffffff8aa400]        # 33d073 <_ZTSSt12bad_any_cast@@Base-0x53155>
  a92c73:	48 89 df             	mov    rdi,rbx
  a92c76:	e8 03 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c7b:	48 8b 3d be ed e1 00 	mov    rdi,QWORD PTR [rip+0xe1edbe]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c82:	48 8d 15 77 13 d6 00 	lea    rdx,[rip+0xd61377]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c89:	48 89 de             	mov    rsi,rbx
  a92c8c:	5b                   	pop    rbx
  a92c8d:	e9 ce b1 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c92:	55                   	push   rbp
  a92c93:	41 57                	push   r15
  a92c95:	41 56                	push   r14
  a92c97:	41 55                	push   r13
  a92c99:	41 54                	push   r12
  a92c9b:	53                   	push   rbx
```
### AP `0x18b0bc8` +0x28 -> `0xa827c3` score 14

```text
  a827c3:	41 57                	push   r15
  a827c5:	41 56                	push   r14
  a827c7:	53                   	push   rbx
  a827c8:	e8 cd df 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a827cd:	e8 0f e0 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a827d2:	e8 51 e0 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a827d7:	e8 93 e0 02 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a827dc:	48 8d 1d c5 33 f6 00 	lea    rbx,[rip+0xf633c5]        # 19e5ba8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x198>
  a827e3:	48 8d 35 d8 e4 8c ff 	lea    rsi,[rip+0xffffffffff8ce4d8]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a827ea:	48 89 df             	mov    rdi,rbx
  a827ed:	e8 8c 72 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a827f2:	4c 8b 35 47 f2 e2 00 	mov    r14,QWORD PTR [rip+0xe2f247]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a827f9:	4c 8d 3d 00 18 d7 00 	lea    r15,[rip+0xd71800]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a82800:	4c 89 f7             	mov    rdi,r14
  a82803:	48 89 de             	mov    rsi,rbx
  a82806:	4c 89 fa             	mov    rdx,r15
  a82809:	e8 52 b6 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a8280e:	48 8d 1d ab 33 f6 00 	lea    rbx,[rip+0xf633ab]        # 19e5bc0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1b0>
  a82815:	48 8d 35 ae d5 8a ff 	lea    rsi,[rip+0xffffffffff8ad5ae]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a8281c:	48 89 df             	mov    rdi,rbx
  a8281f:	e8 5a 72 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a82824:	4c 89 f7             	mov    rdi,r14
  a82827:	48 89 de             	mov    rsi,rbx
  a8282a:	4c 89 fa             	mov    rdx,r15
  a8282d:	5b                   	pop    rbx
  a8282e:	41 5e                	pop    r14
  a82830:	41 5f                	pop    r15
  a82832:	e9 29 b6 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a82837:	53                   	push   rbx
  a82838:	48 8d 1d 99 33 f6 00 	lea    rbx,[rip+0xf63399]        # 19e5bd8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1c8>
  a8283f:	48 8d 35 65 25 8f ff 	lea    rsi,[rip+0xffffffffff8f2565]        # 374dab <_ZTSSt12bad_any_cast@@Base-0x1b41d>
  a82846:	48 89 df             	mov    rdi,rbx
  a82849:	e8 30 72 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a8284e:	48 8b 3d eb f1 e2 00 	mov    rdi,QWORD PTR [rip+0xe2f1eb]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a82855:	48 8d 15 a4 17 d7 00 	lea    rdx,[rip+0xd717a4]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a8285c:	48 89 de             	mov    rsi,rbx
  a8285f:	5b                   	pop    rbx
  a82860:	e9 fb b5 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a82865:	53                   	push   rbx
  a82866:	48 8d 1d 83 33 f6 00 	lea    rbx,[rip+0xf63383]        # 19e5bf0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1e0>
  a8286d:	48 8d 35 ea de 8f ff 	lea    rsi,[rip+0xffffffffff8fdeea]        # 38075e <_ZTSSt12bad_any_cast@@Base-0xfa6a>
  a82874:	48 89 df             	mov    rdi,rbx
  a82877:	e8 02 72 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a8287c:	48 8b 3d bd f1 e2 00 	mov    rdi,QWORD PTR [rip+0xe2f1bd]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a82883:	48 8d 15 76 17 d7 00 	lea    rdx,[rip+0xd71776]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a8288a:	48 89 de             	mov    rsi,rbx
  a8288d:	5b                   	pop    rbx
  a8288e:	e9 cd b5 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a82893:	55                   	push   rbp
  a82894:	41 57                	push   r15
  a82896:	41 56                	push   r14
  a82898:	41 55                	push   r13
  a8289a:	41 54                	push   r12
  a8289c:	53                   	push   rbx
  a8289d:	50                   	push   rax
  a8289e:	4c 8d 35 63 33 f6 00 	lea    r14,[rip+0xf63363]        # 19e5c08 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1f8>
  a828a5:	48 8d 35 83 c3 8a ff 	lea    rsi,[rip+0xffffffffff8ac383]        # 32ec2f <_ZTSSt12bad_any_cast@@Base-0x61599>
  a828ac:	4c 89 f7             	mov    rdi,r14
  a828af:	e8 ca 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a828b4:	4c 8b 3d 85 f1 e2 00 	mov    r15,QWORD PTR [rip+0xe2f185]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a828bb:	48 8d 1d 3e 17 d7 00 	lea    rbx,[rip+0xd7173e]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a828c2:	4c 89 ff             	mov    rdi,r15
  a828c5:	4c 89 f6             	mov    rsi,r14
  a828c8:	48 89 da             	mov    rdx,rbx
  a828cb:	e8 90 b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a828d0:	4c 8d 35 49 33 f6 00 	lea    r14,[rip+0xf63349]        # 19e5c20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x210>
  a828d7:	48 8d 35 7c d6 8c ff 	lea    rsi,[rip+0xffffffffff8cd67c]        # 34ff5a <_ZTSSt12bad_any_cast@@Base-0x4026e>
  a828de:	4c 89 f7             	mov    rdi,r14
  a828e1:	e8 98 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a828e6:	4c 89 ff             	mov    rdi,r15
  a828e9:	4c 89 f6             	mov    rsi,r14
  a828ec:	48 89 da             	mov    rdx,rbx
  a828ef:	e8 6c b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a828f4:	4c 8d 35 3d 33 f6 00 	lea    r14,[rip+0xf6333d]        # 19e5c38 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x228>
  a828fb:	48 8d 35 3a a2 8d ff 	lea    rsi,[rip+0xffffffffff8da23a]        # 35cb3c <_ZTSSt12bad_any_cast@@Base-0x3368c>
  a82902:	4c 89 f7             	mov    rdi,r14
  a82905:	e8 74 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a8290a:	4c 89 ff             	mov    rdi,r15
  a8290d:	4c 89 f6             	mov    rsi,r14
  a82910:	48 89 da             	mov    rdx,rbx
  a82913:	e8 48 b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82918:	48 8d 05 a9 21 db 00 	lea    rax,[rip+0xdb21a9]        # 1834ac8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6a60>
  a8291f:	48 89 05 2a 33 f6 00 	mov    QWORD PTR [rip+0xf6332a],rax        # 19e5c50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x240>
  a82926:	48 8d 35 23 33 f6 00 	lea    rsi,[rip+0xf63323]        # 19e5c50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x240>
  a8292d:	48 89 35 3c 33 f6 00 	mov    QWORD PTR [rip+0xf6333c],rsi        # 19e5c70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x260>
  a82934:	48 8d 05 d5 21 db 00 	lea    rax,[rip+0xdb21d5]        # 1834b10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6aa8>
  a8293b:	48 89 05 3e 33 f6 00 	mov    QWORD PTR [rip+0xf6333e],rax        # 19e5c80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x270>
  a82942:	48 8d 05 37 33 f6 00 	lea    rax,[rip+0xf63337]        # 19e5c80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x270>
  a82949:	48 89 05 50 33 f6 00 	mov    QWORD PTR [rip+0xf63350],rax        # 19e5ca0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x290>
  a82950:	4c 8d 35 5f 8c 46 00 	lea    r14,[rip+0x468c5f]        # eeb5b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb29cc>
  a82957:	4c 89 f7             	mov    rdi,r14
  a8295a:	48 89 da             	mov    rdx,rbx
  a8295d:	e8 fe b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82962:	48 8d 05 ef 21 db 00 	lea    rax,[rip+0xdb21ef]        # 1834b58 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6af0>
  a82969:	48 89 05 40 33 f6 00 	mov    QWORD PTR [rip+0xf63340],rax        # 19e5cb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2a0>
  a82970:	48 8d 35 39 33 f6 00 	lea    rsi,[rip+0xf63339]        # 19e5cb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2a0>
  a82977:	48 89 35 52 33 f6 00 	mov    QWORD PTR [rip+0xf63352],rsi        # 19e5cd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2c0>
  a8297e:	48 8d 05 1b 22 db 00 	lea    rax,[rip+0xdb221b]        # 1834ba0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6b38>
  a82985:	48 89 05 54 33 f6 00 	mov    QWORD PTR [rip+0xf63354],rax        # 19e5ce0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2d0>
  a8298c:	48 8d 05 4d 33 f6 00 	lea    rax,[rip+0xf6334d]        # 19e5ce0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2d0>
  a82993:	48 89 05 66 33 f6 00 	mov    QWORD PTR [rip+0xf63366],rax        # 19e5d00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2f0>
  a8299a:	4c 89 f7             	mov    rdi,r14
  a8299d:	48 89 da             	mov    rdx,rbx
  a829a0:	e8 bb b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a829a5:	48 8d 05 3c 22 db 00 	lea    rax,[rip+0xdb223c]        # 1834be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6b80>
  a829ac:	48 89 05 5d 33 f6 00 	mov    QWORD PTR [rip+0xf6335d],rax        # 19e5d10 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x300>
  a829b3:	48 8d 35 56 33 f6 00 	lea    rsi,[rip+0xf63356]        # 19e5d10 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x300>
  a829ba:	48 89 35 6f 33 f6 00 	mov    QWORD PTR [rip+0xf6336f],rsi        # 19e5d30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x320>
  a829c1:	48 8d 05 68 22 db 00 	lea    rax,[rip+0xdb2268]        # 1834c30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6bc8>
  a829c8:	48 89 05 71 33 f6 00 	mov    QWORD PTR [rip+0xf63371],rax        # 19e5d40 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x330>
  a829cf:	48 8d 05 6a 33 f6 00 	lea    rax,[rip+0xf6336a]        # 19e5d40 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x330>
  a829d6:	48 89 05 83 33 f6 00 	mov    QWORD PTR [rip+0xf63383],rax        # 19e5d60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x350>
  a829dd:	4c 89 f7             	mov    rdi,r14
  a829e0:	48 89 da             	mov    rdx,rbx
  a829e3:	e8 78 b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a829e8:	48 8d 05 89 22 db 00 	lea    rax,[rip+0xdb2289]        # 1834c78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6c10>
  a829ef:	48 89 05 7a 33 f6 00 	mov    QWORD PTR [rip+0xf6337a],rax        # 19e5d70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x360>
  a829f6:	48 8d 35 73 33 f6 00 	lea    rsi,[rip+0xf63373]        # 19e5d70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x360>
  a829fd:	48 89 35 8c 33 f6 00 	mov    QWORD PTR [rip+0xf6338c],rsi        # 19e5d90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x380>
  a82a04:	48 8d 05 b5 22 db 00 	lea    rax,[rip+0xdb22b5]        # 1834cc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6c58>
  a82a0b:	48 89 05 8e 33 f6 00 	mov    QWORD PTR [rip+0xf6338e],rax        # 19e5da0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x390>
  a82a12:	48 8d 05 87 33 f6 00 	lea    rax,[rip+0xf63387]        # 19e5da0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x390>
  a82a19:	48 89 05 a0 33 f6 00 	mov    QWORD PTR [rip+0xf633a0],rax        # 19e5dc0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3b0>
  a82a20:	4c 89 f7             	mov    rdi,r14
  a82a23:	48 89 da             	mov    rdx,rbx
  a82a26:	e8 35 b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82a2b:	48 8d 05 d6 22 db 00 	lea    rax,[rip+0xdb22d6]        # 1834d08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6ca0>
  a82a32:	48 89 05 97 33 f6 00 	mov    QWORD PTR [rip+0xf63397],rax        # 19e5dd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3c0>
  a82a39:	48 8d 35 90 33 f6 00 	lea    rsi,[rip+0xf63390]        # 19e5dd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3c0>
  a82a40:	48 89 35 a9 33 f6 00 	mov    QWORD PTR [rip+0xf633a9],rsi        # 19e5df0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3e0>
  a82a47:	48 8d 05 02 23 db 00 	lea    rax,[rip+0xdb2302]        # 1834d50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6ce8>
  a82a4e:	48 89 05 ab 33 f6 00 	mov    QWORD PTR [rip+0xf633ab],rax        # 19e5e00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3f0>
  a82a55:	48 8d 05 a4 33 f6 00 	lea    rax,[rip+0xf633a4]        # 19e5e00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3f0>
  a82a5c:	48 89 05 bd 33 f6 00 	mov    QWORD PTR [rip+0xf633bd],rax        # 19e5e20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x410>
  a82a63:	4c 89 f7             	mov    rdi,r14
  a82a66:	48 89 da             	mov    rdx,rbx
  a82a69:	e8 f2 b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82a6e:	48 8d 05 23 23 db 00 	lea    rax,[rip+0xdb2323]        # 1834d98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6d30>
  a82a75:	48 89 05 b4 33 f6 00 	mov    QWORD PTR [rip+0xf633b4],rax        # 19e5e30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x420>
  a82a7c:	48 8d 35 ad 33 f6 00 	lea    rsi,[rip+0xf633ad]        # 19e5e30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x420>
  a82a83:	48 89 35 c6 33 f6 00 	mov    QWORD PTR [rip+0xf633c6],rsi        # 19e5e50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x440>
  a82a8a:	48 8d 05 4f 23 db 00 	lea    rax,[rip+0xdb234f]        # 1834de0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6d78>
  a82a91:	48 89 05 c8 33 f6 00 	mov    QWORD PTR [rip+0xf633c8],rax        # 19e5e60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x450>
  a82a98:	48 8d 05 c1 33 f6 00 	lea    rax,[rip+0xf633c1]        # 19e5e60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x450>
  a82a9f:	48 89 05 da 33 f6 00 	mov    QWORD PTR [rip+0xf633da],rax        # 19e5e80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x470>
  a82aa6:	4c 89 f7             	mov    rdi,r14
  a82aa9:	48 89 da             	mov    rdx,rbx
  a82aac:	e8 af b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82ab1:	48 8d 05 70 23 db 00 	lea    rax,[rip+0xdb2370]        # 1834e28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6dc0>
  a82ab8:	48 89 05 d1 33 f6 00 	mov    QWORD PTR [rip+0xf633d1],rax        # 19e5e90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x480>
  a82abf:	48 8d 35 ca 33 f6 00 	lea    rsi,[rip+0xf633ca]        # 19e5e90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x480>
  a82ac6:	48 89 35 e3 33 f6 00 	mov    QWORD PTR [rip+0xf633e3],rsi        # 19e5eb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4a0>
  a82acd:	48 8d 05 9c 23 db 00 	lea    rax,[rip+0xdb239c]        # 1834e70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6e08>
  a82ad4:	48 89 05 e5 33 f6 00 	mov    QWORD PTR [rip+0xf633e5],rax        # 19e5ec0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4b0>
  a82adb:	48 8d 05 de 33 f6 00 	lea    rax,[rip+0xf633de]        # 19e5ec0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4b0>
  a82ae2:	48 89 05 f7 33 f6 00 	mov    QWORD PTR [rip+0xf633f7],rax        # 19e5ee0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4d0>
  a82ae9:	4c 89 f7             	mov    rdi,r14
  a82aec:	48 89 da             	mov    rdx,rbx
  a82aef:	e8 6c b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82af4:	48 8d 05 bd 23 db 00 	lea    rax,[rip+0xdb23bd]        # 1834eb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6e50>
```
### AP `0x18b0bd0` +0x28 -> `0xa82837` score 14

```text
  a82837:	53                   	push   rbx
  a82838:	48 8d 1d 99 33 f6 00 	lea    rbx,[rip+0xf63399]        # 19e5bd8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1c8>
  a8283f:	48 8d 35 65 25 8f ff 	lea    rsi,[rip+0xffffffffff8f2565]        # 374dab <_ZTSSt12bad_any_cast@@Base-0x1b41d>
  a82846:	48 89 df             	mov    rdi,rbx
  a82849:	e8 30 72 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a8284e:	48 8b 3d eb f1 e2 00 	mov    rdi,QWORD PTR [rip+0xe2f1eb]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a82855:	48 8d 15 a4 17 d7 00 	lea    rdx,[rip+0xd717a4]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a8285c:	48 89 de             	mov    rsi,rbx
  a8285f:	5b                   	pop    rbx
  a82860:	e9 fb b5 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a82865:	53                   	push   rbx
  a82866:	48 8d 1d 83 33 f6 00 	lea    rbx,[rip+0xf63383]        # 19e5bf0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1e0>
  a8286d:	48 8d 35 ea de 8f ff 	lea    rsi,[rip+0xffffffffff8fdeea]        # 38075e <_ZTSSt12bad_any_cast@@Base-0xfa6a>
  a82874:	48 89 df             	mov    rdi,rbx
  a82877:	e8 02 72 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a8287c:	48 8b 3d bd f1 e2 00 	mov    rdi,QWORD PTR [rip+0xe2f1bd]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a82883:	48 8d 15 76 17 d7 00 	lea    rdx,[rip+0xd71776]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a8288a:	48 89 de             	mov    rsi,rbx
  a8288d:	5b                   	pop    rbx
  a8288e:	e9 cd b5 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a82893:	55                   	push   rbp
  a82894:	41 57                	push   r15
  a82896:	41 56                	push   r14
  a82898:	41 55                	push   r13
  a8289a:	41 54                	push   r12
  a8289c:	53                   	push   rbx
  a8289d:	50                   	push   rax
  a8289e:	4c 8d 35 63 33 f6 00 	lea    r14,[rip+0xf63363]        # 19e5c08 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1f8>
  a828a5:	48 8d 35 83 c3 8a ff 	lea    rsi,[rip+0xffffffffff8ac383]        # 32ec2f <_ZTSSt12bad_any_cast@@Base-0x61599>
  a828ac:	4c 89 f7             	mov    rdi,r14
  a828af:	e8 ca 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a828b4:	4c 8b 3d 85 f1 e2 00 	mov    r15,QWORD PTR [rip+0xe2f185]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a828bb:	48 8d 1d 3e 17 d7 00 	lea    rbx,[rip+0xd7173e]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a828c2:	4c 89 ff             	mov    rdi,r15
  a828c5:	4c 89 f6             	mov    rsi,r14
  a828c8:	48 89 da             	mov    rdx,rbx
  a828cb:	e8 90 b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a828d0:	4c 8d 35 49 33 f6 00 	lea    r14,[rip+0xf63349]        # 19e5c20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x210>
  a828d7:	48 8d 35 7c d6 8c ff 	lea    rsi,[rip+0xffffffffff8cd67c]        # 34ff5a <_ZTSSt12bad_any_cast@@Base-0x4026e>
  a828de:	4c 89 f7             	mov    rdi,r14
  a828e1:	e8 98 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a828e6:	4c 89 ff             	mov    rdi,r15
  a828e9:	4c 89 f6             	mov    rsi,r14
  a828ec:	48 89 da             	mov    rdx,rbx
  a828ef:	e8 6c b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a828f4:	4c 8d 35 3d 33 f6 00 	lea    r14,[rip+0xf6333d]        # 19e5c38 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x228>
  a828fb:	48 8d 35 3a a2 8d ff 	lea    rsi,[rip+0xffffffffff8da23a]        # 35cb3c <_ZTSSt12bad_any_cast@@Base-0x3368c>
  a82902:	4c 89 f7             	mov    rdi,r14
  a82905:	e8 74 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a8290a:	4c 89 ff             	mov    rdi,r15
  a8290d:	4c 89 f6             	mov    rsi,r14
  a82910:	48 89 da             	mov    rdx,rbx
  a82913:	e8 48 b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82918:	48 8d 05 a9 21 db 00 	lea    rax,[rip+0xdb21a9]        # 1834ac8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6a60>
  a8291f:	48 89 05 2a 33 f6 00 	mov    QWORD PTR [rip+0xf6332a],rax        # 19e5c50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x240>
  a82926:	48 8d 35 23 33 f6 00 	lea    rsi,[rip+0xf63323]        # 19e5c50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x240>
  a8292d:	48 89 35 3c 33 f6 00 	mov    QWORD PTR [rip+0xf6333c],rsi        # 19e5c70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x260>
  a82934:	48 8d 05 d5 21 db 00 	lea    rax,[rip+0xdb21d5]        # 1834b10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6aa8>
  a8293b:	48 89 05 3e 33 f6 00 	mov    QWORD PTR [rip+0xf6333e],rax        # 19e5c80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x270>
  a82942:	48 8d 05 37 33 f6 00 	lea    rax,[rip+0xf63337]        # 19e5c80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x270>
  a82949:	48 89 05 50 33 f6 00 	mov    QWORD PTR [rip+0xf63350],rax        # 19e5ca0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x290>
  a82950:	4c 8d 35 5f 8c 46 00 	lea    r14,[rip+0x468c5f]        # eeb5b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb29cc>
  a82957:	4c 89 f7             	mov    rdi,r14
  a8295a:	48 89 da             	mov    rdx,rbx
  a8295d:	e8 fe b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82962:	48 8d 05 ef 21 db 00 	lea    rax,[rip+0xdb21ef]        # 1834b58 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6af0>
  a82969:	48 89 05 40 33 f6 00 	mov    QWORD PTR [rip+0xf63340],rax        # 19e5cb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2a0>
  a82970:	48 8d 35 39 33 f6 00 	lea    rsi,[rip+0xf63339]        # 19e5cb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2a0>
  a82977:	48 89 35 52 33 f6 00 	mov    QWORD PTR [rip+0xf63352],rsi        # 19e5cd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2c0>
  a8297e:	48 8d 05 1b 22 db 00 	lea    rax,[rip+0xdb221b]        # 1834ba0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6b38>
  a82985:	48 89 05 54 33 f6 00 	mov    QWORD PTR [rip+0xf63354],rax        # 19e5ce0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2d0>
  a8298c:	48 8d 05 4d 33 f6 00 	lea    rax,[rip+0xf6334d]        # 19e5ce0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2d0>
  a82993:	48 89 05 66 33 f6 00 	mov    QWORD PTR [rip+0xf63366],rax        # 19e5d00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2f0>
  a8299a:	4c 89 f7             	mov    rdi,r14
  a8299d:	48 89 da             	mov    rdx,rbx
  a829a0:	e8 bb b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a829a5:	48 8d 05 3c 22 db 00 	lea    rax,[rip+0xdb223c]        # 1834be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6b80>
  a829ac:	48 89 05 5d 33 f6 00 	mov    QWORD PTR [rip+0xf6335d],rax        # 19e5d10 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x300>
  a829b3:	48 8d 35 56 33 f6 00 	lea    rsi,[rip+0xf63356]        # 19e5d10 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x300>
  a829ba:	48 89 35 6f 33 f6 00 	mov    QWORD PTR [rip+0xf6336f],rsi        # 19e5d30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x320>
  a829c1:	48 8d 05 68 22 db 00 	lea    rax,[rip+0xdb2268]        # 1834c30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6bc8>
  a829c8:	48 89 05 71 33 f6 00 	mov    QWORD PTR [rip+0xf63371],rax        # 19e5d40 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x330>
  a829cf:	48 8d 05 6a 33 f6 00 	lea    rax,[rip+0xf6336a]        # 19e5d40 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x330>
  a829d6:	48 89 05 83 33 f6 00 	mov    QWORD PTR [rip+0xf63383],rax        # 19e5d60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x350>
  a829dd:	4c 89 f7             	mov    rdi,r14
  a829e0:	48 89 da             	mov    rdx,rbx
  a829e3:	e8 78 b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a829e8:	48 8d 05 89 22 db 00 	lea    rax,[rip+0xdb2289]        # 1834c78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6c10>
  a829ef:	48 89 05 7a 33 f6 00 	mov    QWORD PTR [rip+0xf6337a],rax        # 19e5d70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x360>
  a829f6:	48 8d 35 73 33 f6 00 	lea    rsi,[rip+0xf63373]        # 19e5d70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x360>
  a829fd:	48 89 35 8c 33 f6 00 	mov    QWORD PTR [rip+0xf6338c],rsi        # 19e5d90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x380>
  a82a04:	48 8d 05 b5 22 db 00 	lea    rax,[rip+0xdb22b5]        # 1834cc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6c58>
  a82a0b:	48 89 05 8e 33 f6 00 	mov    QWORD PTR [rip+0xf6338e],rax        # 19e5da0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x390>
  a82a12:	48 8d 05 87 33 f6 00 	lea    rax,[rip+0xf63387]        # 19e5da0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x390>
  a82a19:	48 89 05 a0 33 f6 00 	mov    QWORD PTR [rip+0xf633a0],rax        # 19e5dc0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3b0>
  a82a20:	4c 89 f7             	mov    rdi,r14
  a82a23:	48 89 da             	mov    rdx,rbx
  a82a26:	e8 35 b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82a2b:	48 8d 05 d6 22 db 00 	lea    rax,[rip+0xdb22d6]        # 1834d08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6ca0>
  a82a32:	48 89 05 97 33 f6 00 	mov    QWORD PTR [rip+0xf63397],rax        # 19e5dd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3c0>
  a82a39:	48 8d 35 90 33 f6 00 	lea    rsi,[rip+0xf63390]        # 19e5dd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3c0>
  a82a40:	48 89 35 a9 33 f6 00 	mov    QWORD PTR [rip+0xf633a9],rsi        # 19e5df0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3e0>
  a82a47:	48 8d 05 02 23 db 00 	lea    rax,[rip+0xdb2302]        # 1834d50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6ce8>
  a82a4e:	48 89 05 ab 33 f6 00 	mov    QWORD PTR [rip+0xf633ab],rax        # 19e5e00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3f0>
  a82a55:	48 8d 05 a4 33 f6 00 	lea    rax,[rip+0xf633a4]        # 19e5e00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3f0>
  a82a5c:	48 89 05 bd 33 f6 00 	mov    QWORD PTR [rip+0xf633bd],rax        # 19e5e20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x410>
  a82a63:	4c 89 f7             	mov    rdi,r14
  a82a66:	48 89 da             	mov    rdx,rbx
  a82a69:	e8 f2 b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82a6e:	48 8d 05 23 23 db 00 	lea    rax,[rip+0xdb2323]        # 1834d98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6d30>
  a82a75:	48 89 05 b4 33 f6 00 	mov    QWORD PTR [rip+0xf633b4],rax        # 19e5e30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x420>
  a82a7c:	48 8d 35 ad 33 f6 00 	lea    rsi,[rip+0xf633ad]        # 19e5e30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x420>
  a82a83:	48 89 35 c6 33 f6 00 	mov    QWORD PTR [rip+0xf633c6],rsi        # 19e5e50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x440>
  a82a8a:	48 8d 05 4f 23 db 00 	lea    rax,[rip+0xdb234f]        # 1834de0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6d78>
  a82a91:	48 89 05 c8 33 f6 00 	mov    QWORD PTR [rip+0xf633c8],rax        # 19e5e60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x450>
  a82a98:	48 8d 05 c1 33 f6 00 	lea    rax,[rip+0xf633c1]        # 19e5e60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x450>
  a82a9f:	48 89 05 da 33 f6 00 	mov    QWORD PTR [rip+0xf633da],rax        # 19e5e80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x470>
  a82aa6:	4c 89 f7             	mov    rdi,r14
  a82aa9:	48 89 da             	mov    rdx,rbx
  a82aac:	e8 af b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82ab1:	48 8d 05 70 23 db 00 	lea    rax,[rip+0xdb2370]        # 1834e28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6dc0>
  a82ab8:	48 89 05 d1 33 f6 00 	mov    QWORD PTR [rip+0xf633d1],rax        # 19e5e90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x480>
  a82abf:	48 8d 35 ca 33 f6 00 	lea    rsi,[rip+0xf633ca]        # 19e5e90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x480>
  a82ac6:	48 89 35 e3 33 f6 00 	mov    QWORD PTR [rip+0xf633e3],rsi        # 19e5eb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4a0>
  a82acd:	48 8d 05 9c 23 db 00 	lea    rax,[rip+0xdb239c]        # 1834e70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6e08>
  a82ad4:	48 89 05 e5 33 f6 00 	mov    QWORD PTR [rip+0xf633e5],rax        # 19e5ec0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4b0>
  a82adb:	48 8d 05 de 33 f6 00 	lea    rax,[rip+0xf633de]        # 19e5ec0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4b0>
  a82ae2:	48 89 05 f7 33 f6 00 	mov    QWORD PTR [rip+0xf633f7],rax        # 19e5ee0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4d0>
  a82ae9:	4c 89 f7             	mov    rdi,r14
  a82aec:	48 89 da             	mov    rdx,rbx
  a82aef:	e8 6c b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82af4:	48 8d 05 bd 23 db 00 	lea    rax,[rip+0xdb23bd]        # 1834eb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6e50>
  a82afb:	48 89 05 ee 33 f6 00 	mov    QWORD PTR [rip+0xf633ee],rax        # 19e5ef0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4e0>
  a82b02:	48 8d 35 e7 33 f6 00 	lea    rsi,[rip+0xf633e7]        # 19e5ef0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4e0>
  a82b09:	48 89 35 00 34 f6 00 	mov    QWORD PTR [rip+0xf63400],rsi        # 19e5f10 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x500>
  a82b10:	48 8d 05 e9 23 db 00 	lea    rax,[rip+0xdb23e9]        # 1834f00 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6e98>
  a82b17:	48 89 05 02 34 f6 00 	mov    QWORD PTR [rip+0xf63402],rax        # 19e5f20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x510>
  a82b1e:	48 8d 05 fb 33 f6 00 	lea    rax,[rip+0xf633fb]        # 19e5f20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x510>
  a82b25:	48 89 05 14 34 f6 00 	mov    QWORD PTR [rip+0xf63414],rax        # 19e5f40 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x530>
  a82b2c:	48 8d 05 15 24 db 00 	lea    rax,[rip+0xdb2415]        # 1834f48 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6ee0>
  a82b33:	48 89 05 16 34 f6 00 	mov    QWORD PTR [rip+0xf63416],rax        # 19e5f50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x540>
  a82b3a:	48 8d 05 0f 34 f6 00 	lea    rax,[rip+0xf6340f]        # 19e5f50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x540>
  a82b41:	48 89 05 28 34 f6 00 	mov    QWORD PTR [rip+0xf63428],rax        # 19e5f70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x560>
  a82b48:	48 8d 05 41 24 db 00 	lea    rax,[rip+0xdb2441]        # 1834f90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6f28>
  a82b4f:	48 89 05 2a 34 f6 00 	mov    QWORD PTR [rip+0xf6342a],rax        # 19e5f80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x570>
  a82b56:	41 bc 90 00 00 00    	mov    r12d,0x90
  a82b5c:	4a 8d 04 26          	lea    rax,[rsi+r12*1]
  a82b60:	48 89 05 39 34 f6 00 	mov    QWORD PTR [rip+0xf63439],rax        # 19e5fa0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x590>
  a82b67:	48 8d 05 6a 24 db 00 	lea    rax,[rip+0xdb246a]        # 1834fd8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6f70>
  a82b6e:	48 89 05 3b 34 f6 00 	mov    QWORD PTR [rip+0xf6343b],rax        # 19e5fb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5a0>
  a82b75:	41 bd c0 00 00 00    	mov    r13d,0xc0
  a82b7b:	4a 8d 04 2e          	lea    rax,[rsi+r13*1]
  a82b7f:	48 89 05 4a 34 f6 00 	mov    QWORD PTR [rip+0xf6344a],rax        # 19e5fd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5c0>
  a82b86:	48 8d 05 93 24 db 00 	lea    rax,[rip+0xdb2493]        # 1835020 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6fb8>
  a82b8d:	48 89 05 4c 34 f6 00 	mov    QWORD PTR [rip+0xf6344c],rax        # 19e5fe0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5d0>
  a82b94:	bd f0 00 00 00       	mov    ebp,0xf0
  a82b99:	48 8d 04 2e          	lea    rax,[rsi+rbp*1]
  a82b9d:	48 89 05 5c 34 f6 00 	mov    QWORD PTR [rip+0xf6345c],rax        # 19e6000 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5f0>
  a82ba4:	4c 8d 3d 31 8a 46 00 	lea    r15,[rip+0x468a31]        # eeb5dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb29f2>
  a82bab:	4c 89 ff             	mov    rdi,r15
```
### AP `0x18b0bd8` +0x28 -> `0xa82865` score 14

```text
  a82865:	53                   	push   rbx
  a82866:	48 8d 1d 83 33 f6 00 	lea    rbx,[rip+0xf63383]        # 19e5bf0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1e0>
  a8286d:	48 8d 35 ea de 8f ff 	lea    rsi,[rip+0xffffffffff8fdeea]        # 38075e <_ZTSSt12bad_any_cast@@Base-0xfa6a>
  a82874:	48 89 df             	mov    rdi,rbx
  a82877:	e8 02 72 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a8287c:	48 8b 3d bd f1 e2 00 	mov    rdi,QWORD PTR [rip+0xe2f1bd]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a82883:	48 8d 15 76 17 d7 00 	lea    rdx,[rip+0xd71776]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a8288a:	48 89 de             	mov    rsi,rbx
  a8288d:	5b                   	pop    rbx
  a8288e:	e9 cd b5 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a82893:	55                   	push   rbp
  a82894:	41 57                	push   r15
  a82896:	41 56                	push   r14
  a82898:	41 55                	push   r13
  a8289a:	41 54                	push   r12
  a8289c:	53                   	push   rbx
  a8289d:	50                   	push   rax
  a8289e:	4c 8d 35 63 33 f6 00 	lea    r14,[rip+0xf63363]        # 19e5c08 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1f8>
  a828a5:	48 8d 35 83 c3 8a ff 	lea    rsi,[rip+0xffffffffff8ac383]        # 32ec2f <_ZTSSt12bad_any_cast@@Base-0x61599>
  a828ac:	4c 89 f7             	mov    rdi,r14
  a828af:	e8 ca 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a828b4:	4c 8b 3d 85 f1 e2 00 	mov    r15,QWORD PTR [rip+0xe2f185]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a828bb:	48 8d 1d 3e 17 d7 00 	lea    rbx,[rip+0xd7173e]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a828c2:	4c 89 ff             	mov    rdi,r15
  a828c5:	4c 89 f6             	mov    rsi,r14
  a828c8:	48 89 da             	mov    rdx,rbx
  a828cb:	e8 90 b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a828d0:	4c 8d 35 49 33 f6 00 	lea    r14,[rip+0xf63349]        # 19e5c20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x210>
  a828d7:	48 8d 35 7c d6 8c ff 	lea    rsi,[rip+0xffffffffff8cd67c]        # 34ff5a <_ZTSSt12bad_any_cast@@Base-0x4026e>
  a828de:	4c 89 f7             	mov    rdi,r14
  a828e1:	e8 98 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a828e6:	4c 89 ff             	mov    rdi,r15
  a828e9:	4c 89 f6             	mov    rsi,r14
  a828ec:	48 89 da             	mov    rdx,rbx
  a828ef:	e8 6c b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a828f4:	4c 8d 35 3d 33 f6 00 	lea    r14,[rip+0xf6333d]        # 19e5c38 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x228>
  a828fb:	48 8d 35 3a a2 8d ff 	lea    rsi,[rip+0xffffffffff8da23a]        # 35cb3c <_ZTSSt12bad_any_cast@@Base-0x3368c>
  a82902:	4c 89 f7             	mov    rdi,r14
  a82905:	e8 74 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a8290a:	4c 89 ff             	mov    rdi,r15
  a8290d:	4c 89 f6             	mov    rsi,r14
  a82910:	48 89 da             	mov    rdx,rbx
  a82913:	e8 48 b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82918:	48 8d 05 a9 21 db 00 	lea    rax,[rip+0xdb21a9]        # 1834ac8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6a60>
  a8291f:	48 89 05 2a 33 f6 00 	mov    QWORD PTR [rip+0xf6332a],rax        # 19e5c50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x240>
  a82926:	48 8d 35 23 33 f6 00 	lea    rsi,[rip+0xf63323]        # 19e5c50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x240>
  a8292d:	48 89 35 3c 33 f6 00 	mov    QWORD PTR [rip+0xf6333c],rsi        # 19e5c70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x260>
  a82934:	48 8d 05 d5 21 db 00 	lea    rax,[rip+0xdb21d5]        # 1834b10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6aa8>
  a8293b:	48 89 05 3e 33 f6 00 	mov    QWORD PTR [rip+0xf6333e],rax        # 19e5c80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x270>
  a82942:	48 8d 05 37 33 f6 00 	lea    rax,[rip+0xf63337]        # 19e5c80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x270>
  a82949:	48 89 05 50 33 f6 00 	mov    QWORD PTR [rip+0xf63350],rax        # 19e5ca0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x290>
  a82950:	4c 8d 35 5f 8c 46 00 	lea    r14,[rip+0x468c5f]        # eeb5b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb29cc>
  a82957:	4c 89 f7             	mov    rdi,r14
  a8295a:	48 89 da             	mov    rdx,rbx
  a8295d:	e8 fe b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82962:	48 8d 05 ef 21 db 00 	lea    rax,[rip+0xdb21ef]        # 1834b58 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6af0>
  a82969:	48 89 05 40 33 f6 00 	mov    QWORD PTR [rip+0xf63340],rax        # 19e5cb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2a0>
  a82970:	48 8d 35 39 33 f6 00 	lea    rsi,[rip+0xf63339]        # 19e5cb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2a0>
  a82977:	48 89 35 52 33 f6 00 	mov    QWORD PTR [rip+0xf63352],rsi        # 19e5cd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2c0>
  a8297e:	48 8d 05 1b 22 db 00 	lea    rax,[rip+0xdb221b]        # 1834ba0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6b38>
  a82985:	48 89 05 54 33 f6 00 	mov    QWORD PTR [rip+0xf63354],rax        # 19e5ce0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2d0>
  a8298c:	48 8d 05 4d 33 f6 00 	lea    rax,[rip+0xf6334d]        # 19e5ce0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2d0>
  a82993:	48 89 05 66 33 f6 00 	mov    QWORD PTR [rip+0xf63366],rax        # 19e5d00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2f0>
  a8299a:	4c 89 f7             	mov    rdi,r14
  a8299d:	48 89 da             	mov    rdx,rbx
  a829a0:	e8 bb b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a829a5:	48 8d 05 3c 22 db 00 	lea    rax,[rip+0xdb223c]        # 1834be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6b80>
  a829ac:	48 89 05 5d 33 f6 00 	mov    QWORD PTR [rip+0xf6335d],rax        # 19e5d10 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x300>
  a829b3:	48 8d 35 56 33 f6 00 	lea    rsi,[rip+0xf63356]        # 19e5d10 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x300>
  a829ba:	48 89 35 6f 33 f6 00 	mov    QWORD PTR [rip+0xf6336f],rsi        # 19e5d30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x320>
  a829c1:	48 8d 05 68 22 db 00 	lea    rax,[rip+0xdb2268]        # 1834c30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6bc8>
  a829c8:	48 89 05 71 33 f6 00 	mov    QWORD PTR [rip+0xf63371],rax        # 19e5d40 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x330>
  a829cf:	48 8d 05 6a 33 f6 00 	lea    rax,[rip+0xf6336a]        # 19e5d40 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x330>
  a829d6:	48 89 05 83 33 f6 00 	mov    QWORD PTR [rip+0xf63383],rax        # 19e5d60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x350>
  a829dd:	4c 89 f7             	mov    rdi,r14
  a829e0:	48 89 da             	mov    rdx,rbx
  a829e3:	e8 78 b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a829e8:	48 8d 05 89 22 db 00 	lea    rax,[rip+0xdb2289]        # 1834c78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6c10>
  a829ef:	48 89 05 7a 33 f6 00 	mov    QWORD PTR [rip+0xf6337a],rax        # 19e5d70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x360>
  a829f6:	48 8d 35 73 33 f6 00 	lea    rsi,[rip+0xf63373]        # 19e5d70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x360>
  a829fd:	48 89 35 8c 33 f6 00 	mov    QWORD PTR [rip+0xf6338c],rsi        # 19e5d90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x380>
  a82a04:	48 8d 05 b5 22 db 00 	lea    rax,[rip+0xdb22b5]        # 1834cc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6c58>
  a82a0b:	48 89 05 8e 33 f6 00 	mov    QWORD PTR [rip+0xf6338e],rax        # 19e5da0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x390>
  a82a12:	48 8d 05 87 33 f6 00 	lea    rax,[rip+0xf63387]        # 19e5da0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x390>
  a82a19:	48 89 05 a0 33 f6 00 	mov    QWORD PTR [rip+0xf633a0],rax        # 19e5dc0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3b0>
  a82a20:	4c 89 f7             	mov    rdi,r14
  a82a23:	48 89 da             	mov    rdx,rbx
  a82a26:	e8 35 b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82a2b:	48 8d 05 d6 22 db 00 	lea    rax,[rip+0xdb22d6]        # 1834d08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6ca0>
  a82a32:	48 89 05 97 33 f6 00 	mov    QWORD PTR [rip+0xf63397],rax        # 19e5dd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3c0>
  a82a39:	48 8d 35 90 33 f6 00 	lea    rsi,[rip+0xf63390]        # 19e5dd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3c0>
  a82a40:	48 89 35 a9 33 f6 00 	mov    QWORD PTR [rip+0xf633a9],rsi        # 19e5df0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3e0>
  a82a47:	48 8d 05 02 23 db 00 	lea    rax,[rip+0xdb2302]        # 1834d50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6ce8>
  a82a4e:	48 89 05 ab 33 f6 00 	mov    QWORD PTR [rip+0xf633ab],rax        # 19e5e00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3f0>
  a82a55:	48 8d 05 a4 33 f6 00 	lea    rax,[rip+0xf633a4]        # 19e5e00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3f0>
  a82a5c:	48 89 05 bd 33 f6 00 	mov    QWORD PTR [rip+0xf633bd],rax        # 19e5e20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x410>
  a82a63:	4c 89 f7             	mov    rdi,r14
  a82a66:	48 89 da             	mov    rdx,rbx
  a82a69:	e8 f2 b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82a6e:	48 8d 05 23 23 db 00 	lea    rax,[rip+0xdb2323]        # 1834d98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6d30>
  a82a75:	48 89 05 b4 33 f6 00 	mov    QWORD PTR [rip+0xf633b4],rax        # 19e5e30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x420>
  a82a7c:	48 8d 35 ad 33 f6 00 	lea    rsi,[rip+0xf633ad]        # 19e5e30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x420>
  a82a83:	48 89 35 c6 33 f6 00 	mov    QWORD PTR [rip+0xf633c6],rsi        # 19e5e50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x440>
  a82a8a:	48 8d 05 4f 23 db 00 	lea    rax,[rip+0xdb234f]        # 1834de0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6d78>
  a82a91:	48 89 05 c8 33 f6 00 	mov    QWORD PTR [rip+0xf633c8],rax        # 19e5e60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x450>
  a82a98:	48 8d 05 c1 33 f6 00 	lea    rax,[rip+0xf633c1]        # 19e5e60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x450>
  a82a9f:	48 89 05 da 33 f6 00 	mov    QWORD PTR [rip+0xf633da],rax        # 19e5e80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x470>
  a82aa6:	4c 89 f7             	mov    rdi,r14
  a82aa9:	48 89 da             	mov    rdx,rbx
  a82aac:	e8 af b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82ab1:	48 8d 05 70 23 db 00 	lea    rax,[rip+0xdb2370]        # 1834e28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6dc0>
  a82ab8:	48 89 05 d1 33 f6 00 	mov    QWORD PTR [rip+0xf633d1],rax        # 19e5e90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x480>
  a82abf:	48 8d 35 ca 33 f6 00 	lea    rsi,[rip+0xf633ca]        # 19e5e90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x480>
  a82ac6:	48 89 35 e3 33 f6 00 	mov    QWORD PTR [rip+0xf633e3],rsi        # 19e5eb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4a0>
  a82acd:	48 8d 05 9c 23 db 00 	lea    rax,[rip+0xdb239c]        # 1834e70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6e08>
  a82ad4:	48 89 05 e5 33 f6 00 	mov    QWORD PTR [rip+0xf633e5],rax        # 19e5ec0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4b0>
  a82adb:	48 8d 05 de 33 f6 00 	lea    rax,[rip+0xf633de]        # 19e5ec0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4b0>
  a82ae2:	48 89 05 f7 33 f6 00 	mov    QWORD PTR [rip+0xf633f7],rax        # 19e5ee0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4d0>
  a82ae9:	4c 89 f7             	mov    rdi,r14
  a82aec:	48 89 da             	mov    rdx,rbx
  a82aef:	e8 6c b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82af4:	48 8d 05 bd 23 db 00 	lea    rax,[rip+0xdb23bd]        # 1834eb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6e50>
  a82afb:	48 89 05 ee 33 f6 00 	mov    QWORD PTR [rip+0xf633ee],rax        # 19e5ef0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4e0>
  a82b02:	48 8d 35 e7 33 f6 00 	lea    rsi,[rip+0xf633e7]        # 19e5ef0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4e0>
  a82b09:	48 89 35 00 34 f6 00 	mov    QWORD PTR [rip+0xf63400],rsi        # 19e5f10 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x500>
  a82b10:	48 8d 05 e9 23 db 00 	lea    rax,[rip+0xdb23e9]        # 1834f00 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6e98>
  a82b17:	48 89 05 02 34 f6 00 	mov    QWORD PTR [rip+0xf63402],rax        # 19e5f20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x510>
  a82b1e:	48 8d 05 fb 33 f6 00 	lea    rax,[rip+0xf633fb]        # 19e5f20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x510>
  a82b25:	48 89 05 14 34 f6 00 	mov    QWORD PTR [rip+0xf63414],rax        # 19e5f40 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x530>
  a82b2c:	48 8d 05 15 24 db 00 	lea    rax,[rip+0xdb2415]        # 1834f48 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6ee0>
  a82b33:	48 89 05 16 34 f6 00 	mov    QWORD PTR [rip+0xf63416],rax        # 19e5f50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x540>
  a82b3a:	48 8d 05 0f 34 f6 00 	lea    rax,[rip+0xf6340f]        # 19e5f50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x540>
  a82b41:	48 89 05 28 34 f6 00 	mov    QWORD PTR [rip+0xf63428],rax        # 19e5f70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x560>
  a82b48:	48 8d 05 41 24 db 00 	lea    rax,[rip+0xdb2441]        # 1834f90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6f28>
  a82b4f:	48 89 05 2a 34 f6 00 	mov    QWORD PTR [rip+0xf6342a],rax        # 19e5f80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x570>
  a82b56:	41 bc 90 00 00 00    	mov    r12d,0x90
  a82b5c:	4a 8d 04 26          	lea    rax,[rsi+r12*1]
  a82b60:	48 89 05 39 34 f6 00 	mov    QWORD PTR [rip+0xf63439],rax        # 19e5fa0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x590>
  a82b67:	48 8d 05 6a 24 db 00 	lea    rax,[rip+0xdb246a]        # 1834fd8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6f70>
  a82b6e:	48 89 05 3b 34 f6 00 	mov    QWORD PTR [rip+0xf6343b],rax        # 19e5fb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5a0>
  a82b75:	41 bd c0 00 00 00    	mov    r13d,0xc0
  a82b7b:	4a 8d 04 2e          	lea    rax,[rsi+r13*1]
  a82b7f:	48 89 05 4a 34 f6 00 	mov    QWORD PTR [rip+0xf6344a],rax        # 19e5fd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5c0>
  a82b86:	48 8d 05 93 24 db 00 	lea    rax,[rip+0xdb2493]        # 1835020 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6fb8>
  a82b8d:	48 89 05 4c 34 f6 00 	mov    QWORD PTR [rip+0xf6344c],rax        # 19e5fe0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5d0>
  a82b94:	bd f0 00 00 00       	mov    ebp,0xf0
  a82b99:	48 8d 04 2e          	lea    rax,[rsi+rbp*1]
  a82b9d:	48 89 05 5c 34 f6 00 	mov    QWORD PTR [rip+0xf6345c],rax        # 19e6000 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5f0>
  a82ba4:	4c 8d 3d 31 8a 46 00 	lea    r15,[rip+0x468a31]        # eeb5dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb29f2>
  a82bab:	4c 89 ff             	mov    rdi,r15
  a82bae:	48 89 da             	mov    rdx,rbx
  a82bb1:	e8 aa b2 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82bb6:	48 8d 05 ab 24 db 00 	lea    rax,[rip+0xdb24ab]        # 1835068 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7000>
  a82bbd:	48 89 05 4c 34 f6 00 	mov    QWORD PTR [rip+0xf6344c],rax        # 19e6010 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x600>
  a82bc4:	48 8d 35 45 34 f6 00 	lea    rsi,[rip+0xf63445]        # 19e6010 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x600>
  a82bcb:	48 89 35 5e 34 f6 00 	mov    QWORD PTR [rip+0xf6345e],rsi        # 19e6030 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x620>
  a82bd2:	48 8d 05 d7 24 db 00 	lea    rax,[rip+0xdb24d7]        # 18350b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7048>
  a82bd9:	48 89 05 60 34 f6 00 	mov    QWORD PTR [rip+0xf63460],rax        # 19e6040 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x630>
  a82be0:	48 8d 05 59 34 f6 00 	lea    rax,[rip+0xf63459]        # 19e6040 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x630>
  a82be7:	48 89 05 72 34 f6 00 	mov    QWORD PTR [rip+0xf63472],rax        # 19e6060 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x650>
```
### AP `0x18b0be0` +0x28 -> `0xa82893` score 14

```text
  a82893:	55                   	push   rbp
  a82894:	41 57                	push   r15
  a82896:	41 56                	push   r14
  a82898:	41 55                	push   r13
  a8289a:	41 54                	push   r12
  a8289c:	53                   	push   rbx
  a8289d:	50                   	push   rax
  a8289e:	4c 8d 35 63 33 f6 00 	lea    r14,[rip+0xf63363]        # 19e5c08 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1f8>
  a828a5:	48 8d 35 83 c3 8a ff 	lea    rsi,[rip+0xffffffffff8ac383]        # 32ec2f <_ZTSSt12bad_any_cast@@Base-0x61599>
  a828ac:	4c 89 f7             	mov    rdi,r14
  a828af:	e8 ca 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a828b4:	4c 8b 3d 85 f1 e2 00 	mov    r15,QWORD PTR [rip+0xe2f185]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a828bb:	48 8d 1d 3e 17 d7 00 	lea    rbx,[rip+0xd7173e]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a828c2:	4c 89 ff             	mov    rdi,r15
  a828c5:	4c 89 f6             	mov    rsi,r14
  a828c8:	48 89 da             	mov    rdx,rbx
  a828cb:	e8 90 b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a828d0:	4c 8d 35 49 33 f6 00 	lea    r14,[rip+0xf63349]        # 19e5c20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x210>
  a828d7:	48 8d 35 7c d6 8c ff 	lea    rsi,[rip+0xffffffffff8cd67c]        # 34ff5a <_ZTSSt12bad_any_cast@@Base-0x4026e>
  a828de:	4c 89 f7             	mov    rdi,r14
  a828e1:	e8 98 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a828e6:	4c 89 ff             	mov    rdi,r15
  a828e9:	4c 89 f6             	mov    rsi,r14
  a828ec:	48 89 da             	mov    rdx,rbx
  a828ef:	e8 6c b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a828f4:	4c 8d 35 3d 33 f6 00 	lea    r14,[rip+0xf6333d]        # 19e5c38 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x228>
  a828fb:	48 8d 35 3a a2 8d ff 	lea    rsi,[rip+0xffffffffff8da23a]        # 35cb3c <_ZTSSt12bad_any_cast@@Base-0x3368c>
  a82902:	4c 89 f7             	mov    rdi,r14
  a82905:	e8 74 71 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a8290a:	4c 89 ff             	mov    rdi,r15
  a8290d:	4c 89 f6             	mov    rsi,r14
  a82910:	48 89 da             	mov    rdx,rbx
  a82913:	e8 48 b5 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82918:	48 8d 05 a9 21 db 00 	lea    rax,[rip+0xdb21a9]        # 1834ac8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6a60>
  a8291f:	48 89 05 2a 33 f6 00 	mov    QWORD PTR [rip+0xf6332a],rax        # 19e5c50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x240>
  a82926:	48 8d 35 23 33 f6 00 	lea    rsi,[rip+0xf63323]        # 19e5c50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x240>
  a8292d:	48 89 35 3c 33 f6 00 	mov    QWORD PTR [rip+0xf6333c],rsi        # 19e5c70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x260>
  a82934:	48 8d 05 d5 21 db 00 	lea    rax,[rip+0xdb21d5]        # 1834b10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6aa8>
  a8293b:	48 89 05 3e 33 f6 00 	mov    QWORD PTR [rip+0xf6333e],rax        # 19e5c80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x270>
  a82942:	48 8d 05 37 33 f6 00 	lea    rax,[rip+0xf63337]        # 19e5c80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x270>
  a82949:	48 89 05 50 33 f6 00 	mov    QWORD PTR [rip+0xf63350],rax        # 19e5ca0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x290>
  a82950:	4c 8d 35 5f 8c 46 00 	lea    r14,[rip+0x468c5f]        # eeb5b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb29cc>
  a82957:	4c 89 f7             	mov    rdi,r14
  a8295a:	48 89 da             	mov    rdx,rbx
  a8295d:	e8 fe b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82962:	48 8d 05 ef 21 db 00 	lea    rax,[rip+0xdb21ef]        # 1834b58 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6af0>
  a82969:	48 89 05 40 33 f6 00 	mov    QWORD PTR [rip+0xf63340],rax        # 19e5cb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2a0>
  a82970:	48 8d 35 39 33 f6 00 	lea    rsi,[rip+0xf63339]        # 19e5cb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2a0>
  a82977:	48 89 35 52 33 f6 00 	mov    QWORD PTR [rip+0xf63352],rsi        # 19e5cd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2c0>
  a8297e:	48 8d 05 1b 22 db 00 	lea    rax,[rip+0xdb221b]        # 1834ba0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6b38>
  a82985:	48 89 05 54 33 f6 00 	mov    QWORD PTR [rip+0xf63354],rax        # 19e5ce0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2d0>
  a8298c:	48 8d 05 4d 33 f6 00 	lea    rax,[rip+0xf6334d]        # 19e5ce0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2d0>
  a82993:	48 89 05 66 33 f6 00 	mov    QWORD PTR [rip+0xf63366],rax        # 19e5d00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2f0>
  a8299a:	4c 89 f7             	mov    rdi,r14
  a8299d:	48 89 da             	mov    rdx,rbx
  a829a0:	e8 bb b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a829a5:	48 8d 05 3c 22 db 00 	lea    rax,[rip+0xdb223c]        # 1834be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6b80>
  a829ac:	48 89 05 5d 33 f6 00 	mov    QWORD PTR [rip+0xf6335d],rax        # 19e5d10 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x300>
  a829b3:	48 8d 35 56 33 f6 00 	lea    rsi,[rip+0xf63356]        # 19e5d10 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x300>
  a829ba:	48 89 35 6f 33 f6 00 	mov    QWORD PTR [rip+0xf6336f],rsi        # 19e5d30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x320>
  a829c1:	48 8d 05 68 22 db 00 	lea    rax,[rip+0xdb2268]        # 1834c30 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6bc8>
  a829c8:	48 89 05 71 33 f6 00 	mov    QWORD PTR [rip+0xf63371],rax        # 19e5d40 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x330>
  a829cf:	48 8d 05 6a 33 f6 00 	lea    rax,[rip+0xf6336a]        # 19e5d40 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x330>
  a829d6:	48 89 05 83 33 f6 00 	mov    QWORD PTR [rip+0xf63383],rax        # 19e5d60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x350>
  a829dd:	4c 89 f7             	mov    rdi,r14
  a829e0:	48 89 da             	mov    rdx,rbx
  a829e3:	e8 78 b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a829e8:	48 8d 05 89 22 db 00 	lea    rax,[rip+0xdb2289]        # 1834c78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6c10>
  a829ef:	48 89 05 7a 33 f6 00 	mov    QWORD PTR [rip+0xf6337a],rax        # 19e5d70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x360>
  a829f6:	48 8d 35 73 33 f6 00 	lea    rsi,[rip+0xf63373]        # 19e5d70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x360>
  a829fd:	48 89 35 8c 33 f6 00 	mov    QWORD PTR [rip+0xf6338c],rsi        # 19e5d90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x380>
  a82a04:	48 8d 05 b5 22 db 00 	lea    rax,[rip+0xdb22b5]        # 1834cc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6c58>
  a82a0b:	48 89 05 8e 33 f6 00 	mov    QWORD PTR [rip+0xf6338e],rax        # 19e5da0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x390>
  a82a12:	48 8d 05 87 33 f6 00 	lea    rax,[rip+0xf63387]        # 19e5da0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x390>
  a82a19:	48 89 05 a0 33 f6 00 	mov    QWORD PTR [rip+0xf633a0],rax        # 19e5dc0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3b0>
  a82a20:	4c 89 f7             	mov    rdi,r14
  a82a23:	48 89 da             	mov    rdx,rbx
  a82a26:	e8 35 b4 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82a2b:	48 8d 05 d6 22 db 00 	lea    rax,[rip+0xdb22d6]        # 1834d08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6ca0>
  a82a32:	48 89 05 97 33 f6 00 	mov    QWORD PTR [rip+0xf63397],rax        # 19e5dd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3c0>
  a82a39:	48 8d 35 90 33 f6 00 	lea    rsi,[rip+0xf63390]        # 19e5dd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3c0>
  a82a40:	48 89 35 a9 33 f6 00 	mov    QWORD PTR [rip+0xf633a9],rsi        # 19e5df0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3e0>
  a82a47:	48 8d 05 02 23 db 00 	lea    rax,[rip+0xdb2302]        # 1834d50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6ce8>
  a82a4e:	48 89 05 ab 33 f6 00 	mov    QWORD PTR [rip+0xf633ab],rax        # 19e5e00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3f0>
  a82a55:	48 8d 05 a4 33 f6 00 	lea    rax,[rip+0xf633a4]        # 19e5e00 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x3f0>
  a82a5c:	48 89 05 bd 33 f6 00 	mov    QWORD PTR [rip+0xf633bd],rax        # 19e5e20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x410>
  a82a63:	4c 89 f7             	mov    rdi,r14
  a82a66:	48 89 da             	mov    rdx,rbx
  a82a69:	e8 f2 b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82a6e:	48 8d 05 23 23 db 00 	lea    rax,[rip+0xdb2323]        # 1834d98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6d30>
  a82a75:	48 89 05 b4 33 f6 00 	mov    QWORD PTR [rip+0xf633b4],rax        # 19e5e30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x420>
  a82a7c:	48 8d 35 ad 33 f6 00 	lea    rsi,[rip+0xf633ad]        # 19e5e30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x420>
  a82a83:	48 89 35 c6 33 f6 00 	mov    QWORD PTR [rip+0xf633c6],rsi        # 19e5e50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x440>
  a82a8a:	48 8d 05 4f 23 db 00 	lea    rax,[rip+0xdb234f]        # 1834de0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6d78>
  a82a91:	48 89 05 c8 33 f6 00 	mov    QWORD PTR [rip+0xf633c8],rax        # 19e5e60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x450>
  a82a98:	48 8d 05 c1 33 f6 00 	lea    rax,[rip+0xf633c1]        # 19e5e60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x450>
  a82a9f:	48 89 05 da 33 f6 00 	mov    QWORD PTR [rip+0xf633da],rax        # 19e5e80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x470>
  a82aa6:	4c 89 f7             	mov    rdi,r14
  a82aa9:	48 89 da             	mov    rdx,rbx
  a82aac:	e8 af b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82ab1:	48 8d 05 70 23 db 00 	lea    rax,[rip+0xdb2370]        # 1834e28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6dc0>
  a82ab8:	48 89 05 d1 33 f6 00 	mov    QWORD PTR [rip+0xf633d1],rax        # 19e5e90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x480>
  a82abf:	48 8d 35 ca 33 f6 00 	lea    rsi,[rip+0xf633ca]        # 19e5e90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x480>
  a82ac6:	48 89 35 e3 33 f6 00 	mov    QWORD PTR [rip+0xf633e3],rsi        # 19e5eb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4a0>
  a82acd:	48 8d 05 9c 23 db 00 	lea    rax,[rip+0xdb239c]        # 1834e70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6e08>
  a82ad4:	48 89 05 e5 33 f6 00 	mov    QWORD PTR [rip+0xf633e5],rax        # 19e5ec0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4b0>
  a82adb:	48 8d 05 de 33 f6 00 	lea    rax,[rip+0xf633de]        # 19e5ec0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4b0>
  a82ae2:	48 89 05 f7 33 f6 00 	mov    QWORD PTR [rip+0xf633f7],rax        # 19e5ee0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4d0>
  a82ae9:	4c 89 f7             	mov    rdi,r14
  a82aec:	48 89 da             	mov    rdx,rbx
  a82aef:	e8 6c b3 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82af4:	48 8d 05 bd 23 db 00 	lea    rax,[rip+0xdb23bd]        # 1834eb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6e50>
  a82afb:	48 89 05 ee 33 f6 00 	mov    QWORD PTR [rip+0xf633ee],rax        # 19e5ef0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4e0>
  a82b02:	48 8d 35 e7 33 f6 00 	lea    rsi,[rip+0xf633e7]        # 19e5ef0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x4e0>
  a82b09:	48 89 35 00 34 f6 00 	mov    QWORD PTR [rip+0xf63400],rsi        # 19e5f10 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x500>
  a82b10:	48 8d 05 e9 23 db 00 	lea    rax,[rip+0xdb23e9]        # 1834f00 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6e98>
  a82b17:	48 89 05 02 34 f6 00 	mov    QWORD PTR [rip+0xf63402],rax        # 19e5f20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x510>
  a82b1e:	48 8d 05 fb 33 f6 00 	lea    rax,[rip+0xf633fb]        # 19e5f20 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x510>
  a82b25:	48 89 05 14 34 f6 00 	mov    QWORD PTR [rip+0xf63414],rax        # 19e5f40 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x530>
  a82b2c:	48 8d 05 15 24 db 00 	lea    rax,[rip+0xdb2415]        # 1834f48 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6ee0>
  a82b33:	48 89 05 16 34 f6 00 	mov    QWORD PTR [rip+0xf63416],rax        # 19e5f50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x540>
  a82b3a:	48 8d 05 0f 34 f6 00 	lea    rax,[rip+0xf6340f]        # 19e5f50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x540>
  a82b41:	48 89 05 28 34 f6 00 	mov    QWORD PTR [rip+0xf63428],rax        # 19e5f70 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x560>
  a82b48:	48 8d 05 41 24 db 00 	lea    rax,[rip+0xdb2441]        # 1834f90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6f28>
  a82b4f:	48 89 05 2a 34 f6 00 	mov    QWORD PTR [rip+0xf6342a],rax        # 19e5f80 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x570>
  a82b56:	41 bc 90 00 00 00    	mov    r12d,0x90
  a82b5c:	4a 8d 04 26          	lea    rax,[rsi+r12*1]
  a82b60:	48 89 05 39 34 f6 00 	mov    QWORD PTR [rip+0xf63439],rax        # 19e5fa0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x590>
  a82b67:	48 8d 05 6a 24 db 00 	lea    rax,[rip+0xdb246a]        # 1834fd8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6f70>
  a82b6e:	48 89 05 3b 34 f6 00 	mov    QWORD PTR [rip+0xf6343b],rax        # 19e5fb0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5a0>
  a82b75:	41 bd c0 00 00 00    	mov    r13d,0xc0
  a82b7b:	4a 8d 04 2e          	lea    rax,[rsi+r13*1]
  a82b7f:	48 89 05 4a 34 f6 00 	mov    QWORD PTR [rip+0xf6344a],rax        # 19e5fd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5c0>
  a82b86:	48 8d 05 93 24 db 00 	lea    rax,[rip+0xdb2493]        # 1835020 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6fb8>
  a82b8d:	48 89 05 4c 34 f6 00 	mov    QWORD PTR [rip+0xf6344c],rax        # 19e5fe0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5d0>
  a82b94:	bd f0 00 00 00       	mov    ebp,0xf0
  a82b99:	48 8d 04 2e          	lea    rax,[rsi+rbp*1]
  a82b9d:	48 89 05 5c 34 f6 00 	mov    QWORD PTR [rip+0xf6345c],rax        # 19e6000 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x5f0>
  a82ba4:	4c 8d 3d 31 8a 46 00 	lea    r15,[rip+0x468a31]        # eeb5dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb29f2>
  a82bab:	4c 89 ff             	mov    rdi,r15
  a82bae:	48 89 da             	mov    rdx,rbx
  a82bb1:	e8 aa b2 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a82bb6:	48 8d 05 ab 24 db 00 	lea    rax,[rip+0xdb24ab]        # 1835068 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7000>
  a82bbd:	48 89 05 4c 34 f6 00 	mov    QWORD PTR [rip+0xf6344c],rax        # 19e6010 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x600>
  a82bc4:	48 8d 35 45 34 f6 00 	lea    rsi,[rip+0xf63445]        # 19e6010 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x600>
  a82bcb:	48 89 35 5e 34 f6 00 	mov    QWORD PTR [rip+0xf6345e],rsi        # 19e6030 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x620>
  a82bd2:	48 8d 05 d7 24 db 00 	lea    rax,[rip+0xdb24d7]        # 18350b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7048>
  a82bd9:	48 89 05 60 34 f6 00 	mov    QWORD PTR [rip+0xf63460],rax        # 19e6040 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x630>
  a82be0:	48 8d 05 59 34 f6 00 	lea    rax,[rip+0xf63459]        # 19e6040 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x630>
  a82be7:	48 89 05 72 34 f6 00 	mov    QWORD PTR [rip+0xf63472],rax        # 19e6060 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x650>
  a82bee:	48 8d 05 03 25 db 00 	lea    rax,[rip+0xdb2503]        # 18350f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7090>
  a82bf5:	48 89 05 74 34 f6 00 	mov    QWORD PTR [rip+0xf63474],rax        # 19e6070 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x660>
  a82bfc:	48 8d 05 6d 34 f6 00 	lea    rax,[rip+0xf6346d]        # 19e6070 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x660>
  a82c03:	48 89 05 86 34 f6 00 	mov    QWORD PTR [rip+0xf63486],rax        # 19e6090 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x680>
  a82c0a:	48 8d 05 2f 25 db 00 	lea    rax,[rip+0xdb252f]        # 1835140 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x70d8>
  a82c11:	48 89 05 88 34 f6 00 	mov    QWORD PTR [rip+0xf63488],rax        # 19e60a0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x690>
  a82c18:	49 01 f4             	add    r12,rsi
  a82c1b:	4c 89 25 9e 34 f6 00 	mov    QWORD PTR [rip+0xf6349e],r12        # 19e60c0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x6b0>
  a82c22:	48 8d 05 5f 25 db 00 	lea    rax,[rip+0xdb255f]        # 1835188 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7120>
  a82c29:	48 89 05 a0 34 f6 00 	mov    QWORD PTR [rip+0xf634a0],rax        # 19e60d0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x6c0>
```
### AP `0x18b1168` +0x28 -> `0xa92a08` score 14

```text
  a92a08:	41 57                	push   r15
  a92a0a:	41 56                	push   r14
  a92a0c:	53                   	push   rbx
  a92a0d:	e8 88 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a12:	e8 ca dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a17:	e8 0c de 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a1c:	e8 4e de 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a21:	48 8d 1d d8 c1 f5 00 	lea    rbx,[rip+0xf5c1d8]        # 19eec00 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x330>
  a92a28:	48 8d 35 93 e2 8b ff 	lea    rsi,[rip+0xffffffffff8be293]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92a2f:	48 89 df             	mov    rdi,rbx
  a92a32:	e8 47 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a37:	4c 8b 35 02 f0 e1 00 	mov    r14,QWORD PTR [rip+0xe1f002]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92a3e:	4c 8d 3d bb 15 d6 00 	lea    r15,[rip+0xd615bb]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92a45:	4c 89 f7             	mov    rdi,r14
  a92a48:	48 89 de             	mov    rsi,rbx
  a92a4b:	4c 89 fa             	mov    rdx,r15
  a92a4e:	e8 0d b4 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92a53:	48 8d 1d be c1 f5 00 	lea    rbx,[rip+0xf5c1be]        # 19eec18 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x348>
  a92a5a:	48 8d 35 69 d3 89 ff 	lea    rsi,[rip+0xffffffffff89d369]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92a61:	48 89 df             	mov    rdi,rbx
  a92a64:	e8 15 70 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92a69:	4c 89 f7             	mov    rdi,r14
  a92a6c:	48 89 de             	mov    rsi,rbx
  a92a6f:	4c 89 fa             	mov    rdx,r15
  a92a72:	5b                   	pop    rbx
  a92a73:	41 5e                	pop    r14
  a92a75:	41 5f                	pop    r15
  a92a77:	e9 e4 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c64:	53                   	push   rbx
  a92c65:	48 8d 1d 44 c1 f5 00 	lea    rbx,[rip+0xf5c144]        # 19eedb0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4e0>
  a92c6c:	48 8d 35 00 a4 8a ff 	lea    rsi,[rip+0xffffffffff8aa400]        # 33d073 <_ZTSSt12bad_any_cast@@Base-0x53155>
  a92c73:	48 89 df             	mov    rdi,rbx
  a92c76:	e8 03 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c7b:	48 8b 3d be ed e1 00 	mov    rdi,QWORD PTR [rip+0xe1edbe]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c82:	48 8d 15 77 13 d6 00 	lea    rdx,[rip+0xd61377]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c89:	48 89 de             	mov    rsi,rbx
  a92c8c:	5b                   	pop    rbx
  a92c8d:	e9 ce b1 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c92:	55                   	push   rbp
  a92c93:	41 57                	push   r15
  a92c95:	41 56                	push   r14
  a92c97:	41 55                	push   r13
  a92c99:	41 54                	push   r12
  a92c9b:	53                   	push   rbx
  a92c9c:	50                   	push   rax
  a92c9d:	4c 8d 3d 24 c1 f5 00 	lea    r15,[rip+0xf5c124]        # 19eedc8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4f8>
```
### AP `0x18b1170` +0x28 -> `0xa92a7c` score 14

```text
  a92a7c:	41 57                	push   r15
  a92a7e:	41 56                	push   r14
  a92a80:	53                   	push   rbx
  a92a81:	e8 14 dd 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92a86:	e8 56 dd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92a8b:	e8 98 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92a90:	e8 da dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92a95:	48 8d 1d 94 c1 f5 00 	lea    rbx,[rip+0xf5c194]        # 19eec30 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x360>
  a92a9c:	48 8d 35 1f e2 8b ff 	lea    rsi,[rip+0xffffffffff8be21f]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92aa3:	48 89 df             	mov    rdi,rbx
  a92aa6:	e8 d3 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92aab:	4c 8b 35 8e ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef8e]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92ab2:	4c 8d 3d 47 15 d6 00 	lea    r15,[rip+0xd61547]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92ab9:	4c 89 f7             	mov    rdi,r14
  a92abc:	48 89 de             	mov    rsi,rbx
  a92abf:	4c 89 fa             	mov    rdx,r15
  a92ac2:	e8 99 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92ac7:	48 8d 1d 7a c1 f5 00 	lea    rbx,[rip+0xf5c17a]        # 19eec48 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x378>
  a92ace:	48 8d 35 f5 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d2f5]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92ad5:	48 89 df             	mov    rdi,rbx
  a92ad8:	e8 a1 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92add:	4c 89 f7             	mov    rdi,r14
  a92ae0:	48 89 de             	mov    rsi,rbx
  a92ae3:	4c 89 fa             	mov    rdx,r15
  a92ae6:	5b                   	pop    rbx
  a92ae7:	41 5e                	pop    r14
  a92ae9:	41 5f                	pop    r15
  a92aeb:	e9 70 b3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c64:	53                   	push   rbx
  a92c65:	48 8d 1d 44 c1 f5 00 	lea    rbx,[rip+0xf5c144]        # 19eedb0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4e0>
  a92c6c:	48 8d 35 00 a4 8a ff 	lea    rsi,[rip+0xffffffffff8aa400]        # 33d073 <_ZTSSt12bad_any_cast@@Base-0x53155>
  a92c73:	48 89 df             	mov    rdi,rbx
  a92c76:	e8 03 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c7b:	48 8b 3d be ed e1 00 	mov    rdi,QWORD PTR [rip+0xe1edbe]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c82:	48 8d 15 77 13 d6 00 	lea    rdx,[rip+0xd61377]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c89:	48 89 de             	mov    rsi,rbx
  a92c8c:	5b                   	pop    rbx
  a92c8d:	e9 ce b1 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c92:	55                   	push   rbp
  a92c93:	41 57                	push   r15
  a92c95:	41 56                	push   r14
  a92c97:	41 55                	push   r13
  a92c99:	41 54                	push   r12
  a92c9b:	53                   	push   rbx
  a92c9c:	50                   	push   rax
  a92c9d:	4c 8d 3d 24 c1 f5 00 	lea    r15,[rip+0xf5c124]        # 19eedc8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4f8>
  a92ca4:	48 8d 35 0e 10 8c ff 	lea    rsi,[rip+0xffffffffff8c100e]        # 353cb9 <_ZTSSt12bad_any_cast@@Base-0x3c50f>
  a92cab:	6a 1e                	push   0x1e
  a92cad:	41 5c                	pop    r12
  a92caf:	4c 89 ff             	mov    rdi,r15
  a92cb2:	4c 89 e2             	mov    rdx,r12
  a92cb5:	e8 e6 b1 d5 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
  a92cba:	4c 8b 35 7f ed e1 00 	mov    r14,QWORD PTR [rip+0xe1ed7f]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92cc1:	48 8d 1d 38 13 d6 00 	lea    rbx,[rip+0xd61338]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92cc8:	4c 89 f7             	mov    rdi,r14
  a92ccb:	4c 89 fe             	mov    rsi,r15
  a92cce:	48 89 da             	mov    rdx,rbx
  a92cd1:	e8 8a b1 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92cd6:	4c 8d 2d 03 c1 f5 00 	lea    r13,[rip+0xf5c103]        # 19eede0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x510>
  a92cdd:	48 8d 35 8b e7 8e ff 	lea    rsi,[rip+0xffffffffff8ee78b]        # 38146f <_ZTSSt12bad_any_cast@@Base-0xed59>
  a92ce4:	6a 1f                	push   0x1f
  a92ce6:	41 5f                	pop    r15
  a92ce8:	4c 89 ef             	mov    rdi,r13
  a92ceb:	4c 89 fa             	mov    rdx,r15
  a92cee:	e8 ad b1 d5 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
  a92cf3:	4c 89 f7             	mov    rdi,r14
  a92cf6:	4c 89 ee             	mov    rsi,r13
  a92cf9:	48 89 da             	mov    rdx,rbx
  a92cfc:	e8 5f b1 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92d01:	4c 8d 2d f0 c0 f5 00 	lea    r13,[rip+0xf5c0f0]        # 19eedf8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x528>
  a92d08:	48 8d 35 b9 cd 89 ff 	lea    rsi,[rip+0xffffffffff89cdb9]        # 32fac8 <_ZTSSt12bad_any_cast@@Base-0x60700>
  a92d0f:	4c 89 ef             	mov    rdi,r13
  a92d12:	4c 89 e2             	mov    rdx,r12
  a92d15:	e8 86 b1 d5 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
```
### AP `0x18b1178` +0x28 -> `0xa92af0` score 14

```text
  a92af0:	41 57                	push   r15
  a92af2:	41 56                	push   r14
  a92af4:	53                   	push   rbx
  a92af5:	e8 a0 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92afa:	e8 e2 dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92aff:	e8 24 dd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b04:	e8 66 dd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92b09:	48 8d 1d 50 c1 f5 00 	lea    rbx,[rip+0xf5c150]        # 19eec60 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x390>
  a92b10:	48 8d 35 ab e1 8b ff 	lea    rsi,[rip+0xffffffffff8be1ab]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92b17:	48 89 df             	mov    rdi,rbx
  a92b1a:	e8 5f 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b1f:	4c 8b 35 1a ef e1 00 	mov    r14,QWORD PTR [rip+0xe1ef1a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92b26:	4c 8d 3d d3 14 d6 00 	lea    r15,[rip+0xd614d3]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92b2d:	4c 89 f7             	mov    rdi,r14
  a92b30:	48 89 de             	mov    rsi,rbx
  a92b33:	4c 89 fa             	mov    rdx,r15
  a92b36:	e8 25 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b3b:	48 8d 1d 36 c1 f5 00 	lea    rbx,[rip+0xf5c136]        # 19eec78 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3a8>
  a92b42:	48 8d 35 81 d2 89 ff 	lea    rsi,[rip+0xffffffffff89d281]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92b49:	48 89 df             	mov    rdi,rbx
  a92b4c:	e8 2d 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b51:	4c 89 f7             	mov    rdi,r14
  a92b54:	48 89 de             	mov    rsi,rbx
  a92b57:	4c 89 fa             	mov    rdx,r15
  a92b5a:	e8 01 b3 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92b5f:	48 8d 1d 2a c1 f5 00 	lea    rbx,[rip+0xf5c12a]        # 19eec90 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3c0>
  a92b66:	48 8d 35 08 3d 8a ff 	lea    rsi,[rip+0xffffffffff8a3d08]        # 336875 <_ZTSSt12bad_any_cast@@Base-0x59953>
  a92b6d:	48 89 df             	mov    rdi,rbx
  a92b70:	e8 09 6f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92b75:	4c 89 f7             	mov    rdi,r14
  a92b78:	48 89 de             	mov    rsi,rbx
  a92b7b:	4c 89 fa             	mov    rdx,r15
  a92b7e:	5b                   	pop    rbx
  a92b7f:	41 5e                	pop    r14
  a92b81:	41 5f                	pop    r15
  a92b83:	e9 d8 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92b88:	41 57                	push   r15
  a92b8a:	41 56                	push   r14
  a92b8c:	53                   	push   rbx
  a92b8d:	e8 08 dc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92b92:	e8 4a dc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92b97:	e8 8c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92b9c:	e8 ce dc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a92ba1:	48 8d 1d 00 c1 f5 00 	lea    rbx,[rip+0xf5c100]        # 19eeca8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3d8>
  a92ba8:	48 8d 35 13 e1 8b ff 	lea    rsi,[rip+0xffffffffff8be113]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>
  a92baf:	48 89 df             	mov    rdi,rbx
  a92bb2:	e8 c7 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92bb7:	4c 8b 35 82 ee e1 00 	mov    r14,QWORD PTR [rip+0xe1ee82]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92bbe:	4c 8d 3d 3b 14 d6 00 	lea    r15,[rip+0xd6143b]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92bc5:	4c 89 f7             	mov    rdi,r14
  a92bc8:	48 89 de             	mov    rsi,rbx
  a92bcb:	4c 89 fa             	mov    rdx,r15
  a92bce:	e8 8d b2 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92bd3:	48 8d 1d e6 c0 f5 00 	lea    rbx,[rip+0xf5c0e6]        # 19eecc0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x3f0>
  a92bda:	48 8d 35 e9 d1 89 ff 	lea    rsi,[rip+0xffffffffff89d1e9]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>
  a92be1:	48 89 df             	mov    rdi,rbx
  a92be4:	e8 95 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92be9:	4c 89 f7             	mov    rdi,r14
  a92bec:	48 89 de             	mov    rsi,rbx
  a92bef:	4c 89 fa             	mov    rdx,r15
  a92bf2:	5b                   	pop    rbx
  a92bf3:	41 5e                	pop    r14
  a92bf5:	41 5f                	pop    r15
  a92bf7:	e9 64 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92bfc:	50                   	push   rax
  a92bfd:	e8 98 db 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a92c02:	e8 da db 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a92c07:	e8 1c dc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92c0c:	58                   	pop    rax
  a92c0d:	e9 5d dc 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92c12:	53                   	push   rbx
  a92c13:	48 8d 1d c6 c0 f5 00 	lea    rbx,[rip+0xf5c0c6]        # 19eece0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x410>
  a92c1a:	48 8d 35 40 84 8d ff 	lea    rsi,[rip+0xffffffffff8d8440]        # 36b061 <_ZTSSt12bad_any_cast@@Base-0x25167>
  a92c21:	48 89 df             	mov    rdi,rbx
  a92c24:	e8 55 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c29:	48 8b 3d 10 ee e1 00 	mov    rdi,QWORD PTR [rip+0xe1ee10]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c30:	48 8d 15 c9 13 d6 00 	lea    rdx,[rip+0xd613c9]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c37:	48 89 de             	mov    rsi,rbx
  a92c3a:	5b                   	pop    rbx
  a92c3b:	e9 20 b2 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c40:	48 8d 3d c9 4f e9 00 	lea    rdi,[rip+0xe94fc9]        # 1927c10 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f020>
  a92c47:	e9 7b 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c4c:	48 8d 3d f5 56 e9 00 	lea    rdi,[rip+0xe956f5]        # 1928348 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f758>
  a92c53:	e9 6f 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c58:	48 8d 3d 29 58 e9 00 	lea    rdi,[rip+0xe95829]        # 1928488 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f898>
  a92c5f:	e9 63 48 cb 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a92c64:	53                   	push   rbx
  a92c65:	48 8d 1d 44 c1 f5 00 	lea    rbx,[rip+0xf5c144]        # 19eedb0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4e0>
  a92c6c:	48 8d 35 00 a4 8a ff 	lea    rsi,[rip+0xffffffffff8aa400]        # 33d073 <_ZTSSt12bad_any_cast@@Base-0x53155>
  a92c73:	48 89 df             	mov    rdi,rbx
  a92c76:	e8 03 6e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a92c7b:	48 8b 3d be ed e1 00 	mov    rdi,QWORD PTR [rip+0xe1edbe]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92c82:	48 8d 15 77 13 d6 00 	lea    rdx,[rip+0xd61377]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92c89:	48 89 de             	mov    rsi,rbx
  a92c8c:	5b                   	pop    rbx
  a92c8d:	e9 ce b1 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92c92:	55                   	push   rbp
  a92c93:	41 57                	push   r15
  a92c95:	41 56                	push   r14
  a92c97:	41 55                	push   r13
  a92c99:	41 54                	push   r12
  a92c9b:	53                   	push   rbx
  a92c9c:	50                   	push   rax
  a92c9d:	4c 8d 3d 24 c1 f5 00 	lea    r15,[rip+0xf5c124]        # 19eedc8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x4f8>
  a92ca4:	48 8d 35 0e 10 8c ff 	lea    rsi,[rip+0xffffffffff8c100e]        # 353cb9 <_ZTSSt12bad_any_cast@@Base-0x3c50f>
  a92cab:	6a 1e                	push   0x1e
  a92cad:	41 5c                	pop    r12
  a92caf:	4c 89 ff             	mov    rdi,r15
  a92cb2:	4c 89 e2             	mov    rdx,r12
  a92cb5:	e8 e6 b1 d5 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
  a92cba:	4c 8b 35 7f ed e1 00 	mov    r14,QWORD PTR [rip+0xe1ed7f]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a92cc1:	48 8d 1d 38 13 d6 00 	lea    rbx,[rip+0xd61338]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a92cc8:	4c 89 f7             	mov    rdi,r14
  a92ccb:	4c 89 fe             	mov    rsi,r15
  a92cce:	48 89 da             	mov    rdx,rbx
  a92cd1:	e8 8a b1 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92cd6:	4c 8d 2d 03 c1 f5 00 	lea    r13,[rip+0xf5c103]        # 19eede0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x510>
  a92cdd:	48 8d 35 8b e7 8e ff 	lea    rsi,[rip+0xffffffffff8ee78b]        # 38146f <_ZTSSt12bad_any_cast@@Base-0xed59>
  a92ce4:	6a 1f                	push   0x1f
  a92ce6:	41 5f                	pop    r15
  a92ce8:	4c 89 ef             	mov    rdi,r13
  a92ceb:	4c 89 fa             	mov    rdx,r15
  a92cee:	e8 ad b1 d5 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
  a92cf3:	4c 89 f7             	mov    rdi,r14
  a92cf6:	4c 89 ee             	mov    rsi,r13
  a92cf9:	48 89 da             	mov    rdx,rbx
  a92cfc:	e8 5f b1 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92d01:	4c 8d 2d f0 c0 f5 00 	lea    r13,[rip+0xf5c0f0]        # 19eedf8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x528>
  a92d08:	48 8d 35 b9 cd 89 ff 	lea    rsi,[rip+0xffffffffff89cdb9]        # 32fac8 <_ZTSSt12bad_any_cast@@Base-0x60700>
  a92d0f:	4c 89 ef             	mov    rdi,r13
  a92d12:	4c 89 e2             	mov    rdx,r12
  a92d15:	e8 86 b1 d5 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
  a92d1a:	4c 89 f7             	mov    rdi,r14
  a92d1d:	4c 89 ee             	mov    rsi,r13
  a92d20:	48 89 da             	mov    rdx,rbx
  a92d23:	e8 38 b1 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92d28:	4c 8d 2d e1 c0 f5 00 	lea    r13,[rip+0xf5c0e1]        # 19eee10 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x540>
  a92d2f:	48 8d 35 b1 cd 89 ff 	lea    rsi,[rip+0xffffffffff89cdb1]        # 32fae7 <_ZTSSt12bad_any_cast@@Base-0x606e1>
  a92d36:	6a 1d                	push   0x1d
  a92d38:	5a                   	pop    rdx
  a92d39:	4c 89 ef             	mov    rdi,r13
  a92d3c:	e8 5f b1 d5 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
  a92d41:	4c 89 f7             	mov    rdi,r14
  a92d44:	4c 89 ee             	mov    rsi,r13
  a92d47:	48 89 da             	mov    rdx,rbx
  a92d4a:	e8 11 b1 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92d4f:	48 8d 2d d2 c0 f5 00 	lea    rbp,[rip+0xf5c0d2]        # 19eee28 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x558>
  a92d56:	48 8d 35 9a 51 8f ff 	lea    rsi,[rip+0xffffffffff8f519a]        # 387ef7 <_ZTSSt12bad_any_cast@@Base-0x82d1>
  a92d5d:	6a 21                	push   0x21
  a92d5f:	41 5d                	pop    r13
  a92d61:	48 89 ef             	mov    rdi,rbp
  a92d64:	4c 89 ea             	mov    rdx,r13
  a92d67:	e8 34 b1 d5 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
  a92d6c:	4c 89 f7             	mov    rdi,r14
  a92d6f:	48 89 ee             	mov    rsi,rbp
  a92d72:	48 89 da             	mov    rdx,rbx
  a92d75:	e8 e6 b0 d5 00       	call   17ede60 <__cxa_atexit@plt>
  a92d7a:	48 8d 2d bf c0 f5 00 	lea    rbp,[rip+0xf5c0bf]        # 19eee40 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x570>
  a92d81:	48 8d 35 19 4a 8b ff 	lea    rsi,[rip+0xffffffffff8b4a19]        # 3477a1 <_ZTSSt12bad_any_cast@@Base-0x48a27>
  a92d88:	48 89 ef             	mov    rdi,rbp
```
### AP `0x1812b38` +0x28 -> `0xbddb90` score 13

```text
  bddb90:	53                   	push   rbx
  bddb91:	48 83 ec 10          	sub    rsp,0x10
  bddb95:	48 89 fb             	mov    rbx,rdi
  bddb98:	48 8b 87 28 01 00 00 	mov    rax,QWORD PTR [rdi+0x128]
  bddb9f:	48 3b 87 30 01 00 00 	cmp    rax,QWORD PTR [rdi+0x130]
  bddba6:	74 4b                	je     bddbf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12ab93>
  bddba8:	f2 0f 10 15 78 12 7b 	movsd  xmm2,QWORD PTR [rip+0xffffffffff7b1278]        # 38ee28 <_ZTSSt12bad_any_cast@@Base-0x13a0>
  bddbaf:	ff
  bddbb0:	f2 0f 58 d0          	addsd  xmm2,xmm0
  bddbb4:	66 0f 54 15 04 ed 7a 	andpd  xmm2,XMMWORD PTR [rip+0xffffffffff7aed04]        # 38c8c0 <_ZTSSt12bad_any_cast@@Base-0x3908>
  bddbbb:	ff
  bddbbc:	f2 0f 10 0d 54 14 7b 	movsd  xmm1,QWORD PTR [rip+0xffffffffff7b1454]        # 38f018 <_ZTSSt12bad_any_cast@@Base-0x11b0>
  bddbc3:	ff
  bddbc4:	66 0f 2e ca          	ucomisd xmm1,xmm2
  bddbc8:	77 29                	ja     bddbf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12ab93>
  bddbca:	48 8d 35 ab 43 87 ff 	lea    rsi,[rip+0xffffffffff8743ab]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  bddbd1:	48 8d 0d fe 79 77 ff 	lea    rcx,[rip+0xffffffffff7779fe]        # 3555d6 <_ZTSSt12bad_any_cast@@Base-0x3abf2>
  bddbd8:	6a 03                	push   0x3
  bddbda:	5f                   	pop    rdi
  bddbdb:	ba 99 01 00 00       	mov    edx,0x199
  bddbe0:	b0 01                	mov    al,0x1
  bddbe2:	f2 0f 11 44 24 08    	movsd  QWORD PTR [rsp+0x8],xmm0
  bddbe8:	e8 e5 8c bf 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  bddbed:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
  bddbf3:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
  bddbf7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  bddbfa:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
  bddc01:	48 83 c4 10          	add    rsp,0x10
  bddc05:	5b                   	pop    rbx
  bddc06:	ff e0                	jmp    rax
  bddc08:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
  bddc0c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  bddc0f:	ff a0 a0 00 00 00    	jmp    QWORD PTR [rax+0xa0]
  bddc15:	cc                   	int3
```
### AP `0x182d030` +0x28 -> `0xe06522` score 13

```text
  e06522:	55                   	push   rbp
  e06523:	41 57                	push   r15
  e06525:	41 56                	push   r14
  e06527:	41 55                	push   r13
  e06529:	41 54                	push   r12
  e0652b:	53                   	push   rbx
  e0652c:	48 81 ec a8 03 00 00 	sub    rsp,0x3a8
  e06533:	49 89 d6             	mov    r14,rdx
  e06536:	49 89 f7             	mov    r15,rsi
  e06539:	48 89 fb             	mov    rbx,rdi
  e0653c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e06543:	00 00
  e06545:	48 89 84 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],rax
  e0654c:	00
  e0654d:	e8 75 43 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
  e06552:	41 0f b6 4f 02       	movzx  ecx,BYTE PTR [r15+0x2]
  e06557:	41 0f b6 57 01       	movzx  edx,BYTE PTR [r15+0x1]
  e0655c:	4c 8d a4 24 70 03 00 	lea    r12,[rsp+0x370]
  e06563:	00
  e06564:	6a 05                	push   0x5
  e06566:	41 58                	pop    r8
  e06568:	4c 89 e7             	mov    rdi,r12
  e0656b:	48 89 de             	mov    rsi,rbx
  e0656e:	e8 a9 4e 00 00       	call   e0b41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd84a2>
  e06573:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e06579:	74 2a                	je     e065a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd362b>
  e0657b:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  e0657f:	48 8d b4 24 70 03 00 	lea    rsi,[rsp+0x370]
  e06586:	00
  e06587:	e8 04 78 cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e0658c:	48 8b bc 24 88 03 00 	mov    rdi,QWORD PTR [rsp+0x388]
  e06593:	00
  e06594:	8b b4 24 98 03 00 00 	mov    esi,DWORD PTR [rsp+0x398]
  e0659b:	e8 46 4f 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e065a0:	e9 fc 01 00 00       	jmp    e067a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3827>
  e065a5:	4c 8d ac 24 70 03 00 	lea    r13,[rsp+0x370]
  e065ac:	00
  e065ad:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
  e065b1:	31 f6                	xor    esi,esi
  e065b3:	e8 2e 4f 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e065b8:	4d 8d 67 18          	lea    r12,[r15+0x18]
  e065bc:	4c 89 e7             	mov    rdi,r12
  e065bf:	e8 bb 6e 05 00       	call   e5d47f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24895>
  e065c4:	4c 89 ef             	mov    rdi,r13
  e065c7:	4c 89 fe             	mov    rsi,r15
  e065ca:	e8 e9 92 86 00       	call   166f8b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a24>
  e065cf:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e065d3:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
  e065d7:	48 89 e5             	mov    rbp,rsp
  e065da:	48 89 ef             	mov    rdi,rbp
  e065dd:	e8 23 44 00 00       	call   e0aa05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a8b>
  e065e2:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e065e6:	e8 75 81 9e 00       	call   17ee760 <free@plt>
  e065eb:	48 8b bb f0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1f0]
  e065f2:	48 89 ee             	mov    rsi,rbp
  e065f5:	e8 1e 44 00 00       	call   e0aa18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a9e>
  e065fa:	84 c0                	test   al,al
  e065fc:	0f 84 93 00 00 00    	je     e06695 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd371b>
  e06602:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e06607:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  e0660c:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  e06610:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  e06615:	0f 57 c0             	xorps  xmm0,xmm0
  e06618:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  e0661c:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  e06622:	48 8d 73 10          	lea    rsi,[rbx+0x10]
  e06626:	4c 8d bc 24 00 03 00 	lea    r15,[rsp+0x300]
  e0662d:	00
  e0662e:	4c 89 ff             	mov    rdi,r15
  e06631:	4c 89 f2             	mov    rdx,r14
  e06634:	e8 f8 43 00 00       	call   e0aa31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ab7>
  e06639:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
  e06640:	00
  e06641:	4c 89 fe             	mov    rsi,r15
  e06644:	e8 03 44 00 00       	call   e0aa4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ad2>
  e06649:	48 81 c3 d0 01 00 00 	add    rbx,0x1d0
  e06650:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  e06655:	4c 8d bc 24 40 03 00 	lea    r15,[rsp+0x340]
  e0665c:	00
  e0665d:	48 89 df             	mov    rdi,rbx
  e06660:	4c 89 f6             	mov    rsi,r14
  e06663:	4c 89 fa             	mov    rdx,r15
  e06666:	e8 9d 44 00 00       	call   e0ab08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7b8e>
  e0666b:	4c 89 ff             	mov    rdi,r15
  e0666e:	e8 f7 38 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e06673:	48 8d bc 24 10 03 00 	lea    rdi,[rsp+0x310]
  e0667a:	00
  e0667b:	e8 ea 38 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e06680:	4c 89 f7             	mov    rdi,r14
  e06683:	e8 08 78 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e06688:	48 89 e7             	mov    rdi,rsp
  e0668b:	e8 00 78 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e06690:	e9 0c 01 00 00       	jmp    e067a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3827>
  e06695:	48 89 e7             	mov    rdi,rsp
  e06698:	e8 f3 77 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e0669d:	8a 83 e8 02 00 00    	mov    al,BYTE PTR [rbx+0x2e8]
  e066a3:	a8 01                	test   al,0x1
  e066a5:	0f 85 c0 00 00 00    	jne    e0676b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd37f1>
  e066ab:	48 8b bb 50 03 00 00 	mov    rdi,QWORD PTR [rbx+0x350]
  e066b2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e066b5:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e066bb:	49 8d 7f 68          	lea    rdi,[r15+0x68]
  e066bf:	48 89 c6             	mov    rsi,rax
  e066c2:	e8 b9 79 9e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  e066c7:	49 89 e5             	mov    r13,rsp
  e066ca:	4c 89 ef             	mov    rdi,r13
  e066cd:	4c 89 fe             	mov    rsi,r15
  e066d0:	e8 e3 91 86 00       	call   166f8b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a24>
  e066d5:	4c 8b bb 50 03 00 00 	mov    r15,QWORD PTR [rbx+0x350]
  e066dc:	48 8d 6c 24 38       	lea    rbp,[rsp+0x38]
  e066e1:	48 89 ef             	mov    rdi,rbp
  e066e4:	4c 89 e6             	mov    rsi,r12
  e066e7:	e8 92 57 86 00       	call   166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
  e066ec:	48 8d 35 26 4b 57 ff 	lea    rsi,[rip+0xffffffffff574b26]        # 37b219 <_ZTSSt12bad_any_cast@@Base-0x14faf>
  e066f3:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e066fa:	00
  e066fb:	48 89 ea             	mov    rdx,rbp
  e066fe:	e8 57 6d 05 00       	call   e5d45a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24870>
  e06703:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
  e06707:	4d 8b 6d 08          	mov    r13,QWORD PTR [r13+0x8]
  e0670b:	48 8d bc 24 70 03 00 	lea    rdi,[rsp+0x370]
  e06712:	00
  e06713:	48 89 de             	mov    rsi,rbx
  e06716:	4c 89 f2             	mov    rdx,r14
  e06719:	e8 90 44 00 00       	call   e0abae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7c34>
  e0671e:	4d 29 e5             	sub    r13,r12
  e06721:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e06724:	48 8d 9c 24 d8 00 00 	lea    rbx,[rsp+0xd8]
  e0672b:	00
  e0672c:	4c 8d b4 24 70 03 00 	lea    r14,[rsp+0x370]
  e06733:	00
  e06734:	4c 89 ff             	mov    rdi,r15
  e06737:	48 89 de             	mov    rsi,rbx
  e0673a:	4c 89 e2             	mov    rdx,r12
  e0673d:	4c 89 e9             	mov    rcx,r13
  e06740:	4d 89 f0             	mov    r8,r14
  e06743:	ff 50 48             	call   QWORD PTR [rax+0x48]
  e06746:	4c 89 f7             	mov    rdi,r14
  e06749:	e8 1c 38 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e0674e:	48 89 df             	mov    rdi,rbx
  e06751:	e8 60 e6 fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e06756:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e0675b:	e8 78 58 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e06760:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e06764:	e8 f7 7f 9e 00       	call   17ee760 <free@plt>
  e06769:	eb 36                	jmp    e067a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3827>
  e0676b:	48 8b 9b 40 03 00 00 	mov    rbx,QWORD PTR [rbx+0x340]
  e06772:	4c 8d a4 24 38 02 00 	lea    r12,[rsp+0x238]
  e06779:	00
  e0677a:	4c 89 e7             	mov    rdi,r12
  e0677d:	4c 89 fe             	mov    rsi,r15
  e06780:	e8 03 16 86 00       	call   1667d88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bef4>
  e06785:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e06788:	48 89 df             	mov    rdi,rbx
  e0678b:	4c 89 e6             	mov    rsi,r12
  e0678e:	4c 89 f2             	mov    rdx,r14
  e06791:	ff 50 38             	call   QWORD PTR [rax+0x38]
  e06794:	48 8d bc 24 38 02 00 	lea    rdi,[rsp+0x238]
  e0679b:	00
  e0679c:	e8 3f 16 86 00       	call   1667de0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bf4c>
```
### AP `0x182d038` +0x28 -> `0xe0685c` score 13

```text
  e0685c:	55                   	push   rbp
  e0685d:	41 57                	push   r15
  e0685f:	41 56                	push   r14
  e06861:	41 55                	push   r13
  e06863:	41 54                	push   r12
  e06865:	53                   	push   rbx
  e06866:	48 81 ec b8 03 00 00 	sub    rsp,0x3b8
  e0686d:	48 89 d3             	mov    rbx,rdx
  e06870:	49 89 f7             	mov    r15,rsi
  e06873:	49 89 fe             	mov    r14,rdi
  e06876:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e0687d:	00 00
  e0687f:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
  e06886:	00
  e06887:	e8 3b 40 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
  e0688c:	41 0f b6 4f 02       	movzx  ecx,BYTE PTR [r15+0x2]
  e06891:	41 0f b6 57 01       	movzx  edx,BYTE PTR [r15+0x1]
  e06896:	4c 8d a4 24 80 03 00 	lea    r12,[rsp+0x380]
  e0689d:	00
  e0689e:	6a 07                	push   0x7
  e068a0:	41 58                	pop    r8
  e068a2:	4c 89 e7             	mov    rdi,r12
  e068a5:	4c 89 f6             	mov    rsi,r14
  e068a8:	e8 6f 4b 00 00       	call   e0b41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd84a2>
  e068ad:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e068b3:	74 2a                	je     e068df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3965>
  e068b5:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
  e068b9:	48 8d b4 24 80 03 00 	lea    rsi,[rsp+0x380]
  e068c0:	00
  e068c1:	e8 ca 74 cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e068c6:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]
  e068cd:	00
  e068ce:	8b b4 24 a8 03 00 00 	mov    esi,DWORD PTR [rsp+0x3a8]
  e068d5:	e8 0c 4c 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e068da:	e9 65 02 00 00       	jmp    e06b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3bca>
  e068df:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
  e068e6:	00
  e068e7:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
  e068eb:	31 f6                	xor    esi,esi
  e068ed:	e8 f4 4b 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e068f2:	4d 8d 67 18          	lea    r12,[r15+0x18]
  e068f6:	4c 89 e7             	mov    rdi,r12
  e068f9:	e8 81 6b 05 00       	call   e5d47f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24895>
  e068fe:	4c 89 ef             	mov    rdi,r13
  e06901:	4c 89 fe             	mov    rsi,r15
  e06904:	e8 e7 90 86 00       	call   166f9f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23b5c>
  e06909:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e0690d:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
  e06911:	48 89 e5             	mov    rbp,rsp
  e06914:	48 89 ef             	mov    rdi,rbp
  e06917:	e8 e9 40 00 00       	call   e0aa05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a8b>
  e0691c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e06920:	e8 3b 7e 9e 00       	call   17ee760 <free@plt>
  e06925:	49 8b be f0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1f0]
  e0692c:	48 89 ee             	mov    rsi,rbp
  e0692f:	e8 e4 40 00 00       	call   e0aa18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a9e>
  e06934:	84 c0                	test   al,al
  e06936:	0f 84 93 00 00 00    	je     e069cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3a55>
  e0693c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e06941:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  e06946:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  e0694a:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  e0694f:	0f 57 c0             	xorps  xmm0,xmm0
  e06952:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  e06956:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  e0695c:	49 8d 76 10          	lea    rsi,[r14+0x10]
  e06960:	4c 8d bc 24 10 03 00 	lea    r15,[rsp+0x310]
  e06967:	00
  e06968:	4c 89 ff             	mov    rdi,r15
  e0696b:	48 89 da             	mov    rdx,rbx
  e0696e:	e8 be 40 00 00       	call   e0aa31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ab7>
  e06973:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
  e0697a:	00
  e0697b:	4c 89 fe             	mov    rsi,r15
  e0697e:	e8 c9 40 00 00       	call   e0aa4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ad2>
  e06983:	49 81 c6 d0 01 00 00 	add    r14,0x1d0
  e0698a:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
  e0698f:	4c 8d bc 24 50 03 00 	lea    r15,[rsp+0x350]
  e06996:	00
  e06997:	4c 89 f7             	mov    rdi,r14
  e0699a:	48 89 de             	mov    rsi,rbx
  e0699d:	4c 89 fa             	mov    rdx,r15
  e069a0:	e8 63 41 00 00       	call   e0ab08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7b8e>
  e069a5:	4c 89 ff             	mov    rdi,r15
  e069a8:	e8 bd 35 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e069ad:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
  e069b4:	00
  e069b5:	e8 b0 35 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e069ba:	48 89 df             	mov    rdi,rbx
  e069bd:	e8 ce 74 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e069c2:	48 89 e7             	mov    rdi,rsp
  e069c5:	e8 c6 74 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e069ca:	e9 75 01 00 00       	jmp    e06b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3bca>
  e069cf:	48 89 e7             	mov    rdi,rsp
  e069d2:	e8 b9 74 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e069d7:	41 8a 86 e8 02 00 00 	mov    al,BYTE PTR [r14+0x2e8]
  e069de:	a8 01                	test   al,0x1
  e069e0:	0f 85 df 00 00 00    	jne    e06ac5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3b4b>
  e069e6:	4d 8d ae d8 13 00 00 	lea    r13,[r14+0x13d8]
  e069ed:	e8 54 42 9d 00       	call   17dac46 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a67>
  e069f2:	4c 89 ef             	mov    rdi,r13
  e069f5:	48 89 c6             	mov    rsi,rax
  e069f8:	e8 55 0f 9d 00       	call   17d7952 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3773>
  e069fd:	84 c0                	test   al,al
  e069ff:	0f 84 f8 00 00 00    	je     e06afd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3b83>
  e06a05:	49 8b be 50 03 00 00 	mov    rdi,QWORD PTR [r14+0x350]
  e06a0c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e06a0f:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e06a15:	49 8d 7f 68          	lea    rdi,[r15+0x68]
  e06a19:	48 89 c6             	mov    rsi,rax
  e06a1c:	e8 5f 76 9e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  e06a21:	49 89 e5             	mov    r13,rsp
  e06a24:	4c 89 ef             	mov    rdi,r13
  e06a27:	4c 89 fe             	mov    rsi,r15
  e06a2a:	e8 c1 8f 86 00       	call   166f9f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23b5c>
  e06a2f:	4d 8b be 50 03 00 00 	mov    r15,QWORD PTR [r14+0x350]
  e06a36:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]
  e06a3b:	48 89 ef             	mov    rdi,rbp
  e06a3e:	4c 89 e6             	mov    rsi,r12
  e06a41:	e8 38 54 86 00       	call   166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
  e06a46:	48 8d 35 e2 e6 57 ff 	lea    rsi,[rip+0xffffffffff57e6e2]        # 38512f <_ZTSSt12bad_any_cast@@Base-0xb099>
  e06a4d:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  e06a54:	00
  e06a55:	48 89 ea             	mov    rdx,rbp
  e06a58:	e8 fd 69 05 00       	call   e5d45a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24870>
  e06a5d:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
  e06a61:	4d 8b 6d 08          	mov    r13,QWORD PTR [r13+0x8]
  e06a65:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
  e06a6c:	00
  e06a6d:	4c 89 f6             	mov    rsi,r14
  e06a70:	48 89 da             	mov    rdx,rbx
  e06a73:	e8 36 41 00 00       	call   e0abae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7c34>
  e06a78:	4d 29 e5             	sub    r13,r12
  e06a7b:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e06a7e:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
  e06a85:	00
  e06a86:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
  e06a8d:	00
  e06a8e:	4c 89 ff             	mov    rdi,r15
  e06a91:	48 89 de             	mov    rsi,rbx
  e06a94:	4c 89 e2             	mov    rdx,r12
  e06a97:	4c 89 e9             	mov    rcx,r13
  e06a9a:	4d 89 f0             	mov    r8,r14
  e06a9d:	ff 50 48             	call   QWORD PTR [rax+0x48]
  e06aa0:	4c 89 f7             	mov    rdi,r14
  e06aa3:	e8 c2 34 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e06aa8:	48 89 df             	mov    rdi,rbx
  e06aab:	e8 06 e3 fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e06ab0:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  e06ab5:	e8 1e 55 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e06aba:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e06abe:	e8 9d 7c 9e 00       	call   17ee760 <free@plt>
  e06ac3:	eb 7f                	jmp    e06b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3bca>
  e06ac5:	4d 8b b6 40 03 00 00 	mov    r14,QWORD PTR [r14+0x340]
  e06acc:	4c 8d a4 24 40 02 00 	lea    r12,[rsp+0x240]
  e06ad3:	00
  e06ad4:	4c 89 e7             	mov    rdi,r12
  e06ad7:	4c 89 fe             	mov    rsi,r15
  e06ada:	e8 61 05 86 00       	call   1667040 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1ac>
  e06adf:	49 8b 06             	mov    rax,QWORD PTR [r14]
```
### AP `0x182d040` +0x28 -> `0xe06c12` score 13

```text
  e06c12:	55                   	push   rbp
  e06c13:	41 57                	push   r15
  e06c15:	41 56                	push   r14
  e06c17:	41 55                	push   r13
  e06c19:	41 54                	push   r12
  e06c1b:	53                   	push   rbx
  e06c1c:	48 81 ec b8 03 00 00 	sub    rsp,0x3b8
  e06c23:	49 89 d6             	mov    r14,rdx
  e06c26:	49 89 f7             	mov    r15,rsi
  e06c29:	48 89 fb             	mov    rbx,rdi
  e06c2c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e06c33:	00 00
  e06c35:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
  e06c3c:	00
  e06c3d:	e8 85 3c 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
  e06c42:	41 0f b6 4f 02       	movzx  ecx,BYTE PTR [r15+0x2]
  e06c47:	41 0f b6 57 01       	movzx  edx,BYTE PTR [r15+0x1]
  e06c4c:	4c 8d a4 24 80 03 00 	lea    r12,[rsp+0x380]
  e06c53:	00
  e06c54:	6a 08                	push   0x8
  e06c56:	41 58                	pop    r8
  e06c58:	4c 89 e7             	mov    rdi,r12
  e06c5b:	48 89 de             	mov    rsi,rbx
  e06c5e:	e8 b9 47 00 00       	call   e0b41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd84a2>
  e06c63:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e06c69:	74 2a                	je     e06c95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3d1b>
  e06c6b:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  e06c6f:	48 8d b4 24 80 03 00 	lea    rsi,[rsp+0x380]
  e06c76:	00
  e06c77:	e8 14 71 cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e06c7c:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]
  e06c83:	00
  e06c84:	8b b4 24 a8 03 00 00 	mov    esi,DWORD PTR [rsp+0x3a8]
  e06c8b:	e8 56 48 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e06c90:	e9 77 02 00 00       	jmp    e06f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3f92>
  e06c95:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
  e06c9c:	00
  e06c9d:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
  e06ca1:	31 f6                	xor    esi,esi
  e06ca3:	e8 3e 48 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e06ca8:	4d 8d 67 18          	lea    r12,[r15+0x18]
  e06cac:	4c 89 e7             	mov    rdi,r12
  e06caf:	e8 cb 67 05 00       	call   e5d47f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24895>
  e06cb4:	4c 89 ef             	mov    rdi,r13
  e06cb7:	4c 89 fe             	mov    rsi,r15
  e06cba:	e8 73 8e 86 00       	call   166fb32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23c9e>
  e06cbf:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e06cc3:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
  e06cc7:	48 89 e5             	mov    rbp,rsp
  e06cca:	48 89 ef             	mov    rdi,rbp
  e06ccd:	e8 33 3d 00 00       	call   e0aa05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a8b>
  e06cd2:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e06cd6:	e8 85 7a 9e 00       	call   17ee760 <free@plt>
  e06cdb:	48 8b bb f0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1f0]
  e06ce2:	48 89 ee             	mov    rsi,rbp
  e06ce5:	e8 2e 3d 00 00       	call   e0aa18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a9e>
  e06cea:	84 c0                	test   al,al
  e06cec:	0f 84 93 00 00 00    	je     e06d85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3e0b>
  e06cf2:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e06cf7:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  e06cfc:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  e06d00:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  e06d05:	0f 57 c0             	xorps  xmm0,xmm0
  e06d08:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  e06d0c:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  e06d12:	48 8d 73 10          	lea    rsi,[rbx+0x10]
  e06d16:	4c 8d bc 24 10 03 00 	lea    r15,[rsp+0x310]
  e06d1d:	00
  e06d1e:	4c 89 ff             	mov    rdi,r15
  e06d21:	4c 89 f2             	mov    rdx,r14
  e06d24:	e8 08 3d 00 00       	call   e0aa31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ab7>
  e06d29:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
  e06d30:	00
  e06d31:	4c 89 fe             	mov    rsi,r15
  e06d34:	e8 13 3d 00 00       	call   e0aa4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ad2>
  e06d39:	48 81 c3 d0 01 00 00 	add    rbx,0x1d0
  e06d40:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  e06d45:	4c 8d bc 24 50 03 00 	lea    r15,[rsp+0x350]
  e06d4c:	00
  e06d4d:	48 89 df             	mov    rdi,rbx
  e06d50:	4c 89 f6             	mov    rsi,r14
  e06d53:	4c 89 fa             	mov    rdx,r15
  e06d56:	e8 ad 3d 00 00       	call   e0ab08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7b8e>
  e06d5b:	4c 89 ff             	mov    rdi,r15
  e06d5e:	e8 07 32 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e06d63:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
  e06d6a:	00
  e06d6b:	e8 fa 31 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e06d70:	4c 89 f7             	mov    rdi,r14
  e06d73:	e8 18 71 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e06d78:	48 89 e7             	mov    rdi,rsp
  e06d7b:	e8 10 71 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e06d80:	e9 87 01 00 00       	jmp    e06f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3f92>
  e06d85:	48 89 e7             	mov    rdi,rsp
  e06d88:	e8 03 71 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e06d8d:	8a 83 e8 02 00 00    	mov    al,BYTE PTR [rbx+0x2e8]
  e06d93:	a8 01                	test   al,0x1
  e06d95:	0f 85 e2 00 00 00    	jne    e06e7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3f03>
  e06d9b:	4c 8d ab d8 13 00 00 	lea    r13,[rbx+0x13d8]
  e06da2:	e8 9f 3e 9d 00       	call   17dac46 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a67>
  e06da7:	4c 89 ef             	mov    rdi,r13
  e06daa:	48 89 c6             	mov    rsi,rax
  e06dad:	e8 a0 0b 9d 00       	call   17d7952 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3773>
  e06db2:	84 c0                	test   al,al
  e06db4:	0f 84 0b 01 00 00    	je     e06ec5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3f4b>
  e06dba:	48 8b bb 50 03 00 00 	mov    rdi,QWORD PTR [rbx+0x350]
  e06dc1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e06dc4:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e06dca:	49 8d 7f 68          	lea    rdi,[r15+0x68]
  e06dce:	48 89 c6             	mov    rsi,rax
  e06dd1:	e8 aa 72 9e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  e06dd6:	49 89 e5             	mov    r13,rsp
  e06dd9:	4c 89 ef             	mov    rdi,r13
  e06ddc:	4c 89 fe             	mov    rsi,r15
  e06ddf:	e8 4e 8d 86 00       	call   166fb32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23c9e>
  e06de4:	4c 8b bb 50 03 00 00 	mov    r15,QWORD PTR [rbx+0x350]
  e06deb:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]
  e06df0:	48 89 ef             	mov    rdi,rbp
  e06df3:	4c 89 e6             	mov    rsi,r12
  e06df6:	e8 83 50 86 00       	call   166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
  e06dfb:	48 8d 35 c4 2c 52 ff 	lea    rsi,[rip+0xffffffffff522cc4]        # 329ac6 <_ZTSSt12bad_any_cast@@Base-0x66702>
  e06e02:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  e06e09:	00
  e06e0a:	48 89 ea             	mov    rdx,rbp
  e06e0d:	e8 48 66 05 00       	call   e5d45a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24870>
  e06e12:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
  e06e16:	4d 8b 6d 08          	mov    r13,QWORD PTR [r13+0x8]
  e06e1a:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
  e06e21:	00
  e06e22:	48 89 de             	mov    rsi,rbx
  e06e25:	4c 89 f2             	mov    rdx,r14
  e06e28:	e8 81 3d 00 00       	call   e0abae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7c34>
  e06e2d:	4d 29 e5             	sub    r13,r12
  e06e30:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e06e33:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
  e06e3a:	00
  e06e3b:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
  e06e42:	00
  e06e43:	4c 89 ff             	mov    rdi,r15
  e06e46:	48 89 de             	mov    rsi,rbx
  e06e49:	4c 89 e2             	mov    rdx,r12
  e06e4c:	4c 89 e9             	mov    rcx,r13
  e06e4f:	4d 89 f0             	mov    r8,r14
  e06e52:	ff 50 48             	call   QWORD PTR [rax+0x48]
  e06e55:	4c 89 f7             	mov    rdi,r14
  e06e58:	e8 0d 31 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e06e5d:	48 89 df             	mov    rdi,rbx
  e06e60:	e8 51 df fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e06e65:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  e06e6a:	e8 69 51 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e06e6f:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e06e73:	e8 e8 78 9e 00       	call   17ee760 <free@plt>
  e06e78:	e9 8f 00 00 00       	jmp    e06f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3f92>
  e06e7d:	4c 8b a3 40 03 00 00 	mov    r12,QWORD PTR [rbx+0x340]
  e06e84:	4c 8d ac 24 40 02 00 	lea    r13,[rsp+0x240]
  e06e8b:	00
  e06e8c:	4c 89 ef             	mov    rdi,r13
  e06e8f:	4c 89 fe             	mov    rsi,r15
  e06e92:	e8 a9 01 86 00       	call   1667040 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1ac>
  e06e97:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
```
### AP `0x1869bd0` +0x28 -> `0x139ec1a` score 13

```text
 139ec1a:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
 139ec1e:	e9 6f fe ff ff       	jmp    139ea92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4016>
 139ec23:	cc                   	int3
 139ec24:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
 139ec28:	e9 9f fe ff ff       	jmp    139eacc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4050>
 139ec2d:	cc                   	int3
 139ec2e:	55                   	push   rbp
 139ec2f:	41 57                	push   r15
 139ec31:	41 56                	push   r14
 139ec33:	41 55                	push   r13
 139ec35:	41 54                	push   r12
 139ec37:	53                   	push   rbx
 139ec38:	48 81 ec d8 06 00 00 	sub    rsp,0x6d8
 139ec3f:	49 89 f4             	mov    r12,rsi
 139ec42:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 139ec49:	00 00
 139ec4b:	48 89 84 24 d0 06 00 	mov    QWORD PTR [rsp+0x6d0],rax
 139ec52:	00
 139ec53:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 139ec56:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
 139ec59:	80 7e 68 00          	cmp    BYTE PTR [rsi+0x68],0x0
 139ec5d:	0f 84 5c 02 00 00    	je     139eebf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4443>
 139ec63:	48 83 c3 08          	add    rbx,0x8
 139ec67:	48 89 df             	mov    rdi,rbx
 139ec6a:	e8 26 dd ff ff       	call   139c995 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1f19>
 139ec6f:	89 c5                	mov    ebp,eax
 139ec71:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
 139ec78:	00
 139ec79:	48 89 de             	mov    rsi,rbx
 139ec7c:	e8 c4 da ff ff       	call   139c745 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1cc9>
 139ec81:	31 c0                	xor    eax,eax
 139ec83:	48 8d 9c 24 d8 00 00 	lea    rbx,[rsp+0xd8]
 139ec8a:	00
 139ec8b:	88 43 f8             	mov    BYTE PTR [rbx-0x8],al
 139ec8e:	0f 57 c0             	xorps  xmm0,xmm0
 139ec91:	0f 29 43 d8          	movaps XMMWORD PTR [rbx-0x28],xmm0
 139ec95:	88 43 e8             	mov    BYTE PTR [rbx-0x18],al
 139ec98:	83 63 38 00          	and    DWORD PTR [rbx+0x38],0x0
 139ec9c:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 139ec9f:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 139eca3:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 139eca7:	66 83 63 58 00       	and    WORD PTR [rbx+0x58],0x0
 139ecac:	0f 11 43 60          	movups XMMWORD PTR [rbx+0x60],xmm0
 139ecb0:	0f 11 43 6a          	movups XMMWORD PTR [rbx+0x6a],xmm0
 139ecb4:	c7 43 7c 02 00 00 00 	mov    DWORD PTR [rbx+0x7c],0x2
 139ecbb:	83 a3 d0 00 00 00 00 	and    DWORD PTR [rbx+0xd0],0x0
 139ecc2:	88 83 f0 00 00 00    	mov    BYTE PTR [rbx+0xf0],al
 139ecc8:	4c 8d bc 24 d0 01 00 	lea    r15,[rsp+0x1d0]
 139eccf:	00
 139ecd0:	41 0f 11 47 88       	movups XMMWORD PTR [r15-0x78],xmm0
 139ecd5:	41 0f 11 47 98       	movups XMMWORD PTR [r15-0x68],xmm0
 139ecda:	41 0f 11 47 a8       	movups XMMWORD PTR [r15-0x58],xmm0
 139ecdf:	41 0f 11 47 b8       	movups XMMWORD PTR [r15-0x48],xmm0
 139ece4:	49 83 67 c8 00       	and    QWORD PTR [r15-0x38],0x0
 139ece9:	4c 89 ff             	mov    rdi,r15
 139ecec:	4c 89 e6             	mov    rsi,r12
 139ecef:	e8 30 71 ff ff       	call   1395e24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1db3a8>
 139ecf4:	41 0f 10 86 08 01 00 	movups xmm0,XMMWORD PTR [r14+0x108]
 139ecfb:	00
 139ecfc:	0f 11 84 24 38 02 00 	movups XMMWORD PTR [rsp+0x238],xmm0
 139ed03:	00
 139ed04:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
 139ed0b:	00
 139ed0c:	e8 9d e6 fc ff       	call   136d3ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b2932>
 139ed11:	31 c9                	xor    ecx,ecx
 139ed13:	84 d2                	test   dl,dl
 139ed15:	48 0f 44 c1          	cmove  rax,rcx
 139ed19:	48 89 84 24 48 02 00 	mov    QWORD PTR [rsp+0x248],rax
 139ed20:	00
 139ed21:	88 8c 24 50 02 00 00 	mov    BYTE PTR [rsp+0x250],cl
 139ed28:	88 8c 24 58 02 00 00 	mov    BYTE PTR [rsp+0x258],cl
 139ed2f:	49 8b 46 50          	mov    rax,QWORD PTR [r14+0x50]
 139ed33:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
 139ed3a:	00
 139ed3b:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
 139ed3f:	48 89 84 24 68 02 00 	mov    QWORD PTR [rsp+0x268],rax
 139ed46:	00
 139ed47:	48 85 c0             	test   rax,rax
 139ed4a:	74 05                	je     139ed51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e42d5>
 139ed4c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 139ed51:	40 88 6c 24 4f       	mov    BYTE PTR [rsp+0x4f],bpl
 139ed56:	31 c0                	xor    eax,eax
 139ed58:	88 84 24 70 02 00 00 	mov    BYTE PTR [rsp+0x270],al
 139ed5f:	88 84 24 78 02 00 00 	mov    BYTE PTR [rsp+0x278],al
 139ed66:	48 b8 01 00 00 00 00 	movabs rax,0x3f80000000000001
 139ed6d:	00 80 3f
 139ed70:	48 89 84 24 80 02 00 	mov    QWORD PTR [rsp+0x280],rax
 139ed77:	00
 139ed78:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
 139ed7c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 139ed7f:	ff 50 30             	call   QWORD PTR [rax+0x30]
 139ed82:	4c 8d bc 24 98 02 00 	lea    r15,[rsp+0x298]
 139ed89:	00
 139ed8a:	41 89 47 f0          	mov    DWORD PTR [r15-0x10],eax
 139ed8e:	41 c7 47 f4 02 00 00 	mov    DWORD PTR [r15-0xc],0x2
 139ed95:	00
 139ed96:	66 41 c7 47 f8 00 01 	mov    WORD PTR [r15-0x8],0x100
 139ed9d:	31 ed                	xor    ebp,ebp
 139ed9f:	41 88 af 80 00 00 00 	mov    BYTE PTR [r15+0x80],bpl
 139eda6:	4c 8d a4 24 20 03 00 	lea    r12,[rsp+0x320]
 139edad:	00
 139edae:	41 88 2c 24          	mov    BYTE PTR [r12],bpl
 139edb2:	41 88 6c 24 68       	mov    BYTE PTR [r12+0x68],bpl
 139edb7:	4c 8d ac 24 90 03 00 	lea    r13,[rsp+0x390]
 139edbe:	00
 139edbf:	0f 57 c0             	xorps  xmm0,xmm0
 139edc2:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
 139edc6:	41 0f 11 44 24 88    	movups XMMWORD PTR [r12-0x78],xmm0
 139edcc:	41 0f 11 44 24 98    	movups XMMWORD PTR [r12-0x68],xmm0
 139edd2:	41 0f 11 44 24 a8    	movups XMMWORD PTR [r12-0x58],xmm0
 139edd8:	41 0f 11 44 24 b8    	movups XMMWORD PTR [r12-0x48],xmm0
 139edde:	41 0f 11 44 24 c1    	movups XMMWORD PTR [r12-0x3f],xmm0
 139ede4:	4c 89 ef             	mov    rdi,r13
 139ede7:	e8 0a ac 43 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 139edec:	66 41 83 65 10 00    	and    WORD PTR [r13+0x10],0x0
 139edf2:	41 88 6d 12          	mov    BYTE PTR [r13+0x12],bpl
 139edf6:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
 139edfd:	00
 139edfe:	e8 27 69 7c ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 139ee03:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
 139ee0a:	00
 139ee0b:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
 139ee12:	00
 139ee13:	e8 bc d3 ff ff       	call   139c1d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1758>
 139ee18:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
 139ee1e:	48 c7 44 24 78 01 00 	mov    QWORD PTR [rsp+0x78],0x1
 139ee25:	00 00
 139ee27:	31 c0                	xor    eax,eax
 139ee29:	88 84 24 80 00 00 00 	mov    BYTE PTR [rsp+0x80],al
 139ee30:	88 84 24 90 00 00 00 	mov    BYTE PTR [rsp+0x90],al
 139ee37:	0f 57 c0             	xorps  xmm0,xmm0
 139ee3a:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
 139ee3f:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
 139ee42:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 139ee47:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
 139ee4e:	00
 139ee4f:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 139ee54:	0f 10 84 24 98 00 00 	movups xmm0,XMMWORD PTR [rsp+0x98]
 139ee5b:	00
 139ee5c:	0f 11 44 24 28       	movups XMMWORD PTR [rsp+0x28],xmm0
 139ee61:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
 139ee68:	00
 139ee69:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 139ee6e:	0f 10 44 24 70       	movups xmm0,XMMWORD PTR [rsp+0x70]
 139ee73:	0f 10 8c 24 80 00 00 	movups xmm1,XMMWORD PTR [rsp+0x80]
 139ee7a:	00
 139ee7b:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
 139ee80:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 139ee84:	0f b6 54 24 4f       	movzx  edx,BYTE PTR [rsp+0x4f]
 139ee89:	48 8d b4 24 c0 03 00 	lea    rsi,[rsp+0x3c0]
 139ee90:	00
 139ee91:	4c 89 f7             	mov    rdi,r14
 139ee94:	e8 51 4f ff ff       	call   1393dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d936e>
 139ee99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 139ee9e:	e8 77 56 e8 ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
 139eea3:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
 139eeaa:	00
 139eeab:	e8 8e fd fe ff       	call   138ec3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d41c2>
 139eeb0:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
 139eeb7:	00
```
### AP `0x1869bd8` +0x28 -> `0x139ec24` score 13

```text
 139ec24:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
 139ec28:	e9 9f fe ff ff       	jmp    139eacc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4050>
 139ec2d:	cc                   	int3
 139ec2e:	55                   	push   rbp
 139ec2f:	41 57                	push   r15
 139ec31:	41 56                	push   r14
 139ec33:	41 55                	push   r13
 139ec35:	41 54                	push   r12
 139ec37:	53                   	push   rbx
 139ec38:	48 81 ec d8 06 00 00 	sub    rsp,0x6d8
 139ec3f:	49 89 f4             	mov    r12,rsi
 139ec42:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 139ec49:	00 00
 139ec4b:	48 89 84 24 d0 06 00 	mov    QWORD PTR [rsp+0x6d0],rax
 139ec52:	00
 139ec53:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 139ec56:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
 139ec59:	80 7e 68 00          	cmp    BYTE PTR [rsi+0x68],0x0
 139ec5d:	0f 84 5c 02 00 00    	je     139eebf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4443>
 139ec63:	48 83 c3 08          	add    rbx,0x8
 139ec67:	48 89 df             	mov    rdi,rbx
 139ec6a:	e8 26 dd ff ff       	call   139c995 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1f19>
 139ec6f:	89 c5                	mov    ebp,eax
 139ec71:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
 139ec78:	00
 139ec79:	48 89 de             	mov    rsi,rbx
 139ec7c:	e8 c4 da ff ff       	call   139c745 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1cc9>
 139ec81:	31 c0                	xor    eax,eax
 139ec83:	48 8d 9c 24 d8 00 00 	lea    rbx,[rsp+0xd8]
 139ec8a:	00
 139ec8b:	88 43 f8             	mov    BYTE PTR [rbx-0x8],al
 139ec8e:	0f 57 c0             	xorps  xmm0,xmm0
 139ec91:	0f 29 43 d8          	movaps XMMWORD PTR [rbx-0x28],xmm0
 139ec95:	88 43 e8             	mov    BYTE PTR [rbx-0x18],al
 139ec98:	83 63 38 00          	and    DWORD PTR [rbx+0x38],0x0
 139ec9c:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 139ec9f:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 139eca3:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 139eca7:	66 83 63 58 00       	and    WORD PTR [rbx+0x58],0x0
 139ecac:	0f 11 43 60          	movups XMMWORD PTR [rbx+0x60],xmm0
 139ecb0:	0f 11 43 6a          	movups XMMWORD PTR [rbx+0x6a],xmm0
 139ecb4:	c7 43 7c 02 00 00 00 	mov    DWORD PTR [rbx+0x7c],0x2
 139ecbb:	83 a3 d0 00 00 00 00 	and    DWORD PTR [rbx+0xd0],0x0
 139ecc2:	88 83 f0 00 00 00    	mov    BYTE PTR [rbx+0xf0],al
 139ecc8:	4c 8d bc 24 d0 01 00 	lea    r15,[rsp+0x1d0]
 139eccf:	00
 139ecd0:	41 0f 11 47 88       	movups XMMWORD PTR [r15-0x78],xmm0
 139ecd5:	41 0f 11 47 98       	movups XMMWORD PTR [r15-0x68],xmm0
 139ecda:	41 0f 11 47 a8       	movups XMMWORD PTR [r15-0x58],xmm0
 139ecdf:	41 0f 11 47 b8       	movups XMMWORD PTR [r15-0x48],xmm0
 139ece4:	49 83 67 c8 00       	and    QWORD PTR [r15-0x38],0x0
 139ece9:	4c 89 ff             	mov    rdi,r15
 139ecec:	4c 89 e6             	mov    rsi,r12
 139ecef:	e8 30 71 ff ff       	call   1395e24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1db3a8>
 139ecf4:	41 0f 10 86 08 01 00 	movups xmm0,XMMWORD PTR [r14+0x108]
 139ecfb:	00
 139ecfc:	0f 11 84 24 38 02 00 	movups XMMWORD PTR [rsp+0x238],xmm0
 139ed03:	00
 139ed04:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
 139ed0b:	00
 139ed0c:	e8 9d e6 fc ff       	call   136d3ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b2932>
 139ed11:	31 c9                	xor    ecx,ecx
 139ed13:	84 d2                	test   dl,dl
 139ed15:	48 0f 44 c1          	cmove  rax,rcx
 139ed19:	48 89 84 24 48 02 00 	mov    QWORD PTR [rsp+0x248],rax
 139ed20:	00
 139ed21:	88 8c 24 50 02 00 00 	mov    BYTE PTR [rsp+0x250],cl
 139ed28:	88 8c 24 58 02 00 00 	mov    BYTE PTR [rsp+0x258],cl
 139ed2f:	49 8b 46 50          	mov    rax,QWORD PTR [r14+0x50]
 139ed33:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
 139ed3a:	00
 139ed3b:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
 139ed3f:	48 89 84 24 68 02 00 	mov    QWORD PTR [rsp+0x268],rax
 139ed46:	00
 139ed47:	48 85 c0             	test   rax,rax
 139ed4a:	74 05                	je     139ed51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e42d5>
 139ed4c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 139ed51:	40 88 6c 24 4f       	mov    BYTE PTR [rsp+0x4f],bpl
 139ed56:	31 c0                	xor    eax,eax
 139ed58:	88 84 24 70 02 00 00 	mov    BYTE PTR [rsp+0x270],al
 139ed5f:	88 84 24 78 02 00 00 	mov    BYTE PTR [rsp+0x278],al
 139ed66:	48 b8 01 00 00 00 00 	movabs rax,0x3f80000000000001
 139ed6d:	00 80 3f
 139ed70:	48 89 84 24 80 02 00 	mov    QWORD PTR [rsp+0x280],rax
 139ed77:	00
 139ed78:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
 139ed7c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 139ed7f:	ff 50 30             	call   QWORD PTR [rax+0x30]
 139ed82:	4c 8d bc 24 98 02 00 	lea    r15,[rsp+0x298]
 139ed89:	00
 139ed8a:	41 89 47 f0          	mov    DWORD PTR [r15-0x10],eax
 139ed8e:	41 c7 47 f4 02 00 00 	mov    DWORD PTR [r15-0xc],0x2
 139ed95:	00
 139ed96:	66 41 c7 47 f8 00 01 	mov    WORD PTR [r15-0x8],0x100
 139ed9d:	31 ed                	xor    ebp,ebp
 139ed9f:	41 88 af 80 00 00 00 	mov    BYTE PTR [r15+0x80],bpl
 139eda6:	4c 8d a4 24 20 03 00 	lea    r12,[rsp+0x320]
 139edad:	00
 139edae:	41 88 2c 24          	mov    BYTE PTR [r12],bpl
 139edb2:	41 88 6c 24 68       	mov    BYTE PTR [r12+0x68],bpl
 139edb7:	4c 8d ac 24 90 03 00 	lea    r13,[rsp+0x390]
 139edbe:	00
 139edbf:	0f 57 c0             	xorps  xmm0,xmm0
 139edc2:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
 139edc6:	41 0f 11 44 24 88    	movups XMMWORD PTR [r12-0x78],xmm0
 139edcc:	41 0f 11 44 24 98    	movups XMMWORD PTR [r12-0x68],xmm0
 139edd2:	41 0f 11 44 24 a8    	movups XMMWORD PTR [r12-0x58],xmm0
 139edd8:	41 0f 11 44 24 b8    	movups XMMWORD PTR [r12-0x48],xmm0
 139edde:	41 0f 11 44 24 c1    	movups XMMWORD PTR [r12-0x3f],xmm0
 139ede4:	4c 89 ef             	mov    rdi,r13
 139ede7:	e8 0a ac 43 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 139edec:	66 41 83 65 10 00    	and    WORD PTR [r13+0x10],0x0
 139edf2:	41 88 6d 12          	mov    BYTE PTR [r13+0x12],bpl
 139edf6:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
 139edfd:	00
 139edfe:	e8 27 69 7c ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 139ee03:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
 139ee0a:	00
 139ee0b:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
 139ee12:	00
 139ee13:	e8 bc d3 ff ff       	call   139c1d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1758>
 139ee18:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
 139ee1e:	48 c7 44 24 78 01 00 	mov    QWORD PTR [rsp+0x78],0x1
 139ee25:	00 00
 139ee27:	31 c0                	xor    eax,eax
 139ee29:	88 84 24 80 00 00 00 	mov    BYTE PTR [rsp+0x80],al
 139ee30:	88 84 24 90 00 00 00 	mov    BYTE PTR [rsp+0x90],al
 139ee37:	0f 57 c0             	xorps  xmm0,xmm0
 139ee3a:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
 139ee3f:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
 139ee42:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 139ee47:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
 139ee4e:	00
 139ee4f:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 139ee54:	0f 10 84 24 98 00 00 	movups xmm0,XMMWORD PTR [rsp+0x98]
 139ee5b:	00
 139ee5c:	0f 11 44 24 28       	movups XMMWORD PTR [rsp+0x28],xmm0
 139ee61:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
 139ee68:	00
 139ee69:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 139ee6e:	0f 10 44 24 70       	movups xmm0,XMMWORD PTR [rsp+0x70]
 139ee73:	0f 10 8c 24 80 00 00 	movups xmm1,XMMWORD PTR [rsp+0x80]
 139ee7a:	00
 139ee7b:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
 139ee80:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 139ee84:	0f b6 54 24 4f       	movzx  edx,BYTE PTR [rsp+0x4f]
 139ee89:	48 8d b4 24 c0 03 00 	lea    rsi,[rsp+0x3c0]
 139ee90:	00
 139ee91:	4c 89 f7             	mov    rdi,r14
 139ee94:	e8 51 4f ff ff       	call   1393dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d936e>
 139ee99:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 139ee9e:	e8 77 56 e8 ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
 139eea3:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
 139eeaa:	00
 139eeab:	e8 8e fd fe ff       	call   138ec3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d41c2>
 139eeb0:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
 139eeb7:	00
 139eeb8:	e8 b7 fe fe ff       	call   138ed74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d42f8>
 139eebd:	eb 0b                	jmp    139eeca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e444e>
 139eebf:	4c 89 f7             	mov    rdi,r14
```
### AP `0x18717b0` +0x28 -> `0x1442590` score 13

```text
 1442590:	53                   	push   rbx
 1442591:	48 89 fb             	mov    rbx,rdi
 1442594:	48 8d 05 3d f2 42 00 	lea    rax,[rip+0x42f23d]        # 18717d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dec0>
 144259b:	48 89 07             	mov    QWORD PTR [rdi],rax
 144259e:	48 83 c7 28          	add    rdi,0x28
 14425a2:	e8 81 78 63 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 14425a7:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
 14425ab:	e8 1a 7d 63 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 14425b0:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 14425b4:	e8 77 ff ff ff       	call   1442530 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287ab4>
 14425b9:	48 83 c3 10          	add    rbx,0x10
 14425bd:	48 89 df             	mov    rdi,rbx
 14425c0:	5b                   	pop    rbx
 14425c1:	e9 62 78 63 ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
 14425c6:	53                   	push   rbx
 14425c7:	48 89 fb             	mov    rbx,rdi
 14425ca:	e8 c1 ff ff ff       	call   1442590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287b14>
 14425cf:	48 89 df             	mov    rdi,rbx
 14425d2:	5b                   	pop    rbx
 14425d3:	e9 48 b9 3a 00       	jmp    17edf20 <_ZdlPv@plt>
 14425d8:	41 57                	push   r15
 14425da:	41 56                	push   r14
 14425dc:	41 54                	push   r12
 14425de:	53                   	push   rbx
 14425df:	50                   	push   rax
 14425e0:	48 89 f3             	mov    rbx,rsi
 14425e3:	49 89 fe             	mov    r14,rdi
 14425e6:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
 14425e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14425ec:	89 d6                	mov    esi,edx
 14425ee:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 14425f4:	49 89 c7             	mov    r15,rax
 14425f7:	49 89 d4             	mov    r12,rdx
 14425fa:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 14425fd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1442600:	4c 89 f7             	mov    rdi,r14
 1442603:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 1442609:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 144260c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 144260f:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
 1442613:	4c 89 fe             	mov    rsi,r15
 1442616:	4c 89 e2             	mov    rdx,r12
 1442619:	48 83 c4 08          	add    rsp,0x8
 144261d:	5b                   	pop    rbx
 144261e:	41 5c                	pop    r12
 1442620:	41 5e                	pop    r14
 1442622:	41 5f                	pop    r15
 1442624:	ff e0                	jmp    rax
 1442626:	41 57                	push   r15
 1442628:	41 56                	push   r14
 144262a:	41 54                	push   r12
 144262c:	53                   	push   rbx
 144262d:	48 81 ec 68 03 00 00 	sub    rsp,0x368
 1442634:	49 89 f6             	mov    r14,rsi
 1442637:	48 89 fb             	mov    rbx,rdi
 144263a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1442641:	00 00
 1442643:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
 144264a:	00
 144264b:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
 144264e:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 1442653:	4c 89 e7             	mov    rdi,r12
 1442656:	48 89 d6             	mov    rsi,rdx
 1442659:	e8 ce a2 8a ff       	call   cec92c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2398cc>
 144265e:	49 8b 07             	mov    rax,QWORD PTR [r15]
 1442661:	48 8b 8c 24 b0 03 00 	mov    rcx,QWORD PTR [rsp+0x3b0]
 1442668:	00
 1442669:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 144266e:	0f 28 84 24 90 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x390]
 1442675:	00
 1442676:	0f 28 8c 24 a0 03 00 	movaps xmm1,XMMWORD PTR [rsp+0x3a0]
 144267d:	00
 144267e:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
 1442683:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 1442687:	4c 89 ff             	mov    rdi,r15
 144268a:	4c 89 f6             	mov    rsi,r14
 144268d:	4c 89 e2             	mov    rdx,r12
 1442690:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1442693:	4c 89 e7             	mov    rdi,r12
 1442696:	e8 a9 3b 89 ff       	call   cd6244 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2231e4>
 144269b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14426a2:	00 00
 14426a4:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
 14426ab:	00
 14426ac:	75 12                	jne    14426c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287c44>
 14426ae:	48 89 d8             	mov    rax,rbx
 14426b1:	48 81 c4 68 03 00 00 	add    rsp,0x368
 14426b8:	5b                   	pop    rbx
 14426b9:	41 5c                	pop    r12
 14426bb:	41 5e                	pop    r14
 14426bd:	41 5f                	pop    r15
 14426bf:	c3                   	ret
```
### AP `0x18717b8` +0x28 -> `0x14425c6` score 13

```text
 14425c6:	53                   	push   rbx
 14425c7:	48 89 fb             	mov    rbx,rdi
 14425ca:	e8 c1 ff ff ff       	call   1442590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287b14>
 14425cf:	48 89 df             	mov    rdi,rbx
 14425d2:	5b                   	pop    rbx
 14425d3:	e9 48 b9 3a 00       	jmp    17edf20 <_ZdlPv@plt>
 14425d8:	41 57                	push   r15
 14425da:	41 56                	push   r14
 14425dc:	41 54                	push   r12
 14425de:	53                   	push   rbx
 14425df:	50                   	push   rax
 14425e0:	48 89 f3             	mov    rbx,rsi
 14425e3:	49 89 fe             	mov    r14,rdi
 14425e6:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
 14425e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14425ec:	89 d6                	mov    esi,edx
 14425ee:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 14425f4:	49 89 c7             	mov    r15,rax
 14425f7:	49 89 d4             	mov    r12,rdx
 14425fa:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 14425fd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1442600:	4c 89 f7             	mov    rdi,r14
 1442603:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 1442609:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 144260c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 144260f:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
 1442613:	4c 89 fe             	mov    rsi,r15
 1442616:	4c 89 e2             	mov    rdx,r12
 1442619:	48 83 c4 08          	add    rsp,0x8
 144261d:	5b                   	pop    rbx
 144261e:	41 5c                	pop    r12
 1442620:	41 5e                	pop    r14
 1442622:	41 5f                	pop    r15
 1442624:	ff e0                	jmp    rax
 1442626:	41 57                	push   r15
 1442628:	41 56                	push   r14
 144262a:	41 54                	push   r12
 144262c:	53                   	push   rbx
 144262d:	48 81 ec 68 03 00 00 	sub    rsp,0x368
 1442634:	49 89 f6             	mov    r14,rsi
 1442637:	48 89 fb             	mov    rbx,rdi
 144263a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1442641:	00 00
 1442643:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
 144264a:	00
 144264b:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
 144264e:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 1442653:	4c 89 e7             	mov    rdi,r12
 1442656:	48 89 d6             	mov    rsi,rdx
 1442659:	e8 ce a2 8a ff       	call   cec92c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2398cc>
 144265e:	49 8b 07             	mov    rax,QWORD PTR [r15]
 1442661:	48 8b 8c 24 b0 03 00 	mov    rcx,QWORD PTR [rsp+0x3b0]
 1442668:	00
 1442669:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 144266e:	0f 28 84 24 90 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x390]
 1442675:	00
 1442676:	0f 28 8c 24 a0 03 00 	movaps xmm1,XMMWORD PTR [rsp+0x3a0]
 144267d:	00
 144267e:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
 1442683:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 1442687:	4c 89 ff             	mov    rdi,r15
 144268a:	4c 89 f6             	mov    rsi,r14
 144268d:	4c 89 e2             	mov    rdx,r12
 1442690:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1442693:	4c 89 e7             	mov    rdi,r12
 1442696:	e8 a9 3b 89 ff       	call   cd6244 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2231e4>
 144269b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14426a2:	00 00
 14426a4:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
 14426ab:	00
 14426ac:	75 12                	jne    14426c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287c44>
 14426ae:	48 89 d8             	mov    rax,rbx
 14426b1:	48 81 c4 68 03 00 00 	add    rsp,0x368
 14426b8:	5b                   	pop    rbx
 14426b9:	41 5c                	pop    r12
 14426bb:	41 5e                	pop    r14
 14426bd:	41 5f                	pop    r15
 14426bf:	c3                   	ret
```
### AP `0x1871818` +0x28 -> `0x1442586` score 13

```text
 1442586:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 144258a:	8a 00                	mov    al,BYTE PTR [rax]
 144258c:	24 01                	and    al,0x1
 144258e:	c3                   	ret
 144258f:	cc                   	int3
 1442590:	53                   	push   rbx
 1442591:	48 89 fb             	mov    rbx,rdi
 1442594:	48 8d 05 3d f2 42 00 	lea    rax,[rip+0x42f23d]        # 18717d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dec0>
 144259b:	48 89 07             	mov    QWORD PTR [rdi],rax
 144259e:	48 83 c7 28          	add    rdi,0x28
 14425a2:	e8 81 78 63 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 14425a7:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
 14425ab:	e8 1a 7d 63 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 14425b0:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 14425b4:	e8 77 ff ff ff       	call   1442530 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287ab4>
 14425b9:	48 83 c3 10          	add    rbx,0x10
 14425bd:	48 89 df             	mov    rdi,rbx
 14425c0:	5b                   	pop    rbx
 14425c1:	e9 62 78 63 ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
 14425c6:	53                   	push   rbx
 14425c7:	48 89 fb             	mov    rbx,rdi
 14425ca:	e8 c1 ff ff ff       	call   1442590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287b14>
 14425cf:	48 89 df             	mov    rdi,rbx
 14425d2:	5b                   	pop    rbx
 14425d3:	e9 48 b9 3a 00       	jmp    17edf20 <_ZdlPv@plt>
 14425d8:	41 57                	push   r15
 14425da:	41 56                	push   r14
 14425dc:	41 54                	push   r12
 14425de:	53                   	push   rbx
 14425df:	50                   	push   rax
 14425e0:	48 89 f3             	mov    rbx,rsi
 14425e3:	49 89 fe             	mov    r14,rdi
 14425e6:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
 14425e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14425ec:	89 d6                	mov    esi,edx
 14425ee:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 14425f4:	49 89 c7             	mov    r15,rax
 14425f7:	49 89 d4             	mov    r12,rdx
 14425fa:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 14425fd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1442600:	4c 89 f7             	mov    rdi,r14
 1442603:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 1442609:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 144260c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 144260f:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
 1442613:	4c 89 fe             	mov    rsi,r15
 1442616:	4c 89 e2             	mov    rdx,r12
 1442619:	48 83 c4 08          	add    rsp,0x8
 144261d:	5b                   	pop    rbx
 144261e:	41 5c                	pop    r12
 1442620:	41 5e                	pop    r14
 1442622:	41 5f                	pop    r15
 1442624:	ff e0                	jmp    rax
 1442626:	41 57                	push   r15
 1442628:	41 56                	push   r14
 144262a:	41 54                	push   r12
 144262c:	53                   	push   rbx
 144262d:	48 81 ec 68 03 00 00 	sub    rsp,0x368
 1442634:	49 89 f6             	mov    r14,rsi
 1442637:	48 89 fb             	mov    rbx,rdi
 144263a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1442641:	00 00
 1442643:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
 144264a:	00
 144264b:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
 144264e:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 1442653:	4c 89 e7             	mov    rdi,r12
 1442656:	48 89 d6             	mov    rsi,rdx
 1442659:	e8 ce a2 8a ff       	call   cec92c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2398cc>
 144265e:	49 8b 07             	mov    rax,QWORD PTR [r15]
 1442661:	48 8b 8c 24 b0 03 00 	mov    rcx,QWORD PTR [rsp+0x3b0]
 1442668:	00
 1442669:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 144266e:	0f 28 84 24 90 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x390]
 1442675:	00
 1442676:	0f 28 8c 24 a0 03 00 	movaps xmm1,XMMWORD PTR [rsp+0x3a0]
 144267d:	00
 144267e:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
 1442683:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 1442687:	4c 89 ff             	mov    rdi,r15
 144268a:	4c 89 f6             	mov    rsi,r14
 144268d:	4c 89 e2             	mov    rdx,r12
 1442690:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1442693:	4c 89 e7             	mov    rdi,r12
 1442696:	e8 a9 3b 89 ff       	call   cd6244 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2231e4>
 144269b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14426a2:	00 00
 14426a4:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
 14426ab:	00
 14426ac:	75 12                	jne    14426c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287c44>
 14426ae:	48 89 d8             	mov    rax,rbx
 14426b1:	48 81 c4 68 03 00 00 	add    rsp,0x368
 14426b8:	5b                   	pop    rbx
 14426b9:	41 5c                	pop    r12
 14426bb:	41 5e                	pop    r14
 14426bd:	41 5f                	pop    r15
 14426bf:	c3                   	ret
```
### AP `0x187f2c8` +0x28 -> `0x154ae7c` score 13

```text
 154ae7c:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
 154ae80:	e9 01 1e 87 ff       	jmp    dbcc86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89d0c>
 154ae85:	cc                   	int3
 154ae86:	48 8d 05 2b 44 33 00 	lea    rax,[rip+0x33442b]        # 187f2b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b9a0>
 154ae8d:	48 89 07             	mov    QWORD PTR [rdi],rax
 154ae90:	48 83 c7 10          	add    rdi,0x10
 154ae94:	e9 d1 f0 52 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
 154ae99:	cc                   	int3
 154ae9a:	53                   	push   rbx
 154ae9b:	48 89 fb             	mov    rbx,rdi
 154ae9e:	e8 e3 ff ff ff       	call   154ae86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39040a>
 154aea3:	48 89 df             	mov    rdi,rbx
 154aea6:	5b                   	pop    rbx
 154aea7:	e9 74 30 2a 00       	jmp    17edf20 <_ZdlPv@plt>
 154aeac:	41 56                	push   r14
 154aeae:	53                   	push   rbx
 154aeaf:	48 83 ec 28          	sub    rsp,0x28
 154aeb3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 154aeba:	00 00
 154aebc:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 154aec1:	4c 8d 77 10          	lea    r14,[rdi+0x10]
 154aec5:	6a 40                	push   0x40
 154aec7:	5f                   	pop    rdi
 154aec8:	e8 33 30 2a 00       	call   17edf00 <_Znwm@plt>
 154aecd:	48 89 c3             	mov    rbx,rax
 154aed0:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 154aed4:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
 154aed9:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 154aede:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
 154aee5:	00 00
 154aee7:	48 8d 05 ca 43 33 00 	lea    rax,[rip+0x3343ca]        # 187f2b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b9a0>
 154aeee:	48 89 03             	mov    QWORD PTR [rbx],rax
 154aef1:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
 154aef5:	4c 89 f6             	mov    rsi,r14
 154aef8:	e8 93 f3 52 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 154aefd:	48 89 e7             	mov    rdi,rsp
 154af00:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 154af04:	e8 c1 f3 52 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 154af09:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 154af10:	00 00
 154af12:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 154af17:	75 2e                	jne    154af47 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3904cb>
 154af19:	48 89 d8             	mov    rax,rbx
 154af1c:	48 83 c4 28          	add    rsp,0x28
 154af20:	5b                   	pop    rbx
 154af21:	41 5e                	pop    r14
 154af23:	c3                   	ret
```
### AP `0x1890100` +0x28 -> `0x116675e` score 13

```text
 116675e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
 1166762:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1166765:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
 116676c:	ff e0                	jmp    rax
 116676e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
 1166772:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1166775:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
 116677c:	ff e0                	jmp    rax
 116677e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
 1166782:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1166785:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
 116678c:	ff e0                	jmp    rax
 116678e:	53                   	push   rbx
 116678f:	48 89 fb             	mov    rbx,rdi
 1166792:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
 1166796:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1166799:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 116679f:	48 89 d8             	mov    rax,rbx
 11667a2:	5b                   	pop    rbx
 11667a3:	c3                   	ret
```
### AP `0x1890108` +0x28 -> `0x116676e` score 13

```text
 116676e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
 1166772:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1166775:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
 116677c:	ff e0                	jmp    rax
 116677e:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
 1166782:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1166785:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
 116678c:	ff e0                	jmp    rax
 116678e:	53                   	push   rbx
 116678f:	48 89 fb             	mov    rbx,rdi
 1166792:	48 8b 76 40          	mov    rsi,QWORD PTR [rsi+0x40]
 1166796:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1166799:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 116679f:	48 89 d8             	mov    rax,rbx
 11667a2:	5b                   	pop    rbx
 11667a3:	c3                   	ret
```
### AP `0x18aefc8` +0x28 -> `0xa84d76` score 13

```text
  a84d76:	48 8d 3d 0b cf e6 00 	lea    rdi,[rip+0xe6cf0b]        # 18f1c88 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39098>
  a84d7d:	e9 45 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84d82:	50                   	push   rax
  a84d83:	e8 12 ba 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84d88:	e8 54 ba 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84d8d:	e8 96 ba 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84d92:	58                   	pop    rax
  a84d93:	e9 d7 ba 02 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a84d98:	48 8d 3d 89 d3 e6 00 	lea    rdi,[rip+0xe6d389]        # 18f2128 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39538>
  a84d9f:	e9 23 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84da4:	48 8d 3d 85 dc e6 00 	lea    rdi,[rip+0xe6dc85]        # 18f2a30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39e40>
  a84dab:	e9 17 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84db0:	48 8d 3d 61 e1 e6 00 	lea    rdi,[rip+0xe6e161]        # 18f2f18 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a328>
  a84db7:	e9 0b 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dbc:	48 8d 3d c5 e3 e6 00 	lea    rdi,[rip+0xe6e3c5]        # 18f3188 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a598>
  a84dc3:	e9 ff 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dc8:	48 8d 3d 49 e6 e6 00 	lea    rdi,[rip+0xe6e649]        # 18f3418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a828>
  a84dcf:	e9 f3 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dd4:	48 8d 3d ed e8 e6 00 	lea    rdi,[rip+0xe6e8ed]        # 18f36c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3aad8>
  a84ddb:	e9 e7 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84de0:	48 8d 3d 71 eb e6 00 	lea    rdi,[rip+0xe6eb71]        # 18f3958 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3ad68>
  a84de7:	e9 db 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dec:	48 8d 3d 3d ee e6 00 	lea    rdi,[rip+0xe6ee3d]        # 18f3c30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b040>
  a84df3:	e9 cf 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84df8:	48 8d 3d d9 f2 e6 00 	lea    rdi,[rip+0xe6f2d9]        # 18f40d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b4e8>
  a84dff:	e9 c3 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84e04:	48 8d 3d d9 fe 60 00 	lea    rdi,[rip+0x60fed9]        # 1094ce4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c0fa>
  a84e0b:	48 8d 35 1e 2d f6 00 	lea    rsi,[rip+0xf62d1e]        # 19e7b30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2120>
  a84e12:	48 8d 15 e7 f1 d6 00 	lea    rdx,[rip+0xd6f1e7]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84e19:	e9 42 90 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84e1e:	48 8d 3d 53 ff e6 00 	lea    rdi,[rip+0xe6ff53]        # 18f4d78 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3c188>
  a84e25:	e9 9d 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84e2a:	41 56                	push   r14
  a84e2c:	53                   	push   rbx
  a84e2d:	48 83 ec 18          	sub    rsp,0x18
  a84e31:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84e38:	00 00
  a84e3a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  a84e3f:	e8 56 b9 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84e44:	e8 98 b9 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84e49:	e8 da b9 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84e4e:	e8 1c ba 02 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a84e53:	48 8d 05 a8 23 95 ff 	lea    rax,[rip+0xffffffffff9523a8]        # 3d7202 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1de7>
  a84e5a:	48 89 e3             	mov    rbx,rsp
  a84e5d:	48 89 03             	mov    QWORD PTR [rbx],rax
  a84e60:	c7 43 08 f6 0c 31 90 	mov    DWORD PTR [rbx+0x8],0x90310cf6
  a84e67:	4c 8d 35 ca 2c f6 00 	lea    r14,[rip+0xf62cca]        # 19e7b38 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2128>
  a84e6e:	4c 89 f7             	mov    rdi,r14
  a84e71:	48 89 de             	mov    rsi,rbx
  a84e74:	e8 31 cf d3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a84e79:	48 8b 3d c0 cb e2 00 	mov    rdi,QWORD PTR [rip+0xe2cbc0]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84e80:	48 8d 15 79 f1 d6 00 	lea    rdx,[rip+0xd6f179]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84e87:	4c 89 f6             	mov    rsi,r14
  a84e8a:	e8 d1 8f d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84e8f:	48 8d 05 8d 23 95 ff 	lea    rax,[rip+0xffffffffff95238d]        # 3d7223 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1e08>
  a84e96:	48 89 03             	mov    QWORD PTR [rbx],rax
  a84e99:	c7 43 08 fa f5 3c b4 	mov    DWORD PTR [rbx+0x8],0xb43cf5fa
  a84ea0:	48 8d 3d a9 2c f6 00 	lea    rdi,[rip+0xf62ca9]        # 19e7b50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2140>
  a84ea7:	48 89 e6             	mov    rsi,rsp
  a84eaa:	e8 fb ce d3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a84eaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84eb6:	00 00
  a84eb8:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  a84ebd:	75 21                	jne    a84ee0 <JNI_OnUnload@@Base+0xc7ad>
  a84ebf:	48 8b 3d 7a cb e2 00 	mov    rdi,QWORD PTR [rip+0xe2cb7a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84ec6:	48 8d 35 83 2c f6 00 	lea    rsi,[rip+0xf62c83]        # 19e7b50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2140>
  a84ecd:	48 8d 15 2c f1 d6 00 	lea    rdx,[rip+0xd6f12c]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84ed4:	48 83 c4 18          	add    rsp,0x18
  a84ed8:	5b                   	pop    rbx
  a84ed9:	41 5e                	pop    r14
  a84edb:	e9 80 8f d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84ee0:	e8 cb ab d6 00       	call   17efab0 <__stack_chk_fail@plt>
  a84ee5:	48 8d 3d 04 04 e7 00 	lea    rdi,[rip+0xe70404]        # 18f52f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3c700>
  a84eec:	e9 d6 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84ef1:	48 8d 3d e8 0d e7 00 	lea    rdi,[rip+0xe70de8]        # 18f5ce0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3d0f0>
  a84ef8:	e9 ca 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84efd:	48 8d 3d 34 14 e7 00 	lea    rdi,[rip+0xe71434]        # 18f6338 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3d748>
  a84f04:	e9 be 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84f09:	48 8d 3d c0 22 e7 00 	lea    rdi,[rip+0xe722c0]        # 18f71d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e5e0>
  a84f10:	e9 b2 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84f15:	41 57                	push   r15
  a84f17:	41 56                	push   r14
  a84f19:	41 54                	push   r12
  a84f1b:	53                   	push   rbx
  a84f1c:	48 83 ec 28          	sub    rsp,0x28
  a84f20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84f27:	00 00
  a84f29:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  a84f2e:	48 8d 35 d6 6a 8a ff 	lea    rsi,[rip+0xffffffffff8a6ad6]        # 32ba0b <_ZTSSt12bad_any_cast@@Base-0x647bd>
  a84f35:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  a84f3a:	48 89 df             	mov    rdi,rbx
  a84f3d:	e8 3c 4b ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84f42:	4c 8d 35 2f 2c f6 00 	lea    r14,[rip+0xf62c2f]        # 19e7b78 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2168>
  a84f49:	4c 89 f7             	mov    rdi,r14
  a84f4c:	48 89 de             	mov    rsi,rbx
  a84f4f:	e8 6e 4a c4 00       	call   16c99c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7db2e>
  a84f54:	48 89 df             	mov    rdi,rbx
  a84f57:	e8 34 8f d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  a84f5c:	48 8d 1d cb 03 c4 00 	lea    rbx,[rip+0xc403cb]        # 16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  a84f63:	4c 8d 3d 96 f0 d6 00 	lea    r15,[rip+0xd6f096]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84f6a:	48 89 df             	mov    rdi,rbx
  a84f6d:	4c 89 f6             	mov    rsi,r14
  a84f70:	4c 89 fa             	mov    rdx,r15
  a84f73:	e8 e8 8e d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84f78:	48 8d 35 58 d5 8a ff 	lea    rsi,[rip+0xffffffffff8ad558]        # 3324d7 <_ZTSSt12bad_any_cast@@Base-0x5dcf1>
  a84f7f:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  a84f84:	4c 89 f7             	mov    rdi,r14
  a84f87:	e8 f2 4a ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84f8c:	4c 8d 25 3d 2c f6 00 	lea    r12,[rip+0xf62c3d]        # 19e7bd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x21c0>
  a84f93:	4c 89 e7             	mov    rdi,r12
  a84f96:	4c 89 f6             	mov    rsi,r14
  a84f99:	e8 24 4a c4 00       	call   16c99c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7db2e>
  a84f9e:	4c 89 f7             	mov    rdi,r14
  a84fa1:	e8 ea 8e d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  a84fa6:	48 89 df             	mov    rdi,rbx
  a84fa9:	4c 89 e6             	mov    rsi,r12
  a84fac:	4c 89 fa             	mov    rdx,r15
  a84faf:	e8 ac 8e d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84fb4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84fbb:	00 00
  a84fbd:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  a84fc2:	75 0c                	jne    a84fd0 <JNI_OnUnload@@Base+0xc89d>
  a84fc4:	48 83 c4 28          	add    rsp,0x28
  a84fc8:	5b                   	pop    rbx
  a84fc9:	41 5c                	pop    r12
  a84fcb:	41 5e                	pop    r14
  a84fcd:	41 5f                	pop    r15
  a84fcf:	c3                   	ret
```
### AP `0x18b0ce0` +0x28 -> `0xa84d06` score 13

```text
  a84d06:	50                   	push   rax
  a84d07:	e8 8e ba 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84d0c:	e8 d0 ba 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84d11:	e8 12 bb 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84d16:	58                   	pop    rax
  a84d17:	e9 53 bb 02 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a84d1c:	50                   	push   rax
  a84d1d:	e8 78 ba 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84d22:	e8 ba ba 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84d27:	e8 fc ba 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84d2c:	58                   	pop    rax
  a84d2d:	e9 3d bb 02 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a84d32:	50                   	push   rax
  a84d33:	e8 62 ba 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84d38:	e8 a4 ba 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84d3d:	e8 e6 ba 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84d42:	58                   	pop    rax
  a84d43:	e9 27 bb 02 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a84d48:	53                   	push   rbx
  a84d49:	48 8d 1d a0 2d f6 00 	lea    rbx,[rip+0xf62da0]        # 19e7af0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x20e0>
  a84d50:	48 8d 35 f9 c2 8e ff 	lea    rsi,[rip+0xffffffffff8ec2f9]        # 371050 <_ZTSSt12bad_any_cast@@Base-0x1f178>
  a84d57:	48 89 df             	mov    rdi,rbx
  a84d5a:	e8 1f 4d ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84d5f:	48 8b 3d da cc e2 00 	mov    rdi,QWORD PTR [rip+0xe2ccda]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84d66:	48 8d 15 93 f2 d6 00 	lea    rdx,[rip+0xd6f293]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84d6d:	48 89 de             	mov    rsi,rbx
  a84d70:	5b                   	pop    rbx
  a84d71:	e9 ea 90 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84d76:	48 8d 3d 0b cf e6 00 	lea    rdi,[rip+0xe6cf0b]        # 18f1c88 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39098>
  a84d7d:	e9 45 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84d82:	50                   	push   rax
  a84d83:	e8 12 ba 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84d88:	e8 54 ba 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84d8d:	e8 96 ba 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84d92:	58                   	pop    rax
  a84d93:	e9 d7 ba 02 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a84d98:	48 8d 3d 89 d3 e6 00 	lea    rdi,[rip+0xe6d389]        # 18f2128 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39538>
  a84d9f:	e9 23 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84da4:	48 8d 3d 85 dc e6 00 	lea    rdi,[rip+0xe6dc85]        # 18f2a30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39e40>
  a84dab:	e9 17 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84db0:	48 8d 3d 61 e1 e6 00 	lea    rdi,[rip+0xe6e161]        # 18f2f18 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a328>
  a84db7:	e9 0b 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dbc:	48 8d 3d c5 e3 e6 00 	lea    rdi,[rip+0xe6e3c5]        # 18f3188 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a598>
  a84dc3:	e9 ff 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dc8:	48 8d 3d 49 e6 e6 00 	lea    rdi,[rip+0xe6e649]        # 18f3418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a828>
  a84dcf:	e9 f3 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dd4:	48 8d 3d ed e8 e6 00 	lea    rdi,[rip+0xe6e8ed]        # 18f36c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3aad8>
  a84ddb:	e9 e7 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84de0:	48 8d 3d 71 eb e6 00 	lea    rdi,[rip+0xe6eb71]        # 18f3958 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3ad68>
  a84de7:	e9 db 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dec:	48 8d 3d 3d ee e6 00 	lea    rdi,[rip+0xe6ee3d]        # 18f3c30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b040>
  a84df3:	e9 cf 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84df8:	48 8d 3d d9 f2 e6 00 	lea    rdi,[rip+0xe6f2d9]        # 18f40d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b4e8>
  a84dff:	e9 c3 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84e04:	48 8d 3d d9 fe 60 00 	lea    rdi,[rip+0x60fed9]        # 1094ce4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c0fa>
  a84e0b:	48 8d 35 1e 2d f6 00 	lea    rsi,[rip+0xf62d1e]        # 19e7b30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2120>
  a84e12:	48 8d 15 e7 f1 d6 00 	lea    rdx,[rip+0xd6f1e7]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84e19:	e9 42 90 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84e1e:	48 8d 3d 53 ff e6 00 	lea    rdi,[rip+0xe6ff53]        # 18f4d78 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3c188>
  a84e25:	e9 9d 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84e2a:	41 56                	push   r14
  a84e2c:	53                   	push   rbx
  a84e2d:	48 83 ec 18          	sub    rsp,0x18
  a84e31:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84e38:	00 00
  a84e3a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  a84e3f:	e8 56 b9 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84e44:	e8 98 b9 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84e49:	e8 da b9 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84e4e:	e8 1c ba 02 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a84e53:	48 8d 05 a8 23 95 ff 	lea    rax,[rip+0xffffffffff9523a8]        # 3d7202 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1de7>
  a84e5a:	48 89 e3             	mov    rbx,rsp
  a84e5d:	48 89 03             	mov    QWORD PTR [rbx],rax
  a84e60:	c7 43 08 f6 0c 31 90 	mov    DWORD PTR [rbx+0x8],0x90310cf6
  a84e67:	4c 8d 35 ca 2c f6 00 	lea    r14,[rip+0xf62cca]        # 19e7b38 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2128>
  a84e6e:	4c 89 f7             	mov    rdi,r14
  a84e71:	48 89 de             	mov    rsi,rbx
  a84e74:	e8 31 cf d3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a84e79:	48 8b 3d c0 cb e2 00 	mov    rdi,QWORD PTR [rip+0xe2cbc0]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84e80:	48 8d 15 79 f1 d6 00 	lea    rdx,[rip+0xd6f179]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84e87:	4c 89 f6             	mov    rsi,r14
  a84e8a:	e8 d1 8f d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84e8f:	48 8d 05 8d 23 95 ff 	lea    rax,[rip+0xffffffffff95238d]        # 3d7223 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1e08>
  a84e96:	48 89 03             	mov    QWORD PTR [rbx],rax
  a84e99:	c7 43 08 fa f5 3c b4 	mov    DWORD PTR [rbx+0x8],0xb43cf5fa
  a84ea0:	48 8d 3d a9 2c f6 00 	lea    rdi,[rip+0xf62ca9]        # 19e7b50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2140>
  a84ea7:	48 89 e6             	mov    rsi,rsp
  a84eaa:	e8 fb ce d3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a84eaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84eb6:	00 00
  a84eb8:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  a84ebd:	75 21                	jne    a84ee0 <JNI_OnUnload@@Base+0xc7ad>
  a84ebf:	48 8b 3d 7a cb e2 00 	mov    rdi,QWORD PTR [rip+0xe2cb7a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84ec6:	48 8d 35 83 2c f6 00 	lea    rsi,[rip+0xf62c83]        # 19e7b50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2140>
  a84ecd:	48 8d 15 2c f1 d6 00 	lea    rdx,[rip+0xd6f12c]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84ed4:	48 83 c4 18          	add    rsp,0x18
  a84ed8:	5b                   	pop    rbx
  a84ed9:	41 5e                	pop    r14
  a84edb:	e9 80 8f d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84ee0:	e8 cb ab d6 00       	call   17efab0 <__stack_chk_fail@plt>
  a84ee5:	48 8d 3d 04 04 e7 00 	lea    rdi,[rip+0xe70404]        # 18f52f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3c700>
  a84eec:	e9 d6 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84ef1:	48 8d 3d e8 0d e7 00 	lea    rdi,[rip+0xe70de8]        # 18f5ce0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3d0f0>
  a84ef8:	e9 ca 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84efd:	48 8d 3d 34 14 e7 00 	lea    rdi,[rip+0xe71434]        # 18f6338 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3d748>
  a84f04:	e9 be 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84f09:	48 8d 3d c0 22 e7 00 	lea    rdi,[rip+0xe722c0]        # 18f71d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e5e0>
  a84f10:	e9 b2 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84f15:	41 57                	push   r15
  a84f17:	41 56                	push   r14
  a84f19:	41 54                	push   r12
  a84f1b:	53                   	push   rbx
  a84f1c:	48 83 ec 28          	sub    rsp,0x28
  a84f20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84f27:	00 00
  a84f29:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  a84f2e:	48 8d 35 d6 6a 8a ff 	lea    rsi,[rip+0xffffffffff8a6ad6]        # 32ba0b <_ZTSSt12bad_any_cast@@Base-0x647bd>
  a84f35:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  a84f3a:	48 89 df             	mov    rdi,rbx
  a84f3d:	e8 3c 4b ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84f42:	4c 8d 35 2f 2c f6 00 	lea    r14,[rip+0xf62c2f]        # 19e7b78 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2168>
  a84f49:	4c 89 f7             	mov    rdi,r14
  a84f4c:	48 89 de             	mov    rsi,rbx
  a84f4f:	e8 6e 4a c4 00       	call   16c99c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7db2e>
  a84f54:	48 89 df             	mov    rdi,rbx
  a84f57:	e8 34 8f d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  a84f5c:	48 8d 1d cb 03 c4 00 	lea    rbx,[rip+0xc403cb]        # 16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  a84f63:	4c 8d 3d 96 f0 d6 00 	lea    r15,[rip+0xd6f096]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84f6a:	48 89 df             	mov    rdi,rbx
  a84f6d:	4c 89 f6             	mov    rsi,r14
  a84f70:	4c 89 fa             	mov    rdx,r15
  a84f73:	e8 e8 8e d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84f78:	48 8d 35 58 d5 8a ff 	lea    rsi,[rip+0xffffffffff8ad558]        # 3324d7 <_ZTSSt12bad_any_cast@@Base-0x5dcf1>
  a84f7f:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  a84f84:	4c 89 f7             	mov    rdi,r14
  a84f87:	e8 f2 4a ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84f8c:	4c 8d 25 3d 2c f6 00 	lea    r12,[rip+0xf62c3d]        # 19e7bd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x21c0>
  a84f93:	4c 89 e7             	mov    rdi,r12
  a84f96:	4c 89 f6             	mov    rsi,r14
  a84f99:	e8 24 4a c4 00       	call   16c99c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7db2e>
  a84f9e:	4c 89 f7             	mov    rdi,r14
  a84fa1:	e8 ea 8e d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  a84fa6:	48 89 df             	mov    rdi,rbx
  a84fa9:	4c 89 e6             	mov    rsi,r12
  a84fac:	4c 89 fa             	mov    rdx,r15
  a84faf:	e8 ac 8e d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84fb4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84fbb:	00 00
  a84fbd:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  a84fc2:	75 0c                	jne    a84fd0 <JNI_OnUnload@@Base+0xc89d>
  a84fc4:	48 83 c4 28          	add    rsp,0x28
  a84fc8:	5b                   	pop    rbx
  a84fc9:	41 5c                	pop    r12
  a84fcb:	41 5e                	pop    r14
  a84fcd:	41 5f                	pop    r15
  a84fcf:	c3                   	ret
```
### AP `0x18b0ce8` +0x28 -> `0xa84d1c` score 13

```text
  a84d1c:	50                   	push   rax
  a84d1d:	e8 78 ba 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84d22:	e8 ba ba 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84d27:	e8 fc ba 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84d2c:	58                   	pop    rax
  a84d2d:	e9 3d bb 02 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a84d32:	50                   	push   rax
  a84d33:	e8 62 ba 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84d38:	e8 a4 ba 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84d3d:	e8 e6 ba 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84d42:	58                   	pop    rax
  a84d43:	e9 27 bb 02 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a84d48:	53                   	push   rbx
  a84d49:	48 8d 1d a0 2d f6 00 	lea    rbx,[rip+0xf62da0]        # 19e7af0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x20e0>
  a84d50:	48 8d 35 f9 c2 8e ff 	lea    rsi,[rip+0xffffffffff8ec2f9]        # 371050 <_ZTSSt12bad_any_cast@@Base-0x1f178>
  a84d57:	48 89 df             	mov    rdi,rbx
  a84d5a:	e8 1f 4d ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84d5f:	48 8b 3d da cc e2 00 	mov    rdi,QWORD PTR [rip+0xe2ccda]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84d66:	48 8d 15 93 f2 d6 00 	lea    rdx,[rip+0xd6f293]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84d6d:	48 89 de             	mov    rsi,rbx
  a84d70:	5b                   	pop    rbx
  a84d71:	e9 ea 90 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84d76:	48 8d 3d 0b cf e6 00 	lea    rdi,[rip+0xe6cf0b]        # 18f1c88 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39098>
  a84d7d:	e9 45 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84d82:	50                   	push   rax
  a84d83:	e8 12 ba 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84d88:	e8 54 ba 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84d8d:	e8 96 ba 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84d92:	58                   	pop    rax
  a84d93:	e9 d7 ba 02 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a84d98:	48 8d 3d 89 d3 e6 00 	lea    rdi,[rip+0xe6d389]        # 18f2128 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39538>
  a84d9f:	e9 23 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84da4:	48 8d 3d 85 dc e6 00 	lea    rdi,[rip+0xe6dc85]        # 18f2a30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39e40>
  a84dab:	e9 17 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84db0:	48 8d 3d 61 e1 e6 00 	lea    rdi,[rip+0xe6e161]        # 18f2f18 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a328>
  a84db7:	e9 0b 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dbc:	48 8d 3d c5 e3 e6 00 	lea    rdi,[rip+0xe6e3c5]        # 18f3188 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a598>
  a84dc3:	e9 ff 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dc8:	48 8d 3d 49 e6 e6 00 	lea    rdi,[rip+0xe6e649]        # 18f3418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a828>
  a84dcf:	e9 f3 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dd4:	48 8d 3d ed e8 e6 00 	lea    rdi,[rip+0xe6e8ed]        # 18f36c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3aad8>
  a84ddb:	e9 e7 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84de0:	48 8d 3d 71 eb e6 00 	lea    rdi,[rip+0xe6eb71]        # 18f3958 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3ad68>
  a84de7:	e9 db 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dec:	48 8d 3d 3d ee e6 00 	lea    rdi,[rip+0xe6ee3d]        # 18f3c30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b040>
  a84df3:	e9 cf 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84df8:	48 8d 3d d9 f2 e6 00 	lea    rdi,[rip+0xe6f2d9]        # 18f40d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b4e8>
  a84dff:	e9 c3 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84e04:	48 8d 3d d9 fe 60 00 	lea    rdi,[rip+0x60fed9]        # 1094ce4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c0fa>
  a84e0b:	48 8d 35 1e 2d f6 00 	lea    rsi,[rip+0xf62d1e]        # 19e7b30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2120>
  a84e12:	48 8d 15 e7 f1 d6 00 	lea    rdx,[rip+0xd6f1e7]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84e19:	e9 42 90 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84e1e:	48 8d 3d 53 ff e6 00 	lea    rdi,[rip+0xe6ff53]        # 18f4d78 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3c188>
  a84e25:	e9 9d 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84e2a:	41 56                	push   r14
  a84e2c:	53                   	push   rbx
  a84e2d:	48 83 ec 18          	sub    rsp,0x18
  a84e31:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84e38:	00 00
  a84e3a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  a84e3f:	e8 56 b9 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84e44:	e8 98 b9 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84e49:	e8 da b9 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84e4e:	e8 1c ba 02 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a84e53:	48 8d 05 a8 23 95 ff 	lea    rax,[rip+0xffffffffff9523a8]        # 3d7202 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1de7>
  a84e5a:	48 89 e3             	mov    rbx,rsp
  a84e5d:	48 89 03             	mov    QWORD PTR [rbx],rax
  a84e60:	c7 43 08 f6 0c 31 90 	mov    DWORD PTR [rbx+0x8],0x90310cf6
  a84e67:	4c 8d 35 ca 2c f6 00 	lea    r14,[rip+0xf62cca]        # 19e7b38 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2128>
  a84e6e:	4c 89 f7             	mov    rdi,r14
  a84e71:	48 89 de             	mov    rsi,rbx
  a84e74:	e8 31 cf d3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a84e79:	48 8b 3d c0 cb e2 00 	mov    rdi,QWORD PTR [rip+0xe2cbc0]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84e80:	48 8d 15 79 f1 d6 00 	lea    rdx,[rip+0xd6f179]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84e87:	4c 89 f6             	mov    rsi,r14
  a84e8a:	e8 d1 8f d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84e8f:	48 8d 05 8d 23 95 ff 	lea    rax,[rip+0xffffffffff95238d]        # 3d7223 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1e08>
  a84e96:	48 89 03             	mov    QWORD PTR [rbx],rax
  a84e99:	c7 43 08 fa f5 3c b4 	mov    DWORD PTR [rbx+0x8],0xb43cf5fa
  a84ea0:	48 8d 3d a9 2c f6 00 	lea    rdi,[rip+0xf62ca9]        # 19e7b50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2140>
  a84ea7:	48 89 e6             	mov    rsi,rsp
  a84eaa:	e8 fb ce d3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a84eaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84eb6:	00 00
  a84eb8:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  a84ebd:	75 21                	jne    a84ee0 <JNI_OnUnload@@Base+0xc7ad>
  a84ebf:	48 8b 3d 7a cb e2 00 	mov    rdi,QWORD PTR [rip+0xe2cb7a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84ec6:	48 8d 35 83 2c f6 00 	lea    rsi,[rip+0xf62c83]        # 19e7b50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2140>
  a84ecd:	48 8d 15 2c f1 d6 00 	lea    rdx,[rip+0xd6f12c]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84ed4:	48 83 c4 18          	add    rsp,0x18
  a84ed8:	5b                   	pop    rbx
  a84ed9:	41 5e                	pop    r14
  a84edb:	e9 80 8f d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84ee0:	e8 cb ab d6 00       	call   17efab0 <__stack_chk_fail@plt>
  a84ee5:	48 8d 3d 04 04 e7 00 	lea    rdi,[rip+0xe70404]        # 18f52f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3c700>
  a84eec:	e9 d6 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84ef1:	48 8d 3d e8 0d e7 00 	lea    rdi,[rip+0xe70de8]        # 18f5ce0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3d0f0>
  a84ef8:	e9 ca 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84efd:	48 8d 3d 34 14 e7 00 	lea    rdi,[rip+0xe71434]        # 18f6338 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3d748>
  a84f04:	e9 be 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84f09:	48 8d 3d c0 22 e7 00 	lea    rdi,[rip+0xe722c0]        # 18f71d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e5e0>
  a84f10:	e9 b2 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84f15:	41 57                	push   r15
  a84f17:	41 56                	push   r14
  a84f19:	41 54                	push   r12
  a84f1b:	53                   	push   rbx
  a84f1c:	48 83 ec 28          	sub    rsp,0x28
  a84f20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84f27:	00 00
  a84f29:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  a84f2e:	48 8d 35 d6 6a 8a ff 	lea    rsi,[rip+0xffffffffff8a6ad6]        # 32ba0b <_ZTSSt12bad_any_cast@@Base-0x647bd>
  a84f35:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  a84f3a:	48 89 df             	mov    rdi,rbx
  a84f3d:	e8 3c 4b ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84f42:	4c 8d 35 2f 2c f6 00 	lea    r14,[rip+0xf62c2f]        # 19e7b78 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2168>
  a84f49:	4c 89 f7             	mov    rdi,r14
  a84f4c:	48 89 de             	mov    rsi,rbx
  a84f4f:	e8 6e 4a c4 00       	call   16c99c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7db2e>
  a84f54:	48 89 df             	mov    rdi,rbx
  a84f57:	e8 34 8f d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  a84f5c:	48 8d 1d cb 03 c4 00 	lea    rbx,[rip+0xc403cb]        # 16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  a84f63:	4c 8d 3d 96 f0 d6 00 	lea    r15,[rip+0xd6f096]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84f6a:	48 89 df             	mov    rdi,rbx
  a84f6d:	4c 89 f6             	mov    rsi,r14
  a84f70:	4c 89 fa             	mov    rdx,r15
  a84f73:	e8 e8 8e d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84f78:	48 8d 35 58 d5 8a ff 	lea    rsi,[rip+0xffffffffff8ad558]        # 3324d7 <_ZTSSt12bad_any_cast@@Base-0x5dcf1>
  a84f7f:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  a84f84:	4c 89 f7             	mov    rdi,r14
  a84f87:	e8 f2 4a ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84f8c:	4c 8d 25 3d 2c f6 00 	lea    r12,[rip+0xf62c3d]        # 19e7bd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x21c0>
  a84f93:	4c 89 e7             	mov    rdi,r12
  a84f96:	4c 89 f6             	mov    rsi,r14
  a84f99:	e8 24 4a c4 00       	call   16c99c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7db2e>
  a84f9e:	4c 89 f7             	mov    rdi,r14
  a84fa1:	e8 ea 8e d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  a84fa6:	48 89 df             	mov    rdi,rbx
  a84fa9:	4c 89 e6             	mov    rsi,r12
  a84fac:	4c 89 fa             	mov    rdx,r15
  a84faf:	e8 ac 8e d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84fb4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84fbb:	00 00
  a84fbd:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  a84fc2:	75 0c                	jne    a84fd0 <JNI_OnUnload@@Base+0xc89d>
  a84fc4:	48 83 c4 28          	add    rsp,0x28
  a84fc8:	5b                   	pop    rbx
  a84fc9:	41 5c                	pop    r12
  a84fcb:	41 5e                	pop    r14
  a84fcd:	41 5f                	pop    r15
  a84fcf:	c3                   	ret
```
### AP `0x18b0cf0` +0x28 -> `0xa84d32` score 13

```text
  a84d32:	50                   	push   rax
  a84d33:	e8 62 ba 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84d38:	e8 a4 ba 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84d3d:	e8 e6 ba 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84d42:	58                   	pop    rax
  a84d43:	e9 27 bb 02 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a84d48:	53                   	push   rbx
  a84d49:	48 8d 1d a0 2d f6 00 	lea    rbx,[rip+0xf62da0]        # 19e7af0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x20e0>
  a84d50:	48 8d 35 f9 c2 8e ff 	lea    rsi,[rip+0xffffffffff8ec2f9]        # 371050 <_ZTSSt12bad_any_cast@@Base-0x1f178>
  a84d57:	48 89 df             	mov    rdi,rbx
  a84d5a:	e8 1f 4d ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84d5f:	48 8b 3d da cc e2 00 	mov    rdi,QWORD PTR [rip+0xe2ccda]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84d66:	48 8d 15 93 f2 d6 00 	lea    rdx,[rip+0xd6f293]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84d6d:	48 89 de             	mov    rsi,rbx
  a84d70:	5b                   	pop    rbx
  a84d71:	e9 ea 90 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84d76:	48 8d 3d 0b cf e6 00 	lea    rdi,[rip+0xe6cf0b]        # 18f1c88 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39098>
  a84d7d:	e9 45 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84d82:	50                   	push   rax
  a84d83:	e8 12 ba 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84d88:	e8 54 ba 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84d8d:	e8 96 ba 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84d92:	58                   	pop    rax
  a84d93:	e9 d7 ba 02 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a84d98:	48 8d 3d 89 d3 e6 00 	lea    rdi,[rip+0xe6d389]        # 18f2128 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39538>
  a84d9f:	e9 23 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84da4:	48 8d 3d 85 dc e6 00 	lea    rdi,[rip+0xe6dc85]        # 18f2a30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39e40>
  a84dab:	e9 17 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84db0:	48 8d 3d 61 e1 e6 00 	lea    rdi,[rip+0xe6e161]        # 18f2f18 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a328>
  a84db7:	e9 0b 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dbc:	48 8d 3d c5 e3 e6 00 	lea    rdi,[rip+0xe6e3c5]        # 18f3188 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a598>
  a84dc3:	e9 ff 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dc8:	48 8d 3d 49 e6 e6 00 	lea    rdi,[rip+0xe6e649]        # 18f3418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a828>
  a84dcf:	e9 f3 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dd4:	48 8d 3d ed e8 e6 00 	lea    rdi,[rip+0xe6e8ed]        # 18f36c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3aad8>
  a84ddb:	e9 e7 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84de0:	48 8d 3d 71 eb e6 00 	lea    rdi,[rip+0xe6eb71]        # 18f3958 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3ad68>
  a84de7:	e9 db 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dec:	48 8d 3d 3d ee e6 00 	lea    rdi,[rip+0xe6ee3d]        # 18f3c30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b040>
  a84df3:	e9 cf 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84df8:	48 8d 3d d9 f2 e6 00 	lea    rdi,[rip+0xe6f2d9]        # 18f40d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b4e8>
  a84dff:	e9 c3 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84e04:	48 8d 3d d9 fe 60 00 	lea    rdi,[rip+0x60fed9]        # 1094ce4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c0fa>
  a84e0b:	48 8d 35 1e 2d f6 00 	lea    rsi,[rip+0xf62d1e]        # 19e7b30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2120>
  a84e12:	48 8d 15 e7 f1 d6 00 	lea    rdx,[rip+0xd6f1e7]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84e19:	e9 42 90 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84e1e:	48 8d 3d 53 ff e6 00 	lea    rdi,[rip+0xe6ff53]        # 18f4d78 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3c188>
  a84e25:	e9 9d 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84e2a:	41 56                	push   r14
  a84e2c:	53                   	push   rbx
  a84e2d:	48 83 ec 18          	sub    rsp,0x18
  a84e31:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84e38:	00 00
  a84e3a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  a84e3f:	e8 56 b9 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84e44:	e8 98 b9 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84e49:	e8 da b9 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84e4e:	e8 1c ba 02 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a84e53:	48 8d 05 a8 23 95 ff 	lea    rax,[rip+0xffffffffff9523a8]        # 3d7202 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1de7>
  a84e5a:	48 89 e3             	mov    rbx,rsp
  a84e5d:	48 89 03             	mov    QWORD PTR [rbx],rax
  a84e60:	c7 43 08 f6 0c 31 90 	mov    DWORD PTR [rbx+0x8],0x90310cf6
  a84e67:	4c 8d 35 ca 2c f6 00 	lea    r14,[rip+0xf62cca]        # 19e7b38 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2128>
  a84e6e:	4c 89 f7             	mov    rdi,r14
  a84e71:	48 89 de             	mov    rsi,rbx
  a84e74:	e8 31 cf d3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a84e79:	48 8b 3d c0 cb e2 00 	mov    rdi,QWORD PTR [rip+0xe2cbc0]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84e80:	48 8d 15 79 f1 d6 00 	lea    rdx,[rip+0xd6f179]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84e87:	4c 89 f6             	mov    rsi,r14
  a84e8a:	e8 d1 8f d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84e8f:	48 8d 05 8d 23 95 ff 	lea    rax,[rip+0xffffffffff95238d]        # 3d7223 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1e08>
  a84e96:	48 89 03             	mov    QWORD PTR [rbx],rax
  a84e99:	c7 43 08 fa f5 3c b4 	mov    DWORD PTR [rbx+0x8],0xb43cf5fa
  a84ea0:	48 8d 3d a9 2c f6 00 	lea    rdi,[rip+0xf62ca9]        # 19e7b50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2140>
  a84ea7:	48 89 e6             	mov    rsi,rsp
  a84eaa:	e8 fb ce d3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a84eaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84eb6:	00 00
  a84eb8:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  a84ebd:	75 21                	jne    a84ee0 <JNI_OnUnload@@Base+0xc7ad>
  a84ebf:	48 8b 3d 7a cb e2 00 	mov    rdi,QWORD PTR [rip+0xe2cb7a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84ec6:	48 8d 35 83 2c f6 00 	lea    rsi,[rip+0xf62c83]        # 19e7b50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2140>
  a84ecd:	48 8d 15 2c f1 d6 00 	lea    rdx,[rip+0xd6f12c]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84ed4:	48 83 c4 18          	add    rsp,0x18
  a84ed8:	5b                   	pop    rbx
  a84ed9:	41 5e                	pop    r14
  a84edb:	e9 80 8f d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84ee0:	e8 cb ab d6 00       	call   17efab0 <__stack_chk_fail@plt>
  a84ee5:	48 8d 3d 04 04 e7 00 	lea    rdi,[rip+0xe70404]        # 18f52f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3c700>
  a84eec:	e9 d6 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84ef1:	48 8d 3d e8 0d e7 00 	lea    rdi,[rip+0xe70de8]        # 18f5ce0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3d0f0>
  a84ef8:	e9 ca 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84efd:	48 8d 3d 34 14 e7 00 	lea    rdi,[rip+0xe71434]        # 18f6338 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3d748>
  a84f04:	e9 be 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84f09:	48 8d 3d c0 22 e7 00 	lea    rdi,[rip+0xe722c0]        # 18f71d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e5e0>
  a84f10:	e9 b2 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84f15:	41 57                	push   r15
  a84f17:	41 56                	push   r14
  a84f19:	41 54                	push   r12
  a84f1b:	53                   	push   rbx
  a84f1c:	48 83 ec 28          	sub    rsp,0x28
  a84f20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84f27:	00 00
  a84f29:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  a84f2e:	48 8d 35 d6 6a 8a ff 	lea    rsi,[rip+0xffffffffff8a6ad6]        # 32ba0b <_ZTSSt12bad_any_cast@@Base-0x647bd>
  a84f35:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  a84f3a:	48 89 df             	mov    rdi,rbx
  a84f3d:	e8 3c 4b ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84f42:	4c 8d 35 2f 2c f6 00 	lea    r14,[rip+0xf62c2f]        # 19e7b78 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2168>
  a84f49:	4c 89 f7             	mov    rdi,r14
  a84f4c:	48 89 de             	mov    rsi,rbx
  a84f4f:	e8 6e 4a c4 00       	call   16c99c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7db2e>
  a84f54:	48 89 df             	mov    rdi,rbx
  a84f57:	e8 34 8f d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  a84f5c:	48 8d 1d cb 03 c4 00 	lea    rbx,[rip+0xc403cb]        # 16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  a84f63:	4c 8d 3d 96 f0 d6 00 	lea    r15,[rip+0xd6f096]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84f6a:	48 89 df             	mov    rdi,rbx
  a84f6d:	4c 89 f6             	mov    rsi,r14
  a84f70:	4c 89 fa             	mov    rdx,r15
  a84f73:	e8 e8 8e d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84f78:	48 8d 35 58 d5 8a ff 	lea    rsi,[rip+0xffffffffff8ad558]        # 3324d7 <_ZTSSt12bad_any_cast@@Base-0x5dcf1>
  a84f7f:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  a84f84:	4c 89 f7             	mov    rdi,r14
  a84f87:	e8 f2 4a ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84f8c:	4c 8d 25 3d 2c f6 00 	lea    r12,[rip+0xf62c3d]        # 19e7bd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x21c0>
  a84f93:	4c 89 e7             	mov    rdi,r12
  a84f96:	4c 89 f6             	mov    rsi,r14
  a84f99:	e8 24 4a c4 00       	call   16c99c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7db2e>
  a84f9e:	4c 89 f7             	mov    rdi,r14
  a84fa1:	e8 ea 8e d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  a84fa6:	48 89 df             	mov    rdi,rbx
  a84fa9:	4c 89 e6             	mov    rsi,r12
  a84fac:	4c 89 fa             	mov    rdx,r15
  a84faf:	e8 ac 8e d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84fb4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84fbb:	00 00
  a84fbd:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  a84fc2:	75 0c                	jne    a84fd0 <JNI_OnUnload@@Base+0xc89d>
  a84fc4:	48 83 c4 28          	add    rsp,0x28
  a84fc8:	5b                   	pop    rbx
  a84fc9:	41 5c                	pop    r12
  a84fcb:	41 5e                	pop    r14
  a84fcd:	41 5f                	pop    r15
  a84fcf:	c3                   	ret
```
### AP `0x18b0cf8` +0x28 -> `0xa84d48` score 13

```text
  a84d48:	53                   	push   rbx
  a84d49:	48 8d 1d a0 2d f6 00 	lea    rbx,[rip+0xf62da0]        # 19e7af0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x20e0>
  a84d50:	48 8d 35 f9 c2 8e ff 	lea    rsi,[rip+0xffffffffff8ec2f9]        # 371050 <_ZTSSt12bad_any_cast@@Base-0x1f178>
  a84d57:	48 89 df             	mov    rdi,rbx
  a84d5a:	e8 1f 4d ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84d5f:	48 8b 3d da cc e2 00 	mov    rdi,QWORD PTR [rip+0xe2ccda]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84d66:	48 8d 15 93 f2 d6 00 	lea    rdx,[rip+0xd6f293]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84d6d:	48 89 de             	mov    rsi,rbx
  a84d70:	5b                   	pop    rbx
  a84d71:	e9 ea 90 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84d76:	48 8d 3d 0b cf e6 00 	lea    rdi,[rip+0xe6cf0b]        # 18f1c88 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39098>
  a84d7d:	e9 45 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84d82:	50                   	push   rax
  a84d83:	e8 12 ba 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84d88:	e8 54 ba 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84d8d:	e8 96 ba 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84d92:	58                   	pop    rax
  a84d93:	e9 d7 ba 02 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a84d98:	48 8d 3d 89 d3 e6 00 	lea    rdi,[rip+0xe6d389]        # 18f2128 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39538>
  a84d9f:	e9 23 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84da4:	48 8d 3d 85 dc e6 00 	lea    rdi,[rip+0xe6dc85]        # 18f2a30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x39e40>
  a84dab:	e9 17 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84db0:	48 8d 3d 61 e1 e6 00 	lea    rdi,[rip+0xe6e161]        # 18f2f18 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a328>
  a84db7:	e9 0b 27 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dbc:	48 8d 3d c5 e3 e6 00 	lea    rdi,[rip+0xe6e3c5]        # 18f3188 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a598>
  a84dc3:	e9 ff 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dc8:	48 8d 3d 49 e6 e6 00 	lea    rdi,[rip+0xe6e649]        # 18f3418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3a828>
  a84dcf:	e9 f3 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dd4:	48 8d 3d ed e8 e6 00 	lea    rdi,[rip+0xe6e8ed]        # 18f36c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3aad8>
  a84ddb:	e9 e7 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84de0:	48 8d 3d 71 eb e6 00 	lea    rdi,[rip+0xe6eb71]        # 18f3958 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3ad68>
  a84de7:	e9 db 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84dec:	48 8d 3d 3d ee e6 00 	lea    rdi,[rip+0xe6ee3d]        # 18f3c30 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b040>
  a84df3:	e9 cf 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84df8:	48 8d 3d d9 f2 e6 00 	lea    rdi,[rip+0xe6f2d9]        # 18f40d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3b4e8>
  a84dff:	e9 c3 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84e04:	48 8d 3d d9 fe 60 00 	lea    rdi,[rip+0x60fed9]        # 1094ce4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c0fa>
  a84e0b:	48 8d 35 1e 2d f6 00 	lea    rsi,[rip+0xf62d1e]        # 19e7b30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2120>
  a84e12:	48 8d 15 e7 f1 d6 00 	lea    rdx,[rip+0xd6f1e7]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84e19:	e9 42 90 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84e1e:	48 8d 3d 53 ff e6 00 	lea    rdi,[rip+0xe6ff53]        # 18f4d78 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3c188>
  a84e25:	e9 9d 26 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84e2a:	41 56                	push   r14
  a84e2c:	53                   	push   rbx
  a84e2d:	48 83 ec 18          	sub    rsp,0x18
  a84e31:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84e38:	00 00
  a84e3a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  a84e3f:	e8 56 b9 02 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>
  a84e44:	e8 98 b9 02 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a84e49:	e8 da b9 02 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a84e4e:	e8 1c ba 02 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>
  a84e53:	48 8d 05 a8 23 95 ff 	lea    rax,[rip+0xffffffffff9523a8]        # 3d7202 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1de7>
  a84e5a:	48 89 e3             	mov    rbx,rsp
  a84e5d:	48 89 03             	mov    QWORD PTR [rbx],rax
  a84e60:	c7 43 08 f6 0c 31 90 	mov    DWORD PTR [rbx+0x8],0x90310cf6
  a84e67:	4c 8d 35 ca 2c f6 00 	lea    r14,[rip+0xf62cca]        # 19e7b38 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2128>
  a84e6e:	4c 89 f7             	mov    rdi,r14
  a84e71:	48 89 de             	mov    rsi,rbx
  a84e74:	e8 31 cf d3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a84e79:	48 8b 3d c0 cb e2 00 	mov    rdi,QWORD PTR [rip+0xe2cbc0]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84e80:	48 8d 15 79 f1 d6 00 	lea    rdx,[rip+0xd6f179]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84e87:	4c 89 f6             	mov    rsi,r14
  a84e8a:	e8 d1 8f d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84e8f:	48 8d 05 8d 23 95 ff 	lea    rax,[rip+0xffffffffff95238d]        # 3d7223 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1e08>
  a84e96:	48 89 03             	mov    QWORD PTR [rbx],rax
  a84e99:	c7 43 08 fa f5 3c b4 	mov    DWORD PTR [rbx+0x8],0xb43cf5fa
  a84ea0:	48 8d 3d a9 2c f6 00 	lea    rdi,[rip+0xf62ca9]        # 19e7b50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2140>
  a84ea7:	48 89 e6             	mov    rsi,rsp
  a84eaa:	e8 fb ce d3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a84eaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84eb6:	00 00
  a84eb8:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  a84ebd:	75 21                	jne    a84ee0 <JNI_OnUnload@@Base+0xc7ad>
  a84ebf:	48 8b 3d 7a cb e2 00 	mov    rdi,QWORD PTR [rip+0xe2cb7a]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a84ec6:	48 8d 35 83 2c f6 00 	lea    rsi,[rip+0xf62c83]        # 19e7b50 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2140>
  a84ecd:	48 8d 15 2c f1 d6 00 	lea    rdx,[rip+0xd6f12c]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84ed4:	48 83 c4 18          	add    rsp,0x18
  a84ed8:	5b                   	pop    rbx
  a84ed9:	41 5e                	pop    r14
  a84edb:	e9 80 8f d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a84ee0:	e8 cb ab d6 00       	call   17efab0 <__stack_chk_fail@plt>
  a84ee5:	48 8d 3d 04 04 e7 00 	lea    rdi,[rip+0xe70404]        # 18f52f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3c700>
  a84eec:	e9 d6 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84ef1:	48 8d 3d e8 0d e7 00 	lea    rdi,[rip+0xe70de8]        # 18f5ce0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3d0f0>
  a84ef8:	e9 ca 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84efd:	48 8d 3d 34 14 e7 00 	lea    rdi,[rip+0xe71434]        # 18f6338 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3d748>
  a84f04:	e9 be 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84f09:	48 8d 3d c0 22 e7 00 	lea    rdi,[rip+0xe722c0]        # 18f71d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e5e0>
  a84f10:	e9 b2 25 cc 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a84f15:	41 57                	push   r15
  a84f17:	41 56                	push   r14
  a84f19:	41 54                	push   r12
  a84f1b:	53                   	push   rbx
  a84f1c:	48 83 ec 28          	sub    rsp,0x28
  a84f20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84f27:	00 00
  a84f29:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  a84f2e:	48 8d 35 d6 6a 8a ff 	lea    rsi,[rip+0xffffffffff8a6ad6]        # 32ba0b <_ZTSSt12bad_any_cast@@Base-0x647bd>
  a84f35:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  a84f3a:	48 89 df             	mov    rdi,rbx
  a84f3d:	e8 3c 4b ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84f42:	4c 8d 35 2f 2c f6 00 	lea    r14,[rip+0xf62c2f]        # 19e7b78 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2168>
  a84f49:	4c 89 f7             	mov    rdi,r14
  a84f4c:	48 89 de             	mov    rsi,rbx
  a84f4f:	e8 6e 4a c4 00       	call   16c99c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7db2e>
  a84f54:	48 89 df             	mov    rdi,rbx
  a84f57:	e8 34 8f d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  a84f5c:	48 8d 1d cb 03 c4 00 	lea    rbx,[rip+0xc403cb]        # 16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  a84f63:	4c 8d 3d 96 f0 d6 00 	lea    r15,[rip+0xd6f096]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a84f6a:	48 89 df             	mov    rdi,rbx
  a84f6d:	4c 89 f6             	mov    rsi,r14
  a84f70:	4c 89 fa             	mov    rdx,r15
  a84f73:	e8 e8 8e d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84f78:	48 8d 35 58 d5 8a ff 	lea    rsi,[rip+0xffffffffff8ad558]        # 3324d7 <_ZTSSt12bad_any_cast@@Base-0x5dcf1>
  a84f7f:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  a84f84:	4c 89 f7             	mov    rdi,r14
  a84f87:	e8 f2 4a ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a84f8c:	4c 8d 25 3d 2c f6 00 	lea    r12,[rip+0xf62c3d]        # 19e7bd0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x21c0>
  a84f93:	4c 89 e7             	mov    rdi,r12
  a84f96:	4c 89 f6             	mov    rsi,r14
  a84f99:	e8 24 4a c4 00       	call   16c99c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7db2e>
  a84f9e:	4c 89 f7             	mov    rdi,r14
  a84fa1:	e8 ea 8e d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  a84fa6:	48 89 df             	mov    rdi,rbx
  a84fa9:	4c 89 e6             	mov    rsi,r12
  a84fac:	4c 89 fa             	mov    rdx,r15
  a84faf:	e8 ac 8e d6 00       	call   17ede60 <__cxa_atexit@plt>
  a84fb4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a84fbb:	00 00
  a84fbd:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  a84fc2:	75 0c                	jne    a84fd0 <JNI_OnUnload@@Base+0xc89d>
  a84fc4:	48 83 c4 28          	add    rsp,0x28
  a84fc8:	5b                   	pop    rbx
  a84fc9:	41 5c                	pop    r12
  a84fcb:	41 5e                	pop    r14
  a84fcd:	41 5f                	pop    r15
  a84fcf:	c3                   	ret
```
### AP `0x1950940` +0x28 -> `0x161319c` score 13

```text
 161319c:	48 89 f0             	mov    rax,rsi
 161319f:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 16131a3:	48 8d 0d 76 91 27 00 	lea    rcx,[rip+0x279176]        # 188c320 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4ff8>
 16131aa:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 16131ad:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 16131b2:	48 8d 0d 3f c6 e2 fe 	lea    rcx,[rip+0xfffffffffee2c63f]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 16131b9:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
 16131bd:	c3                   	ret
 16131be:	55                   	push   rbp
 16131bf:	41 57                	push   r15
 16131c1:	41 56                	push   r14
 16131c3:	41 55                	push   r13
 16131c5:	41 54                	push   r12
 16131c7:	53                   	push   rbx
 16131c8:	48 83 ec 78          	sub    rsp,0x78
 16131cc:	49 89 d4             	mov    r12,rdx
 16131cf:	49 89 f6             	mov    r14,rsi
 16131d2:	48 89 fb             	mov    rbx,rdi
 16131d5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 16131dc:	00 00
 16131de:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 16131e3:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
 16131e8:	49 83 67 f0 00       	and    QWORD PTR [r15-0x10],0x0
 16131ed:	49 89 4f f8          	mov    QWORD PTR [r15-0x8],rcx
 16131f1:	48 8d 05 c8 91 27 00 	lea    rax,[rip+0x2791c8]        # 188c3c0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5098>
 16131f8:	49 89 47 e8          	mov    QWORD PTR [r15-0x18],rax
 16131fc:	0f 57 c0             	xorps  xmm0,xmm0
 16131ff:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
 1613203:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 1613208:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 161320d:	6a 01                	push   0x1
 161320f:	5e                   	pop    rsi
 1613210:	e8 1d 0f 00 00       	call   1614132 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2a0>
 1613215:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 1613219:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
 161321e:	4d 85 ff             	test   r15,r15
 1613221:	74 4c                	je     161326f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3dd>
 1613223:	6a 29                	push   0x29
 1613225:	41 5d                	pop    r13
 1613227:	45 85 e4             	test   r12d,r12d
 161322a:	0f 88 39 04 00 00    	js     1613669 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7d7>
 1613230:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 1613235:	4d 85 f6             	test   r14,r14
 1613238:	75 09                	jne    1613243 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3b1>
 161323a:	45 85 e4             	test   r12d,r12d
 161323d:	0f 85 26 04 00 00    	jne    1613669 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7d7>
 1613243:	41 8b 87 80 03 00 00 	mov    eax,DWORD PTR [r15+0x380]
 161324a:	6a 01                	push   0x1
 161324c:	41 5d                	pop    r13
 161324e:	85 c0                	test   eax,eax
 1613250:	0f 84 f6 04 00 00    	je     161374c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe8ba>
 1613256:	83 f8 03             	cmp    eax,0x3
 1613259:	0f 84 06 04 00 00    	je     1613665 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7d3>
 161325f:	83 f8 02             	cmp    eax,0x2
 1613262:	0f 85 fe 04 00 00    	jne    1613766 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe8d4>
 1613268:	6a 24                	push   0x24
 161326a:	e9 f8 03 00 00       	jmp    1613667 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe7d5>
 161326f:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 1613274:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
 1613279:	bf 90 03 00 00       	mov    edi,0x390
 161327e:	e8 7d b9 1d 00       	call   17eec00 <malloc@plt>
 1613283:	48 85 c0             	test   rax,rax
 1613286:	0f 84 3e 05 00 00    	je     16137ca <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe938>
 161328c:	49 89 c7             	mov    r15,rax
 161328f:	48 8b 05 f2 e9 29 00 	mov    rax,QWORD PTR [rip+0x29e9f2]        # 18b1c88 <malloc@LIBC>
 1613296:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 161329a:	48 8b 05 17 ea 29 00 	mov    rax,QWORD PTR [rip+0x29ea17]        # 18b1cb8 <realloc@LIBC>
 16132a1:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 16132a5:	48 8b 05 54 e9 29 00 	mov    rax,QWORD PTR [rip+0x29e954]        # 18b1c00 <free@LIBC>
 16132ac:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
 16132b0:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 16132b5:	49 83 67 40 00       	and    QWORD PTR [r15+0x40],0x0
 16132ba:	41 c7 87 c8 02 00 00 	mov    DWORD PTR [r15+0x2c8],0x10
 16132c1:	10 00 00 00
 16132c5:	bf 00 02 00 00       	mov    edi,0x200
 16132ca:	e8 31 b9 1d 00       	call   17eec00 <malloc@plt>
 16132cf:	49 89 87 d8 02 00 00 	mov    QWORD PTR [r15+0x2d8],rax
 16132d6:	48 85 c0             	test   rax,rax
 16132d9:	0f 84 e3 04 00 00    	je     16137c2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe930>
 16132df:	49 89 c6             	mov    r14,rax
 16132e2:	bf 00 04 00 00       	mov    edi,0x400
 16132e7:	e8 14 b9 1d 00       	call   17eec00 <malloc@plt>
 16132ec:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
 16132f0:	48 85 c0             	test   rax,rax
 16132f3:	0f 84 c1 04 00 00    	je     16137ba <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe928>
 16132f9:	49 89 c5             	mov    r13,rax
 16132fc:	48 05 00 04 00 00    	add    rax,0x400
 1613302:	49 89 47 70          	mov    QWORD PTR [r15+0x70],rax
 1613306:	bf 40 01 00 00       	mov    edi,0x140
 161330b:	e8 f0 b8 1d 00       	call   17eec00 <malloc@plt>
 1613310:	48 85 c0             	test   rax,rax
 1613313:	0f 84 91 04 00 00    	je     16137aa <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe918>
 1613319:	49 8d 4f 18          	lea    rcx,[r15+0x18]
 161331d:	0f 57 c0             	xorps  xmm0,xmm0
 1613320:	0f 11 80 b0 00 00 00 	movups XMMWORD PTR [rax+0xb0],xmm0
 1613327:	0f 11 80 a0 00 00 00 	movups XMMWORD PTR [rax+0xa0],xmm0
 161332e:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
 1613335:	00
 1613336:	48 89 88 c8 00 00 00 	mov    QWORD PTR [rax+0xc8],rcx
 161333d:	48 83 a0 f0 00 00 00 	and    QWORD PTR [rax+0xf0],0x0
 1613344:	00
 1613345:	0f 11 80 d0 00 00 00 	movups XMMWORD PTR [rax+0xd0],xmm0
 161334c:	0f 11 80 e0 00 00 00 	movups XMMWORD PTR [rax+0xe0],xmm0
 1613353:	48 89 88 f8 00 00 00 	mov    QWORD PTR [rax+0xf8],rcx
 161335a:	31 d2                	xor    edx,edx
 161335c:	88 50 08             	mov    BYTE PTR [rax+0x8],dl
 161335f:	48 83 20 00          	and    QWORD PTR [rax],0x0
 1613363:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
 1613367:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
 161336b:	88 50 30             	mov    BYTE PTR [rax+0x30],dl
 161336e:	48 83 60 28 00       	and    QWORD PTR [rax+0x28],0x0
 1613373:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 1613377:	48 89 48 48          	mov    QWORD PTR [rax+0x48],rcx
 161337b:	88 50 58             	mov    BYTE PTR [rax+0x58],dl
 161337e:	48 83 60 50 00       	and    QWORD PTR [rax+0x50],0x0
 1613383:	0f 11 40 60          	movups XMMWORD PTR [rax+0x60],xmm0
 1613387:	48 89 48 70          	mov    QWORD PTR [rax+0x70],rcx
 161338b:	88 90 80 00 00 00    	mov    BYTE PTR [rax+0x80],dl
 1613391:	48 83 60 78 00       	and    QWORD PTR [rax+0x78],0x0
 1613396:	49 89 87 98 02 00 00 	mov    QWORD PTR [r15+0x298],rax
 161339d:	49 83 a7 c0 02 00 00 	and    QWORD PTR [r15+0x2c0],0x0
 16133a4:	00
 16133a5:	0f 11 80 88 00 00 00 	movups XMMWORD PTR [rax+0x88],xmm0
 16133ac:	49 83 a7 b0 02 00 00 	and    QWORD PTR [r15+0x2b0],0x0
 16133b3:	00
 16133b4:	48 89 88 98 00 00 00 	mov    QWORD PTR [rax+0x98],rcx
 16133bb:	49 83 a7 38 02 00 00 	and    QWORD PTR [r15+0x238],0x0
 16133c2:	00
 16133c3:	0f 11 80 08 01 00 00 	movups XMMWORD PTR [rax+0x108],xmm0
 16133ca:	41 83 a7 70 03 00 00 	and    DWORD PTR [r15+0x370],0x0
 16133d1:	00
 16133d2:	88 90 18 01 00 00    	mov    BYTE PTR [rax+0x118],dl
 16133d8:	49 83 a7 68 03 00 00 	and    QWORD PTR [r15+0x368],0x0
 16133df:	00
 16133e0:	0f 11 80 20 01 00 00 	movups XMMWORD PTR [rax+0x120],xmm0
 16133e7:	49 83 a7 08 01 00 00 	and    QWORD PTR [r15+0x108],0x0
 16133ee:	00
 16133ef:	0f 11 80 30 01 00 00 	movups XMMWORD PTR [rax+0x130],xmm0
 16133f6:	49 83 a7 e8 01 00 00 	and    QWORD PTR [r15+0x1e8],0x0
 16133fd:	00
 16133fe:	41 c6 87 74 03 00 00 	mov    BYTE PTR [r15+0x374],0x21
 1613405:	21
 1613406:	66 41 83 a7 d0 01 00 	and    WORD PTR [r15+0x1d0],0x0
 161340d:	00 00
 161340f:	66 c7 80 00 01 00 00 	mov    WORD PTR [rax+0x100],0x1
 1613416:	01 00
 1613418:	49 83 a7 c8 01 00 00 	and    QWORD PTR [r15+0x1c8],0x0
 161341f:	00
 1613420:	88 90 02 01 00 00    	mov    BYTE PTR [rax+0x102],dl
 1613426:	49 83 a7 28 03 00 00 	and    QWORD PTR [r15+0x328],0x0
 161342d:	00
 161342e:	41 0f 11 87 08 03 00 	movups XMMWORD PTR [r15+0x308],xmm0
 1613435:	00
 1613436:	41 0f 11 87 18 03 00 	movups XMMWORD PTR [r15+0x318],xmm0
 161343d:	00
 161343e:	41 0f 11 87 e0 02 00 	movups XMMWORD PTR [r15+0x2e0],xmm0
 1613445:	00
 1613446:	41 88 97 f0 02 00 00 	mov    BYTE PTR [r15+0x2f0],dl
 161344d:	49 89 8f 30 03 00 00 	mov    QWORD PTR [r15+0x330],rcx
 1613454:	49 83 a7 58 03 00 00 	and    QWORD PTR [r15+0x358],0x0
```
### AP `0x180ee18` +0x28 -> `0xbbee56` score 12

```text
  bbee56:	48 89 d0             	mov    rax,rdx
  bbee59:	48 89 f1             	mov    rcx,rsi
  bbee5c:	48 c1 e9 20          	shr    rcx,0x20
  bbee60:	48 c1 ea 20          	shr    rdx,0x20
  bbee64:	01 c1                	add    ecx,eax
  bbee66:	44 8d 0c 0e          	lea    r9d,[rsi+rcx*1]
  bbee6a:	01 d1                	add    ecx,edx
  bbee6c:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
  bbee70:	bf ff 00 00 00       	mov    edi,0xff
  bbee75:	45 8d 04 11          	lea    r8d,[r9+rdx*1]
  bbee79:	21 fa                	and    edx,edi
  bbee7b:	8b 94 96 2c 01 00 00 	mov    edx,DWORD PTR [rsi+rdx*4+0x12c]
  bbee82:	29 d0                	sub    eax,edx
  bbee84:	41 31 c9             	xor    r9d,ecx
  bbee87:	29 c1                	sub    ecx,eax
  bbee89:	45 89 c2             	mov    r10d,r8d
  bbee8c:	41 c1 c2 0e          	rol    r10d,0xe
  bbee90:	44 89 ca             	mov    edx,r9d
  bbee93:	c1 c2 16             	rol    edx,0x16
  bbee96:	44 01 d2             	add    edx,r10d
  bbee99:	01 c2                	add    edx,eax
  bbee9b:	45 29 c8             	sub    r8d,r9d
  bbee9e:	41 29 c8             	sub    r8d,ecx
  bbeea1:	41 31 c9             	xor    r9d,ecx
  bbeea4:	31 d1                	xor    ecx,edx
  bbeea6:	44 01 c2             	add    edx,r8d
  bbeea9:	45 31 c8             	xor    r8d,r9d
  bbeeac:	41 29 c9             	sub    r9d,ecx
  bbeeaf:	89 d0                	mov    eax,edx
  bbeeb1:	29 c8                	sub    eax,ecx
  bbeeb3:	44 29 c2             	sub    edx,r8d
  bbeeb6:	44 01 c8             	add    eax,r9d
  bbeeb9:	41 21 f9             	and    r9d,edi
  bbeebc:	46 8b 8c 8e 10 06 00 	mov    r9d,DWORD PTR [rsi+r9*4+0x610]
  bbeec3:	00
  bbeec4:	45 01 c8             	add    r8d,r9d
  bbeec7:	44 01 c9             	add    ecx,r9d
  bbeeca:	41 89 c1             	mov    r9d,eax
  bbeecd:	45 31 c1             	xor    r9d,r8d
  bbeed0:	41 21 f8             	and    r8d,edi
  bbeed3:	42 33 54 86 20       	xor    edx,DWORD PTR [rsi+r8*4+0x20]
  bbeed8:	41 89 c8             	mov    r8d,ecx
  bbeedb:	41 21 f8             	and    r8d,edi
  bbeede:	42 2b 84 86 f4 03 00 	sub    eax,DWORD PTR [rsi+r8*4+0x3f4]
  bbeee5:	00
  bbeee6:	41 89 d0             	mov    r8d,edx
  bbeee9:	41 21 f8             	and    r8d,edi
  bbeeec:	42 33 4c 86 64       	xor    ecx,DWORD PTR [rsi+r8*4+0x64]
  bbeef1:	44 21 cf             	and    edi,r9d
  bbeef4:	33 94 be 90 03 00 00 	xor    edx,DWORD PTR [rsi+rdi*4+0x390]
  bbeefb:	8d 34 08             	lea    esi,[rax+rcx*1]
  bbeefe:	44 31 ce             	xor    esi,r9d
  bbef01:	48 c1 e1 20          	shl    rcx,0x20
  bbef05:	48 09 c8             	or     rax,rcx
  bbef08:	48 c1 e6 20          	shl    rsi,0x20
  bbef0c:	48 09 f2             	or     rdx,rsi
  bbef0f:	c3                   	ret
```
### AP `0x1810340` +0x28 -> `0xbbee50` score 12

```text
  bbee50:	e9 a5 ff ff ff       	jmp    bbedfa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10bd9a>
  bbee55:	cc                   	int3
  bbee56:	48 89 d0             	mov    rax,rdx
  bbee59:	48 89 f1             	mov    rcx,rsi
  bbee5c:	48 c1 e9 20          	shr    rcx,0x20
  bbee60:	48 c1 ea 20          	shr    rdx,0x20
  bbee64:	01 c1                	add    ecx,eax
  bbee66:	44 8d 0c 0e          	lea    r9d,[rsi+rcx*1]
  bbee6a:	01 d1                	add    ecx,edx
  bbee6c:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
  bbee70:	bf ff 00 00 00       	mov    edi,0xff
  bbee75:	45 8d 04 11          	lea    r8d,[r9+rdx*1]
  bbee79:	21 fa                	and    edx,edi
  bbee7b:	8b 94 96 2c 01 00 00 	mov    edx,DWORD PTR [rsi+rdx*4+0x12c]
  bbee82:	29 d0                	sub    eax,edx
  bbee84:	41 31 c9             	xor    r9d,ecx
  bbee87:	29 c1                	sub    ecx,eax
  bbee89:	45 89 c2             	mov    r10d,r8d
  bbee8c:	41 c1 c2 0e          	rol    r10d,0xe
  bbee90:	44 89 ca             	mov    edx,r9d
  bbee93:	c1 c2 16             	rol    edx,0x16
  bbee96:	44 01 d2             	add    edx,r10d
  bbee99:	01 c2                	add    edx,eax
  bbee9b:	45 29 c8             	sub    r8d,r9d
  bbee9e:	41 29 c8             	sub    r8d,ecx
  bbeea1:	41 31 c9             	xor    r9d,ecx
  bbeea4:	31 d1                	xor    ecx,edx
  bbeea6:	44 01 c2             	add    edx,r8d
  bbeea9:	45 31 c8             	xor    r8d,r9d
  bbeeac:	41 29 c9             	sub    r9d,ecx
  bbeeaf:	89 d0                	mov    eax,edx
  bbeeb1:	29 c8                	sub    eax,ecx
  bbeeb3:	44 29 c2             	sub    edx,r8d
  bbeeb6:	44 01 c8             	add    eax,r9d
  bbeeb9:	41 21 f9             	and    r9d,edi
  bbeebc:	46 8b 8c 8e 10 06 00 	mov    r9d,DWORD PTR [rsi+r9*4+0x610]
  bbeec3:	00
  bbeec4:	45 01 c8             	add    r8d,r9d
  bbeec7:	44 01 c9             	add    ecx,r9d
  bbeeca:	41 89 c1             	mov    r9d,eax
  bbeecd:	45 31 c1             	xor    r9d,r8d
  bbeed0:	41 21 f8             	and    r8d,edi
  bbeed3:	42 33 54 86 20       	xor    edx,DWORD PTR [rsi+r8*4+0x20]
  bbeed8:	41 89 c8             	mov    r8d,ecx
  bbeedb:	41 21 f8             	and    r8d,edi
  bbeede:	42 2b 84 86 f4 03 00 	sub    eax,DWORD PTR [rsi+r8*4+0x3f4]
  bbeee5:	00
  bbeee6:	41 89 d0             	mov    r8d,edx
  bbeee9:	41 21 f8             	and    r8d,edi
  bbeeec:	42 33 4c 86 64       	xor    ecx,DWORD PTR [rsi+r8*4+0x64]
  bbeef1:	44 21 cf             	and    edi,r9d
  bbeef4:	33 94 be 90 03 00 00 	xor    edx,DWORD PTR [rsi+rdi*4+0x390]
  bbeefb:	8d 34 08             	lea    esi,[rax+rcx*1]
  bbeefe:	44 31 ce             	xor    esi,r9d
  bbef01:	48 c1 e1 20          	shl    rcx,0x20
  bbef05:	48 09 c8             	or     rax,rcx
  bbef08:	48 c1 e6 20          	shl    rsi,0x20
  bbef0c:	48 09 f2             	or     rdx,rsi
  bbef0f:	c3                   	ret
```
### AP `0x1851d78` +0x28 -> `0x1122e34` score 12

```text
 1122e34:	53                   	push   rbx
 1122e35:	48 89 fb             	mov    rbx,rdi
 1122e38:	48 8d 05 61 ef 72 00 	lea    rax,[rip+0x72ef61]        # 1851da0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe488>
 1122e3f:	48 89 07             	mov    QWORD PTR [rdi],rax
 1122e42:	48 83 c7 18          	add    rdi,0x18
 1122e46:	e8 dd 6f 95 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 1122e4b:	48 83 c3 10          	add    rbx,0x10
 1122e4f:	48 89 df             	mov    rdi,rbx
 1122e52:	5b                   	pop    rbx
 1122e53:	e9 72 74 95 ff       	jmp    a7a2ca <JNI_OnUnload@@Base+0x1b97>
 1122e58:	53                   	push   rbx
 1122e59:	48 89 fb             	mov    rbx,rdi
 1122e5c:	e8 d3 ff ff ff       	call   1122e34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea24a>
 1122e61:	48 89 df             	mov    rdi,rbx
 1122e64:	5b                   	pop    rbx
 1122e65:	e9 b6 b0 6c 00       	jmp    17edf20 <_ZdlPv@plt>
 1122e6a:	55                   	push   rbp
 1122e6b:	41 57                	push   r15
 1122e6d:	41 56                	push   r14
 1122e6f:	53                   	push   rbx
 1122e70:	50                   	push   rax
 1122e71:	48 89 d3             	mov    rbx,rdx
 1122e74:	80 4a 10 01          	or     BYTE PTR [rdx+0x10],0x1
 1122e78:	49 89 f6             	mov    r14,rsi
 1122e7b:	89 fd                	mov    ebp,edi
 1122e7d:	48 8b 72 18          	mov    rsi,QWORD PTR [rdx+0x18]
 1122e81:	48 85 f6             	test   rsi,rsi
 1122e84:	75 1a                	jne    1122ea0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea2b6>
 1122e86:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 1122e8a:	40 f6 c7 01          	test   dil,0x1
 1122e8e:	0f 85 44 01 00 00    	jne    1122fd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea3ee>
 1122e94:	e8 1b 02 00 00       	call   11230b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea4ca>
 1122e99:	48 89 c6             	mov    rsi,rax
 1122e9c:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 1122ea0:	4c 89 f7             	mov    rdi,r14
 1122ea3:	e8 a8 a3 22 00       	call   134d250 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1927d4>
 1122ea8:	80 4b 10 02          	or     BYTE PTR [rbx+0x10],0x2
 1122eac:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
 1122eb0:	48 85 f6             	test   rsi,rsi
 1122eb3:	75 1a                	jne    1122ecf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea2e5>
 1122eb5:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 1122eb9:	40 f6 c7 01          	test   dil,0x1
 1122ebd:	0f 85 21 01 00 00    	jne    1122fe4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea3fa>
 1122ec3:	e8 b2 01 00 00       	call   112307a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea490>
 1122ec8:	48 89 c6             	mov    rsi,rax
 1122ecb:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 1122ecf:	4c 89 f7             	mov    rdi,r14
 1122ed2:	e8 79 a3 22 00       	call   134d250 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1927d4>
 1122ed7:	80 4b 10 04          	or     BYTE PTR [rbx+0x10],0x4
 1122edb:	4c 8b 7b 28          	mov    r15,QWORD PTR [rbx+0x28]
 1122edf:	4d 85 ff             	test   r15,r15
 1122ee2:	75 1a                	jne    1122efe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea314>
 1122ee4:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 1122ee8:	40 f6 c7 01          	test   dil,0x1
 1122eec:	0f 85 fe 00 00 00    	jne    1122ff0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea406>
 1122ef2:	e8 4b 01 00 00       	call   1123042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea458>
 1122ef7:	49 89 c7             	mov    r15,rax
 1122efa:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
 1122efe:	b0 01                	mov    al,0x1
 1122f00:	40 84 ed             	test   bpl,bpl
 1122f03:	75 1e                	jne    1122f23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea339>
 1122f05:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 1122f09:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
 1122f0d:	48 8d 15 d2 5c 2b ff 	lea    rdx,[rip+0xffffffffff2b5cd2]        # 3d8be6 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37cb>
 1122f14:	e8 43 c0 a1 ff       	call   b3ef5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8befc>
 1122f19:	48 89 c7             	mov    rdi,rax
 1122f1c:	31 f6                	xor    esi,esi
 1122f1e:	e8 7b 11 6a 00       	call   17c409e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17820a>
 1122f23:	41 88 47 18          	mov    BYTE PTR [r15+0x18],al
 1122f27:	41 80 4f 10 01       	or     BYTE PTR [r15+0x10],0x1
 1122f2c:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 1122f30:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
 1122f34:	48 8d 15 65 5e 2b ff 	lea    rdx,[rip+0xffffffffff2b5e65]        # 3d8da0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3985>
 1122f3b:	e8 1c c0 a1 ff       	call   b3ef5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8befc>
 1122f40:	80 38 07             	cmp    BYTE PTR [rax],0x7
 1122f43:	4c 8d 3d 06 ed 32 ff 	lea    r15,[rip+0xffffffffff32ed06]        # 451c50 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1785c>
 1122f4a:	4c 0f 44 f8          	cmove  r15,rax
 1122f4e:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 1122f52:	49 3b 47 10          	cmp    rax,QWORD PTR [r15+0x10]
 1122f56:	74 75                	je     1122fcd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea3e3>
 1122f58:	80 4b 10 08          	or     BYTE PTR [rbx+0x10],0x8
 1122f5c:	4c 8b 73 30          	mov    r14,QWORD PTR [rbx+0x30]
 1122f60:	4d 85 f6             	test   r14,r14
 1122f63:	75 1a                	jne    1122f7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea395>
 1122f65:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 1122f69:	40 f6 c7 01          	test   dil,0x1
 1122f6d:	0f 85 89 00 00 00    	jne    1122ffc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea412>
 1122f73:	e8 90 00 00 00       	call   1123008 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ea41e>
 1122f78:	49 89 c6             	mov    r14,rax
 1122f7b:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 1122f7f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 1122f83:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 1122f87:	48 8d 15 b6 66 31 ff 	lea    rdx,[rip+0xffffffffff3166b6]        # 439644 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f093>
 1122f8e:	e8 c9 bf a1 ff       	call   b3ef5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8befc>
 1122f93:	48 89 c7             	mov    rdi,rax
 1122f96:	31 f6                	xor    esi,esi
 1122f98:	e8 01 11 6a 00       	call   17c409e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17820a>
 1122f9d:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
 1122fa1:	41 80 4e 10 01       	or     BYTE PTR [r14+0x10],0x1
 1122fa6:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 1122faa:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 1122fae:	48 8d 15 fc 5d 2b ff 	lea    rdx,[rip+0xffffffffff2b5dfc]        # 3d8db1 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3996>
 1122fb5:	e8 a2 bf a1 ff       	call   b3ef5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8befc>
 1122fba:	48 89 c7             	mov    rdi,rax
 1122fbd:	31 f6                	xor    esi,esi
 1122fbf:	e8 da 10 6a 00       	call   17c409e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17820a>
 1122fc4:	41 88 46 19          	mov    BYTE PTR [r14+0x19],al
 1122fc8:	41 80 4e 10 02       	or     BYTE PTR [r14+0x10],0x2
 1122fcd:	48 83 c4 08          	add    rsp,0x8
 1122fd1:	5b                   	pop    rbx
 1122fd2:	41 5e                	pop    r14
 1122fd4:	41 5f                	pop    r15
 1122fd6:	5d                   	pop    rbp
 1122fd7:	c3                   	ret
```
### AP `0x1863e28` +0x28 -> `0x12fe8d4` score 12

```text
 12fe8d4:	41 56                	push   r14
 12fe8d6:	53                   	push   rbx
 12fe8d7:	50                   	push   rax
 12fe8d8:	48 89 fb             	mov    rbx,rdi
 12fe8db:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
 12fe8df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12fe8e2:	ff 50 40             	call   QWORD PTR [rax+0x40]
 12fe8e5:	49 89 c6             	mov    r14,rax
 12fe8e8:	48 89 df             	mov    rdi,rbx
 12fe8eb:	e8 5a 78 da ff       	call   10a614a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d560>
 12fe8f0:	48 89 df             	mov    rdi,rbx
 12fe8f3:	4c 89 f6             	mov    rsi,r14
 12fe8f6:	e8 99 45 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe8fb:	49 8d 76 18          	lea    rsi,[r14+0x18]
 12fe8ff:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 12fe903:	e8 8c 45 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe908:	49 8d 76 30          	lea    rsi,[r14+0x30]
 12fe90c:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
 12fe910:	e8 7f 45 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe915:	49 8d 76 48          	lea    rsi,[r14+0x48]
 12fe919:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 12fe91d:	e8 72 45 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe922:	49 8d 76 60          	lea    rsi,[r14+0x60]
 12fe926:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 12fe92a:	e8 65 45 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe92f:	49 8d 76 78          	lea    rsi,[r14+0x78]
 12fe933:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 12fe937:	e8 58 45 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe93c:	bf 90 00 00 00       	mov    edi,0x90
 12fe941:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fe945:	48 01 df             	add    rdi,rbx
 12fe948:	e8 47 45 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe94d:	bf a8 00 00 00       	mov    edi,0xa8
 12fe952:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fe956:	48 01 df             	add    rdi,rbx
 12fe959:	e8 36 45 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe95e:	bf c0 00 00 00       	mov    edi,0xc0
 12fe963:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fe967:	48 01 df             	add    rdi,rbx
 12fe96a:	e8 25 45 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe96f:	bf d8 00 00 00       	mov    edi,0xd8
 12fe974:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fe978:	48 01 df             	add    rdi,rbx
 12fe97b:	e8 14 45 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe980:	bf f0 00 00 00       	mov    edi,0xf0
 12fe985:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fe989:	48 01 df             	add    rdi,rbx
 12fe98c:	e8 03 45 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe991:	bf 08 01 00 00       	mov    edi,0x108
 12fe996:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fe99a:	48 01 df             	add    rdi,rbx
 12fe99d:	e8 f2 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe9a2:	bf 20 01 00 00       	mov    edi,0x120
 12fe9a7:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fe9ab:	48 01 df             	add    rdi,rbx
 12fe9ae:	e8 e1 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe9b3:	bf 38 01 00 00       	mov    edi,0x138
 12fe9b8:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fe9bc:	48 01 df             	add    rdi,rbx
 12fe9bf:	e8 d0 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe9c4:	bf 50 01 00 00       	mov    edi,0x150
 12fe9c9:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fe9cd:	48 01 df             	add    rdi,rbx
 12fe9d0:	e8 bf 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe9d5:	bf 68 01 00 00       	mov    edi,0x168
 12fe9da:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fe9de:	48 01 df             	add    rdi,rbx
 12fe9e1:	e8 ae 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe9e6:	bf 80 01 00 00       	mov    edi,0x180
 12fe9eb:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fe9ef:	48 01 df             	add    rdi,rbx
 12fe9f2:	e8 9d 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fe9f7:	bf 98 01 00 00       	mov    edi,0x198
 12fe9fc:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fea00:	48 01 df             	add    rdi,rbx
 12fea03:	e8 8c 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fea08:	bf b0 01 00 00       	mov    edi,0x1b0
 12fea0d:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fea11:	48 01 df             	add    rdi,rbx
 12fea14:	e8 7b 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fea19:	bf c8 01 00 00       	mov    edi,0x1c8
 12fea1e:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fea22:	48 01 df             	add    rdi,rbx
 12fea25:	e8 6a 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fea2a:	bf e0 01 00 00       	mov    edi,0x1e0
 12fea2f:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fea33:	48 01 df             	add    rdi,rbx
 12fea36:	e8 59 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fea3b:	bf f8 01 00 00       	mov    edi,0x1f8
 12fea40:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fea44:	48 01 df             	add    rdi,rbx
 12fea47:	e8 48 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fea4c:	bf 10 02 00 00       	mov    edi,0x210
 12fea51:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fea55:	48 01 df             	add    rdi,rbx
 12fea58:	e8 37 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fea5d:	bf 28 02 00 00       	mov    edi,0x228
 12fea62:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fea66:	48 01 df             	add    rdi,rbx
 12fea69:	e8 26 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fea6e:	bf 40 02 00 00       	mov    edi,0x240
 12fea73:	49 8d 34 3e          	lea    rsi,[r14+rdi*1]
 12fea77:	48 01 df             	add    rdi,rbx
 12fea7a:	e8 15 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fea7f:	49 8d b6 58 02 00 00 	lea    rsi,[r14+0x258]
 12fea86:	48 8d bb 70 02 00 00 	lea    rdi,[rbx+0x270]
 12fea8d:	e8 02 44 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12fea92:	49 8d b6 70 02 00 00 	lea    rsi,[r14+0x270]
 12fea99:	48 8d bb 88 02 00 00 	lea    rdi,[rbx+0x288]
 12feaa0:	e8 ef 43 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12feaa5:	49 8d b6 88 02 00 00 	lea    rsi,[r14+0x288]
 12feaac:	48 8d bb a0 02 00 00 	lea    rdi,[rbx+0x2a0]
 12feab3:	e8 dc 43 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12feab8:	49 8d b6 a0 02 00 00 	lea    rsi,[r14+0x2a0]
 12feabf:	48 8d bb b8 02 00 00 	lea    rdi,[rbx+0x2b8]
 12feac6:	e8 c9 43 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12feacb:	49 8d b6 b8 02 00 00 	lea    rsi,[r14+0x2b8]
 12fead2:	48 8d bb d0 02 00 00 	lea    rdi,[rbx+0x2d0]
 12fead9:	e8 b6 43 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12feade:	49 8d b6 d0 02 00 00 	lea    rsi,[r14+0x2d0]
 12feae5:	48 8d bb e8 02 00 00 	lea    rdi,[rbx+0x2e8]
 12feaec:	e8 a3 43 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12feaf1:	49 8d b6 e8 02 00 00 	lea    rsi,[r14+0x2e8]
 12feaf8:	48 8d bb 00 03 00 00 	lea    rdi,[rbx+0x300]
 12feaff:	e8 90 43 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12feb04:	49 8d b6 00 03 00 00 	lea    rsi,[r14+0x300]
 12feb0b:	48 8d bb 18 03 00 00 	lea    rdi,[rbx+0x318]
 12feb12:	e8 7d 43 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12feb17:	49 8d b6 18 03 00 00 	lea    rsi,[r14+0x318]
 12feb1e:	48 8d bb 30 03 00 00 	lea    rdi,[rbx+0x330]
 12feb25:	e8 68 ad da ff       	call   10a9892 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ca8>
 12feb2a:	49 8d b6 40 03 00 00 	lea    rsi,[r14+0x340]
 12feb31:	48 8d bb 58 03 00 00 	lea    rdi,[rbx+0x358]
 12feb38:	e8 4d 37 ca ff       	call   fa228a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1696a0>
 12feb3d:	49 8d b6 68 03 00 00 	lea    rsi,[r14+0x368]
 12feb44:	48 8d bb 80 03 00 00 	lea    rdi,[rbx+0x380]
 12feb4b:	e8 44 43 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12feb50:	49 8d b6 80 03 00 00 	lea    rsi,[r14+0x380]
 12feb57:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
 12feb5e:	e8 31 43 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12feb63:	49 81 c6 98 03 00 00 	add    r14,0x398
 12feb6a:	48 8d bb b0 03 00 00 	lea    rdi,[rbx+0x3b0]
 12feb71:	4c 89 f6             	mov    rsi,r14
 12feb74:	e8 1b 43 b3 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
 12feb79:	48 89 d8             	mov    rax,rbx
 12feb7c:	48 83 c4 08          	add    rsp,0x8
 12feb80:	5b                   	pop    rbx
 12feb81:	41 5e                	pop    r14
 12feb83:	c3                   	ret
```
### AP `0x1813498` +0x28 -> `0xbf5c0a` score 11

```text
  bf5c0a:	55                   	push   rbp
  bf5c0b:	41 57                	push   r15
  bf5c0d:	41 56                	push   r14
  bf5c0f:	41 55                	push   r13
  bf5c11:	41 54                	push   r12
  bf5c13:	53                   	push   rbx
  bf5c14:	48 83 ec 48          	sub    rsp,0x48
  bf5c18:	49 89 fe             	mov    r14,rdi
  bf5c1b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  bf5c22:	00 00
  bf5c24:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  bf5c29:	4c 8b 3a             	mov    r15,QWORD PTR [rdx]
  bf5c2c:	4c 8b 62 18          	mov    r12,QWORD PTR [rdx+0x18]
  bf5c30:	4c 8b 6e 08          	mov    r13,QWORD PTR [rsi+0x8]
  bf5c34:	bf f0 01 00 00       	mov    edi,0x1f0
  bf5c39:	e8 c2 82 bf 00       	call   17edf00 <_Znwm@plt>
  bf5c3e:	48 89 c3             	mov    rbx,rax
  bf5c41:	48 8d 05 90 d8 c1 00 	lea    rax,[rip+0xc1d890]        # 18134d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9198>
  bf5c48:	48 89 03             	mov    QWORD PTR [rbx],rax
  bf5c4b:	0f 57 c0             	xorps  xmm0,xmm0
  bf5c4e:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
  bf5c52:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
  bf5c56:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0
  bf5c5b:	4c 89 7b 30          	mov    QWORD PTR [rbx+0x30],r15
  bf5c5f:	4c 89 63 38          	mov    QWORD PTR [rbx+0x38],r12
  bf5c63:	48 c7 43 40 49 00 00 	mov    QWORD PTR [rbx+0x40],0x49
  bf5c6a:	00
  bf5c6b:	0f 11 43 48          	movups XMMWORD PTR [rbx+0x48],xmm0
  bf5c6f:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
  bf5c73:	83 4b 68 ff          	or     DWORD PTR [rbx+0x68],0xffffffff
  bf5c77:	66 c7 43 6c 10 04    	mov    WORD PTR [rbx+0x6c],0x410
  bf5c7d:	f3 0f 10 05 03 8a 79 	movss  xmm0,DWORD PTR [rip+0xffffffffff798a03]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
  bf5c84:	ff
  bf5c85:	0f 13 43 70          	movlps QWORD PTR [rbx+0x70],xmm0
  bf5c89:	31 c0                	xor    eax,eax
  bf5c8b:	88 43 78             	mov    BYTE PTR [rbx+0x78],al
  bf5c8e:	48 83 a3 80 00 00 00 	and    QWORD PTR [rbx+0x80],0x0
  bf5c95:	00
  bf5c96:	88 83 88 00 00 00    	mov    BYTE PTR [rbx+0x88],al
  bf5c9c:	88 83 90 00 00 00    	mov    BYTE PTR [rbx+0x90],al
  bf5ca2:	88 83 98 00 00 00    	mov    BYTE PTR [rbx+0x98],al
  bf5ca8:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
  bf5caf:	4c 8d bb 98 01 00 00 	lea    r15,[rbx+0x198]
  bf5cb6:	ba f8 00 00 00       	mov    edx,0xf8
  bf5cbb:	31 f6                	xor    esi,esi
  bf5cbd:	e8 ce 8e bf 00       	call   17eeb90 <memset@plt>
  bf5cc2:	48 8d 35 7e a2 77 ff 	lea    rsi,[rip+0xffffffffff77a27e]        # 36ff47 <_ZTSSt12bad_any_cast@@Base-0x20281>
  bf5cc9:	4c 89 ff             	mov    rdi,r15
  bf5ccc:	e8 c9 c5 91 00       	call   151229a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35781e>
  bf5cd1:	4c 8d a3 a8 01 00 00 	lea    r12,[rbx+0x1a8]
  bf5cd8:	48 8d 35 ea 35 75 ff 	lea    rsi,[rip+0xffffffffff7535ea]        # 3492c9 <_ZTSSt12bad_any_cast@@Base-0x46eff>
  bf5cdf:	4c 89 e7             	mov    rdi,r12
  bf5ce2:	e8 b3 c5 91 00       	call   151229a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35781e>
  bf5ce7:	4c 89 ab b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],r13
  bf5cee:	48 8d bb c0 01 00 00 	lea    rdi,[rbx+0x1c0]
  bf5cf5:	6a 01                	push   0x1
  bf5cf7:	5e                   	pop    rsi
  bf5cf8:	e8 57 47 96 00       	call   155a454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39f9d8>
  bf5cfd:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  bf5d00:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
  bf5d05:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
  bf5d0a:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
  bf5d0f:	48 85 c0             	test   rax,rax
  bf5d12:	74 05                	je     bf5d19 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x142cb9>
  bf5d14:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  bf5d19:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  bf5d1c:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  bf5d21:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
  bf5d27:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  bf5d2c:	e8 55 87 ea ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  bf5d31:	4c 8b bb a8 01 00 00 	mov    r15,QWORD PTR [rbx+0x1a8]
  bf5d38:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
  bf5d3c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  bf5d3f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  bf5d44:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  bf5d4a:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
  bf5d4f:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  bf5d54:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
  bf5d57:	0f 57 c0             	xorps  xmm0,xmm0
  bf5d5a:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  bf5d5f:	49 8b 07             	mov    rax,QWORD PTR [r15]
  bf5d62:	4c 89 ff             	mov    rdi,r15
  bf5d65:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
  bf5d6b:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  bf5d70:	e8 11 87 ea ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  bf5d75:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  bf5d7a:	e8 07 87 ea ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  bf5d7f:	49 89 1e             	mov    QWORD PTR [r14],rbx
  bf5d82:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  bf5d89:	00 00
  bf5d8b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
  bf5d90:	0f 85 2a 01 00 00    	jne    bf5ec0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x142e60>
  bf5d96:	4c 89 f0             	mov    rax,r14
  bf5d99:	48 83 c4 48          	add    rsp,0x48
  bf5d9d:	5b                   	pop    rbx
  bf5d9e:	41 5c                	pop    r12
  bf5da0:	41 5d                	pop    r13
  bf5da2:	41 5e                	pop    r14
  bf5da4:	41 5f                	pop    r15
  bf5da6:	5d                   	pop    rbp
  bf5da7:	c3                   	ret
```
### AP `0x18213a8` +0x28 -> `0xcf7e94` score 11

```text
  cf7e94:	55                   	push   rbp
  cf7e95:	41 57                	push   r15
  cf7e97:	41 56                	push   r14
  cf7e99:	41 55                	push   r13
  cf7e9b:	41 54                	push   r12
  cf7e9d:	53                   	push   rbx
  cf7e9e:	48 81 ec 78 01 00 00 	sub    rsp,0x178
  cf7ea5:	49 89 d4             	mov    r12,rdx
  cf7ea8:	49 89 ff             	mov    r15,rdi
  cf7eab:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  cf7eb2:	00 00
  cf7eb4:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
  cf7ebb:	00
  cf7ebc:	0f 10 46 08          	movups xmm0,XMMWORD PTR [rsi+0x8]
  cf7ec0:	48 8b 5e 10          	mov    rbx,QWORD PTR [rsi+0x10]
  cf7ec4:	48 85 db             	test   rbx,rbx
  cf7ec7:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
  cf7ecc:	74 26                	je     cf7ef4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x244e94>
  cf7ece:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  cf7ed3:	0f 10 46 18          	movups xmm0,XMMWORD PTR [rsi+0x18]
  cf7ed7:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
  cf7edc:	0f 10 46 28          	movups xmm0,XMMWORD PTR [rsi+0x28]
  cf7ee0:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  cf7ee4:	0f 10 46 38          	movups xmm0,XMMWORD PTR [rsi+0x38]
  cf7ee8:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  cf7eed:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  cf7ef2:	eb 1a                	jmp    cf7f0e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x244eae>
  cf7ef4:	0f 10 46 18          	movups xmm0,XMMWORD PTR [rsi+0x18]
  cf7ef8:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
  cf7efd:	0f 10 46 28          	movups xmm0,XMMWORD PTR [rsi+0x28]
  cf7f01:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  cf7f05:	0f 10 46 38          	movups xmm0,XMMWORD PTR [rsi+0x38]
  cf7f09:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  cf7f0e:	48 89 df             	mov    rdi,rbx
  cf7f11:	e8 70 65 da ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  cf7f16:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  cf7f1c:	66 49 0f 7e c6       	movq   r14,xmm0
  cf7f21:	49 8b 06             	mov    rax,QWORD PTR [r14]
  cf7f24:	4c 89 f7             	mov    rdi,r14
  cf7f27:	ff 50 10             	call   QWORD PTR [rax+0x10]
  cf7f2a:	89 c5                	mov    ebp,eax
  cf7f2c:	48 8d 05 78 09 6e ff 	lea    rax,[rip+0xffffffffff6e0978]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
  cf7f33:	4c 8d 05 68 09 6e ff 	lea    r8,[rip+0xffffffffff6e0968]        # 3d88a2 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3487>
  cf7f3a:	40 84 ed             	test   bpl,bpl
  cf7f3d:	4c 0f 45 c0          	cmovne r8,rax
  cf7f41:	48 8d 35 34 a0 75 ff 	lea    rsi,[rip+0xffffffffff75a034]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  cf7f48:	48 8d 0d 89 37 64 ff 	lea    rcx,[rip+0xffffffffff643789]        # 33b6d8 <_ZTSSt12bad_any_cast@@Base-0x54af0>
  cf7f4f:	6a 04                	push   0x4
  cf7f51:	5f                   	pop    rdi
  cf7f52:	6a 6c                	push   0x6c
  cf7f54:	5a                   	pop    rdx
  cf7f55:	31 c0                	xor    eax,eax
  cf7f57:	e8 76 e9 ad 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  cf7f5c:	40 84 ed             	test   bpl,bpl
  cf7f5f:	0f 84 f4 00 00 00    	je     cf8059 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x244ff9>
  cf7f65:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
  cf7f6a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  cf7f6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cf7f70:	ff 50 30             	call   QWORD PTR [rax+0x30]
  cf7f73:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
  cf7f77:	8b b0 80 00 00 00    	mov    esi,DWORD PTR [rax+0x80]
  cf7f7d:	e8 bd 6c 8e 00       	call   15dec3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4241c3>
  cf7f82:	48 89 c1             	mov    rcx,rax
  cf7f85:	48 c1 e9 20          	shr    rcx,0x20
  cf7f89:	0f 84 ca 00 00 00    	je     cf8059 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x244ff9>
  cf7f8f:	83 f8 16             	cmp    eax,0x16
  cf7f92:	0f 87 c1 00 00 00    	ja     cf8059 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x244ff9>
  cf7f98:	b9 07 00 41 00       	mov    ecx,0x410007
  cf7f9d:	0f a3 c1             	bt     ecx,eax
  cf7fa0:	0f 83 b3 00 00 00    	jae    cf8059 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x244ff9>
  cf7fa6:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
  cf7fab:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  cf7fae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cf7fb1:	ff 50 20             	call   QWORD PTR [rax+0x20]
  cf7fb4:	48 85 c0             	test   rax,rax
  cf7fb7:	0f 84 9c 00 00 00    	je     cf8059 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x244ff9>
  cf7fbd:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
  cf7fc2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  cf7fc5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  cf7fc8:	ff 50 20             	call   QWORD PTR [rax+0x20]
  cf7fcb:	48 89 c2             	mov    rdx,rax
  cf7fce:	48 83 c2 18          	add    rdx,0x18
  cf7fd2:	48 8b 70 18          	mov    rsi,QWORD PTR [rax+0x18]
  cf7fd6:	48 89 f1             	mov    rcx,rsi
  cf7fd9:	48 83 c1 07          	add    rcx,0x7
  cf7fdd:	40 f6 c6 01          	test   sil,0x1
  cf7fe1:	48 0f 44 ca          	cmove  rcx,rdx
  cf7fe5:	48 63 40 20          	movsxd rax,DWORD PTR [rax+0x20]
  cf7fe9:	48 c1 e0 03          	shl    rax,0x3
  cf7fed:	31 d2                	xor    edx,edx
  cf7fef:	48 8d 35 7a 7a cd 00 	lea    rsi,[rip+0xcd7a7a]        # 19cfa70 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x986b8>
  cf7ff6:	48 39 d0             	cmp    rax,rdx
  cf7ff9:	74 40                	je     cf803b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x244fdb>
  cf7ffb:	48 8b 3c 11          	mov    rdi,QWORD PTR [rcx+rdx*1]
  cf7fff:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
  cf8003:	48 85 ff             	test   rdi,rdi
  cf8006:	49 89 f8             	mov    r8,rdi
  cf8009:	4c 0f 44 c6          	cmove  r8,rsi
  cf800d:	48 83 c2 08          	add    rdx,0x8
  cf8011:	41 83 78 20 02       	cmp    DWORD PTR [r8+0x20],0x2
  cf8016:	75 de                	jne    cf7ff6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x244f96>
  cf8018:	e8 d2 ac 96 00       	call   1662cef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e5b>
  cf801d:	48 85 c0             	test   rax,rax
  cf8020:	74 19                	je     cf803b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x244fdb>
  cf8022:	8b 48 10             	mov    ecx,DWORD PTR [rax+0x10]
  cf8025:	89 8c 24 e0 00 00 00 	mov    DWORD PTR [rsp+0xe0],ecx
  cf802c:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  cf8030:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
  cf8037:	00 00
  cf8039:	eb 0d                	jmp    cf8048 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x244fe8>
  cf803b:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  cf8042:	00
  cf8043:	e8 14 07 e7 ff       	call   b6875c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb56fc>
  cf8048:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  cf804f:	00
  cf8050:	e8 91 2c e7 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
  cf8055:	84 c0                	test   al,al
  cf8057:	74 38                	je     cf8091 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x245031>
  cf8059:	49 83 27 00          	and    QWORD PTR [r15],0x0
  cf805d:	48 89 df             	mov    rdi,rbx
  cf8060:	e8 21 64 da ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  cf8065:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  cf806c:	00 00
  cf806e:	48 3b 84 24 70 01 00 	cmp    rax,QWORD PTR [rsp+0x170]
  cf8075:	00
  cf8076:	0f 85 85 08 00 00    	jne    cf8901 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2458a1>
  cf807c:	4c 89 f8             	mov    rax,r15
  cf807f:	48 81 c4 78 01 00 00 	add    rsp,0x178
  cf8086:	5b                   	pop    rbx
  cf8087:	41 5c                	pop    r12
  cf8089:	41 5d                	pop    r13
  cf808b:	41 5e                	pop    r14
  cf808d:	41 5f                	pop    r15
  cf808f:	5d                   	pop    rbp
  cf8090:	c3                   	ret
```
## Local materializations of selected candidate AP bases

| addr | instruction |
|---:|---|
