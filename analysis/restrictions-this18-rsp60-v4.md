# Restrictions this+0x18 / `[rsp+0x60]` trace

Parallel v4 report. Focus: the true `b411a4` return slot candidate. Earlier v3 showed `[rsp+0x18] = this+0x40`; this report follows `[rsp+0x60] = this+0x18`.

## `[rsp+0x60]` refs in constructor

| addr | instruction |
|---:|---|
| `0x10aba8e` | `10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0x10ac1a1` | `10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ac1e6` | `10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ad136` | `10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10adbde` | `10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]` |

## `0x10aba8a` — initial setup: [rsp+0x60] = this+0x18

```text
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
```
## `0x10ac1a1` — first read of [rsp+0x60] after allocated_0x28 construction

```text
 10ac151:	48 89 c7             	mov    rdi,rax
 10ac154:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
 10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 10ac15e:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ac165:	00
 10ac166:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12
 10ac16a:	48 8d 05 69 78 a1 ff 	lea    rax,[rip+0xffffffffffa17869]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 10ac175:	48 8d 05 9a 1a 00 00 	lea    rax,[rip+0x1a9a]        # 10adc16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27502c>
 10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10ac187:	49 89 06             	mov    QWORD PTR [r14],rax
 10ac18a:	4c 89 f7             	mov    rdi,r14
 10ac18d:	48 83 c7 08          	add    rdi,0x8
 10ac191:	4c 89 ee             	mov    rsi,r13
 10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
 10ac199:	4c 89 ef             	mov    rdi,r13
 10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1a6:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac1ac:	48 85 ff             	test   rdi,rdi
 10ac1af:	74 06                	je     10ac1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2735cd>
 10ac1b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac1b7:	6a 58                	push   0x58
 10ac1b9:	5f                   	pop    rdi
 10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac1bf:	48 8d 0d 9a 20 7d 00 	lea    rcx,[rip+0x7d209a]        # 187e260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a948>
 10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac1c9:	31 ed                	xor    ebp,ebp
 10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl
 10ac1cf:	40 88 68 38          	mov    BYTE PTR [rax+0x38],bpl
 10ac1d3:	40 88 68 40          	mov    BYTE PTR [rax+0x40],bpl
 10ac1d7:	0f 57 c0             	xorps  xmm0,xmm0
 10ac1da:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 10ac1e1:	00
 10ac1e2:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1eb:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 10ac1ee:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10ac1f3:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 10ac1f6:	48 8d 15 d3 b1 32 ff 	lea    rdx,[rip+0xffffffffff32b1d3]        # 3d73d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fb5>
 10ac1fd:	4c 8d 05 ec b1 32 ff 	lea    r8,[rip+0xffffffffff32b1ec]        # 3d73f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fd5>
 10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac20b:	00
 10ac20c:	6a 11                	push   0x11
 10ac20e:	59                   	pop    rcx
 10ac20f:	6a 1f                	push   0x1f
 10ac211:	41 59                	pop    r9
 10ac213:	4c 89 f7             	mov    rdi,r14
 10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl
 10ac21f:	74 16                	je     10ac237 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27364d>
 10ac221:	48 8d 35 83 c6 32 ff 	lea    rsi,[rip+0xffffffffff32c683]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac228:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac22f:	00
 10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac235:	89 c5                	mov    ebp,eax
 10ac237:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac23e:	00
 10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac244:	bf 50 01 00 00       	mov    edi,0x150
 10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>
 10ac24e:	48 8d 0d b3 15 7a 00 	lea    rcx,[rip+0x7a15b3]        # 184d808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ef0>
 10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac258:	48 8d 90 90 00 00 00 	lea    rdx,[rax+0x90]
 10ac25f:	0f 57 c0             	xorps  xmm0,xmm0
 10ac262:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10ac266:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
 10ac26a:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10ac26e:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10ac272:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac276:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0
 10ac27a:	0f 11 40 68          	movups XMMWORD PTR [rax+0x68],xmm0
 10ac27e:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0
 10ac282:	48 8d 0d 57 26 76 00 	lea    rcx,[rip+0x762657]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
 10ac289:	48 89 88 90 00 00 00 	mov    QWORD PTR [rax+0x90],rcx
 10ac290:	48 8b 0d 09 58 80 00 	mov    rcx,QWORD PTR [rip+0x805809]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
 10ac297:	48 89 88 98 00 00 00 	mov    QWORD PTR [rax+0x98],rcx
 10ac29e:	48 89 90 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],rdx
 10ac2a5:	48 89 c2             	mov    rdx,rax
 10ac2a8:	48 81 c2 c0 00 00 00 	add    rdx,0xc0
 10ac2af:	48 8d 0d 2a 26 76 00 	lea    rcx,[rip+0x76262a]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
 10ac2b6:	48 89 88 c0 00 00 00 	mov    QWORD PTR [rax+0xc0],rcx
 10ac2bd:	48 8b 0d e4 57 80 00 	mov    rcx,QWORD PTR [rip+0x8057e4]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
 10ac2c4:	48 89 88 c8 00 00 00 	mov    QWORD PTR [rax+0xc8],rcx
 10ac2cb:	48 89 90 e0 00 00 00 	mov    QWORD PTR [rax+0xe0],rdx
```
## `0x10ac1e6` — second read of [rsp+0x60] near allocated_0x58/inner setup

```text
 10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac1ac:	48 85 ff             	test   rdi,rdi
 10ac1af:	74 06                	je     10ac1b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2735cd>
 10ac1b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac1b7:	6a 58                	push   0x58
 10ac1b9:	5f                   	pop    rdi
 10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac1bf:	48 8d 0d 9a 20 7d 00 	lea    rcx,[rip+0x7d209a]        # 187e260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a948>
 10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac1c9:	31 ed                	xor    ebp,ebp
 10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl
 10ac1cf:	40 88 68 38          	mov    BYTE PTR [rax+0x38],bpl
 10ac1d3:	40 88 68 40          	mov    BYTE PTR [rax+0x40],bpl
 10ac1d7:	0f 57 c0             	xorps  xmm0,xmm0
 10ac1da:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 10ac1e1:	00
 10ac1e2:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1eb:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 10ac1ee:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10ac1f3:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 10ac1f6:	48 8d 15 d3 b1 32 ff 	lea    rdx,[rip+0xffffffffff32b1d3]        # 3d73d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fb5>
 10ac1fd:	4c 8d 05 ec b1 32 ff 	lea    r8,[rip+0xffffffffff32b1ec]        # 3d73f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fd5>
 10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac20b:	00
 10ac20c:	6a 11                	push   0x11
 10ac20e:	59                   	pop    rcx
 10ac20f:	6a 1f                	push   0x1f
 10ac211:	41 59                	pop    r9
 10ac213:	4c 89 f7             	mov    rdi,r14
 10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl
 10ac21f:	74 16                	je     10ac237 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27364d>
 10ac221:	48 8d 35 83 c6 32 ff 	lea    rsi,[rip+0xffffffffff32c683]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac228:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac22f:	00
 10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac235:	89 c5                	mov    ebp,eax
 10ac237:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac23e:	00
 10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac244:	bf 50 01 00 00       	mov    edi,0x150
 10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>
 10ac24e:	48 8d 0d b3 15 7a 00 	lea    rcx,[rip+0x7a15b3]        # 184d808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ef0>
 10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac258:	48 8d 90 90 00 00 00 	lea    rdx,[rax+0x90]
 10ac25f:	0f 57 c0             	xorps  xmm0,xmm0
 10ac262:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10ac266:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
 10ac26a:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10ac26e:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10ac272:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac276:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0
 10ac27a:	0f 11 40 68          	movups XMMWORD PTR [rax+0x68],xmm0
 10ac27e:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0
 10ac282:	48 8d 0d 57 26 76 00 	lea    rcx,[rip+0x762657]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
 10ac289:	48 89 88 90 00 00 00 	mov    QWORD PTR [rax+0x90],rcx
 10ac290:	48 8b 0d 09 58 80 00 	mov    rcx,QWORD PTR [rip+0x805809]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
 10ac297:	48 89 88 98 00 00 00 	mov    QWORD PTR [rax+0x98],rcx
 10ac29e:	48 89 90 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],rdx
 10ac2a5:	48 89 c2             	mov    rdx,rax
 10ac2a8:	48 81 c2 c0 00 00 00 	add    rdx,0xc0
 10ac2af:	48 8d 0d 2a 26 76 00 	lea    rcx,[rip+0x76262a]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
 10ac2b6:	48 89 88 c0 00 00 00 	mov    QWORD PTR [rax+0xc0],rcx
 10ac2bd:	48 8b 0d e4 57 80 00 	mov    rcx,QWORD PTR [rip+0x8057e4]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
 10ac2c4:	48 89 88 c8 00 00 00 	mov    QWORD PTR [rax+0xc8],rcx
 10ac2cb:	48 89 90 e0 00 00 00 	mov    QWORD PTR [rax+0xe0],rdx
 10ac2d2:	0f 29 80 f0 00 00 00 	movaps XMMWORD PTR [rax+0xf0],xmm0
 10ac2d9:	0f 29 80 00 01 00 00 	movaps XMMWORD PTR [rax+0x100],xmm0
 10ac2e0:	0f 29 80 10 01 00 00 	movaps XMMWORD PTR [rax+0x110],xmm0
 10ac2e7:	0f 11 80 19 01 00 00 	movups XMMWORD PTR [rax+0x119],xmm0
 10ac2ee:	4c 89 a8 30 01 00 00 	mov    QWORD PTR [rax+0x130],r13
 10ac2f5:	48 8b 8c 24 a0 01 00 	mov    rcx,QWORD PTR [rsp+0x1a0]
 10ac2fc:	00
 10ac2fd:	48 89 88 38 01 00 00 	mov    QWORD PTR [rax+0x138],rcx
 10ac304:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
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
```
## `0x10ad136` — late read of [rsp+0x60]

```text
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
 10ad11f:	eb 08                	jmp    10ad129 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27453f>
 10ad121:	c7 44 24 38 00 00 00 	mov    DWORD PTR [rsp+0x38],0x0
 10ad128:	00
 10ad129:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad130:	00
 10ad131:	e8 fa 9b 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ad13b:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10ad13e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ad143:	4c 8b 20             	mov    r12,QWORD PTR [rax]
 10ad146:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 10ad14b:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 10ad14e:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10ad153:	4c 8b 38             	mov    r15,QWORD PTR [rax]
 10ad156:	bf 98 01 00 00       	mov    edi,0x198
 10ad15b:	e8 a0 0d 74 00       	call   17edf00 <_Znwm@plt>
 10ad160:	48 89 c5             	mov    rbp,rax
 10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]
 10ad168:	66 0f 6e c0          	movd   xmm0,eax
 10ad16c:	0f b6 44 24 07       	movzx  eax,BYTE PTR [rsp+0x7]
 10ad171:	66 0f 3a 20 c0 01    	pinsrb xmm0,eax,0x1
 10ad177:	0f b6 44 24 05       	movzx  eax,BYTE PTR [rsp+0x5]
 10ad17c:	66 0f 3a 20 c0 02    	pinsrb xmm0,eax,0x2
 10ad182:	0f b6 44 24 04       	movzx  eax,BYTE PTR [rsp+0x4]
 10ad187:	66 0f 3a 20 c0 03    	pinsrb xmm0,eax,0x3
 10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
 10ad193:	4d 8d 6e 08          	lea    r13,[r14+0x8]
 10ad197:	4d 85 f6             	test   r14,r14
 10ad19a:	4d 0f 44 ee          	cmove  r13,r14
 10ad19e:	48 8d 05 2b 04 7a 00 	lea    rax,[rip+0x7a042b]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10ad1a5:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 10ad1a9:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
 10ad1ae:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
 10ad1b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10ad1b7:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
 10ad1bb:	4c 89 65 18          	mov    QWORD PTR [rbp+0x18],r12
 10ad1bf:	4c 8d 65 20          	lea    r12,[rbp+0x20]
 10ad1c3:	4c 89 e7             	mov    rdi,r12
 10ad1c6:	e8 2b c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad1cb:	4c 89 6d 30          	mov    QWORD PTR [rbp+0x30],r13
 10ad1cf:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15
 10ad1d3:	48 8d 7d 40          	lea    rdi,[rbp+0x40]
 10ad1d7:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
 10ad1dc:	e8 15 c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad1e1:	c7 45 50 05 00 00 00 	mov    DWORD PTR [rbp+0x50],0x5
 10ad1e8:	66 83 65 54 00       	and    WORD PTR [rbp+0x54],0x0
 10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
 10ad1f2:	f3 0f 11 45 56       	movss  DWORD PTR [rbp+0x56],xmm0
 10ad1f7:	8a 44 24 06          	mov    al,BYTE PTR [rsp+0x6]
 10ad1fb:	88 45 5a             	mov    BYTE PTR [rbp+0x5a],al
 10ad1fe:	c6 45 5b 00          	mov    BYTE PTR [rbp+0x5b],0x0
 10ad202:	8b 44 24 10          	mov    eax,DWORD PTR [rsp+0x10]
 10ad206:	88 45 5c             	mov    BYTE PTR [rbp+0x5c],al
 10ad209:	8b 44 24 3c          	mov    eax,DWORD PTR [rsp+0x3c]
 10ad20d:	88 45 5d             	mov    BYTE PTR [rbp+0x5d],al
 10ad210:	8b 44 24 38          	mov    eax,DWORD PTR [rsp+0x38]
 10ad214:	88 45 5e             	mov    BYTE PTR [rbp+0x5e],al
 10ad217:	48 89 5d 60          	mov    QWORD PTR [rbp+0x60],rbx
 10ad21b:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
 10ad222:	00
 10ad223:	48 89 45 68          	mov    QWORD PTR [rbp+0x68],rax
 10ad227:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
 10ad22e:	00
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
```
## `0x10adbde` — cleanup/read of [rsp+0x60]

```text
 10adb8c:	00
 10adb8d:	e8 38 01 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>
 10adb92:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 10adb97:	e8 06 01 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10adb9c:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
 10adba1:	e8 82 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adba6:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 10adbab:	e8 78 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbb0:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
 10adbb5:	e8 c2 15 ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 10adbba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 10adbbf:	e8 64 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbc4:	4c 8b b4 24 a0 00 00 	mov    r14,QWORD PTR [rsp+0xa0]
 10adbcb:	00
 10adbcc:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10adbd0:	e8 b1 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10adbd5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10adbd9:	e8 a8 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 10adbe3:	e8 40 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbe8:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
 10adbef:	00
 10adbf0:	e8 33 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbf5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10adbfc:	00 00
 10adbfe:	48 3b 84 24 50 01 00 	cmp    rax,QWORD PTR [rsp+0x150]
 10adc05:	00
 10adc06:	75 08                	jne    10adc10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275026>
 10adc08:	48 89 df             	mov    rdi,rbx
 10adc0b:	e8 c0 20 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10adc10:	e8 9b 1e 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10adc15:	cc                   	int3
 10adc16:	53                   	push   rbx
 10adc17:	48 89 fb             	mov    rbx,rdi
 10adc1a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10adc1d:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10adc21:	e8 94 f4 9f ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10adc26:	48 89 d8             	mov    rax,rbx
 10adc29:	5b                   	pop    rbx
 10adc2a:	c3                   	ret
 10adc2b:	cc                   	int3
 10adc2c:	50                   	push   rax
 10adc2d:	e8 4c 60 3d 00       	call   1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
 10adc32:	59                   	pop    rcx
 10adc33:	c3                   	ret
 10adc34:	48 89 c7             	mov    rdi,rax
 10adc37:	e8 69 be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc3c:	53                   	push   rbx
 10adc3d:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 10adc41:	48 85 c0             	test   rax,rax
 10adc44:	74 11                	je     10adc57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27506d>
 10adc46:	48 89 fb             	mov    rbx,rdi
 10adc49:	31 ff                	xor    edi,edi
 10adc4b:	48 89 de             	mov    rsi,rbx
 10adc4e:	31 d2                	xor    edx,edx
 10adc50:	ff d0                	call   rax
 10adc52:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 10adc57:	5b                   	pop    rbx
 10adc58:	c3                   	ret
 10adc59:	48 89 c7             	mov    rdi,rax
 10adc5c:	e8 44 be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc61:	cc                   	int3
 10adc62:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10adc65:	e9 dc 02 00 00       	jmp    10adf46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27535c>
 10adc6a:	50                   	push   rax
 10adc6b:	e8 0e 60 3d 00       	call   1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
 10adc70:	59                   	pop    rcx
 10adc71:	c3                   	ret
 10adc72:	48 89 c7             	mov    rdi,rax
 10adc75:	e8 2b be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc7a:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10adc7d:	e9 ce 00 00 00       	jmp    10add50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275166>
 10adc82:	53                   	push   rbx
 10adc83:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10adc86:	48 89 37             	mov    QWORD PTR [rdi],rsi
 10adc89:	48 85 db             	test   rbx,rbx
 10adc8c:	74 12                	je     10adca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b6>
 10adc8e:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 10adc92:	e8 19 46 00 00       	call   10b22b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2796c6>
 10adc97:	48 89 df             	mov    rdi,rbx
 10adc9a:	5b                   	pop    rbx
 10adc9b:	e9 80 02 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10adca0:	5b                   	pop    rbx
 10adca1:	c3                   	ret
 10adca2:	31 f6                	xor    esi,esi
 10adca4:	e9 d9 ff ff ff       	jmp    10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>
 10adca9:	cc                   	int3
 10adcaa:	53                   	push   rbx
```
## Chronological key events touching `[rsp+0x60]`/rax stores

| addr | instruction |
|---:|---|
| `0x10aba8a` | `10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]` |
| `0x10aba8e` | `10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0x10ac12c` | `10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac149` | `10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac180` | `10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |
| `0x10ac1a1` | `10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ac1a6` | `10ac1a6:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0x10ac1a9` | `10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac1b4` | `10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac1ba` | `10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac1bf` | `10ac1bf:	48 8d 0d 9a 20 7d 00 	lea    rcx,[rip+0x7d209a]        # 187e260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a948>` |
| `0x10ac1c6` | `10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac1cb` | `10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl` |
| `0x10ac1e6` | `10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ac1eb` | `10ac1eb:	4c 8b 28             	mov    r13,QWORD PTR [rax]` |
| `0x10ac1f3` | `10ac1f3:	48 8b 30             	mov    rsi,QWORD PTR [rax]` |
| `0x10ac249` | `10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac24e` | `10ac24e:	48 8d 0d b3 15 7a 00 	lea    rcx,[rip+0x7a15b3]        # 184d808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ef0>` |
| `0x10ac255` | `10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac262` | `10ac262:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0` |
| `0x10ac266` | `10ac266:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0` |
| `0x10ac391` | `10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac399` | `10ac399:	48 8d 05 00 0d 7a 00 	lea    rax,[rip+0x7a0d00]        # 184d0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9788>` |
| `0x10ac3f5` | `10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ac437` | `10ac437:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac473` | `10ac473:	e8 88 1a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac484` | `10ac484:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac4f7` | `10ac4f7:	e8 04 1a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac4fc` | `10ac4fc:	48 8d 0d a5 14 7a 00 	lea    rcx,[rip+0x7a14a5]        # 184d9a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa090>` |
| `0x10ac503` | `10ac503:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac506` | `10ac506:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ac50f` | `10ac50f:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi` |
| `0x10ac513` | `10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0` |
| `0x10ac584` | `10ac584:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ac5ea` | `10ac5ea:	e8 11 19 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac5fb` | `10ac5fb:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac6e1` | `10ac6e1:	e8 1a 18 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac7da` | `10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0x10ac7dd` | `10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac7e8` | `10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac821` | `10ac821:	48 8b 00             	mov    rax,QWORD PTR [rax]` |
| `0x10ac88a` | `10ac88a:	e8 71 16 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac96b` | `10ac96b:	e8 90 15 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acae8` | `10acae8:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0x10acaeb` | `10acaeb:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10acaf6` | `10acaf6:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10acb2a` | `10acb2a:	48 8b 00             	mov    rax,QWORD PTR [rax]` |
| `0x10acb93` | `10acb93:	e8 68 13 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acc07` | `10acc07:	48 8b 18             	mov    rbx,QWORD PTR [rax]` |
| `0x10acc0f` | `10acc0f:	4c 8b 38             	mov    r15,QWORD PTR [rax]` |
| `0x10acc17` | `10acc17:	e8 e4 12 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acd22` | `10acd22:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0x10acd25` | `10acd25:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10acd30` | `10acd30:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10acd46` | `10acd46:	48 8b 18             	mov    rbx,QWORD PTR [rax]` |
| `0x10acd4c` | `10acd4c:	e8 af 11 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10acd58` | `10acd58:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10acd62` | `10acd62:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx` |
| `0x10acd66` | `10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14` |
| `0x10acd6a` | `10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx` |
| `0x10acdd1` | `10acdd1:	e8 2a 11 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10aced8` | `10aced8:	48 8b 28             	mov    rbp,QWORD PTR [rax]` |
| `0x10acee1` | `10acee1:	e8 1a 10 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad136` | `10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ad13b` | `10ad13b:	48 8b 18             	mov    rbx,QWORD PTR [rax]` |
| `0x10ad143` | `10ad143:	4c 8b 20             	mov    r12,QWORD PTR [rax]` |
| `0x10ad14b` | `10ad14b:	4c 8b 30             	mov    r14,QWORD PTR [rax]` |
| `0x10ad153` | `10ad153:	4c 8b 38             	mov    r15,QWORD PTR [rax]` |
| `0x10ad15b` | `10ad15b:	e8 a0 0d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad31f` | `10ad31f:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ad3ff` | `10ad3ff:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad4a5` | `10ad4a5:	e8 56 0a 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad4c3` | `10ad4c3:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]` |
| `0x10ad4ce` | `10ad4ce:	0f 11 00             	movups XMMWORD PTR [rax],xmm0` |
| `0x10ad4f1` | `10ad4f1:	48 8b 30             	mov    rsi,QWORD PTR [rax]` |
| `0x10ad547` | `10ad547:	e8 b4 09 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad553` | `10ad553:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ad556` | `10ad556:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ad562` | `10ad562:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp` |
| `0x10ad62a` | `10ad62a:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad688` | `10ad688:	e8 73 08 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ad694` | `10ad694:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ad697` | `10ad697:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ad6a0` | `10ad6a0:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx` |
| `0x10ad6a4` | `10ad6a4:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp` |
| `0x10ad6e4` | `10ad6e4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10adb2b` | `10adb2b:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10adb34` | `10adb34:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10adb57` | `10adb57:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10adb62` | `10adb62:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10adbde` | `10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]` |

