# Smart skip interval-source trace

Known caller behavior: both containment helpers scan 16-byte [start,end) pairs and, when current_ms lies inside an interval, return that pair; smartSkipEmbeddedPodcastAd seeks to the returned end value.

## primary interval extractor: 0x13a1922 FDE=(20584738, 20585034)
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

### direct calls
- 0x13a1979 -> 0x17ee0f0: call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
- 0x13a1989 -> 0x16c9e66: call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
- 0x13a199d -> 0x13a046a: call   13a046a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e59ee>
- 0x13a19a9 -> 0x16c532e: call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
- 0x13a19b1 -> 0xaabe30: call   aabe30 <JNI_OnUnload@@Base+0x336fd>
- 0x13a19c6 -> 0xb07f52: call   b07f52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54ef2>
- 0x13a19d6 -> 0x13a0454: call   13a0454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e59d8>
- 0x13a1a0e -> 0x16c532e: call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
- 0x13a1a16 -> 0xaabe30: call   aabe30 <JNI_OnUnload@@Base+0x336fd>
- 0x13a1a25 -> 0x13a0454: call   13a0454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e59d8>
- 0x13a1a40 -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- 0x13a1a45 -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

## fallback interval extractor: 0x13a37f8 FDE=(20592632, 20592939)
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

### direct calls
- 0x13a3856 -> 0x17ee0f0: call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
- 0x13a3866 -> 0x16c9e66: call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
- 0x13a387a -> 0x13a3354: call   13a3354 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e88d8>
- 0x13a3886 -> 0x16c532e: call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
- 0x13a3890 -> 0xaabe30: call   aabe30 <JNI_OnUnload@@Base+0x336fd>
- 0x13a38a5 -> 0xb07f52: call   b07f52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54ef2>
- 0x13a38b5 -> 0x13a0454: call   13a0454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e59d8>
- 0x13a38ed -> 0x16c532e: call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
- 0x13a38f7 -> 0xaabe30: call   aabe30 <JNI_OnUnload@@Base+0x336fd>
- 0x13a3906 -> 0x13a0454: call   13a0454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e59d8>
- 0x13a3921 -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- 0x13a3926 -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

## primary interval containment: 0x13a1a4a FDE=(20585034, 20585231)
     13a1a4a:	41 56                	push   r14
     13a1a4c:	53                   	push   rbx
     13a1a4d:	48 83 ec 38          	sub    rsp,0x38
     13a1a51:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a1a58:	00 00 
     13a1a5a:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     13a1a5f:	83 7e 38 3f          	cmp    DWORD PTR [rsi+0x38],0x3f
     13a1a63:	75 47                	jne    13a1aac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7030>
     13a1a65:	48 89 cb             	mov    rbx,rcx
     13a1a68:	49 89 d6             	mov    r14,rdx
     13a1a6b:	0f 57 c0             	xorps  xmm0,xmm0
     13a1a6e:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     13a1a73:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     13a1a76:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     13a1a7b:	48 8d 4c 24 0f       	lea    rcx,[rsp+0xf]
     13a1a80:	e8 9d fe ff ff       	call   13a1922 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6ea6>
     13a1a85:	84 c0                	test   al,al
     13a1a87:	74 27                	je     13a1ab0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7034>
     13a1a89:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13a1a8e:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     13a1a93:	48 39 c8             	cmp    rax,rcx
     13a1a96:	74 18                	je     13a1ab0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7034>
     13a1a98:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     13a1a9b:	4c 39 f2             	cmp    rdx,r14
     13a1a9e:	7f 06                	jg     13a1aa6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e702a>
     13a1aa0:	4c 39 70 08          	cmp    QWORD PTR [rax+0x8],r14
     13a1aa4:	7f 30                	jg     13a1ad6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e705a>
     13a1aa6:	48 83 c0 10          	add    rax,0x10
     13a1aaa:	eb e7                	jmp    13a1a93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7017>
     13a1aac:	31 db                	xor    ebx,ebx
     13a1aae:	eb 0c                	jmp    13a1abc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7040>
     13a1ab0:	31 db                	xor    ebx,ebx
     13a1ab2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a1ab7:	e8 6c 9c 6d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13a1abc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a1ac3:	00 00 
     13a1ac5:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     13a1aca:	75 3e                	jne    13a1b0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e708e>
     13a1acc:	89 d8                	mov    eax,ebx
     13a1ace:	48 83 c4 38          	add    rsp,0x38
     13a1ad2:	5b                   	pop    rbx
     13a1ad3:	41 5e                	pop    r14
     13a1ad5:	c3                   	ret
     13a1ad6:	48 89 13             	mov    QWORD PTR [rbx],rdx
     13a1ad9:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     13a1add:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     13a1ae1:	b3 01                	mov    bl,0x1
     13a1ae3:	eb cd                	jmp    13a1ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7036>
     13a1ae5:	48 89 c3             	mov    rbx,rax
     13a1ae8:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a1aed:	e8 36 9c 6d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13a1af2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a1af9:	00 00 
     13a1afb:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     13a1b00:	75 08                	jne    13a1b0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e708e>
     13a1b02:	48 89 df             	mov    rdi,rbx
     13a1b05:	e8 c6 e1 6c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13a1b0a:	e8 a1 df 44 00       	call   17efab0 <__stack_chk_fail@plt>

### direct calls
- 0x13a1a80 -> 0x13a1922: call   13a1922 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6ea6>
- 0x13a1ab7 -> 0xa7b728: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
- 0x13a1aed -> 0xa7b728: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
- 0x13a1b05 -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- 0x13a1b0a -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

## fallback interval containment: 0x13a392c FDE=(20592940, 20593137)
     13a392c:	41 56                	push   r14
     13a392e:	53                   	push   rbx
     13a392f:	48 83 ec 38          	sub    rsp,0x38
     13a3933:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a393a:	00 00 
     13a393c:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     13a3941:	83 7e 38 3f          	cmp    DWORD PTR [rsi+0x38],0x3f
     13a3945:	75 47                	jne    13a398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f12>
     13a3947:	48 89 cb             	mov    rbx,rcx
     13a394a:	49 89 d6             	mov    r14,rdx
     13a394d:	0f 57 c0             	xorps  xmm0,xmm0
     13a3950:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     13a3955:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     13a3958:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     13a395d:	48 8d 4c 24 0f       	lea    rcx,[rsp+0xf]
     13a3962:	e8 91 fe ff ff       	call   13a37f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8d7c>
     13a3967:	84 c0                	test   al,al
     13a3969:	74 27                	je     13a3992 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f16>
     13a396b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13a3970:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     13a3975:	48 39 c8             	cmp    rax,rcx
     13a3978:	74 18                	je     13a3992 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f16>
     13a397a:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     13a397d:	4c 39 f2             	cmp    rdx,r14
     13a3980:	7f 06                	jg     13a3988 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f0c>
     13a3982:	4c 39 70 08          	cmp    QWORD PTR [rax+0x8],r14
     13a3986:	7f 30                	jg     13a39b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f3c>
     13a3988:	48 83 c0 10          	add    rax,0x10
     13a398c:	eb e7                	jmp    13a3975 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8ef9>
     13a398e:	31 db                	xor    ebx,ebx
     13a3990:	eb 0c                	jmp    13a399e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f22>
     13a3992:	31 db                	xor    ebx,ebx
     13a3994:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a3999:	e8 8a 7d 6d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13a399e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a39a5:	00 00 
     13a39a7:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     13a39ac:	75 3e                	jne    13a39ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f70>
     13a39ae:	89 d8                	mov    eax,ebx
     13a39b0:	48 83 c4 38          	add    rsp,0x38
     13a39b4:	5b                   	pop    rbx
     13a39b5:	41 5e                	pop    r14
     13a39b7:	c3                   	ret
     13a39b8:	48 89 13             	mov    QWORD PTR [rbx],rdx
     13a39bb:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     13a39bf:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     13a39c3:	b3 01                	mov    bl,0x1
     13a39c5:	eb cd                	jmp    13a3994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f18>
     13a39c7:	48 89 c3             	mov    rbx,rax
     13a39ca:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a39cf:	e8 54 7d 6d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13a39d4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a39db:	00 00 
     13a39dd:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     13a39e2:	75 08                	jne    13a39ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f70>
     13a39e4:	48 89 df             	mov    rdi,rbx
     13a39e7:	e8 e4 c2 6c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13a39ec:	e8 bf c0 44 00       	call   17efab0 <__stack_chk_fail@plt>

### direct calls
- 0x13a3962 -> 0x13a37f8: call   13a37f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8d7c>
- 0x13a3999 -> 0xa7b728: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
- 0x13a39cf -> 0xa7b728: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
- 0x13a39e7 -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- 0x13a39ec -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

## Callers of extractors
### 0x13a1922
- caller 0x123038c FDE=(19063258, 19073670)
     1230349:	00 
     123034a:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
     1230351:	00 00 
     1230353:	0f 57 c0             	xorps  xmm0,xmm0
     1230356:	0f 29 84 24 00 01 00 	movaps XMMWORD PTR [rsp+0x100],xmm0
     123035d:	00 
     123035e:	c6 84 24 d0 00 00 00 	mov    BYTE PTR [rsp+0xd0],0x0
     1230365:	00 
     1230366:	48 8b ad 20 08 00 00 	mov    rbp,QWORD PTR [rbp+0x820]
     123036d:	48 89 df             	mov    rdi,rbx
     1230370:	e8 c1 b4 84 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1230375:	4c 89 f7             	mov    rdi,r14
     1230378:	48 89 c6             	mov    rsi,rax
     123037b:	e8 a8 50 49 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     1230380:	48 89 ef             	mov    rdi,rbp
     1230383:	4c 89 f6             	mov    rsi,r14
     1230386:	4c 89 fa             	mov    rdx,r15
     1230389:	4c 89 e1             	mov    rcx,r12
     123038c:	e8 91 15 17 00       	call   13a1922 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6ea6>
     1230391:	89 c5                	mov    ebp,eax
     1230393:	4c 89 f7             	mov    rdi,r14
     1230396:	e8 93 4f 49 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     123039b:	40 84 ed             	test   bpl,bpl
     123039e:	74 14                	je     12303b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75938>
     12303a0:	48 8d 73 18          	lea    rsi,[rbx+0x18]
     12303a4:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     12303ab:	00 
     12303ac:	4c 89 fa             	mov    rdx,r15
     12303af:	e8 76 23 00 00       	call   123272a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77cae>
     12303b4:	4c 89 ff             	mov    rdi,r15
     12303b7:	e8 6c b3 84 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     12303bc:	48 81 c3 d0 02 00 00 	add    rbx,0x2d0
     12303c3:	4c 39 eb             	cmp    rbx,r13
     12303c6:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
     12303cb:	0f 85 79 ff ff ff    	jne    123034a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x758ce>
     12303d1:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     12303d8:	e8 a9 06 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     12303dd:	48 89 c3             	mov    rbx,rax
     12303e0:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     12303e7:	00 
     12303e8:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     12303ef:	00 
     12303f0:	e8 01 26 00 00       	call   12329f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77f7a>
     12303f5:	48 81 c3 c0 05 00 00 	add    rbx,0x5c0
     12303fc:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
     1230403:	00 
     1230404:	48 89 df             	mov    rdi,rbx
     1230407:	4c 89 f6             	mov    rsi,r14
- caller 0x1247c73 FDE=(19168200, 19168626)
     1247c29:	4d 39 ee             	cmp    r14,r13
     1247c2c:	74 7e                	je     1247cac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d230>
     1247c2e:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
     1247c33:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
     1247c38:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     1247c3e:	0f 57 c0             	xorps  xmm0,xmm0
     1247c41:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1247c46:	c6 44 24 0f 00       	mov    BYTE PTR [rsp+0xf],0x0
     1247c4b:	48 8b ab 20 08 00 00 	mov    rbp,QWORD PTR [rbx+0x820]
     1247c52:	4c 89 f7             	mov    rdi,r14
     1247c55:	e8 dc 3b 83 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1247c5a:	4c 89 ff             	mov    rdi,r15
     1247c5d:	48 89 c6             	mov    rsi,rax
     1247c60:	e8 c3 d7 47 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     1247c65:	48 89 ef             	mov    rdi,rbp
     1247c68:	4c 89 fe             	mov    rsi,r15
     1247c6b:	4c 89 e2             	mov    rdx,r12
     1247c6e:	48 8d 4c 24 0f       	lea    rcx,[rsp+0xf]
     1247c73:	e8 aa 9c 15 00       	call   13a1922 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6ea6>
     1247c78:	89 c5                	mov    ebp,eax
     1247c7a:	4c 89 ff             	mov    rdi,r15
     1247c7d:	e8 ac d6 47 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1247c82:	40 84 ed             	test   bpl,bpl
     1247c85:	74 11                	je     1247c98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d21c>
     1247c87:	49 8d 76 18          	lea    rsi,[r14+0x18]
     1247c8b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1247c90:	4c 89 e2             	mov    rdx,r12
     1247c93:	e8 92 aa fe ff       	call   123272a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77cae>
     1247c98:	4c 89 e7             	mov    rdi,r12
     1247c9b:	e8 88 3a 83 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1247ca0:	49 81 c6 d0 02 00 00 	add    r14,0x2d0
     1247ca7:	4d 39 ee             	cmp    r14,r13
     1247caa:	75 8c                	jne    1247c38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d1bc>
     1247cac:	48 8d bb 98 08 00 00 	lea    rdi,[rbx+0x898]
     1247cb3:	e8 ce 8d fe ff       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     1247cb8:	49 89 c6             	mov    r14,rax
     1247cbb:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     1247cc0:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     1247cc5:	e8 2c ad fe ff       	call   12329f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77f7a>
     1247cca:	49 81 c6 c0 05 00 00 	add    r14,0x5c0
     1247cd1:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
     1247cd6:	4c 89 f7             	mov    rdi,r14
     1247cd9:	4c 89 fe             	mov    rsi,r15
     1247cdc:	e8 43 b0 fe ff       	call   1232d24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x782a8>
     1247ce1:	4c 89 ff             	mov    rdi,r15
     1247ce4:	e8 1f 50 fe ff       	call   122cd08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7228c>
     1247ce9:	48 89 df             	mov    rdi,rbx
     1247cec:	be 00 20 00 00       	mov    esi,0x2000
- caller 0x13a1a80 FDE=(20585034, 20585231)
     13a1a3d:	48 89 df             	mov    rdi,rbx
     13a1a40:	e8 8b e2 6c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13a1a45:	e8 66 e0 44 00       	call   17efab0 <__stack_chk_fail@plt>
     13a1a4a:	41 56                	push   r14
     13a1a4c:	53                   	push   rbx
     13a1a4d:	48 83 ec 38          	sub    rsp,0x38
     13a1a51:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a1a58:	00 00 
     13a1a5a:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     13a1a5f:	83 7e 38 3f          	cmp    DWORD PTR [rsi+0x38],0x3f
     13a1a63:	75 47                	jne    13a1aac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7030>
     13a1a65:	48 89 cb             	mov    rbx,rcx
     13a1a68:	49 89 d6             	mov    r14,rdx
     13a1a6b:	0f 57 c0             	xorps  xmm0,xmm0
     13a1a6e:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     13a1a73:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     13a1a76:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     13a1a7b:	48 8d 4c 24 0f       	lea    rcx,[rsp+0xf]
     13a1a80:	e8 9d fe ff ff       	call   13a1922 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6ea6>
     13a1a85:	84 c0                	test   al,al
     13a1a87:	74 27                	je     13a1ab0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7034>
     13a1a89:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13a1a8e:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     13a1a93:	48 39 c8             	cmp    rax,rcx
     13a1a96:	74 18                	je     13a1ab0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7034>
     13a1a98:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     13a1a9b:	4c 39 f2             	cmp    rdx,r14
     13a1a9e:	7f 06                	jg     13a1aa6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e702a>
     13a1aa0:	4c 39 70 08          	cmp    QWORD PTR [rax+0x8],r14
     13a1aa4:	7f 30                	jg     13a1ad6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e705a>
     13a1aa6:	48 83 c0 10          	add    rax,0x10
     13a1aaa:	eb e7                	jmp    13a1a93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7017>
     13a1aac:	31 db                	xor    ebx,ebx
     13a1aae:	eb 0c                	jmp    13a1abc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e7040>
     13a1ab0:	31 db                	xor    ebx,ebx
     13a1ab2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a1ab7:	e8 6c 9c 6d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13a1abc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a1ac3:	00 00 
     13a1ac5:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     13a1aca:	75 3e                	jne    13a1b0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e708e>
     13a1acc:	89 d8                	mov    eax,ebx
     13a1ace:	48 83 c4 38          	add    rsp,0x38
     13a1ad2:	5b                   	pop    rbx
     13a1ad3:	41 5e                	pop    r14
     13a1ad5:	c3                   	ret
     13a1ad6:	48 89 13             	mov    QWORD PTR [rbx],rdx
     13a1ad9:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]

### 0x13a37f8
- caller 0x12304cd FDE=(19063258, 19073670)
     123048a:	00 
     123048b:	48 83 a4 24 e0 00 00 	and    QWORD PTR [rsp+0xe0],0x0
     1230492:	00 00 
     1230494:	0f 57 c0             	xorps  xmm0,xmm0
     1230497:	0f 29 84 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm0
     123049e:	00 
     123049f:	c6 84 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],0x0
     12304a6:	00 
     12304a7:	48 8b ad 28 08 00 00 	mov    rbp,QWORD PTR [rbp+0x828]
     12304ae:	48 89 df             	mov    rdi,rbx
     12304b1:	e8 80 b3 84 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     12304b6:	4c 89 f7             	mov    rdi,r14
     12304b9:	48 89 c6             	mov    rsi,rax
     12304bc:	e8 67 4f 49 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     12304c1:	48 89 ef             	mov    rdi,rbp
     12304c4:	4c 89 f6             	mov    rsi,r14
     12304c7:	4c 89 fa             	mov    rdx,r15
     12304ca:	4c 89 e1             	mov    rcx,r12
     12304cd:	e8 26 33 17 00       	call   13a37f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8d7c>
     12304d2:	89 c5                	mov    ebp,eax
     12304d4:	4c 89 f7             	mov    rdi,r14
     12304d7:	e8 52 4e 49 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     12304dc:	40 84 ed             	test   bpl,bpl
     12304df:	74 14                	je     12304f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75a79>
     12304e1:	48 8d 73 18          	lea    rsi,[rbx+0x18]
     12304e5:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     12304ec:	00 
     12304ed:	4c 89 fa             	mov    rdx,r15
     12304f0:	e8 35 22 00 00       	call   123272a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77cae>
     12304f5:	4c 89 ff             	mov    rdi,r15
     12304f8:	e8 2b b2 84 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     12304fd:	48 81 c3 d0 02 00 00 	add    rbx,0x2d0
     1230504:	4c 39 eb             	cmp    rbx,r13
     1230507:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
     123050c:	0f 85 79 ff ff ff    	jne    123048b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x75a0f>
     1230512:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     1230519:	e8 68 05 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     123051e:	48 89 c3             	mov    rbx,rax
     1230521:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1230528:	00 
     1230529:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1230530:	00 
     1230531:	e8 c0 24 00 00       	call   12329f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77f7a>
     1230536:	48 81 c3 e8 05 00 00 	add    rbx,0x5e8
     123053d:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
     1230544:	00 
     1230545:	48 89 df             	mov    rdi,rbx
     1230548:	4c 89 f6             	mov    rsi,r14
- caller 0x1247a95 FDE=(19167722, 19168148)
     1247a4b:	4d 39 ee             	cmp    r14,r13
     1247a4e:	74 7e                	je     1247ace <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d052>
     1247a50:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
     1247a55:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
     1247a5a:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     1247a60:	0f 57 c0             	xorps  xmm0,xmm0
     1247a63:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1247a68:	c6 44 24 0f 00       	mov    BYTE PTR [rsp+0xf],0x0
     1247a6d:	48 8b ab 28 08 00 00 	mov    rbp,QWORD PTR [rbx+0x828]
     1247a74:	4c 89 f7             	mov    rdi,r14
     1247a77:	e8 ba 3d 83 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1247a7c:	4c 89 ff             	mov    rdi,r15
     1247a7f:	48 89 c6             	mov    rsi,rax
     1247a82:	e8 a1 d9 47 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     1247a87:	48 89 ef             	mov    rdi,rbp
     1247a8a:	4c 89 fe             	mov    rsi,r15
     1247a8d:	4c 89 e2             	mov    rdx,r12
     1247a90:	48 8d 4c 24 0f       	lea    rcx,[rsp+0xf]
     1247a95:	e8 5e bd 15 00       	call   13a37f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8d7c>
     1247a9a:	89 c5                	mov    ebp,eax
     1247a9c:	4c 89 ff             	mov    rdi,r15
     1247a9f:	e8 8a d8 47 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1247aa4:	40 84 ed             	test   bpl,bpl
     1247aa7:	74 11                	je     1247aba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d03e>
     1247aa9:	49 8d 76 18          	lea    rsi,[r14+0x18]
     1247aad:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1247ab2:	4c 89 e2             	mov    rdx,r12
     1247ab5:	e8 70 ac fe ff       	call   123272a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77cae>
     1247aba:	4c 89 e7             	mov    rdi,r12
     1247abd:	e8 66 3c 83 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1247ac2:	49 81 c6 d0 02 00 00 	add    r14,0x2d0
     1247ac9:	4d 39 ee             	cmp    r14,r13
     1247acc:	75 8c                	jne    1247a5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cfde>
     1247ace:	48 8d bb 98 08 00 00 	lea    rdi,[rbx+0x898]
     1247ad5:	e8 ac 8f fe ff       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     1247ada:	49 89 c6             	mov    r14,rax
     1247add:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     1247ae2:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     1247ae7:	e8 0a af fe ff       	call   12329f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77f7a>
     1247aec:	49 81 c6 e8 05 00 00 	add    r14,0x5e8
     1247af3:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
     1247af8:	4c 89 f7             	mov    rdi,r14
     1247afb:	4c 89 fe             	mov    rsi,r15
     1247afe:	e8 21 b2 fe ff       	call   1232d24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x782a8>
     1247b03:	4c 89 ff             	mov    rdi,r15
     1247b06:	e8 fd 51 fe ff       	call   122cd08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7228c>
     1247b0b:	48 89 df             	mov    rdi,rbx
     1247b0e:	be 00 40 00 00       	mov    esi,0x4000
- caller 0x13a3962 FDE=(20592940, 20593137)
     13a3921:	e8 aa c3 6c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13a3926:	e8 85 c1 44 00       	call   17efab0 <__stack_chk_fail@plt>
     13a392b:	cc                   	int3
     13a392c:	41 56                	push   r14
     13a392e:	53                   	push   rbx
     13a392f:	48 83 ec 38          	sub    rsp,0x38
     13a3933:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a393a:	00 00 
     13a393c:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     13a3941:	83 7e 38 3f          	cmp    DWORD PTR [rsi+0x38],0x3f
     13a3945:	75 47                	jne    13a398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f12>
     13a3947:	48 89 cb             	mov    rbx,rcx
     13a394a:	49 89 d6             	mov    r14,rdx
     13a394d:	0f 57 c0             	xorps  xmm0,xmm0
     13a3950:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     13a3955:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     13a3958:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     13a395d:	48 8d 4c 24 0f       	lea    rcx,[rsp+0xf]
     13a3962:	e8 91 fe ff ff       	call   13a37f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8d7c>
     13a3967:	84 c0                	test   al,al
     13a3969:	74 27                	je     13a3992 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f16>
     13a396b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13a3970:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     13a3975:	48 39 c8             	cmp    rax,rcx
     13a3978:	74 18                	je     13a3992 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f16>
     13a397a:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     13a397d:	4c 39 f2             	cmp    rdx,r14
     13a3980:	7f 06                	jg     13a3988 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f0c>
     13a3982:	4c 39 70 08          	cmp    QWORD PTR [rax+0x8],r14
     13a3986:	7f 30                	jg     13a39b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f3c>
     13a3988:	48 83 c0 10          	add    rax,0x10
     13a398c:	eb e7                	jmp    13a3975 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8ef9>
     13a398e:	31 db                	xor    ebx,ebx
     13a3990:	eb 0c                	jmp    13a399e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f22>
     13a3992:	31 db                	xor    ebx,ebx
     13a3994:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     13a3999:	e8 8a 7d 6d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13a399e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a39a5:	00 00 
     13a39a7:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     13a39ac:	75 3e                	jne    13a39ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8f70>
     13a39ae:	89 d8                	mov    eax,ebx
     13a39b0:	48 83 c4 38          	add    rsp,0x38
     13a39b4:	5b                   	pop    rbx
     13a39b5:	41 5e                	pop    r14
     13a39b7:	c3                   	ret
     13a39b8:	48 89 13             	mov    QWORD PTR [rbx],rdx
     13a39bb:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]

## Nearby printable strings for candidate field/type 0x3f users
- 0x13a1944: cmp    DWORD PTR [rsi+0x38],0x3f
- 0x13a381a: cmp    DWORD PTR [rsi+0x38],0x3f
