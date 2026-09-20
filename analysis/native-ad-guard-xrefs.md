# Orbit ad skip guard trace

Known restriction builder: 0x10a6464..0x10a7f52
Known ad skip-next container: r14+0x14a0
Known ad skip guard in that builder: r14+0x470

## All +0x470 memory references

Total references: 408; syntactic writes: 87

### 0xa79d6a (0xa79ce6..0xa79d90)
      a79d42:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]
      a79d49:	00 
      a79d4a:	4c 89 51 10          	mov    QWORD PTR [rcx+0x10],r10
      a79d4e:	48 8d 84 24 e0 00 00 	lea    rax,[rsp+0xe0]
      a79d55:	00 
      a79d56:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      a79d5a:	48 b8 18 00 00 00 30 	movabs rax,0x3000000018
      a79d61:	00 00 00 
      a79d64:	48 89 01             	mov    QWORD PTR [rcx],rax
      a79d67:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a79d6a:	ff 90 70 04 00 00    	call   QWORD PTR [rax+0x470]
      a79d70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      a79d77:	00 00 
      a79d79:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
      a79d80:	00 
      a79d81:	75 08                	jne    a79d8b <JNI_OnUnload@@Base+0x1658>
      a79d83:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
      a79d8a:	c3                   	ret
      a79d8b:	e8 20 5d d7 00       	call   17efab0 <__stack_chk_fail@plt>
      a79d90:	41 56                	push   r14
      a79d92:	53                   	push   rbx
      a79d93:	50                   	push   rax

### 0xa7f4ad (0xa7e773..0xa7f6a3)
      a7f488:	48 89 e7             	mov    rdi,rsp
      a7f48b:	e8 58 c1 ff ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
      a7f490:	6a 18                	push   0x18
      a7f492:	5b                   	pop    rbx
      a7f493:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
      a7f497:	48 81 c7 20 01 00 00 	add    rdi,0x120
      a7f49e:	e8 ed e9 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a7f4a3:	48 83 c3 e8          	add    rbx,0xffffffffffffffe8
      a7f4a7:	48 83 fb e8          	cmp    rbx,0xffffffffffffffe8
      a7f4ab:	75 e6                	jne    a7f493 <JNI_OnUnload@@Base+0x6d60>
      a7f4ad:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
      a7f4b4:	00 
      a7f4b5:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      a7f4ba:	e8 29 c1 ff ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
      a7f4bf:	6a 18                	push   0x18
      a7f4c1:	41 5f                	pop    r15
      a7f4c3:	4a 8d 3c 3c          	lea    rdi,[rsp+r15*1]
      a7f4c7:	48 81 c7 50 01 00 00 	add    rdi,0x150
      a7f4ce:	e8 bd e9 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a7f4d3:	49 83 c7 e8          	add    r15,0xffffffffffffffe8
      a7f4d7:	49 83 ff e8          	cmp    r15,0xffffffffffffffe8
      a7f4db:	75 e6                	jne    a7f4c3 <JNI_OnUnload@@Base+0x6d90>

### 0xa8b83d (0xa8ae88..0xa8c879)
      a8b813:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
      a8b81a:	00 
      a8b81b:	31 c9                	xor    ecx,ecx
      a8b81d:	e8 cc 0e 28 00       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
      a8b822:	48 8d 9c 24 70 0b 00 	lea    rbx,[rsp+0xb70]
      a8b829:	00 
      a8b82a:	c7 43 c0 0d 00 00 00 	mov    DWORD PTR [rbx-0x40],0xd
      a8b831:	0f 28 84 24 60 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x460]
      a8b838:	00 
      a8b839:	0f 11 43 c8          	movups XMMWORD PTR [rbx-0x38],xmm0
      a8b83d:	48 8b 84 24 70 04 00 	mov    rax,QWORD PTR [rsp+0x470]
      a8b844:	00 
      a8b845:	48 89 43 d8          	mov    QWORD PTR [rbx-0x28],rax
      a8b849:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
      a8b850:	00 00 
      a8b852:	0f 57 c0             	xorps  xmm0,xmm0
      a8b855:	0f 29 84 24 60 04 00 	movaps XMMWORD PTR [rsp+0x460],xmm0
      a8b85c:	00 
      a8b85d:	0f 10 8c 24 78 04 00 	movups xmm1,XMMWORD PTR [rsp+0x478]
      a8b864:	00 
      a8b865:	0f 11 4b e0          	movups XMMWORD PTR [rbx-0x20],xmm1
      a8b869:	48 8b 84 24 88 04 00 	mov    rax,QWORD PTR [rsp+0x488]

### 0xa8b849 (0xa8ae88..0xa8c879) WRITE
      a8b81d:	e8 cc 0e 28 00       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
      a8b822:	48 8d 9c 24 70 0b 00 	lea    rbx,[rsp+0xb70]
      a8b829:	00 
      a8b82a:	c7 43 c0 0d 00 00 00 	mov    DWORD PTR [rbx-0x40],0xd
      a8b831:	0f 28 84 24 60 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x460]
      a8b838:	00 
      a8b839:	0f 11 43 c8          	movups XMMWORD PTR [rbx-0x38],xmm0
      a8b83d:	48 8b 84 24 70 04 00 	mov    rax,QWORD PTR [rsp+0x470]
      a8b844:	00 
      a8b845:	48 89 43 d8          	mov    QWORD PTR [rbx-0x28],rax
      a8b849:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
      a8b850:	00 00 
      a8b852:	0f 57 c0             	xorps  xmm0,xmm0
      a8b855:	0f 29 84 24 60 04 00 	movaps XMMWORD PTR [rsp+0x460],xmm0
      a8b85c:	00 
      a8b85d:	0f 10 8c 24 78 04 00 	movups xmm1,XMMWORD PTR [rsp+0x478]
      a8b864:	00 
      a8b865:	0f 11 4b e0          	movups XMMWORD PTR [rbx-0x20],xmm1
      a8b869:	48 8b 84 24 88 04 00 	mov    rax,QWORD PTR [rsp+0x488]
      a8b870:	00 
      a8b871:	48 83 a4 24 88 04 00 	and    QWORD PTR [rsp+0x488],0x0
      a8b878:	00 00 

### 0xa8d32b (0xa8c879..0xa8fc8b)
      a8d302:	00 
      a8d303:	e8 76 c7 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a8d308:	48 8d b4 24 88 04 00 	lea    rsi,[rsp+0x488]
      a8d30f:	00 
      a8d310:	48 89 df             	mov    rdi,rbx
      a8d313:	e8 28 0c d6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      a8d318:	48 8d 9c 24 20 0d 00 	lea    rbx,[rsp+0xd20]
      a8d31f:	00 
      a8d320:	c6 43 f8 01          	mov    BYTE PTR [rbx-0x8],0x1
      a8d324:	48 8d 35 40 e9 8f ff 	lea    rsi,[rip+0xffffffffff8fe940]        # 38bc6b <_ZTSSt12bad_any_cast@@Base-0x455d>
      a8d32b:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      a8d332:	00 
      a8d333:	e8 46 c7 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a8d338:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
      a8d33f:	00 
      a8d340:	48 89 df             	mov    rdi,rbx
      a8d343:	e8 f8 0b d6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      a8d348:	48 8d 9c 24 40 0d 00 	lea    rbx,[rsp+0xd40]
      a8d34f:	00 
      a8d350:	c6 43 f8 01          	mov    BYTE PTR [rbx-0x8],0x1
      a8d354:	48 8d 35 e0 c9 8a ff 	lea    rsi,[rip+0xffffffffff8ac9e0]        # 339d3b <_ZTSSt12bad_any_cast@@Base-0x5648d>
      a8d35b:	48 8d bc 24 58 04 00 	lea    rdi,[rsp+0x458]

### 0xa8d338 (0xa8c879..0xa8fc8b)
      a8d30f:	00 
      a8d310:	48 89 df             	mov    rdi,rbx
      a8d313:	e8 28 0c d6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      a8d318:	48 8d 9c 24 20 0d 00 	lea    rbx,[rsp+0xd20]
      a8d31f:	00 
      a8d320:	c6 43 f8 01          	mov    BYTE PTR [rbx-0x8],0x1
      a8d324:	48 8d 35 40 e9 8f ff 	lea    rsi,[rip+0xffffffffff8fe940]        # 38bc6b <_ZTSSt12bad_any_cast@@Base-0x455d>
      a8d32b:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      a8d332:	00 
      a8d333:	e8 46 c7 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a8d338:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
      a8d33f:	00 
      a8d340:	48 89 df             	mov    rdi,rbx
      a8d343:	e8 f8 0b d6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      a8d348:	48 8d 9c 24 40 0d 00 	lea    rbx,[rsp+0xd40]
      a8d34f:	00 
      a8d350:	c6 43 f8 01          	mov    BYTE PTR [rbx-0x8],0x1
      a8d354:	48 8d 35 e0 c9 8a ff 	lea    rsi,[rip+0xffffffffff8ac9e0]        # 339d3b <_ZTSSt12bad_any_cast@@Base-0x5648d>
      a8d35b:	48 8d bc 24 58 04 00 	lea    rdi,[rsp+0x458]
      a8d362:	00 
      a8d363:	e8 16 c7 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a8d368:	48 8d b4 24 58 04 00 	lea    rsi,[rsp+0x458]

### 0xa8df3f (0xa8c879..0xa8fc8b)
      a8df16:	e8 75 ff d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a8df1b:	48 83 c3 e0          	add    rbx,0xffffffffffffffe0
      a8df1f:	48 83 fb e0          	cmp    rbx,0xffffffffffffffe0
      a8df23:	75 e6                	jne    a8df0b <JNI_OnUnload@@Base+0x157d8>
      a8df25:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
      a8df2c:	00 
      a8df2d:	e8 5e ff d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a8df32:	48 8d bc 24 58 04 00 	lea    rdi,[rsp+0x458]
      a8df39:	00 
      a8df3a:	e8 51 ff d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a8df3f:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      a8df46:	00 
      a8df47:	e8 44 ff d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a8df4c:	48 8d bc 24 88 04 00 	lea    rdi,[rsp+0x488]
      a8df53:	00 
      a8df54:	e8 37 ff d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a8df59:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
      a8df60:	00 
      a8df61:	e8 2a ff d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a8df66:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
      a8df6d:	00 
      a8df6e:	e8 57 83 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>

### 0xa8ea01 (0xa8c879..0xa8fc8b)
      a8e9db:	49 83 c6 e0          	add    r14,0xffffffffffffffe0
      a8e9df:	49 83 fe e0          	cmp    r14,0xffffffffffffffe0
      a8e9e3:	75 e6                	jne    a8e9cb <JNI_OnUnload@@Base+0x16298>
      a8e9e5:	31 ed                	xor    ebp,ebp
      a8e9e7:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
      a8e9ee:	00 
      a8e9ef:	e8 9c f4 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a8e9f4:	48 8d bc 24 58 04 00 	lea    rdi,[rsp+0x458]
      a8e9fb:	00 
      a8e9fc:	e8 8f f4 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a8ea01:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      a8ea08:	00 
      a8ea09:	e8 82 f4 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a8ea0e:	48 8d bc 24 88 04 00 	lea    rdi,[rsp+0x488]
      a8ea15:	00 
      a8ea16:	e8 75 f4 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a8ea1b:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
      a8ea22:	00 
      a8ea23:	e8 68 f4 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      a8ea28:	48 8d 84 24 e0 0c 00 	lea    rax,[rsp+0xce0]
      a8ea2f:	00 
      a8ea30:	48 39 d8             	cmp    rax,rbx

### 0xa965c2 (0xa962cf..0xa96d29)
      a96592:	41 0f 11 46 f0       	movups XMMWORD PTR [r14-0x10],xmm0
      a96597:	48 8d 35 02 9c 89 ff 	lea    rsi,[rip+0xffffffffff899c02]        # 3301a0 <_ZTSSt12bad_any_cast@@Base-0x60028>
      a9659e:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      a965a5:	00 
      a965a6:	e8 d3 34 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a965ab:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
      a965b2:	00 
      a965b3:	4c 89 f7             	mov    rdi,r14
      a965b6:	e8 85 79 d5 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      a965bb:	0f 10 05 96 0b df 00 	movups xmm0,XMMWORD PTR [rip+0xdf0b96]        # 1887158 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x43840>
      a965c2:	4c 8d b4 24 70 04 00 	lea    r14,[rsp+0x470]
      a965c9:	00 
      a965ca:	41 0f 11 46 f0       	movups XMMWORD PTR [r14-0x10],xmm0
      a965cf:	48 8d 35 31 72 8a ff 	lea    rsi,[rip+0xffffffffff8a7231]        # 33d807 <_ZTSSt12bad_any_cast@@Base-0x529c1>
      a965d6:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
      a965dd:	00 
      a965de:	e8 9b 34 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      a965e3:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      a965ea:	00 
      a965eb:	4c 89 f7             	mov    rdi,r14
      a965ee:	e8 4d 79 d5 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      a965f3:	0f 10 05 6e 0b df 00 	movups xmm0,XMMWORD PTR [rip+0xdf0b6e]        # 1887168 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x43850>

### 0xaa247a (0xaa1418..0xaa6ad6)
      aa244e:	5f                   	pop    rdi
      aa244f:	ba 85 00 00 00       	mov    edx,0x85
      aa2454:	31 c0                	xor    eax,eax
      aa2456:	e8 77 44 d3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      aa245b:	88 9c 24 e0 02 00 00 	mov    BYTE PTR [rsp+0x2e0],bl
      aa2462:	88 9c 24 70 07 00 00 	mov    BYTE PTR [rsp+0x770],bl
      aa2469:	e9 b8 05 00 00       	jmp    aa2a26 <JNI_OnUnload@@Base+0x2a2f3>
      aa246e:	48 89 84 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rax
      aa2475:	00 
      aa2476:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
      aa247a:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
      aa2481:	00 
      aa2482:	48 89 43 d8          	mov    QWORD PTR [rbx-0x28],rax
      aa2486:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      aa248a:	f3 0f 7f 43 c8       	movdqu XMMWORD PTR [rbx-0x38],xmm0
      aa248f:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
      aa2494:	66 0f ef c0          	pxor   xmm0,xmm0
      aa2498:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
      aa249c:	48 8b 84 24 b0 11 00 	mov    rax,QWORD PTR [rsp+0x11b0]
      aa24a3:	00 
      aa24a4:	48 89 43 f0          	mov    QWORD PTR [rbx-0x10],rax
      aa24a8:	0f 28 8c 24 a0 11 00 	movaps xmm1,XMMWORD PTR [rsp+0x11a0]

### 0xac7be9 (0xac6a72..0xac8907)
      ac7bc0:	00 
      ac7bc1:	89 47 78             	mov    DWORD PTR [rdi+0x78],eax
      ac7bc4:	48 8b 84 24 dc 02 00 	mov    rax,QWORD PTR [rsp+0x2dc]
      ac7bcb:	00 
      ac7bcc:	83 f8 02             	cmp    eax,0x2
      ac7bcf:	0f 94 47 7c          	sete   BYTE PTR [rdi+0x7c]
      ac7bd3:	48 89 87 80 00 00 00 	mov    QWORD PTR [rdi+0x80],rax
      ac7bda:	8a 84 24 bd 00 00 00 	mov    al,BYTE PTR [rsp+0xbd]
      ac7be1:	88 47 7d             	mov    BYTE PTR [rdi+0x7d],al
      ac7be4:	e8 2e 31 a7 00       	call   153ad17 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38029b>
      ac7be9:	4c 8d b4 24 70 04 00 	lea    r14,[rsp+0x470]
      ac7bf0:	00 
      ac7bf1:	0f 57 c0             	xorps  xmm0,xmm0
      ac7bf4:	41 0f 11 46 ec       	movups XMMWORD PTR [r14-0x14],xmm0
      ac7bf9:	41 0f 29 46 e0       	movaps XMMWORD PTR [r14-0x20],xmm0
      ac7bfe:	ba c0 00 00 00       	mov    edx,0xc0
      ac7c03:	4c 89 f7             	mov    rdi,r14
      ac7c06:	31 f6                	xor    esi,esi
      ac7c08:	e8 83 6f d2 00       	call   17eeb90 <memset@plt>
      ac7c0d:	48 8d 9c 24 50 04 00 	lea    rbx,[rsp+0x450]
      ac7c14:	00 
      ac7c15:	48 89 df             	mov    rdi,rbx

### 0xacb196 (0xac9d46..0xacbcbe)
      acb169:	00 00 
      acb16b:	66 0f 7f 84 24 10 04 	movdqa XMMWORD PTR [rsp+0x410],xmm0
      acb172:	00 00 
      acb174:	88 84 24 20 04 00 00 	mov    BYTE PTR [rsp+0x420],al
      acb17b:	66 0f 7f 84 24 40 04 	movdqa XMMWORD PTR [rsp+0x440],xmm0
      acb182:	00 00 
      acb184:	66 0f 7f 84 24 50 04 	movdqa XMMWORD PTR [rsp+0x450],xmm0
      acb18b:	00 00 
      acb18d:	66 0f 7f 84 24 60 04 	movdqa XMMWORD PTR [rsp+0x460],xmm0
      acb194:	00 00 
      acb196:	66 0f 7f 84 24 70 04 	movdqa XMMWORD PTR [rsp+0x470],xmm0
      acb19d:	00 00 
      acb19f:	f3 0f 7f 84 24 7c 04 	movdqu XMMWORD PTR [rsp+0x47c],xmm0
      acb1a6:	00 00 
      acb1a8:	66 0f 7f 84 24 90 04 	movdqa XMMWORD PTR [rsp+0x490],xmm0
      acb1af:	00 00 
      acb1b1:	66 0f 7f 84 24 a0 04 	movdqa XMMWORD PTR [rsp+0x4a0],xmm0
      acb1b8:	00 00 
      acb1ba:	66 0f 7f 84 24 b0 04 	movdqa XMMWORD PTR [rsp+0x4b0],xmm0
      acb1c1:	00 00 
      acb1c3:	83 a4 24 c0 04 00 00 	and    DWORD PTR [rsp+0x4c0],0x0
      acb1ca:	00 

### 0xad1b28 (0xad1a74..0xad5057)
      ad1af5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ad1afa:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      ad1aff:	48 83 c7 40          	add    rdi,0x40
      ad1b03:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
      ad1b08:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
      ad1b0d:	48 89 ce             	mov    rsi,rcx
      ad1b10:	e8 ef a1 ff ff       	call   acbd04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18ca4>
      ad1b15:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
      ad1b1a:	80 b9 d9 00 00 00 00 	cmp    BYTE PTR [rcx+0xd9],0x0
      ad1b21:	48 8d 05 f8 f2 d2 00 	lea    rax,[rip+0xd2f2f8]        # 1800e20 <_ZTIN4asio22service_already_existsE@@Base+0x2608>
      ad1b28:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
      ad1b2f:	00 
      ad1b30:	74 21                	je     ad1b53 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1eaf3>
      ad1b32:	48 8d bc 24 50 07 00 	lea    rdi,[rsp+0x750]
      ad1b39:	00 
      ad1b3a:	48 89 07             	mov    QWORD PTR [rdi],rax
      ad1b3d:	48 89 7f 20          	mov    QWORD PTR [rdi+0x20],rdi
      ad1b41:	e8 24 84 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ad1b46:	45 31 e4             	xor    r12d,r12d
      ad1b49:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      ad1b4e:	e9 a2 05 00 00       	jmp    ad20f5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f095>
      ad1b53:	8a 99 d8 00 00 00    	mov    bl,BYTE PTR [rcx+0xd8]

### 0xad1b59 (0xad1a74..0xad5057) WRITE
      ad1b30:	74 21                	je     ad1b53 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1eaf3>
      ad1b32:	48 8d bc 24 50 07 00 	lea    rdi,[rsp+0x750]
      ad1b39:	00 
      ad1b3a:	48 89 07             	mov    QWORD PTR [rdi],rax
      ad1b3d:	48 89 7f 20          	mov    QWORD PTR [rdi+0x20],rdi
      ad1b41:	e8 24 84 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ad1b46:	45 31 e4             	xor    r12d,r12d
      ad1b49:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      ad1b4e:	e9 a2 05 00 00       	jmp    ad20f5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f095>
      ad1b53:	8a 99 d8 00 00 00    	mov    bl,BYTE PTR [rcx+0xd8]
      ad1b59:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      ad1b60:	00 
      ad1b61:	48 89 94 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rdx
      ad1b68:	00 
      ad1b69:	bf 40 02 00 00       	mov    edi,0x240
      ad1b6e:	e8 8d c3 d1 00       	call   17edf00 <_Znwm@plt>
      ad1b73:	49 89 c4             	mov    r12,rax
      ad1b76:	48 8d 05 db a0 db 00 	lea    rax,[rip+0xdba0db]        # 188bc58 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4930>
      ad1b7d:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ad1b81:	48 8d 05 28 a1 db 00 	lea    rax,[rip+0xdba128]        # 188bcb0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4988>
      ad1b88:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      ad1b8d:	48 8d 05 ac a2 db 00 	lea    rax,[rip+0xdba2ac]        # 188be40 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4b18>

### 0xad1bea (0xad1a74..0xad5057)
      ad1bb2:	00 
      ad1bb3:	66 0f ef c0          	pxor   xmm0,xmm0
      ad1bb7:	f3 41 0f 7f 44 24 28 	movdqu XMMWORD PTR [r12+0x28],xmm0
      ad1bbe:	f3 41 0f 7f 44 24 38 	movdqu XMMWORD PTR [r12+0x38],xmm0
      ad1bc5:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      ad1bcc:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
      ad1bd3:	f3 41 0f 7f 44 24 68 	movdqu XMMWORD PTR [r12+0x68],xmm0
      ad1bda:	f3 41 0f 7f 44 24 78 	movdqu XMMWORD PTR [r12+0x78],xmm0
      ad1be1:	49 83 a4 24 88 00 00 	and    QWORD PTR [r12+0x88],0x0
      ad1be8:	00 00 
      ad1bea:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
      ad1bf1:	00 
      ad1bf2:	e8 99 86 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ad1bf7:	4d 8d 7c 24 10       	lea    r15,[r12+0x10]
      ad1bfc:	48 8d 05 6d 9e db 00 	lea    rax,[rip+0xdb9e6d]        # 188ba70 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4748>
      ad1c03:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      ad1c08:	4d 8d b4 24 c0 00 00 	lea    r14,[r12+0xc0]
      ad1c0f:	00 
      ad1c10:	49 8d 84 24 c8 00 00 	lea    rax,[r12+0xc8]
      ad1c17:	00 
      ad1c18:	49 89 84 24 c8 00 00 	mov    QWORD PTR [r12+0xc8],rax
      ad1c1f:	00 

### 0xad1d61 (0xad1a74..0xad5057)
      ad1d33:	00 
      ad1d34:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ad1d37:	48 8d 3d 12 fe f1 00 	lea    rdi,[rip+0xf1fe12]        # 19f1b50 <_ZN4asio6detail17posix_global_implINS_14system_contextEE11static_ptr_E@@Base+0x20>
      ad1d3e:	48 8d 15 c9 2f b3 00 	lea    rdx,[rip+0xb32fc9]        # 1604d0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44a292>
      ad1d45:	e8 b6 c2 d1 00       	call   17ee000 <_ZNSt6__ndk111__call_onceERVmPvPFvS2_E@plt>
      ad1d4a:	48 8b 05 07 fe f1 00 	mov    rax,QWORD PTR [rip+0xf1fe07]        # 19f1b58 <_ZN4asio6detail17posix_global_implINS_14system_contextEE11static_ptr_E@@Base+0x28>
      ad1d51:	49 89 84 24 70 01 00 	mov    QWORD PTR [r12+0x170],rax
      ad1d58:	00 
      ad1d59:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ad1d60:	00 
      ad1d61:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
      ad1d68:	00 
      ad1d69:	e8 22 85 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ad1d6e:	48 83 a4 24 70 07 00 	and    QWORD PTR [rsp+0x770],0x0
      ad1d75:	00 00 
      ad1d77:	6a 40                	push   0x40
      ad1d79:	5f                   	pop    rdi
      ad1d7a:	e8 81 c1 d1 00       	call   17edf00 <_Znwm@plt>
      ad1d7f:	49 89 c6             	mov    r14,rax
      ad1d82:	48 89 84 24 a0 04 00 	mov    QWORD PTR [rsp+0x4a0],rax
      ad1d89:	00 
      ad1d8a:	48 8d 84 24 40 09 00 	lea    rax,[rsp+0x940]

### 0xad1e9a (0xad1a74..0xad5057)
      ad1e71:	4d 8d ac 24 e0 01 00 	lea    r13,[r12+0x1e0]
      ad1e78:	00 
      ad1e79:	4c 89 ef             	mov    rdi,r13
      ad1e7c:	e8 57 ee ff ff       	call   ad0cd8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1dc78>
      ad1e81:	49 8d ac 24 08 02 00 	lea    rbp,[r12+0x208]
      ad1e88:	00 
      ad1e89:	49 83 a4 24 08 02 00 	and    QWORD PTR [r12+0x208],0x0
      ad1e90:	00 00 
      ad1e92:	49 8d bc 24 10 02 00 	lea    rdi,[r12+0x210]
      ad1e99:	00 
      ad1e9a:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
      ad1ea1:	00 
      ad1ea2:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      ad1ea7:	e8 e4 83 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ad1eac:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      ad1eb1:	6a 10                	push   0x10
      ad1eb3:	5f                   	pop    rdi
      ad1eb4:	e8 47 c0 d1 00       	call   17edf00 <_Znwm@plt>
      ad1eb9:	49 89 c6             	mov    r14,rax
      ad1ebc:	48 8d b4 24 90 06 00 	lea    rsi,[rsp+0x690]
      ad1ec3:	00 
      ad1ec4:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0

### 0xad20e8 (0xad1a74..0xad5057)
      ad20c0:	e8 99 f9 fd ff       	call   ab1a5e <JNI_OnUnload@@Base+0x3932b>
      ad20c5:	4c 8d b4 24 40 09 00 	lea    r14,[rsp+0x940]
      ad20cc:	00 
      ad20cd:	48 89 ef             	mov    rdi,rbp
      ad20d0:	4c 89 f6             	mov    rsi,r14
      ad20d3:	e8 50 27 25 00       	call   d24828 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2717c8>
      ad20d8:	4c 89 f7             	mov    rdi,r14
      ad20db:	e8 b0 c3 d1 00       	call   17ee490 <_ZNSt6__ndk16threadD1Ev@plt>
      ad20e0:	4c 89 ef             	mov    rdi,r13
      ad20e3:	e8 54 ec ff ff       	call   ad0d3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1dcdc>
      ad20e8:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      ad20ef:	00 
      ad20f0:	e8 75 7e fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ad20f5:	4c 89 a3 80 02 00 00 	mov    QWORD PTR [rbx+0x280],r12
      ad20fc:	6a 18                	push   0x18
      ad20fe:	5f                   	pop    rdi
      ad20ff:	e8 fc bd d1 00       	call   17edf00 <_Znwm@plt>
      ad2104:	49 89 c6             	mov    r14,rax
      ad2107:	48 8d 05 62 97 db 00 	lea    rax,[rip+0xdb9762]        # 188b870 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4548>
      ad210e:	49 89 06             	mov    QWORD PTR [r14],rax
      ad2111:	bf 70 02 00 00       	mov    edi,0x270
      ad2116:	e8 e5 bd d1 00       	call   17edf00 <_Znwm@plt>

### 0xad2d53 (0xad1a74..0xad5057)
      ad2d31:	00 
      ad2d32:	4c 89 ef             	mov    rdi,r13
      ad2d35:	e8 56 75 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ad2d3a:	8a 44 24 30          	mov    al,BYTE PTR [rsp+0x30]
      ad2d3e:	41 88 84 24 f0 02 00 	mov    BYTE PTR [r12+0x2f0],al
      ad2d45:	00 
      ad2d46:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
      ad2d4d:	00 
      ad2d4e:	48 85 ff             	test   rdi,rdi
      ad2d51:	74 15                	je     ad2d68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fd08>
      ad2d53:	48 8d 84 24 70 04 00 	lea    rax,[rsp+0x470]
      ad2d5a:	00 
      ad2d5b:	48 39 c7             	cmp    rdi,rax
      ad2d5e:	74 14                	je     ad2d74 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fd14>
      ad2d60:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ad2d63:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad2d66:	eb 02                	jmp    ad2d6a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fd0a>
      ad2d68:	31 c0                	xor    eax,eax
      ad2d6a:	49 89 84 24 20 03 00 	mov    QWORD PTR [r12+0x320],rax
      ad2d71:	00 
      ad2d72:	eb 1e                	jmp    ad2d92 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fd32>
      ad2d74:	49 8d b4 24 00 03 00 	lea    rsi,[r12+0x300]

### 0xad2d84 (0xad1a74..0xad5057)
      ad2d63:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad2d66:	eb 02                	jmp    ad2d6a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fd0a>
      ad2d68:	31 c0                	xor    eax,eax
      ad2d6a:	49 89 84 24 20 03 00 	mov    QWORD PTR [r12+0x320],rax
      ad2d71:	00 
      ad2d72:	eb 1e                	jmp    ad2d92 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fd32>
      ad2d74:	49 8d b4 24 00 03 00 	lea    rsi,[r12+0x300]
      ad2d7b:	00 
      ad2d7c:	49 89 b4 24 20 03 00 	mov    QWORD PTR [r12+0x320],rsi
      ad2d83:	00 
      ad2d84:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      ad2d8b:	00 
      ad2d8c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ad2d8f:	ff 50 18             	call   QWORD PTR [rax+0x18]
      ad2d92:	31 c0                	xor    eax,eax
      ad2d94:	41 88 84 24 30 03 00 	mov    BYTE PTR [r12+0x330],al
      ad2d9b:	00 
      ad2d9c:	41 88 84 24 40 03 00 	mov    BYTE PTR [r12+0x340],al
      ad2da3:	00 
      ad2da4:	41 88 84 24 48 03 00 	mov    BYTE PTR [r12+0x348],al
      ad2dab:	00 
      ad2dac:	41 88 84 24 58 03 00 	mov    BYTE PTR [r12+0x358],al

### 0xad2e5f (0xad1a74..0xad5057)
      ad2e31:	e8 7c b6 fc ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      ad2e36:	4c 89 e7             	mov    rdi,r12
      ad2e39:	e8 48 b6 fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ad2e3e:	31 ff                	xor    edi,edi
      ad2e40:	e8 d7 b5 fc ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ad2e45:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      ad2e4a:	49 89 9e f8 02 00 00 	mov    QWORD PTR [r14+0x2f8],rbx
      ad2e51:	4d 89 a6 00 03 00 00 	mov    QWORD PTR [r14+0x300],r12
      ad2e58:	31 ff                	xor    edi,edi
      ad2e5a:	e8 27 b6 fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ad2e5f:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      ad2e66:	00 
      ad2e67:	e8 fe 70 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ad2e6c:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      ad2e73:	00 
      ad2e74:	e8 d5 39 00 00       	call   ad684e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237ee>
      ad2e79:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
      ad2e80:	00 
      ad2e81:	e8 02 26 00 00       	call   ad5488 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22428>
      ad2e86:	48 8d bc 24 90 06 00 	lea    rdi,[rsp+0x690]
      ad2e8d:	00 
      ad2e8e:	e8 d5 39 00 00       	call   ad6868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23808>

### 0xad310d (0xad1a74..0xad5057)
      ad30e4:	00 00 
      ad30e6:	66 0f 7f 84 24 20 04 	movdqa XMMWORD PTR [rsp+0x420],xmm0
      ad30ed:	00 00 
      ad30ef:	66 0f ef c0          	pxor   xmm0,xmm0
      ad30f3:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
      ad30fa:	00 00 
      ad30fc:	48 83 a4 24 e0 00 00 	and    QWORD PTR [rsp+0xe0],0x0
      ad3103:	00 00 
      ad3105:	0f 28 8c 24 b0 00 00 	movaps xmm1,XMMWORD PTR [rsp+0xb0]
      ad310c:	00 
      ad310d:	0f 29 8c 24 70 04 00 	movaps XMMWORD PTR [rsp+0x470],xmm1
      ad3114:	00 
      ad3115:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
      ad311c:	00 
      ad311d:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
      ad3124:	00 
      ad3125:	66 0f 7f 84 24 b0 00 	movdqa XMMWORD PTR [rsp+0xb0],xmm0
      ad312c:	00 00 
      ad312e:	48 83 a4 24 c0 00 00 	and    QWORD PTR [rsp+0xc0],0x0
      ad3135:	00 00 
      ad3137:	48 8d 05 ea ad da 00 	lea    rax,[rip+0xdaadea]        # 187df28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a610>
      ad313e:	48 89 84 24 50 07 00 	mov    QWORD PTR [rsp+0x750],rax

### 0xad318f (0xad1a74..0xad5057)
      ad3165:	0f 29 8c 24 f0 06 00 	movaps XMMWORD PTR [rsp+0x6f0],xmm1
      ad316c:	00 
      ad316d:	48 8b 84 24 30 04 00 	mov    rax,QWORD PTR [rsp+0x430]
      ad3174:	00 
      ad3175:	48 89 84 24 00 07 00 	mov    QWORD PTR [rsp+0x700],rax
      ad317c:	00 
      ad317d:	48 83 a4 24 30 04 00 	and    QWORD PTR [rsp+0x430],0x0
      ad3184:	00 00 
      ad3186:	66 0f 7f 84 24 20 04 	movdqa XMMWORD PTR [rsp+0x420],xmm0
      ad318d:	00 00 
      ad318f:	66 0f 6f 8c 24 70 04 	movdqa xmm1,XMMWORD PTR [rsp+0x470]
      ad3196:	00 00 
      ad3198:	66 0f 7f 8c 24 90 06 	movdqa XMMWORD PTR [rsp+0x690],xmm1
      ad319f:	00 00 
      ad31a1:	48 8b 84 24 80 04 00 	mov    rax,QWORD PTR [rsp+0x480]
      ad31a8:	00 
      ad31a9:	48 89 84 24 a0 06 00 	mov    QWORD PTR [rsp+0x6a0],rax
      ad31b0:	00 
      ad31b1:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
      ad31b8:	00 00 
      ad31ba:	66 0f 7f 84 24 70 04 	movdqa XMMWORD PTR [rsp+0x470],xmm0
      ad31c1:	00 00 

### 0xad31ba (0xad1a74..0xad5057)
      ad318f:	66 0f 6f 8c 24 70 04 	movdqa xmm1,XMMWORD PTR [rsp+0x470]
      ad3196:	00 00 
      ad3198:	66 0f 7f 8c 24 90 06 	movdqa XMMWORD PTR [rsp+0x690],xmm1
      ad319f:	00 00 
      ad31a1:	48 8b 84 24 80 04 00 	mov    rax,QWORD PTR [rsp+0x480]
      ad31a8:	00 
      ad31a9:	48 89 84 24 a0 06 00 	mov    QWORD PTR [rsp+0x6a0],rax
      ad31b0:	00 
      ad31b1:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
      ad31b8:	00 00 
      ad31ba:	66 0f 7f 84 24 70 04 	movdqa XMMWORD PTR [rsp+0x470],xmm0
      ad31c1:	00 00 
      ad31c3:	48 8d 05 a6 ad da 00 	lea    rax,[rip+0xdaada6]        # 187df70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a658>
      ad31ca:	49 89 04 24          	mov    QWORD PTR [r12],rax
      ad31ce:	49 8d 5c 24 08       	lea    rbx,[r12+0x8]
      ad31d3:	48 89 df             	mov    rdi,rbx
      ad31d6:	e8 27 6c d0 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      ad31db:	41 89 6c 24 60       	mov    DWORD PTR [r12+0x60],ebp
      ad31e0:	49 8d 74 24 70       	lea    rsi,[r12+0x70]
      ad31e5:	48 8b 84 24 70 07 00 	mov    rax,QWORD PTR [rsp+0x770]
      ad31ec:	00 
      ad31ed:	48 85 c0             	test   rax,rax

### 0xad34b3 (0xad1a74..0xad5057)
      ad3487:	e8 a4 89 fd ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
      ad348c:	48 8d bc 24 90 06 00 	lea    rdi,[rsp+0x690]
      ad3493:	00 
      ad3494:	e8 f7 a9 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad3499:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ad34a0:	00 
      ad34a1:	e8 ea a9 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad34a6:	48 8d bc 24 50 07 00 	lea    rdi,[rsp+0x750]
      ad34ad:	00 
      ad34ae:	e8 b7 6a fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ad34b3:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      ad34ba:	00 
      ad34bb:	e8 d0 a9 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad34c0:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      ad34c7:	00 
      ad34c8:	e8 c3 a9 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad34cd:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      ad34d2:	4c 89 a3 28 03 00 00 	mov    QWORD PTR [rbx+0x328],r12
      ad34d9:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      ad34e0:	00 
      ad34e1:	e8 aa a9 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad34e6:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]

### 0xad4ea3 (0xad1a74..0xad5057)
      ad4e7a:	e8 09 06 00 00       	call   ad5488 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22428>
      ad4e7f:	48 8d bc 24 40 09 00 	lea    rdi,[rsp+0x940]
      ad4e86:	00 
      ad4e87:	e8 dc 19 00 00       	call   ad6868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23808>
      ad4e8c:	4c 89 e7             	mov    rdi,r12
      ad4e8f:	e8 7c 91 d1 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ad4e94:	4c 89 e7             	mov    rdi,r12
      ad4e97:	e8 80 95 fc ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ad4e9c:	eb 05                	jmp    ad4ea3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e43>
      ad4e9e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ad4ea3:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      ad4eaa:	00 
      ad4eab:	e8 ba 50 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ad4eb0:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      ad4eb7:	00 
      ad4eb8:	e8 91 19 00 00       	call   ad684e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237ee>
      ad4ebd:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
      ad4ec4:	00 
      ad4ec5:	e8 be 05 00 00       	call   ad5488 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22428>
      ad4eca:	48 8d bc 24 90 06 00 	lea    rdi,[rsp+0x690]
      ad4ed1:	00 
      ad4ed2:	e8 91 19 00 00       	call   ad6868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23808>

### 0xad4f81 (0xad1a74..0xad5057)
      ad4f57:	4c 89 ef             	mov    rdi,r13
      ad4f5a:	e8 c7 85 b3 00       	call   160d526 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8694>
      ad4f5f:	4c 89 ef             	mov    rdi,r13
      ad4f62:	e8 b9 8f d1 00       	call   17edf20 <_ZdlPv@plt>
      ad4f67:	4c 89 f7             	mov    rdi,r14
      ad4f6a:	e8 5f 7c b3 00       	call   160cbce <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7d3c>
      ad4f6f:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      ad4f74:	e8 d9 7f b3 00       	call   160cf52 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80c0>
      ad4f79:	4c 89 e7             	mov    rdi,r12
      ad4f7c:	e8 9f 8f d1 00       	call   17edf20 <_ZdlPv@plt>
      ad4f81:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      ad4f88:	00 
      ad4f89:	e8 dc 4f fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ad4f8e:	eb 0f                	jmp    ad4f9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21f3f>
      ad4f90:	eb 00                	jmp    ad4f92 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21f32>
      ad4f92:	48 89 c7             	mov    rdi,rax
      ad4f95:	e8 0b 4b fa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      ad4f9a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ad4f9f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      ad4fa4:	e8 fc 4a fa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      ad4fa9:	48 89 c3             	mov    rbx,rax
      ad4fac:	40 f6 c5 01          	test   bpl,0x1

### 0xad502d (0xad1a74..0xad5057)
      ad5001:	e8 60 4e d0 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ad5006:	48 8d bc 24 90 06 00 	lea    rdi,[rsp+0x690]
      ad500d:	00 
      ad500e:	e8 7d 8e d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad5013:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ad501a:	00 
      ad501b:	e8 70 8e d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad5020:	48 8d bc 24 50 07 00 	lea    rdi,[rsp+0x750]
      ad5027:	00 
      ad5028:	e8 3d 4f fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ad502d:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      ad5034:	00 
      ad5035:	e8 56 8e d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad503a:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      ad5041:	00 
      ad5042:	e8 49 8e d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad5047:	4c 89 e7             	mov    rdi,r12
      ad504a:	e8 d1 8e d1 00       	call   17edf20 <_ZdlPv@plt>
      ad504f:	48 89 df             	mov    rdi,rbx
      ad5052:	e8 4e 4a fa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      ad5057:	48 85 f6             	test   rsi,rsi
      ad505a:	0f 84 91 5f 06 00    	je     b3aff1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x87f91>

### 0xb6799e (0xb67984..0xb67ee7) WRITE
      b67983:	c3                   	ret
      b67984:	55                   	push   rbp
      b67985:	41 57                	push   r15
      b67987:	41 56                	push   r14
      b67989:	41 55                	push   r13
      b6798b:	41 54                	push   r12
      b6798d:	53                   	push   rbx
      b6798e:	48 81 ec 78 04 00 00 	sub    rsp,0x478
      b67995:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b6799c:	00 00 
      b6799e:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      b679a5:	00 
      b679a6:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
      b679a9:	80 7e 10 00          	cmp    BYTE PTR [rsi+0x10],0x0
      b679ad:	0f 84 36 01 00 00    	je     b67ae9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4a89>
      b679b3:	0f 57 c0             	xorps  xmm0,xmm0
      b679b6:	4c 8b 26             	mov    r12,QWORD PTR [rsi]
      b679b9:	48 8b 5e 08          	mov    rbx,QWORD PTR [rsi+0x8]
      b679bd:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
      b679c0:	41 0f b7 6e 68       	movzx  ebp,WORD PTR [r14+0x68]
      b679c5:	4c 8d bc 24 58 02 00 	lea    r15,[rsp+0x258]
      b679cc:	00 

### 0xb67e36 (0xb67984..0xb67ee7)
      b67e0a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      b67e0f:	e8 da c9 83 00       	call   13a47ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e9d72>
      b67e14:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      b67e19:	e8 72 09 00 00       	call   b68790 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5730>
      b67e1e:	40 b5 01             	mov    bpl,0x1
      b67e21:	40 0f b6 f5          	movzx  esi,bpl
      b67e25:	48 89 df             	mov    rdi,rbx
      b67e28:	e8 51 06 00 00       	call   b6847e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb541e>
      b67e2d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b67e34:	00 00 
      b67e36:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      b67e3d:	00 
      b67e3e:	75 12                	jne    b67e52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4df2>
      b67e40:	48 81 c4 78 04 00 00 	add    rsp,0x478
      b67e47:	5b                   	pop    rbx
      b67e48:	41 5c                	pop    r12
      b67e4a:	41 5d                	pop    r13
      b67e4c:	41 5e                	pop    r14
      b67e4e:	41 5f                	pop    r15
      b67e50:	5d                   	pop    rbp
      b67e51:	c3                   	ret
      b67e52:	e8 59 7c c8 00       	call   17efab0 <__stack_chk_fail@plt>

### 0xb75180 (0xb7513c..0xb75723)
      b75166:	00 
      b75167:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
      b7516b:	48 8b 77 18          	mov    rsi,QWORD PTR [rdi+0x18]
      b7516f:	48 89 f0             	mov    rax,rsi
      b75172:	48 29 c8             	sub    rax,rcx
      b75175:	6a 60                	push   0x60
      b75177:	5d                   	pop    rbp
      b75178:	48 99                	cqo
      b7517a:	48 f7 fd             	idiv   rbp
      b7517d:	49 89 c7             	mov    r15,rax
      b75180:	48 8b 87 70 04 00 00 	mov    rax,QWORD PTR [rdi+0x470]
      b75187:	a8 04                	test   al,0x4
      b75189:	74 08                	je     b75193 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc2133>
      b7518b:	8b 83 78 04 00 00    	mov    eax,DWORD PTR [rbx+0x478]
      b75191:	eb 03                	jmp    b75196 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc2136>
      b75193:	83 e0 03             	and    eax,0x3
      b75196:	44 39 f8             	cmp    eax,r15d
      b75199:	0f 8d b3 00 00 00    	jge    b75252 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc21f2>
      b7519f:	4c 8d a3 70 04 00 00 	lea    r12,[rbx+0x470]
      b751a6:	48 8d bb 60 04 00 00 	lea    rdi,[rbx+0x460]
      b751ad:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      b751b2:	45 89 ee             	mov    r14d,r13d

### 0xb7519f (0xb7513c..0xb75723)
      b7517a:	48 f7 fd             	idiv   rbp
      b7517d:	49 89 c7             	mov    r15,rax
      b75180:	48 8b 87 70 04 00 00 	mov    rax,QWORD PTR [rdi+0x470]
      b75187:	a8 04                	test   al,0x4
      b75189:	74 08                	je     b75193 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc2133>
      b7518b:	8b 83 78 04 00 00    	mov    eax,DWORD PTR [rbx+0x478]
      b75191:	eb 03                	jmp    b75196 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc2136>
      b75193:	83 e0 03             	and    eax,0x3
      b75196:	44 39 f8             	cmp    eax,r15d
      b75199:	0f 8d b3 00 00 00    	jge    b75252 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc21f2>
      b7519f:	4c 8d a3 70 04 00 00 	lea    r12,[rbx+0x470]
      b751a6:	48 8d bb 60 04 00 00 	lea    rdi,[rbx+0x460]
      b751ad:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      b751b2:	45 89 ee             	mov    r14d,r13d
      b751b5:	4c 8d ac 24 30 01 00 	lea    r13,[rsp+0x130]
      b751bc:	00 
      b751bd:	41 83 4d 00 ff       	or     DWORD PTR [r13+0x0],0xffffffff
      b751c2:	44 89 fe             	mov    esi,r15d
      b751c5:	4c 89 ea             	mov    rdx,r13
      b751c8:	e8 a9 17 00 00       	call   b76976 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc3916>
      b751cd:	41 83 4d 00 ff       	or     DWORD PTR [r13+0x0],0xffffffff
      b751d2:	4c 8d ac 24 30 01 00 	lea    r13,[rsp+0x130]

### 0xb75310 (0xb7513c..0xb75723)
      b752e5:	42 80 7c 99 ff 00    	cmp    BYTE PTR [rcx+r11*4-0x1],0x0
      b752eb:	74 3c                	je     b75329 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc22c9>
      b752ed:	42 8b 44 99 e4       	mov    eax,DWORD PTR [rcx+r11*4-0x1c]
      b752f2:	48 8b 93 60 04 00 00 	mov    rdx,QWORD PTR [rbx+0x460]
      b752f9:	49 89 d4             	mov    r12,rdx
      b752fc:	49 83 e4 f8          	and    r12,0xfffffffffffffff8
      b75300:	f6 c2 04             	test   dl,0x4
      b75303:	4d 0f 44 e2          	cmove  r12,r10
      b75307:	43 89 04 bc          	mov    DWORD PTR [r12+r15*4],eax
      b7530b:	42 8b 44 99 ec       	mov    eax,DWORD PTR [rcx+r11*4-0x14]
      b75310:	48 8b 8b 70 04 00 00 	mov    rcx,QWORD PTR [rbx+0x470]
      b75317:	48 89 ca             	mov    rdx,rcx
      b7531a:	48 83 e2 f8          	and    rdx,0xfffffffffffffff8
      b7531e:	f6 c1 04             	test   cl,0x4
      b75321:	48 0f 44 d6          	cmove  rdx,rsi
      b75325:	42 89 04 ba          	mov    DWORD PTR [rdx+r15*4],eax
      b75329:	49 ff c7             	inc    r15
      b7532c:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      b75330:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
      b75334:	48 29 c8             	sub    rax,rcx
      b75337:	48 99                	cqo
      b75339:	48 f7 fd             	idiv   rbp

### 0xbc2c8b (0xbc2c06..0xbc2cdf)
      bc2c68:	41 b8 ff 00 00 00    	mov    r8d,0xff
      bc2c6e:	41 89 d1             	mov    r9d,edx
      bc2c71:	45 21 c1             	and    r9d,r8d
      bc2c74:	42 2b 8c 8f 5c 02 00 	sub    ecx,DWORD PTR [rdi+r9*4+0x25c]
      bc2c7b:	00 
      bc2c7c:	41 89 c1             	mov    r9d,eax
      bc2c7f:	41 c1 c1 16          	rol    r9d,0x16
      bc2c83:	44 29 ca             	sub    edx,r9d
      bc2c86:	31 c8                	xor    eax,ecx
      bc2c88:	41 21 d0             	and    r8d,edx
      bc2c8b:	42 2b 8c 87 70 04 00 	sub    ecx,DWORD PTR [rdi+r8*4+0x470]
      bc2c92:	00 
      bc2c93:	89 c7                	mov    edi,eax
      bc2c95:	c1 c7 04             	rol    edi,0x4
      bc2c98:	41 89 c8             	mov    r8d,ecx
      bc2c9b:	41 c1 c0 0e          	rol    r8d,0xe
      bc2c9f:	41 01 f8             	add    r8d,edi
      bc2ca2:	89 cf                	mov    edi,ecx
      bc2ca4:	c1 c7 09             	rol    edi,0x9
      bc2ca7:	44 31 c2             	xor    edx,r8d
      bc2caa:	41 89 d0             	mov    r8d,edx
      bc2cad:	41 c1 c0 10          	rol    r8d,0x10

### 0xbc4a5a (0xbc4a06..0xbc4a7b)
      bc4a3c:	ff c5                	inc    ebp
      bc4a3e:	39 cd                	cmp    ebp,ecx
      bc4a40:	72 d4                	jb     bc4a16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1119b6>
      bc4a42:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      bc4a45:	48 89 df             	mov    rdi,rbx
      bc4a48:	48 89 c6             	mov    rsi,rax
      bc4a4b:	ff 91 a8 02 00 00    	call   QWORD PTR [rcx+0x2a8]
      bc4a51:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      bc4a54:	48 89 df             	mov    rdi,rbx
      bc4a57:	48 89 c6             	mov    rsi,rax
      bc4a5a:	ff 91 70 04 00 00    	call   QWORD PTR [rcx+0x470]
      bc4a60:	48 89 c1             	mov    rcx,rax
      bc4a63:	48 c1 e9 20          	shr    rcx,0x20
      bc4a67:	48 89 d6             	mov    rsi,rdx
      bc4a6a:	48 c1 ee 20          	shr    rsi,0x20
      bc4a6e:	31 c8                	xor    eax,ecx
      bc4a70:	31 d6                	xor    esi,edx
      bc4a72:	01 f0                	add    eax,esi
      bc4a74:	48 83 c4 08          	add    rsp,0x8
      bc4a78:	5b                   	pop    rbx
      bc4a79:	5d                   	pop    rbp
      bc4a7a:	c3                   	ret

### 0xbd9b6a (0xbd9b4a..0xbdc4b7) WRITE
      bd9b4b:	41 57                	push   r15
      bd9b4d:	41 56                	push   r14
      bd9b4f:	41 55                	push   r13
      bd9b51:	41 54                	push   r12
      bd9b53:	53                   	push   rbx
      bd9b54:	48 81 ec 78 04 00 00 	sub    rsp,0x478
      bd9b5b:	48 89 f3             	mov    rbx,rsi
      bd9b5e:	49 89 fe             	mov    r14,rdi
      bd9b61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bd9b68:	00 00 
      bd9b6a:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      bd9b71:	00 
      bd9b72:	48 83 c7 08          	add    rdi,0x8
      bd9b76:	48 89 bc 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rdi
      bd9b7d:	00 
      bd9b7e:	c6 84 24 88 01 00 00 	mov    BYTE PTR [rsp+0x188],0x1
      bd9b85:	01 
      bd9b86:	e8 65 45 c1 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
      bd9b8b:	49 8d 4e 3c          	lea    rcx,[r14+0x3c]
      bd9b8f:	41 80 7e 44 00       	cmp    BYTE PTR [r14+0x44],0x0
      bd9b94:	74 0e                	je     bd9ba4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x126b44>
      bd9b96:	0f b7 43 04          	movzx  eax,WORD PTR [rbx+0x4]

### 0xbdbb85 (0xbd9b4a..0xbdc4b7)
      bdbb59:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
      bdbb5d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bdbb60:	f2 0f 10 84 24 d0 00 	movsd  xmm0,QWORD PTR [rsp+0xd0]
      bdbb67:	00 00 
      bdbb69:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      bdbb6f:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      bdbb76:	00 
      bdbb77:	e8 b4 02 ed ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
      bdbb7c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbb83:	00 00 
      bdbb85:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbb8c:	00 
      bdbb8d:	0f 85 1f 09 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbb93:	48 81 c4 78 04 00 00 	add    rsp,0x478
      bdbb9a:	5b                   	pop    rbx
      bdbb9b:	41 5c                	pop    r12
      bdbb9d:	41 5d                	pop    r13
      bdbb9f:	41 5e                	pop    r14
      bdbba1:	41 5f                	pop    r15
      bdbba3:	5d                   	pop    rbp
      bdbba4:	c3                   	ret
      bdbba5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0xbdbbae (0xbd9b4a..0xbdc4b7)
      bdbb93:	48 81 c4 78 04 00 00 	add    rsp,0x478
      bdbb9a:	5b                   	pop    rbx
      bdbb9b:	41 5c                	pop    r12
      bdbb9d:	41 5d                	pop    r13
      bdbb9f:	41 5e                	pop    r14
      bdbba1:	41 5f                	pop    r15
      bdbba3:	5d                   	pop    rbp
      bdbba4:	c3                   	ret
      bdbba5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbbac:	00 00 
      bdbbae:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbbb5:	00 
      bdbbb6:	0f 85 f6 08 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbbbc:	e8 ff 89 e2 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      bdbbc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbbc8:	00 00 
      bdbbca:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbbd1:	00 
      bdbbd2:	0f 85 da 08 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbbd8:	e8 02 fb e9 ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
      bdbbdd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbbe4:	00 00 

### 0xbdbbca (0xbd9b4a..0xbdc4b7)
      bdbba3:	5d                   	pop    rbp
      bdbba4:	c3                   	ret
      bdbba5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbbac:	00 00 
      bdbbae:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbbb5:	00 
      bdbbb6:	0f 85 f6 08 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbbbc:	e8 ff 89 e2 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      bdbbc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbbc8:	00 00 
      bdbbca:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbbd1:	00 
      bdbbd2:	0f 85 da 08 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbbd8:	e8 02 fb e9 ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
      bdbbdd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbbe4:	00 00 
      bdbbe6:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbbed:	00 
      bdbbee:	0f 85 be 08 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbbf4:	e8 c7 89 e2 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      bdbbf9:	83 f8 16             	cmp    eax,0x16
      bdbbfc:	75 3a                	jne    bdbc38 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x128bd8>

### 0xbdbbe6 (0xbd9b4a..0xbdc4b7)
      bdbbb6:	0f 85 f6 08 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbbbc:	e8 ff 89 e2 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      bdbbc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbbc8:	00 00 
      bdbbca:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbbd1:	00 
      bdbbd2:	0f 85 da 08 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbbd8:	e8 02 fb e9 ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
      bdbbdd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbbe4:	00 00 
      bdbbe6:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbbed:	00 
      bdbbee:	0f 85 be 08 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbbf4:	e8 c7 89 e2 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      bdbbf9:	83 f8 16             	cmp    eax,0x16
      bdbbfc:	75 3a                	jne    bdbc38 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x128bd8>
      bdbbfe:	6a 08                	push   0x8
      bdbc00:	5f                   	pop    rdi
      bdbc01:	e8 aa 22 c1 00       	call   17edeb0 <__cxa_allocate_exception@plt>
      bdbc06:	48 8d 0d a3 b7 74 ff 	lea    rcx,[rip+0xffffffffff74b7a3]        # 3273b0 <_ZTSSt12bad_any_cast@@Base-0x68e18>
      bdbc0d:	48 89 08             	mov    QWORD PTR [rax],rcx
      bdbc10:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28

### 0xbdbc19 (0xbd9b4a..0xbdc4b7)
      bdbbf4:	e8 c7 89 e2 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      bdbbf9:	83 f8 16             	cmp    eax,0x16
      bdbbfc:	75 3a                	jne    bdbc38 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x128bd8>
      bdbbfe:	6a 08                	push   0x8
      bdbc00:	5f                   	pop    rdi
      bdbc01:	e8 aa 22 c1 00       	call   17edeb0 <__cxa_allocate_exception@plt>
      bdbc06:	48 8d 0d a3 b7 74 ff 	lea    rcx,[rip+0xffffffffff74b7a3]        # 3273b0 <_ZTSSt12bad_any_cast@@Base-0x68e18>
      bdbc0d:	48 89 08             	mov    QWORD PTR [rax],rcx
      bdbc10:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      bdbc17:	00 00 
      bdbc19:	48 3b 8c 24 70 04 00 	cmp    rcx,QWORD PTR [rsp+0x470]
      bdbc20:	00 
      bdbc21:	0f 85 8b 08 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbc27:	48 8b 35 72 60 cd 00 	mov    rsi,QWORD PTR [rip+0xcd6072]        # 18b1ca0 <_ZTIPKc@@Base+0xb8238>
      bdbc2e:	48 89 c7             	mov    rdi,rax
      bdbc31:	31 d2                	xor    edx,edx
      bdbc33:	e8 a8 22 c1 00       	call   17edee0 <__cxa_throw@plt>
      bdbc38:	6a 08                	push   0x8
      bdbc3a:	5f                   	pop    rdi
      bdbc3b:	e8 70 22 c1 00       	call   17edeb0 <__cxa_allocate_exception@plt>
      bdbc40:	48 89 c3             	mov    rbx,rax
      bdbc43:	48 89 c7             	mov    rdi,rax

### 0xbdbc54 (0xbd9b4a..0xbdc4b7)
      bdbc31:	31 d2                	xor    edx,edx
      bdbc33:	e8 a8 22 c1 00       	call   17edee0 <__cxa_throw@plt>
      bdbc38:	6a 08                	push   0x8
      bdbc3a:	5f                   	pop    rdi
      bdbc3b:	e8 70 22 c1 00       	call   17edeb0 <__cxa_allocate_exception@plt>
      bdbc40:	48 89 c3             	mov    rbx,rax
      bdbc43:	48 89 c7             	mov    rdi,rax
      bdbc46:	e8 f5 2f c1 00       	call   17eec40 <_ZNSt9bad_allocC1Ev@plt>
      bdbc4b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbc52:	00 00 
      bdbc54:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbc5b:	00 
      bdbc5c:	0f 85 50 08 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbc62:	48 8b 35 3f 60 cd 00 	mov    rsi,QWORD PTR [rip+0xcd603f]        # 18b1ca8 <_ZTISt9bad_alloc@@Base+0xb87e8>
      bdbc69:	48 8b 15 28 60 cd 00 	mov    rdx,QWORD PTR [rip+0xcd6028]        # 18b1c98 <_ZNSt9bad_allocD1Ev@@Base+0xed9eb8>
      bdbc70:	48 89 df             	mov    rdi,rbx
      bdbc73:	e8 68 22 c1 00       	call   17edee0 <__cxa_throw@plt>
      bdbc78:	83 f8 16             	cmp    eax,0x16
      bdbc7b:	75 3a                	jne    bdbcb7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x128c57>
      bdbc7d:	6a 08                	push   0x8
      bdbc7f:	5f                   	pop    rdi
      bdbc80:	e8 2b 22 c1 00       	call   17edeb0 <__cxa_allocate_exception@plt>

### 0xbdbc98 (0xbd9b4a..0xbdc4b7)
      bdbc73:	e8 68 22 c1 00       	call   17edee0 <__cxa_throw@plt>
      bdbc78:	83 f8 16             	cmp    eax,0x16
      bdbc7b:	75 3a                	jne    bdbcb7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x128c57>
      bdbc7d:	6a 08                	push   0x8
      bdbc7f:	5f                   	pop    rdi
      bdbc80:	e8 2b 22 c1 00       	call   17edeb0 <__cxa_allocate_exception@plt>
      bdbc85:	48 8d 0d 24 b7 74 ff 	lea    rcx,[rip+0xffffffffff74b724]        # 3273b0 <_ZTSSt12bad_any_cast@@Base-0x68e18>
      bdbc8c:	48 89 08             	mov    QWORD PTR [rax],rcx
      bdbc8f:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      bdbc96:	00 00 
      bdbc98:	48 3b 8c 24 70 04 00 	cmp    rcx,QWORD PTR [rsp+0x470]
      bdbc9f:	00 
      bdbca0:	0f 85 0c 08 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbca6:	48 8b 35 f3 5f cd 00 	mov    rsi,QWORD PTR [rip+0xcd5ff3]        # 18b1ca0 <_ZTIPKc@@Base+0xb8238>
      bdbcad:	48 89 c7             	mov    rdi,rax
      bdbcb0:	31 d2                	xor    edx,edx
      bdbcb2:	e8 29 22 c1 00       	call   17edee0 <__cxa_throw@plt>
      bdbcb7:	6a 08                	push   0x8
      bdbcb9:	5f                   	pop    rdi
      bdbcba:	e8 f1 21 c1 00       	call   17edeb0 <__cxa_allocate_exception@plt>
      bdbcbf:	48 89 c3             	mov    rbx,rax
      bdbcc2:	48 89 c7             	mov    rdi,rax

### 0xbdbcd3 (0xbd9b4a..0xbdc4b7)
      bdbcb0:	31 d2                	xor    edx,edx
      bdbcb2:	e8 29 22 c1 00       	call   17edee0 <__cxa_throw@plt>
      bdbcb7:	6a 08                	push   0x8
      bdbcb9:	5f                   	pop    rdi
      bdbcba:	e8 f1 21 c1 00       	call   17edeb0 <__cxa_allocate_exception@plt>
      bdbcbf:	48 89 c3             	mov    rbx,rax
      bdbcc2:	48 89 c7             	mov    rdi,rax
      bdbcc5:	e8 76 2f c1 00       	call   17eec40 <_ZNSt9bad_allocC1Ev@plt>
      bdbcca:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbcd1:	00 00 
      bdbcd3:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbcda:	00 
      bdbcdb:	0f 85 d1 07 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbce1:	48 8b 35 c0 5f cd 00 	mov    rsi,QWORD PTR [rip+0xcd5fc0]        # 18b1ca8 <_ZTISt9bad_alloc@@Base+0xb87e8>
      bdbce8:	48 8b 15 a9 5f cd 00 	mov    rdx,QWORD PTR [rip+0xcd5fa9]        # 18b1c98 <_ZNSt9bad_allocD1Ev@@Base+0xed9eb8>
      bdbcef:	48 89 df             	mov    rdi,rbx
      bdbcf2:	e8 e9 21 c1 00       	call   17edee0 <__cxa_throw@plt>
      bdbcf7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbcfe:	00 00 
      bdbd00:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbd07:	00 
      bdbd08:	0f 85 a4 07 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>

### 0xbdbd00 (0xbd9b4a..0xbdc4b7)
      bdbcd1:	00 00 
      bdbcd3:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbcda:	00 
      bdbcdb:	0f 85 d1 07 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbce1:	48 8b 35 c0 5f cd 00 	mov    rsi,QWORD PTR [rip+0xcd5fc0]        # 18b1ca8 <_ZTISt9bad_alloc@@Base+0xb87e8>
      bdbce8:	48 8b 15 a9 5f cd 00 	mov    rdx,QWORD PTR [rip+0xcd5fa9]        # 18b1c98 <_ZNSt9bad_allocD1Ev@@Base+0xed9eb8>
      bdbcef:	48 89 df             	mov    rdi,rbx
      bdbcf2:	e8 e9 21 c1 00       	call   17edee0 <__cxa_throw@plt>
      bdbcf7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdbcfe:	00 00 
      bdbd00:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdbd07:	00 
      bdbd08:	0f 85 a4 07 00 00    	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdbd0e:	e8 ad 88 e2 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      bdbd13:	49 89 c4             	mov    r12,rax
      bdbd16:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
      bdbd1d:	00 
      bdbd1e:	e8 a9 45 00 00       	call   be02cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d26c>
      bdbd23:	eb 03                	jmp    bdbd28 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x128cc8>
      bdbd25:	49 89 c4             	mov    r12,rax
      bdbd28:	48 89 df             	mov    rdi,rbx
      bdbd2b:	e8 f0 21 c1 00       	call   17edf20 <_ZdlPv@plt>

### 0xbdc4a0 (0xbd9b4a..0xbdc4b7)
      bdc475:	48 89 df             	mov    rdi,rbx
      bdc478:	e8 09 20 ec ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      bdc47d:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
      bdc484:	00 
      bdc485:	e8 96 1a c1 00       	call   17edf20 <_ZdlPv@plt>
      bdc48a:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      bdc491:	00 
      bdc492:	e8 99 f9 ec ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
      bdc497:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bdc49e:	00 00 
      bdc4a0:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      bdc4a7:	00 
      bdc4a8:	75 08                	jne    bdc4b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x129452>
      bdc4aa:	4c 89 e7             	mov    rdi,r12
      bdc4ad:	e8 1e 38 e9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      bdc4b2:	e8 f9 35 c1 00       	call   17efab0 <__stack_chk_fail@plt>
      bdc4b7:	cc                   	int3
      bdc4b8:	48 8b 47 3c          	mov    rax,QWORD PTR [rdi+0x3c]
      bdc4bc:	8a 57 44             	mov    dl,BYTE PTR [rdi+0x44]
      bdc4bf:	c3                   	ret
      bdc4c0:	55                   	push   rbp
      bdc4c1:	41 57                	push   r15

### 0xc0d64d (0xc0d5c2..0xc0deb3)
      c0d623:	0f 84 6f 07 00 00    	je     c0dd98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15ad38>
      c0d629:	4d 85 f6             	test   r14,r14
      c0d62c:	74 05                	je     c0d633 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15a5d3>
      c0d62e:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      c0d633:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      c0d638:	48 83 a4 24 68 04 00 	and    QWORD PTR [rsp+0x468],0x0
      c0d63f:	00 00 
      c0d641:	48 89 84 24 60 04 00 	mov    QWORD PTR [rsp+0x460],rax
      c0d648:	00 
      c0d649:	66 0f ef c0          	pxor   xmm0,xmm0
      c0d64d:	f3 0f 7f 84 24 70 04 	movdqu XMMWORD PTR [rsp+0x470],xmm0
      c0d654:	00 00 
      c0d656:	f3 0f 7f 84 24 7c 04 	movdqu XMMWORD PTR [rsp+0x47c],xmm0
      c0d65d:	00 00 
      c0d65f:	49 8d 87 00 01 00 00 	lea    rax,[r15+0x100]
      c0d666:	49 8b 8f 00 01 00 00 	mov    rcx,QWORD PTR [r15+0x100]
      c0d66d:	48 89 ca             	mov    rdx,rcx
      c0d670:	48 83 c2 07          	add    rdx,0x7
      c0d674:	f6 c1 01             	test   cl,0x1
      c0d677:	48 0f 44 d0          	cmove  rdx,rax
      c0d67b:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      c0d680:	49 63 87 08 01 00 00 	movsxd rax,DWORD PTR [r15+0x108]

### 0xc0d92a (0xc0d5c2..0xc0deb3)
      c0d8f7:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
      c0d8fb:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      c0d900:	f2 0f 5a 84 24 a0 03 	cvtsd2ss xmm0,QWORD PTR [rsp+0x3a0]
      c0d907:	00 00 
      c0d909:	f3 0f 11 44 24 2c    	movss  DWORD PTR [rsp+0x2c],xmm0
      c0d90f:	f2 0f 5a 84 24 e8 01 	cvtsd2ss xmm0,QWORD PTR [rsp+0x1e8]
      c0d916:	00 00 
      c0d918:	f3 0f 11 44 24 28    	movss  DWORD PTR [rsp+0x28],xmm0
      c0d91e:	66 41 0f 10 45 28    	movupd xmm0,XMMWORD PTR [r13+0x28]
      c0d924:	66 0f 29 44 24 30    	movapd XMMWORD PTR [rsp+0x30],xmm0
      c0d92a:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      c0d931:	00 
      c0d932:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
      c0d939:	00 
      c0d93a:	48 8d 15 ca 0d 00 00 	lea    rdx,[rip+0xdca]        # c0e70b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15b6ab>
      c0d941:	e8 90 b5 ec ff       	call   ad8ed6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e76>
      c0d946:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      c0d94b:	4c 8b bc 24 80 00 00 	mov    r15,QWORD PTR [rsp+0x80]
      c0d952:	00 
      c0d953:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
      c0d95a:	00 
      c0d95b:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax

### 0xc1959d (0xc18d4e..0xc19c28)
      c19571:	49 89 c6             	mov    r14,rax
      c19574:	48 8b 4d 50          	mov    rcx,QWORD PTR [rbp+0x50]
      c19578:	48 8b 95 90 00 00 00 	mov    rdx,QWORD PTR [rbp+0x90]
      c1957f:	48 85 d2             	test   rdx,rdx
      c19582:	48 8d 05 8f cc cb 00 	lea    rax,[rip+0xcbcc8f]        # 18d6218 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1d628>
      c19589:	48 0f 44 d0          	cmove  rdx,rax
      c1958d:	4c 89 f7             	mov    rdi,r14
      c19590:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
      c19597:	00 
      c19598:	e8 89 18 00 00       	call   c1ae26 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x167dc6>
      c1959d:	48 8b 84 24 70 04 00 	mov    rax,QWORD PTR [rsp+0x470]
      c195a4:	00 
      c195a5:	48 89 c1             	mov    rcx,rax
      c195a8:	48 83 c1 07          	add    rcx,0x7
      c195ac:	a8 01                	test   al,0x1
      c195ae:	48 8d 84 24 70 04 00 	lea    rax,[rsp+0x470]
      c195b5:	00 
      c195b6:	48 0f 44 c8          	cmove  rcx,rax
      c195ba:	48 63 84 24 78 04 00 	movsxd rax,DWORD PTR [rsp+0x478]
      c195c1:	00 
      c195c2:	48 85 c0             	test   rax,rax
      c195c5:	0f 84 58 01 00 00    	je     c19723 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1666c3>

### 0xc195ae (0xc18d4e..0xc19c28)
      c19589:	48 0f 44 d0          	cmove  rdx,rax
      c1958d:	4c 89 f7             	mov    rdi,r14
      c19590:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
      c19597:	00 
      c19598:	e8 89 18 00 00       	call   c1ae26 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x167dc6>
      c1959d:	48 8b 84 24 70 04 00 	mov    rax,QWORD PTR [rsp+0x470]
      c195a4:	00 
      c195a5:	48 89 c1             	mov    rcx,rax
      c195a8:	48 83 c1 07          	add    rcx,0x7
      c195ac:	a8 01                	test   al,0x1
      c195ae:	48 8d 84 24 70 04 00 	lea    rax,[rsp+0x470]
      c195b5:	00 
      c195b6:	48 0f 44 c8          	cmove  rcx,rax
      c195ba:	48 63 84 24 78 04 00 	movsxd rax,DWORD PTR [rsp+0x478]
      c195c1:	00 
      c195c2:	48 85 c0             	test   rax,rax
      c195c5:	0f 84 58 01 00 00    	je     c19723 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1666c3>
      c195cb:	49 83 c6 18          	add    r14,0x18
      c195cf:	48 8d 04 c1          	lea    rax,[rcx+rax*8]
      c195d3:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      c195d8:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
      c195dd:	48 8b 01             	mov    rax,QWORD PTR [rcx]

### 0xc54c10 (0xc5391a..0xc571cb)
      c54beb:	eb 16                	jmp    c54c03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a1ba3>
      c54bed:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
      c54bf4:	00 
      c54bf5:	48 89 b4 24 60 04 00 	mov    QWORD PTR [rsp+0x460],rsi
      c54bfc:	00 
      c54bfd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c54c00:	ff 50 18             	call   QWORD PTR [rax+0x18]
      c54c03:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
      c54c0a:	00 
      c54c0b:	e8 76 98 e4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c54c10:	4c 8d bc 24 70 04 00 	lea    r15,[rsp+0x470]
      c54c17:	00 
      c54c18:	48 8d 05 01 4d bc 00 	lea    rax,[rip+0xbc4d01]        # 1819920 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf5e0>
      c54c1f:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      c54c26:	00 
      c54c27:	4c 89 b4 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r14
      c54c2e:	00 
      c54c2f:	49 8b 4f 20          	mov    rcx,QWORD PTR [r15+0x20]
      c54c33:	4c 39 f9             	cmp    rcx,r15
      c54c36:	74 1a                	je     c54c52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a1bf2>
      c54c38:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      c54c3f:	00 

### 0xc54c38 (0xc5391a..0xc571cb) WRITE
      c54c10:	4c 8d bc 24 70 04 00 	lea    r15,[rsp+0x470]
      c54c17:	00 
      c54c18:	48 8d 05 01 4d bc 00 	lea    rax,[rip+0xbc4d01]        # 1819920 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf5e0>
      c54c1f:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      c54c26:	00 
      c54c27:	4c 89 b4 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r14
      c54c2e:	00 
      c54c2f:	49 8b 4f 20          	mov    rcx,QWORD PTR [r15+0x20]
      c54c33:	4c 39 f9             	cmp    rcx,r15
      c54c36:	74 1a                	je     c54c52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a1bf2>
      c54c38:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      c54c3f:	00 
      c54c40:	4c 89 b4 24 78 04 00 	mov    QWORD PTR [rsp+0x478],r14
      c54c47:	00 
      c54c48:	48 89 8c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rcx
      c54c4f:	00 
      c54c50:	eb 6c                	jmp    c54cbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a1c5e>
      c54c52:	48 89 84 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rax
      c54c59:	00 
      c54c5a:	4c 89 b4 24 08 03 00 	mov    QWORD PTR [rsp+0x308],r14
      c54c61:	00 
      c54c62:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]

### 0xc54c6f (0xc5391a..0xc571cb)
      c54c48:	48 89 8c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rcx
      c54c4f:	00 
      c54c50:	eb 6c                	jmp    c54cbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a1c5e>
      c54c52:	48 89 84 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rax
      c54c59:	00 
      c54c5a:	4c 89 b4 24 08 03 00 	mov    QWORD PTR [rsp+0x308],r14
      c54c61:	00 
      c54c62:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
      c54c69:	00 
      c54c6a:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
      c54c6f:	48 8b 84 24 70 04 00 	mov    rax,QWORD PTR [rsp+0x470]
      c54c76:	00 
      c54c77:	4c 89 ff             	mov    rdi,r15
      c54c7a:	48 89 de             	mov    rsi,rbx
      c54c7d:	ff 50 18             	call   QWORD PTR [rax+0x18]
      c54c80:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
      c54c87:	00 
      c54c88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c54c8b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      c54c8e:	48 83 a4 24 90 04 00 	and    QWORD PTR [rsp+0x490],0x0
      c54c95:	00 00 
      c54c97:	48 89 9c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rbx

### 0xc5628f (0xc5391a..0xc571cb)
      c56263:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
      c56268:	4c 89 fe             	mov    rsi,r15
      c5626b:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
      c56270:	e8 1b 40 e2 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      c56275:	48 8b 84 24 38 04 00 	mov    rax,QWORD PTR [rsp+0x438]
      c5627c:	00 
      c5627d:	0f 28 84 24 30 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x430]
      c56284:	00 
      c56285:	0f 29 83 f0 00 00 00 	movaps XMMWORD PTR [rbx+0xf0],xmm0
      c5628c:	48 85 c0             	test   rax,rax
      c5628f:	4c 8d b4 24 70 04 00 	lea    r14,[rsp+0x470]
      c56296:	00 
      c56297:	74 05                	je     c5629e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a323e>
      c56299:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      c5629e:	4c 8d bb 00 01 00 00 	lea    r15,[rbx+0x100]
      c562a5:	4c 89 ff             	mov    rdi,r15
      c562a8:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
      c562af:	00 
      c562b0:	e8 db 3f e2 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      c562b5:	48 8d b3 30 01 00 00 	lea    rsi,[rbx+0x130]
      c562bc:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
      c562c3:	00 

### 0xc562f2 (0xc5391a..0xc571cb)
      c562d1:	74 0d                	je     c562e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a3280>
      c562d3:	4c 39 f7             	cmp    rdi,r14
      c562d6:	74 13                	je     c562eb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a328b>
      c562d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c562db:	ff 50 10             	call   QWORD PTR [rax+0x10]
      c562de:	eb 02                	jmp    c562e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a3282>
      c562e0:	31 c0                	xor    eax,eax
      c562e2:	48 89 83 50 01 00 00 	mov    QWORD PTR [rbx+0x150],rax
      c562e9:	eb 15                	jmp    c56300 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a32a0>
      c562eb:	48 89 b3 50 01 00 00 	mov    QWORD PTR [rbx+0x150],rsi
      c562f2:	48 8b 84 24 70 04 00 	mov    rax,QWORD PTR [rsp+0x470]
      c562f9:	00 
      c562fa:	4c 89 f7             	mov    rdi,r14
      c562fd:	ff 50 18             	call   QWORD PTR [rax+0x18]
      c56300:	48 8b 84 24 00 05 00 	mov    rax,QWORD PTR [rsp+0x500]
      c56307:	00 
      c56308:	48 89 83 60 01 00 00 	mov    QWORD PTR [rbx+0x160],rax
      c5630f:	0f 57 c0             	xorps  xmm0,xmm0
      c56312:	0f 11 83 68 01 00 00 	movups XMMWORD PTR [rbx+0x168],xmm0
      c56319:	48 83 a3 88 01 00 00 	and    QWORD PTR [rbx+0x188],0x0
      c56320:	00 
      c56321:	0f 11 83 78 01 00 00 	movups XMMWORD PTR [rbx+0x178],xmm0

### 0xc6d111 (0xc6c08a..0xc6e081) WRITE
      c6d0e7:	e8 d2 48 00 00       	call   c719be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be95e>
      c6d0ec:	41 89 c6             	mov    r14d,eax
      c6d0ef:	49 8b bd 40 03 00 00 	mov    rdi,QWORD PTR [r13+0x340]
      c6d0f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c6d0f9:	ff 50 20             	call   QWORD PTR [rax+0x20]
      c6d0fc:	be 00 02 00 00       	mov    esi,0x200
      c6d101:	89 c7                	mov    edi,eax
      c6d103:	31 d2                	xor    edx,edx
      c6d105:	e8 07 83 b5 00       	call   17c5411 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17957d>
      c6d10a:	89 84 24 68 04 00 00 	mov    DWORD PTR [rsp+0x468],eax
      c6d111:	48 89 94 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rdx
      c6d118:	00 
      c6d119:	85 c0                	test   eax,eax
      c6d11b:	0f 84 83 04 00 00    	je     c6d5a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ba544>
      c6d121:	49 8b 85 38 03 00 00 	mov    rax,QWORD PTR [r13+0x338]
      c6d128:	48 8d b4 24 50 04 00 	lea    rsi,[rsp+0x450]
      c6d12f:	00 
      c6d130:	c7 06 2a 00 00 00    	mov    DWORD PTR [rsi],0x2a
      c6d136:	48 8d 0d 9b 14 c7 00 	lea    rcx,[rip+0xc7149b]        # 18de5d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x259e8>
      c6d13d:	48 89 4e 08          	mov    QWORD PTR [rsi+0x8],rcx
      c6d141:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c6d144:	48 8d 94 24 68 04 00 	lea    rdx,[rsp+0x468]

### 0xc6d77f (0xc6c08a..0xc6e081) WRITE
      c6d752:	00 
      c6d753:	48 8d 94 24 58 02 00 	lea    rdx,[rsp+0x258]
      c6d75a:	00 
      c6d75b:	48 8d 8c 24 a0 04 00 	lea    rcx,[rsp+0x4a0]
      c6d762:	00 
      c6d763:	e8 68 42 00 00       	call   c719d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be970>
      c6d768:	e9 c2 00 00 00       	jmp    c6d82f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ba7cf>
      c6d76d:	c7 84 24 68 04 00 00 	mov    DWORD PTR [rsp+0x468],0xb
      c6d774:	0b 00 00 00 
      c6d778:	48 8d 05 59 0e c7 00 	lea    rax,[rip+0xc70e59]        # 18de5d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x259e8>
      c6d77f:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      c6d786:	00 
      c6d787:	83 a4 24 50 04 00 00 	and    DWORD PTR [rsp+0x450],0x0
      c6d78e:	00 
      c6d78f:	e8 1c 08 b8 00       	call   17edfb0 <_ZNSt6__ndk115system_categoryEv@plt>
      c6d794:	48 89 84 24 58 04 00 	mov    QWORD PTR [rsp+0x458],rax
      c6d79b:	00 
      c6d79c:	49 8b 85 38 03 00 00 	mov    rax,QWORD PTR [r13+0x338]
      c6d7a3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c6d7a6:	48 8d b4 24 68 04 00 	lea    rsi,[rsp+0x468]
      c6d7ad:	00 
      c6d7ae:	48 8d 94 24 50 04 00 	lea    rdx,[rsp+0x450]

### 0xc6d7e1 (0xc6c08a..0xc6e081) WRITE
      c6d7b5:	00 
      c6d7b6:	48 8d 8c 24 a0 04 00 	lea    rcx,[rsp+0x4a0]
      c6d7bd:	00 
      c6d7be:	e8 0d 42 00 00       	call   c719d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be970>
      c6d7c3:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
      c6d7c8:	44 8b 74 24 30       	mov    r14d,DWORD PTR [rsp+0x30]
      c6d7cd:	eb 60                	jmp    c6d82f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ba7cf>
      c6d7cf:	c7 84 24 68 04 00 00 	mov    DWORD PTR [rsp+0x468],0xc
      c6d7d6:	0c 00 00 00 
      c6d7da:	48 8d 05 f7 0d c7 00 	lea    rax,[rip+0xc70df7]        # 18de5d8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x259e8>
      c6d7e1:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      c6d7e8:	00 
      c6d7e9:	83 a4 24 50 04 00 00 	and    DWORD PTR [rsp+0x450],0x0
      c6d7f0:	00 
      c6d7f1:	e8 ba 07 b8 00       	call   17edfb0 <_ZNSt6__ndk115system_categoryEv@plt>
      c6d7f6:	48 89 84 24 58 04 00 	mov    QWORD PTR [rsp+0x458],rax
      c6d7fd:	00 
      c6d7fe:	49 8b 85 38 03 00 00 	mov    rax,QWORD PTR [r13+0x338]
      c6d805:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c6d808:	48 8d b4 24 68 04 00 	lea    rsi,[rsp+0x468]
      c6d80f:	00 
      c6d810:	48 8d 94 24 50 04 00 	lea    rdx,[rsp+0x450]

### 0xcb7e2c (0xcb7a20..0xcbc937)
      cb7dff:	48 8d 84 24 10 04 00 	lea    rax,[rsp+0x410]
      cb7e06:	00 
      cb7e07:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      cb7e0b:	48 8d 84 24 40 04 00 	lea    rax,[rsp+0x440]
      cb7e12:	00 
      cb7e13:	48 8d 0d c6 6a b5 00 	lea    rcx,[rip+0xb56ac6]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      cb7e1a:	48 89 08             	mov    QWORD PTR [rax],rcx
      cb7e1d:	48 8b 0d 7c 9c bf 00 	mov    rcx,QWORD PTR [rip+0xbf9c7c]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      cb7e24:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      cb7e28:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      cb7e2c:	48 8d 84 24 70 04 00 	lea    rax,[rsp+0x470]
      cb7e33:	00 
      cb7e34:	48 8d 0d a5 6a b5 00 	lea    rcx,[rip+0xb56aa5]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      cb7e3b:	48 89 08             	mov    QWORD PTR [rax],rcx
      cb7e3e:	48 8b 0d 63 9c bf 00 	mov    rcx,QWORD PTR [rip+0xbf9c63]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
      cb7e45:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      cb7e49:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      cb7e4d:	48 8d 84 24 a0 04 00 	lea    rax,[rsp+0x4a0]
      cb7e54:	00 
      cb7e55:	48 8d 0d 84 6a b5 00 	lea    rcx,[rip+0xb56a84]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      cb7e5c:	48 89 08             	mov    QWORD PTR [rax],rcx
      cb7e5f:	48 8d 0d e0 2d b2 00 	lea    rcx,[rip+0xb22de0]        # 17dac46 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a67>

### 0xcba8e9 (0xcb7a20..0xcbc937) WRITE
      cba8b1:	48 8b bc 24 f0 01 00 	mov    rdi,QWORD PTR [rsp+0x1f0]
      cba8b8:	00 
      cba8b9:	49 89 bf 58 04 00 00 	mov    QWORD PTR [r15+0x458],rdi
      cba8c0:	48 8b bc 24 a0 0a 00 	mov    rdi,QWORD PTR [rsp+0xaa0]
      cba8c7:	00 
      cba8c8:	49 89 bf 60 04 00 00 	mov    QWORD PTR [r15+0x460],rdi
      cba8cf:	45 89 87 68 04 00 00 	mov    DWORD PTR [r15+0x468],r8d
      cba8d6:	8b bc 24 7c 01 00 00 	mov    edi,DWORD PTR [rsp+0x17c]
      cba8dd:	41 89 bf 6c 04 00 00 	mov    DWORD PTR [r15+0x46c],edi
      cba8e4:	40 8a 7c 24 1f       	mov    dil,BYTE PTR [rsp+0x1f]
      cba8e9:	41 88 bf 70 04 00 00 	mov    BYTE PTR [r15+0x470],dil
      cba8f0:	40 8a 7c 24 1e       	mov    dil,BYTE PTR [rsp+0x1e]
      cba8f5:	41 88 bf 71 04 00 00 	mov    BYTE PTR [r15+0x471],dil
      cba8fc:	40 8a 7c 24 1d       	mov    dil,BYTE PTR [rsp+0x1d]
      cba901:	41 88 bf 72 04 00 00 	mov    BYTE PTR [r15+0x472],dil
      cba908:	8b bc 24 38 02 00 00 	mov    edi,DWORD PTR [rsp+0x238]
      cba90f:	41 89 bf 73 04 00 00 	mov    DWORD PTR [r15+0x473],edi
      cba916:	40 8a bc 24 3c 02 00 	mov    dil,BYTE PTR [rsp+0x23c]
      cba91d:	00 
      cba91e:	41 88 bf 77 04 00 00 	mov    BYTE PTR [r15+0x477],dil
      cba925:	8b bc 24 78 01 00 00 	mov    edi,DWORD PTR [rsp+0x178]
      cba92c:	41 89 bf 78 04 00 00 	mov    DWORD PTR [r15+0x478],edi

### 0xccd23a (0xcccca6..0xccef9d)
      ccd212:	0f 28 84 24 d0 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x2d0]
      ccd219:	00 
      ccd21a:	0f 28 8c 24 e0 02 00 	movaps xmm1,XMMWORD PTR [rsp+0x2e0]
      ccd221:	00 
      ccd222:	0f 28 94 24 f0 02 00 	movaps xmm2,XMMWORD PTR [rsp+0x2f0]
      ccd229:	00 
      ccd22a:	0f 28 9c 24 00 03 00 	movaps xmm3,XMMWORD PTR [rsp+0x300]
      ccd231:	00 
      ccd232:	0f 29 84 24 60 04 00 	movaps XMMWORD PTR [rsp+0x460],xmm0
      ccd239:	00 
      ccd23a:	0f 29 8c 24 70 04 00 	movaps XMMWORD PTR [rsp+0x470],xmm1
      ccd241:	00 
      ccd242:	0f 29 94 24 80 04 00 	movaps XMMWORD PTR [rsp+0x480],xmm2
      ccd249:	00 
      ccd24a:	0f 29 9c 24 90 04 00 	movaps XMMWORD PTR [rsp+0x490],xmm3
      ccd251:	00 
      ccd252:	6a 09                	push   0x9
      ccd254:	59                   	pop    rcx
      ccd255:	48 8d bc 24 18 04 00 	lea    rdi,[rsp+0x418]
      ccd25c:	00 
      ccd25d:	48 8d b4 24 18 03 00 	lea    rsi,[rsp+0x318]
      ccd264:	00 

### 0xccde63 (0xcccca6..0xccef9d)
      ccde36:	49 83 a6 10 24 00 00 	and    QWORD PTR [r14+0x2410],0x0
      ccde3d:	00 
      ccde3e:	49 8d be 18 24 00 00 	lea    rdi,[r14+0x2418]
      ccde45:	e8 e5 12 e7 ff       	call   b3f12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c0cf>
      ccde4a:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
      ccde51:	00 
      ccde52:	41 c6 86 28 24 00 00 	mov    BYTE PTR [r14+0x2428],0x0
      ccde59:	00 
      ccde5a:	66 0f 6f 84 24 60 04 	movdqa xmm0,XMMWORD PTR [rsp+0x460]
      ccde61:	00 00 
      ccde63:	66 0f 6f 8c 24 70 04 	movdqa xmm1,XMMWORD PTR [rsp+0x470]
      ccde6a:	00 00 
      ccde6c:	0f 28 94 24 80 04 00 	movaps xmm2,XMMWORD PTR [rsp+0x480]
      ccde73:	00 
      ccde74:	0f 28 9c 24 90 04 00 	movaps xmm3,XMMWORD PTR [rsp+0x490]
      ccde7b:	00 
      ccde7c:	f3 41 0f 7f 86 30 24 	movdqu XMMWORD PTR [r14+0x2430],xmm0
      ccde83:	00 00 
      ccde85:	f3 41 0f 7f 8e 40 24 	movdqu XMMWORD PTR [r14+0x2440],xmm1
      ccde8c:	00 00 
      ccde8e:	41 0f 11 96 50 24 00 	movups XMMWORD PTR [r14+0x2450],xmm2
      ccde95:	00 

### 0xcd77f2 (0xcd7752..0xcd9380) WRITE
      cd77ac:	88 84 24 a8 03 00 00 	mov    BYTE PTR [rsp+0x3a8],al
      cd77b3:	88 84 24 b0 03 00 00 	mov    BYTE PTR [rsp+0x3b0],al
      cd77ba:	88 84 24 d0 03 00 00 	mov    BYTE PTR [rsp+0x3d0],al
      cd77c1:	88 84 24 d8 03 00 00 	mov    BYTE PTR [rsp+0x3d8],al
      cd77c8:	88 84 24 f8 03 00 00 	mov    BYTE PTR [rsp+0x3f8],al
      cd77cf:	88 84 24 00 04 00 00 	mov    BYTE PTR [rsp+0x400],al
      cd77d6:	88 84 24 20 04 00 00 	mov    BYTE PTR [rsp+0x420],al
      cd77dd:	88 84 24 28 04 00 00 	mov    BYTE PTR [rsp+0x428],al
      cd77e4:	88 84 24 48 04 00 00 	mov    BYTE PTR [rsp+0x448],al
      cd77eb:	88 84 24 50 04 00 00 	mov    BYTE PTR [rsp+0x450],al
      cd77f2:	88 84 24 70 04 00 00 	mov    BYTE PTR [rsp+0x470],al
      cd77f9:	88 84 24 78 04 00 00 	mov    BYTE PTR [rsp+0x478],al
      cd7800:	88 84 24 98 04 00 00 	mov    BYTE PTR [rsp+0x498],al
      cd7807:	88 84 24 a0 04 00 00 	mov    BYTE PTR [rsp+0x4a0],al
      cd780e:	88 84 24 c0 04 00 00 	mov    BYTE PTR [rsp+0x4c0],al
      cd7815:	88 84 24 c8 04 00 00 	mov    BYTE PTR [rsp+0x4c8],al
      cd781c:	88 84 24 e8 04 00 00 	mov    BYTE PTR [rsp+0x4e8],al
      cd7823:	88 84 24 f0 04 00 00 	mov    BYTE PTR [rsp+0x4f0],al
      cd782a:	88 84 24 10 05 00 00 	mov    BYTE PTR [rsp+0x510],al
      cd7831:	88 84 24 18 05 00 00 	mov    BYTE PTR [rsp+0x518],al
      cd7838:	88 84 24 38 05 00 00 	mov    BYTE PTR [rsp+0x538],al
      cd783f:	88 84 24 40 05 00 00 	mov    BYTE PTR [rsp+0x540],al

### 0xce9723 (0xce8ef6..0xcea164)
      ce96f8:	4c 89 f7             	mov    rdi,r14
      ce96fb:	48 89 c6             	mov    rsi,rax
      ce96fe:	e8 37 8c e1 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
      ce9703:	48 8d bc 24 e8 05 00 	lea    rdi,[rsp+0x5e8]
      ce970a:	00 
      ce970b:	c6 47 da 00          	mov    BYTE PTR [rdi-0x26],0x0
      ce970f:	48 8d b3 b8 03 00 00 	lea    rsi,[rbx+0x3b8]
      ce9716:	e8 65 49 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      ce971b:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      ce9722:	00 
      ce9723:	8b 84 24 70 04 00 00 	mov    eax,DWORD PTR [rsp+0x470]
      ce972a:	89 87 98 00 00 00    	mov    DWORD PTR [rdi+0x98],eax
      ce9730:	48 8d b4 24 f8 03 00 	lea    rsi,[rsp+0x3f8]
      ce9737:	00 
      ce9738:	e8 23 ea e5 ff       	call   b48160 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95100>
      ce973d:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
      ce9744:	00 
      ce9745:	48 8d ac 24 10 04 00 	lea    rbp,[rsp+0x410]
      ce974c:	00 
      ce974d:	48 89 ee             	mov    rsi,rbp
      ce9750:	e8 2b 49 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      ce9755:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]

### 0xce99e1 (0xce8ef6..0xcea164)
      ce99b3:	00 
      ce99b4:	e8 c7 46 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      ce99b9:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
      ce99c0:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
      ce99c7:	00 
      ce99c8:	e8 b3 46 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      ce99cd:	48 8d bb 50 01 00 00 	lea    rdi,[rbx+0x150]
      ce99d4:	48 8d b4 24 58 04 00 	lea    rsi,[rsp+0x458]
      ce99db:	00 
      ce99dc:	e8 9f 46 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      ce99e1:	8b 84 24 70 04 00 00 	mov    eax,DWORD PTR [rsp+0x470]
      ce99e8:	89 83 68 01 00 00    	mov    DWORD PTR [rbx+0x168],eax
      ce99ee:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
      ce99f5:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
      ce99fa:	e8 81 46 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      ce99ff:	48 8d bb 88 01 00 00 	lea    rdi,[rbx+0x188]
      ce9a06:	48 8d b4 24 90 04 00 	lea    rsi,[rsp+0x490]
      ce9a0d:	00 
      ce9a0e:	e8 6d 46 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      ce9a13:	8b 84 24 a8 04 00 00 	mov    eax,DWORD PTR [rsp+0x4a8]
      ce9a1a:	89 83 a0 01 00 00    	mov    DWORD PTR [rbx+0x1a0],eax
      ce9a20:	48 8d bb a8 01 00 00 	lea    rdi,[rbx+0x1a8]

### 0xce9c37 (0xce8ef6..0xcea164)
      ce9c09:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
      ce9c10:	00 
      ce9c11:	48 89 ac 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rbp
      ce9c18:	00 
      ce9c19:	e8 22 43 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ce9c1e:	48 8d bb 50 01 00 00 	lea    rdi,[rbx+0x150]
      ce9c25:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
      ce9c2a:	48 8d b4 24 58 04 00 	lea    rsi,[rsp+0x458]
      ce9c31:	00 
      ce9c32:	e8 09 43 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ce9c37:	8b 84 24 70 04 00 00 	mov    eax,DWORD PTR [rsp+0x470]
      ce9c3e:	89 83 68 01 00 00    	mov    DWORD PTR [rbx+0x168],eax
      ce9c44:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
      ce9c4b:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      ce9c50:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
      ce9c55:	e8 e6 42 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ce9c5a:	48 8d bb 88 01 00 00 	lea    rdi,[rbx+0x188]
      ce9c61:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      ce9c66:	48 8d b4 24 90 04 00 	lea    rsi,[rsp+0x490]
      ce9c6d:	00 
      ce9c6e:	e8 cd 42 b0 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ce9c73:	8b 84 24 a8 04 00 00 	mov    eax,DWORD PTR [rsp+0x4a8]

### 0xcea836 (0xcea164..0xceabe2)
      cea811:	48 85 c0             	test   rax,rax
      cea814:	74 10                	je     cea826 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2377c6>
      cea816:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
      cea81d:	00 
      cea81e:	48 89 c6             	mov    rsi,rax
      cea821:	e8 5a 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea826:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
      cea82d:	00 
      cea82e:	4c 89 fe             	mov    rsi,r15
      cea831:	e8 4a 38 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cea836:	4c 8d ac 24 70 04 00 	lea    r13,[rsp+0x470]
      cea83d:	00 
      cea83e:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      cea842:	e8 ef 0f d9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      cea847:	48 89 c7             	mov    rdi,rax
      cea84a:	48 89 d6             	mov    rsi,rdx
      cea84d:	e8 1b 17 84 00       	call   152bf6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3714f1>
      cea852:	89 84 24 b0 01 00 00 	mov    DWORD PTR [rsp+0x1b0],eax
      cea859:	41 8a 87 b4 00 00 00 	mov    al,BYTE PTR [r15+0xb4]
      cea860:	88 84 24 b4 01 00 00 	mov    BYTE PTR [rsp+0x1b4],al
      cea867:	41 0f b6 87 b5 00 00 	movzx  eax,BYTE PTR [r15+0xb5]
      cea86e:	00 

### 0xd080c7 (0xd077d6..0xd090fa)
      d0809b:	66 41 83 a4 24 10 04 	and    WORD PTR [r12+0x410],0x0
      d080a2:	00 00 00 
      d080a5:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
      d080aa:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
      d080af:	41 88 ac 24 12 04 00 	mov    BYTE PTR [r12+0x412],bpl
      d080b6:	00 
      d080b7:	49 8d 9c 24 18 04 00 	lea    rbx,[r12+0x418]
      d080be:	00 
      d080bf:	48 89 df             	mov    rdi,rbx
      d080c2:	e8 3b 1d ad 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      d080c7:	49 8d bc 24 70 04 00 	lea    rdi,[r12+0x470]
      d080ce:	00 
      d080cf:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
      d080d6:	00 
      d080d7:	e8 b2 01 e2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d080dc:	49 8d bc 24 c8 04 00 	lea    rdi,[r12+0x4c8]
      d080e3:	00 
      d080e4:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
      d080eb:	00 
      d080ec:	e8 9d 01 e2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      d080f1:	41 c6 84 24 20 05 00 	mov    BYTE PTR [r12+0x520],0x0
      d080f8:	00 00 

### 0xd08570 (0xd077d6..0xd090fa) WRITE
      d08545:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
      d08549:	48 8d 84 24 98 04 00 	lea    rax,[rsp+0x498]
      d08550:	00 
      d08551:	4c 89 b4 24 90 04 00 	mov    QWORD PTR [rsp+0x490],r14
      d08558:	00 
      d08559:	48 8d 0d b8 96 74 ff 	lea    rcx,[rip+0xffffffffff7496b8]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      d08560:	48 89 8c 24 60 04 00 	mov    QWORD PTR [rsp+0x460],rcx
      d08567:	00 
      d08568:	48 89 8c 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rcx
      d0856f:	00 
      d08570:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
      d08577:	00 00 
      d08579:	0f 57 c0             	xorps  xmm0,xmm0
      d0857c:	48 83 a4 24 f0 03 00 	and    QWORD PTR [rsp+0x3f0],0x0
      d08583:	00 00 
      d08585:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      d08588:	48 83 a4 24 00 04 00 	and    QWORD PTR [rsp+0x400],0x0
      d0858f:	00 00 
      d08591:	6a 18                	push   0x18
      d08593:	5f                   	pop    rdi
      d08594:	e8 67 59 ae 00       	call   17edf00 <_Znwm@plt>
      d08599:	4c 89 30             	mov    QWORD PTR [rax],r14

### 0xd16714 (0xd1658e..0xd168b4)
      d166d8:	48 8d bb 50 06 00 00 	lea    rdi,[rbx+0x650]
      d166df:	e8 82 37 ac 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      d166e4:	48 8d bb f8 05 00 00 	lea    rdi,[rbx+0x5f8]
      d166eb:	e8 76 37 ac 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      d166f0:	48 8d bb 90 05 00 00 	lea    rdi,[rbx+0x590]
      d166f7:	e8 d8 d9 ee ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
      d166fc:	48 8d bb 30 05 00 00 	lea    rdi,[rbx+0x530]
      d16703:	e8 5e 37 ac 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      d16708:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
      d1670f:	e8 52 37 ac 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      d16714:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
      d1671b:	e8 46 37 ac 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      d16720:	48 8d bb 18 04 00 00 	lea    rdi,[rbx+0x418]
      d16727:	e8 3a 37 ac 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      d1672c:	4c 89 ef             	mov    rdi,r13
      d1672f:	e8 c6 e7 ff ff       	call   d14efa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x261e9a>
      d16734:	48 8d bb d8 03 00 00 	lea    rdi,[rbx+0x3d8]
      d1673b:	e8 80 83 ad 00       	call   17eeac0 <_ZNSt6__ndk115recursive_mutexD1Ev@plt>
      d16740:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      d16744:	e8 8b 34 ac 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      d16749:	4c 89 ff             	mov    rdi,r15
      d1674c:	e8 6f 83 ad 00       	call   17eeac0 <_ZNSt6__ndk115recursive_mutexD1Ev@plt>

### 0xd6b96a (0xd6aa99..0xd6f087)
      d6b93f:	4d 89 af 50 04 00 00 	mov    QWORD PTR [r15+0x450],r13
      d6b946:	48 8d bc 24 50 06 00 	lea    rdi,[rsp+0x650]
      d6b94d:	00 
      d6b94e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d6b951:	4c 89 ee             	mov    rsi,r13
      d6b954:	ff 50 18             	call   QWORD PTR [rax+0x18]
      d6b957:	49 8d 87 60 04 00 00 	lea    rax,[r15+0x460]
      d6b95e:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      d6b965:	00 
      d6b966:	66 0f ef c0          	pxor   xmm0,xmm0
      d6b96a:	66 41 0f 7f 87 70 04 	movdqa XMMWORD PTR [r15+0x470],xmm0
      d6b971:	00 00 
      d6b973:	66 41 0f 7f 87 60 04 	movdqa XMMWORD PTR [r15+0x460],xmm0
      d6b97a:	00 00 
      d6b97c:	bb 00 00 80 3f       	mov    ebx,0x3f800000
      d6b981:	41 89 9f 80 04 00 00 	mov    DWORD PTR [r15+0x480],ebx
      d6b988:	f3 41 0f 7f 87 88 04 	movdqu XMMWORD PTR [r15+0x488],xmm0
      d6b98f:	00 00 
      d6b991:	f3 41 0f 7f 87 98 04 	movdqu XMMWORD PTR [r15+0x498],xmm0
      d6b998:	00 00 
      d6b99a:	41 89 9f a8 04 00 00 	mov    DWORD PTR [r15+0x4a8],ebx
      d6b9a1:	49 8d 87 b0 04 00 00 	lea    rax,[r15+0x4b0]

### 0xd6cb4d (0xd6aa99..0xd6f087) WRITE
      d6cb21:	66 c7 41 d8 01 00    	mov    WORD PTR [rcx-0x28],0x1
      d6cb27:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
      d6cb2c:	83 61 e8 00          	and    DWORD PTR [rcx-0x18],0x0
      d6cb30:	4c 89 71 f0          	mov    QWORD PTR [rcx-0x10],r14
      d6cb34:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      d6cb38:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
      d6cb3c:	48 b8 01 00 00 00 40 	movabs rax,0x4000000001
      d6cb43:	00 00 00 
      d6cb46:	48 89 41 f8          	mov    QWORD PTR [rcx-0x8],rax
      d6cb4a:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      d6cb4d:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      d6cb54:	00 
      d6cb55:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      d6cb59:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      d6cb5d:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
      d6cb64:	00 
      d6cb65:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
      d6cb69:	48 8d 83 20 0c 00 00 	lea    rax,[rbx+0xc20]
      d6cb70:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
      d6cb77:	00 
      d6cb78:	48 8d 83 30 0c 00 00 	lea    rax,[rbx+0xc30]
      d6cb7f:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax

### 0xd6d7f3 (0xd6aa99..0xd6f087)
      d6d7c8:	8b 84 24 a0 04 00 00 	mov    eax,DWORD PTR [rsp+0x4a0]
      d6d7cf:	83 f8 01             	cmp    eax,0x1
      d6d7d2:	7f 0e                	jg     d6d7e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a868>
      d6d7d4:	80 bc 24 81 04 00 00 	cmp    BYTE PTR [rsp+0x481],0x0
      d6d7db:	00 
      d6d7dc:	0f 84 40 0a 00 00    	je     d6e222 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b2a8>
      d6d7e2:	c6 84 24 81 04 00 00 	mov    BYTE PTR [rsp+0x481],0x0
      d6d7e9:	00 
      d6d7ea:	ff c8                	dec    eax
      d6d7ec:	89 84 24 a0 04 00 00 	mov    DWORD PTR [rsp+0x4a0],eax
      d6d7f3:	66 0f 6f 84 24 70 04 	movdqa xmm0,XMMWORD PTR [rsp+0x470]
      d6d7fa:	00 00 
      d6d7fc:	48 8d 84 24 a8 04 00 	lea    rax,[rsp+0x4a8]
      d6d803:	00 
      d6d804:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
      d6d808:	80 bc 24 80 04 00 00 	cmp    BYTE PTR [rsp+0x480],0x0
      d6d80f:	00 
      d6d810:	75 17                	jne    d6d829 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a8af>
      d6d812:	48 8d 15 ff 9d b7 00 	lea    rdx,[rip+0xb79dff]        # 18e7618 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2ea28>
      d6d819:	48 8d bc 24 b8 03 00 	lea    rdi,[rsp+0x3b8]
      d6d820:	00 
      d6d821:	6a 26                	push   0x26

### 0xd6da31 (0xd6aa99..0xd6f087)
      d6da08:	4c 89 ff             	mov    rdi,r15
      d6da0b:	e8 20 2f 00 00       	call   d70930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d9b6>
      d6da10:	4c 89 ac 24 68 07 00 	mov    QWORD PTR [rsp+0x768],r13
      d6da17:	00 
      d6da18:	4c 89 f7             	mov    rdi,r14
      d6da1b:	e8 0e 79 95 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d6da20:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
      d6da23:	48 85 db             	test   rbx,rbx
      d6da26:	0f 85 12 ff ff ff    	jne    d6d93e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a9c4>
      d6da2c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6da31:	48 8b 80 70 04 00 00 	mov    rax,QWORD PTR [rax+0x470]
      d6da38:	45 31 e4             	xor    r12d,r12d
      d6da3b:	48 85 c0             	test   rax,rax
      d6da3e:	74 20                	je     d6da60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3aae6>
      d6da40:	48 8b 88 e0 00 00 00 	mov    rcx,QWORD PTR [rax+0xe0]
      d6da47:	48 2b 88 d8 00 00 00 	sub    rcx,QWORD PTR [rax+0xd8]
      d6da4e:	48 8b 10             	mov    rdx,QWORD PTR [rax]
      d6da51:	48 c1 f9 05          	sar    rcx,0x5
      d6da55:	49 01 cc             	add    r12,rcx
      d6da58:	48 89 d0             	mov    rax,rdx
      d6da5b:	48 85 d2             	test   rdx,rdx
      d6da5e:	75 e0                	jne    d6da40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3aac6>

### 0xd6de8b (0xd6aa99..0xd6f087)
      d6de5f:	84 c0                	test   al,al
      d6de61:	75 23                	jne    d6de86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3af0c>
      d6de63:	48 8d b4 24 20 08 00 	lea    rsi,[rsp+0x820]
      d6de6a:	00 
      d6de6b:	c7 06 65 1b 00 00    	mov    DWORD PTR [rsi],0x1b65
      d6de71:	48 8d 05 a0 97 b7 00 	lea    rax,[rip+0xb797a0]        # 18e7618 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2ea28>
      d6de78:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d6de7c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d6de81:	e8 2e 2b 00 00       	call   d709b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3da3a>
      d6de86:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d6de8b:	48 8b 87 70 04 00 00 	mov    rax,QWORD PTR [rdi+0x470]
      d6de92:	48 85 c0             	test   rax,rax
      d6de95:	74 21                	je     d6deb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3af3e>
      d6de97:	8b 8f a8 01 00 00    	mov    ecx,DWORD PTR [rdi+0x1a8]
      d6de9d:	8b 90 50 01 00 00    	mov    edx,DWORD PTR [rax+0x150]
      d6dea3:	ff c2                	inc    edx
      d6dea5:	39 d1                	cmp    ecx,edx
      d6dea7:	0f 46 ca             	cmovbe ecx,edx
      d6deaa:	89 8f a8 01 00 00    	mov    DWORD PTR [rdi+0x1a8],ecx
      d6deb0:	48 8b 00             	mov    rax,QWORD PTR [rax]
      d6deb3:	48 85 c0             	test   rax,rax
      d6deb6:	75 e5                	jne    d6de9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3af23>

### 0xd706bb (0xd70640..0xd70744)
      d70699:	74 20                	je     d706bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d741>
      d7069b:	49 8b 77 28          	mov    rsi,QWORD PTR [r15+0x28]
      d7069f:	49 8d 57 30          	lea    rdx,[r15+0x30]
      d706a3:	48 89 df             	mov    rdi,rbx
      d706a6:	e8 7f a2 ff ff       	call   d6a92a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x379b0>
      d706ab:	4c 89 ff             	mov    rdi,r15
      d706ae:	e8 2f e1 d2 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
      d706b3:	49 89 c7             	mov    r15,rax
      d706b6:	4c 39 e0             	cmp    rax,r12
      d706b9:	75 e0                	jne    d7069b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d721>
      d706bb:	4d 8b be 70 04 00 00 	mov    r15,QWORD PTR [r14+0x470]
      d706c2:	4d 85 ff             	test   r15,r15
      d706c5:	74 38                	je     d706ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d785>
      d706c7:	4d 8b b7 78 01 00 00 	mov    r14,QWORD PTR [r15+0x178]
      d706ce:	4d 8d a7 80 01 00 00 	lea    r12,[r15+0x180]
      d706d5:	4d 39 e6             	cmp    r14,r12
      d706d8:	74 20                	je     d706fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d780>
      d706da:	49 8b 76 28          	mov    rsi,QWORD PTR [r14+0x28]
      d706de:	49 8d 56 30          	lea    rdx,[r14+0x30]
      d706e2:	48 89 df             	mov    rdi,rbx
      d706e5:	e8 40 a2 ff ff       	call   d6a92a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x379b0>
      d706ea:	4c 89 f7             	mov    rdi,r14

### 0xd71000 (0xd70fde..0xd71310)
      d70fdf:	41 57                	push   r15
      d70fe1:	41 56                	push   r14
      d70fe3:	41 55                	push   r13
      d70fe5:	41 54                	push   r12
      d70fe7:	53                   	push   rbx
      d70fe8:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
      d70fef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d70ff6:	00 00 
      d70ff8:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      d70fff:	00 
      d71000:	4c 8b b7 70 04 00 00 	mov    r14,QWORD PTR [rdi+0x470]
      d71007:	4d 85 f6             	test   r14,r14
      d7100a:	0f 84 92 02 00 00    	je     d712a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e328>
      d71010:	48 89 fb             	mov    rbx,rdi
      d71013:	48 8d 87 60 04 00 00 	lea    rax,[rdi+0x460]
      d7101a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      d7101f:	48 8d 87 50 0a 00 00 	lea    rax,[rdi+0xa50]
      d71026:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d7102b:	45 31 e4             	xor    r12d,r12d
      d7102e:	bd 00 a4 93 d6       	mov    ebp,0xd693a400
      d71033:	4c 8d 6c 24 18       	lea    r13,[rsp+0x18]
      d71038:	48 8b bb d0 06 00 00 	mov    rdi,QWORD PTR [rbx+0x6d0]

### 0xd71996 (0xd71884..0xd723ed)
      d71971:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d71974:	4c 89 f2             	mov    rdx,r14
      d71977:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]
      d7197d:	4c 89 f7             	mov    rdi,r14
      d71980:	e8 21 0c 00 00       	call   d725a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f62c>
      d71985:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
      d71988:	4d 85 ff             	test   r15,r15
      d7198b:	75 c1                	jne    d7194e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e9d4>
      d7198d:	80 bb 15 02 00 00 00 	cmp    BYTE PTR [rbx+0x215],0x0
      d71994:	74 6b                	je     d71a01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ea87>
      d71996:	4c 8b a3 70 04 00 00 	mov    r12,QWORD PTR [rbx+0x470]
      d7199d:	4d 85 e4             	test   r12,r12
      d719a0:	74 5f                	je     d71a01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ea87>
      d719a2:	4c 8d b4 24 30 01 00 	lea    r14,[rsp+0x130]
      d719a9:	00 
      d719aa:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
      d719b1:	00 
      d719b2:	4d 8b ac 24 38 01 00 	mov    r13,QWORD PTR [r12+0x138]
      d719b9:	00 
      d719ba:	4d 85 ed             	test   r13,r13
      d719bd:	74 39                	je     d719f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ea7e>
      d719bf:	49 8d 55 10          	lea    rdx,[r13+0x10]

### 0xd736d7 (0xd73652..0xd73887)
      d736b1:	49 89 07             	mov    QWORD PTR [r15],rax
      d736b4:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      d736b8:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      d736bc:	48 8d 04 d0          	lea    rax,[rax+rdx*8]
      d736c0:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      d736c4:	48 89 df             	mov    rdi,rbx
      d736c7:	4c 89 fe             	mov    rsi,r15
      d736ca:	e8 77 c2 d2 ff       	call   a9f946 <JNI_OnUnload@@Base+0x27213>
      d736cf:	4c 89 ff             	mov    rdi,r15
      d736d2:	e8 c7 c2 d2 ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
      d736d7:	49 8b ae 70 04 00 00 	mov    rbp,QWORD PTR [r14+0x470]
      d736de:	48 85 ed             	test   rbp,rbp
      d736e1:	0f 84 c9 00 00 00    	je     d737b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40836>
      d736e7:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
      d736eb:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
      d736f0:	4c 8d 65 68          	lea    r12,[rbp+0x68]
      d736f4:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      d736f8:	49 39 c6             	cmp    r14,rax
      d736fb:	73 0c                	jae    d73709 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4078f>
      d736fd:	4d 89 26             	mov    QWORD PTR [r14],r12
      d73700:	49 83 c6 08          	add    r14,0x8
      d73704:	e9 94 00 00 00       	jmp    d7379d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40823>

### 0xd786eb (0xd78540..0xd7994b)
      d786be:	48 83 a4 24 e0 01 00 	and    QWORD PTR [rsp+0x1e0],0x0
      d786c5:	00 00 
      d786c7:	0f 11 84 24 08 02 00 	movups XMMWORD PTR [rsp+0x208],xmm0
      d786ce:	00 
      d786cf:	48 83 a4 24 d0 01 00 	and    QWORD PTR [rsp+0x1d0],0x0
      d786d6:	00 00 
      d786d8:	0f 11 84 24 c0 01 00 	movups XMMWORD PTR [rsp+0x1c0],xmm0
      d786df:	00 
      d786e0:	c7 84 24 f0 00 00 00 	mov    DWORD PTR [rsp+0xf0],0xc2e
      d786e7:	2e 0c 00 00 
      d786eb:	48 8b 9f 70 04 00 00 	mov    rbx,QWORD PTR [rdi+0x470]
      d786f2:	48 85 db             	test   rbx,rbx
      d786f5:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      d786fa:	0f 84 5b 07 00 00    	je     d78e5b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45ee1>
      d78700:	48 8d b3 c0 00 00 00 	lea    rsi,[rbx+0xc0]
      d78707:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      d7870e:	00 
      d7870f:	e8 b2 1e ff ff       	call   d6a5c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3764c>
      d78714:	48 ff 00             	inc    QWORD PTR [rax]
      d78717:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
      d7871c:	8b 6b 48             	mov    ebp,DWORD PTR [rbx+0x48]
      d7871f:	4c 63 e5             	movsxd r12,ebp

### 0xd79d95 (0xd7994c..0xd7a534)
      d79d72:	49 8b 8f 78 04 00 00 	mov    rcx,QWORD PTR [r15+0x478]
      d79d79:	48 85 c9             	test   rcx,rcx
      d79d7c:	0f 84 ac 03 00 00    	je     d7a12e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x471b4>
      d79d82:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
      d79d89:	00 
      d79d8a:	6a 01                	push   0x1
      d79d8c:	5e                   	pop    rsi
      d79d8d:	6a 04                	push   0x4
      d79d8f:	5a                   	pop    rdx
      d79d90:	e8 ed 2e 8e 00       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
      d79d95:	4d 8b a7 70 04 00 00 	mov    r12,QWORD PTR [r15+0x470]
      d79d9c:	4d 85 e4             	test   r12,r12
      d79d9f:	0f 84 89 03 00 00    	je     d7a12e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x471b4>
      d79da5:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
      d79dac:	00 
      d79dad:	48 8d 5c 24 78       	lea    rbx,[rsp+0x78]
      d79db2:	48 8d 05 e7 01 ab 00 	lea    rax,[rip+0xab01e7]        # 1829fa0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x65d0>
      d79db9:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      d79dc0:	00 
      d79dc1:	48 8d 84 24 38 01 00 	lea    rax,[rsp+0x138]
      d79dc8:	00 
      d79dc9:	0f 57 c0             	xorps  xmm0,xmm0

### 0xd7a5b3 (0xd7a534..0xd7a630)
      d7a58e:	48 8b bb 60 07 00 00 	mov    rdi,QWORD PTR [rbx+0x760]
      d7a595:	4c 89 f2             	mov    rdx,r14
      d7a598:	e8 f3 37 d4 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      d7a59d:	6a 0f                	push   0xf
      d7a59f:	5a                   	pop    rdx
      d7a5a0:	48 89 df             	mov    rdi,rbx
      d7a5a3:	4c 89 fe             	mov    rsi,r15
      d7a5a6:	e8 05 65 ff ff       	call   d70ab0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3db36>
      d7a5ab:	48 89 df             	mov    rdi,rbx
      d7a5ae:	e8 19 02 00 00       	call   d7a7cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47852>
      d7a5b3:	4c 8b b3 70 04 00 00 	mov    r14,QWORD PTR [rbx+0x470]
      d7a5ba:	4d 85 f6             	test   r14,r14
      d7a5bd:	74 4f                	je     d7a60e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47694>
      d7a5bf:	4d 8b be d8 00 00 00 	mov    r15,QWORD PTR [r14+0xd8]
      d7a5c6:	4d 8b a6 e0 00 00 00 	mov    r12,QWORD PTR [r14+0xe0]
      d7a5cd:	4d 39 e7             	cmp    r15,r12
      d7a5d0:	74 14                	je     d7a5e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4766c>
      d7a5d2:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      d7a5d5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d7a5d8:	ff 50 48             	call   QWORD PTR [rax+0x48]
      d7a5db:	49 83 c7 20          	add    r15,0x20
      d7a5df:	48 85 c0             	test   rax,rax

### 0xd7e63b (0xd7e33e..0xd7eb7e)
      d7e605:	00 
      d7e606:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      d7e609:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d7e60e:	48 8b b3 78 04 00 00 	mov    rsi,QWORD PTR [rbx+0x478]
      d7e615:	e8 a6 56 e9 ff       	call   c13cc0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x160c60>
      d7e61a:	4c 8d ab d8 02 00 00 	lea    r13,[rbx+0x2d8]
      d7e621:	48 8d ab e0 02 00 00 	lea    rbp,[rbx+0x2e0]
      d7e628:	48 8d 83 e8 02 00 00 	lea    rax,[rbx+0x2e8]
      d7e62f:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      d7e634:	4c 8d bb 60 04 00 00 	lea    r15,[rbx+0x460]
      d7e63b:	4c 8d a3 70 04 00 00 	lea    r12,[rbx+0x470]
      d7e642:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
      d7e649:	00 
      d7e64a:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
      d7e64e:	4d 85 e4             	test   r12,r12
      d7e651:	74 0f                	je     d7e662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b6e8>
      d7e653:	49 8d 74 24 10       	lea    rsi,[r12+0x10]
      d7e658:	4c 89 f7             	mov    rdi,r14
      d7e65b:	e8 da 4b e9 ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>
      d7e660:	eb e8                	jmp    d7e64a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b6d0>
      d7e662:	48 83 bb 78 04 00 00 	cmp    QWORD PTR [rbx+0x478],0x0
      d7e669:	00 

### 0xd7e66c (0xd7e33e..0xd7eb7e)
      d7e64a:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
      d7e64e:	4d 85 e4             	test   r12,r12
      d7e651:	74 0f                	je     d7e662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b6e8>
      d7e653:	49 8d 74 24 10       	lea    rsi,[r12+0x10]
      d7e658:	4c 89 f7             	mov    rdi,r14
      d7e65b:	e8 da 4b e9 ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>
      d7e660:	eb e8                	jmp    d7e64a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b6d0>
      d7e662:	48 83 bb 78 04 00 00 	cmp    QWORD PTR [rbx+0x478],0x0
      d7e669:	00 
      d7e66a:	74 3a                	je     d7e6a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b72c>
      d7e66c:	48 8b bb 70 04 00 00 	mov    rdi,QWORD PTR [rbx+0x470]
      d7e673:	e8 54 6e ff ff       	call   d754cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42552>
      d7e678:	48 83 a3 70 04 00 00 	and    QWORD PTR [rbx+0x470],0x0
      d7e67f:	00 
      d7e680:	48 8b 83 68 04 00 00 	mov    rax,QWORD PTR [rbx+0x468]
      d7e687:	48 85 c0             	test   rax,rax
      d7e68a:	74 12                	je     d7e69e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b724>
      d7e68c:	31 c9                	xor    ecx,ecx
      d7e68e:	49 8b 17             	mov    rdx,QWORD PTR [r15]
      d7e691:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
      d7e696:	48 ff c1             	inc    rcx
      d7e699:	48 39 c8             	cmp    rax,rcx

### 0xd7e678 (0xd7e33e..0xd7eb7e) WRITE
      d7e651:	74 0f                	je     d7e662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b6e8>
      d7e653:	49 8d 74 24 10       	lea    rsi,[r12+0x10]
      d7e658:	4c 89 f7             	mov    rdi,r14
      d7e65b:	e8 da 4b e9 ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>
      d7e660:	eb e8                	jmp    d7e64a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b6d0>
      d7e662:	48 83 bb 78 04 00 00 	cmp    QWORD PTR [rbx+0x478],0x0
      d7e669:	00 
      d7e66a:	74 3a                	je     d7e6a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b72c>
      d7e66c:	48 8b bb 70 04 00 00 	mov    rdi,QWORD PTR [rbx+0x470]
      d7e673:	e8 54 6e ff ff       	call   d754cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42552>
      d7e678:	48 83 a3 70 04 00 00 	and    QWORD PTR [rbx+0x470],0x0
      d7e67f:	00 
      d7e680:	48 8b 83 68 04 00 00 	mov    rax,QWORD PTR [rbx+0x468]
      d7e687:	48 85 c0             	test   rax,rax
      d7e68a:	74 12                	je     d7e69e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b724>
      d7e68c:	31 c9                	xor    ecx,ecx
      d7e68e:	49 8b 17             	mov    rdx,QWORD PTR [r15]
      d7e691:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
      d7e696:	48 ff c1             	inc    rcx
      d7e699:	48 39 c8             	cmp    rax,rcx
      d7e69c:	75 f0                	jne    d7e68e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b714>
      d7e69e:	48 83 a3 78 04 00 00 	and    QWORD PTR [rbx+0x478],0x0

### 0xd7eeff (0xd7eefa..0xd7ef42)
      d7eee7:	48 69 d0 40 42 0f 00 	imul   rdx,rax,0xf4240
      d7eeee:	4c 01 f2             	add    rdx,r14
      d7eef1:	4c 89 f8             	mov    rax,r15
      d7eef4:	5b                   	pop    rbx
      d7eef5:	41 5e                	pop    r14
      d7eef7:	41 5f                	pop    r15
      d7eef9:	c3                   	ret
      d7eefa:	41 57                	push   r15
      d7eefc:	41 56                	push   r14
      d7eefe:	53                   	push   rbx
      d7eeff:	4c 8b bf 70 04 00 00 	mov    r15,QWORD PTR [rdi+0x470]
      d7ef06:	4d 85 ff             	test   r15,r15
      d7ef09:	74 31                	je     d7ef3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bfc2>
      d7ef0b:	48 89 f3             	mov    rbx,rsi
      d7ef0e:	49 89 fe             	mov    r14,rdi
      d7ef11:	49 8d bf c0 00 00 00 	lea    rdi,[r15+0xc0]
      d7ef18:	48 89 de             	mov    rsi,rbx
      d7ef1b:	e8 ce 07 d2 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      d7ef20:	84 c0                	test   al,al
      d7ef22:	74 10                	je     d7ef34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bfba>
      d7ef24:	49 8d 77 68          	lea    rsi,[r15+0x68]
      d7ef28:	49 8b be b8 00 00 00 	mov    rdi,QWORD PTR [r14+0xb8]

### 0xd81760 (0xd8170c..0xd81808)
      d8173b:	48 8d 73 10          	lea    rsi,[rbx+0x10]
      d8173f:	4c 89 ef             	mov    rdi,r13
      d81742:	e8 95 7d fe ff       	call   d694dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36562>
      d81747:	84 c0                	test   al,al
      d81749:	74 e4                	je     d8172f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4e7b5>
      d8174b:	0f 57 c0             	xorps  xmm0,xmm0
      d8174e:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      d81752:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      d81756:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      d81759:	c7 40 20 00 00 80 3f 	mov    DWORD PTR [rax+0x20],0x3f800000
      d81760:	4d 8b ac 24 70 04 00 	mov    r13,QWORD PTR [r12+0x470]
      d81767:	00 
      d81768:	4d 85 ed             	test   r13,r13
      d8176b:	74 70                	je     d817dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4e863>
      d8176d:	4d 8d 65 10          	lea    r12,[r13+0x10]
      d81771:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
      d81775:	48 85 ff             	test   rdi,rdi
      d81778:	74 0c                	je     d81786 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4e80c>
      d8177a:	4c 89 e6             	mov    rsi,r12
      d8177d:	e8 0e c6 d3 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      d81782:	84 c0                	test   al,al
      d81784:	74 3c                	je     d817c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4e848>

### 0xd81c16 (0xd81b9a..0xd81d21)
      d81be7:	4c 0f 45 c0          	cmovne r8,rax
      d81beb:	49 83 c0 08          	add    r8,0x8
      d81bef:	83 fd 01             	cmp    ebp,0x1
      d81bf2:	41 0f b6 b6 04 02 00 	movzx  esi,BYTE PTR [r14+0x204]
      d81bf9:	00 
      d81bfa:	4c 0f 45 c0          	cmovne r8,rax
      d81bfe:	49 8d 96 a8 02 00 00 	lea    rdx,[r14+0x2a8]
      d81c05:	49 8d 8e 58 05 00 00 	lea    rcx,[r14+0x558]
      d81c0c:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d81c11:	e8 be d4 00 00       	call   d8f0d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c15a>
      d81c16:	4d 8b a6 70 04 00 00 	mov    r12,QWORD PTR [r14+0x470]
      d81c1d:	4d 85 e4             	test   r12,r12
      d81c20:	74 4b                	je     d81c6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ecf3>
      d81c22:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
      d81c27:	41 8b 84 24 f8 00 00 	mov    eax,DWORD PTR [r12+0xf8]
      d81c2e:	00 
      d81c2f:	83 e0 fe             	and    eax,0xfffffffe
      d81c32:	83 f8 02             	cmp    eax,0x2
      d81c35:	74 15                	je     d81c4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ecd2>
      d81c37:	49 8d 74 24 10       	lea    rsi,[r12+0x10]
      d81c3c:	49 8b be 90 06 00 00 	mov    rdi,QWORD PTR [r14+0x690]
      d81c43:	e8 ee f4 ec ff       	call   c51136 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e0d6>

### 0xd82072 (0xd82046..0xd821e3)
      d8204d:	41 54                	push   r12
      d8204f:	53                   	push   rbx
      d82050:	48 83 ec 78          	sub    rsp,0x78
      d82054:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8205b:	00 00 
      d8205d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      d82062:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d82067:	0f 57 c0             	xorps  xmm0,xmm0
      d8206a:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      d8206f:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      d82072:	4c 8b a6 70 04 00 00 	mov    r12,QWORD PTR [rsi+0x470]
      d82079:	4d 85 e4             	test   r12,r12
      d8207c:	0f 84 fa 00 00 00    	je     d8217c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4f202>
      d82082:	49 89 f6             	mov    r14,rsi
      d82085:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
      d8208a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      d8208f:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      d82093:	48 2b 07             	sub    rax,QWORD PTR [rdi]
      d82096:	48 99                	cqo
      d82098:	6a 58                	push   0x58
      d8209a:	59                   	pop    rcx
      d8209b:	48 f7 f9             	idiv   rcx

### 0xd8b7c3 (0xd8b73e..0xd8b973)
      d8b79d:	49 89 07             	mov    QWORD PTR [r15],rax
      d8b7a0:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      d8b7a4:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      d8b7a8:	48 8d 04 d0          	lea    rax,[rax+rdx*8]
      d8b7ac:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      d8b7b0:	48 89 df             	mov    rdi,rbx
      d8b7b3:	4c 89 fe             	mov    rsi,r15
      d8b7b6:	e8 8b 41 d1 ff       	call   a9f946 <JNI_OnUnload@@Base+0x27213>
      d8b7bb:	4c 89 ff             	mov    rdi,r15
      d8b7be:	e8 db 41 d1 ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
      d8b7c3:	49 8b ae 70 04 00 00 	mov    rbp,QWORD PTR [r14+0x470]
      d8b7ca:	48 85 ed             	test   rbp,rbp
      d8b7cd:	0f 84 c9 00 00 00    	je     d8b89c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58922>
      d8b7d3:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
      d8b7d7:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
      d8b7dc:	4c 8d 65 68          	lea    r12,[rbp+0x68]
      d8b7e0:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      d8b7e4:	49 39 c6             	cmp    r14,rax
      d8b7e7:	73 0c                	jae    d8b7f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5887b>
      d8b7e9:	4d 89 26             	mov    QWORD PTR [r14],r12
      d8b7ec:	49 83 c6 08          	add    r14,0x8
      d8b7f0:	e9 94 00 00 00       	jmp    d8b889 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5890f>

### 0xdb22d0 (0xdb0c12..0xdb2528)
      db22a4:	e8 c1 7c cc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      db22a9:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      db22b0:	00 
      db22b1:	e8 b4 7c cc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      db22b6:	49 8b bc 24 e0 04 00 	mov    rdi,QWORD PTR [r12+0x4e0]
      db22bd:	00 
      db22be:	e8 c3 c1 ce ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      db22c3:	49 8b bc 24 d0 04 00 	mov    rdi,QWORD PTR [r12+0x4d0]
      db22ca:	00 
      db22cb:	e8 b6 c1 ce ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      db22d0:	49 8d bc 24 70 04 00 	lea    rdi,[r12+0x470]
      db22d7:	00 
      db22d8:	e8 4b 94 cc ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      db22dd:	49 8d bc 24 38 04 00 	lea    rdi,[r12+0x438]
      db22e4:	00 
      db22e5:	e8 3e 94 cc ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      db22ea:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
      db22f1:	00 
      db22f2:	e8 73 7c cc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      db22f7:	4c 89 ff             	mov    rdi,r15
      db22fa:	e8 6b 7c cc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      db22ff:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]

### 0xdb6c0c (0xdb6b30..0xdb6c4c)
      db6be3:	e8 f2 64 00 00       	call   dbd0da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a160>
      db6be8:	48 8b 8b 28 03 00 00 	mov    rcx,QWORD PTR [rbx+0x328]
      db6bef:	80 79 30 00          	cmp    BYTE PTR [rcx+0x30],0x0
      db6bf3:	74 0d                	je     db6c02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83c88>
      db6bf5:	48 63 d0             	movsxd rdx,eax
      db6bf8:	48 3b 51 28          	cmp    rdx,QWORD PTR [rcx+0x28]
      db6bfc:	0f 83 45 ff ff ff    	jae    db6b47 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83bcd>
      db6c02:	4c 89 f2             	mov    rdx,r14
      db6c05:	48 c1 ea 20          	shr    rdx,0x20
      db6c09:	44 01 f2             	add    edx,r14d
      db6c0c:	8b 8b 70 04 00 00    	mov    ecx,DWORD PTR [rbx+0x470]
      db6c12:	01 c1                	add    ecx,eax
      db6c14:	39 ca                	cmp    edx,ecx
      db6c16:	0f 4c ca             	cmovl  ecx,edx
      db6c19:	ba ff bf ff 7f       	mov    edx,0x7fffbfff
      db6c1e:	39 d1                	cmp    ecx,edx
      db6c20:	0f 4d ca             	cmovge ecx,edx
      db6c23:	39 c1                	cmp    ecx,eax
      db6c25:	0f 8e 1c ff ff ff    	jle    db6b47 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83bcd>
      db6c2b:	48 81 c3 10 03 00 00 	add    rbx,0x310
      db6c32:	6a 01                	push   0x1
      db6c34:	41 58                	pop    r8

### 0xdbc9bc (0xdbbdbc..0xdbcc85)
      dbc998:	5f                   	pop    rdi
      dbc999:	ba 4f 01 00 00       	mov    edx,0x14f
      dbc99e:	31 c0                	xor    eax,eax
      dbc9a0:	e8 2d 9f a1 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      dbc9a5:	48 89 df             	mov    rdi,rbx
      dbc9a8:	e8 1f 1e ce ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
      dbc9ad:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      dbc9b2:	41 80 be 81 01 00 00 	cmp    BYTE PTR [r14+0x181],0x0
      dbc9b9:	00 
      dbc9ba:	74 26                	je     dbc9e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89a68>
      dbc9bc:	49 8b b6 70 04 00 00 	mov    rsi,QWORD PTR [r14+0x470]
      dbc9c3:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
      dbc9ca:	00 
      dbc9cb:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc9ce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc9d1:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]
      dbc9d7:	48 89 df             	mov    rdi,rbx
      dbc9da:	48 89 de             	mov    rsi,rbx
      dbc9dd:	e8 3a ce cf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      dbc9e2:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      dbc9e9:	00 
      dbc9ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0xdbca43 (0xdbbdbc..0xdbcc85)
      dbca18:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
      dbca1e:	49 8d 9e c8 03 00 00 	lea    rbx,[r14+0x3c8]
      dbca25:	48 89 df             	mov    rdi,rbx
      dbca28:	4c 89 fe             	mov    rsi,r15
      dbca2b:	e8 ec cd cf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      dbca30:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      dbca34:	e8 4d 1a ce ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbca39:	41 80 be 81 01 00 00 	cmp    BYTE PTR [r14+0x181],0x0
      dbca40:	00 
      dbca41:	75 5d                	jne    dbcaa0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89b26>
      dbca43:	49 8b 8e 70 04 00 00 	mov    rcx,QWORD PTR [r14+0x470]
      dbca4a:	48 8d 05 c7 51 69 ff 	lea    rax,[rip+0xffffffffff6951c7]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      dbca51:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
      dbca58:	00 
      dbca59:	48 89 06             	mov    QWORD PTR [rsi],rax
      dbca5c:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      dbca60:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      dbca65:	49 8d be 60 04 00 00 	lea    rdi,[r14+0x460]
      dbca6c:	4c 8d bc 24 d0 01 00 	lea    r15,[rsp+0x1d0]
      dbca73:	00 
      dbca74:	4d 89 37             	mov    QWORD PTR [r15],r14
      dbca77:	48 8d 05 e6 f9 cb ff 	lea    rax,[rip+0xffffffffffcbf9e6]        # a7c464 <JNI_OnUnload@@Base+0x3d31>

### 0xdf7f4f (0xdf78ee..0xdf9239) WRITE
      df7f25:	e8 0c 39 c8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      df7f2a:	4c 89 ef             	mov    rdi,r13
      df7f2d:	48 89 c6             	mov    rsi,rax
      df7f30:	e8 1d 79 98 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
      df7f35:	0f 57 c0             	xorps  xmm0,xmm0
      df7f38:	84 c0                	test   al,al
      df7f3a:	0f 84 19 0a 00 00    	je     df8959 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc59df>
      df7f40:	0f 11 84 24 78 04 00 	movups XMMWORD PTR [rsp+0x478],xmm0
      df7f47:	00 
      df7f48:	48 8d 05 29 ea a7 00 	lea    rax,[rip+0xa7ea29]        # 1876978 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x33060>
      df7f4f:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      df7f56:	00 
      df7f57:	48 89 ac 24 88 04 00 	mov    QWORD PTR [rsp+0x488],rbp
      df7f5e:	00 
      df7f5f:	48 83 a4 24 90 04 00 	and    QWORD PTR [rsp+0x490],0x0
      df7f66:	00 00 
      df7f68:	83 a4 24 98 04 00 00 	and    DWORD PTR [rsp+0x498],0x0
      df7f6f:	00 
      df7f70:	48 8b 84 24 88 02 00 	mov    rax,QWORD PTR [rsp+0x288]
      df7f77:	00 
      df7f78:	a8 01                	test   al,0x1
      df7f7a:	0f 85 26 12 00 00    	jne    df91a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc622c>

### 0xdf7f89 (0xdf78ee..0xdf9239)
      df7f5f:	48 83 a4 24 90 04 00 	and    QWORD PTR [rsp+0x490],0x0
      df7f66:	00 00 
      df7f68:	83 a4 24 98 04 00 00 	and    DWORD PTR [rsp+0x498],0x0
      df7f6f:	00 
      df7f70:	48 8b 84 24 88 02 00 	mov    rax,QWORD PTR [rsp+0x288]
      df7f77:	00 
      df7f78:	a8 01                	test   al,0x1
      df7f7a:	0f 85 26 12 00 00    	jne    df91a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc622c>
      df7f80:	48 85 c0             	test   rax,rax
      df7f83:	0f 84 8c 0c 00 00    	je     df8c15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c9b>
      df7f89:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      df7f90:	00 
      df7f91:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
      df7f98:	00 
      df7f99:	e8 c2 6a 95 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
      df7f9e:	e9 aa 0c 00 00       	jmp    df8c4d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5cd3>
      df7fa3:	4c 8d ac 24 80 02 00 	lea    r13,[rsp+0x280]
      df7faa:	00 
      df7fab:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
      df7fb0:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0
      df7fb5:	48 8d 05 7c 0d ab 00 	lea    rax,[rip+0xab0d7c]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>
      df7fbc:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax

### 0xdf8c32 (0xdf78ee..0xdf9239)
      df8bfe:	e8 0b 1f cb ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      df8c03:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
      df8c0a:	00 
      df8c0b:	e8 fe 1e cb ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      df8c10:	e9 eb fc ff ff       	jmp    df8900 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5986>
      df8c15:	0f 18 0d 64 16 b3 00 	prefetcht0 BYTE PTR [rip+0xb31664]        # 192a280 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x71690>
      df8c1c:	48 8d 3d 5d 16 b3 00 	lea    rdi,[rip+0xb3165d]        # 192a280 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x71690>
      df8c23:	48 8b 05 5e 16 b3 00 	mov    rax,QWORD PTR [rip+0xb3165e]        # 192a288 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x71698>
      df8c2a:	0f 18 08             	prefetcht0 BYTE PTR [rax]
      df8c2d:	e8 b8 5f 95 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
      df8c32:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
      df8c39:	00 
      df8c3a:	48 8d 84 24 80 02 00 	lea    rax,[rsp+0x280]
      df8c41:	00 
      df8c42:	48 89 d7             	mov    rdi,rdx
      df8c45:	48 89 c2             	mov    rdx,rax
      df8c48:	e8 4d 15 94 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
      df8c4d:	6a 40                	push   0x40
      df8c4f:	5f                   	pop    rdi
      df8c50:	e8 ab 52 9f 00       	call   17edf00 <_Znwm@plt>
      df8c55:	49 89 c4             	mov    r12,rax
      df8c58:	0f 57 c0             	xorps  xmm0,xmm0

### 0xdf8c8e (0xdf78ee..0xdf9239)
      df8c6a:	4d 89 e5             	mov    r13,r12
      df8c6d:	49 83 c5 18          	add    r13,0x18
      df8c71:	4c 89 ef             	mov    rdi,r13
      df8c74:	4c 89 fe             	mov    rsi,r15
      df8c77:	e8 10 8e 7e 00       	call   15e1a8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x427010>
      df8c7c:	4c 8d bc 24 58 01 00 	lea    r15,[rsp+0x158]
      df8c83:	00 
      df8c84:	4d 89 2f             	mov    QWORD PTR [r15],r13
      df8c87:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
      df8c8b:	49 8b 06             	mov    rax,QWORD PTR [r14]
      df8c8e:	4c 8d a4 24 70 04 00 	lea    r12,[rsp+0x470]
      df8c95:	00 
      df8c96:	48 89 df             	mov    rdi,rbx
      df8c99:	4c 89 f6             	mov    rsi,r14
      df8c9c:	4c 89 e2             	mov    rdx,r12
      df8c9f:	4c 89 f9             	mov    rcx,r15
      df8ca2:	ff 50 30             	call   QWORD PTR [rax+0x30]
      df8ca5:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      df8ca9:	e8 d8 57 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      df8cae:	4c 89 e7             	mov    rdi,r12
      df8cb1:	e8 2e 0e 00 00       	call   df9ae4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6b6a>
      df8cb6:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]

### 0xe0c8c6 (0xe0c8c6..0xe0c8d4)
      e0c8a8:	49 81 c7 00 fd ff ff 	add    r15,0xfffffffffffffd00
      e0c8af:	4c 89 ff             	mov    rdi,r15
      e0c8b2:	e8 3b 63 fe ff       	call   df2bf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbfc78>
      e0c8b7:	49 39 df             	cmp    r15,rbx
      e0c8ba:	75 ec                	jne    e0c8a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd992e>
      e0c8bc:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
      e0c8c0:	5b                   	pop    rbx
      e0c8c1:	41 5e                	pop    r14
      e0c8c3:	41 5f                	pop    r15
      e0c8c5:	c3                   	ret
      e0c8c6:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
      e0c8cd:	0f 85 95 cb 86 00    	jne    1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
      e0c8d3:	c3                   	ret
      e0c8d4:	53                   	push   rbx
      e0c8d5:	48 89 fb             	mov    rbx,rdi
      e0c8d8:	48 8d 35 09 0b 63 ff 	lea    rsi,[rip+0xffffffffff630b09]        # 43d3e8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2ff4>
      e0c8df:	e8 9a d1 c6 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e0c8e4:	c6 43 68 00          	mov    BYTE PTR [rbx+0x68],0x0
      e0c8e8:	0f 57 c0             	xorps  xmm0,xmm0
      e0c8eb:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
      e0c8ef:	0f 11 43 21          	movups XMMWORD PTR [rbx+0x21],xmm0
      e0c8f3:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0

### 0xe10685 (0xe105b4..0xe107a9) WRITE
      e1065c:	41 89 c4             	mov    r12d,eax
      e1065f:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
      e10663:	41 89 ee             	mov    r14d,ebp
      e10666:	48 8d 35 0f 19 64 ff 	lea    rsi,[rip+0xffffffffff64190f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e1066d:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      e10672:	e8 07 94 c6 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e10677:	31 c0                	xor    eax,eax
      e10679:	4c 8d ac 24 b8 00 00 	lea    r13,[rsp+0xb8]
      e10680:	00 
      e10681:	41 88 45 00          	mov    BYTE PTR [r13+0x0],al
      e10685:	41 88 85 70 04 00 00 	mov    BYTE PTR [r13+0x470],al
      e1068c:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      e10691:	41 88 07             	mov    BYTE PTR [r15],al
      e10694:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al
      e10698:	0f 57 c0             	xorps  xmm0,xmm0
      e1069b:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
      e106a0:	0f 29 45 00          	movaps XMMWORD PTR [rbp+0x0],xmm0
      e106a4:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
      e106a9:	45 0f b6 c6          	movzx  r8d,r14b
      e106ad:	45 0f b6 cc          	movzx  r9d,r12b
      e106b1:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
      e106b6:	48 89 df             	mov    rdi,rbx

### 0xe11eae (0xe11e8c..0xe12505)
      e11e8d:	41 57                	push   r15
      e11e8f:	41 56                	push   r14
      e11e91:	41 55                	push   r13
      e11e93:	41 54                	push   r12
      e11e95:	53                   	push   rbx
      e11e96:	48 81 ec 18 01 00 00 	sub    rsp,0x118
      e11e9d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e11ea4:	00 00 
      e11ea6:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
      e11ead:	00 
      e11eae:	80 be 70 04 00 00 00 	cmp    BYTE PTR [rsi+0x470],0x0
      e11eb5:	74 6f                	je     e11f26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdefac>
      e11eb7:	89 cd                	mov    ebp,ecx
      e11eb9:	49 89 d5             	mov    r13,rdx
      e11ebc:	49 89 f4             	mov    r12,rsi
      e11ebf:	49 89 fe             	mov    r14,rdi
      e11ec2:	48 8d 35 42 66 55 ff 	lea    rsi,[rip+0xffffffffff556642]        # 36850b <_ZTSSt12bad_any_cast@@Base-0x27cbd>
      e11ec9:	4c 89 e7             	mov    rdi,r12
      e11ecc:	e8 a1 08 ce ff       	call   af2772 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f712>
      e11ed1:	84 c0                	test   al,al
      e11ed3:	0f 85 da 00 00 00    	jne    e11fb3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdf039>
      e11ed9:	49 8b b6 60 02 00 00 	mov    rsi,QWORD PTR [r14+0x260]

### 0xe12b20 (0xe12b18..0xe12b51) WRITE
      e12b07:	48 89 fb             	mov    rbx,rdi
      e12b0a:	e8 6d 1d 69 00       	call   14a487c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e9e00>
      e12b0f:	c6 83 e0 02 00 00 01 	mov    BYTE PTR [rbx+0x2e0],0x1
      e12b16:	5b                   	pop    rbx
      e12b17:	c3                   	ret
      e12b18:	41 56                	push   r14
      e12b1a:	53                   	push   rbx
      e12b1b:	50                   	push   rax
      e12b1c:	31 c0                	xor    eax,eax
      e12b1e:	88 07                	mov    BYTE PTR [rdi],al
      e12b20:	88 87 70 04 00 00    	mov    BYTE PTR [rdi+0x470],al
      e12b26:	38 86 70 04 00 00    	cmp    BYTE PTR [rsi+0x470],al
      e12b2c:	74 08                	je     e12b36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfbbc>
      e12b2e:	48 89 fb             	mov    rbx,rdi
      e12b31:	e8 f8 1d 00 00       	call   e1492e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe19b4>
      e12b36:	48 83 c4 08          	add    rsp,0x8
      e12b3a:	5b                   	pop    rbx
      e12b3b:	41 5e                	pop    r14
      e12b3d:	c3                   	ret
      e12b3e:	49 89 c6             	mov    r14,rax
      e12b41:	48 89 df             	mov    rdi,rbx
      e12b44:	e8 7d 9d ff ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>

### 0xe12b26 (0xe12b18..0xe12b51)
      e12b0a:	e8 6d 1d 69 00       	call   14a487c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e9e00>
      e12b0f:	c6 83 e0 02 00 00 01 	mov    BYTE PTR [rbx+0x2e0],0x1
      e12b16:	5b                   	pop    rbx
      e12b17:	c3                   	ret
      e12b18:	41 56                	push   r14
      e12b1a:	53                   	push   rbx
      e12b1b:	50                   	push   rax
      e12b1c:	31 c0                	xor    eax,eax
      e12b1e:	88 07                	mov    BYTE PTR [rdi],al
      e12b20:	88 87 70 04 00 00    	mov    BYTE PTR [rdi+0x470],al
      e12b26:	38 86 70 04 00 00    	cmp    BYTE PTR [rsi+0x470],al
      e12b2c:	74 08                	je     e12b36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfbbc>
      e12b2e:	48 89 fb             	mov    rbx,rdi
      e12b31:	e8 f8 1d 00 00       	call   e1492e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe19b4>
      e12b36:	48 83 c4 08          	add    rsp,0x8
      e12b3a:	5b                   	pop    rbx
      e12b3b:	41 5e                	pop    r14
      e12b3d:	c3                   	ret
      e12b3e:	49 89 c6             	mov    r14,rax
      e12b41:	48 89 df             	mov    rdi,rbx
      e12b44:	e8 7d 9d ff ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>
      e12b49:	4c 89 f7             	mov    rdi,r14

### 0xe12b5b (0xe12b52..0xe12b64) WRITE
      e12b3d:	c3                   	ret
      e12b3e:	49 89 c6             	mov    r14,rax
      e12b41:	48 89 df             	mov    rdi,rbx
      e12b44:	e8 7d 9d ff ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>
      e12b49:	4c 89 f7             	mov    rdi,r14
      e12b4c:	e8 7f d1 c5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      e12b51:	cc                   	int3
      e12b52:	53                   	push   rbx
      e12b53:	48 89 fb             	mov    rbx,rdi
      e12b56:	e8 69 67 86 00       	call   16792c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d430>
      e12b5b:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1
      e12b62:	5b                   	pop    rbx
      e12b63:	c3                   	ret
      e12b64:	53                   	push   rbx
      e12b65:	48 b8 4a 92 24 49 92 	movabs rax,0x24924924924924a
      e12b6c:	24 49 02 
      e12b6f:	48 39 c7             	cmp    rdi,rax
      e12b72:	73 11                	jae    e12b85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfc0b>
      e12b74:	48 89 fb             	mov    rbx,rdi
      e12b77:	48 6b ff 70          	imul   rdi,rdi,0x70
      e12b7b:	e8 80 b3 9d 00       	call   17edf00 <_Znwm@plt>
      e12b80:	48 89 da             	mov    rdx,rbx

### 0xe14937 (0xe1492e..0xe14940) WRITE
      e14913:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      e14917:	e8 14 24 c9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e1491c:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      e14920:	e8 6b 95 9d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e14925:	48 89 df             	mov    rdi,rbx
      e14928:	5b                   	pop    rbx
      e14929:	e9 62 95 9d 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e1492e:	53                   	push   rbx
      e1492f:	48 89 fb             	mov    rbx,rdi
      e14932:	e8 89 4b 86 00       	call   16794c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d62c>
      e14937:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1
      e1493e:	5b                   	pop    rbx
      e1493f:	c3                   	ret
      e14940:	50                   	push   rax
      e14941:	e8 bc 54 9c 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e14946:	58                   	pop    rax
      e14947:	c3                   	ret
      e14948:	48 89 c7             	mov    rdi,rax
      e1494b:	e8 55 51 c6 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e14950:	41 56                	push   r14
      e14952:	53                   	push   rbx
      e14953:	50                   	push   rax

### 0xe30980 (0xe3097c..0xe309a0)
      e30965:	5b                   	pop    rbx
      e30966:	41 5e                	pop    r14
      e30968:	c3                   	ret
      e30969:	48 89 c3             	mov    rbx,rax
      e3096c:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      e3096f:	e8 6c 34 d0 ff       	call   b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      e30974:	48 89 df             	mov    rdi,rbx
      e30977:	e8 54 f3 c3 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      e3097c:	53                   	push   rbx
      e3097d:	48 89 fb             	mov    rbx,rdi
      e30980:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
      e30987:	74 0a                	je     e30993 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfda19>
      e30989:	48 89 df             	mov    rdi,rbx
      e3098c:	e8 53 8a 84 00       	call   16793e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d550>
      e30991:	eb 08                	jmp    e3099b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfda21>
      e30993:	48 89 df             	mov    rdi,rbx
      e30996:	e8 b7 21 fe ff       	call   e12b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfbd8>
      e3099b:	48 89 d8             	mov    rax,rbx
      e3099e:	5b                   	pop    rbx
      e3099f:	c3                   	ret
      e309a0:	41 56                	push   r14
      e309a2:	53                   	push   rbx

### 0xe34359 (0xe34334..0xe34482) WRITE
      e34339:	41 55                	push   r13
      e3433b:	41 54                	push   r12
      e3433d:	53                   	push   rbx
      e3433e:	48 81 ec 78 04 00 00 	sub    rsp,0x478
      e34345:	89 cd                	mov    ebp,ecx
      e34347:	41 89 d4             	mov    r12d,edx
      e3434a:	49 89 f6             	mov    r14,rsi
      e3434d:	48 89 fb             	mov    rbx,rdi
      e34350:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e34357:	00 00 
      e34359:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      e34360:	00 
      e34361:	83 3d 50 56 af 00 06 	cmp    DWORD PTR [rip+0xaf5650],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e34368:	7c 39                	jl     e343a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101429>
      e3436a:	83 fd 02             	cmp    ebp,0x2
      e3436d:	77 0f                	ja     e3437e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101404>
      e3436f:	89 e8                	mov    eax,ebp
      e34371:	48 8d 0d d0 99 9f 00 	lea    rcx,[rip+0x9f99d0]        # 182dd48 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa378>
      e34378:	4c 8b 0c c1          	mov    r9,QWORD PTR [rcx+rax*8]
      e3437c:	eb 07                	jmp    e34385 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10140b>
      e3437e:	4c 8d 0d 93 d8 61 ff 	lea    r9,[rip+0xffffffffff61d893]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e34385:	48 8d 35 26 40 54 ff 	lea    rsi,[rip+0xffffffffff544026]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>

### 0xe34459 (0xe34334..0xe34482)
      e34435:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e34439:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e3443c:	44 89 fe             	mov    esi,r15d
      e3443f:	89 ea                	mov    edx,ebp
      e34441:	ff 10                	call   QWORD PTR [rax]
      e34443:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
      e3444a:	00 
      e3444b:	e8 40 16 fc ff       	call   df5a90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2b16>
      e34450:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e34457:	00 00 
      e34459:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      e34460:	00 
      e34461:	75 12                	jne    e34475 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1014fb>
      e34463:	48 81 c4 78 04 00 00 	add    rsp,0x478
      e3446a:	5b                   	pop    rbx
      e3446b:	41 5c                	pop    r12
      e3446d:	41 5d                	pop    r13
      e3446f:	41 5e                	pop    r14
      e34471:	41 5f                	pop    r15
      e34473:	5d                   	pop    rbp
      e34474:	c3                   	ret
      e34475:	e8 36 b6 9b 00       	call   17efab0 <__stack_chk_fail@plt>

### 0xe34983 (0xe34934..0xe34a57)
      e34957:	49 8b 76 68          	mov    rsi,QWORD PTR [r14+0x68]
      e3495b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e3495e:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
      e34965:	00 
      e34966:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
      e3496c:	80 bb 70 07 00 00 00 	cmp    BYTE PTR [rbx+0x770],0x0
      e34973:	0f 84 87 00 00 00    	je     e34a00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101a86>
      e34979:	80 bc 24 60 04 00 00 	cmp    BYTE PTR [rsp+0x460],0x0
      e34980:	00 
      e34981:	74 7d                	je     e34a00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101a86>
      e34983:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
      e3498a:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
      e34991:	00 
      e34992:	e8 57 ad c6 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      e34997:	84 c0                	test   al,al
      e34999:	74 65                	je     e34a00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101a86>
      e3499b:	83 3d 16 50 af 00 06 	cmp    DWORD PTR [rip+0xaf5016],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      e349a2:	7c 24                	jl     e349c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x101a4e>
      e349a4:	44 8b 83 68 04 00 00 	mov    r8d,DWORD PTR [rbx+0x468]
      e349ab:	48 8d 35 00 3a 54 ff 	lea    rsi,[rip+0xffffffffff543a00]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      e349b2:	48 8d 0d bb 14 52 ff 	lea    rcx,[rip+0xffffffffff5214bb]        # 355e74 <_ZTSSt12bad_any_cast@@Base-0x3a354>
      e349b9:	6a 06                	push   0x6

### 0xe41021 (0xe40bea..0xe41391)
      e40fee:	e8 af 7c fa ff       	call   de8ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5d28>
      e40ff3:	66 0f 6f 83 60 01 00 	movdqa xmm0,XMMWORD PTR [rbx+0x160]
      e40ffa:	00 
      e40ffb:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e41001:	4c 8b bb 70 01 00 00 	mov    r15,QWORD PTR [rbx+0x170]
      e41008:	48 83 a4 24 a0 04 00 	and    QWORD PTR [rsp+0x4a0],0x0
      e4100f:	00 00 
      e41011:	48 83 a4 24 b0 04 00 	and    QWORD PTR [rsp+0x4b0],0x0
      e41018:	00 00 
      e4101a:	48 8d b3 40 02 00 00 	lea    rsi,[rbx+0x240]
      e41021:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      e41028:	00 
      e41029:	e8 62 92 c3 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e4102e:	4c 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],r15
      e41033:	48 8b 83 d8 01 00 00 	mov    rax,QWORD PTR [rbx+0x1d8]
      e4103a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      e4103f:	48 8b 83 c8 02 00 00 	mov    rax,QWORD PTR [rbx+0x2c8]
      e41046:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      e4104b:	48 8b 83 70 03 00 00 	mov    rax,QWORD PTR [rbx+0x370]
      e41052:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e41057:	48 83 a3 70 03 00 00 	and    QWORD PTR [rbx+0x370],0x0
      e4105e:	00 

### 0xe41113 (0xe40bea..0xe41391)
      e410e9:	ba 82 00 00 00       	mov    edx,0x82
      e410ee:	4c 89 e7             	mov    rdi,r12
      e410f1:	e8 da e9 9a 00       	call   17efad0 <memcpy@plt>
      e410f6:	48 8d bc 24 90 05 00 	lea    rdi,[rsp+0x590]
      e410fd:	00 
      e410fe:	48 8d b4 24 a0 04 00 	lea    rsi,[rsp+0x4a0]
      e41105:	00 
      e41106:	e8 33 83 00 00       	call   e4943e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10854>
      e4110b:	4c 8d ac 24 e0 05 00 	lea    r13,[rsp+0x5e0]
      e41112:	00 
      e41113:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
      e4111a:	00 
      e4111b:	4c 89 ef             	mov    rdi,r13
      e4111e:	e8 8d f5 e8 ff       	call   cd06b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d650>
      e41123:	48 8d 05 ce d2 9e 00 	lea    rax,[rip+0x9ed2ce]        # 182e3f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x390>
      e4112a:	49 89 07             	mov    QWORD PTR [r15],rax
      e4112d:	48 8d 05 b4 d2 9e 00 	lea    rax,[rip+0x9ed2b4]        # 182e3e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x380>
      e41134:	48 01 e8             	add    rax,rbp
      e41137:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e4113b:	49 8d 7f 10          	lea    rdi,[r15+0x10]
      e4113f:	ba 9d 00 00 00       	mov    edx,0x9d
      e41144:	4c 89 f6             	mov    rsi,r14

### 0xe41280 (0xe40bea..0xe41391)
      e41257:	00 
      e41258:	e8 53 12 00 00       	call   e424b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x98c6>
      e4125d:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e41262:	e8 a1 7b fa ff       	call   de8e08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5e8e>
      e41267:	48 8b bb 80 01 00 00 	mov    rdi,QWORD PTR [rbx+0x180]
      e4126e:	4c 89 bb 80 01 00 00 	mov    QWORD PTR [rbx+0x180],r15
      e41275:	48 85 ff             	test   rdi,rdi
      e41278:	74 06                	je     e41280 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8696>
      e4127a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e4127d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e41280:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      e41287:	00 
      e41288:	e8 dd 8c c3 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e4128d:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
      e41294:	00 
      e41295:	e8 16 12 00 00       	call   e424b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x98c6>
      e4129a:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e4129f:	e8 64 7b fa ff       	call   de8e08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5e8e>
      e412a4:	48 8b bb 80 01 00 00 	mov    rdi,QWORD PTR [rbx+0x180]
      e412ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e412ae:	ff 50 58             	call   QWORD PTR [rax+0x58]
      e412b1:	84 c0                	test   al,al

### 0xe62927 (0xe62518..0xe62d4f)
      e628fb:	e8 90 b5 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e62900:	eb 0d                	jmp    e6290f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d25>
      e62902:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e62907:	48 89 df             	mov    rdi,rbx
      e6290a:	e8 07 f6 ff ff       	call   e61f16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2932c>
      e6290f:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      e62916:	00 
      e62917:	e8 6c a1 fa ff       	call   e0ca88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9b0e>
      e6291c:	c6 43 3c 01          	mov    BYTE PTR [rbx+0x3c],0x1
      e62920:	48 8d bb 58 04 00 00 	lea    rdi,[rbx+0x458]
      e62927:	ff 93 70 04 00 00    	call   QWORD PTR [rbx+0x470]
      e6292d:	88 83 18 01 00 00    	mov    BYTE PTR [rbx+0x118],al
      e62933:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e6293a:	00 00 
      e6293c:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
      e62943:	00 
      e62944:	0f 85 00 04 00 00    	jne    e62d4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a160>
      e6294a:	48 89 d8             	mov    rax,rbx
      e6294d:	48 81 c4 a8 01 00 00 	add    rsp,0x1a8
      e62954:	5b                   	pop    rbx
      e62955:	41 5c                	pop    r12
      e62957:	41 5d                	pop    r13

### 0xe649a9 (0xe649a9..0xe649d3)
      e64995:	31 ed                	xor    ebp,ebp
      e64997:	eb 03                	jmp    e6499c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdb2>
      e64999:	40 b5 01             	mov    bpl,0x1
      e6499c:	89 e8                	mov    eax,ebp
      e6499e:	48 83 c4 08          	add    rsp,0x8
      e649a2:	5b                   	pop    rbx
      e649a3:	41 5e                	pop    r14
      e649a5:	41 5f                	pop    r15
      e649a7:	5d                   	pop    rbp
      e649a8:	c3                   	ret
      e649a9:	44 8a 87 70 04 00 00 	mov    r8b,BYTE PTR [rdi+0x470]
      e649b0:	45 84 c0             	test   r8b,r8b
      e649b3:	0f 95 c0             	setne  al
      e649b6:	8a 96 70 04 00 00    	mov    dl,BYTE PTR [rsi+0x470]
      e649bc:	84 d2                	test   dl,dl
      e649be:	0f 95 c1             	setne  cl
      e649c1:	45 84 c0             	test   r8b,r8b
      e649c4:	74 08                	je     e649ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bde4>
      e649c6:	84 d2                	test   dl,dl
      e649c8:	0f 85 74 02 00 00    	jne    e64c42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c058>
      e649ce:	30 c8                	xor    al,cl
      e649d0:	34 01                	xor    al,0x1

### 0xe649b6 (0xe649a9..0xe649d3)
      e6499c:	89 e8                	mov    eax,ebp
      e6499e:	48 83 c4 08          	add    rsp,0x8
      e649a2:	5b                   	pop    rbx
      e649a3:	41 5e                	pop    r14
      e649a5:	41 5f                	pop    r15
      e649a7:	5d                   	pop    rbp
      e649a8:	c3                   	ret
      e649a9:	44 8a 87 70 04 00 00 	mov    r8b,BYTE PTR [rdi+0x470]
      e649b0:	45 84 c0             	test   r8b,r8b
      e649b3:	0f 95 c0             	setne  al
      e649b6:	8a 96 70 04 00 00    	mov    dl,BYTE PTR [rsi+0x470]
      e649bc:	84 d2                	test   dl,dl
      e649be:	0f 95 c1             	setne  cl
      e649c1:	45 84 c0             	test   r8b,r8b
      e649c4:	74 08                	je     e649ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bde4>
      e649c6:	84 d2                	test   dl,dl
      e649c8:	0f 85 74 02 00 00    	jne    e64c42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c058>
      e649ce:	30 c8                	xor    al,cl
      e649d0:	34 01                	xor    al,0x1
      e649d2:	c3                   	ret
      e649d3:	44 8a 47 10          	mov    r8b,BYTE PTR [rdi+0x10]
      e649d7:	45 84 c0             	test   r8b,r8b

### 0xe65cde (0xe65cde..0xe65d03)
      e65cb7:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      e65cbb:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      e65cbe:	e9 6c fe ff ff       	jmp    e65b2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf45>
      e65cc3:	48 83 e1 fe          	and    rcx,0xfffffffffffffffe
      e65cc7:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
      e65cca:	e9 ab fe ff ff       	jmp    e65b7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf90>
      e65ccf:	e8 dc 9d 98 00       	call   17efab0 <__stack_chk_fail@plt>
      e65cd4:	eb 00                	jmp    e65cd6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d0ec>
      e65cd6:	48 89 c7             	mov    rdi,rax
      e65cd9:	e8 c7 3d c1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e65cde:	8a 87 70 04 00 00    	mov    al,BYTE PTR [rdi+0x470]
      e65ce4:	3a 86 70 04 00 00    	cmp    al,BYTE PTR [rsi+0x470]
      e65cea:	75 09                	jne    e65cf5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d10b>
      e65cec:	84 c0                	test   al,al
      e65cee:	74 12                	je     e65d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d118>
      e65cf0:	e9 d1 38 81 00       	jmp    16795c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d732>
      e65cf5:	84 c0                	test   al,al
      e65cf7:	0f 85 b3 00 00 00    	jne    e65db0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1c6>
      e65cfd:	e9 2c ec fa ff       	jmp    e1492e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe19b4>
      e65d02:	c3                   	ret
      e65d03:	41 57                	push   r15
      e65d05:	41 56                	push   r14

### 0xe65ce4 (0xe65cde..0xe65d03)
      e65cbb:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      e65cbe:	e9 6c fe ff ff       	jmp    e65b2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf45>
      e65cc3:	48 83 e1 fe          	and    rcx,0xfffffffffffffffe
      e65cc7:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
      e65cca:	e9 ab fe ff ff       	jmp    e65b7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf90>
      e65ccf:	e8 dc 9d 98 00       	call   17efab0 <__stack_chk_fail@plt>
      e65cd4:	eb 00                	jmp    e65cd6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d0ec>
      e65cd6:	48 89 c7             	mov    rdi,rax
      e65cd9:	e8 c7 3d c1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e65cde:	8a 87 70 04 00 00    	mov    al,BYTE PTR [rdi+0x470]
      e65ce4:	3a 86 70 04 00 00    	cmp    al,BYTE PTR [rsi+0x470]
      e65cea:	75 09                	jne    e65cf5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d10b>
      e65cec:	84 c0                	test   al,al
      e65cee:	74 12                	je     e65d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d118>
      e65cf0:	e9 d1 38 81 00       	jmp    16795c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d732>
      e65cf5:	84 c0                	test   al,al
      e65cf7:	0f 85 b3 00 00 00    	jne    e65db0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1c6>
      e65cfd:	e9 2c ec fa ff       	jmp    e1492e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe19b4>
      e65d02:	c3                   	ret
      e65d03:	41 57                	push   r15
      e65d05:	41 56                	push   r14
      e65d07:	53                   	push   rbx

### 0xe65d08 (0xe65d03..0xe65d94)
      e65cec:	84 c0                	test   al,al
      e65cee:	74 12                	je     e65d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d118>
      e65cf0:	e9 d1 38 81 00       	jmp    16795c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d732>
      e65cf5:	84 c0                	test   al,al
      e65cf7:	0f 85 b3 00 00 00    	jne    e65db0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1c6>
      e65cfd:	e9 2c ec fa ff       	jmp    e1492e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe19b4>
      e65d02:	c3                   	ret
      e65d03:	41 57                	push   r15
      e65d05:	41 56                	push   r14
      e65d07:	53                   	push   rbx
      e65d08:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
      e65d0f:	74 64                	je     e65d75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d18b>
      e65d11:	e8 20 5b c1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      e65d16:	48 89 c3             	mov    rbx,rax
      e65d19:	49 89 d6             	mov    r14,rdx
      e65d1c:	48 8d 15 07 65 52 ff 	lea    rdx,[rip+0xffffffffff526507]        # 38c22a <_ZTSSt12bad_any_cast@@Base-0x3f9e>
      e65d23:	6a 08                	push   0x8
      e65d25:	59                   	pop    rcx
      e65d26:	48 89 c7             	mov    rdi,rax
      e65d29:	4c 89 f6             	mov    rsi,r14
      e65d2c:	e8 db cc c8 ff       	call   af2a0c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f9ac>
      e65d31:	84 c0                	test   al,al

### 0xe65db0 (0xe65db0..0xe65dcb)
      e65d8f:	e8 11 3d c1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e65d94:	80 bf 68 09 00 00 00 	cmp    BYTE PTR [rdi+0x968],0x0
      e65d9b:	74 11                	je     e65dae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1c4>
      e65d9d:	53                   	push   rbx
      e65d9e:	48 89 fb             	mov    rbx,rdi
      e65da1:	e8 e8 f8 ff ff       	call   e6568e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2caa4>
      e65da6:	c6 83 68 09 00 00 00 	mov    BYTE PTR [rbx+0x968],0x0
      e65dad:	5b                   	pop    rbx
      e65dae:	c3                   	ret
      e65daf:	cc                   	int3
      e65db0:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
      e65db7:	74 11                	je     e65dca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1e0>
      e65db9:	53                   	push   rbx
      e65dba:	48 89 fb             	mov    rbx,rdi
      e65dbd:	e8 a6 36 81 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
      e65dc2:	c6 83 70 04 00 00 00 	mov    BYTE PTR [rbx+0x470],0x0
      e65dc9:	5b                   	pop    rbx
      e65dca:	c3                   	ret
      e65dcb:	cc                   	int3
      e65dcc:	41 56                	push   r14
      e65dce:	53                   	push   rbx
      e65dcf:	50                   	push   rax

### 0xe65dc2 (0xe65db0..0xe65dcb) WRITE
      e65da1:	e8 e8 f8 ff ff       	call   e6568e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2caa4>
      e65da6:	c6 83 68 09 00 00 00 	mov    BYTE PTR [rbx+0x968],0x0
      e65dad:	5b                   	pop    rbx
      e65dae:	c3                   	ret
      e65daf:	cc                   	int3
      e65db0:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
      e65db7:	74 11                	je     e65dca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1e0>
      e65db9:	53                   	push   rbx
      e65dba:	48 89 fb             	mov    rbx,rdi
      e65dbd:	e8 a6 36 81 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
      e65dc2:	c6 83 70 04 00 00 00 	mov    BYTE PTR [rbx+0x470],0x0
      e65dc9:	5b                   	pop    rbx
      e65dca:	c3                   	ret
      e65dcb:	cc                   	int3
      e65dcc:	41 56                	push   r14
      e65dce:	53                   	push   rbx
      e65dcf:	50                   	push   rax
      e65dd0:	49 89 f6             	mov    r14,rsi
      e65dd3:	48 89 fb             	mov    rbx,rdi
      e65dd6:	e8 57 b9 95 00       	call   17c1732 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17589e>
      e65ddb:	41 8b 46 18          	mov    eax,DWORD PTR [r14+0x18]
      e65ddf:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax

### 0xe65ea2 (0xe65e9e..0xe65eb5) WRITE
      e65e80:	0f 11 8b 51 09 00 00 	movups XMMWORD PTR [rbx+0x951],xmm1
      e65e87:	0f 11 83 48 09 00 00 	movups XMMWORD PTR [rbx+0x948],xmm0
      e65e8e:	c6 83 68 09 00 00 01 	mov    BYTE PTR [rbx+0x968],0x1
      e65e95:	48 83 c4 08          	add    rsp,0x8
      e65e99:	5b                   	pop    rbx
      e65e9a:	41 5e                	pop    r14
      e65e9c:	c3                   	ret
      e65e9d:	cc                   	int3
      e65e9e:	31 c0                	xor    eax,eax
      e65ea0:	88 07                	mov    BYTE PTR [rdi],al
      e65ea2:	88 87 70 04 00 00    	mov    BYTE PTR [rdi+0x470],al
      e65ea8:	38 86 70 04 00 00    	cmp    BYTE PTR [rsi+0x470],al
      e65eae:	0f 85 9e cc fa ff    	jne    e12b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfbd8>
      e65eb4:	c3                   	ret
      e65eb5:	cc                   	int3
      e65eb6:	41 56                	push   r14
      e65eb8:	53                   	push   rbx
      e65eb9:	50                   	push   rax
      e65eba:	48 89 fb             	mov    rbx,rdi
      e65ebd:	48 8d 05 b4 8d 9c 00 	lea    rax,[rip+0x9c8db4]        # 182ec78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc10>
      e65ec4:	48 89 07             	mov    QWORD PTR [rdi],rax
      e65ec7:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]

### 0xe65ea8 (0xe65e9e..0xe65eb5)
      e65e87:	0f 11 83 48 09 00 00 	movups XMMWORD PTR [rbx+0x948],xmm0
      e65e8e:	c6 83 68 09 00 00 01 	mov    BYTE PTR [rbx+0x968],0x1
      e65e95:	48 83 c4 08          	add    rsp,0x8
      e65e99:	5b                   	pop    rbx
      e65e9a:	41 5e                	pop    r14
      e65e9c:	c3                   	ret
      e65e9d:	cc                   	int3
      e65e9e:	31 c0                	xor    eax,eax
      e65ea0:	88 07                	mov    BYTE PTR [rdi],al
      e65ea2:	88 87 70 04 00 00    	mov    BYTE PTR [rdi+0x470],al
      e65ea8:	38 86 70 04 00 00    	cmp    BYTE PTR [rsi+0x470],al
      e65eae:	0f 85 9e cc fa ff    	jne    e12b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfbd8>
      e65eb4:	c3                   	ret
      e65eb5:	cc                   	int3
      e65eb6:	41 56                	push   r14
      e65eb8:	53                   	push   rbx
      e65eb9:	50                   	push   rax
      e65eba:	48 89 fb             	mov    rbx,rdi
      e65ebd:	48 8d 05 b4 8d 9c 00 	lea    rax,[rip+0x9c8db4]        # 182ec78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc10>
      e65ec4:	48 89 07             	mov    QWORD PTR [rdi],rax
      e65ec7:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
      e65ece:	e8 df 85 c3 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>

### 0xe65fe5 (0xe65f44..0xe66088) WRITE
      e65fc0:	00 
      e65fc1:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      e65fc5:	48 85 db             	test   rbx,rbx
      e65fc8:	74 05                	je     e65fcf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d3e5>
      e65fca:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e65fcf:	49 8b bf 80 00 00 00 	mov    rdi,QWORD PTR [r15+0x80]
      e65fd6:	e8 87 44 c1 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      e65fdb:	31 ed                	xor    ebp,ebp
      e65fdd:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
      e65fe2:	41 88 2f             	mov    BYTE PTR [r15],bpl
      e65fe5:	41 88 af 70 04 00 00 	mov    BYTE PTR [r15+0x470],bpl
      e65fec:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      e65ff1:	41 88 2c 24          	mov    BYTE PTR [r12],bpl
      e65ff5:	41 88 6c 24 18       	mov    BYTE PTR [r12+0x18],bpl
      e65ffa:	6a 01                	push   0x1
      e65ffc:	5a                   	pop    rdx
      e65ffd:	4c 89 f7             	mov    rdi,r14
      e66000:	4c 89 fe             	mov    rsi,r15
      e66003:	4c 89 e1             	mov    rcx,r12
      e66006:	49 89 c0             	mov    r8,rax
      e66009:	e8 66 05 00 00       	call   e66574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d98a>
      e6600e:	4c 89 e7             	mov    rdi,r12

### 0xe8d820 (0xe8c65c..0xe8e898)
      e8d7f4:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
      e8d7fb:	00 
      e8d7fc:	4c 89 bc 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r15
      e8d803:	00 
      e8d804:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
      e8d80b:	00 
      e8d80c:	48 8d b4 24 40 03 00 	lea    rsi,[rsp+0x340]
      e8d813:	00 
      e8d814:	e8 27 07 96 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e8d819:	48 8d 35 be 9c 4e ff 	lea    rsi,[rip+0xffffffffff4e9cbe]        # 3774de <_ZTSSt12bad_any_cast@@Base-0x18cea>
      e8d820:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      e8d827:	00 
      e8d828:	e8 51 c2 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e8d82d:	4c 8b ac 24 f8 00 00 	mov    r13,QWORD PTR [rsp+0xf8]
      e8d834:	00 
      e8d835:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
      e8d83a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e8d83d:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
      e8d844:	00 
      e8d845:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
      e8d84c:	00 
      e8d84d:	ff 50 18             	call   QWORD PTR [rax+0x18]

### 0xe8d845 (0xe8c65c..0xe8e898)
      e8d819:	48 8d 35 be 9c 4e ff 	lea    rsi,[rip+0xffffffffff4e9cbe]        # 3774de <_ZTSSt12bad_any_cast@@Base-0x18cea>
      e8d820:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      e8d827:	00 
      e8d828:	e8 51 c2 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e8d82d:	4c 8b ac 24 f8 00 00 	mov    r13,QWORD PTR [rsp+0xf8]
      e8d834:	00 
      e8d835:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
      e8d83a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e8d83d:	48 8d bc 24 a8 03 00 	lea    rdi,[rsp+0x3a8]
      e8d844:	00 
      e8d845:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
      e8d84c:	00 
      e8d84d:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e8d850:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
      e8d855:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e8d858:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
      e8d85f:	00 
      e8d860:	48 89 de             	mov    rsi,rbx
      e8d863:	ff 50 38             	call   QWORD PTR [rax+0x38]
      e8d866:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e8d869:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
      e8d870:	00 

### 0xe8de1d (0xe8c65c..0xe8e898)
      e8ddf1:	e8 90 06 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8ddf6:	48 8b bc 24 58 04 00 	mov    rdi,QWORD PTR [rsp+0x458]
      e8ddfd:	00 
      e8ddfe:	e8 83 06 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8de03:	48 8b bc 24 68 04 00 	mov    rdi,QWORD PTR [rsp+0x468]
      e8de0a:	00 
      e8de0b:	e8 76 06 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8de10:	48 8b bc 24 b0 03 00 	mov    rdi,QWORD PTR [rsp+0x3b0]
      e8de17:	00 
      e8de18:	e8 69 06 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8de1d:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      e8de24:	00 
      e8de25:	e8 66 00 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e8de2a:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
      e8de31:	00 
      e8de32:	e8 59 00 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e8de37:	48 8b bc 24 c8 03 00 	mov    rdi,QWORD PTR [rsp+0x3c8]
      e8de3e:	00 
      e8de3f:	e8 42 06 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8de44:	31 ff                	xor    edi,edi
      e8de46:	e8 3b 06 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8de4b:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]

### 0xe8e5fc (0xe8c65c..0xe8e898)
      e8e5d2:	48 89 c3             	mov    rbx,rax
      e8e5d5:	48 8b bc 24 58 04 00 	mov    rdi,QWORD PTR [rsp+0x458]
      e8e5dc:	00 
      e8e5dd:	e8 a4 fe c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8e5e2:	48 8b bc 24 68 04 00 	mov    rdi,QWORD PTR [rsp+0x468]
      e8e5e9:	00 
      e8e5ea:	e8 97 fe c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8e5ef:	48 8b bc 24 b0 03 00 	mov    rdi,QWORD PTR [rsp+0x3b0]
      e8e5f6:	00 
      e8e5f7:	e8 8a fe c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8e5fc:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
      e8e603:	00 
      e8e604:	e8 87 f8 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e8e609:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
      e8e610:	00 
      e8e611:	e8 7a f8 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e8e616:	4c 89 ff             	mov    rdi,r15
      e8e619:	e8 68 fe c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8e61e:	31 ff                	xor    edi,edi
      e8e620:	e8 61 fe c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8e625:	4c 8b a4 24 98 04 00 	mov    r12,QWORD PTR [rsp+0x498]
      e8e62c:	00 

### 0xe94945 (0xe92f2c..0xe98f3b)
      e9491a:	48 8d 05 d7 f2 9a 00 	lea    rax,[rip+0x9af2d7]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
      e94921:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e94925:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
      e94929:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e9492d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e94932:	49 8d 7e 30          	lea    rdi,[r14+0x30]
      e94936:	48 8d 35 12 37 49 ff 	lea    rsi,[rip+0xffffffffff493712]        # 32804f <_ZTSSt12bad_any_cast@@Base-0x68179>
      e9493d:	6a 0a                	push   0xa
      e9493f:	5a                   	pop    rdx
      e94940:	e8 d5 80 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e94945:	49 8d 8d 70 04 00 00 	lea    rcx,[r13+0x470]
      e9494c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e94950:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      e94955:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e94959:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
      e9495f:	48 85 c0             	test   rax,rax
      e94962:	74 05                	je     e94969 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bd7f>
      e94964:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e94969:	48 89 df             	mov    rdi,rbx
      e9496c:	e8 15 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94971:	31 ff                	xor    edi,edi
      e94973:	e8 a4 9a c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>

### 0xe96505 (0xe92f2c..0xe98f3b)
      e964d8:	00 
      e964d9:	48 8d 0d 00 84 97 00 	lea    rcx,[rip+0x978400]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
      e964f9:	00 
      e964fa:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e964fe:	4d 8b a5 28 04 00 00 	mov    r12,QWORD PTR [r13+0x428]
      e96505:	41 0f 28 85 70 04 00 	movaps xmm0,XMMWORD PTR [r13+0x470]
      e9650c:	00 
      e9650d:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      e96514:	00 
      e96515:	49 8b 9d 78 04 00 00 	mov    rbx,QWORD PTR [r13+0x478]
      e9651c:	48 85 db             	test   rbx,rbx
      e9651f:	74 05                	je     e96526 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d93c>
      e96521:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e96526:	4d 8b bd 90 05 00 00 	mov    r15,QWORD PTR [r13+0x590]
      e9652d:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
      e96534:	00 
      e96535:	74 1e                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>

### 0xec7122 (0xec7114..0xec716f)
      ec7109:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ec710c:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      ec7110:	88 4f 20             	mov    BYTE PTR [rdi+0x20],cl
      ec7113:	c3                   	ret
      ec7114:	41 56                	push   r14
      ec7116:	53                   	push   rbx
      ec7117:	50                   	push   rax
      ec7118:	48 89 f3             	mov    rbx,rsi
      ec711b:	49 89 fe             	mov    r14,rdi
      ec711e:	48 8b 7e 48          	mov    rdi,QWORD PTR [rsi+0x48]
      ec7122:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
      ec7129:	74 0c                	je     ec7137 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e54d>
      ec712b:	49 8b b6 c8 01 00 00 	mov    rsi,QWORD PTR [r14+0x1c8]
      ec7132:	e8 6d 00 00 00       	call   ec71a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e5ba>
      ec7137:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
      ec713b:	49 8b 96 c8 01 00 00 	mov    rdx,QWORD PTR [r14+0x1c8]
      ec7142:	49 8b b6 e0 01 00 00 	mov    rsi,QWORD PTR [r14+0x1e0]
      ec7149:	e8 95 00 00 00       	call   ec71e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e5f9>
      ec714e:	48 83 c3 28          	add    rbx,0x28
      ec7152:	49 8b 96 c8 01 00 00 	mov    rdx,QWORD PTR [r14+0x1c8]
      ec7159:	49 8b b6 d8 01 00 00 	mov    rsi,QWORD PTR [r14+0x1d8]
      ec7160:	48 89 df             	mov    rdi,rbx

### 0xecb738 (0xecb734..0xecb758)
      ecb717:	83 e6 0f             	and    esi,0xf
      ecb71a:	48 69 c6 70 04 00 00 	imul   rax,rsi,0x470
      ecb721:	48 03 04 d1          	add    rax,QWORD PTR [rcx+rdx*8]
      ecb725:	c3                   	ret
      ecb726:	50                   	push   rax
      ecb727:	48 8d 3d 7b ed 4a ff 	lea    rdi,[rip+0xffffffffff4aed7b]        # 37a4a9 <_ZTSSt12bad_any_cast@@Base-0x15d1f>
      ecb72e:	e8 3a a7 be ff       	call   ab5e6d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2e0d>
      ecb733:	cc                   	int3
      ecb734:	53                   	push   rbx
      ecb735:	48 89 fb             	mov    rbx,rdi
      ecb738:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
      ecb73f:	74 0a                	je     ecb74b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92b61>
      ecb741:	48 89 df             	mov    rdi,rbx
      ecb744:	e8 7d de 7a 00       	call   16795c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d732>
      ecb749:	eb 08                	jmp    ecb753 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92b69>
      ecb74b:	48 89 df             	mov    rdi,rbx
      ecb74e:	e8 db 91 f4 ff       	call   e1492e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe19b4>
      ecb753:	48 89 d8             	mov    rax,rbx
      ecb756:	5b                   	pop    rbx
      ecb757:	c3                   	ret
      ecb758:	53                   	push   rbx
      ecb759:	48 89 fb             	mov    rbx,rdi

### 0xef3de0 (0xef3d64..0xef3fd9)
      ef3db2:	49 8d 56 30          	lea    rdx,[r14+0x30]
      ef3db6:	49 8d 4f 30          	lea    rcx,[r15+0x30]
      ef3dba:	4d 8d 46 18          	lea    r8,[r14+0x18]
      ef3dbe:	48 8d 83 a8 03 00 00 	lea    rax,[rbx+0x3a8]
      ef3dc5:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef3dc9:	4c 8d 0d c8 0e 4e ff 	lea    r9,[rip+0xffffffffff4e0ec8]        # 3d4c98 <_ZTSN5boost17bad_function_callE@@Base+0x1fde>
      ef3dd0:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      ef3dd5:	4c 89 ef             	mov    rdi,r13
      ef3dd8:	4c 89 f6             	mov    rsi,r14
      ef3ddb:	e8 23 03 00 00       	call   ef4103 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbb519>
      ef3de0:	41 80 bd 70 04 00 00 	cmp    BYTE PTR [r13+0x470],0x0
      ef3de7:	00 
      ef3de8:	74 0d                	je     ef3df7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbb20d>
      ef3dea:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      ef3def:	48 89 df             	mov    rdi,rbx
      ef3df2:	e8 69 02 00 00       	call   ef4060 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbb476>
      ef3df7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ef3dfc:	e8 c5 8a f1 ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>
      ef3e01:	4d 8d ae 90 00 00 00 	lea    r13,[r14+0x90]
      ef3e08:	48 8d 35 d1 0e 4e ff 	lea    rsi,[rip+0xffffffffff4e0ed1]        # 3d4ce0 <_ZTSN5boost17bad_function_callE@@Base+0x2026>
      ef3e0f:	4c 89 ef             	mov    rdi,r13
      ef3e12:	e8 d7 b8 ba ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>

### 0xef4190 (0xef4103..0xef4ca1) WRITE
      ef416f:	48 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],rbp
      ef4174:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
      ef417b:	00 
      ef417c:	4d 85 ed             	test   r13,r13
      ef417f:	74 1a                	je     ef419b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbb5b1>
      ef4181:	4c 89 ee             	mov    rsi,r13
      ef4184:	e8 b7 9d 8f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ef4189:	eb 18                	jmp    ef41a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbb5b9>
      ef418b:	31 c0                	xor    eax,eax
      ef418d:	88 45 00             	mov    BYTE PTR [rbp+0x0],al
      ef4190:	88 85 70 04 00 00    	mov    BYTE PTR [rbp+0x470],al
      ef4196:	e9 f4 09 00 00       	jmp    ef4b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbbfa5>
      ef419b:	4c 89 e6             	mov    rsi,r12
      ef419e:	e8 32 18 00 00       	call   ef59d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbcdeb>
      ef41a3:	4c 8b bc 24 d0 05 00 	mov    r15,QWORD PTR [rsp+0x5d0]
      ef41aa:	00 
      ef41ab:	4c 89 f3             	mov    rbx,r14
      ef41ae:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ef41b5:	00 
      ef41b6:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
      ef41bb:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
      ef41c0:	4c 89 f9             	mov    rcx,r15

### 0xef551f (0xef54be..0xef567c)
      ef54fc:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef5500:	48 8d ac 24 98 04 00 	lea    rbp,[rsp+0x498]
      ef5507:	00 
      ef5508:	48 89 ef             	mov    rdi,rbp
      ef550b:	48 89 d6             	mov    rsi,rdx
      ef550e:	4c 89 e2             	mov    rdx,r12
      ef5511:	4c 89 c1             	mov    rcx,r8
      ef5514:	4d 89 c8             	mov    r8,r9
      ef5517:	4d 89 e9             	mov    r9,r13
      ef551a:	e8 e4 eb ff ff       	call   ef4103 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbb519>
      ef551f:	80 bd 70 04 00 00 00 	cmp    BYTE PTR [rbp+0x470],0x0
      ef5526:	74 18                	je     ef5540 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbc956>
      ef5528:	48 8d b4 24 b0 04 00 	lea    rsi,[rsp+0x4b0]
      ef552f:	00 
      ef5530:	49 8b be d8 10 00 00 	mov    rdi,QWORD PTR [r14+0x10d8]
      ef5537:	e8 16 df d3 ff       	call   c33452 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1803f2>
      ef553c:	84 c0                	test   al,al
      ef553e:	74 07                	je     ef5547 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbc95d>
      ef5540:	31 ed                	xor    ebp,ebp
      ef5542:	e9 bd 00 00 00       	jmp    ef5604 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbca1a>
      ef5547:	48 8d 35 62 f7 4d ff 	lea    rsi,[rip+0xffffffffff4df762]        # 3d4cb0 <_ZTSN5boost17bad_function_callE@@Base+0x1ff6>
      ef554e:	4c 89 ef             	mov    rdi,r13

### 0xefc47e (0xef91cc..0xefe62b)
      efc44e:	49 83 a5 a5 00 00 00 	and    QWORD PTR [r13+0xa5],0x0
      efc455:	00 
      efc456:	48 8d 35 ff 13 47 ff 	lea    rsi,[rip+0xffffffffff4713ff]        # 36d85c <_ZTSSt12bad_any_cast@@Base-0x2296c>
      efc45d:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efc464:	00 
      efc465:	e8 14 d6 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efc46a:	48 8d 35 36 dc 44 ff 	lea    rsi,[rip+0xffffffffff44dc36]        # 34a0a7 <_ZTSSt12bad_any_cast@@Base-0x46121>
      efc471:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
      efc478:	00 
      efc479:	e8 00 d6 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efc47e:	49 8d bd 70 04 00 00 	lea    rdi,[r13+0x470]
      efc485:	48 8d b4 24 e0 06 00 	lea    rsi,[rsp+0x6e0]
      efc48c:	00 
      efc48d:	48 8d 94 24 20 02 00 	lea    rdx,[rsp+0x220]
      efc494:	00 
      efc495:	e8 14 2e 0e 00       	call   fdf2ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66c4>
      efc49a:	49 8d 5d 20          	lea    rbx,[r13+0x20]
      efc49e:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
      efc4a5:	00 
      efc4a6:	e8 e5 19 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efc4ab:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efc4b2:	00 

### 0xf09c39 (0xf09ba2..0xf09d96)
      f09c0e:	4c 89 fe             	mov    rsi,r15
      f09c11:	e8 46 45 fb ff       	call   ebe15c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85572>
      f09c16:	4c 89 ff             	mov    rdi,r15
      f09c19:	e8 fa 22 f0 ff       	call   e0bf18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd8f9e>
      f09c1e:	48 83 7b 28 00       	cmp    QWORD PTR [rbx+0x28],0x0
      f09c23:	74 6b                	je     f09c90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd10a6>
      f09c25:	49 8d b6 10 09 00 00 	lea    rsi,[r14+0x910]
      f09c2c:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
      f09c31:	4c 89 ff             	mov    rdi,r15
      f09c34:	e8 ad fb 00 00       	call   f197e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0bfc>
      f09c39:	41 80 bf 70 04 00 00 	cmp    BYTE PTR [r15+0x470],0x0
      f09c40:	00 
      f09c41:	74 43                	je     f09c86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd109c>
      f09c43:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      f09c47:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
      f09c4b:	48 89 ca             	mov    rdx,rcx
      f09c4e:	48 c1 ea 04          	shr    rdx,0x4
      f09c52:	83 e1 0f             	and    ecx,0xf
      f09c55:	48 69 f1 70 04 00 00 	imul   rsi,rcx,0x470
      f09c5c:	48 03 34 d0          	add    rsi,QWORD PTR [rax+rdx*8]
      f09c60:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
      f09c65:	4c 89 ff             	mov    rdi,r15

### 0xf09e70 (0xf09d96..0xf0a6d7)
      f09e43:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
      f09e47:	e8 ea 1b 76 00       	call   166ba36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fba2>
      f09e4c:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      f09e53:	00 
      f09e54:	e8 0d 88 bd ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
      f09e59:	49 8d b6 10 09 00 00 	lea    rsi,[r14+0x910]
      f09e60:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
      f09e67:	00 
      f09e68:	4c 89 ff             	mov    rdi,r15
      f09e6b:	e8 76 f9 00 00       	call   f197e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0bfc>
      f09e70:	41 80 bf 70 04 00 00 	cmp    BYTE PTR [r15+0x470],0x0
      f09e77:	00 
      f09e78:	0f 84 7c 05 00 00    	je     f0a3fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1810>
      f09e7e:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]
      f09e81:	41 80 bf 30 09 00 00 	cmp    BYTE PTR [r15+0x930],0x0
      f09e88:	00 
      f09e89:	0f 84 6b 05 00 00    	je     f0a3fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1810>
      f09e8f:	49 81 c7 c0 04 00 00 	add    r15,0x4c0
      f09e96:	49 8b be 00 02 00 00 	mov    rdi,QWORD PTR [r14+0x200]
      f09e9d:	4c 89 fe             	mov    rsi,r15
      f09ea0:	e8 01 f3 ff ff       	call   f091a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd05bc>
      f09ea5:	84 c0                	test   al,al

### 0xf19878 (0xf197e6..0xf198ea) WRITE
      f19855:	48 89 df             	mov    rdi,rbx
      f19858:	4c 89 f6             	mov    rsi,r14
      f1985b:	e8 f2 92 ef ff       	call   e12b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfbd8>
      f19860:	4c 89 f7             	mov    rdi,r14
      f19863:	e8 00 fc 75 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
      f19868:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      f1986d:	e8 0e bb fe ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      f19872:	eb 0a                	jmp    f1987e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0c94>
      f19874:	31 c0                	xor    eax,eax
      f19876:	88 03                	mov    BYTE PTR [rbx],al
      f19878:	88 83 70 04 00 00    	mov    BYTE PTR [rbx+0x470],al
      f1987e:	48 8d bc 24 70 05 00 	lea    rdi,[rsp+0x570]
      f19885:	00 
      f19886:	e8 f5 ba fe ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      f1988b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f19892:	00 00 
      f19894:	48 3b 84 24 68 06 00 	cmp    rax,QWORD PTR [rsp+0x668]
      f1989b:	00 
      f1989c:	75 47                	jne    f198e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0cfb>
      f1989e:	48 81 c4 70 06 00 00 	add    rsp,0x670
      f198a5:	5b                   	pop    rbx
      f198a6:	41 5e                	pop    r14

### 0xf1b867 (0xf1b834..0xf1b9d9)
      f1b83e:	48 89 f3             	mov    rbx,rsi
      f1b841:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f1b848:	00 00 
      f1b84a:	48 89 84 24 c0 04 00 	mov    QWORD PTR [rsp+0x4c0],rax
      f1b851:	00 
      f1b852:	be c0 04 00 00       	mov    esi,0x4c0
      f1b857:	48 03 33             	add    rsi,QWORD PTR [rbx]
      f1b85a:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      f1b85f:	4c 89 f7             	mov    rdi,r14
      f1b862:	e8 b1 72 ef ff       	call   e12b18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfb9e>
      f1b867:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
      f1b86e:	00 
      f1b86f:	0f 84 e6 00 00 00    	je     f1b95b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2d71>
      f1b875:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      f1b87a:	48 8d 35 77 0b 52 ff 	lea    rsi,[rip+0xffffffffff520b77]        # 43c3f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2004>
      f1b881:	e8 e6 fb d3 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      f1b886:	48 85 c0             	test   rax,rax
      f1b889:	0f 84 cc 00 00 00    	je     f1b95b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2d71>
      f1b88f:	49 89 c6             	mov    r14,rax
      f1b892:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      f1b895:	e8 9d 13 00 00       	call   f1cc37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe404d>
      f1b89a:	84 c0                	test   al,al

### 0xf1ba88 (0xf1b9da..0xf1bd5c) WRITE
      f1ba63:	0f 29 84 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm0
      f1ba6a:	00 
      f1ba6b:	41 80 bf 30 09 00 00 	cmp    BYTE PTR [r15+0x930],0x0
      f1ba72:	00 
      f1ba73:	74 59                	je     f1bace <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2ee4>
      f1ba75:	49 81 c7 c0 04 00 00 	add    r15,0x4c0
      f1ba7c:	31 c0                	xor    eax,eax
      f1ba7e:	48 8d 8c 24 18 01 00 	lea    rcx,[rsp+0x118]
      f1ba85:	00 
      f1ba86:	88 01                	mov    BYTE PTR [rcx],al
      f1ba88:	88 81 70 04 00 00    	mov    BYTE PTR [rcx+0x470],al
      f1ba8e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      f1ba95:	00 
      f1ba96:	48 89 de             	mov    rsi,rbx
      f1ba99:	4c 89 fa             	mov    rdx,r15
      f1ba9c:	e8 b9 0c 00 00       	call   f1c75a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3b70>
      f1baa1:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      f1baa8:	00 
      f1baa9:	4c 8d bc 24 80 00 00 	lea    r15,[rsp+0x80]
      f1bab0:	00 
      f1bab1:	4c 89 fe             	mov    rsi,r15
      f1bab4:	e8 43 12 00 00       	call   f1ccfc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4112>

### 0xf1be59 (0xf1bd5c..0xf1c0d6) WRITE
      f1be34:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
      f1be3b:	00 
      f1be3c:	41 80 be 30 09 00 00 	cmp    BYTE PTR [r14+0x930],0x0
      f1be43:	00 
      f1be44:	74 53                	je     f1be99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe32af>
      f1be46:	49 81 c6 c0 04 00 00 	add    r14,0x4c0
      f1be4d:	31 c0                	xor    eax,eax
      f1be4f:	48 8d 8c 24 28 01 00 	lea    rcx,[rsp+0x128]
      f1be56:	00 
      f1be57:	88 01                	mov    BYTE PTR [rcx],al
      f1be59:	88 81 70 04 00 00    	mov    BYTE PTR [rcx+0x470],al
      f1be5f:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      f1be64:	48 89 de             	mov    rsi,rbx
      f1be67:	4c 89 f2             	mov    rdx,r14
      f1be6a:	e8 eb 08 00 00       	call   f1c75a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3b70>
      f1be6f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      f1be76:	00 
      f1be77:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
      f1be7c:	4c 89 f6             	mov    rsi,r14
      f1be7f:	e8 78 0e 00 00       	call   f1ccfc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4112>
      f1be84:	4c 89 f7             	mov    rdi,r14
      f1be87:	e8 22 f7 ff ff       	call   f1b5ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe29c4>

### 0xf1c19d (0xf1c0d6..0xf1c69b) WRITE
      f1c177:	e8 ea dc 7a 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
      f1c17c:	4c 89 ff             	mov    rdi,r15
      f1c17f:	e8 d1 78 fe ff       	call   f03a55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcae6b>
      f1c184:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      f1c189:	48 89 c6             	mov    rsi,rax
      f1c18c:	e8 af 1d 8d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f1c191:	31 c0                	xor    eax,eax
      f1c193:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
      f1c19a:	00 
      f1c19b:	88 01                	mov    BYTE PTR [rcx],al
      f1c19d:	88 81 70 04 00 00    	mov    BYTE PTR [rcx+0x470],al
      f1c1a3:	48 8d bc 24 28 06 00 	lea    rdi,[rsp+0x628]
      f1c1aa:	00 
      f1c1ab:	48 89 de             	mov    rsi,rbx
      f1c1ae:	4c 89 fa             	mov    rdx,r15
      f1c1b1:	e8 a4 05 00 00       	call   f1c75a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3b70>
      f1c1b6:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      f1c1ba:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      f1c1c1:	00 
      f1c1c2:	48 8d 94 24 80 06 00 	lea    rdx,[rsp+0x680]
      f1c1c9:	00 
      f1c1ca:	48 8d 4c 24 08       	lea    rcx,[rsp+0x8]

### 0xf1c7b6 (0xf1c75a..0xf1c925)
      f1c78d:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      f1c791:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      f1c794:	48 83 67 40 00       	and    QWORD PTR [rdi+0x40],0x0
      f1c799:	48 89 d6             	mov    rsi,rdx
      f1c79c:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      f1c7a1:	e8 da 18 8d 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      f1c7a6:	49 83 c4 18          	add    r12,0x18
      f1c7aa:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      f1c7ae:	4c 89 e6             	mov    rsi,r12
      f1c7b1:	e8 ca 18 8d 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      f1c7b6:	41 80 bf 70 04 00 00 	cmp    BYTE PTR [r15+0x470],0x0
      f1c7bd:	00 
      f1c7be:	74 36                	je     f1c7f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3c0c>
      f1c7c0:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      f1c7c5:	4c 89 fe             	mov    rsi,r15
      f1c7c8:	e8 73 17 8d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f1c7cd:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      f1c7d2:	49 83 c7 18          	add    r15,0x18
      f1c7d6:	4c 89 fe             	mov    rsi,r15
      f1c7d9:	e8 62 17 8d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f1c7de:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      f1c7e2:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]

### 0xf1efdf (0xf1efa2..0xf1f1bb)
      f1efb4:	49 89 fe             	mov    r14,rdi
      f1efb7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f1efbe:	00 00 
      f1efc0:	48 89 84 24 98 04 00 	mov    QWORD PTR [rsp+0x498],rax
      f1efc7:	00 
      f1efc8:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
      f1efcb:	48 8d b3 c0 04 00 00 	lea    rsi,[rbx+0x4c0]
      f1efd2:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
      f1efd7:	4c 89 e7             	mov    rdi,r12
      f1efda:	e8 39 3b ef ff       	call   e12b18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfb9e>
      f1efdf:	41 80 bc 24 70 04 00 	cmp    BYTE PTR [r12+0x470],0x0
      f1efe6:	00 00 
      f1efe8:	0f 84 14 01 00 00    	je     f1f102 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe6518>
      f1efee:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      f1eff5:	00 
      f1eff6:	48 8d 35 8b d9 51 ff 	lea    rsi,[rip+0xffffffffff51d98b]        # 43c988 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2594>
      f1effd:	e8 82 b6 f6 ff       	call   e8a684 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51a9a>
      f1f002:	84 c0                	test   al,al
      f1f004:	0f 85 f8 00 00 00    	jne    f1f102 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe6518>
      f1f00a:	49 8b 37             	mov    rsi,QWORD PTR [r15]
      f1f00d:	48 83 c6 08          	add    rsi,0x8
      f1f011:	48 89 e7             	mov    rdi,rsp

### 0xf46126 (0xf46036..0xf461e0)
      f46103:	49 89 e7             	mov    r15,rsp
      f46106:	4c 89 fe             	mov    rsi,r15
      f46109:	e8 0e 37 b7 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      f4610e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      f46112:	e8 6f 83 b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f46117:	6a fe                	push   0xfffffffffffffffe
      f46119:	eb 41                	jmp    f4615c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d572>
      f4611b:	31 db                	xor    ebx,ebx
      f4611d:	e9 90 00 00 00       	jmp    f461b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5c8>
      f46122:	4d 8d 7e 28          	lea    r15,[r14+0x28]
      f46126:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
      f4612d:	00 
      f4612e:	74 10                	je     f46140 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d556>
      f46130:	4c 89 ff             	mov    rdi,r15
      f46133:	e8 a8 00 00 00       	call   f461e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5f6>
      f46138:	41 c6 86 70 04 00 00 	mov    BYTE PTR [r14+0x470],0x0
      f4613f:	00 
      f46140:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      f46145:	4c 89 ff             	mov    rdi,r15
      f46148:	e8 a9 00 00 00       	call   f461f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d60c>
      f4614d:	41 c6 86 70 04 00 00 	mov    BYTE PTR [r14+0x470],0x1
      f46154:	01 

### 0xf46138 (0xf46036..0xf461e0) WRITE
      f46117:	6a fe                	push   0xfffffffffffffffe
      f46119:	eb 41                	jmp    f4615c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d572>
      f4611b:	31 db                	xor    ebx,ebx
      f4611d:	e9 90 00 00 00       	jmp    f461b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5c8>
      f46122:	4d 8d 7e 28          	lea    r15,[r14+0x28]
      f46126:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
      f4612d:	00 
      f4612e:	74 10                	je     f46140 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d556>
      f46130:	4c 89 ff             	mov    rdi,r15
      f46133:	e8 a8 00 00 00       	call   f461e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5f6>
      f46138:	41 c6 86 70 04 00 00 	mov    BYTE PTR [r14+0x470],0x0
      f4613f:	00 
      f46140:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      f46145:	4c 89 ff             	mov    rdi,r15
      f46148:	e8 a9 00 00 00       	call   f461f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d60c>
      f4614d:	41 c6 86 70 04 00 00 	mov    BYTE PTR [r14+0x470],0x1
      f46154:	01 
      f46155:	40 84 ed             	test   bpl,bpl
      f46158:	74 4e                	je     f461a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5be>
      f4615a:	6a ff                	push   0xffffffffffffffff
      f4615c:	58                   	pop    rax
      f4615d:	49 89 06             	mov    QWORD PTR [r14],rax

### 0xf4614d (0xf46036..0xf461e0) WRITE
      f46126:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
      f4612d:	00 
      f4612e:	74 10                	je     f46140 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d556>
      f46130:	4c 89 ff             	mov    rdi,r15
      f46133:	e8 a8 00 00 00       	call   f461e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5f6>
      f46138:	41 c6 86 70 04 00 00 	mov    BYTE PTR [r14+0x470],0x0
      f4613f:	00 
      f46140:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      f46145:	4c 89 ff             	mov    rdi,r15
      f46148:	e8 a9 00 00 00       	call   f461f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d60c>
      f4614d:	41 c6 86 70 04 00 00 	mov    BYTE PTR [r14+0x470],0x1
      f46154:	01 
      f46155:	40 84 ed             	test   bpl,bpl
      f46158:	74 4e                	je     f461a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5be>
      f4615a:	6a ff                	push   0xffffffffffffffff
      f4615c:	58                   	pop    rax
      f4615d:	49 89 06             	mov    QWORD PTR [r14],rax
      f46160:	eb 05                	jmp    f46167 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d57d>
      f46162:	40 84 ed             	test   bpl,bpl
      f46165:	74 41                	je     f461a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5be>
      f46167:	0f 57 c0             	xorps  xmm0,xmm0
      f4616a:	49 89 e7             	mov    r15,rsp

### 0xf4bd36 (0xf4bafe..0xf4c24f) WRITE
      f4bd0c:	0f 57 c0             	xorps  xmm0,xmm0
      f4bd0f:	0f 11 84 24 50 04 00 	movups XMMWORD PTR [rsp+0x450],xmm0
      f4bd16:	00 
      f4bd17:	48 8d 05 32 4a 95 00 	lea    rax,[rip+0x954a32]        # 18a0750 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xd690>
      f4bd1e:	48 89 84 24 48 04 00 	mov    QWORD PTR [rsp+0x448],rax
      f4bd25:	00 
      f4bd26:	4c 89 bc 24 60 04 00 	mov    QWORD PTR [rsp+0x460],r15
      f4bd2d:	00 
      f4bd2e:	4c 89 bc 24 68 04 00 	mov    QWORD PTR [rsp+0x468],r15
      f4bd35:	00 
      f4bd36:	4c 89 bc 24 70 04 00 	mov    QWORD PTR [rsp+0x470],r15
      f4bd3d:	00 
      f4bd3e:	41 0f 11 44 24 18    	movups XMMWORD PTR [r12+0x18],xmm0
      f4bd44:	66 41 83 64 24 28 00 	and    WORD PTR [r12+0x28],0x0
      f4bd4b:	48 89 ef             	mov    rdi,rbp
      f4bd4e:	4c 89 f6             	mov    rsi,r14
      f4bd51:	e8 ea 21 8a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f4bd56:	80 8c 24 58 04 00 00 	or     BYTE PTR [rsp+0x458],0x1
      f4bd5d:	01 
      f4bd5e:	48 8b 94 24 50 04 00 	mov    rdx,QWORD PTR [rsp+0x450]
      f4bd65:	00 
      f4bd66:	f6 c2 01             	test   dl,0x1

### 0xf4bebb (0xf4bafe..0xf4c24f) WRITE
      f4be91:	0f 57 c0             	xorps  xmm0,xmm0
      f4be94:	0f 11 84 24 50 04 00 	movups XMMWORD PTR [rsp+0x450],xmm0
      f4be9b:	00 
      f4be9c:	48 8d 05 ad 48 95 00 	lea    rax,[rip+0x9548ad]        # 18a0750 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xd690>
      f4bea3:	48 89 84 24 48 04 00 	mov    QWORD PTR [rsp+0x448],rax
      f4beaa:	00 
      f4beab:	48 89 9c 24 60 04 00 	mov    QWORD PTR [rsp+0x460],rbx
      f4beb2:	00 
      f4beb3:	48 89 9c 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rbx
      f4beba:	00 
      f4bebb:	48 89 9c 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rbx
      f4bec2:	00 
      f4bec3:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
      f4bec8:	66 41 83 66 28 00    	and    WORD PTR [r14+0x28],0x0
      f4bece:	48 89 ef             	mov    rdi,rbp
      f4bed1:	4c 89 ee             	mov    rsi,r13
      f4bed4:	e8 67 20 8a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f4bed9:	80 8c 24 58 04 00 00 	or     BYTE PTR [rsp+0x458],0x1
      f4bee0:	01 
      f4bee1:	48 8b 94 24 50 04 00 	mov    rdx,QWORD PTR [rsp+0x450]
      f4bee8:	00 
      f4bee9:	f6 c2 01             	test   dl,0x1

### 0xf4c06c (0xf4bafe..0xf4c24f) WRITE
      f4c042:	0f 57 c0             	xorps  xmm0,xmm0
      f4c045:	0f 11 84 24 50 04 00 	movups XMMWORD PTR [rsp+0x450],xmm0
      f4c04c:	00 
      f4c04d:	48 8d 05 fc 46 95 00 	lea    rax,[rip+0x9546fc]        # 18a0750 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xd690>
      f4c054:	48 89 84 24 48 04 00 	mov    QWORD PTR [rsp+0x448],rax
      f4c05b:	00 
      f4c05c:	48 89 9c 24 60 04 00 	mov    QWORD PTR [rsp+0x460],rbx
      f4c063:	00 
      f4c064:	48 89 9c 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rbx
      f4c06b:	00 
      f4c06c:	48 89 9c 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rbx
      f4c073:	00 
      f4c074:	4c 8d ac 24 60 04 00 	lea    r13,[rsp+0x460]
      f4c07b:	00 
      f4c07c:	41 0f 11 45 18       	movups XMMWORD PTR [r13+0x18],xmm0
      f4c081:	66 41 83 65 28 00    	and    WORD PTR [r13+0x28],0x0
      f4c087:	4c 89 f7             	mov    rdi,r14
      f4c08a:	e8 b1 1e 8a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f4c08f:	80 8c 24 58 04 00 00 	or     BYTE PTR [rsp+0x458],0x1
      f4c096:	01 
      f4c097:	48 8b 94 24 50 04 00 	mov    rdx,QWORD PTR [rsp+0x450]
      f4c09e:	00 

### 0xf8c451 (0xf8c22c..0xf8c5b1)
      f8c41a:	e8 a5 b7 f8 ff       	call   f17bc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdefda>
      f8c41f:	4c 8d ab 10 04 00 00 	lea    r13,[rbx+0x410]
      f8c426:	49 8d b6 f0 03 00 00 	lea    rsi,[r14+0x3f0]
      f8c42d:	4c 89 ef             	mov    rdi,r13
      f8c430:	e8 79 03 00 00       	call   f8c7ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x153bc4>
      f8c435:	41 8a 86 4a 04 00 00 	mov    al,BYTE PTR [r14+0x44a]
      f8c43c:	88 83 6a 04 00 00    	mov    BYTE PTR [rbx+0x46a],al
      f8c442:	41 0f b7 86 48 04 00 	movzx  eax,WORD PTR [r14+0x448]
      f8c449:	00 
      f8c44a:	66 89 83 68 04 00 00 	mov    WORD PTR [rbx+0x468],ax
      f8c451:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
      f8c458:	49 8d b6 50 04 00 00 	lea    rsi,[r14+0x450]
      f8c45f:	e8 0a 28 fc ff       	call   f4ec6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x116084>
      f8c464:	41 0f 10 86 78 04 00 	movups xmm0,XMMWORD PTR [r14+0x478]
      f8c46b:	00 
      f8c46c:	41 0f 10 8e 87 04 00 	movups xmm1,XMMWORD PTR [r14+0x487]
      f8c473:	00 
      f8c474:	0f 11 8b a7 04 00 00 	movups XMMWORD PTR [rbx+0x4a7],xmm1
      f8c47b:	0f 11 83 98 04 00 00 	movups XMMWORD PTR [rbx+0x498],xmm0
      f8c482:	48 8d ab c0 04 00 00 	lea    rbp,[rbx+0x4c0]
      f8c489:	49 8d b6 a0 04 00 00 	lea    rsi,[r14+0x4a0]
      f8c490:	48 89 ef             	mov    rdi,rbp

### 0xfc5e20 (0xfc5e06..0xfc5fba) WRITE
      fc5e00:	5b                   	pop    rbx
      fc5e01:	e9 1a 81 82 00       	jmp    17edf20 <_ZdlPv@plt>
      fc5e06:	41 57                	push   r15
      fc5e08:	41 56                	push   r14
      fc5e0a:	41 54                	push   r12
      fc5e0c:	53                   	push   rbx
      fc5e0d:	48 81 ec 78 04 00 00 	sub    rsp,0x478
      fc5e14:	49 89 fe             	mov    r14,rdi
      fc5e17:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fc5e1e:	00 00 
      fc5e20:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      fc5e27:	00 
      fc5e28:	48 89 f7             	mov    rdi,rsi
      fc5e2b:	e8 f0 50 f7 ff       	call   f3af20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102336>
      fc5e30:	48 89 c3             	mov    rbx,rax
      fc5e33:	41 80 be 30 03 00 00 	cmp    BYTE PTR [r14+0x330],0x0
      fc5e3a:	00 
      fc5e3b:	74 1a                	je     fc5e57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18d26d>
      fc5e3d:	4d 8d be 70 02 00 00 	lea    r15,[r14+0x270]
      fc5e44:	48 89 df             	mov    rdi,rbx
      fc5e47:	e8 66 be f8 ff       	call   f51cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1190c8>
      fc5e4c:	4c 89 ff             	mov    rdi,r15

### 0xfc5f62 (0xfc5e06..0xfc5fba)
      fc5f3a:	e8 f7 4f f7 ff       	call   f3af36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10234c>
      fc5f3f:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      fc5f44:	6a 01                	push   0x1
      fc5f46:	5e                   	pop    rsi
      fc5f47:	48 89 c2             	mov    rdx,rax
      fc5f4a:	e8 31 58 59 00       	call   155b780 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a0d04>
      fc5f4f:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      fc5f54:	e8 37 a4 70 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
      fc5f59:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fc5f60:	00 00 
      fc5f62:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      fc5f69:	00 
      fc5f6a:	75 49                	jne    fc5fb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18d3cb>
      fc5f6c:	48 81 c4 78 04 00 00 	add    rsp,0x478
      fc5f73:	5b                   	pop    rbx
      fc5f74:	41 5c                	pop    r12
      fc5f76:	41 5e                	pop    r14
      fc5f78:	41 5f                	pop    r15
      fc5f7a:	c3                   	ret
      fc5f7b:	48 89 c3             	mov    rbx,rax
      fc5f7e:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      fc5f85:	00 

### 0xfc5fa3 (0xfc5e06..0xfc5fba)
      fc5f7b:	48 89 c3             	mov    rbx,rax
      fc5f7e:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      fc5f85:	00 
      fc5f86:	e8 a7 6c f7 ff       	call   f3cc32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104048>
      fc5f8b:	eb 0d                	jmp    fc5f9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18d3b0>
      fc5f8d:	48 89 c3             	mov    rbx,rax
      fc5f90:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      fc5f95:	e8 f6 a3 70 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
      fc5f9a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fc5fa1:	00 00 
      fc5fa3:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      fc5faa:	00 
      fc5fab:	75 08                	jne    fc5fb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18d3cb>
      fc5fad:	48 89 df             	mov    rdi,rbx
      fc5fb0:	e8 1b 9d aa ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      fc5fb5:	e8 f6 9a 82 00       	call   17efab0 <__stack_chk_fail@plt>
      fc5fba:	55                   	push   rbp
      fc5fbb:	41 57                	push   r15
      fc5fbd:	41 56                	push   r14
      fc5fbf:	41 55                	push   r13
      fc5fc1:	41 54                	push   r12
      fc5fc3:	53                   	push   rbx

### 0xfe0ebf (0xfe0a6a..0xfe0f30)
      fe0e9c:	40 84 ed             	test   bpl,bpl
      fe0e9f:	75 14                	jne    fe0eb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a82cb>
      fe0ea1:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      fe0ea5:	48 89 de             	mov    rsi,rbx
      fe0ea8:	48 8d 94 24 68 04 00 	lea    rdx,[rsp+0x468]
      fe0eaf:	00 
      fe0eb0:	e8 29 f2 ff ff       	call   fe00de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a74f4>
      fe0eb5:	80 bc 24 78 04 00 00 	cmp    BYTE PTR [rsp+0x478],0x0
      fe0ebc:	00 
      fe0ebd:	74 0d                	je     fe0ecc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a82e2>
      fe0ebf:	48 8b bc 24 70 04 00 	mov    rdi,QWORD PTR [rsp+0x470]
      fe0ec6:	00 
      fe0ec7:	e8 ba d5 ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fe0ecc:	80 bc 24 98 04 00 00 	cmp    BYTE PTR [rsp+0x498],0x0
      fe0ed3:	00 
      fe0ed4:	0f 85 05 fc ff ff    	jne    fe0adf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7ef5>
      fe0eda:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
      fe0ee1:	00 
      fe0ee2:	e8 a3 00 00 00       	call   fe0f8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a83a0>
      fe0ee7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fe0eee:	00 00 
      fe0ef0:	48 3b 84 24 d0 04 00 	cmp    rax,QWORD PTR [rsp+0x4d0]

### 0xff7b35 (0xff7b1e..0xff7bdd) WRITE
      ff7b17:	c3                   	ret
      ff7b18:	e8 93 7f 7f 00       	call   17efab0 <__stack_chk_fail@plt>
      ff7b1d:	cc                   	int3
      ff7b1e:	41 57                	push   r15
      ff7b20:	41 56                	push   r14
      ff7b22:	41 54                	push   r12
      ff7b24:	53                   	push   rbx
      ff7b25:	48 81 ec 78 04 00 00 	sub    rsp,0x478
      ff7b2c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff7b33:	00 00 
      ff7b35:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      ff7b3c:	00 
      ff7b3d:	80 bf c8 21 00 00 00 	cmp    BYTE PTR [rdi+0x21c8],0x0
      ff7b44:	74 4a                	je     ff7b90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1befa6>
      ff7b46:	48 89 d3             	mov    rbx,rdx
      ff7b49:	49 89 f7             	mov    r15,rsi
      ff7b4c:	49 89 fe             	mov    r14,rdi
      ff7b4f:	4c 8d a7 58 1d 00 00 	lea    r12,[rdi+0x1d58]
      ff7b56:	48 89 e7             	mov    rdi,rsp
      ff7b59:	4c 89 e6             	mov    rsi,r12
      ff7b5c:	e8 63 17 68 00       	call   16792c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d430>
      ff7b61:	4c 89 e7             	mov    rdi,r12

### 0xff7b99 (0xff7b1e..0xff7bdd)
      ff7b75:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
      ff7b78:	48 8b 44 01 ff       	mov    rax,QWORD PTR [rcx+rax*1-0x1]
      ff7b7d:	48 89 e6             	mov    rsi,rsp
      ff7b80:	4c 89 f7             	mov    rdi,r14
      ff7b83:	48 89 da             	mov    rdx,rbx
      ff7b86:	ff d0                	call   rax
      ff7b88:	48 89 e7             	mov    rdi,rsp
      ff7b8b:	e8 d8 18 68 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
      ff7b90:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff7b97:	00 00 
      ff7b99:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      ff7ba0:	00 
      ff7ba1:	75 35                	jne    ff7bd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1befee>
      ff7ba3:	48 81 c4 78 04 00 00 	add    rsp,0x478
      ff7baa:	5b                   	pop    rbx
      ff7bab:	41 5c                	pop    r12
      ff7bad:	41 5e                	pop    r14
      ff7baf:	41 5f                	pop    r15
      ff7bb1:	c3                   	ret
      ff7bb2:	48 89 c3             	mov    rbx,rax
      ff7bb5:	48 89 e7             	mov    rdi,rsp
      ff7bb8:	e8 ab 18 68 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>

### 0xff7bc6 (0xff7b1e..0xff7bdd)
      ff7baa:	5b                   	pop    rbx
      ff7bab:	41 5c                	pop    r12
      ff7bad:	41 5e                	pop    r14
      ff7baf:	41 5f                	pop    r15
      ff7bb1:	c3                   	ret
      ff7bb2:	48 89 c3             	mov    rbx,rax
      ff7bb5:	48 89 e7             	mov    rdi,rsp
      ff7bb8:	e8 ab 18 68 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
      ff7bbd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff7bc4:	00 00 
      ff7bc6:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
      ff7bcd:	00 
      ff7bce:	75 08                	jne    ff7bd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1befee>
      ff7bd0:	48 89 df             	mov    rdi,rbx
      ff7bd3:	e8 f8 80 a7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ff7bd8:	e8 d3 7e 7f 00       	call   17efab0 <__stack_chk_fail@plt>
      ff7bdd:	cc                   	int3
      ff7bde:	41 56                	push   r14
      ff7be0:	53                   	push   rbx
      ff7be1:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
      ff7be8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff7bef:	00 00 

### 0xffca9b (0xffc99e..0xffcfcd)
      ffca73:	74 0f                	je     ffca84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3e9a>
      ffca75:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      ffca7a:	4c 89 e7             	mov    rdi,r12
      ffca7d:	e8 88 df 67 00       	call   167aa0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eb76>
      ffca82:	eb 0d                	jmp    ffca91 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3ea7>
      ffca84:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      ffca89:	4c 89 e7             	mov    rdi,r12
      ffca8c:	e8 63 21 00 00       	call   ffebf4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c600a>
      ffca91:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ffca96:	e8 d7 df 67 00       	call   167aa72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ebde>
      ffca9b:	49 8d bc 24 70 04 00 	lea    rdi,[r12+0x470]
      ffcaa2:	00 
      ffcaa3:	48 89 de             	mov    rsi,rbx
      ffcaa6:	e8 b3 b8 67 00       	call   167835e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c4ca>
      ffcaab:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      ffcaaf:	4c 89 ef             	mov    rdi,r13
      ffcab2:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      ffcab8:	49 8d bc 24 30 05 00 	lea    rdi,[r12+0x530]
      ffcabf:	00 
      ffcac0:	48 89 c6             	mov    rsi,rax
      ffcac3:	e8 b8 15 7f 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      ffcac8:	49 8d b5 d8 22 00 00 	lea    rsi,[r13+0x22d8]

### 0xffeb94 (0xffeb88..0xffebf3)
      ffeb7d:	5b                   	pop    rbx
      ffeb7e:	41 5e                	pop    r14
      ffeb80:	41 5f                	pop    r15
      ffeb82:	c3                   	ret
      ffeb83:	e8 28 0f 7f 00       	call   17efab0 <__stack_chk_fail@plt>
      ffeb88:	55                   	push   rbp
      ffeb89:	41 56                	push   r14
      ffeb8b:	53                   	push   rbx
      ffeb8c:	48 89 fb             	mov    rbx,rdi
      ffeb8f:	e8 2c a9 67 00       	call   16794c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d62c>
      ffeb94:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
      ffeb9b:	4c 8d b3 08 05 00 00 	lea    r14,[rbx+0x508]
      ffeba2:	0f 57 c0             	xorps  xmm0,xmm0
      ffeba5:	0f 11 83 08 05 00 00 	movups XMMWORD PTR [rbx+0x508],xmm0
      ffebac:	31 ed                	xor    ebp,ebp
      ffebae:	ba 90 00 00 00       	mov    edx,0x90
      ffebb3:	31 f6                	xor    esi,esi
      ffebb5:	e8 d6 ff 7e 00       	call   17eeb90 <memset@plt>
      ffebba:	4c 89 b3 00 05 00 00 	mov    QWORD PTR [rbx+0x500],r14
      ffebc1:	40 88 ab 68 05 00 00 	mov    BYTE PTR [rbx+0x568],bpl
      ffebc8:	0f 57 c0             	xorps  xmm0,xmm0
      ffebcb:	0f 11 83 18 05 00 00 	movups XMMWORD PTR [rbx+0x518],xmm0

### 0x1040c1f (0x10409b6..0x1040cd6) WRITE
     1040bf6:	e8 ed 9b 79 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1040bfb:	4c 89 f7             	mov    rdi,r14
     1040bfe:	4c 89 ee             	mov    rsi,r13
     1040c01:	e8 38 8e 79 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     1040c06:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     1040c0a:	e8 77 d8 a5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1040c0f:	4c 89 ff             	mov    rdi,r15
     1040c12:	e8 d1 9b 79 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1040c17:	31 c0                	xor    eax,eax
     1040c19:	88 83 50 04 00 00    	mov    BYTE PTR [rbx+0x450],al
     1040c1f:	88 83 70 04 00 00    	mov    BYTE PTR [rbx+0x470],al
     1040c25:	0f 57 c0             	xorps  xmm0,xmm0
     1040c28:	0f 11 83 78 04 00 00 	movups XMMWORD PTR [rbx+0x478],xmm0
     1040c2f:	0f 11 83 88 04 00 00 	movups XMMWORD PTR [rbx+0x488],xmm0
     1040c36:	c7 83 98 04 00 00 00 	mov    DWORD PTR [rbx+0x498],0x3f800000
     1040c3d:	00 80 3f 
     1040c40:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1040c47:	00 00 
     1040c49:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
     1040c50:	00 
     1040c51:	75 7e                	jne    1040cd1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2080e7>
     1040c53:	48 81 c4 b8 00 00 00 	add    rsp,0xb8

### 0x1040d10 (0x1040cd6..0x1040ed3)
     1040cdf:	48 89 fb             	mov    rbx,rdi
     1040ce2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1040ce9:	00 00 
     1040ceb:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1040cf0:	0f b6 97 c8 01 00 00 	movzx  edx,BYTE PTR [rdi+0x1c8]
     1040cf7:	0f b6 8f c9 01 00 00 	movzx  ecx,BYTE PTR [rdi+0x1c9]
     1040cfe:	49 89 e7             	mov    r15,rsp
     1040d01:	4c 89 ff             	mov    rdi,r15
     1040d04:	e8 41 03 00 00       	call   104104a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208460>
     1040d09:	4c 8d b3 50 04 00 00 	lea    r14,[rbx+0x450]
     1040d10:	8a 83 70 04 00 00    	mov    al,BYTE PTR [rbx+0x470]
     1040d16:	41 3a 47 20          	cmp    al,BYTE PTR [r15+0x20]
     1040d1a:	75 1e                	jne    1040d3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208150>
     1040d1c:	84 c0                	test   al,al
     1040d1e:	74 5e                	je     1040d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208194>
     1040d20:	49 89 e7             	mov    r15,rsp
     1040d23:	4c 89 f7             	mov    rdi,r14
     1040d26:	4c 89 fe             	mov    rsi,r15
     1040d29:	e8 00 ad a3 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1040d2e:	41 8b 47 18          	mov    eax,DWORD PTR [r15+0x18]
     1040d32:	89 83 68 04 00 00    	mov    DWORD PTR [rbx+0x468],eax
     1040d38:	eb 44                	jmp    1040d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208194>

### 0x1040d46 (0x1040cd6..0x1040ed3) WRITE
     1040d23:	4c 89 f7             	mov    rdi,r14
     1040d26:	4c 89 fe             	mov    rsi,r15
     1040d29:	e8 00 ad a3 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1040d2e:	41 8b 47 18          	mov    eax,DWORD PTR [r15+0x18]
     1040d32:	89 83 68 04 00 00    	mov    DWORD PTR [rbx+0x468],eax
     1040d38:	eb 44                	jmp    1040d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208194>
     1040d3a:	84 c0                	test   al,al
     1040d3c:	74 11                	je     1040d4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208165>
     1040d3e:	4c 89 f7             	mov    rdi,r14
     1040d41:	e8 4a d1 7a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1040d46:	c6 83 70 04 00 00 00 	mov    BYTE PTR [rbx+0x470],0x0
     1040d4d:	eb 2f                	jmp    1040d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208194>
     1040d4f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1040d54:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1040d58:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
     1040d5c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1040d60:	0f 57 c0             	xorps  xmm0,xmm0
     1040d63:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     1040d69:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     1040d6d:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
     1040d71:	89 83 68 04 00 00    	mov    DWORD PTR [rbx+0x468],eax
     1040d77:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1

### 0x1040d77 (0x1040cd6..0x1040ed3) WRITE
     1040d4d:	eb 2f                	jmp    1040d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208194>
     1040d4f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1040d54:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1040d58:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
     1040d5c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1040d60:	0f 57 c0             	xorps  xmm0,xmm0
     1040d63:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     1040d69:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     1040d6d:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
     1040d71:	89 83 68 04 00 00    	mov    DWORD PTR [rbx+0x468],eax
     1040d77:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1
     1040d7e:	48 89 e7             	mov    rdi,rsp
     1040d81:	e8 74 41 b1 ff       	call   b54efa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1e9a>
     1040d86:	48 8d bb 78 04 00 00 	lea    rdi,[rbx+0x478]
     1040d8d:	e8 b4 7c c6 ff       	call   ca8a46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f59e6>
     1040d92:	80 bb 70 04 00 00 00 	cmp    BYTE PTR [rbx+0x470],0x0
     1040d99:	0f 84 d2 00 00 00    	je     1040e71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208287>
     1040d9f:	83 bb 68 04 00 00 00 	cmp    DWORD PTR [rbx+0x468],0x0
     1040da6:	74 4b                	je     1040df3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208209>
     1040da8:	8b 83 cc 01 00 00    	mov    eax,DWORD PTR [rbx+0x1cc]
     1040dae:	83 f8 02             	cmp    eax,0x2
     1040db1:	74 77                	je     1040e2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208240>

### 0x1040d92 (0x1040cd6..0x1040ed3)
     1040d60:	0f 57 c0             	xorps  xmm0,xmm0
     1040d63:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     1040d69:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     1040d6d:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
     1040d71:	89 83 68 04 00 00    	mov    DWORD PTR [rbx+0x468],eax
     1040d77:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1
     1040d7e:	48 89 e7             	mov    rdi,rsp
     1040d81:	e8 74 41 b1 ff       	call   b54efa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1e9a>
     1040d86:	48 8d bb 78 04 00 00 	lea    rdi,[rbx+0x478]
     1040d8d:	e8 b4 7c c6 ff       	call   ca8a46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f59e6>
     1040d92:	80 bb 70 04 00 00 00 	cmp    BYTE PTR [rbx+0x470],0x0
     1040d99:	0f 84 d2 00 00 00    	je     1040e71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208287>
     1040d9f:	83 bb 68 04 00 00 00 	cmp    DWORD PTR [rbx+0x468],0x0
     1040da6:	74 4b                	je     1040df3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208209>
     1040da8:	8b 83 cc 01 00 00    	mov    eax,DWORD PTR [rbx+0x1cc]
     1040dae:	83 f8 02             	cmp    eax,0x2
     1040db1:	74 77                	je     1040e2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208240>
     1040db3:	83 f8 01             	cmp    eax,0x1
     1040db6:	0f 85 b5 00 00 00    	jne    1040e71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208287>
     1040dbc:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1040dc1:	4c 89 f6             	mov    rsi,r14
     1040dc4:	e8 77 d1 7a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>

### 0x10431ce (0x10431ac..0x10437c5)
     10431ad:	41 57                	push   r15
     10431af:	41 56                	push   r14
     10431b1:	41 55                	push   r13
     10431b3:	41 54                	push   r12
     10431b5:	53                   	push   rbx
     10431b6:	48 81 ec 58 01 00 00 	sub    rsp,0x158
     10431bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10431c4:	00 00 
     10431c6:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
     10431cd:	00 
     10431ce:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10431d5:	0f 84 ff 04 00 00    	je     10436da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20aaf0>
     10431db:	48 89 f3             	mov    rbx,rsi
     10431de:	49 89 fe             	mov    r14,rdi
     10431e1:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
     10431e4:	80 bf 30 09 00 00 00 	cmp    BYTE PTR [rdi+0x930],0x0
     10431eb:	0f 84 e9 04 00 00    	je     10436da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20aaf0>
     10431f1:	4d 8d be 50 04 00 00 	lea    r15,[r14+0x450]
     10431f8:	41 83 be 68 04 00 00 	cmp    DWORD PTR [r14+0x468],0x0
     10431ff:	00 
     1043200:	74 4e                	je     1043250 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20a666>
     1043202:	41 8b 86 cc 01 00 00 	mov    eax,DWORD PTR [r14+0x1cc]

### 0x1044cf8 (0x1044792..0x10455e3)
     1044ccb:	48 8d bc 24 d0 06 00 	lea    rdi,[rsp+0x6d0]
     1044cd2:	00 
     1044cd3:	88 87 48 04 00 00    	mov    BYTE PTR [rdi+0x448],al
     1044cd9:	0f 57 c0             	xorps  xmm0,xmm0
     1044cdc:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     1044cdf:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     1044ce3:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
     1044ce7:	88 47 30             	mov    BYTE PTR [rdi+0x30],al
     1044cea:	0f 11 87 50 04 00 00 	movups XMMWORD PTR [rdi+0x450],xmm0
     1044cf1:	0f 11 87 60 04 00 00 	movups XMMWORD PTR [rdi+0x460],xmm0
     1044cf8:	0f 11 87 70 04 00 00 	movups XMMWORD PTR [rdi+0x470],xmm0
     1044cff:	0f 11 87 80 04 00 00 	movups XMMWORD PTR [rdi+0x480],xmm0
     1044d06:	0f 11 87 90 04 00 00 	movups XMMWORD PTR [rdi+0x490],xmm0
     1044d0d:	0f 11 87 a0 04 00 00 	movups XMMWORD PTR [rdi+0x4a0],xmm0
     1044d14:	0f 11 87 b0 04 00 00 	movups XMMWORD PTR [rdi+0x4b0],xmm0
     1044d1b:	48 83 a7 c0 04 00 00 	and    QWORD PTR [rdi+0x4c0],0x0
     1044d22:	00 
     1044d23:	48 8d b4 24 a0 0b 00 	lea    rsi,[rsp+0xba0]
     1044d2a:	00 
     1044d2b:	e8 8c 01 e8 ff       	call   ec4ebc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c2d2>
     1044d30:	4c 89 ff             	mov    rdi,r15
     1044d33:	4c 89 f6             	mov    rsi,r14

### 0x105a45c (0x105a2d2..0x105af25)
     105a430:	48 8d 94 24 38 01 00 	lea    rdx,[rsp+0x138]
     105a437:	00 
     105a438:	48 89 df             	mov    rdi,rbx
     105a43b:	e8 ef 0c 00 00       	call   105b12f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222545>
     105a440:	48 8d 35 62 fc 2d ff 	lea    rsi,[rip+0xffffffffff2dfc62]        # 33a0a9 <_ZTSSt12bad_any_cast@@Base-0x5611f>
     105a447:	48 8d 94 24 38 01 00 	lea    rdx,[rsp+0x138]
     105a44e:	00 
     105a44f:	48 89 df             	mov    rdi,rbx
     105a452:	e8 09 31 dd ff       	call   e2d560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa5e6>
     105a457:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a45c:	48 8d 90 70 04 00 00 	lea    rdx,[rax+0x470]
     105a463:	48 8d 35 ef b9 2c ff 	lea    rsi,[rip+0xffffffffff2cb9ef]        # 325e59 <_ZTSSt12bad_any_cast@@Base-0x6a36f>
     105a46a:	48 89 df             	mov    rdi,rbx
     105a46d:	e8 c2 0c 00 00       	call   105b134 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22254a>
     105a472:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a477:	48 8d b0 48 05 00 00 	lea    rsi,[rax+0x548]
     105a47e:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105a483:	e8 56 df 61 00       	call   16783de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c54a>
     105a488:	48 8d 35 d6 b9 2c ff 	lea    rsi,[rip+0xffffffffff2cb9d6]        # 325e65 <_ZTSSt12bad_any_cast@@Base-0x6a363>
     105a48f:	48 8d 54 24 68       	lea    rdx,[rsp+0x68]
     105a494:	48 89 df             	mov    rdi,rbx
     105a497:	e8 c4 30 dd ff       	call   e2d560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa5e6>

### 0x105b4ea (0x105b4cb..0x105b5df)
     105b4cb:	41 57                	push   r15
     105b4cd:	41 56                	push   r14
     105b4cf:	41 54                	push   r12
     105b4d1:	53                   	push   rbx
     105b4d2:	48 83 ec 28          	sub    rsp,0x28
     105b4d6:	48 89 f3             	mov    rbx,rsi
     105b4d9:	49 89 fe             	mov    r14,rdi
     105b4dc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     105b4e3:	00 00 
     105b4e5:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     105b4ea:	80 ba 70 04 00 00 00 	cmp    BYTE PTR [rdx+0x470],0x0
     105b4f1:	0f 84 88 00 00 00    	je     105b57f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222995>
     105b4f7:	49 89 d7             	mov    r15,rdx
     105b4fa:	48 8d 72 30          	lea    rsi,[rdx+0x30]
     105b4fe:	48 8d 15 53 70 99 00 	lea    rdx,[rip+0x997053]        # 19f2558 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x617>
     105b505:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     105b50a:	4c 89 e7             	mov    rdi,r12
     105b50d:	e8 2e e1 b7 ff       	call   bd9640 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1265e0>
     105b512:	49 6b 47 38 30       	imul   rax,QWORD PTR [r15+0x38],0x30
     105b517:	49 03 47 30          	add    rax,QWORD PTR [r15+0x30]
     105b51b:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     105b51f:	48 39 c7             	cmp    rdi,rax

### 0x105b794 (0x105b772..0x105b92f)
     105b774:	41 56                	push   r14
     105b776:	41 54                	push   r12
     105b778:	53                   	push   rbx
     105b779:	48 83 ec 38          	sub    rsp,0x38
     105b77d:	49 89 cf             	mov    r15,rcx
     105b780:	48 89 d3             	mov    rbx,rdx
     105b783:	49 89 fe             	mov    r14,rdi
     105b786:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     105b78d:	00 00 
     105b78f:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     105b794:	8a 81 70 04 00 00    	mov    al,BYTE PTR [rcx+0x470]
     105b79a:	84 c0                	test   al,al
     105b79c:	74 79                	je     105b817 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222c2d>
     105b79e:	40 84 f6             	test   sil,sil
     105b7a1:	74 74                	je     105b817 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222c2d>
     105b7a3:	49 8d 77 30          	lea    rsi,[r15+0x30]
     105b7a7:	48 8d 15 92 09 3e ff 	lea    rdx,[rip+0xffffffffff3e0992]        # 43c140 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1d4c>
     105b7ae:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
     105b7b3:	4c 89 e7             	mov    rdi,r12
     105b7b6:	e8 85 de b7 ff       	call   bd9640 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1265e0>
     105b7bb:	49 6b 47 38 30       	imul   rax,QWORD PTR [r15+0x38],0x30
     105b7c0:	49 03 47 30          	add    rax,QWORD PTR [r15+0x30]

### 0x105baba (0x105baba..0x105bad0)
     105ba90:	48 89 c3             	mov    rbx,rax
     105ba93:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105ba98:	e8 01 2d a4 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     105ba9d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     105baa4:	00 00 
     105baa6:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     105baab:	75 08                	jne    105bab5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222ecb>
     105baad:	48 89 df             	mov    rdi,rbx
     105bab0:	e8 1b 42 a1 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     105bab5:	e8 f6 3f 79 00       	call   17efab0 <__stack_chk_fail@plt>
     105baba:	80 be 70 04 00 00 00 	cmp    BYTE PTR [rsi+0x470],0x0
     105bac1:	74 05                	je     105bac8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222ede>
     105bac3:	e9 f8 d9 61 00       	jmp    16794c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d62c>
     105bac8:	48 89 d6             	mov    rsi,rdx
     105bacb:	e9 f4 d7 61 00       	jmp    16792c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d430>
     105bad0:	55                   	push   rbp
     105bad1:	41 57                	push   r15
     105bad3:	41 56                	push   r14
     105bad5:	41 55                	push   r13
     105bad7:	41 54                	push   r12
     105bad9:	53                   	push   rbx
     105bada:	48 81 ec 48 0e 00 00 	sub    rsp,0xe48

### 0x105c7ea (0x105c7e6..0x105c81e)
     105c7c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     105c7cd:	00 00 
     105c7cf:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     105c7d6:	00 
     105c7d7:	75 08                	jne    105c7e1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223bf7>
     105c7d9:	48 89 df             	mov    rdi,rbx
     105c7dc:	e8 ef 34 a1 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     105c7e1:	e8 ca 32 79 00       	call   17efab0 <__stack_chk_fail@plt>
     105c7e6:	53                   	push   rbx
     105c7e7:	48 89 fb             	mov    rbx,rdi
     105c7ea:	8a 87 70 04 00 00    	mov    al,BYTE PTR [rdi+0x470]
     105c7f0:	3a 86 70 04 00 00    	cmp    al,BYTE PTR [rsi+0x470]
     105c7f6:	75 0e                	jne    105c806 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223c1c>
     105c7f8:	84 c0                	test   al,al
     105c7fa:	74 1d                	je     105c819 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223c2f>
     105c7fc:	48 89 df             	mov    rdi,rbx
     105c7ff:	e8 e0 cb 61 00       	call   16793e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d550>
     105c804:	eb 13                	jmp    105c819 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223c2f>
     105c806:	48 89 df             	mov    rdi,rbx
     105c809:	84 c0                	test   al,al
     105c80b:	74 07                	je     105c814 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223c2a>
     105c80d:	e8 9e 95 e0 ff       	call   e65db0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1c6>

### 0x105c7f0 (0x105c7e6..0x105c81e)
     105c7cd:	00 00 
     105c7cf:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     105c7d6:	00 
     105c7d7:	75 08                	jne    105c7e1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223bf7>
     105c7d9:	48 89 df             	mov    rdi,rbx
     105c7dc:	e8 ef 34 a1 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     105c7e1:	e8 ca 32 79 00       	call   17efab0 <__stack_chk_fail@plt>
     105c7e6:	53                   	push   rbx
     105c7e7:	48 89 fb             	mov    rbx,rdi
     105c7ea:	8a 87 70 04 00 00    	mov    al,BYTE PTR [rdi+0x470]
     105c7f0:	3a 86 70 04 00 00    	cmp    al,BYTE PTR [rsi+0x470]
     105c7f6:	75 0e                	jne    105c806 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223c1c>
     105c7f8:	84 c0                	test   al,al
     105c7fa:	74 1d                	je     105c819 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223c2f>
     105c7fc:	48 89 df             	mov    rdi,rbx
     105c7ff:	e8 e0 cb 61 00       	call   16793e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d550>
     105c804:	eb 13                	jmp    105c819 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223c2f>
     105c806:	48 89 df             	mov    rdi,rbx
     105c809:	84 c0                	test   al,al
     105c80b:	74 07                	je     105c814 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223c2a>
     105c80d:	e8 9e 95 e0 ff       	call   e65db0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1c6>
     105c812:	eb 05                	jmp    105c819 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x223c2f>

### 0x107beff (0x107a02c..0x107e484) WRITE
     107becd:	00 00 
     107becf:	66 41 0f 7f 87 30 04 	movdqa XMMWORD PTR [r15+0x430],xmm0
     107bed6:	00 00 
     107bed8:	41 89 9f 40 04 00 00 	mov    DWORD PTR [r15+0x440],ebx
     107bedf:	48 8d 05 12 5f 80 00 	lea    rax,[rip+0x805f12]        # 1881df8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e4e0>
     107bee6:	49 89 87 48 04 00 00 	mov    QWORD PTR [r15+0x448],rax
     107beed:	66 41 0f 7f 87 50 04 	movdqa XMMWORD PTR [r15+0x450],xmm0
     107bef4:	00 00 
     107bef6:	66 41 0f 7f 87 60 04 	movdqa XMMWORD PTR [r15+0x460],xmm0
     107befd:	00 00 
     107beff:	41 89 9f 70 04 00 00 	mov    DWORD PTR [r15+0x470],ebx
     107bf06:	49 83 a7 a0 04 00 00 	and    QWORD PTR [r15+0x4a0],0x0
     107bf0d:	00 
     107bf0e:	48 8d 05 b3 56 80 00 	lea    rax,[rip+0x8056b3]        # 18815c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3dcb0>
     107bf15:	49 89 87 78 04 00 00 	mov    QWORD PTR [r15+0x478],rax
     107bf1c:	66 41 0f 7f 87 80 04 	movdqa XMMWORD PTR [r15+0x480],xmm0
     107bf23:	00 00 
     107bf25:	66 41 0f 7f 87 90 04 	movdqa XMMWORD PTR [r15+0x490],xmm0
     107bf2c:	00 00 
     107bf2e:	41 89 9f a0 04 00 00 	mov    DWORD PTR [r15+0x4a0],ebx
     107bf35:	48 8d 05 cc 60 80 00 	lea    rax,[rip+0x8060cc]        # 1882008 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e6f0>
     107bf3c:	49 89 87 a8 04 00 00 	mov    QWORD PTR [r15+0x4a8],rax

### 0x107d8b8 (0x107a02c..0x107e484)
     107d899:	b3 01                	mov    bl,0x1
     107d89b:	eb 06                	jmp    107d8a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x244cb9>
     107d89d:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     107d8a1:	31 db                	xor    ebx,ebx
     107d8a3:	48 8d bc 24 c8 02 00 	lea    rdi,[rsp+0x2c8]
     107d8aa:	00 
     107d8ab:	e8 30 a7 a6 ff       	call   ae7fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34f80>
     107d8b0:	eb 06                	jmp    107d8b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x244cce>
     107d8b2:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     107d8b6:	31 db                	xor    ebx,ebx
     107d8b8:	4c 8d b4 24 70 04 00 	lea    r14,[rsp+0x470]
     107d8bf:	00 
     107d8c0:	eb 06                	jmp    107d8c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x244cde>
     107d8c2:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     107d8c6:	31 db                	xor    ebx,ebx
     107d8c8:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
     107d8cf:	00 
     107d8d0:	e8 0b a7 a6 ff       	call   ae7fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34f80>
     107d8d5:	eb 11                	jmp    107d8e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x244cfe>
     107d8d7:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     107d8db:	31 db                	xor    ebx,ebx
     107d8dd:	eb 09                	jmp    107d8e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x244cfe>

### 0x108eb0b (0x108eacc..0x108eb99)
     108eae0:	00 00 
     108eae2:	48 89 84 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rax
     108eae9:	00 
     108eaea:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     108eaee:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     108eaf1:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     108eaf7:	48 8d b0 c0 04 00 00 	lea    rsi,[rax+0x4c0]
     108eafe:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     108eb03:	4c 89 f7             	mov    rdi,r14
     108eb06:	e8 0d 40 d8 ff       	call   e12b18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfb9e>
     108eb0b:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
     108eb12:	00 
     108eb13:	74 1f                	je     108eb34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255f4a>
     108eb15:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     108eb1a:	e8 17 cd 9e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     108eb1f:	4c 8d b4 24 80 04 00 	lea    r14,[rsp+0x480]
     108eb26:	00 
     108eb27:	4c 89 f7             	mov    rdi,r14
     108eb2a:	48 89 c6             	mov    rsi,rax
     108eb2d:	e8 f6 68 63 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     108eb32:	eb 1e                	jmp    108eb52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255f68>
     108eb34:	4c 8d b4 24 80 04 00 	lea    r14,[rsp+0x480]

### 0x1099801 (0x109917a..0x1099d71)
     10997d9:	00 
     10997da:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     10997dd:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     10997e2:	e8 a9 46 75 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10997e7:	0f 57 c0             	xorps  xmm0,xmm0
     10997ea:	41 0f 11 85 08 04 00 	movups XMMWORD PTR [r13+0x408],xmm0
     10997f1:	00 
     10997f2:	49 8d 9d 18 04 00 00 	lea    rbx,[r13+0x418]
     10997f9:	48 89 df             	mov    rdi,rbx
     10997fc:	e8 8d ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]
     1099808:	4c 89 f7             	mov    rdi,r14
     109980b:	e8 7e ea a8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     1099810:	4d 8d bd c8 04 00 00 	lea    r15,[r13+0x4c8]
     1099817:	4c 89 ff             	mov    rdi,r15
     109981a:	e8 0b bf ac ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     109981f:	4c 89 ef             	mov    rdi,r13
     1099822:	e8 19 7c 00 00       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     1099827:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     109982b:	4c 89 6d 00          	mov    QWORD PTR [rbp+0x0],r13
     109982f:	48 85 ff             	test   rdi,rdi
     1099832:	74 06                	je     109983a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260c50>

### 0x10a209c (0x10a2082..0x10a2130)
     10a2078:	5d                   	pop    rbp
     10a2079:	c3                   	ret
     10a207a:	48 89 c7             	mov    rdi,rax
     10a207d:	e8 23 7a 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
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

### 0x10a74a0 (0x10a6464..0x10a7f52)
     10a7471:	49 8d be 18 15 00 00 	lea    rdi,[r14+0x1518]
     10a7478:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a747f:	00 
     10a7480:	e8 0b 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7485:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a748c:	00 
     10a748d:	e8 fe 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7492:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7499:	00 
     10a749a:	0f 84 cc 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74a0:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
     10a74a7:	00 
     10a74a8:	0f 84 be 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74ae:	48 8d 35 90 68 2c ff 	lea    rsi,[rip+0xffffffffff2c6890]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a74b5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a74bc:	00 
     10a74bd:	e8 bc 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a74c2:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a74c9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a74d0:	00 
     10a74d1:	e8 ba 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a74d6:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]

### 0x10a9677 (0x10a9668..0x10a969c)
     10a9659:	48 83 c4 50          	add    rsp,0x50
     10a965d:	5b                   	pop    rbx
     10a965e:	41 5e                	pop    r14
     10a9660:	41 5f                	pop    r15
     10a9662:	c3                   	ret
     10a9663:	e8 48 64 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>

### 0x10bfd22 (0x10bfd22..0x10bfd35)
     10bfcf9:	e8 02 e2 72 00       	call   17edf00 <_Znwm@plt>
     10bfcfe:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     10bfd02:	48 8d 0d 97 4c 7d 00 	lea    rcx,[rip+0x7d4c97]        # 18949a0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x18e0>
     10bfd09:	48 89 08             	mov    QWORD PTR [rax],rcx
     10bfd0c:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     10bfd11:	48 8d 0d e0 fa 37 ff 	lea    rcx,[rip+0xffffffffff37fae0]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     10bfd18:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     10bfd1c:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     10bfd20:	5b                   	pop    rbx
     10bfd21:	c3                   	ret
     10bfd22:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10bfd29:	74 04                	je     10bfd2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287145>
     10bfd2b:	48 89 f8             	mov    rax,rdi
     10bfd2e:	c3                   	ret
     10bfd2f:	50                   	push   rax
     10bfd30:	e8 68 65 a1 ff       	call   ad629d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2323d>
     10bfd35:	41 57                	push   r15
     10bfd37:	41 56                	push   r14
     10bfd39:	41 54                	push   r12
     10bfd3b:	53                   	push   rbx
     10bfd3c:	50                   	push   rax
     10bfd3d:	49 89 f6             	mov    r14,rsi

### 0x10d2621 (0x10d0e58..0x10d4cf6)
     10d25ed:	48 63 84 24 a8 02 00 	movsxd rax,DWORD PTR [rsp+0x2a8]
     10d25f4:	00 
     10d25f5:	48 63 8c 24 b0 02 00 	movsxd rcx,DWORD PTR [rsp+0x2b0]
     10d25fc:	00 
     10d25fd:	8a 94 24 bc 02 00 00 	mov    dl,BYTE PTR [rsp+0x2bc]
     10d2604:	4c 89 b5 48 04 00 00 	mov    QWORD PTR [rbp+0x448],r14
     10d260b:	48 89 9d 50 04 00 00 	mov    QWORD PTR [rbp+0x450],rbx
     10d2612:	4c 89 a5 58 04 00 00 	mov    QWORD PTR [rbp+0x458],r12
     10d2619:	66 0f 7f 85 60 04 00 	movdqa XMMWORD PTR [rbp+0x460],xmm0
     10d2620:	00 
     10d2621:	66 0f 7f 85 70 04 00 	movdqa XMMWORD PTR [rbp+0x470],xmm0
     10d2628:	00 
     10d2629:	66 0f 7f 85 80 04 00 	movdqa XMMWORD PTR [rbp+0x480],xmm0
     10d2630:	00 
     10d2631:	48 89 85 90 04 00 00 	mov    QWORD PTR [rbp+0x490],rax
     10d2638:	48 89 8d 98 04 00 00 	mov    QWORD PTR [rbp+0x498],rcx
     10d263f:	88 95 a0 04 00 00    	mov    BYTE PTR [rbp+0x4a0],dl
     10d2645:	48 8b 84 24 78 05 00 	mov    rax,QWORD PTR [rsp+0x578]
     10d264c:	00 
     10d264d:	48 89 85 a8 04 00 00 	mov    QWORD PTR [rbp+0x4a8],rax
     10d2654:	48 8d 05 e5 d4 77 00 	lea    rax,[rip+0x77d4e5]        # 184fb40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xc228>
     10d265b:	48 89 84 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rax

### 0x10d2678 (0x10d0e58..0x10d4cf6) WRITE
     10d264c:	00 
     10d264d:	48 89 85 a8 04 00 00 	mov    QWORD PTR [rbp+0x4a8],rax
     10d2654:	48 8d 05 e5 d4 77 00 	lea    rax,[rip+0x77d4e5]        # 184fb40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xc228>
     10d265b:	48 89 84 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rax
     10d2662:	00 
     10d2663:	4c 89 6c 24 60       	mov    QWORD PTR [rsp+0x60],r13
     10d2668:	4c 89 ac 24 58 04 00 	mov    QWORD PTR [rsp+0x458],r13
     10d266f:	00 
     10d2670:	48 8d b4 24 50 04 00 	lea    rsi,[rsp+0x450]
     10d2677:	00 
     10d2678:	48 89 b4 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rsi
     10d267f:	00 
     10d2680:	66 0f 6f 84 24 90 02 	movdqa xmm0,XMMWORD PTR [rsp+0x290]
     10d2687:	00 00 
     10d2689:	66 0f 7f 85 b0 04 00 	movdqa XMMWORD PTR [rbp+0x4b0],xmm0
     10d2690:	00 
     10d2691:	66 0f d6 85 c0 04 00 	movq   QWORD PTR [rbp+0x4c0],xmm0
     10d2698:	00 
     10d2699:	48 8d bd d0 04 00 00 	lea    rdi,[rbp+0x4d0]
     10d26a0:	e8 eb 7b 9a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     10d26a5:	48 8d 85 b0 04 00 00 	lea    rax,[rbp+0x4b0]
     10d26ac:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]

### 0x10d2e48 (0x10d0e58..0x10d4cf6) WRITE
     10d2e1a:	66 0f ef c0          	pxor   xmm0,xmm0
     10d2e1e:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     10d2e23:	48 8d 05 ce c5 77 00 	lea    rax,[rip+0x77c5ce]        # 184f3f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xbae0>
     10d2e2a:	48 89 03             	mov    QWORD PTR [rbx],rax
     10d2e2d:	4c 8d 6b 20          	lea    r13,[rbx+0x20]
     10d2e31:	48 8d 05 f8 c5 77 00 	lea    rax,[rip+0x77c5f8]        # 184f430 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xbb18>
     10d2e38:	48 89 84 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rax
     10d2e3f:	00 
     10d2e40:	4c 89 bc 24 58 04 00 	mov    QWORD PTR [rsp+0x458],r15
     10d2e47:	00 
     10d2e48:	4c 89 a4 24 70 04 00 	mov    QWORD PTR [rsp+0x470],r12
     10d2e4f:	00 
     10d2e50:	66 0f 7f 43 20       	movdqa XMMWORD PTR [rbx+0x20],xmm0
     10d2e55:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     10d2e5c:	00 
     10d2e5d:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     10d2e61:	48 8d 73 40          	lea    rsi,[rbx+0x40]
     10d2e65:	48 89 73 60          	mov    QWORD PTR [rbx+0x60],rsi
     10d2e69:	4c 89 e7             	mov    rdi,r12
     10d2e6c:	e8 17 cb 00 00       	call   10df988 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6d9e>
     10d2e71:	c6 43 70 00          	mov    BYTE PTR [rbx+0x70],0x0
     10d2e75:	66 0f ef c0          	pxor   xmm0,xmm0

### 0x10d3ffe (0x10d0e58..0x10d4cf6)
     10d3fd5:	41 0f 10 44 24 58    	movups xmm0,XMMWORD PTR [r12+0x58]
     10d3fdb:	0f 29 84 24 60 04 00 	movaps XMMWORD PTR [rsp+0x460],xmm0
     10d3fe2:	00 
     10d3fe3:	48 85 c0             	test   rax,rax
     10d3fe6:	74 05                	je     10d3fed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b403>
     10d3fe8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10d3fed:	48 8b 84 24 78 01 00 	mov    rax,QWORD PTR [rsp+0x178]
     10d3ff4:	00 
     10d3ff5:	66 0f 6f 84 24 70 01 	movdqa xmm0,XMMWORD PTR [rsp+0x170]
     10d3ffc:	00 00 
     10d3ffe:	66 0f 7f 84 24 70 04 	movdqa XMMWORD PTR [rsp+0x470],xmm0
     10d4005:	00 00 
     10d4007:	48 85 c0             	test   rax,rax
     10d400a:	74 05                	je     10d4011 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b427>
     10d400c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10d4011:	4c 8d b4 24 a0 04 00 	lea    r14,[rsp+0x4a0]
     10d4018:	00 
     10d4019:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     10d401d:	49 89 46 e0          	mov    QWORD PTR [r14-0x20],rax
     10d4021:	4d 89 7e e8          	mov    QWORD PTR [r14-0x18],r15
     10d4025:	8a 44 24 0a          	mov    al,BYTE PTR [rsp+0xa]
     10d4029:	41 88 46 f0          	mov    BYTE PTR [r14-0x10],al

### 0x10f951c (0x10f9518..0x10f9559)
     10f9506:	5b                   	pop    rbx
     10f9507:	41 5c                	pop    r12
     10f9509:	41 5d                	pop    r13
     10f950b:	41 5e                	pop    r14
     10f950d:	41 5f                	pop    r15
     10f950f:	c3                   	ret
     10f9510:	48 89 c7             	mov    rdi,rax
     10f9513:	e8 8d 05 98 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10f9518:	53                   	push   rbx
     10f9519:	48 89 fb             	mov    rbx,rdi
     10f951c:	80 be 70 04 00 00 00 	cmp    BYTE PTR [rsi+0x470],0x0
     10f9523:	74 09                	je     10f952e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0944>
     10f9525:	48 89 df             	mov    rdi,rbx
     10f9528:	5b                   	pop    rbx
     10f9529:	e9 ea 95 d1 ff       	jmp    e12b18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfb9e>
     10f952e:	48 83 7a 28 00       	cmp    QWORD PTR [rdx+0x28],0x0
     10f9533:	74 18                	je     10f954d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0963>
     10f9535:	48 89 d7             	mov    rdi,rdx
     10f9538:	89 ce                	mov    esi,ecx
     10f953a:	31 d2                	xor    edx,edx
     10f953c:	e8 85 04 58 00       	call   16799c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2db32>
     10f9541:	48 89 df             	mov    rdi,rbx

### 0x10f9551 (0x10f9518..0x10f9559) WRITE
     10f9535:	48 89 d7             	mov    rdi,rdx
     10f9538:	89 ce                	mov    esi,ecx
     10f953a:	31 d2                	xor    edx,edx
     10f953c:	e8 85 04 58 00       	call   16799c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2db32>
     10f9541:	48 89 df             	mov    rdi,rbx
     10f9544:	48 89 c6             	mov    rsi,rax
     10f9547:	5b                   	pop    rbx
     10f9548:	e9 e1 b3 d1 ff       	jmp    e1492e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe19b4>
     10f954d:	31 c0                	xor    eax,eax
     10f954f:	88 03                	mov    BYTE PTR [rbx],al
     10f9551:	88 83 70 04 00 00    	mov    BYTE PTR [rbx+0x470],al
     10f9557:	5b                   	pop    rbx
     10f9558:	c3                   	ret
     10f9559:	cc                   	int3
     10f955a:	55                   	push   rbp
     10f955b:	41 57                	push   r15
     10f955d:	41 56                	push   r14
     10f955f:	41 55                	push   r13
     10f9561:	41 54                	push   r12
     10f9563:	53                   	push   rbx
     10f9564:	48 83 ec 28          	sub    rsp,0x28
     10f9568:	49 89 fe             	mov    r14,rdi

### 0x10f95dd (0x10f955a..0x10f972f)
     10f95b5:	e8 0c 04 58 00       	call   16799c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2db32>
     10f95ba:	49 89 c5             	mov    r13,rax
     10f95bd:	48 89 c7             	mov    rdi,rax
     10f95c0:	e8 1b ee ff ff       	call   10f83e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bf7f6>
     10f95c5:	89 c5                	mov    ebp,eax
     10f95c7:	49 83 c5 30          	add    r13,0x30
     10f95cb:	48 8d 35 be 29 34 ff 	lea    rsi,[rip+0xffffffffff3429be]        # 43bf90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1b9c>
     10f95d2:	4c 89 ef             	mov    rdi,r13
     10f95d5:	e8 aa 10 d9 ff       	call   e8a684 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51a9a>
     10f95da:	41 89 c5             	mov    r13d,eax
     10f95dd:	41 80 bf 70 04 00 00 	cmp    BYTE PTR [r15+0x470],0x0
     10f95e4:	00 
     10f95e5:	74 32                	je     10f9619 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0a2f>
     10f95e7:	4c 89 ff             	mov    rdi,r15
     10f95ea:	e8 6c 16 58 00       	call   167ac5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2edc7>
     10f95ef:	84 c0                	test   al,al
     10f95f1:	74 23                	je     10f9616 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0a2c>
     10f95f3:	48 8d 35 ae 29 34 ff 	lea    rsi,[rip+0xffffffffff3429ae]        # 43bfa8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1bb4>
     10f95fa:	4c 89 ff             	mov    rdi,r15
     10f95fd:	e8 56 01 00 00       	call   10f9758 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0b6e>
     10f9602:	48 8d 35 17 86 35 ff 	lea    rsi,[rip+0xffffffffff358617]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     10f9609:	48 89 c7             	mov    rdi,rax

### 0x1112e93 (0x111209a..0x111362a)
     1112e6d:	00 
     1112e6e:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
     1112e75:	00 
     1112e76:	4c 89 ff             	mov    rdi,r15
     1112e79:	e8 04 11 00 00       	call   1113f82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2db398>
     1112e7e:	4c 8d ac 24 30 04 00 	lea    r13,[rsp+0x430]
     1112e85:	00 
     1112e86:	4c 89 ef             	mov    rdi,r13
     1112e89:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
     1112e8e:	e8 fd c5 f2 ff       	call   103f490 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2068a6>
     1112e93:	48 8d ac 24 70 04 00 	lea    rbp,[rsp+0x470]
     1112e9a:	00 
     1112e9b:	48 89 ef             	mov    rdi,rbp
     1112e9e:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
     1112ea3:	e8 ba f1 ff ff       	call   1112062 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d9478>
     1112ea8:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     1112ead:	48 89 84 24 b0 04 00 	mov    QWORD PTR [rsp+0x4b0],rax
     1112eb4:	00 
     1112eb5:	48 83 bc 24 d0 01 00 	cmp    QWORD PTR [rsp+0x1d0],0x0
     1112ebc:	00 00 
     1112ebe:	74 61                	je     1112f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2da337>
     1112ec0:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]

### 0x11399f5 (0x113996a..0x113a034)
     11399cd:	e8 2e 45 6b 00       	call   17edf00 <_Znwm@plt>
     11399d2:	49 89 c6             	mov    r14,rax
     11399d5:	49 83 c4 20          	add    r12,0x20
     11399d9:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
     11399de:	48 89 c7             	mov    rdi,rax
     11399e1:	e8 80 04 59 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     11399e6:	4d 8d 7e 58          	lea    r15,[r14+0x58]
     11399ea:	4c 89 ff             	mov    rdi,r15
     11399ed:	48 89 ee             	mov    rsi,rbp
     11399f0:	e8 b7 68 59 00       	call   16d02ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84418>
     11399f5:	49 8d ae 70 04 00 00 	lea    rbp,[r14+0x470]
     11399fc:	48 89 ef             	mov    rdi,rbp
     11399ff:	4c 89 ee             	mov    rsi,r13
     1139a02:	e8 95 3f d4 ff       	call   e7d99c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44db2>
     1139a07:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     1139a0c:	41 0f 29 86 a0 04 00 	movaps XMMWORD PTR [r14+0x4a0],xmm0
     1139a13:	00 
     1139a14:	49 89 9e b0 04 00 00 	mov    QWORD PTR [r14+0x4b0],rbx
     1139a1b:	0f 57 c0             	xorps  xmm0,xmm0
     1139a1e:	49 83 a6 d8 04 00 00 	and    QWORD PTR [r14+0x4d8],0x0
     1139a25:	00 
     1139a26:	41 0f 11 86 b8 04 00 	movups XMMWORD PTR [r14+0x4b8],xmm0

### 0x113a7fd (0x113a7c4..0x113a823)
     113a7c8:	48 85 ff             	test   rdi,rdi
     113a7cb:	74 4d                	je     113a81a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x301c30>
     113a7cd:	48 8d bb e8 04 00 00 	lea    rdi,[rbx+0x4e8]
     113a7d4:	e8 a3 49 a3 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     113a7d9:	48 8d bb d0 04 00 00 	lea    rdi,[rbx+0x4d0]
     113a7e0:	e8 15 6f f1 ff       	call   10516fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x218b10>
     113a7e5:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
     113a7ec:	e8 4b f9 ff ff       	call   113a13c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x301552>
     113a7f1:	48 8b bb c0 04 00 00 	mov    rdi,QWORD PTR [rbx+0x4c0]
     113a7f8:	e8 89 3c 96 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     113a7fd:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     113a804:	e8 61 f7 93 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     113a809:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
     113a80d:	e8 7e 5b 59 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
     113a812:	48 89 df             	mov    rdi,rbx
     113a815:	e8 14 ab 58 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     113a81a:	48 89 df             	mov    rdi,rbx
     113a81d:	5b                   	pop    rbx
     113a81e:	e9 fd 36 6b 00       	jmp    17edf20 <_ZdlPv@plt>
     113a823:	cc                   	int3
     113a824:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     113a828:	e9 97 ff ff ff       	jmp    113a7c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x301bda>

### 0x1145efc (0x1145c8a..0x1146a50) WRITE
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

### 0x1162005 (0x1161682..0x11648bf) WRITE
     1161fd7:	e8 b6 37 60 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1161fdc:	0f 57 c0             	xorps  xmm0,xmm0
     1161fdf:	0f 11 84 24 58 04 00 	movups XMMWORD PTR [rsp+0x458],xmm0
     1161fe6:	00 
     1161fe7:	48 8d 05 c2 7c 6f 00 	lea    rax,[rip+0x6f7cc2]        # 1859cb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16398>
     1161fee:	48 89 84 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rax
     1161ff5:	00 
     1161ff6:	48 8d 05 fb d7 2d ff 	lea    rax,[rip+0xffffffffff2dd7fb]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1161ffd:	48 89 84 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rax
     1162004:	00 
     1162005:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
     116200c:	00 00 
     116200e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1162013:	48 8b b8 90 01 00 00 	mov    rdi,QWORD PTR [rax+0x190]
     116201a:	48 89 de             	mov    rsi,rbx
     116201d:	48 8d 94 24 50 04 00 	lea    rdx,[rsp+0x450]
     1162024:	00 
     1162025:	e8 08 2a 00 00       	call   1164a32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32be48>
     116202a:	84 c0                	test   al,al
     116202c:	74 44                	je     1162072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x329488>
     116202e:	4c 8b a4 24 68 04 00 	mov    r12,QWORD PTR [rsp+0x468]
     1162035:	00 

### 0x1162842 (0x1161682..0x11648bf) WRITE
     1162819:	48 8d 9c 24 08 04 00 	lea    rbx,[rsp+0x408]
     1162820:	00 
     1162821:	4c 8d b4 24 70 03 00 	lea    r14,[rsp+0x370]
     1162828:	00 
     1162829:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
     116282e:	48 83 a4 24 60 04 00 	and    QWORD PTR [rsp+0x460],0x0
     1162835:	00 00 
     1162837:	0f 57 c0             	xorps  xmm0,xmm0
     116283a:	0f 29 84 24 50 04 00 	movaps XMMWORD PTR [rsp+0x450],xmm0
     1162841:	00 
     1162842:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
     1162849:	00 00 
     116284b:	48 8d 05 16 6a 6f 00 	lea    rax,[rip+0x6f6a16]        # 1859268 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15950>
     1162852:	48 89 84 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rax
     1162859:	00 
     116285a:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     1162861:	00 00 
     1162863:	4c 89 f7             	mov    rdi,r14
     1162866:	e8 e5 73 9f ff       	call   b59c50 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6bf0>
     116286b:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     116286f:	49 2b 04 24          	sub    rax,QWORD PTR [r12]
     1162873:	48 99                	cqo

### 0x116ad96 (0x116a606..0x116d6fc) WRITE
     116ad6b:	00 00 
     116ad6d:	48 8d 05 24 d3 72 00 	lea    rax,[rip+0x72d324]        # 1898098 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4fd8>
     116ad74:	48 89 84 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rax
     116ad7b:	00 
     116ad7c:	0f 57 c0             	xorps  xmm0,xmm0
     116ad7f:	0f 11 84 24 50 04 00 	movups XMMWORD PTR [rsp+0x450],xmm0
     116ad86:	00 
     116ad87:	0f 11 84 24 60 04 00 	movups XMMWORD PTR [rsp+0x460],xmm0
     116ad8e:	00 
     116ad8f:	48 8d 05 62 4a 2d ff 	lea    rax,[rip+0xffffffffff2d4a62]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     116ad96:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     116ad9d:	00 
     116ad9e:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
     116ada5:	00 
     116ada6:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
     116adad:	00 
     116adae:	48 83 a4 24 88 04 00 	and    QWORD PTR [rsp+0x488],0x0
     116adb5:	00 00 
     116adb7:	48 83 a4 24 d0 03 00 	and    QWORD PTR [rsp+0x3d0],0x0
     116adbe:	00 00 
     116adc0:	83 a4 24 58 03 00 00 	and    DWORD PTR [rsp+0x358],0x0
     116adc7:	00 

### 0x11af7e8 (0x11af6de..0x11b20f2)
     11af7bd:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
     11af7c2:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
     11af7c7:	48 89 c6             	mov    rsi,rax
     11af7ca:	e8 c7 ff 8e ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     11af7cf:	4c 89 e7             	mov    rdi,r12
     11af7d2:	e8 8f d5 8f ff       	call   aacd66 <JNI_OnUnload@@Base+0x34633>
     11af7d7:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     11af7db:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11af7e0:	48 8b 68 10          	mov    rbp,QWORD PTR [rax+0x10]
     11af7e4:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11af7e8:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11af7ef:	00 
     11af7f0:	48 89 ee             	mov    rsi,rbp
     11af7f3:	ff 50 48             	call   QWORD PTR [rax+0x48]
     11af7f6:	80 bc 24 a0 04 00 00 	cmp    BYTE PTR [rsp+0x4a0],0x0
     11af7fd:	00 
     11af7fe:	0f 84 4a 04 00 00    	je     11afc4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377064>
     11af804:	0f 28 84 24 70 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x470]
     11af80b:	00 
     11af80c:	0f 29 84 24 40 04 00 	movaps XMMWORD PTR [rsp+0x440],xmm0
     11af813:	00 
     11af814:	48 8b 84 24 80 04 00 	mov    rax,QWORD PTR [rsp+0x480]

### 0x11af804 (0x11af6de..0x11b20f2)
     11af7db:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11af7e0:	48 8b 68 10          	mov    rbp,QWORD PTR [rax+0x10]
     11af7e4:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11af7e8:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11af7ef:	00 
     11af7f0:	48 89 ee             	mov    rsi,rbp
     11af7f3:	ff 50 48             	call   QWORD PTR [rax+0x48]
     11af7f6:	80 bc 24 a0 04 00 00 	cmp    BYTE PTR [rsp+0x4a0],0x0
     11af7fd:	00 
     11af7fe:	0f 84 4a 04 00 00    	je     11afc4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377064>
     11af804:	0f 28 84 24 70 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x470]
     11af80b:	00 
     11af80c:	0f 29 84 24 40 04 00 	movaps XMMWORD PTR [rsp+0x440],xmm0
     11af813:	00 
     11af814:	48 8b 84 24 80 04 00 	mov    rax,QWORD PTR [rsp+0x480]
     11af81b:	00 
     11af81c:	48 89 84 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rax
     11af823:	00 
     11af824:	0f 57 c0             	xorps  xmm0,xmm0
     11af827:	0f 29 84 24 70 04 00 	movaps XMMWORD PTR [rsp+0x470],xmm0
     11af82e:	00 
     11af82f:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0

### 0x11af827 (0x11af6de..0x11b20f2)
     11af7fe:	0f 84 4a 04 00 00    	je     11afc4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377064>
     11af804:	0f 28 84 24 70 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x470]
     11af80b:	00 
     11af80c:	0f 29 84 24 40 04 00 	movaps XMMWORD PTR [rsp+0x440],xmm0
     11af813:	00 
     11af814:	48 8b 84 24 80 04 00 	mov    rax,QWORD PTR [rsp+0x480]
     11af81b:	00 
     11af81c:	48 89 84 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rax
     11af823:	00 
     11af824:	0f 57 c0             	xorps  xmm0,xmm0
     11af827:	0f 29 84 24 70 04 00 	movaps XMMWORD PTR [rsp+0x470],xmm0
     11af82e:	00 
     11af82f:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     11af836:	00 00 
     11af838:	0f 10 8c 24 88 04 00 	movups xmm1,XMMWORD PTR [rsp+0x488]
     11af83f:	00 
     11af840:	0f 11 8c 24 58 04 00 	movups XMMWORD PTR [rsp+0x458],xmm1
     11af847:	00 
     11af848:	48 8b 84 24 98 04 00 	mov    rax,QWORD PTR [rsp+0x498]
     11af84f:	00 
     11af850:	48 89 84 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rax
     11af857:	00 

### 0x11afca8 (0x11af6de..0x11b20f2)
     11afc7c:	e8 bd 34 00 00       	call   11b313e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a554>
     11afc81:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
     11afc88:	00 
     11afc89:	e8 bc 34 00 00       	call   11b314a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a560>
     11afc8e:	48 8d bc 24 b0 04 00 	lea    rdi,[rsp+0x4b0]
     11afc95:	00 
     11afc96:	e8 8d ba 8c ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11afc9b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     11afca2:	00 
     11afca3:	e8 84 6d b2 ff       	call   cd6a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2239cc>
     11afca8:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11afcaf:	00 
     11afcb0:	e8 f7 ea e4 ff       	call   ffe7ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c5bc2>
     11afcb5:	66 41 81 fc 00 01    	cmp    r12w,0x100
     11afcbb:	73 0c                	jae    11afcc9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3770df>
     11afcbd:	4c 8d 3d 45 d9 19 ff 	lea    r15,[rip+0xffffffffff19d945]        # 34d609 <_ZTSSt12bad_any_cast@@Base-0x42bbf>
     11afcc4:	e9 53 0d 00 00       	jmp    11b0a1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377e32>
     11afcc9:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     11afcce:	4c 8b 20             	mov    r12,QWORD PTR [rax]
     11afcd1:	49 8b 75 48          	mov    rsi,QWORD PTR [r13+0x48]
     11afcd5:	49 8b 55 50          	mov    rdx,QWORD PTR [r13+0x50]
     11afcd9:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]

### 0x11afd16 (0x11af6de..0x11b20f2)
     11afce6:	48 8d 35 d8 40 1d ff 	lea    rsi,[rip+0xffffffffff1d40d8]        # 383dc5 <_ZTSSt12bad_any_cast@@Base-0xc403>
     11afced:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
     11afcf4:	00 
     11afcf5:	e8 84 9d 8c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11afcfa:	48 8d 35 62 91 18 ff 	lea    rsi,[rip+0xffffffffff189162]        # 338e63 <_ZTSSt12bad_any_cast@@Base-0x57365>
     11afd01:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
     11afd08:	00 
     11afd09:	e8 70 9d 8c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11afd0e:	48 8b 84 24 60 03 00 	mov    rax,QWORD PTR [rsp+0x360]
     11afd15:	00 
     11afd16:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     11afd1d:	00 
     11afd1e:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     11afd22:	0f 28 84 24 50 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x350]
     11afd29:	00 
     11afd2a:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
     11afd2d:	48 83 a4 24 60 03 00 	and    QWORD PTR [rsp+0x360],0x0
     11afd34:	00 00 
     11afd36:	0f 57 c0             	xorps  xmm0,xmm0
     11afd39:	0f 29 84 24 50 03 00 	movaps XMMWORD PTR [rsp+0x350],xmm0
     11afd40:	00 
     11afd41:	c7 46 18 07 00 00 00 	mov    DWORD PTR [rsi+0x18],0x7

### 0x11b053f (0x11af6de..0x11b20f2)
     11b0513:	e8 32 2c 00 00       	call   11b314a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a560>
     11b0518:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     11b051f:	00 
     11b0520:	e8 25 2c 00 00       	call   11b314a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a560>
     11b0525:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
     11b052c:	00 
     11b052d:	e8 5e d9 63 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11b0532:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
     11b0539:	00 
     11b053a:	e8 0b 2c 00 00       	call   11b314a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a560>
     11b053f:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11b0546:	00 
     11b0547:	e8 fe 2b 00 00       	call   11b314a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a560>
     11b054c:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
     11b0553:	00 
     11b0554:	e8 37 d9 63 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11b0559:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
     11b0560:	00 
     11b0561:	e8 2a d9 63 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11b0566:	80 bc 24 b0 06 00 00 	cmp    BYTE PTR [rsp+0x6b0],0x0
     11b056d:	00 
     11b056e:	0f 84 59 04 00 00    	je     11b09cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377de3>

### 0x11b06d3 (0x11af6de..0x11b20f2)
     11b06ac:	c7 42 18 03 00 00 00 	mov    DWORD PTR [rdx+0x18],0x3
     11b06b3:	4c 89 ef             	mov    rdi,r13
     11b06b6:	e8 31 43 00 00       	call   11b49ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37be02>
     11b06bb:	48 8d bc 24 50 06 00 	lea    rdi,[rsp+0x650]
     11b06c2:	00 
     11b06c3:	48 8d b4 24 40 07 00 	lea    rsi,[rsp+0x740]
     11b06ca:	00 
     11b06cb:	6a 02                	push   0x2
     11b06cd:	5a                   	pop    rdx
     11b06ce:	e8 3f 43 00 00       	call   11b4a12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37be28>
     11b06d3:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11b06da:	00 
     11b06db:	48 8d 94 24 70 06 00 	lea    rdx,[rsp+0x670]
     11b06e2:	00 
     11b06e3:	48 8d 8c 24 50 06 00 	lea    rcx,[rsp+0x650]
     11b06ea:	00 
     11b06eb:	4c 89 e6             	mov    rsi,r12
     11b06ee:	e8 3f 44 00 00       	call   11b4b32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37bf48>
     11b06f3:	48 8d bc 24 50 06 00 	lea    rdi,[rsp+0x650]
     11b06fa:	00 
     11b06fb:	e8 b6 2a 00 00       	call   11b31b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a5cc>
     11b0700:	6a 40                	push   0x40

### 0x11b07ad (0x11af6de..0x11b20f2)
     11b0780:	00 
     11b0781:	e8 0a d7 63 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11b0786:	80 bc 24 90 04 00 00 	cmp    BYTE PTR [rsp+0x490],0x0
     11b078d:	00 
     11b078e:	0f 84 48 02 00 00    	je     11b09dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377df2>
     11b0794:	48 8d 35 55 e9 17 ff 	lea    rsi,[rip+0xffffffffff17e955]        # 32f0f0 <_ZTSSt12bad_any_cast@@Base-0x610d8>
     11b079b:	48 8d bc 24 40 07 00 	lea    rdi,[rsp+0x740]
     11b07a2:	00 
     11b07a3:	e8 d6 92 8c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11b07a8:	4c 89 64 24 18       	mov    QWORD PTR [rsp+0x18],r12
     11b07ad:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11b07b4:	00 
     11b07b5:	48 8d b4 24 40 07 00 	lea    rsi,[rsp+0x740]
     11b07bc:	00 
     11b07bd:	e8 14 e2 00 00       	call   11be9d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f5a>
     11b07c2:	49 89 c5             	mov    r13,rax
     11b07c5:	48 8d bc 24 40 07 00 	lea    rdi,[rsp+0x740]
     11b07cc:	00 
     11b07cd:	e8 be d6 63 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11b07d2:	41 b4 01             	mov    r12b,0x1
     11b07d5:	41 b7 05             	mov    r15b,0x5
     11b07d8:	4d 85 ed             	test   r13,r13

### 0x11b09df (0x11af6de..0x11b20f2)
     11b09c1:	45 31 e4             	xor    r12d,r12d
     11b09c4:	8b 44 24 20          	mov    eax,DWORD PTR [rsp+0x20]
     11b09c8:	41 89 c7             	mov    r15d,eax
     11b09cb:	eb 1c                	jmp    11b09e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377dff>
     11b09cd:	41 b4 01             	mov    r12b,0x1
     11b09d0:	44 8a bc 24 90 06 00 	mov    r15b,BYTE PTR [rsp+0x690]
     11b09d7:	00 
     11b09d8:	31 ed                	xor    ebp,ebp
     11b09da:	eb 1a                	jmp    11b09f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377e0c>
     11b09dc:	41 b4 01             	mov    r12b,0x1
     11b09df:	44 8a bc 24 70 04 00 	mov    r15b,BYTE PTR [rsp+0x470]
     11b09e6:	00 
     11b09e7:	31 ed                	xor    ebp,ebp
     11b09e9:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11b09f0:	00 
     11b09f1:	e8 48 27 00 00       	call   11b313e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a554>
     11b09f6:	48 8d bc 24 90 06 00 	lea    rdi,[rsp+0x690]
     11b09fd:	00 
     11b09fe:	e8 3b 27 00 00       	call   11b313e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a554>
     11b0a03:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     11b0a0a:	00 
     11b0a0b:	e8 80 d4 63 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x11b09e9 (0x11af6de..0x11b20f2)
     11b09cb:	eb 1c                	jmp    11b09e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377dff>
     11b09cd:	41 b4 01             	mov    r12b,0x1
     11b09d0:	44 8a bc 24 90 06 00 	mov    r15b,BYTE PTR [rsp+0x690]
     11b09d7:	00 
     11b09d8:	31 ed                	xor    ebp,ebp
     11b09da:	eb 1a                	jmp    11b09f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377e0c>
     11b09dc:	41 b4 01             	mov    r12b,0x1
     11b09df:	44 8a bc 24 70 04 00 	mov    r15b,BYTE PTR [rsp+0x470]
     11b09e6:	00 
     11b09e7:	31 ed                	xor    ebp,ebp
     11b09e9:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11b09f0:	00 
     11b09f1:	e8 48 27 00 00       	call   11b313e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a554>
     11b09f6:	48 8d bc 24 90 06 00 	lea    rdi,[rsp+0x690]
     11b09fd:	00 
     11b09fe:	e8 3b 27 00 00       	call   11b313e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a554>
     11b0a03:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     11b0a0a:	00 
     11b0a0b:	e8 80 d4 63 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11b0a10:	45 84 e4             	test   r12b,r12b
     11b0a13:	74 5b                	je     11b0a70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377e86>
     11b0a15:	4c 8d 3d 06 cc 19 ff 	lea    r15,[rip+0xffffffffff19cc06]        # 34d622 <_ZTSSt12bad_any_cast@@Base-0x42ba6>

### 0x11b1b5e (0x11af6de..0x11b20f2)
     11b1b40:	48 89 c3             	mov    rbx,rax
     11b1b43:	eb cc                	jmp    11b1b11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x378f27>
     11b1b45:	eb 02                	jmp    11b1b49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x378f5f>
     11b1b47:	eb 12                	jmp    11b1b5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x378f71>
     11b1b49:	48 89 c3             	mov    rbx,rax
     11b1b4c:	48 8d bc 24 40 07 00 	lea    rdi,[rsp+0x740]
     11b1b53:	00 
     11b1b54:	e8 37 c3 63 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11b1b59:	eb 03                	jmp    11b1b5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x378f74>
     11b1b5b:	48 89 c3             	mov    rbx,rax
     11b1b5e:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11b1b65:	00 
     11b1b66:	e8 d3 15 00 00       	call   11b313e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a554>
     11b1b6b:	e9 f0 00 00 00       	jmp    11b1c60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x379076>
     11b1b70:	48 89 c3             	mov    rbx,rax
     11b1b73:	48 8d bc 24 50 06 00 	lea    rdi,[rsp+0x650]
     11b1b7a:	00 
     11b1b7b:	e8 36 16 00 00       	call   11b31b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a5cc>
     11b1b80:	eb 03                	jmp    11b1b85 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x378f9b>
     11b1b82:	48 89 c3             	mov    rbx,rax
     11b1b85:	6a 40                	push   0x40
     11b1b87:	41 5e                	pop    r14

### 0x11b1e8e (0x11af6de..0x11b20f2)
     11b1e62:	e8 e3 12 00 00       	call   11b314a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a560>
     11b1e67:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     11b1e6e:	00 
     11b1e6f:	e8 d6 12 00 00       	call   11b314a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a560>
     11b1e74:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
     11b1e7b:	00 
     11b1e7c:	e8 0f c0 63 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11b1e81:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
     11b1e88:	00 
     11b1e89:	e8 bc 12 00 00       	call   11b314a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a560>
     11b1e8e:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11b1e95:	00 
     11b1e96:	e8 af 12 00 00       	call   11b314a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37a560>
     11b1e9b:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
     11b1ea2:	00 
     11b1ea3:	e8 e8 bf 63 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11b1ea8:	4d 39 ef             	cmp    r15,r13
     11b1eab:	0f 94 c0             	sete   al
     11b1eae:	40 84 ed             	test   bpl,bpl
     11b1eb1:	75 15                	jne    11b1ec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3792de>
     11b1eb3:	84 c0                	test   al,al
     11b1eb5:	75 11                	jne    11b1ec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3792de>

### 0x11b20d8 (0x11af6de..0x11b20f2)
     11b20b2:	4d 8d 7c 24 e0       	lea    r15,[r12-0x20]
     11b20b7:	49 83 c4 e8          	add    r12,0xffffffffffffffe8
     11b20bb:	4c 89 e7             	mov    rdi,r12
     11b20be:	e8 65 96 8c ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     11b20c3:	4d 89 fc             	mov    r12,r15
     11b20c6:	4d 39 f7             	cmp    r15,r14
     11b20c9:	75 e7                	jne    11b20b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3794c8>
     11b20cb:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     11b20d2:	00 
     11b20d3:	e8 54 49 b2 ff       	call   cd6a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2239cc>
     11b20d8:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11b20df:	00 
     11b20e0:	e8 c7 c6 e4 ff       	call   ffe7ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c5bc2>
     11b20e5:	eb 03                	jmp    11b20ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x379500>
     11b20e7:	48 89 c3             	mov    rbx,rax
     11b20ea:	48 89 df             	mov    rdi,rbx
     11b20ed:	e8 b3 79 8c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     11b20f2:	55                   	push   rbp
     11b20f3:	41 57                	push   r15
     11b20f5:	41 56                	push   r14
     11b20f7:	41 55                	push   r13
     11b20f9:	41 54                	push   r12

### 0x11cbeb0 (0x11ca706..0x11cd602) WRITE
     11cbe7a:	49 8d 87 58 04 00 00 	lea    rax,[r15+0x458]
     11cbe81:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11cbe86:	49 8d 87 60 04 00 00 	lea    rax,[r15+0x460]
     11cbe8d:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     11cbe94:	00 
     11cbe95:	4d 89 af 60 04 00 00 	mov    QWORD PTR [r15+0x460],r13
     11cbe9c:	4d 8d b7 68 04 00 00 	lea    r14,[r15+0x468]
     11cbea3:	49 83 a7 68 04 00 00 	and    QWORD PTR [r15+0x468],0x0
     11cbeaa:	00 
     11cbeab:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     11cbeb0:	49 89 af 70 04 00 00 	mov    QWORD PTR [r15+0x470],rbp
     11cbeb7:	6a 20                	push   0x20
     11cbeb9:	5f                   	pop    rdi
     11cbeba:	e8 41 20 62 00       	call   17edf00 <_Znwm@plt>
     11cbebf:	49 89 c5             	mov    r13,rax
     11cbec2:	0f 57 c0             	xorps  xmm0,xmm0
     11cbec5:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     11cbec9:	48 8d 05 00 4a 63 00 	lea    rax,[rip+0x634a00]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
     11cbed0:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     11cbed4:	4c 89 e8             	mov    rax,r13
     11cbed7:	48 83 c0 18          	add    rax,0x18
     11cbedb:	4d 89 7d 18          	mov    QWORD PTR [r13+0x18],r15

### 0x11cd49a (0x11ca706..0x11cd602)
     11cd46a:	48 8d bb d0 04 00 00 	lea    rdi,[rbx+0x4d0]
     11cd471:	e8 f6 27 00 00       	call   11cfc6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x151f0>
     11cd476:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     11cd47b:	e8 10 03 00 00       	call   11cd790 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12d14>
     11cd480:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     11cd487:	00 
     11cd488:	e8 b9 42 5f 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     11cd48d:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     11cd494:	00 
     11cd495:	e8 ac 42 5f 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     11cd49a:	48 8b bb 70 04 00 00 	mov    rdi,QWORD PTR [rbx+0x470]
     11cd4a1:	e8 e0 0f 8d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11cd4a6:	48 8b bb 60 04 00 00 	mov    rdi,QWORD PTR [rbx+0x460]
     11cd4ad:	e8 d4 0f 8d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11cd4b2:	48 8b bb 50 04 00 00 	mov    rdi,QWORD PTR [rbx+0x450]
     11cd4b9:	e8 c8 0f 8d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11cd4be:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
     11cd4c2:	49 8d 9d 00 03 00 00 	lea    rbx,[r13+0x300]
     11cd4c9:	4d 8d b5 78 03 00 00 	lea    r14,[r13+0x378]
     11cd4d0:	4d 8d bd 90 03 00 00 	lea    r15,[r13+0x390]
     11cd4d7:	4d 8d a5 b8 03 00 00 	lea    r12,[r13+0x3b8]
     11cd4de:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]

### 0x11d4d2f (0x11d4aba..0x11d4ea4)
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

### 0x11efe54 (0x11ef334..0x11f5af4)
     11efe1e:	48 89 83 38 04 00 00 	mov    QWORD PTR [rbx+0x438],rax
     11efe25:	4c 8d a3 40 04 00 00 	lea    r12,[rbx+0x440]
     11efe2c:	4c 89 e7             	mov    rdi,r12
     11efe2f:	e8 c2 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efe34:	48 8d ab 50 04 00 00 	lea    rbp,[rbx+0x450]
     11efe3b:	48 89 ef             	mov    rdi,rbp
     11efe3e:	e8 b3 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efe43:	48 8d bb 60 04 00 00 	lea    rdi,[rbx+0x460]
     11efe4a:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     11efe4f:	e8 a2 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efe54:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     11efe5b:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     11efe60:	e8 91 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efe65:	48 8b 84 24 e0 06 00 	mov    rax,QWORD PTR [rsp+0x6e0]
     11efe6c:	00 
     11efe6d:	48 89 83 80 04 00 00 	mov    QWORD PTR [rbx+0x480],rax
     11efe74:	66 0f ef c0          	pxor   xmm0,xmm0
     11efe78:	f3 0f 7f 83 88 04 00 	movdqu XMMWORD PTR [rbx+0x488],xmm0
     11efe7f:	00 
     11efe80:	44 88 bb 9a 04 00 00 	mov    BYTE PTR [rbx+0x49a],r15b
     11efe87:	66 44 89 b3 98 04 00 	mov    WORD PTR [rbx+0x498],r14w
     11efe8e:	00 

### 0x11f0db9 (0x11ef334..0x11f5af4)
     11f0d8d:	00 
     11f0d8e:	c7 83 40 10 00 00 00 	mov    DWORD PTR [rbx+0x1040],0x3f800000
     11f0d95:	00 80 3f 
     11f0d98:	40 88 ab 48 10 00 00 	mov    BYTE PTR [rbx+0x1048],bpl
     11f0d9f:	40 88 ab 48 11 00 00 	mov    BYTE PTR [rbx+0x1148],bpl
     11f0da6:	66 0f 7f 83 50 11 00 	movdqa XMMWORD PTR [rbx+0x1150],xmm0
     11f0dad:	00 
     11f0dae:	48 83 a3 60 11 00 00 	and    QWORD PTR [rbx+0x1160],0x0
     11f0db5:	00 
     11f0db6:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11f0db9:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     11f0dc0:	00 
     11f0dc1:	4c 89 fe             	mov    rsi,r15
     11f0dc4:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     11f0dca:	48 8d 83 70 11 00 00 	lea    rax,[rbx+0x1170]
     11f0dd1:	66 0f ef c0          	pxor   xmm0,xmm0
     11f0dd5:	66 0f 7f 83 70 11 00 	movdqa XMMWORD PTR [rbx+0x1170],xmm0
     11f0ddc:	00 
     11f0ddd:	48 89 83 68 11 00 00 	mov    QWORD PTR [rbx+0x1168],rax
     11f0de4:	48 8d bb 80 11 00 00 	lea    rdi,[rbx+0x1180]
     11f0deb:	e8 9e 74 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0df0:	48 8d bb d8 11 00 00 	lea    rdi,[rbx+0x11d8]

### 0x11f0df7 (0x11ef334..0x11f5af4)
     11f0dc1:	4c 89 fe             	mov    rsi,r15
     11f0dc4:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     11f0dca:	48 8d 83 70 11 00 00 	lea    rax,[rbx+0x1170]
     11f0dd1:	66 0f ef c0          	pxor   xmm0,xmm0
     11f0dd5:	66 0f 7f 83 70 11 00 	movdqa XMMWORD PTR [rbx+0x1170],xmm0
     11f0ddc:	00 
     11f0ddd:	48 89 83 68 11 00 00 	mov    QWORD PTR [rbx+0x1168],rax
     11f0de4:	48 8d bb 80 11 00 00 	lea    rdi,[rbx+0x1180]
     11f0deb:	e8 9e 74 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0df0:	48 8d bb d8 11 00 00 	lea    rdi,[rbx+0x11d8]
     11f0df7:	4c 8d b4 24 70 04 00 	lea    r14,[rsp+0x470]
     11f0dfe:	00 
     11f0dff:	4c 89 f6             	mov    rsi,r14
     11f0e02:	e8 53 e2 05 00       	call   124f05a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x945de>
     11f0e07:	4c 89 f7             	mov    rdi,r14
     11f0e0a:	e8 2d 56 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
     11f0e0f:	48 8d 35 a2 f5 15 ff 	lea    rsi,[rip+0xffffffffff15f5a2]        # 3503b8 <_ZTSSt12bad_any_cast@@Base-0x3fe10>
     11f0e16:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11f0e1d:	00 
     11f0e1e:	e8 5b 8c 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11f0e23:	48 8b b4 24 78 06 00 	mov    rsi,QWORD PTR [rsp+0x678]
     11f0e2a:	00 

### 0x11f8b1a (0x11f8ada..0x11f8b44)
     11f8ade:	48 81 c7 50 06 00 00 	add    rdi,0x650
     11f8ae5:	e8 7c 9b 8e ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     11f8aea:	48 8d bb 20 06 00 00 	lea    rdi,[rbx+0x620]
     11f8af1:	e8 04 c4 95 ff       	call   b54efa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1e9a>
     11f8af6:	48 8d bb 00 06 00 00 	lea    rdi,[rbx+0x600]
     11f8afd:	e8 2e e2 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     11f8b02:	48 8d bb 88 05 00 00 	lea    rdi,[rbx+0x588]
     11f8b09:	e8 36 00 00 00       	call   11f8b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0c8>
     11f8b0e:	48 8d bb 58 05 00 00 	lea    rdi,[rbx+0x558]
     11f8b15:	e8 8a 0e e9 ff       	call   10899a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250dba>
     11f8b1a:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     11f8b21:	e8 ce 11 eb ff       	call   10a9cf4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27110a>
     11f8b26:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
     11f8b2d:	e8 28 00 00 00       	call   11f8b5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0de>
     11f8b32:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     11f8b36:	e8 c9 c4 af ff       	call   cf5004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x241fa4>
     11f8b3b:	48 89 df             	mov    rdi,rbx
     11f8b3e:	5b                   	pop    rbx
     11f8b3f:	e9 4c 53 5f 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f8b44:	53                   	push   rbx
     11f8b45:	48 89 fb             	mov    rbx,rdi
     11f8b48:	48 83 c7 38          	add    rdi,0x38

### 0x120f7c0 (0x120f7a1..0x120f98f)
     120f7a2:	41 57                	push   r15
     120f7a4:	41 56                	push   r14
     120f7a6:	41 55                	push   r13
     120f7a8:	41 54                	push   r12
     120f7aa:	53                   	push   rbx
     120f7ab:	48 83 ec 78          	sub    rsp,0x78
     120f7af:	48 89 fb             	mov    rbx,rdi
     120f7b2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120f7b9:	00 00 
     120f7bb:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     120f7c0:	80 be 70 04 00 00 00 	cmp    BYTE PTR [rsi+0x470],0x0
     120f7c7:	0f 84 64 01 00 00    	je     120f931 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54eb5>
     120f7cd:	49 89 ce             	mov    r14,rcx
     120f7d0:	49 89 d7             	mov    r15,rdx
     120f7d3:	49 89 f4             	mov    r12,rsi
     120f7d6:	4c 8d 6e 30          	lea    r13,[rsi+0x30]
     120f7da:	48 8d 35 27 72 14 ff 	lea    rsi,[rip+0xffffffffff147227]        # 356a08 <_ZTSSt12bad_any_cast@@Base-0x397c0>
     120f7e1:	48 8d 6c 24 20       	lea    rbp,[rsp+0x20]
     120f7e6:	48 89 ef             	mov    rdi,rbp
     120f7e9:	e8 90 a2 86 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     120f7ee:	4c 89 ef             	mov    rdi,r13
     120f7f1:	48 89 ee             	mov    rsi,rbp

### 0x1228721 (0x12286bc..0x12291d6)
     12286f5:	4c 89 e7             	mov    rdi,r12
     12286f8:	e8 d9 0a 00 00       	call   12291d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e75a>
     12286fd:	49 8d bc 24 20 02 00 	lea    rdi,[r12+0x220]
     1228704:	00 
     1228705:	4c 89 ee             	mov    rsi,r13
     1228708:	e8 73 59 5c 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     122870d:	49 8d b5 58 05 00 00 	lea    rsi,[r13+0x558]
     1228714:	49 8d bc 24 38 02 00 	lea    rdi,[r12+0x238]
     122871b:	00 
     122871c:	e8 57 40 e6 ff       	call   108c778 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b8e>
     1228721:	49 8d b5 70 04 00 00 	lea    rsi,[r13+0x470]
     1228728:	49 8d bc 24 68 02 00 	lea    rdi,[r12+0x268]
     122872f:	00 
     1228730:	e8 21 1b e8 ff       	call   10aa256 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27166c>
     1228735:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     122873a:	8a 41 10             	mov    al,BYTE PTR [rcx+0x10]
     122873d:	41 88 84 24 29 03 00 	mov    BYTE PTR [r12+0x329],al
     1228744:	00 
     1228745:	8a 41 11             	mov    al,BYTE PTR [rcx+0x11]
     1228748:	41 88 84 24 2a 03 00 	mov    BYTE PTR [r12+0x32a],al
     122874f:	00 
     1228750:	8a 41 12             	mov    al,BYTE PTR [rcx+0x12]

### 0x1228d24 (0x12286bc..0x12291d6) WRITE
     1228cde:	88 84 24 d0 03 00 00 	mov    BYTE PTR [rsp+0x3d0],al
     1228ce5:	88 84 24 e8 03 00 00 	mov    BYTE PTR [rsp+0x3e8],al
     1228cec:	88 84 24 f0 03 00 00 	mov    BYTE PTR [rsp+0x3f0],al
     1228cf3:	88 84 24 08 04 00 00 	mov    BYTE PTR [rsp+0x408],al
     1228cfa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al
     1228d01:	88 84 24 28 04 00 00 	mov    BYTE PTR [rsp+0x428],al
     1228d08:	88 84 24 30 04 00 00 	mov    BYTE PTR [rsp+0x430],al
     1228d0f:	88 84 24 48 04 00 00 	mov    BYTE PTR [rsp+0x448],al
     1228d16:	88 84 24 50 04 00 00 	mov    BYTE PTR [rsp+0x450],al
     1228d1d:	88 84 24 68 04 00 00 	mov    BYTE PTR [rsp+0x468],al
     1228d24:	88 84 24 70 04 00 00 	mov    BYTE PTR [rsp+0x470],al
     1228d2b:	88 84 24 88 04 00 00 	mov    BYTE PTR [rsp+0x488],al
     1228d32:	66 83 a4 24 90 04 00 	and    WORD PTR [rsp+0x490],0x0
     1228d39:	00 00 
     1228d3b:	88 84 24 92 04 00 00 	mov    BYTE PTR [rsp+0x492],al
     1228d42:	4c 89 ef             	mov    rdi,r13
     1228d45:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
     1228d4a:	e8 4f 43 e6 ff       	call   108d09e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2544b4>
     1228d4f:	4b 8d 34 3e          	lea    rsi,[r14+r15*1]
     1228d53:	48 81 c6 60 02 00 00 	add    rsi,0x260
     1228d5a:	48 89 ef             	mov    rdi,rbp
     1228d5d:	e8 04 3a 8a ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>

### 0x1229128 (0x12286bc..0x12291d6)
     1229101:	48 89 c3             	mov    rbx,rax
     1229104:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1229109:	e8 82 4d 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     122910e:	e9 bb 00 00 00       	jmp    12291ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e752>
     1229113:	e9 b3 00 00 00       	jmp    12291cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e74f>
     1229118:	48 89 c3             	mov    rbx,rax
     122911b:	eb 0b                	jmp    1229128 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e6ac>
     122911d:	48 89 c3             	mov    rbx,rax
     1229120:	4c 89 ef             	mov    rdi,r13
     1229123:	e8 70 0a e6 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1229128:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     122912f:	00 
     1229130:	e8 fb db 87 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1229135:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
     122913c:	00 
     122913d:	e8 ee db 87 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1229142:	48 8d bc 24 30 04 00 	lea    rdi,[rsp+0x430]
     1229149:	00 
     122914a:	e8 e1 db 87 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     122914f:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     1229156:	00 
     1229157:	e8 d4 db 87 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>

### 0x122ad2b (0x122acda..0x122adf6)
     122acf4:	0f 11 43 0a          	movups XMMWORD PTR [rbx+0xa],xmm0
     122acf8:	e8 4d b4 e7 ff       	call   10a614a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d560>
     122acfd:	83 a3 f0 03 00 00 00 	and    DWORD PTR [rbx+0x3f0],0x0
     122ad04:	83 a3 48 04 00 00 00 	and    DWORD PTR [rbx+0x448],0x0
     122ad0b:	66 83 a3 50 04 00 00 	and    WORD PTR [rbx+0x450],0x0
     122ad12:	00 
     122ad13:	48 8d 83 60 04 00 00 	lea    rax,[rbx+0x460]
     122ad1a:	0f 57 c0             	xorps  xmm0,xmm0
     122ad1d:	0f 11 83 60 04 00 00 	movups XMMWORD PTR [rbx+0x460],xmm0
     122ad24:	48 89 83 58 04 00 00 	mov    QWORD PTR [rbx+0x458],rax
     122ad2b:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     122ad32:	40 88 ab 38 05 00 00 	mov    BYTE PTR [rbx+0x538],bpl
     122ad39:	40 88 ab 50 05 00 00 	mov    BYTE PTR [rbx+0x550],bpl
     122ad40:	ba c4 00 00 00       	mov    edx,0xc4
     122ad45:	31 f6                	xor    esi,esi
     122ad47:	e8 44 3e 5c 00       	call   17eeb90 <memset@plt>
     122ad4c:	40 88 ab b8 05 00 00 	mov    BYTE PTR [rbx+0x5b8],bpl
     122ad53:	40 88 ab f0 05 00 00 	mov    BYTE PTR [rbx+0x5f0],bpl
     122ad5a:	0f 57 c0             	xorps  xmm0,xmm0
     122ad5d:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0
     122ad64:	0f 11 83 c9 05 00 00 	movups XMMWORD PTR [rbx+0x5c9],xmm0
     122ad6b:	83 a3 f8 05 00 00 00 	and    DWORD PTR [rbx+0x5f8],0x0

### 0x122c079 (0x122ba2e..0x122c594)
     122c046:	f3 41 0f 7f 85 ec 03 	movdqu XMMWORD PTR [r13+0x3ec],xmm0
     122c04d:	00 00 
     122c04f:	48 b8 00 00 00 00 00 	movabs rax,0x3f80000000000000
     122c056:	00 80 3f 
     122c059:	49 89 85 0c 04 00 00 	mov    QWORD PTR [r13+0x40c],rax
     122c060:	f3 41 0f 7f 85 18 04 	movdqu XMMWORD PTR [r13+0x418],xmm0
     122c067:	00 00 
     122c069:	f3 41 0f 7f 85 28 04 	movdqu XMMWORD PTR [r13+0x428],xmm0
     122c070:	00 00 
     122c072:	41 89 ad 38 04 00 00 	mov    DWORD PTR [r13+0x438],ebp
     122c079:	f3 41 0f 7f 85 70 04 	movdqu XMMWORD PTR [r13+0x470],xmm0
     122c080:	00 00 
     122c082:	f3 41 0f 7f 85 80 04 	movdqu XMMWORD PTR [r13+0x480],xmm0
     122c089:	00 00 
     122c08b:	41 89 ad 90 04 00 00 	mov    DWORD PTR [r13+0x490],ebp
     122c092:	f3 41 0f 7f 85 a8 04 	movdqu XMMWORD PTR [r13+0x4a8],xmm0
     122c099:	00 00 
     122c09b:	f3 41 0f 7f 85 98 04 	movdqu XMMWORD PTR [r13+0x498],xmm0
     122c0a2:	00 00 
     122c0a4:	41 89 ad b8 04 00 00 	mov    DWORD PTR [r13+0x4b8],ebp
     122c0ab:	f3 41 0f 7f 85 d0 04 	movdqu XMMWORD PTR [r13+0x4d0],xmm0
     122c0b2:	00 00 

### 0x122ee78 (0x122e1da..0x1230a86)
     122ee46:	84 c0                	test   al,al
     122ee48:	0f 85 79 03 00 00    	jne    122f1c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7474b>
     122ee4e:	48 8d b5 48 01 00 00 	lea    rsi,[rbp+0x148]
     122ee55:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     122ee5c:	00 
     122ee5d:	e8 de f0 5b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     122ee62:	48 8d b5 60 01 00 00 	lea    rsi,[rbp+0x160]
     122ee69:	4c 89 f7             	mov    rdi,r14
     122ee6c:	e8 cf f0 5b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     122ee71:	48 8d b5 78 01 00 00 	lea    rsi,[rbp+0x178]
     122ee78:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     122ee7f:	00 
     122ee80:	e8 bb f0 5b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     122ee85:	48 8d 9c 24 e0 01 00 	lea    rbx,[rsp+0x1e0]
     122ee8c:	00 
     122ee8d:	48 89 df             	mov    rdi,rbx
     122ee90:	4c 89 fe             	mov    rsi,r15
     122ee93:	4c 89 e2             	mov    rdx,r12
     122ee96:	e8 35 28 a0 ff       	call   c316d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e670>
     122ee9b:	48 89 df             	mov    rdi,rbx
     122ee9e:	e8 3d 08 bd ff       	call   dff6e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc766>
     122eea3:	49 89 c6             	mov    r14,rax

### 0x122f1a0 (0x122e1da..0x1230a86)
     122f179:	49 8d 7d 40          	lea    rdi,[r13+0x40]
     122f17d:	48 8d 9c 24 40 04 00 	lea    rbx,[rsp+0x440]
     122f184:	00 
     122f185:	48 89 de             	mov    rsi,rbx
     122f188:	e8 a1 c8 84 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     122f18d:	49 8d 7d 58          	lea    rdi,[r13+0x58]
     122f191:	4c 89 f6             	mov    rsi,r14
     122f194:	e8 95 c8 84 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     122f199:	49 83 c5 70          	add    r13,0x70
     122f19d:	4c 89 ef             	mov    rdi,r13
     122f1a0:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     122f1a7:	00 
     122f1a8:	e8 81 c8 84 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     122f1ad:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     122f1b4:	00 
     122f1b5:	e8 12 f6 86 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     122f1ba:	48 89 df             	mov    rdi,rbx
     122f1bd:	e8 92 7c 87 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     122f1c2:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     122f1c7:	48 8b b5 80 01 00 00 	mov    rsi,QWORD PTR [rbp+0x180]
     122f1ce:	8b bd 78 01 00 00    	mov    edi,DWORD PTR [rbp+0x178]
     122f1d4:	e8 47 c6 84 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>

### 0x12374fa (0x1235556..0x1239d28)
     12374d2:	4c 89 f7             	mov    rdi,r14
     12374d5:	48 89 de             	mov    rsi,rbx
     12374d8:	e8 63 6a 5b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12374dd:	4c 89 ef             	mov    rdi,r13
     12374e0:	48 83 c7 28          	add    rdi,0x28
     12374e4:	49 8d 77 28          	lea    rsi,[r15+0x28]
     12374e8:	e8 e3 4a e5 ff       	call   108bfd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2533e6>
     12374ed:	c6 84 24 50 01 00 00 	mov    BYTE PTR [rsp+0x150],0x1
     12374f4:	01 
     12374f5:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     12374fa:	48 8b 80 70 04 00 00 	mov    rax,QWORD PTR [rax+0x470]
     1237501:	48 ff c0             	inc    rax
     1237504:	78 07                	js     123750d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7ca91>
     1237506:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     123750b:	eb 15                	jmp    1237522 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7caa6>
     123750d:	48 89 c1             	mov    rcx,rax
     1237510:	48 d1 e9             	shr    rcx,1
     1237513:	83 e0 01             	and    eax,0x1
     1237516:	48 09 c8             	or     rax,rcx
     1237519:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     123751e:	f3 0f 58 c0          	addss  xmm0,xmm0
     1237522:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]

### 0x1237659 (0x1235556..0x1239d28) WRITE
     1237634:	31 d2                	xor    edx,edx
     1237636:	48 f7 f5             	div    rbp
     1237639:	48 89 d0             	mov    rax,rdx
     123763c:	48 c1 e0 03          	shl    rax,0x3
     1237640:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     1237645:	48 03 01             	add    rax,QWORD PTR [rcx]
     1237648:	4c 89 28             	mov    QWORD PTR [rax],r13
     123764b:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0
     1237652:	00 00 
     1237654:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1237659:	48 ff 80 70 04 00 00 	inc    QWORD PTR [rax+0x470]
     1237660:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     1237667:	00 
     1237668:	e8 35 3d 00 00       	call   123b3a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80926>
     123766d:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     1237670:	4d 85 ff             	test   r15,r15
     1237673:	0f 85 6e fd ff ff    	jne    12373e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7c96b>
     1237679:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     123767e:	48 8d b9 80 04 00 00 	lea    rdi,[rcx+0x480]
     1237685:	0f 57 c0             	xorps  xmm0,xmm0
     1237688:	0f 11 81 90 04 00 00 	movups XMMWORD PTR [rcx+0x490],xmm0
     123768f:	0f 11 81 80 04 00 00 	movups XMMWORD PTR [rcx+0x480],xmm0

### 0x123e6f7 (0x123c81c..0x1240fd8)
     123e6c7:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     123e6ce:	00 
     123e6cf:	e8 ce cc ff ff       	call   123b3a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80926>
     123e6d4:	48 83 c3 58          	add    rbx,0x58
     123e6d8:	48 3b 5c 24 30       	cmp    rbx,QWORD PTR [rsp+0x30]
     123e6dd:	0f 85 38 fd ff ff    	jne    123e41b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8399f>
     123e6e3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123e6e8:	e8 99 23 ff ff       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     123e6ed:	48 89 c3             	mov    rbx,rax
     123e6f0:	4c 8d b0 58 04 00 00 	lea    r14,[rax+0x458]
     123e6f7:	48 83 b8 70 04 00 00 	cmp    QWORD PTR [rax+0x470],0x0
     123e6fe:	00 
     123e6ff:	74 3a                	je     123e73b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83cbf>
     123e701:	48 8b bb 68 04 00 00 	mov    rdi,QWORD PTR [rbx+0x468]
     123e708:	e8 d5 ea fe ff       	call   122d1e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72766>
     123e70d:	48 83 a3 68 04 00 00 	and    QWORD PTR [rbx+0x468],0x0
     123e714:	00 
     123e715:	48 8b 83 60 04 00 00 	mov    rax,QWORD PTR [rbx+0x460]
     123e71c:	48 85 c0             	test   rax,rax
     123e71f:	74 12                	je     123e733 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83cb7>
     123e721:	31 c9                	xor    ecx,ecx
     123e723:	49 8b 16             	mov    rdx,QWORD PTR [r14]

### 0x123e733 (0x123c81c..0x1240fd8) WRITE
     123e714:	00 
     123e715:	48 8b 83 60 04 00 00 	mov    rax,QWORD PTR [rbx+0x460]
     123e71c:	48 85 c0             	test   rax,rax
     123e71f:	74 12                	je     123e733 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83cb7>
     123e721:	31 c9                	xor    ecx,ecx
     123e723:	49 8b 16             	mov    rdx,QWORD PTR [r14]
     123e726:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
     123e72b:	48 ff c1             	inc    rcx
     123e72e:	48 39 c8             	cmp    rax,rcx
     123e731:	75 f0                	jne    123e723 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83ca7>
     123e733:	48 83 a3 70 04 00 00 	and    QWORD PTR [rbx+0x470],0x0
     123e73a:	00 
     123e73b:	48 8b b4 24 10 02 00 	mov    rsi,QWORD PTR [rsp+0x210]
     123e742:	00 
     123e743:	48 83 a4 24 10 02 00 	and    QWORD PTR [rsp+0x210],0x0
     123e74a:	00 00 
     123e74c:	4c 89 f7             	mov    rdi,r14
     123e74f:	e8 42 10 86 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     123e754:	48 8b 8c 24 18 02 00 	mov    rcx,QWORD PTR [rsp+0x218]
     123e75b:	00 
     123e75c:	48 89 8b 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rcx
     123e763:	48 83 a4 24 18 02 00 	and    QWORD PTR [rsp+0x218],0x0

### 0x123e774 (0x123c81c..0x1240fd8) WRITE
     123e74a:	00 00 
     123e74c:	4c 89 f7             	mov    rdi,r14
     123e74f:	e8 42 10 86 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     123e754:	48 8b 8c 24 18 02 00 	mov    rcx,QWORD PTR [rsp+0x218]
     123e75b:	00 
     123e75c:	48 89 8b 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rcx
     123e763:	48 83 a4 24 18 02 00 	and    QWORD PTR [rsp+0x218],0x0
     123e76a:	00 00 
     123e76c:	48 8b 94 24 28 02 00 	mov    rdx,QWORD PTR [rsp+0x228]
     123e773:	00 
     123e774:	48 89 93 70 04 00 00 	mov    QWORD PTR [rbx+0x470],rdx
     123e77b:	f3 0f 10 84 24 30 02 	movss  xmm0,DWORD PTR [rsp+0x230]
     123e782:	00 00 
     123e784:	f3 0f 11 83 78 04 00 	movss  DWORD PTR [rbx+0x478],xmm0
     123e78b:	00 
     123e78c:	48 8b 84 24 20 02 00 	mov    rax,QWORD PTR [rsp+0x220]
     123e793:	00 
     123e794:	48 89 83 68 04 00 00 	mov    QWORD PTR [rbx+0x468],rax
     123e79b:	48 85 d2             	test   rdx,rdx
     123e79e:	74 3b                	je     123e7db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83d5f>
     123e7a0:	48 81 c3 68 04 00 00 	add    rbx,0x468
     123e7a7:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]

### 0x12448fa (0x1244558..0x1244ad3) WRITE
     12448c0:	e8 79 05 00 00       	call   1244e3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a3c2>
     12448c5:	48 8d bb b8 02 00 00 	lea    rdi,[rbx+0x2b8]
     12448cc:	48 89 c6             	mov    rsi,rax
     12448cf:	e8 94 6f ff ff       	call   123b868 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80dec>
     12448d4:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     12448d9:	8a 81 28 02 00 00    	mov    al,BYTE PTR [rcx+0x228]
     12448df:	88 83 68 04 00 00    	mov    BYTE PTR [rbx+0x468],al
     12448e5:	48 8b 81 20 02 00 00 	mov    rax,QWORD PTR [rcx+0x220]
     12448ec:	48 89 83 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rax
     12448f3:	49 8b 87 20 02 00 00 	mov    rax,QWORD PTR [r15+0x220]
     12448fa:	48 89 83 70 04 00 00 	mov    QWORD PTR [rbx+0x470],rax
     1244901:	41 8a 87 28 02 00 00 	mov    al,BYTE PTR [r15+0x228]
     1244908:	88 83 78 04 00 00    	mov    BYTE PTR [rbx+0x478],al
     124490e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1244913:	e8 78 95 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1244918:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     124491d:	e8 6e 95 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1244922:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1244929:	00 
     124492a:	e8 61 95 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124492f:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1244936:	00 

### 0x1263586 (0x1263214..0x12658e5)
     1263560:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1263565:	ff 50 58             	call   QWORD PTR [rax+0x58]
     1263568:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     126356d:	e8 74 08 8d ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     1263572:	80 bc 24 78 04 00 00 	cmp    BYTE PTR [rsp+0x478],0x0
     1263579:	00 
     126357a:	74 28                	je     12635a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8b28>
     126357c:	f6 84 24 68 04 00 00 	test   BYTE PTR [rsp+0x468],0x1
     1263583:	01 
     1263584:	74 1e                	je     12635a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8b28>
     1263586:	8b b4 24 70 04 00 00 	mov    esi,DWORD PTR [rsp+0x470]
     126358d:	8d 46 ff             	lea    eax,[rsi-0x1]
     1263590:	83 f8 01             	cmp    eax,0x1
     1263593:	77 0f                	ja     12635a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8b28>
     1263595:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     126359a:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     126359e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12635a1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     12635a4:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     12635a9:	48 83 78 50 00       	cmp    QWORD PTR [rax+0x50],0x0
     12635ae:	0f 84 fc 07 00 00    	je     1263db0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa9334>
     12635b4:	0f 57 c0             	xorps  xmm0,xmm0

### 0x1299d1a (0x1298d86..0x129a87b)
     1299cf3:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
     1299cf8:	48 85 c0             	test   rax,rax
     1299cfb:	74 05                	je     1299d02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdf286>
     1299cfd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1299d02:	0f b6 8c 24 5a 04 00 	movzx  ecx,BYTE PTR [rsp+0x45a]
     1299d09:	00 
     1299d0a:	0f b6 84 24 62 04 00 	movzx  eax,BYTE PTR [rsp+0x462]
     1299d11:	00 
     1299d12:	0f b6 94 24 63 04 00 	movzx  edx,BYTE PTR [rsp+0x463]
     1299d19:	00 
     1299d1a:	40 8a b4 24 70 04 00 	mov    sil,BYTE PTR [rsp+0x470]
     1299d21:	00 
     1299d22:	40 0a b4 24 ab 04 00 	or     sil,BYTE PTR [rsp+0x4ab]
     1299d29:	00 
     1299d2a:	0f b6 bc 24 5d 04 00 	movzx  edi,BYTE PTR [rsp+0x45d]
     1299d31:	00 
     1299d32:	45 31 c0             	xor    r8d,r8d
     1299d35:	80 bc 24 bc 04 00 00 	cmp    BYTE PTR [rsp+0x4bc],0x0
     1299d3c:	00 
     1299d3d:	41 0f 95 c0          	setne  r8b
     1299d41:	41 c1 e0 05          	shl    r8d,0x5
     1299d45:	40 0a b4 24 ba 04 00 	or     sil,BYTE PTR [rsp+0x4ba]

### 0x12adcad (0x12ad5f6..0x12ade18) WRITE
     12adc7c:	48 89 ee             	mov    rsi,rbp
     12adc7f:	e8 8a f8 ff ff       	call   12ad50e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2a92>
     12adc84:	48 8d 05 8d 3f 1a ff 	lea    rax,[rip+0xffffffffff1a3f8d]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     12adc8b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     12adc90:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     12adc95:	48 83 64 24 38 00    	and    QWORD PTR [rsp+0x38],0x0
     12adc9b:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
     12adca2:	00 
     12adca3:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     12adca8:	e8 93 01 00 00       	call   12ade40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf33c4>
     12adcad:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
     12adcb4:	00 00 
     12adcb6:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     12adcbd:	00 00 
     12adcbf:	bf 10 02 00 00       	mov    edi,0x210
     12adcc4:	e8 37 02 54 00       	call   17edf00 <_Znwm@plt>
     12adcc9:	48 89 c3             	mov    rbx,rax
     12adccc:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
     12adcd3:	00 
     12adcd4:	48 89 c7             	mov    rdi,rax
     12adcd7:	e8 64 01 00 00       	call   12ade40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf33c4>
     12adcdc:	4c 8d a4 24 70 04 00 	lea    r12,[rsp+0x470]

### 0x12adcdc (0x12ad5f6..0x12ade18)
     12adcb4:	00 00 
     12adcb6:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     12adcbd:	00 00 
     12adcbf:	bf 10 02 00 00       	mov    edi,0x210
     12adcc4:	e8 37 02 54 00       	call   17edf00 <_Znwm@plt>
     12adcc9:	48 89 c3             	mov    rbx,rax
     12adccc:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
     12adcd3:	00 
     12adcd4:	48 89 c7             	mov    rdi,rax
     12adcd7:	e8 64 01 00 00       	call   12ade40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf33c4>
     12adcdc:	4c 8d a4 24 70 04 00 	lea    r12,[rsp+0x470]
     12adce3:	00 
     12adce4:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
     12adce8:	48 8d 05 9f 01 00 00 	lea    rax,[rip+0x19f]        # 12ade8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3412>
     12adcef:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
     12adcf4:	48 8d 05 bd 01 00 00 	lea    rax,[rip+0x1bd]        # 12adeb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf343c>
     12adcfb:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
     12add00:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     12add05:	4c 89 ff             	mov    rdi,r15
     12add08:	4c 89 e2             	mov    rdx,r12
     12add0b:	4c 89 f1             	mov    rcx,r14
     12add0e:	45 31 c0             	xor    r8d,r8d

### 0x12addac (0x12ad5f6..0x12ade18)
     12add89:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
     12add90:	00 
     12add91:	e8 82 00 00 00       	call   12ade18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf339c>
     12add96:	eb 03                	jmp    12add9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf331f>
     12add98:	48 89 c3             	mov    rbx,rax
     12add9b:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     12adda0:	e8 67 6a dc ff       	call   107480c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23bc22>
     12adda5:	eb 51                	jmp    12addf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf337c>
     12adda7:	eb 18                	jmp    12addc1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3345>
     12adda9:	48 89 c3             	mov    rbx,rax
     12addac:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12addb3:	00 
     12addb4:	e8 e5 94 7f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     12addb9:	48 89 df             	mov    rdi,rbx
     12addbc:	e8 e4 bc 7c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     12addc1:	48 89 c7             	mov    rdi,rax
     12addc4:	e8 dc bc 7c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     12addc9:	48 89 c3             	mov    rbx,rax
     12addcc:	4c 89 e7             	mov    rdi,r12
     12addcf:	e8 52 2d 7f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     12addd4:	eb 03                	jmp    12addd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf335d>
     12addd6:	48 89 c3             	mov    rbx,rax

### 0x12b23d9 (0x12b236e..0x12b28ba)
     12b23b1:	4c 89 e7             	mov    rdi,r12
     12b23b4:	e8 b9 03 84 ff       	call   af2772 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f712>
     12b23b9:	84 c0                	test   al,al
     12b23bb:	0f 84 44 01 00 00    	je     12b2505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7a89>
     12b23c1:	49 8b 76 20          	mov    rsi,QWORD PTR [r14+0x20]
     12b23c5:	41 8b 7e 18          	mov    edi,DWORD PTR [r14+0x18]
     12b23c9:	e8 52 94 7c ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12b23ce:	84 c0                	test   al,al
     12b23d0:	74 33                	je     12b2405 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7989>
     12b23d2:	48 8d 35 c4 bf 0a ff 	lea    rsi,[rip+0xffffffffff0abfc4]        # 35e39d <_ZTSSt12bad_any_cast@@Base-0x31e2b>
     12b23d9:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12b23e0:	00 
     12b23e1:	4c 89 f2             	mov    rdx,r14
     12b23e4:	e8 87 c1 53 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>
     12b23e9:	49 8d 7e 18          	lea    rdi,[r14+0x18]
     12b23ed:	4c 8d a4 24 70 04 00 	lea    r12,[rsp+0x470]
     12b23f4:	00 
     12b23f5:	4c 89 e6             	mov    rsi,r12
     12b23f8:	e8 31 96 7c ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12b23fd:	4c 89 e7             	mov    rdi,r12
     12b2400:	e8 8b ba 53 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12b2405:	48 8d bc 24 c0 08 00 	lea    rdi,[rsp+0x8c0]

### 0x12b23ed (0x12b236e..0x12b28ba)
     12b23c5:	41 8b 7e 18          	mov    edi,DWORD PTR [r14+0x18]
     12b23c9:	e8 52 94 7c ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12b23ce:	84 c0                	test   al,al
     12b23d0:	74 33                	je     12b2405 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7989>
     12b23d2:	48 8d 35 c4 bf 0a ff 	lea    rsi,[rip+0xffffffffff0abfc4]        # 35e39d <_ZTSSt12bad_any_cast@@Base-0x31e2b>
     12b23d9:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12b23e0:	00 
     12b23e1:	4c 89 f2             	mov    rdx,r14
     12b23e4:	e8 87 c1 53 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>
     12b23e9:	49 8d 7e 18          	lea    rdi,[r14+0x18]
     12b23ed:	4c 8d a4 24 70 04 00 	lea    r12,[rsp+0x470]
     12b23f4:	00 
     12b23f5:	4c 89 e6             	mov    rsi,r12
     12b23f8:	e8 31 96 7c ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     12b23fd:	4c 89 e7             	mov    rdi,r12
     12b2400:	e8 8b ba 53 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12b2405:	48 8d bc 24 c0 08 00 	lea    rdi,[rsp+0x8c0]
     12b240c:	00 
     12b240d:	48 83 67 f8 00       	and    QWORD PTR [rdi-0x8],0x0
     12b2412:	48 8d 05 df 87 5e 00 	lea    rax,[rip+0x5e87df]        # 189abf8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x7b38>
     12b2419:	48 89 47 f0          	mov    QWORD PTR [rdi-0x10],rax
     12b241d:	0f 57 c0             	xorps  xmm0,xmm0

### 0x12b243a (0x12b236e..0x12b28ba)
     12b2412:	48 8d 05 df 87 5e 00 	lea    rax,[rip+0x5e87df]        # 189abf8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x7b38>
     12b2419:	48 89 47 f0          	mov    QWORD PTR [rdi-0x10],rax
     12b241d:	0f 57 c0             	xorps  xmm0,xmm0
     12b2420:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     12b2423:	0f 11 47 0c          	movups XMMWORD PTR [rdi+0xc],xmm0
     12b2427:	e8 02 c1 ff ff       	call   12ae52e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3ab2>
     12b242c:	48 89 c7             	mov    rdi,rax
     12b242f:	e8 38 c1 ff ff       	call   12ae56c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3af0>
     12b2434:	49 89 c4             	mov    r12,rax
     12b2437:	48 89 c3             	mov    rbx,rax
     12b243a:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12b2441:	00 
     12b2442:	4c 89 f6             	mov    rsi,r14
     12b2445:	e8 ac dd ff ff       	call   12b01f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf577a>
     12b244a:	41 80 4c 24 10 01    	or     BYTE PTR [r12+0x10],0x1
     12b2450:	49 83 c4 28          	add    r12,0x28
     12b2454:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     12b2458:	f6 c2 01             	test   dl,0x1
     12b245b:	0f 85 1b 04 00 00    	jne    12b287c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7e00>
     12b2461:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     12b2468:	00 
     12b2469:	4c 89 e7             	mov    rdi,r12

### 0x12b2461 (0x12b236e..0x12b28ba)
     12b2437:	48 89 c3             	mov    rbx,rax
     12b243a:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12b2441:	00 
     12b2442:	4c 89 f6             	mov    rsi,r14
     12b2445:	e8 ac dd ff ff       	call   12b01f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf577a>
     12b244a:	41 80 4c 24 10 01    	or     BYTE PTR [r12+0x10],0x1
     12b2450:	49 83 c4 28          	add    r12,0x28
     12b2454:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     12b2458:	f6 c2 01             	test   dl,0x1
     12b245b:	0f 85 1b 04 00 00    	jne    12b287c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7e00>
     12b2461:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     12b2468:	00 
     12b2469:	4c 89 e7             	mov    rdi,r12
     12b246c:	e8 75 33 4b 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     12b2471:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12b2478:	00 
     12b2479:	e8 12 ba 53 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12b247e:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
     12b2482:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
     12b2487:	48 8d 94 24 b0 08 00 	lea    rdx,[rsp+0x8b0]
     12b248e:	00 
     12b248f:	4c 89 ef             	mov    rdi,r13

### 0x12b2471 (0x12b236e..0x12b28ba)
     12b2445:	e8 ac dd ff ff       	call   12b01f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf577a>
     12b244a:	41 80 4c 24 10 01    	or     BYTE PTR [r12+0x10],0x1
     12b2450:	49 83 c4 28          	add    r12,0x28
     12b2454:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     12b2458:	f6 c2 01             	test   dl,0x1
     12b245b:	0f 85 1b 04 00 00    	jne    12b287c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7e00>
     12b2461:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     12b2468:	00 
     12b2469:	4c 89 e7             	mov    rdi,r12
     12b246c:	e8 75 33 4b 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     12b2471:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12b2478:	00 
     12b2479:	e8 12 ba 53 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12b247e:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
     12b2482:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
     12b2487:	48 8d 94 24 b0 08 00 	lea    rdx,[rsp+0x8b0]
     12b248e:	00 
     12b248f:	4c 89 ef             	mov    rdi,r13
     12b2492:	e8 23 04 00 00       	call   12b28ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7e3e>
     12b2497:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
     12b249c:	4c 89 7b f8          	mov    QWORD PTR [rbx-0x8],r15
     12b24a0:	48 89 df             	mov    rdi,rbx

### 0x12b24eb (0x12b236e..0x12b28ba) WRITE
     12b24bb:	e8 31 05 00 00       	call   12b29f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7f75>
     12b24c0:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
     12b24c5:	49 8d 7f 08          	lea    rdi,[r15+0x8]
     12b24c9:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     12b24ce:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
     12b24d3:	e8 5e c6 82 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     12b24d8:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     12b24dd:	4d 85 f6             	test   r14,r14
     12b24e0:	0f 84 1f 01 00 00    	je     12b2605 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7b89>
     12b24e6:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     12b24eb:	4c 89 bc 24 70 04 00 	mov    QWORD PTR [rsp+0x470],r15
     12b24f2:	00 
     12b24f3:	4c 89 b4 24 78 04 00 	mov    QWORD PTR [rsp+0x478],r14
     12b24fa:	00 
     12b24fb:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     12b2500:	e9 11 01 00 00       	jmp    12b2616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7b9a>
     12b2505:	48 8d bc 24 c0 08 00 	lea    rdi,[rsp+0x8c0]
     12b250c:	00 
     12b250d:	48 83 67 f8 00       	and    QWORD PTR [rdi-0x8],0x0
     12b2512:	48 8d 05 df 86 5e 00 	lea    rax,[rip+0x5e86df]        # 189abf8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x7b38>
     12b2519:	48 89 47 f0          	mov    QWORD PTR [rdi-0x10],rax
     12b251d:	0f 57 c0             	xorps  xmm0,xmm0

### 0x12b25cd (0x12b236e..0x12b28ba) WRITE
     12b259d:	e8 4f 04 00 00       	call   12b29f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7f75>
     12b25a2:	48 8b 6c 24 30       	mov    rbp,QWORD PTR [rsp+0x30]
     12b25a7:	48 8d 7d 08          	lea    rdi,[rbp+0x8]
     12b25ab:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     12b25b0:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
     12b25b5:	e8 7c c5 82 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     12b25ba:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     12b25bf:	4d 85 f6             	test   r14,r14
     12b25c2:	0f 84 3c 01 00 00    	je     12b2704 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7c88>
     12b25c8:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     12b25cd:	48 89 ac 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rbp
     12b25d4:	00 
     12b25d5:	4c 89 b4 24 78 04 00 	mov    QWORD PTR [rsp+0x478],r14
     12b25dc:	00 
     12b25dd:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     12b25e2:	e9 2e 01 00 00       	jmp    12b2715 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7c99>
     12b25e7:	0f 57 c0             	xorps  xmm0,xmm0
     12b25ea:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     12b25ee:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     12b25f1:	e9 01 01 00 00       	jmp    12b26f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7c7b>
     12b25f6:	0f 57 c0             	xorps  xmm0,xmm0
     12b25f9:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]

### 0x12b2605 (0x12b236e..0x12b28ba) WRITE
     12b25dd:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     12b25e2:	e9 2e 01 00 00       	jmp    12b2715 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7c99>
     12b25e7:	0f 57 c0             	xorps  xmm0,xmm0
     12b25ea:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     12b25ee:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     12b25f1:	e9 01 01 00 00       	jmp    12b26f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7c7b>
     12b25f6:	0f 57 c0             	xorps  xmm0,xmm0
     12b25f9:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     12b25fd:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     12b2600:	e9 1b 02 00 00       	jmp    12b2820 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7da4>
     12b2605:	4c 89 bc 24 70 04 00 	mov    QWORD PTR [rsp+0x470],r15
     12b260c:	00 
     12b260d:	48 83 a4 24 78 04 00 	and    QWORD PTR [rsp+0x478],0x0
     12b2614:	00 00 
     12b2616:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     12b261b:	4c 8d ac 24 88 04 00 	lea    r13,[rsp+0x488]
     12b2622:	00 
     12b2623:	49 89 45 f8          	mov    QWORD PTR [r13-0x8],rax
     12b2627:	4c 89 ef             	mov    rdi,r13
     12b262a:	48 89 de             	mov    rsi,rbx
     12b262d:	e8 90 dd 41 00       	call   16d03c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8452e>
     12b2632:	bf 40 04 00 00       	mov    edi,0x440

### 0x12b263f (0x12b236e..0x12b28ba)
     12b2616:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     12b261b:	4c 8d ac 24 88 04 00 	lea    r13,[rsp+0x488]
     12b2622:	00 
     12b2623:	49 89 45 f8          	mov    QWORD PTR [r13-0x8],rax
     12b2627:	4c 89 ef             	mov    rdi,r13
     12b262a:	48 89 de             	mov    rsi,rbx
     12b262d:	e8 90 dd 41 00       	call   16d03c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8452e>
     12b2632:	bf 40 04 00 00       	mov    edi,0x440
     12b2637:	e8 c4 b8 53 00       	call   17edf00 <_Znwm@plt>
     12b263c:	48 89 c5             	mov    rbp,rax
     12b263f:	48 8b 84 24 70 04 00 	mov    rax,QWORD PTR [rsp+0x470]
     12b2646:	00 
     12b2647:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     12b264b:	48 8b 84 24 78 04 00 	mov    rax,QWORD PTR [rsp+0x478]
     12b2652:	00 
     12b2653:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     12b2657:	48 85 c0             	test   rax,rax
     12b265a:	74 05                	je     12b2661 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7be5>
     12b265c:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     12b2661:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     12b2668:	00 
     12b2669:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]

### 0x12b2661 (0x12b236e..0x12b28ba)
     12b263c:	48 89 c5             	mov    rbp,rax
     12b263f:	48 8b 84 24 70 04 00 	mov    rax,QWORD PTR [rsp+0x470]
     12b2646:	00 
     12b2647:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     12b264b:	48 8b 84 24 78 04 00 	mov    rax,QWORD PTR [rsp+0x478]
     12b2652:	00 
     12b2653:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     12b2657:	48 85 c0             	test   rax,rax
     12b265a:	74 05                	je     12b2661 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7be5>
     12b265c:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     12b2661:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     12b2668:	00 
     12b2669:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     12b266d:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
     12b2671:	48 89 ef             	mov    rdi,rbp
     12b2674:	48 83 c7 28          	add    rdi,0x28
     12b2678:	4c 89 ee             	mov    rsi,r13
     12b267b:	e8 2c dc 41 00       	call   16d02ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84418>
     12b2680:	48 8d 05 b7 03 00 00 	lea    rax,[rip+0x3b7]        # 12b2a3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7fc2>
     12b2687:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     12b268b:	48 8d 05 fe 0e 00 00 	lea    rax,[rip+0xefe]        # 12b3590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf8b14>
     12b2692:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax

### 0x12b26b4 (0x12b236e..0x12b28ba)
     12b268b:	48 8d 05 fe 0e 00 00 	lea    rax,[rip+0xefe]        # 12b3590 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf8b14>
     12b2692:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     12b2696:	4c 89 e7             	mov    rdi,r12
     12b2699:	48 89 ee             	mov    rsi,rbp
     12b269c:	e8 85 56 d0 ff       	call   fb7d26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f13c>
     12b26a1:	48 89 df             	mov    rdi,rbx
     12b26a4:	e8 f1 0e 00 00       	call   12b359a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf8b1e>
     12b26a9:	0f 57 c0             	xorps  xmm0,xmm0
     12b26ac:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     12b26af:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12b26b4:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     12b26bb:	00 
     12b26bc:	48 89 de             	mov    rsi,rbx
     12b26bf:	e8 58 71 80 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     12b26c4:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     12b26c8:	e8 b9 bd 7e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12b26cd:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     12b26d1:	4c 89 38             	mov    QWORD PTR [rax],r15
     12b26d4:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     12b26d8:	4d 85 f6             	test   r14,r14
     12b26db:	74 05                	je     12b26e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7c66>
     12b26dd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]

### 0x12b2704 (0x12b236e..0x12b28ba) WRITE
     12b26db:	74 05                	je     12b26e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7c66>
     12b26dd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     12b26e2:	4c 89 f7             	mov    rdi,r14
     12b26e5:	e8 c8 bd 7e ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     12b26ea:	4c 89 f7             	mov    rdi,r14
     12b26ed:	e8 94 bd 7e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12b26f2:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
     12b26f7:	48 89 df             	mov    rdi,rbx
     12b26fa:	e8 91 dc 41 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
     12b26ff:	e9 26 01 00 00       	jmp    12b282a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7dae>
     12b2704:	48 89 ac 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rbp
     12b270b:	00 
     12b270c:	48 83 a4 24 78 04 00 	and    QWORD PTR [rsp+0x478],0x0
     12b2713:	00 00 
     12b2715:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
     12b271a:	0f 11 84 24 80 04 00 	movups XMMWORD PTR [rsp+0x480],xmm0
     12b2721:	00 
     12b2722:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     12b2727:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
     12b272e:	00 
     12b272f:	48 85 c0             	test   rax,rax
     12b2732:	74 05                	je     12b2739 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7cbd>

### 0x12b277d (0x12b236e..0x12b28ba)
     12b2756:	49 89 c4             	mov    r12,rax
     12b2759:	48 8d 84 24 88 04 00 	lea    rax,[rsp+0x488]
     12b2760:	00 
     12b2761:	48 8b 48 e8          	mov    rcx,QWORD PTR [rax-0x18]
     12b2765:	49 89 4c 24 10       	mov    QWORD PTR [r12+0x10],rcx
     12b276a:	48 8b 48 f0          	mov    rcx,QWORD PTR [rax-0x10]
     12b276e:	49 89 4c 24 18       	mov    QWORD PTR [r12+0x18],rcx
     12b2773:	48 85 c9             	test   rcx,rcx
     12b2776:	74 05                	je     12b277d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7d01>
     12b2778:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
     12b277d:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     12b2784:	00 
     12b2785:	0f 10 43 10          	movups xmm0,XMMWORD PTR [rbx+0x10]
     12b2789:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
     12b278f:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
     12b2793:	49 89 4c 24 30       	mov    QWORD PTR [r12+0x30],rcx
     12b2798:	0f 57 c0             	xorps  xmm0,xmm0
     12b279b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     12b279e:	4c 89 e7             	mov    rdi,r12
     12b27a1:	48 83 c7 38          	add    rdi,0x38
     12b27a5:	4c 89 ee             	mov    rsi,r13
     12b27a8:	e8 ff da 41 00       	call   16d02ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84418>

### 0x12b27e2 (0x12b236e..0x12b28ba)
     12b27b8:	48 8d 05 49 10 00 00 	lea    rax,[rip+0x1049]        # 12b3808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf8d8c>
     12b27bf:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
     12b27c4:	4c 89 ff             	mov    rdi,r15
     12b27c7:	4c 89 e6             	mov    rsi,r12
     12b27ca:	e8 57 55 d0 ff       	call   fb7d26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f13c>
     12b27cf:	48 89 df             	mov    rdi,rbx
     12b27d2:	e8 3b 10 00 00       	call   12b3812 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf8d96>
     12b27d7:	0f 57 c0             	xorps  xmm0,xmm0
     12b27da:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     12b27dd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12b27e2:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     12b27e9:	00 
     12b27ea:	48 89 de             	mov    rsi,rbx
     12b27ed:	e8 2a 70 80 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     12b27f2:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     12b27f6:	e8 8b bc 7e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12b27fb:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     12b27ff:	48 89 28             	mov    QWORD PTR [rax],rbp
     12b2802:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     12b2806:	4d 85 f6             	test   r14,r14
     12b2809:	74 05                	je     12b2810 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7d94>
     12b280b:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]

### 0x12c1a67 (0x12c186c..0x12c2351)
     12c1a3a:	48 89 ee             	mov    rsi,rbp
     12c1a3d:	e8 4e 88 7b ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     12c1a42:	c6 84 24 d0 05 00 00 	mov    BYTE PTR [rsp+0x5d0],0x1
     12c1a49:	01 
     12c1a4a:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     12c1a51:	00 
     12c1a52:	e8 6d d7 ff ff       	call   12bf1c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104748>
     12c1a57:	e9 9c 00 00 00       	jmp    12c1af8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10707c>
     12c1a5c:	48 8b b3 00 01 00 00 	mov    rsi,QWORD PTR [rbx+0x100]
     12c1a63:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     12c1a67:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1a6e:	00 
     12c1a6f:	e8 cc c4 52 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12c1a74:	48 8d 35 02 85 17 ff 	lea    rsi,[rip+0xffffffffff178502]        # 439f7d <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f9cc>
     12c1a7b:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1a82:	00 
     12c1a83:	e8 c7 9d 7b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12c1a88:	84 c0                	test   al,al
     12c1a8a:	75 1c                	jne    12c1aa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10702c>
     12c1a8c:	48 8d 35 c8 74 0a ff 	lea    rsi,[rip+0xffffffffff0a74c8]        # 368f5b <_ZTSSt12bad_any_cast@@Base-0x2726d>
     12c1a93:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1a9a:	00 

### 0x12c1a7b (0x12c186c..0x12c2351)
     12c1a4a:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     12c1a51:	00 
     12c1a52:	e8 6d d7 ff ff       	call   12bf1c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104748>
     12c1a57:	e9 9c 00 00 00       	jmp    12c1af8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10707c>
     12c1a5c:	48 8b b3 00 01 00 00 	mov    rsi,QWORD PTR [rbx+0x100]
     12c1a63:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     12c1a67:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1a6e:	00 
     12c1a6f:	e8 cc c4 52 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12c1a74:	48 8d 35 02 85 17 ff 	lea    rsi,[rip+0xffffffffff178502]        # 439f7d <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f9cc>
     12c1a7b:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1a82:	00 
     12c1a83:	e8 c7 9d 7b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12c1a88:	84 c0                	test   al,al
     12c1a8a:	75 1c                	jne    12c1aa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10702c>
     12c1a8c:	48 8d 35 c8 74 0a ff 	lea    rsi,[rip+0xffffffffff0a74c8]        # 368f5b <_ZTSSt12bad_any_cast@@Base-0x2726d>
     12c1a93:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1a9a:	00 
     12c1a9b:	e8 af 9d 7b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12c1aa0:	84 c0                	test   al,al
     12c1aa2:	0f 84 f6 01 00 00    	je     12c1c9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107222>
     12c1aa8:	48 8d 94 24 f0 00 00 	lea    rdx,[rsp+0xf0]

### 0x12c1a93 (0x12c186c..0x12c2351)
     12c1a67:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1a6e:	00 
     12c1a6f:	e8 cc c4 52 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12c1a74:	48 8d 35 02 85 17 ff 	lea    rsi,[rip+0xffffffffff178502]        # 439f7d <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f9cc>
     12c1a7b:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1a82:	00 
     12c1a83:	e8 c7 9d 7b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12c1a88:	84 c0                	test   al,al
     12c1a8a:	75 1c                	jne    12c1aa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10702c>
     12c1a8c:	48 8d 35 c8 74 0a ff 	lea    rsi,[rip+0xffffffffff0a74c8]        # 368f5b <_ZTSSt12bad_any_cast@@Base-0x2726d>
     12c1a93:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1a9a:	00 
     12c1a9b:	e8 af 9d 7b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12c1aa0:	84 c0                	test   al,al
     12c1aa2:	0f 84 f6 01 00 00    	je     12c1c9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107222>
     12c1aa8:	48 8d 94 24 f0 00 00 	lea    rdx,[rsp+0xf0]
     12c1aaf:	00 
     12c1ab0:	48 89 1a             	mov    QWORD PTR [rdx],rbx
     12c1ab3:	48 8d 05 aa a9 7b ff 	lea    rax,[rip+0xffffffffff7ba9aa]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     12c1aba:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     12c1abe:	48 8d 05 8d 08 00 00 	lea    rax,[rip+0x88d]        # 12c2352 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1078d6>
     12c1ac5:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax

### 0x12c1aea (0x12c186c..0x12c2351) WRITE
     12c1abe:	48 8d 05 8d 08 00 00 	lea    rax,[rip+0x88d]        # 12c2352 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1078d6>
     12c1ac5:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
     12c1ac9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     12c1ace:	48 89 df             	mov    rdi,rbx
     12c1ad1:	e8 9c 08 00 00       	call   12c2372 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1078f6>
     12c1ad6:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     12c1add:	00 
     12c1ade:	e8 bb 57 7e ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     12c1ae3:	e9 ff 01 00 00       	jmp    12c1ce7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10726b>
     12c1ae8:	31 c0                	xor    eax,eax
     12c1aea:	88 84 24 70 04 00 00 	mov    BYTE PTR [rsp+0x470],al
     12c1af1:	88 84 24 d0 05 00 00 	mov    BYTE PTR [rsp+0x5d0],al
     12c1af8:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     12c1aff:	00 
     12c1b00:	e8 f5 d6 ff ff       	call   12bf1fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10477e>
     12c1b05:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     12c1b0c:	00 
     12c1b0d:	e8 58 84 7b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     12c1b12:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     12c1b19:	00 
     12c1b1a:	e8 4b 84 7b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     12c1b1f:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]

### 0x12c1b42 (0x12c186c..0x12c2351)
     12c1b19:	00 
     12c1b1a:	e8 4b 84 7b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     12c1b1f:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
     12c1b26:	00 
     12c1b27:	e8 3e 84 7b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     12c1b2c:	80 bc 24 d0 05 00 00 	cmp    BYTE PTR [rsp+0x5d0],0x0
     12c1b33:	00 
     12c1b34:	0f 84 d9 00 00 00    	je     12c1c13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107197>
     12c1b3a:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     12c1b41:	00 
     12c1b42:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     12c1b49:	00 
     12c1b4a:	e8 cd 11 00 00       	call   12c2d1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1082a0>
     12c1b4f:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     12c1b53:	48 8b 70 18          	mov    rsi,QWORD PTR [rax+0x18]
     12c1b57:	48 8d 8c 24 f0 00 00 	lea    rcx,[rsp+0xf0]
     12c1b5e:	00 
     12c1b5f:	83 61 38 00          	and    DWORD PTR [rcx+0x38],0x0
     12c1b63:	0f 57 c0             	xorps  xmm0,xmm0
     12c1b66:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
     12c1b69:	0f 29 41 10          	movaps XMMWORD PTR [rcx+0x10],xmm0
     12c1b6d:	0f 29 41 20          	movaps XMMWORD PTR [rcx+0x20],xmm0

### 0x12c1ce7 (0x12c186c..0x12c2351)
     12c1cbf:	e8 ac c8 52 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>
     12c1cc4:	49 8b 06             	mov    rax,QWORD PTR [r14]
     12c1cc7:	48 8d 94 24 f0 00 00 	lea    rdx,[rsp+0xf0]
     12c1cce:	00 
     12c1ccf:	4c 89 f7             	mov    rdi,r14
     12c1cd2:	be 90 01 00 00       	mov    esi,0x190
     12c1cd7:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12c1cda:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     12c1ce1:	00 
     12c1ce2:	e8 a9 c1 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c1ce7:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1cee:	00 
     12c1cef:	e9 c2 00 00 00       	jmp    12c1db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10733a>
     12c1cf4:	48 8d 94 24 71 02 00 	lea    rdx,[rsp+0x271]
     12c1cfb:	00 
     12c1cfc:	48 8d 35 4e 5b 0c ff 	lea    rsi,[rip+0xffffffffff0c5b4e]        # 387851 <_ZTSSt12bad_any_cast@@Base-0x8977>
     12c1d03:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     12c1d0a:	00 
     12c1d0b:	4c 89 ff             	mov    rdi,r15
     12c1d0e:	31 c0                	xor    eax,eax
     12c1d10:	e8 85 9f 51 00       	call   17dbc9a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x7abb>
     12c1d15:	49 89 e4             	mov    r12,rsp

### 0x12c1da6 (0x12c186c..0x12c2351)
     12c1d80:	00 
     12c1d81:	48 89 df             	mov    rdi,rbx
     12c1d84:	be c3 01 00 00       	mov    esi,0x1c3
     12c1d89:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12c1d8c:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     12c1d93:	00 
     12c1d94:	e8 f7 c0 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c1d99:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     12c1da0:	00 
     12c1da1:	e8 1e d4 ff ff       	call   12bf1c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104748>
     12c1da6:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c1dad:	00 
     12c1dae:	e8 1d 12 00 00       	call   12c2fd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108554>
     12c1db3:	48 89 e7             	mov    rdi,rsp
     12c1db6:	e8 d5 c0 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c1dbb:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     12c1dc0:	e8 61 ed 7d ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     12c1dc5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12c1dcc:	00 00 
     12c1dce:	48 3b 84 24 e0 05 00 	cmp    rax,QWORD PTR [rsp+0x5e0]
     12c1dd5:	00 
     12c1dd6:	0f 85 6b 05 00 00    	jne    12c2347 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1078cb>

### 0x12c2220 (0x12c186c..0x12c2351)
     12c21f7:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     12c21fe:	00 
     12c21ff:	e8 8c bc 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c2204:	e9 f7 00 00 00       	jmp    12c2300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107884>
     12c2209:	e9 ef 00 00 00       	jmp    12c22fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107881>
     12c220e:	eb 66                	jmp    12c2276 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1077fa>
     12c2210:	48 89 c3             	mov    rbx,rax
     12c2213:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     12c221a:	00 
     12c221b:	e8 7e 50 7e ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     12c2220:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c2227:	00 
     12c2228:	e9 f0 00 00 00       	jmp    12c231d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1078a1>
     12c222d:	48 89 c3             	mov    rbx,rax
     12c2230:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     12c2237:	00 
     12c2238:	e9 e0 00 00 00       	jmp    12c231d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1078a1>
     12c223d:	eb 00                	jmp    12c223f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1077c3>
     12c223f:	48 89 c3             	mov    rbx,rax
     12c2242:	e9 db 00 00 00       	jmp    12c2322 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1078a6>
     12c2247:	48 89 c3             	mov    rbx,rax
     12c224a:	4c 89 e7             	mov    rdi,r12

### 0x12c230d (0x12c186c..0x12c2351)
     12c22e8:	00 
     12c22e9:	e8 7c 7c 7b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     12c22ee:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
     12c22f5:	00 
     12c22f6:	e8 6f 7c 7b ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     12c22fb:	eb 1d                	jmp    12c231a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10789e>
     12c22fd:	48 89 c3             	mov    rbx,rax
     12c2300:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     12c2307:	00 
     12c2308:	e8 b7 ce ff ff       	call   12bf1c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104748>
     12c230d:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12c2314:	00 
     12c2315:	e8 b6 0c 00 00       	call   12c2fd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108554>
     12c231a:	48 89 e7             	mov    rdi,rsp
     12c231d:	e8 6e bb 52 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12c2322:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     12c2327:	e8 fa e7 7d ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     12c232c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12c2333:	00 00 
     12c2335:	48 3b 84 24 e0 05 00 	cmp    rax,QWORD PTR [rsp+0x5e0]
     12c233c:	00 
     12c233d:	75 08                	jne    12c2347 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1078cb>

### 0x12cb719 (0x12cb106..0x12cbc74)
     12cb6e5:	0f 57 c0             	xorps  xmm0,xmm0
     12cb6e8:	0f 11 83 38 04 00 00 	movups XMMWORD PTR [rbx+0x438],xmm0
     12cb6ef:	48 83 a3 48 04 00 00 	and    QWORD PTR [rbx+0x448],0x0
     12cb6f6:	00 
     12cb6f7:	48 8d bb 50 04 00 00 	lea    rdi,[rbx+0x450]
     12cb6fe:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     12cb703:	e8 ee e2 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb708:	48 8d bb 60 04 00 00 	lea    rdi,[rbx+0x460]
     12cb70f:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     12cb714:	e8 dd e2 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb719:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     12cb720:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     12cb725:	e8 cc e2 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb72a:	48 8d bb 80 04 00 00 	lea    rdi,[rbx+0x480]
     12cb731:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
     12cb736:	e8 bb e2 50 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12cb73b:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
     12cb742:	00 
     12cb743:	48 83 a3 f8 04 00 00 	and    QWORD PTR [rbx+0x4f8],0x0
     12cb74a:	00 
     12cb74b:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
     12cb752:	00 

### 0x12cd059 (0x12ccf68..0x12cd22e)
     12cd01d:	48 8d bb 18 05 00 00 	lea    rdi,[rbx+0x518]
     12cd024:	e8 21 f0 ff ff       	call   12cc04a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1115ce>
     12cd029:	48 8d bb f8 04 00 00 	lea    rdi,[rbx+0x4f8]
     12cd030:	e8 3b f0 ff ff       	call   12cc070 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1115f4>
     12cd035:	48 8d bb d8 04 00 00 	lea    rdi,[rbx+0x4d8]
     12cd03c:	e8 55 f0 ff ff       	call   12cc096 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11161a>
     12cd041:	48 8d bb 90 04 00 00 	lea    rdi,[rbx+0x490]
     12cd048:	e8 1f 2f 95 ff       	call   c1ff6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16cf0c>
     12cd04d:	48 8d bb 80 04 00 00 	lea    rdi,[rbx+0x480]
     12cd054:	e8 7b cb 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cd059:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     12cd060:	e8 6f cb 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cd065:	48 8d bb 60 04 00 00 	lea    rdi,[rbx+0x460]
     12cd06c:	e8 63 cb 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cd071:	48 8d bb 50 04 00 00 	lea    rdi,[rbx+0x450]
     12cd078:	e8 57 cb 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cd07d:	48 8d bb 38 04 00 00 	lea    rdi,[rbx+0x438]
     12cd084:	e8 d5 dd dc ff       	call   109ae5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262274>
     12cd089:	48 8d bb 28 04 00 00 	lea    rdi,[rbx+0x428]
     12cd090:	e8 3f cb 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     12cd095:	48 8d bb 18 04 00 00 	lea    rdi,[rbx+0x418]
     12cd09c:	e8 33 cb 50 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>

### 0x12cdf95 (0x12cd240..0x12cf4c0)
     12cdf75:	41 59                	pop    r9
     12cdf77:	4c 89 ff             	mov    rdi,r15
     12cdf7a:	31 d2                	xor    edx,edx
     12cdf7c:	e8 13 c8 50 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     12cdf81:	49 8b 06             	mov    rax,QWORD PTR [r14]
     12cdf84:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     12cdf8b:	00 
     12cdf8c:	4c 89 f6             	mov    rsi,r14
     12cdf8f:	4c 89 fa             	mov    rdx,r15
     12cdf92:	ff 50 20             	call   QWORD PTR [rax+0x20]
     12cdf95:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     12cdf9c:	4c 8d b4 24 40 02 00 	lea    r14,[rsp+0x240]
     12cdfa3:	00 
     12cdfa4:	4c 89 f6             	mov    rsi,r14
     12cdfa7:	e8 46 bc 50 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     12cdfac:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     12cdfb0:	e8 d1 04 7d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12cdfb5:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     12cdfbc:	00 
     12cdfbd:	e8 26 c8 50 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     12cdfc2:	80 7c 24 70 00       	cmp    BYTE PTR [rsp+0x70],0x0
     12cdfc7:	0f 84 f6 00 00 00    	je     12ce0c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x113647>

### 0x12f09a7 (0x12f072f..0x12f0afb)
     12f097d:	00 
     12f097e:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     12f0985:	00 
     12f0986:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
     12f098d:	48 8d 84 24 d0 00 00 	lea    rax,[rsp+0xd0]
     12f0994:	00 
     12f0995:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     12f0998:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     12f099d:	48 89 df             	mov    rdi,rbx
     12f09a0:	48 8d 35 8c fb 05 ff 	lea    rsi,[rip+0xffffffffff05fb8c]        # 350533 <_ZTSSt12bad_any_cast@@Base-0x3fc95>
     12f09a7:	48 8b 94 24 70 04 00 	mov    rdx,QWORD PTR [rsp+0x470]
     12f09ae:	00 
     12f09af:	e8 bc db 4f 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>
     12f09b4:	4c 89 e7             	mov    rdi,r12
     12f09b7:	48 89 de             	mov    rsi,rbx
     12f09ba:	48 8d 15 80 29 06 ff 	lea    rdx,[rip+0xffffffffff062980]        # 353341 <_ZTSSt12bad_any_cast@@Base-0x3ce87>
     12f09c1:	e8 77 aa 7a ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
     12f09c6:	48 89 ef             	mov    rdi,rbp
     12f09c9:	4c 89 ee             	mov    rsi,r13
     12f09cc:	e8 5f e1 4f 00       	call   17eeb30 <_ZNSt6__ndk19to_stringEm@plt>
     12f09d1:	4c 89 f7             	mov    rdi,r14
     12f09d4:	4c 89 e6             	mov    rsi,r12

### 0x12fed77 (0x12feb98..0x12ff8c1)
     12fed50:	00 
     12fed51:	48 89 ee             	mov    rsi,rbp
     12fed54:	4c 89 ea             	mov    rdx,r13
     12fed57:	e8 5e 15 00 00       	call   13002ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14583e>
     12fed5c:	4c 8d a4 24 e8 00 00 	lea    r12,[rsp+0xe8]
     12fed63:	00 
     12fed64:	4c 89 e7             	mov    rdi,r12
     12fed67:	48 8d 35 62 84 13 ff 	lea    rsi,[rip+0xffffffffff138462]        # 4371d0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cc1f>
     12fed6e:	e8 cd f1 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12fed73:	4d 8d 6e 30          	lea    r13,[r14+0x30]
     12fed77:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     12fed7e:	00 
     12fed7f:	48 89 df             	mov    rdi,rbx
     12fed82:	4c 89 ee             	mov    rsi,r13
     12fed85:	4c 89 e2             	mov    rdx,r12
     12fed88:	e8 2d 15 00 00       	call   13002ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14583e>
     12fed8d:	48 8d bc 24 e8 04 00 	lea    rdi,[rsp+0x4e8]
     12fed94:	00 
     12fed95:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     12fed9c:	00 
     12fed9d:	48 8d 94 24 d0 02 00 	lea    rdx,[rsp+0x2d0]
     12feda4:	00 

### 0x12feec3 (0x12feb98..0x12ff8c1)
     12fee99:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     12feea0:	00 
     12feea1:	48 89 c6             	mov    rsi,rax
     12feea4:	e8 97 f0 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12feea9:	4c 89 e7             	mov    rdi,r12
     12feeac:	e8 df ef 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12feeb1:	4c 89 e7             	mov    rdi,r12
     12feeb4:	48 8d 35 cb c3 08 ff 	lea    rsi,[rip+0xffffffffff08c3cb]        # 38b286 <_ZTSSt12bad_any_cast@@Base-0x4f42>
     12feebb:	e8 be ab 77 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12feec0:	0f 57 c0             	xorps  xmm0,xmm0
     12feec3:	0f 29 84 24 70 04 00 	movaps XMMWORD PTR [rsp+0x470],xmm0
     12feeca:	00 
     12feecb:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     12feed2:	00 00 
     12feed4:	48 89 ef             	mov    rdi,rbp
     12feed7:	4c 89 e6             	mov    rsi,r12
     12feeda:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     12feee1:	00 
     12feee2:	48 89 da             	mov    rdx,rbx
     12feee5:	e8 f2 a6 8d ff       	call   bd95dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12657c>
     12feeea:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     12feeef:	48 89 c6             	mov    rsi,rax

### 0x12feeda (0x12feb98..0x12ff8c1)
     12feeb1:	4c 89 e7             	mov    rdi,r12
     12feeb4:	48 8d 35 cb c3 08 ff 	lea    rsi,[rip+0xffffffffff08c3cb]        # 38b286 <_ZTSSt12bad_any_cast@@Base-0x4f42>
     12feebb:	e8 be ab 77 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12feec0:	0f 57 c0             	xorps  xmm0,xmm0
     12feec3:	0f 29 84 24 70 04 00 	movaps XMMWORD PTR [rsp+0x470],xmm0
     12feeca:	00 
     12feecb:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     12feed2:	00 00 
     12feed4:	48 89 ef             	mov    rdi,rbp
     12feed7:	4c 89 e6             	mov    rsi,r12
     12feeda:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     12feee1:	00 
     12feee2:	48 89 da             	mov    rdx,rbx
     12feee5:	e8 f2 a6 8d ff       	call   bd95dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12657c>
     12feeea:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     12feeef:	48 89 c6             	mov    rsi,rax
     12feef2:	e8 49 f0 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12feef7:	48 89 df             	mov    rdi,rbx
     12feefa:	e8 91 ef 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12feeff:	4c 89 e7             	mov    rdi,r12
     12fef02:	e8 89 ef 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12fef07:	4c 89 e7             	mov    rdi,r12

### 0x12fef3d (0x12feb98..0x12ff8c1)
     12fef19:	00 
     12fef1a:	48 89 df             	mov    rdi,rbx
     12fef1d:	48 89 ee             	mov    rsi,rbp
     12fef20:	e8 90 3b 00 00       	call   1302ab5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148039>
     12fef25:	0f 10 84 24 d0 02 00 	movups xmm0,XMMWORD PTR [rsp+0x2d0]
     12fef2c:	00 
     12fef2d:	0f 10 8c 24 e0 02 00 	movups xmm1,XMMWORD PTR [rsp+0x2e0]
     12fef34:	00 
     12fef35:	0f 29 8c 24 80 04 00 	movaps XMMWORD PTR [rsp+0x480],xmm1
     12fef3c:	00 
     12fef3d:	0f 29 84 24 70 04 00 	movaps XMMWORD PTR [rsp+0x470],xmm0
     12fef44:	00 
     12fef45:	48 8d 84 24 20 04 00 	lea    rax,[rsp+0x420]
     12fef4c:	00 
     12fef4d:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     12fef50:	0f 10 48 10          	movups xmm1,XMMWORD PTR [rax+0x10]
     12fef54:	48 8d 84 24 78 04 00 	lea    rax,[rsp+0x478]
     12fef5b:	00 
     12fef5c:	0f 11 48 28          	movups XMMWORD PTR [rax+0x28],xmm1
     12fef60:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
     12fef64:	0f 57 c0             	xorps  xmm0,xmm0
     12fef67:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0

### 0x12fefc8 (0x12feb98..0x12ff8c1)
     12fef9c:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
     12fefa3:	00 
     12fefa4:	e8 a5 e4 bd ff       	call   edd44e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4864>
     12fefa9:	c7 84 24 28 03 00 00 	mov    DWORD PTR [rsp+0x328],0x1
     12fefb0:	01 00 00 00 
     12fefb4:	0f 10 84 24 99 04 00 	movups xmm0,XMMWORD PTR [rsp+0x499]
     12fefbb:	00 
     12fefbc:	48 8d 84 24 30 03 00 	lea    rax,[rsp+0x330]
     12fefc3:	00 
     12fefc4:	0f 11 40 29          	movups XMMWORD PTR [rax+0x29],xmm0
     12fefc8:	0f 28 84 24 70 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x470]
     12fefcf:	00 
     12fefd0:	0f 28 8c 24 80 04 00 	movaps xmm1,XMMWORD PTR [rsp+0x480]
     12fefd7:	00 
     12fefd8:	0f 28 94 24 90 04 00 	movaps xmm2,XMMWORD PTR [rsp+0x490]
     12fefdf:	00 
     12fefe0:	0f 11 50 20          	movups XMMWORD PTR [rax+0x20],xmm2
     12fefe4:	0f 11 48 10          	movups XMMWORD PTR [rax+0x10],xmm1
     12fefe8:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     12fefeb:	0f 28 84 24 b0 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x4b0]
     12feff2:	00 
     12feff3:	0f 11 84 24 70 03 00 	movups XMMWORD PTR [rsp+0x370],xmm0

### 0x12ff1fd (0x12feb98..0x12ff8c1)
     12ff1d0:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     12ff1d5:	e9 8d 02 00 00       	jmp    12ff467 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1449eb>
     12ff1da:	89 84 24 d0 02 00 00 	mov    DWORD PTR [rsp+0x2d0],eax
     12ff1e1:	83 a4 24 28 03 00 00 	and    DWORD PTR [rsp+0x328],0x0
     12ff1e8:	00 
     12ff1e9:	0f 10 84 24 99 04 00 	movups xmm0,XMMWORD PTR [rsp+0x499]
     12ff1f0:	00 
     12ff1f1:	48 8d 84 24 30 03 00 	lea    rax,[rsp+0x330]
     12ff1f8:	00 
     12ff1f9:	0f 11 40 29          	movups XMMWORD PTR [rax+0x29],xmm0
     12ff1fd:	0f 28 84 24 70 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x470]
     12ff204:	00 
     12ff205:	0f 28 8c 24 80 04 00 	movaps xmm1,XMMWORD PTR [rsp+0x480]
     12ff20c:	00 
     12ff20d:	0f 28 94 24 90 04 00 	movaps xmm2,XMMWORD PTR [rsp+0x490]
     12ff214:	00 
     12ff215:	0f 11 50 20          	movups XMMWORD PTR [rax+0x20],xmm2
     12ff219:	0f 11 48 10          	movups XMMWORD PTR [rax+0x10],xmm1
     12ff21d:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     12ff220:	0f 28 84 24 b0 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x4b0]
     12ff227:	00 
     12ff228:	0f 11 84 24 70 03 00 	movups XMMWORD PTR [rsp+0x370],xmm0

### 0x12ff346 (0x12feb98..0x12ff8c1)
     12ff31d:	0f 29 4c 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm1
     12ff322:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     12ff329:	00 00 
     12ff32b:	4c 89 ff             	mov    rdi,r15
     12ff32e:	4c 8d a4 24 d0 02 00 	lea    r12,[rsp+0x2d0]
     12ff335:	00 
     12ff336:	4c 89 e6             	mov    rsi,r12
     12ff339:	e8 06 10 00 00       	call   1300344 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1458c8>
     12ff33e:	4c 89 e7             	mov    rdi,r12
     12ff341:	e8 d8 98 ef ff       	call   11f8c1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e1a2>
     12ff346:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12ff34d:	00 
     12ff34e:	e8 75 f5 90 ff       	call   c0e8c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15b868>
     12ff353:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     12ff358:	e8 33 eb 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12ff35d:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     12ff364:	00 
     12ff365:	e8 26 eb 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12ff36a:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     12ff371:	00 
     12ff372:	e8 19 eb 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12ff377:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]

### 0x12ff4c8 (0x12feb98..0x12ff8c1)
     12ff49f:	00 
     12ff4a0:	48 83 a4 24 10 04 00 	and    QWORD PTR [rsp+0x410],0x0
     12ff4a7:	00 00 
     12ff4a9:	c7 84 24 28 03 00 00 	mov    DWORD PTR [rsp+0x328],0x2
     12ff4b0:	02 00 00 00 
     12ff4b4:	0f 10 84 24 99 04 00 	movups xmm0,XMMWORD PTR [rsp+0x499]
     12ff4bb:	00 
     12ff4bc:	48 8d 84 24 30 03 00 	lea    rax,[rsp+0x330]
     12ff4c3:	00 
     12ff4c4:	0f 11 40 29          	movups XMMWORD PTR [rax+0x29],xmm0
     12ff4c8:	0f 28 84 24 70 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x470]
     12ff4cf:	00 
     12ff4d0:	0f 57 db             	xorps  xmm3,xmm3
     12ff4d3:	0f 28 8c 24 80 04 00 	movaps xmm1,XMMWORD PTR [rsp+0x480]
     12ff4da:	00 
     12ff4db:	0f 28 94 24 90 04 00 	movaps xmm2,XMMWORD PTR [rsp+0x490]
     12ff4e2:	00 
     12ff4e3:	0f 11 50 20          	movups XMMWORD PTR [rax+0x20],xmm2
     12ff4e7:	0f 11 48 10          	movups XMMWORD PTR [rax+0x10],xmm1
     12ff4eb:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     12ff4ee:	0f 28 84 24 b0 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x4b0]
     12ff4f5:	00 

### 0x12ff720 (0x12feb98..0x12ff8c1)
     12ff6f2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     12ff6f7:	e8 94 e7 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12ff6fc:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12ff701:	e8 8a e7 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12ff706:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
     12ff70d:	00 
     12ff70e:	e8 b5 f1 90 ff       	call   c0e8c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15b868>
     12ff713:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
     12ff71a:	00 
     12ff71b:	e8 b6 95 ef ff       	call   11f8cd6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e25a>
     12ff720:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12ff727:	00 
     12ff728:	eb 73                	jmp    12ff79d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144d21>
     12ff72a:	48 89 c3             	mov    rbx,rax
     12ff72d:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
     12ff734:	00 
     12ff735:	e9 87 00 00 00       	jmp    12ff7c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144d45>
     12ff73a:	48 89 c3             	mov    rbx,rax
     12ff73d:	eb 6d                	jmp    12ff7ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144d30>
     12ff73f:	48 89 c3             	mov    rbx,rax
     12ff742:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12ff749:	00 

### 0x12ff742 (0x12feb98..0x12ff8c1)
     12ff720:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12ff727:	00 
     12ff728:	eb 73                	jmp    12ff79d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144d21>
     12ff72a:	48 89 c3             	mov    rbx,rax
     12ff72d:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
     12ff734:	00 
     12ff735:	e9 87 00 00 00       	jmp    12ff7c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144d45>
     12ff73a:	48 89 c3             	mov    rbx,rax
     12ff73d:	eb 6d                	jmp    12ff7ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144d30>
     12ff73f:	48 89 c3             	mov    rbx,rax
     12ff742:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     12ff749:	00 
     12ff74a:	e8 41 e7 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12ff74f:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
     12ff756:	00 
     12ff757:	eb 4e                	jmp    12ff7a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144d2b>
     12ff759:	48 89 c3             	mov    rbx,rax
     12ff75c:	eb 10                	jmp    12ff76e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144cf2>
     12ff75e:	48 89 c3             	mov    rbx,rax
     12ff761:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
     12ff768:	00 
     12ff769:	e8 5e f0 79 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>

### 0x130e69e (0x130e394..0x130e98c)
     130e679:	0f 29 40 38          	movaps XMMWORD PTR [rax+0x38],xmm0
     130e67d:	89 58 58             	mov    DWORD PTR [rax+0x58],ebx
     130e680:	48 8d 84 24 40 04 00 	lea    rax,[rsp+0x440]
     130e687:	00 
     130e688:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     130e68b:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     130e68f:	48 8d 84 24 58 04 00 	lea    rax,[rsp+0x458]
     130e696:	00 
     130e697:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     130e69a:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     130e69e:	48 8d 84 24 70 04 00 	lea    rax,[rsp+0x470]
     130e6a5:	00 
     130e6a6:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     130e6a9:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     130e6ad:	83 60 10 00          	and    DWORD PTR [rax+0x10],0x0
     130e6b1:	83 60 68 00          	and    DWORD PTR [rax+0x68],0x0
     130e6b5:	66 83 60 70 00       	and    WORD PTR [rax+0x70],0x0
     130e6ba:	48 8d 84 24 f0 04 00 	lea    rax,[rsp+0x4f0]
     130e6c1:	00 
     130e6c2:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     130e6c5:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     130e6c9:	4c 8d ac 24 00 05 00 	lea    r13,[rsp+0x500]

### 0x13285f8 (0x1326734..0x1328d02) WRITE
     13285d1:	00 
     13285d2:	4d 89 77 f0          	mov    QWORD PTR [r15-0x10],r14
     13285d6:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     13285db:	4c 89 ff             	mov    rdi,r15
     13285de:	e8 ad 1c 75 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     13285e3:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
     13285ea:	00 
     13285eb:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     13285f2:	00 
     13285f3:	e8 a4 1e 75 ff       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>
     13285f8:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
     13285ff:	00 00 
     1328601:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     1328608:	00 00 
     132860a:	6a 40                	push   0x40
     132860c:	5f                   	pop    rdi
     132860d:	e8 ee 58 4c 00       	call   17edf00 <_Znwm@plt>
     1328612:	49 89 c4             	mov    r12,rax
     1328615:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     132861c:	00 
     132861d:	48 89 c7             	mov    rdi,rax
     1328620:	e8 77 1e 75 ff       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>

### 0x1328625 (0x1326734..0x1328d02)
     1328601:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     1328608:	00 00 
     132860a:	6a 40                	push   0x40
     132860c:	5f                   	pop    rdi
     132860d:	e8 ee 58 4c 00       	call   17edf00 <_Znwm@plt>
     1328612:	49 89 c4             	mov    r12,rax
     1328615:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     132861c:	00 
     132861d:	48 89 c7             	mov    rdi,rax
     1328620:	e8 77 1e 75 ff       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>
     1328625:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
     132862c:	00 
     132862d:	4c 89 22             	mov    QWORD PTR [rdx],r12
     1328630:	48 8d 05 6b 3a 82 ff 	lea    rax,[rip+0xffffffffff823a6b]        # b4c0a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x99042>
     1328637:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     132863b:	48 8d 05 c0 2f 00 00 	lea    rax,[rip+0x2fc0]        # 132b602 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x170b86>
     1328642:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
     1328646:	48 8d 35 db 43 0b ff 	lea    rsi,[rip+0xffffffffff0b43db]        # 3dca28 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2477>
     132864d:	48 89 df             	mov    rdi,rbx
     1328650:	e8 09 08 00 00       	call   1328e5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e3e2>
     1328655:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     132865c:	00 

### 0x1328655 (0x1326734..0x1328d02)
     1328625:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
     132862c:	00 
     132862d:	4c 89 22             	mov    QWORD PTR [rdx],r12
     1328630:	48 8d 05 6b 3a 82 ff 	lea    rax,[rip+0xffffffffff823a6b]        # b4c0a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x99042>
     1328637:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     132863b:	48 8d 05 c0 2f 00 00 	lea    rax,[rip+0x2fc0]        # 132b602 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x170b86>
     1328642:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
     1328646:	48 8d 35 db 43 0b ff 	lea    rsi,[rip+0xffffffffff0b43db]        # 3dca28 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2477>
     132864d:	48 89 df             	mov    rdi,rbx
     1328650:	e8 09 08 00 00       	call   1328e5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e3e2>
     1328655:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     132865c:	00 
     132865d:	e8 12 09 00 00       	call   1328f74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e4f8>
     1328662:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     1328669:	00 
     132866a:	e8 fb 18 75 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     132866f:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
     1328676:	00 
     1328677:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     132867e:	00 
     132867f:	e8 18 1e 75 ff       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>
     1328684:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0

### 0x1328684 (0x1326734..0x1328d02) WRITE
     132865c:	00 
     132865d:	e8 12 09 00 00       	call   1328f74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e4f8>
     1328662:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     1328669:	00 
     132866a:	e8 fb 18 75 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     132866f:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
     1328676:	00 
     1328677:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     132867e:	00 
     132867f:	e8 18 1e 75 ff       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>
     1328684:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
     132868b:	00 00 
     132868d:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     1328694:	00 00 
     1328696:	6a 40                	push   0x40
     1328698:	5f                   	pop    rdi
     1328699:	e8 62 58 4c 00       	call   17edf00 <_Znwm@plt>
     132869e:	49 89 c4             	mov    r12,rax
     13286a1:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     13286a8:	00 
     13286a9:	48 89 c7             	mov    rdi,rax
     13286ac:	e8 eb 1d 75 ff       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>

### 0x13286b1 (0x1326734..0x1328d02)
     132868d:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     1328694:	00 00 
     1328696:	6a 40                	push   0x40
     1328698:	5f                   	pop    rdi
     1328699:	e8 62 58 4c 00       	call   17edf00 <_Znwm@plt>
     132869e:	49 89 c4             	mov    r12,rax
     13286a1:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     13286a8:	00 
     13286a9:	48 89 c7             	mov    rdi,rax
     13286ac:	e8 eb 1d 75 ff       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>
     13286b1:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
     13286b8:	00 
     13286b9:	4c 89 22             	mov    QWORD PTR [rdx],r12
     13286bc:	48 8d 05 df 39 82 ff 	lea    rax,[rip+0xffffffffff8239df]        # b4c0a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x99042>
     13286c3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     13286c7:	48 8d 05 10 31 00 00 	lea    rax,[rip+0x3110]        # 132b7de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x170d62>
     13286ce:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
     13286d2:	48 8d 35 4f 43 0b ff 	lea    rsi,[rip+0xffffffffff0b434f]        # 3dca28 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2477>
     13286d9:	48 89 df             	mov    rdi,rbx
     13286dc:	e8 df 08 00 00       	call   1328fc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e544>
     13286e1:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     13286e8:	00 

### 0x13286e1 (0x1326734..0x1328d02)
     13286b1:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
     13286b8:	00 
     13286b9:	4c 89 22             	mov    QWORD PTR [rdx],r12
     13286bc:	48 8d 05 df 39 82 ff 	lea    rax,[rip+0xffffffffff8239df]        # b4c0a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x99042>
     13286c3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     13286c7:	48 8d 05 10 31 00 00 	lea    rax,[rip+0x3110]        # 132b7de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x170d62>
     13286ce:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
     13286d2:	48 8d 35 4f 43 0b ff 	lea    rsi,[rip+0xffffffffff0b434f]        # 3dca28 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2477>
     13286d9:	48 89 df             	mov    rdi,rbx
     13286dc:	e8 df 08 00 00       	call   1328fc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e544>
     13286e1:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     13286e8:	00 
     13286e9:	e8 ee 09 00 00       	call   13290dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e660>
     13286ee:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     13286f5:	00 
     13286f6:	e8 6f 18 75 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     13286fb:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
     1328702:	00 
     1328703:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     132870a:	00 
     132870b:	e8 8c 1d 75 ff       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>
     1328710:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0

### 0x1328710 (0x1326734..0x1328d02) WRITE
     13286e8:	00 
     13286e9:	e8 ee 09 00 00       	call   13290dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e660>
     13286ee:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     13286f5:	00 
     13286f6:	e8 6f 18 75 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     13286fb:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
     1328702:	00 
     1328703:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     132870a:	00 
     132870b:	e8 8c 1d 75 ff       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>
     1328710:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
     1328717:	00 00 
     1328719:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     1328720:	00 00 
     1328722:	6a 40                	push   0x40
     1328724:	5f                   	pop    rdi
     1328725:	e8 d6 57 4c 00       	call   17edf00 <_Znwm@plt>
     132872a:	49 89 c4             	mov    r12,rax
     132872d:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     1328734:	00 
     1328735:	48 89 c7             	mov    rdi,rax
     1328738:	e8 5f 1d 75 ff       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>

### 0x132873d (0x1326734..0x1328d02)
     1328719:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     1328720:	00 00 
     1328722:	6a 40                	push   0x40
     1328724:	5f                   	pop    rdi
     1328725:	e8 d6 57 4c 00       	call   17edf00 <_Znwm@plt>
     132872a:	49 89 c4             	mov    r12,rax
     132872d:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     1328734:	00 
     1328735:	48 89 c7             	mov    rdi,rax
     1328738:	e8 5f 1d 75 ff       	call   a7a49c <JNI_OnUnload@@Base+0x1d69>
     132873d:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
     1328744:	00 
     1328745:	4c 89 22             	mov    QWORD PTR [rdx],r12
     1328748:	48 8d 05 53 39 82 ff 	lea    rax,[rip+0xffffffffff823953]        # b4c0a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x99042>
     132874f:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     1328753:	48 8d 05 5e 31 00 00 	lea    rax,[rip+0x315e]        # 132b8b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x170e3c>
     132875a:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
     132875e:	48 8d 35 c3 42 0b ff 	lea    rsi,[rip+0xffffffffff0b42c3]        # 3dca28 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2477>
     1328765:	48 89 df             	mov    rdi,rbx
     1328768:	e8 b3 09 00 00       	call   1329120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e6a4>
     132876d:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1328774:	00 

### 0x132876d (0x1326734..0x1328d02)
     132873d:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
     1328744:	00 
     1328745:	4c 89 22             	mov    QWORD PTR [rdx],r12
     1328748:	48 8d 05 53 39 82 ff 	lea    rax,[rip+0xffffffffff823953]        # b4c0a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x99042>
     132874f:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     1328753:	48 8d 05 5e 31 00 00 	lea    rax,[rip+0x315e]        # 132b8b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x170e3c>
     132875a:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
     132875e:	48 8d 35 c3 42 0b ff 	lea    rsi,[rip+0xffffffffff0b42c3]        # 3dca28 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2477>
     1328765:	48 89 df             	mov    rdi,rbx
     1328768:	e8 b3 09 00 00       	call   1329120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e6a4>
     132876d:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1328774:	00 
     1328775:	e8 c2 0a 00 00       	call   132923c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e7c0>
     132877a:	4c 8d a4 24 a0 02 00 	lea    r12,[rsp+0x2a0]
     1328781:	00 
     1328782:	4c 89 e7             	mov    rdi,r12
     1328785:	e8 e0 17 75 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     132878a:	4c 89 ff             	mov    rdi,r15
     132878d:	e8 d8 17 75 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1328792:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1328797:	e8 ce 17 75 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     132879c:	4d 89 6c 24 f0       	mov    QWORD PTR [r12-0x10],r13

### 0x13289f5 (0x1326734..0x1328d02)
     13289cf:	e9 ad 01 00 00       	jmp    1328b81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e105>
     13289d4:	e9 7e 01 00 00       	jmp    1328b57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e0db>
     13289d9:	e9 8e 01 00 00       	jmp    1328b6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e0f0>
     13289de:	e9 9e 01 00 00       	jmp    1328b81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e105>
     13289e3:	eb 0d                	jmp    13289f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16df76>
     13289e5:	48 89 c3             	mov    rbx,rax
     13289e8:	4c 89 e7             	mov    rdi,r12
     13289eb:	e8 30 55 4c 00       	call   17edf20 <_ZdlPv@plt>
     13289f0:	eb 03                	jmp    13289f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16df79>
     13289f2:	48 89 c3             	mov    rbx,rax
     13289f5:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     13289fc:	00 
     13289fd:	e8 3a 08 00 00       	call   132923c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e7c0>
     1328a02:	eb 40                	jmp    1328a44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16dfc8>
     1328a04:	eb 0d                	jmp    1328a13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16df97>
     1328a06:	48 89 c3             	mov    rbx,rax
     1328a09:	4c 89 e7             	mov    rdi,r12
     1328a0c:	e8 0f 55 4c 00       	call   17edf20 <_ZdlPv@plt>
     1328a11:	eb 03                	jmp    1328a16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16df9a>
     1328a13:	48 89 c3             	mov    rbx,rax
     1328a16:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1328a1d:	00 

### 0x1328a16 (0x1326734..0x1328d02)
     13289f5:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     13289fc:	00 
     13289fd:	e8 3a 08 00 00       	call   132923c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e7c0>
     1328a02:	eb 40                	jmp    1328a44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16dfc8>
     1328a04:	eb 0d                	jmp    1328a13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16df97>
     1328a06:	48 89 c3             	mov    rbx,rax
     1328a09:	4c 89 e7             	mov    rdi,r12
     1328a0c:	e8 0f 55 4c 00       	call   17edf20 <_ZdlPv@plt>
     1328a11:	eb 03                	jmp    1328a16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16df9a>
     1328a13:	48 89 c3             	mov    rbx,rax
     1328a16:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1328a1d:	00 
     1328a1e:	e8 b9 06 00 00       	call   13290dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e660>
     1328a23:	eb 1f                	jmp    1328a44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16dfc8>
     1328a25:	eb 0d                	jmp    1328a34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16dfb8>
     1328a27:	48 89 c3             	mov    rbx,rax
     1328a2a:	4c 89 e7             	mov    rdi,r12
     1328a2d:	e8 ee 54 4c 00       	call   17edf20 <_ZdlPv@plt>
     1328a32:	eb 03                	jmp    1328a37 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16dfbb>
     1328a34:	48 89 c3             	mov    rbx,rax
     1328a37:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1328a3e:	00 

### 0x1328a37 (0x1326734..0x1328d02)
     1328a16:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1328a1d:	00 
     1328a1e:	e8 b9 06 00 00       	call   13290dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e660>
     1328a23:	eb 1f                	jmp    1328a44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16dfc8>
     1328a25:	eb 0d                	jmp    1328a34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16dfb8>
     1328a27:	48 89 c3             	mov    rbx,rax
     1328a2a:	4c 89 e7             	mov    rdi,r12
     1328a2d:	e8 ee 54 4c 00       	call   17edf20 <_ZdlPv@plt>
     1328a32:	eb 03                	jmp    1328a37 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16dfbb>
     1328a34:	48 89 c3             	mov    rbx,rax
     1328a37:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1328a3e:	00 
     1328a3f:	e8 30 05 00 00       	call   1328f74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e4f8>
     1328a44:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     1328a4b:	00 
     1328a4c:	e8 19 15 75 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1328a51:	e9 5e 02 00 00       	jmp    1328cb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e238>
     1328a56:	48 89 c3             	mov    rbx,rax
     1328a59:	e9 5e 02 00 00       	jmp    1328cbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e240>
     1328a5e:	e9 f4 00 00 00       	jmp    1328b57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e0db>
     1328a63:	e9 04 01 00 00       	jmp    1328b6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e0f0>
     1328a68:	e9 14 01 00 00       	jmp    1328b81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e105>

### 0x13375b1 (0x1336efa..0x133771c) WRITE
     1337580:	48 89 ee             	mov    rsi,rbp
     1337583:	e8 86 5f f7 ff       	call   12ad50e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2a92>
     1337588:	48 8d 05 89 a6 11 ff 	lea    rax,[rip+0xffffffffff11a689]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     133758f:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1337594:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1337599:	48 83 64 24 38 00    	and    QWORD PTR [rsp+0x38],0x0
     133759f:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
     13375a6:	00 
     13375a7:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     13375ac:	e8 6b 01 00 00       	call   133771c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17cca0>
     13375b1:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
     13375b8:	00 00 
     13375ba:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     13375c1:	00 00 
     13375c3:	bf 10 02 00 00       	mov    edi,0x210
     13375c8:	e8 33 69 4b 00       	call   17edf00 <_Znwm@plt>
     13375cd:	48 89 c3             	mov    rbx,rax
     13375d0:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
     13375d7:	00 
     13375d8:	48 89 c7             	mov    rdi,rax
     13375db:	e8 3c 01 00 00       	call   133771c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17cca0>
     13375e0:	4c 8d a4 24 70 04 00 	lea    r12,[rsp+0x470]

### 0x13375e0 (0x1336efa..0x133771c)
     13375b8:	00 00 
     13375ba:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     13375c1:	00 00 
     13375c3:	bf 10 02 00 00       	mov    edi,0x210
     13375c8:	e8 33 69 4b 00       	call   17edf00 <_Znwm@plt>
     13375cd:	48 89 c3             	mov    rbx,rax
     13375d0:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
     13375d7:	00 
     13375d8:	48 89 c7             	mov    rdi,rax
     13375db:	e8 3c 01 00 00       	call   133771c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17cca0>
     13375e0:	4c 8d a4 24 70 04 00 	lea    r12,[rsp+0x470]
     13375e7:	00 
     13375e8:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
     13375ec:	48 8d 05 9b 68 f7 ff 	lea    rax,[rip+0xfffffffffff7689b]        # 12ade8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3412>
     13375f3:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
     13375f8:	48 8d 05 6b 01 00 00 	lea    rax,[rip+0x16b]        # 133776a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ccee>
     13375ff:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
     1337604:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     1337609:	4c 89 ff             	mov    rdi,r15
     133760c:	4c 89 e2             	mov    rdx,r12
     133760f:	4c 89 f1             	mov    rcx,r14
     1337612:	45 31 c0             	xor    r8d,r8d

### 0x13376b0 (0x1336efa..0x133771c)
     133768d:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
     1337694:	00 
     1337695:	e8 7e 67 f7 ff       	call   12ade18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf339c>
     133769a:	eb 03                	jmp    133769f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17cc23>
     133769c:	48 89 c3             	mov    rbx,rax
     133769f:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     13376a4:	e8 63 d1 d3 ff       	call   107480c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23bc22>
     13376a9:	eb 51                	jmp    13376fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17cc80>
     13376ab:	eb 18                	jmp    13376c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17cc49>
     13376ad:	48 89 c3             	mov    rbx,rax
     13376b0:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     13376b7:	00 
     13376b8:	e8 e1 fb 76 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     13376bd:	48 89 df             	mov    rdi,rbx
     13376c0:	e8 e0 23 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     13376c5:	48 89 c7             	mov    rdi,rax
     13376c8:	e8 d8 23 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     13376cd:	48 89 c3             	mov    rbx,rax
     13376d0:	4c 89 e7             	mov    rdi,r12
     13376d3:	e8 4e 94 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     13376d8:	eb 03                	jmp    13376dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17cc61>
     13376da:	48 89 c3             	mov    rbx,rax

### 0x133e9fc (0x133e9da..0x133ea42)
     133e9da:	41 57                	push   r15
     133e9dc:	41 56                	push   r14
     133e9de:	53                   	push   rbx
     133e9df:	49 89 d6             	mov    r14,rdx
     133e9e2:	49 89 f7             	mov    r15,rsi
     133e9e5:	48 89 fb             	mov    rbx,rdi
     133e9e8:	e8 b5 fe ff ff       	call   133e8a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183e26>
     133e9ed:	48 8d bb 50 04 00 00 	lea    rdi,[rbx+0x450]
     133e9f4:	4c 89 fe             	mov    rsi,r15
     133e9f7:	e8 da 99 79 ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>
     133e9fc:	80 bb 70 04 00 00 00 	cmp    BYTE PTR [rbx+0x470],0x0
     133ea03:	4c 89 b3 60 04 00 00 	mov    QWORD PTR [rbx+0x460],r14
     133ea0a:	48 8d 05 e7 c1 5d 00 	lea    rax,[rip+0x5dc1e7]        # 191abf8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x62008>
     133ea11:	48 89 83 68 04 00 00 	mov    QWORD PTR [rbx+0x468],rax
     133ea18:	75 07                	jne    133ea21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183fa5>
     133ea1a:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1
     133ea21:	8a 83 e0 03 00 00    	mov    al,BYTE PTR [rbx+0x3e0]
     133ea27:	0a 83 e1 03 00 00    	or     al,BYTE PTR [rbx+0x3e1]
     133ea2d:	75 06                	jne    133ea35 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183fb9>
     133ea2f:	5b                   	pop    rbx
     133ea30:	41 5e                	pop    r14
     133ea32:	41 5f                	pop    r15

### 0x133ea1a (0x133e9da..0x133ea42) WRITE
     133e9e5:	48 89 fb             	mov    rbx,rdi
     133e9e8:	e8 b5 fe ff ff       	call   133e8a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183e26>
     133e9ed:	48 8d bb 50 04 00 00 	lea    rdi,[rbx+0x450]
     133e9f4:	4c 89 fe             	mov    rsi,r15
     133e9f7:	e8 da 99 79 ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>
     133e9fc:	80 bb 70 04 00 00 00 	cmp    BYTE PTR [rbx+0x470],0x0
     133ea03:	4c 89 b3 60 04 00 00 	mov    QWORD PTR [rbx+0x460],r14
     133ea0a:	48 8d 05 e7 c1 5d 00 	lea    rax,[rip+0x5dc1e7]        # 191abf8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x62008>
     133ea11:	48 89 83 68 04 00 00 	mov    QWORD PTR [rbx+0x468],rax
     133ea18:	75 07                	jne    133ea21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183fa5>
     133ea1a:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1
     133ea21:	8a 83 e0 03 00 00    	mov    al,BYTE PTR [rbx+0x3e0]
     133ea27:	0a 83 e1 03 00 00    	or     al,BYTE PTR [rbx+0x3e1]
     133ea2d:	75 06                	jne    133ea35 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183fb9>
     133ea2f:	5b                   	pop    rbx
     133ea30:	41 5e                	pop    r14
     133ea32:	41 5f                	pop    r15
     133ea34:	c3                   	ret
     133ea35:	48 89 df             	mov    rdi,rbx
     133ea38:	5b                   	pop    rbx
     133ea39:	41 5e                	pop    r14
     133ea3b:	41 5f                	pop    r15

### 0x133ea63 (0x133ea42..0x133eaed)
     133ea3d:	e9 00 00 00 00       	jmp    133ea42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183fc6>
     133ea42:	41 56                	push   r14
     133ea44:	53                   	push   rbx
     133ea45:	48 83 ec 18          	sub    rsp,0x18
     133ea49:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     133ea50:	00 00 
     133ea52:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     133ea57:	80 bf 78 04 00 00 00 	cmp    BYTE PTR [rdi+0x478],0x0
     133ea5e:	75 4b                	jne    133eaab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18402f>
     133ea60:	48 89 fb             	mov    rbx,rdi
     133ea63:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     133ea6a:	74 3f                	je     133eaab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18402f>
     133ea6c:	48 8d b3 50 04 00 00 	lea    rsi,[rbx+0x450]
     133ea73:	49 89 e6             	mov    r14,rsp
     133ea76:	4c 89 f7             	mov    rdi,r14
     133ea79:	e8 b2 c8 76 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     133ea7e:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     133ea81:	48 85 ff             	test   rdi,rdi
     133ea84:	74 1b                	je     133eaa1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184025>
     133ea86:	48 8b b3 60 04 00 00 	mov    rsi,QWORD PTR [rbx+0x460]
     133ea8d:	48 8b 93 68 04 00 00 	mov    rdx,QWORD PTR [rbx+0x468]
     133ea94:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0x133fee7 (0x133fd98..0x13404d1) WRITE
     133febd:	00 00 
     133febf:	f3 41 0f 7f 87 d0 03 	movdqu XMMWORD PTR [r15+0x3d0],xmm0
     133fec6:	00 00 
     133fec8:	66 41 83 a7 e0 03 00 	and    WORD PTR [r15+0x3e0],0x0
     133fecf:	00 00 
     133fed1:	4c 89 ef             	mov    rdi,r13
     133fed4:	e8 e5 83 80 ff       	call   b482be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9525e>
     133fed9:	49 8d bf 40 04 00 00 	lea    rdi,[r15+0x440]
     133fee0:	e8 45 58 82 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     133fee5:	31 c0                	xor    eax,eax
     133fee7:	41 88 87 70 04 00 00 	mov    BYTE PTR [r15+0x470],al
     133feee:	41 88 87 78 04 00 00 	mov    BYTE PTR [r15+0x478],al
     133fef5:	66 0f ef c0          	pxor   xmm0,xmm0
     133fef9:	f3 41 0f 7f 87 50 04 	movdqu XMMWORD PTR [r15+0x450],xmm0
     133ff00:	00 00 
     133ff02:	41 88 87 60 04 00 00 	mov    BYTE PTR [r15+0x460],al
     133ff09:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     133ff0e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
     133ff12:	6a 20                	push   0x20
     133ff14:	5f                   	pop    rdi
     133ff15:	e8 e6 df 4a 00       	call   17edf00 <_Znwm@plt>
     133ff1a:	48 89 c3             	mov    rbx,rax

### 0x135af7a (0x135a74c..0x135c1fa) WRITE
     135af52:	4c 89 b4 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r14
     135af59:	00 
     135af5a:	66 0f ef c0          	pxor   xmm0,xmm0
     135af5e:	48 8d ac 24 48 02 00 	lea    rbp,[rsp+0x248]
     135af65:	00 
     135af66:	66 0f 7f 45 e8       	movdqa XMMWORD PTR [rbp-0x18],xmm0
     135af6b:	48 83 65 f8 00       	and    QWORD PTR [rbp-0x8],0x0
     135af70:	48 89 ef             	mov    rdi,rbp
     135af73:	e8 f0 e2 31 00       	call   1679268 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d3d4>
     135af78:	31 c0                	xor    eax,eax
     135af7a:	88 85 70 04 00 00    	mov    BYTE PTR [rbp+0x470],al
     135af80:	88 85 e0 08 00 00    	mov    BYTE PTR [rbp+0x8e0],al
     135af86:	88 85 e8 08 00 00    	mov    BYTE PTR [rbp+0x8e8],al
     135af8c:	88 85 00 09 00 00    	mov    BYTE PTR [rbp+0x900],al
     135af92:	83 a5 08 09 00 00 00 	and    DWORD PTR [rbp+0x908],0x0
     135af99:	88 85 90 09 00 00    	mov    BYTE PTR [rbp+0x990],al
     135af9f:	88 85 98 09 00 00    	mov    BYTE PTR [rbp+0x998],al
     135afa5:	88 85 00 0a 00 00    	mov    BYTE PTR [rbp+0xa00],al
     135afab:	83 a5 24 0a 00 00 00 	and    DWORD PTR [rbp+0xa24],0x0
     135afb2:	88 85 28 0a 00 00    	mov    BYTE PTR [rbp+0xa28],al
     135afb8:	66 0f ef c0          	pxor   xmm0,xmm0
     135afbc:	f3 0f 7f 85 60 0a 00 	movdqu XMMWORD PTR [rbp+0xa60],xmm0

### 0x135c33f (0x135c31a..0x135c538) WRITE
     135c31d:	41 56                	push   r14
     135c31f:	41 55                	push   r13
     135c321:	41 54                	push   r12
     135c323:	53                   	push   rbx
     135c324:	48 81 ec 78 04 00 00 	sub    rsp,0x478
     135c32b:	49 89 d4             	mov    r12,rdx
     135c32e:	49 89 f5             	mov    r13,rsi
     135c331:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     135c336:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c33d:	00 00 
     135c33f:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     135c346:	00 
     135c347:	48 8d 6e 10          	lea    rbp,[rsi+0x10]
     135c34b:	48 8d 46 20          	lea    rax,[rsi+0x20]
     135c34f:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     135c354:	48 8d 46 30          	lea    rax,[rsi+0x30]
     135c358:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135c35d:	4c 8b 7e 08          	mov    r15,QWORD PTR [rsi+0x8]
     135c361:	48 8b 5e 40          	mov    rbx,QWORD PTR [rsi+0x40]
     135c365:	4d 8d 77 10          	lea    r14,[r15+0x10]
     135c369:	49 8d 47 18          	lea    rax,[r15+0x18]
     135c36d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax

### 0x135c4ab (0x135c31a..0x135c538)
     135c485:	31 ff                	xor    edi,edi
     135c487:	e8 90 1f 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     135c48c:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     135c491:	4c 89 30             	mov    QWORD PTR [rax],r14
     135c494:	49 89 c6             	mov    r14,rax
     135c497:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     135c49b:	31 ff                	xor    edi,edi
     135c49d:	e8 e4 1f 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135c4a2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c4a9:	00 00 
     135c4ab:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
     135c4b2:	00 
     135c4b3:	75 7e                	jne    135c533 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1ab7>
     135c4b5:	4c 89 f0             	mov    rax,r14
     135c4b8:	48 81 c4 78 04 00 00 	add    rsp,0x478
     135c4bf:	5b                   	pop    rbx
     135c4c0:	41 5c                	pop    r12
     135c4c2:	41 5d                	pop    r13
     135c4c4:	41 5e                	pop    r14
     135c4c6:	41 5f                	pop    r15
     135c4c8:	5d                   	pop    rbp
     135c4c9:	c3                   	ret

### 0x135c521 (0x135c31a..0x135c538)
     135c4f7:	e8 94 19 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135c4fc:	4c 89 ff             	mov    rdi,r15
     135c4ff:	e8 c4 dc 10 00       	call   146a1c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af74c>
     135c504:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
     135c508:	48 89 df             	mov    rdi,rbx
     135c50b:	e8 00 1b 49 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     135c510:	48 89 df             	mov    rdi,rbx
     135c513:	e8 04 1f 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     135c518:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c51f:	00 00 
     135c521:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
     135c528:	00 
     135c529:	75 08                	jne    135c533 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1ab7>
     135c52b:	4c 89 f7             	mov    rdi,r14
     135c52e:	e8 9d 37 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     135c533:	e8 78 35 49 00       	call   17efab0 <__stack_chk_fail@plt>
     135c538:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     135c53b:	48 89 07             	mov    QWORD PTR [rdi],rax
     135c53e:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
     135c542:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     135c546:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     135c54a:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax

### 0x1361f59 (0x1361eb4..0x13626e6)
     1361f31:	e8 60 a0 2d 00       	call   163bf96 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37104>
     1361f36:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     1361f3a:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
     1361f3d:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
     1361f44:	00 
     1361f45:	48 85 c0             	test   rax,rax
     1361f48:	74 05                	je     1361f4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a74d3>
     1361f4a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1361f4f:	49 8d 97 60 01 00 00 	lea    rdx,[r15+0x160]
     1361f56:	0f 57 c0             	xorps  xmm0,xmm0
     1361f59:	4c 8d 8c 24 70 04 00 	lea    r9,[rsp+0x470]
     1361f60:	00 
     1361f61:	49 83 61 10 00       	and    QWORD PTR [r9+0x10],0x0
     1361f66:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
     1361f6b:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1361f70:	41 0f 29 01          	movaps XMMWORD PTR [r9],xmm0
     1361f74:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     1361f77:	4c 8d 54 24 50       	lea    r10,[rsp+0x50]
     1361f7c:	41 0f 29 02          	movaps XMMWORD PTR [r10],xmm0
     1361f80:	48 8d 0d a6 b3 07 ff 	lea    rcx,[rip+0xffffffffff07b3a6]        # 3dd32d <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d7c>
     1361f87:	4c 8d 05 b2 b3 07 ff 	lea    r8,[rip+0xffffffffff07b3b2]        # 3dd340 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d8f>
     1361f8e:	48 8d bc 24 58 08 00 	lea    rdi,[rsp+0x858]

### 0x1361fb9 (0x1361eb4..0x13626e6)
     1361f9d:	00 
     1361f9e:	41 52                	push   r10
     1361fa0:	50                   	push   rax
     1361fa1:	e8 00 a4 1a 00       	call   150c3a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35192a>
     1361fa6:	58                   	pop    rax
     1361fa7:	59                   	pop    rcx
     1361fa8:	31 ff                	xor    edi,edi
     1361faa:	e8 d7 c4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1361faf:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1361fb4:	e8 79 b1 74 ff       	call   aad132 <JNI_OnUnload@@Base+0x349ff>
     1361fb9:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1361fc0:	00 
     1361fc1:	e8 6c b1 74 ff       	call   aad132 <JNI_OnUnload@@Base+0x349ff>
     1361fc6:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     1361fcd:	00 
     1361fce:	e8 b3 c4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1361fd3:	41 80 7f 58 00       	cmp    BYTE PTR [r15+0x58],0x0
     1361fd8:	0f 84 95 01 00 00    	je     1362173 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a76f7>
     1361fde:	48 89 ac 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rbp
     1361fe5:	00 
     1361fe6:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1361feb:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax

### 0x1361fde (0x1361eb4..0x13626e6) WRITE
     1361faf:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1361fb4:	e8 79 b1 74 ff       	call   aad132 <JNI_OnUnload@@Base+0x349ff>
     1361fb9:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1361fc0:	00 
     1361fc1:	e8 6c b1 74 ff       	call   aad132 <JNI_OnUnload@@Base+0x349ff>
     1361fc6:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     1361fcd:	00 
     1361fce:	e8 b3 c4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1361fd3:	41 80 7f 58 00       	cmp    BYTE PTR [r15+0x58],0x0
     1361fd8:	0f 84 95 01 00 00    	je     1362173 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a76f7>
     1361fde:	48 89 ac 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rbp
     1361fe5:	00 
     1361fe6:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1361feb:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
     1361ff2:	00 
     1361ff3:	31 c0                	xor    eax,eax
     1361ff5:	88 84 24 80 04 00 00 	mov    BYTE PTR [rsp+0x480],al
     1361ffc:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
     1362000:	48 8b b3 90 00 00 00 	mov    rsi,QWORD PTR [rbx+0x90]
     1362007:	49 8d 96 90 00 00 00 	lea    rdx,[r14+0x90]
     136200e:	48 8d 4c 24 48       	lea    rcx,[rsp+0x48]
     1362013:	c6 01 01             	mov    BYTE PTR [rcx],0x1

### 0x13620d2 (0x1361eb4..0x13626e6)
     13620a9:	48 85 c0             	test   rax,rax
     13620ac:	74 05                	je     13620b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7637>
     13620ae:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     13620b3:	4c 8d ac 24 48 06 00 	lea    r13,[rsp+0x648]
     13620ba:	00 
     13620bb:	48 8d bc 24 58 06 00 	lea    rdi,[rsp+0x658]
     13620c2:	00 
     13620c3:	49 8d b6 58 01 00 00 	lea    rsi,[r14+0x158]
     13620ca:	e8 c5 a9 96 ff       	call   ccca94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x219a34>
     13620cf:	0f 57 c0             	xorps  xmm0,xmm0
     13620d2:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     13620d9:	00 
     13620da:	0f 29 86 00 02 00 00 	movaps XMMWORD PTR [rsi+0x200],xmm0
     13620e1:	49 8b 87 70 01 00 00 	mov    rax,QWORD PTR [r15+0x170]
     13620e8:	48 89 86 10 02 00 00 	mov    QWORD PTR [rsi+0x210],rax
     13620ef:	48 c7 86 18 02 00 00 	mov    QWORD PTR [rsi+0x218],0x3e8
     13620f6:	e8 03 00 00 
     13620fa:	c6 86 20 02 00 00 01 	mov    BYTE PTR [rsi+0x220],0x1
     1362101:	31 c0                	xor    eax,eax
     1362103:	41 80 bf b8 01 00 00 	cmp    BYTE PTR [r15+0x1b8],0x1
     136210a:	01 
     136210b:	0f 94 c0             	sete   al

### 0x1362161 (0x1361eb4..0x13626e6)
     1362137:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
     136213e:	00 
     136213f:	48 89 df             	mov    rdi,rbx
     1362142:	e8 25 e0 96 ff       	call   cd016c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d10c>
     1362147:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     136214c:	48 89 de             	mov    rsi,rbx
     136214f:	e8 56 97 04 00       	call   13ab8aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f0e2e>
     1362154:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     136215b:	00 
     136215c:	e8 9b e1 96 ff       	call   cd02fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d29c>
     1362161:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1362168:	00 
     1362169:	e8 8e e1 96 ff       	call   cd02fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d29c>
     136216e:	e9 98 03 00 00       	jmp    136250b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7a8f>
     1362173:	41 80 bf a0 01 00 00 	cmp    BYTE PTR [r15+0x1a0],0x0
     136217a:	00 
     136217b:	74 43                	je     13621c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7744>
     136217d:	49 8d bf 98 01 00 00 	lea    rdi,[r15+0x198]
     1362184:	e8 e9 39 7e ff       	call   b45b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b12>
     1362189:	41 8a 87 98 01 00 00 	mov    al,BYTE PTR [r15+0x198]
     1362190:	41 0f b7 8f 9d 01 00 	movzx  ecx,WORD PTR [r15+0x19d]
     1362197:	00 

### 0x13621cc (0x1361eb4..0x13626e6) WRITE
     13621a9:	45 8b a7 99 01 00 00 	mov    r12d,DWORD PTR [r15+0x199]
     13621b0:	49 09 d4             	or     r12,rdx
     13621b3:	88 44 24 48          	mov    BYTE PTR [rsp+0x48],al
     13621b7:	b3 01                	mov    bl,0x1
     13621b9:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     13621be:	eb 07                	jmp    13621c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a774b>
     13621c0:	48 8d 44 24 48       	lea    rax,[rsp+0x48]
     13621c5:	31 db                	xor    ebx,ebx
     13621c7:	31 ff                	xor    edi,edi
     13621c9:	40 88 38             	mov    BYTE PTR [rax],dil
     13621cc:	48 89 ac 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rbp
     13621d3:	00 
     13621d4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13621d9:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
     13621e0:	00 
     13621e1:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     13621e5:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
     13621ec:	00 
     13621ed:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     13621f1:	48 8b b0 90 00 00 00 	mov    rsi,QWORD PTR [rax+0x90]
     13621f8:	49 8d 96 90 00 00 00 	lea    rdx,[r14+0x90]
     13621ff:	48 8d 4c 24 3f       	lea    rcx,[rsp+0x3f]

### 0x13624c2 (0x1361eb4..0x13626e6)
     1362492:	48 89 48 e8          	mov    QWORD PTR [rax-0x18],rcx
     1362496:	49 8b 8e a8 02 00 00 	mov    rcx,QWORD PTR [r14+0x2a8]
     136249d:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     13624a1:	49 8b 8e 18 02 00 00 	mov    rcx,QWORD PTR [r14+0x218]
     13624a8:	48 8d 15 89 cd 4b 00 	lea    rdx,[rip+0x4bcd89]        # 181f238 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14ef8>
     13624af:	48 89 10             	mov    QWORD PTR [rax],rdx
     13624b2:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     13624b6:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
     13624ba:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     13624c1:	00 
     13624c2:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     13624c9:	00 
     13624ca:	e8 83 df 96 ff       	call   cd0452 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d3f2>
     13624cf:	49 8b be 20 02 00 00 	mov    rdi,QWORD PTR [r14+0x220]
     13624d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13624d9:	ff 50 38             	call   QWORD PTR [rax+0x38]
     13624dc:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     13624e1:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     13624e8:	00 
     13624e9:	48 89 c2             	mov    rdx,rax
     13624ec:	e8 81 9e 04 00       	call   13ac372 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f18f6>
     13624f1:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]

### 0x13624fe (0x1361eb4..0x13626e6)
     13624d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13624d9:	ff 50 38             	call   QWORD PTR [rax+0x38]
     13624dc:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     13624e1:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     13624e8:	00 
     13624e9:	48 89 c2             	mov    rdx,rax
     13624ec:	e8 81 9e 04 00       	call   13ac372 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f18f6>
     13624f1:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     13624f8:	00 
     13624f9:	e8 f6 e0 96 ff       	call   cd05f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d594>
     13624fe:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1362505:	00 
     1362506:	e8 e9 e0 96 ff       	call   cd05f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d594>
     136250b:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     1362510:	48 8d bc 24 58 08 00 	lea    rdi,[rsp+0x858]
     1362517:	00 
     1362518:	e8 b1 ab 74 ff       	call   aad0ce <JNI_OnUnload@@Base+0x3499b>
     136251d:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     1362524:	00 
     1362525:	e8 5c bf 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     136252a:	4c 8b 74 24 30       	mov    r14,QWORD PTR [rsp+0x30]
     136252f:	4c 89 33             	mov    QWORD PTR [rbx],r14

### 0x1362608 (0x1361eb4..0x13626e6)
     13625e5:	eb 73                	jmp    136265a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7bde>
     13625e7:	48 89 c3             	mov    rbx,rax
     13625ea:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13625ed:	4c 89 f7             	mov    rdi,r14
     13625f0:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13625f3:	e9 9e 00 00 00       	jmp    1362696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7c1a>
     13625f8:	48 89 c3             	mov    rbx,rax
     13625fb:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1362602:	00 
     1362603:	e8 f4 dc 96 ff       	call   cd02fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d29c>
     1362608:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     136260f:	00 
     1362610:	e8 e7 dc 96 ff       	call   cd02fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d29c>
     1362615:	eb 65                	jmp    136267c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7c00>
     1362617:	48 89 c3             	mov    rbx,rax
     136261a:	4c 89 ef             	mov    rdi,r13
     136261d:	e8 e8 aa 74 ff       	call   aad10a <JNI_OnUnload@@Base+0x349d7>
     1362622:	48 89 ef             	mov    rdi,rbp
     1362625:	e8 a4 aa 74 ff       	call   aad0ce <JNI_OnUnload@@Base+0x3499b>
     136262a:	eb 03                	jmp    136262f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7bb3>
     136262c:	48 89 c3             	mov    rbx,rax
     136262f:	4c 89 e7             	mov    rdi,r12

### 0x136266f (0x1361eb4..0x13626e6)
     1362650:	74 2a                	je     136267c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7c00>
     1362652:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1362655:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1362658:	eb 22                	jmp    136267c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7c00>
     136265a:	48 89 c3             	mov    rbx,rax
     136265d:	eb 1d                	jmp    136267c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7c00>
     136265f:	48 89 c3             	mov    rbx,rax
     1362662:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1362669:	00 
     136266a:	e8 85 df 96 ff       	call   cd05f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d594>
     136266f:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1362676:	00 
     1362677:	e8 78 df 96 ff       	call   cd05f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d594>
     136267c:	48 8d bc 24 58 08 00 	lea    rdi,[rsp+0x858]
     1362683:	00 
     1362684:	e8 45 aa 74 ff       	call   aad0ce <JNI_OnUnload@@Base+0x3499b>
     1362689:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     1362690:	00 
     1362691:	e8 f0 bd 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1362696:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     136269d:	00 00 
     136269f:	48 3b 84 24 30 09 00 	cmp    rax,QWORD PTR [rsp+0x930]

### 0x13626ca (0x1361eb4..0x13626e6)
     13626a6:	00 
     13626a7:	75 08                	jne    13626b1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7c35>
     13626a9:	48 89 df             	mov    rdi,rbx
     13626ac:	e8 1f d6 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13626b1:	e8 fa d3 48 00       	call   17efab0 <__stack_chk_fail@plt>
     13626b6:	48 89 c3             	mov    rbx,rax
     13626b9:	31 ff                	xor    edi,edi
     13626bb:	e8 c6 bd 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13626c0:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     13626c5:	e8 68 aa 74 ff       	call   aad132 <JNI_OnUnload@@Base+0x349ff>
     13626ca:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     13626d1:	00 
     13626d2:	e8 5b aa 74 ff       	call   aad132 <JNI_OnUnload@@Base+0x349ff>
     13626d7:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     13626de:	00 
     13626df:	e8 a2 bd 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13626e4:	eb a3                	jmp    1362689 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a7c0d>
     13626e6:	55                   	push   rbp
     13626e7:	41 57                	push   r15
     13626e9:	41 56                	push   r14
     13626eb:	41 55                	push   r13
     13626ed:	41 54                	push   r12

### 0x13697d8 (0x13695b6..0x1369cef)
     13697a3:	88 87 00 01 00 00    	mov    BYTE PTR [rdi+0x100],al
     13697a9:	88 87 18 01 00 00    	mov    BYTE PTR [rdi+0x118],al
     13697af:	88 87 20 01 00 00    	mov    BYTE PTR [rdi+0x120],al
     13697b5:	88 87 38 01 00 00    	mov    BYTE PTR [rdi+0x138],al
     13697bb:	48 8d 35 40 9d fd fe 	lea    rsi,[rip+0xfffffffffefd9d40]        # 343502 <_ZTSSt12bad_any_cast@@Base-0x4ccc6>
     13697c2:	e8 b7 02 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     13697c7:	c6 84 24 08 03 00 00 	mov    BYTE PTR [rsp+0x308],0x1
     13697ce:	01 
     13697cf:	80 bb b8 05 00 00 00 	cmp    BYTE PTR [rbx+0x5b8],0x0
     13697d6:	74 2a                	je     1369802 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aed86>
     13697d8:	48 8b b3 70 04 00 00 	mov    rsi,QWORD PTR [rbx+0x470]
     13697df:	8b bb 68 04 00 00    	mov    edi,DWORD PTR [rbx+0x468]
     13697e5:	e8 36 20 71 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     13697ea:	84 c0                	test   al,al
     13697ec:	75 14                	jne    1369802 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aed86>
     13697ee:	48 8d bc 24 10 03 00 	lea    rdi,[rsp+0x310]
     13697f5:	00 
     13697f6:	48 8d b3 68 04 00 00 	lea    rsi,[rbx+0x468]
     13697fd:	e8 5e e9 7d ff       	call   b48160 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95100>
     1369802:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     1369807:	48 8d bc 24 68 02 00 	lea    rdi,[rsp+0x268]
     136980e:	00 

### 0x136f269 (0x136efea..0x136f65c)
     136f22d:	88 87 c0 00 00 00    	mov    BYTE PTR [rdi+0xc0],al
     136f233:	88 87 d8 00 00 00    	mov    BYTE PTR [rdi+0xd8],al
     136f239:	88 87 e0 00 00 00    	mov    BYTE PTR [rdi+0xe0],al
     136f23f:	88 87 f8 00 00 00    	mov    BYTE PTR [rdi+0xf8],al
     136f245:	88 87 00 01 00 00    	mov    BYTE PTR [rdi+0x100],al
     136f24b:	88 87 18 01 00 00    	mov    BYTE PTR [rdi+0x118],al
     136f251:	88 87 20 01 00 00    	mov    BYTE PTR [rdi+0x120],al
     136f257:	88 87 38 01 00 00    	mov    BYTE PTR [rdi+0x138],al
     136f25d:	48 8d 35 2c 02 fc fe 	lea    rsi,[rip+0xfffffffffefc022c]        # 32f490 <_ZTSSt12bad_any_cast@@Base-0x60d38>
     136f264:	e8 75 7e 7d ff       	call   b470de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9407e>
     136f269:	48 8b b3 70 04 00 00 	mov    rsi,QWORD PTR [rbx+0x470]
     136f270:	8b bb 68 04 00 00    	mov    edi,DWORD PTR [rbx+0x468]
     136f276:	e8 a5 c5 70 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     136f27b:	84 c0                	test   al,al
     136f27d:	75 14                	jne    136f293 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4817>
     136f27f:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
     136f286:	00 
     136f287:	48 8d b3 68 04 00 00 	lea    rsi,[rbx+0x468]
     136f28e:	e8 cd 8e 7d ff       	call   b48160 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95100>
     136f293:	48 8b bb 70 07 00 00 	mov    rdi,QWORD PTR [rbx+0x770]
     136f29a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     136f29d:	48 8d b4 24 e8 00 00 	lea    rsi,[rsp+0xe8]

### 0x1375f22 (0x137587e..0x13765b4) WRITE
     1375ef4:	0f 10 84 24 08 04 00 	movups xmm0,XMMWORD PTR [rsp+0x408]
     1375efb:	00 
     1375efc:	0f 11 84 24 48 04 00 	movups XMMWORD PTR [rsp+0x448],xmm0
     1375f03:	00 
     1375f04:	0f 10 84 24 18 04 00 	movups xmm0,XMMWORD PTR [rsp+0x418]
     1375f0b:	00 
     1375f0c:	0f 11 84 24 58 04 00 	movups XMMWORD PTR [rsp+0x458],xmm0
     1375f13:	00 
     1375f14:	8a 94 24 28 04 00 00 	mov    dl,BYTE PTR [rsp+0x428]
     1375f1b:	88 94 24 68 04 00 00 	mov    BYTE PTR [rsp+0x468],dl
     1375f22:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     1375f29:	00 
     1375f2a:	49 83 26 00          	and    QWORD PTR [r14],0x0
     1375f2e:	88 8c 24 78 04 00 00 	mov    BYTE PTR [rsp+0x478],cl
     1375f35:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     1375f3a:	6a 50                	push   0x50
     1375f3c:	5f                   	pop    rdi
     1375f3d:	e8 be 7f 47 00       	call   17edf00 <_Znwm@plt>
     1375f42:	48 8d 8c 24 08 04 00 	lea    rcx,[rsp+0x408]
     1375f49:	00 
     1375f4a:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
     1375f51:	00 

### 0x1375f4a (0x137587e..0x13765b4)
     1375f22:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     1375f29:	00 
     1375f2a:	49 83 26 00          	and    QWORD PTR [r14],0x0
     1375f2e:	88 8c 24 78 04 00 00 	mov    BYTE PTR [rsp+0x478],cl
     1375f35:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     1375f3a:	6a 50                	push   0x50
     1375f3c:	5f                   	pop    rdi
     1375f3d:	e8 be 7f 47 00       	call   17edf00 <_Znwm@plt>
     1375f42:	48 8d 8c 24 08 04 00 	lea    rcx,[rsp+0x408]
     1375f49:	00 
     1375f4a:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
     1375f51:	00 
     1375f52:	48 8b 72 d0          	mov    rsi,QWORD PTR [rdx-0x30]
     1375f56:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi
     1375f5a:	0f 28 42 c0          	movaps xmm0,XMMWORD PTR [rdx-0x40]
     1375f5e:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1375f61:	48 83 62 d0 00       	and    QWORD PTR [rdx-0x30],0x0
     1375f66:	0f 57 c0             	xorps  xmm0,xmm0
     1375f69:	0f 29 42 c0          	movaps XMMWORD PTR [rdx-0x40],xmm0
     1375f6d:	40 8a 71 20          	mov    sil,BYTE PTR [rcx+0x20]
     1375f71:	40 88 70 38          	mov    BYTE PTR [rax+0x38],sil
     1375f75:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]

### 0x13acd5e (0x13ac372..0x13adc94)
     13acd2e:	48 8d bb 50 04 00 00 	lea    rdi,[rbx+0x450]
     13acd35:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     13acd39:	48 89 bc 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rdi
     13acd40:	00 
     13acd41:	e8 7c 49 41 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     13acd46:	48 8d bb 60 04 00 00 	lea    rdi,[rbx+0x460]
     13acd4d:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     13acd51:	48 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rdi
     13acd58:	00 
     13acd59:	e8 64 49 41 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     13acd5e:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     13acd65:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     13acd69:	48 89 bc 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rdi
     13acd70:	00 
     13acd71:	e8 4c 49 41 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     13acd76:	48 8d bb 80 04 00 00 	lea    rdi,[rbx+0x480]
     13acd7d:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     13acd81:	48 89 bc 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rdi
     13acd88:	00 
     13acd89:	e8 34 49 41 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     13acd8e:	48 8d bb 90 04 00 00 	lea    rdi,[rbx+0x490]
     13acd95:	49 8b 75 08          	mov    rsi,QWORD PTR [r13+0x8]

### 0x13b41da (0x13b3b70..0x13b4ce3)
     13b41b3:	e8 6e c9 6e ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     13b41b8:	6a 01                	push   0x1
     13b41ba:	5d                   	pop    rbp
     13b41bb:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     13b41c0:	89 ee                	mov    esi,ebp
     13b41c2:	e8 73 b3 7a ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
     13b41c7:	4d 8b be 90 00 00 00 	mov    r15,QWORD PTR [r14+0x90]
     13b41ce:	49 8d 5f 08          	lea    rbx,[r15+0x8]
     13b41d2:	48 89 df             	mov    rdi,rbx
     13b41d5:	e8 ee 82 00 00       	call   13bc4c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x201a4c>
     13b41da:	45 8b a7 70 04 00 00 	mov    r12d,DWORD PTR [r15+0x470]
     13b41e1:	4d 8b bf 78 04 00 00 	mov    r15,QWORD PTR [r15+0x478]
     13b41e8:	48 89 df             	mov    rdi,rbx
     13b41eb:	89 ee                	mov    esi,ebp
     13b41ed:	e8 48 b3 7a ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
     13b41f2:	44 89 a4 24 98 00 00 	mov    DWORD PTR [rsp+0x98],r12d
     13b41f9:	00 
     13b41fa:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
     13b4201:	00 
     13b4202:	45 85 e4             	test   r12d,r12d
     13b4205:	74 3a                	je     13b4241 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f97c5>
     13b4207:	48 8d b4 24 48 01 00 	lea    rsi,[rsp+0x148]

### 0x13b8640 (0x13b82ee..0x13b891e)
     13b860c:	4c 89 f7             	mov    rdi,r14
     13b860f:	e8 24 93 40 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     13b8614:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
     13b8619:	48 8d bb 10 04 00 00 	lea    rdi,[rbx+0x410]
     13b8620:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     13b8625:	e8 0e 93 40 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     13b862a:	48 8d bb 20 04 00 00 	lea    rdi,[rbx+0x420]
     13b8631:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     13b8636:	e8 fd 92 40 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     13b863b:	4c 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],r15
     13b8640:	4c 8d bb 70 04 00 00 	lea    r15,[rbx+0x470]
     13b8647:	4c 89 ff             	mov    rdi,r15
     13b864a:	e8 e9 92 40 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     13b864f:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
     13b8654:	4c 8d a3 80 04 00 00 	lea    r12,[rbx+0x480]
     13b865b:	4c 89 e7             	mov    rdi,r12
     13b865e:	e8 d5 92 40 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     13b8663:	4c 8b 6c 24 58       	mov    r13,QWORD PTR [rsp+0x58]
     13b8668:	4c 89 ef             	mov    rdi,r13
     13b866b:	e8 c8 92 40 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     13b8670:	e8 75 e7 24 00       	call   1606dea <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f58>
     13b8675:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]

### 0x13bbced (0x13bbbc2..0x13bc0d5) WRITE
     13bbcaa:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     13bbcae:	48 89 83 30 04 00 00 	mov    QWORD PTR [rbx+0x430],rax
     13bbcb5:	40 88 ab 38 04 00 00 	mov    BYTE PTR [rbx+0x438],bpl
     13bbcbc:	40 88 ab 40 04 00 00 	mov    BYTE PTR [rbx+0x440],bpl
     13bbcc3:	40 88 ab 48 04 00 00 	mov    BYTE PTR [rbx+0x448],bpl
     13bbcca:	40 88 ab 50 04 00 00 	mov    BYTE PTR [rbx+0x450],bpl
     13bbcd1:	40 88 ab 58 04 00 00 	mov    BYTE PTR [rbx+0x458],bpl
     13bbcd8:	40 88 ab 60 04 00 00 	mov    BYTE PTR [rbx+0x460],bpl
     13bbcdf:	83 a3 68 04 00 00 00 	and    DWORD PTR [rbx+0x468],0x0
     13bbce6:	40 88 ab 6c 04 00 00 	mov    BYTE PTR [rbx+0x46c],bpl
     13bbced:	83 a3 70 04 00 00 00 	and    DWORD PTR [rbx+0x470],0x0
     13bbcf4:	48 8d 05 cd bd 57 00 	lea    rax,[rip+0x57bdcd]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     13bbcfb:	48 89 83 78 04 00 00 	mov    QWORD PTR [rbx+0x478],rax
     13bbd02:	40 88 ab b8 04 00 00 	mov    BYTE PTR [rbx+0x4b8],bpl
     13bbd09:	0f 57 c0             	xorps  xmm0,xmm0
     13bbd0c:	0f 11 83 c0 04 00 00 	movups XMMWORD PTR [rbx+0x4c0],xmm0
     13bbd13:	0f 11 83 d0 04 00 00 	movups XMMWORD PTR [rbx+0x4d0],xmm0
     13bbd1a:	48 83 a3 e0 04 00 00 	and    QWORD PTR [rbx+0x4e0],0x0
     13bbd21:	00 
     13bbd22:	40 88 ab 88 04 00 00 	mov    BYTE PTR [rbx+0x488],bpl
     13bbd29:	48 83 a3 80 04 00 00 	and    QWORD PTR [rbx+0x480],0x0
     13bbd30:	00 

### 0x13bc789 (0x13bc76c..0x13bc805)
     13bc76c:	55                   	push   rbp
     13bc76d:	41 56                	push   r14
     13bc76f:	53                   	push   rbx
     13bc770:	49 89 fe             	mov    r14,rdi
     13bc773:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
     13bc777:	48 89 df             	mov    rdi,rbx
     13bc77a:	e8 49 fd ff ff       	call   13bc4c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x201a4c>
     13bc77f:	41 80 be 6a 04 00 00 	cmp    BYTE PTR [r14+0x46a],0x0
     13bc786:	00 
     13bc787:	74 52                	je     13bc7db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x201d5f>
     13bc789:	41 83 be 70 04 00 00 	cmp    DWORD PTR [r14+0x470],0x0
     13bc790:	00 
     13bc791:	40 b5 01             	mov    bpl,0x1
     13bc794:	75 47                	jne    13bc7dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x201d61>
     13bc796:	41 80 be 68 04 00 00 	cmp    BYTE PTR [r14+0x468],0x0
     13bc79d:	00 
     13bc79e:	74 3d                	je     13bc7dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x201d61>
     13bc7a0:	41 80 be e8 04 00 00 	cmp    BYTE PTR [r14+0x4e8],0x0
     13bc7a7:	00 
     13bc7a8:	74 1a                	je     13bc7c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x201d48>
     13bc7aa:	49 8b 7e 50          	mov    rdi,QWORD PTR [r14+0x50]
     13bc7ae:	e8 3b 05 15 00       	call   150ccee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352272>

### 0x13bd60a (0x13bd354..0x13bd65d)
     13bd5e3:	31 c0                	xor    eax,eax
     13bd5e5:	e8 e8 92 41 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     13bd5ea:	48 8d 0d 31 be f7 fe 	lea    rcx,[rip+0xfffffffffef7be31]        # 339422 <_ZTSSt12bad_any_cast@@Base-0x56da6>
     13bd5f1:	89 ef                	mov    edi,ebp
     13bd5f3:	48 89 de             	mov    rsi,rbx
     13bd5f6:	ba bd 00 00 00       	mov    edx,0xbd
     13bd5fb:	31 c0                	xor    eax,eax
     13bd5fd:	e8 d0 92 41 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     13bd602:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     13bd607:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     13bd60a:	41 0f 11 86 70 04 00 	movups XMMWORD PTR [r14+0x470],xmm0
     13bd611:	00 
     13bd612:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13bd619:	00 00 
     13bd61b:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     13bd620:	75 36                	jne    13bd658 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x202bdc>
     13bd622:	48 83 c4 58          	add    rsp,0x58
     13bd626:	5b                   	pop    rbx
     13bd627:	41 5c                	pop    r12
     13bd629:	41 5d                	pop    r13
     13bd62b:	41 5e                	pop    r14
     13bd62d:	41 5f                	pop    r15

### 0x13bd682 (0x13bd65e..0x13be0db)
     13bd661:	41 56                	push   r14
     13bd663:	41 55                	push   r13
     13bd665:	41 54                	push   r12
     13bd667:	53                   	push   rbx
     13bd668:	48 81 ec 08 01 00 00 	sub    rsp,0x108
     13bd66f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13bd676:	00 00 
     13bd678:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     13bd67f:	00 
     13bd680:	31 ed                	xor    ebp,ebp
     13bd682:	83 bf 70 04 00 00 00 	cmp    DWORD PTR [rdi+0x470],0x0
     13bd689:	0f 85 90 09 00 00    	jne    13be01f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2035a3>
     13bd68f:	49 89 fe             	mov    r14,rdi
     13bd692:	8a 87 6c 04 00 00    	mov    al,BYTE PTR [rdi+0x46c]
     13bd698:	a8 01                	test   al,0x1
     13bd69a:	75 3f                	jne    13bd6db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x202c5f>
     13bd69c:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi
     13bd6a1:	49 8b 7e 50          	mov    rdi,QWORD PTR [r14+0x50]
     13bd6a5:	e8 44 f6 14 00       	call   150ccee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352272>
     13bd6aa:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13bd6ad:	48 89 c7             	mov    rdi,rax
     13bd6b0:	ff 51 68             	call   QWORD PTR [rcx+0x68]

### 0x140abc7 (0x140ab48..0x140cff6) WRITE
     140ab9d:	48 8d 05 6c 54 f2 fe 	lea    rax,[rip+0xfffffffffef2546c]        # 330010 <_ZTSSt12bad_any_cast@@Base-0x601b8>
     140aba4:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     140abab:	00 
     140abac:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     140abb0:	48 c7 47 20 04 00 00 	mov    QWORD PTR [rdi+0x20],0x4
     140abb7:	00 
     140abb8:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     140abbb:	0f 29 84 24 60 04 00 	movaps XMMWORD PTR [rsp+0x460],xmm0
     140abc2:	00 
     140abc3:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     140abc7:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     140abce:	00 
     140abcf:	0f 57 c0             	xorps  xmm0,xmm0
     140abd2:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     140abd5:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     140abda:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
     140abde:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
     140abe5:	00 
     140abe6:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
     140abea:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
     140abf1:	00 
     140abf2:	e8 31 0b 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>

### 0x140adce (0x140ab48..0x140cff6)
     140ada7:	4c 89 a4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r12
     140adae:	00 
     140adaf:	48 89 18             	mov    QWORD PTR [rax],rbx
     140adb2:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     140adb7:	41 0f b7 4e 04       	movzx  ecx,WORD PTR [r14+0x4]
     140adbc:	66 89 48 0c          	mov    WORD PTR [rax+0xc],cx
     140adc0:	41 8b 0e             	mov    ecx,DWORD PTR [r14]
     140adc3:	89 48 08             	mov    DWORD PTR [rax+0x8],ecx
     140adc6:	0f 10 84 24 60 04 00 	movups xmm0,XMMWORD PTR [rsp+0x460]
     140adcd:	00 
     140adce:	0f 10 8c 24 70 04 00 	movups xmm1,XMMWORD PTR [rsp+0x470]
     140add5:	00 
     140add6:	0f 10 94 24 7a 04 00 	movups xmm2,XMMWORD PTR [rsp+0x47a]
     140addd:	00 
     140adde:	0f 11 40 0e          	movups XMMWORD PTR [rax+0xe],xmm0
     140ade2:	0f 11 48 1e          	movups XMMWORD PTR [rax+0x1e],xmm1
     140ade6:	0f 11 50 28          	movups XMMWORD PTR [rax+0x28],xmm2
     140adea:	48 8d b4 24 28 05 00 	lea    rsi,[rsp+0x528]
     140adf1:	00 
     140adf2:	48 89 06             	mov    QWORD PTR [rsi],rax
     140adf5:	48 8d 05 12 75 75 ff 	lea    rax,[rip+0xffffffffff757512]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
     140adfc:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax

### 0x140b2db (0x140ab48..0x140cff6)
     140b2b4:	48 89 18             	mov    QWORD PTR [rax],rbx
     140b2b7:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     140b2bb:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
     140b2bf:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
     140b2c4:	41 0f b7 4f 04       	movzx  ecx,WORD PTR [r15+0x4]
     140b2c9:	66 89 48 1c          	mov    WORD PTR [rax+0x1c],cx
     140b2cd:	41 8b 0f             	mov    ecx,DWORD PTR [r15]
     140b2d0:	89 48 18             	mov    DWORD PTR [rax+0x18],ecx
     140b2d3:	0f 10 84 24 60 04 00 	movups xmm0,XMMWORD PTR [rsp+0x460]
     140b2da:	00 
     140b2db:	0f 10 8c 24 70 04 00 	movups xmm1,XMMWORD PTR [rsp+0x470]
     140b2e2:	00 
     140b2e3:	0f 10 94 24 7a 04 00 	movups xmm2,XMMWORD PTR [rsp+0x47a]
     140b2ea:	00 
     140b2eb:	0f 11 40 1e          	movups XMMWORD PTR [rax+0x1e],xmm0
     140b2ef:	0f 11 48 2e          	movups XMMWORD PTR [rax+0x2e],xmm1
     140b2f3:	0f 11 50 38          	movups XMMWORD PTR [rax+0x38],xmm2
     140b2f7:	48 8d 8c 24 e0 03 00 	lea    rcx,[rsp+0x3e0]
     140b2fe:	00 
     140b2ff:	48 89 01             	mov    QWORD PTR [rcx],rax
     140b302:	48 8d 05 05 70 75 ff 	lea    rax,[rip+0xffffffffff757005]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
     140b309:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax

### 0x140b3e2 (0x140ab48..0x140cff6) WRITE
     140b3b8:	48 8d 05 47 ec f4 fe 	lea    rax,[rip+0xfffffffffef4ec47]        # 35a006 <_ZTSSt12bad_any_cast@@Base-0x361c2>
     140b3bf:	48 8d 9c 24 40 02 00 	lea    rbx,[rsp+0x240]
     140b3c6:	00 
     140b3c7:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     140b3cb:	48 c7 43 20 0b 00 00 	mov    QWORD PTR [rbx+0x20],0xb
     140b3d2:	00 
     140b3d3:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
     140b3d6:	0f 29 84 24 60 04 00 	movaps XMMWORD PTR [rsp+0x460],xmm0
     140b3dd:	00 
     140b3de:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     140b3e2:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     140b3e9:	00 
     140b3ea:	0f 57 c0             	xorps  xmm0,xmm0
     140b3ed:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     140b3f0:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     140b3f5:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     140b3f9:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
     140b400:	00 
     140b401:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     140b405:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
     140b40c:	00 
     140b40d:	48 89 df             	mov    rdi,rbx

### 0x140c0c0 (0x140ab48..0x140cff6) WRITE
     140c096:	48 8d 05 db 90 f5 fe 	lea    rax,[rip+0xfffffffffef590db]        # 365178 <_ZTSSt12bad_any_cast@@Base-0x2b050>
     140c09d:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     140c0a4:	00 
     140c0a5:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     140c0a9:	48 c7 47 20 04 00 00 	mov    QWORD PTR [rdi+0x20],0x4
     140c0b0:	00 
     140c0b1:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     140c0b4:	0f 29 84 24 60 04 00 	movaps XMMWORD PTR [rsp+0x460],xmm0
     140c0bb:	00 
     140c0bc:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     140c0c0:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     140c0c7:	00 
     140c0c8:	0f 57 c0             	xorps  xmm0,xmm0
     140c0cb:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     140c0ce:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     140c0d3:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
     140c0d7:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
     140c0de:	00 
     140c0df:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
     140c0e3:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
     140c0ea:	00 
     140c0eb:	e8 38 f6 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>

### 0x140c40f (0x140ab48..0x140cff6)
     140c3ea:	4c 89 30             	mov    QWORD PTR [rax],r14
     140c3ed:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
     140c3f1:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
     140c3f5:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     140c3fa:	0f b7 4a 04          	movzx  ecx,WORD PTR [rdx+0x4]
     140c3fe:	66 89 48 1c          	mov    WORD PTR [rax+0x1c],cx
     140c402:	8b 0a                	mov    ecx,DWORD PTR [rdx]
     140c404:	89 48 18             	mov    DWORD PTR [rax+0x18],ecx
     140c407:	0f 10 84 24 60 04 00 	movups xmm0,XMMWORD PTR [rsp+0x460]
     140c40e:	00 
     140c40f:	0f 10 8c 24 70 04 00 	movups xmm1,XMMWORD PTR [rsp+0x470]
     140c416:	00 
     140c417:	0f 10 94 24 7a 04 00 	movups xmm2,XMMWORD PTR [rsp+0x47a]
     140c41e:	00 
     140c41f:	0f 11 40 1e          	movups XMMWORD PTR [rax+0x1e],xmm0
     140c423:	0f 11 48 2e          	movups XMMWORD PTR [rax+0x2e],xmm1
     140c427:	0f 11 50 38          	movups XMMWORD PTR [rax+0x38],xmm2
     140c42b:	48 8d 8c 24 e0 03 00 	lea    rcx,[rsp+0x3e0]
     140c432:	00 
     140c433:	48 89 01             	mov    QWORD PTR [rcx],rax
     140c436:	48 8d 05 d1 5e 75 ff 	lea    rax,[rip+0xffffffffff755ed1]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
     140c43d:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax

### 0x140c79a (0x140ab48..0x140cff6)
     140c775:	48 89 18             	mov    QWORD PTR [rax],rbx
     140c778:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
     140c77c:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
     140c780:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     140c785:	0f b7 4a 04          	movzx  ecx,WORD PTR [rdx+0x4]
     140c789:	66 89 48 1c          	mov    WORD PTR [rax+0x1c],cx
     140c78d:	8b 0a                	mov    ecx,DWORD PTR [rdx]
     140c78f:	89 48 18             	mov    DWORD PTR [rax+0x18],ecx
     140c792:	0f 10 84 24 60 04 00 	movups xmm0,XMMWORD PTR [rsp+0x460]
     140c799:	00 
     140c79a:	0f 10 8c 24 70 04 00 	movups xmm1,XMMWORD PTR [rsp+0x470]
     140c7a1:	00 
     140c7a2:	0f 10 94 24 7a 04 00 	movups xmm2,XMMWORD PTR [rsp+0x47a]
     140c7a9:	00 
     140c7aa:	0f 11 40 1e          	movups XMMWORD PTR [rax+0x1e],xmm0
     140c7ae:	0f 11 48 2e          	movups XMMWORD PTR [rax+0x2e],xmm1
     140c7b2:	0f 11 50 38          	movups XMMWORD PTR [rax+0x38],xmm2
     140c7b6:	48 8d 8c 24 e0 03 00 	lea    rcx,[rsp+0x3e0]
     140c7bd:	00 
     140c7be:	48 89 01             	mov    QWORD PTR [rcx],rax
     140c7c1:	48 8d 05 46 5b 75 ff 	lea    rax,[rip+0xffffffffff755b46]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
     140c7c8:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax

### 0x141a9b2 (0x141a788..0x141b53b) WRITE
     141a97f:	31 c0                	xor    eax,eax
     141a981:	48 89 83 78 03 00 00 	mov    QWORD PTR [rbx+0x378],rax
     141a988:	48 83 a4 24 88 00 00 	and    QWORD PTR [rsp+0x88],0x0
     141a98f:	00 00 
     141a991:	31 c0                	xor    eax,eax
     141a993:	88 83 80 03 00 00    	mov    BYTE PTR [rbx+0x380],al
     141a999:	88 83 88 03 00 00    	mov    BYTE PTR [rbx+0x388],al
     141a99f:	88 83 90 03 00 00    	mov    BYTE PTR [rbx+0x390],al
     141a9a5:	88 83 94 03 00 00    	mov    BYTE PTR [rbx+0x394],al
     141a9ab:	88 84 24 50 04 00 00 	mov    BYTE PTR [rsp+0x450],al
     141a9b2:	88 84 24 70 04 00 00 	mov    BYTE PTR [rsp+0x470],al
     141a9b9:	88 84 24 78 04 00 00 	mov    BYTE PTR [rsp+0x478],al
     141a9c0:	88 84 24 98 04 00 00 	mov    BYTE PTR [rsp+0x498],al
     141a9c7:	88 84 24 a0 04 00 00 	mov    BYTE PTR [rsp+0x4a0],al
     141a9ce:	88 84 24 c0 04 00 00 	mov    BYTE PTR [rsp+0x4c0],al
     141a9d5:	88 84 24 c8 04 00 00 	mov    BYTE PTR [rsp+0x4c8],al
     141a9dc:	88 84 24 e8 04 00 00 	mov    BYTE PTR [rsp+0x4e8],al
     141a9e3:	88 84 24 f0 04 00 00 	mov    BYTE PTR [rsp+0x4f0],al
     141a9ea:	88 84 24 10 05 00 00 	mov    BYTE PTR [rsp+0x510],al
     141a9f1:	88 84 24 18 05 00 00 	mov    BYTE PTR [rsp+0x518],al
     141a9f8:	88 84 24 38 05 00 00 	mov    BYTE PTR [rsp+0x538],al
     141a9ff:	88 84 24 40 05 00 00 	mov    BYTE PTR [rsp+0x540],al

### 0x143fa48 (0x143f86e..0x143fbb9) WRITE
     143fa16:	48 8d 05 fb 21 01 ff 	lea    rax,[rip+0xffffffffff0121fb]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     143fa1d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     143fa22:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     143fa27:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
     143fa2d:	48 8d bc 24 10 03 00 	lea    rdi,[rsp+0x310]
     143fa34:	00 
     143fa35:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     143fa3a:	e8 7b 01 00 00       	call   143fbba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28513e>
     143fa3f:	48 83 a4 24 60 04 00 	and    QWORD PTR [rsp+0x460],0x0
     143fa46:	00 00 
     143fa48:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
     143fa4f:	00 00 
     143fa51:	bf 48 01 00 00       	mov    edi,0x148
     143fa56:	e8 a5 e4 3a 00       	call   17edf00 <_Znwm@plt>
     143fa5b:	49 89 c6             	mov    r14,rax
     143fa5e:	4c 8d a4 24 10 03 00 	lea    r12,[rsp+0x310]
     143fa65:	00 
     143fa66:	48 89 c7             	mov    rdi,rax
     143fa69:	4c 89 e6             	mov    rsi,r12
     143fa6c:	e8 49 01 00 00       	call   143fbba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28513e>
     143fa71:	4c 8d ac 24 60 04 00 	lea    r13,[rsp+0x460]
     143fa78:	00 

### 0x144228e (0x1441ff6..0x144252f) WRITE
     144225c:	4c 8d 7d 38          	lea    r15,[rbp+0x38]
     1442260:	4c 89 ff             	mov    rdi,r15
     1442263:	e8 6e 6f de ff       	call   12291d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e75a>
     1442268:	c6 85 a8 03 00 00 00 	mov    BYTE PTR [rbp+0x3a8],0x0
     144226f:	48 8d bd b0 03 00 00 	lea    rdi,[rbp+0x3b0]
     1442276:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     144227b:	e8 66 ad 66 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     1442280:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     1442285:	48 83 c0 10          	add    rax,0x10
     1442289:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     144228e:	48 89 8d 70 04 00 00 	mov    QWORD PTR [rbp+0x470],rcx
     1442295:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     144229a:	48 89 8d 78 04 00 00 	mov    QWORD PTR [rbp+0x478],rcx
     14422a1:	48 89 85 80 04 00 00 	mov    QWORD PTR [rbp+0x480],rax
     14422a8:	48 8d bd 90 04 00 00 	lea    rdi,[rbp+0x490]
     14422af:	48 83 bc 24 50 01 00 	cmp    QWORD PTR [rsp+0x150],0x0
     14422b6:	00 00 
     14422b8:	74 0f                	je     14422c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28784d>
     14422ba:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     14422c1:	00 
     14422c2:	e8 13 13 89 ff       	call   cd35da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22057a>
     14422c7:	eb 23                	jmp    14422ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287870>

### 0x14430b6 (0x1442fd2..0x1443e3e)
     144308a:	4c 89 f6             	mov    rsi,r14
     144308d:	e8 08 97 68 ff       	call   acc79a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1973a>
     1443092:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
     1443097:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]
     144309c:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     14430a1:	c6 44 24 60 01       	mov    BYTE PTR [rsp+0x60],0x1
     14430a6:	4d 8b 77 08          	mov    r14,QWORD PTR [r15+0x8]
     14430aa:	41 0f 28 87 60 04 00 	movaps xmm0,XMMWORD PTR [r15+0x460]
     14430b1:	00 
     14430b2:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     14430b6:	49 8b 9f 70 04 00 00 	mov    rbx,QWORD PTR [r15+0x470]
     14430bd:	49 8b 87 e0 04 00 00 	mov    rax,QWORD PTR [r15+0x4e0]
     14430c4:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     14430c9:	bf 30 02 00 00       	mov    edi,0x230
     14430ce:	e8 2d ae 3a 00       	call   17edf00 <_Znwm@plt>
     14430d3:	48 89 c5             	mov    rbp,rax
     14430d6:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     14430dd:	00 
     14430de:	4c 89 e6             	mov    rsi,r12
     14430e1:	e8 14 c4 c6 ff       	call   10af4fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276910>
     14430e6:	49 8d b7 b0 04 00 00 	lea    rsi,[r15+0x4b0]
     14430ed:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]

### 0x14465b6 (0x14462dc..0x1446ffc)
     144658a:	00 
     144658b:	48 8d 8c 24 80 04 00 	lea    rcx,[rsp+0x480]
     1446592:	00 
     1446593:	c7 41 f0 03 00 00 00 	mov    DWORD PTR [rcx-0x10],0x3
     144659a:	48 8d 05 57 b5 42 00 	lea    rax,[rip+0x42b557]        # 1871af8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e1e0>
     14465a1:	48 89 01             	mov    QWORD PTR [rcx],rax
     14465a4:	4c 89 61 08          	mov    QWORD PTR [rcx+0x8],r12
     14465a8:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     14465ac:	48 be 03 00 00 00 01 	movabs rsi,0x100000003
     14465b3:	00 00 00 
     14465b6:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
     14465bd:	00 
     14465be:	48 89 df             	mov    rdi,rbx
     14465c1:	e8 a8 1b 00 00       	call   144816e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28d6f2>
     14465c6:	48 8d 9c 24 40 07 00 	lea    rbx,[rsp+0x740]
     14465cd:	00 
     14465ce:	48 8d 8c 24 40 04 00 	lea    rcx,[rsp+0x440]
     14465d5:	00 
     14465d6:	c7 41 f0 04 00 00 00 	mov    DWORD PTR [rcx-0x10],0x4
     14465dd:	48 8d 05 14 b5 42 00 	lea    rax,[rip+0x42b514]        # 1871af8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e1e0>
     14465e4:	48 89 01             	mov    QWORD PTR [rcx],rax
     14465e7:	4c 89 61 08          	mov    QWORD PTR [rcx+0x8],r12

### 0x1466312 (0x14662e6..0x14663ce)
     14662ea:	48 81 ec 80 09 00 00 	sub    rsp,0x980
     14662f1:	89 cd                	mov    ebp,ecx
     14662f3:	49 89 d6             	mov    r14,rdx
     14662f6:	48 89 fb             	mov    rbx,rdi
     14662f9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1466300:	00 00 
     1466302:	48 89 84 24 78 09 00 	mov    QWORD PTR [rsp+0x978],rax
     1466309:	00 
     146630a:	48 89 e7             	mov    rdi,rsp
     146630d:	e8 ae 31 21 00       	call   16794c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d62c>
     1466312:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1466319:	00 
     146631a:	4c 89 f6             	mov    rsi,r14
     146631d:	e8 1e 7c 38 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1466322:	48 89 e6             	mov    rsi,rsp
     1466325:	40 88 ae 88 04 00 00 	mov    BYTE PTR [rsi+0x488],bpl
     146632c:	4c 8d b4 24 98 04 00 	lea    r14,[rsp+0x498]
     1466333:	00 
     1466334:	4c 89 f7             	mov    rdi,r14
     1466337:	e8 b8 f9 ff ff       	call   1465cf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ab278>
     146633c:	48 81 c3 10 01 00 00 	add    rbx,0x110
     1466343:	48 8d b4 24 90 04 00 	lea    rsi,[rsp+0x490]

### 0x146a2c0 (0x146a282..0x146a6b3)
     146a297:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     146a29e:	00 00 
     146a2a0:	48 89 84 24 e8 0d 00 	mov    QWORD PTR [rsp+0xde8],rax
     146a2a7:	00 
     146a2a8:	be c0 04 00 00       	mov    esi,0x4c0
     146a2ad:	49 03 36             	add    rsi,QWORD PTR [r14]
     146a2b0:	4c 8d bc 24 70 09 00 	lea    r15,[rsp+0x970]
     146a2b7:	00 
     146a2b8:	4c 89 ff             	mov    rdi,r15
     146a2bb:	e8 58 88 9a ff       	call   e12b18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfb9e>
     146a2c0:	41 80 bf 70 04 00 00 	cmp    BYTE PTR [r15+0x470],0x0
     146a2c7:	00 
     146a2c8:	0f 84 f2 00 00 00    	je     146a3c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af944>
     146a2ce:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
     146a2d5:	00 
     146a2d6:	48 8d b4 24 70 09 00 	lea    rsi,[rsp+0x970]
     146a2dd:	00 
     146a2de:	e8 dd f1 20 00       	call   16794c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d62c>
     146a2e3:	48 8d bc 24 30 05 00 	lea    rdi,[rsp+0x530]
     146a2ea:	00 
     146a2eb:	48 8d 35 06 82 58 00 	lea    rsi,[rip+0x588206]        # 19f24f8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x5b7>
     146a2f2:	e8 8d 03 a2 ff       	call   e8a684 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51a9a>

### 0x146a3f5 (0x146a282..0x146a6b3)
     146a3c8:	e8 f9 24 9a ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>
     146a3cd:	49 8b 06             	mov    rax,QWORD PTR [r14]
     146a3d0:	80 b8 30 09 00 00 00 	cmp    BYTE PTR [rax+0x930],0x0
     146a3d7:	0f 84 e0 01 00 00    	je     146a5bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2afb41>
     146a3dd:	48 8b b3 c8 01 00 00 	mov    rsi,QWORD PTR [rbx+0x1c8]
     146a3e4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     146a3e7:	4c 8d bc 24 70 09 00 	lea    r15,[rsp+0x970]
     146a3ee:	00 
     146a3ef:	4c 89 ff             	mov    rdi,r15
     146a3f2:	ff 50 40             	call   QWORD PTR [rax+0x40]
     146a3f5:	41 80 bf 70 04 00 00 	cmp    BYTE PTR [r15+0x470],0x0
     146a3fc:	00 
     146a3fd:	0f 84 97 00 00 00    	je     146a49a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2afa1e>
     146a403:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
     146a406:	48 8b b3 c8 01 00 00 	mov    rsi,QWORD PTR [rbx+0x1c8]
     146a40d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     146a410:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     146a417:	00 
     146a418:	ff 50 40             	call   QWORD PTR [rax+0x40]
     146a41b:	49 81 c7 c0 04 00 00 	add    r15,0x4c0
     146a422:	4c 8d a4 24 88 00 00 	lea    r12,[rsp+0x88]
     146a429:	00 

### 0x146b660 (0x146b635..0x146b6ae)
     146b635:	53                   	push   rbx
     146b636:	48 81 ec 80 04 00 00 	sub    rsp,0x480
     146b63d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     146b644:	00 00 
     146b646:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
     146b64d:	00 
     146b64e:	48 8d b7 c0 04 00 00 	lea    rsi,[rdi+0x4c0]
     146b655:	48 89 e3             	mov    rbx,rsp
     146b658:	48 89 df             	mov    rdi,rbx
     146b65b:	e8 b8 74 9a ff       	call   e12b18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfb9e>
     146b660:	80 bb 70 04 00 00 00 	cmp    BYTE PTR [rbx+0x470],0x0
     146b667:	74 18                	je     146b681 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b0c05>
     146b669:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     146b66e:	48 8d 35 83 6e 58 00 	lea    rsi,[rip+0x586e83]        # 19f24f8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x5b7>
     146b675:	e8 0a f0 a1 ff       	call   e8a684 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51a9a>
     146b67a:	89 c3                	mov    ebx,eax
     146b67c:	80 f3 01             	xor    bl,0x1
     146b67f:	eb 02                	jmp    146b683 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b0c07>
     146b681:	b3 01                	mov    bl,0x1
     146b683:	48 89 e7             	mov    rdi,rsp
     146b686:	e8 3b 12 9a ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>
     146b68b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x1474268 (0x14740f4..0x147584c) WRITE
     1474241:	75 45                	jne    1474288 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b980c>
     1474243:	49 83 7d 38 00       	cmp    QWORD PTR [r13+0x38],0x0
     1474248:	74 3e                	je     1474288 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b980c>
     147424a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     147424f:	e8 e3 d2 0d 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1474254:	48 83 c0 18          	add    rax,0x18
     1474258:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     147425f:	00 
     1474260:	48 89 c6             	mov    rsi,rax
     1474263:	e8 08 96 7a ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
     1474268:	4c 89 ac 24 70 04 00 	mov    QWORD PTR [rsp+0x470],r13
     147426f:	00 
     1474270:	48 8d 05 ed 81 60 ff 	lea    rax,[rip+0xffffffffff6081ed]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     1474277:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
     147427e:	00 
     147427f:	48 8d 05 c6 15 00 00 	lea    rax,[rip+0x15c6]        # 147584c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2badd0>
     1474286:	eb 23                	jmp    14742ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b982f>
     1474288:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     147428d:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     1474294:	00 
     1474295:	48 8d 05 c8 81 60 ff 	lea    rax,[rip+0xffffffffff6081c8]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     147429c:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax

### 0x147428d (0x14740f4..0x147584c) WRITE
     1474260:	48 89 c6             	mov    rsi,rax
     1474263:	e8 08 96 7a ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
     1474268:	4c 89 ac 24 70 04 00 	mov    QWORD PTR [rsp+0x470],r13
     147426f:	00 
     1474270:	48 8d 05 ed 81 60 ff 	lea    rax,[rip+0xffffffffff6081ed]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     1474277:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
     147427e:	00 
     147427f:	48 8d 05 c6 15 00 00 	lea    rax,[rip+0x15c6]        # 147584c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2badd0>
     1474286:	eb 23                	jmp    14742ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b982f>
     1474288:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     147428d:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     1474294:	00 
     1474295:	48 8d 05 c8 81 60 ff 	lea    rax,[rip+0xffffffffff6081c8]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     147429c:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
     14742a3:	00 
     14742a4:	48 8d 05 65 17 00 00 	lea    rax,[rip+0x1765]        # 1475a10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2baf94>
     14742ab:	48 89 84 24 88 04 00 	mov    QWORD PTR [rsp+0x488],rax
     14742b2:	00 
     14742b3:	4c 8d b4 24 70 04 00 	lea    r14,[rsp+0x470]
     14742ba:	00 
     14742bb:	4c 89 f7             	mov    rdi,r14
     14742be:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]

### 0x14742b3 (0x14740f4..0x147584c)
     1474286:	eb 23                	jmp    14742ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b982f>
     1474288:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     147428d:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     1474294:	00 
     1474295:	48 8d 05 c8 81 60 ff 	lea    rax,[rip+0xffffffffff6081c8]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     147429c:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
     14742a3:	00 
     14742a4:	48 8d 05 65 17 00 00 	lea    rax,[rip+0x1765]        # 1475a10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2baf94>
     14742ab:	48 89 84 24 88 04 00 	mov    QWORD PTR [rsp+0x488],rax
     14742b2:	00 
     14742b3:	4c 8d b4 24 70 04 00 	lea    r14,[rsp+0x470]
     14742ba:	00 
     14742bb:	4c 89 f7             	mov    rdi,r14
     14742be:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
     14742c5:	00 
     14742c6:	e8 4d 16 00 00       	call   1475918 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bae9c>
     14742cb:	4c 89 f7             	mov    rdi,r14
     14742ce:	e8 17 17 00 00       	call   14759ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2baf6e>
     14742d3:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14742d8:	e8 5a d2 0d 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     14742dd:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     14742e2:	0f 57 c0             	xorps  xmm0,xmm0

### 0x14743bc (0x14740f4..0x147584c)
     1474394:	48 89 df             	mov    rdi,rbx
     1474397:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     147439c:	e8 af 82 c1 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     14743a1:	49 8b 2e             	mov    rbp,QWORD PTR [r14]
     14743a4:	4c 8d bc 24 10 04 00 	lea    r15,[rsp+0x410]
     14743ab:	00 
     14743ac:	4c 89 ff             	mov    rdi,r15
     14743af:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
     14743b6:	00 
     14743b7:	e8 ee 18 00 00       	call   1475caa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb22e>
     14743bc:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     14743c3:	00 
     14743c4:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     14743c9:	48 89 da             	mov    rdx,rbx
     14743cc:	4c 89 e9             	mov    rcx,r13
     14743cf:	49 89 e8             	mov    r8,rbp
     14743d2:	6a 01                	push   0x1
     14743d4:	41 59                	pop    r9
     14743d6:	41 54                	push   r12
     14743d8:	41 57                	push   r15
     14743da:	e8 dd 18 00 00       	call   1475cbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb240>
     14743df:	58                   	pop    rax

### 0x14743f9 (0x14740f4..0x147584c)
     14743d8:	41 57                	push   r15
     14743da:	e8 dd 18 00 00       	call   1475cbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb240>
     14743df:	58                   	pop    rax
     14743e0:	59                   	pop    rcx
     14743e1:	4c 89 ff             	mov    rdi,r15
     14743e4:	e8 25 01 db ff       	call   122450e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a92>
     14743e9:	80 bc 24 08 07 00 00 	cmp    BYTE PTR [rsp+0x708],0x0
     14743f0:	00 
     14743f1:	48 8d ac 24 18 01 00 	lea    rbp,[rsp+0x118]
     14743f8:	00 
     14743f9:	4c 8d a4 24 70 04 00 	lea    r12,[rsp+0x470]
     1474400:	00 
     1474401:	4c 8d bc 24 c0 07 00 	lea    r15,[rsp+0x7c0]
     1474408:	00 
     1474409:	74 0b                	je     1474416 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b999a>
     147440b:	4c 89 ff             	mov    rdi,r15
     147440e:	4c 89 e6             	mov    rsi,r12
     1474411:	e8 7e 19 00 00       	call   1475d94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb318>
     1474416:	4c 89 e7             	mov    rdi,r12
     1474419:	e8 1e 5c db ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
     147441e:	48 8d bc 24 58 08 00 	lea    rdi,[rsp+0x858]
     1474425:	00 

### 0x147449f (0x14740f4..0x147584c)
     1474474:	4c 8b a4 24 10 04 00 	mov    r12,QWORD PTR [rsp+0x410]
     147447b:	00 
     147447c:	4c 8b ac 24 18 04 00 	mov    r13,QWORD PTR [rsp+0x418]
     1474483:	00 
     1474484:	0f 85 0d 01 00 00    	jne    1474597 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9b1b>
     147448a:	4d 39 ec             	cmp    r12,r13
     147448d:	0f 84 09 01 00 00    	je     147459c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9b20>
     1474493:	4c 89 e7             	mov    rdi,r12
     1474496:	e8 9c d0 0d 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     147449b:	4d 8b 66 08          	mov    r12,QWORD PTR [r14+0x8]
     147449f:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     14744a6:	00 
     14744a7:	48 89 c6             	mov    rsi,rax
     14744aa:	e8 a1 81 c1 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     14744af:	4c 89 a4 24 b8 04 00 	mov    QWORD PTR [rsp+0x4b8],r12
     14744b6:	00 
     14744b7:	48 c7 84 24 c0 04 00 	mov    QWORD PTR [rsp+0x4c0],0x7530
     14744be:	00 30 75 00 00 
     14744c3:	80 bc 24 68 07 00 00 	cmp    BYTE PTR [rsp+0x768],0x0
     14744ca:	00 
     14744cb:	74 1d                	je     14744ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9a6e>
     14744cd:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]

### 0x14744d5 (0x14740f4..0x147584c)
     14744aa:	e8 a1 81 c1 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     14744af:	4c 89 a4 24 b8 04 00 	mov    QWORD PTR [rsp+0x4b8],r12
     14744b6:	00 
     14744b7:	48 c7 84 24 c0 04 00 	mov    QWORD PTR [rsp+0x4c0],0x7530
     14744be:	00 30 75 00 00 
     14744c3:	80 bc 24 68 07 00 00 	cmp    BYTE PTR [rsp+0x768],0x0
     14744ca:	00 
     14744cb:	74 1d                	je     14744ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9a6e>
     14744cd:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
     14744d4:	00 
     14744d5:	4c 8d a4 24 70 04 00 	lea    r12,[rsp+0x470]
     14744dc:	00 
     14744dd:	4c 89 e6             	mov    rsi,r12
     14744e0:	e8 ed 39 ee ff       	call   1357ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d456>
     14744e5:	e9 81 00 00 00       	jmp    147456b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9aef>
     14744ea:	48 8b 84 24 80 04 00 	mov    rax,QWORD PTR [rsp+0x480]
     14744f1:	00 
     14744f2:	48 89 84 24 20 07 00 	mov    QWORD PTR [rsp+0x720],rax
     14744f9:	00 
     14744fa:	0f 28 84 24 70 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x470]
     1474501:	00 
     1474502:	0f 29 84 24 10 07 00 	movaps XMMWORD PTR [rsp+0x710],xmm0

### 0x14744fa (0x14740f4..0x147584c)
     14744d4:	00 
     14744d5:	4c 8d a4 24 70 04 00 	lea    r12,[rsp+0x470]
     14744dc:	00 
     14744dd:	4c 89 e6             	mov    rsi,r12
     14744e0:	e8 ed 39 ee ff       	call   1357ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d456>
     14744e5:	e9 81 00 00 00       	jmp    147456b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9aef>
     14744ea:	48 8b 84 24 80 04 00 	mov    rax,QWORD PTR [rsp+0x480]
     14744f1:	00 
     14744f2:	48 89 84 24 20 07 00 	mov    QWORD PTR [rsp+0x720],rax
     14744f9:	00 
     14744fa:	0f 28 84 24 70 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x470]
     1474501:	00 
     1474502:	0f 29 84 24 10 07 00 	movaps XMMWORD PTR [rsp+0x710],xmm0
     1474509:	00 
     147450a:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     1474511:	00 00 
     1474513:	0f 57 c9             	xorps  xmm1,xmm1
     1474516:	0f 29 8c 24 70 04 00 	movaps XMMWORD PTR [rsp+0x470],xmm1
     147451d:	00 
     147451e:	48 8d 8c 24 b8 04 00 	lea    rcx,[rsp+0x4b8]
     1474525:	00 
     1474526:	48 8b 41 e0          	mov    rax,QWORD PTR [rcx-0x20]

### 0x1474516 (0x14740f4..0x147584c)
     14744f1:	00 
     14744f2:	48 89 84 24 20 07 00 	mov    QWORD PTR [rsp+0x720],rax
     14744f9:	00 
     14744fa:	0f 28 84 24 70 04 00 	movaps xmm0,XMMWORD PTR [rsp+0x470]
     1474501:	00 
     1474502:	0f 29 84 24 10 07 00 	movaps XMMWORD PTR [rsp+0x710],xmm0
     1474509:	00 
     147450a:	48 83 a4 24 80 04 00 	and    QWORD PTR [rsp+0x480],0x0
     1474511:	00 00 
     1474513:	0f 57 c9             	xorps  xmm1,xmm1
     1474516:	0f 29 8c 24 70 04 00 	movaps XMMWORD PTR [rsp+0x470],xmm1
     147451d:	00 
     147451e:	48 8d 8c 24 b8 04 00 	lea    rcx,[rsp+0x4b8]
     1474525:	00 
     1474526:	48 8b 41 e0          	mov    rax,QWORD PTR [rcx-0x20]
     147452a:	48 8d 94 24 28 07 00 	lea    rdx,[rsp+0x728]
     1474531:	00 
     1474532:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     1474536:	0f 10 41 d0          	movups xmm0,XMMWORD PTR [rcx-0x30]
     147453a:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
     147453d:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
     1474542:	0f 11 49 d0          	movups XMMWORD PTR [rcx-0x30],xmm1

### 0x1474563 (0x14740f4..0x147584c)
     147453d:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
     1474542:	0f 11 49 d0          	movups XMMWORD PTR [rcx-0x30],xmm1
     1474546:	8a 41 f8             	mov    al,BYTE PTR [rcx-0x8]
     1474549:	88 42 28             	mov    BYTE PTR [rdx+0x28],al
     147454c:	0f 10 41 e8          	movups xmm0,XMMWORD PTR [rcx-0x18]
     1474550:	0f 11 42 18          	movups XMMWORD PTR [rdx+0x18],xmm0
     1474554:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     1474557:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     147455b:	c6 84 24 68 07 00 00 	mov    BYTE PTR [rsp+0x768],0x1
     1474562:	01 
     1474563:	4c 8d a4 24 70 04 00 	lea    r12,[rsp+0x470]
     147456a:	00 
     147456b:	4c 89 e7             	mov    rdi,r12
     147456e:	e8 59 a2 62 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1474573:	4c 8b a4 24 10 04 00 	mov    r12,QWORD PTR [rsp+0x410]
     147457a:	00 
     147457b:	4c 8b ac 24 18 04 00 	mov    r13,QWORD PTR [rsp+0x418]
     1474582:	00 
     1474583:	eb 12                	jmp    1474597 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9b1b>
     1474585:	4c 89 ff             	mov    rdi,r15
     1474588:	4c 89 e6             	mov    rsi,r12
     147458b:	e8 04 18 00 00       	call   1475d94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb318>

### 0x147462a (0x14740f4..0x147584c)
     1474603:	48 89 c3             	mov    rbx,rax
     1474606:	48 89 c2             	mov    rdx,rax
     1474609:	e8 bb 15 00 00       	call   1475bc9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb14d>
     147460e:	4c 8d bc 24 10 04 00 	lea    r15,[rsp+0x410]
     1474615:	00 
     1474616:	4c 89 ff             	mov    rdi,r15
     1474619:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
     1474620:	00 
     1474621:	e8 84 16 00 00       	call   1475caa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb22e>
     1474626:	45 0f b6 cc          	movzx  r9d,r12b
     147462a:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1474631:	00 
     1474632:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     1474637:	48 8d 94 24 58 08 00 	lea    rdx,[rsp+0x858]
     147463e:	00 
     147463f:	4c 89 e9             	mov    rcx,r13
     1474642:	4d 89 f0             	mov    r8,r14
     1474645:	53                   	push   rbx
     1474646:	41 57                	push   r15
     1474648:	e8 6f 16 00 00       	call   1475cbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb240>
     147464d:	58                   	pop    rax
     147464e:	59                   	pop    rcx

### 0x147465f (0x14740f4..0x147584c)
     1474642:	4d 89 f0             	mov    r8,r14
     1474645:	53                   	push   rbx
     1474646:	41 57                	push   r15
     1474648:	e8 6f 16 00 00       	call   1475cbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb240>
     147464d:	58                   	pop    rax
     147464e:	59                   	pop    rcx
     147464f:	4c 89 ff             	mov    rdi,r15
     1474652:	e8 b7 fe da ff       	call   122450e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a92>
     1474657:	80 bc 24 08 07 00 00 	cmp    BYTE PTR [rsp+0x708],0x0
     147465e:	00 
     147465f:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     1474666:	00 
     1474667:	4c 8d bc 24 c0 07 00 	lea    r15,[rsp+0x7c0]
     147466e:	00 
     147466f:	74 0b                	je     147467c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9c00>
     1474671:	4c 89 ff             	mov    rdi,r15
     1474674:	48 89 de             	mov    rsi,rbx
     1474677:	e8 18 17 00 00       	call   1475d94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb318>
     147467c:	48 89 df             	mov    rdi,rbx
     147467f:	e8 b8 59 db ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
     1474684:	48 8d bc 24 58 08 00 	lea    rdi,[rsp+0x858]
     147468b:	00 

### 0x1474712 (0x14740f4..0x147584c) WRITE
     14746f2:	eb 0d                	jmp    1474701 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9c85>
     14746f4:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14746f7:	4d 89 f4             	mov    r12,r14
     14746fa:	48 85 c0             	test   rax,rax
     14746fd:	75 bc                	jne    14746bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9c3f>
     14746ff:	eb 04                	jmp    1474705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9c89>
     1474701:	4d 8d 66 08          	lea    r12,[r14+0x8]
     1474705:	bf 80 00 00 00       	mov    edi,0x80
     147470a:	e8 f1 97 37 00       	call   17edf00 <_Znwm@plt>
     147470f:	48 89 c3             	mov    rbx,rax
     1474712:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     1474719:	00 
     147471a:	48 8d 84 24 c8 00 00 	lea    rax,[rsp+0xc8]
     1474721:	00 
     1474722:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
     1474729:	00 
     147472a:	c6 84 24 80 04 00 00 	mov    BYTE PTR [rsp+0x480],0x0
     1474731:	00 
     1474732:	48 89 df             	mov    rdi,rbx
     1474735:	48 83 c7 20          	add    rdi,0x20
     1474739:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     147473e:	e8 0d 7f c1 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>

### 0x14747b6 (0x14740f4..0x147584c) WRITE
     1474790:	74 0c                	je     147479e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9d22>
     1474792:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     1474799:	00 
     147479a:	49 8b 1c 24          	mov    rbx,QWORD PTR [r12]
     147479e:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     14747a5:	00 
     14747a6:	48 89 de             	mov    rsi,rbx
     14747a9:	e8 70 58 63 ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
     14747ae:	48 ff 84 24 d0 00 00 	inc    QWORD PTR [rsp+0xd0]
     14747b5:	00 
     14747b6:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
     14747bd:	00 00 
     14747bf:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     14747c6:	00 
     14747c7:	e8 ea 16 00 00       	call   1475eb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb43a>
     14747cc:	4c 89 ff             	mov    rdi,r15
     14747cf:	e8 9a 16 00 00       	call   1475e6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb3f2>
     14747d4:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     14747db:	00 
     14747dc:	e8 09 12 00 00       	call   14759ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2baf6e>
     14747e1:	48 89 ef             	mov    rdi,rbp
     14747e4:	e8 f3 48 0e 00       	call   15590dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e660>

### 0x14747bf (0x14740f4..0x147584c)
     1474799:	00 
     147479a:	49 8b 1c 24          	mov    rbx,QWORD PTR [r12]
     147479e:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     14747a5:	00 
     14747a6:	48 89 de             	mov    rsi,rbx
     14747a9:	e8 70 58 63 ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
     14747ae:	48 ff 84 24 d0 00 00 	inc    QWORD PTR [rsp+0xd0]
     14747b5:	00 
     14747b6:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
     14747bd:	00 00 
     14747bf:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     14747c6:	00 
     14747c7:	e8 ea 16 00 00       	call   1475eb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb43a>
     14747cc:	4c 89 ff             	mov    rdi,r15
     14747cf:	e8 9a 16 00 00       	call   1475e6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb3f2>
     14747d4:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     14747db:	00 
     14747dc:	e8 09 12 00 00       	call   14759ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2baf6e>
     14747e1:	48 89 ef             	mov    rdi,rbp
     14747e4:	e8 f3 48 0e 00       	call   15590dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e660>
     14747e9:	e9 d3 f9 ff ff       	jmp    14741c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9745>
     14747ee:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]

### 0x1474927 (0x14740f4..0x147584c)
     147490a:	48 29 c8             	sub    rax,rcx
     147490d:	48 99                	cqo
     147490f:	6a 48                	push   0x48
     1474911:	5f                   	pop    rdi
     1474912:	48 f7 ff             	idiv   rdi
     1474915:	48 39 f0             	cmp    rax,rsi
     1474918:	73 5c                	jae    1474976 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9efa>
     147491a:	48 b8 8f e3 38 8e e3 	movabs rax,0x38e38e38e38e38f
     1474921:	38 8e 03 
     1474924:	48 39 c6             	cmp    rsi,rax
     1474927:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     147492e:	00 
     147492f:	0f 83 3f 0d 00 00    	jae    1475674 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2babf8>
     1474935:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     147493c:	00 
     147493d:	48 29 c8             	sub    rax,rcx
     1474940:	48 99                	cqo
     1474942:	6a 48                	push   0x48
     1474944:	59                   	pop    rcx
     1474945:	48 f7 f9             	idiv   rcx
     1474948:	48 89 c2             	mov    rdx,rax
     147494b:	48 89 e9             	mov    rcx,rbp

### 0x1474956 (0x14740f4..0x147584c)
     147493c:	00 
     147493d:	48 29 c8             	sub    rax,rcx
     1474940:	48 99                	cqo
     1474942:	6a 48                	push   0x48
     1474944:	59                   	pop    rcx
     1474945:	48 f7 f9             	idiv   rcx
     1474948:	48 89 c2             	mov    rdx,rax
     147494b:	48 89 e9             	mov    rcx,rbp
     147494e:	e8 03 60 7c ff       	call   c3a956 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1878f6>
     1474953:	4c 89 e7             	mov    rdi,r12
     1474956:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     147495d:	00 
     147495e:	48 89 de             	mov    rsi,rbx
     1474961:	e8 a4 15 00 00       	call   1475f0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb48e>
     1474966:	48 89 df             	mov    rdi,rbx
     1474969:	e8 18 8b 7d ff       	call   c4d486 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19a426>
     147496e:	49 8b 5d 68          	mov    rbx,QWORD PTR [r13+0x68]
     1474972:	4d 8b 75 70          	mov    r14,QWORD PTR [r13+0x70]
     1474976:	4c 39 f3             	cmp    rbx,r14
     1474979:	0f 84 33 01 00 00    	je     1474ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ba036>
     147497f:	48 89 df             	mov    rdi,rbx
     1474982:	e8 b0 cb 0d 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>

### 0x1474cbd (0x14740f4..0x147584c)
     1474c98:	74 14                	je     1474cae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ba232>
     1474c9a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     1474c9f:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
     1474ca6:	00 
     1474ca7:	e8 ce 32 0e 00       	call   1557f7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39d4fe>
     1474cac:	eb 02                	jmp    1474cb0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ba234>
     1474cae:	31 c0                	xor    eax,eax
     1474cb0:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     1474cb5:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     1474cba:	48 39 f3             	cmp    rbx,rsi
     1474cbd:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     1474cc4:	00 
     1474cc5:	0f 84 9e 03 00 00    	je     1475069 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ba5ed>
     1474ccb:	48 01 74 24 70       	add    QWORD PTR [rsp+0x70],rsi
     1474cd0:	b0 01                	mov    al,0x1
     1474cd2:	89 44 24 18          	mov    DWORD PTR [rsp+0x18],eax
     1474cd6:	4c 89 ac 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r13
     1474cdd:	00 
     1474cde:	48 89 df             	mov    rdi,rbx
     1474ce1:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     1474ce6:	e8 e7 19 ee ff       	call   13566d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bc56>
     1474ceb:	48 89 df             	mov    rdi,rbx

### 0x1474e08 (0x14740f4..0x147584c)
     1474ddf:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     1474de4:	48 89 84 24 18 04 00 	mov    QWORD PTR [rsp+0x418],rax
     1474deb:	00 
     1474dec:	c6 84 24 20 04 00 00 	mov    BYTE PTR [rsp+0x420],0x0
     1474df3:	00 
     1474df4:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
     1474df8:	49 8d 7e 10          	lea    rdi,[r14+0x10]
     1474dfc:	e8 4f 78 c1 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     1474e01:	4c 89 f7             	mov    rdi,r14
     1474e04:	48 83 c7 58          	add    rdi,0x58
     1474e08:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     1474e0f:	00 
     1474e10:	e8 8f 24 ee ff       	call   13572a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c828>
     1474e15:	c6 84 24 20 04 00 00 	mov    BYTE PTR [rsp+0x420],0x1
     1474e1c:	01 
     1474e1d:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     1474e21:	48 8b 80 b8 00 00 00 	mov    rax,QWORD PTR [rax+0xb8]
     1474e28:	48 ff c0             	inc    rax
     1474e2b:	78 07                	js     1474e34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ba3b8>
     1474e2d:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     1474e32:	eb 15                	jmp    1474e49 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ba3cd>
     1474e34:	48 89 c1             	mov    rcx,rax

### 0x147503a (0x14740f4..0x147584c)
     1475014:	48 89 c7             	mov    rdi,rax
     1475017:	48 89 de             	mov    rsi,rbx
     147501a:	e8 8f 81 c1 ff       	call   108d1ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2545c4>
     147501f:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
     1475026:	00 
     1475027:	48 89 de             	mov    rsi,rbx
     147502a:	e8 9b e8 da ff       	call   12238ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68e4e>
     147502f:	49 89 df             	mov    r15,rbx
     1475032:	48 89 df             	mov    rdi,rbx
     1475035:	e8 92 97 62 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     147503a:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     1475041:	00 
     1475042:	48 89 df             	mov    rdi,rbx
     1475045:	e8 0c f4 da ff       	call   1224456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x699da>
     147504a:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     147504f:	48 81 c6 98 02 00 00 	add    rsi,0x298
     1475056:	c7 44 24 18 00 00 00 	mov    DWORD PTR [rsp+0x18],0x0
     147505d:	00 
     147505e:	48 3b 74 24 70       	cmp    rsi,QWORD PTR [rsp+0x70]
     1475063:	0f 85 75 fc ff ff    	jne    1474cde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ba262>
     1475069:	80 bc 24 58 07 00 00 	cmp    BYTE PTR [rsp+0x758],0x0
     1475070:	00 

### 0x147507d (0x14740f4..0x147584c)
     1475056:	c7 44 24 18 00 00 00 	mov    DWORD PTR [rsp+0x18],0x0
     147505d:	00 
     147505e:	48 3b 74 24 70       	cmp    rsi,QWORD PTR [rsp+0x70]
     1475063:	0f 85 75 fc ff ff    	jne    1474cde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ba262>
     1475069:	80 bc 24 58 07 00 00 	cmp    BYTE PTR [rsp+0x758],0x0
     1475070:	00 
     1475071:	74 7b                	je     14750ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ba672>
     1475073:	80 bc 24 a8 03 00 00 	cmp    BYTE PTR [rsp+0x3a8],0x0
     147507a:	00 
     147507b:	74 71                	je     14750ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ba672>
     147507d:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1475084:	00 
     1475085:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
     147508c:	00 
     147508d:	e8 be 75 c1 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     1475092:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     1475097:	48 89 84 24 b8 04 00 	mov    QWORD PTR [rsp+0x4b8],rax
     147509e:	00 
     147509f:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     14750a4:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
     14750ab:	00 
     14750ac:	e8 83 d6 0d 00       	call   1552734 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397cb8>

### 0x14750b4 (0x14740f4..0x147584c)
     147508c:	00 
     147508d:	e8 be 75 c1 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     1475092:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     1475097:	48 89 84 24 b8 04 00 	mov    QWORD PTR [rsp+0x4b8],rax
     147509e:	00 
     147509f:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     14750a4:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
     14750ab:	00 
     14750ac:	e8 83 d6 0d 00       	call   1552734 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397cb8>
     14750b1:	48 89 c7             	mov    rdi,rax
     14750b4:	48 8d 9c 24 70 04 00 	lea    rbx,[rsp+0x470]
     14750bb:	00 
     14750bc:	48 89 de             	mov    rsi,rbx
     14750bf:	e8 24 d9 0d 00       	call   15529e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397f6c>
     14750c4:	48 89 df             	mov    rdi,rbx
     14750c7:	e8 00 97 62 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     14750cc:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     14750d1:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
     14750d8:	00 
     14750d9:	e8 90 d9 0d 00       	call   1552a6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397ff2>
     14750de:	48 89 c7             	mov    rdi,rax
     14750e1:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]

### 0x147529e (0x14740f4..0x147584c)
     1475276:	00 
     1475277:	0f 85 0f 04 00 00    	jne    147568c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bac10>
     147527d:	48 89 df             	mov    rdi,rbx
     1475280:	4c 89 f6             	mov    rsi,r14
     1475283:	e8 78 a9 da ff       	call   121fc00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65184>
     1475288:	e9 d2 03 00 00       	jmp    147565f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2babe3>
     147528d:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     1475292:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1475295:	ff 90 f8 00 00 00    	call   QWORD PTR [rax+0xf8]
     147529b:	49 89 c6             	mov    r14,rax
     147529e:	4c 8d bc 24 70 04 00 	lea    r15,[rsp+0x470]
     14752a5:	00 
     14752a6:	45 31 ed             	xor    r13d,r13d
     14752a9:	4c 89 ff             	mov    rdi,r15
     14752ac:	48 89 de             	mov    rsi,rbx
     14752af:	31 d2                	xor    edx,edx
     14752b1:	e8 10 3f 0e 00       	call   15591c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e74a>
     14752b6:	4c 8d a4 24 18 01 00 	lea    r12,[rsp+0x118]
     14752bd:	00 
     14752be:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
     14752c2:	45 88 6c 24 08       	mov    BYTE PTR [r12+0x8],r13b
     14752c7:	45 88 6c 24 10       	mov    BYTE PTR [r12+0x10],r13b

### 0x1475604 (0x14740f4..0x147584c)
     14755d8:	e8 3d ef da ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     14755dd:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
     14755e4:	00 
     14755e5:	e8 a6 88 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14755ea:	4c 89 ff             	mov    rdi,r15
     14755ed:	e8 ea 3a 0e 00       	call   15590dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e660>
     14755f2:	e9 f7 fc ff ff       	jmp    14752ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ba872>
     14755f7:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
     14755fe:	00 
     14755ff:	e8 66 ae c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1475604:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     147560b:	00 
     147560c:	e8 59 ae c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1475611:	48 8b 9c 24 90 00 00 	mov    rbx,QWORD PTR [rsp+0x90]
     1475618:	00 
     1475619:	48 89 df             	mov    rdi,rbx
     147561c:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
     1475620:	e8 db a5 da ff       	call   121fc00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65184>
     1475625:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     147562c:	00 
     147562d:	e8 70 0b 00 00       	call   14761a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb726>
     1475632:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]

### 0x1475694 (0x14740f4..0x147584c)
     1475672:	5d                   	pop    rbp
     1475673:	c3                   	ret
     1475674:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     147567b:	00 00 
     147567d:	48 3b 84 24 a0 08 00 	cmp    rax,QWORD PTR [rsp+0x8a0]
     1475684:	00 
     1475685:	75 05                	jne    147568c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bac10>
     1475687:	e8 34 ef 58 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     147568c:	e8 1f a4 37 00       	call   17efab0 <__stack_chk_fail@plt>
     1475691:	48 89 c3             	mov    rbx,rax
     1475694:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     147569b:	00 
     147569c:	e8 2b 91 62 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     14756a1:	e9 d7 00 00 00       	jmp    147577d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad01>
     14756a6:	e9 95 00 00 00       	jmp    1475740 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bacc4>
     14756ab:	48 89 c3             	mov    rbx,rax
     14756ae:	e9 f1 00 00 00       	jmp    14757a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad28>
     14756b3:	eb 1a                	jmp    14756cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bac53>
     14756b5:	48 89 c3             	mov    rbx,rax
     14756b8:	e9 cd 00 00 00       	jmp    147578a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad0e>
     14756bd:	48 89 c3             	mov    rbx,rax
     14756c0:	e9 d2 00 00 00       	jmp    1475797 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad1b>

### 0x14756da (0x14740f4..0x147584c)
     14756b5:	48 89 c3             	mov    rbx,rax
     14756b8:	e9 cd 00 00 00       	jmp    147578a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad0e>
     14756bd:	48 89 c3             	mov    rbx,rax
     14756c0:	e9 d2 00 00 00       	jmp    1475797 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad1b>
     14756c5:	eb 79                	jmp    1475740 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bacc4>
     14756c7:	48 89 c3             	mov    rbx,rax
     14756ca:	e9 ef 00 00 00       	jmp    14757be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad42>
     14756cf:	48 89 c3             	mov    rbx,rax
     14756d2:	e9 da 00 00 00       	jmp    14757b1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad35>
     14756d7:	48 89 c3             	mov    rbx,rax
     14756da:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     14756e1:	00 
     14756e2:	e8 55 49 db ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
     14756e7:	eb 12                	jmp    14756fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bac7f>
     14756e9:	eb 43                	jmp    147572e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bacb2>
     14756eb:	48 89 c3             	mov    rbx,rax
     14756ee:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     14756f5:	00 
     14756f6:	e8 13 ee da ff       	call   122450e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a92>
     14756fb:	e9 f6 00 00 00       	jmp    14757f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad7a>
     1475700:	e9 dc 00 00 00       	jmp    14757e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad65>
     1475705:	48 89 c3             	mov    rbx,rax

### 0x147571c (0x14740f4..0x147584c)
     14756f6:	e8 13 ee da ff       	call   122450e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a92>
     14756fb:	e9 f6 00 00 00       	jmp    14757f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad7a>
     1475700:	e9 dc 00 00 00       	jmp    14757e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad65>
     1475705:	48 89 c3             	mov    rbx,rax
     1475708:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     147570f:	00 
     1475710:	e8 b7 90 62 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1475715:	eb 4c                	jmp    1475763 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bace7>
     1475717:	eb 47                	jmp    1475760 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bace4>
     1475719:	48 89 c3             	mov    rbx,rax
     147571c:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1475723:	00 
     1475724:	e8 8d 07 00 00       	call   1475eb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb43a>
     1475729:	e9 16 01 00 00       	jmp    1475844 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2badc8>
     147572e:	48 89 c3             	mov    rbx,rax
     1475731:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     1475738:	00 
     1475739:	e8 d6 d6 0d 00       	call   1552e14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x398398>
     147573e:	eb 23                	jmp    1475763 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bace7>
     1475740:	48 89 c3             	mov    rbx,rax
     1475743:	eb 38                	jmp    147577d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad01>
     1475745:	e9 97 00 00 00       	jmp    14757e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad65>

### 0x1475770 (0x14740f4..0x147584c)
     147574c:	48 89 c3             	mov    rbx,rax
     147574f:	e9 e3 00 00 00       	jmp    1475837 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2badbb>
     1475754:	eb 0a                	jmp    1475760 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bace4>
     1475756:	e9 ba 00 00 00       	jmp    1475815 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad99>
     147575b:	48 89 c3             	mov    rbx,rax
     147575e:	eb 10                	jmp    1475770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bacf4>
     1475760:	48 89 c3             	mov    rbx,rax
     1475763:	48 8d bc 24 78 07 00 	lea    rdi,[rsp+0x778]
     147576a:	00 
     147576b:	e8 5c 90 62 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1475770:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     1475777:	00 
     1475778:	e8 d9 ec da ff       	call   1224456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x699da>
     147577d:	48 8d bc 24 c0 07 00 	lea    rdi,[rsp+0x7c0]
     1475784:	00 
     1475785:	e8 42 90 62 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     147578a:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     1475791:	00 
     1475792:	e8 35 90 62 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1475797:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
     147579e:	00 
     147579f:	e8 08 79 7d ff       	call   c4d0ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19a04c>

### 0x14757d0 (0x14740f4..0x147584c)
     14757ab:	00 
     14757ac:	e8 fb 78 7d ff       	call   c4d0ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19a04c>
     14757b1:	48 8d bc 24 58 08 00 	lea    rdi,[rsp+0x858]
     14757b8:	00 
     14757b9:	e8 0e 90 62 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     14757be:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     14757c5:	00 
     14757c6:	e8 d3 8f 62 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     14757cb:	eb 77                	jmp    1475844 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2badc8>
     14757cd:	48 89 c3             	mov    rbx,rax
     14757d0:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     14757d7:	00 
     14757d8:	e8 5f 48 db ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
     14757dd:	eb 17                	jmp    14757f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad7a>
     14757df:	eb 39                	jmp    147581a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bad9e>
     14757e1:	48 89 c3             	mov    rbx,rax
     14757e4:	eb 44                	jmp    147582a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2badae>
     14757e6:	48 89 c3             	mov    rbx,rax
     14757e9:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     14757f0:	00 
     14757f1:	e8 18 ed da ff       	call   122450e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a92>
     14757f6:	48 8d bc 24 58 08 00 	lea    rdi,[rsp+0x858]

### 0x14831ea (0x1483002..0x1483c35)
     14831ba:	e8 81 ad 36 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14831bf:	43 8a 84 25 68 04 00 	mov    al,BYTE PTR [r13+r12*1+0x468]
     14831c6:	00 
     14831c7:	88 85 98 00 00 00    	mov    BYTE PTR [rbp+0x98],al
     14831cd:	4b 8b 84 25 60 04 00 	mov    rax,QWORD PTR [r13+r12*1+0x460]
     14831d4:	00 
     14831d5:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax
     14831dc:	43 8a 84 25 78 04 00 	mov    al,BYTE PTR [r13+r12*1+0x478]
     14831e3:	00 
     14831e4:	88 85 a8 00 00 00    	mov    BYTE PTR [rbp+0xa8],al
     14831ea:	4b 8b 84 25 70 04 00 	mov    rax,QWORD PTR [r13+r12*1+0x470]
     14831f1:	00 
     14831f2:	48 89 85 a0 00 00 00 	mov    QWORD PTR [rbp+0xa0],rax
     14831f9:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     14831fe:	48 8d b4 24 b0 0e 00 	lea    rsi,[rsp+0xeb0]
     1483205:	00 
     1483206:	e8 b3 eb ff ff       	call   1481dbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7342>
     148320b:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     1483212:	00 
     1483213:	48 85 c0             	test   rax,rax
     1483216:	0f 84 8e 00 00 00    	je     14832aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c882e>
     148321c:	48 8d bc 24 30 06 00 	lea    rdi,[rsp+0x630]

### 0x149ea1e (0x149daaa..0x14a06f6)
     149e9f5:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149e9fc:	00 
     149e9fd:	e8 26 1d 00 00       	call   14a0728 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5cac>
     149ea02:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     149ea09:	00 
     149ea0a:	0f b6 68 0d          	movzx  ebp,BYTE PTR [rax+0xd]
     149ea0e:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149ea15:	00 
     149ea16:	4c 89 fe             	mov    rsi,r15
     149ea19:	e8 76 1e 00 00       	call   14a0894 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5e18>
     149ea1e:	80 bc 24 70 04 00 00 	cmp    BYTE PTR [rsp+0x470],0x0
     149ea25:	00 
     149ea26:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     149ea2b:	0f 84 e1 00 00 00    	je     149eb12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4096>
     149ea31:	80 bc 24 30 04 00 00 	cmp    BYTE PTR [rsp+0x430],0x0
     149ea38:	00 
     149ea39:	74 72                	je     149eaad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4031>
     149ea3b:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     149ea42:	00 
     149ea43:	48 8d b4 24 00 04 00 	lea    rsi,[rsp+0x400]
     149ea4a:	00 
     149ea4b:	66 0f 57 c0          	xorpd  xmm0,xmm0

### 0x149f4bd (0x149daaa..0x14a06f6)
     149f498:	80 bc 24 78 04 00 00 	cmp    BYTE PTR [rsp+0x478],0x0
     149f49f:	00 
     149f4a0:	74 68                	je     149f50a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4a8e>
     149f4a2:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     149f4a9:	00 
     149f4aa:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
     149f4b1:	00 
     149f4b2:	4c 89 ea             	mov    rdx,r13
     149f4b5:	4c 89 e1             	mov    rcx,r12
     149f4b8:	e8 c7 28 00 00       	call   14a1d84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e7308>
     149f4bd:	80 bc 24 70 04 00 00 	cmp    BYTE PTR [rsp+0x470],0x0
     149f4c4:	00 
     149f4c5:	74 1d                	je     149f4e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4a68>
     149f4c7:	48 8d b4 24 58 04 00 	lea    rsi,[rsp+0x458]
     149f4ce:	00 
     149f4cf:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
     149f4d6:	00 
     149f4d7:	4c 89 ea             	mov    rdx,r13
     149f4da:	4c 89 e1             	mov    rcx,r12
     149f4dd:	e8 a2 28 00 00       	call   14a1d84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e7308>
     149f4e2:	eb 26                	jmp    149f50a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4a8e>
     149f4e4:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]

### 0x149f586 (0x149daaa..0x14a06f6)
     149f565:	00 
     149f566:	4c 89 ea             	mov    rdx,r13
     149f569:	4c 89 e1             	mov    rcx,r12
     149f56c:	e8 13 28 00 00       	call   14a1d84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e7308>
     149f571:	4c 89 e8             	mov    rax,r13
     149f574:	48 f7 d8             	neg    rax
     149f577:	48 8d b4 24 38 05 00 	lea    rsi,[rsp+0x538]
     149f57e:	00 
     149f57f:	48 89 06             	mov    QWORD PTR [rsi],rax
     149f582:	4c 89 66 08          	mov    QWORD PTR [rsi+0x8],r12
     149f586:	8a 84 24 70 04 00 00 	mov    al,BYTE PTR [rsp+0x470]
     149f58d:	88 46 10             	mov    BYTE PTR [rsi+0x10],al
     149f590:	c7 46 14 01 00 00 00 	mov    DWORD PTR [rsi+0x14],0x1
     149f597:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     149f59e:	00 
     149f59f:	e8 c4 11 00 00       	call   14a0768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5cec>
     149f5a4:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149f5ab:	00 
     149f5ac:	e8 a3 12 00 00       	call   14a0854 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5dd8>
     149f5b1:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149f5b8:	00 
     149f5b9:	4c 89 fe             	mov    rsi,r15

### 0x149f6db (0x149daaa..0x14a06f6)
     149f6b2:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149f6b9:	00 
     149f6ba:	e8 69 10 00 00       	call   14a0728 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5cac>
     149f6bf:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     149f6c6:	00 
     149f6c7:	0f b6 68 0d          	movzx  ebp,BYTE PTR [rax+0xd]
     149f6cb:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149f6d2:	00 
     149f6d3:	4c 89 fe             	mov    rsi,r15
     149f6d6:	e8 b9 11 00 00       	call   14a0894 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5e18>
     149f6db:	80 bc 24 70 04 00 00 	cmp    BYTE PTR [rsp+0x470],0x0
     149f6e2:	00 
     149f6e3:	74 78                	je     149f75d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4ce1>
     149f6e5:	80 bc 24 68 04 00 00 	cmp    BYTE PTR [rsp+0x468],0x0
     149f6ec:	00 
     149f6ed:	74 6e                	je     149f75d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4ce1>
     149f6ef:	48 8d b4 24 38 04 00 	lea    rsi,[rsp+0x438]
     149f6f6:	00 
     149f6f7:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     149f6fe:	00 
     149f6ff:	4c 89 ea             	mov    rdx,r13
     149f702:	4c 89 e1             	mov    rcx,r12

### 0x149f909 (0x149daaa..0x14a06f6)
     149f8dd:	4c 89 fe             	mov    rsi,r15
     149f8e0:	e8 6f 11 00 00       	call   14a0a54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5fd8>
     149f8e5:	80 bc 24 d0 04 00 00 	cmp    BYTE PTR [rsp+0x4d0],0x0
     149f8ec:	00 
     149f8ed:	0f 84 0c 01 00 00    	je     149f9ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4f83>
     149f8f3:	80 bc 24 c8 04 00 00 	cmp    BYTE PTR [rsp+0x4c8],0x0
     149f8fa:	00 
     149f8fb:	0f 84 fe 00 00 00    	je     149f9ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4f83>
     149f901:	48 8b bc 24 68 04 00 	mov    rdi,QWORD PTR [rsp+0x468]
     149f908:	00 
     149f909:	48 8b b4 24 70 04 00 	mov    rsi,QWORD PTR [rsp+0x470]
     149f910:	00 
     149f911:	66 0f 57 c0          	xorpd  xmm0,xmm0
     149f915:	66 0f 57 c9          	xorpd  xmm1,xmm1
     149f919:	e8 a5 0f 00 00       	call   14a08c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5e47>
     149f91e:	48 8d b4 24 68 04 00 	lea    rsi,[rsp+0x468]
     149f925:	00 
     149f926:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     149f92d:	00 
     149f92e:	41 b8 88 13 00 00    	mov    r8d,0x1388
     149f934:	41 b9 e8 03 00 00    	mov    r9d,0x3e8
     149f93a:	4c 89 ea             	mov    rdx,r13

### 0x14b940c (0x14b91f2..0x14ba12f) WRITE
     14b93e4:	48 8b 41 58          	mov    rax,QWORD PTR [rcx+0x58]
     14b93e8:	48 89 84 24 58 04 00 	mov    QWORD PTR [rsp+0x458],rax
     14b93ef:	00 
     14b93f0:	0f 10 41 48          	movups xmm0,XMMWORD PTR [rcx+0x48]
     14b93f4:	0f 11 84 24 48 04 00 	movups XMMWORD PTR [rsp+0x448],xmm0
     14b93fb:	00 
     14b93fc:	0f 10 41 60          	movups xmm0,XMMWORD PTR [rcx+0x60]
     14b9400:	0f 29 84 24 60 04 00 	movaps XMMWORD PTR [rsp+0x460],xmm0
     14b9407:	00 
     14b9408:	48 8b 41 70          	mov    rax,QWORD PTR [rcx+0x70]
     14b940c:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     14b9413:	00 
     14b9414:	49 8b 47 78          	mov    rax,QWORD PTR [r15+0x78]
     14b9418:	41 0f 28 47 70       	movaps xmm0,XMMWORD PTR [r15+0x70]
     14b941d:	0f 11 84 24 78 04 00 	movups XMMWORD PTR [rsp+0x478],xmm0
     14b9424:	00 
     14b9425:	48 85 c0             	test   rax,rax
     14b9428:	74 05                	je     14b942f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe9b3>
     14b942a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14b942f:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
     14b9434:	4c 89 6c 24 50       	mov    QWORD PTR [rsp+0x50],r13
     14b9439:	4d 8d af 90 00 00 00 	lea    r13,[r15+0x90]

### 0x14c4397 (0x14c431d..0x14c5124)
     14c4362:	49 89 fd             	mov    r13,rdi
     14c4365:	49 8d 80 30 01 00 00 	lea    rax,[r8+0x130]
     14c436c:	49 8d 88 60 01 00 00 	lea    rcx,[r8+0x160]
     14c4373:	49 8d 90 78 01 00 00 	lea    rdx,[r8+0x178]
     14c437a:	4c 89 44 24 60       	mov    QWORD PTR [rsp+0x60],r8
     14c437f:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     14c4384:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     14c4389:	48 89 54 24 78       	mov    QWORD PTR [rsp+0x78],rdx
     14c438e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     14c4393:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     14c4397:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     14c439e:	44 89 7c 24 1c       	mov    DWORD PTR [rsp+0x1c],r15d
     14c43a3:	0f 84 e4 00 00 00    	je     14c448d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x309a11>
     14c43a9:	e8 b6 33 00 00       	call   14c7764 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30cce8>
     14c43ae:	84 c0                	test   al,al
     14c43b0:	0f 84 d7 00 00 00    	je     14c448d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x309a11>
     14c43b6:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     14c43bb:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
     14c43bf:	48 8b 84 24 80 0a 00 	mov    rax,QWORD PTR [rsp+0xa80]
     14c43c6:	00 
     14c43c7:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
     14c43cb:	4c 8d b4 24 f0 00 00 	lea    r14,[rsp+0xf0]

### 0x14c987c (0x14c97b0..0x14c9945)
     14c985a:	48 8d 73 40          	lea    rsi,[rbx+0x40]
     14c985e:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
     14c9861:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     14c9865:	49 01 d7             	add    r15,rdx
     14c9868:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14c986b:	4c 89 f7             	mov    rdi,r14
     14c986e:	4d 89 f8             	mov    r8,r15
     14c9871:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14c9874:	be c0 04 00 00       	mov    esi,0x4c0
     14c9879:	48 03 33             	add    rsi,QWORD PTR [rbx]
     14c987c:	4c 8d bc 24 70 04 00 	lea    r15,[rsp+0x470]
     14c9883:	00 
     14c9884:	4c 89 ff             	mov    rdi,r15
     14c9887:	e8 8c 92 94 ff       	call   e12b18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfb9e>
     14c988c:	41 80 bf 70 04 00 00 	cmp    BYTE PTR [r15+0x470],0x0
     14c9893:	00 
     14c9894:	74 45                	je     14c98db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ee5f>
     14c9896:	48 89 e7             	mov    rdi,rsp
     14c9899:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     14c98a0:	00 
     14c98a1:	e8 1a fc 1a 00       	call   16794c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d62c>
     14c98a6:	48 89 e7             	mov    rdi,rsp

### 0x14c988c (0x14c97b0..0x14c9945)
     14c9868:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14c986b:	4c 89 f7             	mov    rdi,r14
     14c986e:	4d 89 f8             	mov    r8,r15
     14c9871:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14c9874:	be c0 04 00 00       	mov    esi,0x4c0
     14c9879:	48 03 33             	add    rsi,QWORD PTR [rbx]
     14c987c:	4c 8d bc 24 70 04 00 	lea    r15,[rsp+0x470]
     14c9883:	00 
     14c9884:	4c 89 ff             	mov    rdi,r15
     14c9887:	e8 8c 92 94 ff       	call   e12b18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfb9e>
     14c988c:	41 80 bf 70 04 00 00 	cmp    BYTE PTR [r15+0x470],0x0
     14c9893:	00 
     14c9894:	74 45                	je     14c98db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ee5f>
     14c9896:	48 89 e7             	mov    rdi,rsp
     14c9899:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     14c98a0:	00 
     14c98a1:	e8 1a fc 1a 00       	call   16794c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d62c>
     14c98a6:	48 89 e7             	mov    rdi,rsp
     14c98a9:	e8 9f 0e 00 00       	call   14ca74d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30fcd1>
     14c98ae:	84 c0                	test   al,al
     14c98b0:	74 21                	je     14c98d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ee57>
     14c98b2:	49 8b be d0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1d0]

### 0x14c9899 (0x14c97b0..0x14c9945)
     14c9874:	be c0 04 00 00       	mov    esi,0x4c0
     14c9879:	48 03 33             	add    rsi,QWORD PTR [rbx]
     14c987c:	4c 8d bc 24 70 04 00 	lea    r15,[rsp+0x470]
     14c9883:	00 
     14c9884:	4c 89 ff             	mov    rdi,r15
     14c9887:	e8 8c 92 94 ff       	call   e12b18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfb9e>
     14c988c:	41 80 bf 70 04 00 00 	cmp    BYTE PTR [r15+0x470],0x0
     14c9893:	00 
     14c9894:	74 45                	je     14c98db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ee5f>
     14c9896:	48 89 e7             	mov    rdi,rsp
     14c9899:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
     14c98a0:	00 
     14c98a1:	e8 1a fc 1a 00       	call   16794c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d62c>
     14c98a6:	48 89 e7             	mov    rdi,rsp
     14c98a9:	e8 9f 0e 00 00       	call   14ca74d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30fcd1>
     14c98ae:	84 c0                	test   al,al
     14c98b0:	74 21                	je     14c98d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ee57>
     14c98b2:	49 8b be d0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1d0]
     14c98b9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14c98bc:	ff 50 58             	call   QWORD PTR [rax+0x58]
     14c98bf:	0f b6 d0             	movzx  edx,al
     14c98c2:	81 ca 00 01 00 00    	or     edx,0x100

### 0x14c98db (0x14c97b0..0x14c9945)
     14c98b2:	49 8b be d0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1d0]
     14c98b9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14c98bc:	ff 50 58             	call   QWORD PTR [rax+0x58]
     14c98bf:	0f b6 d0             	movzx  edx,al
     14c98c2:	81 ca 00 01 00 00    	or     edx,0x100
     14c98c8:	48 89 e6             	mov    rsi,rsp
     14c98cb:	48 89 df             	mov    rdi,rbx
     14c98ce:	e8 45 7c 01 00       	call   14e1518 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x326a9c>
     14c98d3:	48 89 e7             	mov    rdi,rsp
     14c98d6:	e8 8d fb 1a 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
     14c98db:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     14c98e2:	00 
     14c98e3:	e8 de 2f 94 ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>
     14c98e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c98ef:	00 00 
     14c98f1:	48 3b 84 24 e8 08 00 	cmp    rax,QWORD PTR [rsp+0x8e8]
     14c98f8:	00 
     14c98f9:	75 45                	jne    14c9940 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30eec4>
     14c98fb:	48 81 c4 f0 08 00 00 	add    rsp,0x8f0
     14c9902:	5b                   	pop    rbx
     14c9903:	41 5e                	pop    r14
     14c9905:	41 5f                	pop    r15

### 0x14c9918 (0x14c97b0..0x14c9945)
     14c98fb:	48 81 c4 f0 08 00 00 	add    rsp,0x8f0
     14c9902:	5b                   	pop    rbx
     14c9903:	41 5e                	pop    r14
     14c9905:	41 5f                	pop    r15
     14c9907:	c3                   	ret
     14c9908:	48 89 c3             	mov    rbx,rax
     14c990b:	48 89 e7             	mov    rdi,rsp
     14c990e:	e8 55 fb 1a 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
     14c9913:	eb 03                	jmp    14c9918 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ee9c>
     14c9915:	48 89 c3             	mov    rbx,rax
     14c9918:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     14c991f:	00 
     14c9920:	e8 a1 2f 94 ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>
     14c9925:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c992c:	00 00 
     14c992e:	48 3b 84 24 e8 08 00 	cmp    rax,QWORD PTR [rsp+0x8e8]
     14c9935:	00 
     14c9936:	75 08                	jne    14c9940 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30eec4>
     14c9938:	48 89 df             	mov    rdi,rbx
     14c993b:	e8 90 63 5a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14c9940:	e8 6b 61 32 00       	call   17efab0 <__stack_chk_fail@plt>
     14c9945:	cc                   	int3

### 0x14fc7a6 (0x14fbfd2..0x14fcdad) WRITE
     14fc77c:	e8 bf 17 2f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14fc781:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14fc788:	00 
     14fc789:	4c 89 e6             	mov    rsi,r12
     14fc78c:	e8 21 5a 00 00       	call   15021b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347736>
     14fc791:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
     14fc798:	00 
     14fc799:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
     14fc7a0:	00 
     14fc7a1:	e8 10 6b 00 00       	call   15032b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34883a>
     14fc7a6:	48 83 a4 24 70 04 00 	and    QWORD PTR [rsp+0x470],0x0
     14fc7ad:	00 00 
     14fc7af:	bf 58 01 00 00       	mov    edi,0x158
     14fc7b4:	e8 47 17 2f 00       	call   17edf00 <_Znwm@plt>
     14fc7b9:	48 89 c3             	mov    rbx,rax
     14fc7bc:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
     14fc7c3:	00 
     14fc7c4:	48 8d 84 24 20 04 00 	lea    rax,[rsp+0x420]
     14fc7cb:	00 
     14fc7cc:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
     14fc7d3:	00 
     14fc7d4:	48 c7 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],0x1

### 0x14fd32a (0x14fcdae..0x14fe236)
     14fd300:	4c 8d 2d b4 ae e8 fe 	lea    r13,[rip+0xfffffffffee8aeb4]        # 3881bb <_ZTSSt12bad_any_cast@@Base-0x800d>
     14fd307:	4c 8d a4 24 90 01 00 	lea    r12,[rsp+0x190]
     14fd30e:	00 
     14fd30f:	48 8d 75 28          	lea    rsi,[rbp+0x28]
     14fd313:	48 89 df             	mov    rdi,rbx
     14fd316:	e8 43 7e 65 ff       	call   b5515e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa20fe>
     14fd31b:	4c 89 ff             	mov    rdi,r15
     14fd31e:	48 89 de             	mov    rsi,rbx
     14fd321:	e8 38 7e 65 ff       	call   b5515e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa20fe>
     14fd326:	48 8d 55 10          	lea    rdx,[rbp+0x10]
     14fd32a:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     14fd331:	00 
     14fd332:	4c 89 f6             	mov    rsi,r14
     14fd335:	e8 72 dc b5 ff       	call   105afac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2223c2>
     14fd33a:	4c 89 f7             	mov    rdi,r14
     14fd33d:	48 8d 35 98 79 e6 fe 	lea    rsi,[rip+0xfffffffffee67998]        # 364cdc <_ZTSSt12bad_any_cast@@Base-0x2b4ec>
     14fd344:	4c 89 fa             	mov    rdx,r15
     14fd347:	e8 14 02 93 ff       	call   e2d560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa5e6>
     14fd34c:	48 8b 84 24 38 03 00 	mov    rax,QWORD PTR [rsp+0x338]
     14fd353:	00 
     14fd354:	48 99                	cqo
     14fd356:	b9 00 ca 9a 3b       	mov    ecx,0x3b9aca00

### 0x14fd374 (0x14fcdae..0x14fe236)
     14fd353:	00 
     14fd354:	48 99                	cqo
     14fd356:	b9 00 ca 9a 3b       	mov    ecx,0x3b9aca00
     14fd35b:	48 f7 f9             	idiv   rcx
     14fd35e:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
     14fd365:	00 
     14fd366:	4c 89 f7             	mov    rdi,r14
     14fd369:	4c 89 ee             	mov    rsi,r13
     14fd36c:	4c 89 e2             	mov    rdx,r12
     14fd36f:	e8 f8 e0 b5 ff       	call   105b46c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222882>
     14fd374:	48 8b bc 24 70 04 00 	mov    rdi,QWORD PTR [rsp+0x470]
     14fd37b:	00 
     14fd37c:	e8 59 02 93 ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     14fd381:	4c 89 ff             	mov    rdi,r15
     14fd384:	e8 07 0b 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14fd389:	48 89 df             	mov    rdi,rbx
     14fd38c:	e8 ff 0a 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14fd391:	48 8b 6d 00          	mov    rbp,QWORD PTR [rbp+0x0]
     14fd395:	48 85 ed             	test   rbp,rbp
     14fd398:	0f 85 71 ff ff ff    	jne    14fd30f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x342893>
     14fd39e:	48 8b bc 24 f0 02 00 	mov    rdi,QWORD PTR [rsp+0x2f0]
     14fd3a5:	00 

### 0x14fdb74 (0x14fcdae..0x14fe236)
     14fdb4a:	48 8d 05 07 d0 37 00 	lea    rax,[rip+0x37d007]        # 187ab58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37240>
     14fdb51:	48 89 03             	mov    QWORD PTR [rbx],rax
     14fdb54:	48 89 df             	mov    rdi,rbx
     14fdb57:	48 83 c7 08          	add    rdi,0x8
     14fdb5b:	48 8d b4 24 a0 04 00 	lea    rsi,[rsp+0x4a0]
     14fdb62:	00 
     14fdb63:	e8 1c 4f 00 00       	call   1502a84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348008>
     14fdb68:	4c 8d b4 24 90 01 00 	lea    r14,[rsp+0x190]
     14fdb6f:	00 
     14fdb70:	49 83 26 00          	and    QWORD PTR [r14],0x0
     14fdb74:	4c 8d bc 24 70 04 00 	lea    r15,[rsp+0x470]
     14fdb7b:	00 
     14fdb7c:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
     14fdb80:	4c 89 f7             	mov    rdi,r14
     14fdb83:	e8 42 c7 57 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     14fdb88:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
     14fdb8f:	00 
     14fdb90:	e8 3d 4f 00 00       	call   1502ad2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348056>
     14fdb95:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
     14fdb9c:	00 
     14fdb9d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14fdba0:	4c 89 fe             	mov    rsi,r15

### 0x14fdd96 (0x14fcdae..0x14fe236)
     14fdd6c:	48 89 df             	mov    rdi,rbx
     14fdd6f:	e8 f6 c1 57 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14fdd74:	4c 89 e7             	mov    rdi,r12
     14fdd77:	e8 14 01 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14fdd7c:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
     14fdd83:	00 
     14fdd84:	e8 e1 c1 57 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14fdd89:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     14fdd90:	00 
     14fdd91:	e8 3c 4d 00 00       	call   1502ad2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348056>
     14fdd96:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     14fdd9d:	00 
     14fdd9e:	e8 c7 c1 57 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14fdda3:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     14fddaa:	00 
     14fddab:	e8 22 4d 00 00       	call   1502ad2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348056>
     14fddb0:	48 8d bd 10 01 00 00 	lea    rdi,[rbp+0x110]
     14fddb7:	48 89 3b             	mov    QWORD PTR [rbx],rdi
     14fddba:	c6 43 08 01          	mov    BYTE PTR [rbx+0x8],0x1
     14fddbe:	e8 2d 03 2f 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     14fddc3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     14fddc9:	66 48 0f 7e c6       	movq   rsi,xmm0

### 0x14fdf37 (0x14fcdae..0x14fe236)
     14fdf13:	eb 03                	jmp    14fdf18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34349c>
     14fdf15:	48 89 c3             	mov    rbx,rax
     14fdf18:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
     14fdf1f:	00 
     14fdf20:	e8 ad 4b 00 00       	call   1502ad2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348056>
     14fdf25:	eb 03                	jmp    14fdf2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3434ae>
     14fdf27:	48 89 c3             	mov    rbx,rax
     14fdf2a:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     14fdf31:	00 
     14fdf32:	e8 9b 4b 00 00       	call   1502ad2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348056>
     14fdf37:	48 8d bc 24 70 04 00 	lea    rdi,[rsp+0x470]
     14fdf3e:	00 
     14fdf3f:	e8 26 c0 57 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14fdf44:	eb 39                	jmp    14fdf7f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x343503>
     14fdf46:	48 89 c3             	mov    rbx,rax
     14fdf49:	4c 89 f7             	mov    rdi,r14
     14fdf4c:	e8 3f ff 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14fdf51:	eb e4                	jmp    14fdf37 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3434bb>
     14fdf53:	48 89 c3             	mov    rbx,rax
     14fdf56:	eb df                	jmp    14fdf37 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3434bb>
     14fdf58:	48 89 c3             	mov    rbx,rax
     14fdf5b:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]

### 0x14fe1bb (0x14fcdae..0x14fe236)
     14fe197:	eb 7d                	jmp    14fe216 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34379a>
     14fe199:	48 89 c3             	mov    rbx,rax
     14fe19c:	48 8b bc 24 20 03 00 	mov    rdi,QWORD PTR [rsp+0x320]
     14fe1a3:	00 
     14fe1a4:	e8 d9 b2 b0 ff       	call   1009482 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0898>
     14fe1a9:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
     14fe1b0:	00 
     14fe1b1:	e8 72 57 ff ff       	call   14f3928 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338eac>
     14fe1b6:	eb 44                	jmp    14fe1fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x343780>
     14fe1b8:	48 89 c3             	mov    rbx,rax
     14fe1bb:	48 8b bc 24 70 04 00 	mov    rdi,QWORD PTR [rsp+0x470]
     14fe1c2:	00 
     14fe1c3:	e8 12 f4 92 ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     14fe1c8:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     14fe1cf:	00 
     14fe1d0:	e8 bb fc 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14fe1d5:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
     14fe1dc:	00 
     14fe1dd:	e8 ae fc 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14fe1e2:	48 8b bc 24 f0 02 00 	mov    rdi,QWORD PTR [rsp+0x2f0]
     14fe1e9:	00 
     14fe1ea:	e8 eb f3 92 ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>

### 0x151835d (0x15182d6..0x1519a71)
     151833e:	4c 89 f7             	mov    rdi,r14
     1518341:	e8 fa 5b 2d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1518346:	6a 07                	push   0x7
     1518348:	5f                   	pop    rdi
     1518349:	6a ff                	push   0xffffffffffffffff
     151834b:	5a                   	pop    rdx
     151834c:	4c 89 f6             	mov    rsi,r14
     151834f:	e8 60 4f 01 00       	call   152d2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372838>
     1518354:	41 0f 10 84 24 20 13 	movups xmm0,XMMWORD PTR [r12+0x1320]
     151835b:	00 00 
     151835d:	0f 29 84 24 70 04 00 	movaps XMMWORD PTR [rsp+0x470],xmm0
     1518364:	00 
     1518365:	41 80 bf 0c 01 00 00 	cmp    BYTE PTR [r15+0x10c],0x0
     151836c:	00 
     151836d:	74 1d                	je     151838c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35d910>
     151836f:	49 8b bf 58 01 00 00 	mov    rdi,QWORD PTR [r15+0x158]
     1518376:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1518379:	ff 50 18             	call   QWORD PTR [rax+0x18]
     151837c:	49 63 8f 10 01 00 00 	movsxd rcx,DWORD PTR [r15+0x110]
     1518383:	48 39 c8             	cmp    rax,rcx
     1518386:	0f 83 64 0f 00 00    	jae    15192f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e874>
     151838c:	49 8b 7c 24 48       	mov    rdi,QWORD PTR [r12+0x48]

### 0x15188ae (0x15182d6..0x1519a71)
     151887f:	0f 85 af 10 00 00    	jne    1519934 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35eeb8>
     1518885:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     151888c:	00 
     151888d:	e8 54 cf 24 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     1518892:	4d 8d b7 c0 00 00 00 	lea    r14,[r15+0xc0]
     1518899:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     15188a0:	00 
     15188a1:	e8 ea 55 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15188a6:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
     15188ad:	00 
     15188ae:	48 8d 8c 24 70 04 00 	lea    rcx,[rsp+0x470]
     15188b5:	00 
     15188b6:	4c 89 ee             	mov    rsi,r13
     15188b9:	4c 89 f2             	mov    rdx,r14
     15188bc:	e8 34 2b 01 00       	call   152b3f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370979>
     15188c1:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
     15188c8:	00 
     15188c9:	e8 6c bd 13 00       	call   165463a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87a6>
     15188ce:	41 8b 84 24 48 13 00 	mov    eax,DWORD PTR [r12+0x1348]
     15188d5:	00 
     15188d6:	8b ab 90 00 00 00    	mov    ebp,DWORD PTR [rbx+0x90]
     15188dc:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12

### 0x15195ea (0x15182d6..0x1519a71)
     15195bc:	59                   	pop    rcx
     15195bd:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     15195c4:	00 
     15195c5:	e8 c6 48 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15195ca:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
     15195d1:	00 
     15195d2:	e8 b9 48 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15195d7:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     15195dc:	48 8b b8 e0 00 00 00 	mov    rdi,QWORD PTR [rax+0xe0]
     15195e3:	0f b6 b0 2a 01 00 00 	movzx  esi,BYTE PTR [rax+0x12a]
     15195ea:	48 8d 94 24 70 04 00 	lea    rdx,[rsp+0x470]
     15195f1:	00 
     15195f2:	48 8d 8c 24 d0 00 00 	lea    rcx,[rsp+0xd0]
     15195f9:	00 
     15195fa:	e8 cf 83 00 00       	call   15219ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f52>
     15195ff:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     1519604:	49 8b be 50 01 00 00 	mov    rdi,QWORD PTR [r14+0x150]
     151960b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     151960e:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1519611:	41 88 86 40 02 00 00 	mov    BYTE PTR [r14+0x240],al
     1519618:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     151961d:	40 8a a8 55 13 00 00 	mov    bpl,BYTE PTR [rax+0x1355]

### 0x15207d3 (0x151f0d6..0x15219ce)
     15207a9:	00 
     15207aa:	e8 b7 bf 5a ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     15207af:	48 8d b4 24 20 06 00 	lea    rsi,[rsp+0x620]
     15207b6:	00 
     15207b7:	49 8d bf 50 04 00 00 	lea    rdi,[r15+0x450]
     15207be:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
     15207c5:	00 
     15207c6:	e8 9b bf 5a ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     15207cb:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
     15207d2:	00 
     15207d3:	49 8d bf 70 04 00 00 	lea    rdi,[r15+0x470]
     15207da:	48 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rdi
     15207e1:	00 
     15207e2:	e8 7f bf 5a ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     15207e7:	48 8d b4 24 60 06 00 	lea    rsi,[rsp+0x660]
     15207ee:	00 
     15207ef:	49 8d bf 90 04 00 00 	lea    rdi,[r15+0x490]
     15207f6:	48 89 bc 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rdi
     15207fd:	00 
     15207fe:	e8 63 bf 5a ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     1520803:	48 8d b4 24 80 06 00 	lea    rsi,[rsp+0x680]
     152080a:	00 

### 0x152323c (0x15229bc..0x1523550)
     1523206:	e8 fb 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152320b:	48 89 83 58 04 00 00 	mov    QWORD PTR [rbx+0x458],rax
     1523212:	49 8b be 60 04 00 00 	mov    rdi,QWORD PTR [r14+0x460]
     1523219:	31 f6                	xor    esi,esi
     152321b:	e8 e6 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523220:	48 89 83 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rax
     1523227:	49 8b be 68 04 00 00 	mov    rdi,QWORD PTR [r14+0x468]
     152322e:	31 f6                	xor    esi,esi
     1523230:	e8 d1 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523235:	48 89 83 68 04 00 00 	mov    QWORD PTR [rbx+0x468],rax
     152323c:	49 8b be 70 04 00 00 	mov    rdi,QWORD PTR [r14+0x470]
     1523243:	31 f6                	xor    esi,esi
     1523245:	e8 bc 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152324a:	48 89 83 70 04 00 00 	mov    QWORD PTR [rbx+0x470],rax
     1523251:	49 8b be 78 04 00 00 	mov    rdi,QWORD PTR [r14+0x478]
     1523258:	31 f6                	xor    esi,esi
     152325a:	e8 a7 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152325f:	48 89 83 78 04 00 00 	mov    QWORD PTR [rbx+0x478],rax
     1523266:	49 8b be 80 04 00 00 	mov    rdi,QWORD PTR [r14+0x480]
     152326d:	31 f6                	xor    esi,esi
     152326f:	e8 92 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523274:	48 89 83 80 04 00 00 	mov    QWORD PTR [rbx+0x480],rax

### 0x152324a (0x15229bc..0x1523550) WRITE
     1523219:	31 f6                	xor    esi,esi
     152321b:	e8 e6 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523220:	48 89 83 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rax
     1523227:	49 8b be 68 04 00 00 	mov    rdi,QWORD PTR [r14+0x468]
     152322e:	31 f6                	xor    esi,esi
     1523230:	e8 d1 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523235:	48 89 83 68 04 00 00 	mov    QWORD PTR [rbx+0x468],rax
     152323c:	49 8b be 70 04 00 00 	mov    rdi,QWORD PTR [r14+0x470]
     1523243:	31 f6                	xor    esi,esi
     1523245:	e8 bc 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152324a:	48 89 83 70 04 00 00 	mov    QWORD PTR [rbx+0x470],rax
     1523251:	49 8b be 78 04 00 00 	mov    rdi,QWORD PTR [r14+0x478]
     1523258:	31 f6                	xor    esi,esi
     152325a:	e8 a7 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152325f:	48 89 83 78 04 00 00 	mov    QWORD PTR [rbx+0x478],rax
     1523266:	49 8b be 80 04 00 00 	mov    rdi,QWORD PTR [r14+0x480]
     152326d:	31 f6                	xor    esi,esi
     152326f:	e8 92 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523274:	48 89 83 80 04 00 00 	mov    QWORD PTR [rbx+0x480],rax
     152327b:	49 8b be 88 04 00 00 	mov    rdi,QWORD PTR [r14+0x488]
     1523282:	31 f6                	xor    esi,esi
     1523284:	e8 7d 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>

### 0x1524704 (0x15246f2..0x1524868)
     15246e2:	75 08                	jne    15246ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x369c70>
     15246e4:	48 89 df             	mov    rdi,rbx
     15246e7:	e8 e4 b5 54 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     15246ec:	e8 bf b3 2c 00       	call   17efab0 <__stack_chk_fail@plt>
     15246f1:	cc                   	int3
     15246f2:	53                   	push   rbx
     15246f3:	48 89 fb             	mov    rbx,rdi
     15246f6:	8a 87 b0 01 00 00    	mov    al,BYTE PTR [rdi+0x1b0]
     15246fc:	84 c0                	test   al,al
     15246fe:	8b 97 d0 01 00 00    	mov    edx,DWORD PTR [rdi+0x1d0]
     1524704:	8b 8f 70 04 00 00    	mov    ecx,DWORD PTR [rdi+0x470]
     152470a:	89 ce                	mov    esi,ecx
     152470c:	0f 44 f2             	cmove  esi,edx
     152470f:	40 f6 c6 02          	test   sil,0x2
     1524713:	75 0d                	jne    1524722 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x369ca6>
     1524715:	48 8b b3 a0 01 00 00 	mov    rsi,QWORD PTR [rbx+0x1a0]
     152471c:	40 8a 7e 01          	mov    dil,BYTE PTR [rsi+0x1]
     1524720:	eb 33                	jmp    1524755 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x369cd9>
     1524722:	48 8d b3 a8 02 00 00 	lea    rsi,[rbx+0x2a8]
     1524729:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
     152472d:	84 c0                	test   al,al
     152472f:	48 0f 44 f7          	cmove  rsi,rdi

### 0x152476b (0x15246f2..0x1524868)
     1524745:	40 8a 7e 01          	mov    dil,BYTE PTR [rsi+0x1]
     1524749:	40 84 ff             	test   dil,dil
     152474c:	41 0f 95 c1          	setne  r9b
     1524750:	45 38 c8             	cmp    r8b,r9b
     1524753:	74 7a                	je     15247cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x369d53>
     1524755:	84 c0                	test   al,al
     1524757:	0f 44 ca             	cmove  ecx,edx
     152475a:	48 8d 93 ce 06 00 00 	lea    rdx,[rbx+0x6ce]
     1524761:	4c 8d 83 2e 04 00 00 	lea    r8,[rbx+0x42e]
     1524768:	83 c9 02             	or     ecx,0x2
     152476b:	4c 8d 8b 70 04 00 00 	lea    r9,[rbx+0x470]
     1524772:	4c 8d 93 d0 01 00 00 	lea    r10,[rbx+0x1d0]
     1524779:	48 83 c6 08          	add    rsi,0x8
     152477d:	84 c0                	test   al,al
     152477f:	49 0f 44 d0          	cmove  rdx,r8
     1524783:	40 88 3a             	mov    BYTE PTR [rdx],dil
     1524786:	4d 0f 44 ca          	cmove  r9,r10
     152478a:	41 89 09             	mov    DWORD PTR [r9],ecx
     152478d:	74 17                	je     15247a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x369d2a>
     152478f:	80 8b 6e 04 00 00 01 	or     BYTE PTR [rbx+0x46e],0x1
     1524796:	48 8d bb 58 06 00 00 	lea    rdi,[rbx+0x658]
     152479d:	48 8b 93 60 04 00 00 	mov    rdx,QWORD PTR [rbx+0x460]

### 0x1541c86 (0x153e688..0x1544b13) WRITE
     1541c62:	eb 44                	jmp    1541ca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38722c>
     1541c64:	84 c0                	test   al,al
     1541c66:	74 07                	je     1541c6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3871f3>
     1541c68:	e8 77 9c 79 ff       	call   cdb8e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x228884>
     1541c6d:	eb 39                	jmp    1541ca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38722c>
     1541c6f:	0f 28 84 24 00 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb00]
     1541c76:	00 
     1541c77:	0f 11 85 60 04 00 00 	movups XMMWORD PTR [rbp+0x460],xmm0
     1541c7e:	48 8b 84 24 10 0b 00 	mov    rax,QWORD PTR [rsp+0xb10]
     1541c85:	00 
     1541c86:	48 89 85 70 04 00 00 	mov    QWORD PTR [rbp+0x470],rax
     1541c8d:	0f 57 c0             	xorps  xmm0,xmm0
     1541c90:	0f 29 84 24 00 0b 00 	movaps XMMWORD PTR [rsp+0xb00],xmm0
     1541c97:	00 
     1541c98:	48 83 a4 24 10 0b 00 	and    QWORD PTR [rsp+0xb10],0x0
     1541c9f:	00 00 
     1541ca1:	c6 85 78 04 00 00 01 	mov    BYTE PTR [rbp+0x478],0x1
     1541ca8:	48 8d bd 80 04 00 00 	lea    rdi,[rbp+0x480]
     1541caf:	8a 85 98 04 00 00    	mov    al,BYTE PTR [rbp+0x498]
     1541cb5:	3a 84 24 38 0b 00 00 	cmp    al,BYTE PTR [rsp+0xb38]
     1541cbc:	75 0e                	jne    1541ccc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387250>
     1541cbe:	84 c0                	test   al,al

### 0x155b9d5 (0x155b9b5..0x155be12) WRITE
     155b9b6:	41 57                	push   r15
     155b9b8:	41 56                	push   r14
     155b9ba:	41 55                	push   r13
     155b9bc:	41 54                	push   r12
     155b9be:	53                   	push   rbx
     155b9bf:	48 81 ec 78 04 00 00 	sub    rsp,0x478
     155b9c6:	48 89 f3             	mov    rbx,rsi
     155b9c9:	49 89 fc             	mov    r12,rdi
     155b9cc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     155b9d3:	00 00 
     155b9d5:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     155b9dc:	00 
     155b9dd:	e8 a4 48 17 00       	call   16d0286 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x843f2>
     155b9e2:	80 4b 10 01          	or     BYTE PTR [rbx+0x10],0x1
     155b9e6:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     155b9ea:	40 f6 c6 01          	test   sil,0x1
     155b9ee:	0f 85 92 03 00 00    	jne    155bd86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a130a>
     155b9f4:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     155b9f8:	e8 53 9e 20 00       	call   1765850 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1199bc>
     155b9fd:	4c 89 e7             	mov    rdi,r12
     155ba00:	48 89 c6             	mov    rsi,rax
     155ba03:	e8 26 00 52 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>

### 0x155bb05 (0x155b9b5..0x155be12)
     155badb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     155bae0:	0f 10 84 24 c0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xc0]
     155bae7:	00 
     155bae8:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     155baec:	e8 cd b2 d5 ff       	call   12b6dbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfc342>
     155baf1:	4c 89 64 24 38       	mov    QWORD PTR [rsp+0x38],r12
     155baf6:	80 7b 78 00          	cmp    BYTE PTR [rbx+0x78],0x0
     155bafa:	74 29                	je     155bb25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a10a9>
     155bafc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     155bb03:	00 00 
     155bb05:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
     155bb0c:	00 
     155bb0d:	0f 85 fa 02 00 00    	jne    155be0d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a1391>
     155bb13:	48 81 c4 78 04 00 00 	add    rsp,0x478
     155bb1a:	5b                   	pop    rbx
     155bb1b:	41 5c                	pop    r12
     155bb1d:	41 5d                	pop    r13
     155bb1f:	41 5e                	pop    r14
     155bb21:	41 5f                	pop    r15
     155bb23:	5d                   	pop    rbp
     155bb24:	c3                   	ret
     155bb25:	0f 57 c0             	xorps  xmm0,xmm0

### 0x155bdfb (0x155b9b5..0x155be12)
     155bdce:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     155bdd3:	e8 b6 25 b5 ff       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
     155bdd8:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
     155bddd:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     155bde4:	00 
     155bde5:	e8 c0 4a 17 00       	call   16d08aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84a16>
     155bdea:	4c 89 e7             	mov    rdi,r12
     155bded:	e8 9e 45 17 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
     155bdf2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     155bdf9:	00 00 
     155bdfb:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
     155be02:	00 
     155be03:	75 08                	jne    155be0d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a1391>
     155be05:	48 89 df             	mov    rdi,rbx
     155be08:	e8 c3 3e 51 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     155be0d:	e8 9e 3c 29 00       	call   17efab0 <__stack_chk_fail@plt>
     155be12:	41 57                	push   r15
     155be14:	41 56                	push   r14
     155be16:	53                   	push   rbx
     155be17:	48 81 ec 90 00 00 00 	sub    rsp,0x90
     155be1e:	49 89 f6             	mov    r14,rsi
     155be21:	48 89 fb             	mov    rbx,rdi

### 0x1597059 (0x1596e2c..0x159755a)
     159702f:	4d 85 e4             	test   r12,r12
     1597032:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
     1597036:	74 49                	je     1597081 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dc605>
     1597038:	48 8d 5c 24 68       	lea    rbx,[rsp+0x68]
     159703d:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
     1597042:	49 8d 54 24 10       	lea    rdx,[r12+0x10]
     1597047:	4c 89 ff             	mov    rdi,r15
     159704a:	48 89 de             	mov    rsi,rbx
     159704d:	e8 10 1f 00 00       	call   1598f62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3de4e6>
     1597052:	49 8b 87 68 04 00 00 	mov    rax,QWORD PTR [r15+0x468]
     1597059:	49 8b 8f 70 04 00 00 	mov    rcx,QWORD PTR [r15+0x470]
     1597060:	48 29 c1             	sub    rcx,rax
     1597063:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     1597068:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
     159706d:	4c 89 ef             	mov    rdi,r13
     1597070:	4c 89 f6             	mov    rsi,r14
     1597073:	e8 64 ed 0f 00       	call   1695ddc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49f48>
     1597078:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     159707c:	4d 85 e4             	test   r12,r12
     159707f:	75 c1                	jne    1597042 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dc5c6>
     1597081:	48 8b 9c 24 40 01 00 	mov    rbx,QWORD PTR [rsp+0x140]
     1597088:	00 

### 0x15970ba (0x1596e2c..0x159755a)
     159708e:	4c 8d 25 e7 ae eb fe 	lea    r12,[rip+0xfffffffffeebaee7]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1597095:	6a 01                	push   0x1
     1597097:	5d                   	pop    rbp
     1597098:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
     159709d:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
     15970a2:	48 8d 53 10          	lea    rdx,[rbx+0x10]
     15970a6:	4c 89 ff             	mov    rdi,r15
     15970a9:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
     15970ae:	e8 af 1e 00 00       	call   1598f62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3de4e6>
     15970b3:	49 8b 87 68 04 00 00 	mov    rax,QWORD PTR [r15+0x468]
     15970ba:	49 8b 8f 70 04 00 00 	mov    rcx,QWORD PTR [r15+0x470]
     15970c1:	48 29 c1             	sub    rcx,rax
     15970c4:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     15970c9:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
     15970ce:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
     15970d3:	4c 89 e7             	mov    rdi,r12
     15970d6:	48 89 ee             	mov    rsi,rbp
     15970d9:	e8 32 74 25 00       	call   17ee510 <__strlen_chk@plt>
     15970de:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     15970e3:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     15970e7:	4c 89 ee             	mov    rsi,r13
     15970ea:	4c 89 f2             	mov    rdx,r14

### 0x159774e (0x159765c..0x1597999)
     1597722:	45 31 f6             	xor    r14d,r14d
     1597725:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
     159772a:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
     159772f:	4a 8b 44 35 00       	mov    rax,QWORD PTR [rbp+r14*1+0x0]
     1597734:	48 8b 50 18          	mov    rdx,QWORD PTR [rax+0x18]
     1597738:	48 83 e2 fc          	and    rdx,0xfffffffffffffffc
     159773c:	4c 89 ff             	mov    rdi,r15
     159773f:	4c 89 e6             	mov    rsi,r12
     1597742:	e8 1b 18 00 00       	call   1598f62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3de4e6>
     1597747:	49 8b 87 68 04 00 00 	mov    rax,QWORD PTR [r15+0x468]
     159774e:	49 8b 8f 70 04 00 00 	mov    rcx,QWORD PTR [r15+0x470]
     1597755:	48 29 c1             	sub    rcx,rax
     1597758:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     159775d:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
     1597762:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1597767:	4c 89 ee             	mov    rsi,r13
     159776a:	e8 6d e6 0f 00       	call   1695ddc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49f48>
     159776f:	49 83 c6 08          	add    r14,0x8
     1597773:	4c 39 f3             	cmp    rbx,r14
     1597776:	75 b7                	jne    159772f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dccb3>
     1597778:	4d 8d af a0 00 00 00 	lea    r13,[r15+0xa0]
     159777f:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]

### 0x15c941d (0x15c93f0..0x15c9e20) WRITE
     15c93f7:	41 54                	push   r12
     15c93f9:	53                   	push   rbx
     15c93fa:	48 81 ec 78 04 00 00 	sub    rsp,0x478
     15c9401:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8
     15c9406:	49 89 ce             	mov    r14,rcx
     15c9409:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
     15c940e:	49 89 f4             	mov    r12,rsi
     15c9411:	49 89 ff             	mov    r15,rdi
     15c9414:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c941b:	00 00 
     15c941d:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
     15c9424:	00 
     15c9425:	48 8b 76 68          	mov    rsi,QWORD PTR [rsi+0x68]
     15c9429:	48 8d 9c 24 a8 00 00 	lea    rbx,[rsp+0xa8]
     15c9430:	00 
     15c9431:	48 89 df             	mov    rdi,rbx
     15c9434:	e8 b3 70 0b 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
     15c9439:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     15c943d:	0f 84 83 07 00 00    	je     15c9bc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40f14a>
     15c9443:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
     15c9448:	4d 8b b4 24 d8 00 00 	mov    r14,QWORD PTR [r12+0xd8]
     15c944f:	00 

### 0x15c9c90 (0x15c93f0..0x15c9e20)
     15c9c67:	00 
     15c9c68:	e8 91 a5 66 ff       	call   c341fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18119e>
     15c9c6d:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     15c9c74:	00 
     15c9c75:	e8 f0 eb 01 00       	call   15e886a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ddee>
     15c9c7a:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
     15c9c81:	00 
     15c9c82:	e8 ff 47 4d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15c9c87:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c9c8e:	00 00 
     15c9c90:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
     15c9c97:	00 
     15c9c98:	0f 85 7d 01 00 00    	jne    15c9e1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40f39f>
     15c9c9e:	48 81 c4 78 04 00 00 	add    rsp,0x478
     15c9ca5:	5b                   	pop    rbx
     15c9ca6:	41 5c                	pop    r12
     15c9ca8:	41 5d                	pop    r13
     15c9caa:	41 5e                	pop    r14
     15c9cac:	41 5f                	pop    r15
     15c9cae:	5d                   	pop    rbp
     15c9caf:	c3                   	ret
     15c9cb0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x15c9cb9 (0x15c93f0..0x15c9e20)
     15c9c9e:	48 81 c4 78 04 00 00 	add    rsp,0x478
     15c9ca5:	5b                   	pop    rbx
     15c9ca6:	41 5c                	pop    r12
     15c9ca8:	41 5d                	pop    r13
     15c9caa:	41 5e                	pop    r14
     15c9cac:	41 5f                	pop    r15
     15c9cae:	5d                   	pop    rbp
     15c9caf:	c3                   	ret
     15c9cb0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c9cb7:	00 00 
     15c9cb9:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
     15c9cc0:	00 
     15c9cc1:	0f 85 54 01 00 00    	jne    15c9e1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40f39f>
     15c9cc7:	e8 f4 a8 43 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     15c9ccc:	48 89 c3             	mov    rbx,rax
     15c9ccf:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     15c9cd4:	e8 13 ca 4e ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     15c9cd9:	eb 47                	jmp    15c9d22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40f2a6>
     15c9cdb:	48 89 c3             	mov    rbx,rax
     15c9cde:	4c 89 f7             	mov    rdi,r14
     15c9ce1:	e8 62 ab 4e ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
     15c9ce6:	e9 d4 00 00 00       	jmp    15c9dbf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40f343>

### 0x15c9e09 (0x15c93f0..0x15c9e20)
     15c9de0:	00 
     15c9de1:	e8 84 ea 01 00       	call   15e886a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ddee>
     15c9de6:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     15c9ded:	00 
     15c9dee:	e8 9d 40 22 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15c9df3:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
     15c9dfa:	00 
     15c9dfb:	e8 86 46 4d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15c9e00:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c9e07:	00 00 
     15c9e09:	48 3b 84 24 70 04 00 	cmp    rax,QWORD PTR [rsp+0x470]
     15c9e10:	00 
     15c9e11:	75 08                	jne    15c9e1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40f39f>
     15c9e13:	48 89 df             	mov    rdi,rbx
     15c9e16:	e8 b5 5e 4a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     15c9e1b:	e8 90 5c 22 00       	call   17efab0 <__stack_chk_fail@plt>
     15c9e20:	53                   	push   rbx
     15c9e21:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     15c9e24:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     15c9e28:	48 85 db             	test   rbx,rbx
     15c9e2b:	74 18                	je     15c9e45 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40f3c9>
     15c9e2d:	80 7f 10 00          	cmp    BYTE PTR [rdi+0x10],0x0

### 0x15ca7e4 (0x15c9e9a..0x15cab0b)
     15ca7bc:	45 89 e8             	mov    r8d,r13d
     15ca7bf:	4c 8d 8c 24 68 04 00 	lea    r9,[rsp+0x468]
     15ca7c6:	00 
     15ca7c7:	e8 56 03 00 00       	call   15cab22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4100a6>
     15ca7cc:	48 89 df             	mov    rdi,rbx
     15ca7cf:	e8 bc 36 22 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15ca7d4:	80 8c 24 78 04 00 00 	or     BYTE PTR [rsp+0x478],0x4
     15ca7db:	04 
     15ca7dc:	48 8b b4 24 f8 02 00 	mov    rsi,QWORD PTR [rsp+0x2f8]
     15ca7e3:	00 
     15ca7e4:	48 8b 94 24 70 04 00 	mov    rdx,QWORD PTR [rsp+0x470]
     15ca7eb:	00 
     15ca7ec:	f6 c2 01             	test   dl,0x1
     15ca7ef:	75 7c                	jne    15ca86d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40fdf1>
     15ca7f1:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     15ca7f5:	48 8d bc 24 a8 04 00 	lea    rdi,[rsp+0x4a8]
     15ca7fc:	00 
     15ca7fd:	e8 90 af 19 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15ca802:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     15ca807:	48 8b 80 18 01 00 00 	mov    rax,QWORD PTR [rax+0x118]
     15ca80e:	48 8b 70 30          	mov    rsi,QWORD PTR [rax+0x30]
     15ca812:	48 8b 06             	mov    rax,QWORD PTR [rsi]

### 0x15d5e1c (0x15d5de4..0x15d5e8e)
     15d5de8:	49 89 fe             	mov    r14,rdi
     15d5deb:	48 8d 05 4e 0b 2b 00 	lea    rax,[rip+0x2b0b4e]        # 1886940 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x43028>
     15d5df2:	48 89 07             	mov    QWORD PTR [rdi],rax
     15d5df5:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
     15d5df9:	48 8d 05 b8 0b 2b 00 	lea    rax,[rip+0x2b0bb8]        # 18869b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x430a0>
     15d5e00:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     15d5e04:	48 81 c7 10 05 00 00 	add    rdi,0x510
     15d5e0b:	e8 80 80 21 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15d5e10:	49 8d be e8 04 00 00 	lea    rdi,[r14+0x4e8]
     15d5e17:	e8 7e 7c 05 00       	call   162da9a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28c08>
     15d5e1c:	49 8d be 70 04 00 00 	lea    rdi,[r14+0x470]
     15d5e23:	e8 cc d4 0a 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
     15d5e28:	49 8d be e8 03 00 00 	lea    rdi,[r14+0x3e8]
     15d5e2f:	e8 c0 d4 0a 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
     15d5e34:	49 8d be 60 03 00 00 	lea    rdi,[r14+0x360]
     15d5e3b:	e8 b4 d4 0a 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
     15d5e40:	49 8d be d8 02 00 00 	lea    rdi,[r14+0x2d8]
     15d5e47:	e8 a8 d4 0a 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
     15d5e4c:	49 8d be 50 02 00 00 	lea    rdi,[r14+0x250]
     15d5e53:	e8 9c d4 0a 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
     15d5e58:	49 8d be c8 01 00 00 	lea    rdi,[r14+0x1c8]
     15d5e5f:	e8 90 d4 0a 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>

### 0x15f2136 (0x15f1cb0..0x15f2493) WRITE
     15f2108:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     15f210d:	49 8d be 40 04 00 00 	lea    rdi,[r14+0x440]
     15f2114:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     15f2119:	e8 9a 5e 57 ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
     15f211e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     15f2121:	48 89 df             	mov    rdi,rbx
     15f2124:	ff 50 28             	call   QWORD PTR [rax+0x28]
     15f2127:	49 8d be 68 04 00 00 	lea    rdi,[r14+0x468]
     15f212e:	48 89 c6             	mov    rsi,rax
     15f2131:	e8 62 68 56 ff       	call   b58998 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5938>
     15f2136:	4d 89 a6 70 04 00 00 	mov    QWORD PTR [r14+0x470],r12
     15f213d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     15f2140:	48 89 df             	mov    rdi,rbx
     15f2143:	ff 50 28             	call   QWORD PTR [rax+0x28]
     15f2146:	49 8d be 78 04 00 00 	lea    rdi,[r14+0x478]
     15f214d:	48 89 c6             	mov    rsi,rax
     15f2150:	e8 43 68 56 ff       	call   b58998 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5938>
     15f2155:	49 8d 86 88 04 00 00 	lea    rax,[r14+0x488]
     15f215c:	66 0f ef c0          	pxor   xmm0,xmm0
     15f2160:	f3 41 0f 7f 86 88 04 	movdqu XMMWORD PTR [r14+0x488],xmm0
     15f2167:	00 00 
     15f2169:	49 89 86 80 04 00 00 	mov    QWORD PTR [r14+0x480],rax

### 0x1630682 (0x1630070..0x1632440)
     163065d:	e9 71 04 00 00       	jmp    1630ad3 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc41>
     1630662:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     1630669:	00 
     163066a:	4c 89 ee             	mov    rsi,r13
     163066d:	e8 d2 07 03 00       	call   1660e44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fb0>
     1630672:	45 84 ff             	test   r15b,r15b
     1630675:	0f 95 c1             	setne  cl
     1630678:	20 c8                	and    al,cl
     163067a:	3c 01                	cmp    al,0x1
     163067c:	0f 85 00 fc ff ff    	jne    1630282 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b3f0>
     1630682:	8b bc 24 70 04 00 00 	mov    edi,DWORD PTR [rsp+0x470]
     1630689:	48 8b b4 24 f0 00 00 	mov    rsi,QWORD PTR [rsp+0xf0]
     1630690:	00 
     1630691:	48 8b 94 24 f8 00 00 	mov    rdx,QWORD PTR [rsp+0xf8]
     1630698:	00 
     1630699:	48 29 f2             	sub    rdx,rsi
     163069c:	48 c1 fa 05          	sar    rdx,0x5
     16306a0:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     16306a5:	e8 25 49 00 00       	call   1634fcf <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3013d>
     16306aa:	83 bc 24 3c 05 00 00 	cmp    DWORD PTR [rsp+0x53c],0x0
     16306b1:	00 
     16306b2:	41 b7 01             	mov    r15b,0x1

### 0x167aa82 (0x167aa72..0x167aa97)
     167aa66:	4c 89 f0             	mov    rax,r14
     167aa69:	48 83 c4 08          	add    rsp,0x8
     167aa6d:	5b                   	pop    rbx
     167aa6e:	41 5e                	pop    r14
     167aa70:	c3                   	ret
     167aa71:	cc                   	int3
     167aa72:	53                   	push   rbx
     167aa73:	48 89 fb             	mov    rbx,rdi
     167aa76:	48 81 c7 30 05 00 00 	add    rdi,0x530
     167aa7d:	e8 0e 34 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     167aa82:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     167aa89:	e8 7a d7 ff ff       	call   1678208 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c374>
     167aa8e:	48 89 df             	mov    rdi,rbx
     167aa91:	5b                   	pop    rbx
     167aa92:	e9 d1 e9 ff ff       	jmp    1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
     167aa97:	cc                   	int3
     167aa98:	41 57                	push   r15
     167aa9a:	41 56                	push   r14
     167aa9c:	53                   	push   rbx
     167aa9d:	49 89 f6             	mov    r14,rsi
     167aaa0:	48 89 fb             	mov    rbx,rdi
     167aaa3:	e8 18 ea ff ff       	call   16794c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d62c>

### 0x17e2076 (0x17dfd00..0x17e673e) WRITE
     17e204e:	48 8b 84 24 68 04 00 	mov    rax,QWORD PTR [rsp+0x468]
     17e2055:	00 
     17e2056:	48 0f be 00          	movsx  rax,BYTE PTR [rax]
     17e205a:	48 89 94 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rdx
     17e2061:	00 
     17e2062:	48 8b ac 24 74 04 00 	mov    rbp,QWORD PTR [rsp+0x474]
     17e2069:	00 
     17e206a:	48 85 d2             	test   rdx,rdx
     17e206d:	0f 84 91 00 00 00    	je     17e2104 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xdf25>
     17e2073:	0f b6 0a             	movzx  ecx,BYTE PTR [rdx]
     17e2076:	88 8c 24 70 04 00 00 	mov    BYTE PTR [rsp+0x470],cl
     17e207d:	48 ff c2             	inc    rdx
     17e2080:	48 89 94 24 48 04 00 	mov    QWORD PTR [rsp+0x448],rdx
     17e2087:	00 
     17e2088:	48 3b 94 24 58 04 00 	cmp    rdx,QWORD PTR [rsp+0x458]
     17e208f:	00 
     17e2090:	72 47                	jb     17e20d9 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xdefa>
     17e2092:	48 8b 94 24 38 04 00 	mov    rdx,QWORD PTR [rsp+0x438]
     17e2099:	00 
     17e209a:	48 8b b4 24 40 04 00 	mov    rsi,QWORD PTR [rsp+0x440]
     17e20a1:	00 
     17e20a2:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]

### 0x17e2104 (0x17dfd00..0x17e673e)
     17e20dc:	48 c1 ea 20          	shr    rdx,0x20
     17e20e0:	0f be b4 4c 7c 04 00 	movsx  esi,BYTE PTR [rsp+rcx*2+0x47c]
     17e20e7:	00 
     17e20e8:	01 ee                	add    esi,ebp
     17e20ea:	89 b4 24 74 04 00 00 	mov    DWORD PTR [rsp+0x474],esi
     17e20f1:	0f be b4 4c 7d 04 00 	movsx  esi,BYTE PTR [rsp+rcx*2+0x47d]
     17e20f8:	00 
     17e20f9:	01 d6                	add    esi,edx
     17e20fb:	89 b4 24 78 04 00 00 	mov    DWORD PTR [rsp+0x478],esi
     17e2102:	eb 08                	jmp    17e210c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xdf2d>
     17e2104:	0f b6 8c 24 70 04 00 	movzx  ecx,BYTE PTR [rsp+0x470]
     17e210b:	00 
     17e210c:	41 83 f8 02          	cmp    r8d,0x2
     17e2110:	7f 45                	jg     17e2157 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xdf78>
     17e2112:	41 83 f8 01          	cmp    r8d,0x1
     17e2116:	74 05                	je     17e211d <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xdf3e>
     17e2118:	48 39 c1             	cmp    rcx,rax
     17e211b:	74 58                	je     17e2175 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xdf96>
     17e211d:	48 8b 84 24 e8 15 00 	mov    rax,QWORD PTR [rsp+0x15e8]
     17e2124:	00 
     17e2125:	48 3b 84 24 f8 15 00 	cmp    rax,QWORD PTR [rsp+0x15f8]
     17e212c:	00 

## Candidate same-object functions

- 0xa79ce6..0xa79d90: offsets 0x470
- 0xa7e773..0xa7f6a3: offsets 0x438, 0x470
- 0xa8ae88..0xa8c879: offsets 0x438, 0x470
- 0xa8c879..0xa8fc8b: offsets 0x14a0, 0x470
- 0xa962cf..0xa96d29: offsets 0x470
- 0xaa1418..0xaa6ad6: offsets 0x470, 0x598
- 0xac6a72..0xac8907: offsets 0x14a0, 0x470
- 0xac9d46..0xacbcbe: offsets 0x438, 0x470, 0x598
- 0xad1a74..0xad5057: offsets 0x470
- 0xb67984..0xb67ee7: offsets 0x470
- 0xb7513c..0xb75723: offsets 0x470
- 0xbc2c06..0xbc2cdf: offsets 0x470
- 0xbc4a06..0xbc4a7b: offsets 0x470
- 0xbd9b4a..0xbdc4b7: offsets 0x470
- 0xc0d5c2..0xc0deb3: offsets 0x470
- 0xc18d4e..0xc19c28: offsets 0x470
- 0xc5391a..0xc571cb: offsets 0x438, 0x470, 0x598
- 0xc6c08a..0xc6e081: offsets 0x470
- 0xcb7a20..0xcbc937: offsets 0x438, 0x470
- 0xcccca6..0xccef9d: offsets 0x14a0, 0x438, 0x470
- 0xcd7752..0xcd9380: offsets 0x470
- 0xce8ef6..0xcea164: offsets 0x438, 0x470, 0x598
- 0xcea164..0xceabe2: offsets 0x470
- 0xd077d6..0xd090fa: offsets 0x438, 0x470
- 0xd1658e..0xd168b4: offsets 0x470
- 0xd6aa99..0xd6f087: offsets 0x470
- 0xd70640..0xd70744: offsets 0x470
- 0xd70fde..0xd71310: offsets 0x470
- 0xd71884..0xd723ed: offsets 0x470
- 0xd73652..0xd73887: offsets 0x470
- 0xd78540..0xd7994b: offsets 0x470
- 0xd7994c..0xd7a534: offsets 0x470
- 0xd7a534..0xd7a630: offsets 0x470
- 0xd7e33e..0xd7eb7e: offsets 0x470
- 0xd7eefa..0xd7ef42: offsets 0x470
- 0xd8170c..0xd81808: offsets 0x470
- 0xd81b9a..0xd81d21: offsets 0x470
- 0xd82046..0xd821e3: offsets 0x470
- 0xd8b73e..0xd8b973: offsets 0x470
- 0xdb0c12..0xdb2528: offsets 0x438, 0x470
- 0xdb6b30..0xdb6c4c: offsets 0x470
- 0xdbbdbc..0xdbcc85: offsets 0x438, 0x470
- 0xdf78ee..0xdf9239: offsets 0x470
- 0xe0c8c6..0xe0c8d4: offsets 0x470
- 0xe105b4..0xe107a9: offsets 0x470
- 0xe11e8c..0xe12505: offsets 0x470
- 0xe12b18..0xe12b51: offsets 0x470
- 0xe12b52..0xe12b64: offsets 0x470
- 0xe1492e..0xe14940: offsets 0x470
- 0xe3097c..0xe309a0: offsets 0x470
- 0xe34334..0xe34482: offsets 0x470
- 0xe34934..0xe34a57: offsets 0x470
- 0xe40bea..0xe41391: offsets 0x470
- 0xe62518..0xe62d4f: offsets 0x470
- 0xe649a9..0xe649d3: offsets 0x470
- 0xe65cde..0xe65d03: offsets 0x470
- 0xe65d03..0xe65d94: offsets 0x470
- 0xe65db0..0xe65dcb: offsets 0x470
- 0xe65e9e..0xe65eb5: offsets 0x470
- 0xe65f44..0xe66088: offsets 0x470
- 0xe8c65c..0xe8e898: offsets 0x438, 0x470
- 0xe92f2c..0xe98f3b: offsets 0x470, 0x598
- 0xec7114..0xec716f: offsets 0x470
- 0xecb734..0xecb758: offsets 0x470
- 0xef3d64..0xef3fd9: offsets 0x470
- 0xef4103..0xef4ca1: offsets 0x470
- 0xef54be..0xef567c: offsets 0x470
- 0xef91cc..0xefe62b: offsets 0x470
- 0xf09ba2..0xf09d96: offsets 0x470
- 0xf09d96..0xf0a6d7: offsets 0x470
- 0xf197e6..0xf198ea: offsets 0x470
- 0xf1b834..0xf1b9d9: offsets 0x470
- 0xf1b9da..0xf1bd5c: offsets 0x470
- 0xf1bd5c..0xf1c0d6: offsets 0x470
- 0xf1c0d6..0xf1c69b: offsets 0x470
- 0xf1c75a..0xf1c925: offsets 0x470
- 0xf1efa2..0xf1f1bb: offsets 0x470
- 0xf46036..0xf461e0: offsets 0x470
- 0xf4bafe..0xf4c24f: offsets 0x470
- 0xf8c22c..0xf8c5b1: offsets 0x470
- 0xfc5e06..0xfc5fba: offsets 0x438, 0x470
- 0xfe0a6a..0xfe0f30: offsets 0x470
- 0xff7b1e..0xff7bdd: offsets 0x470
- 0xffc99e..0xffcfcd: offsets 0x470
- 0xffeb88..0xffebf3: offsets 0x470
- 0x10409b6..0x1040cd6: offsets 0x470
- 0x1040cd6..0x1040ed3: offsets 0x470
- 0x10431ac..0x10437c5: offsets 0x470
- 0x1044792..0x10455e3: offsets 0x470
- 0x105a2d2..0x105af25: offsets 0x470, 0x598
- 0x105b4cb..0x105b5df: offsets 0x470
- 0x105b772..0x105b92f: offsets 0x470
- 0x105baba..0x105bad0: offsets 0x470
- 0x105c7e6..0x105c81e: offsets 0x470
- 0x107a02c..0x107e484: offsets 0x470
- 0x108eacc..0x108eb99: offsets 0x470
- 0x109917a..0x1099d71: offsets 0x470
- 0x10a2082..0x10a2130: offsets 0x470
- 0x10a6464..0x10a7f52: offsets 0x14a0, 0x438, 0x470, 0x598
- 0x10a9668..0x10a969c: offsets 0x438, 0x470, 0x598
- 0x10bfd22..0x10bfd35: offsets 0x470
- 0x10d0e58..0x10d4cf6: offsets 0x438, 0x470, 0x598
- 0x10f9518..0x10f9559: offsets 0x470
- 0x10f955a..0x10f972f: offsets 0x470
- 0x111209a..0x111362a: offsets 0x470
- 0x113996a..0x113a034: offsets 0x470
- 0x113a7c4..0x113a823: offsets 0x470
- 0x1145c8a..0x1146a50: offsets 0x470
- 0x1161682..0x11648bf: offsets 0x470
- 0x116a606..0x116d6fc: offsets 0x470
- 0x11af6de..0x11b20f2: offsets 0x470
- 0x11ca706..0x11cd602: offsets 0x470, 0x598
- 0x11d4aba..0x11d4ea4: offsets 0x470
- 0x11ef334..0x11f5af4: offsets 0x438, 0x470, 0x598
- 0x11f8ada..0x11f8b44: offsets 0x470
- 0x120f7a1..0x120f98f: offsets 0x470
- 0x12286bc..0x12291d6: offsets 0x470, 0x598
- 0x122acda..0x122adf6: offsets 0x470
- 0x122ba2e..0x122c594: offsets 0x438, 0x470
- 0x122e1da..0x1230a86: offsets 0x470
- 0x1235556..0x1239d28: offsets 0x470
- 0x123c81c..0x1240fd8: offsets 0x438, 0x470
- 0x1244558..0x1244ad3: offsets 0x470
- 0x1263214..0x12658e5: offsets 0x438, 0x470, 0x598
- 0x1298d86..0x129a87b: offsets 0x470
- 0x12ad5f6..0x12ade18: offsets 0x470
- 0x12b236e..0x12b28ba: offsets 0x470
- 0x12c186c..0x12c2351: offsets 0x470
- 0x12cb106..0x12cbc74: offsets 0x438, 0x470, 0x598
- 0x12ccf68..0x12cd22e: offsets 0x438, 0x470
- 0x12cd240..0x12cf4c0: offsets 0x438, 0x470
- 0x12f072f..0x12f0afb: offsets 0x470
- 0x12feb98..0x12ff8c1: offsets 0x470
- 0x130e394..0x130e98c: offsets 0x470
- 0x1326734..0x1328d02: offsets 0x470
- 0x1336efa..0x133771c: offsets 0x470
- 0x133e9da..0x133ea42: offsets 0x470
- 0x133ea42..0x133eaed: offsets 0x470
- 0x133fd98..0x13404d1: offsets 0x470
- 0x135a74c..0x135c1fa: offsets 0x470
- 0x135c31a..0x135c538: offsets 0x470
- 0x1361eb4..0x13626e6: offsets 0x470
- 0x13695b6..0x1369cef: offsets 0x438, 0x470
- 0x136efea..0x136f65c: offsets 0x470
- 0x137587e..0x13765b4: offsets 0x470
- 0x13ac372..0x13adc94: offsets 0x470, 0x598
- 0x13b3b70..0x13b4ce3: offsets 0x438, 0x470
- 0x13b82ee..0x13b891e: offsets 0x470
- 0x13bbbc2..0x13bc0d5: offsets 0x438, 0x470, 0x598
- 0x13bc76c..0x13bc805: offsets 0x470
- 0x13bd354..0x13bd65d: offsets 0x470
- 0x13bd65e..0x13be0db: offsets 0x438, 0x470, 0x598
- 0x140ab48..0x140cff6: offsets 0x470
- 0x141a788..0x141b53b: offsets 0x438, 0x470
- 0x143f86e..0x143fbb9: offsets 0x470
- 0x1441ff6..0x144252f: offsets 0x470
- 0x1442fd2..0x1443e3e: offsets 0x470
- 0x14462dc..0x1446ffc: offsets 0x470
- 0x14662e6..0x14663ce: offsets 0x470
- 0x146a282..0x146a6b3: offsets 0x470
- 0x146b635..0x146b6ae: offsets 0x470
- 0x14740f4..0x147584c: offsets 0x470
- 0x1483002..0x1483c35: offsets 0x470
- 0x149daaa..0x14a06f6: offsets 0x438, 0x470
- 0x14b91f2..0x14ba12f: offsets 0x470
- 0x14c431d..0x14c5124: offsets 0x470
- 0x14c97b0..0x14c9945: offsets 0x470
- 0x14fbfd2..0x14fcdad: offsets 0x470
- 0x14fcdae..0x14fe236: offsets 0x470
- 0x15182d6..0x1519a71: offsets 0x470
- 0x151f0d6..0x15219ce: offsets 0x438, 0x470
- 0x15229bc..0x1523550: offsets 0x438, 0x470
- 0x15246f2..0x1524868: offsets 0x470
- 0x153e688..0x1544b13: offsets 0x438, 0x470
- 0x155b9b5..0x155be12: offsets 0x470
- 0x1596e2c..0x159755a: offsets 0x470
- 0x159765c..0x1597999: offsets 0x470
- 0x15c93f0..0x15c9e20: offsets 0x438, 0x470
- 0x15c9e9a..0x15cab0b: offsets 0x438, 0x470
- 0x15d5de4..0x15d5e8e: offsets 0x470
- 0x15f1cb0..0x15f2493: offsets 0x470
- 0x1630070..0x1632440: offsets 0x470, 0x598
- 0x167aa72..0x167aa97: offsets 0x470
- 0x17dfd00..0x17e673e: offsets 0x438, 0x470

## Direct callers of 0x10a6464

### 0x10a645f from 0x10a645c..0x10a6464
     10a6428:	48 8d 87 a0 03 00 00 	lea    rax,[rdi+0x3a0]
     10a642f:	0f 11 87 a0 03 00 00 	movups XMMWORD PTR [rdi+0x3a0],xmm0
     10a6436:	48 89 87 98 03 00 00 	mov    QWORD PTR [rdi+0x398],rax
     10a643d:	48 8d 87 b8 03 00 00 	lea    rax,[rdi+0x3b8]
     10a6444:	0f 11 87 b8 03 00 00 	movups XMMWORD PTR [rdi+0x3b8],xmm0
     10a644b:	48 89 87 b0 03 00 00 	mov    QWORD PTR [rdi+0x3b0],rax
     10a6452:	c3                   	ret
     10a6453:	cc                   	int3
     10a6454:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10a6457:	e9 00 00 00 00       	jmp    10a645c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d872>
     10a645c:	6a 01                	push   0x1
     10a645e:	5e                   	pop    rsi
     10a645f:	e9 00 00 00 00       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a6464:	55                   	push   rbp
     10a6465:	41 57                	push   r15
     10a6467:	41 56                	push   r14
     10a6469:	41 55                	push   r13
     10a646b:	41 54                	push   r12
     10a646d:	53                   	push   rbx
     10a646e:	48 81 ec 38 08 00 00 	sub    rsp,0x838
     10a6475:	89 f5                	mov    ebp,esi
     10a6477:	49 89 fe             	mov    r14,rdi
     10a647a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a6481:	00 00 
     10a6483:	48 89 84 24 30 08 00 	mov    QWORD PTR [rsp+0x830],rax

### 0x10a8d97 from 0x10a8aae..0x10a8da4
     10a8d68:	49 8d b6 98 03 00 00 	lea    rsi,[r14+0x398]
     10a8d6f:	e8 20 a1 d8 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     10a8d74:	48 8d bb 40 14 00 00 	lea    rdi,[rbx+0x1440]
     10a8d7b:	49 81 c6 b0 03 00 00 	add    r14,0x3b0
     10a8d82:	4c 89 f6             	mov    rsi,r14
     10a8d85:	e8 0a a1 d8 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     10a8d8a:	6a 01                	push   0x1
     10a8d8c:	5e                   	pop    rsi
     10a8d8d:	48 89 df             	mov    rdi,rbx
     10a8d90:	48 83 c4 08          	add    rsp,0x8
     10a8d94:	5b                   	pop    rbx
     10a8d95:	41 5e                	pop    r14
     10a8d97:	e9 c8 d6 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a8d9c:	48 89 c7             	mov    rdi,rax
     10a8d9f:	e8 01 0d 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a8da4:	48 8d 87 90 10 00 00 	lea    rax,[rdi+0x1090]
     10a8dab:	c3                   	ret
     10a8dac:	48 8d 87 58 14 00 00 	lea    rax,[rdi+0x1458]
     10a8db3:	c3                   	ret
     10a8db4:	41 57                	push   r15
     10a8db6:	41 56                	push   r14
     10a8db8:	53                   	push   rbx
     10a8db9:	48 83 ec 50          	sub    rsp,0x50
     10a8dbd:	49 89 d7             	mov    r15,rdx
     10a8dc0:	49 89 f6             	mov    r14,rsi

### 0x10a9696 from 0x10a9668..0x10a969c
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>
     10a96af:	cc                   	int3
     10a96b0:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96b4:	e9 af ff ff ff       	jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>
     10a96b9:	cc                   	int3
     10a96ba:	41 56                	push   r14
     10a96bc:	53                   	push   rbx

### 0x10a9fb1 from 0x10a9f9e..0x10a9fbe
     10a9f8e:	41 5e                	pop    r14
     10a9f90:	c3                   	ret
     10a9f91:	e8 1a 5b 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9f96:	48 89 c7             	mov    rdi,rax
     10a9f99:	e8 07 fb 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9f9e:	53                   	push   rbx
     10a9f9f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     10a9fa2:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     10a9fa6:	e8 13 00 00 00       	call   10a9fbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713d4>
     10a9fab:	48 89 df             	mov    rdi,rbx
     10a9fae:	31 f6                	xor    esi,esi
     10a9fb0:	5b                   	pop    rbx
     10a9fb1:	e9 ae c4 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a9fb6:	48 89 c7             	mov    rdi,rax
     10a9fb9:	e8 e7 fa 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9fbe:	55                   	push   rbp
     10a9fbf:	41 57                	push   r15
     10a9fc1:	41 56                	push   r14
     10a9fc3:	41 55                	push   r13
     10a9fc5:	41 54                	push   r12
     10a9fc7:	53                   	push   rbx
     10a9fc8:	50                   	push   rax
     10a9fc9:	49 89 f6             	mov    r14,rsi
     10a9fcc:	48 89 fb             	mov    rbx,rdi
     10a9fcf:	e8 ca ff fd ff       	call   1089f9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513b4>

## Printable strings in +0x470 functions

### 0xa79ce6..0xa79d90

### 0xa7e773..0xa7f6a3
- COUNTRY
- CATALOGUE

### 0xa8ae88..0xa8c879
- available
- true
- availableOffline
- artist.isBanned
- false
- isBanned
- isExplicit
- isEpisode
- isRecommendation
- isUnplayed
- isInProgress
- isFullyPlayed
- isNotFullyPlayedOrInProgress
- isEpisodeTrailer
- isVideoContent
- local
- isPaywalled

### 0xa8c879..0xa8fc8b
- album.artist.name
- originalIndex
- trackNumber
- discNumber
- album.name
- artist.name
- name
- addTime
- addedByDisplayName
- addedBy
- length
- show.name
- publishDate
- providedSort

### 0xa962cf..0xa96d29
- name
- hasLyrics
- local
- available
- isEpisode
- isExplicit
- playable
- length
- discNumber
- trackNumber
- popularity
- album.name
- artist.name
- album.artist.name
- addTime
- addedBy
- addedByDisplayName
- originalIndex
- isBanned
- isPremiumOnly
- artist.isBanned
- availableOffline
- rowId

### 0xaa1418..0xaa6ad6
- com/spotify/core/corefullimpl/FullAuthenticatedScopeConfiguration
- audio/ad
- audio/audio
- audio/episode
- audio/episode+track
- audio/interruption
- audio/local
- audio/media
- audio/podcast-chapter
- audio/track
- audio/user-highlight
- video/ad
- video/episode
- video/podcast-chapter
- video/track
- video/user-highlight
- cachePath
- volatileCachePath
- settingsPath
- deviceName
- deviceModelName
- description
- descriptionShort
- deviceId
- supportedContentTypes
- [Ljava/lang/String;
- deduplicationId
- deviceType
- volumeSteps
- model
- brand
- canPlay
- enableRemoteSleepTimer
- disableDeviceIdObfuscation
- versionNumber
- versionName
- clientId
- nativeBundleId
- locale
- connectDiscoveryEnabled
- Failed to load class FullAuthenticatedScopeConfiguration
- com/spotify/offline/NativeOfflinePluginRegistry
- getEntries
- Failed to load class NativeOfflinePluginRegistry
- ()Ljava/util/List;
- size
- ()I
- get
- (I)Ljava/lang/Object;
- getSerializedPluginMetadata
- ()[B
- getTransport
- ()Lcom/spotify/esperanto/esperanto/Transport;
- Failed to create PluginRegistryV2 from NativeOfflinePluginRegistry instance
- core_full_authenticated_scope
- cold_startup
- greenbase
- Apple TV Remote Manager
- Apple TV pairing timeout
- primary.ldb
- core-greenbase
- database_stats_event_interval_secs
- unknown
- cpp-core-core_full_impl
- com/spotify/decipher/transport/DecipherSseTransport
- connect
- (JLjava/lang/String;[[Ljava/lang/String;)V
- disconnect
- ()V
- decipher
- Failed to register DecipherSseTransport native methods
- DecipherSseTransport class not found, SSE JNI bridge disabled
- DecipherSetupImpl initializing
- core-decipher-feature
- enable_decipher_commands
- true
- false
- Enabled=%s (QA_TESTING=%s, RC=%s)
- Command handling starting
- Command handling disabled
- Connection id=%s
- hm://decipher/v1/command
- sse/chat
- spotify.decipher.esperanto.proto.DecipherVintageService
- spotify.decipher.esperanto.proto.DecipherService
- spotify.authentication.token_exchange.proto.TokenExchangeService
- spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperService

### 0xac6a72..0xac8907
- com/spotify/connectivity/MobileDeviceInfo
- osVersion
- name
- model
- brand
- manufacturer
- apiLevel
- deviceType
- volumeSteps
- screenWidth
- screenHeight
- smallestScreenWidthDp
- screenDensityCurrent
- screenDensityStable
- cachePath
- installerName
- ro.build.version.sdk
- Failed to load class MobileDeviceInfo
- jqD2

### 0xac9d46..0xacbcbe
- com/spotify/connectivity/ApplicationScopeConfiguration
- clientId
- cachePath
- deviceId
- deviceHardwareModel
- clientRevision
- clientVersionLong
- accesspointLanguage
- enableIPv6
- enableOldNetworkImplementation
- reconnectPolicy
- includePayloads
- protocolOsOverride
- Failed to load class ApplicationScopeConfiguration
- protocolPlatformOverride
- protocolProductOverride
- defaultHTTPUserAgent
- enablePerformanceTracing
- encryptedPersistedClientToken
- enableClientToken
- appNativeLogin5SetupLifecycle
- appNativeAccountsSetupLifecycle
- enableRequestBucketCollection
- requestBucketingInterval
- enableTrafficStatsCollection
- enableConnectionQualityReport
- connectionQualityMaxTimerErrorMs
- connectionQualityPoorLatencyThresholdMs
- connectionQualityMinP90SampleCount
- connectionQualityPoorTimeoutCount
- connectionQualityMaxConcurrentLatencyBypass
- debounceGoodToPoorThreshold
- debouncePoorToGoodThreshold
- debounceUnknownToPoorThreshold
- debounceUnknownToGoodThreshold
- speedTestUrlVariant
- speedTestSampleRatePercent
- useSharedReachability
- disableDecoratorScheduling
- decoratorZeroHop
- Failed finding field 'appNativeLogin5SetupLifecycle'
- Failed finding field 'appNativeAccountsSetupLifecycle'

### 0xad1a74..0xad5057
- pipe creation failed
- cpp-connectivity-application_scope_impl
- decorator_zero_hop
- true
- disable_decorator_scheduling
- hosts.bnk
- bucket_accumulator
- thread constructor failed

### 0xb67984..0xb67ee7

### 0xb7513c..0xb75723
- fingerprint_search
- unknown

### 0xbc2c06..0xbc2cdf

### 0xbc4a06..0xbc4a7b

### 0xbd9b4a..0xbdc4b7
- space
- R2Stretcher::R2Stretcher: rate, options
- R2Stretcher::R2Stretcher: initial time ratio and pitch scale
- R3Stretcher: WARNING: Unsupported sample rate
- R3Stretcher: Minimum rate is
- R3Stretcher: Maximum rate is
- Guide: rate and single-window mode
- Guide: sample rate is too low to work well
- Guide: rounding up classification FFT size from and to
- Guide: classification FFT size
- R3Stretcher::R3Stretcher: rate, options
- R3Stretcher::R3Stretcher: initial time ratio and pitch scale
- R3Stretcher::R3Stretcher: offline mode
- R3Stretcher::R3Stretcher: real-time mode
- R3Stretcher::R3Stretcher: intermediate shorter-window mode requested
- /proc/cpuinfo
- processor
- Going multithreaded...
- Internal error: invalid alignment

### 0xc0d5c2..0xc0deb3

### 0xc18d4e..0xc19c28
- data.collection.artist_view
- trigger
- query_albums
- error
- CollectionGetArtistRequest: Failed to create iterator
- decorate_and_reply
- album_count
- track_count
- deduplicated
- success

### 0xc5391a..0xc571cb
- core-prefetch-feature
- prefetch_head_file_new_strategy_enabled
- prefetch_head_file_window_max
- prefetch_allow_all_keys_experiment
- media_prefetcher_enabled
- media_prefetcher_default_feature_window_size
- media_prefetcher_max_num_parallel_downloads
- media_prefetcher_default_feature_max_parallel_downloads
- media_prefetcher_feature_ads_window_size
- Default
- Enabled
- Disabled
- media_prefetcher_feature_ads_progressive_files_enabled
- media_prefetcher_feature_ads_segmented_files_enabled
- media_prefetcher_feature_home_feed_window_size
- media_prefetcher_feature_home_feed_progressive_files_enabled
- media_prefetcher_feature_home_feed_segmented_files_enabled
- media_prefetcher_feature_home_feed_video_key_prefetch_enabled
- None
- InitOnly
- InitAndMedia
- media_prefetcher_feature_home_feed_segment_prefetch_mode
- media_prefetcher_feature_home_feed_segment_prefetch_max_duration
- media_prefetcher_feature_watch_feed_window_size
- media_prefetcher_feature_watch_feed_progressive_files_enabled
- media_prefetcher_feature_watch_feed_segmented_files_enabled
- media_prefetcher_feature_watch_feed_video_key_prefetch_enabled
- media_prefetcher_feature_npv_manifests_window_size
- media_prefetcher_feature_npv_manifests_max_parallel_downloads
- media_prefetcher_feature_npv_manifests_video_key_prefetch_enabled
- media_prefetcher_feature_context_player_future_window_size
- media_prefetcher_feature_context_player_future_max_parallel_downloads
- media_prefetcher_feature_context_player_future_segment_prefetch_mode
- media_prefetcher_feature_predictive_window_size
- media_prefetcher_feature_predictive_segment_prefetch_mode
- media_prefetcher_cache_error_disable_seconds
- media_prefetcher_stop_obsolete_downloads
- media_prefetcher_progressive_files_enabled
- media_prefetcher_segmented_files_enabled
- media_prefetcher_video_key_prefetch_enabled
- media_prefetcher_segment_prefetch_mode
- media_prefetcher_segment_prefetch_max_duration
- media_prefetcher_key_request_timeout_seconds
- media_prefetcher_segment_prefetch_max_video_height
- media_prefetcher_segment_prefetch_short_form_cutoff_seconds
- media_prefetcher_segment_prefetch_key_with_base_url_path
- sliding_window_prefetch_associated_videos_enabled
- sliding_window_prefetch_both_associated_media_enabled
- sliding_window_segmented_video_prefetching_enabled
- sliding_window_rate_limiter_max_size_minutes
- sliding_window_rate_limiter_max_size_megabytes
- media_prefetcher_rate_limit_refill_rate_kbytes
- media_prefetcher_rate_limit_max_burst_kbytes
- ads
- home_feed
- watch-feed
- npv-manifests
- predictive
- context_player_future
- unknown
- audio.play_bitrate_enumeration
- audio.play_bitrate_non_metered_enumeration
- audio.car_mode

### 0xc6c08a..0xc6e081
- core-storage
- expiry_music
- expiry_unread_music
- expiry_unlock_grace_music
- expiry_head_files
- expiry_unread_head_files
- expiry_video_manifest
- -- FAILED TO CREATE DISK BASED STORAGE - AUDIO CACHING WILL NOT WORK --
- Storage cache cleaner thread
- unknown
- startup
- &storage-size-config
- storage.size
- storage.

### 0xcb7a20..0xcbc937
- core-audio-track-player-feature
- driver_buffer_target_duration
- max_prebuffer_duration_setting_when_stuttering
- decompress_loop_wall_clock_budget_ms
- Oboe
- AVFoundation
- AudioUnit2Renderer
- CoreAudioRenderer
- Pipewire
- PulseAudio
- Unspecified
- audio_driver_name
- audio_renderer_buffer_request_size_ms
- api_renderer
- com/spotify/playbacknative/AudioDriver
- sUsingOboe
- Could not find class AudioDriver
- Could not find field sUsingOboe
- Audio Driver Thread
- core-audio-effects
- echo_high_pass_cutoff_hz
- delay_high_pass_cutoff_hz
- reverb_high_pass_cutoff_hz
- echo_equal_power_mix
- delay_equal_power_mix
- reverb_equal_power_mix
- reverb_output_gain_pct
- noise_effect_gain_pct
- jogwheel_buffer_size_ms
- stop_processing_at_end_of_stream
- Always
- MediaPlayerOnly
- Never
- core-audio-track-player
- send_wasapi_audio_driver_info
- wasapi_sync_app_session_volume_to_spt_volume_slider
- wasapi_endpoint_volume_control
- send_wasapi_audio_driver_format_error
- wasapi_thread_characteristics
- ProAudio
- None
- Audio
- Playback
- wasapi_thread_priority
- Critical
- Normal
- High
- audio_driver_with_audio_renderer_processing_interval
- pulse_audio_tlength
- pulse_audio_minreq
- oboe_callback_buffer_size_ms
- oboe_legacy_close_delay_ms
- oboe_underrun_check_mode
- ControlScheduler
- DataCallback
- ignore_underruns_after_track_end_for_ms
- audio_driver_pause_fade_time_ms
- audio_driver_flush_fade_time_ms
- use_driver_on_process_callback
- audio_mixer_use_audio_thread_processing
- media_player_log_boombox_timeline_contents
- strict_timeline_event_ordering
- cache_resolved_timepoints
- serialize_position_observer
- what_read_data_is_allowed_to_do_while_renderer_shuts_down
- Everything
- Nothing
- ReadSnapshot
- HandleRebuffering
- MixAudio
- core-bitrate
- net_fortune_use_playback_stats
- bitrate_downgrade
- DownloadBitrate
- AudioBufferSize
- bitrate_downgrade_target_bitrate
- bitrate_downgrade_non_lossless
- darkload_dowgrading
- send_midtrack_downgrade_event
- consecutive_low_buffer_count
- critical_buffer_threshold_for_bitrate_downgrade
- min_buffer_for_buffer_monitoring_to_start
- buffer_moving_average_window_size
- max_buffer_depletion_rate
- bitrate_downshift_advice_wait_for_key
- bitrate_downshift_prediction
- downshift_wait_for_initial_buffering_completed
- downshift_detailed_logs
- handle_track_deferred_close_after_stream_resumption
- track_deferred_close_after_stream_resumption_max_threshold
- rcheck_fail_on_stream_reporting_pending_event_errors
- audio.normalize_v2
- audio.loudness.environment

### 0xcccca6..0xccef9d
- playback_latency
- playback_id
- playback_platform.generated_audio
- playback_platform.context_id
- %s metadata not found in cache
- _playback_track.track(): 
- Trying to play nullptr track

### 0xcd7752..0xcd9380
- gain
- filter cutoff
- filter resonance
- phaser mix
- phaser rate
- phaser depth
- eq low gain
- eq mid gain
- eq high gain
- bitcrusher downsample
- bitcrusher bit depth
- bitcrusher dither
- delay dry wet
- delay time
- delay frequency band
- roll time
- noise color
- vinyl stop duration
- vinyl stop exponent
- jogwheel offset
- echo send level
- echo dry wet
- echo delay time
- echo feedback
- echo frequency band
- reverb send level
- reverb dry wet
- reverb room size
- reverb decay time
- reverb damping
- reverb brightness
- reverb frequency band

### 0xce8ef6..0xcea164
- unknown
- local
-  page_instance_id
- *sequence_provider_ids

### 0xcea164..0xceabe2
- unknown
- local
-  page_instance_id
- *sequence_provider_ids

### 0xd077d6..0xd090fa
- local-files:
- core-local-files-feature
- with_android_media_store_source
- enable_android_media_store_error_logging
- migrate_ios_local_sync_v2
- migrate_android_local_sync_v2
- Local Sync Migration
- unknown
- migrate-local-sync: FEATURE NOT ENABLED

### 0xd1658e..0xd168b4

### 0xd6aa99..0xd6f087
- data.offline.startup
- load_key_stores
- unknown
- Not all tracks cached
- load_offline_state
- unknown_offlined_link:
- Failed to parse offline lists file.
- load_error
- initial-update
- startup-report
- success

### 0xd70640..0xd70744

### 0xd70fde..0xd71310
- Old offline link %s pruned: then: %s, now: %s, age: %lld (%lld) hours
- %s,%s,%s
- link-pruned
- update-all-batch-restarted-link-pruned
- unknown

### 0xd71884..0xd723ed
- Pruning unused resources
- unknown
- Nothing to prune
- keys-pruned
- Offline manager prune stats:
-   %3d files locked in storage
-   %3d files unlocked in storage
-   %3d track keys in store
-   %3d episode keys in store
-   %3d abp chapter keys in store
-   %3d track keys removed
-   %3d track keys moved to cache
-   %3d episode keys removed
-   %3d episode keys moved to cache
-   %3d abp chapter keys removed
-   %3d abp chapter keys moved to cache
-   %3d keys removed from cache 
-   %3d keys left in cache

### 0xd73652..0xd73887

### 0xd78540..0xd7994b
- track %s invalid (%d) when logging report: %s
- %s,%llu
- == Offline Report ==
- change_reason: %s
- num_downloaded_tracks: %lld
- total_num_tracks: %lld
- num_downloaded_episodes: %lld
- total_num_episodes: %lld
- track_limit: %lld
- track_expiry: %lld
- episode_limit: %lld
- episode_expiry: %lld
- offline_keys: %lld
- cached_keys: %lld
- total_num_links: %lld
- controller: %s, num_links: %lld
- link: %s, num_tracks: %lld
- schedule_stats_map: '%s': %llu
- update_stats_map: '%s': %llu
- num_update_all_lists: %lld
- ====================
- track %s metadata not complete when logging report: %s
- track %s metadata not identified when logging report: %s

### 0xd7994c..0xd7a534
- unknown
- Offline error: failed to save key store
- Offline error: failed to save episode key store
- Offline error: failed to save abp chapter key store
- Offline error: failed to save media key store
- unknown_offlined_link:

### 0xd7a534..0xd7a630
- license-expired

### 0xd7e33e..0xd7eb7e
- invalidated
- unknown
- clear-all-synced-tracks

### 0xd7eefa..0xd7ef42

### 0xd8170c..0xd81808

### 0xd81b9a..0xd81d21

### 0xd82046..0xd821e3

### 0xd8b73e..0xd8b973

### 0xdb0c12..0xdb2528
- unknown
- FileStreamer file average bitrate: %d
- FileStreamer downgrade bandwidth factor: %f

### 0xdb6b30..0xdb6c4c

### 0xdbbdbc..0xdbcc85
- .spotify.com
- .spotify.net
- traffic.megaphone.fm
- Accept-Encoding
- Cache-Control
- no-cache, no-store
- https://
- x-playback-id
- x-segment-timestamp-ms
- Requesting whole file
- \nbytes
- Range
- Requesting data (%d -> %d)
- unknown

### 0xdf78ee..0xdf9239

### 0xe0c8c6..0xe0c8d4

### 0xe105b4..0xe107a9
- local_device

### 0xe11e8c..0xe12505
- spotify:media:
- audio/episode+track
- $parent_episode.uri
- audio
- episode
- mixed
- podcast-chapter
- clip
- /agnostic
- track
- interruption
- media
- local

### 0xe12b18..0xe12b51

### 0xe12b52..0xe12b64

### 0xe1492e..0xe14940

### 0xe3097c..0xe309a0

### 0xe34334..0xe34482
- unknown
- connect
- setVolume: %d (%s initiated)

### 0xe34934..0xe34a57
- connect
- Triggering setvolume of %d from timer
- Ignoring delayed volume command because active device changed

### 0xe40bea..0xe41391
- startup
- _spotify-connect._tcp.local

### 0xe62518..0xe62d4f
- Built-in
- Speaker
- Receiver
- Aggregate
- AutoAggregate
- Virtual
- Unknown
- Headphones
- Headset
- PCI
- USB
- FireWire
- HDMI
- DisplayPort
- AVB
- Thunderbolt
- LineOut
- Wired
- HDMIOutput
- USBAudio
- Bluetooth
- BluetoothA2DPOutput
- BluetoothHFP
- BluetoothLE
- AirPlay
- CarProjected
- Automotive
- CarAudio
- Unmapped audio output connection type '%*s'

### 0xe649a9..0xe649d3

### 0xe65cde..0xe65d03

### 0xe65d03..0xe65d94
- spotify:
- unknown
- none

### 0xe65db0..0xe65dcb

### 0xe65e9e..0xe65eb5

### 0xe65f44..0xe66088

### 0xe8c65c..0xe8e898
- core-player-feature
- enable_played_state_rules
- core-player
- enable_segment_rules
- chapters
- all_items
- all_items_and_tracks
- speed_content_experience_rules_mode
- Baseline
- Pet
- Cet
- speed_signal
- disable_context_mdata_rules
- segment
- pointer_playback
- segment_playback/chapter_speed_gating
- cpp-player-player_setup_imp
- list_player_play_request
- list_player_queue_operations

### 0xe92f2c..0xe98f3b
- audio
- mixed
- video
- \naudio
- \nvideo
- \nmixed
- core-player
- enable_queue_expiration
- queue_expiration_time_in_seconds
- enable_global_play_history
- enable_music_video_with_mft_improvements
- pick_and_shuffle_timecap
- enable_pick_and_shuffle_dynamic_cap
- pick_and_shuffle_dynamic_cap_pre_banked
- enable_pick_and_shuffle_remote_cap_parameters
- enable_player_timekeeper_logging
- enable_pick_and_shuffle_common_capping
- Enabled
- Disabled
- ReportingOnly
- md_generic
- enable_smart_skip_ad_detection
- enable_smart_skip_content_markers
- audio_passthrough_identification_mode
- All
- Off
- Segments
- TrackInfoBasicMetadataCache_prune
- unknown
- md_basic
- automix_mode_for_user_playlists
- RadioAirbag
- None
- enable_reshuffle_signal
- stop_episodes_playback_on_error
- new_shuffle_session_behavior
- disable_context_repeat_on_context_change
- disable_repeat_on_context_change_for_search_tracks
- enable_keeping_playback_session_on_transfer
- enable_standalone_seek_capping
- enable_do_not_publish_trackless_intermediate_states
- time_keeper_span_duration_threshold_microseconds
- Default
- Regular
- Airbag
- _wall_time_provider: 
- _timer: 

### 0xec7114..0xec716f

### 0xecb734..0xecb758

### 0xef3d64..0xef3fd9
- "narration/welcome
-  is_advertisement
-  narration/intro2

### 0xef4103..0xef4ca1
- true
- 1.0
- "narration/welcome
- $audio.fade_gapless
- \ntitle
- "album_artist_name
-  image_xlarge_url
- (agentic_product_type
- https://i.scdn.co/image/ab67616d00001e020113cefcb7c44b6578267178
- https://i.scdn.co/image/ab67616d000048510113cefcb7c44b6578267178
- https://i.scdn.co/image/ab67616d0000b2730113cefcb7c44b6578267178
- "has_ephemeral_uri
- ,narration.tts_provider
- *narration.sample_rate
- ,narration.audio_format
- $narration.loudness
- &narration.true_peak
- client-tts/v1/fulfill

### 0xef54be..0xef567c

### 0xef91cc..0xefe62b
- spotify.player.proto.GlobalNode
- context
- spotify.player.proto.ContextNode
- SequencePlayerNode
- spotify.player.proto.SequencePlayerNode
- spotify.player.proto.RouteSwitcherNode
- autoplay
- spotify.player.proto.AutoplayNode
- PlayQueueNode
- queue
- SegmentSwitchNode
- segment_switch
- spotify.player.proto.SegmentSwitchNode
- music_video_inner
- MusicVideoNode
- music_video_associations
- spotify.player.proto.MusicVideoNode
- music_video_outer

### 0xf09ba2..0xf09d96

### 0xf09d96..0xf0a6d7
- (media.start_position
- provider
- $context_page_index
- &context_track_index

### 0xf197e6..0xf198ea

### 0xf1b834..0xf1b9d9
- *smart-shuffle-signals
- \nminus

### 0xf1b9da..0xf1bd5c

### 0xf1bd5c..0xf1c0d6

### 0xf1c0d6..0xf1c69b
- \nminus

### 0xf1c75a..0xf1c925

### 0xf1efa2..0xf1f1bb
- /track
- /album
- /artist

### 0xf46036..0xf461e0

### 0xf4bafe..0xf4c24f
- stable

### 0xf8c22c..0xf8c5b1

### 0xfc5e06..0xfc5fba

### 0xfe0a6a..0xfe0f30

### 0xff7b1e..0xff7bdd

### 0xffc99e..0xffcfcd
- (media.start_position
- $parent_playback_id

### 0xffeb88..0xffebf3

### 0x10409b6..0x1040cd6
- segment_playback/chapter_speed_gating

### 0x1040cd6..0x1040ed3

### 0x10431ac..0x10437c5
- 1.0
- true
- &trait_speed_control

### 0x1044792..0x10455e3
- ListPlayerStateRestoreConverter: failed to parse state blob
- ListPlayerStateRestoreConverter: empty context URI
- player.arch
- play_context_decision_id
- &context_enhancement
- ListPlayer fallback: restoring playback from List Player persisted state
- ListPlayer fallback: no convertible state available
- autoplay
- autoplay_video
- clearPersistentAutoplayLens: commit failed: %s

### 0x105a2d2..0x105af25
- type
- start
- seek_to
- end_position
- *reporting.context_uri
- track
- entity_uri
- context_uri
- play_origin
- playback_id
- null
- future
- player_options
- shuffling_context
- repeating_context
- repeating_track
- playback_speed
- modes
- initially_paused
- client_offline
- system_initiated
- start_reason
- logging_params
- command_initiated_time
- command_received_time
- system_initiated_time
- timekeeper_builder
- session_id

### 0x105b4cb..0x105b5df
- false

### 0x105b772..0x105b92f
- &audio.episode.speed
- \nvideo

### 0x105baba..0x105bad0

### 0x105c7e6..0x105c81e

### 0x107a02c..0x107e484
- PlatformDefault
- ForceDisable
- core-playlist-feature
- playlist_cache_mode
- ginfo
- cinfo
- slc
- members
- changes
- add
- permissions
- attr
- Disabled
- Error
- Info
- Verbose
- playlist_sync_events_logging_level
- enable_backend_multiget
- canonical_artist_music_videos_path
- cpp-playlist_setup_impl
- None
- DownloadedLists
- AllCachedLists
- AllLists
- log_level_for_list_loading_issues
- allow_invalidating_revisions
- append_auto_lens
- use_visual_identity_trait_for_episodes
- use_visual_identity_trait_in_pl_mosaic
- use_all_distribution_traits_for_offline
- skip_prefetch_when_in_flight
- list_metadata_prefetcher_max_entries_per_iteration
- list_metadata_prefetcher_catchup_max_entries_per_iteration
- list_metadata_prefetcher_catchup_queue_threshold
- move_prefetcher_cache_peeks_to_background_worker
- list_metadata_prefetcher_mode
- llc
- unknown
- ForceEnable
- weak_rootlist_playlist_refs_mode
- proactive_playlist_sync_mode
- track_client_online_state

### 0x108eacc..0x108eb99

### 0x109917a..0x1099d71
- cpp-recently_played-recently_played_setup_impl
- recently_played

### 0x10a2082..0x10a2130

### 0x10a6464..0x10a7f52
- mft_disallow
- mft_plus_disallow
- no_prev_track
- not_playing_context
- already_paused
- not_paused
- show
- autoplay
- episode
- ad_disallow
- narration
- automix
- audiobook_capping
- not_supported_by_content_type
- local-list
- spotify:search
- spotify:search:
- local_list
- already_set
- restrictions_handler
- switch-to-video
- unknown
- disallowed_by_account_manager
- disallowed_by_user_setting

### 0x10a9668..0x10a969c

### 0x10bfd22..0x10bfd35

### 0x10d0e58..0x10d4cf6
- core-resumption
- backend_sync_interval
- backend_timer_event_sync_interval
- backend_sync_page_size
- backend_list_resume_point_revisions_sync_page_size
- periodic_update_interval
- enable_explicit_seek
- pubsub_triggered_sync_interval
- backend_batch_create_size
- backend_max_invalid_argument_events
- enable_synced_from_events
- max_revision_synced_from_events
- enable_synced_to_events
- enable_revisions_stored_events
- revisions_stored_events_sample_rate
- enable_play_history
- enable_linear_list_resumption
- enable_shuffle_list_resumption
- enable_list_progress
- enable_podcast_chapter
- enable_podcast_highlight
- enable_podcast_clip
- enable_tombstone_feature
- tombstone_days_to_live
- clean_expired_revisions_cooldown_period_minutes
- resumption_startup_timekeeper_sample_rate
- list_resume_position_ttl_hours
- list_resume_position_expiry_threshold_seconds
- list_resume_point_ttl_hours
- list_resume_skip_local_files
- list_use_greenbase_directly
- greenbase_direct_read_fill_cache
- enable_trait_resolution_failure_events
- trait_resolution_failure_events_sample_rate
- greenbase_direct_read_telemetry_enabled
- audiobook_enable_smart_resumption
- audiobook_min_resume_point_age_seconds
- audiobook_event_sample_rate_ppm
- audiobook_show_resumption_notification
- audiobook_boundaries_back_count
- audiobook_min_duration_back_ms
- audiobook_fixed_duration_back_ms
- use_millisecond_resume_precision
- Baseline
- ChapteredContent
- resumption_signal
- Disabled
- FetchOnly
- Enabled
- core-segment-playback
- chaptered_content_signal
- sync_track_resume_points
- enable_resumption_timekeeper
- 407d482703b9480899f54656c3ed7728
- _revisions_stored_events
- resumption_startup
- ResumePointsManager::cacheMetrics
- hm://herodotus/uri/
- hm://herodotus/batch

### 0x10f9518..0x10f9559

### 0x10f955a..0x10f972f
- (is_audiobook_chapter
- $is_audiobook_recap
- true
- (pointer.resume_point
- (media.start_position

### 0x111209a..0x111362a
- Failed to load Audiobook episode list with status_code 
- Duplicate audiobook chapter uri: %s
- fallback_
- cur_chapter
- Unexpected trailing input

### 0x113996a..0x113a034
- show_context_loader

### 0x113a7c4..0x113a823

### 0x1145c8a..0x1146a50

### 0x1161682..0x11648bf
- data.your_library.get_all
- is_streaming
- sort_order
- provider_count
- trigger
- is_folder
- init_providers
- init_error
- Failed to open database: 
- db_error
- available_filters
- setup_primary
- Curated items must contain at least one item if set
- error
- reply
- success
- query_and_merge
- lib
- mer
- alc
- cat
- The requested filter is not valid for the selected providers.
- empty_iterators

### 0x116a606..0x116d6fc
- data.also_available_offline.populate
- outcome
- incomplete
- opc_num_tracks
- opc_missing_metadata
- opc_missing_files
- opc_missing_keys
- opc_missing_in_audio_index
- select_candidates
- AAO: collected %zu offline tracks from %zu artists
- spotify:offline-backup
- offline-playable-artist
- AAO: %zu unique tracks, %zu suggestions selected (%d artists, %d playlists, %d albums)
- unique_tracks_total
- artists_below_threshold
- playlists_below_threshold
- albums_below_threshold
- populate_entities
- reply
- rescheduled
- success
- num_suggestions
- num_offline_artists
- num_cached_playlists
- num_cached_albums

### 0x11af6de..0x11b20f2
- _pd
- _auTy
- Pair-Verify-Encrypt-Salt
- Pair-Verify-Encrypt-Info
- failed to connect to device
- pair verification failed
- _systemInfo
- _bf
- _cf
- _clFl
- _idsID
- _pubID
- _sf
- _sv
- 170.18
- model
- Spotify
- name
- _sessionStart
- _srvT
- com.apple.tvremoteservices
- _sid
- TVRCSessionStart
- ProtocolVersionKey
- 1.2
- session start failed
- PV-Msg02
- PV-Msg03
- ClientEncrypt-main
- ServerEncrypt-main

### 0x11ca706..0x11cd602
- [CMR] streamer created: network=%d, country=%s

### 0x11d4aba..0x11d4ea4
- unknown

### 0x11ef334..0x11f5af4
- list_player_rec_pool
- core-list-player-mft
- mft_recs_max_tracks_per_request
- mft_recs_max_artists_per_request
- mft_recs_max_albums_per_request
- mft_recs_request_length
- mft_recs_max_rec_pool_size
- mft_recs_save_timeout_ms
- mft_recs_max_error_backoff_s
- list_player_playback_settings
- audio.
- playback_generic
- list_player_play_history
- list_player_play_request_id
- list_player_mft_state
- list_player_mft_resumption
- list_player.live_playhead
- autoplay
- list_player_play_request
- context_player_state_restore
- unknown

### 0x11f8ada..0x11f8b44

### 0x120f7a1..0x120f98f
- requested_uri

### 0x12286bc..0x12291d6
- Expected media type to be either audio or video

### 0x122acda..0x122adf6

### 0x122ba2e..0x122c594

### 0x122e1da..0x1230a86

### 0x1235556..0x1239d28

### 0x123c81c..0x1240fd8
- unknown

### 0x1244558..0x1244ad3

### 0x1263214..0x12658e5
- context_enhancement
- RECOMMENDATION
- (autoplay.is_autoplay
- true
- context
- autoplay
-  page_instance_id

### 0x1298d86..0x129a87b

### 0x12ad5f6..0x12ade18
- unknown

### 0x12b236e..0x12b28ba
- spotify:quickstart:
- context://

### 0x12c186c..0x12c2351
- No operation [add/remove] specified
- add
- remove
- Playlist could not be loaded
- Forbidden: User does not have permission to read this playlist
- Unsupported operation: 
- Couldn't create playlist from link '%s'
- Playlist is unavailable for legal reasons

### 0x12cb106..0x12cbc74

### 0x12ccf68..0x12cd22e

### 0x12cd240..0x12cf4c0
- Playlist could not be loaded
- Forbidden: User does not have permission to read this playlist
- Playlist is unavailable for legal reasons
- unknown
- playlist

### 0x12f072f..0x12f0afb
- switch_liked_songs_url_dynamically
- liked_songs_collection_uri
- ignore_enhance_lens
- true
- context-page://
- ?start=

### 0x12feb98..0x12ff8c1
- ,automix.mode_on_tracks
- true
- ,automix.ignore_setting
- *automix.fade_out_mode
- (automix.fade_in_mode
- automix.transition_uri

### 0x130e394..0x130e98c

### 0x1326734..0x1328d02
- rowId
- addTime
- originalIndex
- addedBy
- name
- artist.name
- album.name
- album.artist.name
- hasLyrics
- local
- availableOffline
- available
- playable
- discNumber
- trackNumber
- length
- popularity
- isPremiumOnly
- availabilityFlags
- isEpisode
- text
- isExplicit
-  isRecommendation
-  isEpisodeTrailer
- $addedByDisplayName

### 0x1336efa..0x133771c
- unknown

### 0x133e9da..0x133ea42

### 0x133ea42..0x133eaed

### 0x133fd98..0x13404d1

### 0x135a74c..0x135c1fa
- core-podcast-ads-feature
- podcast_preroll_ad_playback_blocking_duration
- metadata_blocking_duration
- enable_sai_metadata_received_event
- disable_ads_for_audiobook_chapters
- skip_cspr_preroll_stop_position
- cpp-ads-podcast_ads_setup_impl
- core-podcast-ads
- use_legacy_segment_provider_on_cache_miss
- fetch_delay_after_ad_break
- send_podcast_sai_loop_event
- Seekable
- Skippable
- playback_controls
- podcast_segments_use_metadata_extension
- podcast_adt_enabled
- check_cspr_before_segment_select
- podcast_ad

### 0x135c31a..0x135c538

### 0x1361eb4..0x13626e6

### 0x13695b6..0x1369cef
- ConductorImpl.playClip
- ==> adding clip %p for uid %s, anchored to %s

### 0x136efea..0x136f65c
- play
- ConductorImpl::play
- ConductorImpl.play
- onLogicalTimelinePreparing
- user_play
- system_play

### 0x137587e..0x13765b4
- onListItemStarted
- onClipStarted
- found: 

### 0x13ac372..0x13adc94
- false
- true
- AudioStreamer throttling enabled:
-   - Bandwidth limit: %.2f Mbps
-   - Max data bytes: %zu
-   - Min delay: %lld ms
-   - Max delay: %lld ms
-   - Jitter: %.1f%%
-   - Chunk split size: %zu
- snd
- AudioStreamer: did not find file to play.
- unknown

### 0x13b3b70..0x13b4ce3
- unknown
- Audio format set
- Passing key check using wait_for_key=%i, key_received=%i
- false
- true
- End posted state changed to %s
- Total buffered frames: %lld (compressed=%lld, in decompressor=%lld, in sink=%lld)
- Passed monitoring started threshold (total buffered frames=%lld)
- Passed ever completed initial buffering check (total buffered frames=%lld)
- critical buffer threshold reached
- Total buffered frames is non-positive: %lld
- snd
- Abort sharelink resolving since creator position %lld is out of range of the file, clamped position %lld
- Starting convertToUserTimestamp creator timestamp %lld ms
- consecutive low buffer count exceeded
- !_ad_detection_life_time: 
- Error requesting a user timestamp when already having a request in progress

### 0x13b82ee..0x13b891e
- ms_latency_tmp_evaluation_use_only
- playback_latency
- !_position_subscription_timer.isScheduled(): 
- snd

### 0x13bbbc2..0x13bc0d5
- AudioDecompressorProcess

### 0x13bc76c..0x13bc805

### 0x13bd354..0x13bd65d
- snd
- playbackError: %s (%d)
- === AudioSourceBuffers info ===
- offset  | data (hex)                                    | data (ascii)
- -------------------------------------------------------------------------
- %02x 
-    
- %08zx 
- Consumable buffer: e: %d, d: %d
- Has dk: %d
- ===============================

### 0x13bd65e..0x13be0db
- snd
- Opening sink for playback.
- unknown
-     codec: %s
-     bitrate: %d bits/s
-     sample rate: %d Hz
- 32-bit-float-pcm
- 16-bit-pcm
-     sample format: %s
-     duration: %s ms
- Decode Error %s (%d)

### 0x140ab48..0x140cff6
- time
- roll
- offset
- jogwheel
- duration
- exponent
- vinyl_stop
- dry_wet
- delay_time
- frequency_band
- delay
- noise_color
- noise
- low_gain
- mid_gain
- high_gain
- equalizer
- cutoff
- resonance
- filter
- downsample
- bit_depth
- dither
- Overlapping points are not allowed
- bitcrusher
- mix
- rate
- depth
- phaser
- gain
- feedback
- send_level
- echo
- room_size
- decay_time
- damping
- brightness
- reverb

### 0x141a788..0x141b53b

### 0x143f86e..0x143fbb9
- unknown

### 0x1441ff6..0x144252f

### 0x1442fd2..0x1443e3e
- none
- timeline_reporter: onClipPreparing: %s, current: %s
- onClipPreparing
- success: 
- Failed to create ListItemReporter
- listItemPreparing
- contentClipPreparing
- false: 
- clipPreparing received on an uninitialised list item
- clipPreparing
- _state == ListItemState::kListItemPreparing || _state == ListItemState::kStarted: 
- narration clipPreparing in unexpected state 
- _content_stream_reporter: 
- Content stream reporter expected
- clipPreparing received on an already-ended list item
- unknown
- inserted: 
- Narration reporter already exists for this playback_id
- _state == ListItemState::kUninitialized: 
- listItemPreparing should always come on an Uninitialised state
- !_content_stream_reporter: 
- Content already active

### 0x14462dc..0x1446ffc

### 0x14662e6..0x14663ce

### 0x146a282..0x146a6b3
- $parent_episode.uri
- ad_injection_seek
- &media.stop_position

### 0x146b635..0x146b6ae

### 0x14740f4..0x147584c

### 0x1483002..0x1483c35

### 0x149daaa..0x14a06f6

### 0x14b91f2..0x14ba12f
- mft/core

### 0x14c431d..0x14c5124
- \nqueue
- /increase_recs
- /fallback
- *mft.unplayable.policy
- enhanced_recommendation
- /removed
- /future
- (mft.injection_source
- (mft.injection_reason
- /replaced

### 0x14c97b0..0x14c9945

### 0x14fbfd2..0x14fcdad
- request_id
- context
- session
- ad_break_id
- position_in_ad_break
- real_time
- played_duration_seconds
- max_length_seconds
- max_ads
- Content-Encoding

### 0x14fcdae..0x14fe236
- request_id
- context
- session
- changed
- value
- targeting
- client_time
- last_update_client_time
- local_time
- user_agent
- session_id
- ad_break_id
- position_in_ad_break
- real_time
- played_duration_seconds
- max_length_seconds
- max_ads
- Content-Encoding

### 0x15182d6..0x1519a71
- start
- field_value_error
- playback_stack_mismatch
- Calling StreamStartV2Request Handle with invalid StreamHandle.

### 0x151f0d6..0x15219ce
- config_param:rcs_copy_mode_enabled
- rc_flag:enable_stream_reporting_rcs_copy
- type
- premium
- false: 
- Duplicated StreamHandle.

### 0x15229bc..0x1523550

### 0x15246f2..0x1524868

### 0x153e688..0x1544b13
- audio.automix_mode
- auto
- ,audio.fade_in_duration
- (audio.fade_in_curves
- *audio.fade_out_curves
- $audio.fade_overlap
- (audio.fade_downbeats
- $audio.fade_gapless
- ,audio.speed_automation
- from_position
- speed
- $audio.pitch_factor
- ds-kick
- ds-snare
- ds-closed-hihat
- ds-open-hihat
- ds-lo-tom
- ds-hi-tom
- cowbell
- airhorn
- offset
- duration
- gain
- pan
- ds-clap
- ds-crash

### 0x155b9b5..0x155be12

### 0x1596e2c..0x159755a

### 0x159765c..0x1597999

### 0x15c93f0..0x15c9e20
- collection

### 0x15c9e9a..0x15cab0b
- Prerelease missing artist info
- Album missing artist info
- collection

### 0x15d5de4..0x15d5e8e

### 0x15f1cb0..0x15f2493
- default
- User-Agent

### 0x1630070..0x1632440
- metadata
- unknown

### 0x167aa72..0x167aa97

### 0x17dfd00..0x17e673e
- %dx%d. Bilat:%.0f Bilat2:%.0f(%.0f%%) Err:%f Canny:%.0f Dilate:%.0f FindCont:%.0f ScanTag:%.0f Warp:%.0f Circ:%.0f/%.0f

