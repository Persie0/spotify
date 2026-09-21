# Service184 ABI candidate validation

Required downstream dependency surface:
- service184 +0x28() returns a persistent pointer
- returned pointer is later invoked at virtual +0x68
- same dependency family is also reused through +0x98, +0xb8, +0xc0 during player construction

## Candidate address point 0x18228d8
- +0x28 = 0xd17212
- return shape = embedded this+0x218

### Candidate vtable slots
- +0x0: 0xd16f8e FDE=(13725582, 13725690)
- +0x8: 0xd16ffa FDE=(13725690, 13725798)
- +0x10: 0xd17066 FDE=(13725798, 13725906)
- +0x18: 0xd170d2 FDE=(13725906, 13725963)
- +0x20: 0xd1710c FDE=(13725964, 13726226)
- +0x28: 0xd17212 FDE=(13726226, 13726234)
- +0x30: 0xd1721a FDE=(13726234, 13726305)
- +0x38: 0xd17262 FDE=(13726306, 13726538)
- +0x40: 0xd1734a FDE=(13726538, 13726914)
- +0x48: 0xd174c2 FDE=(13726914, 13728354)
- +0x50: 0xd17a62 FDE=(13728354, 13728679)
- +0x58: 0xd17ba8 FDE=(13728680, 13728929)
- +0x60: 0xd17ca2 FDE=(13728930, 13729091)
- +0x68: 0xcc23d0 FDE=(13378512, 13378620)
- +0x70: 0xd17d44 FDE=(13729092, 13729200)
- +0x78: 0xd17db0 FDE=(13729200, 13729308)
- +0x80: 0xd17e1c FDE=(13729308, 13729766)
- +0x88: 0xd17fe6 FDE=(13729766, 13730106)
- +0x90: 0xd1813a FDE=(13730106, 13730882)
- +0x98: 0xd18442 FDE=(13730882, 13730995)
- +0xa0: 0xd184b4 FDE=(13730996, 13731858)
- +0xa8: 0xd15094 FDE=(13717652, 13720368)
- +0xb0: 0xd18812 FDE=(13731858, 13738390)
- +0xb8: 0xd1a196 FDE=(13738390, 13738411)
- +0xc0: 0xd1a1ac FDE=(13738412, 13738433)

### Materializations of candidate vptr (0 direct comment refs)
### Writes/initialization around returned dependency offset +0x218
#### FDE 0xac16dd..0xac3969; hit 0xac2e2d: movdqu XMMWORD PTR [r12+0x218],xmm0; score=2
      ac2df8:	00 
      ac2df9:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
      ac2dfd:	49 89 9c 24 f8 01 00 	mov    QWORD PTR [r12+0x1f8],rbx
      ac2e04:	00 
      ac2e05:	4d 8d b4 24 00 02 00 	lea    r14,[r12+0x200]
      ac2e0c:	00 
      ac2e0d:	4c 89 f7             	mov    rdi,r14
      ac2e10:	48 89 de             	mov    rsi,rbx
      ac2e13:	e8 aa e8 cf 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      ac2e18:	41 c6 84 24 10 02 00 	mov    BYTE PTR [r12+0x210],0x0
      ac2e1f:	00 00 
      ac2e21:	49 8d ac 24 18 02 00 	lea    rbp,[r12+0x218]
      ac2e28:	00 
      ac2e29:	66 0f ef c0          	pxor   xmm0,xmm0
      ac2e2d:	f3 41 0f 7f 84 24 18 	movdqu XMMWORD PTR [r12+0x218],xmm0
      ac2e34:	02 00 00 
      ac2e37:	f3 41 0f 7f 84 24 28 	movdqu XMMWORD PTR [r12+0x228],xmm0
      ac2e3e:	02 00 00 
      ac2e41:	41 c7 84 24 38 02 00 	mov    DWORD PTR [r12+0x238],0x3f800000
      ac2e48:	00 00 00 80 3f 
      ac2e4d:	4d 8d bc 24 40 02 00 	lea    r15,[r12+0x240]
      ac2e54:	00 
      ac2e55:	4c 89 ff             	mov    rdi,r15
      ac2e58:	48 89 de             	mov    rsi,rbx
      ac2e5b:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
      ac2e60:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
      ac2e65:	e8 2e 5b 09 00       	call   b58998 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5938>
      ac2e6a:	4d 8d ac 24 48 02 00 	lea    r13,[r12+0x248]
      ac2e71:	00 
      ac2e72:	4c 89 ef             	mov    rdi,r13
      ac2e75:	48 89 de             	mov    rsi,rbx
      ac2e78:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
      ac2e7d:	e8 16 5b 09 00       	call   b58998 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5938>
      ac2e82:	66 41 83 a4 24 50 02 	and    WORD PTR [r12+0x250],0x0
      ac2e89:	00 00 00 
      ac2e8c:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      ac2e93:	00 
      ac2e94:	48 8b b4 24 20 02 00 	mov    rsi,QWORD PTR [rsp+0x220]
      ac2e9b:	00 
      ac2e9c:	e8 fb 4d fe ff       	call   aa7c9c <JNI_OnUnload@@Base+0x2f569>
      ac2ea1:	48 8d 35 f1 c0 89 ff 	lea    rsi,[rip+0xffffffffff89c0f1]        # 35ef99 <_ZTSSt12bad_any_cast@@Base-0x3122f>
      ac2ea8:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      ac2eaf:	00 

#### FDE 0xacbf86..0xacc2a5; hit 0xacc251: mov    BYTE PTR [rbx+0x218],al; score=2
      acc216:	74 37                	je     acc24f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x191ef>
      acc218:	48 8d 83 f8 01 00 00 	lea    rax,[rbx+0x1f8]
      acc21f:	49 8b 8e 08 02 00 00 	mov    rcx,QWORD PTR [r14+0x208]
      acc226:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      acc22a:	41 0f 10 86 f8 01 00 	movups xmm0,XMMWORD PTR [r14+0x1f8]
      acc231:	00 
      acc232:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      acc235:	0f 57 c0             	xorps  xmm0,xmm0
      acc238:	41 0f 11 86 f8 01 00 	movups XMMWORD PTR [r14+0x1f8],xmm0
      acc23f:	00 
      acc240:	49 83 a6 08 02 00 00 	and    QWORD PTR [r14+0x208],0x0
      acc247:	00 
      acc248:	c6 83 10 02 00 00 01 	mov    BYTE PTR [rbx+0x210],0x1
      acc24f:	31 c0                	xor    eax,eax
      acc251:	88 83 18 02 00 00    	mov    BYTE PTR [rbx+0x218],al
      acc257:	88 83 30 02 00 00    	mov    BYTE PTR [rbx+0x230],al
      acc25d:	41 38 86 30 02 00 00 	cmp    BYTE PTR [r14+0x230],al
      acc264:	74 37                	je     acc29d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1923d>
      acc266:	48 8d 83 18 02 00 00 	lea    rax,[rbx+0x218]
      acc26d:	49 8b 8e 28 02 00 00 	mov    rcx,QWORD PTR [r14+0x228]
      acc274:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      acc278:	41 0f 10 86 18 02 00 	movups xmm0,XMMWORD PTR [r14+0x218]
      acc27f:	00 
      acc280:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      acc283:	0f 57 c0             	xorps  xmm0,xmm0
      acc286:	41 0f 11 86 18 02 00 	movups XMMWORD PTR [r14+0x218],xmm0
      acc28d:	00 
      acc28e:	49 83 a6 28 02 00 00 	and    QWORD PTR [r14+0x228],0x0
      acc295:	00 
      acc296:	c6 83 30 02 00 00 01 	mov    BYTE PTR [rbx+0x230],0x1
      acc29d:	48 83 c4 08          	add    rsp,0x8
      acc2a1:	5b                   	pop    rbx
      acc2a2:	41 5e                	pop    r14
      acc2a4:	c3                   	ret
      acc2a5:	cc                   	int3
      acc2a6:	53                   	push   rbx
      acc2a7:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      acc2aa:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      acc2ae:	48 85 db             	test   rbx,rbx
      acc2b1:	74 11                	je     acc2c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19264>
      acc2b3:	48 89 df             	mov    rdi,rbx
      acc2b6:	e8 2d 01 00 00       	call   acc3e8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19388>
      acc2bb:	48 89 df             	mov    rdi,rbx

#### FDE 0xbc91ea..0xbc97a3; hit 0xbc9313: and    QWORD PTR [r14+0x218],0x0; score=2
      bc92d9:	31 f6                	xor    esi,esi
      bc92db:	e8 b0 58 c2 00       	call   17eeb90 <memset@plt>
      bc92e0:	f3 0f 10 05 c8 53 7c 	movss  xmm0,DWORD PTR [rip+0xffffffffff7c53c8]        # 38e6b0 <_ZTSSt12bad_any_cast@@Base-0x1b18>
      bc92e7:	ff 
      bc92e8:	41 0f 13 86 ec 01 00 	movlps QWORD PTR [r14+0x1ec],xmm0
      bc92ef:	00 
      bc92f0:	49 83 a6 f4 01 00 00 	and    QWORD PTR [r14+0x1f4],0x0
      bc92f7:	00 
      bc92f8:	49 c7 86 00 02 00 00 	mov    QWORD PTR [r14+0x200],0xa
      bc92ff:	0a 00 00 00 
      bc9303:	49 83 a6 08 02 00 00 	and    QWORD PTR [r14+0x208],0x0
      bc930a:	00 
      bc930b:	41 83 a6 10 02 00 00 	and    DWORD PTR [r14+0x210],0x0
      bc9312:	00 
      bc9313:	49 83 a6 18 02 00 00 	and    QWORD PTR [r14+0x218],0x0
      bc931a:	00 
      bc931b:	4d 8d a6 20 02 00 00 	lea    r12,[r14+0x220]
      bc9322:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
      bc9327:	83 22 00             	and    DWORD PTR [rdx],0x0
      bc932a:	6a 0a                	push   0xa
      bc932c:	5e                   	pop    rsi
      bc932d:	4c 89 e7             	mov    rdi,r12
      bc9330:	e8 c1 25 00 00       	call   bcb8f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x118896>
      bc9335:	6a 38                	push   0x38
      bc9337:	5f                   	pop    rdi
      bc9338:	e8 c3 4b c2 00       	call   17edf00 <_Znwm@plt>
      bc933d:	49 89 c5             	mov    r13,rax
      bc9340:	0f 57 c0             	xorps  xmm0,xmm0
      bc9343:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      bc9347:	48 8d 05 52 a6 c3 00 	lea    rax,[rip+0xc3a652]        # 18039a0 <_ZTIN4asio22service_already_existsE@@Base+0x5188>
      bc934e:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      bc9352:	4c 89 ed             	mov    rbp,r13
      bc9355:	48 83 c5 18          	add    rbp,0x18
      bc9359:	41 0f 11 45 18       	movups XMMWORD PTR [r13+0x18],xmm0
      bc935e:	49 83 65 28 00       	and    QWORD PTR [r13+0x28],0x0
      bc9363:	48 8d 15 12 8c 88 ff 	lea    rdx,[rip+0xffffffffff888c12]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      bc936a:	48 89 ef             	mov    rdi,rbp
      bc936d:	48 89 d6             	mov    rsi,rdx
      bc9370:	e8 91 e9 ed ff       	call   aa7d06 <JNI_OnUnload@@Base+0x2f5d3>
      bc9375:	48 8d 35 ff f4 78 ff 	lea    rsi,[rip+0xffffffffff78f4ff]        # 35887b <_ZTSSt12bad_any_cast@@Base-0x3794d>
      bc937c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      bc9381:	e8 f8 06 eb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      bc9386:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]

#### FDE 0xbc9fe4..0xbca0b4; hit 0xbca076: and    QWORD PTR [rdi+0x218],0x0; score=2
      bca025:	0f 11 87 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm0
      bca02c:	88 8f 98 00 00 00    	mov    BYTE PTR [rdi+0x98],cl
      bca032:	88 8f c8 00 00 00    	mov    BYTE PTR [rdi+0xc8],cl
      bca038:	0f 11 87 b8 00 00 00 	movups XMMWORD PTR [rdi+0xb8],xmm0
      bca03f:	48 8b 87 f0 00 00 00 	mov    rax,QWORD PTR [rdi+0xf0]
      bca046:	f3 0f 11 48 0c       	movss  DWORD PTR [rax+0xc],xmm1
      bca04b:	88 8f e8 01 00 00    	mov    BYTE PTR [rdi+0x1e8],cl
      bca051:	0f 11 87 d8 01 00 00 	movups XMMWORD PTR [rdi+0x1d8],xmm0
      bca058:	f3 0f 11 8f ec 01 00 	movss  DWORD PTR [rdi+0x1ec],xmm1
      bca05f:	00 
      bca060:	83 a7 f8 01 00 00 00 	and    DWORD PTR [rdi+0x1f8],0x0
      bca067:	83 a7 10 02 00 00 00 	and    DWORD PTR [rdi+0x210],0x0
      bca06e:	48 83 a7 08 02 00 00 	and    QWORD PTR [rdi+0x208],0x0
      bca075:	00 
      bca076:	48 83 a7 18 02 00 00 	and    QWORD PTR [rdi+0x218],0x0
      bca07d:	00 
      bca07e:	48 8b b7 00 02 00 00 	mov    rsi,QWORD PTR [rdi+0x200]
      bca085:	48 81 c7 20 02 00 00 	add    rdi,0x220
      bca08c:	48 8d 54 24 04       	lea    rdx,[rsp+0x4]
      bca091:	83 22 00             	and    DWORD PTR [rdx],0x0
      bca094:	e8 25 19 00 00       	call   bcb9be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11895e>
      bca099:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bca0a0:	00 00 
      bca0a2:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
      bca0a7:	75 06                	jne    bca0af <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11704f>
      bca0a9:	48 83 c4 10          	add    rsp,0x10
      bca0ad:	5b                   	pop    rbx
      bca0ae:	c3                   	ret
      bca0af:	e8 fc 59 c2 00       	call   17efab0 <__stack_chk_fail@plt>
      bca0b4:	41 57                	push   r15
      bca0b6:	41 56                	push   r14
      bca0b8:	41 55                	push   r13
      bca0ba:	41 54                	push   r12
      bca0bc:	53                   	push   rbx
      bca0bd:	49 89 f6             	mov    r14,rsi
      bca0c0:	48 89 fb             	mov    rbx,rdi
      bca0c3:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
      bca0c8:	48 8b 46 48          	mov    rax,QWORD PTR [rsi+0x48]
      bca0cc:	8a 00                	mov    al,BYTE PTR [rax]
      bca0ce:	a8 01                	test   al,0x1
      bca0d0:	75 66                	jne    bca138 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1170d8>
      bca0d2:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
      bca0d6:	4d 8b 7d 08          	mov    r15,QWORD PTR [r13+0x8]

#### FDE 0xbca418..0xbcb2fd; hit 0xbca516: mov    rax,QWORD PTR [r12+0x218]; score=2
      bca4e4:	00 
      bca4e5:	31 f6                	xor    esi,esi
      bca4e7:	e8 c6 28 00 00       	call   bccdb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x119d52>
      bca4ec:	49 c1 ee 20          	shr    r14,0x20
      bca4f0:	48 89 c1             	mov    rcx,rax
      bca4f3:	48 c1 e9 20          	shr    rcx,0x20
      bca4f7:	74 06                	je     bca4ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11749f>
      bca4f9:	66 0f 6e c0          	movd   xmm0,eax
      bca4fd:	eb 08                	jmp    bca507 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1174a7>
      bca4ff:	66 0f 6e 05 81 41 7c 	movd   xmm0,DWORD PTR [rip+0xffffffffff7c4181]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
      bca506:	ff 
      bca507:	44 89 74 24 04       	mov    DWORD PTR [rsp+0x4],r14d
      bca50c:	66 41 0f 7e 84 24 ec 	movd   DWORD PTR [r12+0x1ec],xmm0
      bca513:	01 00 00 
      bca516:	49 8b 84 24 18 02 00 	mov    rax,QWORD PTR [r12+0x218]
      bca51d:	00 
      bca51e:	49 3b 84 24 00 02 00 	cmp    rax,QWORD PTR [r12+0x200]
      bca525:	00 
      bca526:	73 36                	jae    bca55e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1174fe>
      bca528:	49 8b 8c 24 20 02 00 	mov    rcx,QWORD PTR [r12+0x220]
      bca52f:	00 
      bca530:	f3 0f 11 04 81       	movss  DWORD PTR [rcx+rax*4],xmm0
      bca535:	f3 41 0f 58 84 24 10 	addss  xmm0,DWORD PTR [r12+0x210]
      bca53c:	02 00 00 
      bca53f:	f3 41 0f 11 84 24 10 	movss  DWORD PTR [r12+0x210],xmm0
      bca546:	02 00 00 
      bca549:	49 8b 8c 24 18 02 00 	mov    rcx,QWORD PTR [r12+0x218]
      bca550:	00 
      bca551:	48 ff c1             	inc    rcx
      bca554:	49 89 8c 24 18 02 00 	mov    QWORD PTR [r12+0x218],rcx
      bca55b:	00 
      bca55c:	eb 4a                	jmp    bca5a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x117548>
      bca55e:	49 8b 84 24 08 02 00 	mov    rax,QWORD PTR [r12+0x208]
      bca565:	00 
      bca566:	49 8b 8c 24 20 02 00 	mov    rcx,QWORD PTR [r12+0x220]
      bca56d:	00 
      bca56e:	f3 41 0f 10 8c 24 10 	movss  xmm1,DWORD PTR [r12+0x210]
      bca575:	02 00 00 
      bca578:	f3 0f 5c 0c 81       	subss  xmm1,DWORD PTR [rcx+rax*4]
      bca57d:	f3 41 0f 11 8c 24 10 	movss  DWORD PTR [r12+0x210],xmm1
      bca584:	02 00 00 
      bca587:	66 0f 7e 04 81       	movd   DWORD PTR [rcx+rax*4],xmm0
      bca58c:	f3 41 0f 58 84 24 10 	addss  xmm0,DWORD PTR [r12+0x210]

#### FDE 0xbd9b4a..0xbdc4b7; hit 0xbd9e33: movupd XMMWORD PTR [r14+0x218],xmm0; score=2
      bd9def:	4c 89 e7             	mov    rdi,r12
      bd9df2:	e8 5b 58 01 00       	call   bef652 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13c5f2>
      bd9df7:	4c 89 64 24 58       	mov    QWORD PTR [rsp+0x58],r12
      bd9dfc:	4d 8d a6 e8 01 00 00 	lea    r12,[r14+0x1e8]
      bd9e03:	66 0f 57 c0          	xorpd  xmm0,xmm0
      bd9e07:	66 41 0f 11 86 e8 01 	movupd XMMWORD PTR [r14+0x1e8],xmm0
      bd9e0e:	00 00 
      bd9e10:	4d 89 a6 e0 01 00 00 	mov    QWORD PTR [r14+0x1e0],r12
      bd9e17:	49 83 a6 f8 01 00 00 	and    QWORD PTR [r14+0x1f8],0x0
      bd9e1e:	00 
      bd9e1f:	41 c7 86 00 02 00 00 	mov    DWORD PTR [r14+0x200],0x1
      bd9e26:	01 00 00 00 
      bd9e2a:	66 41 0f 11 86 08 02 	movupd XMMWORD PTR [r14+0x208],xmm0
      bd9e31:	00 00 
      bd9e33:	66 41 0f 11 86 18 02 	movupd XMMWORD PTR [r14+0x218],xmm0
      bd9e3a:	00 00 
      bd9e3c:	66 41 0f 11 86 28 02 	movupd XMMWORD PTR [r14+0x228],xmm0
      bd9e43:	00 00 
      bd9e45:	41 83 a6 38 02 00 00 	and    DWORD PTR [r14+0x238],0x0
      bd9e4c:	00 
      bd9e4d:	66 41 0f 29 86 40 02 	movapd XMMWORD PTR [r14+0x240],xmm0
      bd9e54:	00 00 
      bd9e56:	66 41 0f 29 86 50 02 	movapd XMMWORD PTR [r14+0x250],xmm0
      bd9e5d:	00 00 
      bd9e5f:	66 41 0f 29 86 60 02 	movapd XMMWORD PTR [r14+0x260],xmm0
      bd9e66:	00 00 
      bd9e68:	48 8d 05 d1 8e c3 00 	lea    rax,[rip+0xc38ed1]        # 1812d40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x8a00>
      bd9e6f:	49 89 86 70 02 00 00 	mov    QWORD PTR [r14+0x270],rax
      bd9e76:	6a 11                	push   0x11
      bd9e78:	5f                   	pop    rdi
      bd9e79:	e8 e8 68 00 00       	call   be0766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d706>
      bd9e7e:	49 89 86 78 02 00 00 	mov    QWORD PTR [r14+0x278],rax
      bd9e85:	49 83 a6 80 02 00 00 	and    QWORD PTR [r14+0x280],0x0
      bd9e8c:	00 
      bd9e8d:	41 c7 86 88 02 00 00 	mov    DWORD PTR [r14+0x288],0x11
      bd9e94:	11 00 00 00 
      bd9e98:	31 c0                	xor    eax,eax
      bd9e9a:	41 87 86 84 02 00 00 	xchg   DWORD PTR [r14+0x284],eax
      bd9ea1:	49 8d ae 90 02 00 00 	lea    rbp,[r14+0x290]
      bd9ea8:	6a 10                	push   0x10
      bd9eaa:	5e                   	pop    rsi
      bd9eab:	48 89 ef             	mov    rdi,rbp
      bd9eae:	e8 79 69 00 00       	call   be082c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d7cc>

#### FDE 0xbf0ede..0xbf42c9; hit 0xbf28b5: movupd XMMWORD PTR [rbx+0x218],xmm1; score=2
      bf287d:	84 c0                	test   al,al
      bf287f:	74 17                	je     bf2898 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f838>
      bf2881:	c6 83 e0 01 00 00 01 	mov    BYTE PTR [rbx+0x1e0],0x1
      bf2888:	48 83 a3 e8 01 00 00 	and    QWORD PTR [rbx+0x1e8],0x0
      bf288f:	00 
      bf2890:	f2 0f 11 8b f0 01 00 	movsd  QWORD PTR [rbx+0x1f0],xmm1
      bf2897:	00 
      bf2898:	66 0f 10 8b c8 00 00 	movupd xmm1,XMMWORD PTR [rbx+0xc8]
      bf289f:	00 
      bf28a0:	f2 0f 10 83 d0 00 00 	movsd  xmm0,QWORD PTR [rbx+0xd0]
      bf28a7:	00 
      bf28a8:	66 0f 2e c1          	ucomisd xmm0,xmm1
      bf28ac:	76 0f                	jbe    bf28bd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f85d>
      bf28ae:	c6 83 10 02 00 00 01 	mov    BYTE PTR [rbx+0x210],0x1
      bf28b5:	66 0f 11 8b 18 02 00 	movupd XMMWORD PTR [rbx+0x218],xmm1
      bf28bc:	00 
      bf28bd:	66 0f 28 d1          	movapd xmm2,xmm1
      bf28c1:	f2 0f 58 15 87 c5 79 	addsd  xmm2,QWORD PTR [rip+0xffffffffff79c587]        # 38ee50 <_ZTSSt12bad_any_cast@@Base-0x1378>
      bf28c8:	ff 
      bf28c9:	66 0f 2e c2          	ucomisd xmm0,xmm2
      bf28cd:	76 61                	jbe    bf2930 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f8d0>
      bf28cf:	f2 0f 10 83 e0 00 00 	movsd  xmm0,QWORD PTR [rbx+0xe0]
      bf28d6:	00 
      bf28d7:	f2 0f 58 05 71 c5 79 	addsd  xmm0,QWORD PTR [rip+0xffffffffff79c571]        # 38ee50 <_ZTSSt12bad_any_cast@@Base-0x1378>
      bf28de:	ff 
      bf28df:	66 0f 2e 83 e8 00 00 	ucomisd xmm0,QWORD PTR [rbx+0xe8]
      bf28e6:	00 
      bf28e7:	76 47                	jbe    bf2930 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f8d0>
      bf28e9:	c6 83 28 02 00 00 01 	mov    BYTE PTR [rbx+0x228],0x1
      bf28f0:	66 0f 10 93 f8 00 00 	movupd xmm2,XMMWORD PTR [rbx+0xf8]
      bf28f7:	00 
      bf28f8:	66 0f 28 c1          	movapd xmm0,xmm1
      bf28fc:	f2 0f 10 c2          	movsd  xmm0,xmm2
      bf2900:	66 0f 28 da          	movapd xmm3,xmm2
      bf2904:	f2 0f 10 d9          	movsd  xmm3,xmm1
      bf2908:	66 0f c2 c3 01       	cmpltpd xmm0,xmm3
      bf290d:	66 0f 38 15 ca       	blendvpd xmm1,xmm2,xmm0
      bf2912:	66 0f 11 8b 30 02 00 	movupd XMMWORD PTR [rbx+0x230],xmm1
      bf2919:	00 
      bf291a:	f2 0f 10 05 26 c9 79 	movsd  xmm0,QWORD PTR [rip+0xffffffffff79c926]        # 38f248 <_ZTSSt12bad_any_cast@@Base-0xf80>
      bf2921:	ff 
      bf2922:	66 0f 2e c1          	ucomisd xmm0,xmm1
      bf2926:	76 08                	jbe    bf2930 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f8d0>

#### FDE 0xc1fa42..0xc1fe8a; hit 0xc1fc7f: and    QWORD PTR [rbx+0x218],0x0; score=2
      c1fc32:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
      c1fc37:	e8 ba 9d bb 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c1fc3c:	48 8d bb 80 01 00 00 	lea    rdi,[rbx+0x180]
      c1fc43:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
      c1fc48:	e8 a9 9d bb 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c1fc4d:	48 8d bb 90 01 00 00 	lea    rdi,[rbx+0x190]
      c1fc54:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      c1fc59:	e8 98 9d bb 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c1fc5e:	48 8d ab a0 01 00 00 	lea    rbp,[rbx+0x1a0]
      c1fc65:	48 89 ef             	mov    rdi,rbp
      c1fc68:	e8 89 9d bb 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c1fc6d:	48 c7 83 b0 01 00 00 	mov    QWORD PTR [rbx+0x1b0],0x1
      c1fc74:	01 00 00 00 
      c1fc78:	83 a3 b8 01 00 00 00 	and    DWORD PTR [rbx+0x1b8],0x0
      c1fc7f:	48 83 a3 18 02 00 00 	and    QWORD PTR [rbx+0x218],0x0
      c1fc86:	00 
      c1fc87:	48 83 a3 28 02 00 00 	and    QWORD PTR [rbx+0x228],0x0
      c1fc8e:	00 
      c1fc8f:	48 8d 83 c0 01 00 00 	lea    rax,[rbx+0x1c0]
      c1fc96:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      c1fc9b:	48 83 a3 38 02 00 00 	and    QWORD PTR [rbx+0x238],0x0
      c1fca2:	00 
      c1fca3:	48 8d 83 28 02 00 00 	lea    rax,[rbx+0x228]
      c1fcaa:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      c1fcaf:	48 83 a3 48 02 00 00 	and    QWORD PTR [rbx+0x248],0x0
      c1fcb6:	00 
      c1fcb7:	48 8d 83 48 02 00 00 	lea    rax,[rbx+0x248]
      c1fcbe:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      c1fcc3:	48 83 a3 58 02 00 00 	and    QWORD PTR [rbx+0x258],0x0
      c1fcca:	00 
      c1fccb:	4c 8d b3 68 02 00 00 	lea    r14,[rbx+0x268]
      c1fcd2:	0f 57 c0             	xorps  xmm0,xmm0
      c1fcd5:	0f 11 83 c0 01 00 00 	movups XMMWORD PTR [rbx+0x1c0],xmm0
      c1fcdc:	0f 11 83 d0 01 00 00 	movups XMMWORD PTR [rbx+0x1d0],xmm0
      c1fce3:	0f 11 83 e0 01 00 00 	movups XMMWORD PTR [rbx+0x1e0],xmm0
      c1fcea:	0f 11 83 f0 01 00 00 	movups XMMWORD PTR [rbx+0x1f0],xmm0
      c1fcf1:	0f 11 83 00 02 00 00 	movups XMMWORD PTR [rbx+0x200],xmm0
      c1fcf8:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
      c1fcfd:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
      c1fd01:	48 8d 05 5c c7 e5 ff 	lea    rax,[rip+0xffffffffffe5c75c]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      c1fd08:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      c1fd0d:	48 8d 05 8a 01 00 00 	lea    rax,[rip+0x18a]        # c1fe9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16ce3e>
      c1fd14:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax

#### FDE 0xc5391a..0xc571cb; hit 0xc56c30: mov    rdi,QWORD PTR [r12+0x218]; score=2
      c56bf4:	4c 89 e5             	mov    rbp,r12
      c56bf7:	48 81 c5 90 02 00 00 	add    rbp,0x290
      c56bfe:	4c 89 ef             	mov    rdi,r13
      c56c01:	e8 40 ab b6 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      c56c06:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      c56c0b:	e8 36 ab b6 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      c56c10:	4c 89 f7             	mov    rdi,r14
      c56c13:	e8 2e ab b6 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      c56c18:	48 89 ef             	mov    rdi,rbp
      c56c1b:	e8 2e 6d 00 00       	call   c5d94e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1aa8ee>
      c56c20:	4c 89 ff             	mov    rdi,r15
      c56c23:	e8 48 6d 00 00       	call   c5d970 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1aa910>
      c56c28:	48 89 df             	mov    rdi,rbx
      c56c2b:	e8 32 8f ff ff       	call   c4fb62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb02>
      c56c30:	49 8b bc 24 18 02 00 	mov    rdi,QWORD PTR [r12+0x218]
      c56c37:	00 
      c56c38:	e8 a3 d1 ed ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      c56c3d:	eb 04                	jmp    c56c43 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a3be3>
      c56c3f:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      c56c43:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      c56c48:	e8 1d 33 e2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c56c4d:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      c56c52:	e8 13 33 e2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c56c57:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      c56c5c:	e8 09 33 e2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c56c61:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      c56c66:	e8 ff 32 e2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c56c6b:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      c56c70:	e8 f5 32 e2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c56c75:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      c56c7a:	e8 eb 32 e2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c56c7f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      c56c84:	e8 e1 32 e2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c56c89:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c56c8e:	e8 d7 32 e2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c56c93:	4c 89 e7             	mov    rdi,r12
      c56c96:	e8 85 72 b9 00       	call   17edf20 <_ZdlPv@plt>
      c56c9b:	e9 ab 04 00 00       	jmp    c5714b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a40eb>
      c56ca0:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      c56ca4:	eb bb                	jmp    c56c61 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a3c01>
      c56ca6:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      c56caa:	eb bf                	jmp    c56c6b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a3c0b>
      c56cac:	48 89 04 24          	mov    QWORD PTR [rsp],rax

#### FDE 0xc5e096..0xc5e17a; hit 0xc5e110: mov    rdi,QWORD PTR [rbx+0x218]; score=2
      c5e0bc:	48 8d bb 00 03 00 00 	lea    rdi,[rbx+0x300]
      c5e0c3:	e8 62 f8 ff ff       	call   c5d92a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1aa8ca>
      c5e0c8:	48 8d bb e0 02 00 00 	lea    rdi,[rbx+0x2e0]
      c5e0cf:	e8 72 36 b6 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      c5e0d4:	48 8d bb c8 02 00 00 	lea    rdi,[rbx+0x2c8]
      c5e0db:	e8 66 36 b6 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      c5e0e0:	48 8d bb b8 02 00 00 	lea    rdi,[rbx+0x2b8]
      c5e0e7:	e8 5a 36 b6 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      c5e0ec:	48 8d bb 90 02 00 00 	lea    rdi,[rbx+0x290]
      c5e0f3:	e8 56 f8 ff ff       	call   c5d94e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1aa8ee>
      c5e0f8:	48 8d bb 58 02 00 00 	lea    rdi,[rbx+0x258]
      c5e0ff:	e8 6c f8 ff ff       	call   c5d970 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1aa910>
      c5e104:	48 8d bb 28 02 00 00 	lea    rdi,[rbx+0x228]
      c5e10b:	e8 52 1a ff ff       	call   c4fb62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb02>
      c5e110:	48 8b bb 18 02 00 00 	mov    rdi,QWORD PTR [rbx+0x218]
      c5e117:	e8 c4 5c ed ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      c5e11c:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
      c5e123:	e8 42 be e1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c5e128:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
      c5e12f:	e8 36 be e1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c5e134:	48 8d bb 10 01 00 00 	lea    rdi,[rbx+0x110]
      c5e13b:	e8 2a be e1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c5e140:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
      c5e147:	e8 1e be e1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c5e14c:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
      c5e153:	e8 12 be e1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c5e158:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
      c5e15f:	e8 06 be e1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c5e164:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
      c5e168:	e8 fd bd e1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c5e16d:	48 83 c3 20          	add    rbx,0x20
      c5e171:	48 89 df             	mov    rdi,rbx
      c5e174:	5b                   	pop    rbx
      c5e175:	e9 f0 bd e1 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
      c5e17a:	53                   	push   rbx
      c5e17b:	48 89 fb             	mov    rbx,rdi
      c5e17e:	e8 13 ff ff ff       	call   c5e096 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ab036>
      c5e183:	48 89 df             	mov    rdi,rbx
      c5e186:	5b                   	pop    rbx
      c5e187:	e9 94 fd b8 00       	jmp    17edf20 <_ZdlPv@plt>
      c5e18c:	55                   	push   rbp
      c5e18d:	41 57                	push   r15
      c5e18f:	41 56                	push   r14

#### FDE 0xc6c08a..0xc6e081; hit 0xc6cb86: mov    rsi,QWORD PTR [r13+0x218]; score=2
      c6cb48:	e8 59 4e 00 00       	call   c719a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be946>
      c6cb4d:	49 8d bd 18 02 00 00 	lea    rdi,[r13+0x218]
      c6cb54:	6a 01                	push   0x1
      c6cb56:	5e                   	pop    rsi
      c6cb57:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
      c6cb5e:	00 
      c6cb5f:	48 89 9c 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rbx
      c6cb66:	00 
      c6cb67:	e8 3d f7 b2 00       	call   179c2a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x150415>
      c6cb6c:	49 8d bd 20 02 00 00 	lea    rdi,[r13+0x220]
      c6cb73:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
      c6cb78:	31 f6                	xor    esi,esi
      c6cb7a:	e8 2a f7 b2 00       	call   179c2a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x150415>
      c6cb7f:	49 8d ad 28 02 00 00 	lea    rbp,[r13+0x228]
      c6cb86:	49 8b b5 18 02 00 00 	mov    rsi,QWORD PTR [r13+0x218]
      c6cb8d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      c6cb90:	48 89 ef             	mov    rdi,rbp
      c6cb93:	ff 50 48             	call   QWORD PTR [rax+0x48]
      c6cb96:	49 8d 85 30 02 00 00 	lea    rax,[r13+0x230]
      c6cb9d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      c6cba2:	0f 57 c0             	xorps  xmm0,xmm0
      c6cba5:	41 0f 29 85 40 02 00 	movaps XMMWORD PTR [r13+0x240],xmm0
      c6cbac:	00 
      c6cbad:	41 0f 29 85 30 02 00 	movaps XMMWORD PTR [r13+0x230],xmm0
      c6cbb4:	00 
      c6cbb5:	41 c7 85 50 02 00 00 	mov    DWORD PTR [r13+0x250],0x3f800000
      c6cbbc:	00 00 80 3f 
      c6cbc0:	0f 10 84 24 6c 02 00 	movups xmm0,XMMWORD PTR [rsp+0x26c]
      c6cbc7:	00 
      c6cbc8:	41 0f 11 85 58 02 00 	movups XMMWORD PTR [r13+0x258],xmm0
      c6cbcf:	00 
      c6cbd0:	8b 84 24 7c 02 00 00 	mov    eax,DWORD PTR [rsp+0x27c]
      c6cbd7:	41 89 85 68 02 00 00 	mov    DWORD PTR [r13+0x268],eax
      c6cbde:	48 8b 5c 24 58       	mov    rbx,QWORD PTR [rsp+0x58]
      c6cbe3:	49 89 9d 70 02 00 00 	mov    QWORD PTR [r13+0x270],rbx
      c6cbea:	49 8d bd 78 02 00 00 	lea    rdi,[r13+0x278]
      c6cbf1:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
      c6cbf8:	00 
      c6cbf9:	4c 8b 74 24 30       	mov    r14,QWORD PTR [rsp+0x30]
      c6cbfe:	4c 89 f6             	mov    rsi,r14
      c6cc01:	e8 bc 4a b5 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      c6cc06:	49 8d bd 88 02 00 00 	lea    rdi,[r13+0x288]
      c6cc0d:	48 89 bc 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rdi

#### FDE 0xc7764c..0xc7792e; hit 0xc776ad: mov    rdi,QWORD PTR [r15+0x218]; score=2
      c77669:	49 89 fe             	mov    r14,rdi
      c7766c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c77673:	00 00 
      c77675:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      c7767c:	00 
      c7767d:	48 8d be d8 01 00 00 	lea    rdi,[rsi+0x1d8]
      c77684:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      c77689:	e8 08 a3 ff ff       	call   c71996 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be936>
      c7768e:	49 8b b7 70 03 00 00 	mov    rsi,QWORD PTR [r15+0x370]
      c77695:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      c7769a:	44 89 e2             	mov    edx,r12d
      c7769d:	e8 84 a3 ff ff       	call   c71a26 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be9c6>
      c776a2:	80 7c 24 58 00       	cmp    BYTE PTR [rsp+0x58],0x0
      c776a7:	0f 84 2f 01 00 00    	je     c777dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c477c>
      c776ad:	49 8b bf 18 02 00 00 	mov    rdi,QWORD PTR [r15+0x218]
      c776b4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c776b7:	ff 50 40             	call   QWORD PTR [rax+0x40]
      c776ba:	84 c0                	test   al,al
      c776bc:	0f 84 1a 01 00 00    	je     c777dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c477c>
      c776c2:	be c0 27 09 00       	mov    esi,0x927c0
      c776c7:	4c 89 ff             	mov    rdi,r15
      c776ca:	e8 57 f6 ff ff       	call   c76d26 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c3cc6>
      c776cf:	41 0f b6 dc          	movzx  ebx,r12b
      c776d3:	4c 89 ff             	mov    rdi,r15
      c776d6:	89 de                	mov    esi,ebx
      c776d8:	4c 89 ea             	mov    rdx,r13
      c776db:	e8 9c a3 ff ff       	call   c71a7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bea1c>
      c776e0:	49 89 c4             	mov    r12,rax
      c776e3:	48 85 c0             	test   rax,rax
      c776e6:	0f 85 bb 00 00 00    	jne    c777a7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c4747>
      c776ec:	40 84 ed             	test   bpl,bpl
      c776ef:	0f 84 e7 00 00 00    	je     c777dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c477c>
      c776f5:	6a 58                	push   0x58
      c776f7:	5f                   	pop    rdi
      c776f8:	e8 03 68 b7 00       	call   17edf00 <_Znwm@plt>
      c776fd:	49 89 c4             	mov    r12,rax
      c77700:	0f b6 4c 24 28       	movzx  ecx,BYTE PTR [rsp+0x28]
      c77705:	48 89 c7             	mov    rdi,rax
      c77708:	4c 89 ee             	mov    rsi,r13
      c7770b:	89 da                	mov    edx,ebx
      c7770d:	45 31 c0             	xor    r8d,r8d
      c77710:	45 31 c9             	xor    r9d,r9d
      c77713:	e8 3c 22 00 00       	call   c79954 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c68f4>

#### FDE 0xc782e6..0xc78762; hit 0xc7853d: mov    rdi,QWORD PTR [r14+0x218]; score=2
      c78510:	6a 04                	push   0x4
      c78512:	5e                   	pop    rsi
      c78513:	4c 8d 6c 24 68       	lea    r13,[rsp+0x68]
      c78518:	4c 89 ea             	mov    rdx,r13
      c7851b:	e8 2c dd b2 00       	call   17a624c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a3b8>
      c78520:	31 ed                	xor    ebp,ebp
      c78522:	4c 89 e8             	mov    rax,r13
      c78525:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
      c7852a:	31 c9                	xor    ecx,ecx
      c7852c:	8a 14 08             	mov    dl,BYTE PTR [rax+rcx*1]
      c7852f:	41 30 54 0d 00       	xor    BYTE PTR [r13+rcx*1+0x0],dl
      c78534:	48 ff c1             	inc    rcx
      c78537:	48 83 f9 10          	cmp    rcx,0x10
      c7853b:	75 ef                	jne    c7852c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c54cc>
      c7853d:	49 8b be 18 02 00 00 	mov    rdi,QWORD PTR [r14+0x218]
      c78544:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c78547:	4c 89 ee             	mov    rsi,r13
      c7854a:	4c 89 ea             	mov    rdx,r13
      c7854d:	44 89 e1             	mov    ecx,r12d
      c78550:	ff 50 28             	call   QWORD PTR [rax+0x28]
      c78553:	4c 89 e8             	mov    rax,r13
      c78556:	49 83 c5 10          	add    r13,0x10
      c7855a:	48 ff c5             	inc    rbp
      c7855d:	48 83 fd 04          	cmp    rbp,0x4
      c78561:	75 c7                	jne    c7852a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c54ca>
      c78563:	49 8b be 40 03 00 00 	mov    rdi,QWORD PTR [r14+0x340]
      c7856a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c7856d:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
      c78571:	ff 50 20             	call   QWORD PTR [rax+0x20]
      c78574:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
      c78579:	48 89 ee             	mov    rsi,rbp
      c7857c:	48 c1 e6 06          	shl    rsi,0x6
      c78580:	48 81 c6 00 02 00 00 	add    rsi,0x200
      c78587:	89 c7                	mov    edi,eax
      c78589:	31 d2                	xor    edx,edx
      c7858b:	e8 81 ce b4 00       	call   17c5411 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17957d>
      c78590:	89 44 24 68          	mov    DWORD PTR [rsp+0x68],eax
      c78594:	48 89 54 24 70       	mov    QWORD PTR [rsp+0x70],rdx
      c78599:	85 c0                	test   eax,eax
      c7859b:	0f 85 b4 00 00 00    	jne    c78655 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c55f5>
      c785a1:	49 8b be 40 03 00 00 	mov    rdi,QWORD PTR [r14+0x340]
      c785a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c785ab:	ff 50 20             	call   QWORD PTR [rax+0x20]

#### FDE 0xc9837c..0xc991f8; hit 0xc990ec: mov    rdi,QWORD PTR [r15+0x218]; score=2
      c990ae:	eb 03                	jmp    c990b3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e6053>
      c990b0:	48 89 c3             	mov    rbx,rax
      c990b3:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      c990ba:	00 
      c990bb:	e8 34 99 00 00       	call   ca29f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ef994>
      c990c0:	eb 03                	jmp    c990c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e6065>
      c990c2:	48 89 c3             	mov    rbx,rax
      c990c5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      c990ca:	4c 8d b0 c8 00 00 00 	lea    r14,[rax+0xc8]
      c990d1:	4c 8d a0 80 01 00 00 	lea    r12,[rax+0x180]
      c990d8:	4c 8d a8 98 01 00 00 	lea    r13,[rax+0x198]
      c990df:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
      c990e6:	00 
      c990e7:	e8 9a 53 e0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c990ec:	49 8b bf 18 02 00 00 	mov    rdi,QWORD PTR [r15+0x218]
      c990f3:	e8 8e 53 e0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c990f8:	4c 89 ef             	mov    rdi,r13
      c990fb:	e8 b6 24 00 00       	call   c9b5b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e8556>
      c99100:	4c 89 e7             	mov    rdi,r12
      c99103:	e8 4e e4 e1 ff       	call   ab7556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x44f6>
      c99108:	4c 89 f7             	mov    rdi,r14
      c9910b:	e8 80 63 00 00       	call   c9f490 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ec430>
      c99110:	eb 23                	jmp    c99135 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e60d5>
      c99112:	48 89 c7             	mov    rdi,rax
      c99115:	e8 8b 09 de ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      c9911a:	48 89 c3             	mov    rbx,rax
      c9911d:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      c99124:	00 
      c99125:	e8 74 e1 e0 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      c9912a:	48 89 df             	mov    rdi,rbx
      c9912d:	e8 73 09 de ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      c99132:	48 89 c3             	mov    rbx,rax
      c99135:	49 8b bf c0 00 00 00 	mov    rdi,QWORD PTR [r15+0xc0]
      c9913c:	e8 45 53 e0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c99141:	eb 03                	jmp    c99146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e60e6>
      c99143:	48 89 c3             	mov    rbx,rax
      c99146:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c9914b:	48 81 c7 b0 00 00 00 	add    rdi,0xb0
      c99152:	e8 d1 0c de ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
      c99157:	49 8b bf 98 00 00 00 	mov    rdi,QWORD PTR [r15+0x98]
      c9915e:	e8 4f 53 e0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      c99163:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      c99168:	e8 b9 79 e0 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>

#### FDE 0xcc2bf4..0xcc35b6; hit 0xcc2edd: mov    rax,QWORD PTR [rcx+0x218]; score=2
      cc2ea2:	00 
      cc2ea3:	80 4f f0 02          	or     BYTE PTR [rdi-0x10],0x2
      cc2ea7:	48 89 54 24 69       	mov    QWORD PTR [rsp+0x69],rdx
      cc2eac:	c6 44 24 71 00       	mov    BYTE PTR [rsp+0x71],0x0
      cc2eb1:	48 8b 57 e8          	mov    rdx,QWORD PTR [rdi-0x18]
      cc2eb5:	f6 c2 01             	test   dl,0x1
      cc2eb8:	0f 85 a1 05 00 00    	jne    cc345f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2103ff>
      cc2ebe:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
      cc2ec3:	e8 1e 29 aa 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      cc2ec8:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      cc2ecd:	e8 be af b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cc2ed2:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
      cc2ed7:	49 89 ec             	mov    r12,rbp
      cc2eda:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
      cc2edd:	48 8b 81 18 02 00 00 	mov    rax,QWORD PTR [rcx+0x218]
      cc2ee4:	8b ac 24 c0 00 00 00 	mov    ebp,DWORD PTR [rsp+0xc0]
      cc2eeb:	48 3b 81 20 02 00 00 	cmp    rax,QWORD PTR [rcx+0x220]
      cc2ef2:	0f 95 84 24 f4 00 00 	setne  BYTE PTR [rsp+0xf4]
      cc2ef9:	00 
      cc2efa:	74 13                	je     cc2f0f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20feaf>
      cc2efc:	f2 0f 5a 40 10       	cvtsd2ss xmm0,QWORD PTR [rax+0x10]
      cc2f01:	f3 0f 11 84 24 f0 00 	movss  DWORD PTR [rsp+0xf0],xmm0
      cc2f08:	00 00 
      cc2f0a:	83 cd 60             	or     ebp,0x60
      cc2f0d:	eb 03                	jmp    cc2f12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20feb2>
      cc2f0f:	83 cd 40             	or     ebp,0x40
      cc2f12:	31 c0                	xor    eax,eax
      cc2f14:	80 b9 70 01 00 00 01 	cmp    BYTE PTR [rcx+0x170],0x1
      cc2f1b:	ba 00 00 00 00       	mov    edx,0x0
      cc2f20:	48 19 d2             	sbb    rdx,rdx
      cc2f23:	48 63 b1 6c 01 00 00 	movsxd rsi,DWORD PTR [rcx+0x16c]
      cc2f2a:	48 09 f2             	or     rdx,rsi
      cc2f2d:	48 89 94 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rdx
      cc2f34:	00 
      cc2f35:	89 eb                	mov    ebx,ebp
      cc2f37:	83 cb 10             	or     ebx,0x10
      cc2f3a:	89 9c 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],ebx
      cc2f41:	49 8b bd e8 05 00 00 	mov    rdi,QWORD PTR [r13+0x5e8]
      cc2f48:	48 85 ff             	test   rdi,rdi
      cc2f4b:	74 39                	je     cc2f86 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20ff26>
      cc2f4d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc2f50:	ff 90 60 01 00 00    	call   QWORD PTR [rax+0x160]
      cc2f56:	48 63 88 7c 01 00 00 	movsxd rcx,DWORD PTR [rax+0x17c]

#### FDE 0xcd6a8c..0xcd6abe; hit 0xcd6a90: mov    al,BYTE PTR [rsi+0x218]; score=2
      cd6a70:	48 39 d6             	cmp    rsi,rdx
      cd6a73:	48 0f 43 c1          	cmovae rax,rcx
      cd6a77:	c3                   	ret
      cd6a78:	50                   	push   rax
      cd6a79:	e8 42 db d2 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      cd6a7e:	50                   	push   rax
      cd6a7f:	e8 ae 31 00 00       	call   cd9c32 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226bd2>
      cd6a84:	84 c0                	test   al,al
      cd6a86:	0f 94 c0             	sete   al
      cd6a89:	59                   	pop    rcx
      cd6a8a:	c3                   	ret
      cd6a8b:	cc                   	int3
      cd6a8c:	53                   	push   rbx
      cd6a8d:	48 89 fb             	mov    rbx,rdi
      cd6a90:	8a 86 18 02 00 00    	mov    al,BYTE PTR [rsi+0x218]
      cd6a96:	0a 86 58 02 00 00    	or     al,BYTE PTR [rsi+0x258]
      cd6a9c:	74 13                	je     cd6ab1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223a51>
      cd6a9e:	48 81 c6 e0 01 00 00 	add    rsi,0x1e0
      cd6aa5:	48 89 df             	mov    rdi,rbx
      cd6aa8:	e8 99 be ff ff       	call   cd2946 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21f8e6>
      cd6aad:	b0 01                	mov    al,0x1
      cd6aaf:	eb 05                	jmp    cd6ab6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223a56>
      cd6ab1:	c6 03 00             	mov    BYTE PTR [rbx],0x0
      cd6ab4:	31 c0                	xor    eax,eax
      cd6ab6:	88 83 80 00 00 00    	mov    BYTE PTR [rbx+0x80],al
      cd6abc:	5b                   	pop    rbx
      cd6abd:	c3                   	ret
      cd6abe:	80 bf 80 00 00 00 00 	cmp    BYTE PTR [rdi+0x80],0x0
      cd6ac5:	0f 85 1b 3d ff ff    	jne    cca7e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x217786>
      cd6acb:	c3                   	ret
      cd6acc:	55                   	push   rbp
      cd6acd:	41 57                	push   r15
      cd6acf:	41 56                	push   r14
      cd6ad1:	41 55                	push   r13
      cd6ad3:	41 54                	push   r12
      cd6ad5:	53                   	push   rbx
      cd6ad6:	48 81 ec 78 01 00 00 	sub    rsp,0x178
      cd6add:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
      cd6ae2:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      cd6ae7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cd6aee:	00 00 
      cd6af0:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
      cd6af7:	00 

#### FDE 0xcdae32..0xcdb6e9; hit 0xcdb0ea: mov    al,BYTE PTR [rbx+0x218]; score=2
      cdb0b6:	e8 99 06 00 00       	call   cdb754 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2286f4>
      cdb0bb:	be b8 01 00 00       	mov    esi,0x1b8
      cdb0c0:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
      cdb0c4:	4c 01 f6             	add    rsi,r14
      cdb0c7:	e8 88 06 00 00       	call   cdb754 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2286f4>
      cdb0cc:	eb 10                	jmp    cdb0de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22807e>
      cdb0ce:	84 c0                	test   al,al
      cdb0d0:	74 07                	je     cdb0d9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x228079>
      cdb0d2:	e8 4f 08 00 00       	call   cdb926 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2288c6>
      cdb0d7:	eb 05                	jmp    cdb0de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22807e>
      cdb0d9:	e8 24 83 ff ff       	call   cd3402 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2203a2>
      cdb0de:	be e0 01 00 00       	mov    esi,0x1e0
      cdb0e3:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
      cdb0e7:	4c 01 f6             	add    rsi,r14
      cdb0ea:	8a 83 18 02 00 00    	mov    al,BYTE PTR [rbx+0x218]
      cdb0f0:	41 3a 86 18 02 00 00 	cmp    al,BYTE PTR [r14+0x218]
      cdb0f7:	75 1c                	jne    cdb115 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2280b5>
      cdb0f9:	84 c0                	test   al,al
      cdb0fb:	74 28                	je     cdb125 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2280c5>
      cdb0fd:	e8 8e 06 00 00       	call   cdb790 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x228730>
      cdb102:	be f8 01 00 00       	mov    esi,0x1f8
      cdb107:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
      cdb10b:	4c 01 f6             	add    rsi,r14
      cdb10e:	e8 41 06 00 00       	call   cdb754 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2286f4>
      cdb113:	eb 10                	jmp    cdb125 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2280c5>
      cdb115:	84 c0                	test   al,al
      cdb117:	74 07                	je     cdb120 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2280c0>
      cdb119:	e8 1e 08 00 00       	call   cdb93c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2288dc>
      cdb11e:	eb 05                	jmp    cdb125 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2280c5>
      cdb120:	e8 9f 82 ff ff       	call   cd33c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x220364>
      cdb125:	be 20 02 00 00       	mov    esi,0x220
      cdb12a:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
      cdb12e:	4c 01 f6             	add    rsi,r14
      cdb131:	8a 83 58 02 00 00    	mov    al,BYTE PTR [rbx+0x258]
      cdb137:	41 3a 86 58 02 00 00 	cmp    al,BYTE PTR [r14+0x258]
      cdb13e:	75 1c                	jne    cdb15c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2280fc>
      cdb140:	84 c0                	test   al,al
      cdb142:	74 28                	je     cdb16c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22810c>
      cdb144:	e8 47 06 00 00       	call   cdb790 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x228730>
      cdb149:	be 38 02 00 00       	mov    esi,0x238
      cdb14e:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
      cdb152:	4c 01 f6             	add    rsi,r14
      cdb155:	e8 fa 05 00 00       	call   cdb754 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2286f4>

#### FDE 0xcec92c..0xced213; hit 0xceced7: movups XMMWORD PTR [rdi+0x218],xmm0; score=2
      cece87:	0f 11 87 00 02 00 00 	movups XMMWORD PTR [rdi+0x200],xmm0
      cece8e:	48 83 a7 10 02 00 00 	and    QWORD PTR [rdi+0x210],0x0
      cece95:	00 
      cece96:	48 8b 86 00 02 00 00 	mov    rax,QWORD PTR [rsi+0x200]
      cece9d:	48 89 87 00 02 00 00 	mov    QWORD PTR [rdi+0x200],rax
      cecea4:	48 8b 86 08 02 00 00 	mov    rax,QWORD PTR [rsi+0x208]
      ceceab:	48 89 87 08 02 00 00 	mov    QWORD PTR [rdi+0x208],rax
      ceceb2:	48 8b 86 10 02 00 00 	mov    rax,QWORD PTR [rsi+0x210]
      ceceb9:	48 89 87 10 02 00 00 	mov    QWORD PTR [rdi+0x210],rax
      cecec0:	48 83 a6 10 02 00 00 	and    QWORD PTR [rsi+0x210],0x0
      cecec7:	00 
      cecec8:	0f 11 86 00 02 00 00 	movups XMMWORD PTR [rsi+0x200],xmm0
      cececf:	48 83 a7 28 02 00 00 	and    QWORD PTR [rdi+0x228],0x0
      ceced6:	00 
      ceced7:	0f 11 87 18 02 00 00 	movups XMMWORD PTR [rdi+0x218],xmm0
      cecede:	48 8b 86 18 02 00 00 	mov    rax,QWORD PTR [rsi+0x218]
      cecee5:	48 89 87 18 02 00 00 	mov    QWORD PTR [rdi+0x218],rax
      ceceec:	48 8b 86 20 02 00 00 	mov    rax,QWORD PTR [rsi+0x220]
      cecef3:	48 89 87 20 02 00 00 	mov    QWORD PTR [rdi+0x220],rax
      cecefa:	48 8b 86 28 02 00 00 	mov    rax,QWORD PTR [rsi+0x228]
      cecf01:	48 89 87 28 02 00 00 	mov    QWORD PTR [rdi+0x228],rax
      cecf08:	0f 11 86 18 02 00 00 	movups XMMWORD PTR [rsi+0x218],xmm0
      cecf0f:	48 83 a6 28 02 00 00 	and    QWORD PTR [rsi+0x228],0x0
      cecf16:	00 
      cecf17:	0f 11 87 30 02 00 00 	movups XMMWORD PTR [rdi+0x230],xmm0
      cecf1e:	48 83 a7 40 02 00 00 	and    QWORD PTR [rdi+0x240],0x0
      cecf25:	00 
      cecf26:	48 8b 86 30 02 00 00 	mov    rax,QWORD PTR [rsi+0x230]
      cecf2d:	48 89 87 30 02 00 00 	mov    QWORD PTR [rdi+0x230],rax
      cecf34:	48 8b 86 38 02 00 00 	mov    rax,QWORD PTR [rsi+0x238]
      cecf3b:	48 89 87 38 02 00 00 	mov    QWORD PTR [rdi+0x238],rax
      cecf42:	48 8b 86 40 02 00 00 	mov    rax,QWORD PTR [rsi+0x240]
      cecf49:	48 89 87 40 02 00 00 	mov    QWORD PTR [rdi+0x240],rax
      cecf50:	48 83 a6 40 02 00 00 	and    QWORD PTR [rsi+0x240],0x0
      cecf57:	00 
      cecf58:	0f 11 86 30 02 00 00 	movups XMMWORD PTR [rsi+0x230],xmm0
      cecf5f:	48 83 a7 58 02 00 00 	and    QWORD PTR [rdi+0x258],0x0
      cecf66:	00 
      cecf67:	0f 11 87 48 02 00 00 	movups XMMWORD PTR [rdi+0x248],xmm0
      cecf6e:	48 8b 86 48 02 00 00 	mov    rax,QWORD PTR [rsi+0x248]
      cecf75:	48 89 87 48 02 00 00 	mov    QWORD PTR [rdi+0x248],rax
      cecf7c:	48 8b 86 50 02 00 00 	mov    rax,QWORD PTR [rsi+0x250]
      cecf83:	48 89 87 50 02 00 00 	mov    QWORD PTR [rdi+0x250],rax

#### FDE 0xcf4a34..0xcf4fa6; hit 0xcf4d91: mov    rdi,QWORD PTR [rbx+0x218]; score=2
      cf4d3d:	48 8b bb c0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2c0]
      cf4d44:	e8 97 f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4d49:	48 8b bb a8 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2a8]
      cf4d50:	e8 8b f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4d55:	48 8b bb 90 02 00 00 	mov    rdi,QWORD PTR [rbx+0x290]
      cf4d5c:	e8 7f f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4d61:	48 8b bb 78 02 00 00 	mov    rdi,QWORD PTR [rbx+0x278]
      cf4d68:	e8 73 f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4d6d:	48 8b bb 60 02 00 00 	mov    rdi,QWORD PTR [rbx+0x260]
      cf4d74:	e8 67 f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4d79:	48 8b bb 48 02 00 00 	mov    rdi,QWORD PTR [rbx+0x248]
      cf4d80:	e8 5b f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4d85:	48 8b bb 30 02 00 00 	mov    rdi,QWORD PTR [rbx+0x230]
      cf4d8c:	e8 4f f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4d91:	48 8b bb 18 02 00 00 	mov    rdi,QWORD PTR [rbx+0x218]
      cf4d98:	e8 43 f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4d9d:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
      cf4da4:	e8 37 f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4da9:	48 8b bb e8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1e8]
      cf4db0:	e8 2b f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4db5:	48 8b bb d0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1d0]
      cf4dbc:	e8 1f f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4dc1:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]
      cf4dc8:	e8 13 f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4dcd:	48 8b bb a0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1a0]
      cf4dd4:	e8 07 f0 e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4dd9:	48 8b bb 88 01 00 00 	mov    rdi,QWORD PTR [rbx+0x188]
      cf4de0:	e8 fb ef e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4de5:	48 8b bb 70 01 00 00 	mov    rdi,QWORD PTR [rbx+0x170]
      cf4dec:	e8 ef ef e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4df1:	48 8b bb 58 01 00 00 	mov    rdi,QWORD PTR [rbx+0x158]
      cf4df8:	e8 e3 ef e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4dfd:	48 8b bb 40 01 00 00 	mov    rdi,QWORD PTR [rbx+0x140]
      cf4e04:	e8 d7 ef e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4e09:	48 8b bb 28 01 00 00 	mov    rdi,QWORD PTR [rbx+0x128]
      cf4e10:	e8 cb ef e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4e15:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
      cf4e1c:	e8 bf ef e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4e21:	48 8b bb f8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xf8]
      cf4e28:	e8 b3 ef e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4e2d:	48 8b bb e0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe0]
      cf4e34:	e8 a7 ef e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf4e39:	48 8b bb c8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc8]

#### FDE 0xcf5004..0xcf51ce; hit 0xcf50c8: mov    rdi,QWORD PTR [rbx+0x218]; score=2
      cf5074:	48 8b bb c0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2c0]
      cf507b:	e8 60 ed e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf5080:	48 8b bb a8 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2a8]
      cf5087:	e8 54 ed e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf508c:	48 8b bb 90 02 00 00 	mov    rdi,QWORD PTR [rbx+0x290]
      cf5093:	e8 48 ed e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf5098:	48 8b bb 78 02 00 00 	mov    rdi,QWORD PTR [rbx+0x278]
      cf509f:	e8 3c ed e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf50a4:	48 8b bb 60 02 00 00 	mov    rdi,QWORD PTR [rbx+0x260]
      cf50ab:	e8 30 ed e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf50b0:	48 8b bb 48 02 00 00 	mov    rdi,QWORD PTR [rbx+0x248]
      cf50b7:	e8 24 ed e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf50bc:	48 8b bb 30 02 00 00 	mov    rdi,QWORD PTR [rbx+0x230]
      cf50c3:	e8 18 ed e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf50c8:	48 8b bb 18 02 00 00 	mov    rdi,QWORD PTR [rbx+0x218]
      cf50cf:	e8 0c ed e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf50d4:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
      cf50db:	e8 00 ed e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf50e0:	48 8b bb e8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1e8]
      cf50e7:	e8 f4 ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf50ec:	48 8b bb d0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1d0]
      cf50f3:	e8 e8 ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf50f8:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]
      cf50ff:	e8 dc ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf5104:	48 8b bb a0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1a0]
      cf510b:	e8 d0 ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf5110:	48 8b bb 88 01 00 00 	mov    rdi,QWORD PTR [rbx+0x188]
      cf5117:	e8 c4 ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf511c:	48 8b bb 70 01 00 00 	mov    rdi,QWORD PTR [rbx+0x170]
      cf5123:	e8 b8 ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf5128:	48 8b bb 58 01 00 00 	mov    rdi,QWORD PTR [rbx+0x158]
      cf512f:	e8 ac ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf5134:	48 8b bb 40 01 00 00 	mov    rdi,QWORD PTR [rbx+0x140]
      cf513b:	e8 a0 ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf5140:	48 8b bb 28 01 00 00 	mov    rdi,QWORD PTR [rbx+0x128]
      cf5147:	e8 94 ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf514c:	48 8b bb 10 01 00 00 	mov    rdi,QWORD PTR [rbx+0x110]
      cf5153:	e8 88 ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf5158:	48 8b bb f8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xf8]
      cf515f:	e8 7c ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf5164:	48 8b bb e0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe0]
      cf516b:	e8 70 ec e3 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      cf5170:	48 8b bb c8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc8]

#### FDE 0xcf78ec..0xcf7a1f; hit 0xcf7921: mov    r15,QWORD PTR [rax+0x218]; score=2
      cf78f2:	53                   	push   rbx
      cf78f3:	48 83 ec 18          	sub    rsp,0x18
      cf78f7:	49 89 cf             	mov    r15,rcx
      cf78fa:	49 89 d6             	mov    r14,rdx
      cf78fd:	48 89 fb             	mov    rbx,rdi
      cf7900:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cf7907:	00 00 
      cf7909:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      cf790e:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
      cf7912:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
      cf7916:	6a 43                	push   0x43
      cf7918:	5a                   	pop    rdx
      cf7919:	e8 c0 a9 e6 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      cf791e:	49 8b 07             	mov    rax,QWORD PTR [r15]
      cf7921:	4c 8b b8 18 02 00 00 	mov    r15,QWORD PTR [rax+0x218]
      cf7928:	4d 85 ff             	test   r15,r15
      cf792b:	0f 84 aa 00 00 00    	je     cf79db <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24497b>
      cf7931:	4d 8b b6 38 01 00 00 	mov    r14,QWORD PTR [r14+0x138]
      cf7938:	49 8b 07             	mov    rax,QWORD PTR [r15]
      cf793b:	4c 89 ff             	mov    rdi,r15
      cf793e:	ff 50 28             	call   QWORD PTR [rax+0x28]
      cf7941:	49 89 c4             	mov    r12,rax
      cf7944:	49 8b 07             	mov    rax,QWORD PTR [r15]
      cf7947:	4c 89 ff             	mov    rdi,r15
      cf794a:	ff 50 30             	call   QWORD PTR [rax+0x30]
      cf794d:	49 89 c7             	mov    r15,rax
      cf7950:	6a 10                	push   0x10
      cf7952:	5f                   	pop    rdi
      cf7953:	e8 a8 65 af 00       	call   17edf00 <_Znwm@plt>
      cf7958:	4c 89 20             	mov    QWORD PTR [rax],r12
      cf795b:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
      cf795f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      cf7964:	6a 40                	push   0x40
      cf7966:	5f                   	pop    rdi
      cf7967:	e8 94 65 af 00       	call   17edf00 <_Znwm@plt>
      cf796c:	49 89 c7             	mov    r15,rax
      cf796f:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      cf7973:	48 8d 05 6e 98 b7 00 	lea    rax,[rip+0xb7986e]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
      cf797a:	49 89 07             	mov    QWORD PTR [r15],rax
      cf797d:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
      cf7982:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      cf7986:	48 8d 05 d7 4a d8 ff 	lea    rax,[rip+0xffffffffffd84ad7]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      cf798d:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax

#### FDE 0xd077d6..0xd090fa; hit 0xd07e7b: movdqu XMMWORD PTR [r12+0x218],xmm0; score=2
      d07e41:	41 88 9c 24 38 02 00 	mov    BYTE PTR [r12+0x238],bl
      d07e48:	00 
      d07e49:	41 88 9c 24 40 02 00 	mov    BYTE PTR [r12+0x240],bl
      d07e50:	00 
      d07e51:	49 8d 84 24 48 02 00 	lea    rax,[r12+0x248]
      d07e58:	00 
      d07e59:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      d07e5e:	49 83 a4 24 48 02 00 	and    QWORD PTR [r12+0x248],0x0
      d07e65:	00 00 
      d07e67:	41 88 9c 24 50 02 00 	mov    BYTE PTR [r12+0x250],bl
      d07e6e:	00 
      d07e6f:	49 8d bc 24 58 02 00 	lea    rdi,[r12+0x258]
      d07e76:	00 
      d07e77:	66 0f ef c0          	pxor   xmm0,xmm0
      d07e7b:	f3 41 0f 7f 84 24 18 	movdqu XMMWORD PTR [r12+0x218],xmm0
      d07e82:	02 00 00 
      d07e85:	f3 41 0f 7f 84 24 24 	movdqu XMMWORD PTR [r12+0x224],xmm0
      d07e8c:	02 00 00 
      d07e8f:	48 89 bc 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rdi
      d07e96:	00 
      d07e97:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
      d07e9b:	4c 89 f6             	mov    rsi,r14
      d07e9e:	e8 1f 98 ab 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      d07ea3:	49 8d bc 24 68 02 00 	lea    rdi,[r12+0x268]
      d07eaa:	00 
      d07eab:	48 89 bc 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rdi
      d07eb2:	00 
      d07eb3:	4c 89 f6             	mov    rsi,r14
      d07eb6:	e8 07 98 ab 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      d07ebb:	49 8d bc 24 78 02 00 	lea    rdi,[r12+0x278]
      d07ec2:	00 
      d07ec3:	48 89 bc 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rdi
      d07eca:	00 
      d07ecb:	4c 89 f6             	mov    rsi,r14
      d07ece:	e8 ef 97 ab 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      d07ed3:	49 8d bc 24 88 02 00 	lea    rdi,[r12+0x288]
      d07eda:	00 
      d07edb:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
      d07ee2:	00 
      d07ee3:	4c 89 f6             	mov    rsi,r14
      d07ee6:	e8 d7 97 ab 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      d07eeb:	49 8d bc 24 98 02 00 	lea    rdi,[r12+0x298]
      d07ef2:	00 

#### FDE 0xd15094..0xd15b30; hit 0xd15285: mov    rcx,QWORD PTR [rbx+0x218]; score=2
      d15245:	b8 ff ff ff ff       	mov    eax,0xffffffff
      d1524a:	48 89 41 98          	mov    QWORD PTR [rcx-0x68],rax
      d1524e:	48 83 61 a0 00       	and    QWORD PTR [rcx-0x60],0x0
      d15253:	c6 41 a8 00          	mov    BYTE PTR [rcx-0x58],0x0
      d15257:	48 83 61 dc 00       	and    QWORD PTR [rcx-0x24],0x0
      d1525c:	0f 11 41 ac          	movups XMMWORD PTR [rcx-0x54],xmm0
      d15260:	0f 11 41 c0          	movups XMMWORD PTR [rcx-0x40],xmm0
      d15264:	0f 11 41 c9          	movups XMMWORD PTR [rcx-0x37],xmm0
      d15268:	48 89 49 e8          	mov    QWORD PTR [rcx-0x18],rcx
      d1526c:	48 b8 00 00 00 00 04 	movabs rax,0x400000000
      d15273:	00 00 00 
      d15276:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
      d1527a:	83 61 f8 00          	and    DWORD PTR [rcx-0x8],0x0
      d1527e:	83 a1 28 ff ff ff 00 	and    DWORD PTR [rcx-0xd8],0x0
      d15285:	48 8b 8b 18 02 00 00 	mov    rcx,QWORD PTR [rbx+0x218]
      d1528c:	48 89 1c 24          	mov    QWORD PTR [rsp],rbx
      d15290:	48 39 8b 20 02 00 00 	cmp    QWORD PTR [rbx+0x220],rcx
      d15297:	0f 84 87 03 00 00    	je     d15624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2625c4>
      d1529d:	4c 8d ac 24 d0 01 00 	lea    r13,[rsp+0x1d0]
      d152a4:	00 
      d152a5:	45 31 f6             	xor    r14d,r14d
      d152a8:	31 d2                	xor    edx,edx
      d152aa:	31 db                	xor    ebx,ebx
      d152ac:	48 6b c2 30          	imul   rax,rdx,0x30
      d152b0:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      d152b5:	48 8b 3c 01          	mov    rdi,QWORD PTR [rcx+rax*1]
      d152b9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d152bc:	ff 50 60             	call   QWORD PTR [rax+0x60]
      d152bf:	49 89 c4             	mov    r12,rax
      d152c2:	48 8b 00             	mov    rax,QWORD PTR [rax]
      d152c5:	4c 89 e7             	mov    rdi,r12
      d152c8:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      d152ce:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      d152d1:	48 3b 48 08          	cmp    rcx,QWORD PTR [rax+0x8]
      d152d5:	0f 84 1e 03 00 00    	je     d155f9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262599>
      d152db:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
      d152e2:	00 
      d152e3:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
      d152ea:	00 
      d152eb:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d152ee:	4c 89 e6             	mov    rsi,r12
      d152f1:	48 83 c6 50          	add    rsi,0x50
      d152f5:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]

#### FDE 0xd15f12..0xd15f97; hit 0xd15f35: mov    r14,QWORD PTR [rbx+0x218]; score=2
      d15f0c:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d15f10:	c3                   	ret
      d15f11:	cc                   	int3
      d15f12:	41 57                	push   r15
      d15f14:	41 56                	push   r14
      d15f16:	41 55                	push   r13
      d15f18:	41 54                	push   r12
      d15f1a:	53                   	push   rbx
      d15f1b:	48 83 ec 10          	sub    rsp,0x10
      d15f1f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d15f26:	00 00 
      d15f28:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d15f2d:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
      d15f31:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
      d15f35:	4c 8b b3 18 02 00 00 	mov    r14,QWORD PTR [rbx+0x218]
      d15f3c:	4c 8b ab 20 02 00 00 	mov    r13,QWORD PTR [rbx+0x220]
      d15f43:	4d 39 ee             	cmp    r14,r13
      d15f46:	74 24                	je     d15f6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262f0c>
      d15f48:	4c 8d 3d 49 00 00 00 	lea    r15,[rip+0x49]        # d15f98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262f38>
      d15f4f:	49 89 e4             	mov    r12,rsp
      d15f52:	48 89 df             	mov    rdi,rbx
      d15f55:	4c 89 f6             	mov    rsi,r14
      d15f58:	4c 89 e2             	mov    rdx,r12
      d15f5b:	4c 89 f9             	mov    rcx,r15
      d15f5e:	e8 4f 00 00 00       	call   d15fb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262f52>
      d15f63:	49 83 c6 30          	add    r14,0x30
      d15f67:	4d 39 ee             	cmp    r14,r13
      d15f6a:	75 e6                	jne    d15f52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262ef2>
      d15f6c:	48 89 df             	mov    rdi,rbx
      d15f6f:	e8 2c 01 00 00       	call   d160a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263040>
      d15f74:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d15f7b:	00 00 
      d15f7d:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
      d15f82:	75 0e                	jne    d15f92 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262f32>
      d15f84:	48 83 c4 10          	add    rsp,0x10
      d15f88:	5b                   	pop    rbx
      d15f89:	41 5c                	pop    r12
      d15f8b:	41 5d                	pop    r13
      d15f8d:	41 5e                	pop    r14
      d15f8f:	41 5f                	pop    r15
      d15f91:	c3                   	ret
      d15f92:	e8 19 9b ad 00       	call   17efab0 <__stack_chk_fail@plt>
      d15f97:	cc                   	int3

#### FDE 0xd16c08..0xd16e17; hit 0xd16cac: mov    rcx,QWORD PTR [rbx+0x218]; score=2
      d16c7d:	4c 89 fe             	mov    rsi,r15
      d16c80:	e8 a7 cd 00 00       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
      d16c85:	4c 89 ff             	mov    rdi,r15
      d16c88:	e8 03 72 ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d16c8d:	44 89 ee             	mov    esi,r13d
      d16c90:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
      d16c93:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
      d16c97:	48 29 c8             	sub    rax,rcx
      d16c9a:	48 99                	cqo
      d16c9c:	49 f7 fc             	idiv   r12
      d16c9f:	41 ff c5             	inc    r13d
      d16ca2:	48 39 f0             	cmp    rax,rsi
      d16ca5:	77 c4                	ja     d16c6b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263c0b>
      d16ca7:	83 64 24 08 00       	and    DWORD PTR [rsp+0x8],0x0
      d16cac:	48 8b 8b 18 02 00 00 	mov    rcx,QWORD PTR [rbx+0x218]
      d16cb3:	48 39 8b 20 02 00 00 	cmp    QWORD PTR [rbx+0x220],rcx
      d16cba:	0f 84 bb 00 00 00    	je     d16d7b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263d1b>
      d16cc0:	45 31 ed             	xor    r13d,r13d
      d16cc3:	49 6b c5 30          	imul   rax,r13,0x30
      d16cc7:	48 8b 3c 01          	mov    rdi,QWORD PTR [rcx+rax*1]
      d16ccb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d16cce:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      d16cd4:	4c 8b 20             	mov    r12,QWORD PTR [rax]
      d16cd7:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      d16cdb:	4d 39 fc             	cmp    r12,r15
      d16cde:	74 62                	je     d16d42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263ce2>
      d16ce0:	31 ed                	xor    ebp,ebp
      d16ce2:	41 89 ee             	mov    r14d,ebp
      d16ce5:	40 b5 01             	mov    bpl,0x1
      d16ce8:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
      d16cee:	75 44                	jne    d16d34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263cd4>
      d16cf0:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      d16cf5:	4c 89 e6             	mov    rsi,r12
      d16cf8:	e8 55 c7 f1 ff       	call   c33452 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1803f2>
      d16cfd:	84 c0                	test   al,al
      d16cff:	74 33                	je     d16d34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263cd4>
      d16d01:	48 89 df             	mov    rdi,rbx
      d16d04:	4c 89 e6             	mov    rsi,r12
      d16d07:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]
      d16d0b:	e8 92 cc 00 00       	call   d239a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270942>
      d16d10:	48 89 df             	mov    rdi,rbx
      d16d13:	4c 89 e6             	mov    rsi,r12
      d16d16:	e8 4f ca 00 00       	call   d2376a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27070a>

#### FDE 0xd16e18..0xd16f87; hit 0xd16e47: mov    rcx,QWORD PTR [rdi+0x218]; score=2
      d16e18:	55                   	push   rbp
      d16e19:	41 57                	push   r15
      d16e1b:	41 56                	push   r14
      d16e1d:	41 55                	push   r13
      d16e1f:	41 54                	push   r12
      d16e21:	53                   	push   rbx
      d16e22:	48 83 ec 38          	sub    rsp,0x38
      d16e26:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d16e2d:	00 00 
      d16e2f:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      d16e34:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
      d16e3a:	0f 57 c0             	xorps  xmm0,xmm0
      d16e3d:	83 64 24 0c 00       	and    DWORD PTR [rsp+0xc],0x0
      d16e42:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      d16e47:	48 8b 8f 18 02 00 00 	mov    rcx,QWORD PTR [rdi+0x218]
      d16e4e:	48 39 8f 20 02 00 00 	cmp    QWORD PTR [rdi+0x220],rcx
      d16e55:	0f 84 d3 00 00 00    	je     d16f2e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263ece>
      d16e5b:	89 f5                	mov    ebp,esi
      d16e5d:	48 89 fb             	mov    rbx,rdi
      d16e60:	31 f6                	xor    esi,esi
      d16e62:	6a 30                	push   0x30
      d16e64:	41 5d                	pop    r13
      d16e66:	48 6b c6 30          	imul   rax,rsi,0x30
      d16e6a:	48 8b 3c 01          	mov    rdi,QWORD PTR [rcx+rax*1]
      d16e6e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d16e71:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      d16e77:	4c 8b 20             	mov    r12,QWORD PTR [rax]
      d16e7a:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      d16e7e:	4d 39 f4             	cmp    r12,r14
      d16e81:	74 55                	je     d16ed8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263e78>
      d16e83:	45 31 ff             	xor    r15d,r15d
      d16e86:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
      d16e8c:	74 0e                	je     d16e9c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263e3c>
      d16e8e:	49 83 c4 30          	add    r12,0x30
      d16e92:	41 b7 01             	mov    r15b,0x1
      d16e95:	4d 39 f4             	cmp    r12,r14
      d16e98:	75 ec                	jne    d16e86 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263e26>
      d16e9a:	eb 4b                	jmp    d16ee7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263e87>
      d16e9c:	48 89 df             	mov    rdi,rbx
      d16e9f:	4c 89 e6             	mov    rsi,r12
      d16ea2:	89 ea                	mov    edx,ebp
      d16ea4:	e8 f9 ca 00 00       	call   d239a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x270942>
      d16ea9:	48 89 df             	mov    rdi,rbx

#### FDE 0xd1710c..0xd17212; hit 0xd17160: mov    r15,QWORD PTR [rbx+0x218]; score=2
      d1712d:	00 
      d1712e:	0f 57 c0             	xorps  xmm0,xmm0
      d17131:	48 89 e7             	mov    rdi,rsp
      d17134:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
      d17138:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      d1713b:	c7 47 20 00 00 80 3f 	mov    DWORD PTR [rdi+0x20],0x3f800000
      d17142:	48 8b 83 20 02 00 00 	mov    rax,QWORD PTR [rbx+0x220]
      d17149:	48 2b 83 18 02 00 00 	sub    rax,QWORD PTR [rbx+0x218]
      d17150:	6a 30                	push   0x30
      d17152:	59                   	pop    rcx
      d17153:	48 99                	cqo
      d17155:	48 f7 f9             	idiv   rcx
      d17158:	48 89 c6             	mov    rsi,rax
      d1715b:	e8 92 8a f3 ff       	call   c4fbf2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb92>
      d17160:	4c 8b bb 18 02 00 00 	mov    r15,QWORD PTR [rbx+0x218]
      d17167:	4c 8b a3 20 02 00 00 	mov    r12,QWORD PTR [rbx+0x220]
      d1716e:	4d 39 e7             	cmp    r15,r12
      d17171:	74 32                	je     d171a5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264145>
      d17173:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
      d17178:	49 89 e6             	mov    r14,rsp
      d1717b:	49 8b 37             	mov    rsi,QWORD PTR [r15]
      d1717e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      d17181:	48 89 df             	mov    rdi,rbx
      d17184:	31 d2                	xor    edx,edx
      d17186:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d17189:	4c 89 f7             	mov    rdi,r14
      d1718c:	48 89 de             	mov    rsi,rbx
      d1718f:	e8 26 a0 f3 ff       	call   c511ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e15a>
      d17194:	48 89 df             	mov    rdi,rbx
      d17197:	e8 92 e1 9a 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d1719c:	49 83 c7 30          	add    r15,0x30
      d171a0:	4d 39 e7             	cmp    r15,r12
      d171a3:	75 d6                	jne    d1717b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26411b>
      d171a5:	48 89 e7             	mov    rdi,rsp
      d171a8:	48 8b 5f 18          	mov    rbx,QWORD PTR [rdi+0x18]
      d171ac:	e8 67 bc ef ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
      d171b1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d171b8:	00 00 
      d171ba:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
      d171c1:	00 
      d171c2:	75 49                	jne    d1720d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2641ad>
      d171c4:	48 89 d8             	mov    rax,rbx
      d171c7:	48 81 c4 88 00 00 00 	add    rsp,0x88

#### FDE 0xd1721a..0xd17261; hit 0xd17227: mov    rcx,QWORD PTR [rdi+0x218]; score=2
      d171ea:	48 89 e7             	mov    rdi,rsp
      d171ed:	e8 26 bc ef ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
      d171f2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d171f9:	00 00 
      d171fb:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
      d17202:	00 
      d17203:	75 08                	jne    d1720d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2641ad>
      d17205:	48 89 df             	mov    rdi,rbx
      d17208:	e8 c3 8a d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d1720d:	e8 9e 88 ad 00       	call   17efab0 <__stack_chk_fail@plt>
      d17212:	48 8d 87 18 02 00 00 	lea    rax,[rdi+0x218]
      d17219:	c3                   	ret
      d1721a:	48 8b 87 38 02 00 00 	mov    rax,QWORD PTR [rdi+0x238]
      d17221:	8a 97 40 02 00 00    	mov    dl,BYTE PTR [rdi+0x240]
      d17227:	48 8b 8f 18 02 00 00 	mov    rcx,QWORD PTR [rdi+0x218]
      d1722e:	48 8b b7 20 02 00 00 	mov    rsi,QWORD PTR [rdi+0x220]
      d17235:	48 39 f1             	cmp    rcx,rsi
      d17238:	74 26                	je     d17260 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264200>
      d1723a:	6a 01                	push   0x1
      d1723c:	5f                   	pop    rdi
      d1723d:	4c 8b 41 10          	mov    r8,QWORD PTR [rcx+0x10]
      d17241:	4c 39 c0             	cmp    rax,r8
      d17244:	49 0f 4e c0          	cmovle rax,r8
      d17248:	84 d2                	test   dl,dl
      d1724a:	49 0f 44 c0          	cmove  rax,r8
      d1724e:	0f b6 d2             	movzx  edx,dl
      d17251:	80 fa 02             	cmp    dl,0x2
      d17254:	0f 42 d7             	cmovb  edx,edi
      d17257:	48 83 c1 30          	add    rcx,0x30
      d1725b:	48 39 f1             	cmp    rcx,rsi
      d1725e:	75 dd                	jne    d1723d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2641dd>
      d17260:	c3                   	ret
      d17261:	cc                   	int3
      d17262:	55                   	push   rbp
      d17263:	41 57                	push   r15
      d17265:	41 56                	push   r14
      d17267:	41 54                	push   r12
      d17269:	53                   	push   rbx
      d1726a:	48 83 ec 20          	sub    rsp,0x20
      d1726e:	48 89 fb             	mov    rbx,rdi
      d17271:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d17278:	00 00 
      d1727a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax

#### FDE 0xd17262..0xd1734a; hit 0xd1728a: mov    rcx,QWORD PTR [rsi+0x218]; score=2
      d17261:	cc                   	int3
      d17262:	55                   	push   rbp
      d17263:	41 57                	push   r15
      d17265:	41 56                	push   r14
      d17267:	41 54                	push   r12
      d17269:	53                   	push   rbx
      d1726a:	48 83 ec 20          	sub    rsp,0x20
      d1726e:	48 89 fb             	mov    rbx,rdi
      d17271:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d17278:	00 00 
      d1727a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      d1727f:	0f 57 c0             	xorps  xmm0,xmm0
      d17282:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d17287:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      d1728a:	48 8b 8e 18 02 00 00 	mov    rcx,QWORD PTR [rsi+0x218]
      d17291:	48 39 8e 20 02 00 00 	cmp    QWORD PTR [rsi+0x220],rcx
      d17298:	74 5e                	je     d172f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264298>
      d1729a:	49 89 f6             	mov    r14,rsi
      d1729d:	6a 01                	push   0x1
      d1729f:	5d                   	pop    rbp
      d172a0:	31 f6                	xor    esi,esi
      d172a2:	49 89 e7             	mov    r15,rsp
      d172a5:	6a 30                	push   0x30
      d172a7:	41 5c                	pop    r12
      d172a9:	48 6b d6 30          	imul   rdx,rsi,0x30
      d172ad:	48 8b 44 11 08       	mov    rax,QWORD PTR [rcx+rdx*1+0x8]
      d172b2:	0f 10 04 11          	movups xmm0,XMMWORD PTR [rcx+rdx*1]
      d172b6:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      d172ba:	48 85 c0             	test   rax,rax
      d172bd:	74 05                	je     d172c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264264>
      d172bf:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      d172c4:	48 89 df             	mov    rdi,rbx
      d172c7:	4c 89 fe             	mov    rsi,r15
      d172ca:	e8 6b c5 00 00       	call   d2383a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2707da>
      d172cf:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d172d4:	e8 ad 71 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d172d9:	89 ee                	mov    esi,ebp
      d172db:	49 8b 8e 18 02 00 00 	mov    rcx,QWORD PTR [r14+0x218]
      d172e2:	49 8b 86 20 02 00 00 	mov    rax,QWORD PTR [r14+0x220]
      d172e9:	48 29 c8             	sub    rax,rcx
      d172ec:	48 99                	cqo
      d172ee:	49 f7 fc             	idiv   r12
      d172f1:	ff c5                	inc    ebp

#### FDE 0xd174c2..0xd17a62; hit 0xd177e9: mov    rcx,QWORD PTR [rbx+0x218]; score=2
      d177ae:	4d 85 ed             	test   r13,r13
      d177b1:	74 10                	je     d177c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264763>
      d177b3:	4d 89 ee             	mov    r14,r13
      d177b6:	4c 3b ab 00 04 00 00 	cmp    r13,QWORD PTR [rbx+0x400]
      d177bd:	0f 85 66 ff ff ff    	jne    d17729 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2646c9>
      d177c3:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      d177ca:	00 
      d177cb:	e8 c0 66 ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d177d0:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
      d177d7:	00 00 
      d177d9:	0f 57 c0             	xorps  xmm0,xmm0
      d177dc:	83 64 24 68 00       	and    DWORD PTR [rsp+0x68],0x0
      d177e1:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      d177e8:	00 
      d177e9:	48 8b 8b 18 02 00 00 	mov    rcx,QWORD PTR [rbx+0x218]
      d177f0:	48 39 8b 20 02 00 00 	cmp    QWORD PTR [rbx+0x220],rcx
      d177f7:	0f 84 a9 00 00 00    	je     d178a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264846>
      d177fd:	31 ed                	xor    ebp,ebp
      d177ff:	4c 8d 7c 24 68       	lea    r15,[rsp+0x68]
      d17804:	6a 30                	push   0x30
      d17806:	41 5d                	pop    r13
      d17808:	48 6b c5 30          	imul   rax,rbp,0x30
      d1780c:	48 8b 3c 01          	mov    rdi,QWORD PTR [rcx+rax*1]
      d17810:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d17813:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      d17819:	4c 8b 20             	mov    r12,QWORD PTR [rax]
      d1781c:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      d17820:	4d 39 f4             	cmp    r12,r14
      d17823:	74 2c                	je     d17851 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2647f1>
      d17825:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
      d1782b:	75 34                	jne    d17861 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264801>
      d1782d:	48 89 df             	mov    rdi,rbx
      d17830:	4c 89 e6             	mov    rsi,r12
      d17833:	e8 32 bf 00 00       	call   d2376a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27070a>
      d17838:	84 c0                	test   al,al
      d1783a:	75 25                	jne    d17861 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264801>
      d1783c:	48 89 df             	mov    rdi,rbx
      d1783f:	4c 89 e6             	mov    rsi,r12
      d17842:	e8 55 ad 00 00       	call   d2259c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26f53c>
      d17847:	49 83 c4 30          	add    r12,0x30
      d1784b:	84 c0                	test   al,al
      d1784d:	74 d1                	je     d17820 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2647c0>
      d1784f:	eb 10                	jmp    d17861 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x264801>

### Candidate constructor FDEs: stores into dependency first word

## Candidate address point 0x1821448
- +0x28 = 0xb7d2ca
- return shape = delegated

### Candidate vtable slots
- +0x0: 0xcf938a FDE=(13603722, 13603740)
- +0x8: 0xcf939c FDE=(13603740, 13604278)
- +0x10: 0xcf95b6 FDE=(13604278, 13604286)
- +0x18: 0xbd7a10 FDE=(12417552, 12417566)
- +0x20: 0xcf95be FDE=(13604286, 13608751)
- +0x28: 0xb7d2ca FDE=(12047050, 12047060)
- +0x30: 0xbd7f6a FDE=(12418922, 12418932)
- +0x38: 0xcfa730 FDE=(13608752, 13608949)
- +0x40: 0xbd7fd2 FDE=(12419026, 12419036)
- +0x48: 0xbd7fdc FDE=(12419036, 12419049)
- +0x50: 0xbd7fea FDE=(12419050, 12419063)
- +0x58: 0xbd7ff8 FDE=(12419064, 12419083)
- +0x60: 0xbd800c FDE=(12419084, 12419094)
- +0x68: 0x123a2d8 FDE=(19112664, 19112674)
- +0x70: 0xbd8086 FDE=(12419206, 12419216)
- +0x78: 0x13a6e50 FDE=(20606544, 20606560)
- +0x80: 0xab5b36 FDE=(11230006, 11230022)
- +0x88: 0xab5b46 FDE=(11230022, 11230038)
- +0x90: 0xbd80cc FDE=(12419276, 12419292)
- +0x98: 0xbd80dc FDE=(12419292, 12419305)
- +0xa0: 0xcfa7f6 FDE=(13608950, 13608981)
- +0xa8: 0xbd8104 FDE=(12419332, 12419345)
- +0xb0: 0xbd8112 FDE=(12419346, 12419359)
- +0xb8: 0xbd8120 FDE=(12419360, 12419382)
- +0xc0: 0x9d81d0 FDE=(10322384, 10322387)

### Materializations of candidate vptr (0 direct comment refs)

## Candidate address point 0x1822988
- +0x28 = 0xd1a440
- return shape = conditional

### Candidate vtable slots
- +0x0: 0xd18812 FDE=(13731858, 13738390)
- +0x8: 0xd1a196 FDE=(13738390, 13738411)
- +0x10: 0xd1a1ac FDE=(13738412, 13738433)
- +0x18: 0xd1a1c2 FDE=(13738434, 13738677)
- +0x20: 0xd1a2b6 FDE=(13738678, 13739072)
- +0x28: 0xd1a440 FDE=(13739072, 13739108)
- +0x30: 0xaf6576 FDE=(11494774, 11494779)
- +0x38: 0xd1a464 FDE=(13739108, 13741320)
- +0x40: 0xd1ad08 FDE=(13741320, 13741342)
- +0x48: 0xd1ad1e FDE=(13741342, 13743096)
- +0x50: 0xd1b3f8 FDE=(13743096, 13743334)
- +0x58: 0xd1b4e6 FDE=(13743334, 13743493)
- +0x60: 0xd1b586 FDE=(13743494, 13743689)
- +0x68: 0xd1b64a FDE=(13743690, 13743867)
- +0x70: 0xd1b6fc FDE=(13743868, 13744048)
- +0x78: 0xb00674 FDE=(11535988, 11535993)
- +0x80: 0xd1b7b0 FDE=(13744048, 13744056)
- +0x88: 0xd1b7b8 FDE=(13744056, 13744064)
- +0x90: 0xc44ec4 FDE=(12865220, 12865228)
- +0x98: 0xd1b7c0 FDE=(13744064, 13744072)
- +0xa0: 0xd1b7c8 FDE=(13744072, 13744202)
- +0xa8: 0xfffffffffffffff8 FDE=None
- +0xb0: 0x0 FDE=None
- +0xb8: 0xd1b84a FDE=(13744202, 13744211)
- +0xc0: 0xd1b854 FDE=(13744212, 13744221)

### Materializations of candidate vptr (0 direct comment refs)

## Candidate address point 0x181f788
- +0x28 = 0xcc4eea
- return shape = field this+0x5e0

### Candidate vtable slots
- +0x0: 0xcc4b7a FDE=(13388666, 13388809)
- +0x8: 0xcc4c0a FDE=(13388810, 13388818)
- +0x10: 0xcc4c12 FDE=(13388818, 13389388)
- +0x18: 0xcc4e4c FDE=(13389388, 13389497)
- +0x20: 0xcc4eba FDE=(13389498, 13389546)
- +0x28: 0xcc4eea FDE=(13389546, 13389554)
- +0x30: 0xcc4eea FDE=(13389546, 13389554)
- +0x38: 0xcc4ef2 FDE=(13389554, 13389787)
- +0x40: 0xcc4fdc FDE=(13389788, 13390625)
- +0x48: 0xcc5322 FDE=(13390626, 13391260)
- +0x50: 0xcc559c FDE=(13391260, 13391392)
- +0x58: 0xcc5620 FDE=(13391392, 13391512)
- +0x60: 0xcc5698 FDE=(13391512, 13391537)
- +0x68: 0xcc56b2 FDE=(13391538, 13391567)
- +0x70: 0xcc56d0 FDE=(13391568, 13391597)
- +0x78: 0xcc56ee FDE=(13391598, 13391906)
- +0x80: 0xcc5822 FDE=(13391906, 13391918)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0xa50370 FDE=(10814320, 10814325)
- +0xa8: 0xcc9472 FDE=(13407346, 13407378)
- +0xb0: 0xcc9492 FDE=(13407378, 13407397)
- +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc0: 0xa50370 FDE=(10814320, 10814325)

### Materializations of candidate vptr (0 direct comment refs)
### Writes/initialization around returned dependency offset +0x5e0
#### FDE 0xcb7a20..0xcbc937; hit 0xcbae77: movaps XMMWORD PTR [r12+0x5e0],xmm0; score=2
      cbae3c:	00 
      cbae3d:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
      cbae42:	e8 c3 68 00 00       	call   cc170a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20e6aa>
      cbae47:	49 8d bc 24 30 05 00 	lea    rdi,[r12+0x530]
      cbae4e:	00 
      cbae4f:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      cbae54:	e8 35 d4 e6 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      cbae59:	49 8d bc 24 88 05 00 	lea    rdi,[r12+0x588]
      cbae60:	00 
      cbae61:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
      cbae66:	e8 97 ef b1 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      cbae6b:	41 c6 84 24 08 06 00 	mov    BYTE PTR [r12+0x608],0x0
      cbae72:	00 00 
      cbae74:	0f 57 c0             	xorps  xmm0,xmm0
      cbae77:	41 0f 29 84 24 e0 05 	movaps XMMWORD PTR [r12+0x5e0],xmm0
      cbae7e:	00 00 
      cbae80:	41 0f 11 84 24 e9 05 	movups XMMWORD PTR [r12+0x5e9],xmm0
      cbae87:	00 00 
      cbae89:	49 83 a4 24 10 06 00 	and    QWORD PTR [r12+0x610],0x0
      cbae90:	00 00 
      cbae92:	49 83 a4 24 20 06 00 	and    QWORD PTR [r12+0x620],0x0
      cbae99:	00 00 
      cbae9b:	49 8d 84 24 10 06 00 	lea    rax,[r12+0x610]
      cbaea2:	00 
      cbaea3:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      cbaea8:	48 8b 84 24 40 07 00 	mov    rax,QWORD PTR [rsp+0x740]
      cbaeaf:	00 
      cbaeb0:	48 85 c0             	test   rax,rax
      cbaeb3:	74 33                	je     cbaee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x207e88>
      cbaeb5:	49 89 84 24 20 06 00 	mov    QWORD PTR [r12+0x620],rax
      cbaebc:	00 
      cbaebd:	6a 01                	push   0x1
      cbaebf:	5f                   	pop    rdi
      cbaec0:	48 8d 94 24 30 07 00 	lea    rdx,[rsp+0x730]
      cbaec7:	00 
      cbaec8:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
      cbaecd:	ff d0                	call   rax
      cbaecf:	48 8b 84 24 48 07 00 	mov    rax,QWORD PTR [rsp+0x748]
      cbaed6:	00 
      cbaed7:	49 89 84 24 28 06 00 	mov    QWORD PTR [r12+0x628],rax
      cbaede:	00 
      cbaedf:	48 83 a4 24 40 07 00 	and    QWORD PTR [rsp+0x740],0x0
      cbaee6:	00 00 

#### FDE 0xcc1aec..0xcc1ce7; hit 0xcc1afc: mov    rdi,QWORD PTR [rbx+0x5e0]; score=2
      cc1ad9:	cc                   	int3
      cc1ada:	53                   	push   rbx
      cc1adb:	48 89 fb             	mov    rbx,rdi
      cc1ade:	e8 79 8a ec ff       	call   b8a55c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd74fc>
      cc1ae3:	c6 83 60 01 00 00 01 	mov    BYTE PTR [rbx+0x160],0x1
      cc1aea:	5b                   	pop    rbx
      cc1aeb:	c3                   	ret
      cc1aec:	41 57                	push   r15
      cc1aee:	41 56                	push   r14
      cc1af0:	41 54                	push   r12
      cc1af2:	53                   	push   rbx
      cc1af3:	50                   	push   rax
      cc1af4:	48 89 fb             	mov    rbx,rdi
      cc1af7:	e8 a8 4a 00 00       	call   cc65a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213544>
      cc1afc:	48 8b bb e0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5e0]
      cc1b03:	48 83 a3 e0 05 00 00 	and    QWORD PTR [rbx+0x5e0],0x0
      cc1b0a:	00 
      cc1b0b:	48 85 ff             	test   rdi,rdi
      cc1b0e:	74 06                	je     cc1b16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20eab6>
      cc1b10:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc1b13:	ff 50 08             	call   QWORD PTR [rax+0x8]
      cc1b16:	48 8b bb e8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5e8]
      cc1b1d:	48 83 a3 e8 05 00 00 	and    QWORD PTR [rbx+0x5e8],0x0
      cc1b24:	00 
      cc1b25:	48 85 ff             	test   rdi,rdi
      cc1b28:	74 06                	je     cc1b30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20ead0>
      cc1b2a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc1b2d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      cc1b30:	4c 8d b3 e0 05 00 00 	lea    r14,[rbx+0x5e0]
      cc1b37:	4c 8d bb e8 05 00 00 	lea    r15,[rbx+0x5e8]
      cc1b3e:	4c 8d a3 f0 05 00 00 	lea    r12,[rbx+0x5f0]
      cc1b45:	48 8b bb f0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5f0]
      cc1b4c:	48 83 a3 f0 05 00 00 	and    QWORD PTR [rbx+0x5f0],0x0
      cc1b53:	00 
      cc1b54:	48 85 ff             	test   rdi,rdi
      cc1b57:	74 06                	je     cc1b5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20eaff>
      cc1b59:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc1b5c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      cc1b5f:	48 8d bb b0 08 00 00 	lea    rdi,[rbx+0x8b0]
      cc1b66:	e8 21 c8 ff ff       	call   cbe38c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b32c>
      cc1b6b:	48 8d bb e8 07 00 00 	lea    rdi,[rbx+0x7e8]
      cc1b72:	e8 cf fb af 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      cc1b77:	48 8d bb d8 07 00 00 	lea    rdi,[rbx+0x7d8]

#### FDE 0xcc22e0..0xcc2357; hit 0xcc22f6: mov    rsi,QWORD PTR [rsi+0x5e0]; score=2
      cc22cc:	75 0d                	jne    cc22db <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20f27b>
      cc22ce:	48 89 d8             	mov    rax,rbx
      cc22d1:	48 83 c4 50          	add    rsp,0x50
      cc22d5:	5b                   	pop    rbx
      cc22d6:	41 5e                	pop    r14
      cc22d8:	41 5f                	pop    r15
      cc22da:	c3                   	ret
      cc22db:	e8 d0 d7 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc22e0:	53                   	push   rbx
      cc22e1:	48 83 ec 20          	sub    rsp,0x20
      cc22e5:	48 89 fb             	mov    rbx,rdi
      cc22e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc22ef:	00 00 
      cc22f1:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      cc22f6:	48 8b b6 e0 05 00 00 	mov    rsi,QWORD PTR [rsi+0x5e0]
      cc22fd:	48 85 f6             	test   rsi,rsi
      cc2300:	74 2f                	je     cc2331 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20f2d1>
      cc2302:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
      cc2307:	48 89 10             	mov    QWORD PTR [rax],rdx
      cc230a:	48 c7 40 08 e8 03 00 	mov    QWORD PTR [rax+0x8],0x3e8
      cc2311:	00 
      cc2312:	4c 8b 06             	mov    r8,QWORD PTR [rsi]
      cc2315:	48 89 df             	mov    rdi,rbx
      cc2318:	48 89 c2             	mov    rdx,rax
      cc231b:	41 ff 50 68          	call   QWORD PTR [r8+0x68]
      cc231f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc2326:	00 00 
      cc2328:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      cc232d:	74 1a                	je     cc2349 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20f2e9>
      cc232f:	eb 21                	jmp    cc2352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20f2f2>
      cc2331:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc2338:	00 00 
      cc233a:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      cc233f:	75 11                	jne    cc2352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20f2f2>
      cc2341:	48 89 df             	mov    rdi,rbx
      cc2344:	e8 ad 76 b1 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      cc2349:	48 89 d8             	mov    rax,rbx
      cc234c:	48 83 c4 20          	add    rsp,0x20
      cc2350:	5b                   	pop    rbx
      cc2351:	c3                   	ret
      cc2352:	e8 59 d7 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc2357:	cc                   	int3
      cc2358:	53                   	push   rbx

#### FDE 0xcc2358..0xcc23cf; hit 0xcc236e: mov    rsi,QWORD PTR [rsi+0x5e0]; score=2
      cc2341:	48 89 df             	mov    rdi,rbx
      cc2344:	e8 ad 76 b1 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      cc2349:	48 89 d8             	mov    rax,rbx
      cc234c:	48 83 c4 20          	add    rsp,0x20
      cc2350:	5b                   	pop    rbx
      cc2351:	c3                   	ret
      cc2352:	e8 59 d7 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc2357:	cc                   	int3
      cc2358:	53                   	push   rbx
      cc2359:	48 83 ec 20          	sub    rsp,0x20
      cc235d:	48 89 fb             	mov    rbx,rdi
      cc2360:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc2367:	00 00 
      cc2369:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      cc236e:	48 8b b6 e0 05 00 00 	mov    rsi,QWORD PTR [rsi+0x5e0]
      cc2375:	48 85 f6             	test   rsi,rsi
      cc2378:	74 2f                	je     cc23a9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20f349>
      cc237a:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
      cc237f:	48 89 10             	mov    QWORD PTR [rax],rdx
      cc2382:	48 c7 40 08 e8 03 00 	mov    QWORD PTR [rax+0x8],0x3e8
      cc2389:	00 
      cc238a:	4c 8b 06             	mov    r8,QWORD PTR [rsi]
      cc238d:	48 89 df             	mov    rdi,rbx
      cc2390:	48 89 c2             	mov    rdx,rax
      cc2393:	41 ff 50 70          	call   QWORD PTR [r8+0x70]
      cc2397:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc239e:	00 00 
      cc23a0:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      cc23a5:	74 1a                	je     cc23c1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20f361>
      cc23a7:	eb 21                	jmp    cc23ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20f36a>
      cc23a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc23b0:	00 00 
      cc23b2:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      cc23b7:	75 11                	jne    cc23ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20f36a>
      cc23b9:	48 89 df             	mov    rdi,rbx
      cc23bc:	e8 35 76 b1 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      cc23c1:	48 89 d8             	mov    rax,rbx
      cc23c4:	48 83 c4 20          	add    rsp,0x20
      cc23c8:	5b                   	pop    rbx
      cc23c9:	c3                   	ret
      cc23ca:	e8 e1 d6 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc23cf:	cc                   	int3
      cc23d0:	41 57                	push   r15

#### FDE 0xcc3be2..0xcc4667; hit 0xcc3c7a: mov    rdi,QWORD PTR [r14+0x5e0]; score=2
      cc3c3c:	6a 02                	push   0x2
      cc3c3e:	5f                   	pop    rdi
      cc3c3f:	ba 44 04 00 00       	mov    edx,0x444
      cc3c44:	31 c0                	xor    eax,eax
      cc3c46:	e8 87 2c b1 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc3c4b:	e8 87 10 7f 00       	call   14b4cd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fa25b>
      cc3c50:	41 c7 07 01 00 00 00 	mov    DWORD PTR [r15],0x1
      cc3c57:	48 8d 05 72 97 c6 00 	lea    rax,[rip+0xc69772]        # 192d3d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x747e0>
      cc3c5e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      cc3c62:	41 c6 47 10 00       	mov    BYTE PTR [r15+0x10],0x0
      cc3c67:	e9 bb 08 00 00       	jmp    cc4527 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2114c7>
      cc3c6c:	44 89 64 24 14       	mov    DWORD PTR [rsp+0x14],r12d
      cc3c71:	48 89 1c 24          	mov    QWORD PTR [rsp],rbx
      cc3c75:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
      cc3c7a:	49 8b be e0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5e0]
      cc3c81:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc3c84:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc3c8a:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
      cc3c91:	00 
      cc3c92:	48 89 06             	mov    QWORD PTR [rsi],rax
      cc3c95:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
      cc3c99:	48 8d 5c 24 58       	lea    rbx,[rsp+0x58]
      cc3c9e:	48 89 df             	mov    rdi,rbx
      cc3ca1:	e8 7a 06 ed ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
      cc3ca6:	4c 8d 25 cf e2 78 ff 	lea    r12,[rip+0xffffffffff78e2cf]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc3cad:	48 8d 0d ec c0 6b ff 	lea    rcx,[rip+0xffffffffff6bc0ec]        # 37fda0 <_ZTSSt12bad_any_cast@@Base-0x10428>
      cc3cb4:	6a 04                	push   0x4
      cc3cb6:	41 5f                	pop    r15
      cc3cb8:	44 89 ff             	mov    edi,r15d
      cc3cbb:	4c 89 e6             	mov    rsi,r12
      cc3cbe:	ba 48 04 00 00       	mov    edx,0x448
      cc3cc3:	49 89 d8             	mov    r8,rbx
      cc3cc6:	31 c0                	xor    eax,eax
      cc3cc8:	e8 05 2c b1 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc3ccd:	f6 45 00 01          	test   BYTE PTR [rbp+0x0],0x1
      cc3cd1:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
      cc3cd6:	74 06                	je     cc3cde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x210c7e>
      cc3cd8:	4c 8b 45 10          	mov    r8,QWORD PTR [rbp+0x10]
      cc3cdc:	eb 04                	jmp    cc3ce2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x210c82>
      cc3cde:	4c 8d 45 01          	lea    r8,[rbp+0x1]
      cc3ce2:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
      cc3ce6:	48 8d 0d b5 27 6c ff 	lea    rcx,[rip+0xffffffffff6c27b5]        # 3864a2 <_ZTSSt12bad_any_cast@@Base-0x9d26>
      cc3ced:	44 89 ff             	mov    edi,r15d

#### FDE 0xcc4668..0xcc4aa0; hit 0xcc468a: mov    rbx,QWORD PTR [rdi+0x5e0]; score=2
      cc465d:	e8 6e b6 da ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cc4662:	e8 49 b4 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc4667:	cc                   	int3
      cc4668:	55                   	push   rbp
      cc4669:	41 57                	push   r15
      cc466b:	41 56                	push   r14
      cc466d:	41 55                	push   r13
      cc466f:	41 54                	push   r12
      cc4671:	53                   	push   rbx
      cc4672:	48 81 ec 18 01 00 00 	sub    rsp,0x118
      cc4679:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4680:	00 00 
      cc4682:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
      cc4689:	00 
      cc468a:	48 8b 9f e0 05 00 00 	mov    rbx,QWORD PTR [rdi+0x5e0]
      cc4691:	48 85 db             	test   rbx,rbx
      cc4694:	0f 84 1d 01 00 00    	je     cc47b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211757>
      cc469a:	49 89 d7             	mov    r15,rdx
      cc469d:	89 f5                	mov    ebp,esi
      cc469f:	49 89 fe             	mov    r14,rdi
      cc46a2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      cc46a5:	48 89 df             	mov    rdi,rbx
      cc46a8:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
      cc46ae:	40 38 e8             	cmp    al,bpl
      cc46b1:	0f 84 22 01 00 00    	je     cc47d9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211779>
      cc46b7:	49 8b be e0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5e0]
      cc46be:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc46c1:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc46c7:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
      cc46ce:	00 
      cc46cf:	48 89 06             	mov    QWORD PTR [rsi],rax
      cc46d2:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
      cc46d6:	48 8d 05 4a 56 69 ff 	lea    rax,[rip+0xffffffffff69564a]        # 359d27 <_ZTSSt12bad_any_cast@@Base-0x364a1>
      cc46dd:	4c 8d 25 3a 30 6a ff 	lea    r12,[rip+0xffffffffff6a303a]        # 36771e <_ZTSSt12bad_any_cast@@Base-0x28aaa>
      cc46e4:	40 84 ed             	test   bpl,bpl
      cc46e7:	4c 0f 45 e0          	cmovne r12,rax
      cc46eb:	4c 8d ac 24 98 00 00 	lea    r13,[rsp+0x98]
      cc46f2:	00 
      cc46f3:	4c 89 ef             	mov    rdi,r13
      cc46f6:	e8 25 fc ec ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
      cc46fb:	48 8d 35 7a d8 78 ff 	lea    rsi,[rip+0xffffffffff78d87a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc4702:	48 8d 0d cf d2 66 ff 	lea    rcx,[rip+0xffffffffff66d2cf]        # 3319d8 <_ZTSSt12bad_any_cast@@Base-0x5e7f0>
      cc4709:	6a 04                	push   0x4

#### FDE 0xcc4aa0..0xcc4ad5; hit 0xcc4aa4: mov    rdi,QWORD PTR [rdi+0x5e0]; score=2
      cc4a70:	48 89 c3             	mov    rbx,rax
      cc4a73:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
      cc4a7a:	00 
      cc4a7b:	e8 66 7a e1 ff       	call   adc4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29486>
      cc4a80:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4a87:	00 00 
      cc4a89:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
      cc4a90:	00 
      cc4a91:	75 08                	jne    cc4a9b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211a3b>
      cc4a93:	48 89 df             	mov    rdi,rbx
      cc4a96:	e8 35 b2 da ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cc4a9b:	e8 10 b0 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc4aa0:	53                   	push   rbx
      cc4aa1:	48 89 fb             	mov    rbx,rdi
      cc4aa4:	48 8b bf e0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5e0]
      cc4aab:	48 85 ff             	test   rdi,rdi
      cc4aae:	74 0d                	je     cc4abd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211a5d>
      cc4ab0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4ab3:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
      cc4ab9:	84 c0                	test   al,al
      cc4abb:	74 04                	je     cc4ac1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211a61>
      cc4abd:	31 c0                	xor    eax,eax
      cc4abf:	eb 12                	jmp    cc4ad3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211a73>
      cc4ac1:	48 8b bb e0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5e0]
      cc4ac8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4acb:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      cc4ad1:	34 01                	xor    al,0x1
      cc4ad3:	5b                   	pop    rbx
      cc4ad4:	c3                   	ret
      cc4ad5:	cc                   	int3
      cc4ad6:	80 bf 48 07 00 00 00 	cmp    BYTE PTR [rdi+0x748],0x0
      cc4add:	74 04                	je     cc4ae3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211a83>
      cc4adf:	6a 05                	push   0x5
      cc4ae1:	58                   	pop    rax
      cc4ae2:	c3                   	ret
      cc4ae3:	48 8b bf e0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5e0]
      cc4aea:	48 85 ff             	test   rdi,rdi
      cc4aed:	74 09                	je     cc4af8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211a98>
      cc4aef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4af2:	ff a0 f8 00 00 00    	jmp    QWORD PTR [rax+0xf8]
      cc4af8:	31 c0                	xor    eax,eax
      cc4afa:	c3                   	ret
      cc4afb:	cc                   	int3

#### FDE 0xcc4ad6..0xcc4afb; hit 0xcc4ae3: mov    rdi,QWORD PTR [rdi+0x5e0]; score=2
      cc4abd:	31 c0                	xor    eax,eax
      cc4abf:	eb 12                	jmp    cc4ad3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211a73>
      cc4ac1:	48 8b bb e0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5e0]
      cc4ac8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4acb:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      cc4ad1:	34 01                	xor    al,0x1
      cc4ad3:	5b                   	pop    rbx
      cc4ad4:	c3                   	ret
      cc4ad5:	cc                   	int3
      cc4ad6:	80 bf 48 07 00 00 00 	cmp    BYTE PTR [rdi+0x748],0x0
      cc4add:	74 04                	je     cc4ae3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211a83>
      cc4adf:	6a 05                	push   0x5
      cc4ae1:	58                   	pop    rax
      cc4ae2:	c3                   	ret
      cc4ae3:	48 8b bf e0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5e0]
      cc4aea:	48 85 ff             	test   rdi,rdi
      cc4aed:	74 09                	je     cc4af8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211a98>
      cc4aef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4af2:	ff a0 f8 00 00 00    	jmp    QWORD PTR [rax+0xf8]
      cc4af8:	31 c0                	xor    eax,eax
      cc4afa:	c3                   	ret
      cc4afb:	cc                   	int3
      cc4afc:	41 56                	push   r14
      cc4afe:	53                   	push   rbx
      cc4aff:	48 81 ec 68 01 00 00 	sub    rsp,0x168
      cc4b06:	48 89 fb             	mov    rbx,rdi
      cc4b09:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4b10:	00 00 
      cc4b12:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
      cc4b19:	00 
      cc4b1a:	48 8b b6 e0 05 00 00 	mov    rsi,QWORD PTR [rsi+0x5e0]
      cc4b21:	48 85 f6             	test   rsi,rsi
      cc4b24:	74 24                	je     cc4b4a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211aea>
      cc4b26:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc4b29:	49 89 e6             	mov    r14,rsp
      cc4b2c:	4c 89 f7             	mov    rdi,r14
      cc4b2f:	ff 90 50 01 00 00    	call   QWORD PTR [rax+0x150]
      cc4b35:	48 89 df             	mov    rdi,rbx
      cc4b38:	4c 89 f6             	mov    rsi,r14
      cc4b3b:	e8 04 19 00 00       	call   cc6444 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2133e4>
      cc4b40:	4c 89 f7             	mov    rdi,r14
      cc4b43:	e8 9e 55 ec ff       	call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
      cc4b48:	eb 0a                	jmp    cc4b54 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211af4>

#### FDE 0xcc4afc..0xcc4b7a; hit 0xcc4b1a: mov    rsi,QWORD PTR [rsi+0x5e0]; score=2
      cc4aed:	74 09                	je     cc4af8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211a98>
      cc4aef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4af2:	ff a0 f8 00 00 00    	jmp    QWORD PTR [rax+0xf8]
      cc4af8:	31 c0                	xor    eax,eax
      cc4afa:	c3                   	ret
      cc4afb:	cc                   	int3
      cc4afc:	41 56                	push   r14
      cc4afe:	53                   	push   rbx
      cc4aff:	48 81 ec 68 01 00 00 	sub    rsp,0x168
      cc4b06:	48 89 fb             	mov    rbx,rdi
      cc4b09:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4b10:	00 00 
      cc4b12:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
      cc4b19:	00 
      cc4b1a:	48 8b b6 e0 05 00 00 	mov    rsi,QWORD PTR [rsi+0x5e0]
      cc4b21:	48 85 f6             	test   rsi,rsi
      cc4b24:	74 24                	je     cc4b4a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211aea>
      cc4b26:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc4b29:	49 89 e6             	mov    r14,rsp
      cc4b2c:	4c 89 f7             	mov    rdi,r14
      cc4b2f:	ff 90 50 01 00 00    	call   QWORD PTR [rax+0x150]
      cc4b35:	48 89 df             	mov    rdi,rbx
      cc4b38:	4c 89 f6             	mov    rsi,r14
      cc4b3b:	e8 04 19 00 00       	call   cc6444 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2133e4>
      cc4b40:	4c 89 f7             	mov    rdi,r14
      cc4b43:	e8 9e 55 ec ff       	call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
      cc4b48:	eb 0a                	jmp    cc4b54 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211af4>
      cc4b4a:	31 c0                	xor    eax,eax
      cc4b4c:	88 03                	mov    BYTE PTR [rbx],al
      cc4b4e:	88 83 60 01 00 00    	mov    BYTE PTR [rbx+0x160],al
      cc4b54:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4b5b:	00 00 
      cc4b5d:	48 3b 84 24 60 01 00 	cmp    rax,QWORD PTR [rsp+0x160]
      cc4b64:	00 
      cc4b65:	75 0e                	jne    cc4b75 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211b15>
      cc4b67:	48 89 d8             	mov    rax,rbx
      cc4b6a:	48 81 c4 68 01 00 00 	add    rsp,0x168
      cc4b71:	5b                   	pop    rbx
      cc4b72:	41 5e                	pop    r14
      cc4b74:	c3                   	ret
      cc4b75:	e8 36 af b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc4b7a:	41 56                	push   r14
      cc4b7c:	53                   	push   rbx

#### FDE 0xcc4c12..0xcc4e4c; hit 0xcc4c56: mov    rdi,QWORD PTR [r14+0x5e0]; score=2
      cc4c1c:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
      cc4c23:	49 89 d4             	mov    r12,rdx
      cc4c26:	89 f5                	mov    ebp,esi
      cc4c28:	49 89 fe             	mov    r14,rdi
      cc4c2b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4c32:	00 00 
      cc4c34:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      cc4c3b:	00 
      cc4c3c:	45 84 c0             	test   r8b,r8b
      cc4c3f:	0f 84 57 01 00 00    	je     cc4d9c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211d3c>
      cc4c45:	49 89 cf             	mov    r15,rcx
      cc4c48:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      cc4c4d:	48 c7 44 24 18 e8 03 	mov    QWORD PTR [rsp+0x18],0x3e8
      cc4c54:	00 00 
      cc4c56:	49 8b be e0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5e0]
      cc4c5d:	48 85 ff             	test   rdi,rdi
      cc4c60:	0f 95 c3             	setne  bl
      cc4c63:	0f 84 4f 01 00 00    	je     cc4db8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211d58>
      cc4c69:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4c6c:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc4c72:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
      cc4c79:	00 
      cc4c7a:	48 89 06             	mov    QWORD PTR [rsi],rax
      cc4c7d:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
      cc4c81:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]
      cc4c86:	4c 89 ef             	mov    rdi,r13
      cc4c89:	e8 92 f6 ec ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
      cc4c8e:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
      cc4c92:	48 8d 35 e3 d2 78 ff 	lea    rsi,[rip+0xffffffffff78d2e3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc4c99:	48 8d 0d 75 80 6a ff 	lea    rcx,[rip+0xffffffffff6a8075]        # 36cd15 <_ZTSSt12bad_any_cast@@Base-0x234b3>
      cc4ca0:	6a 04                	push   0x4
      cc4ca2:	5f                   	pop    rdi
      cc4ca3:	ba 31 05 00 00       	mov    edx,0x531
      cc4ca8:	4d 89 f8             	mov    r8,r15
      cc4cab:	4d 89 e9             	mov    r9,r13
      cc4cae:	31 c0                	xor    eax,eax
      cc4cb0:	e8 1d 1c b1 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc4cb5:	49 8b be e0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5e0]
      cc4cbc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4cbf:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      cc4cc4:	89 ea                	mov    edx,ebp
      cc4cc6:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      cc4ccc:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]

#### FDE 0xcc4e4c..0xcc4eb9; hit 0xcc4e50: mov    rdi,QWORD PTR [rdi+0x5e0]; score=2
      cc4e1d:	eb 03                	jmp    cc4e22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211dc2>
      cc4e1f:	48 89 c3             	mov    rbx,rax
      cc4e22:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      cc4e27:	e8 ba 76 e1 ff       	call   adc4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29486>
      cc4e2c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4e33:	00 00 
      cc4e35:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
      cc4e3c:	00 
      cc4e3d:	75 08                	jne    cc4e47 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211de7>
      cc4e3f:	48 89 df             	mov    rdi,rbx
      cc4e42:	e8 89 ae da ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cc4e47:	e8 64 ac b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc4e4c:	53                   	push   rbx
      cc4e4d:	48 89 fb             	mov    rbx,rdi
      cc4e50:	48 8b bf e0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5e0]
      cc4e57:	48 85 ff             	test   rdi,rdi
      cc4e5a:	74 54                	je     cc4eb0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e50>
      cc4e5c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4e5f:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]
      cc4e65:	48 85 c0             	test   rax,rax
      cc4e68:	74 46                	je     cc4eb0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e50>
      cc4e6a:	48 8b bb e0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5e0]
      cc4e71:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4e74:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]
      cc4e7a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      cc4e7d:	48 89 c7             	mov    rdi,rax
      cc4e80:	ff 51 48             	call   QWORD PTR [rcx+0x48]
      cc4e83:	48 85 c0             	test   rax,rax
      cc4e86:	74 28                	je     cc4eb0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e50>
      cc4e88:	48 8b bb e0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5e0]
      cc4e8f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4e92:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
      cc4e98:	48 89 d1             	mov    rcx,rdx
      cc4e9b:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
      cc4ea2:	48 99                	cqo
      cc4ea4:	48 f7 f9             	idiv   rcx
      cc4ea7:	48 03 83 50 06 00 00 	add    rax,QWORD PTR [rbx+0x650]
      cc4eae:	eb 07                	jmp    cc4eb7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e57>
      cc4eb0:	48 8b 83 50 06 00 00 	mov    rax,QWORD PTR [rbx+0x650]
      cc4eb7:	5b                   	pop    rbx
      cc4eb8:	c3                   	ret
      cc4eb9:	cc                   	int3
      cc4eba:	53                   	push   rbx

#### FDE 0xcc4eba..0xcc4eea; hit 0xcc4ec5: mov    rdi,QWORD PTR [rsi+0x5e0]; score=2
      cc4e9b:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
      cc4ea2:	48 99                	cqo
      cc4ea4:	48 f7 f9             	idiv   rcx
      cc4ea7:	48 03 83 50 06 00 00 	add    rax,QWORD PTR [rbx+0x650]
      cc4eae:	eb 07                	jmp    cc4eb7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e57>
      cc4eb0:	48 8b 83 50 06 00 00 	mov    rax,QWORD PTR [rbx+0x650]
      cc4eb7:	5b                   	pop    rbx
      cc4eb8:	c3                   	ret
      cc4eb9:	cc                   	int3
      cc4eba:	53                   	push   rbx
      cc4ebb:	48 89 fb             	mov    rbx,rdi
      cc4ebe:	31 c0                	xor    eax,eax
      cc4ec0:	88 07                	mov    BYTE PTR [rdi],al
      cc4ec2:	88 47 10             	mov    BYTE PTR [rdi+0x10],al
      cc4ec5:	48 8b be e0 05 00 00 	mov    rdi,QWORD PTR [rsi+0x5e0]
      cc4ecc:	48 85 ff             	test   rdi,rdi
      cc4ecf:	74 14                	je     cc4ee5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e85>
      cc4ed1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4ed4:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc4eda:	48 89 03             	mov    QWORD PTR [rbx],rax
      cc4edd:	48 89 53 08          	mov    QWORD PTR [rbx+0x8],rdx
      cc4ee1:	c6 43 10 01          	mov    BYTE PTR [rbx+0x10],0x1
      cc4ee5:	48 89 d8             	mov    rax,rbx
      cc4ee8:	5b                   	pop    rbx
      cc4ee9:	c3                   	ret
      cc4eea:	48 8b 87 e0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5e0]
      cc4ef1:	c3                   	ret
      cc4ef2:	41 56                	push   r14
      cc4ef4:	53                   	push   rbx
      cc4ef5:	48 81 ec d8 02 00 00 	sub    rsp,0x2d8
      cc4efc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4f03:	00 00 
      cc4f05:	48 89 84 24 d0 02 00 	mov    QWORD PTR [rsp+0x2d0],rax
      cc4f0c:	00 
      cc4f0d:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
      cc4f10:	89 87 a0 06 00 00    	mov    DWORD PTR [rdi+0x6a0],eax
      cc4f16:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc4f19:	48 89 87 98 06 00 00 	mov    QWORD PTR [rdi+0x698],rax
      cc4f20:	48 8b b7 e0 05 00 00 	mov    rsi,QWORD PTR [rdi+0x5e0]
      cc4f27:	48 85 f6             	test   rsi,rsi
      cc4f2a:	74 52                	je     cc4f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211f1e>
      cc4f2c:	48 89 fb             	mov    rbx,rdi
      cc4f2f:	48 8b 06             	mov    rax,QWORD PTR [rsi]

#### FDE 0xcc4eea..0xcc4ef2; hit 0xcc4eea: mov    rax,QWORD PTR [rdi+0x5e0]; score=2
      cc4ebe:	31 c0                	xor    eax,eax
      cc4ec0:	88 07                	mov    BYTE PTR [rdi],al
      cc4ec2:	88 47 10             	mov    BYTE PTR [rdi+0x10],al
      cc4ec5:	48 8b be e0 05 00 00 	mov    rdi,QWORD PTR [rsi+0x5e0]
      cc4ecc:	48 85 ff             	test   rdi,rdi
      cc4ecf:	74 14                	je     cc4ee5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211e85>
      cc4ed1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc4ed4:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc4eda:	48 89 03             	mov    QWORD PTR [rbx],rax
      cc4edd:	48 89 53 08          	mov    QWORD PTR [rbx+0x8],rdx
      cc4ee1:	c6 43 10 01          	mov    BYTE PTR [rbx+0x10],0x1
      cc4ee5:	48 89 d8             	mov    rax,rbx
      cc4ee8:	5b                   	pop    rbx
      cc4ee9:	c3                   	ret
      cc4eea:	48 8b 87 e0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5e0]
      cc4ef1:	c3                   	ret
      cc4ef2:	41 56                	push   r14
      cc4ef4:	53                   	push   rbx
      cc4ef5:	48 81 ec d8 02 00 00 	sub    rsp,0x2d8
      cc4efc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4f03:	00 00 
      cc4f05:	48 89 84 24 d0 02 00 	mov    QWORD PTR [rsp+0x2d0],rax
      cc4f0c:	00 
      cc4f0d:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
      cc4f10:	89 87 a0 06 00 00    	mov    DWORD PTR [rdi+0x6a0],eax
      cc4f16:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc4f19:	48 89 87 98 06 00 00 	mov    QWORD PTR [rdi+0x698],rax
      cc4f20:	48 8b b7 e0 05 00 00 	mov    rsi,QWORD PTR [rdi+0x5e0]
      cc4f27:	48 85 f6             	test   rsi,rsi
      cc4f2a:	74 52                	je     cc4f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211f1e>
      cc4f2c:	48 89 fb             	mov    rbx,rdi
      cc4f2f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc4f32:	4c 8d b4 24 70 01 00 	lea    r14,[rsp+0x170]
      cc4f39:	00 
      cc4f3a:	6a ff                	push   0xffffffffffffffff
      cc4f3c:	5a                   	pop    rdx
      cc4f3d:	4c 89 f7             	mov    rdi,r14
      cc4f40:	ff 90 50 01 00 00    	call   QWORD PTR [rax+0x150]
      cc4f46:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      cc4f4b:	4c 89 f6             	mov    rsi,r14
      cc4f4e:	e8 87 cb ff ff       	call   cc1ada <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20ea7a>
      cc4f53:	48 81 c3 d8 04 00 00 	add    rbx,0x4d8
      cc4f5a:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]

#### FDE 0xcc4ef2..0xcc4fdb; hit 0xcc4f20: mov    rsi,QWORD PTR [rdi+0x5e0]; score=2
      cc4ee9:	c3                   	ret
      cc4eea:	48 8b 87 e0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5e0]
      cc4ef1:	c3                   	ret
      cc4ef2:	41 56                	push   r14
      cc4ef4:	53                   	push   rbx
      cc4ef5:	48 81 ec d8 02 00 00 	sub    rsp,0x2d8
      cc4efc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4f03:	00 00 
      cc4f05:	48 89 84 24 d0 02 00 	mov    QWORD PTR [rsp+0x2d0],rax
      cc4f0c:	00 
      cc4f0d:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
      cc4f10:	89 87 a0 06 00 00    	mov    DWORD PTR [rdi+0x6a0],eax
      cc4f16:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc4f19:	48 89 87 98 06 00 00 	mov    QWORD PTR [rdi+0x698],rax
      cc4f20:	48 8b b7 e0 05 00 00 	mov    rsi,QWORD PTR [rdi+0x5e0]
      cc4f27:	48 85 f6             	test   rsi,rsi
      cc4f2a:	74 52                	je     cc4f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211f1e>
      cc4f2c:	48 89 fb             	mov    rbx,rdi
      cc4f2f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc4f32:	4c 8d b4 24 70 01 00 	lea    r14,[rsp+0x170]
      cc4f39:	00 
      cc4f3a:	6a ff                	push   0xffffffffffffffff
      cc4f3c:	5a                   	pop    rdx
      cc4f3d:	4c 89 f7             	mov    rdi,r14
      cc4f40:	ff 90 50 01 00 00    	call   QWORD PTR [rax+0x150]
      cc4f46:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      cc4f4b:	4c 89 f6             	mov    rsi,r14
      cc4f4e:	e8 87 cb ff ff       	call   cc1ada <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20ea7a>
      cc4f53:	48 81 c3 d8 04 00 00 	add    rbx,0x4d8
      cc4f5a:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      cc4f5f:	48 89 df             	mov    rdi,rbx
      cc4f62:	e8 cf 08 00 00       	call   cc5836 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2127d6>
      cc4f67:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      cc4f6c:	e8 09 ae f0 ff       	call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>
      cc4f71:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      cc4f78:	00 
      cc4f79:	e8 68 51 ec ff       	call   b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
      cc4f7e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4f85:	00 00 
      cc4f87:	48 3b 84 24 d0 02 00 	cmp    rax,QWORD PTR [rsp+0x2d0]
      cc4f8e:	00 
      cc4f8f:	75 45                	jne    cc4fd6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x211f76>
      cc4f91:	48 81 c4 d8 02 00 00 	add    rsp,0x2d8

#### FDE 0xcc4fdc..0xcc5321; hit 0xcc4fff: mov    rdi,QWORD PTR [rdi+0x5e0]; score=2
      cc4fd1:	e8 fa ac da ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cc4fd6:	e8 d5 aa b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc4fdb:	cc                   	int3
      cc4fdc:	55                   	push   rbp
      cc4fdd:	41 57                	push   r15
      cc4fdf:	41 56                	push   r14
      cc4fe1:	41 54                	push   r12
      cc4fe3:	53                   	push   rbx
      cc4fe4:	48 81 ec 40 03 00 00 	sub    rsp,0x340
      cc4feb:	49 89 fe             	mov    r14,rdi
      cc4fee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4ff5:	00 00 
      cc4ff7:	48 89 84 24 38 03 00 	mov    QWORD PTR [rsp+0x338],rax
      cc4ffe:	00 
      cc4fff:	48 8b bf e0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5e0]
      cc5006:	48 85 ff             	test   rdi,rdi
      cc5009:	0f 95 c0             	setne  al
      cc500c:	66 0f 57 c9          	xorpd  xmm1,xmm1
      cc5010:	66 0f 2e c8          	ucomisd xmm1,xmm0
      cc5014:	0f 92 c3             	setb   bl
      cc5017:	20 c3                	and    bl,al
      cc5019:	80 fb 01             	cmp    bl,0x1
      cc501c:	0f 85 46 02 00 00    	jne    cc5268 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212208>
      cc5022:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc5025:	f2 0f 11 44 24 08    	movsd  QWORD PTR [rsp+0x8],xmm0
      cc502b:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      cc5031:	66 0f 29 44 24 10    	movapd XMMWORD PTR [rsp+0x10],xmm0
      cc5037:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
      cc503d:	f2 0f 59 05 03 a1 6c 	mulsd  xmm0,QWORD PTR [rip+0xffffffffff6ca103]        # 38f148 <_ZTSSt12bad_any_cast@@Base-0x1080>
      cc5044:	ff 
      cc5045:	f2 44 0f 2c f8       	cvttsd2si r15d,xmm0
      cc504a:	49 8b be e0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5e0]
      cc5051:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc5054:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc505a:	48 8d b4 24 d8 01 00 	lea    rsi,[rsp+0x1d8]
      cc5061:	00 
      cc5062:	48 89 06             	mov    QWORD PTR [rsi],rax
      cc5065:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
      cc5069:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
      cc506e:	4c 89 e7             	mov    rdi,r12
      cc5071:	e8 aa f2 ec ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
      cc5076:	f2 0f 10 05 ca a0 6c 	movsd  xmm0,QWORD PTR [rip+0xffffffffff6ca0ca]        # 38f148 <_ZTSSt12bad_any_cast@@Base-0x1080>
      cc507d:	ff 

#### FDE 0xcc559c..0xcc5620; hit 0xcc55ae: mov    rdi,QWORD PTR [rdi+0x5e0]; score=2
      cc5572:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      cc5577:	e8 6a 6f e1 ff       	call   adc4e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x29486>
      cc557c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc5583:	00 00 
      cc5585:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
      cc558c:	00 
      cc558d:	75 08                	jne    cc5597 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212537>
      cc558f:	48 89 df             	mov    rdi,rbx
      cc5592:	e8 39 a7 da ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cc5597:	e8 14 a5 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc559c:	48 83 ec 38          	sub    rsp,0x38
      cc55a0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc55a7:	00 00 
      cc55a9:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      cc55ae:	48 8b bf e0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5e0]
      cc55b5:	48 85 ff             	test   rdi,rdi
      cc55b8:	74 4c                	je     cc5606 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2125a6>
      cc55ba:	31 c0                	xor    eax,eax
      cc55bc:	84 d2                	test   dl,dl
      cc55be:	48 0f 45 c6          	cmovne rax,rsi
      cc55c2:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      cc55c7:	48 c7 44 24 20 e8 03 	mov    QWORD PTR [rsp+0x20],0x3e8
      cc55ce:	00 00 
      cc55d0:	0f 95 44 24 28       	setne  BYTE PTR [rsp+0x28]
      cc55d5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc55d8:	48 8b 80 d8 00 00 00 	mov    rax,QWORD PTR [rax+0xd8]
      cc55df:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      cc55e6:	00 00 
      cc55e8:	48 3b 4c 24 30       	cmp    rcx,QWORD PTR [rsp+0x30]
      cc55ed:	75 2c                	jne    cc561b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2125bb>
      cc55ef:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
      cc55f4:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      cc55f9:	0f 10 44 24 18       	movups xmm0,XMMWORD PTR [rsp+0x18]
      cc55fe:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
      cc5602:	ff d0                	call   rax
      cc5604:	eb 10                	jmp    cc5616 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2125b6>
      cc5606:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc560d:	00 00 
      cc560f:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      cc5614:	75 05                	jne    cc561b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2125bb>
      cc5616:	48 83 c4 38          	add    rsp,0x38
      cc561a:	c3                   	ret
      cc561b:	e8 90 a4 b2 00       	call   17efab0 <__stack_chk_fail@plt>

#### FDE 0xcc5620..0xcc5698; hit 0xcc5633: mov    rsi,QWORD PTR [rdi+0x5e0]; score=2
      cc5602:	ff d0                	call   rax
      cc5604:	eb 10                	jmp    cc5616 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2125b6>
      cc5606:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc560d:	00 00 
      cc560f:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      cc5614:	75 05                	jne    cc561b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2125bb>
      cc5616:	48 83 c4 38          	add    rsp,0x38
      cc561a:	c3                   	ret
      cc561b:	e8 90 a4 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc5620:	53                   	push   rbx
      cc5621:	48 83 ec 20          	sub    rsp,0x20
      cc5625:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc562c:	00 00 
      cc562e:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      cc5633:	48 8b b7 e0 05 00 00 	mov    rsi,QWORD PTR [rdi+0x5e0]
      cc563a:	48 85 f6             	test   rsi,rsi
      cc563d:	74 35                	je     cc5674 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212614>
      cc563f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc5642:	48 89 e3             	mov    rbx,rsp
      cc5645:	48 89 df             	mov    rdi,rbx
      cc5648:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
      cc564e:	80 7b 10 00          	cmp    BYTE PTR [rbx+0x10],0x0
      cc5652:	74 20                	je     cc5674 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212614>
      cc5654:	48 69 04 24 e8 03 00 	imul   rax,QWORD PTR [rsp],0x3e8
      cc565b:	00 
      cc565c:	48 99                	cqo
      cc565e:	48 f7 7c 24 08       	idiv   QWORD PTR [rsp+0x8]
      cc5663:	48 89 c1             	mov    rcx,rax
      cc5666:	0f b6 c1             	movzx  eax,cl
      cc5669:	48 81 e1 00 ff ff ff 	and    rcx,0xffffffffffffff00
      cc5670:	b2 01                	mov    dl,0x1
      cc5672:	eb 06                	jmp    cc567a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21261a>
      cc5674:	31 c9                	xor    ecx,ecx
      cc5676:	31 c0                	xor    eax,eax
      cc5678:	31 d2                	xor    edx,edx
      cc567a:	64 48 8b 34 25 28 00 	mov    rsi,QWORD PTR fs:0x28
      cc5681:	00 00 
      cc5683:	48 3b 74 24 18       	cmp    rsi,QWORD PTR [rsp+0x18]
      cc5688:	75 09                	jne    cc5693 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212633>
      cc568a:	48 09 c8             	or     rax,rcx
      cc568d:	48 83 c4 20          	add    rsp,0x20
      cc5691:	5b                   	pop    rbx
      cc5692:	c3                   	ret

#### FDE 0xcc5698..0xcc56b1; hit 0xcc5698: mov    rdi,QWORD PTR [rdi+0x5e0]; score=2
      cc5670:	b2 01                	mov    dl,0x1
      cc5672:	eb 06                	jmp    cc567a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21261a>
      cc5674:	31 c9                	xor    ecx,ecx
      cc5676:	31 c0                	xor    eax,eax
      cc5678:	31 d2                	xor    edx,edx
      cc567a:	64 48 8b 34 25 28 00 	mov    rsi,QWORD PTR fs:0x28
      cc5681:	00 00 
      cc5683:	48 3b 74 24 18       	cmp    rsi,QWORD PTR [rsp+0x18]
      cc5688:	75 09                	jne    cc5693 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212633>
      cc568a:	48 09 c8             	or     rax,rcx
      cc568d:	48 83 c4 20          	add    rsp,0x20
      cc5691:	5b                   	pop    rbx
      cc5692:	c3                   	ret
      cc5693:	e8 18 a4 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc5698:	48 8b bf e0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5e0]
      cc569f:	48 85 ff             	test   rdi,rdi
      cc56a2:	74 0c                	je     cc56b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212650>
      cc56a4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc56a7:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      cc56ae:	ff e0                	jmp    rax
      cc56b0:	c3                   	ret
      cc56b1:	cc                   	int3
      cc56b2:	48 8d 35 c3 c8 78 ff 	lea    rsi,[rip+0xffffffffff78c8c3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc56b9:	48 8d 0d a9 ce 69 ff 	lea    rcx,[rip+0xffffffffff69cea9]        # 362569 <_ZTSSt12bad_any_cast@@Base-0x2dc5f>
      cc56c0:	6a 03                	push   0x3
      cc56c2:	5f                   	pop    rdi
      cc56c3:	ba 71 05 00 00       	mov    edx,0x571
      cc56c8:	31 c0                	xor    eax,eax
      cc56ca:	e9 03 12 b1 00       	jmp    17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc56cf:	cc                   	int3
      cc56d0:	48 8d 35 a5 c8 78 ff 	lea    rsi,[rip+0xffffffffff78c8a5]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc56d7:	48 8d 0d 26 6b 69 ff 	lea    rcx,[rip+0xffffffffff696b26]        # 35c204 <_ZTSSt12bad_any_cast@@Base-0x33fc4>
      cc56de:	6a 03                	push   0x3
      cc56e0:	5f                   	pop    rdi
      cc56e1:	ba 7c 05 00 00       	mov    edx,0x57c
      cc56e6:	31 c0                	xor    eax,eax
      cc56e8:	e9 e5 11 b1 00       	jmp    17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc56ed:	cc                   	int3
      cc56ee:	41 57                	push   r15
      cc56f0:	41 56                	push   r14
      cc56f2:	53                   	push   rbx
      cc56f3:	48 83 ec 50          	sub    rsp,0x50
      cc56f7:	48 89 fb             	mov    rbx,rdi

#### FDE 0xcc56ee..0xcc5822; hit 0xcc5708: mov    r14,QWORD PTR [rdi+0x5e0]; score=2
      cc56de:	6a 03                	push   0x3
      cc56e0:	5f                   	pop    rdi
      cc56e1:	ba 7c 05 00 00       	mov    edx,0x57c
      cc56e6:	31 c0                	xor    eax,eax
      cc56e8:	e9 e5 11 b1 00       	jmp    17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc56ed:	cc                   	int3
      cc56ee:	41 57                	push   r15
      cc56f0:	41 56                	push   r14
      cc56f2:	53                   	push   rbx
      cc56f3:	48 83 ec 50          	sub    rsp,0x50
      cc56f7:	48 89 fb             	mov    rbx,rdi
      cc56fa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc5701:	00 00 
      cc5703:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      cc5708:	4c 8b b7 e0 05 00 00 	mov    r14,QWORD PTR [rdi+0x5e0]
      cc570f:	4d 85 f6             	test   r14,r14
      cc5712:	74 60                	je     cc5774 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212714>
      cc5714:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
      cc5719:	6a 08                	push   0x8
      cc571b:	5e                   	pop    rsi
      cc571c:	4c 89 ff             	mov    rdi,r15
      cc571f:	e8 8e 62 86 00       	call   152b9b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370f36>
      cc5724:	49 8b 06             	mov    rax,QWORD PTR [r14]
      cc5727:	48 8d 15 d2 3d 77 ff 	lea    rdx,[rip+0xffffffffff773dd2]        # 439500 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ef4f>
      cc572e:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      cc5733:	6a 01                	push   0x1
      cc5735:	41 59                	pop    r9
      cc5737:	4c 89 f6             	mov    rsi,r14
      cc573a:	4c 89 f9             	mov    rcx,r15
      cc573d:	45 31 c0             	xor    r8d,r8d
      cc5740:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      cc5746:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      cc574b:	e8 82 c0 ff ff       	call   cc17d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20e772>
      cc5750:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      cc5755:	e8 36 87 b2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      cc575a:	48 8b bb e0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5e0]
      cc5761:	48 83 a3 e0 05 00 00 	and    QWORD PTR [rbx+0x5e0],0x0
      cc5768:	00 
      cc5769:	48 85 ff             	test   rdi,rdi
      cc576c:	74 06                	je     cc5774 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212714>
      cc576e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc5771:	ff 50 08             	call   QWORD PTR [rax+0x8]
      cc5774:	4c 8b b3 e8 05 00 00 	mov    r14,QWORD PTR [rbx+0x5e8]

#### FDE 0xcc5956..0xcc5e52; hit 0xcc5978: mov    rbx,QWORD PTR [rdi+0x5e0]; score=2
      cc594b:	e8 80 a3 da ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cc5950:	e8 5b a1 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc5955:	cc                   	int3
      cc5956:	55                   	push   rbp
      cc5957:	41 57                	push   r15
      cc5959:	41 56                	push   r14
      cc595b:	41 55                	push   r13
      cc595d:	41 54                	push   r12
      cc595f:	53                   	push   rbx
      cc5960:	48 81 ec 28 01 00 00 	sub    rsp,0x128
      cc5967:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc596e:	00 00 
      cc5970:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
      cc5977:	00 
      cc5978:	48 8b 9f e0 05 00 00 	mov    rbx,QWORD PTR [rdi+0x5e0]
      cc597f:	48 85 db             	test   rbx,rbx
      cc5982:	0f 84 0d 04 00 00    	je     cc5d95 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212d35>
      cc5988:	49 89 d4             	mov    r12,rdx
      cc598b:	49 89 fe             	mov    r14,rdi
      cc598e:	89 74 24 04          	mov    DWORD PTR [rsp+0x4],esi
      cc5992:	48 69 02 e8 03 00 00 	imul   rax,QWORD PTR [rdx],0x3e8
      cc5999:	48 99                	cqo
      cc599b:	49 f7 7c 24 08       	idiv   QWORD PTR [r12+0x8]
      cc59a0:	48 89 c5             	mov    rbp,rax
      cc59a3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      cc59a6:	48 89 df             	mov    rdi,rbx
      cc59a9:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc59af:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
      cc59b6:	00 
      cc59b7:	48 89 06             	mov    QWORD PTR [rsi],rax
      cc59ba:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
      cc59be:	4c 8d ac 24 90 00 00 	lea    r13,[rsp+0x90]
      cc59c5:	00 
      cc59c6:	4c 89 ef             	mov    rdi,r13
      cc59c9:	e8 52 e9 ec ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
      cc59ce:	48 8d 35 a7 c5 78 ff 	lea    rsi,[rip+0xffffffffff78c5a7]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc59d5:	48 8d 0d ee 52 66 ff 	lea    rcx,[rip+0xffffffffff6652ee]        # 32acca <_ZTSSt12bad_any_cast@@Base-0x654fe>
      cc59dc:	45 31 ff             	xor    r15d,r15d
      cc59df:	6a 04                	push   0x4
      cc59e1:	5f                   	pop    rdi
      cc59e2:	ba f5 04 00 00       	mov    edx,0x4f5
      cc59e7:	49 89 e8             	mov    r8,rbp
      cc59ea:	4d 89 e9             	mov    r9,r13

#### FDE 0xcc68aa..0xcc6921; hit 0xcc68c2: mov    rsi,QWORD PTR [rdi+0x5e0]; score=2
      cc688e:	41 5c                	pop    r12
      cc6890:	41 5e                	pop    r14
      cc6892:	41 5f                	pop    r15
      cc6894:	c3                   	ret
      cc6895:	e8 16 92 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc689a:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      cc689d:	e9 12 06 00 00       	jmp    cc6eb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213e54>
      cc68a2:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      cc68a5:	e9 00 00 00 00       	jmp    cc68aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21384a>
      cc68aa:	48 81 ec 88 01 00 00 	sub    rsp,0x188
      cc68b1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc68b8:	00 00 
      cc68ba:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
      cc68c1:	00 
      cc68c2:	48 8b b7 e0 05 00 00 	mov    rsi,QWORD PTR [rdi+0x5e0]
      cc68c9:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      cc68ce:	c7 02 4f 1f 00 00    	mov    DWORD PTR [rdx],0x1f4f
      cc68d4:	48 8d 05 ed 11 c7 00 	lea    rax,[rip+0xc711ed]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      cc68db:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
      cc68df:	31 c0                	xor    eax,eax
      cc68e1:	88 42 10             	mov    BYTE PTR [rdx+0x10],al
      cc68e4:	88 82 70 01 00 00    	mov    BYTE PTR [rdx+0x170],al
      cc68ea:	e8 33 00 00 00       	call   cc6922 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2138c2>
      cc68ef:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      cc68f4:	e8 81 94 f0 ff       	call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>
      cc68f9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc6900:	00 00 
      cc6902:	48 3b 84 24 80 01 00 	cmp    rax,QWORD PTR [rsp+0x180]
      cc6909:	00 
      cc690a:	75 08                	jne    cc6914 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2138b4>
      cc690c:	48 81 c4 88 01 00 00 	add    rsp,0x188
      cc6913:	c3                   	ret
      cc6914:	e8 97 91 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc6919:	48 89 c7             	mov    rdi,rax
      cc691c:	e8 84 31 db ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      cc6921:	cc                   	int3
      cc6922:	41 56                	push   r14
      cc6924:	53                   	push   rbx
      cc6925:	48 81 ec 98 01 00 00 	sub    rsp,0x198
      cc692c:	48 89 fb             	mov    rbx,rdi
      cc692f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc6936:	00 00 
      cc6938:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax

#### FDE 0xcc6eb4..0xcc6f2b; hit 0xcc6ecc: mov    rsi,QWORD PTR [rdi+0x5e0]; score=2
      cc6e98:	74 12                	je     cc6eac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213e4c>
      cc6e9a:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      cc6e9e:	e8 d7 8e f0 ff       	call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>
      cc6ea3:	48 81 c3 78 01 00 00 	add    rbx,0x178
      cc6eaa:	eb e9                	jmp    cc6e95 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213e35>
      cc6eac:	48 83 c4 08          	add    rsp,0x8
      cc6eb0:	5b                   	pop    rbx
      cc6eb1:	41 5e                	pop    r14
      cc6eb3:	c3                   	ret
      cc6eb4:	48 81 ec 88 01 00 00 	sub    rsp,0x188
      cc6ebb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc6ec2:	00 00 
      cc6ec4:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
      cc6ecb:	00 
      cc6ecc:	48 8b b7 e0 05 00 00 	mov    rsi,QWORD PTR [rdi+0x5e0]
      cc6ed3:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      cc6ed8:	c7 02 4e 1f 00 00    	mov    DWORD PTR [rdx],0x1f4e
      cc6ede:	48 8d 05 e3 0b c7 00 	lea    rax,[rip+0xc70be3]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
      cc6ee5:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
      cc6ee9:	31 c0                	xor    eax,eax
      cc6eeb:	88 42 10             	mov    BYTE PTR [rdx+0x10],al
      cc6eee:	88 82 70 01 00 00    	mov    BYTE PTR [rdx+0x170],al
      cc6ef4:	e8 29 fa ff ff       	call   cc6922 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2138c2>
      cc6ef9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      cc6efe:	e8 77 8e f0 ff       	call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>
      cc6f03:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc6f0a:	00 00 
      cc6f0c:	48 3b 84 24 80 01 00 	cmp    rax,QWORD PTR [rsp+0x180]
      cc6f13:	00 
      cc6f14:	75 08                	jne    cc6f1e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213ebe>
      cc6f16:	48 81 c4 88 01 00 00 	add    rsp,0x188
      cc6f1d:	c3                   	ret
      cc6f1e:	e8 8d 8b b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc6f23:	48 89 c7             	mov    rdi,rax
      cc6f26:	e8 7a 2b db ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      cc6f2b:	41 56                	push   r14
      cc6f2d:	53                   	push   rbx
      cc6f2e:	50                   	push   rax
      cc6f2f:	48 89 f3             	mov    rbx,rsi
      cc6f32:	49 89 fe             	mov    r14,rdi
      cc6f35:	48 89 d6             	mov    rsi,rdx
      cc6f38:	48 89 ca             	mov    rdx,rcx
      cc6f3b:	e8 02 2e b1 00       	call   17d9d42 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5b63>

#### FDE 0xcc6f70..0xcc76ac; hit 0xcc74f0: mov    rsi,QWORD PTR [rax+0x5e0]; score=2
      cc74b5:	48 c1 e8 20          	shr    rax,0x20
      cc74b9:	84 c0                	test   al,al
      cc74bb:	0f 84 2e 01 00 00    	je     cc75ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21458f>
      cc74c1:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      cc74c8:	00 
      cc74c9:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      cc74cc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc74cf:	ff 50 38             	call   QWORD PTR [rax+0x38]
      cc74d2:	48 85 c0             	test   rax,rax
      cc74d5:	0f 85 14 01 00 00    	jne    cc75ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21458f>
      cc74db:	31 c0                	xor    eax,eax
      cc74dd:	88 84 24 a0 01 00 00 	mov    BYTE PTR [rsp+0x1a0],al
      cc74e4:	88 84 24 e0 01 00 00 	mov    BYTE PTR [rsp+0x1e0],al
      cc74eb:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
      cc74f0:	48 8b b0 e0 05 00 00 	mov    rsi,QWORD PTR [rax+0x5e0]
      cc74f7:	48 85 f6             	test   rsi,rsi
      cc74fa:	0f 84 c8 00 00 00    	je     cc75c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x214568>
      cc7500:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc7503:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
      cc750a:	00 
      cc750b:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      cc7511:	80 bc 24 e0 01 00 00 	cmp    BYTE PTR [rsp+0x1e0],0x0
      cc7518:	00 
      cc7519:	74 36                	je     cc7551 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2144f1>
      cc751b:	48 8d 9c 24 a0 01 00 	lea    rbx,[rsp+0x1a0]
      cc7522:	00 
      cc7523:	4c 8d b4 24 60 01 00 	lea    r14,[rsp+0x160]
      cc752a:	00 
      cc752b:	48 89 df             	mov    rdi,rbx
      cc752e:	4c 89 f6             	mov    rsi,r14
      cc7531:	e8 1c 0a e4 ff       	call   b07f52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54ef2>
      cc7536:	41 8a 46 38          	mov    al,BYTE PTR [r14+0x38]
      cc753a:	88 43 38             	mov    BYTE PTR [rbx+0x38],al
      cc753d:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
      cc7542:	41 0f 10 4e 28       	movups xmm1,XMMWORD PTR [r14+0x28]
      cc7547:	0f 11 4b 28          	movups XMMWORD PTR [rbx+0x28],xmm1
      cc754b:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
      cc754f:	eb 6a                	jmp    cc75bb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21455b>
      cc7551:	0f 28 84 24 60 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x160]
      cc7558:	00 
      cc7559:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      cc7560:	00 
      cc7561:	48 8b 84 24 70 01 00 	mov    rax,QWORD PTR [rsp+0x170]

#### FDE 0xcc76ac..0xcc8ae4; hit 0xcc781f: mov    rdi,QWORD PTR [r12+0x5e0]; score=2
      cc77ef:	41 88 84 24 08 06 00 	mov    BYTE PTR [r12+0x608],al
      cc77f6:	00 
      cc77f7:	74 1f                	je     cc7818 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2147b8>
      cc77f9:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      cc77fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc77ff:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc7805:	49 8b bc 24 38 07 00 	mov    rdi,QWORD PTR [r12+0x738]
      cc780c:	00 
      cc780d:	48 85 ff             	test   rdi,rdi
      cc7810:	74 06                	je     cc7818 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2147b8>
      cc7812:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc7815:	ff 50 28             	call   QWORD PTR [rax+0x28]
      cc7818:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      cc781b:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      cc781f:	49 8b bc 24 e0 05 00 	mov    rdi,QWORD PTR [r12+0x5e0]
      cc7826:	00 
      cc7827:	49 89 84 24 e0 05 00 	mov    QWORD PTR [r12+0x5e0],rax
      cc782e:	00 
      cc782f:	48 85 ff             	test   rdi,rdi
      cc7832:	74 06                	je     cc783a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2147da>
      cc7834:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc7837:	ff 50 08             	call   QWORD PTR [rax+0x8]
      cc783a:	f0 41 ff 84 24 28 07 	lock inc DWORD PTR [r12+0x728]
      cc7841:	00 00 
      cc7843:	49 8b 06             	mov    rax,QWORD PTR [r14]
      cc7846:	31 f6                	xor    esi,esi
      cc7848:	80 b8 78 01 00 00 00 	cmp    BYTE PTR [rax+0x178],0x0
      cc784f:	48 63 80 74 01 00 00 	movsxd rax,DWORD PTR [rax+0x174]
      cc7856:	48 0f 45 f0          	cmovne rsi,rax
      cc785a:	49 83 bc 24 58 08 00 	cmp    QWORD PTR [r12+0x858],0x0
      cc7861:	00 00 
      cc7863:	7f 0b                	jg     cc7870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x214810>
      cc7865:	49 83 bc 24 60 08 00 	cmp    QWORD PTR [r12+0x860],0x0
      cc786c:	00 00 
      cc786e:	7e 49                	jle    cc78b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x214859>
      cc7870:	80 bc 24 c0 05 00 00 	cmp    BYTE PTR [rsp+0x5c0],0x0
      cc7877:	00 
      cc7878:	74 37                	je     cc78b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x214851>
      cc787a:	41 c6 84 24 f8 07 00 	mov    BYTE PTR [r12+0x7f8],0x1
      cc7881:	00 01 
      cc7883:	49 89 b4 24 00 08 00 	mov    QWORD PTR [r12+0x800],rsi
      cc788a:	00 
      cc788b:	eb 2c                	jmp    cc78b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x214859>

#### FDE 0xcc8db6..0xcc905f; hit 0xcc8e56: mov    r15,QWORD PTR [rbx+0x5e0]; score=2
      cc8e10:	48 89 93 00 06 00 00 	mov    QWORD PTR [rbx+0x600],rdx
      cc8e17:	75 07                	jne    cc8e20 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215dc0>
      cc8e19:	c6 83 08 06 00 00 01 	mov    BYTE PTR [rbx+0x608],0x1
      cc8e20:	48 8b b3 e8 05 00 00 	mov    rsi,QWORD PTR [rbx+0x5e8]
      cc8e27:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      cc8e2c:	4c 89 f7             	mov    rdi,r14
      cc8e2f:	e8 f6 bf 7e 00       	call   14b4e2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fa3ae>
      cc8e34:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      cc8e38:	48 85 ff             	test   rdi,rdi
      cc8e3b:	0f 84 87 01 00 00    	je     cc8fc8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215f68>
      cc8e41:	48 83 bb 38 07 00 00 	cmp    QWORD PTR [rbx+0x738],0x0
      cc8e48:	00 
      cc8e49:	0f 85 79 01 00 00    	jne    cc8fc8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215f68>
      cc8e4f:	48 8d 83 30 07 00 00 	lea    rax,[rbx+0x730]
      cc8e56:	4c 8b bb e0 05 00 00 	mov    r15,QWORD PTR [rbx+0x5e0]
      cc8e5d:	4d 85 ff             	test   r15,r15
      cc8e60:	0f 84 55 01 00 00    	je     cc8fbb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215f5b>
      cc8e66:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      cc8e6b:	4c 8b a3 e8 05 00 00 	mov    r12,QWORD PTR [rbx+0x5e8]
      cc8e72:	4c 8b b3 88 07 00 00 	mov    r14,QWORD PTR [rbx+0x788]
      cc8e79:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc8e7c:	ff 50 28             	call   QWORD PTR [rax+0x28]
      cc8e7f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      cc8e84:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
      cc8e89:	49 8b 07             	mov    rax,QWORD PTR [r15]
      cc8e8c:	4c 89 ff             	mov    rdi,r15
      cc8e8f:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc8e95:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
      cc8e9c:	00 
      cc8e9d:	48 89 06             	mov    QWORD PTR [rsi],rax
      cc8ea0:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
      cc8ea4:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      cc8ea9:	e8 74 1d ec ff       	call   b8ac22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bc2>
      cc8eae:	89 c5                	mov    ebp,eax
      cc8eb0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      cc8eb4:	4c 89 e7             	mov    rdi,r12
      cc8eb7:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      cc8ebd:	49 89 c5             	mov    r13,rax
      cc8ec0:	49 8b 07             	mov    rax,QWORD PTR [r15]
      cc8ec3:	4c 89 ff             	mov    rdi,r15
      cc8ec6:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      cc8ecc:	49 83 c5 10          	add    r13,0x10
      cc8ed0:	48 83 c0 10          	add    rax,0x10

#### FDE 0xcc9090..0xcc90b0; hit 0xcc9096: mov    r8,QWORD PTR [rdi+0x5e0]; score=2
      cc9060:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      cc9063:	85 c9                	test   ecx,ecx
      cc9065:	74 1a                	je     cc9081 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216021>
      cc9067:	83 7e 68 0c          	cmp    DWORD PTR [rsi+0x68],0xc
      cc906b:	74 14                	je     cc9081 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216021>
      cc906d:	48 01 97 48 06 00 00 	add    QWORD PTR [rdi+0x648],rdx
      cc9074:	83 7e 68 04          	cmp    DWORD PTR [rsi+0x68],0x4
      cc9078:	75 07                	jne    cc9081 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216021>
      cc907a:	48 01 97 50 06 00 00 	add    QWORD PTR [rdi+0x650],rdx
      cc9081:	48 81 c7 10 01 00 00 	add    rdi,0x110
      cc9088:	0f b6 c9             	movzx  ecx,cl
      cc908b:	e9 0c 08 00 00       	jmp    cc989c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21683c>
      cc9090:	48 89 f8             	mov    rax,rdi
      cc9093:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      cc9096:	4c 8b 87 e0 05 00 00 	mov    r8,QWORD PTR [rdi+0x5e0]
      cc909d:	4c 3b 40 08          	cmp    r8,QWORD PTR [rax+0x8]
      cc90a1:	74 01                	je     cc90a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216044>
      cc90a3:	c3                   	ret
      cc90a4:	48 81 c7 c8 02 00 00 	add    rdi,0x2c8
      cc90ab:	e9 64 06 00 00       	jmp    cc9714 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2166b4>
      cc90b0:	48 89 f8             	mov    rax,rdi
      cc90b3:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      cc90b6:	48 8b 8f e0 05 00 00 	mov    rcx,QWORD PTR [rdi+0x5e0]
      cc90bd:	48 3b 48 08          	cmp    rcx,QWORD PTR [rax+0x8]
      cc90c1:	74 01                	je     cc90c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216064>
      cc90c3:	c3                   	ret
      cc90c4:	48 81 c7 20 03 00 00 	add    rdi,0x320
      cc90cb:	e9 0a 05 00 00       	jmp    cc95da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21657a>
      cc90d0:	41 57                	push   r15
      cc90d2:	41 56                	push   r14
      cc90d4:	53                   	push   rbx
      cc90d5:	48 81 ec 70 01 00 00 	sub    rsp,0x170
      cc90dc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc90e3:	00 00 
      cc90e5:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
      cc90ec:	00 
      cc90ed:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      cc90f0:	48 8b 83 e0 05 00 00 	mov    rax,QWORD PTR [rbx+0x5e0]
      cc90f7:	48 3b 47 08          	cmp    rax,QWORD PTR [rdi+0x8]
      cc90fb:	75 37                	jne    cc9134 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2160d4>
      cc90fd:	49 89 f6             	mov    r14,rsi
      cc9100:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
      cc9107:	e8 ae 03 00 00       	call   cc94ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21645a>

#### FDE 0xcc90b0..0xcc90d0; hit 0xcc90b6: mov    rcx,QWORD PTR [rdi+0x5e0]; score=2
      cc907a:	48 01 97 50 06 00 00 	add    QWORD PTR [rdi+0x650],rdx
      cc9081:	48 81 c7 10 01 00 00 	add    rdi,0x110
      cc9088:	0f b6 c9             	movzx  ecx,cl
      cc908b:	e9 0c 08 00 00       	jmp    cc989c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21683c>
      cc9090:	48 89 f8             	mov    rax,rdi
      cc9093:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      cc9096:	4c 8b 87 e0 05 00 00 	mov    r8,QWORD PTR [rdi+0x5e0]
      cc909d:	4c 3b 40 08          	cmp    r8,QWORD PTR [rax+0x8]
      cc90a1:	74 01                	je     cc90a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216044>
      cc90a3:	c3                   	ret
      cc90a4:	48 81 c7 c8 02 00 00 	add    rdi,0x2c8
      cc90ab:	e9 64 06 00 00       	jmp    cc9714 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2166b4>
      cc90b0:	48 89 f8             	mov    rax,rdi
      cc90b3:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      cc90b6:	48 8b 8f e0 05 00 00 	mov    rcx,QWORD PTR [rdi+0x5e0]
      cc90bd:	48 3b 48 08          	cmp    rcx,QWORD PTR [rax+0x8]
      cc90c1:	74 01                	je     cc90c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216064>
      cc90c3:	c3                   	ret
      cc90c4:	48 81 c7 20 03 00 00 	add    rdi,0x320
      cc90cb:	e9 0a 05 00 00       	jmp    cc95da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21657a>
      cc90d0:	41 57                	push   r15
      cc90d2:	41 56                	push   r14
      cc90d4:	53                   	push   rbx
      cc90d5:	48 81 ec 70 01 00 00 	sub    rsp,0x170
      cc90dc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc90e3:	00 00 
      cc90e5:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
      cc90ec:	00 
      cc90ed:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      cc90f0:	48 8b 83 e0 05 00 00 	mov    rax,QWORD PTR [rbx+0x5e0]
      cc90f7:	48 3b 47 08          	cmp    rax,QWORD PTR [rdi+0x8]
      cc90fb:	75 37                	jne    cc9134 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2160d4>
      cc90fd:	49 89 f6             	mov    r14,rsi
      cc9100:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
      cc9107:	e8 ae 03 00 00       	call   cc94ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21645a>
      cc910c:	48 81 c3 d8 04 00 00 	add    rbx,0x4d8
      cc9113:	49 89 e7             	mov    r15,rsp
      cc9116:	4c 89 ff             	mov    rdi,r15
      cc9119:	4c 89 f6             	mov    rsi,r14
      cc911c:	e8 b9 89 ff ff       	call   cc1ada <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20ea7a>
      cc9121:	48 89 df             	mov    rdi,rbx
      cc9124:	4c 89 fe             	mov    rsi,r15
      cc9127:	e8 0a c7 ff ff       	call   cc5836 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2127d6>

#### FDE 0xcc90d0..0xcc917f; hit 0xcc90f0: mov    rax,QWORD PTR [rbx+0x5e0]; score=2
      cc90bd:	48 3b 48 08          	cmp    rcx,QWORD PTR [rax+0x8]
      cc90c1:	74 01                	je     cc90c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216064>
      cc90c3:	c3                   	ret
      cc90c4:	48 81 c7 20 03 00 00 	add    rdi,0x320
      cc90cb:	e9 0a 05 00 00       	jmp    cc95da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21657a>
      cc90d0:	41 57                	push   r15
      cc90d2:	41 56                	push   r14
      cc90d4:	53                   	push   rbx
      cc90d5:	48 81 ec 70 01 00 00 	sub    rsp,0x170
      cc90dc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc90e3:	00 00 
      cc90e5:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
      cc90ec:	00 
      cc90ed:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      cc90f0:	48 8b 83 e0 05 00 00 	mov    rax,QWORD PTR [rbx+0x5e0]
      cc90f7:	48 3b 47 08          	cmp    rax,QWORD PTR [rdi+0x8]
      cc90fb:	75 37                	jne    cc9134 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2160d4>
      cc90fd:	49 89 f6             	mov    r14,rsi
      cc9100:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
      cc9107:	e8 ae 03 00 00       	call   cc94ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21645a>
      cc910c:	48 81 c3 d8 04 00 00 	add    rbx,0x4d8
      cc9113:	49 89 e7             	mov    r15,rsp
      cc9116:	4c 89 ff             	mov    rdi,r15
      cc9119:	4c 89 f6             	mov    rsi,r14
      cc911c:	e8 b9 89 ff ff       	call   cc1ada <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20ea7a>
      cc9121:	48 89 df             	mov    rdi,rbx
      cc9124:	4c 89 fe             	mov    rsi,r15
      cc9127:	e8 0a c7 ff ff       	call   cc5836 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2127d6>
      cc912c:	48 89 e7             	mov    rdi,rsp
      cc912f:	e8 46 6c f0 ff       	call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>
      cc9134:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc913b:	00 00 
      cc913d:	48 3b 84 24 68 01 00 	cmp    rax,QWORD PTR [rsp+0x168]
      cc9144:	00 
      cc9145:	75 33                	jne    cc917a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21611a>
      cc9147:	48 81 c4 70 01 00 00 	add    rsp,0x170
      cc914e:	5b                   	pop    rbx
      cc914f:	41 5e                	pop    r14
      cc9151:	41 5f                	pop    r15
      cc9153:	c3                   	ret
      cc9154:	48 89 c3             	mov    rbx,rax
      cc9157:	48 89 e7             	mov    rdi,rsp
      cc915a:	e8 1b 6c f0 ff       	call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>

#### FDE 0xcc9180..0xcc91a0; hit 0xcc9186: mov    rcx,QWORD PTR [rdi+0x5e0]; score=2
      cc9154:	48 89 c3             	mov    rbx,rax
      cc9157:	48 89 e7             	mov    rdi,rsp
      cc915a:	e8 1b 6c f0 ff       	call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>
      cc915f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc9166:	00 00 
      cc9168:	48 3b 84 24 68 01 00 	cmp    rax,QWORD PTR [rsp+0x168]
      cc916f:	00 
      cc9170:	75 08                	jne    cc917a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21611a>
      cc9172:	48 89 df             	mov    rdi,rbx
      cc9175:	e8 56 6b da ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cc917a:	e8 31 69 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc917f:	cc                   	int3
      cc9180:	48 89 f8             	mov    rax,rdi
      cc9183:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      cc9186:	48 8b 8f e0 05 00 00 	mov    rcx,QWORD PTR [rdi+0x5e0]
      cc918d:	48 3b 48 08          	cmp    rcx,QWORD PTR [rax+0x8]
      cc9191:	74 01                	je     cc9194 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216134>
      cc9193:	c3                   	ret
      cc9194:	48 81 c7 d0 03 00 00 	add    rdi,0x3d0
      cc919b:	e9 1a 03 00 00       	jmp    cc94ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21645a>
      cc91a0:	41 57                	push   r15
      cc91a2:	41 56                	push   r14
      cc91a4:	41 54                	push   r12
      cc91a6:	53                   	push   rbx
      cc91a7:	48 81 ec 78 01 00 00 	sub    rsp,0x178
      cc91ae:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc91b5:	00 00 
      cc91b7:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
      cc91be:	00 
      cc91bf:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
      cc91c2:	49 8b 86 e0 05 00 00 	mov    rax,QWORD PTR [r14+0x5e0]
      cc91c9:	48 3b 47 08          	cmp    rax,QWORD PTR [rdi+0x8]
      cc91cd:	75 3e                	jne    cc920d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2161ad>
      cc91cf:	48 89 f3             	mov    rbx,rsi
      cc91d2:	4d 8d be d8 04 00 00 	lea    r15,[r14+0x4d8]
      cc91d9:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
      cc91de:	4c 89 e7             	mov    rdi,r12
      cc91e1:	e8 f4 88 ff ff       	call   cc1ada <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20ea7a>
      cc91e6:	4c 89 ff             	mov    rdi,r15
      cc91e9:	4c 89 e6             	mov    rsi,r12
      cc91ec:	e8 45 c6 ff ff       	call   cc5836 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2127d6>
      cc91f1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      cc91f6:	e8 7f 6b f0 ff       	call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>

#### FDE 0xcc91a0..0xcc925c; hit 0xcc91c2: mov    rax,QWORD PTR [r14+0x5e0]; score=2
      cc9191:	74 01                	je     cc9194 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216134>
      cc9193:	c3                   	ret
      cc9194:	48 81 c7 d0 03 00 00 	add    rdi,0x3d0
      cc919b:	e9 1a 03 00 00       	jmp    cc94ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21645a>
      cc91a0:	41 57                	push   r15
      cc91a2:	41 56                	push   r14
      cc91a4:	41 54                	push   r12
      cc91a6:	53                   	push   rbx
      cc91a7:	48 81 ec 78 01 00 00 	sub    rsp,0x178
      cc91ae:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc91b5:	00 00 
      cc91b7:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
      cc91be:	00 
      cc91bf:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
      cc91c2:	49 8b 86 e0 05 00 00 	mov    rax,QWORD PTR [r14+0x5e0]
      cc91c9:	48 3b 47 08          	cmp    rax,QWORD PTR [rdi+0x8]
      cc91cd:	75 3e                	jne    cc920d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2161ad>
      cc91cf:	48 89 f3             	mov    rbx,rsi
      cc91d2:	4d 8d be d8 04 00 00 	lea    r15,[r14+0x4d8]
      cc91d9:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
      cc91de:	4c 89 e7             	mov    rdi,r12
      cc91e1:	e8 f4 88 ff ff       	call   cc1ada <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20ea7a>
      cc91e6:	4c 89 ff             	mov    rdi,r15
      cc91e9:	4c 89 e6             	mov    rsi,r12
      cc91ec:	e8 45 c6 ff ff       	call   cc5836 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2127d6>
      cc91f1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      cc91f6:	e8 7f 6b f0 ff       	call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>
      cc91fb:	49 81 c6 28 04 00 00 	add    r14,0x428
      cc9202:	4c 89 f7             	mov    rdi,r14
      cc9205:	48 89 de             	mov    rsi,rbx
      cc9208:	e8 ad 02 00 00       	call   cc94ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21645a>
      cc920d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc9214:	00 00 
      cc9216:	48 3b 84 24 70 01 00 	cmp    rax,QWORD PTR [rsp+0x170]
      cc921d:	00 
      cc921e:	75 37                	jne    cc9257 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2161f7>
      cc9220:	48 81 c4 78 01 00 00 	add    rsp,0x178
      cc9227:	5b                   	pop    rbx
      cc9228:	41 5c                	pop    r12
      cc922a:	41 5e                	pop    r14
      cc922c:	41 5f                	pop    r15
      cc922e:	c3                   	ret
      cc922f:	48 89 c3             	mov    rbx,rax

### Candidate constructor FDEs: stores into dependency first word

## Candidate address point 0x1867b28
- +0x28 = 0xb00302
- return shape = embedded this+0x50

### Candidate vtable slots
- +0x0: 0x135c70c FDE=(20301580, 20301637)
- +0x8: 0x135c746 FDE=(20301638, 20301656)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xb00302 FDE=(11535106, 11535111)
- +0x30: 0x11ca6fe FDE=(18654974, 18654982)
- +0x38: 0x135c758 FDE=(20301656, 20301681)
- +0x40: 0x10d4edc FDE=(17649372, 17649397)
- +0x48: 0xbf7896 FDE=(12548246, 12548251)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x135c5b0 FDE=(20301232, 20301251)
- +0x68: 0x135c5c4 FDE=(20301252, 20301270)
- +0x70: 0x135c5d6 FDE=(20301270, 20301322)
- +0x78: 0x135c60a FDE=(20301322, 20301348)
- +0x80: 0x135c2fa FDE=(20300538, 20300547)
- +0x88: 0x135c304 FDE=(20300548, 20300570)
- +0x90: 0x135c624 FDE=(20301348, 20301580)
- +0x98: 0x0 FDE=None
- +0xa0: 0x0 FDE=None
- +0xa8: 0x135c286 FDE=(20300422, 20300441)
- +0xb0: 0x135c29a FDE=(20300442, 20300460)
- +0xb8: 0x135c2ac FDE=(20300460, 20300512)
- +0xc0: 0x135c2e0 FDE=(20300512, 20300538)

### Materializations of candidate vptr (2 direct comment refs)
#### 0x135a7e1 FDE=(20293452, 20300282)
     135a7ac:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
     135a7b1:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     135a7b6:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     135a7bd:	00 
     135a7be:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
     135a7c5:	00 
     135a7c6:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]
     135a7cd:	00 
     135a7ce:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     135a7d3:	bf e0 00 00 00       	mov    edi,0xe0
     135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
     135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
     135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
     135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
     135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
     135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
     135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
     135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     135a80e:	00 
     135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
     135a816:	00 
     135a817:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135a81e:	00 
     135a81f:	48 8d a8 d0 00 00 00 	lea    rbp,[rax+0xd0]
     135a826:	48 83 a0 d0 00 00 00 	and    QWORD PTR [rax+0xd0],0x0
     135a82d:	00 
     135a82e:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
     135a833:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135a838:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135a83d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135a842:	f3 0f 7f 40 58       	movdqu XMMWORD PTR [rax+0x58],xmm0
     135a847:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135a84b:	48 83 ec 10          	sub    rsp,0x10
     135a84f:	83 24 24 00          	and    DWORD PTR [rsp],0x0

#### 0x135c710 FDE=(20301580, 20301637)
     135c6ed:	41 5f                	pop    r15
     135c6ef:	5d                   	pop    rbp
     135c6f0:	c3                   	ret
     135c6f1:	48 89 c3             	mov    rbx,rax
     135c6f4:	4c 89 f7             	mov    rdi,r14
     135c6f7:	e8 14 19 49 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     135c6fc:	4c 89 f7             	mov    rdi,r14
     135c6ff:	e8 18 1d 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     135c704:	48 89 df             	mov    rdi,rbx
     135c707:	e8 c4 35 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135c70c:	53                   	push   rbx
     135c70d:	48 89 fb             	mov    rbx,rdi
     135c710:	48 8d 05 11 b4 50 00 	lea    rax,[rip+0x50b411]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135c717:	48 89 07             	mov    QWORD PTR [rdi],rax
     135c71a:	48 81 c7 d0 00 00 00 	add    rdi,0xd0
     135c721:	e8 58 fb ff ff       	call   135c27e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1802>
     135c726:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     135c72a:	e8 3f bb 82 ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
     135c72f:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     135c733:	e8 d8 63 79 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     135c738:	48 83 c3 28          	add    rbx,0x28
     135c73c:	48 89 df             	mov    rdi,rbx
     135c73f:	5b                   	pop    rbx
     135c740:	e9 e7 fa ff ff       	jmp    135c22c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b0>
     135c745:	cc                   	int3
     135c746:	53                   	push   rbx
     135c747:	48 89 fb             	mov    rbx,rdi
     135c74a:	e8 bd ff ff ff       	call   135c70c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1c90>
     135c74f:	48 89 df             	mov    rdi,rbx
     135c752:	5b                   	pop    rbx
     135c753:	e9 c8 17 49 00       	jmp    17edf20 <_ZdlPv@plt>
     135c758:	48 89 f8             	mov    rax,rdi
     135c75b:	48 8b 4e 48          	mov    rcx,QWORD PTR [rsi+0x48]
     135c75f:	0f 28 46 40          	movaps xmm0,XMMWORD PTR [rsi+0x40]
     135c763:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     135c766:	48 85 c9             	test   rcx,rcx
     135c769:	74 05                	je     135c770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1cf4>

### Writes/initialization around returned dependency offset +0x50
#### FDE 0x9d8620..0x9d867c; hit 0x9d864f: movdqu xmm0,XMMWORD PTR [rdi+0x50]; score=2
      9d861d:	c3                   	ret
      9d861e:	cc                   	int3
      9d861f:	cc                   	int3
      9d8620:	f3 0f 6f 87 80 00 00 	movdqu xmm0,XMMWORD PTR [rdi+0x80]
      9d8627:	00 
      9d8628:	f3 0f 6f 8f a0 00 00 	movdqu xmm1,XMMWORD PTR [rdi+0xa0]
      9d862f:	00 
      9d8630:	f3 0f 6f 57 70       	movdqu xmm2,XMMWORD PTR [rdi+0x70]
      9d8635:	f3 0f 6f 9f 90 00 00 	movdqu xmm3,XMMWORD PTR [rdi+0x90]
      9d863c:	00 
      9d863d:	f3 0f 6f 67 30       	movdqu xmm4,XMMWORD PTR [rdi+0x30]
      9d8642:	66 0f d4 e2          	paddq  xmm4,xmm2
      9d8646:	f3 0f 6f 57 40       	movdqu xmm2,XMMWORD PTR [rdi+0x40]
      9d864b:	66 0f d4 d0          	paddq  xmm2,xmm0
      9d864f:	f3 0f 6f 47 50       	movdqu xmm0,XMMWORD PTR [rdi+0x50]
      9d8654:	66 0f d4 c3          	paddq  xmm0,xmm3
      9d8658:	66 0f d4 c4          	paddq  xmm0,xmm4
      9d865c:	f3 0f 6f 5f 60       	movdqu xmm3,XMMWORD PTR [rdi+0x60]
      9d8661:	66 0f d4 d9          	paddq  xmm3,xmm1
      9d8665:	66 0f d4 da          	paddq  xmm3,xmm2
      9d8669:	66 0f d4 d8          	paddq  xmm3,xmm0
      9d866d:	66 0f 70 c3 ee       	pshufd xmm0,xmm3,0xee
      9d8672:	66 0f d4 c3          	paddq  xmm0,xmm3
      9d8676:	66 48 0f 7e c0       	movq   rax,xmm0
      9d867b:	c3                   	ret
      9d867c:	cc                   	int3
      9d867d:	cc                   	int3
      9d867e:	cc                   	int3
      9d867f:	cc                   	int3
      9d8680:	53                   	push   rbx
      9d8681:	48 89 fb             	mov    rbx,rdi
      9d8684:	48 0f af d1          	imul   rdx,rcx
      9d8688:	48 8b 47 28          	mov    rax,QWORD PTR [rdi+0x28]
      9d868c:	48 89 c1             	mov    rcx,rax
      9d868f:	48 f7 d9             	neg    rcx
      9d8692:	85 f6                	test   esi,esi
      9d8694:	0f 84 bf 01 00 00    	je     9d8859 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x689>
      9d869a:	83 fe 01             	cmp    esi,0x1
      9d869d:	0f 84 7f 01 00 00    	je     9d8822 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x652>
      9d86a3:	83 fe 02             	cmp    esi,0x2
      9d86a6:	0f 85 a7 01 00 00    	jne    9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>
      9d86ac:	48 8d 83 30 05 00 00 	lea    rax,[rbx+0x530]
      9d86b3:	8b 8b 40 05 00 00    	mov    ecx,DWORD PTR [rbx+0x540]

#### FDE 0x9d8fc0..0x9d9717; hit 0x9d92d1: mov    QWORD PTR [rcx+0x50],rax; score=2
      9d929d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      9d92a1:	4c 8b 17             	mov    r10,QWORD PTR [rdi]
      9d92a4:	48 63 94 24 d8 00 00 	movsxd rdx,DWORD PTR [rsp+0xd8]
      9d92ab:	00 
      9d92ac:	b9 04 00 00 00       	mov    ecx,0x4
      9d92b1:	31 f6                	xor    esi,esi
      9d92b3:	41 b8 02 00 00 00    	mov    r8d,0x2
      9d92b9:	45 31 c9             	xor    r9d,r9d
      9d92bc:	6a 00                	push   0x0
      9d92be:	48 8d 05 80 14 96 ff 	lea    rax,[rip+0xffffffffff961480]        # 33a745 <_ZTSSt12bad_any_cast@@Base-0x55a83>
      9d92c5:	50                   	push   rax
      9d92c6:	41 ff 12             	call   QWORD PTR [r10]
      9d92c9:	48 83 c4 10          	add    rsp,0x10
      9d92cd:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
      9d92d1:	48 89 41 50          	mov    QWORD PTR [rcx+0x50],rax
      9d92d5:	4c 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],r15
      9d92da:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
      9d92df:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      9d92e4:	48 89 74 24 78       	mov    QWORD PTR [rsp+0x78],rsi
      9d92e9:	89 9c 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],ebx
      9d92f0:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
      9d92f4:	89 84 24 84 00 00 00 	mov    DWORD PTR [rsp+0x84],eax
      9d92fb:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      9d9300:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      9d9307:	00 
      9d9308:	41 8b 46 20          	mov    eax,DWORD PTR [r14+0x20]
      9d930c:	89 84 24 90 00 00 00 	mov    DWORD PTR [rsp+0x90],eax
      9d9313:	44 89 a4 24 94 00 00 	mov    DWORD PTR [rsp+0x94],r12d
      9d931a:	00 
      9d931b:	c7 84 24 98 00 00 00 	mov    DWORD PTR [rsp+0x98],0x0
      9d9322:	00 00 00 00 
      9d9326:	89 ac 24 9c 00 00 00 	mov    DWORD PTR [rsp+0x9c],ebp
      9d932d:	48 c7 44 24 58 00 00 	mov    QWORD PTR [rsp+0x58],0x0
      9d9334:	00 00 
      9d9336:	48 8d 05 d3 fb ff ff 	lea    rax,[rip+0xfffffffffffffbd3]        # 9d8f10 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xd40>
      9d933d:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      9d9342:	48 8d 44 24 68       	lea    rax,[rsp+0x68]
      9d9347:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      9d934c:	4c 89 f7             	mov    rdi,r14
      9d934f:	89 da                	mov    edx,ebx
      9d9351:	e8 8a 1c 00 00       	call   9dafe0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x2e10>
      9d9356:	48 85 d2             	test   rdx,rdx
      9d9359:	0f 84 74 02 00 00    	je     9d95d3 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x1403>

#### FDE 0x9d9e60..0x9d9e77; hit 0x9d9e63: mov    rax,QWORD PTR [rax+0x50]; score=2
      9d9e4d:	41 5e                	pop    r14
      9d9e4f:	41 5f                	pop    r15
      9d9e51:	c3                   	ret
      9d9e52:	e8 59 5c e1 00       	call   17efab0 <__stack_chk_fail@plt>
      9d9e57:	cc                   	int3
      9d9e58:	cc                   	int3
      9d9e59:	cc                   	int3
      9d9e5a:	cc                   	int3
      9d9e5b:	cc                   	int3
      9d9e5c:	cc                   	int3
      9d9e5d:	cc                   	int3
      9d9e5e:	cc                   	int3
      9d9e5f:	cc                   	int3
      9d9e60:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      9d9e63:	48 8b 40 50          	mov    rax,QWORD PTR [rax+0x50]
      9d9e67:	48 63 4e 08          	movsxd rcx,DWORD PTR [rsi+0x8]
      9d9e6b:	8b 17                	mov    edx,DWORD PTR [rdi]
      9d9e6d:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      9d9e70:	83 46 08 01          	add    DWORD PTR [rsi+0x8],0x1
      9d9e74:	31 c0                	xor    eax,eax
      9d9e76:	c3                   	ret
      9d9e77:	cc                   	int3
      9d9e78:	cc                   	int3
      9d9e79:	cc                   	int3
      9d9e7a:	cc                   	int3
      9d9e7b:	cc                   	int3
      9d9e7c:	cc                   	int3
      9d9e7d:	cc                   	int3
      9d9e7e:	cc                   	int3
      9d9e7f:	cc                   	int3
      9d9e80:	41 57                	push   r15
      9d9e82:	41 56                	push   r14
      9d9e84:	41 54                	push   r12
      9d9e86:	53                   	push   rbx
      9d9e87:	50                   	push   rax
      9d9e88:	49 89 ce             	mov    r14,rcx
      9d9e8b:	48 89 d3             	mov    rbx,rdx
      9d9e8e:	49 89 f7             	mov    r15,rsi
      9d9e91:	8b 52 18             	mov    edx,DWORD PTR [rdx+0x18]
      9d9e94:	85 d2                	test   edx,edx
      9d9e96:	74 4f                	je     9d9ee7 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x1d17>
      9d9e98:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      9d9e9c:	48 89 df             	mov    rdi,rbx

#### FDE 0x9da070..0x9da7e5; hit 0x9da2a2: mov    rcx,QWORD PTR [r12+0x50]; score=2
      9da262:	0f b6 44 a9 02       	movzx  eax,BYTE PTR [rcx+rbp*4+0x2]
      9da267:	0f b6 4c a9 03       	movzx  ecx,BYTE PTR [rcx+rbp*4+0x3]
      9da26c:	49 8b 54 24 58       	mov    rdx,QWORD PTR [r12+0x58]
      9da271:	48 8b 3c ca          	mov    rdi,QWORD PTR [rdx+rcx*8]
      9da275:	48 8b 34 c2          	mov    rsi,QWORD PTR [rdx+rax*8]
      9da279:	41 8b 8c 24 9c 00 00 	mov    ecx,DWORD PTR [r12+0x9c]
      9da280:	00 
      9da281:	48 89 fa             	mov    rdx,rdi
      9da284:	e8 67 78 00 00       	call   9e1af0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x9920>
      9da289:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
      9da290:	48 83 c5 01          	add    rbp,0x1
      9da294:	49 63 44 24 48       	movsxd rax,DWORD PTR [r12+0x48]
      9da299:	48 39 c5             	cmp    rbp,rax
      9da29c:	0f 8d 78 04 00 00    	jge    9da71a <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x254a>
      9da2a2:	49 8b 4c 24 50       	mov    rcx,QWORD PTR [r12+0x50]
      9da2a7:	8a 04 a9             	mov    al,BYTE PTR [rcx+rbp*4]
      9da2aa:	04 ff                	add    al,0xff
      9da2ac:	3c 05                	cmp    al,0x5
      9da2ae:	77 e0                	ja     9da290 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x20c0>
      9da2b0:	0f b6 c0             	movzx  eax,al
      9da2b3:	49 63 44 85 00       	movsxd rax,DWORD PTR [r13+rax*4+0x0]
      9da2b8:	4c 01 e8             	add    rax,r13
      9da2bb:	ff e0                	jmp    rax
      9da2bd:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
      9da2c2:	44 89 fb             	mov    ebx,r15d
      9da2c5:	49 63 cf             	movsxd rcx,r15d
      9da2c8:	4c 8b 3c c8          	mov    r15,QWORD PTR [rax+rcx*8]
      9da2cc:	41 8b 47 3c          	mov    eax,DWORD PTR [r15+0x3c]
      9da2d0:	89 44 24 08          	mov    DWORD PTR [rsp+0x8],eax
      9da2d4:	41 8b 8c 24 9c 00 00 	mov    ecx,DWORD PTR [r12+0x9c]
      9da2db:	00 
      9da2dc:	89 4c 24 0c          	mov    DWORD PTR [rsp+0xc],ecx
      9da2e0:	41 8b 54 24 40       	mov    edx,DWORD PTR [r12+0x40]
      9da2e5:	89 54 24 10          	mov    DWORD PTR [rsp+0x10],edx
      9da2e9:	89 4c 24 14          	mov    DWORD PTR [rsp+0x14],ecx
      9da2ed:	49 8b 54 24 58       	mov    rdx,QWORD PTR [r12+0x58]
      9da2f2:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
      9da2f7:	4d 8b 84 24 a0 00 00 	mov    r8,QWORD PTR [r12+0xa0]
      9da2fe:	00 
      9da2ff:	4d 85 c0             	test   r8,r8
      9da302:	74 2f                	je     9da333 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x2163>
      9da304:	41 8b 77 08          	mov    esi,DWORD PTR [r15+0x8]
      9da308:	48 89 54 24 20       	mov    QWORD PTR [rsp+0x20],rdx

#### FDE 0x9db3d0..0x9db44d; hit 0x9db3fa: mov    QWORD PTR [rbx+0x50],rsi; score=2
      9db3cf:	cc                   	int3
      9db3d0:	41 56                	push   r14
      9db3d2:	53                   	push   rbx
      9db3d3:	48 83 ec 28          	sub    rsp,0x28
      9db3d7:	49 89 f6             	mov    r14,rsi
      9db3da:	48 89 fb             	mov    rbx,rdi
      9db3dd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9db3e4:	00 00 
      9db3e6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      9db3eb:	8d 41 13             	lea    eax,[rcx+0x13]
      9db3ee:	83 f8 40             	cmp    eax,0x40
      9db3f1:	72 0b                	jb     9db3fe <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x322e>
      9db3f3:	4c 89 73 48          	mov    QWORD PTR [rbx+0x48],r14
      9db3f7:	41 8b 36             	mov    esi,DWORD PTR [r14]
      9db3fa:	48 89 73 50          	mov    QWORD PTR [rbx+0x50],rsi
      9db3fe:	89 43 40             	mov    DWORD PTR [rbx+0x40],eax
      9db401:	48 89 df             	mov    rdi,rbx
      9db404:	48 89 d6             	mov    rsi,rdx
      9db407:	89 ca                	mov    edx,ecx
      9db409:	44 89 c1             	mov    ecx,r8d
      9db40c:	e8 3f 00 00 00       	call   9db450 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3280>
      9db411:	48 89 e7             	mov    rdi,rsp
      9db414:	4c 89 f6             	mov    rsi,r14
      9db417:	48 89 da             	mov    rdx,rbx
      9db41a:	e8 81 05 00 00       	call   9db9a0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x37d0>
      9db41f:	0f 10 04 24          	movups xmm0,XMMWORD PTR [rsp]
      9db423:	0f 10 4c 24 10       	movups xmm1,XMMWORD PTR [rsp+0x10]
      9db428:	0f 11 4b 58          	movups XMMWORD PTR [rbx+0x58],xmm1
      9db42c:	0f 11 43 48          	movups XMMWORD PTR [rbx+0x48],xmm0
      9db430:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9db437:	00 00 
      9db439:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      9db43e:	75 08                	jne    9db448 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3278>
      9db440:	48 83 c4 28          	add    rsp,0x28
      9db444:	5b                   	pop    rbx
      9db445:	41 5e                	pop    r14
      9db447:	c3                   	ret
      9db448:	e8 63 46 e1 00       	call   17efab0 <__stack_chk_fail@plt>
      9db44d:	cc                   	int3
      9db44e:	cc                   	int3
      9db44f:	cc                   	int3
      9db450:	55                   	push   rbp
      9db451:	41 57                	push   r15

#### FDE 0x9db590..0x9db77d; hit 0x9db5f2: mov    QWORD PTR [r15+0x50],rsi; score=2
      9db5c2:	66 2e 0f 1f 84 00 00 	cs nop WORD PTR [rax+rax*1+0x0]
      9db5c9:	00 00 00 
      9db5cc:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
      9db5d0:	89 fb                	mov    ebx,edi
      9db5d2:	48 0f af de          	imul   rbx,rsi
      9db5d6:	48 c1 eb 23          	shr    rbx,0x23
      9db5da:	48 83 c0 01          	add    rax,0x1
      9db5de:	83 ff 09             	cmp    edi,0x9
      9db5e1:	89 df                	mov    edi,ebx
      9db5e3:	77 eb                	ja     9db5d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3400>
      9db5e5:	48 83 f8 40          	cmp    rax,0x40
      9db5e9:	72 0b                	jb     9db5f6 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3426>
      9db5eb:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
      9db5ef:	41 8b 36             	mov    esi,DWORD PTR [r14]
      9db5f2:	49 89 77 50          	mov    QWORD PTR [r15+0x50],rsi
      9db5f6:	41 89 47 40          	mov    DWORD PTR [r15+0x40],eax
      9db5fa:	4c 89 ff             	mov    rdi,r15
      9db5fd:	48 89 d6             	mov    rsi,rdx
      9db600:	89 ca                	mov    edx,ecx
      9db602:	44 89 c1             	mov    ecx,r8d
      9db605:	e8 46 fe ff ff       	call   9db450 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3280>
      9db60a:	4a 8d 0c 38          	lea    rcx,[rax+r15*1]
      9db60e:	48 83 c1 05          	add    rcx,0x5
      9db612:	ba cd cc cc cc       	mov    edx,0xcccccccd
      9db617:	44 89 e6             	mov    esi,r12d
      9db61a:	66 0f 1f 44 00 00    	nop    WORD PTR [rax+rax*1+0x0]
      9db620:	89 f7                	mov    edi,esi
      9db622:	48 0f af fa          	imul   rdi,rdx
      9db626:	48 c1 ef 23          	shr    rdi,0x23
      9db62a:	48 83 c1 01          	add    rcx,0x1
      9db62e:	83 fe 09             	cmp    esi,0x9
      9db631:	89 fe                	mov    esi,edi
      9db633:	0f 87 e7 ff ff ff    	ja     9db620 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3450>
      9db639:	4d 85 ff             	test   r15,r15
      9db63c:	0f 84 f5 00 00 00    	je     9db737 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3567>
      9db642:	41 c7 04 07 72 65 73 	mov    DWORD PTR [r15+rax*1],0x2f736572
      9db649:	2f 
      9db64a:	4d 8d 14 07          	lea    r10,[r15+rax*1]
      9db64e:	49 83 c2 04          	add    r10,0x4
      9db652:	31 f6                	xor    esi,esi
      9db654:	bf cd cc cc cc       	mov    edi,0xcccccccd
      9db659:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
      9db660:	44 89 e3             	mov    ebx,r12d

#### FDE 0x9dcbc0..0x9dcbdf; hit 0x9dcbc7: movups XMMWORD PTR [rdi+0x50],xmm0; score=2
      9dcbb4:	cc                   	int3
      9dcbb5:	cc                   	int3
      9dcbb6:	cc                   	int3
      9dcbb7:	cc                   	int3
      9dcbb8:	cc                   	int3
      9dcbb9:	cc                   	int3
      9dcbba:	cc                   	int3
      9dcbbb:	cc                   	int3
      9dcbbc:	cc                   	int3
      9dcbbd:	cc                   	int3
      9dcbbe:	cc                   	int3
      9dcbbf:	cc                   	int3
      9dcbc0:	0f 57 c0             	xorps  xmm0,xmm0
      9dcbc3:	0f 11 47 5c          	movups XMMWORD PTR [rdi+0x5c],xmm0
      9dcbc7:	0f 11 47 50          	movups XMMWORD PTR [rdi+0x50],xmm0
      9dcbcb:	0f 11 47 40          	movups XMMWORD PTR [rdi+0x40],xmm0
      9dcbcf:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
      9dcbd3:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
      9dcbd7:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      9dcbdb:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      9dcbde:	c3                   	ret
      9dcbdf:	cc                   	int3
      9dcbe0:	48 85 ff             	test   rdi,rdi
      9dcbe3:	74 0a                	je     9dcbef <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4a1f>
      9dcbe5:	be 6c 00 00 00       	mov    esi,0x6c
      9dcbea:	e9 b1 ff ff ff       	jmp    9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>
      9dcbef:	c3                   	ret
      9dcbf0:	48 c7 07 00 00 00 00 	mov    QWORD PTR [rdi],0x0
      9dcbf7:	85 f6                	test   esi,esi
      9dcbf9:	74 12                	je     9dcc0d <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4a3d>
      9dcbfb:	0f 28 05 de 15 9b ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff9b15de]        # 38e1e0 <_ZTSSt12bad_any_cast@@Base-0x1fe8>
      9dcc02:	75 12                	jne    9dcc16 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4a46>
      9dcc04:	0f 28 0d 95 0f 9b ff 	movaps xmm1,XMMWORD PTR [rip+0xffffffffff9b0f95]        # 38dba0 <_ZTSSt12bad_any_cast@@Base-0x2628>
      9dcc0b:	eb 10                	jmp    9dcc1d <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4a4d>
      9dcc0d:	0f 28 05 7c 14 9b ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff9b147c]        # 38e090 <_ZTSSt12bad_any_cast@@Base-0x2138>
      9dcc14:	74 ee                	je     9dcc04 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4a34>
      9dcc16:	0f 28 0d a3 0e 9b ff 	movaps xmm1,XMMWORD PTR [rip+0xffffffffff9b0ea3]        # 38dac0 <_ZTSSt12bad_any_cast@@Base-0x2708>
      9dcc1d:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
      9dcc21:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1
      9dcc25:	89 77 68             	mov    DWORD PTR [rdi+0x68],esi
      9dcc28:	31 c0                	xor    eax,eax
      9dcc2a:	c3                   	ret
      9dcc2b:	cc                   	int3

#### FDE 0x9e6fe0..0x9e721a; hit 0x9e70ff: mov    rdi,QWORD PTR [r12+0x50]; score=2
      9e70c6:	89 7c 24 08          	mov    DWORD PTR [rsp+0x8],edi
      9e70ca:	88 5c 24 01          	mov    BYTE PTR [rsp+0x1],bl
      9e70ce:	89 74 24 0c          	mov    DWORD PTR [rsp+0xc],esi
      9e70d2:	f3 0f 11 4c 24 10    	movss  DWORD PTR [rsp+0x10],xmm1
      9e70d8:	89 54 24 14          	mov    DWORD PTR [rsp+0x14],edx
      9e70dc:	8a 44 24 20          	mov    al,BYTE PTR [rsp+0x20]
      9e70e0:	88 04 24             	mov    BYTE PTR [rsp],al
      9e70e3:	0f b7 44 24 22       	movzx  eax,WORD PTR [rsp+0x22]
      9e70e8:	66 89 44 24 02       	mov    WORD PTR [rsp+0x2],ax
      9e70ed:	8b 44 24 2c          	mov    eax,DWORD PTR [rsp+0x2c]
      9e70f1:	89 44 24 04          	mov    DWORD PTR [rsp+0x4],eax
      9e70f5:	4c 89 f3             	mov    rbx,r14
      9e70f8:	48 c1 e3 20          	shl    rbx,0x20
      9e70fc:	4c 09 fb             	or     rbx,r15
      9e70ff:	49 8b 7c 24 50       	mov    rdi,QWORD PTR [r12+0x50]
      9e7104:	48 89 de             	mov    rsi,rbx
      9e7107:	ba 1f 00 00 00       	mov    edx,0x1f
      9e710c:	e8 0f 24 00 00       	call   9e9520 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x1970>
      9e7111:	49 8b 7c 24 58       	mov    rdi,QWORD PTR [r12+0x58]
      9e7116:	48 89 de             	mov    rsi,rbx
      9e7119:	ba 1f 00 00 00       	mov    edx,0x1f
      9e711e:	e8 fd 23 00 00       	call   9e9520 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x1970>
      9e7123:	31 db                	xor    ebx,ebx
      9e7125:	66 2e 0f 1f 84 00 00 	cs nop WORD PTR [rax+rax*1+0x0]
      9e712c:	00 00 00 
      9e712f:	90                   	nop
      9e7130:	49 8b 44 24 60       	mov    rax,QWORD PTR [r12+0x60]
      9e7135:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]
      9e7139:	44 89 f6             	mov    esi,r14d
      9e713c:	44 89 fa             	mov    edx,r15d
      9e713f:	89 e9                	mov    ecx,ebp
      9e7141:	e8 da 0e 00 00       	call   9e8020 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x470>
      9e7146:	48 83 c3 01          	add    rbx,0x1
      9e714a:	49 39 dd             	cmp    r13,rbx
      9e714d:	75 e1                	jne    9e7130 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xef60>
      9e714f:	48 8d 05 ea d8 e0 00 	lea    rax,[rip+0xe0d8ea]        # 17f4a40 <pthread_rwlock_wrlock@plt+0x3c80>
      9e7156:	49 89 04 24          	mov    QWORD PTR [r12],rax
      9e715a:	41 c6 44 24 38 00    	mov    BYTE PTR [r12+0x38],0x0
      9e7160:	49 c7 44 24 48 00 00 	mov    QWORD PTR [r12+0x48],0x0
      9e7167:	00 00 
      9e7169:	45 89 6c 24 08       	mov    DWORD PTR [r12+0x8],r13d
      9e716e:	8b 44 24 14          	mov    eax,DWORD PTR [rsp+0x14]
      9e7172:	41 89 44 24 0c       	mov    DWORD PTR [r12+0xc],eax

#### FDE 0x9e9f10..0x9ea037; hit 0x9e9f8f: mov    ecx,DWORD PTR [r12+0x50]; score=2
      9e9f50:	e8 7b 92 ff ff       	call   9e31d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xb000>
      9e9f55:	49 8d 5c 24 48       	lea    rbx,[r12+0x48]
      9e9f5a:	48 8d 35 ef ad e0 00 	lea    rsi,[rip+0xe0adef]        # 17f4d50 <pthread_rwlock_wrlock@plt+0x3f90>
      9e9f61:	4c 89 ef             	mov    rdi,r13
      9e9f64:	48 89 da             	mov    rdx,rbx
      9e9f67:	b9 04 00 00 00       	mov    ecx,0x4
      9e9f6c:	e8 cf 96 ff ff       	call   9e3640 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xb470>
      9e9f71:	89 c1                	mov    ecx,eax
      9e9f73:	b8 08 00 00 00       	mov    eax,0x8
      9e9f78:	84 c9                	test   cl,cl
      9e9f7a:	0f 84 94 00 00 00    	je     9ea014 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2464>
      9e9f80:	b8 06 00 00 00       	mov    eax,0x6
      9e9f85:	80 7b 05 00          	cmp    BYTE PTR [rbx+0x5],0x0
      9e9f89:	0f 84 85 00 00 00    	je     9ea014 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2464>
      9e9f8f:	41 8b 4c 24 50       	mov    ecx,DWORD PTR [r12+0x50]
      9e9f94:	41 83 7c 24 54 02    	cmp    DWORD PTR [r12+0x54],0x2
      9e9f9a:	7c 0d                	jl     9e9fa9 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x23f9>
      9e9f9c:	31 c0                	xor    eax,eax
      9e9f9e:	83 f9 02             	cmp    ecx,0x2
      9e9fa1:	0f 94 c0             	sete   al
      9e9fa4:	83 c8 06             	or     eax,0x6
      9e9fa7:	eb 6b                	jmp    9ea014 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2464>
      9e9fa9:	83 f9 02             	cmp    ecx,0x2
      9e9fac:	75 66                	jne    9ea014 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2464>
      9e9fae:	41 8b 54 24 48       	mov    edx,DWORD PTR [r12+0x48]
      9e9fb3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      9e9fb8:	be 01 00 00 00       	mov    esi,0x1
      9e9fbd:	4c 89 f9             	mov    rcx,r15
      9e9fc0:	41 ff d6             	call   r14
      9e9fc3:	85 c0                	test   eax,eax
      9e9fc5:	75 4b                	jne    9ea012 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2462>
      9e9fc7:	49 8b 7c 24 70       	mov    rdi,QWORD PTR [r12+0x70]
      9e9fcc:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
      9e9fd1:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
      9e9fd6:	e8 d5 42 00 00       	call   9ee2b0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6700>
      9e9fdb:	85 c0                	test   eax,eax
      9e9fdd:	75 33                	jne    9ea012 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2462>
      9e9fdf:	41 c6 44 24 78 01    	mov    BYTE PTR [r12+0x78],0x1
      9e9fe5:	41 80 7c 24 4c 00    	cmp    BYTE PTR [r12+0x4c],0x0
      9e9feb:	74 1d                	je     9ea00a <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x245a>
      9e9fed:	41 83 7c 24 5c 00    	cmp    DWORD PTR [r12+0x5c],0x0
      9e9ff3:	74 15                	je     9ea00a <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x245a>
      9e9ff5:	41 c7 44 24 60 02 00 	mov    DWORD PTR [r12+0x60],0x2

#### FDE 0x9ea3a0..0x9eaa43; hit 0x9ea6e8: mov    QWORD PTR [rbx+0x50],rax; score=2
      9ea6b6:	e9 05 fe ff ff       	jmp    9ea4c0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2910>
      9ea6bb:	49 8b 06             	mov    rax,QWORD PTR [r14]
      9ea6be:	48 63 4d 08          	movsxd rcx,DWORD PTR [rbp+0x8]
      9ea6c2:	48 63 54 24 28       	movsxd rdx,DWORD PTR [rsp+0x28]
      9ea6c7:	48 0f af d1          	imul   rdx,rcx
      9ea6cb:	b9 08 00 00 00       	mov    ecx,0x8
      9ea6d0:	4c 89 f7             	mov    rdi,r14
      9ea6d3:	31 f6                	xor    esi,esi
      9ea6d5:	41 b8 02 00 00 00    	mov    r8d,0x2
      9ea6db:	45 31 c9             	xor    r9d,r9d
      9ea6de:	6a 00                	push   0x0
      9ea6e0:	41 57                	push   r15
      9ea6e2:	ff 10                	call   QWORD PTR [rax]
      9ea6e4:	48 83 c4 10          	add    rsp,0x10
      9ea6e8:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
      9ea6ec:	83 7d 08 00          	cmp    DWORD PTR [rbp+0x8],0x0
      9ea6f0:	4d 89 f5             	mov    r13,r14
      9ea6f3:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
      9ea6f8:	0f 8e cb 00 00 00    	jle    9ea7c9 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2c19>
      9ea6fe:	83 7c 24 48 00       	cmp    DWORD PTR [rsp+0x48],0x0
      9ea703:	0f 88 c0 00 00 00    	js     9ea7c9 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2c19>
      9ea709:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      9ea70e:	89 c1                	mov    ecx,eax
      9ea710:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
      9ea715:	48 c1 e0 03          	shl    rax,0x3
      9ea719:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      9ea71e:	45 31 ff             	xor    r15d,r15d
      9ea721:	31 c9                	xor    ecx,ecx
      9ea723:	e9 24 00 00 00       	jmp    9ea74c <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2b9c>
      9ea728:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]
      9ea72f:	00 
      9ea730:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
      9ea735:	48 83 c1 01          	add    rcx,0x1
      9ea739:	48 63 45 08          	movsxd rax,DWORD PTR [rbp+0x8]
      9ea73d:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      9ea742:	4c 03 7c 24 10       	add    r15,QWORD PTR [rsp+0x10]
      9ea747:	48 39 c1             	cmp    rcx,rax
      9ea74a:	7d 7d                	jge    9ea7c9 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2c19>
      9ea74c:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
      9ea751:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
      9ea756:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
      9ea75b:	e9 14 00 00 00       	jmp    9ea774 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2bc4>
      9ea760:	49 83 c7 08          	add    r15,0x8

#### FDE 0x9eabf0..0x9eacc9; hit 0x9eac90: mov    rcx,QWORD PTR [rbx+0x50]; score=2
      9eac64:	88 d0                	mov    al,dl
      9eac66:	4c 8d 34 85 04 00 00 	lea    r14,[rax*4+0x4]
      9eac6d:	00 
      9eac6e:	8b 43 18             	mov    eax,DWORD PTR [rbx+0x18]
      9eac71:	45 31 ff             	xor    r15d,r15d
      9eac74:	e9 10 00 00 00       	jmp    9eac89 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x30d9>
      9eac79:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
      9eac80:	41 83 c7 01          	add    r15d,0x1
      9eac84:	41 39 cf             	cmp    r15d,ecx
      9eac87:	7d 35                	jge    9eacbe <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x310e>
      9eac89:	85 c0                	test   eax,eax
      9eac8b:	7e f3                	jle    9eac80 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x30d0>
      9eac8d:	31 ed                	xor    ebp,ebp
      9eac8f:	90                   	nop
      9eac90:	48 8b 4b 50          	mov    rcx,QWORD PTR [rbx+0x50]
      9eac94:	41 0f af c7          	imul   eax,r15d
      9eac98:	01 e8                	add    eax,ebp
      9eac9a:	48 98                	cdqe
      9eac9c:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      9eaca0:	48 63 53 08          	movsxd rdx,DWORD PTR [rbx+0x8]
      9eaca4:	49 0f af d6          	imul   rdx,r14
      9eaca8:	31 f6                	xor    esi,esi
      9eacaa:	e8 e1 3e e0 00       	call   17eeb90 <memset@plt>
      9eacaf:	83 c5 01             	add    ebp,0x1
      9eacb2:	8b 43 18             	mov    eax,DWORD PTR [rbx+0x18]
      9eacb5:	39 c5                	cmp    ebp,eax
      9eacb7:	7c d7                	jl     9eac90 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x30e0>
      9eacb9:	8b 4b 0c             	mov    ecx,DWORD PTR [rbx+0xc]
      9eacbc:	eb c2                	jmp    9eac80 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x30d0>
      9eacbe:	48 83 c4 08          	add    rsp,0x8
      9eacc2:	5b                   	pop    rbx
      9eacc3:	41 5e                	pop    r14
      9eacc5:	41 5f                	pop    r15
      9eacc7:	5d                   	pop    rbp
      9eacc8:	c3                   	ret
      9eacc9:	cc                   	int3
      9eacca:	cc                   	int3
      9eaccb:	cc                   	int3
      9eaccc:	cc                   	int3
      9eaccd:	cc                   	int3
      9eacce:	cc                   	int3
      9eaccf:	cc                   	int3
      9eacd0:	55                   	push   rbp

#### FDE 0x9eb6b0..0x9ebfc4; hit 0x9eb730: mov    rcx,QWORD PTR [r12+0x50]; score=2
      9eb709:	88 d0                	mov    al,dl
      9eb70b:	4c 8d 34 85 04 00 00 	lea    r14,[rax*4+0x4]
      9eb712:	00 
      9eb713:	41 8b 44 24 18       	mov    eax,DWORD PTR [r12+0x18]
      9eb718:	31 ed                	xor    ebp,ebp
      9eb71a:	e9 08 00 00 00       	jmp    9eb727 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x3b77>
      9eb71f:	90                   	nop
      9eb720:	83 c5 01             	add    ebp,0x1
      9eb723:	39 cd                	cmp    ebp,ecx
      9eb725:	7d 3c                	jge    9eb763 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x3bb3>
      9eb727:	85 c0                	test   eax,eax
      9eb729:	7e f5                	jle    9eb720 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x3b70>
      9eb72b:	31 db                	xor    ebx,ebx
      9eb72d:	0f 1f 00             	nop    DWORD PTR [rax]
      9eb730:	49 8b 4c 24 50       	mov    rcx,QWORD PTR [r12+0x50]
      9eb735:	0f af c5             	imul   eax,ebp
      9eb738:	01 d8                	add    eax,ebx
      9eb73a:	48 98                	cdqe
      9eb73c:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      9eb740:	49 63 54 24 08       	movsxd rdx,DWORD PTR [r12+0x8]
      9eb745:	49 0f af d6          	imul   rdx,r14
      9eb749:	31 f6                	xor    esi,esi
      9eb74b:	e8 40 34 e0 00       	call   17eeb90 <memset@plt>
      9eb750:	83 c3 01             	add    ebx,0x1
      9eb753:	41 8b 44 24 18       	mov    eax,DWORD PTR [r12+0x18]
      9eb758:	39 c3                	cmp    ebx,eax
      9eb75a:	7c d4                	jl     9eb730 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x3b80>
      9eb75c:	41 8b 4c 24 0c       	mov    ecx,DWORD PTR [r12+0xc]
      9eb761:	eb bd                	jmp    9eb720 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x3b70>
      9eb763:	41 c7 44 24 30 00 00 	mov    DWORD PTR [r12+0x30],0x0
      9eb76a:	00 00 
      9eb76c:	41 c7 44 24 48 03 00 	mov    DWORD PTR [r12+0x48],0x3
      9eb773:	00 00 
      9eb775:	49 8b 4c 24 38       	mov    rcx,QWORD PTR [r12+0x38]
      9eb77a:	49 63 44 24 44       	movsxd rax,DWORD PTR [r12+0x44]
      9eb77f:	48 8d 34 40          	lea    rsi,[rax+rax*2]
      9eb783:	48 c1 e6 04          	shl    rsi,0x4
      9eb787:	41 8b 7c 24 20       	mov    edi,DWORD PTR [r12+0x20]
      9eb78c:	85 ff                	test   edi,edi
      9eb78e:	7e 0f                	jle    9eb79f <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x3bef>
      9eb790:	8b 44 24 30          	mov    eax,DWORD PTR [rsp+0x30]
      9eb794:	99                   	cdq
      9eb795:	f7 ff                	idiv   edi

#### FDE 0x9ee8a0..0x9ee8ba; hit 0x9ee8b0: mov    DWORD PTR [rdi+0x50],0x54adb; score=2
      9ee884:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      9ee88b:	00 00 
      9ee88d:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
      9ee892:	75 05                	jne    9ee899 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6ce9>
      9ee894:	48 83 c4 18          	add    rsp,0x18
      9ee898:	c3                   	ret
      9ee899:	e8 12 12 e0 00       	call   17efab0 <__stack_chk_fail@plt>
      9ee89e:	cc                   	int3
      9ee89f:	cc                   	int3
      9ee8a0:	b8 02 00 00 00       	mov    eax,0x2
      9ee8a5:	39 d6                	cmp    esi,edx
      9ee8a7:	75 10                	jne    9ee8b9 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6d09>
      9ee8a9:	0f 57 c0             	xorps  xmm0,xmm0
      9ee8ac:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
      9ee8b0:	c7 47 50 db 4a 05 00 	mov    DWORD PTR [rdi+0x50],0x54adb
      9ee8b7:	31 c0                	xor    eax,eax
      9ee8b9:	c3                   	ret
      9ee8ba:	cc                   	int3
      9ee8bb:	cc                   	int3
      9ee8bc:	cc                   	int3
      9ee8bd:	cc                   	int3
      9ee8be:	cc                   	int3
      9ee8bf:	cc                   	int3
      9ee8c0:	55                   	push   rbp
      9ee8c1:	41 57                	push   r15
      9ee8c3:	41 56                	push   r14
      9ee8c5:	41 55                	push   r13
      9ee8c7:	41 54                	push   r12
      9ee8c9:	53                   	push   rbx
      9ee8ca:	48 83 ec 18          	sub    rsp,0x18
      9ee8ce:	80 7f 1c 00          	cmp    BYTE PTR [rdi+0x1c],0x0
      9ee8d2:	0f 84 05 03 00 00    	je     9eebdd <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x702d>
      9ee8d8:	48 89 f3             	mov    rbx,rsi
      9ee8db:	49 89 fe             	mov    r14,rdi
      9ee8de:	4c 63 6f 4c          	movsxd r13,DWORD PTR [rdi+0x4c]
      9ee8e2:	f3 0f 2c 57 14       	cvttss2si edx,DWORD PTR [rdi+0x14]
      9ee8e7:	46 8b 64 af 24       	mov    r12d,DWORD PTR [rdi+r13*4+0x24]
      9ee8ec:	44 0f af e2          	imul   r12d,edx
      9ee8f0:	0f af 57 30          	imul   edx,DWORD PTR [rdi+0x30]
      9ee8f4:	44 8b 7e 04          	mov    r15d,DWORD PTR [rsi+0x4]
      9ee8f8:	8b 6f 48             	mov    ebp,DWORD PTR [rdi+0x48]
      9ee8fb:	44 01 fd             	add    ebp,r15d
      9ee8fe:	89 6f 48             	mov    DWORD PTR [rdi+0x48],ebp

#### FDE 0x9ee8c0..0x9eebf5; hit 0x9eea61: mov    ebp,DWORD PTR [r14+0x50]; score=2
      9eea2a:	ff 
      9eea2b:	f3 0f 10 1d 65 ff 99 	movss  xmm3,DWORD PTR [rip+0xffffffffff99ff65]        # 38e998 <_ZTSSt12bad_any_cast@@Base-0x1830>
      9eea32:	ff 
      9eea33:	e9 18 00 00 00       	jmp    9eea50 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6ea0>
      9eea38:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]
      9eea3f:	00 
      9eea40:	48 83 c0 01          	add    rax,0x1
      9eea44:	49 63 cd             	movsxd rcx,r13d
      9eea47:	48 39 c8             	cmp    rax,rcx
      9eea4a:	0f 8d 8f 00 00 00    	jge    9eeadf <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6f2f>
      9eea50:	45 85 ff             	test   r15d,r15d
      9eea53:	0f 8e e7 ff ff ff    	jle    9eea40 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6e90>
      9eea59:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      9eea5d:	48 8b 0c c1          	mov    rcx,QWORD PTR [rcx+rax*8]
      9eea61:	41 8b 6e 50          	mov    ebp,DWORD PTR [r14+0x50]
      9eea65:	31 f6                	xor    esi,esi
      9eea67:	66 0f 1f 84 00 00 00 	nop    WORD PTR [rax+rax*1+0x0]
      9eea6e:	00 00 
      9eea70:	69 ed 6d 4e c6 41    	imul   ebp,ebp,0x41c64e6d
      9eea76:	81 c5 39 30 00 00    	add    ebp,0x3039
      9eea7c:	89 ea                	mov    edx,ebp
      9eea7e:	d1 ea                	shr    edx,1
      9eea80:	89 ef                	mov    edi,ebp
      9eea82:	c1 ef 0c             	shr    edi,0xc
      9eea85:	31 d7                	xor    edi,edx
      9eea87:	89 fa                	mov    edx,edi
      9eea89:	c1 e2 07             	shl    edx,0x7
      9eea8c:	81 e2 80 56 2c 9d    	and    edx,0x9d2c5680
      9eea92:	31 fa                	xor    edx,edi
      9eea94:	89 d7                	mov    edi,edx
      9eea96:	c1 e7 0f             	shl    edi,0xf
      9eea99:	81 e7 00 00 c6 ef    	and    edi,0xefc60000
      9eea9f:	31 d7                	xor    edi,edx
      9eeaa1:	89 fa                	mov    edx,edi
      9eeaa3:	c1 ea 13             	shr    edx,0x13
      9eeaa6:	d1 ef                	shr    edi,1
      9eeaa8:	31 d7                	xor    edi,edx
      9eeaaa:	0f 57 e4             	xorps  xmm4,xmm4
      9eeaad:	f3 0f 2a e7          	cvtsi2ss xmm4,edi
      9eeab1:	f3 0f 59 e1          	mulss  xmm4,xmm1
      9eeab5:	f3 0f 58 e2          	addss  xmm4,xmm2
      9eeab9:	f3 0f 59 e0          	mulss  xmm4,xmm0
      9eeabd:	f3 0f 59 e3          	mulss  xmm4,xmm3

#### FDE 0x9eec00..0x9eec10; hit 0x9eec00: mov    eax,DWORD PTR [rdi+0x50]; score=2
      9eebed:	c3                   	ret
      9eebee:	31 c9                	xor    ecx,ecx
      9eebf0:	e9 23 fd ff ff       	jmp    9ee918 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x6d68>
      9eebf5:	cc                   	int3
      9eebf6:	cc                   	int3
      9eebf7:	cc                   	int3
      9eebf8:	cc                   	int3
      9eebf9:	cc                   	int3
      9eebfa:	cc                   	int3
      9eebfb:	cc                   	int3
      9eebfc:	cc                   	int3
      9eebfd:	cc                   	int3
      9eebfe:	cc                   	int3
      9eebff:	cc                   	int3
      9eec00:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
      9eec03:	0f 57 c0             	xorps  xmm0,xmm0
      9eec06:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
      9eec0a:	89 47 50             	mov    DWORD PTR [rdi+0x50],eax
      9eec0d:	31 c0                	xor    eax,eax
      9eec0f:	c3                   	ret
      9eec10:	41 56                	push   r14
      9eec12:	53                   	push   rbx
      9eec13:	48 83 ec 28          	sub    rsp,0x28
      9eec17:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9eec1e:	00 00 
      9eec20:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      9eec25:	83 fe 2a             	cmp    esi,0x2a
      9eec28:	75 4c                	jne    9eec76 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x70c6>
      9eec2a:	48 89 fb             	mov    rbx,rdi
      9eec2d:	89 c8                	mov    eax,ecx
      9eec2f:	49 89 e6             	mov    r14,rsp
      9eec32:	4c 89 f7             	mov    rdi,r14
      9eec35:	48 89 d6             	mov    rsi,rdx
      9eec38:	48 89 c2             	mov    rdx,rax
      9eec3b:	e8 90 45 ff ff       	call   9e31d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xb000>
      9eec40:	48 83 c3 1c          	add    rbx,0x1c
      9eec44:	48 8d 35 95 61 e0 00 	lea    rsi,[rip+0xe06195]        # 17f4de0 <pthread_rwlock_wrlock@plt+0x4020>
      9eec4b:	4c 89 f7             	mov    rdi,r14
      9eec4e:	48 89 da             	mov    rdx,rbx
      9eec51:	e8 ba 4e ff ff       	call   9e3b10 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xb940>
      9eec56:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      9eec5d:	00 00 
      9eec5f:	48 3b 4c 24 20       	cmp    rcx,QWORD PTR [rsp+0x20]

#### FDE 0x9eeee0..0x9ef0f9; hit 0x9ef091: mov    BYTE PTR [r14+0x50],0x0; score=2
      9ef048:	f3 0f 10 04 24       	movss  xmm0,DWORD PTR [rsp]
      9ef04d:	f3 0f 11 44 24 10    	movss  DWORD PTR [rsp+0x10],xmm0
      9ef053:	f3 0f 10 44 24 04    	movss  xmm0,DWORD PTR [rsp+0x4]
      9ef059:	f3 0f 11 44 24 14    	movss  DWORD PTR [rsp+0x14],xmm0
      9ef05f:	c7 44 24 18 10 00 00 	mov    DWORD PTR [rsp+0x18],0x10
      9ef066:	00 
      9ef067:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
      9ef06b:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      9ef070:	e8 1b 0c 00 00       	call   9efc90 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x80e0>
      9ef075:	49 8d 5e 50          	lea    rbx,[r14+0x50]
      9ef079:	0f 10 05 40 09 9a ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff9a0940]        # 38f9c0 <_ZTSSt12bad_any_cast@@Base-0x808>
      9ef080:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
      9ef085:	0f 10 05 24 09 9a ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff9a0924]        # 38f9b0 <_ZTSSt12bad_any_cast@@Base-0x818>
      9ef08c:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      9ef091:	41 c6 46 50 00       	mov    BYTE PTR [r14+0x50],0x0
      9ef096:	0f 57 c0             	xorps  xmm0,xmm0
      9ef099:	e8 c2 3f ff ff       	call   9e3060 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae90>
      9ef09e:	f3 41 0f 11 46 10    	movss  DWORD PTR [r14+0x10],xmm0
      9ef0a4:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]
      9ef0a9:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      9ef0ae:	f3 41 0f 10 46 68    	movss  xmm0,DWORD PTR [r14+0x68]
      9ef0b4:	f3 0f 11 44 24 30    	movss  DWORD PTR [rsp+0x30],xmm0
      9ef0ba:	f3 41 0f 10 46 6c    	movss  xmm0,DWORD PTR [r14+0x6c]
      9ef0c0:	f3 0f 11 44 24 34    	movss  DWORD PTR [rsp+0x34],xmm0
      9ef0c6:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
      9ef0ca:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      9ef0cf:	48 89 de             	mov    rsi,rbx
      9ef0d2:	e8 39 04 00 00       	call   9ef510 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7960>
      9ef0d7:	31 c0                	xor    eax,eax
      9ef0d9:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      9ef0e0:	00 00 
      9ef0e2:	48 3b 4c 24 50       	cmp    rcx,QWORD PTR [rsp+0x50]
      9ef0e7:	75 0b                	jne    9ef0f4 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7544>
      9ef0e9:	48 83 c4 58          	add    rsp,0x58
      9ef0ed:	5b                   	pop    rbx
      9ef0ee:	41 5e                	pop    r14
      9ef0f0:	41 5f                	pop    r15
      9ef0f2:	5d                   	pop    rbp
      9ef0f3:	c3                   	ret
      9ef0f4:	e8 b7 09 e0 00       	call   17efab0 <__stack_chk_fail@plt>
      9ef0f9:	cc                   	int3
      9ef0fa:	cc                   	int3
      9ef0fb:	cc                   	int3

#### FDE 0x9ef210..0x9ef2fb; hit 0x9ef29a: mov    BYTE PTR [rbx+0x50],al; score=2
      9ef26f:	80 7b 79 00          	cmp    BYTE PTR [rbx+0x79],0x0
      9ef273:	74 69                	je     9ef2de <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x772e>
      9ef275:	8b 4b 7c             	mov    ecx,DWORD PTR [rbx+0x7c]
      9ef278:	83 bb 80 00 00 00 00 	cmp    DWORD PTR [rbx+0x80],0x0
      9ef27f:	7e 0d                	jle    9ef28e <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x76de>
      9ef281:	31 c0                	xor    eax,eax
      9ef283:	83 f9 03             	cmp    ecx,0x3
      9ef286:	0f 94 c0             	sete   al
      9ef289:	83 c8 06             	or     eax,0x6
      9ef28c:	eb 50                	jmp    9ef2de <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x772e>
      9ef28e:	83 f9 03             	cmp    ecx,0x3
      9ef291:	75 4b                	jne    9ef2de <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x772e>
      9ef293:	8a 43 74             	mov    al,BYTE PTR [rbx+0x74]
      9ef296:	4c 8d 73 50          	lea    r14,[rbx+0x50]
      9ef29a:	88 43 50             	mov    BYTE PTR [rbx+0x50],al
      9ef29d:	f3 0f 10 43 70       	movss  xmm0,DWORD PTR [rbx+0x70]
      9ef2a2:	e8 b9 3d ff ff       	call   9e3060 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae90>
      9ef2a7:	f3 0f 11 43 10       	movss  DWORD PTR [rbx+0x10],xmm0
      9ef2ac:	0f 10 43 58          	movups xmm0,XMMWORD PTR [rbx+0x58]
      9ef2b0:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      9ef2b5:	f3 0f 10 43 68       	movss  xmm0,DWORD PTR [rbx+0x68]
      9ef2ba:	f3 0f 11 44 24 30    	movss  DWORD PTR [rsp+0x30],xmm0
      9ef2c0:	f3 0f 10 43 6c       	movss  xmm0,DWORD PTR [rbx+0x6c]
      9ef2c5:	f3 0f 11 44 24 34    	movss  DWORD PTR [rsp+0x34],xmm0
      9ef2cb:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
      9ef2cf:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      9ef2d4:	4c 89 f6             	mov    rsi,r14
      9ef2d7:	e8 34 02 00 00       	call   9ef510 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7960>
      9ef2dc:	31 c0                	xor    eax,eax
      9ef2de:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      9ef2e5:	00 00 
      9ef2e7:	48 3b 4c 24 40       	cmp    rcx,QWORD PTR [rsp+0x40]
      9ef2ec:	75 08                	jne    9ef2f6 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7746>
      9ef2ee:	48 83 c4 48          	add    rsp,0x48
      9ef2f2:	5b                   	pop    rbx
      9ef2f3:	41 5e                	pop    r14
      9ef2f5:	c3                   	ret
      9ef2f6:	e8 b5 07 e0 00       	call   17efab0 <__stack_chk_fail@plt>
      9ef2fb:	cc                   	int3
      9ef2fc:	cc                   	int3
      9ef2fd:	cc                   	int3
      9ef2fe:	cc                   	int3
      9ef2ff:	cc                   	int3

#### FDE 0x9ef370..0x9ef4e6; hit 0x9ef3d4: mov    BYTE PTR [r14+0x50],al; score=2
      9ef39c:	e8 df 3c ff ff       	call   9e3080 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xaeb0>
      9ef3a1:	89 c1                	mov    ecx,eax
      9ef3a3:	b8 02 00 00 00       	mov    eax,0x2
      9ef3a8:	83 fd 01             	cmp    ebp,0x1
      9ef3ab:	0f 84 8a 00 00 00    	je     9ef43b <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x788b>
      9ef3b1:	85 ed                	test   ebp,ebp
      9ef3b3:	75 69                	jne    9ef41e <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x786e>
      9ef3b5:	83 f9 01             	cmp    ecx,0x1
      9ef3b8:	75 64                	jne    9ef41e <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x786e>
      9ef3ba:	f3 0f 10 44 24 0c    	movss  xmm0,DWORD PTR [rsp+0xc]
      9ef3c0:	0f 2e 05 2d f4 99 ff 	ucomiss xmm0,DWORD PTR [rip+0xffffffffff99f42d]        # 38e7f4 <_ZTSSt12bad_any_cast@@Base-0x19d4>
      9ef3c7:	41 0f 97 46 78       	seta   BYTE PTR [r14+0x78]
      9ef3cc:	41 8a 46 74          	mov    al,BYTE PTR [r14+0x74]
      9ef3d0:	49 8d 5e 50          	lea    rbx,[r14+0x50]
      9ef3d4:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
      9ef3d8:	f3 41 0f 10 46 70    	movss  xmm0,DWORD PTR [r14+0x70]
      9ef3de:	e8 7d 3c ff ff       	call   9e3060 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xae90>
      9ef3e3:	f3 41 0f 11 46 10    	movss  DWORD PTR [r14+0x10],xmm0
      9ef3e9:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]
      9ef3ee:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      9ef3f3:	f3 41 0f 10 46 68    	movss  xmm0,DWORD PTR [r14+0x68]
      9ef3f9:	f3 0f 11 44 24 20    	movss  DWORD PTR [rsp+0x20],xmm0
      9ef3ff:	f3 41 0f 10 46 6c    	movss  xmm0,DWORD PTR [r14+0x6c]
      9ef405:	f3 0f 11 44 24 24    	movss  DWORD PTR [rsp+0x24],xmm0
      9ef40b:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
      9ef40f:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
      9ef414:	48 89 de             	mov    rsi,rbx
      9ef417:	e8 f4 00 00 00       	call   9ef510 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7960>
      9ef41c:	31 c0                	xor    eax,eax
      9ef41e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      9ef425:	00 00 
      9ef427:	48 3b 4c 24 28       	cmp    rcx,QWORD PTR [rsp+0x28]
      9ef42c:	0f 85 af 00 00 00    	jne    9ef4e1 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x7931>
      9ef432:	48 83 c4 30          	add    rsp,0x30
      9ef436:	5b                   	pop    rbx
      9ef437:	41 5e                	pop    r14
      9ef439:	5d                   	pop    rbp
      9ef43a:	c3                   	ret
      9ef43b:	83 c1 ff             	add    ecx,0xffffffff
      9ef43e:	83 f9 07             	cmp    ecx,0x7
      9ef441:	77 db                	ja     9ef41e <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x786e>
      9ef443:	48 8d 05 ba 02 9a ff 	lea    rax,[rip+0xffffffffff9a02ba]        # 38f704 <_ZTSSt12bad_any_cast@@Base-0xac4>
      9ef44a:	48 63 0c 88          	movsxd rcx,DWORD PTR [rax+rcx*4]

#### FDE 0x9f0110..0x9f01b2; hit 0x9f01ad: movups XMMWORD PTR [rdi+0x50],xmm0; score=2
      9f015a:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
      9f015e:	0f 10 05 0b f9 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f90b]        # 38fa70 <_ZTSSt12bad_any_cast@@Base-0x758>
      9f0165:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      9f0169:	48 8b 05 10 f9 99 ff 	mov    rax,QWORD PTR [rip+0xffffffffff99f910]        # 38fa80 <_ZTSSt12bad_any_cast@@Base-0x748>
      9f0170:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
      9f0174:	0f 10 05 1d f9 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f91d]        # 38fa98 <_ZTSSt12bad_any_cast@@Base-0x730>
      9f017b:	0f 11 47 60          	movups XMMWORD PTR [rdi+0x60],xmm0
      9f017f:	0f 10 05 22 f9 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f922]        # 38faa8 <_ZTSSt12bad_any_cast@@Base-0x720>
      9f0186:	0f 11 47 70          	movups XMMWORD PTR [rdi+0x70],xmm0
      9f018a:	0f 10 05 27 f9 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f927]        # 38fab8 <_ZTSSt12bad_any_cast@@Base-0x710>
      9f0191:	0f 11 87 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm0
      9f0198:	0f 10 05 29 f9 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f929]        # 38fac8 <_ZTSSt12bad_any_cast@@Base-0x700>
      9f019f:	0f 11 87 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm0
      9f01a6:	0f 10 05 db f8 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f8db]        # 38fa88 <_ZTSSt12bad_any_cast@@Base-0x740>
      9f01ad:	0f 11 47 50          	movups XMMWORD PTR [rdi+0x50],xmm0
      9f01b1:	c3                   	ret
      9f01b2:	cc                   	int3
      9f01b3:	cc                   	int3
      9f01b4:	cc                   	int3
      9f01b5:	cc                   	int3
      9f01b6:	cc                   	int3
      9f01b7:	cc                   	int3
      9f01b8:	cc                   	int3
      9f01b9:	cc                   	int3
      9f01ba:	cc                   	int3
      9f01bb:	cc                   	int3
      9f01bc:	cc                   	int3
      9f01bd:	cc                   	int3
      9f01be:	cc                   	int3
      9f01bf:	cc                   	int3
      9f01c0:	53                   	push   rbx
      9f01c1:	48 89 f3             	mov    rbx,rsi
      9f01c4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      9f01c7:	4c 8d 15 77 a5 94 ff 	lea    r10,[rip+0xffffffffff94a577]        # 33a745 <_ZTSSt12bad_any_cast@@Base-0x55a83>
      9f01ce:	ba 01 00 00 00       	mov    edx,0x1
      9f01d3:	b9 a0 00 00 00       	mov    ecx,0xa0
      9f01d8:	31 f6                	xor    esi,esi
      9f01da:	41 b8 02 00 00 00    	mov    r8d,0x2
      9f01e0:	41 b9 01 00 00 00    	mov    r9d,0x1
      9f01e6:	6a 00                	push   0x0
      9f01e8:	41 52                	push   r10
      9f01ea:	ff 10                	call   QWORD PTR [rax]
      9f01ec:	48 83 c4 10          	add    rsp,0x10

#### FDE 0x9f0200..0x9f028c; hit 0x9f0239: movups XMMWORD PTR [rdi+0x50],xmm0; score=2
      9f01fb:	cc                   	int3
      9f01fc:	cc                   	int3
      9f01fd:	cc                   	int3
      9f01fe:	cc                   	int3
      9f01ff:	cc                   	int3
      9f0200:	0f 10 05 a1 f8 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f8a1]        # 38faa8 <_ZTSSt12bad_any_cast@@Base-0x720>
      9f0207:	0f 11 47 70          	movups XMMWORD PTR [rdi+0x70],xmm0
      9f020b:	0f 10 05 a6 f8 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f8a6]        # 38fab8 <_ZTSSt12bad_any_cast@@Base-0x710>
      9f0212:	0f 11 87 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm0
      9f0219:	0f 10 05 a8 f8 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f8a8]        # 38fac8 <_ZTSSt12bad_any_cast@@Base-0x700>
      9f0220:	0f 11 87 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm0
      9f0227:	0f 10 05 6a f8 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f86a]        # 38fa98 <_ZTSSt12bad_any_cast@@Base-0x730>
      9f022e:	0f 11 47 60          	movups XMMWORD PTR [rdi+0x60],xmm0
      9f0232:	0f 10 05 4f f8 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f84f]        # 38fa88 <_ZTSSt12bad_any_cast@@Base-0x740>
      9f0239:	0f 11 47 50          	movups XMMWORD PTR [rdi+0x50],xmm0
      9f023d:	8b 4f 28             	mov    ecx,DWORD PTR [rdi+0x28]
      9f0240:	89 4f 7c             	mov    DWORD PTR [rdi+0x7c],ecx
      9f0243:	8d 04 09             	lea    eax,[rcx+rcx*1]
      9f0246:	89 87 80 00 00 00    	mov    DWORD PTR [rdi+0x80],eax
      9f024c:	f3 0f 10 05 34 e4 99 	movss  xmm0,DWORD PTR [rip+0xffffffffff99e434]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
      9f0253:	ff 
      9f0254:	85 c9                	test   ecx,ecx
      9f0256:	7f 11                	jg     9f0269 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x86b9>
      9f0258:	f3 0f 10 0d a8 e5 99 	movss  xmm1,DWORD PTR [rip+0xffffffffff99e5a8]        # 38e808 <_ZTSSt12bad_any_cast@@Base-0x19c0>
      9f025f:	ff 
      9f0260:	f3 0f 11 4f 74       	movss  DWORD PTR [rdi+0x74],xmm1
      9f0265:	7f 14                	jg     9f027b <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x86cb>
      9f0267:	eb 1d                	jmp    9f0286 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x86d6>
      9f0269:	f3 0f 2a d1          	cvtsi2ss xmm2,ecx
      9f026d:	0f 28 c8             	movaps xmm1,xmm0
      9f0270:	f3 0f 5e ca          	divss  xmm1,xmm2
      9f0274:	f3 0f 11 4f 74       	movss  DWORD PTR [rdi+0x74],xmm1
      9f0279:	7e 0b                	jle    9f0286 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x86d6>
      9f027b:	0f 57 c9             	xorps  xmm1,xmm1
      9f027e:	f3 0f 2a c8          	cvtsi2ss xmm1,eax
      9f0282:	f3 0f 5e c1          	divss  xmm0,xmm1
      9f0286:	f3 0f 11 47 78       	movss  DWORD PTR [rdi+0x78],xmm0
      9f028b:	c3                   	ret
      9f028c:	cc                   	int3
      9f028d:	cc                   	int3
      9f028e:	cc                   	int3
      9f028f:	cc                   	int3
      9f0290:	41 56                	push   r14

#### FDE 0x9f0290..0x9f04c7; hit 0x9f042d: movss  xmm0,DWORD PTR [rbx+0x50]; score=2
      9f03f0:	f3 0f 10 0d 90 e2 99 	movss  xmm1,DWORD PTR [rip+0xffffffffff99e290]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
      9f03f7:	ff 
      9f03f8:	0f 28 d1             	movaps xmm2,xmm1
      9f03fb:	f3 0f 5c d0          	subss  xmm2,xmm0
      9f03ff:	f3 0f 11 53 40       	movss  DWORD PTR [rbx+0x40],xmm2
      9f0404:	f3 0f 10 43 20       	movss  xmm0,DWORD PTR [rbx+0x20]
      9f0409:	f3 0f 59 44 24 10    	mulss  xmm0,DWORD PTR [rsp+0x10]
      9f040f:	f3 0f 58 05 e1 e3 99 	addss  xmm0,DWORD PTR [rip+0xffffffffff99e3e1]        # 38e7f8 <_ZTSSt12bad_any_cast@@Base-0x19d0>
      9f0416:	ff 
      9f0417:	f3 0f 10 15 cd e2 99 	movss  xmm2,DWORD PTR [rip+0xffffffffff99e2cd]        # 38e6ec <_ZTSSt12bad_any_cast@@Base-0x1adc>
      9f041e:	ff 
      9f041f:	f3 0f 5e d0          	divss  xmm2,xmm0
      9f0423:	f3 0f 11 53 48       	movss  DWORD PTR [rbx+0x48],xmm2
      9f0428:	f3 0f 11 53 44       	movss  DWORD PTR [rbx+0x44],xmm2
      9f042d:	f3 0f 10 43 50       	movss  xmm0,DWORD PTR [rbx+0x50]
      9f0432:	0f 10 15 8f f6 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f68f]        # 38fac8 <_ZTSSt12bad_any_cast@@Base-0x700>
      9f0439:	0f 11 93 90 00 00 00 	movups XMMWORD PTR [rbx+0x90],xmm2
      9f0440:	0f 10 15 71 f6 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f671]        # 38fab8 <_ZTSSt12bad_any_cast@@Base-0x710>
      9f0447:	0f 11 93 80 00 00 00 	movups XMMWORD PTR [rbx+0x80],xmm2
      9f044e:	0f 10 15 53 f6 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f653]        # 38faa8 <_ZTSSt12bad_any_cast@@Base-0x720>
      9f0455:	0f 11 53 70          	movups XMMWORD PTR [rbx+0x70],xmm2
      9f0459:	0f 10 15 38 f6 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f638]        # 38fa98 <_ZTSSt12bad_any_cast@@Base-0x730>
      9f0460:	0f 11 53 60          	movups XMMWORD PTR [rbx+0x60],xmm2
      9f0464:	0f 10 15 1d f6 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f61d]        # 38fa88 <_ZTSSt12bad_any_cast@@Base-0x740>
      9f046b:	0f 11 53 50          	movups XMMWORD PTR [rbx+0x50],xmm2
      9f046f:	44 89 73 7c          	mov    DWORD PTR [rbx+0x7c],r14d
      9f0473:	43 8d 04 36          	lea    eax,[r14+r14*1]
      9f0477:	89 83 80 00 00 00    	mov    DWORD PTR [rbx+0x80],eax
      9f047d:	45 85 f6             	test   r14d,r14d
      9f0480:	7f 11                	jg     9f0493 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x88e3>
      9f0482:	f3 0f 10 15 7e e3 99 	movss  xmm2,DWORD PTR [rip+0xffffffffff99e37e]        # 38e808 <_ZTSSt12bad_any_cast@@Base-0x19c0>
      9f0489:	ff 
      9f048a:	f3 0f 11 53 74       	movss  DWORD PTR [rbx+0x74],xmm2
      9f048f:	7f 19                	jg     9f04aa <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x88fa>
      9f0491:	eb 22                	jmp    9f04b5 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x8905>
      9f0493:	f3 0f 5b 54 24 30    	cvttps2dq xmm2,XMMWORD PTR [rsp+0x30]
      9f0499:	0f 5b da             	cvtdq2ps xmm3,xmm2
      9f049c:	0f 28 d1             	movaps xmm2,xmm1
      9f049f:	f3 0f 5e d3          	divss  xmm2,xmm3
      9f04a3:	f3 0f 11 53 74       	movss  DWORD PTR [rbx+0x74],xmm2
      9f04a8:	7e 0b                	jle    9f04b5 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x8905>
      9f04aa:	0f 57 d2             	xorps  xmm2,xmm2
      9f04ad:	f3 0f 2a d0          	cvtsi2ss xmm2,eax

#### FDE 0x9f04d0..0x9f0709; hit 0x9f066d: movss  xmm0,DWORD PTR [rbx+0x50]; score=2
      9f0630:	f3 0f 10 0d 50 e0 99 	movss  xmm1,DWORD PTR [rip+0xffffffffff99e050]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
      9f0637:	ff 
      9f0638:	0f 28 d1             	movaps xmm2,xmm1
      9f063b:	f3 0f 5c d0          	subss  xmm2,xmm0
      9f063f:	f3 0f 11 53 40       	movss  DWORD PTR [rbx+0x40],xmm2
      9f0644:	f3 0f 10 43 20       	movss  xmm0,DWORD PTR [rbx+0x20]
      9f0649:	f3 0f 59 44 24 10    	mulss  xmm0,DWORD PTR [rsp+0x10]
      9f064f:	f3 0f 58 05 a1 e1 99 	addss  xmm0,DWORD PTR [rip+0xffffffffff99e1a1]        # 38e7f8 <_ZTSSt12bad_any_cast@@Base-0x19d0>
      9f0656:	ff 
      9f0657:	f3 0f 10 15 8d e0 99 	movss  xmm2,DWORD PTR [rip+0xffffffffff99e08d]        # 38e6ec <_ZTSSt12bad_any_cast@@Base-0x1adc>
      9f065e:	ff 
      9f065f:	f3 0f 5e d0          	divss  xmm2,xmm0
      9f0663:	f3 0f 11 53 48       	movss  DWORD PTR [rbx+0x48],xmm2
      9f0668:	f3 0f 11 53 44       	movss  DWORD PTR [rbx+0x44],xmm2
      9f066d:	f3 0f 10 43 50       	movss  xmm0,DWORD PTR [rbx+0x50]
      9f0672:	0f 10 15 4f f4 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f44f]        # 38fac8 <_ZTSSt12bad_any_cast@@Base-0x700>
      9f0679:	0f 11 93 90 00 00 00 	movups XMMWORD PTR [rbx+0x90],xmm2
      9f0680:	0f 10 15 31 f4 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f431]        # 38fab8 <_ZTSSt12bad_any_cast@@Base-0x710>
      9f0687:	0f 11 93 80 00 00 00 	movups XMMWORD PTR [rbx+0x80],xmm2
      9f068e:	0f 10 15 13 f4 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f413]        # 38faa8 <_ZTSSt12bad_any_cast@@Base-0x720>
      9f0695:	0f 11 53 70          	movups XMMWORD PTR [rbx+0x70],xmm2
      9f0699:	0f 10 15 f8 f3 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f3f8]        # 38fa98 <_ZTSSt12bad_any_cast@@Base-0x730>
      9f06a0:	0f 11 53 60          	movups XMMWORD PTR [rbx+0x60],xmm2
      9f06a4:	0f 10 15 dd f3 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f3dd]        # 38fa88 <_ZTSSt12bad_any_cast@@Base-0x740>
      9f06ab:	0f 11 53 50          	movups XMMWORD PTR [rbx+0x50],xmm2
      9f06af:	44 89 73 7c          	mov    DWORD PTR [rbx+0x7c],r14d
      9f06b3:	43 8d 04 36          	lea    eax,[r14+r14*1]
      9f06b7:	89 83 80 00 00 00    	mov    DWORD PTR [rbx+0x80],eax
      9f06bd:	45 85 f6             	test   r14d,r14d
      9f06c0:	7f 11                	jg     9f06d3 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x8b23>
      9f06c2:	f3 0f 10 15 3e e1 99 	movss  xmm2,DWORD PTR [rip+0xffffffffff99e13e]        # 38e808 <_ZTSSt12bad_any_cast@@Base-0x19c0>
      9f06c9:	ff 
      9f06ca:	f3 0f 11 53 74       	movss  DWORD PTR [rbx+0x74],xmm2
      9f06cf:	7f 19                	jg     9f06ea <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x8b3a>
      9f06d1:	eb 22                	jmp    9f06f5 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x8b45>
      9f06d3:	f3 0f 5b 54 24 30    	cvttps2dq xmm2,XMMWORD PTR [rsp+0x30]
      9f06d9:	0f 5b da             	cvtdq2ps xmm3,xmm2
      9f06dc:	0f 28 d1             	movaps xmm2,xmm1
      9f06df:	f3 0f 5e d3          	divss  xmm2,xmm3
      9f06e3:	f3 0f 11 53 74       	movss  DWORD PTR [rbx+0x74],xmm2
      9f06e8:	7e 0b                	jle    9f06f5 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x8b45>
      9f06ea:	0f 57 d2             	xorps  xmm2,xmm2
      9f06ed:	f3 0f 2a d0          	cvtsi2ss xmm2,eax

#### FDE 0x9f0710..0x9f0b7d; hit 0x9f0b10: movss  xmm0,DWORD PTR [rbx+0x50]; score=2
      9f0ad7:	f3 0f 11 8b 8c 00 00 	movss  DWORD PTR [rbx+0x8c],xmm1
      9f0ade:	00 
      9f0adf:	f3 0f 59 0d b5 dc 99 	mulss  xmm1,DWORD PTR [rip+0xffffffffff99dcb5]        # 38e79c <_ZTSSt12bad_any_cast@@Base-0x1a2c>
      9f0ae6:	ff 
      9f0ae7:	f3 0f 5e 0d 51 dd 99 	divss  xmm1,DWORD PTR [rip+0xffffffffff99dd51]        # 38e840 <_ZTSSt12bad_any_cast@@Base-0x1988>
      9f0aee:	ff 
      9f0aef:	0f 28 c1             	movaps xmm0,xmm1
      9f0af2:	e8 69 01 00 00       	call   9f0c60 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x90b0>
      9f0af7:	0f 28 c8             	movaps xmm1,xmm0
      9f0afa:	f3 0f 5d 8b 9c 00 00 	minss  xmm1,DWORD PTR [rbx+0x9c]
      9f0b01:	00 
      9f0b02:	f3 0f 11 4c 24 08    	movss  DWORD PTR [rsp+0x8],xmm1
      9f0b08:	f3 0f 11 83 9c 00 00 	movss  DWORD PTR [rbx+0x9c],xmm0
      9f0b0f:	00 
      9f0b10:	f3 0f 10 43 50       	movss  xmm0,DWORD PTR [rbx+0x50]
      9f0b15:	f3 0f 5c c8          	subss  xmm1,xmm0
      9f0b19:	f3 0f 59 4b 08       	mulss  xmm1,DWORD PTR [rbx+0x8]
      9f0b1e:	8b 73 04             	mov    esi,DWORD PTR [rbx+0x4]
      9f0b21:	89 f0                	mov    eax,esi
      9f0b23:	0f af c5             	imul   eax,ebp
      9f0b26:	48 98                	cdqe
      9f0b28:	49 8d 3c 86          	lea    rdi,[r14+rax*4]
      9f0b2c:	e8 4f 00 00 00       	call   9f0b80 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x8fd0>
      9f0b31:	f3 0f 10 44 24 08    	movss  xmm0,DWORD PTR [rsp+0x8]
      9f0b37:	f3 0f 11 43 50       	movss  DWORD PTR [rbx+0x50],xmm0
      9f0b3c:	41 39 ec             	cmp    r12d,ebp
      9f0b3f:	0f 84 2b 00 00 00    	je     9f0b70 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x8fc0>
      9f0b45:	83 c5 01             	add    ebp,0x1
      9f0b48:	8b 4b 04             	mov    ecx,DWORD PTR [rbx+0x4]
      9f0b4b:	e9 f0 fc ff ff       	jmp    9f0840 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x8c90>
      9f0b50:	c7 43 5c 00 00 00 00 	mov    DWORD PTR [rbx+0x5c],0x0
      9f0b57:	0f 57 c0             	xorps  xmm0,xmm0
      9f0b5a:	f3 0f 10 1d 26 db 99 	movss  xmm3,DWORD PTR [rip+0xffffffffff99db26]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
      9f0b61:	ff 
      9f0b62:	0f 2e e0             	ucomiss xmm4,xmm0
      9f0b65:	0f 83 23 fd ff ff    	jae    9f088e <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x8cde>
      9f0b6b:	e9 2c fd ff ff       	jmp    9f089c <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x8cec>
      9f0b70:	48 83 c4 10          	add    rsp,0x10
      9f0b74:	5b                   	pop    rbx
      9f0b75:	41 5c                	pop    r12
      9f0b77:	41 5e                	pop    r14
      9f0b79:	41 5f                	pop    r15
      9f0b7b:	5d                   	pop    rbp

#### FDE 0x9f1da0..0x9f2412; hit 0x9f1f79: mov    QWORD PTR [r14+0x50],rax; score=2
      9f1f49:	ff 10                	call   QWORD PTR [rax]
      9f1f4b:	48 83 c4 10          	add    rsp,0x10
      9f1f4f:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
      9f1f53:	49 8b 07             	mov    rax,QWORD PTR [r15]
      9f1f56:	48 63 13             	movsxd rdx,DWORD PTR [rbx]
      9f1f59:	b9 04 00 00 00       	mov    ecx,0x4
      9f1f5e:	4c 89 ff             	mov    rdi,r15
      9f1f61:	be 01 00 00 00       	mov    esi,0x1
      9f1f66:	41 b8 02 00 00 00    	mov    r8d,0x2
      9f1f6c:	45 31 c9             	xor    r9d,r9d
      9f1f6f:	6a 00                	push   0x0
      9f1f71:	41 55                	push   r13
      9f1f73:	ff 10                	call   QWORD PTR [rax]
      9f1f75:	48 83 c4 10          	add    rsp,0x10
      9f1f79:	49 89 46 50          	mov    QWORD PTR [r14+0x50],rax
      9f1f7d:	49 8b 07             	mov    rax,QWORD PTR [r15]
      9f1f80:	48 63 53 18          	movsxd rdx,DWORD PTR [rbx+0x18]
      9f1f84:	b9 04 00 00 00       	mov    ecx,0x4
      9f1f89:	4c 89 ff             	mov    rdi,r15
      9f1f8c:	31 f6                	xor    esi,esi
      9f1f8e:	41 b8 02 00 00 00    	mov    r8d,0x2
      9f1f94:	41 b9 01 00 00 00    	mov    r9d,0x1
      9f1f9a:	6a 00                	push   0x0
      9f1f9c:	41 55                	push   r13
      9f1f9e:	ff 10                	call   QWORD PTR [rax]
      9f1fa0:	48 83 c4 10          	add    rsp,0x10
      9f1fa4:	49 89 46 58          	mov    QWORD PTR [r14+0x58],rax
      9f1fa8:	80 7b 0c 00          	cmp    BYTE PTR [rbx+0xc],0x0
      9f1fac:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      9f1fb1:	0f 84 32 02 00 00    	je     9f21e9 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xa639>
      9f1fb7:	8b 03                	mov    eax,DWORD PTR [rbx]
      9f1fb9:	03 43 08             	add    eax,DWORD PTR [rbx+0x8]
      9f1fbc:	78 2d                	js     9f1feb <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xa43b>
      9f1fbe:	83 c0 ff             	add    eax,0xffffffff
      9f1fc1:	89 c1                	mov    ecx,eax
      9f1fc3:	d1 f9                	sar    ecx,1
      9f1fc5:	09 c1                	or     ecx,eax
      9f1fc7:	89 c8                	mov    eax,ecx
      9f1fc9:	c1 f8 02             	sar    eax,0x2
      9f1fcc:	09 c8                	or     eax,ecx
      9f1fce:	89 c1                	mov    ecx,eax
      9f1fd0:	c1 f9 04             	sar    ecx,0x4
      9f1fd3:	09 c1                	or     ecx,eax

#### FDE 0x9f2770..0x9f2946; hit 0x9f278a: mov    rdi,QWORD PTR [r15+0x50]; score=2
      9f276b:	cc                   	int3
      9f276c:	cc                   	int3
      9f276d:	cc                   	int3
      9f276e:	cc                   	int3
      9f276f:	cc                   	int3
      9f2770:	41 57                	push   r15
      9f2772:	41 56                	push   r14
      9f2774:	53                   	push   rbx
      9f2775:	49 89 ff             	mov    r15,rdi
      9f2778:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
      9f277c:	49 63 17             	movsxd rdx,DWORD PTR [r15]
      9f277f:	48 c1 e2 02          	shl    rdx,0x2
      9f2783:	31 f6                	xor    esi,esi
      9f2785:	e8 06 c4 df 00       	call   17eeb90 <memset@plt>
      9f278a:	49 8b 7f 50          	mov    rdi,QWORD PTR [r15+0x50]
      9f278e:	49 63 17             	movsxd rdx,DWORD PTR [r15]
      9f2791:	48 c1 e2 02          	shl    rdx,0x2
      9f2795:	31 f6                	xor    esi,esi
      9f2797:	e8 f4 c3 df 00       	call   17eeb90 <memset@plt>
      9f279c:	41 8b 4f 10          	mov    ecx,DWORD PTR [r15+0x10]
      9f27a0:	85 c9                	test   ecx,ecx
      9f27a2:	7e 50                	jle    9f27f4 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xac44>
      9f27a4:	41 8b 47 18          	mov    eax,DWORD PTR [r15+0x18]
      9f27a8:	45 31 f6             	xor    r14d,r14d
      9f27ab:	e9 0c 00 00 00       	jmp    9f27bc <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xac0c>
      9f27b0:	49 83 c6 01          	add    r14,0x1
      9f27b4:	48 63 d1             	movsxd rdx,ecx
      9f27b7:	49 39 d6             	cmp    r14,rdx
      9f27ba:	7d 38                	jge    9f27f4 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xac44>
      9f27bc:	85 c0                	test   eax,eax
      9f27be:	0f 8e ec ff ff ff    	jle    9f27b0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xac00>
      9f27c4:	31 db                	xor    ebx,ebx
      9f27c6:	66 2e 0f 1f 84 00 00 	cs nop WORD PTR [rax+rax*1+0x0]
      9f27cd:	00 00 00 
      9f27d0:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      9f27d4:	4a 8b 04 f0          	mov    rax,QWORD PTR [rax+r14*8]
      9f27d8:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]
      9f27dc:	e8 8f 45 ff ff       	call   9e6d70 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xeba0>
      9f27e1:	48 83 c3 01          	add    rbx,0x1
      9f27e5:	49 63 47 18          	movsxd rax,DWORD PTR [r15+0x18]
      9f27e9:	48 39 c3             	cmp    rbx,rax
      9f27ec:	7c e2                	jl     9f27d0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xac20>
      9f27ee:	41 8b 4f 10          	mov    ecx,DWORD PTR [r15+0x10]

#### FDE 0xa0c1b0..0xa0c3ba; hit 0xa0c1fc: mov    DWORD PTR [rax+0x50],0x0; score=2
      a0c1c3:	48 89 fb             	mov    rbx,rdi
      a0c1c6:	bf 60 00 00 00       	mov    edi,0x60
      a0c1cb:	e8 30 1d de 00       	call   17edf00 <_Znwm@plt>
      a0c1d0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a0c1d5:	48 c7 04 24 19 00 00 	mov    QWORD PTR [rsp],0x19
      a0c1dc:	00 
      a0c1dd:	48 c7 44 24 08 14 00 	mov    QWORD PTR [rsp+0x8],0x14
      a0c1e4:	00 00 
      a0c1e6:	0f 57 c0             	xorps  xmm0,xmm0
      a0c1e9:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
      a0c1ed:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      a0c1f1:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      a0c1f5:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      a0c1f9:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      a0c1fc:	c7 40 50 00 00 00 00 	mov    DWORD PTR [rax+0x50],0x0
      a0c203:	48 89 e7             	mov    rdi,rsp
      a0c206:	be 03 00 00 00       	mov    esi,0x3
      a0c20b:	31 d2                	xor    edx,edx
      a0c20d:	e8 de 3a de 00       	call   17efcf0 <_ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6appendEmw@plt>
      a0c212:	0f b6 04 24          	movzx  eax,BYTE PTR [rsp]
      a0c216:	a8 01                	test   al,0x1
      a0c218:	74 07                	je     a0c221 <_ZNSt6__ndk110to_wstringEf@@Base+0x71>
      a0c21a:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      a0c21f:	eb 06                	jmp    a0c227 <_ZNSt6__ndk110to_wstringEf@@Base+0x77>
      a0c221:	41 89 c5             	mov    r13d,eax
      a0c224:	41 d1 ed             	shr    r13d,1
      a0c227:	4c 8d 64 24 04       	lea    r12,[rsp+0x4]
      a0c22c:	f3 0f 10 44 24 18    	movss  xmm0,DWORD PTR [rsp+0x18]
      a0c232:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
      a0c236:	f2 0f 11 44 24 18    	movsd  QWORD PTR [rsp+0x18],xmm0
      a0c23c:	4c 8d 35 51 43 98 ff 	lea    r14,[rip+0xffffffffff984351]        # 390594 <_ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE4nposE@@Base+0x44>
      a0c243:	49 89 e7             	mov    r15,rsp
      a0c246:	eb 16                	jmp    a0c25e <_ZNSt6__ndk110to_wstringEf@@Base+0xae>
      a0c248:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]
      a0c24f:	00 
      a0c250:	4c 89 ff             	mov    rdi,r15
      a0c253:	31 d2                	xor    edx,edx
      a0c255:	e8 96 3a de 00       	call   17efcf0 <_ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6appendEmw@plt>
      a0c25a:	0f b6 04 24          	movzx  eax,BYTE PTR [rsp]
      a0c25e:	4c 89 e7             	mov    rdi,r12
      a0c261:	a8 01                	test   al,0x1
      a0c263:	74 05                	je     a0c26a <_ZNSt6__ndk110to_wstringEf@@Base+0xba>
      a0c265:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

#### FDE 0xa0c3c0..0xa0c5ba; hit 0xa0c40c: mov    DWORD PTR [rax+0x50],0x0; score=2
      a0c3d3:	48 89 fb             	mov    rbx,rdi
      a0c3d6:	bf 60 00 00 00       	mov    edi,0x60
      a0c3db:	e8 20 1b de 00       	call   17edf00 <_Znwm@plt>
      a0c3e0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a0c3e5:	48 c7 04 24 19 00 00 	mov    QWORD PTR [rsp],0x19
      a0c3ec:	00 
      a0c3ed:	48 c7 44 24 08 14 00 	mov    QWORD PTR [rsp+0x8],0x14
      a0c3f4:	00 00 
      a0c3f6:	0f 57 c0             	xorps  xmm0,xmm0
      a0c3f9:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
      a0c3fd:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      a0c401:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      a0c405:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      a0c409:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      a0c40c:	c7 40 50 00 00 00 00 	mov    DWORD PTR [rax+0x50],0x0
      a0c413:	48 89 e7             	mov    rdi,rsp
      a0c416:	be 03 00 00 00       	mov    esi,0x3
      a0c41b:	31 d2                	xor    edx,edx
      a0c41d:	e8 ce 38 de 00       	call   17efcf0 <_ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6appendEmw@plt>
      a0c422:	0f b6 04 24          	movzx  eax,BYTE PTR [rsp]
      a0c426:	a8 01                	test   al,0x1
      a0c428:	74 07                	je     a0c431 <_ZNSt6__ndk110to_wstringEd@@Base+0x71>
      a0c42a:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      a0c42f:	eb 06                	jmp    a0c437 <_ZNSt6__ndk110to_wstringEd@@Base+0x77>
      a0c431:	41 89 c5             	mov    r13d,eax
      a0c434:	41 d1 ed             	shr    r13d,1
      a0c437:	4c 8d 64 24 04       	lea    r12,[rsp+0x4]
      a0c43c:	4c 8d 35 51 41 98 ff 	lea    r14,[rip+0xffffffffff984151]        # 390594 <_ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE4nposE@@Base+0x44>
      a0c443:	49 89 e7             	mov    r15,rsp
      a0c446:	eb 16                	jmp    a0c45e <_ZNSt6__ndk110to_wstringEd@@Base+0x9e>
      a0c448:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]
      a0c44f:	00 
      a0c450:	4c 89 ff             	mov    rdi,r15
      a0c453:	31 d2                	xor    edx,edx
      a0c455:	e8 96 38 de 00       	call   17efcf0 <_ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6appendEmw@plt>
      a0c45a:	0f b6 04 24          	movzx  eax,BYTE PTR [rsp]
      a0c45e:	4c 89 e7             	mov    rdi,r12
      a0c461:	a8 01                	test   al,0x1
      a0c463:	74 05                	je     a0c46a <_ZNSt6__ndk110to_wstringEd@@Base+0xaa>
      a0c465:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      a0c46a:	49 8d 75 01          	lea    rsi,[r13+0x1]
      a0c46e:	4c 89 f2             	mov    rdx,r14
      a0c471:	f2 0f 10 44 24 18    	movsd  xmm0,QWORD PTR [rsp+0x18]

#### FDE 0xa0c5c0..0xa0c7ba; hit 0xa0c60b: mov    DWORD PTR [rax+0x50],0x0; score=2
      a0c5d2:	48 89 fb             	mov    rbx,rdi
      a0c5d5:	bf 60 00 00 00       	mov    edi,0x60
      a0c5da:	e8 21 19 de 00       	call   17edf00 <_Znwm@plt>
      a0c5df:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a0c5e4:	48 c7 04 24 19 00 00 	mov    QWORD PTR [rsp],0x19
      a0c5eb:	00 
      a0c5ec:	48 c7 44 24 08 14 00 	mov    QWORD PTR [rsp+0x8],0x14
      a0c5f3:	00 00 
      a0c5f5:	0f 57 c0             	xorps  xmm0,xmm0
      a0c5f8:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
      a0c5fc:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      a0c600:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      a0c604:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      a0c608:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      a0c60b:	c7 40 50 00 00 00 00 	mov    DWORD PTR [rax+0x50],0x0
      a0c612:	48 89 e7             	mov    rdi,rsp
      a0c615:	be 03 00 00 00       	mov    esi,0x3
      a0c61a:	31 d2                	xor    edx,edx
      a0c61c:	e8 cf 36 de 00       	call   17efcf0 <_ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6appendEmw@plt>
      a0c621:	0f b6 04 24          	movzx  eax,BYTE PTR [rsp]
      a0c625:	a8 01                	test   al,0x1
      a0c627:	74 07                	je     a0c630 <_ZNSt6__ndk110to_wstringEg@@Base+0x70>
      a0c629:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      a0c62e:	eb 06                	jmp    a0c636 <_ZNSt6__ndk110to_wstringEg@@Base+0x76>
      a0c630:	41 89 c5             	mov    r13d,eax
      a0c633:	41 d1 ed             	shr    r13d,1
      a0c636:	4c 8d 64 24 04       	lea    r12,[rsp+0x4]
      a0c63b:	4c 8d 35 c2 3f 98 ff 	lea    r14,[rip+0xffffffffff983fc2]        # 390604 <_ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE4nposE@@Base+0xb4>
      a0c642:	49 89 e7             	mov    r15,rsp
      a0c645:	eb 17                	jmp    a0c65e <_ZNSt6__ndk110to_wstringEg@@Base+0x9e>
      a0c647:	66 0f 1f 84 00 00 00 	nop    WORD PTR [rax+rax*1+0x0]
      a0c64e:	00 00 
      a0c650:	4c 89 ff             	mov    rdi,r15
      a0c653:	31 d2                	xor    edx,edx
      a0c655:	e8 96 36 de 00       	call   17efcf0 <_ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6appendEmw@plt>
      a0c65a:	0f b6 04 24          	movzx  eax,BYTE PTR [rsp]
      a0c65e:	4c 89 e7             	mov    rdi,r12
      a0c661:	a8 01                	test   al,0x1
      a0c663:	74 05                	je     a0c66a <_ZNSt6__ndk110to_wstringEg@@Base+0xaa>
      a0c665:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      a0c66a:	49 8d 75 01          	lea    rsi,[r13+0x1]
      a0c66e:	4c 89 f2             	mov    rdx,r14
      a0c671:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]

#### FDE 0xa0e270..0xa0e43d; hit 0xa0e2b6: mov    QWORD PTR [rax+0x50],rcx; score=2
      a0e277:	0f 87 82 01 00 00    	ja     a0e3ff <_ZNSt6__ndk125notify_all_at_thread_exitERNS_18condition_variableENS_11unique_lockINS_5mutexEEE@@Base+0x22f>
      a0e27d:	89 d0                	mov    eax,edx
      a0e27f:	48 8d 0d aa 27 98 ff 	lea    rcx,[rip+0xffffffffff9827aa]        # 390a30 <_ZTSSt18bad_variant_access@@Base+0x29>
      a0e286:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
      a0e28a:	48 01 c8             	add    rax,rcx
      a0e28d:	ff e0                	jmp    rax
      a0e28f:	bf 60 00 00 00       	mov    edi,0x60
      a0e294:	e8 67 fc dd 00       	call   17edf00 <_Znwm@plt>
      a0e299:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      a0e29d:	48 c7 03 61 00 00 00 	mov    QWORD PTR [rbx],0x61
      a0e2a4:	48 c7 43 08 58 00 00 	mov    QWORD PTR [rbx+0x8],0x58
      a0e2ab:	00 
      a0e2ac:	48 b9 67 20 72 65 61 	movabs rcx,0x2e79646165722067
      a0e2b3:	64 79 2e 
      a0e2b6:	48 89 48 50          	mov    QWORD PTR [rax+0x50],rcx
      a0e2ba:	0f 10 05 d1 31 93 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff9331d1]        # 341492 <_ZTSSt12bad_any_cast@@Base-0x4ed36>
      a0e2c1:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
      a0e2c5:	0f 10 05 b6 31 93 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff9331b6]        # 341482 <_ZTSSt12bad_any_cast@@Base-0x4ed46>
      a0e2cc:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      a0e2d0:	0f 10 05 9b 31 93 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff93319b]        # 341472 <_ZTSSt12bad_any_cast@@Base-0x4ed56>
      a0e2d7:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      a0e2db:	0f 10 05 80 31 93 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff933180]        # 341462 <_ZTSSt12bad_any_cast@@Base-0x4ed66>
      a0e2e2:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      a0e2e6:	0f 10 05 65 31 93 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff933165]        # 341452 <_ZTSSt12bad_any_cast@@Base-0x4ed76>
      a0e2ed:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      a0e2f0:	48 83 c0 58          	add    rax,0x58
      a0e2f4:	c6 00 00             	mov    BYTE PTR [rax],0x0
      a0e2f7:	48 89 d8             	mov    rax,rbx
      a0e2fa:	5b                   	pop    rbx
      a0e2fb:	c3                   	ret
      a0e2fc:	bf 50 00 00 00       	mov    edi,0x50
      a0e301:	e8 fa fb dd 00       	call   17edf00 <_Znwm@plt>
      a0e306:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      a0e30a:	48 c7 03 51 00 00 00 	mov    QWORD PTR [rbx],0x51
      a0e311:	48 c7 43 08 41 00 00 	mov    QWORD PTR [rbx+0x8],0x41
      a0e318:	00 
      a0e319:	0f 10 05 2a 2a 92 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff922a2a]        # 330d4a <_ZTSSt12bad_any_cast@@Base-0x5f47e>
      a0e320:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      a0e324:	0f 10 05 0f 2a 92 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff922a0f]        # 330d3a <_ZTSSt12bad_any_cast@@Base-0x5f48e>
      a0e32b:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      a0e32f:	0f 10 05 f4 29 92 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff9229f4]        # 330d2a <_ZTSSt12bad_any_cast@@Base-0x5f49e>
      a0e336:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      a0e33a:	0f 10 05 d9 29 92 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff9229d9]        # 330d1a <_ZTSSt12bad_any_cast@@Base-0x5f4ae>

#### FDE 0xa0eaa0..0xa0eaeb; hit 0xa0ead7: movups XMMWORD PTR [rax+0x50],xmm0; score=2
      a0eaa0:	53                   	push   rbx
      a0eaa1:	48 89 fb             	mov    rbx,rdi
      a0eaa4:	bf 78 00 00 00       	mov    edi,0x78
      a0eaa9:	e8 52 f4 dd 00       	call   17edf00 <_Znwm@plt>
      a0eaae:	48 c7 40 08 00 00 00 	mov    QWORD PTR [rax+0x8],0x0
      a0eab5:	00 
      a0eab6:	48 8b 0d 33 33 ea 00 	mov    rcx,QWORD PTR [rip+0xea3333]        # 18b1df0 <_ZTVNSt6__ndk117__assoc_sub_stateE@@Base+0xbc958>
      a0eabd:	48 83 c1 10          	add    rcx,0x10
      a0eac1:	48 89 08             	mov    QWORD PTR [rax],rcx
      a0eac4:	0f 57 c0             	xorps  xmm0,xmm0
      a0eac7:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      a0eacb:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      a0eacf:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      a0ead3:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
      a0ead7:	0f 11 40 50          	movups XMMWORD PTR [rax+0x50],xmm0
      a0eadb:	0f 11 40 60          	movups XMMWORD PTR [rax+0x60],xmm0
      a0eadf:	c7 40 70 00 00 00 00 	mov    DWORD PTR [rax+0x70],0x0
      a0eae6:	48 89 03             	mov    QWORD PTR [rbx],rax
      a0eae9:	5b                   	pop    rbx
      a0eaea:	c3                   	ret
      a0eaeb:	cc                   	int3
      a0eaec:	cc                   	int3
      a0eaed:	cc                   	int3
      a0eaee:	cc                   	int3
      a0eaef:	cc                   	int3
    
    0000000000a0eaf0 <_ZNSt6__ndk17promiseIvED1Ev@@Base>:
      a0eaf0:	41 57                	push   r15
      a0eaf2:	41 56                	push   r14
      a0eaf4:	53                   	push   rbx
      a0eaf5:	48 83 ec 30          	sub    rsp,0x30
      a0eaf9:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
      a0eafc:	4d 85 f6             	test   r14,r14
      a0eaff:	74 4d                	je     a0eb4e <_ZNSt6__ndk17promiseIvED1Ev@@Base+0x5e>
      a0eb01:	41 f6 46 70 01       	test   BYTE PTR [r14+0x70],0x1
      a0eb06:	75 2b                	jne    a0eb33 <_ZNSt6__ndk17promiseIvED1Ev@@Base+0x43>
      a0eb08:	48 89 fb             	mov    rbx,rdi
      a0eb0b:	48 c7 44 24 08 00 00 	mov    QWORD PTR [rsp+0x8],0x0
      a0eb12:	00 00 
      a0eb14:	4d 8b 7e 10          	mov    r15,QWORD PTR [r14+0x10]
      a0eb18:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      a0eb1d:	e8 6e f8 dd 00       	call   17ee390 <_ZNSt13exception_ptrD1Ev@plt>
      a0eb22:	4c 8b 33             	mov    r14,QWORD PTR [rbx]

### Candidate constructor FDEs: stores into dependency first word
- FDE 0x135a74c hit 0x135a7fe: mov    QWORD PTR [rsp+0x50],rcx
     135a7ce:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     135a7d3:	bf e0 00 00 00       	mov    edi,0xe0
     135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
     135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
     135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
     135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
     135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
     135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
     135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
     135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     135a80e:	00 
     135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
     135a816:	00 
     135a817:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135a81e:	00 
     135a81f:	48 8d a8 d0 00 00 00 	lea    rbp,[rax+0xd0]
     135a826:	48 83 a0 d0 00 00 00 	and    QWORD PTR [rax+0xd0],0x0
     135a82d:	00 
     135a82e:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
     135a833:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135a838:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135a83d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135a842:	f3 0f 7f 40 58       	movdqu XMMWORD PTR [rax+0x58],xmm0
     135a847:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135a84b:	48 83 ec 10          	sub    rsp,0x10

- FDE 0x135a74c hit 0x135a803: lea    rcx,[rax+0x50]
     135a7d3:	bf e0 00 00 00       	mov    edi,0xe0
     135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
     135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
     135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
     135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
     135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
     135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
     135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
     135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     135a80e:	00 
     135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
     135a816:	00 
     135a817:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
     135a81e:	00 
     135a81f:	48 8d a8 d0 00 00 00 	lea    rbp,[rax+0xd0]
     135a826:	48 83 a0 d0 00 00 00 	and    QWORD PTR [rax+0xd0],0x0
     135a82d:	00 
     135a82e:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
     135a833:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
     135a838:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
     135a83d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     135a842:	f3 0f 7f 40 58       	movdqu XMMWORD PTR [rax+0x58],xmm0
     135a847:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135a84b:	48 83 ec 10          	sub    rsp,0x10
     135a84f:	83 24 24 00          	and    DWORD PTR [rsp],0x0

- FDE 0x135a74c hit 0x135a97b: mov    rdi,QWORD PTR [rsp+0x50]
     135a94e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135a953:	4c 89 ef             	mov    rdi,r13
     135a956:	48 83 c7 10          	add    rdi,0x10
     135a95a:	e8 a3 f4 47 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     135a95f:	66 0f ef c0          	pxor   xmm0,xmm0
     135a963:	f3 41 0f 7f 45 78    	movdqu XMMWORD PTR [r13+0x78],xmm0
     135a969:	f3 41 0f 7f 45 68    	movdqu XMMWORD PTR [r13+0x68],xmm0
     135a96f:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     135a976:	00 
     135a977:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     135a97b:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     135a980:	4c 89 ee             	mov    rsi,r13
     135a983:	e8 72 18 00 00       	call   135c1fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a177e>
     135a988:	48 89 df             	mov    rdi,rbx
     135a98b:	e8 9c 18 00 00       	call   135c22c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b0>
     135a990:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135a993:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     135a99a:	00 
     135a99b:	4c 89 f6             	mov    rsi,r14
     135a99e:	ff 50 48             	call   QWORD PTR [rax+0x48]
     135a9a1:	48 8d 35 41 6b 01 ff 	lea    rsi,[rip+0xffffffffff016b41]        # 3714e9 <_ZTSSt12bad_any_cast@@Base-0x1ecdf>
     135a9a8:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     135a9af:	00 
     135a9b0:	e8 c9 f0 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135a9b5:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135a9b8:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     135a9bf:	00 
     135a9c0:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]

- FDE 0x135a74c hit 0x135aa1f: mov    rax,QWORD PTR [rsp+0x50]
     135a9ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa02:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135aa05:	4c 89 f7             	mov    rdi,r14
     135aa08:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa0b:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     135aa12:	00 
     135aa13:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135aa16:	4c 89 f7             	mov    rdi,r14
     135aa19:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa1c:	49 89 c7             	mov    r15,rax
     135aa1f:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     135aa24:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135aa27:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     135aa2c:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135aa2f:	4c 89 f7             	mov    rdi,r14
     135aa32:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa35:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135aa38:	4c 89 f7             	mov    rdi,r14
     135aa3b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135aa3e:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     135aa45:	00 
     135aa46:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     135aa4b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135aa4e:	48 8d 35 9b b0 0d ff 	lea    rsi,[rip+0xffffffffff0db09b]        # 435af0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b53f>
     135aa55:	48 8d 0d b4 b0 0d ff 	lea    rcx,[rip+0xffffffffff0db0b4]        # 435b10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b55f>
     135aa5c:	6a 10                	push   0x10
     135aa5e:	41 5e                	pop    r14
     135aa60:	6a 29                	push   0x29

- FDE 0x135a74c hit 0x135ad69: movdqu XMMWORD PTR [r12+0x50],xmm0
     135ad3a:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
     135ad3f:	49 8d 7c 24 30       	lea    rdi,[r12+0x30]
     135ad44:	48 8b b4 24 e0 00 00 	mov    rsi,QWORD PTR [rsp+0xe0]
     135ad4b:	00 
     135ad4c:	e8 55 eb 28 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     135ad51:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     135ad56:	49 89 44 24 40       	mov    QWORD PTR [r12+0x40],rax
     135ad5b:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     135ad60:	49 89 44 24 48       	mov    QWORD PTR [r12+0x48],rax
     135ad65:	66 0f ef c0          	pxor   xmm0,xmm0
     135ad69:	f3 41 0f 7f 44 24 50 	movdqu XMMWORD PTR [r12+0x50],xmm0
     135ad70:	f3 41 0f 7f 44 24 60 	movdqu XMMWORD PTR [r12+0x60],xmm0
     135ad77:	f3 41 0f 7f 44 24 70 	movdqu XMMWORD PTR [r12+0x70],xmm0
     135ad7e:	f3 41 0f 7f 84 24 80 	movdqu XMMWORD PTR [r12+0x80],xmm0
     135ad85:	00 00 00 
     135ad88:	66 49 0f 6e cc       	movq   xmm1,r12
     135ad8d:	66 48 0f 6e c3       	movq   xmm0,rbx
     135ad92:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135ad98:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
     135ad9d:	48 85 c0             	test   rax,rax
     135ada0:	74 0a                	je     135adac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0330>
     135ada2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135ada6:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     135adaa:	75 34                	jne    135ade0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0364>
     135adac:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     135adb2:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
     135adb8:	49 89 5c 24 20       	mov    QWORD PTR [r12+0x20],rbx
     135adbd:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]

- FDE 0x135a74c hit 0x135b22f: movaps xmm0,XMMWORD PTR [rcx+0x50]
     135b208:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
     135b20c:	41 0f 28 45 10       	movaps xmm0,XMMWORD PTR [r13+0x10]
     135b211:	0f 29 84 24 60 02 00 	movaps XMMWORD PTR [rsp+0x260],xmm0
     135b218:	00 
     135b219:	48 85 c0             	test   rax,rax
     135b21c:	74 05                	je     135b223 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a07a7>
     135b21e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b223:	48 8b 8c 24 c0 00 00 	mov    rcx,QWORD PTR [rsp+0xc0]
     135b22a:	00 
     135b22b:	48 8b 41 58          	mov    rax,QWORD PTR [rcx+0x58]
     135b22f:	0f 28 41 50          	movaps xmm0,XMMWORD PTR [rcx+0x50]
     135b233:	0f 29 84 24 70 02 00 	movaps XMMWORD PTR [rsp+0x270],xmm0
     135b23a:	00 
     135b23b:	48 85 c0             	test   rax,rax
     135b23e:	74 05                	je     135b245 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a07c9>
     135b240:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b245:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
     135b24c:	00 
     135b24d:	48 8b 81 88 00 00 00 	mov    rax,QWORD PTR [rcx+0x88]
     135b254:	0f 28 81 80 00 00 00 	movaps xmm0,XMMWORD PTR [rcx+0x80]
     135b25b:	0f 29 84 24 80 02 00 	movaps XMMWORD PTR [rsp+0x280],xmm0
     135b262:	00 
     135b263:	48 85 c0             	test   rax,rax
     135b266:	74 05                	je     135b26d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a07f1>
     135b268:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b26d:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
     135b274:	00 
     135b275:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]

- FDE 0x135a74c hit 0x135b3b1: movups XMMWORD PTR [r13+0x50],xmm0
     135b38a:	0f 28 84 24 60 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x260]
     135b391:	00 
     135b392:	41 0f 11 45 40       	movups XMMWORD PTR [r13+0x40],xmm0
     135b397:	48 85 c0             	test   rax,rax
     135b39a:	74 05                	je     135b3a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0925>
     135b39c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b3a1:	48 8b 84 24 78 02 00 	mov    rax,QWORD PTR [rsp+0x278]
     135b3a8:	00 
     135b3a9:	0f 28 84 24 70 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x270]
     135b3b0:	00 
     135b3b1:	41 0f 11 45 50       	movups XMMWORD PTR [r13+0x50],xmm0
     135b3b6:	48 85 c0             	test   rax,rax
     135b3b9:	74 05                	je     135b3c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0944>
     135b3bb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b3c0:	48 8b 84 24 88 02 00 	mov    rax,QWORD PTR [rsp+0x288]
     135b3c7:	00 
     135b3c8:	0f 28 84 24 80 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x280]
     135b3cf:	00 
     135b3d0:	41 0f 11 45 60       	movups XMMWORD PTR [r13+0x60],xmm0
     135b3d5:	48 85 c0             	test   rax,rax
     135b3d8:	74 05                	je     135b3df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0963>
     135b3da:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135b3df:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
     135b3e4:	48 8d 84 24 a0 02 00 	lea    rax,[rsp+0x2a0]
     135b3eb:	00 
     135b3ec:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
     135b3f0:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
     135b3f4:	41 0f 11 45 70       	movups XMMWORD PTR [r13+0x70],xmm0

- FDE 0x135a74c hit 0x135bbff: mov    QWORD PTR [rax+0x50],rcx
     135bbda:	00 
     135bbdb:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     135bbdf:	48 85 c9             	test   rcx,rcx
     135bbe2:	74 05                	je     135bbe9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a116d>
     135bbe4:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135bbe9:	f3 0f 6f 84 24 c8 01 	movdqu xmm0,XMMWORD PTR [rsp+0x1c8]
     135bbf0:	00 00 
     135bbf2:	f3 0f 7f 40 40       	movdqu XMMWORD PTR [rax+0x40],xmm0
     135bbf7:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
     135bbfe:	00 
     135bbff:	48 89 48 50          	mov    QWORD PTR [rax+0x50],rcx
     135bc03:	48 85 c9             	test   rcx,rcx
     135bc06:	74 05                	je     135bc0d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1191>
     135bc08:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135bc0d:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
     135bc14:	00 
     135bc15:	4c 89 b4 24 10 01 00 	mov    QWORD PTR [rsp+0x110],r14
     135bc1c:	00 
     135bc1d:	49 8b 5e 30          	mov    rbx,QWORD PTR [r14+0x30]
     135bc21:	48 89 9c 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rbx
     135bc28:	00 
     135bc29:	4d 8b 66 38          	mov    r12,QWORD PTR [r14+0x38]
     135bc2d:	4c 89 a4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r12
     135bc34:	00 
     135bc35:	4d 85 e4             	test   r12,r12
     135bc38:	74 06                	je     135bc40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a11c4>
     135bc3a:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     135bc40:	4c 89 bc 24 28 01 00 	mov    QWORD PTR [rsp+0x128],r15

- FDE 0x135a74c hit 0x135bd23: mov    QWORD PTR [rax+0x50],rbp
     135bcfa:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135bcff:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     135bd04:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
     135bd08:	4c 89 68 38          	mov    QWORD PTR [rax+0x38],r13
     135bd0c:	4d 85 ed             	test   r13,r13
     135bd0f:	74 05                	je     135bd16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a129a>
     135bd11:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     135bd16:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     135bd1b:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
     135bd1f:	4c 89 70 48          	mov    QWORD PTR [rax+0x48],r14
     135bd23:	48 89 68 50          	mov    QWORD PTR [rax+0x50],rbp
     135bd27:	48 85 ed             	test   rbp,rbp
     135bd2a:	74 05                	je     135bd31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a12b5>
     135bd2c:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
     135bd31:	48 8d 9c 24 60 01 00 	lea    rbx,[rsp+0x160]
     135bd38:	00 
     135bd39:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     135bd3d:	4c 8d a4 24 30 02 00 	lea    r12,[rsp+0x230]
     135bd44:	00 
     135bd45:	4c 8d bc 24 18 02 00 	lea    r15,[rsp+0x218]
     135bd4c:	00 
     135bd4d:	4c 8d ac 24 e0 01 00 	lea    r13,[rsp+0x1e0]
     135bd54:	00 
     135bd55:	4c 89 e7             	mov    rdi,r12
     135bd58:	4c 89 fe             	mov    rsi,r15
     135bd5b:	4c 89 ea             	mov    rdx,r13
     135bd5e:	48 89 d9             	mov    rcx,rbx
     135bd61:	e8 e0 c3 82 ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>

- FDE 0x135a74c hit 0x135c129: mov    rdi,QWORD PTR [r12+0x50]
     135c0f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     135c0fc:	e8 d3 da 47 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     135c101:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     135c106:	e8 53 0e 10 00       	call   145cf5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a24e2>
     135c10b:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     135c110:	e8 51 dd 47 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     135c115:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     135c11a:	e8 47 dd 47 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     135c11f:	49 8b 7c 24 60       	mov    rdi,QWORD PTR [r12+0x60]
     135c124:	e8 5d 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c129:	49 8b 7c 24 50       	mov    rdi,QWORD PTR [r12+0x50]
     135c12e:	e8 53 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c133:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
     135c138:	e8 49 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c13d:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
     135c142:	e8 3f 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c147:	4c 89 e7             	mov    rdi,r12
     135c14a:	e8 c1 1e 49 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     135c14f:	4c 89 e7             	mov    rdi,r12
     135c152:	e8 c5 22 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     135c157:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     135c15e:	00 
     135c15f:	e8 22 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c164:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135c16a:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     135c171:	e8 10 23 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c176:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
     135c17d:	00 

- FDE 0x135a74c hit 0x135c1c8: mov    rdi,QWORD PTR [rsp+0x50]
     135c19d:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     135c1a2:	4c 89 f3             	mov    rbx,r14
     135c1a5:	48 83 c3 30          	add    rbx,0x30
     135c1a9:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     135c1ae:	e8 cb 00 00 00       	call   135c27e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1802>
     135c1b3:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
     135c1ba:	00 
     135c1bb:	e8 ae c0 82 ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
     135c1c0:	48 89 df             	mov    rdi,rbx
     135c1c3:	e8 48 69 79 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     135c1c8:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     135c1cd:	e8 5a 00 00 00       	call   135c22c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b0>
     135c1d2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c1d9:	00 00 
     135c1db:	48 3b 84 24 10 0d 00 	cmp    rax,QWORD PTR [rsp+0xd10]
     135c1e2:	00 
     135c1e3:	75 10                	jne    135c1f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1779>
     135c1e5:	4c 89 f7             	mov    rdi,r14
     135c1e8:	e8 33 1d 49 00       	call   17edf20 <_ZdlPv@plt>
     135c1ed:	4c 89 ff             	mov    rdi,r15
     135c1f0:	e8 db 3a 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135c1f5:	e8 b6 38 49 00       	call   17efab0 <__stack_chk_fail@plt>

- FDE 0x135c70c hit 0x135c726: lea    rdi,[rbx+0x50]
     135c70c:	53                   	push   rbx
     135c70d:	48 89 fb             	mov    rbx,rdi
     135c710:	48 8d 05 11 b4 50 00 	lea    rax,[rip+0x50b411]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135c717:	48 89 07             	mov    QWORD PTR [rdi],rax
     135c71a:	48 81 c7 d0 00 00 00 	add    rdi,0xd0
     135c721:	e8 58 fb ff ff       	call   135c27e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1802>
     135c726:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     135c72a:	e8 3f bb 82 ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
     135c72f:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     135c733:	e8 d8 63 79 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     135c738:	48 83 c3 28          	add    rbx,0x28
     135c73c:	48 89 df             	mov    rdi,rbx
     135c73f:	5b                   	pop    rbx
     135c740:	e9 e7 fa ff ff       	jmp    135c22c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b0>


## Candidate address point 0x1870480
- +0x28 = 0x1425caa
- return shape = delegated

### Candidate vtable slots
- +0x0: 0x1425c7a FDE=(21126266, 21126276)
- +0x8: 0x116671e FDE=(18245406, 18245419)
- +0x10: 0x1425c84 FDE=(21126276, 21126286)
- +0x18: 0x1425c8e FDE=(21126286, 21126299)
- +0x20: 0x1425c9c FDE=(21126300, 21126313)
- +0x28: 0x1425caa FDE=(21126314, 21126324)
- +0x30: 0x1425cb4 FDE=(21126324, 21126337)
- +0x38: 0xadd7ba FDE=(11392954, 11392979)
- +0x40: 0x1425cc2 FDE=(21126338, 21126351)
- +0x48: 0x1425cd0 FDE=(21126352, 21126365)
- +0x50: 0x1425cde FDE=(21126366, 21126379)
- +0x58: 0x1425cec FDE=(21126380, 21126402)
- +0x60: 0x1425d02 FDE=(21126402, 21126415)
- +0x68: 0x1425d10 FDE=(21126416, 21126429)
- +0x70: 0xabd11a FDE=(11260186, 11260199)
- +0x78: 0xabd128 FDE=(11260200, 11260213)
- +0x80: 0x1425d1e FDE=(21126430, 21127215)
- +0x88: 0x1426030 FDE=(21127216, 21127402)
- +0x90: 0x14260ea FDE=(21127402, 21127584)
- +0x98: 0x14261a0 FDE=(21127584, 21127755)
- +0xa0: 0x142624c FDE=(21127756, 21127966)
- +0xa8: 0x142631e FDE=(21127966, 21128146)
- +0xb0: 0x14263d2 FDE=(21128146, 21128307)
- +0xb8: 0xfffffffffffffff8 FDE=None
- +0xc0: 0x0 FDE=None

### Materializations of candidate vptr (0 direct comment refs)

## Candidate address point 0x187b208
- +0x28 = 0xbd80cc
- return shape = delegated

### Candidate vtable slots
- +0x0: 0x150dc0e FDE=(22076430, 22076471)
- +0x8: 0xbd8086 FDE=(12419206, 12419216)
- +0x10: 0x13a6e50 FDE=(20606544, 20606560)
- +0x18: 0xab5b36 FDE=(11230006, 11230022)
- +0x20: 0xab5b46 FDE=(11230022, 11230038)
- +0x28: 0xbd80cc FDE=(12419276, 12419292)
- +0x30: 0xbd80dc FDE=(12419292, 12419305)
- +0x38: 0xaf657c FDE=(11494780, 11494805)
- +0x40: 0xbd8104 FDE=(12419332, 12419345)
- +0x48: 0xbd8112 FDE=(12419346, 12419359)
- +0x50: 0xbd8120 FDE=(12419360, 12419382)
- +0x58: 0x9d81d0 FDE=(10322384, 10322387)
- +0x60: 0x9d81d0 FDE=(10322384, 10322387)
- +0x68: 0xa5bbf0 FDE=(10861552, 10861557)
- +0x70: 0xbd8136 FDE=(12419382, 12419404)
- +0x78: 0x0 FDE=None
- +0x80: 0x0 FDE=None
- +0x88: 0xaad9d2 FDE=(11196882, 11196908)
- +0x90: 0x150e1c2 FDE=(22077890, 22077908)
- +0x98: 0x150e1d4 FDE=(22077908, 22078051)
- +0xa0: 0xb7d29e FDE=(12047006, 12047016)
- +0xa8: 0xbd7a10 FDE=(12417552, 12417566)
- +0xb0: 0x150e264 FDE=(22078052, 22078401)
- +0xb8: 0xb7d2ca FDE=(12047050, 12047060)
- +0xc0: 0xbd7f6a FDE=(12418922, 12418932)

### Materializations of candidate vptr (0 direct comment refs)

## Direct call sites of candidate +0x28 functions and immediate use
## High-address constants near candidate constructor materializations
### candidate 0x1867b28; ctor FDE 0x135a74c..0x135c1fa
- 0x135a7e1: 0x1867b28 :: lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
- 0x135abd9: 0x1874188 :: lea    rcx,[rip+0x5195a8]        # 1874188 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30870>
- 0x135abea: 0x1874dd0 :: lea    rdx,[rip+0x51a1df]        # 1874dd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x314b8>
- 0x135ac3d: 0x18741c0 :: lea    rcx,[rip+0x51957c]        # 18741c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x308a8>
- 0x135ac47: 0x1874cf0 :: lea    rcx,[rip+0x51a0a2]        # 1874cf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x313d8>
- 0x135ad33: 0x1874e60 :: lea    rax,[rip+0x51a126]        # 1874e60 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x31548>
- 0x135ae66: 0x180adc8 :: lea    rax,[rip+0x4aff5b]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
- 0x135ae71: 0x18741f8 :: lea    rax,[rip+0x519380]        # 18741f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x308e0>
- 0x135af43: 0x18742a0 :: lea    rax,[rip+0x519356]        # 18742a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30988>
- 0x135b18a: 0x1809cd0 :: lea    rax,[rip+0x4aeb3f]        # 1809cd0 <_ZTIN4asio22service_already_existsE@@Base+0xb4b8>
- 0x135b31a: 0x18746a8 :: lea    rax,[rip+0x519387]        # 18746a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30d90>
- 0x135b475: 0x18747b0 :: lea    rax,[rip+0x519334]        # 18747b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30e98>
- 0x135b612: 0x1809cd0 :: lea    rax,[rip+0x4ae6b7]        # 1809cd0 <_ZTIN4asio22service_already_existsE@@Base+0xb4b8>
- 0x135ba5c: 0x180adc8 :: lea    rcx,[rip+0x4af365]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
- 0x135ba6d: 0x180dd50 :: lea    rcx,[rip+0x4b22dc]        # 180dd50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a10>
- 0x135bb81: 0x1867b88 :: lea    rcx,[rip+0x50c000]        # 1867b88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24270>
- 0x135bcc7: 0x1867bd0 :: lea    rcx,[rip+0x50bf02]        # 1867bd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x242b8>
- 0x135bdf4: 0x1874e20 :: lea    rdx,[rip+0x519025]        # 1874e20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x31508>

### candidate 0x1867b28; ctor FDE 0x135c70c..0x135c745
- 0x135c710: 0x1867b28 :: lea    rax,[rip+0x50b411]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>

