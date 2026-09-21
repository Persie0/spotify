# Ad runtime readiness delegate

Known: runtime AP 0x1879950 +0x140 -> 0x125bd98 -> [runtime+0x18] virtual +0x40.

## Runtime constructor 0x14e15e4

/tmp/addelegate/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000014e15e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x326b68>:
 14e15e4:	55                   	push   rbp
 14e15e5:	41 57                	push   r15
 14e15e7:	41 56                	push   r14
 14e15e9:	53                   	push   rbx
 14e15ea:	48 83 ec 48          	sub    rsp,0x48
 14e15ee:	48 89 fb             	mov    rbx,rdi
 14e15f1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14e15f8:	00 00 
 14e15fa:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 14e15ff:	48 8d 05 4a 83 39 00 	lea    rax,[rip+0x39834a]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
 14e1606:	48 89 07             	mov    QWORD PTR [rdi],rax
 14e1609:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 14e160d:	48 89 f7             	mov    rdi,rsi
 14e1610:	e8 a7 11 00 00       	call   14e27bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327d40>
 14e1615:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 14e161a:	48 89 06             	mov    QWORD PTR [rsi],rax
 14e161d:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 14e1621:	4c 8d 7c 24 1f       	lea    r15,[rsp+0x1f]
 14e1626:	4c 89 ff             	mov    rdi,r15
 14e1629:	e8 f2 2c 6b ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
 14e162e:	4c 89 f7             	mov    rdi,r14
 14e1631:	4c 89 fe             	mov    rsi,r15
 14e1634:	e8 af 2d e7 ff       	call   13543e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19996c>
 14e1639:	0f 57 c0             	xorps  xmm0,xmm0
 14e163c:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
 14e1640:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 14e1644:	bd 00 00 80 3f       	mov    ebp,0x3f800000
 14e1649:	89 6b 40             	mov    DWORD PTR [rbx+0x40],ebp
 14e164c:	45 31 f6             	xor    r14d,r14d
 14e164f:	44 88 73 48          	mov    BYTE PTR [rbx+0x48],r14b
 14e1653:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
 14e1657:	0f 11 83 00 01 00 00 	movups XMMWORD PTR [rbx+0x100],xmm0
 14e165e:	0f 11 83 10 01 00 00 	movups XMMWORD PTR [rbx+0x110],xmm0
 14e1665:	ba a9 00 00 00       	mov    edx,0xa9
 14e166a:	31 f6                	xor    esi,esi
 14e166c:	e8 1f d5 30 00       	call   17eeb90 <memset@plt>
 14e1671:	89 ab 20 01 00 00    	mov    DWORD PTR [rbx+0x120],ebp
 14e1677:	0f 57 c0             	xorps  xmm0,xmm0
 14e167a:	0f 11 83 90 01 00 00 	movups XMMWORD PTR [rbx+0x190],xmm0
 14e1681:	0f 11 83 a0 01 00 00 	movups XMMWORD PTR [rbx+0x1a0],xmm0
 14e1688:	0f 11 83 28 01 00 00 	movups XMMWORD PTR [rbx+0x128],xmm0
 14e168f:	0f 11 83 38 01 00 00 	movups XMMWORD PTR [rbx+0x138],xmm0
 14e1696:	0f 11 83 48 01 00 00 	movups XMMWORD PTR [rbx+0x148],xmm0
 14e169d:	0f 11 83 58 01 00 00 	movups XMMWORD PTR [rbx+0x158],xmm0
 14e16a4:	0f 11 83 68 01 00 00 	movups XMMWORD PTR [rbx+0x168],xmm0
 14e16ab:	0f 11 83 78 01 00 00 	movups XMMWORD PTR [rbx+0x178],xmm0
 14e16b2:	83 a3 88 01 00 00 00 	and    DWORD PTR [rbx+0x188],0x0
 14e16b9:	89 ab b0 01 00 00    	mov    DWORD PTR [rbx+0x1b0],ebp
 14e16bf:	44 88 b3 b8 01 00 00 	mov    BYTE PTR [rbx+0x1b8],r14b
 14e16c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14e16cd:	00 00 
 14e16cf:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 14e16d4:	75 0b                	jne    14e16e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x326c65>
 14e16d6:	48 83 c4 48          	add    rsp,0x48
 14e16da:	5b                   	pop    rbx
 14e16db:	41 5e                	pop    r14
 14e16dd:	41 5f                	pop    r15
 14e16df:	5d                   	pop    rbp
 14e16e0:	c3                   	ret
 14e16e1:	e8 ca e3 30 00       	call   17efab0 <__stack_chk_fail@plt>
 14e16e6:	53                   	push   rbx

## Helper 0x13543e8 that builds runtime+0x8 region

/tmp/addelegate/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013543c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199944>:
 13543c0:	29 75 ff             	sub    DWORD PTR [rbp-0x1],esi
 13543c3:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 13543c7:	e8 c4 9a 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13543cc:	48 89 df             	mov    rdi,rbx
 13543cf:	5b                   	pop    rbx
 13543d0:	e9 bb 9a 49 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 13543d5:	83 bf 90 02 00 00 00 	cmp    DWORD PTR [rdi+0x290],0x0
 13543dc:	75 04                	jne    13543e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199966>
 13543de:	48 89 f8             	mov    rax,rdi
 13543e1:	c3                   	ret
 13543e2:	50                   	push   rax
 13543e3:	e8 bb aa 75 ff       	call   aaeea3 <JNI_OnUnload@@Base+0x36770>
 13543e8:	50                   	push   rax
 13543e9:	6a 20                	push   0x20
 13543eb:	5a                   	pop    rdx
 13543ec:	e8 af 9a 49 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
 13543f1:	58                   	pop    rax
 13543f2:	c3                   	ret
 13543f3:	48 89 c7             	mov    rdi,rax
 13543f6:	e8 aa 56 72 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 13543fb:	cc                   	int3
 13543fc:	53                   	push   rbx
 13543fd:	48 89 fb             	mov    rbx,rdi
 1354400:	e8 cf f4 ae ff       	call   e438d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xacea>
 1354405:	48 89 df             	mov    rdi,rbx
 1354408:	5b                   	pop    rbx
 1354409:	e9 12 9b 49 00       	jmp    17edf20 <_ZdlPv@plt>
 135440e:	41 57                	push   r15
 1354410:	41 56                	push   r14
 1354412:	41 55                	push   r13
 1354414:	41 54                	push   r12
 1354416:	53                   	push   rbx
 1354417:	48 81 ec 70 03 00 00 	sub    rsp,0x370
 135441e:	48 89 d3             	mov    rbx,rdx
 1354421:	49 89 f7             	mov    r15,rsi
 1354424:	49 89 fe             	mov    r14,rdi
 1354427:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 135442e:	00 00 
 1354430:	48 89 84 24 68 03 00 	mov    QWORD PTR [rsp+0x368],rax
 1354437:	00 
 1354438:	4c 8d a6 20 02 00 00 	lea    r12,[rsi+0x220]
 135443f:	4c 8d 6f 18          	lea    r13,[rdi+0x18]
 1354443:	4c 89 ef             	mov    rdi,r13
 1354446:	4c 89 e6             	mov    rsi,r12
 1354449:	e8 a0 b2 74 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 135444e:	84 c0                	test   al,al
 1354450:	75 10                	jne    1354462 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1999e6>
 1354452:	41 c6 46 30 00       	mov    BYTE PTR [r14+0x30],0x0
 1354457:	4c 89 ef             	mov    rdi,r13
 135445a:	4c 89 e6             	mov    rsi,r12
 135445d:	e8 1e 9c 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 1354462:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
 1354466:	48 89 df             	mov    rdi,rbx
 1354469:	e8 c9 d0 1f 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
 135446e:	4c 8d a4 24 20 03 00 	lea    r12,[rsp+0x320]
 1354475:	00 
 1354476:	4c 89 e7             	mov    rdi,r12
 1354479:	48 89 c6             	mov    rsi,rax
 135447c:	e8 cf 81 d3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
 1354481:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 1354488:	00 
 1354489:	4c 89 fe             	mov    rsi,r15
 135448c:	4c 89 e2             	mov    rdx,r12
 135448f:	e8 54 61 00 00       	call   135a5e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19fb6c>
 1354494:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
 1354499:	41 c6 44 24 f8 01    	mov    BYTE PTR [r12-0x8],0x1
 135449f:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
 13544a6:	00 
 13544a7:	4c 89 e7             	mov    rdi,r12
 13544aa:	4c 89 fe             	mov    rsi,r15
 13544ad:	48 89 da             	mov    rdx,rbx
 13544b0:	e8 53 0a 00 00       	call   1354f08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a48c>
 13544b5:	83 bb 90 02 00 00 00 	cmp    DWORD PTR [rbx+0x290],0x0
 13544bc:	0f 94 c0             	sete   al
 13544bf:	80 bb 80 00 00 00 00 	cmp    BYTE PTR [rbx+0x80],0x0
 13544c6:	0f 94 c1             	sete   cl
 13544c9:	20 c1                	and    cl,al
 13544cb:	48 89 e3             	mov    rbx,rsp
 13544ce:	88 4b 78             	mov    BYTE PTR [rbx+0x78],cl
 13544d1:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 13544d8:	00 
 13544d9:	e8 5e 5b ed ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
 13544de:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
 13544e5:	00 
 13544e6:	e8 e1 a2 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 13544eb:	49 8b 06             	mov    rax,QWORD PTR [r14]
 13544ee:	4c 89 f7             	mov    rdi,r14
 13544f1:	48 89 de             	mov    rsi,rbx
 13544f4:	ff 50 20             	call   QWORD PTR [rax+0x20]
 13544f7:	4c 89 e7             	mov    rdi,r12
 13544fa:	e8 e1 09 00 00       	call   1354ee0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a464>
 13544ff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1354506:	00 00 
 1354508:	48 3b 84 24 68 03 00 	cmp    rax,QWORD PTR [rsp+0x368]
 135450f:	00 
 1354510:	75 5b                	jne    135456d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199af1>
 1354512:	48 81 c4 70 03 00 00 	add    rsp,0x370
 1354519:	5b                   	pop    rbx
 135451a:	41 5c                	pop    r12
 135451c:	41 5d                	pop    r13
 135451e:	41 5e                	pop    r14

## Producer 0x14e27bc used before helper

/tmp/addelegate/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000014e2790 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327d14>:
 14e2790:	41 5e                	pop    r14
 14e2792:	c3                   	ret
 14e2793:	cc                   	int3
 14e2794:	41 56                	push   r14
 14e2796:	53                   	push   rbx
 14e2797:	50                   	push   rax
 14e2798:	48 89 f3             	mov    rbx,rsi
 14e279b:	49 89 fe             	mov    r14,rdi
 14e279e:	48 89 f7             	mov    rdi,rsi
 14e27a1:	e8 6a b7 30 00       	call   17edf10 <strlen@plt>
 14e27a6:	4c 89 f7             	mov    rdi,r14
 14e27a9:	48 89 de             	mov    rsi,rbx
 14e27ac:	48 89 c2             	mov    rdx,rax
 14e27af:	48 83 c4 08          	add    rsp,0x8
 14e27b3:	5b                   	pop    rbx
 14e27b4:	41 5e                	pop    r14
 14e27b6:	e9 b7 1d 68 ff       	jmp    b64572 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1512>
 14e27bb:	cc                   	int3
 14e27bc:	55                   	push   rbp
 14e27bd:	41 57                	push   r15
 14e27bf:	41 56                	push   r14
 14e27c1:	53                   	push   rbx
 14e27c2:	48 81 ec 48 01 00 00 	sub    rsp,0x148
 14e27c9:	48 89 fb             	mov    rbx,rdi
 14e27cc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14e27d3:	00 00 
 14e27d5:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
 14e27dc:	00 
 14e27dd:	e8 89 6f 02 00       	call   150976b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ecef>
 14e27e2:	84 c0                	test   al,al
 14e27e4:	74 1f                	je     14e2805 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327d89>
 14e27e6:	0f b6 2b             	movzx  ebp,BYTE PTR [rbx]
 14e27e9:	40 f6 c5 01          	test   bpl,0x1
 14e27ed:	74 06                	je     14e27f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327d79>
 14e27ef:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
 14e27f3:	eb 06                	jmp    14e27fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327d7f>
 14e27f5:	41 89 ee             	mov    r14d,ebp
 14e27f8:	41 d1 ee             	shr    r14d,1
 14e27fb:	49 83 fe 20          	cmp    r14,0x20
 14e27ff:	0f 86 8c 00 00 00    	jbe    14e2891 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327e15>
 14e2805:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
 14e280a:	4c 89 f7             	mov    rdi,r14
 14e280d:	48 89 de             	mov    rsi,rbx
 14e2810:	e8 2b b7 30 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 14e2815:	4c 89 f7             	mov    rdi,r14
 14e2818:	e8 8d 6f 02 00       	call   15097aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ed2e>
 14e281d:	4c 8d 74 24 19       	lea    r14,[rsp+0x19]
 14e2822:	41 8a 6e ff          	mov    bpl,BYTE PTR [r14-0x1]
 14e2826:	40 f6 c5 01          	test   bpl,0x1
 14e282a:	4d 8b 7e 0f          	mov    r15,QWORD PTR [r14+0xf]
 14e282e:	4c 89 fb             	mov    rbx,r15
 14e2831:	49 0f 44 de          	cmove  rbx,r14
 14e2835:	48 89 df             	mov    rdi,rbx
 14e2838:	e8 d3 b6 30 00       	call   17edf10 <strlen@plt>
 14e283d:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 14e2844:	00 
 14e2845:	48 89 de             	mov    rsi,rbx
 14e2848:	48 89 c2             	mov    rdx,rax
 14e284b:	e8 95 53 2f 00       	call   17d7be5 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a06>
 14e2850:	84 c0                	test   al,al
 14e2852:	74 0f                	je     14e2863 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327de7>
 14e2854:	40 f6 c5 01          	test   bpl,0x1
 14e2858:	4d 0f 44 fe          	cmove  r15,r14
 14e285c:	41                   	rex.B
 14e285d:	80                   	.byte 0x80
 14e285e:	7f 16                	jg     14e2876 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327dfa>

## Helper b94320

/tmp/addelegate/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b942f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe1290>:
  b942f0:	25 28 00 00 00       	and    eax,0x28
  b942f5:	48 3b 84 24 60 01 00 	cmp    rax,QWORD PTR [rsp+0x160]
  b942fc:	00 
  b942fd:	75 08                	jne    b94307 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12a7>
  b942ff:	48 89 df             	mov    rdi,rbx
  b94302:	e8 c9 b9 ed ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b94307:	e8 a4 b7 c5 00       	call   17efab0 <__stack_chk_fail@plt>
  b9430c:	50                   	push   rax
  b9430d:	6a 28                	push   0x28
  b9430f:	5a                   	pop    rdx
  b94310:	e8 8b 9b c5 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
  b94315:	58                   	pop    rax
  b94316:	c3                   	ret
  b94317:	48 89 c7             	mov    rdi,rax
  b9431a:	e8 86 57 ee ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b9431f:	cc                   	int3
  b94320:	0f 57 c0             	xorps  xmm0,xmm0
  b94323:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
  b94327:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  b9432a:	c6 47 20 00          	mov    BYTE PTR [rdi+0x20],0x0
  b9432e:	e9 64 7d 02 00       	jmp    bbc097 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109037>
  b94333:	cc                   	int3
  b94334:	50                   	push   rax
  b94335:	6a 20                	push   0x20
  b94337:	5a                   	pop    rdx
  b94338:	e8 63 9b c5 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
  b9433d:	58                   	pop    rax
  b9433e:	c3                   	ret
  b9433f:	48 89 c7             	mov    rdi,rax
  b94342:	e8 5e 57 ee ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b94347:	cc                   	int3
  b94348:	41 56                	push   r14
  b9434a:	53                   	push   rbx
  b9434b:	48 83 ec 38          	sub    rsp,0x38
  b9434f:	48 89 fb             	mov    rbx,rdi
  b94352:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b94359:	00 00 
  b9435b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  b94360:	0f 57 c0             	xorps  xmm0,xmm0
  b94363:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  b94366:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  b9436b:	4c 89 f7             	mov    rdi,r14
  b9436e:	e8                   	.byte 0xe8
  b9436f:	bd                   	.byte 0xbd

## All exact runtime +0x18 writes in ad-object family
 1400024:	4d 85 c0             	test   r8,r8
 1400027:	0f 84 0a 02 00 00    	je     1400237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2457bb>
 140002d:	31 c0                	xor    eax,eax
 140002f:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
 1400032:	8b 0c 81             	mov    ecx,DWORD PTR [rcx+rax*4]
 1400035:	89 4d 00             	mov    DWORD PTR [rbp+0x0],ecx
 1400038:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
 140003c:	8b 0c 81             	mov    ecx,DWORD PTR [rcx+rax*4]
 140003f:	89 4d 04             	mov    DWORD PTR [rbp+0x4],ecx
 1400042:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
 1400046:	8b 0c 81             	mov    ecx,DWORD PTR [rcx+rax*4]
 1400049:	89 4d 08             	mov    DWORD PTR [rbp+0x8],ecx
 140004c:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
 1400050:	8b 0c 81             	mov    ecx,DWORD PTR [rcx+rax*4]
 1400053:	89 4d 0c             	mov    DWORD PTR [rbp+0xc],ecx
 1400056:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
 140005a:	8b 0c 81             	mov    ecx,DWORD PTR [rcx+rax*4]
 140005d:	89 4d 10             	mov    DWORD PTR [rbp+0x10],ecx
 1400060:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
 1400064:	8b 0c 81             	mov    ecx,DWORD PTR [rcx+rax*4]
 1400067:	89 4d 14             	mov    DWORD PTR [rbp+0x14],ecx
 140006a:	48 ff c0             	inc    rax
 140006d:	48 83 c5 18          	add    rbp,0x18
 1400071:	49 39 c0             	cmp    r8,rax
 1400074:	75 b9                	jne    140002f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2455b3>
 1400076:	e9 bc 01 00 00       	jmp    1400237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2457bb>
 140007b:	4d 85 c0             	test   r8,r8
 140007e:	0f 84 b3 01 00 00    	je     1400237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2457bb>
 1400084:	49 c1 e0 02          	shl    r8,0x2
 1400088:	31 c0                	xor    eax,eax
 140008a:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
 140008d:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 1400090:	89 4c 85 00          	mov    DWORD PTR [rbp+rax*4+0x0],ecx
 1400094:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
 1400098:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 140009b:	89 4c 85 04          	mov    DWORD PTR [rbp+rax*4+0x4],ecx
 140009f:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
 14000a3:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 14000a6:	89 4c 85 08          	mov    DWORD PTR [rbp+rax*4+0x8],ecx
 14000aa:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
 14000ae:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 14000b1:	89 4c 85 0c          	mov    DWORD PTR [rbp+rax*4+0xc],ecx
 14000b5:	48 83 c0 04          	add    rax,0x4
 14000b9:	49 39 c0             	cmp    r8,rax
 14000bc:	75 cc                	jne    140008a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24560e>
 14000be:	e9 74 01 00 00       	jmp    1400237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2457bb>
 14000c3:	4d 85 c0             	test   r8,r8
 14000c6:	0f 84 6b 01 00 00    	je     1400237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2457bb>
 14000cc:	31 c0                	xor    eax,eax
 14000ce:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
 14000d1:	8b 0c 81             	mov    ecx,DWORD PTR [rcx+rax*4]
 14000d4:	89 4c c5 00          	mov    DWORD PTR [rbp+rax*8+0x0],ecx
 14000d8:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
 14000dc:	8b 0c 81             	mov    ecx,DWORD PTR [rcx+rax*4]
 14000df:	89 4c c5 04          	mov    DWORD PTR [rbp+rax*8+0x4],ecx
 14000e3:	48 ff c0             	inc    rax
 14000e6:	49 39 c0             	cmp    r8,rax
 14000e9:	75 e3                	jne    14000ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245652>
 14000eb:	e9 47 01 00 00       	jmp    1400237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2457bb>
 14000f0:	4d 85 c0             	test   r8,r8
 14000f3:	0f 84 3e 01 00 00    	je     1400237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2457bb>
 14000f9:	49 c1 e0 02          	shl    r8,0x2
 14000fd:	31 c0                	xor    eax,eax
 14000ff:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
 1400102:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 1400105:	89 4c c5 00          	mov    DWORD PTR [rbp+rax*8+0x0],ecx
 1400109:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
 140010d:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 1400110:	89 4c c5 04          	mov    DWORD PTR [rbp+rax*8+0x4],ecx
 1400114:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
 1400118:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 140011b:	89 4c c5 08          	mov    DWORD PTR [rbp+rax*8+0x8],ecx
 140011f:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
 1400123:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 1400126:	89 4c c5 0c          	mov    DWORD PTR [rbp+rax*8+0xc],ecx
 140012a:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
 140012e:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 1400131:	89 4c c5 10          	mov    DWORD PTR [rbp+rax*8+0x10],ecx
 1400135:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
 1400139:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 140013c:	89 4c c5 14          	mov    DWORD PTR [rbp+rax*8+0x14],ecx
 1400140:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
 1400144:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 1400147:	89 4c c5 18          	mov    DWORD PTR [rbp+rax*8+0x18],ecx
 140014b:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
 140014f:	8b 0c 01             	mov    ecx,DWORD PTR [rcx+rax*1]
 1400152:	89 4c c5 1c          	mov    DWORD PTR [rbp+rax*8+0x1c],ecx
 1400156:	48 83 c0 04          	add    rax,0x4
 140015a:	49 39 c0             	cmp    r8,rax
 140015d:	75 a0                	jne    14000ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245683>
 140015f:	e9 d3 00 00 00       	jmp    1400237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2457bb>
 1400164:	4d 85 c0             	test   r8,r8
 1400167:	0f 84 ca 00 00 00    	je     1400237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2457bb>
 140016d:	31 c0                	xor    eax,eax
 140016f:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
 1400172:	8b 0c 81             	mov    ecx,DWORD PTR [rcx+rax*4]
 1400175:	88 4d 00             	mov    BYTE PTR [rbp+0x0],cl
--
 1400333:	5b                   	pop    rbx
 1400334:	41 5c                	pop    r12
 1400336:	41 5d                	pop    r13
 1400338:	41 5e                	pop    r14
 140033a:	41 5f                	pop    r15
 140033c:	5d                   	pop    rbp
 140033d:	ff e0                	jmp    rax
 140033f:	e8 6c f7 3e 00       	call   17efab0 <__stack_chk_fail@plt>
 1400344:	55                   	push   rbp
 1400345:	41 56                	push   r14
 1400347:	53                   	push   rbx
 1400348:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
 140034c:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
 1400350:	31 ed                	xor    ebp,ebp
 1400352:	48 85 c0             	test   rax,rax
 1400355:	74 39                	je     1400390 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245914>
 1400357:	48 89 f3             	mov    rbx,rsi
 140035a:	49 89 fe             	mov    r14,rdi
 140035d:	48 8b 51 48          	mov    rdx,QWORD PTR [rcx+0x48]
 1400361:	ff d0                	call   rax
 1400363:	85 c0                	test   eax,eax
 1400365:	75 29                	jne    1400390 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245914>
 1400367:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
 140036b:	48 8b 48 58          	mov    rcx,QWORD PTR [rax+0x58]
 140036f:	8b 41 18             	mov    eax,DWORD PTR [rcx+0x18]
 1400372:	a8 07                	test   al,0x7
 1400374:	75 1a                	jne    1400390 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245914>
 1400376:	8b 51 0c             	mov    edx,DWORD PTR [rcx+0xc]
 1400379:	8b 71 10             	mov    esi,DWORD PTR [rcx+0x10]
 140037c:	2b 51 14             	sub    edx,DWORD PTR [rcx+0x14]
 140037f:	c1 e2 05             	shl    edx,0x5
 1400382:	8d 0c f2             	lea    ecx,[rdx+rsi*8]
 1400385:	29 c1                	sub    ecx,eax
 1400387:	c1 e9 03             	shr    ecx,0x3
 140038a:	48 29 0b             	sub    QWORD PTR [rbx],rcx
 140038d:	6a 01                	push   0x1
 140038f:	5d                   	pop    rbp
 1400390:	89 e8                	mov    eax,ebp
 1400392:	5b                   	pop    rbx
 1400393:	41 5e                	pop    r14
 1400395:	5d                   	pop    rbp
 1400396:	c3                   	ret
 1400397:	48 83 ff 01          	cmp    rdi,0x1
 140039b:	48 83 d7 00          	adc    rdi,0x0
 140039f:	e9 5c e8 3e 00       	jmp    17eec00 <malloc@plt>
 14003a4:	53                   	push   rbx
 14003a5:	48 89 fb             	mov    rbx,rdi
 14003a8:	e8 09 00 00 00       	call   14003b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24593a>
 14003ad:	48 89 df             	mov    rdi,rbx
--
 14005a3:	83 4b 2c ff          	or     DWORD PTR [rbx+0x2c],0xffffffff
 14005a7:	eb 34                	jmp    14005dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245b61>
 14005a9:	41 83 26 00          	and    DWORD PTR [r14],0x0
 14005ad:	e9 9c 00 00 00       	jmp    140064e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245bd2>
 14005b2:	89 43 2c             	mov    DWORD PTR [rbx+0x2c],eax
 14005b5:	8b 53 0c             	mov    edx,DWORD PTR [rbx+0xc]
 14005b8:	8b 4b 10             	mov    ecx,DWORD PTR [rbx+0x10]
 14005bb:	8b 43 14             	mov    eax,DWORD PTR [rbx+0x14]
 14005be:	89 d6                	mov    esi,edx
 14005c0:	29 c6                	sub    esi,eax
 14005c2:	c1 e6 05             	shl    esi,0x5
 14005c5:	8d 34 ce             	lea    esi,[rsi+rcx*8]
 14005c8:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]
 14005cb:	29 ce                	sub    esi,ecx
 14005cd:	39 ee                	cmp    esi,ebp
 14005cf:	73 10                	jae    14005e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245b65>
 14005d1:	48 89 df             	mov    rdi,rbx
 14005d4:	e8 cd 00 00 00       	call   14006a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245c2a>
 14005d9:	85 c0                	test   eax,eax
 14005db:	75 d8                	jne    14005b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245b39>
 14005dd:	31 c0                	xor    eax,eax
 14005df:	eb 70                	jmp    1400651 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245bd5>
 14005e1:	39 c2                	cmp    edx,eax
 14005e3:	76 30                	jbe    1400615 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245b99>
 14005e5:	85 c9                	test   ecx,ecx
 14005e7:	74 40                	je     1400629 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245bad>
 14005e9:	6a ff                	push   0xffffffffffffffff
 14005eb:	5e                   	pop    rsi
 14005ec:	d3 ee                	shr    esi,cl
 14005ee:	31 d2                	xor    edx,edx
 14005f0:	83 e9 20             	sub    ecx,0x20
 14005f3:	0f 43 f2             	cmovae esi,edx
 14005f6:	f7 d9                	neg    ecx
 14005f8:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 14005fb:	8b 3c 87             	mov    edi,DWORD PTR [rdi+rax*4]
 14005fe:	89 c8                	mov    eax,ecx
 1400600:	21 f7                	and    edi,esi
--
 1400621:	d3 e8                	shr    eax,cl
 1400623:	01 e9                	add    ecx,ebp
 1400625:	f6 d9                	neg    cl
 1400627:	eb 1d                	jmp    1400646 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245bca>
 1400629:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
 140062c:	8b 04 81             	mov    eax,DWORD PTR [rcx+rax*4]
 140062f:	83 fd 1f             	cmp    ebp,0x1f
 1400632:	77 6a                	ja     140069e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245c22>
 1400634:	89 e9                	mov    ecx,ebp
 1400636:	f6 d9                	neg    cl
 1400638:	d3 e8                	shr    eax,cl
 140063a:	41 89 06             	mov    DWORD PTR [r14],eax
 140063d:	89 6b 18             	mov    DWORD PTR [rbx+0x18],ebp
 1400640:	eb 0c                	jmp    140064e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245bd2>
 1400642:	89 e9                	mov    ecx,ebp
 1400644:	f6 d9                	neg    cl
 1400646:	d3 e8                	shr    eax,cl
 1400648:	41 89 06             	mov    DWORD PTR [r14],eax
 140064b:	01 6b 18             	add    DWORD PTR [rbx+0x18],ebp
 140064e:	6a 01                	push   0x1
 1400650:	58                   	pop    rax
 1400651:	5b                   	pop    rbx
 1400652:	41 5e                	pop    r14
 1400654:	5d                   	pop    rbp
 1400655:	c3                   	ret
 1400656:	41 89 3e             	mov    DWORD PTR [r14],edi
 1400659:	ff 43 14             	inc    DWORD PTR [rbx+0x14]
 140065c:	83 63 18 00          	and    DWORD PTR [rbx+0x18],0x0
 1400660:	6a 01                	push   0x1
 1400662:	58                   	pop    rax
 1400663:	29 cd                	sub    ebp,ecx
 1400665:	74 ea                	je     1400651 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245bd5>
 1400667:	6a 20                	push   0x20
 1400669:	5a                   	pop    rdx
 140066a:	29 ea                	sub    edx,ebp
 140066c:	31 ff                	xor    edi,edi
 140066e:	be 00 00 00 00       	mov    esi,0x0
 1400673:	83 fd 1f             	cmp    ebp,0x1f
 1400676:	77 07                	ja     140067f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245c03>
 1400678:	41 8b 36             	mov    esi,DWORD PTR [r14]
 140067b:	89 e9                	mov    ecx,ebp
 140067d:	d3 e6                	shl    esi,cl
 140067f:	41 89 36             	mov    DWORD PTR [r14],esi
 1400682:	83 fa 1f             	cmp    edx,0x1f
 1400685:	77 0d                	ja     1400694 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245c18>
 1400687:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
 140068a:	8b 7b 14             	mov    edi,DWORD PTR [rbx+0x14]
 140068d:	8b 3c b9             	mov    edi,DWORD PTR [rcx+rdi*4]
 1400690:	89 d1                	mov    ecx,edx
 1400692:	d3 ef                	shr    edi,cl
 1400694:	09 f7                	or     edi,esi
 1400696:	41 89 3e             	mov    DWORD PTR [r14],edi
 1400699:	89 6b 18             	mov    DWORD PTR [rbx+0x18],ebp
 140069c:	eb b3                	jmp    1400651 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245bd5>
 140069e:	41 89 06             	mov    DWORD PTR [r14],eax
 14006a1:	ff 43 14             	inc    DWORD PTR [rbx+0x14]
 14006a4:	eb a8                	jmp    140064e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245bd2>
 14006a6:	55                   	push   rbp
 14006a7:	41 56                	push   r14
 14006a9:	53                   	push   rbx
 14006aa:	48 83 ec 10          	sub    rsp,0x10
 14006ae:	48 89 fb             	mov    rbx,rdi
 14006b1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14006b8:	00 00 
 14006ba:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 14006bf:	83 7f 14 00          	cmp    DWORD PTR [rdi+0x14],0x0
 14006c3:	74 3b                	je     1400700 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245c84>
 14006c5:	83 4b 30 ff          	or     DWORD PTR [rbx+0x30],0xffffffff
 14006c9:	48 89 df             	mov    rdi,rbx
 14006cc:	e8 13 fd ff ff       	call   14003e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245968>
 14006d1:	44 8b 73 14          	mov    r14d,DWORD PTR [rbx+0x14]
 14006d5:	8b 53 0c             	mov    edx,DWORD PTR [rbx+0xc]
 14006d8:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 14006db:	44 29 f2             	sub    edx,r14d
 14006de:	83 7b 10 01          	cmp    DWORD PTR [rbx+0x10],0x1
 14006e2:	4a 8d 34 b7          	lea    rsi,[rdi+r14*4]
 14006e6:	83 da ff             	sbb    edx,0xffffffff
--
 14009f9:	5d                   	pop    rbp
 14009fa:	c3                   	ret
 14009fb:	e8 b0 f0 3e 00       	call   17efab0 <__stack_chk_fail@plt>
 1400a00:	55                   	push   rbp
 1400a01:	41 56                	push   r14
 1400a03:	53                   	push   rbx
 1400a04:	48 83 ec 10          	sub    rsp,0x10
 1400a08:	89 f3                	mov    ebx,esi
 1400a0a:	49 89 fe             	mov    r14,rdi
 1400a0d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1400a14:	00 00 
 1400a16:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1400a1b:	8b 47 18             	mov    eax,DWORD PTR [rdi+0x18]
 1400a1e:	83 e0 07             	and    eax,0x7
 1400a21:	74 1f                	je     1400a42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245fc6>
 1400a23:	6a 08                	push   0x8
 1400a25:	5d                   	pop    rbp
 1400a26:	29 c5                	sub    ebp,eax
 1400a28:	39 dd                	cmp    ebp,ebx
 1400a2a:	0f 43 eb             	cmovae ebp,ebx
 1400a2d:	48 8d 74 24 04       	lea    rsi,[rsp+0x4]
 1400a32:	4c 89 f7             	mov    rdi,r14
 1400a35:	89 ea                	mov    edx,ebp
 1400a37:	e8 45 fb ff ff       	call   1400581 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245b05>
 1400a3c:	85 c0                	test   eax,eax
 1400a3e:	74 30                	je     1400a70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245ff4>
 1400a40:	29 eb                	sub    ebx,ebp
 1400a42:	89 de                	mov    esi,ebx
 1400a44:	c1 ee 03             	shr    esi,0x3
 1400a47:	4c 89 f7             	mov    rdi,r14
 1400a4a:	e8 41 00 00 00       	call   1400a90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246014>
 1400a4f:	85 c0                	test   eax,eax
 1400a51:	74 1d                	je     1400a70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245ff4>
 1400a53:	83 e3 07             	and    ebx,0x7
 1400a56:	74 13                	je     1400a6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245fef>
 1400a58:	48 8d 74 24 04       	lea    rsi,[rsp+0x4]
 1400a5d:	4c 89 f7             	mov    rdi,r14
--
 1400abe:	41 39 46 2c          	cmp    DWORD PTR [r14+0x2c],eax
 1400ac2:	73 09                	jae    1400acd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246051>
 1400ac4:	41 83 4e 2c ff       	or     DWORD PTR [r14+0x2c],0xffffffff
 1400ac9:	31 db                	xor    ebx,ebx
 1400acb:	eb 2d                	jmp    1400afa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24607e>
 1400acd:	6a 01                	push   0x1
 1400acf:	5b                   	pop    rbx
 1400ad0:	45 85 ff             	test   r15d,r15d
 1400ad3:	74 25                	je     1400afa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24607e>
 1400ad5:	4c 8d 64 24 04       	lea    r12,[rsp+0x4]
 1400ada:	6a 08                	push   0x8
 1400adc:	5d                   	pop    rbp
 1400add:	41 83 7e 18 00       	cmp    DWORD PTR [r14+0x18],0x0
 1400ae2:	74 35                	je     1400b19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24609d>
 1400ae4:	4c 89 f7             	mov    rdi,r14
 1400ae7:	4c 89 e6             	mov    rsi,r12
 1400aea:	89 ea                	mov    edx,ebp
 1400aec:	e8 90 fa ff ff       	call   1400581 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245b05>
 1400af1:	85 c0                	test   eax,eax
 1400af3:	74 d4                	je     1400ac9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24604d>
 1400af5:	41 ff cf             	dec    r15d
 1400af8:	75 e3                	jne    1400add <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246061>
 1400afa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1400b01:	00 00 
 1400b03:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 1400b08:	75 73                	jne    1400b7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246101>
 1400b0a:	89 d8                	mov    eax,ebx
 1400b0c:	48 83 c4 10          	add    rsp,0x10
 1400b10:	5b                   	pop    rbx
 1400b11:	41 5c                	pop    r12
 1400b13:	41 5e                	pop    r14
 1400b15:	41 5f                	pop    r15
 1400b17:	5d                   	pop    rbp
 1400b18:	c3                   	ret
 1400b19:	41 83 ff 04          	cmp    r15d,0x4
 1400b1d:	72 38                	jb     1400b57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2460db>
 1400b1f:	41 8b 46 14          	mov    eax,DWORD PTR [r14+0x14]
--
 1400bb5:	41 39 46 2c          	cmp    DWORD PTR [r14+0x2c],eax
 1400bb9:	73 0c                	jae    1400bc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24614b>
 1400bbb:	41 83 4e 2c ff       	or     DWORD PTR [r14+0x2c],0xffffffff
 1400bc0:	31 db                	xor    ebx,ebx
 1400bc2:	e9 c8 00 00 00       	jmp    1400c8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246213>
 1400bc7:	6a 01                	push   0x1
 1400bc9:	5b                   	pop    rbx
 1400bca:	45 85 e4             	test   r12d,r12d
 1400bcd:	0f 84 bc 00 00 00    	je     1400c8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246213>
 1400bd3:	4c 8d 6c 24 0c       	lea    r13,[rsp+0xc]
 1400bd8:	6a 08                	push   0x8
 1400bda:	5d                   	pop    rbp
 1400bdb:	41 83 7e 18 00       	cmp    DWORD PTR [r14+0x18],0x0
 1400be0:	74 25                	je     1400c07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24618b>
 1400be2:	4c 89 f7             	mov    rdi,r14
 1400be5:	4c 89 ee             	mov    rsi,r13
 1400be8:	89 ea                	mov    edx,ebp
 1400bea:	e8 92 f9 ff ff       	call   1400581 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245b05>
 1400bef:	85 c0                	test   eax,eax
 1400bf1:	74 cd                	je     1400bc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246144>
 1400bf3:	8a 44 24 0c          	mov    al,BYTE PTR [rsp+0xc]
 1400bf7:	41 88 07             	mov    BYTE PTR [r15],al
 1400bfa:	49 ff c7             	inc    r15
 1400bfd:	41 ff cc             	dec    r12d
 1400c00:	75 d9                	jne    1400bdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24615f>
 1400c02:	e9 88 00 00 00       	jmp    1400c8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246213>
 1400c07:	41 83 fc 04          	cmp    r12d,0x4
 1400c0b:	72 4d                	jb     1400c5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2461de>
 1400c0d:	41 8b 46 14          	mov    eax,DWORD PTR [r14+0x14]
 1400c11:	41 3b 46 0c          	cmp    eax,DWORD PTR [r14+0xc]
 1400c15:	73 28                	jae    1400c3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2461c3>
 1400c17:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
 1400c1a:	8d 50 01             	lea    edx,[rax+0x1]
 1400c1d:	41 89 56 14          	mov    DWORD PTR [r14+0x14],edx
 1400c21:	8b 04 81             	mov    eax,DWORD PTR [rcx+rax*4]
 1400c24:	0f c8                	bswap  eax
 1400c26:	41 89 07             	mov    DWORD PTR [r15],eax
--
 1400caa:	41 5e                	pop    r14
 1400cac:	41 5f                	pop    r15
 1400cae:	5d                   	pop    rbp
 1400caf:	c3                   	ret
 1400cb0:	e8 fb ed 3e 00       	call   17efab0 <__stack_chk_fail@plt>
 1400cb5:	41 56                	push   r14
 1400cb7:	53                   	push   rbx
 1400cb8:	50                   	push   rax
 1400cb9:	49 89 f6             	mov    r14,rsi
 1400cbc:	48 89 fb             	mov    rbx,rdi
 1400cbf:	83 26 00             	and    DWORD PTR [rsi],0x0
 1400cc2:	8b 4b 14             	mov    ecx,DWORD PTR [rbx+0x14]
 1400cc5:	8b 53 18             	mov    edx,DWORD PTR [rbx+0x18]
 1400cc8:	6a 01                	push   0x1
 1400cca:	58                   	pop    rax
 1400ccb:	3b 4b 0c             	cmp    ecx,DWORD PTR [rbx+0xc]
 1400cce:	73 35                	jae    1400d05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246289>
 1400cd0:	83 fa 20             	cmp    edx,0x20
 1400cd3:	73 15                	jae    1400cea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24626e>
 1400cd5:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 1400cd8:	89 c9                	mov    ecx,ecx
 1400cda:	8b 34 8e             	mov    esi,DWORD PTR [rsi+rcx*4]
 1400cdd:	89 d1                	mov    ecx,edx
 1400cdf:	d3 e6                	shl    esi,cl
 1400ce1:	41 8b 0e             	mov    ecx,DWORD PTR [r14]
 1400ce4:	85 f6                	test   esi,esi
 1400ce6:	74 05                	je     1400ced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246271>
 1400ce8:	eb 63                	jmp    1400d4d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2462d1>
 1400cea:	41 8b 0e             	mov    ecx,DWORD PTR [r14]
 1400ced:	29 d1                	sub    ecx,edx
 1400cef:	83 c1 20             	add    ecx,0x20
 1400cf2:	41 89 0e             	mov    DWORD PTR [r14],ecx
 1400cf5:	8b 4b 14             	mov    ecx,DWORD PTR [rbx+0x14]
 1400cf8:	ff c1                	inc    ecx
 1400cfa:	89 4b 14             	mov    DWORD PTR [rbx+0x14],ecx
 1400cfd:	83 63 18 00          	and    DWORD PTR [rbx+0x18],0x0
 1400d01:	31 d2                	xor    edx,edx
 1400d03:	eb c6                	jmp    1400ccb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24624f>
 1400d05:	8b 73 10             	mov    esi,DWORD PTR [rbx+0x10]
 1400d08:	c1 e6 03             	shl    esi,0x3
 1400d0b:	89 f7                	mov    edi,esi
 1400d0d:	29 d7                	sub    edi,edx
 1400d0f:	76 28                	jbe    1400d39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2462bd>
 1400d11:	4c 8b 03             	mov    r8,QWORD PTR [rbx]
 1400d14:	89 c9                	mov    ecx,ecx
 1400d16:	45 8b 04 88          	mov    r8d,DWORD PTR [r8+rcx*4]
 1400d1a:	89 f1                	mov    ecx,esi
 1400d1c:	f6 d9                	neg    cl
 1400d1e:	41 d3 e8             	shr    r8d,cl
 1400d21:	41 d3 e0             	shl    r8d,cl
 1400d24:	89 d1                	mov    ecx,edx
 1400d26:	41 d3 e0             	shl    r8d,cl
 1400d29:	41 8b 0e             	mov    ecx,DWORD PTR [r14]
 1400d2c:	45 85 c0             	test   r8d,r8d
 1400d2f:	75 46                	jne    1400d77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2462fb>
 1400d31:	01 cf                	add    edi,ecx
 1400d33:	41 89 3e             	mov    DWORD PTR [r14],edi
 1400d36:	89 73 18             	mov    DWORD PTR [rbx+0x18],esi
 1400d39:	48 89 df             	mov    rdi,rbx
 1400d3c:	e8 65 f9 ff ff       	call   14006a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245c2a>
 1400d41:	85 c0                	test   eax,eax
 1400d43:	0f 85 79 ff ff ff    	jne    1400cc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246246>
 1400d49:	31 c0                	xor    eax,eax
 1400d4b:	eb 22                	jmp    1400d6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2462f3>
 1400d4d:	0f bd d6             	bsr    edx,esi
 1400d50:	83 f2 1f             	xor    edx,0x1f
 1400d53:	01 d1                	add    ecx,edx
 1400d55:	41 89 0e             	mov    DWORD PTR [r14],ecx
 1400d58:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]
 1400d5b:	01 d1                	add    ecx,edx
 1400d5d:	ff c1                	inc    ecx
 1400d5f:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx
 1400d62:	83 f9 20             	cmp    ecx,0x20
 1400d65:	72 08                	jb     1400d6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2462f3>
 1400d67:	ff 43 14             	inc    DWORD PTR [rbx+0x14]
 1400d6a:	31 c9                	xor    ecx,ecx
 1400d6c:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx
 1400d6f:	48 83 c4 08          	add    rsp,0x8
 1400d73:	5b                   	pop    rbx
 1400d74:	41 5e                	pop    r14
 1400d76:	c3                   	ret
 1400d77:	41 0f bd d0          	bsr    edx,r8d
 1400d7b:	83 f2 1f             	xor    edx,0x1f
 1400d7e:	01 d1                	add    ecx,edx
 1400d80:	41 89 0e             	mov    DWORD PTR [r14],ecx
 1400d83:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]
 1400d86:	01 d1                	add    ecx,edx
 1400d88:	ff c1                	inc    ecx
 1400d8a:	eb e0                	jmp    1400d6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2462f0>
 1400d8c:	55                   	push   rbp
 1400d8d:	41 57                	push   r15
 1400d8f:	41 56                	push   r14
 1400d91:	41 55                	push   r13
 1400d93:	41 54                	push   r12
 1400d95:	53                   	push   rbx
 1400d96:	48 83 ec 18          	sub    rsp,0x18
 1400d9a:	49 89 f6             	mov    r14,rsi
 1400d9d:	48 89 fb             	mov    rbx,rdi
 1400da0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1400da7:	00 00 
 1400da9:	6a ff                	push   0xffffffffffffffff
 1400dab:	41 5b                	pop    r11
 1400dad:	41 d3 eb             	shr    r11d,cl
 1400db0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 1400db5:	89 d0                	mov    eax,edx
 1400db7:	4c 8d 24 86          	lea    r12,[rsi+rax*4]
 1400dbb:	85 c9                	test   ecx,ecx
 1400dbd:	74 20                	je     1400ddf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246363>
 1400dbf:	41 89 cf             	mov    r15d,ecx
 1400dc2:	8b 53 0c             	mov    edx,DWORD PTR [rbx+0xc]
 1400dc5:	8b 73 14             	mov    esi,DWORD PTR [rbx+0x14]
 1400dc8:	39 d6                	cmp    esi,edx
 1400dca:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
 1400dce:	73 4e                	jae    1400e1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2463a2>
 1400dd0:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]
 1400dd3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1400dd6:	44 8b 04 b0          	mov    r8d,DWORD PTR [rax+rsi*4]
 1400dda:	41 d3 e0             	shl    r8d,cl
 1400ddd:	eb 4d                	jmp    1400e2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2463b0>
 1400ddf:	6a 01                	push   0x1
 1400de1:	5d                   	pop    rbp
 1400de2:	85 d2                	test   edx,edx
 1400de4:	0f 84 76 01 00 00    	je     1400f60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2464e4>
 1400dea:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
 1400def:	48 89 df             	mov    rdi,rbx
 1400df2:	4c 89 fe             	mov    rsi,r15
 1400df5:	e8 bb fe ff ff       	call   1400cb5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246239>
 1400dfa:	85 c0                	test   eax,eax
 1400dfc:	74 27                	je     1400e25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2463a9>
 1400dfe:	8b 44 24 08          	mov    eax,DWORD PTR [rsp+0x8]
 1400e02:	89 c1                	mov    ecx,eax
 1400e04:	d1 e9                	shr    ecx,1
 1400e06:	83 e0 01             	and    eax,0x1
 1400e09:	f7 d8                	neg    eax
 1400e0b:	31 c8                	xor    eax,ecx
 1400e0d:	41 89 06             	mov    DWORD PTR [r14],eax
 1400e10:	49 83 c6 04          	add    r14,0x4
 1400e14:	4d 39 e6             	cmp    r14,r12
 1400e17:	72 d6                	jb     1400def <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246373>
--
 1400efa:	83 e5 01             	and    ebp,0x1
 1400efd:	f7 dd                	neg    ebp
 1400eff:	31 cd                	xor    ebp,ecx
 1400f01:	41 89 2e             	mov    DWORD PTR [r14],ebp
 1400f04:	49 83 c6 04          	add    r14,0x4
 1400f08:	44 89 ce             	mov    esi,r9d
 1400f0b:	4d 39 e6             	cmp    r14,r12
 1400f0e:	0f 82 2f ff ff ff    	jb     1400e43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2463c7>
 1400f14:	eb 20                	jmp    1400f36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2464ba>
 1400f16:	ff c6                	inc    esi
 1400f18:	39 f2                	cmp    edx,esi
 1400f1a:	0f 47 f2             	cmova  esi,edx
 1400f1d:	83 63 18 00          	and    DWORD PTR [rbx+0x18],0x0
 1400f21:	89 73 14             	mov    DWORD PTR [rbx+0x14],esi
 1400f24:	eb 60                	jmp    1400f86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24650a>
 1400f26:	45 89 dc             	mov    r12d,r11d
 1400f29:	83 63 18 00          	and    DWORD PTR [rbx+0x18],0x0
 1400f2d:	44 89 4b 14          	mov    DWORD PTR [rbx+0x14],r9d
 1400f31:	eb 78                	jmp    1400fab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24652f>
 1400f33:	41 89 f1             	mov    r9d,esi
 1400f36:	31 c0                	xor    eax,eax
 1400f38:	41 39 d1             	cmp    r9d,edx
 1400f3b:	0f 92 c0             	setb   al
 1400f3e:	89 c1                	mov    ecx,eax
 1400f40:	c1 e1 05             	shl    ecx,0x5
 1400f43:	45 85 d2             	test   r10d,r10d
 1400f46:	41 0f 45 ca          	cmovne ecx,r10d
 1400f4a:	0f 94 c2             	sete   dl
 1400f4d:	20 d0                	and    al,dl
 1400f4f:	0f b6 c0             	movzx  eax,al
 1400f52:	44 01 c8             	add    eax,r9d
 1400f55:	29 cf                	sub    edi,ecx
 1400f57:	89 7b 18             	mov    DWORD PTR [rbx+0x18],edi
 1400f5a:	89 43 14             	mov    DWORD PTR [rbx+0x14],eax
 1400f5d:	6a 01                	push   0x1
 1400f5f:	5d                   	pop    rbp
 1400f60:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1400f67:	00 00 
 1400f69:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 1400f6e:	75 11                	jne    1400f81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246505>
 1400f70:	89 e8                	mov    eax,ebp
 1400f72:	48 83 c4 18          	add    rsp,0x18
 1400f76:	5b                   	pop    rbx
 1400f77:	41 5c                	pop    r12
 1400f79:	41 5d                	pop    r13
 1400f7b:	41 5e                	pop    r14
 1400f7d:	41 5f                	pop    r15
 1400f7f:	5d                   	pop    rbp
 1400f80:	c3                   	ret
 1400f81:	e8 2a eb 3e 00       	call   17efab0 <__stack_chk_fail@plt>
 1400f86:	45 89 dc             	mov    r12d,r11d
 1400f89:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 1400f8e:	48 89 df             	mov    rdi,rbx
 1400f91:	e8 1f fd ff ff       	call   1400cb5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246239>
 1400f96:	85 c0                	test   eax,eax
 1400f98:	0f 84 87 fe ff ff    	je     1400e25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2463a9>
 1400f9e:	03 6c 24 08          	add    ebp,DWORD PTR [rsp+0x8]
--
 1400fcd:	d3 e5                	shl    ebp,cl
 1400fcf:	44 89 6c 24 0c       	mov    DWORD PTR [rsp+0xc],r13d
 1400fd4:	44 09 ed             	or     ebp,r13d
 1400fd7:	89 e8                	mov    eax,ebp
 1400fd9:	d1 e8                	shr    eax,1
 1400fdb:	83 e5 01             	and    ebp,0x1
 1400fde:	f7 dd                	neg    ebp
 1400fe0:	31 c5                	xor    ebp,eax
 1400fe2:	41 89 2e             	mov    DWORD PTR [r14],ebp
 1400fe5:	49 83 c6 04          	add    r14,0x4
 1400fe9:	8b 53 0c             	mov    edx,DWORD PTR [rbx+0xc]
 1400fec:	8b 73 14             	mov    esi,DWORD PTR [rbx+0x14]
 1400fef:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]
 1400ff2:	31 ed                	xor    ebp,ebp
 1400ff4:	41 b8 00 00 00 00    	mov    r8d,0x0
 1400ffa:	3b 73 08             	cmp    esi,DWORD PTR [rbx+0x8]
 1400ffd:	73 0a                	jae    1401009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24658d>
 1400fff:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1401002:	44 8b 04 b0          	mov    r8d,DWORD PTR [rax+rsi*4]
 1401006:	41 d3 e0             	shl    r8d,cl
 1401009:	39 d6                	cmp    esi,edx
 140100b:	45 89 e3             	mov    r11d,r12d
 140100e:	72 12                	jb     1401022 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2465a6>
 1401010:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
 1401014:	4d 39 e6             	cmp    r14,r12
 1401017:	0f 82 69 ff ff ff    	jb     1400f86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24650a>
 140101d:	e9 0a fe ff ff       	jmp    1400e2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2463b0>
 1401022:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
 1401026:	e9 01 fe ff ff       	jmp    1400e2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2463b0>
 140102b:	41 57                	push   r15
 140102d:	41 56                	push   r14
 140102f:	53                   	push   rbx
 1401030:	49 89 f7             	mov    r15,rsi
 1401033:	48 89 fb             	mov    rbx,rdi
 1401036:	e8 25 de 3e 00       	call   17eee60 <realloc@plt>
 140103b:	49 89 c6             	mov    r14,rax
 140103e:	4d 85 ff             	test   r15,r15
--
 14011de:	21 c6                	and    esi,eax
 14011e0:	31 d6                	xor    esi,edx
 14011e2:	45 8b 71 14          	mov    r14d,DWORD PTR [r9+0x14]
 14011e6:	44 01 f1             	add    ecx,r14d
 14011e9:	01 f1                	add    ecx,esi
 14011eb:	81 c1 2a c6 87 47    	add    ecx,0x4787c62a
 14011f1:	c1 c1 0c             	rol    ecx,0xc
 14011f4:	01 c1                	add    ecx,eax
 14011f6:	89 c6                	mov    esi,eax
 14011f8:	44 31 c6             	xor    esi,r8d
 14011fb:	21 ce                	and    esi,ecx
 14011fd:	44 31 c6             	xor    esi,r8d
 1401200:	45 8b 61 18          	mov    r12d,DWORD PTR [r9+0x18]
 1401204:	44 01 e2             	add    edx,r12d
 1401207:	44 89 64 24 b4       	mov    DWORD PTR [rsp-0x4c],r12d
 140120c:	01 f2                	add    edx,esi
 140120e:	81 c2 13 46 30 a8    	add    edx,0xa8304613
 1401214:	c1 c2 11             	rol    edx,0x11
 1401217:	01 ca                	add    edx,ecx
 1401219:	89 ce                	mov    esi,ecx
 140121b:	31 c6                	xor    esi,eax
 140121d:	21 d6                	and    esi,edx
 140121f:	31 c6                	xor    esi,eax
 1401221:	41 8b 79 1c          	mov    edi,DWORD PTR [r9+0x1c]
 1401225:	89 7c 24 b0          	mov    DWORD PTR [rsp-0x50],edi
 1401229:	41 01 f8             	add    r8d,edi
 140122c:	41 01 f0             	add    r8d,esi
 140122f:	41 81 c0 01 95 46 fd 	add    r8d,0xfd469501
 1401236:	41 c1 c0 16          	rol    r8d,0x16
 140123a:	41 01 d0             	add    r8d,edx
 140123d:	89 d6                	mov    esi,edx
 140123f:	31 ce                	xor    esi,ecx
 1401241:	44 21 c6             	and    esi,r8d
 1401244:	31 ce                	xor    esi,ecx
 1401246:	41 8b 79 20          	mov    edi,DWORD PTR [r9+0x20]
 140124a:	89 7c 24 8c          	mov    DWORD PTR [rsp-0x74],edi
 140124e:	01 f8                	add    eax,edi
--
 14018ef:	4c 89 e6             	mov    rsi,r12
 14018f2:	e8 c9 d2 3e 00       	call   17eebc0 <calloc@plt>
 14018f7:	49 89 c5             	mov    r13,rax
 14018fa:	49 89 44 ef 10       	mov    QWORD PTR [r15+rbp*8+0x10],rax
 14018ff:	eb 07                	jmp    1401908 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246e8c>
 1401901:	49 89 5f 48          	mov    QWORD PTR [r15+0x48],rbx
 1401905:	49 89 dd             	mov    r13,rbx
 1401908:	0f 57 c0             	xorps  xmm0,xmm0
 140190b:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
 1401910:	bf 00 01 00 00       	mov    edi,0x100
 1401915:	e8 e6 d2 3e 00       	call   17eec00 <malloc@plt>
 140191a:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 140191e:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 1401922:	c6 00 00             	mov    BYTE PTR [rax],0x0
 1401925:	49 c7 45 20 00 01 00 	mov    QWORD PTR [r13+0x20],0x100
 140192c:	00 
 140192d:	48 ff c5             	inc    rbp
 1401930:	eb ae                	jmp    14018e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246e64>
 1401932:	48 83 c4 08          	add    rsp,0x8
 1401936:	5b                   	pop    rbx
 1401937:	41 5c                	pop    r12
 1401939:	41 5d                	pop    r13
 140193b:	41 5e                	pop    r14
 140193d:	41 5f                	pop    r15
 140193f:	5d                   	pop    rbp
 1401940:	c3                   	ret
 1401941:	41 57                	push   r15
 1401943:	41 56                	push   r14
 1401945:	41 54                	push   r12
 1401947:	53                   	push   rbx
 1401948:	50                   	push   rax
 1401949:	48 89 f3             	mov    rbx,rsi
 140194c:	49 89 fe             	mov    r14,rdi
 140194f:	48 83 c3 07          	add    rbx,0x7
 1401953:	48 83 e3 f8          	and    rbx,0xfffffffffffffff8
 1401957:	4c 8b 7f 70          	mov    r15,QWORD PTR [rdi+0x70]
 140195b:	4c 8b 67 78          	mov    r12,QWORD PTR [rdi+0x78]
--
 1401b3c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 1401b40:	e8 1b cc 3e 00       	call   17ee760 <free@plt>
 1401b45:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
 1401b49:	48 85 c0             	test   rax,rax
 1401b4c:	74 1d                	je     1401b6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2470ef>
 1401b4e:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 1401b51:	e8 be 21 00 00       	call   1403d14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249298>
 1401b56:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
 1401b5a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 1401b5d:	e8 fe cb 3e 00       	call   17ee760 <free@plt>
 1401b62:	49 8b 7d 10          	mov    rdi,QWORD PTR [r13+0x10]
 1401b66:	e8 f5 cb 3e 00       	call   17ee760 <free@plt>
 1401b6b:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
 1401b6f:	48 85 c0             	test   rax,rax
 1401b72:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
 1401b77:	74 1d                	je     1401b96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24711a>
 1401b79:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 1401b7c:	e8 93 21 00 00       	call   1403d14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249298>
 1401b81:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
 1401b85:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 1401b88:	e8 d3 cb 3e 00       	call   17ee760 <free@plt>
 1401b8d:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
 1401b91:	e8 ca cb 3e 00       	call   17ee760 <free@plt>
 1401b96:	49 8b 7d 58          	mov    rdi,QWORD PTR [r13+0x58]
 1401b9a:	48 85 ff             	test   rdi,rdi
 1401b9d:	74 41                	je     1401be0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247164>
 1401b9f:	4d 85 ff             	test   r15,r15
 1401ba2:	74 37                	je     1401bdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24715f>
 1401ba4:	41 83 7f 18 00       	cmp    DWORD PTR [r15+0x18],0x0
 1401ba9:	7e 30                	jle    1401bdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24715f>
 1401bab:	31 db                	xor    ebx,ebx
 1401bad:	4c 8d 35 dc d7 46 00 	lea    r14,[rip+0x46d7dc]        # 186f390 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ba78>
 1401bb4:	49 63 84 9f 28 05 00 	movsxd rax,DWORD PTR [r15+rbx*4+0x528]
 1401bbb:	00 
 1401bbc:	49 8b 04 c6          	mov    rax,QWORD PTR [r14+rax*8]
 1401bc0:	49 8b 4d 58          	mov    rcx,QWORD PTR [r13+0x58]
 1401bc4:	48 8b 3c d9          	mov    rdi,QWORD PTR [rcx+rbx*8]
 1401bc8:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1401bcb:	48 ff c3             	inc    rbx
 1401bce:	49 63 47 18          	movsxd rax,DWORD PTR [r15+0x18]
 1401bd2:	48 39 c3             	cmp    rbx,rax
 1401bd5:	7c dd                	jl     1401bb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247138>
 1401bd7:	49 8b 7d 58          	mov    rdi,QWORD PTR [r13+0x58]
 1401bdb:	e8 80 cb 3e 00       	call   17ee760 <free@plt>
 1401be0:	49 8b 7d 60          	mov    rdi,QWORD PTR [r13+0x60]
 1401be4:	48 85 ff             	test   rdi,rdi
 1401be7:	74 41                	je     1401c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2471ae>
 1401be9:	4d 85 ff             	test   r15,r15
 1401bec:	74 37                	je     1401c25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2471a9>
 1401bee:	41 83 7f 1c 00       	cmp    DWORD PTR [r15+0x1c],0x0
 1401bf3:	7e 30                	jle    1401c25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2471a9>
 1401bf5:	31 db                	xor    ebx,ebx
 1401bf7:	4c 8d 35 a2 d7 46 00 	lea    r14,[rip+0x46d7a2]        # 186f3a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ba88>
 1401bfe:	49 63 84 9f 28 08 00 	movsxd rax,DWORD PTR [r15+rbx*4+0x828]
 1401c05:	00 
 1401c06:	49 8b 04 c6          	mov    rax,QWORD PTR [r14+rax*8]
 1401c0a:	49 8b 4d 60          	mov    rcx,QWORD PTR [r13+0x60]
 1401c0e:	48 8b 3c d9          	mov    rdi,QWORD PTR [rcx+rbx*8]
 1401c12:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1401c15:	48 ff c3             	inc    rbx
 1401c18:	49 63 47 1c          	movsxd rax,DWORD PTR [r15+0x1c]
 1401c1c:	48 39 c3             	cmp    rbx,rax
 1401c1f:	7c dd                	jl     1401bfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247182>
 1401c21:	49 8b 7d 60          	mov    rdi,QWORD PTR [r13+0x60]
 1401c25:	e8 36 cb 3e 00       	call   17ee760 <free@plt>
 1401c2a:	4d 8b 7d 68          	mov    r15,QWORD PTR [r13+0x68]
 1401c2e:	4d 85 ff             	test   r15,r15
 1401c31:	0f 84 2a 01 00 00    	je     1401d61 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2472e5>
 1401c37:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1401c3c:	48 85 c0             	test   rax,rax
 1401c3f:	4c 89 64 24 18       	mov    QWORD PTR [rsp+0x18],r12
 1401c44:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
 1401c49:	0f 84 00 01 00 00    	je     1401d4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2472d3>
 1401c4f:	8b 40 24             	mov    eax,DWORD PTR [rax+0x24]
 1401c52:	85 c0                	test   eax,eax
 1401c54:	0f 8e f5 00 00 00    	jle    1401d4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2472d3>
 1401c5a:	31 ed                	xor    ebp,ebp
 1401c5c:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
 1401c61:	4d 85 ff             	test   r15,r15
 1401c64:	0f 84 d3 00 00 00    	je     1401d3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2472c1>
 1401c6a:	4c 6b e5 60          	imul   r12,rbp,0x60
 1401c6e:	4b 8b 7c 27 20       	mov    rdi,QWORD PTR [r15+r12*1+0x20]
 1401c73:	e8 e8 ca 3e 00       	call   17ee760 <free@plt>
 1401c78:	4b 8b 7c 27 28       	mov    rdi,QWORD PTR [r15+r12*1+0x28]
 1401c7d:	e8 de ca 3e 00       	call   17ee760 <free@plt>
 1401c82:	4b 8b 7c 27 30       	mov    rdi,QWORD PTR [r15+r12*1+0x30]
 1401c87:	e8 d4 ca 3e 00       	call   17ee760 <free@plt>
 1401c8c:	4b 83 7c 27 10 00    	cmp    QWORD PTR [r15+r12*1+0x10],0x0
 1401c92:	74 49                	je     1401cdd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247261>
 1401c94:	4b 8d 1c 27          	lea    rbx,[r15+r12*1]
 1401c98:	48 83 c3 10          	add    rbx,0x10
 1401c9c:	45 31 f6             	xor    r14d,r14d
 1401c9f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1401ca2:	4a 8b 3c f0          	mov    rdi,QWORD PTR [rax+r14*8]
 1401ca6:	45 31 ed             	xor    r13d,r13d
--
 1401d2b:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
 1401d2f:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1401d34:	8b 40 24             	mov    eax,DWORD PTR [rax+0x24]
 1401d37:	4d 8b 7d 68          	mov    r15,QWORD PTR [r13+0x68]
 1401d3b:	eb 03                	jmp    1401d40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2472c4>
 1401d3d:	45 31 ff             	xor    r15d,r15d
 1401d40:	48 ff c5             	inc    rbp
 1401d43:	48 63 c8             	movsxd rcx,eax
 1401d46:	48 39 cd             	cmp    rbp,rcx
 1401d49:	0f 8c 12 ff ff ff    	jl     1401c61 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2471e5>
 1401d4f:	4c 89 ff             	mov    rdi,r15
 1401d52:	e8 09 ca 3e 00       	call   17ee760 <free@plt>
 1401d57:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
 1401d5c:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
 1401d61:	49 8b 7d 70          	mov    rdi,QWORD PTR [r13+0x70]
 1401d65:	e8 f6 c9 3e 00       	call   17ee760 <free@plt>
 1401d6a:	0f 57 c0             	xorps  xmm0,xmm0
 1401d6d:	41 0f 11 85 d0 00 00 	movups XMMWORD PTR [r13+0xd0],xmm0
 1401d74:	00 
 1401d75:	41 0f 11 85 c0 00 00 	movups XMMWORD PTR [r13+0xc0],xmm0
 1401d7c:	00 
 1401d7d:	41 0f 11 85 b0 00 00 	movups XMMWORD PTR [r13+0xb0],xmm0
 1401d84:	00 
 1401d85:	41 0f 11 85 a0 00 00 	movups XMMWORD PTR [r13+0xa0],xmm0
 1401d8c:	00 
 1401d8d:	41 0f 11 85 90 00 00 	movups XMMWORD PTR [r13+0x90],xmm0
 1401d94:	00 
 1401d95:	49 8d 7d 20          	lea    rdi,[r13+0x20]
 1401d99:	e8 c2 65 00 00       	call   1408360 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24d8e4>
 1401d9e:	49 8d 7d 38          	lea    rdi,[r13+0x38]
 1401da2:	e8 b9 65 00 00       	call   1408360 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24d8e4>
 1401da7:	49 8b 7c 24 10       	mov    rdi,QWORD PTR [r12+0x10]
 1401dac:	48 85 ff             	test   rdi,rdi
 1401daf:	74 36                	je     1401de7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24736b>
 1401db1:	48 85 ed             	test   rbp,rbp
 1401db4:	74 22                	je     1401dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24735c>
 1401db6:	83 7d 04 00          	cmp    DWORD PTR [rbp+0x4],0x0
 1401dba:	7e 1c                	jle    1401dd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24735c>
 1401dbc:	31 db                	xor    ebx,ebx
 1401dbe:	48 8b 3c df          	mov    rdi,QWORD PTR [rdi+rbx*8]
 1401dc2:	e8 99 c9 3e 00       	call   17ee760 <free@plt>
 1401dc7:	48 ff c3             	inc    rbx
 1401dca:	48 63 45 04          	movsxd rax,DWORD PTR [rbp+0x4]
 1401dce:	49 8b 7c 24 10       	mov    rdi,QWORD PTR [r12+0x10]
 1401dd3:	48 39 c3             	cmp    rbx,rax
 1401dd6:	7c e6                	jl     1401dbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247342>
 1401dd8:	e8 83 c9 3e 00       	call   17ee760 <free@plt>
 1401ddd:	49 8b 7c 24 18       	mov    rdi,QWORD PTR [r12+0x18]
 1401de2:	e8 79 c9 3e 00       	call   17ee760 <free@plt>
 1401de7:	4d 85 ed             	test   r13,r13
 1401dea:	74 29                	je     1401e15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247399>
 1401dec:	49 8b 7d 78          	mov    rdi,QWORD PTR [r13+0x78]
 1401df0:	e8 6b c9 3e 00       	call   17ee760 <free@plt>
 1401df5:	49 8b bd 80 00 00 00 	mov    rdi,QWORD PTR [r13+0x80]
 1401dfc:	e8 5f c9 3e 00       	call   17ee760 <free@plt>
 1401e01:	49 8b bd 88 00 00 00 	mov    rdi,QWORD PTR [r13+0x88]
 1401e08:	e8 53 c9 3e 00       	call   17ee760 <free@plt>
 1401e0d:	4c 89 ef             	mov    rdi,r13
 1401e10:	e8 4b c9 3e 00       	call   17ee760 <free@plt>
 1401e15:	ba 90 00 00 00       	mov    edx,0x90
 1401e1a:	4c 89 e7             	mov    rdi,r12
 1401e1d:	31 f6                	xor    esi,esi
 1401e1f:	48 83 c4 28          	add    rsp,0x28
 1401e23:	5b                   	pop    rbx
 1401e24:	41 5c                	pop    r12
 1401e26:	41 5d                	pop    r13
 1401e28:	41 5e                	pop    r14
 1401e2a:	41 5f                	pop    r15
 1401e2c:	5d                   	pop    rbp
 1401e2d:	e9 5e cd 3e 00       	jmp    17eeb90 <memset@plt>
 1401e32:	48 8b 97 88 00 00 00 	mov    rdx,QWORD PTR [rdi+0x88]
 1401e39:	48 85 d2             	test   rdx,rdx
--
 1401f18:	41 89 46 50          	mov    DWORD PTR [r14+0x50],eax
 1401f1c:	6a 08                	push   0x8
 1401f1e:	5e                   	pop    rsi
 1401f1f:	4c 89 e7             	mov    rdi,r12
 1401f22:	e8 99 cc 3e 00       	call   17eebc0 <calloc@plt>
 1401f27:	48 89 c5             	mov    rbp,rax
 1401f2a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 1401f2e:	4c 89 e7             	mov    rdi,r12
 1401f31:	6a 08                	push   0x8
 1401f33:	5e                   	pop    rsi
 1401f34:	e8 87 cc 3e 00       	call   17eebc0 <calloc@plt>
 1401f39:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 1401f3e:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 1401f42:	6a 20                	push   0x20
 1401f44:	5e                   	pop    rsi
 1401f45:	4c 89 e7             	mov    rdi,r12
 1401f48:	e8 73 cc 3e 00       	call   17eebc0 <calloc@plt>
 1401f4d:	49 89 c4             	mov    r12,rax
 1401f50:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 1401f54:	6a 01                	push   0x1
 1401f56:	5f                   	pop    rdi
 1401f57:	6a 20                	push   0x20
 1401f59:	5e                   	pop    rsi
 1401f5a:	e8 61 cc 3e 00       	call   17eebc0 <calloc@plt>
 1401f5f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1401f64:	48 89 01             	mov    QWORD PTR [rcx],rax
 1401f67:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
 1401f6b:	40 8a 6c 24 08       	mov    bpl,BYTE PTR [rsp+0x8]
 1401f70:	89 e9                	mov    ecx,ebp
 1401f72:	48 d3 fe             	sar    rsi,cl
 1401f75:	4c 89 e7             	mov    rdi,r12
 1401f78:	e8 22 1b 00 00       	call   1403a9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249023>
 1401f7d:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 1401f81:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 1401f84:	49 8b 75 08          	mov    rsi,QWORD PTR [r13+0x8]
 1401f88:	89 e9                	mov    ecx,ebp
 1401f8a:	48 d3 fe             	sar    rsi,cl
 1401f8d:	e8 0d 1b 00 00       	call   1403a9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249023>
 1401f92:	41 8b 7d 00          	mov    edi,DWORD PTR [r13+0x0]
 1401f96:	e8 95 59 00 00       	call   1407930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ceb4>
 1401f9b:	83 c0 f9             	add    eax,0xfffffff9
 1401f9e:	41 89 46 08          	mov    DWORD PTR [r14+0x8],eax
 1401fa2:	41 8b 6d 08          	mov    ebp,DWORD PTR [r13+0x8]
 1401fa6:	89 ef                	mov    edi,ebp
 1401fa8:	e8 83 59 00 00       	call   1407930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ceb4>
 1401fad:	83 c0 f9             	add    eax,0xfffffff9
 1401fb0:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 1401fb5:	41 89 46 0c          	mov    DWORD PTR [r14+0xc],eax
 1401fb9:	49 83 bd 28 13 00 00 	cmp    QWORD PTR [r13+0x1328],0x0
 1401fc0:	00 
 1401fc1:	0f 84 2e 01 00 00    	je     14020f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247679>
 1401fc7:	89 6b 20             	mov    DWORD PTR [rbx+0x20],ebp
 1401fca:	49 63 7f 04          	movsxd rdi,DWORD PTR [r15+0x4]
 1401fce:	48 c1 e7 03          	shl    rdi,0x3
 1401fd2:	e8 29 cc 3e 00       	call   17eec00 <malloc@plt>
 1401fd7:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 1401fdb:	49 63 7f 04          	movsxd rdi,DWORD PTR [r15+0x4]
 1401fdf:	48 c1 e7 03          	shl    rdi,0x3
 1401fe3:	e8 18 cc 3e 00       	call   17eec00 <malloc@plt>
 1401fe8:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 1401fec:	41 83 7f 04 00       	cmp    DWORD PTR [r15+0x4],0x0
 1401ff1:	7e 27                	jle    140201a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24759e>
 1401ff3:	45 31 f6             	xor    r14d,r14d
 1401ff6:	6a 04                	push   0x4
 1401ff8:	41 5c                	pop    r12
 1401ffa:	48 63 7b 20          	movsxd rdi,DWORD PTR [rbx+0x20]
 1401ffe:	4c 89 e6             	mov    rsi,r12
 1402001:	e8 ba cb 3e 00       	call   17eebc0 <calloc@plt>
 1402006:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
 140200a:	4a 89 04 f1          	mov    QWORD PTR [rcx+r14*8],rax
 140200e:	49 ff c6             	inc    r14
 1402011:	49 63 47 04          	movsxd rax,DWORD PTR [r15+0x4]
 1402015:	49 39 c6             	cmp    r14,rax
 1402018:	7c e0                	jl     1401ffa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24757e>
 140201a:	0f 57 c0             	xorps  xmm0,xmm0
 140201d:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
 1402021:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 1402025:	6a 02                	push   0x2
 1402027:	59                   	pop    rcx
 1402028:	48 99                	cqo
 140202a:	48 f7 f9             	idiv   rcx
 140202d:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
 1402031:	89 43 24             	mov    DWORD PTR [rbx+0x24],eax
 1402034:	4d 63 7d 18          	movsxd r15,DWORD PTR [r13+0x18]
 1402038:	6a 08                	push   0x8
 140203a:	41 5c                	pop    r12
 140203c:	4c 89 ff             	mov    rdi,r15
 140203f:	4c 89 e6             	mov    rsi,r12
 1402042:	e8 79 cb 3e 00       	call   17eebc0 <calloc@plt>
 1402047:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 140204c:	48 89 41 58          	mov    QWORD PTR [rcx+0x58],rax
 1402050:	41 8b 6d 1c          	mov    ebp,DWORD PTR [r13+0x1c]
 1402054:	48 63 fd             	movsxd rdi,ebp
 1402057:	4c 89 e6             	mov    rsi,r12
 140205a:	49 89 cc             	mov    r12,rcx
 140205d:	e8 5e cb 3e 00       	call   17eebc0 <calloc@plt>
 1402062:	49 89 44 24 60       	mov    QWORD PTR [r12+0x60],rax
 1402067:	4d 85 ff             	test   r15,r15
 140206a:	7e 3d                	jle    14020a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24762d>
 140206c:	45 31 f6             	xor    r14d,r14d
 140206f:	4c 8d 3d 1a d3 46 00 	lea    r15,[rip+0x46d31a]        # 186f390 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ba78>
 1402076:	4b 63 84 b5 28 05 00 	movsxd rax,DWORD PTR [r13+r14*4+0x528]
 140207d:	00 
 140207e:	49 8b 04 c7          	mov    rax,QWORD PTR [r15+rax*8]
 1402082:	4b 8b b4 f5 28 06 00 	mov    rsi,QWORD PTR [r13+r14*8+0x628]
 1402089:	00 
 140208a:	48 89 df             	mov    rdi,rbx
 140208d:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1402090:	49 8b 4c 24 58       	mov    rcx,QWORD PTR [r12+0x58]
 1402095:	4a 89 04 f1          	mov    QWORD PTR [rcx+r14*8],rax
 1402099:	49 ff c6             	inc    r14
 140209c:	49 63 45 18          	movsxd rax,DWORD PTR [r13+0x18]
 14020a0:	49 39 c6             	cmp    r14,rax
 14020a3:	7c d1                	jl     1402076 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2475fa>
 14020a5:	41 8b 6d 1c          	mov    ebp,DWORD PTR [r13+0x1c]
 14020a9:	85 ed                	test   ebp,ebp
 14020ab:	7e 39                	jle    14020e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24766a>
 14020ad:	45 31 f6             	xor    r14d,r14d
 14020b0:	4c 8d 3d e9 d2 46 00 	lea    r15,[rip+0x46d2e9]        # 186f3a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ba88>
 14020b7:	4b 63 84 b5 28 08 00 	movsxd rax,DWORD PTR [r13+r14*4+0x828]
 14020be:	00 
 14020bf:	49 8b 04 c7          	mov    rax,QWORD PTR [r15+rax*8]
 14020c3:	4b 8b b4 f5 28 09 00 	mov    rsi,QWORD PTR [r13+r14*8+0x928]
 14020ca:	00 
 14020cb:	48 89 df             	mov    rdi,rbx
 14020ce:	ff 50 10             	call   QWORD PTR [rax+0x10]
 14020d1:	49 8b 4c 24 60       	mov    rcx,QWORD PTR [r12+0x60]
 14020d6:	4a 89 04 f1          	mov    QWORD PTR [rcx+r14*8],rax
 14020da:	49 ff c6             	inc    r14
 14020dd:	49 63 45 1c          	movsxd rax,DWORD PTR [r13+0x1c]
 14020e1:	49 39 c6             	cmp    r14,rax
 14020e4:	7c d1                	jl     14020b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24763b>
 14020e6:	48 89 df             	mov    rdi,rbx
 14020e9:	e8 44 fd ff ff       	call   1401e32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2473b6>
 14020ee:	31 c0                	xor    eax,eax
 14020f0:	e9 cd fd ff ff       	jmp    1401ec2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247446>
--
 14027c0:	8b 57 24             	mov    edx,DWORD PTR [rdi+0x24]
 14027c3:	39 d1                	cmp    ecx,edx
 14027c5:	7d 46                	jge    140280d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247d91>
 14027c7:	48 85 f6             	test   rsi,rsi
 14027ca:	74 3d                	je     1402809 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247d8d>
 14027cc:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 14027d0:	83 78 04 00          	cmp    DWORD PTR [rax+0x4],0x0
 14027d4:	7e 26                	jle    14027fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247d80>
 14027d6:	31 c9                	xor    ecx,ecx
 14027d8:	48 63 57 28          	movsxd rdx,DWORD PTR [rdi+0x28]
 14027dc:	48 c1 e2 02          	shl    rdx,0x2
 14027e0:	4c 8b 47 10          	mov    r8,QWORD PTR [rdi+0x10]
 14027e4:	4c 8b 4f 18          	mov    r9,QWORD PTR [rdi+0x18]
 14027e8:	49 03 14 c8          	add    rdx,QWORD PTR [r8+rcx*8]
 14027ec:	49 89 14 c9          	mov    QWORD PTR [r9+rcx*8],rdx
 14027f0:	48 ff c1             	inc    rcx
 14027f3:	48 63 50 04          	movsxd rdx,DWORD PTR [rax+0x4]
 14027f7:	48 39 d1             	cmp    rcx,rdx
 14027fa:	7c dc                	jl     14027d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247d5c>
 14027fc:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
 1402800:	48 89 06             	mov    QWORD PTR [rsi],rax
 1402803:	8b 57 24             	mov    edx,DWORD PTR [rdi+0x24]
 1402806:	8b 4f 28             	mov    ecx,DWORD PTR [rdi+0x28]
 1402809:	29 ca                	sub    edx,ecx
 140280b:	89 d0                	mov    eax,edx
 140280d:	c3                   	ret
 140280e:	48 85 ff             	test   rdi,rdi
 1402811:	74 58                	je     140286b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247def>
 1402813:	41 56                	push   r14
 1402815:	53                   	push   rbx
 1402816:	50                   	push   rax
 1402817:	48 89 fb             	mov    rbx,rdi
 140281a:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 140281d:	48 85 ff             	test   rdi,rdi
 1402820:	74 26                	je     1402848 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247dcc>
 1402822:	83 7b 10 00          	cmp    DWORD PTR [rbx+0x10],0x0
 1402826:	7e 1b                	jle    1402843 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247dc7>
 1402828:	45 31 f6             	xor    r14d,r14d
 140282b:	4a 8b 3c f7          	mov    rdi,QWORD PTR [rdi+r14*8]
 140282f:	e8 2c bf 3e 00       	call   17ee760 <free@plt>
 1402834:	49 ff c6             	inc    r14
 1402837:	48 63 43 10          	movsxd rax,DWORD PTR [rbx+0x10]
 140283b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 140283e:	49 39 c6             	cmp    r14,rax
 1402841:	7c e8                	jl     140282b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247daf>
 1402843:	e8 18 bf 3e 00       	call   17ee760 <free@plt>
 1402848:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 140284c:	e8 0f bf 3e 00       	call   17ee760 <free@plt>
 1402851:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 1402855:	e8 06 bf 3e 00       	call   17ee760 <free@plt>
 140285a:	0f 57 c0             	xorps  xmm0,xmm0
 140285d:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 1402861:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 1402864:	48 83 c4 08          	add    rsp,0x8
 1402868:	5b                   	pop    rbx
 1402869:	41 5e                	pop    r14
 140286b:	c3                   	ret
 140286c:	53                   	push   rbx
 140286d:	48 89 fb             	mov    rbx,rdi
 1402870:	0f 57 c0             	xorps  xmm0,xmm0
 1402873:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
 1402877:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
 140287b:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 140287e:	6a 01                	push   0x1
 1402880:	5f                   	pop    rdi
 1402881:	be 98 16 00 00       	mov    esi,0x1698
 1402886:	e8 35 c3 3e 00       	call   17eebc0 <calloc@plt>
 140288b:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 140288f:	5b                   	pop    rbx
 1402890:	c3                   	ret
 1402891:	41 57                	push   r15
 1402893:	41 56                	push   r14
 1402895:	41 54                	push   r12
--
 14028cf:	7e 24                	jle    14028f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247e79>
 14028d1:	45 31 ff             	xor    r15d,r15d
 14028d4:	4b 8b bc fe 28 03 00 	mov    rdi,QWORD PTR [r14+r15*8+0x328]
 14028db:	00 
 14028dc:	48 85 ff             	test   rdi,rdi
 14028df:	74 09                	je     14028ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247e6e>
 14028e1:	e8 0a 2f 65 ff       	call   a557f0 <_ZdlPv@@Base>
 14028e6:	41 8b 46 14          	mov    eax,DWORD PTR [r14+0x14]
 14028ea:	49 ff c7             	inc    r15
 14028ed:	48 63 c8             	movsxd rcx,eax
 14028f0:	49 39 cf             	cmp    r15,rcx
 14028f3:	7c df                	jl     14028d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247e58>
 14028f5:	41 8b 46 18          	mov    eax,DWORD PTR [r14+0x18]
 14028f9:	85 c0                	test   eax,eax
 14028fb:	7e 35                	jle    1402932 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247eb6>
 14028fd:	45 31 ff             	xor    r15d,r15d
 1402900:	4c 8d 25 89 ca 46 00 	lea    r12,[rip+0x46ca89]        # 186f390 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ba78>
 1402907:	4b 8b bc fe 28 06 00 	mov    rdi,QWORD PTR [r14+r15*8+0x628]
 140290e:	00 
 140290f:	48 85 ff             	test   rdi,rdi
 1402912:	74 13                	je     1402927 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247eab>
 1402914:	4b 63 84 be 28 05 00 	movsxd rax,DWORD PTR [r14+r15*4+0x528]
 140291b:	00 
 140291c:	49 8b 04 c4          	mov    rax,QWORD PTR [r12+rax*8]
 1402920:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1402923:	41 8b 46 18          	mov    eax,DWORD PTR [r14+0x18]
 1402927:	49 ff c7             	inc    r15
 140292a:	48 63 c8             	movsxd rcx,eax
 140292d:	49 39 cf             	cmp    r15,rcx
 1402930:	7c d5                	jl     1402907 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247e8b>
 1402932:	41 8b 46 1c          	mov    eax,DWORD PTR [r14+0x1c]
 1402936:	85 c0                	test   eax,eax
 1402938:	7e 35                	jle    140296f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247ef3>
 140293a:	45 31 ff             	xor    r15d,r15d
 140293d:	4c 8d 25 5c ca 46 00 	lea    r12,[rip+0x46ca5c]        # 186f3a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ba88>
 1402944:	4b 8b bc fe 28 09 00 	mov    rdi,QWORD PTR [r14+r15*8+0x928]
 140294b:	00 
 140294c:	48 85 ff             	test   rdi,rdi
 140294f:	74 13                	je     1402964 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247ee8>
 1402951:	4b 63 84 be 28 08 00 	movsxd rax,DWORD PTR [r14+r15*4+0x828]
 1402958:	00 
 1402959:	49 8b 04 c4          	mov    rax,QWORD PTR [r12+rax*8]
 140295d:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1402960:	41 8b 46 1c          	mov    eax,DWORD PTR [r14+0x1c]
 1402964:	49 ff c7             	inc    r15
 1402967:	48 63 c8             	movsxd rcx,eax
 140296a:	49 39 cf             	cmp    r15,rcx
 140296d:	7c d5                	jl     1402944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247ec8>
 140296f:	41 83 7e 20 00       	cmp    DWORD PTR [r14+0x20],0x0
 1402974:	7e 3c                	jle    14029b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247f36>
 1402976:	45 31 ff             	xor    r15d,r15d
 1402979:	45 31 e4             	xor    r12d,r12d
 140297c:	4b 8b bc e6 28 0b 00 	mov    rdi,QWORD PTR [r14+r12*8+0xb28]
 1402983:	00 
 1402984:	48 85 ff             	test   rdi,rdi
 1402987:	74 05                	je     140298e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247f12>
 1402989:	e8 cb 50 00 00       	call   1407a59 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cfdd>
 140298e:	49 8b be 28 13 00 00 	mov    rdi,QWORD PTR [r14+0x1328]
 1402995:	48 85 ff             	test   rdi,rdi
 1402998:	74 08                	je     14029a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247f26>
 140299a:	4c 01 ff             	add    rdi,r15
 140299d:	e8 dd 50 00 00       	call   1407a7f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24d003>
 14029a2:	49 ff c4             	inc    r12
 14029a5:	49 63 46 20          	movsxd rax,DWORD PTR [r14+0x20]
 14029a9:	49 83 c7 60          	add    r15,0x60
 14029ad:	49 39 c4             	cmp    r12,rax
 14029b0:	7c ca                	jl     140297c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247f00>
--
 1402a26:	00 00 
 1402a28:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 1402a2d:	48 85 d2             	test   rdx,rdx
 1402a30:	0f 84 80 07 00 00    	je     14031b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24873a>
 1402a36:	49 89 d7             	mov    r15,rdx
 1402a39:	49 89 f6             	mov    r14,rsi
 1402a3c:	48 89 fb             	mov    rbx,rdi
 1402a3f:	48 8b 02             	mov    rax,QWORD PTR [rdx]
 1402a42:	48 63 4a 08          	movsxd rcx,DWORD PTR [rdx+0x8]
 1402a46:	0f 57 c0             	xorps  xmm0,xmm0
 1402a49:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
 1402a4e:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
 1402a53:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 1402a57:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 1402a5b:	49 89 4d 20          	mov    QWORD PTR [r13+0x20],rcx
 1402a5f:	6a 08                	push   0x8
 1402a61:	5e                   	pop    rsi
 1402a62:	4c 89 ef             	mov    rdi,r13
 1402a65:	e8 ce 5c 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402a6a:	48 8d 6c 24 68       	lea    rbp,[rsp+0x68]
 1402a6f:	83 65 00 00          	and    DWORD PTR [rbp+0x0],0x0
 1402a73:	49 89 c4             	mov    r12,rax
 1402a76:	66 83 65 04 00       	and    WORD PTR [rbp+0x4],0x0
 1402a7b:	6a 06                	push   0x6
 1402a7d:	5a                   	pop    rdx
 1402a7e:	4c 89 ef             	mov    rdi,r13
 1402a81:	48 89 ee             	mov    rsi,rbp
 1402a84:	e8 14 0c 00 00       	call   140369d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248c21>
 1402a89:	48 8d 35 7e 7d f4 fe 	lea    rsi,[rip+0xfffffffffef47d7e]        # 34a80e <_ZTSSt12bad_any_cast@@Base-0x459ba>
 1402a90:	6a 06                	push   0x6
 1402a92:	5a                   	pop    rdx
 1402a93:	48 89 ef             	mov    rdi,rbp
 1402a96:	e8 d5 b4 3e 00       	call   17edf70 <memcmp@plt>
 1402a9b:	89 c1                	mov    ecx,eax
 1402a9d:	b8 7c ff ff ff       	mov    eax,0xffffff7c
 1402aa2:	85 c9                	test   ecx,ecx
 1402aa4:	0f 85 11 07 00 00    	jne    14031bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24873f>
--
 1402b2b:	89 ee                	mov    esi,ebp
 1402b2d:	e8 06 5c 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402b32:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
 1402b36:	4c 89 f7             	mov    rdi,r14
 1402b39:	89 ee                	mov    esi,ebp
 1402b3b:	e8 f8 5b 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402b40:	48 98                	cdqe
 1402b42:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 1402b46:	4c 89 f7             	mov    rdi,r14
 1402b49:	89 ee                	mov    esi,ebp
 1402b4b:	e8 e8 5b 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402b50:	48 98                	cdqe
 1402b52:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 1402b56:	4c 89 f7             	mov    rdi,r14
 1402b59:	89 ee                	mov    esi,ebp
 1402b5b:	e8 d8 5b 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402b60:	48 98                	cdqe
 1402b62:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 1402b66:	6a 04                	push   0x4
 1402b68:	5e                   	pop    rsi
 1402b69:	4c 89 f7             	mov    rdi,r14
 1402b6c:	e8 c7 5b 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402b71:	85 c0                	test   eax,eax
 1402b73:	0f 88 35 06 00 00    	js     14031ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248732>
 1402b79:	6a 01                	push   0x1
 1402b7b:	5d                   	pop    rbp
 1402b7c:	89 ea                	mov    edx,ebp
 1402b7e:	89 c1                	mov    ecx,eax
 1402b80:	d3 e2                	shl    edx,cl
 1402b82:	48 63 c2             	movsxd rax,edx
 1402b85:	49 89 07             	mov    QWORD PTR [r15],rax
 1402b88:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1402b8d:	6a 04                	push   0x4
 1402b8f:	5e                   	pop    rsi
 1402b90:	e8 a3 5b 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402b95:	85 c0                	test   eax,eax
 1402b97:	0f 88 11 06 00 00    	js     14031ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248732>
--
 1402bd9:	0f 8f cf 05 00 00    	jg     14031ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248732>
 1402bdf:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1402be4:	6a 01                	push   0x1
 1402be6:	5e                   	pop    rsi
 1402be7:	e8 4c 5b 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402bec:	48 89 c1             	mov    rcx,rax
 1402bef:	31 c0                	xor    eax,eax
 1402bf1:	48 83 f9 01          	cmp    rcx,0x1
 1402bf5:	0f 85 b3 05 00 00    	jne    14031ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248732>
 1402bfb:	e9 bb 05 00 00       	jmp    14031bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24873f>
 1402c00:	48 83 7b 08 00       	cmp    QWORD PTR [rbx+0x8],0x0
 1402c05:	0f 84 b0 05 00 00    	je     14031bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24873f>
 1402c0b:	49 83 7e 18 00       	cmp    QWORD PTR [r14+0x18],0x0
 1402c10:	0f 85 a5 05 00 00    	jne    14031bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24873f>
 1402c16:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1402c1b:	6a 20                	push   0x20
 1402c1d:	5e                   	pop    rsi
 1402c1e:	e8 15 5b 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402c23:	48 89 c3             	mov    rbx,rax
 1402c26:	85 db                	test   ebx,ebx
 1402c28:	0f 88 33 01 00 00    	js     1402d61 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2482e5>
 1402c2e:	89 d8                	mov    eax,ebx
 1402c30:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
 1402c35:	48 83 c1 f8          	add    rcx,0xfffffffffffffff8
 1402c39:	48 39 c8             	cmp    rax,rcx
 1402c3c:	0f 8f 1f 01 00 00    	jg     1402d61 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2482e5>
 1402c42:	89 df                	mov    edi,ebx
 1402c44:	ff c7                	inc    edi
 1402c46:	6a 01                	push   0x1
 1402c48:	5e                   	pop    rsi
 1402c49:	e8 72 bf 3e 00       	call   17eebc0 <calloc@plt>
 1402c4e:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 1402c52:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
 1402c57:	4c 89 ff             	mov    rdi,r15
 1402c5a:	48 89 c6             	mov    rsi,rax
 1402c5d:	89 da                	mov    edx,ebx
 1402c5f:	e8 39 0a 00 00       	call   140369d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248c21>
 1402c64:	6a 20                	push   0x20
 1402c66:	5e                   	pop    rsi
 1402c67:	4c 89 ff             	mov    rdi,r15
 1402c6a:	e8 c9 5a 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402c6f:	48 89 c3             	mov    rbx,rax
 1402c72:	85 db                	test   ebx,ebx
 1402c74:	0f 88 e7 00 00 00    	js     1402d61 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2482e5>
 1402c7a:	41 89 df             	mov    r15d,ebx
 1402c7d:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
 1402c82:	8b 44 24 48          	mov    eax,DWORD PTR [rsp+0x48]
 1402c86:	83 c0 07             	add    eax,0x7
 1402c89:	99                   	cdq
 1402c8a:	f7 fd                	idiv   ebp
 1402c8c:	48 2b 4c 24 40       	sub    rcx,QWORD PTR [rsp+0x40]
 1402c91:	48 98                	cdqe
 1402c93:	48 01 c1             	add    rcx,rax
 1402c96:	48 c1 f9 02          	sar    rcx,0x2
 1402c9a:	49 39 cf             	cmp    r15,rcx
 1402c9d:	0f 8f be 00 00 00    	jg     1402d61 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2482e5>
--
 1402d4a:	6a 01                	push   0x1
 1402d4c:	5e                   	pop    rsi
 1402d4d:	e8 e6 59 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402d52:	48 89 c1             	mov    rcx,rax
 1402d55:	31 c0                	xor    eax,eax
 1402d57:	48 83 f9 01          	cmp    rcx,0x1
 1402d5b:	0f 84 5a 04 00 00    	je     14031bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24873f>
 1402d61:	4c 89 f7             	mov    rdi,r14
 1402d64:	e8 a5 fa ff ff       	call   140280e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247d92>
 1402d69:	e9 48 04 00 00       	jmp    14031b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24873a>
 1402d6e:	48 83 7b 08 00       	cmp    QWORD PTR [rbx+0x8],0x0
 1402d73:	0f 84 42 04 00 00    	je     14031bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24873f>
 1402d79:	49 83 7e 18 00       	cmp    QWORD PTR [r14+0x18],0x0
 1402d7e:	0f 84 37 04 00 00    	je     14031bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24873f>
 1402d84:	4c 8b 73 30          	mov    r14,QWORD PTR [rbx+0x30]
 1402d88:	4d 85 f6             	test   r14,r14
 1402d8b:	0f 84 f4 03 00 00    	je     1403185 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248709>
 1402d91:	41 83 7e 20 00       	cmp    DWORD PTR [r14+0x20],0x0
 1402d96:	0f 8f 1f 04 00 00    	jg     14031bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24873f>
 1402d9c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1402da1:	6a 08                	push   0x8
 1402da3:	5e                   	pop    rsi
 1402da4:	e8 8f 59 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402da9:	8d 48 01             	lea    ecx,[rax+0x1]
 1402dac:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 1402db1:	41 89 4e 20          	mov    DWORD PTR [r14+0x20],ecx
 1402db5:	3d fe ff ff 7f       	cmp    eax,0x7ffffffe
 1402dba:	0f 87 ee 03 00 00    	ja     14031ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248732>
 1402dc0:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
 1402dc5:	31 c9                	xor    ecx,ecx
 1402dc7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1402dcc:	48 63 40 20          	movsxd rax,DWORD PTR [rax+0x20]
 1402dd0:	48 39 c1             	cmp    rcx,rax
 1402dd3:	0f 8d 05 04 00 00    	jge    14031de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248762>
 1402dd9:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
 1402dde:	6a 01                	push   0x1
 1402de0:	5f                   	pop    rdi
--
 1402df5:	4c 89 f7             	mov    rdi,r14
 1402df8:	6a 18                	push   0x18
 1402dfa:	5e                   	pop    rsi
 1402dfb:	e8 38 59 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402e00:	48 3d 42 43 56 00    	cmp    rax,0x564342
 1402e06:	0f 85 80 03 00 00    	jne    140318c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248710>
 1402e0c:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
 1402e11:	4c 89 f7             	mov    rdi,r14
 1402e14:	6a 10                	push   0x10
 1402e16:	5e                   	pop    rsi
 1402e17:	e8 1c 59 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402e1c:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
 1402e21:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 1402e26:	49 89 04 24          	mov    QWORD PTR [r12],rax
 1402e2a:	4c 89 f7             	mov    rdi,r14
 1402e2d:	6a 18                	push   0x18
 1402e2f:	5e                   	pop    rsi
 1402e30:	e8 03 59 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402e35:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
 1402e3a:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
 1402e3e:	0f 84 48 03 00 00    	je     140318c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248710>
 1402e44:	49 89 c7             	mov    r15,rax
 1402e47:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 1402e4c:	e8 df 4a 00 00       	call   1407930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ceb4>
 1402e51:	89 c5                	mov    ebp,eax
 1402e53:	44 89 ff             	mov    edi,r15d
 1402e56:	e8 d5 4a 00 00       	call   1407930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ceb4>
 1402e5b:	01 e8                	add    eax,ebp
 1402e5d:	83 f8 18             	cmp    eax,0x18
 1402e60:	0f 8f 26 03 00 00    	jg     140318c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248710>
 1402e66:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
 1402e6b:	4c 89 f7             	mov    rdi,r14
 1402e6e:	6a 01                	push   0x1
 1402e70:	5e                   	pop    rsi
 1402e71:	e8 c2 58 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402e76:	83 f8 01             	cmp    eax,0x1
 1402e79:	0f 84 c3 00 00 00    	je     1402f42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2484c6>
 1402e7f:	85 c0                	test   eax,eax
 1402e81:	0f 85 05 03 00 00    	jne    140318c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248710>
 1402e87:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1402e8c:	6a 01                	push   0x1
 1402e8e:	5e                   	pop    rsi
 1402e8f:	e8 a4 58 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1402e94:	49 89 c5             	mov    r13,rax
 1402e97:	31 c0                	xor    eax,eax
 1402e99:	4d 85 ed             	test   r13,r13
 1402e9c:	0f 94 c0             	sete   al
--
 1403015:	fe c0                	inc    al
 1403017:	43 88 04 26          	mov    BYTE PTR [r14+r12*1],al
 140301b:	49 ff c4             	inc    r12
 140301e:	4d 39 e7             	cmp    r15,r12
 1403021:	75 db                	jne    1402ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248582>
 1403023:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
 1403028:	4c 89 e7             	mov    rdi,r12
 140302b:	6a 04                	push   0x4
 140302d:	5e                   	pop    rsi
 140302e:	e8 05 57 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403033:	49 89 c5             	mov    r13,rax
 1403036:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
 140303b:	44 89 6d 18          	mov    DWORD PTR [rbp+0x18],r13d
 140303f:	ff c8                	dec    eax
 1403041:	83 f8 02             	cmp    eax,0x2
 1403044:	73 77                	jae    14030bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248641>
 1403046:	4c 89 e7             	mov    rdi,r12
 1403049:	6a 20                	push   0x20
 140304b:	41 5e                	pop    r14
 140304d:	44 89 f6             	mov    esi,r14d
 1403050:	e8 e3 56 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403055:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
 1403059:	4c 89 e7             	mov    rdi,r12
 140305c:	44 89 f6             	mov    esi,r14d
 140305f:	e8 d4 56 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403064:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
 1403068:	4c 89 e7             	mov    rdi,r12
 140306b:	6a 04                	push   0x4
 140306d:	5e                   	pop    rsi
 140306e:	e8 c5 56 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403073:	49 89 c6             	mov    r14,rax
 1403076:	41 ff c6             	inc    r14d
 1403079:	44 89 75 30          	mov    DWORD PTR [rbp+0x30],r14d
 140307d:	4c 89 e7             	mov    rdi,r12
 1403080:	6a 01                	push   0x1
 1403082:	5e                   	pop    rsi
 1403083:	e8 b0 56 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403088:	89 45 34             	mov    DWORD PTR [rbp+0x34],eax
 140308b:	83 f8 ff             	cmp    eax,0xffffffff
 140308e:	0f 84 f8 00 00 00    	je     140318c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248710>
 1403094:	41 83 fd 02          	cmp    r13d,0x2
 1403098:	74 31                	je     14030cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24864f>
 140309a:	31 ff                	xor    edi,edi
 140309c:	41 83 fd 01          	cmp    r13d,0x1
 14030a0:	75 34                	jne    14030d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24865a>
 14030a2:	48 83 7c 24 18 00    	cmp    QWORD PTR [rsp+0x18],0x0
 14030a8:	6a f8                	push   0xfffffffffffffff8
 14030aa:	41 5f                	pop    r15
 14030ac:	74 2c                	je     14030da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24865e>
 14030ae:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 14030b3:	e8 d9 48 00 00       	call   1407991 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cf15>
 14030b8:	48 89 c7             	mov    rdi,rax
 14030bb:	eb 1d                	jmp    14030da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24865e>
 14030bd:	45 85 ed             	test   r13d,r13d
 14030c0:	0f 84 9b 00 00 00    	je     1403161 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2486e5>
 14030c6:	e9 c1 00 00 00       	jmp    140318c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248710>
 14030cb:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 14030d0:	41 0f af c7          	imul   eax,r15d
 14030d4:	89 c7                	mov    edi,eax
 14030d6:	6a f8                	push   0xfffffffffffffff8
 14030d8:	41 5f                	pop    r15
 14030da:	89 f8                	mov    eax,edi
 14030dc:	41 0f af c6          	imul   eax,r14d
 14030e0:	83 c0 07             	add    eax,0x7
 14030e3:	c1 f8 03             	sar    eax,0x3
 14030e6:	48 63 c8             	movsxd rcx,eax
 14030e9:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
 14030ee:	8b 44 24 48          	mov    eax,DWORD PTR [rsp+0x48]
 14030f2:	83 c0 07             	add    eax,0x7
 14030f5:	99                   	cdq
 14030f6:	41 f7 ff             	idiv   r15d
 14030f9:	48 98                	cdqe
 14030fb:	48 2b 74 24 40       	sub    rsi,QWORD PTR [rsp+0x40]
 1403100:	48 01 c6             	add    rsi,rax
 1403103:	48 39 ce             	cmp    rsi,rcx
 1403106:	0f 8c 80 00 00 00    	jl     140318c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248710>
 140310c:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
 1403111:	4c 63 ff             	movsxd r15,edi
 1403114:	4a 8d 3c fd 00 00 00 	lea    rdi,[r15*8+0x0]
 140311b:	00 
 140311c:	e8 df ba 3e 00       	call   17eec00 <malloc@plt>
 1403121:	49 89 c5             	mov    r13,rax
 1403124:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 1403129:	4c 89 68 38          	mov    QWORD PTR [rax+0x38],r13
 140312d:	45 85 ff             	test   r15d,r15d
 1403130:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]
 1403135:	7e 1b                	jle    1403152 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2486d6>
 1403137:	45 31 e4             	xor    r12d,r12d
 140313a:	48 89 ef             	mov    rdi,rbp
 140313d:	44 89 f6             	mov    esi,r14d
 1403140:	e8 f3 55 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403145:	4b 89 44 e5 00       	mov    QWORD PTR [r13+r12*8+0x0],rax
 140314a:	49 ff c4             	inc    r12
 140314d:	4d 39 e7             	cmp    r15,r12
 1403150:	75 e8                	jne    140313a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2486be>
 1403152:	83 7c 24 18 00       	cmp    DWORD PTR [rsp+0x18],0x0
 1403157:	74 08                	je     1403161 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2486e5>
 1403159:	4b 83 7c fd f8 ff    	cmp    QWORD PTR [r13+r15*8-0x8],0xffffffffffffffff
 140315f:	74 2b                	je     140318c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248710>
 1403161:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1403166:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 140316b:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
 1403170:	48 89 94 c8 28 0b 00 	mov    QWORD PTR [rax+rcx*8+0xb28],rdx
 1403177:	00 
 1403178:	48 ff c1             	inc    rcx
 140317b:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
 1403180:	e9 47 fc ff ff       	jmp    1402dcc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248350>
 1403185:	b8 7f ff ff ff       	mov    eax,0xffffff7f
 140318a:	eb 2f                	jmp    14031bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24873f>
 140318c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 1403191:	e8 c3 48 00 00       	call   1407a59 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cfdd>
 1403196:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 140319b:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 14031a0:	48 8d 04 c8          	lea    rax,[rax+rcx*8]
 14031a4:	48 05 28 0b 00 00    	add    rax,0xb28
 14031aa:	48 83 20 00          	and    QWORD PTR [rax],0x0
 14031ae:	48 89 df             	mov    rdi,rbx
 14031b1:	e8 db f6 ff ff       	call   1402891 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247e15>
 14031b6:	b8 7b ff ff ff       	mov    eax,0xffffff7b
 14031bb:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
--
 1403208:	4c 89 ff             	mov    rdi,r15
 140320b:	89 ee                	mov    esi,ebp
 140320d:	e8 26 55 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403212:	85 c0                	test   eax,eax
 1403214:	74 ed                	je     1403203 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248787>
 1403216:	eb 96                	jmp    14031ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248732>
 1403218:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 140321d:	6a 06                	push   0x6
 140321f:	5e                   	pop    rsi
 1403220:	e8 13 55 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403225:	8d 48 01             	lea    ecx,[rax+0x1]
 1403228:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
 140322d:	89 4a 18             	mov    DWORD PTR [rdx+0x18],ecx
 1403230:	3d fe ff ff 7f       	cmp    eax,0x7ffffffe
 1403235:	0f 87 73 ff ff ff    	ja     14031ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248732>
 140323b:	45 31 ff             	xor    r15d,r15d
 140323e:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
 1403243:	6a 10                	push   0x10
 1403245:	5d                   	pop    rbp
 1403246:	4c 8d 25 43 c1 46 00 	lea    r12,[rip+0x46c143]        # 186f390 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ba78>
 140324d:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
 1403252:	49 63 45 18          	movsxd rax,DWORD PTR [r13+0x18]
 1403256:	49 39 c7             	cmp    r15,rax
 1403259:	7d 44                	jge    140329f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248823>
 140325b:	4c 89 f7             	mov    rdi,r14
 140325e:	89 ee                	mov    esi,ebp
 1403260:	e8 d3 54 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403265:	43 89 84 bd 28 05 00 	mov    DWORD PTR [r13+r15*4+0x528],eax
 140326c:	00 
 140326d:	83 f8 01             	cmp    eax,0x1
 1403270:	0f 87 38 ff ff ff    	ja     14031ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248732>
 1403276:	89 c0                	mov    eax,eax
 1403278:	49 8b 04 c4          	mov    rax,QWORD PTR [r12+rax*8]
 140327c:	48 89 df             	mov    rdi,rbx
 140327f:	4c 89 f6             	mov    rsi,r14
 1403282:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1403285:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 140328a:	4a 89 84 f9 28 06 00 	mov    QWORD PTR [rcx+r15*8+0x628],rax
 1403291:	00 
 1403292:	49 ff c7             	inc    r15
 1403295:	48 85 c0             	test   rax,rax
 1403298:	75 b8                	jne    1403252 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2487d6>
 140329a:	e9 0f ff ff ff       	jmp    14031ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248732>
 140329f:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 14032a4:	6a 06                	push   0x6
 14032a6:	5e                   	pop    rsi
--
 140337d:	85 c0                	test   eax,eax
 140337f:	0f 85 29 fe ff ff    	jne    14031ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248732>
 1403385:	be 88 0c 00 00       	mov    esi,0xc88
 140338a:	6a 01                	push   0x1
 140338c:	5f                   	pop    rdi
 140338d:	e8 2e b8 3e 00       	call   17eebc0 <calloc@plt>
 1403392:	49 89 c7             	mov    r15,rax
 1403395:	8b 43 04             	mov    eax,DWORD PTR [rbx+0x4]
 1403398:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 140339d:	85 c0                	test   eax,eax
 140339f:	0f 8e f8 01 00 00    	jle    140359d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248b21>
 14033a5:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
 14033a9:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 14033ae:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 14033b3:	6a 01                	push   0x1
 14033b5:	5e                   	pop    rsi
 14033b6:	e8 7d 53 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 14033bb:	85 c0                	test   eax,eax
 14033bd:	0f 88 da 01 00 00    	js     140359d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248b21>
 14033c3:	74 24                	je     14033e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24896d>
 14033c5:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 14033ca:	6a 04                	push   0x4
 14033cc:	5e                   	pop    rsi
 14033cd:	e8 66 53 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 14033d2:	8d 48 01             	lea    ecx,[rax+0x1]
 14033d5:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
 14033da:	41 89 0f             	mov    DWORD PTR [r15],ecx
 14033dd:	3d fe ff ff 7f       	cmp    eax,0x7ffffffe
 14033e2:	76 14                	jbe    14033f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24897c>
 14033e4:	e9 b4 01 00 00       	jmp    140359d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248b21>
 14033e9:	41 c7 07 01 00 00 00 	mov    DWORD PTR [r15],0x1
 14033f0:	6a 01                	push   0x1
 14033f2:	58                   	pop    rax
 14033f3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 14033f8:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 14033fd:	6a 01                	push   0x1
 14033ff:	5e                   	pop    rsi
--
 1403521:	4c 89 e7             	mov    rdi,r12
 1403524:	6a 08                	push   0x8
 1403526:	5d                   	pop    rbp
 1403527:	89 ee                	mov    esi,ebp
 1403529:	e8 0a 52 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 140352e:	4c 89 e7             	mov    rdi,r12
 1403531:	89 ee                	mov    esi,ebp
 1403533:	e8 00 52 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403538:	43 89 84 b7 04 04 00 	mov    DWORD PTR [r15+r14*4+0x404],eax
 140353f:	00 
 1403540:	85 c0                	test   eax,eax
 1403542:	78 59                	js     140359d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248b21>
 1403544:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 1403549:	39 41 18             	cmp    DWORD PTR [rcx+0x18],eax
 140354c:	7e 4f                	jle    140359d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248b21>
 140354e:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 1403553:	6a 08                	push   0x8
 1403555:	5e                   	pop    rsi
 1403556:	e8 dd 51 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 140355b:	43 89 84 b7 44 04 00 	mov    DWORD PTR [r15+r14*4+0x444],eax
 1403562:	00 
 1403563:	85 c0                	test   eax,eax
 1403565:	78 36                	js     140359d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248b21>
 1403567:	49 ff c6             	inc    r14
 140356a:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 140356f:	39 41 1c             	cmp    DWORD PTR [rcx+0x1c],eax
 1403572:	7f a3                	jg     1403517 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248a9b>
 1403574:	eb 27                	jmp    140359d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248b21>
 1403576:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 140357b:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 1403580:	4c 89 bc c8 28 03 00 	mov    QWORD PTR [rax+rcx*8+0x328],r15
 1403587:	00 
 1403588:	48 ff c1             	inc    rcx
 140358b:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 1403590:	8b 48 14             	mov    ecx,DWORD PTR [rax+0x14]
 1403593:	e9 b9 fd ff ff       	jmp    1403351 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2488d5>
 1403598:	e8 13 c5 3e 00       	call   17efab0 <__stack_chk_fail@plt>
 140359d:	4c 89 ff             	mov    rdi,r15
 14035a0:	e8 4b 22 65 ff       	call   a557f0 <_ZdlPv@@Base>
 14035a5:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 14035aa:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 14035af:	48 8d 04 c8          	lea    rax,[rax+rcx*8]
 14035b3:	48 05 28 03 00 00    	add    rax,0x328
 14035b9:	e9 ec fb ff ff       	jmp    14031aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24872e>
 14035be:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 14035c3:	6a 06                	push   0x6
 14035c5:	5e                   	pop    rsi
 14035c6:	e8 6d 51 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 14035cb:	8d 48 01             	lea    ecx,[rax+0x1]
--
 14036d1:	41 5e                	pop    r14
 14036d3:	41 5f                	pop    r15
 14036d5:	5d                   	pop    rbp
 14036d6:	c3                   	ret
 14036d7:	31 c0                	xor    eax,eax
 14036d9:	85 f6                	test   esi,esi
 14036db:	78 43                	js     1403720 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248ca4>
 14036dd:	41 56                	push   r14
 14036df:	53                   	push   rbx
 14036e0:	50                   	push   rax
 14036e1:	48 89 fb             	mov    rbx,rdi
 14036e4:	41 89 f6             	mov    r14d,esi
 14036e7:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
 14036eb:	4c 39 71 08          	cmp    QWORD PTR [rcx+0x8],r14
 14036ef:	7e 28                	jle    1403719 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248c9d>
 14036f1:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
 14036f5:	42 8b 34 b0          	mov    esi,DWORD PTR [rax+r14*4]
 14036f9:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
 14036fd:	42 0f b6 04 30       	movzx  eax,BYTE PTR [rax+r14*1]
 1403702:	48 89 d7             	mov    rdi,rdx
 1403705:	89 c2                	mov    edx,eax
 1403707:	e8 3f 4e 00 00       	call   140854b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dacf>
 140370c:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
 1403710:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
 1403714:	42 0f b6 04 30       	movzx  eax,BYTE PTR [rax+r14*1]
 1403719:	48 83 c4 08          	add    rsp,0x8
 140371d:	5b                   	pop    rbx
 140371e:	41 5e                	pop    r14
 1403720:	c3                   	ret
 1403721:	41 56                	push   r14
 1403723:	53                   	push   rbx
 1403724:	50                   	push   rax
 1403725:	6a ff                	push   0xffffffffffffffff
 1403727:	5b                   	pop    rbx
 1403728:	48 83 7f 10 00       	cmp    QWORD PTR [rdi+0x10],0x0
 140372d:	7e 15                	jle    1403744 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248cc8>
 140372f:	49 89 fe             	mov    r14,rdi
 1403732:	e8 18 00 00 00       	call   140374f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248cd3>
 1403737:	48 85 c0             	test   rax,rax
 140373a:	78 08                	js     1403744 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248cc8>
 140373c:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
 1403740:	48 63 1c 81          	movsxd rbx,DWORD PTR [rcx+rax*4]
 1403744:	48 89 d8             	mov    rax,rbx
 1403747:	48 83 c4 08          	add    rsp,0x8
 140374b:	5b                   	pop    rbx
 140374c:	41 5e                	pop    r14
 140374e:	c3                   	ret
--
 1403858:	49 0f 4d cc          	cmovge rcx,r12
 140385c:	8b 73 08             	mov    esi,DWORD PTR [rbx+0x8]
 140385f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1403862:	48 8b 53 20          	mov    rdx,QWORD PTR [rbx+0x20]
 1403866:	44 8d 04 06          	lea    r8d,[rsi+rax*1]
 140386a:	41 83 c0 07          	add    r8d,0x7
 140386e:	41 c1 f8 03          	sar    r8d,0x3
 1403872:	4d 63 c0             	movsxd r8,r8d
 1403875:	49 89 d1             	mov    r9,rdx
 1403878:	4d 29 c1             	sub    r9,r8
 140387b:	4c 39 cf             	cmp    rdi,r9
 140387e:	7e 0a                	jle    140388a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248e0e>
 1403880:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
 1403885:	6a 01                	push   0x1
 1403887:	5e                   	pop    rsi
 1403888:	eb 1b                	jmp    14038a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248e29>
 140388a:	01 c6                	add    esi,eax
 140388c:	6a 08                	push   0x8
 140388e:	41 58                	pop    r8
 1403890:	89 f0                	mov    eax,esi
 1403892:	99                   	cdq
 1403893:	41 f7 f8             	idiv   r8d
 1403896:	48 98                	cdqe
 1403898:	48 01 43 18          	add    QWORD PTR [rbx+0x18],rax
 140389c:	48 01 c7             	add    rdi,rax
 140389f:	83 e6 07             	and    esi,0x7
 14038a2:	48 89 fa             	mov    rdx,rdi
 14038a5:	48 89 13             	mov    QWORD PTR [rbx],rdx
 14038a8:	89 73 08             	mov    DWORD PTR [rbx+0x8],esi
 14038ab:	eb 03                	jmp    14038b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248e34>
 14038ad:	6a ff                	push   0xffffffffffffffff
 14038af:	59                   	pop    rcx
 14038b0:	48 89 c8             	mov    rax,rcx
 14038b3:	48 83 c4 08          	add    rsp,0x8
 14038b7:	5b                   	pop    rbx
 14038b8:	41 5c                	pop    r12
 14038ba:	41 5d                	pop    r13
 14038bc:	41 5e                	pop    r14
 14038be:	41 5f                	pop    r15
 14038c0:	5d                   	pop    rbp
 14038c1:	c3                   	ret
 14038c2:	55                   	push   rbp
 14038c3:	48 89 e5             	mov    rbp,rsp
 14038c6:	41 57                	push   r15
 14038c8:	41 56                	push   r14
 14038ca:	41 55                	push   r13
 14038cc:	41 54                	push   r12
 14038ce:	53                   	push   rbx
--
 1403b1b:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
 1403b20:	4c 89 73 10          	mov    QWORD PTR [rbx+0x10],r14
 1403b24:	f2 41 0f 2a c7       	cvtsi2sd xmm0,r15d
 1403b29:	f2 0f 10 0d 17 ba f8 	movsd  xmm1,QWORD PTR [rip+0xfffffffffef8ba17]        # 38f548 <_ZTSSt12bad_any_cast@@Base-0xc80>
 1403b30:	fe 
 1403b31:	f2 0f 11 4c 24 08    	movsd  QWORD PTR [rsp+0x8],xmm1
 1403b37:	f2 0f 5e c8          	divsd  xmm1,xmm0
 1403b3b:	31 db                	xor    ebx,ebx
 1403b3d:	85 ed                	test   ebp,ebp
 1403b3f:	0f 4e eb             	cmovle ebp,ebx
 1403b42:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
 1403b46:	41 83 ff 04          	cmp    r15d,0x4
 1403b4a:	f2 0f 11 4c 24 18    	movsd  QWORD PTR [rsp+0x18],xmm1
 1403b50:	0f 8c b1 00 00 00    	jl     1403c07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24918b>
 1403b56:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
 1403b5a:	89 c8                	mov    eax,ecx
 1403b5c:	d1 f8                	sar    eax,1
 1403b5e:	01 c9                	add    ecx,ecx
 1403b60:	f2 0f 2a c1          	cvtsi2sd xmm0,ecx
 1403b64:	f2 0f 10 54 24 08    	movsd  xmm2,QWORD PTR [rsp+0x8]
 1403b6a:	f2 0f 5e d0          	divsd  xmm2,xmm0
 1403b6e:	f2 0f 11 54 24 08    	movsd  QWORD PTR [rsp+0x8],xmm2
 1403b74:	48 98                	cdqe
 1403b76:	4c 8d 24 85 00 00 00 	lea    r12,[rax*4+0x0]
 1403b7d:	00 
 1403b7e:	4d 01 ec             	add    r12,r13
 1403b81:	48 01 ed             	add    rbp,rbp
 1403b84:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
 1403b89:	45 31 ff             	xor    r15d,r15d
 1403b8c:	f2 0f 2a c3          	cvtsi2sd xmm0,ebx
 1403b90:	f2 0f 59 c1          	mulsd  xmm0,xmm1
 1403b94:	4c 89 f7             	mov    rdi,r14
 1403b97:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
 1403b9c:	e8 ff b0 3e 00       	call   17eeca0 <sincos@plt>
 1403ba1:	f2 0f 5a 44 24 58    	cvtsd2ss xmm0,QWORD PTR [rsp+0x58]
 1403ba7:	f3 43 0f 11 44 bd 00 	movss  DWORD PTR [r13+r15*4+0x0],xmm0
 1403bae:	f2 0f 5a 44 24 60    	cvtsd2ss xmm0,QWORD PTR [rsp+0x60]
 1403bb4:	0f 57 05 25 a4 f8 fe 	xorps  xmm0,XMMWORD PTR [rip+0xfffffffffef8a425]        # 38dfe0 <_ZTSSt12bad_any_cast@@Base-0x21e8>
 1403bbb:	f3 43 0f 11 44 bd 04 	movss  DWORD PTR [r13+r15*4+0x4],xmm0
 1403bc2:	41 8d 47 01          	lea    eax,[r15+0x1]
 1403bc6:	f2 0f 2a c0          	cvtsi2sd xmm0,eax
 1403bca:	f2 0f 59 44 24 08    	mulsd  xmm0,QWORD PTR [rsp+0x8]
 1403bd0:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 1403bd5:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
 1403bda:	e8 c1 b0 3e 00       	call   17eeca0 <sincos@plt>
 1403bdf:	f2 0f 10 4c 24 18    	movsd  xmm1,QWORD PTR [rsp+0x18]
 1403be5:	f2 0f 10 44 24 48    	movsd  xmm0,QWORD PTR [rsp+0x48]
 1403beb:	66 0f 16 44 24 50    	movhpd xmm0,QWORD PTR [rsp+0x50]
 1403bf1:	66 0f 5a c0          	cvtpd2ps xmm0,xmm0
 1403bf5:	66 43 0f 13 04 bc    	movlpd QWORD PTR [r12+r15*4],xmm0
 1403bfb:	49 83 c7 02          	add    r15,0x2
 1403bff:	83 c3 04             	add    ebx,0x4
 1403c02:	4c 39 fd             	cmp    rbp,r15
 1403c05:	75 85                	jne    1403b8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249110>
 1403c07:	6a 08                	push   0x8
 1403c09:	59                   	pop    rcx
 1403c0a:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
 1403c0e:	89 f0                	mov    eax,esi
 1403c10:	99                   	cdq
 1403c11:	f7 f9                	idiv   ecx
 1403c13:	45 31 e4             	xor    r12d,r12d
 1403c16:	85 c0                	test   eax,eax
 1403c18:	44 0f 4f e0          	cmovg  r12d,eax
 1403c1c:	83 fe 08             	cmp    esi,0x8
 1403c1f:	7c 5c                	jl     1403c7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249201>
 1403c21:	48 63 04 24          	movsxd rax,DWORD PTR [rsp]
 1403c25:	4d 8d 6c 85 00       	lea    r13,[r13+rax*4+0x0]
 1403c2a:	6a 02                	push   0x2
 1403c2c:	5d                   	pop    rbp
 1403c2d:	45 31 f6             	xor    r14d,r14d
 1403c30:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
 1403c35:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
 1403c3a:	f2 0f 2a c5          	cvtsi2sd xmm0,ebp
 1403c3e:	f2 0f 59 c1          	mulsd  xmm0,xmm1
 1403c42:	48 89 df             	mov    rdi,rbx
 1403c45:	4c 89 fe             	mov    rsi,r15
 1403c48:	e8 53 b0 3e 00       	call   17eeca0 <sincos@plt>
 1403c4d:	f2 0f 10 4c 24 18    	movsd  xmm1,QWORD PTR [rsp+0x18]
 1403c53:	f2 0f 10 44 24 38    	movsd  xmm0,QWORD PTR [rsp+0x38]
 1403c59:	66 0f 16 44 24 40    	movhpd xmm0,QWORD PTR [rsp+0x40]
 1403c5f:	66 0f 59 05 69 91 f8 	mulpd  xmm0,XMMWORD PTR [rip+0xfffffffffef89169]        # 38cdd0 <_ZTSSt12bad_any_cast@@Base-0x33f8>
 1403c66:	fe 
 1403c67:	66 0f 5a c0          	cvtpd2ps xmm0,xmm0
 1403c6b:	66 43 0f 13 44 f5 00 	movlpd QWORD PTR [r13+r14*8+0x0],xmm0
 1403c72:	49 ff c6             	inc    r14
 1403c75:	83 c5 04             	add    ebp,0x4
 1403c78:	4d 39 f4             	cmp    r12,r14
 1403c7b:	75 bd                	jne    1403c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2491be>
 1403c7d:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 1403c82:	8d 48 ff             	lea    ecx,[rax-0x1]
 1403c85:	6a ff                	push   0xffffffffffffffff
 1403c87:	5a                   	pop    rdx
 1403c88:	d3 e2                	shl    edx,cl
 1403c8a:	04 fe                	add    al,0xfe
 1403c8c:	6a 01                	push   0x1
 1403c8e:	5e                   	pop    rsi
 1403c8f:	89 f7                	mov    edi,esi
 1403c91:	89 c1                	mov    ecx,eax
 1403c93:	d3 e7                	shl    edi,cl
 1403c95:	83 3c 24 08          	cmp    DWORD PTR [rsp],0x8
 1403c99:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
 1403c9e:	7c 4d                	jl     1403ced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249271>
--
 1403cd5:	09 d0                	or     eax,edx
 1403cd7:	44 89 c9             	mov    ecx,r9d
 1403cda:	29 c1                	sub    ecx,eax
 1403cdc:	43 89 0c c6          	mov    DWORD PTR [r14+r8*8],ecx
 1403ce0:	47 89 54 c6 04       	mov    DWORD PTR [r14+r8*8+0x4],r10d
 1403ce5:	49 ff c0             	inc    r8
 1403ce8:	4d 39 e0             	cmp    r8,r12
 1403ceb:	75 ba                	jne    1403ca7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24922b>
 1403ced:	f3 0f 10 05 87 ab f8 	movss  xmm0,DWORD PTR [rip+0xfffffffffef8ab87]        # 38e87c <_ZTSSt12bad_any_cast@@Base-0x194c>
 1403cf4:	fe 
 1403cf5:	f3 0f 5e 44 24 14    	divss  xmm0,DWORD PTR [rsp+0x14]
 1403cfb:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 1403d00:	f3 0f 11 40 18       	movss  DWORD PTR [rax+0x18],xmm0
 1403d05:	48 83 c4 68          	add    rsp,0x68
 1403d09:	5b                   	pop    rbx
 1403d0a:	41 5c                	pop    r12
 1403d0c:	41 5d                	pop    r13
 1403d0e:	41 5e                	pop    r14
 1403d10:	41 5f                	pop    r15
 1403d12:	5d                   	pop    rbp
 1403d13:	c3                   	ret
 1403d14:	48 85 ff             	test   rdi,rdi
 1403d17:	74 21                	je     1403d3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2492be>
 1403d19:	53                   	push   rbx
 1403d1a:	48 89 fb             	mov    rbx,rdi
 1403d1d:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 1403d21:	e8 3a aa 3e 00       	call   17ee760 <free@plt>
 1403d26:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 1403d2a:	e8 31 aa 3e 00       	call   17ee760 <free@plt>
 1403d2f:	0f 57 c0             	xorps  xmm0,xmm0
 1403d32:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 1403d36:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 1403d39:	5b                   	pop    rbx
 1403d3a:	c3                   	ret
 1403d3b:	53                   	push   rbx
 1403d3c:	48 8d 5f 20          	lea    rbx,[rdi+0x20]
 1403d40:	0f 10 47 20          	movups xmm0,XMMWORD PTR [rdi+0x20]
--
 1403dcc:	0f 58 c1             	addps  xmm0,xmm1
 1403dcf:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
 1403dd3:	0f 59 25 06 90 f8 fe 	mulps  xmm4,XMMWORD PTR [rip+0xfffffffffef89006]        # 38cde0 <_ZTSSt12bad_any_cast@@Base-0x33e8>
 1403dda:	66 0f 3a 0c e2 0c    	blendps xmm4,xmm2,0xc
 1403de0:	0f 11 67 10          	movups XMMWORD PTR [rdi+0x10],xmm4
 1403de4:	e8 09 00 00 00       	call   1403df2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249376>
 1403de9:	48 89 df             	mov    rdi,rbx
 1403dec:	5b                   	pop    rbx
 1403ded:	e9 00 00 00 00       	jmp    1403df2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249376>
 1403df2:	f2 0f 10 07          	movsd  xmm0,QWORD PTR [rdi]
 1403df6:	f2 0f 10 4f 08       	movsd  xmm1,QWORD PTR [rdi+0x8]
 1403dfb:	f2 0f 10 57 10       	movsd  xmm2,QWORD PTR [rdi+0x10]
 1403e00:	f2 0f 10 5f 18       	movsd  xmm3,QWORD PTR [rdi+0x18]
 1403e05:	0f 28 e2             	movaps xmm4,xmm2
 1403e08:	0f 5c e0             	subps  xmm4,xmm0
 1403e0b:	0f c6 e4 11          	shufps xmm4,xmm4,0x11
 1403e0f:	0f 28 eb             	movaps xmm5,xmm3
 1403e12:	0f 5c e9             	subps  xmm5,xmm1
 1403e15:	f2 0f 12 ed          	movddup xmm5,xmm5
 1403e19:	66 0f 28 f5          	movapd xmm6,xmm5
 1403e1d:	0f 58 f4             	addps  xmm6,xmm4
 1403e20:	0f 5c ec             	subps  xmm5,xmm4
 1403e23:	66 0f 3a 0c ee 09    	blendps xmm5,xmm6,0x9
 1403e29:	0f 11 2f             	movups XMMWORD PTR [rdi],xmm5
 1403e2c:	0f 58 d0             	addps  xmm2,xmm0
 1403e2f:	0f 58 d9             	addps  xmm3,xmm1
 1403e32:	0f 28 c3             	movaps xmm0,xmm3
 1403e35:	0f 5c c2             	subps  xmm0,xmm2
 1403e38:	0f 58 da             	addps  xmm3,xmm2
 1403e3b:	0f 16 c3             	movlhps xmm0,xmm3
 1403e3e:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
 1403e42:	c3                   	ret
 1403e43:	55                   	push   rbp
 1403e44:	41 57                	push   r15
 1403e46:	41 56                	push   r14
 1403e48:	41 55                	push   r13
 1403e4a:	41 54                	push   r12
--
 1403e7b:	e8 b8 48 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403e80:	49 89 c4             	mov    r12,rax
 1403e83:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
 1403e87:	4c 89 f7             	mov    rdi,r14
 1403e8a:	44 89 ee             	mov    esi,r13d
 1403e8d:	e8 a6 48 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403e92:	49 89 c5             	mov    r13,rax
 1403e95:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 1403e99:	6a 06                	push   0x6
 1403e9b:	5e                   	pop    rsi
 1403e9c:	4c 89 f7             	mov    rdi,r14
 1403e9f:	e8 94 48 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403ea4:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax
 1403ea7:	4c 89 f7             	mov    rdi,r14
 1403eaa:	6a 08                	push   0x8
 1403eac:	5e                   	pop    rsi
 1403ead:	e8 86 48 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403eb2:	89 43 1c             	mov    DWORD PTR [rbx+0x1c],eax
 1403eb5:	6a 04                	push   0x4
 1403eb7:	5e                   	pop    rsi
 1403eb8:	4c 89 f7             	mov    rdi,r14
 1403ebb:	e8 78 48 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403ec0:	8d 48 01             	lea    ecx,[rax+0x1]
 1403ec3:	89 4b 20             	mov    DWORD PTR [rbx+0x20],ecx
 1403ec6:	45 85 ff             	test   r15d,r15d
 1403ec9:	7e 52                	jle    1403f1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2494a1>
 1403ecb:	4d 85 e4             	test   r12,r12
 1403ece:	7e 4d                	jle    1403f1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2494a1>
 1403ed0:	4d 85 ed             	test   r13,r13
 1403ed3:	7e 48                	jle    1403f1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2494a1>
 1403ed5:	3d fe ff ff 7f       	cmp    eax,0x7ffffffe
 1403eda:	77 41                	ja     1403f1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2494a1>
 1403edc:	41 89 cc             	mov    r12d,ecx
 1403edf:	45 31 ed             	xor    r13d,r13d
 1403ee2:	6a 08                	push   0x8
 1403ee4:	41 5f                	pop    r15
 1403ee6:	4d 39 ec             	cmp    r12,r13
 1403ee9:	74 3c                	je     1403f27 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2494ab>
 1403eeb:	4c 89 f7             	mov    rdi,r14
 1403eee:	44 89 fe             	mov    esi,r15d
 1403ef1:	e8 42 48 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403ef6:	42 89 44 ab 24       	mov    DWORD PTR [rbx+r13*4+0x24],eax
 1403efb:	85 c0                	test   eax,eax
 1403efd:	78 1e                	js     1403f1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2494a1>
 1403eff:	39 45 20             	cmp    DWORD PTR [rbp+0x20],eax
 1403f02:	7e 19                	jle    1403f1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2494a1>
 1403f04:	89 c0                	mov    eax,eax
 1403f06:	48 8b 84 c5 28 0b 00 	mov    rax,QWORD PTR [rbp+rax*8+0xb28]
 1403f0d:	00 
 1403f0e:	83 78 18 00          	cmp    DWORD PTR [rax+0x18],0x0
 1403f12:	74 09                	je     1403f1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2494a1>
 1403f14:	49 ff c5             	inc    r13
 1403f17:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
 1403f1b:	7f c9                	jg     1403ee6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24946a>
 1403f1d:	48 89 df             	mov    rdi,rbx
 1403f20:	e8 cb 18 65 ff       	call   a557f0 <_ZdlPv@@Base>
 1403f25:	31 db                	xor    ebx,ebx
 1403f27:	48 89 d8             	mov    rax,rbx
 1403f2a:	48 83 c4 08          	add    rsp,0x8
 1403f2e:	5b                   	pop    rbx
 1403f2f:	41 5c                	pop    r12
 1403f31:	41 5d                	pop    r13
 1403f33:	41 5e                	pop    r14
 1403f35:	41 5f                	pop    r15
 1403f37:	5d                   	pop    rbp
 1403f38:	c3                   	ret
 1403f39:	41 56                	push   r14
 1403f3b:	53                   	push   rbx
 1403f3c:	50                   	push   rax
 1403f3d:	48 89 f3             	mov    rbx,rsi
 1403f40:	6a 01                	push   0x1
 1403f42:	5f                   	pop    rdi
 1403f43:	6a 30                	push   0x30
 1403f45:	5e                   	pop    rsi
 1403f46:	e8 75 ac 3e 00       	call   17eebc0 <calloc@plt>
 1403f4b:	49 89 c6             	mov    r14,rax
 1403f4e:	8b 03                	mov    eax,DWORD PTR [rbx]
 1403f50:	41 89 46 04          	mov    DWORD PTR [r14+0x4],eax
 1403f54:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
 1403f57:	41 89 06             	mov    DWORD PTR [r14],eax
 1403f5a:	49 89 5e 18          	mov    QWORD PTR [r14+0x18],rbx
 1403f5e:	6a 02                	push   0x2
 1403f60:	5f                   	pop    rdi
 1403f61:	6a 08                	push   0x8
 1403f63:	5e                   	pop    rsi
 1403f64:	e8 57 ac 3e 00       	call   17eebc0 <calloc@plt>
 1403f69:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 1403f6d:	4c 89 f0             	mov    rax,r14
 1403f70:	48 83 c4 08          	add    rsp,0x8
 1403f74:	5b                   	pop    rbx
 1403f75:	41 5e                	pop    r14
 1403f77:	c3                   	ret
 1403f78:	48 85 ff             	test   rdi,rdi
 1403f7b:	74 34                	je     1403fb1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249535>
 1403f7d:	53                   	push   rbx
 1403f7e:	48 89 fb             	mov    rbx,rdi
 1403f81:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 1403f85:	48 85 c0             	test   rax,rax
 1403f88:	74 1e                	je     1403fa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24952c>
 1403f8a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 1403f8d:	e8 ce a7 3e 00       	call   17ee760 <free@plt>
 1403f92:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 1403f96:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
 1403f9a:	e8 c1 a7 3e 00       	call   17ee760 <free@plt>
 1403f9f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
--
 1403fab:	5b                   	pop    rbx
 1403fac:	e9 af a7 3e 00       	jmp    17ee760 <free@plt>
 1403fb1:	c3                   	ret
 1403fb2:	55                   	push   rbp
 1403fb3:	41 57                	push   r15
 1403fb5:	41 56                	push   r14
 1403fb7:	41 55                	push   r13
 1403fb9:	41 54                	push   r12
 1403fbb:	53                   	push   rbx
 1403fbc:	48 83 ec 28          	sub    rsp,0x28
 1403fc0:	48 89 f3             	mov    rbx,rsi
 1403fc3:	49 89 fe             	mov    r14,rdi
 1403fc6:	4c 8b 7e 18          	mov    r15,QWORD PTR [rsi+0x18]
 1403fca:	4c 8d 6f 08          	lea    r13,[rdi+0x8]
 1403fce:	41 8b 77 18          	mov    esi,DWORD PTR [r15+0x18]
 1403fd2:	4c 89 ef             	mov    rdi,r13
 1403fd5:	e8 5e 47 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1403fda:	49 89 c4             	mov    r12,rax
 1403fdd:	45 85 e4             	test   r12d,r12d
 1403fe0:	0f 8e 16 01 00 00    	jle    14040fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249680>
 1403fe6:	41 8a 4f 18          	mov    cl,BYTE PTR [r15+0x18]
 1403fea:	6a ff                	push   0xffffffffffffffff
 1403fec:	5d                   	pop    rbp
 1403fed:	d3 e5                	shl    ebp,cl
 1403fef:	f3 41 0f 2a 47 1c    	cvtsi2ss xmm0,DWORD PTR [r15+0x1c]
 1403ff5:	f3 0f 11 44 24 0c    	movss  DWORD PTR [rsp+0xc],xmm0
 1403ffb:	41 8b 7f 20          	mov    edi,DWORD PTR [r15+0x20]
 1403fff:	e8 2c 39 00 00       	call   1407930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ceb4>
 1404004:	4c 89 ef             	mov    rdi,r13
 1404007:	89 c6                	mov    esi,eax
 1404009:	e8 2a 47 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 140400e:	83 f8 ff             	cmp    eax,0xffffffff
 1404011:	0f 84 e5 00 00 00    	je     14040fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249680>
 1404017:	41 39 47 20          	cmp    DWORD PTR [r15+0x20],eax
 140401b:	0f 8e db 00 00 00    	jle    14040fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249680>
 1404021:	89 6c 24 08          	mov    DWORD PTR [rsp+0x8],ebp
 1404025:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
 140402a:	49 8b 4e 68          	mov    rcx,QWORD PTR [r14+0x68]
 140402e:	48 8b 49 08          	mov    rcx,QWORD PTR [rcx+0x8]
 1404032:	48 8b 49 30          	mov    rcx,QWORD PTR [rcx+0x30]
 1404036:	4c 8b a1 28 13 00 00 	mov    r12,QWORD PTR [rcx+0x1328]
 140403d:	48 98                	cdqe
 140403f:	49 63 44 87 24       	movsxd rax,DWORD PTR [r15+rax*4+0x24]
 1404044:	48 6b e8 60          	imul   rbp,rax,0x60
 1404048:	4d 8d 3c 2c          	lea    r15,[r12+rbp*1]
--
 1404050:	49 03 04 2c          	add    rax,QWORD PTR [r12+rbp*1]
 1404054:	48 8d 34 85 04 00 00 	lea    rsi,[rax*4+0x4]
 140405b:	00 
 140405c:	4c 89 f7             	mov    rdi,r14
 140405f:	e8 dd d8 ff ff       	call   1401941 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246ec5>
 1404064:	49 89 c6             	mov    r14,rax
 1404067:	8b 53 04             	mov    edx,DWORD PTR [rbx+0x4]
 140406a:	49 83 7c 2c 10 00    	cmp    QWORD PTR [r12+rbp*1+0x10],0x0
 1404070:	0f 8e 9b 00 00 00    	jle    1404111 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249695>
 1404076:	85 d2                	test   edx,edx
 1404078:	0f 8e a5 00 00 00    	jle    1404123 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2496a7>
 140407e:	48 63 c2             	movsxd rax,edx
 1404081:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 1404086:	49 8d 04 2c          	lea    rax,[r12+rbp*1]
 140408a:	48 83 c0 20          	add    rax,0x20
 140408e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 1404093:	45 31 e4             	xor    r12d,r12d
 1404096:	48 89 d5             	mov    rbp,rdx
 1404099:	4c 89 ff             	mov    rdi,r15
 140409c:	4c 89 ee             	mov    rsi,r13
 140409f:	e8 ab f6 ff ff       	call   140374f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248cd3>
 14040a4:	83 f8 ff             	cmp    eax,0xffffffff
 14040a7:	74 53                	je     14040fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249680>
 14040a9:	48 89 ea             	mov    rdx,rbp
 14040ac:	41 39 d4             	cmp    r12d,edx
 14040af:	74 72                	je     1404123 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2496a7>
 14040b1:	48 98                	cdqe
 14040b3:	49 0f af 07          	imul   rax,QWORD PTR [r15]
 14040b7:	48 c1 e0 02          	shl    rax,0x2
 14040bb:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 14040c0:	48 03 01             	add    rax,QWORD PTR [rcx]
 14040c3:	4d 63 e4             	movsxd r12,r12d
 14040c6:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 14040cb:	4c 29 e1             	sub    rcx,r12
 14040ce:	4f 8d 04 a6          	lea    r8,[r14+r12*4]
 14040d2:	31 f6                	xor    esi,esi
 14040d4:	49 39 37             	cmp    QWORD PTR [r15],rsi
 14040d7:	7e 19                	jle    14040f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249676>
 14040d9:	f3 0f 10 04 b0       	movss  xmm0,DWORD PTR [rax+rsi*4]
 14040de:	f3 41 0f 11 04 b0    	movss  DWORD PTR [r8+rsi*4],xmm0
 14040e4:	48 8d 7e 01          	lea    rdi,[rsi+0x1]
 14040e8:	48 89 fe             	mov    rsi,rdi
 14040eb:	48 39 f9             	cmp    rcx,rdi
 14040ee:	75 e4                	jne    14040d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249658>
 14040f0:	eb 31                	jmp    1404123 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2496a7>
 14040f2:	49 01 f4             	add    r12,rsi
 14040f5:	44 39 e2             	cmp    edx,r12d
 14040f8:	7f 9c                	jg     1404096 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24961a>
 14040fa:	eb 27                	jmp    1404123 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2496a7>
 14040fc:	45 31 f6             	xor    r14d,r14d
 14040ff:	4c 89 f0             	mov    rax,r14
 1404102:	48 83 c4 28          	add    rsp,0x28
 1404106:	5b                   	pop    rbx
 1404107:	41 5c                	pop    r12
 1404109:	41 5d                	pop    r13
 140410b:	41 5e                	pop    r14
 140410d:	41 5f                	pop    r15
--
 14041a1:	e9 59 ff ff ff       	jmp    14040ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249683>
 14041a6:	55                   	push   rbp
 14041a7:	41 57                	push   r15
 14041a9:	41 56                	push   r14
 14041ab:	41 55                	push   r13
 14041ad:	41 54                	push   r12
 14041af:	53                   	push   rbx
 14041b0:	48 83 ec 38          	sub    rsp,0x38
 14041b4:	48 89 cb             	mov    rbx,rcx
 14041b7:	49 89 d6             	mov    r14,rdx
 14041ba:	49 89 f7             	mov    r15,rsi
 14041bd:	4c 8b 66 08          	mov    r12,QWORD PTR [rsi+0x8]
 14041c1:	48 8b 76 18          	mov    rsi,QWORD PTR [rsi+0x18]
 14041c5:	48 8b 47 38          	mov    rax,QWORD PTR [rdi+0x38]
 14041c9:	49 83 3c c4 00       	cmp    QWORD PTR [r12+rax*8],0x0
 14041ce:	0f 85 f7 01 00 00    	jne    14043cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24994f>
 14041d4:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
 14041d9:	48 8b 4f 68          	mov    rcx,QWORD PTR [rdi+0x68]
 14041dd:	48 8b 49 08          	mov    rcx,QWORD PTR [rcx+0x8]
 14041e1:	48 8b 49 30          	mov    rcx,QWORD PTR [rcx+0x30]
 14041e5:	48 63 e8             	movsxd rbp,eax
 14041e8:	48 8b 04 e9          	mov    rax,QWORD PTR [rcx+rbp*8]
 14041ec:	6a 02                	push   0x2
 14041ee:	59                   	pop    rcx
 14041ef:	48 99                	cqo
 14041f1:	48 f7 f9             	idiv   rcx
 14041f4:	49 89 c5             	mov    r13,rax
 14041f7:	f3 48 0f 2a 4e 08    	cvtsi2ss xmm1,QWORD PTR [rsi+0x8]
 14041fd:	f2 41 0f 2a 07       	cvtsi2sd xmm0,DWORD PTR [r15]
 1404202:	f2 0f 11 44 24 18    	movsd  QWORD PTR [rsp+0x18],xmm0
 1404208:	f3 0f 59 0d e4 a5 f8 	mulss  xmm1,DWORD PTR [rip+0xfffffffffef8a5e4]        # 38e7f4 <_ZTSSt12bad_any_cast@@Base-0x19d4>
 140420f:	fe 
 1404210:	f3 0f 11 0c 24       	movss  DWORD PTR [rsp],xmm1
 1404215:	f3 0f 10 05 2b a5 f8 	movss  xmm0,DWORD PTR [rip+0xfffffffffef8a52b]        # 38e748 <_ZTSSt12bad_any_cast@@Base-0x1a80>
 140421c:	fe 
 140421d:	f3 0f 59 c1          	mulss  xmm0,xmm1
 1404221:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
 1404225:	48 89 74 24 20       	mov    QWORD PTR [rsp+0x20],rsi
 140422a:	e8 b1 a9 3e 00       	call   17eebe0 <atan@plt>
 140422f:	f2 0f 11 44 24 10    	movsd  QWORD PTR [rsp+0x10],xmm0
 1404235:	f3 0f 10 04 24       	movss  xmm0,DWORD PTR [rsp]
 140423a:	f3 0f 59 c0          	mulss  xmm0,xmm0
 140423e:	f3 0f 59 05 ae a6 f8 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef8a6ae]        # 38e8f4 <_ZTSSt12bad_any_cast@@Base-0x18d4>
 1404245:	fe 
 1404246:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
 140424a:	e8 91 a9 3e 00       	call   17eebe0 <atan@plt>
 140424f:	f2 0f 11 44 24 08    	movsd  QWORD PTR [rsp+0x8],xmm0
 1404255:	4c 89 e8             	mov    rax,r13
 1404258:	48 c1 e0 20          	shl    rax,0x20
 140425c:	48 bf 00 00 00 00 01 	movabs rdi,0x100000000
 1404263:	00 00 00 
 1404266:	48 01 c7             	add    rdi,rax
 1404269:	48 c1 ff 1e          	sar    rdi,0x1e
 140426d:	e8 8e a9 3e 00       	call   17eec00 <malloc@plt>
--
 140428e:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
 1404294:	f2 0f 59 05 84 b2 f8 	mulsd  xmm0,QWORD PTR [rip+0xfffffffffef8b284]        # 38f520 <_ZTSSt12bad_any_cast@@Base-0xca8>
 140429b:	fe 
 140429c:	f2 0f 10 4c 24 10    	movsd  xmm1,QWORD PTR [rsp+0x10]
 14042a2:	f2 0f 59 0d 36 b0 f8 	mulsd  xmm1,QWORD PTR [rip+0xfffffffffef8b036]        # 38f2e0 <_ZTSSt12bad_any_cast@@Base-0xee8>
 14042a9:	fe 
 14042aa:	f2 0f 58 c8          	addsd  xmm1,xmm0
 14042ae:	f3 0f 10 04 24       	movss  xmm0,DWORD PTR [rsp]
 14042b3:	f3 0f 59 05 41 a7 f8 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef8a741]        # 38e9fc <_ZTSSt12bad_any_cast@@Base-0x17cc>
 14042ba:	fe 
 14042bb:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
 14042bf:	f2 0f 58 c1          	addsd  xmm0,xmm1
 14042c3:	f2 0f 10 4c 24 18    	movsd  xmm1,QWORD PTR [rsp+0x18]
 14042c9:	f2 0f 5e c8          	divsd  xmm1,xmm0
 14042cd:	f2 0f 5a c1          	cvtsd2ss xmm0,xmm1
 14042d1:	f3 0f 2a 4c 24 28    	cvtsi2ss xmm1,DWORD PTR [rsp+0x28]
 14042d7:	f3 0f 11 4c 24 10    	movss  DWORD PTR [rsp+0x10],xmm1
 14042dd:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
 14042e1:	f2 0f 11 44 24 08    	movsd  QWORD PTR [rsp+0x8],xmm0
 14042e7:	31 ed                	xor    ebp,ebp
 14042e9:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 14042ee:	f3 48 0f 2a 40 08    	cvtsi2ss xmm0,QWORD PTR [rax+0x8]
 14042f4:	f3 0f 59 05 f8 a4 f8 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef8a4f8]        # 38e7f4 <_ZTSSt12bad_any_cast@@Base-0x19d4>
 14042fb:	fe 
 14042fc:	f3 0f 5e 44 24 10    	divss  xmm0,DWORD PTR [rsp+0x10]
 1404302:	f3 0f 2a cd          	cvtsi2ss xmm1,ebp
 1404306:	f3 0f 59 c8          	mulss  xmm1,xmm0
 140430a:	f3 0f 11 0c 24       	movss  DWORD PTR [rsp],xmm1
 140430f:	0f 28 c1             	movaps xmm0,xmm1
 1404312:	f3 0f 59 05 2e a4 f8 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef8a42e]        # 38e748 <_ZTSSt12bad_any_cast@@Base-0x1a80>
 1404319:	fe 
 140431a:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
 140431e:	49 89 cd             	mov    r13,rcx
 1404321:	e8 ba a8 3e 00       	call   17eebe0 <atan@plt>
 1404326:	f2 0f 11 44 24 18    	movsd  QWORD PTR [rsp+0x18],xmm0
 140432c:	f3 0f 10 04 24       	movss  xmm0,DWORD PTR [rsp]
 1404331:	f3 0f 59 c0          	mulss  xmm0,xmm0
 1404335:	f3 0f 59 05 b7 a5 f8 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef8a5b7]        # 38e8f4 <_ZTSSt12bad_any_cast@@Base-0x18d4>
 140433c:	fe 
 140433d:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
 1404341:	e8 9a a8 3e 00       	call   17eebe0 <atan@plt>
 1404346:	f2 0f 59 05 d2 b1 f8 	mulsd  xmm0,QWORD PTR [rip+0xfffffffffef8b1d2]        # 38f520 <_ZTSSt12bad_any_cast@@Base-0xca8>
 140434d:	fe 
 140434e:	f2 0f 10 4c 24 18    	movsd  xmm1,QWORD PTR [rsp+0x18]
 1404354:	f2 0f 59 0d 84 af f8 	mulsd  xmm1,QWORD PTR [rip+0xfffffffffef8af84]        # 38f2e0 <_ZTSSt12bad_any_cast@@Base-0xee8>
 140435b:	fe 
 140435c:	f2 0f 58 c8          	addsd  xmm1,xmm0
 1404360:	f3 0f 10 04 24       	movss  xmm0,DWORD PTR [rsp]
 1404365:	f3 0f 59 05 8f a6 f8 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef8a68f]        # 38e9fc <_ZTSSt12bad_any_cast@@Base-0x17cc>
 140436c:	fe 
 140436d:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
 1404371:	f2 0f 58 c1          	addsd  xmm0,xmm1
 1404375:	f2 0f 59 44 24 08    	mulsd  xmm0,QWORD PTR [rsp+0x8]
 140437b:	66 0f 3a 0b c0 09    	roundsd xmm0,xmm0,0x9
 1404381:	f2 0f 2c c0          	cvttsd2si eax,xmm0
 1404385:	41 8b 0f             	mov    ecx,DWORD PTR [r15]
 1404388:	8d 51 ff             	lea    edx,[rcx-0x1]
 140438b:	39 c1                	cmp    ecx,eax
 140438d:	4c 89 e9             	mov    rcx,r13
 1404390:	0f 4f d0             	cmovg  edx,eax
 1404393:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 1404397:	4a 8b 04 e8          	mov    rax,QWORD PTR [rax+r13*8]
 140439b:	89 14 a8             	mov    DWORD PTR [rax+rbp*4],edx
 140439e:	48 ff c5             	inc    rbp
 14043a1:	49 39 ec             	cmp    r12,rbp
 14043a4:	0f 85 3f ff ff ff    	jne    14042e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24986d>
 14043aa:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 14043ae:	48 8b 04 c8          	mov    rax,QWORD PTR [rax+rcx*8]
--
 14043d4:	4d 63 6f 04          	movsxd r13,DWORD PTR [r15+0x4]
 14043d8:	31 ed                	xor    ebp,ebp
 14043da:	45 85 ed             	test   r13d,r13d
 14043dd:	41 0f 4f ed          	cmovg  ebp,r13d
 14043e1:	f3 43 0f 10 04 ae    	movss  xmm0,DWORD PTR [r14+r13*4]
 14043e7:	f3 0f 11 44 24 10    	movss  DWORD PTR [rsp+0x10],xmm0
 14043ed:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 14043f1:	48 8b 4f 38          	mov    rcx,QWORD PTR [rdi+0x38]
 14043f5:	4c 8b 24 c8          	mov    r12,QWORD PTR [rax+rcx*8]
 14043f9:	f3 0f 2a 46 1c       	cvtsi2ss xmm0,DWORD PTR [rsi+0x1c]
 14043fe:	f3 0f 11 44 24 08    	movss  DWORD PTR [rsp+0x8],xmm0
 1404404:	41 8b 44 8f 10       	mov    eax,DWORD PTR [r15+rcx*4+0x10]
 1404409:	89 44 24 18          	mov    DWORD PTR [rsp+0x18],eax
 140440d:	f2 41 0f 2a 07       	cvtsi2sd xmm0,DWORD PTR [r15]
 1404412:	f2 0f 11 04 24       	movsd  QWORD PTR [rsp],xmm0
 1404417:	4d 85 ed             	test   r13,r13
 140441a:	7e 24                	jle    1404440 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2499c4>
 140441c:	45 31 ff             	xor    r15d,r15d
 140441f:	f3 43 0f 5a 04 be    	cvtss2sd xmm0,DWORD PTR [r14+r15*4]
 1404425:	e8 46 c9 3e 00       	call   17f0d70 <cos@plt>
 140442a:	f2 0f 58 c0          	addsd  xmm0,xmm0
 140442e:	f2 0f 5a c0          	cvtsd2ss xmm0,xmm0
 1404432:	f3 43 0f 11 04 be    	movss  DWORD PTR [r14+r15*4],xmm0
 1404438:	49 ff c7             	inc    r15
 140443b:	4c 39 fd             	cmp    rbp,r15
 140443e:	75 df                	jne    140441f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2499a3>
 1404440:	6a 01                	push   0x1
 1404442:	5d                   	pop    rbp
 1404443:	83 7c 24 18 00       	cmp    DWORD PTR [rsp+0x18],0x0
 1404448:	0f 8e 56 01 00 00    	jle    14045a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249b28>
 140444e:	f2 0f 10 05 f2 b0 f8 	movsd  xmm0,QWORD PTR [rip+0xfffffffffef8b0f2]        # 38f548 <_ZTSSt12bad_any_cast@@Base-0xc80>
 1404455:	fe 
 1404456:	f2 0f 5e 04 24       	divsd  xmm0,QWORD PTR [rsp]
 140445b:	44 89 e8             	mov    eax,r13d
 140445e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 1404462:	f2 0f 5a c0          	cvtsd2ss xmm0,xmm0
 1404466:	f3 0f 11 44 24 20    	movss  DWORD PTR [rsp+0x20],xmm0
 140446c:	f3 0f 5a 44 24 10    	cvtss2sd xmm0,DWORD PTR [rsp+0x10]
 1404472:	f2 0f 11 44 24 10    	movsd  QWORD PTR [rsp+0x10],xmm0
 1404478:	f3 0f 5a 44 24 08    	cvtss2sd xmm0,DWORD PTR [rsp+0x8]
 140447e:	f2 0f 11 44 24 08    	movsd  QWORD PTR [rsp+0x8],xmm0
 1404484:	31 ed                	xor    ebp,ebp
 1404486:	48 63 ed             	movsxd rbp,ebp
 1404489:	45 8b 3c ac          	mov    r15d,DWORD PTR [r12+rbp*4]
 140448d:	f3 41 0f 2a c7       	cvtsi2ss xmm0,r15d
 1404492:	f3 0f 59 44 24 20    	mulss  xmm0,DWORD PTR [rsp+0x20]
 1404498:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
 140449c:	e8 cf c8 3e 00       	call   17f0d70 <cos@plt>
 14044a1:	f2 0f 58 c0          	addsd  xmm0,xmm0
 14044a5:	f2 0f 5a c8          	cvtsd2ss xmm1,xmm0
 14044a9:	6a 01                	push   0x1
 14044ab:	58                   	pop    rax
 14044ac:	0f 28 05 6d 9b f8 fe 	movaps xmm0,XMMWORD PTR [rip+0xfffffffffef89b6d]        # 38e020 <_ZTSSt12bad_any_cast@@Base-0x21a8>
--
 140454a:	f2 0f 5c 44 24 08    	subsd  xmm0,QWORD PTR [rsp+0x8]
 1404550:	f2 0f 59 05 30 ad f8 	mulsd  xmm0,QWORD PTR [rip+0xfffffffffef8ad30]        # 38f288 <_ZTSSt12bad_any_cast@@Base-0xf40>
 1404557:	fe 
 1404558:	e8 d3 c7 3e 00       	call   17f0d30 <exp@plt>
 140455d:	f2 0f 5a c0          	cvtsd2ss xmm0,xmm0
 1404561:	48 89 e8             	mov    rax,rbp
 1404564:	f3 0f 10 0c ab       	movss  xmm1,DWORD PTR [rbx+rbp*4]
 1404569:	f3 0f 59 c8          	mulss  xmm1,xmm0
 140456d:	f3 0f 11 0c ab       	movss  DWORD PTR [rbx+rbp*4],xmm1
 1404572:	48 ff c5             	inc    rbp
 1404575:	45 39 7c 84 04       	cmp    DWORD PTR [r12+rax*4+0x4],r15d
 140457a:	74 e5                	je     1404561 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249ae5>
 140457c:	39 6c 24 18          	cmp    DWORD PTR [rsp+0x18],ebp
 1404580:	0f 8f 00 ff ff ff    	jg     1404486 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249a0a>
 1404586:	6a 01                	push   0x1
 1404588:	5d                   	pop    rbp
 1404589:	eb 19                	jmp    14045a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249b28>
 140458b:	48 8b 47 38          	mov    rax,QWORD PTR [rdi+0x38]
 140458f:	49 63 54 87 10       	movsxd rdx,DWORD PTR [r15+rax*4+0x10]
 1404594:	48 c1 e2 02          	shl    rdx,0x2
 1404598:	31 ed                	xor    ebp,ebp
 140459a:	48 89 df             	mov    rdi,rbx
 140459d:	31 f6                	xor    esi,esi
 140459f:	e8 ec a5 3e 00       	call   17eeb90 <memset@plt>
 14045a4:	89 e8                	mov    eax,ebp
 14045a6:	48 83 c4 38          	add    rsp,0x38
 14045aa:	5b                   	pop    rbx
 14045ab:	41 5c                	pop    r12
 14045ad:	41 5d                	pop    r13
 14045af:	41 5e                	pop    r14
 14045b1:	41 5f                	pop    r15
 14045b3:	5d                   	pop    rbp
 14045b4:	c3                   	ret
 14045b5:	55                   	push   rbp
 14045b6:	41 57                	push   r15
 14045b8:	41 56                	push   r14
 14045ba:	41 55                	push   r13
--
 14047c7:	4c 89 ff             	mov    rdi,r15
 14047ca:	89 ee                	mov    esi,ebp
 14047cc:	e8 67 3f 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 14047d1:	42 89 44 b3 04       	mov    DWORD PTR [rbx+r14*4+0x4],eax
 14047d6:	85 c0                	test   eax,eax
 14047d8:	0f 88 75 02 00 00    	js     1404a53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249fd7>
 14047de:	41 39 c5             	cmp    r13d,eax
 14047e1:	44 0f 4e e8          	cmovle r13d,eax
 14047e5:	49 ff c6             	inc    r14
 14047e8:	4d 39 f4             	cmp    r12,r14
 14047eb:	75 da                	jne    14047c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249d4b>
 14047ed:	44 89 e8             	mov    eax,r13d
 14047f0:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 14047f5:	48 8d ab 40 01 00 00 	lea    rbp,[rbx+0x140]
 14047fc:	45 31 e4             	xor    r12d,r12d
 14047ff:	6a 03                	push   0x3
 1404801:	5e                   	pop    rsi
 1404802:	6a 02                	push   0x2
 1404804:	41 5d                	pop    r13
 1404806:	4c 89 ff             	mov    rdi,r15
 1404809:	e8 2a 3f 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 140480e:	ff c0                	inc    eax
 1404810:	42 89 84 a3 80 00 00 	mov    DWORD PTR [rbx+r12*4+0x80],eax
 1404817:	00 
 1404818:	4c 89 ff             	mov    rdi,r15
 140481b:	45 89 ee             	mov    r14d,r13d
 140481e:	44 89 ee             	mov    esi,r13d
 1404821:	e8 12 3f 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1404826:	42 89 84 a3 c0 00 00 	mov    DWORD PTR [rbx+r12*4+0xc0],eax
 140482d:	00 
 140482e:	85 c0                	test   eax,eax
 1404830:	0f 88 1d 02 00 00    	js     1404a53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249fd7>
 1404836:	74 15                	je     140484d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249dd1>
 1404838:	4c 89 ff             	mov    rdi,r15
 140483b:	6a 08                	push   0x8
 140483d:	5e                   	pop    rsi
 140483e:	e8 f5 3e 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
--
 1404888:	e8 ab 3e 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 140488d:	8d 48 ff             	lea    ecx,[rax-0x1]
 1404890:	42 89 4c ad 00       	mov    DWORD PTR [rbp+r13*4+0x0],ecx
 1404895:	3d 00 00 00 80       	cmp    eax,0x80000000
 140489a:	0f 87 b3 01 00 00    	ja     1404a53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249fd7>
 14048a0:	49 ff c5             	inc    r13
 14048a3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 14048a8:	3b 48 20             	cmp    ecx,DWORD PTR [rax+0x20]
 14048ab:	7c c1                	jl     140486e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249df2>
 14048ad:	e9 a1 01 00 00       	jmp    1404a53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249fd7>
 14048b2:	49 8d 44 24 01       	lea    rax,[r12+0x1]
 14048b7:	48 83 c5 20          	add    rbp,0x20
 14048bb:	4c 3b 64 24 18       	cmp    r12,QWORD PTR [rsp+0x18]
 14048c0:	49 89 c4             	mov    r12,rax
 14048c3:	6a 03                	push   0x3
 14048c5:	5e                   	pop    rsi
 14048c6:	45 89 f5             	mov    r13d,r14d
 14048c9:	0f 85 37 ff ff ff    	jne    1404806 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249d8a>
 14048cf:	6a 02                	push   0x2
 14048d1:	5e                   	pop    rsi
 14048d2:	4c 89 ff             	mov    rdi,r15
 14048d5:	e8 5e 3e 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 14048da:	ff c0                	inc    eax
 14048dc:	89 83 40 03 00 00    	mov    DWORD PTR [rbx+0x340],eax
 14048e2:	6a 04                	push   0x4
 14048e4:	5e                   	pop    rsi
 14048e5:	4c 89 ff             	mov    rdi,r15
 14048e8:	e8 4b 3e 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 14048ed:	49 89 c4             	mov    r12,rax
 14048f0:	45 85 e4             	test   r12d,r12d
 14048f3:	0f 88 5a 01 00 00    	js     1404a53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249fd7>
 14048f9:	44 89 e1             	mov    ecx,r12d
 14048fc:	d3 64 24 0c          	shl    DWORD PTR [rsp+0xc],cl
 1404900:	8b 03                	mov    eax,DWORD PTR [rbx]
 1404902:	85 c0                	test   eax,eax
 1404904:	7e 68                	jle    140496e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x249ef2>
 1404906:	45 31 ed             	xor    r13d,r13d
--
 1405036:	b8 ff 00 00 00       	mov    eax,0xff
 140503b:	41 39 c3             	cmp    r11d,eax
 140503e:	44 0f 4d d8          	cmovge r11d,eax
 1405042:	45 31 d2             	xor    r10d,r10d
 1405045:	45 85 db             	test   r11d,r11d
 1405048:	45 0f 4e da          	cmovle r11d,r10d
 140504c:	83 be 04 05 00 00 02 	cmp    DWORD PTR [rsi+0x504],0x2
 1405053:	0f 8c 5c 01 00 00    	jl     14051b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24a739>
 1405059:	6a 01                	push   0x1
 140505b:	41 5f                	pop    r15
 140505d:	31 ed                	xor    ebp,ebp
 140505f:	31 d2                	xor    edx,edx
 1405061:	4c 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],r13
 1405066:	4c 89 44 24 10       	mov    QWORD PTR [rsp+0x10],r8
 140506b:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi
 1405070:	4a 63 84 be 04 01 00 	movsxd rax,DWORD PTR [rsi+r15*4+0x104]
 1405077:	00 
 1405078:	45 8b 34 80          	mov    r14d,DWORD PTR [r8+rax*4]
 140507c:	41 81 fe ff 7f 00 00 	cmp    r14d,0x7fff
 1405083:	0f 87 16 01 00 00    	ja     140519f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24a723>
 1405089:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
 140508e:	44 0f af b2 40 03 00 	imul   r14d,DWORD PTR [rdx+0x340]
 1405095:	00 
 1405096:	bf ff 00 00 00       	mov    edi,0xff
 140509b:	41 39 fe             	cmp    r14d,edi
 140509e:	44 0f 4d f7          	cmovge r14d,edi
 14050a2:	8b 9c 82 44 03 00 00 	mov    ebx,DWORD PTR [rdx+rax*4+0x344]
 14050a9:	45 85 f6             	test   r14d,r14d
 14050ac:	45 0f 4e f2          	cmovle r14d,r10d
 14050b0:	44 89 f7             	mov    edi,r14d
 14050b3:	44 29 df             	sub    edi,r11d
 14050b6:	41 89 dc             	mov    r12d,ebx
 14050b9:	41 29 ec             	sub    r12d,ebp
 14050bc:	41 89 f9             	mov    r9d,edi
 14050bf:	41 f7 d9             	neg    r9d
 14050c2:	44 0f 48 cf          	cmovs  r9d,edi
 14050c6:	89 f8                	mov    eax,edi
--
 140514a:	4d 63 eb             	movsxd r13,r11d
 140514d:	4c 8d 15 6c 59 02 ff 	lea    r10,[rip+0xffffffffff02596c]        # 42aac0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5050f>
 1405154:	f3 43 0f 10 04 aa    	movss  xmm0,DWORD PTR [r10+r13*4]
 140515a:	f3 0f 59 04 91       	mulss  xmm0,DWORD PTR [rcx+rdx*4]
 140515f:	41 29 d8             	sub    r8d,ebx
 1405162:	f3 0f 11 04 91       	movss  DWORD PTR [rcx+rdx*4],xmm0
 1405167:	48 ff c2             	inc    rdx
 140516a:	48 39 ea             	cmp    rdx,rbp
 140516d:	7c bc                	jl     140512b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24a6af>
 140516f:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]
 1405173:	89 d5                	mov    ebp,edx
 1405175:	45 89 f3             	mov    r11d,r14d
 1405178:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
 140517d:	4c 8b 44 24 10       	mov    r8,QWORD PTR [rsp+0x10]
 1405182:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
 1405187:	45 31 d2             	xor    r10d,r10d
 140518a:	eb 13                	jmp    140519f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24a723>
 140518c:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]
 1405190:	89 d5                	mov    ebp,edx
 1405192:	45 89 f3             	mov    r11d,r14d
 1405195:	4c 8b 44 24 10       	mov    r8,QWORD PTR [rsp+0x10]
 140519a:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
 140519f:	49 ff c7             	inc    r15
 14051a2:	48 63 86 04 05 00 00 	movsxd rax,DWORD PTR [rsi+0x504]
 14051a9:	49 39 c7             	cmp    r15,rax
 14051ac:	0f 8c be fe ff ff    	jl     1405070 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24a5f4>
 14051b2:	4c 63 d2             	movsxd r10,edx
 14051b5:	49 63 c5             	movsxd rax,r13d
 14051b8:	6a 01                	push   0x1
 14051ba:	5b                   	pop    rbx
 14051bb:	4c 39 d0             	cmp    rax,r10
 14051be:	7e 3c                	jle    14051fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24a780>
 14051c0:	44 89 da             	mov    edx,r11d
 14051c3:	48 8d 35 f6 58 02 ff 	lea    rsi,[rip+0xffffffffff0258f6]        # 42aac0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5050f>
 14051ca:	f3 0f 10 04 96       	movss  xmm0,DWORD PTR [rsi+rdx*4]
 14051cf:	f3 42 0f 10 0c 91    	movss  xmm1,DWORD PTR [rcx+r10*4]
 14051d5:	f3 0f 59 c8          	mulss  xmm1,xmm0
--
 14055fa:	0f 57 c2             	xorps  xmm0,xmm2
 14055fd:	f3 0f 10 4a fc       	movss  xmm1,DWORD PTR [rdx-0x4]
 1405602:	f3 0f 59 08          	mulss  xmm1,DWORD PTR [rax]
 1405606:	f3 0f 59 02          	mulss  xmm0,DWORD PTR [rdx]
 140560a:	f3 0f 5c c1          	subss  xmm0,xmm1
 140560e:	f3 0f 11 41 f4       	movss  DWORD PTR [rcx-0xc],xmm0
 1405613:	f3 0f 10 00          	movss  xmm0,DWORD PTR [rax]
 1405617:	f3 0f 10 4a fc       	movss  xmm1,DWORD PTR [rdx-0x4]
 140561c:	f3 0f 59 48 08       	mulss  xmm1,DWORD PTR [rax+0x8]
 1405621:	f3 0f 59 02          	mulss  xmm0,DWORD PTR [rdx]
 1405625:	f3 0f 5c c1          	subss  xmm0,xmm1
 1405629:	f3 0f 11 41 f8       	movss  DWORD PTR [rcx-0x8],xmm0
 140562e:	f3 0f 10 40 18       	movss  xmm0,DWORD PTR [rax+0x18]
 1405633:	0f 57 c2             	xorps  xmm0,xmm2
 1405636:	f3 0f 10 4a f4       	movss  xmm1,DWORD PTR [rdx-0xc]
 140563b:	f3 0f 59 48 10       	mulss  xmm1,DWORD PTR [rax+0x10]
 1405640:	f3 0f 59 42 f8       	mulss  xmm0,DWORD PTR [rdx-0x8]
 1405645:	f3 0f 5c c1          	subss  xmm0,xmm1
 1405649:	f3 0f 11 41 fc       	movss  DWORD PTR [rcx-0x4],xmm0
 140564e:	f3 0f 10 40 10       	movss  xmm0,DWORD PTR [rax+0x10]
 1405653:	f3 0f 10 4a f4       	movss  xmm1,DWORD PTR [rdx-0xc]
 1405658:	f3 0f 59 48 18       	mulss  xmm1,DWORD PTR [rax+0x18]
 140565d:	f3 0f 59 42 f8       	mulss  xmm0,DWORD PTR [rdx-0x8]
 1405662:	f3 0f 5c c1          	subss  xmm0,xmm1
 1405666:	f3 0f 11 01          	movss  DWORD PTR [rcx],xmm0
 140566a:	48 83 c0 e0          	add    rax,0xffffffffffffffe0
 140566e:	48 83 c1 f0          	add    rcx,0xfffffffffffffff0
 1405672:	48 83 c2 10          	add    rdx,0x10
 1405676:	4c 39 c0             	cmp    rax,r8
 1405679:	0f 83 76 ff ff ff    	jae    14055f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ab79>
 140567f:	4c 89 75 80          	mov    QWORD PTR [rbp-0x80],r14
 1405683:	4c 89 4d 88          	mov    QWORD PTR [rbp-0x78],r9
 1405687:	48 89 75 c0          	mov    QWORD PTR [rbp-0x40],rsi
 140568b:	48 8d 46 e0          	lea    rax,[rsi-0x20]
 140568f:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 1405693:	4c 89 9d 68 ff ff ff 	mov    QWORD PTR [rbp-0x98],r11
 140569a:	4c 01 d9             	add    rcx,r11
 140569d:	48 83 c1 fc          	add    rcx,0xfffffffffffffffc
 14056a1:	48 89 bd 70 ff ff ff 	mov    QWORD PTR [rbp-0x90],rdi
 14056a8:	48 89 fa             	mov    rdx,rdi
 14056ab:	f3 0f 10 40 10       	movss  xmm0,DWORD PTR [rax+0x10]
 14056b0:	f3 0f 10 48 18       	movss  xmm1,DWORD PTR [rax+0x18]
 14056b5:	f3 0f 59 49 fc       	mulss  xmm1,DWORD PTR [rcx-0x4]
 14056ba:	f3 0f 59 01          	mulss  xmm0,DWORD PTR [rcx]
 14056be:	f3 0f 58 c1          	addss  xmm0,xmm1
 14056c2:	f3 0f 11 02          	movss  DWORD PTR [rdx],xmm0
 14056c6:	f3 0f 10 40 10       	movss  xmm0,DWORD PTR [rax+0x10]
 14056cb:	f3 0f 10 09          	movss  xmm1,DWORD PTR [rcx]
 14056cf:	f3 0f 59 48 18       	mulss  xmm1,DWORD PTR [rax+0x18]
 14056d4:	f3 0f 59 41 fc       	mulss  xmm0,DWORD PTR [rcx-0x4]
 14056d9:	f3 0f 5c c1          	subss  xmm0,xmm1
 14056dd:	f3 0f 11 42 04       	movss  DWORD PTR [rdx+0x4],xmm0
 14056e2:	f3 0f 10 00          	movss  xmm0,DWORD PTR [rax]
 14056e6:	f3 0f 10 48 08       	movss  xmm1,DWORD PTR [rax+0x8]
 14056eb:	f3 0f 59 49 f4       	mulss  xmm1,DWORD PTR [rcx-0xc]
 14056f0:	f3 0f 59 41 f8       	mulss  xmm0,DWORD PTR [rcx-0x8]
 14056f5:	f3 0f 58 c1          	addss  xmm0,xmm1
 14056f9:	f3 0f 11 42 08       	movss  DWORD PTR [rdx+0x8],xmm0
 14056fe:	f3 0f 10 00          	movss  xmm0,DWORD PTR [rax]
 1405702:	f3 0f 10 49 f8       	movss  xmm1,DWORD PTR [rcx-0x8]
 1405707:	f3 0f 59 48 08       	mulss  xmm1,DWORD PTR [rax+0x8]
 140570c:	f3 0f 59 41 f4       	mulss  xmm0,DWORD PTR [rcx-0xc]
 1405711:	f3 0f 5c c1          	subss  xmm0,xmm1
 1405715:	f3 0f 11 42 0c       	movss  DWORD PTR [rdx+0xc],xmm0
 140571a:	48 83 c0 e0          	add    rax,0xffffffffffffffe0
 140571e:	48 83 c1 f0          	add    rcx,0xfffffffffffffff0
 1405722:	48 83 c2 10          	add    rdx,0x10
 1405726:	4c 39 c0             	cmp    rax,r8
 1405729:	73 80                	jae    14056ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ac2f>
 140572b:	4c 89 45 90          	mov    QWORD PTR [rbp-0x70],r8
 140572f:	48 89 9d 78 ff ff ff 	mov    QWORD PTR [rbp-0x88],rbx
 1405736:	8b 43 04             	mov    eax,DWORD PTR [rbx+0x4]
 1405739:	89 45 c8             	mov    DWORD PTR [rbp-0x38],eax
--
 140573f:	0f 8c 4a 04 00 00    	jl     1405b8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24b113>
 1405745:	48 8b 85 78 ff ff ff 	mov    rax,QWORD PTR [rbp-0x88]
 140574c:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
 1405750:	48 8b 85 70 ff ff ff 	mov    rax,QWORD PTR [rbp-0x90]
 1405757:	48 83 c0 e0          	add    rax,0xffffffffffffffe0
 140575b:	48 8b 4d 90          	mov    rcx,QWORD PTR [rbp-0x70]
 140575f:	48 8b 55 80          	mov    rdx,QWORD PTR [rbp-0x80]
 1405763:	48 8d 0c d1          	lea    rcx,[rcx+rdx*8]
 1405767:	48 83 c1 fc          	add    rcx,0xfffffffffffffffc
 140576b:	48 89 75 98          	mov    QWORD PTR [rbp-0x68],rsi
 140576f:	48 8d 56 34          	lea    rdx,[rsi+0x34]
 1405773:	48 8b 75 c0          	mov    rsi,QWORD PTR [rbp-0x40]
 1405777:	f3 0f 10 40 18       	movss  xmm0,DWORD PTR [rax+0x18]
 140577c:	f3 0f 10 49 fc       	movss  xmm1,DWORD PTR [rcx-0x4]
 1405781:	f3 0f 10 11          	movss  xmm2,DWORD PTR [rcx]
 1405785:	0f 28 d9             	movaps xmm3,xmm1
 1405788:	0f 28 e2             	movaps xmm4,xmm2
 140578b:	f3 0f 5c 60 1c       	subss  xmm4,DWORD PTR [rax+0x1c]
 1405790:	f3 0f 58 c8          	addss  xmm1,xmm0
 1405794:	f3 0f 11 49 fc       	movss  DWORD PTR [rcx-0x4],xmm1
 1405799:	f3 0f 58 50 1c       	addss  xmm2,DWORD PTR [rax+0x1c]
 140579e:	f3 0f 5c d8          	subss  xmm3,xmm0
 14057a2:	f3 0f 11 11          	movss  DWORD PTR [rcx],xmm2
 14057a6:	f3 0f 10 42 cc       	movss  xmm0,DWORD PTR [rdx-0x34]
 14057ab:	f3 0f 59 c3          	mulss  xmm0,xmm3
 14057af:	f3 0f 10 4a d0       	movss  xmm1,DWORD PTR [rdx-0x30]
 14057b4:	f3 0f 59 cc          	mulss  xmm1,xmm4
 14057b8:	f3 0f 58 c8          	addss  xmm1,xmm0
 14057bc:	f3 0f 11 48 18       	movss  DWORD PTR [rax+0x18],xmm1
 14057c1:	f3 0f 59 5a d0       	mulss  xmm3,DWORD PTR [rdx-0x30]
 14057c6:	f3 0f 59 62 cc       	mulss  xmm4,DWORD PTR [rdx-0x34]
 14057cb:	f3 0f 5c e3          	subss  xmm4,xmm3
 14057cf:	f3 0f 11 60 1c       	movss  DWORD PTR [rax+0x1c],xmm4
 14057d4:	f3 0f 10 40 10       	movss  xmm0,DWORD PTR [rax+0x10]
 14057d9:	f3 0f 10 49 f4       	movss  xmm1,DWORD PTR [rcx-0xc]
 14057de:	f3 0f 10 51 f8       	movss  xmm2,DWORD PTR [rcx-0x8]
 14057e3:	0f 28 d9             	movaps xmm3,xmm1
 14057e6:	f3 0f 5c d8          	subss  xmm3,xmm0
 14057ea:	0f 28 e2             	movaps xmm4,xmm2
 14057ed:	f3 0f 5c 60 14       	subss  xmm4,DWORD PTR [rax+0x14]
 14057f2:	f3 0f 58 c8          	addss  xmm1,xmm0
 14057f6:	f3 0f 11 49 f4       	movss  DWORD PTR [rcx-0xc],xmm1
 14057fb:	f3 0f 58 50 14       	addss  xmm2,DWORD PTR [rax+0x14]
 1405800:	f3 0f 11 51 f8       	movss  DWORD PTR [rcx-0x8],xmm2
 1405805:	f3 0f 10 42 dc       	movss  xmm0,DWORD PTR [rdx-0x24]
 140580a:	f3 0f 59 c3          	mulss  xmm0,xmm3
 140580e:	f3 0f 10 4a e0       	movss  xmm1,DWORD PTR [rdx-0x20]
 1405813:	f3 0f 59 cc          	mulss  xmm1,xmm4
 1405817:	f3 0f 58 c8          	addss  xmm1,xmm0
 140581b:	f3 0f 11 48 10       	movss  DWORD PTR [rax+0x10],xmm1
 1405820:	f3 0f 59 5a e0       	mulss  xmm3,DWORD PTR [rdx-0x20]
 1405825:	f3 0f 59 62 dc       	mulss  xmm4,DWORD PTR [rdx-0x24]
 140582a:	f3 0f 5c e3          	subss  xmm4,xmm3
--
 1405978:	4c 89 d8             	mov    rax,r11
 140597b:	48 c1 e0 04          	shl    rax,0x4
 140597f:	31 d2                	xor    edx,edx
 1405981:	48 89 d6             	mov    rsi,rdx
 1405984:	49 0f af f1          	imul   rsi,r9
 1405988:	4c 8b 7d c0          	mov    r15,QWORD PTR [rbp-0x40]
 140598c:	4d 8d 2c b7          	lea    r13,[r15+rsi*4]
 1405990:	4e 8d 24 95 e0 ff ff 	lea    r12,[r10*4-0x20]
 1405997:	ff 
 1405998:	4d 01 ec             	add    r12,r13
 140599b:	48 8b 75 98          	mov    rsi,QWORD PTR [rbp-0x68]
 140599f:	49 89 df             	mov    r15,rbx
 14059a2:	f3 41 0f 10 44 24 18 	movss  xmm0,DWORD PTR [r12+0x18]
 14059a9:	f3 41 0f 10 4f fc    	movss  xmm1,DWORD PTR [r15-0x4]
 14059af:	f3 41 0f 10 17       	movss  xmm2,DWORD PTR [r15]
 14059b4:	0f 28 d9             	movaps xmm3,xmm1
 14059b7:	0f 28 e2             	movaps xmm4,xmm2
 14059ba:	f3 41 0f 5c 64 24 1c 	subss  xmm4,DWORD PTR [r12+0x1c]
 14059c1:	f3 0f 58 c8          	addss  xmm1,xmm0
 14059c5:	f3 41 0f 11 4f fc    	movss  DWORD PTR [r15-0x4],xmm1
 14059cb:	f3 41 0f 58 54 24 1c 	addss  xmm2,DWORD PTR [r12+0x1c]
 14059d2:	f3 0f 5c d8          	subss  xmm3,xmm0
 14059d6:	f3 41 0f 11 17       	movss  DWORD PTR [r15],xmm2
 14059db:	f3 0f 10 06          	movss  xmm0,DWORD PTR [rsi]
 14059df:	f3 0f 59 c3          	mulss  xmm0,xmm3
 14059e3:	f3 0f 10 4e 04       	movss  xmm1,DWORD PTR [rsi+0x4]
 14059e8:	f3 0f 59 cc          	mulss  xmm1,xmm4
 14059ec:	f3 0f 58 c8          	addss  xmm1,xmm0
 14059f0:	f3 41 0f 11 4c 24 18 	movss  DWORD PTR [r12+0x18],xmm1
 14059f7:	f3 0f 59 5e 04       	mulss  xmm3,DWORD PTR [rsi+0x4]
 14059fc:	f3 0f 59 26          	mulss  xmm4,DWORD PTR [rsi]
 1405a00:	f3 0f 5c e3          	subss  xmm4,xmm3
 1405a04:	f3 41 0f 11 64 24 1c 	movss  DWORD PTR [r12+0x1c],xmm4
 1405a0b:	f3 41 0f 10 44 24 10 	movss  xmm0,DWORD PTR [r12+0x10]
 1405a12:	f3 41 0f 10 4f f4    	movss  xmm1,DWORD PTR [r15-0xc]
 1405a18:	f3 41 0f 10 57 f8    	movss  xmm2,DWORD PTR [r15-0x8]
 1405a1e:	0f 28 d9             	movaps xmm3,xmm1
 1405a21:	f3 0f 5c d8          	subss  xmm3,xmm0
 1405a25:	0f 28 e2             	movaps xmm4,xmm2
 1405a28:	f3 41 0f 5c 64 24 14 	subss  xmm4,DWORD PTR [r12+0x14]
 1405a2f:	f3 0f 58 c8          	addss  xmm1,xmm0
 1405a33:	f3 41 0f 11 4f f4    	movss  DWORD PTR [r15-0xc],xmm1
 1405a39:	f3 41 0f 58 54 24 14 	addss  xmm2,DWORD PTR [r12+0x14]
 1405a40:	f3 41 0f 11 57 f8    	movss  DWORD PTR [r15-0x8],xmm2
 1405a46:	f3 42 0f 10 04 9e    	movss  xmm0,DWORD PTR [rsi+r11*4]
 1405a4c:	f3 0f 59 c3          	mulss  xmm0,xmm3
 1405a50:	f3 42 0f 10 4c 9e 04 	movss  xmm1,DWORD PTR [rsi+r11*4+0x4]
 1405a57:	f3 0f 59 cc          	mulss  xmm1,xmm4
 1405a5b:	f3 0f 58 c8          	addss  xmm1,xmm0
 1405a5f:	f3 41 0f 11 4c 24 10 	movss  DWORD PTR [r12+0x10],xmm1
 1405a66:	f3 42 0f 59 5c 9e 04 	mulss  xmm3,DWORD PTR [rsi+r11*4+0x4]
 1405a6d:	f3 42 0f 59 24 9e    	mulss  xmm4,DWORD PTR [rsi+r11*4]
 1405a73:	f3 0f 5c e3          	subss  xmm4,xmm3
--
 1405b8f:	83 7d a0 00          	cmp    DWORD PTR [rbp-0x60],0x0
 1405b93:	44 0f 28 05 e5 83 f8 	movaps xmm8,XMMWORD PTR [rip+0xfffffffffef883e5]        # 38df80 <_ZTSSt12bad_any_cast@@Base-0x2248>
 1405b9a:	fe 
 1405b9b:	44 0f 28 0d 2d 7b f8 	movaps xmm9,XMMWORD PTR [rip+0xfffffffffef87b2d]        # 38d6d0 <_ZTSSt12bad_any_cast@@Base-0x2af8>
 1405ba2:	fe 
 1405ba3:	48 8b 5d c0          	mov    rbx,QWORD PTR [rbp-0x40]
 1405ba7:	4c 8b 65 80          	mov    r12,QWORD PTR [rbp-0x80]
 1405bab:	0f 8e ca 01 00 00    	jle    1405d7b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24b2ff>
 1405bb1:	49 89 de             	mov    r14,rbx
 1405bb4:	45 31 ed             	xor    r13d,r13d
 1405bb7:	41 0f 10 5e 68       	movups xmm3,XMMWORD PTR [r14+0x68]
 1405bbc:	41 0f 10 46 08       	movups xmm0,XMMWORD PTR [r14+0x8]
 1405bc1:	41 0f 10 56 18       	movups xmm2,XMMWORD PTR [r14+0x18]
 1405bc6:	41 0f 10 66 28       	movups xmm4,XMMWORD PTR [r14+0x28]
 1405bcb:	41 0f 10 4e 48       	movups xmm1,XMMWORD PTR [r14+0x48]
 1405bd0:	0f 28 eb             	movaps xmm5,xmm3
 1405bd3:	0f 5c ec             	subps  xmm5,xmm4
 1405bd6:	0f 28 f5             	movaps xmm6,xmm5
 1405bd9:	0f c6 f5 ff          	shufps xmm6,xmm5,0xff
 1405bdd:	0f 59 35 fc 84 f8 fe 	mulps  xmm6,XMMWORD PTR [rip+0xfffffffffef884fc]        # 38e0e0 <_ZTSSt12bad_any_cast@@Base-0x20e8>
 1405be4:	0f 28 fd             	movaps xmm7,xmm5
 1405be7:	0f 15 fd             	unpckhps xmm7,xmm5
 1405bea:	41 0f 59 fb          	mulps  xmm7,xmm11
 1405bee:	0f 58 fe             	addps  xmm7,xmm6
 1405bf1:	41 0f 13 7e 30       	movlps QWORD PTR [r14+0x30],xmm7
 1405bf6:	f3 0f 16 f5          	movshdup xmm6,xmm5
 1405bfa:	0f 58 dc             	addps  xmm3,xmm4
 1405bfd:	41 0f 11 5e 68       	movups XMMWORD PTR [r14+0x68],xmm3
 1405c02:	0f 28 dd             	movaps xmm3,xmm5
 1405c05:	f3 0f 5c de          	subss  xmm3,xmm6
 1405c09:	f3 41 0f 59 dc       	mulss  xmm3,xmm12
 1405c0e:	f3 41 0f 11 5e 28    	movss  DWORD PTR [r14+0x28],xmm3
 1405c14:	f3 0f 58 ee          	addss  xmm5,xmm6
 1405c18:	f3 41 0f 59 ec       	mulss  xmm5,xmm12
 1405c1d:	f3 41 0f 11 6e 2c    	movss  DWORD PTR [r14+0x2c],xmm5
 1405c23:	41 0f 10 5e 58       	movups xmm3,XMMWORD PTR [r14+0x58]
 1405c28:	0f 28 e3             	movaps xmm4,xmm3
--
 1405c35:	0f 28 f4             	movaps xmm6,xmm4
 1405c38:	0f c6 f4 eb          	shufps xmm6,xmm4,0xeb
 1405c3c:	41 0f 28 fd          	movaps xmm7,xmm13
 1405c40:	41 0f c6 fd e1       	shufps xmm7,xmm13,0xe1
 1405c45:	0f 59 fe             	mulps  xmm7,xmm6
 1405c48:	41 0f 59 ee          	mulps  xmm5,xmm14
 1405c4c:	0f 58 ef             	addps  xmm5,xmm7
 1405c4f:	41 0f 13 6e 20       	movlps QWORD PTR [r14+0x20],xmm5
 1405c54:	0f 28 ea             	movaps xmm5,xmm2
 1405c57:	0f 5c eb             	subps  xmm5,xmm3
 1405c5a:	0f 58 da             	addps  xmm3,xmm2
 1405c5d:	41 0f 11 5e 58       	movups XMMWORD PTR [r14+0x58],xmm3
 1405c62:	66 41 0f 3a 17 6e 18 	extractps DWORD PTR [r14+0x18],xmm5,0x1
 1405c69:	01 
 1405c6a:	f3 41 0f 11 66 1c    	movss  DWORD PTR [r14+0x1c],xmm4
 1405c70:	0f 28 d0             	movaps xmm2,xmm0
 1405c73:	0f 5c d1             	subps  xmm2,xmm1
 1405c76:	0f 28 da             	movaps xmm3,xmm2
 1405c79:	f3 0f 16 e2          	movshdup xmm4,xmm2
 1405c7d:	0f 28 ea             	movaps xmm5,xmm2
 1405c80:	f3 0f 58 ec          	addss  xmm5,xmm4
 1405c84:	f3 0f 5c e2          	subss  xmm4,xmm2
 1405c88:	0f 15 d2             	unpckhps xmm2,xmm2
 1405c8b:	41 0f 59 d7          	mulps  xmm2,xmm15
 1405c8f:	0f c6 db ff          	shufps xmm3,xmm3,0xff
 1405c93:	41 0f 59 db          	mulps  xmm3,xmm11
 1405c97:	0f 58 da             	addps  xmm3,xmm2
 1405c9a:	41 0f 13 5e 10       	movlps QWORD PTR [r14+0x10],xmm3
 1405c9f:	0f 58 c1             	addps  xmm0,xmm1
 1405ca2:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
 1405ca7:	f3 41 0f 59 ec       	mulss  xmm5,xmm12
 1405cac:	f3 41 0f 11 6e 08    	movss  DWORD PTR [r14+0x8],xmm5
 1405cb2:	f3 41 0f 59 e4       	mulss  xmm4,xmm12
 1405cb7:	f3 41 0f 11 66 0c    	movss  DWORD PTR [r14+0xc],xmm4
 1405cbd:	4d 8d 7e 40          	lea    r15,[r14+0x40]
 1405cc1:	f3 41 0f 10 06       	movss  xmm0,DWORD PTR [r14]
 1405cc6:	f3 41 0f 10 4e 04    	movss  xmm1,DWORD PTR [r14+0x4]
--
 1405fec:	f3 42 0f 59 44 38 f8 	mulss  xmm0,DWORD PTR [rax+r15*1-0x8]
 1405ff3:	f3 0f 5c c1          	subss  xmm0,xmm1
 1405ff7:	f3 41 0f 11 40 04    	movss  DWORD PTR [r8+0x4],xmm0
 1405ffd:	f3 41 0f 10 41 10    	movss  xmm0,DWORD PTR [r9+0x10]
 1406003:	f3 41 0f 10 49 14    	movss  xmm1,DWORD PTR [r9+0x14]
 1406009:	f3 42 0f 59 4c 38 f8 	mulss  xmm1,DWORD PTR [rax+r15*1-0x8]
 1406010:	f3 42 0f 59 44 38 f4 	mulss  xmm0,DWORD PTR [rax+r15*1-0xc]
 1406017:	f3 0f 58 c1          	addss  xmm0,xmm1
 140601b:	0f 57 c2             	xorps  xmm0,xmm2
 140601e:	f3 0f 11 46 08       	movss  DWORD PTR [rsi+0x8],xmm0
 1406023:	f3 42 0f 10 44 38 fc 	movss  xmm0,DWORD PTR [rax+r15*1-0x4]
 140602a:	f3 41 0f 59 41 1c    	mulss  xmm0,DWORD PTR [r9+0x1c]
 1406030:	f3 41 0f 10 49 18    	movss  xmm1,DWORD PTR [r9+0x18]
 1406036:	f3 42 0f 59 0c 38    	mulss  xmm1,DWORD PTR [rax+r15*1]
 140603c:	f3 0f 5c c8          	subss  xmm1,xmm0
 1406040:	f3 41 0f 11 08       	movss  DWORD PTR [r8],xmm1
 1406045:	f3 41 0f 10 41 1c    	movss  xmm0,DWORD PTR [r9+0x1c]
 140604b:	f3 42 0f 59 04 38    	mulss  xmm0,DWORD PTR [rax+r15*1]
 1406051:	f3 41 0f 10 49 18    	movss  xmm1,DWORD PTR [r9+0x18]
 1406057:	f3 42 0f 59 4c 38 fc 	mulss  xmm1,DWORD PTR [rax+r15*1-0x4]
 140605e:	f3 0f 58 c8          	addss  xmm1,xmm0
 1406062:	0f 57 ca             	xorps  xmm1,xmm2
 1406065:	f3 0f 11 4e 0c       	movss  DWORD PTR [rsi+0xc],xmm1
 140606a:	48 83 c6 10          	add    rsi,0x10
 140606e:	48 83 c0 20          	add    rax,0x20
 1406072:	48 83 c2 f0          	add    rdx,0xfffffffffffffff0
 1406076:	48 83 c1 10          	add    rcx,0x10
 140607a:	49 83 c1 20          	add    r9,0x20
 140607e:	4d 39 c1             	cmp    r9,r8
 1406081:	0f 82 ba fe ff ff    	jb     1405f41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24b4c5>
 1406087:	48 8b 85 60 ff ff ff 	mov    rax,QWORD PTR [rbp-0xa0]
 140608e:	49 8d 04 86          	lea    rax,[r14+rax*4]
 1406092:	4b 8d 0c 2e          	lea    rcx,[r14+r13*1]
 1406096:	48 83 c1 f0          	add    rcx,0xfffffffffffffff0
 140609a:	4a 8d 14 39          	lea    rdx,[rcx+r15*1]
 140609e:	f3 42 0f 10 44 39 0c 	movss  xmm0,DWORD PTR [rcx+r15*1+0xc]
 14060a5:	f3 0f 11 41 0c       	movss  DWORD PTR [rcx+0xc],xmm0
 14060aa:	0f 57 c2             	xorps  xmm0,xmm2
 14060ad:	f3 0f 11 00          	movss  DWORD PTR [rax],xmm0
 14060b1:	f3 42 0f 10 44 39 08 	movss  xmm0,DWORD PTR [rcx+r15*1+0x8]
 14060b8:	f3 0f 11 41 08       	movss  DWORD PTR [rcx+0x8],xmm0
 14060bd:	0f 57 c2             	xorps  xmm0,xmm2
 14060c0:	f3 0f 11 40 04       	movss  DWORD PTR [rax+0x4],xmm0
--
 1406453:	7e 59                	jle    14064ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ba32>
 1406455:	31 c9                	xor    ecx,ecx
 1406457:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
 140645c:	49 39 cc             	cmp    r12,rcx
 140645f:	74 1f                	je     1406480 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ba04>
 1406461:	48 63 94 8b 20 01 00 	movsxd rdx,DWORD PTR [rbx+rcx*4+0x120]
 1406468:	00 
 1406469:	39 c2                	cmp    edx,eax
 140646b:	7d 41                	jge    14064ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ba32>
 140646d:	48 8b 94 d6 28 0b 00 	mov    rdx,QWORD PTR [rsi+rdx*8+0xb28]
 1406474:	00 
 1406475:	48 ff c1             	inc    rcx
 1406478:	83 7a 18 00          	cmp    DWORD PTR [rdx+0x18],0x0
 140647c:	75 de                	jne    140645c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24b9e0>
 140647e:	eb 2e                	jmp    14064ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ba32>
 1406480:	8b 44 24 10          	mov    eax,DWORD PTR [rsp+0x10]
 1406484:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 1406489:	48 8b 8c c1 28 0b 00 	mov    rcx,QWORD PTR [rcx+rax*8+0xb28]
 1406490:	00 
 1406491:	8b 01                	mov    eax,DWORD PTR [rcx]
 1406493:	85 c0                	test   eax,eax
 1406495:	7e 17                	jle    14064ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ba32>
 1406497:	8b 49 08             	mov    ecx,DWORD PTR [rcx+0x8]
 140649a:	ff c0                	inc    eax
 140649c:	6a 01                	push   0x1
 140649e:	5a                   	pop    rdx
 140649f:	ff c8                	dec    eax
 14064a1:	85 c0                	test   eax,eax
 14064a3:	7e 25                	jle    14064ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ba4e>
 14064a5:	0f af 54 24 04       	imul   edx,DWORD PTR [rsp+0x4]
 14064aa:	39 ca                	cmp    edx,ecx
 14064ac:	7e f1                	jle    140649f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ba23>
 14064ae:	48 89 df             	mov    rdi,rbx
 14064b1:	e8 3a f3 64 ff       	call   a557f0 <_ZdlPv@@Base>
 14064b6:	31 db                	xor    ebx,ebx
 14064b8:	48 89 d8             	mov    rax,rbx
 14064bb:	48 83 c4 18          	add    rsp,0x18
 14064bf:	5b                   	pop    rbx
 14064c0:	41 5c                	pop    r12
 14064c2:	41 5d                	pop    r13
 14064c4:	41 5e                	pop    r14
 14064c6:	41 5f                	pop    r15
 14064c8:	5d                   	pop    rbp
 14064c9:	c3                   	ret
 14064ca:	89 53 18             	mov    DWORD PTR [rbx+0x18],edx
 14064cd:	eb e9                	jmp    14064b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ba3c>
 14064cf:	55                   	push   rbp
 14064d0:	41 57                	push   r15
 14064d2:	41 56                	push   r14
 14064d4:	41 55                	push   r13
 14064d6:	41 54                	push   r12
 14064d8:	53                   	push   rbx
 14064d9:	48 83 ec 28          	sub    rsp,0x28
 14064dd:	49 89 f7             	mov    r15,rsi
 14064e0:	49 89 fe             	mov    r14,rdi
 14064e3:	6a 01                	push   0x1
 14064e5:	5f                   	pop    rdi
 14064e6:	6a 50                	push   0x50
 14064e8:	5e                   	pop    rsi
 14064e9:	e8 d2 86 3e 00       	call   17eebc0 <calloc@plt>
 14064ee:	48 89 c3             	mov    rbx,rax
 14064f1:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
 14064f5:	48 8b 40 30          	mov    rax,QWORD PTR [rax+0x30]
 14064f9:	4c 89 3b             	mov    QWORD PTR [rbx],r15
 14064fc:	4d 63 77 14          	movsxd r14,DWORD PTR [r15+0x14]
 1406500:	44 89 73 08          	mov    DWORD PTR [rbx+0x8],r14d
 1406504:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 1406509:	48 8b 80 28 13 00 00 	mov    rax,QWORD PTR [rax+0x1328]
 1406510:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 1406514:	49 63 4f 1c          	movsxd rcx,DWORD PTR [r15+0x1c]
 1406518:	48 6b c9 60          	imul   rcx,rcx,0x60
 140651c:	48 8d 14 08          	lea    rdx,[rax+rcx*1]
 1406520:	48 89 53 18          	mov    QWORD PTR [rbx+0x18],rdx
 1406524:	48 8b 04 08          	mov    rax,QWORD PTR [rax+rcx*1]
 1406528:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 140652d:	6a 08                	push   0x8
 140652f:	5e                   	pop    rsi
 1406530:	4c 89 f7             	mov    rdi,r14
 1406533:	e8 88 86 3e 00       	call   17eebc0 <calloc@plt>
 1406538:	45 85 f6             	test   r14d,r14d
 140653b:	b9 00 00 00 00       	mov    ecx,0x0
 1406540:	41 0f 4f ce          	cmovg  ecx,r14d
 1406544:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 1406549:	49 89 c4             	mov    r12,rax
 140654c:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
 1406551:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 1406555:	b8 00 00 00 00       	mov    eax,0x0
 140655a:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 140655e:	4d 85 f6             	test   r14,r14
 1406561:	0f 8e 89 00 00 00    	jle    14065f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bb74>
 1406567:	31 c0                	xor    eax,eax
 1406569:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 140656d:	45 31 ed             	xor    r13d,r13d
 1406570:	31 db                	xor    ebx,ebx
 1406572:	41 8b 7c 9f 20       	mov    edi,DWORD PTR [r15+rbx*4+0x20]
 1406577:	e8 b4 13 00 00       	call   1407930 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ceb4>
 140657c:	85 c0                	test   eax,eax
--
 1406580:	89 c5                	mov    ebp,eax
 1406582:	48 63 f8             	movsxd rdi,eax
 1406585:	6a 08                	push   0x8
 1406587:	5e                   	pop    rsi
 1406588:	e8 33 86 3e 00       	call   17eebc0 <calloc@plt>
 140658d:	49 89 04 dc          	mov    QWORD PTR [r12+rbx*8],rax
 1406591:	85 ed                	test   ebp,ebp
 1406593:	b8 00 00 00 00       	mov    eax,0x0
 1406598:	0f 4f c5             	cmovg  eax,ebp
 140659b:	85 c0                	test   eax,eax
 140659d:	74 3a                	je     14065d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bb5d>
 140659f:	31 c9                	xor    ecx,ecx
 14065a1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 14065a6:	41 8b 54 9f 20       	mov    edx,DWORD PTR [r15+rbx*4+0x20]
 14065ab:	0f a3 ca             	bt     edx,ecx
 14065ae:	73 21                	jae    14065d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bb55>
 14065b0:	49 63 d5             	movsxd rdx,r13d
 14065b3:	41 ff c5             	inc    r13d
 14065b6:	49 63 94 97 20 01 00 	movsxd rdx,DWORD PTR [r15+rdx*4+0x120]
 14065bd:	00 
 14065be:	48 6b d2 60          	imul   rdx,rdx,0x60
 14065c2:	48 03 97 28 13 00 00 	add    rdx,QWORD PTR [rdi+0x1328]
 14065c9:	49 8b 34 dc          	mov    rsi,QWORD PTR [r12+rbx*8]
 14065cd:	48 89 14 ce          	mov    QWORD PTR [rsi+rcx*8],rdx
 14065d1:	48 ff c1             	inc    rcx
 14065d4:	48 39 c8             	cmp    rax,rcx
 14065d7:	75 cd                	jne    14065a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bb2a>
 14065d9:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 14065dd:	39 c5                	cmp    ebp,eax
 14065df:	0f 4f c5             	cmovg  eax,ebp
 14065e2:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 14065e6:	48 ff c3             	inc    rbx
 14065e9:	48 3b 5c 24 20       	cmp    rbx,QWORD PTR [rsp+0x20]
 14065ee:	75 82                	jne    1406572 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24baf6>
 14065f0:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
 14065f5:	c7 43 28 01 00 00 00 	mov    DWORD PTR [rbx+0x28],0x1
 14065fc:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
--
 14067a8:	8b 47 48             	mov    eax,DWORD PTR [rdi+0x48]
 14067ab:	d1 f8                	sar    eax,1
 14067ad:	48 8b 4e 08          	mov    rcx,QWORD PTR [rsi+0x8]
 14067b1:	48 98                	cdqe
 14067b3:	48 39 c1             	cmp    rcx,rax
 14067b6:	48 0f 4c c1          	cmovl  rax,rcx
 14067ba:	48 89 95 68 ff ff ff 	mov    QWORD PTR [rbp-0x98],rdx
 14067c1:	2b 06                	sub    eax,DWORD PTR [rsi]
 14067c3:	85 c0                	test   eax,eax
 14067c5:	0f 8e 22 02 00 00    	jle    14069ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bf71>
 14067cb:	49 89 f8             	mov    r8,rdi
 14067ce:	48 8b 4d c8          	mov    rcx,QWORD PTR [rbp-0x38]
 14067d2:	48 8b 49 18          	mov    rcx,QWORD PTR [rcx+0x18]
 14067d6:	48 89 75 a8          	mov    QWORD PTR [rbp-0x58],rsi
 14067da:	48 63 76 10          	movsxd rsi,DWORD PTR [rsi+0x10]
 14067de:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
 14067e1:	99                   	cdq
 14067e2:	48 89 75 88          	mov    QWORD PTR [rbp-0x78],rsi
 14067e6:	f7 fe                	idiv   esi
 14067e8:	48 89 45 a0          	mov    QWORD PTR [rbp-0x60],rax
 14067ec:	01 c8                	add    eax,ecx
 14067ee:	ff c8                	dec    eax
 14067f0:	99                   	cdq
 14067f1:	48 89 4d b8          	mov    QWORD PTR [rbp-0x48],rcx
 14067f5:	f7 f9                	idiv   ecx
 14067f7:	4c 63 75 c4          	movsxd r14,DWORD PTR [rbp-0x3c]
 14067fb:	49 89 e7             	mov    r15,rsp
 14067fe:	4a 8d 0c f5 0f 00 00 	lea    rcx,[r14*8+0xf]
 1406805:	00 
 1406806:	48 83 e1 f0          	and    rcx,0xfffffffffffffff0
 140680a:	49 29 cf             	sub    r15,rcx
 140680d:	4c 89 fc             	mov    rsp,r15
 1406810:	31 c9                	xor    ecx,ecx
 1406812:	4d 85 f6             	test   r14,r14
 1406815:	49 0f 4f ce          	cmovg  rcx,r14
 1406819:	48 89 8d 78 ff ff ff 	mov    QWORD PTR [rbp-0x88],rcx
 1406820:	45 85 f6             	test   r14d,r14d
--
 1406954:	49 ff c5             	inc    r13
 1406957:	48 8b 45 90          	mov    rax,QWORD PTR [rbp-0x70]
 140695b:	48 ff c0             	inc    rax
 140695e:	4c 3b 6d 98          	cmp    r13,QWORD PTR [rbp-0x68]
 1406962:	7d 66                	jge    14069ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bf4e>
 1406964:	48 3b 45 b0          	cmp    rax,QWORD PTR [rbp-0x50]
 1406968:	0f 8c 52 ff ff ff    	jl     14068c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24be44>
 140696e:	eb 5a                	jmp    14069ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bf4e>
 1406970:	31 db                	xor    ebx,ebx
 1406972:	48 39 9d 78 ff ff ff 	cmp    QWORD PTR [rbp-0x88],rbx
 1406979:	0f 84 26 ff ff ff    	je     14068a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24be29>
 140697f:	48 8b 45 c8          	mov    rax,QWORD PTR [rbp-0x38]
 1406983:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
 1406987:	4c 89 c6             	mov    rsi,r8
 140698a:	e8 92 cd ff ff       	call   1403721 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248ca5>
 140698f:	44 8b 4d c0          	mov    r9d,DWORD PTR [rbp-0x40]
 1406993:	48 8b 75 b8          	mov    rsi,QWORD PTR [rbp-0x48]
 1406997:	48 8b 55 a8          	mov    rdx,QWORD PTR [rbp-0x58]
 140699b:	4c 8b 45 80          	mov    r8,QWORD PTR [rbp-0x80]
 140699f:	83 f8 ff             	cmp    eax,0xffffffff
 14069a2:	74 49                	je     14069ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bf71>
 14069a4:	39 42 18             	cmp    DWORD PTR [rdx+0x18],eax
 14069a7:	7e 44                	jle    14069ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bf71>
 14069a9:	48 8b 4d c8          	mov    rcx,QWORD PTR [rbp-0x38]
 14069ad:	48 8b 49 30          	mov    rcx,QWORD PTR [rcx+0x30]
 14069b1:	48 8b 04 c1          	mov    rax,QWORD PTR [rcx+rax*8]
 14069b5:	49 8b 0c df          	mov    rcx,QWORD PTR [r15+rbx*8]
 14069b9:	4a 89 04 e1          	mov    QWORD PTR [rcx+r12*8],rax
 14069bd:	48 ff c3             	inc    rbx
 14069c0:	48 85 c0             	test   rax,rax
 14069c3:	75 ad                	jne    1406972 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bef6>
 14069c5:	eb 26                	jmp    14069ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bf71>
 14069c7:	4c 89 e8             	mov    rax,r13
 14069ca:	49 ff c4             	inc    r12
 14069cd:	48 3b 45 b0          	cmp    rax,QWORD PTR [rbp-0x50]
 14069d1:	0f 8c c2 fe ff ff    	jl     1406899 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24be1d>
 14069d7:	48 8b 45 c8          	mov    rax,QWORD PTR [rbp-0x38]
 14069db:	8b 40 0c             	mov    eax,DWORD PTR [rax+0xc]
 14069de:	48 ff c6             	inc    rsi
 14069e1:	48 63 c8             	movsxd rcx,eax
 14069e4:	48 39 ce             	cmp    rsi,rcx
 14069e7:	0f 8c 8c fe ff ff    	jl     1406879 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bdfd>
 14069ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14069f4:	00 00 
 14069f6:	48 3b 45 d0          	cmp    rax,QWORD PTR [rbp-0x30]
 14069fa:	75 0f                	jne    1406a0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bf8f>
--
 1406a68:	4d 89 c7             	mov    r15,r8
 1406a6b:	89 cb                	mov    ebx,ecx
 1406a6d:	48 89 94 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdx
 1406a74:	00 
 1406a75:	49 89 f4             	mov    r12,rsi
 1406a78:	48 89 bc 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rdi
 1406a7f:	00 
 1406a80:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1406a87:	00 00 
 1406a89:	48 89 84 24 60 09 00 	mov    QWORD PTR [rsp+0x960],rax
 1406a90:	00 
 1406a91:	4c 8b 2e             	mov    r13,QWORD PTR [rsi]
 1406a94:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
 1406a98:	4d 63 75 10          	movsxd r14,DWORD PTR [r13+0x10]
 1406a9c:	49 63 4d 14          	movsxd rcx,DWORD PTR [r13+0x14]
 1406aa0:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
 1406aa7:	00 
 1406aa8:	48 63 00             	movsxd rax,DWORD PTR [rax]
 1406aab:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 1406ab0:	41 8b 45 08          	mov    eax,DWORD PTR [r13+0x8]
 1406ab4:	41 2b 45 00          	sub    eax,DWORD PTR [r13+0x0]
 1406ab8:	99                   	cdq
 1406ab9:	41 f7 fe             	idiv   r14d
 1406abc:	89 c5                	mov    ebp,eax
 1406abe:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
 1406ac5:	00 
 1406ac6:	ba 00 04 00 00       	mov    edx,0x400
 1406acb:	31 f6                	xor    esi,esi
 1406acd:	e8 be 80 3e 00       	call   17eeb90 <memset@plt>
 1406ad2:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 1406ad9:	00 
 1406ada:	ba 00 04 00 00       	mov    edx,0x400
 1406adf:	31 f6                	xor    esi,esi
 1406ae1:	e8 aa 80 3e 00       	call   17eeb90 <memset@plt>
 1406ae6:	85 db                	test   ebx,ebx
 1406ae8:	b9 00 00 00 00       	mov    ecx,0x0
 1406aed:	89 5c 24 2c          	mov    DWORD PTR [rsp+0x2c],ebx
--
 1406ba7:	7c 29                	jl     1406bd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c156>
 1406ba9:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 1406bae:	48 8b 94 24 98 00 00 	mov    rdx,QWORD PTR [rsp+0x98]
 1406bb5:	00 
 1406bb6:	48 0f af b4 24 e0 00 	imul   rsi,QWORD PTR [rsp+0xe0]
 1406bbd:	00 00 
 1406bbf:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 1406bc4:	7d 04                	jge    1406bca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c14e>
 1406bc6:	48 03 34 c8          	add    rsi,QWORD PTR [rax+rcx*8]
 1406bca:	48 ff c1             	inc    rcx
 1406bcd:	48 ff ca             	dec    rdx
 1406bd0:	75 e4                	jne    1406bb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c13a>
 1406bd2:	49 8b 7c 24 18       	mov    rdi,QWORD PTR [r12+0x18]
 1406bd7:	48 3b 77 08          	cmp    rsi,QWORD PTR [rdi+0x8]
 1406bdb:	7d 14                	jge    1406bf1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c175>
 1406bdd:	48 8b 94 24 88 00 00 	mov    rdx,QWORD PTR [rsp+0x88]
 1406be4:	00 
 1406be5:	e8 ed ca ff ff       	call   14036d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248c5b>
 1406bea:	89 c0                	mov    eax,eax
 1406bec:	49 01 44 24 40       	add    QWORD PTR [r12+0x40],rax
 1406bf1:	49 ff c6             	inc    r14
 1406bf4:	49 39 ee             	cmp    r14,rbp
 1406bf7:	48 89 da             	mov    rdx,rbx
 1406bfa:	75 9a                	jne    1406b96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c11a>
 1406bfc:	48 83 7c 24 30 00    	cmp    QWORD PTR [rsp+0x30],0x0
 1406c02:	0f 8e e8 04 00 00    	jle    14070f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c674>
 1406c08:	48 3b 54 24 10       	cmp    rdx,QWORD PTR [rsp+0x10]
 1406c0d:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 1406c12:	0f 8d d8 04 00 00    	jge    14070f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c674>
 1406c18:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
 1406c1d:	48 0f af ca          	imul   rcx,rdx
 1406c21:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
 1406c26:	48 83 c1 fc          	add    rcx,0xfffffffffffffffc
 1406c2a:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
 1406c2f:	31 c9                	xor    ecx,ecx
 1406c31:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
 1406c36:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
--
 1406d65:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 1406d68:	8b 6b 54             	mov    ebp,DWORD PTR [rbx+0x54]
 1406d6b:	44 8b 6b 58          	mov    r13d,DWORD PTR [rbx+0x58]
 1406d6f:	44 8b 73 50          	mov    r14d,DWORD PTR [rbx+0x50]
 1406d73:	45 89 f7             	mov    r15d,r14d
 1406d76:	41 d1 ff             	sar    r15d,1
 1406d79:	0f 57 c0             	xorps  xmm0,xmm0
 1406d7c:	0f 29 84 24 50 09 00 	movaps XMMWORD PTR [rsp+0x950],xmm0
 1406d83:	00 
 1406d84:	0f 29 84 24 40 09 00 	movaps XMMWORD PTR [rsp+0x940],xmm0
 1406d8b:	00 
 1406d8c:	41 83 fd 01          	cmp    r13d,0x1
 1406d90:	48 89 74 24 18       	mov    QWORD PTR [rsp+0x18],rsi
 1406d95:	48 89 94 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rdx
 1406d9c:	00 
 1406d9d:	48 89 8c 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rcx
 1406da4:	00 
 1406da5:	0f 85 b4 00 00 00    	jne    1406e5f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c3e3>
 1406dab:	85 f6                	test   esi,esi
 1406dad:	0f 8e 1a 01 00 00    	jle    1406ecd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c451>
 1406db3:	48 89 c8             	mov    rax,rcx
 1406db6:	48 0f af 84 24 e8 00 	imul   rax,QWORD PTR [rsp+0xe8]
 1406dbd:	00 00 
 1406dbf:	48 03 84 24 f0 00 00 	add    rax,QWORD PTR [rsp+0xf0]
 1406dc6:	00 
 1406dc7:	41 8d 5e ff          	lea    ebx,[r14-0x1]
 1406dcb:	48 63 fe             	movsxd rdi,esi
 1406dce:	48 89 bc 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rdi
 1406dd5:	00 
 1406dd6:	48 b9 fc ff ff ff 03 	movabs rcx,0x3fffffffc
 1406ddd:	00 00 00 
 1406de0:	48 8d 14 b1          	lea    rdx,[rcx+rsi*4]
 1406de4:	48 21 ca             	and    rdx,rcx
 1406de7:	48 8d 34 bd 00 00 00 	lea    rsi,[rdi*4+0x0]
 1406dee:	00 
 1406def:	48 29 d6             	sub    rsi,rdx
 1406df2:	48 8d 8c 24 3c 09 00 	lea    rcx,[rsp+0x93c]
 1406df9:	00 
 1406dfa:	48 8d 3c 31          	lea    rdi,[rcx+rsi*1]
 1406dfe:	48 01 c6             	add    rsi,rax
 1406e01:	48 83 c2 04          	add    rdx,0x4
 1406e05:	e8 c6 8c 3e 00       	call   17efad0 <memcpy@plt>
 1406e0a:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 1406e0f:	48 8b 8c 24 f8 00 00 	mov    rcx,QWORD PTR [rsp+0xf8]
 1406e16:	00 
 1406e17:	48 8d 04 88          	lea    rax,[rax+rcx*4]
 1406e1b:	31 f6                	xor    esi,esi
 1406e1d:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 1406e22:	8b 38                	mov    edi,DWORD PTR [rax]
 1406e24:	29 ef                	sub    edi,ebp
 1406e26:	89 fa                	mov    edx,edi
 1406e28:	44 29 fa             	sub    edx,r15d
 1406e2b:	7d 0e                	jge    1406e3b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c3bf>
 1406e2d:	44 89 fa             	mov    edx,r15d
 1406e30:	29 fa                	sub    edx,edi
 1406e32:	8d 14 55 ff ff ff ff 	lea    edx,[rdx*2-0x1]
 1406e39:	eb 02                	jmp    1406e3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c3c1>
 1406e3b:	01 d2                	add    edx,edx
 1406e3d:	41 0f af f6          	imul   esi,r14d
 1406e41:	44 39 f2             	cmp    edx,r14d
 1406e44:	89 df                	mov    edi,ebx
 1406e46:	0f 4c fa             	cmovl  edi,edx
 1406e49:	85 d2                	test   edx,edx
 1406e4b:	ba 00 00 00 00       	mov    edx,0x0
 1406e50:	0f 48 fa             	cmovs  edi,edx
 1406e53:	01 fe                	add    esi,edi
 1406e55:	48 83 c0 fc          	add    rax,0xfffffffffffffffc
 1406e59:	ff c9                	dec    ecx
 1406e5b:	75 c5                	jne    1406e22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c3a6>
 1406e5d:	eb 70                	jmp    1406ecf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c453>
 1406e5f:	85 f6                	test   esi,esi
 1406e61:	7e 6a                	jle    1406ecd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c451>
--
 1406eb2:	44 01 d6             	add    esi,r10d
 1406eb5:	41 0f af c5          	imul   eax,r13d
 1406eb9:	01 e8                	add    eax,ebp
 1406ebb:	42 89 84 84 3c 09 00 	mov    DWORD PTR [rsp+r8*4+0x93c],eax
 1406ec2:	00 
 1406ec3:	49 ff c8             	dec    r8
 1406ec6:	45 85 c0             	test   r8d,r8d
 1406ec9:	75 a8                	jne    1406e73 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c3f7>
 1406ecb:	eb 02                	jmp    1406ecf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c453>
 1406ecd:	31 f6                	xor    esi,esi
 1406ecf:	48 8b 9c 24 90 00 00 	mov    rbx,QWORD PTR [rsp+0x90]
 1406ed6:	00 
 1406ed7:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
 1406edb:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
 1406edf:	48 63 ce             	movsxd rcx,esi
 1406ee2:	80 3c 08 00          	cmp    BYTE PTR [rax+rcx*1],0x0
 1406ee6:	74 0a                	je     1406ef2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c476>
 1406ee8:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
 1406eed:	e9 fe 00 00 00       	jmp    1406ff0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c574>
 1406ef2:	0f 57 c0             	xorps  xmm0,xmm0
 1406ef5:	0f 29 84 24 30 09 00 	movaps XMMWORD PTR [rsp+0x930],xmm0
 1406efc:	00 
 1406efd:	0f 29 84 24 20 09 00 	movaps XMMWORD PTR [rsp+0x920],xmm0
 1406f04:	00 
 1406f05:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 1406f09:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 1406f0e:	85 ff                	test   edi,edi
 1406f10:	ba 00 00 00 00       	mov    edx,0x0
 1406f15:	0f 4f d7             	cmovg  edx,edi
 1406f18:	48 85 c9             	test   rcx,rcx
 1406f1b:	0f 8e c2 00 00 00    	jle    1406fe3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c567>
 1406f21:	41 ff ce             	dec    r14d
 1406f24:	45 0f af f5          	imul   r14d,r13d
 1406f28:	41 01 ee             	add    r14d,ebp
 1406f2b:	6a ff                	push   0xffffffffffffffff
 1406f2d:	41 58                	pop    r8
 1406f2f:	31 ff                	xor    edi,edi
 1406f31:	4c 8d bc 24 20 09 00 	lea    r15,[rsp+0x920]
 1406f38:	00 
 1406f39:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
 1406f3e:	80 3c 38 00          	cmp    BYTE PTR [rax+rdi*1],0x0
 1406f42:	74 55                	je     1406f99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c51d>
 1406f44:	45 31 c9             	xor    r9d,r9d
 1406f47:	85 ed                	test   ebp,ebp
 1406f49:	7e 1e                	jle    1406f69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c4ed>
 1406f4b:	45 31 d2             	xor    r10d,r10d
 1406f4e:	46 8b 9c 94 20 09 00 	mov    r11d,DWORD PTR [rsp+r10*4+0x920]
 1406f55:	00 
 1406f56:	47 2b 1c 94          	sub    r11d,DWORD PTR [r12+r10*4]
 1406f5a:	45 0f af db          	imul   r11d,r11d
 1406f5e:	45 01 d9             	add    r9d,r11d
 1406f61:	49 ff c2             	inc    r10
 1406f64:	4c 39 d2             	cmp    rdx,r10
 1406f67:	75 e5                	jne    1406f4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c4d2>
 1406f69:	41 83 f8 ff          	cmp    r8d,0xffffffff
 1406f6d:	74 05                	je     1406f74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c4f8>
 1406f6f:	45 39 c1             	cmp    r9d,r8d
 1406f72:	7d 25                	jge    1406f99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c51d>
 1406f74:	0f 28 84 24 20 09 00 	movaps xmm0,XMMWORD PTR [rsp+0x920]
 1406f7b:	00 
 1406f7c:	0f 28 8c 24 30 09 00 	movaps xmm1,XMMWORD PTR [rsp+0x930]
 1406f83:	00 
 1406f84:	0f 29 8c 24 50 09 00 	movaps XMMWORD PTR [rsp+0x950],xmm1
 1406f8b:	00 
--
 1406fbb:	7d ef                	jge    1406fac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c530>
 1406fbd:	45 85 d2             	test   r10d,r10d
 1406fc0:	45 89 eb             	mov    r11d,r13d
 1406fc3:	bb 00 00 00 00       	mov    ebx,0x0
 1406fc8:	44 0f 48 db          	cmovs  r11d,ebx
 1406fcc:	45 01 d3             	add    r11d,r10d
 1406fcf:	41 f7 db             	neg    r11d
 1406fd2:	45 89 19             	mov    DWORD PTR [r9],r11d
 1406fd5:	48 ff c7             	inc    rdi
 1406fd8:	48 39 f9             	cmp    rcx,rdi
 1406fdb:	0f 85 5d ff ff ff    	jne    1406f3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c4c2>
 1406fe1:	eb 05                	jmp    1406fe8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c56c>
 1406fe3:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
 1406fe8:	48 8b 9c 24 90 00 00 	mov    rbx,QWORD PTR [rsp+0x90]
 1406fef:	00 
 1406ff0:	85 f6                	test   esi,esi
 1406ff2:	78 21                	js     1407015 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c599>
 1406ff4:	b8 00 00 00 00       	mov    eax,0x0
 1406ff9:	85 ed                	test   ebp,ebp
 1406ffb:	0f 4f c5             	cmovg  eax,ebp
 1406ffe:	7e 15                	jle    1407015 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c599>
 1407000:	31 c9                	xor    ecx,ecx
 1407002:	8b 94 8c 40 09 00 00 	mov    edx,DWORD PTR [rsp+rcx*4+0x940]
 1407009:	41 29 14 8c          	sub    DWORD PTR [r12+rcx*4],edx
 140700d:	48 ff c1             	inc    rcx
 1407010:	48 39 c8             	cmp    rax,rcx
 1407013:	75 ed                	jne    1407002 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c586>
 1407015:	48 89 df             	mov    rdi,rbx
 1407018:	48 8b 94 24 88 00 00 	mov    rdx,QWORD PTR [rsp+0x88]
 140701f:	00 
 1407020:	e8 b2 c6 ff ff       	call   14036d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248c5b>
 1407025:	48 8b 94 24 18 01 00 	mov    rdx,QWORD PTR [rsp+0x118]
 140702c:	00 
 140702d:	01 c2                	add    edx,eax
 140702f:	48 8b 8c 24 10 01 00 	mov    rcx,QWORD PTR [rsp+0x110]
 1407036:	00 
 1407037:	48 ff c1             	inc    rcx
--
 14071a5:	99                   	cdq
 14071a6:	f7 fd                	idiv   ebp
 14071a8:	41 89 c7             	mov    r15d,eax
 14071ab:	49 89 fc             	mov    r12,rdi
 14071ae:	48 63 db             	movsxd rbx,ebx
 14071b1:	48 8d 34 dd 00 00 00 	lea    rsi,[rbx*8+0x0]
 14071b8:	00 
 14071b9:	e8 83 a7 ff ff       	call   1401941 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246ec5>
 14071be:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
 14071c3:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 14071c8:	44 89 7c 24 10       	mov    DWORD PTR [rsp+0x10],r15d
 14071cd:	49 63 c7             	movsxd rax,r15d
 14071d0:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 14071d5:	45 31 ff             	xor    r15d,r15d
 14071d8:	48 85 db             	test   rbx,rbx
 14071db:	b8 00 00 00 00       	mov    eax,0x0
 14071e0:	48 0f 4f c3          	cmovg  rax,rbx
 14071e4:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 14071e9:	48 85 c0             	test   rax,rax
 14071ec:	74 48                	je     1407236 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c7ba>
 14071ee:	4c 89 e3             	mov    rbx,r12
 14071f1:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 14071f6:	48 8d 04 c5 00 00 00 	lea    rax,[rax*8+0x0]
 14071fd:	00 
 14071fe:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1407203:	45 31 e4             	xor    r12d,r12d
 1407206:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
 140720b:	48 89 df             	mov    rdi,rbx
 140720e:	4c 89 ee             	mov    rsi,r13
 1407211:	e8 2b a7 ff ff       	call   1401941 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246ec5>
 1407216:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 140721b:	4a 89 04 e1          	mov    QWORD PTR [rcx+r12*8],rax
 140721f:	48 89 c7             	mov    rdi,rax
 1407222:	31 f6                	xor    esi,esi
 1407224:	4c 89 ea             	mov    rdx,r13
 1407227:	e8 64 79 3e 00       	call   17eeb90 <memset@plt>
 140722c:	49 ff c4             	inc    r12
 140722f:	4c 39 64 24 30       	cmp    QWORD PTR [rsp+0x30],r12
 1407234:	75 d5                	jne    140720b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c78f>
 1407236:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
 140723b:	8b 44 24 14          	mov    eax,DWORD PTR [rsp+0x14]
 140723f:	ff c8                	dec    eax
 1407241:	85 c0                	test   eax,eax
 1407243:	44 0f 4f f8          	cmovg  r15d,eax
 1407247:	83 7c 24 10 00       	cmp    DWORD PTR [rsp+0x10],0x0
 140724c:	0f 8e fa 00 00 00    	jle    140734c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c8d0>
--
 1407314:	4d 39 d7             	cmp    r15,r10
 1407317:	75 dc                	jne    14072f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c879>
 1407319:	4d 89 fa             	mov    r10,r15
 140731c:	48 8b 04 fb          	mov    rax,QWORD PTR [rbx+rdi*8]
 1407320:	4c 89 14 d0          	mov    QWORD PTR [rax+rdx*8],r10
 1407324:	48 ff c7             	inc    rdi
 1407327:	48 3b 7c 24 30       	cmp    rdi,QWORD PTR [rsp+0x30]
 140732c:	0f 85 68 ff ff ff    	jne    140729a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c81e>
 1407332:	48 ff c2             	inc    rdx
 1407335:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 140733a:	01 e8                	add    eax,ebp
 140733c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1407341:	48 3b 54 24 18       	cmp    rdx,QWORD PTR [rsp+0x18]
 1407346:	0f 85 32 ff ff ff    	jne    140727e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c802>
 140734c:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 1407351:	48 ff 40 48          	inc    QWORD PTR [rax+0x48]
 1407355:	eb 02                	jmp    1407359 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c8dd>
 1407357:	31 db                	xor    ebx,ebx
 1407359:	48 89 d8             	mov    rax,rbx
 140735c:	48 83 c4 48          	add    rsp,0x48
 1407360:	5b                   	pop    rbx
 1407361:	41 5c                	pop    r12
 1407363:	41 5d                	pop    r13
 1407365:	41 5e                	pop    r14
 1407367:	41 5f                	pop    r15
 1407369:	5d                   	pop    rbp
 140736a:	c3                   	ret
 140736b:	48 89 c8             	mov    rax,rcx
 140736e:	31 c9                	xor    ecx,ecx
 1407370:	45 85 c0             	test   r8d,r8d
 1407373:	44 0f 4e c1          	cmovle r8d,ecx
 1407377:	7e 34                	jle    14073ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c931>
 1407379:	45 31 c9             	xor    r9d,r9d
 140737c:	42 83 3c 88 00       	cmp    DWORD PTR [rax+r9*4],0x0
 1407381:	74 0d                	je     1407390 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24c914>
 1407383:	4e 8b 14 ca          	mov    r10,QWORD PTR [rdx+r9*8]
 1407387:	4c 63 d9             	movsxd r11,ecx
--
 14073f7:	48 89 74 24 20       	mov    QWORD PTR [rsp+0x20],rsi
 14073fc:	4c 8b 2e             	mov    r13,QWORD PTR [rsi]
 14073ff:	49 63 6d 10          	movsxd rbp,DWORD PTR [r13+0x10]
 1407403:	41 8b 45 08          	mov    eax,DWORD PTR [r13+0x8]
 1407407:	41 8b 4d 14          	mov    ecx,DWORD PTR [r13+0x14]
 140740b:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx
 140740f:	41 2b 45 00          	sub    eax,DWORD PTR [r13+0x0]
 1407413:	99                   	cdq
 1407414:	f7 fd                	idiv   ebp
 1407416:	89 44 24 08          	mov    DWORD PTR [rsp+0x8],eax
 140741a:	6a 08                	push   0x8
 140741c:	5e                   	pop    rsi
 140741d:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
 1407422:	e8 1a a5 ff ff       	call   1401941 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246ec5>
 1407427:	49 89 c4             	mov    r12,rax
 140742a:	48 63 44 24 08       	movsxd rax,DWORD PTR [rsp+0x8]
 140742f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 1407434:	48 8d 34 c5 00 00 00 	lea    rsi,[rax*8+0x0]
 140743b:	00 
 140743c:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi
 1407441:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 1407446:	e8 f6 a4 ff ff       	call   1401941 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246ec5>
 140744b:	49 89 04 24          	mov    QWORD PTR [r12],rax
 140744f:	48 89 c7             	mov    rdi,rax
 1407452:	31 f6                	xor    esi,esi
 1407454:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
 1407459:	e8 32 77 3e 00       	call   17eeb90 <memset@plt>
 140745e:	8b 44 24 04          	mov    eax,DWORD PTR [rsp+0x4]
 1407462:	ff c8                	dec    eax
 1407464:	85 c0                	test   eax,eax
 1407466:	89 44 24 04          	mov    DWORD PTR [rsp+0x4],eax
 140746a:	44 0f 4f f0          	cmovg  r14d,eax
 140746e:	83 7c 24 10 00       	cmp    DWORD PTR [rsp+0x10],0x0
 1407473:	0f 8e b6 00 00 00    	jle    140752f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cab3>
 1407479:	89 d9                	mov    ecx,ebx
 140747b:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 140747f:	48 99                	cqo
 1407481:	48 f7 f9             	idiv   rcx
 1407484:	31 f6                	xor    esi,esi
 1407486:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi
 140748b:	85 ed                	test   ebp,ebp
 140748d:	7e 54                	jle    14074e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ca67>
 140748f:	4d 8b 07             	mov    r8,QWORD PTR [r15]
 1407492:	31 ff                	xor    edi,edi
 1407494:	45 31 d2             	xor    r10d,r10d
--
 140757f:	6a 02                	push   0x2
 1407581:	5e                   	pop    rsi
 1407582:	89 e8                	mov    eax,ebp
 1407584:	99                   	cdq
 1407585:	f7 fe                	idiv   esi
 1407587:	4c 63 e8             	movsxd r13,eax
 140758a:	49 63 d9             	movsxd rbx,r9d
 140758d:	48 89 de             	mov    rsi,rbx
 1407590:	49 0f af f5          	imul   rsi,r13
 1407594:	48 c1 e6 02          	shl    rsi,0x2
 1407598:	48 89 cf             	mov    rdi,rcx
 140759b:	e8 a1 a3 ff ff       	call   1401941 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246ec5>
 14075a0:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 14075a5:	85 db                	test   ebx,ebx
 14075a7:	7e 76                	jle    140761f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cba3>
 14075a9:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
 14075ae:	4d 89 f0             	mov    r8,r14
 14075b1:	48 8d 14 9d 00 00 00 	lea    rdx,[rbx*4+0x0]
 14075b8:	00 
 14075b9:	31 c9                	xor    ecx,ecx
 14075bb:	31 f6                	xor    esi,esi
 14075bd:	31 ff                	xor    edi,edi
 14075bf:	41 83 3c b7 00       	cmp    DWORD PTR [r15+rsi*4],0x0
 14075c4:	41 0f 95 c1          	setne  r9b
 14075c8:	83 fd 02             	cmp    ebp,0x2
 14075cb:	7c 21                	jl     14075ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cb72>
 14075cd:	4c 8b 54 24 10       	mov    r10,QWORD PTR [rsp+0x10]
 14075d2:	4d 8b 14 f2          	mov    r10,QWORD PTR [r10+rsi*8]
 14075d6:	49 89 c3             	mov    r11,rax
 14075d9:	45 31 f6             	xor    r14d,r14d
 14075dc:	47 8b 24 b2          	mov    r12d,DWORD PTR [r10+r14*4]
 14075e0:	45 89 23             	mov    DWORD PTR [r11],r12d
 14075e3:	49 ff c6             	inc    r14
 14075e6:	49 01 d3             	add    r11,rdx
 14075e9:	4d 39 f5             	cmp    r13,r14
 14075ec:	75 ee                	jne    14075dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cb60>
 14075ee:	44 88 cf             	mov    dil,r9b
 14075f1:	48 01 f9             	add    rcx,rdi
 14075f4:	48 ff c6             	inc    rsi
 14075f7:	48 83 c0 04          	add    rax,0x4
 14075fb:	48 39 de             	cmp    rsi,rbx
 14075fe:	75 bd                	jne    14075bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cb41>
 1407600:	48 85 c9             	test   rcx,rcx
 1407603:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1407608:	74 15                	je     140761f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cba3>
 140760a:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
 140760f:	6a 01                	push   0x1
 1407611:	59                   	pop    rcx
 1407612:	4c 89 c6             	mov    rsi,r8
 1407615:	4c 8b 44 24 60       	mov    r8,QWORD PTR [rsp+0x60]
 140761a:	e8 38 f4 ff ff       	call   1406a57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24bfdb>
 140761f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1407626:	00 00 
 1407628:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 140762d:	75 11                	jne    1407640 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cbc4>
 140762f:	31 c0                	xor    eax,eax
 1407631:	48 83 c4 28          	add    rsp,0x28
 1407635:	5b                   	pop    rbx
 1407636:	41 5c                	pop    r12
 1407638:	41 5d                	pop    r13
 140763a:	41 5e                	pop    r14
 140763c:	41 5f                	pop    r15
 140763e:	5d                   	pop    rbp
 140763f:	c3                   	ret
 1407640:	e8 6b 84 3e 00       	call   17efab0 <__stack_chk_fail@plt>
 1407645:	55                   	push   rbp
 1407646:	41 57                	push   r15
 1407648:	41 56                	push   r14
 140764a:	41 55                	push   r13
 140764c:	41 54                	push   r12
--
 140764f:	48 83 ec 78          	sub    rsp,0x78
 1407653:	49 89 ce             	mov    r14,rcx
 1407656:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi
 140765b:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
 140765e:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
 1407663:	8b 47 48             	mov    eax,DWORD PTR [rdi+0x48]
 1407666:	41 0f af c0          	imul   eax,r8d
 140766a:	d1 f8                	sar    eax,1
 140766c:	48 8b 4e 08          	mov    rcx,QWORD PTR [rsi+0x8]
 1407670:	48 98                	cdqe
 1407672:	48 39 c1             	cmp    rcx,rax
 1407675:	48 0f 4c c1          	cmovl  rax,rcx
 1407679:	48 89 74 24 18       	mov    QWORD PTR [rsp+0x18],rsi
 140767e:	2b 06                	sub    eax,DWORD PTR [rsi]
 1407680:	85 c0                	test   eax,eax
 1407682:	0f 8e 97 02 00 00    	jle    140791f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cea3>
 1407688:	44 89 c3             	mov    ebx,r8d
 140768b:	48 89 54 24 70       	mov    QWORD PTR [rsp+0x70],rdx
 1407690:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 1407695:	48 8b 49 18          	mov    rcx,QWORD PTR [rcx+0x18]
 1407699:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
 140769e:	48 63 72 10          	movsxd rsi,DWORD PTR [rdx+0x10]
 14076a2:	4c 8b 39             	mov    r15,QWORD PTR [rcx]
 14076a5:	99                   	cdq
 14076a6:	48 89 74 24 68       	mov    QWORD PTR [rsp+0x68],rsi
 14076ab:	f7 fe                	idiv   esi
 14076ad:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 14076b2:	44 01 f8             	add    eax,r15d
 14076b5:	ff c8                	dec    eax
 14076b7:	99                   	cdq
 14076b8:	41 f7 ff             	idiv   r15d
 14076bb:	48 63 f0             	movsxd rsi,eax
 14076be:	48 c1 e6 03          	shl    rsi,0x3
 14076c2:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 14076c7:	e8 75 a2 ff ff       	call   1401941 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246ec5>
 14076cc:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 14076d1:	48 63 d3             	movsxd rdx,ebx
 14076d4:	31 c0                	xor    eax,eax
 14076d6:	48 85 d2             	test   rdx,rdx
 14076d9:	48 0f 4f c2          	cmovg  rax,rdx
 14076dd:	85 db                	test   ebx,ebx
 14076df:	7e 16                	jle    14076f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cc7b>
 14076e1:	31 c9                	xor    ecx,ecx
 14076e3:	41 83 3c 8e 00       	cmp    DWORD PTR [r14+rcx*4],0x0
 14076e8:	75 0a                	jne    14076f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cc78>
--
 1407737:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 140773c:	d3 e2                	shl    edx,cl
 140773e:	89 54 24 3c          	mov    DWORD PTR [rsp+0x3c],edx
 1407742:	83 7c 24 40 00       	cmp    DWORD PTR [rsp+0x40],0x0
 1407747:	0f 8e bb 01 00 00    	jle    1407908 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ce8c>
 140774d:	31 c0                	xor    eax,eax
 140774f:	31 d2                	xor    edx,edx
 1407751:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
 1407756:	49 89 c6             	mov    r14,rax
 1407759:	48 85 c9             	test   rcx,rcx
 140775c:	75 4e                	jne    14077ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cd30>
 140775e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1407763:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
 1407767:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
 140776c:	e8 b0 bf ff ff       	call   1403721 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248ca5>
 1407771:	83 f8 ff             	cmp    eax,0xffffffff
 1407774:	0f 84 a5 01 00 00    	je     140791f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cea3>
 140777a:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 140777f:	39 41 18             	cmp    DWORD PTR [rcx+0x18],eax
 1407782:	0f 8e 97 01 00 00    	jle    140791f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cea3>
 1407788:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 140778d:	48 8b 49 30          	mov    rcx,QWORD PTR [rcx+0x30]
 1407791:	48 8b 04 c1          	mov    rax,QWORD PTR [rcx+rax*8]
 1407795:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
 140779a:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
 140779f:	48 89 04 d1          	mov    QWORD PTR [rcx+rdx*8],rax
 14077a3:	48 85 c0             	test   rax,rax
 14077a6:	0f 84 73 01 00 00    	je     140791f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cea3>
 14077ac:	48 83 7c 24 48 00    	cmp    QWORD PTR [rsp+0x48],0x0
 14077b2:	0f 8e 30 01 00 00    	jle    14078e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ce6c>
 14077b8:	4c 89 f0             	mov    rax,r14
 14077bb:	4c 3b 74 24 28       	cmp    r14,QWORD PTR [rsp+0x28]
 14077c0:	0f 8d 25 01 00 00    	jge    14078eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ce6f>
 14077c6:	45 31 ff             	xor    r15d,r15d
 14077c9:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 14077ce:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
 14077d3:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 14077d8:	48 8b 04 c8          	mov    rax,QWORD PTR [rax+rcx*8]
 14077dc:	4a 63 04 b8          	movsxd rax,DWORD PTR [rax+r15*4]
 14077e0:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 14077e5:	8b 54 24 3c          	mov    edx,DWORD PTR [rsp+0x3c]
 14077e9:	85 54 81 20          	test   DWORD PTR [rcx+rax*4+0x20],edx
 14077ed:	0f 84 d6 00 00 00    	je     14078c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ce4d>
 14077f3:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 14077f8:	48 8b 49 20          	mov    rcx,QWORD PTR [rcx+0x20]
 14077fc:	48 8b 04 c1          	mov    rax,QWORD PTR [rcx+rax*8]
 1407800:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1407805:	48 8b 2c c8          	mov    rbp,QWORD PTR [rax+rcx*8]
 1407809:	48 85 ed             	test   rbp,rbp
 140780c:	0f 84 b7 00 00 00    	je     14078c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ce4d>
 1407812:	48 83 7d 10 00       	cmp    QWORD PTR [rbp+0x10],0x0
 1407817:	0f 8e ac 00 00 00    	jle    14078c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ce4d>
 140781d:	48 8b 4c 24 58       	mov    rcx,QWORD PTR [rsp+0x58]
 1407822:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
 1407827:	48 0f af ca          	imul   rcx,rdx
 140782b:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 1407830:	48 03 08             	add    rcx,QWORD PTR [rax]
 1407833:	48 8d 04 11          	lea    rax,[rcx+rdx*1]
 1407837:	48 99                	cqo
 1407839:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 140783e:	48 f7 ff             	idiv   rdi
 1407841:	48 89 c6             	mov    rsi,rax
 1407844:	48 89 c8             	mov    rax,rcx
 1407847:	48 99                	cqo
 1407849:	48 f7 ff             	idiv   rdi
 140784c:	4c 63 ee             	movsxd r13,esi
 140784f:	4c 39 e8             	cmp    rax,r13
 1407852:	7d 75                	jge    14078c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ce4d>
 1407854:	49 89 c6             	mov    r14,rax
 1407857:	45 31 e4             	xor    r12d,r12d
 140785a:	48 89 ef             	mov    rdi,rbp
 140785d:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
 1407862:	e8 e8 be ff ff       	call   140374f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x248cd3>
 1407867:	31 ff                	xor    edi,edi
 1407869:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
 140786e:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
 1407872:	0f 84 a7 00 00 00    	je     140791f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cea3>
 1407878:	4d 39 ee             	cmp    r14,r13
 140787b:	7d 47                	jge    14078c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ce48>
 140787d:	48 0f af 45 00       	imul   rax,QWORD PTR [rbp+0x0]
--
 1407d8e:	75 e6                	jne    1407d76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24d2fa>
 1407d90:	31 c0                	xor    eax,eax
 1407d92:	41 8b 4c 85 00       	mov    ecx,DWORD PTR [r13+rax*4+0x0]
 1407d97:	48 8b 53 28          	mov    rdx,QWORD PTR [rbx+0x28]
 1407d9b:	49 63 34 86          	movsxd rsi,DWORD PTR [r14+rax*4]
 1407d9f:	89 0c b2             	mov    DWORD PTR [rdx+rsi*4],ecx
 1407da2:	48 ff c0             	inc    rax
 1407da5:	49 39 c4             	cmp    r12,rax
 1407da8:	75 e8                	jne    1407d92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24d316>
 1407daa:	4c 89 ef             	mov    rdi,r13
 1407dad:	e8 ae 69 3e 00       	call   17ee760 <free@plt>
 1407db2:	4c 8b bd 38 ff ff ff 	mov    r15,QWORD PTR [rbp-0xc8]
 1407db9:	45 8b 6f 18          	mov    r13d,DWORD PTR [r15+0x18]
 1407dbd:	41 8d 45 ff          	lea    eax,[r13-0x1]
 1407dc1:	83 f8 01             	cmp    eax,0x1
 1407dc4:	0f 87 4e 01 00 00    	ja     1407f18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24d49c>
 1407dca:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
 1407dce:	e8 71 fb ff ff       	call   1407944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cec8>
 1407dd3:	f3 0f 11 85 30 ff ff 	movss  DWORD PTR [rbp-0xd0],xmm0
 1407dda:	ff 
 1407ddb:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
 1407ddf:	e8 60 fb ff ff       	call   1407944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24cec8>
 1407de4:	f3 0f 11 85 28 ff ff 	movss  DWORD PTR [rbp-0xd8],xmm0
 1407deb:	ff 
 1407dec:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
 1407def:	4d 0f af e7          	imul   r12,r15
 1407df3:	6a 04                	push   0x4
 1407df5:	5e                   	pop    rsi
 1407df6:	4c 89 e7             	mov    rdi,r12
 1407df9:	e8 c2 6d 3e 00       	call   17eebc0 <calloc@plt>
 1407dfe:	41 83 fd 01          	cmp    r13d,0x1
 1407e02:	0f 84 17 01 00 00    	je     1407f1f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24d4a3>
 1407e08:	41 83 fd 02          	cmp    r13d,0x2
 1407e0c:	0f 85 b2 00 00 00    	jne    1407ec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24d448>
 1407e12:	48 8b 8d 38 ff ff ff 	mov    rcx,QWORD PTR [rbp-0xc8]
 1407e19:	4c 8b 69 08          	mov    r13,QWORD PTR [rcx+0x8]
 1407e1d:	4d 85 ed             	test   r13,r13
--
 14083eb:	84 c9                	test   cl,cl
 14083ed:	0f 84 aa 00 00 00    	je     140849d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24da21>
 14083f3:	48 85 ed             	test   rbp,rbp
 14083f6:	0f 84 a1 00 00 00    	je     140849d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24da21>
 14083fc:	4d 85 ed             	test   r13,r13
 14083ff:	0f 84 98 00 00 00    	je     140849d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24da21>
 1408405:	48 89 df             	mov    rdi,rbx
 1408408:	e8 ba 95 ff ff       	call   14019c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246f4b>
 140840d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1408410:	49 63 4e 08          	movsxd rcx,DWORD PTR [r14+0x8]
 1408414:	0f 57 c0             	xorps  xmm0,xmm0
 1408417:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
 140841b:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 140841f:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
 1408423:	49 89 4f 20          	mov    QWORD PTR [r15+0x20],rcx
 1408427:	6a 01                	push   0x1
 1408429:	5e                   	pop    rsi
 140842a:	4c 89 ff             	mov    rdi,r15
 140842d:	e8 06 03 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 1408432:	48 89 c1             	mov    rcx,rax
 1408435:	b8 79 ff ff ff       	mov    eax,0xffffff79
 140843a:	48 85 c9             	test   rcx,rcx
 140843d:	75 63                	jne    14084a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24da26>
 140843f:	8b 75 50             	mov    esi,DWORD PTR [rbp+0x50]
 1408442:	4c 89 ff             	mov    rdi,r15
 1408445:	e8 ee 02 00 00       	call   1408738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcbc>
 140844a:	83 f8 ff             	cmp    eax,0xffffffff
 140844d:	74 4e                	je     140849d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24da21>
 140844f:	89 43 4c             	mov    DWORD PTR [rbx+0x4c],eax
 1408452:	48 63 e8             	movsxd rbp,eax
 1408455:	49 8b 44 ed 28       	mov    rax,QWORD PTR [r13+rbp*8+0x28]
 140845a:	48 85 c0             	test   rax,rax
 140845d:	74 3e                	je     140849d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24da21>
 140845f:	48 63 00             	movsxd rax,DWORD PTR [rax]
 1408462:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
 1408466:	48 85 c0             	test   rax,rax
 1408469:	74 52                	je     14084bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24da41>
--
 14084b0:	c3                   	ret
 14084b1:	b1 01                	mov    cl,0x1
 14084b3:	31 c0                	xor    eax,eax
 14084b5:	45 31 e4             	xor    r12d,r12d
 14084b8:	e9 12 ff ff ff       	jmp    14083cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24d953>
 14084bd:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
 14084c2:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
 14084c7:	31 c0                	xor    eax,eax
 14084c9:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
 14084cd:	48 89 4b 58          	mov    QWORD PTR [rbx+0x58],rcx
 14084d1:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
 14084d5:	48 89 4b 60          	mov    QWORD PTR [rbx+0x60],rcx
 14084d9:	41 8b 4e 18          	mov    ecx,DWORD PTR [r14+0x18]
 14084dd:	89 4b 50             	mov    DWORD PTR [rbx+0x50],ecx
 14084e0:	41 8b 44 c5 00       	mov    eax,DWORD PTR [r13+rax*8+0x0]
 14084e5:	89 43 48             	mov    DWORD PTR [rbx+0x48],eax
 14084e8:	49 63 74 24 04       	movsxd rsi,DWORD PTR [r12+0x4]
 14084ed:	48 c1 e6 03          	shl    rsi,0x3
 14084f1:	48 89 df             	mov    rdi,rbx
 14084f4:	e8 48 94 ff ff       	call   1401941 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246ec5>
 14084f9:	48 89 03             	mov    QWORD PTR [rbx],rax
 14084fc:	41 83 7c 24 04 00    	cmp    DWORD PTR [r12+0x4],0x0
 1408502:	7e 27                	jle    140852b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24daaf>
 1408504:	45 31 f6             	xor    r14d,r14d
 1408507:	48 63 73 48          	movsxd rsi,DWORD PTR [rbx+0x48]
 140850b:	48 c1 e6 02          	shl    rsi,0x2
 140850f:	48 89 df             	mov    rdi,rbx
 1408512:	e8 2a 94 ff ff       	call   1401941 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246ec5>
 1408517:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
 140851a:	4a 89 04 f1          	mov    QWORD PTR [rcx+r14*8],rax
 140851e:	49 ff c6             	inc    r14
 1408521:	49 63 44 24 04       	movsxd rax,DWORD PTR [r12+0x4]
 1408526:	49 39 c6             	cmp    r14,rax
 1408529:	7c dc                	jl     1408507 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24da8b>
 140852b:	49 8b 44 ed 28       	mov    rax,QWORD PTR [r13+rbp*8+0x28]
 1408530:	48 63 40 0c          	movsxd rax,DWORD PTR [rax+0xc]
 1408534:	49 8b b4 c5 28 03 00 	mov    rsi,QWORD PTR [r13+rax*8+0x328]
--
 1408550:	49 89 fe             	mov    r14,rdi
 1408553:	83 fa 20             	cmp    edx,0x20
 1408556:	76 0d                	jbe    1408565 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dae9>
 1408558:	4c 89 f7             	mov    rdi,r14
 140855b:	5b                   	pop    rbx
 140855c:	41 5e                	pop    r14
 140855e:	41 5f                	pop    r15
 1408560:	e9 05 01 00 00       	jmp    140866a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dbee>
 1408565:	89 d3                	mov    ebx,edx
 1408567:	49 89 f7             	mov    r15,rsi
 140856a:	49 8b 76 20          	mov    rsi,QWORD PTR [r14+0x20]
 140856e:	48 8d 4e fc          	lea    rcx,[rsi-0x4]
 1408572:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 1408576:	49 39 0e             	cmp    QWORD PTR [r14],rcx
 1408579:	0f 8d 9c 00 00 00    	jge    140861b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24db9f>
 140857f:	89 d9                	mov    ecx,ebx
 1408581:	48 8d 15 b8 a8 02 ff 	lea    rdx,[rip+0xffffffffff02a8b8]        # 432e40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5888f>
 1408588:	4c 23 3c ca          	and    r15,QWORD PTR [rdx+rcx*8]
 140858c:	41 8b 4e 08          	mov    ecx,DWORD PTR [r14+0x8]
 1408590:	01 cb                	add    ebx,ecx
 1408592:	4c 89 fa             	mov    rdx,r15
 1408595:	48 d3 e2             	shl    rdx,cl
 1408598:	08 10                	or     BYTE PTR [rax],dl
 140859a:	83 fb 08             	cmp    ebx,0x8
 140859d:	7c 62                	jl     1408601 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24db85>
 140859f:	b1 08                	mov    cl,0x8
 14085a1:	41 2a 4e 08          	sub    cl,BYTE PTR [r14+0x8]
 14085a5:	4c 89 f8             	mov    rax,r15
 14085a8:	48 d3 e8             	shr    rax,cl
 14085ab:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
 14085af:	88 41 01             	mov    BYTE PTR [rcx+0x1],al
 14085b2:	83 fb 10             	cmp    ebx,0x10
 14085b5:	72 4a                	jb     1408601 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24db85>
 14085b7:	b1 10                	mov    cl,0x10
 14085b9:	41 2a 4e 08          	sub    cl,BYTE PTR [r14+0x8]
 14085bd:	4c 89 f8             	mov    rax,r15
 14085c0:	48 d3 e8             	shr    rax,cl
 14085c3:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
 14085c7:	88 41 02             	mov    BYTE PTR [rcx+0x2],al
 14085ca:	83 fb 18             	cmp    ebx,0x18
 14085cd:	72 32                	jb     1408601 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24db85>
 14085cf:	b1 18                	mov    cl,0x18
 14085d1:	41 2a 4e 08          	sub    cl,BYTE PTR [r14+0x8]
 14085d5:	4c 89 f8             	mov    rax,r15
 14085d8:	48 d3 e8             	shr    rax,cl
 14085db:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
 14085df:	88 41 03             	mov    BYTE PTR [rcx+0x3],al
 14085e2:	83 fb 20             	cmp    ebx,0x20
 14085e5:	72 1a                	jb     1408601 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24db85>
 14085e7:	41 8b 46 08          	mov    eax,DWORD PTR [r14+0x8]
 14085eb:	8d 48 20             	lea    ecx,[rax+0x20]
 14085ee:	f7 d9                	neg    ecx
 14085f0:	49 d3 ef             	shr    r15,cl
 14085f3:	85 c0                	test   eax,eax
 14085f5:	44 0f 44 f8          	cmove  r15d,eax
 14085f9:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 14085fd:	44 88 78 04          	mov    BYTE PTR [rax+0x4],r15b
 1408601:	6a 08                	push   0x8
 1408603:	59                   	pop    rcx
 1408604:	89 d8                	mov    eax,ebx
 1408606:	99                   	cdq
 1408607:	f7 f9                	idiv   ecx
 1408609:	48 98                	cdqe
 140860b:	49 01 06             	add    QWORD PTR [r14],rax
 140860e:	49 01 46 18          	add    QWORD PTR [r14+0x18],rax
 1408612:	83 e3 07             	and    ebx,0x7
 1408615:	41 89 5e 08          	mov    DWORD PTR [r14+0x8],ebx
 1408619:	eb 49                	jmp    1408664 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dbe8>
 140861b:	48 85 c0             	test   rax,rax
 140861e:	74 44                	je     1408664 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dbe8>
 1408620:	48 b8 ff fe ff ff ff 	movabs rax,0x7ffffffffffffeff
 1408627:	ff ff 7f 
 140862a:	48 39 c6             	cmp    rsi,rax
 140862d:	0f 8f 25 ff ff ff    	jg     1408558 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dadc>
 1408633:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 1408637:	48 81 c6 00 01 00 00 	add    rsi,0x100
 140863e:	e8 1d 68 3e 00       	call   17eee60 <realloc@plt>
 1408643:	48 85 c0             	test   rax,rax
 1408646:	0f 84 0c ff ff ff    	je     1408558 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dadc>
 140864c:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 1408650:	49 81 46 20 00 01 00 	add    QWORD PTR [r14+0x20],0x100
 1408657:	00 
 1408658:	49 03 06             	add    rax,QWORD PTR [r14]
 140865b:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 140865f:	e9 1b ff ff ff       	jmp    140857f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24db03>
 1408664:	5b                   	pop    rbx
 1408665:	41 5e                	pop    r14
 1408667:	41 5f                	pop    r15
 1408669:	c3                   	ret
 140866a:	53                   	push   rbx
 140866b:	48 89 fb             	mov    rbx,rdi
 140866e:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 1408672:	e8 e9 60 3e 00       	call   17ee760 <free@plt>
 1408677:	0f 57 c0             	xorps  xmm0,xmm0
 140867a:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 140867e:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 1408681:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
 1408686:	5b                   	pop    rbx
 1408687:	c3                   	ret
 1408688:	6a ff                	push   0xffffffffffffffff
 140868a:	58                   	pop    rax
 140868b:	83 fe 20             	cmp    esi,0x20
 140868e:	76 01                	jbe    1408691 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dc15>
 1408690:	c3                   	ret
 1408691:	89 f1                	mov    ecx,esi
 1408693:	48 8d 15 a6 a7 02 ff 	lea    rdx,[rip+0xffffffffff02a7a6]        # 432e40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5888f>
 140869a:	4c 8b 04 ca          	mov    r8,QWORD PTR [rdx+rcx*8]
 140869e:	8b 57 08             	mov    edx,DWORD PTR [rdi+0x8]
--
 14086a6:	4c 8b 4f 20          	mov    r9,QWORD PTR [rdi+0x20]
 14086aa:	4d 8d 51 fc          	lea    r10,[r9-0x4]
 14086ae:	4c 39 d1             	cmp    rcx,r10
 14086b1:	7c 17                	jl     14086ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dc4e>
 14086b3:	44 8d 56 07          	lea    r10d,[rsi+0x7]
 14086b7:	41 c1 fa 03          	sar    r10d,0x3
 14086bb:	4d 63 d2             	movsxd r10,r10d
 14086be:	4d 29 d1             	sub    r9,r10
 14086c1:	4c 39 c9             	cmp    rcx,r9
 14086c4:	7f ca                	jg     1408690 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dc14>
 14086c6:	85 f6                	test   esi,esi
 14086c8:	74 6b                	je     1408735 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcb9>
 14086ca:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 14086ce:	0f b6 07             	movzx  eax,BYTE PTR [rdi]
 14086d1:	89 d1                	mov    ecx,edx
 14086d3:	48 d3 e8             	shr    rax,cl
 14086d6:	83 fe 09             	cmp    esi,0x9
 14086d9:	7c 56                	jl     1408731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcb5>
 14086db:	44 0f b6 4f 01       	movzx  r9d,BYTE PTR [rdi+0x1]
 14086e0:	b1 08                	mov    cl,0x8
 14086e2:	28 d1                	sub    cl,dl
 14086e4:	41 d3 e1             	shl    r9d,cl
 14086e7:	4d 63 c9             	movsxd r9,r9d
 14086ea:	49 09 c1             	or     r9,rax
 14086ed:	83 fe 11             	cmp    esi,0x11
 14086f0:	72 3c                	jb     140872e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcb2>
 14086f2:	0f b6 47 02          	movzx  eax,BYTE PTR [rdi+0x2]
 14086f6:	b1 10                	mov    cl,0x10
 14086f8:	28 d1                	sub    cl,dl
 14086fa:	d3 e0                	shl    eax,cl
 14086fc:	48 98                	cdqe
 14086fe:	49 09 c1             	or     r9,rax
 1408701:	83 fe 19             	cmp    esi,0x19
 1408704:	72 28                	jb     140872e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcb2>
 1408706:	0f b6 47 03          	movzx  eax,BYTE PTR [rdi+0x3]
 140870a:	b1 18                	mov    cl,0x18
 140870c:	28 d1                	sub    cl,dl
--
 1408725:	89 d1                	mov    ecx,edx
 1408727:	d3 e0                	shl    eax,cl
 1408729:	48 98                	cdqe
 140872b:	49 09 c1             	or     r9,rax
 140872e:	4c 89 c8             	mov    rax,r9
 1408731:	4c 21 c0             	and    rax,r8
 1408734:	c3                   	ret
 1408735:	31 c0                	xor    eax,eax
 1408737:	c3                   	ret
 1408738:	83 fe 21             	cmp    esi,0x21
 140873b:	72 1c                	jb     1408759 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcdd>
 140873d:	48 8b 4f 20          	mov    rcx,QWORD PTR [rdi+0x20]
 1408741:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
 1408746:	48 89 0f             	mov    QWORD PTR [rdi],rcx
 1408749:	c7 47 08 01 00 00 00 	mov    DWORD PTR [rdi+0x8],0x1
 1408750:	6a ff                	push   0xffffffffffffffff
 1408752:	41 58                	pop    r8
 1408754:	e9 d1 00 00 00       	jmp    140882a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ddae>
 1408759:	89 f0                	mov    eax,esi
 140875b:	48 8d 0d de a6 02 ff 	lea    rcx,[rip+0xffffffffff02a6de]        # 432e40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5888f>
 1408762:	48 8b 14 c1          	mov    rdx,QWORD PTR [rcx+rax*8]
 1408766:	8b 47 08             	mov    eax,DWORD PTR [rdi+0x8]
 1408769:	01 c6                	add    esi,eax
 140876b:	4c 8b 0f             	mov    r9,QWORD PTR [rdi]
 140876e:	48 8b 4f 20          	mov    rcx,QWORD PTR [rdi+0x20]
 1408772:	4c 8d 41 fc          	lea    r8,[rcx-0x4]
 1408776:	4d 39 c1             	cmp    r9,r8
 1408779:	7c 1e                	jl     1408799 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dd1d>
 140877b:	44 8d 46 07          	lea    r8d,[rsi+0x7]
 140877f:	41 c1 f8 03          	sar    r8d,0x3
 1408783:	4d 63 c0             	movsxd r8,r8d
 1408786:	49 89 ca             	mov    r10,rcx
 1408789:	4d 29 c2             	sub    r10,r8
 140878c:	4d 39 d1             	cmp    r9,r10
 140878f:	7f b0                	jg     1408741 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dcc5>
 1408791:	85 f6                	test   esi,esi
 1408793:	0f 84 95 00 00 00    	je     140882e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ddb2>
 1408799:	4c 8b 57 18          	mov    r10,QWORD PTR [rdi+0x18]
 140879d:	45 0f b6 02          	movzx  r8d,BYTE PTR [r10]
 14087a1:	89 c1                	mov    ecx,eax
 14087a3:	49 d3 e8             	shr    r8,cl
 14087a6:	83 fe 09             	cmp    esi,0x9
 14087a9:	7c 5f                	jl     140880a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dd8e>
 14087ab:	45 0f b6 5a 01       	movzx  r11d,BYTE PTR [r10+0x1]
 14087b0:	b1 08                	mov    cl,0x8
 14087b2:	28 c1                	sub    cl,al
 14087b4:	41 d3 e3             	shl    r11d,cl
 14087b7:	4d 63 db             	movsxd r11,r11d
 14087ba:	4d 09 c3             	or     r11,r8
 14087bd:	83 fe 11             	cmp    esi,0x11
 14087c0:	72 45                	jb     1408807 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dd8b>
 14087c2:	45 0f b6 42 02       	movzx  r8d,BYTE PTR [r10+0x2]
 14087c7:	b1 10                	mov    cl,0x10
 14087c9:	28 c1                	sub    cl,al
 14087cb:	41 d3 e0             	shl    r8d,cl
 14087ce:	49 63 c8             	movsxd rcx,r8d
 14087d1:	49 09 cb             	or     r11,rcx
 14087d4:	83 fe 19             	cmp    esi,0x19
 14087d7:	72 2e                	jb     1408807 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dd8b>
 14087d9:	45 0f b6 42 03       	movzx  r8d,BYTE PTR [r10+0x3]
 14087de:	b1 18                	mov    cl,0x18
 14087e0:	28 c1                	sub    cl,al
--
 14087fe:	41 d3 e0             	shl    r8d,cl
 1408801:	49 63 c0             	movsxd rax,r8d
 1408804:	49 09 c3             	or     r11,rax
 1408807:	4d 89 d8             	mov    r8,r11
 140880a:	49 21 d0             	and    r8,rdx
 140880d:	6a 08                	push   0x8
 140880f:	59                   	pop    rcx
 1408810:	89 f0                	mov    eax,esi
 1408812:	99                   	cdq
 1408813:	f7 f9                	idiv   ecx
 1408815:	48 98                	cdqe
 1408817:	49 01 c2             	add    r10,rax
 140881a:	4c 89 57 18          	mov    QWORD PTR [rdi+0x18],r10
 140881e:	49 01 c1             	add    r9,rax
 1408821:	4c 89 0f             	mov    QWORD PTR [rdi],r9
 1408824:	83 e6 07             	and    esi,0x7
 1408827:	89 77 08             	mov    DWORD PTR [rdi+0x8],esi
 140882a:	4c 89 c0             	mov    rax,r8
 140882d:	c3                   	ret
 140882e:	45 31 c0             	xor    r8d,r8d
 1408831:	eb f7                	jmp    140882a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ddae>
 1408833:	55                   	push   rbp
 1408834:	41 57                	push   r15
 1408836:	41 56                	push   r14
 1408838:	53                   	push   rbx
 1408839:	50                   	push   rax
 140883a:	48 85 ff             	test   rdi,rdi
 140883d:	74 6d                	je     14088ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24de30>
 140883f:	89 f5                	mov    ebp,esi
 1408841:	48 89 fb             	mov    rbx,rdi
 1408844:	48 83 c7 10          	add    rdi,0x10
 1408848:	ba 88 01 00 00       	mov    edx,0x188
 140884d:	31 f6                	xor    esi,esi
 140884f:	e8 3c 63 3e 00       	call   17eeb90 <memset@plt>
 1408854:	48 c7 43 08 00 40 00 	mov    QWORD PTR [rbx+0x8],0x4000
 140885b:	00 
 140885c:	48 c7 43 30 00 04 00 	mov    QWORD PTR [rbx+0x30],0x400
--
 1408940:	49 89 f7             	mov    r15,rsi
 1408943:	49 89 fe             	mov    r14,rdi
 1408946:	8b 4f 10             	mov    ecx,DWORD PTR [rdi+0x10]
 1408949:	31 db                	xor    ebx,ebx
 140894b:	4c 8d 2d fe a5 02 ff 	lea    r13,[rip+0xffffffffff02a5fe]        # 432f50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5899f>
 1408952:	41 83 7e 08 00       	cmp    DWORD PTR [r14+0x8],0x0
 1408957:	0f 88 a9 01 00 00    	js     1408b06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e08a>
 140895d:	49 8b 2e             	mov    rbp,QWORD PTR [r14]
 1408960:	48 63 c1             	movsxd rax,ecx
 1408963:	4c 8d 24 28          	lea    r12,[rax+rbp*1]
 1408967:	49 63 56 0c          	movsxd rdx,DWORD PTR [r14+0xc]
 140896b:	48 29 c2             	sub    rdx,rax
 140896e:	41 8b 46 18          	mov    eax,DWORD PTR [r14+0x18]
 1408972:	85 c0                	test   eax,eax
 1408974:	74 4d                	je     14089c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24df47>
 1408976:	41 03 46 1c          	add    eax,DWORD PTR [r14+0x1c]
 140897a:	39 d0                	cmp    eax,edx
 140897c:	0f 8f 84 01 00 00    	jg     1408b06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e08a>
 1408982:	41 8b 44 24 16       	mov    eax,DWORD PTR [r12+0x16]
 1408987:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
 140898b:	41 83 64 24 16 00    	and    DWORD PTR [r12+0x16],0x0
 1408991:	49 63 4e 18          	movsxd rcx,DWORD PTR [r14+0x18]
 1408995:	48 85 c9             	test   rcx,rcx
 1408998:	7e 7e                	jle    1408a18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24df9c>
 140899a:	45 31 c0             	xor    r8d,r8d
 140899d:	31 ff                	xor    edi,edi
 140899f:	44 89 c6             	mov    esi,r8d
 14089a2:	c1 e6 08             	shl    esi,0x8
 14089a5:	41 c1 e8 18          	shr    r8d,0x18
 14089a9:	45 0f b6 0c 3c       	movzx  r9d,BYTE PTR [r12+rdi*1]
 14089ae:	45 31 c1             	xor    r9d,r8d
 14089b1:	43 33 74 8d 00       	xor    esi,DWORD PTR [r13+r9*4+0x0]
 14089b6:	48 ff c7             	inc    rdi
 14089b9:	41 89 f0             	mov    r8d,esi
 14089bc:	48 39 f9             	cmp    rcx,rdi
 14089bf:	75 de                	jne    140899f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24df23>
 14089c1:	eb 57                	jmp    1408a1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24df9e>
 14089c3:	83 fa 1b             	cmp    edx,0x1b
 14089c6:	0f 8c 3a 01 00 00    	jl     1408b06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e08a>
 14089cc:	41 81 3c 24 4f 67 67 	cmp    DWORD PTR [r12],0x5367674f
 14089d3:	53 
 14089d4:	0f 85 8c 00 00 00    	jne    1408a66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dfea>
 14089da:	41 0f b6 4c 24 1a    	movzx  ecx,BYTE PTR [r12+0x1a]
 14089e0:	8d 41 1b             	lea    eax,[rcx+0x1b]
 14089e3:	39 c2                	cmp    edx,eax
 14089e5:	0f 82 1b 01 00 00    	jb     1408b06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e08a>
 14089eb:	84 c9                	test   cl,cl
 14089ed:	74 20                	je     1408a0f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24df93>
 14089ef:	41 8b 4e 1c          	mov    ecx,DWORD PTR [r14+0x1c]
 14089f3:	31 f6                	xor    esi,esi
 14089f5:	41 0f b6 7c 34 1b    	movzx  edi,BYTE PTR [r12+rsi*1+0x1b]
 14089fb:	01 f9                	add    ecx,edi
 14089fd:	41 89 4e 1c          	mov    DWORD PTR [r14+0x1c],ecx
 1408a01:	48 ff c6             	inc    rsi
 1408a04:	41 0f b6 7c 24 1a    	movzx  edi,BYTE PTR [r12+0x1a]
 1408a0a:	48 39 fe             	cmp    rsi,rdi
 1408a0d:	72 e6                	jb     14089f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24df79>
 1408a0f:	41 89 46 18          	mov    DWORD PTR [r14+0x18],eax
 1408a13:	e9 5e ff ff ff       	jmp    1408976 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24defa>
 1408a18:	31 f6                	xor    esi,esi
 1408a1a:	49 63 7e 1c          	movsxd rdi,DWORD PTR [r14+0x1c]
 1408a1e:	85 ff                	test   edi,edi
 1408a20:	7e 2a                	jle    1408a4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dfd0>
 1408a22:	4c 01 e1             	add    rcx,r12
 1408a25:	45 31 c9             	xor    r9d,r9d
 1408a28:	41 89 f0             	mov    r8d,esi
 1408a2b:	41 c1 e0 08          	shl    r8d,0x8
 1408a2f:	c1 ee 18             	shr    esi,0x18
 1408a32:	46 0f b6 14 09       	movzx  r10d,BYTE PTR [rcx+r9*1]
 1408a37:	41 31 f2             	xor    r10d,esi
 1408a3a:	47 33 44 95 00       	xor    r8d,DWORD PTR [r13+r10*4+0x0]
 1408a3f:	49 ff c1             	inc    r9
 1408a42:	44 89 c6             	mov    esi,r8d
 1408a45:	4c 39 cf             	cmp    rdi,r9
 1408a48:	75 e1                	jne    1408a2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dfaf>
 1408a4a:	eb 03                	jmp    1408a4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24dfd3>
 1408a4c:	41 89 f0             	mov    r8d,esi
 1408a4f:	49 8d 4c 24 16       	lea    rcx,[r12+0x16]
 1408a54:	45 89 44 24 16       	mov    DWORD PTR [r12+0x16],r8d
 1408a59:	8b 74 24 0c          	mov    esi,DWORD PTR [rsp+0xc]
 1408a5d:	3b 31                	cmp    esi,DWORD PTR [rcx]
 1408a5f:	74 33                	je     1408a94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e018>
 1408a61:	89 01                	mov    DWORD PTR [rcx],eax
 1408a63:	49 8b 2e             	mov    rbp,QWORD PTR [r14]
 1408a66:	49 83 66 18 00       	and    QWORD PTR [r14+0x18],0x0
 1408a6b:	49 8d 7c 24 01       	lea    rdi,[r12+0x1]
 1408a70:	48 ff ca             	dec    rdx
 1408a73:	6a 4f                	push   0x4f
 1408a75:	5e                   	pop    rsi
 1408a76:	e8 25 5b 3e 00       	call   17ee5a0 <memchr@plt>
 1408a7b:	48 85 c0             	test   rax,rax
 1408a7e:	75 07                	jne    1408a87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e00b>
 1408a80:	49 63 46 0c          	movsxd rax,DWORD PTR [r14+0xc]
 1408a84:	48 01 e8             	add    rax,rbp
 1408a87:	89 c1                	mov    ecx,eax
 1408a89:	29 e9                	sub    ecx,ebp
 1408a8b:	41 89 4e 10          	mov    DWORD PTR [r14+0x10],ecx
 1408a8f:	49 29 c4             	sub    r12,rax
 1408a92:	eb 4a                	jmp    1408ade <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e062>
 1408a94:	4d 85 ff             	test   r15,r15
 1408a97:	74 25                	je     1408abe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e042>
 1408a99:	49 63 46 10          	movsxd rax,DWORD PTR [r14+0x10]
 1408a9d:	49 03 06             	add    rax,QWORD PTR [r14]
 1408aa0:	49 89 07             	mov    QWORD PTR [r15],rax
 1408aa3:	49 63 4e 18          	movsxd rcx,DWORD PTR [r14+0x18]
 1408aa7:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
 1408aab:	49 63 4e 18          	movsxd rcx,DWORD PTR [r14+0x18]
 1408aaf:	48 01 c1             	add    rcx,rax
 1408ab2:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
 1408ab6:	49 63 46 1c          	movsxd rax,DWORD PTR [r14+0x1c]
 1408aba:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 1408abe:	41 83 66 14 00       	and    DWORD PTR [r14+0x14],0x0
 1408ac3:	49 63 46 18          	movsxd rax,DWORD PTR [r14+0x18]
 1408ac7:	4d 63 66 1c          	movsxd r12,DWORD PTR [r14+0x1c]
 1408acb:	49 01 c4             	add    r12,rax
 1408ace:	41 8b 4e 10          	mov    ecx,DWORD PTR [r14+0x10]
 1408ad2:	44 01 e1             	add    ecx,r12d
 1408ad5:	41 89 4e 10          	mov    DWORD PTR [r14+0x10],ecx
 1408ad9:	49 83 66 18 00       	and    QWORD PTR [r14+0x18],0x0
 1408ade:	4d 85 e4             	test   r12,r12
 1408ae1:	7f 1e                	jg     1408b01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e085>
 1408ae3:	74 21                	je     1408b06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e08a>
 1408ae5:	41 83 7e 14 00       	cmp    DWORD PTR [r14+0x14],0x0
 1408aea:	0f 85 62 fe ff ff    	jne    1408952 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ded6>
 1408af0:	41 c7 46 14 01 00 00 	mov    DWORD PTR [r14+0x14],0x1
 1408af7:	00 
 1408af8:	6a ff                	push   0xffffffffffffffff
 1408afa:	5b                   	pop    rbx
 1408afb:	eb 09                	jmp    1408b06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e08a>
 1408afd:	31 db                	xor    ebx,ebx
 1408aff:	eb 05                	jmp    1408b06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e08a>
 1408b01:	6a 01                	push   0x1
 1408b03:	58                   	pop    rax
 1408b04:	89 c3                	mov    ebx,eax
 1408b06:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1408b0d:	00 00 
 1408b0f:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 1408b14:	75 11                	jne    1408b27 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e0ab>
 1408b16:	89 d8                	mov    eax,ebx
 1408b18:	48 83 c4 18          	add    rsp,0x18
 1408b1c:	5b                   	pop    rbx
 1408b1d:	41 5c                	pop    r12
 1408b1f:	41 5d                	pop    r13
--
 1408b39:	41 57                	push   r15
 1408b3b:	41 56                	push   r14
 1408b3d:	41 55                	push   r13
 1408b3f:	41 54                	push   r12
 1408b41:	53                   	push   rbx
 1408b42:	48 83 ec 38          	sub    rsp,0x38
 1408b46:	48 89 fb             	mov    rbx,rdi
 1408b49:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 1408b4c:	48 85 ff             	test   rdi,rdi
 1408b4f:	0f 84 c1 03 00 00    	je     1408f16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e49a>
 1408b55:	4c 8b 2e             	mov    r13,QWORD PTR [rsi]
 1408b58:	4c 8b 7e 10          	mov    r15,QWORD PTR [rsi+0x10]
 1408b5c:	4c 8b 76 18          	mov    r14,QWORD PTR [rsi+0x18]
 1408b60:	41 8a 6d 04          	mov    bpl,BYTE PTR [r13+0x4]
 1408b64:	41 8a 45 05          	mov    al,BYTE PTR [r13+0x5]
 1408b68:	88 44 24 0f          	mov    BYTE PTR [rsp+0xf],al
 1408b6c:	49 8b 45 06          	mov    rax,QWORD PTR [r13+0x6]
 1408b70:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 1408b75:	49 63 4d 0e          	movsxd rcx,DWORD PTR [r13+0xe]
 1408b79:	49 63 45 12          	movsxd rax,DWORD PTR [r13+0x12]
 1408b7d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 1408b82:	45 0f b6 55 1a       	movzx  r10d,BYTE PTR [r13+0x1a]
 1408b87:	48 8b 73 18          	mov    rsi,QWORD PTR [rbx+0x18]
 1408b8b:	4c 8b 63 48          	mov    r12,QWORD PTR [rbx+0x48]
 1408b8f:	48 85 f6             	test   rsi,rsi
 1408b92:	74 40                	je     1408bd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e158>
 1408b94:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
 1408b98:	48 29 f2             	sub    rdx,rsi
 1408b9b:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
 1408b9f:	74 2e                	je     1408bcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e153>
 1408ba1:	48 01 fe             	add    rsi,rdi
 1408ba4:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
 1408ba9:	41 89 ef             	mov    r15d,ebp
 1408bac:	4c 89 d5             	mov    rbp,r10
 1408baf:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
 1408bb4:	49 89 ce             	mov    r14,rcx
 1408bb7:	e8 24 6f 3e 00       	call   17efae0 <memmove@plt>
 1408bbc:	4c 89 f1             	mov    rcx,r14
 1408bbf:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
 1408bc4:	49 89 ea             	mov    r10,rbp
 1408bc7:	44 89 fd             	mov    ebp,r15d
 1408bca:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
 1408bcf:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
 1408bd4:	4d 85 e4             	test   r12,r12
 1408bd7:	74 5d                	je     1408c36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e1ba>
 1408bd9:	48 8b 53 38          	mov    rdx,QWORD PTR [rbx+0x38]
 1408bdd:	4c 89 e0             	mov    rax,r12
 1408be0:	4c 29 e2             	sub    rdx,r12
 1408be3:	74 41                	je     1408c26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e1aa>
 1408be5:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
 1408be9:	4a 8d 34 a7          	lea    rsi,[rdi+r12*4]
 1408bed:	48 c1 e2 02          	shl    rdx,0x2
 1408bf1:	4c 89 54 24 10       	mov    QWORD PTR [rsp+0x10],r10
 1408bf6:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
 1408bfb:	e8 e0 6e 3e 00       	call   17efae0 <memmove@plt>
 1408c00:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
 1408c04:	48 8b 53 38          	mov    rdx,QWORD PTR [rbx+0x38]
 1408c08:	4a 8d 34 e7          	lea    rsi,[rdi+r12*8]
 1408c0c:	4c 29 e2             	sub    rdx,r12
 1408c0f:	48 c1 e2 03          	shl    rdx,0x3
 1408c13:	e8 c8 6e 3e 00       	call   17efae0 <memmove@plt>
 1408c18:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 1408c1d:	4c 8b 54 24 10       	mov    r10,QWORD PTR [rsp+0x10]
 1408c22:	48 8b 43 38          	mov    rax,QWORD PTR [rbx+0x38]
 1408c26:	4c 29 e0             	sub    rax,r12
 1408c29:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
 1408c2d:	4c 29 63 40          	sub    QWORD PTR [rbx+0x40],r12
 1408c31:	48 83 63 48 00       	and    QWORD PTR [rbx+0x48],0x0
 1408c36:	48 39 8b 78 01 00 00 	cmp    QWORD PTR [rbx+0x178],rcx
 1408c3d:	0f 85 d0 02 00 00    	jne    1408f13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e497>
 1408c43:	40 84 ed             	test   bpl,bpl
 1408c46:	0f 85 c7 02 00 00    	jne    1408f13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e497>
 1408c4c:	49 8d 42 01          	lea    rax,[r10+0x1]
 1408c50:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
 1408c54:	48 89 ca             	mov    rdx,rcx
 1408c57:	48 29 c2             	sub    rdx,rax
 1408c5a:	49 bb ff ff ff ff ff 	movabs r11,0x7fffffffffffffff
 1408c61:	ff ff 7f 
 1408c64:	48 3b 53 38          	cmp    rdx,QWORD PTR [rbx+0x38]
 1408c68:	48 8b 6c 24 30       	mov    rbp,QWORD PTR [rsp+0x30]
 1408c6d:	0f 8e bb 00 00 00    	jle    1408d2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e2b2>
 1408c73:	48 8b 8b 80 01 00 00 	mov    rcx,QWORD PTR [rbx+0x180]
 1408c7a:	48 39 e9             	cmp    rcx,rbp
 1408c7d:	74 4d                	je     1408ccc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e250>
 1408c7f:	48 8b 53 38          	mov    rdx,QWORD PTR [rbx+0x38]
 1408c83:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
--
 1408dac:	45 31 e4             	xor    r12d,r12d
 1408daf:	eb 05                	jmp    1408db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e33a>
 1408db1:	41 ff c4             	inc    r12d
 1408db4:	31 d2                	xor    edx,edx
 1408db6:	4d 85 f6             	test   r14,r14
 1408db9:	0f 84 94 00 00 00    	je     1408e53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e3d7>
 1408dbf:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 1408dc3:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 1408dc7:	48 89 c1             	mov    rcx,rax
 1408dca:	4c 29 f1             	sub    rcx,r14
 1408dcd:	48 39 f9             	cmp    rcx,rdi
 1408dd0:	7e 0e                	jle    1408de0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e364>
 1408dd2:	89 54 24 18          	mov    DWORD PTR [rsp+0x18],edx
 1408dd6:	4c 89 54 24 10       	mov    QWORD PTR [rsp+0x10],r10
 1408ddb:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1408dde:	eb 58                	jmp    1408e38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e3bc>
 1408de0:	4c 89 d9             	mov    rcx,r11
 1408de3:	4c 29 f1             	sub    rcx,r14
 1408de6:	48 39 c8             	cmp    rax,rcx
 1408de9:	0f 8f 1c 01 00 00    	jg     1408f0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e48f>
 1408def:	89 54 24 18          	mov    DWORD PTR [rsp+0x18],edx
 1408df3:	4c 89 54 24 10       	mov    QWORD PTR [rsp+0x10],r10
 1408df8:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
 1408dfc:	49 81 c3 00 fc ff ff 	add    r11,0xfffffffffffffc00
 1408e03:	4c 39 d9             	cmp    rcx,r11
 1408e06:	4a 8d b4 30 00 04 00 	lea    rsi,[rax+r14*1+0x400]
 1408e0d:	00 
 1408e0e:	48 0f 4d f1          	cmovge rsi,rcx
 1408e12:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1408e15:	48 89 74 24 20       	mov    QWORD PTR [rsp+0x20],rsi
 1408e1a:	e8 41 60 3e 00       	call   17eee60 <realloc@plt>
 1408e1f:	48 85 c0             	test   rax,rax
 1408e22:	0f 84 e3 00 00 00    	je     1408f0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e48f>
 1408e28:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 1408e2d:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx
 1408e31:	48 89 03             	mov    QWORD PTR [rbx],rax
 1408e34:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 1408e38:	48 01 c7             	add    rdi,rax
 1408e3b:	4c 89 fe             	mov    rsi,r15
 1408e3e:	4c 89 f2             	mov    rdx,r14
 1408e41:	e8 8a 6c 3e 00       	call   17efad0 <memcpy@plt>
 1408e46:	4c 01 73 10          	add    QWORD PTR [rbx+0x10],r14
 1408e4a:	4c 8b 54 24 10       	mov    r10,QWORD PTR [rsp+0x10]
 1408e4f:	8b 54 24 18          	mov    edx,DWORD PTR [rsp+0x18]
 1408e53:	44 89 e0             	mov    eax,r12d
 1408e56:	44 89 d1             	mov    ecx,r10d
 1408e59:	48 39 c8             	cmp    rax,rcx
 1408e5c:	73 79                	jae    1408ed7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e45b>
 1408e5e:	84 d2                	test   dl,dl
 1408e60:	40 0f 94 c7          	sete   dil
 1408e64:	48 8b 73 38          	mov    rsi,QWORD PTR [rbx+0x38]
 1408e68:	6a ff                	push   0xffffffffffffffff
 1408e6a:	5a                   	pop    rdx
 1408e6b:	45 0f b6 44 05 1b    	movzx  r8d,BYTE PTR [r13+rax*1+0x1b]
 1408e71:	4c 8b 4b 20          	mov    r9,QWORD PTR [rbx+0x20]
 1408e75:	45 89 04 b1          	mov    DWORD PTR [r9+rsi*4],r8d
 1408e79:	48 8b 73 28          	mov    rsi,QWORD PTR [rbx+0x28]
 1408e7d:	4c 8b 4b 38          	mov    r9,QWORD PTR [rbx+0x38]
 1408e81:	4a 83 0c ce ff       	or     QWORD PTR [rsi+r9*8],0xffffffffffffffff
 1408e86:	40 f6 c7 01          	test   dil,0x1
 1408e8a:	75 0f                	jne    1408e9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e41f>
 1408e8c:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
 1408e90:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
 1408e94:	81 0c be 00 01 00 00 	or     DWORD PTR [rsi+rdi*4],0x100
 1408e9b:	48 8b 73 38          	mov    rsi,QWORD PTR [rbx+0x38]
 1408e9f:	41 80 f8 ff          	cmp    r8b,0xff
 1408ea3:	74 0b                	je     1408eb0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e434>
 1408ea5:	89 f2                	mov    edx,esi
--
 1408fd7:	74 e2                	je     1408fbb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e53f>
 1408fd9:	49 c1 e1 20          	shl    r9,0x20
 1408fdd:	4c 89 c9             	mov    rcx,r9
 1408fe0:	eb 0e                	jmp    1408ff0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e574>
 1408fe2:	48 ff c1             	inc    rcx
 1408fe5:	b8 ff ff ff ff       	mov    eax,0xffffffff
 1408fea:	eb 63                	jmp    140904f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e5d3>
 1408fec:	48 c1 e1 20          	shl    rcx,0x20
 1408ff0:	48 85 f6             	test   rsi,rsi
 1408ff3:	74 3d                	je     1409032 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e5b6>
 1408ff5:	81 e2 00 01 00 00    	and    edx,0x100
 1408ffb:	45 89 c0             	mov    r8d,r8d
 1408ffe:	4c 89 46 18          	mov    QWORD PTR [rsi+0x18],r8
 1409002:	48 89 56 10          	mov    QWORD PTR [rsi+0x10],rdx
 1409006:	48 8b 17             	mov    rdx,QWORD PTR [rdi]
 1409009:	48 03 57 18          	add    rdx,QWORD PTR [rdi+0x18]
 140900d:	48 89 16             	mov    QWORD PTR [rsi],rdx
 1409010:	48 8b 97 88 01 00 00 	mov    rdx,QWORD PTR [rdi+0x188]
 1409017:	48 89 56 28          	mov    QWORD PTR [rsi+0x28],rdx
 140901b:	48 8b 57 28          	mov    rdx,QWORD PTR [rdi+0x28]
 140901f:	49 89 c8             	mov    r8,rcx
 1409022:	49 c1 f8 1d          	sar    r8,0x1d
 1409026:	4a 8b 14 02          	mov    rdx,QWORD PTR [rdx+r8*1]
 140902a:	48 89 56 20          	mov    QWORD PTR [rsi+0x20],rdx
 140902e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 1409032:	48 01 47 18          	add    QWORD PTR [rdi+0x18],rax
 1409036:	48 b8 00 00 00 00 01 	movabs rax,0x100000000
 140903d:	00 00 00 
 1409040:	48 01 c1             	add    rcx,rax
 1409043:	48 c1 f9 20          	sar    rcx,0x20
 1409047:	b8 01 00 00 00       	mov    eax,0x1
 140904c:	5b                   	pop    rbx
 140904d:	41 5e                	pop    r14
 140904f:	48 89 4f 48          	mov    QWORD PTR [rdi+0x48],rcx
 1409053:	48 ff 87 88 01 00 00 	inc    QWORD PTR [rdi+0x188]
 140905a:	c3                   	ret
 140905b:	cc                   	int3
 140905c:	48 83 c7 10          	add    rdi,0x10
 1409060:	e9 53 69 8d ff       	jmp    cdf9b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c958>
 1409065:	cc                   	int3
 1409066:	53                   	push   rbx
 1409067:	48 89 fb             	mov    rbx,rdi
 140906a:	48 83 c7 10          	add    rdi,0x10
 140906e:	e8 45 69 8d ff       	call   cdf9b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c958>
 1409073:	48 89 df             	mov    rdi,rbx
 1409076:	5b                   	pop    rbx
 1409077:	e9 a4 4e 3e 00       	jmp    17edf20 <_ZdlPv@plt>
 140907c:	8b 47 08             	mov    eax,DWORD PTR [rdi+0x8]
 140907f:	83 f8 02             	cmp    eax,0x2
 1409082:	74 25                	je     14090a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24e62d>
--
 14092cc:	bf 20 01 00 00       	mov    edi,0x120
 14092d1:	e8 2a 4c 3e 00       	call   17edf00 <_Znwm@plt>
 14092d6:	49 89 c4             	mov    r12,rax
 14092d9:	48 8d ac 24 d0 00 00 	lea    rbp,[rsp+0xd0]
 14092e0:	00 
 14092e1:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
 14092e6:	48 89 ef             	mov    rdi,rbp
 14092e9:	e8 b0 5c 8c ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
 14092ee:	48 8d 05 93 62 46 00 	lea    rax,[rip+0x466293]        # 186f588 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2bc70>
 14092f5:	49 89 04 24          	mov    QWORD PTR [r12],rax
 14092f9:	41 0f 10 47 10       	movups xmm0,XMMWORD PTR [r15+0x10]
 14092fe:	41 0f 11 44 24 08    	movups XMMWORD PTR [r12+0x8],xmm0
 1409304:	4d 89 74 24 18       	mov    QWORD PTR [r12+0x18],r14
 1409309:	41 0f 10 47 28       	movups xmm0,XMMWORD PTR [r15+0x28]
 140930e:	41 0f 10 4f 38       	movups xmm1,XMMWORD PTR [r15+0x38]
 1409313:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
 1409319:	41 0f 11 4c 24 30    	movups XMMWORD PTR [r12+0x30],xmm1
 140931f:	49 8b 47 48          	mov    rax,QWORD PTR [r15+0x48]
 1409323:	49 89 44 24 40       	mov    QWORD PTR [r12+0x40],rax
 1409328:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 140932c:	49 89 44 24 48       	mov    QWORD PTR [r12+0x48],rax
 1409331:	4c 89 e7             	mov    rdi,r12
 1409334:	48 83 c7 50          	add    rdi,0x50
 1409338:	48 89 ee             	mov    rsi,rbp
 140933b:	e8 5e 5c 8c ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
 1409340:	4d 89 ac 24 10 01 00 	mov    QWORD PTR [r12+0x110],r13
 1409347:	00 
 1409348:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 140934d:	49 89 84 24 18 01 00 	mov    QWORD PTR [r12+0x118],rax
 1409354:	00 
 1409355:	48 89 ef             	mov    rdi,rbp
 1409358:	e8 09 3d 6a ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
 140935d:	4c 89 23             	mov    QWORD PTR [rbx],r12
 1409360:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 1409365:	e8 fc 3c 6a ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
 140936a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1409371:	00 00 
--
 14093f0:	48 81 ec 88 01 00 00 	sub    rsp,0x188
 14093f7:	4d 89 c5             	mov    r13,r8
 14093fa:	48 89 cb             	mov    rbx,rcx
 14093fd:	48 89 d5             	mov    rbp,rdx
 1409400:	49 89 f6             	mov    r14,rsi
 1409403:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 1409408:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140940f:	00 00 
 1409411:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
 1409418:	00 
 1409419:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx
 140941e:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
 1409423:	4c 8b 66 18          	mov    r12,QWORD PTR [rsi+0x18]
 1409427:	4c 8b 7e 48          	mov    r15,QWORD PTR [rsi+0x48]
 140942b:	48 83 c6 50          	add    rsi,0x50
 140942f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 1409436:	00 
 1409437:	e8 aa 3b 6a ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
 140943c:	49 8b 86 18 01 00 00 	mov    rax,QWORD PTR [r14+0x118]
 1409443:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1409448:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
 140944d:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
 1409452:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
 1409455:	0f 57 c0             	xorps  xmm0,xmm0
 1409458:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
 140945d:	48 8d 35 bc a6 f3 fe 	lea    rsi,[rip+0xfffffffffef3a6bc]        # 343b20 <_ZTSSt12bad_any_cast@@Base-0x4c6a8>
 1409464:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 1409469:	e8 a6 bb 0a 00       	call   14b5014 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fa598>
 140946e:	49 8b b6 10 01 00 00 	mov    rsi,QWORD PTR [r14+0x110]
 1409475:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1409478:	4c 8d 6c 24 18       	lea    r13,[rsp+0x18]
 140947d:	4c 89 ef             	mov    rdi,r13
 1409480:	48 89 ea             	mov    rdx,rbp
 1409483:	48 89 d9             	mov    rcx,rbx
 1409486:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1409489:	48 8d 84 24 c0 01 00 	lea    rax,[rsp+0x1c0]
 1409490:	00 
 1409491:	48 8b 48 20          	mov    rcx,QWORD PTR [rax+0x20]
 1409495:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
 140949a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
 140949d:	0f 10 48 10          	movups xmm1,XMMWORD PTR [rax+0x10]
 14094a1:	0f 29 4c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm1
 14094a6:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
 14094ab:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]
 14094b0:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
 14094b7:	00 
 14094b8:	48 89 df             	mov    rdi,rbx
 14094bb:	89 ee                	mov    esi,ebp
 14094bd:	e8 b7 9b 01 00       	call   1423079 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2685fd>
 14094c2:	49 8d 76 08          	lea    rsi,[r14+0x8]
 14094c6:	49 83 c6 20          	add    r14,0x20
 14094ca:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
 14094cf:	4c 8d 54 24 50       	lea    r10,[rsp+0x50]
 14094d4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 14094d9:	4c 8d 8c 24 c0 00 00 	lea    r9,[rsp+0xc0]
--
 14094f8:	41 52                	push   r10
 14094fa:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
 14094fe:	e8 f4 a0 f5 ff       	call   13635f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8b7b>
 1409503:	48 83 c4 30          	add    rsp,0x30
 1409507:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
 140950c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 1409511:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1409514:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1409518:	48 89 03             	mov    QWORD PTR [rbx],rax
 140951b:	e8 e2 ac f5 ff       	call   1364202 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9786>
 1409520:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 1409525:	e8 b2 0b 85 ff       	call   c5a0dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a707c>
 140952a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 140952f:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 1409535:	48 85 ff             	test   rdi,rdi
 1409538:	74 06                	je     1409540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24eac4>
 140953a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 140953d:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1409540:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 1409545:	e8 d8 ac f5 ff       	call   1364222 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97a6>
 140954a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 140954f:	e8 32 4f 69 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1409554:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 140955b:	00 
 140955c:	e8 05 3b 6a ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
 1409561:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1409568:	00 00 
 140956a:	48 3b 84 24 80 01 00 	cmp    rax,QWORD PTR [rsp+0x180]
 1409571:	00 
 1409572:	75 7e                	jne    14095f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24eb76>
 1409574:	48 89 d8             	mov    rax,rbx
 1409577:	48 81 c4 88 01 00 00 	add    rsp,0x188
 140957e:	5b                   	pop    rbx
 140957f:	41 5c                	pop    r12
 1409581:	41 5d                	pop    r13
 1409583:	41 5e                	pop    r14
 1409585:	41 5f                	pop    r15
 1409587:	5d                   	pop    rbp
 1409588:	c3                   	ret
 1409589:	48 89 c3             	mov    rbx,rax
 140958c:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 1409591:	e8 46 0b 85 ff       	call   c5a0dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a707c>
 1409596:	eb 03                	jmp    140959b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24eb1f>
 1409598:	48 89 c3             	mov    rbx,rax
 140959b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 14095a0:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 14095a6:	48 85 ff             	test   rdi,rdi
 14095a9:	74 0b                	je     14095b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24eb3a>
 14095ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14095ae:	ff 50 08             	call   QWORD PTR [rax+0x8]
 14095b1:	eb 03                	jmp    14095b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24eb3a>
 14095b3:	48 89 c3             	mov    rbx,rax
 14095b6:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 14095bb:	e8 62 ac f5 ff       	call   1364222 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97a6>
 14095c0:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 14095c5:	e8 bc 4e 69 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14095ca:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 14095d1:	00 
 14095d2:	e8 8f 3a 6a ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
 14095d7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14095de:	00 00 
 14095e0:	48 3b 84 24 80 01 00 	cmp    rax,QWORD PTR [rsp+0x180]
 14095e7:	00 
 14095e8:	75 08                	jne    14095f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24eb76>
 14095ea:	48 89 df             	mov    rdi,rbx
 14095ed:	e8 de 66 66 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 14095f2:	e8 b9 64 3e 00       	call   17efab0 <__stack_chk_fail@plt>
 14095f7:	41 57                	push   r15
 14095f9:	41 56                	push   r14
 14095fb:	41 54                	push   r12
--
 1409685:	e8 34 00 00 00       	call   14096be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec42>
 140968a:	48 89 df             	mov    rdi,rbx
 140968d:	5b                   	pop    rbx
 140968e:	e9 8d 48 3e 00       	jmp    17edf20 <_ZdlPv@plt>
 1409693:	5b                   	pop    rbx
 1409694:	c3                   	ret
 1409695:	cc                   	int3
 1409696:	53                   	push   rbx
 1409697:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 140969a:	48 89 37             	mov    QWORD PTR [rdi],rsi
 140969d:	48 85 db             	test   rbx,rbx
 14096a0:	74 12                	je     14096b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec38>
 14096a2:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 14096a6:	e8 c3 ff ff ff       	call   140966e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ebf2>
 14096ab:	48 89 df             	mov    rdi,rbx
 14096ae:	5b                   	pop    rbx
 14096af:	e9 6c 48 3e 00       	jmp    17edf20 <_ZdlPv@plt>
 14096b4:	5b                   	pop    rbx
 14096b5:	c3                   	ret
 14096b6:	31 f6                	xor    esi,esi
 14096b8:	e9 d9 ff ff ff       	jmp    1409696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec1a>
 14096bd:	cc                   	int3
 14096be:	53                   	push   rbx
 14096bf:	48 83 ec 10          	sub    rsp,0x10
 14096c3:	48 89 fb             	mov    rbx,rdi
 14096c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14096cd:	00 00 
 14096cf:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 14096d4:	48 8d 47 50          	lea    rax,[rdi+0x50]
 14096d8:	48 89 e7             	mov    rdi,rsp
 14096db:	48 89 07             	mov    QWORD PTR [rdi],rax
 14096de:	e8 81 0c 01 00       	call   141a364 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f8e8>
 14096e3:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 14096e7:	e8 f0 dd d2 ff       	call   11374dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe8f2>
 14096ec:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14096f3:	00 00 
 14096f5:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
--
 140970f:	41 57                	push   r15
 1409711:	41 56                	push   r14
 1409713:	41 55                	push   r13
 1409715:	41 54                	push   r12
 1409717:	53                   	push   rbx
 1409718:	48 81 ec 58 03 00 00 	sub    rsp,0x358
 140971f:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
 1409724:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140972b:	00 00 
 140972d:	48 89 84 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rax
 1409734:	00 
 1409735:	4c 8b 36             	mov    r14,QWORD PTR [rsi]
 1409738:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
 140973d:	48 89 94 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rdx
 1409744:	00 
 1409745:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 140974c:	00 
 140974d:	e8 a4 38 00 00       	call   140cff6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25257a>
 1409752:	0f 57 c0             	xorps  xmm0,xmm0
 1409755:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
 140975c:	00 
 140975d:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 1409760:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 1409765:	48 8d 05 db 40 f5 fe 	lea    rax,[rip+0xfffffffffef540db]        # 35d847 <_ZTSSt12bad_any_cast@@Base-0x32981>
 140976c:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 1409770:	48 c7 46 20 09 00 00 	mov    QWORD PTR [rsi+0x20],0x9
 1409777:	00 
 1409778:	48 8d 94 24 b0 01 00 	lea    rdx,[rsp+0x1b0]
 140977f:	00 
 1409780:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
 1409783:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
 1409788:	48 8d 05 be ae f7 fe 	lea    rax,[rip+0xfffffffffef7aebe]        # 38464d <_ZTSSt12bad_any_cast@@Base-0xbb7b>
 140978f:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 1409793:	6a 0a                	push   0xa
 1409795:	41 5d                	pop    r13
 1409797:	4c 89 6a 20          	mov    QWORD PTR [rdx+0x20],r13
 140979b:	48 8d 8c 24 80 01 00 	lea    rcx,[rsp+0x180]
 14097a2:	00 
 14097a3:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
 14097a6:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 14097ab:	48 8d 05 d4 b1 f6 fe 	lea    rax,[rip+0xfffffffffef6b1d4]        # 374986 <_ZTSSt12bad_any_cast@@Base-0x1b842>
 14097b2:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 14097b6:	6a 07                	push   0x7
 14097b8:	58                   	pop    rax
 14097b9:	48 89 41 20          	mov    QWORD PTR [rcx+0x20],rax
 14097bd:	4c 8d 84 24 50 01 00 	lea    r8,[rsp+0x150]
 14097c4:	00 
 14097c5:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
 14097ca:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
 14097ce:	48 8d 3d b9 b1 f6 fe 	lea    rdi,[rip+0xfffffffffef6b1b9]        # 37498e <_ZTSSt12bad_any_cast@@Base-0x1b83a>
 14097d5:	49 89 78 18          	mov    QWORD PTR [r8+0x18],rdi
 14097d9:	4d 89 68 20          	mov    QWORD PTR [r8+0x20],r13
 14097dd:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
 14097e4:	00 
 14097e5:	49 83 61 10 00       	and    QWORD PTR [r9+0x10],0x0
 14097ea:	41 0f 29 01          	movaps XMMWORD PTR [r9],xmm0
 14097ee:	4c 8d 3d 06 08 f5 fe 	lea    r15,[rip+0xfffffffffef50806]        # 359ffb <_ZTSSt12bad_any_cast@@Base-0x361cd>
 14097f5:	4d 89 79 18          	mov    QWORD PTR [r9+0x18],r15
 14097f9:	4d 89 69 20          	mov    QWORD PTR [r9+0x20],r13
 14097fd:	4c 8d 94 24 20 01 00 	lea    r10,[rsp+0x120]
 1409804:	00 
 1409805:	49 83 62 10 00       	and    QWORD PTR [r10+0x10],0x0
 140980a:	41 0f 29 02          	movaps XMMWORD PTR [r10],xmm0
 140980e:	48 8d 3d 64 44 f4 fe 	lea    rdi,[rip+0xfffffffffef44464]        # 34dc79 <_ZTSSt12bad_any_cast@@Base-0x4254f>
 1409815:	49 89 7a 18          	mov    QWORD PTR [r10+0x18],rdi
 1409819:	49 89 42 20          	mov    QWORD PTR [r10+0x20],rax
 140981d:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]
 1409824:	00 
 1409825:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
 140982a:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
 140982d:	48 8d 3d ca 7a f7 fe 	lea    rdi,[rip+0xfffffffffef77aca]        # 3812fe <_ZTSSt12bad_any_cast@@Base-0xeeca>
 1409834:	48 89 78 18          	mov    QWORD PTR [rax+0x18],rdi
 1409838:	48 c7 40 20 0e 00 00 	mov    QWORD PTR [rax+0x20],0xe
 140983f:	00 
 1409840:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 1409847:	00 
 1409848:	50                   	push   rax
 1409849:	41 52                	push   r10
 140984b:	e8 c2 59 00 00       	call   140f212 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254796>
 1409850:	58                   	pop    rax
 1409851:	59                   	pop    rcx
 1409852:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1409855:	48 8b 58 28          	mov    rbx,QWORD PTR [rax+0x28]
 1409859:	4c 8b 60 10          	mov    r12,QWORD PTR [rax+0x10]
 140985d:	48 8b 68 20          	mov    rbp,QWORD PTR [rax+0x20]
 1409861:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
 1409865:	48 89 84 24 12 01 00 	mov    QWORD PTR [rsp+0x112],rax
 140986c:	00 
 140986d:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
 1409872:	0f 11 84 24 02 01 00 	movups XMMWORD PTR [rsp+0x102],xmm0
 1409879:	00 
 140987a:	41 0f 10 46 08       	movups xmm0,XMMWORD PTR [r14+0x8]
 140987f:	0f 11 84 24 f2 00 00 	movups XMMWORD PTR [rsp+0xf2],xmm0
 1409886:	00 
 1409887:	bf 88 03 00 00       	mov    edi,0x388
 140988c:	e8 6f 46 3e 00       	call   17edf00 <_Znwm@plt>
 1409891:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1409896:	48 83 a4 24 30 03 00 	and    QWORD PTR [rsp+0x330],0x0
 140989d:	00 00 
 140989f:	48 83 a4 24 40 03 00 	and    QWORD PTR [rsp+0x340],0x0
 14098a6:	00 00 
 14098a8:	6a 48                	push   0x48
 14098aa:	5f                   	pop    rdi
 14098ab:	e8 50 46 3e 00       	call   17edf00 <_Znwm@plt>
 14098b0:	48 89 18             	mov    QWORD PTR [rax],rbx
 14098b3:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
 14098b7:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp
 14098bb:	48 8d 94 24 e8 00 00 	lea    rdx,[rsp+0xe8]
 14098c2:	00 
 14098c3:	0f b7 4a 04          	movzx  ecx,WORD PTR [rdx+0x4]
 14098c7:	66 89 48 1c          	mov    WORD PTR [rax+0x1c],cx
 14098cb:	8b 0a                	mov    ecx,DWORD PTR [rdx]
 14098cd:	89 48 18             	mov    DWORD PTR [rax+0x18],ecx
 14098d0:	0f 10 84 24 f0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xf0]
 14098d7:	00 
 14098d8:	0f 10 8c 24 00 01 00 	movups xmm1,XMMWORD PTR [rsp+0x100]
 14098df:	00 
 14098e0:	0f 10 94 24 0a 01 00 	movups xmm2,XMMWORD PTR [rsp+0x10a]
 14098e7:	00 
 14098e8:	0f 11 40 1e          	movups XMMWORD PTR [rax+0x1e],xmm0
 14098ec:	0f 11 48 2e          	movups XMMWORD PTR [rax+0x2e],xmm1
 14098f0:	0f 11 50 38          	movups XMMWORD PTR [rax+0x38],xmm2
 14098f4:	48 8d 8c 24 30 03 00 	lea    rcx,[rsp+0x330]
 14098fb:	00 
 14098fc:	48 89 01             	mov    QWORD PTR [rcx],rax
 14098ff:	48 8d 05 08 8a 75 ff 	lea    rax,[rip+0xffffffffff758a08]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 1409906:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 140990a:	48 8d 05 91 59 00 00 	lea    rax,[rip+0x5991]        # 140f2a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254826>
 1409911:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 1409915:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
 140991c:	00 
 140991d:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1409922:	e8 9f 59 00 00       	call   140f2c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25484a>
 1409927:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
 140992e:	00 
 140992f:	e8 cc 5c 00 00       	call   140f600 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b84>
 1409934:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 140993b:	00 
 140993c:	e8 e5 5c 00 00       	call   140f626 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254baa>
 1409941:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 1409948:	00 
 1409949:	e8 da 1d 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140994e:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 1409955:	00 
 1409956:	e8 cd 1d 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140995b:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
 1409962:	00 
 1409963:	e8 c0 1d 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1409968:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 140996f:	00 
 1409970:	e8 b3 1d 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1409975:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
 140997c:	00 
--
 14099f0:	74 06                	je     14099f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ef7c>
 14099f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14099f5:	ff 50 08             	call   QWORD PTR [rax+0x8]
 14099f8:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 14099ff:	00 
 1409a00:	e8 8b 44 3e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1409a05:	0f 57 c0             	xorps  xmm0,xmm0
 1409a08:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
 1409a0f:	00 
 1409a10:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 1409a13:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 1409a18:	48 8d 05 39 ac f7 fe 	lea    rax,[rip+0xfffffffffef7ac39]        # 384658 <_ZTSSt12bad_any_cast@@Base-0xbb70>
 1409a1f:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 1409a23:	4c 89 6e 20          	mov    QWORD PTR [rsi+0x20],r13
 1409a27:	48 8d 94 24 b0 01 00 	lea    rdx,[rsp+0x1b0]
 1409a2e:	00 
 1409a2f:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
 1409a32:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
 1409a37:	48 8d 05 00 60 f2 fe 	lea    rax,[rip+0xfffffffffef26000]        # 32fa3e <_ZTSSt12bad_any_cast@@Base-0x6078a>
 1409a3e:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 1409a42:	48 c7 42 20 08 00 00 	mov    QWORD PTR [rdx+0x20],0x8
 1409a49:	00 
 1409a4a:	48 8d 8c 24 80 01 00 	lea    rcx,[rsp+0x180]
 1409a51:	00 
 1409a52:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
 1409a55:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 1409a5a:	4c 89 79 18          	mov    QWORD PTR [rcx+0x18],r15
 1409a5e:	4c 89 69 20          	mov    QWORD PTR [rcx+0x20],r13
 1409a62:	4c 8d 84 24 50 01 00 	lea    r8,[rsp+0x150]
 1409a69:	00 
 1409a6a:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
 1409a6e:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
 1409a73:	48 8d 05 ff 41 f4 fe 	lea    rax,[rip+0xfffffffffef441ff]        # 34dc79 <_ZTSSt12bad_any_cast@@Base-0x4254f>
 1409a7a:	49 89 40 18          	mov    QWORD PTR [r8+0x18],rax
 1409a7e:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
 1409a85:	00 
 1409a86:	49 83 61 10 00       	and    QWORD PTR [r9+0x10],0x0
 1409a8b:	49 c7 40 20 07 00 00 	mov    QWORD PTR [r8+0x20],0x7
 1409a92:	00 
 1409a93:	41 0f 29 01          	movaps XMMWORD PTR [r9],xmm0
 1409a97:	48 8d 05 60 78 f7 fe 	lea    rax,[rip+0xfffffffffef77860]        # 3812fe <_ZTSSt12bad_any_cast@@Base-0xeeca>
 1409a9e:	49 89 41 18          	mov    QWORD PTR [r9+0x18],rax
 1409aa2:	49 c7 41 20 0e 00 00 	mov    QWORD PTR [r9+0x20],0xe
 1409aa9:	00 
 1409aaa:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 1409ab1:	00 
 1409ab2:	e8 ef 53 00 00       	call   140eea6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25442a>
 1409ab7:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1409aba:	4c 8b 78 28          	mov    r15,QWORD PTR [rax+0x28]
 1409abe:	4c 8b 68 10          	mov    r13,QWORD PTR [rax+0x10]
 1409ac2:	4c 8b 60 20          	mov    r12,QWORD PTR [rax+0x20]
 1409ac6:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
 1409aca:	48 89 84 24 12 01 00 	mov    QWORD PTR [rsp+0x112],rax
 1409ad1:	00 
 1409ad2:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
 1409ad5:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]
 1409ad9:	0f 11 8c 24 02 01 00 	movups XMMWORD PTR [rsp+0x102],xmm1
 1409ae0:	00 
 1409ae1:	0f 11 84 24 f2 00 00 	movups XMMWORD PTR [rsp+0xf2],xmm0
 1409ae8:	00 
 1409ae9:	bf 98 02 00 00       	mov    edi,0x298
 1409aee:	e8 0d 44 3e 00       	call   17edf00 <_Znwm@plt>
 1409af3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 1409af8:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 1409aff:	00 00 
 1409b01:	48 83 a4 24 30 01 00 	and    QWORD PTR [rsp+0x130],0x0
 1409b08:	00 00 
 1409b0a:	6a 48                	push   0x48
 1409b0c:	5f                   	pop    rdi
 1409b0d:	e8 ee 43 3e 00       	call   17edf00 <_Znwm@plt>
 1409b12:	4c 89 38             	mov    QWORD PTR [rax],r15
 1409b15:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
 1409b19:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
 1409b1d:	48 8d 94 24 e8 00 00 	lea    rdx,[rsp+0xe8]
 1409b24:	00 
 1409b25:	0f b7 4a 04          	movzx  ecx,WORD PTR [rdx+0x4]
 1409b29:	66 89 48 1c          	mov    WORD PTR [rax+0x1c],cx
 1409b2d:	8b 0a                	mov    ecx,DWORD PTR [rdx]
 1409b2f:	89 48 18             	mov    DWORD PTR [rax+0x18],ecx
 1409b32:	0f 10 84 24 f0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xf0]
 1409b39:	00 
 1409b3a:	0f 10 8c 24 00 01 00 	movups xmm1,XMMWORD PTR [rsp+0x100]
 1409b41:	00 
 1409b42:	0f 10 94 24 0a 01 00 	movups xmm2,XMMWORD PTR [rsp+0x10a]
 1409b49:	00 
 1409b4a:	0f 11 40 1e          	movups XMMWORD PTR [rax+0x1e],xmm0
 1409b4e:	0f 11 48 2e          	movups XMMWORD PTR [rax+0x2e],xmm1
 1409b52:	0f 11 50 38          	movups XMMWORD PTR [rax+0x38],xmm2
 1409b56:	48 8d 8c 24 20 01 00 	lea    rcx,[rsp+0x120]
 1409b5d:	00 
 1409b5e:	48 89 01             	mov    QWORD PTR [rcx],rax
 1409b61:	48 8d 05 a6 87 75 ff 	lea    rax,[rip+0xffffffffff7587a6]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 1409b68:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 1409b6c:	48 8d 05 8f 53 00 00 	lea    rax,[rip+0x538f]        # 140ef02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254486>
 1409b73:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 1409b77:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
 1409b7e:	00 
 1409b7f:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
 1409b84:	4c 89 ff             	mov    rdi,r15
 1409b87:	e8 9a 53 00 00       	call   140ef26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2544aa>
 1409b8c:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 1409b93:	00 
 1409b94:	e8 1f 56 00 00       	call   140f1b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25473c>
 1409b99:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 1409ba0:	00 
 1409ba1:	e8 38 56 00 00       	call   140f1de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254762>
 1409ba6:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
 1409bad:	00 
 1409bae:	e8 75 1b 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1409bb3:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 1409bba:	00 
 1409bbb:	e8 68 1b 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1409bc0:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
 1409bc7:	00 
 1409bc8:	e8 5b 1b 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1409bcd:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 1409bd4:	00 
 1409bd5:	e8 4e 1b 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1409bda:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
--
 1409c21:	74 06                	je     1409c29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24f1ad>
 1409c23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1409c26:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1409c29:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
 1409c30:	00 
 1409c31:	e8 5a 42 3e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1409c36:	0f 57 c0             	xorps  xmm0,xmm0
 1409c39:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
 1409c40:	00 
 1409c41:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 1409c44:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 1409c49:	48 8d 05 29 40 f4 fe 	lea    rax,[rip+0xfffffffffef44029]        # 34dc79 <_ZTSSt12bad_any_cast@@Base-0x4254f>
 1409c50:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 1409c54:	48 c7 46 20 07 00 00 	mov    QWORD PTR [rsi+0x20],0x7
 1409c5b:	00 
 1409c5c:	48 8d 94 24 b0 01 00 	lea    rdx,[rsp+0x1b0]
 1409c63:	00 
 1409c64:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
 1409c67:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
 1409c6c:	48 8d 05 e5 a9 f7 fe 	lea    rax,[rip+0xfffffffffef7a9e5]        # 384658 <_ZTSSt12bad_any_cast@@Base-0xbb70>
 1409c73:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 1409c77:	48 8d 8c 24 80 01 00 	lea    rcx,[rsp+0x180]
 1409c7e:	00 
 1409c7f:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 1409c84:	48 c7 42 20 0a 00 00 	mov    QWORD PTR [rdx+0x20],0xa
 1409c8b:	00 
 1409c8c:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
 1409c8f:	48 8d 05 68 76 f7 fe 	lea    rax,[rip+0xfffffffffef77668]        # 3812fe <_ZTSSt12bad_any_cast@@Base-0xeeca>
 1409c96:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 1409c9a:	48 c7 41 20 0e 00 00 	mov    QWORD PTR [rcx+0x20],0xe
 1409ca1:	00 
 1409ca2:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 1409ca9:	00 
 1409caa:	e8 45 40 00 00       	call   140dcf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253278>
 1409caf:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1409cb2:	4c 8b 78 28          	mov    r15,QWORD PTR [rax+0x28]
 1409cb6:	4c 8b 60 10          	mov    r12,QWORD PTR [rax+0x10]
 1409cba:	4c 8b 68 20          	mov    r13,QWORD PTR [rax+0x20]
 1409cbe:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
 1409cc2:	48 89 84 24 12 01 00 	mov    QWORD PTR [rsp+0x112],rax
 1409cc9:	00 
 1409cca:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
 1409ccd:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]
 1409cd1:	0f 11 8c 24 02 01 00 	movups XMMWORD PTR [rsp+0x102],xmm1
 1409cd8:	00 
 1409cd9:	0f 11 84 24 f2 00 00 	movups XMMWORD PTR [rsp+0xf2],xmm0
 1409ce0:	00 
 1409ce1:	bf a8 01 00 00       	mov    edi,0x1a8
 1409ce6:	e8 15 42 3e 00       	call   17edf00 <_Znwm@plt>
 1409ceb:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 1409cf0:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
 1409cf7:	00 00 
 1409cf9:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
 1409d00:	00 00 
 1409d02:	6a 48                	push   0x48
 1409d04:	5f                   	pop    rdi
 1409d05:	e8 f6 41 3e 00       	call   17edf00 <_Znwm@plt>
 1409d0a:	4c 89 38             	mov    QWORD PTR [rax],r15
 1409d0d:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
 1409d11:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
 1409d15:	48 8d 94 24 e8 00 00 	lea    rdx,[rsp+0xe8]
 1409d1c:	00 
 1409d1d:	0f b7 4a 04          	movzx  ecx,WORD PTR [rdx+0x4]
 1409d21:	66 89 48 1c          	mov    WORD PTR [rax+0x1c],cx
 1409d25:	8b 0a                	mov    ecx,DWORD PTR [rdx]
 1409d27:	89 48 18             	mov    DWORD PTR [rax+0x18],ecx
 1409d2a:	0f 10 84 24 f0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xf0]
 1409d31:	00 
 1409d32:	0f 10 8c 24 00 01 00 	movups xmm1,XMMWORD PTR [rsp+0x100]
 1409d39:	00 
 1409d3a:	0f 10 94 24 0a 01 00 	movups xmm2,XMMWORD PTR [rsp+0x10a]
 1409d41:	00 
 1409d42:	0f 11 40 1e          	movups XMMWORD PTR [rax+0x1e],xmm0
 1409d46:	0f 11 48 2e          	movups XMMWORD PTR [rax+0x2e],xmm1
 1409d4a:	0f 11 50 38          	movups XMMWORD PTR [rax+0x38],xmm2
 1409d4e:	48 8d 8c 24 50 01 00 	lea    rcx,[rsp+0x150]
 1409d55:	00 
 1409d56:	48 89 01             	mov    QWORD PTR [rcx],rax
 1409d59:	48 8d 05 ae 85 75 ff 	lea    rax,[rip+0xffffffffff7585ae]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 1409d60:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 1409d64:	48 8d 05 bd 3f 00 00 	lea    rax,[rip+0x3fbd]        # 140dd28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2532ac>
 1409d6b:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 1409d6f:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
 1409d76:	00 
 1409d77:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
 1409d7c:	4c 89 ff             	mov    rdi,r15
 1409d7f:	e8 c8 3f 00 00       	call   140dd4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2532d0>
 1409d84:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 1409d8b:	00 
 1409d8c:	e8 a7 41 00 00       	call   140df38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2534bc>
 1409d91:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 1409d98:	00 
 1409d99:	e8 c0 41 00 00       	call   140df5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2534e2>
 1409d9e:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
 1409da5:	00 
 1409da6:	e8 7d 19 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1409dab:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 1409db2:	00 
 1409db3:	e8 70 19 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1409db8:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
 1409dbf:	00 
 1409dc0:	e8 63 19 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1409dc5:	48 8d 35 6e 0a f4 fe 	lea    rsi,[rip+0xfffffffffef40a6e]        # 34a83a <_ZTSSt12bad_any_cast@@Base-0x4598e>
 1409dcc:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 1409dd3:	00 
 1409dd4:	e8 a5 fc 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
--
 1409ee8:	00 
 1409ee9:	0f 10 94 24 2a 02 00 	movups xmm2,XMMWORD PTR [rsp+0x22a]
 1409ef0:	00 
 1409ef1:	0f 11 40 0e          	movups XMMWORD PTR [rax+0xe],xmm0
 1409ef5:	0f 11 48 1e          	movups XMMWORD PTR [rax+0x1e],xmm1
 1409ef9:	0f 11 50 28          	movups XMMWORD PTR [rax+0x28],xmm2
 1409efd:	48 8d 8c 24 b0 01 00 	lea    rcx,[rsp+0x1b0]
 1409f04:	00 
 1409f05:	48 89 01             	mov    QWORD PTR [rcx],rax
 1409f08:	48 8d 05 ff 83 75 ff 	lea    rax,[rip+0xffffffffff7583ff]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 1409f0f:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 1409f13:	48 8d 05 64 40 00 00 	lea    rax,[rip+0x4064]        # 140df7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253502>
 1409f1a:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 1409f1e:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
 1409f25:	00 
 1409f26:	4c 89 e7             	mov    rdi,r12
 1409f29:	e8 6e 40 00 00       	call   140df9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253520>
 1409f2e:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 1409f35:	00 
 1409f36:	e8 97 41 00 00       	call   140e0d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253656>
 1409f3b:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 1409f42:	00 
 1409f43:	e8 e0 17 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1409f48:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
 1409f4f:	00 
 1409f50:	e8 d3 17 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1409f55:	48 8d 35 c6 78 f6 fe 	lea    rsi,[rip+0xfffffffffef678c6]        # 371822 <_ZTSSt12bad_any_cast@@Base-0x1e9a6>
 1409f5c:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 1409f63:	00 
 1409f64:	e8 15 fb 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 1409f69:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
 1409f6e:	4c 89 22             	mov    QWORD PTR [rdx],r12
 1409f71:	48 8d b4 24 20 01 00 	lea    rsi,[rsp+0x120]
 1409f78:	00 
 1409f79:	48 89 ef             	mov    rdi,rbp
 1409f7c:	e8 13 32 00 00       	call   140d194 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252718>
 1409f81:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
--
 1409f8f:	74 06                	je     1409f97 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24f51b>
 1409f91:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1409f94:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1409f97:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 1409f9e:	00 
 1409f9f:	e8 ec 3e 3e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1409fa4:	0f 57 c0             	xorps  xmm0,xmm0
 1409fa7:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
 1409fae:	00 
 1409faf:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 1409fb4:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 1409fb7:	48 8d 05 1d d6 f3 fe 	lea    rax,[rip+0xfffffffffef3d61d]        # 3475db <_ZTSSt12bad_any_cast@@Base-0x48bed>
 1409fbe:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 1409fc2:	48 c7 46 20 06 00 00 	mov    QWORD PTR [rsi+0x20],0x6
 1409fc9:	00 
 1409fca:	48 8d 94 24 e0 01 00 	lea    rdx,[rsp+0x1e0]
 1409fd1:	00 
 1409fd2:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
 1409fd7:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
 1409fda:	48 8d 05 b0 69 f4 fe 	lea    rax,[rip+0xfffffffffef469b0]        # 350991 <_ZTSSt12bad_any_cast@@Base-0x3f837>
 1409fe1:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 1409fe5:	48 c7 42 20 09 00 00 	mov    QWORD PTR [rdx+0x20],0x9
 1409fec:	00 
 1409fed:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 1409ff4:	00 
 1409ff5:	e8 e8 38 00 00       	call   140d8e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252e66>
 1409ffa:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1409ffd:	48 8b 58 28          	mov    rbx,QWORD PTR [rax+0x28]
 140a001:	bf 30 01 00 00       	mov    edi,0x130
 140a006:	e8 f5 3e 3e 00       	call   17edf00 <_Znwm@plt>
 140a00b:	49 89 c7             	mov    r15,rax
 140a00e:	48 8d 8c 24 b0 01 00 	lea    rcx,[rsp+0x1b0]
 140a015:	00 
 140a016:	48 89 19             	mov    QWORD PTR [rcx],rbx
 140a019:	48 8d 94 24 e8 00 00 	lea    rdx,[rsp+0xe8]
 140a020:	00 
 140a021:	8b 02                	mov    eax,DWORD PTR [rdx]
 140a023:	89 41 08             	mov    DWORD PTR [rcx+0x8],eax
 140a026:	0f b7 42 04          	movzx  eax,WORD PTR [rdx+0x4]
 140a02a:	66 89 41 0c          	mov    WORD PTR [rcx+0xc],ax
 140a02e:	48 8d 05 0f 3c 6d ff 	lea    rax,[rip+0xffffffffff6d3c0f]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
 140a035:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 140a039:	48 8d 05 ca 42 00 00 	lea    rax,[rip+0x42ca]        # 140e30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25388e>
 140a040:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140a044:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
 140a04b:	00 
 140a04c:	4c 89 ff             	mov    rdi,r15
 140a04f:	e8 ce 42 00 00       	call   140e322 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2538a6>
 140a054:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 140a05b:	00 
 140a05c:	e8 47 44 00 00       	call   140e4a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a2c>
 140a061:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 140a068:	00 
 140a069:	e8 9a 3b 00 00       	call   140dc08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25318c>
 140a06e:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
 140a075:	00 
 140a076:	e8 ad 16 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140a07b:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 140a082:	00 
 140a083:	e8 a0 16 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140a088:	48 8d 35 7e 72 f7 fe 	lea    rsi,[rip+0xfffffffffef7727e]        # 38130d <_ZTSSt12bad_any_cast@@Base-0xeebb>
 140a08f:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
 140a096:	00 
 140a097:	e8 e2 f9 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140a09c:	48 8d 54 24 58       	lea    rdx,[rsp+0x58]
 140a0a1:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 140a0a4:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
 140a0ab:	00 
--
 140a0c2:	74 06                	je     140a0ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24f64e>
 140a0c4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 140a0c7:	ff 50 08             	call   QWORD PTR [rax+0x8]
 140a0ca:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
 140a0d1:	00 
 140a0d2:	e8 b9 3d 3e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 140a0d7:	0f 57 c0             	xorps  xmm0,xmm0
 140a0da:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
 140a0e1:	00 
 140a0e2:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 140a0e7:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 140a0ea:	48 8d 05 de 1a f8 fe 	lea    rax,[rip+0xfffffffffef81ade]        # 38bbcf <_ZTSSt12bad_any_cast@@Base-0x45f9>
 140a0f1:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 140a0f5:	48 c7 46 20 03 00 00 	mov    QWORD PTR [rsi+0x20],0x3
 140a0fc:	00 
 140a0fd:	48 8d 94 24 e0 01 00 	lea    rdx,[rsp+0x1e0]
 140a104:	00 
 140a105:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
 140a10a:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
 140a10d:	48 8d 05 0f dd f7 fe 	lea    rax,[rip+0xfffffffffef7dd0f]        # 387e23 <_ZTSSt12bad_any_cast@@Base-0x83a5>
 140a114:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 140a118:	48 c7 42 20 04 00 00 	mov    QWORD PTR [rdx+0x20],0x4
 140a11f:	00 
 140a120:	48 8d 8c 24 b0 01 00 	lea    rcx,[rsp+0x1b0]
 140a127:	00 
 140a128:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 140a12d:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
 140a130:	48 8d 05 2d 42 f6 fe 	lea    rax,[rip+0xfffffffffef6422d]        # 36e364 <_ZTSSt12bad_any_cast@@Base-0x21e64>
 140a137:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140a13b:	48 c7 41 20 05 00 00 	mov    QWORD PTR [rcx+0x20],0x5
 140a142:	00 
 140a143:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 140a14a:	00 
 140a14b:	e8 a4 3b 00 00       	call   140dcf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253278>
 140a150:	49 8b 1e             	mov    rbx,QWORD PTR [r14]
 140a153:	bf a8 01 00 00       	mov    edi,0x1a8
 140a158:	e8 a3 3d 3e 00       	call   17edf00 <_Znwm@plt>
 140a15d:	49 89 c5             	mov    r13,rax
 140a160:	48 8d 8c 24 80 01 00 	lea    rcx,[rsp+0x180]
 140a167:	00 
 140a168:	48 89 19             	mov    QWORD PTR [rcx],rbx
 140a16b:	48 8d 94 24 e8 00 00 	lea    rdx,[rsp+0xe8]
 140a172:	00 
 140a173:	8b 02                	mov    eax,DWORD PTR [rdx]
 140a175:	89 41 08             	mov    DWORD PTR [rcx+0x8],eax
 140a178:	0f b7 42 04          	movzx  eax,WORD PTR [rdx+0x4]
 140a17c:	66 89 41 0c          	mov    WORD PTR [rcx+0xc],ax
 140a180:	48 8d 05 bd 3a 6d ff 	lea    rax,[rip+0xffffffffff6d3abd]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
 140a187:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 140a18b:	48 8d 05 86 49 00 00 	lea    rax,[rip+0x4986]        # 140eb18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25409c>
 140a192:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140a196:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
 140a19d:	00 
 140a19e:	4c 89 ef             	mov    rdi,r13
 140a1a1:	e8 92 49 00 00       	call   140eb38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2540bc>
 140a1a6:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
 140a1ad:	00 
 140a1ae:	e8 59 4b 00 00       	call   140ed0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254290>
 140a1b3:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 140a1ba:	00 
 140a1bb:	e8 9e 3d 00 00       	call   140df5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2534e2>
 140a1c0:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 140a1c7:	00 
 140a1c8:	e8 5b 15 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140a1cd:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
 140a1d4:	00 
 140a1d5:	e8 4e 15 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140a1da:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 140a1e1:	00 
 140a1e2:	e8 41 15 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140a1e7:	48 8d 35 75 a4 f7 fe 	lea    rsi,[rip+0xfffffffffef7a475]        # 384663 <_ZTSSt12bad_any_cast@@Base-0xbb65>
 140a1ee:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 140a1f5:	00 
 140a1f6:	e8 83 f8 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140a1fb:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
--
 140a282:	00 
 140a283:	48 89 84 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rax
 140a28a:	00 
 140a28b:	48 8b 84 24 10 01 00 	mov    rax,QWORD PTR [rsp+0x110]
 140a292:	00 
 140a293:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
 140a29a:	00 
 140a29b:	bf b8 00 00 00       	mov    edi,0xb8
 140a2a0:	e8 5b 3c 3e 00       	call   17edf00 <_Znwm@plt>
 140a2a5:	49 89 c5             	mov    r13,rax
 140a2a8:	48 b8 ff ff ff ff ff 	movabs rax,0xffffffffffff
 140a2af:	ff 00 00 
 140a2b2:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
 140a2b7:	48 21 c2             	and    rdx,rax
 140a2ba:	48 8d 8c 24 e0 01 00 	lea    rcx,[rsp+0x1e0]
 140a2c1:	00 
 140a2c2:	48 89 11             	mov    QWORD PTR [rcx],rdx
 140a2c5:	48 8d 05 98 21 67 ff 	lea    rax,[rip+0xffffffffff672198]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 140a2cc:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 140a2d0:	48 8d 05 4f 2d 00 00 	lea    rax,[rip+0x2d4f]        # 140d026 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2525aa>
 140a2d7:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140a2db:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
 140a2e2:	00 
 140a2e3:	48 8d 94 24 e8 00 00 	lea    rdx,[rsp+0xe8]
 140a2ea:	00 
 140a2eb:	4c 89 ef             	mov    rdi,r13
 140a2ee:	e8 45 2d 00 00       	call   140d038 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2525bc>
 140a2f3:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
 140a2fa:	00 
 140a2fb:	e8 6e 2e 00 00       	call   140d16e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2526f2>
 140a300:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 140a307:	00 
 140a308:	e8 1b 14 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140a30d:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 140a314:	00 
 140a315:	e8 0e 14 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140a31a:	48 8d 35 7e cb f4 fe 	lea    rsi,[rip+0xfffffffffef4cb7e]        # 356e9f <_ZTSSt12bad_any_cast@@Base-0x39329>
 140a321:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
 140a328:	00 
 140a329:	e8 50 f7 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140a32e:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
 140a333:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
 140a338:	48 8d 54 24 48       	lea    rdx,[rsp+0x48]
 140a33d:	4c 89 2a             	mov    QWORD PTR [rdx],r13
 140a340:	48 8d b4 24 80 01 00 	lea    rsi,[rsp+0x180]
 140a347:	00 
 140a348:	48 89 ef             	mov    rdi,rbp
 140a34b:	e8 44 2e 00 00       	call   140d194 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252718>
 140a350:	4d 89 fe             	mov    r14,r15
 140a353:	49 89 ec             	mov    r12,rbp
 140a356:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
 140a35b:	48 85 ff             	test   rdi,rdi
 140a35e:	74 06                	je     140a366 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24f8ea>
 140a360:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 140a363:	ff 50 08             	call   QWORD PTR [rax+0x8]
 140a366:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
 140a36d:	00 
 140a36e:	e8 1d 3b 3e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 140a373:	48 8d 05 fe ad f5 fe 	lea    rax,[rip+0xfffffffffef5adfe]        # 365178 <_ZTSSt12bad_any_cast@@Base-0x2b050>
 140a37a:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
 140a381:	00 
 140a382:	48 c7 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],0x4
 140a389:	00 04 00 00 00 
 140a38e:	0f 57 c0             	xorps  xmm0,xmm0
 140a391:	48 83 a4 24 20 02 00 	and    QWORD PTR [rsp+0x220],0x0
--
 140a3a2:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
 140a3a9:	00 00 
 140a3ab:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
 140a3b2:	00 
 140a3b3:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
 140a3ba:	00 
 140a3bb:	48 89 84 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rax
 140a3c2:	00 
 140a3c3:	48 8b 84 24 10 01 00 	mov    rax,QWORD PTR [rsp+0x110]
 140a3ca:	00 
 140a3cb:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
 140a3d2:	00 
 140a3d3:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 140a3d8:	48 8b 00             	mov    rax,QWORD PTR [rax]
 140a3db:	4c 8b 78 10          	mov    r15,QWORD PTR [rax+0x10]
 140a3df:	48 8b 68 20          	mov    rbp,QWORD PTR [rax+0x20]
 140a3e3:	bf b8 00 00 00       	mov    edi,0xb8
 140a3e8:	e8 13 3b 3e 00       	call   17edf00 <_Znwm@plt>
 140a3ed:	48 89 c3             	mov    rbx,rax
 140a3f0:	48 83 a4 24 e0 01 00 	and    QWORD PTR [rsp+0x1e0],0x0
 140a3f7:	00 00 
 140a3f9:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
 140a400:	00 00 
 140a402:	6a 18                	push   0x18
 140a404:	5f                   	pop    rdi
 140a405:	e8 f6 3a 3e 00       	call   17edf00 <_Znwm@plt>
 140a40a:	4c 89 38             	mov    QWORD PTR [rax],r15
 140a40d:	48 89 68 08          	mov    QWORD PTR [rax+0x8],rbp
 140a411:	48 8d 94 24 e8 00 00 	lea    rdx,[rsp+0xe8]
 140a418:	00 
 140a419:	8b 0a                	mov    ecx,DWORD PTR [rdx]
 140a41b:	89 48 10             	mov    DWORD PTR [rax+0x10],ecx
 140a41e:	0f b7 4a 04          	movzx  ecx,WORD PTR [rdx+0x4]
 140a422:	66 89 48 14          	mov    WORD PTR [rax+0x14],cx
 140a426:	48 8d 8c 24 e0 01 00 	lea    rcx,[rsp+0x1e0]
 140a42d:	00 
 140a42e:	48 89 01             	mov    QWORD PTR [rcx],rax
 140a431:	48 8d 05 d6 7e 75 ff 	lea    rax,[rip+0xffffffffff757ed6]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 140a438:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 140a43c:	48 8d 05 ef 48 00 00 	lea    rax,[rip+0x48ef]        # 140ed32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2542b6>
 140a443:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140a447:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
 140a44e:	00 
 140a44f:	48 89 df             	mov    rdi,rbx
 140a452:	e8 f3 48 00 00       	call   140ed4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2542ce>
 140a457:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
 140a45e:	00 
 140a45f:	e8 1c 4a 00 00       	call   140ee80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254404>
 140a464:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 140a46b:	00 
 140a46c:	e8 b7 12 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140a471:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 140a478:	00 
 140a479:	e8 aa 12 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140a47e:	48 8d 35 e5 3e f6 fe 	lea    rsi,[rip+0xfffffffffef63ee5]        # 36e36a <_ZTSSt12bad_any_cast@@Base-0x21e5e>
 140a485:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 140a48c:	00 
 140a48d:	e8 ec f5 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140a492:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
 140a497:	48 8d 94 24 f0 00 00 	lea    rdx,[rsp+0xf0]
 140a49e:	00 
 140a49f:	48 89 1a             	mov    QWORD PTR [rdx],rbx
 140a4a2:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
 140a4a9:	00 
 140a4aa:	4c 89 e7             	mov    rdi,r12
--
 140a51c:	48 83 c7 08          	add    rdi,0x8
 140a520:	e8 c9 3c 00 00       	call   140e1ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253772>
 140a525:	4c 89 ef             	mov    rdi,r13
 140a528:	48 83 c7 08          	add    rdi,0x8
 140a52c:	e8 9d d3 00 00       	call   14178ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ce52>
 140a531:	48 89 df             	mov    rdi,rbx
 140a534:	48 83 c7 08          	add    rdi,0x8
 140a538:	e8 cb 32 00 00       	call   140d808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252d8c>
 140a53d:	bf b0 00 00 00       	mov    edi,0xb0
 140a542:	e8 b9 39 3e 00       	call   17edf00 <_Znwm@plt>
 140a547:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 140a54c:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 140a550:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
 140a554:	4c 89 60 20          	mov    QWORD PTR [rax+0x20],r12
 140a558:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 140a55d:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
 140a561:	4c 89 70 30          	mov    QWORD PTR [rax+0x30],r14
 140a565:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
 140a56a:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
 140a56e:	4c 89 68 40          	mov    QWORD PTR [rax+0x40],r13
 140a572:	48 89 58 48          	mov    QWORD PTR [rax+0x48],rbx
 140a576:	48 8d 0d 33 60 46 00 	lea    rcx,[rip+0x466033]        # 18705b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2cc98>
 140a57d:	48 89 08             	mov    QWORD PTR [rax],rcx
 140a580:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 140a585:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 140a589:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 140a58e:	0f b6 4e 16          	movzx  ecx,BYTE PTR [rsi+0x16]
 140a592:	48 83 60 50 00       	and    QWORD PTR [rax+0x50],0x0
 140a597:	31 d2                	xor    edx,edx
 140a599:	88 50 58             	mov    BYTE PTR [rax+0x58],dl
 140a59c:	88 50 60             	mov    BYTE PTR [rax+0x60],dl
 140a59f:	89 48 68             	mov    DWORD PTR [rax+0x68],ecx
 140a5a2:	89 48 6c             	mov    DWORD PTR [rax+0x6c],ecx
 140a5a5:	0f b6 4e 14          	movzx  ecx,BYTE PTR [rsi+0x14]
 140a5a9:	48 83 60 70 00       	and    QWORD PTR [rax+0x70],0x0
 140a5ae:	88 50 78             	mov    BYTE PTR [rax+0x78],dl
 140a5b1:	88 90 80 00 00 00    	mov    BYTE PTR [rax+0x80],dl
 140a5b7:	89 88 88 00 00 00    	mov    DWORD PTR [rax+0x88],ecx
 140a5bd:	89 88 8c 00 00 00    	mov    DWORD PTR [rax+0x8c],ecx
 140a5c3:	0f b6 4e 15          	movzx  ecx,BYTE PTR [rsi+0x15]
 140a5c7:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
 140a5ce:	00 
 140a5cf:	88 90 98 00 00 00    	mov    BYTE PTR [rax+0x98],dl
 140a5d5:	88 90 a0 00 00 00    	mov    BYTE PTR [rax+0xa0],dl
 140a5db:	89 88 a8 00 00 00    	mov    DWORD PTR [rax+0xa8],ecx
 140a5e1:	89 88 ac 00 00 00    	mov    DWORD PTR [rax+0xac],ecx
 140a5e7:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
 140a5ec:	48 89 01             	mov    QWORD PTR [rcx],rax
 140a5ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140a5f6:	00 00 
--
 140aa58:	75 d0                	jne    140aa2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ffae>
 140aa5a:	eb 03                	jmp    140aa5f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ffe3>
 140aa5c:	49 89 c8             	mov    r8,rcx
 140aa5f:	4c 89 46 08          	mov    QWORD PTR [rsi+0x8],r8
 140aa63:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 140aa66:	4c 89 07             	mov    QWORD PTR [rdi],r8
 140aa69:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 140aa6d:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 140aa71:	48 8b 4e 10          	mov    rcx,QWORD PTR [rsi+0x10]
 140aa75:	48 89 4f 08          	mov    QWORD PTR [rdi+0x8],rcx
 140aa79:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
 140aa7d:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 140aa81:	48 8b 4e 18          	mov    rcx,QWORD PTR [rsi+0x18]
 140aa85:	48 89 4f 10          	mov    QWORD PTR [rdi+0x10],rcx
 140aa89:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 140aa8d:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
 140aa91:	48 89 06             	mov    QWORD PTR [rsi],rax
 140aa94:	c3                   	ret
 140aa95:	cc                   	int3
 140aa96:	41 56                	push   r14
 140aa98:	53                   	push   rbx
 140aa99:	50                   	push   rax
 140aa9a:	48 89 fb             	mov    rbx,rdi
 140aa9d:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
 140aaa1:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 140aaa5:	4c 39 f7             	cmp    rdi,r14
 140aaa8:	74 13                	je     140aabd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250041>
 140aaaa:	48 83 c7 e0          	add    rdi,0xffffffffffffffe0
 140aaae:	48 89 7b 10          	mov    QWORD PTR [rbx+0x10],rdi
 140aab2:	e8 71 f3 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 140aab7:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 140aabb:	eb e8                	jmp    140aaa5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250029>
 140aabd:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 140aac0:	48 83 c4 08          	add    rsp,0x8
 140aac4:	48 85 ff             	test   rdi,rdi
 140aac7:	74 08                	je     140aad1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250055>
 140aac9:	5b                   	pop    rbx
 140aaca:	41 5e                	pop    r14
 140aacc:	e9 4f 34 3e 00       	jmp    17edf20 <_ZdlPv@plt>
--
 140aadc:	53                   	push   rbx
 140aadd:	48 89 fb             	mov    rbx,rdi
 140aae0:	e8 2b 00 00 00       	call   140ab10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250094>
 140aae5:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 140aae8:	5b                   	pop    rbx
 140aae9:	e9 32 34 3e 00       	jmp    17edf20 <_ZdlPv@plt>
 140aaee:	c3                   	ret
 140aaef:	cc                   	int3
 140aaf0:	53                   	push   rbx
 140aaf1:	48 89 fb             	mov    rbx,rdi
 140aaf4:	48 83 c7 20          	add    rdi,0x20
 140aaf8:	e8 69 22 6a ff       	call   aacd66 <JNI_OnUnload@@Base+0x34633>
 140aafd:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 140ab01:	e8 b0 eb ff ff       	call   14096b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec3a>
 140ab06:	48 89 df             	mov    rdi,rbx
 140ab09:	5b                   	pop    rbx
 140ab0a:	e9 2b 97 8c ff       	jmp    cd423a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2211da>
 140ab0f:	cc                   	int3
 140ab10:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
 140ab13:	e9 00 00 00 00       	jmp    140ab18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25009c>
 140ab18:	41 57                	push   r15
 140ab1a:	41 56                	push   r14
 140ab1c:	53                   	push   rbx
 140ab1d:	48 89 f3             	mov    rbx,rsi
 140ab20:	49 89 fe             	mov    r14,rdi
 140ab23:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
 140ab27:	49 39 f7             	cmp    r15,rsi
 140ab2a:	74 11                	je     140ab3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2500c1>
 140ab2c:	49 83 c7 e0          	add    r15,0xffffffffffffffe0
 140ab30:	4c 89 ff             	mov    rdi,r15
 140ab33:	e8 f0 f2 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 140ab38:	49 39 df             	cmp    r15,rbx
 140ab3b:	75 ef                	jne    140ab2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2500b0>
 140ab3d:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
 140ab41:	5b                   	pop    rbx
 140ab42:	41 5e                	pop    r14
 140ab44:	41 5f                	pop    r15
--
 140ab76:	00 
 140ab77:	48 8d bc 24 08 02 00 	lea    rdi,[rsp+0x208]
 140ab7e:	00 
 140ab7f:	e8 72 24 00 00       	call   140cff6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25257a>
 140ab84:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
 140ab89:	48 8d b3 90 00 00 00 	lea    rsi,[rbx+0x90]
 140ab90:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140ab97:	00 
 140ab98:	e8 eb ee 8c ff       	call   cd9a88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226a28>
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
 140abf7:	45 8b 75 00          	mov    r14d,DWORD PTR [r13+0x0]
 140abfb:	41 8b 5d 04          	mov    ebx,DWORD PTR [r13+0x4]
 140abff:	bf b8 00 00 00       	mov    edi,0xb8
 140ac04:	e8 f7 32 3e 00       	call   17edf00 <_Znwm@plt>
 140ac09:	49 89 c4             	mov    r12,rax
 140ac0c:	48 c1 e3 20          	shl    rbx,0x20
 140ac10:	4c 09 f3             	or     rbx,r14
 140ac13:	48 b8 ff ff ff ff ff 	movabs rax,0xffffffffffff
 140ac1a:	ff 00 00 
 140ac1d:	48 21 d8             	and    rax,rbx
 140ac20:	48 8d 8c 24 40 02 00 	lea    rcx,[rsp+0x240]
 140ac27:	00 
 140ac28:	48 89 01             	mov    QWORD PTR [rcx],rax
 140ac2b:	48 8d 05 32 18 67 ff 	lea    rax,[rip+0xffffffffff671832]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 140ac32:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 140ac36:	48 8d 05 e9 23 00 00 	lea    rax,[rip+0x23e9]        # 140d026 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2525aa>
 140ac3d:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140ac41:	48 8d b4 24 60 04 00 	lea    rsi,[rsp+0x460]
 140ac48:	00 
 140ac49:	4c 89 e7             	mov    rdi,r12
 140ac4c:	4c 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],r13
 140ac51:	4c 89 ea             	mov    rdx,r13
 140ac54:	e8 df 23 00 00       	call   140d038 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2525bc>
 140ac59:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140ac60:	00 
 140ac61:	e8 08 25 00 00       	call   140d16e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2526f2>
 140ac66:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
 140ac6d:	00 
 140ac6e:	e8 b5 0a 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140ac73:	4c 8b b4 24 08 02 00 	mov    r14,QWORD PTR [rsp+0x208]
 140ac7a:	00 
 140ac7b:	48 8d 35 c2 cd f5 fe 	lea    rsi,[rip+0xfffffffffef5cdc2]        # 367a44 <_ZTSSt12bad_any_cast@@Base-0x28784>
 140ac82:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 140ac89:	00 
 140ac8a:	e8 ef ed 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140ac8f:	48 8d 94 24 e8 01 00 	lea    rdx,[rsp+0x1e8]
 140ac96:	00 
 140ac97:	4c 89 22             	mov    QWORD PTR [rdx],r12
 140ac9a:	49 83 c6 08          	add    r14,0x8
 140ac9e:	48 8d b4 24 f0 01 00 	lea    rsi,[rsp+0x1f0]
 140aca5:	00 
 140aca6:	4c 89 f7             	mov    rdi,r14
 140aca9:	e8 e6 24 00 00       	call   140d194 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252718>
 140acae:	48 8b bc 24 e8 01 00 	mov    rdi,QWORD PTR [rsp+0x1e8]
 140acb5:	00 
--
 140acc7:	ff 50 08             	call   QWORD PTR [rax+0x8]
 140acca:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 140acd1:	00 
 140acd2:	e8 b9 31 3e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 140acd7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 140acdc:	48 8d b0 c8 01 00 00 	lea    rsi,[rax+0x1c8]
 140ace3:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140acea:	00 
 140aceb:	e8 98 ed 8c ff       	call   cd9a88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226a28>
 140acf0:	48 8d 05 9d 3a f7 fe 	lea    rax,[rip+0xfffffffffef73a9d]        # 37e794 <_ZTSSt12bad_any_cast@@Base-0x11a34>
 140acf7:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140acfe:	00 
 140acff:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
 140ad03:	48 c7 47 20 06 00 00 	mov    QWORD PTR [rdi+0x20],0x6
 140ad0a:	00 
 140ad0b:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
 140ad0e:	0f 29 84 24 e0 03 00 	movaps XMMWORD PTR [rsp+0x3e0],xmm0
 140ad15:	00 
 140ad16:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 140ad1a:	48 89 84 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],rax
 140ad21:	00 
 140ad22:	0f 57 c0             	xorps  xmm0,xmm0
 140ad25:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
 140ad28:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 140ad2d:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
 140ad31:	48 89 84 24 f8 03 00 	mov    QWORD PTR [rsp+0x3f8],rax
 140ad38:	00 
 140ad39:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
 140ad3d:	48 89 84 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rax
 140ad44:	00 
 140ad45:	e8 de 09 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140ad4a:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
 140ad4e:	48 8b 59 08          	mov    rbx,QWORD PTR [rcx+0x8]
 140ad52:	48 8b 41 30          	mov    rax,QWORD PTR [rcx+0x30]
 140ad56:	48 89 84 24 82 04 00 	mov    QWORD PTR [rsp+0x482],rax
 140ad5d:	00 
 140ad5e:	0f 10 41 20          	movups xmm0,XMMWORD PTR [rcx+0x20]
 140ad62:	0f 11 84 24 72 04 00 	movups XMMWORD PTR [rsp+0x472],xmm0
 140ad69:	00 
 140ad6a:	0f 10 41 10          	movups xmm0,XMMWORD PTR [rcx+0x10]
 140ad6e:	0f 11 84 24 62 04 00 	movups XMMWORD PTR [rsp+0x462],xmm0
 140ad75:	00 
 140ad76:	bf b8 00 00 00       	mov    edi,0xb8
 140ad7b:	e8 80 31 3e 00       	call   17edf00 <_Znwm@plt>
 140ad80:	48 89 c5             	mov    rbp,rax
 140ad83:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 140ad88:	48 83 a4 24 28 05 00 	and    QWORD PTR [rsp+0x528],0x0
 140ad8f:	00 00 
 140ad91:	48 83 a4 24 38 05 00 	and    QWORD PTR [rsp+0x538],0x0
 140ad98:	00 00 
 140ad9a:	6a 38                	push   0x38
 140ad9c:	5f                   	pop    rdi
 140ad9d:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 140ada2:	e8 59 31 3e 00       	call   17edf00 <_Znwm@plt>
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
 140ae00:	48 8d 05 19 25 00 00 	lea    rax,[rip+0x2519]        # 140d320 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2528a4>
 140ae07:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 140ae0b:	48 8d 05 26 4b 46 00 	lea    rax,[rip+0x464b26]        # 186f938 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c020>
 140ae12:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 140ae16:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
 140ae1d:	00 
 140ae1e:	e8 3f 27 00 00       	call   140d562 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252ae6>
 140ae23:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140ae2a:	00 
 140ae2b:	48 8d b4 24 e0 03 00 	lea    rsi,[rsp+0x3e0]
 140ae32:	00 
 140ae33:	4c 89 f2             	mov    rdx,r14
 140ae36:	e8 6f 27 00 00       	call   140d5aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252b2e>
 140ae3b:	48 8d 5d 08          	lea    rbx,[rbp+0x8]
 140ae3f:	4c 8d a4 24 40 02 00 	lea    r12,[rsp+0x240]
 140ae46:	00 
 140ae47:	48 89 df             	mov    rdi,rbx
 140ae4a:	4c 89 e6             	mov    rsi,r12
 140ae4d:	e8 14 29 00 00       	call   140d766 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252cea>
 140ae52:	4c 89 e7             	mov    rdi,r12
 140ae55:	e8 94 29 00 00       	call   140d7ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252d72>
 140ae5a:	48 83 a5 80 00 00 00 	and    QWORD PTR [rbp+0x80],0x0
 140ae61:	00 
 140ae62:	4c 8d a5 88 00 00 00 	lea    r12,[rbp+0x88]
 140ae69:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
 140ae70:	00 
--
 140af48:	48 8d 05 89 1d 03 ff 	lea    rax,[rip+0xffffffffff031d89]        # 43ccd8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x28e4>
 140af4f:	48 89 84 24 58 02 00 	mov    QWORD PTR [rsp+0x258],rax
 140af56:	00 
 140af57:	48 c7 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],0x8
 140af5e:	00 08 00 00 00 
 140af63:	48 8d b3 b0 01 00 00 	lea    rsi,[rbx+0x1b0]
 140af6a:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
 140af71:	00 
 140af72:	e8 11 eb 8c ff       	call   cd9a88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226a28>
 140af77:	48 8d 05 27 5a f5 fe 	lea    rax,[rip+0xfffffffffef55a27]        # 3609a5 <_ZTSSt12bad_any_cast@@Base-0x2f823>
 140af7e:	48 8d 9c 24 60 04 00 	lea    rbx,[rsp+0x460]
 140af85:	00 
 140af86:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 140af8a:	48 c7 43 20 08 00 00 	mov    QWORD PTR [rbx+0x20],0x8
 140af91:	00 
 140af92:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
 140af99:	00 
 140af9a:	4c 8d a4 24 40 02 00 	lea    r12,[rsp+0x240]
 140afa1:	00 
 140afa2:	4c 89 e6             	mov    rsi,r12
 140afa5:	48 89 da             	mov    rdx,rbx
 140afa8:	e8 35 29 00 00       	call   140d8e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252e66>
 140afad:	48 89 df             	mov    rdi,rbx
 140afb0:	e8 73 07 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140afb5:	4c 89 e7             	mov    rdi,r12
 140afb8:	e8 6b 07 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140afbd:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 140afc1:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
 140afc5:	bf 30 01 00 00       	mov    edi,0x130
 140afca:	e8 31 2f 3e 00       	call   17edf00 <_Znwm@plt>
 140afcf:	48 89 c5             	mov    rbp,rax
 140afd2:	48 8d b4 24 28 05 00 	lea    rsi,[rsp+0x528]
 140afd9:	00 
 140afda:	48 89 1e             	mov    QWORD PTR [rsi],rbx
 140afdd:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
 140afe2:	41 8b 06             	mov    eax,DWORD PTR [r14]
 140afe5:	89 46 08             	mov    DWORD PTR [rsi+0x8],eax
 140afe8:	41 0f b7 46 04       	movzx  eax,WORD PTR [r14+0x4]
 140afed:	66 89 46 0c          	mov    WORD PTR [rsi+0xc],ax
 140aff1:	48 8d 05 4c 2c 6d ff 	lea    rax,[rip+0xffffffffff6d2c4c]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
 140aff8:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
 140affc:	48 8d 05 05 29 00 00 	lea    rax,[rip+0x2905]        # 140d908 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252e8c>
 140b003:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 140b007:	48 8d 05 d2 49 46 00 	lea    rax,[rip+0x4649d2]        # 186f9e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c0c8>
 140b00e:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 140b012:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
 140b019:	00 
 140b01a:	e8 6b 2a 00 00       	call   140da8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25300e>
 140b01f:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140b026:	00 
 140b027:	48 8d b4 24 e0 03 00 	lea    rsi,[rsp+0x3e0]
 140b02e:	00 
 140b02f:	4c 89 f2             	mov    rdx,r14
 140b032:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
 140b037:	e8 6e 25 00 00       	call   140d5aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252b2e>
 140b03c:	48 8d b4 24 08 04 00 	lea    rsi,[rsp+0x408]
 140b043:	00 
 140b044:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
 140b04b:	00 
 140b04c:	4c 89 f2             	mov    rdx,r14
 140b04f:	e8 56 25 00 00       	call   140d5aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252b2e>
 140b054:	48 8d 5d 08          	lea    rbx,[rbp+0x8]
 140b058:	4c 8d a4 24 40 02 00 	lea    r12,[rsp+0x240]
 140b05f:	00 
 140b060:	4c 8d ac 24 60 04 00 	lea    r13,[rsp+0x460]
 140b067:	00 
 140b068:	48 89 df             	mov    rdi,rbx
--
 140b1e2:	31 c9                	xor    ecx,ecx
 140b1e4:	48 09 c2             	or     rdx,rax
 140b1e7:	0f 95 c1             	setne  cl
 140b1ea:	0f b6 d3             	movzx  edx,bl
 140b1ed:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
 140b1f4:	00 
 140b1f5:	e8 24 2a 00 00       	call   140dc1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2531a2>
 140b1fa:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
 140b1fe:	49 8d 6e 10          	lea    rbp,[r14+0x10]
 140b202:	48 8d 05 f5 60 f7 fe 	lea    rax,[rip+0xfffffffffef760f5]        # 3812fe <_ZTSSt12bad_any_cast@@Base-0xeeca>
 140b209:	48 8d 9c 24 60 03 00 	lea    rbx,[rsp+0x360]
 140b210:	00 
 140b211:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 140b215:	48 c7 43 20 0e 00 00 	mov    QWORD PTR [rbx+0x20],0xe
 140b21c:	00 
 140b21d:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140b224:	00 
 140b225:	4c 8d a4 24 60 04 00 	lea    r12,[rsp+0x460]
 140b22c:	00 
 140b22d:	4c 8d ac 24 e0 03 00 	lea    r13,[rsp+0x3e0]
 140b234:	00 
 140b235:	4c 89 e6             	mov    rsi,r12
 140b238:	4c 89 ea             	mov    rdx,r13
 140b23b:	48 89 d9             	mov    rcx,rbx
 140b23e:	e8 b1 2a 00 00       	call   140dcf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253278>
 140b243:	48 89 df             	mov    rdi,rbx
 140b246:	e8 dd 04 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140b24b:	4c 89 ef             	mov    rdi,r13
 140b24e:	e8 d5 04 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140b253:	4c 89 e7             	mov    rdi,r12
 140b256:	e8 cd 04 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140b25b:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
 140b25f:	48 8b 58 28          	mov    rbx,QWORD PTR [rax+0x28]
 140b263:	4c 8b 70 10          	mov    r14,QWORD PTR [rax+0x10]
 140b267:	4c 8b 78 20          	mov    r15,QWORD PTR [rax+0x20]
 140b26b:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
 140b26f:	49 89 44 24 22       	mov    QWORD PTR [r12+0x22],rax
--
 140b292:	e8 69 2c 3e 00       	call   17edf00 <_Znwm@plt>
 140b297:	48 89 c5             	mov    rbp,rax
 140b29a:	48 83 a4 24 e0 03 00 	and    QWORD PTR [rsp+0x3e0],0x0
 140b2a1:	00 00 
 140b2a3:	48 83 a4 24 f0 03 00 	and    QWORD PTR [rsp+0x3f0],0x0
 140b2aa:	00 00 
 140b2ac:	6a 48                	push   0x48
 140b2ae:	5f                   	pop    rdi
 140b2af:	e8 4c 2c 3e 00       	call   17edf00 <_Znwm@plt>
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
 140b30d:	48 8d 05 14 2a 00 00 	lea    rax,[rip+0x2a14]        # 140dd28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2532ac>
 140b314:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140b318:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
 140b31f:	00 
 140b320:	48 89 ef             	mov    rdi,rbp
 140b323:	4c 89 fa             	mov    rdx,r15
 140b326:	e8 21 2a 00 00       	call   140dd4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2532d0>
 140b32b:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
 140b332:	00 
 140b333:	e8 00 2c 00 00       	call   140df38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2534bc>
 140b338:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140b33f:	00 
 140b340:	e8 19 2c 00 00       	call   140df5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2534e2>
 140b345:	48 8d 35 47 89 f5 fe 	lea    rsi,[rip+0xfffffffffef58947]        # 363c93 <_ZTSSt12bad_any_cast@@Base-0x2c535>
 140b34c:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
 140b353:	00 
 140b354:	e8 25 e7 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140b359:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 140b35e:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
 140b363:	48 8d 94 24 88 01 00 	lea    rdx,[rsp+0x188]
 140b36a:	00 
 140b36b:	48 89 2a             	mov    QWORD PTR [rdx],rbp
 140b36e:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
 140b375:	00 
 140b376:	e8 19 1e 00 00       	call   140d194 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252718>
 140b37b:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
--
 140b391:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 140b394:	ff 50 08             	call   QWORD PTR [rax+0x8]
 140b397:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
 140b39e:	00 
 140b39f:	e8 ec 2a 3e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 140b3a4:	48 8d b3 a8 00 00 00 	lea    rsi,[rbx+0xa8]
 140b3ab:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140b3b2:	00 
 140b3b3:	e8 d0 e6 8c ff       	call   cd9a88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226a28>
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
 140b410:	e8 13 03 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140b415:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 140b419:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
 140b41d:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
 140b422:	48 8b 41 20          	mov    rax,QWORD PTR [rcx+0x20]
 140b426:	48 89 43 22          	mov    QWORD PTR [rbx+0x22],rax
 140b42a:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
 140b42d:	0f 10 49 10          	movups xmm1,XMMWORD PTR [rcx+0x10]
 140b431:	0f 11 4b 12          	movups XMMWORD PTR [rbx+0x12],xmm1
 140b435:	0f 11 43 02          	movups XMMWORD PTR [rbx+0x2],xmm0
 140b439:	bf b8 00 00 00       	mov    edi,0xb8
 140b43e:	e8 bd 2a 3e 00       	call   17edf00 <_Znwm@plt>
 140b443:	49 89 c4             	mov    r12,rax
 140b446:	48 83 a4 24 e0 03 00 	and    QWORD PTR [rsp+0x3e0],0x0
 140b44d:	00 00 
 140b44f:	48 83 a4 24 f0 03 00 	and    QWORD PTR [rsp+0x3f0],0x0
 140b456:	00 00 
 140b458:	6a 38                	push   0x38
--
 140b481:	00 
 140b482:	0f 10 94 24 5a 02 00 	movups xmm2,XMMWORD PTR [rsp+0x25a]
 140b489:	00 
 140b48a:	0f 11 40 0e          	movups XMMWORD PTR [rax+0xe],xmm0
 140b48e:	0f 11 48 1e          	movups XMMWORD PTR [rax+0x1e],xmm1
 140b492:	0f 11 50 28          	movups XMMWORD PTR [rax+0x28],xmm2
 140b496:	48 8d 8c 24 e0 03 00 	lea    rcx,[rsp+0x3e0]
 140b49d:	00 
 140b49e:	48 89 01             	mov    QWORD PTR [rcx],rax
 140b4a1:	48 8d 05 66 6e 75 ff 	lea    rax,[rip+0xffffffffff756e66]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 140b4a8:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 140b4ac:	48 8d 05 cb 2a 00 00 	lea    rax,[rip+0x2acb]        # 140df7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253502>
 140b4b3:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140b4b7:	48 8d b4 24 60 04 00 	lea    rsi,[rsp+0x460]
 140b4be:	00 
 140b4bf:	4c 89 e7             	mov    rdi,r12
 140b4c2:	4c 89 fa             	mov    rdx,r15
 140b4c5:	e8 d2 2a 00 00       	call   140df9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253520>
 140b4ca:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
 140b4d1:	00 
 140b4d2:	e8 fb 2b 00 00       	call   140e0d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253656>
 140b4d7:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
 140b4de:	00 
 140b4df:	e8 44 02 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140b4e4:	48 8d 35 68 3c f7 fe 	lea    rsi,[rip+0xfffffffffef73c68]        # 37f153 <_ZTSSt12bad_any_cast@@Base-0x11075>
 140b4eb:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
 140b4f2:	00 
 140b4f3:	e8 86 e5 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140b4f8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 140b4fd:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
 140b502:	48 8d 94 24 68 01 00 	lea    rdx,[rsp+0x168]
 140b509:	00 
 140b50a:	4c 89 22             	mov    QWORD PTR [rdx],r12
 140b50d:	48 8d b4 24 70 01 00 	lea    rsi,[rsp+0x170]
 140b514:	00 
 140b515:	e8 7a 1c 00 00       	call   140d194 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252718>
 140b51a:	48 8b bc 24 68 01 00 	mov    rdi,QWORD PTR [rsp+0x168]
--
 140b58b:	48 8d 05 b7 c4 f5 fe 	lea    rax,[rip+0xfffffffffef5c4b7]        # 367a49 <_ZTSSt12bad_any_cast@@Base-0x2877f>
 140b592:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
 140b599:	00 
 140b59a:	48 c7 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],0x8
 140b5a1:	00 08 00 00 00 
 140b5a6:	48 8d b3 f0 00 00 00 	lea    rsi,[rbx+0xf0]
 140b5ad:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
 140b5b4:	00 
 140b5b5:	e8 ce e4 8c ff       	call   cd9a88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226a28>
 140b5ba:	48 8d 05 2a a0 f1 fe 	lea    rax,[rip+0xfffffffffef1a02a]        # 3255eb <_ZTSSt12bad_any_cast@@Base-0x6abdd>
 140b5c1:	48 8d 9c 24 e0 03 00 	lea    rbx,[rsp+0x3e0]
 140b5c8:	00 
 140b5c9:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 140b5cd:	48 c7 43 20 09 00 00 	mov    QWORD PTR [rbx+0x20],0x9
 140b5d4:	00 
 140b5d5:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
 140b5dc:	00 
 140b5dd:	4c 8d a4 24 40 02 00 	lea    r12,[rsp+0x240]
 140b5e4:	00 
 140b5e5:	4c 8d ac 24 60 04 00 	lea    r13,[rsp+0x460]
 140b5ec:	00 
 140b5ed:	4c 89 e6             	mov    rsi,r12
 140b5f0:	4c 89 ea             	mov    rdx,r13
 140b5f3:	48 89 d9             	mov    rcx,rbx
 140b5f6:	e8 f9 26 00 00       	call   140dcf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253278>
 140b5fb:	48 89 df             	mov    rdi,rbx
 140b5fe:	e8 25 01 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140b603:	4c 89 ef             	mov    rdi,r13
 140b606:	e8 1d 01 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140b60b:	4c 89 e7             	mov    rdi,r12
 140b60e:	e8 15 01 67 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140b613:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 140b617:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
 140b61b:	bf a8 01 00 00       	mov    edi,0x1a8
 140b620:	e8 db 28 3e 00       	call   17edf00 <_Znwm@plt>
 140b625:	48 89 c3             	mov    rbx,rax
 140b628:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
 140b62d:	48 8d b4 24 00 05 00 	lea    rsi,[rsp+0x500]
 140b634:	00 
 140b635:	4c 89 36             	mov    QWORD PTR [rsi],r14
 140b638:	41 8b 07             	mov    eax,DWORD PTR [r15]
 140b63b:	89 46 08             	mov    DWORD PTR [rsi+0x8],eax
 140b63e:	41 0f b7 47 04       	movzx  eax,WORD PTR [r15+0x4]
 140b643:	66 89 46 0c          	mov    WORD PTR [rsi+0xc],ax
 140b647:	48 8d 05 f6 25 6d ff 	lea    rax,[rip+0xffffffffff6d25f6]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
 140b64e:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
 140b652:	48 8d 05 9f 2a 00 00 	lea    rax,[rip+0x2a9f]        # 140e0f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25367c>
 140b659:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 140b65d:	48 8d 05 84 45 46 00 	lea    rax,[rip+0x464584]        # 186fbe8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c2d0>
 140b664:	48 89 03             	mov    QWORD PTR [rbx],rax
 140b667:	48 8d bc 24 28 05 00 	lea    rdi,[rsp+0x528]
 140b66e:	00 
 140b66f:	e8 fc 2a 00 00       	call   140e170 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2536f4>
 140b674:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140b67b:	00 
 140b67c:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
 140b683:	00 
 140b684:	4c 89 fa             	mov    rdx,r15
 140b687:	e8 1e 1f 00 00       	call   140d5aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252b2e>
 140b68c:	48 8d b4 24 88 03 00 	lea    rsi,[rsp+0x388]
 140b693:	00 
 140b694:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
 140b69b:	00 
 140b69c:	4c 89 fa             	mov    rdx,r15
 140b69f:	e8 06 1f 00 00       	call   140d5aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252b2e>
 140b6a4:	48 89 6c 24 68       	mov    QWORD PTR [rsp+0x68],rbp
 140b6a9:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
 140b6b0:	00 
 140b6b1:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
 140b6b8:	00 
 140b6b9:	4c 89 fa             	mov    rdx,r15
 140b6bc:	e8 e9 1e 00 00       	call   140d5aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252b2e>
--
 140b7ec:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 140b7f3:	00 
 140b7f4:	e8 97 26 3e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 140b7f9:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
 140b800:	00 
 140b801:	48 89 de             	mov    rsi,rbx
 140b804:	e8 7f e2 8c ff       	call   cd9a88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226a28>
 140b809:	48 8d 05 cb bd f3 fe 	lea    rax,[rip+0xfffffffffef3bdcb]        # 3475db <_ZTSSt12bad_any_cast@@Base-0x48bed>
 140b810:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
 140b817:	00 
 140b818:	48 c7 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],0x6
 140b81f:	00 06 00 00 00 
 140b824:	48 8d 73 18          	lea    rsi,[rbx+0x18]
 140b828:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
 140b82f:	00 
 140b830:	e8 53 e2 8c ff       	call   cd9a88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226a28>
 140b835:	48 8d 05 55 51 f4 fe 	lea    rax,[rip+0xfffffffffef45155]        # 350991 <_ZTSSt12bad_any_cast@@Base-0x3f837>
 140b83c:	48 8d 9c 24 e0 03 00 	lea    rbx,[rsp+0x3e0]
 140b843:	00 
 140b844:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 140b848:	48 c7 43 20 09 00 00 	mov    QWORD PTR [rbx+0x20],0x9
 140b84f:	00 
 140b850:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140b857:	00 
 140b858:	4c 8d b4 24 60 04 00 	lea    r14,[rsp+0x460]
 140b85f:	00 
 140b860:	4c 89 f6             	mov    rsi,r14
 140b863:	48 89 da             	mov    rdx,rbx
 140b866:	e8 77 20 00 00       	call   140d8e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252e66>
 140b86b:	48 89 df             	mov    rdi,rbx
 140b86e:	e8 b5 fe 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140b873:	4c 89 f7             	mov    rdi,r14
 140b876:	e8 ad fe 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140b87b:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 140b87f:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 140b883:	48 8b 58 28          	mov    rbx,QWORD PTR [rax+0x28]
 140b887:	bf 30 01 00 00       	mov    edi,0x130
 140b88c:	e8 6f 26 3e 00       	call   17edf00 <_Znwm@plt>
 140b891:	49 89 c4             	mov    r12,rax
 140b894:	48 8d 8c 24 60 04 00 	lea    rcx,[rsp+0x460]
 140b89b:	00 
 140b89c:	48 89 19             	mov    QWORD PTR [rcx],rbx
 140b89f:	41 8b 07             	mov    eax,DWORD PTR [r15]
 140b8a2:	89 41 08             	mov    DWORD PTR [rcx+0x8],eax
 140b8a5:	41 0f b7 47 04       	movzx  eax,WORD PTR [r15+0x4]
 140b8aa:	66 89 41 0c          	mov    WORD PTR [rcx+0xc],ax
 140b8ae:	48 8d 05 8f 23 6d ff 	lea    rax,[rip+0xffffffffff6d238f]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
 140b8b5:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 140b8b9:	48 8d 05 4a 2a 00 00 	lea    rax,[rip+0x2a4a]        # 140e30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25388e>
 140b8c0:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140b8c4:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
 140b8cb:	00 
 140b8cc:	4c 89 e7             	mov    rdi,r12
 140b8cf:	4c 89 fa             	mov    rdx,r15
 140b8d2:	e8 4b 2a 00 00       	call   140e322 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2538a6>
 140b8d7:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
 140b8dc:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
 140b8e3:	00 
 140b8e4:	e8 bf 2b 00 00       	call   140e4a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a2c>
 140b8e9:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140b8f0:	00 
 140b8f1:	e8 12 23 00 00       	call   140dc08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25318c>
 140b8f6:	48 8d 35 8a b5 f4 fe 	lea    rsi,[rip+0xfffffffffef4b58a]        # 356e87 <_ZTSSt12bad_any_cast@@Base-0x39341>
 140b8fd:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
 140b904:	00 
 140b905:	e8 74 e1 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140b90a:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
 140b90f:	48 8d 94 24 28 01 00 	lea    rdx,[rsp+0x128]
 140b916:	00 
 140b917:	4c 89 22             	mov    QWORD PTR [rdx],r12
 140b91a:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
 140b921:	00 
 140b922:	48 89 df             	mov    rdi,rbx
 140b925:	e8 6a 18 00 00       	call   140d194 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252718>
--
 140b9ac:	00 09 00 00 00 
 140b9b1:	49 8d b6 38 01 00 00 	lea    rsi,[r14+0x138]
 140b9b8:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
 140b9bf:	00 
 140b9c0:	e8 bf db 8c ff       	call   cd9584 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226524>
 140b9c5:	48 8d 84 24 58 02 00 	lea    rax,[rsp+0x258]
 140b9cc:	00 
 140b9cd:	48 8d 8c 24 78 04 00 	lea    rcx,[rsp+0x478]
 140b9d4:	00 
 140b9d5:	48 8d 15 b2 b4 f4 fe 	lea    rdx,[rip+0xfffffffffef4b4b2]        # 356e8e <_ZTSSt12bad_any_cast@@Base-0x3933a>
 140b9dc:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
 140b9e3:	00 
 140b9e4:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx
 140b9e8:	48 c7 47 20 06 00 00 	mov    QWORD PTR [rdi+0x20],0x6
 140b9ef:	00 
 140b9f0:	0f 28 40 e8          	movaps xmm0,XMMWORD PTR [rax-0x18]
 140b9f4:	0f 29 84 24 60 03 00 	movaps XMMWORD PTR [rsp+0x360],xmm0
 140b9fb:	00 
 140b9fc:	48 8b 50 f8          	mov    rdx,QWORD PTR [rax-0x8]
 140ba00:	48 89 94 24 70 03 00 	mov    QWORD PTR [rsp+0x370],rdx
 140ba07:	00 
 140ba08:	48 83 60 f8 00       	and    QWORD PTR [rax-0x8],0x0
 140ba0d:	0f 57 c0             	xorps  xmm0,xmm0
 140ba10:	0f 29 40 e8          	movaps XMMWORD PTR [rax-0x18],xmm0
 140ba14:	0f 10 08             	movups xmm1,XMMWORD PTR [rax]
 140ba17:	0f 11 8c 24 78 03 00 	movups XMMWORD PTR [rsp+0x378],xmm1
 140ba1e:	00 
 140ba1f:	0f 28 49 e8          	movaps xmm1,XMMWORD PTR [rcx-0x18]
 140ba23:	0f 11 8c 24 88 03 00 	movups XMMWORD PTR [rsp+0x388],xmm1
 140ba2a:	00 
 140ba2b:	48 8b 41 f8          	mov    rax,QWORD PTR [rcx-0x8]
 140ba2f:	48 89 84 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rax
 140ba36:	00 
 140ba37:	0f 29 41 e8          	movaps XMMWORD PTR [rcx-0x18],xmm0
 140ba3b:	48 83 61 f8 00       	and    QWORD PTR [rcx-0x8],0x0
 140ba40:	0f 10 09             	movups xmm1,XMMWORD PTR [rcx]
 140ba43:	0f 29 8c 24 a0 03 00 	movaps XMMWORD PTR [rsp+0x3a0],xmm1
 140ba4a:	00 
 140ba4b:	0f 28 0f             	movaps xmm1,XMMWORD PTR [rdi]
 140ba4e:	0f 29 8c 24 b0 03 00 	movaps XMMWORD PTR [rsp+0x3b0],xmm1
 140ba55:	00 
 140ba56:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 140ba5a:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 140ba5f:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
 140ba66:	00 
 140ba67:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
 140ba6a:	0f 10 47 18          	movups xmm0,XMMWORD PTR [rdi+0x18]
 140ba6e:	0f 11 84 24 c8 03 00 	movups XMMWORD PTR [rsp+0x3c8],xmm0
 140ba75:	00 
 140ba76:	e8 ad fc 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140ba7b:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
 140ba82:	00 
 140ba83:	e8 a0 fc 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140ba88:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140ba8f:	00 
 140ba90:	e8 93 fc 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140ba95:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 140ba99:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 140ba9d:	4c 8b 70 28          	mov    r14,QWORD PTR [rax+0x28]
 140baa1:	bf a8 01 00 00       	mov    edi,0x1a8
 140baa6:	e8 55 24 3e 00       	call   17edf00 <_Znwm@plt>
 140baab:	48 89 c3             	mov    rbx,rax
 140baae:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
 140bab3:	48 8d b4 24 d8 04 00 	lea    rsi,[rsp+0x4d8]
 140baba:	00 
 140babb:	4c 89 36             	mov    QWORD PTR [rsi],r14
 140babe:	41 8b 07             	mov    eax,DWORD PTR [r15]
 140bac1:	89 46 08             	mov    DWORD PTR [rsi+0x8],eax
 140bac4:	41 0f b7 47 04       	movzx  eax,WORD PTR [r15+0x4]
 140bac9:	66 89 46 0c          	mov    WORD PTR [rsi+0xc],ax
 140bacd:	48 8d 05 70 21 6d ff 	lea    rax,[rip+0xffffffffff6d2170]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
 140bad4:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
 140bad8:	48 8d 05 ef 29 00 00 	lea    rax,[rip+0x29ef]        # 140e4ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a52>
 140badf:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 140bae3:	48 8d 05 26 42 46 00 	lea    rax,[rip+0x464226]        # 186fd10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c3f8>
 140baea:	48 89 03             	mov    QWORD PTR [rbx],rax
 140baed:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
 140baf4:	00 
 140baf5:	e8 d2 2a 00 00       	call   140e5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b50>
 140bafa:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140bb01:	00 
 140bb02:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
 140bb09:	00 
 140bb0a:	4c 89 fa             	mov    rdx,r15
 140bb0d:	e8 02 2b 00 00       	call   140e614 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b98>
 140bb12:	48 8d b4 24 88 03 00 	lea    rsi,[rsp+0x388]
 140bb19:	00 
 140bb1a:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
 140bb21:	00 
 140bb22:	4c 89 fa             	mov    rdx,r15
 140bb25:	e8 ea 2a 00 00       	call   140e614 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b98>
 140bb2a:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
 140bb31:	00 
 140bb32:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
 140bb39:	00 
 140bb3a:	e8 45 da 8c ff       	call   cd9584 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226524>
 140bb3f:	4c 89 64 24 60       	mov    QWORD PTR [rsp+0x60],r12
 140bb44:	4c 8d 3d 8d 3f 46 00 	lea    r15,[rip+0x463f8d]        # 186fad8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c1c0>
--
 140bb62:	00 
 140bb63:	4c 89 b4 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],r14
 140bb6a:	00 
 140bb6b:	0f 10 84 24 18 02 00 	movups xmm0,XMMWORD PTR [rsp+0x218]
 140bb72:	00 
 140bb73:	0f 11 84 24 f0 03 00 	movups XMMWORD PTR [rsp+0x3f0],xmm0
 140bb7a:	00 
 140bb7b:	0f 57 c0             	xorps  xmm0,xmm0
 140bb7e:	0f 29 84 24 10 02 00 	movaps XMMWORD PTR [rsp+0x210],xmm0
 140bb85:	00 
 140bb86:	48 83 a4 24 20 02 00 	and    QWORD PTR [rsp+0x220],0x0
 140bb8d:	00 00 
 140bb8f:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 140bb94:	48 8b 00             	mov    rax,QWORD PTR [rax]
 140bb97:	48 89 84 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rax
 140bb9e:	00 
 140bb9f:	0f 11 84 24 08 04 00 	movups XMMWORD PTR [rsp+0x408],xmm0
 140bba6:	00 
 140bba7:	0f 11 84 24 18 04 00 	movups XMMWORD PTR [rsp+0x418],xmm0
 140bbae:	00 
 140bbaf:	48 83 a4 24 28 04 00 	and    QWORD PTR [rsp+0x428],0x0
 140bbb6:	00 00 
 140bbb8:	4d 39 e6             	cmp    r14,r12
 140bbbb:	0f 84 fe 00 00 00    	je     140bcbf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251243>
 140bbc1:	49 8d 6e 18          	lea    rbp,[r14+0x18]
 140bbc5:	4c 39 e5             	cmp    rbp,r12
 140bbc8:	74 75                	je     140bc3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2511c3>
 140bbca:	45 31 ed             	xor    r13d,r13d
 140bbcd:	8b 45 fc             	mov    eax,DWORD PTR [rbp-0x4]
 140bbd0:	39 45 14             	cmp    DWORD PTR [rbp+0x14],eax
 140bbd3:	75 1b                	jne    140bbf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251174>
 140bbd5:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 140bbd9:	48 8b 75 08          	mov    rsi,QWORD PTR [rbp+0x8]
 140bbdd:	48 8b 55 e8          	mov    rdx,QWORD PTR [rbp-0x18]
 140bbe1:	48 8b 4d f0          	mov    rcx,QWORD PTR [rbp-0x10]
 140bbe5:	e8 d6 a4 8b ff       	call   cc60c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213060>
 140bbea:	84 c0                	test   al,al
 140bbec:	74 04                	je     140bbf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251176>
 140bbee:	eb 0d                	jmp    140bbfd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251181>
 140bbf0:	7c 0b                	jl     140bbfd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251181>
 140bbf2:	48 83 c5 18          	add    rbp,0x18
 140bbf6:	4c 39 e5             	cmp    rbp,r12
 140bbf9:	75 d2                	jne    140bbcd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251151>
 140bbfb:	eb 45                	jmp    140bc42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2511c6>
 140bbfd:	4c 39 e5             	cmp    rbp,r12
 140bc00:	74 3d                	je     140bc3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2511c3>
 140bc02:	48 8d 35 73 63 04 ff 	lea    rsi,[rip+0xffffffffff046373]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 140bc09:	48 8d 0d cc d2 f1 fe 	lea    rcx,[rip+0xfffffffffef1d2cc]        # 328edc <_ZTSSt12bad_any_cast@@Base-0x672ec>
 140bc10:	6a 03                	push   0x3
--
 140bd30:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
 140bd35:	4d 89 bc 24 f8 00 00 	mov    QWORD PTR [r12+0xf8],r15
 140bd3c:	00 
 140bd3d:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
 140bd41:	41 0f 11 84 24 00 01 	movups XMMWORD PTR [r12+0x100],xmm0
 140bd48:	00 00 
 140bd4a:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
 140bd4e:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 140bd53:	49 89 84 24 10 01 00 	mov    QWORD PTR [r12+0x110],rax
 140bd5a:	00 
 140bd5b:	0f 57 c9             	xorps  xmm1,xmm1
 140bd5e:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
 140bd62:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 140bd66:	49 89 84 24 18 01 00 	mov    QWORD PTR [r12+0x118],rax
 140bd6d:	00 
 140bd6e:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
 140bd73:	41 0f 11 84 24 20 01 	movups XMMWORD PTR [r12+0x120],xmm0
 140bd7a:	00 00 
 140bd7c:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
 140bd80:	49 89 84 24 30 01 00 	mov    QWORD PTR [r12+0x130],rax
 140bd87:	00 
 140bd88:	48 8d 84 24 08 04 00 	lea    rax,[rsp+0x408]
 140bd8f:	00 
 140bd90:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
 140bd93:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
 140bd98:	41 0f 10 46 38       	movups xmm0,XMMWORD PTR [r14+0x38]
 140bd9d:	41 0f 11 84 24 38 01 	movups XMMWORD PTR [r12+0x138],xmm0
 140bda4:	00 00 
 140bda6:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
 140bdab:	41 0f 10 4e 58       	movups xmm1,XMMWORD PTR [r14+0x58]
 140bdb0:	41 0f 11 84 24 48 01 	movups XMMWORD PTR [r12+0x148],xmm0
 140bdb7:	00 00 
 140bdb9:	41 0f 11 8c 24 58 01 	movups XMMWORD PTR [r12+0x158],xmm1
 140bdc0:	00 00 
 140bdc2:	41 8a 46 68          	mov    al,BYTE PTR [r14+0x68]
 140bdc6:	41 88 84 24 68 01 00 	mov    BYTE PTR [r12+0x168],al
 140bdcd:	00 
--
 140bdde:	e8 eb 2b 00 00       	call   140e9ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253f52>
 140bde3:	4c 89 ef             	mov    rdi,r13
 140bde6:	e8 e3 2b 00 00       	call   140e9ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253f52>
 140bdeb:	49 83 a4 24 70 01 00 	and    QWORD PTR [r12+0x170],0x0
 140bdf2:	00 00 
 140bdf4:	4c 8d ab 78 01 00 00 	lea    r13,[rbx+0x178]
 140bdfb:	48 8d b4 24 00 05 00 	lea    rsi,[rsp+0x500]
 140be02:	00 
 140be03:	4c 89 ef             	mov    rdi,r13
 140be06:	e8 c1 27 00 00       	call   140e5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b50>
 140be0b:	49 83 a4 24 98 01 00 	and    QWORD PTR [r12+0x198],0x0
 140be12:	00 00 
 140be14:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
 140be19:	49 8b 07             	mov    rax,QWORD PTR [r15]
 140be1c:	49 89 84 24 a0 01 00 	mov    QWORD PTR [r12+0x1a0],rax
 140be23:	00 
 140be24:	31 c0                	xor    eax,eax
 140be26:	49 39 44 24 60       	cmp    QWORD PTR [r12+0x60],rax
 140be2b:	75 16                	jne    140be43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513c7>
 140be2d:	49 83 bc 24 d8 00 00 	cmp    QWORD PTR [r12+0xd8],0x0
 140be34:	00 00 
 140be36:	75 0b                	jne    140be43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513c7>
 140be38:	49 83 bc 24 50 01 00 	cmp    QWORD PTR [r12+0x150],0x0
 140be3f:	00 00 
 140be41:	74 18                	je     140be5b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513df>
 140be43:	48 8d ab 70 01 00 00 	lea    rbp,[rbx+0x170]
 140be4a:	48 81 c3 98 01 00 00 	add    rbx,0x198
 140be51:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
 140be56:	e8 97 2b 00 00       	call   140e9f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253f76>
 140be5b:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
 140be62:	00 
 140be63:	e8 68 2c 00 00       	call   140ead0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254054>
 140be68:	48 8d bc 24 d8 04 00 	lea    rdi,[rsp+0x4d8]
 140be6f:	00 
 140be70:	e8 5b 2c 00 00       	call   140ead0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254054>
 140be75:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
 140be7c:	00 
--
 140bf29:	48 8d 05 f3 be f7 fe 	lea    rax,[rip+0xfffffffffef7bef3]        # 387e23 <_ZTSSt12bad_any_cast@@Base-0x83a5>
 140bf30:	48 89 84 24 f8 03 00 	mov    QWORD PTR [rsp+0x3f8],rax
 140bf37:	00 
 140bf38:	48 c7 84 24 00 04 00 	mov    QWORD PTR [rsp+0x400],0x4
 140bf3f:	00 04 00 00 00 
 140bf44:	48 8d b3 80 01 00 00 	lea    rsi,[rbx+0x180]
 140bf4b:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
 140bf52:	00 
 140bf53:	e8 30 db 8c ff       	call   cd9a88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226a28>
 140bf58:	48 8d 05 05 24 f6 fe 	lea    rax,[rip+0xfffffffffef62405]        # 36e364 <_ZTSSt12bad_any_cast@@Base-0x21e64>
 140bf5f:	48 8d 9c 24 60 03 00 	lea    rbx,[rsp+0x360]
 140bf66:	00 
 140bf67:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 140bf6b:	48 c7 43 20 05 00 00 	mov    QWORD PTR [rbx+0x20],0x5
 140bf72:	00 
 140bf73:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140bf7a:	00 
 140bf7b:	4c 8d b4 24 60 04 00 	lea    r14,[rsp+0x460]
 140bf82:	00 
 140bf83:	4c 8d a4 24 e0 03 00 	lea    r12,[rsp+0x3e0]
 140bf8a:	00 
 140bf8b:	4c 89 f6             	mov    rsi,r14
 140bf8e:	4c 89 e2             	mov    rdx,r12
 140bf91:	48 89 d9             	mov    rcx,rbx
 140bf94:	e8 5b 1d 00 00       	call   140dcf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253278>
 140bf99:	48 89 df             	mov    rdi,rbx
 140bf9c:	e8 87 f7 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140bfa1:	4c 89 e7             	mov    rdi,r12
 140bfa4:	e8 7f f7 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140bfa9:	4c 89 f7             	mov    rdi,r14
 140bfac:	e8 77 f7 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140bfb1:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 140bfb5:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
 140bfb9:	bf a8 01 00 00       	mov    edi,0x1a8
 140bfbe:	e8 3d 1f 3e 00       	call   17edf00 <_Znwm@plt>
 140bfc3:	49 89 c4             	mov    r12,rax
 140bfc6:	48 8d 8c 24 60 04 00 	lea    rcx,[rsp+0x460]
 140bfcd:	00 
 140bfce:	48 89 19             	mov    QWORD PTR [rcx],rbx
 140bfd1:	41 8b 07             	mov    eax,DWORD PTR [r15]
 140bfd4:	89 41 08             	mov    DWORD PTR [rcx+0x8],eax
 140bfd7:	41 0f b7 47 04       	movzx  eax,WORD PTR [r15+0x4]
 140bfdc:	66 89 41 0c          	mov    WORD PTR [rcx+0xc],ax
 140bfe0:	48 8d 05 5d 1c 6d ff 	lea    rax,[rip+0xffffffffff6d1c5d]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
 140bfe7:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 140bfeb:	48 8d 05 26 2b 00 00 	lea    rax,[rip+0x2b26]        # 140eb18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25409c>
 140bff2:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140bff6:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
 140bffd:	00 
 140bffe:	4c 89 e7             	mov    rdi,r12
 140c001:	4c 89 fa             	mov    rdx,r15
 140c004:	e8 2f 2b 00 00       	call   140eb38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2540bc>
 140c009:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
 140c00e:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
 140c015:	00 
 140c016:	e8 f1 2c 00 00       	call   140ed0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254290>
 140c01b:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140c022:	00 
 140c023:	e8 36 1f 00 00       	call   140df5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2534e2>
 140c028:	48 8d 35 c8 52 f7 fe 	lea    rsi,[rip+0xfffffffffef752c8]        # 3812f7 <_ZTSSt12bad_any_cast@@Base-0xeed1>
 140c02f:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 140c036:	00 
 140c037:	e8 42 da 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140c03c:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
 140c041:	48 8d 94 24 e8 00 00 	lea    rdx,[rsp+0xe8]
 140c048:	00 
 140c049:	4c 89 22             	mov    QWORD PTR [rdx],r12
 140c04c:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
 140c053:	00 
 140c054:	48 89 df             	mov    rdi,rbx
 140c057:	e8 38 11 00 00       	call   140d194 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252718>
--
 140c072:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 140c075:	ff 50 08             	call   QWORD PTR [rax+0x8]
 140c078:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 140c07f:	00 
 140c080:	e8 0b 1e 3e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 140c085:	49 8d 76 30          	lea    rsi,[r14+0x30]
 140c089:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140c090:	00 
 140c091:	e8 f2 d9 8c ff       	call   cd9a88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226a28>
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
 140c0f0:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 140c0f4:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 140c0f8:	48 8b 58 10          	mov    rbx,QWORD PTR [rax+0x10]
 140c0fc:	4c 8b 70 20          	mov    r14,QWORD PTR [rax+0x20]
 140c100:	bf b8 00 00 00       	mov    edi,0xb8
 140c105:	e8 f6 1d 3e 00       	call   17edf00 <_Znwm@plt>
 140c10a:	49 89 c5             	mov    r13,rax
 140c10d:	48 83 a4 24 40 02 00 	and    QWORD PTR [rsp+0x240],0x0
 140c114:	00 00 
 140c116:	48 83 a4 24 50 02 00 	and    QWORD PTR [rsp+0x250],0x0
 140c11d:	00 00 
 140c11f:	6a 18                	push   0x18
 140c121:	5f                   	pop    rdi
 140c122:	e8 d9 1d 3e 00       	call   17edf00 <_Znwm@plt>
 140c127:	48 89 18             	mov    QWORD PTR [rax],rbx
 140c12a:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 140c12e:	41 8b 0f             	mov    ecx,DWORD PTR [r15]
 140c131:	89 48 10             	mov    DWORD PTR [rax+0x10],ecx
 140c134:	41 0f b7 4f 04       	movzx  ecx,WORD PTR [r15+0x4]
 140c139:	66 89 48 14          	mov    WORD PTR [rax+0x14],cx
 140c13d:	48 8d 8c 24 40 02 00 	lea    rcx,[rsp+0x240]
 140c144:	00 
 140c145:	48 89 01             	mov    QWORD PTR [rcx],rax
 140c148:	48 8d 05 bf 61 75 ff 	lea    rax,[rip+0xffffffffff7561bf]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 140c14f:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 140c153:	48 8d 05 d8 2b 00 00 	lea    rax,[rip+0x2bd8]        # 140ed32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2542b6>
 140c15a:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140c15e:	48 8d b4 24 60 04 00 	lea    rsi,[rsp+0x460]
 140c165:	00 
 140c166:	4c 89 ef             	mov    rdi,r13
 140c169:	4c 89 fa             	mov    rdx,r15
 140c16c:	e8 d9 2b 00 00       	call   140ed4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2542ce>
 140c171:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140c178:	00 
 140c179:	e8 02 2d 00 00       	call   140ee80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254404>
 140c17e:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
 140c185:	00 
 140c186:	e8 9d f5 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140c18b:	48 8d 35 e6 8f f5 fe 	lea    rsi,[rip+0xfffffffffef58fe6]        # 365178 <_ZTSSt12bad_any_cast@@Base-0x2b050>
 140c192:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 140c199:	00 
 140c19a:	e8 df d8 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140c19f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 140c1a4:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
 140c1a9:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]
 140c1b0:	00 
 140c1b1:	4c 89 2a             	mov    QWORD PTR [rdx],r13
 140c1b4:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
 140c1bb:	00 
 140c1bc:	e8 d3 0f 00 00       	call   140d194 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252718>
 140c1c1:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
--
 140c2ed:	49 3b 86 00 02 00 00 	cmp    rax,QWORD PTR [r14+0x200]
 140c2f4:	0f 95 c0             	setne  al
 140c2f7:	4c 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],r13
 140c2fc:	4c 89 64 24 38       	mov    QWORD PTR [rsp+0x38],r12
 140c301:	0f b6 d3             	movzx  edx,bl
 140c304:	0f b6 c8             	movzx  ecx,al
 140c307:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
 140c30e:	00 
 140c30f:	e8 0a 19 00 00       	call   140dc1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2531a2>
 140c314:	4c 8d b4 24 00 05 00 	lea    r14,[rsp+0x500]
 140c31b:	00 
 140c31c:	48 8d 05 db 4f f7 fe 	lea    rax,[rip+0xfffffffffef74fdb]        # 3812fe <_ZTSSt12bad_any_cast@@Base-0xeeca>
 140c323:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 140c327:	49 c7 46 20 0e 00 00 	mov    QWORD PTR [r14+0x20],0xe
 140c32e:	00 
 140c32f:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140c336:	00 
 140c337:	48 8d 9c 24 60 04 00 	lea    rbx,[rsp+0x460]
 140c33e:	00 
 140c33f:	4c 8d a4 24 e0 03 00 	lea    r12,[rsp+0x3e0]
 140c346:	00 
 140c347:	4c 8d ac 24 60 03 00 	lea    r13,[rsp+0x360]
 140c34e:	00 
 140c34f:	48 8d ac 24 28 05 00 	lea    rbp,[rsp+0x528]
 140c356:	00 
 140c357:	48 89 de             	mov    rsi,rbx
 140c35a:	4c 89 e2             	mov    rdx,r12
 140c35d:	4c 89 e9             	mov    rcx,r13
 140c360:	49 89 e8             	mov    r8,rbp
 140c363:	4d 89 f1             	mov    r9,r14
 140c366:	e8 3b 2b 00 00       	call   140eea6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25442a>
 140c36b:	4c 89 f7             	mov    rdi,r14
 140c36e:	e8 b5 f3 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140c373:	48 89 ef             	mov    rdi,rbp
 140c376:	e8 ad f3 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140c37b:	4c 89 ef             	mov    rdi,r13
 140c37e:	e8 a5 f3 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
--
 140c3c8:	e8 33 1b 3e 00       	call   17edf00 <_Znwm@plt>
 140c3cd:	48 89 c3             	mov    rbx,rax
 140c3d0:	48 83 a4 24 e0 03 00 	and    QWORD PTR [rsp+0x3e0],0x0
 140c3d7:	00 00 
 140c3d9:	48 83 a4 24 f0 03 00 	and    QWORD PTR [rsp+0x3f0],0x0
 140c3e0:	00 00 
 140c3e2:	6a 48                	push   0x48
 140c3e4:	5f                   	pop    rdi
 140c3e5:	e8 16 1b 3e 00       	call   17edf00 <_Znwm@plt>
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
 140c441:	48 8d 05 ba 2a 00 00 	lea    rax,[rip+0x2aba]        # 140ef02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254486>
 140c448:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140c44c:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
 140c453:	00 
 140c454:	48 89 df             	mov    rdi,rbx
 140c457:	e8 ca 2a 00 00       	call   140ef26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2544aa>
 140c45c:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
 140c463:	00 
 140c464:	e8 4f 2d 00 00       	call   140f1b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25473c>
 140c469:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140c470:	00 
 140c471:	e8 68 2d 00 00       	call   140f1de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254762>
 140c476:	48 8d 35 a1 b9 f7 fe 	lea    rsi,[rip+0xfffffffffef7b9a1]        # 387e1e <_ZTSSt12bad_any_cast@@Base-0x83aa>
 140c47d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
 140c484:	00 
 140c485:	e8 f4 d5 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140c48a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 140c48f:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
 140c494:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
 140c49b:	00 
 140c49c:	48 89 1a             	mov    QWORD PTR [rdx],rbx
 140c49f:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
 140c4a6:	00 
 140c4a7:	e8 e8 0c 00 00       	call   140d194 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252718>
 140c4ac:	48 89 5c 24 50       	mov    QWORD PTR [rsp+0x50],rbx
 140c4b1:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
--
 140c753:	49 89 c5             	mov    r13,rax
 140c756:	48 83 a4 24 e0 03 00 	and    QWORD PTR [rsp+0x3e0],0x0
 140c75d:	00 00 
 140c75f:	48 83 a4 24 f0 03 00 	and    QWORD PTR [rsp+0x3f0],0x0
 140c766:	00 00 
 140c768:	6a 48                	push   0x48
 140c76a:	5f                   	pop    rdi
 140c76b:	e8 90 17 3e 00       	call   17edf00 <_Znwm@plt>
 140c770:	48 8b 6c 24 20       	mov    rbp,QWORD PTR [rsp+0x20]
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
 140c7cc:	48 8d 05 cf 2a 00 00 	lea    rax,[rip+0x2acf]        # 140f2a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254826>
 140c7d3:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 140c7d7:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
 140c7de:	00 
 140c7df:	4c 89 ef             	mov    rdi,r13
 140c7e2:	e8 df 2a 00 00       	call   140f2c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25484a>
 140c7e7:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
 140c7ee:	00 
 140c7ef:	e8 0c 2e 00 00       	call   140f600 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b84>
 140c7f4:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
 140c7fb:	00 
 140c7fc:	e8 25 2e 00 00       	call   140f626 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254baa>
 140c801:	48 8d 35 91 74 f5 fe 	lea    rsi,[rip+0xfffffffffef57491]        # 363c99 <_ZTSSt12bad_any_cast@@Base-0x2c52f>
 140c808:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 140c80f:	00 
 140c810:	e8 69 d2 66 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 140c815:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
 140c81a:	4c 8b b4 24 80 00 00 	mov    r14,QWORD PTR [rsp+0x80]
 140c821:	00 
 140c822:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
 140c829:	00 
 140c82a:	4c 89 2a             	mov    QWORD PTR [rdx],r13
 140c82d:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 140c834:	00 
 140c835:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 140c83a:	e8 55 09 00 00       	call   140d194 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252718>
--
 140c84a:	74 06                	je     140c852 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251dd6>
 140c84c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 140c84f:	ff 50 08             	call   QWORD PTR [rax+0x8]
 140c852:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 140c859:	00 
 140c85a:	e8 31 16 3e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 140c85f:	48 8b 84 24 08 02 00 	mov    rax,QWORD PTR [rsp+0x208]
 140c866:	00 
 140c867:	48 89 03             	mov    QWORD PTR [rbx],rax
 140c86a:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
 140c86e:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
 140c873:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 140c877:	48 89 6b 18          	mov    QWORD PTR [rbx+0x18],rbp
 140c87b:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 140c880:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 140c884:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 140c889:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
 140c88d:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 140c892:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 140c896:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 140c89b:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
 140c89f:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 140c8a4:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
 140c8a8:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 140c8ad:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
 140c8b1:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 140c8b6:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
 140c8ba:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
 140c8bf:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
 140c8c3:	4c 89 6b 60          	mov    QWORD PTR [rbx+0x60],r13
 140c8c7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140c8ce:	00 00 
 140c8d0:	48 3b 84 24 50 05 00 	cmp    rax,QWORD PTR [rsp+0x550]
 140c8d7:	00 
 140c8d8:	0f 85 13 07 00 00    	jne    140cff1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252575>
 140c8de:	48 89 d8             	mov    rax,rbx
 140c8e1:	48 81 c4 58 05 00 00 	add    rsp,0x558
--
 140cff1:	e8 ba 2a 3e 00       	call   17efab0 <__stack_chk_fail@plt>
 140cff6:	53                   	push   rbx
 140cff7:	48 89 fb             	mov    rbx,rdi
 140cffa:	6a 28                	push   0x28
 140cffc:	5f                   	pop    rdi
 140cffd:	e8 fe 0e 3e 00       	call   17edf00 <_Znwm@plt>
 140d002:	48 c7 40 20 01 00 00 	mov    QWORD PTR [rax+0x20],0x1
 140d009:	00 
 140d00a:	48 8d 0d c7 27 46 00 	lea    rcx,[rip+0x4627c7]        # 186f7d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2bec0>
 140d011:	48 89 08             	mov    QWORD PTR [rax],rcx
 140d014:	0f 57 c0             	xorps  xmm0,xmm0
 140d017:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 140d01b:	48 83 60 18 00       	and    QWORD PTR [rax+0x18],0x0
 140d020:	48 89 03             	mov    QWORD PTR [rbx],rax
 140d023:	5b                   	pop    rbx
 140d024:	c3                   	ret
 140d025:	cc                   	int3
 140d026:	53                   	push   rbx
 140d027:	48 89 fb             	mov    rbx,rdi
 140d02a:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
 140d02d:	e8 e5 ce 00 00       	call   1419f17 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25f49b>
 140d032:	48 89 d8             	mov    rax,rbx
 140d035:	5b                   	pop    rbx
 140d036:	c3                   	ret
 140d037:	cc                   	int3
 140d038:	41 57                	push   r15
 140d03a:	41 56                	push   r14
 140d03c:	41 55                	push   r13
 140d03e:	41 54                	push   r12
 140d040:	53                   	push   rbx
 140d041:	48 81 ec a0 00 00 00 	sub    rsp,0xa0
 140d048:	49 89 d7             	mov    r15,rdx
 140d04b:	49 89 f6             	mov    r14,rsi
 140d04e:	48 89 fb             	mov    rbx,rdi
 140d051:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140d058:	00 00 
 140d05a:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
--
 140d1ac:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 140d1b0:	49 39 c5             	cmp    r13,rax
 140d1b3:	73 35                	jae    140d1ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25276e>
 140d1b5:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
 140d1ba:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 140d1be:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
 140d1c3:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
 140d1c8:	0f 57 c0             	xorps  xmm0,xmm0
 140d1cb:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
 140d1d0:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
 140d1d6:	49 8b 07             	mov    rax,QWORD PTR [r15]
 140d1d9:	49 83 27 00          	and    QWORD PTR [r15],0x0
 140d1dd:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 140d1e1:	49 83 c5 20          	add    r13,0x20
 140d1e5:	e9 19 01 00 00       	jmp    140d303 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252887>
 140d1ea:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
 140d1ed:	49 29 cd             	sub    r13,rcx
 140d1f0:	4c 89 ed             	mov    rbp,r13
 140d1f3:	48 c1 fd 05          	sar    rbp,0x5
 140d1f7:	48 8d 55 01          	lea    rdx,[rbp+0x1]
 140d1fb:	48 89 d6             	mov    rsi,rdx
 140d1fe:	48 c1 ee 3b          	shr    rsi,0x3b
 140d202:	0f 85 0e 01 00 00    	jne    140d316 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25289a>
 140d208:	48 be ff ff ff ff ff 	movabs rsi,0x7ffffffffffffff
 140d20f:	ff ff 07 
 140d212:	48 29 c8             	sub    rax,rcx
 140d215:	49 89 c6             	mov    r14,rax
 140d218:	49 c1 fe 04          	sar    r14,0x4
 140d21c:	49 39 d6             	cmp    r14,rdx
 140d21f:	4c 0f 46 f2          	cmovbe r14,rdx
 140d223:	48 b9 e0 ff ff ff ff 	movabs rcx,0x7fffffffffffffe0
 140d22a:	ff ff 7f 
 140d22d:	48 39 c8             	cmp    rax,rcx
 140d230:	4c 0f 43 f6          	cmovae r14,rsi
 140d234:	49 39 f6             	cmp    r14,rsi
 140d237:	0f 87 de 00 00 00    	ja     140d31b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25289f>
 140d23d:	49 c1 e6 05          	shl    r14,0x5
--
 140d36e:	4c 63 e1             	movsxd r12,ecx
 140d371:	49 0f af c4          	imul   rax,r12
 140d375:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 140d37a:	4c 89 fb             	mov    rbx,r15
 140d37d:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
 140d381:	f3 0f 5e 05 c3 12 f8 	divss  xmm0,DWORD PTR [rip+0xfffffffffef812c3]        # 38e64c <_ZTSSt12bad_any_cast@@Base-0x1b7c>
 140d388:	fe 
 140d389:	e8 b2 39 3e 00       	call   17f0d40 <lroundf@plt>
 140d38e:	f3 41 0f 2a c4       	cvtsi2ss xmm0,r12d
 140d393:	48 8d 48 01          	lea    rcx,[rax+0x1]
 140d397:	f3 0f 59 05 d9 15 f8 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef815d9]        # 38e978 <_ZTSSt12bad_any_cast@@Base-0x1850>
 140d39e:	fe 
 140d39f:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
 140d3a3:	f3 41 0f 11 47 20    	movss  DWORD PTR [r15+0x20],xmm0
 140d3a9:	4d 8d 67 28          	lea    r12,[r15+0x28]
 140d3ad:	48 8d 34 45 02 00 00 	lea    rsi,[rax*2+0x2]
 140d3b4:	00 
 140d3b5:	4c 89 e7             	mov    rdi,r12
 140d3b8:	e8 47 b8 69 ff       	call   aa8c04 <JNI_OnUnload@@Base+0x304d1>
 140d3bd:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
 140d3c1:	48 83 63 74 00       	and    QWORD PTR [rbx+0x74],0x0
 140d3c6:	0f 57 c0             	xorps  xmm0,xmm0
 140d3c9:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0
 140d3cd:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
 140d3d1:	0f 11 43 60          	movups XMMWORD PTR [rbx+0x60],xmm0
 140d3d5:	c6 43 70 00          	mov    BYTE PTR [rbx+0x70],0x0
 140d3d9:	f3 0f 2a 4b 10       	cvtsi2ss xmm1,DWORD PTR [rbx+0x10]
 140d3de:	f3 0f 59 0d 1a 16 f8 	mulss  xmm1,DWORD PTR [rip+0xfffffffffef8161a]        # 38ea00 <_ZTSSt12bad_any_cast@@Base-0x17c8>
 140d3e5:	fe 
 140d3e6:	f3 0f 11 4b 7c       	movss  DWORD PTR [rbx+0x7c],xmm1
 140d3eb:	83 8b 80 00 00 00 ff 	or     DWORD PTR [rbx+0x80],0xffffffff
 140d3f2:	4d 8d 6f 50          	lea    r13,[r15+0x50]
 140d3f6:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
 140d3fd:	00 
 140d3fe:	49 8d af 88 00 00 00 	lea    rbp,[r15+0x88]
 140d405:	83 a3 a0 00 00 00 00 	and    DWORD PTR [rbx+0xa0],0x0
 140d40c:	49 81 c7 98 00 00 00 	add    r15,0x98
 140d413:	0f 11 83 84 00 00 00 	movups XMMWORD PTR [rbx+0x84],xmm0
 140d41a:	48 8b 73 18          	mov    rsi,QWORD PTR [rbx+0x18]
 140d41e:	48 01 f6             	add    rsi,rsi
 140d421:	4c 89 ef             	mov    rdi,r13
 140d424:	e8 ad 04 7c ff       	call   bcd8d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11a876>
 140d429:	8b 73 10             	mov    esi,DWORD PTR [rbx+0x10]
 140d42c:	f3 48 0f 2c 53 7c    	cvttss2si rdx,DWORD PTR [rbx+0x7c]
 140d432:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
 140d437:	f2 0f 10 05 11 1b f8 	movsd  xmm0,QWORD PTR [rip+0xfffffffffef81b11]        # 38ef50 <_ZTSSt12bad_any_cast@@Base-0x1278>
 140d43e:	fe 
 140d43f:	4c 89 e7             	mov    rdi,r12
 140d442:	e8 80 ec 01 00       	call   142c0c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27164b>
 140d447:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 140d44b:	48 8b 70 28          	mov    rsi,QWORD PTR [rax+0x28]
 140d44f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 140d452:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 140d457:	4c 89 e2             	mov    rdx,r12
 140d45a:	ff 50 20             	call   QWORD PTR [rax+0x20]
 140d45d:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
 140d462:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
 140d467:	49 89 04 24          	mov    QWORD PTR [r12],rax
 140d46b:	41 c7 44 24 08 01 00 	mov    DWORD PTR [r12+0x8],0x1
 140d472:	00 00 
 140d474:	48 89 ef             	mov    rdi,rbp
 140d477:	4c 89 e6             	mov    rsi,r12
 140d47a:	e8 a5 48 78 ff       	call   b91d24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdecc4>
--
 140d56a:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 140d56f:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 140d573:	48 85 c0             	test   rax,rax
 140d576:	74 22                	je     140d59a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252b1e>
 140d578:	48 89 fb             	mov    rbx,rdi
 140d57b:	49 89 f6             	mov    r14,rsi
 140d57e:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 140d582:	6a 01                	push   0x1
 140d584:	5f                   	pop    rdi
 140d585:	48 89 de             	mov    rsi,rbx
 140d588:	4c 89 f2             	mov    rdx,r14
 140d58b:	ff d0                	call   rax
 140d58d:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 140d591:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 140d595:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 140d59a:	48 83 c4 08          	add    rsp,0x8
 140d59e:	5b                   	pop    rbx
 140d59f:	41 5e                	pop    r14
 140d5a1:	c3                   	ret
 140d5a2:	48 89 c7             	mov    rdi,rax
 140d5a5:	e8 fb c4 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 140d5aa:	55                   	push   rbp
 140d5ab:	41 57                	push   r15
 140d5ad:	41 56                	push   r14
 140d5af:	41 55                	push   r13
 140d5b1:	41 54                	push   r12
 140d5b3:	53                   	push   rbx
 140d5b4:	48 83 ec 58          	sub    rsp,0x58
 140d5b8:	49 89 d7             	mov    r15,rdx
 140d5bb:	49 89 f6             	mov    r14,rsi
 140d5be:	48 89 fb             	mov    rbx,rdi
 140d5c1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140d5c8:	00 00 
 140d5ca:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 140d5cf:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
 140d5d4:	4c 89 ef             	mov    rdi,r13
 140d5d7:	e8 ac c4 8c ff       	call   cd9a88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226a28>
 140d5dc:	48 8d 05 c5 22 46 00 	lea    rax,[rip+0x4622c5]        # 186f8a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2bf90>
--
 140d5fb:	0f 57 c0             	xorps  xmm0,xmm0
 140d5fe:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
 140d603:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
 140d608:	49 8b 07             	mov    rax,QWORD PTR [r15]
 140d60b:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 140d60f:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
 140d613:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
 140d617:	48 83 63 48 00       	and    QWORD PTR [rbx+0x48],0x0
 140d61c:	4c 39 e5             	cmp    rbp,r12
 140d61f:	0f 84 d9 00 00 00    	je     140d6fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252c82>
 140d625:	48 8d 43 28          	lea    rax,[rbx+0x28]
 140d629:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 140d62e:	4c 8d 7d 18          	lea    r15,[rbp+0x18]
 140d632:	45 31 ed             	xor    r13d,r13d
 140d635:	4d 39 e7             	cmp    r15,r12
 140d638:	74 2c                	je     140d666 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252bea>
 140d63a:	41 8b 47 fc          	mov    eax,DWORD PTR [r15-0x4]
 140d63e:	41 39 47 14          	cmp    DWORD PTR [r15+0x14],eax
 140d642:	75 1a                	jne    140d65e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252be2>
 140d644:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
 140d647:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
 140d64b:	49 8b 57 e8          	mov    rdx,QWORD PTR [r15-0x18]
 140d64f:	49 8b 4f f0          	mov    rcx,QWORD PTR [r15-0x10]
 140d653:	e8 68 8a 8b ff       	call   cc60c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213060>
 140d658:	84 c0                	test   al,al
 140d65a:	74 04                	je     140d660 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252be4>
 140d65c:	eb 0c                	jmp    140d66a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252bee>
 140d65e:	7c 0a                	jl     140d66a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252bee>
 140d660:	49 83 c7 18          	add    r15,0x18
 140d664:	eb cf                	jmp    140d635 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252bb9>
 140d666:	31 c9                	xor    ecx,ecx
 140d668:	eb 2b                	jmp    140d695 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252c19>
 140d66a:	48 8d 35 0b 49 04 ff 	lea    rsi,[rip+0xffffffffff04490b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 140d671:	48 8d 0d 64 b8 f1 fe 	lea    rcx,[rip+0xfffffffffef1b864]        # 328edc <_ZTSSt12bad_any_cast@@Base-0x672ec>
 140d678:	6a 03                	push   0x3
 140d67a:	5f                   	pop    rdi
 140d67b:	6a 36                	push   0x36
--
 140d6dc:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 140d6e1:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 140d6e6:	4c 89 e6             	mov    rsi,r12
 140d6e9:	e8 5e b3 76 ff       	call   b78a4c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc59ec>
 140d6ee:	4c 89 e7             	mov    rdi,r12
 140d6f1:	e8 c4 b3 76 ff       	call   b78aba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc5a5a>
 140d6f6:	48 89 df             	mov    rdi,rbx
 140d6f9:	e8 76 bd 00 00       	call   1419474 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25e9f8>
 140d6fe:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 140d703:	e8 20 e0 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140d708:	0f 10 43 40          	movups xmm0,XMMWORD PTR [rbx+0x40]
 140d70c:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
 140d710:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
 140d715:	0f 11 43 60          	movups XMMWORD PTR [rbx+0x60],xmm0
 140d719:	49 8b 06             	mov    rax,QWORD PTR [r14]
 140d71c:	49 3b 46 08          	cmp    rax,QWORD PTR [r14+0x8]
 140d720:	0f 94 43 70          	sete   BYTE PTR [rbx+0x70]
 140d724:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140d72b:	00 00 
 140d72d:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
 140d732:	75 24                	jne    140d758 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252cdc>
 140d734:	48 83 c4 58          	add    rsp,0x58
 140d738:	5b                   	pop    rbx
 140d739:	41 5c                	pop    r12
 140d73b:	41 5d                	pop    r13
 140d73d:	41 5e                	pop    r14
 140d73f:	41 5f                	pop    r15
 140d741:	5d                   	pop    rbp
 140d742:	c3                   	ret
 140d743:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140d74a:	00 00 
 140d74c:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
 140d751:	75 05                	jne    140d758 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252cdc>
 140d753:	e8 68 6e 5f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
 140d758:	e8 53 23 3e 00       	call   17efab0 <__stack_chk_fail@plt>
 140d75d:	48 89 c7             	mov    rdi,rax
 140d760:	e8 40 c3 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 140d765:	cc                   	int3
 140d766:	48 8d 05 3b 21 46 00 	lea    rax,[rip+0x46213b]        # 186f8a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2bf90>
 140d76d:	48 89 07             	mov    QWORD PTR [rdi],rax
 140d770:	0f 57 c0             	xorps  xmm0,xmm0
 140d773:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
 140d778:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
 140d77c:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
 140d780:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 140d784:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 140d788:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 140d78c:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
 140d790:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
 140d794:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
 140d798:	48 83 66 18 00       	and    QWORD PTR [rsi+0x18],0x0
 140d79d:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
 140d7a1:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
 140d7a5:	48 83 67 38 00       	and    QWORD PTR [rdi+0x38],0x0
 140d7aa:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
 140d7ae:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
 140d7b2:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
 140d7b6:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
 140d7ba:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
 140d7be:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]
 140d7c2:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
 140d7c6:	0f 11 46 28          	movups XMMWORD PTR [rsi+0x28],xmm0
 140d7ca:	48 83 66 38 00       	and    QWORD PTR [rsi+0x38],0x0
 140d7cf:	0f 10 46 40          	movups xmm0,XMMWORD PTR [rsi+0x40]
 140d7d3:	0f 11 47 40          	movups XMMWORD PTR [rdi+0x40],xmm0
 140d7d7:	8a 46 70             	mov    al,BYTE PTR [rsi+0x70]
 140d7da:	88 47 70             	mov    BYTE PTR [rdi+0x70],al
 140d7dd:	0f 10 46 50          	movups xmm0,XMMWORD PTR [rsi+0x50]
 140d7e1:	0f 10 4e 60          	movups xmm1,XMMWORD PTR [rsi+0x60]
 140d7e5:	0f 11 4f 60          	movups XMMWORD PTR [rdi+0x60],xmm1
 140d7e9:	0f 11 47 50          	movups XMMWORD PTR [rdi+0x50],xmm0
 140d7ed:	c3                   	ret
 140d7ee:	53                   	push   rbx
 140d7ef:	48 89 fb             	mov    rbx,rdi
 140d7f2:	48 83 c7 28          	add    rdi,0x28
--
 140d93e:	48 89 03             	mov    QWORD PTR [rbx],rax
 140d941:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
 140d945:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 140d949:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 140d94d:	f3 0f 2a c8          	cvtsi2ss xmm1,eax
 140d951:	f3 0f 11 4c 24 0c    	movss  DWORD PTR [rsp+0xc],xmm1
 140d957:	f3 0f 10 05 f9 0f f8 	movss  xmm0,DWORD PTR [rip+0xfffffffffef80ff9]        # 38e958 <_ZTSSt12bad_any_cast@@Base-0x1870>
 140d95e:	fe 
 140d95f:	f3 0f 59 c1          	mulss  xmm0,xmm1
 140d963:	f3 0f 5e 05 e1 0c f8 	divss  xmm0,DWORD PTR [rip+0xfffffffffef80ce1]        # 38e64c <_ZTSSt12bad_any_cast@@Base-0x1b7c>
 140d96a:	fe 
 140d96b:	e8 d0 33 3e 00       	call   17f0d40 <lroundf@plt>
 140d970:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 140d974:	83 63 20 00          	and    DWORD PTR [rbx+0x20],0x0
 140d978:	31 c9                	xor    ecx,ecx
 140d97a:	88 4b 24             	mov    BYTE PTR [rbx+0x24],cl
 140d97d:	88 4b 28             	mov    BYTE PTR [rbx+0x28],cl
 140d980:	88 4b 2c             	mov    BYTE PTR [rbx+0x2c],cl
 140d983:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
 140d988:	83 63 38 00          	and    DWORD PTR [rbx+0x38],0x0
 140d98c:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
 140d991:	c7 43 48 00 00 80 3f 	mov    DWORD PTR [rbx+0x48],0x3f800000
 140d998:	f3 0f 10 44 24 0c    	movss  xmm0,DWORD PTR [rsp+0xc]
 140d99e:	f3 0f 59 05 36 0e f8 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef80e36]        # 38e7dc <_ZTSSt12bad_any_cast@@Base-0x19ec>
 140d9a5:	fe 
 140d9a6:	f3 0f 11 43 4c       	movss  DWORD PTR [rbx+0x4c],xmm0
 140d9ab:	4c 8d 63 50          	lea    r12,[rbx+0x50]
 140d9af:	4c 8d 7b 68          	lea    r15,[rbx+0x68]
 140d9b3:	48 8d 34 00          	lea    rsi,[rax+rax*1]
 140d9b7:	0f 57 c0             	xorps  xmm0,xmm0
 140d9ba:	0f 11 43 60          	movups XMMWORD PTR [rbx+0x60],xmm0
 140d9be:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
 140d9c2:	83 63 70 00          	and    DWORD PTR [rbx+0x70],0x0
 140d9c6:	4c 89 e7             	mov    rdi,r12
 140d9c9:	e8 b4 09 6a ff       	call   aae382 <JNI_OnUnload@@Base+0x35c4f>
 140d9ce:	8b 73 10             	mov    esi,DWORD PTR [rbx+0x10]
 140d9d1:	f3 48 0f 2c 53 4c    	cvttss2si rdx,DWORD PTR [rbx+0x4c]
--
 140da92:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 140da97:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 140da9b:	48 85 c0             	test   rax,rax
 140da9e:	74 22                	je     140dac2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253046>
 140daa0:	48 89 fb             	mov    rbx,rdi
 140daa3:	49 89 f6             	mov    r14,rsi
 140daa6:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 140daaa:	6a 01                	push   0x1
 140daac:	5f                   	pop    rdi
 140daad:	48 89 de             	mov    rsi,rbx
 140dab0:	4c 89 f2             	mov    rdx,r14
 140dab3:	ff d0                	call   rax
 140dab5:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 140dab9:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 140dabd:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 140dac2:	48 83 c4 08          	add    rsp,0x8
 140dac6:	5b                   	pop    rbx
 140dac7:	41 5e                	pop    r14
 140dac9:	c3                   	ret
 140daca:	48 89 c7             	mov    rdi,rax
 140dacd:	e8 d3 bf 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 140dad2:	41 56                	push   r14
 140dad4:	53                   	push   rbx
 140dad5:	50                   	push   rax
 140dad6:	48 89 d3             	mov    rbx,rdx
 140dad9:	49 89 fe             	mov    r14,rdi
 140dadc:	e8 85 fc ff ff       	call   140d766 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252cea>
 140dae1:	49 83 c6 78          	add    r14,0x78
 140dae5:	4c 89 f7             	mov    rdi,r14
 140dae8:	48 89 de             	mov    rsi,rbx
 140daeb:	48 83 c4 08          	add    rsp,0x8
 140daef:	5b                   	pop    rbx
 140daf0:	41 5e                	pop    r14
 140daf2:	e9 6f fc ff ff       	jmp    140d766 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252cea>
 140daf7:	cc                   	int3
 140daf8:	41 56                	push   r14
 140dafa:	53                   	push   rbx
 140dafb:	48 83 ec 18          	sub    rsp,0x18
--
 140dd1a:	48 89 de             	mov    rsi,rbx
 140dd1d:	5b                   	pop    rbx
 140dd1e:	41 5e                	pop    r14
 140dd20:	41 5f                	pop    r15
 140dd22:	e9 ab 51 00 00       	jmp    1412ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258456>
 140dd27:	cc                   	int3
 140dd28:	53                   	push   rbx
 140dd29:	48 89 fb             	mov    rbx,rdi
 140dd2c:	4c 8b 0e             	mov    r9,QWORD PTR [rsi]
 140dd2f:	49 8b 31             	mov    rsi,QWORD PTR [r9]
 140dd32:	49 8b 51 08          	mov    rdx,QWORD PTR [r9+0x8]
 140dd36:	49 8b 49 10          	mov    rcx,QWORD PTR [r9+0x10]
 140dd3a:	4d 8d 41 18          	lea    r8,[r9+0x18]
 140dd3e:	49 83 c1 20          	add    r9,0x20
 140dd42:	e8 e2 a9 00 00       	call   1418729 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25dcad>
 140dd47:	48 89 d8             	mov    rax,rbx
 140dd4a:	5b                   	pop    rbx
 140dd4b:	c3                   	ret
 140dd4c:	55                   	push   rbp
 140dd4d:	41 57                	push   r15
 140dd4f:	41 56                	push   r14
 140dd51:	41 55                	push   r13
 140dd53:	41 54                	push   r12
 140dd55:	53                   	push   rbx
 140dd56:	48 81 ec 98 01 00 00 	sub    rsp,0x198
 140dd5d:	49 89 d6             	mov    r14,rdx
 140dd60:	49 89 f7             	mov    r15,rsi
 140dd63:	48 89 fb             	mov    rbx,rdi
 140dd66:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140dd6d:	00 00 
 140dd6f:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
 140dd76:	00 
 140dd77:	48 8d 05 1a 1d 46 00 	lea    rax,[rip+0x461d1a]        # 186fa98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c180>
 140dd7e:	48 89 07             	mov    QWORD PTR [rdi],rax
 140dd81:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
 140dd88:	00 
 140dd89:	48 89 ce             	mov    rsi,rcx
--
 140e0fd:	48 89 f3             	mov    rbx,rsi
 140e100:	49 89 fe             	mov    r14,rdi
 140e103:	4c 8b 3e             	mov    r15,QWORD PTR [rsi]
 140e106:	bf 90 00 00 00       	mov    edi,0x90
 140e10b:	e8 f0 fd 3d 00       	call   17edf00 <_Znwm@plt>
 140e110:	48 8d 0d 91 1a 46 00 	lea    rcx,[rip+0x461a91]        # 186fba8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c290>
 140e117:	48 89 08             	mov    QWORD PTR [rax],rcx
 140e11a:	49 8b 4f 28          	mov    rcx,QWORD PTR [r15+0x28]
 140e11e:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 140e122:	49 8b 4f 10          	mov    rcx,QWORD PTR [r15+0x10]
 140e126:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 140e12a:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 140e12e:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
 140e132:	31 c9                	xor    ecx,ecx
 140e134:	88 48 20             	mov    BYTE PTR [rax+0x20],cl
 140e137:	88 48 48             	mov    BYTE PTR [rax+0x48],cl
 140e13a:	0f 57 c0             	xorps  xmm0,xmm0
 140e13d:	0f 11 40 70          	movups XMMWORD PTR [rax+0x70],xmm0
 140e141:	0f 11 40 60          	movups XMMWORD PTR [rax+0x60],xmm0
 140e145:	0f 11 40 50          	movups XMMWORD PTR [rax+0x50],xmm0
 140e149:	f2 0f 10 05 cf fe f7 	movsd  xmm0,QWORD PTR [rip+0xfffffffffef7fecf]        # 38e020 <_ZTSSt12bad_any_cast@@Base-0x21a8>
 140e150:	fe 
 140e151:	f2 0f 11 80 80 00 00 	movsd  QWORD PTR [rax+0x80],xmm0
 140e158:	00 
 140e159:	c7 80 88 00 00 00 00 	mov    DWORD PTR [rax+0x88],0x3f000000
 140e160:	00 00 3f 
 140e163:	49 89 06             	mov    QWORD PTR [r14],rax
 140e166:	4c 89 f0             	mov    rax,r14
 140e169:	5b                   	pop    rbx
 140e16a:	41 5e                	pop    r14
 140e16c:	41 5f                	pop    r15
 140e16e:	c3                   	ret
 140e16f:	cc                   	int3
 140e170:	41 56                	push   r14
 140e172:	53                   	push   rbx
 140e173:	50                   	push   rax
 140e174:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 140e178:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 140e17d:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 140e181:	48 85 c0             	test   rax,rax
 140e184:	74 22                	je     140e1a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25372c>
 140e186:	48 89 fb             	mov    rbx,rdi
 140e189:	49 89 f6             	mov    r14,rsi
 140e18c:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 140e190:	6a 01                	push   0x1
 140e192:	5f                   	pop    rdi
 140e193:	48 89 de             	mov    rsi,rbx
 140e196:	4c 89 f2             	mov    rdx,r14
 140e199:	ff d0                	call   rax
 140e19b:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 140e19f:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 140e1a3:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 140e1a8:	48 83 c4 08          	add    rsp,0x8
 140e1ac:	5b                   	pop    rbx
 140e1ad:	41 5e                	pop    r14
 140e1af:	c3                   	ret
 140e1b0:	48 89 c7             	mov    rdi,rax
 140e1b3:	e8 ed b8 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 140e1b8:	41 57                	push   r15
 140e1ba:	41 56                	push   r14
 140e1bc:	53                   	push   rbx
 140e1bd:	48 89 cb             	mov    rbx,rcx
 140e1c0:	49 89 d6             	mov    r14,rdx
 140e1c3:	49 89 ff             	mov    r15,rdi
 140e1c6:	e8 9b f5 ff ff       	call   140d766 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252cea>
 140e1cb:	49 8d 7f 78          	lea    rdi,[r15+0x78]
 140e1cf:	4c 89 f6             	mov    rsi,r14
 140e1d2:	e8 8f f5 ff ff       	call   140d766 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252cea>
 140e1d7:	49 81 c7 f0 00 00 00 	add    r15,0xf0
 140e1de:	4c 89 ff             	mov    rdi,r15
 140e1e1:	48 89 de             	mov    rsi,rbx
 140e1e4:	5b                   	pop    rbx
 140e1e5:	41 5e                	pop    r14
 140e1e7:	41 5f                	pop    r15
 140e1e9:	e9 78 f5 ff ff       	jmp    140d766 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252cea>
--
 140e4fa:	49 89 c6             	mov    r14,rax
 140e4fd:	48 8d 7c 24 0c       	lea    rdi,[rsp+0xc]
 140e502:	e8 63 a8 69 ff       	call   aa8d6a <JNI_OnUnload@@Base+0x30637>
 140e507:	48 8d 7c 24 0c       	lea    rdi,[rsp+0xc]
 140e50c:	e8 ff fb 3d 00       	call   17ee110 <_ZNSt6__ndk113random_deviceclEv@plt>
 140e511:	89 c1                	mov    ecx,eax
 140e513:	48 8d 05 b6 17 46 00 	lea    rax,[rip+0x4617b6]        # 186fcd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c3b8>
 140e51a:	49 89 06             	mov    QWORD PTR [r14],rax
 140e51d:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
 140e522:	41 83 66 10 00       	and    DWORD PTR [r14+0x10],0x0
 140e527:	41 c6 46 14 01       	mov    BYTE PTR [r14+0x14],0x1
 140e52c:	0f 57 c0             	xorps  xmm0,xmm0
 140e52f:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
 140e534:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
 140e539:	4d 89 66 30          	mov    QWORD PTR [r14+0x30],r12
 140e53d:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 140e541:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
 140e545:	be e8 03 00 00       	mov    esi,0x3e8
 140e54a:	99                   	cdq
 140e54b:	f7 fe                	idiv   esi
 140e54d:	83 f8 02             	cmp    eax,0x2
 140e550:	6a 01                	push   0x1
 140e552:	5a                   	pop    rdx
 140e553:	0f 4d d0             	cmovge edx,eax
 140e556:	41 89 56 40          	mov    DWORD PTR [r14+0x40],edx
 140e55a:	4c 89 f7             	mov    rdi,r14
 140e55d:	48 83 c7 48          	add    rdi,0x48
 140e561:	89 ce                	mov    esi,ecx
 140e563:	e8 3e 45 6e ff       	call   af2aa6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fa46>
 140e568:	4c 89 33             	mov    QWORD PTR [rbx],r14
 140e56b:	48 8d 7c 24 0c       	lea    rdi,[rsp+0xc]
 140e570:	e8 ab fb 3d 00       	call   17ee120 <_ZNSt6__ndk113random_deviceD1Ev@plt>
 140e575:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140e57c:	00 00 
 140e57e:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 140e583:	75 41                	jne    140e5c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b4a>
 140e585:	48 89 d8             	mov    rax,rbx
--
 140e5d4:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 140e5d9:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 140e5dd:	48 85 c0             	test   rax,rax
 140e5e0:	74 22                	je     140e604 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b88>
 140e5e2:	48 89 fb             	mov    rbx,rdi
 140e5e5:	49 89 f6             	mov    r14,rsi
 140e5e8:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 140e5ec:	6a 01                	push   0x1
 140e5ee:	5f                   	pop    rdi
 140e5ef:	48 89 de             	mov    rsi,rbx
 140e5f2:	4c 89 f2             	mov    rdx,r14
 140e5f5:	ff d0                	call   rax
 140e5f7:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 140e5fb:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 140e5ff:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 140e604:	48 83 c4 08          	add    rsp,0x8
 140e608:	5b                   	pop    rbx
 140e609:	41 5e                	pop    r14
 140e60b:	c3                   	ret
 140e60c:	48 89 c7             	mov    rdi,rax
 140e60f:	e8 91 b4 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 140e614:	55                   	push   rbp
 140e615:	41 57                	push   r15
 140e617:	41 56                	push   r14
 140e619:	41 55                	push   r13
 140e61b:	41 54                	push   r12
 140e61d:	53                   	push   rbx
 140e61e:	48 83 ec 58          	sub    rsp,0x58
 140e622:	49 89 d7             	mov    r15,rdx
 140e625:	49 89 f6             	mov    r14,rsi
 140e628:	48 89 fb             	mov    rbx,rdi
 140e62b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140e632:	00 00 
 140e634:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 140e639:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
 140e63e:	4c 89 ef             	mov    rdi,r13
 140e641:	e8 8a b3 8c ff       	call   cd99d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226970>
 140e646:	48 8d 05 8b 14 46 00 	lea    rax,[rip+0x46148b]        # 186fad8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c1c0>
--
 140e665:	0f 57 c0             	xorps  xmm0,xmm0
 140e668:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
 140e66d:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
 140e672:	49 8b 07             	mov    rax,QWORD PTR [r15]
 140e675:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 140e679:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
 140e67d:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
 140e681:	48 83 63 48 00       	and    QWORD PTR [rbx+0x48],0x0
 140e686:	4c 39 e5             	cmp    rbp,r12
 140e689:	0f 84 d9 00 00 00    	je     140e768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253cec>
 140e68f:	48 8d 43 28          	lea    rax,[rbx+0x28]
 140e693:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 140e698:	4c 8d 7d 18          	lea    r15,[rbp+0x18]
 140e69c:	45 31 ed             	xor    r13d,r13d
 140e69f:	4d 39 e7             	cmp    r15,r12
 140e6a2:	74 2c                	je     140e6d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253c54>
 140e6a4:	41 8b 47 fc          	mov    eax,DWORD PTR [r15-0x4]
 140e6a8:	41 39 47 14          	cmp    DWORD PTR [r15+0x14],eax
 140e6ac:	75 1a                	jne    140e6c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253c4c>
 140e6ae:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
 140e6b1:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
 140e6b5:	49 8b 57 e8          	mov    rdx,QWORD PTR [r15-0x18]
 140e6b9:	49 8b 4f f0          	mov    rcx,QWORD PTR [r15-0x10]
 140e6bd:	e8 fe 79 8b ff       	call   cc60c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213060>
 140e6c2:	84 c0                	test   al,al
 140e6c4:	74 04                	je     140e6ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253c4e>
 140e6c6:	eb 0c                	jmp    140e6d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253c58>
 140e6c8:	7c 0a                	jl     140e6d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253c58>
 140e6ca:	49 83 c7 18          	add    r15,0x18
 140e6ce:	eb cf                	jmp    140e69f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253c23>
 140e6d0:	31 c9                	xor    ecx,ecx
 140e6d2:	eb 2b                	jmp    140e6ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253c83>
 140e6d4:	48 8d 35 a1 38 04 ff 	lea    rsi,[rip+0xffffffffff0438a1]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 140e6db:	48 8d 0d fa a7 f1 fe 	lea    rcx,[rip+0xfffffffffef1a7fa]        # 328edc <_ZTSSt12bad_any_cast@@Base-0x672ec>
 140e6e2:	6a 03                	push   0x3
 140e6e4:	5f                   	pop    rdi
 140e6e5:	6a 36                	push   0x36
--
 140e746:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 140e74b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 140e750:	4c 89 e6             	mov    rsi,r12
 140e753:	e8 f4 a2 76 ff       	call   b78a4c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc59ec>
 140e758:	4c 89 e7             	mov    rdi,r12
 140e75b:	e8 5a a3 76 ff       	call   b78aba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc5a5a>
 140e760:	48 89 df             	mov    rdi,rbx
 140e763:	e8 ba 76 00 00       	call   1415e22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b3a6>
 140e768:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 140e76d:	e8 b6 cf 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 140e772:	0f 10 43 40          	movups xmm0,XMMWORD PTR [rbx+0x40]
 140e776:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
 140e77a:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
 140e77f:	0f 11 43 60          	movups XMMWORD PTR [rbx+0x60],xmm0
 140e783:	49 8b 06             	mov    rax,QWORD PTR [r14]
 140e786:	49 3b 46 08          	cmp    rax,QWORD PTR [r14+0x8]
 140e78a:	0f 94 43 70          	sete   BYTE PTR [rbx+0x70]
 140e78e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140e795:	00 00 
 140e797:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
 140e79c:	75 24                	jne    140e7c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253d46>
 140e79e:	48 83 c4 58          	add    rsp,0x58
 140e7a2:	5b                   	pop    rbx
 140e7a3:	41 5c                	pop    r12
 140e7a5:	41 5d                	pop    r13
 140e7a7:	41 5e                	pop    r14
 140e7a9:	41 5f                	pop    r15
 140e7ab:	5d                   	pop    rbp
 140e7ac:	c3                   	ret
 140e7ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140e7b4:	00 00 
 140e7b6:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
 140e7bb:	75 05                	jne    140e7c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253d46>
 140e7bd:	e8 fe 5d 5f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
 140e7c2:	e8 e9 12 3e 00       	call   17efab0 <__stack_chk_fail@plt>
 140e7c7:	48 89 c7             	mov    rdi,rax
 140e7ca:	e8 d6 b2 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
--
 140e801:	75 dd                	jne    140e7e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253d64>
 140e803:	eb 03                	jmp    140e808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253d8c>
 140e805:	49 89 c8             	mov    r8,rcx
 140e808:	4c 89 46 08          	mov    QWORD PTR [rsi+0x8],r8
 140e80c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 140e80f:	4c 89 07             	mov    QWORD PTR [rdi],r8
 140e812:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 140e816:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 140e81a:	48 8b 4e 10          	mov    rcx,QWORD PTR [rsi+0x10]
 140e81e:	48 89 4f 08          	mov    QWORD PTR [rdi+0x8],rcx
 140e822:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
 140e826:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 140e82a:	48 8b 4e 18          	mov    rcx,QWORD PTR [rsi+0x18]
 140e82e:	48 89 4f 10          	mov    QWORD PTR [rdi+0x10],rcx
 140e832:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
 140e836:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
 140e83a:	48 89 06             	mov    QWORD PTR [rsi],rax
 140e83d:	c3                   	ret
 140e83e:	55                   	push   rbp
 140e83f:	41 57                	push   r15
 140e841:	41 56                	push   r14
 140e843:	41 55                	push   r13
 140e845:	41 54                	push   r12
 140e847:	53                   	push   rbx
 140e848:	48 83 ec 28          	sub    rsp,0x28
 140e84c:	48 89 fb             	mov    rbx,rdi
 140e84f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140e856:	00 00 
 140e858:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 140e85d:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]
 140e861:	48 8b 6f 10          	mov    rbp,QWORD PTR [rdi+0x10]
 140e865:	4c 8d 77 28          	lea    r14,[rdi+0x28]
 140e869:	49 39 ed             	cmp    r13,rbp
 140e86c:	74 67                	je     140e8d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253e59>
 140e86e:	31 c9                	xor    ecx,ecx
 140e870:	31 f6                	xor    esi,esi
 140e872:	41 83 7d 14 01       	cmp    DWORD PTR [r13+0x14],0x1
 140e877:	74 64                	je     140e8dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253e61>
 140e879:	48 63 43 20          	movsxd rax,DWORD PTR [rbx+0x20]
--
 140e888:	74 0f                	je     140e899 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253e1d>
 140e88a:	4c 0f af e0          	imul   r12,rax
 140e88e:	4c 89 e0             	mov    rax,r12
 140e891:	48 99                	cqo
 140e893:	48 f7 ff             	idiv   rdi
 140e896:	49 89 c4             	mov    r12,rax
 140e899:	45 8a 7d 10          	mov    r15b,BYTE PTR [r13+0x10]
 140e89d:	49 39 f4             	cmp    r12,rsi
 140e8a0:	7e 22                	jle    140e8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253e48>
 140e8a2:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
 140e8a6:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
 140e8ab:	c6 44 24 10 01       	mov    BYTE PTR [rsp+0x10],0x1
 140e8b0:	88 4c 24 18          	mov    BYTE PTR [rsp+0x18],cl
 140e8b4:	44 88 7c 24 19       	mov    BYTE PTR [rsp+0x19],r15b
 140e8b9:	4c 89 f7             	mov    rdi,r14
 140e8bc:	48 89 e6             	mov    rsi,rsp
 140e8bf:	e8 4c 74 00 00       	call   1415d10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b294>
 140e8c4:	49 83 c5 18          	add    r13,0x18
 140e8c8:	44 89 f9             	mov    ecx,r15d
 140e8cb:	4c 89 e6             	mov    rsi,r12
 140e8ce:	49 39 ed             	cmp    r13,rbp
 140e8d1:	75 9f                	jne    140e872 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253df6>
 140e8d3:	eb 0e                	jmp    140e8e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253e67>
 140e8d5:	45 31 e4             	xor    r12d,r12d
 140e8d8:	45 31 ff             	xor    r15d,r15d
 140e8db:	eb 06                	jmp    140e8e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253e67>
 140e8dd:	49 89 f4             	mov    r12,rsi
 140e8e0:	41 89 cf             	mov    r15d,ecx
 140e8e3:	48 89 e6             	mov    rsi,rsp
 140e8e6:	4c 89 26             	mov    QWORD PTR [rsi],r12
 140e8e9:	31 c0                	xor    eax,eax
 140e8eb:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
 140e8ee:	88 46 10             	mov    BYTE PTR [rsi+0x10],al
 140e8f1:	44 88 7e 18          	mov    BYTE PTR [rsi+0x18],r15b
 140e8f5:	44 88 7e 19          	mov    BYTE PTR [rsi+0x19],r15b
 140e8f9:	4c 89 f7             	mov    rdi,r14
 140e8fc:	e8 0f 74 00 00       	call   1415d10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b294>
 140e901:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
 140e905:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
 140e909:	48 29 c1             	sub    rcx,rax
 140e90c:	48 c1 f9 05          	sar    rcx,0x5
 140e910:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
 140e914:	48 89 4b 48          	mov    QWORD PTR [rbx+0x48],rcx
 140e918:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140e91f:	00 00 
 140e921:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 140e926:	75 0f                	jne    140e937 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253ebb>
 140e928:	48 83 c4 28          	add    rsp,0x28
 140e92c:	5b                   	pop    rbx
 140e92d:	41 5c                	pop    r12
 140e92f:	41 5d                	pop    r13
 140e931:	41 5e                	pop    r14
 140e933:	41 5f                	pop    r15
 140e935:	5d                   	pop    rbp
 140e936:	c3                   	ret
 140e937:	e8 74 11 3e 00       	call   17efab0 <__stack_chk_fail@plt>
 140e93c:	eb 00                	jmp    140e93e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253ec2>
 140e93e:	48 89 c7             	mov    rdi,rax
 140e941:	e8 5f b1 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 140e946:	48 8d 05 8b 11 46 00 	lea    rax,[rip+0x46118b]        # 186fad8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c1c0>
 140e94d:	48 89 07             	mov    QWORD PTR [rdi],rax
 140e950:	0f 57 c0             	xorps  xmm0,xmm0
 140e953:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
 140e958:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
 140e95c:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
 140e960:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 140e964:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 140e968:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 140e96c:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
 140e970:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
 140e974:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
 140e978:	48 83 66 18 00       	and    QWORD PTR [rsi+0x18],0x0
 140e97d:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
 140e981:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
 140e985:	48 83 67 38 00       	and    QWORD PTR [rdi+0x38],0x0
 140e98a:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
 140e98e:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
 140e992:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
 140e996:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
 140e99a:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
 140e99e:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]
 140e9a2:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
 140e9a6:	0f 11 46 28          	movups XMMWORD PTR [rsi+0x28],xmm0
 140e9aa:	48 83 66 38 00       	and    QWORD PTR [rsi+0x38],0x0
 140e9af:	0f 10 46 40          	movups xmm0,XMMWORD PTR [rsi+0x40]
 140e9b3:	0f 11 47 40          	movups XMMWORD PTR [rdi+0x40],xmm0
 140e9b7:	8a 46 70             	mov    al,BYTE PTR [rsi+0x70]
 140e9ba:	88 47 70             	mov    BYTE PTR [rdi+0x70],al
 140e9bd:	0f 10 46 50          	movups xmm0,XMMWORD PTR [rsi+0x50]
 140e9c1:	0f 10 4e 60          	movups xmm1,XMMWORD PTR [rsi+0x60]
 140e9c5:	0f 11 4f 60          	movups XMMWORD PTR [rdi+0x60],xmm1
 140e9c9:	0f 11 47 50          	movups XMMWORD PTR [rdi+0x50],xmm0
 140e9cd:	c3                   	ret
 140e9ce:	53                   	push   rbx
 140e9cf:	48 89 fb             	mov    rbx,rdi
 140e9d2:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
--
 140eef4:	5b                   	pop    rbx
 140eef5:	41 5c                	pop    r12
 140eef7:	41 5d                	pop    r13
 140eef9:	41 5e                	pop    r14
 140eefb:	41 5f                	pop    r15
 140eefd:	e9 d0 3f 00 00       	jmp    1412ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258456>
 140ef02:	53                   	push   rbx
 140ef03:	48 89 fb             	mov    rbx,rdi
 140ef06:	4c 8b 0e             	mov    r9,QWORD PTR [rsi]
 140ef09:	49 8b 31             	mov    rsi,QWORD PTR [r9]
 140ef0c:	49 8b 51 08          	mov    rdx,QWORD PTR [r9+0x8]
 140ef10:	49 8b 49 10          	mov    rcx,QWORD PTR [r9+0x10]
 140ef14:	4d 8d 41 18          	lea    r8,[r9+0x18]
 140ef18:	49 83 c1 20          	add    r9,0x20
 140ef1c:	e8 de 4b 00 00       	call   1413aff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259083>
 140ef21:	48 89 d8             	mov    rax,rbx
 140ef24:	5b                   	pop    rbx
 140ef25:	c3                   	ret
 140ef26:	55                   	push   rbp
 140ef27:	41 57                	push   r15
 140ef29:	41 56                	push   r14
 140ef2b:	41 55                	push   r13
 140ef2d:	41 54                	push   r12
 140ef2f:	53                   	push   rbx
 140ef30:	48 81 ec 88 02 00 00 	sub    rsp,0x288
 140ef37:	49 89 d6             	mov    r14,rdx
 140ef3a:	49 89 f7             	mov    r15,rsi
 140ef3d:	48 89 fb             	mov    rbx,rdi
 140ef40:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140ef47:	00 00 
 140ef49:	48 89 84 24 80 02 00 	mov    QWORD PTR [rsp+0x280],rax
 140ef50:	00 
 140ef51:	48 8d 05 60 0f 46 00 	lea    rax,[rip+0x460f60]        # 186feb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c5a0>
 140ef58:	48 89 07             	mov    QWORD PTR [rdi],rax
 140ef5b:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
 140ef62:	00 
 140ef63:	48 89 ce             	mov    rsi,rcx
--
 140f294:	41 5c                	pop    r12
 140f296:	41 5d                	pop    r13
 140f298:	41 5e                	pop    r14
 140f29a:	41 5f                	pop    r15
 140f29c:	5d                   	pop    rbp
 140f29d:	e9 30 3c 00 00       	jmp    1412ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258456>
 140f2a2:	53                   	push   rbx
 140f2a3:	48 89 fb             	mov    rbx,rdi
 140f2a6:	4c 8b 0e             	mov    r9,QWORD PTR [rsi]
 140f2a9:	49 8b 31             	mov    rsi,QWORD PTR [r9]
 140f2ac:	49 8b 51 08          	mov    rdx,QWORD PTR [r9+0x8]
 140f2b0:	49 8b 49 10          	mov    rcx,QWORD PTR [r9+0x10]
 140f2b4:	4d 8d 41 18          	lea    r8,[r9+0x18]
 140f2b8:	49 83 c1 20          	add    r9,0x20
 140f2bc:	e8 4d 17 00 00       	call   1410a0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255f92>
 140f2c1:	48 89 d8             	mov    rax,rbx
 140f2c4:	5b                   	pop    rbx
 140f2c5:	c3                   	ret
 140f2c6:	55                   	push   rbp
 140f2c7:	41 57                	push   r15
 140f2c9:	41 56                	push   r14
 140f2cb:	41 55                	push   r13
 140f2cd:	41 54                	push   r12
 140f2cf:	53                   	push   rbx
 140f2d0:	48 81 ec 78 03 00 00 	sub    rsp,0x378
 140f2d7:	49 89 d6             	mov    r14,rdx
 140f2da:	49 89 f7             	mov    r15,rsi
 140f2dd:	48 89 fb             	mov    rbx,rdi
 140f2e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140f2e7:	00 00 
 140f2e9:	48 89 84 24 70 03 00 	mov    QWORD PTR [rsp+0x370],rax
 140f2f0:	00 
 140f2f1:	48 8d 05 68 0c 46 00 	lea    rax,[rip+0x460c68]        # 186ff60 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c648>
 140f2f8:	48 89 07             	mov    QWORD PTR [rdi],rax
 140f2fb:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
 140f302:	00 
 140f303:	48 89 ce             	mov    rsi,rcx
--
 140f67a:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 140f67f:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 140f683:	48 85 c0             	test   rax,rax
 140f686:	74 22                	je     140f6aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254c2e>
 140f688:	48 89 fb             	mov    rbx,rdi
 140f68b:	49 89 f6             	mov    r14,rsi
 140f68e:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 140f692:	6a 01                	push   0x1
 140f694:	5f                   	pop    rdi
 140f695:	48 89 de             	mov    rsi,rbx
 140f698:	4c 89 f2             	mov    rdx,r14
 140f69b:	ff d0                	call   rax
 140f69d:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 140f6a1:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 140f6a5:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 140f6aa:	48 83 c4 08          	add    rsp,0x8
 140f6ae:	5b                   	pop    rbx
 140f6af:	41 5e                	pop    r14
 140f6b1:	c3                   	ret
 140f6b2:	48 89 c7             	mov    rdi,rax
 140f6b5:	e8 eb a3 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 140f6ba:	41 56                	push   r14
 140f6bc:	53                   	push   rbx
 140f6bd:	48 83 ec 18          	sub    rsp,0x18
 140f6c1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 140f6c8:	00 00 
 140f6ca:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 140f6cf:	48 83 bf 48 03 00 00 	cmp    QWORD PTR [rdi+0x348],0x0
 140f6d6:	00 
 140f6d7:	0f 85 9b 00 00 00    	jne    140f778 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254cfc>
 140f6dd:	48 89 fb             	mov    rbx,rdi
 140f6e0:	48 8d b7 50 03 00 00 	lea    rsi,[rdi+0x350]
 140f6e7:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 140f6ec:	4c 89 f7             	mov    rdi,r14
 140f6ef:	ff 93 68 03 00 00    	call   QWORD PTR [rbx+0x368]
 140f6f5:	49 8b 06             	mov    rax,QWORD PTR [r14]
 140f6f8:	49 83 26 00          	and    QWORD PTR [r14],0x0
 140f6fc:	48 8b bb 48 03 00 00 	mov    rdi,QWORD PTR [rbx+0x348]
--
 140f970:	f2 0f 10 4e 0c       	movsd  xmm1,QWORD PTR [rsi+0xc]
 140f975:	0f c2 c8 00          	cmpeqps xmm1,xmm0
 140f979:	0f 14 c9             	unpcklps xmm1,xmm1
 140f97c:	66 0f 50 c9          	movmskpd ecx,xmm1
 140f980:	20 c8                	and    al,cl
 140f982:	d0 e9                	shr    cl,1
 140f984:	20 c1                	and    cl,al
 140f986:	f3 0f 10 47 14       	movss  xmm0,DWORD PTR [rdi+0x14]
 140f98b:	0f 2e 46 14          	ucomiss xmm0,DWORD PTR [rsi+0x14]
 140f98f:	0f 9b c0             	setnp  al
 140f992:	0f 94 c2             	sete   dl
 140f995:	20 c2                	and    dl,al
 140f997:	8b 47 18             	mov    eax,DWORD PTR [rdi+0x18]
 140f99a:	3b 46 18             	cmp    eax,DWORD PTR [rsi+0x18]
 140f99d:	0f 94 c0             	sete   al
 140f9a0:	20 c8                	and    al,cl
 140f9a2:	20 d0                	and    al,dl
 140f9a4:	c3                   	ret
 140f9a5:	f3 0f 10 06          	movss  xmm0,DWORD PTR [rsi]
 140f9a9:	f3 0f 11 07          	movss  DWORD PTR [rdi],xmm0
 140f9ad:	f3 0f 10 46 04       	movss  xmm0,DWORD PTR [rsi+0x4]
 140f9b2:	f3 0f 11 47 04       	movss  DWORD PTR [rdi+0x4],xmm0
 140f9b7:	f3 0f 10 46 08       	movss  xmm0,DWORD PTR [rsi+0x8]
 140f9bc:	f3 0f 11 47 08       	movss  DWORD PTR [rdi+0x8],xmm0
 140f9c1:	f3 0f 10 46 0c       	movss  xmm0,DWORD PTR [rsi+0xc]
 140f9c6:	f3 0f 11 47 0c       	movss  DWORD PTR [rdi+0xc],xmm0
 140f9cb:	f3 0f 10 46 10       	movss  xmm0,DWORD PTR [rsi+0x10]
 140f9d0:	f3 0f 11 47 10       	movss  DWORD PTR [rdi+0x10],xmm0
 140f9d5:	f3 0f 10 46 14       	movss  xmm0,DWORD PTR [rsi+0x14]
 140f9da:	f3 0f 11 47 14       	movss  DWORD PTR [rdi+0x14],xmm0
 140f9df:	8b 46 18             	mov    eax,DWORD PTR [rsi+0x18]
 140f9e2:	89 47 18             	mov    DWORD PTR [rdi+0x18],eax
 140f9e5:	c3                   	ret
 140f9e6:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 140f9ea:	f3 0f 10 06          	movss  xmm0,DWORD PTR [rsi]
 140f9ee:	f3 0f 10 4e 04       	movss  xmm1,DWORD PTR [rsi+0x4]
 140f9f3:	f3 0f 10 56 08       	movss  xmm2,DWORD PTR [rsi+0x8]
 140f9f8:	f3 0f 10 5e 0c       	movss  xmm3,DWORD PTR [rsi+0xc]
 140f9fd:	f3 0f 10 66 10       	movss  xmm4,DWORD PTR [rsi+0x10]
 140fa02:	f3 0f 10 6e 14       	movss  xmm5,DWORD PTR [rsi+0x14]
 140fa07:	8b 76 18             	mov    esi,DWORD PTR [rsi+0x18]
 140fa0a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 140fa0d:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
 140fa11:	ff e0                	jmp    rax
 140fa13:	cc                   	int3
 140fa14:	41 56                	push   r14
 140fa16:	53                   	push   rbx
 140fa17:	50                   	push   rax
 140fa18:	48 89 fb             	mov    rbx,rdi
 140fa1b:	48 8d 05 3e 05 46 00 	lea    rax,[rip+0x46053e]        # 186ff60 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c648>
 140fa22:	48 89 07             	mov    QWORD PTR [rdi],rax
 140fa25:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 140fa29:	48 81 c7 78 03 00 00 	add    rdi,0x378
 140fa30:	e8 f3 a3 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 140fa35:	48 8d bb 58 03 00 00 	lea    rdi,[rbx+0x358]
 140fa3c:	e8 bf fb ff ff       	call   140f600 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b84>
 140fa41:	48 81 c3 50 03 00 00 	add    rbx,0x350
 140fa48:	48 89 df             	mov    rdi,rbx
 140fa4b:	e8 d8 a3 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 140fa50:	4c 89 f7             	mov    rdi,r14
 140fa53:	48 83 c4 08          	add    rsp,0x8
 140fa57:	5b                   	pop    rbx
 140fa58:	41 5e                	pop    r14
 140fa5a:	e9 37 fd ff ff       	jmp    140f796 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254d1a>
 140fa5f:	cc                   	int3
--
 140ff20:	00 
 140ff21:	0f 84 65 06 00 00    	je     141058c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255b10>
 140ff27:	48 89 c3             	mov    rbx,rax
 140ff2a:	4c 89 ef             	mov    rdi,r13
 140ff2d:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
 140ff32:	4c 89 f2             	mov    rdx,r14
 140ff35:	e8 8d 07 00 00       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 140ff3a:	f3 0f 11 84 24 bc 00 	movss  DWORD PTR [rsp+0xbc],xmm0
 140ff41:	00 00 
 140ff43:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 140ff47:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
 140ff4e:	00 
 140ff4f:	f3 41 0f 10 45 18    	movss  xmm0,DWORD PTR [r13+0x18]
 140ff55:	f3 0f 11 44 24 7c    	movss  DWORD PTR [rsp+0x7c],xmm0
 140ff5b:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]
 140ff60:	4c 89 ff             	mov    rdi,r15
 140ff63:	48 8b b4 24 90 00 00 	mov    rsi,QWORD PTR [rsp+0x90]
 140ff6a:	00 
 140ff6b:	4c 89 f2             	mov    rdx,r14
 140ff6e:	e8 54 07 00 00       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 140ff73:	f3 0f 11 84 24 b8 00 	movss  DWORD PTR [rsp+0xb8],xmm0
 140ff7a:	00 00 
 140ff7c:	49 8b 07             	mov    rax,QWORD PTR [r15]
 140ff7f:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
 140ff86:	00 
 140ff87:	f3 41 0f 10 47 18    	movss  xmm0,DWORD PTR [r15+0x18]
 140ff8d:	f3 0f 11 44 24 78    	movss  DWORD PTR [rsp+0x78],xmm0
 140ff93:	4c 89 e7             	mov    rdi,r12
 140ff96:	48 89 ac 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rbp
 140ff9d:	00 
 140ff9e:	48 89 ee             	mov    rsi,rbp
 140ffa1:	4c 89 f2             	mov    rdx,r14
 140ffa4:	e8 1e 07 00 00       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 140ffa9:	f3 0f 11 84 24 b4 00 	movss  DWORD PTR [rsp+0xb4],xmm0
 140ffb0:	00 00 
 140ffb2:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 140ffb6:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
 140ffbd:	00 
 140ffbe:	4c 89 a4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r12
 140ffc5:	00 
 140ffc6:	f3 41 0f 10 44 24 18 	movss  xmm0,DWORD PTR [r12+0x18]
 140ffcd:	f3 0f 11 44 24 74    	movss  DWORD PTR [rsp+0x74],xmm0
 140ffd3:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]
 140ffd8:	4c 89 e7             	mov    rdi,r12
 140ffdb:	48 8b b4 24 c8 00 00 	mov    rsi,QWORD PTR [rsp+0xc8]
 140ffe2:	00 
 140ffe3:	4c 89 f2             	mov    rdx,r14
 140ffe6:	e8 dc 06 00 00       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 140ffeb:	f3 0f 11 84 24 b0 00 	movss  DWORD PTR [rsp+0xb0],xmm0
 140fff2:	00 00 
 140fff4:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 140fff8:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
 140ffff:	00 
 1410000:	f3 41 0f 10 44 24 18 	movss  xmm0,DWORD PTR [r12+0x18]
 1410007:	f3 0f 11 44 24 70    	movss  DWORD PTR [rsp+0x70],xmm0
 141000d:	4c 8b a4 24 a0 00 00 	mov    r12,QWORD PTR [rsp+0xa0]
 1410014:	00 
 1410015:	4c 89 e7             	mov    rdi,r12
 1410018:	48 8b b4 24 88 00 00 	mov    rsi,QWORD PTR [rsp+0x88]
 141001f:	00 
 1410020:	4c 89 f2             	mov    rdx,r14
 1410023:	e8 9f 06 00 00       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 1410028:	f3 0f 11 84 24 ac 00 	movss  DWORD PTR [rsp+0xac],xmm0
 141002f:	00 00 
 1410031:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 1410035:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
 141003c:	00 
 141003d:	f3 41 0f 10 44 24 18 	movss  xmm0,DWORD PTR [r12+0x18]
 1410044:	f3 0f 11 44 24 6c    	movss  DWORD PTR [rsp+0x6c],xmm0
 141004a:	48 8b ac 24 98 00 00 	mov    rbp,QWORD PTR [rsp+0x98]
 1410051:	00 
 1410052:	48 89 ef             	mov    rdi,rbp
 1410055:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
 141005c:	00 
 141005d:	4c 89 f2             	mov    rdx,r14
 1410060:	e8 62 06 00 00       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 1410065:	f3 0f 11 84 24 a8 00 	movss  DWORD PTR [rsp+0xa8],xmm0
 141006c:	00 00 
 141006e:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 1410072:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
 1410079:	00 
 141007a:	f3 0f 10 45 18       	movss  xmm0,DWORD PTR [rbp+0x18]
 141007f:	f3 0f 11 44 24 68    	movss  DWORD PTR [rsp+0x68],xmm0
 1410085:	48 89 df             	mov    rdi,rbx
 1410088:	48 8b b4 24 c0 00 00 	mov    rsi,QWORD PTR [rsp+0xc0]
 141008f:	00 
 1410090:	4c 89 f2             	mov    rdx,r14
 1410093:	e8 00 07 00 00       	call   1410798 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d1c>
 1410098:	89 84 24 dc 00 00 00 	mov    DWORD PTR [rsp+0xdc],eax
 141009f:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
 14100a3:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 14100a6:	49 89 dc             	mov    r12,rbx
 14100a9:	8b 73 18             	mov    esi,DWORD PTR [rbx+0x18]
 14100ac:	4c 89 f2             	mov    rdx,r14
 14100af:	e8 b9 07 00 00       	call   141086d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255df1>
 14100b4:	89 c3                	mov    ebx,eax
 14100b6:	41 80 7d 10 00       	cmp    BYTE PTR [r13+0x10],0x0
 14100bb:	49 b9 ff ff ff ff ff 	movabs r9,0x7fffffffffffffff
 14100c2:	ff ff 7f 
 14100c5:	4c 89 c8             	mov    rax,r9
 14100c8:	4d 89 f7             	mov    r15,r14
 14100cb:	74 07                	je     14100d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255658>
 14100cd:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 14100d1:	4c 29 f8             	sub    rax,r15
 14100d4:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
 14100db:	00 
 14100dc:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
 14100e1:	80 79 10 00          	cmp    BYTE PTR [rcx+0x10],0x0
 14100e5:	4c 89 c8             	mov    rax,r9
 14100e8:	48 8b ac 24 40 01 00 	mov    rbp,QWORD PTR [rsp+0x140]
 14100ef:	00 
 14100f0:	74 07                	je     14100f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25567d>
 14100f2:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
 14100f6:	4c 29 f8             	sub    rax,r15
 14100f9:	48 89 84 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rax
 1410100:	00 
 1410101:	4c 8b 84 24 e0 00 00 	mov    r8,QWORD PTR [rsp+0xe0]
--
 14106ea:	7f 2d                	jg     1410719 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c9d>
 14106ec:	8a 43 10             	mov    al,BYTE PTR [rbx+0x10]
 14106ef:	84 c0                	test   al,al
 14106f1:	74 06                	je     14106f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c7d>
 14106f3:	48 39 53 08          	cmp    QWORD PTR [rbx+0x8],rdx
 14106f7:	7e 3d                	jle    1410736 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255cba>
 14106f9:	84 c0                	test   al,al
 14106fb:	74 1c                	je     1410719 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c9d>
 14106fd:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 1410701:	48 2b 03             	sub    rax,QWORD PTR [rbx]
 1410704:	7e 13                	jle    1410719 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c9d>
 1410706:	f3 0f 10 43 1c       	movss  xmm0,DWORD PTR [rbx+0x1c]
 141070b:	f3 0f 5c 43 18       	subss  xmm0,DWORD PTR [rbx+0x18]
 1410710:	f3 48 0f 2a c8       	cvtsi2ss xmm1,rax
 1410715:	f3 0f 5e c1          	divss  xmm0,xmm1
 1410719:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1410720:	00 00 
 1410722:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 1410727:	75 08                	jne    1410731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255cb5>
 1410729:	48 83 c4 48          	add    rsp,0x48
 141072d:	5b                   	pop    rbx
 141072e:	41 5e                	pop    r14
 1410730:	c3                   	ret
 1410731:	e8 7a f3 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 1410736:	0f 57 c0             	xorps  xmm0,xmm0
 1410739:	49 89 e6             	mov    r14,rsp
 141073c:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
 1410740:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 1410745:	48 8d 35 5e 8f f2 fe 	lea    rsi,[rip+0xfffffffffef28f5e]        # 3396aa <_ZTSSt12bad_any_cast@@Base-0x56b1e>
 141074c:	4c 89 f7             	mov    rdi,r14
 141074f:	e8 9e 58 3c 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
 1410754:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 1410759:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1
 1410760:	48 8d 05 15 18 04 ff 	lea    rax,[rip+0xffffffffff041815]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 1410767:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 141076b:	48 8d 05 e1 22 f6 fe 	lea    rax,[rip+0xfffffffffef622e1]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>
 1410772:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 1410776:	c7 47 18 40 00 00 00 	mov    DWORD PTR [rdi+0x18],0x40
 141077d:	4c 89 f6             	mov    rsi,r14
 1410780:	e8 23 95 69 ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
 1410785:	4c 89 f7             	mov    rdi,r14
 1410788:	e8 03 d7 3d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 141078d:	0f 57 c0             	xorps  xmm0,xmm0
 1410790:	8a 43 10             	mov    al,BYTE PTR [rbx+0x10]
 1410793:	e9 61 ff ff ff       	jmp    14106f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c7d>
 1410798:	41 57                	push   r15
 141079a:	41 56                	push   r14
 141079c:	53                   	push   rbx
 141079d:	48 83 ec 40          	sub    rsp,0x40
 14107a1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14107a8:	00 00 
 14107aa:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 14107af:	31 db                	xor    ebx,ebx
 14107b1:	48 85 f6             	test   rsi,rsi
 14107b4:	74 36                	je     14107ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d70>
 14107b6:	49 89 fe             	mov    r14,rdi
 14107b9:	48 39 17             	cmp    QWORD PTR [rdi],rdx
 14107bc:	7f 2e                	jg     14107ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d70>
 14107be:	41 8a 46 10          	mov    al,BYTE PTR [r14+0x10]
 14107c2:	84 c0                	test   al,al
 14107c4:	74 06                	je     14107cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d50>
 14107c6:	49 39 56 08          	cmp    QWORD PTR [r14+0x8],rdx
 14107ca:	7e 41                	jle    141080d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d91>
 14107cc:	84 c0                	test   al,al
 14107ce:	74 1c                	je     14107ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d70>
 14107d0:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
 14107d4:	49 2b 0e             	sub    rcx,QWORD PTR [r14]
 14107d7:	7e 13                	jle    14107ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d70>
 14107d9:	49 63 46 1c          	movsxd rax,DWORD PTR [r14+0x1c]
 14107dd:	49 63 56 18          	movsxd rdx,DWORD PTR [r14+0x18]
 14107e1:	48 29 d0             	sub    rax,rdx
 14107e4:	48 99                	cqo
 14107e6:	48 f7 f9             	idiv   rcx
 14107e9:	48 89 c3             	mov    rbx,rax
 14107ec:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14107f3:	00 00 
 14107f5:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
 14107fa:	75 0c                	jne    1410808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d8c>
 14107fc:	89 d8                	mov    eax,ebx
 14107fe:	48 83 c4 40          	add    rsp,0x40
 1410802:	5b                   	pop    rbx
 1410803:	41 5e                	pop    r14
 1410805:	41 5f                	pop    r15
 1410807:	c3                   	ret
 1410808:	e8 a3 f2 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 141080d:	0f 57 c0             	xorps  xmm0,xmm0
 1410810:	49 89 e7             	mov    r15,rsp
 1410813:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
 1410817:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 141081c:	48 8d 35 87 8e f2 fe 	lea    rsi,[rip+0xfffffffffef28e87]        # 3396aa <_ZTSSt12bad_any_cast@@Base-0x56b1e>
 1410823:	4c 89 ff             	mov    rdi,r15
 1410826:	e8 c7 57 3c 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
 141082b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 1410830:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1
 1410837:	48 8d 05 3e 17 04 ff 	lea    rax,[rip+0xffffffffff04173e]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 141083e:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 1410842:	48 8d 05 0a 22 f6 fe 	lea    rax,[rip+0xfffffffffef6220a]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>
 1410849:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 141084d:	c7 47 18 40 00 00 00 	mov    DWORD PTR [rdi+0x18],0x40
 1410854:	4c 89 fe             	mov    rsi,r15
 1410857:	e8 4c 94 69 ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
 141085c:	4c 89 ff             	mov    rdi,r15
 141085f:	e8 2c d6 3d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1410864:	41 8a 46 10          	mov    al,BYTE PTR [r14+0x10]
 1410868:	e9 5f ff ff ff       	jmp    14107cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d50>
 141086d:	89 f0                	mov    eax,esi
 141086f:	48 29 fa             	sub    rdx,rdi
 1410872:	7c 15                	jl     1410889 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e0d>
 1410874:	f3 0f 2a c8          	cvtsi2ss xmm1,eax
 1410878:	f3 48 0f 2a d2       	cvtsi2ss xmm2,rdx
 141087d:	f3 0f 59 c2          	mulss  xmm0,xmm2
 1410881:	f3 0f 58 c1          	addss  xmm0,xmm1
 1410885:	f3 0f 2c c0          	cvttss2si eax,xmm0
 1410889:	c3                   	ret
 141088a:	48 83 fe 02          	cmp    rsi,0x2
 141088e:	72 27                	jb     14108b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e3b>
 1410890:	48 8d 47 08          	lea    rax,[rdi+0x8]
 1410894:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
 1410897:	48 8d 14 f5 f8 ff ff 	lea    rdx,[rsi*8-0x8]
 141089e:	ff 
 141089f:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 14108a2:	48 39 ce             	cmp    rsi,rcx
 14108a5:	48 0f 4c ce          	cmovl  rcx,rsi
--
 1410987:	41 5c                	pop    r12
 1410989:	41 5d                	pop    r13
 141098b:	41 5e                	pop    r14
 141098d:	41 5f                	pop    r15
 141098f:	c3                   	ret
 1410990:	0f 57 c0             	xorps  xmm0,xmm0
 1410993:	49 89 e5             	mov    r13,rsp
 1410996:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
 141099b:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
 14109a0:	48 8d 35 7e ce f4 fe 	lea    rsi,[rip+0xfffffffffef4ce7e]        # 35d825 <_ZTSSt12bad_any_cast@@Base-0x329a3>
 14109a7:	4c 89 ef             	mov    rdi,r13
 14109aa:	e8 43 56 3c 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
 14109af:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 14109b4:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1
 14109bb:	48 8d 05 ba 15 04 ff 	lea    rax,[rip+0xffffffffff0415ba]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 14109c2:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 14109c6:	48 8d 05 86 20 f6 fe 	lea    rax,[rip+0xfffffffffef62086]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>
 14109cd:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 14109d1:	c7 47 18 3b 00 00 00 	mov    DWORD PTR [rdi+0x18],0x3b
 14109d8:	4c 89 ee             	mov    rsi,r13
 14109db:	e8 c8 92 69 ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
 14109e0:	4c 89 ef             	mov    rdi,r13
 14109e3:	e8 a8 d4 3d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14109e8:	e9 58 ff ff ff       	jmp    1410945 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255ec9>
 14109ed:	e8 be f0 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 14109f2:	53                   	push   rbx
 14109f3:	48 89 f3             	mov    rbx,rsi
 14109f6:	48 89 fa             	mov    rdx,rdi
 14109f9:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
 14109fc:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
 1410a00:	e8 b6 fe ff ff       	call   14108bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e3f>
 1410a05:	48 89 03             	mov    QWORD PTR [rbx],rax
 1410a08:	48 89 53 08          	mov    QWORD PTR [rbx+0x8],rdx
 1410a0c:	5b                   	pop    rbx
 1410a0d:	c3                   	ret
 1410a0e:	55                   	push   rbp
 1410a0f:	41 57                	push   r15
 1410a11:	41 56                	push   r14
 1410a13:	41 55                	push   r13
 1410a15:	41 54                	push   r12
 1410a17:	53                   	push   rbx
 1410a18:	48 81 ec 18 01 00 00 	sub    rsp,0x118
 1410a1f:	4d 89 cc             	mov    r12,r9
 1410a22:	4d 89 c6             	mov    r14,r8
 1410a25:	49 89 cd             	mov    r13,rcx
 1410a28:	48 89 d5             	mov    rbp,rdx
 1410a2b:	49 89 f7             	mov    r15,rsi
 1410a2e:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
 1410a33:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1410a3a:	00 00 
 1410a3c:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
 1410a43:	00 
 1410a44:	bf 08 04 00 00       	mov    edi,0x408
 1410a49:	e8 b2 d4 3d 00       	call   17edf00 <_Znwm@plt>
 1410a4e:	48 89 c3             	mov    rbx,rax
 1410a51:	48 8d 05 c8 f4 45 00 	lea    rax,[rip+0x45f4c8]        # 186ff20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c608>
 1410a58:	48 89 03             	mov    QWORD PTR [rbx],rax
 1410a5b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
 1410a5f:	48 89 6b 10          	mov    QWORD PTR [rbx+0x10],rbp
 1410a63:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1410a66:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
 1410a6a:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 1410a6e:	f3 0f 5e 05 fa dc f7 	divss  xmm0,DWORD PTR [rip+0xfffffffffef7dcfa]        # 38e770 <_ZTSSt12bad_any_cast@@Base-0x1a58>
 1410a75:	fe 
 1410a76:	f3 0f 11 43 20       	movss  DWORD PTR [rbx+0x20],xmm0
 1410a7b:	6a 02                	push   0x2
 1410a7d:	59                   	pop    rcx
 1410a7e:	99                   	cdq
 1410a7f:	f7 f9                	idiv   ecx
 1410a81:	89 43 24             	mov    DWORD PTR [rbx+0x24],eax
 1410a84:	41 8b 44 24 08       	mov    eax,DWORD PTR [r12+0x8]
 1410a89:	89 43 28             	mov    DWORD PTR [rbx+0x28],eax
 1410a8c:	41 8a 44 24 11       	mov    al,BYTE PTR [r12+0x11]
 1410a91:	88 43 2c             	mov    BYTE PTR [rbx+0x2c],al
 1410a94:	f3 41 0f 10 44 24 14 	movss  xmm0,DWORD PTR [r12+0x14]
 1410a9b:	f3 0f 10 0d e5 db f7 	movss  xmm1,DWORD PTR [rip+0xfffffffffef7dbe5]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
 1410aa2:	fe 
 1410aa3:	f3 0f 5d c8          	minss  xmm1,xmm0
 1410aa7:	0f 57 d2             	xorps  xmm2,xmm2
 1410aaa:	f3 0f c2 c2 01       	cmpltss xmm0,xmm2
 1410aaf:	0f 55 c1             	andnps xmm0,xmm1
 1410ab2:	f3 0f 11 43 30       	movss  DWORD PTR [rbx+0x30],xmm0
 1410ab7:	0f 28 05 62 ce f7 fe 	movaps xmm0,XMMWORD PTR [rip+0xfffffffffef7ce62]        # 38d920 <_ZTSSt12bad_any_cast@@Base-0x28a8>
 1410abe:	0f 11 43 34          	movups XMMWORD PTR [rbx+0x34],xmm0
 1410ac2:	f3 0f 10 05 be db f7 	movss  xmm0,DWORD PTR [rip+0xfffffffffef7dbbe]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
 1410ac9:	fe 
--
 1410c1b:	31 c9                	xor    ecx,ecx
 1410c1d:	88 8b f4 03 00 00    	mov    BYTE PTR [rbx+0x3f4],cl
 1410c23:	48 83 a3 ec 03 00 00 	and    QWORD PTR [rbx+0x3ec],0x0
 1410c2a:	00 
 1410c2b:	89 83 f8 03 00 00    	mov    DWORD PTR [rbx+0x3f8],eax
 1410c31:	48 83 a3 fc 03 00 00 	and    QWORD PTR [rbx+0x3fc],0x0
 1410c38:	00 
 1410c39:	48 8d ab 38 02 00 00 	lea    rbp,[rbx+0x238]
 1410c40:	88 8b 04 04 00 00    	mov    BYTE PTR [rbx+0x404],cl
 1410c46:	f3 0f 10 43 40       	movss  xmm0,DWORD PTR [rbx+0x40]
 1410c4b:	8b 7b 24             	mov    edi,DWORD PTR [rbx+0x24]
 1410c4e:	e8 67 08 00 00       	call   14114ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256a3e>
 1410c53:	8b 73 18             	mov    esi,DWORD PTR [rbx+0x18]
 1410c56:	4c 8d b4 24 e0 00 00 	lea    r14,[rsp+0xe0]
 1410c5d:	00 
 1410c5e:	f2 0f 10 05 2a e6 f7 	movsd  xmm0,QWORD PTR [rip+0xfffffffffef7e62a]        # 38f290 <_ZTSSt12bad_any_cast@@Base-0xf38>
 1410c65:	fe 
 1410c66:	4c 89 f7             	mov    rdi,r14
 1410c69:	89 c2                	mov    edx,eax
 1410c6b:	e8 57 b4 01 00       	call   142c0c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27164b>
 1410c70:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
 1410c74:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1410c77:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
 1410c7e:	00 
 1410c7f:	4c 89 f2             	mov    rdx,r14
 1410c82:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1410c85:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
 1410c8c:	00 
 1410c8d:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
 1410c94:	00 00 
 1410c96:	48 8b bb 00 01 00 00 	mov    rdi,QWORD PTR [rbx+0x100]
 1410c9d:	48 89 83 00 01 00 00 	mov    QWORD PTR [rbx+0x100],rax
 1410ca4:	48 85 ff             	test   rdi,rdi
 1410ca7:	74 22                	je     1410ccb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25624f>
 1410ca9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1410cac:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1410caf:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
--
 1410d7e:	fe 
 1410d7f:	f3 48 0f 2c f1       	cvttss2si rsi,xmm1
 1410d84:	48 21 ce             	and    rsi,rcx
 1410d87:	48 09 c6             	or     rsi,rax
 1410d8a:	4c 89 f7             	mov    rdi,r14
 1410d8d:	31 d2                	xor    edx,edx
 1410d8f:	e8 10 08 00 00       	call   14115a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256b28>
 1410d94:	49 ff c4             	inc    r12
 1410d97:	49 83 c7 08          	add    r15,0x8
 1410d9b:	49 83 c6 40          	add    r14,0x40
 1410d9f:	49 83 fc 04          	cmp    r12,0x4
 1410da3:	0f 85 65 ff ff ff    	jne    1410d0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256292>
 1410da9:	f3 0f 2a 43 18       	cvtsi2ss xmm0,DWORD PTR [rbx+0x18]
 1410dae:	48 8d bb 10 01 00 00 	lea    rdi,[rbx+0x110]
 1410db5:	f3 0f 59 05 d3 da f7 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef7dad3]        # 38e890 <_ZTSSt12bad_any_cast@@Base-0x1938>
 1410dbc:	fe 
 1410dbd:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
 1410dc3:	0f 57 c9             	xorps  xmm1,xmm1
 1410dc6:	f3 0f 5f c1          	maxss  xmm0,xmm1
 1410dca:	f3 48 0f 2c c0       	cvttss2si rax,xmm0
 1410dcf:	48 89 c1             	mov    rcx,rax
 1410dd2:	48 c1 f9 3f          	sar    rcx,0x3f
 1410dd6:	f3 0f 5c 05 3e da f7 	subss  xmm0,DWORD PTR [rip+0xfffffffffef7da3e]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
 1410ddd:	fe 
 1410dde:	f3 48 0f 2c f0       	cvttss2si rsi,xmm0
 1410de3:	48 21 ce             	and    rsi,rcx
 1410de6:	48 09 c6             	or     rsi,rax
 1410de9:	31 d2                	xor    edx,edx
 1410deb:	e8 f8 06 00 00       	call   14114e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256a6c>
 1410df0:	f3 0f 10 43 3c       	movss  xmm0,DWORD PTR [rbx+0x3c]
 1410df5:	8b 7b 24             	mov    edi,DWORD PTR [rbx+0x24]
 1410df8:	e8 53 07 00 00       	call   1411550 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256ad4>
 1410dfd:	44 8b 73 18          	mov    r14d,DWORD PTR [rbx+0x18]
 1410e01:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
 1410e08:	00 
 1410e09:	f2 0f 10 05 7f e4 f7 	movsd  xmm0,QWORD PTR [rip+0xfffffffffef7e47f]        # 38f290 <_ZTSSt12bad_any_cast@@Base-0xf38>
 1410e10:	fe 
 1410e11:	44 89 f6             	mov    esi,r14d
 1410e14:	89 c2                	mov    edx,eax
 1410e16:	e8 ac b2 01 00       	call   142c0c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27164b>
 1410e1b:	8b 53 28             	mov    edx,DWORD PTR [rbx+0x28]
 1410e1e:	85 d2                	test   edx,edx
 1410e20:	74 67                	je     1410e89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25640d>
 1410e22:	4c 8d bc 24 80 00 00 	lea    r15,[rsp+0x80]
 1410e29:	00 
 1410e2a:	f2 0f 10 05 5e e4 f7 	movsd  xmm0,QWORD PTR [rip+0xfffffffffef7e45e]        # 38f290 <_ZTSSt12bad_any_cast@@Base-0xf38>
 1410e31:	fe 
 1410e32:	4c 89 ff             	mov    rdi,r15
 1410e35:	44 89 f6             	mov    esi,r14d
 1410e38:	e8 3a b3 01 00       	call   142c177 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2716fb>
 1410e3d:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
 1410e41:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1410e44:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 1410e49:	4c 89 fa             	mov    rdx,r15
 1410e4c:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1410e4f:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 1410e54:	48 83 64 24 78 00    	and    QWORD PTR [rsp+0x78],0x0
--
 1411274:	fe 
 1411275:	f3 48 0f 2c c0       	cvttss2si rax,xmm0
 141127a:	48 89 c1             	mov    rcx,rax
 141127d:	f3 0f 5c 05 97 d5 f7 	subss  xmm0,DWORD PTR [rip+0xfffffffffef7d597]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
 1411284:	fe 
 1411285:	f3 48 0f 2c d0       	cvttss2si rdx,xmm0
 141128a:	48 c1 f9 3f          	sar    rcx,0x3f
 141128e:	48 21 ca             	and    rdx,rcx
 1411291:	48 09 c2             	or     rdx,rax
 1411294:	48 8d bb c0 03 00 00 	lea    rdi,[rbx+0x3c0]
 141129b:	48 89 d6             	mov    rsi,rdx
 141129e:	e8 45 02 00 00       	call   14114e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256a6c>
 14112a3:	f3 0f 2a 43 18       	cvtsi2ss xmm0,DWORD PTR [rbx+0x18]
 14112a8:	f3 0f 10 15 d8 d3 f7 	movss  xmm2,DWORD PTR [rip+0xfffffffffef7d3d8]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
 14112af:	fe 
 14112b0:	f3 0f 5f c2          	maxss  xmm0,xmm2
 14112b4:	f3 0f 11 83 e8 03 00 	movss  DWORD PTR [rbx+0x3e8],xmm0
 14112bb:	00 
 14112bc:	f3 0f 10 0d d4 d4 f7 	movss  xmm1,DWORD PTR [rip+0xfffffffffef7d4d4]        # 38e798 <_ZTSSt12bad_any_cast@@Base-0x1a30>
 14112c3:	fe 
 14112c4:	f3 0f 59 c8          	mulss  xmm1,xmm0
 14112c8:	f3 0f 5d ca          	minss  xmm1,xmm2
 14112cc:	f3 0f 5e c8          	divss  xmm1,xmm0
 14112d0:	f3 0f 11 8b f0 03 00 	movss  DWORD PTR [rbx+0x3f0],xmm1
 14112d7:	00 
 14112d8:	31 c0                	xor    eax,eax
 14112da:	88 83 f4 03 00 00    	mov    BYTE PTR [rbx+0x3f4],al
 14112e0:	83 a3 ec 03 00 00 00 	and    DWORD PTR [rbx+0x3ec],0x0
 14112e7:	f3 0f 11 83 f8 03 00 	movss  DWORD PTR [rbx+0x3f8],xmm0
 14112ee:	00 
 14112ef:	f3 0f 11 8b 00 04 00 	movss  DWORD PTR [rbx+0x400],xmm1
 14112f6:	00 
 14112f7:	88 83 04 04 00 00    	mov    BYTE PTR [rbx+0x404],al
 14112fd:	c7 83 fc 03 00 00 00 	mov    DWORD PTR [rbx+0x3fc],0x3e800000
 1411304:	00 80 3e 
 1411307:	48 89 df             	mov    rdi,rbx
 141130a:	e8 f1 05 00 00       	call   1411900 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256e84>
 141130f:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 1411314:	48 89 18             	mov    QWORD PTR [rax],rbx
 1411317:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 141131e:	00 00 
 1411320:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
 1411327:	00 
 1411328:	0f 85 f8 00 00 00    	jne    1411426 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2569aa>
 141132e:	48 81 c4 18 01 00 00 	add    rsp,0x118
 1411335:	5b                   	pop    rbx
 1411336:	41 5c                	pop    r12
 1411338:	41 5d                	pop    r13
 141133a:	41 5e                	pop    r14
 141133c:	41 5f                	pop    r15
 141133e:	5d                   	pop    rbp
 141133f:	c3                   	ret
 1411340:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 1411344:	e9 b9 00 00 00       	jmp    1411402 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256986>
 1411349:	eb 00                	jmp    141134b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2568cf>
 141134b:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 141134f:	48 8d bb 10 03 00 00 	lea    rdi,[rbx+0x310]
 1411356:	4c 8d b3 10 01 00 00 	lea    r14,[rbx+0x110]
 141135d:	4c 8d a3 08 01 00 00 	lea    r12,[rbx+0x108]
 1411364:	4c 8d ab 00 01 00 00 	lea    r13,[rbx+0x100]
 141136b:	48 8d 83 e8 00 00 00 	lea    rax,[rbx+0xe8]
 1411372:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 1411377:	48 8d 83 d0 00 00 00 	lea    rax,[rbx+0xd0]
 141137e:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 1411383:	48 8d 83 b8 00 00 00 	lea    rax,[rbx+0xb8]
 141138a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 141138f:	49 89 df             	mov    r15,rbx
 1411392:	49 81 c7 a0 00 00 00 	add    r15,0xa0
 1411399:	e8 8e 00 00 00       	call   141142c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2569b0>
 141139e:	48 89 ef             	mov    rdi,rbp
 14113a1:	e8 86 00 00 00       	call   141142c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2569b0>
 14113a6:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
 14113ab:	e8 b0 00 00 00       	call   1411460 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2569e4>
 14113b0:	4c 89 f7             	mov    rdi,r14
 14113b3:	e8 70 a3 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 14113b8:	4c 89 e7             	mov    rdi,r12
 14113bb:	e8 68 8a 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 14113c0:	4c 89 ef             	mov    rdi,r13
 14113c3:	e8 60 8a 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 14113c8:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 14113cd:	e8 56 a3 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 14113d2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 14113d7:	e8 4c a3 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 14113dc:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 14113e1:	e8 42 a3 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 14113e6:	4c 89 ff             	mov    rdi,r15
 14113e9:	e8 3a a3 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 14113ee:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 14113f3:	e8 30 a3 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 14113f8:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 14113fd:	e8 86 00 00 00       	call   1411488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256a0c>
 1411402:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1411409:	00 00 
 141140b:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
 1411412:	00 
 1411413:	75 11                	jne    1411426 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2569aa>
 1411415:	48 89 df             	mov    rdi,rbx
 1411418:	e8 03 cb 3d 00       	call   17edf20 <_ZdlPv@plt>
 141141d:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 1411421:	e8 aa e8 65 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1411426:	e8 85 e6 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 141142b:	cc                   	int3
 141142c:	53                   	push   rbx
 141142d:	48 89 fb             	mov    rbx,rdi
 1411430:	48 81 c7 b0 00 00 00 	add    rdi,0xb0
 1411437:	e8 ec a2 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
--
 1411471:	e8 b2 a2 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1411476:	49 83 c6 c0          	add    r14,0xffffffffffffffc0
 141147a:	49 83 fe c0          	cmp    r14,0xffffffffffffffc0
 141147e:	75 ed                	jne    141146d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2569f1>
 1411480:	48 83 c4 08          	add    rsp,0x8
 1411484:	5b                   	pop    rbx
 1411485:	41 5e                	pop    r14
 1411487:	c3                   	ret
 1411488:	53                   	push   rbx
 1411489:	48 89 fb             	mov    rbx,rdi
 141148c:	48 83 c7 20          	add    rdi,0x20
 1411490:	e8 93 89 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 1411495:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 1411499:	e8 8a 89 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 141149e:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
 14114a2:	e8 81 89 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 14114a7:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 14114ab:	e8 78 89 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 14114b0:	48 89 df             	mov    rdi,rbx
 14114b3:	5b                   	pop    rbx
 14114b4:	e9 6f 89 66 ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
 14114b9:	cc                   	int3
 14114ba:	b8 b8 0b 00 00       	mov    eax,0xbb8
 14114bf:	39 c7                	cmp    edi,eax
 14114c1:	0f 42 c7             	cmovb  eax,edi
 14114c4:	8d 88 98 3a 00 00    	lea    ecx,[rax+0x3a98]
 14114ca:	39 cf                	cmp    edi,ecx
 14114cc:	0f 42 cf             	cmovb  ecx,edi
 14114cf:	f3 0f 2a c8          	cvtsi2ss xmm1,eax
 14114d3:	29 c1                	sub    ecx,eax
 14114d5:	f3 48 0f 2a d1       	cvtsi2ss xmm2,rcx
 14114da:	f3 0f 59 d0          	mulss  xmm2,xmm0
 14114de:	f3 0f 58 d1          	addss  xmm2,xmm1
 14114e2:	f3 48 0f 2c c2       	cvttss2si rax,xmm2
 14114e7:	c3                   	ret
 14114e8:	41 57                	push   r15
 14114ea:	41 56                	push   r14
--
 14114f1:	48 89 d3             	mov    rbx,rdx
 14114f4:	49 89 f6             	mov    r14,rsi
 14114f7:	49 89 ff             	mov    r15,rdi
 14114fa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1411501:	00 00 
 1411503:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1411508:	48 8d 46 01          	lea    rax,[rsi+0x1]
 141150c:	48 83 f8 01          	cmp    rax,0x1
 1411510:	48 83 d6 01          	adc    rsi,0x1
 1411514:	48 8d 54 24 04       	lea    rdx,[rsp+0x4]
 1411519:	83 22 00             	and    DWORD PTR [rdx],0x0
 141151c:	e8 9d a4 7b ff       	call   bcb9be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11895e>
 1411521:	49 83 67 18 00       	and    QWORD PTR [r15+0x18],0x0
 1411526:	49 39 de             	cmp    r14,rbx
 1411529:	49 0f 42 de          	cmovb  rbx,r14
 141152d:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
 1411531:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1411538:	00 00 
 141153a:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 141153f:	75 0a                	jne    141154b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256acf>
 1411541:	48 83 c4 10          	add    rsp,0x10
 1411545:	5b                   	pop    rbx
 1411546:	41 5e                	pop    r14
 1411548:	41 5f                	pop    r15
 141154a:	c3                   	ret
 141154b:	e8 60 e5 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 1411550:	8d 4f 9c             	lea    ecx,[rdi-0x64]
 1411553:	83 ff 65             	cmp    edi,0x65
 1411556:	6a 01                	push   0x1
 1411558:	58                   	pop    rax
 1411559:	0f 4d c1             	cmovge eax,ecx
 141155c:	3d e9 03 00 00       	cmp    eax,0x3e9
 1411561:	72 40                	jb     14115a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256b27>
 1411563:	50                   	push   rax
 1411564:	0f 28 c8             	movaps xmm1,xmm0
 1411567:	b9 80 3e 00 00       	mov    ecx,0x3e80
 141156c:	39 c8                	cmp    eax,ecx
--
 14118a0:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
 14118a5:	eb 15                	jmp    14118bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256e40>
 14118a7:	48 89 c1             	mov    rcx,rax
 14118aa:	48 d1 e9             	shr    rcx,1
 14118ad:	83 e0 01             	and    eax,0x1
 14118b0:	48 09 c8             	or     rax,rcx
 14118b3:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
 14118b8:	f3 0f 58 d2          	addss  xmm2,xmm2
 14118bc:	50                   	push   rax
 14118bd:	f3 0f 58 c2          	addss  xmm0,xmm2
 14118c1:	f3 0f 59 05 2b cf f7 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef7cf2b]        # 38e7f4 <_ZTSSt12bad_any_cast@@Base-0x19d4>
 14118c8:	fe 
 14118c9:	f3 0f 2a 57 18       	cvtsi2ss xmm2,DWORD PTR [rdi+0x18]
 14118ce:	f3 0f 5e c2          	divss  xmm0,xmm2
 14118d2:	f3 0f 59 05 c2 d1 f7 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef7d1c2]        # 38ea9c <_ZTSSt12bad_any_cast@@Base-0x172c>
 14118d9:	fe 
 14118da:	f3 0f 5e c1          	divss  xmm0,xmm1
 14118de:	e8 0d e2 3d 00       	call   17efaf0 <expf@plt>
 14118e3:	0f 57 c9             	xorps  xmm1,xmm1
 14118e6:	f3 0f 5f c1          	maxss  xmm0,xmm1
 14118ea:	f3 0f 51 c8          	sqrtss xmm1,xmm0
 14118ee:	f3 0f 10 05 b2 cf f7 	movss  xmm0,DWORD PTR [rip+0xfffffffffef7cfb2]        # 38e8a8 <_ZTSSt12bad_any_cast@@Base-0x1920>
 14118f5:	fe 
 14118f6:	f3 0f 5d c1          	minss  xmm0,xmm1
 14118fa:	48 83 c4 08          	add    rsp,0x8
 14118fe:	c3                   	ret
 14118ff:	cc                   	int3
 1411900:	55                   	push   rbp
 1411901:	41 56                	push   r14
 1411903:	53                   	push   rbx
 1411904:	48 83 ec 70          	sub    rsp,0x70
 1411908:	48 89 fb             	mov    rbx,rdi
 141190b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1411912:	00 00 
 1411914:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
 1411919:	e8 50 fd ff ff       	call   141166e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256bf2>
 141191e:	48 8b 8b 18 01 00 00 	mov    rcx,QWORD PTR [rbx+0x118]
--
 14119fd:	66 0f 3a 17 9b a0 01 	extractps DWORD PTR [rbx+0x1a0],xmm3,0x1
 1411a04:	00 00 01 
 1411a07:	48 c1 f8 02          	sar    rax,0x2
 1411a0b:	66 0f 3a 17 9b e0 01 	extractps DWORD PTR [rbx+0x1e0],xmm3,0x2
 1411a12:	00 00 02 
 1411a15:	48 ff c8             	dec    rax
 1411a18:	66 0f 3a 17 9b 20 02 	extractps DWORD PTR [rbx+0x220],xmm3,0x3
 1411a1f:	00 00 03 
 1411a22:	31 f6                	xor    esi,esi
 1411a24:	f3 0f 59 c9          	mulss  xmm1,xmm1
 1411a28:	f3 0f 59 0d 60 ce f7 	mulss  xmm1,DWORD PTR [rip+0xfffffffffef7ce60]        # 38e890 <_ZTSSt12bad_any_cast@@Base-0x1938>
 1411a2f:	fe 
 1411a30:	8b 6b 18             	mov    ebp,DWORD PTR [rbx+0x18]
 1411a33:	f3 0f 2a c5          	cvtsi2ss xmm0,ebp
 1411a37:	48 39 d1             	cmp    rcx,rdx
 1411a3a:	f3 0f 59 c1          	mulss  xmm0,xmm1
 1411a3e:	0f 28 0d 9b c5 f7 fe 	movaps xmm1,XMMWORD PTR [rip+0xfffffffffef7c59b]        # 38dfe0 <_ZTSSt12bad_any_cast@@Base-0x21e8>
 1411a45:	0f 54 c8             	andps  xmm1,xmm0
 1411a48:	0f 56 0d f1 c7 f7 fe 	orps   xmm1,XMMWORD PTR [rip+0xfffffffffef7c7f1]        # 38e240 <_ZTSSt12bad_any_cast@@Base-0x1f88>
 1411a4f:	f3 0f 58 c8          	addss  xmm1,xmm0
 1411a53:	66 0f 3a 0a c1 0b    	roundss xmm0,xmm1,0xb
 1411a59:	0f 57 c9             	xorps  xmm1,xmm1
 1411a5c:	f3 0f 5f c1          	maxss  xmm0,xmm1
 1411a60:	f3 48 0f 2c c8       	cvttss2si rcx,xmm0
 1411a65:	f3 0f 5c 05 af cd f7 	subss  xmm0,DWORD PTR [rip+0xfffffffffef7cdaf]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
 1411a6c:	fe 
 1411a6d:	f3 48 0f 2c d0       	cvttss2si rdx,xmm0
 1411a72:	8b 7b 24             	mov    edi,DWORD PTR [rbx+0x24]
 1411a75:	48 0f 45 f0          	cmovne rsi,rax
 1411a79:	48 89 c8             	mov    rax,rcx
 1411a7c:	48 c1 f8 3f          	sar    rax,0x3f
 1411a80:	48 21 d0             	and    rax,rdx
 1411a83:	48 09 c8             	or     rax,rcx
 1411a86:	48 39 c6             	cmp    rsi,rax
 1411a89:	48 0f 42 c6          	cmovb  rax,rsi
 1411a8d:	48 89 83 30 01 00 00 	mov    QWORD PTR [rbx+0x130],rax
 1411a94:	f3 0f 10 43 40       	movss  xmm0,DWORD PTR [rbx+0x40]
--
 1411aab:	4c 89 f7             	mov    rdi,r14
 1411aae:	89 ee                	mov    esi,ebp
 1411ab0:	89 c2                	mov    edx,eax
 1411ab2:	e8 10 a6 01 00       	call   142c0c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27164b>
 1411ab7:	48 8b bb 00 01 00 00 	mov    rdi,QWORD PTR [rbx+0x100]
 1411abe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1411ac1:	4c 89 f6             	mov    rsi,r14
 1411ac4:	31 d2                	xor    edx,edx
 1411ac6:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1411ac9:	f3 0f 10 43 3c       	movss  xmm0,DWORD PTR [rbx+0x3c]
 1411ace:	8b 7b 24             	mov    edi,DWORD PTR [rbx+0x24]
 1411ad1:	e8 7a fa ff ff       	call   1411550 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256ad4>
 1411ad6:	8b 73 18             	mov    esi,DWORD PTR [rbx+0x18]
 1411ad9:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 1411ade:	4c 89 f7             	mov    rdi,r14
 1411ae1:	89 c2                	mov    edx,eax
 1411ae3:	f2 0f 10 05 a5 d7 f7 	movsd  xmm0,QWORD PTR [rip+0xfffffffffef7d7a5]        # 38f290 <_ZTSSt12bad_any_cast@@Base-0xf38>
 1411aea:	fe 
 1411aeb:	e8 d7 a5 01 00       	call   142c0c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27164b>
 1411af0:	48 8b bb a0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2a0]
 1411af7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1411afa:	4c 89 f6             	mov    rsi,r14
 1411afd:	31 d2                	xor    edx,edx
 1411aff:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1411b02:	48 8b bb 78 03 00 00 	mov    rdi,QWORD PTR [rbx+0x378]
 1411b09:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1411b0c:	4c 89 f6             	mov    rsi,r14
 1411b0f:	31 d2                	xor    edx,edx
 1411b11:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1411b14:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1411b1b:	00 00 
 1411b1d:	48 3b 44 24 68       	cmp    rax,QWORD PTR [rsp+0x68]
 1411b22:	75 09                	jne    1411b2d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2570b1>
 1411b24:	48 83 c4 70          	add    rsp,0x70
 1411b28:	5b                   	pop    rbx
 1411b29:	41 5e                	pop    r14
 1411b2b:	5d                   	pop    rbp
--
 14128fa:	fe 
 14128fb:	f3 0f 59 da          	mulss  xmm3,xmm2
 14128ff:	f3 0f 10 15 85 bd f7 	movss  xmm2,DWORD PTR [rip+0xfffffffffef7bd85]        # 38e68c <_ZTSSt12bad_any_cast@@Base-0x1b3c>
 1412906:	fe 
 1412907:	f3 0f 5d d3          	minss  xmm2,xmm3
 141290b:	f3 0f c2 d8 01       	cmpltss xmm3,xmm0
 1412910:	0f 55 da             	andnps xmm3,xmm2
 1412913:	f3 0f 59 0d 75 bf f7 	mulss  xmm1,DWORD PTR [rip+0xfffffffffef7bf75]        # 38e890 <_ZTSSt12bad_any_cast@@Base-0x1938>
 141291a:	fe 
 141291b:	f3 0f 58 cb          	addss  xmm1,xmm3
 141291f:	f3 0f 10 05 a1 c0 f7 	movss  xmm0,DWORD PTR [rip+0xfffffffffef7c0a1]        # 38e9c8 <_ZTSSt12bad_any_cast@@Base-0x1800>
 1412926:	fe 
 1412927:	f3 0f 2a 57 18       	cvtsi2ss xmm2,DWORD PTR [rdi+0x18]
 141292c:	f3 0f 5d c1          	minss  xmm0,xmm1
 1412930:	f3 0f 59 d0          	mulss  xmm2,xmm0
 1412934:	f3 48 0f 2c c2       	cvttss2si rax,xmm2
 1412939:	b2 01                	mov    dl,0x1
 141293b:	c3                   	ret
 141293c:	55                   	push   rbp
 141293d:	41 57                	push   r15
 141293f:	41 56                	push   r14
 1412941:	41 54                	push   r12
 1412943:	53                   	push   rbx
 1412944:	48 89 fb             	mov    rbx,rdi
 1412947:	66 0f 3a 21 c1 10    	insertps xmm0,xmm1,0x10
 141294d:	66 0f 3a 21 c2 20    	insertps xmm0,xmm2,0x20
 1412953:	66 0f 3a 21 c3 30    	insertps xmm0,xmm3,0x30
 1412959:	0f 57 c9             	xorps  xmm1,xmm1
 141295c:	0f 28 15 fd b1 f7 fe 	movaps xmm2,XMMWORD PTR [rip+0xfffffffffef7b1fd]        # 38db60 <_ZTSSt12bad_any_cast@@Base-0x2668>
 1412963:	0f 5d d0             	minps  xmm2,xmm0
 1412966:	0f c2 c1 05          	cmpnltps xmm0,xmm1
 141296a:	0f 54 c2             	andps  xmm0,xmm2
 141296d:	0f 11 47 34          	movups XMMWORD PTR [rdi+0x34],xmm0
 1412971:	66 0f 3a 21 e5 10    	insertps xmm4,xmm5,0x10
 1412977:	0f 28 05 c2 ab f7 fe 	movaps xmm0,XMMWORD PTR [rip+0xfffffffffef7abc2]        # 38d540 <_ZTSSt12bad_any_cast@@Base-0x2c88>
 141297e:	0f 5d c4             	minps  xmm0,xmm4
 1412981:	0f c2 e1 05          	cmpnltps xmm4,xmm1
--
 1412a81:	41 88 5e 08          	mov    BYTE PTR [r14+0x8],bl
 1412a85:	48 83 c4 08          	add    rsp,0x8
 1412a89:	5b                   	pop    rbx
 1412a8a:	41 5e                	pop    r14
 1412a8c:	c3                   	ret
 1412a8d:	cc                   	int3
 1412a8e:	53                   	push   rbx
 1412a8f:	48 89 fb             	mov    rbx,rdi
 1412a92:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 1412a95:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
 1412a99:	0f 57 c0             	xorps  xmm0,xmm0
 1412a9c:	e8 61 f2 77 ff       	call   b91d02 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdeca2>
 1412aa1:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
 1412aa6:	5b                   	pop    rbx
 1412aa7:	c3                   	ret
 1412aa8:	53                   	push   rbx
 1412aa9:	48 89 fb             	mov    rbx,rdi
 1412aac:	e8 dd ff ff ff       	call   1412a8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258012>
 1412ab1:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 1412ab5:	e8 d4 ff ff ff       	call   1412a8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258012>
 1412aba:	48 8b 7b 68          	mov    rdi,QWORD PTR [rbx+0x68]
 1412abe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1412ac1:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1412ac4:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
 1412ac8:	e8 c1 ff ff ff       	call   1412a8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258012>
 1412acd:	48 81 c3 b0 00 00 00 	add    rbx,0xb0
 1412ad4:	48 89 df             	mov    rdi,rbx
 1412ad7:	5b                   	pop    rbx
 1412ad8:	e9 b1 ff ff ff       	jmp    1412a8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258012>
 1412add:	cc                   	int3
 1412ade:	41 56                	push   r14
 1412ae0:	53                   	push   rbx
 1412ae1:	48 83 ec 38          	sub    rsp,0x38
 1412ae5:	89 f3                	mov    ebx,esi
 1412ae7:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
 1412aec:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1412af3:	00 00 
--
 1412b0e:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
 1412b12:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1412b17:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 1412b1c:	f6 c3 01             	test   bl,0x1
 1412b1f:	74 0f                	je     1412b30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2580b4>
 1412b21:	49 8b 36             	mov    rsi,QWORD PTR [r14]
 1412b24:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]
 1412b28:	48 89 e7             	mov    rdi,rsp
 1412b2b:	e8 3e 03 00 00       	call   1412e6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2583f2>
 1412b30:	f6 c3 02             	test   bl,0x2
 1412b33:	74 10                	je     1412b45 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2580c9>
 1412b35:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
 1412b39:	49 8b 56 18          	mov    rdx,QWORD PTR [r14+0x18]
 1412b3d:	48 89 e7             	mov    rdi,rsp
 1412b40:	e8 29 03 00 00       	call   1412e6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2583f2>
 1412b45:	f6 c3 04             	test   bl,0x4
 1412b48:	74 10                	je     1412b5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2580de>
 1412b4a:	49 8b 76 20          	mov    rsi,QWORD PTR [r14+0x20]
 1412b4e:	49 8b 56 28          	mov    rdx,QWORD PTR [r14+0x28]
 1412b52:	48 89 e7             	mov    rdi,rsp
 1412b55:	e8 14 03 00 00       	call   1412e6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2583f2>
 1412b5a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1412b61:	00 00 
 1412b63:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 1412b68:	75 08                	jne    1412b72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2580f6>
 1412b6a:	48 83 c4 38          	add    rsp,0x38
 1412b6e:	5b                   	pop    rbx
 1412b6f:	41 5e                	pop    r14
 1412b71:	c3                   	ret
 1412b72:	e8 39 cf 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 1412b77:	cc                   	int3
 1412b78:	48 8b 77 20          	mov    rsi,QWORD PTR [rdi+0x20]
 1412b7c:	48 85 f6             	test   rsi,rsi
 1412b7f:	0f 85 af 02 00 00    	jne    1412e34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2583b8>
 1412b85:	0f 57 c0             	xorps  xmm0,xmm0
 1412b88:	c3                   	ret
 1412b89:	cc                   	int3
--
 1412deb:	f3 0f 58 c2          	addss  xmm0,xmm2
 1412def:	48 89 df             	mov    rdi,rbx
 1412df2:	e8 0f 00 00 00       	call   1412e06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25838a>
 1412df7:	f3 0f 10 44 24 08    	movss  xmm0,DWORD PTR [rsp+0x8]
 1412dfd:	48 83 c4 28          	add    rsp,0x28
 1412e01:	5b                   	pop    rbx
 1412e02:	41 5e                	pop    r14
 1412e04:	c3                   	ret
 1412e05:	cc                   	int3
 1412e06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1412e09:	48 3b 47 08          	cmp    rax,QWORD PTR [rdi+0x8]
 1412e0d:	74 24                	je     1412e33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2583b7>
 1412e0f:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
 1412e13:	f3 0f 11 04 88       	movss  DWORD PTR [rax+rcx*4],xmm0
 1412e18:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
 1412e1c:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
 1412e20:	48 ff c0             	inc    rax
 1412e23:	48 2b 0f             	sub    rcx,QWORD PTR [rdi]
 1412e26:	48 c1 f9 02          	sar    rcx,0x2
 1412e2a:	31 d2                	xor    edx,edx
 1412e2c:	48 f7 f1             	div    rcx
 1412e2f:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx
 1412e33:	c3                   	ret
 1412e34:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
 1412e37:	4c 8b 47 08          	mov    r8,QWORD PTR [rdi+0x8]
 1412e3b:	4c 39 c1             	cmp    rcx,r8
 1412e3e:	74 2a                	je     1412e6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2583ee>
 1412e40:	49 29 c8             	sub    r8,rcx
 1412e43:	49 c1 f8 02          	sar    r8,0x2
 1412e47:	49 8d 40 ff          	lea    rax,[r8-0x1]
 1412e4b:	48 39 f0             	cmp    rax,rsi
 1412e4e:	48 0f 42 f0          	cmovb  rsi,rax
 1412e52:	48 f7 d6             	not    rsi
 1412e55:	4c 01 c6             	add    rsi,r8
 1412e58:	48 03 77 18          	add    rsi,QWORD PTR [rdi+0x18]
 1412e5c:	48 89 f0             	mov    rax,rsi
 1412e5f:	31 d2                	xor    edx,edx
 1412e61:	49 f7 f0             	div    r8
 1412e64:	f3 0f 10 04 91       	movss  xmm0,DWORD PTR [rcx+rdx*4]
 1412e69:	c3                   	ret
 1412e6a:	0f 57 c0             	xorps  xmm0,xmm0
 1412e6d:	c3                   	ret
 1412e6e:	53                   	push   rbx
 1412e6f:	48 83 ec 10          	sub    rsp,0x10
 1412e73:	49 89 d0             	mov    r8,rdx
 1412e76:	48 89 f1             	mov    rcx,rsi
 1412e79:	48 89 fb             	mov    rbx,rdi
 1412e7c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1412e7f:	80 38 00             	cmp    BYTE PTR [rax],0x0
 1412e82:	74 27                	je     1412eab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25842f>
 1412e84:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 1412e88:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
 1412e8c:	48 85 d2             	test   rdx,rdx
 1412e8f:	74 3b                	je     1412ecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258450>
 1412e91:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 1412e95:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
 1412e98:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 1412e9b:	4c 8b 0f             	mov    r9,QWORD PTR [rdi]
 1412e9e:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
--
 1412ed1:	c3                   	ret
 1412ed2:	0f 57 c0             	xorps  xmm0,xmm0
 1412ed5:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 1412ed8:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 1412edd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1412ee0:	48 89 07             	mov    QWORD PTR [rdi],rax
 1412ee3:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
 1412ee7:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 1412eeb:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 1412eef:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 1412ef3:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 1412ef8:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
 1412efb:	0f 10 46 18          	movups xmm0,XMMWORD PTR [rsi+0x18]
 1412eff:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
 1412f03:	c3                   	ret
 1412f04:	41 56                	push   r14
 1412f06:	53                   	push   rbx
 1412f07:	50                   	push   rax
 1412f08:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1412f0c:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 1412f11:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 1412f15:	48 85 c0             	test   rax,rax
 1412f18:	74 22                	je     1412f3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2584c0>
 1412f1a:	48 89 fb             	mov    rbx,rdi
 1412f1d:	49 89 f6             	mov    r14,rsi
 1412f20:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 1412f24:	6a 01                	push   0x1
 1412f26:	5f                   	pop    rdi
 1412f27:	48 89 de             	mov    rsi,rbx
 1412f2a:	4c 89 f2             	mov    rdx,r14
 1412f2d:	ff d0                	call   rax
 1412f2f:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 1412f33:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 1412f37:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 1412f3c:	48 83 c4 08          	add    rsp,0x8
 1412f40:	5b                   	pop    rbx
 1412f41:	41 5e                	pop    r14
 1412f43:	c3                   	ret
 1412f44:	48 89 c7             	mov    rdi,rax
 1412f47:	e8 59 6b 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1412f4c:	41 56                	push   r14
 1412f4e:	53                   	push   rbx
 1412f4f:	48 83 ec 18          	sub    rsp,0x18
 1412f53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1412f5a:	00 00 
 1412f5c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 1412f61:	48 83 bf 58 02 00 00 	cmp    QWORD PTR [rdi+0x258],0x0
 1412f68:	00 
 1412f69:	0f 85 97 00 00 00    	jne    1413006 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25858a>
 1412f6f:	48 89 fb             	mov    rbx,rdi
 1412f72:	48 8d b7 60 02 00 00 	lea    rsi,[rdi+0x260]
 1412f79:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 1412f7e:	4c 89 f7             	mov    rdi,r14
 1412f81:	ff 93 78 02 00 00    	call   QWORD PTR [rbx+0x278]
 1412f87:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1412f8a:	49 83 26 00          	and    QWORD PTR [r14],0x0
 1412f8e:	48 8b bb 58 02 00 00 	mov    rdi,QWORD PTR [rbx+0x258]
--
 14133c8:	00 
 14133c9:	48 01 dd             	add    rbp,rbx
 14133cc:	48 8d 8c 24 70 01 00 	lea    rcx,[rsp+0x170]
 14133d3:	00 
 14133d4:	48 89 29             	mov    QWORD PTR [rcx],rbp
 14133d7:	48 8d 94 24 f8 00 00 	lea    rdx,[rsp+0xf8]
 14133de:	00 
 14133df:	48 89 bc 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rdi
 14133e6:	00 
 14133e7:	49 89 f5             	mov    r13,rsi
 14133ea:	e8 27 d5 ff ff       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
 14133ef:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 14133f3:	49 8b 76 18          	mov    rsi,QWORD PTR [r14+0x18]
 14133f7:	84 c0                	test   al,al
 14133f9:	48 89 74 24 50       	mov    QWORD PTR [rsp+0x50],rsi
 14133fe:	74 18                	je     1413418 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25899c>
 1413400:	49 89 fe             	mov    r14,rdi
 1413403:	48 8b bc 24 28 01 00 	mov    rdi,QWORD PTR [rsp+0x128]
 141340a:	00 
 141340b:	48 8b b4 24 30 01 00 	mov    rsi,QWORD PTR [rsp+0x130]
 1413412:	00 
 1413413:	e9 99 00 00 00       	jmp    14134b1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258a35>
 1413418:	48 8d 8c 24 a0 01 00 	lea    rcx,[rsp+0x1a0]
 141341f:	00 
 1413420:	48 89 29             	mov    QWORD PTR [rcx],rbp
 1413423:	48 8d 94 24 f8 00 00 	lea    rdx,[rsp+0xf8]
 141342a:	00 
 141342b:	49 89 fe             	mov    r14,rdi
 141342e:	e8 e3 d4 ff ff       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
 1413433:	48 8b bc 24 28 01 00 	mov    rdi,QWORD PTR [rsp+0x128]
 141343a:	00 
 141343b:	48 8b b4 24 30 01 00 	mov    rsi,QWORD PTR [rsp+0x130]
 1413442:	00 
 1413443:	84 c0                	test   al,al
 1413445:	75 6a                	jne    14134b1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258a35>
 1413447:	48 8d 8c 24 68 01 00 	lea    rcx,[rsp+0x168]
 141344e:	00 
--
 14135b9:	0f 84 d6 03 00 00    	je     1413995 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258f19>
 14135bf:	49 89 c7             	mov    r15,rax
 14135c2:	4c 89 e7             	mov    rdi,r12
 14135c5:	48 89 ac 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rbp
 14135cc:	00 
 14135cd:	48 89 ee             	mov    rsi,rbp
 14135d0:	48 89 da             	mov    rdx,rbx
 14135d3:	e8 ef d0 ff ff       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 14135d8:	f3 0f 11 44 24 4c    	movss  DWORD PTR [rsp+0x4c],xmm0
 14135de:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 14135e2:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
 14135e9:	00 
 14135ea:	f3 41 0f 10 44 24 18 	movss  xmm0,DWORD PTR [r12+0x18]
 14135f1:	f3 0f 11 44 24 78    	movss  DWORD PTR [rsp+0x78],xmm0
 14135f7:	4c 89 f5             	mov    rbp,r14
 14135fa:	4c 89 f7             	mov    rdi,r14
 14135fd:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
 1413602:	48 89 da             	mov    rdx,rbx
 1413605:	e8 bd d0 ff ff       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 141360a:	f3 0f 11 84 24 98 00 	movss  DWORD PTR [rsp+0x98],xmm0
 1413611:	00 00 
 1413613:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1413616:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
 141361d:	00 
 141361e:	f3 41 0f 10 46 18    	movss  xmm0,DWORD PTR [r14+0x18]
 1413624:	f3 0f 11 44 24 64    	movss  DWORD PTR [rsp+0x64],xmm0
 141362a:	48 8b 6c 24 40       	mov    rbp,QWORD PTR [rsp+0x40]
 141362f:	48 89 ef             	mov    rdi,rbp
 1413632:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
 1413637:	48 89 da             	mov    rdx,rbx
 141363a:	e8 88 d0 ff ff       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 141363f:	f3 0f 11 84 24 94 00 	movss  DWORD PTR [rsp+0x94],xmm0
 1413646:	00 00 
 1413648:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 141364c:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
 1413653:	00 
 1413654:	f3 0f 10 45 18       	movss  xmm0,DWORD PTR [rbp+0x18]
 1413659:	f3 0f 11 44 24 60    	movss  DWORD PTR [rsp+0x60],xmm0
 141365f:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
 1413664:	48 89 ef             	mov    rdi,rbp
 1413667:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
 141366c:	48 89 da             	mov    rdx,rbx
 141366f:	e8 53 d0 ff ff       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 1413674:	f3 0f 11 84 24 90 00 	movss  DWORD PTR [rsp+0x90],xmm0
 141367b:	00 00 
 141367d:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 1413681:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
 1413688:	00 
 1413689:	f3 0f 10 45 18       	movss  xmm0,DWORD PTR [rbp+0x18]
 141368e:	f3 0f 11 44 24 5c    	movss  DWORD PTR [rsp+0x5c],xmm0
 1413694:	4c 89 ff             	mov    rdi,r15
 1413697:	4c 89 ed             	mov    rbp,r13
 141369a:	4c 89 ee             	mov    rsi,r13
 141369d:	48 89 da             	mov    rdx,rbx
 14136a0:	e8 f3 d0 ff ff       	call   1410798 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d1c>
 14136a5:	89 84 24 9c 00 00 00 	mov    DWORD PTR [rsp+0x9c],eax
 14136ac:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
 14136b0:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
 14136b3:	41 8b 77 18          	mov    esi,DWORD PTR [r15+0x18]
 14136b7:	48 89 da             	mov    rdx,rbx
 14136ba:	e8 ae d1 ff ff       	call   141086d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255df1>
 14136bf:	41 89 c7             	mov    r15d,eax
 14136c2:	41 80 7c 24 10 00    	cmp    BYTE PTR [r12+0x10],0x0
 14136c8:	48 bf ff ff ff ff ff 	movabs rdi,0x7fffffffffffffff
 14136cf:	ff ff 7f 
 14136d2:	48 89 f8             	mov    rax,rdi
 14136d5:	74 0f                	je     14136e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258c6a>
 14136d7:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
 14136de:	00 
 14136df:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 14136e3:	48 29 d8             	sub    rax,rbx
 14136e6:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
 14136ed:	00 
 14136ee:	4d 89 f5             	mov    r13,r14
 14136f1:	41 80 7e 10 00       	cmp    BYTE PTR [r14+0x10],0x0
 14136f6:	48 89 f8             	mov    rax,rdi
 14136f9:	74 07                	je     1413702 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258c86>
 14136fb:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 14136ff:	48 29 d8             	sub    rax,rbx
 1413702:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
 1413709:	00 
 141370a:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
 141370f:	80 7a 10 00          	cmp    BYTE PTR [rdx+0x10],0x0
--
 1413906:	00 
 1413907:	48 8d 54 2d 00       	lea    rdx,[rbp+rbp*1+0x0]
 141390c:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
 1413913:	00 
 1413914:	4a 8d 34 e0          	lea    rsi,[rax+r12*8]
 1413918:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
 141391f:	00 
 1413920:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1413923:	8b 8c 24 b0 01 00 00 	mov    ecx,DWORD PTR [rsp+0x1b0]
 141392a:	89 4c 24 28          	mov    DWORD PTR [rsp+0x28],ecx
 141392e:	0f 28 84 24 a0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1a0]
 1413935:	00 
 1413936:	0f 11 44 24 18       	movups XMMWORD PTR [rsp+0x18],xmm0
 141393b:	8b 8c 24 80 01 00 00 	mov    ecx,DWORD PTR [rsp+0x180]
 1413942:	89 4c 24 10          	mov    DWORD PTR [rsp+0x10],ecx
 1413946:	0f 10 84 24 70 01 00 	movups xmm0,XMMWORD PTR [rsp+0x170]
 141394d:	00 
 141394e:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 1413952:	48 8d 8c 24 07 01 00 	lea    rcx,[rsp+0x107]
 1413959:	00 
 141395a:	ff 50 10             	call   QWORD PTR [rax+0x10]
 141395d:	49 01 ec             	add    r12,rbp
 1413960:	48 01 eb             	add    rbx,rbp
 1413963:	4d 39 fc             	cmp    r12,r15
 1413966:	48 8b ac 24 f0 00 00 	mov    rbp,QWORD PTR [rsp+0xf0]
 141396d:	00 
 141396e:	4c 8b bc 24 e8 00 00 	mov    r15,QWORD PTR [rsp+0xe8]
 1413975:	00 
 1413976:	0f 8c 73 fb ff ff    	jl     14134ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258a73>
 141397c:	eb 22                	jmp    14139a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258f24>
 141397e:	45 31 f6             	xor    r14d,r14d
 1413981:	eb 1d                	jmp    14139a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258f24>
 1413983:	31 c0                	xor    eax,eax
 1413985:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 141398a:	eb 14                	jmp    14139a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258f24>
 141398c:	31 c0                	xor    eax,eax
 141398e:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
--
 1413b21:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1413b28:	00 00 
 1413b2a:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 1413b2f:	bf 28 01 00 00       	mov    edi,0x128
 1413b34:	e8 c7 a3 3d 00       	call   17edf00 <_Znwm@plt>
 1413b39:	48 89 c3             	mov    rbx,rax
 1413b3c:	48 8d 05 35 c3 45 00 	lea    rax,[rip+0x45c335]        # 186fe78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c560>
 1413b43:	48 89 03             	mov    QWORD PTR [rbx],rax
 1413b46:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
 1413b4a:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 1413b4e:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 1413b52:	8a 4d 0f             	mov    cl,BYTE PTR [rbp+0xf]
 1413b55:	88 4b 18             	mov    BYTE PTR [rbx+0x18],cl
 1413b58:	f2 0f 10 05 b0 a3 f7 	movsd  xmm0,QWORD PTR [rip+0xfffffffffef7a3b0]        # 38df10 <_ZTSSt12bad_any_cast@@Base-0x22b8>
 1413b5f:	fe 
 1413b60:	f2 0f 11 43 1c       	movsd  QWORD PTR [rbx+0x1c],xmm0
 1413b65:	83 63 24 00          	and    DWORD PTR [rbx+0x24],0x0
 1413b69:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0
 1413b6e:	4c 8d 7b 30          	lea    r15,[rbx+0x30]
 1413b72:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
 1413b76:	f3 0f 59 05 fe ad f7 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef7adfe]        # 38e97c <_ZTSSt12bad_any_cast@@Base-0x184c>
 1413b7d:	fe 
 1413b7e:	f3 0f 5e 05 c6 aa f7 	divss  xmm0,DWORD PTR [rip+0xfffffffffef7aac6]        # 38e64c <_ZTSSt12bad_any_cast@@Base-0x1b7c>
 1413b85:	fe 
 1413b86:	e8 b5 d1 3d 00       	call   17f0d40 <lroundf@plt>
 1413b8b:	48 8d 34 00          	lea    rsi,[rax+rax*1]
 1413b8f:	4c 89 ff             	mov    rdi,r15
 1413b92:	e8 2f 01 00 00       	call   1413cc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25924a>
 1413b97:	8a 45 0c             	mov    al,BYTE PTR [rbp+0xc]
 1413b9a:	4c 89 73 60          	mov    QWORD PTR [rbx+0x60],r14
 1413b9e:	88 43 68             	mov    BYTE PTR [rbx+0x68],al
 1413ba1:	4c 8d 73 70          	lea    r14,[rbx+0x70]
 1413ba5:	4c 89 f7             	mov    rdi,r14
 1413ba8:	4c 89 e6             	mov    rsi,r12
 1413bab:	4c 89 ea             	mov    rdx,r13
 1413bae:	b9 5e 01 00 00       	mov    ecx,0x15e
 1413bb3:	e8 c4 73 01 00       	call   142af7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270500>
--
 1413cc6:	53                   	push   rbx
 1413cc7:	48 83 ec 10          	sub    rsp,0x10
 1413ccb:	48 89 fb             	mov    rbx,rdi
 1413cce:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1413cd5:	00 00 
 1413cd7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1413cdc:	48 ff c6             	inc    rsi
 1413cdf:	48 8d 54 24 04       	lea    rdx,[rsp+0x4]
 1413ce4:	83 22 00             	and    DWORD PTR [rdx],0x0
 1413ce7:	e8 0a 7c 7b ff       	call   bcb8f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x118896>
 1413cec:	0f 57 c0             	xorps  xmm0,xmm0
 1413cef:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0
 1413cf4:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
 1413cf8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1413cff:	00 00 
 1413d01:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 1413d06:	75 06                	jne    1413d0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259292>
 1413d08:	48 83 c4 10          	add    rsp,0x10
 1413d0c:	5b                   	pop    rbx
 1413d0d:	c3                   	ret
 1413d0e:	e8 9d bd 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 1413d13:	cc                   	int3
 1413d14:	41 56                	push   r14
 1413d16:	53                   	push   rbx
 1413d17:	48 83 ec 18          	sub    rsp,0x18
 1413d1b:	49 89 f6             	mov    r14,rsi
 1413d1e:	48 89 fb             	mov    rbx,rdi
 1413d21:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1413d28:	00 00 
 1413d2a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 1413d2f:	c6 07 00             	mov    BYTE PTR [rdi],0x0
 1413d32:	83 4f 08 ff          	or     DWORD PTR [rdi+0x8],0xffffffff
 1413d36:	e8 7b 9a 69 ff       	call   aad7b6 <JNI_OnUnload@@Base+0x35083>
 1413d3b:	41 8b 46 08          	mov    eax,DWORD PTR [r14+0x8]
 1413d3f:	b9 ff ff ff ff       	mov    ecx,0xffffffff
 1413d44:	48 39 c8             	cmp    rax,rcx
 1413d47:	74 1c                	je     1413d65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2592e9>
--
 141415a:	4d 01 e7             	add    r15,r12
 141415d:	4c 8b ac 24 80 00 00 	mov    r13,QWORD PTR [rsp+0x80]
 1414164:	00 
 1414165:	4d 39 ef             	cmp    r15,r13
 1414168:	0f 82 39 ff ff ff    	jb     14140a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25962b>
 141416e:	0f 57 c0             	xorps  xmm0,xmm0
 1414171:	0f 2e 45 24          	ucomiss xmm0,DWORD PTR [rbp+0x24]
 1414175:	4c 8b 7c 24 50       	mov    r15,QWORD PTR [rsp+0x50]
 141417a:	4c 8b 64 24 48       	mov    r12,QWORD PTR [rsp+0x48]
 141417f:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 1414184:	73 4f                	jae    14141d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259759>
 1414186:	80 08 01             	or     BYTE PTR [rax],0x1
 1414189:	80 7d 18 00          	cmp    BYTE PTR [rbp+0x18],0x0
 141418d:	f3 0f 10 4d 24       	movss  xmm1,DWORD PTR [rbp+0x24]
 1414192:	74 6a                	je     14141fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259782>
 1414194:	f3 0f 59 0d e4 a6 f7 	mulss  xmm1,DWORD PTR [rip+0xfffffffffef7a6e4]        # 38e880 <_ZTSSt12bad_any_cast@@Base-0x1948>
 141419b:	fe 
 141419c:	48 8d 9c 24 8c 00 00 	lea    rbx,[rsp+0x8c]
 14141a3:	00 
 14141a4:	4c 8d b4 24 88 00 00 	lea    r14,[rsp+0x88]
 14141ab:	00 
 14141ac:	0f 28 c1             	movaps xmm0,xmm1
 14141af:	48 89 df             	mov    rdi,rbx
 14141b2:	4c 89 f6             	mov    rsi,r14
 14141b5:	e8 d6 aa 3d 00       	call   17eec90 <sincosf@plt>
 14141ba:	48 8b 6c 24 30       	mov    rbp,QWORD PTR [rsp+0x30]
 14141bf:	f3 41 0f 10 06       	movss  xmm0,DWORD PTR [r14]
 14141c4:	66 0f 3a 21 03 10    	insertps xmm0,DWORD PTR [rbx],0x10
 14141ca:	0f 57 c9             	xorps  xmm1,xmm1
 14141cd:	0f 5f c1             	maxps  xmm0,xmm1
 14141d0:	0f 51 c0             	sqrtps xmm0,xmm0
 14141d3:	eb 63                	jmp    1414238 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2597bc>
 14141d5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14141dc:	00 00 
 14141de:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
 14141e5:	00 
 14141e6:	0f 85 f1 00 00 00    	jne    14142dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259861>
--
 14144de:	49 29 c8             	sub    r8,rcx
 14144e1:	49 c1 f8 02          	sar    r8,0x2
 14144e5:	49 8d 40 ff          	lea    rax,[r8-0x1]
 14144e9:	45 31 ff             	xor    r15d,r15d
 14144ec:	48 39 cf             	cmp    rdi,rcx
 14144ef:	4c 0f 45 f8          	cmovne r15,rax
 14144f3:	49 39 f7             	cmp    r15,rsi
 14144f6:	4c 0f 43 fe          	cmovae r15,rsi
 14144fa:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
 14144fe:	4d 89 fc             	mov    r12,r15
 1414501:	49 29 c4             	sub    r12,rax
 1414504:	0f 84 8d 00 00 00    	je     1414597 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259b1b>
 141450a:	48 8b 53 18          	mov    rdx,QWORD PTR [rbx+0x18]
 141450e:	73 11                	jae    1414521 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259aa5>
 1414510:	4c 29 f8             	sub    rax,r15
 1414513:	48 01 d0             	add    rax,rdx
 1414516:	31 d2                	xor    edx,edx
 1414518:	49 f7 f0             	div    r8
 141451b:	48 89 53 18          	mov    QWORD PTR [rbx+0x18],rdx
 141451f:	eb 72                	jmp    1414593 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259b17>
 1414521:	4c 89 c0             	mov    rax,r8
 1414524:	4c 29 e0             	sub    rax,r12
 1414527:	48 01 d0             	add    rax,rdx
 141452a:	31 d2                	xor    edx,edx
 141452c:	49 f7 f0             	div    r8
 141452f:	48 89 53 18          	mov    QWORD PTR [rbx+0x18],rdx
 1414533:	4d 85 e4             	test   r12,r12
 1414536:	74 5b                	je     1414593 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259b17>
 1414538:	49 89 d6             	mov    r14,rdx
 141453b:	48 89 f8             	mov    rax,rdi
 141453e:	48 29 c8             	sub    rax,rcx
 1414541:	48 c1 f8 02          	sar    rax,0x2
 1414545:	49 89 c5             	mov    r13,rax
 1414548:	4d 29 f5             	sub    r13,r14
 141454b:	4d 39 e5             	cmp    r13,r12
 141454e:	4d 0f 43 ec          	cmovae r13,r12
 1414552:	4c 39 f0             	cmp    rax,r14
 1414555:	75 05                	jne    141455c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259ae0>
 1414557:	4c 89 f6             	mov    rsi,r14
 141455a:	eb 24                	jmp    1414580 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259b04>
 141455c:	4a 8d 3c b1          	lea    rdi,[rcx+r14*4]
 1414560:	4a 8d 14 ad 00 00 00 	lea    rdx,[r13*4+0x0]
 1414567:	00 
 1414568:	31 f6                	xor    esi,esi
 141456a:	e8 21 a6 3d 00       	call   17eeb90 <memset@plt>
 141456f:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
 1414572:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 1414576:	48 89 fe             	mov    rsi,rdi
 1414579:	48 29 ce             	sub    rsi,rcx
 141457c:	48 c1 fe 02          	sar    rsi,0x2
--
 1414598:	41 5c                	pop    r12
 141459a:	41 5d                	pop    r13
 141459c:	41 5e                	pop    r14
 141459e:	41 5f                	pop    r15
 14145a0:	c3                   	ret
 14145a1:	cc                   	int3
 14145a2:	53                   	push   rbx
 14145a3:	48 89 fb             	mov    rbx,rdi
 14145a6:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 14145a9:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
 14145ad:	0f 57 c0             	xorps  xmm0,xmm0
 14145b0:	e8 4d d7 77 ff       	call   b91d02 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdeca2>
 14145b5:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
 14145ba:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 14145be:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
 14145c2:	48 2b 0b             	sub    rcx,QWORD PTR [rbx]
 14145c5:	48 c1 f9 02          	sar    rcx,0x2
 14145c9:	31 d2                	xor    edx,edx
 14145cb:	48 f7 f1             	div    rcx
 14145ce:	48 89 53 28          	mov    QWORD PTR [rbx+0x28],rdx
 14145d2:	5b                   	pop    rbx
 14145d3:	c3                   	ret
 14145d4:	48 85 d2             	test   rdx,rdx
 14145d7:	0f 84 93 00 00 00    	je     1414670 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259bf4>
 14145dd:	41 57                	push   r15
 14145df:	41 56                	push   r14
 14145e1:	41 54                	push   r12
 14145e3:	53                   	push   rbx
 14145e4:	50                   	push   rax
 14145e5:	48 89 fb             	mov    rbx,rdi
 14145e8:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
 14145ec:	48 85 c0             	test   rax,rax
 14145ef:	74 74                	je     1414665 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259be9>
 14145f1:	49 89 d6             	mov    r14,rdx
 14145f4:	49 89 f7             	mov    r15,rsi
 14145f7:	48 39 d0             	cmp    rax,rdx
 14145fa:	4c 0f 42 f0          	cmovb  r14,rax
 14145fe:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 1414601:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]
 1414605:	49 29 f4             	sub    r12,rsi
 1414608:	49 c1 fc 02          	sar    r12,0x2
 141460c:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
 1414610:	49 29 c4             	sub    r12,rax
 1414613:	74 1d                	je     1414632 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259bb6>
 1414615:	4d 39 f4             	cmp    r12,r14
 1414618:	4c 89 f2             	mov    rdx,r14
 141461b:	49 0f 42 d4          	cmovb  rdx,r12
 141461f:	48 c1 e2 02          	shl    rdx,0x2
 1414623:	48 8d 34 86          	lea    rsi,[rsi+rax*4]
 1414627:	4c 89 ff             	mov    rdi,r15
 141462a:	e8 b1 b4 3d 00       	call   17efae0 <memmove@plt>
 141462f:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 1414632:	4c 89 f2             	mov    rdx,r14
 1414635:	4c 29 e2             	sub    rdx,r12
 1414638:	76 10                	jbe    141464a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259bce>
 141463a:	48 c1 e2 02          	shl    rdx,0x2
 141463e:	4b 8d 3c a7          	lea    rdi,[r15+r12*4]
 1414642:	e8 99 b4 3d 00       	call   17efae0 <memmove@plt>
 1414647:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 141464a:	4c 03 73 18          	add    r14,QWORD PTR [rbx+0x18]
 141464e:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 1414652:	48 29 f1             	sub    rcx,rsi
 1414655:	48 c1 f9 02          	sar    rcx,0x2
 1414659:	4c 89 f0             	mov    rax,r14
 141465c:	31 d2                	xor    edx,edx
 141465e:	48 f7 f1             	div    rcx
 1414661:	48 89 53 18          	mov    QWORD PTR [rbx+0x18],rdx
 1414665:	48 83 c4 08          	add    rsp,0x8
 1414669:	5b                   	pop    rbx
 141466a:	41 5c                	pop    r12
 141466c:	41 5e                	pop    r14
 141466e:	41 5f                	pop    r15
 1414670:	c3                   	ret
 1414671:	cc                   	int3
 1414672:	48 85 d2             	test   rdx,rdx
 1414675:	0f 84 93 00 00 00    	je     141470e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259c92>
 141467b:	41 57                	push   r15
 141467d:	41 56                	push   r14
 141467f:	41 54                	push   r12
 1414681:	53                   	push   rbx
 1414682:	50                   	push   rax
 1414683:	48 89 fb             	mov    rbx,rdi
 1414686:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
 141468a:	48 85 c0             	test   rax,rax
 141468d:	74 74                	je     1414703 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259c87>
 141468f:	49 89 d6             	mov    r14,rdx
 1414692:	49 89 f7             	mov    r15,rsi
 1414695:	48 39 d0             	cmp    rax,rdx
 1414698:	4c 0f 42 f0          	cmovb  r14,rax
 141469c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 141469f:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]
--
 1414724:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 1414729:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 141472d:	48 85 c0             	test   rax,rax
 1414730:	74 22                	je     1414754 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259cd8>
 1414732:	48 89 fb             	mov    rbx,rdi
 1414735:	49 89 f6             	mov    r14,rsi
 1414738:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 141473c:	6a 01                	push   0x1
 141473e:	5f                   	pop    rdi
 141473f:	48 89 de             	mov    rsi,rbx
 1414742:	4c 89 f2             	mov    rdx,r14
 1414745:	ff d0                	call   rax
 1414747:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 141474b:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 141474f:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 1414754:	48 83 c4 08          	add    rsp,0x8
 1414758:	5b                   	pop    rbx
 1414759:	41 5e                	pop    r14
 141475b:	c3                   	ret
 141475c:	48 89 c7             	mov    rdi,rax
 141475f:	e8 41 53 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1414764:	41 57                	push   r15
 1414766:	41 56                	push   r14
 1414768:	41 54                	push   r12
 141476a:	53                   	push   rbx
 141476b:	50                   	push   rax
 141476c:	48 89 cb             	mov    rbx,rcx
 141476f:	49 89 d6             	mov    r14,rdx
 1414772:	49 89 f7             	mov    r15,rsi
 1414775:	49 89 fc             	mov    r12,rdi
 1414778:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 141477c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 141477f:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1414782:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 1414787:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 141478a:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
 141478e:	4c 89 fe             	mov    rsi,r15
 1414791:	4c 89 f2             	mov    rdx,r14
--
 1414913:	48 89 d0             	mov    rax,rdx
 1414916:	48 99                	cqo
 1414918:	48 f7 fe             	idiv   rsi
 141491b:	48 89 c5             	mov    rbp,rax
 141491e:	4d 8b 21             	mov    r12,QWORD PTR [r9]
 1414921:	48 89 cf             	mov    rdi,rcx
 1414924:	4c 89 c6             	mov    rsi,r8
 1414927:	4c 89 e2             	mov    rdx,r12
 141492a:	e8 8c bf ff ff       	call   14108bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e3f>
 141492f:	49 89 c6             	mov    r14,rax
 1414932:	49 89 d7             	mov    r15,rdx
 1414935:	49 01 ec             	add    r12,rbp
 1414938:	48 8d 4c 24 18       	lea    rcx,[rsp+0x18]
 141493d:	4c 89 21             	mov    QWORD PTR [rcx],r12
 1414940:	48 89 c7             	mov    rdi,rax
 1414943:	48 89 d6             	mov    rsi,rdx
 1414946:	48 89 da             	mov    rdx,rbx
 1414949:	e8 c8 bf ff ff       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
 141494e:	84 c0                	test   al,al
 1414950:	0f 84 d9 00 00 00    	je     1414a2f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259fb3>
 1414956:	49 83 fd 02          	cmp    r13,0x2
 141495a:	0f 8c c9 00 00 00    	jl     1414a29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259fad>
 1414960:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
 1414963:	45 31 e4             	xor    r12d,r12d
 1414966:	4c 89 f7             	mov    rdi,r14
 1414969:	4c 89 fe             	mov    rsi,r15
 141496c:	48 89 da             	mov    rdx,rbx
 141496f:	e8 47 bf ff ff       	call   14108bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e3f>
 1414974:	49 89 c6             	mov    r14,rax
 1414977:	49 89 d7             	mov    r15,rdx
 141497a:	48 85 d2             	test   rdx,rdx
 141497d:	0f 84 a6 00 00 00    	je     1414a29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259fad>
 1414983:	4c 89 f7             	mov    rdi,r14
 1414986:	4c 89 fe             	mov    rsi,r15
 1414989:	48 89 da             	mov    rdx,rbx
 141498c:	e8 36 bd ff ff       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 1414991:	41 80 7e 10 00       	cmp    BYTE PTR [r14+0x10],0x0
 1414996:	48 b8 ff ff ff ff ff 	movabs rax,0x7fffffffffffffff
 141499d:	ff ff 7f 
 14149a0:	74 07                	je     14149a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259f2d>
 14149a2:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
 14149a6:	48 29 d8             	sub    rax,rbx
 14149a9:	f3 41 0f 10 56 18    	movss  xmm2,DWORD PTR [r14+0x18]
 14149af:	48 89 d9             	mov    rcx,rbx
 14149b2:	49 2b 0e             	sub    rcx,QWORD PTR [r14]
 14149b5:	f3 0f 11 04 24       	movss  DWORD PTR [rsp],xmm0
 14149ba:	7c 0d                	jl     14149c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259f4d>
 14149bc:	f3 48 0f 2a c9       	cvtsi2ss xmm1,rcx
 14149c1:	f3 0f 59 c8          	mulss  xmm1,xmm0
 14149c5:	f3 0f 58 d1          	addss  xmm2,xmm1
 14149c9:	f3 0f 11 54 24 04    	movss  DWORD PTR [rsp+0x4],xmm2
 14149cf:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 14149d4:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 14149d9:	6a 01                	push   0x1
 14149db:	5e                   	pop    rsi
 14149dc:	e8 a9 be ff ff       	call   141088a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e0e>
 14149e1:	49 89 ed             	mov    r13,rbp
 14149e4:	4d 29 e5             	sub    r13,r12
 14149e7:	49 39 c5             	cmp    r13,rax
 14149ea:	4c 0f 4d e8          	cmovge r13,rax
 14149ee:	4a 8d 14 6d 00 00 00 	lea    rdx,[r13*2+0x0]
 14149f5:	00 
 14149f6:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 14149fb:	4a 8d 34 e0          	lea    rsi,[rax+r12*8]
 14149ff:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
 1414a04:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1414a07:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
 1414a0c:	f3 0f 10 44 24 04    	movss  xmm0,DWORD PTR [rsp+0x4]
 1414a12:	f3 0f 10 0c 24       	movss  xmm1,DWORD PTR [rsp]
 1414a17:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1414a1a:	4d 01 ec             	add    r12,r13
 1414a1d:	4c 01 eb             	add    rbx,r13
 1414a20:	49 39 ec             	cmp    r12,rbp
 1414a23:	0f 8c 3d ff ff ff    	jl     1414966 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259eea>
 1414a29:	8a 4c 24 60          	mov    cl,BYTE PTR [rsp+0x60]
 1414a2d:	eb 03                	jmp    1414a32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259fb6>
 1414a2f:	8a 0c 24             	mov    cl,BYTE PTR [rsp]
--
 1414a6a:	48 89 d3             	mov    rbx,rdx
 1414a6d:	49 89 f6             	mov    r14,rsi
 1414a70:	49 89 ff             	mov    r15,rdi
 1414a73:	6a 20                	push   0x20
 1414a75:	5f                   	pop    rdi
 1414a76:	e8 85 94 3d 00       	call   17edf00 <_Znwm@plt>
 1414a7b:	48 8d 0d 76 b3 45 00 	lea    rcx,[rip+0x45b376]        # 186fdf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c4e0>
 1414a82:	48 89 08             	mov    QWORD PTR [rax],rcx
 1414a85:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 1414a89:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
 1414a8d:	f3 0f 10 05 f3 9b f7 	movss  xmm0,DWORD PTR [rip+0xfffffffffef79bf3]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
 1414a94:	fe 
 1414a95:	0f 13 40 18          	movlps QWORD PTR [rax+0x18],xmm0
 1414a99:	49 89 07             	mov    QWORD PTR [r15],rax
 1414a9c:	5b                   	pop    rbx
 1414a9d:	41 5e                	pop    r14
 1414a9f:	41 5f                	pop    r15
 1414aa1:	c3                   	ret
 1414aa2:	53                   	push   rbx
 1414aa3:	48 89 cb             	mov    rbx,rcx
 1414aa6:	f3 0f 10 47 18       	movss  xmm0,DWORD PTR [rdi+0x18]
 1414aab:	0f 2e 05 d6 9b f7 fe 	ucomiss xmm0,DWORD PTR [rip+0xfffffffffef79bd6]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
 1414ab2:	75 13                	jne    1414ac7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a04b>
 1414ab4:	7a 11                	jp     1414ac7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a04b>
 1414ab6:	f3 0f 10 47 1c       	movss  xmm0,DWORD PTR [rdi+0x1c]
 1414abb:	0f 57 c9             	xorps  xmm1,xmm1
 1414abe:	0f 2e c1             	ucomiss xmm0,xmm1
 1414ac1:	75 04                	jne    1414ac7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a04b>
 1414ac3:	7a 02                	jp     1414ac7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a04b>
 1414ac5:	5b                   	pop    rbx
 1414ac6:	c3                   	ret
 1414ac7:	8a 03                	mov    al,BYTE PTR [rbx]
 1414ac9:	0c 01                	or     al,0x1
 1414acb:	88 03                	mov    BYTE PTR [rbx],al
 1414acd:	f3 0f 10 47 18       	movss  xmm0,DWORD PTR [rdi+0x18]
 1414ad2:	0f 2e 05 af 9b f7 fe 	ucomiss xmm0,DWORD PTR [rip+0xfffffffffef79baf]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
 1414ad9:	76 09                	jbe    1414ae4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a068>
 1414adb:	24 f7                	and    al,0xf7
 1414add:	88 03                	mov    BYTE PTR [rbx],al
 1414adf:	f3 0f 10 47 18       	movss  xmm0,DWORD PTR [rdi+0x18]
 1414ae4:	f3 0f 10 4f 1c       	movss  xmm1,DWORD PTR [rdi+0x1c]
 1414ae9:	0f 57 d2             	xorps  xmm2,xmm2
 1414aec:	0f 2e ca             	ucomiss xmm1,xmm2
 1414aef:	75 16                	jne    1414b07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a08b>
 1414af1:	7a 14                	jp     1414b07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a08b>
 1414af3:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 1414af7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1414afa:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
 1414afe:	48 89 f1             	mov    rcx,rsi
 1414b01:	49 89 d0             	mov    r8,rdx
 1414b04:	5b                   	pop    rbx
 1414b05:	ff e0                	jmp    rax
 1414b07:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 1414b0b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1414b0e:	48 89 f1             	mov    rcx,rsi
 1414b11:	49 89 d0             	mov    r8,rdx
 1414b14:	ff 50 38             	call   QWORD PTR [rax+0x38]
 1414b17:	0f 2e 05 6a 9b f7 fe 	ucomiss xmm0,DWORD PTR [rip+0xfffffffffef79b6a]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
 1414b1e:	76 a5                	jbe    1414ac5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a049>
 1414b20:	80 23 f7             	and    BYTE PTR [rbx],0xf7
 1414b23:	eb a0                	jmp    1414ac5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a049>
 1414b25:	cc                   	int3
 1414b26:	f3 0f 11 47 18       	movss  DWORD PTR [rdi+0x18],xmm0
 1414b2b:	f3 0f 11 4f 1c       	movss  DWORD PTR [rdi+0x1c],xmm1
 1414b30:	c3                   	ret
 1414b31:	cc                   	int3
 1414b32:	41 56                	push   r14
 1414b34:	53                   	push   rbx
 1414b35:	50                   	push   rax
 1414b36:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1414b3a:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 1414b3f:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 1414b43:	48 85 c0             	test   rax,rax
 1414b46:	74 22                	je     1414b6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a0ee>
 1414b48:	48 89 fb             	mov    rbx,rdi
 1414b4b:	49 89 f6             	mov    r14,rsi
 1414b4e:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 1414b52:	6a 01                	push   0x1
 1414b54:	5f                   	pop    rdi
 1414b55:	48 89 de             	mov    rsi,rbx
 1414b58:	4c 89 f2             	mov    rdx,r14
 1414b5b:	ff d0                	call   rax
 1414b5d:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 1414b61:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 1414b65:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 1414b6a:	48 83 c4 08          	add    rsp,0x8
 1414b6e:	5b                   	pop    rbx
 1414b6f:	41 5e                	pop    r14
 1414b71:	c3                   	ret
 1414b72:	48 89 c7             	mov    rdi,rax
 1414b75:	e8 2b 4f 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1414b7a:	55                   	push   rbp
 1414b7b:	41 57                	push   r15
 1414b7d:	41 56                	push   r14
 1414b7f:	41 55                	push   r13
 1414b81:	41 54                	push   r12
 1414b83:	53                   	push   rbx
 1414b84:	48 83 ec 18          	sub    rsp,0x18
 1414b88:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
 1414b8d:	49 89 d6             	mov    r14,rdx
 1414b90:	49 89 f7             	mov    r15,rsi
 1414b93:	49 89 fc             	mov    r12,rdi
 1414b96:	48 8d 47 14          	lea    rax,[rdi+0x14]
 1414b9a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1414b9f:	f2 0f 10 67 14       	movsd  xmm4,QWORD PTR [rdi+0x14]
 1414ba4:	0f c2 e0 00          	cmpeqps xmm4,xmm0
 1414ba8:	0f 14 e4             	unpcklps xmm4,xmm4
 1414bab:	66 0f 50 c4          	movmskpd eax,xmm4
--
 1415035:	0f 84 3b 02 00 00    	je     1415276 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a7fa>
 141503b:	48 89 c3             	mov    rbx,rax
 141503e:	49 89 d5             	mov    r13,rdx
 1415041:	4c 89 f7             	mov    rdi,r14
 1415044:	4c 89 64 24 68       	mov    QWORD PTR [rsp+0x68],r12
 1415049:	4c 89 e6             	mov    rsi,r12
 141504c:	4c 89 fa             	mov    rdx,r15
 141504f:	e8 73 b6 ff ff       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 1415054:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
 141505b:	00 
 141505c:	49 8b 06             	mov    rax,QWORD PTR [r14]
 141505f:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 1415064:	f3 41 0f 10 46 18    	movss  xmm0,DWORD PTR [r14+0x18]
 141506a:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
 141506f:	49 89 ec             	mov    r12,rbp
 1415072:	48 89 ef             	mov    rdi,rbp
 1415075:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
 1415079:	4c 89 fa             	mov    rdx,r15
 141507c:	e8 46 b6 ff ff       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 1415081:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
 1415086:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 141508a:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 141508f:	f3 0f 10 45 18       	movss  xmm0,DWORD PTR [rbp+0x18]
 1415094:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
 141509b:	00 
 141509c:	48 89 df             	mov    rdi,rbx
 141509f:	4c 89 ee             	mov    rsi,r13
 14150a2:	4c 89 fa             	mov    rdx,r15
 14150a5:	e8 1d b6 ff ff       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 14150aa:	41 80 7e 10 00       	cmp    BYTE PTR [r14+0x10],0x0
 14150af:	48 ba ff ff ff ff ff 	movabs rdx,0x7fffffffffffffff
 14150b6:	ff ff 7f 
 14150b9:	48 89 d0             	mov    rax,rdx
 14150bc:	74 07                	je     14150c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a649>
 14150be:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
 14150c2:	4c 29 f8             	sub    rax,r15
 14150c5:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
 14150c8:	f3 0f 10 5b 18       	movss  xmm3,DWORD PTR [rbx+0x18]
 14150cd:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
 14150d4:	00 
 14150d5:	80 7d 10 00          	cmp    BYTE PTR [rbp+0x10],0x0
 14150d9:	48 89 d0             	mov    rax,rdx
 14150dc:	74 07                	je     14150e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a669>
 14150de:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
 14150e2:	4c 29 f8             	sub    rax,r15
 14150e5:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 14150ec:	00 
 14150ed:	80 7b 10 00          	cmp    BYTE PTR [rbx+0x10],0x0
 14150f1:	48 89 d0             	mov    rax,rdx
 14150f4:	0f 28 8c 24 80 00 00 	movaps xmm1,XMMWORD PTR [rsp+0x80]
 14150fb:	00 
 14150fc:	0f 28 a4 24 90 00 00 	movaps xmm4,XMMWORD PTR [rsp+0x90]
 1415103:	00 
 1415104:	74 07                	je     141510d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a691>
 1415106:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 141510a:	4c 29 f8             	sub    rax,r15
 141510d:	4c 89 fa             	mov    rdx,r15
 1415110:	48 29 ca             	sub    rdx,rcx
 1415113:	7c 0d                	jl     1415122 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a6a6>
 1415115:	f3 48 0f 2a d2       	cvtsi2ss xmm2,rdx
 141511a:	f3 0f 59 d0          	mulss  xmm2,xmm0
 141511e:	f3 0f 58 da          	addss  xmm3,xmm2
 1415122:	4c 89 f9             	mov    rcx,r15
 1415125:	48 2b 4c 24 50       	sub    rcx,QWORD PTR [rsp+0x50]
 141512a:	7c 0f                	jl     141513b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a6bf>
 141512c:	f3 48 0f 2a d1       	cvtsi2ss xmm2,rcx
 1415131:	f3 0f 59 54 24 70    	mulss  xmm2,DWORD PTR [rsp+0x70]
 1415137:	f3 0f 58 e2          	addss  xmm4,xmm2
 141513b:	4c 89 f9             	mov    rcx,r15
 141513e:	48 2b 4c 24 58       	sub    rcx,QWORD PTR [rsp+0x58]
 1415143:	4c 89 74 24 60       	mov    QWORD PTR [rsp+0x60],r14
 1415148:	f3 0f 11 44 24 1c    	movss  DWORD PTR [rsp+0x1c],xmm0
 141514e:	f3 0f 11 5c 24 18    	movss  DWORD PTR [rsp+0x18],xmm3
 1415154:	7c 19                	jl     141516f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a6f3>
 1415156:	f3 48 0f 2a c1       	cvtsi2ss xmm0,rcx
 141515b:	f3 0f 59 c1          	mulss  xmm0,xmm1
 141515f:	0f 28 54 24 30       	movaps xmm2,XMMWORD PTR [rsp+0x30]
 1415164:	f3 0f 58 d0          	addss  xmm2,xmm0
 1415168:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
 141516d:	eb 0a                	jmp    1415179 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a6fd>
 141516f:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
 1415174:	0f 28 54 24 30       	movaps xmm2,XMMWORD PTR [rsp+0x30]
 1415179:	66 0f 3a 21 d4 10    	insertps xmm2,xmm4,0x10
 141517f:	0f 29 54 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm2
 1415184:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
 141518b:	00 
 141518c:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 1415193:	00 
 1415194:	6a 03                	push   0x3
 1415196:	5e                   	pop    rsi
 1415197:	e8 ee b6 ff ff       	call   141088a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e0e>
 141519c:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]
 14151a1:	4d 89 f4             	mov    r12,r14
 14151a4:	49 29 dc             	sub    r12,rbx
 14151a7:	49 39 c4             	cmp    r12,rax
 14151aa:	4c 0f 4d e0          	cmovge r12,rax
 14151ae:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
--
 14151b6:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
 14151ba:	48 8d 34 dd 00 00 00 	lea    rsi,[rbx*8+0x0]
 14151c1:	00 
 14151c2:	48 03 30             	add    rsi,QWORD PTR [rax]
 14151c5:	4b 8d 14 24          	lea    rdx,[r12+r12*1]
 14151c9:	48 8b 49 10          	mov    rcx,QWORD PTR [rcx+0x10]
 14151cd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14151d0:	0f 28 94 24 80 00 00 	movaps xmm2,XMMWORD PTR [rsp+0x80]
 14151d7:	00 
 14151d8:	66 0f 3a 21 54 24 70 	insertps xmm2,DWORD PTR [rsp+0x70],0x10
 14151df:	10 
 14151e0:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
 14151e5:	f3 0f 10 4c 24 18    	movss  xmm1,DWORD PTR [rsp+0x18]
 14151eb:	f3 0f 10 5c 24 1c    	movss  xmm3,DWORD PTR [rsp+0x1c]
 14151f1:	ff 50 10             	call   QWORD PTR [rax+0x10]
 14151f4:	4c 01 e3             	add    rbx,r12
 14151f7:	4d 01 e7             	add    r15,r12
 14151fa:	4c 39 f3             	cmp    rbx,r14
 14151fd:	4c 8b 64 24 68       	mov    r12,QWORD PTR [rsp+0x68]
 1415202:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
 1415207:	0f 8c c5 fd ff ff    	jl     1414fd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a556>
 141520d:	eb 67                	jmp    1415276 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a7fa>
 141520f:	4c 89 ed             	mov    rbp,r13
 1415212:	48 8d 84 24 10 01 00 	lea    rax,[rsp+0x110]
 1415219:	00 
 141521a:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 141521e:	4c 8b 68 28          	mov    r13,QWORD PTR [rax+0x28]
 1415222:	49 8b 07             	mov    rax,QWORD PTR [r15]
 1415225:	48 01 d8             	add    rax,rbx
 1415228:	48 8d 8c 24 a8 00 00 	lea    rcx,[rsp+0xa8]
 141522f:	00 
 1415230:	48 89 01             	mov    QWORD PTR [rcx],rax
 1415233:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
 1415238:	4c 89 ee             	mov    rsi,r13
 141523b:	4c 89 fa             	mov    rdx,r15
 141523e:	e8 d3 b6 ff ff       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
 1415243:	84 c0                	test   al,al
--
 141525e:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 1415263:	0f 11 50 20          	movups XMMWORD PTR [rax+0x20],xmm2
 1415267:	0f 11 48 10          	movups XMMWORD PTR [rax+0x10],xmm1
 141526b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 141526e:	eb 30                	jmp    14152a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a824>
 1415270:	31 c0                	xor    eax,eax
 1415272:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 1415276:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 141527b:	4c 89 30             	mov    QWORD PTR [rax],r14
 141527e:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
 1415282:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp
 1415286:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
 141528a:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
 141528e:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 1415293:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
 1415297:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 141529c:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
 14152a0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14152a7:	00 00 
 14152a9:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
 14152b0:	00 
 14152b1:	75 12                	jne    14152c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25a849>
 14152b3:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
 14152ba:	5b                   	pop    rbx
 14152bb:	41 5c                	pop    r12
 14152bd:	41 5d                	pop    r13
 14152bf:	41 5e                	pop    r14
 14152c1:	41 5f                	pop    r15
 14152c3:	5d                   	pop    rbp
 14152c4:	c3                   	ret
 14152c5:	e8 e6 a7 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 14152ca:	55                   	push   rbp
 14152cb:	41 57                	push   r15
 14152cd:	41 56                	push   r14
 14152cf:	41 55                	push   r13
 14152d1:	41 54                	push   r12
 14152d3:	53                   	push   rbx
--
 14152e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14152ef:	00 00 
 14152f1:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
 14152f8:	00 
 14152f9:	6a 60                	push   0x60
 14152fb:	5f                   	pop    rdi
 14152fc:	e8 ff 8b 3d 00       	call   17edf00 <_Znwm@plt>
 1415301:	48 89 c3             	mov    rbx,rax
 1415304:	48 8d 05 6d aa 45 00 	lea    rax,[rip+0x45aa6d]        # 186fd78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c460>
 141530b:	48 89 03             	mov    QWORD PTR [rbx],rax
 141530e:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
 1415312:	4c 89 63 10          	mov    QWORD PTR [rbx+0x10],r12
 1415316:	89 6b 18             	mov    DWORD PTR [rbx+0x18],ebp
 1415319:	48 83 63 1c 00       	and    QWORD PTR [rbx+0x1c],0x0
 141531e:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0
 1415323:	83 63 30 00          	and    DWORD PTR [rbx+0x30],0x0
 1415327:	48 83 63 48 00       	and    QWORD PTR [rbx+0x48],0x0
 141532c:	89 e8                	mov    eax,ebp
 141532e:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 1415333:	0f 57 c9             	xorps  xmm1,xmm1
 1415336:	f3 0f 5f 05 4a 93 f7 	maxss  xmm0,DWORD PTR [rip+0xfffffffffef7934a]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
 141533d:	fe 
 141533e:	0f 11 4b 38          	movups XMMWORD PTR [rbx+0x38],xmm1
 1415342:	f3 0f 11 43 50       	movss  DWORD PTR [rbx+0x50],xmm0
 1415347:	f3 0f 10 0d 49 94 f7 	movss  xmm1,DWORD PTR [rip+0xfffffffffef79449]        # 38e798 <_ZTSSt12bad_any_cast@@Base-0x1a30>
 141534e:	fe 
 141534f:	f3 0f 59 c8          	mulss  xmm1,xmm0
 1415353:	0f 57 d2             	xorps  xmm2,xmm2
 1415356:	f3 0f 5d ca          	minss  xmm1,xmm2
 141535a:	f3 0f 5e c8          	divss  xmm1,xmm0
 141535e:	f3 0f 11 4b 58       	movss  DWORD PTR [rbx+0x58],xmm1
 1415363:	c6 43 5c 01          	mov    BYTE PTR [rbx+0x5c],0x1
 1415367:	83 63 54 00          	and    DWORD PTR [rbx+0x54],0x0
 141536b:	48 8d 4b 28          	lea    rcx,[rbx+0x28]
 141536f:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
 1415374:	f2 48 0f 2a c0       	cvtsi2sd xmm0,rax
 1415379:	f2 0f 12 c8          	movddup xmm1,xmm0
--
 1415419:	66 0f 15 d4          	unpckhpd xmm2,xmm4
 141541d:	f2 0f 5c da          	subsd  xmm3,xmm2
 1415421:	f2 41 0f 10 16       	movsd  xmm2,QWORD PTR [r14]
 1415426:	f2 0f 59 d5          	mulsd  xmm2,xmm5
 141542a:	66 0f 58 25 3e 88 f7 	addpd  xmm4,XMMWORD PTR [rip+0xfffffffffef7883e]        # 38dc70 <_ZTSSt12bad_any_cast@@Base-0x2558>
 1415431:	fe 
 1415432:	66 0f 29 64 24 30    	movapd XMMWORD PTR [rsp+0x30],xmm4
 1415438:	4c 8d ac 24 c0 00 00 	lea    r13,[rsp+0xc0]
 141543f:	00 
 1415440:	66 41 0f 13 65 00    	movlpd QWORD PTR [r13+0x0],xmm4
 1415446:	f2 41 0f 11 4d 08    	movsd  QWORD PTR [r13+0x8],xmm1
 141544c:	f2 41 0f 11 45 10    	movsd  QWORD PTR [r13+0x10],xmm0
 1415452:	f2 41 0f 11 45 18    	movsd  QWORD PTR [r13+0x18],xmm0
 1415458:	f2 41 0f 11 4d 20    	movsd  QWORD PTR [r13+0x20],xmm1
 141545e:	66 41 0f 11 65 28    	movupd XMMWORD PTR [r13+0x28],xmm4
 1415464:	f2 41 0f 11 55 38    	movsd  QWORD PTR [r13+0x38],xmm2
 141546a:	f2 41 0f 11 5d 40    	movsd  QWORD PTR [r13+0x40],xmm3
 1415470:	f2 41 0f 11 5d 48    	movsd  QWORD PTR [r13+0x48],xmm3
 1415476:	f2 41 0f 11 55 50    	movsd  QWORD PTR [r13+0x50],xmm2
 141547c:	66 0f 28 05 6c 7b f7 	movapd xmm0,XMMWORD PTR [rip+0xfffffffffef77b6c]        # 38cff0 <_ZTSSt12bad_any_cast@@Base-0x31d8>
 1415483:	fe 
 1415484:	66 0f 5e 44 24 20    	divpd  xmm0,XMMWORD PTR [rsp+0x20]
 141548a:	66 0f 59 05 ee 74 f7 	mulpd  xmm0,XMMWORD PTR [rip+0xfffffffffef774ee]        # 38c980 <_ZTSSt12bad_any_cast@@Base-0x3848>
 1415491:	fe 
 1415492:	66 0f 29 44 24 10    	movapd XMMWORD PTR [rsp+0x10],xmm0
 1415498:	4c 8d 74 24 58       	lea    r14,[rsp+0x58]
 141549d:	48 8d 6c 24 50       	lea    rbp,[rsp+0x50]
 14154a2:	4c 89 f7             	mov    rdi,r14
 14154a5:	48 89 ee             	mov    rsi,rbp
 14154a8:	e8 f3 97 3d 00       	call   17eeca0 <sincos@plt>
 14154ad:	f2 41 0f 10 06       	movsd  xmm0,QWORD PTR [r14]
 14154b2:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 14154b7:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
 14154bc:	0f 12 c0             	movhlps xmm0,xmm0
 14154bf:	4c 8d 74 24 68       	lea    r14,[rsp+0x68]
 14154c4:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
 14154c9:	4c 89 f7             	mov    rdi,r14
--
 141571a:	49 8b 47 38          	mov    rax,QWORD PTR [r15+0x38]
 141571e:	49 89 c8             	mov    r8,rcx
 1415721:	49 29 c0             	sub    r8,rax
 1415724:	0f 84 61 03 00 00    	je     1415a8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b00f>
 141572a:	4d 8d 67 50          	lea    r12,[r15+0x50]
 141572e:	4d 8d 6f 28          	lea    r13,[r15+0x28]
 1415732:	45 31 f6             	xor    r14d,r14d
 1415735:	48 8d 9c 24 c8 00 00 	lea    rbx,[rsp+0xc8]
 141573c:	00 
 141573d:	31 ed                	xor    ebp,ebp
 141573f:	4c 89 e7             	mov    rdi,r12
 1415742:	e8 cd d4 ff ff       	call   1412c14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258198>
 1415747:	41 8b 47 18          	mov    eax,DWORD PTR [r15+0x18]
 141574b:	f2 48 0f 2a c8       	cvtsi2sd xmm1,rax
 1415750:	41 0f 10 57 20       	movups xmm2,XMMWORD PTR [r15+0x20]
 1415755:	f3 0f 12 c0          	movsldup xmm0,xmm0
 1415759:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 141575e:	0f 28 1d ab 7e f7 fe 	movaps xmm3,XMMWORD PTR [rip+0xfffffffffef77eab]        # 38d610 <_ZTSSt12bad_any_cast@@Base-0x2bb8>
 1415765:	0f 59 c3             	mulps  xmm0,xmm3
 1415768:	f3 0f 12 d2          	movsldup xmm2,xmm2
 141576c:	0f 29 54 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm2
 1415771:	0f 59 c2             	mulps  xmm0,xmm2
 1415774:	0f 58 c3             	addps  xmm0,xmm3
 1415777:	f3 0f 5b d0          	cvttps2dq xmm2,xmm0
 141577b:	66 0f 6f da          	movdqa xmm3,xmm2
 141577f:	66 0f 72 e3 1f       	psrad  xmm3,0x1f
 1415784:	0f 28 25 55 7f f7 fe 	movaps xmm4,XMMWORD PTR [rip+0xfffffffffef77f55]        # 38d6e0 <_ZTSSt12bad_any_cast@@Base-0x2ae8>
 141578b:	0f 5c c4             	subps  xmm0,xmm4
 141578e:	f3 0f 5b c0          	cvttps2dq xmm0,xmm0
 1415792:	66 0f db c3          	pand   xmm0,xmm3
 1415796:	66 0f eb c2          	por    xmm0,xmm2
 141579a:	66 0f 38 35 d0       	pmovzxdq xmm2,xmm0
 141579f:	66 0f 6f 05 b9 84 f7 	movdqa xmm0,XMMWORD PTR [rip+0xfffffffffef784b9]        # 38dc60 <_ZTSSt12bad_any_cast@@Base-0x2568>
 14157a6:	fe 
 14157a7:	66 0f eb d0          	por    xmm2,xmm0
 14157ab:	66 0f 5c d0          	subpd  xmm2,xmm0
 14157af:	f2 0f 12 c1          	movddup xmm0,xmm1
--
 1415b92:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
 1415b97:	49 89 d6             	mov    r14,rdx
 1415b9a:	49 89 f7             	mov    r15,rsi
 1415b9d:	49 89 fc             	mov    r12,rdi
 1415ba0:	48 8d 44 24 50       	lea    rax,[rsp+0x50]
 1415ba5:	4c 89 c1             	mov    rcx,r8
 1415ba8:	48 c1 e9 20          	shr    rcx,0x20
 1415bac:	48 8d 57 14          	lea    rdx,[rdi+0x14]
 1415bb0:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
 1415bb5:	8b 10                	mov    edx,DWORD PTR [rax]
 1415bb7:	44 39 47 14          	cmp    DWORD PTR [rdi+0x14],r8d
 1415bbb:	75 30                	jne    1415bed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b171>
 1415bbd:	41 39 4c 24 18       	cmp    DWORD PTR [r12+0x18],ecx
 1415bc2:	75 29                	jne    1415bed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b171>
 1415bc4:	45 38 4c 24 1c       	cmp    BYTE PTR [r12+0x1c],r9b
 1415bc9:	75 22                	jne    1415bed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b171>
 1415bcb:	8b 70 04             	mov    esi,DWORD PTR [rax+0x4]
 1415bce:	41 39 54 24 20       	cmp    DWORD PTR [r12+0x20],edx
 1415bd3:	75 1b                	jne    1415bf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b174>
 1415bd5:	41 8b 7c 24 24       	mov    edi,DWORD PTR [r12+0x24]
 1415bda:	39 f7                	cmp    edi,esi
 1415bdc:	75 12                	jne    1415bf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b174>
 1415bde:	45 8a 54 24 28       	mov    r10b,BYTE PTR [r12+0x28]
 1415be3:	89 fe                	mov    esi,edi
 1415be5:	44 3a 50 08          	cmp    r10b,BYTE PTR [rax+0x8]
 1415be9:	75 05                	jne    1415bf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b174>
 1415beb:	eb 39                	jmp    1415c26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b1aa>
 1415bed:	8b 70 04             	mov    esi,DWORD PTR [rax+0x4]
 1415bf0:	41 83 64 24 2c 00    	and    DWORD PTR [r12+0x2c],0x0
 1415bf6:	45 89 44 24 14       	mov    DWORD PTR [r12+0x14],r8d
 1415bfb:	41 89 4c 24 18       	mov    DWORD PTR [r12+0x18],ecx
 1415c00:	45 88 4c 24 1c       	mov    BYTE PTR [r12+0x1c],r9b
 1415c05:	41 89 54 24 20       	mov    DWORD PTR [r12+0x20],edx
 1415c0a:	41 89 74 24 24       	mov    DWORD PTR [r12+0x24],esi
 1415c0f:	8a 40 08             	mov    al,BYTE PTR [rax+0x8]
 1415c12:	41 88 44 24 28       	mov    BYTE PTR [r12+0x28],al
 1415c17:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 1415c1c:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
 1415c21:	e8 b8 00 00 00       	call   1415cde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b262>
 1415c26:	4d 85 f6             	test   r14,r14
 1415c29:	0f 84 a0 00 00 00    	je     1415ccf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b253>
 1415c2f:	6a 02                	push   0x2
 1415c31:	41 5d                	pop    r13
 1415c33:	4c 89 f0             	mov    rax,r14
 1415c36:	48 99                	cqo
 1415c38:	49 f7 fd             	idiv   r13
 1415c3b:	49 63 4c 24 2c       	movsxd rcx,DWORD PTR [r12+0x2c]
 1415c40:	bb 00 04 00 00       	mov    ebx,0x400
 1415c45:	48 29 cb             	sub    rbx,rcx
 1415c48:	48 39 d8             	cmp    rax,rbx
 1415c4b:	48 0f 4c d8          	cmovl  rbx,rax
 1415c4f:	48 8d 2c 1b          	lea    rbp,[rbx+rbx*1]
 1415c53:	41 80 7c 24 10 00    	cmp    BYTE PTR [r12+0x10],0x0
 1415c59:	74 1b                	je     1415c76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b1fa>
 1415c5b:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
--
 1415e6c:	74 0f                	je     1415e7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b401>
 1415e6e:	4c 0f af e0          	imul   r12,rax
 1415e72:	4c 89 e0             	mov    rax,r12
 1415e75:	48 99                	cqo
 1415e77:	48 f7 ff             	idiv   rdi
 1415e7a:	49 89 c4             	mov    r12,rax
 1415e7d:	45 8b 7d 10          	mov    r15d,DWORD PTR [r13+0x10]
 1415e81:	49 39 f4             	cmp    r12,rsi
 1415e84:	7e 22                	jle    1415ea8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b42c>
 1415e86:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
 1415e8a:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
 1415e8f:	c6 44 24 10 01       	mov    BYTE PTR [rsp+0x10],0x1
 1415e94:	89 4c 24 18          	mov    DWORD PTR [rsp+0x18],ecx
 1415e98:	44 89 7c 24 1c       	mov    DWORD PTR [rsp+0x1c],r15d
 1415e9d:	4c 89 f7             	mov    rdi,r14
 1415ea0:	48 89 e6             	mov    rsi,rsp
 1415ea3:	e8 82 00 00 00       	call   1415f2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b4ae>
 1415ea8:	49 83 c5 18          	add    r13,0x18
 1415eac:	44 89 f9             	mov    ecx,r15d
 1415eaf:	4c 89 e6             	mov    rsi,r12
 1415eb2:	49 39 ed             	cmp    r13,rbp
 1415eb5:	75 9f                	jne    1415e56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b3da>
 1415eb7:	eb 0e                	jmp    1415ec7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b44b>
 1415eb9:	45 31 e4             	xor    r12d,r12d
 1415ebc:	45 31 ff             	xor    r15d,r15d
 1415ebf:	eb 06                	jmp    1415ec7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b44b>
 1415ec1:	49 89 f4             	mov    r12,rsi
 1415ec4:	41 89 cf             	mov    r15d,ecx
 1415ec7:	48 89 e6             	mov    rsi,rsp
 1415eca:	4c 89 26             	mov    QWORD PTR [rsi],r12
 1415ecd:	31 c0                	xor    eax,eax
 1415ecf:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
 1415ed2:	88 46 10             	mov    BYTE PTR [rsi+0x10],al
 1415ed5:	44 89 7e 18          	mov    DWORD PTR [rsi+0x18],r15d
 1415ed9:	44 89 7e 1c          	mov    DWORD PTR [rsi+0x1c],r15d
 1415edd:	4c 89 f7             	mov    rdi,r14
 1415ee0:	e8 45 00 00 00       	call   1415f2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b4ae>
 1415ee5:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
 1415ee9:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
 1415eed:	48 29 c1             	sub    rcx,rax
 1415ef0:	48 c1 f9 05          	sar    rcx,0x5
 1415ef4:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
 1415ef8:	48 89 4b 48          	mov    QWORD PTR [rbx+0x48],rcx
 1415efc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1415f03:	00 00 
 1415f05:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 1415f0a:	75 0f                	jne    1415f1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b49f>
 1415f0c:	48 83 c4 28          	add    rsp,0x28
 1415f10:	5b                   	pop    rbx
 1415f11:	41 5c                	pop    r12
 1415f13:	41 5d                	pop    r13
 1415f15:	41 5e                	pop    r14
 1415f17:	41 5f                	pop    r15
 1415f19:	5d                   	pop    rbp
 1415f1a:	c3                   	ret
 1415f1b:	e8 90 9b 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 1415f20:	eb 00                	jmp    1415f22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b4a6>
 1415f22:	48 89 c7             	mov    rdi,rax
--
 1416161:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1416164:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
 1416168:	4c 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],r13
 141616d:	4f 8d 74 3d 00       	lea    r14,[r13+r15*1+0x0]
 1416172:	48 8d 8c 24 a8 00 00 	lea    rcx,[rsp+0xa8]
 1416179:	00 
 141617a:	4c 89 31             	mov    QWORD PTR [rcx],r14
 141617d:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
 1416182:	49 89 fd             	mov    r13,rdi
 1416185:	48 89 74 24 28       	mov    QWORD PTR [rsp+0x28],rsi
 141618a:	e8 87 a7 ff ff       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
 141618f:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 1416193:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
 1416197:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
 141619c:	84 c0                	test   al,al
 141619e:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
 14161a2:	75 2a                	jne    14161ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b752>
 14161a4:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
 14161ab:	00 
 14161ac:	4c 89 31             	mov    QWORD PTR [rcx],r14
 14161af:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
 14161b4:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 14161b8:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 14161bd:	e8 54 a7 ff ff       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
 14161c2:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
 14161c6:	84 c0                	test   al,al
 14161c8:	0f 84 cc 02 00 00    	je     141649a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ba1e>
 14161ce:	48 83 7c 24 10 01    	cmp    QWORD PTR [rsp+0x10],0x1
 14161d4:	4c 89 eb             	mov    rbx,r13
 14161d7:	0f 8e df 02 00 00    	jle    14164bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ba40>
 14161dd:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
 14161e2:	45 31 ed             	xor    r13d,r13d
 14161e5:	48 89 df             	mov    rdi,rbx
 14161e8:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 14161ed:	4c 89 fa             	mov    rdx,r15
 14161f0:	e8 c6 a6 ff ff       	call   14108bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e3f>
 14161f5:	48 89 c3             	mov    rbx,rax
 14161f8:	48 89 d0             	mov    rax,rdx
 14161fb:	48 89 54 24 28       	mov    QWORD PTR [rsp+0x28],rdx
 1416200:	48 85 d2             	test   rdx,rdx
 1416203:	0f 84 ba 02 00 00    	je     14164c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ba47>
 1416209:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 141620d:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 1416212:	4c 89 fa             	mov    rdx,r15
 1416215:	e8 a1 a6 ff ff       	call   14108bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e3f>
 141621a:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 141621e:	48 89 d0             	mov    rax,rdx
 1416221:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
 1416226:	48 85 d2             	test   rdx,rdx
 1416229:	0f 84 9d 02 00 00    	je     14164cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ba50>
 141622f:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 1416234:	48 89 ee             	mov    rsi,rbp
 1416237:	4c 89 fa             	mov    rdx,r15
 141623a:	e8 7c a6 ff ff       	call   14108bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e3f>
 141623f:	48 85 d2             	test   rdx,rdx
 1416242:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 1416247:	0f 84 88 02 00 00    	je     14164d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ba59>
 141624d:	49 89 c4             	mov    r12,rax
 1416250:	49 89 d6             	mov    r14,rdx
 1416253:	48 89 df             	mov    rdi,rbx
 1416256:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 141625b:	4c 89 fa             	mov    rdx,r15
 141625e:	e8 35 a5 ff ff       	call   1410798 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d1c>
 1416263:	4c 89 f9             	mov    rcx,r15
 1416266:	8b 53 18             	mov    edx,DWORD PTR [rbx+0x18]
 1416269:	48 2b 0b             	sub    rcx,QWORD PTR [rbx]
 141626c:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
 1416271:	89 44 24 3c          	mov    DWORD PTR [rsp+0x3c],eax
 1416275:	7d 06                	jge    141627d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b801>
 1416277:	89 54 24 34          	mov    DWORD PTR [rsp+0x34],edx
 141627b:	eb 1d                	jmp    141629a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b81e>
 141627d:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
 1416281:	f3 0f 2a ca          	cvtsi2ss xmm1,edx
 1416285:	f3 48 0f 2a d1       	cvtsi2ss xmm2,rcx
 141628a:	f3 0f 59 d0          	mulss  xmm2,xmm0
 141628e:	f3 0f 58 d1          	addss  xmm2,xmm1
 1416292:	f3 0f 2c c2          	cvttss2si eax,xmm2
 1416296:	89 44 24 34          	mov    DWORD PTR [rsp+0x34],eax
 141629a:	48 bd ff ff ff ff ff 	movabs rbp,0x7fffffffffffffff
 14162a1:	ff ff 7f 
 14162a4:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 14162a8:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 14162ad:	4c 89 fa             	mov    rdx,r15
 14162b0:	e8 e3 a4 ff ff       	call   1410798 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255d1c>
 14162b5:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
 14162b9:	4c 89 f9             	mov    rcx,r15
 14162bc:	8b 5a 18             	mov    ebx,DWORD PTR [rdx+0x18]
 14162bf:	48 2b 0a             	sub    rcx,QWORD PTR [rdx]
 14162c2:	7c 19                	jl     14162dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b861>
 14162c4:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
 14162c8:	f3 0f 2a cb          	cvtsi2ss xmm1,ebx
 14162cc:	f3 48 0f 2a d1       	cvtsi2ss xmm2,rcx
 14162d1:	f3 0f 59 d0          	mulss  xmm2,xmm0
 14162d5:	f3 0f 58 d1          	addss  xmm2,xmm1
 14162d9:	f3 0f 2c da          	cvttss2si ebx,xmm2
 14162dd:	4d 3b 3c 24          	cmp    r15,QWORD PTR [r12]
 14162e1:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 14162e6:	89 44 24 38          	mov    DWORD PTR [rsp+0x38],eax
 14162ea:	7d 0f                	jge    14162fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b87f>
 14162ec:	45 8a 74 24 18       	mov    r14b,BYTE PTR [r12+0x18]
 14162f1:	c7 44 24 30 00 00 00 	mov    DWORD PTR [rsp+0x30],0x0
 14162f8:	00 
 14162f9:	eb 1f                	jmp    141631a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b89e>
 14162fb:	41 80 7c 24 10 00    	cmp    BYTE PTR [r12+0x10],0x0
 1416301:	74 0b                	je     141630e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b892>
 1416303:	4d 3b 7c 24 08       	cmp    r15,QWORD PTR [r12+0x8]
 1416308:	0f 8d 04 01 00 00    	jge    1416412 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b996>
 141630e:	45 8a 74 24 18       	mov    r14b,BYTE PTR [r12+0x18]
 1416313:	44 89 f0             	mov    eax,r14d
 1416316:	89 44 24 30          	mov    DWORD PTR [rsp+0x30],eax
 141631a:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 141631f:	80 79 10 00          	cmp    BYTE PTR [rcx+0x10],0x0
 1416323:	48 89 e8             	mov    rax,rbp
 1416326:	74 07                	je     141632f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b8b3>
 1416328:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
 141632c:	4c 29 f8             	sub    rax,r15
 141632f:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
 1416336:	00 
 1416337:	80 7a 10 00          	cmp    BYTE PTR [rdx+0x10],0x0
 141633b:	48 89 e8             	mov    rax,rbp
 141633e:	74 07                	je     1416347 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b8cb>
 1416340:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
 1416344:	4c 29 f8             	sub    rax,r15
 1416347:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
 141634e:	00 
 141634f:	41 80 7c 24 10 00    	cmp    BYTE PTR [r12+0x10],0x0
 1416355:	48 89 e8             	mov    rax,rbp
 1416358:	74 08                	je     1416362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b8e6>
 141635a:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
 141635f:	4c 29 f8             	sub    rax,r15
 1416362:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
 1416369:	00 
--
 14164a6:	48 85 ed             	test   rbp,rbp
 14164a9:	4c 89 eb             	mov    rbx,r13
 14164ac:	74 0e                	je     14164bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ba40>
 14164ae:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 14164b3:	4c 3b 30             	cmp    r14,QWORD PTR [rax]
 14164b6:	0f 8d 8e 00 00 00    	jge    141654a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bace>
 14164bc:	44 8b 44 24 08       	mov    r8d,DWORD PTR [rsp+0x8]
 14164c1:	eb 22                	jmp    14164e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ba69>
 14164c3:	31 c0                	xor    eax,eax
 14164c5:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 14164ca:	eb 0b                	jmp    14164d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ba5b>
 14164cc:	31 c0                	xor    eax,eax
 14164ce:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 14164d3:	eb 02                	jmp    14164d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ba5b>
 14164d5:	31 ed                	xor    ebp,ebp
 14164d7:	44 8a 44 24 6f       	mov    r8b,BYTE PTR [rsp+0x6f]
 14164dc:	4c 8b 64 24 40       	mov    r12,QWORD PTR [rsp+0x40]
 14164e1:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
 14164e5:	49 89 5c 24 58       	mov    QWORD PTR [r12+0x58],rbx
 14164ea:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 14164ef:	49 89 44 24 60       	mov    QWORD PTR [r12+0x60],rax
 14164f4:	49 89 b4 24 d0 00 00 	mov    QWORD PTR [r12+0xd0],rsi
 14164fb:	00 
 14164fc:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 1416501:	49 89 84 24 d8 00 00 	mov    QWORD PTR [r12+0xd8],rax
 1416508:	00 
 1416509:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 141650e:	49 89 84 24 48 01 00 	mov    QWORD PTR [r12+0x148],rax
 1416515:	00 
 1416516:	49 89 ac 24 50 01 00 	mov    QWORD PTR [r12+0x150],rbp
 141651d:	00 
 141651e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1416525:	00 00 
 1416527:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
 141652e:	00 
 141652f:	0f 85 c2 00 00 00    	jne    14165f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bb7b>
 1416535:	44 89 c0             	mov    eax,r8d
 1416538:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
 141653f:	5b                   	pop    rbx
 1416540:	41 5c                	pop    r12
 1416542:	41 5d                	pop    r13
 1416544:	41 5e                	pop    r14
 1416546:	41 5f                	pop    r15
 1416548:	5d                   	pop    rbp
 1416549:	c3                   	ret
 141654a:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
 141654f:	48 89 df             	mov    rdi,rbx
 1416552:	48 89 ee             	mov    rsi,rbp
--
 141659b:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
 141659e:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 14165a3:	48 8d 35 7b 72 f4 fe 	lea    rsi,[rip+0xfffffffffef4727b]        # 35d825 <_ZTSSt12bad_any_cast@@Base-0x329a3>
 14165aa:	48 89 df             	mov    rdi,rbx
 14165ad:	e8 40 fa 3b 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
 14165b2:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 14165b9:	00 
 14165ba:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1
 14165c1:	48 8d 05 b4 b9 03 ff 	lea    rax,[rip+0xffffffffff03b9b4]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 14165c8:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 14165cc:	48 8d 05 80 c4 f5 fe 	lea    rax,[rip+0xfffffffffef5c480]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>
 14165d3:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 14165d7:	c7 47 18 3b 00 00 00 	mov    DWORD PTR [rdi+0x18],0x3b
 14165de:	48 89 de             	mov    rsi,rbx
 14165e1:	e8 c2 36 69 ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
 14165e6:	48 89 df             	mov    rdi,rbx
 14165e9:	e8 a2 78 3d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14165ee:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
 14165f2:	e9 af fe ff ff       	jmp    14164a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25ba2a>
 14165f7:	e8 b4 94 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 14165fc:	48 8d 05 d0 4f f7 fe 	lea    rax,[rip+0xfffffffffef74fd0]        # 38b5d3 <_ZTSSt12bad_any_cast@@Base-0x4bf5>
 1416603:	6a 0a                	push   0xa
 1416605:	5a                   	pop    rdx
 1416606:	c3                   	ret
 1416607:	cc                   	int3
 1416608:	48 8d 05 c1 96 45 00 	lea    rax,[rip+0x4596c1]        # 186fcd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c3b8>
 141660f:	48 89 07             	mov    QWORD PTR [rdi],rax
 1416612:	48 83 c7 18          	add    rdi,0x18
 1416616:	e9 0d 38 66 ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
 141661b:	cc                   	int3
 141661c:	53                   	push   rbx
 141661d:	48 89 fb             	mov    rbx,rdi
 1416620:	e8 e3 ff ff ff       	call   1416608 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bb8c>
 1416625:	48 89 df             	mov    rdi,rbx
 1416628:	5b                   	pop    rbx
 1416629:	e9 f2 78 3d 00       	jmp    17edf20 <_ZdlPv@plt>
 141662e:	55                   	push   rbp
--
 141663f:	49 89 f6             	mov    r14,rsi
 1416642:	49 89 ff             	mov    r15,rdi
 1416645:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 141664c:	00 00 
 141664e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 1416653:	8b 47 08             	mov    eax,DWORD PTR [rdi+0x8]
 1416656:	83 f8 01             	cmp    eax,0x1
 1416659:	7f 0b                	jg     1416666 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bbea>
 141665b:	41 83 7f 0c 1d       	cmp    DWORD PTR [r15+0xc],0x1d
 1416660:	0f 8f a9 01 00 00    	jg     141680f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bd93>
 1416666:	83 f8 02             	cmp    eax,0x2
 1416669:	7c 10                	jl     141667b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bbff>
 141666b:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
 141666f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1416672:	4c 89 f6             	mov    rsi,r14
 1416675:	48 89 da             	mov    rdx,rbx
 1416678:	ff 50 28             	call   QWORD PTR [rax+0x28]
 141667b:	48 85 db             	test   rbx,rbx
 141667e:	0f 84 8b 01 00 00    	je     141680f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bd93>
 1416684:	49 8d 47 48          	lea    rax,[r15+0x48]
 1416688:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 141668d:	31 ed                	xor    ebp,ebp
 141668f:	41 89 ed             	mov    r13d,ebp
 1416692:	41 83 e5 01          	and    r13d,0x1
 1416696:	44 89 e8             	mov    eax,r13d
 1416699:	41 8b 4c 87 28       	mov    ecx,DWORD PTR [r15+rax*4+0x28]
 141669e:	ff c1                	inc    ecx
 14166a0:	41 89 4c 87 28       	mov    DWORD PTR [r15+rax*4+0x28],ecx
 14166a5:	41 3b 4f 08          	cmp    ecx,DWORD PTR [r15+0x8]
 14166a9:	7d 0c                	jge    14166b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bc3b>
 14166ab:	f3 43 0f 10 44 af 20 	movss  xmm0,DWORD PTR [r15+r13*4+0x20]
 14166b2:	e9 46 01 00 00       	jmp    14167fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bd81>
 14166b7:	43 83 64 af 28 00    	and    DWORD PTR [r15+r13*4+0x28],0x0
 14166bd:	41 80 7f 14 00       	cmp    BYTE PTR [r15+0x14],0x0
 14166c2:	0f 84 83 00 00 00    	je     141674b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bccf>
 14166c8:	41 8a 4f 0c          	mov    cl,BYTE PTR [r15+0xc]
 14166cc:	6a ff                	push   0xffffffffffffffff
 14166ce:	58                   	pop    rax
 14166cf:	d3 e0                	shl    eax,cl
 14166d1:	f7 d0                	not    eax
 14166d3:	f3 0f 2a c0          	cvtsi2ss xmm0,eax
 14166d7:	f3 0f 10 0d 29 81 f7 	movss  xmm1,DWORD PTR [rip+0xfffffffffef78129]        # 38e808 <_ZTSSt12bad_any_cast@@Base-0x19c0>
 14166de:	fe 
 14166df:	f3 0f 5e c8          	divss  xmm1,xmm0
 14166e3:	f3 0f 12 c1          	movsldup xmm0,xmm1
 14166e7:	0f 59 05 22 66 f7 fe 	mulps  xmm0,XMMWORD PTR [rip+0xfffffffffef76622]        # 38cd10 <_ZTSSt12bad_any_cast@@Base-0x34b8>
 14166ee:	0f 13 44 24 18       	movlps QWORD PTR [rsp+0x18],xmm0
 14166f3:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 14166f8:	4d 89 f4             	mov    r12,r14
 14166fb:	49 89 de             	mov    r14,rbx
 14166fe:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
 1416703:	48 89 de             	mov    rsi,rbx
 1416706:	e8 03 03 00 00       	call   1416a0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bf92>
 141670b:	f3 0f 11 44 24 0c    	movss  DWORD PTR [rsp+0xc],xmm0
 1416711:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 1416716:	48 89 de             	mov    rsi,rbx
 1416719:	4c 89 f3             	mov    rbx,r14
 141671c:	4d 89 e6             	mov    r14,r12
 141671f:	e8 ea 02 00 00       	call   1416a0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bf92>
 1416724:	f3 0f 58 44 24 0c    	addss  xmm0,DWORD PTR [rsp+0xc]
 141672a:	f3 41 0f 58 04 ac    	addss  xmm0,DWORD PTR [r12+rbp*4]
 1416730:	f3 0f 10 0d 24 80 f7 	movss  xmm1,DWORD PTR [rip+0xfffffffffef78024]        # 38e75c <_ZTSSt12bad_any_cast@@Base-0x1a6c>
 1416737:	fe 
 1416738:	0f 2e c8             	ucomiss xmm1,xmm0
 141673b:	77 1c                	ja     1416759 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bcdd>
 141673d:	f3 0f 10 0d 43 7f f7 	movss  xmm1,DWORD PTR [rip+0xfffffffffef77f43]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
 1416744:	fe 
 1416745:	f3 0f 5d c8          	minss  xmm1,xmm0
 1416749:	eb 06                	jmp    1416751 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bcd5>
 141674b:	f3 41 0f 10 0c ae    	movss  xmm1,DWORD PTR [r14+rbp*4]
 1416751:	0f 57 c0             	xorps  xmm0,xmm0
 1416754:	0f 2e c1             	ucomiss xmm0,xmm1
 1416757:	76 53                	jbe    14167ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bd30>
 1416759:	f3 0f 5a c1          	cvtss2sd xmm0,xmm1
 141675d:	f2 0f 59 05 53 88 f7 	mulsd  xmm0,QWORD PTR [rip+0xfffffffffef78853]        # 38efb8 <_ZTSSt12bad_any_cast@@Base-0x1210>
 1416764:	fe 
 1416765:	66 0f 28 c8          	movapd xmm1,xmm0
 1416769:	66 0f 54 0d af 77 f7 	andpd  xmm1,XMMWORD PTR [rip+0xfffffffffef777af]        # 38df20 <_ZTSSt12bad_any_cast@@Base-0x22a8>
 1416770:	fe 
--
 1416849:	49 89 fe             	mov    r14,rdi
 141684c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1416853:	00 00 
 1416855:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
 141685c:	00 
 141685d:	44 8b 67 40          	mov    r12d,DWORD PTR [rdi+0x40]
 1416861:	41 39 f4             	cmp    r12d,esi
 1416864:	44 0f 4d e6          	cmovge r12d,esi
 1416868:	85 f6                	test   esi,esi
 141686a:	6a 01                	push   0x1
 141686c:	41 5d                	pop    r13
 141686e:	45 0f 4e e5          	cmovle r12d,r13d
 1416872:	48 83 7f 18 00       	cmp    QWORD PTR [rdi+0x18],0x0
 1416877:	74 0a                	je     1416883 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25be07>
 1416879:	45 3b 66 08          	cmp    r12d,DWORD PTR [r14+0x8]
 141687d:	0f 84 af 00 00 00    	je     1416932 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25beb6>
 1416883:	41 8b 76 38          	mov    esi,DWORD PTR [r14+0x38]
 1416887:	f3 0f 2a c6          	cvtsi2ss xmm0,esi
 141688b:	f3 41 0f 2a cc       	cvtsi2ss xmm1,r12d
 1416890:	f3 0f 5e c1          	divss  xmm0,xmm1
 1416894:	f3 0f 59 05 58 7f f7 	mulss  xmm0,DWORD PTR [rip+0xfffffffffef77f58]        # 38e7f4 <_ZTSSt12bad_any_cast@@Base-0x19d4>
 141689b:	fe 
 141689c:	f3 48 0f 2c d0       	cvttss2si rdx,xmm0
 14168a1:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 14168a6:	f2 0f 10 05 a2 86 f7 	movsd  xmm0,QWORD PTR [rip+0xfffffffffef786a2]        # 38ef50 <_ZTSSt12bad_any_cast@@Base-0x1278>
 14168ad:	fe 
 14168ae:	4c 89 ff             	mov    rdi,r15
 14168b1:	e8 11 58 01 00       	call   142c0c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27164b>
 14168b6:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
 14168ba:	41 0f 10 4f 10       	movups xmm1,XMMWORD PTR [r15+0x10]
 14168bf:	41 0f 10 57 20       	movups xmm2,XMMWORD PTR [r15+0x20]
 14168c4:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
 14168c9:	0f 29 56 20          	movaps XMMWORD PTR [rsi+0x20],xmm2
 14168cd:	0f 29 4e 10          	movaps XMMWORD PTR [rsi+0x10],xmm1
 14168d1:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
 14168d4:	0f 29 46 30          	movaps XMMWORD PTR [rsi+0x30],xmm0
 14168d8:	0f 29 4e 40          	movaps XMMWORD PTR [rsi+0x40],xmm1
 14168dc:	0f 29 56 50          	movaps XMMWORD PTR [rsi+0x50],xmm2
 14168e0:	0f 29 46 60          	movaps XMMWORD PTR [rsi+0x60],xmm0
 14168e4:	0f 29 4e 70          	movaps XMMWORD PTR [rsi+0x70],xmm1
 14168e8:	0f 29 96 80 00 00 00 	movaps XMMWORD PTR [rsi+0x80],xmm2
 14168ef:	0f 29 96 b0 00 00 00 	movaps XMMWORD PTR [rsi+0xb0],xmm2
 14168f6:	0f 29 8e a0 00 00 00 	movaps XMMWORD PTR [rsi+0xa0],xmm1
 14168fd:	0f 29 86 90 00 00 00 	movaps XMMWORD PTR [rsi+0x90],xmm0
 1416904:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 1416909:	6a 04                	push   0x4
 141690b:	5a                   	pop    rdx
 141690c:	e8 95 14 7b ff       	call   bc7da6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x114d46>
 1416911:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
 1416915:	48 85 ff             	test   rdi,rdi
 1416918:	74 6f                	je     1416989 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bf0d>
 141691a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 141691d:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 1416922:	6a 01                	push   0x1
 1416924:	5a                   	pop    rdx
 1416925:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1416928:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 141692d:	e8 f6 4d 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1416932:	83 fd 1e             	cmp    ebp,0x1e
 1416935:	6a 1e                	push   0x1e
 1416937:	59                   	pop    rcx
 1416938:	0f 42 cd             	cmovb  ecx,ebp
 141693b:	85 ed                	test   ebp,ebp
 141693d:	41 0f 4e cd          	cmovle ecx,r13d
 1416941:	45 89 66 08          	mov    DWORD PTR [r14+0x8],r12d
 1416945:	41 89 4e 0c          	mov    DWORD PTR [r14+0xc],ecx
 1416949:	f6 d9                	neg    cl
 141694b:	6a ff                	push   0xffffffffffffffff
 141694d:	58                   	pop    rax
 141694e:	d3 e0                	shl    eax,cl
 1416950:	41 89 46 10          	mov    DWORD PTR [r14+0x10],eax
 1416954:	41 88 5e 14          	mov    BYTE PTR [r14+0x14],bl
 1416958:	45 89 66 28          	mov    DWORD PTR [r14+0x28],r12d
 141695c:	45 89 66 2c          	mov    DWORD PTR [r14+0x2c],r12d
 1416960:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1416967:	00 00 
 1416969:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
 1416970:	00 
 1416971:	0f 85 91 00 00 00    	jne    1416a08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bf8c>
 1416977:	48 81 c4 18 01 00 00 	add    rsp,0x118
--
 1416981:	41 5d                	pop    r13
 1416983:	41 5e                	pop    r14
 1416985:	41 5f                	pop    r15
 1416987:	5d                   	pop    rbp
 1416988:	c3                   	ret
 1416989:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 141698d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1416990:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 1416995:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
 141699a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 141699d:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
 14169a2:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
 14169a8:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
 14169ac:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 14169b0:	48 85 ff             	test   rdi,rdi
 14169b3:	0f 84 6f ff ff ff    	je     1416928 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25beac>
 14169b9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14169bc:	ff 50 08             	call   QWORD PTR [rax+0x8]
 14169bf:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 14169c4:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
 14169ca:	48 85 ff             	test   rdi,rdi
 14169cd:	0f 84 55 ff ff ff    	je     1416928 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25beac>
 14169d3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14169d6:	ff 50 08             	call   QWORD PTR [rax+0x8]
 14169d9:	e9 4a ff ff ff       	jmp    1416928 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25beac>
 14169de:	eb 00                	jmp    14169e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bf64>
 14169e0:	48 89 c3             	mov    rbx,rax
 14169e3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 14169e8:	e8 3b 4d 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 14169ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14169f4:	00 00 
 14169f6:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
 14169fd:	00 
 14169fe:	75 08                	jne    1416a08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25bf8c>
 1416a00:	48 89 df             	mov    rdi,rbx
 1416a03:	e8 c8 92 65 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1416a08:	e8 a3 90 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 1416a0d:	cc                   	int3
--
 1416a72:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 1416a77:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 1416a7b:	48 85 c0             	test   rax,rax
 1416a7e:	74 22                	je     1416aa2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c026>
 1416a80:	48 89 fb             	mov    rbx,rdi
 1416a83:	49 89 f6             	mov    r14,rsi
 1416a86:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 1416a8a:	6a 01                	push   0x1
 1416a8c:	5f                   	pop    rdi
 1416a8d:	48 89 de             	mov    rsi,rbx
 1416a90:	4c 89 f2             	mov    rdx,r14
 1416a93:	ff d0                	call   rax
 1416a95:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 1416a99:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 1416a9d:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 1416aa2:	48 83 c4 08          	add    rsp,0x8
 1416aa6:	5b                   	pop    rbx
 1416aa7:	41 5e                	pop    r14
 1416aa9:	c3                   	ret
 1416aaa:	48 89 c7             	mov    rdi,rax
 1416aad:	e8 f3 2f 66 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1416ab2:	55                   	push   rbp
 1416ab3:	41 57                	push   r15
 1416ab5:	41 56                	push   r14
 1416ab7:	41 55                	push   r13
 1416ab9:	41 54                	push   r12
 1416abb:	53                   	push   rbx
 1416abc:	50                   	push   rax
 1416abd:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
 1416ac1:	49 89 d6             	mov    r14,rdx
 1416ac4:	49 89 f7             	mov    r15,rsi
 1416ac7:	49 89 fc             	mov    r12,rdi
 1416aca:	f2 0f 10 57 14       	movsd  xmm2,QWORD PTR [rdi+0x14]
 1416acf:	0f c2 d0 00          	cmpeqps xmm2,xmm0
 1416ad3:	0f 14 d2             	unpcklps xmm2,xmm2
 1416ad6:	66 0f 50 c2          	movmskpd eax,xmm2
 1416ada:	83 f8 03             	cmp    eax,0x3
 1416add:	75 16                	jne    1416af5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c079>
--
 1416dae:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
 1416db1:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
 1416db5:	49 01 dd             	add    r13,rbx
 1416db8:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
 1416dbf:	00 
 1416dc0:	4c 89 29             	mov    QWORD PTR [rcx],r13
 1416dc3:	4c 89 ff             	mov    rdi,r15
 1416dc6:	4c 89 f6             	mov    rsi,r14
 1416dc9:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
 1416dcd:	4c 89 e2             	mov    rdx,r12
 1416dd0:	e8 41 9b ff ff       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
 1416dd5:	84 c0                	test   al,al
 1416dd7:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
 1416ddc:	74 16                	je     1416df4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c378>
 1416dde:	4c 8b ac 24 80 00 00 	mov    r13,QWORD PTR [rsp+0x80]
 1416de5:	00 
 1416de6:	48 8b 9c 24 88 00 00 	mov    rbx,QWORD PTR [rsp+0x88]
 1416ded:	00 
 1416dee:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
 1416df2:	eb 3f                	jmp    1416e33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c3b7>
 1416df4:	48 89 d9             	mov    rcx,rbx
 1416df7:	4c 8b ac 24 80 00 00 	mov    r13,QWORD PTR [rsp+0x80]
 1416dfe:	00 
 1416dff:	48 8b 9c 24 88 00 00 	mov    rbx,QWORD PTR [rsp+0x88]
 1416e06:	00 
 1416e07:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
 1416e0b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 1416e0f:	48 01 c8             	add    rax,rcx
 1416e12:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
 1416e19:	00 
 1416e1a:	48 89 01             	mov    QWORD PTR [rcx],rax
 1416e1d:	4c 89 ef             	mov    rdi,r13
 1416e20:	48 89 de             	mov    rsi,rbx
 1416e23:	4c 89 e2             	mov    rdx,r12
 1416e26:	e8 eb 9a ff ff       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
 1416e2b:	84 c0                	test   al,al
 1416e2d:	0f 84 94 01 00 00    	je     1416fc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c54b>
--
 1416e70:	e8 46 9a ff ff       	call   14108bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e3f>
 1416e75:	49 89 c5             	mov    r13,rax
 1416e78:	48 89 d3             	mov    rbx,rdx
 1416e7b:	48 85 d2             	test   rdx,rdx
 1416e7e:	0f 84 38 01 00 00    	je     1416fbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c540>
 1416e84:	4c 89 ff             	mov    rdi,r15
 1416e87:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
 1416e8c:	4c 89 f6             	mov    rsi,r14
 1416e8f:	4c 89 e2             	mov    rdx,r12
 1416e92:	e8 30 98 ff ff       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 1416e97:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 1416e9c:	4d 8b 37             	mov    r14,QWORD PTR [r15]
 1416e9f:	f3 41 0f 10 47 18    	movss  xmm0,DWORD PTR [r15+0x18]
 1416ea5:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
 1416ea9:	4c 89 ef             	mov    rdi,r13
 1416eac:	48 89 de             	mov    rsi,rbx
 1416eaf:	4c 89 e2             	mov    rdx,r12
 1416eb2:	e8 10 98 ff ff       	call   14106c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c4b>
 1416eb7:	41 80 7f 10 00       	cmp    BYTE PTR [r15+0x10],0x0
 1416ebc:	48 b8 ff ff ff ff ff 	movabs rax,0x7fffffffffffffff
 1416ec3:	ff ff 7f 
 1416ec6:	74 07                	je     1416ecf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c453>
 1416ec8:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 1416ecc:	4c 29 e0             	sub    rax,r12
 1416ecf:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
 1416ed3:	f3 41 0f 10 65 18    	movss  xmm4,DWORD PTR [r13+0x18]
 1416ed9:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
 1416ee0:	00 
 1416ee1:	41 80 7d 10 00       	cmp    BYTE PTR [r13+0x10],0x0
 1416ee6:	48 b8 ff ff ff ff ff 	movabs rax,0x7fffffffffffffff
 1416eed:	ff ff 7f 
 1416ef0:	74 07                	je     1416ef9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c47d>
 1416ef2:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 1416ef6:	4c 29 e0             	sub    rax,r12
 1416ef9:	4c 89 e2             	mov    rdx,r12
 1416efc:	48 29 ca             	sub    rdx,rcx
 1416eff:	0f 28 54 24 20       	movaps xmm2,XMMWORD PTR [rsp+0x20]
 1416f04:	7c 0d                	jl     1416f13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c497>
 1416f06:	f3 48 0f 2a ca       	cvtsi2ss xmm1,rdx
 1416f0b:	f3 0f 59 c8          	mulss  xmm1,xmm0
 1416f0f:	f3 0f 58 e1          	addss  xmm4,xmm1
 1416f13:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
 1416f18:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
 1416f1d:	4c 89 e1             	mov    rcx,r12
 1416f20:	4c 29 f1             	sub    rcx,r14
 1416f23:	7c 18                	jl     1416f3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c4c1>
 1416f25:	f3 48 0f 2a c9       	cvtsi2ss xmm1,rcx
 1416f2a:	f3 0f 59 ca          	mulss  xmm1,xmm2
 1416f2e:	0f 28 1c 24          	movaps xmm3,XMMWORD PTR [rsp]
 1416f32:	f3 0f 58 d9          	addss  xmm3,xmm1
 1416f36:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
 1416f3b:	eb 09                	jmp    1416f46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c4ca>
 1416f3d:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
 1416f42:	0f 28 1c 24          	movaps xmm3,XMMWORD PTR [rsp]
 1416f46:	66 0f 3a 21 dc 10    	insertps xmm3,xmm4,0x10
 1416f4c:	0f 29 1c 24          	movaps XMMWORD PTR [rsp],xmm3
 1416f50:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
 1416f57:	00 
 1416f58:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 1416f5f:	00 
 1416f60:	6a 02                	push   0x2
 1416f62:	5e                   	pop    rsi
 1416f63:	e8 22 99 ff ff       	call   141088a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e0e>
 1416f68:	49 89 de             	mov    r14,rbx
 1416f6b:	49 29 ee             	sub    r14,rbp
 1416f6e:	49 39 c6             	cmp    r14,rax
 1416f71:	4c 0f 4d f0          	cmovge r14,rax
 1416f75:	4b 8d 14 36          	lea    rdx,[r14+r14*1]
 1416f79:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 1416f7e:	48 8d 34 e8          	lea    rsi,[rax+rbp*8]
 1416f82:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 1416f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1416f8a:	0f 28 4c 24 20       	movaps xmm1,XMMWORD PTR [rsp+0x20]
 1416f8f:	66 0f 3a 21 4c 24 50 	insertps xmm1,DWORD PTR [rsp+0x50],0x10
 1416f96:	10 
 1416f97:	48 8d 4c 24 6f       	lea    rcx,[rsp+0x6f]
 1416f9c:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
--
 1416fa6:	4d 01 f4             	add    r12,r14
 1416fa9:	48 39 dd             	cmp    rbp,rbx
 1416fac:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
 1416fb1:	48 8b 5c 24 48       	mov    rbx,QWORD PTR [rsp+0x48]
 1416fb6:	0f 8c 8e fe ff ff    	jl     1416e4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c3ce>
 1416fbc:	8a 44 24 6f          	mov    al,BYTE PTR [rsp+0x6f]

## Exact runtime capability-byte offsets 0x1a2/0x1a5/0x1a7/0x1b8 in ad-object family
 140fcca:	48 8b b4 24 b0 01 00 	mov    rsi,QWORD PTR [rsp+0x1b0]
 140fcd1:	00 
 140fcd2:	48 8d 8c 24 d0 01 00 	lea    rcx,[rsp+0x1d0]
 140fcd9:	00 
 140fcda:	48 89 19             	mov    QWORD PTR [rcx],rbx
 140fcdd:	48 8d 94 24 48 01 00 	lea    rdx,[rsp+0x148]
 140fce4:	00 
 140fce5:	e8 2c 0c 00 00       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
 140fcea:	84 c0                	test   al,al
 140fcec:	75 30                	jne    140fd1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552a2>
 140fcee:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
 140fcf5:	00 
 140fcf6:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
 140fcfd:	00 
 140fcfe:	48 8d 8c 24 c8 01 00 	lea    rcx,[rsp+0x1c8]
 140fd05:	00 
 140fd06:	48 89 19             	mov    QWORD PTR [rcx],rbx
 140fd09:	48 8d 94 24 48 01 00 	lea    rdx,[rsp+0x148]
 140fd10:	00 
 140fd11:	e8 00 0c 00 00       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
 140fd16:	84 c0                	test   al,al
 140fd18:	0f 84 8b 08 00 00    	je     14105a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255b2d>
 140fd1e:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
 140fd25:	00 
 140fd26:	48 8b 94 24 60 01 00 	mov    rdx,QWORD PTR [rsp+0x160]
 140fd2d:	00 
 140fd2e:	48 8b b4 24 68 01 00 	mov    rsi,QWORD PTR [rsp+0x168]
 140fd35:	00 
 140fd36:	48 8b 84 24 70 01 00 	mov    rax,QWORD PTR [rsp+0x170]
--
 140fd83:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
 140fd8a:	00 
 140fd8b:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
 140fd92:	00 
 140fd93:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 140fd9a:	00 
 140fd9b:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
 140fda2:	00 
 140fda3:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 140fdaa:	00 
 140fdab:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
 140fdb2:	00 
 140fdb3:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
 140fdba:	00 
 140fdbb:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]
 140fdc2:	00 
 140fdc3:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 140fdca:	00 
 140fdcb:	48 83 7c 24 48 02    	cmp    QWORD PTR [rsp+0x48],0x2
 140fdd1:	0f 8c dd 06 00 00    	jl     14104b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255a38>
 140fdd7:	31 ed                	xor    ebp,ebp
 140fdd9:	4c 89 eb             	mov    rbx,r13
 140fddc:	4d 89 f5             	mov    r13,r14
 140fddf:	49 89 f6             	mov    r14,rsi
 140fde2:	48 89 d6             	mov    rsi,rdx
 140fde5:	4c 89 fa             	mov    rdx,r15
 140fde8:	e8 ce 0a 00 00       	call   14108bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e3f>
 140fded:	48 89 c7             	mov    rdi,rax
 140fdf0:	48 85 d2             	test   rdx,rdx
--
 14105f9:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
 1410600:	00 
 1410601:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
 1410608:	00 
 1410609:	48 8b bc 24 a8 01 00 	mov    rdi,QWORD PTR [rsp+0x1a8]
 1410610:	00 
 1410611:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
 1410618:	00 
 1410619:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 1410620:	00 
 1410621:	4c 8b 8c 24 b8 01 00 	mov    r9,QWORD PTR [rsp+0x1b8]
 1410628:	00 
 1410629:	4c 8b bc 24 c0 01 00 	mov    r15,QWORD PTR [rsp+0x1c0]
 1410630:	00 
 1410631:	44 8b 44 24 60       	mov    r8d,DWORD PTR [rsp+0x60]
 1410636:	e9 a9 fe ff ff       	jmp    14104e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255a68>
 141063b:	e8 70 f4 3d 00       	call   17efab0 <__stack_chk_fail@plt>
 1410640:	53                   	push   rbx
 1410641:	48 89 fb             	mov    rbx,rdi
 1410644:	48 8b bf 50 03 00 00 	mov    rdi,QWORD PTR [rdi+0x350]
 141064b:	48 85 ff             	test   rdi,rdi
 141064e:	74 65                	je     14106b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c39>
 1410650:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1410653:	ff 50 20             	call   QWORD PTR [rax+0x20]
 1410656:	48 89 c1             	mov    rcx,rax
 1410659:	89 d6                	mov    esi,edx
 141065b:	84 d2                	test   dl,dl
 141065d:	74 4f                	je     14106ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255c32>
 141065f:	48 85 c9             	test   rcx,rcx
--
 1411cd3:	48 89 54 24 58       	mov    QWORD PTR [rsp+0x58],rdx
 1411cd8:	4d 8b b5 c0 00 00 00 	mov    r14,QWORD PTR [r13+0xc0]
 1411cdf:	49 29 d6             	sub    r14,rdx
 1411ce2:	49 c1 fe 02          	sar    r14,0x2
 1411ce6:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
 1411ced:	00 
 1411cee:	4c 89 a4 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r12
 1411cf5:	00 
 1411cf6:	48 89 8c 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rcx
 1411cfd:	00 
 1411cfe:	48 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbp
 1411d05:	00 
 1411d06:	48 89 94 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rdx
 1411d0d:	00 
 1411d0e:	4c 89 b4 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],r14
 1411d15:	00 
 1411d16:	49 8d 7d 60          	lea    rdi,[r13+0x60]
 1411d1a:	0f 10 84 24 a0 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1a0]
 1411d21:	00 
 1411d22:	0f 10 8c 24 b0 01 00 	movups xmm1,XMMWORD PTR [rsp+0x1b0]
 1411d29:	00 
 1411d2a:	0f 10 94 24 c0 01 00 	movups xmm2,XMMWORD PTR [rsp+0x1c0]
 1411d31:	00 
 1411d32:	0f 11 54 24 20       	movups XMMWORD PTR [rsp+0x20],xmm2
 1411d37:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
 1411d3c:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 1411d40:	48 8b b4 24 f0 00 00 	mov    rsi,QWORD PTR [rsp+0xf0]
 1411d47:	00 
 1411d48:	4c 89 fa             	mov    rdx,r15
--
 1411d5e:	48 29 d1             	sub    rcx,rdx
 1411d61:	48 c1 f9 02          	sar    rcx,0x2
 1411d65:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 1411d6a:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
 1411d71:	00 
 1411d72:	4c 89 a4 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r12
 1411d79:	00 
 1411d7a:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 1411d7f:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
 1411d86:	00 
 1411d87:	48 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbp
 1411d8e:	00 
 1411d8f:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 1411d94:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
 1411d9b:	00 
 1411d9c:	4c 89 b4 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],r14
 1411da3:	00 
 1411da4:	41 0f b6 75 58       	movzx  esi,BYTE PTR [r13+0x58]
 1411da9:	0f 10 84 24 a0 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1a0]
 1411db0:	00 
 1411db1:	0f 10 8c 24 b0 01 00 	movups xmm1,XMMWORD PTR [rsp+0x1b0]
 1411db8:	00 
 1411db9:	0f 10 94 24 c0 01 00 	movups xmm2,XMMWORD PTR [rsp+0x1c0]
 1411dc0:	00 
 1411dc1:	0f 11 54 24 20       	movups XMMWORD PTR [rsp+0x20],xmm2
 1411dc6:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
 1411dcb:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 1411dcf:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
 1411dd4:	e8 05 0d 00 00       	call   1412ade <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258062>
--
 1413734:	74 07                	je     141373d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258cc1>
 1413736:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
 141373a:	48 29 d8             	sub    rax,rbx
 141373d:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
 1413744:	00 
 1413745:	80 7e 10 00          	cmp    BYTE PTR [rsi+0x10],0x0
 1413749:	48 89 f8             	mov    rax,rdi
 141374c:	74 07                	je     1413755 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258cd9>
 141374e:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
 1413752:	48 29 d8             	sub    rax,rbx
 1413755:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
 141375c:	00 
 141375d:	80 79 10 00          	cmp    BYTE PTR [rcx+0x10],0x0
 1413761:	48 89 f8             	mov    rax,rdi
 1413764:	74 07                	je     141376d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258cf1>
 1413766:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
 141376a:	48 29 d8             	sub    rax,rbx
 141376d:	48 89 d9             	mov    rcx,rbx
 1413770:	48 2b 8c 24 c8 00 00 	sub    rcx,QWORD PTR [rsp+0xc8]
 1413777:	00 
 1413778:	7c 1e                	jl     1413798 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258d1c>
 141377a:	f3 48 0f 2a c1       	cvtsi2ss xmm0,rcx
 141377f:	f3 0f 59 84 24 90 00 	mulss  xmm0,DWORD PTR [rsp+0x90]
 1413786:	00 00 
 1413788:	f3 0f 10 5c 24 5c    	movss  xmm3,DWORD PTR [rsp+0x5c]
 141378e:	f3 0f 58 d8          	addss  xmm3,xmm0
 1413792:	f3 0f 11 5c 24 5c    	movss  DWORD PTR [rsp+0x5c],xmm3
 1413798:	48 89 d9             	mov    rcx,rbx
 141379b:	48 2b 8c 24 d0 00 00 	sub    rcx,QWORD PTR [rsp+0xd0]
--
 141a618:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
 141a61c:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
 141a620:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
 141a625:	c3                   	ret
 141a626:	55                   	push   rbp
 141a627:	53                   	push   rbx
 141a628:	50                   	push   rax
 141a629:	48 89 fb             	mov    rbx,rdi
 141a62c:	48 8b 87 c8 02 00 00 	mov    rax,QWORD PTR [rdi+0x2c8]
 141a633:	c6 40 18 01          	mov    BYTE PTR [rax+0x18],0x1
 141a637:	8a 87 b8 01 00 00    	mov    al,BYTE PTR [rdi+0x1b8]
 141a63d:	48 8d 35 38 79 03 ff 	lea    rsi,[rip+0xffffffffff037938]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 141a644:	a8 01                	test   al,0x1
 141a646:	75 1b                	jne    141a663 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25fbe7>
 141a648:	48 8d 0d c6 01 f3 fe 	lea    rcx,[rip+0xfffffffffef301c6]        # 34a815 <_ZTSSt12bad_any_cast@@Base-0x459b3>
 141a64f:	6a 04                	push   0x4
 141a651:	5f                   	pop    rdi
 141a652:	ba b2 02 00 00       	mov    edx,0x2b2
 141a657:	49 89 d8             	mov    r8,rbx
 141a65a:	31 c0                	xor    eax,eax
 141a65c:	e8 71 c2 3b 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
 141a661:	eb 23                	jmp    141a686 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25fc0a>
 141a663:	48 8d 0d 1f f0 f1 fe 	lea    rcx,[rip+0xfffffffffef1f01f]        # 339689 <_ZTSSt12bad_any_cast@@Base-0x56b3f>
 141a66a:	6a 04                	push   0x4
 141a66c:	5f                   	pop    rdi
 141a66d:	ba af 02 00 00       	mov    edx,0x2af
 141a672:	49 89 d8             	mov    r8,rbx
 141a675:	31 c0                	xor    eax,eax
 141a677:	e8 56 c2 3b 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
--
 141b290:	49 03 45 00          	add    rax,QWORD PTR [r13+0x0]
 141b294:	4c 89 38             	mov    QWORD PTR [rax],r15
 141b297:	49 ff 84 24 00 02 00 	inc    QWORD PTR [r12+0x200]
 141b29e:	00 
 141b29f:	48 83 a4 24 50 04 00 	and    QWORD PTR [rsp+0x450],0x0
 141b2a6:	00 00 
 141b2a8:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
 141b2af:	00 
 141b2b0:	e8 19 5e 83 ff       	call   c510ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e06e>
 141b2b5:	31 c0                	xor    eax,eax
 141b2b7:	41 86 84 24 b8 01 00 	xchg   BYTE PTR [r12+0x1b8],al
 141b2be:	00 
 141b2bf:	48 89 df             	mov    rdi,rbx
 141b2c2:	e8 bf 31 68 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 141b2c7:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 141b2cc:	e8 f9 ef 65 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 141b2d1:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 141b2d8:	00 
 141b2d9:	e8 0c 76 00 00       	call   14228ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x267e6e>
 141b2de:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 141b2e5:	00 00 
 141b2e7:	48 3b 84 24 90 09 00 	cmp    rax,QWORD PTR [rsp+0x990]
 141b2ee:	00 
 141b2ef:	0f 85 41 02 00 00    	jne    141b536 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260aba>
 141b2f5:	48 81 c4 98 09 00 00 	add    rsp,0x998
 141b2fc:	5b                   	pop    rbx
 141b2fd:	41 5c                	pop    r12
 141b2ff:	41 5d                	pop    r13
 141b301:	41 5e                	pop    r14
--
 141b5fd:	4c 89 ea             	mov    rdx,r13
 141b600:	31 c9                	xor    ecx,ecx
 141b602:	45 31 c0             	xor    r8d,r8d
 141b605:	e8 c2 61 3a 00       	call   17c17cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175938>
 141b60a:	4c 89 ef             	mov    rdi,r13
 141b60d:	e8 8c bc 68 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 141b612:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 141b616:	8a 80 e1 03 00 00    	mov    al,BYTE PTR [rax+0x3e1]
 141b61c:	a8 01                	test   al,0x1
 141b61e:	75 07                	jne    141b627 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260bab>
 141b620:	40 86 ab b8 01 00 00 	xchg   BYTE PTR [rbx+0x1b8],bpl
 141b627:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
 141b62b:	49 8b 8c 24 c8 04 00 	mov    rcx,QWORD PTR [r12+0x4c8]
 141b632:	00 
 141b633:	48 83 39 00          	cmp    QWORD PTR [rcx],0x0
 141b637:	0f 84 4e 01 00 00    	je     141b78b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260d0f>
 141b63d:	4c 8b ab 40 02 00 00 	mov    r13,QWORD PTR [rbx+0x240]
 141b644:	48 8b 83 48 02 00 00 	mov    rax,QWORD PTR [rbx+0x248]
 141b64b:	49 39 c5             	cmp    r13,rax
 141b64e:	73 23                	jae    141b673 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260bf7>
 141b650:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
 141b654:	49 8b 84 24 d0 04 00 	mov    rax,QWORD PTR [r12+0x4d0]
 141b65b:	00 
 141b65c:	49 89 45 08          	mov    QWORD PTR [r13+0x8],rax
 141b660:	48 85 c0             	test   rax,rax
 141b663:	74 05                	je     141b66a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260bee>
 141b665:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 141b66a:	49 83 c5 10          	add    r13,0x10
 141b66e:	e9 11 01 00 00       	jmp    141b784 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260d08>
--
 141d8f3:	4c 89 fe             	mov    rsi,r15
 141d8f6:	e8 87 38 00 00       	call   1421182 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x266706>
 141d8fb:	80 bc 24 d8 00 00 00 	cmp    BYTE PTR [rsp+0xd8],0x0
 141d902:	00 
 141d903:	74 08                	je     141d90d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262e91>
 141d905:	4c 89 f7             	mov    rdi,r14
 141d908:	e8 eb 01 ff ff       	call   140daf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25307c>
 141d90d:	4c 8b 7d 40          	mov    r15,QWORD PTR [rbp+0x40]
 141d911:	4d 85 ff             	test   r15,r15
 141d914:	0f 84 19 02 00 00    	je     141db33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2630b7>
 141d91a:	49 8d 95 b8 01 00 00 	lea    rdx,[r13+0x1b8]
 141d921:	4d 8d 67 08          	lea    r12,[r15+0x8]
 141d925:	c6 44 24 67 00       	mov    BYTE PTR [rsp+0x67],0x0
 141d92a:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
 141d92f:	48 8d 44 24 67       	lea    rax,[rsp+0x67]
 141d934:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 141d939:	48 8d 44 24 68       	lea    rax,[rsp+0x68]
 141d93e:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 141d943:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 141d948:	4c 89 e6             	mov    rsi,r12
 141d94b:	e8 ea 39 00 00       	call   142133a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2668be>
 141d950:	49 8d 95 e0 01 00 00 	lea    rdx,[r13+0x1e0]
 141d957:	49 8d b7 80 00 00 00 	lea    rsi,[r15+0x80]
 141d95e:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 141d963:	e8 d2 39 00 00       	call   142133a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2668be>
 141d968:	4d 8d b7 f8 00 00 00 	lea    r14,[r15+0xf8]
 141d96f:	49 8d 97 a0 01 00 00 	lea    rdx,[r15+0x1a0]
 141d976:	41 80 bd 28 02 00 00 	cmp    BYTE PTR [r13+0x228],0x0
 141d97d:	00 
--
 14221a6:	48 8b 86 a8 01 00 00 	mov    rax,QWORD PTR [rsi+0x1a8]
 14221ad:	48 89 87 a8 01 00 00 	mov    QWORD PTR [rdi+0x1a8],rax
 14221b4:	48 83 a6 a8 01 00 00 	and    QWORD PTR [rsi+0x1a8],0x0
 14221bb:	00 
 14221bc:	0f 11 86 98 01 00 00 	movups XMMWORD PTR [rsi+0x198],xmm0
 14221c3:	48 83 a7 c0 01 00 00 	and    QWORD PTR [rdi+0x1c0],0x0
 14221ca:	00 
 14221cb:	0f 11 87 b0 01 00 00 	movups XMMWORD PTR [rdi+0x1b0],xmm0
 14221d2:	48 8b 86 b0 01 00 00 	mov    rax,QWORD PTR [rsi+0x1b0]
 14221d9:	48 89 87 b0 01 00 00 	mov    QWORD PTR [rdi+0x1b0],rax
 14221e0:	48 8b 86 b8 01 00 00 	mov    rax,QWORD PTR [rsi+0x1b8]
 14221e7:	48 89 87 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rax
 14221ee:	48 8b 86 c0 01 00 00 	mov    rax,QWORD PTR [rsi+0x1c0]
 14221f5:	48 89 87 c0 01 00 00 	mov    QWORD PTR [rdi+0x1c0],rax
 14221fc:	0f 11 86 b0 01 00 00 	movups XMMWORD PTR [rsi+0x1b0],xmm0
 1422203:	48 83 a6 c0 01 00 00 	and    QWORD PTR [rsi+0x1c0],0x0
 142220a:	00 
 142220b:	0f 11 87 c8 01 00 00 	movups XMMWORD PTR [rdi+0x1c8],xmm0
 1422212:	48 83 a7 d8 01 00 00 	and    QWORD PTR [rdi+0x1d8],0x0
 1422219:	00 
 142221a:	48 8b 86 c8 01 00 00 	mov    rax,QWORD PTR [rsi+0x1c8]
 1422221:	48 89 87 c8 01 00 00 	mov    QWORD PTR [rdi+0x1c8],rax
 1422228:	48 8b 86 d0 01 00 00 	mov    rax,QWORD PTR [rsi+0x1d0]
 142222f:	48 89 87 d0 01 00 00 	mov    QWORD PTR [rdi+0x1d0],rax
 1422236:	48 8b 86 d8 01 00 00 	mov    rax,QWORD PTR [rsi+0x1d8]
 142223d:	48 89 87 d8 01 00 00 	mov    QWORD PTR [rdi+0x1d8],rax
 1422244:	48 83 a6 d8 01 00 00 	and    QWORD PTR [rsi+0x1d8],0x0
 142224b:	00 
 142224c:	0f 11 86 c8 01 00 00 	movups XMMWORD PTR [rsi+0x1c8],xmm0
 1422253:	48 83 a7 f0 01 00 00 	and    QWORD PTR [rdi+0x1f0],0x0
--
 1427ee6:	48 8d bb 80 02 00 00 	lea    rdi,[rbx+0x280]
 1427eed:	e8 fe 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427ef2:	48 8d bb 58 02 00 00 	lea    rdi,[rbx+0x258]
 1427ef9:	e8 f2 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427efe:	48 8d bb 30 02 00 00 	lea    rdi,[rbx+0x230]
 1427f05:	e8 e6 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f0a:	48 8d bb 08 02 00 00 	lea    rdi,[rbx+0x208]
 1427f11:	e8 da 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f16:	48 8d bb e0 01 00 00 	lea    rdi,[rbx+0x1e0]
 1427f1d:	e8 ce 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f22:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
 1427f29:	e8 c2 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f2e:	48 8d bb 90 01 00 00 	lea    rdi,[rbx+0x190]
 1427f35:	e8 b6 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f3a:	48 8d bb 68 01 00 00 	lea    rdi,[rbx+0x168]
 1427f41:	e8 aa 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f46:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
 1427f4d:	e8 9e 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f52:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
 1427f59:	e8 92 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f5e:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]
 1427f65:	e8 86 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f6a:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
 1427f71:	e8 7a 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f76:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 1427f7d:	e8 6e 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f82:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 1427f86:	e8 65 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
 1427f8b:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
--
 1427fd5:	49 8d be 58 02 00 00 	lea    rdi,[r14+0x258]
 1427fdc:	e8 47 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 1427fe1:	49 8d be 38 02 00 00 	lea    rdi,[r14+0x238]
 1427fe8:	e8 3b 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 1427fed:	49 8d be 18 02 00 00 	lea    rdi,[r14+0x218]
 1427ff4:	e8 2f 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 1427ff9:	49 8d be f8 01 00 00 	lea    rdi,[r14+0x1f8]
 1428000:	e8 23 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 1428005:	49 8d be d8 01 00 00 	lea    rdi,[r14+0x1d8]
 142800c:	e8 17 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 1428011:	49 8d be b8 01 00 00 	lea    rdi,[r14+0x1b8]
 1428018:	e8 0b 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 142801d:	49 8d be 98 01 00 00 	lea    rdi,[r14+0x198]
 1428024:	e8 ff 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 1428029:	49 8d be 78 01 00 00 	lea    rdi,[r14+0x178]
 1428030:	e8 f3 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 1428035:	49 8d be 58 01 00 00 	lea    rdi,[r14+0x158]
 142803c:	e8 e7 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 1428041:	49 8d be 38 01 00 00 	lea    rdi,[r14+0x138]
 1428048:	e8 db 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 142804d:	49 8d be 18 01 00 00 	lea    rdi,[r14+0x118]
 1428054:	e8 cf 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 1428059:	49 8d be f8 00 00 00 	lea    rdi,[r14+0xf8]
 1428060:	e8 c3 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 1428065:	49 8d be d8 00 00 00 	lea    rdi,[r14+0xd8]
 142806c:	e8 b7 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 1428071:	49 8d be b8 00 00 00 	lea    rdi,[r14+0xb8]
 1428078:	e8 ab 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
 142807d:	49 8d be 98 00 00 00 	lea    rdi,[r14+0x98]
--
 1433579:	49 8d 76 68          	lea    rsi,[r14+0x68]
 143357d:	4c 89 ff             	mov    rdi,r15
 1433580:	4c 89 ea             	mov    rdx,r13
 1433583:	4c 89 e1             	mov    rcx,r12
 1433586:	49 89 d8             	mov    r8,rbx
 1433589:	e8 1c d3 ff ff       	call   14308aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e2e>
 143358e:	88 44 24 07          	mov    BYTE PTR [rsp+0x7],al
 1433592:	49 8d be 28 01 00 00 	lea    rdi,[r14+0x128]
 1433599:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
 143359e:	e8 fd e6 ff ff       	call   1431ca0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277224>
 14335a3:	4d 8d a6 b8 01 00 00 	lea    r12,[r14+0x1b8]
 14335aa:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 14335b1:	00 
 14335b2:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
 14335b7:	4c 89 e6             	mov    rsi,r12
 14335ba:	4c 89 fa             	mov    rdx,r15
 14335bd:	49 89 d8             	mov    r8,rbx
 14335c0:	e8 4f e8 ff ff       	call   1431e14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277398>
 14335c5:	48 8d 8c 24 b8 00 00 	lea    rcx,[rsp+0xb8]
 14335cc:	00 
 14335cd:	4c 89 61 f8          	mov    QWORD PTR [rcx-0x8],r12
 14335d1:	48 8d 84 24 40 01 00 	lea    rax,[rsp+0x140]
 14335d8:	00 
 14335d9:	48 89 01             	mov    QWORD PTR [rcx],rax
 14335dc:	0f 57 c0             	xorps  xmm0,xmm0
 14335df:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
 14335e3:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
 14335e8:	48 89 0a             	mov    QWORD PTR [rdx],rcx
 14335eb:	49 8b be b8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1b8]
 14335f2:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
 14335f7:	49 8b b6 c0 01 00 00 	mov    rsi,QWORD PTR [r14+0x1c0]
 14335fe:	e8 91 02 00 00       	call   1433894 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278e18>
 1433603:	49 89 c4             	mov    r12,rax
 1433606:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 143360d:	00 
 143360e:	c6 84 24 c8 00 00 00 	mov    BYTE PTR [rsp+0xc8],0x1
 1433615:	01 
 1433616:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
 143361d:	00 
 143361e:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 1433622:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 1433627:	49 39 c4             	cmp    r12,rax
 143362a:	0f 84 47 01 00 00    	je     1433777 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278cfb>
 1433630:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]
 1433635:	6a 70                	push   0x70
 1433637:	41 5e                	pop    r14
 1433639:	49 8b 7c 24 18       	mov    rdi,QWORD PTR [r12+0x18]
--
 1435b79:	48 8b 83 80 01 00 00 	mov    rax,QWORD PTR [rbx+0x180]
 1435b80:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
 1435b87:	00 
 1435b88:	0f 11 8b 70 01 00 00 	movups XMMWORD PTR [rbx+0x170],xmm1
 1435b8f:	48 83 a3 80 01 00 00 	and    QWORD PTR [rbx+0x180],0x0
 1435b96:	00 
 1435b97:	0f 10 83 88 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x188]
 1435b9e:	0f 11 84 24 a8 01 00 	movups XMMWORD PTR [rsp+0x1a8],xmm0
 1435ba5:	00 
 1435ba6:	48 8b 83 98 01 00 00 	mov    rax,QWORD PTR [rbx+0x198]
 1435bad:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
 1435bb4:	00 
 1435bb5:	0f 11 8b 88 01 00 00 	movups XMMWORD PTR [rbx+0x188],xmm1
 1435bbc:	48 83 a3 98 01 00 00 	and    QWORD PTR [rbx+0x198],0x0
 1435bc3:	00 
 1435bc4:	0f 10 83 a0 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1a0]
 1435bcb:	0f 29 84 24 c0 01 00 	movaps XMMWORD PTR [rsp+0x1c0],xmm0
 1435bd2:	00 
 1435bd3:	48 8b 83 b0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1b0]
 1435bda:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
 1435be1:	00 
 1435be2:	0f 11 8b a0 01 00 00 	movups XMMWORD PTR [rbx+0x1a0],xmm1
 1435be9:	48 83 a3 b0 01 00 00 	and    QWORD PTR [rbx+0x1b0],0x0
 1435bf0:	00 
 1435bf1:	0f 10 83 b8 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1b8]
 1435bf8:	0f 11 84 24 d8 01 00 	movups XMMWORD PTR [rsp+0x1d8],xmm0
 1435bff:	00 
 1435c00:	48 8b 83 c8 01 00 00 	mov    rax,QWORD PTR [rbx+0x1c8]
 1435c07:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
 1435c0e:	00 
 1435c0f:	0f 11 8b b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm1
 1435c16:	48 83 a3 c8 01 00 00 	and    QWORD PTR [rbx+0x1c8],0x0
 1435c1d:	00 
 1435c1e:	0f 10 83 d0 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1d0]
 1435c25:	0f 29 84 24 f0 01 00 	movaps XMMWORD PTR [rsp+0x1f0],xmm0
 1435c2c:	00 
 1435c2d:	48 8b 83 e0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1e0]
 1435c34:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
 1435c3b:	00 
 1435c3c:	0f 11 8b d0 01 00 00 	movups XMMWORD PTR [rbx+0x1d0],xmm1
 1435c43:	48 83 a3 e0 01 00 00 	and    QWORD PTR [rbx+0x1e0],0x0
 1435c4a:	00 
 1435c4b:	0f 10 83 e8 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1e8]
 1435c52:	0f 11 84 24 08 02 00 	movups XMMWORD PTR [rsp+0x208],xmm0
 1435c59:	00 
 1435c5a:	48 8b 83 f8 01 00 00 	mov    rax,QWORD PTR [rbx+0x1f8]
 1435c61:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
 1435c68:	00 
 1435c69:	0f 11 8b e8 01 00 00 	movups XMMWORD PTR [rbx+0x1e8],xmm1
--
 143a814:	0f 29 84 24 70 01 00 	movaps XMMWORD PTR [rsp+0x170],xmm0
 143a81b:	00 
 143a81c:	0f 29 84 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm0
 143a823:	00 
 143a824:	0f 29 84 24 90 01 00 	movaps XMMWORD PTR [rsp+0x190],xmm0
 143a82b:	00 
 143a82c:	c7 84 24 a8 01 00 00 	mov    DWORD PTR [rsp+0x1a8],0xc
 143a833:	0c 00 00 00 
 143a837:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
 143a83e:	00 
 143a83f:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
 143a846:	00 
 143a847:	49 8b 36             	mov    rsi,QWORD PTR [r14]
 143a84a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 143a84d:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
 143a854:	00 
 143a855:	ff 50 68             	call   QWORD PTR [rax+0x68]
 143a858:	80 bc 24 50 01 00 00 	cmp    BYTE PTR [rsp+0x150],0x0
 143a85f:	00 
 143a860:	0f 84 32 01 00 00    	je     143a998 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ff1c>
 143a866:	8b 84 24 48 01 00 00 	mov    eax,DWORD PTR [rsp+0x148]
 143a86d:	85 c0                	test   eax,eax
 143a86f:	0f 84 e4 01 00 00    	je     143aa59 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ffdd>
 143a875:	83 f8 01             	cmp    eax,0x1
 143a878:	0f 85 1a 01 00 00    	jne    143a998 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ff1c>
 143a87e:	4c 8d bc 24 18 02 00 	lea    r15,[rsp+0x218]
 143a885:	00 
 143a886:	48 8d b4 24 70 01 00 	lea    rsi,[rsp+0x170]
 143a88d:	00 
--
 144051c:	88 83 00 02 00 00    	mov    BYTE PTR [rbx+0x200],al
 1440522:	88 83 08 02 00 00    	mov    BYTE PTR [rbx+0x208],al
 1440528:	88 83 20 02 00 00    	mov    BYTE PTR [rbx+0x220],al
 144052e:	88 83 28 02 00 00    	mov    BYTE PTR [rbx+0x228],al
 1440534:	88 83 40 02 00 00    	mov    BYTE PTR [rbx+0x240],al
 144053a:	88 83 48 02 00 00    	mov    BYTE PTR [rbx+0x248],al
 1440540:	88 83 60 02 00 00    	mov    BYTE PTR [rbx+0x260],al
 1440546:	48 83 a3 70 02 00 00 	and    QWORD PTR [rbx+0x270],0x0
 144054d:	00 
 144054e:	0f 11 83 a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm0
 1440555:	88 83 b8 01 00 00    	mov    BYTE PTR [rbx+0x1b8],al
 144055b:	4c 89 b3 68 02 00 00 	mov    QWORD PTR [rbx+0x268],r14
 1440562:	88 83 b0 02 00 00    	mov    BYTE PTR [rbx+0x2b0],al
 1440568:	88 83 b8 02 00 00    	mov    BYTE PTR [rbx+0x2b8],al
 144056e:	88 83 d0 02 00 00    	mov    BYTE PTR [rbx+0x2d0],al
 1440574:	88 83 d8 02 00 00    	mov    BYTE PTR [rbx+0x2d8],al
 144057a:	88 83 f0 02 00 00    	mov    BYTE PTR [rbx+0x2f0],al
 1440580:	83 a3 f8 02 00 00 00 	and    DWORD PTR [rbx+0x2f8],0x0
 1440587:	88 83 fc 02 00 00    	mov    BYTE PTR [rbx+0x2fc],al
 144058d:	0f 11 83 81 02 00 00 	movups XMMWORD PTR [rbx+0x281],xmm0
 1440594:	0f 11 83 78 02 00 00 	movups XMMWORD PTR [rbx+0x278],xmm0
 144059b:	48 83 c4 08          	add    rsp,0x8
 144059f:	5b                   	pop    rbx
 14405a0:	41 5e                	pop    r14
 14405a2:	c3                   	ret
 14405a3:	55                   	push   rbp
 14405a4:	41 57                	push   r15
 14405a6:	41 56                	push   r14
 14405a8:	41 55                	push   r13
--
 1440956:	5f                   	pop    rdi
 1440957:	ba 89 00 00 00       	mov    edx,0x89
 144095c:	49 89 f0             	mov    r8,rsi
 144095f:	31 c0                	xor    eax,eax
 1440961:	e8 6c 5f 39 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
 1440966:	eb 70                	jmp    14409d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285f5c>
 1440968:	4c 8d bb f9 00 00 00 	lea    r15,[rbx+0xf9]
 144096f:	80 bb c8 01 00 00 00 	cmp    BYTE PTR [rbx+0x1c8],0x0
 1440976:	74 10                	je     1440988 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285f0c>
 1440978:	48 8b 83 c0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1c0]
 144097f:	48 8b 8b b8 01 00 00 	mov    rcx,QWORD PTR [rbx+0x1b8]
 1440986:	eb 04                	jmp    144098c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285f10>
 1440988:	31 c0                	xor    eax,eax
 144098a:	31 c9                	xor    ecx,ecx
 144098c:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
 1440991:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 1440994:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 1440998:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
 144099f:	00 
 14409a0:	4c 89 e7             	mov    rdi,r12
 14409a3:	e8 78 39 75 ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
 14409a8:	44 8b 93 90 01 00 00 	mov    r10d,DWORD PTR [rbx+0x190]
 14409af:	48 8d 0d 21 fa ef fe 	lea    rcx,[rip+0xfffffffffeeffa21]        # 3403d7 <_ZTSSt12bad_any_cast@@Base-0x4fdf1>
 14409b6:	48 8d 35 bf 15 01 ff 	lea    rsi,[rip+0xffffffffff0115bf]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 14409bd:	6a 04                	push   0x4
 14409bf:	5f                   	pop    rdi
 14409c0:	ba 84 00 00 00       	mov    edx,0x84
 14409c5:	49 89 f0             	mov    r8,rsi
 14409c8:	4d 89 f9             	mov    r9,r15
--
 1440eb9:	e8 f4 09 00 00       	call   14418b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286e36>
 1440ebe:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 1440ec2:	49 8d 76 78          	lea    rsi,[r14+0x78]
 1440ec6:	e8 c9 66 f5 ff       	call   1397594 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dcb18>
 1440ecb:	be 70 01 00 00       	mov    esi,0x170
 1440ed0:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 1440ed4:	4c 01 f6             	add    rsi,r14
 1440ed7:	e8 2e 3a 80 ff       	call   c4490a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1918aa>
 1440edc:	41 8a 86 c8 01 00 00 	mov    al,BYTE PTR [r14+0x1c8]
 1440ee3:	88 83 c8 01 00 00    	mov    BYTE PTR [rbx+0x1c8],al
 1440ee9:	41 0f 10 86 b8 01 00 	movups xmm0,XMMWORD PTR [r14+0x1b8]
 1440ef0:	00 
 1440ef1:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
 1440ef8:	31 c0                	xor    eax,eax
 1440efa:	88 83 d0 01 00 00    	mov    BYTE PTR [rbx+0x1d0],al
 1440f00:	88 83 00 02 00 00    	mov    BYTE PTR [rbx+0x200],al
 1440f06:	41 38 86 00 02 00 00 	cmp    BYTE PTR [r14+0x200],al
 1440f0d:	74 13                	je     1440f22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2864a6>
 1440f0f:	48 8d bb d0 01 00 00 	lea    rdi,[rbx+0x1d0]
 1440f16:	49 8d b6 d0 01 00 00 	lea    rsi,[r14+0x1d0]
 1440f1d:	e8 b0 09 00 00       	call   14418d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286e56>
 1440f22:	31 c0                	xor    eax,eax
 1440f24:	88 83 08 02 00 00    	mov    BYTE PTR [rbx+0x208],al
 1440f2a:	88 83 20 02 00 00    	mov    BYTE PTR [rbx+0x220],al
 1440f30:	41 38 86 20 02 00 00 	cmp    BYTE PTR [r14+0x220],al
 1440f37:	74 37                	je     1440f70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2864f4>
 1440f39:	48 8d 83 08 02 00 00 	lea    rax,[rbx+0x208]
 1440f40:	49 8b 8e 18 02 00 00 	mov    rcx,QWORD PTR [r14+0x218]
 1440f47:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 1440f4b:	41 0f 10 86 08 02 00 	movups xmm0,XMMWORD PTR [r14+0x208]
 1440f52:	00 
--
 144143e:	80 7f 20 00          	cmp    BYTE PTR [rdi+0x20],0x0
 1441442:	0f 85 92 25 f1 ff    	jne    13539da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198f5e>
 1441448:	c3                   	ret
 1441449:	cc                   	int3
 144144a:	53                   	push   rbx
 144144b:	48 89 fb             	mov    rbx,rdi
 144144e:	48 81 c7 f8 01 00 00 	add    rdi,0x1f8
 1441455:	e8 d6 58 66 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 144145a:	48 8d bb d8 01 00 00 	lea    rdi,[rbx+0x1d8]
 1441461:	e8 ca 58 66 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1441466:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
 144146d:	e8 be 58 66 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1441472:	48 8d bb 80 01 00 00 	lea    rdi,[rbx+0x180]
 1441479:	e8 1e 00 00 00       	call   144149c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286a20>
 144147e:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 1441485:	e8 42 37 22 00       	call   1664bcc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18d38>
 144148a:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 144148e:	e8 e1 a3 81 ff       	call   c5b874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a8814>
 1441493:	48 89 df             	mov    rdi,rbx
 1441496:	5b                   	pop    rbx
 1441497:	e9 a6 c3 7f ff       	jmp    c3d842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18a7e2>
 144149c:	80 7f 30 00          	cmp    BYTE PTR [rdi+0x30],0x0
 14414a0:	0f 85 7a e4 c9 ff    	jne    10df920 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6d36>
 14414a6:	c3                   	ret
 14414a7:	cc                   	int3
 14414a8:	53                   	push   rbx
 14414a9:	48 81 ec 10 03 00 00 	sub    rsp,0x310
 14414b0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14414b7:	00 00 
--
 1441623:	4c 89 e7             	mov    rdi,r12
 1441626:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 144162b:	e8 10 8f 92 ff       	call   d6a540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375c6>
 1441630:	be 70 01 00 00       	mov    esi,0x170
 1441635:	4c 8d 2c 33          	lea    r13,[rbx+rsi*1]
 1441639:	4c 01 fe             	add    rsi,r15
 144163c:	4c 89 ef             	mov    rdi,r13
 144163f:	e8 22 7b 81 ff       	call   c59166 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a6106>
 1441644:	41 8a 87 c8 01 00 00 	mov    al,BYTE PTR [r15+0x1c8]
 144164b:	88 83 c8 01 00 00    	mov    BYTE PTR [rbx+0x1c8],al
 1441651:	41 0f 10 87 b8 01 00 	movups xmm0,XMMWORD PTR [r15+0x1b8]
 1441658:	00 
 1441659:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
 1441660:	be d0 01 00 00       	mov    esi,0x1d0
 1441665:	48 8d 2c 33          	lea    rbp,[rbx+rsi*1]
 1441669:	31 c0                	xor    eax,eax
 144166b:	88 83 d0 01 00 00    	mov    BYTE PTR [rbx+0x1d0],al
 1441671:	88 83 00 02 00 00    	mov    BYTE PTR [rbx+0x200],al
 1441677:	41 38 87 00 02 00 00 	cmp    BYTE PTR [r15+0x200],al
 144167e:	74 29                	je     14416a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286c2d>
 1441680:	31 c0                	xor    eax,eax
 1441682:	88 83 d0 01 00 00    	mov    BYTE PTR [rbx+0x1d0],al
 1441688:	88 83 f8 01 00 00    	mov    BYTE PTR [rbx+0x1f8],al
 144168e:	41 38 87 f8 01 00 00 	cmp    BYTE PTR [r15+0x1f8],al
 1441695:	74 0b                	je     14416a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286c26>
 1441697:	4c 01 fe             	add    rsi,r15
 144169a:	48 89 ef             	mov    rdi,rbp
 144169d:	e8 ac e2 c9 ff       	call   10df94e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6d64>
 14416a2:	c6 83 00 02 00 00 01 	mov    BYTE PTR [rbx+0x200],0x1
 14416a9:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
 14416ae:	be 08 02 00 00       	mov    esi,0x208
--
 1448285:	83 a3 80 01 00 00 00 	and    DWORD PTR [rbx+0x180],0x0
 144828c:	0f 11 83 a4 00 00 00 	movups XMMWORD PTR [rbx+0xa4],xmm0
 1448293:	0f 11 83 b4 00 00 00 	movups XMMWORD PTR [rbx+0xb4],xmm0
 144829a:	0f 11 83 c4 00 00 00 	movups XMMWORD PTR [rbx+0xc4],xmm0
 14482a1:	0f 11 83 d4 00 00 00 	movups XMMWORD PTR [rbx+0xd4],xmm0
 14482a8:	0f 11 83 e4 00 00 00 	movups XMMWORD PTR [rbx+0xe4],xmm0
 14482af:	0f 11 83 f4 00 00 00 	movups XMMWORD PTR [rbx+0xf4],xmm0
 14482b6:	0f 11 83 04 01 00 00 	movups XMMWORD PTR [rbx+0x104],xmm0
 14482bd:	0f 11 83 11 01 00 00 	movups XMMWORD PTR [rbx+0x111],xmm0
 14482c4:	0f 11 83 c4 01 00 00 	movups XMMWORD PTR [rbx+0x1c4],xmm0
 14482cb:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
 14482d2:	0f 11 83 a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm0
 14482d9:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
 14482e0:	0f 11 83 88 01 00 00 	movups XMMWORD PTR [rbx+0x188],xmm0
 14482e7:	48 b9 00 00 00 00 00 	movabs rcx,0x3ff0000000000000
 14482ee:	00 f0 3f 
 14482f1:	48 89 8b d8 01 00 00 	mov    QWORD PTR [rbx+0x1d8],rcx
 14482f8:	88 83 e0 01 00 00    	mov    BYTE PTR [rbx+0x1e0],al
 14482fe:	88 83 e4 01 00 00    	mov    BYTE PTR [rbx+0x1e4],al
 1448304:	66 83 a3 e8 01 00 00 	and    WORD PTR [rbx+0x1e8],0x0
 144830b:	00 
 144830c:	88 83 ec 01 00 00    	mov    BYTE PTR [rbx+0x1ec],al
 1448312:	88 83 f0 01 00 00    	mov    BYTE PTR [rbx+0x1f0],al
 1448318:	48 83 a3 f4 01 00 00 	and    QWORD PTR [rbx+0x1f4],0x0
 144831f:	00 
 1448320:	48 83 a3 00 02 00 00 	and    QWORD PTR [rbx+0x200],0x0
 1448327:	00 
 1448328:	4c 89 b3 08 02 00 00 	mov    QWORD PTR [rbx+0x208],r14
 144832f:	88 83 10 02 00 00    	mov    BYTE PTR [rbx+0x210],al
--
 144ae15:	0f b6 06             	movzx  eax,BYTE PTR [rsi]
 144ae18:	a8 01                	test   al,0x1
 144ae1a:	74 0a                	je     144ae26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2903aa>
 144ae1c:	48 8b 84 24 88 02 00 	mov    rax,QWORD PTR [rsp+0x288]
 144ae23:	00 
 144ae24:	eb 02                	jmp    144ae28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2903ac>
 144ae26:	d1 e8                	shr    eax,1
 144ae28:	49 81 c4 98 02 00 00 	add    r12,0x298
 144ae2f:	48 85 c0             	test   rax,rax
 144ae32:	49 0f 44 f4          	cmove  rsi,r12
 144ae36:	4c 8d a3 b8 01 00 00 	lea    r12,[rbx+0x1b8]
 144ae3d:	4c 89 e7             	mov    rdi,r12
 144ae40:	e8 3b 32 3a 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 144ae45:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 144ae49:	48 8d b3 80 02 00 00 	lea    rsi,[rbx+0x280]
 144ae50:	e8 27 da ff ff       	call   144887c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28de00>
 144ae55:	49 89 c5             	mov    r13,rax
 144ae58:	80 bb 38 02 00 00 00 	cmp    BYTE PTR [rbx+0x238],0x0
 144ae5f:	75 41                	jne    144aea2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x290426>
 144ae61:	48 8d 35 17 9c f2 fe 	lea    rsi,[rip+0xfffffffffef29c17]        # 374a7f <_ZTSSt12bad_any_cast@@Base-0x1b749>
 144ae68:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
 144ae6f:	00 
 144ae70:	e8 09 ec 62 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 144ae75:	6a 02                	push   0x2
 144ae77:	5e                   	pop    rsi
 144ae78:	48 8d 94 24 20 03 00 	lea    rdx,[rsp+0x320]
 144ae7f:	00 
 144ae80:	48 89 df             	mov    rdi,rbx
 144ae83:	e8 46 da ff ff       	call   14488ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28de52>
--
 144e069:	49 8b 86 90 00 00 00 	mov    rax,QWORD PTR [r14+0x90]
 144e070:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 144e075:	f2 41 0f 10 44 24 18 	movsd  xmm0,QWORD PTR [r12+0x18]
 144e07c:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
 144e081:	49 8b 84 24 90 00 00 	mov    rax,QWORD PTR [r12+0x90]
 144e088:	00 
 144e089:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 144e08e:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 144e092:	4c 89 ef             	mov    rdi,r13
 144e095:	ff 50 28             	call   QWORD PTR [rax+0x28]
 144e098:	44 8a a8 b8 01 00 00 	mov    r13b,BYTE PTR [rax+0x1b8]
 144e09f:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
 144e0a3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 144e0a6:	48 8d 35 b2 79 fe fe 	lea    rsi,[rip+0xfffffffffefe79b2]        # 435a5f <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4ae>
 144e0ad:	48 8d 0d bc 79 fe fe 	lea    rcx,[rip+0xfffffffffefe79bc]        # 435a70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4bf>
 144e0b4:	6a 08                	push   0x8
 144e0b6:	41 5c                	pop    r12
 144e0b8:	6a 16                	push   0x16
 144e0ba:	41 58                	pop    r8
 144e0bc:	4c 89 e2             	mov    rdx,r12
 144e0bf:	45 31 c9             	xor    r9d,r9d
 144e0c2:	e8 63 93 19 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 144e0c7:	89 c5                	mov    ebp,eax
 144e0c9:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
 144e0cd:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 144e0d0:	48 8d 35 b0 79 fe fe 	lea    rsi,[rip+0xfffffffffefe79b0]        # 435a87 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4d6>
 144e0d7:	48 8d 0d b2 79 fe fe 	lea    rcx,[rip+0xfffffffffefe79b2]        # 435a90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4df>
 144e0de:	6a 1f                	push   0x1f
 144e0e0:	41 58                	pop    r8
--
 144f336:	e8 1d 58 6e ff       	call   b34b58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81af8>
 144f33b:	84 c0                	test   al,al
 144f33d:	74 1b                	je     144f35a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2948de>
 144f33f:	4c 89 e7             	mov    rdi,r12
 144f342:	e8 ef c4 62 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 144f347:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
 144f34e:	00 
 144f34f:	48 89 c6             	mov    rsi,rax
 144f352:	e8 89 11 67 ff       	call   ac04e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd480>
 144f357:	41 89 c5             	mov    r13d,eax
 144f35a:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
 144f361:	00 
 144f362:	6a 50                	push   0x50
 144f364:	5e                   	pop    rsi
 144f365:	e8 ec 14 67 ff       	call   ac0856 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7f6>
 144f36a:	49 89 c7             	mov    r15,rax
 144f36d:	48 8d 78 08          	lea    rdi,[rax+0x8]
 144f371:	48 8b b4 24 b8 01 00 	mov    rsi,QWORD PTR [rsp+0x1b8]
 144f378:	00 
 144f379:	4c 89 e2             	mov    rdx,r12
 144f37c:	e8 e7 14 67 ff       	call   ac0868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd808>
 144f381:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
 144f388:	00 
 144f389:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
 144f38d:	48 8d 0d 0c 4d 42 00 	lea    rcx,[rip+0x424d0c]        # 18740a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30788>
 144f394:	49 89 4f 20          	mov    QWORD PTR [r15+0x20],rcx
 144f398:	0f 57 c0             	xorps  xmm0,xmm0
 144f39b:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
 144f3a0:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
 144f3a4:	41 83 67 48 00       	and    DWORD PTR [r15+0x48],0x0
 144f3a9:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
 144f3b0:	00 
 144f3b1:	44 89 e9             	mov    ecx,r13d
 144f3b4:	48 8b 14 c8          	mov    rdx,QWORD PTR [rax+rcx*8]
 144f3b8:	48 85 d2             	test   rdx,rdx
 144f3bb:	74 09                	je     144f3c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29494a>
 144f3bd:	49 89 17             	mov    QWORD PTR [r15],rdx
 144f3c0:	4c 89 3c c8          	mov    QWORD PTR [rax+rcx*8],r15
 144f3c4:	eb 1e                	jmp    144f3e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x294968>
 144f3c6:	4c 89 3c c8          	mov    QWORD PTR [rax+rcx*8],r15
--
 14562c3:	41 83 65 28 00       	and    DWORD PTR [r13+0x28],0x0
 14562c8:	49 83 c4 30          	add    r12,0x30
 14562cc:	4c 89 e7             	mov    rdi,r12
 14562cf:	e8 62 55 62 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 14562d4:	4c 89 ef             	mov    rdi,r13
 14562d7:	48 89 c6             	mov    rsi,rax
 14562da:	e8 73 95 32 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 14562df:	0f 57 c0             	xorps  xmm0,xmm0
 14562e2:	84 c0                	test   al,al
 14562e4:	0f 84 99 02 00 00    	je     1456583 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29bb07>
 14562ea:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
 14562f1:	00 
 14562f2:	48 8d 05 47 c3 41 00 	lea    rax,[rip+0x41c347]        # 1872640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ed28>
 14562f9:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
 1456300:	00 
 1456301:	48 89 ac 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rbp
 1456308:	00 
 1456309:	48 89 ac 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rbp
 1456310:	00 
 1456311:	83 a4 24 d8 01 00 00 	and    DWORD PTR [rsp+0x1d8],0x0
 1456318:	00 
 1456319:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
 1456320:	00 
 1456321:	a8 01                	test   al,0x1
 1456323:	0f 85 82 04 00 00    	jne    14567ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29bd2f>
 1456329:	48 85 c0             	test   rax,rax
 145632c:	0f 84 8e 03 00 00    	je     14566c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29bc44>
 1456332:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 1456339:	00 
--
 145729b:	48 89 c6             	mov    rsi,rax
 145729e:	e8 af 85 32 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 14572a3:	0f 57 c0             	xorps  xmm0,xmm0
 14572a6:	84 c0                	test   al,al
 14572a8:	0f 84 93 04 00 00    	je     1457741 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ccc5>
 14572ae:	0f 11 84 24 a8 01 00 	movups XMMWORD PTR [rsp+0x1a8],xmm0
 14572b5:	00 
 14572b6:	48 8d 05 93 b9 41 00 	lea    rax,[rip+0x41b993]        # 1872c50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2f338>
 14572bd:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
 14572c4:	00 
 14572c5:	48 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbp
 14572cc:	00 
 14572cd:	48 8b 84 24 58 01 00 	mov    rax,QWORD PTR [rsp+0x158]
 14572d4:	00 
 14572d5:	a8 01                	test   al,0x1
 14572d7:	0f 85 36 09 00 00    	jne    1457c13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d197>
 14572dd:	48 85 c0             	test   rax,rax
 14572e0:	0f 84 a4 05 00 00    	je     145788a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ce0e>
 14572e6:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
 14572ed:	00 
 14572ee:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
 14572f5:	00 
 14572f6:	e8 65 77 2f 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
 14572fb:	e9 c2 05 00 00       	jmp    14578c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ce46>
 1457300:	0f 57 c0             	xorps  xmm0,xmm0
 1457303:	4c 8d ac 24 50 01 00 	lea    r13,[rsp+0x150]
 145730a:	00 
 145730b:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
 1457310:	48 8d 05 b9 b9 41 00 	lea    rax,[rip+0x41b9b9]        # 1872cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2f3b8>
--
 1457f20:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
 1457f24:	49 83 c4 30          	add    r12,0x30
 1457f28:	4c 89 e7             	mov    rdi,r12
 1457f2b:	e8 06 39 62 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1457f30:	4c 89 ef             	mov    rdi,r13
 1457f33:	48 89 c6             	mov    rsi,rax
 1457f36:	e8 17 79 32 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 1457f3b:	0f 57 c0             	xorps  xmm0,xmm0
 1457f3e:	84 c0                	test   al,al
 1457f40:	0f 84 c5 03 00 00    	je     145830b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d88f>
 1457f46:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
 1457f4d:	00 
 1457f4e:	48 8d 05 83 b0 41 00 	lea    rax,[rip+0x41b083]        # 1872fd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2f6c0>
 1457f55:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
 1457f5c:	00 
 1457f5d:	48 89 ac 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rbp
 1457f64:	00 
 1457f65:	48 8b 84 24 48 01 00 	mov    rax,QWORD PTR [rsp+0x148]
 1457f6c:	00 
 1457f6d:	a8 01                	test   al,0x1
 1457f6f:	0f 85 08 08 00 00    	jne    145877d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29dd01>
 1457f75:	48 85 c0             	test   rax,rax
 1457f78:	0f 84 c3 03 00 00    	je     1458341 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d8c5>
 1457f7e:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 1457f85:	00 
 1457f86:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
 1457f8d:	00 
 1457f8e:	e8 cd 6a 2f 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
 1457f93:	e9 e1 03 00 00       	jmp    1458379 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d8fd>
--
 1474860:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
 1474865:	48 8d 88 f0 00 00 00 	lea    rcx,[rax+0xf0]
 147486c:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
 1474871:	48 8d 88 b0 00 00 00 	lea    rcx,[rax+0xb0]
 1474878:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
 147487d:	48 8d 48 50          	lea    rcx,[rax+0x50]
 1474881:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
 1474886:	48 8d 88 e0 01 00 00 	lea    rcx,[rax+0x1e0]
 147488d:	48 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rcx
 1474894:	00 
 1474895:	48 8d 88 b8 01 00 00 	lea    rcx,[rax+0x1b8]
 147489c:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
 14748a3:	00 
 14748a4:	48 05 90 01 00 00    	add    rax,0x190
 14748aa:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
 14748af:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
 14748b6:	00 
 14748b7:	4d 8d 7d 20          	lea    r15,[r13+0x20]
 14748bb:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 14748bf:	4c 89 fe             	mov    rsi,r15
 14748c2:	e8 13 38 0e 00       	call   15580da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39d65e>
 14748c7:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
 14748ce:	00 
 14748cf:	48 89 c6             	mov    rsi,rax
 14748d2:	e8 fd 83 c1 ff       	call   108ccd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2540ea>
 14748d7:	4c 89 e7             	mov    rdi,r12
 14748da:	e8 ff 15 00 00       	call   1475ede <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb462>
 14748df:	49 8b 5d 68          	mov    rbx,QWORD PTR [r13+0x68]
 14748e3:	4d 8b 75 70          	mov    r14,QWORD PTR [r13+0x70]
--
 14805cd:	66 c7 84 24 39 01 00 	mov    WORD PTR [rsp+0x139],0x103
 14805d4:	00 03 01 
 14805d7:	31 c9                	xor    ecx,ecx
 14805d9:	88 8c 24 80 01 00 00 	mov    BYTE PTR [rsp+0x180],cl
 14805e0:	88 8c 24 88 01 00 00 	mov    BYTE PTR [rsp+0x188],cl
 14805e7:	88 8c 24 90 01 00 00 	mov    BYTE PTR [rsp+0x190],cl
 14805ee:	88 8c 24 98 01 00 00 	mov    BYTE PTR [rsp+0x198],cl
 14805f5:	88 8c 24 a0 01 00 00 	mov    BYTE PTR [rsp+0x1a0],cl
 14805fc:	88 8c 24 a8 01 00 00 	mov    BYTE PTR [rsp+0x1a8],cl
 1480603:	88 8c 24 b0 01 00 00 	mov    BYTE PTR [rsp+0x1b0],cl
 148060a:	88 8c 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],cl
 1480611:	88 8c 24 c0 01 00 00 	mov    BYTE PTR [rsp+0x1c0],cl
 1480618:	88 8c 24 c8 01 00 00 	mov    BYTE PTR [rsp+0x1c8],cl
 148061f:	88 8c 24 d0 01 00 00 	mov    BYTE PTR [rsp+0x1d0],cl
 1480626:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 148062b:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
 148062e:	83 a4 24 00 02 00 00 	and    DWORD PTR [rsp+0x200],0x0
 1480635:	00 
 1480636:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
 148063b:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
 148063e:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 1480643:	0f 11 40 69          	movups XMMWORD PTR [rax+0x69],xmm0
 1480647:	0f 11 40 60          	movups XMMWORD PTR [rax+0x60],xmm0
 148064b:	0f 11 40 50          	movups XMMWORD PTR [rax+0x50],xmm0
 148064f:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
 1480653:	4c 89 ef             	mov    rdi,r13
 1480656:	4c 89 f6             	mov    rsi,r14
 1480659:	48 89 ea             	mov    rdx,rbp
 148065c:	e8 4d 88 0d 00       	call   1558eae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e432>
--
 14806df:	c6 84 24 3a 01 00 00 	mov    BYTE PTR [rsp+0x13a],0x1
 14806e6:	01 
 14806e7:	31 c9                	xor    ecx,ecx
 14806e9:	88 8c 24 80 01 00 00 	mov    BYTE PTR [rsp+0x180],cl
 14806f0:	88 8c 24 88 01 00 00 	mov    BYTE PTR [rsp+0x188],cl
 14806f7:	88 8c 24 90 01 00 00 	mov    BYTE PTR [rsp+0x190],cl
 14806fe:	88 8c 24 98 01 00 00 	mov    BYTE PTR [rsp+0x198],cl
 1480705:	88 8c 24 a0 01 00 00 	mov    BYTE PTR [rsp+0x1a0],cl
 148070c:	88 8c 24 a8 01 00 00 	mov    BYTE PTR [rsp+0x1a8],cl
 1480713:	88 8c 24 b0 01 00 00 	mov    BYTE PTR [rsp+0x1b0],cl
 148071a:	88 8c 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],cl
 1480721:	88 8c 24 c0 01 00 00 	mov    BYTE PTR [rsp+0x1c0],cl
 1480728:	88 8c 24 c8 01 00 00 	mov    BYTE PTR [rsp+0x1c8],cl
 148072f:	88 8c 24 d0 01 00 00 	mov    BYTE PTR [rsp+0x1d0],cl
 1480736:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 148073b:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
 148073e:	83 a4 24 00 02 00 00 	and    DWORD PTR [rsp+0x200],0x0
 1480745:	00 
 1480746:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
 148074b:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
 148074e:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 1480753:	0f 11 40 69          	movups XMMWORD PTR [rax+0x69],xmm0
 1480757:	0f 11 40 60          	movups XMMWORD PTR [rax+0x60],xmm0
 148075b:	0f 11 40 50          	movups XMMWORD PTR [rax+0x50],xmm0
 148075f:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
 1480763:	4c 89 ef             	mov    rdi,r13
 1480766:	48 89 de             	mov    rsi,rbx
 1480769:	48 89 ea             	mov    rdx,rbp
 148076c:	e8 3d 87 0d 00       	call   1558eae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e432>
--
 1483430:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
 1483435:	0f 11 45 58          	movups XMMWORD PTR [rbp+0x58],xmm0
 1483439:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
 148343c:	48 89 ef             	mov    rdi,rbp
 148343f:	48 83 c7 70          	add    rdi,0x70
 1483443:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
 148344a:	00 
 148344b:	e8 4c 85 db ff       	call   123b99c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80f20>
 1483450:	c6 84 24 f0 01 00 00 	mov    BYTE PTR [rsp+0x1f0],0x1
 1483457:	01 
 1483458:	49 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [r12+0x1b8]
 148345f:	00 
 1483460:	48 ff c0             	inc    rax
 1483463:	78 07                	js     148346c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c89f0>
 1483465:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 148346a:	eb 15                	jmp    1483481 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c8a05>
 148346c:	48 89 c1             	mov    rcx,rax
 148346f:	48 d1 e9             	shr    rcx,1
 1483472:	83 e0 01             	and    eax,0x1
 1483475:	48 09 c8             	or     rax,rcx
 1483478:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
 148347d:	f3 0f 58 c0          	addss  xmm0,xmm0
 1483481:	48 89 d9             	mov    rcx,rbx
 1483484:	48 d1 e9             	shr    rcx,1
 1483487:	89 d8                	mov    eax,ebx
 1483489:	83 e0 01             	and    eax,0x1
 148348c:	48 09 c8             	or     rax,rcx
 148348f:	48 85 db             	test   rbx,rbx
 1483492:	78 07                	js     148349b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c8a1f>
--
 148389e:	72 08                	jb     14838a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c8e2c>
 14838a0:	31 d2                	xor    edx,edx
 14838a2:	48 f7 f3             	div    rbx
 14838a5:	48 89 d0             	mov    rax,rdx
 14838a8:	48 c1 e0 03          	shl    rax,0x3
 14838ac:	48 8b 4c 24 68       	mov    rcx,QWORD PTR [rsp+0x68]
 14838b1:	48 03 01             	add    rax,QWORD PTR [rcx]
 14838b4:	48 89 28             	mov    QWORD PTR [rax],rbp
 14838b7:	48 83 a4 24 e0 01 00 	and    QWORD PTR [rsp+0x1e0],0x0
 14838be:	00 00 
 14838c0:	49 ff 84 24 b8 01 00 	inc    QWORD PTR [r12+0x1b8]
 14838c7:	00 
 14838c8:	e8 09 81 db ff       	call   123b9d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80f5a>
 14838cd:	48 8d bc 24 30 06 00 	lea    rdi,[rsp+0x630]
 14838d4:	00 
 14838d5:	e8 d4 3b 67 ff       	call   af74ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4444e>
 14838da:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]
 14838df:	4c 8d b4 24 c8 0e 00 	lea    r14,[rsp+0xec8]
 14838e6:	00 
 14838e7:	49 ff 84 24 98 01 00 	inc    QWORD PTR [r12+0x198]
 14838ee:	00 
 14838ef:	49 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [r12+0x110]
 14838f6:	00 
 14838f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14838fa:	ff 50 30             	call   QWORD PTR [rax+0x30]
 14838fd:	48 89 c3             	mov    rbx,rax
 1483900:	48 8d bc 24 b0 0e 00 	lea    rdi,[rsp+0xeb0]
 1483907:	00 
 1483908:	e8 93 b8 d6 ff       	call   11ef1a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34724>
--
 1485bb1:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 1485bb5:	48 8d b8 90 02 00 00 	lea    rdi,[rax+0x290]
 1485bbc:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
 1485bc3:	00 
 1485bc4:	e8 ab 7b a5 ff       	call   edd774 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4b8a>
 1485bc9:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 1485bd0:	00 
 1485bd1:	e8 a0 6e 78 ff       	call   c0ca76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x159a16>
 1485bd6:	80 bb d0 01 00 00 00 	cmp    BYTE PTR [rbx+0x1d0],0x0
 1485bdd:	74 21                	je     1485c00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb184>
 1485bdf:	4c 8d a3 b8 01 00 00 	lea    r12,[rbx+0x1b8]
 1485be6:	4c 89 e7             	mov    rdi,r12
 1485be9:	e8 64 ff 6b ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
 1485bee:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 1485bf5:	00 
 1485bf6:	4c 89 e6             	mov    rsi,r12
 1485bf9:	e8 a8 78 a5 ff       	call   edd4a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa48bc>
 1485bfe:	eb 14                	jmp    1485c14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb198>
 1485c00:	0f 57 c0             	xorps  xmm0,xmm0
 1485c03:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
 1485c0a:	00 
 1485c0b:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
 1485c12:	00 00 
 1485c14:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 1485c18:	48 8d b8 c8 03 00 00 	lea    rdi,[rax+0x3c8]
 1485c1f:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
 1485c26:	00 
 1485c27:	e8 48 7b a5 ff       	call   edd774 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4b8a>
 1485c2c:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
--
 148b6e4:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
 148b6eb:	00 
 148b6ec:	e8 31 42 61 ff       	call   a9f922 <JNI_OnUnload@@Base+0x271ef>
 148b6f1:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
 148b6f8:	00 
 148b6f9:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
 148b700:	00 
 148b701:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
 148b708:	00 
 148b709:	48 8d 04 d0          	lea    rax,[rax+rdx*8]
 148b70d:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
 148b714:	00 
 148b715:	bf f0 0f 00 00       	mov    edi,0xff0
 148b71a:	e8 e1 27 36 00       	call   17edf00 <_Znwm@plt>
 148b71f:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
 148b726:	00 
 148b727:	48 8d 8c 24 68 01 00 	lea    rcx,[rsp+0x168]
 148b72e:	00 
 148b72f:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
 148b736:	00 
 148b737:	48 c7 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],0xcc
 148b73e:	00 cc 00 00 00 
 148b743:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 148b74a:	00 
 148b74b:	48 89 df             	mov    rdi,rbx
 148b74e:	48 8d b4 24 98 00 00 	lea    rsi,[rsp+0x98]
 148b755:	00 
 148b756:	e8 07 41 b7 ff       	call   fff862 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c6c78>
 148b75b:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
--
 148b7cc:	48 89 8c 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rcx
 148b7d3:	00 
 148b7d4:	66 0f 11 84 24 40 01 	movupd XMMWORD PTR [rsp+0x140],xmm0
 148b7db:	00 00 
 148b7dd:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
 148b7e4:	00 
 148b7e5:	4c 89 bc 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r15
 148b7ec:	00 
 148b7ed:	66 0f 11 8c 24 50 01 	movupd XMMWORD PTR [rsp+0x150],xmm1
 148b7f4:	00 00 
 148b7f6:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
 148b7fd:	00 
 148b7fe:	48 8b 84 24 60 01 00 	mov    rax,QWORD PTR [rsp+0x160]
 148b805:	00 
 148b806:	4c 01 e0             	add    rax,r12
 148b809:	48 83 fe 08          	cmp    rsi,0x8
 148b80d:	6a 66                	push   0x66
 148b80f:	59                   	pop    rcx
 148b810:	48 0f 44 c1          	cmove  rax,rcx
 148b814:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
 148b81b:	00 
 148b81c:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 148b823:	00 
 148b824:	e8 a1 ea 5e ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 148b829:	48 89 df             	mov    rdi,rbx
 148b82c:	e8 6d 41 61 ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
 148b831:	e9 80 00 00 00       	jmp    148b8b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d0e3a>
 148b836:	bf f0 0f 00 00       	mov    edi,0xff0
 148b83b:	e8 c0 26 36 00       	call   17edf00 <_Znwm@plt>
--
 148b8cc:	b8 f0 0f 00 00       	mov    eax,0xff0
 148b8d1:	48 01 c2             	add    rdx,rax
 148b8d4:	45 29 f5             	sub    r13d,r14d
 148b8d7:	44 89 6a ec          	mov    DWORD PTR [rdx-0x14],r13d
 148b8db:	44 89 72 f0          	mov    DWORD PTR [rdx-0x10],r14d
 148b8df:	48 83 62 f4 00       	and    QWORD PTR [rdx-0xc],0x0
 148b8e4:	c6 42 fc 01          	mov    BYTE PTR [rdx-0x4],0x1
 148b8e8:	0f b7 84 24 a0 01 00 	movzx  eax,WORD PTR [rsp+0x1a0]
 148b8ef:	00 
 148b8f0:	66 89 42 fd          	mov    WORD PTR [rdx-0x3],ax
 148b8f4:	8a 84 24 a2 01 00 00 	mov    al,BYTE PTR [rsp+0x1a2]
 148b8fb:	88 42 ff             	mov    BYTE PTR [rdx-0x1],al
 148b8fe:	f3 0f 6f 84 24 60 01 	movdqu xmm0,XMMWORD PTR [rsp+0x160]
 148b905:	00 00 
 148b907:	66 0f d4 05 61 15 f0 	paddq  xmm0,XMMWORD PTR [rip+0xfffffffffef01561]        # 38ce70 <_ZTSSt12bad_any_cast@@Base-0x3358>
 148b90e:	fe 
 148b90f:	f3 0f 7f 84 24 60 01 	movdqu XMMWORD PTR [rsp+0x160],xmm0
 148b916:	00 00 
 148b918:	4c 8b bc 24 48 01 00 	mov    r15,QWORD PTR [rsp+0x148]
 148b91f:	00 
 148b920:	66 48 0f 7e c1       	movq   rcx,xmm0
 148b925:	48 89 c8             	mov    rax,rcx
 148b928:	31 d2                	xor    edx,edx
 148b92a:	49 f7 f4             	div    r12
 148b92d:	49 8b 04 c7          	mov    rax,QWORD PTR [r15+rax*8]
 148b931:	48 6b f2 14          	imul   rsi,rdx,0x14
 148b935:	44 8b 2c 30          	mov    r13d,DWORD PTR [rax+rsi*1]
 148b939:	45 85 ed             	test   r13d,r13d
 148b93c:	0f 8f d0 fc ff ff    	jg     148b612 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d0b96>
--
 148bbdd:	00 
 148bbde:	e8 3f 3d 61 ff       	call   a9f922 <JNI_OnUnload@@Base+0x271ef>
 148bbe3:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
 148bbea:	00 
 148bbeb:	49 01 c7             	add    r15,rax
 148bbee:	4c 89 bc 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r15
 148bbf5:	00 
 148bbf6:	4c 89 bc 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r15
 148bbfd:	00 
 148bbfe:	48 8d 04 d0          	lea    rax,[rax+rdx*8]
 148bc02:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
 148bc09:	00 
 148bc0a:	bf 00 10 00 00       	mov    edi,0x1000
 148bc0f:	e8 ec 22 36 00       	call   17edf00 <_Znwm@plt>
 148bc14:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
 148bc1b:	00 
 148bc1c:	48 8d 8c 24 98 01 00 	lea    rcx,[rsp+0x198]
 148bc23:	00 
 148bc24:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
 148bc2b:	00 
 148bc2c:	48 c7 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],0x100
 148bc33:	00 00 01 00 00 
 148bc38:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 148bc3f:	00 
 148bc40:	4c 89 ef             	mov    rdi,r13
 148bc43:	48 8d b4 24 98 00 00 	lea    rsi,[rsp+0x98]
 148bc4a:	00 
 148bc4b:	e8 12 3c b7 ff       	call   fff862 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c6c78>
 148bc50:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
--
 148c985:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
 148c98c:	00 
 148c98d:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
 148c994:	00 
 148c995:	48 89 ee             	mov    rsi,rbp
 148c998:	e8 c5 2e b7 ff       	call   fff862 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c6c78>
 148c99d:	49 ff cd             	dec    r13
 148c9a0:	75 d9                	jne    148c97b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1eff>
 148c9a2:	48 8b b4 24 b0 01 00 	mov    rsi,QWORD PTR [rsp+0x1b0]
 148c9a9:	00 
 148c9aa:	48 8b 94 24 b8 01 00 	mov    rdx,QWORD PTR [rsp+0x1b8]
 148c9b1:	00 
 148c9b2:	48 8b 8c 24 a0 01 00 	mov    rcx,QWORD PTR [rsp+0x1a0]
 148c9b9:	00 
 148c9ba:	4c 8b 8c 24 a8 01 00 	mov    r9,QWORD PTR [rsp+0x1a8]
 148c9c1:	00 
 148c9c2:	48 81 7c 24 30 00 01 	cmp    QWORD PTR [rsp+0x30],0x100
 148c9c9:	00 00 
 148c9cb:	0f 82 cb 01 00 00    	jb     148cb9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d2120>
 148c9d1:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]
 148c9d8:	00 
 148c9d9:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 148c9e0:	00 
 148c9e1:	49 8b ac 24 80 00 00 	mov    rbp,QWORD PTR [r12+0x80]
 148c9e8:	00 
 148c9e9:	48 39 d6             	cmp    rsi,rdx
 148c9ec:	0f 85 82 01 00 00    	jne    148cb74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d20f8>
 148c9f2:	4c 89 c8             	mov    rax,r9
 148c9f5:	48 29 c8             	sub    rax,rcx
--
 148ce03:	41 5c                	pop    r12
 148ce05:	41 5d                	pop    r13
 148ce07:	41 5e                	pop    r14
 148ce09:	41 5f                	pop    r15
 148ce0b:	5d                   	pop    rbp
 148ce0c:	c3                   	ret
 148ce0d:	49 89 c6             	mov    r14,rax
 148ce10:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 148ce15:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
 148ce1c:	00 
 148ce1d:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
 148ce24:	00 
 148ce25:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 148ce2a:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
 148ce31:	00 
 148ce32:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 148ce37:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
 148ce3e:	00 
 148ce3f:	e9 a5 00 00 00       	jmp    148cee9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d246d>
 148ce44:	49 89 c6             	mov    r14,rax
 148ce47:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
 148ce4e:	00 
 148ce4f:	e8 22 05 00 00       	call   148d376 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d28fa>
 148ce54:	e9 fd 00 00 00       	jmp    148cf56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d24da>
 148ce59:	eb 20                	jmp    148ce7b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d23ff>
 148ce5b:	e9 18 01 00 00       	jmp    148cf78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d24fc>
 148ce60:	49 89 c6             	mov    r14,rax
 148ce63:	e9 20 01 00 00       	jmp    148cf88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d250c>
 148ce68:	eb 28                	jmp    148ce92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d2416>
--
 1497b99:	f2 0f 59 0d 9f 75 ef 	mulsd  xmm1,QWORD PTR [rip+0xfffffffffeef759f]        # 38f140 <_ZTSSt12bad_any_cast@@Base-0x1088>
 1497ba0:	fe 
 1497ba1:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
 1497ba8:	00 
 1497ba9:	48 83 26 00          	and    QWORD PTR [rsi],0x0
 1497bad:	c6 84 24 d8 02 00 00 	mov    BYTE PTR [rsp+0x2d8],0x1
 1497bb4:	01 
 1497bb5:	f2 0f 11 4e 08       	movsd  QWORD PTR [rsi+0x8],xmm1
 1497bba:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
 1497bbe:	f2 0f 11 4e 18       	movsd  QWORD PTR [rsi+0x18],xmm1
 1497bc3:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
 1497bca:	00 
 1497bcb:	6a 02                	push   0x2
 1497bcd:	5a                   	pop    rdx
 1497bce:	e8 5f 0f ff ff       	call   1488b32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce0b6>
 1497bd3:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
 1497bda:	00 
 1497bdb:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
 1497be2:	00 
 1497be3:	e8 a0 27 ff ff       	call   148a388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf90c>
 1497be8:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
 1497bef:	00 
 1497bf0:	48 89 df             	mov    rdi,rbx
 1497bf3:	e8 ae 58 a4 ff       	call   edd4a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa48bc>
 1497bf8:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
 1497bff:	00 
 1497c00:	e9 0f ff ff ff       	jmp    1497b14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd098>
 1497c05:	83 fa 0d             	cmp    edx,0xd
 1497c08:	0f 84 4a 05 00 00    	je     1498158 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd6dc>
 1497c0e:	83 fa 10             	cmp    edx,0x10
 1497c11:	0f 84 cf 04 00 00    	je     14980e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd66a>
 1497c17:	83 fa 0f             	cmp    edx,0xf
 1497c1a:	0f 85 77 02 00 00    	jne    1497e97 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd41b>
 1497c20:	0f 57 c9             	xorps  xmm1,xmm1
 1497c23:	0f 29 8c 24 c0 02 00 	movaps XMMWORD PTR [rsp+0x2c0],xmm1
 1497c2a:	00 
 1497c2b:	48 83 a4 24 d0 02 00 	and    QWORD PTR [rsp+0x2d0],0x0
 1497c32:	00 00 
 1497c34:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
 1497c38:	f2 0f 10 0d 50 72 ef 	movsd  xmm1,QWORD PTR [rip+0xfffffffffeef7250]        # 38ee90 <_ZTSSt12bad_any_cast@@Base-0x1338>
 1497c3f:	fe 
 1497c40:	f2 0f 5e c8          	divsd  xmm1,xmm0
 1497c44:	f2 0f 59 0d f4 74 ef 	mulsd  xmm1,QWORD PTR [rip+0xfffffffffeef74f4]        # 38f140 <_ZTSSt12bad_any_cast@@Base-0x1088>
--
 1498646:	00 
 1498647:	e8 dc 30 5e ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 149864c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1498653:	00 
 1498654:	e9 df 00 00 00       	jmp    1498738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddcbc>
 1498659:	48 89 c3             	mov    rbx,rax
 149865c:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
 1498663:	00 
 1498664:	e9 cf 00 00 00       	jmp    1498738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddcbc>
 1498669:	48 89 c3             	mov    rbx,rax
 149866c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
 1498673:	00 
 1498674:	e9 bf 00 00 00       	jmp    1498738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddcbc>
 1498679:	eb 00                	jmp    149867b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddbff>
 149867b:	48 89 c3             	mov    rbx,rax
 149867e:	eb 2e                	jmp    14986ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc32>
 1498680:	eb 00                	jmp    1498682 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc06>
 1498682:	48 89 c3             	mov    rbx,rax
 1498685:	eb 34                	jmp    14986bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc3f>
 1498687:	eb 00                	jmp    1498689 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc0d>
 1498689:	48 89 c3             	mov    rbx,rax
 149868c:	eb 3a                	jmp    14986c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc4c>
 149868e:	eb 00                	jmp    1498690 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc14>
 1498690:	48 89 c3             	mov    rbx,rax
 1498693:	eb 40                	jmp    14986d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc59>
 1498695:	eb 00                	jmp    1498697 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc1b>
 1498697:	48 89 c3             	mov    rbx,rax
 149869a:	eb 46                	jmp    14986e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc66>
 149869c:	eb 63                	jmp    1498701 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc85>
--
 14a0eeb:	4c 89 ee             	mov    rsi,r13
 14a0eee:	e8 31 fb ff ff       	call   14a0a24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5fa8>
 14a0ef3:	41 8a 5e 40          	mov    bl,BYTE PTR [r14+0x40]
 14a0ef7:	41 8a 6e 38          	mov    bpl,BYTE PTR [r14+0x38]
 14a0efb:	4c 89 f7             	mov    rdi,r14
 14a0efe:	e8 a5 fa ff ff       	call   14a09a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5f2c>
 14a0f03:	84 db                	test   bl,bl
 14a0f05:	74 28                	je     14a0f2f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e64b3>
 14a0f07:	40 84 ed             	test   bpl,bpl
 14a0f0a:	74 23                	je     14a0f2f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e64b3>
 14a0f0c:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
 14a0f13:	00 
 14a0f14:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 14a0f19:	48 83 26 00          	and    QWORD PTR [rsi],0x0
 14a0f1d:	48 c7 46 08 01 00 00 	mov    QWORD PTR [rsi+0x8],0x1
 14a0f24:	00 
 14a0f25:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 14a0f2a:	e8 7d 88 fe ff       	call   14897ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ced30>
 14a0f2f:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
 14a0f34:	4c 89 f7             	mov    rdi,r14
 14a0f37:	4c 89 ee             	mov    rsi,r13
 14a0f3a:	e8 15 fb ff ff       	call   14a0a54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5fd8>
 14a0f3f:	41 8a 9e d0 00 00 00 	mov    bl,BYTE PTR [r14+0xd0]
 14a0f46:	41 8a ae c8 00 00 00 	mov    bpl,BYTE PTR [r14+0xc8]
 14a0f4d:	4c 89 f7             	mov    rdi,r14
 14a0f50:	e8 31 fb ff ff       	call   14a0a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e600a>
 14a0f55:	84 db                	test   bl,bl
 14a0f57:	0f 84 a0 00 00 00    	je     14a0ffd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e6581>
 14a0f5d:	40 84 ed             	test   bpl,bpl
--
 14a4017:	48 83 a7 f8 00 00 00 	and    QWORD PTR [rdi+0xf8],0x0
 14a401e:	00 
 14a401f:	83 a7 00 01 00 00 00 	and    DWORD PTR [rdi+0x100],0x0
 14a4026:	31 ed                	xor    ebp,ebp
 14a4028:	40 88 af 04 01 00 00 	mov    BYTE PTR [rdi+0x104],bpl
 14a402f:	40 88 af 08 01 00 00 	mov    BYTE PTR [rdi+0x108],bpl
 14a4036:	40 88 af 50 01 00 00 	mov    BYTE PTR [rdi+0x150],bpl
 14a403d:	40 88 af 8c 01 00 00 	mov    BYTE PTR [rdi+0x18c],bpl
 14a4044:	83 a7 ac 01 00 00 00 	and    DWORD PTR [rdi+0x1ac],0x0
 14a404b:	40 88 af b0 01 00 00 	mov    BYTE PTR [rdi+0x1b0],bpl
 14a4052:	40 88 af b8 01 00 00 	mov    BYTE PTR [rdi+0x1b8],bpl
 14a4059:	40 88 af 28 02 00 00 	mov    BYTE PTR [rdi+0x228],bpl
 14a4060:	40 88 af 30 02 00 00 	mov    BYTE PTR [rdi+0x230],bpl
 14a4067:	40 88 af 58 02 00 00 	mov    BYTE PTR [rdi+0x258],bpl
 14a406e:	40 88 af 70 02 00 00 	mov    BYTE PTR [rdi+0x270],bpl
 14a4075:	40 88 af b0 02 00 00 	mov    BYTE PTR [rdi+0x2b0],bpl
 14a407c:	66 83 a7 b8 02 00 00 	and    WORD PTR [rdi+0x2b8],0x0
 14a4083:	00 
 14a4084:	48 83 c7 70          	add    rdi,0x70
 14a4088:	40 88 ab ba 02 00 00 	mov    BYTE PTR [rbx+0x2ba],bpl
 14a408f:	40 88 ab c0 02 00 00 	mov    BYTE PTR [rbx+0x2c0],bpl
 14a4096:	40 88 ab d8 02 00 00 	mov    BYTE PTR [rbx+0x2d8],bpl
 14a409d:	ba 83 00 00 00       	mov    edx,0x83
 14a40a2:	31 f6                	xor    esi,esi
 14a40a4:	e8 e7 aa 34 00       	call   17eeb90 <memset@plt>
 14a40a9:	48 83 a3 0c 01 00 00 	and    QWORD PTR [rbx+0x10c],0x0
 14a40b0:	00 
 14a40b1:	83 a3 13 01 00 00 00 	and    DWORD PTR [rbx+0x113],0x0
 14a40b8:	0f 57 c0             	xorps  xmm0,xmm0
--
 14a4116:	53                   	push   rbx
 14a4117:	48 89 fb             	mov    rbx,rdi
 14a411a:	48 81 c7 90 02 00 00 	add    rdi,0x290
 14a4121:	e8 8c 4f 94 ff       	call   de90b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb6138>
 14a4126:	48 8d bb 78 02 00 00 	lea    rdi,[rbx+0x278]
 14a412d:	e8 5e 9d 34 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14a4132:	48 8d bb 58 02 00 00 	lea    rdi,[rbx+0x258]
 14a4139:	e8 f2 2b 60 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 14a413e:	48 8d bb 38 02 00 00 	lea    rdi,[rbx+0x238]
 14a4145:	e8 46 9d 34 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14a414a:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
 14a4151:	e8 88 eb 94 ff       	call   df2cde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbfd64>
 14a4156:	48 8d bb 90 01 00 00 	lea    rdi,[rbx+0x190]
 14a415d:	e8 c6 75 5d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 14a4162:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
 14a4169:	e8 86 00 00 00       	call   14a41f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e9778>
 14a416e:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
 14a4175:	e8 16 9d 34 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14a417a:	48 8d bb 30 01 00 00 	lea    rdi,[rbx+0x130]
 14a4181:	e8 56 74 5d ff       	call   a7b5dc <JNI_OnUnload@@Base+0x2ea9>
 14a4186:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
 14a418d:	e8 56 74 5d ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 14a4192:	48 8d bb d0 00 00 00 	lea    rdi,[rbx+0xd0]
 14a4199:	e8 f2 9c 34 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14a419e:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
 14a41a5:	e8 e6 9c 34 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14a41aa:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 14a41b1:	e8 da 9c 34 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14a41b6:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
--
 14b9c0e:	00 
 14b9c0f:	48 85 c0             	test   rax,rax
 14b9c12:	74 05                	je     14b9c19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ff19d>
 14b9c14:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 14b9c19:	4c 8d b4 24 10 02 00 	lea    r14,[rsp+0x210]
 14b9c20:	00 
 14b9c21:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 14b9c28:	00 
 14b9c29:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 14b9c2d:	49 8b 86 a8 01 00 00 	mov    rax,QWORD PTR [r14+0x1a8]
 14b9c34:	49 89 87 b8 01 00 00 	mov    QWORD PTR [r15+0x1b8],rax
 14b9c3b:	4c 8d a4 24 c0 03 00 	lea    r12,[rsp+0x3c0]
 14b9c42:	00 
 14b9c43:	4d 89 7c 24 20       	mov    QWORD PTR [r12+0x20],r15
 14b9c48:	e8 7d 06 5c ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 14b9c4d:	4c 8d 7c 24 78       	lea    r15,[rsp+0x78]
 14b9c52:	4c 8d ac 24 00 06 00 	lea    r13,[rsp+0x600]
 14b9c59:	00 
 14b9c5a:	48 89 df             	mov    rdi,rbx
 14b9c5d:	4c 89 fe             	mov    rsi,r15
 14b9c60:	4c 89 ea             	mov    rdx,r13
 14b9c63:	4c 89 e1             	mov    rcx,r12
 14b9c66:	e8 db e4 6c ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
 14b9c6b:	4c 89 e7             	mov    rdi,r12
 14b9c6e:	e8 f7 02 5c ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 14b9c73:	4c 89 f7             	mov    rdi,r14
 14b9c76:	e8 99 11 00 00       	call   14bae14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x300398>
 14b9c7b:	4c 89 ef             	mov    rdi,r13
 14b9c7e:	e8 e7 02 5c ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
--
 14ba573:	49 8b 8e a8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1a8]
 14ba57a:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
 14ba57e:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
 14ba582:	48 89 e7             	mov    rdi,rsp
 14ba585:	e8 d0 d5 ff ff       	call   14b7b5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd0de>
 14ba58a:	49 8b 8e b0 01 00 00 	mov    rcx,QWORD PTR [r14+0x1b0]
 14ba591:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
 14ba595:	80 48 10 04          	or     BYTE PTR [rax+0x10],0x4
 14ba599:	48 89 e7             	mov    rdi,rsp
 14ba59c:	e8 e9 d5 ff ff       	call   14b7b8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd10e>
 14ba5a1:	49 8b 8e b8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1b8]
 14ba5a8:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
 14ba5ac:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
 14ba5b0:	48 89 e7             	mov    rdi,rsp
 14ba5b3:	e8 d2 d5 ff ff       	call   14b7b8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd10e>
 14ba5b8:	49 8b 8e c0 01 00 00 	mov    rcx,QWORD PTR [r14+0x1c0]
 14ba5bf:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
 14ba5c3:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
 14ba5c7:	48 89 e7             	mov    rdi,rsp
 14ba5ca:	e8 bb d5 ff ff       	call   14b7b8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd10e>
 14ba5cf:	49 8b 8e c8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1c8]
 14ba5d6:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
 14ba5da:	80 48 10 04          	or     BYTE PTR [rax+0x10],0x4
 14ba5de:	48 89 e7             	mov    rdi,rsp
 14ba5e1:	e8 d4 d5 ff ff       	call   14b7bba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd13e>
 14ba5e6:	49 8b 8e d0 01 00 00 	mov    rcx,QWORD PTR [r14+0x1d0]
 14ba5ed:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
 14ba5f1:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
 14ba5f5:	49 89 e7             	mov    r15,rsp
--
 14babed:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 14babf0:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 14babf5:	49 89 85 b0 01 00 00 	mov    QWORD PTR [r13+0x1b0],rax
 14babfc:	0f 10 44 24 58       	movups xmm0,XMMWORD PTR [rsp+0x58]
 14bac01:	41 0f 11 85 a0 01 00 	movups XMMWORD PTR [r13+0x1a0],xmm0
 14bac08:	00 
 14bac09:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
 14bac10:	00 
 14bac11:	49 89 85 c8 01 00 00 	mov    QWORD PTR [r13+0x1c8],rax
 14bac18:	0f 10 44 24 70       	movups xmm0,XMMWORD PTR [rsp+0x70]
 14bac1d:	41 0f 11 85 b8 01 00 	movups XMMWORD PTR [r13+0x1b8],xmm0
 14bac24:	00 
 14bac25:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
 14bac2c:	00 
 14bac2d:	49 89 85 e0 01 00 00 	mov    QWORD PTR [r13+0x1e0],rax
 14bac34:	0f 10 84 24 88 00 00 	movups xmm0,XMMWORD PTR [rsp+0x88]
 14bac3b:	00 
 14bac3c:	41 0f 11 85 d0 01 00 	movups XMMWORD PTR [r13+0x1d0],xmm0
 14bac43:	00 
 14bac44:	0f 10 84 24 a0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xa0]
 14bac4b:	00 
 14bac4c:	41 0f 11 85 e8 01 00 	movups XMMWORD PTR [r13+0x1e8],xmm0
 14bac53:	00 
 14bac54:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
 14bac5b:	00 
 14bac5c:	49 89 85 f8 01 00 00 	mov    QWORD PTR [r13+0x1f8],rax
 14bac63:	e9 a2 00 00 00       	jmp    14bad0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30028e>
 14bac68:	84 c0                	test   al,al
 14bac6a:	74 12                	je     14bac7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x300202>
--
 14bac8c:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 14bac8f:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
 14bac94:	49 89 85 b0 01 00 00 	mov    QWORD PTR [r13+0x1b0],rax
 14bac9b:	0f 10 44 24 58       	movups xmm0,XMMWORD PTR [rsp+0x58]
 14baca0:	41 0f 11 85 a0 01 00 	movups XMMWORD PTR [r13+0x1a0],xmm0
 14baca7:	00 
 14baca8:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
 14bacaf:	00 
 14bacb0:	49 89 85 c8 01 00 00 	mov    QWORD PTR [r13+0x1c8],rax
 14bacb7:	0f 10 44 24 70       	movups xmm0,XMMWORD PTR [rsp+0x70]
 14bacbc:	41 0f 11 85 b8 01 00 	movups XMMWORD PTR [r13+0x1b8],xmm0
 14bacc3:	00 
 14bacc4:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
 14baccb:	00 
 14baccc:	49 89 85 e0 01 00 00 	mov    QWORD PTR [r13+0x1e0],rax
 14bacd3:	0f 10 84 24 88 00 00 	movups xmm0,XMMWORD PTR [rsp+0x88]
 14bacda:	00 
 14bacdb:	41 0f 11 85 d0 01 00 	movups XMMWORD PTR [r13+0x1d0],xmm0
 14bace2:	00 
 14bace3:	0f 10 84 24 a0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xa0]
 14bacea:	00 
 14baceb:	41 0f 11 85 e8 01 00 	movups XMMWORD PTR [r13+0x1e8],xmm0
 14bacf2:	00 
 14bacf3:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
 14bacfa:	00 
 14bacfb:	49 89 85 f8 01 00 00 	mov    QWORD PTR [r13+0x1f8],rax
 14bad02:	41 c6 85 00 02 00 00 	mov    BYTE PTR [r13+0x200],0x1
 14bad09:	01 
 14bad0a:	48 83 c5 10          	add    rbp,0x10
--
 14bb074:	4c 8b 6e 10          	mov    r13,QWORD PTR [rsi+0x10]
 14bb078:	4c 8b 66 18          	mov    r12,QWORD PTR [rsi+0x18]
 14bb07c:	bf 40 03 00 00       	mov    edi,0x340
 14bb081:	e8 7a 2e 33 00       	call   17edf00 <_Znwm@plt>
 14bb086:	48 89 c3             	mov    rbx,rax
 14bb089:	66 0f ef c0          	pxor   xmm0,xmm0
 14bb08d:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 14bb092:	48 8d 05 2f fd 34 00 	lea    rax,[rip+0x34fd2f]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
 14bb099:	48 89 03             	mov    QWORD PTR [rbx],rax
 14bb09c:	41 8b af a0 01 00 00 	mov    ebp,DWORD PTR [r15+0x1a0]
 14bb0a3:	49 8b 87 b8 01 00 00 	mov    rax,QWORD PTR [r15+0x1b8]
 14bb0aa:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
 14bb0b1:	00 
 14bb0b2:	48 8d 35 4b 65 ec fe 	lea    rsi,[rip+0xfffffffffeec654b]        # 381604 <_ZTSSt12bad_any_cast@@Base-0xebc4>
 14bb0b9:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 14bb0c0:	00 
 14bb0c1:	e8 b8 e9 5b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14bb0c6:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
 14bb0cb:	4c 89 b4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r14
 14bb0d2:	00 
 14bb0d3:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
 14bb0d7:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
 14bb0de:	00 
 14bb0df:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
 14bb0e4:	e8 09 b9 a0 ff       	call   ec69f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de08>
 14bb0e9:	4d 8d af 98 00 00 00 	lea    r13,[r15+0x98]
 14bb0f0:	4d 8d b7 00 01 00 00 	lea    r14,[r15+0x100]
 14bb0f7:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
 14bb0fe:	00 
--
 14bc70c:	49 89 07             	mov    QWORD PTR [r15],rax
 14bc70f:	4d 89 77 08          	mov    QWORD PTR [r15+0x8],r14
 14bc713:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
 14bc717:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
 14bc71b:	45 8a ae 70 01 00 00 	mov    r13b,BYTE PTR [r14+0x170]
 14bc722:	48 8d bc 24 b0 09 00 	lea    rdi,[rsp+0x9b0]
 14bc729:	00 
 14bc72a:	e8 61 db 5b ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 14bc72f:	49 81 c4 98 0d 00 00 	add    r12,0xd98
 14bc736:	49 8d 7e 58          	lea    rdi,[r14+0x58]
 14bc73a:	4d 8d 96 b8 01 00 00 	lea    r10,[r14+0x1b8]
 14bc741:	49 8d 86 28 02 00 00 	lea    rax,[r14+0x228]
 14bc748:	45 8b 9e b0 01 00 00 	mov    r11d,DWORD PTR [r14+0x1b0]
 14bc74f:	41 8b ae b4 01 00 00 	mov    ebp,DWORD PTR [r14+0x1b4]
 14bc756:	49 81 c6 40 02 00 00 	add    r14,0x240
 14bc75d:	45 0f b6 ed          	movzx  r13d,r13b
 14bc761:	6a 04                	push   0x4
 14bc763:	59                   	pop    rcx
 14bc764:	4c 8d 84 24 f0 04 00 	lea    r8,[rsp+0x4f0]
 14bc76b:	00 
 14bc76c:	4c 89 e6             	mov    rsi,r12
 14bc76f:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
 14bc774:	4c 8b 4c 24 20       	mov    r9,QWORD PTR [rsp+0x20]
 14bc779:	41 56                	push   r14
 14bc77b:	55                   	push   rbp
 14bc77c:	41 53                	push   r11
 14bc77e:	4c 8d 9c 24 c8 09 00 	lea    r11,[rsp+0x9c8]
 14bc785:	00 
 14bc786:	41 53                	push   r11
--
 14bd5e7:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 14bd5ee:	00 
 14bd5ef:	e8 9c 08 33 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14bd5f4:	45 84 ff             	test   r15b,r15b
 14bd5f7:	0f 84 98 00 00 00    	je     14bd695 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x302c19>
 14bd5fd:	40 b5 01             	mov    bpl,0x1
 14bd600:	45 84 f6             	test   r14b,r14b
 14bd603:	75 17                	jne    14bd61c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x302ba0>
 14bd605:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 14bd609:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14bd60c:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
 14bd612:	84 c0                	test   al,al
 14bd614:	0f 85 80 00 00 00    	jne    14bd69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x302c1e>
 14bd61a:	31 ed                	xor    ebp,ebp
 14bd61c:	48 8d 05 73 e2 1a 00 	lea    rax,[rip+0x1ae273]        # 166b896 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa02>
 14bd623:	48 89 84 24 60 09 00 	mov    QWORD PTR [rsp+0x960],rax
 14bd62a:	00 
 14bd62b:	48 83 a4 24 68 09 00 	and    QWORD PTR [rsp+0x968],0x0
 14bd632:	00 00 
 14bd634:	48 8d 35 0e 73 ec fe 	lea    rsi,[rip+0xfffffffffeec730e]        # 384949 <_ZTSSt12bad_any_cast@@Base-0xb87f>
 14bd63b:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
 14bd642:	00 
 14bd643:	e8 36 c4 5b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14bd648:	48 8d 35 1b 10 eb fe 	lea    rsi,[rip+0xfffffffffeeb101b]        # 36e66a <_ZTSSt12bad_any_cast@@Base-0x21b5e>
 14bd64f:	48 8d bc 24 b0 09 00 	lea    rdi,[rsp+0x9b0]
 14bd656:	00 
 14bd657:	e8 22 c4 5b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 14bd65c:	48 8d b4 24 60 09 00 	lea    rsi,[rsp+0x960]
 14bd663:	00 
--
 14bdb73:	4c 89 6d 08          	mov    QWORD PTR [rbp+0x8],r13
 14bdb77:	4c 89 65 10          	mov    QWORD PTR [rbp+0x10],r12
 14bdb7b:	48 89 6d 20          	mov    QWORD PTR [rbp+0x20],rbp
 14bdb7f:	41 8a 9d 70 01 00 00 	mov    bl,BYTE PTR [r13+0x170]
 14bdb86:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
 14bdb8b:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
 14bdb8f:	e8 fc c6 5b ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 14bdb94:	49 8d b4 24 98 0d 00 	lea    rsi,[r12+0xd98]
 14bdb9b:	00 
 14bdb9c:	49 8d 7d 58          	lea    rdi,[r13+0x58]
 14bdba0:	49 8d 85 b8 01 00 00 	lea    rax,[r13+0x1b8]
 14bdba7:	49 8d 8d 28 02 00 00 	lea    rcx,[r13+0x228]
 14bdbae:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
 14bdbb2:	45 8b 9d b0 01 00 00 	mov    r11d,DWORD PTR [r13+0x1b0]
 14bdbb9:	45 8b 95 b4 01 00 00 	mov    r10d,DWORD PTR [r13+0x1b4]
 14bdbc0:	49 81 c5 40 02 00 00 	add    r13,0x240
 14bdbc7:	0f b6 db             	movzx  ebx,bl
 14bdbca:	4c 8d 44 24 78       	lea    r8,[rsp+0x78]
 14bdbcf:	4c 89 f2             	mov    rdx,r14
 14bdbd2:	31 c9                	xor    ecx,ecx
 14bdbd4:	4c 8b 4c 24 08       	mov    r9,QWORD PTR [rsp+0x8]
 14bdbd9:	41 55                	push   r13
 14bdbdb:	41 52                	push   r10
 14bdbdd:	41 53                	push   r11
 14bdbdf:	4c 8d 54 24 28       	lea    r10,[rsp+0x28]
 14bdbe4:	41 52                	push   r10
 14bdbe6:	53                   	push   rbx
 14bdbe7:	50                   	push   rax
 14bdbe8:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
--
 14c21fc:	c6 83 70 01 00 00 00 	mov    BYTE PTR [rbx+0x170],0x0
 14c2203:	48 8d ab 80 01 00 00 	lea    rbp,[rbx+0x180]
 14c220a:	48 89 ef             	mov    rdi,rbp
 14c220d:	e8 7e 80 5b ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 14c2212:	8b 84 24 80 00 00 00 	mov    eax,DWORD PTR [rsp+0x80]
 14c2219:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]
 14c221e:	4c 8b 74 24 58       	mov    r14,QWORD PTR [rsp+0x58]
 14c2223:	89 83 b0 01 00 00    	mov    DWORD PTR [rbx+0x1b0],eax
 14c2229:	83 a3 b4 01 00 00 00 	and    DWORD PTR [rbx+0x1b4],0x0
 14c2230:	48 8b 01             	mov    rax,QWORD PTR [rcx]
 14c2233:	48 89 83 b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],rax
 14c223a:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
 14c223e:	48 89 83 c0 01 00 00 	mov    QWORD PTR [rbx+0x1c0],rax
 14c2245:	48 85 c0             	test   rax,rax
 14c2248:	74 05                	je     14c224f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3077d3>
 14c224a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 14c224f:	0f 57 c0             	xorps  xmm0,xmm0
 14c2252:	0f 11 83 c8 01 00 00 	movups XMMWORD PTR [rbx+0x1c8],xmm0
 14c2259:	48 83 a3 d8 01 00 00 	and    QWORD PTR [rbx+0x1d8],0x0
 14c2260:	00 
 14c2261:	4c 8d bb e0 01 00 00 	lea    r15,[rbx+0x1e0]
 14c2268:	4c 89 ff             	mov    rdi,r15
 14c226b:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 14c2270:	e8 21 79 1b 00       	call   1679b96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd02>
 14c2275:	4c 89 ff             	mov    rdi,r15
 14c2278:	e8 b9 79 1b 00       	call   1679c36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dda2>
 14c227d:	48 8d bb f0 01 00 00 	lea    rdi,[rbx+0x1f0]
 14c2284:	4c 89 f6             	mov    rsi,r14
 14c2287:	4c 89 e2             	mov    rdx,r12
--
 14c5bef:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 14c5bf3:	0f 11 45 08          	movups XMMWORD PTR [rbp+0x8],xmm0
 14c5bf7:	48 89 6d 20          	mov    QWORD PTR [rbp+0x20],rbp
 14c5bfb:	41 8a 9d 70 01 00 00 	mov    bl,BYTE PTR [r13+0x170]
 14c5c02:	49 8d b5 80 01 00 00 	lea    rsi,[r13+0x180]
 14c5c09:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
 14c5c10:	00 
 14c5c11:	e8 7a 46 5b ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 14c5c16:	49 81 c4 98 0d 00 00 	add    r12,0xd98
 14c5c1d:	49 8d 7d 58          	lea    rdi,[r13+0x58]
 14c5c21:	4d 8d 95 b8 01 00 00 	lea    r10,[r13+0x1b8]
 14c5c28:	49 8d 85 28 02 00 00 	lea    rax,[r13+0x228]
 14c5c2f:	45 8b 9d b0 01 00 00 	mov    r11d,DWORD PTR [r13+0x1b0]
 14c5c36:	45 8b b5 b4 01 00 00 	mov    r14d,DWORD PTR [r13+0x1b4]
 14c5c3d:	49 81 c5 40 02 00 00 	add    r13,0x240
 14c5c44:	0f b6 db             	movzx  ebx,bl
 14c5c47:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
 14c5c4c:	4c 8d 84 24 38 05 00 	lea    r8,[rsp+0x538]
 14c5c53:	00 
 14c5c54:	4c 89 e6             	mov    rsi,r12
 14c5c57:	8b 4c 24 0c          	mov    ecx,DWORD PTR [rsp+0xc]
 14c5c5b:	4d 89 f9             	mov    r9,r15
 14c5c5e:	41 55                	push   r13
 14c5c60:	41 56                	push   r14
 14c5c62:	41 53                	push   r11
 14c5c64:	4c 8d 9c 24 e8 04 00 	lea    r11,[rsp+0x4e8]
 14c5c6b:	00 
 14c5c6c:	41 53                	push   r11
 14c5c6e:	53                   	push   rbx
--
 14cf1d8:	8a 84 24 b0 02 00 00 	mov    al,BYTE PTR [rsp+0x2b0]
 14cf1df:	41 88 85 90 01 00 00 	mov    BYTE PTR [r13+0x190],al
 14cf1e6:	49 8d bd 98 01 00 00 	lea    rdi,[r13+0x198]
 14cf1ed:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
 14cf1f2:	48 8d b4 24 b8 02 00 	lea    rsi,[rsp+0x2b8]
 14cf1f9:	00 
 14cf1fa:	e8 41 ed 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 14cf1ff:	8a 84 24 d0 02 00 00 	mov    al,BYTE PTR [rsp+0x2d0]
 14cf206:	41 88 85 b0 01 00 00 	mov    BYTE PTR [r13+0x1b0],al
 14cf20d:	31 c0                	xor    eax,eax
 14cf20f:	41 88 85 b8 01 00 00 	mov    BYTE PTR [r13+0x1b8],al
 14cf216:	41 88 85 c0 01 00 00 	mov    BYTE PTR [r13+0x1c0],al
 14cf21d:	41 88 85 f0 01 00 00 	mov    BYTE PTR [r13+0x1f0],al
 14cf224:	4d 8d b5 f8 01 00 00 	lea    r14,[r13+0x1f8]
 14cf22b:	4c 89 f7             	mov    rdi,r14
 14cf22e:	e8 cf ab 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
 14cf233:	49 8d 9d 50 02 00 00 	lea    rbx,[r13+0x250]
 14cf23a:	48 89 df             	mov    rdi,rbx
 14cf23d:	e8 c0 ab 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
 14cf242:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
 14cf249:	00 
 14cf24a:	e8 1b 9b 5d ff       	call   aa8d6a <JNI_OnUnload@@Base+0x30637>
 14cf24f:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
 14cf256:	00 
 14cf257:	e8 b4 ee 31 00       	call   17ee110 <_ZNSt6__ndk113random_deviceclEv@plt>
 14cf25c:	49 8d bd a8 02 00 00 	lea    rdi,[r13+0x2a8]
 14cf263:	89 c6                	mov    esi,eax
 14cf265:	e8 3c 38 62 ff       	call   af2aa6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fa46>
 14cf26a:	48 8d 9c 24 a0 03 00 	lea    rbx,[rsp+0x3a0]
--
 14cf5a8:	0f 85 2c 01 00 00    	jne    14cf6da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c5e>
 14cf5ae:	48 8b 84 24 b8 03 00 	mov    rax,QWORD PTR [rsp+0x3b8]
 14cf5b5:	00 
 14cf5b6:	48 85 c0             	test   rax,rax
 14cf5b9:	48 8d 35 08 a5 46 00 	lea    rsi,[rip+0x46a508]        # 1939ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x2710>
 14cf5c0:	48 0f 45 f0          	cmovne rsi,rax
 14cf5c4:	83 7e 20 00          	cmp    DWORD PTR [rsi+0x20],0x0
 14cf5c8:	0f 84 0c 01 00 00    	je     14cf6da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c5e>
 14cf5ce:	4c 89 ef             	mov    rdi,r13
 14cf5d1:	e8 ac 48 03 00       	call   1503e82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349406>
 14cf5d6:	41 c6 85 b8 01 00 00 	mov    BYTE PTR [r13+0x1b8],0x1
 14cf5dd:	01 
 14cf5de:	e8 6d eb 31 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
 14cf5e3:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 14cf5e8:	e8 73 eb 31 00       	call   17ee160 <_ZNSt6__ndk16chrono12steady_clock3nowEv@plt>
 14cf5ed:	49 89 c6             	mov    r14,rax
 14cf5f0:	e8 5b eb 31 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
 14cf5f5:	48 89 c5             	mov    rbp,rax
 14cf5f8:	48 8d 35 7d 29 f8 fe 	lea    rsi,[rip+0xfffffffffef8297d]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 14cf5ff:	48 8d 0d bc 61 e5 fe 	lea    rcx,[rip+0xfffffffffee561bc]        # 3257c2 <_ZTSSt12bad_any_cast@@Base-0x6aa06>
 14cf606:	6a 04                	push   0x4
 14cf608:	5f                   	pop    rdi
 14cf609:	6a 6d                	push   0x6d
 14cf60b:	5a                   	pop    rdx
 14cf60c:	31 c0                	xor    eax,eax
 14cf60e:	e8 bf 72 30 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
 14cf613:	49 8b 5d 48          	mov    rbx,QWORD PTR [r13+0x48]
 14cf617:	41 0f 10 45 08       	movups xmm0,XMMWORD PTR [r13+0x8]
 14cf61c:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
--
 14d20ba:	48 89 ef             	mov    rdi,rbp
 14d20bd:	e8 7e be 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 14d20c2:	4d 8d 7c 24 20       	lea    r15,[r12+0x20]
 14d20c7:	66 0f ef c0          	pxor   xmm0,xmm0
 14d20cb:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0x1e8],xmm0
 14d20d2:	01 00 00 
 14d20d5:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0x1d8],xmm0
 14d20dc:	01 00 00 
 14d20df:	f3 41 0f 7f 84 24 c8 	movdqu XMMWORD PTR [r12+0x1c8],xmm0
 14d20e6:	01 00 00 
 14d20e9:	f3 41 0f 7f 84 24 b8 	movdqu XMMWORD PTR [r12+0x1b8],xmm0
 14d20f0:	01 00 00 
 14d20f3:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]
 14d20f8:	4c 8d 84 24 10 02 00 	lea    r8,[rsp+0x210]
 14d20ff:	00 
 14d2100:	4d 89 38             	mov    QWORD PTR [r8],r15
 14d2103:	48 8d 35 87 af 5c ff 	lea    rsi,[rip+0xffffffffff5caf87]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 14d210a:	48 8d 0d 1b 24 02 00 	lea    rcx,[rip+0x2241b]        # 14f452c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339ab0>
 14d2111:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
 14d2118:	00 
 14d2119:	6a 08                	push   0x8
 14d211b:	41 59                	pop    r9
 14d211d:	4c 89 ef             	mov    rdi,r13
 14d2120:	31 d2                	xor    edx,edx
 14d2122:	e8 6d 86 30 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 14d2127:	49 8b 06             	mov    rax,QWORD PTR [r14]
 14d212a:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
 14d2131:	00 
 14d2132:	4c 89 f6             	mov    rsi,r14
--
 14d31e0:	e8 37 b2 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
 14d31e5:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
 14d31ea:	49 8d be c0 01 00 00 	lea    rdi,[r14+0x1c0]
 14d31f1:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
 14d31f8:	00 
 14d31f9:	48 89 de             	mov    rsi,rbx
 14d31fc:	e8 1b 66 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 14d3201:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 14d3205:	e8 7c b2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14d320a:	8a 84 24 98 00 00 00 	mov    al,BYTE PTR [rsp+0x98]
 14d3211:	41 88 86 b8 01 00 00 	mov    BYTE PTR [r14+0x1b8],al
 14d3218:	bf 80 00 00 00       	mov    edi,0x80
 14d321d:	e8 de ac 31 00       	call   17edf00 <_Znwm@plt>
 14d3222:	49 89 c6             	mov    r14,rax
 14d3225:	66 0f ef c0          	pxor   xmm0,xmm0
 14d3229:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 14d322e:	48 8d 05 33 a2 32 00 	lea    rax,[rip+0x32a233]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
 14d3235:	49 89 06             	mov    QWORD PTR [r14],rax
 14d3238:	48 8d 05 79 66 3a 00 	lea    rax,[rip+0x3a6679]        # 18798b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35fa0>
 14d323f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 14d3243:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
 14d3248:	48 8b 81 98 00 00 00 	mov    rax,QWORD PTR [rcx+0x98]
 14d324f:	0f 10 81 90 00 00 00 	movups xmm0,XMMWORD PTR [rcx+0x90]
 14d3256:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
 14d325b:	48 85 c0             	test   rax,rax
 14d325e:	74 05                	je     14d3265 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3187e9>
 14d3260:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 14d3265:	4d 89 66 30          	mov    QWORD PTR [r14+0x30],r12
 14d3269:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
--
 14d3d31:	4c 89 ff             	mov    rdi,r15
 14d3d34:	e8 e3 a6 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
 14d3d39:	e9 ae 0c 00 00       	jmp    14d49ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319f70>
 14d3d3e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 14d3d43:	e9 a4 0c 00 00       	jmp    14d49ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319f70>
 14d3d48:	eb 00                	jmp    14d3d4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3192ce>
 14d3d4a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 14d3d4f:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
 14d3d56:	00 
 14d3d57:	e8 8c 6a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 14d3d5c:	4d 8d b4 24 b8 01 00 	lea    r14,[r12+0x1b8]
 14d3d63:	00 
 14d3d64:	4c 89 e7             	mov    rdi,r12
 14d3d67:	48 81 c7 f0 01 00 00 	add    rdi,0x1f0
 14d3d6e:	e8 23 09 02 00       	call   14f4696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339c1a>
 14d3d73:	49 8b bc 24 e8 01 00 	mov    rdi,QWORD PTR [r12+0x1e8]
 14d3d7a:	00 
 14d3d7b:	e8 06 a7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14d3d80:	49 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [r12+0x1d8]
 14d3d87:	00 
 14d3d88:	e8 f9 a6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14d3d8d:	4c 89 f7             	mov    rdi,r14
 14d3d90:	e8 fb a0 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14d3d95:	48 89 ef             	mov    rdi,rbp
 14d3d98:	e8 f3 a0 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14d3d9d:	eb 05                	jmp    14d3da4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319328>
 14d3d9f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 14d3da4:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
 14d3dab:	00 
--
 14dcba4:	41 56                	push   r14
 14dcba6:	53                   	push   rbx
 14dcba7:	48 83 ec 70          	sub    rsp,0x70
 14dcbab:	49 89 f6             	mov    r14,rsi
 14dcbae:	48 89 fb             	mov    rbx,rdi
 14dcbb1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14dcbb8:	00 00 
 14dcbba:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
 14dcbbf:	48 8b 7f 58          	mov    rdi,QWORD PTR [rdi+0x58]
 14dcbc3:	e8 22 01 00 00       	call   14dccea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32226e>
 14dcbc8:	80 bb b8 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b8],0x0
 14dcbcf:	0f 85 9d 00 00 00    	jne    14dcc72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3221f6>
 14dcbd5:	49 89 e7             	mov    r15,rsp
 14dcbd8:	4c 89 ff             	mov    rdi,r15
 14dcbdb:	4c 89 f6             	mov    rsi,r14
 14dcbde:	e8 bd 1a 31 00       	call   17ee6a0 <_ZNSt6__ndk19to_stringEx@plt>
 14dcbe3:	48 8d 35 89 b7 e9 fe 	lea    rsi,[rip+0xfffffffffee9b789]        # 378373 <_ZTSSt12bad_any_cast@@Base-0x17e55>
 14dcbea:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 14dcbef:	4c 89 fa             	mov    rdx,r15
 14dcbf2:	e8 a2 91 5d ff       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
 14dcbf7:	48 8d 15 62 d6 e7 fe 	lea    rdx,[rip+0xfffffffffee7d662]        # 35a260 <_ZTSSt12bad_any_cast@@Base-0x35f68>
 14dcbfe:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 14dcc03:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
 14dcc08:	e8 30 e8 5b ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
 14dcc0d:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
 14dcc12:	4c 89 f7             	mov    rdi,r14
 14dcc15:	e8 76 12 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14dcc1a:	48 89 e7             	mov    rdi,rsp
 14dcc1d:	e8 6e 12 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
--
 14dcdd0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14dcdd7:	00 00 
 14dcdd9:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
 14dcdde:	75 08                	jne    14dcde8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32236c>
 14dcde0:	48 89 df             	mov    rdi,rbx
 14dcde3:	e8 e8 2e 59 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 14dcde8:	e8 c3 2c 31 00       	call   17efab0 <__stack_chk_fail@plt>
 14dcded:	cc                   	int3
 14dcdee:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 14dcdf1:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
 14dcdf8:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
 14dcdff:	48 81 c7 60 01 00 00 	add    rdi,0x160
 14dce06:	e9 9d bc 64 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 14dce0b:	cc                   	int3
 14dce0c:	49 89 f0             	mov    r8,rsi
 14dce0f:	48 8d 35 7b 02 5c ff 	lea    rsi,[rip+0xffffffffff5c027b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 14dce16:	48 8d 0d 0b 00 00 00 	lea    rcx,[rip+0xb]        # 14dce28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3223ac>
 14dce1d:	6a 08                	push   0x8
 14dce1f:	41 59                	pop    r9
 14dce21:	31 d2                	xor    edx,edx
 14dce23:	e9 6c d9 2f 00       	jmp    17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 14dce28:	55                   	push   rbp
 14dce29:	41 57                	push   r15
 14dce2b:	41 56                	push   r14
 14dce2d:	41 55                	push   r13
 14dce2f:	41 54                	push   r12
 14dce31:	53                   	push   rbx
 14dce32:	48 81 ec 68 02 00 00 	sub    rsp,0x268
 14dce39:	48 89 d3             	mov    rbx,rdx
--
 14e167a:	0f 11 83 90 01 00 00 	movups XMMWORD PTR [rbx+0x190],xmm0
 14e1681:	0f 11 83 a0 01 00 00 	movups XMMWORD PTR [rbx+0x1a0],xmm0
 14e1688:	0f 11 83 28 01 00 00 	movups XMMWORD PTR [rbx+0x128],xmm0
 14e168f:	0f 11 83 38 01 00 00 	movups XMMWORD PTR [rbx+0x138],xmm0
 14e1696:	0f 11 83 48 01 00 00 	movups XMMWORD PTR [rbx+0x148],xmm0
 14e169d:	0f 11 83 58 01 00 00 	movups XMMWORD PTR [rbx+0x158],xmm0
 14e16a4:	0f 11 83 68 01 00 00 	movups XMMWORD PTR [rbx+0x168],xmm0
 14e16ab:	0f 11 83 78 01 00 00 	movups XMMWORD PTR [rbx+0x178],xmm0
 14e16b2:	83 a3 88 01 00 00 00 	and    DWORD PTR [rbx+0x188],0x0
 14e16b9:	89 ab b0 01 00 00    	mov    DWORD PTR [rbx+0x1b0],ebp
 14e16bf:	44 88 b3 b8 01 00 00 	mov    BYTE PTR [rbx+0x1b8],r14b
 14e16c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14e16cd:	00 00 
 14e16cf:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 14e16d4:	75 0b                	jne    14e16e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x326c65>
 14e16d6:	48 83 c4 48          	add    rsp,0x48
 14e16da:	5b                   	pop    rbx
 14e16db:	41 5e                	pop    r14
 14e16dd:	41 5f                	pop    r15
 14e16df:	5d                   	pop    rbp
 14e16e0:	c3                   	ret
 14e16e1:	e8 ca e3 30 00       	call   17efab0 <__stack_chk_fail@plt>
 14e16e6:	53                   	push   rbx
 14e16e7:	48 89 fb             	mov    rbx,rdi
 14e16ea:	e8 15 41 f7 ff       	call   1455804 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ad88>
 14e16ef:	48 89 df             	mov    rdi,rbx
 14e16f2:	5b                   	pop    rbx
 14e16f3:	e9 28 c8 30 00       	jmp    17edf20 <_ZdlPv@plt>
 14e16f8:	48 83 c7 08          	add    rdi,0x8
--
 14e2465:	48 89 df             	mov    rdi,rbx
 14e2468:	e8 63 d8 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 14e246d:	e8 3e d6 30 00       	call   17efab0 <__stack_chk_fail@plt>
 14e2472:	48 83 c7 20          	add    rdi,0x20
 14e2476:	48 8d 35 73 64 f5 fe 	lea    rsi,[rip+0xfffffffffef56473]        # 4388f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e33f>
 14e247d:	48 8d 15 9c f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f79c]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
 14e2484:	e9 5e 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
 14e2489:	cc                   	int3
 14e248a:	53                   	push   rbx
 14e248b:	b0 01                	mov    al,0x1
 14e248d:	80 bf b8 01 00 00 00 	cmp    BYTE PTR [rdi+0x1b8],0x0
 14e2494:	75 13                	jne    14e24a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a2d>
 14e2496:	48 89 fb             	mov    rbx,rdi
 14e2499:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14e249c:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
 14e24a2:	48 85 c0             	test   rax,rax
 14e24a5:	7e 04                	jle    14e24ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a2f>
 14e24a7:	31 c0                	xor    eax,eax
 14e24a9:	5b                   	pop    rbx
 14e24aa:	c3                   	ret
 14e24ab:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 14e24ae:	48 89 df             	mov    rdi,rbx
 14e24b1:	5b                   	pop    rbx
 14e24b2:	ff a0 c8 00 00 00    	jmp    QWORD PTR [rax+0xc8]
 14e24b8:	48 83 c7 20          	add    rdi,0x20
 14e24bc:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389c8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e417>
 14e24c3:	48 8d 15 56 f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f756]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
 14e24ca:	e9 18 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
 14e24cf:	cc                   	int3
--
 14edbcc:	49 89 f6             	mov    r14,rsi
 14edbcf:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
 14edbd3:	48 8d 35 bc a2 e7 fe 	lea    rsi,[rip+0xfffffffffee7a2bc]        # 367e96 <_ZTSSt12bad_any_cast@@Base-0x28332>
 14edbda:	4c 89 f7             	mov    rdi,r14
 14edbdd:	e8 6d dc 58 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 14edbe2:	84 c0                	test   al,al
 14edbe4:	74 23                	je     14edc09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33318d>
 14edbe6:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 14edbea:	48 85 c0             	test   rax,rax
 14edbed:	74 1a                	je     14edc09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33318d>
 14edbef:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
 14edbf6:	48 83 c3 68          	add    rbx,0x68
 14edbfa:	48 89 df             	mov    rdi,rbx
 14edbfd:	48 83 c4 08          	add    rsp,0x8
 14edc01:	5b                   	pop    rbx
 14edc02:	41 5e                	pop    r14
 14edc04:	e9 9f ae 63 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 14edc09:	48 83 c4 08          	add    rsp,0x8
 14edc0d:	5b                   	pop    rbx
 14edc0e:	41 5e                	pop    r14
 14edc10:	c3                   	ret
 14edc11:	cc                   	int3
 14edc12:	53                   	push   rbx
 14edc13:	48 89 fb             	mov    rbx,rdi
 14edc16:	48 8d 05 f3 c5 38 00 	lea    rax,[rip+0x38c5f3]        # 187a210 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x368f8>
 14edc1d:	48 89 07             	mov    QWORD PTR [rdi],rax
 14edc20:	48 83 c7 68          	add    rdi,0x68
 14edc24:	e8 3d c2 2e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 14edc29:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
--
 14ef99f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14ef9a6:	00 00 
 14ef9a8:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
 14ef9af:	00 
 14ef9b0:	48 8d 35 51 97 f4 fe 	lea    rsi,[rip+0xfffffffffef49751]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
 14ef9b7:	4c 89 ef             	mov    rdi,r13
 14ef9ba:	e8 2f fd 5a ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 14ef9bf:	88 44 24 0b          	mov    BYTE PTR [rsp+0xb],al
 14ef9c3:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 14ef9c6:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
 14ef9ca:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
 14ef9d1:	00 
 14ef9d2:	48 89 df             	mov    rdi,rbx
 14ef9d5:	e8 76 da de ff       	call   12dd450 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1229d4>
 14ef9da:	48 89 df             	mov    rdi,rbx
 14ef9dd:	e8 58 a3 ff ff       	call   14e9d3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32f2be>
 14ef9e2:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
 14ef9e6:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
 14ef9ed:	00 
 14ef9ee:	48 8d 35 d2 a0 ff ff 	lea    rsi,[rip+0xffffffffffffa0d2]        # 14e9ac7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32f04b>
 14ef9f5:	e8 f0 7e f7 ff       	call   14678ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ace6e>
 14ef9fa:	88 44 24 0a          	mov    BYTE PTR [rsp+0xa],al
 14ef9fe:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
 14efa02:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 14efa07:	48 8d 5c 24 68       	lea    rbx,[rsp+0x68]
 14efa0c:	ba a8 00 00 00       	mov    edx,0xa8
 14efa11:	48 89 df             	mov    rdi,rbx
 14efa14:	31 f6                	xor    esi,esi
 14efa16:	e8 75 f1 2f 00       	call   17eeb90 <memset@plt>
--
 14efb46:	ff 50 10             	call   QWORD PTR [rax+0x10]
 14efb49:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 14efb50:	00 
 14efb51:	e8 aa ee f5 ff       	call   144ea00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x293f84>
 14efb56:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 14efb5b:	e8 d0 71 5b ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 14efb60:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 14efb65:	e8 26 e3 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14efb6a:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
 14efb6f:	e8 8c ee f5 ff       	call   144ea00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x293f84>
 14efb74:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
 14efb7b:	00 
 14efb7c:	e8 e5 2a 5f ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 14efb81:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14efb88:	00 00 
 14efb8a:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
 14efb91:	00 
 14efb92:	0f 85 80 00 00 00    	jne    14efc18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33519c>
 14efb98:	48 81 c4 e8 01 00 00 	add    rsp,0x1e8
 14efb9f:	5b                   	pop    rbx
 14efba0:	41 5c                	pop    r12
 14efba2:	41 5d                	pop    r13
 14efba4:	41 5e                	pop    r14
 14efba6:	41 5f                	pop    r15
 14efba8:	5d                   	pop    rbp
 14efba9:	c3                   	ret
 14efbaa:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
 14efbae:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
 14efbb1:	e9 01 ff ff ff       	jmp    14efab7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33503b>
--
 14efbc8:	eb 00                	jmp    14efbca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33514e>
 14efbca:	48 89 c3             	mov    rbx,rax
 14efbcd:	eb 21                	jmp    14efbf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x335174>
 14efbcf:	48 89 c3             	mov    rbx,rax
 14efbd2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 14efbd7:	e8 54 71 5b ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 14efbdc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 14efbe1:	e8 aa e2 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14efbe6:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
 14efbeb:	e8 10 ee f5 ff       	call   144ea00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x293f84>
 14efbf0:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
 14efbf7:	00 
 14efbf8:	e8 69 2a 5f ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 14efbfd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14efc04:	00 00 
 14efc06:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
 14efc0d:	00 
 14efc0e:	75 08                	jne    14efc18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33519c>
 14efc10:	48 89 df             	mov    rdi,rbx
 14efc13:	e8 b8 00 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 14efc18:	e8 93 fe 2f 00       	call   17efab0 <__stack_chk_fail@plt>
 14efc1d:	cc                   	int3
 14efc1e:	41 56                	push   r14
 14efc20:	53                   	push   rbx
 14efc21:	50                   	push   rax
 14efc22:	48 89 d3             	mov    rbx,rdx
 14efc25:	49 89 fe             	mov    r14,rdi
 14efc28:	48 81 c7 f8 00 00 00 	add    rdi,0xf8
 14efc2f:	e8 b8 97 99 ff       	call   e893ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50802>
--
 14f7227:	c6 07 07             	mov    BYTE PTR [rdi],0x7
 14f722a:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
 14f722e:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
 14f7233:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
 14f7238:	e8 5e bc 2c 00       	call   17c2e9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177007>
 14f723d:	84 c0                	test   al,al
 14f723f:	0f 84 1d 01 00 00    	je     14f7362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33c8e6>
 14f7245:	80 bc 24 b0 01 00 00 	cmp    BYTE PTR [rsp+0x1b0],0x7
 14f724c:	07 
 14f724d:	0f 85 0f 01 00 00    	jne    14f7362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33c8e6>
 14f7253:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
 14f725a:	00 
 14f725b:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
 14f7262:	00 
 14f7263:	48 8d 15 e6 40 e8 fe 	lea    rdx,[rip+0xfffffffffee840e6]        # 37b350 <_ZTSSt12bad_any_cast@@Base-0x14e78>
 14f726a:	e8 e7 d7 2c 00       	call   17c4a56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178bc2>
 14f726f:	84 c0                	test   al,al
 14f7271:	0f 84 eb 00 00 00    	je     14f7362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33c8e6>
 14f7277:	48 8d 35 d2 40 e8 fe 	lea    rsi,[rip+0xfffffffffee840d2]        # 37b350 <_ZTSSt12bad_any_cast@@Base-0x14e78>
 14f727e:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 14f7285:	00 
 14f7286:	e8 b9 d5 2c 00       	call   17c4844 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1789b0>
 14f728b:	48 8d 35 ea ac f5 fe 	lea    rsi,[rip+0xfffffffffef5acea]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 14f7292:	48 89 c7             	mov    rdi,rax
 14f7295:	e8 a8 c4 2c 00       	call   17c3742 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1778ae>
 14f729a:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 14f72a1:	00 
 14f72a2:	48 89 c6             	mov    rsi,rax
 14f72a5:	e8 d4 27 58 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
--
 14f7575:	00 
 14f7576:	e8 d4 33 5f ff       	call   aea94f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x378ef>
 14f757b:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
 14f7582:	00 
 14f7583:	48 89 df             	mov    rdi,rbx
 14f7586:	e8 05 69 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14f758b:	4c 8d b4 24 60 02 00 	lea    r14,[rsp+0x260]
 14f7592:	00 
 14f7593:	4c 89 f7             	mov    rdi,r14
 14f7596:	e8 f5 68 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14f759b:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
 14f75a2:	00 
 14f75a3:	48 8b bd b0 00 00 00 	mov    rdi,QWORD PTR [rbp+0xb0]
 14f75aa:	31 c0                	xor    eax,eax
 14f75ac:	88 03                	mov    BYTE PTR [rbx],al
 14f75ae:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
 14f75b1:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
 14f75b6:	48 8d 94 24 b0 02 00 	lea    rdx,[rsp+0x2b0]
 14f75bd:	00 
 14f75be:	48 8d 8c 24 60 02 00 	lea    rcx,[rsp+0x260]
 14f75c5:	00 
 14f75c6:	e8 57 d8 12 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
 14f75cb:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
 14f75d2:	00 
 14f75d3:	e8 92 29 58 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 14f75d8:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
 14f75df:	00 
 14f75e0:	e8 4b f7 5a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 14f75e5:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
--
 14f8089:	ff 50 18             	call   QWORD PTR [rax+0x18]
 14f808c:	48 8b bb c0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1c0]
 14f8093:	48 85 ff             	test   rdi,rdi
 14f8096:	74 06                	je     14f809e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d622>
 14f8098:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 14f809b:	ff 50 18             	call   QWORD PTR [rax+0x18]
 14f809e:	48 8d bb d0 01 00 00 	lea    rdi,[rbx+0x1d0]
 14f80a5:	e8 ec c5 ff ff       	call   14f4696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339c1a>
 14f80aa:	48 8b bb c8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1c8]
 14f80b1:	e8 d0 63 5a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14f80b6:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]
 14f80bd:	e8 c4 63 5a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 14f80c2:	48 8d bb 98 01 00 00 	lea    rdi,[rbx+0x198]
 14f80c9:	e8 c2 5d 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14f80ce:	48 8d bb 80 01 00 00 	lea    rdi,[rbx+0x180]
 14f80d5:	e8 b6 5d 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14f80da:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
 14f80e1:	e8 3c 09 66 ff       	call   b58a22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59c2>
 14f80e6:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
 14f80ed:	e8 30 09 66 ff       	call   b58a22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59c2>
 14f80f2:	48 8d bb 68 01 00 00 	lea    rdi,[rbx+0x168]
 14f80f9:	e8 24 09 66 ff       	call   b58a22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59c2>
 14f80fe:	48 8d bb 48 01 00 00 	lea    rdi,[rbx+0x148]
 14f8105:	e8 ca 1a 2e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 14f810a:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
 14f8111:	e8 be 1a 2e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 14f8116:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 14f811d:	e8 6e 5d 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14f8122:	48 8d bb 08 01 00 00 	lea    rdi,[rbx+0x108]
--
 14fad54:	8b 43 1c             	mov    eax,DWORD PTR [rbx+0x1c]
 14fad57:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
 14fad5e:	00 
 14fad5f:	89 47 f8             	mov    DWORD PTR [rdi-0x8],eax
 14fad62:	48 8d 73 70          	lea    rsi,[rbx+0x70]
 14fad66:	e8 43 2d f6 ff       	call   145daae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a3032>
 14fad6b:	48 8b 83 b8 00 00 00 	mov    rax,QWORD PTR [rbx+0xb8]
 14fad72:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
 14fad79:	00 
 14fad7a:	48 89 46 68          	mov    QWORD PTR [rsi+0x68],rax
 14fad7e:	4c 8d b4 24 b8 01 00 	lea    r14,[rsp+0x1b8]
 14fad85:	00 
 14fad86:	4c 89 f7             	mov    rdi,r14
 14fad89:	e8 2e 93 ff ff       	call   14f40bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339640>
 14fad8e:	41 c6 46 70 01       	mov    BYTE PTR [r14+0x70],0x1
 14fad93:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
 14fad97:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
 14fad9b:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
 14fad9f:	48 85 c0             	test   rax,rax
 14fada2:	74 05                	je     14fada9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34032d>
 14fada4:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
 14fada9:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
 14fadae:	48 8d 35 3b e3 f3 fe 	lea    rsi,[rip+0xfffffffffef3e33b]        # 4390f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb3f>
 14fadb5:	4c 89 ff             	mov    rdi,r15
 14fadb8:	e8 83 31 2f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 14fadbd:	4c 8d 6c 24 28       	lea    r13,[rsp+0x28]
 14fadc2:	48 8d b4 24 08 01 00 	lea    rsi,[rsp+0x108]
 14fadc9:	00 
 14fadca:	4c 89 ef             	mov    rdi,r13
--
 14fae9f:	00 
 14faea0:	41 52                	push   r10
 14faea2:	41 52                	push   r10
 14faea4:	ff d0                	call   rax
 14faea6:	48 83 c4 20          	add    rsp,0x20
 14faeaa:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
 14faeb1:	00 
 14faeb2:	e8 b3 f0 57 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 14faeb7:	48 89 e7             	mov    rdi,rsp
 14faeba:	e8 55 02 00 00       	call   14fb114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x340698>
 14faebf:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
 14faec6:	00 
 14faec7:	e8 a6 8a ff ff       	call   14f3972 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338ef6>
 14faecc:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 14faed3:	00 
 14faed4:	e8 a5 8a ff ff       	call   14f397e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338f02>
 14faed9:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 14faede:	e8 ad 2f 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14faee3:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 14faee8:	e8 a3 2f 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14faeed:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 14faef2:	e8 f1 06 58 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 14faef7:	48 8d bc 24 68 02 00 	lea    rdi,[rsp+0x268]
 14faefe:	00 
 14faeff:	e8 8c 2f 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14faf04:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
 14faf0b:	00 
 14faf0c:	e8 59 f0 57 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 14faf11:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
--
 14faf91:	48 89 e7             	mov    rdi,rsp
 14faf94:	e8 7b 01 00 00       	call   14fb114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x340698>
 14faf99:	eb 1a                	jmp    14fafb5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x340539>
 14faf9b:	48 89 c3             	mov    rbx,rax
 14faf9e:	4c 89 ff             	mov    rdi,r15
 14fafa1:	e8 ea 2e 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14fafa6:	eb 03                	jmp    14fafab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34052f>
 14fafa8:	48 89 c3             	mov    rbx,rax
 14fafab:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 14fafb0:	e8 fd 34 5a ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 14fafb5:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
 14fafbc:	00 
 14fafbd:	e8 b0 89 ff ff       	call   14f3972 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338ef6>
 14fafc2:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 14fafc9:	00 
 14fafca:	e8 af 89 ff ff       	call   14f397e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338f02>
 14fafcf:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 14fafd4:	e8 b7 2e 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14fafd9:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 14fafde:	e8 ad 2e 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14fafe3:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 14fafe8:	e8 fb 05 58 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 14fafed:	48 8d bc 24 68 02 00 	lea    rdi,[rsp+0x268]
 14faff4:	00 
 14faff5:	e8 96 2e 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 14faffa:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
 14fb001:	00 
 14fb002:	e8 63 ef 57 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 14fb007:	e9 9d 00 00 00       	jmp    14fb0a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34062d>
--
 1504c07:	4c 89 f7             	mov    rdi,r14
 1504c0a:	4c 89 e2             	mov    rdx,r12
 1504c0d:	e8 76 c8 2b 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
 1504c12:	4c 89 e7             	mov    rdi,r12
 1504c15:	e8 84 26 5a ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 1504c1a:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 1504c21:	00 
 1504c22:	e8 b9 58 5f ff       	call   afa4e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x47480>
 1504c27:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 1504c2c:	e8 39 53 57 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 1504c31:	80 bb b8 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b8],0x0
 1504c38:	0f 84 3b 01 00 00    	je     1504d79 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34a2fd>
 1504c3e:	80 bb 30 01 00 00 00 	cmp    BYTE PTR [rbx+0x130],0x0
 1504c45:	0f 85 2e 01 00 00    	jne    1504d79 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34a2fd>
 1504c4b:	4c 8d b3 90 00 00 00 	lea    r14,[rbx+0x90]
 1504c52:	4c 89 f7             	mov    rdi,r14
 1504c55:	e8 20 0c 00 00       	call   150587a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34adfe>
 1504c5a:	48 8b 73 48          	mov    rsi,QWORD PTR [rbx+0x48]
 1504c5e:	4c 8d bc 24 d0 00 00 	lea    r15,[rsp+0xd0]
 1504c65:	00 
 1504c66:	4c 89 ff             	mov    rdi,r15
 1504c69:	e8 2a 3d 65 ff       	call   b58998 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5938>
 1504c6e:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
 1504c75:	49 8b 37             	mov    rsi,QWORD PTR [r15]
 1504c78:	49 83 27 00          	and    QWORD PTR [r15],0x0
 1504c7c:	e8 f3 3d 65 ff       	call   b58a74 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5a14>
 1504c81:	4c 89 ff             	mov    rdi,r15
 1504c84:	e8 99 3d 65 ff       	call   b58a22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59c2>
 1504c89:	e9 e0 00 00 00       	jmp    1504d6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34a2f2>
--
 1505f78:	e8 c7 e9 ff ff       	call   1504944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349ec8>
 1505f7d:	4d 8d bc 24 90 00 00 	lea    r15,[r12+0x90]
 1505f84:	00 
 1505f85:	48 8d 05 44 79 42 00 	lea    rax,[rip+0x427944]        # 192d8d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x74ce0>
 1505f8c:	49 39 45 08          	cmp    QWORD PTR [r13+0x8],rax
 1505f90:	0f 85 0f 01 00 00    	jne    15060a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b629>
 1505f96:	41 83 7d 00 00       	cmp    DWORD PTR [r13+0x0],0x0
 1505f9b:	0f 85 04 01 00 00    	jne    15060a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b629>
 1505fa1:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
 1505fa6:	4c 89 eb             	mov    rbx,r13
 1505fa9:	41 c6 84 24 b8 01 00 	mov    BYTE PTR [r12+0x1b8],0x0
 1505fb0:	00 00 
 1505fb2:	49 8d 84 24 a0 00 00 	lea    rax,[r12+0xa0]
 1505fb9:	00 
 1505fba:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 1505fbf:	4d 8b ac 24 a0 00 00 	mov    r13,QWORD PTR [r12+0xa0]
 1505fc6:	00 
 1505fc7:	4d 8d bc 24 a8 00 00 	lea    r15,[r12+0xa8]
 1505fce:	00 
 1505fcf:	4d 39 fd             	cmp    r13,r15
 1505fd2:	74 78                	je     150604c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b5d0>
 1505fd4:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1505fd9:	48 8d 68 68          	lea    rbp,[rax+0x68]
 1505fdd:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
 1505fe4:	00 
 1505fe5:	4d 8d 75 20          	lea    r14,[r13+0x20]
 1505fe9:	48 89 ef             	mov    rdi,rbp
 1505fec:	4c 89 f6             	mov    rsi,r14
 1505fef:	e8 22 29 9a ff       	call   ea8916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fd2c>
--
 150993c:	c6 07 07             	mov    BYTE PTR [rdi],0x7
 150993f:	66 0f ef c0          	pxor   xmm0,xmm0
 1509943:	f3 0f 7f 47 08       	movdqu XMMWORD PTR [rdi+0x8],xmm0
 1509948:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
 150994d:	e8 49 95 2b 00       	call   17c2e9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177007>
 1509952:	84 c0                	test   al,al
 1509954:	0f 84 c7 18 00 00    	je     150b221 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3507a5>
 150995a:	80 bc 24 b0 01 00 00 	cmp    BYTE PTR [rsp+0x1b0],0x7
 1509961:	07 
 1509962:	0f 85 b9 18 00 00    	jne    150b221 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3507a5>
 1509968:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
 150996f:	00 
 1509970:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
 1509977:	00 
 1509978:	48 8d 15 ed 6c e3 fe 	lea    rdx,[rip+0xfffffffffee36ced]        # 34066c <_ZTSSt12bad_any_cast@@Base-0x4fb5c>
 150997f:	e8 d2 b0 2b 00       	call   17c4a56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178bc2>
 1509984:	84 c0                	test   al,al
 1509986:	0f 84 dd 18 00 00    	je     150b269 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3507ed>
 150998c:	48 8d 35 d9 6c e3 fe 	lea    rsi,[rip+0xfffffffffee36cd9]        # 34066c <_ZTSSt12bad_any_cast@@Base-0x4fb5c>
 1509993:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 150999a:	00 
 150999b:	e8 a4 ae 2b 00       	call   17c4844 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1789b0>
 15099a0:	80 38 07             	cmp    BYTE PTR [rax],0x7
 15099a3:	48 8d 0d a6 82 f4 fe 	lea    rcx,[rip+0xfffffffffef482a6]        # 451c50 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1785c>
 15099aa:	48 0f 45 c1          	cmovne rax,rcx
 15099ae:	48 8b 48 10          	mov    rcx,QWORD PTR [rax+0x10]
 15099b2:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
 15099b9:	00 
 15099ba:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
--
 150ae02:	48 ff c0             	inc    rax
 150ae05:	48 39 f0             	cmp    rax,rsi
 150ae08:	0f 85 c5 ec ff ff    	jne    1509ad3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f057>
 150ae0e:	eb 08                	jmp    150ae18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35039c>
 150ae10:	48 8b 8c 24 88 00 00 	mov    rcx,QWORD PTR [rsp+0x88]
 150ae17:	00 
 150ae18:	48 ff c1             	inc    rcx
 150ae1b:	48 3b 8c 24 b0 00 00 	cmp    rcx,QWORD PTR [rsp+0xb0]
 150ae22:	00 
 150ae23:	0f 85 fc eb ff ff    	jne    1509a25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34efa9>
 150ae29:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
 150ae30:	00 
 150ae31:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
 150ae38:	00 
 150ae39:	48 8d 15 6f 5e e5 fe 	lea    rdx,[rip+0xfffffffffee55e6f]        # 360caf <_ZTSSt12bad_any_cast@@Base-0x2f519>
 150ae40:	e8 11 9c 2b 00       	call   17c4a56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178bc2>
 150ae45:	84 c0                	test   al,al
 150ae47:	0f 84 61 04 00 00    	je     150b2ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350832>
 150ae4d:	48 8d 35 5b 5e e5 fe 	lea    rsi,[rip+0xfffffffffee55e5b]        # 360caf <_ZTSSt12bad_any_cast@@Base-0x2f519>
 150ae54:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 150ae5b:	00 
 150ae5c:	e8 e3 99 2b 00       	call   17c4844 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1789b0>
 150ae61:	80 38 07             	cmp    BYTE PTR [rax],0x7
 150ae64:	48 8d 15 e5 6d f4 fe 	lea    rdx,[rip+0xfffffffffef46de5]        # 451c50 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1785c>
 150ae6b:	48 0f 44 d0          	cmove  rdx,rax
 150ae6f:	48 8b 4a 10          	mov    rcx,QWORD PTR [rdx+0x10]
 150ae73:	48 89 54 24 78       	mov    QWORD PTR [rsp+0x78],rdx
 150ae78:	48 8b 72 08          	mov    rsi,QWORD PTR [rdx+0x8]
 150ae7c:	48 89 c8             	mov    rax,rcx
--
 1511615:	48 89 b7 40 01 00 00 	mov    QWORD PTR [rdi+0x140],rsi
 151161c:	0f 11 87 48 01 00 00 	movups XMMWORD PTR [rdi+0x148],xmm0
 1511623:	48 89 b7 58 01 00 00 	mov    QWORD PTR [rdi+0x158],rsi
 151162a:	0f 11 87 60 01 00 00 	movups XMMWORD PTR [rdi+0x160],xmm0
 1511631:	48 89 b7 70 01 00 00 	mov    QWORD PTR [rdi+0x170],rsi
 1511638:	0f 11 87 78 01 00 00 	movups XMMWORD PTR [rdi+0x178],xmm0
 151163f:	48 89 b7 88 01 00 00 	mov    QWORD PTR [rdi+0x188],rsi
 1511646:	0f 11 87 90 01 00 00 	movups XMMWORD PTR [rdi+0x190],xmm0
 151164d:	48 89 b7 a0 01 00 00 	mov    QWORD PTR [rdi+0x1a0],rsi
 1511654:	0f 11 87 a8 01 00 00 	movups XMMWORD PTR [rdi+0x1a8],xmm0
 151165b:	48 89 b7 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rsi
 1511662:	0f 11 87 c0 01 00 00 	movups XMMWORD PTR [rdi+0x1c0],xmm0
 1511669:	48 89 b7 d0 01 00 00 	mov    QWORD PTR [rdi+0x1d0],rsi
 1511670:	0f 11 87 d8 01 00 00 	movups XMMWORD PTR [rdi+0x1d8],xmm0
 1511677:	48 89 b7 e8 01 00 00 	mov    QWORD PTR [rdi+0x1e8],rsi
 151167e:	0f 11 87 f0 01 00 00 	movups XMMWORD PTR [rdi+0x1f0],xmm0
 1511685:	48 89 b7 00 02 00 00 	mov    QWORD PTR [rdi+0x200],rsi
 151168c:	0f 11 87 08 02 00 00 	movups XMMWORD PTR [rdi+0x208],xmm0
 1511693:	48 89 b7 18 02 00 00 	mov    QWORD PTR [rdi+0x218],rsi
 151169a:	0f 11 87 20 02 00 00 	movups XMMWORD PTR [rdi+0x220],xmm0
 15116a1:	48 89 b7 30 02 00 00 	mov    QWORD PTR [rdi+0x230],rsi
 15116a8:	0f 11 87 38 02 00 00 	movups XMMWORD PTR [rdi+0x238],xmm0
 15116af:	48 89 b7 48 02 00 00 	mov    QWORD PTR [rdi+0x248],rsi
 15116b6:	0f 11 87 50 02 00 00 	movups XMMWORD PTR [rdi+0x250],xmm0
 15116bd:	48 89 b7 60 02 00 00 	mov    QWORD PTR [rdi+0x260],rsi
 15116c4:	48 89 b7 68 02 00 00 	mov    QWORD PTR [rdi+0x268],rsi
 15116cb:	48 8d 05 5e 2e 42 00 	lea    rax,[rip+0x422e5e]        # 1934530 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x7b940>
 15116d2:	48 89 87 70 02 00 00 	mov    QWORD PTR [rdi+0x270],rax
 15116d9:	0f 28 0d c0 c2 e7 fe 	movaps xmm1,XMMWORD PTR [rip+0xfffffffffee7c2c0]        # 38d9a0 <_ZTSSt12bad_any_cast@@Base-0x2828>
--
 151474f:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
 1514753:	e8 fc de ff ff       	call   1512654 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x357bd8>
 1514758:	48 8d bb f8 00 00 00 	lea    rdi,[rbx+0xf8]
 151475f:	e8 00 df ff ff       	call   1512664 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x357be8>
 1514764:	48 89 df             	mov    rdi,rbx
 1514767:	48 81 c7 50 01 00 00 	add    rdi,0x150
 151476e:	e8 01 df ff ff       	call   1512674 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x357bf8>
 1514773:	0f 57 c0             	xorps  xmm0,xmm0
 1514776:	0f 11 83 d8 01 00 00 	movups XMMWORD PTR [rbx+0x1d8],xmm0
 151477d:	0f 11 83 c8 01 00 00 	movups XMMWORD PTR [rbx+0x1c8],xmm0
 1514784:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
 151478b:	0f 11 83 a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm0
 1514792:	49 89 e4             	mov    r12,rsp
 1514795:	4c 89 ff             	mov    rdi,r15
 1514798:	4c 89 e6             	mov    rsi,r12
 151479b:	e8 9a 00 00 00       	call   151483a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x359dbe>
 15147a0:	4c 89 e7             	mov    rdi,r12
 15147a3:	e8 c2 57 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 15147a8:	4d 89 2e             	mov    QWORD PTR [r14],r13
 15147ab:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
 15147af:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
 15147b3:	48 85 c0             	test   rax,rax
 15147b6:	74 0a                	je     15147c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x359d46>
 15147b8:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
 15147bc:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
 15147c0:	75 23                	jne    15147e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x359d69>
 15147c2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
 15147c7:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
 15147cc:	4c 89 6b 28          	mov    QWORD PTR [rbx+0x28],r13
--
 1516bd3:	48 8b 57 b8          	mov    rdx,QWORD PTR [rdi-0x48]
 1516bd7:	f6 c2 01             	test   dl,0x1
 1516bda:	0f 85 41 0b 00 00    	jne    1517721 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35cca5>
 1516be0:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
 1516be5:	e8 fc eb 24 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
 1516bea:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 1516bef:	e8 9c 72 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1516bf4:	41 80 bf b9 01 00 00 	cmp    BYTE PTR [r15+0x1b9],0x0
 1516bfb:	00 
 1516bfc:	74 1d                	je     1516c1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c19f>
 1516bfe:	49 8d 9f b8 01 00 00 	lea    rbx,[r15+0x1b8]
 1516c05:	48 89 df             	mov    rdi,rbx
 1516c08:	e8 d3 fa 6b ff       	call   bd66e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x123680>
 1516c0d:	8a 03                	mov    al,BYTE PTR [rbx]
 1516c0f:	88 84 24 58 01 00 00 	mov    BYTE PTR [rsp+0x158],al
 1516c16:	80 4c 24 7b 01       	or     BYTE PTR [rsp+0x7b],0x1
 1516c1b:	41 80 bf bb 01 00 00 	cmp    BYTE PTR [r15+0x1bb],0x0
 1516c22:	00 
 1516c23:	74 1d                	je     1516c42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c1c6>
 1516c25:	49 8d 9f ba 01 00 00 	lea    rbx,[r15+0x1ba]
 1516c2c:	48 89 df             	mov    rdi,rbx
 1516c2f:	e8 ac fa 6b ff       	call   bd66e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x123680>
 1516c34:	8a 03                	mov    al,BYTE PTR [rbx]
 1516c36:	88 84 24 5a 01 00 00 	mov    BYTE PTR [rsp+0x15a],al
 1516c3d:	80 4c 24 7b 04       	or     BYTE PTR [rsp+0x7b],0x4
 1516c42:	41 80 bf bd 01 00 00 	cmp    BYTE PTR [r15+0x1bd],0x0
 1516c49:	00 
 1516c4a:	74 1d                	je     1516c69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c1ed>
 1516c4c:	49 8d 9f bc 01 00 00 	lea    rbx,[r15+0x1bc]
--
 1517417:	48 89 df             	mov    rdi,rbx
 151741a:	e8 73 43 01 00       	call   152b792 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370d16>
 151741f:	48 89 ef             	mov    rdi,rbp
 1517422:	48 89 de             	mov    rsi,rbx
 1517425:	e8 c8 f4 00 00       	call   15268f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36be76>
 151742a:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
 151742f:	e8 5c 6a 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1517434:	41 80 bf b9 01 00 00 	cmp    BYTE PTR [r15+0x1b9],0x0
 151743b:	00 
 151743c:	74 10                	je     151744e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c9d2>
 151743e:	41 0f b6 b7 b8 01 00 	movzx  esi,BYTE PTR [r15+0x1b8]
 1517445:	00 
 1517446:	48 89 ef             	mov    rdi,rbp
 1517449:	e8 3c f6 00 00       	call   1526a8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36c00e>
 151744e:	41 80 bf bb 01 00 00 	cmp    BYTE PTR [r15+0x1bb],0x0
 1517455:	00 
 1517456:	74 10                	je     1517468 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c9ec>
 1517458:	41 0f b6 b7 ba 01 00 	movzx  esi,BYTE PTR [r15+0x1ba]
 151745f:	00 
 1517460:	48 89 ef             	mov    rdi,rbp
 1517463:	e8 96 f7 00 00       	call   1526bfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36c182>
 1517468:	41 80 bf bd 01 00 00 	cmp    BYTE PTR [r15+0x1bd],0x0
 151746f:	00 
 1517470:	74 10                	je     1517482 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ca06>
 1517472:	41 0f b6 b7 bc 01 00 	movzx  esi,BYTE PTR [r15+0x1bc]
 1517479:	00 
 151747a:	48 89 ef             	mov    rdi,rbp
 151747d:	e8 a8 f9 00 00       	call   1526e2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36c3ae>
 1517482:	41 80 bf 38 02 00 00 	cmp    BYTE PTR [r15+0x238],0x0
--
 1518b4d:	41 83 a5 35 01 00 00 	and    DWORD PTR [r13+0x135],0x0
 1518b54:	00 
 1518b55:	41 0f 11 85 78 01 00 	movups XMMWORD PTR [r13+0x178],xmm0
 1518b5c:	00 
 1518b5d:	41 0f 11 85 88 01 00 	movups XMMWORD PTR [r13+0x188],xmm0
 1518b64:	00 
 1518b65:	41 0f 11 85 98 01 00 	movups XMMWORD PTR [r13+0x198],xmm0
 1518b6c:	00 
 1518b6d:	41 0f 11 85 a8 01 00 	movups XMMWORD PTR [r13+0x1a8],xmm0
 1518b74:	00 
 1518b75:	41 0f 11 85 b8 01 00 	movups XMMWORD PTR [r13+0x1b8],xmm0
 1518b7c:	00 
 1518b7d:	41 0f 11 85 c8 01 00 	movups XMMWORD PTR [r13+0x1c8],xmm0
 1518b84:	00 
 1518b85:	41 0f 11 85 d2 01 00 	movups XMMWORD PTR [r13+0x1d2],xmm0
 1518b8c:	00 
 1518b8d:	45 88 b5 20 02 00 00 	mov    BYTE PTR [r13+0x220],r14b
 1518b94:	41 0f 11 85 10 02 00 	movups XMMWORD PTR [r13+0x210],xmm0
 1518b9b:	00 
 1518b9c:	41 0f 11 85 00 02 00 	movups XMMWORD PTR [r13+0x200],xmm0
 1518ba3:	00 
 1518ba4:	41 0f 11 85 f0 01 00 	movups XMMWORD PTR [r13+0x1f0],xmm0
 1518bab:	00 
 1518bac:	41 0f 11 85 49 02 00 	movups XMMWORD PTR [r13+0x249],xmm0
 1518bb3:	00 
 1518bb4:	41 0f 11 85 40 02 00 	movups XMMWORD PTR [r13+0x240],xmm0
 1518bbb:	00 
 1518bbc:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
 1518bc1:	4c 89 ef             	mov    rdi,r13
--
 151c22c:	e8 39 8c 00 00       	call   1524e6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a3ee>
 151c231:	48 8d bc 24 10 03 00 	lea    rdi,[rsp+0x310]
 151c238:	00 
 151c239:	e8 52 1c 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 151c23e:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
 151c245:	00 
 151c246:	e8 45 1c 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 151c24b:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 151c252:	00 
 151c253:	e8 38 1c 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 151c258:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
 151c25f:	00 
 151c260:	e8 01 64 5c ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 151c265:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 151c269:	8b 30                	mov    esi,DWORD PTR [rax]
 151c26b:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
 151c270:	e8 ad 5b 00 00       	call   1521e22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3673a6>
 151c275:	41 8d 45 fd          	lea    eax,[r13-0x3]
 151c279:	83 f8 03             	cmp    eax,0x3
 151c27c:	6a 04                	push   0x4
 151c27e:	5d                   	pop    rbp
 151c27f:	0f 82 c2 02 00 00    	jb     151c547 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361acb>
 151c285:	45 85 ed             	test   r13d,r13d
 151c288:	74 06                	je     151c290 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361814>
 151c28a:	41 83 fd 02          	cmp    r13d,0x2
 151c28e:	75 5e                	jne    151c2ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361872>
 151c290:	0f 57 c0             	xorps  xmm0,xmm0
 151c293:	48 8d 9c 24 40 01 00 	lea    rbx,[rsp+0x140]
 151c29a:	00 
--
 151c8e7:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 151c8ee:	00 
 151c8ef:	eb 0d                	jmp    151c8fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361e82>
 151c8f1:	eb 24                	jmp    151c917 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361e9b>
 151c8f3:	49 89 c6             	mov    r14,rax
 151c8f6:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 151c8fd:	00 
 151c8fe:	e8 8d 15 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 151c903:	eb 03                	jmp    151c908 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361e8c>
 151c905:	49 89 c6             	mov    r14,rax
 151c908:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
 151c90f:	00 
 151c910:	e8 51 5d 5c ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 151c915:	eb 03                	jmp    151c91a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361e9e>
 151c917:	49 89 c6             	mov    r14,rax
 151c91a:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 151c91f:	e8 6c 15 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 151c924:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 151c92b:	00 00 
 151c92d:	48 3b 84 24 40 03 00 	cmp    rax,QWORD PTR [rsp+0x340]
 151c934:	00 
 151c935:	75 08                	jne    151c93f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x361ec3>
 151c937:	4c 89 f7             	mov    rdi,r14
 151c93a:	e8 91 33 55 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 151c93f:	e8 6c 31 2d 00       	call   17efab0 <__stack_chk_fail@plt>
 151c944:	55                   	push   rbp
 151c945:	41 57                	push   r15
 151c947:	41 56                	push   r14
 151c949:	41 55                	push   r13
