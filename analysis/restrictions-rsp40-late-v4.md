# Restrictions late `[rsp+0x40]` receiver trace

Parallel v4 report. Focus: constructor arg `rdx` saved into `[rsp+0x40]`, then used as receiver for multiple later vtable calls before the stack slot is reused.

## `[rsp+0x40]` refs

| addr | instruction |
|---:|---|
| `0x10aba54` | `10aba54:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx` |
| `0x10ac372` | `10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac4e4` | `10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acd33` | `10acd33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acdad` | `10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acf8d` | `10acf8d:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al` |
| `0x10ad163` | `10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]` |
| `0x10ad18d` | `10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0` |
| `0x10ad1ed` | `10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0x10ad2a7` | `10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |
| `0x10ad8ac` | `10ad8ac:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |

## `0x10aba54` — entry save: [rsp+0x40] = rdx

```text
 10ab9fe:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10aba05:	00
 10aba06:	e8 7b 2a 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10aba0b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
 10aba10:	e8 7b 24 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10aba15:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aba1c:	00 00
 10aba1e:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
 10aba25:	00
 10aba26:	75 08                	jne    10aba30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272e46>
 10aba28:	4c 89 f7             	mov    rdi,r14
 10aba2b:	e8 a0 42 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10aba30:	e8 7b 40 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10aba35:	cc                   	int3
 10aba36:	55                   	push   rbp
 10aba37:	41 57                	push   r15
 10aba39:	41 56                	push   r14
 10aba3b:	41 55                	push   r13
 10aba3d:	41 54                	push   r12
 10aba3f:	53                   	push   rbx
 10aba40:	48 81 ec 58 01 00 00 	sub    rsp,0x158
 10aba47:	4c 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],r9
 10aba4c:	4c 89 44 24 10       	mov    QWORD PTR [rsp+0x10],r8
 10aba51:	48 89 cd             	mov    rbp,rcx
 10aba54:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx
 10aba59:	49 89 f7             	mov    r15,rsi
 10aba5c:	48 89 fb             	mov    rbx,rdi
 10aba5f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10aba66:	00 00
 10aba68:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
 10aba6f:	00
 10aba70:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
 10aba74:	48 8d 05 15 10 7a 00 	lea    rax,[rip+0x7a1015]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
 10aba7b:	48 89 07             	mov    QWORD PTR [rdi],rax
 10aba7e:	48 8d 47 10          	lea    rax,[rdi+0x10]
 10aba82:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 10aba89:	00
 10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]
 10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10aba93:	48 8d 47 40          	lea    rax,[rdi+0x40]
 10aba97:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10aba9c:	48 83 c7 48          	add    rdi,0x48
 10abaa0:	0f 57 c0             	xorps  xmm0,xmm0
 10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 10abaa7:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 10abaab:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
 10abaaf:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
 10abab4:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
 10abab9:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
 10abac0:	00
 10abac1:	e8 64 9c ab ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 10abac6:	48 8d 43 58          	lea    rax,[rbx+0x58]
 10abaca:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10abacf:	48 8d 43 60          	lea    rax,[rbx+0x60]
 10abad3:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
 10abad8:	48 8d 43 68          	lea    rax,[rbx+0x68]
 10abadc:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 10abae1:	48 8d 43 70          	lea    rax,[rbx+0x70]
 10abae5:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 10abaec:	00
 10abaed:	48 8d 43 78          	lea    rax,[rbx+0x78]
 10abaf1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
 10abaf8:	00
 10abaf9:	0f 57 c0             	xorps  xmm0,xmm0
 10abafc:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0
 10abb00:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
 10abb04:	48 83 63 78 00       	and    QWORD PTR [rbx+0x78],0x0
 10abb09:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abb0d:	48 8d 35 fc b8 32 ff 	lea    rsi,[rip+0xffffffffff32b8fc]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abb14:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abb1b:	00
 10abb1c:	e8 5d df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abb21:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abb28:	00
 10abb29:	48 8d 35 7b cd 32 ff 	lea    rsi,[rip+0xffffffffff32cd7b]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abb30:	e8 49 df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abb35:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abb3c:	00
 10abb3d:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abb44:	00
 10abb45:	6a 02                	push   0x2
 10abb47:	5a                   	pop    rdx
 10abb48:	4c 89 e7             	mov    rdi,r12
 10abb4b:	e8 08 b9 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abb50:	8a 9c 24 d0 01 00 00 	mov    bl,BYTE PTR [rsp+0x1d0]
 10abb57:	6a 18                	push   0x18
 10abb59:	41 5d                	pop    r13
 10abb5b:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abb5f:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abb66:	e8 25 23 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abb6b:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abb6f:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abb73:	75 e6                	jne    10abb5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272f71>
 10abb75:	48 8d 35 a4 b8 32 ff 	lea    rsi,[rip+0xffffffffff32b8a4]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>
 10abb7c:	48 8d 0d bd b8 32 ff 	lea    rcx,[rip+0xffffffffff32b8bd]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>
 10abb83:	4c 8d 2d 86 b8 32 ff 	lea    r13,[rip+0xffffffffff32b886]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abb8a:	6a 11                	push   0x11
 10abb8c:	5a                   	pop    rdx
 10abb8d:	6a 20                	push   0x20
 10abb8f:	41 58                	pop    r8
 10abb91:	4c 89 f7             	mov    rdi,r14
 10abb94:	4d 89 e9             	mov    r9,r13
 10abb97:	41 54                	push   r12
 10abb99:	6a 08                	push   0x8
 10abb9b:	e8 ee ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abba0:	58                   	pop    rax
 10abba1:	59                   	pop    rcx
 10abba2:	4c 89 e7             	mov    rdi,r12
 10abba5:	e8 3e fa 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abbaa:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abbae:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abbb5:	00
 10abbb6:	4c 89 ee             	mov    rsi,r13
 10abbb9:	e8 c0 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abbbe:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abbc5:	00
 10abbc6:	48 8d 35 de cc 32 ff 	lea    rsi,[rip+0xffffffffff32ccde]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abbcd:	e8 ac de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abbd2:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abbd9:	00
 10abbda:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abbe1:	00
 10abbe2:	6a 02                	push   0x2
 10abbe4:	5a                   	pop    rdx
```
## `0x10ac372` — first vtable+0x28 receiver

```text
 10ac309:	40 88 a8 40 01 00 00 	mov    BYTE PTR [rax+0x140],bpl
 10ac310:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10ac315:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac319:	48 8d 15 00 b1 32 ff 	lea    rdx,[rip+0xffffffffff32b100]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>
 10ac320:	4c 8d 05 19 b1 32 ff 	lea    r8,[rip+0xffffffffff32b119]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>
 10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac32e:	00
 10ac32f:	6a 11                	push   0x11
 10ac331:	59                   	pop    rcx
 10ac332:	6a 20                	push   0x20
 10ac334:	41 59                	pop    r9
 10ac336:	4c 89 f7             	mov    rdi,r14
 10ac339:	e8 8a b1 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac33e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac343:	0f 84 1a 01 00 00    	je     10ac463 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273879>
 10ac349:	48 8d 35 5b c5 32 ff 	lea    rsi,[rip+0xffffffffff32c55b]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac350:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac357:	00
 10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac35d:	84 c0                	test   al,al
 10ac35f:	0f 84 fe 00 00 00    	je     10ac463 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273879>
 10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac36c:	00
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ac383:	4c 89 ff             	mov    rdi,r15
 10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac389:	49 89 c7             	mov    r15,rax
 10ac38c:	bf 80 00 00 00       	mov    edi,0x80
 10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>
 10ac396:	48 89 c1             	mov    rcx,rax
 10ac399:	48 8d 05 00 0d 7a 00 	lea    rax,[rip+0x7a0d00]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>
 10ac3a0:	48 89 01             	mov    QWORD PTR [rcx],rax
 10ac3a3:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14
 10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15
 10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 10ac3b0:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 10ac3b4:	49 89 cf             	mov    r15,rcx
 10ac3b7:	e8 54 7d ab ff       	call   b64110 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb10b0>
 10ac3bc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 10ac3c0:	49 89 57 28          	mov    QWORD PTR [r15+0x28],rdx
 10ac3c4:	41 c6 47 30 00       	mov    BYTE PTR [r15+0x30],0x0
 10ac3c9:	49 8d 7f 38          	lea    rdi,[r15+0x38]
 10ac3cd:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac3d1:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac3d8:	00
 10ac3d9:	4c 89 3a             	mov    QWORD PTR [rdx],r15
 10ac3dc:	48 8d 05 81 00 9d ff 	lea    rax,[rip+0xffffffffff9d0081]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac3e3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
 10ac3e7:	48 8d 05 8e 69 00 00 	lea    rax,[rip+0x698e]        # 10b2d7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a192>
 10ac3ee:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax
 10ac3f2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ac3f8:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac3ff:	00
 10ac400:	4c 89 f7             	mov    rdi,r14
 10ac403:	e8 22 19 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac408:	49 8b 77 18          	mov    rsi,QWORD PTR [r15+0x18]
 10ac40c:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac40f:	48 8d 05 4e 00 9d ff 	lea    rax,[rip+0xffffffffff9d004e]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac416:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10ac41a:	48 8d 05 61 6c 00 00 	lea    rax,[rip+0x6c61]        # 10b3082 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a498>
 10ac421:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 10ac425:	4c 89 ff             	mov    rdi,r15
 10ac428:	48 83 c7 48          	add    rdi,0x48
 10ac42c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac42f:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac436:	00
 10ac437:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ac43a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac441:	00
 10ac442:	e8 e3 18 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac447:	0f 57 c0             	xorps  xmm0,xmm0
 10ac44a:	41 0f 11 47 68       	movups XMMWORD PTR [r15+0x68],xmm0
 10ac44f:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
 10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
 10ac459:	41 c7 47 78 00 00 80 	mov    DWORD PTR [r15+0x78],0x3f800000
 10ac460:	3f
 10ac461:	eb 24                	jmp    10ac487 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27389d>
 10ac463:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac46a:	00
 10ac46b:	e8 c0 a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac470:	6a 08                	push   0x8
 10ac472:	5f                   	pop    rdi
 10ac473:	e8 88 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac478:	48 8d 0d 71 0d 7a 00 	lea    rcx,[rip+0x7a0d71]        # 184d1f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x98d8>
 10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 10ac484:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac487:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac48b:	48 8d 15 de af 32 ff 	lea    rdx,[rip+0xffffffffff32afde]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>
 10ac492:	4c 8d 05 f7 af 32 ff 	lea    r8,[rip+0xffffffffff32aff7]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>
 10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac4a0:	00
 10ac4a1:	6a 11                	push   0x11
 10ac4a3:	59                   	pop    rcx
 10ac4a4:	6a 19                	push   0x19
 10ac4a6:	41 59                	pop    r9
 10ac4a8:	4c 89 f7             	mov    rdi,r14
 10ac4ab:	e8 18 b0 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac4b0:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac4b5:	0f 84 1f 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4bb:	48 8d 35 e9 c3 32 ff 	lea    rsi,[rip+0xffffffffff32c3e9]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac4c2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4c9:	00
 10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac4cf:	84 c0                	test   al,al
 10ac4d1:	0f 84 03 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4de:	00
 10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac4ef:	49 89 c6             	mov    r14,rax
 10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8
 10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
 10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
```
## `0x10ac4e4` — second vtable+0x28 receiver

```text
 10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
 10ac484:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac487:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac48b:	48 8d 15 de af 32 ff 	lea    rdx,[rip+0xffffffffff32afde]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>
 10ac492:	4c 8d 05 f7 af 32 ff 	lea    r8,[rip+0xffffffffff32aff7]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>
 10ac499:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac4a0:	00
 10ac4a1:	6a 11                	push   0x11
 10ac4a3:	59                   	pop    rcx
 10ac4a4:	6a 19                	push   0x19
 10ac4a6:	41 59                	pop    r9
 10ac4a8:	4c 89 f7             	mov    rdi,r14
 10ac4ab:	e8 18 b0 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac4b0:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac4b5:	0f 84 1f 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4bb:	48 8d 35 e9 c3 32 ff 	lea    rsi,[rip+0xffffffffff32c3e9]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac4c2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4c9:	00
 10ac4ca:	e8 80 f3 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac4cf:	84 c0                	test   al,al
 10ac4d1:	0f 84 03 01 00 00    	je     10ac5da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2739f0>
 10ac4d7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac4de:	00
 10ac4df:	e8 4c a8 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac4e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac4ef:	49 89 c6             	mov    r14,rax
 10ac4f2:	bf d8 00 00 00       	mov    edi,0xd8
 10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>
 10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>
 10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ac50a:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
 10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi
 10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0
 10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]
 10ac51b:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac522:	00
 10ac523:	48 89 02             	mov    QWORD PTR [rdx],rax
 10ac526:	48 8d 0d 37 ff 9c ff 	lea    rcx,[rip+0xffffffffff9cff37]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac52d:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
 10ac531:	48 8d 0d fc 3c 01 00 	lea    rcx,[rip+0x13cfc]        # 10c0234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28764a>
 10ac538:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
 10ac53c:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
 10ac53f:	49 89 c7             	mov    r15,rax
 10ac542:	ff 51 18             	call   QWORD PTR [rcx+0x18]
 10ac545:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac54c:	00
 10ac54d:	4c 89 f7             	mov    rdi,r14
 10ac550:	e8 d5 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac555:	4c 89 ff             	mov    rdi,r15
 10ac558:	48 83 c7 30          	add    rdi,0x30
 10ac55c:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
 10ac560:	4d 89 3e             	mov    QWORD PTR [r14],r15
 10ac563:	48 8d 05 fa fe 9c ff 	lea    rax,[rip+0xffffffffff9cfefa]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10ac56a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10ac56e:	48 8d 05 39 3d 01 00 	lea    rax,[rip+0x13d39]        # 10c02ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876c4>
 10ac575:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 10ac579:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ac57c:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
 10ac583:	00
 10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ac587:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac58e:	00
 10ac58f:	e8 96 17 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ac594:	0f 57 c0             	xorps  xmm0,xmm0
 10ac597:	49 83 67 50 00       	and    QWORD PTR [r15+0x50],0x0
 10ac59c:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0
 10ac5a1:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
 10ac5a6:	31 c0                	xor    eax,eax
 10ac5a8:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al
 10ac5ac:	41 88 47 78          	mov    BYTE PTR [r15+0x78],al
 10ac5b0:	41 88 87 90 00 00 00 	mov    BYTE PTR [r15+0x90],al
 10ac5b7:	41 88 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],al
 10ac5be:	41 88 87 b0 00 00 00 	mov    BYTE PTR [r15+0xb0],al
 10ac5c5:	41 88 87 b8 00 00 00 	mov    BYTE PTR [r15+0xb8],al
 10ac5cc:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
 10ac5d1:	41 88 87 d0 00 00 00 	mov    BYTE PTR [r15+0xd0],al
 10ac5d8:	eb 24                	jmp    10ac5fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273a14>
 10ac5da:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac5e1:	00
 10ac5e2:	e8 49 a7 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac5e7:	6a 08                	push   0x8
 10ac5e9:	5f                   	pop    rdi
 10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>
 10ac5ef:	48 8d 0d 3a 14 7a 00 	lea    rcx,[rip+0x7a143a]        # 184da30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa118>
 10ac5f6:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 10ac5fb:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac5fe:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ac602:	48 8d 15 a7 ae 32 ff 	lea    rdx,[rip+0xffffffffff32aea7]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
 10ac609:	4c 8d 05 c0 ae 32 ff 	lea    r8,[rip+0xffffffffff32aec0]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>
 10ac610:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac617:	00
 10ac618:	6a 11                	push   0x11
 10ac61a:	59                   	pop    rcx
 10ac61b:	6a 19                	push   0x19
 10ac61d:	41 59                	pop    r9
 10ac61f:	4c 89 f7             	mov    rdi,r14
 10ac622:	e8 a1 ae 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac627:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac62c:	0f 84 d6 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac632:	48 8d 35 72 c2 32 ff 	lea    rsi,[rip+0xffffffffff32c272]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac639:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac640:	00
 10ac641:	e8 09 f2 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac646:	84 c0                	test   al,al
 10ac648:	0f 84 ba 02 00 00    	je     10ac908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273d1e>
 10ac64e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac655:	00
 10ac656:	e8 d5 a6 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac65b:	48 8d 35 5b 13 2c ff 	lea    rsi,[rip+0xffffffffff2c135b]        # 36d9bd <_ZTSSt12bad_any_cast@@Base-0x2280b>
 10ac662:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac669:	00
 10ac66a:	e8 0f d4 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac66f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 10ac674:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10ac678:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac67f:	00
 10ac680:	48 8d 94 24 b8 00 00 	lea    rdx,[rsp+0xb8]
 10ac687:	00
 10ac688:	e8 2d 0a a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10ac68d:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac691:	48 8d 35 18 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b018]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
```
## `0x10acd33` — late receiver before slot reuse

```text
 10accd3:	e8 ae 17 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10accd8:	4c 89 ff             	mov    rdi,r15
 10accdb:	e8 08 db 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10acce0:	41 88 9e e8 00 00 00 	mov    BYTE PTR [r14+0xe8],bl
 10acce7:	0f 57 c0             	xorps  xmm0,xmm0
 10accea:	41 0f 11 86 f0 00 00 	movups XMMWORD PTR [r14+0xf0],xmm0
 10accf1:	00
 10accf2:	41 0f 11 86 00 01 00 	movups XMMWORD PTR [r14+0x100],xmm0
 10accf9:	00
 10accfa:	41 c7 86 10 01 00 00 	mov    DWORD PTR [r14+0x110],0x3f800000
 10acd01:	00 00 80 3f
 10acd05:	41 0f 11 86 18 01 00 	movups XMMWORD PTR [r14+0x118],xmm0
 10acd0c:	00
 10acd0d:	41 0f 11 86 28 01 00 	movups XMMWORD PTR [r14+0x128],xmm0
 10acd14:	00
 10acd15:	41 0f 11 86 38 01 00 	movups XMMWORD PTR [r14+0x138],xmm0
 10acd1c:	00
 10acd1d:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 10acd22:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10acd25:	4c 89 30             	mov    QWORD PTR [rax],r14
 10acd28:	48 85 ff             	test   rdi,rdi
 10acd2b:	74 06                	je     10acd33 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274149>
 10acd2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acd30:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10acd33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10acd38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acd3b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acd3e:	49 89 c6             	mov    r14,rax
 10acd41:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 10acd46:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10acd49:	6a 50                	push   0x50
 10acd4b:	5f                   	pop    rdi
 10acd4c:	e8 af 11 74 00       	call   17edf00 <_Znwm@plt>
 10acd51:	48 8d 0d b8 01 7a 00 	lea    rcx,[rip+0x7a01b8]        # 184cf10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x95f8>
 10acd58:	48 89 08             	mov    QWORD PTR [rax],rcx
 10acd5b:	48 8d 0d 5e 02 7a 00 	lea    rcx,[rip+0x7a025e]        # 184cfc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96a8>
 10acd62:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
 10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 10acd6e:	48 8b 9c 24 e8 01 00 	mov    rbx,QWORD PTR [rsp+0x1e8]
 10acd75:	00
 10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
 10acd7a:	0f 57 c0             	xorps  xmm0,xmm0
 10acd7d:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10acd81:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10acd85:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000
 10acd8c:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10acd93:	00
 10acd94:	49 83 26 00          	and    QWORD PTR [r14],0x0
 10acd98:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 10acd9d:	48 89 c6             	mov    rsi,rax
 10acda0:	e8 dd 0e 00 00       	call   10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>
 10acda5:	4c 89 f7             	mov    rdi,r14
 10acda8:	e8 f5 0e 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10acdb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdb8:	49 89 c7             	mov    r15,rax
 10acdbb:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
 10acdc2:	00
 10acdc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdc9:	49 89 c5             	mov    r13,rax
 10acdcc:	bf c8 00 00 00       	mov    edi,0xc8
 10acdd1:	e8 2a 11 74 00       	call   17edf00 <_Znwm@plt>
 10acdd6:	49 89 c6             	mov    r14,rax
 10acdd9:	48 8d 05 30 fd 79 00 	lea    rax,[rip+0x79fd30]        # 184cb10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x91f8>
 10acde0:	49 89 06             	mov    QWORD PTR [r14],rax
 10acde3:	48 8d 05 de fd 79 00 	lea    rax,[rip+0x79fdde]        # 184cbc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x92b0>
 10acdea:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
 10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
 10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
 10acdfa:	4d 8d 66 28          	lea    r12,[r14+0x28]
 10acdfe:	0f 57 c0             	xorps  xmm0,xmm0
 10ace01:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
 10ace06:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
 10ace0b:	41 c7 46 48 00 00 80 	mov    DWORD PTR [r14+0x48],0x3f800000
 10ace12:	3f
 10ace13:	49 8d 6e 50          	lea    rbp,[r14+0x50]
 10ace17:	48 89 ef             	mov    rdi,rbp
 10ace1a:	e8 e3 03 a1 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>
 10ace1f:	4d 8d ae a8 00 00 00 	lea    r13,[r14+0xa8]
 10ace26:	4c 89 ef             	mov    rdi,r13
 10ace29:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
 10ace30:	00
 10ace31:	e8 8c 48 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ace36:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ace3d:	00
 10ace3e:	4d 89 30             	mov    QWORD PTR [r8],r14
 10ace41:	48 8d 35 49 02 9f ff 	lea    rsi,[rip+0xffffffffff9f0249]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ace48:	48 8d 0d 5f 15 00 00 	lea    rcx,[rip+0x155f]        # 10ae3ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757c4>
 10ace4f:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ace56:	00
 10ace57:	6a 08                	push   0x8
 10ace59:	41 59                	pop    r9
 10ace5b:	48 89 df             	mov    rdi,rbx
 10ace5e:	31 d2                	xor    edx,edx
 10ace60:	e8 2f d9 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ace65:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ace68:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ace6f:	00
 10ace70:	6a 01                	push   0x1
 10ace72:	5a                   	pop    rdx
 10ace73:	4c 89 fe             	mov    rsi,r15
 10ace76:	48 89 d9             	mov    rcx,rbx
 10ace79:	ff 50 48             	call   QWORD PTR [rax+0x48]
 10ace7c:	4c 89 f7             	mov    rdi,r14
 10ace7f:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
 10ace86:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ace8d:	00
 10ace8e:	48 89 de             	mov    rsi,rbx
 10ace91:	e8 a8 cb 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10ace96:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ace9a:	e8 e7 15 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ace9f:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10acea6:	00
 10acea7:	e8 3c d9 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10aceac:	48 8d 9c 24 b8 00 00 	lea    rbx,[rsp+0xb8]
 10aceb3:	00
 10aceb4:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10aceb8:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
 10acebf:	00
 10acec0:	4c 89 ff             	mov    rdi,r15
```
## `0x10acdad` — late receiver before slot reuse

```text
 10acd49:	6a 50                	push   0x50
 10acd4b:	5f                   	pop    rdi
 10acd4c:	e8 af 11 74 00       	call   17edf00 <_Znwm@plt>
 10acd51:	48 8d 0d b8 01 7a 00 	lea    rcx,[rip+0x7a01b8]        # 184cf10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x95f8>
 10acd58:	48 89 08             	mov    QWORD PTR [rax],rcx
 10acd5b:	48 8d 0d 5e 02 7a 00 	lea    rcx,[rip+0x7a025e]        # 184cfc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96a8>
 10acd62:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
 10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 10acd6e:	48 8b 9c 24 e8 01 00 	mov    rbx,QWORD PTR [rsp+0x1e8]
 10acd75:	00
 10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
 10acd7a:	0f 57 c0             	xorps  xmm0,xmm0
 10acd7d:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10acd81:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10acd85:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000
 10acd8c:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10acd93:	00
 10acd94:	49 83 26 00          	and    QWORD PTR [r14],0x0
 10acd98:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 10acd9d:	48 89 c6             	mov    rsi,rax
 10acda0:	e8 dd 0e 00 00       	call   10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>
 10acda5:	4c 89 f7             	mov    rdi,r14
 10acda8:	e8 f5 0e 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10acdb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdb8:	49 89 c7             	mov    r15,rax
 10acdbb:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
 10acdc2:	00
 10acdc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdc9:	49 89 c5             	mov    r13,rax
 10acdcc:	bf c8 00 00 00       	mov    edi,0xc8
 10acdd1:	e8 2a 11 74 00       	call   17edf00 <_Znwm@plt>
 10acdd6:	49 89 c6             	mov    r14,rax
 10acdd9:	48 8d 05 30 fd 79 00 	lea    rax,[rip+0x79fd30]        # 184cb10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x91f8>
 10acde0:	49 89 06             	mov    QWORD PTR [r14],rax
 10acde3:	48 8d 05 de fd 79 00 	lea    rax,[rip+0x79fdde]        # 184cbc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x92b0>
 10acdea:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
 10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
 10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
 10acdfa:	4d 8d 66 28          	lea    r12,[r14+0x28]
 10acdfe:	0f 57 c0             	xorps  xmm0,xmm0
 10ace01:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
 10ace06:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
 10ace0b:	41 c7 46 48 00 00 80 	mov    DWORD PTR [r14+0x48],0x3f800000
 10ace12:	3f
 10ace13:	49 8d 6e 50          	lea    rbp,[r14+0x50]
 10ace17:	48 89 ef             	mov    rdi,rbp
 10ace1a:	e8 e3 03 a1 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>
 10ace1f:	4d 8d ae a8 00 00 00 	lea    r13,[r14+0xa8]
 10ace26:	4c 89 ef             	mov    rdi,r13
 10ace29:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
 10ace30:	00
 10ace31:	e8 8c 48 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ace36:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ace3d:	00
 10ace3e:	4d 89 30             	mov    QWORD PTR [r8],r14
 10ace41:	48 8d 35 49 02 9f ff 	lea    rsi,[rip+0xffffffffff9f0249]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ace48:	48 8d 0d 5f 15 00 00 	lea    rcx,[rip+0x155f]        # 10ae3ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757c4>
 10ace4f:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ace56:	00
 10ace57:	6a 08                	push   0x8
 10ace59:	41 59                	pop    r9
 10ace5b:	48 89 df             	mov    rdi,rbx
 10ace5e:	31 d2                	xor    edx,edx
 10ace60:	e8 2f d9 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ace65:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ace68:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ace6f:	00
 10ace70:	6a 01                	push   0x1
 10ace72:	5a                   	pop    rdx
 10ace73:	4c 89 fe             	mov    rsi,r15
 10ace76:	48 89 d9             	mov    rcx,rbx
 10ace79:	ff 50 48             	call   QWORD PTR [rax+0x48]
 10ace7c:	4c 89 f7             	mov    rdi,r14
 10ace7f:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
 10ace86:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ace8d:	00
 10ace8e:	48 89 de             	mov    rsi,rbx
 10ace91:	e8 a8 cb 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10ace96:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ace9a:	e8 e7 15 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ace9f:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10acea6:	00
 10acea7:	e8 3c d9 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10aceac:	48 8d 9c 24 b8 00 00 	lea    rbx,[rsp+0xb8]
 10aceb3:	00
 10aceb4:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10aceb8:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
 10acebf:	00
 10acec0:	4c 89 ff             	mov    rdi,r15
 10acec3:	4c 89 f6             	mov    rsi,r14
 10acec6:	e8 df 0d 00 00       	call   10adcaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750c0>
 10acecb:	48 89 df             	mov    rdi,rbx
 10acece:	e8 f7 0d 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>
 10aced3:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 10aced8:	48 8b 28             	mov    rbp,QWORD PTR [rax]
 10acedb:	4d 8b 2f             	mov    r13,QWORD PTR [r15]
 10acede:	6a 38                	push   0x38
 10acee0:	5f                   	pop    rdi
 10acee1:	e8 1a 10 74 00       	call   17edf00 <_Znwm@plt>
 10acee6:	49 89 c6             	mov    r14,rax
 10acee9:	48 8d 05 f8 0b 7a 00 	lea    rax,[rip+0x7a0bf8]        # 184dae8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa1d0>
 10acef0:	49 89 06             	mov    QWORD PTR [r14],rax
 10acef3:	48 8d 05 46 0c 7a 00 	lea    rax,[rip+0x7a0c46]        # 184db40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa228>
 10acefa:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acefe:	4d 89 f7             	mov    r15,r14
 10acf01:	49 83 c7 10          	add    r15,0x10
 10acf05:	0f 57 c0             	xorps  xmm0,xmm0
 10acf08:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10acf0d:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
 10acf12:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
 10acf17:	4c 89 ff             	mov    rdi,r15
 10acf1a:	48 89 ee             	mov    rsi,rbp
 10acf1d:	e8 92 68 b2 ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>
 10acf22:	4c 89 ff             	mov    rdi,r15
 10acf25:	4c 89 ee             	mov    rsi,r13
 10acf28:	e8 87 68 b2 ff       	call   bd37b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120754>
 10acf2d:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10acf32:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10acf39:	00
```
## `0x10acf8d` — stack slot reused as byte

```text
 10acf32:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10acf39:	00
 10acf3a:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10acf3e:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10acf45:	00
 10acf46:	4c 89 f6             	mov    rsi,r14
 10acf49:	e8 84 0d 00 00       	call   10adcd2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e8>
 10acf4e:	48 89 df             	mov    rdi,rbx
 10acf51:	e8 9c 0d 00 00       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>
 10acf56:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10acf5d:	00
 10acf5e:	e8 c3 3b 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 10acf63:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10acf67:	48 8d 35 48 a8 32 ff 	lea    rsi,[rip+0xffffffffff32a848]        # 3d77b6 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x239b>
 10acf6e:	48 8d 0d 5b a8 32 ff 	lea    rcx,[rip+0xffffffffff32a85b]        # 3d77d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23b5>
 10acf75:	6a 0b                	push   0xb
 10acf77:	41 5d                	pop    r13
 10acf79:	6a 15                	push   0x15
 10acf7b:	41 5e                	pop    r14
 10acf7d:	31 ed                	xor    ebp,ebp
 10acf7f:	4c 89 ea             	mov    rdx,r13
 10acf82:	4d 89 f0             	mov    r8,r14
 10acf85:	45 31 c9             	xor    r9d,r9d
 10acf88:	e8 fd a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 10acf8d:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al
 10acf91:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10acf95:	48 8d 35 4a a8 32 ff 	lea    rsi,[rip+0xffffffffff32a84a]        # 3d77e6 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23cb>
 10acf9c:	48 8d 0d 5d a8 32 ff 	lea    rcx,[rip+0xffffffffff32a85d]        # 3d7800 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23e5>
 10acfa3:	6a 1e                	push   0x1e
 10acfa5:	41 58                	pop    r8
 10acfa7:	4c 89 ea             	mov    rdx,r13
 10acfaa:	45 31 c9             	xor    r9d,r9d
 10acfad:	e8 d8 a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 10acfb2:	88 44 24 07          	mov    BYTE PTR [rsp+0x7],al
 10acfb6:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10acfba:	48 8d 35 6f a7 32 ff 	lea    rsi,[rip+0xffffffffff32a76f]        # 3d7730 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2315>
 10acfc1:	48 8d 0d 78 a7 32 ff 	lea    rcx,[rip+0xffffffffff32a778]        # 3d7740 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2325>
 10acfc8:	6a 17                	push   0x17
 10acfca:	41 58                	pop    r8
 10acfcc:	4c 89 ea             	mov    rdx,r13
 10acfcf:	45 31 c9             	xor    r9d,r9d
 10acfd2:	e8 b3 a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 10acfd7:	88 44 24 05          	mov    BYTE PTR [rsp+0x5],al
 10acfdb:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10acfdf:	48 8d 35 72 a7 32 ff 	lea    rsi,[rip+0xffffffffff32a772]        # 3d7758 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x233d>
 10acfe6:	48 8d 0d 83 a7 32 ff 	lea    rcx,[rip+0xffffffffff32a783]        # 3d7770 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2355>
 10acfed:	6a 16                	push   0x16
 10acfef:	41 58                	pop    r8
 10acff1:	4c 89 ea             	mov    rdx,r13
 10acff4:	45 31 c9             	xor    r9d,r9d
 10acff7:	e8 8e a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 10acffc:	88 44 24 04          	mov    BYTE PTR [rsp+0x4],al
 10ad000:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ad004:	48 8d 35 7c a7 32 ff 	lea    rsi,[rip+0xffffffffff32a77c]        # 3d7787 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x236c>
 10ad00b:	48 8d 0d 8e a7 32 ff 	lea    rcx,[rip+0xffffffffff32a78e]        # 3d77a0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2385>
 10ad012:	4c 89 ea             	mov    rdx,r13
 10ad015:	4d 89 f0             	mov    r8,r14
 10ad018:	45 31 c9             	xor    r9d,r9d
 10ad01b:	e8 6a a3 53 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
 10ad020:	88 44 24 06          	mov    BYTE PTR [rsp+0x6],al
 10ad024:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ad028:	48 8d 15 c1 a4 32 ff 	lea    rdx,[rip+0xffffffffff32a4c1]        # 3d74f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20d5>
 10ad02f:	4c 8d 05 da a4 32 ff 	lea    r8,[rip+0xffffffffff32a4da]        # 3d7510 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20f5>
 10ad036:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad03d:	00
 10ad03e:	6a 11                	push   0x11
 10ad040:	59                   	pop    rcx
 10ad041:	6a 22                	push   0x22
 10ad043:	41 59                	pop    r9
 10ad045:	48 89 df             	mov    rdi,rbx
 10ad048:	e8 7b a4 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ad04d:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 10ad051:	74 16                	je     10ad069 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27447f>
 10ad053:	48 8d 35 a3 d6 2c ff 	lea    rsi,[rip+0xffffffffff2cd6a3]        # 37a6fd <_ZTSSt12bad_any_cast@@Base-0x15acb>
 10ad05a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad061:	00
 10ad062:	e8 e8 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ad067:	89 c5                	mov    ebp,eax
 10ad069:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad070:	00
 10ad071:	e8 ba 9c 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ad076:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ad07a:	48 8d 15 bf a4 32 ff 	lea    rdx,[rip+0xffffffffff32a4bf]        # 3d7540 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2125>
 10ad081:	4c 8d 05 d8 a4 32 ff 	lea    r8,[rip+0xffffffffff32a4d8]        # 3d7560 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2145>
 10ad088:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad08f:	00
 10ad090:	6a 11                	push   0x11
 10ad092:	59                   	pop    rcx
 10ad093:	6a 2b                	push   0x2b
 10ad095:	41 59                	pop    r9
 10ad097:	48 89 df             	mov    rdi,rbx
 10ad09a:	e8 29 a4 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ad09f:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 10ad0a3:	74 1a                	je     10ad0bf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2744d5>
 10ad0a5:	48 8d 35 ff b7 32 ff 	lea    rsi,[rip+0xffffffffff32b7ff]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ad0ac:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad0b3:	00
 10ad0b4:	e8 96 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ad0b9:	89 44 24 3c          	mov    DWORD PTR [rsp+0x3c],eax
 10ad0bd:	eb 08                	jmp    10ad0c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2744dd>
 10ad0bf:	c7 44 24 3c 00 00 00 	mov    DWORD PTR [rsp+0x3c],0x0
 10ad0c6:	00
 10ad0c7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad0ce:	00
 10ad0cf:	e8 5c 9c 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ad0d4:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 10ad0d8:	48 8d 15 b1 a4 32 ff 	lea    rdx,[rip+0xffffffffff32a4b1]        # 3d7590 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2175>
 10ad0df:	4c 8d 05 ca a4 32 ff 	lea    r8,[rip+0xffffffffff32a4ca]        # 3d75b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2195>
 10ad0e6:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad0ed:	00
 10ad0ee:	6a 11                	push   0x11
 10ad0f0:	59                   	pop    rcx
 10ad0f1:	6a 18                	push   0x18
 10ad0f3:	41 59                	pop    r9
 10ad0f5:	48 89 df             	mov    rdi,rbx
 10ad0f8:	e8 cb a3 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ad0fd:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 10ad101:	89 6c 24 10          	mov    DWORD PTR [rsp+0x10],ebp
 10ad105:	74 1a                	je     10ad121 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274537>
 10ad107:	48 8d 35 9d b7 32 ff 	lea    rsi,[rip+0xffffffffff32b79d]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ad10e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad115:	00
 10ad116:	e8 34 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ad11b:	89 44 24 38          	mov    DWORD PTR [rsp+0x38],eax
```
## `0x10ad2a7` — stack slot reused as pointer

```text
 10ad22f:	48 89 45 70          	mov    QWORD PTR [rbp+0x70],rax
 10ad233:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
 10ad23a:	00
 10ad23b:	48 89 45 78          	mov    QWORD PTR [rbp+0x78],rax
 10ad23f:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
 10ad246:	00
 10ad247:	48 89 85 80 00 00 00 	mov    QWORD PTR [rbp+0x80],rax
 10ad24e:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
 10ad255:	00
 10ad256:	48 89 85 88 00 00 00 	mov    QWORD PTR [rbp+0x88],rax
 10ad25d:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
 10ad264:	00
 10ad265:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax
 10ad26c:	0f 57 c0             	xorps  xmm0,xmm0
 10ad26f:	48 83 a5 b8 00 00 00 	and    QWORD PTR [rbp+0xb8],0x0
 10ad276:	00
 10ad277:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0
 10ad27e:	0f 11 85 a8 00 00 00 	movups XMMWORD PTR [rbp+0xa8],xmm0
 10ad285:	c7 85 c0 00 00 00 00 	mov    DWORD PTR [rbp+0xc0],0x3f800000
 10ad28c:	00 80 3f
 10ad28f:	48 8d bd c8 00 00 00 	lea    rdi,[rbp+0xc8]
 10ad296:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 10ad29b:	e8 ee af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ad2a0:	48 8d bd 20 01 00 00 	lea    rdi,[rbp+0x120]
 10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
 10ad2ac:	e8 dd af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ad2b1:	4c 8d b5 78 01 00 00 	lea    r14,[rbp+0x178]
 10ad2b8:	4c 89 f7             	mov    rdi,r14
 10ad2bb:	e8 36 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad2c0:	4c 8d ad 88 01 00 00 	lea    r13,[rbp+0x188]
 10ad2c7:	4c 89 ef             	mov    rdi,r13
 10ad2ca:	e8 27 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad2cf:	8a 45 5e             	mov    al,BYTE PTR [rbp+0x5e]
 10ad2d2:	86 05 68 3e 94 00    	xchg   BYTE PTR [rip+0x943e68],al        # 19f1140 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2870>
 10ad2d8:	4c 8b 7d 08          	mov    r15,QWORD PTR [rbp+0x8]
 10ad2dc:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad2e3:	00
 10ad2e4:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad2e7:	48 8d 35 a3 fd 9e ff 	lea    rsi,[rip+0xffffffffff9efda3]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad2ee:	48 8d 0d db d2 00 00 	lea    rcx,[rip+0xd2db]        # 10ba5d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2819e6>
 10ad2f5:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad2fc:	00
 10ad2fd:	6a 08                	push   0x8
 10ad2ff:	41 59                	pop    r9
 10ad301:	48 89 df             	mov    rdi,rbx
 10ad304:	31 d2                	xor    edx,edx
 10ad306:	e8 89 d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad30b:	49 8b 37             	mov    rsi,QWORD PTR [r15]
 10ad30e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ad311:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
 10ad318:	00
 10ad319:	4c 89 ff             	mov    rdi,r15
 10ad31c:	48 89 da             	mov    rdx,rbx
 10ad31f:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ad322:	4c 89 f7             	mov    rdi,r14
 10ad325:	4c 89 fe             	mov    rsi,r15
 10ad328:	e8 c5 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad32d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 10ad331:	e8 50 11 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad336:	48 89 df             	mov    rdi,rbx
 10ad339:	e8 aa d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad33e:	4c 8b bd 90 00 00 00 	mov    r15,QWORD PTR [rbp+0x90]
 10ad345:	4d 85 ff             	test   r15,r15
 10ad348:	74 6c                	je     10ad3b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2747cc>
 10ad34a:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad351:	00
 10ad352:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad355:	48 8d 35 35 fd 9e ff 	lea    rsi,[rip+0xffffffffff9efd35]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad35c:	48 8d 0d d3 d3 00 00 	lea    rcx,[rip+0xd3d3]        # 10ba736 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b4c>
 10ad363:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad36a:	00
 10ad36b:	6a 08                	push   0x8
 10ad36d:	41 59                	pop    r9
 10ad36f:	48 89 df             	mov    rdi,rbx
 10ad372:	31 d2                	xor    edx,edx
 10ad374:	e8 1b d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad379:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ad37c:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ad383:	00
 10ad384:	4c 89 fe             	mov    rsi,r15
 10ad387:	48 89 da             	mov    rdx,rbx
 10ad38a:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10ad38d:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ad394:	00
 10ad395:	4c 89 ef             	mov    rdi,r13
 10ad398:	48 89 de             	mov    rsi,rbx
 10ad39b:	e8 52 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad3a0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ad3a4:	e8 dd 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad3a9:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad3b0:	00
 10ad3b1:	e8 32 d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad3b6:	4c 8b 7d 18          	mov    r15,QWORD PTR [rbp+0x18]
 10ad3ba:	4d 85 ff             	test   r15,r15
 10ad3bd:	74 6c                	je     10ad42b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274841>
 10ad3bf:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad3c6:	00
 10ad3c7:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad3ca:	48 8d 35 c0 fc 9e ff 	lea    rsi,[rip+0xffffffffff9efcc0]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad3d1:	48 8d 0d 6e d3 00 00 	lea    rcx,[rip+0xd36e]        # 10ba746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b5c>
 10ad3d8:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad3df:	00
 10ad3e0:	6a 08                	push   0x8
 10ad3e2:	41 59                	pop    r9
 10ad3e4:	48 89 df             	mov    rdi,rbx
 10ad3e7:	31 d2                	xor    edx,edx
 10ad3e9:	e8 a6 d3 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad3ee:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ad3f1:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ad3f8:	00
 10ad3f9:	4c 89 fe             	mov    rsi,r15
 10ad3fc:	48 89 da             	mov    rdx,rbx
 10ad3ff:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ad402:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ad409:	00
 10ad40a:	4c 89 e7             	mov    rdi,r12
 10ad40d:	48 89 de             	mov    rsi,rbx
 10ad410:	e8 dd c7 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad415:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ad419:	e8 68 10 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad41e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad425:	00
 10ad426:	e8 bd d3 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad42b:	4c 8b 7d 38          	mov    r15,QWORD PTR [rbp+0x38]
```
## Chronological receiver/call events

| addr | instruction |
|---:|---|
| `0x10aba54` | `10aba54:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx` |
| `0x10ac372` | `10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac37a` | `10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac386` | `10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac399` | `10ac399:	48 8d 05 00 0d 7a 00 	lea    rax,[rip+0x7a0d00]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>` |
| `0x10ac3f5` | `10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ac437` | `10ac437:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac4e4` | `10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac4ec` | `10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac4fc` | `10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>` |
| `0x10ac584` | `10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10acd33` | `10acd33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acd3b` | `10acd3b:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acdad` | `10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acdb5` | `10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acdc6` | `10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acf8d` | `10acf8d:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al` |
| `0x10ad163` | `10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]` |
| `0x10ad18d` | `10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0` |
| `0x10ad1ed` | `10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0x10ad2a7` | `10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |

