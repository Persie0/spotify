# Smart-skip interval provider classes

Primary object: TimelineConductor+0xb0, size 0x110, AP 0x1869ea8, setup helper 0x13a1b30.
Fallback object: TimelineConductor+0xb8, size 0x110, AP 0x186a0b8, setup helper 0x13a3b66.

## primary AP 0x1869ea8
- +0x0: 0x13a1efc FDE=(20586236, 20586381)
- +0x8: 0x13a1f8e FDE=(20586382, 20586400)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0x9d7de0 FDE=(10321376, 10321377)
- +0x30: 0x9d7de0 FDE=(10321376, 10321377)
- +0x38: 0x9d7de0 FDE=(10321376, 10321377)
- +0x40: 0x9d7de0 FDE=(10321376, 10321377)
- +0x48: 0x9d7de0 FDE=(10321376, 10321377)
- +0x50: 0x13a1fa0 FDE=(20586400, 20586576)
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0xa50370 FDE=(10814320, 10814325)
- +0xb0: 0x13a1b10 FDE=(20585232, 20585264)
- +0xb8: 0x13a1b30 FDE=(20585264, 20585283)
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0xa50370 FDE=(10814320, 10814325)
- +0xd0: 0x13a1b44 FDE=(20585284, 20585696)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0xa0da20 FDE=(10541600, 10541618)
- +0xf8: 0x13a2528 FDE=(20587816, 20587824)

### method strings
#### slot +0x50 -> 0x13a1fa0
- '_conductor: '
#### slot +0xf8 -> 0x13a2528
- 'timeline_conductor_video'

## fallback AP 0x186a0b8
- +0x0: 0x13a39f2 FDE=(20593138, 20593283)
- +0x8: 0x13a3a84 FDE=(20593284, 20593302)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x9d7de0 FDE=(10321376, 10321377)
- +0x28: 0x9d7de0 FDE=(10321376, 10321377)
- +0x30: 0x9d7de0 FDE=(10321376, 10321377)
- +0x38: 0x9d7de0 FDE=(10321376, 10321377)
- +0x40: 0x9d7de0 FDE=(10321376, 10321377)
- +0x48: 0x9d7de0 FDE=(10321376, 10321377)
- +0x50: 0x13a3a96 FDE=(20593302, 20593478)
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0x9d7de0 FDE=(10321376, 10321377)
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0xa0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa8: 0xa50370 FDE=(10814320, 10814325)
- +0xb0: 0x13a3b46 FDE=(20593478, 20593510)
- +0xb8: 0x13a3b66 FDE=(20593510, 20593529)
- +0xc0: 0x9d7de0 FDE=(10321376, 10321377)
- +0xc8: 0xa50370 FDE=(10814320, 10814325)
- +0xd0: 0x13a3b7a FDE=(20593530, 20594269)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0x13a46d0 FDE=(20596432, 20596447)
- +0xf0: 0x13a46e0 FDE=(20596448, 20596466)
- +0xf8: 0x13a46f2 FDE=(20596466, 20596489)

### method strings
#### slot +0x50 -> 0x13a3a96
- '_conductor: '
#### slot +0xd0 -> 0x13a3b7a
- 'list_player'

## Setup helpers
### primary setup 0x13a1b30 FDE=(20585264, 20585283)
     13a1b30:	48 8d 05 11 84 4c 00 	lea    rax,[rip+0x4c8411]        # 1869f48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26630>
     13a1b37:	48 89 06             	mov    QWORD PTR [rsi],rax
     13a1b3a:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     13a1b3e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     13a1b42:	c3                   	ret

### fallback setup 0x13a3b66 FDE=(20593510, 20593529)
     13a3b66:	48 8d 05 eb 65 4c 00 	lea    rax,[rip+0x4c65eb]        # 186a158 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26840>
     13a3b6d:	48 89 06             	mov    QWORD PTR [rsi],rax
     13a3b70:	0f 10 47 08          	movups xmm0,XMMWORD PTR [rdi+0x8]
     13a3b74:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
     13a3b78:	c3                   	ret

### primary extractor 0x13a1922 FDE=(20584738, 20585034)
     13a1922:	55                   	push   rbp
     13a1923:	41 57                	push   r15
     13a1925:	41 56                	push   r14
     13a1927:	41 55                	push   r13
     13a1929:	41 54                	push   r12
     13a192b:	53                   	push   rbx
     13a192c:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     13a1933:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a193a:	00 00 
     13a193c:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     13a1943:	00 
     13a1944:	83 7e 38 3f          	cmp    DWORD PTR [rsi+0x38],0x3f
     13a1948:	0f 85 8f 00 00 00    	jne    13a19dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6f61>
     13a194e:	48 89 cb             	mov    rbx,rcx
     13a1951:	49 89 d6             	mov    r14,rdx
     13a1954:	49 89 f4             	mov    r12,rsi
     13a1957:	49 89 ff             	mov    r15,rdi
     13a195a:	0f 57 c0             	xorps  xmm0,xmm0
     13a195d:	0f 11 44 24 29       	movups XMMWORD PTR [rsp+0x29],xmm0
     13a1962:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     13a1967:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     13a196c:	48 83 c7 30          	add    rdi,0x30
     13a1970:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     13a1974:	c6 44 24 08 01       	mov    BYTE PTR [rsp+0x8],0x1
     13a1979:	e8 72 c7 44 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     13a197e:	4c 8d 6c 24 48       	lea    r13,[rsp+0x48]
     13a1983:	4c 89 ef             	mov    rdi,r13
     13a1986:	4c 89 e6             	mov    rsi,r12
     13a1989:	e8 d8 84 32 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     13a198e:	49 83 c7 58          	add    r15,0x58
     13a1992:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     13a1997:	4c 89 ff             	mov    rdi,r15
     13a199a:	4c 89 ee             	mov    rsi,r13
     13a199d:	e8 c8 ea ff ff       	call   13a046a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e59ee>
     13a19a2:	89 c5                	mov    ebp,eax
     13a19a4:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     13a19a9:	e8 80 39 32 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     13a19ae:	48 89 e7             	mov    rdi,rsp
     13a19b1:	e8 7a a4 70 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     13a19b6:	40 84 ed             	test   bpl,bpl
     13a19b9:	74 16                	je     13a19d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6f55>
     13a19bb:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     13a19c0:	4c 89 f7             	mov    rdi,r14
     13a19c3:	4c 89 fe             	mov    rsi,r15
     13a19c6:	e8 87 65 76 ff       	call   b07f52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54ef2>
     13a19cb:	41 8a 47 28          	mov    al,BYTE PTR [r15+0x28]
     13a19cf:	88 03                	mov    BYTE PTR [rbx],al
     13a19d1:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a19d6:	e8 79 ea ff ff       	call   13a0454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e59d8>
     13a19db:	eb 02                	jmp    13a19df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6f63>
     13a19dd:	31 ed                	xor    ebp,ebp
     13a19df:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a19e6:	00 00 
     13a19e8:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
     13a19ef:	00 
     13a19f0:	75 53                	jne    13a1a45 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6fc9>
     13a19f2:	89 e8                	mov    eax,ebp
     13a19f4:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
     13a19fb:	5b                   	pop    rbx
     13a19fc:	41 5c                	pop    r12
     13a19fe:	41 5d                	pop    r13
     13a1a00:	41 5e                	pop    r14
     13a1a02:	41 5f                	pop    r15
     13a1a04:	5d                   	pop    rbp
     13a1a05:	c3                   	ret
     13a1a06:	48 89 c3             	mov    rbx,rax
     13a1a09:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     13a1a0e:	e8 1b 39 32 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     13a1a13:	48 89 e7             	mov    rdi,rsp
     13a1a16:	e8 15 a4 70 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     13a1a1b:	eb 03                	jmp    13a1a20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6fa4>
     13a1a1d:	48 89 c3             	mov    rbx,rax
     13a1a20:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a1a25:	e8 2a ea ff ff       	call   13a0454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e59d8>
     13a1a2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a1a31:	00 00 
     13a1a33:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
     13a1a3a:	00 
     13a1a3b:	75 08                	jne    13a1a45 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6fc9>
     13a1a3d:	48 89 df             	mov    rdi,rbx
     13a1a40:	e8 8b e2 6c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13a1a45:	e8 66 e0 44 00       	call   17efab0 <__stack_chk_fail@plt>

### fallback extractor 0x13a37f8 FDE=(20592632, 20592939)
     13a37f8:	55                   	push   rbp
     13a37f9:	41 57                	push   r15
     13a37fb:	41 56                	push   r14
     13a37fd:	41 55                	push   r13
     13a37ff:	41 54                	push   r12
     13a3801:	53                   	push   rbx
     13a3802:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     13a3809:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a3810:	00 00 
     13a3812:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     13a3819:	00 
     13a381a:	83 7e 38 3f          	cmp    DWORD PTR [rsi+0x38],0x3f
     13a381e:	0f 85 98 00 00 00    	jne    13a38bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8e40>
     13a3824:	48 89 cb             	mov    rbx,rcx
     13a3827:	49 89 d6             	mov    r14,rdx
     13a382a:	49 89 f4             	mov    r12,rsi
     13a382d:	49 89 ff             	mov    r15,rdi
     13a3830:	0f 57 c0             	xorps  xmm0,xmm0
     13a3833:	0f 11 84 24 89 00 00 	movups XMMWORD PTR [rsp+0x89],xmm0
     13a383a:	00 
     13a383b:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
     13a3842:	00 
     13a3843:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     13a3848:	48 83 c7 30          	add    rdi,0x30
     13a384c:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     13a3851:	c6 44 24 10 01       	mov    BYTE PTR [rsp+0x10],0x1
     13a3856:	e8 95 a8 44 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     13a385b:	4c 8d 6c 24 18       	lea    r13,[rsp+0x18]
     13a3860:	4c 89 ef             	mov    rdi,r13
     13a3863:	4c 89 e6             	mov    rsi,r12
     13a3866:	e8 fb 65 32 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     13a386b:	49 83 c7 58          	add    r15,0x58
     13a386f:	48 8d 54 24 70       	lea    rdx,[rsp+0x70]
     13a3874:	4c 89 ff             	mov    rdi,r15
     13a3877:	4c 89 ee             	mov    rsi,r13
     13a387a:	e8 d5 fa ff ff       	call   13a3354 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e88d8>
     13a387f:	89 c5                	mov    ebp,eax
     13a3881:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     13a3886:	e8 a3 1a 32 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     13a388b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13a3890:	e8 9b 85 70 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     13a3895:	40 84 ed             	test   bpl,bpl
     13a3898:	74 16                	je     13a38b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8e34>
     13a389a:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
     13a389f:	4c 89 f7             	mov    rdi,r14
     13a38a2:	4c 89 fe             	mov    rsi,r15
     13a38a5:	e8 a8 46 76 ff       	call   b07f52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54ef2>
     13a38aa:	41 8a 47 28          	mov    al,BYTE PTR [r15+0x28]
     13a38ae:	88 03                	mov    BYTE PTR [rbx],al
     13a38b0:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     13a38b5:	e8 9a cb ff ff       	call   13a0454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e59d8>
     13a38ba:	eb 02                	jmp    13a38be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8e42>
     13a38bc:	31 ed                	xor    ebp,ebp
     13a38be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a38c5:	00 00 
     13a38c7:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
     13a38ce:	00 
     13a38cf:	75 55                	jne    13a3926 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8eaa>
     13a38d1:	89 e8                	mov    eax,ebp
     13a38d3:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
     13a38da:	5b                   	pop    rbx
     13a38db:	41 5c                	pop    r12
     13a38dd:	41 5d                	pop    r13
     13a38df:	41 5e                	pop    r14
     13a38e1:	41 5f                	pop    r15
     13a38e3:	5d                   	pop    rbp
     13a38e4:	c3                   	ret
     13a38e5:	48 89 c3             	mov    rbx,rax
     13a38e8:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     13a38ed:	e8 3c 1a 32 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     13a38f2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13a38f7:	e8 34 85 70 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     13a38fc:	eb 03                	jmp    13a3901 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8e85>
     13a38fe:	48 89 c3             	mov    rbx,rax
     13a3901:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     13a3906:	e8 49 cb ff ff       	call   13a0454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e59d8>
     13a390b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a3912:	00 00 
     13a3914:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
     13a391b:	00 
     13a391c:	75 08                	jne    13a3926 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8eaa>
     13a391e:	48 89 df             	mov    rdi,rbx
     13a3921:	e8 aa c3 6c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13a3926:	e8 85 c1 44 00       	call   17efab0 <__stack_chk_fail@plt>

## Callers of setup helpers
### target 0x13a1b30
- caller 0x135ed2a FDE=(20303958, 20319259)

### target 0x13a3b66
- caller 0x135ee28 FDE=(20303958, 20319259)

