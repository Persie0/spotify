# Service184 candidate constructors via relocation provenance

Hard requirement: service184 +0x28 return is passed unchanged to the dispatcher and later used as a polymorphic object: vptr=[dep], then call [vptr+0x68].

## Candidate AP 0x18228d8
- +0x28 = 0xd17212; kind=embedded; returned-offset=0x218
- direct AP refs: 0
- relocation slots -> AP: 0

### Direct AP references
### Relocation indirections
### Vtable group neighborhood
- 0x1822878: reloc 0xd16936 FDE=(13723958, 13724004)
- 0x1822880: reloc 0xd16964 FDE=(13724004, 13724025)
- 0x1822888: reloc 0xd1697a FDE=(13724026, 13724072)
- 0x1822890: reloc 0xd169a8 FDE=(13724072, 13724093)
- 0x1822898: reloc 0xd169be FDE=(13724094, 13724119)
- 0x18228a0: reloc 0xd169d8 FDE=(13724120, 13724132)
- 0x18228a8: reloc 0xd169e4 FDE=(13724132, 13724469)
- 0x18228b0: reloc 0xd16b36 FDE=(13724470, 13724481)
- 0x18228b8: reloc 0xd16b42 FDE=(13724482, 13724680)
- 0x18228c0: reloc 0xd16c08 FDE=(13724680, 13725207)
- 0x18228c8: reloc 0xd16e18 FDE=(13725208, 13725575)
- 0x18228d0: reloc 0xd16f88 FDE=(13725576, 13725581)
- 0x18228d8: reloc 0xd16f8e FDE=(13725582, 13725690)
- 0x18228e0: reloc 0xd16ffa FDE=(13725690, 13725798)
- 0x18228e8: reloc 0xd17066 FDE=(13725798, 13725906)
- 0x18228f0: reloc 0xd170d2 FDE=(13725906, 13725963)
- 0x18228f8: reloc 0xd1710c FDE=(13725964, 13726226)
- 0x1822900: reloc 0xd17212 FDE=(13726226, 13726234)
- 0x1822908: reloc 0xd1721a FDE=(13726234, 13726305)
- 0x1822910: reloc 0xd17262 FDE=(13726306, 13726538)
- 0x1822918: reloc 0xd1734a FDE=(13726538, 13726914)
- 0x1822920: reloc 0xd174c2 FDE=(13726914, 13728354)
- 0x1822928: reloc 0xd17a62 FDE=(13728354, 13728679)
- 0x1822930: reloc 0xd17ba8 FDE=(13728680, 13728929)
- 0x1822938: reloc 0xd17ca2 FDE=(13728930, 13729091)
- 0x1822940: reloc 0xcc23d0 FDE=(13378512, 13378620)
- 0x1822948: reloc 0xd17d44 FDE=(13729092, 13729200)
- 0x1822950: reloc 0xd17db0 FDE=(13729200, 13729308)
- 0x1822958: reloc 0xd17e1c FDE=(13729308, 13729766)
- 0x1822960: reloc 0xd17fe6 FDE=(13729766, 13730106)
- 0x1822968: reloc 0xd1813a FDE=(13730106, 13730882)
- 0x1822970: reloc 0xd18442 FDE=(13730882, 13730995)
- 0x1822978: reloc 0xd184b4 FDE=(13730996, 13731858)
- 0x1822980: reloc 0xd15094 FDE=(13717652, 13720368)
- 0x1822988: reloc 0xd18812 FDE=(13731858, 13738390)
- 0x1822990: reloc 0xd1a196 FDE=(13738390, 13738411)
- 0x1822998: reloc 0xd1a1ac FDE=(13738412, 13738433)
- 0x18229a0: reloc 0xd1a1c2 FDE=(13738434, 13738677)
- 0x18229a8: reloc 0xd1a2b6 FDE=(13738678, 13739072)
- 0x18229b0: reloc 0xd1a440 FDE=(13739072, 13739108)

### +0x28 body FDE=(13726226, 13726234)
      d17212:	48 8d 87 18 02 00 00 	lea    rax,[rdi+0x218]
      d17219:	c3                   	ret

### Candidate-specific materializer FDEs: 0
### Exact dependency offset +0x218 inside candidate materializers
- no exact-offset hits in candidate-specific materializer FDEs

### Nearby vptr-looking constants at dependency-offset hits
- none

## Candidate AP 0x1821448
- +0x28 = 0xb7d2ca; kind=delegated; returned-offset=None
- direct AP refs: 0
- relocation slots -> AP: 0

### Direct AP references
### Relocation indirections
### Vtable group neighborhood
- 0x18213e8: reloc 0xcf8946 FDE=(13601094, 13601126)
- 0x18213f0: reloc 0xcf8966 FDE=(13601126, 13601144)
- 0x18213f8: reloc 0xd065b4 FDE=(13657524, 13658900)
- 0x1821400: reloc 0xaa8e00 FDE=(11177472, 11177626)
- 0x1821408: reloc 0x1066dbe FDE=(17198526, 17198537)
- 0x1821410: reloc 0xcf8978 FDE=(13601144, 13601774)
- 0x1821418: reloc 0xcf8bee FDE=(13601774, 13601968)
- 0x1821420: reloc 0xcf8cb0 FDE=(13601968, 13602167)
- 0x1821428: reloc 0xcf8d78 FDE=(13602168, 13602353)
- 0x1821430: raw 0x0
- 0x1821438: raw 0x0
- 0x1821440: reloc 0xcf9320 FDE=(13603616, 13603721)
- 0x1821448: reloc 0xcf938a FDE=(13603722, 13603740)
- 0x1821450: reloc 0xcf939c FDE=(13603740, 13604278)
- 0x1821458: reloc 0xcf95b6 FDE=(13604278, 13604286)
- 0x1821460: reloc 0xbd7a10 FDE=(12417552, 12417566)
- 0x1821468: reloc 0xcf95be FDE=(13604286, 13608751)
- 0x1821470: reloc 0xb7d2ca FDE=(12047050, 12047060)
- 0x1821478: reloc 0xbd7f6a FDE=(12418922, 12418932)
- 0x1821480: reloc 0xcfa730 FDE=(13608752, 13608949)
- 0x1821488: reloc 0xbd7fd2 FDE=(12419026, 12419036)
- 0x1821490: reloc 0xbd7fdc FDE=(12419036, 12419049)
- 0x1821498: reloc 0xbd7fea FDE=(12419050, 12419063)
- 0x18214a0: reloc 0xbd7ff8 FDE=(12419064, 12419083)
- 0x18214a8: reloc 0xbd800c FDE=(12419084, 12419094)
- 0x18214b0: reloc 0x123a2d8 FDE=(19112664, 19112674)
- 0x18214b8: reloc 0xbd8086 FDE=(12419206, 12419216)
- 0x18214c0: reloc 0x13a6e50 FDE=(20606544, 20606560)
- 0x18214c8: reloc 0xab5b36 FDE=(11230006, 11230022)
- 0x18214d0: reloc 0xab5b46 FDE=(11230022, 11230038)
- 0x18214d8: reloc 0xbd80cc FDE=(12419276, 12419292)
- 0x18214e0: reloc 0xbd80dc FDE=(12419292, 12419305)
- 0x18214e8: reloc 0xcfa7f6 FDE=(13608950, 13608981)
- 0x18214f0: reloc 0xbd8104 FDE=(12419332, 12419345)
- 0x18214f8: reloc 0xbd8112 FDE=(12419346, 12419359)
- 0x1821500: reloc 0xbd8120 FDE=(12419360, 12419382)
- 0x1821508: reloc 0x9d81d0 FDE=(10322384, 10322387)
- 0x1821510: reloc 0x9d81d0 FDE=(10322384, 10322387)
- 0x1821518: reloc 0xa5bbf0 FDE=(10861552, 10861557)
- 0x1821520: reloc 0xbd8136 FDE=(12419382, 12419404)

### +0x28 body FDE=(12047050, 12047060)
      b7d2ca:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b7d2ce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b7d2d1:	ff 60 30             	jmp    QWORD PTR [rax+0x30]

### Candidate-specific materializer FDEs: 0

## Candidate AP 0x1822988
- +0x28 = 0xd1a440; kind=conditional; returned-offset=None
- direct AP refs: 0
- relocation slots -> AP: 0

### Direct AP references
### Relocation indirections
### Vtable group neighborhood
- 0x1822928: reloc 0xd17a62 FDE=(13728354, 13728679)
- 0x1822930: reloc 0xd17ba8 FDE=(13728680, 13728929)
- 0x1822938: reloc 0xd17ca2 FDE=(13728930, 13729091)
- 0x1822940: reloc 0xcc23d0 FDE=(13378512, 13378620)
- 0x1822948: reloc 0xd17d44 FDE=(13729092, 13729200)
- 0x1822950: reloc 0xd17db0 FDE=(13729200, 13729308)
- 0x1822958: reloc 0xd17e1c FDE=(13729308, 13729766)
- 0x1822960: reloc 0xd17fe6 FDE=(13729766, 13730106)
- 0x1822968: reloc 0xd1813a FDE=(13730106, 13730882)
- 0x1822970: reloc 0xd18442 FDE=(13730882, 13730995)
- 0x1822978: reloc 0xd184b4 FDE=(13730996, 13731858)
- 0x1822980: reloc 0xd15094 FDE=(13717652, 13720368)
- 0x1822988: reloc 0xd18812 FDE=(13731858, 13738390)
- 0x1822990: reloc 0xd1a196 FDE=(13738390, 13738411)
- 0x1822998: reloc 0xd1a1ac FDE=(13738412, 13738433)
- 0x18229a0: reloc 0xd1a1c2 FDE=(13738434, 13738677)
- 0x18229a8: reloc 0xd1a2b6 FDE=(13738678, 13739072)
- 0x18229b0: reloc 0xd1a440 FDE=(13739072, 13739108)
- 0x18229b8: reloc 0xaf6576 FDE=(11494774, 11494779)
- 0x18229c0: reloc 0xd1a464 FDE=(13739108, 13741320)
- 0x18229c8: reloc 0xd1ad08 FDE=(13741320, 13741342)
- 0x18229d0: reloc 0xd1ad1e FDE=(13741342, 13743096)
- 0x18229d8: reloc 0xd1b3f8 FDE=(13743096, 13743334)
- 0x18229e0: reloc 0xd1b4e6 FDE=(13743334, 13743493)
- 0x18229e8: reloc 0xd1b586 FDE=(13743494, 13743689)
- 0x18229f0: reloc 0xd1b64a FDE=(13743690, 13743867)
- 0x18229f8: reloc 0xd1b6fc FDE=(13743868, 13744048)
- 0x1822a00: reloc 0xb00674 FDE=(11535988, 11535993)
- 0x1822a08: reloc 0xd1b7b0 FDE=(13744048, 13744056)
- 0x1822a10: reloc 0xd1b7b8 FDE=(13744056, 13744064)
- 0x1822a18: reloc 0xc44ec4 FDE=(12865220, 12865228)
- 0x1822a20: reloc 0xd1b7c0 FDE=(13744064, 13744072)
- 0x1822a28: reloc 0xd1b7c8 FDE=(13744072, 13744202)
- 0x1822a30: raw 0xfffffffffffffff8
- 0x1822a38: raw 0x0
- 0x1822a40: reloc 0xd1b84a FDE=(13744202, 13744211)
- 0x1822a48: reloc 0xd1b854 FDE=(13744212, 13744221)
- 0x1822a50: reloc 0xd1b85e FDE=(13744222, 13744231)
- 0x1822a58: reloc 0xd1b868 FDE=(13744232, 13744250)
- 0x1822a60: reloc 0xd1b87a FDE=(13744250, 13744259)

### +0x28 body FDE=(13739072, 13739108)
      d1a440:	48 8b 87 08 04 00 00 	mov    rax,QWORD PTR [rdi+0x408]
      d1a447:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
      d1a44b:	48 85 ff             	test   rdi,rdi
      d1a44e:	74 13                	je     d1a463 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267403>
      d1a450:	80 bf 98 00 00 00 00 	cmp    BYTE PTR [rdi+0x98],0x0
      d1a457:	74 0a                	je     d1a463 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267403>
      d1a459:	80 7f 15 00          	cmp    BYTE PTR [rdi+0x15],0x0
      d1a45d:	0f 85 91 a5 00 00    	jne    d249f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271994>
      d1a463:	c3                   	ret

### Candidate-specific materializer FDEs: 0

## Candidate AP 0x181f788
- +0x28 = 0xcc4eea; kind=field; returned-offset=0x5e0
- direct AP refs: 0
- relocation slots -> AP: 0

### Direct AP references
### Relocation indirections
### Vtable group neighborhood
- 0x181f728: reloc 0xcc243c FDE=(13378620, 13378753)
- 0x181f730: reloc 0xcc24c2 FDE=(13378754, 13378966)
- 0x181f738: reloc 0xcc2596 FDE=(13378966, 13378971)
- 0x181f740: reloc 0xcc259c FDE=(13378972, 13380443)
- 0x181f748: reloc 0xcc2b5c FDE=(13380444, 13380596)
- 0x181f750: reloc 0xcc2bf4 FDE=(13380596, 13383094)
- 0x181f758: reloc 0xcc35b6 FDE=(13383094, 13384674)
- 0x181f760: reloc 0xcc3be2 FDE=(13384674, 13387367)
- 0x181f768: reloc 0xcc4668 FDE=(13387368, 13388448)
- 0x181f770: reloc 0xcc4aa0 FDE=(13388448, 13388501)
- 0x181f778: reloc 0xcc4ad6 FDE=(13388502, 13388539)
- 0x181f780: reloc 0xcc4afc FDE=(13388540, 13388666)
- 0x181f788: reloc 0xcc4b7a FDE=(13388666, 13388809)
- 0x181f790: reloc 0xcc4c0a FDE=(13388810, 13388818)
- 0x181f798: reloc 0xcc4c12 FDE=(13388818, 13389388)
- 0x181f7a0: reloc 0xcc4e4c FDE=(13389388, 13389497)
- 0x181f7a8: reloc 0xcc4eba FDE=(13389498, 13389546)
- 0x181f7b0: reloc 0xcc4eea FDE=(13389546, 13389554)
- 0x181f7b8: reloc 0xcc4eea FDE=(13389546, 13389554)
- 0x181f7c0: reloc 0xcc4ef2 FDE=(13389554, 13389787)
- 0x181f7c8: reloc 0xcc4fdc FDE=(13389788, 13390625)
- 0x181f7d0: reloc 0xcc5322 FDE=(13390626, 13391260)
- 0x181f7d8: reloc 0xcc559c FDE=(13391260, 13391392)
- 0x181f7e0: reloc 0xcc5620 FDE=(13391392, 13391512)
- 0x181f7e8: reloc 0xcc5698 FDE=(13391512, 13391537)
- 0x181f7f0: reloc 0xcc56b2 FDE=(13391538, 13391567)
- 0x181f7f8: reloc 0xcc56d0 FDE=(13391568, 13391597)
- 0x181f800: reloc 0xcc56ee FDE=(13391598, 13391906)
- 0x181f808: reloc 0xcc5822 FDE=(13391906, 13391918)
- 0x181f810: raw 0x0
- 0x181f818: raw 0x0
- 0x181f820: reloc 0x9d7de0 FDE=(10321376, 10321377)
- 0x181f828: reloc 0xa50370 FDE=(10814320, 10814325)
- 0x181f830: reloc 0xcc9472 FDE=(13407346, 13407378)
- 0x181f838: reloc 0xcc9492 FDE=(13407378, 13407397)
- 0x181f840: reloc 0x9d7de0 FDE=(10321376, 10321377)
- 0x181f848: reloc 0xa50370 FDE=(10814320, 10814325)
- 0x181f850: reloc 0xcc94a6 FDE=(13407398, 13407417)
- 0x181f858: raw 0x0
- 0x181f860: raw 0x0

### +0x28 body FDE=(13389546, 13389554)
      cc4eea:	48 8b 87 e0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5e0]
      cc4ef1:	c3                   	ret

### Candidate-specific materializer FDEs: 0
### Exact dependency offset +0x5e0 inside candidate materializers
- no exact-offset hits in candidate-specific materializer FDEs

### Nearby vptr-looking constants at dependency-offset hits
- none

## Relocations containing candidate APs as neighboring vtable-group entries
