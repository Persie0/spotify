# AdsRuntime readiness dependency

Proven:
- AdsSetupImpl +0x28 returns embedded runtime at this+0x10
- runtime AP = 0x1879950
- runtime +0x140 = 0x125bd98
- 0x125bd98 does: dep=[this+0x18]; return dep->virtual+0x40()

Goal: resolve runtime+0x18 dependency class and its +0x40 method semantics.

## Constructor/helper 0x14e15e4 FDE=(21894628, 21894886)
     14e15ff:	48 8d 05 4a 83 39 00 	lea    rax,[rip+0x39834a]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
     14e1610:	e8 a7 11 00 00       	call   14e27bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327d40>
     14e1629:	e8 f2 2c 6b ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
     14e1634:	e8 af 2d e7 ff       	call   13543e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19996c>
     14e166c:	e8 1f d5 30 00       	call   17eeb90 <memset@plt>
     14e16bf:	44 88 b3 b8 01 00 00 	mov    BYTE PTR [rbx+0x1b8],r14b
     14e16e1:	e8 ca e3 30 00       	call   17efab0 <__stack_chk_fail@plt>

## Constructor/helper 0x14cd946 FDE=(21813574, 21813663)
     14cd963:	e8 28 12 32 00       	call   17eeb90 <memset@plt>
     14cd96b:	e8 86 c0 30 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>

## All writes to runtime-like +0x18 in constructor families
## Runtime +0x140 exact method
     125bd85:	ff 50 30             	call   QWORD PTR [rax+0x30]
     125bd88:	48 89 d8             	mov    rax,rbx
     125bd8b:	5b                   	pop    rbx
     125bd8c:	c3                   	ret
     125bd8d:	cc                   	int3
     125bd8e:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     125bd92:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     125bd95:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
     125bd98:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     125bd9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     125bd9f:	ff 60 40             	jmp    QWORD PTR [rax+0x40]
     125bda2:	41 57                	push   r15
     125bda4:	41 56                	push   r14
     125bda6:	41 55                	push   r13
     125bda8:	41 54                	push   r12
     125bdaa:	53                   	push   rbx
     125bdab:	48 81 ec 90 00 00 00 	sub    rsp,0x90
     125bdb2:	49 89 f6             	mov    r14,rsi
     125bdb5:	48 89 fb             	mov    rbx,rdi
     125bdb8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     125bdbf:	00 00 
     125bdc1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     125bdc8:	00 
     125bdc9:	48 8b 77 18          	mov    rsi,QWORD PTR [rdi+0x18]

## All materializations of runtime AP 0x1879950
### 0x145580b: lea    rax,[rip+0x42413e]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>; FDE=(21321732, 21321969)
     14557d9:	48 89 07             	mov    QWORD PTR [rdi],rax
     14557dc:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     14557e1:	48 8d 05 10 a0 fe fe 	lea    rax,[rip+0xfffffffffefea010]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     14557e8:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     14557ec:	83 67 40 00          	and    DWORD PTR [rdi+0x40],0x0
     14557f0:	83 67 30 00          	and    DWORD PTR [rdi+0x30],0x0
     14557f4:	0f 57 c0             	xorps  xmm0,xmm0
     14557f7:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
     14557fb:	48 89 d6             	mov    rsi,rdx
     14557fe:	e9 f5 fe ff ff       	jmp    14556f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ac7c>
     1455803:	cc                   	int3
     1455804:	41 56                	push   r14
     1455806:	53                   	push   rbx
     1455807:	50                   	push   rax
     1455808:	48 89 fb             	mov    rbx,rdi
     145580b:	48 8d 05 3e 41 42 00 	lea    rax,[rip+0x42413e]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
     1455812:	48 89 07             	mov    QWORD PTR [rdi],rax
     1455815:	48 81 c7 90 01 00 00 	add    rdi,0x190
     145581c:	e8 45 ce 68 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     1455821:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
     1455828:	e8 63 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     145582d:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
     1455834:	e8 57 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1455839:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
     1455840:	e8 4b 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1455845:	48 8d bb 28 01 00 00 	lea    rdi,[rbx+0x128]
     145584c:	e8 3f 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1455851:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
     1455858:	e8 8d 5a 6a ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     145585d:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
     1455864:	e8 27 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1455869:	48 83 bb c8 00 00 00 	cmp    QWORD PTR [rbx+0xc8],0x0
     1455870:	00 
     1455871:	74 17                	je     145588a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ae0e>
     1455873:	4c 8d b3 c8 00 00 00 	lea    r14,[rbx+0xc8]
     145587a:	4c 89 f7             	mov    rdi,r14
     145587d:	e8 a8 00 00 00       	call   145592a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29aeae>
     1455882:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     1455885:	e8 96 86 39 00       	call   17edf20 <_ZdlPv@plt>
     145588a:	48 83 bb b0 00 00 00 	cmp    QWORD PTR [rbx+0xb0],0x0
     1455891:	00 
     1455892:	74 17                	je     14558ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ae2f>
     1455894:	4c 8d b3 b0 00 00 00 	lea    r14,[rbx+0xb0]
     145589b:	4c 89 f7             	mov    rdi,r14
     145589e:	e8 4f 00 00 00       	call   14558f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ae76>
     14558a3:	49 8b 3e             	mov    rdi,QWORD PTR [r14]

### 0x14e15ff: lea    rax,[rip+0x39834a]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>; FDE=(21894628, 21894886)
     14e15d5:	48 83 c4 08          	add    rsp,0x8
     14e15d9:	5b                   	pop    rbx
     14e15da:	41 5e                	pop    r14
     14e15dc:	41 5f                	pop    r15
     14e15de:	5d                   	pop    rbp
     14e15df:	e9 3a a3 18 00       	jmp    166b91e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa8a>
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

## Nearby candidate dependency address points
## FDEs containing both AP 0x1879950 and a +0x18 write
### FDE 0x1455804..0x14558f1; writes=0

### FDE 0x14e15e4..0x14e16e6; writes=0

