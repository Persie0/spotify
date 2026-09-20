# Restriction payload copy constructor

Payload base = owner+0x48 when engaged; payload+0x428 = owner+0x470.

## 0x108d88c copy constructor


/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000108d840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254c56>:
 108d840:	89 f7                	mov    edi,esi
 108d842:	e8 1c 00 00 00       	call   108d863 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254c79>
 108d847:	48 89 03             	mov    QWORD PTR [rbx],rax
 108d84a:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
 108d84e:	48 69 ca 50 05 00 00 	imul   rcx,rdx,0x550
 108d855:	48 01 c1             	add    rcx,rax
 108d858:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
 108d85c:	5b                   	pop    rbx
 108d85d:	c3                   	ret
 108d85e:	e8 5d 6d 97 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
 108d863:	53                   	push   rbx
 108d864:	48 b8 31 30 30 30 30 	movabs rax,0x30303030303031
 108d86b:	30 30 00 
 108d86e:	48 39 c7             	cmp    rdi,rax
 108d871:	73 14                	jae    108d887 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254c9d>
 108d873:	48 89 fb             	mov    rbx,rdi
 108d876:	48 69 ff 50 05 00 00 	imul   rdi,rdi,0x550
 108d87d:	e8 7e 06 76 00       	call   17edf00 <_Znwm@plt>
 108d882:	48 89 da             	mov    rdx,rbx
 108d885:	5b                   	pop    rbx
 108d886:	c3                   	ret
 108d887:	e8 53 de 9e ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
 108d88c:	55                   	push   rbp
 108d88d:	41 57                	push   r15
 108d88f:	41 56                	push   r14
 108d891:	41 55                	push   r13
 108d893:	41 54                	push   r12
 108d895:	53                   	push   rbx
 108d896:	48 83 ec 18          	sub    rsp,0x18
 108d89a:	48 89 f5             	mov    rbp,rsi
 108d89d:	48 89 fb             	mov    rbx,rdi
 108d8a0:	e8 ab ed ff ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
 108d8a5:	4c 8d 73 48          	lea    r14,[rbx+0x48]
 108d8a9:	48 8d 75 48          	lea    rsi,[rbp+0x48]
 108d8ad:	4c 89 f7             	mov    rdi,r14
 108d8b0:	e8 8b 06 76 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 108d8b5:	4c 8d 7b 60          	lea    r15,[rbx+0x60]
 108d8b9:	48 8d 75 60          	lea    rsi,[rbp+0x60]
 108d8bd:	4c 89 ff             	mov    rdi,r15
 108d8c0:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
 108d8c5:	e8 76 06 76 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 108d8ca:	4c 8d 63 78          	lea    r12,[rbx+0x78]
 108d8ce:	48 8d 75 78          	lea    rsi,[rbp+0x78]
 108d8d2:	4c 89 e7             	mov    rdi,r12
 108d8d5:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
 108d8da:	e8 61 06 76 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 108d8df:	be 90 00 00 00       	mov    esi,0x90
 108d8e4:	4c 8d 2c 33          	lea    r13,[rbx+rsi*1]
 108d8e8:	48 01 ee             	add    rsi,rbp
 108d8eb:	4c 89 ef             	mov    rdi,r13
 108d8ee:	e8 e1 f3 ff ff       	call   108ccd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2540ea>
 108d8f3:	be d8 02 00 00       	mov    esi,0x2d8
 108d8f8:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 108d8fc:	48 01 ee             	add    rsi,rbp
 108d8ff:	ba 99 00 00 00       	mov    edx,0x99
 108d904:	e8 c7 21 76 00       	call   17efad0 <memcpy@plt>
 108d909:	be 78 03 00 00       	mov    esi,0x378
 108d90e:	4c 8d 34 33          	lea    r14,[rbx+rsi*1]
 108d912:	48 01 ee             	add    rsi,rbp
 108d915:	4c 89 f7             	mov    rdi,r14
 108d918:	e8 23 06 76 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 108d91d:	be 90 03 00 00       	mov    esi,0x390
 108d922:	4c 8d 3c 33          	lea    r15,[rbx+rsi*1]
 108d926:	48 01 ee             	add    rsi,rbp
 108d929:	4c 89 ff             	mov    rdi,r15
 108d92c:	e8 0f 06 76 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
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
 108d9b9:	eb 03                	jmp    108d9be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254dd4>
 108d9bb:	48 89 c5             	mov    rbp,rax
 108d9be:	4c 89 f7             	mov    rdi,r14
 108d9c1:	e8 1e c1 ff ff       	call   1089ae4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250efa>
 108d9c6:	eb 1d                	jmp    108d9e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254dfb>
 108d9c8:	48 89 c5             	mov    rbp,rax
 108d9cb:	4c 89 ff             	mov    rdi,r15
 108d9ce:	e8 bd 04 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 108d9d3:	eb 03                	jmp    108d9d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254dee>
 108d9d5:	48 89 c5             	mov    rbp,rax
 108d9d8:	4c 89 f7             	mov    rdi,r14
 108d9db:	e8 b0 04 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 108d9e0:	eb 03                	jmp    108d9e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254dfb>
 108d9e2:	48 89 c5             	mov    rbp,rax
 108d9e5:	4c 89 ef             	mov    rdi,r13
 108d9e8:	e8 17 c1 ff ff       	call   1089b04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250f1a>
 108d9ed:	4c 89 e7             	mov    rdi,r12
 108d9f0:	e8 9b 04 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 108d9f5:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 108d9fa:	e8 91 04 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 108d9ff:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 108da04:	e8 87 04 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 108da09:	48 89 df             	mov    rdi,rbx
 108da0c:	e8 bb 0d a1 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 108da11:	48 89 ef             	mov    rdi,rbp
 108da14:	e8 b7 22 9e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 108da19:	48 89 c5             	mov    rbp,rax
 108da1c:	eb cf                	jmp    108d9ed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e03>
 108da1e:	48 89 c5             	mov    rbp,rax
 108da21:	eb d2                	jmp    108d9f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e0b>
 108da23:	48 89 c5             	mov    rbp,rax
 108da26:	eb d7                	jmp    108d9ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e15>
 108da28:	48 89 c5             	mov    rbp,rax
 108da2b:	eb dc                	jmp    108da09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e1f>
 108da2d:	cc                   	int3
 108da2e:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
 108da32:	74 01                	je     108da35 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254e4b>
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
 108dafa:	e8 af f6 ff ff       	call   108d1ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2545c4>
 108daff:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 108db03:	49 8d 76 48          	lea    rsi,[r14+0x48]
 108db07:	e8 74 05 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 108db0c:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 108db10:	49 8d 76 60          	lea    rsi,[r14+0x60]
 108db14:	e8 67 05 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 108db19:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 108db1d:	49                   	rex.WB
 108db1e:	8d                   	.byte 0x8d
 108db1f:	76                   	.byte 0x76

## 0x108d1ae helper called by payload assignment


/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000108d160 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254576>:
 108d160:	eb 03                	jmp    108d165 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25457b>
 108d162:	49 89 c5             	mov    r13,rax
 108d165:	48 89 ef             	mov    rdi,rbp
 108d168:	e8 23 0d 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 108d16d:	eb 03                	jmp    108d172 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254588>
 108d16f:	49 89 c5             	mov    r13,rax
 108d172:	4c 89 e7             	mov    rdi,r12
 108d175:	e8 16 0d 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 108d17a:	eb 03                	jmp    108d17f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254595>
 108d17c:	49 89 c5             	mov    r13,rax
 108d17f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 108d184:	e8 07 0d 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 108d189:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 108d18e:	e8 fd 0c 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 108d193:	48 89 df             	mov    rdi,rbx
 108d196:	e8 f5 0c 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 108d19b:	4c 89 ef             	mov    rdi,r13
 108d19e:	e8 2d 2b 9e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 108d1a3:	49 89 c5             	mov    r13,rax
 108d1a6:	eb e1                	jmp    108d189 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25459f>
 108d1a8:	49 89 c5             	mov    r13,rax
 108d1ab:	eb e6                	jmp    108d193 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2545a9>
 108d1ad:	cc                   	int3
 108d1ae:	41 56                	push   r14
 108d1b0:	53                   	push   rbx
 108d1b1:	50                   	push   rax
 108d1b2:	48 89 f3             	mov    rbx,rsi
 108d1b5:	49 89 fe             	mov    r14,rdi
 108d1b8:	e8 c3 0e 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 108d1bd:	49 8d 7e 18          	lea    rdi,[r14+0x18]
 108d1c1:	48 8d 73 18          	lea    rsi,[rbx+0x18]
 108d1c5:	e8 b6 0e 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 108d1ca:	0f 10 43 30          	movups xmm0,XMMWORD PTR [rbx+0x30]
 108d1ce:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
 108d1d3:	8a 43 40             	mov    al,BYTE PTR [rbx+0x40]
 108d1d6:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
 108d1da:	4c 89 f0             	mov    rax,r14
 108d1dd:	48 83 c4 08          	add    rsp,0x8
 108d1e1:	5b                   	pop    rbx
 108d1e2:	41 5e                	pop    r14
 108d1e4:	c3                   	ret
 108d1e5:	cc                   	int3
 108d1e6:	41 56                	push   r14
 108d1e8:	53                   	push   rbx
 108d1e9:	50                   	push   rax
 108d1ea:	49 89 f6             	mov    r14,rsi
 108d1ed:	48 89 fb             	mov    rbx,rdi
 108d1f0:	e8 65 82 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d1f5:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
 108d1f9:	49 8d 76 20          	lea    rsi,[r14+0x20]
 108d1fd:	e8 58 82 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d202:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 108d206:	49 8d 76 40          	lea    rsi,[r14+0x40]
 108d20a:	e8 4b 82 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d20f:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 108d213:	49 8d 76 60          	lea    rsi,[r14+0x60]
 108d217:	e8 3e 82 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d21c:	be 80 00 00 00       	mov    esi,0x80
 108d221:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 108d225:	4c 01 f6             	add    rsi,r14
 108d228:	e8 2d 82 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d22d:	be a0 00 00 00       	mov    esi,0xa0
 108d232:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 108d236:	4c 01 f6             	add    rsi,r14
 108d239:	e8 1c 82 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d23e:	be c0 00 00 00       	mov    esi,0xc0
 108d243:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 108d247:	4c 01 f6             	add    rsi,r14
 108d24a:	e8 0b 82 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d24f:	be e0 00 00 00       	mov    esi,0xe0
 108d254:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 108d258:	4c 01 f6             	add    rsi,r14
 108d25b:	e8 fa 81 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d260:	be 00 01 00 00       	mov    esi,0x100
 108d265:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 108d269:	4c 01 f6             	add    rsi,r14
 108d26c:	e8 e9 81 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d271:	be 20 01 00 00       	mov    esi,0x120
 108d276:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 108d27a:	4c 01 f6             	add    rsi,r14
 108d27d:	e8 d8 81 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d282:	be 40 01 00 00       	mov    esi,0x140
 108d287:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 108d28b:	4c 01 f6             	add    rsi,r14
 108d28e:	e8 c7 81 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d293:	41 8a 86 62 01 00 00 	mov    al,BYTE PTR [r14+0x162]
 108d29a:	88 83 62 01 00 00    	mov    BYTE PTR [rbx+0x162],al
 108d2a0:	41 0f b7 86 60 01 00 	movzx  eax,WORD PTR [r14+0x160]
 108d2a7:	00 
 108d2a8:	66 89 83 60 01 00 00 	mov    WORD PTR [rbx+0x160],ax
 108d2af:	be 68 01 00 00       	mov    esi,0x168
 108d2b4:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 108d2b8:	4c 01 f6             	add    rsi,r14
 108d2bb:	e8 82 03 00 00       	call   108d642 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254a58>
 108d2c0:	b8 28 02 00 00       	mov    eax,0x228
 108d2c5:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
 108d2c9:	49 01 c6             	add    r14,rax
 108d2cc:	4c 89 f6             	mov    rsi,r14
 108d2cf:	e8 86 81 a4 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 108d2d4:	48 89 d8             	mov    rax,rbx
 108d2d7:	48 83 c4 08          	add    rsp,0x8
 108d2db:	5b                   	pop    rbx
 108d2dc:	41 5e                	pop    r14
 108d2de:	c3                   	ret
 108d2df:	cc                   	int3
 108d2e0:	41 56                	push   r14
 108d2e2:	53                   	push   rbx
 108d2e3:	50                   	push   rax
 108d2e4:	48 89 f3             	mov    rbx,rsi
 108d2e7:	49 89 fe             	mov    r14,rdi
 108d2ea:	8a 87 10 01 00 00    	mov    al,BYTE PTR [rdi+0x110]
 108d2f0:	3a 86 10 01 00 00    	cmp    al,BYTE PTR [rsi+0x110]
 108d2f6:	0f 85 8a 00 00 00    	jne    108d386 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25479c>
 108d2fc:	84 c0                	test   al,al
 108d2fe:	0f 84 95 00 00 00    	je     108d399 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2547af>
 108d304:	4c 89 f7             	mov    rdi,r14
 108d307:	48 89 de             	mov    rsi,rbx
 108d30a:	e8 71 0d 76 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 108d30f:	49 8d 7e 18          	lea    rdi,[r14+0x18]
 108d313:	48 8d 73 18          	lea    rsi,[rbx+0x18]
 108d317:	e8 b0 00 00 00       	call   108d3cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2547e2>
 108d31c:	49 8d 7e 40          	lea    rdi,[r14+0x40]
 108d320:	48 8d 73 40          	lea    rsi,[rbx+0x40]
 108d324:	e8 a3 00 00 00       	call   108d3cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2547e2>
 108d329:	49 8d 7e 68          	lea    rdi,[r14+0x68]
 108d32d:	48 8d 73 68          	lea    rsi,[rbx+0x68]
 108d331:	6a 49                	push   0x49
 108d333:	59                   	pop    rcx
 108d334:	f3 a4                	rep movs BYTE PTR es:[rdi],BYTE PTR ds:[rsi]
 108d336:	49 8d be b8 00 00 00 	lea    rdi,[r14+0xb8]
 108d33d:	0f                   	.byte 0xf
 108d33e:	10                   	.byte 0x10
 108d33f:	83                   	.byte 0x83

## Direct +0x428 / +0x430 accesses in helper cluster

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
 108d9b9:	eb 03                	jmp    108d9be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254dd4>
--
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
--
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
 108dce9:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 108dcec:	0f 57 c9             	xorps  xmm1,xmm1
--
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
 108deca:	88 07                	mov    BYTE PTR [rdi],al

## Direct xrefs to 0x108d88c

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
--
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
--
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
--
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
--
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
