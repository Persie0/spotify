# Readiness owner +0x428 input provenance

Known:
- e95a7d loads readiness arg = [rbx+0x428]
- ecee52 stores a 0x98-byte erased/shared wrapper into [rbx+0x428]
- that wrapper first 16 bytes come from ecee incoming stack argument at current [rsp+0x1c8]

## e95 caller owner provenance FDE=(15281964, 15306555)
### rbx definition 0xe9585f: mov    rbx,QWORD PTR [rsp+0x8]
      e9580e:	31 ff                	xor    edi,edi
      e95810:	e8 07 8c c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e95815:	6a 58                	push   0x58
      e95817:	5f                   	pop    rdi
      e95818:	e8 e3 86 95 00       	call   17edf00 <_Znwm@plt>
      e9581d:	49 89 c7             	mov    r15,rax
      e95820:	66 0f ef c0          	pxor   xmm0,xmm0
      e95824:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e95829:	48 8d 05 38 7c 96 00 	lea    rax,[rip+0x967c38]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e95830:	49 89 07             	mov    QWORD PTR [r15],rax
      e95833:	48 8d 05 86 e3 9a 00 	lea    rax,[rip+0x9ae386]        # 1843bc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2a8>
      e9583a:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e9583e:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
      e95842:	4d 89 67 28          	mov    QWORD PTR [r15+0x28],r12
      e95846:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      e9584c:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      e95850:	48 8d 35 e9 4b 4e ff 	lea    rsi,[rip+0xffffffffff4e4be9]        # 37a440 <_ZTSSt12bad_any_cast@@Base-0x15d88>
      e95857:	6a 08                	push   0x8
      e95859:	5a                   	pop    rdx
      e9585a:	e8 bb 71 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e9585f:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e95864:	4c 8b 35 35 c2 a1 00 	mov    r14,QWORD PTR [rip+0xa1c235]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e9586b:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      e95870:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e95874:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e95878:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
      e9587e:	48 85 c0             	test   rax,rax
      e95881:	74 05                	je     e95888 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cc9e>
      e95883:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95888:	4c 89 e7             	mov    rdi,r12
      e9588b:	e8 f6 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95890:	31 ff                	xor    edi,edi
      e95892:	e8 85 8b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e95897:	31 ff                	xor    edi,edi
      e95899:	e8 e8 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9589e:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e958a5:	00 
      e958a6:	e8 db 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e958ab:	48 8d b3 30 02 00 00 	lea    rsi,[rbx+0x230]
      e958b2:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      e958b9:	00 
      e958ba:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
      e958c1:	00 
      e958c2:	e8 f7 63 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e958c7:	6a 50                	push   0x50
      e958c9:	5f                   	pop    rdi
      e958ca:	e8 31 86 95 00       	call   17edf00 <_Znwm@plt>
      e958cf:	48 89 c5             	mov    rbp,rax
      e958d2:	66 0f ef c0          	pxor   xmm0,xmm0
      e958d6:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e958db:	48 8d 05 46 ba 96 00 	lea    rax,[rip+0x96ba46]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
      e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f0:	4c 89 f8             	mov    rax,r15

### rbx definition 0xe9577d: mov    rbx,r15
      e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
      e95728:	00 00 00 
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e95732:	00 
      e95733:	48 8d 05 de c4 5b ff 	lea    rax,[rip+0xffffffffff5bc4de]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e9573a:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e95741:	00 
      e95742:	48 89 06             	mov    QWORD PTR [rsi],rax
      e95745:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e95749:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
      e95752:	48 8d 05 0b 6d be ff 	lea    rax,[rip+0xffffffffffbe6d0b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e95759:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e9575d:	48 8d 05 ce d5 02 00 	lea    rax,[rip+0x2d5ce]        # ec2d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a148>
      e95764:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      e95768:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e9576f:	00 
      e95770:	b9 60 ea 00 00       	mov    ecx,0xea60
      e95775:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
      e9577a:	48 89 df             	mov    rdi,rbx
      e9577d:	4c 89 fb             	mov    rbx,r15
      e95780:	4c 89 ea             	mov    rdx,r13
      e95783:	e8 fc c0 92 00       	call   17c1884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759f0>
      e95788:	4c 89 ef             	mov    rdi,r13
      e9578b:	e8 0e 1b c1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      e95790:	4d 8b 6c 24 20       	mov    r13,QWORD PTR [r12+0x20]
      e95795:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
      e9579c:	00 
      e9579d:	4d 89 38             	mov    QWORD PTR [r8],r15
      e957a0:	48 8d 35 ea 78 c0 ff 	lea    rsi,[rip+0xffffffffffc078ea]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e957a7:	48 8d 0d 8c d5 02 00 	lea    rcx,[rip+0x2d58c]        # ec2d3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a150>
      e957ae:	48 8d ac 24 e0 0b 00 	lea    rbp,[rsp+0xbe0]
      e957b5:	00 
      e957b6:	6a 08                	push   0x8
      e957b8:	41 59                	pop    r9
      e957ba:	48 89 ef             	mov    rdi,rbp
      e957bd:	31 d2                	xor    edx,edx
      e957bf:	e8 d0 4f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e957c4:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e957c8:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e957cf:	00 
      e957d0:	4c 89 ee             	mov    rsi,r13
      e957d3:	48 89 ea             	mov    rdx,rbp
      e957d6:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e957d9:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
      e957e0:	00 
      e957e1:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e957e6:	4c 89 f6             	mov    rsi,r14
      e957e9:	e8 04 44 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e957ee:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      e957f2:	e8 8f 8c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e957f7:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e957fe:	00 
      e957ff:	4c 89 ef             	mov    rdi,r13
      e95802:	e8 e1 4f 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>

### rbx definition 0xe95699: lea    rbx,[r12+0x38]
      e95639:	00 
      e9563a:	4c 89 ac 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],r13
      e95641:	00 
      e95642:	66 0f ef c9          	pxor   xmm1,xmm1
      e95646:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
      e9564b:	48 8d 05 16 7e 96 00 	lea    rax,[rip+0x967e16]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e95652:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e95656:	66 0f 6f 84 24 10 0e 	movdqa xmm0,XMMWORD PTR [rsp+0xe10]
      e9565d:	00 00 
      e9565f:	66 0f 7f 8c 24 10 0e 	movdqa XMMWORD PTR [rsp+0xe10],xmm1
      e95666:	00 00 
      e95668:	48 8d 05 99 d4 99 00 	lea    rax,[rip+0x99d499]        # 1832b08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4aa0>
      e9566f:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      e95674:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      e9567b:	4d 89 74 24 30       	mov    QWORD PTR [r12+0x30],r14
      e95680:	48 8d 35 3d b7 4d ff 	lea    rsi,[rip+0xffffffffff4db73d]        # 370dc4 <_ZTSSt12bad_any_cast@@Base-0x1f404>
      e95687:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9568e:	00 
      e9568f:	e8 ea 43 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e95694:	4d 8d 7c 24 18       	lea    r15,[r12+0x18]
      e95699:	49 8d 5c 24 38       	lea    rbx,[r12+0x38]
      e9569e:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e956a5:	00 
      e956a6:	48 89 df             	mov    rdi,rbx
      e956a9:	4c 89 f6             	mov    rsi,r14
      e956ac:	4c 89 ea             	mov    rdx,r13
      e956af:	e8 66 c0 92 00       	call   17c171a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175886>
      e956b4:	4c 89 ef             	mov    rdi,r13
      e956b7:	e8 d4 87 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e956bc:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e956c1:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e956c8:	00 
      e956c9:	66 0f ef c0          	pxor   xmm0,xmm0
      e956cd:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
      e956d4:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e956db:	bd 00 00 80 3f       	mov    ebp,0x3f800000
      e956e0:	41 89 6c 24 68       	mov    DWORD PTR [r12+0x68],ebp
      e956e5:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e956ea:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      e956ef:	e8 02 43 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e956f4:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e956fb:	00 
      e956fc:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
      e95703:	00 
      e95704:	e8 85 2b c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95709:	4d 89 e6             	mov    r14,r12
      e9570c:	49 81 c6 d8 00 00 00 	add    r14,0xd8
      e95713:	66 0f ef c0          	pxor   xmm0,xmm0
      e95717:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0xe8],xmm0
      e9571e:	00 00 00 
      e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
      e95728:	00 00 00 
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e95732:	00 
      e95733:	48 8d 05 de c4 5b ff 	lea    rax,[rip+0xffffffffff5bc4de]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>

### rbx definition 0xe955cc: pop    rbx
      e9557f:	00 
      e95580:	49 8d ac 24 c8 00 00 	lea    rbp,[r12+0xc8]
      e95587:	00 
      e95588:	49 89 c5             	mov    r13,rax
      e9558b:	49 83 c5 08          	add    r13,0x8
      e9558f:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
      e95596:	00 
      e95597:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
      e9559e:	00 
      e9559f:	48 89 df             	mov    rdi,rbx
      e955a2:	4c 89 f6             	mov    rsi,r14
      e955a5:	e8 0a a9 83 00       	call   16cfeb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84020>
      e955aa:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
      e955b1:	48 89 de             	mov    rsi,rbx
      e955b4:	e8 63 42 c2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      e955b9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e955bd:	e8 c4 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e955c2:	4c 89 f7             	mov    rdi,r14
      e955c5:	e8 7e f2 c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
      e955ca:	6a 20                	push   0x20
      e955cc:	5b                   	pop    rbx
      e955cd:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
      e955d4:	00 
      e955d5:	e8 ac 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e955da:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      e955de:	75 ed                	jne    e955cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c9e3>
      e955e0:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
      e955e5:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e955e9:	49 8b bf 98 00 00 00 	mov    rdi,QWORD PTR [r15+0x98]
      e955f0:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      e955f7:	00 00 
      e955f9:	f3 41 0f 7f 87 90 00 	movdqu XMMWORD PTR [r15+0x90],xmm0
      e95600:	00 00 
      e95602:	e8 7f 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95607:	49 8b b4 24 b8 03 00 	mov    rsi,QWORD PTR [r12+0x3b8]
      e9560e:	00 
      e9560f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e95612:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e95619:	00 
      e9561a:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e9561d:	4d 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [r12+0xe8]
      e95624:	00 
      e95625:	bf 00 01 00 00       	mov    edi,0x100
      e9562a:	e8 d1 88 95 00       	call   17edf00 <_Znwm@plt>
      e9562f:	49 89 c4             	mov    r12,rax
      e95632:	48 89 ac 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbp
      e95639:	00 
      e9563a:	4c 89 ac 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],r13
      e95641:	00 
      e95642:	66 0f ef c9          	pxor   xmm1,xmm1
      e95646:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
      e9564b:	48 8d 05 16 7e 96 00 	lea    rax,[rip+0x967e16]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e95652:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e95656:	66 0f 6f 84 24 10 0e 	movdqa xmm0,XMMWORD PTR [rsp+0xe10]
      e9565d:	00 00 

### rbx definition 0xe9558f: lea    rbx,[rsp+0xe10]
      e9553b:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95540:	66 48 0f 6e c0       	movq   xmm0,rax
      e95545:	66 49 0f 6e cd       	movq   xmm1,r13
      e9554a:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9554e:	66 0f 7f 8c 24 50 02 	movdqa XMMWORD PTR [rsp+0x250],xmm1
      e95555:	00 00 
      e95557:	48 8b 8c 24 90 00 00 	mov    rcx,QWORD PTR [rsp+0x90]
      e9555e:	00 
      e9555f:	48 83 c1 08          	add    rcx,0x8
      e95563:	48 89 8c 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rcx
      e9556a:	00 
      e9556b:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      e95570:	49 8d 8c 24 38 01 00 	lea    rcx,[r12+0x138]
      e95577:	00 
      e95578:	48 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rcx
      e9557f:	00 
      e95580:	49 8d ac 24 c8 00 00 	lea    rbp,[r12+0xc8]
      e95587:	00 
      e95588:	49 89 c5             	mov    r13,rax
      e9558b:	49 83 c5 08          	add    r13,0x8
      e9558f:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
      e95596:	00 
      e95597:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
      e9559e:	00 
      e9559f:	48 89 df             	mov    rdi,rbx
      e955a2:	4c 89 f6             	mov    rsi,r14
      e955a5:	e8 0a a9 83 00       	call   16cfeb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84020>
      e955aa:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
      e955b1:	48 89 de             	mov    rsi,rbx
      e955b4:	e8 63 42 c2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      e955b9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e955bd:	e8 c4 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e955c2:	4c 89 f7             	mov    rdi,r14
      e955c5:	e8 7e f2 c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
      e955ca:	6a 20                	push   0x20
      e955cc:	5b                   	pop    rbx
      e955cd:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
      e955d4:	00 
      e955d5:	e8 ac 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e955da:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      e955de:	75 ed                	jne    e955cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c9e3>
      e955e0:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
      e955e5:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e955e9:	49 8b bf 98 00 00 00 	mov    rdi,QWORD PTR [r15+0x98]
      e955f0:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      e955f7:	00 00 
      e955f9:	f3 41 0f 7f 87 90 00 	movdqu XMMWORD PTR [r15+0x90],xmm0
      e95600:	00 00 
      e95602:	e8 7f 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95607:	49 8b b4 24 b8 03 00 	mov    rsi,QWORD PTR [r12+0x3b8]
      e9560e:	00 
      e9560f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e95612:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e95619:	00 
      e9561a:	ff 50 10             	call   QWORD PTR [rax+0x10]

### rbx definition 0xe954e4: mov    rbx,QWORD PTR [rsp+0x48]
      e9548e:	e8 f3 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95493:	ba c0 00 00 00       	mov    edx,0xc0
      e95498:	4c 89 ff             	mov    rdi,r15
      e9549b:	31 f6                	xor    esi,esi
      e9549d:	e8 ee 96 95 00       	call   17eeb90 <memset@plt>
      e954a2:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      e954a7:	48 8b 81 90 04 00 00 	mov    rax,QWORD PTR [rcx+0x490]
      e954ae:	0f 10 81 88 04 00 00 	movups xmm0,XMMWORD PTR [rcx+0x488]
      e954b5:	0f 29 84 24 e0 0b 00 	movaps XMMWORD PTR [rsp+0xbe0],xmm0
      e954bc:	00 
      e954bd:	48 85 c0             	test   rax,rax
      e954c0:	74 05                	je     e954c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c8dd>
      e954c2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e954c7:	48 8b 84 24 a8 03 00 	mov    rax,QWORD PTR [rsp+0x3a8]
      e954ce:	00 
      e954cf:	f3 0f 6f 84 24 a0 03 	movdqu xmm0,XMMWORD PTR [rsp+0x3a0]
      e954d6:	00 00 
      e954d8:	66 0f 7f 84 24 f0 0b 	movdqa XMMWORD PTR [rsp+0xbf0],xmm0
      e954df:	00 00 
      e954e1:	48 85 c0             	test   rax,rax
      e954e4:	48 8b 5c 24 48       	mov    rbx,QWORD PTR [rsp+0x48]
      e954e9:	74 05                	je     e954f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c906>
      e954eb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e954f0:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e954f7:	00 
      e954f8:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e954ff:	00 
      e95500:	6a 02                	push   0x2
      e95502:	5a                   	pop    rdx
      e95503:	e8 d6 97 c3 ff       	call   acecde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bc7e>
      e95508:	f3 0f 7e 84 24 f8 00 	movq   xmm0,QWORD PTR [rsp+0xf8]
      e9550f:	00 00 
      e95511:	66 49 0f 6e ce       	movq   xmm1,r14
      e95516:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9551a:	66 0f 7f 8c 24 c0 00 	movdqa XMMWORD PTR [rsp+0xc0],xmm1
      e95521:	00 00 
      e95523:	66 48 0f 6e c3       	movq   xmm0,rbx
      e95528:	f3 0f 7e 4c 24 20    	movq   xmm1,QWORD PTR [rsp+0x20]
      e9552e:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e95532:	66 0f 7f 8c 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm1
      e95539:	00 00 
      e9553b:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95540:	66 48 0f 6e c0       	movq   xmm0,rax
      e95545:	66 49 0f 6e cd       	movq   xmm1,r13
      e9554a:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9554e:	66 0f 7f 8c 24 50 02 	movdqa XMMWORD PTR [rsp+0x250],xmm1
      e95555:	00 00 
      e95557:	48 8b 8c 24 90 00 00 	mov    rcx,QWORD PTR [rsp+0x90]
      e9555e:	00 
      e9555f:	48 83 c1 08          	add    rcx,0x8
      e95563:	48 89 8c 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rcx
      e9556a:	00 
      e9556b:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      e95570:	49 8d 8c 24 38 01 00 	lea    rcx,[r12+0x138]
      e95577:	00 

### rbx definition 0xe95463: mov    rbx,QWORD PTR [rsp+0xd0]
      e95412:	00 
      e95413:	48 89 de             	mov    rsi,rbx
      e95416:	e8 23 46 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e9541b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e9541f:	e8 62 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95424:	40 84 ed             	test   bpl,bpl
      e95427:	74 0f                	je     e95438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c84e>
      e95429:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e95430:	00 
      e95431:	e8 9e 47 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e95436:	eb 0d                	jmp    e95445 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c85b>
      e95438:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e9543f:	00 
      e95440:	e8 a3 53 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e95445:	4c 8b 7c 24 68       	mov    r15,QWORD PTR [rsp+0x68]
      e9544a:	4c 8b b4 24 c0 00 00 	mov    r14,QWORD PTR [rsp+0xc0]
      e95451:	00 
      e95452:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95457:	48 8d b8 98 00 00 00 	lea    rdi,[rax+0x98]
      e9545e:	e8 2b 2e c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95463:	48 8b 9c 24 d0 00 00 	mov    rbx,QWORD PTR [rsp+0xd0]
      e9546a:	00 
      e9546b:	48 89 df             	mov    rdi,rbx
      e9546e:	e8 13 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95473:	31 ff                	xor    edi,edi
      e95475:	e8 a2 8f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9547a:	48 89 df             	mov    rdi,rbx
      e9547d:	e8 04 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95482:	31 ff                	xor    edi,edi
      e95484:	e8 fd 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95489:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e9548e:	e8 f3 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95493:	ba c0 00 00 00       	mov    edx,0xc0
      e95498:	4c 89 ff             	mov    rdi,r15
      e9549b:	31 f6                	xor    esi,esi
      e9549d:	e8 ee 96 95 00       	call   17eeb90 <memset@plt>
      e954a2:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      e954a7:	48 8b 81 90 04 00 00 	mov    rax,QWORD PTR [rcx+0x490]
      e954ae:	0f 10 81 88 04 00 00 	movups xmm0,XMMWORD PTR [rcx+0x488]
      e954b5:	0f 29 84 24 e0 0b 00 	movaps XMMWORD PTR [rsp+0xbe0],xmm0
      e954bc:	00 
      e954bd:	48 85 c0             	test   rax,rax
      e954c0:	74 05                	je     e954c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c8dd>
      e954c2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e954c7:	48 8b 84 24 a8 03 00 	mov    rax,QWORD PTR [rsp+0x3a8]
      e954ce:	00 
      e954cf:	f3 0f 6f 84 24 a0 03 	movdqu xmm0,XMMWORD PTR [rsp+0x3a0]
      e954d6:	00 00 
      e954d8:	66 0f 7f 84 24 f0 0b 	movdqa XMMWORD PTR [rsp+0xbf0],xmm0
      e954df:	00 00 
      e954e1:	48 85 c0             	test   rax,rax
      e954e4:	48 8b 5c 24 48       	mov    rbx,QWORD PTR [rsp+0x48]
      e954e9:	74 05                	je     e954f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c906>
      e954eb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e954f0:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]

### rbx definition 0xe9540b: lea    rbx,[rsp+0xbe0]
      e953be:	00 
      e953bf:	4d 89 28             	mov    QWORD PTR [r8],r13
      e953c2:	48 8d 35 c8 7c c0 ff 	lea    rsi,[rip+0xffffffffffc07cc8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e953c9:	48 8d 0d e0 0f 03 00 	lea    rcx,[rip+0x30fe0]        # ec63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d7c6>
      e953d0:	48 8d 9c 24 90 0f 00 	lea    rbx,[rsp+0xf90]
      e953d7:	00 
      e953d8:	6a 08                	push   0x8
      e953da:	41 59                	pop    r9
      e953dc:	48 89 df             	mov    rdi,rbx
      e953df:	31 d2                	xor    edx,edx
      e953e1:	e8 ae 53 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e953e6:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
      e953ed:	00 
      e953ee:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e953f1:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e953f8:	00 
      e953f9:	48 89 da             	mov    rdx,rbx
      e953fc:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e953ff:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95404:	48 8d b8 88 00 00 00 	lea    rdi,[rax+0x88]
      e9540b:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e95412:	00 
      e95413:	48 89 de             	mov    rsi,rbx
      e95416:	e8 23 46 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e9541b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e9541f:	e8 62 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95424:	40 84 ed             	test   bpl,bpl
      e95427:	74 0f                	je     e95438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c84e>
      e95429:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e95430:	00 
      e95431:	e8 9e 47 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e95436:	eb 0d                	jmp    e95445 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c85b>
      e95438:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e9543f:	00 
      e95440:	e8 a3 53 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e95445:	4c 8b 7c 24 68       	mov    r15,QWORD PTR [rsp+0x68]
      e9544a:	4c 8b b4 24 c0 00 00 	mov    r14,QWORD PTR [rsp+0xc0]
      e95451:	00 
      e95452:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95457:	48 8d b8 98 00 00 00 	lea    rdi,[rax+0x98]
      e9545e:	e8 2b 2e c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95463:	48 8b 9c 24 d0 00 00 	mov    rbx,QWORD PTR [rsp+0xd0]
      e9546a:	00 
      e9546b:	48 89 df             	mov    rdi,rbx
      e9546e:	e8 13 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95473:	31 ff                	xor    edi,edi
      e95475:	e8 a2 8f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9547a:	48 89 df             	mov    rdi,rbx
      e9547d:	e8 04 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95482:	31 ff                	xor    edi,edi
      e95484:	e8 fd 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95489:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e9548e:	e8 f3 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95493:	ba c0 00 00 00       	mov    edx,0xc0
      e95498:	4c 89 ff             	mov    rdi,r15

### all [rbx+0x428] refs in this FDE
- 0xe95a7d: mov    rax,QWORD PTR [rbx+0x428]
      e95a52:	0f 29 84 24 e0 02 00 	movaps XMMWORD PTR [rsp+0x2e0],xmm0
      e95a59:	00 
      e95a5a:	48 85 c0             	test   rax,rax
      e95a5d:	74 05                	je     e95a64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ce7a>
      e95a5f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95a64:	66 48 0f 6e cd       	movq   xmm1,rbp
      e95a69:	66 48 0f 6e c1       	movq   xmm0,rcx
      e95a6e:	48 8b 83 18 04 00 00 	mov    rax,QWORD PTR [rbx+0x418]
      e95a75:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
      e95a7c:	00 
      e95a7d:	48 8b 83 28 04 00 00 	mov    rax,QWORD PTR [rbx+0x428]
      e95a84:	48 89 84 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rax
      e95a8b:	00 
      e95a8c:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
      e95a90:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
      e95a97:	00 
      e95a98:	48 8b 83 40 04 00 00 	mov    rax,QWORD PTR [rbx+0x440]
      e95a9f:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
      e95aa6:	00 
      e95aa7:	0f 57 d2             	xorps  xmm2,xmm2
      e95aaa:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
      e95ab1:	00 
      e95ab2:	74 18                	je     e95acc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cee2>
      e95ab4:	0f 10 93 58 04 00 00 	movups xmm2,XMMWORD PTR [rbx+0x458]
      e95abb:	48 8b 83 60 04 00 00 	mov    rax,QWORD PTR [rbx+0x460]
      e95ac2:	48 85 c0             	test   rax,rax
      e95ac5:	74 05                	je     e95acc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cee2>
      e95ac7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
- 0xe96029: mov    rax,QWORD PTR [rbx+0x428]
      e95fff:	48 89 84 24 80 0d 00 	mov    QWORD PTR [rsp+0xd80],rax
      e96006:	00 
      e96007:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      e9600c:	48 89 84 24 88 0d 00 	mov    QWORD PTR [rsp+0xd88],rax
      e96013:	00 
      e96014:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      e9601b:	00 
      e9601c:	48 89 84 24 90 0d 00 	mov    QWORD PTR [rsp+0xd90],rax
      e96023:	00 
      e96024:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e96029:	48 8b 83 28 04 00 00 	mov    rax,QWORD PTR [rbx+0x428]
      e96030:	48 89 84 24 98 0d 00 	mov    QWORD PTR [rsp+0xd98],rax
      e96037:	00 
      e96038:	48 8b 83 98 05 00 00 	mov    rax,QWORD PTR [rbx+0x598]
      e9603f:	48 89 84 24 a0 0d 00 	mov    QWORD PTR [rsp+0xda0],rax
      e96046:	00 
      e96047:	4c 8d ac 24 40 0a 00 	lea    r13,[rsp+0xa40]
      e9604e:	00 
      e9604f:	41 88 6d f0          	mov    BYTE PTR [r13-0x10],bpl
      e96053:	45 89 75 f4          	mov    DWORD PTR [r13-0xc],r14d
      e96057:	45 88 7d f8          	mov    BYTE PTR [r13-0x8],r15b
      e9605b:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]
      e96062:	00 
      e96063:	4c 89 ef             	mov    rdi,r13
      e96066:	e8 ab 88 ff ff       	call   e8e916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d2c>
      e9606b:	0f 28 84 24 d0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1d0]
      e96072:	00 
      e96073:	0f 29 84 24 c0 0a 00 	movaps XMMWORD PTR [rsp+0xac0],xmm0

## Relocations targeting e92f2c or caller-family methods

## Code materializations of owner AP 0x1834498
### 0xece5be; FDE=(15525244, 15530574)
      ece57d:	41 57                	push   r15
      ece57f:	41 56                	push   r14
      ece581:	41 55                	push   r13
      ece583:	41 54                	push   r12
      ece585:	53                   	push   rbx
      ece586:	48 81 ec 68 01 00 00 	sub    rsp,0x168
      ece58d:	4d 89 cc             	mov    r12,r9
      ece590:	4d 89 c5             	mov    r13,r8
      ece593:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      ece598:	48 89 d5             	mov    rbp,rdx
      ece59b:	49 89 f6             	mov    r14,rsi
      ece59e:	48 89 fb             	mov    rbx,rdi
      ece5a1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ece5a8:	00 00 
      ece5aa:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
      ece5b1:	00 
      ece5b2:	48 8d 35 af 61 50 ff 	lea    rsi,[rip+0xffffffffff5061af]        # 3d4768 <_ZTSN5boost17bad_function_callE@@Base+0x1aae>
      ece5b9:	e8 34 84 ff ff       	call   ec69f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de08>
      ece5be:	48 8d 05 d3 5e 96 00 	lea    rax,[rip+0x965ed3]        # 1834498 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6430>
      ece5c5:	48 89 03             	mov    QWORD PTR [rbx],rax
      ece5c8:	bf 30 01 00 00       	mov    edi,0x130
      ece5cd:	e8 2e f9 91 00       	call   17edf00 <_Znwm@plt>
      ece5d2:	49 89 c7             	mov    r15,rax
      ece5d5:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
      ece5dc:	00 
      ece5dd:	48 89 c7             	mov    rdi,rax
      ece5e0:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      ece5e5:	4c 89 f6             	mov    rsi,r14
      ece5e8:	48 89 ea             	mov    rdx,rbp
      ece5eb:	e8 50 8b 01 00       	call   ee7140 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae556>
      ece5f0:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
      ece5f5:	4c 89 64 24 38       	mov    QWORD PTR [rsp+0x38],r12
      ece5fa:	4c 89 bb c8 01 00 00 	mov    QWORD PTR [rbx+0x1c8],r15
      ece601:	48 8d bb d0 01 00 00 	lea    rdi,[rbx+0x1d0]
      ece608:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
      ece60d:	e8 e4 b3 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ece612:	bf 30 01 00 00       	mov    edi,0x130
      ece617:	e8 e4 f8 91 00       	call   17edf00 <_Znwm@plt>
      ece61c:	49 89 c7             	mov    r15,rax
      ece61f:	66 c7 00 7e 00       	mov    WORD PTR [rax],0x7e
      ece624:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ece629:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      ece62d:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
      ece632:	49 89 6f 10          	mov    QWORD PTR [r15+0x10],rbp
      ece636:	4d 8d 6f 18          	lea    r13,[r15+0x18]
      ece63a:	4c 89 ef             	mov    rdi,r13
      ece63d:	e8 4c 9c c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ece642:	49 8d 6f 70          	lea    rbp,[r15+0x70]
      ece646:	0f 57 c0             	xorps  xmm0,xmm0
      ece649:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
      ece650:	00 
      ece651:	41 0f 11 47 70       	movups XMMWORD PTR [r15+0x70],xmm0
      ece656:	b8 00 00 80 3f       	mov    eax,0x3f800000
      ece65b:	41 89 87 90 00 00 00 	mov    DWORD PTR [r15+0x90],eax
      ece662:	41 c6 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],0x1
      ece669:	01 
      ece66a:	4d 8d a7 a0 00 00 00 	lea    r12,[r15+0xa0]

## Relocation neighborhood around 0x1834498
- 0x1834440: 0xece06e, FDE=(15523950, 15523972)
- 0x1834448: 0xee6db8, FDE=(15625656, 15626175)
- 0x1834460: 0xee6b2a, FDE=(15625002, 15625017)
- 0x1834468: 0xee6b3a, FDE=(15625018, 15625036)
- 0x1834470: 0xee6b4c, FDE=(15625036, 15625045)
- 0x1834480: 0xa50370, FDE=(10814320, 10814325)
- 0x1834498: 0xecfc7e, FDE=(15531134, 15531543)
- 0x18344a0: 0xed0a5e, FDE=(15534686, 15534704)
- 0x18344a8: 0xaf6576, FDE=(11494774, 11494779)
- 0x18344b0: 0xec70f2, FDE=(15495410, 15495444)
- 0x18344b8: 0x9d81d0, FDE=(10322384, 10322387)
- 0x18344c0: 0x9d7de0, FDE=(10321376, 10321377)
- 0x18344c8: 0x9d7de0, FDE=(10321376, 10321377)
- 0x18344d0: 0xed0a70, FDE=(15534704, 15539299)
- 0x18344d8: 0x9d7de0, FDE=(10321376, 10321377)
- 0x18344e0: 0x9d7de0, FDE=(10321376, 10321377)
- 0x18344e8: 0x9d7de0, FDE=(10321376, 10321377)
- 0x18344f0: 0x155e8c6, FDE=(22407366, 22407375)
- 0x18344f8: 0x155e8d0, FDE=(22407376, 22407385)
- 0x1834500: 0xed1c64, FDE=(15539300, 15543202)
- 0x1834508: 0x9d7de0, FDE=(10321376, 10321377)
- 0x1834510: 0xd8d19e, FDE=(14209438, 14209456)
- 0x1834518: 0xec7170, FDE=(15495536, 15495553)
- 0x1834520: 0xed2ba2, FDE=(15543202, 15543210)
- 0x1834528: 0xed2baa, FDE=(15543210, 15543606)
- 0x1834530: 0x9d7de0, FDE=(10321376, 10321377)
- 0x1834538: 0x9d7de0, FDE=(10321376, 10321377)
- 0x1834540: 0x9d7de0, FDE=(10321376, 10321377)
- 0x1834548: 0x9d7de0, FDE=(10321376, 10321377)
- 0x1834550: 0xed2d36, FDE=(15543606, 15543611)
- 0x1834558: 0xed2d3c, FDE=(15543612, 15544571)
- 0x1834560: 0x9d81d0, FDE=(10322384, 10322387)
- 0x1834568: 0xed30fc, FDE=(15544572, 15544688)
- 0x1834570: 0x9d7de0, FDE=(10321376, 10321377)
- 0x1834578: 0xa5bbf0, FDE=(10861552, 10861557)

## ecee constructor FDE=(15525244, 15530574); incoming [rsp+0x1c8] = entry stack +0x30
Under SysV with six register args, entry stack +0x30 is argument 12.
- direct callers: 2
### caller 0xece198; FDE=(15523972, 15525243)
      ece07f:	e9 9c fe 91 00       	jmp    17edf20 <_ZdlPv@plt>
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
      ece117:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      ece11e:	00 
      ece11f:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
      ece126:	00 
      ece127:	e8 64 c1 ba ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ece12c:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
      ece133:	00 
      ece134:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
      ece13b:	00 
      ece13c:	4c 89 ef             	mov    rdi,r13
      ece13f:	e8 4c c1 ba ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ece144:	49 8d 4e 20          	lea    rcx,[r14+0x20]
      ece148:	4d 8d 46 30          	lea    r8,[r14+0x30]
      ece14c:	4d 8d 4e 40          	lea    r9,[r14+0x40]
      ece150:	49 8d 86 b0 00 00 00 	lea    rax,[r14+0xb0]
      ece157:	4d 8d 96 68 01 00 00 	lea    r10,[r14+0x168]
      ece15e:	4d 8d 9e 78 01 00 00 	lea    r11,[r14+0x178]
      ece165:	49 8d ae 88 01 00 00 	lea    rbp,[r14+0x188]
      ece16c:	49 81 c6 a0 01 00 00 	add    r14,0x1a0
      ece173:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
      ece177:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
      ece17b:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
      ece180:	4c 89 e2             	mov    rdx,r12
      ece183:	41 56                	push   r14
      ece185:	55                   	push   rbp
      ece186:	41 53                	push   r11
      ece188:	41 52                	push   r10
      ece18a:	41 57                	push   r15
      ece18c:	50                   	push   rax
      ece18d:	41 55                	push   r13
      ece18f:	48 8d 84 24 68 01 00 	lea    rax,[rsp+0x168]
      ece196:	00 
      ece197:	50                   	push   rax
      ece198:	e8 df 03 00 00       	call   ece57c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95992>
      ece19d:	48 83 c4 40          	add    rsp,0x40
      ece1a1:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      ece1a8:	00 
      ece1a9:	e8 bc bd ba ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ece1ae:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      ece1b5:	00 
      ece1b6:	e8 af bd ba ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ece1bb:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      ece1c0:	48 8b 87 98 00 00 00 	mov    rax,QWORD PTR [rdi+0x98]
      ece1c7:	48 85 c0             	test   rax,rax
      ece1ca:	48 8d 0d 67 75 ab 00 	lea    rcx,[rip+0xab7567]        # 1985738 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4e380>
      ece1d1:	48 0f 45 c8          	cmovne rcx,rax
      ece1d5:	8a 41 20             	mov    al,BYTE PTR [rcx+0x20]
      ece1d8:	88 83 60 04 00 00    	mov    BYTE PTR [rbx+0x460],al
      ece1de:	e8 6b 18 00 00       	call   ecfa4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96e64>
      ece1e3:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
      ece1e7:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
      ece1eb:	40 f6 c6 01          	test   sil,0x1
      ece1ef:	0f 85 ce 02 00 00    	jne    ece4c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x958d9>
      ece1f5:	48 83 c0 18          	add    rax,0x18
      ece1f9:	48 89 c7             	mov    rdi,rax
      ece1fc:	e8 4f 76 89 00       	call   1765850 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1199bc>
      ece201:	48 8d bb 68 04 00 00 	lea    rdi,[rbx+0x468]
      ece208:	48 89 c6             	mov    rsi,rax
      ece20b:	e8 1e d8 ba ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      ece210:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
      ece215:	41 80 bf 30 09 00 00 	cmp    BYTE PTR [r15+0x930],0x0
      ece21c:	00 
      ece21d:	0f 84 06 02 00 00    	je     ece429 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9583f>
      ece223:	49 8d af f0 04 00 00 	lea    rbp,[r15+0x4f0]
      ece22a:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ece22f:	48 89 ee             	mov    rsi,rbp
      ece232:	e8 d8 44 43 00       	call   130270f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x147c93>
      ece237:	49 81 c7 c0 04 00 00 	add    r15,0x4c0
      ece23e:	48 8d bb 80 04 00 00 	lea    rdi,[rbx+0x480]

### caller 0xee6ebd; FDE=(15625656, 15626175)
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
      ee6e49:	00 
      ee6e4a:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      ee6e4f:	e8 3c 34 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ee6e54:	4c 8d a4 24 80 00 00 	lea    r12,[rsp+0x80]
      ee6e5b:	00 
      ee6e5c:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      ee6e61:	4c 89 e7             	mov    rdi,r12
      ee6e64:	e8 27 34 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ee6e69:	49 8d 4d 20          	lea    rcx,[r13+0x20]
      ee6e6d:	4d 8d 45 30          	lea    r8,[r13+0x30]
      ee6e71:	4d 8d 4d 40          	lea    r9,[r13+0x40]
      ee6e75:	49 8d 85 b0 00 00 00 	lea    rax,[r13+0xb0]
      ee6e7c:	4d 8d 95 68 01 00 00 	lea    r10,[r13+0x168]
      ee6e83:	4d 8d 9d 78 01 00 00 	lea    r11,[r13+0x178]
      ee6e8a:	49 8d 9d 88 01 00 00 	lea    rbx,[r13+0x188]
      ee6e91:	49 81 c5 a0 01 00 00 	add    r13,0x1a0
      ee6e98:	49 83 c7 20          	add    r15,0x20
      ee6e9c:	4c 89 ff             	mov    rdi,r15
      ee6e9f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
      ee6ea4:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      ee6ea9:	41 55                	push   r13
      ee6eab:	53                   	push   rbx
      ee6eac:	41 53                	push   r11
      ee6eae:	41 52                	push   r10
      ee6eb0:	55                   	push   rbp
      ee6eb1:	50                   	push   rax
      ee6eb2:	41 54                	push   r12
      ee6eb4:	48 8d 84 24 e8 00 00 	lea    rax,[rsp+0xe8]
      ee6ebb:	00 
      ee6ebc:	50                   	push   rax
      ee6ebd:	e8 ba 76 fe ff       	call   ece57c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95992>
      ee6ec2:	48 83 c4 40          	add    rsp,0x40
      ee6ec6:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ee6ecd:	00 
      ee6ece:	e8 97 30 b9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ee6ed3:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      ee6eda:	00 
      ee6edb:	e8 8a 30 b9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ee6ee0:	4c 89 ff             	mov    rdi,r15
      ee6ee3:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
      ee6ee8:	e8 5b 6d ff ff       	call   eddc48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa505e>
      ee6eed:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ee6ef2:	e8 73 30 b9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ee6ef7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ee6efc:	e8 69 30 b9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ee6f01:	31 ff                	xor    edi,edi
      ee6f03:	e8 14 75 bb ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ee6f08:	4d 89 3e             	mov    QWORD PTR [r14],r15
      ee6f0b:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      ee6f0f:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      ee6f13:	31 ff                	xor    edi,edi
      ee6f15:	e8 6c 75 bb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ee6f1a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ee6f21:	00 00 
      ee6f23:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
      ee6f2a:	00 
      ee6f2b:	0f 85 89 00 00 00    	jne    ee6fba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae3d0>
      ee6f31:	4c 89 f0             	mov    rax,r14
      ee6f34:	48 81 c4 e8 00 00 00 	add    rsp,0xe8
      ee6f3b:	5b                   	pop    rbx
      ee6f3c:	41 5c                	pop    r12
      ee6f3e:	41 5d                	pop    r13
      ee6f40:	41 5e                	pop    r14
      ee6f42:	41 5f                	pop    r15
      ee6f44:	5d                   	pop    rbp
      ee6f45:	c3                   	ret

## Relocation slots targeting ece57c

## All QWORD pointer writes to object+0x428
### 0xae3b6d: mov    QWORD PTR [rsp+0x428],rax; FDE=(11415662, 11422402)
      ae3b27:	e9 01 02 00 00       	jmp    ae3d2d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30ccd>
      ae3b2c:	83 f9 01             	cmp    ecx,0x1
      ae3b2f:	77 05                	ja     ae3b36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30ad6>
      ae3b31:	48 21 f0             	and    rax,rsi
      ae3b34:	eb 0d                	jmp    ae3b43 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30ae3>
      ae3b36:	4c 39 e8             	cmp    rax,r13
      ae3b39:	72 08                	jb     ae3b43 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30ae3>
      ae3b3b:	31 d2                	xor    edx,edx
      ae3b3d:	49 f7 f5             	div    r13
      ae3b40:	48 89 d0             	mov    rax,rdx
      ae3b43:	4c 39 f0             	cmp    rax,r14
      ae3b46:	75 08                	jne    ae3b50 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30af0>
      ae3b48:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
      ae3b4b:	48 85 db             	test   rbx,rbx
      ae3b4e:	75 c8                	jne    ae3b18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30ab8>
      ae3b50:	bf d8 01 00 00       	mov    edi,0x1d8
      ae3b55:	e8 a6 a3 d0 00       	call   17edf00 <_Znwm@plt>
      ae3b5a:	48 89 c3             	mov    rbx,rax
      ae3b5d:	48 89 84 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rax
      ae3b64:	00 
      ae3b65:	48 8d 84 24 e0 01 00 	lea    rax,[rsp+0x1e0]
      ae3b6c:	00 
      ae3b6d:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
      ae3b74:	00 
      ae3b75:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      ae3b79:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
      ae3b7d:	44 89 7b 10          	mov    DWORD PTR [rbx+0x10],r15d
      ae3b81:	49 89 dc             	mov    r12,rbx
      ae3b84:	49 83 c4 18          	add    r12,0x18
      ae3b88:	ba c0 01 00 00       	mov    edx,0x1c0
      ae3b8d:	4c 89 e7             	mov    rdi,r12
      ae3b90:	31 f6                	xor    esi,esi
      ae3b92:	e8 f9 af d0 00       	call   17eeb90 <memset@plt>
      ae3b97:	4c 89 e7             	mov    rdi,r12
      ae3b9a:	e8 89 34 00 00       	call   ae7028 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x33fc8>
      ae3b9f:	48 8b 84 24 e8 01 00 	mov    rax,QWORD PTR [rsp+0x1e8]
      ae3ba6:	00 
      ae3ba7:	48 ff c0             	inc    rax
      ae3baa:	78 07                	js     ae3bb3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30b53>
      ae3bac:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
      ae3bb1:	eb 15                	jmp    ae3bc8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30b68>
      ae3bb3:	48 89 c1             	mov    rcx,rax
      ae3bb6:	48 d1 e9             	shr    rcx,1
      ae3bb9:	83 e0 01             	and    eax,0x1
      ae3bbc:	48 09 c8             	or     rax,rcx
      ae3bbf:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
      ae3bc4:	f3 0f 58 c0          	addss  xmm0,xmm0
      ae3bc8:	4c 89 e9             	mov    rcx,r13
      ae3bcb:	48 d1 e9             	shr    rcx,1
      ae3bce:	44 89 e8             	mov    eax,r13d
      ae3bd1:	83 e0 01             	and    eax,0x1

### 0xae40ec: mov    QWORD PTR [rsp+0x428],rax; FDE=(11415662, 11422402)
      ae4094:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      ae4099:	0f 57 c0             	xorps  xmm0,xmm0
      ae409c:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
      ae40a1:	49 83 66 18 00       	and    QWORD PTR [r14+0x18],0x0
      ae40a6:	49 83 c4 20          	add    r12,0x20
      ae40aa:	4c 89 a4 24 30 04 00 	mov    QWORD PTR [rsp+0x430],r12
      ae40b1:	00 
      ae40b2:	48 8b 94 24 00 02 00 	mov    rdx,QWORD PTR [rsp+0x200]
      ae40b9:	00 
      ae40ba:	4c 89 bc 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],r15
      ae40c1:	00 
      ae40c2:	4c 89 bc 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],r15
      ae40c9:	00 
      ae40ca:	0f 10 84 24 e0 03 00 	movups xmm0,XMMWORD PTR [rsp+0x3e0]
      ae40d1:	00 
      ae40d2:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
      ae40d6:	48 8d ac 24 10 02 00 	lea    rbp,[rsp+0x210]
      ae40dd:	00 
      ae40de:	48 89 ef             	mov    rdi,rbp
      ae40e1:	48 89 de             	mov    rsi,rbx
      ae40e4:	e8 b4 21 00 00       	call   ae629d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3323d>
      ae40e9:	49 89 c5             	mov    r13,rax
      ae40ec:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
      ae40f3:	00 
      ae40f4:	48 8b 84 24 08 02 00 	mov    rax,QWORD PTR [rsp+0x208]
      ae40fb:	00 
      ae40fc:	4c 89 a4 24 90 01 00 	mov    QWORD PTR [rsp+0x190],r12
      ae4103:	00 
      ae4104:	4c 89 a4 24 70 01 00 	mov    QWORD PTR [rsp+0x170],r12
      ae410b:	00 
      ae410c:	48 89 ac 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rbp
      ae4113:	00 
      ae4114:	48 8d 8c 24 70 01 00 	lea    rcx,[rsp+0x170]
      ae411b:	00 
      ae411c:	48 89 8c 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rcx
      ae4123:	00 
      ae4124:	48 8d 8c 24 90 01 00 	lea    rcx,[rsp+0x190]
      ae412b:	00 
      ae412c:	48 89 8c 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rcx
      ae4133:	00 
      ae4134:	48 39 d8             	cmp    rax,rbx
      ae4137:	74 52                	je     ae418b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3112b>
      ae4139:	0f 57 c9             	xorps  xmm1,xmm1
      ae413c:	48 8b 6c 24 58       	mov    rbp,QWORD PTR [rsp+0x58]
      ae4141:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      ae4144:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
      ae4148:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
      ae414c:	41 0f 11 44 24 08    	movups XMMWORD PTR [r12+0x8],xmm0
      ae4152:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      ae4156:	49 89 4c 24 18       	mov    QWORD PTR [r12+0x18],rcx
      ae415b:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0

### 0xd4cf5f: mov    QWORD PTR [rsp+0x428],r15; FDE=(13944548, 13959782)
      d4cf02:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      d4cf05:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      d4cf09:	48 83 a4 24 a0 01 00 	and    QWORD PTR [rsp+0x1a0],0x0
      d4cf10:	00 00 
      d4cf12:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
      d4cf19:	00 
      d4cf1a:	66 0f ef c0          	pxor   xmm0,xmm0
      d4cf1e:	66 0f 7f 84 24 90 01 	movdqa XMMWORD PTR [rsp+0x190],xmm0
      d4cf25:	00 00 
      d4cf27:	48 85 c0             	test   rax,rax
      d4cf2a:	48 8d 9c 24 20 04 00 	lea    rbx,[rsp+0x420]
      d4cf31:	00 
      d4cf32:	0f 84 a2 02 00 00    	je     d4d1da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a260>
      d4cf38:	4c 8b 28             	mov    r13,QWORD PTR [rax]
      d4cf3b:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      d4cf3f:	4d 39 f5             	cmp    r13,r14
      d4cf42:	0f 84 92 02 00 00    	je     d4d1da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a260>
      d4cf48:	4c 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r14
      d4cf4f:	00 
      d4cf50:	48 8d 05 11 06 ab 00 	lea    rax,[rip+0xab0611]        # 17fd568 <_ZTINSt6__ndk117bad_function_callE@@Base+0x608>
      d4cf57:	48 89 84 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rax
      d4cf5e:	00 
      d4cf5f:	4c 89 bc 24 28 04 00 	mov    QWORD PTR [rsp+0x428],r15
      d4cf66:	00 
      d4cf67:	48 89 9c 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rbx
      d4cf6e:	00 
      d4cf6f:	49 8d 55 60          	lea    rdx,[r13+0x60]
      d4cf73:	4c 8d a4 24 80 05 00 	lea    r12,[rsp+0x580]
      d4cf7a:	00 
      d4cf7b:	4c 89 e7             	mov    rdi,r12
      d4cf7e:	48 89 de             	mov    rsi,rbx
      d4cf81:	e8 77 5d 89 00       	call   15e2cfd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x428281>
      d4cf86:	48 89 df             	mov    rdi,rbx
      d4cf89:	e8 dc cf d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d4cf8e:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      d4cf95:	00 
      d4cf96:	4c 89 e6             	mov    rsi,r12
      d4cf99:	e8 20 ed d7 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      d4cf9e:	6a 18                	push   0x18
      d4cfa0:	5f                   	pop    rdi
      d4cfa1:	e8 5a 0f aa 00       	call   17edf00 <_Znwm@plt>
      d4cfa6:	49 89 c4             	mov    r12,rax
      d4cfa9:	0f 28 8c 24 00 03 00 	movaps xmm1,XMMWORD PTR [rsp+0x300]
      d4cfb0:	00 
      d4cfb1:	48 8b 84 24 08 03 00 	mov    rax,QWORD PTR [rsp+0x308]
      d4cfb8:	00 
      d4cfb9:	66 0f ef c0          	pxor   xmm0,xmm0
      d4cfbd:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0
      d4cfc4:	00 00 
      d4cfc6:	48 8d 0d 63 ba ad 00 	lea    rcx,[rip+0xadba63]        # 1828a30 <_ZTIN4asio2ip16bad_address_castE@@Base+0x5060>
      d4cfcd:	49 89 0c 24          	mov    QWORD PTR [r12],rcx

### 0xd4dee4: mov    QWORD PTR [rsp+0x428],rax; FDE=(13944548, 13959782)
      d4de90:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      d4de94:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
      d4de9b:	00 
      d4de9c:	48 89 ef             	mov    rdi,rbp
      d4de9f:	ff 50 38             	call   QWORD PTR [rax+0x38]
      d4dea2:	48 8b bc 24 48 01 00 	mov    rdi,QWORD PTR [rsp+0x148]
      d4dea9:	00 
      d4deaa:	e8 d7 05 d5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d4deaf:	48 8b bc 24 20 04 00 	mov    rdi,QWORD PTR [rsp+0x420]
      d4deb6:	00 
      d4deb7:	48 83 a4 24 20 04 00 	and    QWORD PTR [rsp+0x420],0x0
      d4debe:	00 00 
      d4dec0:	48 85 ff             	test   rdi,rdi
      d4dec3:	74 06                	je     d4decb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1af51>
      d4dec5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d4dec8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      d4decb:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d4decf:	4c 89 e7             	mov    rdi,r12
      d4ded2:	ff 50 58             	call   QWORD PTR [rax+0x58]
      d4ded5:	48 8d 0d 7c 76 ad 00 	lea    rcx,[rip+0xad767c]        # 1825558 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1b88>
      d4dedc:	48 89 8c 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rcx
      d4dee3:	00 
      d4dee4:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
      d4deeb:	00 
      d4deec:	4c 89 bc 24 30 04 00 	mov    QWORD PTR [rsp+0x430],r15
      d4def3:	00 
      d4def4:	48 89 9c 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rbx
      d4defb:	00 
      d4defc:	49 39 de             	cmp    r14,rbx
      d4deff:	4c 8b bc 24 d8 00 00 	mov    r15,QWORD PTR [rsp+0xd8]
      d4df06:	00 
      d4df07:	0f 84 91 00 00 00    	je     d4df9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b024>
      d4df0d:	48 8d 84 24 28 04 00 	lea    rax,[rsp+0x428]
      d4df14:	00 
      d4df15:	49 8b 57 40          	mov    rdx,QWORD PTR [r15+0x40]
      d4df19:	4c 39 f2             	cmp    rdx,r14
      d4df1c:	74 18                	je     d4df36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1afbc>
      d4df1e:	49 89 4f 20          	mov    QWORD PTR [r15+0x20],rcx
      d4df22:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      d4df26:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
      d4df2c:	48 89 94 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rdx
      d4df33:	00 
      d4df34:	eb 64                	jmp    d4df9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b020>
      d4df36:	48 89 8c 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rcx
      d4df3d:	00 
      d4df3e:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      d4df42:	f3 0f 7f 84 24 08 03 	movdqu XMMWORD PTR [rsp+0x308],xmm0
      d4df49:	00 00 
      d4df4b:	48 8d 9c 24 20 04 00 	lea    rbx,[rsp+0x420]
      d4df52:	00 
      d4df53:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0

### 0xd4e1ed: mov    QWORD PTR [rsp+0x428],rax; FDE=(13944548, 13959782)
      d4e199:	00 
      d4e19a:	48 89 84 24 b0 05 00 	mov    QWORD PTR [rsp+0x5b0],rax
      d4e1a1:	00 
      d4e1a2:	bf f0 00 00 00       	mov    edi,0xf0
      d4e1a7:	e8 54 fd a9 00       	call   17edf00 <_Znwm@plt>
      d4e1ac:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
      d4e1b1:	49 89 c4             	mov    r12,rax
      d4e1b4:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      d4e1bb:	00 
      d4e1bc:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
      d4e1c3:	00 
      d4e1c4:	e8 8d 02 01 00       	call   d5e456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4dc>
      d4e1c9:	48 83 a4 24 a0 04 00 	and    QWORD PTR [rsp+0x4a0],0x0
      d4e1d0:	00 00 
      d4e1d2:	6a 40                	push   0x40
      d4e1d4:	5f                   	pop    rdi
      d4e1d5:	e8 26 fd a9 00       	call   17edf00 <_Znwm@plt>
      d4e1da:	49 89 c6             	mov    r14,rax
      d4e1dd:	48 89 84 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rax
      d4e1e4:	00 
      d4e1e5:	48 8d 84 24 c0 05 00 	lea    rax,[rsp+0x5c0]
      d4e1ec:	00 
      d4e1ed:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
      d4e1f4:	00 
      d4e1f5:	48 c7 84 24 30 04 00 	mov    QWORD PTR [rsp+0x430],0x1
      d4e1fc:	00 01 00 00 00 
      d4e201:	48 8d 05 58 85 ad 00 	lea    rax,[rip+0xad8558]        # 1826760 <_ZTIN4asio2ip16bad_address_castE@@Base+0x2d90>
      d4e208:	49 89 06             	mov    QWORD PTR [r14],rax
      d4e20b:	4c 89 f7             	mov    rdi,r14
      d4e20e:	48 83 c7 08          	add    rdi,0x8
      d4e212:	48 8d b4 24 00 03 00 	lea    rsi,[rsp+0x300]
      d4e219:	00 
      d4e21a:	e8 37 02 01 00       	call   d5e456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4dc>
      d4e21f:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      d4e226:	00 
      d4e227:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d4e22b:	49 8d 6d 10          	lea    rbp,[r13+0x10]
      d4e22f:	48 8d 9c 24 80 04 00 	lea    rbx,[rsp+0x480]
      d4e236:	00 
      d4e237:	4c 89 73 20          	mov    QWORD PTR [rbx+0x20],r14
      d4e23b:	e8 8a c0 d2 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      d4e240:	48 8d 05 a9 85 ad 00 	lea    rax,[rip+0xad85a9]        # 18267f0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x2e20>
      d4e247:	49 89 04 24          	mov    QWORD PTR [r12],rax
      d4e24b:	4d 89 7c 24 08       	mov    QWORD PTR [r12+0x8],r15
      d4e250:	4d 89 6c 24 10       	mov    QWORD PTR [r12+0x10],r13
      d4e255:	48 89 ac 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rbp
      d4e25c:	00 
      d4e25d:	49 89 6c 24 18       	mov    QWORD PTR [r12+0x18],rbp
      d4e262:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
      d4e267:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
      d4e26c:	48 89 de             	mov    rsi,rbx

### 0xd4e466: mov    QWORD PTR [rsp+0x428],r13; FDE=(13944548, 13959782)
      d4e40d:	48 89 84 24 b0 05 00 	mov    QWORD PTR [rsp+0x5b0],rax
      d4e414:	00 
      d4e415:	bf a0 01 00 00       	mov    edi,0x1a0
      d4e41a:	e8 e1 fa a9 00       	call   17edf00 <_Znwm@plt>
      d4e41f:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      d4e424:	4c 8b b4 24 20 05 00 	mov    r14,QWORD PTR [rsp+0x520]
      d4e42b:	00 
      d4e42c:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
      d4e433:	00 00 
      d4e435:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      d4e43c:	00 
      d4e43d:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
      d4e444:	00 
      d4e445:	e8 0c 00 01 00       	call   d5e456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4dc>
      d4e44a:	48 83 a4 24 a0 04 00 	and    QWORD PTR [rsp+0x4a0],0x0
      d4e451:	00 00 
      d4e453:	6a 40                	push   0x40
      d4e455:	5f                   	pop    rdi
      d4e456:	e8 a5 fa a9 00       	call   17edf00 <_Znwm@plt>
      d4e45b:	48 89 c5             	mov    rbp,rax
      d4e45e:	48 89 84 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rax
      d4e465:	00 
      d4e466:	4c 89 ac 24 28 04 00 	mov    QWORD PTR [rsp+0x428],r13
      d4e46d:	00 
      d4e46e:	48 c7 84 24 30 04 00 	mov    QWORD PTR [rsp+0x430],0x1
      d4e475:	00 01 00 00 00 
      d4e47a:	48 8d 05 27 83 ad 00 	lea    rax,[rip+0xad8327]        # 18267a8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x2dd8>
      d4e481:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      d4e485:	48 89 ef             	mov    rdi,rbp
      d4e488:	48 83 c7 08          	add    rdi,0x8
      d4e48c:	48 8d b4 24 00 03 00 	lea    rsi,[rsp+0x300]
      d4e493:	00 
      d4e494:	e8 bd ff 00 00       	call   d5e456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4dc>
      d4e499:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      d4e4a0:	00 
      d4e4a1:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d4e4a5:	48 89 ac 24 a0 04 00 	mov    QWORD PTR [rsp+0x4a0],rbp
      d4e4ac:	00 
      d4e4ad:	e8 18 be d2 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      d4e4b2:	48 8d 05 b7 7c ad 00 	lea    rax,[rip+0xad7cb7]        # 1826170 <_ZTIN4asio2ip16bad_address_castE@@Base+0x27a0>
      d4e4b9:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      d4e4be:	48 89 01             	mov    QWORD PTR [rcx],rax
      d4e4c1:	48 8d 05 d0 7d ad 00 	lea    rax,[rip+0xad7dd0]        # 1826298 <_ZTIN4asio2ip16bad_address_castE@@Base+0x28c8>
      d4e4c8:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      d4e4cc:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15
      d4e4d0:	4c 89 71 18          	mov    QWORD PTR [rcx+0x18],r14
      d4e4d4:	49 89 ce             	mov    r14,rcx
      d4e4d7:	48 8d 41 20          	lea    rax,[rcx+0x20]
      d4e4db:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      d4e4e0:	4c 89 61 20          	mov    QWORD PTR [rcx+0x20],r12
      d4e4e4:	48 8d 59 28          	lea    rbx,[rcx+0x28]

### 0xd4ec8d: mov    QWORD PTR [rsp+0x428],rbp; FDE=(13944548, 13959782)
      d4ec36:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
      d4ec3a:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      d4ec41:	00 
      d4ec42:	e8 23 ea a5 00       	call   17ad66a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1617d6>
      d4ec47:	bf a0 02 00 00       	mov    edi,0x2a0
      d4ec4c:	e8 af f2 a9 00       	call   17edf00 <_Znwm@plt>
      d4ec51:	48 89 c3             	mov    rbx,rax
      d4ec54:	4c 89 b4 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r14
      d4ec5b:	00 
      d4ec5c:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      d4ec63:	00 
      d4ec64:	48 8d b4 24 80 04 00 	lea    rsi,[rsp+0x480]
      d4ec6b:	00 
      d4ec6c:	e8 e5 f7 00 00       	call   d5e456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4dc>
      d4ec71:	48 83 a4 24 e0 05 00 	and    QWORD PTR [rsp+0x5e0],0x0
      d4ec78:	00 00 
      d4ec7a:	6a 40                	push   0x40
      d4ec7c:	5f                   	pop    rdi
      d4ec7d:	e8 7e f2 a9 00       	call   17edf00 <_Znwm@plt>
      d4ec82:	49 89 c6             	mov    r14,rax
      d4ec85:	48 89 84 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rax
      d4ec8c:	00 
      d4ec8d:	48 89 ac 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rbp
      d4ec94:	00 
      d4ec95:	48 c7 84 24 30 04 00 	mov    QWORD PTR [rsp+0x430],0x1
      d4ec9c:	00 01 00 00 00 
      d4eca1:	48 8d 05 d0 72 ad 00 	lea    rax,[rip+0xad72d0]        # 1825f78 <_ZTIN4asio2ip16bad_address_castE@@Base+0x25a8>
      d4eca8:	49 89 06             	mov    QWORD PTR [r14],rax
      d4ecab:	4c 89 f7             	mov    rdi,r14
      d4ecae:	48 83 c7 08          	add    rdi,0x8
      d4ecb2:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
      d4ecb9:	00 
      d4ecba:	e8 97 f7 00 00       	call   d5e456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b4dc>
      d4ecbf:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      d4ecc6:	00 
      d4ecc7:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d4eccb:	4c 89 b4 24 e0 05 00 	mov    QWORD PTR [rsp+0x5e0],r14
      d4ecd2:	00 
      d4ecd3:	e8 f2 b5 d2 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      d4ecd8:	48 8d 05 e1 72 ad 00 	lea    rax,[rip+0xad72e1]        # 1825fc0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x25f0>
      d4ecdf:	48 89 84 24 50 05 00 	mov    QWORD PTR [rsp+0x550],rax
      d4ece6:	00 
      d4ece7:	4c 89 bc 24 58 05 00 	mov    QWORD PTR [rsp+0x558],r15
      d4ecee:	00 
      d4ecef:	48 89 ac 24 70 05 00 	mov    QWORD PTR [rsp+0x570],rbp
      d4ecf6:	00 
      d4ecf7:	48 8d 05 e2 fb ab 00 	lea    rax,[rip+0xabfbe2]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      d4ecfe:	48 89 84 24 20 05 00 	mov    QWORD PTR [rsp+0x520],rax
      d4ed05:	00 
      d4ed06:	48 8b 05 93 2d b6 00 	mov    rax,QWORD PTR [rip+0xb62d93]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      d4ed0d:	48 89 84 24 28 05 00 	mov    QWORD PTR [rsp+0x528],rax

### 0xd4f57f: mov    QWORD PTR [rsp+0x428],rbx; FDE=(13944548, 13959782)
      d4f525:	00 
      d4f526:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d4f52a:	4c 89 73 18          	mov    QWORD PTR [rbx+0x18],r14
      d4f52e:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
      d4f532:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      d4f537:	e8 ba a4 a8 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      d4f53c:	4c 89 7b 30          	mov    QWORD PTR [rbx+0x30],r15
      d4f540:	4c 89 63 38          	mov    QWORD PTR [rbx+0x38],r12
      d4f544:	4c 8d 7b 40          	lea    r15,[rbx+0x40]
      d4f548:	66 0f ef c0          	pxor   xmm0,xmm0
      d4f54c:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
      d4f551:	4c 8d 73 50          	lea    r14,[rbx+0x50]
      d4f555:	4c 89 f7             	mov    rdi,r14
      d4f558:	e8 99 a4 a8 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      d4f55d:	49 89 dc             	mov    r12,rbx
      d4f560:	49 83 c4 60          	add    r12,0x60
      d4f564:	4c 89 e7             	mov    rdi,r12
      d4f567:	e8 8a a4 a8 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      d4f56c:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      d4f570:	48 8d 05 b1 60 ad 00 	lea    rax,[rip+0xad60b1]        # 1825628 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1c58>
      d4f577:	48 89 84 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rax
      d4f57e:	00 
      d4f57f:	48 89 9c 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rbx
      d4f586:	00 
      d4f587:	4c 89 ac 24 40 04 00 	mov    QWORD PTR [rsp+0x440],r13
      d4f58e:	00 
      d4f58f:	4c 89 ff             	mov    rdi,r15
      d4f592:	48 8b 94 24 90 06 00 	mov    rdx,QWORD PTR [rsp+0x690]
      d4f599:	00 
      d4f59a:	4c 89 e9             	mov    rcx,r13
      d4f59d:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
      d4f5a2:	e8 6d 09 a7 00       	call   17bff14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174080>
      d4f5a7:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      d4f5ae:	00 
      d4f5af:	e8 b6 a9 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d4f5b4:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
      d4f5b8:	48 8d 35 6d 9c 6e ff 	lea    rsi,[rip+0xffffffffff6e9c6d]        # 43922c <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ec7b>
      d4f5bf:	e8 b4 09 a7 00       	call   17bff78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1740e4>
      d4f5c4:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
      d4f5c8:	48 8d 35 09 db 62 ff 	lea    rsi,[rip+0xffffffffff62db09]        # 37d0d8 <_ZTSSt12bad_any_cast@@Base-0x130f0>
      d4f5cf:	e8 a4 09 a7 00       	call   17bff78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1740e4>
      d4f5d4:	4c 8b 6b 10          	mov    r13,QWORD PTR [rbx+0x10]
      d4f5d8:	4c 8d bc 24 80 04 00 	lea    r15,[rsp+0x480]
      d4f5df:	00 
      d4f5e0:	49 89 1f             	mov    QWORD PTR [r15],rbx
      d4f5e3:	48 8d 35 a7 da d4 ff 	lea    rsi,[rip+0xffffffffffd4daa7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      d4f5ea:	48 8d 0d df 16 00 00 	lea    rcx,[rip+0x16df]        # d50cd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dd56>
      d4f5f1:	4c 8d b4 24 20 04 00 	lea    r14,[rsp+0x420]
      d4f5f8:	00 
      d4f5f9:	6a 08                	push   0x8
      d4f5fb:	5d                   	pop    rbp

### 0xdcfeac: mov    QWORD PTR [rsp+0x428],rbp; FDE=(14482796, 14483474)
      dcfe5c:	49 89 d0             	mov    r8,rdx
      dcfe5f:	4d 8b 16             	mov    r10,QWORD PTR [r14]
      dcfe62:	48 8d bc 24 08 02 00 	lea    rdi,[rsp+0x208]
      dcfe69:	00 
      dcfe6a:	4c 89 f6             	mov    rsi,r14
      dcfe6d:	6a 0a                	push   0xa
      dcfe6f:	5a                   	pop    rdx
      dcfe70:	48 89 c1             	mov    rcx,rax
      dcfe73:	4d 89 f9             	mov    r9,r15
      dcfe76:	41 ff 52 38          	call   QWORD PTR [r10+0x38]
      dcfe7a:	48 89 df             	mov    rdi,rbx
      dcfe7d:	e8 0e e0 a1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dcfe82:	80 bc 24 08 02 00 00 	cmp    BYTE PTR [rsp+0x208],0x0
      dcfe89:	00 
      dcfe8a:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
      dcfe8e:	48 8d ac 24 80 04 00 	lea    rbp,[rsp+0x480]
      dcfe95:	00 
      dcfe96:	0f 84 89 00 00 00    	je     dcff25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9cfab>
      dcfe9c:	48 89 df             	mov    rdi,rbx
      dcfe9f:	48 8d b4 24 58 02 00 	lea    rsi,[rsp+0x258]
      dcfea6:	00 
      dcfea7:	e8 26 2a 3d 00       	call   11a28d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x369ce8>
      dcfeac:	48 89 ac 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rbp
      dcfeb3:	00 
      dcfeb4:	48 8d 05 a9 c5 ca ff 	lea    rax,[rip+0xffffffffffcac5a9]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      dcfebb:	48 89 84 24 38 04 00 	mov    QWORD PTR [rsp+0x438],rax
      dcfec2:	00 
      dcfec3:	48 8d 05 48 01 00 00 	lea    rax,[rip+0x148]        # dd0012 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d098>
      dcfeca:	48 89 84 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rax
      dcfed1:	00 
      dcfed2:	48 89 df             	mov    rdi,rbx
      dcfed5:	4c 8d b4 24 28 04 00 	lea    r14,[rsp+0x428]
      dcfedc:	00 
      dcfedd:	4c 89 f6             	mov    rsi,r14
      dcfee0:	e8 29 2d 3d 00       	call   11a2c0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a024>
      dcfee5:	4c 89 f7             	mov    rdi,r14
      dcfee8:	e8 b1 01 00 00       	call   dd009e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d124>
      dcfeed:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      dcfef2:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      dcfef6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dcfef9:	ff 50 50             	call   QWORD PTR [rax+0x50]
      dcfefc:	4c 89 f7             	mov    rdi,r14
      dcfeff:	48 89 de             	mov    rsi,rbx
      dcff02:	48 89 c2             	mov    rdx,rax
      dcff05:	e8 b9 08 00 00       	call   dd07c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d849>
      dcff0a:	4c 89 ef             	mov    rdi,r13
      dcff0d:	4c 89 f6             	mov    rsi,r14
      dcff10:	e8 af 01 00 00       	call   dd00c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d14a>
      dcff15:	4c 89 f7             	mov    rdi,r14
      dcff18:	e8 11 54 8f 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      dcff1d:	48 89 df             	mov    rdi,rbx

### 0xecee52: mov    QWORD PTR [rbx+0x428],r14; FDE=(15525244, 15530574)
      ecedfc:	00 
      ecedfd:	48 8b 8c 24 c8 01 00 	mov    rcx,QWORD PTR [rsp+0x1c8]
      ecee04:	00 
      ecee05:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ecee09:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ecee0c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      ecee10:	48 85 c0             	test   rax,rax
      ecee13:	74 05                	je     ecee1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96230>
      ecee15:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ecee1a:	48 8d 83 28 04 00 00 	lea    rax,[rbx+0x428]
      ecee21:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      ecee28:	00 
      ecee29:	49 8d 46 18          	lea    rax,[r14+0x18]
      ecee2d:	0f 57 c0             	xorps  xmm0,xmm0
      ecee30:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
      ecee35:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      ecee39:	49 8d 46 30          	lea    rax,[r14+0x30]
      ecee3d:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
      ecee42:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
      ecee46:	4c 89 f7             	mov    rdi,r14
      ecee49:	48 83 c7 40          	add    rdi,0x40
      ecee4d:	e8 3c 94 c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ecee52:	4c 89 b3 28 04 00 00 	mov    QWORD PTR [rbx+0x428],r14
      ecee59:	48 8d bb 30 04 00 00 	lea    rdi,[rbx+0x430]
      ecee60:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      ecee65:	e8 8c ab 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ecee6a:	45 31 f6             	xor    r14d,r14d
      ecee6d:	44 88 b3 40 04 00 00 	mov    BYTE PTR [rbx+0x440],r14b
      ecee74:	48 8d 83 48 04 00 00 	lea    rax,[rbx+0x448]
      ecee7b:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
      ecee82:	00 
      ecee83:	44 88 b3 78 04 00 00 	mov    BYTE PTR [rbx+0x478],r14b
      ecee8a:	44 88 b3 80 04 00 00 	mov    BYTE PTR [rbx+0x480],r14b
      ecee91:	44 88 b3 98 04 00 00 	mov    BYTE PTR [rbx+0x498],r14b
      ecee98:	44 88 b3 d8 04 00 00 	mov    BYTE PTR [rbx+0x4d8],r14b
      ecee9f:	44 88 b3 30 05 00 00 	mov    BYTE PTR [rbx+0x530],r14b
      eceea6:	83 a3 38 05 00 00 00 	and    DWORD PTR [rbx+0x538],0x0
      eceead:	48 8d 83 d8 04 00 00 	lea    rax,[rbx+0x4d8]
      eceeb4:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      eceebb:	00 
      eceebc:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
      eceec3:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
      eceeca:	00 
      eceecb:	44 88 b3 40 05 00 00 	mov    BYTE PTR [rbx+0x540],r14b
      eceed2:	44 88 b3 98 05 00 00 	mov    BYTE PTR [rbx+0x598],r14b
      eceed9:	83 a3 a0 05 00 00 00 	and    DWORD PTR [rbx+0x5a0],0x0
      eceee0:	48 8d 83 a8 05 00 00 	lea    rax,[rbx+0x5a8]
      eceee7:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      eceeee:	00 
      eceeef:	44 88 b3 a8 05 00 00 	mov    BYTE PTR [rbx+0x5a8],r14b
      eceef6:	44 88 b3 00 06 00 00 	mov    BYTE PTR [rbx+0x600],r14b

### 0xee4c59: mov    QWORD PTR [rbp+0x428],r13; FDE=(15616866, 15618421)
      ee4c09:	48 83 c6 10          	add    rsi,0x10
      ee4c0d:	4c 89 f7             	mov    rdi,r14
      ee4c10:	e8 53 0c c0 ff       	call   ae5868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32808>
      ee4c15:	48 89 84 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rax
      ee4c1c:	00 
      ee4c1d:	48 8b 6b 50          	mov    rbp,QWORD PTR [rbx+0x50]
      ee4c21:	48 89 df             	mov    rdi,rbx
      ee4c24:	4c 89 ee             	mov    rsi,r13
      ee4c27:	e8 64 07 00 00       	call   ee5390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac7a6>
      ee4c2c:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
      ee4c30:	48 39 c5             	cmp    rbp,rax
      ee4c33:	75 05                	jne    ee4c3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac050>
      ee4c35:	48 85 c0             	test   rax,rax
      ee4c38:	75 cc                	jne    ee4c06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac01c>
      ee4c3a:	48 89 df             	mov    rdi,rbx
      ee4c3d:	4c 89 fe             	mov    rsi,r15
      ee4c40:	e8 23 e0 fd ff       	call   ec2c68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a07e>
      ee4c45:	4c 8b 6b 08          	mov    r13,QWORD PTR [rbx+0x8]
      ee4c49:	48 8d 6c 24 20       	lea    rbp,[rsp+0x20]
      ee4c4e:	48 89 ef             	mov    rdi,rbp
      ee4c51:	4c 89 e6             	mov    rsi,r12
      ee4c54:	e8 b7 08 00 00       	call   ee5510 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac926>
      ee4c59:	4c 89 ad 28 04 00 00 	mov    QWORD PTR [rbp+0x428],r13
      ee4c60:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
      ee4c64:	48 8d bc 24 68 04 00 	lea    rdi,[rsp+0x468]
      ee4c6b:	00 
      ee4c6c:	48 89 47 f8          	mov    QWORD PTR [rdi-0x8],rax
      ee4c70:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
      ee4c74:	0f 29 47 e8          	movaps XMMWORD PTR [rdi-0x18],xmm0
      ee4c78:	0f 57 c0             	xorps  xmm0,xmm0
      ee4c7b:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
      ee4c7f:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
      ee4c84:	48 89 ee             	mov    rsi,rbp
      ee4c87:	e8 be 08 00 00       	call   ee554a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac960>
      ee4c8c:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
      ee4c93:	00 
      ee4c94:	e8 27 aa bb ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
      ee4c99:	49 89 c7             	mov    r15,rax
      ee4c9c:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]
      ee4ca0:	4d 85 ed             	test   r13,r13
      ee4ca3:	74 1c                	je     ee4cc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac0d7>
      ee4ca5:	f3 49 0f b8 cd       	popcnt rcx,r13
      ee4caa:	48 89 c8             	mov    rax,rcx
      ee4cad:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      ee4cb2:	48 83 f9 01          	cmp    rcx,0x1
      ee4cb6:	77 0e                	ja     ee4cc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac0dc>
      ee4cb8:	4d 8d 65 ff          	lea    r12,[r13-0x1]
      ee4cbc:	4d 21 fc             	and    r12,r15
      ee4cbf:	eb 18                	jmp    ee4cd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac0ef>
      ee4cc1:	e9 87 00 00 00       	jmp    ee4d4d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac163>
      ee4cc6:	4d 89 fc             	mov    r12,r15

### 0xee5560: mov    QWORD PTR [r14+0x428],rax; FDE=(15619402, 15619439)
      ee5518:	88 87 20 04 00 00    	mov    BYTE PTR [rdi+0x420],al
      ee551e:	38 86 20 04 00 00    	cmp    BYTE PTR [rsi+0x420],al
      ee5524:	74 08                	je     ee552e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac944>
      ee5526:	48 89 fb             	mov    rbx,rdi
      ee5529:	e8 d4 0b 00 00       	call   ee6102 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xad518>
      ee552e:	48 83 c4 08          	add    rsp,0x8
      ee5532:	5b                   	pop    rbx
      ee5533:	41 5e                	pop    r14
      ee5535:	c3                   	ret
      ee5536:	49 89 c6             	mov    r14,rax
      ee5539:	48 89 df             	mov    rdi,rbx
      ee553c:	e8 d7 a8 fe ff       	call   ecfe18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9722e>
      ee5541:	4c 89 f7             	mov    rdi,r14
      ee5544:	e8 87 a7 b8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ee5549:	cc                   	int3
      ee554a:	41 56                	push   r14
      ee554c:	53                   	push   rbx
      ee554d:	50                   	push   rax
      ee554e:	48 89 f3             	mov    rbx,rsi
      ee5551:	49 89 fe             	mov    r14,rdi
      ee5554:	e8 3f 00 00 00       	call   ee5598 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac9ae>
      ee5559:	48 8b 83 28 04 00 00 	mov    rax,QWORD PTR [rbx+0x428]
      ee5560:	49 89 86 28 04 00 00 	mov    QWORD PTR [r14+0x428],rax
      ee5567:	48 83 c4 08          	add    rsp,0x8
      ee556b:	5b                   	pop    rbx
      ee556c:	41 5e                	pop    r14
      ee556e:	c3                   	ret
      ee556f:	cc                   	int3
      ee5570:	53                   	push   rbx
      ee5571:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      ee5574:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ee5578:	48 85 db             	test   rbx,rbx
      ee557b:	74 18                	je     ee5595 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac9ab>
      ee557d:	80 7f 10 00          	cmp    BYTE PTR [rdi+0x10],0x0
      ee5581:	74 09                	je     ee558c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac9a2>
      ee5583:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      ee5587:	e8 d6 ad fe ff       	call   ed0362 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97778>
      ee558c:	48 89 df             	mov    rdi,rbx
      ee558f:	5b                   	pop    rbx
      ee5590:	e9 8b 89 90 00       	jmp    17edf20 <_ZdlPv@plt>
      ee5595:	5b                   	pop    rbx
      ee5596:	c3                   	ret
      ee5597:	cc                   	int3
      ee5598:	31 c0                	xor    eax,eax
      ee559a:	88 07                	mov    BYTE PTR [rdi],al
      ee559c:	88 87 20 04 00 00    	mov    BYTE PTR [rdi+0x420],al
      ee55a2:	38 86 20 04 00 00    	cmp    BYTE PTR [rsi+0x420],al
      ee55a8:	0f 85 02 00 00 00    	jne    ee55b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac9c6>
      ee55ae:	c3                   	ret
      ee55af:	cc                   	int3
      ee55b0:	53                   	push   rbx

### 0xf3d296: mov    QWORD PTR [rsp+0x428],rax; FDE=(15979132, 15979258)
      f3d252:	53                   	push   rbx
      f3d253:	48 89 fb             	mov    rbx,rdi
      f3d256:	48 83 c7 10          	add    rdi,0x10
      f3d25a:	e8 79 ed 72 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
      f3d25f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      f3d263:	5b                   	pop    rbx
      f3d264:	e9 1d 12 b6 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      f3d269:	cc                   	int3
      f3d26a:	53                   	push   rbx
      f3d26b:	48 89 fb             	mov    rbx,rdi
      f3d26e:	e8 e7 af 73 00       	call   167825a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c3c6>
      f3d273:	c6 83 c0 00 00 00 01 	mov    BYTE PTR [rbx+0xc0],0x1
      f3d27a:	5b                   	pop    rbx
      f3d27b:	c3                   	ret
      f3d27c:	41 57                	push   r15
      f3d27e:	41 56                	push   r14
      f3d280:	53                   	push   rbx
      f3d281:	48 81 ec 30 04 00 00 	sub    rsp,0x430
      f3d288:	89 d3                	mov    ebx,edx
      f3d28a:	49 89 fe             	mov    r14,rdi
      f3d28d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f3d294:	00 00 
      f3d296:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
      f3d29d:	00 
      f3d29e:	c6 87 48 04 00 00 00 	mov    BYTE PTR [rdi+0x448],0x0
      f3d2a5:	0f 57 c0             	xorps  xmm0,xmm0
      f3d2a8:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      f3d2ab:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      f3d2af:	0f 11 47 19          	movups XMMWORD PTR [rdi+0x19],xmm0
      f3d2b3:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      f3d2b8:	4c 89 ff             	mov    rdi,r15
      f3d2bb:	e8 3a 00 00 00       	call   f3d2fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104710>
      f3d2c0:	4c 89 f7             	mov    rdi,r14
      f3d2c3:	4c 89 fe             	mov    rsi,r15
      f3d2c6:	89 da                	mov    edx,ebx
      f3d2c8:	e8 45 00 00 00       	call   f3d312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104728>
      f3d2cd:	4c 89 ff             	mov    rdi,r15
      f3d2d0:	e8 a7 1d fc ff       	call   eff07c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6492>
      f3d2d5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f3d2dc:	00 00 
      f3d2de:	48 3b 84 24 28 04 00 	cmp    rax,QWORD PTR [rsp+0x428]
      f3d2e5:	00 
      f3d2e6:	75 0d                	jne    f3d2f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10470b>
      f3d2e8:	48 81 c4 30 04 00 00 	add    rsp,0x430
      f3d2ef:	5b                   	pop    rbx
      f3d2f0:	41 5e                	pop    r14
      f3d2f2:	41 5f                	pop    r15
      f3d2f4:	c3                   	ret
      f3d2f5:	e8 b6 27 8b 00       	call   17efab0 <__stack_chk_fail@plt>
      f3d2fa:	31 c0                	xor    eax,eax
      f3d2fc:	88 07                	mov    BYTE PTR [rdi],al

### 0xf454a6: mov    QWORD PTR [rsp+0x428],rax; FDE=(16012428, 16012537)
      f4545f:	e8 22 90 b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f45464:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f4546b:	00 00 
      f4546d:	48 3b 84 24 30 04 00 	cmp    rax,QWORD PTR [rsp+0x430]
      f45474:	00 
      f45475:	75 0f                	jne    f45486 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c89c>
      f45477:	48 81 c4 38 04 00 00 	add    rsp,0x438
      f4547e:	5b                   	pop    rbx
      f4547f:	41 5c                	pop    r12
      f45481:	41 5e                	pop    r14
      f45483:	41 5f                	pop    r15
      f45485:	c3                   	ret
      f45486:	e8 25 a6 8a 00       	call   17efab0 <__stack_chk_fail@plt>
      f4548b:	cc                   	int3
      f4548c:	41 57                	push   r15
      f4548e:	41 56                	push   r14
      f45490:	53                   	push   rbx
      f45491:	48 81 ec 30 04 00 00 	sub    rsp,0x430
      f45498:	89 d3                	mov    ebx,edx
      f4549a:	49 89 fe             	mov    r14,rdi
      f4549d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f454a4:	00 00 
      f454a6:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
      f454ad:	00 
      f454ae:	49 83 c6 10          	add    r14,0x10
      f454b2:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      f454b7:	4c 89 ff             	mov    rdi,r15
      f454ba:	e8 3b 7e ff ff       	call   f3d2fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104710>
      f454bf:	4c 89 f7             	mov    rdi,r14
      f454c2:	4c 89 fe             	mov    rsi,r15
      f454c5:	89 da                	mov    edx,ebx
      f454c7:	e8 2e ff ff ff       	call   f453fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c810>
      f454cc:	4c 89 ff             	mov    rdi,r15
      f454cf:	e8 a8 9b fb ff       	call   eff07c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6492>
      f454d4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f454db:	00 00 
      f454dd:	48 3b 84 24 28 04 00 	cmp    rax,QWORD PTR [rsp+0x428]
      f454e4:	00 
      f454e5:	75 0d                	jne    f454f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c90a>
      f454e7:	48 81 c4 30 04 00 00 	add    rsp,0x430
      f454ee:	5b                   	pop    rbx
      f454ef:	41 5e                	pop    r14
      f454f1:	41 5f                	pop    r15
      f454f3:	c3                   	ret
      f454f4:	e8 b7 a5 8a 00       	call   17efab0 <__stack_chk_fail@plt>
      f454f9:	cc                   	int3
      f454fa:	55                   	push   rbp
      f454fb:	41 57                	push   r15
      f454fd:	41 56                	push   r14
      f454ff:	53                   	push   rbx
      f45500:	48 81 ec 58 04 00 00 	sub    rsp,0x458

### 0xfe2095: mov    QWORD PTR [rsp+0x428],rax; FDE=(16654452, 16654616)
      fe2052:	48 83 c7 10          	add    rdi,0x10
      fe2056:	e9 01 00 00 00       	jmp    fe205c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9472>
      fe205b:	cc                   	int3
      fe205c:	53                   	push   rbx
      fe205d:	48 89 fb             	mov    rbx,rdi
      fe2060:	48 83 c7 10          	add    rdi,0x10
      fe2064:	e8 27 e3 6e 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
      fe2069:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      fe206d:	5b                   	pop    rbx
      fe206e:	e9 3f c4 ab ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      fe2073:	cc                   	int3
      fe2074:	41 57                	push   r15
      fe2076:	41 56                	push   r14
      fe2078:	41 55                	push   r13
      fe207a:	41 54                	push   r12
      fe207c:	53                   	push   rbx
      fe207d:	48 81 ec 30 04 00 00 	sub    rsp,0x430
      fe2084:	89 d3                	mov    ebx,edx
      fe2086:	49 89 f7             	mov    r15,rsi
      fe2089:	49 89 fe             	mov    r14,rdi
      fe208c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fe2093:	00 00 
      fe2095:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
      fe209c:	00 
      fe209d:	48 8d 77 10          	lea    rsi,[rdi+0x10]
      fe20a1:	49 89 e4             	mov    r12,rsp
      fe20a4:	4c 89 e7             	mov    rdi,r12
      fe20a7:	e8 84 92 ac ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      fe20ac:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
      fe20b0:	4d 85 e4             	test   r12,r12
      fe20b3:	74 30                	je     fe20e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a94fb>
      fe20b5:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
      fe20ba:	4c 89 ef             	mov    rdi,r13
      fe20bd:	4c 89 fe             	mov    rsi,r15
      fe20c0:	e8 e7 e1 6e 00       	call   16d02ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84418>
      fe20c5:	41 80 7e 20 00       	cmp    BYTE PTR [r14+0x20],0x0
      fe20ca:	0f 95 c0             	setne  al
      fe20cd:	20 d8                	and    al,bl
      fe20cf:	0f b6 d0             	movzx  edx,al
      fe20d2:	4c 89 e7             	mov    rdi,r12
      fe20d5:	4c 89 ee             	mov    rsi,r13
      fe20d8:	e8 e1 cd f1 ff       	call   efeebe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc62d4>
      fe20dd:	4c 89 ef             	mov    rdi,r13
      fe20e0:	e8 ab e2 6e 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
      fe20e5:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fe20ea:	e8 97 c3 ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fe20ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fe20f6:	00 00 
      fe20f8:	48 3b 84 24 28 04 00 	cmp    rax,QWORD PTR [rsp+0x428]
      fe20ff:	00 
      fe2100:	75 11                	jne    fe2113 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9529>

### 0x107b0d3: mov    QWORD PTR [rsp+0x428],rsi; FDE=(17276972, 17294468)
     107b076:	48 83 a4 24 10 04 00 	and    QWORD PTR [rsp+0x410],0x0
     107b07d:	00 00 
     107b07f:	48 83 a4 24 20 04 00 	and    QWORD PTR [rsp+0x420],0x0
     107b086:	00 00 
     107b088:	6a 18                	push   0x18
     107b08a:	5f                   	pop    rdi
     107b08b:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     107b090:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     107b095:	e8 66 2e 77 00       	call   17edf00 <_Znwm@plt>
     107b09a:	48 89 18             	mov    QWORD PTR [rax],rbx
     107b09d:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     107b0a4:	00 
     107b0a5:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     107b0a9:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
     107b0b0:	00 
     107b0b1:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     107b0b5:	48 89 84 24 10 04 00 	mov    QWORD PTR [rsp+0x410],rax
     107b0bc:	00 
     107b0bd:	48 8d 15 4a 72 ae ff 	lea    rdx,[rip+0xffffffffffae724a]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
     107b0c4:	48 89 94 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rdx
     107b0cb:	00 
     107b0cc:	48 8d 35 17 35 00 00 	lea    rsi,[rip+0x3517]        # 107e5ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x245a00>
     107b0d3:	48 89 b4 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rsi
     107b0da:	00 
     107b0db:	49 8b 8d d0 00 00 00 	mov    rcx,QWORD PTR [r13+0xd0]
     107b0e2:	48 85 c9             	test   rcx,rcx
     107b0e5:	74 53                	je     107b13a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x242550>
     107b0e7:	48 89 84 24 a0 04 00 	mov    QWORD PTR [rsp+0x4a0],rax
     107b0ee:	00 
     107b0ef:	6a 01                	push   0x1
     107b0f1:	5f                   	pop    rdi
     107b0f2:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
     107b0f9:	00 
     107b0fa:	48 89 ea             	mov    rdx,rbp
     107b0fd:	ff d1                	call   rcx
     107b0ff:	6a 01                	push   0x1
     107b101:	5f                   	pop    rdi
     107b102:	48 8d 94 24 a0 04 00 	lea    rdx,[rsp+0x4a0]
     107b109:	00 
     107b10a:	48 89 ee             	mov    rsi,rbp
     107b10d:	ff 94 24 20 04 00 00 	call   QWORD PTR [rsp+0x420]
     107b114:	66 41 0f 6f 85 d0 00 	movdqa xmm0,XMMWORD PTR [r13+0xd0]
     107b11b:	00 00 
     107b11d:	f3 0f 6f 8c 24 20 04 	movdqu xmm1,XMMWORD PTR [rsp+0x420]
     107b124:	00 00 
     107b126:	f3 0f 7f 84 24 20 04 	movdqu XMMWORD PTR [rsp+0x420],xmm0
     107b12d:	00 00 
     107b12f:	66 41 0f 7f 8d d0 00 	movdqa XMMWORD PTR [r13+0xd0],xmm1
     107b136:	00 00 
     107b138:	eb 1e                	jmp    107b158 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24256e>
     107b13a:	49 89 85 c0 00 00 00 	mov    QWORD PTR [r13+0xc0],rax

### 0x107d442: mov    QWORD PTR [rsp+0x428],rax; FDE=(17276972, 17294468)
     107d3e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     107d3ec:	ff 50 38             	call   QWORD PTR [rax+0x38]
     107d3ef:	48 89 c3             	mov    rbx,rax
     107d3f2:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     107d3f6:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     107d3f9:	48 83 a4 24 10 04 00 	and    QWORD PTR [rsp+0x410],0x0
     107d400:	00 00 
     107d402:	48 83 a4 24 20 04 00 	and    QWORD PTR [rsp+0x420],0x0
     107d409:	00 00 
     107d40b:	6a 18                	push   0x18
     107d40d:	5f                   	pop    rdi
     107d40e:	e8 ed 0a 77 00       	call   17edf00 <_Znwm@plt>
     107d413:	8b 8c 24 d8 00 00 00 	mov    ecx,DWORD PTR [rsp+0xd8]
     107d41a:	89 08                	mov    DWORD PTR [rax],ecx
     107d41c:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     107d420:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     107d424:	48 89 84 24 10 04 00 	mov    QWORD PTR [rsp+0x410],rax
     107d42b:	00 
     107d42c:	48 8d 05 db 4e ae ff 	lea    rax,[rip+0xffffffffffae4edb]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
     107d433:	48 89 84 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rax
     107d43a:	00 
     107d43b:	48 8d 05 bc 1a 00 00 	lea    rax,[rip+0x1abc]        # 107eefe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x246314>
     107d442:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
     107d449:	00 
     107d44a:	6a 30                	push   0x30
     107d44c:	5f                   	pop    rdi
     107d44d:	e8 ae 0a 77 00       	call   17edf00 <_Znwm@plt>
     107d452:	48 89 c3             	mov    rbx,rax
     107d455:	48 8d 05 14 5b 7e 00 	lea    rax,[rip+0x7e5b14]        # 1862f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f658>
     107d45c:	48 89 03             	mov    QWORD PTR [rbx],rax
     107d45f:	48 8b 84 24 30 05 00 	mov    rax,QWORD PTR [rsp+0x530]
     107d466:	00 
     107d467:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     107d46b:	48 89 df             	mov    rdi,rbx
     107d46e:	48 83 c7 10          	add    rdi,0x10
     107d472:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
     107d479:	00 
     107d47a:	e8 25 4b 07 00       	call   10f1fa4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b93ba>
     107d47f:	48 8b 84 24 28 01 00 	mov    rax,QWORD PTR [rsp+0x128]
     107d486:	00 
     107d487:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     107d48a:	48 89 18             	mov    QWORD PTR [rax],rbx
     107d48d:	48 85 ff             	test   rdi,rdi
     107d490:	74 06                	je     107d498 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2448ae>
     107d492:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     107d495:	ff 50 08             	call   QWORD PTR [rax+0x8]
     107d498:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     107d49c:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     107d49f:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     107d4a4:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     107d4a8:	48 85 c0             	test   rax,rax

### 0x1118839: mov    QWORD PTR [rsp+0x428],rax; FDE=(17923500, 17927568)
     11187f5:	48 89 de             	mov    rsi,rbx
     11187f8:	e8 f1 6e 98 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     11187fd:	84 c0                	test   al,al
     11187ff:	74 23                	je     1118824 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dfc3a>
     1118801:	e9 05 02 00 00       	jmp    1118a0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dfe21>
     1118806:	83 fd 01             	cmp    ebp,0x1
     1118809:	77 07                	ja     1118812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dfc28>
     111880b:	48 23 44 24 10       	and    rax,QWORD PTR [rsp+0x10]
     1118810:	eb 0d                	jmp    111881f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dfc35>
     1118812:	4c 39 e0             	cmp    rax,r12
     1118815:	72 08                	jb     111881f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dfc35>
     1118817:	31 d2                	xor    edx,edx
     1118819:	49 f7 f4             	div    r12
     111881c:	48 89 d0             	mov    rax,rdx
     111881f:	4c 39 f8             	cmp    rax,r15
     1118822:	75 08                	jne    111882c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dfc42>
     1118824:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     1118827:	4d 85 f6             	test   r14,r14
     111882a:	75 bc                	jne    11187e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dfbfe>
     111882c:	bf 90 01 00 00       	mov    edi,0x190
     1118831:	e8 ca 56 6d 00       	call   17edf00 <_Znwm@plt>
     1118836:	48 89 c5             	mov    rbp,rax
     1118839:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
     1118840:	00 
     1118841:	48 83 20 00          	and    QWORD PTR [rax],0x0
     1118845:	48 8d 84 24 c0 00 00 	lea    rax,[rsp+0xc0]
     111884c:	00 
     111884d:	48 89 84 24 30 04 00 	mov    QWORD PTR [rsp+0x430],rax
     1118854:	00 
     1118855:	c6 84 24 38 04 00 00 	mov    BYTE PTR [rsp+0x438],0x0
     111885c:	00 
     111885d:	4c 89 6d 08          	mov    QWORD PTR [rbp+0x8],r13
     1118861:	48 8d 7d 10          	lea    rdi,[rbp+0x10]
     1118865:	48 89 de             	mov    rsi,rbx
     1118868:	e8 d3 56 6d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     111886d:	48 89 ef             	mov    rdi,rbp
     1118870:	48 83 c7 28          	add    rdi,0x28
     1118874:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     111887b:	00 
     111887c:	e8 a3 10 00 00       	call   1119924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e0d3a>
     1118881:	8b 84 24 40 02 00 00 	mov    eax,DWORD PTR [rsp+0x240]
     1118888:	89 85 88 01 00 00    	mov    DWORD PTR [rbp+0x188],eax
     111888e:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     1118895:	00 
     1118896:	48 ff c0             	inc    rax
     1118899:	78 07                	js     11188a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dfcb8>
     111889b:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     11188a0:	eb 15                	jmp    11188b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dfccd>
     11188a2:	48 89 c1             	mov    rcx,rax
     11188a5:	48 d1 e9             	shr    rcx,1
     11188a8:	83 e0 01             	and    eax,0x1

### 0x1162da7: mov    QWORD PTR [rsp+0x428],r13; FDE=(18224770, 18237631)
     1162d53:	00 
     1162d54:	49 83 c5 38          	add    r13,0x38
     1162d58:	4c 89 ac 24 80 02 00 	mov    QWORD PTR [rsp+0x280],r13
     1162d5f:	00 
     1162d60:	49 83 c7 20          	add    r15,0x20
     1162d64:	4d 39 f7             	cmp    r15,r14
     1162d67:	75 c8                	jne    1162d31 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32a147>
     1162d69:	48 8d bc 24 70 03 00 	lea    rdi,[rsp+0x370]
     1162d70:	00 
     1162d71:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
     1162d75:	e8 b6 25 00 00       	call   1165330 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c746>
     1162d7a:	4c 89 ac 24 10 04 00 	mov    QWORD PTR [rsp+0x410],r13
     1162d81:	00 
     1162d82:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     1162d87:	49 89 ee             	mov    r14,rbp
     1162d8a:	49 83 e6 fc          	and    r14,0xfffffffffffffffc
     1162d8e:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
     1162d95:	00 
     1162d96:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
     1162d9a:	e8 c5 25 00 00       	call   1165364 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32c77a>
     1162d9f:	48 89 9c 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rbx
     1162da6:	00 
     1162da7:	4c 89 ac 24 28 04 00 	mov    QWORD PTR [rsp+0x428],r13
     1162dae:	00 
     1162daf:	48 83 a4 24 88 02 00 	and    QWORD PTR [rsp+0x288],0x0
     1162db6:	00 00 
     1162db8:	48 8d 05 a9 64 6f 00 	lea    rax,[rip+0x6f64a9]        # 1859268 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15950>
     1162dbf:	48 89 84 24 80 02 00 	mov    QWORD PTR [rsp+0x280],rax
     1162dc6:	00 
     1162dc7:	48 83 a4 24 98 02 00 	and    QWORD PTR [rsp+0x298],0x0
     1162dce:	00 00 
     1162dd0:	0f 57 c0             	xorps  xmm0,xmm0
     1162dd3:	0f 29 84 24 e0 01 00 	movaps XMMWORD PTR [rsp+0x1e0],xmm0
     1162dda:	00 
     1162ddb:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
     1162de2:	00 00 
     1162de4:	0f 29 84 24 b0 01 00 	movaps XMMWORD PTR [rsp+0x1b0],xmm0
     1162deb:	00 
     1162dec:	48 83 a4 24 c0 01 00 	and    QWORD PTR [rsp+0x1c0],0x0
     1162df3:	00 00 
     1162df5:	4c 89 74 24 30       	mov    QWORD PTR [rsp+0x30],r14
     1162dfa:	4c 89 f7             	mov    rdi,r14
     1162dfd:	e8 34 8a 91 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1162e02:	48 8d 9c 24 70 03 00 	lea    rbx,[rsp+0x370]
     1162e09:	00 
     1162e0a:	48 89 df             	mov    rdi,rbx
     1162e0d:	48 89 c6             	mov    rsi,rax
     1162e10:	e8 13 26 56 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     1162e15:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1162e1c:	00 
     1162e1d:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]

### 0x11efe10: mov    QWORD PTR [rbx+0x428],r13; FDE=(18805556, 18832116)
     11efda9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11efdac:	48 8b 94 24 c0 06 00 	mov    rdx,QWORD PTR [rsp+0x6c0]
     11efdb3:	00 
     11efdb4:	44 0f b7 b3 fc 03 00 	movzx  r14d,WORD PTR [rbx+0x3fc]
     11efdbb:	00 
     11efdbc:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11efdc1:	44 8a 79 02          	mov    r15b,BYTE PTR [rcx+0x2]
     11efdc5:	48 8d 0d 84 ee 66 00 	lea    rcx,[rip+0x66ee84]        # 185ec50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b338>
     11efdcc:	48 89 8b 00 04 00 00 	mov    QWORD PTR [rbx+0x400],rcx
     11efdd3:	48 8b 8c 24 40 02 00 	mov    rcx,QWORD PTR [rsp+0x240]
     11efdda:	00 
     11efddb:	48 89 8b 18 04 00 00 	mov    QWORD PTR [rbx+0x418],rcx
     11efde2:	66 0f 6f 84 24 30 02 	movdqa xmm0,XMMWORD PTR [rsp+0x230]
     11efde9:	00 00 
     11efdeb:	f3 0f 7f 83 08 04 00 	movdqu XMMWORD PTR [rbx+0x408],xmm0
     11efdf2:	00 
     11efdf3:	66 0f ef c0          	pxor   xmm0,xmm0
     11efdf7:	66 0f 7f 84 24 30 02 	movdqa XMMWORD PTR [rsp+0x230],xmm0
     11efdfe:	00 00 
     11efe00:	48 83 a4 24 40 02 00 	and    QWORD PTR [rsp+0x240],0x0
     11efe07:	00 00 
     11efe09:	4c 89 a3 20 04 00 00 	mov    QWORD PTR [rbx+0x420],r12
     11efe10:	4c 89 ab 28 04 00 00 	mov    QWORD PTR [rbx+0x428],r13
     11efe17:	48 89 93 30 04 00 00 	mov    QWORD PTR [rbx+0x430],rdx
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
     11efe8f:	4c 8d b3 a0 04 00 00 	lea    r14,[rbx+0x4a0]
     11efe96:	4c 89 f7             	mov    rdi,r14
     11efe99:	e8 58 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efe9e:	48 b8 00 00 00 00 02 	movabs rax,0x200000000
     11efea5:	00 00 00 

### 0x1219f4a: mov    QWORD PTR [rsp+0x428],rax; FDE=(18980652, 18981447)
     1219f08:	53                   	push   rbx
     1219f09:	48 89 fb             	mov    rbx,rdi
     1219f0c:	80 bf c0 00 00 00 00 	cmp    BYTE PTR [rdi+0xc0],0x0
     1219f13:	74 0a                	je     1219f1f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f4a3>
     1219f15:	48 89 df             	mov    rdi,rbx
     1219f18:	e8 d7 b1 ff ff       	call   12150f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a678>
     1219f1d:	eb 08                	jmp    1219f27 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f4ab>
     1219f1f:	48 89 df             	mov    rdi,rbx
     1219f22:	e8 8f b7 ff ff       	call   12156b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ac3a>
     1219f27:	48 89 d8             	mov    rax,rbx
     1219f2a:	5b                   	pop    rbx
     1219f2b:	c3                   	ret
     1219f2c:	55                   	push   rbp
     1219f2d:	41 57                	push   r15
     1219f2f:	41 56                	push   r14
     1219f31:	41 54                	push   r12
     1219f33:	53                   	push   rbx
     1219f34:	48 81 ec 30 04 00 00 	sub    rsp,0x430
     1219f3b:	49 89 f7             	mov    r15,rsi
     1219f3e:	49 89 fe             	mov    r14,rdi
     1219f41:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1219f48:	00 00 
     1219f4a:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
     1219f51:	00 
     1219f52:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
     1219f57:	48 89 df             	mov    rdi,rbx
     1219f5a:	4c 89 f6             	mov    rsi,r14
     1219f5d:	e8 e6 02 00 00       	call   121a248 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f7cc>
     1219f62:	40 8a 6b 10          	mov    bpl,BYTE PTR [rbx+0x10]
     1219f66:	40 84 ed             	test   bpl,bpl
     1219f69:	0f 84 13 02 00 00    	je     121a182 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f706>
     1219f6f:	48 8b 5c 24 48       	mov    rbx,QWORD PTR [rsp+0x48]
     1219f74:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1219f79:	48 89 de             	mov    rsi,rbx
     1219f7c:	e8 3d 04 00 00       	call   121a3be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f942>
     1219f81:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1219f86:	44 8a 67 18          	mov    r12b,BYTE PTR [rdi+0x18]
     1219f8a:	e8 a1 cd 88 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1219f8f:	45 84 e4             	test   r12b,r12b
     1219f92:	0f 85 ea 01 00 00    	jne    121a182 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f706>
     1219f98:	41 83 3f 02          	cmp    DWORD PTR [r15],0x2
     1219f9c:	75 1a                	jne    1219fb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f53c>
     1219f9e:	48 89 df             	mov    rdi,rbx
     1219fa1:	e8 9a 04 00 00       	call   121a440 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f9c4>
     1219fa6:	84 c0                	test   al,al
     1219fa8:	0f 84 f6 00 00 00    	je     121a0a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f628>
     1219fae:	41 83 3f 02          	cmp    DWORD PTR [r15],0x2
     1219fb2:	0f 84 ca 01 00 00    	je     121a182 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f706>
     1219fb8:	48 89 df             	mov    rdi,rbx
     1219fbb:	e8 80 04 00 00       	call   121a440 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f9c4>
     1219fc0:	84 c0                	test   al,al

### 0x12b3bd5: mov    QWORD PTR [rsp+0x428],rax; FDE=(19610550, 19610732)
     12b3b96:	48 81 c4 18 01 00 00 	add    rsp,0x118
     12b3b9d:	5b                   	pop    rbx
     12b3b9e:	41 5c                	pop    r12
     12b3ba0:	41 5d                	pop    r13
     12b3ba2:	41 5e                	pop    r14
     12b3ba4:	41 5f                	pop    r15
     12b3ba6:	5d                   	pop    rbp
     12b3ba7:	c3                   	ret
     12b3ba8:	e8 03 bf 53 00       	call   17efab0 <__stack_chk_fail@plt>
     12b3bad:	48 89 c7             	mov    rdi,rax
     12b3bb0:	e8 f0 5e 7c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     12b3bb5:	cc                   	int3
     12b3bb6:	41 57                	push   r15
     12b3bb8:	41 56                	push   r14
     12b3bba:	41 55                	push   r13
     12b3bbc:	41 54                	push   r12
     12b3bbe:	53                   	push   rbx
     12b3bbf:	48 81 ec 30 04 00 00 	sub    rsp,0x430
     12b3bc6:	49 89 f7             	mov    r15,rsi
     12b3bc9:	48 89 fb             	mov    rbx,rdi
     12b3bcc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12b3bd3:	00 00 
     12b3bd5:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
     12b3bdc:	00 
     12b3bdd:	bf 68 04 00 00       	mov    edi,0x468
     12b3be2:	e8 19 a3 53 00       	call   17edf00 <_Znwm@plt>
     12b3be7:	49 89 c6             	mov    r14,rax
     12b3bea:	0f 57 c0             	xorps  xmm0,xmm0
     12b3bed:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     12b3bf1:	48 8d 05 88 e1 5a 00 	lea    rax,[rip+0x5ae188]        # 1861d80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1e468>
     12b3bf8:	49 89 06             	mov    QWORD PTR [r14],rax
     12b3bfb:	4d 89 f4             	mov    r12,r14
     12b3bfe:	49 83 c4 18          	add    r12,0x18
     12b3c02:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     12b3c07:	4c 89 ef             	mov    rdi,r13
     12b3c0a:	4c 89 fe             	mov    rsi,r15
     12b3c0d:	e8 9a c6 41 00       	call   16d02ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84418>
     12b3c12:	41 c6 85 18 04 00 00 	mov    BYTE PTR [r13+0x418],0x1
     12b3c19:	01 
     12b3c1a:	4c 89 e7             	mov    rdi,r12
     12b3c1d:	4c 89 ee             	mov    rsi,r13
     12b3c20:	e8 7d 02 00 00       	call   12b3ea2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf9426>
     12b3c25:	4c 89 ef             	mov    rdi,r13
     12b3c28:	e8 5d 02 00 00       	call   12b3e8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf940e>
     12b3c2d:	4c 89 23             	mov    QWORD PTR [rbx],r12
     12b3c30:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
     12b3c34:	31 ff                	xor    edi,edi
     12b3c36:	e8 e1 a7 7e ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     12b3c3b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12b3c42:	00 00 
     12b3c44:	48 3b 84 24 28 04 00 	cmp    rax,QWORD PTR [rsp+0x428]

### 0x12c8884: mov    QWORD PTR [rbx+0x428],r15; FDE=(19695354, 19696738)
     12c8821:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     12c8825:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     12c8829:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     12c882e:	e8 0d 57 52 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12c8833:	48 8d b4 24 d8 04 00 	lea    rsi,[rsp+0x4d8]
     12c883a:	00 
     12c883b:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14
     12c883f:	c6 43 40 01          	mov    BYTE PTR [rbx+0x40],0x1
     12c8843:	48 b8 00 00 00 00 ff 	movabs rax,0x7fffffff00000000
     12c884a:	ff ff 7f 
     12c884d:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     12c8851:	4c 8d 73 50          	lea    r14,[rbx+0x50]
     12c8855:	4c 89 f7             	mov    rdi,r14
     12c8858:	e8 85 14 a0 ff       	call   cc9ce2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216c82>
     12c885d:	48 8d b4 24 10 05 00 	lea    rsi,[rsp+0x510]
     12c8864:	00 
     12c8865:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
     12c8869:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     12c886e:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
     12c8873:	e8 72 94 40 00       	call   16d1cea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85e56>
     12c8878:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
     12c887d:	0f 11 83 18 04 00 00 	movups XMMWORD PTR [rbx+0x418],xmm0
     12c8884:	4c 89 bb 28 04 00 00 	mov    QWORD PTR [rbx+0x428],r15
     12c888b:	4c 89 a3 30 04 00 00 	mov    QWORD PTR [rbx+0x430],r12
     12c8892:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     12c8897:	48 89 83 38 04 00 00 	mov    QWORD PTR [rbx+0x438],rax
     12c889e:	48 89 ab 40 04 00 00 	mov    QWORD PTR [rbx+0x440],rbp
     12c88a5:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     12c88aa:	48 89 83 48 04 00 00 	mov    QWORD PTR [rbx+0x448],rax
     12c88b1:	44 88 ab 50 04 00 00 	mov    BYTE PTR [rbx+0x450],r13b
     12c88b8:	4c 8d bb 58 04 00 00 	lea    r15,[rbx+0x458]
     12c88bf:	4c 89 ff             	mov    rdi,r15
     12c88c2:	e8 c7 f9 85 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     12c88c7:	48 8d bb b0 04 00 00 	lea    rdi,[rbx+0x4b0]
     12c88ce:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     12c88d4:	66 48 0f 7e c6       	movq   rsi,xmm0
     12c88d9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12c88dc:	ff 50 60             	call   QWORD PTR [rax+0x60]
     12c88df:	4c 8d 63 18          	lea    r12,[rbx+0x18]
     12c88e3:	4c 8d b3 f0 04 00 00 	lea    r14,[rbx+0x4f0]
     12c88ea:	66 0f ef c0          	pxor   xmm0,xmm0
     12c88ee:	f3 0f 7f 83 e0 04 00 	movdqu XMMWORD PTR [rbx+0x4e0],xmm0
     12c88f5:	00 
     12c88f6:	f3 0f 7f 83 d0 04 00 	movdqu XMMWORD PTR [rbx+0x4d0],xmm0
     12c88fd:	00 
     12c88fe:	f3 0f 7f 83 c0 04 00 	movdqu XMMWORD PTR [rbx+0x4c0],xmm0
     12c8905:	00 
     12c8906:	4c 89 f7             	mov    rdi,r14
     12c8909:	e8 e8 10 51 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     12c890e:	4c 8d ab 00 05 00 00 	lea    r13,[rbx+0x500]
     12c8915:	48 8b 83 b0 04 00 00 	mov    rax,QWORD PTR [rbx+0x4b0]

### 0x136a1ea: mov    QWORD PTR [rsp+0x428],rdx; FDE=(20356358, 20359086)
     136a194:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     136a199:	48 39 c8             	cmp    rax,rcx
     136a19c:	6a ff                	push   0xffffffffffffffff
     136a19e:	59                   	pop    rcx
     136a19f:	48 0f 44 c1          	cmove  rax,rcx
     136a1a3:	4c 89 ef             	mov    rdi,r13
     136a1a6:	48 89 ee             	mov    rsi,rbp
     136a1a9:	48 8d 0d 38 e4 4f 00 	lea    rcx,[rip+0x4fe438]        # 18685e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24cd0>
     136a1b0:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
     136a1b3:	48 89 c1             	mov    rcx,rax
     136a1b6:	48 f7 d9             	neg    rcx
     136a1b9:	48 89 8c 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],rcx
     136a1c0:	00 
     136a1c1:	48 c7 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],0x3e8
     136a1c8:	00 e8 03 00 00 
     136a1cd:	ba e8 03 00 00       	mov    edx,0x3e8
     136a1d2:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     136a1d9:	00 
     136a1da:	48 89 c6             	mov    rsi,rax
     136a1dd:	e8 70 bc 95 ff       	call   cc5e52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212df2>
     136a1e2:	48 89 84 24 20 04 00 	mov    QWORD PTR [rsp+0x420],rax
     136a1e9:	00 
     136a1ea:	48 89 94 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rdx
     136a1f1:	00 
     136a1f2:	4c 89 f7             	mov    rdi,r14
     136a1f5:	4c 89 ee             	mov    rsi,r13
     136a1f8:	e8 67 be 95 ff       	call   cc6064 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213004>
     136a1fd:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     136a200:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
     136a204:	0f b6 8c 24 08 04 00 	movzx  ecx,BYTE PTR [rsp+0x408]
     136a20b:	00 
     136a20c:	4c 89 fa             	mov    rdx,r15
     136a20f:	e8 87 58 03 00       	call   139fa9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e501f>
     136a214:	49 89 c4             	mov    r12,rax
     136a217:	49 89 d7             	mov    r15,rdx
     136a21a:	f6 84 24 98 02 00 00 	test   BYTE PTR [rsp+0x298],0x1
     136a221:	01 
     136a222:	4c 8d 84 24 99 02 00 	lea    r8,[rsp+0x299]
     136a229:	00 
     136a22a:	74 08                	je     136a234 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1af7b8>
     136a22c:	4c 8b 84 24 a8 02 00 	mov    r8,QWORD PTR [rsp+0x2a8]
     136a233:	00 
     136a234:	f6 84 24 c0 03 00 00 	test   BYTE PTR [rsp+0x3c0],0x1
     136a23b:	01 
     136a23c:	4c 8d 8c 24 c1 03 00 	lea    r9,[rsp+0x3c1]
     136a243:	00 
     136a244:	4c 8d b4 24 c0 03 00 	lea    r14,[rsp+0x3c0]
     136a24b:	00 
     136a24c:	74 08                	je     136a256 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1af7da>
     136a24e:	4c 8b 8c 24 d0 03 00 	mov    r9,QWORD PTR [rsp+0x3d0]
     136a255:	00 

### 0x141eaeb: mov    QWORD PTR [r14+0x428],r13; FDE=(21094596, 21099224)
     141ea89:	48 8d 84 24 00 01 00 	lea    rax,[rsp+0x100]
     141ea90:	00 
     141ea91:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
     141ea98:	00 
     141ea99:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     141ea9e:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     141eaa1:	48 85 db             	test   rbx,rbx
     141eaa4:	48 8b 6c 24 40       	mov    rbp,QWORD PTR [rsp+0x40]
     141eaa9:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
     141eaae:	0f 84 39 04 00 00    	je     141eeed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x264471>
     141eab4:	4c 8b 73 18          	mov    r14,QWORD PTR [rbx+0x18]
     141eab8:	49 8d be e8 03 00 00 	lea    rdi,[r14+0x3e8]
     141eabf:	e8 16 97 f6 ff       	call   13881da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd75e>
     141eac4:	84 c0                	test   al,al
     141eac6:	0f 84 96 03 00 00    	je     141ee62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2643e6>
     141eacc:	4d 3b ae 18 04 00 00 	cmp    r13,QWORD PTR [r14+0x418]
     141ead3:	0f 8c 89 03 00 00    	jl     141ee62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2643e6>
     141ead9:	41 80 be 30 04 00 00 	cmp    BYTE PTR [r14+0x430],0x0
     141eae0:	00 
     141eae1:	75 13                	jne    141eaf6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26407a>
     141eae3:	41 c6 86 30 04 00 00 	mov    BYTE PTR [r14+0x430],0x1
     141eaea:	01 
     141eaeb:	4d 89 ae 28 04 00 00 	mov    QWORD PTR [r14+0x428],r13
     141eaf2:	4c 8b 73 18          	mov    r14,QWORD PTR [rbx+0x18]
     141eaf6:	41 80 be d8 03 00 00 	cmp    BYTE PTR [r14+0x3d8],0x0
     141eafd:	00 
     141eafe:	74 0d                	je     141eb0d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x264091>
     141eb00:	4d 3b ae d0 03 00 00 	cmp    r13,QWORD PTR [r14+0x3d0]
     141eb07:	0f 8d 55 03 00 00    	jge    141ee62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2643e6>
     141eb0d:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     141eb10:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     141eb13:	ff 50 38             	call   QWORD PTR [rax+0x38]
     141eb16:	4c 8b 73 18          	mov    r14,QWORD PTR [rbx+0x18]
     141eb1a:	84 c0                	test   al,al
     141eb1c:	74 6a                	je     141eb88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26410c>
     141eb1e:	49 8b 86 c8 04 00 00 	mov    rax,QWORD PTR [r14+0x4c8]
     141eb25:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     141eb28:	48 85 ff             	test   rdi,rdi
     141eb2b:	0f 84 31 03 00 00    	je     141ee62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2643e6>
     141eb31:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     141eb34:	ff 50 18             	call   QWORD PTR [rax+0x18]
     141eb37:	84 d2                	test   dl,dl
     141eb39:	74 09                	je     141eb44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2640c8>
     141eb3b:	48 85 c0             	test   rax,rax
     141eb3e:	0f 8e 1e 03 00 00    	jle    141ee62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2643e6>
     141eb44:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     141eb48:	4c 89 ea             	mov    rdx,r13
     141eb4b:	48 2b 90 28 04 00 00 	sub    rdx,QWORD PTR [rax+0x428]
     141eb52:	48 8b 80 c8 04 00 00 	mov    rax,QWORD PTR [rax+0x4c8]
     141eb59:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     141eb5c:	66 0f 6e 40 70       	movd   xmm0,DWORD PTR [rax+0x70]

### 0x14204d4: mov    QWORD PTR [r13+0x428],rax; FDE=(21103594, 21104741)
     1420472:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1420477:	4d 8b 6c 24 18       	mov    r13,QWORD PTR [r12+0x18]
     142047c:	49 8d bd e8 03 00 00 	lea    rdi,[r13+0x3e8]
     1420483:	e8 52 7d f6 ff       	call   13881da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd75e>
     1420488:	84 c0                	test   al,al
     142048a:	74 12                	je     142049e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x265a22>
     142048c:	4c 89 ef             	mov    rdi,r13
     142048f:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     1420494:	e8 a6 0a 00 00       	call   1420f3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2664c3>
     1420499:	4d 8b 6c 24 18       	mov    r13,QWORD PTR [r12+0x18]
     142049e:	49 8d bd e8 03 00 00 	lea    rdi,[r13+0x3e8]
     14204a5:	e8 30 7d f6 ff       	call   13881da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd75e>
     14204aa:	84 c0                	test   al,al
     14204ac:	0f 84 cc 01 00 00    	je     142067e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x265c02>
     14204b2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14204b5:	49 3b 85 18 04 00 00 	cmp    rax,QWORD PTR [r13+0x418]
     14204bc:	0f 8c bc 01 00 00    	jl     142067e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x265c02>
     14204c2:	41 80 bd 30 04 00 00 	cmp    BYTE PTR [r13+0x430],0x0
     14204c9:	00 
     14204ca:	75 14                	jne    14204e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x265a64>
     14204cc:	41 c6 85 30 04 00 00 	mov    BYTE PTR [r13+0x430],0x1
     14204d3:	01 
     14204d4:	49 89 85 28 04 00 00 	mov    QWORD PTR [r13+0x428],rax
     14204db:	4d 8b 6c 24 18       	mov    r13,QWORD PTR [r12+0x18]
     14204e0:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
     14204e4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     14204e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14204ec:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     14204f2:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
     14204f6:	4c 89 ef             	mov    rdi,r13
     14204f9:	48 89 c6             	mov    rsi,rax
     14204fc:	ff 91 90 00 00 00    	call   QWORD PTR [rcx+0x90]
     1420502:	49 89 c5             	mov    r13,rax
     1420505:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1420508:	48 85 c0             	test   rax,rax
     142050b:	75 1e                	jne    142052b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x265aaf>
     142050d:	49 8b bf c0 00 00 00 	mov    rdi,QWORD PTR [r15+0xc0]
     1420514:	e8 49 9f 65 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
     1420519:	49 87 45 00          	xchg   QWORD PTR [r13+0x0],rax
     142051d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1420522:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1420525:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
     142052b:	4d 8b 74 24 18       	mov    r14,QWORD PTR [r12+0x18]
     1420530:	49 8b 87 98 01 00 00 	mov    rax,QWORD PTR [r15+0x198]
     1420537:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     142053c:	b0 01                	mov    al,0x1
     142053e:	41 86 86 e0 03 00 00 	xchg   BYTE PTR [r14+0x3e0],al
     1420545:	a8 01                	test   al,0x1
     1420547:	0f 85 1c 01 00 00    	jne    1420669 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x265bed>
     142054d:	41 80 7f 1e 00       	cmp    BYTE PTR [r15+0x1e],0x0
     1420552:	75 67                	jne    14205bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x265b3f>

### 0x1449f0d: mov    QWORD PTR [rsp+0x428],rax; FDE=(21274354, 21275184)
     1449ec5:	e8 36 40 3a 00       	call   17edf00 <_Znwm@plt>
     1449eca:	48 8d 0d af 7e 42 00 	lea    rcx,[rip+0x427eaf]        # 1871d80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e468>
     1449ed1:	48 89 08             	mov    QWORD PTR [rax],rcx
     1449ed4:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     1449ed8:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1449edc:	5b                   	pop    rbx
     1449edd:	c3                   	ret
     1449ede:	48 8d 05 9b 7e 42 00 	lea    rax,[rip+0x427e9b]        # 1871d80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e468>
     1449ee5:	48 89 06             	mov    QWORD PTR [rsi],rax
     1449ee8:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     1449eec:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     1449ef0:	c3                   	ret
     1449ef1:	cc                   	int3
     1449ef2:	55                   	push   rbp
     1449ef3:	41 57                	push   r15
     1449ef5:	41 56                	push   r14
     1449ef7:	41 54                	push   r12
     1449ef9:	53                   	push   rbx
     1449efa:	48 81 ec 30 04 00 00 	sub    rsp,0x430
     1449f01:	49 89 f7             	mov    r15,rsi
     1449f04:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1449f0b:	00 00 
     1449f0d:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
     1449f14:	00 
     1449f15:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     1449f19:	48 89 f7             	mov    rdi,rsi
     1449f1c:	e8 27 ef ff ff       	call   1448e48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28e3cc>
     1449f21:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
     1449f26:	49 83 c7 08          	add    r15,0x8
     1449f2a:	48 89 df             	mov    rdi,rbx
     1449f2d:	4c 89 fe             	mov    rsi,r15
     1449f30:	e8 1f c5 f0 ff       	call   1356454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b9d8>
     1449f35:	41 80 be 38 02 00 00 	cmp    BYTE PTR [r14+0x238],0x0
     1449f3c:	00 
     1449f3d:	75 42                	jne    1449f81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28f505>
     1449f3f:	48 8d 35 b4 e1 f2 fe 	lea    rsi,[rip+0xfffffffffef2e1b4]        # 3780fa <_ZTSSt12bad_any_cast@@Base-0x180ce>
     1449f46:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     1449f4d:	00 
     1449f4e:	e8 2b fb 62 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1449f53:	6a 02                	push   0x2
     1449f55:	5e                   	pop    rsi
     1449f56:	48 8d 94 24 20 03 00 	lea    rdx,[rsp+0x320]
     1449f5d:	00 
     1449f5e:	4c 89 f7             	mov    rdi,r14
     1449f61:	e8 68 e9 ff ff       	call   14488ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28de52>
     1449f66:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     1449f6d:	00 
     1449f6e:	e8 1d 3f 3a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1449f73:	41 80 be 38 02 00 00 	cmp    BYTE PTR [r14+0x238],0x0
     1449f7a:	00 
     1449f7b:	0f 84 d0 01 00 00    	je     144a151 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28f6d5>

### 0x14b93b8: mov    QWORD PTR [rsp+0x428],rax; FDE=(21729778, 21733679)
     14b9355:	48 8d 9c 24 90 01 00 	lea    rbx,[rsp+0x190]
     14b935c:	00 
     14b935d:	4d 8b 2f             	mov    r13,QWORD PTR [r15]
     14b9360:	4d 8b 77 08          	mov    r14,QWORD PTR [r15+0x8]
     14b9364:	41 8b af 70 01 00 00 	mov    ebp,DWORD PTR [r15+0x170]
     14b936b:	49 8b 87 88 01 00 00 	mov    rax,QWORD PTR [r15+0x188]
     14b9372:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     14b9377:	48 8d 35 86 82 ec fe 	lea    rsi,[rip+0xfffffffffeec8286]        # 381604 <_ZTSSt12bad_any_cast@@Base-0xebc4>
     14b937e:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     14b9383:	e8 f6 06 5c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14b9388:	4c 89 ac 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],r13
     14b938f:	00 
     14b9390:	4c 89 b4 24 f8 03 00 	mov    QWORD PTR [rsp+0x3f8],r14
     14b9397:	00 
     14b9398:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     14b939d:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
     14b93a1:	48 89 84 24 10 04 00 	mov    QWORD PTR [rsp+0x410],rax
     14b93a8:	00 
     14b93a9:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     14b93ac:	0f 29 84 24 00 04 00 	movaps XMMWORD PTR [rsp+0x400],xmm0
     14b93b3:	00 
     14b93b4:	48 8b 41 28          	mov    rax,QWORD PTR [rcx+0x28]
     14b93b8:	48 89 84 24 28 04 00 	mov    QWORD PTR [rsp+0x428],rax
     14b93bf:	00 
     14b93c0:	0f 10 41 18          	movups xmm0,XMMWORD PTR [rcx+0x18]
     14b93c4:	0f 11 84 24 18 04 00 	movups XMMWORD PTR [rsp+0x418],xmm0
     14b93cb:	00 
     14b93cc:	48 8b 41 40          	mov    rax,QWORD PTR [rcx+0x40]
     14b93d0:	48 89 84 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rax
     14b93d7:	00 
     14b93d8:	0f 10 41 30          	movups xmm0,XMMWORD PTR [rcx+0x30]
     14b93dc:	0f 29 84 24 30 04 00 	movaps XMMWORD PTR [rsp+0x430],xmm0
     14b93e3:	00 
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

### 0x152318d: mov    QWORD PTR [rbx+0x428],rax; FDE=(22161852, 22164816)
     152311d:	31 f6                	xor    esi,esi
     152311f:	e8 e2 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523124:	48 89 83 d8 03 00 00 	mov    QWORD PTR [rbx+0x3d8],rax
     152312b:	49 8b be e0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3e0]
     1523132:	31 f6                	xor    esi,esi
     1523134:	e8 cd 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523139:	48 89 83 e0 03 00 00 	mov    QWORD PTR [rbx+0x3e0],rax
     1523140:	49 8b be e8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3e8]
     1523147:	31 f6                	xor    esi,esi
     1523149:	e8 b8 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152314e:	48 89 83 e8 03 00 00 	mov    QWORD PTR [rbx+0x3e8],rax
     1523155:	49 8b be f0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3f0]
     152315c:	31 f6                	xor    esi,esi
     152315e:	e8 a3 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523163:	48 89 83 f0 03 00 00 	mov    QWORD PTR [rbx+0x3f0],rax
     152316a:	49 8b be 20 04 00 00 	mov    rdi,QWORD PTR [r14+0x420]
     1523171:	31 f6                	xor    esi,esi
     1523173:	e8 8e 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523178:	48 89 83 20 04 00 00 	mov    QWORD PTR [rbx+0x420],rax
     152317f:	49 8b be 28 04 00 00 	mov    rdi,QWORD PTR [r14+0x428]
     1523186:	31 f6                	xor    esi,esi
     1523188:	e8 79 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152318d:	48 89 83 28 04 00 00 	mov    QWORD PTR [rbx+0x428],rax
     1523194:	49 8b be 30 04 00 00 	mov    rdi,QWORD PTR [r14+0x430]
     152319b:	31 f6                	xor    esi,esi
     152319d:	e8 64 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231a2:	48 89 83 30 04 00 00 	mov    QWORD PTR [rbx+0x430],rax
     15231a9:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     15231b0:	31 f6                	xor    esi,esi
     15231b2:	e8 4f 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231b7:	48 89 83 38 04 00 00 	mov    QWORD PTR [rbx+0x438],rax
     15231be:	49 8b be 40 04 00 00 	mov    rdi,QWORD PTR [r14+0x440]
     15231c5:	31 f6                	xor    esi,esi
     15231c7:	e8 3a 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231cc:	48 89 83 40 04 00 00 	mov    QWORD PTR [rbx+0x440],rax
     15231d3:	49 8b be 48 04 00 00 	mov    rdi,QWORD PTR [r14+0x448]
     15231da:	31 f6                	xor    esi,esi
     15231dc:	e8 25 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231e1:	48 89 83 48 04 00 00 	mov    QWORD PTR [rbx+0x448],rax
     15231e8:	49 8b be 50 04 00 00 	mov    rdi,QWORD PTR [r14+0x450]
     15231ef:	31 f6                	xor    esi,esi
     15231f1:	e8 10 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231f6:	48 89 83 50 04 00 00 	mov    QWORD PTR [rbx+0x450],rax
     15231fd:	49 8b be 58 04 00 00 	mov    rdi,QWORD PTR [r14+0x458]
     1523204:	31 f6                	xor    esi,esi
     1523206:	e8 fb 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152320b:	48 89 83 58 04 00 00 	mov    QWORD PTR [rbx+0x458],rax
     1523212:	49 8b be 60 04 00 00 	mov    rdi,QWORD PTR [r14+0x460]
     1523219:	31 f6                	xor    esi,esi
     152321b:	e8 e6 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523220:	48 89 83 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rax

### 0x1667fb1: mov    QWORD PTR [r12+0x428],rax; FDE=(23494548, 23494673)
     1667f6d:	e8 be ed 43 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1667f72:	eb 03                	jmp    1667f77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c0e3>
     1667f74:	49 89 c7             	mov    r15,rax
     1667f77:	4c 89 f7             	mov    rdi,r14
     1667f7a:	e8 11 5f 18 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1667f7f:	eb 03                	jmp    1667f84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c0f0>
     1667f81:	49 89 c7             	mov    r15,rax
     1667f84:	48 89 df             	mov    rdi,rbx
     1667f87:	e8 04 5f 18 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1667f8c:	4c 89 ff             	mov    rdi,r15
     1667f8f:	e8 3c 7d 40 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1667f94:	41 57                	push   r15
     1667f96:	41 56                	push   r14
     1667f98:	41 54                	push   r12
     1667f9a:	53                   	push   rbx
     1667f9b:	50                   	push   rax
     1667f9c:	4c 89 c3             	mov    rbx,r8
     1667f9f:	49 89 ce             	mov    r14,rcx
     1667fa2:	49 89 d7             	mov    r15,rdx
     1667fa5:	49 89 fc             	mov    r12,rdi
     1667fa8:	e8 ff 82 06 00       	call   16d02ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84418>
     1667fad:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     1667fb1:	49 89 84 24 28 04 00 	mov    QWORD PTR [r12+0x428],rax
     1667fb8:	00 
     1667fb9:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     1667fbd:	41 0f 11 84 24 18 04 	movups XMMWORD PTR [r12+0x418],xmm0
     1667fc4:	00 00 
     1667fc6:	0f 57 c0             	xorps  xmm0,xmm0
     1667fc9:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     1667fce:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     1667fd2:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     1667fd6:	49 89 84 24 40 04 00 	mov    QWORD PTR [r12+0x440],rax
     1667fdd:	00 
     1667fde:	41 0f 10 0e          	movups xmm1,XMMWORD PTR [r14]
     1667fe2:	41 0f 11 8c 24 30 04 	movups XMMWORD PTR [r12+0x430],xmm1
     1667fe9:	00 00 
     1667feb:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     1667ff0:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1667ff4:	49 81 c4 48 04 00 00 	add    r12,0x448
     1667ffb:	4c 89 e7             	mov    rdi,r12
     1667ffe:	48 89 de             	mov    rsi,rbx
     1668001:	48 83 c4 08          	add    rsp,0x8
     1668005:	5b                   	pop    rbx
     1668006:	41 5c                	pop    r12
     1668008:	41 5e                	pop    r14
     166800a:	41 5f                	pop    r15
     166800c:	e9 6d 3e 00 00       	jmp    166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
     1668011:	cc                   	int3
     1668012:	53                   	push   rbx
     1668013:	48 89 fb             	mov    rbx,rdi
     1668016:	e8 6b 82 06 00       	call   16d0286 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x843f2>

### 0x16680a4: mov    QWORD PTR [r14+0x428],rax; FDE=(23494798, 23494933)
     1668039:	88 83 e0 04 00 00    	mov    BYTE PTR [rbx+0x4e0],al
     166803f:	0f 11 83 68 04 00 00 	movups XMMWORD PTR [rbx+0x468],xmm0
     1668046:	0f 11 83 78 04 00 00 	movups XMMWORD PTR [rbx+0x478],xmm0
     166804d:	0f 11 83 88 04 00 00 	movups XMMWORD PTR [rbx+0x488],xmm0
     1668054:	0f 11 83 98 04 00 00 	movups XMMWORD PTR [rbx+0x498],xmm0
     166805b:	0f 11 83 a8 04 00 00 	movups XMMWORD PTR [rbx+0x4a8],xmm0
     1668062:	0f 11 83 b8 04 00 00 	movups XMMWORD PTR [rbx+0x4b8],xmm0
     1668069:	66 83 a3 c8 04 00 00 	and    WORD PTR [rbx+0x4c8],0x0
     1668070:	00 
     1668071:	0f 11 83 18 04 00 00 	movups XMMWORD PTR [rbx+0x418],xmm0
     1668078:	0f 11 83 28 04 00 00 	movups XMMWORD PTR [rbx+0x428],xmm0
     166807f:	0f 11 83 38 04 00 00 	movups XMMWORD PTR [rbx+0x438],xmm0
     1668086:	88 83 48 04 00 00    	mov    BYTE PTR [rbx+0x448],al
     166808c:	5b                   	pop    rbx
     166808d:	c3                   	ret
     166808e:	41 56                	push   r14
     1668090:	53                   	push   rbx
     1668091:	50                   	push   rax
     1668092:	48 89 f3             	mov    rbx,rsi
     1668095:	49 89 fe             	mov    r14,rdi
     1668098:	e8 0f 82 06 00       	call   16d02ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84418>
     166809d:	48 8b 83 28 04 00 00 	mov    rax,QWORD PTR [rbx+0x428]
     16680a4:	49 89 86 28 04 00 00 	mov    QWORD PTR [r14+0x428],rax
     16680ab:	0f 10 83 18 04 00 00 	movups xmm0,XMMWORD PTR [rbx+0x418]
     16680b2:	41 0f 11 86 18 04 00 	movups XMMWORD PTR [r14+0x418],xmm0
     16680b9:	00 
     16680ba:	0f 57 c0             	xorps  xmm0,xmm0
     16680bd:	0f 11 83 18 04 00 00 	movups XMMWORD PTR [rbx+0x418],xmm0
     16680c4:	48 83 a3 28 04 00 00 	and    QWORD PTR [rbx+0x428],0x0
     16680cb:	00 
     16680cc:	48 8b 83 40 04 00 00 	mov    rax,QWORD PTR [rbx+0x440]
     16680d3:	49 89 86 40 04 00 00 	mov    QWORD PTR [r14+0x440],rax
     16680da:	0f 10 8b 30 04 00 00 	movups xmm1,XMMWORD PTR [rbx+0x430]
     16680e1:	41 0f 11 8e 30 04 00 	movups XMMWORD PTR [r14+0x430],xmm1
     16680e8:	00 
     16680e9:	0f 11 83 30 04 00 00 	movups XMMWORD PTR [rbx+0x430],xmm0
     16680f0:	48 83 a3 40 04 00 00 	and    QWORD PTR [rbx+0x440],0x0
     16680f7:	00 
     16680f8:	b8 48 04 00 00       	mov    eax,0x448
     16680fd:	49 01 c6             	add    r14,rax
     1668100:	48 01 c3             	add    rbx,rax
     1668103:	4c 89 f7             	mov    rdi,r14
     1668106:	48 89 de             	mov    rsi,rbx
     1668109:	48 83 c4 08          	add    rsp,0x8
     166810d:	5b                   	pop    rbx
     166810e:	41 5e                	pop    r14
     1668110:	e9 69 3d 00 00       	jmp    166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
     1668115:	cc                   	int3
     1668116:	53                   	push   rbx
     1668117:	48 89 fb             	mov    rbx,rdi
     166811a:	48 81 c7 48 04 00 00 	add    rdi,0x448

