# Skip Ad wrapper helpers compact

## c8be5a
~~~asm
  c8be5a:	53                   	push   rbx
  c8be5b:	48 89 fb             	mov    rbx,rdi
  c8be5e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  c8be61:	48 89 07             	mov    QWORD PTR [rdi],rax
  c8be64:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
  c8be68:	48 85 ff             	test   rdi,rdi
  c8be6b:	74 10                	je     c8be7d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8e1d>
  c8be6d:	e8 ce 22 b6 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
  c8be72:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  c8be76:	48 85 c0             	test   rax,rax
  c8be79:	74 07                	je     c8be82 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8e22>
  c8be7b:	5b                   	pop    rbx
  c8be7c:	c3                   	ret
  c8be7d:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
  c8be82:	e8 04 e1 e4 ff       	call   ad9f8b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26f2b>
  c8be87:	cc                   	int3
  c8be88:	41 57                	push   r15
  c8be8a:	41 56                	push   r14
  c8be8c:	41 55                	push   r13
  c8be8e:	41 54                	push   r12
  c8be90:	53                   	push   rbx
  c8be91:	49 89 d7             	mov    r15,rdx
  c8be94:	49 89 f4             	mov    r12,rsi
  c8be97:	49 89 fe             	mov    r14,rdi
  c8be9a:	bf 10 01 00 00       	mov    edi,0x110
  c8be9f:	e8 5c 20 b6 00       	call   17edf00 <_Znwm@plt>
  c8bea4:	48 89 c3             	mov    rbx,rax
  c8bea7:	0f 57 c9             	xorps  xmm1,xmm1
  c8beaa:	0f 11 48 08          	movups XMMWORD PTR [rax+0x8],xmm1
  c8beae:	48 8d 05 b3 15 b7 00 	lea    rax,[rip+0xb715b3]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  c8beb5:	48 89 03             	mov    QWORD PTR [rbx],rax
  c8beb8:	4c 8d 6b 18          	lea    r13,[rbx+0x18]
  c8bebc:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
  c8bec1:	41 0f 11 0c 24       	movups XMMWORD PTR [r12],xmm1
  c8bec6:	0f 11 4b 20          	movups XMMWORD PTR [rbx+0x20],xmm1
  c8beca:	48 8d 05 5f 97 bd 00 	lea    rax,[rip+0xbd975f]        # 1865630 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21d18>
  c8bed1:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  c8bed5:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
  c8bed9:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15
  c8bedd:	48 83 63 48 00       	and    QWORD PTR [rbx+0x48],0x0
  c8bee2:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
  c8bee6:	e8 a3 c3 e9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  c8beeb:	48 8d bb a8 00 00 00 	lea    rdi,[rbx+0xa8]
  c8bef2:	e8 87 c3 e9 ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
  c8bef7:	0f 57 c0             	xorps  xmm0,xmm0
  c8befa:	0f 11 83 00 01 00 00 	movups XMMWORD PTR [rbx+0x100],xmm0
  c8bf01:	31 ff                	xor    edi,edi
  c8bf03:	e8 7e 25 e1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c8bf08:	4d 89 2e             	mov    QWORD PTR [r14],r13
  c8bf0b:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
  c8bf0f:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
  c8bf13:	48 85 c0             	test   rax,rax
  c8bf16:	74 14                	je     c8bf2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8ecc>
  c8bf18:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  c8bf1c:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
  c8bf20:	74 0a                	je     c8bf2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8ecc>
  c8bf22:	5b                   	pop    rbx
  c8bf23:	41 5c                	pop    r12
  c8bf25:	41 5d                	pop    r13
  c8bf27:	41 5e                	pop    r14
  c8bf29:	41 5f                	pop    r15
  c8bf2b:	c3                   	ret
  c8bf2c:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  c8bf31:	66 48 0f 6e c3       	movq   xmm0,rbx
  c8bf36:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
  c8bf3b:	66 49 0f 6e cd       	movq   xmm1,r13
  c8bf40:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  c8bf44:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  c8bf48:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
  c8bf4d:	e8 60 25 e1 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  c8bf52:	48 89 df             	mov    rdi,rbx
  c8bf55:	5b                   	pop    rbx
  c8bf56:	41 5c                	pop    r12
  c8bf58:	41 5d                	pop    r13
  c8bf5a:	41 5e                	pop    r14
  c8bf5c:	41 5f                	pop    r15
  c8bf5e:	e9 23 25 e1 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  c8bf63:	cc                   	int3
  c8bf64:	53                   	push   rbx
  c8bf65:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  c8bf68:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  c8bf6c:	48 85 db             	test   rbx,rbx
  c8bf6f:	74 18                	je     c8bf89 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8f29>
  c8bf71:	80 7f 10 00          	cmp    BYTE PTR [rdi+0x10],0x0
  c8bf75:	74 09                	je     c8bf80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8f20>
  c8bf77:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  c8bf7b:	e8 ce de ff ff       	call   c89e4e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d6dee>
~~~

## f2505a
~~~asm
  f2505a:	41 56                	push   r14
  f2505c:	53                   	push   rbx
  f2505d:	50                   	push   rax
  f2505e:	48 89 d3             	mov    rbx,rdx
  f25061:	49 89 fe             	mov    r14,rdi
  f25064:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
  f25067:	0f 57 c9             	xorps  xmm1,xmm1
  f2506a:	0f 11 0e             	movups XMMWORD PTR [rsi],xmm1
  f2506d:	0f 11 0f             	movups XMMWORD PTR [rdi],xmm1
  f25070:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
  f25074:	31 ff                	xor    edi,edi
  f25076:	e8 0b 94 b7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f2507b:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
  f25080:	0f 57 c0             	xorps  xmm0,xmm0
  f25083:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
  f25088:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  f2508b:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  f2508f:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
  f25093:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
  f25097:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
  f2509b:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
  f2509f:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  f250a2:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  f250a7:	48 83 c4 08          	add    rsp,0x8
  f250ab:	5b                   	pop    rbx
  f250ac:	41 5e                	pop    r14
  f250ae:	c3                   	ret
  f250af:	cc                   	int3
  f250b0:	41 57                	push   r15
  f250b2:	41 56                	push   r14
  f250b4:	41 54                	push   r12
  f250b6:	53                   	push   rbx
  f250b7:	50                   	push   rax
  f250b8:	48 89 fb             	mov    rbx,rdi
  f250bb:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  f250be:	48 85 c0             	test   rax,rax
  f250c1:	74 25                	je     f250e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec4fe>
  f250c3:	84 d2                	test   dl,dl
  f250c5:	74 21                	je     f250e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec4fe>
  f250c7:	48 89 03             	mov    QWORD PTR [rbx],rax
  f250ca:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
  f250ce:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  f250d2:	48 85 c0             	test   rax,rax
  f250d5:	74 05                	je     f250dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec4f2>
  f250d7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  f250dc:	48 83 c4 08          	add    rsp,0x8
  f250e0:	5b                   	pop    rbx
  f250e1:	41 5c                	pop    r12
  f250e3:	41 5e                	pop    r14
  f250e5:	41 5f                	pop    r15
  f250e7:	c3                   	ret
  f250e8:	4c 8b 66 10          	mov    r12,QWORD PTR [rsi+0x10]
  f250ec:	bf 68 01 00 00       	mov    edi,0x168
  f250f1:	e8 0a 8e 8c 00       	call   17edf00 <_Znwm@plt>
  f250f6:	49 89 c6             	mov    r14,rax
  f250f9:	0f 57 c0             	xorps  xmm0,xmm0
  f250fc:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  f25100:	48 8d 05 b9 56 91 00 	lea    rax,[rip+0x9156b9]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  f25107:	49 89 06             	mov    QWORD PTR [r14],rax
  f2510a:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
  f2510f:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
  f25114:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
  f25118:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
  f2511d:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
  f25121:	48 85 c0             	test   rax,rax
  f25124:	74 05                	je     f2512b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec541>
  f25126:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  f2512b:	4d 8d 7e 20          	lea    r15,[r14+0x20]
  f2512f:	48 8d 05 5a 51 91 00 	lea    rax,[rip+0x91515a]        # 183a290 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc228>
  f25136:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  f2513a:	48 8d 05 3f 53 91 00 	lea    rax,[rip+0x91533f]        # 183a480 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc418>
  f25141:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  f25145:	49 8d 7e 48          	lea    rdi,[r14+0x48]
  f25149:	49 8d 74 24 30       	lea    rsi,[r12+0x30]
  f2514e:	e8 71 2a ff ff       	call   f17bc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdefda>
  f25153:	4c 89 f6             	mov    rsi,r14
  f25156:	48 83 c6 18          	add    rsi,0x18
  f2515a:	49 8b 84 24 28 01 00 	mov    rax,QWORD PTR [r12+0x128]
  f25161:	00 
  f25162:	49 89 86 40 01 00 00 	mov    QWORD PTR [r14+0x140],rax
  f25169:	49 8b 84 24 30 01 00 	mov    rax,QWORD PTR [r12+0x130]
  f25170:	00 
  f25171:	49 89 86 48 01 00 00 	mov    QWORD PTR [r14+0x148],rax
  f25178:	48 85 c0             	test   rax,rax
  f2517b:	74 05                	je     f25182 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec598>
  f2517d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  f25182:	41 8a 84 24 48 01 00 	mov    al,BYTE PTR [r12+0x148]
  f25189:	00 
  f2518a:	41 88 86 60 01 00 00 	mov    BYTE PTR [r14+0x160],al
  f25191:	41 0f 10 84 24 38 01 	movups xmm0,XMMWORD PTR [r12+0x138]
  f25198:	00 00 
  f2519a:	41 0f 11 86 50 01 00 	movups XMMWORD PTR [r14+0x150],xmm0
  f251a1:	00 
  f251a2:	48 89 df             	mov    rdi,rbx
  f251a5:	4c 89 f2             	mov    rdx,r14
  f251a8:	e8 57 96 fd ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  f251ad:	31 ff                	xor    edi,edi
  f251af:	48 83 c4 08          	add    rsp,0x8
  f251b3:	5b                   	pop    rbx
  f251b4:	41 5c                	pop    r12
  f251b6:	41 5e                	pop    r14
  f251b8:	41 5f                	pop    r15
  f251ba:	e9 5d 92 b7 ff       	jmp    a9e41c <JNI_OnUnload@@Base+0x25ce9>
  f251bf:	48 89 c3             	mov    rbx,rax
  f251c2:	4c 89 ff             	mov    rdi,r15
  f251c5:	e8 80 31 00 00       	call   f2834a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef760>
  f251ca:	4c 89 f7             	mov    rdi,r14
  f251cd:	e8 3e 8e 8c 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  f251d2:	4c 89 f7             	mov    rdi,r14
  f251d5:	e8 42 92 b7 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  f251da:	eb 03                	jmp    f251df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec5f5>
  f251dc:	48 89 c3             	mov    rbx,rax
  f251df:	48 89 df             	mov    rdi,rbx
  f251e2:	e8 be 48 b5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  f251e7:	cc                   	int3
  f251e8:	80 bf f0 00 00 00 00 	cmp    BYTE PTR [rdi+0xf0],0x0
  f251ef:	74 11                	je     f25202 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec618>
  f251f1:	53                   	push   rbx
  f251f2:	48 89 fb             	mov    rbx,rdi
  f251f5:	e8 94 01 fe ff       	call   f0538e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc7a4>
  f251fa:	c6 83 f0 00 00 00 00 	mov    BYTE PTR [rbx+0xf0],0x0
  f25201:	5b                   	pop    rbx
  f25202:	c3                   	ret
  f25203:	cc                   	int3
~~~

## f25204
~~~asm
  f25204:	41 56                	push   r14
  f25206:	53                   	push   rbx
  f25207:	50                   	push   rax
  f25208:	48 89 cb             	mov    rbx,rcx
  f2520b:	49 89 fe             	mov    r14,rdi
  f2520e:	48 85 d2             	test   rdx,rdx
  f25211:	74 13                	je     f25226 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec63c>
  f25213:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  f25218:	49 89 36             	mov    QWORD PTR [r14],rsi
  f2521b:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
  f2521f:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  f25224:	eb 08                	jmp    f2522e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec644>
  f25226:	49 89 36             	mov    QWORD PTR [r14],rsi
  f25229:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
  f2522e:	49 89 76 10          	mov    QWORD PTR [r14+0x10],rsi
  f25232:	49 89 56 18          	mov    QWORD PTR [r14+0x18],rdx
  f25236:	31 ff                	xor    edi,edi
  f25238:	e8 49 92 b7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f2523d:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
  f25242:	0f 57 c0             	xorps  xmm0,xmm0
  f25245:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
  f2524a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  f2524d:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  f25251:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
  f25255:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
  f25259:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
  f2525d:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
  f25261:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  f25264:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  f25269:	48 83 c4 08          	add    rsp,0x8
  f2526d:	5b                   	pop    rbx
  f2526e:	41 5e                	pop    r14
  f25270:	c3                   	ret
  f25271:	cc                   	int3
  f25272:	41 57                	push   r15
  f25274:	41 56                	push   r14
  f25276:	41 55                	push   r13
  f25278:	41 54                	push   r12
  f2527a:	53                   	push   rbx
  f2527b:	48 83 ec 40          	sub    rsp,0x40
  f2527f:	49 89 f7             	mov    r15,rsi
  f25282:	48 89 fb             	mov    rbx,rdi
  f25285:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f2528c:	00 00 
  f2528e:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  f25293:	bf 80 00 00 00       	mov    edi,0x80
  f25298:	e8 63 8c 8c 00       	call   17edf00 <_Znwm@plt>
  f2529d:	49 89 c6             	mov    r14,rax
  f252a0:	0f 57 c0             	xorps  xmm0,xmm0
  f252a3:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  f252a7:	48 8d 05 fa 51 91 00 	lea    rax,[rip+0x9151fa]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
  f252ae:	49 89 06             	mov    QWORD PTR [r14],rax
  f252b1:	4d 89 f4             	mov    r12,r14
  f252b4:	49 83 c4 18          	add    r12,0x18
  f252b8:	49 89 e5             	mov    r13,rsp
  f252bb:	4c 89 ef             	mov    rdi,r13
  f252be:	4c 89 fe             	mov    rsi,r15
  f252c1:	e8 be 08 00 00       	call   f25b84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf9a>
  f252c6:	4c 89 e7             	mov    rdi,r12
  f252c9:	4c 89 ee             	mov    rsi,r13
  f252cc:	e8 49 08 00 00       	call   f25b1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf30>
  f252d1:	4c 89 ef             	mov    rdi,r13
  f252d4:	e8 39 00 00 00       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  f252d9:	4c 89 23             	mov    QWORD PTR [rbx],r12
  f252dc:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
  f252e0:	31 ff                	xor    edi,edi
  f252e2:	e8 35 91 b7 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  f252e7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f252ee:	00 00 
  f252f0:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
  f252f5:	75 0e                	jne    f25305 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec71b>
  f252f7:	48 83 c4 40          	add    rsp,0x40
  f252fb:	5b                   	pop    rbx
  f252fc:	41 5c                	pop    r12
  f252fe:	41 5d                	pop    r13
  f25300:	41 5e                	pop    r14
  f25302:	41 5f                	pop    r15
  f25304:	c3                   	ret
  f25305:	e8 a6 a7 8c 00       	call   17efab0 <__stack_chk_fail@plt>
  f2530a:	48 89 c7             	mov    rdi,rax
  f2530d:	e8 93 47 b5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
~~~
