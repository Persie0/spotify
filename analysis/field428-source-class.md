# owner+0x428 source-class resolver

Goal: identify the virtual class/interface owning the two source builders that feed source+0x178 into the owner+0x428 construction, then compare it with TimelineAds owner+0x50 object APs.

Known TimelineAds owner+0x50 APs: 0x18674c8, 0x1867550, 0x1867980

## Relocation slots targeting 0xece084
- slots: 0x1834758
### slot 0x1834758
- 0x1834718: 0x0 FDE=None
- 0x1834720: 0x0 FDE=None
- 0x1834728: 0xecdf82 FDE=(15523714, 15523733)
- 0x1834730: 0xecdf96 FDE=(15523734, 15523752)
- 0x1834738: 0xecdfa8 FDE=(15523752, 15523914)
- 0x1834740: 0xece04a FDE=(15523914, 15523940)
- 0x1834748: 0xece064 FDE=(15523940, 15523949)
- 0x1834750: 0xece06e FDE=(15523950, 15523972)
- 0x1834758: 0xece084 FDE=(15523972, 15525243)
- 0x1834760: 0x0 FDE=None
- 0x1834768: 0x0 FDE=None
- 0x1834770: 0xee7d3e FDE=(15629630, 15629645)
- 0x1834778: 0xee7d4e FDE=(15629646, 15629664)
- 0x1834780: 0xee7d60 FDE=(15629664, 15629673)
- 0x1834788: 0x0 FDE=None
- 0x1834790: 0xa50370 FDE=(10814320, 10814325)
- 0x1834798: 0x0 FDE=None
- 0x18347a0: 0x0 FDE=None
- 0x18347a8: 0xee724e FDE=(15626830, 15626849)
- 0x18347b0: 0xee7262 FDE=(15626850, 15626868)
- 0x18347b8: 0xee7274 FDE=(15626868, 15626920)
- 0x18347c0: 0xee72a8 FDE=(15626920, 15626946)
- 0x18347c8: 0xaf2b9c FDE=(11479964, 11479973)
- 0x18347d0: 0xaf2ba6 FDE=(11479974, 11479996)
- 0x18347d8: 0xee72c2 FDE=(15626946, 15628462)

#### candidate address points
- AP 0x1834728, target slot +0x30, codeDensity=36, codeMaterializations=4, header[-0x10]=0, header[-0x8]=0x0
- AP 0x18346d0, target slot +0x88, codeDensity=36, codeMaterializations=2, header[-0x10]=0, header[-0x8]=0x0
- AP 0x1834698, target slot +0xc0, codeDensity=35, codeMaterializations=2, header[-0x10]=0, header[-0x8]=0x0
- AP 0x1834730, target slot +0x28, codeDensity=35, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0xecdf82
- AP 0x18346d8, target slot +0x80, codeDensity=35, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0xed0754
- AP 0x18346a0, target slot +0xb8, codeDensity=35, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0xed081c
- AP 0x1834660, target slot +0xf8, codeDensity=34, codeMaterializations=2, header[-0x10]=0, header[-0x8]=0x0
- AP 0x18346f8, target slot +0x60, codeDensity=34, codeMaterializations=1, header[-0x10]=0, header[-0x8]=0xa50370
- AP 0x18346c0, target slot +0x98, codeDensity=34, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0xa50370
- AP 0x1834688, target slot +0xd0, codeDensity=33, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0xa50370
- AP 0x1834668, target slot +0xf0, codeDensity=33, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0xed08e4
- AP 0x1834650, target slot +0x108, codeDensity=32, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0xa50370

## Relocation slots targeting 0xee6db8
- slots: 0x1834448
### slot 0x1834448
- 0x1834408: 0x0 FDE=None
- 0x1834410: 0x0 FDE=None
- 0x1834418: 0xee6cd6 FDE=(15625430, 15625449)
- 0x1834420: 0xee6cea FDE=(15625450, 15625468)
- 0x1834428: 0xee6cfc FDE=(15625468, 15625630)
- 0x1834430: 0xee6d9e FDE=(15625630, 15625656)
- 0x1834438: 0xece064 FDE=(15523940, 15523949)
- 0x1834440: 0xece06e FDE=(15523950, 15523972)
- 0x1834448: 0xee6db8 FDE=(15625656, 15626175)
- 0x1834450: 0x0 FDE=None
- 0x1834458: 0x0 FDE=None
- 0x1834460: 0xee6b2a FDE=(15625002, 15625017)
- 0x1834468: 0xee6b3a FDE=(15625018, 15625036)
- 0x1834470: 0xee6b4c FDE=(15625036, 15625045)
- 0x1834478: 0x0 FDE=None
- 0x1834480: 0xa50370 FDE=(10814320, 10814325)
- 0x1834488: 0x0 FDE=None
- 0x1834490: 0x0 FDE=None
- 0x1834498: 0xecfc7e FDE=(15531134, 15531543)
- 0x18344a0: 0xed0a5e FDE=(15534686, 15534704)
- 0x18344a8: 0xaf6576 FDE=(11494774, 11494779)
- 0x18344b0: 0xec70f2 FDE=(15495410, 15495444)
- 0x18344b8: 0x9d81d0 FDE=(10322384, 10322387)
- 0x18344c0: 0x9d7de0 FDE=(10321376, 10321377)
- 0x18344c8: 0x9d7de0 FDE=(10321376, 10321377)

#### candidate address points
- AP 0x1834418, target slot +0x30, codeDensity=43, codeMaterializations=4, header[-0x10]=0, header[-0x8]=0x0
- AP 0x1834420, target slot +0x28, codeDensity=43, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0xee6cd6
- AP 0x18343b0, target slot +0x98, codeDensity=30, codeMaterializations=1, header[-0x10]=0, header[-0x8]=0xa50370
- AP 0x1834388, target slot +0xc0, codeDensity=29, codeMaterializations=2, header[-0x10]=0, header[-0x8]=0x0
- AP 0x1834390, target slot +0xb8, codeDensity=29, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0xecddba
- AP 0x1834340, target slot +0x108, codeDensity=27, codeMaterializations=4, header[-0x10]=0, header[-0x8]=0x0
- AP 0x1834348, target slot +0x100, codeDensity=27, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0xecc958
- AP 0x1834300, target slot +0x148, codeDensity=21, codeMaterializations=3, header[-0x10]=0, header[-0x8]=0x1833790
- AP 0x18342f8, target slot +0x150, codeDensity=21, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0x0
- AP 0x18342f0, target slot +0x158, codeDensity=20, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0x0
- AP 0x18342e8, target slot +0x160, codeDensity=19, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0x0
- AP 0x18342e0, target slot +0x168, codeDensity=18, codeMaterializations=0, header[-0x10]=0, header[-0x8]=0x0

## Known TimelineAds AP slices
### AP 0x18674c8
- +0x0: 0x1355040 FDE=(20271168, 20271257)
- +0x8: 0x135509a FDE=(20271258, 20271276)
- +0x10: 0x13550ac FDE=(20271276, 20271618)
- +0x18: 0x1355202 FDE=(20271618, 20271734)
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0x1355276 FDE=(20271734, 20272071)
- +0x30: 0x13553c8 FDE=(20272072, 20272077)
- +0x38: 0x13553c8 FDE=(20272072, 20272077)
- +0x40: 0x13553ce FDE=(20272078, 20272477)
- +0x48: 0x135555e FDE=(20272478, 20272622)
- +0x50: 0x13555ee FDE=(20272622, 20273124)
- +0x58: 0x13557e4 FDE=(20273124, 20274451)
- +0x60: 0x1355d14 FDE=(20274452, 20274765)
- +0x68: 0x1355e4e FDE=(20274766, 20275184)
- +0x70: 0x1355ff0 FDE=(20275184, 20275564)
- +0x78: 0xfffffffffffffff8 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0x135616c FDE=(20275564, 20275573)
- +0x90: 0x1356176 FDE=(20275574, 20275583)
- +0x98: 0x1356180 FDE=(20275584, 20275593)
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0x135618a FDE=(20275594, 20275603)
- +0xb0: 0x1356194 FDE=(20275604, 20275613)
- +0xb8: 0x135619e FDE=(20275614, 20275623)
- +0xc0: 0x13561a8 FDE=(20275624, 20275633)
- +0xc8: 0x13561b2 FDE=(20275634, 20275643)
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0x13561bc FDE=(20275644, 20275653)
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xf0: 0x13561c6 FDE=(20275654, 20275663)
- +0xf8: 0x9d7de0 FDE=(10321376, 10321377)
- +0x100: 0x13561d0 FDE=(20275664, 20275673)
- +0x108: 0x13561da FDE=(20275674, 20275683)
- +0x110: 0x13561da FDE=(20275674, 20275683)
- +0x118: 0x1356770 FDE=(20277104, 20277115)
- +0x120: 0x135677c FDE=(20277116, 20277127)
- +0x128: 0x1356788 FDE=(20277128, 20277139)
- +0x130: 0x1356794 FDE=(20277140, 20277151)
- +0x138: 0x13567a0 FDE=(20277152, 20277163)
- +0x140: 0x9d7de0 FDE=(10321376, 10321377)
- +0x148: 0x13566c8 FDE=(20276936, 20276945)
- +0x150: 0x9d7de0 FDE=(10321376, 10321377)
- +0x158: 0x9d7de0 FDE=(10321376, 10321377)
- +0x160: 0x9d7de0 FDE=(10321376, 10321377)
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0x13579ce FDE=(20281806, 20281991)
- +0x178: 0x1357a88 FDE=(20281992, 20282324)
- +0x180: 0x1357bd4 FDE=(20282324, 20282443)
- target 0xece084 occurs at: none
- target 0xee6db8 occurs at: none

### AP 0x1867550
- +0x0: 0x135616c FDE=(20275564, 20275573)
- +0x8: 0x1356176 FDE=(20275574, 20275583)
- +0x10: 0x1356180 FDE=(20275584, 20275593)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x135618a FDE=(20275594, 20275603)
- +0x28: 0x1356194 FDE=(20275604, 20275613)
- +0x30: 0x135619e FDE=(20275614, 20275623)
- +0x38: 0x13561a8 FDE=(20275624, 20275633)
- +0x40: 0x13561b2 FDE=(20275634, 20275643)
- +0x48: 0x9d7de0 FDE=(10321376, 10321377)
- +0x50: 0x13561bc FDE=(20275644, 20275653)
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0x13561c6 FDE=(20275654, 20275663)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0x13561d0 FDE=(20275664, 20275673)
- +0x80: 0x13561da FDE=(20275674, 20275683)
- +0x88: 0x13561da FDE=(20275674, 20275683)
- +0x90: 0x1356770 FDE=(20277104, 20277115)
- +0x98: 0x135677c FDE=(20277116, 20277127)
- +0xa0: 0x1356788 FDE=(20277128, 20277139)
- +0xa8: 0x1356794 FDE=(20277140, 20277151)
- +0xb0: 0x13567a0 FDE=(20277152, 20277163)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0x13566c8 FDE=(20276936, 20276945)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xe8: 0x13579ce FDE=(20281806, 20281991)
- +0xf0: 0x1357a88 FDE=(20281992, 20282324)
- +0xf8: 0x1357bd4 FDE=(20282324, 20282443)
- +0x100: 0x1357c4c FDE=(20282444, 20282672)
- +0x108: 0x1357d30 FDE=(20282672, 20282863)
- +0x110: 0x13580a8 FDE=(20283560, 20283588)
- +0x118: 0x13580c4 FDE=(20283588, 20283616)
- +0x120: 0x13577b2 FDE=(20281266, 20281315)
- +0x128: 0x13577e4 FDE=(20281316, 20281391)
- +0x130: 0x1357830 FDE=(20281392, 20281444)
- +0x138: 0x1357864 FDE=(20281444, 20281499)
- +0x140: 0x135789c FDE=(20281500, 20281555)
- +0x148: 0x13578d4 FDE=(20281556, 20281583)
- +0x150: 0xf5c6ba FDE=(16107194, 16107199)
- +0x158: 0x13575ca FDE=(20280778, 20280864)
- +0x160: 0xf5c6ba FDE=(16107194, 16107199)
- +0x168: 0xf5c83a FDE=(16107578, 16107585)
- +0x170: 0xf5c83a FDE=(16107578, 16107585)
- +0x178: 0x9d7de0 FDE=(10321376, 10321377)
- +0x180: 0x1357620 FDE=(20280864, 20280875)
- target 0xece084 occurs at: none
- target 0xee6db8 occurs at: none

### AP 0x1867980
- +0x0: 0x1359f1a FDE=(20291354, 20291473)
- +0x8: 0x1359f92 FDE=(20291474, 20291492)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0x9d7de0 FDE=(10321376, 10321377)
- +0x30: 0x1359fa4 FDE=(20291492, 20291865)
- +0x38: 0x135a11a FDE=(20291866, 20291871)
- +0x40: 0x135a120 FDE=(20291872, 20291981)
- +0x48: 0x9d7de0 FDE=(10321376, 10321377)
- +0x50: 0x135a18e FDE=(20291982, 20292000)
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0x135a49a FDE=(20292762, 20292778)
- +0x98: 0xa3fa60 FDE=(10746464, 10746467)
- +0xa0: 0xa3fa60 FDE=(10746464, 10746467)
- +0xa8: 0xa3fa60 FDE=(10746464, 10746467)
- +0xb0: 0xa3fa60 FDE=(10746464, 10746467)
- +0xb8: 0xa3fa60 FDE=(10746464, 10746467)
- +0xc0: 0x135a49a FDE=(20292762, 20292778)
- +0xc8: 0xa3fa60 FDE=(10746464, 10746467)
- +0xd0: 0xa3fa60 FDE=(10746464, 10746467)
- +0xd8: 0xa3fa60 FDE=(10746464, 10746467)
- +0xe0: 0xa3fa60 FDE=(10746464, 10746467)
- +0xe8: 0xa3fa60 FDE=(10746464, 10746467)
- +0xf0: 0xa3fa60 FDE=(10746464, 10746467)
- +0xf8: 0xa3fa60 FDE=(10746464, 10746467)
- +0x100: 0xa3fa60 FDE=(10746464, 10746467)
- +0x108: 0xa3fa60 FDE=(10746464, 10746467)
- +0x110: 0xa3fa60 FDE=(10746464, 10746467)
- +0x118: 0xa3fa60 FDE=(10746464, 10746467)
- +0x120: 0x135a4aa FDE=(20292778, 20292789)
- +0x128: 0x135a4aa FDE=(20292778, 20292789)
- +0x130: 0xa3fa60 FDE=(10746464, 10746467)
- +0x138: 0xa3fa60 FDE=(10746464, 10746467)
- +0x140: 0xa3fa60 FDE=(10746464, 10746467)
- +0x148: 0x135a4aa FDE=(20292778, 20292789)
- +0x150: 0x135a4aa FDE=(20292778, 20292789)
- +0x158: 0x0 FDE=None
- +0x160: 0x0 FDE=None
- +0x168: 0x9d7de0 FDE=(10321376, 10321377)
- +0x170: 0xa50370 FDE=(10814320, 10814325)
- +0x178: 0x135a730 FDE=(20293424, 20293427)
- +0x180: 0x135a734 FDE=(20293428, 20293439)
- target 0xece084 occurs at: none
- target 0xee6db8 occurs at: none

## AP materialization sites
### AP 0x1834300: 3 refs
#### ref 0xe97415; FDE=(15281964, 15306555)
      e973e8:	48 8d 05 f1 cd 99 00 	lea    rax,[rip+0x99cdf1]        # 18341e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6178>
      e973ef:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e973f3:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e973f7:	48 8b 80 d8 fe ff ff 	mov    rax,QWORD PTR [rax-0x128]
      e973fe:	48 01 e8             	add    rax,rbp
      e97401:	48 8d 94 24 50 10 00 	lea    rdx,[rsp+0x1050]
      e97408:	00 
      e97409:	48 89 02             	mov    QWORD PTR [rdx],rax
      e9740c:	4c 89 7a 08          	mov    QWORD PTR [rdx+0x8],r15
      e97410:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e97415:	48 8d 35 e4 ce 99 00 	lea    rsi,[rip+0x99cee4]        # 1834300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6298>
      e9741c:	4c 89 ef             	mov    rdi,r13
      e9741f:	e8 5a 24 03 00       	call   ec987e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90c94>
      e97424:	4c 89 ff             	mov    rdi,r15
      e97427:	e8 5a 70 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9742c:	48 8d 05 5d c3 99 00 	lea    rax,[rip+0x99c35d]        # 1833790 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5728>
      e97433:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e97437:	48 8d 05 a2 c5 99 00 	lea    rax,[rip+0x99c5a2]        # 18339e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5978>
      e9743e:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
      e97442:	49 89 6e 38          	mov    QWORD PTR [r14+0x38],rbp
      e97446:	4d 89 7e 40          	mov    QWORD PTR [r14+0x40],r15
      e9744a:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9744f:	49 8d 7e 48          	lea    rdi,[r14+0x48]
      e97453:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      e97458:	e8 cd 36 7d 00       	call   166ab2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ec96>
      e9745d:	49 8d be 38 0f 00 00 	lea    rdi,[r14+0xf38]
      e97464:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
      e9746b:	00 
      e9746c:	e8 cd dc f6 ff       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>

#### ref 0xe98461; FDE=(15281964, 15306555)
      e98434:	e8 af 23 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98439:	4c 89 e7             	mov    rdi,r12
      e9843c:	e8 93 17 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98441:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
      e98448:	00 
      e98449:	e8 18 1a 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e9844e:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      e98453:	e8 d0 2b 7d 00       	call   166b028 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f194>
      e98458:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      e9845c:	e8 25 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98461:	48 8d 35 98 be 99 00 	lea    rsi,[rip+0x99be98]        # 1834300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6298>
      e98468:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e9846d:	e8 c4 a3 00 00       	call   ea2836 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69c4c>
      e98472:	4c 89 ff             	mov    rdi,r15
      e98475:	e8 0c 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9847a:	4c 89 f7             	mov    rdi,r14
      e9847d:	e8 8e 5b 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98482:	4c 89 f7             	mov    rdi,r14
      e98485:	e8 92 5f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9848a:	eb 59                	jmp    e984e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8fb>
      e9848c:	eb 52                	jmp    e984e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8f6>
      e9848e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98493:	4c 89 ff             	mov    rdi,r15
      e98496:	e8 cf 1a be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9849b:	eb 05                	jmp    e984a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8b8>
      e9849d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e984a2:	4c 89 f7             	mov    rdi,r14
      e984a5:	48 83 c7 38          	add    rdi,0x38
      e984a9:	e8 2c 0d 00 00       	call   e991da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x605f0>

#### ref 0xea28ae; FDE=(15345792, 15345854)
      ea2880:	53                   	push   rbx
      ea2881:	48 89 fb             	mov    rbx,rdi
      ea2884:	48 81 c7 78 0f 00 00 	add    rdi,0xf78
      ea288b:	e8 44 73 93 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      ea2890:	48 8d bb 20 0f 00 00 	lea    rdi,[rbx+0xf20]
      ea2897:	e8 ca 75 93 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ea289c:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      ea28a0:	e8 83 87 7c 00       	call   166b028 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f194>
      ea28a5:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      ea28a9:	e8 d8 bb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea28ae:	48 8d 35 4b 1a 99 00 	lea    rsi,[rip+0x991a4b]        # 1834300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6298>
      ea28b5:	48 89 df             	mov    rdi,rbx
      ea28b8:	5b                   	pop    rbx
      ea28b9:	e9 78 ff ff ff       	jmp    ea2836 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69c4c>
      ea28be:	48 8d 05 bb f4 98 00 	lea    rax,[rip+0x98f4bb]        # 1831d80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d18>
      ea28c5:	48 89 07             	mov    QWORD PTR [rdi],rax
      ea28c8:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      ea28cc:	e9 e1 bb bf ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      ea28d1:	cc                   	int3
      ea28d2:	53                   	push   rbx
      ea28d3:	48 89 fb             	mov    rbx,rdi
      ea28d6:	e8 e3 ff ff ff       	call   ea28be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69cd4>
      ea28db:	48 89 df             	mov    rdi,rbx
      ea28de:	5b                   	pop    rbx
      ea28df:	e9 3c b6 94 00       	jmp    17edf20 <_ZdlPv@plt>
      ea28e4:	53                   	push   rbx
      ea28e5:	48 89 fb             	mov    rbx,rdi
      ea28e8:	6a 18                	push   0x18
      ea28ea:	5f                   	pop    rdi

### AP 0x1834340: 4 refs
#### ref 0xecc352; FDE=(15516383, 15516648)
      ecc32c:	eb 08                	jmp    ecc336 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9374c>
      ecc32e:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      ecc333:	4d 89 fc             	mov    r12,r15
      ecc336:	48 89 54 24 20       	mov    QWORD PTR [rsp+0x20],rdx
      ecc33b:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
      ecc340:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
      ecc345:	6a 30                	push   0x30
      ecc347:	5f                   	pop    rdi
      ecc348:	e8 b3 1b 92 00       	call   17edf00 <_Znwm@plt>
      ecc34d:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
      ecc352:	48 8d 15 e7 7f 96 00 	lea    rdx,[rip+0x967fe7]        # 1834340 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x62d8>
      ecc359:	48 89 10             	mov    QWORD PTR [rax],rdx
      ecc35c:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      ecc360:	48 89 c2             	mov    rdx,rax
      ecc363:	48 83 c2 10          	add    rdx,0x10
      ecc367:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
      ecc36b:	48 8b 71 f8          	mov    rsi,QWORD PTR [rcx-0x8]
      ecc36f:	48 89 70 18          	mov    QWORD PTR [rax+0x18],rsi
      ecc373:	48 85 f6             	test   rsi,rsi
      ecc376:	74 15                	je     ecc38d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x937a3>
      ecc378:	49 89 56 10          	mov    QWORD PTR [r14+0x10],rdx
      ecc37c:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      ecc381:	0f 57 c0             	xorps  xmm0,xmm0
      ecc384:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
      ecc388:	45 31 f6             	xor    r14d,r14d
      ecc38b:	eb 04                	jmp    ecc391 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x937a7>
      ecc38d:	48 89 50 08          	mov    QWORD PTR [rax+0x8],rdx
      ecc391:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ecc394:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0

#### ref 0xecc958; FDE=(15518040, 15518059)
      ecc934:	80 bb 80 00 00 00 00 	cmp    BYTE PTR [rbx+0x80],0x0
      ecc93b:	74 0c                	je     ecc949 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93d5f>
      ecc93d:	48 83 c3 50          	add    rbx,0x50
      ecc941:	48 89 df             	mov    rdi,rbx
      ecc944:	e8 21 d6 ba ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ecc949:	4c 89 f7             	mov    rdi,r14
      ecc94c:	48 83 c4 08          	add    rsp,0x8
      ecc950:	5b                   	pop    rbx
      ecc951:	41 5e                	pop    r14
      ecc953:	e9 da 60 c2 ff       	jmp    af2a32 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f9d2>
      ecc958:	48 8d 05 e1 79 96 00 	lea    rax,[rip+0x9679e1]        # 1834340 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x62d8>
      ecc95f:	48 89 07             	mov    QWORD PTR [rdi],rax
      ecc962:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      ecc966:	e9 2b fe ff ff       	jmp    ecc796 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93bac>
      ecc96b:	cc                   	int3
      ecc96c:	53                   	push   rbx
      ecc96d:	48 89 fb             	mov    rbx,rdi
      ecc970:	e8 e3 ff ff ff       	call   ecc958 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93d6e>
      ecc975:	48 89 df             	mov    rdi,rbx
      ecc978:	5b                   	pop    rbx
      ecc979:	e9 a2 15 92 00       	jmp    17edf20 <_ZdlPv@plt>
      ecc97e:	41 56                	push   r14
      ecc980:	53                   	push   rbx
      ecc981:	48 83 ec 28          	sub    rsp,0x28
      ecc985:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ecc98c:	00 00 
      ecc98e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ecc993:	4c 8d 77 08          	lea    r14,[rdi+0x8]
      ecc997:	6a 30                	push   0x30

#### ref 0xecc9b9; FDE=(15518078, 15518238)
      ecc993:	4c 8d 77 08          	lea    r14,[rdi+0x8]
      ecc997:	6a 30                	push   0x30
      ecc999:	5f                   	pop    rdi
      ecc99a:	e8 61 15 92 00       	call   17edf00 <_Znwm@plt>
      ecc99f:	48 89 c3             	mov    rbx,rax
      ecc9a2:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ecc9a6:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      ecc9ab:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ecc9b0:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      ecc9b7:	00 00 
      ecc9b9:	48 8d 05 80 79 96 00 	lea    rax,[rip+0x967980]        # 1834340 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x62d8>
      ecc9c0:	48 89 03             	mov    QWORD PTR [rbx],rax
      ecc9c3:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      ecc9c7:	4c 89 f6             	mov    rsi,r14
      ecc9ca:	e8 e7 0b 00 00       	call   ecd5b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x949cc>
      ecc9cf:	48 89 e7             	mov    rdi,rsp
      ecc9d2:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ecc9d6:	e8 ef d8 ba ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ecc9db:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ecc9e2:	00 00 
      ecc9e4:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ecc9e9:	75 2e                	jne    ecca19 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93e2f>
      ecc9eb:	48 89 d8             	mov    rax,rbx
      ecc9ee:	48 83 c4 28          	add    rsp,0x28
      ecc9f2:	5b                   	pop    rbx
      ecc9f3:	41 5e                	pop    r14
      ecc9f5:	c3                   	ret
      ecc9f6:	48 89 c3             	mov    rbx,rax
      ecc9f9:	48 89 e7             	mov    rdi,rsp

#### ref 0xecca22; FDE=(15518238, 15518264)
      ecc9f9:	48 89 e7             	mov    rdi,rsp
      ecc9fc:	e8 c9 d8 ba ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ecca01:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ecca08:	00 00 
      ecca0a:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ecca0f:	75 08                	jne    ecca19 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93e2f>
      ecca11:	48 89 df             	mov    rdi,rbx
      ecca14:	e8 b7 32 ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ecca19:	e8 92 30 92 00       	call   17efab0 <__stack_chk_fail@plt>
      ecca1e:	48 8d 47 08          	lea    rax,[rdi+0x8]
      ecca22:	48 8d 0d 17 79 96 00 	lea    rcx,[rip+0x967917]        # 1834340 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x62d8>
      ecca29:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ecca2c:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
      ecca30:	48 89 c6             	mov    rsi,rax
      ecca33:	e9 7e 0b 00 00       	jmp    ecd5b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x949cc>
      ecca38:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      ecca3c:	e9 55 fd ff ff       	jmp    ecc796 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93bac>
      ecca41:	cc                   	int3
      ecca42:	53                   	push   rbx
      ecca43:	48 89 fb             	mov    rbx,rdi
      ecca46:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      ecca4a:	e8 47 fd ff ff       	call   ecc796 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93bac>
      ecca4f:	48 89 df             	mov    rdi,rbx
      ecca52:	5b                   	pop    rbx
      ecca53:	e9 c8 14 92 00       	jmp    17edf20 <_ZdlPv@plt>
      ecca58:	55                   	push   rbp
      ecca59:	41 57                	push   r15
      ecca5b:	41 56                	push   r14
      ecca5d:	41 55                	push   r13

### AP 0x1834388: 2 refs
#### ref 0xecd7a4; FDE=(15521638, 15523238)
      ecd77a:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      ecd77f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ecd786:	00 00 
      ecd788:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      ecd78f:	00 
      ecd790:	bf b8 01 00 00       	mov    edi,0x1b8
      ecd795:	e8 66 07 92 00       	call   17edf00 <_Znwm@plt>
      ecd79a:	48 89 c3             	mov    rbx,rax
      ecd79d:	0f 57 c0             	xorps  xmm0,xmm0
      ecd7a0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      ecd7a4:	48 8d 05 dd 6b 96 00 	lea    rax,[rip+0x966bdd]        # 1834388 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6320>
      ecd7ab:	48 89 03             	mov    QWORD PTR [rbx],rax
      ecd7ae:	4c 8d 73 20          	lea    r14,[rbx+0x20]
      ecd7b2:	ba 98 01 00 00       	mov    edx,0x198
      ecd7b7:	4c 89 f7             	mov    rdi,r14
      ecd7ba:	31 f6                	xor    esi,esi
      ecd7bc:	e8 cf 13 92 00       	call   17eeb90 <memset@plt>
      ecd7c1:	41 8b 47 68          	mov    eax,DWORD PTR [r15+0x68]
      ecd7c5:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
      ecd7cc:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      ecd7d0:	4c 89 ff             	mov    rdi,r15
      ecd7d3:	e8 f0 d9 77 00       	call   164b1c8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46336>
      ecd7d8:	85 c0                	test   eax,eax
      ecd7da:	74 1d                	je     ecd7f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x94c0f>
      ecd7dc:	89 c7                	mov    edi,eax
      ecd7de:	e8 b0 fe ff ff       	call   ecd693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x94aa9>
      ecd7e3:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      ecd7e8:	48 89 06             	mov    QWORD PTR [rsi],rax
      ecd7eb:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx

#### ref 0xecddba; FDE=(15523258, 15523273)
      ecdda1:	e8 0a 1d 92 00       	call   17efab0 <__stack_chk_fail@plt>
      ecdda6:	50                   	push   rax
      ecdda7:	6a 20                	push   0x20
      ecdda9:	5a                   	pop    rdx
      ecddaa:	e8 f1 00 92 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
      ecddaf:	58                   	pop    rax
      ecddb0:	c3                   	ret
      ecddb1:	48 89 c7             	mov    rdi,rax
      ecddb4:	e8 ec bc ba ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      ecddb9:	cc                   	int3
      ecddba:	48 8d 05 c7 65 96 00 	lea    rax,[rip+0x9665c7]        # 1834388 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6320>
      ecddc1:	48 89 07             	mov    QWORD PTR [rdi],rax
      ecddc4:	e9 47 02 92 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ecddc9:	cc                   	int3
      ecddca:	53                   	push   rbx
      ecddcb:	48 89 fb             	mov    rbx,rdi
      ecddce:	e8 e7 ff ff ff       	call   ecddba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x951d0>
      ecddd3:	48 89 df             	mov    rdi,rbx
      ecddd6:	5b                   	pop    rbx
      ecddd7:	e9 44 01 92 00       	jmp    17edf20 <_ZdlPv@plt>
      ecdddc:	53                   	push   rbx
      ecdddd:	48 89 fb             	mov    rbx,rdi
      ecdde0:	48 81 c7 98 01 00 00 	add    rdi,0x198
      ecdde7:	e8 a4 00 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ecddec:	48 8d bb 80 01 00 00 	lea    rdi,[rbx+0x180]
      ecddf3:	e8 98 00 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ecddf8:	48 8d bb 68 01 00 00 	lea    rdi,[rbx+0x168]
      ecddff:	e8 8c 00 92 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ecde04:	48 8d bb 50 01 00 00 	lea    rdi,[rbx+0x150]

### AP 0x18343b0: 1 refs
#### ref 0xecd69c; FDE=(15521427, 15521464)
      ecd67d:	00 00 
      ecd67f:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      ecd684:	75 08                	jne    ecd68e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x94aa4>
      ecd686:	48 89 df             	mov    rdi,rbx
      ecd689:	e8 42 26 ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ecd68e:	e8 1d 24 92 00       	call   17efab0 <__stack_chk_fail@plt>
      ecd693:	ff cf                	dec    edi
      ecd695:	83 ff 0a             	cmp    edi,0xa
      ecd698:	77 12                	ja     ecd6ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x94ac2>
      ecd69a:	89 f8                	mov    eax,edi
      ecd69c:	48 8d 0d 0d 6d 96 00 	lea    rcx,[rip+0x966d0d]        # 18343b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6348>
      ecd6a3:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      ecd6a7:	e9 8a e1 ba ff       	jmp    a7b836 <JNI_OnUnload@@Base+0x3103>
      ecd6ac:	48 8d 3d 65 fc 56 ff 	lea    rdi,[rip+0xffffffffff56fc65]        # 43d318 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2f24>
      ecd6b3:	e9 7e e1 ba ff       	jmp    a7b836 <JNI_OnUnload@@Base+0x3103>
      ecd6b8:	53                   	push   rbx
      ecd6b9:	48 83 ec 50          	sub    rsp,0x50
      ecd6bd:	48 89 fb             	mov    rbx,rdi
      ecd6c0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ecd6c7:	00 00 
      ecd6c9:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      ecd6ce:	48 8b 7a 10          	mov    rdi,QWORD PTR [rdx+0x10]
      ecd6d2:	48 8d 44 24 10       	lea    rax,[rsp+0x10]
      ecd6d7:	48 89 78 10          	mov    QWORD PTR [rax+0x10],rdi
      ecd6db:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
      ecd6de:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      ecd6e1:	0f 57 c0             	xorps  xmm0,xmm0
      ecd6e4:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
      ecd6e7:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0

### AP 0x1834418: 4 refs
#### ref 0xe9ff24; FDE=(15310087, 15343400)
      e9fef8:	e8 03 e0 94 00       	call   17edf00 <_Znwm@plt>
      e9fefd:	49 89 c4             	mov    r12,rax
      e9ff00:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ff07:	00 
      e9ff08:	48 8d 84 24 d0 0e 00 	lea    rax,[rsp+0xed0]
      e9ff0f:	00 
      e9ff10:	48 89 84 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],rax
      e9ff17:	00 
      e9ff18:	48 c7 84 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],0x1
      e9ff1f:	00 01 00 00 00 
      e9ff24:	48 8d 05 ed 44 99 00 	lea    rax,[rip+0x9944ed]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
      e9ff2b:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ff2f:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
      e9ff36:	00 
      e9ff37:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      e9ff3d:	48 8b 84 24 88 07 00 	mov    rax,QWORD PTR [rsp+0x788]
      e9ff44:	00 
      e9ff45:	0f 28 84 24 80 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x780]
      e9ff4c:	00 
      e9ff4d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      e9ff53:	48 85 c0             	test   rax,rax
      e9ff56:	74 05                	je     e9ff5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67373>
      e9ff58:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ff5d:	48 8b 84 24 98 07 00 	mov    rax,QWORD PTR [rsp+0x798]
      e9ff64:	00 
      e9ff65:	0f 28 84 24 90 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x790]
      e9ff6c:	00 
      e9ff6d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      e9ff73:	48 85 c0             	test   rax,rax

#### ref 0xee6cd6; FDE=(15625430, 15625449)
      ee6caf:	49 89 c6             	mov    r14,rax
      ee6cb2:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      ee6cb6:	e8 cb 77 bb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ee6cbb:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      ee6cbf:	e8 c2 77 bb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ee6cc4:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
      ee6cc8:	e8 b9 77 bb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ee6ccd:	4c 89 f7             	mov    rdi,r14
      ee6cd0:	e8 fb 8f b8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ee6cd5:	cc                   	int3
      ee6cd6:	48 8d 05 3b d7 94 00 	lea    rax,[rip+0x94d73b]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
      ee6cdd:	48 89 07             	mov    QWORD PTR [rdi],rax
      ee6ce0:	48 83 c7 10          	add    rdi,0x10
      ee6ce4:	e9 37 72 fe ff       	jmp    ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ee6ce9:	cc                   	int3
      ee6cea:	53                   	push   rbx
      ee6ceb:	48 89 fb             	mov    rbx,rdi
      ee6cee:	e8 e3 ff ff ff       	call   ee6cd6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae0ec>
      ee6cf3:	48 89 df             	mov    rdi,rbx
      ee6cf6:	5b                   	pop    rbx
      ee6cf7:	e9 24 72 90 00       	jmp    17edf20 <_ZdlPv@plt>
      ee6cfc:	41 56                	push   r14
      ee6cfe:	53                   	push   rbx
      ee6cff:	48 83 ec 28          	sub    rsp,0x28
      ee6d03:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ee6d0a:	00 00 
      ee6d0c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ee6d11:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      ee6d15:	bf b0 01 00 00       	mov    edi,0x1b0

#### ref 0xee6d39; FDE=(15625468, 15625630)
      ee6d0c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ee6d11:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      ee6d15:	bf b0 01 00 00       	mov    edi,0x1b0
      ee6d1a:	e8 e1 71 90 00       	call   17edf00 <_Znwm@plt>
      ee6d1f:	48 89 c3             	mov    rbx,rax
      ee6d22:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ee6d26:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      ee6d2b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ee6d30:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      ee6d37:	00 00 
      ee6d39:	48 8d 05 d8 d6 94 00 	lea    rax,[rip+0x94d6d8]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
      ee6d40:	48 89 03             	mov    QWORD PTR [rbx],rax
      ee6d43:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      ee6d47:	4c 89 f6             	mov    rsi,r14
      ee6d4a:	e8 71 02 00 00       	call   ee6fc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae3d6>
      ee6d4f:	48 89 e7             	mov    rdi,rsp
      ee6d52:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ee6d56:	e8 6f 35 b9 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ee6d5b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ee6d62:	00 00 
      ee6d64:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ee6d69:	75 2e                	jne    ee6d99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae1af>
      ee6d6b:	48 89 d8             	mov    rax,rbx
      ee6d6e:	48 83 c4 28          	add    rsp,0x28
      ee6d72:	5b                   	pop    rbx
      ee6d73:	41 5e                	pop    r14
      ee6d75:	c3                   	ret
      ee6d76:	48 89 c3             	mov    rbx,rax
      ee6d79:	48 89 e7             	mov    rdi,rsp

#### ref 0xee6da2; FDE=(15625630, 15625656)
      ee6d79:	48 89 e7             	mov    rdi,rsp
      ee6d7c:	e8 49 35 b9 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ee6d81:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ee6d88:	00 00 
      ee6d8a:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ee6d8f:	75 08                	jne    ee6d99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae1af>
      ee6d91:	48 89 df             	mov    rdi,rbx
      ee6d94:	e8 37 8f b8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ee6d99:	e8 12 8d 90 00       	call   17efab0 <__stack_chk_fail@plt>
      ee6d9e:	48 8d 47 10          	lea    rax,[rdi+0x10]
      ee6da2:	48 8d 0d 6f d6 94 00 	lea    rcx,[rip+0x94d66f]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
      ee6da9:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ee6dac:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      ee6db0:	48 89 c6             	mov    rsi,rax
      ee6db3:	e9 08 02 00 00       	jmp    ee6fc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae3d6>
      ee6db8:	55                   	push   rbp
      ee6db9:	41 57                	push   r15
      ee6dbb:	41 56                	push   r14
      ee6dbd:	41 55                	push   r13
      ee6dbf:	41 54                	push   r12
      ee6dc1:	53                   	push   rbx
      ee6dc2:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
      ee6dc9:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      ee6dce:	49 89 f5             	mov    r13,rsi
      ee6dd1:	49 89 fe             	mov    r14,rdi
      ee6dd4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ee6ddb:	00 00 
      ee6ddd:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      ee6de4:	00 

### AP 0x1834660: 2 refs
#### ref 0xece886; FDE=(15525244, 15530574)
      ece861:	00 
      ece862:	31 ff                	xor    edi,edi
      ece864:	e8 b3 fb bc ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ece869:	bf 48 01 00 00       	mov    edi,0x148
      ece86e:	e8 8d f6 91 00       	call   17edf00 <_Znwm@plt>
      ece873:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      ece878:	49 89 c6             	mov    r14,rax
      ece87b:	48 89 c5             	mov    rbp,rax
      ece87e:	0f 57 c0             	xorps  xmm0,xmm0
      ece881:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
      ece886:	48 8d 05 d3 5d 96 00 	lea    rax,[rip+0x965dd3]        # 1834660 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x65f8>
      ece88d:	49 89 06             	mov    QWORD PTR [r14],rax
      ece890:	66 41 c7 46 18 db 00 	mov    WORD PTR [r14+0x18],0xdb
      ece897:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
      ece89b:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      ece8a0:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
      ece8a4:	4d 8d 7e 30          	lea    r15,[r14+0x30]
      ece8a8:	4c 89 ff             	mov    rdi,r15
      ece8ab:	e8 de 99 c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ece8b0:	0f 57 c0             	xorps  xmm0,xmm0
      ece8b3:	41 0f 11 86 98 00 00 	movups XMMWORD PTR [r14+0x98],xmm0
      ece8ba:	00 
      ece8bb:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0
      ece8c2:	00 
      ece8c3:	b8 00 00 80 3f       	mov    eax,0x3f800000
      ece8c8:	41 89 86 a8 00 00 00 	mov    DWORD PTR [r14+0xa8],eax
      ece8cf:	41 c6 86 b0 00 00 00 	mov    BYTE PTR [r14+0xb0],0x1
      ece8d6:	01 
      ece8d7:	4d 8d a6 b8 00 00 00 	lea    r12,[r14+0xb8]

#### ref 0xed08e4; FDE=(15534308, 15534323)
      ed08c6:	41 5f                	pop    r15
      ed08c8:	e9 47 5e fd ff       	jmp    ea6714 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db2a>
      ed08cd:	cc                   	int3
      ed08ce:	53                   	push   rbx
      ed08cf:	48 89 fb             	mov    rbx,rdi
      ed08d2:	48 83 c7 20          	add    rdi,0x20
      ed08d6:	e8 c1 df d3 ff       	call   c0e89c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15b83c>
      ed08db:	48 89 df             	mov    rdi,rbx
      ed08de:	5b                   	pop    rbx
      ed08df:	e9 ac d5 91 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ed08e4:	48 8d 05 75 3d 96 00 	lea    rax,[rip+0x963d75]        # 1834660 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x65f8>
      ed08eb:	48 89 07             	mov    QWORD PTR [rdi],rax
      ed08ee:	e9 1d d7 91 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ed08f3:	cc                   	int3
      ed08f4:	53                   	push   rbx
      ed08f5:	48 89 fb             	mov    rbx,rdi
      ed08f8:	e8 e7 ff ff ff       	call   ed08e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97cfa>
      ed08fd:	48 89 df             	mov    rdi,rbx
      ed0900:	5b                   	pop    rbx
      ed0901:	e9 1a d6 91 00       	jmp    17edf20 <_ZdlPv@plt>
      ed0906:	53                   	push   rbx
      ed0907:	48 89 fb             	mov    rbx,rdi
      ed090a:	48 8b bf 38 01 00 00 	mov    rdi,QWORD PTR [rdi+0x138]
      ed0911:	e8 70 db bc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ed0916:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
      ed091d:	e8 6e d5 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ed0922:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
      ed0929:	e8 1a 00 00 00       	call   ed0948 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97d5e>
      ed092e:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]

### AP 0x1834698: 2 refs
#### ref 0xece9a0; FDE=(15525244, 15530574)
      ece97b:	00 
      ece97c:	31 ff                	xor    edi,edi
      ece97e:	e8 99 fa bc ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ece983:	bf 48 01 00 00       	mov    edi,0x148
      ece988:	e8 73 f5 91 00       	call   17edf00 <_Znwm@plt>
      ece98d:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      ece992:	49 89 c6             	mov    r14,rax
      ece995:	49 89 c5             	mov    r13,rax
      ece998:	0f 57 c0             	xorps  xmm0,xmm0
      ece99b:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
      ece9a0:	48 8d 05 f1 5c 96 00 	lea    rax,[rip+0x965cf1]        # 1834698 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6630>
      ece9a7:	49 89 06             	mov    QWORD PTR [r14],rax
      ece9aa:	66 41 c7 46 18 de 00 	mov    WORD PTR [r14+0x18],0xde
      ece9b1:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
      ece9b5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      ece9ba:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
      ece9be:	4d 8d 7e 30          	lea    r15,[r14+0x30]
      ece9c2:	4c 89 ff             	mov    rdi,r15
      ece9c5:	e8 c4 98 c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ece9ca:	0f 57 c0             	xorps  xmm0,xmm0
      ece9cd:	41 0f 11 86 98 00 00 	movups XMMWORD PTR [r14+0x98],xmm0
      ece9d4:	00 
      ece9d5:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0
      ece9dc:	00 
      ece9dd:	b8 00 00 80 3f       	mov    eax,0x3f800000
      ece9e2:	41 89 86 a8 00 00 00 	mov    DWORD PTR [r14+0xa8],eax
      ece9e9:	41 c6 86 b0 00 00 00 	mov    BYTE PTR [r14+0xb0],0x1
      ece9f0:	01 
      ece9f1:	4d 8d a6 b8 00 00 00 	lea    r12,[r14+0xb8]

#### ref 0xed081c; FDE=(15534108, 15534123)
      ed07fe:	41 5f                	pop    r15
      ed0800:	e9 0f 5f fd ff       	jmp    ea6714 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db2a>
      ed0805:	cc                   	int3
      ed0806:	53                   	push   rbx
      ed0807:	48 89 fb             	mov    rbx,rdi
      ed080a:	48 83 c7 18          	add    rdi,0x18
      ed080e:	e8 4d e0 d3 ff       	call   c0e860 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15b800>
      ed0813:	48 89 df             	mov    rdi,rbx
      ed0816:	5b                   	pop    rbx
      ed0817:	e9 74 d6 91 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ed081c:	48 8d 05 75 3e 96 00 	lea    rax,[rip+0x963e75]        # 1834698 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6630>
      ed0823:	48 89 07             	mov    QWORD PTR [rdi],rax
      ed0826:	e9 e5 d7 91 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ed082b:	cc                   	int3
      ed082c:	53                   	push   rbx
      ed082d:	48 89 fb             	mov    rbx,rdi
      ed0830:	e8 e7 ff ff ff       	call   ed081c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97c32>
      ed0835:	48 89 df             	mov    rdi,rbx
      ed0838:	5b                   	pop    rbx
      ed0839:	e9 e2 d6 91 00       	jmp    17edf20 <_ZdlPv@plt>
      ed083e:	53                   	push   rbx
      ed083f:	48 89 fb             	mov    rbx,rdi
      ed0842:	48 8b bf 38 01 00 00 	mov    rdi,QWORD PTR [rdi+0x138]
      ed0849:	e8 38 dc bc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ed084e:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
      ed0855:	e8 36 d6 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ed085a:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
      ed0861:	e8 1a 00 00 00       	call   ed0880 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97c96>
      ed0866:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]

### AP 0x18346d0: 2 refs
#### ref 0xeceabc; FDE=(15525244, 15530574)
      ecea96:	00 
      ecea97:	31 ff                	xor    edi,edi
      ecea99:	e8 7e f9 bc ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ecea9e:	bf 48 01 00 00       	mov    edi,0x148
      eceaa3:	e8 58 f4 91 00       	call   17edf00 <_Znwm@plt>
      eceaa8:	49 89 c4             	mov    r12,rax
      eceaab:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
      eceab0:	49 89 c7             	mov    r15,rax
      eceab3:	0f 57 c0             	xorps  xmm0,xmm0
      eceab6:	41 0f 11 44 24 08    	movups XMMWORD PTR [r12+0x8],xmm0
      eceabc:	48 8d 05 0d 5c 96 00 	lea    rax,[rip+0x965c0d]        # 18346d0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6668>
      eceac3:	49 89 04 24          	mov    QWORD PTR [r12],rax
      eceac7:	66 41 c7 44 24 18 06 	mov    WORD PTR [r12+0x18],0x6
      eceace:	00 
      eceacf:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ecead4:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      ecead9:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
      eceade:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      eceae3:	4d 8d 74 24 30       	lea    r14,[r12+0x30]
      eceae8:	4c 89 f7             	mov    rdi,r14
      eceaeb:	e8 9e 97 c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      eceaf0:	0f 57 c0             	xorps  xmm0,xmm0
      eceaf3:	41 0f 11 84 24 98 00 	movups XMMWORD PTR [r12+0x98],xmm0
      eceafa:	00 00 
      eceafc:	41 0f 11 84 24 88 00 	movups XMMWORD PTR [r12+0x88],xmm0
      eceb03:	00 00 
      eceb05:	b8 00 00 80 3f       	mov    eax,0x3f800000
      eceb0a:	41 89 84 24 a8 00 00 	mov    DWORD PTR [r12+0xa8],eax
      eceb11:	00 

#### ref 0xed0754; FDE=(15533908, 15533923)
      ed0735:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ed073c:	00 00 
      ed073e:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      ed0743:	75 0a                	jne    ed074f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97b65>
      ed0745:	48 83 c4 50          	add    rsp,0x50
      ed0749:	5b                   	pop    rbx
      ed074a:	41 5e                	pop    r14
      ed074c:	41 5f                	pop    r15
      ed074e:	c3                   	ret
      ed074f:	e8 5c f3 91 00       	call   17efab0 <__stack_chk_fail@plt>
      ed0754:	48 8d 05 75 3f 96 00 	lea    rax,[rip+0x963f75]        # 18346d0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6668>
      ed075b:	48 89 07             	mov    QWORD PTR [rdi],rax
      ed075e:	e9 ad d8 91 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ed0763:	cc                   	int3
      ed0764:	53                   	push   rbx
      ed0765:	48 89 fb             	mov    rbx,rdi
      ed0768:	e8 e7 ff ff ff       	call   ed0754 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97b6a>
      ed076d:	48 89 df             	mov    rdi,rbx
      ed0770:	5b                   	pop    rbx
      ed0771:	e9 aa d7 91 00       	jmp    17edf20 <_ZdlPv@plt>
      ed0776:	53                   	push   rbx
      ed0777:	48 89 fb             	mov    rbx,rdi
      ed077a:	48 8b bf 38 01 00 00 	mov    rdi,QWORD PTR [rdi+0x138]
      ed0781:	e8 00 dd bc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ed0786:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
      ed078d:	e8 fe d6 91 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ed0792:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
      ed0799:	e8 1a 00 00 00       	call   ed07b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97bce>
      ed079e:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]

### AP 0x18346f8: 1 refs
#### ref 0xee23b8; FDE=(15600356, 15615021)
      ee2395:	00 
      ee2396:	48 8d 84 24 20 01 00 	lea    rax,[rsp+0x120]
      ee239d:	00 
      ee239e:	48 8d bc 24 b0 09 00 	lea    rdi,[rsp+0x9b0]
      ee23a5:	00 
      ee23a6:	48 89 07             	mov    QWORD PTR [rdi],rax
      ee23a9:	8b 46 04             	mov    eax,DWORD PTR [rsi+0x4]
      ee23ac:	b9 ff ff ff ff       	mov    ecx,0xffffffff
      ee23b1:	48 39 c8             	cmp    rax,rcx
      ee23b4:	49 0f 44 c4          	cmove  rax,r12
      ee23b8:	48 8d 0d 39 23 95 00 	lea    rcx,[rip+0x952339]        # 18346f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6690>
      ee23bf:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
      ee23c2:	80 7c 24 0f 00       	cmp    BYTE PTR [rsp+0xf],0x0
      ee23c7:	0f 84 98 00 00 00    	je     ee2465 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa987b>
      ee23cd:	48 8d bc 24 b0 09 00 	lea    rdi,[rsp+0x9b0]
      ee23d4:	00 
      ee23d5:	48 8d b4 24 f0 12 00 	lea    rsi,[rsp+0x12f0]
      ee23dc:	00 
      ee23dd:	e8 57 ab 5b 00       	call   149cf39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e24bd>
      ee23e2:	48 8b 84 24 b8 09 00 	mov    rax,QWORD PTR [rsp+0x9b8]
      ee23e9:	00 
      ee23ea:	48 85 c0             	test   rax,rax
      ee23ed:	74 2c                	je     ee241b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa9831>
      ee23ef:	48 8b b4 24 b0 09 00 	mov    rsi,QWORD PTR [rsp+0x9b0]
      ee23f6:	00 
      ee23f7:	4c 6b f8 30          	imul   r15,rax,0x30
      ee23fb:	49 01 f7             	add    r15,rsi
      ee23fe:	4c 8d 76 18          	lea    r14,[rsi+0x18]
      ee2402:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]

### AP 0x1834728: 4 refs
#### ref 0xea01e4; FDE=(15310087, 15343400)
      ea01b8:	e8 43 dd 94 00       	call   17edf00 <_Znwm@plt>
      ea01bd:	49 89 c4             	mov    r12,rax
      ea01c0:	48 89 84 24 a0 0e 00 	mov    QWORD PTR [rsp+0xea0],rax
      ea01c7:	00 
      ea01c8:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]
      ea01cf:	00 
      ea01d0:	48 89 84 24 a8 0e 00 	mov    QWORD PTR [rsp+0xea8],rax
      ea01d7:	00 
      ea01d8:	48 c7 84 24 b0 0e 00 	mov    QWORD PTR [rsp+0xeb0],0x1
      ea01df:	00 01 00 00 00 
      ea01e4:	48 8d 05 3d 45 99 00 	lea    rax,[rip+0x99453d]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0>
      ea01eb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ea01ef:	0f 28 84 24 60 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1060]
      ea01f6:	00 
      ea01f7:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      ea01fd:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
      ea0204:	00 
      ea0205:	0f 28 84 24 70 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1070]
      ea020c:	00 
      ea020d:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      ea0213:	48 85 c0             	test   rax,rax
      ea0216:	74 05                	je     ea021d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67633>
      ea0218:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ea021d:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
      ea0224:	00 
      ea0225:	0f 28 84 24 80 10 00 	movaps xmm0,XMMWORD PTR [rsp+0x1080]
      ea022c:	00 
      ea022d:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
      ea0233:	48 85 c0             	test   rax,rax

#### ref 0xecdf82; FDE=(15523714, 15523733)
      ecdf58:	e8 0d c0 ba ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ecdf5d:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
      ecdf61:	e8 04 c0 ba ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ecdf66:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      ecdf6a:	e8 17 05 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ecdf6f:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      ecdf73:	e8 0e 05 bd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ecdf78:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
      ecdf7c:	5b                   	pop    rbx
      ecdf7d:	e9 04 05 bd ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      ecdf82:	48 8d 05 9f 67 96 00 	lea    rax,[rip+0x96679f]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0>
      ecdf89:	48 89 07             	mov    QWORD PTR [rdi],rax
      ecdf8c:	48 83 c7 10          	add    rdi,0x10
      ecdf90:	e9 8b ff ff ff       	jmp    ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ecdf95:	cc                   	int3
      ecdf96:	53                   	push   rbx
      ecdf97:	48 89 fb             	mov    rbx,rdi
      ecdf9a:	e8 e3 ff ff ff       	call   ecdf82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95398>
      ecdf9f:	48 89 df             	mov    rdi,rbx
      ecdfa2:	5b                   	pop    rbx
      ecdfa3:	e9 78 ff 91 00       	jmp    17edf20 <_ZdlPv@plt>
      ecdfa8:	41 56                	push   r14
      ecdfaa:	53                   	push   rbx
      ecdfab:	48 83 ec 28          	sub    rsp,0x28
      ecdfaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ecdfb6:	00 00 
      ecdfb8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ecdfbd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      ecdfc1:	bf b0 01 00 00       	mov    edi,0x1b0

#### ref 0xecdfe5; FDE=(15523752, 15523914)
      ecdfb8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ecdfbd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      ecdfc1:	bf b0 01 00 00       	mov    edi,0x1b0
      ecdfc6:	e8 35 ff 91 00       	call   17edf00 <_Znwm@plt>
      ecdfcb:	48 89 c3             	mov    rbx,rax
      ecdfce:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ecdfd2:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      ecdfd7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ecdfdc:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      ecdfe3:	00 00 
      ecdfe5:	48 8d 05 3c 67 96 00 	lea    rax,[rip+0x96673c]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0>
      ecdfec:	48 89 03             	mov    QWORD PTR [rbx],rax
      ecdfef:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      ecdff3:	4c 89 f6             	mov    rsi,r14
      ecdff6:	e8 5b 8b 01 00       	call   ee6b56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadf6c>
      ecdffb:	48 89 e7             	mov    rdi,rsp
      ecdffe:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ece002:	e8 c3 c2 ba ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ece007:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ece00e:	00 00 
      ece010:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ece015:	75 2e                	jne    ece045 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9545b>
      ece017:	48 89 d8             	mov    rax,rbx
      ece01a:	48 83 c4 28          	add    rsp,0x28
      ece01e:	5b                   	pop    rbx
      ece01f:	41 5e                	pop    r14
      ece021:	c3                   	ret
      ece022:	48 89 c3             	mov    rbx,rax
      ece025:	48 89 e7             	mov    rdi,rsp

#### ref 0xece04e; FDE=(15523914, 15523940)
      ece025:	48 89 e7             	mov    rdi,rsp
      ece028:	e8 9d c2 ba ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ece02d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ece034:	00 00 
      ece036:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ece03b:	75 08                	jne    ece045 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9545b>
      ece03d:	48 89 df             	mov    rdi,rbx
      ece040:	e8 8b 1c ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ece045:	e8 66 1a 92 00       	call   17efab0 <__stack_chk_fail@plt>
      ece04a:	48 8d 47 10          	lea    rax,[rdi+0x10]
      ece04e:	48 8d 0d d3 66 96 00 	lea    rcx,[rip+0x9666d3]        # 1834728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x66c0>
      ece055:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ece058:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      ece05c:	48 89 c6             	mov    rsi,rax
      ece05f:	e9 f2 8a 01 00       	jmp    ee6b56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadf6c>
      ece064:	48 83 c7 10          	add    rdi,0x10
      ece068:	e9 b3 fe ff ff       	jmp    ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ece06d:	cc                   	int3
      ece06e:	53                   	push   rbx
      ece06f:	48 89 fb             	mov    rbx,rdi
      ece072:	48 83 c7 10          	add    rdi,0x10
      ece076:	e8 a5 fe ff ff       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
      ece07b:	48 89 df             	mov    rdi,rbx
      ece07e:	5b                   	pop    rbx
      ece07f:	e9 9c fe 91 00       	jmp    17edf20 <_ZdlPv@plt>
      ece084:	55                   	push   rbp
      ece085:	41 57                	push   r15
      ece087:	41 56                	push   r14
      ece089:	41 55                	push   r13

### AP 0x18674c8: 2 refs
#### ref 0x1353019; FDE=(20260004, 20264020)
     1352ff0:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1352ff5:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
     1352ffc:	00 
     1352ffd:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
     1353004:	00 
     1353005:	0f 57 c0             	xorps  xmm0,xmm0
     1353008:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     135300f:	00 
     1353010:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1353017:	00 00 
     1353019:	48 8d 05 a8 44 51 00 	lea    rax,[rip+0x5144a8]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
     1353020:	49 89 06             	mov    QWORD PTR [r14],rax
     1353023:	48 8d 05 26 45 51 00 	lea    rax,[rip+0x514526]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
     135302a:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     135302e:	49 8d 46 10          	lea    rax,[r14+0x10]
     1353032:	48 8d 0d 47 49 51 00 	lea    rcx,[rip+0x514947]        # 1867980 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24068>
     1353039:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
     135303d:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1353044:	00 
     1353045:	49 89 7e 18          	mov    QWORD PTR [r14+0x18],rdi
     1353049:	48 8b 8c 24 08 01 00 	mov    rcx,QWORD PTR [rsp+0x108]
     1353050:	00 
     1353051:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
     1353055:	48 85 c9             	test   rcx,rcx
     1353058:	74 05                	je     135305f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1985e3>
     135305a:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135305f:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
     1353064:	4c 89 f1             	mov    rcx,r14
     1353067:	48 83 c1 40          	add    rcx,0x40

#### ref 0x1355044; FDE=(20271168, 20271257)
     135502b:	cc                   	int3
     135502c:	80 bf 98 02 00 00 00 	cmp    BYTE PTR [rdi+0x298],0x0
     1355033:	74 04                	je     1355039 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a5bd>
     1355035:	48 89 f8             	mov    rax,rdi
     1355038:	c3                   	ret
     1355039:	50                   	push   rax
     135503a:	e8 5e 12 78 ff       	call   ad629d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2323d>
     135503f:	cc                   	int3
     1355040:	53                   	push   rbx
     1355041:	48 89 fb             	mov    rbx,rdi
     1355044:	48 8d 05 7d 24 51 00 	lea    rax,[rip+0x51247d]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
     135504b:	48 89 07             	mov    QWORD PTR [rdi],rax
     135504e:	48 8d 05 fb 24 51 00 	lea    rax,[rip+0x5124fb]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
     1355055:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     1355059:	80 bf d8 08 00 00 00 	cmp    BYTE PTR [rdi+0x8d8],0x0
     1355060:	74 0c                	je     135506e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a5f2>
     1355062:	48 8d bb f8 03 00 00 	lea    rdi,[rbx+0x3f8]
     1355069:	e8 a4 15 00 00       	call   1356612 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bb96>
     135506e:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
     1355075:	e8 40 31 00 00       	call   13581ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d73e>
     135507a:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
     135507e:	e8 03 94 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1355083:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
     1355087:	e8 c8 e6 ff ff       	call   1353754 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198cd8>
     135508c:	48 83 c3 10          	add    rbx,0x10
     1355090:	48 89 df             	mov    rdi,rbx
     1355093:	5b                   	pop    rbx
     1355094:	e9 81 4e 00 00       	jmp    1359f1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f49e>
     1355099:	cc                   	int3

### AP 0x1867550: 2 refs
#### ref 0x1353023; FDE=(20260004, 20264020)
     1352ffc:	00 
     1352ffd:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
     1353004:	00 
     1353005:	0f 57 c0             	xorps  xmm0,xmm0
     1353008:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     135300f:	00 
     1353010:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1353017:	00 00 
     1353019:	48 8d 05 a8 44 51 00 	lea    rax,[rip+0x5144a8]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
     1353020:	49 89 06             	mov    QWORD PTR [r14],rax
     1353023:	48 8d 05 26 45 51 00 	lea    rax,[rip+0x514526]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
     135302a:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     135302e:	49 8d 46 10          	lea    rax,[r14+0x10]
     1353032:	48 8d 0d 47 49 51 00 	lea    rcx,[rip+0x514947]        # 1867980 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24068>
     1353039:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
     135303d:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1353044:	00 
     1353045:	49 89 7e 18          	mov    QWORD PTR [r14+0x18],rdi
     1353049:	48 8b 8c 24 08 01 00 	mov    rcx,QWORD PTR [rsp+0x108]
     1353050:	00 
     1353051:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
     1353055:	48 85 c9             	test   rcx,rcx
     1353058:	74 05                	je     135305f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1985e3>
     135305a:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135305f:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
     1353064:	4c 89 f1             	mov    rcx,r14
     1353067:	48 83 c1 40          	add    rcx,0x40
     135306b:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     1353070:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx

#### ref 0x135504e; FDE=(20271168, 20271257)
     1355033:	74 04                	je     1355039 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a5bd>
     1355035:	48 89 f8             	mov    rax,rdi
     1355038:	c3                   	ret
     1355039:	50                   	push   rax
     135503a:	e8 5e 12 78 ff       	call   ad629d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2323d>
     135503f:	cc                   	int3
     1355040:	53                   	push   rbx
     1355041:	48 89 fb             	mov    rbx,rdi
     1355044:	48 8d 05 7d 24 51 00 	lea    rax,[rip+0x51247d]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
     135504b:	48 89 07             	mov    QWORD PTR [rdi],rax
     135504e:	48 8d 05 fb 24 51 00 	lea    rax,[rip+0x5124fb]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
     1355055:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     1355059:	80 bf d8 08 00 00 00 	cmp    BYTE PTR [rdi+0x8d8],0x0
     1355060:	74 0c                	je     135506e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a5f2>
     1355062:	48 8d bb f8 03 00 00 	lea    rdi,[rbx+0x3f8]
     1355069:	e8 a4 15 00 00       	call   1356612 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bb96>
     135506e:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
     1355075:	e8 40 31 00 00       	call   13581ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d73e>
     135507a:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
     135507e:	e8 03 94 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1355083:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
     1355087:	e8 c8 e6 ff ff       	call   1353754 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198cd8>
     135508c:	48 83 c3 10          	add    rbx,0x10
     1355090:	48 89 df             	mov    rdi,rbx
     1355093:	5b                   	pop    rbx
     1355094:	e9 81 4e 00 00       	jmp    1359f1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f49e>
     1355099:	cc                   	int3
     135509a:	53                   	push   rbx
     135509b:	48 89 fb             	mov    rbx,rdi

### AP 0x1867980: 1 refs
#### ref 0x1353032; FDE=(20260004, 20264020)
     1353005:	0f 57 c0             	xorps  xmm0,xmm0
     1353008:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     135300f:	00 
     1353010:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1353017:	00 00 
     1353019:	48 8d 05 a8 44 51 00 	lea    rax,[rip+0x5144a8]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
     1353020:	49 89 06             	mov    QWORD PTR [r14],rax
     1353023:	48 8d 05 26 45 51 00 	lea    rax,[rip+0x514526]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
     135302a:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     135302e:	49 8d 46 10          	lea    rax,[r14+0x10]
     1353032:	48 8d 0d 47 49 51 00 	lea    rcx,[rip+0x514947]        # 1867980 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24068>
     1353039:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
     135303d:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1353044:	00 
     1353045:	49 89 7e 18          	mov    QWORD PTR [r14+0x18],rdi
     1353049:	48 8b 8c 24 08 01 00 	mov    rcx,QWORD PTR [rsp+0x108]
     1353050:	00 
     1353051:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
     1353055:	48 85 c9             	test   rcx,rcx
     1353058:	74 05                	je     135305f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1985e3>
     135305a:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135305f:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
     1353064:	4c 89 f1             	mov    rcx,r14
     1353067:	48 83 c1 40          	add    rcx,0x40
     135306b:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     1353070:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx
     1353074:	49 83 66 50 00       	and    QWORD PTR [r14+0x50],0x0
     1353079:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1353080:	00 

## Builder bodies / source field fingerprints
### 0xece084 FDE=(15523972, 15525243)
      ece084:	55                   	push   rbp
      ece085:	41 57                	push   r15
      ece087:	41 56                	push   r14
      ece089:	41 55                	push   r13
      ece08b:	41 54                	push   r12
      ece08d:	53                   	push   rbx
      ece08e:	48 81 ec 68 01 00 00 	sub    rsp,0x168
      ece095:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8
      ece09a:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      ece09f:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
      ece0a4:	49 89 f6             	mov    r14,rsi
      ece0a7:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      ece0ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ece0b3:	00 00 
      ece0b5:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
      ece0bc:	00 
      ece0bd:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      ece0c1:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      ece0c6:	4c 8b 66 18          	mov    r12,QWORD PTR [rsi+0x18]
      ece0ca:	4c 8d 6e 50          	lea    r13,[rsi+0x50]
      ece0ce:	4c 8b be 60 01 00 00 	mov    r15,QWORD PTR [rsi+0x160]
      ece0d5:	bf 50 0e 00 00       	mov    edi,0xe50
      ece0da:	e8 21 fe 91 00       	call   17edf00 <_Znwm@plt>
      ece0df:	48 89 c3             	mov    rbx,rax
      ece0e2:	0f 57 c0             	xorps  xmm0,xmm0
      ece0e5:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      ece0e9:	48 8d 05 70 63 96 00 	lea    rax,[rip+0x966370]        # 1834460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63f8>
      ece0f0:	48 89 03             	mov    QWORD PTR [rbx],rax
      ece0f3:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      ece0fa:	00 
      ece0fb:	4c 89 ee             	mov    rsi,r13
      ece0fe:	e8 8d c1 ba ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ece103:	49 8d b6 80 00 00 00 	lea    rsi,[r14+0x80]
      ece10a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      ece111:	00 
      ece112:	e8 79 c1 ba ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ece144:	49 8d 4e 20          	lea    rcx,[r14+0x20]
      ece148:	4d 8d 46 30          	lea    r8,[r14+0x30]
      ece14c:	4d 8d 4e 40          	lea    r9,[r14+0x40]
      ece150:	49 8d 86 b0 00 00 00 	lea    rax,[r14+0xb0]
      ece157:	4d 8d 96 68 01 00 00 	lea    r10,[r14+0x168]
      ece15e:	4d 8d 9e 78 01 00 00 	lea    r11,[r14+0x178]
      ece165:	49 8d ae 88 01 00 00 	lea    rbp,[r14+0x188]
      ece173:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
      ece18f:	48 8d 84 24 68 01 00 	lea    rax,[rsp+0x168]
      ece1bb:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      ece1d5:	8a 41 20             	mov    al,BYTE PTR [rcx+0x20]
      ece1e3:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
      ece210:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
      ece22a:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece245:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      ece25a:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      ece283:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      ece2ac:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      ece2df:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece2f0:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      ece30c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece31d:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece32e:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      ece34a:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece370:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece381:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      ece39d:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece3ae:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece3bf:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      ece3db:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece3fd:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece414:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      ece481:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ece4a0:	48 3b 84 24 60 01 00 	cmp    rax,QWORD PTR [rsp+0x160]
      ece4e2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece564:	48 3b 84 24 60 01 00 	cmp    rax,QWORD PTR [rsp+0x160]

### 0xee6db8 FDE=(15625656, 15626175)
      ee6db8:	55                   	push   rbp
      ee6db9:	41 57                	push   r15
      ee6dbb:	41 56                	push   r14
      ee6dbd:	41 55                	push   r13
      ee6dbf:	41 54                	push   r12
      ee6dc1:	53                   	push   rbx
      ee6dc2:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
      ee6dc9:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      ee6dce:	49 89 f5             	mov    r13,rsi
      ee6dd1:	49 89 fe             	mov    r14,rdi
      ee6dd4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ee6ddb:	00 00 
      ee6ddd:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      ee6de4:	00 
      ee6de5:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      ee6de9:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      ee6dee:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
      ee6df2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ee6df7:	4c 8d 66 50          	lea    r12,[rsi+0x50]
      ee6dfb:	48 8b ae 60 01 00 00 	mov    rbp,QWORD PTR [rsi+0x160]
      ee6e02:	bf 50 0e 00 00       	mov    edi,0xe50
      ee6e07:	e8 f4 70 90 00       	call   17edf00 <_Znwm@plt>
      ee6e0c:	49 89 c7             	mov    r15,rax
      ee6e0f:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ee6e13:	0f 57 c0             	xorps  xmm0,xmm0
      ee6e16:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      ee6e1a:	48 8d 05 3f d6 94 00 	lea    rax,[rip+0x94d63f]        # 1834460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63f8>
      ee6e21:	49 89 07             	mov    QWORD PTR [r15],rax
      ee6e24:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ee6e29:	4c 89 e6             	mov    rsi,r12
      ee6e2c:	e8 5f 34 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ee6e31:	49 8d b5 80 00 00 00 	lea    rsi,[r13+0x80]
      ee6e38:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ee6e3d:	e8 4e 34 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ee6e42:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      ee6e4a:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      ee6e5c:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      ee6e69:	49 8d 4d 20          	lea    rcx,[r13+0x20]
      ee6e6d:	4d 8d 45 30          	lea    r8,[r13+0x30]
      ee6e71:	4d 8d 4d 40          	lea    r9,[r13+0x40]
      ee6e75:	49 8d 85 b0 00 00 00 	lea    rax,[r13+0xb0]
      ee6e7c:	4d 8d 95 68 01 00 00 	lea    r10,[r13+0x168]
      ee6e83:	4d 8d 9d 78 01 00 00 	lea    r11,[r13+0x178]
      ee6e8a:	49 8d 9d 88 01 00 00 	lea    rbx,[r13+0x188]
      ee6e9f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
      ee6ea4:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      ee6ed3:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      ee6eed:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ee6ef7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ee6f5b:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      ee6f6d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ee6f7c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]

## Shared virtual targets with TimelineAds APs
- candidate AP 0x18342e0 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18342e0 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18342e0 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x18342e8 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18342e8 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18342e8 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x18342f0 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18342f0 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18342f0 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x18342f8 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18342f8 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18342f8 vs TimelineAds AP 0x1867980: shared=3 0x9d7de0, 0xa3fa60, 0xa50370
- candidate AP 0x1834300 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834300 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834300 vs TimelineAds AP 0x1867980: shared=3 0x9d7de0, 0xa3fa60, 0xa50370
- candidate AP 0x1834340 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834340 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834340 vs TimelineAds AP 0x1867980: shared=3 0x9d7de0, 0xa3fa60, 0xa50370
- candidate AP 0x1834348 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834348 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834348 vs TimelineAds AP 0x1867980: shared=3 0x9d7de0, 0xa3fa60, 0xa50370
- candidate AP 0x1834388 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834388 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834388 vs TimelineAds AP 0x1867980: shared=3 0x9d7de0, 0xa3fa60, 0xa50370
- candidate AP 0x1834390 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834390 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834390 vs TimelineAds AP 0x1867980: shared=3 0x9d7de0, 0xa3fa60, 0xa50370
- candidate AP 0x18343b0 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18343b0 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18343b0 vs TimelineAds AP 0x1867980: shared=3 0x9d7de0, 0xa3fa60, 0xa50370
- candidate AP 0x1834418 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834418 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834418 vs TimelineAds AP 0x1867980: shared=3 0x9d7de0, 0xa3fa60, 0xa50370
- candidate AP 0x1834420 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834420 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834420 vs TimelineAds AP 0x1867980: shared=3 0x9d7de0, 0xa3fa60, 0xa50370
- candidate AP 0x1834650 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834650 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834650 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x1834660 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834660 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834660 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x1834668 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834668 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834668 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x1834688 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834688 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834688 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x1834698 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834698 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834698 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x18346a0 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18346a0 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18346a0 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x18346c0 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18346c0 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18346c0 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x18346d0 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18346d0 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18346d0 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x18346d8 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18346d8 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18346d8 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x18346f8 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18346f8 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x18346f8 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x1834728 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834728 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834728 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
- candidate AP 0x1834730 vs TimelineAds AP 0x18674c8: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834730 vs TimelineAds AP 0x1867550: shared=2 0x9d7de0, 0x9d81d0
- candidate AP 0x1834730 vs TimelineAds AP 0x1867980: shared=2 0x9d7de0, 0xa50370
