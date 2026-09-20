# Ad runtime object source + event subtype 6 trace

Known ad-model constructor 0x14e15e4 installs vptr 0x1879950.
Known restriction-owner callback consumes event byte +0x38 == 6.

## Direct xrefs to constructors/helpers

### ad-model constructor: 0x14e15e4
- callsite 0x1439735; caller (21206780, 21206894)
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

- callsite 0x1509b85; caller (22059256, 22066728)
  strings: pod | id | dummy | is_dsa_eligible | clickthrough | tracking_events | metadata | cover_art | audio | video | display | companions | verifications | ad_decision_tree
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

Total direct xrefs: 2

### nested optional copy wrapper: 0x108da66
- callsite 0x108d97b; caller (17356940, 17357357)
     108d931:	48 8b 85 a8 03 00 00 	mov    rax,QWORD PTR [rbp+0x3a8]
     108d938:	48 89 83 a8 03 00 00 	mov    QWORD PTR [rbx+0x3a8],rax
     108d93f:	be b0 03 00 00       	mov    esi,0x3b0
     108d944:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108d948:	48 01 ee             	add    rsi,rbp
     108d94b:	e8 16 ee a3 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     108d950:	0f 10 85 d0 03 00 00 	movups xmm0,XMMWORD PTR [rbp+0x3d0]
     108d957:	0f 10 8d e0 03 00 00 	movups xmm1,XMMWORD PTR [rbp+0x3e0]
     108d95e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108d965:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108d96c:	be f0 03 00 00       	mov    esi,0x3f0
     108d971:	4c 8d 3c 33          	lea    r15,[rbx+rsi*1]
     108d975:	48 01 ee             	add    rsi,rbp
     108d978:	4c 89 ff             	mov    rdi,r15
     108d97b:	e8 e6 00 00 00       	call   108da66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e7c>
     108d980:	be 30 04 00 00       	mov    esi,0x430
     108d985:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108d989:	48 01 ee             	add    rsi,rbp
     108d98c:	e8 33 f5 ff ff       	call   108cec4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2542da>
     108d991:	48 8b 85 48 05 00 00 	mov    rax,QWORD PTR [rbp+0x548]
     108d998:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108d99f:	48 83 c4 18          	add    rsp,0x18
     108d9a3:	5b                   	pop    rbx
     108d9a4:	41 5c                	pop    r12
     108d9a6:	41 5d                	pop    r13
     108d9a8:	41 5e                	pop    r14
     108d9aa:	41 5f                	pop    r15
     108d9ac:	5d                   	pop    rbp
     108d9ad:	c3                   	ret
     108d9ae:	48 89 c5             	mov    rbp,rax
     108d9b1:	4c 89 ff             	mov    rdi,r15
     108d9b4:	e8 1f c1 ff ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>

- callsite 0x124aea0; caller (19181110, 19181725)
     124ae5b:	48 83 c6 48          	add    rsi,0x48
     124ae5f:	49 8d 95 90 00 00 00 	lea    rdx,[r13+0x90]
     124ae66:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     124ae6b:	4c 89 f9             	mov    rcx,r15
     124ae6e:	e8 ef 02 00 00       	call   124b162 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906e6>
     124ae73:	41 8a 85 4c 05 00 00 	mov    al,BYTE PTR [r13+0x54c]
     124ae7a:	41 0a 85 f0 01 00 00 	or     al,BYTE PTR [r13+0x1f0]
     124ae81:	41 0f 94 c4          	sete   r12b
     124ae85:	4d 8d 75 18          	lea    r14,[r13+0x18]
     124ae89:	48 89 df             	mov    rdi,rbx
     124ae8c:	4c 89 f6             	mov    rsi,r14
     124ae8f:	e8 ac 30 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124ae94:	49 8d b5 f0 03 00 00 	lea    rsi,[r13+0x3f0]
     124ae9b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aea0:	e8 c1 2b e4 ff       	call   108da66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e7c>
     124aea5:	48 8d 6b 18          	lea    rbp,[rbx+0x18]
     124aea9:	80 7c 24 68 00       	cmp    BYTE PTR [rsp+0x68],0x0
     124aeae:	74 26                	je     124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aeb0:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     124aeb5:	48 85 f6             	test   rsi,rsi
     124aeb8:	74 1c                	je     124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aeba:	80 7c 24 60 00       	cmp    BYTE PTR [rsp+0x60],0x0
     124aebf:	75 15                	jne    124aed6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9045a>
     124aec1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     124aec4:	48 89 ef             	mov    rdi,rbp
     124aec7:	ff 50 38             	call   QWORD PTR [rax+0x38]
     124aeca:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aecf:	e8 04 ec e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aed4:	eb 15                	jmp    124aeeb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9046f>
     124aed6:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     124aedb:	e8 f8 eb e3 ff       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
     124aee0:	48 89 ef             	mov    rdi,rbp

Total direct xrefs: 2

### nested shared payload copy: 0x108da9a
- callsite 0x108da79; caller (17357414, 17357465)
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

- callsite 0x108dc0f; caller (17357552, 17357886)
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

Total direct xrefs: 2

### nested optional assignment: 0x108e3d0
- callsite 0x108de91; caller (17358036, 17358525)
     108de47:	c6 83 c8 03 00 00 01 	mov    BYTE PTR [rbx+0x3c8],0x1
     108de4e:	41 0f 10 86 d0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3d0]
     108de55:	00 
     108de56:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108de5d:	00 
     108de5e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108de65:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108de6c:	31 c0                	xor    eax,eax
     108de6e:	88 83 f0 03 00 00    	mov    BYTE PTR [rbx+0x3f0],al
     108de74:	88 83 28 04 00 00    	mov    BYTE PTR [rbx+0x428],al
     108de7a:	41 38 86 28 04 00 00 	cmp    BYTE PTR [r14+0x428],al
     108de81:	74 13                	je     108de96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552ac>
     108de83:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
     108de8a:	49 8d b6 f0 03 00 00 	lea    rsi,[r14+0x3f0]
     108de91:	e8 3a 05 00 00       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
     108de96:	be 30 04 00 00       	mov    esi,0x430
     108de9b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108de9f:	4c 01 f6             	add    rsi,r14
     108dea2:	e8 8b 03 00 00       	call   108e232 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255648>
     108dea7:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108deae:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108deb5:	48 83 c4 08          	add    rsp,0x8
     108deb9:	5b                   	pop    rbx
     108deba:	41 5e                	pop    r14
     108debc:	c3                   	ret
     108debd:	cc                   	int3
     108debe:	41 56                	push   r14
     108dec0:	53                   	push   rbx
     108dec1:	50                   	push   rax
     108dec2:	49 89 f6             	mov    r14,rsi
     108dec5:	48 89 fb             	mov    rbx,rdi
     108dec8:	31 c0                	xor    eax,eax

- callsite 0x1365c35; caller (20339234, 20344076)
     1365bfe:	e8 61 fb 76 ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
     1365c03:	8a 84 24 28 0e 00 00 	mov    al,BYTE PTR [rsp+0xe28]
     1365c0a:	88 84 24 78 13 00 00 	mov    BYTE PTR [rsp+0x1378],al
     1365c11:	eb 27                	jmp    1365c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab1be>
     1365c13:	48 8d bc 24 58 0f 00 	lea    rdi,[rsp+0xf58]
     1365c1a:	00 
     1365c1b:	48 8d b4 24 08 0a 00 	lea    rsi,[rsp+0xa08]
     1365c22:	00 
     1365c23:	e8 9a 80 d2 ff       	call   108dcc2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2550d8>
     1365c28:	eb 62                	jmp    1365c8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab210>
     1365c2a:	84 c0                	test   al,al
     1365c2c:	74 07                	je     1365c35 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab1b9>
     1365c2e:	e8 0b 80 d2 ff       	call   108dc3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255054>
     1365c33:	eb 05                	jmp    1365c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab1be>
     1365c35:	e8 96 87 d2 ff       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
     1365c3a:	b8 30 04 00 00       	mov    eax,0x430
     1365c3f:	49 01 c7             	add    r15,rax
     1365c42:	49 01 c6             	add    r14,rax
     1365c45:	8a 84 24 98 14 00 00 	mov    al,BYTE PTR [rsp+0x1498]
     1365c4c:	3a 84 24 48 0f 00 00 	cmp    al,BYTE PTR [rsp+0xf48]
     1365c53:	75 11                	jne    1365c66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab1ea>
     1365c55:	84 c0                	test   al,al
     1365c57:	74 23                	je     1365c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab200>
     1365c59:	4c 89 ff             	mov    rdi,r15
     1365c5c:	4c 89 f6             	mov    rsi,r14
     1365c5f:	e8 f2 51 e9 ff       	call   11fae56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x403da>
     1365c64:	eb 16                	jmp    1365c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab200>
     1365c66:	4c 89 ff             	mov    rdi,r15
     1365c69:	84 c0                	test   al,al
     1365c6b:	74 07                	je     1365c74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab1f8>
     1365c6d:	e8 3e 77 d2 ff       	call   108d3b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2547c6>
     1365c72:	eb 08                	jmp    1365c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ab200>

Total direct xrefs: 2

## Direct vptr stores for 0x1879950

### 0x145580b; FDE=(21321732, 21321969)
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

### 0x14e15ff; FDE=(21894628, 21894886)
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

## Immediate stores of event subtype 6 to +0x38

Exact immediate +0x38=6 stores: 5
### 0xa472c9: mov    DWORD PTR [rsp+0x38],0x6; FDE=(10776736, 10777887)
Strings: %A | %a | %b | %B | %p
      a47287:	4c 89 ff             	mov    rdi,r15
      a4728a:	4c 89 ea             	mov    rdx,r13
      a4728d:	4c 89 f1             	mov    rcx,r14
      a47290:	e8 fb 8f da 00       	call   17f0290 <strftime_l@plt>
      a47295:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
      a4729c:	4c 89 fe             	mov    rsi,r15
      a4729f:	e8 b8 48 03 00       	call   a7bb5c <JNI_OnUnload@@Base+0x3429>
      a472a4:	4c 8b 03             	mov    r8,QWORD PTR [rbx]
      a472a7:	be 64 00 00 00       	mov    esi,0x64
      a472ac:	4c 89 ff             	mov    rdi,r15
      a472af:	48 89 ea             	mov    rdx,rbp
      a472b2:	4c 89 f1             	mov    rcx,r14
      a472b5:	e8 d6 8f da 00       	call   17f0290 <strftime_l@plt>
      a472ba:	48 8d bb 28 01 00 00 	lea    rdi,[rbx+0x128]
      a472c1:	4c 89 fe             	mov    rsi,r15
      a472c4:	e8 93 48 03 00       	call   a7bb5c <JNI_OnUnload@@Base+0x3429>
      a472c9:	c7 44 24 38 06 00 00 	mov    DWORD PTR [rsp+0x38],0x6
      a472d0:	00 
      a472d1:	4c 8b 03             	mov    r8,QWORD PTR [rbx]
      a472d4:	be 64 00 00 00       	mov    esi,0x64
      a472d9:	4c 89 ff             	mov    rdi,r15
      a472dc:	4c 89 ea             	mov    rdx,r13
      a472df:	4c 89 f1             	mov    rcx,r14
      a472e2:	e8 a9 8f da 00       	call   17f0290 <strftime_l@plt>
      a472e7:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
      a472ee:	4c 89 fe             	mov    rsi,r15
      a472f1:	e8 66 48 03 00       	call   a7bb5c <JNI_OnUnload@@Base+0x3429>
      a472f6:	4c 8b 03             	mov    r8,QWORD PTR [rbx]
      a472f9:	be 64 00 00 00       	mov    esi,0x64
      a472fe:	4c 89 ff             	mov    rdi,r15
      a47301:	48 89 ea             	mov    rdx,rbp
      a47304:	4c 89 f1             	mov    rcx,r14
      a47307:	e8 84 8f da 00       	call   17f0290 <strftime_l@plt>
      a4730c:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
      a47313:	4c 89 fe             	mov    rsi,r15
      a47316:	e8 41 48 03 00       	call   a7bb5c <JNI_OnUnload@@Base+0x3429>
      a4731b:	4c 8d ab 78 02 00 00 	lea    r13,[rbx+0x278]
      a47322:	45 31 e4             	xor    r12d,r12d

### 0x139ba71: mov    BYTE PTR [rsi+0x38],0x6; FDE=(20560346, 20561320)
Strings: ad_skip
     139ba30:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     139ba36:	49 89 c6             	mov    r14,rax
     139ba39:	48 85 c0             	test   rax,rax
     139ba3c:	7e 4e                	jle    139ba8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1010>
     139ba3e:	48 8d 35 9a 4c fb fe 	lea    rsi,[rip+0xfffffffffefb4c9a]        # 3506df <_ZTSSt12bad_any_cast@@Base-0x3fae9>
     139ba45:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139ba4c:	00 
     139ba4d:	e8 2c e0 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     139ba52:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
     139ba59:	00 
     139ba5a:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     139ba5e:	49 69 c6 e8 03 00 00 	imul   rax,r14,0x3e8
     139ba65:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     139ba69:	31 c0                	xor    eax,eax
     139ba6b:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     139ba6e:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     139ba71:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
     139ba75:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     139ba7a:	e8 1b 06 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     139ba7f:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139ba86:	00 
     139ba87:	e8 04 24 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139ba8c:	31 c0                	xor    eax,eax
     139ba8e:	4c 8d b4 24 c8 00 00 	lea    r14,[rsp+0xc8]
     139ba95:	00 
     139ba96:	41 88 46 f8          	mov    BYTE PTR [r14-0x8],al
     139ba9a:	0f 57 c0             	xorps  xmm0,xmm0
     139ba9d:	41 0f 29 46 d8       	movaps XMMWORD PTR [r14-0x28],xmm0
     139baa2:	41 88 46 e8          	mov    BYTE PTR [r14-0x18],al
     139baa6:	4c 89 f7             	mov    rdi,r14
     139baa9:	4c 89 fe             	mov    rsi,r15
     139baac:	e8 8f ea 9c ff       	call   d6a540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375c6>
     139bab1:	4c 8d a4 24 c0 01 00 	lea    r12,[rsp+0x1c0]
     139bab8:	00 
     139bab9:	49 81 c7 f8 00 00 00 	add    r15,0xf8
     139bac0:	4c 89 e7             	mov    rdi,r12
     139bac3:	4c 89 fe             	mov    rsi,r15
     139bac6:	e8 59 a3 ff ff       	call   1395e24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1db3a8>

### 0x139be38: mov    BYTE PTR [rsi+0x38],0x6; FDE=(20561320, 20562040)
Strings: ad_skip
     139bdf7:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     139bdfd:	49 89 c7             	mov    r15,rax
     139be00:	48 85 c0             	test   rax,rax
     139be03:	7e 4e                	jle    139be53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e13d7>
     139be05:	48 8d 35 d3 48 fb fe 	lea    rsi,[rip+0xfffffffffefb48d3]        # 3506df <_ZTSSt12bad_any_cast@@Base-0x3fae9>
     139be0c:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139be13:	00 
     139be14:	e8 65 dc 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     139be19:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
     139be20:	00 
     139be21:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     139be25:	49 69 c7 e8 03 00 00 	imul   rax,r15,0x3e8
     139be2c:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     139be30:	31 c0                	xor    eax,eax
     139be32:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     139be35:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     139be38:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
     139be3c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     139be41:	e8 54 02 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     139be46:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139be4d:	00 
     139be4e:	e8 3d 20 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139be53:	40 8a ab b0 0b 00 00 	mov    bpl,BYTE PTR [rbx+0xbb0]
     139be5a:	f3 0f 10 83 d0 0b 00 	movss  xmm0,DWORD PTR [rbx+0xbd0]
     139be61:	00 
     139be62:	f3 0f 11 44 24 4c    	movss  DWORD PTR [rsp+0x4c],xmm0
     139be68:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     139be6f:	00 
     139be70:	4c 89 f6             	mov    rsi,r14
     139be73:	e8 36 9f fe ff       	call   1385dae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb332>
     139be78:	40 84 ed             	test   bpl,bpl
     139be7b:	74 08                	je     139be85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1409>
     139be7d:	f3 0f 10 4c 24 4c    	movss  xmm1,DWORD PTR [rsp+0x4c]
     139be83:	eb 08                	jmp    139be8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1411>
     139be85:	f3 0f 10 0d fb 27 ff 	movss  xmm1,DWORD PTR [rip+0xfffffffffeff27fb]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
     139be8c:	fe 
     139be8d:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
     139be94:	00 

### 0x16c570c: mov    DWORD PTR [r14+0x38],0x6; FDE=(23877202, 23892828)
Strings: config | album | ad | artist | top | tracks | search | suggest | track | trackset | concerts | show | episode | playlist | section | user | followers | collection | podcasts | episodes | autostart | local-files | following | global | internal | devices | local | toplist | image | publishedrootlist | history | localfileimage | country | rootlist | library | mosaic | folder | playqueue | partner | roottree | playlist-folder | app | albums | preferences | radio | instance | : | now-playing | your-episodes | follow | \n | audiofile | mp3 | ogg | dailymix | licensor | station | open | minimized | maximized | running | tempo | zerotap | media | audio | room | concept | cached-files | content-feed | prerelease | artist-music-videos | concert | list | content | transition | promotion | promotion-item | author | watch-feed | clip | genre | podcast-chapter | your-library | venue | sample | kallax | user-highlight | concert-campaign | recap | listeningstats | container
     16c56c1:	66 0f ef c0          	pxor   xmm0,xmm0
     16c56c5:	4c 8d b4 24 a0 04 00 	lea    r14,[rsp+0x4a0]
     16c56cc:	00 
     16c56cd:	66 41 0f 7f 46 20    	movdqa XMMWORD PTR [r14+0x20],xmm0
     16c56d3:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
     16c56d9:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     16c56de:	41 c7 46 38 07 00 00 	mov    DWORD PTR [r14+0x38],0x7
     16c56e5:	00 
     16c56e6:	66 41 c7 46 40 05 00 	mov    WORD PTR [r14+0x40],0x5
     16c56ed:	eb 2a                	jmp    16c5719 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79885>
     16c56ef:	66 0f ef c0          	pxor   xmm0,xmm0
     16c56f3:	4c 8d b4 24 a0 04 00 	lea    r14,[rsp+0x4a0]
     16c56fa:	00 
     16c56fb:	66 41 0f 7f 46 20    	movdqa XMMWORD PTR [r14+0x20],xmm0
     16c5701:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
     16c5707:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     16c570c:	41 c7 46 38 06 00 00 	mov    DWORD PTR [r14+0x38],0x6
     16c5713:	00 
     16c5714:	41 c6 46 40 00       	mov    BYTE PTR [r14+0x40],0x0
     16c5719:	48 89 df             	mov    rdi,rbx
     16c571c:	4c 89 f6             	mov    rsi,r14
     16c571f:	e8 38 3c 00 00       	call   16c935c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7d4c8>
     16c5724:	4c 89 f7             	mov    rdi,r14
     16c5727:	e8 02 fc ff ff       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     16c572c:	40 b5 01             	mov    bpl,0x1
     16c572f:	e9 18 3a 00 00       	jmp    16c914c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7d2b8>
     16c5734:	48 8d 15 3f 45 c6 fe 	lea    rdx,[rip+0xfffffffffec6453f]        # 329c7a <_ZTSSt12bad_any_cast@@Base-0x6654e>
     16c573b:	6a 05                	push   0x5
     16c573d:	59                   	pop    rcx
     16c573e:	4c 89 f7             	mov    rdi,r14
     16c5741:	4c 89 fe             	mov    rsi,r15
     16c5744:	e8 37 61 3b ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
     16c5749:	84 c0                	test   al,al
     16c574b:	0f 84 a2 00 00 00    	je     16c57f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7995f>
     16c5751:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
     16c5758:	00 
     16c5759:	e8 2b 3c 00 00       	call   16c9389 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7d4f5>
     16c575e:	48 85 d2             	test   rdx,rdx

### 0x16c839a: mov    DWORD PTR [r14+0x38],0x6; FDE=(23877202, 23892828)
Strings: config | album | ad | artist | top | tracks | search | suggest | track | trackset | concerts | show | episode | playlist | section | user | followers | collection | podcasts | episodes | autostart | local-files | following | global | internal | devices | local | toplist | image | publishedrootlist | history | localfileimage | country | rootlist | library | mosaic | folder | playqueue | partner | roottree | playlist-folder | app | albums | preferences | radio | instance | : | now-playing | your-episodes | follow | \n | audiofile | mp3 | ogg | dailymix | licensor | station | open | minimized | maximized | running | tempo | zerotap | media | audio | room | concept | cached-files | content-feed | prerelease | artist-music-videos | concert | list | content | transition | promotion | promotion-item | author | watch-feed | clip | genre | podcast-chapter | your-library | venue | sample | kallax | user-highlight | concert-campaign | recap | listeningstats | container
     16c8355:	0f 57 c0             	xorps  xmm0,xmm0
     16c8358:	4c 8d b4 24 a0 04 00 	lea    r14,[rsp+0x4a0]
     16c835f:	00 
     16c8360:	41 0f 29 46 20       	movaps XMMWORD PTR [r14+0x20],xmm0
     16c8365:	41 0f 29 46 10       	movaps XMMWORD PTR [r14+0x10],xmm0
     16c836a:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     16c836e:	41 c7 46 38 4a 00 00 	mov    DWORD PTR [r14+0x38],0x4a
     16c8375:	00 
     16c8376:	e9 86 dc ff ff       	jmp    16c6001 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a16d>
     16c837b:	31 c0                	xor    eax,eax
     16c837d:	66 0f ef c0          	pxor   xmm0,xmm0
     16c8381:	4c 8d b4 24 a0 04 00 	lea    r14,[rsp+0x4a0]
     16c8388:	00 
     16c8389:	66 41 0f 7f 46 20    	movdqa XMMWORD PTR [r14+0x20],xmm0
     16c838f:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
     16c8395:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     16c839a:	41 c7 46 38 06 00 00 	mov    DWORD PTR [r14+0x38],0x6
     16c83a1:	00 
     16c83a2:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
     16c83a6:	e9 6e d3 ff ff       	jmp    16c5719 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79885>
     16c83ab:	48 8d 15 19 19 c6 fe 	lea    rdx,[rip+0xfffffffffec61919]        # 329ccb <_ZTSSt12bad_any_cast@@Base-0x664fd>
     16c83b2:	6a 05                	push   0x5
     16c83b4:	59                   	pop    rcx
     16c83b5:	4c 89 f7             	mov    rdi,r14
     16c83b8:	4c 89 fe             	mov    rsi,r15
     16c83bb:	e8 c0 34 3b ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
     16c83c0:	84 c0                	test   al,al
     16c83c2:	74 54                	je     16c8418 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7c584>
     16c83c4:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
     16c83cb:	00 
     16c83cc:	e8 b8 0f 00 00       	call   16c9389 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7d4f5>
     16c83d1:	48 85 d2             	test   rdx,rdx
     16c83d4:	0f 84 70 0d 00 00    	je     16c914a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7d2b6>
     16c83da:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
     16c83e1:	00 
     16c83e2:	48 89 c6             	mov    rsi,rax
     16c83e5:	e8 fb f7 10 00       	call   17d7be5 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a06>
     16c83ea:	84 c0                	test   al,al

## Comparisons of event +0x38 against 6

### 0x10a9668: cmp    BYTE PTR [rsi+0x38],0x6; FDE=(17471080, 17471132)
     10a9641:	e8 a2 11 73 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     10a9646:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a964d:	00 00 
     10a964f:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     10a9654:	75 0d                	jne    10a9663 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a79>
     10a9656:	48 89 d8             	mov    rax,rbx
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

## One-level callers of ad-model constructor callers

### constructor caller (21206780, 21206894)
- 0x1439377 from (21205268, 21206780): call   14396fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ec80>
     1439356:	00 
     1439357:	4c 89 e7             	mov    rdi,r12
     143935a:	e8 c1 af 75 ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
     143935f:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     1439364:	4c 89 ef             	mov    rdi,r13
     1439367:	4c 89 e6             	mov    rsi,r12
     143936a:	e8 79 b0 f1 ff       	call   13543e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19996c>
     143936f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1439374:	4c 89 ee             	mov    rsi,r13
     1439377:	e8 80 03 00 00       	call   14396fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ec80>
     143937c:	48 8b 6c 24 20       	mov    rbp,QWORD PTR [rsp+0x20]
     1439381:	48 8d bd 28 01 00 00 	lea    rdi,[rbp+0x128]
     1439388:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     143938d:	e8 ee 4c 3b 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1439392:	48 8d 35 57 fe ff fe 	lea    rsi,[rip+0xfffffffffefffe57]        # 4391f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ec3f>
     1439399:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     143939e:	e8 9d 4b 3b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14393a3:	c7 84 24 90 00 00 00 	mov    DWORD PTR [rsp+0x90],0xa0
     14393aa:	a0 00 00 00 
     14393ae:	48 c7 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],0x1e
     14393b5:	00 1e 00 00 00 

- 0x14e8f64 from (21925678, 21926596): call   14396fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ec80>
     14e8f3f:	49 89 f6             	mov    r14,rsi
     14e8f42:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     14e8f47:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e8f4e:	00 00 
     14e8f50:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
     14e8f57:	00 
     14e8f58:	48 83 c6 18          	add    rsi,0x18
     14e8f5c:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
     14e8f61:	48 89 df             	mov    rdi,rbx
     14e8f64:	e8 93 07 f5 ff       	call   14396fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ec80>
     14e8f69:	49 8d 76 30          	lea    rsi,[r14+0x30]
     14e8f6d:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
     14e8f70:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
     14e8f77:	e8 04 51 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14e8f7c:	49 8d b6 80 00 00 00 	lea    rsi,[r14+0x80]
     14e8f83:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     14e8f87:	e8 d4 d7 93 ff       	call   e26760 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf37e6>
     14e8f8c:	49 8d b6 a8 00 00 00 	lea    rsi,[r14+0xa8]
     14e8f93:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
     14e8f9a:	e8 e1 50 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14e8f9f:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx

### constructor caller (22059256, 22066728)
- 0x145476b from (21317302, 21317689): call   15098f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ee7c>
     1454745:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     145474a:	0f 57 c0             	xorps  xmm0,xmm0
     145474d:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     1454751:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     1454756:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     145475b:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
     1454762:	00 
     1454763:	48 8d 4c 24 30       	lea    rcx,[rsp+0x30]
     1454768:	4c 89 e6             	mov    rsi,r12
     145476b:	e8 88 51 0b 00       	call   15098f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ee7c>
     1454770:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     1454775:	4c 8b 6f f8          	mov    r13,QWORD PTR [rdi-0x8]
     1454779:	4c 8d 3d 50 91 4d 00 	lea    r15,[rip+0x4d9150]        # 192d8d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x74ce0>
     1454780:	44 8b 67 f0          	mov    r12d,DWORD PTR [rdi-0x10]
     1454784:	e8 cb 26 65 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     1454789:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     145478e:	e8 fd 96 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1454793:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1454798:	e8 f3 96 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     145479d:	6a 01                	push   0x1
     145479f:	5d                   	pop    rbp

- 0x14f6c56 from (21981680, 21985448): call   15098f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ee7c>
     14f6c34:	00 
     14f6c35:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     14f6c39:	49 83 60 10 00       	and    QWORD PTR [r8+0x10],0x0
     14f6c3e:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     14f6c45:	00 
     14f6c46:	48 8d 94 24 b0 01 00 	lea    rdx,[rsp+0x1b0]
     14f6c4d:	00 
     14f6c4e:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     14f6c53:	4c 89 e9             	mov    rcx,r13
     14f6c56:	e8 9d 2c 01 00       	call   15098f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ee7c>
     14f6c5b:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
     14f6c62:	00 
     14f6c63:	e8 28 72 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14f6c68:	48 8d 84 24 60 01 00 	lea    rax,[rsp+0x160]
     14f6c6f:	00 
     14f6c70:	48 8d 0d 59 6c 43 00 	lea    rcx,[rip+0x436c59]        # 192d8d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x74ce0>
     14f6c77:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     14f6c7c:	48 39 48 f8          	cmp    QWORD PTR [rax-0x8],rcx
     14f6c80:	0f 85 14 02 00 00    	jne    14f6e9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33c41e>
     14f6c86:	83 bc 24 50 01 00 00 	cmp    DWORD PTR [rsp+0x150],0x0
     14f6c8d:	00 

- 0x1500e5d from (22021188, 22025454): call   15098f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ee7c>
     1500e38:	e8 51 2c ff ff       	call   14f3a8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339012>
     1500e3d:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]
     1500e44:	00 
     1500e45:	48 8d 94 24 20 02 00 	lea    rdx,[rsp+0x220]
     1500e4c:	00 
     1500e4d:	4c 8d 44 24 40       	lea    r8,[rsp+0x40]
     1500e52:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     1500e57:	4d 89 f4             	mov    r12,r14
     1500e5a:	4c 89 f1             	mov    rcx,r14
     1500e5d:	e8 96 8a 00 00       	call   15098f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ee7c>
     1500e62:	4c 8d bc 24 d8 01 00 	lea    r15,[rsp+0x1d8]
     1500e69:	00 
     1500e6a:	4c 8d 35 5f ca 42 00 	lea    r14,[rip+0x42ca5f]        # 192d8d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x74ce0>
     1500e71:	4d 39 77 f8          	cmp    QWORD PTR [r15-0x8],r14
     1500e75:	0f 85 e9 00 00 00    	jne    1500f64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3464e8>
     1500e7b:	83 bc 24 c8 01 00 00 	cmp    DWORD PTR [rsp+0x1c8],0x0
     1500e82:	00 
     1500e83:	0f 85 db 00 00 00    	jne    1500f64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3464e8>
     1500e89:	83 a4 24 90 01 00 00 	and    DWORD PTR [rsp+0x190],0x0
     1500e90:	00 
     1500e91:	4c 89 b4 24 98 01 00 	mov    QWORD PTR [rsp+0x198],r14

- 0x1509bc0 from (22059256, 22066728): jmp    1509bda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f15e>
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

- 0x1509f27 from (22059256, 22066728): jmp    1509f3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f4c0>
     1509f03:	4d 85 e4             	test   r12,r12
     1509f06:	0f 84 a7 00 00 00    	je     1509fb3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f537>
     1509f0c:	4c 89 bc 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r15
     1509f13:	00 
     1509f14:	f3 4d 0f b8 fc       	popcnt r15,r12
     1509f19:	49 83 ff 01          	cmp    r15,0x1
     1509f1d:	77 0a                	ja     1509f29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f4ad>
     1509f1f:	49 8d 5c 24 ff       	lea    rbx,[r12-0x1]
     1509f24:	4c 21 eb             	and    rbx,r13
     1509f27:	eb 13                	jmp    1509f3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f4c0>
     1509f29:	4c 89 eb             	mov    rbx,r13
     1509f2c:	4d 39 e5             	cmp    r13,r12
     1509f2f:	72 0b                	jb     1509f3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f4c0>
     1509f31:	4c 89 e8             	mov    rax,r13
     1509f34:	31 d2                	xor    edx,edx
     1509f36:	49 f7 f4             	div    r12
     1509f39:	48 89 d3             	mov    rbx,rdx
     1509f3c:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1509f3f:	48 8b 04 d8          	mov    rax,QWORD PTR [rax+rbx*8]
     1509f43:	48 85 c0             	test   rax,rax
     1509f46:	74 63                	je     1509fab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f52f>

- 0x1509f7b from (22059256, 22066728): jmp    150a189 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f70d>
     1509f5d:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     1509f61:	4c 39 e8             	cmp    rax,r13
     1509f64:	75 1a                	jne    1509f80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f504>
     1509f66:	48 8d 7d 10          	lea    rdi,[rbp+0x10]
     1509f6a:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
     1509f71:	00 
     1509f72:	e8 77 57 59 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1509f77:	84 c0                	test   al,al
     1509f79:	74 27                	je     1509fa2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f526>
     1509f7b:	e9 09 02 00 00       	jmp    150a189 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f70d>
     1509f80:	41 83 ff 01          	cmp    r15d,0x1
     1509f84:	77 0a                	ja     1509f90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f514>
     1509f86:	48 23 84 24 80 00 00 	and    rax,QWORD PTR [rsp+0x80]
     1509f8d:	00 
     1509f8e:	eb 0d                	jmp    1509f9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f521>
     1509f90:	4c 39 e0             	cmp    rax,r12
     1509f93:	72 08                	jb     1509f9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f521>
     1509f95:	31 d2                	xor    edx,edx
     1509f97:	49 f7 f4             	div    r12
     1509f9a:	48 89 d0             	mov    rax,rdx
     1509f9d:	48 39 d8             	cmp    rax,rbx

- 0x1509f8e from (22059256, 22066728): jmp    1509f9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f521>
     1509f71:	00 
     1509f72:	e8 77 57 59 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1509f77:	84 c0                	test   al,al
     1509f79:	74 27                	je     1509fa2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f526>
     1509f7b:	e9 09 02 00 00       	jmp    150a189 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f70d>
     1509f80:	41 83 ff 01          	cmp    r15d,0x1
     1509f84:	77 0a                	ja     1509f90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f514>
     1509f86:	48 23 84 24 80 00 00 	and    rax,QWORD PTR [rsp+0x80]
     1509f8d:	00 
     1509f8e:	eb 0d                	jmp    1509f9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f521>
     1509f90:	4c 39 e0             	cmp    rax,r12
     1509f93:	72 08                	jb     1509f9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f521>
     1509f95:	31 d2                	xor    edx,edx
     1509f97:	49 f7 f4             	div    r12
     1509f9a:	48 89 d0             	mov    rax,rdx
     1509f9d:	48 39 d8             	cmp    rax,rbx
     1509fa0:	75 09                	jne    1509fab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f52f>
     1509fa2:	48 8b 6d 00          	mov    rbp,QWORD PTR [rbp+0x0]
     1509fa6:	48 85 ed             	test   rbp,rbp
     1509fa9:	75 b2                	jne    1509f5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f4e1>
     1509fab:	48 8d ac 24 60 01 00 	lea    rbp,[rsp+0x160]

- 0x150a017 from (22059256, 22066728): jmp    150a02e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f5b2>
     1509ff6:	00 
     1509ff7:	e8 28 d4 63 ff       	call   b47424 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x943c4>
     1509ffc:	c6 84 24 70 01 00 00 	mov    BYTE PTR [rsp+0x170],0x1
     150a003:	01 
     150a004:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     150a009:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]
     150a00d:	48 ff c0             	inc    rax
     150a010:	78 07                	js     150a019 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f59d>
     150a012:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     150a017:	eb 15                	jmp    150a02e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f5b2>
     150a019:	48 89 c1             	mov    rcx,rax
     150a01c:	48 d1 e9             	shr    rcx,1
     150a01f:	83 e0 01             	and    eax,0x1
     150a022:	48 09 c8             	or     rax,rcx
     150a025:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     150a02a:	f3 0f 58 c0          	addss  xmm0,xmm0
     150a02e:	4c 89 e1             	mov    rcx,r12
     150a031:	48 d1 e9             	shr    rcx,1
     150a034:	44 89 e0             	mov    eax,r12d
     150a037:	83 e0 01             	and    eax,0x1
     150a03a:	48 09 c8             	or     rax,rcx

- 0x150a047 from (22059256, 22066728): jmp    150a052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f5d6>
     150a02a:	f3 0f 58 c0          	addss  xmm0,xmm0
     150a02e:	4c 89 e1             	mov    rcx,r12
     150a031:	48 d1 e9             	shr    rcx,1
     150a034:	44 89 e0             	mov    eax,r12d
     150a037:	83 e0 01             	and    eax,0x1
     150a03a:	48 09 c8             	or     rax,rcx
     150a03d:	4d 85 e4             	test   r12,r12
     150a040:	78 07                	js     150a049 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f5cd>
     150a042:	f3 49 0f 2a d4       	cvtsi2ss xmm2,r12
     150a047:	eb 09                	jmp    150a052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f5d6>
     150a049:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
     150a04e:	f3 0f 58 d2          	addss  xmm2,xmm2
     150a052:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     150a057:	f3 0f 10 48 40       	movss  xmm1,DWORD PTR [rax+0x40]
     150a05c:	74 0e                	je     150a06c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f5f0>
     150a05e:	f3 0f 59 d1          	mulss  xmm2,xmm1
     150a062:	0f 2e c2             	ucomiss xmm0,xmm2
     150a065:	77 05                	ja     150a06c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f5f0>
     150a067:	49 89 dd             	mov    r13,rbx
     150a06a:	eb 7b                	jmp    150a0e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f66b>
     150a06c:	49 83 fc 03          	cmp    r12,0x3

- 0x150a06a from (22059256, 22066728): jmp    150a0e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f66b>
     150a049:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
     150a04e:	f3 0f 58 d2          	addss  xmm2,xmm2
     150a052:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     150a057:	f3 0f 10 48 40       	movss  xmm1,DWORD PTR [rax+0x40]
     150a05c:	74 0e                	je     150a06c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f5f0>
     150a05e:	f3 0f 59 d1          	mulss  xmm2,xmm1
     150a062:	0f 2e c2             	ucomiss xmm0,xmm2
     150a065:	77 05                	ja     150a06c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f5f0>
     150a067:	49 89 dd             	mov    r13,rbx
     150a06a:	eb 7b                	jmp    150a0e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f66b>
     150a06c:	49 83 fc 03          	cmp    r12,0x3
     150a070:	0f 92 c0             	setb   al
     150a073:	49 8d 4c 24 ff       	lea    rcx,[r12-0x1]
     150a078:	49 85 cc             	test   r12,rcx
     150a07b:	0f 95 c1             	setne  cl
     150a07e:	08 c1                	or     cl,al
     150a080:	0f b6 c1             	movzx  eax,cl
     150a083:	f3 0f 5e c1          	divss  xmm0,xmm1
     150a087:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
     150a08d:	f3 48 0f 2c c8       	cvttss2si rcx,xmm0
     150a092:	4a 8d 04 60          	lea    rax,[rax+r12*2]

- 0x150a0d5 from (22059256, 22066728): jmp    150a0e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f66b>
     150a0b3:	48 0f 47 f0          	cmova  rsi,rax
     150a0b7:	4c 89 f7             	mov    rdi,r14
     150a0ba:	e8 e1 cf 5d ff       	call   ae70a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34040>
     150a0bf:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     150a0c4:	4c 8b 60 28          	mov    r12,QWORD PTR [rax+0x28]
     150a0c8:	49 8d 44 24 ff       	lea    rax,[r12-0x1]
     150a0cd:	49 85 c4             	test   r12,rax
     150a0d0:	75 05                	jne    150a0d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f65b>
     150a0d2:	49 21 c5             	and    r13,rax
     150a0d5:	eb 10                	jmp    150a0e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f66b>
     150a0d7:	4d 39 e5             	cmp    r13,r12
     150a0da:	72 0b                	jb     150a0e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f66b>
     150a0dc:	4c 89 e8             	mov    rax,r13
     150a0df:	31 d2                	xor    edx,edx
     150a0e1:	49 f7 f4             	div    r12
     150a0e4:	49 89 d5             	mov    r13,rdx
     150a0e7:	49 8b 06             	mov    rax,QWORD PTR [r14]
     150a0ea:	4a 8b 04 e8          	mov    rax,QWORD PTR [rax+r13*8]
     150a0ee:	48 8b 8c 24 60 01 00 	mov    rcx,QWORD PTR [rsp+0x160]
     150a0f5:	00 
     150a0f6:	48 85 c0             	test   rax,rax

- 0x150a101 from (22059256, 22066728): jmp    150a147 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f6cb>
     150a0e4:	49 89 d5             	mov    r13,rdx
     150a0e7:	49 8b 06             	mov    rax,QWORD PTR [r14]
     150a0ea:	4a 8b 04 e8          	mov    rax,QWORD PTR [rax+r13*8]
     150a0ee:	48 8b 8c 24 60 01 00 	mov    rcx,QWORD PTR [rsp+0x160]
     150a0f5:	00 
     150a0f6:	48 85 c0             	test   rax,rax
     150a0f9:	74 08                	je     150a103 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f687>
     150a0fb:	48 8b 10             	mov    rdx,QWORD PTR [rax]
     150a0fe:	48 89 11             	mov    QWORD PTR [rcx],rdx
     150a101:	eb 44                	jmp    150a147 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f6cb>
     150a103:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
     150a108:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     150a10b:	48 89 01             	mov    QWORD PTR [rcx],rax
     150a10e:	48 89 0a             	mov    QWORD PTR [rdx],rcx
     150a111:	49 8b 06             	mov    rax,QWORD PTR [r14]
     150a114:	4a 89 14 e8          	mov    QWORD PTR [rax+r13*8],rdx
     150a118:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     150a11b:	48 85 c0             	test   rax,rax
     150a11e:	74 2a                	je     150a14a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f6ce>
     150a120:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     150a124:	49 8d 54 24 ff       	lea    rdx,[r12-0x1]

- 0x150a131 from (22059256, 22066728): jmp    150a140 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f6c4>
     150a114:	4a 89 14 e8          	mov    QWORD PTR [rax+r13*8],rdx
     150a118:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     150a11b:	48 85 c0             	test   rax,rax
     150a11e:	74 2a                	je     150a14a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f6ce>
     150a120:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     150a124:	49 8d 54 24 ff       	lea    rdx,[r12-0x1]
     150a129:	49 85 d4             	test   r12,rdx
     150a12c:	75 05                	jne    150a133 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f6b7>
     150a12e:	48 21 d0             	and    rax,rdx
     150a131:	eb 0d                	jmp    150a140 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f6c4>
     150a133:	4c 39 e0             	cmp    rax,r12
     150a136:	72 08                	jb     150a140 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f6c4>
     150a138:	31 d2                	xor    edx,edx
     150a13a:	49 f7 f4             	div    r12
     150a13d:	48 89 d0             	mov    rax,rdx
     150a140:	48 c1 e0 03          	shl    rax,0x3
     150a144:	49 03 06             	add    rax,QWORD PTR [r14]
     150a147:	48 89 08             	mov    QWORD PTR [rax],rcx
     150a14a:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
     150a151:	00 00 
     150a153:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]

- 0x150a187 from (22059256, 22066728): jmp    150a1a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f72b>
     150a15f:	e8 e2 bd 5d ff       	call   ae5f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32ee6>
     150a164:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]
     150a16b:	00 
     150a16c:	4c 89 e7             	mov    rdi,r12
     150a16f:	e8 1c 3d 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150a174:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     150a179:	48 ff c1             	inc    rcx
     150a17c:	48 3b 4c 24 70       	cmp    rcx,QWORD PTR [rsp+0x70]
     150a181:	0f 85 2b fd ff ff    	jne    1509eb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f436>
     150a187:	eb 1e                	jmp    150a1a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f72b>
     150a189:	48 83 c5 28          	add    rbp,0x28
     150a18d:	48 89 ef             	mov    rdi,rbp
     150a190:	48 8b b4 24 e8 00 00 	mov    rsi,QWORD PTR [rsp+0xe8]
     150a197:	00 
     150a198:	e8 e3 3d 2e 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     150a19d:	48 8d ac 24 60 01 00 	lea    rbp,[rsp+0x160]
     150a1a4:	00 
     150a1a5:	eb bd                	jmp    150a164 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f6e8>
     150a1a7:	4c 89 e7             	mov    rdi,r12
     150a1aa:	48 8d 35 6b 45 e6 fe 	lea    rsi,[rip+0xfffffffffee6456b]        # 36e71c <_ZTSSt12bad_any_cast@@Base-0x21aac>
     150a1b1:	e8 c8 f8 56 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>

- 0x150a1a5 from (22059256, 22066728): jmp    150a164 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f6e8>
     150a181:	0f 85 2b fd ff ff    	jne    1509eb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f436>
     150a187:	eb 1e                	jmp    150a1a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f72b>
     150a189:	48 83 c5 28          	add    rbp,0x28
     150a18d:	48 89 ef             	mov    rdi,rbp
     150a190:	48 8b b4 24 e8 00 00 	mov    rsi,QWORD PTR [rsp+0xe8]
     150a197:	00 
     150a198:	e8 e3 3d 2e 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     150a19d:	48 8d ac 24 60 01 00 	lea    rbp,[rsp+0x160]
     150a1a4:	00 
     150a1a5:	eb bd                	jmp    150a164 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34f6e8>
     150a1a7:	4c 89 e7             	mov    rdi,r12
     150a1aa:	48 8d 35 6b 45 e6 fe 	lea    rsi,[rip+0xfffffffffee6456b]        # 36e71c <_ZTSSt12bad_any_cast@@Base-0x21aac>
     150a1b1:	e8 c8 f8 56 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     150a1b6:	48 8d 05 bb 0e 37 00 	lea    rax,[rip+0x370ebb]        # 187b078 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37760>
     150a1bd:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
     150a1c4:	00 
     150a1c5:	48 89 ac 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rbp
     150a1cc:	00 
     150a1cd:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150a1d2:	49 8d 56 50          	lea    rdx,[r14+0x50]
     150a1d6:	4c 89 e7             	mov    rdi,r12

- 0x150a4ed from (22059256, 22066728): jmp    150a580 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fb04>
     150a4c2:	4c 89 e7             	mov    rdi,r12
     150a4c5:	e8 36 3a 2e 00       	call   17edf00 <_Znwm@plt>
     150a4ca:	49 89 c6             	mov    r14,rax
     150a4cd:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     150a4d2:	4c 89 b0 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],r14
     150a4d9:	4c 89 b0 b8 00 00 00 	mov    QWORD PTR [rax+0xb8],r14
     150a4e0:	4d 01 f4             	add    r12,r14
     150a4e3:	4c 89 a0 c0 00 00 00 	mov    QWORD PTR [rax+0xc0],r12
     150a4ea:	4d 89 ec             	mov    r12,r13
     150a4ed:	e9 8e 00 00 00       	jmp    150a580 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fb04>
     150a4f2:	48 89 dd             	mov    rbp,rbx
     150a4f5:	e9 93 07 00 00       	jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150a4fa:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150a4ff:	e9 dc 01 00 00       	jmp    150a6e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc64>
     150a504:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150a50a:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     150a510:	6a 3b                	push   0x3b
     150a512:	58                   	pop    rax
     150a513:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150a518:	48 83 7c 24 48 00    	cmp    QWORD PTR [rsp+0x48],0x0
     150a51e:	0f 84 76 01 00 00    	je     150a69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc1e>

- 0x150a4f5 from (22059256, 22066728): jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150a4ca:	49 89 c6             	mov    r14,rax
     150a4cd:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     150a4d2:	4c 89 b0 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],r14
     150a4d9:	4c 89 b0 b8 00 00 00 	mov    QWORD PTR [rax+0xb8],r14
     150a4e0:	4d 01 f4             	add    r12,r14
     150a4e3:	4c 89 a0 c0 00 00 00 	mov    QWORD PTR [rax+0xc0],r12
     150a4ea:	4d 89 ec             	mov    r12,r13
     150a4ed:	e9 8e 00 00 00       	jmp    150a580 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fb04>
     150a4f2:	48 89 dd             	mov    rbp,rbx
     150a4f5:	e9 93 07 00 00       	jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150a4fa:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150a4ff:	e9 dc 01 00 00       	jmp    150a6e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc64>
     150a504:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150a50a:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     150a510:	6a 3b                	push   0x3b
     150a512:	58                   	pop    rax
     150a513:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150a518:	48 83 7c 24 48 00    	cmp    QWORD PTR [rsp+0x48],0x0
     150a51e:	0f 84 76 01 00 00    	je     150a69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc1e>
     150a524:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     150a529:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

- 0x150a4ff from (22059256, 22066728): jmp    150a6e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc64>
     150a4d2:	4c 89 b0 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],r14
     150a4d9:	4c 89 b0 b8 00 00 00 	mov    QWORD PTR [rax+0xb8],r14
     150a4e0:	4d 01 f4             	add    r12,r14
     150a4e3:	4c 89 a0 c0 00 00 00 	mov    QWORD PTR [rax+0xc0],r12
     150a4ea:	4d 89 ec             	mov    r12,r13
     150a4ed:	e9 8e 00 00 00       	jmp    150a580 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fb04>
     150a4f2:	48 89 dd             	mov    rbp,rbx
     150a4f5:	e9 93 07 00 00       	jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150a4fa:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150a4ff:	e9 dc 01 00 00       	jmp    150a6e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc64>
     150a504:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150a50a:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     150a510:	6a 3b                	push   0x3b
     150a512:	58                   	pop    rax
     150a513:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150a518:	48 83 7c 24 48 00    	cmp    QWORD PTR [rsp+0x48],0x0
     150a51e:	0f 84 76 01 00 00    	je     150a69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc1e>
     150a524:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     150a529:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     150a52e:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150a534:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0

- 0x150a542 from (22059256, 22066728): jmp    150a69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc1e>
     150a518:	48 83 7c 24 48 00    	cmp    QWORD PTR [rsp+0x48],0x0
     150a51e:	0f 84 76 01 00 00    	je     150a69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc1e>
     150a524:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     150a529:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     150a52e:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150a534:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     150a53a:	6a 3b                	push   0x3b
     150a53c:	58                   	pop    rax
     150a53d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150a542:	e9 53 01 00 00       	jmp    150a69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc1e>
     150a547:	48 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [rsi+0xb8]
     150a54e:	48 29 d0             	sub    rax,rdx
     150a551:	48 c1 f8 05          	sar    rax,0x5
     150a555:	4c 39 f8             	cmp    rax,r15
     150a558:	0f 83 11 01 00 00    	jae    150a66f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fbf3>
     150a55e:	4c 8d 24 c5 00 00 00 	lea    r12,[rax*8+0x0]
     150a565:	00 
     150a566:	4d 01 ec             	add    r12,r13
     150a569:	4c 89 ef             	mov    rdi,r13
     150a56c:	4c 89 e6             	mov    rsi,r12
     150a56f:	e8 d7 14 00 00       	call   150ba4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350fcf>

- 0x150a63c from (22059256, 22066728): jmp    150a641 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fbc5>
     150a61b:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     150a61f:	49 83 c4 08          	add    r12,0x8
     150a623:	4c 8b bc 24 38 01 00 	mov    r15,QWORD PTR [rsp+0x138]
     150a62a:	00 
     150a62b:	49 83 c7 20          	add    r15,0x20
     150a62f:	4c 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],r15
     150a636:	00 
     150a637:	49 39 dc             	cmp    r12,rbx
     150a63a:	75 92                	jne    150a5ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fb52>
     150a63c:	eb 03                	jmp    150a641 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fbc5>
     150a63e:	4d 89 f7             	mov    r15,r14
     150a641:	c6 84 24 58 01 00 00 	mov    BYTE PTR [rsp+0x158],0x1
     150a648:	01 
     150a649:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]
     150a650:	00 
     150a651:	4c 89 e7             	mov    rdi,r12
     150a654:	e8 1b b9 f4 ff       	call   1455f74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b4f8>
     150a659:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150a65e:	4d 89 be b8 00 00 00 	mov    QWORD PTR [r14+0xb8],r15
     150a665:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     150a66c:	00 

- 0x150a66d from (22059256, 22066728): jmp    150a69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc1e>
     150a648:	01 
     150a649:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]
     150a650:	00 
     150a651:	4c 89 e7             	mov    rdi,r12
     150a654:	e8 1b b9 f4 ff       	call   1455f74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b4f8>
     150a659:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150a65e:	4d 89 be b8 00 00 00 	mov    QWORD PTR [r14+0xb8],r15
     150a665:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     150a66c:	00 
     150a66d:	eb 2b                	jmp    150a69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34fc1e>
     150a66f:	4c 89 ef             	mov    rdi,r13
     150a672:	48 89 de             	mov    rsi,rbx
     150a675:	e8 d1 13 00 00       	call   150ba4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350fcf>
     150a67a:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     150a681:	00 
     150a682:	4c 89 f7             	mov    rdi,r14
     150a685:	48 89 c6             	mov    rsi,rax
     150a688:	e8 6d b2 f4 ff       	call   14558fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ae7e>
     150a68d:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]
     150a694:	00 
     150a695:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]

- 0x150a8f7 from (22059256, 22066728): jmp    150a992 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ff16>
     150a8cc:	4c 89 e7             	mov    rdi,r12
     150a8cf:	e8 2c 36 2e 00       	call   17edf00 <_Znwm@plt>
     150a8d4:	49 89 c6             	mov    r14,rax
     150a8d7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     150a8dc:	4c 89 b0 c8 00 00 00 	mov    QWORD PTR [rax+0xc8],r14
     150a8e3:	4c 89 b0 d0 00 00 00 	mov    QWORD PTR [rax+0xd0],r14
     150a8ea:	4d 01 f4             	add    r12,r14
     150a8ed:	4c 89 a0 d8 00 00 00 	mov    QWORD PTR [rax+0xd8],r12
     150a8f4:	4d 89 ec             	mov    r12,r13
     150a8f7:	e9 96 00 00 00       	jmp    150a992 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ff16>
     150a8fc:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150a903:	00 
     150a904:	e8 1b 8b 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150a909:	48 8d ac 24 60 01 00 	lea    rbp,[rsp+0x160]
     150a910:	00 
     150a911:	e9 91 02 00 00       	jmp    150aba7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35012b>
     150a916:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150a91c:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     150a922:	6a 3c                	push   0x3c
     150a924:	58                   	pop    rax
     150a925:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax

- 0x150a911 from (22059256, 22066728): jmp    150aba7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35012b>
     150a8ea:	4d 01 f4             	add    r12,r14
     150a8ed:	4c 89 a0 d8 00 00 00 	mov    QWORD PTR [rax+0xd8],r12
     150a8f4:	4d 89 ec             	mov    r12,r13
     150a8f7:	e9 96 00 00 00       	jmp    150a992 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ff16>
     150a8fc:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150a903:	00 
     150a904:	e8 1b 8b 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150a909:	48 8d ac 24 60 01 00 	lea    rbp,[rsp+0x160]
     150a910:	00 
     150a911:	e9 91 02 00 00       	jmp    150aba7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35012b>
     150a916:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150a91c:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     150a922:	6a 3c                	push   0x3c
     150a924:	58                   	pop    rax
     150a925:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150a92a:	48 83 7c 24 48 00    	cmp    QWORD PTR [rsp+0x48],0x0
     150a930:	0f 84 72 01 00 00    	je     150aaa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35002c>
     150a936:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     150a93b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     150a940:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150a946:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0

- 0x150a954 from (22059256, 22066728): jmp    150aaa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35002c>
     150a92a:	48 83 7c 24 48 00    	cmp    QWORD PTR [rsp+0x48],0x0
     150a930:	0f 84 72 01 00 00    	je     150aaa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35002c>
     150a936:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     150a93b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     150a940:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150a946:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     150a94c:	6a 3c                	push   0x3c
     150a94e:	58                   	pop    rax
     150a94f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150a954:	e9 4f 01 00 00       	jmp    150aaa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35002c>
     150a959:	48 8b 86 d0 00 00 00 	mov    rax,QWORD PTR [rsi+0xd0]
     150a960:	48 29 d0             	sub    rax,rdx
     150a963:	48 c1 f8 05          	sar    rax,0x5
     150a967:	4c 39 f8             	cmp    rax,r15
     150a96a:	0f 83 0d 01 00 00    	jae    150aa7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350001>
     150a970:	4c 8d 24 c5 00 00 00 	lea    r12,[rax*8+0x0]
     150a977:	00 
     150a978:	4d 01 ec             	add    r12,r13
     150a97b:	4c 89 ef             	mov    rdi,r13
     150a97e:	4c 89 e6             	mov    rsi,r12
     150a981:	e8 c5 10 00 00       	call   150ba4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350fcf>

- 0x150aa4a from (22059256, 22066728): jmp    150aa4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ffd3>
     150aa29:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     150aa2d:	49 83 c4 08          	add    r12,0x8
     150aa31:	4c 8b bc 24 38 01 00 	mov    r15,QWORD PTR [rsp+0x138]
     150aa38:	00 
     150aa39:	49 83 c7 20          	add    r15,0x20
     150aa3d:	4c 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],r15
     150aa44:	00 
     150aa45:	49 39 dc             	cmp    r12,rbx
     150aa48:	75 96                	jne    150a9e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ff64>
     150aa4a:	eb 03                	jmp    150aa4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34ffd3>
     150aa4c:	4d 89 f7             	mov    r15,r14
     150aa4f:	c6 84 24 58 01 00 00 	mov    BYTE PTR [rsp+0x158],0x1
     150aa56:	01 
     150aa57:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]
     150aa5e:	00 
     150aa5f:	4c 89 e7             	mov    rdi,r12
     150aa62:	e8 41 b5 f4 ff       	call   1455fa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b52c>
     150aa67:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150aa6c:	4d 89 be d0 00 00 00 	mov    QWORD PTR [r14+0xd0],r15
     150aa73:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     150aa7a:	00 

- 0x150aa7b from (22059256, 22066728): jmp    150aaa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35002c>
     150aa56:	01 
     150aa57:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]
     150aa5e:	00 
     150aa5f:	4c 89 e7             	mov    rdi,r12
     150aa62:	e8 41 b5 f4 ff       	call   1455fa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b52c>
     150aa67:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150aa6c:	4d 89 be d0 00 00 00 	mov    QWORD PTR [r14+0xd0],r15
     150aa73:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     150aa7a:	00 
     150aa7b:	eb 2b                	jmp    150aaa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35002c>
     150aa7d:	4c 89 ef             	mov    rdi,r13
     150aa80:	48 89 de             	mov    rsi,rbx
     150aa83:	e8 c3 0f 00 00       	call   150ba4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350fcf>
     150aa88:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     150aa8f:	00 
     150aa90:	4c 89 f7             	mov    rdi,r14
     150aa93:	48 89 c6             	mov    rsi,rax
     150aa96:	e8 97 ae f4 ff       	call   1455932 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29aeb6>
     150aa9b:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]
     150aaa2:	00 
     150aaa3:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]

- 0x150ab3a from (22059256, 22066728): jmp    150abf6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35017a>
     150ab1d:	48 89 df             	mov    rdi,rbx
     150ab20:	e8 49 e2 ff ff       	call   1508d6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e2f2>
     150ab25:	4c 8d 73 50          	lea    r14,[rbx+0x50]
     150ab29:	84 c0                	test   al,al
     150ab2b:	75 3a                	jne    150ab67 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3500eb>
     150ab2d:	4c 89 f3             	mov    rbx,r14
     150ab30:	4d 39 e6             	cmp    r14,r12
     150ab33:	75 e8                	jne    150ab1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3500a1>
     150ab35:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150ab3a:	e9 b7 00 00 00       	jmp    150abf6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35017a>
     150ab3f:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     150ab44:	48 85 ff             	test   rdi,rdi
     150ab47:	74 05                	je     150ab4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3500d2>
     150ab49:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
     150ab4e:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150ab54:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     150ab5a:	6a 35                	push   0x35
     150ab5c:	58                   	pop    rax
     150ab5d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150ab62:	e9 26 01 00 00       	jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150ab67:	4d 39 e6             	cmp    r14,r12

- 0x150ab62 from (22059256, 22066728): jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150ab3f:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     150ab44:	48 85 ff             	test   rdi,rdi
     150ab47:	74 05                	je     150ab4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3500d2>
     150ab49:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
     150ab4e:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150ab54:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     150ab5a:	6a 35                	push   0x35
     150ab5c:	58                   	pop    rax
     150ab5d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150ab62:	e9 26 01 00 00       	jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150ab67:	4d 39 e6             	cmp    r14,r12
     150ab6a:	74 45                	je     150abb1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350135>
     150ab6c:	4c 89 f7             	mov    rdi,r14
     150ab6f:	e8 fa e1 ff ff       	call   1508d6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e2f2>
     150ab74:	84 c0                	test   al,al
     150ab76:	75 0f                	jne    150ab87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35010b>
     150ab78:	48 89 df             	mov    rdi,rbx
     150ab7b:	4c 89 f6             	mov    rsi,r14
     150ab7e:	e8 2d e2 ff ff       	call   1508db0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e334>
     150ab83:	48 83 c3 50          	add    rbx,0x50
     150ab87:	49 83 c6 50          	add    r14,0x50

- 0x150ab9d from (22059256, 22066728): jmp    150abb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35013a>
     150ab7b:	4c 89 f6             	mov    rsi,r14
     150ab7e:	e8 2d e2 ff ff       	call   1508db0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e334>
     150ab83:	48 83 c3 50          	add    rbx,0x50
     150ab87:	49 83 c6 50          	add    r14,0x50
     150ab8b:	4d 39 e6             	cmp    r14,r12
     150ab8e:	75 dc                	jne    150ab6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3500f0>
     150ab90:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150ab95:	4d 8b 7e 68          	mov    r15,QWORD PTR [r14+0x68]
     150ab99:	4d 8b 66 70          	mov    r12,QWORD PTR [r14+0x70]
     150ab9d:	eb 17                	jmp    150abb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35013a>
     150ab9f:	48 89 df             	mov    rdi,rbx
     150aba2:	e8 7d 88 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150aba7:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     150abac:	e9 dc 00 00 00       	jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150abb1:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150abb6:	4c 39 e3             	cmp    rbx,r12
     150abb9:	74 3b                	je     150abf6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35017a>
     150abbb:	b0 01                	mov    al,0x1
     150abbd:	84 c0                	test   al,al
     150abbf:	75 1b                	jne    150abdc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350160>
     150abc1:	4d 89 e6             	mov    r14,r12

- 0x150abac from (22059256, 22066728): jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150ab8b:	4d 39 e6             	cmp    r14,r12
     150ab8e:	75 dc                	jne    150ab6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3500f0>
     150ab90:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150ab95:	4d 8b 7e 68          	mov    r15,QWORD PTR [r14+0x68]
     150ab99:	4d 8b 66 70          	mov    r12,QWORD PTR [r14+0x70]
     150ab9d:	eb 17                	jmp    150abb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35013a>
     150ab9f:	48 89 df             	mov    rdi,rbx
     150aba2:	e8 7d 88 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150aba7:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     150abac:	e9 dc 00 00 00       	jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150abb1:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     150abb6:	4c 39 e3             	cmp    rbx,r12
     150abb9:	74 3b                	je     150abf6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35017a>
     150abbb:	b0 01                	mov    al,0x1
     150abbd:	84 c0                	test   al,al
     150abbf:	75 1b                	jne    150abdc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350160>
     150abc1:	4d 89 e6             	mov    r14,r12
     150abc4:	48 89 df             	mov    rdi,rbx
     150abc7:	4c 89 f6             	mov    rsi,r14
     150abca:	e8 e1 e1 ff ff       	call   1508db0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e334>
     150abcf:	49 83 c6 50          	add    r14,0x50

- 0x150ac58 from (22059256, 22066728): jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150ac31:	e8 4a 34 2e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     150ac36:	31 c0                	xor    eax,eax
     150ac38:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150ac3d:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     150ac42:	48 85 ff             	test   rdi,rdi
     150ac45:	74 05                	je     150ac4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3501d0>
     150ac47:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
     150ac4c:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150ac52:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     150ac58:	eb 33                	jmp    150ac8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350211>
     150ac5a:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     150ac5f:	48 85 ff             	test   rdi,rdi
     150ac62:	74 05                	je     150ac69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3501ed>
     150ac64:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
     150ac69:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150ac6f:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
     150ac75:	6a 38                	push   0x38
     150ac77:	58                   	pop    rax
     150ac78:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150ac7d:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     150ac84:	00 

- 0x150ad69 from (22059256, 22066728): jmp    150adc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35034b>
     150ad40:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     150ad44:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     150ad4b:	00 
     150ad4c:	48 89 ee             	mov    rsi,rbp
     150ad4f:	e8 6e cb fe ff       	call   14f78c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33ce46>
     150ad54:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150ad5a:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
     150ad61:	48 89 ef             	mov    rdi,rbp
     150ad64:	e8 eb c0 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150ad69:	eb 5c                	jmp    150adc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35034b>
     150ad6b:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     150ad72:	00 
     150ad73:	4c 89 fe             	mov    rsi,r15
     150ad76:	e8 e5 b0 f4 ff       	call   1455e60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b3e4>
     150ad7b:	49 89 c6             	mov    r14,rax
     150ad7e:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150ad84:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
     150ad8b:	48 85 db             	test   rbx,rbx
     150ad8e:	74 05                	je     150ad95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350319>
     150ad90:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     150ad95:	4c 89 f7             	mov    rdi,r14

- 0x150ae0e from (22059256, 22066728): jmp    150ae18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35039c>
     150adeb:	00 
     150adec:	48 8b b4 24 d8 00 00 	mov    rsi,QWORD PTR [rsp+0xd8]
     150adf3:	00 
     150adf4:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
     150adfb:	00 
     150adfc:	0f 85 fd 04 00 00    	jne    150b2ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350883>
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

- 0x150af90 from (22059256, 22066728): jmp    150afa2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350526>
     150af6b:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     150af70:	4c 8b 60 38          	mov    r12,QWORD PTR [rax+0x38]
     150af74:	4d 85 e4             	test   r12,r12
     150af77:	0f 84 a3 00 00 00    	je     150b020 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3505a4>
     150af7d:	f3 4d 0f b8 fc       	popcnt r15,r12
     150af82:	49 83 ff 01          	cmp    r15,0x1
     150af86:	77 0a                	ja     150af92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350516>
     150af88:	49 8d 54 24 ff       	lea    rdx,[r12-0x1]
     150af8d:	4c 21 f2             	and    rdx,r14
     150af90:	eb 10                	jmp    150afa2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350526>
     150af92:	4c 89 f2             	mov    rdx,r14
     150af95:	4d 39 e6             	cmp    r14,r12
     150af98:	72 08                	jb     150afa2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350526>
     150af9a:	4c 89 f0             	mov    rax,r14
     150af9d:	31 d2                	xor    edx,edx
     150af9f:	49 f7 f4             	div    r12
     150afa2:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     150afa7:	48 8b 00             	mov    rax,QWORD PTR [rax]
     150afaa:	48 89 d5             	mov    rbp,rdx
     150afad:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
     150afb1:	48 85 c0             	test   rax,rax

- 0x150afe9 from (22059256, 22066728): jmp    150b217 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35079b>
     150afcb:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     150afcf:	4c 39 f0             	cmp    rax,r14
     150afd2:	75 1a                	jne    150afee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350572>
     150afd4:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     150afd8:	48 8d b4 24 f0 01 00 	lea    rsi,[rsp+0x1f0]
     150afdf:	00 
     150afe0:	e8 09 47 59 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     150afe5:	84 c0                	test   al,al
     150afe7:	74 27                	je     150b010 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350594>
     150afe9:	e9 29 02 00 00       	jmp    150b217 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35079b>
     150afee:	41 83 ff 01          	cmp    r15d,0x1
     150aff2:	77 0a                	ja     150affe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350582>
     150aff4:	48 23 84 24 80 00 00 	and    rax,QWORD PTR [rsp+0x80]
     150affb:	00 
     150affc:	eb 0d                	jmp    150b00b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35058f>
     150affe:	4c 39 e0             	cmp    rax,r12
     150b001:	72 08                	jb     150b00b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35058f>
     150b003:	31 d2                	xor    edx,edx
     150b005:	49 f7 f4             	div    r12
     150b008:	48 89 d0             	mov    rax,rdx
     150b00b:	48 39 e8             	cmp    rax,rbp

- 0x150affc from (22059256, 22066728): jmp    150b00b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35058f>
     150afdf:	00 
     150afe0:	e8 09 47 59 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     150afe5:	84 c0                	test   al,al
     150afe7:	74 27                	je     150b010 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350594>
     150afe9:	e9 29 02 00 00       	jmp    150b217 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35079b>
     150afee:	41 83 ff 01          	cmp    r15d,0x1
     150aff2:	77 0a                	ja     150affe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350582>
     150aff4:	48 23 84 24 80 00 00 	and    rax,QWORD PTR [rsp+0x80]
     150affb:	00 
     150affc:	eb 0d                	jmp    150b00b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35058f>
     150affe:	4c 39 e0             	cmp    rax,r12
     150b001:	72 08                	jb     150b00b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35058f>
     150b003:	31 d2                	xor    edx,edx
     150b005:	49 f7 f4             	div    r12
     150b008:	48 89 d0             	mov    rax,rdx
     150b00b:	48 39 e8             	cmp    rax,rbp
     150b00e:	75 08                	jne    150b018 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35059c>
     150b010:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
     150b013:	48 85 db             	test   rbx,rbx
     150b016:	75 b3                	jne    150afcb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35054f>
     150b018:	4c 8d bc 24 f0 01 00 	lea    r15,[rsp+0x1f0]

- 0x150b088 from (22059256, 22066728): jmp    150b09f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350623>
     150b064:	66 0f ef c0          	pxor   xmm0,xmm0
     150b068:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0
     150b06d:	c6 84 24 70 01 00 00 	mov    BYTE PTR [rsp+0x170],0x1
     150b074:	01 
     150b075:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     150b07a:	48 8b 40 48          	mov    rax,QWORD PTR [rax+0x48]
     150b07e:	48 ff c0             	inc    rax
     150b081:	78 07                	js     150b08a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35060e>
     150b083:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     150b088:	eb 15                	jmp    150b09f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350623>
     150b08a:	48 89 c1             	mov    rcx,rax
     150b08d:	48 d1 e9             	shr    rcx,1
     150b090:	83 e0 01             	and    eax,0x1
     150b093:	48 09 c8             	or     rax,rcx
     150b096:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     150b09b:	f3 0f 58 c0          	addss  xmm0,xmm0
     150b09f:	4c 89 e1             	mov    rcx,r12
     150b0a2:	48 d1 e9             	shr    rcx,1
     150b0a5:	44 89 e0             	mov    eax,r12d
     150b0a8:	83 e0 01             	and    eax,0x1
     150b0ab:	48 09 c8             	or     rax,rcx

- 0x150b0b8 from (22059256, 22066728): jmp    150b0c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350647>
     150b09b:	f3 0f 58 c0          	addss  xmm0,xmm0
     150b09f:	4c 89 e1             	mov    rcx,r12
     150b0a2:	48 d1 e9             	shr    rcx,1
     150b0a5:	44 89 e0             	mov    eax,r12d
     150b0a8:	83 e0 01             	and    eax,0x1
     150b0ab:	48 09 c8             	or     rax,rcx
     150b0ae:	4d 85 e4             	test   r12,r12
     150b0b1:	78 07                	js     150b0ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35063e>
     150b0b3:	f3 49 0f 2a d4       	cvtsi2ss xmm2,r12
     150b0b8:	eb 09                	jmp    150b0c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350647>
     150b0ba:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
     150b0bf:	f3 0f 58 d2          	addss  xmm2,xmm2
     150b0c3:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     150b0c8:	f3 0f 10 48 50       	movss  xmm1,DWORD PTR [rax+0x50]
     150b0cd:	74 0e                	je     150b0dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350661>
     150b0cf:	f3 0f 59 d1          	mulss  xmm2,xmm1
     150b0d3:	0f 2e c2             	ucomiss xmm0,xmm2
     150b0d6:	77 05                	ja     150b0dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350661>
     150b0d8:	49 89 ee             	mov    r14,rbp
     150b0db:	eb 7d                	jmp    150b15a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3506de>
     150b0dd:	49 83 fc 03          	cmp    r12,0x3

- 0x150b0db from (22059256, 22066728): jmp    150b15a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3506de>
     150b0ba:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
     150b0bf:	f3 0f 58 d2          	addss  xmm2,xmm2
     150b0c3:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     150b0c8:	f3 0f 10 48 50       	movss  xmm1,DWORD PTR [rax+0x50]
     150b0cd:	74 0e                	je     150b0dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350661>
     150b0cf:	f3 0f 59 d1          	mulss  xmm2,xmm1
     150b0d3:	0f 2e c2             	ucomiss xmm0,xmm2
     150b0d6:	77 05                	ja     150b0dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350661>
     150b0d8:	49 89 ee             	mov    r14,rbp
     150b0db:	eb 7d                	jmp    150b15a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3506de>
     150b0dd:	49 83 fc 03          	cmp    r12,0x3
     150b0e1:	0f 92 c0             	setb   al
     150b0e4:	49 8d 4c 24 ff       	lea    rcx,[r12-0x1]
     150b0e9:	49 85 cc             	test   r12,rcx
     150b0ec:	0f 95 c1             	setne  cl
     150b0ef:	08 c1                	or     cl,al
     150b0f1:	0f b6 c1             	movzx  eax,cl
     150b0f4:	f3 0f 5e c1          	divss  xmm0,xmm1
     150b0f8:	66 0f 3a 0a c0 0a    	roundss xmm0,xmm0,0xa
     150b0fe:	f3 48 0f 2c c8       	cvttss2si rcx,xmm0
     150b103:	4a 8d 04 60          	lea    rax,[rax+r12*2]

- 0x150b148 from (22059256, 22066728): jmp    150b15a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3506de>
     150b124:	48 0f 47 f0          	cmova  rsi,rax
     150b128:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     150b12d:	e8 6e bf 5d ff       	call   ae70a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34040>
     150b132:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     150b137:	4c 8b 60 38          	mov    r12,QWORD PTR [rax+0x38]
     150b13b:	49 8d 44 24 ff       	lea    rax,[r12-0x1]
     150b140:	49 85 c4             	test   r12,rax
     150b143:	75 05                	jne    150b14a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3506ce>
     150b145:	49 21 c6             	and    r14,rax
     150b148:	eb 10                	jmp    150b15a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3506de>
     150b14a:	4d 39 e6             	cmp    r14,r12
     150b14d:	72 0b                	jb     150b15a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3506de>
     150b14f:	4c 89 f0             	mov    rax,r14
     150b152:	31 d2                	xor    edx,edx
     150b154:	49 f7 f4             	div    r12
     150b157:	49 89 d6             	mov    r14,rdx
     150b15a:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     150b15f:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     150b162:	4a 8b 04 f1          	mov    rax,QWORD PTR [rcx+r14*8]
     150b166:	48 85 c0             	test   rax,rax
     150b169:	74 08                	je     150b173 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3506f7>

- 0x150b171 from (22059256, 22066728): jmp    150b1b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35073d>
     150b154:	49 f7 f4             	div    r12
     150b157:	49 89 d6             	mov    r14,rdx
     150b15a:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     150b15f:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     150b162:	4a 8b 04 f1          	mov    rax,QWORD PTR [rcx+r14*8]
     150b166:	48 85 c0             	test   rax,rax
     150b169:	74 08                	je     150b173 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3506f7>
     150b16b:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     150b16e:	48 89 0b             	mov    QWORD PTR [rbx],rcx
     150b171:	eb 46                	jmp    150b1b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35073d>
     150b173:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
     150b178:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     150b17b:	48 89 03             	mov    QWORD PTR [rbx],rax
     150b17e:	48 89 1a             	mov    QWORD PTR [rdx],rbx
     150b181:	4a 89 14 f1          	mov    QWORD PTR [rcx+r14*8],rdx
     150b185:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     150b188:	48 85 c0             	test   rax,rax
     150b18b:	74 2f                	je     150b1bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350740>
     150b18d:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     150b191:	49 8d 4c 24 ff       	lea    rcx,[r12-0x1]
     150b196:	49 85 cc             	test   r12,rcx

- 0x150b19e from (22059256, 22066728): jmp    150b1ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350731>
     150b181:	4a 89 14 f1          	mov    QWORD PTR [rcx+r14*8],rdx
     150b185:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     150b188:	48 85 c0             	test   rax,rax
     150b18b:	74 2f                	je     150b1bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350740>
     150b18d:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     150b191:	49 8d 4c 24 ff       	lea    rcx,[r12-0x1]
     150b196:	49 85 cc             	test   r12,rcx
     150b199:	75 05                	jne    150b1a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350724>
     150b19b:	48 21 c8             	and    rax,rcx
     150b19e:	eb 0d                	jmp    150b1ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350731>
     150b1a0:	4c 39 e0             	cmp    rax,r12
     150b1a3:	72 08                	jb     150b1ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350731>
     150b1a5:	31 d2                	xor    edx,edx
     150b1a7:	49 f7 f4             	div    r12
     150b1aa:	48 89 d0             	mov    rax,rdx
     150b1ad:	48 c1 e0 03          	shl    rax,0x3
     150b1b1:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     150b1b6:	48 03 01             	add    rax,QWORD PTR [rcx]
     150b1b9:	48 89 18             	mov    QWORD PTR [rax],rbx
     150b1bc:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
     150b1c3:	00 00 

- 0x150b212 from (22059256, 22066728): jmp    150b2ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350832>
     150b1ea:	4c 89 ff             	mov    rdi,r15
     150b1ed:	e8 9e 2c 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b1f2:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b1f9:	00 
     150b1fa:	e8 e9 03 57 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     150b1ff:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
     150b204:	48 ff c1             	inc    rcx
     150b207:	48 3b 4c 24 70       	cmp    rcx,QWORD PTR [rsp+0x70]
     150b20c:	0f 85 a7 fc ff ff    	jne    150aeb9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35043d>
     150b212:	e9 97 00 00 00       	jmp    150b2ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350832>
     150b217:	4c 8d bc 24 f0 01 00 	lea    r15,[rsp+0x1f0]
     150b21e:	00 
     150b21f:	eb b5                	jmp    150b1d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35075a>
     150b221:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
     150b228:	00 
     150b229:	66 0f ef c0          	pxor   xmm0,xmm0
     150b22d:	66 0f 7f 46 30       	movdqa XMMWORD PTR [rsi+0x30],xmm0
     150b232:	66 0f 7f 46 20       	movdqa XMMWORD PTR [rsi+0x20],xmm0
     150b237:	66 0f 7f 46 10       	movdqa XMMWORD PTR [rsi+0x10],xmm0
     150b23c:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
     150b240:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0

- 0x150b21f from (22059256, 22066728): jmp    150b1d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35075a>
     150b1f9:	00 
     150b1fa:	e8 e9 03 57 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     150b1ff:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
     150b204:	48 ff c1             	inc    rcx
     150b207:	48 3b 4c 24 70       	cmp    rcx,QWORD PTR [rsp+0x70]
     150b20c:	0f 85 a7 fc ff ff    	jne    150aeb9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35043d>
     150b212:	e9 97 00 00 00       	jmp    150b2ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350832>
     150b217:	4c 8d bc 24 f0 01 00 	lea    r15,[rsp+0x1f0]
     150b21e:	00 
     150b21f:	eb b5                	jmp    150b1d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35075a>
     150b221:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
     150b228:	00 
     150b229:	66 0f ef c0          	pxor   xmm0,xmm0
     150b22d:	66 0f 7f 46 30       	movdqa XMMWORD PTR [rsi+0x30],xmm0
     150b232:	66 0f 7f 46 20       	movdqa XMMWORD PTR [rsi+0x20],xmm0
     150b237:	66 0f 7f 46 10       	movdqa XMMWORD PTR [rsi+0x10],xmm0
     150b23c:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
     150b240:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     150b245:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     150b24a:	c7 07 0c 00 00 00    	mov    DWORD PTR [rdi],0xc
     150b250:	48 8d 05 79 26 42 00 	lea    rax,[rip+0x422679]        # 192d8d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x74ce0>

- 0x150b264 from (22059256, 22066728): jmp    150b2f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350876>
     150b237:	66 0f 7f 46 10       	movdqa XMMWORD PTR [rsi+0x10],xmm0
     150b23c:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
     150b240:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     150b245:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     150b24a:	c7 07 0c 00 00 00    	mov    DWORD PTR [rdi],0xc
     150b250:	48 8d 05 79 26 42 00 	lea    rax,[rip+0x422679]        # 192d8d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x74ce0>
     150b257:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     150b25b:	48 83 c7 10          	add    rdi,0x10
     150b25f:	e8 5e c6 fe ff       	call   14f78c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33ce46>
     150b264:	e9 89 00 00 00       	jmp    150b2f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350876>
     150b269:	66 0f ef c0          	pxor   xmm0,xmm0
     150b26d:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
     150b274:	00 
     150b275:	66 0f 7f 46 30       	movdqa XMMWORD PTR [rsi+0x30],xmm0
     150b27a:	66 0f 7f 46 20       	movdqa XMMWORD PTR [rsi+0x20],xmm0
     150b27f:	66 0f 7f 46 10       	movdqa XMMWORD PTR [rsi+0x10],xmm0
     150b284:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
     150b288:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     150b28d:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     150b292:	c7 07 1a 00 00 00    	mov    DWORD PTR [rdi],0x1a
     150b298:	48 8d 05 31 26 42 00 	lea    rax,[rip+0x422631]        # 192d8d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x74ce0>

- 0x150b2ac from (22059256, 22066728): jmp    150b2f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350876>
     150b27f:	66 0f 7f 46 10       	movdqa XMMWORD PTR [rsi+0x10],xmm0
     150b284:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
     150b288:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     150b28d:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     150b292:	c7 07 1a 00 00 00    	mov    DWORD PTR [rdi],0x1a
     150b298:	48 8d 05 31 26 42 00 	lea    rax,[rip+0x422631]        # 192d8d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x74ce0>
     150b29f:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     150b2a3:	48 83 c7 10          	add    rdi,0x10
     150b2a7:	e8 16 c6 fe ff       	call   14f78c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33ce46>
     150b2ac:	eb 44                	jmp    150b2f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350876>
     150b2ae:	66 0f ef c0          	pxor   xmm0,xmm0
     150b2b2:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
     150b2b9:	00 
     150b2ba:	66 0f 7f 46 30       	movdqa XMMWORD PTR [rsi+0x30],xmm0
     150b2bf:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     150b2c4:	66 0f 7f 46 20       	movdqa XMMWORD PTR [rsi+0x20],xmm0
     150b2c9:	48 8b 4c 24 68       	mov    rcx,QWORD PTR [rsp+0x68]
     150b2ce:	83 21 00             	and    DWORD PTR [rcx],0x0
     150b2d1:	66 0f 7f 46 10       	movdqa XMMWORD PTR [rsi+0x10],xmm0
     150b2d6:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
     150b2da:	48 8d 05 ef 25 42 00 	lea    rax,[rip+0x4225ef]        # 192d8d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x74ce0>

- 0x150b389 from (22059256, 22066728): jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b361:	00 
     150b362:	0f 85 bb 02 00 00    	jne    150b623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ba7>
     150b368:	e8 53 92 4f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     150b36d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     150b374:	00 00 
     150b376:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
     150b37d:	00 
     150b37e:	0f 85 9f 02 00 00    	jne    150b623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ba7>
     150b384:	e8 37 92 4f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     150b389:	eb 18                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b38b:	eb 0e                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38d:	eb 0c                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38f:	eb 12                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b391:	eb 00                	jmp    150b393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350917>
     150b393:	48 89 c3             	mov    rbx,rax
     150b396:	e9 71 01 00 00       	jmp    150b50c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a90>
     150b39b:	48 89 c3             	mov    rbx,rax
     150b39e:	e9 a1 01 00 00       	jmp    150b544 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ac8>
     150b3a3:	48 89 c3             	mov    rbx,rax
     150b3a6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3ad:	00 

- 0x150b38b from (22059256, 22066728): jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b362:	0f 85 bb 02 00 00    	jne    150b623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ba7>
     150b368:	e8 53 92 4f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     150b36d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     150b374:	00 00 
     150b376:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
     150b37d:	00 
     150b37e:	0f 85 9f 02 00 00    	jne    150b623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ba7>
     150b384:	e8 37 92 4f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     150b389:	eb 18                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b38b:	eb 0e                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38d:	eb 0c                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38f:	eb 12                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b391:	eb 00                	jmp    150b393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350917>
     150b393:	48 89 c3             	mov    rbx,rax
     150b396:	e9 71 01 00 00       	jmp    150b50c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a90>
     150b39b:	48 89 c3             	mov    rbx,rax
     150b39e:	e9 a1 01 00 00       	jmp    150b544 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ac8>
     150b3a3:	48 89 c3             	mov    rbx,rax
     150b3a6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3ad:	00 
     150b3ae:	e8 a1 ba 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>

- 0x150b38d from (22059256, 22066728): jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b368:	e8 53 92 4f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     150b36d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     150b374:	00 00 
     150b376:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
     150b37d:	00 
     150b37e:	0f 85 9f 02 00 00    	jne    150b623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ba7>
     150b384:	e8 37 92 4f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     150b389:	eb 18                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b38b:	eb 0e                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38d:	eb 0c                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38f:	eb 12                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b391:	eb 00                	jmp    150b393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350917>
     150b393:	48 89 c3             	mov    rbx,rax
     150b396:	e9 71 01 00 00       	jmp    150b50c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a90>
     150b39b:	48 89 c3             	mov    rbx,rax
     150b39e:	e9 a1 01 00 00       	jmp    150b544 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ac8>
     150b3a3:	48 89 c3             	mov    rbx,rax
     150b3a6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3ad:	00 
     150b3ae:	e8 a1 ba 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b3b3:	e9 43 02 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>

- 0x150b38f from (22059256, 22066728): jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b36d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     150b374:	00 00 
     150b376:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
     150b37d:	00 
     150b37e:	0f 85 9f 02 00 00    	jne    150b623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ba7>
     150b384:	e8 37 92 4f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     150b389:	eb 18                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b38b:	eb 0e                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38d:	eb 0c                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38f:	eb 12                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b391:	eb 00                	jmp    150b393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350917>
     150b393:	48 89 c3             	mov    rbx,rax
     150b396:	e9 71 01 00 00       	jmp    150b50c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a90>
     150b39b:	48 89 c3             	mov    rbx,rax
     150b39e:	e9 a1 01 00 00       	jmp    150b544 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ac8>
     150b3a3:	48 89 c3             	mov    rbx,rax
     150b3a6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3ad:	00 
     150b3ae:	e8 a1 ba 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b3b3:	e9 43 02 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b3b8:	eb 3f                	jmp    150b3f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35097d>

- 0x150b391 from (22059256, 22066728): jmp    150b393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350917>
     150b374:	00 00 
     150b376:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
     150b37d:	00 
     150b37e:	0f 85 9f 02 00 00    	jne    150b623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ba7>
     150b384:	e8 37 92 4f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     150b389:	eb 18                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b38b:	eb 0e                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38d:	eb 0c                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38f:	eb 12                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b391:	eb 00                	jmp    150b393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350917>
     150b393:	48 89 c3             	mov    rbx,rax
     150b396:	e9 71 01 00 00       	jmp    150b50c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a90>
     150b39b:	48 89 c3             	mov    rbx,rax
     150b39e:	e9 a1 01 00 00       	jmp    150b544 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ac8>
     150b3a3:	48 89 c3             	mov    rbx,rax
     150b3a6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3ad:	00 
     150b3ae:	e8 a1 ba 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b3b3:	e9 43 02 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b3b8:	eb 3f                	jmp    150b3f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35097d>
     150b3ba:	48 89 c3             	mov    rbx,rax

- 0x150b396 from (22059256, 22066728): jmp    150b50c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a90>
     150b37d:	00 
     150b37e:	0f 85 9f 02 00 00    	jne    150b623 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ba7>
     150b384:	e8 37 92 4f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     150b389:	eb 18                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b38b:	eb 0e                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38d:	eb 0c                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38f:	eb 12                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b391:	eb 00                	jmp    150b393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350917>
     150b393:	48 89 c3             	mov    rbx,rax
     150b396:	e9 71 01 00 00       	jmp    150b50c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a90>
     150b39b:	48 89 c3             	mov    rbx,rax
     150b39e:	e9 a1 01 00 00       	jmp    150b544 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ac8>
     150b3a3:	48 89 c3             	mov    rbx,rax
     150b3a6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3ad:	00 
     150b3ae:	e8 a1 ba 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b3b3:	e9 43 02 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b3b8:	eb 3f                	jmp    150b3f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35097d>
     150b3ba:	48 89 c3             	mov    rbx,rax
     150b3bd:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150b3c3:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1

- 0x150b39e from (22059256, 22066728): jmp    150b544 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ac8>
     150b384:	e8 37 92 4f ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     150b389:	eb 18                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b38b:	eb 0e                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38d:	eb 0c                	jmp    150b39b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35091f>
     150b38f:	eb 12                	jmp    150b3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350927>
     150b391:	eb 00                	jmp    150b393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350917>
     150b393:	48 89 c3             	mov    rbx,rax
     150b396:	e9 71 01 00 00       	jmp    150b50c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a90>
     150b39b:	48 89 c3             	mov    rbx,rax
     150b39e:	e9 a1 01 00 00       	jmp    150b544 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ac8>
     150b3a3:	48 89 c3             	mov    rbx,rax
     150b3a6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3ad:	00 
     150b3ae:	e8 a1 ba 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b3b3:	e9 43 02 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b3b8:	eb 3f                	jmp    150b3f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35097d>
     150b3ba:	48 89 c3             	mov    rbx,rax
     150b3bd:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150b3c3:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     150b3ca:	e8 b7 30 59 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     150b3cf:	e9 0b 01 00 00       	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>

- 0x150b3b3 from (22059256, 22066728): jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b391:	eb 00                	jmp    150b393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350917>
     150b393:	48 89 c3             	mov    rbx,rax
     150b396:	e9 71 01 00 00       	jmp    150b50c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a90>
     150b39b:	48 89 c3             	mov    rbx,rax
     150b39e:	e9 a1 01 00 00       	jmp    150b544 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ac8>
     150b3a3:	48 89 c3             	mov    rbx,rax
     150b3a6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3ad:	00 
     150b3ae:	e8 a1 ba 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b3b3:	e9 43 02 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b3b8:	eb 3f                	jmp    150b3f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35097d>
     150b3ba:	48 89 c3             	mov    rbx,rax
     150b3bd:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150b3c3:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     150b3ca:	e8 b7 30 59 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     150b3cf:	e9 0b 01 00 00       	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b3d4:	48 89 c3             	mov    rbx,rax
     150b3d7:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3de:	00 
     150b3df:	e9 12 02 00 00       	jmp    150b5f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7a>
     150b3e4:	e9 de 00 00 00       	jmp    150b4c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a4b>

- 0x150b3b8 from (22059256, 22066728): jmp    150b3f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35097d>
     150b393:	48 89 c3             	mov    rbx,rax
     150b396:	e9 71 01 00 00       	jmp    150b50c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a90>
     150b39b:	48 89 c3             	mov    rbx,rax
     150b39e:	e9 a1 01 00 00       	jmp    150b544 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ac8>
     150b3a3:	48 89 c3             	mov    rbx,rax
     150b3a6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3ad:	00 
     150b3ae:	e8 a1 ba 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b3b3:	e9 43 02 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b3b8:	eb 3f                	jmp    150b3f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35097d>
     150b3ba:	48 89 c3             	mov    rbx,rax
     150b3bd:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150b3c3:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     150b3ca:	e8 b7 30 59 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     150b3cf:	e9 0b 01 00 00       	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b3d4:	48 89 c3             	mov    rbx,rax
     150b3d7:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3de:	00 
     150b3df:	e9 12 02 00 00       	jmp    150b5f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7a>
     150b3e4:	e9 de 00 00 00       	jmp    150b4c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a4b>
     150b3e9:	48 89 c3             	mov    rbx,rax

- 0x150b3cf from (22059256, 22066728): jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b3a6:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3ad:	00 
     150b3ae:	e8 a1 ba 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b3b3:	e9 43 02 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b3b8:	eb 3f                	jmp    150b3f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35097d>
     150b3ba:	48 89 c3             	mov    rbx,rax
     150b3bd:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150b3c3:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     150b3ca:	e8 b7 30 59 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     150b3cf:	e9 0b 01 00 00       	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b3d4:	48 89 c3             	mov    rbx,rax
     150b3d7:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3de:	00 
     150b3df:	e9 12 02 00 00       	jmp    150b5f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7a>
     150b3e4:	e9 de 00 00 00       	jmp    150b4c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a4b>
     150b3e9:	48 89 c3             	mov    rbx,rax
     150b3ec:	e9 28 01 00 00       	jmp    150b519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a9d>
     150b3f1:	48 89 c3             	mov    rbx,rax
     150b3f4:	e9 58 01 00 00       	jmp    150b551 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ad5>
     150b3f9:	48 89 c3             	mov    rbx,rax
     150b3fc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]

- 0x150b3df from (22059256, 22066728): jmp    150b5f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7a>
     150b3b8:	eb 3f                	jmp    150b3f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35097d>
     150b3ba:	48 89 c3             	mov    rbx,rax
     150b3bd:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150b3c3:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     150b3ca:	e8 b7 30 59 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     150b3cf:	e9 0b 01 00 00       	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b3d4:	48 89 c3             	mov    rbx,rax
     150b3d7:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3de:	00 
     150b3df:	e9 12 02 00 00       	jmp    150b5f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7a>
     150b3e4:	e9 de 00 00 00       	jmp    150b4c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a4b>
     150b3e9:	48 89 c3             	mov    rbx,rax
     150b3ec:	e9 28 01 00 00       	jmp    150b519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a9d>
     150b3f1:	48 89 c3             	mov    rbx,rax
     150b3f4:	e9 58 01 00 00       	jmp    150b551 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ad5>
     150b3f9:	48 89 c3             	mov    rbx,rax
     150b3fc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b403:	00 
     150b404:	e8 cd d4 f5 ff       	call   14688d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ade5a>
     150b409:	eb 24                	jmp    150b42f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509b3>
     150b40b:	e9 89 01 00 00       	jmp    150b599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b1d>

- 0x150b3e4 from (22059256, 22066728): jmp    150b4c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a4b>
     150b3ba:	48 89 c3             	mov    rbx,rax
     150b3bd:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150b3c3:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     150b3ca:	e8 b7 30 59 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     150b3cf:	e9 0b 01 00 00       	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b3d4:	48 89 c3             	mov    rbx,rax
     150b3d7:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3de:	00 
     150b3df:	e9 12 02 00 00       	jmp    150b5f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7a>
     150b3e4:	e9 de 00 00 00       	jmp    150b4c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a4b>
     150b3e9:	48 89 c3             	mov    rbx,rax
     150b3ec:	e9 28 01 00 00       	jmp    150b519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a9d>
     150b3f1:	48 89 c3             	mov    rbx,rax
     150b3f4:	e9 58 01 00 00       	jmp    150b551 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ad5>
     150b3f9:	48 89 c3             	mov    rbx,rax
     150b3fc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b403:	00 
     150b404:	e8 cd d4 f5 ff       	call   14688d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ade5a>
     150b409:	eb 24                	jmp    150b42f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509b3>
     150b40b:	e9 89 01 00 00       	jmp    150b599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b1d>
     150b410:	eb 59                	jmp    150b46b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509ef>

- 0x150b3ec from (22059256, 22066728): jmp    150b519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a9d>
     150b3c3:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     150b3ca:	e8 b7 30 59 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     150b3cf:	e9 0b 01 00 00       	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b3d4:	48 89 c3             	mov    rbx,rax
     150b3d7:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3de:	00 
     150b3df:	e9 12 02 00 00       	jmp    150b5f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7a>
     150b3e4:	e9 de 00 00 00       	jmp    150b4c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a4b>
     150b3e9:	48 89 c3             	mov    rbx,rax
     150b3ec:	e9 28 01 00 00       	jmp    150b519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a9d>
     150b3f1:	48 89 c3             	mov    rbx,rax
     150b3f4:	e9 58 01 00 00       	jmp    150b551 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ad5>
     150b3f9:	48 89 c3             	mov    rbx,rax
     150b3fc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b403:	00 
     150b404:	e8 cd d4 f5 ff       	call   14688d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ade5a>
     150b409:	eb 24                	jmp    150b42f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509b3>
     150b40b:	e9 89 01 00 00       	jmp    150b599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b1d>
     150b410:	eb 59                	jmp    150b46b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509ef>
     150b412:	48 89 c3             	mov    rbx,rax
     150b415:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]

- 0x150b3f4 from (22059256, 22066728): jmp    150b551 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ad5>
     150b3cf:	e9 0b 01 00 00       	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b3d4:	48 89 c3             	mov    rbx,rax
     150b3d7:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b3de:	00 
     150b3df:	e9 12 02 00 00       	jmp    150b5f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7a>
     150b3e4:	e9 de 00 00 00       	jmp    150b4c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a4b>
     150b3e9:	48 89 c3             	mov    rbx,rax
     150b3ec:	e9 28 01 00 00       	jmp    150b519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a9d>
     150b3f1:	48 89 c3             	mov    rbx,rax
     150b3f4:	e9 58 01 00 00       	jmp    150b551 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ad5>
     150b3f9:	48 89 c3             	mov    rbx,rax
     150b3fc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b403:	00 
     150b404:	e8 cd d4 f5 ff       	call   14688d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ade5a>
     150b409:	eb 24                	jmp    150b42f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509b3>
     150b40b:	e9 89 01 00 00       	jmp    150b599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b1d>
     150b410:	eb 59                	jmp    150b46b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509ef>
     150b412:	48 89 c3             	mov    rbx,rax
     150b415:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b41c:	00 
     150b41d:	e8 6e 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

- 0x150b409 from (22059256, 22066728): jmp    150b42f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509b3>
     150b3e4:	e9 de 00 00 00       	jmp    150b4c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a4b>
     150b3e9:	48 89 c3             	mov    rbx,rax
     150b3ec:	e9 28 01 00 00       	jmp    150b519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a9d>
     150b3f1:	48 89 c3             	mov    rbx,rax
     150b3f4:	e9 58 01 00 00       	jmp    150b551 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ad5>
     150b3f9:	48 89 c3             	mov    rbx,rax
     150b3fc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b403:	00 
     150b404:	e8 cd d4 f5 ff       	call   14688d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ade5a>
     150b409:	eb 24                	jmp    150b42f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509b3>
     150b40b:	e9 89 01 00 00       	jmp    150b599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b1d>
     150b410:	eb 59                	jmp    150b46b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509ef>
     150b412:	48 89 c3             	mov    rbx,rax
     150b415:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b41c:	00 
     150b41d:	e8 6e 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b422:	e9 ab 00 00 00       	jmp    150b4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a56>
     150b427:	e9 a3 00 00 00       	jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 

- 0x150b40b from (22059256, 22066728): jmp    150b599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b1d>
     150b3e9:	48 89 c3             	mov    rbx,rax
     150b3ec:	e9 28 01 00 00       	jmp    150b519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a9d>
     150b3f1:	48 89 c3             	mov    rbx,rax
     150b3f4:	e9 58 01 00 00       	jmp    150b551 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ad5>
     150b3f9:	48 89 c3             	mov    rbx,rax
     150b3fc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b403:	00 
     150b404:	e8 cd d4 f5 ff       	call   14688d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ade5a>
     150b409:	eb 24                	jmp    150b42f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509b3>
     150b40b:	e9 89 01 00 00       	jmp    150b599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b1d>
     150b410:	eb 59                	jmp    150b46b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509ef>
     150b412:	48 89 c3             	mov    rbx,rax
     150b415:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b41c:	00 
     150b41d:	e8 6e 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b422:	e9 ab 00 00 00       	jmp    150b4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a56>
     150b427:	e9 a3 00 00 00       	jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>

- 0x150b410 from (22059256, 22066728): jmp    150b46b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509ef>
     150b3ec:	e9 28 01 00 00       	jmp    150b519 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a9d>
     150b3f1:	48 89 c3             	mov    rbx,rax
     150b3f4:	e9 58 01 00 00       	jmp    150b551 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ad5>
     150b3f9:	48 89 c3             	mov    rbx,rax
     150b3fc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b403:	00 
     150b404:	e8 cd d4 f5 ff       	call   14688d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ade5a>
     150b409:	eb 24                	jmp    150b42f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509b3>
     150b40b:	e9 89 01 00 00       	jmp    150b599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b1d>
     150b410:	eb 59                	jmp    150b46b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509ef>
     150b412:	48 89 c3             	mov    rbx,rax
     150b415:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b41c:	00 
     150b41d:	e8 6e 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b422:	e9 ab 00 00 00       	jmp    150b4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a56>
     150b427:	e9 a3 00 00 00       	jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b43c:	eb 18                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>

- 0x150b422 from (22059256, 22066728): jmp    150b4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a56>
     150b403:	00 
     150b404:	e8 cd d4 f5 ff       	call   14688d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ade5a>
     150b409:	eb 24                	jmp    150b42f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509b3>
     150b40b:	e9 89 01 00 00       	jmp    150b599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b1d>
     150b410:	eb 59                	jmp    150b46b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509ef>
     150b412:	48 89 c3             	mov    rbx,rax
     150b415:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b41c:	00 
     150b41d:	e8 6e 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b422:	e9 ab 00 00 00       	jmp    150b4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a56>
     150b427:	e9 a3 00 00 00       	jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b43c:	eb 18                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b43e:	e9 72 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b443:	e9 6d 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b448:	e9 68 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>

- 0x150b427 from (22059256, 22066728): jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b404:	e8 cd d4 f5 ff       	call   14688d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ade5a>
     150b409:	eb 24                	jmp    150b42f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509b3>
     150b40b:	e9 89 01 00 00       	jmp    150b599 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b1d>
     150b410:	eb 59                	jmp    150b46b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509ef>
     150b412:	48 89 c3             	mov    rbx,rax
     150b415:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b41c:	00 
     150b41d:	e8 6e 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b422:	e9 ab 00 00 00       	jmp    150b4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a56>
     150b427:	e9 a3 00 00 00       	jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b43c:	eb 18                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b43e:	e9 72 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b443:	e9 6d 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b448:	e9 68 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b451:	e9 5f 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>

- 0x150b437 from (22059256, 22066728): jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b412:	48 89 c3             	mov    rbx,rax
     150b415:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b41c:	00 
     150b41d:	e8 6e 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b422:	e9 ab 00 00 00       	jmp    150b4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a56>
     150b427:	e9 a3 00 00 00       	jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b43c:	eb 18                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b43e:	e9 72 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b443:	e9 6d 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b448:	e9 68 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b451:	e9 5f 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b456:	48 89 c3             	mov    rbx,rax
     150b459:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b460:	00 
     150b461:	e8 04 eb 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

- 0x150b43c from (22059256, 22066728): jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b415:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b41c:	00 
     150b41d:	e8 6e 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b422:	e9 ab 00 00 00       	jmp    150b4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a56>
     150b427:	e9 a3 00 00 00       	jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b43c:	eb 18                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b43e:	e9 72 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b443:	e9 6d 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b448:	e9 68 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b451:	e9 5f 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b456:	48 89 c3             	mov    rbx,rax
     150b459:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b460:	00 
     150b461:	e8 04 eb 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     150b466:	e9 64 01 00 00       	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>

- 0x150b43e from (22059256, 22066728): jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b41c:	00 
     150b41d:	e8 6e 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b422:	e9 ab 00 00 00       	jmp    150b4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a56>
     150b427:	e9 a3 00 00 00       	jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b43c:	eb 18                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b43e:	e9 72 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b443:	e9 6d 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b448:	e9 68 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b451:	e9 5f 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b456:	48 89 c3             	mov    rbx,rax
     150b459:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b460:	00 
     150b461:	e8 04 eb 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     150b466:	e9 64 01 00 00       	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b46b:	48 89 c3             	mov    rbx,rax

- 0x150b443 from (22059256, 22066728): jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b41d:	e8 6e 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b422:	e9 ab 00 00 00       	jmp    150b4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a56>
     150b427:	e9 a3 00 00 00       	jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b43c:	eb 18                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b43e:	e9 72 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b443:	e9 6d 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b448:	e9 68 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b451:	e9 5f 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b456:	48 89 c3             	mov    rbx,rax
     150b459:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b460:	00 
     150b461:	e8 04 eb 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     150b466:	e9 64 01 00 00       	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b46b:	48 89 c3             	mov    rbx,rax
     150b46e:	eb 6f                	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>

- 0x150b448 from (22059256, 22066728): jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b422:	e9 ab 00 00 00       	jmp    150b4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a56>
     150b427:	e9 a3 00 00 00       	jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b43c:	eb 18                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b43e:	e9 72 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b443:	e9 6d 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b448:	e9 68 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b451:	e9 5f 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b456:	48 89 c3             	mov    rbx,rax
     150b459:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b460:	00 
     150b461:	e8 04 eb 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     150b466:	e9 64 01 00 00       	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b46b:	48 89 c3             	mov    rbx,rax
     150b46e:	eb 6f                	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b470:	48 89 c3             	mov    rbx,rax

- 0x150b44d from (22059256, 22066728): jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b427:	e9 a3 00 00 00       	jmp    150b4cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a53>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b43c:	eb 18                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b43e:	e9 72 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b443:	e9 6d 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b448:	e9 68 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b451:	e9 5f 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b456:	48 89 c3             	mov    rbx,rax
     150b459:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b460:	00 
     150b461:	e8 04 eb 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     150b466:	e9 64 01 00 00       	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b46b:	48 89 c3             	mov    rbx,rax
     150b46e:	eb 6f                	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b470:	48 89 c3             	mov    rbx,rax
     150b473:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]

- 0x150b44f from (22059256, 22066728): jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b42c:	48 89 c3             	mov    rbx,rax
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b43c:	eb 18                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b43e:	e9 72 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b443:	e9 6d 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b448:	e9 68 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b451:	e9 5f 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b456:	48 89 c3             	mov    rbx,rax
     150b459:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b460:	00 
     150b461:	e8 04 eb 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     150b466:	e9 64 01 00 00       	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b46b:	48 89 c3             	mov    rbx,rax
     150b46e:	eb 6f                	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b470:	48 89 c3             	mov    rbx,rax
     150b473:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b47a:	00 

- 0x150b451 from (22059256, 22066728): jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b42f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b436:	00 
     150b437:	e9 56 01 00 00       	jmp    150b592 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b16>
     150b43c:	eb 18                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b43e:	e9 72 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b443:	e9 6d 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b448:	e9 68 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b451:	e9 5f 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b456:	48 89 c3             	mov    rbx,rax
     150b459:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b460:	00 
     150b461:	e8 04 eb 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     150b466:	e9 64 01 00 00       	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b46b:	48 89 c3             	mov    rbx,rax
     150b46e:	eb 6f                	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b470:	48 89 c3             	mov    rbx,rax
     150b473:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b47a:	00 
     150b47b:	e9 57 01 00 00       	jmp    150b5d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b5b>

- 0x150b466 from (22059256, 22066728): jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b443:	e9 6d 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b448:	e9 68 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b451:	e9 5f 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b456:	48 89 c3             	mov    rbx,rax
     150b459:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b460:	00 
     150b461:	e8 04 eb 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     150b466:	e9 64 01 00 00       	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b46b:	48 89 c3             	mov    rbx,rax
     150b46e:	eb 6f                	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b470:	48 89 c3             	mov    rbx,rax
     150b473:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b47a:	00 
     150b47b:	e9 57 01 00 00       	jmp    150b5d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b5b>
     150b480:	48 89 c3             	mov    rbx,rax
     150b483:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b48a:	00 
     150b48b:	e8 00 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b490:	eb 08                	jmp    150b49a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a1e>

- 0x150b46e from (22059256, 22066728): jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b44d:	eb 07                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b44f:	eb 05                	jmp    150b456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3509da>
     150b451:	e9 5f 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b456:	48 89 c3             	mov    rbx,rax
     150b459:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b460:	00 
     150b461:	e8 04 eb 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     150b466:	e9 64 01 00 00       	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b46b:	48 89 c3             	mov    rbx,rax
     150b46e:	eb 6f                	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b470:	48 89 c3             	mov    rbx,rax
     150b473:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b47a:	00 
     150b47b:	e9 57 01 00 00       	jmp    150b5d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b5b>
     150b480:	48 89 c3             	mov    rbx,rax
     150b483:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b48a:	00 
     150b48b:	e8 00 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b490:	eb 08                	jmp    150b49a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a1e>
     150b492:	e9 1e 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b497:	48 89 c3             	mov    rbx,rax

- 0x150b47b from (22059256, 22066728): jmp    150b5d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b5b>
     150b459:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b460:	00 
     150b461:	e8 04 eb 56 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     150b466:	e9 64 01 00 00       	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b46b:	48 89 c3             	mov    rbx,rax
     150b46e:	eb 6f                	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b470:	48 89 c3             	mov    rbx,rax
     150b473:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b47a:	00 
     150b47b:	e9 57 01 00 00       	jmp    150b5d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b5b>
     150b480:	48 89 c3             	mov    rbx,rax
     150b483:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b48a:	00 
     150b48b:	e8 00 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b490:	eb 08                	jmp    150b49a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a1e>
     150b492:	e9 1e 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b497:	48 89 c3             	mov    rbx,rax
     150b49a:	4c 89 f7             	mov    rdi,r14
     150b49d:	e8 6e 2b 2e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     150b4a2:	4c 89 f7             	mov    rdi,r14
     150b4a5:	e8 72 2f 59 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>

- 0x150b490 from (22059256, 22066728): jmp    150b49a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a1e>
     150b46e:	eb 6f                	jmp    150b4df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a63>
     150b470:	48 89 c3             	mov    rbx,rax
     150b473:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b47a:	00 
     150b47b:	e9 57 01 00 00       	jmp    150b5d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b5b>
     150b480:	48 89 c3             	mov    rbx,rax
     150b483:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b48a:	00 
     150b48b:	e8 00 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b490:	eb 08                	jmp    150b49a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a1e>
     150b492:	e9 1e 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b497:	48 89 c3             	mov    rbx,rax
     150b49a:	4c 89 f7             	mov    rdi,r14
     150b49d:	e8 6e 2b 2e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     150b4a2:	4c 89 f7             	mov    rdi,r14
     150b4a5:	e8 72 2f 59 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     150b4aa:	eb 03                	jmp    150b4af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a33>
     150b4ac:	48 89 c3             	mov    rbx,rax
     150b4af:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b4b6:	00 
     150b4b7:	e8 68 7f 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>

- 0x150b492 from (22059256, 22066728): jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b470:	48 89 c3             	mov    rbx,rax
     150b473:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b47a:	00 
     150b47b:	e9 57 01 00 00       	jmp    150b5d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b5b>
     150b480:	48 89 c3             	mov    rbx,rax
     150b483:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b48a:	00 
     150b48b:	e8 00 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b490:	eb 08                	jmp    150b49a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a1e>
     150b492:	e9 1e 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b497:	48 89 c3             	mov    rbx,rax
     150b49a:	4c 89 f7             	mov    rdi,r14
     150b49d:	e8 6e 2b 2e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     150b4a2:	4c 89 f7             	mov    rdi,r14
     150b4a5:	e8 72 2f 59 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     150b4aa:	eb 03                	jmp    150b4af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a33>
     150b4ac:	48 89 c3             	mov    rbx,rax
     150b4af:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b4b6:	00 
     150b4b7:	e8 68 7f 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150b4bc:	66 0f ef c0          	pxor   xmm0,xmm0

- 0x150b4aa from (22059256, 22066728): jmp    150b4af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a33>
     150b48a:	00 
     150b48b:	e8 00 2a 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b490:	eb 08                	jmp    150b49a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a1e>
     150b492:	e9 1e 01 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b497:	48 89 c3             	mov    rbx,rax
     150b49a:	4c 89 f7             	mov    rdi,r14
     150b49d:	e8 6e 2b 2e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     150b4a2:	4c 89 f7             	mov    rdi,r14
     150b4a5:	e8 72 2f 59 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     150b4aa:	eb 03                	jmp    150b4af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a33>
     150b4ac:	48 89 c3             	mov    rbx,rax
     150b4af:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b4b6:	00 
     150b4b7:	e8 68 7f 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150b4bc:	66 0f ef c0          	pxor   xmm0,xmm0
     150b4c0:	eb 23                	jmp    150b4e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a69>
     150b4c2:	e9 ee 00 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b4c7:	48 89 c3             	mov    rbx,rax
     150b4ca:	e9 2c 01 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b4cf:	48 89 c3             	mov    rbx,rax
     150b4d2:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]

- 0x150b4c0 from (22059256, 22066728): jmp    150b4e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a69>
     150b49d:	e8 6e 2b 2e 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     150b4a2:	4c 89 f7             	mov    rdi,r14
     150b4a5:	e8 72 2f 59 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     150b4aa:	eb 03                	jmp    150b4af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a33>
     150b4ac:	48 89 c3             	mov    rbx,rax
     150b4af:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b4b6:	00 
     150b4b7:	e8 68 7f 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150b4bc:	66 0f ef c0          	pxor   xmm0,xmm0
     150b4c0:	eb 23                	jmp    150b4e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a69>
     150b4c2:	e9 ee 00 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b4c7:	48 89 c3             	mov    rbx,rax
     150b4ca:	e9 2c 01 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b4cf:	48 89 c3             	mov    rbx,rax
     150b4d2:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b4d9:	00 
     150b4da:	e8 75 b9 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b4df:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150b4e5:	66 0f 7f 44 24 30    	movdqa XMMWORD PTR [rsp+0x30],xmm0
     150b4eb:	e9 ec 00 00 00       	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b4f0:	48 89 c3             	mov    rbx,rax

- 0x150b4c2 from (22059256, 22066728): jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b4a2:	4c 89 f7             	mov    rdi,r14
     150b4a5:	e8 72 2f 59 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     150b4aa:	eb 03                	jmp    150b4af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a33>
     150b4ac:	48 89 c3             	mov    rbx,rax
     150b4af:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b4b6:	00 
     150b4b7:	e8 68 7f 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150b4bc:	66 0f ef c0          	pxor   xmm0,xmm0
     150b4c0:	eb 23                	jmp    150b4e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a69>
     150b4c2:	e9 ee 00 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b4c7:	48 89 c3             	mov    rbx,rax
     150b4ca:	e9 2c 01 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b4cf:	48 89 c3             	mov    rbx,rax
     150b4d2:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b4d9:	00 
     150b4da:	e8 75 b9 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b4df:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150b4e5:	66 0f 7f 44 24 30    	movdqa XMMWORD PTR [rsp+0x30],xmm0
     150b4eb:	e9 ec 00 00 00       	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b4f0:	48 89 c3             	mov    rbx,rax
     150b4f3:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]

- 0x150b4ca from (22059256, 22066728): jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b4aa:	eb 03                	jmp    150b4af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a33>
     150b4ac:	48 89 c3             	mov    rbx,rax
     150b4af:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b4b6:	00 
     150b4b7:	e8 68 7f 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150b4bc:	66 0f ef c0          	pxor   xmm0,xmm0
     150b4c0:	eb 23                	jmp    150b4e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350a69>
     150b4c2:	e9 ee 00 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b4c7:	48 89 c3             	mov    rbx,rax
     150b4ca:	e9 2c 01 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b4cf:	48 89 c3             	mov    rbx,rax
     150b4d2:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b4d9:	00 
     150b4da:	e8 75 b9 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b4df:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150b4e5:	66 0f 7f 44 24 30    	movdqa XMMWORD PTR [rsp+0x30],xmm0
     150b4eb:	e9 ec 00 00 00       	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b4f0:	48 89 c3             	mov    rbx,rax
     150b4f3:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b4fa:	00 
     150b4fb:	e8 a8 aa f4 ff       	call   1455fa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b52c>

- 0x150b4eb from (22059256, 22066728): jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b4c2:	e9 ee 00 00 00       	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b4c7:	48 89 c3             	mov    rbx,rax
     150b4ca:	e9 2c 01 00 00       	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b4cf:	48 89 c3             	mov    rbx,rax
     150b4d2:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b4d9:	00 
     150b4da:	e8 75 b9 59 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     150b4df:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     150b4e5:	66 0f 7f 44 24 30    	movdqa XMMWORD PTR [rsp+0x30],xmm0
     150b4eb:	e9 ec 00 00 00       	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b4f0:	48 89 c3             	mov    rbx,rax
     150b4f3:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b4fa:	00 
     150b4fb:	e8 a8 aa f4 ff       	call   1455fa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b52c>
     150b500:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     150b505:	4c 89 b0 d0 00 00 00 	mov    QWORD PTR [rax+0xd0],r14
     150b50c:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     150b513:	00 
     150b514:	e8 41 1b 5b ff       	call   abd05a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9ffa>
     150b519:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b520:	00 

- 0x150b526 from (22059256, 22066728): jmp    150b55e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ae2>
     150b4fb:	e8 a8 aa f4 ff       	call   1455fa8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b52c>
     150b500:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     150b505:	4c 89 b0 d0 00 00 00 	mov    QWORD PTR [rax+0xd0],r14
     150b50c:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     150b513:	00 
     150b514:	e8 41 1b 5b ff       	call   abd05a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9ffa>
     150b519:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b520:	00 
     150b521:	e8 64 26 03 00       	call   153db8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38310e>
     150b526:	eb 36                	jmp    150b55e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350ae2>
     150b528:	48 89 c3             	mov    rbx,rax
     150b52b:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b532:	00 
     150b533:	e8 3c aa f4 ff       	call   1455f74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29b4f8>
     150b538:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     150b53d:	4c 89 b0 b8 00 00 00 	mov    QWORD PTR [rax+0xb8],r14
     150b544:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     150b54b:	00 
     150b54c:	e8 09 1b 5b ff       	call   abd05a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9ffa>
     150b551:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b558:	00 

- 0x150b585 from (22059256, 22066728): jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b55e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     150b565:	00 
     150b566:	e8 25 29 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b56b:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     150b572:	00 
     150b573:	e8 ac 7e 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150b578:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b57f:	00 
     150b580:	e8 9f 7e 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150b585:	eb 55                	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b587:	48 89 c3             	mov    rbx,rax
     150b58a:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b591:	00 
     150b592:	e8 f9 28 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b597:	eb 03                	jmp    150b59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b20>
     150b599:	48 89 c3             	mov    rbx,rax
     150b59c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5a3:	00 
     150b5a4:	e8 3f 00 57 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     150b5a9:	eb 50                	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b5ab:	eb 0d                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>

- 0x150b597 from (22059256, 22066728): jmp    150b59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b20>
     150b573:	e8 ac 7e 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150b578:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     150b57f:	00 
     150b580:	e8 9f 7e 2b 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>
     150b585:	eb 55                	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b587:	48 89 c3             	mov    rbx,rax
     150b58a:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b591:	00 
     150b592:	e8 f9 28 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b597:	eb 03                	jmp    150b59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b20>
     150b599:	48 89 c3             	mov    rbx,rax
     150b59c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5a3:	00 
     150b5a4:	e8 3f 00 57 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     150b5a9:	eb 50                	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b5ab:	eb 0d                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5ad:	eb 0b                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5af:	eb 1b                	jmp    150b5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b50>
     150b5b1:	eb 02                	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b5b3:	eb 05                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5b5:	48 89 c3             	mov    rbx,rax

- 0x150b5a9 from (22059256, 22066728): jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b587:	48 89 c3             	mov    rbx,rax
     150b58a:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b591:	00 
     150b592:	e8 f9 28 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b597:	eb 03                	jmp    150b59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b20>
     150b599:	48 89 c3             	mov    rbx,rax
     150b59c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5a3:	00 
     150b5a4:	e8 3f 00 57 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     150b5a9:	eb 50                	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b5ab:	eb 0d                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5ad:	eb 0b                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5af:	eb 1b                	jmp    150b5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b50>
     150b5b1:	eb 02                	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b5b3:	eb 05                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5b5:	48 89 c3             	mov    rbx,rax
     150b5b8:	eb 22                	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b5ba:	48 89 c3             	mov    rbx,rax
     150b5bd:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b5c4:	00 
     150b5c5:	e8 7c a9 5d ff       	call   ae5f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32ee6>

- 0x150b5ab from (22059256, 22066728): jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b58a:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b591:	00 
     150b592:	e8 f9 28 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b597:	eb 03                	jmp    150b59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b20>
     150b599:	48 89 c3             	mov    rbx,rax
     150b59c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5a3:	00 
     150b5a4:	e8 3f 00 57 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     150b5a9:	eb 50                	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b5ab:	eb 0d                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5ad:	eb 0b                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5af:	eb 1b                	jmp    150b5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b50>
     150b5b1:	eb 02                	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b5b3:	eb 05                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5b5:	48 89 c3             	mov    rbx,rax
     150b5b8:	eb 22                	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b5ba:	48 89 c3             	mov    rbx,rax
     150b5bd:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b5c4:	00 
     150b5c5:	e8 7c a9 5d ff       	call   ae5f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32ee6>
     150b5ca:	eb 03                	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>

- 0x150b5ad from (22059256, 22066728): jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b591:	00 
     150b592:	e8 f9 28 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b597:	eb 03                	jmp    150b59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b20>
     150b599:	48 89 c3             	mov    rbx,rax
     150b59c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5a3:	00 
     150b5a4:	e8 3f 00 57 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     150b5a9:	eb 50                	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b5ab:	eb 0d                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5ad:	eb 0b                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5af:	eb 1b                	jmp    150b5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b50>
     150b5b1:	eb 02                	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b5b3:	eb 05                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5b5:	48 89 c3             	mov    rbx,rax
     150b5b8:	eb 22                	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b5ba:	48 89 c3             	mov    rbx,rax
     150b5bd:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b5c4:	00 
     150b5c5:	e8 7c a9 5d ff       	call   ae5f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32ee6>
     150b5ca:	eb 03                	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b5cc:	48 89 c3             	mov    rbx,rax

- 0x150b5af from (22059256, 22066728): jmp    150b5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b50>
     150b592:	e8 f9 28 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b597:	eb 03                	jmp    150b59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b20>
     150b599:	48 89 c3             	mov    rbx,rax
     150b59c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5a3:	00 
     150b5a4:	e8 3f 00 57 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     150b5a9:	eb 50                	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b5ab:	eb 0d                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5ad:	eb 0b                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5af:	eb 1b                	jmp    150b5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b50>
     150b5b1:	eb 02                	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b5b3:	eb 05                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5b5:	48 89 c3             	mov    rbx,rax
     150b5b8:	eb 22                	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b5ba:	48 89 c3             	mov    rbx,rax
     150b5bd:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b5c4:	00 
     150b5c5:	e8 7c a9 5d ff       	call   ae5f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32ee6>
     150b5ca:	eb 03                	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b5cc:	48 89 c3             	mov    rbx,rax
     150b5cf:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]

- 0x150b5b1 from (22059256, 22066728): jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b597:	eb 03                	jmp    150b59c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b20>
     150b599:	48 89 c3             	mov    rbx,rax
     150b59c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5a3:	00 
     150b5a4:	e8 3f 00 57 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     150b5a9:	eb 50                	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b5ab:	eb 0d                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5ad:	eb 0b                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5af:	eb 1b                	jmp    150b5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b50>
     150b5b1:	eb 02                	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b5b3:	eb 05                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5b5:	48 89 c3             	mov    rbx,rax
     150b5b8:	eb 22                	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b5ba:	48 89 c3             	mov    rbx,rax
     150b5bd:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b5c4:	00 
     150b5c5:	e8 7c a9 5d ff       	call   ae5f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32ee6>
     150b5ca:	eb 03                	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b5cc:	48 89 c3             	mov    rbx,rax
     150b5cf:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5d6:	00 

- 0x150b5b3 from (22059256, 22066728): jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b599:	48 89 c3             	mov    rbx,rax
     150b59c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5a3:	00 
     150b5a4:	e8 3f 00 57 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     150b5a9:	eb 50                	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b5ab:	eb 0d                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5ad:	eb 0b                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5af:	eb 1b                	jmp    150b5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b50>
     150b5b1:	eb 02                	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b5b3:	eb 05                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5b5:	48 89 c3             	mov    rbx,rax
     150b5b8:	eb 22                	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b5ba:	48 89 c3             	mov    rbx,rax
     150b5bd:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b5c4:	00 
     150b5c5:	e8 7c a9 5d ff       	call   ae5f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32ee6>
     150b5ca:	eb 03                	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b5cc:	48 89 c3             	mov    rbx,rax
     150b5cf:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5d6:	00 
     150b5d7:	e8 b4 28 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

- 0x150b5b8 from (22059256, 22066728): jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b5a3:	00 
     150b5a4:	e8 3f 00 57 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     150b5a9:	eb 50                	jmp    150b5fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b7f>
     150b5ab:	eb 0d                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5ad:	eb 0b                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5af:	eb 1b                	jmp    150b5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b50>
     150b5b1:	eb 02                	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b5b3:	eb 05                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5b5:	48 89 c3             	mov    rbx,rax
     150b5b8:	eb 22                	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b5ba:	48 89 c3             	mov    rbx,rax
     150b5bd:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b5c4:	00 
     150b5c5:	e8 7c a9 5d ff       	call   ae5f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32ee6>
     150b5ca:	eb 03                	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b5cc:	48 89 c3             	mov    rbx,rax
     150b5cf:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5d6:	00 
     150b5d7:	e8 b4 28 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b5dc:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150b5e2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1

- 0x150b5ca from (22059256, 22066728): jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b5af:	eb 1b                	jmp    150b5cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b50>
     150b5b1:	eb 02                	jmp    150b5b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b39>
     150b5b3:	eb 05                	jmp    150b5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b3e>
     150b5b5:	48 89 c3             	mov    rbx,rax
     150b5b8:	eb 22                	jmp    150b5dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b60>
     150b5ba:	48 89 c3             	mov    rbx,rax
     150b5bd:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     150b5c4:	00 
     150b5c5:	e8 7c a9 5d ff       	call   ae5f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32ee6>
     150b5ca:	eb 03                	jmp    150b5cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x350b53>
     150b5cc:	48 89 c3             	mov    rbx,rax
     150b5cf:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     150b5d6:	00 
     150b5d7:	e8 b4 28 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b5dc:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
     150b5e2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
     150b5e9:	e8 98 2e 59 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     150b5ee:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     150b5f5:	00 
     150b5f6:	e8 95 28 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     150b5fb:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]

