# Ad object -> restriction-state producer trace

Known destination layout: owner+0x438 is the inner optional value, owner+0x470 its engagement byte.
Known ad-model address point: 0x1879950.

## Direct xrefs: ad object constructor 0x14e15e4
- count: 2

### 1. callsite 0x1439735 in 0x14396fc..0x143976e
     14396d6:	00 
     14396d7:	e8 52 bc 28 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     14396dc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14396e3:	00 00 
     14396e5:	48 3b 84 24 b0 04 00 	cmp    rax,QWORD PTR [rsp+0x4b0]
     14396ec:	00 
     14396ed:	75 08                	jne    14396f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ec7b>
     14396ef:	48 89 df             	mov    rdi,rbx
     14396f2:	e8 d9 65 63 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14396f7:	e8 b4 63 3b 00       	call   17efab0 <__stack_chk_fail@plt>
     14396fc:	41 57                	push   r15
     14396fe:	41 56                	push   r14
     1439700:	41 54                	push   r12
     1439702:	53                   	push   rbx
     1439703:	50                   	push   rax
     1439704:	49 89 f4             	mov    r12,rsi
     1439707:	49 89 fe             	mov    r14,rdi
     143970a:	bf d8 01 00 00       	mov    edi,0x1d8
     143970f:	e8 ec 47 3b 00       	call   17edf00 <_Znwm@plt>
     1439714:	48 89 c3             	mov    rbx,rax
     1439717:	0f 57 c0             	xorps  xmm0,xmm0
     143971a:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     143971e:	48 8d 05 43 3d 3c 00 	lea    rax,[rip+0x3c3d43]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     1439725:	48 89 03             	mov    QWORD PTR [rbx],rax
     1439728:	49 89 df             	mov    r15,rbx
     143972b:	49 83 c7 18          	add    r15,0x18
     143972f:	4c 89 ff             	mov    rdi,r15
     1439732:	4c 89 e6             	mov    rsi,r12
     1439735:	e8 aa 7e 0a 00       	call   14e15e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x326b68>
     143973a:	4d 89 3e             	mov    QWORD PTR [r14],r15
     143973d:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     1439741:	31 ff                	xor    edi,edi
     1439743:	48 83 c4 08          	add    rsp,0x8
     1439747:	5b                   	pop    rbx
     1439748:	41 5c                	pop    r12
     143974a:	41 5e                	pop    r14
     143974c:	41 5f                	pop    r15
     143974e:	e9 c9 4c 66 ff       	jmp    a9e41c <JNI_OnUnload@@Base+0x25ce9>
     1439753:	49 89 c6             	mov    r14,rax
     1439756:	48 89 df             	mov    rdi,rbx
     1439759:	e8 b2 48 3b 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     143975e:	48 89 df             	mov    rdi,rbx
     1439761:	e8 b6 4c 66 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     1439766:	4c 89 f7             	mov    rdi,r14
     1439769:	e8 62 65 63 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     143976e:	53                   	push   rbx
     143976f:	48 89 fb             	mov    rbx,rdi
     1439772:	48 83 c7 30          	add    rdi,0x30
     1439776:	e8 59 09 00 00       	call   143a0d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f658>
     143977b:	48 89 df             	mov    rdi,rbx
     143977e:	5b                   	pop    rbx
     143977f:	e9 0c 47 3b 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1439784:	53                   	push   rbx
     1439785:	48 89 fb             	mov    rbx,rdi
     1439788:	48 83 c7 08          	add    rdi,0x8
     143978c:	e8 f5 08 00 00       	call   143a086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f60a>
     1439791:	83 a3 78 01 00 00 00 	and    DWORD PTR [rbx+0x178],0x0
     1439798:	5b                   	pop    rbx
     1439799:	c3                   	ret
     143979a:	41 56                	push   r14
     143979c:	53                   	push   rbx
     143979d:	48 83 ec 18          	sub    rsp,0x18
     14397a1:	49 89 f6             	mov    r14,rsi
     14397a4:	48 89 fb             	mov    rbx,rdi
     14397a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14397ae:	00 00 
     14397b0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     14397b5:	c6 07 00             	mov    BYTE PTR [rdi],0x0
     14397b8:	83 8f 70 01 00 00 ff 	or     DWORD PTR [rdi+0x170],0xffffffff
     14397bf:	e8 8e a1 f1 ff       	call   1353952 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198ed6>
     14397c4:	41 8b 86 70 01 00 00 	mov    eax,DWORD PTR [r14+0x170]

### 2. callsite 0x1509b85 in 0x15098f8..0x150b628
     1509b0f:	48 8d 15 c2 07 e5 fe 	lea    rdx,[rip+0xfffffffffee507c2]        # 35a2d8 <_ZTSSt12bad_any_cast@@Base-0x35ef0>
     1509b16:	31 c9                	xor    ecx,ecx
     1509b18:	e8 75 ae 2b 00       	call   17c4992 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178afe>
     1509b1d:	48 89 ef             	mov    rdi,rbp
     1509b20:	48 89 c6             	mov    rsi,rax
     1509b23:	e8 6c 8c 90 ff       	call   e12794 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdf81a>
     1509b28:	48 89 ef             	mov    rdi,rbp
     1509b2b:	40 8a ac 24 60 01 00 	mov    bpl,BYTE PTR [rsp+0x160]
     1509b32:	00 
     1509b33:	40 84 ed             	test   bpl,bpl
     1509b36:	4c 89 74 24 58       	mov    QWORD PTR [rsp+0x58],r14
     1509b3b:	0f 84 81 00 00 00    	je     1509bc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f146>
     1509b41:	48 8d 35 34 84 f4 fe 	lea    rsi,[rip+0xfffffffffef48434]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1509b48:	e8 f5 9b 2b 00       	call   17c3742 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1778ae>
     1509b4d:	48 89 c3             	mov    rbx,rax
     1509b50:	bf d8 01 00 00       	mov    edi,0x1d8
     1509b55:	e8 a6 43 2e 00       	call   17edf00 <_Znwm@plt>
     1509b5a:	49 89 c6             	mov    r14,rax
     1509b5d:	66 0f ef c0          	pxor   xmm0,xmm0
     1509b61:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     1509b66:	48 8d 05 fb 38 2f 00 	lea    rax,[rip+0x2f38fb]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     1509b6d:	49 89 06             	mov    QWORD PTR [r14],rax
     1509b70:	4c 89 e7             	mov    rdi,r12
     1509b73:	48 89 de             	mov    rsi,rbx
     1509b76:	e8 03 ff 56 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1509b7b:	49 8d 5e 18          	lea    rbx,[r14+0x18]
     1509b7f:	48 89 df             	mov    rdi,rbx
     1509b82:	4c 89 e6             	mov    rsi,r12
     1509b85:	e8 5a 7a fd ff       	call   14e15e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x326b68>
     1509b8a:	4c 89 e7             	mov    rdi,r12
     1509b8d:	e8 fe 42 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1509b92:	66 49 0f 6e c6       	movq   xmm0,r14
     1509b97:	66 48 0f 6e cb       	movq   xmm1,rbx
     1509b9c:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     1509ba0:	66 0f 7f 4c 24 30    	movdqa XMMWORD PTR [rsp+0x30],xmm1
     1509ba6:	31 c0                	xor    eax,eax
     1509ba8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1509bad:	31 ff                	xor    edi,edi
     1509baf:	e8 68 48 59 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     1509bb4:	31 ff                	xor    edi,edi
     1509bb6:	e8 cb 48 59 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1509bbb:	4c 8b 74 24 58       	mov    r14,QWORD PTR [rsp+0x58]
     1509bc0:	eb 18                	jmp    1509bda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f15e>
     1509bc2:	66 0f ef c0          	pxor   xmm0,xmm0
     1509bc6:	66 0f 7f 44 24 30    	movdqa XMMWORD PTR [rsp+0x30],xmm0
     1509bcc:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     1509bd2:	6a 34                	push   0x34
     1509bd4:	58                   	pop    rax
     1509bd5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1509bda:	31 ff                	xor    edi,edi
     1509bdc:	e8 a5 48 59 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1509be1:	48 8d 9c 24 60 01 00 	lea    rbx,[rsp+0x160]
     1509be8:	00 
     1509be9:	48 89 df             	mov    rdi,rbx
     1509bec:	e8 33 98 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     1509bf1:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     1509bf7:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     1509bfe:	40 84 ed             	test   bpl,bpl
     1509c01:	0f 84 eb 08 00 00    	je     150a4f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fa76>
     1509c07:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
     1509c0c:	48 89 df             	mov    rdi,rbx
     1509c0f:	e8 25 89 19 00       	call   16a2539 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x566a5>
     1509c14:	4d 89 f7             	mov    r15,r14
     1509c17:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     1509c1d:	66 49 0f 7e c6       	movq   r14,xmm0
     1509c22:	49 8d be 28 01 00 00 	lea    rdi,[r14+0x128]
     1509c29:	48 89 de             	mov    rsi,rbx
     1509c2c:	e8 fd 1d 57 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1509c31:	48 89 df             	mov    rdi,rbx
     1509c34:	e8 57 42 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1509c39:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]

## Direct xrefs: payload copy ctor 0x108d88c
- count: 5

### 1. callsite 0x108d766 in 0x108d704..0x108d7e4
     108d705:	41 57                	push   r15
     108d707:	41 56                	push   r14
     108d709:	41 55                	push   r13
     108d70b:	41 54                	push   r12
     108d70d:	53                   	push   rbx
     108d70e:	48 83 ec 38          	sub    rsp,0x38
     108d712:	49 89 d6             	mov    r14,rdx
     108d715:	48 89 fb             	mov    rbx,rdi
     108d718:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108d71f:	00 00 
     108d721:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     108d726:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]
     108d72a:	48 8d 47 10          	lea    rax,[rdi+0x10]
     108d72e:	48 8d 4c 24 08       	lea    rcx,[rsp+0x8]
     108d733:	4c 89 29             	mov    QWORD PTR [rcx],r13
     108d736:	48 89 e2             	mov    rdx,rsp
     108d739:	4c 89 2a             	mov    QWORD PTR [rdx],r13
     108d73c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     108d741:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
     108d746:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     108d74b:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
     108d750:	4c 39 f6             	cmp    rsi,r14
     108d753:	74 2d                	je     108d782 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b98>
     108d755:	49 89 f7             	mov    r15,rsi
     108d758:	bd 50 05 00 00       	mov    ebp,0x550
     108d75d:	4d 89 ec             	mov    r12,r13
     108d760:	4c 89 e7             	mov    rdi,r12
     108d763:	4c 89 fe             	mov    rsi,r15
     108d766:	e8 21 01 00 00       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     108d76b:	49 01 ef             	add    r15,rbp
     108d76e:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
     108d773:	49 01 ec             	add    r12,rbp
     108d776:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
     108d77b:	4d 39 f7             	cmp    r15,r14
     108d77e:	75 e0                	jne    108d760 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b76>
     108d780:	eb 03                	jmp    108d785 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b9b>
     108d782:	4d 89 ec             	mov    r12,r13
     108d785:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     108d78a:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
     108d78e:	e8 9b 02 00 00       	call   108da2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e44>
     108d793:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
     108d797:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108d79e:	00 00 
     108d7a0:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     108d7a5:	75 38                	jne    108d7df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254bf5>
     108d7a7:	48 83 c4 38          	add    rsp,0x38
     108d7ab:	5b                   	pop    rbx
     108d7ac:	41 5c                	pop    r12
     108d7ae:	41 5d                	pop    r13
     108d7b0:	41 5e                	pop    r14
     108d7b2:	41 5f                	pop    r15
     108d7b4:	5d                   	pop    rbp
     108d7b5:	c3                   	ret
     108d7b6:	49 89 c6             	mov    r14,rax
     108d7b9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     108d7be:	e8 6b 02 00 00       	call   108da2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e44>
     108d7c3:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
     108d7c7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108d7ce:	00 00 
     108d7d0:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     108d7d5:	75 08                	jne    108d7df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254bf5>
     108d7d7:	4c 89 f7             	mov    rdi,r14
     108d7da:	e8 f1 24 9e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     108d7df:	e8 cc 22 76 00       	call   17efab0 <__stack_chk_fail@plt>
     108d7e4:	48 89 f0             	mov    rax,rsi
     108d7e7:	48 be 30 30 30 30 30 	movabs rsi,0x30303030303030
     108d7ee:	30 30 00 
     108d7f1:	48 39 f2             	cmp    rdx,rsi
     108d7f4:	77 30                	ja     108d826 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254c3c>
     108d7f6:	48 89 d1             	mov    rcx,rdx
     108d7f9:	48 29 f8             	sub    rax,rdi

### 2. callsite 0x108dc58 in 0x108dc54..0x108dc66
     108dc01:	84 c0                	test   al,al
     108dc03:	74 07                	je     108dc0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255022>
     108dc05:	e8 34 00 00 00       	call   108dc3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255054>
     108dc0a:	eb 08                	jmp    108dc14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25502a>
     108dc0c:	4c 01 f6             	add    rsi,r14
     108dc0f:	e8 86 fe ff ff       	call   108da9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254eb0>
     108dc14:	be 30 04 00 00       	mov    esi,0x430
     108dc19:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dc1d:	4c 01 f6             	add    rsi,r14
     108dc20:	e8 bb f6 ff ff       	call   108d2e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2546f6>
     108dc25:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108dc2c:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108dc33:	48 89 d8             	mov    rax,rbx
     108dc36:	48 83 c4 08          	add    rsp,0x8
     108dc3a:	5b                   	pop    rbx
     108dc3b:	41 5e                	pop    r14
     108dc3d:	c3                   	ret
     108dc3e:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
     108dc42:	74 0e                	je     108dc52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255068>
     108dc44:	53                   	push   rbx
     108dc45:	48 89 fb             	mov    rbx,rdi
     108dc48:	e8 f1 86 fc ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     108dc4d:	c6 43 38 00          	mov    BYTE PTR [rbx+0x38],0x0
     108dc51:	5b                   	pop    rbx
     108dc52:	c3                   	ret
     108dc53:	cc                   	int3
     108dc54:	53                   	push   rbx
     108dc55:	48 89 fb             	mov    rbx,rdi
     108dc58:	e8 2f fc ff ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     108dc5d:	c6 83 50 05 00 00 01 	mov    BYTE PTR [rbx+0x550],0x1
     108dc64:	5b                   	pop    rbx
     108dc65:	c3                   	ret
     108dc66:	31 c0                	xor    eax,eax
     108dc68:	88 07                	mov    BYTE PTR [rdi],al
     108dc6a:	88 87 50 05 00 00    	mov    BYTE PTR [rdi+0x550],al
     108dc70:	38 86 50 05 00 00    	cmp    BYTE PTR [rsi+0x550],al
     108dc76:	0f 85 46 00 00 00    	jne    108dcc2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2550d8>
     108dc7c:	c3                   	ret
     108dc7d:	cc                   	int3
     108dc7e:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     108dc82:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     108dc86:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     108dc89:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     108dc8c:	0f 57 c0             	xorps  xmm0,xmm0
     108dc8f:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     108dc94:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
     108dc97:	48 83 67 28 00       	and    QWORD PTR [rdi+0x28],0x0
     108dc9c:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
     108dca0:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
     108dca4:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
     108dca8:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
     108dcac:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
     108dcb0:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
     108dcb4:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     108dcb8:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
     108dcbc:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
     108dcc1:	c3                   	ret
     108dcc2:	53                   	push   rbx
     108dcc3:	48 89 fb             	mov    rbx,rdi
     108dcc6:	e8 09 00 00 00       	call   108dcd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2550ea>
     108dccb:	c6 83 50 05 00 00 01 	mov    BYTE PTR [rbx+0x550],0x1
     108dcd2:	5b                   	pop    rbx
     108dcd3:	c3                   	ret
     108dcd4:	41 56                	push   r14
     108dcd6:	53                   	push   rbx
     108dcd7:	50                   	push   rax
     108dcd8:	49 89 f6             	mov    r14,rsi
     108dcdb:	48 89 fb             	mov    rbx,rdi
     108dcde:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     108dce2:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     108dce6:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]

### 3. callsite 0x10aa5bc in 0x10aa59e..0x10aa5dc
     10aa560:	48 69 ca b0 06 00 00 	imul   rcx,rdx,0x6b0
     10aa567:	48 01 c1             	add    rcx,rax
     10aa56a:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
     10aa56e:	5b                   	pop    rbx
     10aa56f:	c3                   	ret
     10aa570:	e8 4b a0 95 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     10aa575:	53                   	push   rbx
     10aa576:	48 b8 7f 21 56 94 c6 	movabs rax,0x2647c69456217f
     10aa57d:	47 26 00 
     10aa580:	48 39 c7             	cmp    rdi,rax
     10aa583:	73 14                	jae    10aa599 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2719af>
     10aa585:	48 89 fb             	mov    rbx,rdi
     10aa588:	48 69 ff b0 06 00 00 	imul   rdi,rdi,0x6b0
     10aa58f:	e8 6c 39 74 00       	call   17edf00 <_Znwm@plt>
     10aa594:	48 89 da             	mov    rdx,rbx
     10aa597:	5b                   	pop    rbx
     10aa598:	c3                   	ret
     10aa599:	e8 41 11 9d ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
     10aa59e:	41 56                	push   r14
     10aa5a0:	53                   	push   rbx
     10aa5a1:	50                   	push   rax
     10aa5a2:	49 89 f6             	mov    r14,rsi
     10aa5a5:	48 89 fb             	mov    rbx,rdi
     10aa5a8:	e8 67 00 00 00       	call   10aa614 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271a2a>
     10aa5ad:	b8 60 01 00 00       	mov    eax,0x160
     10aa5b2:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
     10aa5b6:	49 01 c6             	add    r14,rax
     10aa5b9:	4c 89 f6             	mov    rsi,r14
     10aa5bc:	e8 cb 32 fe ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     10aa5c1:	48 83 c4 08          	add    rsp,0x8
     10aa5c5:	5b                   	pop    rbx
     10aa5c6:	41 5e                	pop    r14
     10aa5c8:	c3                   	ret
     10aa5c9:	49 89 c6             	mov    r14,rax
     10aa5cc:	48 89 df             	mov    rdi,rbx
     10aa5cf:	e8 1a f8 ff ff       	call   10a9dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271204>
     10aa5d4:	4c 89 f7             	mov    rdi,r14
     10aa5d7:	e8 f4 56 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     10aa5dc:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
     10aa5e0:	74 01                	je     10aa5e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2719f9>
     10aa5e2:	c3                   	ret
     10aa5e3:	41 56                	push   r14
     10aa5e5:	53                   	push   rbx
     10aa5e6:	50                   	push   rax
     10aa5e7:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     10aa5eb:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     10aa5ef:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
     10aa5f2:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     10aa5f5:	4c 39 f3             	cmp    rbx,r14
     10aa5f8:	74 11                	je     10aa60b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271a21>
     10aa5fa:	48 81 c3 50 f9 ff ff 	add    rbx,0xfffffffffffff950
     10aa601:	48 89 df             	mov    rdi,rbx
     10aa604:	e8 2f f8 ff ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     10aa609:	eb ea                	jmp    10aa5f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271a0b>
     10aa60b:	48 83 c4 08          	add    rsp,0x8
     10aa60f:	5b                   	pop    rbx
     10aa610:	41 5e                	pop    r14
     10aa612:	c3                   	ret
     10aa613:	cc                   	int3
     10aa614:	55                   	push   rbp
     10aa615:	41 57                	push   r15
     10aa617:	41 56                	push   r14
     10aa619:	41 55                	push   r13
     10aa61b:	41 54                	push   r12
     10aa61d:	53                   	push   rbx
     10aa61e:	50                   	push   rax
     10aa61f:	49 89 f5             	mov    r13,rsi
     10aa622:	48 89 fb             	mov    rbx,rdi
     10aa625:	e8 16 39 74 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     10aa62a:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     10aa62e:	49 8d 75 18          	lea    rsi,[r13+0x18]

### 4. callsite 0x122171c in 0x1220554..0x1222300
     12216a6:	4c 89 f7             	mov    rdi,r14
     12216a9:	e8 b8 b0 8a ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     12216ae:	48 8d bc 24 30 1c 00 	lea    rdi,[rsp+0x1c30]
     12216b5:	00 
     12216b6:	83 67 f8 00          	and    DWORD PTR [rdi-0x8],0x0
     12216ba:	48 8d b5 80 05 00 00 	lea    rsi,[rbp+0x580]
     12216c1:	4c 89 ea             	mov    rdx,r13
     12216c4:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     12216c9:	48 89 d9             	mov    rcx,rbx
     12216cc:	e8 ed 91 02 00       	call   124a8be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fe42>
     12216d1:	48 8d bc 24 48 1c 00 	lea    rdi,[rsp+0x1c48]
     12216d8:	00 
     12216d9:	48 8d b5 98 05 00 00 	lea    rsi,[rbp+0x598]
     12216e0:	4c 89 ea             	mov    rdx,r13
     12216e3:	48 89 d9             	mov    rcx,rbx
     12216e6:	e8 d3 91 02 00       	call   124a8be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fe42>
     12216eb:	80 bd 60 05 00 00 00 	cmp    BYTE PTR [rbp+0x560],0x0
     12216f2:	74 57                	je     122174b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66ccf>
     12216f4:	4c 89 ef             	mov    rdi,r13
     12216f7:	e8 f2 8d e6 ff       	call   108a4ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251904>
     12216fc:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1221703:	00 
     1221704:	4c 89 ee             	mov    rsi,r13
     1221707:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     122170c:	e8 25 97 02 00       	call   124ae36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x903ba>
     1221711:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     1221718:	00 
     1221719:	4c 89 ee             	mov    rsi,r13
     122171c:	e8 6b c1 e6 ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     1221721:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
     1221728:	00 
     1221729:	48 8d bc 24 60 1c 00 	lea    rdi,[rsp+0x1c60]
     1221730:	00 
     1221731:	48 89 de             	mov    rsi,rbx
     1221734:	e8 93 29 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221739:	c6 84 24 10 23 00 00 	mov    BYTE PTR [rsp+0x2310],0x1
     1221740:	01 
     1221741:	48 89 df             	mov    rdi,rbx
     1221744:	e8 ef 86 e8 ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     1221749:	eb 10                	jmp    122175b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66cdf>
     122174b:	31 c0                	xor    eax,eax
     122174d:	88 84 24 60 1c 00 00 	mov    BYTE PTR [rsp+0x1c60],al
     1221754:	88 84 24 10 23 00 00 	mov    BYTE PTR [rsp+0x2310],al
     122175b:	48 83 a4 24 28 23 00 	and    QWORD PTR [rsp+0x2328],0x0
     1221762:	00 00 
     1221764:	66 0f ef c0          	pxor   xmm0,xmm0
     1221768:	f3 0f 7f 84 24 18 23 	movdqu XMMWORD PTR [rsp+0x2318],xmm0
     122176f:	00 00 
     1221771:	48 8b 8d 70 05 00 00 	mov    rcx,QWORD PTR [rbp+0x570]
     1221778:	48 8b b5 68 05 00 00 	mov    rsi,QWORD PTR [rbp+0x568]
     122177f:	48 89 c8             	mov    rax,rcx
     1221782:	48 29 f0             	sub    rax,rsi
     1221785:	bf 50 05 00 00       	mov    edi,0x550
     122178a:	48 99                	cqo
     122178c:	48 f7 ff             	idiv   rdi
     122178f:	48 39 f1             	cmp    rcx,rsi
     1221792:	0f 84 ec 01 00 00    	je     1221984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f08>
     1221798:	48 b9 7f 21 56 94 c6 	movabs rcx,0x2647c69456217f
     122179f:	47 26 00 
     12217a2:	48 39 c8             	cmp    rax,rcx
     12217a5:	0f 83 30 08 00 00    	jae    1221fdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6755f>
     12217ab:	48 8d 8c 24 28 23 00 	lea    rcx,[rsp+0x2328]
     12217b2:	00 
     12217b3:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
     12217ba:	00 
     12217bb:	48 89 c7             	mov    rdi,rax
     12217be:	e8 b2 8d e8 ff       	call   10aa575 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27198b>
     12217c3:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
     12217c8:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
     12217cf:	00 
     12217d0:	48 89 03             	mov    QWORD PTR [rbx],rax

### 5. callsite 0x122186d in 0x1220554..0x1222300
     12217f9:	48 89 df             	mov    rdi,rbx
     12217fc:	e8 1f 99 02 00       	call   124b120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906a4>
     1221801:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     1221808:	49 8b ae 70 05 00 00 	mov    rbp,QWORD PTR [r14+0x570]
     122180f:	49 39 ed             	cmp    r13,rbp
     1221812:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     1221817:	0f 84 67 01 00 00    	je     1221984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f08>
     122181d:	4c 8d bc 24 20 01 00 	lea    r15,[rsp+0x120]
     1221824:	00 
     1221825:	41 be b0 06 00 00    	mov    r14d,0x6b0
     122182b:	4c 8d a4 24 30 13 00 	lea    r12,[rsp+0x1330]
     1221832:	00 
     1221833:	4c 89 ff             	mov    rdi,r15
     1221836:	4c 89 ee             	mov    rsi,r13
     1221839:	e8 20 20 00 00       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     122183e:	48 89 df             	mov    rdi,rbx
     1221841:	4c 89 fe             	mov    rsi,r15
     1221844:	e8 48 8c 02 00       	call   124a491 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fa15>
     1221849:	48 89 c3             	mov    rbx,rax
     122184c:	4c 89 ff             	mov    rdi,r15
     122184f:	e8 3c c6 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1221854:	4c 89 ff             	mov    rdi,r15
     1221857:	4c 89 ee             	mov    rsi,r13
     122185a:	48 89 da             	mov    rdx,rbx
     122185d:	e8 d4 95 02 00       	call   124ae36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x903ba>
     1221862:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     1221869:	00 
     122186a:	4c 89 ee             	mov    rsi,r13
     122186d:	e8 1a c0 e6 ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     1221872:	48 8b 9c 24 20 23 00 	mov    rbx,QWORD PTR [rsp+0x2320]
     1221879:	00 
     122187a:	48 8b b4 24 28 23 00 	mov    rsi,QWORD PTR [rsp+0x2328]
     1221881:	00 
     1221882:	48 39 f3             	cmp    rbx,rsi
     1221885:	73 17                	jae    122189e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e22>
     1221887:	48 89 df             	mov    rdi,rbx
     122188a:	4c 89 fe             	mov    rsi,r15
     122188d:	e8 3a 28 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221892:	48 81 c3 b0 06 00 00 	add    rbx,0x6b0
     1221899:	e9 c1 00 00 00       	jmp    122195f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66ee3>
     122189e:	48 8b bc 24 18 23 00 	mov    rdi,QWORD PTR [rsp+0x2318]
     12218a5:	00 
     12218a6:	48 29 fb             	sub    rbx,rdi
     12218a9:	48 89 d8             	mov    rax,rbx
     12218ac:	48 99                	cqo
     12218ae:	49 f7 fe             	idiv   r14
     12218b1:	48 8d 50 01          	lea    rdx,[rax+0x1]
     12218b5:	e8 3c 8c e8 ff       	call   10aa4f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27190c>
     12218ba:	48 89 c7             	mov    rdi,rax
     12218bd:	48 8b 84 24 20 23 00 	mov    rax,QWORD PTR [rsp+0x2320]
     12218c4:	00 
     12218c5:	48 2b 84 24 18 23 00 	sub    rax,QWORD PTR [rsp+0x2318]
     12218cc:	00 
     12218cd:	48 99                	cqo
     12218cf:	49 f7 fe             	idiv   r14
     12218d2:	48 89 c3             	mov    rbx,rax
     12218d5:	48 8d 84 24 28 23 00 	lea    rax,[rsp+0x2328]
     12218dc:	00 
     12218dd:	48 89 84 24 50 13 00 	mov    QWORD PTR [rsp+0x1350],rax
     12218e4:	00 
     12218e5:	48 85 ff             	test   rdi,rdi
     12218e8:	74 07                	je     12218f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e75>
     12218ea:	e8 86 8c e8 ff       	call   10aa575 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27198b>
     12218ef:	eb 04                	jmp    12218f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e79>
     12218f1:	31 c0                	xor    eax,eax
     12218f3:	31 d2                	xor    edx,edx
     12218f5:	48 89 84 24 30 13 00 	mov    QWORD PTR [rsp+0x1330],rax
     12218fc:	00 
     12218fd:	48 69 db b0 06 00 00 	imul   rbx,rbx,0x6b0
     1221904:	48 01 c3             	add    rbx,rax
     1221907:	48 89 9c 24 40 13 00 	mov    QWORD PTR [rsp+0x1340],rbx

## Direct xrefs: payload assign 0x108daf0
- count: 3

### 1. callsite 0x1089fe7 in 0x1089f9e..0x108a477
     1089f8f:	0f 11 83 28 06 00 00 	movups XMMWORD PTR [rbx+0x628],xmm0
     1089f96:	48 83 c4 08          	add    rsp,0x8
     1089f9a:	5b                   	pop    rbx
     1089f9b:	41 5e                	pop    r14
     1089f9d:	c3                   	ret
     1089f9e:	55                   	push   rbp
     1089f9f:	41 57                	push   r15
     1089fa1:	41 56                	push   r14
     1089fa3:	41 55                	push   r13
     1089fa5:	41 54                	push   r12
     1089fa7:	53                   	push   rbx
     1089fa8:	48 83 ec 38          	sub    rsp,0x38
     1089fac:	49 89 f6             	mov    r14,rsi
     1089faf:	48 89 fb             	mov    rbx,rdi
     1089fb2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1089fb9:	00 00 
     1089fbb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1089fc0:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
     1089fc3:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     1089fc6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1089fc9:	48 89 07             	mov    QWORD PTR [rdi],rax
     1089fcc:	48 83 c7 10          	add    rdi,0x10
     1089fd0:	48 83 c6 10          	add    rsi,0x10
     1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
     1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
     108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
     108a027:	4c 89 e0             	mov    rax,r12
     108a02a:	4c 29 e8             	sub    rax,r13
     108a02d:	bf 50 05 00 00       	mov    edi,0x550
     108a032:	48 99                	cqo
     108a034:	48 f7 ff             	idiv   rdi
     108a037:	48 89 c5             	mov    rbp,rax
     108a03a:	48 8b 8b 68 05 00 00 	mov    rcx,QWORD PTR [rbx+0x568]
     108a041:	48 8b b3 78 05 00 00 	mov    rsi,QWORD PTR [rbx+0x578]
     108a048:	48 89 f0             	mov    rax,rsi
     108a04b:	48 29 c8             	sub    rax,rcx
     108a04e:	48 99                	cqo
     108a050:	48 f7 ff             	idiv   rdi
     108a053:	48 39 e8             	cmp    rax,rbp
     108a056:	73 48                	jae    108a0a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2514b6>
     108a058:	48 85 c9             	test   rcx,rcx
     108a05b:	74 1e                	je     108a07b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251491>
     108a05d:	4c 89 ff             	mov    rdi,r15
     108a060:	e8 45 fc ff ff       	call   1089caa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c0>
     108a065:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     108a068:	e8 b3 3e 76 00       	call   17edf20 <_ZdlPv@plt>
     108a06d:	0f 57 c0             	xorps  xmm0,xmm0
     108a070:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     108a074:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     108a079:	31 f6                	xor    esi,esi
     108a07b:	31 ff                	xor    edi,edi
     108a07d:	48 89 ea             	mov    rdx,rbp
     108a080:	e8 5f 37 00 00       	call   108d7e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254bfa>
     108a085:	4c 89 ff             	mov    rdi,r15
     108a088:	48 89 c6             	mov    rsi,rax

### 2. callsite 0x108d6e4 in 0x108d6c2..0x108d703
     108d68d:	e8 ee 09 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     108d692:	be 90 00 00 00       	mov    esi,0x90
     108d697:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108d69b:	4c 01 f6             	add    rsi,r14
     108d69e:	e8 dd 09 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     108d6a3:	b8 a8 00 00 00       	mov    eax,0xa8
     108d6a8:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
     108d6ac:	49 01 c6             	add    r14,rax
     108d6af:	4c 89 f6             	mov    rsi,r14
     108d6b2:	e8 c9 09 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     108d6b7:	48 89 d8             	mov    rax,rbx
     108d6ba:	48 83 c4 08          	add    rsp,0x8
     108d6be:	5b                   	pop    rbx
     108d6bf:	41 5e                	pop    r14
     108d6c1:	c3                   	ret
     108d6c2:	41 57                	push   r15
     108d6c4:	41 56                	push   r14
     108d6c6:	41 54                	push   r12
     108d6c8:	53                   	push   rbx
     108d6c9:	50                   	push   rax
     108d6ca:	48 89 d3             	mov    rbx,rdx
     108d6cd:	48 39 f7             	cmp    rdi,rsi
     108d6d0:	74 22                	je     108d6f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b0a>
     108d6d2:	49 89 f6             	mov    r14,rsi
     108d6d5:	49 89 ff             	mov    r15,rdi
     108d6d8:	41 bc 50 05 00 00    	mov    r12d,0x550
     108d6de:	48 89 df             	mov    rdi,rbx
     108d6e1:	4c 89 fe             	mov    rsi,r15
     108d6e4:	e8 07 04 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     108d6e9:	4d 01 e7             	add    r15,r12
     108d6ec:	4c 01 e3             	add    rbx,r12
     108d6ef:	4d 39 f7             	cmp    r15,r14
     108d6f2:	75 ea                	jne    108d6de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254af4>
     108d6f4:	48 89 d8             	mov    rax,rbx
     108d6f7:	48 83 c4 08          	add    rsp,0x8
     108d6fb:	5b                   	pop    rbx
     108d6fc:	41 5c                	pop    r12
     108d6fe:	41 5e                	pop    r14
     108d700:	41 5f                	pop    r15
     108d702:	c3                   	ret
     108d703:	cc                   	int3
     108d704:	55                   	push   rbp
     108d705:	41 57                	push   r15
     108d707:	41 56                	push   r14
     108d709:	41 55                	push   r13
     108d70b:	41 54                	push   r12
     108d70d:	53                   	push   rbx
     108d70e:	48 83 ec 38          	sub    rsp,0x38
     108d712:	49 89 d6             	mov    r14,rdx
     108d715:	48 89 fb             	mov    rbx,rdi
     108d718:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108d71f:	00 00 
     108d721:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     108d726:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]
     108d72a:	48 8d 47 10          	lea    rax,[rdi+0x10]
     108d72e:	48 8d 4c 24 08       	lea    rcx,[rsp+0x8]
     108d733:	4c 89 29             	mov    QWORD PTR [rcx],r13
     108d736:	48 89 e2             	mov    rdx,rsp
     108d739:	4c 89 2a             	mov    QWORD PTR [rdx],r13
     108d73c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     108d741:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
     108d746:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     108d74b:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
     108d750:	4c 39 f6             	cmp    rsi,r14
     108d753:	74 2d                	je     108d782 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b98>
     108d755:	49 89 f7             	mov    r15,rsi
     108d758:	bd 50 05 00 00       	mov    ebp,0x550
     108d75d:	4d 89 ec             	mov    r12,r13
     108d760:	4c 89 e7             	mov    rdi,r12
     108d763:	4c 89 fe             	mov    rsi,r15
     108d766:	e8 21 01 00 00       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>

### 3. callsite 0x10aa728 in 0x10aa70a..0x10aa738
     10aa6cd:	eb 03                	jmp    10aa6d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271ae8>
     10aa6cf:	49 89 c5             	mov    r13,rax
     10aa6d2:	4c 89 e7             	mov    rdi,r12
     10aa6d5:	e8 b6 37 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10aa6da:	eb 03                	jmp    10aa6df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271af5>
     10aa6dc:	49 89 c5             	mov    r13,rax
     10aa6df:	4c 89 ff             	mov    rdi,r15
     10aa6e2:	e8 a9 37 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10aa6e7:	eb 03                	jmp    10aa6ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b02>
     10aa6e9:	49 89 c5             	mov    r13,rax
     10aa6ec:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     10aa6f0:	e8 9b 37 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10aa6f5:	48 89 df             	mov    rdi,rbx
     10aa6f8:	e8 93 37 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10aa6fd:	4c 89 ef             	mov    rdi,r13
     10aa700:	e8 cb 55 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     10aa705:	49 89 c5             	mov    r13,rax
     10aa708:	eb eb                	jmp    10aa6f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b0b>
     10aa70a:	41 56                	push   r14
     10aa70c:	53                   	push   rbx
     10aa70d:	50                   	push   rax
     10aa70e:	48 89 f3             	mov    rbx,rsi
     10aa711:	49 89 fe             	mov    r14,rdi
     10aa714:	e8 1f 00 00 00       	call   10aa738 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b4e>
     10aa719:	b8 60 01 00 00       	mov    eax,0x160
     10aa71e:	49 8d 3c 06          	lea    rdi,[r14+rax*1]
     10aa722:	48 01 c3             	add    rbx,rax
     10aa725:	48 89 de             	mov    rsi,rbx
     10aa728:	e8 c3 33 fe ff       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     10aa72d:	4c 89 f0             	mov    rax,r14
     10aa730:	48 83 c4 08          	add    rsp,0x8
     10aa734:	5b                   	pop    rbx
     10aa735:	41 5e                	pop    r14
     10aa737:	c3                   	ret
     10aa738:	41 56                	push   r14
     10aa73a:	53                   	push   rbx
     10aa73b:	50                   	push   rax
     10aa73c:	49 89 f6             	mov    r14,rsi
     10aa73f:	48 89 fb             	mov    rbx,rdi
     10aa742:	e8 39 39 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa747:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     10aa74b:	49 8d 76 18          	lea    rsi,[r14+0x18]
     10aa74f:	e8 2c 39 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa754:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     10aa758:	49 8d 76 30          	lea    rsi,[r14+0x30]
     10aa75c:	e8 1f 39 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa761:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     10aa765:	49 8d 76 48          	lea    rsi,[r14+0x48]
     10aa769:	e8 12 39 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa76e:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     10aa772:	49 8d 76 60          	lea    rsi,[r14+0x60]
     10aa776:	e8 05 39 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa77b:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
     10aa77f:	49 8b 4e 7d          	mov    rcx,QWORD PTR [r14+0x7d]
     10aa783:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
     10aa787:	48 89 4b 7d          	mov    QWORD PTR [rbx+0x7d],rcx
     10aa78b:	be 88 00 00 00       	mov    esi,0x88
     10aa790:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     10aa794:	4c 01 f6             	add    rsi,r14
     10aa797:	e8 e4 38 74 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     10aa79c:	b8 a0 00 00 00       	mov    eax,0xa0
     10aa7a1:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
     10aa7a5:	49 01 c6             	add    r14,rax
     10aa7a8:	4c 89 f6             	mov    rsi,r14
     10aa7ab:	e8 92 2e fe ff       	call   108d642 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254a58>
     10aa7b0:	48 89 d8             	mov    rax,rbx
     10aa7b3:	48 83 c4 08          	add    rsp,0x8
     10aa7b7:	5b                   	pop    rbx
     10aa7b8:	41 5e                	pop    r14
     10aa7ba:	c3                   	ret
     10aa7bb:	cc                   	int3

## Direct xrefs: inner optional construct 0x108da9a
- count: 2

### 1. callsite 0x108da79 in 0x108da66..0x108da99
     108da34:	c3                   	ret
     108da35:	41 56                	push   r14
     108da37:	53                   	push   rbx
     108da38:	50                   	push   rax
     108da39:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     108da3d:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     108da41:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
     108da44:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     108da47:	4c 39 f3             	cmp    rbx,r14
     108da4a:	74 11                	je     108da5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e73>
     108da4c:	48 81 c3 b0 fa ff ff 	add    rbx,0xfffffffffffffab0
     108da53:	48 89 df             	mov    rdi,rbx
     108da56:	e8 17 c0 ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     108da5b:	eb ea                	jmp    108da47 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e5d>
     108da5d:	48 83 c4 08          	add    rsp,0x8
     108da61:	5b                   	pop    rbx
     108da62:	41 5e                	pop    r14
     108da64:	c3                   	ret
     108da65:	cc                   	int3
     108da66:	41 56                	push   r14
     108da68:	53                   	push   rbx
     108da69:	50                   	push   rax
     108da6a:	31 c0                	xor    eax,eax
     108da6c:	88 07                	mov    BYTE PTR [rdi],al
     108da6e:	88 47 38             	mov    BYTE PTR [rdi+0x38],al
     108da71:	38 46 38             	cmp    BYTE PTR [rsi+0x38],al
     108da74:	74 08                	je     108da7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e94>
     108da76:	48 89 fb             	mov    rbx,rdi
     108da79:	e8 1c 00 00 00       	call   108da9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254eb0>
     108da7e:	48 83 c4 08          	add    rsp,0x8
     108da82:	5b                   	pop    rbx
     108da83:	41 5e                	pop    r14
     108da85:	c3                   	ret
     108da86:	49 89 c6             	mov    r14,rax
     108da89:	48 89 df             	mov    rdi,rbx
     108da8c:	e8 47 c0 ff ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     108da91:	4c 89 f7             	mov    rdi,r14
     108da94:	e8 37 22 9e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     108da99:	cc                   	int3
     108da9a:	41 56                	push   r14
     108da9c:	53                   	push   rbx
     108da9d:	50                   	push   rax
     108da9e:	49 89 f6             	mov    r14,rsi
     108daa1:	48 89 fb             	mov    rbx,rdi
     108daa4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     108daa7:	48 89 07             	mov    QWORD PTR [rdi],rax
     108daaa:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
     108daae:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     108dab2:	48 85 c0             	test   rax,rax
     108dab5:	74 05                	je     108dabc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ed2>
     108dab7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     108dabc:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     108dac0:	49 8d 76 10          	lea    rsi,[r14+0x10]
     108dac4:	e8 9d ec a3 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     108dac9:	41 8a 46 30          	mov    al,BYTE PTR [r14+0x30]
     108dacd:	88 43 30             	mov    BYTE PTR [rbx+0x30],al
     108dad0:	c6 43 38 01          	mov    BYTE PTR [rbx+0x38],0x1
     108dad4:	48 83 c4 08          	add    rsp,0x8
     108dad8:	5b                   	pop    rbx
     108dad9:	41 5e                	pop    r14
     108dadb:	c3                   	ret
     108dadc:	49 89 c6             	mov    r14,rax
     108dadf:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     108dae3:	e8 9e 09 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     108dae8:	4c 89 f7             	mov    rdi,r14
     108daeb:	e8 e0 21 9e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     108daf0:	41 56                	push   r14
     108daf2:	53                   	push   rbx
     108daf3:	50                   	push   rax
     108daf4:	49 89 f6             	mov    r14,rsi
     108daf7:	48 89 fb             	mov    rbx,rdi

### 2. callsite 0x108dc0f in 0x108daf0..0x108dc3e
     108db9a:	41 0f 10 86 d0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3d0]
     108dba1:	00 
     108dba2:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108dba9:	00 
     108dbaa:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108dbb1:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108dbb8:	be f0 03 00 00       	mov    esi,0x3f0
     108dbbd:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dbc1:	8a 83 28 04 00 00    	mov    al,BYTE PTR [rbx+0x428]
     108dbc7:	41 3a 86 28 04 00 00 	cmp    al,BYTE PTR [r14+0x428]
     108dbce:	75 31                	jne    108dc01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255017>
     108dbd0:	84 c0                	test   al,al
     108dbd2:	74 40                	je     108dc14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25502a>
     108dbd4:	41 0f 10 86 f0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3f0]
     108dbdb:	00 
     108dbdc:	e8 55 0f a5 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     108dbe1:	be 00 04 00 00       	mov    esi,0x400
     108dbe6:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dbea:	4c 01 f6             	add    rsi,r14
     108dbed:	e8 68 78 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
     108dbf2:	41 8a 86 20 04 00 00 	mov    al,BYTE PTR [r14+0x420]
     108dbf9:	88 83 20 04 00 00    	mov    BYTE PTR [rbx+0x420],al
     108dbff:	eb 13                	jmp    108dc14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25502a>
     108dc01:	84 c0                	test   al,al
     108dc03:	74 07                	je     108dc0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255022>
     108dc05:	e8 34 00 00 00       	call   108dc3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255054>
     108dc0a:	eb 08                	jmp    108dc14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25502a>
     108dc0c:	4c 01 f6             	add    rsi,r14
     108dc0f:	e8 86 fe ff ff       	call   108da9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254eb0>
     108dc14:	be 30 04 00 00       	mov    esi,0x430
     108dc19:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dc1d:	4c 01 f6             	add    rsi,r14
     108dc20:	e8 bb f6 ff ff       	call   108d2e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2546f6>
     108dc25:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108dc2c:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108dc33:	48 89 d8             	mov    rax,rbx
     108dc36:	48 83 c4 08          	add    rsp,0x8
     108dc3a:	5b                   	pop    rbx
     108dc3b:	41 5e                	pop    r14
     108dc3d:	c3                   	ret
     108dc3e:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
     108dc42:	74 0e                	je     108dc52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255068>
     108dc44:	53                   	push   rbx
     108dc45:	48 89 fb             	mov    rbx,rdi
     108dc48:	e8 f1 86 fc ff       	call   105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
     108dc4d:	c6 43 38 00          	mov    BYTE PTR [rbx+0x38],0x0
     108dc51:	5b                   	pop    rbx
     108dc52:	c3                   	ret
     108dc53:	cc                   	int3
     108dc54:	53                   	push   rbx
     108dc55:	48 89 fb             	mov    rbx,rdi
     108dc58:	e8 2f fc ff ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     108dc5d:	c6 83 50 05 00 00 01 	mov    BYTE PTR [rbx+0x550],0x1
     108dc64:	5b                   	pop    rbx
     108dc65:	c3                   	ret
     108dc66:	31 c0                	xor    eax,eax
     108dc68:	88 07                	mov    BYTE PTR [rdi],al
     108dc6a:	88 87 50 05 00 00    	mov    BYTE PTR [rdi+0x550],al
     108dc70:	38 86 50 05 00 00    	cmp    BYTE PTR [rsi+0x550],al
     108dc76:	0f 85 46 00 00 00    	jne    108dcc2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2550d8>
     108dc7c:	c3                   	ret
     108dc7d:	cc                   	int3
     108dc7e:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     108dc82:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     108dc86:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     108dc89:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     108dc8c:	0f 57 c0             	xorps  xmm0,xmm0
     108dc8f:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     108dc94:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
     108dc97:	48 83 67 28 00       	and    QWORD PTR [rdi+0x28],0x0
     108dc9c:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0

## Direct xrefs: outer optional construct 0x108dc54
- count: 2

### 1. callsite 0x108a000 in 0x1089f9e..0x108a477
     1089fa1:	41 56                	push   r14
     1089fa3:	41 55                	push   r13
     1089fa5:	41 54                	push   r12
     1089fa7:	53                   	push   rbx
     1089fa8:	48 83 ec 38          	sub    rsp,0x38
     1089fac:	49 89 f6             	mov    r14,rsi
     1089faf:	48 89 fb             	mov    rbx,rdi
     1089fb2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1089fb9:	00 00 
     1089fbb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1089fc0:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
     1089fc3:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     1089fc6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1089fc9:	48 89 07             	mov    QWORD PTR [rdi],rax
     1089fcc:	48 83 c7 10          	add    rdi,0x10
     1089fd0:	48 83 c6 10          	add    rsi,0x10
     1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
     1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
     108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
     108a027:	4c 89 e0             	mov    rax,r12
     108a02a:	4c 29 e8             	sub    rax,r13
     108a02d:	bf 50 05 00 00       	mov    edi,0x550
     108a032:	48 99                	cqo
     108a034:	48 f7 ff             	idiv   rdi
     108a037:	48 89 c5             	mov    rbp,rax
     108a03a:	48 8b 8b 68 05 00 00 	mov    rcx,QWORD PTR [rbx+0x568]
     108a041:	48 8b b3 78 05 00 00 	mov    rsi,QWORD PTR [rbx+0x578]
     108a048:	48 89 f0             	mov    rax,rsi
     108a04b:	48 29 c8             	sub    rax,rcx
     108a04e:	48 99                	cqo
     108a050:	48 f7 ff             	idiv   rdi
     108a053:	48 39 e8             	cmp    rax,rbp
     108a056:	73 48                	jae    108a0a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2514b6>
     108a058:	48 85 c9             	test   rcx,rcx
     108a05b:	74 1e                	je     108a07b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251491>
     108a05d:	4c 89 ff             	mov    rdi,r15
     108a060:	e8 45 fc ff ff       	call   1089caa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c0>
     108a065:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     108a068:	e8 b3 3e 76 00       	call   17edf20 <_ZdlPv@plt>
     108a06d:	0f 57 c0             	xorps  xmm0,xmm0
     108a070:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     108a074:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     108a079:	31 f6                	xor    esi,esi
     108a07b:	31 ff                	xor    edi,edi
     108a07d:	48 89 ea             	mov    rdx,rbp
     108a080:	e8 5f 37 00 00       	call   108d7e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254bfa>
     108a085:	4c 89 ff             	mov    rdi,r15
     108a088:	48 89 c6             	mov    rsi,rax
     108a08b:	e8 9c 37 00 00       	call   108d82c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254c42>
     108a090:	4c 89 ff             	mov    rdi,r15
     108a093:	4c 89 ee             	mov    rsi,r13
     108a096:	4c 89 e2             	mov    rdx,r12
     108a099:	e8 66 36 00 00       	call   108d704 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b1a>
     108a09e:	eb 55                	jmp    108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a0a0:	4c 8b b3 70 05 00 00 	mov    r14,QWORD PTR [rbx+0x570]

### 2. callsite 0x124a555 in 0x124a504..0x124a8be
     124a4ff:	41 5e                	pop    r14
     124a501:	41 5f                	pop    r15
     124a503:	c3                   	ret
     124a504:	55                   	push   rbp
     124a505:	41 57                	push   r15
     124a507:	41 56                	push   r14
     124a509:	41 55                	push   r13
     124a50b:	41 54                	push   r12
     124a50d:	53                   	push   rbx
     124a50e:	48 83 ec 68          	sub    rsp,0x68
     124a512:	48 89 f5             	mov    rbp,rsi
     124a515:	49 89 fd             	mov    r13,rdi
     124a518:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124a51f:	00 00 
     124a521:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     124a526:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
     124a529:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     124a52c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     124a52f:	48 89 07             	mov    QWORD PTR [rdi],rax
     124a532:	4c 8d 7f 10          	lea    r15,[rdi+0x10]
     124a536:	31 c0                	xor    eax,eax
     124a538:	88 47 10             	mov    BYTE PTR [rdi+0x10],al
     124a53b:	88 87 60 05 00 00    	mov    BYTE PTR [rdi+0x560],al
     124a541:	38 86 60 05 00 00    	cmp    BYTE PTR [rsi+0x560],al
     124a547:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
     124a54c:	74 0c                	je     124a55a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fade>
     124a54e:	48 8d 75 10          	lea    rsi,[rbp+0x10]
     124a552:	4c 89 ff             	mov    rdi,r15
     124a555:	e8 fa 36 e4 ff       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     124a55a:	4d 8d a5 68 05 00 00 	lea    r12,[r13+0x568]
     124a561:	49 83 a5 78 05 00 00 	and    QWORD PTR [r13+0x578],0x0
     124a568:	00 
     124a569:	0f 57 c0             	xorps  xmm0,xmm0
     124a56c:	41 0f 11 85 68 05 00 	movups XMMWORD PTR [r13+0x568],xmm0
     124a573:	00 
     124a574:	48 8b 9d 68 05 00 00 	mov    rbx,QWORD PTR [rbp+0x568]
     124a57b:	4c 8b b5 70 05 00 00 	mov    r14,QWORD PTR [rbp+0x570]
     124a582:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
     124a587:	c6 44 24 50 00       	mov    BYTE PTR [rsp+0x50],0x0
     124a58c:	4c 89 f0             	mov    rax,r14
     124a58f:	48 29 d8             	sub    rax,rbx
     124a592:	74 23                	je     124a5b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fb3b>
     124a594:	b9 50 05 00 00       	mov    ecx,0x550
     124a599:	48 99                	cqo
     124a59b:	48 f7 f9             	idiv   rcx
     124a59e:	4c 89 e7             	mov    rdi,r12
     124a5a1:	48 89 c6             	mov    rsi,rax
     124a5a4:	e8 83 32 e4 ff       	call   108d82c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254c42>
     124a5a9:	4c 89 e7             	mov    rdi,r12
     124a5ac:	48 89 de             	mov    rsi,rbx
     124a5af:	4c 89 f2             	mov    rdx,r14
     124a5b2:	e8 4d 31 e4 ff       	call   108d704 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b1a>
     124a5b7:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     124a5bc:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
     124a5c0:	e8 f1 0d 00 00       	call   124b3b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9093a>
     124a5c5:	be 80 05 00 00       	mov    esi,0x580
     124a5ca:	4a 8d 1c 2e          	lea    rbx,[rsi+r13*1]
     124a5ce:	48 01 ee             	add    rsi,rbp
     124a5d1:	48 89 df             	mov    rdi,rbx
     124a5d4:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
     124a5d9:	e8 1c 0d 00 00       	call   124b2fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9087e>
     124a5de:	be 98 05 00 00       	mov    esi,0x598
     124a5e3:	4a 8d 3c 2e          	lea    rdi,[rsi+r13*1]
     124a5e7:	48 01 ee             	add    rsi,rbp
     124a5ea:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
     124a5ef:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
     124a5f4:	e8 01 0d 00 00       	call   124b2fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9087e>
     124a5f9:	be b0 05 00 00       	mov    esi,0x5b0
     124a5fe:	4a 8d 3c 2e          	lea    rdi,[rsi+r13*1]
     124a602:	48 01 ee             	add    rsi,rbp
     124a605:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi

## All RIP-relative references to vtable address point 0x1879950

### ref 0x145580b in 0x1455804..0x14558f1
     14557c3:	49 89 c7             	mov    r15,rax
     14557c6:	48 89 c7             	mov    rdi,rax
     14557c9:	31 f6                	xor    esi,esi
     14557cb:	eb d7                	jmp    14557a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ad28>
     14557cd:	cc                   	int3
     14557ce:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
     14557d2:	48 8d 05 c7 e5 41 00 	lea    rax,[rip+0x41e5c7]        # 1873da0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30488>
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
     14558a6:	e8 75 86 39 00       	call   17edf20 <_ZdlPv@plt>
     14558ab:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
     14558b2:	e8 d5 58 fe ff       	call   143b18c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280710>
     14558b7:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
     14558be:	e8 c9 58 fe ff       	call   143b18c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x280710>

### ref 0x14e15ff in 0x14e15e4..0x14e16e6
     14e15c4:	5b                   	pop    rbx
     14e15c5:	41 5e                	pop    r14
     14e15c7:	41 5f                	pop    r15
     14e15c9:	5d                   	pop    rbp
     14e15ca:	c3                   	ret
     14e15cb:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     14e15ce:	48 8d 35 eb ba f5 fe 	lea    rsi,[rip+0xfffffffffef5baeb]        # 43d0c0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2ccc>
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
     14e1688:	0f 11 83 28 01 00 00 	movups XMMWORD PTR [rbx+0x128],xmm0
     14e168f:	0f 11 83 38 01 00 00 	movups XMMWORD PTR [rbx+0x138],xmm0
     14e1696:	0f 11 83 48 01 00 00 	movups XMMWORD PTR [rbx+0x148],xmm0
     14e169d:	0f 11 83 58 01 00 00 	movups XMMWORD PTR [rbx+0x158],xmm0
     14e16a4:	0f 11 83 68 01 00 00 	movups XMMWORD PTR [rbx+0x168],xmm0

## Calls in payload-producer-looking regions

### producer FDE 0x1089f9e..0x108a477
     1089f9e:	55                   	push   rbp
     1089f9f:	41 57                	push   r15
     1089fa1:	41 56                	push   r14
     1089fa3:	41 55                	push   r13
     1089fa5:	41 54                	push   r12
     1089fa7:	53                   	push   rbx
     1089fa8:	48 83 ec 38          	sub    rsp,0x38
     1089fac:	49 89 f6             	mov    r14,rsi
     1089faf:	48 89 fb             	mov    rbx,rdi
     1089fb2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1089fb9:	00 00 
     1089fbb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1089fc0:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
     1089fc3:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     1089fc6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1089fc9:	48 89 07             	mov    QWORD PTR [rdi],rax
     1089fcc:	48 83 c7 10          	add    rdi,0x10
     1089fd0:	48 83 c6 10          	add    rsi,0x10
     1089fd4:	8a 83 60 05 00 00    	mov    al,BYTE PTR [rbx+0x560]
     1089fda:	41 3a 86 60 05 00 00 	cmp    al,BYTE PTR [r14+0x560]
     1089fe1:	75 0b                	jne    1089fee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251404>
     1089fe3:	84 c0                	test   al,al
     1089fe5:	74 1e                	je     108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fe7:	e8 04 3b 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     1089fec:	eb 17                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     1089fee:	84 c0                	test   al,al
     1089ff0:	74 0e                	je     108a000 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251416>
     1089ff2:	e8 7b fa ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
     1089ff7:	c6 83 60 05 00 00 00 	mov    BYTE PTR [rbx+0x560],0x0
     1089ffe:	eb 05                	jmp    108a005 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25141b>
     108a000:	e8 4f 3c 00 00       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     108a005:	4c 39 f3             	cmp    rbx,r14
     108a008:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     108a00c:	0f 84 e3 00 00 00    	je     108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a012:	4c 8d bb 68 05 00 00 	lea    r15,[rbx+0x568]
     108a019:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     108a020:	4d 8b a6 70 05 00 00 	mov    r12,QWORD PTR [r14+0x570]
     108a027:	4c 89 e0             	mov    rax,r12
     108a02a:	4c 29 e8             	sub    rax,r13
     108a02d:	bf 50 05 00 00       	mov    edi,0x550
     108a032:	48 99                	cqo
     108a034:	48 f7 ff             	idiv   rdi
     108a037:	48 89 c5             	mov    rbp,rax
     108a03a:	48 8b 8b 68 05 00 00 	mov    rcx,QWORD PTR [rbx+0x568]
     108a041:	48 8b b3 78 05 00 00 	mov    rsi,QWORD PTR [rbx+0x578]
     108a048:	48 89 f0             	mov    rax,rsi
     108a04b:	48 29 c8             	sub    rax,rcx
     108a04e:	48 99                	cqo
     108a050:	48 f7 ff             	idiv   rdi
     108a053:	48 39 e8             	cmp    rax,rbp
     108a056:	73 48                	jae    108a0a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2514b6>
     108a058:	48 85 c9             	test   rcx,rcx
     108a05b:	74 1e                	je     108a07b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251491>
     108a05d:	4c 89 ff             	mov    rdi,r15
     108a060:	e8 45 fc ff ff       	call   1089caa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c0>
     108a065:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     108a068:	e8 b3 3e 76 00       	call   17edf20 <_ZdlPv@plt>
     108a06d:	0f 57 c0             	xorps  xmm0,xmm0
     108a070:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     108a074:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     108a079:	31 f6                	xor    esi,esi
     108a07b:	31 ff                	xor    edi,edi
     108a07d:	48 89 ea             	mov    rdx,rbp
     108a080:	e8 5f 37 00 00       	call   108d7e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254bfa>
     108a085:	4c 89 ff             	mov    rdi,r15
     108a088:	48 89 c6             	mov    rsi,rax
     108a08b:	e8 9c 37 00 00       	call   108d82c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254c42>
     108a090:	4c 89 ff             	mov    rdi,r15
     108a093:	4c 89 ee             	mov    rsi,r13
     108a096:	4c 89 e2             	mov    rdx,r12
     108a099:	e8 66 36 00 00       	call   108d704 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b1a>
     108a09e:	eb 55                	jmp    108a0f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25150b>
     108a0a0:	4c 8b b3 70 05 00 00 	mov    r14,QWORD PTR [rbx+0x570]
     108a0a7:	49 29 ce             	sub    r14,rcx
     108a0aa:	4c 89 f0             	mov    rax,r14
     108a0ad:	48 99                	cqo
     108a0af:	48 f7 ff             	idiv   rdi
     108a0b2:	48 39 e8             	cmp    rax,rbp
     108a0b5:	73 21                	jae    108a0d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2514ee>
     108a0b7:	4d 01 ee             	add    r14,r13
     108a0ba:	4c 89 ef             	mov    rdi,r13
     108a0bd:	4c 89 f6             	mov    rsi,r14
     108a0c0:	48 89 ca             	mov    rdx,rcx
     108a0c3:	e8 fa 35 00 00       	call   108d6c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ad8>
     108a0c8:	4c 89 ff             	mov    rdi,r15
     108a0cb:	4c 89 f6             	mov    rsi,r14
     108a0ce:	4c 89 e2             	mov    rdx,r12
     108a0d1:	e8 2e 36 00 00       	call   108d704 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b1a>
     108a0d6:	eb 19                	jmp    108a0f1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251507>
     108a0d8:	4c 89 ef             	mov    rdi,r13
     108a0db:	4c 89 e6             	mov    rsi,r12
     108a0de:	48 89 ca             	mov    rdx,rcx
     108a0e1:	e8 dc 35 00 00       	call   108d6c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ad8>
     108a0e6:	4c 89 ff             	mov    rdi,r15
     108a0e9:	48 89 c6             	mov    rsi,rax
     108a0ec:	e8 c1 fb ff ff       	call   1089cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c8>
     108a0f1:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
     108a0f5:	be 80 05 00 00       	mov    esi,0x580
     108a0fa:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108a0fe:	4c 01 f6             	add    rsi,r14
     108a101:	e8 92 25 00 00       	call   108c698 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253aae>
     108a106:	be 98 05 00 00       	mov    esi,0x598
     108a10b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108a10f:	4c 01 f6             	add    rsi,r14
     108a112:	e8 81 25 00 00       	call   108c698 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253aae>
     108a117:	be b0 05 00 00       	mov    esi,0x5b0
     108a11c:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108a120:	4c 01 f6             	add    rsi,r14
     108a123:	e8 58 3f 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     108a128:	be c8 05 00 00       	mov    esi,0x5c8
     108a12d:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108a131:	4c 01 f6             	add    rsi,r14
     108a134:	e8 3f 26 00 00       	call   108c778 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b8e>
     108a139:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
     108a13e:	4c 39 f3             	cmp    rbx,r14
     108a141:	0f 84 f1 02 00 00    	je     108a438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25184e>
     108a147:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     108a14c:	4c 8d be f8 05 00 00 	lea    r15,[rsi+0x5f8]
     108a153:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     108a157:	4c 8b a0 f8 05 00 00 	mov    r12,QWORD PTR [rax+0x5f8]
     108a15e:	4c 8d b0 00 06 00 00 	lea    r14,[rax+0x600]
     108a165:	48 83 be 08 06 00 00 	cmp    QWORD PTR [rsi+0x608],0x0
     108a16c:	00 
     108a16d:	0f 84 d4 00 00 00    	je     108a247 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25165d>
     108a173:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
     108a178:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     108a17b:	48 8d 86 00 06 00 00 	lea    rax,[rsi+0x600]
     108a182:	48 8b 8e f8 05 00 00 	mov    rcx,QWORD PTR [rsi+0x5f8]
     108a189:	48 8b 96 00 06 00 00 	mov    rdx,QWORD PTR [rsi+0x600]
     108a190:	48 89 86 f8 05 00 00 	mov    QWORD PTR [rsi+0x5f8],rax
     108a197:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     108a19c:	0f 57 c0             	xorps  xmm0,xmm0
     108a19f:	0f 11 86 00 06 00 00 	movups XMMWORD PTR [rsi+0x600],xmm0
     108a1a6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     108a1aa:	48 85 c0             	test   rax,rax
     108a1ad:	48 0f 44 c1          	cmove  rax,rcx
     108a1b1:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     108a1b5:	48 89 df             	mov    rdi,rbx
     108a1b8:	e8 e9 5e a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
     108a1bd:	4c 8b 6b 10          	mov    r13,QWORD PTR [rbx+0x10]
     108a1c1:	4d 85 ed             	test   r13,r13
     108a1c4:	74 58                	je     108a21e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251634>
     108a1c6:	4d 39 f4             	cmp    r12,r14
     108a1c9:	74 53                	je     108a21e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251634>
     108a1cb:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
     108a1d0:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
     108a1d5:	41 8b 54 24 1c       	mov    edx,DWORD PTR [r12+0x1c]
     108a1da:	41 89 55 1c          	mov    DWORD PTR [r13+0x1c],edx
     108a1de:	4c 89 ff             	mov    rdi,r15
     108a1e1:	48 89 ee             	mov    rsi,rbp
     108a1e4:	e8 0b 5f a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
     108a1e9:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     108a1ee:	4c 89 ff             	mov    rdi,r15
     108a1f1:	48 89 c2             	mov    rdx,rax
     108a1f4:	4c 89 e9             	mov    rcx,r13
     108a1f7:	e8 70 59 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     108a1fc:	48 89 df             	mov    rdi,rbx
     108a1ff:	e8 a2 5e a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
     108a204:	4c 89 e7             	mov    rdi,r12
     108a207:	e8 d6 45 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     108a20c:	49 89 c4             	mov    r12,rax
     108a20f:	4c 8b 6c 24 28       	mov    r13,QWORD PTR [rsp+0x28]
     108a214:	4d 85 ed             	test   r13,r13
     108a217:	74 05                	je     108a21e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251634>
     108a219:	4d 39 f4             	cmp    r12,r14
     108a21c:	75 b7                	jne    108a1d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2515eb>
     108a21e:	4c 89 ef             	mov    rdi,r13
     108a221:	e8 9a 43 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     108a226:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     108a22b:	48 85 ff             	test   rdi,rdi
     108a22e:	74 17                	je     108a247 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25165d>
     108a230:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     108a234:	48 85 c0             	test   rax,rax
     108a237:	74 09                	je     108a242 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251658>
     108a239:	48 89 c7             	mov    rdi,rax
     108a23c:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     108a240:	eb f2                	jmp    108a234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25164a>
     108a242:	e8 79 43 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     108a247:	4d 39 f4             	cmp    r12,r14
     108a24a:	74 6c                	je     108a2b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2516ce>
     108a24c:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     108a251:	4c 8d a8 00 06 00 00 	lea    r13,[rax+0x600]
     108a258:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
     108a25d:	6a 20                	push   0x20
     108a25f:	5f                   	pop    rdi
     108a260:	e8 9b 3c 76 00       	call   17edf00 <_Znwm@plt>
     108a265:	48 89 c3             	mov    rbx,rax
     108a268:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
     108a26d:	41 8b 54 24 1c       	mov    edx,DWORD PTR [r12+0x1c]
     108a272:	89 50 1c             	mov    DWORD PTR [rax+0x1c],edx
     108a275:	c6 44 24 28 01       	mov    BYTE PTR [rsp+0x28],0x1
     108a27a:	4c 89 ff             	mov    rdi,r15
     108a27d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     108a282:	e8 6d 5e a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
     108a287:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     108a28c:	4c 89 ff             	mov    rdi,r15
     108a28f:	48 89 c2             	mov    rdx,rax
     108a292:	48 89 d9             	mov    rcx,rbx
     108a295:	e8 d2 58 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     108a29a:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
     108a2a0:	48 89 ef             	mov    rdi,rbp
     108a2a3:	e8 22 00 9f ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     108a2a8:	4c 89 e7             	mov    rdi,r12
     108a2ab:	e8 32 45 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     108a2b0:	49 89 c4             	mov    r12,rax
     108a2b3:	4c 39 f0             	cmp    rax,r14
     108a2b6:	75 a5                	jne    108a25d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251673>
     108a2b8:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     108a2bc:	48 39 44 24 08       	cmp    QWORD PTR [rsp+0x8],rax
     108a2c1:	0f 84 71 01 00 00    	je     108a438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25184e>
     108a2c7:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     108a2cc:	4c 8d be 10 06 00 00 	lea    r15,[rsi+0x610]
     108a2d3:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     108a2d7:	4c 8b a0 10 06 00 00 	mov    r12,QWORD PTR [rax+0x610]
     108a2de:	4c 8d b0 18 06 00 00 	lea    r14,[rax+0x618]
     108a2e5:	48 83 be 20 06 00 00 	cmp    QWORD PTR [rsi+0x620],0x0
     108a2ec:	00 
     108a2ed:	0f 84 d4 00 00 00    	je     108a3c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517dd>
     108a2f3:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
     108a2f8:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     108a2fb:	48 8d 86 18 06 00 00 	lea    rax,[rsi+0x618]
     108a302:	48 8b 8e 10 06 00 00 	mov    rcx,QWORD PTR [rsi+0x610]
     108a309:	48 8b 96 18 06 00 00 	mov    rdx,QWORD PTR [rsi+0x618]
     108a310:	48 89 86 10 06 00 00 	mov    QWORD PTR [rsi+0x610],rax
     108a317:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     108a31c:	0f 57 c0             	xorps  xmm0,xmm0
     108a31f:	0f 11 86 18 06 00 00 	movups XMMWORD PTR [rsi+0x618],xmm0
     108a326:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     108a32a:	48 85 c0             	test   rax,rax
     108a32d:	48 0f 44 c1          	cmove  rax,rcx
     108a331:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     108a335:	48 89 df             	mov    rdi,rbx
     108a338:	e8 69 5d a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
     108a33d:	4c 8b 6b 10          	mov    r13,QWORD PTR [rbx+0x10]
     108a341:	4d 85 ed             	test   r13,r13
     108a344:	74 58                	je     108a39e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517b4>
     108a346:	4d 39 f4             	cmp    r12,r14
     108a349:	74 53                	je     108a39e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517b4>
     108a34b:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
     108a350:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
     108a355:	41 8b 54 24 1c       	mov    edx,DWORD PTR [r12+0x1c]
     108a35a:	41 89 55 1c          	mov    DWORD PTR [r13+0x1c],edx
     108a35e:	4c 89 ff             	mov    rdi,r15
     108a361:	48 89 ee             	mov    rsi,rbp
     108a364:	e8 8b 5d a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
     108a369:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     108a36e:	4c 89 ff             	mov    rdi,r15
     108a371:	48 89 c2             	mov    rdx,rax
     108a374:	4c 89 e9             	mov    rcx,r13
     108a377:	e8 f0 57 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     108a37c:	48 89 df             	mov    rdi,rbx
     108a37f:	e8 22 5d a5 ff       	call   ae00a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d046>
     108a384:	4c 89 e7             	mov    rdi,r12
     108a387:	e8 56 44 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     108a38c:	49 89 c4             	mov    r12,rax
     108a38f:	4c 8b 6c 24 28       	mov    r13,QWORD PTR [rsp+0x28]
     108a394:	4d 85 ed             	test   r13,r13
     108a397:	74 05                	je     108a39e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517b4>
     108a399:	4d 39 f4             	cmp    r12,r14
     108a39c:	75 b7                	jne    108a355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25176b>
     108a39e:	4c 89 ef             	mov    rdi,r13
     108a3a1:	e8 1a 42 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     108a3a6:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     108a3ab:	48 85 ff             	test   rdi,rdi
     108a3ae:	74 17                	je     108a3c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517dd>
     108a3b0:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     108a3b4:	48 85 c0             	test   rax,rax
     108a3b7:	74 09                	je     108a3c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517d8>
     108a3b9:	48 89 c7             	mov    rdi,rax
     108a3bc:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     108a3c0:	eb f2                	jmp    108a3b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517ca>
     108a3c2:	e8 f9 41 a5 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     108a3c7:	4d 39 f4             	cmp    r12,r14
     108a3ca:	74 6c                	je     108a438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25184e>
     108a3cc:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     108a3d1:	4c 8d a8 18 06 00 00 	lea    r13,[rax+0x618]
     108a3d8:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
     108a3dd:	6a 20                	push   0x20
     108a3df:	5f                   	pop    rdi
     108a3e0:	e8 1b 3b 76 00       	call   17edf00 <_Znwm@plt>
     108a3e5:	48 89 c3             	mov    rbx,rax
     108a3e8:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
     108a3ed:	41 8b 54 24 1c       	mov    edx,DWORD PTR [r12+0x1c]
     108a3f2:	89 50 1c             	mov    DWORD PTR [rax+0x1c],edx
     108a3f5:	c6 44 24 28 01       	mov    BYTE PTR [rsp+0x28],0x1
     108a3fa:	4c 89 ff             	mov    rdi,r15
     108a3fd:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     108a402:	e8 ed 5c a5 ff       	call   ae00f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d094>
     108a407:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     108a40c:	4c 89 ff             	mov    rdi,r15
     108a40f:	48 89 c2             	mov    rdx,rax
     108a412:	48 89 d9             	mov    rcx,rbx
     108a415:	e8 52 57 a5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     108a41a:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
     108a420:	48 89 ef             	mov    rdi,rbp
     108a423:	e8 a2 fe 9e ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     108a428:	4c 89 e7             	mov    rdi,r12
     108a42b:	e8 b2 43 a1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     108a430:	49 89 c4             	mov    r12,rax
     108a433:	4c 39 f0             	cmp    rax,r14
     108a436:	75 a5                	jne    108a3dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2517f3>
     108a438:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108a43f:	00 00 
     108a441:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     108a446:	75 2a                	jne    108a472 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251888>
     108a448:	ba 28 06 00 00       	mov    edx,0x628
     108a44d:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     108a452:	48 8d 0c 10          	lea    rcx,[rax+rdx*1]
     108a456:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
     108a45a:	48 01 d6             	add    rsi,rdx
     108a45d:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     108a460:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     108a463:	48 83 c4 38          	add    rsp,0x38
     108a467:	5b                   	pop    rbx
     108a468:	41 5c                	pop    r12
     108a46a:	41 5d                	pop    r13
     108a46c:	41 5e                	pop    r14
     108a46e:	41 5f                	pop    r15
     108a470:	5d                   	pop    rbp
     108a471:	c3                   	ret
     108a472:	e8 39 56 76 00       	call   17efab0 <__stack_chk_fail@plt>

### producer FDE 0x108d6c2..0x108d703
     108d6c2:	41 57                	push   r15
     108d6c4:	41 56                	push   r14
     108d6c6:	41 54                	push   r12
     108d6c8:	53                   	push   rbx
     108d6c9:	50                   	push   rax
     108d6ca:	48 89 d3             	mov    rbx,rdx
     108d6cd:	48 39 f7             	cmp    rdi,rsi
     108d6d0:	74 22                	je     108d6f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b0a>
     108d6d2:	49 89 f6             	mov    r14,rsi
     108d6d5:	49 89 ff             	mov    r15,rdi
     108d6d8:	41 bc 50 05 00 00    	mov    r12d,0x550
     108d6de:	48 89 df             	mov    rdi,rbx
     108d6e1:	4c 89 fe             	mov    rsi,r15
     108d6e4:	e8 07 04 00 00       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     108d6e9:	4d 01 e7             	add    r15,r12
     108d6ec:	4c 01 e3             	add    rbx,r12
     108d6ef:	4d 39 f7             	cmp    r15,r14
     108d6f2:	75 ea                	jne    108d6de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254af4>
     108d6f4:	48 89 d8             	mov    rax,rbx
     108d6f7:	48 83 c4 08          	add    rsp,0x8
     108d6fb:	5b                   	pop    rbx
     108d6fc:	41 5c                	pop    r12
     108d6fe:	41 5e                	pop    r14
     108d700:	41 5f                	pop    r15
     108d702:	c3                   	ret

### producer FDE 0x108d704..0x108d7e4
     108d704:	55                   	push   rbp
     108d705:	41 57                	push   r15
     108d707:	41 56                	push   r14
     108d709:	41 55                	push   r13
     108d70b:	41 54                	push   r12
     108d70d:	53                   	push   rbx
     108d70e:	48 83 ec 38          	sub    rsp,0x38
     108d712:	49 89 d6             	mov    r14,rdx
     108d715:	48 89 fb             	mov    rbx,rdi
     108d718:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108d71f:	00 00 
     108d721:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     108d726:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]
     108d72a:	48 8d 47 10          	lea    rax,[rdi+0x10]
     108d72e:	48 8d 4c 24 08       	lea    rcx,[rsp+0x8]
     108d733:	4c 89 29             	mov    QWORD PTR [rcx],r13
     108d736:	48 89 e2             	mov    rdx,rsp
     108d739:	4c 89 2a             	mov    QWORD PTR [rdx],r13
     108d73c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     108d741:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
     108d746:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     108d74b:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
     108d750:	4c 39 f6             	cmp    rsi,r14
     108d753:	74 2d                	je     108d782 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b98>
     108d755:	49 89 f7             	mov    r15,rsi
     108d758:	bd 50 05 00 00       	mov    ebp,0x550
     108d75d:	4d 89 ec             	mov    r12,r13
     108d760:	4c 89 e7             	mov    rdi,r12
     108d763:	4c 89 fe             	mov    rsi,r15
     108d766:	e8 21 01 00 00       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     108d76b:	49 01 ef             	add    r15,rbp
     108d76e:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
     108d773:	49 01 ec             	add    r12,rbp
     108d776:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
     108d77b:	4d 39 f7             	cmp    r15,r14
     108d77e:	75 e0                	jne    108d760 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b76>
     108d780:	eb 03                	jmp    108d785 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b9b>
     108d782:	4d 89 ec             	mov    r12,r13
     108d785:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     108d78a:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
     108d78e:	e8 9b 02 00 00       	call   108da2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e44>
     108d793:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
     108d797:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108d79e:	00 00 
     108d7a0:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     108d7a5:	75 38                	jne    108d7df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254bf5>
     108d7a7:	48 83 c4 38          	add    rsp,0x38
     108d7ab:	5b                   	pop    rbx
     108d7ac:	41 5c                	pop    r12
     108d7ae:	41 5d                	pop    r13
     108d7b0:	41 5e                	pop    r14
     108d7b2:	41 5f                	pop    r15
     108d7b4:	5d                   	pop    rbp
     108d7b5:	c3                   	ret
     108d7b6:	49 89 c6             	mov    r14,rax
     108d7b9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     108d7be:	e8 6b 02 00 00       	call   108da2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e44>
     108d7c3:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
     108d7c7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     108d7ce:	00 00 
     108d7d0:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     108d7d5:	75 08                	jne    108d7df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254bf5>
     108d7d7:	4c 89 f7             	mov    rdi,r14
     108d7da:	e8 f1 24 9e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     108d7df:	e8 cc 22 76 00       	call   17efab0 <__stack_chk_fail@plt>

### producer FDE 0x108dc54..0x108dc66
     108dc54:	53                   	push   rbx
     108dc55:	48 89 fb             	mov    rbx,rdi
     108dc58:	e8 2f fc ff ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     108dc5d:	c6 83 50 05 00 00 01 	mov    BYTE PTR [rbx+0x550],0x1
     108dc64:	5b                   	pop    rbx
     108dc65:	c3                   	ret

### producer FDE 0x10aa59e..0x10aa5dc
     10aa59e:	41 56                	push   r14
     10aa5a0:	53                   	push   rbx
     10aa5a1:	50                   	push   rax
     10aa5a2:	49 89 f6             	mov    r14,rsi
     10aa5a5:	48 89 fb             	mov    rbx,rdi
     10aa5a8:	e8 67 00 00 00       	call   10aa614 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271a2a>
     10aa5ad:	b8 60 01 00 00       	mov    eax,0x160
     10aa5b2:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
     10aa5b6:	49 01 c6             	add    r14,rax
     10aa5b9:	4c 89 f6             	mov    rsi,r14
     10aa5bc:	e8 cb 32 fe ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     10aa5c1:	48 83 c4 08          	add    rsp,0x8
     10aa5c5:	5b                   	pop    rbx
     10aa5c6:	41 5e                	pop    r14
     10aa5c8:	c3                   	ret
     10aa5c9:	49 89 c6             	mov    r14,rax
     10aa5cc:	48 89 df             	mov    rdi,rbx
     10aa5cf:	e8 1a f8 ff ff       	call   10a9dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271204>
     10aa5d4:	4c 89 f7             	mov    rdi,r14
     10aa5d7:	e8 f4 56 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

### producer FDE 0x10aa70a..0x10aa738
     10aa70a:	41 56                	push   r14
     10aa70c:	53                   	push   rbx
     10aa70d:	50                   	push   rax
     10aa70e:	48 89 f3             	mov    rbx,rsi
     10aa711:	49 89 fe             	mov    r14,rdi
     10aa714:	e8 1f 00 00 00       	call   10aa738 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271b4e>
     10aa719:	b8 60 01 00 00       	mov    eax,0x160
     10aa71e:	49 8d 3c 06          	lea    rdi,[r14+rax*1]
     10aa722:	48 01 c3             	add    rbx,rax
     10aa725:	48 89 de             	mov    rsi,rbx
     10aa728:	e8 c3 33 fe ff       	call   108daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254f06>
     10aa72d:	4c 89 f0             	mov    rax,r14
     10aa730:	48 83 c4 08          	add    rsp,0x8
     10aa734:	5b                   	pop    rbx
     10aa735:	41 5e                	pop    r14
     10aa737:	c3                   	ret

### producer FDE 0x1220554..0x1222300
     122165f:	4c 89 f6             	mov    rsi,r14
     1221662:	e8 ff b0 8a ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     1221667:	48 8d bc 24 18 1b 00 	lea    rdi,[rsp+0x1b18]
     122166e:	00 
     122166f:	48 8d b4 24 20 11 00 	lea    rsi,[rsp+0x1120]
     1221676:	00 
     1221677:	e8 84 22 00 00       	call   1223900 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68e84>
     122167c:	48 8b bb 38 0a 00 00 	mov    rdi,QWORD PTR [rbx+0xa38]
     1221683:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1221686:	ff 50 58             	call   QWORD PTR [rax+0x58]
     1221689:	4c 8d b4 24 08 1c 00 	lea    r14,[rsp+0x1c08]
     1221690:	00 
     1221691:	41 88 46 f8          	mov    BYTE PTR [r14-0x8],al
     1221695:	48 8b bb 38 0a 00 00 	mov    rdi,QWORD PTR [rbx+0xa38]
     122169c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     122169f:	ff 50 20             	call   QWORD PTR [rax+0x20]
     12216a2:	48 8d 70 08          	lea    rsi,[rax+0x8]
     12216a6:	4c 89 f7             	mov    rdi,r14
     12216a9:	e8 b8 b0 8a ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     12216ae:	48 8d bc 24 30 1c 00 	lea    rdi,[rsp+0x1c30]
     12216b5:	00 
     12216b6:	83 67 f8 00          	and    DWORD PTR [rdi-0x8],0x0
     12216ba:	48 8d b5 80 05 00 00 	lea    rsi,[rbp+0x580]
     12216c1:	4c 89 ea             	mov    rdx,r13
     12216c4:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     12216c9:	48 89 d9             	mov    rcx,rbx
     12216cc:	e8 ed 91 02 00       	call   124a8be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fe42>
     12216d1:	48 8d bc 24 48 1c 00 	lea    rdi,[rsp+0x1c48]
     12216d8:	00 
     12216d9:	48 8d b5 98 05 00 00 	lea    rsi,[rbp+0x598]
     12216e0:	4c 89 ea             	mov    rdx,r13
     12216e3:	48 89 d9             	mov    rcx,rbx
     12216e6:	e8 d3 91 02 00       	call   124a8be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fe42>
     12216eb:	80 bd 60 05 00 00 00 	cmp    BYTE PTR [rbp+0x560],0x0
     12216f2:	74 57                	je     122174b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66ccf>
     12216f4:	4c 89 ef             	mov    rdi,r13
     12216f7:	e8 f2 8d e6 ff       	call   108a4ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251904>
     12216fc:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1221703:	00 
     1221704:	4c 89 ee             	mov    rsi,r13
     1221707:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     122170c:	e8 25 97 02 00       	call   124ae36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x903ba>
     1221711:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     1221718:	00 
     1221719:	4c 89 ee             	mov    rsi,r13
     122171c:	e8 6b c1 e6 ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     1221721:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
     1221728:	00 
     1221729:	48 8d bc 24 60 1c 00 	lea    rdi,[rsp+0x1c60]
     1221730:	00 
     1221731:	48 89 de             	mov    rsi,rbx
     1221734:	e8 93 29 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221739:	c6 84 24 10 23 00 00 	mov    BYTE PTR [rsp+0x2310],0x1
     1221740:	01 
     1221741:	48 89 df             	mov    rdi,rbx
     1221744:	e8 ef 86 e8 ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     1221749:	eb 10                	jmp    122175b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66cdf>
     122174b:	31 c0                	xor    eax,eax
     122174d:	88 84 24 60 1c 00 00 	mov    BYTE PTR [rsp+0x1c60],al
     1221754:	88 84 24 10 23 00 00 	mov    BYTE PTR [rsp+0x2310],al
     122175b:	48 83 a4 24 28 23 00 	and    QWORD PTR [rsp+0x2328],0x0
     1221762:	00 00 
     1221764:	66 0f ef c0          	pxor   xmm0,xmm0
     1221768:	f3 0f 7f 84 24 18 23 	movdqu XMMWORD PTR [rsp+0x2318],xmm0
     122176f:	00 00 
     1221771:	48 8b 8d 70 05 00 00 	mov    rcx,QWORD PTR [rbp+0x570]
     1221778:	48 8b b5 68 05 00 00 	mov    rsi,QWORD PTR [rbp+0x568]
     122177f:	48 89 c8             	mov    rax,rcx
     1221782:	48 29 f0             	sub    rax,rsi
     1221785:	bf 50 05 00 00       	mov    edi,0x550
     122178a:	48 99                	cqo
     122178c:	48 f7 ff             	idiv   rdi
     122178f:	48 39 f1             	cmp    rcx,rsi
     1221792:	0f 84 ec 01 00 00    	je     1221984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f08>
     1221798:	48 b9 7f 21 56 94 c6 	movabs rcx,0x2647c69456217f
     122179f:	47 26 00 
     12217a2:	48 39 c8             	cmp    rax,rcx
     12217a5:	0f 83 30 08 00 00    	jae    1221fdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6755f>
     12217ab:	48 8d 8c 24 28 23 00 	lea    rcx,[rsp+0x2328]
     12217b2:	00 
     12217b3:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
     12217ba:	00 
     12217bb:	48 89 c7             	mov    rdi,rax
     12217be:	e8 b2 8d e8 ff       	call   10aa575 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27198b>
     12217c3:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
     12217c8:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
     12217cf:	00 
     12217d0:	48 89 03             	mov    QWORD PTR [rbx],rax
     12217d3:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     12217d7:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     12217db:	48 69 ca b0 06 00 00 	imul   rcx,rdx,0x6b0
     12217e2:	48 01 c1             	add    rcx,rax
     12217e5:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
     12217e9:	48 8d bc 24 18 23 00 	lea    rdi,[rsp+0x2318]
     12217f0:	00 
     12217f1:	48 89 de             	mov    rsi,rbx
     12217f4:	e8 a5 98 02 00       	call   124b09e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90622>
     12217f9:	48 89 df             	mov    rdi,rbx
     12217fc:	e8 1f 99 02 00       	call   124b120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906a4>
     1221801:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     1221808:	49 8b ae 70 05 00 00 	mov    rbp,QWORD PTR [r14+0x570]
     122180f:	49 39 ed             	cmp    r13,rbp
     1221812:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     1221817:	0f 84 67 01 00 00    	je     1221984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f08>
     122181d:	4c 8d bc 24 20 01 00 	lea    r15,[rsp+0x120]
     1221824:	00 
     1221825:	41 be b0 06 00 00    	mov    r14d,0x6b0
     122182b:	4c 8d a4 24 30 13 00 	lea    r12,[rsp+0x1330]
     1221832:	00 
     1221833:	4c 89 ff             	mov    rdi,r15
     1221836:	4c 89 ee             	mov    rsi,r13
     1221839:	e8 20 20 00 00       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     122183e:	48 89 df             	mov    rdi,rbx
     1221841:	4c 89 fe             	mov    rsi,r15
     1221844:	e8 48 8c 02 00       	call   124a491 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fa15>
     1221849:	48 89 c3             	mov    rbx,rax
     12217b3:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
     12217ba:	00 
     12217bb:	48 89 c7             	mov    rdi,rax
     12217be:	e8 b2 8d e8 ff       	call   10aa575 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27198b>
     12217c3:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
     12217c8:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
     12217cf:	00 
     12217d0:	48 89 03             	mov    QWORD PTR [rbx],rax
     12217d3:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     12217d7:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     12217db:	48 69 ca b0 06 00 00 	imul   rcx,rdx,0x6b0
     12217e2:	48 01 c1             	add    rcx,rax
     12217e5:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
     12217e9:	48 8d bc 24 18 23 00 	lea    rdi,[rsp+0x2318]
     12217f0:	00 
     12217f1:	48 89 de             	mov    rsi,rbx
     12217f4:	e8 a5 98 02 00       	call   124b09e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90622>
     12217f9:	48 89 df             	mov    rdi,rbx
     12217fc:	e8 1f 99 02 00       	call   124b120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906a4>
     1221801:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     1221808:	49 8b ae 70 05 00 00 	mov    rbp,QWORD PTR [r14+0x570]
     122180f:	49 39 ed             	cmp    r13,rbp
     1221812:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     1221817:	0f 84 67 01 00 00    	je     1221984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f08>
     122181d:	4c 8d bc 24 20 01 00 	lea    r15,[rsp+0x120]
     1221824:	00 
     1221825:	41 be b0 06 00 00    	mov    r14d,0x6b0
     122182b:	4c 8d a4 24 30 13 00 	lea    r12,[rsp+0x1330]
     1221832:	00 
     1221833:	4c 89 ff             	mov    rdi,r15
     1221836:	4c 89 ee             	mov    rsi,r13
     1221839:	e8 20 20 00 00       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     122183e:	48 89 df             	mov    rdi,rbx
     1221841:	4c 89 fe             	mov    rsi,r15
     1221844:	e8 48 8c 02 00       	call   124a491 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fa15>
     1221849:	48 89 c3             	mov    rbx,rax
     122184c:	4c 89 ff             	mov    rdi,r15
     122184f:	e8 3c c6 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1221854:	4c 89 ff             	mov    rdi,r15
     1221857:	4c 89 ee             	mov    rsi,r13
     122185a:	48 89 da             	mov    rdx,rbx
     122185d:	e8 d4 95 02 00       	call   124ae36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x903ba>
     1221862:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     1221869:	00 
     122186a:	4c 89 ee             	mov    rsi,r13
     122186d:	e8 1a c0 e6 ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     1221872:	48 8b 9c 24 20 23 00 	mov    rbx,QWORD PTR [rsp+0x2320]
     1221879:	00 
     122187a:	48 8b b4 24 28 23 00 	mov    rsi,QWORD PTR [rsp+0x2328]
     1221881:	00 
     1221882:	48 39 f3             	cmp    rbx,rsi
     1221885:	73 17                	jae    122189e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e22>
     1221887:	48 89 df             	mov    rdi,rbx
     122188a:	4c 89 fe             	mov    rsi,r15
     122188d:	e8 3a 28 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221892:	48 81 c3 b0 06 00 00 	add    rbx,0x6b0
     1221899:	e9 c1 00 00 00       	jmp    122195f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66ee3>
     122189e:	48 8b bc 24 18 23 00 	mov    rdi,QWORD PTR [rsp+0x2318]
     12218a5:	00 
     12218a6:	48 29 fb             	sub    rbx,rdi
     12218a9:	48 89 d8             	mov    rax,rbx
     12218ac:	48 99                	cqo
     12218ae:	49 f7 fe             	idiv   r14
     12218b1:	48 8d 50 01          	lea    rdx,[rax+0x1]
     12218b5:	e8 3c 8c e8 ff       	call   10aa4f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27190c>
     12218ba:	48 89 c7             	mov    rdi,rax
     12218bd:	48 8b 84 24 20 23 00 	mov    rax,QWORD PTR [rsp+0x2320]
     12218c4:	00 
     12218c5:	48 2b 84 24 18 23 00 	sub    rax,QWORD PTR [rsp+0x2318]
     12218cc:	00 
     12218cd:	48 99                	cqo
     12218cf:	49 f7 fe             	idiv   r14
     12218d2:	48 89 c3             	mov    rbx,rax
     12218d5:	48 8d 84 24 28 23 00 	lea    rax,[rsp+0x2328]
     12218dc:	00 
     12218dd:	48 89 84 24 50 13 00 	mov    QWORD PTR [rsp+0x1350],rax
     12218e4:	00 
     12218e5:	48 85 ff             	test   rdi,rdi
     12218e8:	74 07                	je     12218f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e75>
     12218ea:	e8 86 8c e8 ff       	call   10aa575 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27198b>
     12218ef:	eb 04                	jmp    12218f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e79>
     12218f1:	31 c0                	xor    eax,eax
     12218f3:	31 d2                	xor    edx,edx
     12218f5:	48 89 84 24 30 13 00 	mov    QWORD PTR [rsp+0x1330],rax
     12218fc:	00 
     12218fd:	48 69 db b0 06 00 00 	imul   rbx,rbx,0x6b0
     1221904:	48 01 c3             	add    rbx,rax
     1221907:	48 89 9c 24 40 13 00 	mov    QWORD PTR [rsp+0x1340],rbx
     122190e:	00 
     122190f:	48 89 9c 24 38 13 00 	mov    QWORD PTR [rsp+0x1338],rbx
     1221916:	00 
     1221917:	48 69 ca b0 06 00 00 	imul   rcx,rdx,0x6b0
     122191e:	48 01 c1             	add    rcx,rax
     1221921:	48 89 8c 24 48 13 00 	mov    QWORD PTR [rsp+0x1348],rcx
     1221928:	00 
     1221929:	48 89 df             	mov    rdi,rbx
     122192c:	4c 89 fe             	mov    rsi,r15
     122192f:	e8 98 27 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221934:	4c 01 f3             	add    rbx,r14
     1221937:	48 89 9c 24 40 13 00 	mov    QWORD PTR [rsp+0x1340],rbx
     122193e:	00 
     122193f:	48 8d bc 24 18 23 00 	lea    rdi,[rsp+0x2318]
     1221946:	00 
     1221947:	4c 89 e6             	mov    rsi,r12
     122194a:	e8 4f 97 02 00       	call   124b09e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90622>
     122194f:	48 8b 9c 24 20 23 00 	mov    rbx,QWORD PTR [rsp+0x2320]
     1221956:	00 
     1221957:	4c 89 e7             	mov    rdi,r12
     122195a:	e8 c1 97 02 00       	call   124b120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906a4>
     122195f:	48 89 9c 24 20 23 00 	mov    QWORD PTR [rsp+0x2320],rbx
     1221966:	00 
     1221967:	4c 89 ff             	mov    rdi,r15
     122196a:	e8 c9 84 e8 ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     122196f:	49 81 c5 50 05 00 00 	add    r13,0x550
     1221976:	49 39 ed             	cmp    r13,rbp
     1221979:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]

### producer FDE 0x124a504..0x124a8be
     124a504:	55                   	push   rbp
     124a505:	41 57                	push   r15
     124a507:	41 56                	push   r14
     124a509:	41 55                	push   r13
     124a50b:	41 54                	push   r12
     124a50d:	53                   	push   rbx
     124a50e:	48 83 ec 68          	sub    rsp,0x68
     124a512:	48 89 f5             	mov    rbp,rsi
     124a515:	49 89 fd             	mov    r13,rdi
     124a518:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124a51f:	00 00 
     124a521:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     124a526:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
     124a529:	89 47 08             	mov    DWORD PTR [rdi+0x8],eax
     124a52c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     124a52f:	48 89 07             	mov    QWORD PTR [rdi],rax
     124a532:	4c 8d 7f 10          	lea    r15,[rdi+0x10]
     124a536:	31 c0                	xor    eax,eax
     124a538:	88 47 10             	mov    BYTE PTR [rdi+0x10],al
     124a53b:	88 87 60 05 00 00    	mov    BYTE PTR [rdi+0x560],al
     124a541:	38 86 60 05 00 00    	cmp    BYTE PTR [rsi+0x560],al
     124a547:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
     124a54c:	74 0c                	je     124a55a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fade>
     124a54e:	48 8d 75 10          	lea    rsi,[rbp+0x10]
     124a552:	4c 89 ff             	mov    rdi,r15
     124a555:	e8 fa 36 e4 ff       	call   108dc54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25506a>
     124a55a:	4d 8d a5 68 05 00 00 	lea    r12,[r13+0x568]
     124a561:	49 83 a5 78 05 00 00 	and    QWORD PTR [r13+0x578],0x0
     124a568:	00 
     124a569:	0f 57 c0             	xorps  xmm0,xmm0
     124a56c:	41 0f 11 85 68 05 00 	movups XMMWORD PTR [r13+0x568],xmm0
     124a573:	00 
     124a574:	48 8b 9d 68 05 00 00 	mov    rbx,QWORD PTR [rbp+0x568]
     124a57b:	4c 8b b5 70 05 00 00 	mov    r14,QWORD PTR [rbp+0x570]
     124a582:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
     124a587:	c6 44 24 50 00       	mov    BYTE PTR [rsp+0x50],0x0
     124a58c:	4c 89 f0             	mov    rax,r14
     124a58f:	48 29 d8             	sub    rax,rbx
     124a592:	74 23                	je     124a5b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fb3b>
     124a594:	b9 50 05 00 00       	mov    ecx,0x550
     124a599:	48 99                	cqo
     124a59b:	48 f7 f9             	idiv   rcx
     124a59e:	4c 89 e7             	mov    rdi,r12
     124a5a1:	48 89 c6             	mov    rsi,rax
     124a5a4:	e8 83 32 e4 ff       	call   108d82c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254c42>
     124a5a9:	4c 89 e7             	mov    rdi,r12
     124a5ac:	48 89 de             	mov    rsi,rbx
     124a5af:	4c 89 f2             	mov    rdx,r14
     124a5b2:	e8 4d 31 e4 ff       	call   108d704 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254b1a>
     124a5b7:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     124a5bc:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
     124a5c0:	e8 f1 0d 00 00       	call   124b3b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9093a>
     124a5c5:	be 80 05 00 00       	mov    esi,0x580
     124a5ca:	4a 8d 1c 2e          	lea    rbx,[rsi+r13*1]
     124a5ce:	48 01 ee             	add    rsi,rbp
     124a5d1:	48 89 df             	mov    rdi,rbx
     124a5d4:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
     124a5d9:	e8 1c 0d 00 00       	call   124b2fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9087e>
     124a5de:	be 98 05 00 00       	mov    esi,0x598
     124a5e3:	4a 8d 3c 2e          	lea    rdi,[rsi+r13*1]
     124a5e7:	48 01 ee             	add    rsi,rbp
     124a5ea:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
     124a5ef:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
     124a5f4:	e8 01 0d 00 00       	call   124b2fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9087e>
     124a5f9:	be b0 05 00 00       	mov    esi,0x5b0
     124a5fe:	4a 8d 3c 2e          	lea    rdi,[rsi+r13*1]
     124a602:	48 01 ee             	add    rsi,rbp
     124a605:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     124a60a:	e8 31 39 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124a60f:	be c8 05 00 00       	mov    esi,0x5c8
     124a614:	4a 8d 3c 2e          	lea    rdi,[rsi+r13*1]
     124a618:	48 01 ee             	add    rsi,rbp
     124a61b:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     124a620:	e8 8d c5 fb ff       	call   1206bb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c136>
     124a625:	41 be 00 06 00 00    	mov    r14d,0x600
     124a62b:	4f 8d 24 2e          	lea    r12,[r14+r13*1]
     124a62f:	0f 57 c0             	xorps  xmm0,xmm0
     124a632:	41 0f 11 85 00 06 00 	movups XMMWORD PTR [r13+0x600],xmm0
     124a639:	00 
     124a63a:	4c 89 2c 24          	mov    QWORD PTR [rsp],r13
     124a63e:	4d 89 a5 f8 05 00 00 	mov    QWORD PTR [r13+0x5f8],r12
     124a645:	48 8b 9d f8 05 00 00 	mov    rbx,QWORD PTR [rbp+0x5f8]
     124a64c:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
     124a651:	49 01 ee             	add    r14,rbp
     124a654:	4c 39 f3             	cmp    rbx,r14
     124a657:	0f 84 a9 00 00 00    	je     124a706 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fc8a>
     124a65d:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     124a661:	4c 8d a8 f8 05 00 00 	lea    r13,[rax+0x5f8]
     124a668:	4c 89 e5             	mov    rbp,r12
     124a66b:	4d 39 65 00          	cmp    QWORD PTR [r13+0x0],r12
     124a66f:	74 13                	je     124a684 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fc08>
     124a671:	4c 89 e7             	mov    rdi,r12
     124a674:	e8 97 54 89 ff       	call   adfb10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cab0>
     124a679:	48 89 c5             	mov    rbp,rax
     124a67c:	8b 53 1c             	mov    edx,DWORD PTR [rbx+0x1c]
     124a67f:	39 50 1c             	cmp    DWORD PTR [rax+0x1c],edx
     124a682:	7d 12                	jge    124a696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fc1a>
     124a684:	49 83 3c 24 00       	cmp    QWORD PTR [r12],0x0
     124a689:	74 24                	je     124a6af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fc33>
     124a68b:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp
     124a690:	48 83 c5 08          	add    rbp,0x8
     124a694:	eb 10                	jmp    124a6a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fc2a>
     124a696:	4c 89 ef             	mov    rdi,r13
     124a699:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     124a69e:	e8 91 54 89 ff       	call   adfb34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cad4>
     124a6a3:	48 89 c5             	mov    rbp,rax
     124a6a6:	48 83 7d 00 00       	cmp    QWORD PTR [rbp+0x0],0x0
     124a6ab:	75 45                	jne    124a6f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fc76>
     124a6ad:	eb 08                	jmp    124a6b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fc3b>
     124a6af:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
     124a6b4:	4c 89 e5             	mov    rbp,r12
     124a6b7:	6a 20                	push   0x20
     124a6b9:	5f                   	pop    rdi
     124a6ba:	e8 41 38 5a 00       	call   17edf00 <_Znwm@plt>
     124a6bf:	4c 89 64 24 50       	mov    QWORD PTR [rsp+0x50],r12
     124a6c4:	8b 4b 1c             	mov    ecx,DWORD PTR [rbx+0x1c]
     124a6c7:	89 48 1c             	mov    DWORD PTR [rax+0x1c],ecx
     124a6ca:	c6 44 24 58 01       	mov    BYTE PTR [rsp+0x58],0x1
     124a6cf:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
     124a6d4:	4c 89 ef             	mov    rdi,r13
     124a6d7:	48 89 ea             	mov    rdx,rbp
     124a6da:	48 89 c1             	mov    rcx,rax
     124a6dd:	e8 8a 54 89 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     124a6e2:	48 83 64 24 48 00    	and    QWORD PTR [rsp+0x48],0x0
     124a6e8:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     124a6ed:	e8 d8 fb 82 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     124a6f2:	48 89 df             	mov    rdi,rbx
     124a6f5:	e8 e8 40 85 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     124a6fa:	48 89 c3             	mov    rbx,rax
     124a6fd:	4c 39 f0             	cmp    rax,r14
     124a700:	0f 85 62 ff ff ff    	jne    124a668 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fbec>
     124a706:	41 bf 18 06 00 00    	mov    r15d,0x618
     124a70c:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     124a710:	4a 8d 2c 38          	lea    rbp,[rax+r15*1]
     124a714:	0f 57 c0             	xorps  xmm0,xmm0
     124a717:	0f 11 80 18 06 00 00 	movups XMMWORD PTR [rax+0x618],xmm0
     124a71e:	48 89 a8 10 06 00 00 	mov    QWORD PTR [rax+0x610],rbp
     124a725:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     124a72a:	4c 8b a8 10 06 00 00 	mov    r13,QWORD PTR [rax+0x610]
     124a731:	49 01 c7             	add    r15,rax
     124a734:	4d 39 fd             	cmp    r13,r15
     124a737:	0f 84 a9 00 00 00    	je     124a7e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fd6a>
     124a73d:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     124a741:	4c 8d b0 10 06 00 00 	lea    r14,[rax+0x610]
     124a748:	48 89 eb             	mov    rbx,rbp
     124a74b:	49 39 2e             	cmp    QWORD PTR [r14],rbp
     124a74e:	74 14                	je     124a764 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fce8>
     124a750:	48 89 ef             	mov    rdi,rbp
     124a753:	e8 b8 53 89 ff       	call   adfb10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cab0>
     124a758:	48 89 c3             	mov    rbx,rax
     124a75b:	41 8b 55 1c          	mov    edx,DWORD PTR [r13+0x1c]
     124a75f:	39 50 1c             	cmp    DWORD PTR [rax+0x1c],edx
     124a762:	7d 12                	jge    124a776 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fcfa>
     124a764:	48 83 7d 00 00       	cmp    QWORD PTR [rbp+0x0],0x0
     124a769:	74 23                	je     124a78e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fd12>
     124a76b:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
     124a770:	48 83 c3 08          	add    rbx,0x8
     124a774:	eb 10                	jmp    124a786 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fd0a>
     124a776:	4c 89 f7             	mov    rdi,r14
     124a779:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     124a77e:	e8 b1 53 89 ff       	call   adfb34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cad4>
     124a783:	48 89 c3             	mov    rbx,rax
     124a786:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     124a78a:	75 46                	jne    124a7d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fd56>
     124a78c:	eb 08                	jmp    124a796 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fd1a>
     124a78e:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp
     124a793:	48 89 eb             	mov    rbx,rbp
     124a796:	6a 20                	push   0x20
     124a798:	5f                   	pop    rdi
     124a799:	e8 62 37 5a 00       	call   17edf00 <_Znwm@plt>
     124a79e:	48 89 6c 24 50       	mov    QWORD PTR [rsp+0x50],rbp
     124a7a3:	41 8b 4d 1c          	mov    ecx,DWORD PTR [r13+0x1c]
     124a7a7:	89 48 1c             	mov    DWORD PTR [rax+0x1c],ecx
     124a7aa:	c6 44 24 58 01       	mov    BYTE PTR [rsp+0x58],0x1
     124a7af:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
     124a7b4:	4c 89 f7             	mov    rdi,r14
     124a7b7:	48 89 da             	mov    rdx,rbx
     124a7ba:	48 89 c1             	mov    rcx,rax
     124a7bd:	e8 aa 53 89 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     124a7c2:	48 83 64 24 48 00    	and    QWORD PTR [rsp+0x48],0x0
     124a7c8:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     124a7cd:	e8 f8 fa 82 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     124a7d2:	4c 89 ef             	mov    rdi,r13
     124a7d5:	e8 08 40 85 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     124a7da:	49 89 c5             	mov    r13,rax
     124a7dd:	4c 39 f8             	cmp    rax,r15
     124a7e0:	0f 85 62 ff ff ff    	jne    124a748 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fccc>
     124a7e6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124a7ed:	00 00 
     124a7ef:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     124a7f4:	0f 85 bf 00 00 00    	jne    124a8b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fe3d>
     124a7fa:	b8 28 06 00 00       	mov    eax,0x628
     124a7ff:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
     124a803:	48 01 c1             	add    rcx,rax
     124a806:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
     124a80b:	48 01 c2             	add    rdx,rax
     124a80e:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
     124a811:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     124a814:	48 83 c4 68          	add    rsp,0x68
     124a818:	5b                   	pop    rbx
     124a819:	41 5c                	pop    r12
     124a81b:	41 5d                	pop    r13
     124a81d:	41 5e                	pop    r14
     124a81f:	41 5f                	pop    r15
     124a821:	5d                   	pop    rbp
     124a822:	c3                   	ret
     124a823:	49 89 c6             	mov    r14,rax
     124a826:	eb 6f                	jmp    124a897 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fe1b>
     124a828:	49 89 c6             	mov    r14,rax
     124a82b:	eb 42                	jmp    124a86f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fdf3>
     124a82d:	49 89 c6             	mov    r14,rax
     124a830:	eb 47                	jmp    124a879 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fdfd>
     124a832:	49 89 c6             	mov    r14,rax
     124a835:	eb 4c                	jmp    124a883 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fe07>
     124a837:	49 89 c6             	mov    r14,rax
     124a83a:	eb 51                	jmp    124a88d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fe11>
     124a83c:	49 89 c6             	mov    r14,rax
     124a83f:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     124a844:	e8 6d 0b 00 00       	call   124b3b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9093a>
     124a849:	eb 4c                	jmp    124a897 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fe1b>
     124a84b:	49 89 c6             	mov    r14,rax
     124a84e:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     124a852:	e8 63 3d 89 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
     124a857:	eb 03                	jmp    124a85c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fde0>
     124a859:	49 89 c6             	mov    r14,rax
     124a85c:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     124a860:	e8 55 3d 89 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
     124a865:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     124a86a:	e8 35 f1 e3 ff       	call   10899a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250dba>
     124a86f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     124a874:	e8 17 36 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124a879:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     124a87e:	e8 69 f1 e3 ff       	call   10899ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e02>
     124a883:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     124a888:	e8 5f f1 e3 ff       	call   10899ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e02>
     124a88d:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     124a892:	e8 91 f1 e3 ff       	call   1089a28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e3e>
     124a897:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124a89e:	00 00 
     124a8a0:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     124a8a5:	75 12                	jne    124a8b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fe3d>
     124a8a7:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     124a8ac:	e8 b3 f1 e3 ff       	call   1089a64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e7a>
     124a8b1:	4c 89 f7             	mov    rdi,r14
     124a8b4:	e8 17 54 82 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     124a8b9:	e8 f2 51 5a 00       	call   17efab0 <__stack_chk_fail@plt>

