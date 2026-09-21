# TimelineAds sibling readiness interfaces

Known:
- TimelineAds owner AP 0x1867340
- +0x30 returns owner+0x28
- +0x38 returns owner+0x40
- owner+0x28 fallback AP 0x1871558
- owner+0x40 fallback AP 0x1871530
- both dynamic branches use 0x1439114
- TimelineConductor consumes both via TimelineAds +0x30/+0x38

## Address point 0x1871530
- header: -0x10=0 -0x8=0
- +0x0: 0xad7ee6 FDE=(11370214, 11370223)
- +0x8: 0xec8b4a FDE=(15502154, 15502176)
- +0x10: 0x143b2fe FDE=(21213950, 21214576)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0x9d7de0 FDE=(10321376, 10321377)
- +0x30: 0xa50370 FDE=(10814320, 10814325)
- +0x38: 0x143b7ae FDE=(21215150, 21216006)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x143d498 FDE=(21222552, 21222571)
- +0x58: 0x143d4ac FDE=(21222572, 21222590)
- +0x60: 0x143d4be FDE=(21222590, 21222750)
- +0x68: 0x143d55e FDE=(21222750, 21222776)
- +0x70: 0xce39ae FDE=(13515182, 13515191)
- +0x78: 0xc9701c FDE=(13201436, 13201458)
- +0x80: 0x143d578 FDE=(21222776, 21223611)
- +0x88: 0x0 FDE=None
- +0x90: 0x0 FDE=None
- +0x98: 0x9d7de0 FDE=(10321376, 10321377)
- +0xa0: 0xa50370 FDE=(10814320, 10814325)
- +0xa8: 0x143dfec FDE=(21225452, 21225463)
- +0xb0: 0x143dfec FDE=(21225452, 21225463)
- +0xb8: 0x143dff8 FDE=(21225464, 21225475)
- +0xc0: 0x143e004 FDE=(21225476, 21225487)
- +0xc8: 0x143e010 FDE=(21225488, 21225499)
- +0xd0: 0x143e01c FDE=(21225500, 21225511)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0xa0da20 FDE=(10541600, 10541618)
- +0xf8: 0x143e1d8 FDE=(21225944, 21225952)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0x143e1e0 FDE=(21225952, 21226080)
- +0x120: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0x143e260 FDE=(21226080, 21226089)
- +0x138: 0x143e26a FDE=(21226090, 21226112)
- +0x140: 0x143e280 FDE=(21226112, 21226276)
- +0x148: 0x143e324 FDE=(21226276, 21226441)
- +0x150: 0x143e3ca FDE=(21226442, 21226606)
- +0x158: 0x143e46e FDE=(21226606, 21226771)
- +0x160: 0x143e514 FDE=(21226772, 21227562)
- +0x168: 0x143e82a FDE=(21227562, 21229178)
- +0x170: 0x143ee7a FDE=(21229178, 21230016)
- +0x178: 0x0 FDE=None
- +0x180: 0x0 FDE=None
### slot +0x28 body -> 0x9d7de0
      9d7de0:	c3                   	ret

### slot +0x30 body -> 0xa50370
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### slot +0x38 body -> 0x143b7ae
     143b7ae:	55                   	push   rbp
     143b7af:	41 57                	push   r15
     143b7b1:	41 56                	push   r14
     143b7b3:	41 55                	push   r13
     143b7b5:	41 54                	push   r12
     143b7b7:	53                   	push   rbx
     143b7b8:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     143b7bf:	4d 89 c5             	mov    r13,r8
     143b7c2:	49 89 d6             	mov    r14,rdx
     143b7c5:	49 89 f4             	mov    r12,rsi
     143b7c8:	48 89 fb             	mov    rbx,rdi
     143b7cb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143b7d2:	00 00 
     143b7d4:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     143b7db:	00 
     143b7dc:	e8 85 04 00 00       	call   143bc66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2811ea>
     143b7e1:	49 8b 6c 24 10       	mov    rbp,QWORD PTR [r12+0x10]
     143b7e6:	4c 8d 7c 24 68       	lea    r15,[rsp+0x68]
     143b7eb:	4d 89 67 f8          	mov    QWORD PTR [r15-0x8],r12
     143b7ef:	4c 89 ff             	mov    rdi,r15
     143b7f2:	4c 89 f6             	mov    rsi,r14
     143b7f5:	e8 46 27 3b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     143b7fa:	4c 8d a4 24 80 00 00 	lea    r12,[rsp+0x80]
     143b801:	00 
     143b802:	4c 89 e7             	mov    rdi,r12
     143b805:	4c 89 ee             	mov    rsi,r13
     143b808:	e8 c5 e6 ff ff       	call   1439ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f456>
     143b80d:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     143b811:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
     143b814:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
     143b81a:	48 85 c0             	test   rax,rax
     143b81d:	74 05                	je     143b824 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280da8>
     143b81f:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     143b824:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     143b82b:	00 00 
     143b82d:	48 83 a4 24 c0 00 00 	and    QWORD PTR [rsp+0xc0],0x0
     143b834:	00 00 
     143b836:	6a 50                	push   0x50
     143b838:	5f                   	pop    rdi
     143b839:	e8 c2 26 3b 00       	call   17edf00 <_Znwm@plt>
     143b83e:	49 89 c5             	mov    r13,rax
     143b841:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     143b846:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     143b84a:	49 8d 7d 08          	lea    rdi,[r13+0x8]
     143b84e:	4c 89 fe             	mov    rsi,r15
     143b851:	e8 ea 26 3b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     143b856:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
     143b85d:	00 
     143b85e:	4c 89 ef             	mov    rdi,r13
     143b861:	48 83 c7 20          	add    rdi,0x20
     143b865:	4c 89 e6             	mov    rsi,r12
     143b868:	e8 65 e6 ff ff       	call   1439ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f456>
     143b86d:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     143b871:	41 0f 11 45 40       	movups XMMWORD PTR [r13+0x40],xmm0
     143b876:	0f 57 c0             	xorps  xmm0,xmm0
     143b879:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     143b87d:	4c 89 ac 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r13
     143b884:	00 
     143b885:	48 8d 05 e4 fc ff ff 	lea    rax,[rip+0xfffffffffffffce4]        # 143b570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280af4>
     143b88c:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     143b893:	00 
     143b894:	48 8d 05 6b 02 00 00 	lea    rax,[rip+0x26b]        # 143bb06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28108a>
     143b89b:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     143b8a2:	00 
     143b8a3:	48 8d 35 5e d8 ff fe 	lea    rsi,[rip+0xfffffffffeffd85e]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     143b8aa:	4c 89 f7             	mov    rdi,r14
     143b8ad:	e8 3c 3e 66 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     143b8b2:	84 c0                	test   al,al
     143b8b4:	74 24                	je     143b8da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280e5e>
     143b8b6:	48 8b 75 20          	mov    rsi,QWORD PTR [rbp+0x20]
     143b8ba:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     143b8bd:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     143b8c4:	00 
     143b8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     143b8c8:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     143b8cf:	00 
     143b8d0:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
     143b8d7:	00 
     143b8d8:	eb 72                	jmp    143b94c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280ed0>
     143b8da:	48 8d 7d 40          	lea    rdi,[rbp+0x40]
     143b8de:	4c 89 f6             	mov    rsi,r14
     143b8e1:	e8 6e 9f 6a ff       	call   ae5854 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x327f4>
     143b8e6:	48 85 c0             	test   rax,rax
     143b8e9:	74 4a                	je     143b935 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280eb9>
     143b8eb:	49 89 c7             	mov    r15,rax
     143b8ee:	48 83 78 40 00       	cmp    QWORD PTR [rax+0x40],0x0
     143b8f3:	0f 84 a7 00 00 00    	je     143b9a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280f24>
     143b8f9:	49 83 c7 40          	add    r15,0x40
     143b8fd:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     143b901:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
     143b906:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     143b90a:	0f 57 c0             	xorps  xmm0,xmm0
     143b90d:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     143b911:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
     143b918:	00 
     143b919:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     143b91e:	4c 89 ff             	mov    rdi,r15
     143b921:	4c 89 e6             	mov    rsi,r12
     143b924:	e8 f3 de 67 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     143b929:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     143b92e:	e8 53 2b 66 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     143b933:	eb 0f                	jmp    143b944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280ec8>
     143b935:	0f 57 c0             	xorps  xmm0,xmm0
     143b938:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
     143b93f:	00 
     143b940:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     143b944:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     143b94b:	00 
     143b94c:	4c 89 f6             	mov    rsi,r14
     143b94f:	e8 58 22 00 00       	call   143dbac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283130>
     143b954:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     143b958:	e8 29 2b 66 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     143b95d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     143b964:	00 
     143b965:	e8 d6 81 f1 ff       	call   1353b40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1990c4>
     143b96a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     143b96f:	e8 16 fe ff ff       	call   143b78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280d0e>
     143b974:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143b97b:	00 00 
     143b97d:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     143b984:	00 
     143b985:	0f 85 76 01 00 00    	jne    143bb01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281085>
     143b98b:	48 89 d8             	mov    rax,rbx
     143b98e:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     143b995:	5b                   	pop    rbx
     143b996:	41 5c                	pop    r12
     143b998:	41 5d                	pop    r13
     143b99a:	41 5e                	pop    r14
     143b99c:	41 5f                	pop    r15
     143b99e:	5d                   	pop    rbp
     143b99f:	c3                   	ret
     143b9a0:	4c 89 ff             	mov    rdi,r15
     143b9a3:	48 83 c7 18          	add    rdi,0x18
     143b9a7:	41 80 7f 38 00       	cmp    BYTE PTR [r15+0x38],0x0
     143b9ac:	74 0f                	je     143b9bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280f41>
     143b9ae:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     143b9b5:	00 
     143b9b6:	e8 d1 19 00 00       	call   143d38c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282910>
     143b9bb:	eb 0d                	jmp    143b9ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280f4e>
     143b9bd:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     143b9c4:	00 
     143b9c5:	e8 be 1a 00 00       	call   143d488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282a0c>
     143b9ca:	4d 8b 6f 50          	mov    r13,QWORD PTR [r15+0x50]
     143b9ce:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]
     143b9d2:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     143b9d7:	49 89 6f f8          	mov    QWORD PTR [r15-0x8],rbp
     143b9db:	4c 89 ff             	mov    rdi,r15
     143b9de:	4c 89 f6             	mov    rsi,r14
     143b9e1:	e8 5a 25 3b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     143b9e6:	48 8d 05 2b 62 01 ff 	lea    rax,[rip+0xffffffffff01622b]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     143b9ed:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     143b9f2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     143b9f7:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
     143b9fd:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     143ba02:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     143ba07:	e8 fa cf 71 ff       	call   b58a06 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59a6>
     143ba0c:	48 83 a4 24 d0 00 00 	and    QWORD PTR [rsp+0xd0],0x0
     143ba13:	00 00 
     143ba15:	48 83 a4 24 e0 00 00 	and    QWORD PTR [rsp+0xe0],0x0
     143ba1c:	00 00 
     143ba1e:	6a 20                	push   0x20
     143ba20:	5f                   	pop    rdi
     143ba21:	e8 da 24 3b 00       	call   17edf00 <_Znwm@plt>
     143ba26:	49 89 c6             	mov    r14,rax
     143ba29:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     143ba2e:	48 89 c7             	mov    rdi,rax
     143ba31:	e8 d0 cf 71 ff       	call   b58a06 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59a6>
     143ba36:	48 8d ac 24 d0 00 00 	lea    rbp,[rsp+0xd0]
     143ba3d:	00 
     143ba3e:	4c 89 75 00          	mov    QWORD PTR [rbp+0x0],r14
     143ba42:	48 8d 05 c3 78 6b ff 	lea    rax,[rip+0xffffffffff6b78c3]        # af330c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x402ac>
     143ba49:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     143ba4d:	48 8d 05 40 23 00 00 	lea    rax,[rip+0x2340]        # 143dd94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283318>
     143ba54:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     143ba58:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     143ba5d:	4c 89 ef             	mov    rdi,r13
     143ba60:	48 89 ea             	mov    rdx,rbp
     143ba63:	4c 89 e1             	mov    rcx,r12
     143ba66:	45 31 c0             	xor    r8d,r8d
     143ba69:	e8 5e 5d 38 00       	call   17c17cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175938>
     143ba6e:	48 89 ef             	mov    rdi,rbp
     143ba71:	e8 28 b8 66 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     143ba76:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     143ba7b:	e8 a6 34 69 ff       	call   acef26 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bec6>
     143ba80:	4c 89 ff             	mov    rdi,r15
     143ba83:	e8 08 24 3b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     143ba88:	e9 d0 fe ff ff       	jmp    143b95d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280ee1>
     143ba8d:	eb 18                	jmp    143baa7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28102b>
     143ba8f:	48 89 c3             	mov    rbx,rax
     143ba92:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     143ba99:	00 
     143ba9a:	e8 ff b7 66 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     143ba9f:	48 89 df             	mov    rdi,rbx
     143baa2:	e8 fe df 63 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     143baa7:	48 89 c7             	mov    rdi,rax
     143baaa:	e8 f6 df 63 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     143baaf:	eb 0d                	jmp    143babe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281042>
     143bab1:	49 89 c6             	mov    r14,rax
     143bab4:	4c 89 ef             	mov    rdi,r13
     143bab7:	e8 64 24 3b 00       	call   17edf20 <_ZdlPv@plt>
     143babc:	eb 03                	jmp    143bac1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281045>
     143babe:	49 89 c6             	mov    r14,rax
     143bac1:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     143bac8:	00 
     143bac9:	e8 72 80 f1 ff       	call   1353b40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1990c4>
     143bace:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     143bad3:	e8 b2 fc ff ff       	call   143b78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280d0e>
     143bad8:	eb 03                	jmp    143badd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281061>
     143bada:	49 89 c6             	mov    r14,rax
     143badd:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     143bae1:	e8 a0 29 66 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     143bae6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143baed:	00 00 
     143baef:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     143baf6:	00 
     143baf7:	75 08                	jne    143bb01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281085>
     143baf9:	4c 89 f7             	mov    rdi,r14
     143bafc:	e8 cf 41 63 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     143bb01:	e8 aa 3f 3b 00       	call   17efab0 <__stack_chk_fail@plt>

### slot +0x68 body -> 0x143d55e
     143d55e:	48 8d 47 08          	lea    rax,[rdi+0x8]
     143d562:	48 8d 0d 17 40 43 00 	lea    rcx,[rip+0x434017]        # 1871580 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc68>
     143d569:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     143d56c:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
     143d570:	48 89 c6             	mov    rsi,rax
     143d573:	e9 8e b4 71 ff       	jmp    b58a06 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59a6>

### slot +0x70 body -> 0xce39ae
      ce39ae:	48 83 c7 10          	add    rdi,0x10
      ce39b2:	e9 d9 a4 b0 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### slot +0x140 body -> 0x143e280
     143e280:	41 57                	push   r15
     143e282:	41 56                	push   r14
     143e284:	41 55                	push   r13
     143e286:	41 54                	push   r12
     143e288:	53                   	push   rbx
     143e289:	48 83 ec 30          	sub    rsp,0x30
     143e28d:	49 89 ce             	mov    r14,rcx
     143e290:	49 89 d7             	mov    r15,rdx
     143e293:	49 89 f4             	mov    r12,rsi
     143e296:	48 89 fb             	mov    rbx,rdi
     143e299:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e2a0:	00 00 
     143e2a2:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     143e2a7:	49 83 c7 48          	add    r15,0x48
     143e2ab:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     143e2b0:	4c 89 ef             	mov    rdi,r13
     143e2b3:	4c 89 c6             	mov    rsi,r8
     143e2b6:	e8 e7 1a 00 00       	call   143fda2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285326>
     143e2bb:	48 89 df             	mov    rdi,rbx
     143e2be:	4c 89 e6             	mov    rsi,r12
     143e2c1:	4c 89 fa             	mov    rdx,r15
     143e2c4:	4c 89 f1             	mov    rcx,r14
     143e2c7:	4d 89 e8             	mov    r8,r13
     143e2ca:	e8 1b 1b 00 00       	call   143fdea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28536e>
     143e2cf:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     143e2d4:	e8 ef f4 f5 ff       	call   139d7c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e2d4c>
     143e2d9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e2e0:	00 00 
     143e2e2:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     143e2e7:	75 36                	jne    143e31f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2838a3>
     143e2e9:	48 89 d8             	mov    rax,rbx
     143e2ec:	48 83 c4 30          	add    rsp,0x30
     143e2f0:	5b                   	pop    rbx
     143e2f1:	41 5c                	pop    r12
     143e2f3:	41 5d                	pop    r13
     143e2f5:	41 5e                	pop    r14
     143e2f7:	41 5f                	pop    r15
     143e2f9:	c3                   	ret
     143e2fa:	48 89 c3             	mov    rbx,rax
     143e2fd:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     143e302:	e8 c1 f4 f5 ff       	call   139d7c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e2d4c>
     143e307:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e30e:	00 00 
     143e310:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     143e315:	75 08                	jne    143e31f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2838a3>
     143e317:	48 89 df             	mov    rdi,rbx
     143e31a:	e8 b1 19 63 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     143e31f:	e8 8c 17 3b 00       	call   17efab0 <__stack_chk_fail@plt>


## Address point 0x1871558
- header: -0x10=0 -0x8=0
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x143b7ae FDE=(21215150, 21216006)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0x143d498 FDE=(21222552, 21222571)
- +0x30: 0x143d4ac FDE=(21222572, 21222590)
- +0x38: 0x143d4be FDE=(21222590, 21222750)
- +0x40: 0x143d55e FDE=(21222750, 21222776)
- +0x48: 0xce39ae FDE=(13515182, 13515191)
- +0x50: 0xc9701c FDE=(13201436, 13201458)
- +0x58: 0x143d578 FDE=(21222776, 21223611)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0xa50370 FDE=(10814320, 10814325)
- +0x80: 0x143dfec FDE=(21225452, 21225463)
- +0x88: 0x143dfec FDE=(21225452, 21225463)
- +0x90: 0x143dff8 FDE=(21225464, 21225475)
- +0x98: 0x143e004 FDE=(21225476, 21225487)
- +0xa0: 0x143e010 FDE=(21225488, 21225499)
- +0xa8: 0x143e01c FDE=(21225500, 21225511)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0xa0da20 FDE=(10541600, 10541618)
- +0xd0: 0x143e1d8 FDE=(21225944, 21225952)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0x143e1e0 FDE=(21225952, 21226080)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0x143e260 FDE=(21226080, 21226089)
- +0x110: 0x143e26a FDE=(21226090, 21226112)
- +0x118: 0x143e280 FDE=(21226112, 21226276)
- +0x120: 0x143e324 FDE=(21226276, 21226441)
- +0x128: 0x143e3ca FDE=(21226442, 21226606)
- +0x130: 0x143e46e FDE=(21226606, 21226771)
- +0x138: 0x143e514 FDE=(21226772, 21227562)
- +0x140: 0x143e82a FDE=(21227562, 21229178)
- +0x148: 0x143ee7a FDE=(21229178, 21230016)
- +0x150: 0x0 FDE=None
- +0x158: 0x0 FDE=None
- +0x160: 0x143f4f6 FDE=(21230838, 21230853)
- +0x168: 0x143f506 FDE=(21230854, 21230872)
- +0x170: 0xc6754a FDE=(13006154, 13006163)
- +0x178: 0x0 FDE=None
- +0x180: 0xa50370 FDE=(10814320, 10814325)
### slot +0x28 body -> 0x143d498
     143d498:	48 8d 05 e1 40 43 00 	lea    rax,[rip+0x4340e1]        # 1871580 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc68>
     143d49f:	48 89 07             	mov    QWORD PTR [rdi],rax
     143d4a2:	48 83 c7 10          	add    rdi,0x10
     143d4a6:	e9 e5 09 3b 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### slot +0x30 body -> 0x143d4ac
     143d4ac:	53                   	push   rbx
     143d4ad:	48 89 fb             	mov    rbx,rdi
     143d4b0:	e8 e3 ff ff ff       	call   143d498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282a1c>
     143d4b5:	48 89 df             	mov    rdi,rbx
     143d4b8:	5b                   	pop    rbx
     143d4b9:	e9 62 0a 3b 00       	jmp    17edf20 <_ZdlPv@plt>

### slot +0x38 body -> 0x143d4be
     143d4be:	41 56                	push   r14
     143d4c0:	53                   	push   rbx
     143d4c1:	48 83 ec 28          	sub    rsp,0x28
     143d4c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143d4cc:	00 00 
     143d4ce:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     143d4d3:	4c 8d 77 08          	lea    r14,[rdi+0x8]
     143d4d7:	6a 28                	push   0x28
     143d4d9:	5f                   	pop    rdi
     143d4da:	e8 21 0a 3b 00       	call   17edf00 <_Znwm@plt>
     143d4df:	48 89 c3             	mov    rbx,rax
     143d4e2:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     143d4e6:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
     143d4eb:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     143d4f0:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
     143d4f7:	00 00 
     143d4f9:	48 8d 05 80 40 43 00 	lea    rax,[rip+0x434080]        # 1871580 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc68>
     143d500:	48 89 03             	mov    QWORD PTR [rbx],rax
     143d503:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
     143d507:	4c 89 f6             	mov    rsi,r14
     143d50a:	e8 f7 b4 71 ff       	call   b58a06 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59a6>
     143d50f:	48 89 e7             	mov    rdi,rsp
     143d512:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     143d516:	e8 af cd 63 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     143d51b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143d522:	00 00 
     143d524:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     143d529:	75 2e                	jne    143d559 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282add>
     143d52b:	48 89 d8             	mov    rax,rbx
     143d52e:	48 83 c4 28          	add    rsp,0x28
     143d532:	5b                   	pop    rbx
     143d533:	41 5e                	pop    r14
     143d535:	c3                   	ret
     143d536:	48 89 c3             	mov    rbx,rax
     143d539:	48 89 e7             	mov    rdi,rsp
     143d53c:	e8 89 cd 63 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     143d541:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143d548:	00 00 
     143d54a:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     143d54f:	75 08                	jne    143d559 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282add>
     143d551:	48 89 df             	mov    rdi,rbx
     143d554:	e8 77 27 63 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     143d559:	e8 52 25 3b 00       	call   17efab0 <__stack_chk_fail@plt>

### slot +0x40 body -> 0x143d55e
     143d55e:	48 8d 47 08          	lea    rax,[rdi+0x8]
     143d562:	48 8d 0d 17 40 43 00 	lea    rcx,[rip+0x434017]        # 1871580 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc68>
     143d569:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     143d56c:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
     143d570:	48 89 c6             	mov    rsi,rax
     143d573:	e9 8e b4 71 ff       	jmp    b58a06 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59a6>

### slot +0x70 body -> 0x9d7de0
      9d7de0:	c3                   	ret

### slot +0x140 body -> 0x143e82a
     143e82a:	55                   	push   rbp
     143e82b:	41 57                	push   r15
     143e82d:	41 56                	push   r14
     143e82f:	41 55                	push   r13
     143e831:	41 54                	push   r12
     143e833:	53                   	push   rbx
     143e834:	48 81 ec 68 02 00 00 	sub    rsp,0x268
     143e83b:	4d 89 c6             	mov    r14,r8
     143e83e:	49 89 d4             	mov    r12,rdx
     143e841:	49 89 f7             	mov    r15,rsi
     143e844:	48 89 fb             	mov    rbx,rdi
     143e847:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e84e:	00 00 
     143e850:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
     143e857:	00 
     143e858:	48 8b 69 08          	mov    rbp,QWORD PTR [rcx+0x8]
     143e85c:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     143e85f:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
     143e866:	00 
     143e867:	48 85 ed             	test   rbp,rbp
     143e86a:	74 05                	je     143e871 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283df5>
     143e86c:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]
     143e871:	48 8d 0d 00 0d 4e 00 	lea    rcx,[rip+0x4e0d00]        # 191f578 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x66988>
     143e878:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     143e87d:	4c 8d ac 24 a0 01 00 	lea    r13,[rsp+0x1a0]
     143e884:	00 
     143e885:	48 ba 04 00 00 00 01 	movabs rdx,0x100000004
     143e88c:	00 00 00 
     143e88f:	4c 89 ee             	mov    rsi,r13
     143e892:	e8 b9 f0 dd ff       	call   121d950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ed4>
     143e897:	48 89 ef             	mov    rdi,rbp
     143e89a:	e8 13 fc 65 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     143e89f:	48 89 e7             	mov    rdi,rsp
     143e8a2:	e8 dd 09 00 00       	call   143f284 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284808>
     143e8a7:	0f 57 c0             	xorps  xmm0,xmm0
     143e8aa:	48 8d 84 24 b0 00 00 	lea    rax,[rsp+0xb0]
     143e8b1:	00 
     143e8b2:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     143e8b6:	48 8d 0d 13 76 43 00 	lea    rcx,[rip+0x437613]        # 1875ed0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x325b8>
     143e8bd:	48 89 08             	mov    QWORD PTR [rax],rcx
     143e8c0:	48 8d 2d 31 0f 00 ff 	lea    rbp,[rip+0xffffffffff000f31]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     143e8c7:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
     143e8cb:	83 60 38 00          	and    DWORD PTR [rax+0x38],0x0
     143e8cf:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     143e8d3:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     143e8da:	00 
     143e8db:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
     143e8e2:	00 
     143e8e3:	41 8b 7c 24 60       	mov    edi,DWORD PTR [r12+0x60]
     143e8e8:	e8 5b 01 67 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     143e8ed:	49 8d 74 24 48       	lea    rsi,[r12+0x48]
     143e8f2:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     143e8f9:	00 
     143e8fa:	4c 89 2f             	mov    QWORD PTR [rdi],r13
     143e8fd:	41 8b 44 24 60       	mov    eax,DWORD PTR [r12+0x60]
     143e902:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     143e907:	48 39 c8             	cmp    rax,rcx
     143e90a:	6a ff                	push   0xffffffffffffffff
     143e90c:	59                   	pop    rcx
     143e90d:	48 0f 45 c8          	cmovne rcx,rax
     143e911:	48 8d 05 18 2e 43 00 	lea    rax,[rip+0x432e18]        # 1871730 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2de18>
     143e918:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]
     143e91b:	41 80 bc 24 c8 00 00 	cmp    BYTE PTR [r12+0xc8],0x0
     143e922:	00 00 
     143e924:	74 39                	je     143e95f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283ee3>
     143e926:	49 8d bc 24 b0 00 00 	lea    rdi,[r12+0xb0]
     143e92d:	00 
     143e92e:	4c 8d ac 24 a0 01 00 	lea    r13,[rsp+0x1a0]
     143e935:	00 
     143e936:	41 83 65 00 00       	and    DWORD PTR [r13+0x0],0x0
     143e93b:	e8 f6 ce 63 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     143e940:	48 89 c7             	mov    rdi,rax
     143e943:	48 89 d6             	mov    rsi,rdx
     143e946:	4c 89 ea             	mov    rdx,r13
     143e949:	e8 06 65 ab ff       	call   ef4e54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbc26a>
     143e94e:	8b 8c 24 a0 01 00 00 	mov    ecx,DWORD PTR [rsp+0x1a0]
     143e955:	85 c9                	test   ecx,ecx
     143e957:	6a 05                	push   0x5
     143e959:	58                   	pop    rax
     143e95a:	0f 45 c1             	cmovne eax,ecx
     143e95d:	eb 03                	jmp    143e962 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283ee6>
     143e95f:	6a 05                	push   0x5
     143e961:	58                   	pop    rax
     143e962:	89 84 24 d0 00 00 00 	mov    DWORD PTR [rsp+0xd0],eax
     143e969:	8b 8c 24 c0 00 00 00 	mov    ecx,DWORD PTR [rsp+0xc0]
     143e970:	83 c9 02             	or     ecx,0x2
     143e973:	89 8c 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],ecx
     143e97a:	41 80 bc 24 80 00 00 	cmp    BYTE PTR [r12+0x80],0x0
     143e981:	00 00 
     143e983:	74 28                	je     143e9ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f31>
     143e985:	49 8d 7c 24 68       	lea    rdi,[r12+0x68]
     143e98a:	e8 13 3a 06 00       	call   14a23a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e7926>
     143e98f:	48 89 c1             	mov    rcx,rax
     143e992:	48 c1 e9 20          	shr    rcx,0x20
     143e996:	85 c0                	test   eax,eax
     143e998:	6a 01                	push   0x1
     143e99a:	5a                   	pop    rdx
     143e99b:	0f 44 c2             	cmove  eax,edx
     143e99e:	48 85 c9             	test   rcx,rcx
     143e9a1:	0f 44 c2             	cmove  eax,edx
     143e9a4:	8b 8c 24 c0 00 00 00 	mov    ecx,DWORD PTR [rsp+0xc0]
     143e9ab:	eb 03                	jmp    143e9b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f34>
     143e9ad:	6a 01                	push   0x1
     143e9af:	58                   	pop    rax
     143e9b0:	89 84 24 d4 00 00 00 	mov    DWORD PTR [rsp+0xd4],eax
     143e9b7:	83 c9 04             	or     ecx,0x4
     143e9ba:	89 8c 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],ecx
     143e9c1:	41 80 bc 24 a0 00 00 	cmp    BYTE PTR [r12+0xa0],0x0
     143e9c8:	00 00 
     143e9ca:	74 2b                	je     143e9f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f7b>
     143e9cc:	49 8d bc 24 88 00 00 	lea    rdi,[r12+0x88]
     143e9d3:	00 
     143e9d4:	e8 06 3b 06 00       	call   14a24df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e7a63>
     143e9d9:	48 89 c1             	mov    rcx,rax
     143e9dc:	48 c1 e9 20          	shr    rcx,0x20
     143e9e0:	85 c0                	test   eax,eax
     143e9e2:	6a 06                	push   0x6
     143e9e4:	5a                   	pop    rdx
     143e9e5:	0f 44 c2             	cmove  eax,edx
     143e9e8:	48 85 c9             	test   rcx,rcx
     143e9eb:	0f 44 c2             	cmove  eax,edx
     143e9ee:	8b 8c 24 c0 00 00 00 	mov    ecx,DWORD PTR [rsp+0xc0]
     143e9f5:	eb 03                	jmp    143e9fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f7e>
     143e9f7:	6a 06                	push   0x6
     143e9f9:	58                   	pop    rax
     143e9fa:	89 84 24 d8 00 00 00 	mov    DWORD PTR [rsp+0xd8],eax
     143ea01:	41 80 bc 24 ac 00 00 	cmp    BYTE PTR [r12+0xac],0x0
     143ea08:	00 00 
     143ea0a:	b8 44 ac 00 00       	mov    eax,0xac44
     143ea0f:	74 08                	je     143ea19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f9d>
     143ea11:	41 8b 84 24 a8 00 00 	mov    eax,DWORD PTR [r12+0xa8]
     143ea18:	00 
     143ea19:	89 84 24 dc 00 00 00 	mov    DWORD PTR [rsp+0xdc],eax
     143ea20:	83 c9 18             	or     ecx,0x18
     143ea23:	89 8c 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],ecx
     143ea2a:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     143ea31:	00 
     143ea32:	48 83 67 f8 00       	and    QWORD PTR [rdi-0x8],0x0
     143ea37:	48 8d 05 d2 73 43 00 	lea    rax,[rip+0x4373d2]        # 1875e10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x324f8>
     143ea3e:	48 89 47 f0          	mov    QWORD PTR [rdi-0x10],rax
     143ea42:	0f 57 c0             	xorps  xmm0,xmm0
     143ea45:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     143ea48:	0f 11 47 0c          	movups XMMWORD PTR [rdi+0xc],xmm0
     143ea4c:	e8 c1 1c ab ff       	call   ef0712 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb7b28>
     143ea51:	49 89 c5             	mov    r13,rax
     143ea54:	48 89 c7             	mov    rdi,rax
     143ea57:	e8 f4 1c ab ff       	call   ef0750 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb7b66>
     143ea5c:	41 80 bc 24 d4 00 00 	cmp    BYTE PTR [r12+0xd4],0x0
     143ea63:	00 00 
     143ea65:	74 0c                	je     143ea73 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283ff7>
     143ea67:	f3 41 0f 10 84 24 d0 	movss  xmm0,DWORD PTR [r12+0xd0]
     143ea6e:	00 00 00 
     143ea71:	eb 08                	jmp    143ea7b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283fff>
     143ea73:	f3 0f 10 05 49 fe f4 	movss  xmm0,DWORD PTR [rip+0xfffffffffef4fe49]        # 38e8c4 <_ZTSSt12bad_any_cast@@Base-0x1904>
     143ea7a:	fe 
     143ea7b:	f3 0f 11 40 18       	movss  DWORD PTR [rax+0x18],xmm0
     143ea80:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     143ea84:	4c 89 ef             	mov    rdi,r13
     143ea87:	e8 c4 1c ab ff       	call   ef0750 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb7b66>
     143ea8c:	41 80 bc 24 dc 00 00 	cmp    BYTE PTR [r12+0xdc],0x0
     143ea93:	00 00 
     143ea95:	74 0c                	je     143eaa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284027>
     143ea97:	f3 41 0f 10 84 24 d8 	movss  xmm0,DWORD PTR [r12+0xd8]
     143ea9e:	00 00 00 
     143eaa1:	eb 08                	jmp    143eaab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28402f>
     143eaa3:	f3 0f 10 05 39 fe f4 	movss  xmm0,DWORD PTR [rip+0xfffffffffef4fe39]        # 38e8e4 <_ZTSSt12bad_any_cast@@Base-0x18e4>
     143eaaa:	fe 
     143eaab:	f3 0f 11 40 1c       	movss  DWORD PTR [rax+0x1c],xmm0
     143eab0:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
     143eab4:	4c 89 ef             	mov    rdi,r13
     143eab7:	e8 e0 e8 96 ff       	call   dad39c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a422>
     143eabc:	49 89 c4             	mov    r12,rax
     143eabf:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     143eac3:	48 8d 78 18          	lea    rdi,[rax+0x18]
     143eac7:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
     143eacb:	f6 c2 01             	test   dl,0x1
     143eace:	0f 85 c2 02 00 00    	jne    143ed96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28431a>
     143ead4:	48 8d 35 c7 02 f3 fe 	lea    rsi,[rip+0xfffffffffef302c7]        # 36eda2 <_ZTSSt12bad_any_cast@@Base-0x21426>
     143eadb:	e8 72 72 6c ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
     143eae0:	41 83 7c 24 38 03    	cmp    DWORD PTR [r12+0x38],0x3
     143eae6:	74 16                	je     143eafe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284082>
     143eae8:	4c 89 e7             	mov    rdi,r12
     143eaeb:	e8 6c ed 05 00       	call   149d85c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e2de0>
     143eaf0:	41 c7 44 24 38 03 00 	mov    DWORD PTR [r12+0x38],0x3
     143eaf7:	00 00 
     143eaf9:	49 89 6c 24 30       	mov    QWORD PTR [r12+0x30],rbp
     143eafe:	49 8d 7c 24 30       	lea    rdi,[r12+0x30]
     143eb03:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
     143eb08:	f6 c2 01             	test   dl,0x1
     143eb0b:	0f 85 91 02 00 00    	jne    143eda2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284326>
     143eb11:	48 8d 35 e6 5e f3 fe 	lea    rsi,[rip+0xfffffffffef35ee6]        # 3749fe <_ZTSSt12bad_any_cast@@Base-0x1b7ca>
     143eb18:	e8 35 72 6c ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
     143eb1d:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     143eb24:	00 
     143eb25:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     143eb2c:	00 
     143eb2d:	e8 92 11 34 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
     143eb32:	41 80 4c 24 10 02    	or     BYTE PTR [r12+0x10],0x2
     143eb38:	4c 89 e7             	mov    rdi,r12
     143eb3b:	48 83 c7 20          	add    rdi,0x20
     143eb3f:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
     143eb44:	f6 c2 01             	test   dl,0x1
     143eb47:	0f 85 61 02 00 00    	jne    143edae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284332>
     143eb4d:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
     143eb54:	00 
     143eb55:	e8 8c 6c 32 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     143eb5a:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     143eb61:	00 
     143eb62:	e8 29 f3 3a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     143eb67:	41 c6 44 24 28 01    	mov    BYTE PTR [r12+0x28],0x1
     143eb6d:	41 80 4c 24 10 04    	or     BYTE PTR [r12+0x10],0x4
     143eb73:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     143eb7a:	00 
     143eb7b:	48 8d b4 24 70 01 00 	lea    rsi,[rsp+0x170]
     143eb82:	00 
     143eb83:	e8 3c 11 34 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
     143eb88:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     143eb8f:	00 
     143eb90:	e8 a1 cc 63 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     143eb95:	0f 57 c0             	xorps  xmm0,xmm0
     143eb98:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     143eb9d:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     143eba0:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     143eba5:	48 89 c6             	mov    rsi,rax
     143eba8:	31 c9                	xor    ecx,ecx
     143ebaa:	e8 6c c9 39 00       	call   17db51b <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x733c>
     143ebaf:	4c 8d a4 24 a0 01 00 	lea    r12,[rsp+0x1a0]
     143ebb6:	00 
     143ebb7:	4c 89 e7             	mov    rdi,r12
     143ebba:	e8 d1 f2 3a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     143ebbf:	49 83 64 24 08 00    	and    QWORD PTR [r12+0x8],0x0
     143ebc5:	48 8d 05 9c 93 45 00 	lea    rax,[rip+0x45939c]        # 1897f68 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4ea8>
     143ebcc:	49 89 04 24          	mov    QWORD PTR [r12],rax
     143ebd0:	0f 57 c0             	xorps  xmm0,xmm0
     143ebd3:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
     143ebd9:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
     143ebdf:	49 89 6c 24 30       	mov    QWORD PTR [r12+0x30],rbp
     143ebe4:	41 0f 11 44 24 38    	movups XMMWORD PTR [r12+0x38],xmm0
     143ebea:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     143ebef:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     143ebf4:	48 8d 94 24 a0 01 00 	lea    rdx,[rsp+0x1a0]


## Address point 0x18713e8
- header: -0x10=0 -0x8=0
- +0x0: 0xaaa9b2 FDE=(11184562, 11184571)
- +0x8: 0xaaa9bc FDE=(11184572, 11184594)
- +0x10: 0x174ec6a FDE=(24439914, 24439919)
- +0x18: 0x174f1dc FDE=(24441308, 24442309)
- +0x20: 0x14390e0 FDE=(21205216, 21205241)
- +0x28: 0x174ef82 FDE=(24440706, 24441307)
- +0x30: 0x191f510 FDE=None
- +0x38: 0x191f3b8 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x13538be FDE=(20265150, 20265203)
- +0x58: 0x143995a FDE=(21207386, 21207404)
- +0x60: 0x143996c FDE=(21207404, 21208785)
- +0x68: 0xb43750 FDE=(11810640, 11810648)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
- +0x80: 0xb43750 FDE=(11810640, 11810648)
- +0x88: 0x9d7de0 FDE=(10321376, 10321377)
- +0x90: 0xc5915a FDE=(12947802, 12947813)
- +0x98: 0x11d02ac FDE=(18678444, 18678457)
- +0xa0: 0x11d02ac FDE=(18678444, 18678457)
- +0xa8: 0xc5915a FDE=(12947802, 12947813)
- +0xb0: 0xada1e4 FDE=(11379172, 11379179)
- +0xb8: 0xc5904a FDE=(12947530, 12947556)
- +0xc0: 0x11d02ac FDE=(18678444, 18678457)
- +0xc8: 0x11d02ac FDE=(18678444, 18678457)
- +0xd0: 0xc5904a FDE=(12947530, 12947556)
- +0xd8: 0xada1e4 FDE=(11379172, 11379179)
- +0xe0: 0x143a040 FDE=(21209152, 21209163)
- +0xe8: 0x143a04c FDE=(21209164, 21209175)
- +0xf0: 0xf5c842 FDE=(16107586, 16107591)
- +0xf8: 0x14398ba FDE=(21207226, 21207329)
- +0x100: 0x1439922 FDE=(21207330, 21207385)
- +0x108: 0xf5c842 FDE=(16107586, 16107591)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0xaf38c0 FDE=(11483328, 11483337)
- +0x128: 0xaf38ca FDE=(11483338, 11483360)
- +0x130: 0x143a3be FDE=(21210046, 21210472)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0xad7ee6 FDE=(11370214, 11370223)
- +0x150: 0xec8b4a FDE=(15502154, 15502176)
- +0x158: 0x143b2fe FDE=(21213950, 21214576)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0x9d7de0 FDE=(10321376, 10321377)
- +0x178: 0xa50370 FDE=(10814320, 10814325)
- +0x180: 0x143b7ae FDE=(21215150, 21216006)
### slot +0x28 body -> 0x174ef82
     174ef82:	55                   	push   rbp
     174ef83:	41 57                	push   r15
     174ef85:	41 56                	push   r14
     174ef87:	41 55                	push   r13
     174ef89:	41 54                	push   r12
     174ef8b:	53                   	push   rbx
     174ef8c:	48 83 ec 48          	sub    rsp,0x48
     174ef90:	48 89 d3             	mov    rbx,rdx
     174ef93:	49 89 f6             	mov    r14,rsi
     174ef96:	49 89 ff             	mov    r15,rdi
     174ef99:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     174efa0:	00 00 
     174efa2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     174efa7:	e8 2e fc ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
     174efac:	49 89 c4             	mov    r12,rax
     174efaf:	4c 89 ff             	mov    rdi,r15
     174efb2:	e8 23 fc ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
     174efb7:	0f 57 c0             	xorps  xmm0,xmm0
     174efba:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
     174efc0:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     174efc5:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
     174efca:	80 78 53 00          	cmp    BYTE PTR [rax+0x53],0x0
     174efce:	74 3c                	je     174f00c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103178>
     174efd0:	41 83 7c 24 08 00    	cmp    DWORD PTR [r12+0x8],0x0
     174efd6:	7e 47                	jle    174f01f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10318b>
     174efd8:	45 31 ed             	xor    r13d,r13d
     174efdb:	31 ed                	xor    ebp,ebp
     174efdd:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
     174efe2:	4c 01 e8             	add    rax,r13
     174efe5:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     174efea:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     174efef:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     174eff4:	e8 b1 07 35 ff       	call   a9f7aa <JNI_OnUnload@@Base+0x27077>
     174eff9:	48 ff c5             	inc    rbp
     174effc:	49 63 44 24 08       	movsxd rax,DWORD PTR [r12+0x8]
     174f001:	49 83 c5 58          	add    r13,0x58
     174f005:	48 39 c5             	cmp    rbp,rax
     174f008:	7c d3                	jl     174efdd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103149>
     174f00a:	eb 13                	jmp    174f01f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10318b>
     174f00c:	48 8d 44 24 20       	lea    rax,[rsp+0x20]
     174f011:	48 89 d7             	mov    rdi,rdx
     174f014:	4c 89 fe             	mov    rsi,r15
     174f017:	48 89 c2             	mov    rdx,rax
     174f01a:	e8 f7 ef fe ff       	call   173e016 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2182>
     174f01f:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
     174f024:	48 8b 6c 24 28       	mov    rbp,QWORD PTR [rsp+0x28]
     174f029:	49 39 ed             	cmp    r13,rbp
     174f02c:	74 1b                	je     174f049 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1031b5>
     174f02e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     174f032:	4c 89 fe             	mov    rsi,r15
     174f035:	4c 89 f2             	mov    rdx,r14
     174f038:	48 89 d9             	mov    rcx,rbx
     174f03b:	e8 80 11 01 00       	call   17601c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11432c>
     174f040:	49 89 c6             	mov    r14,rax
     174f043:	49 83 c5 08          	add    r13,0x8
     174f047:	eb e0                	jmp    174f029 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103195>
     174f049:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
     174f04e:	80 78 50 00          	cmp    BYTE PTR [rax+0x50],0x0
     174f052:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     174f056:	0f 84 f1 00 00 00    	je     174f14d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1032b9>
     174f05c:	40 f6 c7 01          	test   dil,0x1
     174f060:	0f 85 2e 01 00 00    	jne    174f194 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103300>
     174f066:	48 8d 3d 03 05 cf fe 	lea    rdi,[rip+0xfffffffffecf0503]        # 43f570 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x517c>
     174f06d:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     174f071:	89 c6                	mov    esi,eax
     174f073:	83 e6 03             	and    esi,0x3
     174f076:	a8 04                	test   al,0x4
     174f078:	0f 94 c2             	sete   dl
     174f07b:	8b 4f 10             	mov    ecx,DWORD PTR [rdi+0x10]
     174f07e:	0f 45 f1             	cmovne esi,ecx
     174f081:	85 f6                	test   esi,esi
     174f083:	0f 8e df 00 00 00    	jle    174f168 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1032d4>
     174f089:	4c 8d 47 10          	lea    r8,[rdi+0x10]
     174f08d:	6a 08                	push   0x8
     174f08f:	5d                   	pop    rbp
     174f090:	45 31 ff             	xor    r15d,r15d
     174f093:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     174f098:	4c 89 44 24 08       	mov    QWORD PTR [rsp+0x8],r8
     174f09d:	49 89 c4             	mov    r12,rax
     174f0a0:	49 83 e4 f8          	and    r12,0xfffffffffffffff8
     174f0a4:	f6 c2 01             	test   dl,0x1
     174f0a7:	4d 0f 45 e0          	cmovne r12,r8
     174f0ab:	41 83 7c 2c fc 03    	cmp    DWORD PTR [r12+rbp*1-0x4],0x3
     174f0b1:	75 78                	jne    174f12b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103297>
     174f0b3:	48 89 df             	mov    rdi,rbx
     174f0b6:	4c 89 f6             	mov    rsi,r14
     174f0b9:	e8 f6 0e 3c ff       	call   b0ffb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cf54>
     174f0be:	66 c7 00 0b 10       	mov    WORD PTR [rax],0x100b
     174f0c3:	48 83 c0 02          	add    rax,0x2
     174f0c7:	41 8b 7c 2c f8       	mov    edi,DWORD PTR [r12+rbp*1-0x8]
     174f0cc:	48 89 c6             	mov    rsi,rax
     174f0cf:	e8 72 13 3c ff       	call   b10446 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5d3e6>
     174f0d4:	c6 00 1a             	mov    BYTE PTR [rax],0x1a
     174f0d7:	4c 8d 70 01          	lea    r14,[rax+0x1]
     174f0db:	49 8b 3c 2c          	mov    rdi,QWORD PTR [r12+rbp*1]
     174f0df:	e8 52 c7 32 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     174f0e4:	49 89 c4             	mov    r12,rax
     174f0e7:	49 89 d5             	mov    r13,rdx
     174f0ea:	44 89 ef             	mov    edi,r13d
     174f0ed:	4c 89 f6             	mov    rsi,r14
     174f0f0:	e8 51 13 3c ff       	call   b10446 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5d3e6>
     174f0f5:	48 89 df             	mov    rdi,rbx
     174f0f8:	4c 89 e6             	mov    rsi,r12
     174f0fb:	44 89 ea             	mov    edx,r13d
     174f0fe:	48 89 c1             	mov    rcx,rax
     174f101:	e8 00 0a 36 ff       	call   aafb06 <JNI_OnUnload@@Base+0x373d3>
     174f106:	48 89 df             	mov    rdi,rbx
     174f109:	48 89 c6             	mov    rsi,rax
     174f10c:	e8 a3 0e 3c ff       	call   b0ffb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cf54>
     174f111:	49 89 c6             	mov    r14,rax
     174f114:	49 ff c6             	inc    r14
     174f117:	c6 00 0c             	mov    BYTE PTR [rax],0xc
     174f11a:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     174f11f:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     174f123:	8b 4f 10             	mov    ecx,DWORD PTR [rdi+0x10]
     174f126:	4c 8b 44 24 08       	mov    r8,QWORD PTR [rsp+0x8]
     174f12b:	49 ff c7             	inc    r15
     174f12e:	89 c6                	mov    esi,eax
     174f130:	83 e6 03             	and    esi,0x3
     174f133:	a8 04                	test   al,0x4
     174f135:	0f 45 f1             	cmovne esi,ecx
     174f138:	0f 94 c2             	sete   dl
     174f13b:	48 63 f6             	movsxd rsi,esi
     174f13e:	48 83 c5 10          	add    rbp,0x10
     174f142:	49 39 f7             	cmp    r15,rsi
     174f145:	0f 8c 52 ff ff ff    	jl     174f09d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103209>
     174f14b:	eb 1b                	jmp    174f168 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1032d4>
     174f14d:	40 f6 c7 01          	test   dil,0x1
     174f151:	75 4e                	jne    174f1a1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10330d>
     174f153:	48 8d 3d 16 04 cf fe 	lea    rdi,[rip+0xfffffffffecf0416]        # 43f570 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x517c>
     174f15a:	4c 89 f6             	mov    rsi,r14
     174f15d:	48 89 da             	mov    rdx,rbx
     174f160:	e8 cb f4 00 00       	call   175e630 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11279c>
     174f165:	49 89 c6             	mov    r14,rax
     174f168:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     174f16d:	e8 b6 c5 32 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     174f172:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     174f179:	00 00 
     174f17b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     174f180:	75 54                	jne    174f1d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103342>
     174f182:	4c 89 f0             	mov    rax,r14
     174f185:	48 83 c4 48          	add    rsp,0x48
     174f189:	5b                   	pop    rbx
     174f18a:	41 5c                	pop    r12
     174f18c:	41 5d                	pop    r13
     174f18e:	41 5e                	pop    r14
     174f190:	41 5f                	pop    r15
     174f192:	5d                   	pop    rbp
     174f193:	c3                   	ret
     174f194:	48 83 e7 fe          	and    rdi,0xfffffffffffffffe
     174f198:	48 83 c7 08          	add    rdi,0x8
     174f19c:	e9 cc fe ff ff       	jmp    174f06d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1031d9>
     174f1a1:	48 83 e7 fe          	and    rdi,0xfffffffffffffffe
     174f1a5:	48 83 c7 08          	add    rdi,0x8
     174f1a9:	eb af                	jmp    174f15a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1032c6>
     174f1ab:	eb 04                	jmp    174f1b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10331d>
     174f1ad:	eb 02                	jmp    174f1b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10331d>
     174f1af:	eb 00                	jmp    174f1b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10331d>
     174f1b1:	48 89 c3             	mov    rbx,rax
     174f1b4:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     174f1b9:	e8 6a c5 32 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     174f1be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     174f1c5:	00 00 
     174f1c7:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     174f1cc:	75 08                	jne    174f1d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103342>
     174f1ce:	48 89 df             	mov    rdi,rbx
     174f1d1:	e8 fa 0a 32 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     174f1d6:	e8 d5 08 0a 00       	call   17efab0 <__stack_chk_fail@plt>

### slot +0x68 body -> 0xb43750
      b43750:	48 89 f7             	mov    rdi,rsi
      b43753:	e9 38 a7 ca 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### slot +0x70 body -> 0x9d7de0
      9d7de0:	c3                   	ret


## Address point 0x1871660
- header: -0x10=0 -0x8=0
- +0x0: 0x143e260 FDE=(21226080, 21226089)
- +0x8: 0x143e26a FDE=(21226090, 21226112)
- +0x10: 0x143e280 FDE=(21226112, 21226276)
- +0x18: 0x143e324 FDE=(21226276, 21226441)
- +0x20: 0x143e3ca FDE=(21226442, 21226606)
- +0x28: 0x143e46e FDE=(21226606, 21226771)
- +0x30: 0x143e514 FDE=(21226772, 21227562)
- +0x38: 0x143e82a FDE=(21227562, 21229178)
- +0x40: 0x143ee7a FDE=(21229178, 21230016)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x143f4f6 FDE=(21230838, 21230853)
- +0x60: 0x143f506 FDE=(21230854, 21230872)
- +0x68: 0xc6754a FDE=(13006154, 13006163)
- +0x70: 0x0 FDE=None
- +0x78: 0xa50370 FDE=(10814320, 10814325)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0x9d7de0 FDE=(10321376, 10321377)
- +0x98: 0xa50370 FDE=(10814320, 10814325)
- +0xa0: 0x1441a7a FDE=(21240442, 21240453)
- +0xa8: 0x1441a86 FDE=(21240454, 21240465)
- +0xb0: 0x1441a92 FDE=(21240466, 21240513)
- +0xb8: 0x1441ac2 FDE=(21240514, 21240561)
- +0xc0: 0x1441af2 FDE=(21240562, 21240609)
- +0xc8: 0x1441b22 FDE=(21240610, 21240654)
- +0xd0: 0x1441b4e FDE=(21240654, 21240741)
- +0xd8: 0x1441ba6 FDE=(21240742, 21240830)
- +0xe0: 0x0 FDE=None
- +0xe8: 0x0 FDE=None
- +0xf0: 0x0 FDE=None
- +0xf8: 0xa0da20 FDE=(10541600, 10541618)
- +0x100: 0x1441bfe FDE=(21240830, 21240838)
- +0x108: 0x0 FDE=None
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0x1441c06 FDE=(21240838, 21240977)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0x9d7de0 FDE=(10321376, 10321377)
- +0x140: 0xa50370 FDE=(10814320, 10814325)
- +0x148: 0x1441fda FDE=(21241818, 21241821)
- +0x150: 0x1441fde FDE=(21241822, 21241833)
- +0x158: 0x1441fea FDE=(21241834, 21241845)
- +0x160: 0x1441ff6 FDE=(21241846, 21243183)
- +0x168: 0x0 FDE=None
- +0x170: 0x0 FDE=None
- +0x178: 0x1442590 FDE=(21243280, 21243334)
- +0x180: 0x14425c6 FDE=(21243334, 21243352)
### slot +0x28 body -> 0x143e46e
     143e46e:	41 57                	push   r15
     143e470:	41 56                	push   r14
     143e472:	41 55                	push   r13
     143e474:	41 54                	push   r12
     143e476:	53                   	push   rbx
     143e477:	48 83 ec 30          	sub    rsp,0x30
     143e47b:	49 89 ce             	mov    r14,rcx
     143e47e:	49 89 d7             	mov    r15,rdx
     143e481:	49 89 f4             	mov    r12,rsi
     143e484:	48 89 fb             	mov    rbx,rdi
     143e487:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e48e:	00 00 
     143e490:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     143e495:	49 83 c7 48          	add    r15,0x48
     143e499:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     143e49e:	4c 89 ef             	mov    rdi,r13
     143e4a1:	4c 89 c6             	mov    rsi,r8
     143e4a4:	e8 7d 13 00 00       	call   143f826 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284daa>
     143e4a9:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     143e4ad:	48 89 df             	mov    rdi,rbx
     143e4b0:	4c 89 e6             	mov    rsi,r12
     143e4b3:	4c 89 fa             	mov    rdx,r15
     143e4b6:	4c 89 e9             	mov    rcx,r13
     143e4b9:	e8 b0 13 00 00       	call   143f86e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284df2>
     143e4be:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     143e4c3:	e8 a4 05 f6 ff       	call   139ea6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3ff0>
     143e4c8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e4cf:	00 00 
     143e4d1:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     143e4d6:	75 36                	jne    143e50e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283a92>
     143e4d8:	48 89 d8             	mov    rax,rbx
     143e4db:	48 83 c4 30          	add    rsp,0x30
     143e4df:	5b                   	pop    rbx
     143e4e0:	41 5c                	pop    r12
     143e4e2:	41 5d                	pop    r13
     143e4e4:	41 5e                	pop    r14
     143e4e6:	41 5f                	pop    r15
     143e4e8:	c3                   	ret
     143e4e9:	48 89 c3             	mov    rbx,rax
     143e4ec:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     143e4f1:	e8 76 05 f6 ff       	call   139ea6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e3ff0>
     143e4f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e4fd:	00 00 
     143e4ff:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     143e504:	75 08                	jne    143e50e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283a92>
     143e506:	48 89 df             	mov    rdi,rbx
     143e509:	e8 c2 17 63 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     143e50e:	e8 9d 15 3b 00       	call   17efab0 <__stack_chk_fail@plt>

### slot +0x30 body -> 0x143e514
     143e514:	55                   	push   rbp
     143e515:	41 57                	push   r15
     143e517:	41 56                	push   r14
     143e519:	41 55                	push   r13
     143e51b:	41 54                	push   r12
     143e51d:	53                   	push   rbx
     143e51e:	48 81 ec 68 02 00 00 	sub    rsp,0x268
     143e525:	4d 89 c6             	mov    r14,r8
     143e528:	49 89 d4             	mov    r12,rdx
     143e52b:	49 89 f7             	mov    r15,rsi
     143e52e:	48 89 fb             	mov    rbx,rdi
     143e531:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e538:	00 00 
     143e53a:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
     143e541:	00 
     143e542:	4c 8b 69 08          	mov    r13,QWORD PTR [rcx+0x8]
     143e546:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     143e549:	0f 29 84 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm0
     143e550:	00 
     143e551:	4d 85 ed             	test   r13,r13
     143e554:	74 05                	je     143e55b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283adf>
     143e556:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
     143e55b:	48 8d 0d 16 10 4e 00 	lea    rcx,[rip+0x4e1016]        # 191f578 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x66988>
     143e562:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     143e567:	48 8d b4 24 80 01 00 	lea    rsi,[rsp+0x180]
     143e56e:	00 
     143e56f:	48 ba 05 00 00 00 01 	movabs rdx,0x100000005
     143e576:	00 00 00 
     143e579:	e8 d2 f3 dd ff       	call   121d950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ed4>
     143e57e:	4c 89 ef             	mov    rdi,r13
     143e581:	e8 2c ff 65 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     143e586:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     143e58b:	e8 f4 0c 00 00       	call   143f284 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284808>
     143e590:	0f 57 c0             	xorps  xmm0,xmm0
     143e593:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     143e59a:	00 
     143e59b:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     143e59f:	48 8d 05 22 9a 45 00 	lea    rax,[rip+0x459a22]        # 1897fc8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4f08>
     143e5a6:	48 89 07             	mov    QWORD PTR [rdi],rax
     143e5a9:	48 8d 05 48 12 00 ff 	lea    rax,[rip+0xffffffffff001248]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     143e5b0:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     143e5b4:	48 83 67 20 00       	and    QWORD PTR [rdi+0x20],0x0
     143e5b9:	e8 5a 0f 00 00       	call   143f518 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284a9c>
     143e5be:	49 89 c5             	mov    r13,rax
     143e5c1:	80 48 10 04          	or     BYTE PTR [rax+0x10],0x4
     143e5c5:	48 8b 78 28          	mov    rdi,QWORD PTR [rax+0x28]
     143e5c9:	48 85 ff             	test   rdi,rdi
     143e5cc:	75 1a                	jne    143e5e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283b6c>
     143e5ce:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     143e5d2:	40 f6 c7 01          	test   dil,0x1
     143e5d6:	0f 85 d4 01 00 00    	jne    143e7b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283d34>
     143e5dc:	e8 67 0f 00 00       	call   143f548 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284acc>
     143e5e1:	48 89 c7             	mov    rdi,rax
     143e5e4:	49 89 45 28          	mov    QWORD PTR [r13+0x28],rax
     143e5e8:	48 83 c7 18          	add    rdi,0x18
     143e5ec:	48 8d 15 98 0f 00 00 	lea    rdx,[rip+0xf98]        # 143f58b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284b0f>
     143e5f3:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
     143e5fa:	00 
     143e5fb:	e8 d6 a8 69 ff       	call   ad8ed6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e76>
     143e600:	48 89 c1             	mov    rcx,rax
     143e603:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     143e607:	49 83 c4 48          	add    r12,0x48
     143e60b:	48 83 c0 18          	add    rax,0x18
     143e60f:	48 8b 51 08          	mov    rdx,QWORD PTR [rcx+0x8]
     143e613:	f6 c2 01             	test   dl,0x1
     143e616:	0f 85 88 01 00 00    	jne    143e7a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283d28>
     143e61c:	48 89 c7             	mov    rdi,rax
     143e61f:	4c 89 e6             	mov    rsi,r12
     143e622:	e8 6b 71 32 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     143e627:	4c 8d 64 24 58       	lea    r12,[rsp+0x58]
     143e62c:	4c 8d ac 24 80 01 00 	lea    r13,[rsp+0x180]
     143e633:	00 
     143e634:	4c 89 e7             	mov    rdi,r12
     143e637:	4c 89 ee             	mov    rsi,r13
     143e63a:	e8 85 d0 81 ff       	call   c5b6c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a8664>
     143e63f:	4c 89 ef             	mov    rdi,r13
     143e642:	e8 4d 68 22 00       	call   1664e94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19000>
     143e647:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
     143e64b:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
     143e650:	0f 28 4c 24 40       	movaps xmm1,XMMWORD PTR [rsp+0x40]
     143e655:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     143e65c:	00 
     143e65d:	0f 29 47 e0          	movaps XMMWORD PTR [rdi-0x20],xmm0
     143e661:	0f 57 c0             	xorps  xmm0,xmm0
     143e664:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     143e669:	0f 29 4f f0          	movaps XMMWORD PTR [rdi-0x10],xmm1
     143e66d:	4c 89 f6             	mov    rsi,r14
     143e670:	e8 27 0f 00 00       	call   143f59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284b20>
     143e675:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
     143e67c:	00 
     143e67d:	4c 89 f7             	mov    rdi,r14
     143e680:	4c 89 e6             	mov    rsi,r12
     143e683:	e8 aa 5f 80 ff       	call   c44632 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1915d2>
     143e688:	48 8b 6c 24 20       	mov    rbp,QWORD PTR [rsp+0x20]
     143e68d:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     143e691:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
     143e695:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
     143e69a:	48 85 c0             	test   rax,rax
     143e69d:	74 05                	je     143e6a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c28>
     143e69f:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     143e6a4:	48 8d 05 6d 35 01 ff 	lea    rax,[rip+0xffffffffff01356d]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     143e6ab:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     143e6b0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     143e6b5:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
     143e6bb:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     143e6c2:	00 
     143e6c3:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
     143e6ca:	00 
     143e6cb:	e8 14 0f 00 00       	call   143f5e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284b68>
     143e6d0:	48 83 a4 24 40 02 00 	and    QWORD PTR [rsp+0x240],0x0
     143e6d7:	00 00 
     143e6d9:	48 83 a4 24 50 02 00 	and    QWORD PTR [rsp+0x250],0x0
     143e6e0:	00 00 
     143e6e2:	bf b8 00 00 00       	mov    edi,0xb8
     143e6e7:	e8 14 f8 3a 00       	call   17edf00 <_Znwm@plt>
     143e6ec:	49 89 c6             	mov    r14,rax
     143e6ef:	4c 8d a4 24 80 01 00 	lea    r12,[rsp+0x180]
     143e6f6:	00 
     143e6f7:	48 89 c7             	mov    rdi,rax
     143e6fa:	4c 89 e6             	mov    rsi,r12
     143e6fd:	e8 e2 0e 00 00       	call   143f5e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284b68>
     143e702:	4c 8d ac 24 40 02 00 	lea    r13,[rsp+0x240]
     143e709:	00 
     143e70a:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14
     143e70e:	48 8d 05 3d 0f 00 00 	lea    rax,[rip+0xf3d]        # 143f652 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284bd6>
     143e715:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
     143e719:	48 8d 05 5c 0f 00 00 	lea    rax,[rip+0xf5c]        # 143f67c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284c00>
     143e720:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     143e724:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     143e729:	4c 89 ff             	mov    rdi,r15
     143e72c:	4c 89 ea             	mov    rdx,r13
     143e72f:	e8 54 2d 38 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
     143e734:	4c 89 ef             	mov    rdi,r13
     143e737:	e8 62 8b 66 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     143e73c:	4c 89 e7             	mov    rdi,r12
     143e73f:	e8 40 0f 00 00       	call   143f684 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284c08>
     143e744:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     143e74b:	00 
     143e74c:	e8 39 0f 00 00       	call   143f68a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284c0e>
     143e751:	48 89 2b             	mov    QWORD PTR [rbx],rbp
     143e754:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     143e759:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     143e75d:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     143e762:	e8 6b 5f 80 ff       	call   c446d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x191672>
     143e767:	31 ff                	xor    edi,edi
     143e769:	e8 18 fd 65 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     143e76e:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     143e773:	e8 ae f4 dd ff       	call   121dc26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631aa>
     143e778:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e77f:	00 00 
     143e781:	48 3b 84 24 60 02 00 	cmp    rax,QWORD PTR [rsp+0x260]
     143e788:	00 
     143e789:	0f 85 96 00 00 00    	jne    143e825 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283da9>
     143e78f:	48 89 d8             	mov    rax,rbx
     143e792:	48 81 c4 68 02 00 00 	add    rsp,0x268
     143e799:	5b                   	pop    rbx
     143e79a:	41 5c                	pop    r12
     143e79c:	41 5d                	pop    r13
     143e79e:	41 5e                	pop    r14
     143e7a0:	41 5f                	pop    r15
     143e7a2:	5d                   	pop    rbp
     143e7a3:	c3                   	ret
     143e7a4:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     143e7a8:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     143e7ab:	e9 6c fe ff ff       	jmp    143e61c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283ba0>
     143e7b0:	48 83 e7 fe          	and    rdi,0xfffffffffffffffe
     143e7b4:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     143e7b7:	e9 20 fe ff ff       	jmp    143e5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283b60>
     143e7bc:	48 89 c3             	mov    rbx,rax
     143e7bf:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     143e7c6:	00 
     143e7c7:	e8 d2 8a 66 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     143e7cc:	48 89 df             	mov    rdi,rbx
     143e7cf:	e8 d1 b2 63 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     143e7d4:	48 89 c3             	mov    rbx,rax
     143e7d7:	eb 27                	jmp    143e800 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283d84>
     143e7d9:	48 89 c3             	mov    rbx,rax
     143e7dc:	4c 89 ef             	mov    rdi,r13
     143e7df:	e8 ce fc 65 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     143e7e4:	eb 24                	jmp    143e80a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283d8e>
     143e7e6:	48 89 c3             	mov    rbx,rax
     143e7e9:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     143e7f0:	00 
     143e7f1:	e8 9e 66 22 00       	call   1664e94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19000>
     143e7f6:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     143e7fb:	e8 86 fc 65 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     143e800:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     143e805:	e8 1c f4 dd ff       	call   121dc26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631aa>
     143e80a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e811:	00 00 
     143e813:	48 3b 84 24 60 02 00 	cmp    rax,QWORD PTR [rsp+0x260]
     143e81a:	00 
     143e81b:	75 08                	jne    143e825 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283da9>
     143e81d:	48 89 df             	mov    rdi,rbx
     143e820:	e8 ab 14 63 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     143e825:	e8 86 12 3b 00       	call   17efab0 <__stack_chk_fail@plt>

### slot +0x38 body -> 0x143e82a
     143e82a:	55                   	push   rbp
     143e82b:	41 57                	push   r15
     143e82d:	41 56                	push   r14
     143e82f:	41 55                	push   r13
     143e831:	41 54                	push   r12
     143e833:	53                   	push   rbx
     143e834:	48 81 ec 68 02 00 00 	sub    rsp,0x268
     143e83b:	4d 89 c6             	mov    r14,r8
     143e83e:	49 89 d4             	mov    r12,rdx
     143e841:	49 89 f7             	mov    r15,rsi
     143e844:	48 89 fb             	mov    rbx,rdi
     143e847:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143e84e:	00 00 
     143e850:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
     143e857:	00 
     143e858:	48 8b 69 08          	mov    rbp,QWORD PTR [rcx+0x8]
     143e85c:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     143e85f:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
     143e866:	00 
     143e867:	48 85 ed             	test   rbp,rbp
     143e86a:	74 05                	je     143e871 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283df5>
     143e86c:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]
     143e871:	48 8d 0d 00 0d 4e 00 	lea    rcx,[rip+0x4e0d00]        # 191f578 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x66988>
     143e878:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     143e87d:	4c 8d ac 24 a0 01 00 	lea    r13,[rsp+0x1a0]
     143e884:	00 
     143e885:	48 ba 04 00 00 00 01 	movabs rdx,0x100000004
     143e88c:	00 00 00 
     143e88f:	4c 89 ee             	mov    rsi,r13
     143e892:	e8 b9 f0 dd ff       	call   121d950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ed4>
     143e897:	48 89 ef             	mov    rdi,rbp
     143e89a:	e8 13 fc 65 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     143e89f:	48 89 e7             	mov    rdi,rsp
     143e8a2:	e8 dd 09 00 00       	call   143f284 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284808>
     143e8a7:	0f 57 c0             	xorps  xmm0,xmm0
     143e8aa:	48 8d 84 24 b0 00 00 	lea    rax,[rsp+0xb0]
     143e8b1:	00 
     143e8b2:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     143e8b6:	48 8d 0d 13 76 43 00 	lea    rcx,[rip+0x437613]        # 1875ed0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x325b8>
     143e8bd:	48 89 08             	mov    QWORD PTR [rax],rcx
     143e8c0:	48 8d 2d 31 0f 00 ff 	lea    rbp,[rip+0xffffffffff000f31]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     143e8c7:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
     143e8cb:	83 60 38 00          	and    DWORD PTR [rax+0x38],0x0
     143e8cf:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     143e8d3:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     143e8da:	00 
     143e8db:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
     143e8e2:	00 
     143e8e3:	41 8b 7c 24 60       	mov    edi,DWORD PTR [r12+0x60]
     143e8e8:	e8 5b 01 67 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     143e8ed:	49 8d 74 24 48       	lea    rsi,[r12+0x48]
     143e8f2:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     143e8f9:	00 
     143e8fa:	4c 89 2f             	mov    QWORD PTR [rdi],r13
     143e8fd:	41 8b 44 24 60       	mov    eax,DWORD PTR [r12+0x60]
     143e902:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     143e907:	48 39 c8             	cmp    rax,rcx
     143e90a:	6a ff                	push   0xffffffffffffffff
     143e90c:	59                   	pop    rcx
     143e90d:	48 0f 45 c8          	cmovne rcx,rax
     143e911:	48 8d 05 18 2e 43 00 	lea    rax,[rip+0x432e18]        # 1871730 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2de18>
     143e918:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]
     143e91b:	41 80 bc 24 c8 00 00 	cmp    BYTE PTR [r12+0xc8],0x0
     143e922:	00 00 
     143e924:	74 39                	je     143e95f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283ee3>
     143e926:	49 8d bc 24 b0 00 00 	lea    rdi,[r12+0xb0]
     143e92d:	00 
     143e92e:	4c 8d ac 24 a0 01 00 	lea    r13,[rsp+0x1a0]
     143e935:	00 
     143e936:	41 83 65 00 00       	and    DWORD PTR [r13+0x0],0x0
     143e93b:	e8 f6 ce 63 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     143e940:	48 89 c7             	mov    rdi,rax
     143e943:	48 89 d6             	mov    rsi,rdx
     143e946:	4c 89 ea             	mov    rdx,r13
     143e949:	e8 06 65 ab ff       	call   ef4e54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbc26a>
     143e94e:	8b 8c 24 a0 01 00 00 	mov    ecx,DWORD PTR [rsp+0x1a0]
     143e955:	85 c9                	test   ecx,ecx
     143e957:	6a 05                	push   0x5
     143e959:	58                   	pop    rax
     143e95a:	0f 45 c1             	cmovne eax,ecx
     143e95d:	eb 03                	jmp    143e962 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283ee6>
     143e95f:	6a 05                	push   0x5
     143e961:	58                   	pop    rax
     143e962:	89 84 24 d0 00 00 00 	mov    DWORD PTR [rsp+0xd0],eax
     143e969:	8b 8c 24 c0 00 00 00 	mov    ecx,DWORD PTR [rsp+0xc0]
     143e970:	83 c9 02             	or     ecx,0x2
     143e973:	89 8c 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],ecx
     143e97a:	41 80 bc 24 80 00 00 	cmp    BYTE PTR [r12+0x80],0x0
     143e981:	00 00 
     143e983:	74 28                	je     143e9ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f31>
     143e985:	49 8d 7c 24 68       	lea    rdi,[r12+0x68]
     143e98a:	e8 13 3a 06 00       	call   14a23a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e7926>
     143e98f:	48 89 c1             	mov    rcx,rax
     143e992:	48 c1 e9 20          	shr    rcx,0x20
     143e996:	85 c0                	test   eax,eax
     143e998:	6a 01                	push   0x1
     143e99a:	5a                   	pop    rdx
     143e99b:	0f 44 c2             	cmove  eax,edx
     143e99e:	48 85 c9             	test   rcx,rcx
     143e9a1:	0f 44 c2             	cmove  eax,edx
     143e9a4:	8b 8c 24 c0 00 00 00 	mov    ecx,DWORD PTR [rsp+0xc0]
     143e9ab:	eb 03                	jmp    143e9b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f34>
     143e9ad:	6a 01                	push   0x1
     143e9af:	58                   	pop    rax
     143e9b0:	89 84 24 d4 00 00 00 	mov    DWORD PTR [rsp+0xd4],eax
     143e9b7:	83 c9 04             	or     ecx,0x4
     143e9ba:	89 8c 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],ecx
     143e9c1:	41 80 bc 24 a0 00 00 	cmp    BYTE PTR [r12+0xa0],0x0
     143e9c8:	00 00 
     143e9ca:	74 2b                	je     143e9f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f7b>
     143e9cc:	49 8d bc 24 88 00 00 	lea    rdi,[r12+0x88]
     143e9d3:	00 
     143e9d4:	e8 06 3b 06 00       	call   14a24df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e7a63>
     143e9d9:	48 89 c1             	mov    rcx,rax
     143e9dc:	48 c1 e9 20          	shr    rcx,0x20
     143e9e0:	85 c0                	test   eax,eax
     143e9e2:	6a 06                	push   0x6
     143e9e4:	5a                   	pop    rdx
     143e9e5:	0f 44 c2             	cmove  eax,edx
     143e9e8:	48 85 c9             	test   rcx,rcx
     143e9eb:	0f 44 c2             	cmove  eax,edx
     143e9ee:	8b 8c 24 c0 00 00 00 	mov    ecx,DWORD PTR [rsp+0xc0]
     143e9f5:	eb 03                	jmp    143e9fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f7e>
     143e9f7:	6a 06                	push   0x6
     143e9f9:	58                   	pop    rax
     143e9fa:	89 84 24 d8 00 00 00 	mov    DWORD PTR [rsp+0xd8],eax
     143ea01:	41 80 bc 24 ac 00 00 	cmp    BYTE PTR [r12+0xac],0x0
     143ea08:	00 00 
     143ea0a:	b8 44 ac 00 00       	mov    eax,0xac44
     143ea0f:	74 08                	je     143ea19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283f9d>
     143ea11:	41 8b 84 24 a8 00 00 	mov    eax,DWORD PTR [r12+0xa8]
     143ea18:	00 
     143ea19:	89 84 24 dc 00 00 00 	mov    DWORD PTR [rsp+0xdc],eax
     143ea20:	83 c9 18             	or     ecx,0x18
     143ea23:	89 8c 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],ecx
     143ea2a:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     143ea31:	00 
     143ea32:	48 83 67 f8 00       	and    QWORD PTR [rdi-0x8],0x0
     143ea37:	48 8d 05 d2 73 43 00 	lea    rax,[rip+0x4373d2]        # 1875e10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x324f8>
     143ea3e:	48 89 47 f0          	mov    QWORD PTR [rdi-0x10],rax
     143ea42:	0f 57 c0             	xorps  xmm0,xmm0
     143ea45:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     143ea48:	0f 11 47 0c          	movups XMMWORD PTR [rdi+0xc],xmm0
     143ea4c:	e8 c1 1c ab ff       	call   ef0712 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb7b28>
     143ea51:	49 89 c5             	mov    r13,rax
     143ea54:	48 89 c7             	mov    rdi,rax
     143ea57:	e8 f4 1c ab ff       	call   ef0750 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb7b66>
     143ea5c:	41 80 bc 24 d4 00 00 	cmp    BYTE PTR [r12+0xd4],0x0
     143ea63:	00 00 
     143ea65:	74 0c                	je     143ea73 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283ff7>
     143ea67:	f3 41 0f 10 84 24 d0 	movss  xmm0,DWORD PTR [r12+0xd0]
     143ea6e:	00 00 00 
     143ea71:	eb 08                	jmp    143ea7b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283fff>
     143ea73:	f3 0f 10 05 49 fe f4 	movss  xmm0,DWORD PTR [rip+0xfffffffffef4fe49]        # 38e8c4 <_ZTSSt12bad_any_cast@@Base-0x1904>
     143ea7a:	fe 
     143ea7b:	f3 0f 11 40 18       	movss  DWORD PTR [rax+0x18],xmm0
     143ea80:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     143ea84:	4c 89 ef             	mov    rdi,r13
     143ea87:	e8 c4 1c ab ff       	call   ef0750 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb7b66>
     143ea8c:	41 80 bc 24 dc 00 00 	cmp    BYTE PTR [r12+0xdc],0x0
     143ea93:	00 00 
     143ea95:	74 0c                	je     143eaa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284027>
     143ea97:	f3 41 0f 10 84 24 d8 	movss  xmm0,DWORD PTR [r12+0xd8]
     143ea9e:	00 00 00 
     143eaa1:	eb 08                	jmp    143eaab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28402f>
     143eaa3:	f3 0f 10 05 39 fe f4 	movss  xmm0,DWORD PTR [rip+0xfffffffffef4fe39]        # 38e8e4 <_ZTSSt12bad_any_cast@@Base-0x18e4>
     143eaaa:	fe 
     143eaab:	f3 0f 11 40 1c       	movss  DWORD PTR [rax+0x1c],xmm0
     143eab0:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
     143eab4:	4c 89 ef             	mov    rdi,r13
     143eab7:	e8 e0 e8 96 ff       	call   dad39c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a422>
     143eabc:	49 89 c4             	mov    r12,rax
     143eabf:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     143eac3:	48 8d 78 18          	lea    rdi,[rax+0x18]
     143eac7:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
     143eacb:	f6 c2 01             	test   dl,0x1
     143eace:	0f 85 c2 02 00 00    	jne    143ed96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28431a>
     143ead4:	48 8d 35 c7 02 f3 fe 	lea    rsi,[rip+0xfffffffffef302c7]        # 36eda2 <_ZTSSt12bad_any_cast@@Base-0x21426>
     143eadb:	e8 72 72 6c ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
     143eae0:	41 83 7c 24 38 03    	cmp    DWORD PTR [r12+0x38],0x3
     143eae6:	74 16                	je     143eafe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284082>
     143eae8:	4c 89 e7             	mov    rdi,r12
     143eaeb:	e8 6c ed 05 00       	call   149d85c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e2de0>
     143eaf0:	41 c7 44 24 38 03 00 	mov    DWORD PTR [r12+0x38],0x3
     143eaf7:	00 00 
     143eaf9:	49 89 6c 24 30       	mov    QWORD PTR [r12+0x30],rbp
     143eafe:	49 8d 7c 24 30       	lea    rdi,[r12+0x30]
     143eb03:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
     143eb08:	f6 c2 01             	test   dl,0x1
     143eb0b:	0f 85 91 02 00 00    	jne    143eda2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284326>
     143eb11:	48 8d 35 e6 5e f3 fe 	lea    rsi,[rip+0xfffffffffef35ee6]        # 3749fe <_ZTSSt12bad_any_cast@@Base-0x1b7ca>
     143eb18:	e8 35 72 6c ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
     143eb1d:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     143eb24:	00 
     143eb25:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     143eb2c:	00 
     143eb2d:	e8 92 11 34 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
     143eb32:	41 80 4c 24 10 02    	or     BYTE PTR [r12+0x10],0x2
     143eb38:	4c 89 e7             	mov    rdi,r12
     143eb3b:	48 83 c7 20          	add    rdi,0x20
     143eb3f:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
     143eb44:	f6 c2 01             	test   dl,0x1
     143eb47:	0f 85 61 02 00 00    	jne    143edae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284332>
     143eb4d:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
     143eb54:	00 
     143eb55:	e8 8c 6c 32 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     143eb5a:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     143eb61:	00 
     143eb62:	e8 29 f3 3a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     143eb67:	41 c6 44 24 28 01    	mov    BYTE PTR [r12+0x28],0x1
     143eb6d:	41 80 4c 24 10 04    	or     BYTE PTR [r12+0x10],0x4
     143eb73:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     143eb7a:	00 
     143eb7b:	48 8d b4 24 70 01 00 	lea    rsi,[rsp+0x170]
     143eb82:	00 
     143eb83:	e8 3c 11 34 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
     143eb88:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     143eb8f:	00 
     143eb90:	e8 a1 cc 63 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     143eb95:	0f 57 c0             	xorps  xmm0,xmm0
     143eb98:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     143eb9d:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     143eba0:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     143eba5:	48 89 c6             	mov    rsi,rax
     143eba8:	31 c9                	xor    ecx,ecx
     143ebaa:	e8 6c c9 39 00       	call   17db51b <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x733c>
     143ebaf:	4c 8d a4 24 a0 01 00 	lea    r12,[rsp+0x1a0]
     143ebb6:	00 
     143ebb7:	4c 89 e7             	mov    rdi,r12
     143ebba:	e8 d1 f2 3a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     143ebbf:	49 83 64 24 08 00    	and    QWORD PTR [r12+0x8],0x0
     143ebc5:	48 8d 05 9c 93 45 00 	lea    rax,[rip+0x45939c]        # 1897f68 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4ea8>
     143ebcc:	49 89 04 24          	mov    QWORD PTR [r12],rax
     143ebd0:	0f 57 c0             	xorps  xmm0,xmm0
     143ebd3:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
     143ebd9:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
     143ebdf:	49 89 6c 24 30       	mov    QWORD PTR [r12+0x30],rbp
     143ebe4:	41 0f 11 44 24 38    	movups XMMWORD PTR [r12+0x38],xmm0
     143ebea:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     143ebef:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     143ebf4:	48 8d 94 24 a0 01 00 	lea    rdx,[rsp+0x1a0]

### slot +0x40 body -> 0x143ee7a
     143ee7a:	55                   	push   rbp
     143ee7b:	41 57                	push   r15
     143ee7d:	41 56                	push   r14
     143ee7f:	41 55                	push   r13
     143ee81:	41 54                	push   r12
     143ee83:	53                   	push   rbx
     143ee84:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
     143ee8b:	49 89 cf             	mov    r15,rcx
     143ee8e:	49 89 d4             	mov    r12,rdx
     143ee91:	49 89 f5             	mov    r13,rsi
     143ee94:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     143ee99:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143eea0:	00 00 
     143eea2:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     143eea9:	00 
     143eeaa:	80 ba 80 00 00 00 00 	cmp    BYTE PTR [rdx+0x80],0x0
     143eeb1:	0f 84 2a 01 00 00    	je     143efe1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284565>
     143eeb7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     143eebc:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     143eec0:	4c 89 c6             	mov    rsi,r8
     143eec3:	e8 0a b0 ff ff       	call   1439ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f456>
     143eec8:	49 8b 5f 08          	mov    rbx,QWORD PTR [r15+0x8]
     143eecc:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     143eed0:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     143eed5:	48 85 db             	test   rbx,rbx
     143eed8:	74 05                	je     143eedf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284463>
     143eeda:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     143eedf:	48 8d 0d 92 06 4e 00 	lea    rcx,[rip+0x4e0692]        # 191f578 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x66988>
     143eee6:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     143eeeb:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     143eef0:	48 ba 03 00 00 00 01 	movabs rdx,0x100000003
     143eef7:	00 00 00 
     143eefa:	e8 51 ea dd ff       	call   121d950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ed4>
     143eeff:	48 89 df             	mov    rdi,rbx
     143ef02:	e8 ab f5 65 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     143ef07:	49 8b 6d 28          	mov    rbp,QWORD PTR [r13+0x28]
     143ef0b:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     143ef10:	0f 28 4c 24 20       	movaps xmm1,XMMWORD PTR [rsp+0x20]
     143ef15:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
     143ef1c:	00 
     143ef1d:	0f 29 43 e0          	movaps XMMWORD PTR [rbx-0x20],xmm0
     143ef21:	0f 57 c0             	xorps  xmm0,xmm0
     143ef24:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     143ef29:	0f 29 4b f0          	movaps XMMWORD PTR [rbx-0x10],xmm1
     143ef2d:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
     143ef32:	48 89 df             	mov    rdi,rbx
     143ef35:	4c 89 ee             	mov    rsi,r13
     143ef38:	e8 95 af ff ff       	call   1439ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f456>
     143ef3d:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     143ef44:	00 00 
     143ef46:	48 83 a4 24 c0 00 00 	and    QWORD PTR [rsp+0xc0],0x0
     143ef4d:	00 00 
     143ef4f:	6a 40                	push   0x40
     143ef51:	5f                   	pop    rdi
     143ef52:	e8 a9 ef 3a 00       	call   17edf00 <_Znwm@plt>
     143ef57:	49 89 c6             	mov    r14,rax
     143ef5a:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]
     143ef61:	00 
     143ef62:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
     143ef66:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     143ef6a:	0f 57 c0             	xorps  xmm0,xmm0
     143ef6d:	0f 29 40 f0          	movaps XMMWORD PTR [rax-0x10],xmm0
     143ef71:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     143ef74:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
     143ef79:	4c 89 f7             	mov    rdi,r14
     143ef7c:	48 83 c7 20          	add    rdi,0x20
     143ef80:	48 89 de             	mov    rsi,rbx
     143ef83:	e8 4a af ff ff       	call   1439ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f456>
     143ef88:	4c 8d 84 24 b0 00 00 	lea    r8,[rsp+0xb0]
     143ef8f:	00 
     143ef90:	4d 89 30             	mov    QWORD PTR [r8],r14
     143ef93:	48 8d 05 26 02 00 00 	lea    rax,[rip+0x226]        # 143f1c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284744>
     143ef9a:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax
     143ef9e:	48 8d 05 45 02 00 00 	lea    rax,[rip+0x245]        # 143f1ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28476e>
     143efa5:	49 89 40 18          	mov    QWORD PTR [r8+0x18],rax
     143efa9:	49 83 c4 68          	add    r12,0x68
     143efad:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     143efb1:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     143efb6:	48 89 df             	mov    rdi,rbx
     143efb9:	48 89 ee             	mov    rsi,rbp
     143efbc:	4c 89 e2             	mov    rdx,r12
     143efbf:	4c 89 f9             	mov    rcx,r15
     143efc2:	ff 50 10             	call   QWORD PTR [rax+0x10]
     143efc5:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     143efcc:	00 
     143efcd:	e8 e2 c9 f5 ff       	call   139b9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f38>
     143efd2:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     143efd7:	e8 92 02 00 00       	call   143f26e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2847f2>
     143efdc:	e9 25 01 00 00       	jmp    143f106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28468a>
     143efe1:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     143efe6:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     143efea:	4c 89 c6             	mov    rsi,r8
     143efed:	e8 e0 ae ff ff       	call   1439ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f456>
     143eff2:	49 8b 5f 08          	mov    rbx,QWORD PTR [r15+0x8]
     143eff6:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     143effa:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     143efff:	48 85 db             	test   rbx,rbx
     143f002:	74 05                	je     143f009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28458d>
     143f004:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     143f009:	48 8d 0d 68 05 4e 00 	lea    rcx,[rip+0x4e0568]        # 191f578 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x66988>
     143f010:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     143f015:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     143f01a:	48 ba 02 00 00 00 01 	movabs rdx,0x100000002
     143f021:	00 00 00 
     143f024:	e8 27 e9 dd ff       	call   121d950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ed4>
     143f029:	48 89 df             	mov    rdi,rbx
     143f02c:	e8 81 f4 65 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     143f031:	49 8b 6d 20          	mov    rbp,QWORD PTR [r13+0x20]
     143f035:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     143f03a:	0f 28 4c 24 20       	movaps xmm1,XMMWORD PTR [rsp+0x20]
     143f03f:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
     143f046:	00 
     143f047:	0f 29 43 e0          	movaps XMMWORD PTR [rbx-0x20],xmm0
     143f04b:	0f 57 c0             	xorps  xmm0,xmm0
     143f04e:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     143f053:	0f 29 4b f0          	movaps XMMWORD PTR [rbx-0x10],xmm1
     143f057:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
     143f05c:	48 89 df             	mov    rdi,rbx
     143f05f:	4c 89 ee             	mov    rsi,r13
     143f062:	e8 6b ae ff ff       	call   1439ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f456>
     143f067:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     143f06e:	00 00 
     143f070:	48 83 a4 24 c0 00 00 	and    QWORD PTR [rsp+0xc0],0x0
     143f077:	00 00 
     143f079:	6a 40                	push   0x40
     143f07b:	5f                   	pop    rdi
     143f07c:	e8 7f ee 3a 00       	call   17edf00 <_Znwm@plt>
     143f081:	49 89 c6             	mov    r14,rax
     143f084:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]
     143f08b:	00 
     143f08c:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
     143f090:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     143f094:	0f 57 c0             	xorps  xmm0,xmm0
     143f097:	0f 29 40 f0          	movaps XMMWORD PTR [rax-0x10],xmm0
     143f09b:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     143f09e:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
     143f0a3:	4c 89 f7             	mov    rdi,r14
     143f0a6:	48 83 c7 20          	add    rdi,0x20
     143f0aa:	48 89 de             	mov    rsi,rbx
     143f0ad:	e8 20 ae ff ff       	call   1439ed2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f456>
     143f0b2:	4c 8d 84 24 b0 00 00 	lea    r8,[rsp+0xb0]
     143f0b9:	00 
     143f0ba:	4d 89 30             	mov    QWORD PTR [r8],r14
     143f0bd:	48 8d 05 fc 00 00 00 	lea    rax,[rip+0xfc]        # 143f1c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284744>
     143f0c4:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax
     143f0c8:	48 8d 05 1b 01 00 00 	lea    rax,[rip+0x11b]        # 143f1ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28476e>
     143f0cf:	49 89 40 18          	mov    QWORD PTR [r8+0x18],rax
     143f0d3:	49 83 c4 68          	add    r12,0x68
     143f0d7:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     143f0db:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     143f0e0:	48 89 df             	mov    rdi,rbx
     143f0e3:	48 89 ee             	mov    rsi,rbp
     143f0e6:	4c 89 e2             	mov    rdx,r12
     143f0e9:	4c 89 f9             	mov    rcx,r15
     143f0ec:	ff 50 10             	call   QWORD PTR [rax+0x10]
     143f0ef:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     143f0f6:	00 
     143f0f7:	e8 b8 c8 f5 ff       	call   139b9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f38>
     143f0fc:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     143f101:	e8 68 01 00 00       	call   143f26e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2847f2>
     143f106:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     143f10b:	e8 16 eb dd ff       	call   121dc26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631aa>
     143f110:	4c 89 ef             	mov    rdi,r13
     143f113:	e8 9c c8 f5 ff       	call   139b9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f38>
     143f118:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143f11f:	00 00 
     143f121:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     143f128:	00 
     143f129:	0f 85 8c 00 00 00    	jne    143f1bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28473f>
     143f12f:	48 89 d8             	mov    rax,rbx
     143f132:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
     143f139:	5b                   	pop    rbx
     143f13a:	41 5c                	pop    r12
     143f13c:	41 5d                	pop    r13
     143f13e:	41 5e                	pop    r14
     143f140:	41 5f                	pop    r15
     143f142:	5d                   	pop    rbp
     143f143:	c3                   	ret
     143f144:	eb 00                	jmp    143f146 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2846ca>
     143f146:	49 89 c6             	mov    r14,rax
     143f149:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     143f150:	00 
     143f151:	e8 5e c8 f5 ff       	call   139b9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f38>
     143f156:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     143f15b:	e8 0e 01 00 00       	call   143f26e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2847f2>
     143f160:	eb 1e                	jmp    143f180 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284704>
     143f162:	eb 28                	jmp    143f18c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284710>
     143f164:	eb 00                	jmp    143f166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2846ea>
     143f166:	49 89 c6             	mov    r14,rax
     143f169:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     143f170:	00 
     143f171:	e8 3e c8 f5 ff       	call   139b9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f38>
     143f176:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     143f17b:	e8 ee 00 00 00       	call   143f26e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2847f2>
     143f180:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     143f185:	e8 9c ea dd ff       	call   121dc26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631aa>
     143f18a:	eb 0b                	jmp    143f197 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28471b>
     143f18c:	49 89 c6             	mov    r14,rax
     143f18f:	48 89 df             	mov    rdi,rbx
     143f192:	e8 1b f3 65 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     143f197:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     143f19b:	e8 14 c8 f5 ff       	call   139b9b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f38>
     143f1a0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143f1a7:	00 00 
     143f1a9:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     143f1b0:	00 
     143f1b1:	75 08                	jne    143f1bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28473f>
     143f1b3:	4c 89 f7             	mov    rdi,r14
     143f1b6:	e8 15 0b 63 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     143f1bb:	e8 f0 08 3b 00       	call   17efab0 <__stack_chk_fail@plt>

### slot +0x68 body -> 0xc6754a
      c6754a:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
      c6754e:	e9 5f 6f e3 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>

### slot +0x140 body -> 0xa50370
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>


## Dynamic helper 0x1439114 high-address/vptr materializations
### 0x143917c: lea    rax,[rip+0x45ede5]        # 1897f68 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4ea8>
     1439157:	0f 29 84 24 90 02 00 	movaps XMMWORD PTR [rsp+0x290],xmm0
     143915e:	00 
     143915f:	c7 84 24 c8 02 00 00 	mov    DWORD PTR [rsp+0x2c8],0xc
     1439166:	0c 00 00 00 
     143916a:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
     143916f:	49 83 67 d8 00       	and    QWORD PTR [r15-0x28],0x0
     1439174:	0f 29 84 24 d0 02 00 	movaps XMMWORD PTR [rsp+0x2d0],xmm0
     143917b:	00 
     143917c:	48 8d 05 e5 ed 45 00 	lea    rax,[rip+0x45ede5]        # 1897f68 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4ea8>
     1439183:	49 89 47 d0          	mov    QWORD PTR [r15-0x30],rax
     1439187:	41 0f 11 47 e0       	movups XMMWORD PTR [r15-0x20],xmm0
     143918c:	41 0f 11 47 f0       	movups XMMWORD PTR [r15-0x10],xmm0
     1439191:	48 8d 05 60 66 00 ff 	lea    rax,[rip+0xffffffffff006660]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1439198:	49 89 07             	mov    QWORD PTR [r15],rax
     143919b:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
     14391a0:	48 8d 35 56 3d f0 fe 	lea    rsi,[rip+0xfffffffffef03d56]        # 33cefd <_ZTSSt12bad_any_cast@@Base-0x532cb>
     14391a7:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     14391ae:	00 
     14391af:	6a 16                	push   0x16
     14391b1:	5a                   	pop    rdx
     14391b2:	e8 2e ea 39 00       	call   17d7be5 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a06>
     14391b7:	84 c0                	test   al,al
     14391b9:	74 29                	je     14391e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e768>

### 0x1439537: lea    rax,[rip+0x437efa]        # 1871438 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2db20>
     143951b:	00 
     143951c:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
     1439523:	00 
     1439524:	4c 89 ef             	mov    rdi,r13
     1439527:	4c 89 e6             	mov    rsi,r12
     143952a:	e8 6b 02 00 00       	call   143979a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ed1e>
     143952f:	41 c6 85 78 01 00 00 	mov    BYTE PTR [r13+0x178],0x1
     1439536:	01 
     1439537:	48 8d 05 fa 7e 43 00 	lea    rax,[rip+0x437efa]        # 1871438 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2db20>
     143953e:	49 89 07             	mov    QWORD PTR [r15],rax
     1439541:	4d 89 77 08          	mov    QWORD PTR [r15+0x8],r14
     1439545:	49 8d 47 18          	lea    rax,[r15+0x18]
     1439549:	0f 57 c0             	xorps  xmm0,xmm0
     143954c:	41 0f 11 47 18       	movups XMMWORD PTR [r15+0x18],xmm0
     1439551:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     1439555:	49 8d 47 30          	lea    rax,[r15+0x30]
     1439559:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     143955e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     1439562:	49 8d 47 48          	lea    rax,[r15+0x48]
     1439566:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
     143956b:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     143956f:	4d 8d 77 58          	lea    r14,[r15+0x58]
     1439573:	31 c0                	xor    eax,eax


## Dynamic helper output stores through original rdi / saved output register
     1439128:	49 89 fc             	mov    r12,rdi
     143933b:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
     1439357:	4c 89 e7             	mov    rdi,r12
     1439367:	4c 89 e6             	mov    rsi,r12
     14393d5:	4c 89 e7             	mov    rdi,r12
     14393dd:	41 8b 44 24 10       	mov    eax,DWORD PTR [r12+0x10]
     14393e9:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     1439429:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     143948d:	4c 89 e7             	mov    rdi,r12
     1439527:	4c 89 e6             	mov    rsi,r12
     14395be:	4c 89 e7             	mov    rdi,r12

## Fallback AP materialization contexts
### 0x1871530
     1352c9e:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     1352ca5:	00 
     1352ca6:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
     1352cad:	00 00 
     1352caf:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     1352cb4:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352cb7:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352cba:	48 85 ff             	test   rdi,rdi
     1352cbd:	74 06                	je     1352cc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198249>
     1352cbf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352cc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352cc5:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     1352ccc:	00 
     1352ccd:	e8 28 08 00 00       	call   13534fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198a7e>
     1352cd2:	eb 5d                	jmp    1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352cd4:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     1352cd9:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     1352cdc:	6a 28                	push   0x28
     1352cde:	5f                   	pop    rdi
     1352cdf:	e8 1c b2 49 00       	call   17edf00 <_Znwm@plt>
     1352ce4:	48 8d 0d 45 e8 51 00 	lea    rcx,[rip+0x51e845]        # 1871530 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc18>
     1352ceb:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352cee:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352cf3:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1352cf7:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     1352cfb:	48 8b 8c 24 f8 00 00 	mov    rcx,QWORD PTR [rsp+0xf8]
     1352d02:	00 
     1352d03:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
     1352d0a:	00 00 
     1352d0c:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
     1352d11:	48 85 c9             	test   rcx,rcx
     1352d14:	74 05                	je     1352d1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19829f>
     1352d16:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352d1b:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     1352d20:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352d23:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352d26:	48 85 ff             	test   rdi,rdi
     1352d29:	74 06                	je     1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352d2b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352d2e:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352d31:	48 8d 35 8c a0 08 ff 	lea    rsi,[rip+0xffffffffff08a08c]        # 3dcdc4 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2813>
     1352d38:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352d3f:	00 
     1352d40:	6a 02                	push   0x2
     1352d42:	5a                   	pop    rdx
     1352d43:	e8 e4 6c d5 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     1352d48:	80 7c 24 0e 00       	cmp    BYTE PTR [rsp+0xe],0x0
     1352d4d:	74 6d                	je     1352dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198340>
     1352d4f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352d56:	00 
     1352d57:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1352d5e:	00 
     1352d5f:	6a 04                	push   0x4
     1352d61:	5a                   	pop    rdx
     1352d62:	e8 3d 6e d5 ff       	call   10a9ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270fba>
     1352d67:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
     1352d6b:	75 4f                	jne    1352dbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198340>
     1352d6d:	49 89 c6             	mov    r14,rax
     1352d70:	6a 20                	push   0x20

### 0x1871558
     135292b:	5f                   	pop    rdi
     135292c:	e8 cf b5 49 00       	call   17edf00 <_Znwm@plt>
     1352931:	49 89 c7             	mov    r15,rax
     1352934:	49 89 c6             	mov    r14,rax
     1352937:	48 8d 05 02 4b 51 00 	lea    rax,[rip+0x514b02]        # 1867440 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23b28>
     135293e:	49 89 07             	mov    QWORD PTR [r15],rax
     1352941:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
     1352948:	00 00 
     135294a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
     1352950:	66 49 0f 3a 16 c4 01 	pextrq r12,xmm0,0x1
     1352957:	4d 85 e4             	test   r12,r12
     135295a:	74 52                	je     13529ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f32>
     135295c:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
     1352962:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1352966:	eb 4b                	jmp    13529b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f37>
     1352968:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135296d:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     1352970:	6a 18                	push   0x18
     1352972:	5f                   	pop    rdi
     1352973:	e8 88 b5 49 00       	call   17edf00 <_Znwm@plt>
     1352978:	48 8d 0d d9 eb 51 00 	lea    rcx,[rip+0x51ebd9]        # 1871558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc40>
     135297f:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352982:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352987:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     135298b:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     135298f:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     1352994:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352997:	48 89 01             	mov    QWORD PTR [rcx],rax
     135299a:	48 85 ff             	test   rdi,rdi
     135299d:	0f 84 e6 00 00 00    	je     1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
     13529a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13529a6:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13529a9:	e9 db 00 00 00       	jmp    1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
     13529ae:	66 48 0f 7e c7       	movq   rdi,xmm0
     13529b3:	49 83 c7 18          	add    r15,0x18
     13529b7:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
     13529bc:	66 0f ef c0          	pxor   xmm0,xmm0
     13529c0:	f3 41 0f 7f 46 18    	movdqu XMMWORD PTR [r14+0x18],xmm0
     13529c6:	41 c6 46 30 01       	mov    BYTE PTR [r14+0x30],0x1
     13529cb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13529ce:	31 f6                	xor    esi,esi
     13529d0:	ff 50 70             	call   QWORD PTR [rax+0x70]
     13529d3:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     13529d8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     13529db:	4c 89 30             	mov    QWORD PTR [rax],r14
     13529de:	48 85 ff             	test   rdi,rdi
     13529e1:	74 06                	je     13529e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f6d>
     13529e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13529e6:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13529e9:	80 7c 24 28 00       	cmp    BYTE PTR [rsp+0x28],0x0
     13529ee:	74 48                	je     1352a38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197fbc>
     13529f0:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     13529f7:	00 
     13529f8:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     13529fd:	e8 12 67 0e 00       	call   1439114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e698>
     1352a02:	48 8b 84 24 50 01 00 	mov    rax,QWORD PTR [rsp+0x150]
     1352a09:	00 
     1352a0a:	48 83 a4 24 50 01 00 	and    QWORD PTR [rsp+0x150],0x0
     1352a11:	00 00 


## TimelineConductor 0x1871660 wrapper creation / consumers
     135ec22:	e8 21 5c 75 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
     135ec27:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135ec2e:	00 
     135ec2f:	e8 36 b3 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ec34:	48 8b 9c 24 00 01 00 	mov    rbx,QWORD PTR [rsp+0x100]
     135ec3b:	00 
     135ec3c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135ec3f:	4c 89 23             	mov    QWORD PTR [rbx],r12
     135ec42:	48 85 ff             	test   rdi,rdi
     135ec45:	74 09                	je     135ec50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a41d4>
     135ec47:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec4a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135ec4d:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
     135ec50:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135ec57:	00 
     135ec58:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec5b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135ec5e:	4c 8b bc 24 b0 10 00 	mov    r15,QWORD PTR [rsp+0x10b0]
     135ec65:	00 
     135ec66:	48 89 c3             	mov    rbx,rax
     135ec69:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec6c:	4c 89 ff             	mov    rdi,r15
     135ec6f:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135ec72:	49 89 c6             	mov    r14,rax
     135ec75:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec78:	4c 89 ff             	mov    rdi,r15
     135ec7b:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135ec7e:	48 89 c5             	mov    rbp,rax
     135ec81:	6a 40                	push   0x40
     135ec83:	5f                   	pop    rdi
     135ec84:	e8 77 f2 48 00       	call   17edf00 <_Znwm@plt>
     135ec89:	49 89 c7             	mov    r15,rax
     135ec8c:	48 8d 05 cd 29 51 00 	lea    rax,[rip+0x5129cd]        # 1871660 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dd48>
     135ec93:	49 89 07             	mov    QWORD PTR [r15],rax
     135ec96:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135ec9d:	00 
     135ec9e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
     135eca2:	49 89 5f 10          	mov    QWORD PTR [r15+0x10],rbx
     135eca6:	48 8b 84 24 c0 10 00 	mov    rax,QWORD PTR [rsp+0x10c0]
     135ecad:	00 
     135ecae:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     135ecb2:	4d 89 77 20          	mov    QWORD PTR [r15+0x20],r14
     135ecb6:	49 89 6f 28          	mov    QWORD PTR [r15+0x28],rbp
     135ecba:	4c 89 ff             	mov    rdi,r15
     135ecbd:	48 83 c7 30          	add    rdi,0x30
     135ecc1:	e8 64 6a 80 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     135ecc6:	4c 89 bc 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r15
     135eccd:	00 
     135ecce:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135ecd5:	00 
     135ecd6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ecd9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135ecdc:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     135ece1:	bf 10 01 00 00       	mov    edi,0x110
     135ece6:	e8 15 f2 48 00       	call   17edf00 <_Znwm@plt>
     135eceb:	48 89 c3             	mov    rbx,rax
     135ecee:	48 8d 05 b3 b1 50 00 	lea    rax,[rip+0x50b1b3]        # 1869ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26590>
     135ecf5:	48 89 03             	mov    QWORD PTR [rbx],rax
     135ecf8:	48 8d 05 49 b2 50 00 	lea    rax,[rip+0x50b249]        # 1869f48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26630>
     135ecff:	48 89 84 24 d0 0a 00 	mov    QWORD PTR [rsp+0xad0],rax
     135ed06:	00 
     135ed07:	48 8b 84 24 00 11 00 	mov    rax,QWORD PTR [rsp+0x1100]
     135ed0e:	00 
     135ed0f:	48 89 84 24 d8 0a 00 	mov    QWORD PTR [rsp+0xad8],rax
     135ed16:	00 
     135ed17:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ed1e:	00 
     135ed1f:	48 8d 73 10          	lea    rsi,[rbx+0x10]
     135ed23:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
     135ed27:	4c 89 ef             	mov    rdi,r13
     135ed2a:	e8 01 2e 04 00       	call   13a1b30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e70b4>
     135ed2f:	66 0f ef c0          	pxor   xmm0,xmm0
     135ed33:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ed38:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ed3d:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ed42:	48 89 d8             	mov    rax,rbx
     135ed45:	48 83 c0 68          	add    rax,0x68
     135ed49:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ed4d:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ed51:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ed58:	00 
     135ed59:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ed5e:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ed65:	00 
     135ed66:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ed6d:	00 80 3f 
     135ed70:	6a 64                	push   0x64
     135ed72:	58                   	pop    rax
     135ed73:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ed7a:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ed81:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ed88:	00 
     135ed89:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ed90:	00 
     135ed91:	4c 89 ef             	mov    rdi,r13
     135ed94:	e8 d1 b1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ed99:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135eda0:	00 
     135eda1:	66 0f ef c0          	pxor   xmm0,xmm0
     135eda5:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135edac:	00 
     135edad:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135edb4:	00 

### all direct refs to 0x1871660 methods
- 0x9d7960: call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>; caller FDE=(10320032, 10320414)
- 0x9d7ae7: call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>; caller FDE=(10320416, 10321016)
- 0x9d7b97: call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>; caller FDE=(10320416, 10321016)
- 0x9e8032: call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>; caller FDE=(10387488, 10387540)
- 0x143f50a: call   143f4f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284a7a>; caller FDE=(21230854, 21230872)
- 0x1738c79: call   a50370 <_ZdaPv@@Base>; caller FDE=(24349650, 24350070)
- 0x174855b: call   a50370 <_ZdaPv@@Base>; caller FDE=(24413518, 24413545)
- 0x178c13a: jmp    9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>; caller FDE=(24691002, 24691007)
- 0x178e302: call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>; caller FDE=(24699564, 24699909)
- 0x1790d3b: call   9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>; caller FDE=(24710403, 24710688)

## Strings used by sibling-interface methods
- FDE 0x143a3be: ['unknown']
- FDE 0x143b2fe: ['unknown']
- FDE 0x143b7ae: ['\x0epreroll', 'unknown']
- FDE 0x143d578: ['ad_not_available']
- FDE 0x143dfec: ['cspr']
- FDE 0x143dff8: ['Blocking']
- FDE 0x143e010: ['User']
- FDE 0x143e1d8: ['list_player']
- FDE 0x143e1e0: ['invalid_list_player_error_']
- FDE 0x143e514: ['unknown']
- FDE 0x143e82a: ['POST', 'client-tts/v1/fulfill', 'unknown']
- FDE 0x1441a7a: ['media_resolver']
- FDE 0x1441af2: ['User', 'System']
- FDE 0x1441bfe: ['timeline_conductor']
- FDE 0x1441c06: ['invalid_timeline_conductor_error_']
- FDE 0x1441fde: ['TimelineReporterSetupImpl']
