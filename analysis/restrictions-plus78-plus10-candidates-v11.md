# Restrictions `+0x78/+0x10` erased-interface candidate table v11

Focus: candidate AP/vtable rows that have both a `+0x78` entry and a `+0x10` entry, to narrow the erased bridge around `e99c96/e99ca7`. Static provenance only.

## Candidate APs with both `+0x78` and `+0x10` entries

| AP base | entry | target | score | note |
|---:|---:|---:|---:|---|
| `0x184d768` | `0x78` | `0x10be91e` | `39` | near restrictions methods |
| `0x1831968` | `0x78` | `0xe992a2` | `36` | near-e99 bridge |
| `0x1831980` | `0x78` | `0xe99368` | `36` | near-e99 bridge |
| `0x184d258` | `0x78` | `0x10b916a` | `36` | near restrictions methods |
| `0x184d010` | `0x78` | `0x10b2ab4` | `35` | near restrictions methods |
| `0x184d4d0` | `0x78` | `0x10ba494` | `34` | near restrictions methods |
| `0x184d650` | `0x78` | `0x10bae58` | `34` | near restrictions methods |
| `0x184d658` | `0x78` | `0x10bae60` | `34` | near restrictions methods |
| `0x184d6f0` | `0x78` | `0x10bcff8` | `34` | near restrictions methods |
| `0x184d6f8` | `0x78` | `0x10bd000` | `34` | near restrictions methods |
| `0x184d748` | `0x78` | `0xaaa9b2` | `34` | near restrictions methods |
| `0x184cd60` | `0x78` | `0xaaac5c` | `33` | near restrictions methods |
| `0x184d648` | `0x78` | `0x10badc4` | `33` | near restrictions methods |
| `0x184d6e8` | `0x78` | `0x10bcff0` | `33` | near restrictions methods |
| `0x184cda0` | `0x78` | `0x10b167c` | `32` | near restrictions methods |
| `0x184d600` | `0x78` | `0x10bac9e` | `32` | near restrictions methods |
| `0x184d608` | `0x78` | `0x10bacd8` | `32` | near restrictions methods |
| `0x184d640` | `0x78` | `0x10bae1e` | `32` | near restrictions methods |
| `0x184d660` | `0x78` | `0x10bae9a` | `32` | near restrictions methods |
| `0x184d750` | `0x78` | `0xaaa9bc` | `32` | near restrictions methods |
| `0x184d7d0` | `0x78` | `0x10bf45e` | `32` | near restrictions methods |
| `0x184d8d8` | `0x78` | `0x10c00e4` | `32` | near restrictions methods |
| `0x1831640` | `0x78` | `0xea6dca` | `31` | near ea785e |
| `0x184d3d0` | `0x78` | `0xaaa9bc` | `31` | near restrictions methods |
| `0x184d5e0` | `0x78` | `0x10bab76` | `31` | near restrictions methods |
| `0x184d628` | `0x78` | `0x10badc4` | `31` | near restrictions methods |
| `0x184d690` | `0x78` | `0x10bb00e` | `31` | near restrictions methods |
| `0x184d6b0` | `0x78` | `0x10bb16e` | `31` | near restrictions methods |
| `0x184d6b8` | `0x78` | `0x10bb258` | `31` | near restrictions methods |
| `0x184d6e0` | `0x78` | `0x10bcfe8` | `31` | near restrictions methods |
| `0x184d718` | `0x78` | `0x10bd010` | `31` | near restrictions methods |
| `0x184d5e8` | `0x78` | `0x10babb0` | `30` | near restrictions methods |
| `0x184d620` | `0x78` | `0x10bad8a` | `30` | near restrictions methods |
| `0x184d630` | `0x78` | `0x10badde` | `30` | near restrictions methods |
| `0x184d638` | `0x78` | `0x10bae18` | `30` | near restrictions methods |
| `0x184d688` | `0x78` | `0x10bb008` | `30` | near restrictions methods |
| `0x184d6d8` | `0x78` | `0x10bcfda` | `30` | near restrictions methods |
| `0x184d700` | `0x78` | `0x10bd004` | `30` | near restrictions methods |
| `0x18f92b8` | `0x78` | `0x174a1b4` | `30` | near restrictions methods |
| `0x184d668` | `0x78` | `0x10baf08` | `29` | near restrictions methods |
| `0x184d758` | `0x78` | `0x174ec6a` | `29` | near restrictions methods |
| `0x184d760` | `0x78` | `0x174f1dc` | `29` | near restrictions methods |
| `0x184d958` | `0x78` | `0x10c0902` | `29` | near restrictions methods |
| `0x1890480` | `0x78` | `0x1635342` | `29` | near-e99 bridge |
| `0x1831a00` | `0x78` | `0xeaaf5c` | `28` | near-e99 bridge |
| `0x18421b0` | `0x78` | `0xfb0282` | `28` | near fd bridge |
| `0x184d390` | `0x78` | `0xaaa9bc` | `28` | near restrictions methods |
| `0x184d450` | `0x78` | `0xabee78` | `28` | near restrictions methods |
| `0x184d490` | `0x78` | `0x10ba3da` | `28` | near restrictions methods |
| `0x184d5d0` | `0x78` | `0x10bab3c` | `28` | near restrictions methods |
| `0x184d5d8` | `0x78` | `0x10ba976` | `28` | near restrictions methods |
| `0x184d5f0` | `0x78` | `0x10bac0a` | `28` | near restrictions methods |
| `0x184d5f8` | `0x78` | `0x10bac44` | `28` | near restrictions methods |
| `0x184d618` | `0x78` | `0x10bad7c` | `28` | near restrictions methods |
| `0x184d6c0` | `0x78` | `0x10bc22a` | `28` | near restrictions methods |
| `0x184d9c8` | `0x78` | `0x10c09c0` | `28` | near restrictions methods |
| `0x185a6b0` | `0x78` | `0x10c01c8` | `28` | near restrictions methods |
| `0x18f9438` | `0x78` | `0x174a1b4` | `28` | near restrictions methods |
| `0x1831620` | `0x78` | `0xea7130` | `27` | near ea785e |
| `0x184cd68` | `0x78` | `0xaaac84` | `27` | near restrictions methods |
| `0x184cfe8` | `0x78` | `0xa50370` | `27` | near restrictions methods |
| `0x184d670` | `0x78` | `0x10baf5c` | `27` | near restrictions methods |
| `0x184d680` | `0x78` | `0x10bb002` | `27` | near restrictions methods |
| `0x184d6a8` | `0x78` | `0x10bb09e` | `27` | near restrictions methods |
| `0x184d708` | `0x78` | `0x10bd008` | `27` | near restrictions methods |
| `0x184d720` | `0x78` | `0x10bd014` | `27` | near restrictions methods |
| `0x184d770` | `0x78` | `0x174ef82` | `27` | near restrictions methods |
| `0x184da30` | `0x78` | `0xa7a004` | `27` | near restrictions methods |
| `0x1831668` | `0x78` | `0xea6e30` | `26` | near ea785e |
| `0x184d060` | `0x78` | `0xa50370` | `26` | near restrictions methods |
| `0x184d410` | `0x78` | `0xaaa9bc` | `26` | near restrictions methods |
| `0x184d610` | `0x78` | `0x10bad36` | `26` | near restrictions methods |
| `0x184d698` | `0x78` | `0x10bb02a` | `26` | near restrictions methods |
| `0x184d6a0` | `0x78` | `0x10bb034` | `26` | near restrictions methods |
| `0x184d710` | `0x78` | `0x10bd00c` | `26` | near restrictions methods |
| `0x184d838` | `0x78` | `0x10bffde` | `26` | near restrictions methods |
| `0x18f9180` | `0x78` | `0x177e390` | `26` | near restrictions methods |
| `0x18315f8` | `0x78` | `0xea70ca` | `25` | near ea785e |
| `0x18319e0` | `0x78` | `0xe9929a` | `25` | near-e99 bridge |
| `0x1831a48` | `0x78` | `0xeabb76` | `25` | near-e99 bridge |
| `0x18420d8` | `0x78` | `0xfd47e6` | `25` | near fd bridge |
| `0x1842120` | `0x78` | `0xfd4a92` | `25` | near fd bridge |
| `0x1842140` | `0x78` | `0xfd4be8` | `25` | near fd bridge |
| `0x184d260` | `0x78` | `0x10b920a` | `25` | near restrictions methods |
| `0x184d6c8` | `0x78` | `0x10bc6aa` | `25` | near restrictions methods |
| `0x18315d8` | `0x78` | `0xea77fa` | `24` | near ea785e |
| `0x18315f0` | `0x78` | `0xea70b6` | `24` | near ea785e |
| `0x184cda8` | `0x78` | `0x10b16a6` | `24` | near restrictions methods |
| `0x184d220` | `0x78` | `0x10b83c2` | `24` | near restrictions methods |
| `0x184d268` | `0x78` | `0x10b9224` | `24` | near restrictions methods |
| `0x184d488` | `0x78` | `0x10ba396` | `24` | near restrictions methods |
| `0x184d898` | `0x78` | `0x10c01c8` | `24` | near restrictions methods |
| `0x184d8a0` | `0x78` | `0x174ec6a` | `24` | near restrictions methods |
| `0x184d8d0` | `0x78` | `0x10c00bc` | `24` | near restrictions methods |
| `0x184d9d0` | `0x78` | `0x9d81d0` | `24` | near restrictions methods |
| `0x184da88` | `0x78` | `0x10c0b66` | `24` | near restrictions methods |
| `0x185a6a8` | `0x78` | `0x10c0192` | `24` | near restrictions methods |
| `0x188bd68` | `0x78` | `0xe99382` | `24` | near-e99 bridge |
| `0x189b338` | `0x78` | `0x10c00bc` | `24` | near restrictions methods |
| `0x18f8af8` | `0x78` | `0x174a1b4` | `24` | near restrictions methods |
| `0x1831938` | `0x78` | `0xe9939c` | `23` | near-e99 bridge |
| `0x1841ed0` | `0x78` | `0xfd37f4` | `23` | near fd bridge |
| `0x1841f20` | `0x78` | `0xfd380a` | `23` | near fd bridge |
| `0x1842070` | `0x78` | `0xfd38d6` | `23` | near fd bridge |
| `0x18423e8` | `0x78` | `0xfb0152` | `23` | near fd bridge |
| `0x184cdb0` | `0x78` | `0x174ec6a` | `23` | near restrictions methods |
| `0x184cf80` | `0x78` | `0x10b29ac` | `23` | near restrictions methods |
| `0x184d1b8` | `0x78` | `0x10b7c50` | `23` | near restrictions methods |
| `0x184d678` | `0x78` | `0x10baf96` | `23` | near restrictions methods |
| `0x184d798` | `0x78` | `0x10be954` | `23` | near restrictions methods |
| `0x184daa0` | `0x78` | `0x10c0c3a` | `23` | near restrictions methods |
| `0x18f8980` | `0x78` | `0x174a1b4` | `23` | near restrictions methods |
| `0x1831530` | `0x78` | `0xea79ea` | `22` | near ea785e |
| `0x1841d18` | `0x78` | `0xfd340e` | `22` | near fd bridge |
| `0x1841f30` | `0x78` | `0xfd23c2` | `22` | near fd bridge |
| `0x18420f8` | `0x78` | `0xfb290e` | `22` | near fd bridge |
| `0x1842168` | `0x78` | `0xfd4dc2` | `22` | near fd bridge |
| `0x1842188` | `0x78` | `0xfaff70` | `22` | near fd bridge |
| `0x184cd20` | `0x78` | `0x10b126c` | `22` | near restrictions methods |
| `0x184cd48` | `0x78` | `0x10b133c` | `22` | near restrictions methods |
| `0x184cf30` | `0x78` | `0x10b223e` | `22` | near restrictions methods |
| `0x184d078` | `0x78` | `0x9d7de0` | `22` | near restrictions methods |
| `0x184d0d8` | `0x78` | `0x10b719a` | `22` | near restrictions methods |
| `0x184d0f0` | `0x78` | `0xa50370` | `22` | near restrictions methods |
| `0x184d228` | `0x78` | `0x10b845a` | `22` | near restrictions methods |
| `0x184d250` | `0x78` | `0x10b9158` | `22` | near restrictions methods |
| `0x184d350` | `0x78` | `0xaaa9bc` | `22` | near restrictions methods |
| `0x18f81e8` | `0x78` | `0x10b16d2` | `22` | near restrictions methods |
| `0x18f8250` | `0x78` | `0x174a1b4` | `22` | near restrictions methods |
| `0x18f8c90` | `0x78` | `0x174a1b4` | `22` | near restrictions methods |
| `0x1841ec8` | `0x78` | `0xfd37ea` | `21` | near fd bridge |
| `0x1842160` | `0x78` | `0xfd4da0` | `21` | near fd bridge |
| `0x18421d8` | `0x78` | `0xfb05dc` | `21` | near fd bridge |
| `0x184d028` | `0x78` | `0x10b3584` | `21` | near restrictions methods |
| `0x184d058` | `0x78` | `0x9d7de0` | `21` | near restrictions methods |
| `0x184d0a0` | `0x78` | `0x10b37d2` | `21` | near restrictions methods |
| `0x184d0d0` | `0x78` | `0x10b718a` | `21` | near restrictions methods |
| `0x184d270` | `0x78` | `0x10b922e` | `21` | near restrictions methods |
| `0x184d4c8` | `0x78` | `0x10ba46a` | `21` | near restrictions methods |
| `0x184d790` | `0x78` | `0x10ae330` | `21` | near restrictions methods |
| `0x184d7c0` | `0x78` | `0x10bec3e` | `21` | near restrictions methods |
| `0x184d828` | `0x78` | `0x10bff40` | `21` | near restrictions methods |
| `0x184d830` | `0x78` | `0x10bff52` | `21` | near restrictions methods |
| `0x184daa8` | `0x78` | `0x10c0c7a` | `21` | near restrictions methods |
| `0x188bdd0` | `0x78` | `0x160d01a` | `21` | near-e99 bridge |
| `0x18f8180` | `0x78` | `0x174a1b4` | `21` | near restrictions methods |
| `0x18f8b60` | `0x78` | `0x10ba434` | `21` | near restrictions methods |
| `0x18f8bc8` | `0x78` | `0x174a1b4` | `21` | near restrictions methods |
| `0x1841f28` | `0x78` | `0xfd3810` | `20` | near fd bridge |
| `0x1842020` | `0x78` | `0xfb2b60` | `20` | near fd bridge |
| `0x1842090` | `0x78` | `0xfd39bc` | `20` | near fd bridge |
| `0x1842138` | `0x78` | `0xfd4bde` | `20` | near fd bridge |
| `0x184d070` | `0x78` | `0x10b3560` | `20` | near restrictions methods |
| `0x184d148` | `0x78` | `0x10b7be4` | `20` | near restrictions methods |
| `0x184d278` | `0x78` | `0x10b9244` | `20` | near restrictions methods |
| `0x184d2e0` | `0x78` | `0x10b97a0` | `20` | near restrictions methods |
| `0x184d358` | `0x78` | `0x174ec6a` | `20` | near restrictions methods |
| `0x184d7c8` | `0x78` | `0x10bf214` | `20` | near restrictions methods |
| `0x184d820` | `0x78` | `0x10bff2c` | `20` | near restrictions methods |
| `0x184d870` | `0x78` | `0x10c01f4` | `20` | near restrictions methods |
| `0x184d950` | `0x78` | `0x10c0872` | `20` | near restrictions methods |
| `0x184d960` | `0x78` | `0x10c094a` | `20` | near restrictions methods |
| `0x184d9d8` | `0x78` | `0x9d7de0` | `20` | near restrictions methods |
| `0x18f8710` | `0x78` | `0x174a1b4` | `20` | near restrictions methods |
| `0x18f8f98` | `0x78` | `0x174a1b4` | `20` | near restrictions methods |
| `0x1831688` | `0x78` | `0xa50370` | `19` | near ea785e |
| `0x1831930` | `0x78` | `0xe9938c` | `19` | near-e99 bridge |
| `0x184ce18` | `0x78` | `0x10b17ba` | `19` | near restrictions methods |
| `0x184d2d8` | `0x78` | `0x10b977e` | `19` | near restrictions methods |
| `0x184d808` | `0x78` | `0xa50370` | `19` | near restrictions methods |
| `0x184d860` | `0x78` | `0x174ec6a` | `19` | near restrictions methods |
| `0x184d9b8` | `0x78` | `0x9d81d0` | `19` | near restrictions methods |
| `0x184dab0` | `0x78` | `0x10c0cba` | `19` | near restrictions methods |
| `0x18f83c8` | `0x78` | `0x174a1b4` | `19` | near restrictions methods |
| `0x18f87f0` | `0x78` | `0x174a1b4` | `19` | near restrictions methods |
| `0x18f88b8` | `0x78` | `0x174a1b4` | `19` | near restrictions methods |
| `0x1831578` | `0x78` | `0xea789c` | `18` | near ea785e |
| `0x1842110` | `0x78` | `0xfd483a` | `18` | near fd bridge |
| `0x1842148` | `0x78` | `0xfd4bf2` | `18` | near fd bridge |
| `0x1842170` | `0x78` | `0xfd4dd4` | `18` | near fd bridge |
| `0x1842350` | `0x78` | `0xfd483a` | `18` | near fd bridge |
| `0x184cc38` | `0x78` | `0x10b0272` | `18` | near restrictions methods |
| `0x184cec8` | `0x78` | `0x10b17f4` | `18` | near restrictions methods |
| `0x184cf28` | `0x78` | `0x10b218a` | `18` | near restrictions methods |
| `0x184d6d0` | `0x78` | `0x10bc716` | `18` | near restrictions methods |
| `0x184d730` | `0x78` | `0x10bd098` | `18` | near restrictions methods |
| `0x184d9c0` | `0x78` | `0xc3aab8` | `18` | near restrictions methods |
| `0x18f8430` | `0x78` | `0x10b177e` | `18` | near restrictions methods |
| `0x18f8498` | `0x78` | `0x174a1b4` | `18` | near restrictions methods |
| `0x18f8e58` | `0x78` | `0x174a1b4` | `18` | near restrictions methods |
| `0x1831978` | `0x78` | `0xe992c8` | `17` | near-e99 bridge |
| `0x1831a30` | `0x78` | `0x9d7de0` | `17` | near-e99 bridge |
| `0x184cc18` | `0x78` | `0x10b025e` | `17` | near restrictions methods |
| `0x184ccf8` | `0x78` | `0x10b0690` | `17` | near restrictions methods |
| `0x184cf78` | `0x78` | `0x10b297c` | `17` | near restrictions methods |
| `0x184cf98` | `0x78` | `0x9d7de0` | `17` | near restrictions methods |
| `0x184d030` | `0x78` | `0xa3fa60` | `17` | near restrictions methods |
| `0x184d560` | `0x78` | `0x10ba7ca` | `17` | near restrictions methods |
| `0x184d728` | `0x78` | `0x10bd038` | `17` | near restrictions methods |
| `0x184d970` | `0x78` | `0x10c09ae` | `17` | near restrictions methods |
| `0x184ccd0` | `0x78` | `0x10b060e` | `16` | near restrictions methods |
| `0x184cec0` | `0x78` | `0x9d7de0` | `16` | near restrictions methods |
| `0x184d180` | `0x78` | `0x9d81d0` | `16` | near restrictions methods |
| `0x184d328` | `0x78` | `0x10ba59a` | `16` | near restrictions methods |
| `0x184d598` | `0x78` | `0x10ba976` | `16` | near restrictions methods |
| `0x184d5a0` | `0x78` | `0x10ba98e` | `16` | near restrictions methods |
| `0x184da98` | `0x78` | `0x10c0bf2` | `16` | near restrictions methods |
| `0x1831970` | `0x78` | `0xe992b6` | `15` | near-e99 bridge |
| `0x1841d10` | `0x78` | `0xfd33ec` | `15` | near fd bridge |
| `0x1842380` | `0x78` | `0xfd4dd4` | `15` | near fd bridge |
| `0x184cd18` | `0x78` | `0x10b120c` | `15` | near restrictions methods |
| `0x184cf50` | `0x78` | `0x10b229c` | `15` | near restrictions methods |
| `0x184cf70` | `0x78` | `0x10b24a8` | `15` | near restrictions methods |
| `0x184cfc0` | `0x78` | `0xa50370` | `15` | near restrictions methods |
| `0x184d068` | `0x78` | `0x10b3540` | `15` | near restrictions methods |
| `0x184d580` | `0x78` | `0x10ba8a6` | `15` | near restrictions methods |
| `0x184d778` | `0x78` | `0x18f8f00` | `15` | near restrictions methods |
| `0x18420e0` | `0x78` | `0xfd4828` | `14` | near fd bridge |
| `0x184ccd8` | `0x78` | `0x10b066e` | `14` | near restrictions methods |
| `0x184d510` | `0x78` | `0x18f85a8` | `14` | near restrictions methods |
| `0x184d588` | `0x78` | `0x10ba8de` | `14` | near restrictions methods |
| `0x184d5a8` | `0x78` | `0x10ba9c6` | `14` | near restrictions methods |
| `0x184daf0` | `0x78` | `0x9d7de0` | `14` | near restrictions methods |
| `0x184db10` | `0x78` | `0x9d7de0` | `14` | near restrictions methods |
| `0x184db88` | `0x78` | `0x1066dbe` | `14` | near restrictions methods |
| `0x184db90` | `0x78` | `0x1066dbe` | `14` | near restrictions methods |
| `0x18a05f8` | `0x78` | `0x10c0192` | `14` | near restrictions methods |
| `0x18f8118` | `0x78` | `0x10b16f4` | `14` | near restrictions methods |
| `0x184cc40` | `0x78` | `0x9d7de0` | `13` | near restrictions methods |
| `0x184cc48` | `0x78` | `0x9d7de0` | `13` | near restrictions methods |
| `0x184cc50` | `0x78` | `0x9d7de0` | `13` | near restrictions methods |
| `0x184cd00` | `0x78` | `0x10b06fc` | `13` | near restrictions methods |
| `0x184ce38` | `0x78` | `0x10b1728` | `13` | near restrictions methods |
| `0x184ce40` | `0x78` | `0x10b1752` | `13` | near restrictions methods |
| `0x184d0e0` | `0x78` | `0x10b71ac` | `13` | near restrictions methods |
| `0x184d590` | `0x78` | `0x10ba93e` | `13` | near restrictions methods |
| `0x184d918` | `0x78` | `0x18f90e0` | `13` | near restrictions methods |
| `0x184db08` | `0x78` | `0x10c0d04` | `13` | near restrictions methods |
| `0x184dc40` | `0x78` | `0xa50370` | `13` | near restrictions methods |
| `0x18a0600` | `0x78` | `0x10c01c8` | `13` | near restrictions methods |
| `0x18f86a8` | `0x78` | `0x10ba5b4` | `13` | near restrictions methods |
| `0x18423b8` | `0x78` | `0xa50370` | `12` | near fd bridge |
| `0x184cce0` | `0x78` | `0x10b0680` | `12` | near restrictions methods |
| `0x184cf20` | `0x78` | `0x10b212a` | `12` | near restrictions methods |
| `0x184cf48` | `0x78` | `0x10b2292` | `12` | near restrictions methods |
| `0x184d0a8` | `0x78` | `0x10b3856` | `12` | near restrictions methods |
| `0x184d280` | `0x78` | `0x351934` | `12` | near restrictions methods |
| `0x184d288` | `0x78` | `0x364126` | `12` | near restrictions methods |
| `0x184d570` | `0x78` | `0x10ba86e` | `12` | near restrictions methods |
| `0x184da90` | `0x78` | `0x10c0bae` | `12` | near restrictions methods |
| `0x184db80` | `0x78` | `0x9d81d0` | `12` | near restrictions methods |
| `0x18f8360` | `0x78` | `0x10b17a0` | `12` | near restrictions methods |
| `0x184cc08` | `0x78` | `0x10b024a` | `11` | near restrictions methods |
| `0x184cc30` | `0x78` | `0x10b0268` | `11` | near restrictions methods |
| `0x184ccf0` | `0x78` | `0xb04950` | `11` | near restrictions methods |
| `0x184cf58` | `0x78` | `0x10b22a6` | `11` | near restrictions methods |
| `0x184d290` | `0x78` | `0x378635` | `11` | near restrictions methods |
| `0x184d298` | `0x78` | `0x359f82` | `11` | near restrictions methods |
| `0x184d2f0` | `0x78` | `0x10b9be6` | `11` | near restrictions methods |
| `0x184dae8` | `0x78` | `0x9d7de0` | `11` | near restrictions methods |
| `0x184daf8` | `0x78` | `0x10c0cfa` | `11` | near restrictions methods |
| `0x184cc10` | `0x78` | `0x10b0254` | `10` | near restrictions methods |
| `0x184d118` | `0x78` | `0x10b7874` | `10` | near restrictions methods |
| `0x184d2c0` | `0x78` | `0x346dd4` | `10` | near restrictions methods |
| `0x184d2e8` | `0x78` | `0x10b97b2` | `10` | near restrictions methods |
| `0x184db00` | `0x78` | `0x9d7de0` | `10` | near restrictions methods |
| `0x184db70` | `0x78` | `0xa50370` | `10` | near restrictions methods |
| `0x184dbb8` | `0x78` | `0xa50370` | `10` | near restrictions methods |
| `0x184cca8` | `0x78` | `0x10b02ae` | `9` | near restrictions methods |
| `0x184ccb8` | `0x78` | `0x10b02b8` | `9` | near restrictions methods |
| `0x184ce80` | `0x78` | `0x18f8320` | `9` | near restrictions methods |
| `0x184cc58` | `0x78` | `0x9d7de0` | `8` | near restrictions methods |
| `0x184db18` | `0x78` | `0x10c0d0e` | `8` | near restrictions methods |
| `0x184dc38` | `0x78` | `0x9d7de0` | `8` | near restrictions methods |
| `0x184db50` | `0x78` | `0x10c0d2c` | `6` | near restrictions methods |
| `0x184cc80` | `0x78` | `0x9d7de0` | `3` | near restrictions methods |
| `0x18745c8` | `0x78` | `0xc5b954` | `76` |  |
| `0x1934bf0` | `0x78` | `0x177e390` | `70` |  |
| `0x18638d0` | `0x78` | `0x12f9f92` | `67` |  |
| `0x187c7d8` | `0x78` | `0x15112b6` | `67` |  |
| `0x1804110` | `0x78` | `0xaafdc2` | `66` |  |
| `0x181a058` | `0x78` | `0xc5b954` | `65` |  |
| `0x1813f60` | `0x78` | `0xafca9c` | `64` |  |
| `0x1863b30` | `0x78` | `0x12f9f92` | `64` |  |
| `0x180c328` | `0x78` | `0xb4f5b0` | `63` |  |
| `0x185b198` | `0x78` | `0x11d5c20` | `62` |  |
| `0x1804108` | `0x78` | `0xaafd96` | `61` |  |
| `0x1803498` | `0x78` | `0xafa646` | `60` |  |
| `0x1827068` | `0x78` | `0xd7dc76` | `60` |  |
| `0x182f388` | `0x78` | `0xe70bba` | `60` |  |
| `0x185b1d8` | `0x78` | `0xada1e4` | `60` |  |
| `0x1863938` | `0x78` | `0x12facf4` | `60` |  |
| `0x1863b98` | `0x78` | `0x12fe0ca` | `60` |  |
| `0x18745d0` | `0x78` | `0x1465a66` | `60` |  |
| `0x18040a8` | `0x78` | `0xb0f1da` | `59` |  |
| `0x187cad8` | `0x78` | `0x1511d0c` | `59` |  |
| `0x185b170` | `0x78` | `0x11d5c14` | `58` |  |
| `0x18745d8` | `0x78` | `0x1465a72` | `58` |  |
| `0x187a590` | `0x78` | `0x14f40a8` | `58` |  |
| `0x1887c40` | `0x78` | `0x15e30d0` | `58` |  |
| `0x1896040` | `0x78` | `0x1653ab0` | `57` |  |
| `0x1803450` | `0x78` | `0xafca9c` | `56` |  |
| `0x185acc0` | `0x78` | `0x11d01d4` | `56` |  |
| `0x18745e0` | `0x78` | `0x145d8de` | `56` |  |
| `0x19d0cf8` | `0x78` | `0x174a1b4` | `56` |  |
| `0x18040a0` | `0x78` | `0xb0f1ce` | `55` |  |
| `0x1825678` | `0x78` | `0x15e3be4` | `55` |  |
| `0x182f3f0` | `0x78` | `0x9d7de0` | `55` |  |
| `0x182f460` | `0x78` | `0xe70bba` | `55` |  |
| `0x18328d8` | `0x78` | `0xec05d0` | `55` |  |
| `0x1814208` | `0x78` | `0xaec4f2` | `54` |  |
| `0x1819fd8` | `0x78` | `0xc5b954` | `54` |  |
| `0x1819fe0` | `0x78` | `0xc5b964` | `54` |  |
| `0x1867678` | `0x78` | `0x1357650` | `54` |  |
| `0x187a5f8` | `0x78` | `0xa50370` | `54` |  |
| `0x1887c38` | `0x78` | `0x15e2ef0` | `54` |  |
| `0x19d0448` | `0x78` | `0x174a1b4` | `54` |  |
| `0x1800f48` | `0x78` | `0xad73da` | `53` |  |
| `0x1804100` | `0x78` | `0xaafd84` | `53` |  |
| `0x1819ad8` | `0x78` | `0xc59064` | `53` |  |
| `0x1826ff8` | `0x78` | `0xd89c66` | `53` |  |
| `0x1827000` | `0x78` | `0xd89c86` | `53` |  |
| `0x1800f30` | `0x78` | `0xad73c2` | `52` |  |
| `0x18034b8` | `0x78` | `0xafd48a` | `52` |  |
| `0x1803530` | `0x78` | `0xafdfda` | `52` |  |
| `0x1813788` | `0x78` | `0xbf858c` | `52` |  |
| `0x1813fc8` | `0x78` | `0xbff406` | `52` |  |
| `0x185b1a8` | `0x78` | `0xf5c83a` | `52` |  |
| `0x1884240` | `0x78` | `0x15ae08a` | `52` |  |
| `0x18d2330` | `0x78` | `0xc09dc0` | `52` |  |
| `0x18d2398` | `0x78` | `0x174a1b4` | `52` |  |
| `0x1935da8` | `0x78` | `0x174a1b4` | `52` |  |
| `0x19a4818` | `0x78` | `0x174a1b4` | `52` |  |
| `0x19af6e0` | `0x78` | `0x174a1b4` | `52` |  |
| `0x17fdfc8` | `0x78` | `0x15e3be4` | `51` |  |
| `0x1806a68` | `0x78` | `0xb1e6fa` | `51` |  |
| `0x1819b30` | `0x78` | `0xaa8e00` | `51` |  |
| `0x1827060` | `0x78` | `0xa50370` | `51` |  |
| `0x182bcc8` | `0x78` | `0x15e3be4` | `51` |  |
| `0x185b200` | `0x78` | `0x3da9f4` | `51` |  |
| `0x185d9c8` | `0x78` | `0x123a2f0` | `51` |  |
| `0x185d9d0` | `0x78` | `0x123a2fe` | `51` |  |
| `0x185da00` | `0x78` | `0x123a31a` | `51` |  |
| `0x185da08` | `0x78` | `0x123a328` | `51` |  |
| `0x1867658` | `0x78` | `0x1357620` | `51` |  |
| `0x186f768` | `0x78` | `0x141a1e2` | `51` |  |
| `0x1874560` | `0x78` | `0x1465908` | `51` |  |
| `0x1874578` | `0x78` | `0x146592c` | `51` |  |
| `0x19d0870` | `0x78` | `0x174a1b4` | `51` |  |
| `0x1804098` | `0x78` | `0xb0f1c2` | `50` |  |
| `0x1819fe8` | `0x78` | `0xc5b970` | `50` |  |
| `0x1828ab8` | `0x78` | `0xda8ba8` | `50` |  |
| `0x185ad00` | `0x78` | `0xf5c83a` | `50` |  |
| `0x1874948` | `0x78` | `0x1467cd6` | `50` |  |
| `0x187ed48` | `0x78` | `0xf5c83a` | `50` |  |
| `0x1887c30` | `0x78` | `0x15e2ede` | `50` |  |
| `0x18963a8` | `0x78` | `0x1653ab0` | `50` |  |
| `0x18a3b60` | `0x78` | `0xaaa9bc` | `50` |  |
| `0x18b1158` | `0x78` | `0xa92fe0` | `50` |  |
| `0x1828478` | `0x78` | `0xd9ecec` | `49` |  |
| `0x1837958` | `0x78` | `0xf0bbd0` | `49` |  |
| `0x18383a8` | `0x78` | `0xf1273e` | `49` |  |
| `0x185b140` | `0x78` | `0x11d5bf0` | `49` |  |
| `0x185cba0` | `0x78` | `0xc5b954` | `49` |  |
| `0x185ea38` | `0x78` | `0x125cab4` | `49` |  |
| `0x1867698` | `0x78` | `0xf5c83a` | `49` |  |
| `0x18676d8` | `0x78` | `0xd8e668` | `49` |  |
| `0x186f778` | `0x78` | `0x141a24c` | `49` |  |
| `0x187ed50` | `0x78` | `0x123bb26` | `49` |  |
| `0x189d790` | `0x78` | `0x16a7888` | `49` |  |
| `0x18a9258` | `0x78` | `0xaaa9b2` | `49` |  |
| `0x19d1858` | `0x78` | `0x174a1b4` | `49` |  |
| `0x180dc98` | `0x78` | `0xb89634` | `48` |  |
| `0x181a0c0` | `0x78` | `0xc5d6c6` | `48` |  |
| `0x185ac40` | `0x78` | `0x11d01be` | `48` |  |
| `0x185ac98` | `0x78` | `0xc5b954` | `48` |  |
| `0x185d2b0` | `0x78` | `0x122cb70` | `48` |  |
| `0x185d2b8` | `0x78` | `0x122cb78` | `48` |  |
| `0x185d2c0` | `0x78` | `0x122cb80` | `48` |  |
| `0x185d2c8` | `0x78` | `0x122cb88` | `48` |  |
| `0x185d2d0` | `0x78` | `0x122cb90` | `48` |  |
| `0x185d2f8` | `0x78` | `0x122cbb8` | `48` |  |
| `0x185d300` | `0x78` | `0x122cbc0` | `48` |  |
| `0x185d7e8` | `0x78` | `0x122df24` | `48` |  |
| `0x185d8e0` | `0x78` | `0x122e140` | `48` |  |
| `0x185da30` | `0x78` | `0x123a344` | `48` |  |
| `0x185da38` | `0x78` | `0x123a352` | `48` |  |
| `0x185da40` | `0x78` | `0x123a360` | `48` |  |
| `0x185da68` | `0x78` | `0x123a3a6` | `48` |  |
| `0x185da70` | `0x78` | `0x123a3b4` | `48` |  |
| `0x185da78` | `0x78` | `0x123a3c2` | `48` |  |
| `0x1863b00` | `0x78` | `0x12f9e18` | `48` |  |
| `0x1867660` | `0x78` | `0x135762c` | `48` |  |
| `0x1867668` | `0x78` | `0x1357638` | `48` |  |
| `0x1874950` | `0x78` | `0x1467cea` | `48` |  |
| `0x18842c0` | `0x78` | `0x15add80` | `48` |  |
| `0x18a8938` | `0x78` | `0x16d2f78` | `48` |  |
| `0x18b0b10` | `0x78` | `0xa82597` | `48` |  |
| `0x18b0b18` | `0x78` | `0xa825ad` | `48` |  |
| `0x18d63a8` | `0x78` | `0xc2af8c` | `48` |  |
| `0x1800f98` | `0x78` | `0xad695a` | `47` |  |
| `0x18040f8` | `0x78` | `0xaafd6c` | `47` |  |
| `0x181a048` | `0x78` | `0xc5bccc` | `47` |  |
| `0x1830cc8` | `0x78` | `0xe854f6` | `47` |  |
| `0x18378f0` | `0x78` | `0xf0a92a` | `47` |  |
| `0x1837a28` | `0x78` | `0xf09782` | `47` |  |
| `0x1859078` | `0x78` | `0x11a65f2` | `47` |  |
| `0x185a918` | `0x78` | `0x11d52d0` | `47` |  |
| `0x185c2a0` | `0x78` | `0x120be70` | `47` |  |
| `0x185d2a0` | `0x78` | `0x122cb5a` | `47` |  |
| `0x185d2a8` | `0x78` | `0x122cb62` | `47` |  |
| `0x185d2e8` | `0x78` | `0x122cba8` | `47` |  |
| `0x185d2f0` | `0x78` | `0x122cbb0` | `47` |  |
| `0x185d308` | `0x78` | `0x122cbc8` | `47` |  |
| `0x185d310` | `0x78` | `0x122cbd0` | `47` |  |
| `0x185d7e0` | `0x78` | `0x122df0c` | `47` |  |
| `0x185d7f0` | `0x78` | `0x122df28` | `47` |  |
| `0x185d8e8` | `0x78` | `0x122e158` | `47` |  |
| `0x185d960` | `0x78` | `0x123a2a6` | `47` |  |
| `0x185da98` | `0x78` | `0x123a3fa` | `47` |  |
| `0x185daa0` | `0x78` | `0x123a408` | `47` |  |
| `0x1867670` | `0x78` | `0x1357644` | `47` |  |
| `0x1873bb0` | `0x78` | `0xabea04` | `47` |  |
| `0x1874630` | `0x78` | `0x145df8c` | `47` |  |
| `0x1874840` | `0x78` | `0x1466ff4` | `47` |  |
| `0x187ece8` | `0x78` | `0xc5b954` | `47` |  |
| `0x18a0a38` | `0x78` | `0x174ec6a` | `47` |  |
| `0x18a2678` | `0x78` | `0x174ec6a` | `47` |  |
| `0x18b0ab8` | `0x78` | `0xa82472` | `47` |  |
| `0x1934d18` | `0x78` | `0x177e390` | `47` |  |
| `0x199bd60` | `0x78` | `0x16ad97e` | `47` |  |
| `0x19d03e0` | `0x78` | `0x16d30dc` | `47` |  |
| `0x19d1428` | `0x78` | `0x174a1b4` | `47` |  |
| `0x1803448` | `0x78` | `0xafca90` | `46` |  |
| `0x18034b0` | `0x78` | `0xafd43e` | `46` |  |
| `0x1803528` | `0x78` | `0xa50370` | `46` |  |
| `0x180dc90` | `0x78` | `0xb8962c` | `46` |  |
| `0x180dcb0` | `0x78` | `0xb89664` | `46` |  |
| `0x180de38` | `0x78` | `0xb88a58` | `46` |  |
| `0x1810750` | `0x78` | `0xbbb10c` | `46` |  |
| `0x1810948` | `0x78` | `0xbbb10c` | `46` |  |
| `0x1810a20` | `0x78` | `0xbbb10c` | `46` |  |
| `0x1810d38` | `0x78` | `0xbbb10c` | `46` |  |
| `0x1810dc8` | `0x78` | `0xbbb10c` | `46` |  |
| `0x1810e18` | `0x78` | `0xbbb10c` | `46` |  |
| `0x1811018` | `0x78` | `0xbbb736` | `46` |  |
| `0x1811148` | `0x78` | `0xbbb10c` | `46` |  |
| `0x1811200` | `0x78` | `0xbbb10c` | `46` |  |
| `0x1811300` | `0x78` | `0xbbb10c` | `46` |  |
| `0x1811368` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18113c8` | `0x78` | `0xbbb10c` | `46` |  |
| `0x1813f48` | `0x78` | `0xafa63e` | `46` |  |
| `0x1814d80` | `0x78` | `0xc09d94` | `46` |  |
| `0x181ff70` | `0x78` | `0xb89270` | `46` |  |
| `0x1827010` | `0x78` | `0xd89c92` | `46` |  |
| `0x185cc08` | `0x78` | `0x12244b8` | `46` |  |
| `0x185d298` | `0x78` | `0x122cb52` | `46` |  |
| `0x185d318` | `0x78` | `0x122cbd8` | `46` |  |
| `0x185d7f8` | `0x78` | `0x122df40` | `46` |  |
| `0x185d800` | `0x78` | `0x122df44` | `46` |  |
| `0x185d808` | `0x78` | `0x122df5c` | `46` |  |
| `0x185d818` | `0x78` | `0x122df78` | `46` |  |
| `0x185d828` | `0x78` | `0x122df94` | `46` |  |
| `0x185d8f0` | `0x78` | `0x122e15c` | `46` |  |
| `0x185daa8` | `0x78` | `0x123a416` | `46` |  |
| `0x1867630` | `0x78` | `0x13575ca` | `46` |  |
| `0x18676c0` | `0x78` | `0xd9df7c` | `46` |  |
| `0x186b7c0` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186b870` | `0x78` | `0xbbb757` | `46` |  |
| `0x186bb98` | `0x78` | `0xbbb643` | `46` |  |
| `0x186bc28` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186bc88` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186bde8` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186be18` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186be48` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186be78` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186bf38` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186bf68` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186bfa8` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186c010` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186c070` | `0x78` | `0xbbb757` | `46` |  |
| `0x186c0d0` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186c290` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186c368` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186c400` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186c410` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186c508` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186c5a8` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186c610` | `0x78` | `0xbbb736` | `46` |  |
| `0x186c678` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186c6b0` | `0x78` | `0xbbb10c` | `46` |  |
| `0x186c6d8` | `0x78` | `0xbbb10c` | `46` |  |
| `0x1870a30` | `0x78` | `0x142d434` | `46` |  |
| `0x18748e8` | `0x78` | `0x14670d2` | `46` |  |
| `0x1874930` | `0x78` | `0x1466674` | `46` |  |
| `0x1878520` | `0x78` | `0x1563810` | `46` |  |
| `0x1880da8` | `0x78` | `0x1563810` | `46` |  |
| `0x188a860` | `0x78` | `0xd1b904` | `46` |  |
| `0x18925f0` | `0x78` | `0x163f746` | `46` |  |
| `0x18ac2f8` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18ac358` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18ac360` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18ac3f0` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18ac460` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18ac498` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18ac520` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18ac558` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18ac570` | `0x78` | `0xbbb736` | `46` |  |
| `0x18ac6c8` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18ac840` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18aca20` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18acb90` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18acbb0` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18acbb8` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18acbf8` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18acc30` | `0x78` | `0xbbb1ec` | `46` |  |
| `0x18acc68` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18acd58` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18acfa8` | `0x78` | `0xbbb757` | `46` |  |
| `0x18acfd8` | `0x78` | `0xbbb91f` | `46` |  |
| `0x18ad008` | `0x78` | `0xbbb10c` | `46` |  |
| `0x18ad098` | `0x78` | `0xbbb643` | `46` |  |
| `0x18b0a38` | `0x78` | `0xa822be` | `46` |  |
| `0x18b0aa0` | `0x78` | `0xa82430` | `46` |  |
| `0x18b0b08` | `0x78` | `0xa82581` | `46` |  |
| `0x199c230` | `0x78` | `0x16ad956` | `46` |  |
| `0x1800fb0` | `0x78` | `0xad6994` | `45` |  |
| `0x1804090` | `0x78` | `0xb0f1b6` | `45` |  |
| `0x1809488` | `0x78` | `0xb328f0` | `45` |  |
| `0x180ddd0` | `0x78` | `0xb89270` | `45` |  |
| `0x1810500` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1810538` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x1810638` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18106a8` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1810708` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1810710` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x1810778` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1810840` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18108a0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18108a8` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18108b0` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1810978` | `0x78` | `0xbbb93c` | `45` |  |
| `0x1810aa0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x1810b08` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1810b28` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1810c08` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1810c28` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1810c90` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x1810cc0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x1810d88` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1810f10` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x1810f78` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1810fe0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x1810fe8` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1811030` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1811060` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1811080` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18110d0` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18110e8` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1811158` | `0x78` | `0xbbb904` | `45` |  |
| `0x18111c0` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1811238` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18112c8` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1811308` | `0x78` | `0xbbb10c` | `45` |  |
| `0x1811390` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18113d0` | `0x78` | `0xbbbc3e` | `45` |  |
| `0x1818688` | `0x78` | `0xc449fe` | `45` |  |
| `0x1819ff0` | `0x78` | `0xc5b97c` | `45` |  |
| `0x18213a8` | `0x78` | `0xcf8cb0` | `45` |  |
| `0x182c350` | `0x78` | `0xaaa9bc` | `45` |  |
| `0x1830088` | `0x78` | `0xe7b0a2` | `45` |  |
| `0x183b748` | `0x78` | `0xfb0282` | `45` |  |
| `0x1859110` | `0x78` | `0x11a7cb2` | `45` |  |
| `0x185c918` | `0x78` | `0x121574a` | `45` |  |
| `0x185d280` | `0x78` | `0x122cb3a` | `45` |  |
| `0x185d288` | `0x78` | `0x122cb42` | `45` |  |
| `0x185d328` | `0x78` | `0x122cbe8` | `45` |  |
| `0x185d7d8` | `0x78` | `0x122df08` | `45` |  |
| `0x185d810` | `0x78` | `0x122df60` | `45` |  |
| `0x185d840` | `0x78` | `0x122dfde` | `45` |  |
| `0x185d878` | `0x78` | `0x122e094` | `45` |  |
| `0x185d880` | `0x78` | `0x122e098` | `45` |  |
| `0x185d890` | `0x78` | `0x122e0b4` | `45` |  |
| `0x185d8a8` | `0x78` | `0x122e0e8` | `45` |  |
| `0x185d8d8` | `0x78` | `0x122e13c` | `45` |  |
| `0x185d968` | `0x78` | `0x123a2b0` | `45` |  |
| `0x185da48` | `0x78` | `0x123a36e` | `45` |  |
| `0x1869138` | `0x78` | `0xe70c90` | `45` |  |
| `0x186b768` | `0x78` | `0xbbb10c` | `45` |  |
| `0x186b778` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x186b888` | `0x78` | `0xbbb665` | `45` |  |
| `0x186b960` | `0x78` | `0xbbb91f` | `45` |  |
| `0x186b9b0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x186ba38` | `0x78` | `0xbbb783` | `45` |  |
| `0x186bb28` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x186bb48` | `0x78` | `0xbbb20a` | `45` |  |
| `0x186bb68` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x186bb80` | `0x78` | `0xbbb704` | `45` |  |
| `0x186bba8` | `0x78` | `0xbbb1ca` | `45` |  |
| `0x186bbc0` | `0x78` | `0xbbb10c` | `45` |  |
| `0x186bcd8` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x186bd30` | `0x78` | `0xbbb10c` | `45` |  |
| `0x186bd40` | `0x78` | `0xbbb10c` | `45` |  |
| `0x186bd80` | `0x78` | `0xbbb10c` | `45` |  |
| `0x186bda0` | `0x78` | `0xbbb904` | `45` |  |
| `0x186bdb0` | `0x78` | `0xbbb10c` | `45` |  |
| `0x186beb0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x186c088` | `0x78` | `0xbbb665` | `45` |  |
| `0x186c190` | `0x78` | `0xbbb93c` | `45` |  |
| `0x186c2b8` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x186c320` | `0x78` | `0xbbb10c` | `45` |  |
| `0x186c348` | `0x78` | `0xbbb20a` | `45` |  |
| `0x186c3a8` | `0x78` | `0xbbb1ca` | `45` |  |
| `0x186c3d8` | `0x78` | `0xbbb10c` | `45` |  |
| `0x186c518` | `0x78` | `0xbbb10c` | `45` |  |
| `0x186c530` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x186c5a0` | `0x78` | `0xbbb904` | `45` |  |
| `0x186c690` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x186c6a0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x186c6e0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x1873b48` | `0x78` | `0x145bfa2` | `45` |  |
| `0x1876348` | `0x78` | `0xaaa9bc` | `45` |  |
| `0x1878518` | `0x78` | `0x1563800` | `45` |  |
| `0x1880da0` | `0x78` | `0x1563800` | `45` |  |
| `0x1881110` | `0x78` | `0x1568aec` | `45` |  |
| `0x1894578` | `0x78` | `0xc475e8` | `45` |  |
| `0x1895c90` | `0x78` | `0x165351a` | `45` |  |
| `0x18ac3a0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18ac410` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18ac468` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18ac4a8` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18ac4b8` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18ac4f8` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18ac500` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18ac508` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18ac528` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18ac5d8` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18ac6e8` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18ac7a0` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18ac7a8` | `0x78` | `0xbbb757` | `45` |  |
| `0x18ac818` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18ac898` | `0x78` | `0xbbb643` | `45` |  |
| `0x18ac900` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18ac908` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18ac928` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18ac950` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18ac9b8` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18acaa0` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18acab0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18acac0` | `0x78` | `0xbbb904` | `45` |  |
| `0x18acad8` | `0x78` | `0xbbb597` | `45` |  |
| `0x18acb28` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18acbe0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18acc10` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18accb8` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18aced8` | `0x78` | `0xbbb20a` | `45` |  |
| `0x18acf28` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18acf40` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18ad030` | `0x78` | `0xbbb10c` | `45` |  |
| `0x18ad0d0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18ad100` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18ad1c0` | `0x78` | `0xbbb0f4` | `45` |  |
| `0x18b0a40` | `0x78` | `0xa822d4` | `45` |  |
| `0x18b0a48` | `0x78` | `0xa822ea` | `45` |  |
| `0x18b0a50` | `0x78` | `0xa82318` | `45` |  |
| `0x18b0aa8` | `0x78` | `0xa82446` | `45` |  |
| `0x18b0ab0` | `0x78` | `0xa8245c` | `45` |  |
| `0x18b0ac0` | `0x78` | `0xa82488` | `45` |  |
| `0x18b0af8` | `0x78` | `0xa82522` | `45` |  |
| `0x18b0b00` | `0x78` | `0xa82538` | `45` |  |
| `0x18b0b20` | `0x78` | `0xa825c3` | `45` |  |
| `0x18b11c0` | `0x78` | `0xa937d6` | `45` |  |
| `0x18d62d8` | `0x78` | `0xc2b214` | `45` |  |
| `0x19328a0` | `0x78` | `0x1510098` | `45` |  |
| `0x19b87d0` | `0x78` | `0x174a1b4` | `45` |  |
| `0x1801510` | `0x78` | `0xac0a52` | `44` |  |
| `0x1803430` | `0x78` | `0xafa646` | `44` |  |
| `0x1809908` | `0x78` | `0x15e3be4` | `44` |  |
| `0x180dd08` | `0x78` | `0xb7d28a` | `44` |  |
| `0x1810480` | `0x78` | `0xbbb1ec` | `44` |  |
| `0x1810488` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18104d0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810568` | `0x78` | `0xbbb359` | `44` |  |
| `0x1810590` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810598` | `0x78` | `0xbbb121` | `44` |  |
| `0x18105a8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18105d0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810610` | `0x78` | `0xbbb121` | `44` |  |
| `0x18106a0` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810700` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810768` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810788` | `0x78` | `0xbbb618` | `44` |  |
| `0x1810790` | `0x78` | `0xbbb121` | `44` |  |
| `0x18107c0` | `0x78` | `0xbbb643` | `44` |  |
| `0x18107e0` | `0x78` | `0xbbb121` | `44` |  |
| `0x18107e8` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810808` | `0x78` | `0xbbb6eb` | `44` |  |
| `0x1810838` | `0x78` | `0xbbb757` | `44` |  |
| `0x1810850` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x18108c0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18108e0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810910` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810918` | `0x78` | `0xbbb121` | `44` |  |
| `0x1810958` | `0x78` | `0xbbb904` | `44` |  |
| `0x18109b8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810a00` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810a08` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810a50` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810ab0` | `0x78` | `0xbbb121` | `44` |  |
| `0x1810b68` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810b78` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810b90` | `0x78` | `0xbbb121` | `44` |  |
| `0x1810bc0` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810bc8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810bd0` | `0x78` | `0xbbbc3e` | `44` |  |
| `0x1810be0` | `0x78` | `0xbbb121` | `44` |  |
| `0x1810c50` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810c78` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810c80` | `0x78` | `0xbbb1ec` | `44` |  |
| `0x1810cd0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810da0` | `0x78` | `0xbbb121` | `44` |  |
| `0x1810db0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810e10` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810e78` | `0x78` | `0xbbb121` | `44` |  |
| `0x1810e88` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810f60` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810f88` | `0x78` | `0xbbb618` | `44` |  |
| `0x1810f90` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810fa0` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1810fb0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1810fc0` | `0x78` | `0xbbb643` | `44` |  |
| `0x1810fc8` | `0x78` | `0xbbb665` | `44` |  |
| `0x1810ff8` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1811020` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1811038` | `0x78` | `0xbbb757` | `44` |  |
| `0x1811048` | `0x78` | `0xbbb783` | `44` |  |
| `0x1811050` | `0x78` | `0xbbb121` | `44` |  |
| `0x1811098` | `0x78` | `0xbbb121` | `44` |  |
| `0x18110a0` | `0x78` | `0xbbb121` | `44` |  |
| `0x18110a8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18110d8` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x18110e0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18110f8` | `0x78` | `0xbbb121` | `44` |  |
| `0x1811150` | `0x78` | `0xbbb683` | `44` |  |
| `0x1811160` | `0x78` | `0xbbb91f` | `44` |  |
| `0x18111b8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18111d0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18111f8` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1811228` | `0x78` | `0xbbbaaf` | `44` |  |
| `0x1811250` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1811260` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1811268` | `0x78` | `0xbbb121` | `44` |  |
| `0x18112a0` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x18112a8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18112f0` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1811328` | `0x78` | `0xbbb10c` | `44` |  |
| `0x1811380` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18113b8` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x1819598` | `0x78` | `0xaa8e00` | `44` |  |
| `0x181ed08` | `0x78` | `0xabe9e4` | `44` |  |
| `0x1832578` | `0x78` | `0xebb7f8` | `44` |  |
| `0x18326e0` | `0x78` | `0xeb476a` | `44` |  |
| `0x18379c0` | `0x78` | `0xf0c9ae` | `44` |  |
| `0x1842fc0` | `0x78` | `0xfe41f8` | `44` |  |
| `0x1843030` | `0x78` | `0xfe41f8` | `44` |  |
| `0x1848048` | `0x78` | `0x105c996` | `44` |  |
| `0x1849a78` | `0x78` | `0xac0a20` | `44` |  |
| `0x184ea90` | `0x78` | `0x10d4dee` | `44` |  |
| `0x184fca8` | `0x78` | `0x10ed096` | `44` |  |
| `0x1852858` | `0x78` | `0xbf5556` | `44` |  |
| `0x1854b30` | `0x78` | `0x1146dc2` | `44` |  |
| `0x18576b8` | `0x78` | `0x1184c70` | `44` |  |
| `0x1859098` | `0x78` | `0x11a65c6` | `44` |  |
| `0x185a9f0` | `0x78` | `0x11d0120` | `44` |  |
| `0x185acb8` | `0x78` | `0x11d01d4` | `44` |  |
| `0x185c920` | `0x78` | `0x121575a` | `44` |  |
| `0x185d320` | `0x78` | `0x122cbe0` | `44` |  |
| `0x185d330` | `0x78` | `0x122cbf0` | `44` |  |
| `0x185d338` | `0x78` | `0x122cbf8` | `44` |  |
| `0x185d340` | `0x78` | `0x122cc00` | `44` |  |
| `0x185d830` | `0x78` | `0x122df98` | `44` |  |
| `0x185d888` | `0x78` | `0x122e0b0` | `44` |  |
| `0x185d898` | `0x78` | `0x122e0cc` | `44` |  |
| `0x185dab0` | `0x78` | `0x123a424` | `44` |  |
| `0x18676c8` | `0x78` | `0x9d81d0` | `44` |  |
| `0x18676d0` | `0x78` | `0x9d81d0` | `44` |  |
| `0x186b7b0` | `0x78` | `0xbbb121` | `44` |  |
| `0x186b7b8` | `0x78` | `0xbbb121` | `44` |  |
| `0x186b7d0` | `0x78` | `0xbbb56d` | `44` |  |
| `0x186b7f8` | `0x78` | `0xbbb98a` | `44` |  |
| `0x186b820` | `0x78` | `0xbbb1ec` | `44` |  |
| `0x186b828` | `0x78` | `0xbbb140` | `44` |  |
| `0x186b880` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186b8d0` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186b8d8` | `0x78` | `0xbbb140` | `44` |  |
| `0x186b8f8` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186b930` | `0x78` | `0xbbb5b1` | `44` |  |
| `0x186b9d0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186ba08` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186baa8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186bac8` | `0x78` | `0xbbb683` | `44` |  |
| `0x186bb30` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186bb58` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186bbd8` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186bc10` | `0x78` | `0xbbb121` | `44` |  |
| `0x186bc40` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186bc70` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186bc90` | `0x78` | `0xbbb7d6` | `44` |  |
| `0x186bcf8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186bd08` | `0x78` | `0xbbb121` | `44` |  |
| `0x186bd18` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186bd38` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186bd88` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186bd98` | `0x78` | `0xbbb6eb` | `44` |  |
| `0x186be80` | `0x78` | `0xbbbaaf` | `44` |  |
| `0x186bf00` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186bf98` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186bfa0` | `0x78` | `0xbbb121` | `44` |  |
| `0x186bfd0` | `0x78` | `0xbbb56d` | `44` |  |
| `0x186c000` | `0x78` | `0xbbb121` | `44` |  |
| `0x186c008` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186c060` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186c068` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186c0b0` | `0x78` | `0xbbbc3e` | `44` |  |
| `0x186c0c8` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186c0d8` | `0x78` | `0xbbb140` | `44` |  |
| `0x186c160` | `0x78` | `0xbbb91f` | `44` |  |
| `0x186c1d0` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186c228` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186c238` | `0x78` | `0xbbb783` | `44` |  |
| `0x186c2c8` | `0x78` | `0xbbb683` | `44` |  |
| `0x186c3a0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186c480` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x186c488` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186c490` | `0x78` | `0xbbb7d6` | `44` |  |
| `0x186c4d8` | `0x78` | `0xbbb121` | `44` |  |
| `0x186c538` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186c540` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186c580` | `0x78` | `0xbbb121` | `44` |  |
| `0x186c600` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186c648` | `0x78` | `0xbbb10c` | `44` |  |
| `0x186ed50` | `0x78` | `0x13f581a` | `44` |  |
| `0x186f170` | `0x78` | `0x13f9490` | `44` |  |
| `0x186f788` | `0x78` | `0x141a2a2` | `44` |  |
| `0x18701f8` | `0x78` | `0x1344bc8` | `44` |  |
| `0x1870268` | `0x78` | `0x123a38a` | `44` |  |
| `0x18721c8` | `0x78` | `0x1450836` | `44` |  |
| `0x1874568` | `0x78` | `0x1465914` | `44` |  |
| `0x1877f40` | `0x78` | `0xaa8e00` | `44` |  |
| `0x1887ca8` | `0x78` | `0x15e3b1c` | `44` |  |
| `0x1887d48` | `0x78` | `0xaaa9bc` | `44` |  |
| `0x1893b48` | `0x78` | `0x1650096` | `44` |  |
| `0x189b018` | `0x78` | `0x16a2e6a` | `44` |  |
| `0x18ac320` | `0x78` | `0xbbb121` | `44` |  |
| `0x18ac330` | `0x78` | `0xbbb121` | `44` |  |
| `0x18ac338` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac388` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac3c0` | `0x78` | `0xbbb5e3` | `44` |  |
| `0x18ac3d0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac3e0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac3f8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac400` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac438` | `0x78` | `0xbbb121` | `44` |  |
| `0x18ac490` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac588` | `0x78` | `0xbbb121` | `44` |  |
| `0x18ac5c0` | `0x78` | `0xbbb6eb` | `44` |  |
| `0x18ac5f0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac688` | `0x78` | `0xbbb121` | `44` |  |
| `0x18ac6f0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac730` | `0x78` | `0xbbb56d` | `44` |  |
| `0x18ac740` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x18ac758` | `0x78` | `0xbbb121` | `44` |  |
| `0x18ac798` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac7d8` | `0x78` | `0xbbb91f` | `44` |  |
| `0x18ac800` | `0x78` | `0xbbb121` | `44` |  |
| `0x18ac810` | `0x78` | `0xbbb82d` | `44` |  |
| `0x18ac830` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x18ac878` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac8a0` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18ac8a8` | `0x78` | `0xbbb121` | `44` |  |
| `0x18ac8d8` | `0x78` | `0xbbb359` | `44` |  |
| `0x18ac8e0` | `0x78` | `0xbbb121` | `44` |  |
| `0x18ac990` | `0x78` | `0xbbb121` | `44` |  |
| `0x18ac9c0` | `0x78` | `0xbbb121` | `44` |  |
| `0x18aca48` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18aca50` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18aca98` | `0x78` | `0xbbb683` | `44` |  |
| `0x18acaa8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18acaf8` | `0x78` | `0xbbb0f4` | `44` |  |
| `0x18acb00` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18acb10` | `0x78` | `0xbbb121` | `44` |  |
| `0x18acb68` | `0x78` | `0xbbb121` | `44` |  |
| `0x18acb78` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18acbc8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18acc60` | `0x78` | `0xbbb121` | `44` |  |
| `0x18accc8` | `0x78` | `0xbbb10c` | `44` |  |
| `0x18accd0` | `0x78` | `0xbbb340` | `44` |  |
| `0x18acd70` | `0x78` | `0xbbb736` | `44` |  |
| `0x18acdc0` | `0x78` | `0xbbb6eb` | `44` |  |
| `0x18ace98` | `0x78` | `0xbbb783` | `44` |  |
| ... | ... | ... | ... | truncated 50225 more |

## Top candidate method windows

### AP `0x184d768`: +0x78 -> `0x10be91e`, +0x10 -> `0x10bd004` score=39 near restrictions methods

#### +0x78 target

```text
 10be8dc:	38 46 38             	cmp    BYTE PTR [rsi+0x38],al
 10be8df:	74 3c                	je     10be91d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285d33>
 10be8e1:	48 8d 47 08          	lea    rax,[rdi+0x8]
 10be8e5:	48 8b 4e 18          	mov    rcx,QWORD PTR [rsi+0x18]
 10be8e9:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 10be8ed:	0f 10 46 08          	movups xmm0,XMMWORD PTR [rsi+0x8]
 10be8f1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10be8f4:	0f 57 c0             	xorps  xmm0,xmm0
 10be8f7:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
 10be8fb:	48 83 66 18 00       	and    QWORD PTR [rsi+0x18],0x0
 10be900:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
 10be904:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
 10be908:	0f 10 4e 20          	movups xmm1,XMMWORD PTR [rsi+0x20]
 10be90c:	0f 11 4f 20          	movups XMMWORD PTR [rdi+0x20],xmm1
 10be910:	0f 11 46 20          	movups XMMWORD PTR [rsi+0x20],xmm0
 10be914:	48 83 66 30 00       	and    QWORD PTR [rsi+0x30],0x0
 10be919:	c6 47 38 01          	mov    BYTE PTR [rdi+0x38],0x1
 10be91d:	c3                   	ret
 10be91e:	0f 18 0d 53 a6 83 00 	prefetcht0 BYTE PTR [rip+0x83a653]        # 18f8f78 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40388>
 10be925:	48 8d 05 4c a6 83 00 	lea    rax,[rip+0x83a64c]        # 18f8f78 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40388>
 10be92c:	48 8b 0d 4d a6 83 00 	mov    rcx,QWORD PTR [rip+0x83a64d]        # 18f8f80 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40390>
 10be933:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10be936:	c3                   	ret
 10be937:	cc                   	int3
 10be938:	48 89 f0             	mov    rax,rsi
 10be93b:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10be93f:	48 8d 0d 7a ee 78 00 	lea    rcx,[rip+0x78ee7a]        # 184d7c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ea8>
 10be946:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10be949:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10be94e:	48 83 66 15 00       	and    QWORD PTR [rsi+0x15],0x0
 10be953:	c3                   	ret
 10be954:	53                   	push   rbx
 10be955:	48 89 fb             	mov    rbx,rdi
 10be958:	e8 d3 f9 fe ff       	call   10ae330 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275746>
 10be95d:	48 89 df             	mov    rdi,rbx
 10be960:	5b                   	pop    rbx
 10be961:	e9 ba f5 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10be966:	41 56                	push   r14
 10be968:	53                   	push   rbx
 10be969:	48 83 ec 18          	sub    rsp,0x18
 10be96d:	49 89 f6             	mov    r14,rsi
 10be970:	48 89 fb             	mov    rbx,rdi
 10be973:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10be97a:	00 00
 10be97c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10be981:	48 89 d6             	mov    rsi,rdx
 10be984:	e8 ac 13 00 00       	call   10bfd35 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28714b>
 10be989:	49 81 c6 f8 00 00 00 	add    r14,0xf8
 10be990:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 10be994:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
 10be997:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
 10be99b:	48 85 c0             	test   rax,rax
 10be99e:	74 05                	je     10be9a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285dbb>
 10be9a0:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
 10be9a5:	48 89 e6             	mov    rsi,rsp
 10be9a8:	4c 89 f7             	mov    rdi,r14
 10be9ab:	e8 fe 13 00 00       	call   10bfdae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2871c4>
 10be9b0:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 10be9b5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10be9bc:	00 00
 10be9be:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10be9c3:	75 3e                	jne    10bea03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285e19>
 10be9c5:	e8 e8 fa 9d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 10be9ca:	48 89 d8             	mov    rax,rbx
 10be9cd:	48 83 c4 18          	add    rsp,0x18
 10be9d1:	5b                   	pop    rbx
 10be9d2:	41 5e                	pop    r14
 10be9d4:	c3                   	ret
 10be9d5:	49 89 c6             	mov    r14,rax
 10be9d8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 10be9dd:	e8 d0 fa 9d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 10be9e2:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10be9e6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10be9ed:	00 00
 10be9ef:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10be9f4:	75 0d                	jne    10bea03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285e19>
 10be9f6:	e8 8b fa 9d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10be9fb:	4c 89 f7             	mov    rdi,r14
 10be9fe:	e8 cd 12 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bea03:	e8 a8 10 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bea08:	41 56                	push   r14
 10bea0a:	53                   	push   rbx
 10bea0b:	48 83 ec 18          	sub    rsp,0x18
 10bea0f:	49 89 f6             	mov    r14,rsi
 10bea12:	48 89 fb             	mov    rbx,rdi
 10bea15:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bea1c:	00 00
 10bea1e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bea23:	48 89 d6             	mov    rsi,rdx
 10bea26:	e8 0a 13 00 00       	call   10bfd35 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28714b>
 10bea2b:	49 81 c6 10 01 00 00 	add    r14,0x110
 10bea32:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 10bea36:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
```
#### +0x10 target

```text
 10bcfd5:	e8 d6 2a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bcfda:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bcfdd:	83 c0 fe             	add    eax,0xfffffffe
 10bcfe0:	83 f8 03             	cmp    eax,0x3
 10bcfe3:	0f 92 c0             	setb   al
 10bcfe6:	c3                   	ret
 10bcfe7:	cc                   	int3
 10bcfe8:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bcfec:	0f 94 c0             	sete   al
 10bcfef:	c3                   	ret
 10bcff0:	80 7f 55 00          	cmp    BYTE PTR [rdi+0x55],0x0
 10bcff4:	0f 94 c0             	sete   al
 10bcff7:	c3                   	ret
 10bcff8:	83 7f 50 03          	cmp    DWORD PTR [rdi+0x50],0x3
 10bcffc:	0f 94 c0             	sete   al
 10bcfff:	c3                   	ret
 10bd000:	8a 47 56             	mov    al,BYTE PTR [rdi+0x56]
 10bd003:	c3                   	ret
 10bd004:	8a 47 57             	mov    al,BYTE PTR [rdi+0x57]
 10bd007:	c3                   	ret
 10bd008:	8a 47 58             	mov    al,BYTE PTR [rdi+0x58]
 10bd00b:	c3                   	ret
 10bd00c:	8a 47 59             	mov    al,BYTE PTR [rdi+0x59]
 10bd00f:	c3                   	ret
 10bd010:	8a 47 5a             	mov    al,BYTE PTR [rdi+0x5a]
 10bd013:	c3                   	ret
 10bd014:	53                   	push   rbx
 10bd015:	48 89 fb             	mov    rbx,rdi
 10bd018:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bd01c:	e8 89 00 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bd021:	84 c0                	test   al,al
 10bd023:	74 0e                	je     10bd033 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284449>
 10bd025:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 10bd029:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
 10bd02d:	5b                   	pop    rbx
 10bd02e:	e9 47 01 00 00       	jmp    10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bd033:	31 c0                	xor    eax,eax
 10bd035:	5b                   	pop    rbx
 10bd036:	c3                   	ret
 10bd037:	cc                   	int3
 10bd038:	53                   	push   rbx
 10bd039:	48 89 fb             	mov    rbx,rdi
 10bd03c:	48 8d 05 8d 05 79 00 	lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10bd043:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bd046:	48 81 c7 88 01 00 00 	add    rdi,0x188
 10bd04d:	e8 82 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd052:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
 10bd059:	e8 76 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd05e:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 10bd065:	e8 fc cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd06a:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
 10bd071:	e8 f0 cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd076:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10bd07d:	e8 d4 d6 ff ff       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>
 10bd082:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10bd086:	e8 49 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd08b:	48 83 c3 20          	add    rbx,0x20
 10bd08f:	48 89 df             	mov    rdi,rbx
 10bd092:	5b                   	pop    rbx
 10bd093:	e9 3c cb 71 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd098:	53                   	push   rbx
 10bd099:	48 89 fb             	mov    rbx,rdi
 10bd09c:	e8 97 ff ff ff       	call   10bd038 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28444e>
 10bd0a1:	48 89 df             	mov    rdi,rbx
 10bd0a4:	5b                   	pop    rbx
 10bd0a5:	e9 76 0e 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10bd0aa:	41 57                	push   r15
 10bd0ac:	41 56                	push   r14
 10bd0ae:	41 54                	push   r12
 10bd0b0:	53                   	push   rbx
 10bd0b1:	48 83 ec 58          	sub    rsp,0x58
 10bd0b5:	48 89 fb             	mov    rbx,rdi
 10bd0b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd0bf:	00 00
 10bd0c1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10bd0c6:	48 8d 35 fb b0 92 00 	lea    rsi,[rip+0x92b0fb]        # 19e81c8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27b8>
 10bd0cd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bd0d2:	e8 d3 4c 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bd0d7:	48 8d 35 af 58 2b ff 	lea    rsi,[rip+0xffffffffff2b58af]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
 10bd0de:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bd0e3:	e8 96 c9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bd0e8:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 10bd0eb:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
 10bd0f0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 10bd0f5:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
 10bd0fa:	4c 89 f7             	mov    rdi,r14
 10bd0fd:	4c 89 fa             	mov    rdx,r15
 10bd100:	4c 89 e1             	mov    rcx,r12
 10bd103:	e8 e8 5e 55 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
 10bd108:	48 8d 35 6e 4e 39 ff 	lea    rsi,[rip+0xffffffffff394e6e]        # 451f7d <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b89>
 10bd10f:	4c 89 f7             	mov    rdi,r14
 10bd112:	e8 38 e7 9b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10bd117:	89 c3                	mov    ebx,eax
```
### AP `0x1831968`: +0x78 -> `0xe992a2`, +0x10 -> `0xea6568` score=36 near-e99 bridge

#### +0x78 target

```text
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
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
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
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
```
#### +0x10 target

```text
  ea6537:	48 89 c6             	mov    rsi,rax
  ea653a:	ff 51 18             	call   QWORD PTR [rcx+0x18]
  ea653d:	58                   	pop    rax
  ea653e:	c3                   	ret
  ea653f:	48 89 c7             	mov    rdi,rax
  ea6542:	e8 5e 35 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea6547:	cc                   	int3
  ea6548:	53                   	push   rbx
  ea6549:	48 89 fb             	mov    rbx,rdi
  ea654c:	6a 10                	push   0x10
  ea654e:	5f                   	pop    rdi
  ea654f:	e8 ac 79 94 00       	call   17edf00 <_Znwm@plt>
  ea6554:	48 8d 0d 05 b4 98 00 	lea    rcx,[rip+0x98b405]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea655b:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea655e:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6562:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6566:	5b                   	pop    rbx
  ea6567:	c3                   	ret
  ea6568:	48 8d 05 f1 b3 98 00 	lea    rax,[rip+0x98b3f1]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea656f:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6572:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6576:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea657a:	c3                   	ret
  ea657b:	cc                   	int3
  ea657c:	53                   	push   rbx
  ea657d:	48 83 ec 60          	sub    rsp,0x60
  ea6581:	4d 89 ca             	mov    r10,r9
  ea6584:	48 89 f0             	mov    rax,rsi
  ea6587:	48 89 fb             	mov    rbx,rdi
  ea658a:	4c 8b 4c 24 70       	mov    r9,QWORD PTR [rsp+0x70]
  ea658f:	0f 10 44 24 78       	movups xmm0,XMMWORD PTR [rsp+0x78]
  ea6594:	0f 10 8c 24 88 00 00 	movups xmm1,XMMWORD PTR [rsp+0x88]
  ea659b:	00
  ea659c:	0f 10 94 24 98 00 00 	movups xmm2,XMMWORD PTR [rsp+0x98]
  ea65a3:	00
  ea65a4:	0f 10 9c 24 a8 00 00 	movups xmm3,XMMWORD PTR [rsp+0xa8]
  ea65ab:	00
  ea65ac:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
  ea65b3:	00
  ea65b4:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
  ea65bb:	00
  ea65bc:	0f 10 27             	movups xmm4,XMMWORD PTR [rdi]
  ea65bf:	0f 11 64 24 50       	movups XMMWORD PTR [rsp+0x50],xmm4
  ea65c4:	0f 10 26             	movups xmm4,XMMWORD PTR [rsi]
  ea65c7:	0f 11 64 24 40       	movups XMMWORD PTR [rsp+0x40],xmm4
  ea65cc:	0f 11 5c 24 30       	movups XMMWORD PTR [rsp+0x30],xmm3
  ea65d1:	0f 11 54 24 20       	movups XMMWORD PTR [rsp+0x20],xmm2
  ea65d6:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
  ea65db:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  ea65df:	48 89 df             	mov    rdi,rbx
  ea65e2:	48 89 d6             	mov    rsi,rdx
  ea65e5:	48 89 ca             	mov    rdx,rcx
  ea65e8:	4c 89 c1             	mov    rcx,r8
  ea65eb:	4d 89 d0             	mov    r8,r10
  ea65ee:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea65f1:	48 89 d8             	mov    rax,rbx
  ea65f4:	48 83 c4 60          	add    rsp,0x60
  ea65f8:	5b                   	pop    rbx
  ea65f9:	c3                   	ret
  ea65fa:	53                   	push   rbx
  ea65fb:	48 89 fb             	mov    rbx,rdi
  ea65fe:	6a 10                	push   0x10
  ea6600:	5f                   	pop    rdi
  ea6601:	e8 fa 78 94 00       	call   17edf00 <_Znwm@plt>
  ea6606:	48 8d 0d 0b b3 98 00 	lea    rcx,[rip+0x98b30b]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea660d:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea6610:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6614:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6618:	5b                   	pop    rbx
  ea6619:	c3                   	ret
  ea661a:	48 8d 05 f7 b2 98 00 	lea    rax,[rip+0x98b2f7]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea6621:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6624:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6628:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea662c:	c3                   	ret
  ea662d:	cc                   	int3
  ea662e:	53                   	push   rbx
  ea662f:	48 83 ec 10          	sub    rsp,0x10
  ea6633:	4d 89 ca             	mov    r10,r9
  ea6636:	48 89 f0             	mov    rax,rsi
  ea6639:	48 89 fb             	mov    rbx,rdi
  ea663c:	4c 8b 4c 24 20       	mov    r9,QWORD PTR [rsp+0x20]
  ea6641:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
  ea6646:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
  ea664a:	48 89 d6             	mov    rsi,rdx
  ea664d:	48 89 ca             	mov    rdx,rcx
  ea6650:	4c 89 c1             	mov    rcx,r8
  ea6653:	4d 89 d0             	mov    r8,r10
  ea6656:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea6659:	48 89 d8             	mov    rax,rbx
  ea665c:	48 83 c4 10          	add    rsp,0x10
  ea6660:	5b                   	pop    rbx
  ea6661:	c3                   	ret
```
### AP `0x1831980`: +0x78 -> `0xe99368`, +0x10 -> `0xea657c` score=36 near-e99 bridge

#### +0x78 target

```text
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
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
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
```
#### +0x10 target

```text
  ea6547:	cc                   	int3
  ea6548:	53                   	push   rbx
  ea6549:	48 89 fb             	mov    rbx,rdi
  ea654c:	6a 10                	push   0x10
  ea654e:	5f                   	pop    rdi
  ea654f:	e8 ac 79 94 00       	call   17edf00 <_Znwm@plt>
  ea6554:	48 8d 0d 05 b4 98 00 	lea    rcx,[rip+0x98b405]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea655b:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea655e:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6562:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6566:	5b                   	pop    rbx
  ea6567:	c3                   	ret
  ea6568:	48 8d 05 f1 b3 98 00 	lea    rax,[rip+0x98b3f1]        # 1831960 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38f8>
  ea656f:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6572:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6576:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea657a:	c3                   	ret
  ea657b:	cc                   	int3
  ea657c:	53                   	push   rbx
  ea657d:	48 83 ec 60          	sub    rsp,0x60
  ea6581:	4d 89 ca             	mov    r10,r9
  ea6584:	48 89 f0             	mov    rax,rsi
  ea6587:	48 89 fb             	mov    rbx,rdi
  ea658a:	4c 8b 4c 24 70       	mov    r9,QWORD PTR [rsp+0x70]
  ea658f:	0f 10 44 24 78       	movups xmm0,XMMWORD PTR [rsp+0x78]
  ea6594:	0f 10 8c 24 88 00 00 	movups xmm1,XMMWORD PTR [rsp+0x88]
  ea659b:	00
  ea659c:	0f 10 94 24 98 00 00 	movups xmm2,XMMWORD PTR [rsp+0x98]
  ea65a3:	00
  ea65a4:	0f 10 9c 24 a8 00 00 	movups xmm3,XMMWORD PTR [rsp+0xa8]
  ea65ab:	00
  ea65ac:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
  ea65b3:	00
  ea65b4:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
  ea65bb:	00
  ea65bc:	0f 10 27             	movups xmm4,XMMWORD PTR [rdi]
  ea65bf:	0f 11 64 24 50       	movups XMMWORD PTR [rsp+0x50],xmm4
  ea65c4:	0f 10 26             	movups xmm4,XMMWORD PTR [rsi]
  ea65c7:	0f 11 64 24 40       	movups XMMWORD PTR [rsp+0x40],xmm4
  ea65cc:	0f 11 5c 24 30       	movups XMMWORD PTR [rsp+0x30],xmm3
  ea65d1:	0f 11 54 24 20       	movups XMMWORD PTR [rsp+0x20],xmm2
  ea65d6:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
  ea65db:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  ea65df:	48 89 df             	mov    rdi,rbx
  ea65e2:	48 89 d6             	mov    rsi,rdx
  ea65e5:	48 89 ca             	mov    rdx,rcx
  ea65e8:	4c 89 c1             	mov    rcx,r8
  ea65eb:	4d 89 d0             	mov    r8,r10
  ea65ee:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea65f1:	48 89 d8             	mov    rax,rbx
  ea65f4:	48 83 c4 60          	add    rsp,0x60
  ea65f8:	5b                   	pop    rbx
  ea65f9:	c3                   	ret
  ea65fa:	53                   	push   rbx
  ea65fb:	48 89 fb             	mov    rbx,rdi
  ea65fe:	6a 10                	push   0x10
  ea6600:	5f                   	pop    rdi
  ea6601:	e8 fa 78 94 00       	call   17edf00 <_Znwm@plt>
  ea6606:	48 8d 0d 0b b3 98 00 	lea    rcx,[rip+0x98b30b]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea660d:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea6610:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea6614:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea6618:	5b                   	pop    rbx
  ea6619:	c3                   	ret
  ea661a:	48 8d 05 f7 b2 98 00 	lea    rax,[rip+0x98b2f7]        # 1831918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x38b0>
  ea6621:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6624:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6628:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea662c:	c3                   	ret
  ea662d:	cc                   	int3
  ea662e:	53                   	push   rbx
  ea662f:	48 83 ec 10          	sub    rsp,0x10
  ea6633:	4d 89 ca             	mov    r10,r9
  ea6636:	48 89 f0             	mov    rax,rsi
  ea6639:	48 89 fb             	mov    rbx,rdi
  ea663c:	4c 8b 4c 24 20       	mov    r9,QWORD PTR [rsp+0x20]
  ea6641:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
  ea6646:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
  ea664a:	48 89 d6             	mov    rsi,rdx
  ea664d:	48 89 ca             	mov    rdx,rcx
  ea6650:	4c 89 c1             	mov    rcx,r8
  ea6653:	4d 89 d0             	mov    r8,r10
  ea6656:	ff 50 08             	call   QWORD PTR [rax+0x8]
  ea6659:	48 89 d8             	mov    rax,rbx
  ea665c:	48 83 c4 10          	add    rsp,0x10
  ea6660:	5b                   	pop    rbx
  ea6661:	c3                   	ret
  ea6662:	48 8d 05 77 b2 98 00 	lea    rax,[rip+0x98b277]        # 18318e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3878>
  ea6669:	48 89 07             	mov    QWORD PTR [rdi],rax
  ea666c:	e9 9f 79 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  ea6671:	cc                   	int3
  ea6672:	53                   	push   rbx
  ea6673:	48 89 fb             	mov    rbx,rdi
```
### AP `0x184d258`: +0x78 -> `0x10b916a`, +0x10 -> `0xaa8e00` score=36 near restrictions methods

#### +0x78 target

```text
 10b912c:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
 10b9130:	48 8d 0d c1 66 38 ff 	lea    rcx,[rip+0xffffffffff3866c1]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10b9137:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
 10b913b:	0f 57 c0             	xorps  xmm0,xmm0
 10b913e:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
 10b9142:	5b                   	pop    rbx
 10b9143:	c3                   	ret
 10b9144:	48 8d 05 75 41 79 00 	lea    rax,[rip+0x794175]        # 184d2c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x99a8>
 10b914b:	48 89 07             	mov    QWORD PTR [rdi],rax
 10b914e:	48 83 c7 08          	add    rdi,0x8
 10b9152:	e9 57 fc ff ff       	jmp    10b8dae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2801c4>
 10b9157:	cc                   	int3
 10b9158:	53                   	push   rbx
 10b9159:	48 89 fb             	mov    rbx,rdi
 10b915c:	e8 e3 ff ff ff       	call   10b9144 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28055a>
 10b9161:	48 89 df             	mov    rdi,rbx
 10b9164:	5b                   	pop    rbx
 10b9165:	e9 b6 4d 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10b916a:	41 56                	push   r14
 10b916c:	53                   	push   rbx
 10b916d:	48 83 ec 28          	sub    rsp,0x28
 10b9171:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b9178:	00 00
 10b917a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10b917f:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 10b9183:	6a 78                	push   0x78
 10b9185:	5f                   	pop    rdi
 10b9186:	e8 75 4d 73 00       	call   17edf00 <_Znwm@plt>
 10b918b:	48 89 c3             	mov    rbx,rax
 10b918e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 10b9192:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
 10b9197:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 10b919c:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
 10b91a3:	00 00
 10b91a5:	48 8d 05 14 41 79 00 	lea    rax,[rip+0x794114]        # 184d2c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x99a8>
 10b91ac:	48 89 03             	mov    QWORD PTR [rbx],rax
 10b91af:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 10b91b3:	4c 89 f6             	mov    rsi,r14
 10b91b6:	e8 43 02 00 00       	call   10b93fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280814>
 10b91bb:	48 89 e7             	mov    rdi,rsp
 10b91be:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 10b91c2:	e8 03 11 9c ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 10b91c7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b91ce:	00 00
 10b91d0:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10b91d5:	75 2e                	jne    10b9205 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28061b>
 10b91d7:	48 89 d8             	mov    rax,rbx
 10b91da:	48 83 c4 28          	add    rsp,0x28
 10b91de:	5b                   	pop    rbx
 10b91df:	41 5e                	pop    r14
 10b91e1:	c3                   	ret
 10b91e2:	48 89 c3             	mov    rbx,rax
 10b91e5:	48 89 e7             	mov    rdi,rsp
 10b91e8:	e8 dd 10 9c ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 10b91ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b91f4:	00 00
 10b91f6:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10b91fb:	75 08                	jne    10b9205 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28061b>
 10b91fd:	48 89 df             	mov    rdi,rbx
 10b9200:	e8 cb 6a 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10b9205:	e8 a6 68 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10b920a:	48 8d 47 08          	lea    rax,[rdi+0x8]
 10b920e:	48 8d 0d ab 40 79 00 	lea    rcx,[rip+0x7940ab]        # 184d2c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x99a8>
 10b9215:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10b9218:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
 10b921c:	48 89 c6             	mov    rsi,rax
 10b921f:	e9 da 01 00 00       	jmp    10b93fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280814>
 10b9224:	48 83 c7 08          	add    rdi,0x8
 10b9228:	e9 81 fb ff ff       	jmp    10b8dae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2801c4>
 10b922d:	cc                   	int3
 10b922e:	53                   	push   rbx
 10b922f:	48 89 fb             	mov    rbx,rdi
 10b9232:	48 83 c7 08          	add    rdi,0x8
 10b9236:	e8 73 fb ff ff       	call   10b8dae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2801c4>
 10b923b:	48 89 df             	mov    rdi,rbx
 10b923e:	5b                   	pop    rbx
 10b923f:	e9 dc 4c 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10b9244:	41 57                	push   r15
 10b9246:	41 56                	push   r14
 10b9248:	41 54                	push   r12
 10b924a:	53                   	push   rbx
 10b924b:	48 83 ec 58          	sub    rsp,0x58
 10b924f:	48 89 fb             	mov    rbx,rdi
 10b9252:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b9259:	00 00
 10b925b:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10b9260:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
 10b9264:	48 8d 57 10          	lea    rdx,[rdi+0x10]
 10b9268:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10b926d:	4c 89 f7             	mov    rdi,r14
 10b9270:	e8 dd fb ff ff       	call   10b8e52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280268>
 10b9275:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
 10b9279:	4c 89 f6             	mov    rsi,r14
```
#### +0x10 target

```text
  aa8dc2:	c3                   	ret
  aa8dc3:	48 89 c3             	mov    rbx,rax
  aa8dc6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  aa8dcb:	e8 c0 50 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa8dd0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aa8dd7:	00 00
  aa8dd9:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  aa8dde:	75 08                	jne    aa8de8 <JNI_OnUnload@@Base+0x306b5>
  aa8de0:	48 89 df             	mov    rdi,rbx
  aa8de3:	e8 e8 6e fc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  aa8de8:	e8 c3 6c d4 00       	call   17efab0 <__stack_chk_fail@plt>
  aa8ded:	cc                   	int3
  aa8dee:	53                   	push   rbx
  aa8def:	48 89 fb             	mov    rbx,rdi
  aa8df2:	e8 a1 e5 ff ff       	call   aa7398 <JNI_OnUnload@@Base+0x2ec65>
  aa8df7:	48 89 df             	mov    rdi,rbx
  aa8dfa:	5b                   	pop    rbx
  aa8dfb:	e9 20 51 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aa8e00:	41 56                	push   r14
  aa8e02:	53                   	push   rbx
  aa8e03:	48 83 ec 58          	sub    rsp,0x58
  aa8e07:	48 89 fb             	mov    rbx,rdi
  aa8e0a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aa8e11:	00 00
  aa8e13:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
  aa8e18:	48 8b 42 10          	mov    rax,QWORD PTR [rdx+0x10]
  aa8e1c:	49 89 e6             	mov    r14,rsp
  aa8e1f:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  aa8e23:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
  aa8e26:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
  aa8e2a:	0f 57 c0             	xorps  xmm0,xmm0
  aa8e2d:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
  aa8e30:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
  aa8e35:	48 8b 42 28          	mov    rax,QWORD PTR [rdx+0x28]
  aa8e39:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
  aa8e3d:	0f 10 4a 18          	movups xmm1,XMMWORD PTR [rdx+0x18]
  aa8e41:	41 0f 11 4e 18       	movups XMMWORD PTR [r14+0x18],xmm1
  aa8e46:	0f 11 42 18          	movups XMMWORD PTR [rdx+0x18],xmm0
  aa8e4a:	48 83 62 28 00       	and    QWORD PTR [rdx+0x28],0x0
  aa8e4f:	48 8b 42 40          	mov    rax,QWORD PTR [rdx+0x40]
  aa8e53:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
  aa8e57:	0f 10 4a 30          	movups xmm1,XMMWORD PTR [rdx+0x30]
  aa8e5b:	41 0f 29 4e 30       	movaps XMMWORD PTR [r14+0x30],xmm1
  aa8e60:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
  aa8e64:	48 83 62 40 00       	and    QWORD PTR [rdx+0x40],0x0
  aa8e69:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  aa8e6c:	4c 89 f2             	mov    rdx,r14
  aa8e6f:	ff 50 10             	call   QWORD PTR [rax+0x10]
  aa8e72:	4c 89 f7             	mov    rdi,r14
  aa8e75:	e8 da df ff ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
  aa8e7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aa8e81:	00 00
  aa8e83:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
  aa8e88:	75 0b                	jne    aa8e95 <JNI_OnUnload@@Base+0x30762>
  aa8e8a:	48 89 d8             	mov    rax,rbx
  aa8e8d:	48 83 c4 58          	add    rsp,0x58
  aa8e91:	5b                   	pop    rbx
  aa8e92:	41 5e                	pop    r14
  aa8e94:	c3                   	ret
  aa8e95:	e8 16 6c d4 00       	call   17efab0 <__stack_chk_fail@plt>
  aa8e9a:	55                   	push   rbp
  aa8e9b:	41 57                	push   r15
  aa8e9d:	41 56                	push   r14
  aa8e9f:	41 55                	push   r13
  aa8ea1:	41 54                	push   r12
  aa8ea3:	53                   	push   rbx
  aa8ea4:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  aa8eab:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
  aa8eb0:	49 89 d5             	mov    r13,rdx
  aa8eb3:	49 89 f4             	mov    r12,rsi
  aa8eb6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aa8ebd:	00 00
  aa8ebf:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  aa8ec6:	00
  aa8ec7:	48 8b 42 18          	mov    rax,QWORD PTR [rdx+0x18]
  aa8ecb:	48 85 c0             	test   rax,rax
  aa8ece:	48 8d 0d 53 ef e0 00 	lea    rcx,[rip+0xe0ef53]        # 18b7e28 <__cxa_unexpected_handler@@Base+0x198>
  aa8ed5:	48 0f 45 c8          	cmovne rcx,rax
  aa8ed9:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
  aa8ede:	83 79 1c 00          	cmp    DWORD PTR [rcx+0x1c],0x0
  aa8ee2:	0f 95 c0             	setne  al
  aa8ee5:	0f 94 c2             	sete   dl
  aa8ee8:	80 f2 11             	xor    dl,0x11
  aa8eeb:	c0 e0 02             	shl    al,0x2
  aa8eee:	04 04                	add    al,0x4
  aa8ef0:	8b 71 18             	mov    esi,DWORD PTR [rcx+0x18]
  aa8ef3:	83 79 20 01          	cmp    DWORD PTR [rcx+0x20],0x1
  aa8ef7:	41 b7 02             	mov    r15b,0x2
  aa8efa:	41 80 df 00          	sbb    r15b,0x0
  aa8efe:	49 8b 4c 24 68       	mov    rcx,QWORD PTR [r12+0x68]
  aa8f03:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
  aa8f08:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
  aa8f0d:	49 8b 4c 24 70       	mov    rcx,QWORD PTR [r12+0x70]
```
### AP `0x184d010`: +0x78 -> `0x10b2ab4`, +0x10 -> `0x10b2b32` score=35 near restrictions methods

#### +0x78 target

```text
 10b2a7f:	cc                   	int3
 10b2a80:	53                   	push   rbx
 10b2a81:	48 89 fb             	mov    rbx,rdi
 10b2a84:	6a 10                	push   0x10
 10b2a86:	5f                   	pop    rdi
 10b2a87:	e8 74 b4 73 00       	call   17edf00 <_Znwm@plt>
 10b2a8c:	48 8d 0d c5 a5 79 00 	lea    rcx,[rip+0x79a5c5]        # 184d058 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9740>
 10b2a93:	48 89 08             	mov    QWORD PTR [rax],rcx
 10b2a96:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 10b2a9a:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 10b2a9e:	5b                   	pop    rbx
 10b2a9f:	c3                   	ret
 10b2aa0:	48 8d 05 b1 a5 79 00 	lea    rax,[rip+0x79a5b1]        # 184d058 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9740>
 10b2aa7:	48 89 06             	mov    QWORD PTR [rsi],rax
 10b2aaa:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 10b2aae:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 10b2ab2:	c3                   	ret
 10b2ab3:	cc                   	int3
 10b2ab4:	53                   	push   rbx
 10b2ab5:	48 83 ec 20          	sub    rsp,0x20
 10b2ab9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b2ac0:	00 00
 10b2ac2:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10b2ac7:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
 10b2acb:	48 8d 05 86 dd 89 00 	lea    rax,[rip+0x89dd86]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>
 10b2ad2:	48 39 42 08          	cmp    QWORD PTR [rdx+0x8],rax
 10b2ad6:	75 05                	jne    10b2add <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279ef3>
 10b2ad8:	83 3a 0a             	cmp    DWORD PTR [rdx],0xa
 10b2adb:	74 32                	je     10b2b0f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279f25>
 10b2add:	48 83 7b 48 00       	cmp    QWORD PTR [rbx+0x48],0x0
 10b2ae2:	74 1f                	je     10b2b03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279f19>
 10b2ae4:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 10b2ae8:	0f 57 c0             	xorps  xmm0,xmm0
 10b2aeb:	48 89 e6             	mov    rsi,rsp
 10b2aee:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 10b2af1:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10b2af6:	e8 e9 fe ff ff       	call   10b29e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279dfa>
 10b2afb:	48 89 e7             	mov    rdi,rsp
 10b2afe:	e8 57 21 e1 ff       	call   ec4c5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c070>
 10b2b03:	48 83 c3 28          	add    rbx,0x28
 10b2b07:	48 89 df             	mov    rdi,rbx
 10b2b0a:	e8 17 be 9f ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
 10b2b0f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b2b16:	00 00
 10b2b18:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 10b2b1d:	75 06                	jne    10b2b25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279f3b>
 10b2b1f:	48 83 c4 20          	add    rsp,0x20
 10b2b23:	5b                   	pop    rbx
 10b2b24:	c3                   	ret
 10b2b25:	e8 86 cf 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10b2b2a:	48 89 c7             	mov    rdi,rax
 10b2b2d:	e8 73 6f 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10b2b32:	53                   	push   rbx
 10b2b33:	48 89 fb             	mov    rbx,rdi
 10b2b36:	6a 18                	push   0x18
 10b2b38:	5f                   	pop    rdi
 10b2b39:	e8 c2 b3 73 00       	call   17edf00 <_Znwm@plt>
 10b2b3e:	48 8d 0d cb a4 79 00 	lea    rcx,[rip+0x79a4cb]        # 184d010 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96f8>
 10b2b45:	48 89 08             	mov    QWORD PTR [rax],rcx
 10b2b48:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
 10b2b4c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10b2b50:	5b                   	pop    rbx
 10b2b51:	c3                   	ret
 10b2b52:	48 8d 05 b7 a4 79 00 	lea    rax,[rip+0x79a4b7]        # 184d010 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96f8>
 10b2b59:	48 89 06             	mov    QWORD PTR [rsi],rax
 10b2b5c:	0f 10 47 08          	movups xmm0,XMMWORD PTR [rdi+0x8]
 10b2b60:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
 10b2b64:	c3                   	ret
 10b2b65:	cc                   	int3
 10b2b66:	55                   	push   rbp
 10b2b67:	41 57                	push   r15
 10b2b69:	41 56                	push   r14
 10b2b6b:	41 55                	push   r13
 10b2b6d:	41 54                	push   r12
 10b2b6f:	53                   	push   rbx
 10b2b70:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
 10b2b77:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b2b7e:	00 00
 10b2b80:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 10b2b87:	00
 10b2b88:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
 10b2b8c:	48 83 7b 48 00       	cmp    QWORD PTR [rbx+0x48],0x0
 10b2b91:	0f 84 74 01 00 00    	je     10b2d0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a121>
 10b2b97:	4c 8d 73 38          	lea    r14,[rbx+0x38]
 10b2b9b:	c6 84 24 80 00 00 00 	mov    BYTE PTR [rsp+0x80],0x7
 10b2ba2:	07
 10b2ba3:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
 10b2baa:	00 00
 10b2bac:	0f 57 c0             	xorps  xmm0,xmm0
 10b2baf:	0f 11 84 24 88 00 00 	movups XMMWORD PTR [rsp+0x88],xmm0
 10b2bb6:	00
 10b2bb7:	81 3a c8 00 00 00    	cmp    DWORD PTR [rdx],0xc8
 10b2bbd:	75 62                	jne    10b2c21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a037>
```
#### +0x10 target

```text
 10b2aee:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 10b2af1:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10b2af6:	e8 e9 fe ff ff       	call   10b29e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279dfa>
 10b2afb:	48 89 e7             	mov    rdi,rsp
 10b2afe:	e8 57 21 e1 ff       	call   ec4c5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c070>
 10b2b03:	48 83 c3 28          	add    rbx,0x28
 10b2b07:	48 89 df             	mov    rdi,rbx
 10b2b0a:	e8 17 be 9f ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
 10b2b0f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b2b16:	00 00
 10b2b18:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 10b2b1d:	75 06                	jne    10b2b25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279f3b>
 10b2b1f:	48 83 c4 20          	add    rsp,0x20
 10b2b23:	5b                   	pop    rbx
 10b2b24:	c3                   	ret
 10b2b25:	e8 86 cf 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10b2b2a:	48 89 c7             	mov    rdi,rax
 10b2b2d:	e8 73 6f 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10b2b32:	53                   	push   rbx
 10b2b33:	48 89 fb             	mov    rbx,rdi
 10b2b36:	6a 18                	push   0x18
 10b2b38:	5f                   	pop    rdi
 10b2b39:	e8 c2 b3 73 00       	call   17edf00 <_Znwm@plt>
 10b2b3e:	48 8d 0d cb a4 79 00 	lea    rcx,[rip+0x79a4cb]        # 184d010 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96f8>
 10b2b45:	48 89 08             	mov    QWORD PTR [rax],rcx
 10b2b48:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
 10b2b4c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10b2b50:	5b                   	pop    rbx
 10b2b51:	c3                   	ret
 10b2b52:	48 8d 05 b7 a4 79 00 	lea    rax,[rip+0x79a4b7]        # 184d010 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96f8>
 10b2b59:	48 89 06             	mov    QWORD PTR [rsi],rax
 10b2b5c:	0f 10 47 08          	movups xmm0,XMMWORD PTR [rdi+0x8]
 10b2b60:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
 10b2b64:	c3                   	ret
 10b2b65:	cc                   	int3
 10b2b66:	55                   	push   rbp
 10b2b67:	41 57                	push   r15
 10b2b69:	41 56                	push   r14
 10b2b6b:	41 55                	push   r13
 10b2b6d:	41 54                	push   r12
 10b2b6f:	53                   	push   rbx
 10b2b70:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
 10b2b77:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b2b7e:	00 00
 10b2b80:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 10b2b87:	00
 10b2b88:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
 10b2b8c:	48 83 7b 48 00       	cmp    QWORD PTR [rbx+0x48],0x0
 10b2b91:	0f 84 74 01 00 00    	je     10b2d0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a121>
 10b2b97:	4c 8d 73 38          	lea    r14,[rbx+0x38]
 10b2b9b:	c6 84 24 80 00 00 00 	mov    BYTE PTR [rsp+0x80],0x7
 10b2ba2:	07
 10b2ba3:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
 10b2baa:	00 00
 10b2bac:	0f 57 c0             	xorps  xmm0,xmm0
 10b2baf:	0f 11 84 24 88 00 00 	movups XMMWORD PTR [rsp+0x88],xmm0
 10b2bb6:	00
 10b2bb7:	81 3a c8 00 00 00    	cmp    DWORD PTR [rdx],0xc8
 10b2bbd:	75 62                	jne    10b2c21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a037>
 10b2bbf:	49 89 ff             	mov    r15,rdi
 10b2bc2:	48 83 c2 48          	add    rdx,0x48
 10b2bc6:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 10b2bcd:	00
 10b2bce:	48 89 d6             	mov    rsi,rdx
 10b2bd1:	e8 c5 02 71 00       	call   17c2e9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177007>
 10b2bd6:	0f 57 c0             	xorps  xmm0,xmm0
 10b2bd9:	84 c0                	test   al,al
 10b2bdb:	74 44                	je     10b2c21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a037>
 10b2bdd:	4d 63 67 10          	movsxd r12,DWORD PTR [r15+0x10]
 10b2be1:	40 8a ac 24 80 00 00 	mov    bpl,BYTE PTR [rsp+0x80]
 10b2be8:	00
 10b2be9:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
 10b2bee:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
 10b2bf2:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10b2bf7:	4c 89 ff             	mov    rdi,r15
 10b2bfa:	4c 89 e6             	mov    rsi,r12
 10b2bfd:	e8 94 20 e1 ff       	call   ec4c96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c0ac>
 10b2c02:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 10b2c07:	31 ff                	xor    edi,edi
 10b2c09:	40 80 fd 07          	cmp    bpl,0x7
 10b2c0d:	75 30                	jne    10b2c3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a055>
 10b2c0f:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10b2c16:	00
 10b2c17:	48 8b b4 24 90 00 00 	mov    rsi,QWORD PTR [rsp+0x90]
 10b2c1e:	00
 10b2c1f:	eb 20                	jmp    10b2c41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a057>
 10b2c21:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
 10b2c26:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
 10b2c2a:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10b2c2f:	4c 89 f7             	mov    rdi,r14
 10b2c32:	4c 89 fe             	mov    rsi,r15
 10b2c35:	e8 aa fd ff ff       	call   10b29e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279dfa>
 10b2c3a:	e9 b7 00 00 00       	jmp    10b2cf6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a10c>
```
### AP `0x184d4d0`: +0x78 -> `0x10ba494`, +0x10 -> `0x10ba4e2` score=34 near restrictions methods

#### +0x78 target

```text
 10ba457:	48 8d 05 4a e7 83 00 	lea    rax,[rip+0x83e74a]        # 18f8ba8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3ffb8>
 10ba45e:	48 8b 0d 4b e7 83 00 	mov    rcx,QWORD PTR [rip+0x83e74b]        # 18f8bb0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3ffc0>
 10ba465:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba468:	c3                   	ret
 10ba469:	cc                   	int3
 10ba46a:	53                   	push   rbx
 10ba46b:	48 89 fb             	mov    rbx,rdi
 10ba46e:	48 83 c7 08          	add    rdi,0x8
 10ba472:	e8 91 05 9f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10ba477:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0
 10ba47c:	74 0c                	je     10ba48a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2818a0>
 10ba47e:	48 83 c3 10          	add    rbx,0x10
 10ba482:	48 89 df             	mov    rdi,rbx
 10ba485:	e8 fa 7f 6c 00       	call   1782484 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1365f0>
 10ba48a:	5b                   	pop    rbx
 10ba48b:	c3                   	ret
 10ba48c:	48 89 c7             	mov    rdi,rax
 10ba48f:	e8 11 f6 9b ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10ba494:	53                   	push   rbx
 10ba495:	48 89 fb             	mov    rbx,rdi
 10ba498:	e8 cd ff ff ff       	call   10ba46a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281880>
 10ba49d:	48 89 df             	mov    rdi,rbx
 10ba4a0:	5b                   	pop    rbx
 10ba4a1:	e9 7a 3a 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10ba4a6:	0f 18 0d 2b e6 83 00 	prefetcht0 BYTE PTR [rip+0x83e62b]        # 18f8ad8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fee8>
 10ba4ad:	48 8d 05 24 e6 83 00 	lea    rax,[rip+0x83e624]        # 18f8ad8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fee8>
 10ba4b4:	48 8b 0d 25 e6 83 00 	mov    rcx,QWORD PTR [rip+0x83e625]        # 18f8ae0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fef0>
 10ba4bb:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba4be:	c3                   	ret
 10ba4bf:	cc                   	int3
 10ba4c0:	48 89 f0             	mov    rax,rsi
 10ba4c3:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba4c7:	48 8d 0d 72 30 79 00 	lea    rcx,[rip+0x793072]        # 184d540 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9c28>
 10ba4ce:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba4d1:	0f 57 c0             	xorps  xmm0,xmm0
 10ba4d4:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 10ba4d8:	48 89 56 20          	mov    QWORD PTR [rsi+0x20],rdx
 10ba4dc:	83 66 28 00          	and    DWORD PTR [rsi+0x28],0x0
 10ba4e0:	c3                   	ret
 10ba4e1:	cc                   	int3
 10ba4e2:	0f 18 0d 77 e4 83 00 	prefetcht0 BYTE PTR [rip+0x83e477]        # 18f8960 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fd70>
 10ba4e9:	48 8d 05 70 e4 83 00 	lea    rax,[rip+0x83e470]        # 18f8960 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fd70>
 10ba4f0:	48 8b 0d 71 e4 83 00 	mov    rcx,QWORD PTR [rip+0x83e471]        # 18f8968 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fd78>
 10ba4f7:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba4fa:	c3                   	ret
 10ba4fb:	cc                   	int3
 10ba4fc:	48 89 f0             	mov    rax,rsi
 10ba4ff:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba503:	48 8d 0d b6 2f 79 00 	lea    rcx,[rip+0x792fb6]        # 184d4c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ba8>
 10ba50a:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba50d:	0f 57 c0             	xorps  xmm0,xmm0
 10ba510:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 10ba514:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
 10ba519:	48 89 56 28          	mov    QWORD PTR [rsi+0x28],rdx
 10ba51d:	48 8d 0d d4 52 38 ff 	lea    rcx,[rip+0xffffffffff3852d4]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10ba524:	48 89 4e 30          	mov    QWORD PTR [rsi+0x30],rcx
 10ba528:	c6 46 38 00          	mov    BYTE PTR [rsi+0x38],0x0
 10ba52c:	c3                   	ret
 10ba52d:	cc                   	int3
 10ba52e:	0f 18 0d 63 e3 83 00 	prefetcht0 BYTE PTR [rip+0x83e363]        # 18f8898 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fca8>
 10ba535:	48 8d 05 5c e3 83 00 	lea    rax,[rip+0x83e35c]        # 18f8898 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fca8>
 10ba53c:	48 8b 0d 5d e3 83 00 	mov    rcx,QWORD PTR [rip+0x83e35d]        # 18f88a0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fcb0>
 10ba543:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba546:	c3                   	ret
 10ba547:	cc                   	int3
 10ba548:	48 89 f0             	mov    rax,rsi
 10ba54b:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba54f:	48 8d 0d 6a 2e 79 00 	lea    rcx,[rip+0x792e6a]        # 184d3c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9aa8>
 10ba556:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba559:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10ba55e:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
 10ba562:	c3                   	ret
 10ba563:	cc                   	int3
 10ba564:	0f 18 0d 65 e2 83 00 	prefetcht0 BYTE PTR [rip+0x83e265]        # 18f87d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fbe0>
 10ba56b:	48 8d 05 5e e2 83 00 	lea    rax,[rip+0x83e25e]        # 18f87d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fbe0>
 10ba572:	48 8b 0d 5f e2 83 00 	mov    rcx,QWORD PTR [rip+0x83e25f]        # 18f87d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fbe8>
 10ba579:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba57c:	c3                   	ret
 10ba57d:	cc                   	int3
 10ba57e:	48 89 f0             	mov    rax,rsi
 10ba581:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba585:	48 8d 0d b4 2e 79 00 	lea    rcx,[rip+0x792eb4]        # 184d440 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9b28>
 10ba58c:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba58f:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10ba594:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
 10ba598:	c3                   	ret
 10ba599:	cc                   	int3
 10ba59a:	0f 18 0d 4f e1 83 00 	prefetcht0 BYTE PTR [rip+0x83e14f]        # 18f86f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fb00>
 10ba5a1:	48 8d 05 48 e1 83 00 	lea    rax,[rip+0x83e148]        # 18f86f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fb00>
 10ba5a8:	48 8b 0d 49 e1 83 00 	mov    rcx,QWORD PTR [rip+0x83e149]        # 18f86f8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fb08>
 10ba5af:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba5b2:	c3                   	ret
 10ba5b3:	cc                   	int3
```
#### +0x10 target

```text
 10ba4a0:	5b                   	pop    rbx
 10ba4a1:	e9 7a 3a 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10ba4a6:	0f 18 0d 2b e6 83 00 	prefetcht0 BYTE PTR [rip+0x83e62b]        # 18f8ad8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fee8>
 10ba4ad:	48 8d 05 24 e6 83 00 	lea    rax,[rip+0x83e624]        # 18f8ad8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fee8>
 10ba4b4:	48 8b 0d 25 e6 83 00 	mov    rcx,QWORD PTR [rip+0x83e625]        # 18f8ae0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fef0>
 10ba4bb:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba4be:	c3                   	ret
 10ba4bf:	cc                   	int3
 10ba4c0:	48 89 f0             	mov    rax,rsi
 10ba4c3:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba4c7:	48 8d 0d 72 30 79 00 	lea    rcx,[rip+0x793072]        # 184d540 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9c28>
 10ba4ce:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba4d1:	0f 57 c0             	xorps  xmm0,xmm0
 10ba4d4:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 10ba4d8:	48 89 56 20          	mov    QWORD PTR [rsi+0x20],rdx
 10ba4dc:	83 66 28 00          	and    DWORD PTR [rsi+0x28],0x0
 10ba4e0:	c3                   	ret
 10ba4e1:	cc                   	int3
 10ba4e2:	0f 18 0d 77 e4 83 00 	prefetcht0 BYTE PTR [rip+0x83e477]        # 18f8960 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fd70>
 10ba4e9:	48 8d 05 70 e4 83 00 	lea    rax,[rip+0x83e470]        # 18f8960 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fd70>
 10ba4f0:	48 8b 0d 71 e4 83 00 	mov    rcx,QWORD PTR [rip+0x83e471]        # 18f8968 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fd78>
 10ba4f7:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba4fa:	c3                   	ret
 10ba4fb:	cc                   	int3
 10ba4fc:	48 89 f0             	mov    rax,rsi
 10ba4ff:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba503:	48 8d 0d b6 2f 79 00 	lea    rcx,[rip+0x792fb6]        # 184d4c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ba8>
 10ba50a:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba50d:	0f 57 c0             	xorps  xmm0,xmm0
 10ba510:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 10ba514:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
 10ba519:	48 89 56 28          	mov    QWORD PTR [rsi+0x28],rdx
 10ba51d:	48 8d 0d d4 52 38 ff 	lea    rcx,[rip+0xffffffffff3852d4]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10ba524:	48 89 4e 30          	mov    QWORD PTR [rsi+0x30],rcx
 10ba528:	c6 46 38 00          	mov    BYTE PTR [rsi+0x38],0x0
 10ba52c:	c3                   	ret
 10ba52d:	cc                   	int3
 10ba52e:	0f 18 0d 63 e3 83 00 	prefetcht0 BYTE PTR [rip+0x83e363]        # 18f8898 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fca8>
 10ba535:	48 8d 05 5c e3 83 00 	lea    rax,[rip+0x83e35c]        # 18f8898 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fca8>
 10ba53c:	48 8b 0d 5d e3 83 00 	mov    rcx,QWORD PTR [rip+0x83e35d]        # 18f88a0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fcb0>
 10ba543:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba546:	c3                   	ret
 10ba547:	cc                   	int3
 10ba548:	48 89 f0             	mov    rax,rsi
 10ba54b:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba54f:	48 8d 0d 6a 2e 79 00 	lea    rcx,[rip+0x792e6a]        # 184d3c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9aa8>
 10ba556:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba559:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10ba55e:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
 10ba562:	c3                   	ret
 10ba563:	cc                   	int3
 10ba564:	0f 18 0d 65 e2 83 00 	prefetcht0 BYTE PTR [rip+0x83e265]        # 18f87d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fbe0>
 10ba56b:	48 8d 05 5e e2 83 00 	lea    rax,[rip+0x83e25e]        # 18f87d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fbe0>
 10ba572:	48 8b 0d 5f e2 83 00 	mov    rcx,QWORD PTR [rip+0x83e25f]        # 18f87d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fbe8>
 10ba579:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba57c:	c3                   	ret
 10ba57d:	cc                   	int3
 10ba57e:	48 89 f0             	mov    rax,rsi
 10ba581:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba585:	48 8d 0d b4 2e 79 00 	lea    rcx,[rip+0x792eb4]        # 184d440 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9b28>
 10ba58c:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba58f:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10ba594:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
 10ba598:	c3                   	ret
 10ba599:	cc                   	int3
 10ba59a:	0f 18 0d 4f e1 83 00 	prefetcht0 BYTE PTR [rip+0x83e14f]        # 18f86f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fb00>
 10ba5a1:	48 8d 05 48 e1 83 00 	lea    rax,[rip+0x83e148]        # 18f86f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fb00>
 10ba5a8:	48 8b 0d 49 e1 83 00 	mov    rcx,QWORD PTR [rip+0x83e149]        # 18f86f8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fb08>
 10ba5af:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba5b2:	c3                   	ret
 10ba5b3:	cc                   	int3
 10ba5b4:	48 89 f0             	mov    rax,rsi
 10ba5b7:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba5bb:	48 8d 0d be 2d 79 00 	lea    rcx,[rip+0x792dbe]        # 184d380 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9a68>
 10ba5c2:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba5c5:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10ba5ca:	48 83 66 15 00       	and    QWORD PTR [rsi+0x15],0x0
 10ba5cf:	c3                   	ret
 10ba5d0:	55                   	push   rbp
 10ba5d1:	41 57                	push   r15
 10ba5d3:	41 56                	push   r14
 10ba5d5:	53                   	push   rbx
 10ba5d6:	48 83 ec 68          	sub    rsp,0x68
 10ba5da:	49 89 f6             	mov    r14,rsi
 10ba5dd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba5e4:	00 00
 10ba5e6:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10ba5eb:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10ba5ee:	48 8d 35 e3 db 92 00 	lea    rsi,[rip+0x92dbe3]        # 19e81d8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27c8>
 10ba5f5:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
 10ba5fa:	4c 89 ff             	mov    rdi,r15
 10ba5fd:	e8 a8 77 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10ba602:	4c 89 f7             	mov    rdi,r14
```
### AP `0x184d650`: +0x78 -> `0x10bae58`, +0x10 -> `0x10babb0` score=34 near restrictions methods

#### +0x78 target

```text
 10bae13:	e8 98 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae18:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bae1b:	b0 01                	mov    al,0x1
 10bae1d:	c3                   	ret
 10bae1e:	48 83 ec 18          	sub    rsp,0x18
 10bae22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae29:	00 00
 10bae2b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae30:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae33:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae38:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
 10bae3e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae45:	00 00
 10bae47:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae4c:	75 05                	jne    10bae53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282269>
 10bae4e:	48 83 c4 18          	add    rsp,0x18
 10bae52:	c3                   	ret
 10bae53:	e8 58 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae58:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bae5c:	0f 94 c0             	sete   al
 10bae5f:	c3                   	ret
 10bae60:	48 83 ec 18          	sub    rsp,0x18
 10bae64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae6b:	00 00
 10bae6d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae72:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae75:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae7a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
 10bae80:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae87:	00 00
 10bae89:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae8e:	75 05                	jne    10bae95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822ab>
 10bae90:	48 83 c4 18          	add    rsp,0x18
 10bae94:	c3                   	ret
 10bae95:	e8 16 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae9a:	41 56                	push   r14
 10bae9c:	53                   	push   rbx
 10bae9d:	50                   	push   rax
 10bae9e:	48 89 f3             	mov    rbx,rsi
 10baea1:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10baea7:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10baeaa:	83 e0 fe             	and    eax,0xfffffffe
 10baead:	83 f8 02             	cmp    eax,0x2
 10baeb0:	75 44                	jne    10baef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28230c>
 10baeb2:	49 89 fe             	mov    r14,rdi
 10baeb5:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 10baeb9:	48 85 ff             	test   rdi,rdi
 10baebc:	74 0a                	je     10baec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822de>
 10baebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baec1:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10baec4:	84 c0                	test   al,al
 10baec6:	75 35                	jne    10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baec8:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10baecc:	e8 d9 21 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10baed1:	84 c0                	test   al,al
 10baed3:	74 28                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baed5:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baed9:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baedd:	e8 98 22 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baee2:	84 c0                	test   al,al
 10baee4:	74 17                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baee6:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10baee9:	4c 89 f7             	mov    rdi,r14
 10baeec:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
 10baef2:	84 c0                	test   al,al
 10baef4:	74 07                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baef6:	83 23 00             	and    DWORD PTR [rbx],0x0
 10baef9:	b0 01                	mov    al,0x1
 10baefb:	eb 02                	jmp    10baeff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282315>
 10baefd:	31 c0                	xor    eax,eax
 10baeff:	48 83 c4 08          	add    rsp,0x8
 10baf03:	5b                   	pop    rbx
 10baf04:	41 5e                	pop    r14
 10baf06:	c3                   	ret
 10baf07:	cc                   	int3
 10baf08:	41 56                	push   r14
 10baf0a:	53                   	push   rbx
 10baf0b:	48 83 ec 18          	sub    rsp,0x18
 10baf0f:	48 89 fb             	mov    rbx,rdi
 10baf12:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baf19:	00 00
 10baf1b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baf20:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baf23:	4c 8d 74 24 0c       	lea    r14,[rsp+0xc]
 10baf28:	4c 89 f6             	mov    rsi,r14
 10baf2b:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10baf2e:	80 7b 54 00          	cmp    BYTE PTR [rbx+0x54],0x0
 10baf32:	0f 94 c0             	sete   al
 10baf35:	41 83 3e 03          	cmp    DWORD PTR [r14],0x3
 10baf39:	0f 94 c1             	sete   cl
 10baf3c:	64 48 8b 14 25 28 00 	mov    rdx,QWORD PTR fs:0x28
 10baf43:	00 00
 10baf45:	48 3b 54 24 10       	cmp    rdx,QWORD PTR [rsp+0x10]
```
#### +0x10 target

```text
 10bab6a:	75 05                	jne    10bab71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281f87>
 10bab6c:	48 83 c4 18          	add    rsp,0x18
 10bab70:	c3                   	ret
 10bab71:	e8 3a 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bab76:	48 83 ec 18          	sub    rsp,0x18
 10bab7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bab81:	00 00
 10bab83:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab8b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab90:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
 10bab96:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab9d:	00 00
 10bab9f:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baba4:	75 05                	jne    10babab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281fc1>
 10baba6:	48 83 c4 18          	add    rsp,0x18
 10babaa:	c3                   	ret
 10babab:	e8 00 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10babb0:	41 56                	push   r14
 10babb2:	53                   	push   rbx
 10babb3:	50                   	push   rax
 10babb4:	48 89 f3             	mov    rbx,rsi
 10babb7:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10babbd:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10babc0:	83 e0 fe             	and    eax,0xfffffffe
 10babc3:	83 f8 02             	cmp    eax,0x2
 10babc6:	75 31                	jne    10babf9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28200f>
 10babc8:	49 89 fe             	mov    r14,rdi
 10babcb:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10babcf:	e8 d6 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10babd4:	84 c0                	test   al,al
 10babd6:	74 28                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babd8:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10babdc:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10babe0:	e8 95 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10babe5:	84 c0                	test   al,al
 10babe7:	74 17                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babe9:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10babec:	4c 89 f7             	mov    rdi,r14
 10babef:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
 10babf5:	84 c0                	test   al,al
 10babf7:	74 07                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babf9:	83 23 00             	and    DWORD PTR [rbx],0x0
 10babfc:	b0 01                	mov    al,0x1
 10babfe:	eb 02                	jmp    10bac02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282018>
 10bac00:	31 c0                	xor    eax,eax
 10bac02:	48 83 c4 08          	add    rsp,0x8
 10bac06:	5b                   	pop    rbx
 10bac07:	41 5e                	pop    r14
 10bac09:	c3                   	ret
 10bac0a:	48 83 ec 18          	sub    rsp,0x18
 10bac0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bac15:	00 00
 10bac17:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bac1c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bac1f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bac24:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 10bac2a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bac31:	00 00
 10bac33:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bac38:	75 05                	jne    10bac3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282055>
 10bac3a:	48 83 c4 18          	add    rsp,0x18
 10bac3e:	c3                   	ret
 10bac3f:	e8 6c 4e 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bac44:	41 56                	push   r14
 10bac46:	53                   	push   rbx
 10bac47:	50                   	push   rax
 10bac48:	48 89 f3             	mov    rbx,rsi
 10bac4b:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bac51:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bac54:	83 e0 fe             	and    eax,0xfffffffe
 10bac57:	83 f8 02             	cmp    eax,0x2
 10bac5a:	75 31                	jne    10bac8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820a3>
 10bac5c:	49 89 fe             	mov    r14,rdi
 10bac5f:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bac63:	e8 42 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bac68:	84 c0                	test   al,al
 10bac6a:	74 28                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac6c:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bac70:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bac74:	e8 01 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bac79:	84 c0                	test   al,al
 10bac7b:	74 17                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac7d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bac80:	4c 89 f7             	mov    rdi,r14
 10bac83:	ff 90 b0 01 00 00    	call   QWORD PTR [rax+0x1b0]
 10bac89:	84 c0                	test   al,al
 10bac8b:	74 07                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac8d:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bac90:	b0 01                	mov    al,0x1
 10bac92:	eb 02                	jmp    10bac96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820ac>
 10bac94:	31 c0                	xor    eax,eax
 10bac96:	48 83 c4 08          	add    rsp,0x8
```
### AP `0x184d658`: +0x78 -> `0x10bae60`, +0x10 -> `0x10bac0a` score=34 near restrictions methods

#### +0x78 target

```text
 10bae1d:	c3                   	ret
 10bae1e:	48 83 ec 18          	sub    rsp,0x18
 10bae22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae29:	00 00
 10bae2b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae30:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae33:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae38:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
 10bae3e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae45:	00 00
 10bae47:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae4c:	75 05                	jne    10bae53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282269>
 10bae4e:	48 83 c4 18          	add    rsp,0x18
 10bae52:	c3                   	ret
 10bae53:	e8 58 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae58:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bae5c:	0f 94 c0             	sete   al
 10bae5f:	c3                   	ret
 10bae60:	48 83 ec 18          	sub    rsp,0x18
 10bae64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae6b:	00 00
 10bae6d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae72:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae75:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae7a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
 10bae80:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae87:	00 00
 10bae89:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae8e:	75 05                	jne    10bae95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822ab>
 10bae90:	48 83 c4 18          	add    rsp,0x18
 10bae94:	c3                   	ret
 10bae95:	e8 16 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae9a:	41 56                	push   r14
 10bae9c:	53                   	push   rbx
 10bae9d:	50                   	push   rax
 10bae9e:	48 89 f3             	mov    rbx,rsi
 10baea1:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10baea7:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10baeaa:	83 e0 fe             	and    eax,0xfffffffe
 10baead:	83 f8 02             	cmp    eax,0x2
 10baeb0:	75 44                	jne    10baef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28230c>
 10baeb2:	49 89 fe             	mov    r14,rdi
 10baeb5:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 10baeb9:	48 85 ff             	test   rdi,rdi
 10baebc:	74 0a                	je     10baec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822de>
 10baebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baec1:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10baec4:	84 c0                	test   al,al
 10baec6:	75 35                	jne    10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baec8:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10baecc:	e8 d9 21 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10baed1:	84 c0                	test   al,al
 10baed3:	74 28                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baed5:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baed9:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baedd:	e8 98 22 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baee2:	84 c0                	test   al,al
 10baee4:	74 17                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baee6:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10baee9:	4c 89 f7             	mov    rdi,r14
 10baeec:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
 10baef2:	84 c0                	test   al,al
 10baef4:	74 07                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baef6:	83 23 00             	and    DWORD PTR [rbx],0x0
 10baef9:	b0 01                	mov    al,0x1
 10baefb:	eb 02                	jmp    10baeff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282315>
 10baefd:	31 c0                	xor    eax,eax
 10baeff:	48 83 c4 08          	add    rsp,0x8
 10baf03:	5b                   	pop    rbx
 10baf04:	41 5e                	pop    r14
 10baf06:	c3                   	ret
 10baf07:	cc                   	int3
 10baf08:	41 56                	push   r14
 10baf0a:	53                   	push   rbx
 10baf0b:	48 83 ec 18          	sub    rsp,0x18
 10baf0f:	48 89 fb             	mov    rbx,rdi
 10baf12:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baf19:	00 00
 10baf1b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baf20:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baf23:	4c 8d 74 24 0c       	lea    r14,[rsp+0xc]
 10baf28:	4c 89 f6             	mov    rsi,r14
 10baf2b:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10baf2e:	80 7b 54 00          	cmp    BYTE PTR [rbx+0x54],0x0
 10baf32:	0f 94 c0             	sete   al
 10baf35:	41 83 3e 03          	cmp    DWORD PTR [r14],0x3
 10baf39:	0f 94 c1             	sete   cl
 10baf3c:	64 48 8b 14 25 28 00 	mov    rdx,QWORD PTR fs:0x28
 10baf43:	00 00
 10baf45:	48 3b 54 24 10       	cmp    rdx,QWORD PTR [rsp+0x10]
 10baf4a:	75 0a                	jne    10baf56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28236c>
 10baf4c:	20 c8                	and    al,cl
 10baf4e:	48 83 c4 18          	add    rsp,0x18
```
#### +0x10 target

```text
 10babd8:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10babdc:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10babe0:	e8 95 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10babe5:	84 c0                	test   al,al
 10babe7:	74 17                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babe9:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10babec:	4c 89 f7             	mov    rdi,r14
 10babef:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
 10babf5:	84 c0                	test   al,al
 10babf7:	74 07                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babf9:	83 23 00             	and    DWORD PTR [rbx],0x0
 10babfc:	b0 01                	mov    al,0x1
 10babfe:	eb 02                	jmp    10bac02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282018>
 10bac00:	31 c0                	xor    eax,eax
 10bac02:	48 83 c4 08          	add    rsp,0x8
 10bac06:	5b                   	pop    rbx
 10bac07:	41 5e                	pop    r14
 10bac09:	c3                   	ret
 10bac0a:	48 83 ec 18          	sub    rsp,0x18
 10bac0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bac15:	00 00
 10bac17:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bac1c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bac1f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bac24:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 10bac2a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bac31:	00 00
 10bac33:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bac38:	75 05                	jne    10bac3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282055>
 10bac3a:	48 83 c4 18          	add    rsp,0x18
 10bac3e:	c3                   	ret
 10bac3f:	e8 6c 4e 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bac44:	41 56                	push   r14
 10bac46:	53                   	push   rbx
 10bac47:	50                   	push   rax
 10bac48:	48 89 f3             	mov    rbx,rsi
 10bac4b:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bac51:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bac54:	83 e0 fe             	and    eax,0xfffffffe
 10bac57:	83 f8 02             	cmp    eax,0x2
 10bac5a:	75 31                	jne    10bac8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820a3>
 10bac5c:	49 89 fe             	mov    r14,rdi
 10bac5f:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bac63:	e8 42 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bac68:	84 c0                	test   al,al
 10bac6a:	74 28                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac6c:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bac70:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bac74:	e8 01 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bac79:	84 c0                	test   al,al
 10bac7b:	74 17                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac7d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bac80:	4c 89 f7             	mov    rdi,r14
 10bac83:	ff 90 b0 01 00 00    	call   QWORD PTR [rax+0x1b0]
 10bac89:	84 c0                	test   al,al
 10bac8b:	74 07                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac8d:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bac90:	b0 01                	mov    al,0x1
 10bac92:	eb 02                	jmp    10bac96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820ac>
 10bac94:	31 c0                	xor    eax,eax
 10bac96:	48 83 c4 08          	add    rsp,0x8
 10bac9a:	5b                   	pop    rbx
 10bac9b:	41 5e                	pop    r14
 10bac9d:	c3                   	ret
 10bac9e:	48 83 ec 18          	sub    rsp,0x18
 10baca2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baca9:	00 00
 10bacab:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bacb0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bacb3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bacb8:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 10bacbe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bacc5:	00 00
 10bacc7:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baccc:	75 05                	jne    10bacd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820e9>
 10bacce:	48 83 c4 18          	add    rsp,0x18
 10bacd2:	c3                   	ret
 10bacd3:	e8 d8 4d 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bacd8:	41 56                	push   r14
 10bacda:	53                   	push   rbx
 10bacdb:	50                   	push   rax
 10bacdc:	48 89 f3             	mov    rbx,rsi
 10bacdf:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bace5:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bace8:	83 e0 fe             	and    eax,0xfffffffe
 10baceb:	83 f8 02             	cmp    eax,0x2
 10bacee:	75 38                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bacf0:	49 89 fe             	mov    r14,rdi
 10bacf3:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bacf7:	e8 ae 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bacfc:	84 c0                	test   al,al
 10bacfe:	74 11                	je     10bad11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282127>
 10bad00:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
```
### AP `0x184d6f0`: +0x78 -> `0x10bcff8`, +0x10 -> `0x10bb008` score=34 near restrictions methods

#### +0x78 target

```text
 10bcfc3:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
 10bcfca:	00
 10bcfcb:	75 08                	jne    10bcfd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2843eb>
 10bcfcd:	4c 89 f7             	mov    rdi,r14
 10bcfd0:	e8 fb 2c 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bcfd5:	e8 d6 2a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bcfda:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bcfdd:	83 c0 fe             	add    eax,0xfffffffe
 10bcfe0:	83 f8 03             	cmp    eax,0x3
 10bcfe3:	0f 92 c0             	setb   al
 10bcfe6:	c3                   	ret
 10bcfe7:	cc                   	int3
 10bcfe8:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bcfec:	0f 94 c0             	sete   al
 10bcfef:	c3                   	ret
 10bcff0:	80 7f 55 00          	cmp    BYTE PTR [rdi+0x55],0x0
 10bcff4:	0f 94 c0             	sete   al
 10bcff7:	c3                   	ret
 10bcff8:	83 7f 50 03          	cmp    DWORD PTR [rdi+0x50],0x3
 10bcffc:	0f 94 c0             	sete   al
 10bcfff:	c3                   	ret
 10bd000:	8a 47 56             	mov    al,BYTE PTR [rdi+0x56]
 10bd003:	c3                   	ret
 10bd004:	8a 47 57             	mov    al,BYTE PTR [rdi+0x57]
 10bd007:	c3                   	ret
 10bd008:	8a 47 58             	mov    al,BYTE PTR [rdi+0x58]
 10bd00b:	c3                   	ret
 10bd00c:	8a 47 59             	mov    al,BYTE PTR [rdi+0x59]
 10bd00f:	c3                   	ret
 10bd010:	8a 47 5a             	mov    al,BYTE PTR [rdi+0x5a]
 10bd013:	c3                   	ret
 10bd014:	53                   	push   rbx
 10bd015:	48 89 fb             	mov    rbx,rdi
 10bd018:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bd01c:	e8 89 00 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bd021:	84 c0                	test   al,al
 10bd023:	74 0e                	je     10bd033 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284449>
 10bd025:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 10bd029:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
 10bd02d:	5b                   	pop    rbx
 10bd02e:	e9 47 01 00 00       	jmp    10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bd033:	31 c0                	xor    eax,eax
 10bd035:	5b                   	pop    rbx
 10bd036:	c3                   	ret
 10bd037:	cc                   	int3
 10bd038:	53                   	push   rbx
 10bd039:	48 89 fb             	mov    rbx,rdi
 10bd03c:	48 8d 05 8d 05 79 00 	lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10bd043:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bd046:	48 81 c7 88 01 00 00 	add    rdi,0x188
 10bd04d:	e8 82 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd052:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
 10bd059:	e8 76 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd05e:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 10bd065:	e8 fc cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd06a:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
 10bd071:	e8 f0 cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd076:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10bd07d:	e8 d4 d6 ff ff       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>
 10bd082:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10bd086:	e8 49 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd08b:	48 83 c3 20          	add    rbx,0x20
 10bd08f:	48 89 df             	mov    rdi,rbx
 10bd092:	5b                   	pop    rbx
 10bd093:	e9 3c cb 71 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd098:	53                   	push   rbx
 10bd099:	48 89 fb             	mov    rbx,rdi
 10bd09c:	e8 97 ff ff ff       	call   10bd038 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28444e>
 10bd0a1:	48 89 df             	mov    rdi,rbx
 10bd0a4:	5b                   	pop    rbx
 10bd0a5:	e9 76 0e 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10bd0aa:	41 57                	push   r15
 10bd0ac:	41 56                	push   r14
 10bd0ae:	41 54                	push   r12
 10bd0b0:	53                   	push   rbx
 10bd0b1:	48 83 ec 58          	sub    rsp,0x58
 10bd0b5:	48 89 fb             	mov    rbx,rdi
 10bd0b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd0bf:	00 00
 10bd0c1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10bd0c6:	48 8d 35 fb b0 92 00 	lea    rsi,[rip+0x92b0fb]        # 19e81c8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27b8>
 10bd0cd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bd0d2:	e8 d3 4c 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bd0d7:	48 8d 35 af 58 2b ff 	lea    rsi,[rip+0xffffffffff2b58af]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
 10bd0de:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bd0e3:	e8 96 c9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bd0e8:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 10bd0eb:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
 10bd0f0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 10bd0f5:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
 10bd0fa:	4c 89 f7             	mov    rdi,r14
 10bd0fd:	4c 89 fa             	mov    rdx,r15
 10bd100:	4c 89 e1             	mov    rcx,r12
```
#### +0x10 target

```text
 10bafd0:	4c 89 fa             	mov    rdx,r15
 10bafd3:	e8 f2 ef 71 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
 10bafd8:	4c 89 ff             	mov    rdi,r15
 10bafdb:	e8 08 f8 71 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10bafe0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bafe7:	00 00
 10bafe9:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
 10bafee:	75 0d                	jne    10baffd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282413>
 10baff0:	48 89 d8             	mov    rax,rbx
 10baff3:	48 83 c4 50          	add    rsp,0x50
 10baff7:	5b                   	pop    rbx
 10baff8:	41 5e                	pop    r14
 10baffa:	41 5f                	pop    r15
 10baffc:	c3                   	ret
 10baffd:	e8 ae 4a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb002:	40 88 77 54          	mov    BYTE PTR [rdi+0x54],sil
 10bb006:	c3                   	ret
 10bb007:	cc                   	int3
 10bb008:	40 88 77 55          	mov    BYTE PTR [rdi+0x55],sil
 10bb00c:	c3                   	ret
 10bb00d:	cc                   	int3
 10bb00e:	31 c0                	xor    eax,eax
 10bb010:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bb014:	72 13                	jb     10bb029 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28243f>
 10bb016:	50                   	push   rax
 10bb017:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bb01b:	e8 8a 20 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bb020:	34 01                	xor    al,0x1
 10bb022:	0f b6 c0             	movzx  eax,al
 10bb025:	48 83 c4 08          	add    rsp,0x8
 10bb029:	c3                   	ret
 10bb02a:	31 c0                	xor    eax,eax
 10bb02c:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bb030:	0f 95 c0             	setne  al
 10bb033:	c3                   	ret
 10bb034:	41 56                	push   r14
 10bb036:	53                   	push   rbx
 10bb037:	48 83 ec 28          	sub    rsp,0x28
 10bb03b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb042:	00 00
 10bb044:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10bb049:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
 10bb04d:	48 8d 35 c4 d1 92 00 	lea    rsi,[rip+0x92d1c4]        # 19e8218 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2808>
 10bb054:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bb059:	4c 89 f7             	mov    rdi,r14
 10bb05c:	e8 49 6d 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bb061:	48 8d 54 24 07       	lea    rdx,[rsp+0x7]
 10bb066:	c6 02 01             	mov    BYTE PTR [rdx],0x1
 10bb069:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 10bb06c:	4c 89 f6             	mov    rsi,r14
 10bb06f:	e8 ea 26 ad ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
 10bb074:	89 c3                	mov    ebx,eax
 10bb076:	4c 89 f7             	mov    rdi,r14
 10bb079:	e8 12 2e 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bb07e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb085:	00 00
 10bb087:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bb08c:	75 0a                	jne    10bb098 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2824ae>
 10bb08e:	89 d8                	mov    eax,ebx
 10bb090:	48 83 c4 28          	add    rsp,0x28
 10bb094:	5b                   	pop    rbx
 10bb095:	41 5e                	pop    r14
 10bb097:	c3                   	ret
 10bb098:	e8 13 4a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb09d:	cc                   	int3
 10bb09e:	41 56                	push   r14
 10bb0a0:	53                   	push   rbx
 10bb0a1:	48 83 ec 48          	sub    rsp,0x48
 10bb0a5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb0ac:	00 00
 10bb0ae:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10bb0b3:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
 10bb0b8:	0f 57 c0             	xorps  xmm0,xmm0
 10bb0bb:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10bb0be:	48 8d 05 fb 26 79 00 	lea    rax,[rip+0x7926fb]        # 184d7c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ea8>
 10bb0c5:	48 89 43 f8          	mov    QWORD PTR [rbx-0x8],rax
 10bb0c9:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bb0cc:	83 f8 05             	cmp    eax,0x5
 10bb0cf:	6a 05                	push   0x5
 10bb0d1:	59                   	pop    rcx
 10bb0d2:	0f 42 c8             	cmovb  ecx,eax
 10bb0d5:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
 10bb0d8:	8a 47 54             	mov    al,BYTE PTR [rdi+0x54]
 10bb0db:	88 43 14             	mov    BYTE PTR [rbx+0x14],al
 10bb0de:	c7 43 08 03 00 00 00 	mov    DWORD PTR [rbx+0x8],0x3
 10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]
 10bb0e9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bb0ee:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10bb0f3:	e8 cc 4b 6c 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
 10bb0f8:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bb0fb:	48 8d 35 ae d0 92 00 	lea    rsi,[rip+0x92d0ae]        # 19e81b0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27a0>
 10bb102:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
 10bb107:	4c 89 f7             	mov    rdi,r14
```
### AP `0x184d6f8`: +0x78 -> `0x10bd000`, +0x10 -> `0x10bb00e` score=34 near restrictions methods

#### +0x78 target

```text
 10bcfcd:	4c 89 f7             	mov    rdi,r14
 10bcfd0:	e8 fb 2c 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bcfd5:	e8 d6 2a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bcfda:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bcfdd:	83 c0 fe             	add    eax,0xfffffffe
 10bcfe0:	83 f8 03             	cmp    eax,0x3
 10bcfe3:	0f 92 c0             	setb   al
 10bcfe6:	c3                   	ret
 10bcfe7:	cc                   	int3
 10bcfe8:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bcfec:	0f 94 c0             	sete   al
 10bcfef:	c3                   	ret
 10bcff0:	80 7f 55 00          	cmp    BYTE PTR [rdi+0x55],0x0
 10bcff4:	0f 94 c0             	sete   al
 10bcff7:	c3                   	ret
 10bcff8:	83 7f 50 03          	cmp    DWORD PTR [rdi+0x50],0x3
 10bcffc:	0f 94 c0             	sete   al
 10bcfff:	c3                   	ret
 10bd000:	8a 47 56             	mov    al,BYTE PTR [rdi+0x56]
 10bd003:	c3                   	ret
 10bd004:	8a 47 57             	mov    al,BYTE PTR [rdi+0x57]
 10bd007:	c3                   	ret
 10bd008:	8a 47 58             	mov    al,BYTE PTR [rdi+0x58]
 10bd00b:	c3                   	ret
 10bd00c:	8a 47 59             	mov    al,BYTE PTR [rdi+0x59]
 10bd00f:	c3                   	ret
 10bd010:	8a 47 5a             	mov    al,BYTE PTR [rdi+0x5a]
 10bd013:	c3                   	ret
 10bd014:	53                   	push   rbx
 10bd015:	48 89 fb             	mov    rbx,rdi
 10bd018:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bd01c:	e8 89 00 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bd021:	84 c0                	test   al,al
 10bd023:	74 0e                	je     10bd033 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284449>
 10bd025:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 10bd029:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
 10bd02d:	5b                   	pop    rbx
 10bd02e:	e9 47 01 00 00       	jmp    10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bd033:	31 c0                	xor    eax,eax
 10bd035:	5b                   	pop    rbx
 10bd036:	c3                   	ret
 10bd037:	cc                   	int3
 10bd038:	53                   	push   rbx
 10bd039:	48 89 fb             	mov    rbx,rdi
 10bd03c:	48 8d 05 8d 05 79 00 	lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10bd043:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bd046:	48 81 c7 88 01 00 00 	add    rdi,0x188
 10bd04d:	e8 82 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd052:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
 10bd059:	e8 76 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd05e:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 10bd065:	e8 fc cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd06a:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
 10bd071:	e8 f0 cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd076:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10bd07d:	e8 d4 d6 ff ff       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>
 10bd082:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10bd086:	e8 49 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd08b:	48 83 c3 20          	add    rbx,0x20
 10bd08f:	48 89 df             	mov    rdi,rbx
 10bd092:	5b                   	pop    rbx
 10bd093:	e9 3c cb 71 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd098:	53                   	push   rbx
 10bd099:	48 89 fb             	mov    rbx,rdi
 10bd09c:	e8 97 ff ff ff       	call   10bd038 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28444e>
 10bd0a1:	48 89 df             	mov    rdi,rbx
 10bd0a4:	5b                   	pop    rbx
 10bd0a5:	e9 76 0e 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10bd0aa:	41 57                	push   r15
 10bd0ac:	41 56                	push   r14
 10bd0ae:	41 54                	push   r12
 10bd0b0:	53                   	push   rbx
 10bd0b1:	48 83 ec 58          	sub    rsp,0x58
 10bd0b5:	48 89 fb             	mov    rbx,rdi
 10bd0b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd0bf:	00 00
 10bd0c1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10bd0c6:	48 8d 35 fb b0 92 00 	lea    rsi,[rip+0x92b0fb]        # 19e81c8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27b8>
 10bd0cd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bd0d2:	e8 d3 4c 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bd0d7:	48 8d 35 af 58 2b ff 	lea    rsi,[rip+0xffffffffff2b58af]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
 10bd0de:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bd0e3:	e8 96 c9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bd0e8:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 10bd0eb:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
 10bd0f0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 10bd0f5:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
 10bd0fa:	4c 89 f7             	mov    rdi,r14
 10bd0fd:	4c 89 fa             	mov    rdx,r15
 10bd100:	4c 89 e1             	mov    rcx,r12
 10bd103:	e8 e8 5e 55 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
 10bd108:	48 8d 35 6e 4e 39 ff 	lea    rsi,[rip+0xffffffffff394e6e]        # 451f7d <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b89>
 10bd10f:	4c 89 f7             	mov    rdi,r14
```
#### +0x10 target

```text
 10bafdb:	e8 08 f8 71 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10bafe0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bafe7:	00 00
 10bafe9:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
 10bafee:	75 0d                	jne    10baffd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282413>
 10baff0:	48 89 d8             	mov    rax,rbx
 10baff3:	48 83 c4 50          	add    rsp,0x50
 10baff7:	5b                   	pop    rbx
 10baff8:	41 5e                	pop    r14
 10baffa:	41 5f                	pop    r15
 10baffc:	c3                   	ret
 10baffd:	e8 ae 4a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb002:	40 88 77 54          	mov    BYTE PTR [rdi+0x54],sil
 10bb006:	c3                   	ret
 10bb007:	cc                   	int3
 10bb008:	40 88 77 55          	mov    BYTE PTR [rdi+0x55],sil
 10bb00c:	c3                   	ret
 10bb00d:	cc                   	int3
 10bb00e:	31 c0                	xor    eax,eax
 10bb010:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bb014:	72 13                	jb     10bb029 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28243f>
 10bb016:	50                   	push   rax
 10bb017:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bb01b:	e8 8a 20 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bb020:	34 01                	xor    al,0x1
 10bb022:	0f b6 c0             	movzx  eax,al
 10bb025:	48 83 c4 08          	add    rsp,0x8
 10bb029:	c3                   	ret
 10bb02a:	31 c0                	xor    eax,eax
 10bb02c:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bb030:	0f 95 c0             	setne  al
 10bb033:	c3                   	ret
 10bb034:	41 56                	push   r14
 10bb036:	53                   	push   rbx
 10bb037:	48 83 ec 28          	sub    rsp,0x28
 10bb03b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb042:	00 00
 10bb044:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10bb049:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
 10bb04d:	48 8d 35 c4 d1 92 00 	lea    rsi,[rip+0x92d1c4]        # 19e8218 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2808>
 10bb054:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bb059:	4c 89 f7             	mov    rdi,r14
 10bb05c:	e8 49 6d 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bb061:	48 8d 54 24 07       	lea    rdx,[rsp+0x7]
 10bb066:	c6 02 01             	mov    BYTE PTR [rdx],0x1
 10bb069:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 10bb06c:	4c 89 f6             	mov    rsi,r14
 10bb06f:	e8 ea 26 ad ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
 10bb074:	89 c3                	mov    ebx,eax
 10bb076:	4c 89 f7             	mov    rdi,r14
 10bb079:	e8 12 2e 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bb07e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb085:	00 00
 10bb087:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bb08c:	75 0a                	jne    10bb098 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2824ae>
 10bb08e:	89 d8                	mov    eax,ebx
 10bb090:	48 83 c4 28          	add    rsp,0x28
 10bb094:	5b                   	pop    rbx
 10bb095:	41 5e                	pop    r14
 10bb097:	c3                   	ret
 10bb098:	e8 13 4a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb09d:	cc                   	int3
 10bb09e:	41 56                	push   r14
 10bb0a0:	53                   	push   rbx
 10bb0a1:	48 83 ec 48          	sub    rsp,0x48
 10bb0a5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb0ac:	00 00
 10bb0ae:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10bb0b3:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
 10bb0b8:	0f 57 c0             	xorps  xmm0,xmm0
 10bb0bb:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10bb0be:	48 8d 05 fb 26 79 00 	lea    rax,[rip+0x7926fb]        # 184d7c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ea8>
 10bb0c5:	48 89 43 f8          	mov    QWORD PTR [rbx-0x8],rax
 10bb0c9:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bb0cc:	83 f8 05             	cmp    eax,0x5
 10bb0cf:	6a 05                	push   0x5
 10bb0d1:	59                   	pop    rcx
 10bb0d2:	0f 42 c8             	cmovb  ecx,eax
 10bb0d5:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
 10bb0d8:	8a 47 54             	mov    al,BYTE PTR [rdi+0x54]
 10bb0db:	88 43 14             	mov    BYTE PTR [rbx+0x14],al
 10bb0de:	c7 43 08 03 00 00 00 	mov    DWORD PTR [rbx+0x8],0x3
 10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]
 10bb0e9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bb0ee:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10bb0f3:	e8 cc 4b 6c 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
 10bb0f8:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bb0fb:	48 8d 35 ae d0 92 00 	lea    rsi,[rip+0x92d0ae]        # 19e81b0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27a0>
 10bb102:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
 10bb107:	4c 89 f7             	mov    rdi,r14
 10bb10a:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10bb10d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bb112:	e8 79 2d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
```
### AP `0x184d748`: +0x78 -> `0xaaa9b2`, +0x10 -> `0x10bcfe8` score=34 near restrictions methods

#### +0x78 target

```text
  aaa97e:	41 5c                	pop    r12
  aaa980:	41 5e                	pop    r14
  aaa982:	41 5f                	pop    r15
  aaa984:	c3                   	ret
  aaa985:	cc                   	int3
  aaa986:	48 8d 05 1b 2e d5 00 	lea    rax,[rip+0xd52e1b]        # 17fd7a8 <_ZTINSt6__ndk117bad_function_callE@@Base+0x848>
  aaa98d:	48 89 07             	mov    QWORD PTR [rdi],rax
  aaa990:	e9 7b 36 d4 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  aaa995:	cc                   	int3
  aaa996:	53                   	push   rbx
  aaa997:	48 89 fb             	mov    rbx,rdi
  aaa99a:	e8 e7 ff ff ff       	call   aaa986 <JNI_OnUnload@@Base+0x32253>
  aaa99f:	48 89 df             	mov    rdi,rbx
  aaa9a2:	5b                   	pop    rbx
  aaa9a3:	e9 78 35 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaa9a8:	48 83 c7 18          	add    rdi,0x18
  aaa9ac:	e9 eb 70 b3 00       	jmp    15e1a9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x427020>
  aaa9b1:	cc                   	int3
  aaa9b2:	48 83 c7 08          	add    rdi,0x8
  aaa9b6:	e9 4d 00 00 00       	jmp    aaaa08 <JNI_OnUnload@@Base+0x322d5>
  aaa9bb:	cc                   	int3
  aaa9bc:	53                   	push   rbx
  aaa9bd:	48 89 fb             	mov    rbx,rdi
  aaa9c0:	48 83 c7 08          	add    rdi,0x8
  aaa9c4:	e8 3f 00 00 00       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  aaa9c9:	48 89 df             	mov    rdi,rbx
  aaa9cc:	5b                   	pop    rbx
  aaa9cd:	e9 4e 35 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaa9d2:	0f 18 0d ff de e0 00 	prefetcht0 BYTE PTR [rip+0xe0deff]        # 18b88d8 <__cxa_unexpected_handler@@Base+0xc48>
  aaa9d9:	48 8d 05 f8 de e0 00 	lea    rax,[rip+0xe0def8]        # 18b88d8 <__cxa_unexpected_handler@@Base+0xc48>
  aaa9e0:	48 8b 0d f9 de e0 00 	mov    rcx,QWORD PTR [rip+0xe0def9]        # 18b88e0 <__cxa_unexpected_handler@@Base+0xc50>
  aaa9e7:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaa9ea:	c3                   	ret
  aaa9eb:	cc                   	int3
  aaa9ec:	48 89 f0             	mov    rax,rsi
  aaa9ef:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaa9f3:	48 8d 0d e6 2e d5 00 	lea    rcx,[rip+0xd52ee6]        # 17fd8e0 <_ZTINSt6__ndk117bad_function_callE@@Base+0x980>
  aaa9fa:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaa9fd:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
  aaaa02:	c6 46 18 00          	mov    BYTE PTR [rsi+0x18],0x0
  aaaa06:	c3                   	ret
  aaaa07:	cc                   	int3
  aaaa08:	f6 07 01             	test   BYTE PTR [rdi],0x1
  aaaa0b:	0f 85 cb 3f ca 00    	jne    174e9dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102b48>
  aaaa11:	c3                   	ret
  aaaa12:	0f 18 0d f7 dd e0 00 	prefetcht0 BYTE PTR [rip+0xe0ddf7]        # 18b8810 <__cxa_unexpected_handler@@Base+0xb80>
  aaaa19:	48 8d 05 f0 dd e0 00 	lea    rax,[rip+0xe0ddf0]        # 18b8810 <__cxa_unexpected_handler@@Base+0xb80>
  aaaa20:	48 8b 0d f1 dd e0 00 	mov    rcx,QWORD PTR [rip+0xe0ddf1]        # 18b8818 <__cxa_unexpected_handler@@Base+0xb88>
  aaaa27:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaaa2a:	c3                   	ret
  aaaa2b:	cc                   	int3
  aaaa2c:	48 89 f0             	mov    rax,rsi
  aaaa2f:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaaa33:	48 8d 0d e6 2e d5 00 	lea    rcx,[rip+0xd52ee6]        # 17fd920 <_ZTINSt6__ndk117bad_function_callE@@Base+0x9c0>
  aaaa3a:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaaa3d:	0f 57 c0             	xorps  xmm0,xmm0
  aaaa40:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  aaaa44:	c3                   	ret
  aaaa45:	cc                   	int3
  aaaa46:	0f 18 0d e3 dc e0 00 	prefetcht0 BYTE PTR [rip+0xe0dce3]        # 18b8730 <__cxa_unexpected_handler@@Base+0xaa0>
  aaaa4d:	48 8d 05 dc dc e0 00 	lea    rax,[rip+0xe0dcdc]        # 18b8730 <__cxa_unexpected_handler@@Base+0xaa0>
  aaaa54:	48 8b 0d dd dc e0 00 	mov    rcx,QWORD PTR [rip+0xe0dcdd]        # 18b8738 <__cxa_unexpected_handler@@Base+0xaa8>
  aaaa5b:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaaa5e:	c3                   	ret
  aaaa5f:	cc                   	int3
  aaaa60:	48 89 f0             	mov    rax,rsi
  aaaa63:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaaa67:	48 8d 0d 32 2e d5 00 	lea    rcx,[rip+0xd52e32]        # 17fd8a0 <_ZTINSt6__ndk117bad_function_callE@@Base+0x940>
  aaaa6e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaaa71:	0f 57 c0             	xorps  xmm0,xmm0
  aaaa74:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  aaaa78:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
  aaaa7d:	c3                   	ret
  aaaa7e:	53                   	push   rbx
  aaaa7f:	48 89 fb             	mov    rbx,rdi
  aaaa82:	48 83 c7 08          	add    rdi,0x8
  aaaa86:	e8 7d ff ff ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  aaaa8b:	48 8b 5b 18          	mov    rbx,QWORD PTR [rbx+0x18]
  aaaa8f:	48 85 db             	test   rbx,rbx
  aaaa92:	74 08                	je     aaaa9c <JNI_OnUnload@@Base+0x32369>
  aaaa94:	48 89 df             	mov    rdi,rbx
  aaaa97:	e8 72 00 00 00       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
  aaaa9c:	48 89 df             	mov    rdi,rbx
  aaaa9f:	5b                   	pop    rbx
  aaaaa0:	e9 7b 34 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaaaa5:	cc                   	int3
  aaaaa6:	53                   	push   rbx
  aaaaa7:	48 89 fb             	mov    rbx,rdi
  aaaaaa:	e8 cf ff ff ff       	call   aaaa7e <JNI_OnUnload@@Base+0x3234b>
  aaaaaf:	48 89 df             	mov    rdi,rbx
  aaaab2:	5b                   	pop    rbx
  aaaab3:	e9 68 34 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaaab8:	0f 18 0d a1 db e0 00 	prefetcht0 BYTE PTR [rip+0xe0dba1]        # 18b8660 <__cxa_unexpected_handler@@Base+0x9d0>
```
#### +0x10 target

```text
 10bcfa6:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10bcfab:	e8 8c b2 aa ff       	call   b6823c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb51dc>
 10bcfb0:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 10bcfb5:	e8 d6 0e 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bcfba:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bcfc1:	00 00
 10bcfc3:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
 10bcfca:	00
 10bcfcb:	75 08                	jne    10bcfd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2843eb>
 10bcfcd:	4c 89 f7             	mov    rdi,r14
 10bcfd0:	e8 fb 2c 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bcfd5:	e8 d6 2a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bcfda:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bcfdd:	83 c0 fe             	add    eax,0xfffffffe
 10bcfe0:	83 f8 03             	cmp    eax,0x3
 10bcfe3:	0f 92 c0             	setb   al
 10bcfe6:	c3                   	ret
 10bcfe7:	cc                   	int3
 10bcfe8:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bcfec:	0f 94 c0             	sete   al
 10bcfef:	c3                   	ret
 10bcff0:	80 7f 55 00          	cmp    BYTE PTR [rdi+0x55],0x0
 10bcff4:	0f 94 c0             	sete   al
 10bcff7:	c3                   	ret
 10bcff8:	83 7f 50 03          	cmp    DWORD PTR [rdi+0x50],0x3
 10bcffc:	0f 94 c0             	sete   al
 10bcfff:	c3                   	ret
 10bd000:	8a 47 56             	mov    al,BYTE PTR [rdi+0x56]
 10bd003:	c3                   	ret
 10bd004:	8a 47 57             	mov    al,BYTE PTR [rdi+0x57]
 10bd007:	c3                   	ret
 10bd008:	8a 47 58             	mov    al,BYTE PTR [rdi+0x58]
 10bd00b:	c3                   	ret
 10bd00c:	8a 47 59             	mov    al,BYTE PTR [rdi+0x59]
 10bd00f:	c3                   	ret
 10bd010:	8a 47 5a             	mov    al,BYTE PTR [rdi+0x5a]
 10bd013:	c3                   	ret
 10bd014:	53                   	push   rbx
 10bd015:	48 89 fb             	mov    rbx,rdi
 10bd018:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bd01c:	e8 89 00 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bd021:	84 c0                	test   al,al
 10bd023:	74 0e                	je     10bd033 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284449>
 10bd025:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 10bd029:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
 10bd02d:	5b                   	pop    rbx
 10bd02e:	e9 47 01 00 00       	jmp    10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bd033:	31 c0                	xor    eax,eax
 10bd035:	5b                   	pop    rbx
 10bd036:	c3                   	ret
 10bd037:	cc                   	int3
 10bd038:	53                   	push   rbx
 10bd039:	48 89 fb             	mov    rbx,rdi
 10bd03c:	48 8d 05 8d 05 79 00 	lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10bd043:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bd046:	48 81 c7 88 01 00 00 	add    rdi,0x188
 10bd04d:	e8 82 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd052:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
 10bd059:	e8 76 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd05e:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 10bd065:	e8 fc cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd06a:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
 10bd071:	e8 f0 cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd076:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10bd07d:	e8 d4 d6 ff ff       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>
 10bd082:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10bd086:	e8 49 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd08b:	48 83 c3 20          	add    rbx,0x20
 10bd08f:	48 89 df             	mov    rdi,rbx
 10bd092:	5b                   	pop    rbx
 10bd093:	e9 3c cb 71 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd098:	53                   	push   rbx
 10bd099:	48 89 fb             	mov    rbx,rdi
 10bd09c:	e8 97 ff ff ff       	call   10bd038 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28444e>
 10bd0a1:	48 89 df             	mov    rdi,rbx
 10bd0a4:	5b                   	pop    rbx
 10bd0a5:	e9 76 0e 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10bd0aa:	41 57                	push   r15
 10bd0ac:	41 56                	push   r14
 10bd0ae:	41 54                	push   r12
 10bd0b0:	53                   	push   rbx
 10bd0b1:	48 83 ec 58          	sub    rsp,0x58
 10bd0b5:	48 89 fb             	mov    rbx,rdi
 10bd0b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd0bf:	00 00
 10bd0c1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10bd0c6:	48 8d 35 fb b0 92 00 	lea    rsi,[rip+0x92b0fb]        # 19e81c8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27b8>
 10bd0cd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bd0d2:	e8 d3 4c 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bd0d7:	48 8d 35 af 58 2b ff 	lea    rsi,[rip+0xffffffffff2b58af]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
 10bd0de:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bd0e3:	e8 96 c9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bd0e8:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
```
### AP `0x184cd60`: +0x78 -> `0xaaac5c`, +0x10 -> `0x10b0690` score=33 near restrictions methods

#### +0x78 target

```text
  aaac1f:	0f 57 c0             	xorps  xmm0,xmm0
  aaac22:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  aaac26:	c3                   	ret
  aaac27:	cc                   	int3
  aaac28:	0f 18 0d f9 d5 e0 00 	prefetcht0 BYTE PTR [rip+0xe0d5f9]        # 18b8228 <__cxa_unexpected_handler@@Base+0x598>
  aaac2f:	48 8d 05 f2 d5 e0 00 	lea    rax,[rip+0xe0d5f2]        # 18b8228 <__cxa_unexpected_handler@@Base+0x598>
  aaac36:	48 8b 0d f3 d5 e0 00 	mov    rcx,QWORD PTR [rip+0xe0d5f3]        # 18b8230 <__cxa_unexpected_handler@@Base+0x5a0>
  aaac3d:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaac40:	c3                   	ret
  aaac41:	cc                   	int3
  aaac42:	48 89 f0             	mov    rax,rsi
  aaac45:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaac49:	48 8d 0d 50 2d d5 00 	lea    rcx,[rip+0xd52d50]        # 17fd9a0 <_ZTINSt6__ndk117bad_function_callE@@Base+0xa40>
  aaac50:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaac53:	0f 57 c0             	xorps  xmm0,xmm0
  aaac56:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  aaac5a:	c3                   	ret
  aaac5b:	cc                   	int3
  aaac5c:	53                   	push   rbx
  aaac5d:	48 89 fb             	mov    rbx,rdi
  aaac60:	48 83 c7 08          	add    rdi,0x8
  aaac64:	e8 9f fd ff ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  aaac69:	48 8b 5b 18          	mov    rbx,QWORD PTR [rbx+0x18]
  aaac6d:	48 85 db             	test   rbx,rbx
  aaac70:	74 09                	je     aaac7b <JNI_OnUnload@@Base+0x32548>
  aaac72:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
  aaac76:	e8 8d fd ff ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  aaac7b:	48 89 df             	mov    rdi,rbx
  aaac7e:	5b                   	pop    rbx
  aaac7f:	e9 9c 32 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaac84:	53                   	push   rbx
  aaac85:	48 89 fb             	mov    rbx,rdi
  aaac88:	e8 cf ff ff ff       	call   aaac5c <JNI_OnUnload@@Base+0x32529>
  aaac8d:	48 89 df             	mov    rdi,rbx
  aaac90:	5b                   	pop    rbx
  aaac91:	e9 8a 32 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaac96:	0f 18 0d 63 d4 e0 00 	prefetcht0 BYTE PTR [rip+0xe0d463]        # 18b8100 <__cxa_unexpected_handler@@Base+0x470>
  aaac9d:	48 8d 05 5c d4 e0 00 	lea    rax,[rip+0xe0d45c]        # 18b8100 <__cxa_unexpected_handler@@Base+0x470>
  aaaca4:	48 8b 0d 5d d4 e0 00 	mov    rcx,QWORD PTR [rip+0xe0d45d]        # 18b8108 <__cxa_unexpected_handler@@Base+0x478>
  aaacab:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaacae:	c3                   	ret
  aaacaf:	cc                   	int3
  aaacb0:	48 89 f0             	mov    rax,rsi
  aaacb3:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaacb7:	48 8d 0d e2 2d d5 00 	lea    rcx,[rip+0xd52de2]        # 17fdaa0 <_ZTINSt6__ndk117bad_function_callE@@Base+0xb40>
  aaacbe:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaacc1:	0f 57 c0             	xorps  xmm0,xmm0
  aaacc4:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  aaacc8:	0f 11 46 19          	movups XMMWORD PTR [rsi+0x19],xmm0
  aaaccc:	c3                   	ret
  aaaccd:	cc                   	int3
  aaacce:	48 89 f0             	mov    rax,rsi
  aaacd1:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaacd5:	48 8d 0d 04 2d d5 00 	lea    rcx,[rip+0xd52d04]        # 17fd9e0 <_ZTINSt6__ndk117bad_function_callE@@Base+0xa80>
  aaacdc:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaacdf:	0f 57 c0             	xorps  xmm0,xmm0
  aaace2:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  aaace6:	83 66 20 00          	and    DWORD PTR [rsi+0x20],0x0
  aaacea:	c3                   	ret
  aaaceb:	cc                   	int3
  aaacec:	0f 18 0d 35 d2 e0 00 	prefetcht0 BYTE PTR [rip+0xe0d235]        # 18b7f28 <__cxa_unexpected_handler@@Base+0x298>
  aaacf3:	48 8d 05 2e d2 e0 00 	lea    rax,[rip+0xe0d22e]        # 18b7f28 <__cxa_unexpected_handler@@Base+0x298>
  aaacfa:	48 8b 0d 2f d2 e0 00 	mov    rcx,QWORD PTR [rip+0xe0d22f]        # 18b7f30 <__cxa_unexpected_handler@@Base+0x2a0>
  aaad01:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaad04:	c3                   	ret
  aaad05:	cc                   	int3
  aaad06:	53                   	push   rbx
  aaad07:	40 f6 c7 03          	test   dil,0x3
  aaad0b:	74 1d                	je     aaad2a <JNI_OnUnload@@Base+0x325f7>
  aaad0d:	48 89 f3             	mov    rbx,rsi
  aaad10:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
  aaad14:	e8 1d 0b fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  aaad19:	48 85 db             	test   rbx,rbx
  aaad1c:	74 11                	je     aaad2f <JNI_OnUnload@@Base+0x325fc>
  aaad1e:	48 89 df             	mov    rdi,rbx
  aaad21:	48 89 c6             	mov    rsi,rax
  aaad24:	5b                   	pop    rbx
  aaad25:	e9 bf a9 cb 00       	jmp    17656e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119855>
  aaad2a:	48 89 f8             	mov    rax,rdi
  aaad2d:	5b                   	pop    rbx
  aaad2e:	c3                   	ret
  aaad2f:	48 89 c7             	mov    rdi,rax
  aaad32:	48 89 d6             	mov    rsi,rdx
  aaad35:	5b                   	pop    rbx
  aaad36:	e9 dc a9 cb 00       	jmp    1765717 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119883>
  aaad3b:	80 3d d6 87 f3 00 00 	cmp    BYTE PTR [rip+0xf387d6],0x0        # 19e3518 <__cxa_new_handler@@Base+0x2da8>
  aaad42:	74 01                	je     aaad45 <JNI_OnUnload@@Base+0x32612>
  aaad44:	c3                   	ret
  aaad45:	c6 05 cc 87 f3 00 01 	mov    BYTE PTR [rip+0xf387cc],0x1        # 19e3518 <__cxa_new_handler@@Base+0x2da8>
  aaad4c:	48 8d 3d d5 f0 fc ff 	lea    rdi,[rip+0xfffffffffffcf0d5]        # a79e28 <JNI_OnUnload@@Base+0x16f5>
  aaad53:	48 8d 35 ce 87 f3 00 	lea    rsi,[rip+0xf387ce]        # 19e3528 <__cxa_new_handler@@Base+0x2db8>
  aaad5a:	48 8d 15 9f 92 d4 00 	lea    rdx,[rip+0xd4929f]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  aaad61:	e9 fa 30 d4 00       	jmp    17ede60 <__cxa_atexit@plt>
```
#### +0x10 target

```text
 10b0656:	e8 e1 d5 ff ff       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10b065b:	48 83 c3 10          	add    rbx,0x10
 10b065f:	48 89 df             	mov    rdi,rbx
 10b0662:	48 83 c4 08          	add    rsp,0x8
 10b0666:	5b                   	pop    rbx
 10b0667:	41 5e                	pop    r14
 10b0669:	e9 22 d8 73 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b066e:	53                   	push   rbx
 10b066f:	48 89 fb             	mov    rbx,rdi
 10b0672:	e8 97 ff ff ff       	call   10b060e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277a24>
 10b0677:	48 89 df             	mov    rdi,rbx
 10b067a:	5b                   	pop    rbx
 10b067b:	e9 a0 d8 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10b0680:	48 8b 87 80 00 00 00 	mov    rax,QWORD PTR [rdi+0x80]
 10b0687:	48 3b 47 28          	cmp    rax,QWORD PTR [rdi+0x28]
 10b068b:	0f 93 c0             	setae  al
 10b068e:	c3                   	ret
 10b068f:	cc                   	int3
 10b0690:	41 57                	push   r15
 10b0692:	41 56                	push   r14
 10b0694:	53                   	push   rbx
 10b0695:	48 83 ec 50          	sub    rsp,0x50
 10b0699:	49 89 f6             	mov    r14,rsi
 10b069c:	48 89 fb             	mov    rbx,rdi
 10b069f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b06a6:	00 00
 10b06a8:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 10b06ad:	49 81 c6 a0 00 00 00 	add    r14,0xa0
 10b06b4:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
 10b06b9:	4c 89 ff             	mov    rdi,r15
 10b06bc:	48 89 d6             	mov    rsi,rdx
 10b06bf:	e8 16 a0 72 00       	call   17da6da <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x64fb>
 10b06c4:	48 89 df             	mov    rdi,rbx
 10b06c7:	4c 89 f6             	mov    rsi,r14
 10b06ca:	4c 89 fa             	mov    rdx,r15
 10b06cd:	e8 f8 98 72 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
 10b06d2:	4c 89 ff             	mov    rdi,r15
 10b06d5:	e8 0e a1 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10b06da:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b06e1:	00 00
 10b06e3:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
 10b06e8:	75 0d                	jne    10b06f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b0d>
 10b06ea:	48 89 d8             	mov    rax,rbx
 10b06ed:	48 83 c4 50          	add    rsp,0x50
 10b06f1:	5b                   	pop    rbx
 10b06f2:	41 5e                	pop    r14
 10b06f4:	41 5f                	pop    r15
 10b06f6:	c3                   	ret
 10b06f7:	e8 b4 f3 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10b06fc:	55                   	push   rbp
 10b06fd:	53                   	push   rbx
 10b06fe:	50                   	push   rax
 10b06ff:	48 89 fb             	mov    rbx,rdi
 10b0702:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b0705:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b0708:	89 c5                	mov    ebp,eax
 10b070a:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10b070e:	e8 47 48 db ff       	call   e64f5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c370>
 10b0713:	48 8b bb 90 00 00 00 	mov    rdi,QWORD PTR [rbx+0x90]
 10b071a:	e8 8d 12 71 00       	call   17c19ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175b18>
 10b071f:	84 c0                	test   al,al
 10b0721:	74 0c                	je     10b072f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b45>
 10b0723:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
 10b072a:	e8 09 12 71 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
 10b072f:	40 84 ed             	test   bpl,bpl
 10b0732:	74 15                	je     10b0749 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277b5f>
 10b0734:	48 81 c3 a0 00 00 00 	add    rbx,0xa0
 10b073b:	48 89 df             	mov    rdi,rbx
 10b073e:	48 83 c4 08          	add    rsp,0x8
 10b0742:	5b                   	pop    rbx
 10b0743:	5d                   	pop    rbp
 10b0744:	e9 5f 83 a7 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 10b0749:	48 83 c4 08          	add    rsp,0x8
 10b074d:	5b                   	pop    rbx
 10b074e:	5d                   	pop    rbp
 10b074f:	c3                   	ret
 10b0750:	55                   	push   rbp
 10b0751:	41 57                	push   r15
 10b0753:	41 56                	push   r14
 10b0755:	41 55                	push   r13
 10b0757:	41 54                	push   r12
 10b0759:	53                   	push   rbx
 10b075a:	48 83 ec 78          	sub    rsp,0x78
 10b075e:	49 89 fe             	mov    r14,rdi
 10b0761:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b0768:	00 00
 10b076a:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 10b076f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b0772:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b0775:	89 c3                	mov    ebx,eax
 10b0777:	4c 89 f7             	mov    rdi,r14
 10b077a:	e8 d3 01 00 00       	call   10b0952 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d68>
 10b077f:	49 8b 06             	mov    rax,QWORD PTR [r14]
```
### AP `0x184d648`: +0x78 -> `0x10badc4`, +0x10 -> `0x10bab76` score=33 near restrictions methods

#### +0x78 target

```text
 10bad82:	83 f8 02             	cmp    eax,0x2
 10bad85:	0f 95 c0             	setne  al
 10bad88:	c3                   	ret
 10bad89:	cc                   	int3
 10bad8a:	48 83 ec 18          	sub    rsp,0x18
 10bad8e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bad95:	00 00
 10bad97:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bad9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad9f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bada4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
 10badaa:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10badb1:	00 00
 10badb3:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10badb8:	75 05                	jne    10badbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2821d5>
 10badba:	48 83 c4 18          	add    rsp,0x18
 10badbe:	c3                   	ret
 10badbf:	e8 ec 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10badc4:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10badca:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10badcd:	83 e0 fe             	and    eax,0xfffffffe
 10badd0:	31 c9                	xor    ecx,ecx
 10badd2:	83 f8 02             	cmp    eax,0x2
 10badd5:	0f 95 c0             	setne  al
 10badd8:	0f 94 c1             	sete   cl
 10baddb:	89 0e                	mov    DWORD PTR [rsi],ecx
 10baddd:	c3                   	ret
 10badde:	48 83 ec 18          	sub    rsp,0x18
 10bade2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bade9:	00 00
 10badeb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10badf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10badf3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10badf8:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
 10badfe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae05:	00 00
 10bae07:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae0c:	75 05                	jne    10bae13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282229>
 10bae0e:	48 83 c4 18          	add    rsp,0x18
 10bae12:	c3                   	ret
 10bae13:	e8 98 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae18:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bae1b:	b0 01                	mov    al,0x1
 10bae1d:	c3                   	ret
 10bae1e:	48 83 ec 18          	sub    rsp,0x18
 10bae22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae29:	00 00
 10bae2b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae30:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae33:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae38:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
 10bae3e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae45:	00 00
 10bae47:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae4c:	75 05                	jne    10bae53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282269>
 10bae4e:	48 83 c4 18          	add    rsp,0x18
 10bae52:	c3                   	ret
 10bae53:	e8 58 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae58:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bae5c:	0f 94 c0             	sete   al
 10bae5f:	c3                   	ret
 10bae60:	48 83 ec 18          	sub    rsp,0x18
 10bae64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae6b:	00 00
 10bae6d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae72:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae75:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae7a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
 10bae80:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae87:	00 00
 10bae89:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae8e:	75 05                	jne    10bae95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822ab>
 10bae90:	48 83 c4 18          	add    rsp,0x18
 10bae94:	c3                   	ret
 10bae95:	e8 16 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae9a:	41 56                	push   r14
 10bae9c:	53                   	push   rbx
 10bae9d:	50                   	push   rax
 10bae9e:	48 89 f3             	mov    rbx,rsi
 10baea1:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10baea7:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10baeaa:	83 e0 fe             	and    eax,0xfffffffe
 10baead:	83 f8 02             	cmp    eax,0x2
 10baeb0:	75 44                	jne    10baef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28230c>
 10baeb2:	49 89 fe             	mov    r14,rdi
 10baeb5:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 10baeb9:	48 85 ff             	test   rdi,rdi
 10baebc:	74 0a                	je     10baec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822de>
 10baebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baec1:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10baec4:	84 c0                	test   al,al
 10baec6:	75 35                	jne    10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baec8:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
```
#### +0x10 target

```text
 10bab37:	5b                   	pop    rbx
 10bab38:	41 5e                	pop    r14
 10bab3a:	c3                   	ret
 10bab3b:	cc                   	int3
 10bab3c:	48 83 ec 18          	sub    rsp,0x18
 10bab40:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bab47:	00 00
 10bab49:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab4e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab51:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab56:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
 10bab5c:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab63:	00 00
 10bab65:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bab6a:	75 05                	jne    10bab71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281f87>
 10bab6c:	48 83 c4 18          	add    rsp,0x18
 10bab70:	c3                   	ret
 10bab71:	e8 3a 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bab76:	48 83 ec 18          	sub    rsp,0x18
 10bab7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bab81:	00 00
 10bab83:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab8b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab90:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
 10bab96:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab9d:	00 00
 10bab9f:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baba4:	75 05                	jne    10babab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281fc1>
 10baba6:	48 83 c4 18          	add    rsp,0x18
 10babaa:	c3                   	ret
 10babab:	e8 00 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10babb0:	41 56                	push   r14
 10babb2:	53                   	push   rbx
 10babb3:	50                   	push   rax
 10babb4:	48 89 f3             	mov    rbx,rsi
 10babb7:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10babbd:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10babc0:	83 e0 fe             	and    eax,0xfffffffe
 10babc3:	83 f8 02             	cmp    eax,0x2
 10babc6:	75 31                	jne    10babf9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28200f>
 10babc8:	49 89 fe             	mov    r14,rdi
 10babcb:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10babcf:	e8 d6 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10babd4:	84 c0                	test   al,al
 10babd6:	74 28                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babd8:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10babdc:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10babe0:	e8 95 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10babe5:	84 c0                	test   al,al
 10babe7:	74 17                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babe9:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10babec:	4c 89 f7             	mov    rdi,r14
 10babef:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
 10babf5:	84 c0                	test   al,al
 10babf7:	74 07                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babf9:	83 23 00             	and    DWORD PTR [rbx],0x0
 10babfc:	b0 01                	mov    al,0x1
 10babfe:	eb 02                	jmp    10bac02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282018>
 10bac00:	31 c0                	xor    eax,eax
 10bac02:	48 83 c4 08          	add    rsp,0x8
 10bac06:	5b                   	pop    rbx
 10bac07:	41 5e                	pop    r14
 10bac09:	c3                   	ret
 10bac0a:	48 83 ec 18          	sub    rsp,0x18
 10bac0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bac15:	00 00
 10bac17:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bac1c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bac1f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bac24:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 10bac2a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bac31:	00 00
 10bac33:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bac38:	75 05                	jne    10bac3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282055>
 10bac3a:	48 83 c4 18          	add    rsp,0x18
 10bac3e:	c3                   	ret
 10bac3f:	e8 6c 4e 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bac44:	41 56                	push   r14
 10bac46:	53                   	push   rbx
 10bac47:	50                   	push   rax
 10bac48:	48 89 f3             	mov    rbx,rsi
 10bac4b:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bac51:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bac54:	83 e0 fe             	and    eax,0xfffffffe
 10bac57:	83 f8 02             	cmp    eax,0x2
 10bac5a:	75 31                	jne    10bac8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820a3>
 10bac5c:	49 89 fe             	mov    r14,rdi
 10bac5f:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bac63:	e8 42 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bac68:	84 c0                	test   al,al
 10bac6a:	74 28                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac6c:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
```
### AP `0x184d6e8`: +0x78 -> `0x10bcff0`, +0x10 -> `0x10bb002` score=33 near restrictions methods

#### +0x78 target

```text
 10bcfb5:	e8 d6 0e 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bcfba:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bcfc1:	00 00
 10bcfc3:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
 10bcfca:	00
 10bcfcb:	75 08                	jne    10bcfd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2843eb>
 10bcfcd:	4c 89 f7             	mov    rdi,r14
 10bcfd0:	e8 fb 2c 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bcfd5:	e8 d6 2a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bcfda:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bcfdd:	83 c0 fe             	add    eax,0xfffffffe
 10bcfe0:	83 f8 03             	cmp    eax,0x3
 10bcfe3:	0f 92 c0             	setb   al
 10bcfe6:	c3                   	ret
 10bcfe7:	cc                   	int3
 10bcfe8:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bcfec:	0f 94 c0             	sete   al
 10bcfef:	c3                   	ret
 10bcff0:	80 7f 55 00          	cmp    BYTE PTR [rdi+0x55],0x0
 10bcff4:	0f 94 c0             	sete   al
 10bcff7:	c3                   	ret
 10bcff8:	83 7f 50 03          	cmp    DWORD PTR [rdi+0x50],0x3
 10bcffc:	0f 94 c0             	sete   al
 10bcfff:	c3                   	ret
 10bd000:	8a 47 56             	mov    al,BYTE PTR [rdi+0x56]
 10bd003:	c3                   	ret
 10bd004:	8a 47 57             	mov    al,BYTE PTR [rdi+0x57]
 10bd007:	c3                   	ret
 10bd008:	8a 47 58             	mov    al,BYTE PTR [rdi+0x58]
 10bd00b:	c3                   	ret
 10bd00c:	8a 47 59             	mov    al,BYTE PTR [rdi+0x59]
 10bd00f:	c3                   	ret
 10bd010:	8a 47 5a             	mov    al,BYTE PTR [rdi+0x5a]
 10bd013:	c3                   	ret
 10bd014:	53                   	push   rbx
 10bd015:	48 89 fb             	mov    rbx,rdi
 10bd018:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bd01c:	e8 89 00 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bd021:	84 c0                	test   al,al
 10bd023:	74 0e                	je     10bd033 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284449>
 10bd025:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 10bd029:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
 10bd02d:	5b                   	pop    rbx
 10bd02e:	e9 47 01 00 00       	jmp    10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bd033:	31 c0                	xor    eax,eax
 10bd035:	5b                   	pop    rbx
 10bd036:	c3                   	ret
 10bd037:	cc                   	int3
 10bd038:	53                   	push   rbx
 10bd039:	48 89 fb             	mov    rbx,rdi
 10bd03c:	48 8d 05 8d 05 79 00 	lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10bd043:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bd046:	48 81 c7 88 01 00 00 	add    rdi,0x188
 10bd04d:	e8 82 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd052:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
 10bd059:	e8 76 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd05e:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 10bd065:	e8 fc cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd06a:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
 10bd071:	e8 f0 cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd076:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10bd07d:	e8 d4 d6 ff ff       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>
 10bd082:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10bd086:	e8 49 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd08b:	48 83 c3 20          	add    rbx,0x20
 10bd08f:	48 89 df             	mov    rdi,rbx
 10bd092:	5b                   	pop    rbx
 10bd093:	e9 3c cb 71 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd098:	53                   	push   rbx
 10bd099:	48 89 fb             	mov    rbx,rdi
 10bd09c:	e8 97 ff ff ff       	call   10bd038 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28444e>
 10bd0a1:	48 89 df             	mov    rdi,rbx
 10bd0a4:	5b                   	pop    rbx
 10bd0a5:	e9 76 0e 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10bd0aa:	41 57                	push   r15
 10bd0ac:	41 56                	push   r14
 10bd0ae:	41 54                	push   r12
 10bd0b0:	53                   	push   rbx
 10bd0b1:	48 83 ec 58          	sub    rsp,0x58
 10bd0b5:	48 89 fb             	mov    rbx,rdi
 10bd0b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd0bf:	00 00
 10bd0c1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10bd0c6:	48 8d 35 fb b0 92 00 	lea    rsi,[rip+0x92b0fb]        # 19e81c8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27b8>
 10bd0cd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bd0d2:	e8 d3 4c 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bd0d7:	48 8d 35 af 58 2b ff 	lea    rsi,[rip+0xffffffffff2b58af]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
 10bd0de:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bd0e3:	e8 96 c9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bd0e8:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 10bd0eb:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
 10bd0f0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 10bd0f5:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
```
#### +0x10 target

```text
 10bafc5:	e8 10 f7 71 00       	call   17da6da <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x64fb>
 10bafca:	48 89 df             	mov    rdi,rbx
 10bafcd:	4c 89 f6             	mov    rsi,r14
 10bafd0:	4c 89 fa             	mov    rdx,r15
 10bafd3:	e8 f2 ef 71 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
 10bafd8:	4c 89 ff             	mov    rdi,r15
 10bafdb:	e8 08 f8 71 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10bafe0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bafe7:	00 00
 10bafe9:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
 10bafee:	75 0d                	jne    10baffd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282413>
 10baff0:	48 89 d8             	mov    rax,rbx
 10baff3:	48 83 c4 50          	add    rsp,0x50
 10baff7:	5b                   	pop    rbx
 10baff8:	41 5e                	pop    r14
 10baffa:	41 5f                	pop    r15
 10baffc:	c3                   	ret
 10baffd:	e8 ae 4a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb002:	40 88 77 54          	mov    BYTE PTR [rdi+0x54],sil
 10bb006:	c3                   	ret
 10bb007:	cc                   	int3
 10bb008:	40 88 77 55          	mov    BYTE PTR [rdi+0x55],sil
 10bb00c:	c3                   	ret
 10bb00d:	cc                   	int3
 10bb00e:	31 c0                	xor    eax,eax
 10bb010:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bb014:	72 13                	jb     10bb029 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28243f>
 10bb016:	50                   	push   rax
 10bb017:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bb01b:	e8 8a 20 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bb020:	34 01                	xor    al,0x1
 10bb022:	0f b6 c0             	movzx  eax,al
 10bb025:	48 83 c4 08          	add    rsp,0x8
 10bb029:	c3                   	ret
 10bb02a:	31 c0                	xor    eax,eax
 10bb02c:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bb030:	0f 95 c0             	setne  al
 10bb033:	c3                   	ret
 10bb034:	41 56                	push   r14
 10bb036:	53                   	push   rbx
 10bb037:	48 83 ec 28          	sub    rsp,0x28
 10bb03b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb042:	00 00
 10bb044:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10bb049:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
 10bb04d:	48 8d 35 c4 d1 92 00 	lea    rsi,[rip+0x92d1c4]        # 19e8218 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2808>
 10bb054:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bb059:	4c 89 f7             	mov    rdi,r14
 10bb05c:	e8 49 6d 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bb061:	48 8d 54 24 07       	lea    rdx,[rsp+0x7]
 10bb066:	c6 02 01             	mov    BYTE PTR [rdx],0x1
 10bb069:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 10bb06c:	4c 89 f6             	mov    rsi,r14
 10bb06f:	e8 ea 26 ad ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
 10bb074:	89 c3                	mov    ebx,eax
 10bb076:	4c 89 f7             	mov    rdi,r14
 10bb079:	e8 12 2e 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bb07e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb085:	00 00
 10bb087:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bb08c:	75 0a                	jne    10bb098 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2824ae>
 10bb08e:	89 d8                	mov    eax,ebx
 10bb090:	48 83 c4 28          	add    rsp,0x28
 10bb094:	5b                   	pop    rbx
 10bb095:	41 5e                	pop    r14
 10bb097:	c3                   	ret
 10bb098:	e8 13 4a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb09d:	cc                   	int3
 10bb09e:	41 56                	push   r14
 10bb0a0:	53                   	push   rbx
 10bb0a1:	48 83 ec 48          	sub    rsp,0x48
 10bb0a5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb0ac:	00 00
 10bb0ae:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10bb0b3:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
 10bb0b8:	0f 57 c0             	xorps  xmm0,xmm0
 10bb0bb:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10bb0be:	48 8d 05 fb 26 79 00 	lea    rax,[rip+0x7926fb]        # 184d7c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ea8>
 10bb0c5:	48 89 43 f8          	mov    QWORD PTR [rbx-0x8],rax
 10bb0c9:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bb0cc:	83 f8 05             	cmp    eax,0x5
 10bb0cf:	6a 05                	push   0x5
 10bb0d1:	59                   	pop    rcx
 10bb0d2:	0f 42 c8             	cmovb  ecx,eax
 10bb0d5:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
 10bb0d8:	8a 47 54             	mov    al,BYTE PTR [rdi+0x54]
 10bb0db:	88 43 14             	mov    BYTE PTR [rbx+0x14],al
 10bb0de:	c7 43 08 03 00 00 00 	mov    DWORD PTR [rbx+0x8],0x3
 10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]
 10bb0e9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bb0ee:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10bb0f3:	e8 cc 4b 6c 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
 10bb0f8:	49 8b 06             	mov    rax,QWORD PTR [r14]
```
### AP `0x184cda0`: +0x78 -> `0x10b167c`, +0x10 -> `0x10b127e` score=32 near restrictions methods

#### +0x78 target

```text
 10b163f:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b1642:	89 c5                	mov    ebp,eax
 10b1644:	48 89 df             	mov    rdi,rbx
 10b1647:	e8 06 f3 ff ff       	call   10b0952 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d68>
 10b164c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10b164f:	48 89 df             	mov    rdi,rbx
 10b1652:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b1655:	40 38 c5             	cmp    bpl,al
 10b1658:	74 0c                	je     10b1666 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278a7c>
 10b165a:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10b1661:	e8 42 74 a7 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 10b1666:	48 89 df             	mov    rdi,rbx
 10b1669:	48 83 c4 08          	add    rsp,0x8
 10b166d:	5b                   	pop    rbx
 10b166e:	5d                   	pop    rbp
 10b166f:	e9 d0 fe ff ff       	jmp    10b1544 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27895a>
 10b1674:	48 89 c7             	mov    rdi,rax
 10b1677:	e8 29 84 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10b167c:	53                   	push   rbx
 10b167d:	48 89 fb             	mov    rbx,rdi
 10b1680:	48 83 c7 08          	add    rdi,0x8
 10b1684:	e8 7f 93 9f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10b1689:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0
 10b168e:	74 0c                	je     10b169c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278ab2>
 10b1690:	48 83 c3 10          	add    rbx,0x10
 10b1694:	48 89 df             	mov    rdi,rbx
 10b1697:	e8 e8 0d 6d 00       	call   1782484 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1365f0>
 10b169c:	5b                   	pop    rbx
 10b169d:	c3                   	ret
 10b169e:	48 89 c7             	mov    rdi,rax
 10b16a1:	e8 ff 83 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10b16a6:	53                   	push   rbx
 10b16a7:	48 89 fb             	mov    rbx,rdi
 10b16aa:	e8 cd ff ff ff       	call   10b167c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278a92>
 10b16af:	48 89 df             	mov    rdi,rbx
 10b16b2:	5b                   	pop    rbx
 10b16b3:	e9 68 c8 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10b16b8:	0f 18 0d 71 6b 84 00 	prefetcht0 BYTE PTR [rip+0x846b71]        # 18f8230 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f640>
 10b16bf:	48 8d 05 6a 6b 84 00 	lea    rax,[rip+0x846b6a]        # 18f8230 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f640>
 10b16c6:	48 8b 0d 6b 6b 84 00 	mov    rcx,QWORD PTR [rip+0x846b6b]        # 18f8238 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f648>
 10b16cd:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10b16d0:	c3                   	ret
 10b16d1:	cc                   	int3
 10b16d2:	48 89 f0             	mov    rax,rsi
 10b16d5:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10b16d9:	48 8d 0d 38 b7 79 00 	lea    rcx,[rip+0x79b738]        # 184ce18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9500>
 10b16e0:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10b16e3:	0f 57 c0             	xorps  xmm0,xmm0
 10b16e6:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 10b16ea:	48 89 56 20          	mov    QWORD PTR [rsi+0x20],rdx
 10b16ee:	83 66 28 00          	and    DWORD PTR [rsi+0x28],0x0
 10b16f2:	c3                   	ret
 10b16f3:	cc                   	int3
 10b16f4:	48 89 f0             	mov    rax,rsi
 10b16f7:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10b16fb:	48 8d 0d d6 b6 79 00 	lea    rcx,[rip+0x79b6d6]        # 184cdd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x94c0>
 10b1702:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10b1705:	0f 57 c0             	xorps  xmm0,xmm0
 10b1708:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 10b170c:	c3                   	ret
 10b170d:	cc                   	int3
 10b170e:	0f 18 0d 4b 6a 84 00 	prefetcht0 BYTE PTR [rip+0x846a4b]        # 18f8160 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f570>
 10b1715:	48 8d 05 44 6a 84 00 	lea    rax,[rip+0x846a44]        # 18f8160 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f570>
 10b171c:	48 8b 0d 45 6a 84 00 	mov    rcx,QWORD PTR [rip+0x846a45]        # 18f8168 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f578>
 10b1723:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10b1726:	c3                   	ret
 10b1727:	cc                   	int3
 10b1728:	53                   	push   rbx
 10b1729:	48 89 fb             	mov    rbx,rdi
 10b172c:	48 83 c7 08          	add    rdi,0x8
 10b1730:	e8 d3 92 9f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10b1735:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0
 10b173a:	74 0c                	je     10b1748 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278b5e>
 10b173c:	48 83 c3 10          	add    rbx,0x10
 10b1740:	48 89 df             	mov    rdi,rbx
 10b1743:	e8 3c 0d 6d 00       	call   1782484 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1365f0>
 10b1748:	5b                   	pop    rbx
 10b1749:	c3                   	ret
 10b174a:	48 89 c7             	mov    rdi,rax
 10b174d:	e8 53 83 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10b1752:	53                   	push   rbx
 10b1753:	48 89 fb             	mov    rbx,rdi
 10b1756:	e8 cd ff ff ff       	call   10b1728 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278b3e>
 10b175b:	48 89 df             	mov    rdi,rbx
 10b175e:	5b                   	pop    rbx
 10b175f:	e9 bc c7 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10b1764:	0f 18 0d 0d 6d 84 00 	prefetcht0 BYTE PTR [rip+0x846d0d]        # 18f8478 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f888>
 10b176b:	48 8d 05 06 6d 84 00 	lea    rax,[rip+0x846d06]        # 18f8478 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f888>
 10b1772:	48 8b 0d 07 6d 84 00 	mov    rcx,QWORD PTR [rip+0x846d07]        # 18f8480 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3f890>
 10b1779:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10b177c:	c3                   	ret
 10b177d:	cc                   	int3
 10b177e:	48 89 f0             	mov    rax,rsi
```
#### +0x10 target

```text
 10b123f:	4c 89 f7             	mov    rdi,r14
 10b1242:	e8 ff 04 71 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
 10b1247:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10b124b:	e8 d4 3c db ff       	call   e64f24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c33a>
 10b1250:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 10b1254:	e8 e3 c9 ff ff       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10b1259:	48 83 c3 10          	add    rbx,0x10
 10b125d:	48 89 df             	mov    rdi,rbx
 10b1260:	48 83 c4 08          	add    rsp,0x8
 10b1264:	5b                   	pop    rbx
 10b1265:	41 5e                	pop    r14
 10b1267:	e9 24 cc 73 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10b126c:	53                   	push   rbx
 10b126d:	48 89 fb             	mov    rbx,rdi
 10b1270:	e8 97 ff ff ff       	call   10b120c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278622>
 10b1275:	48 89 df             	mov    rdi,rbx
 10b1278:	5b                   	pop    rbx
 10b1279:	e9 a2 cc 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10b127e:	55                   	push   rbp
 10b127f:	53                   	push   rbx
 10b1280:	48 83 ec 18          	sub    rsp,0x18
 10b1284:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b128b:	00 00
 10b128d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10b1292:	80 bf 99 00 00 00 00 	cmp    BYTE PTR [rdi+0x99],0x0
 10b1299:	0f 84 81 00 00 00    	je     10b1320 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278736>
 10b129f:	48 89 fb             	mov    rbx,rdi
 10b12a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10b12a5:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b12a8:	89 c5                	mov    ebp,eax
 10b12aa:	48 89 df             	mov    rdi,rbx
 10b12ad:	e8 a0 f6 ff ff       	call   10b0952 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277d68>
 10b12b2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10b12b5:	48 89 df             	mov    rdi,rbx
 10b12b8:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b12bb:	84 c0                	test   al,al
 10b12bd:	75 22                	jne    10b12e1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2786f7>
 10b12bf:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 10b12c3:	e8 7a f7 ff ff       	call   10b0a42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277e58>
 10b12c8:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 10b12cd:	48 89 06             	mov    QWORD PTR [rsi],rax
 10b12d0:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10b12d4:	e8 77 f7 ff ff       	call   10b0a50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277e66>
 10b12d9:	48 89 df             	mov    rdi,rbx
 10b12dc:	e8 89 00 00 00       	call   10b136a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278780>
 10b12e1:	48 89 df             	mov    rdi,rbx
 10b12e4:	e8 5b 02 00 00       	call   10b1544 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27895a>
 10b12e9:	40 84 ed             	test   bpl,bpl
 10b12ec:	75 32                	jne    10b1320 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278736>
 10b12ee:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10b12f1:	48 89 df             	mov    rdi,rbx
 10b12f4:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10b12f7:	84 c0                	test   al,al
 10b12f9:	74 25                	je     10b1320 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278736>
 10b12fb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b1302:	00 00
 10b1304:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10b1309:	75 2c                	jne    10b1337 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27874d>
 10b130b:	48 81 c3 a0 00 00 00 	add    rbx,0xa0
 10b1312:	48 89 df             	mov    rdi,rbx
 10b1315:	48 83 c4 18          	add    rsp,0x18
 10b1319:	5b                   	pop    rbx
 10b131a:	5d                   	pop    rbp
 10b131b:	e9 88 77 a7 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 10b1320:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10b1327:	00 00
 10b1329:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10b132e:	75 07                	jne    10b1337 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27874d>
 10b1330:	48 83 c4 18          	add    rsp,0x18
 10b1334:	5b                   	pop    rbx
 10b1335:	5d                   	pop    rbp
 10b1336:	c3                   	ret
 10b1337:	e8 74 e7 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10b133c:	53                   	push   rbx
 10b133d:	40 38 b7 99 00 00 00 	cmp    BYTE PTR [rdi+0x99],sil
 10b1344:	74 0f                	je     10b1355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27876b>
 10b1346:	48 89 fb             	mov    rbx,rdi
 10b1349:	40 88 b7 99 00 00 00 	mov    BYTE PTR [rdi+0x99],sil
 10b1350:	40 84 f6             	test   sil,sil
 10b1353:	74 02                	je     10b1357 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27876d>
 10b1355:	5b                   	pop    rbx
 10b1356:	c3                   	ret
 10b1357:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10b135a:	48 89 df             	mov    rdi,rbx
 10b135d:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10b1360:	48 89 df             	mov    rdi,rbx
 10b1363:	5b                   	pop    rbx
 10b1364:	e9 01 00 00 00       	jmp    10b136a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278780>
 10b1369:	cc                   	int3
 10b136a:	55                   	push   rbp
 10b136b:	41 57                	push   r15
 10b136d:	41 56                	push   r14
 10b136f:	41 55                	push   r13
```
### AP `0x184d600`: +0x78 -> `0x10bac9e`, +0x10 -> `0x10ba976` score=32 near restrictions methods

#### +0x78 target

```text
 10bac6c:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bac70:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bac74:	e8 01 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bac79:	84 c0                	test   al,al
 10bac7b:	74 17                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac7d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bac80:	4c 89 f7             	mov    rdi,r14
 10bac83:	ff 90 b0 01 00 00    	call   QWORD PTR [rax+0x1b0]
 10bac89:	84 c0                	test   al,al
 10bac8b:	74 07                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac8d:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bac90:	b0 01                	mov    al,0x1
 10bac92:	eb 02                	jmp    10bac96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820ac>
 10bac94:	31 c0                	xor    eax,eax
 10bac96:	48 83 c4 08          	add    rsp,0x8
 10bac9a:	5b                   	pop    rbx
 10bac9b:	41 5e                	pop    r14
 10bac9d:	c3                   	ret
 10bac9e:	48 83 ec 18          	sub    rsp,0x18
 10baca2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baca9:	00 00
 10bacab:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bacb0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bacb3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bacb8:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 10bacbe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bacc5:	00 00
 10bacc7:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baccc:	75 05                	jne    10bacd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820e9>
 10bacce:	48 83 c4 18          	add    rsp,0x18
 10bacd2:	c3                   	ret
 10bacd3:	e8 d8 4d 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bacd8:	41 56                	push   r14
 10bacda:	53                   	push   rbx
 10bacdb:	50                   	push   rax
 10bacdc:	48 89 f3             	mov    rbx,rsi
 10bacdf:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bace5:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bace8:	83 e0 fe             	and    eax,0xfffffffe
 10baceb:	83 f8 02             	cmp    eax,0x2
 10bacee:	75 38                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bacf0:	49 89 fe             	mov    r14,rdi
 10bacf3:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bacf7:	e8 ae 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bacfc:	84 c0                	test   al,al
 10bacfe:	74 11                	je     10bad11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282127>
 10bad00:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bad04:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bad08:	e8 6d 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad0d:	84 c0                	test   al,al
 10bad0f:	75 17                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad11:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10bad15:	48 85 ff             	test   rdi,rdi
 10bad18:	74 0a                	je     10bad24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213a>
 10bad1a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad1d:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10bad20:	84 c0                	test   al,al
 10bad22:	74 04                	je     10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad24:	31 c0                	xor    eax,eax
 10bad26:	eb 05                	jmp    10bad2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282143>
 10bad28:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bad2b:	b0 01                	mov    al,0x1
 10bad2d:	48 83 c4 08          	add    rsp,0x8
 10bad31:	5b                   	pop    rbx
 10bad32:	41 5e                	pop    r14
 10bad34:	c3                   	ret
 10bad35:	cc                   	int3
 10bad36:	41 57                	push   r15
 10bad38:	41 56                	push   r14
 10bad3a:	53                   	push   rbx
 10bad3b:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bad3e:	b3 01                	mov    bl,0x1
 10bad40:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bad44:	75 2d                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad46:	49 89 f6             	mov    r14,rsi
 10bad49:	49 89 ff             	mov    r15,rdi
 10bad4c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bad50:	e8 55 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bad55:	84 c0                	test   al,al
 10bad57:	74 1a                	je     10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad59:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
 10bad5d:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
 10bad61:	e8 14 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad66:	84 c0                	test   al,al
 10bad68:	75 09                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad6a:	41 c7 06 02 00 00 00 	mov    DWORD PTR [r14],0x2
 10bad71:	31 db                	xor    ebx,ebx
 10bad73:	89 d8                	mov    eax,ebx
 10bad75:	5b                   	pop    rbx
 10bad76:	41 5e                	pop    r14
 10bad78:	41 5f                	pop    r15
 10bad7a:	c3                   	ret
 10bad7b:	cc                   	int3
```
#### +0x10 target

```text
 10ba93a:	41 5e                	pop    r14
 10ba93c:	c3                   	ret
 10ba93d:	cc                   	int3
 10ba93e:	48 83 ec 18          	sub    rsp,0x18
 10ba942:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba949:	00 00
 10ba94b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba950:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba953:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba958:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ba95b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba962:	00 00
 10ba964:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba969:	75 05                	jne    10ba970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d86>
 10ba96b:	48 83 c4 18          	add    rsp,0x18
 10ba96f:	c3                   	ret
 10ba970:	e8 3b 51 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba975:	cc                   	int3
 10ba976:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba97c:	31 c9                	xor    ecx,ecx
 10ba97e:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba982:	0f 93 c1             	setae  cl
 10ba985:	0f 92 c0             	setb   al
 10ba988:	01 c9                	add    ecx,ecx
 10ba98a:	89 0e                	mov    DWORD PTR [rsi],ecx
 10ba98c:	c3                   	ret
 10ba98d:	cc                   	int3
 10ba98e:	48 83 ec 18          	sub    rsp,0x18
 10ba992:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba999:	00 00
 10ba99b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba9a0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9a3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba9a8:	ff 50 50             	call   QWORD PTR [rax+0x50]
 10ba9ab:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba9b2:	00 00
 10ba9b4:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba9b9:	75 05                	jne    10ba9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281dd6>
 10ba9bb:	48 83 c4 18          	add    rsp,0x18
 10ba9bf:	c3                   	ret
 10ba9c0:	e8 eb 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba9c5:	cc                   	int3
 10ba9c6:	41 56                	push   r14
 10ba9c8:	53                   	push   rbx
 10ba9c9:	50                   	push   rax
 10ba9ca:	48 89 f3             	mov    rbx,rsi
 10ba9cd:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba9d3:	31 c0                	xor    eax,eax
 10ba9d5:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba9d9:	73 04                	jae    10ba9df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df5>
 10ba9db:	89 03                	mov    DWORD PTR [rbx],eax
 10ba9dd:	eb 38                	jmp    10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9df:	49 89 fe             	mov    r14,rdi
 10ba9e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9e5:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10ba9eb:	84 c0                	test   al,al
 10ba9ed:	74 28                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9ef:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba9f3:	e8 b2 26 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba9f8:	84 c0                	test   al,al
 10ba9fa:	74 1b                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9fc:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baa00:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baa04:	e8 71 27 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baa09:	34 01                	xor    al,0x1
 10baa0b:	0f b6 c0             	movzx  eax,al
 10baa0e:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
 10baa15:	eb c4                	jmp    10ba9db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df1>
 10baa17:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10baa1a:	0f 92 c0             	setb   al
 10baa1d:	48 83 c4 08          	add    rsp,0x8
 10baa21:	5b                   	pop    rbx
 10baa22:	41 5e                	pop    r14
 10baa24:	c3                   	ret
 10baa25:	cc                   	int3
 10baa26:	48 83 ec 18          	sub    rsp,0x18
 10baa2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baa31:	00 00
 10baa33:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baa38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa3b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]
 10baa43:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10baa4a:	00 00
 10baa4c:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baa51:	75 05                	jne    10baa58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e6e>
 10baa53:	48 83 c4 18          	add    rsp,0x18
 10baa57:	c3                   	ret
 10baa58:	e8 53 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10baa5d:	cc                   	int3
 10baa5e:	41 56                	push   r14
 10baa60:	53                   	push   rbx
 10baa61:	50                   	push   rax
```
### AP `0x184d608`: +0x78 -> `0x10bacd8`, +0x10 -> `0x10ba98e` score=32 near restrictions methods

#### +0x78 target

```text
 10bac96:	48 83 c4 08          	add    rsp,0x8
 10bac9a:	5b                   	pop    rbx
 10bac9b:	41 5e                	pop    r14
 10bac9d:	c3                   	ret
 10bac9e:	48 83 ec 18          	sub    rsp,0x18
 10baca2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baca9:	00 00
 10bacab:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bacb0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bacb3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bacb8:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 10bacbe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bacc5:	00 00
 10bacc7:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baccc:	75 05                	jne    10bacd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820e9>
 10bacce:	48 83 c4 18          	add    rsp,0x18
 10bacd2:	c3                   	ret
 10bacd3:	e8 d8 4d 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bacd8:	41 56                	push   r14
 10bacda:	53                   	push   rbx
 10bacdb:	50                   	push   rax
 10bacdc:	48 89 f3             	mov    rbx,rsi
 10bacdf:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bace5:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bace8:	83 e0 fe             	and    eax,0xfffffffe
 10baceb:	83 f8 02             	cmp    eax,0x2
 10bacee:	75 38                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bacf0:	49 89 fe             	mov    r14,rdi
 10bacf3:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bacf7:	e8 ae 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bacfc:	84 c0                	test   al,al
 10bacfe:	74 11                	je     10bad11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282127>
 10bad00:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bad04:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bad08:	e8 6d 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad0d:	84 c0                	test   al,al
 10bad0f:	75 17                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad11:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10bad15:	48 85 ff             	test   rdi,rdi
 10bad18:	74 0a                	je     10bad24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213a>
 10bad1a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad1d:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10bad20:	84 c0                	test   al,al
 10bad22:	74 04                	je     10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad24:	31 c0                	xor    eax,eax
 10bad26:	eb 05                	jmp    10bad2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282143>
 10bad28:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bad2b:	b0 01                	mov    al,0x1
 10bad2d:	48 83 c4 08          	add    rsp,0x8
 10bad31:	5b                   	pop    rbx
 10bad32:	41 5e                	pop    r14
 10bad34:	c3                   	ret
 10bad35:	cc                   	int3
 10bad36:	41 57                	push   r15
 10bad38:	41 56                	push   r14
 10bad3a:	53                   	push   rbx
 10bad3b:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bad3e:	b3 01                	mov    bl,0x1
 10bad40:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bad44:	75 2d                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad46:	49 89 f6             	mov    r14,rsi
 10bad49:	49 89 ff             	mov    r15,rdi
 10bad4c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bad50:	e8 55 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bad55:	84 c0                	test   al,al
 10bad57:	74 1a                	je     10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad59:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
 10bad5d:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
 10bad61:	e8 14 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad66:	84 c0                	test   al,al
 10bad68:	75 09                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad6a:	41 c7 06 02 00 00 00 	mov    DWORD PTR [r14],0x2
 10bad71:	31 db                	xor    ebx,ebx
 10bad73:	89 d8                	mov    eax,ebx
 10bad75:	5b                   	pop    rbx
 10bad76:	41 5e                	pop    r14
 10bad78:	41 5f                	pop    r15
 10bad7a:	c3                   	ret
 10bad7b:	cc                   	int3
 10bad7c:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bad7f:	83 e0 fe             	and    eax,0xfffffffe
 10bad82:	83 f8 02             	cmp    eax,0x2
 10bad85:	0f 95 c0             	setne  al
 10bad88:	c3                   	ret
 10bad89:	cc                   	int3
 10bad8a:	48 83 ec 18          	sub    rsp,0x18
 10bad8e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bad95:	00 00
 10bad97:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bad9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad9f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bada4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
 10badaa:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
```
#### +0x10 target

```text
 10ba958:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ba95b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba962:	00 00
 10ba964:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba969:	75 05                	jne    10ba970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d86>
 10ba96b:	48 83 c4 18          	add    rsp,0x18
 10ba96f:	c3                   	ret
 10ba970:	e8 3b 51 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba975:	cc                   	int3
 10ba976:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba97c:	31 c9                	xor    ecx,ecx
 10ba97e:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba982:	0f 93 c1             	setae  cl
 10ba985:	0f 92 c0             	setb   al
 10ba988:	01 c9                	add    ecx,ecx
 10ba98a:	89 0e                	mov    DWORD PTR [rsi],ecx
 10ba98c:	c3                   	ret
 10ba98d:	cc                   	int3
 10ba98e:	48 83 ec 18          	sub    rsp,0x18
 10ba992:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba999:	00 00
 10ba99b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba9a0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9a3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba9a8:	ff 50 50             	call   QWORD PTR [rax+0x50]
 10ba9ab:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba9b2:	00 00
 10ba9b4:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba9b9:	75 05                	jne    10ba9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281dd6>
 10ba9bb:	48 83 c4 18          	add    rsp,0x18
 10ba9bf:	c3                   	ret
 10ba9c0:	e8 eb 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba9c5:	cc                   	int3
 10ba9c6:	41 56                	push   r14
 10ba9c8:	53                   	push   rbx
 10ba9c9:	50                   	push   rax
 10ba9ca:	48 89 f3             	mov    rbx,rsi
 10ba9cd:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba9d3:	31 c0                	xor    eax,eax
 10ba9d5:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba9d9:	73 04                	jae    10ba9df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df5>
 10ba9db:	89 03                	mov    DWORD PTR [rbx],eax
 10ba9dd:	eb 38                	jmp    10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9df:	49 89 fe             	mov    r14,rdi
 10ba9e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9e5:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10ba9eb:	84 c0                	test   al,al
 10ba9ed:	74 28                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9ef:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba9f3:	e8 b2 26 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba9f8:	84 c0                	test   al,al
 10ba9fa:	74 1b                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9fc:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baa00:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baa04:	e8 71 27 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baa09:	34 01                	xor    al,0x1
 10baa0b:	0f b6 c0             	movzx  eax,al
 10baa0e:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
 10baa15:	eb c4                	jmp    10ba9db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df1>
 10baa17:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10baa1a:	0f 92 c0             	setb   al
 10baa1d:	48 83 c4 08          	add    rsp,0x8
 10baa21:	5b                   	pop    rbx
 10baa22:	41 5e                	pop    r14
 10baa24:	c3                   	ret
 10baa25:	cc                   	int3
 10baa26:	48 83 ec 18          	sub    rsp,0x18
 10baa2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baa31:	00 00
 10baa33:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baa38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa3b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]
 10baa43:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10baa4a:	00 00
 10baa4c:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baa51:	75 05                	jne    10baa58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e6e>
 10baa53:	48 83 c4 18          	add    rsp,0x18
 10baa57:	c3                   	ret
 10baa58:	e8 53 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10baa5d:	cc                   	int3
 10baa5e:	41 56                	push   r14
 10baa60:	53                   	push   rbx
 10baa61:	50                   	push   rax
 10baa62:	48 89 f3             	mov    rbx,rsi
 10baa65:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10baa6b:	31 c0                	xor    eax,eax
 10baa6d:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10baa71:	73 04                	jae    10baa77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e8d>
 10baa73:	89 03                	mov    DWORD PTR [rbx],eax
 10baa75:	eb 2f                	jmp    10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa77:	49 89 fe             	mov    r14,rdi
 10baa7a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
```
### AP `0x184d640`: +0x78 -> `0x10bae1e`, +0x10 -> `0x10ba976` score=32 near restrictions methods

#### +0x78 target

```text
 10baddd:	c3                   	ret
 10badde:	48 83 ec 18          	sub    rsp,0x18
 10bade2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bade9:	00 00
 10badeb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10badf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10badf3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10badf8:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
 10badfe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae05:	00 00
 10bae07:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae0c:	75 05                	jne    10bae13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282229>
 10bae0e:	48 83 c4 18          	add    rsp,0x18
 10bae12:	c3                   	ret
 10bae13:	e8 98 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae18:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bae1b:	b0 01                	mov    al,0x1
 10bae1d:	c3                   	ret
 10bae1e:	48 83 ec 18          	sub    rsp,0x18
 10bae22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae29:	00 00
 10bae2b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae30:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae33:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae38:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
 10bae3e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae45:	00 00
 10bae47:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae4c:	75 05                	jne    10bae53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282269>
 10bae4e:	48 83 c4 18          	add    rsp,0x18
 10bae52:	c3                   	ret
 10bae53:	e8 58 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae58:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bae5c:	0f 94 c0             	sete   al
 10bae5f:	c3                   	ret
 10bae60:	48 83 ec 18          	sub    rsp,0x18
 10bae64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae6b:	00 00
 10bae6d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae72:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae75:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae7a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
 10bae80:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae87:	00 00
 10bae89:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae8e:	75 05                	jne    10bae95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822ab>
 10bae90:	48 83 c4 18          	add    rsp,0x18
 10bae94:	c3                   	ret
 10bae95:	e8 16 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae9a:	41 56                	push   r14
 10bae9c:	53                   	push   rbx
 10bae9d:	50                   	push   rax
 10bae9e:	48 89 f3             	mov    rbx,rsi
 10baea1:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10baea7:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10baeaa:	83 e0 fe             	and    eax,0xfffffffe
 10baead:	83 f8 02             	cmp    eax,0x2
 10baeb0:	75 44                	jne    10baef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28230c>
 10baeb2:	49 89 fe             	mov    r14,rdi
 10baeb5:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 10baeb9:	48 85 ff             	test   rdi,rdi
 10baebc:	74 0a                	je     10baec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822de>
 10baebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baec1:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10baec4:	84 c0                	test   al,al
 10baec6:	75 35                	jne    10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baec8:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10baecc:	e8 d9 21 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10baed1:	84 c0                	test   al,al
 10baed3:	74 28                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baed5:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baed9:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baedd:	e8 98 22 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baee2:	84 c0                	test   al,al
 10baee4:	74 17                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baee6:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10baee9:	4c 89 f7             	mov    rdi,r14
 10baeec:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
 10baef2:	84 c0                	test   al,al
 10baef4:	74 07                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baef6:	83 23 00             	and    DWORD PTR [rbx],0x0
 10baef9:	b0 01                	mov    al,0x1
 10baefb:	eb 02                	jmp    10baeff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282315>
 10baefd:	31 c0                	xor    eax,eax
 10baeff:	48 83 c4 08          	add    rsp,0x8
 10baf03:	5b                   	pop    rbx
 10baf04:	41 5e                	pop    r14
 10baf06:	c3                   	ret
 10baf07:	cc                   	int3
 10baf08:	41 56                	push   r14
 10baf0a:	53                   	push   rbx
 10baf0b:	48 83 ec 18          	sub    rsp,0x18
 10baf0f:	48 89 fb             	mov    rbx,rdi
```
#### +0x10 target

```text
 10ba93a:	41 5e                	pop    r14
 10ba93c:	c3                   	ret
 10ba93d:	cc                   	int3
 10ba93e:	48 83 ec 18          	sub    rsp,0x18
 10ba942:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba949:	00 00
 10ba94b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba950:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba953:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba958:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ba95b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba962:	00 00
 10ba964:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba969:	75 05                	jne    10ba970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d86>
 10ba96b:	48 83 c4 18          	add    rsp,0x18
 10ba96f:	c3                   	ret
 10ba970:	e8 3b 51 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba975:	cc                   	int3
 10ba976:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba97c:	31 c9                	xor    ecx,ecx
 10ba97e:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba982:	0f 93 c1             	setae  cl
 10ba985:	0f 92 c0             	setb   al
 10ba988:	01 c9                	add    ecx,ecx
 10ba98a:	89 0e                	mov    DWORD PTR [rsi],ecx
 10ba98c:	c3                   	ret
 10ba98d:	cc                   	int3
 10ba98e:	48 83 ec 18          	sub    rsp,0x18
 10ba992:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba999:	00 00
 10ba99b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba9a0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9a3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba9a8:	ff 50 50             	call   QWORD PTR [rax+0x50]
 10ba9ab:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba9b2:	00 00
 10ba9b4:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba9b9:	75 05                	jne    10ba9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281dd6>
 10ba9bb:	48 83 c4 18          	add    rsp,0x18
 10ba9bf:	c3                   	ret
 10ba9c0:	e8 eb 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba9c5:	cc                   	int3
 10ba9c6:	41 56                	push   r14
 10ba9c8:	53                   	push   rbx
 10ba9c9:	50                   	push   rax
 10ba9ca:	48 89 f3             	mov    rbx,rsi
 10ba9cd:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba9d3:	31 c0                	xor    eax,eax
 10ba9d5:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba9d9:	73 04                	jae    10ba9df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df5>
 10ba9db:	89 03                	mov    DWORD PTR [rbx],eax
 10ba9dd:	eb 38                	jmp    10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9df:	49 89 fe             	mov    r14,rdi
 10ba9e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9e5:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10ba9eb:	84 c0                	test   al,al
 10ba9ed:	74 28                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9ef:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba9f3:	e8 b2 26 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba9f8:	84 c0                	test   al,al
 10ba9fa:	74 1b                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9fc:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baa00:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baa04:	e8 71 27 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baa09:	34 01                	xor    al,0x1
 10baa0b:	0f b6 c0             	movzx  eax,al
 10baa0e:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
 10baa15:	eb c4                	jmp    10ba9db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df1>
 10baa17:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10baa1a:	0f 92 c0             	setb   al
 10baa1d:	48 83 c4 08          	add    rsp,0x8
 10baa21:	5b                   	pop    rbx
 10baa22:	41 5e                	pop    r14
 10baa24:	c3                   	ret
 10baa25:	cc                   	int3
 10baa26:	48 83 ec 18          	sub    rsp,0x18
 10baa2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baa31:	00 00
 10baa33:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baa38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa3b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]
 10baa43:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10baa4a:	00 00
 10baa4c:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baa51:	75 05                	jne    10baa58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e6e>
 10baa53:	48 83 c4 18          	add    rsp,0x18
 10baa57:	c3                   	ret
 10baa58:	e8 53 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10baa5d:	cc                   	int3
 10baa5e:	41 56                	push   r14
 10baa60:	53                   	push   rbx
 10baa61:	50                   	push   rax
```
### AP `0x184d660`: +0x78 -> `0x10bae9a`, +0x10 -> `0x10bac44` score=32 near restrictions methods

#### +0x78 target

```text
 10bae53:	e8 58 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae58:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bae5c:	0f 94 c0             	sete   al
 10bae5f:	c3                   	ret
 10bae60:	48 83 ec 18          	sub    rsp,0x18
 10bae64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae6b:	00 00
 10bae6d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae72:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae75:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae7a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
 10bae80:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae87:	00 00
 10bae89:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae8e:	75 05                	jne    10bae95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822ab>
 10bae90:	48 83 c4 18          	add    rsp,0x18
 10bae94:	c3                   	ret
 10bae95:	e8 16 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae9a:	41 56                	push   r14
 10bae9c:	53                   	push   rbx
 10bae9d:	50                   	push   rax
 10bae9e:	48 89 f3             	mov    rbx,rsi
 10baea1:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10baea7:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10baeaa:	83 e0 fe             	and    eax,0xfffffffe
 10baead:	83 f8 02             	cmp    eax,0x2
 10baeb0:	75 44                	jne    10baef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28230c>
 10baeb2:	49 89 fe             	mov    r14,rdi
 10baeb5:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 10baeb9:	48 85 ff             	test   rdi,rdi
 10baebc:	74 0a                	je     10baec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822de>
 10baebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baec1:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10baec4:	84 c0                	test   al,al
 10baec6:	75 35                	jne    10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baec8:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10baecc:	e8 d9 21 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10baed1:	84 c0                	test   al,al
 10baed3:	74 28                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baed5:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baed9:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baedd:	e8 98 22 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baee2:	84 c0                	test   al,al
 10baee4:	74 17                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baee6:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10baee9:	4c 89 f7             	mov    rdi,r14
 10baeec:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
 10baef2:	84 c0                	test   al,al
 10baef4:	74 07                	je     10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baef6:	83 23 00             	and    DWORD PTR [rbx],0x0
 10baef9:	b0 01                	mov    al,0x1
 10baefb:	eb 02                	jmp    10baeff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282315>
 10baefd:	31 c0                	xor    eax,eax
 10baeff:	48 83 c4 08          	add    rsp,0x8
 10baf03:	5b                   	pop    rbx
 10baf04:	41 5e                	pop    r14
 10baf06:	c3                   	ret
 10baf07:	cc                   	int3
 10baf08:	41 56                	push   r14
 10baf0a:	53                   	push   rbx
 10baf0b:	48 83 ec 18          	sub    rsp,0x18
 10baf0f:	48 89 fb             	mov    rbx,rdi
 10baf12:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baf19:	00 00
 10baf1b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baf20:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baf23:	4c 8d 74 24 0c       	lea    r14,[rsp+0xc]
 10baf28:	4c 89 f6             	mov    rsi,r14
 10baf2b:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10baf2e:	80 7b 54 00          	cmp    BYTE PTR [rbx+0x54],0x0
 10baf32:	0f 94 c0             	sete   al
 10baf35:	41 83 3e 03          	cmp    DWORD PTR [r14],0x3
 10baf39:	0f 94 c1             	sete   cl
 10baf3c:	64 48 8b 14 25 28 00 	mov    rdx,QWORD PTR fs:0x28
 10baf43:	00 00
 10baf45:	48 3b 54 24 10       	cmp    rdx,QWORD PTR [rsp+0x10]
 10baf4a:	75 0a                	jne    10baf56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28236c>
 10baf4c:	20 c8                	and    al,cl
 10baf4e:	48 83 c4 18          	add    rsp,0x18
 10baf52:	5b                   	pop    rbx
 10baf53:	41 5e                	pop    r14
 10baf55:	c3                   	ret
 10baf56:	e8 55 4b 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10baf5b:	cc                   	int3
 10baf5c:	39 77 50             	cmp    DWORD PTR [rdi+0x50],esi
 10baf5f:	75 01                	jne    10baf62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282378>
 10baf61:	c3                   	ret
 10baf62:	53                   	push   rbx
 10baf63:	48 89 fb             	mov    rbx,rdi
 10baf66:	89 77 50             	mov    DWORD PTR [rdi+0x50],esi
 10baf69:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 10baf6d:	48 85 ff             	test   rdi,rdi
 10baf70:	74 13                	je     10baf85 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28239b>
```
#### +0x10 target

```text
 10bac02:	48 83 c4 08          	add    rsp,0x8
 10bac06:	5b                   	pop    rbx
 10bac07:	41 5e                	pop    r14
 10bac09:	c3                   	ret
 10bac0a:	48 83 ec 18          	sub    rsp,0x18
 10bac0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bac15:	00 00
 10bac17:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bac1c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bac1f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bac24:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 10bac2a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bac31:	00 00
 10bac33:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bac38:	75 05                	jne    10bac3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282055>
 10bac3a:	48 83 c4 18          	add    rsp,0x18
 10bac3e:	c3                   	ret
 10bac3f:	e8 6c 4e 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bac44:	41 56                	push   r14
 10bac46:	53                   	push   rbx
 10bac47:	50                   	push   rax
 10bac48:	48 89 f3             	mov    rbx,rsi
 10bac4b:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bac51:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bac54:	83 e0 fe             	and    eax,0xfffffffe
 10bac57:	83 f8 02             	cmp    eax,0x2
 10bac5a:	75 31                	jne    10bac8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820a3>
 10bac5c:	49 89 fe             	mov    r14,rdi
 10bac5f:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bac63:	e8 42 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bac68:	84 c0                	test   al,al
 10bac6a:	74 28                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac6c:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bac70:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bac74:	e8 01 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bac79:	84 c0                	test   al,al
 10bac7b:	74 17                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac7d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bac80:	4c 89 f7             	mov    rdi,r14
 10bac83:	ff 90 b0 01 00 00    	call   QWORD PTR [rax+0x1b0]
 10bac89:	84 c0                	test   al,al
 10bac8b:	74 07                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac8d:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bac90:	b0 01                	mov    al,0x1
 10bac92:	eb 02                	jmp    10bac96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820ac>
 10bac94:	31 c0                	xor    eax,eax
 10bac96:	48 83 c4 08          	add    rsp,0x8
 10bac9a:	5b                   	pop    rbx
 10bac9b:	41 5e                	pop    r14
 10bac9d:	c3                   	ret
 10bac9e:	48 83 ec 18          	sub    rsp,0x18
 10baca2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baca9:	00 00
 10bacab:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bacb0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bacb3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bacb8:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 10bacbe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bacc5:	00 00
 10bacc7:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baccc:	75 05                	jne    10bacd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820e9>
 10bacce:	48 83 c4 18          	add    rsp,0x18
 10bacd2:	c3                   	ret
 10bacd3:	e8 d8 4d 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bacd8:	41 56                	push   r14
 10bacda:	53                   	push   rbx
 10bacdb:	50                   	push   rax
 10bacdc:	48 89 f3             	mov    rbx,rsi
 10bacdf:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bace5:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bace8:	83 e0 fe             	and    eax,0xfffffffe
 10baceb:	83 f8 02             	cmp    eax,0x2
 10bacee:	75 38                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bacf0:	49 89 fe             	mov    r14,rdi
 10bacf3:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bacf7:	e8 ae 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bacfc:	84 c0                	test   al,al
 10bacfe:	74 11                	je     10bad11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282127>
 10bad00:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bad04:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bad08:	e8 6d 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad0d:	84 c0                	test   al,al
 10bad0f:	75 17                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad11:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10bad15:	48 85 ff             	test   rdi,rdi
 10bad18:	74 0a                	je     10bad24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213a>
 10bad1a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad1d:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10bad20:	84 c0                	test   al,al
 10bad22:	74 04                	je     10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad24:	31 c0                	xor    eax,eax
 10bad26:	eb 05                	jmp    10bad2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282143>
 10bad28:	83 23 00             	and    DWORD PTR [rbx],0x0
```
### AP `0x184d750`: +0x78 -> `0xaaa9bc`, +0x10 -> `0x10bcff0` score=32 near restrictions methods

#### +0x78 target

```text
  aaa984:	c3                   	ret
  aaa985:	cc                   	int3
  aaa986:	48 8d 05 1b 2e d5 00 	lea    rax,[rip+0xd52e1b]        # 17fd7a8 <_ZTINSt6__ndk117bad_function_callE@@Base+0x848>
  aaa98d:	48 89 07             	mov    QWORD PTR [rdi],rax
  aaa990:	e9 7b 36 d4 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  aaa995:	cc                   	int3
  aaa996:	53                   	push   rbx
  aaa997:	48 89 fb             	mov    rbx,rdi
  aaa99a:	e8 e7 ff ff ff       	call   aaa986 <JNI_OnUnload@@Base+0x32253>
  aaa99f:	48 89 df             	mov    rdi,rbx
  aaa9a2:	5b                   	pop    rbx
  aaa9a3:	e9 78 35 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaa9a8:	48 83 c7 18          	add    rdi,0x18
  aaa9ac:	e9 eb 70 b3 00       	jmp    15e1a9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x427020>
  aaa9b1:	cc                   	int3
  aaa9b2:	48 83 c7 08          	add    rdi,0x8
  aaa9b6:	e9 4d 00 00 00       	jmp    aaaa08 <JNI_OnUnload@@Base+0x322d5>
  aaa9bb:	cc                   	int3
  aaa9bc:	53                   	push   rbx
  aaa9bd:	48 89 fb             	mov    rbx,rdi
  aaa9c0:	48 83 c7 08          	add    rdi,0x8
  aaa9c4:	e8 3f 00 00 00       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  aaa9c9:	48 89 df             	mov    rdi,rbx
  aaa9cc:	5b                   	pop    rbx
  aaa9cd:	e9 4e 35 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaa9d2:	0f 18 0d ff de e0 00 	prefetcht0 BYTE PTR [rip+0xe0deff]        # 18b88d8 <__cxa_unexpected_handler@@Base+0xc48>
  aaa9d9:	48 8d 05 f8 de e0 00 	lea    rax,[rip+0xe0def8]        # 18b88d8 <__cxa_unexpected_handler@@Base+0xc48>
  aaa9e0:	48 8b 0d f9 de e0 00 	mov    rcx,QWORD PTR [rip+0xe0def9]        # 18b88e0 <__cxa_unexpected_handler@@Base+0xc50>
  aaa9e7:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaa9ea:	c3                   	ret
  aaa9eb:	cc                   	int3
  aaa9ec:	48 89 f0             	mov    rax,rsi
  aaa9ef:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaa9f3:	48 8d 0d e6 2e d5 00 	lea    rcx,[rip+0xd52ee6]        # 17fd8e0 <_ZTINSt6__ndk117bad_function_callE@@Base+0x980>
  aaa9fa:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaa9fd:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
  aaaa02:	c6 46 18 00          	mov    BYTE PTR [rsi+0x18],0x0
  aaaa06:	c3                   	ret
  aaaa07:	cc                   	int3
  aaaa08:	f6 07 01             	test   BYTE PTR [rdi],0x1
  aaaa0b:	0f 85 cb 3f ca 00    	jne    174e9dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102b48>
  aaaa11:	c3                   	ret
  aaaa12:	0f 18 0d f7 dd e0 00 	prefetcht0 BYTE PTR [rip+0xe0ddf7]        # 18b8810 <__cxa_unexpected_handler@@Base+0xb80>
  aaaa19:	48 8d 05 f0 dd e0 00 	lea    rax,[rip+0xe0ddf0]        # 18b8810 <__cxa_unexpected_handler@@Base+0xb80>
  aaaa20:	48 8b 0d f1 dd e0 00 	mov    rcx,QWORD PTR [rip+0xe0ddf1]        # 18b8818 <__cxa_unexpected_handler@@Base+0xb88>
  aaaa27:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaaa2a:	c3                   	ret
  aaaa2b:	cc                   	int3
  aaaa2c:	48 89 f0             	mov    rax,rsi
  aaaa2f:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaaa33:	48 8d 0d e6 2e d5 00 	lea    rcx,[rip+0xd52ee6]        # 17fd920 <_ZTINSt6__ndk117bad_function_callE@@Base+0x9c0>
  aaaa3a:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaaa3d:	0f 57 c0             	xorps  xmm0,xmm0
  aaaa40:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  aaaa44:	c3                   	ret
  aaaa45:	cc                   	int3
  aaaa46:	0f 18 0d e3 dc e0 00 	prefetcht0 BYTE PTR [rip+0xe0dce3]        # 18b8730 <__cxa_unexpected_handler@@Base+0xaa0>
  aaaa4d:	48 8d 05 dc dc e0 00 	lea    rax,[rip+0xe0dcdc]        # 18b8730 <__cxa_unexpected_handler@@Base+0xaa0>
  aaaa54:	48 8b 0d dd dc e0 00 	mov    rcx,QWORD PTR [rip+0xe0dcdd]        # 18b8738 <__cxa_unexpected_handler@@Base+0xaa8>
  aaaa5b:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaaa5e:	c3                   	ret
  aaaa5f:	cc                   	int3
  aaaa60:	48 89 f0             	mov    rax,rsi
  aaaa63:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaaa67:	48 8d 0d 32 2e d5 00 	lea    rcx,[rip+0xd52e32]        # 17fd8a0 <_ZTINSt6__ndk117bad_function_callE@@Base+0x940>
  aaaa6e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaaa71:	0f 57 c0             	xorps  xmm0,xmm0
  aaaa74:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  aaaa78:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
  aaaa7d:	c3                   	ret
  aaaa7e:	53                   	push   rbx
  aaaa7f:	48 89 fb             	mov    rbx,rdi
  aaaa82:	48 83 c7 08          	add    rdi,0x8
  aaaa86:	e8 7d ff ff ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  aaaa8b:	48 8b 5b 18          	mov    rbx,QWORD PTR [rbx+0x18]
  aaaa8f:	48 85 db             	test   rbx,rbx
  aaaa92:	74 08                	je     aaaa9c <JNI_OnUnload@@Base+0x32369>
  aaaa94:	48 89 df             	mov    rdi,rbx
  aaaa97:	e8 72 00 00 00       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
  aaaa9c:	48 89 df             	mov    rdi,rbx
  aaaa9f:	5b                   	pop    rbx
  aaaaa0:	e9 7b 34 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaaaa5:	cc                   	int3
  aaaaa6:	53                   	push   rbx
  aaaaa7:	48 89 fb             	mov    rbx,rdi
  aaaaaa:	e8 cf ff ff ff       	call   aaaa7e <JNI_OnUnload@@Base+0x3234b>
  aaaaaf:	48 89 df             	mov    rdi,rbx
  aaaab2:	5b                   	pop    rbx
  aaaab3:	e9 68 34 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaaab8:	0f 18 0d a1 db e0 00 	prefetcht0 BYTE PTR [rip+0xe0dba1]        # 18b8660 <__cxa_unexpected_handler@@Base+0x9d0>
  aaaabf:	48 8d 05 9a db e0 00 	lea    rax,[rip+0xe0db9a]        # 18b8660 <__cxa_unexpected_handler@@Base+0x9d0>
  aaaac6:	48 8b 0d 9b db e0 00 	mov    rcx,QWORD PTR [rip+0xe0db9b]        # 18b8668 <__cxa_unexpected_handler@@Base+0x9d8>
  aaaacd:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
```
#### +0x10 target

```text
 10bcfb5:	e8 d6 0e 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bcfba:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bcfc1:	00 00
 10bcfc3:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
 10bcfca:	00
 10bcfcb:	75 08                	jne    10bcfd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2843eb>
 10bcfcd:	4c 89 f7             	mov    rdi,r14
 10bcfd0:	e8 fb 2c 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bcfd5:	e8 d6 2a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bcfda:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bcfdd:	83 c0 fe             	add    eax,0xfffffffe
 10bcfe0:	83 f8 03             	cmp    eax,0x3
 10bcfe3:	0f 92 c0             	setb   al
 10bcfe6:	c3                   	ret
 10bcfe7:	cc                   	int3
 10bcfe8:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bcfec:	0f 94 c0             	sete   al
 10bcfef:	c3                   	ret
 10bcff0:	80 7f 55 00          	cmp    BYTE PTR [rdi+0x55],0x0
 10bcff4:	0f 94 c0             	sete   al
 10bcff7:	c3                   	ret
 10bcff8:	83 7f 50 03          	cmp    DWORD PTR [rdi+0x50],0x3
 10bcffc:	0f 94 c0             	sete   al
 10bcfff:	c3                   	ret
 10bd000:	8a 47 56             	mov    al,BYTE PTR [rdi+0x56]
 10bd003:	c3                   	ret
 10bd004:	8a 47 57             	mov    al,BYTE PTR [rdi+0x57]
 10bd007:	c3                   	ret
 10bd008:	8a 47 58             	mov    al,BYTE PTR [rdi+0x58]
 10bd00b:	c3                   	ret
 10bd00c:	8a 47 59             	mov    al,BYTE PTR [rdi+0x59]
 10bd00f:	c3                   	ret
 10bd010:	8a 47 5a             	mov    al,BYTE PTR [rdi+0x5a]
 10bd013:	c3                   	ret
 10bd014:	53                   	push   rbx
 10bd015:	48 89 fb             	mov    rbx,rdi
 10bd018:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bd01c:	e8 89 00 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bd021:	84 c0                	test   al,al
 10bd023:	74 0e                	je     10bd033 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284449>
 10bd025:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 10bd029:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
 10bd02d:	5b                   	pop    rbx
 10bd02e:	e9 47 01 00 00       	jmp    10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bd033:	31 c0                	xor    eax,eax
 10bd035:	5b                   	pop    rbx
 10bd036:	c3                   	ret
 10bd037:	cc                   	int3
 10bd038:	53                   	push   rbx
 10bd039:	48 89 fb             	mov    rbx,rdi
 10bd03c:	48 8d 05 8d 05 79 00 	lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10bd043:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bd046:	48 81 c7 88 01 00 00 	add    rdi,0x188
 10bd04d:	e8 82 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd052:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
 10bd059:	e8 76 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd05e:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 10bd065:	e8 fc cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd06a:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
 10bd071:	e8 f0 cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd076:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10bd07d:	e8 d4 d6 ff ff       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>
 10bd082:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10bd086:	e8 49 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd08b:	48 83 c3 20          	add    rbx,0x20
 10bd08f:	48 89 df             	mov    rdi,rbx
 10bd092:	5b                   	pop    rbx
 10bd093:	e9 3c cb 71 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd098:	53                   	push   rbx
 10bd099:	48 89 fb             	mov    rbx,rdi
 10bd09c:	e8 97 ff ff ff       	call   10bd038 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28444e>
 10bd0a1:	48 89 df             	mov    rdi,rbx
 10bd0a4:	5b                   	pop    rbx
 10bd0a5:	e9 76 0e 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10bd0aa:	41 57                	push   r15
 10bd0ac:	41 56                	push   r14
 10bd0ae:	41 54                	push   r12
 10bd0b0:	53                   	push   rbx
 10bd0b1:	48 83 ec 58          	sub    rsp,0x58
 10bd0b5:	48 89 fb             	mov    rbx,rdi
 10bd0b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd0bf:	00 00
 10bd0c1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10bd0c6:	48 8d 35 fb b0 92 00 	lea    rsi,[rip+0x92b0fb]        # 19e81c8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27b8>
 10bd0cd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bd0d2:	e8 d3 4c 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bd0d7:	48 8d 35 af 58 2b ff 	lea    rsi,[rip+0xffffffffff2b58af]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
 10bd0de:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bd0e3:	e8 96 c9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bd0e8:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 10bd0eb:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
 10bd0f0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 10bd0f5:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
```
### AP `0x184d7d0`: +0x78 -> `0x10bf45e`, +0x10 -> `0x10be91e` score=32 near restrictions methods

#### +0x78 target

```text
 10bf41d:	eb 02                	jmp    10bf421 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286837>
 10bf41f:	eb 00                	jmp    10bf421 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286837>
 10bf421:	48 89 c3             	mov    rbx,rax
 10bf424:	eb 0d                	jmp    10bf433 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286849>
 10bf426:	48 89 c3             	mov    rbx,rax
 10bf429:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 10bf42e:	e8 99 f3 9d ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 10bf433:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 10bf438:	e8 7f 0c 00 00       	call   10c00bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874d2>
 10bf43d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bf444:	00 00
 10bf446:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 10bf44d:	00
 10bf44e:	75 08                	jne    10bf458 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28686e>
 10bf450:	48 89 df             	mov    rdi,rbx
 10bf453:	e8 78 08 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bf458:	e8 53 06 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bf45d:	cc                   	int3
 10bf45e:	55                   	push   rbp
 10bf45f:	41 57                	push   r15
 10bf461:	41 56                	push   r14
 10bf463:	41 55                	push   r13
 10bf465:	41 54                	push   r12
 10bf467:	53                   	push   rbx
 10bf468:	48 81 ec 28 01 00 00 	sub    rsp,0x128
 10bf46f:	48 89 fb             	mov    rbx,rdi
 10bf472:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bf479:	00 00
 10bf47b:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
 10bf482:	00
 10bf483:	48 8b b7 30 01 00 00 	mov    rsi,QWORD PTR [rdi+0x130]
 10bf48a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10bf48d:	48 8d 15 c4 8d 92 00 	lea    rdx,[rip+0x928dc4]        # 19e8258 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2848>
 10bf494:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
 10bf49b:	00
 10bf49c:	4c 89 f7             	mov    rdi,r14
 10bf49f:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10bf4a2:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10bf4a7:	0f 84 2e 02 00 00    	je     10bf6db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286af1>
 10bf4ad:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
 10bf4b3:	48 8d 05 8e e4 78 00 	lea    rax,[rip+0x78e48e]        # 184d948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa030>
 10bf4ba:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 10bf4bf:	0f 57 c0             	xorps  xmm0,xmm0
 10bf4c2:	0f 11 44 24 68       	movups XMMWORD PTR [rsp+0x68],xmm0
 10bf4c7:	48 83 64 24 78 00    	and    QWORD PTR [rsp+0x78],0x0
 10bf4cd:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 10bf4d4:	00
 10bf4d5:	e8 78 66 a8 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
 10bf4da:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 10bf4e1:	00
 10bf4e2:	e8 4f c3 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bf4e7:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 10bf4ec:	48 89 c6             	mov    rsi,rax
 10bf4ef:	e8 5e 03 6c 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 10bf4f4:	84 c0                	test   al,al
 10bf4f6:	0f 84 d5 01 00 00    	je     10bf6d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286ae7>
 10bf4fc:	48 8d 84 24 b0 00 00 	lea    rax,[rsp+0xb0]
 10bf503:	00
 10bf504:	48 83 60 68 00       	and    QWORD PTR [rax+0x68],0x0
 10bf509:	0f 57 c0             	xorps  xmm0,xmm0
 10bf50c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10bf50f:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
 10bf513:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
 10bf517:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
 10bf51b:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
 10bf51f:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 10bf524:	48 85 c0             	test   rax,rax
 10bf527:	4c 8d 2d 52 9b 83 00 	lea    r13,[rip+0x839b52]        # 18f9080 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40490>
 10bf52e:	4c 0f 45 e8          	cmovne r13,rax
 10bf532:	49 8b 7d 48          	mov    rdi,QWORD PTR [r13+0x48]
 10bf536:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
 10bf53a:	e8 f7 c2 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bf53f:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 10bf546:	00
 10bf547:	48 89 c6             	mov    rsi,rax
 10bf54a:	e8 23 50 aa ff       	call   b64572 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1512>
 10bf54f:	84 c0                	test   al,al
 10bf551:	75 0b                	jne    10bf55e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286974>
 10bf553:	0f 57 c0             	xorps  xmm0,xmm0
 10bf556:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
 10bf55d:	00
 10bf55e:	49 8b 75 50          	mov    rsi,QWORD PTR [r13+0x50]
 10bf562:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
 10bf566:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
 10bf56d:	00
 10bf56e:	e8 0d eb 72 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 10bf573:	49 8b 75 58          	mov    rsi,QWORD PTR [r13+0x58]
 10bf577:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
 10bf57b:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
 10bf582:	00
 10bf583:	e8 f8 ea 72 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 10bf588:	4d 8d 65 18          	lea    r12,[r13+0x18]
 10bf58c:	4c 89 e7             	mov    rdi,r12
```
#### +0x10 target

```text
 10be8dc:	38 46 38             	cmp    BYTE PTR [rsi+0x38],al
 10be8df:	74 3c                	je     10be91d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285d33>
 10be8e1:	48 8d 47 08          	lea    rax,[rdi+0x8]
 10be8e5:	48 8b 4e 18          	mov    rcx,QWORD PTR [rsi+0x18]
 10be8e9:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 10be8ed:	0f 10 46 08          	movups xmm0,XMMWORD PTR [rsi+0x8]
 10be8f1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10be8f4:	0f 57 c0             	xorps  xmm0,xmm0
 10be8f7:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
 10be8fb:	48 83 66 18 00       	and    QWORD PTR [rsi+0x18],0x0
 10be900:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
 10be904:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
 10be908:	0f 10 4e 20          	movups xmm1,XMMWORD PTR [rsi+0x20]
 10be90c:	0f 11 4f 20          	movups XMMWORD PTR [rdi+0x20],xmm1
 10be910:	0f 11 46 20          	movups XMMWORD PTR [rsi+0x20],xmm0
 10be914:	48 83 66 30 00       	and    QWORD PTR [rsi+0x30],0x0
 10be919:	c6 47 38 01          	mov    BYTE PTR [rdi+0x38],0x1
 10be91d:	c3                   	ret
 10be91e:	0f 18 0d 53 a6 83 00 	prefetcht0 BYTE PTR [rip+0x83a653]        # 18f8f78 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40388>
 10be925:	48 8d 05 4c a6 83 00 	lea    rax,[rip+0x83a64c]        # 18f8f78 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40388>
 10be92c:	48 8b 0d 4d a6 83 00 	mov    rcx,QWORD PTR [rip+0x83a64d]        # 18f8f80 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40390>
 10be933:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10be936:	c3                   	ret
 10be937:	cc                   	int3
 10be938:	48 89 f0             	mov    rax,rsi
 10be93b:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10be93f:	48 8d 0d 7a ee 78 00 	lea    rcx,[rip+0x78ee7a]        # 184d7c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ea8>
 10be946:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10be949:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10be94e:	48 83 66 15 00       	and    QWORD PTR [rsi+0x15],0x0
 10be953:	c3                   	ret
 10be954:	53                   	push   rbx
 10be955:	48 89 fb             	mov    rbx,rdi
 10be958:	e8 d3 f9 fe ff       	call   10ae330 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275746>
 10be95d:	48 89 df             	mov    rdi,rbx
 10be960:	5b                   	pop    rbx
 10be961:	e9 ba f5 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10be966:	41 56                	push   r14
 10be968:	53                   	push   rbx
 10be969:	48 83 ec 18          	sub    rsp,0x18
 10be96d:	49 89 f6             	mov    r14,rsi
 10be970:	48 89 fb             	mov    rbx,rdi
 10be973:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10be97a:	00 00
 10be97c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10be981:	48 89 d6             	mov    rsi,rdx
 10be984:	e8 ac 13 00 00       	call   10bfd35 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28714b>
 10be989:	49 81 c6 f8 00 00 00 	add    r14,0xf8
 10be990:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 10be994:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
 10be997:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
 10be99b:	48 85 c0             	test   rax,rax
 10be99e:	74 05                	je     10be9a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285dbb>
 10be9a0:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
 10be9a5:	48 89 e6             	mov    rsi,rsp
 10be9a8:	4c 89 f7             	mov    rdi,r14
 10be9ab:	e8 fe 13 00 00       	call   10bfdae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2871c4>
 10be9b0:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 10be9b5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10be9bc:	00 00
 10be9be:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10be9c3:	75 3e                	jne    10bea03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285e19>
 10be9c5:	e8 e8 fa 9d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 10be9ca:	48 89 d8             	mov    rax,rbx
 10be9cd:	48 83 c4 18          	add    rsp,0x18
 10be9d1:	5b                   	pop    rbx
 10be9d2:	41 5e                	pop    r14
 10be9d4:	c3                   	ret
 10be9d5:	49 89 c6             	mov    r14,rax
 10be9d8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 10be9dd:	e8 d0 fa 9d ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 10be9e2:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10be9e6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10be9ed:	00 00
 10be9ef:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 10be9f4:	75 0d                	jne    10bea03 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285e19>
 10be9f6:	e8 8b fa 9d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10be9fb:	4c 89 f7             	mov    rdi,r14
 10be9fe:	e8 cd 12 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bea03:	e8 a8 10 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bea08:	41 56                	push   r14
 10bea0a:	53                   	push   rbx
 10bea0b:	48 83 ec 18          	sub    rsp,0x18
 10bea0f:	49 89 f6             	mov    r14,rsi
 10bea12:	48 89 fb             	mov    rbx,rdi
 10bea15:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bea1c:	00 00
 10bea1e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bea23:	48 89 d6             	mov    rsi,rdx
 10bea26:	e8 0a 13 00 00       	call   10bfd35 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28714b>
 10bea2b:	49 81 c6 10 01 00 00 	add    r14,0x110
 10bea32:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 10bea36:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
```
### AP `0x184d8d8`: +0x78 -> `0x10c00e4`, +0x10 -> `0x10c01f4` score=32 near restrictions methods

#### +0x78 target

```text
 10c00a8:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10c00ad:	75 08                	jne    10c00b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874cd>
 10c00af:	48 89 df             	mov    rdi,rbx
 10c00b2:	e8 19 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10c00b7:	e8 f4 f9 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10c00bc:	53                   	push   rbx
 10c00bd:	48 89 fb             	mov    rbx,rdi
 10c00c0:	48 83 c7 08          	add    rdi,0x8
 10c00c4:	e8 3f a9 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10c00c9:	48 8b 5b 18          	mov    rbx,QWORD PTR [rbx+0x18]
 10c00cd:	48 85 db             	test   rbx,rbx
 10c00d0:	74 08                	je     10c00da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874f0>
 10c00d2:	48 89 df             	mov    rdi,rbx
 10c00d5:	e8 b8 00 00 00       	call   10c0192 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2875a8>
 10c00da:	48 89 df             	mov    rdi,rbx
 10c00dd:	5b                   	pop    rbx
 10c00de:	e9 3d de 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10c00e3:	cc                   	int3
 10c00e4:	53                   	push   rbx
 10c00e5:	48 89 fb             	mov    rbx,rdi
 10c00e8:	e8 cf ff ff ff       	call   10c00bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874d2>
 10c00ed:	48 89 df             	mov    rdi,rbx
 10c00f0:	5b                   	pop    rbx
 10c00f1:	e9 2a de 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10c00f6:	0f 18 0d 1b 93 83 00 	prefetcht0 BYTE PTR [rip+0x83931b]        # 18f9418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40828>
 10c00fd:	48 8d 05 14 93 83 00 	lea    rax,[rip+0x839314]        # 18f9418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40828>
 10c0104:	48 8b 0d 15 93 83 00 	mov    rcx,QWORD PTR [rip+0x839315]        # 18f9420 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40830>
 10c010b:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10c010e:	c3                   	ret
 10c010f:	cc                   	int3
 10c0110:	48 89 f0             	mov    rax,rsi
 10c0113:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10c0117:	48 8d 0d 2a d8 78 00 	lea    rcx,[rip+0x78d82a]        # 184d948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa030>
 10c011e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10c0121:	0f 57 c0             	xorps  xmm0,xmm0
 10c0124:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 10c0128:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
 10c012d:	c3                   	ret
 10c012e:	53                   	push   rbx
 10c012f:	48 89 f3             	mov    rbx,rsi
 10c0132:	48 89 f7             	mov    rdi,rsi
 10c0135:	48 89 d6             	mov    rsi,rdx
 10c0138:	e8 05 00 00 00       	call   10c0142 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287558>
 10c013d:	48 89 d8             	mov    rax,rbx
 10c0140:	5b                   	pop    rbx
 10c0141:	c3                   	ret
 10c0142:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
 10c0146:	48 8d 05 bb d7 78 00 	lea    rax,[rip+0x78d7bb]        # 184d908 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ff0>
 10c014d:	48 89 07             	mov    QWORD PTR [rdi],rax
 10c0150:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 10c0155:	48 89 77 18          	mov    QWORD PTR [rdi+0x18],rsi
 10c0159:	48 8d 05 f8 8e 83 00 	lea    rax,[rip+0x838ef8]        # 18f9058 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40468>
 10c0160:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
 10c0164:	0f 28 05 65 db 2c ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff2cdb65]        # 38dcd0 <_ZTSSt12bad_any_cast@@Base-0x24f8>
 10c016b:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
 10c016f:	48 8d 05 52 f4 37 ff 	lea    rax,[rip+0xffffffffff37f452]        # 43f5c8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x51d4>
 10c0176:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
 10c017a:	48 89 77 40          	mov    QWORD PTR [rdi+0x40],rsi
 10c017e:	48 8d 05 73 f6 37 ff 	lea    rax,[rip+0xffffffffff37f673]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10c0185:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
 10c0189:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
 10c018d:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
 10c0191:	c3                   	ret
 10c0192:	53                   	push   rbx
 10c0193:	48 89 fb             	mov    rbx,rdi
 10c0196:	48 83 c7 08          	add    rdi,0x8
 10c019a:	e8 69 a8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10c019f:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
 10c01a3:	e8 00 57 6a 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
 10c01a8:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
 10c01ac:	e8 f7 56 6a 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
 10c01b1:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
 10c01b5:	e8 ee 56 6a 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
 10c01ba:	48 83 c3 18          	add    rbx,0x18
 10c01be:	48 89 df             	mov    rdi,rbx
 10c01c1:	5b                   	pop    rbx
 10c01c2:	e9 b5 f9 9f ff       	jmp    abfb7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb1c>
 10c01c7:	cc                   	int3
 10c01c8:	53                   	push   rbx
 10c01c9:	48 89 fb             	mov    rbx,rdi
 10c01cc:	e8 c1 ff ff ff       	call   10c0192 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2875a8>
 10c01d1:	48 89 df             	mov    rdi,rbx
 10c01d4:	5b                   	pop    rbx
 10c01d5:	e9 46 dd 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10c01da:	0f 18 0d b7 90 83 00 	prefetcht0 BYTE PTR [rip+0x8390b7]        # 18f9298 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x406a8>
 10c01e1:	48 8d 05 b0 90 83 00 	lea    rax,[rip+0x8390b0]        # 18f9298 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x406a8>
 10c01e8:	48 8b 0d b1 90 83 00 	mov    rcx,QWORD PTR [rip+0x8390b1]        # 18f92a0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x406b0>
 10c01ef:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10c01f2:	c3                   	ret
 10c01f3:	cc                   	int3
 10c01f4:	0f 18 0d 65 8f 83 00 	prefetcht0 BYTE PTR [rip+0x838f65]        # 18f9160 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40570>
 10c01fb:	48 8d 05 5e 8f 83 00 	lea    rax,[rip+0x838f5e]        # 18f9160 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40570>
 10c0202:	48 8b 0d 5f 8f 83 00 	mov    rcx,QWORD PTR [rip+0x838f5f]        # 18f9168 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40578>
```
#### +0x10 target

```text
 10c01b5:	e8 ee 56 6a 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
 10c01ba:	48 83 c3 18          	add    rbx,0x18
 10c01be:	48 89 df             	mov    rdi,rbx
 10c01c1:	5b                   	pop    rbx
 10c01c2:	e9 b5 f9 9f ff       	jmp    abfb7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb1c>
 10c01c7:	cc                   	int3
 10c01c8:	53                   	push   rbx
 10c01c9:	48 89 fb             	mov    rbx,rdi
 10c01cc:	e8 c1 ff ff ff       	call   10c0192 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2875a8>
 10c01d1:	48 89 df             	mov    rdi,rbx
 10c01d4:	5b                   	pop    rbx
 10c01d5:	e9 46 dd 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10c01da:	0f 18 0d b7 90 83 00 	prefetcht0 BYTE PTR [rip+0x8390b7]        # 18f9298 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x406a8>
 10c01e1:	48 8d 05 b0 90 83 00 	lea    rax,[rip+0x8390b0]        # 18f9298 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x406a8>
 10c01e8:	48 8b 0d b1 90 83 00 	mov    rcx,QWORD PTR [rip+0x8390b1]        # 18f92a0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x406b0>
 10c01ef:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10c01f2:	c3                   	ret
 10c01f3:	cc                   	int3
 10c01f4:	0f 18 0d 65 8f 83 00 	prefetcht0 BYTE PTR [rip+0x838f65]        # 18f9160 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40570>
 10c01fb:	48 8d 05 5e 8f 83 00 	lea    rax,[rip+0x838f5e]        # 18f9160 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40570>
 10c0202:	48 8b 0d 5f 8f 83 00 	mov    rcx,QWORD PTR [rip+0x838f5f]        # 18f9168 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40578>
 10c0209:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10c020c:	c3                   	ret
 10c020d:	cc                   	int3
 10c020e:	48 89 f0             	mov    rax,rsi
 10c0211:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10c0215:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10c021a:	48 8d 0d d7 f5 37 ff 	lea    rcx,[rip+0xffffffffff37f5d7]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10c0221:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
 10c0225:	48 89 4e 20          	mov    QWORD PTR [rsi+0x20],rcx
 10c0229:	48 8d 0d 98 d6 78 00 	lea    rcx,[rip+0x78d698]        # 184d8c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9fb0>
 10c0230:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10c0233:	c3                   	ret
 10c0234:	41 57                	push   r15
 10c0236:	41 56                	push   r14
 10c0238:	53                   	push   rbx
 10c0239:	49 89 f7             	mov    r15,rsi
 10c023c:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10c023f:	4c 8d 73 40          	lea    r14,[rbx+0x40]
 10c0243:	4c 89 f7             	mov    rdi,r14
 10c0246:	48 89 d6             	mov    rsi,rdx
 10c0249:	e8 32 de 72 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 10c024e:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
 10c0252:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
 10c0256:	80 bb 90 00 00 00 00 	cmp    BYTE PTR [rbx+0x90],0x0
 10c025d:	74 45                	je     10c02a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876ba>
 10c025f:	4c 8d 7b 78          	lea    r15,[rbx+0x78]
 10c0263:	4c 89 ff             	mov    rdi,r15
 10c0266:	4c 89 f6             	mov    rsi,r14
 10c0269:	e8 80 f4 9d ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 10c026e:	84 c0                	test   al,al
 10c0270:	74 32                	je     10c02a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876ba>
 10c0272:	c6 43 70 01          	mov    BYTE PTR [rbx+0x70],0x1
 10c0276:	4c 89 ff             	mov    rdi,r15
 10c0279:	e8 ae f0 a0 ff       	call   acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
 10c027e:	4c 8d b3 b8 00 00 00 	lea    r14,[rbx+0xb8]
 10c0285:	48 81 c3 98 00 00 00 	add    rbx,0x98
 10c028c:	48 89 df             	mov    rdi,rbx
 10c028f:	4c 89 f6             	mov    rsi,r14
 10c0292:	e8 c3 51 a1 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 10c0297:	4c 89 f7             	mov    rdi,r14
 10c029a:	5b                   	pop    rbx
 10c029b:	41 5e                	pop    r14
 10c029d:	41 5f                	pop    r15
 10c029f:	e9 88 f0 a0 ff       	jmp    acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
 10c02a4:	c6 43 70 00          	mov    BYTE PTR [rbx+0x70],0x0
 10c02a8:	5b                   	pop    rbx
 10c02a9:	41 5e                	pop    r14
 10c02ab:	41 5f                	pop    r15
 10c02ad:	c3                   	ret
 10c02ae:	41 57                	push   r15
 10c02b0:	41 56                	push   r14
 10c02b2:	41 54                	push   r12
 10c02b4:	53                   	push   rbx
 10c02b5:	48 81 ec 98 00 00 00 	sub    rsp,0x98
 10c02bc:	48 89 cb             	mov    rbx,rcx
 10c02bf:	49 89 f6             	mov    r14,rsi
 10c02c2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10c02c9:	00 00
 10c02cb:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 10c02d2:	00
 10c02d3:	4c 8b 27             	mov    r12,QWORD PTR [rdi]
 10c02d6:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 10c02db:	48 89 d6             	mov    rsi,rdx
 10c02de:	e8 5d dc 72 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10c02e3:	49 2b 5c 24 68       	sub    rbx,QWORD PTR [r12+0x68]
 10c02e8:	48 8d 7c 24 6f       	lea    rdi,[rsp+0x6f]
 10c02ed:	4c 89 f6             	mov    rsi,r14
 10c02f0:	e8 2b 40 ad ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
 10c02f5:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
 10c02fb:	0f 84 a7 00 00 00    	je     10c03a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2877be>
 10c0301:	41 80 7c 24 70 00    	cmp    BYTE PTR [r12+0x70],0x0
 10c0307:	0f 84 9b 00 00 00    	je     10c03a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2877be>
```
### AP `0x1831640`: +0x78 -> `0xea6dca`, +0x10 -> `0xea77fa` score=31 near ea785e

#### +0x78 target

```text
  ea6d8c:	00
  ea6d8d:	e8 0c 05 c0 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  ea6d92:	48 89 df             	mov    rdi,rbx
  ea6d95:	e8 0b 2d bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea6d9a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ea6d9d:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
  ea6da1:	e9 00 00 00 00       	jmp    ea6da6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e1bc>
  ea6da6:	50                   	push   rax
  ea6da7:	e8 b6 36 bd ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
  ea6dac:	58                   	pop    rax
  ea6dad:	c3                   	ret
  ea6dae:	48 89 c7             	mov    rdi,rax
  ea6db1:	e8 ef 2c bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea6db6:	48 8d 05 f3 a8 98 00 	lea    rax,[rip+0x98a8f3]        # 18316b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3648>
  ea6dbd:	48 89 07             	mov    QWORD PTR [rdi],rax
  ea6dc0:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
  ea6dc4:	e9 bd 76 bf ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  ea6dc9:	cc                   	int3
  ea6dca:	53                   	push   rbx
  ea6dcb:	48 89 fb             	mov    rbx,rdi
  ea6dce:	e8 e3 ff ff ff       	call   ea6db6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e1cc>
  ea6dd3:	48 89 df             	mov    rdi,rbx
  ea6dd6:	5b                   	pop    rbx
  ea6dd7:	e9 44 71 94 00       	jmp    17edf20 <_ZdlPv@plt>
  ea6ddc:	53                   	push   rbx
  ea6ddd:	48 89 fb             	mov    rbx,rdi
  ea6de0:	6a 18                	push   0x18
  ea6de2:	5f                   	pop    rdi
  ea6de3:	e8 18 71 94 00       	call   17edf00 <_Znwm@plt>
  ea6de8:	48 8d 0d c1 a8 98 00 	lea    rcx,[rip+0x98a8c1]        # 18316b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3648>
  ea6def:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea6df2:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
  ea6df6:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
  ea6dfa:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  ea6dfe:	48 85 c9             	test   rcx,rcx
  ea6e01:	74 05                	je     ea6e08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e21e>
  ea6e03:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  ea6e08:	5b                   	pop    rbx
  ea6e09:	c3                   	ret
  ea6e0a:	48 8d 05 9f a8 98 00 	lea    rax,[rip+0x98a89f]        # 18316b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3648>
  ea6e11:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea6e14:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea6e18:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea6e1c:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  ea6e20:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  ea6e24:	48 85 c0             	test   rax,rax
  ea6e27:	74 05                	je     ea6e2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e244>
  ea6e29:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ea6e2e:	c3                   	ret
  ea6e2f:	cc                   	int3
  ea6e30:	55                   	push   rbp
  ea6e31:	41 57                	push   r15
  ea6e33:	41 56                	push   r14
  ea6e35:	41 55                	push   r13
  ea6e37:	41 54                	push   r12
  ea6e39:	53                   	push   rbx
  ea6e3a:	48 83 ec 48          	sub    rsp,0x48
  ea6e3e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ea6e45:	00 00
  ea6e47:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  ea6e4c:	80 7e 60 00          	cmp    BYTE PTR [rsi+0x60],0x0
  ea6e50:	48 8d 46 48          	lea    rax,[rsi+0x48]
  ea6e54:	48 8d 0d 15 82 59 ff 	lea    rcx,[rip+0xffffffffff598215]        # 43f070 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4c7c>
  ea6e5b:	48 0f 45 c8          	cmovne rcx,rax
  ea6e5f:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
  ea6e64:	4c 8b 31             	mov    r14,QWORD PTR [rcx]
  ea6e67:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  ea6e6b:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  ea6e70:	49 39 c6             	cmp    r14,rax
  ea6e73:	0f 84 db 01 00 00    	je     ea7054 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e46a>
  ea6e79:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  ea6e7e:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
  ea6e82:	4c 89 f7             	mov    rdi,r14
  ea6e85:	e8 36 88 bf ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
  ea6e8a:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
  ea6e8f:	48 8b 5b 68          	mov    rbx,QWORD PTR [rbx+0x68]
  ea6e93:	48 85 db             	test   rbx,rbx
  ea6e96:	0f 84 a9 01 00 00    	je     ea7045 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e45b>
  ea6e9c:	49 89 c4             	mov    r12,rax
  ea6e9f:	f3 4c 0f b8 fb       	popcnt r15,rbx
  ea6ea4:	49 83 ff 01          	cmp    r15,0x1
  ea6ea8:	77 09                	ja     ea6eb3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e2c9>
  ea6eaa:	4c 8d 6b ff          	lea    r13,[rbx-0x1]
  ea6eae:	4d 21 e5             	and    r13,r12
  ea6eb1:	eb 13                	jmp    ea6ec6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e2dc>
  ea6eb3:	4d 89 e5             	mov    r13,r12
  ea6eb6:	49 39 dc             	cmp    r12,rbx
  ea6eb9:	72 0b                	jb     ea6ec6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e2dc>
  ea6ebb:	4c 89 e0             	mov    rax,r12
  ea6ebe:	31 d2                	xor    edx,edx
  ea6ec0:	48 f7 f3             	div    rbx
  ea6ec3:	49 89 d5             	mov    r13,rdx
  ea6ec6:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
```
#### +0x10 target

```text
  ea77c5:	cc                   	int3
  ea77c6:	53                   	push   rbx
  ea77c7:	48 89 fb             	mov    rbx,rdi
  ea77ca:	6a 10                	push   0x10
  ea77cc:	5f                   	pop    rdi
  ea77cd:	e8 2e 67 94 00       	call   17edf00 <_Znwm@plt>
  ea77d2:	48 8d 0d 47 9e 98 00 	lea    rcx,[rip+0x989e47]        # 1831620 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x35b8>
  ea77d9:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea77dc:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea77e0:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea77e4:	5b                   	pop    rbx
  ea77e5:	c3                   	ret
  ea77e6:	48 8d 05 33 9e 98 00 	lea    rax,[rip+0x989e33]        # 1831620 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x35b8>
  ea77ed:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea77f0:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea77f4:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea77f8:	c3                   	ret
  ea77f9:	cc                   	int3
  ea77fa:	53                   	push   rbx
  ea77fb:	48 81 ec 30 05 00 00 	sub    rsp,0x530
  ea7802:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ea7809:	00 00
  ea780b:	48 89 84 24 28 05 00 	mov    QWORD PTR [rsp+0x528],rax
  ea7812:	00
  ea7813:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
  ea7817:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  ea781a:	48 89 e7             	mov    rdi,rsp
  ea781d:	ff 50 78             	call   QWORD PTR [rax+0x78]
  ea7820:	48 89 e7             	mov    rdi,rsp
  ea7823:	80 bf 22 05 00 00 00 	cmp    BYTE PTR [rdi+0x522],0x0
  ea782a:	0f 95 c3             	setne  bl
  ea782d:	e8 2c 00 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  ea7832:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ea7839:	00 00
  ea783b:	48 3b 84 24 28 05 00 	cmp    rax,QWORD PTR [rsp+0x528]
  ea7842:	00
  ea7843:	75 0b                	jne    ea7850 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec66>
  ea7845:	89 d8                	mov    eax,ebx
  ea7847:	48 81 c4 30 05 00 00 	add    rsp,0x530
  ea784e:	5b                   	pop    rbx
  ea784f:	c3                   	ret
  ea7850:	e8 5b 82 94 00       	call   17efab0 <__stack_chk_fail@plt>
  ea7855:	48 89 c7             	mov    rdi,rax
  ea7858:	e8 48 22 bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ea785d:	cc                   	int3
  ea785e:	53                   	push   rbx
  ea785f:	48 89 fb             	mov    rbx,rdi
  ea7862:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
  ea7869:	e8 58 50 f6 ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>
  ea786e:	48 83 c3 70          	add    rbx,0x70
  ea7872:	48 89 df             	mov    rdi,rbx
  ea7875:	5b                   	pop    rbx
  ea7876:	e9 b7 58 c0 ff       	jmp    aad132 <JNI_OnUnload@@Base+0x349ff>
  ea787b:	cc                   	int3
  ea787c:	53                   	push   rbx
  ea787d:	48 89 fb             	mov    rbx,rdi
  ea7880:	6a 10                	push   0x10
  ea7882:	5f                   	pop    rdi
  ea7883:	e8 78 66 94 00       	call   17edf00 <_Znwm@plt>
  ea7888:	48 8d 0d 49 9d 98 00 	lea    rcx,[rip+0x989d49]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
  ea788f:	48 89 08             	mov    QWORD PTR [rax],rcx
  ea7892:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
  ea7896:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  ea789a:	5b                   	pop    rbx
  ea789b:	c3                   	ret
  ea789c:	48 8d 05 35 9d 98 00 	lea    rax,[rip+0x989d35]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
  ea78a3:	48 89 06             	mov    QWORD PTR [rsi],rax
  ea78a6:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ea78aa:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  ea78ae:	c3                   	ret
  ea78af:	cc                   	int3
  ea78b0:	41 57                	push   r15
  ea78b2:	41 56                	push   r14
  ea78b4:	41 54                	push   r12
  ea78b6:	53                   	push   rbx
  ea78b7:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
  ea78be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ea78c5:	00 00
  ea78c7:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
  ea78ce:	00
  ea78cf:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
  ea78d3:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  ea78d8:	4c 89 f7             	mov    rdi,r14
  ea78db:	e8 ea eb c4 ff       	call   af64ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4346a>
  ea78e0:	48 8d 05 31 a3 5a ff 	lea    rax,[rip+0xffffffffff5aa331]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
  ea78e7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  ea78ec:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  ea78f1:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
  ea78f7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  ea78fc:	4c 89 f6             	mov    rsi,r14
  ea78ff:	e8 c6 eb c4 ff       	call   af64ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4346a>
  ea7904:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
  ea790b:	00 00
```
### AP `0x184d3d0`: +0x78 -> `0xaaa9bc`, +0x10 -> `0x10ba52e` score=31 near restrictions methods

#### +0x78 target

```text
  aaa984:	c3                   	ret
  aaa985:	cc                   	int3
  aaa986:	48 8d 05 1b 2e d5 00 	lea    rax,[rip+0xd52e1b]        # 17fd7a8 <_ZTINSt6__ndk117bad_function_callE@@Base+0x848>
  aaa98d:	48 89 07             	mov    QWORD PTR [rdi],rax
  aaa990:	e9 7b 36 d4 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  aaa995:	cc                   	int3
  aaa996:	53                   	push   rbx
  aaa997:	48 89 fb             	mov    rbx,rdi
  aaa99a:	e8 e7 ff ff ff       	call   aaa986 <JNI_OnUnload@@Base+0x32253>
  aaa99f:	48 89 df             	mov    rdi,rbx
  aaa9a2:	5b                   	pop    rbx
  aaa9a3:	e9 78 35 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaa9a8:	48 83 c7 18          	add    rdi,0x18
  aaa9ac:	e9 eb 70 b3 00       	jmp    15e1a9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x427020>
  aaa9b1:	cc                   	int3
  aaa9b2:	48 83 c7 08          	add    rdi,0x8
  aaa9b6:	e9 4d 00 00 00       	jmp    aaaa08 <JNI_OnUnload@@Base+0x322d5>
  aaa9bb:	cc                   	int3
  aaa9bc:	53                   	push   rbx
  aaa9bd:	48 89 fb             	mov    rbx,rdi
  aaa9c0:	48 83 c7 08          	add    rdi,0x8
  aaa9c4:	e8 3f 00 00 00       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  aaa9c9:	48 89 df             	mov    rdi,rbx
  aaa9cc:	5b                   	pop    rbx
  aaa9cd:	e9 4e 35 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaa9d2:	0f 18 0d ff de e0 00 	prefetcht0 BYTE PTR [rip+0xe0deff]        # 18b88d8 <__cxa_unexpected_handler@@Base+0xc48>
  aaa9d9:	48 8d 05 f8 de e0 00 	lea    rax,[rip+0xe0def8]        # 18b88d8 <__cxa_unexpected_handler@@Base+0xc48>
  aaa9e0:	48 8b 0d f9 de e0 00 	mov    rcx,QWORD PTR [rip+0xe0def9]        # 18b88e0 <__cxa_unexpected_handler@@Base+0xc50>
  aaa9e7:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaa9ea:	c3                   	ret
  aaa9eb:	cc                   	int3
  aaa9ec:	48 89 f0             	mov    rax,rsi
  aaa9ef:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaa9f3:	48 8d 0d e6 2e d5 00 	lea    rcx,[rip+0xd52ee6]        # 17fd8e0 <_ZTINSt6__ndk117bad_function_callE@@Base+0x980>
  aaa9fa:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaa9fd:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
  aaaa02:	c6 46 18 00          	mov    BYTE PTR [rsi+0x18],0x0
  aaaa06:	c3                   	ret
  aaaa07:	cc                   	int3
  aaaa08:	f6 07 01             	test   BYTE PTR [rdi],0x1
  aaaa0b:	0f 85 cb 3f ca 00    	jne    174e9dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102b48>
  aaaa11:	c3                   	ret
  aaaa12:	0f 18 0d f7 dd e0 00 	prefetcht0 BYTE PTR [rip+0xe0ddf7]        # 18b8810 <__cxa_unexpected_handler@@Base+0xb80>
  aaaa19:	48 8d 05 f0 dd e0 00 	lea    rax,[rip+0xe0ddf0]        # 18b8810 <__cxa_unexpected_handler@@Base+0xb80>
  aaaa20:	48 8b 0d f1 dd e0 00 	mov    rcx,QWORD PTR [rip+0xe0ddf1]        # 18b8818 <__cxa_unexpected_handler@@Base+0xb88>
  aaaa27:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaaa2a:	c3                   	ret
  aaaa2b:	cc                   	int3
  aaaa2c:	48 89 f0             	mov    rax,rsi
  aaaa2f:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaaa33:	48 8d 0d e6 2e d5 00 	lea    rcx,[rip+0xd52ee6]        # 17fd920 <_ZTINSt6__ndk117bad_function_callE@@Base+0x9c0>
  aaaa3a:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaaa3d:	0f 57 c0             	xorps  xmm0,xmm0
  aaaa40:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  aaaa44:	c3                   	ret
  aaaa45:	cc                   	int3
  aaaa46:	0f 18 0d e3 dc e0 00 	prefetcht0 BYTE PTR [rip+0xe0dce3]        # 18b8730 <__cxa_unexpected_handler@@Base+0xaa0>
  aaaa4d:	48 8d 05 dc dc e0 00 	lea    rax,[rip+0xe0dcdc]        # 18b8730 <__cxa_unexpected_handler@@Base+0xaa0>
  aaaa54:	48 8b 0d dd dc e0 00 	mov    rcx,QWORD PTR [rip+0xe0dcdd]        # 18b8738 <__cxa_unexpected_handler@@Base+0xaa8>
  aaaa5b:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  aaaa5e:	c3                   	ret
  aaaa5f:	cc                   	int3
  aaaa60:	48 89 f0             	mov    rax,rsi
  aaaa63:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  aaaa67:	48 8d 0d 32 2e d5 00 	lea    rcx,[rip+0xd52e32]        # 17fd8a0 <_ZTINSt6__ndk117bad_function_callE@@Base+0x940>
  aaaa6e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  aaaa71:	0f 57 c0             	xorps  xmm0,xmm0
  aaaa74:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  aaaa78:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
  aaaa7d:	c3                   	ret
  aaaa7e:	53                   	push   rbx
  aaaa7f:	48 89 fb             	mov    rbx,rdi
  aaaa82:	48 83 c7 08          	add    rdi,0x8
  aaaa86:	e8 7d ff ff ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  aaaa8b:	48 8b 5b 18          	mov    rbx,QWORD PTR [rbx+0x18]
  aaaa8f:	48 85 db             	test   rbx,rbx
  aaaa92:	74 08                	je     aaaa9c <JNI_OnUnload@@Base+0x32369>
  aaaa94:	48 89 df             	mov    rdi,rbx
  aaaa97:	e8 72 00 00 00       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
  aaaa9c:	48 89 df             	mov    rdi,rbx
  aaaa9f:	5b                   	pop    rbx
  aaaaa0:	e9 7b 34 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaaaa5:	cc                   	int3
  aaaaa6:	53                   	push   rbx
  aaaaa7:	48 89 fb             	mov    rbx,rdi
  aaaaaa:	e8 cf ff ff ff       	call   aaaa7e <JNI_OnUnload@@Base+0x3234b>
  aaaaaf:	48 89 df             	mov    rdi,rbx
  aaaab2:	5b                   	pop    rbx
  aaaab3:	e9 68 34 d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aaaab8:	0f 18 0d a1 db e0 00 	prefetcht0 BYTE PTR [rip+0xe0dba1]        # 18b8660 <__cxa_unexpected_handler@@Base+0x9d0>
  aaaabf:	48 8d 05 9a db e0 00 	lea    rax,[rip+0xe0db9a]        # 18b8660 <__cxa_unexpected_handler@@Base+0x9d0>
  aaaac6:	48 8b 0d 9b db e0 00 	mov    rcx,QWORD PTR [rip+0xe0db9b]        # 18b8668 <__cxa_unexpected_handler@@Base+0x9d8>
  aaaacd:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
```
#### +0x10 target

```text
 10ba4e9:	48 8d 05 70 e4 83 00 	lea    rax,[rip+0x83e470]        # 18f8960 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fd70>
 10ba4f0:	48 8b 0d 71 e4 83 00 	mov    rcx,QWORD PTR [rip+0x83e471]        # 18f8968 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fd78>
 10ba4f7:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba4fa:	c3                   	ret
 10ba4fb:	cc                   	int3
 10ba4fc:	48 89 f0             	mov    rax,rsi
 10ba4ff:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba503:	48 8d 0d b6 2f 79 00 	lea    rcx,[rip+0x792fb6]        # 184d4c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ba8>
 10ba50a:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba50d:	0f 57 c0             	xorps  xmm0,xmm0
 10ba510:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 10ba514:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
 10ba519:	48 89 56 28          	mov    QWORD PTR [rsi+0x28],rdx
 10ba51d:	48 8d 0d d4 52 38 ff 	lea    rcx,[rip+0xffffffffff3852d4]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10ba524:	48 89 4e 30          	mov    QWORD PTR [rsi+0x30],rcx
 10ba528:	c6 46 38 00          	mov    BYTE PTR [rsi+0x38],0x0
 10ba52c:	c3                   	ret
 10ba52d:	cc                   	int3
 10ba52e:	0f 18 0d 63 e3 83 00 	prefetcht0 BYTE PTR [rip+0x83e363]        # 18f8898 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fca8>
 10ba535:	48 8d 05 5c e3 83 00 	lea    rax,[rip+0x83e35c]        # 18f8898 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fca8>
 10ba53c:	48 8b 0d 5d e3 83 00 	mov    rcx,QWORD PTR [rip+0x83e35d]        # 18f88a0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fcb0>
 10ba543:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba546:	c3                   	ret
 10ba547:	cc                   	int3
 10ba548:	48 89 f0             	mov    rax,rsi
 10ba54b:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba54f:	48 8d 0d 6a 2e 79 00 	lea    rcx,[rip+0x792e6a]        # 184d3c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9aa8>
 10ba556:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba559:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10ba55e:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
 10ba562:	c3                   	ret
 10ba563:	cc                   	int3
 10ba564:	0f 18 0d 65 e2 83 00 	prefetcht0 BYTE PTR [rip+0x83e265]        # 18f87d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fbe0>
 10ba56b:	48 8d 05 5e e2 83 00 	lea    rax,[rip+0x83e25e]        # 18f87d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fbe0>
 10ba572:	48 8b 0d 5f e2 83 00 	mov    rcx,QWORD PTR [rip+0x83e25f]        # 18f87d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fbe8>
 10ba579:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba57c:	c3                   	ret
 10ba57d:	cc                   	int3
 10ba57e:	48 89 f0             	mov    rax,rsi
 10ba581:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba585:	48 8d 0d b4 2e 79 00 	lea    rcx,[rip+0x792eb4]        # 184d440 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9b28>
 10ba58c:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba58f:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10ba594:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
 10ba598:	c3                   	ret
 10ba599:	cc                   	int3
 10ba59a:	0f 18 0d 4f e1 83 00 	prefetcht0 BYTE PTR [rip+0x83e14f]        # 18f86f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fb00>
 10ba5a1:	48 8d 05 48 e1 83 00 	lea    rax,[rip+0x83e148]        # 18f86f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fb00>
 10ba5a8:	48 8b 0d 49 e1 83 00 	mov    rcx,QWORD PTR [rip+0x83e149]        # 18f86f8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3fb08>
 10ba5af:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10ba5b2:	c3                   	ret
 10ba5b3:	cc                   	int3
 10ba5b4:	48 89 f0             	mov    rax,rsi
 10ba5b7:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10ba5bb:	48 8d 0d be 2d 79 00 	lea    rcx,[rip+0x792dbe]        # 184d380 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9a68>
 10ba5c2:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10ba5c5:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10ba5ca:	48 83 66 15 00       	and    QWORD PTR [rsi+0x15],0x0
 10ba5cf:	c3                   	ret
 10ba5d0:	55                   	push   rbp
 10ba5d1:	41 57                	push   r15
 10ba5d3:	41 56                	push   r14
 10ba5d5:	53                   	push   rbx
 10ba5d6:	48 83 ec 68          	sub    rsp,0x68
 10ba5da:	49 89 f6             	mov    r14,rsi
 10ba5dd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba5e4:	00 00
 10ba5e6:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10ba5eb:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10ba5ee:	48 8d 35 e3 db 92 00 	lea    rsi,[rip+0x92dbe3]        # 19e81d8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27c8>
 10ba5f5:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
 10ba5fa:	4c 89 ff             	mov    rdi,r15
 10ba5fd:	e8 a8 77 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10ba602:	4c 89 f7             	mov    rdi,r14
 10ba605:	4c 89 fe             	mov    rsi,r15
 10ba608:	e8 35 9a a7 ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
 10ba60d:	84 c0                	test   al,al
 10ba60f:	75 58                	jne    10ba669 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281a7f>
 10ba611:	48 8d 35 d0 db 92 00 	lea    rsi,[rip+0x92dbd0]        # 19e81e8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27d8>
 10ba618:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10ba61d:	e8 88 77 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10ba622:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 10ba627:	4c 89 f7             	mov    rdi,r14
 10ba62a:	e8 13 9a a7 ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
 10ba62f:	84 c0                	test   al,al
 10ba631:	75 2c                	jne    10ba65f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281a75>
 10ba633:	48 8d 35 be db 92 00 	lea    rsi,[rip+0x92dbbe]        # 19e81f8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27e8>
 10ba63a:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 10ba63f:	e8 66 77 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10ba644:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 10ba649:	4c 89 f7             	mov    rdi,r14
 10ba64c:	e8 f1 99 a7 ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
 10ba651:	84 c0                	test   al,al
```
## All observed indirect `+0x78/+0x10` call-shape snippets

```text
  9e19f5:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
  9e19f9:	49 8b 76 18          	mov    rsi,QWORD PTR [r14+0x18]
  9e19fd:	48 8d 7c 24 0c       	lea    rdi,[rsp+0xc]
  9e1a02:	41 ff 56 10          	call   QWORD PTR [r14+0x10]
  9e1a06:	83 03 01             	add    DWORD PTR [rbx],0x1
  9e1a09:	49 83 c4 04          	add    r12,0x4
  9e1a0d:	31 c0                	xor    eax,eax
  9e1a0f:	4d 39 e5             	cmp    r13,r12
  9e2b4e:	49 89 fd             	mov    r13,rdi
  9e2b51:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
  9e2b54:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  9e2b57:	ff 50 10             	call   QWORD PTR [rax+0x10]
  9e2b5a:	85 c0                	test   eax,eax
  9e2b5c:	74 1f                	je     9e2b7d <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xa9ad>
  9e2b5e:	41 89 c4             	mov    r12d,eax
  9e2b61:	4d 8b 7d 00          	mov    r15,QWORD PTR [r13+0x0]
  a02409:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a0240c:	49 89 fe             	mov    r14,rdi
  a0240f:	48 89 df             	mov    rdi,rbx
  a02412:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a02415:	48 89 df             	mov    rdi,rbx
  a02418:	e8 d3 bb de 00       	call   17edff0 <_ZNSt6__ndk119__shared_weak_count14__release_weakEv@plt>
  a0241d:	4c 89 f7             	mov    rdi,r14
  a02420:	48 83 c4 08          	add    rsp,0x8
  a05409:	5b                   	pop    rbx
  a0540a:	c3                   	ret
  a0540b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a0540e:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a05411:	48 85 db             	test   rbx,rbx
  a05414:	0f 94 c0             	sete   al
  a05417:	5b                   	pop    rbx
  a05418:	c3                   	ret
  a05444:	c3                   	ret
  a05445:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a05448:	48 89 fb             	mov    rbx,rdi
  a0544b:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a0544e:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
  a05452:	48 85 c0             	test   rax,rax
  a05455:	74 12                	je     a05469 <_ZNSt6__ndk119__shared_weak_count16__release_sharedEv@@Base+0x39>
  a05457:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
  a0ea18:	74 01                	je     a0ea1b <_ZNSt6__ndk113shared_futureIvED1Ev@@Base+0x1b>
  a0ea1a:	c3                   	ret
  a0ea1b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a0ea1e:	ff 60 10             	jmp    QWORD PTR [rax+0x10]
  a0ea21:	cc                   	int3
  a0ea22:	cc                   	int3
  a0ea23:	cc                   	int3
  a0ea24:	cc                   	int3
  a0ea66:	48 83 c4 08          	add    rsp,0x8
  a0ea6a:	5b                   	pop    rbx
  a0ea6b:	41 5e                	pop    r14
  a0ea6d:	ff 60 10             	jmp    QWORD PTR [rax+0x10]
  a0ea70:	49 89 c6             	mov    r14,rax
  a0ea73:	48 85 db             	test   rbx,rbx
  a0ea76:	74 1b                	je     a0ea93 <_ZNSt6__ndk16futureIvE3getEv@@Base+0x63>
  a0ea78:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
  a0ea88:	75 09                	jne    a0ea93 <_ZNSt6__ndk16futureIvE3getEv@@Base+0x63>
  a0ea8a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a0ea8d:	48 89 df             	mov    rdi,rbx
  a0ea90:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a0ea93:	4c 89 f7             	mov    rdi,r14
  a0ea96:	e8 35 12 06 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a0ea9b:	cc                   	int3
  a0ea9c:	cc                   	int3
  a0eb43:	75 09                	jne    a0eb4e <_ZNSt6__ndk17promiseIvED1Ev@@Base+0x5e>
  a0eb45:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a0eb48:	4c 89 f7             	mov    rdi,r14
  a0eb4b:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a0eb4e:	48 83 c4 30          	add    rsp,0x30
  a0eb52:	5b                   	pop    rbx
  a0eb53:	41 5e                	pop    r14
  a0eb55:	41 5f                	pop    r15
  a0ee75:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  a0ee78:	48 89 c3             	mov    rbx,rax
  a0ee7b:	49 89 f6             	mov    r14,rsi
  a0ee7e:	ff 51 10             	call   QWORD PTR [rcx+0x10]
  a0ee81:	4c 89 f6             	mov    rsi,r14
  a0ee84:	48 89 d8             	mov    rax,rbx
  a0ee87:	48 83 c4 08          	add    rsp,0x8
  a0ee8b:	5b                   	pop    rbx
  a0f911:	48 85 c0             	test   rax,rax
  a0f914:	75 da                	jne    a0f8f0 <_ZNSt6__ndk119__thread_local_dataEv@@Base+0xf0>
  a0f916:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a0f919:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a0f91c:	eb d2                	jmp    a0f8f0 <_ZNSt6__ndk119__thread_local_dataEv@@Base+0xf0>
  a0f91e:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  a0f922:	48 85 ff             	test   rdi,rdi
  a0f925:	74 09                	je     a0f930 <_ZNSt6__ndk119__thread_local_dataEv@@Base+0x130>
  a10b0e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  a10b11:	48 89 f7             	mov    rdi,rsi
  a10b14:	48 89 d6             	mov    rsi,rdx
  a10b17:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a10b1a:	49 83 c6 08          	add    r14,0x8
  a10b1e:	4c 89 ff             	mov    rdi,r15
  a10b21:	4c 89 f6             	mov    rsi,r14
  a10b24:	e8 57 de dd 00       	call   17ee980 <_ZNSt6__ndk16localeC1ERKS0_@plt>
  a19263:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a19266:	48 89 df             	mov    rdi,rbx
  a19269:	4c 89 f6             	mov    rsi,r14
  a1926c:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a1926f:	48 83 c3 08          	add    rbx,0x8
  a19273:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
  a19278:	4c 89 f7             	mov    rdi,r14
  a1927b:	48 89 de             	mov    rsi,rbx
  a194a2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a194a5:	48 89 df             	mov    rdi,rbx
  a194a8:	4c 89 f6             	mov    rsi,r14
  a194ab:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a194ae:	4c 8d 73 08          	lea    r14,[rbx+0x8]
  a194b2:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
  a194b7:	4c 89 ff             	mov    rdi,r15
  a194ba:	4c 89 f6             	mov    rsi,r14
  a197f5:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a197f8:	4c 89 f7             	mov    rdi,r14
  a197fb:	4c 89 ee             	mov    rsi,r13
  a197fe:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a19801:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
  a19808:	00
  a19809:	4c 89 f7             	mov    rdi,r14
  a1980c:	4c 89 e6             	mov    rsi,r12
  a19834:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a19837:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  a1983c:	48 89 df             	mov    rdi,rbx
  a1983f:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a19842:	48 8d 5c 24 78       	lea    rbx,[rsp+0x78]
  a19847:	48 89 df             	mov    rdi,rbx
  a1984a:	4c 89 fe             	mov    rsi,r15
  a1984d:	e8 2e 51 dd 00       	call   17ee980 <_ZNSt6__ndk16localeC1ERKS0_@plt>
  a1bfb7:	48 8b 05 9a 36 fc 00 	mov    rax,QWORD PTR [rip+0xfc369a]        # 19df658 <_ZNSt6__ndk15wclogE@@Base+0xa8>
  a1bfbe:	48 89 df             	mov    rdi,rbx
  a1bfc1:	4c 89 f6             	mov    rsi,r14
  a1bfc4:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a1bfc7:	48 89 e7             	mov    rdi,rsp
  a1bfca:	e8 61 26 dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
  a1bfcf:	48 8b 05 ca 5d e9 00 	mov    rax,QWORD PTR [rip+0xe95dca]        # 18b1da0 <_ZTVNSt6__ndk113basic_istreamIcNS_11char_traitsIcEEEE@@Base+0xbc758>
  a1bfd6:	48 8d 48 18          	lea    rcx,[rax+0x18]
  a1c262:	48 8b 05 2f 35 fc 00 	mov    rax,QWORD PTR [rip+0xfc352f]        # 19df798 <_ZNSt6__ndk15wclogE@@Base+0x1e8>
  a1c269:	48 89 df             	mov    rdi,rbx
  a1c26c:	4c 89 f6             	mov    rsi,r14
  a1c26f:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a1c272:	48 89 e7             	mov    rdi,rsp
  a1c275:	e8 b6 23 dd 00       	call   17ee630 <_ZNSt6__ndk16localeD1Ev@plt>
  a1c27a:	48 8b 05 17 5d e9 00 	mov    rax,QWORD PTR [rip+0xe95d17]        # 18b1f98 <_ZTVNSt6__ndk113basic_istreamIwNS_11char_traitsIwEEEE@@Base+0xbc760>
  a1c281:	48 8d 48 18          	lea    rcx,[rax+0x18]
  a2bd3d:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
  a2bd41:	48 83 c5 10          	add    rbp,0x10
  a2bd45:	48 89 ef             	mov    rdi,rbp
  a2bd48:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a2bd4b:	0f b6 08             	movzx  ecx,BYTE PTR [rax]
  a2bd4e:	f6 c1 01             	test   cl,0x1
  a2bd51:	74 3e                	je     a2bd91 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE6do_getES4_S4_RNS_8ios_baseERjP2tmcc@@Base+0x5a1>
  a2bd53:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
  a2c1e9:	48 89 f3             	mov    rbx,rsi
  a2c1ec:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  a2c1f0:	48 83 c7 10          	add    rdi,0x10
  a2c1f4:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a2c1f7:	0f b6 08             	movzx  ecx,BYTE PTR [rax]
  a2c1fa:	f6 c1 01             	test   cl,0x1
  a2c1fd:	74 4a                	je     a2c249 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE11__get_am_pmERiRS4_S4_RjRKNS_5ctypeIcEE@@Base+0x79>
  a2c1ff:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
  a2d88b:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
  a2d88f:	49 83 c5 10          	add    r13,0x10
  a2d893:	4c 89 ef             	mov    rdi,r13
  a2d896:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a2d899:	0f b6 08             	movzx  ecx,BYTE PTR [rax]
  a2d89c:	f6 c1 01             	test   cl,0x1
  a2d89f:	74 3e                	je     a2d8df <_ZNKSt6__ndk18time_getIwNS_19istreambuf_iteratorIwNS_11char_traitsIwEEEEE6do_getES4_S4_RNS_8ios_baseERjP2tmcc@@Base+0x5bf>
  a2d8a1:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
  a2dd49:	48 89 f3             	mov    rbx,rsi
  a2dd4c:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  a2dd50:	48 83 c7 10          	add    rdi,0x10
  a2dd54:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a2dd57:	0f b6 08             	movzx  ecx,BYTE PTR [rax]
  a2dd5a:	f6 c1 01             	test   cl,0x1
  a2dd5d:	74 4a                	je     a2dda9 <_ZNKSt6__ndk18time_getIwNS_19istreambuf_iteratorIwNS_11char_traitsIwEEEEE11__get_am_pmERiRS4_S4_RjRKNS_5ctypeIwEE@@Base+0x79>
  a2dd5f:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
  a308be:	00 00
  a308c0:	48 85 ff             	test   rdi,rdi
  a308c3:	74 04                	je     a308c9 <_ZNKSt6__ndk19money_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE6do_getES4_S4_bRNS_8ios_baseERjRNS_12basic_stringIcS3_NS_9allocatorIcEEEE@@Base+0x209>
  a308c5:	ff 54 24 10          	call   QWORD PTR [rsp+0x10]
  a308c9:	48 89 d8             	mov    rax,rbx
  a308cc:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
  a308d3:	5b                   	pop    rbx
  a308d4:	41 5c                	pop    r12
  a30944:	4d 85 ff             	test   r15,r15
  a30947:	74 07                	je     a30950 <_ZNKSt6__ndk19money_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE6do_getES4_S4_bRNS_8ios_baseERjRNS_12basic_stringIcS3_NS_9allocatorIcEEEE@@Base+0x290>
  a30949:	4c 89 ff             	mov    rdi,r15
  a3094c:	ff 54 24 10          	call   QWORD PTR [rsp+0x10]
  a30950:	48 89 df             	mov    rdi,rbx
  a30953:	e8 78 f3 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a30958:	48 89 c7             	mov    rdi,rax
  a3095b:	e8 45 91 04 00       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  a32707:	00 00
  a32709:	48 85 ff             	test   rdi,rdi
  a3270c:	74 04                	je     a32712 <_ZNKSt6__ndk19money_getIwNS_19istreambuf_iteratorIwNS_11char_traitsIwEEEEE6do_getES4_S4_bRNS_8ios_baseERjRNS_12basic_stringIwS3_NS_9allocatorIwEEEE@@Base+0x222>
  a3270e:	ff 54 24 10          	call   QWORD PTR [rsp+0x10]
  a32712:	48 89 d8             	mov    rax,rbx
  a32715:	48 81 c4 d8 01 00 00 	add    rsp,0x1d8
  a3271c:	5b                   	pop    rbx
  a3271d:	41 5c                	pop    r12
  a32777:	4d 85 ff             	test   r15,r15
  a3277a:	74 07                	je     a32783 <_ZNKSt6__ndk19money_getIwNS_19istreambuf_iteratorIwNS_11char_traitsIwEEEEE6do_getES4_S4_bRNS_8ios_baseERjRNS_12basic_stringIwS3_NS_9allocatorIwEEEE@@Base+0x293>
  a3277c:	4c 89 ff             	mov    rdi,r15
  a3277f:	ff 54 24 10          	call   QWORD PTR [rsp+0x10]
  a32783:	48 89 df             	mov    rdi,rbx
  a32786:	e8 45 d5 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a3278b:	48 89 c7             	mov    rdi,rax
  a3278e:	e8 12 73 04 00       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  a35a4e:	48 85 c0             	test   rax,rax
  a35a51:	75 06                	jne    a35a59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x929>
  a35a53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a35a56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35a59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a35a5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a35a61:	48 83 c4 18          	add    rsp,0x18
  a35a65:	5b                   	pop    rbx
  a35a85:	75 09                	jne    a35a90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x960>
  a35a87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a35a8a:	48 89 df             	mov    rdi,rbx
  a35a8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35a90:	4c 89 f7             	mov    rdi,r14
  a35a93:	e8 38 a2 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a35a98:	cc                   	int3
  a35a99:	cc                   	int3
  a35b4e:	48 85 c0             	test   rax,rax
  a35b51:	75 06                	jne    a35b59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xa29>
  a35b53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a35b56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35b59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a35b5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a35b61:	48 83 c4 18          	add    rsp,0x18
  a35b65:	5b                   	pop    rbx
  a35b85:	75 09                	jne    a35b90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xa60>
  a35b87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a35b8a:	48 89 df             	mov    rdi,rbx
  a35b8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35b90:	4c 89 f7             	mov    rdi,r14
  a35b93:	e8 38 a1 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a35b98:	cc                   	int3
  a35b99:	cc                   	int3
  a35c4e:	48 85 c0             	test   rax,rax
  a35c51:	75 06                	jne    a35c59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xb29>
  a35c53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a35c56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35c59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a35c5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a35c61:	48 83 c4 18          	add    rsp,0x18
  a35c65:	5b                   	pop    rbx
  a35c85:	75 09                	jne    a35c90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xb60>
  a35c87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a35c8a:	48 89 df             	mov    rdi,rbx
  a35c8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35c90:	4c 89 f7             	mov    rdi,r14
  a35c93:	e8 38 a0 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a35c98:	cc                   	int3
  a35c99:	cc                   	int3
  a35d4e:	48 85 c0             	test   rax,rax
  a35d51:	75 06                	jne    a35d59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xc29>
  a35d53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a35d56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35d59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a35d5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a35d61:	48 83 c4 18          	add    rsp,0x18
  a35d65:	5b                   	pop    rbx
  a35d85:	75 09                	jne    a35d90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xc60>
  a35d87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a35d8a:	48 89 df             	mov    rdi,rbx
  a35d8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35d90:	4c 89 f7             	mov    rdi,r14
  a35d93:	e8 38 9f 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a35d98:	cc                   	int3
  a35d99:	cc                   	int3
  a35e4e:	48 85 c0             	test   rax,rax
  a35e51:	75 06                	jne    a35e59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xd29>
  a35e53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a35e56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35e59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a35e5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a35e61:	48 83 c4 18          	add    rsp,0x18
  a35e65:	5b                   	pop    rbx
  a35e85:	75 09                	jne    a35e90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xd60>
  a35e87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a35e8a:	48 89 df             	mov    rdi,rbx
  a35e8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35e90:	4c 89 f7             	mov    rdi,r14
  a35e93:	e8 38 9e 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a35e98:	cc                   	int3
  a35e99:	cc                   	int3
  a35f4e:	48 85 c0             	test   rax,rax
  a35f51:	75 06                	jne    a35f59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xe29>
  a35f53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a35f56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35f59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a35f5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a35f61:	48 83 c4 18          	add    rsp,0x18
  a35f65:	5b                   	pop    rbx
  a35f85:	75 09                	jne    a35f90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xe60>
  a35f87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a35f8a:	48 89 df             	mov    rdi,rbx
  a35f8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a35f90:	4c 89 f7             	mov    rdi,r14
  a35f93:	e8 38 9d 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a35f98:	cc                   	int3
  a35f99:	cc                   	int3
  a3604e:	48 85 c0             	test   rax,rax
  a36051:	75 06                	jne    a36059 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xf29>
  a36053:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36056:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36059:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3605c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36061:	48 83 c4 18          	add    rsp,0x18
  a36065:	5b                   	pop    rbx
  a36085:	75 09                	jne    a36090 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0xf60>
  a36087:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3608a:	48 89 df             	mov    rdi,rbx
  a3608d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36090:	4c 89 f7             	mov    rdi,r14
  a36093:	e8 38 9c 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36098:	cc                   	int3
  a36099:	cc                   	int3
  a3614e:	48 85 c0             	test   rax,rax
  a36151:	75 06                	jne    a36159 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1029>
  a36153:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36156:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36159:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3615c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36161:	48 83 c4 18          	add    rsp,0x18
  a36165:	5b                   	pop    rbx
  a36185:	75 09                	jne    a36190 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1060>
  a36187:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3618a:	48 89 df             	mov    rdi,rbx
  a3618d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36190:	4c 89 f7             	mov    rdi,r14
  a36193:	e8 38 9b 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36198:	cc                   	int3
  a36199:	cc                   	int3
  a3624e:	48 85 c0             	test   rax,rax
  a36251:	75 06                	jne    a36259 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1129>
  a36253:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36256:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36259:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3625c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36261:	48 83 c4 18          	add    rsp,0x18
  a36265:	5b                   	pop    rbx
  a36285:	75 09                	jne    a36290 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1160>
  a36287:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3628a:	48 89 df             	mov    rdi,rbx
  a3628d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36290:	4c 89 f7             	mov    rdi,r14
  a36293:	e8 38 9a 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36298:	cc                   	int3
  a36299:	cc                   	int3
  a3634e:	48 85 c0             	test   rax,rax
  a36351:	75 06                	jne    a36359 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1229>
  a36353:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36356:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36359:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3635c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36361:	48 83 c4 18          	add    rsp,0x18
  a36365:	5b                   	pop    rbx
  a36385:	75 09                	jne    a36390 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1260>
  a36387:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3638a:	48 89 df             	mov    rdi,rbx
  a3638d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36390:	4c 89 f7             	mov    rdi,r14
  a36393:	e8 38 99 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36398:	cc                   	int3
  a36399:	cc                   	int3
  a3644e:	48 85 c0             	test   rax,rax
  a36451:	75 06                	jne    a36459 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1329>
  a36453:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36456:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36459:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3645c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36461:	48 83 c4 18          	add    rsp,0x18
  a36465:	5b                   	pop    rbx
  a36485:	75 09                	jne    a36490 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1360>
  a36487:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3648a:	48 89 df             	mov    rdi,rbx
  a3648d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36490:	4c 89 f7             	mov    rdi,r14
  a36493:	e8 38 98 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36498:	cc                   	int3
  a36499:	cc                   	int3
  a3654e:	48 85 c0             	test   rax,rax
  a36551:	75 06                	jne    a36559 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1429>
  a36553:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36556:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36559:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3655c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36561:	48 83 c4 18          	add    rsp,0x18
  a36565:	5b                   	pop    rbx
  a36585:	75 09                	jne    a36590 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1460>
  a36587:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3658a:	48 89 df             	mov    rdi,rbx
  a3658d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36590:	4c 89 f7             	mov    rdi,r14
  a36593:	e8 38 97 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36598:	cc                   	int3
  a36599:	cc                   	int3
  a3664e:	48 85 c0             	test   rax,rax
  a36651:	75 06                	jne    a36659 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1529>
  a36653:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36656:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36659:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3665c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36661:	48 83 c4 18          	add    rsp,0x18
  a36665:	5b                   	pop    rbx
  a36685:	75 09                	jne    a36690 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1560>
  a36687:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3668a:	48 89 df             	mov    rdi,rbx
  a3668d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36690:	4c 89 f7             	mov    rdi,r14
  a36693:	e8 38 96 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36698:	cc                   	int3
  a36699:	cc                   	int3
  a3674e:	48 85 c0             	test   rax,rax
  a36751:	75 06                	jne    a36759 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1629>
  a36753:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36756:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36759:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3675c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36761:	48 83 c4 18          	add    rsp,0x18
  a36765:	5b                   	pop    rbx
  a36785:	75 09                	jne    a36790 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1660>
  a36787:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3678a:	48 89 df             	mov    rdi,rbx
  a3678d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36790:	4c 89 f7             	mov    rdi,r14
  a36793:	e8 38 95 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36798:	cc                   	int3
  a36799:	cc                   	int3
  a3684e:	48 85 c0             	test   rax,rax
  a36851:	75 06                	jne    a36859 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1729>
  a36853:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36856:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36859:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3685c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36861:	48 83 c4 18          	add    rsp,0x18
  a36865:	5b                   	pop    rbx
  a36885:	75 09                	jne    a36890 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1760>
  a36887:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3688a:	48 89 df             	mov    rdi,rbx
  a3688d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36890:	4c 89 f7             	mov    rdi,r14
  a36893:	e8 38 94 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36898:	cc                   	int3
  a36899:	cc                   	int3
  a3694e:	48 85 c0             	test   rax,rax
  a36951:	75 06                	jne    a36959 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1829>
  a36953:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36956:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36959:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3695c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36961:	48 83 c4 18          	add    rsp,0x18
  a36965:	5b                   	pop    rbx
  a36985:	75 09                	jne    a36990 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1860>
  a36987:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3698a:	48 89 df             	mov    rdi,rbx
  a3698d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36990:	4c 89 f7             	mov    rdi,r14
  a36993:	e8 38 93 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36998:	cc                   	int3
  a36999:	cc                   	int3
  a36a4e:	48 85 c0             	test   rax,rax
  a36a51:	75 06                	jne    a36a59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1929>
  a36a53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36a56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36a59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a36a5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36a61:	48 83 c4 18          	add    rsp,0x18
  a36a65:	5b                   	pop    rbx
  a36a85:	75 09                	jne    a36a90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1960>
  a36a87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a36a8a:	48 89 df             	mov    rdi,rbx
  a36a8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36a90:	4c 89 f7             	mov    rdi,r14
  a36a93:	e8 38 92 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36a98:	cc                   	int3
  a36a99:	cc                   	int3
  a36b4e:	48 85 c0             	test   rax,rax
  a36b51:	75 06                	jne    a36b59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1a29>
  a36b53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36b56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36b59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a36b5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36b61:	48 83 c4 18          	add    rsp,0x18
  a36b65:	5b                   	pop    rbx
  a36b85:	75 09                	jne    a36b90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1a60>
  a36b87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a36b8a:	48 89 df             	mov    rdi,rbx
  a36b8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36b90:	4c 89 f7             	mov    rdi,r14
  a36b93:	e8 38 91 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36b98:	cc                   	int3
  a36b99:	cc                   	int3
  a36c4e:	48 85 c0             	test   rax,rax
  a36c51:	75 06                	jne    a36c59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1b29>
  a36c53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36c56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36c59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a36c5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36c61:	48 83 c4 18          	add    rsp,0x18
  a36c65:	5b                   	pop    rbx
  a36c85:	75 09                	jne    a36c90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1b60>
  a36c87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a36c8a:	48 89 df             	mov    rdi,rbx
  a36c8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36c90:	4c 89 f7             	mov    rdi,r14
  a36c93:	e8 38 90 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36c98:	cc                   	int3
  a36c99:	cc                   	int3
  a36d4e:	48 85 c0             	test   rax,rax
  a36d51:	75 06                	jne    a36d59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1c29>
  a36d53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36d56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36d59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a36d5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36d61:	48 83 c4 18          	add    rsp,0x18
  a36d65:	5b                   	pop    rbx
  a36d85:	75 09                	jne    a36d90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1c60>
  a36d87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a36d8a:	48 89 df             	mov    rdi,rbx
  a36d8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36d90:	4c 89 f7             	mov    rdi,r14
  a36d93:	e8 38 8f 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36d98:	cc                   	int3
  a36d99:	cc                   	int3
  a36e4e:	48 85 c0             	test   rax,rax
  a36e51:	75 06                	jne    a36e59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1d29>
  a36e53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36e56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36e59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a36e5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36e61:	48 83 c4 18          	add    rsp,0x18
  a36e65:	5b                   	pop    rbx
  a36e85:	75 09                	jne    a36e90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1d60>
  a36e87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a36e8a:	48 89 df             	mov    rdi,rbx
  a36e8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36e90:	4c 89 f7             	mov    rdi,r14
  a36e93:	e8 38 8e 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36e98:	cc                   	int3
  a36e99:	cc                   	int3
  a36f4e:	48 85 c0             	test   rax,rax
  a36f51:	75 06                	jne    a36f59 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1e29>
  a36f53:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a36f56:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36f59:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a36f5c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a36f61:	48 83 c4 18          	add    rsp,0x18
  a36f65:	5b                   	pop    rbx
  a36f85:	75 09                	jne    a36f90 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1e60>
  a36f87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a36f8a:	48 89 df             	mov    rdi,rbx
  a36f8d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a36f90:	4c 89 f7             	mov    rdi,r14
  a36f93:	e8 38 8d 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a36f98:	cc                   	int3
  a36f99:	cc                   	int3
  a3704e:	48 85 c0             	test   rax,rax
  a37051:	75 06                	jne    a37059 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1f29>
  a37053:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a37056:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37059:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3705c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a37061:	48 83 c4 18          	add    rsp,0x18
  a37065:	5b                   	pop    rbx
  a37085:	75 09                	jne    a37090 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x1f60>
  a37087:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3708a:	48 89 df             	mov    rdi,rbx
  a3708d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37090:	4c 89 f7             	mov    rdi,r14
  a37093:	e8 38 8c 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a37098:	cc                   	int3
  a37099:	cc                   	int3
  a3714e:	48 85 c0             	test   rax,rax
  a37151:	75 06                	jne    a37159 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2029>
  a37153:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a37156:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37159:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3715c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a37161:	48 83 c4 18          	add    rsp,0x18
  a37165:	5b                   	pop    rbx
  a37185:	75 09                	jne    a37190 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2060>
  a37187:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3718a:	48 89 df             	mov    rdi,rbx
  a3718d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37190:	4c 89 f7             	mov    rdi,r14
  a37193:	e8 38 8b 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a37198:	cc                   	int3
  a37199:	cc                   	int3
  a3724e:	48 85 c0             	test   rax,rax
  a37251:	75 06                	jne    a37259 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2129>
  a37253:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a37256:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37259:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3725c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a37261:	48 83 c4 18          	add    rsp,0x18
  a37265:	5b                   	pop    rbx
  a37285:	75 09                	jne    a37290 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2160>
  a37287:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3728a:	48 89 df             	mov    rdi,rbx
  a3728d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37290:	4c 89 f7             	mov    rdi,r14
  a37293:	e8 38 8a 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a37298:	cc                   	int3
  a37299:	cc                   	int3
  a3734e:	48 85 c0             	test   rax,rax
  a37351:	75 06                	jne    a37359 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2229>
  a37353:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a37356:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37359:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3735c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a37361:	48 83 c4 18          	add    rsp,0x18
  a37365:	5b                   	pop    rbx
  a37385:	75 09                	jne    a37390 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2260>
  a37387:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3738a:	48 89 df             	mov    rdi,rbx
  a3738d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37390:	4c 89 f7             	mov    rdi,r14
  a37393:	e8 38 89 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a37398:	cc                   	int3
  a37399:	cc                   	int3
  a3744e:	48 85 c0             	test   rax,rax
  a37451:	75 06                	jne    a37459 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2329>
  a37453:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a37456:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37459:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3745c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a37461:	48 83 c4 18          	add    rsp,0x18
  a37465:	5b                   	pop    rbx
  a37485:	75 09                	jne    a37490 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2360>
  a37487:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3748a:	48 89 df             	mov    rdi,rbx
  a3748d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37490:	4c 89 f7             	mov    rdi,r14
  a37493:	e8 38 88 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a37498:	cc                   	int3
  a37499:	cc                   	int3
  a3754e:	48 85 c0             	test   rax,rax
  a37551:	75 06                	jne    a37559 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2429>
  a37553:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a37556:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37559:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3755c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a37561:	48 83 c4 18          	add    rsp,0x18
  a37565:	5b                   	pop    rbx
  a37585:	75 09                	jne    a37590 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2460>
  a37587:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3758a:	48 89 df             	mov    rdi,rbx
  a3758d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37590:	4c 89 f7             	mov    rdi,r14
  a37593:	e8 38 87 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a37598:	cc                   	int3
  a37599:	cc                   	int3
  a3764e:	48 85 c0             	test   rax,rax
  a37651:	75 06                	jne    a37659 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2529>
  a37653:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a37656:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37659:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3765c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a37661:	48 83 c4 18          	add    rsp,0x18
  a37665:	5b                   	pop    rbx
  a37685:	75 09                	jne    a37690 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2560>
  a37687:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3768a:	48 89 df             	mov    rdi,rbx
  a3768d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37690:	4c 89 f7             	mov    rdi,r14
  a37693:	e8 38 86 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a37698:	cc                   	int3
  a37699:	cc                   	int3
  a3774e:	48 85 c0             	test   rax,rax
  a37751:	75 06                	jne    a37759 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2629>
  a37753:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a37756:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37759:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a3775c:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a37761:	48 83 c4 18          	add    rsp,0x18
  a37765:	5b                   	pop    rbx
  a37785:	75 09                	jne    a37790 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2660>
  a37787:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a3778a:	48 89 df             	mov    rdi,rbx
  a3778d:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37790:	4c 89 f7             	mov    rdi,r14
  a37793:	e8 38 85 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a37798:	cc                   	int3
  a37799:	cc                   	int3
  a37e00:	48 85 c0             	test   rax,rax
  a37e03:	75 cb                	jne    a37dd0 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2ca0>
  a37e05:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a37e08:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37e0b:	eb c3                	jmp    a37dd0 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2ca0>
  a37e0d:	49 89 c4             	mov    r12,rax
  a37e10:	e8 7b 67 db 00       	call   17ee590 <__cxa_end_catch@plt>
  a37e15:	41 f6 07 01          	test   BYTE PTR [r15],0x1
  a37fae:	48 85 c0             	test   rax,rax
  a37fb1:	75 06                	jne    a37fb9 <_ZNSt6__ndk16locale7classicEv@@Base+0x129>
  a37fb3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a37fb6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37fb9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a37fbc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a37fc1:	48 83 c4 18          	add    rsp,0x18
  a37fc5:	5b                   	pop    rbx
  a37fe5:	75 09                	jne    a37ff0 <_ZNSt6__ndk16locale7classicEv@@Base+0x160>
  a37fe7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a37fea:	48 89 df             	mov    rdi,rbx
  a37fed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a37ff0:	4c 89 f7             	mov    rdi,r14
  a37ff3:	e8 d8 7c 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a37ff8:	cc                   	int3
  a37ff9:	cc                   	int3
  a380ae:	48 85 c0             	test   rax,rax
  a380b1:	75 06                	jne    a380b9 <_ZNSt6__ndk16locale7classicEv@@Base+0x229>
  a380b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a380b6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a380b9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a380bc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a380c1:	48 83 c4 18          	add    rsp,0x18
  a380c5:	5b                   	pop    rbx
  a380e5:	75 09                	jne    a380f0 <_ZNSt6__ndk16locale7classicEv@@Base+0x260>
  a380e7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a380ea:	48 89 df             	mov    rdi,rbx
  a380ed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a380f0:	4c 89 f7             	mov    rdi,r14
  a380f3:	e8 d8 7b 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a380f8:	cc                   	int3
  a380f9:	cc                   	int3
  a381ae:	48 85 c0             	test   rax,rax
  a381b1:	75 06                	jne    a381b9 <_ZNSt6__ndk16locale7classicEv@@Base+0x329>
  a381b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a381b6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a381b9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a381bc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a381c1:	48 83 c4 18          	add    rsp,0x18
  a381c5:	5b                   	pop    rbx
  a381e5:	75 09                	jne    a381f0 <_ZNSt6__ndk16locale7classicEv@@Base+0x360>
  a381e7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a381ea:	48 89 df             	mov    rdi,rbx
  a381ed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a381f0:	4c 89 f7             	mov    rdi,r14
  a381f3:	e8 d8 7a 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a381f8:	cc                   	int3
  a381f9:	cc                   	int3
  a382ae:	48 85 c0             	test   rax,rax
  a382b1:	75 06                	jne    a382b9 <_ZNSt6__ndk16locale7classicEv@@Base+0x429>
  a382b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a382b6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a382b9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a382bc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a382c1:	48 83 c4 18          	add    rsp,0x18
  a382c5:	5b                   	pop    rbx
  a382e5:	75 09                	jne    a382f0 <_ZNSt6__ndk16locale7classicEv@@Base+0x460>
  a382e7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a382ea:	48 89 df             	mov    rdi,rbx
  a382ed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a382f0:	4c 89 f7             	mov    rdi,r14
  a382f3:	e8 d8 79 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a382f8:	cc                   	int3
  a382f9:	cc                   	int3
  a383ae:	48 85 c0             	test   rax,rax
  a383b1:	75 06                	jne    a383b9 <_ZNSt6__ndk16locale7classicEv@@Base+0x529>
  a383b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a383b6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a383b9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a383bc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a383c1:	48 83 c4 18          	add    rsp,0x18
  a383c5:	5b                   	pop    rbx
  a383e5:	75 09                	jne    a383f0 <_ZNSt6__ndk16locale7classicEv@@Base+0x560>
  a383e7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a383ea:	48 89 df             	mov    rdi,rbx
  a383ed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a383f0:	4c 89 f7             	mov    rdi,r14
  a383f3:	e8 d8 78 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a383f8:	cc                   	int3
  a383f9:	cc                   	int3
  a384ae:	48 85 c0             	test   rax,rax
  a384b1:	75 06                	jne    a384b9 <_ZNSt6__ndk16locale7classicEv@@Base+0x629>
  a384b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a384b6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a384b9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a384bc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a384c1:	48 83 c4 18          	add    rsp,0x18
  a384c5:	5b                   	pop    rbx
  a384e5:	75 09                	jne    a384f0 <_ZNSt6__ndk16locale7classicEv@@Base+0x660>
  a384e7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a384ea:	48 89 df             	mov    rdi,rbx
  a384ed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a384f0:	4c 89 f7             	mov    rdi,r14
  a384f3:	e8 d8 77 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a384f8:	cc                   	int3
  a384f9:	cc                   	int3
  a385ae:	48 85 c0             	test   rax,rax
  a385b1:	75 06                	jne    a385b9 <_ZNSt6__ndk16locale7classicEv@@Base+0x729>
  a385b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a385b6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a385b9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a385bc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a385c1:	48 83 c4 18          	add    rsp,0x18
  a385c5:	5b                   	pop    rbx
  a385e5:	75 09                	jne    a385f0 <_ZNSt6__ndk16locale7classicEv@@Base+0x760>
  a385e7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a385ea:	48 89 df             	mov    rdi,rbx
  a385ed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a385f0:	4c 89 f7             	mov    rdi,r14
  a385f3:	e8 d8 76 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a385f8:	cc                   	int3
  a385f9:	cc                   	int3
  a386ae:	48 85 c0             	test   rax,rax
  a386b1:	75 06                	jne    a386b9 <_ZNSt6__ndk16locale7classicEv@@Base+0x829>
  a386b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a386b6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a386b9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a386bc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a386c1:	48 83 c4 18          	add    rsp,0x18
  a386c5:	5b                   	pop    rbx
  a386e5:	75 09                	jne    a386f0 <_ZNSt6__ndk16locale7classicEv@@Base+0x860>
  a386e7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a386ea:	48 89 df             	mov    rdi,rbx
  a386ed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a386f0:	4c 89 f7             	mov    rdi,r14
  a386f3:	e8 d8 75 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a386f8:	cc                   	int3
  a386f9:	cc                   	int3
  a387ae:	48 85 c0             	test   rax,rax
  a387b1:	75 06                	jne    a387b9 <_ZNSt6__ndk16locale7classicEv@@Base+0x929>
  a387b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a387b6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a387b9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a387bc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a387c1:	48 83 c4 18          	add    rsp,0x18
  a387c5:	5b                   	pop    rbx
  a387e5:	75 09                	jne    a387f0 <_ZNSt6__ndk16locale7classicEv@@Base+0x960>
  a387e7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a387ea:	48 89 df             	mov    rdi,rbx
  a387ed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a387f0:	4c 89 f7             	mov    rdi,r14
  a387f3:	e8 d8 74 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a387f8:	cc                   	int3
  a387f9:	cc                   	int3
  a388ae:	48 85 c0             	test   rax,rax
  a388b1:	75 06                	jne    a388b9 <_ZNSt6__ndk16locale7classicEv@@Base+0xa29>
  a388b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a388b6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a388b9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a388bc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a388c1:	48 83 c4 18          	add    rsp,0x18
  a388c5:	5b                   	pop    rbx
  a388e5:	75 09                	jne    a388f0 <_ZNSt6__ndk16locale7classicEv@@Base+0xa60>
  a388e7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a388ea:	48 89 df             	mov    rdi,rbx
  a388ed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a388f0:	4c 89 f7             	mov    rdi,r14
  a388f3:	e8 d8 73 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a388f8:	cc                   	int3
  a388f9:	cc                   	int3
  a389ae:	48 85 c0             	test   rax,rax
  a389b1:	75 06                	jne    a389b9 <_ZNSt6__ndk16locale7classicEv@@Base+0xb29>
  a389b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a389b6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a389b9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a389bc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a389c1:	48 83 c4 18          	add    rsp,0x18
  a389c5:	5b                   	pop    rbx
  a389e5:	75 09                	jne    a389f0 <_ZNSt6__ndk16locale7classicEv@@Base+0xb60>
  a389e7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a389ea:	48 89 df             	mov    rdi,rbx
  a389ed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a389f0:	4c 89 f7             	mov    rdi,r14
  a389f3:	e8 d8 72 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a389f8:	cc                   	int3
  a389f9:	cc                   	int3
  a38aae:	48 85 c0             	test   rax,rax
  a38ab1:	75 06                	jne    a38ab9 <_ZNSt6__ndk16locale7classicEv@@Base+0xc29>
  a38ab3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a38ab6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a38ab9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a38abc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a38ac1:	48 83 c4 18          	add    rsp,0x18
  a38ac5:	5b                   	pop    rbx
  a38ae5:	75 09                	jne    a38af0 <_ZNSt6__ndk16locale7classicEv@@Base+0xc60>
  a38ae7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a38aea:	48 89 df             	mov    rdi,rbx
  a38aed:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a38af0:	4c 89 f7             	mov    rdi,r14
  a38af3:	e8 d8 71 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a38af8:	cc                   	int3
  a38af9:	cc                   	int3
  a38bae:	48 85 c0             	test   rax,rax
  a38bb1:	75 06                	jne    a38bb9 <_ZNSt6__ndk16locale7classicEv@@Base+0xd29>
  a38bb3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a38bb6:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a38bb9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  a38bbc:	4a 89 5c e0 f8       	mov    QWORD PTR [rax+r12*8-0x8],rbx
  a38bc1:	48 83 c4 18          	add    rsp,0x18
  a38bc5:	5b                   	pop    rbx
  a38be5:	75 09                	jne    a38bf0 <_ZNSt6__ndk16locale7classicEv@@Base+0xd60>
  a38be7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  a38bea:	48 89 df             	mov    rdi,rbx
  a38bed:	ff 50 10             	call   QWORD PTR [rax+0x10]
... truncated 32926 more
```
