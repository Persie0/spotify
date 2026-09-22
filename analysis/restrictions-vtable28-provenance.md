# Restrictions vtable+0x28 provenance trace

Focused follow-up to `analysis/restrictions-this78-readers-fast.md`. This avoids broad xref scans and instead tracks the two constructor-tail indirect calls at `10ac37a` and `10ac386`.

## Constructor tail: focused window `10ac300..10ac3b0`

```text
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
```
## Constructor events mentioning stack slots / object registers

| addr | instruction |
|---:|---|
| `0x10ac120` | `10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac12c` | `10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac131` | `10ac131:	49 89 c6             	mov    r14,rax` |
| `0x10ac149` | `10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac159` | `10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>` |
| `0x10ac187` | `10ac187:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ac18a` | `10ac18a:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac194` | `10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>` |
| `0x10ac19c` | `10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ac1a9` | `10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac1b4` | `10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac1ba` | `10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac204` | `10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac213` | `10ac213:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac216` | `10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac21b` | `10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl` |
| `0x10ac230` | `10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac23f` | `10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac249` | `10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac26a` | `10ac26a:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0` |
| `0x10ac304` | `10ac304:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0x10ac327` | `10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]` |
| `0x10ac336` | `10ac336:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac339` | `10ac339:	e8 8a b1 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac33e` | `10ac33e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10ac358` | `10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac36d` | `10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac372` | `10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac37a` | `10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac37d` | `10ac37d:	49 89 c6             	mov    r14,rax` |
| `0x10ac380` | `10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x10ac383` | `10ac383:	4c 89 ff             	mov    rdi,r15` |
| `0x10ac386` | `10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac389` | `10ac389:	49 89 c7             	mov    r15,rax` |
| `0x10ac391` | `10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac3a3` | `10ac3a3:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14` |
| `0x10ac3a7` | `10ac3a7:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15` |
| `0x10ac3ab` | `10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]` |

## Backward slice for `10ac37a call [rax+0x28]`

```text
 10ac0cc:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10ac0ea:	4c 89 f2             	mov    rdx,r14
 10ac0f1:	e8 fc b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac0fa:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10ac110:	4c 89 f2             	mov    rdx,r14
 10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac12b:	5f                   	pop    rdi
 10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac131:	49 89 c6             	mov    r14,rax
 10ac148:	5f                   	pop    rdi
 10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac14e:	49 89 c4             	mov    r12,rax
 10ac151:	48 89 c7             	mov    rdi,rax
 10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 10ac16a:	48 8d 05 69 78 a1 ff 	lea    rax,[rip+0xffffffffffa17869]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 10ac175:	48 8d 05 9a 1a 00 00 	lea    rax,[rip+0x1a9a]        # 10adc16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27502c>
 10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10ac187:	49 89 06             	mov    QWORD PTR [r14],rax
 10ac18a:	4c 89 f7             	mov    rdi,r14
 10ac18d:	48 83 c7 08          	add    rdi,0x8
 10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
 10ac199:	4c 89 ef             	mov    rdi,r13
 10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1a6:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac1ac:	48 85 ff             	test   rdi,rdi
 10ac1b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac1b9:	5f                   	pop    rdi
 10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl
 10ac1cf:	40 88 68 38          	mov    BYTE PTR [rax+0x38],bpl
 10ac1d3:	40 88 68 40          	mov    BYTE PTR [rax+0x40],bpl
 10ac1da:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 10ac1e2:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1eb:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 10ac1ee:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10ac1f3:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac213:	4c 89 f7             	mov    rdi,r14
 10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl
 10ac228:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac237:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>
 10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac258:	48 8d 90 90 00 00 00 	lea    rdx,[rax+0x90]
 10ac262:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10ac266:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
 10ac26a:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10ac26e:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10ac272:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac276:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0
 10ac27a:	0f 11 40 68          	movups XMMWORD PTR [rax+0x68],xmm0
 10ac27e:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0
 10ac289:	48 89 88 90 00 00 00 	mov    QWORD PTR [rax+0x90],rcx
 10ac297:	48 89 88 98 00 00 00 	mov    QWORD PTR [rax+0x98],rcx
 10ac29e:	48 89 90 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],rdx
 10ac2a5:	48 89 c2             	mov    rdx,rax
 10ac2b6:	48 89 88 c0 00 00 00 	mov    QWORD PTR [rax+0xc0],rcx
 10ac2c4:	48 89 88 c8 00 00 00 	mov    QWORD PTR [rax+0xc8],rcx
 10ac2cb:	48 89 90 e0 00 00 00 	mov    QWORD PTR [rax+0xe0],rdx
 10ac2d2:	0f 29 80 f0 00 00 00 	movaps XMMWORD PTR [rax+0xf0],xmm0
 10ac2d9:	0f 29 80 00 01 00 00 	movaps XMMWORD PTR [rax+0x100],xmm0
 10ac2e0:	0f 29 80 10 01 00 00 	movaps XMMWORD PTR [rax+0x110],xmm0
 10ac2e7:	0f 11 80 19 01 00 00 	movups XMMWORD PTR [rax+0x119],xmm0
 10ac2ee:	4c 89 a8 30 01 00 00 	mov    QWORD PTR [rax+0x130],r13
 10ac2fd:	48 89 88 38 01 00 00 	mov    QWORD PTR [rax+0x138],rcx
 10ac304:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 10ac309:	40 88 a8 40 01 00 00 	mov    BYTE PTR [rax+0x140],bpl
 10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac336:	4c 89 f7             	mov    rdi,r14
 10ac339:	e8 8a b1 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac33e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac350:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
```
## Backward slice for `10ac386 call [rax+0x28]`

```text
 10ac0ea:	4c 89 f2             	mov    rdx,r14
 10ac0f1:	e8 fc b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac0fa:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10ac110:	4c 89 f2             	mov    rdx,r14
 10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac12b:	5f                   	pop    rdi
 10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac131:	49 89 c6             	mov    r14,rax
 10ac148:	5f                   	pop    rdi
 10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac14e:	49 89 c4             	mov    r12,rax
 10ac151:	48 89 c7             	mov    rdi,rax
 10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 10ac16a:	48 8d 05 69 78 a1 ff 	lea    rax,[rip+0xffffffffffa17869]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 10ac175:	48 8d 05 9a 1a 00 00 	lea    rax,[rip+0x1a9a]        # 10adc16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27502c>
 10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10ac187:	49 89 06             	mov    QWORD PTR [r14],rax
 10ac18a:	4c 89 f7             	mov    rdi,r14
 10ac18d:	48 83 c7 08          	add    rdi,0x8
 10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
 10ac199:	4c 89 ef             	mov    rdi,r13
 10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1a6:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac1ac:	48 85 ff             	test   rdi,rdi
 10ac1b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac1b9:	5f                   	pop    rdi
 10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl
 10ac1cf:	40 88 68 38          	mov    BYTE PTR [rax+0x38],bpl
 10ac1d3:	40 88 68 40          	mov    BYTE PTR [rax+0x40],bpl
 10ac1da:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 10ac1e2:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ac1eb:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 10ac1ee:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 10ac1f3:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac213:	4c 89 f7             	mov    rdi,r14
 10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl
 10ac228:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac237:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>
 10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ac258:	48 8d 90 90 00 00 00 	lea    rdx,[rax+0x90]
 10ac262:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10ac266:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
 10ac26a:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10ac26e:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10ac272:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
 10ac276:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0
 10ac27a:	0f 11 40 68          	movups XMMWORD PTR [rax+0x68],xmm0
 10ac27e:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0
 10ac289:	48 89 88 90 00 00 00 	mov    QWORD PTR [rax+0x90],rcx
 10ac297:	48 89 88 98 00 00 00 	mov    QWORD PTR [rax+0x98],rcx
 10ac29e:	48 89 90 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],rdx
 10ac2a5:	48 89 c2             	mov    rdx,rax
 10ac2b6:	48 89 88 c0 00 00 00 	mov    QWORD PTR [rax+0xc0],rcx
 10ac2c4:	48 89 88 c8 00 00 00 	mov    QWORD PTR [rax+0xc8],rcx
 10ac2cb:	48 89 90 e0 00 00 00 	mov    QWORD PTR [rax+0xe0],rdx
 10ac2d2:	0f 29 80 f0 00 00 00 	movaps XMMWORD PTR [rax+0xf0],xmm0
 10ac2d9:	0f 29 80 00 01 00 00 	movaps XMMWORD PTR [rax+0x100],xmm0
 10ac2e0:	0f 29 80 10 01 00 00 	movaps XMMWORD PTR [rax+0x110],xmm0
 10ac2e7:	0f 11 80 19 01 00 00 	movups XMMWORD PTR [rax+0x119],xmm0
 10ac2ee:	4c 89 a8 30 01 00 00 	mov    QWORD PTR [rax+0x130],r13
 10ac2fd:	48 89 88 38 01 00 00 	mov    QWORD PTR [rax+0x138],rcx
 10ac304:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 10ac309:	40 88 a8 40 01 00 00 	mov    BYTE PTR [rax+0x140],bpl
 10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac336:	4c 89 f7             	mov    rdi,r14
 10ac339:	e8 8a b1 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
 10ac33e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10ac350:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ac377:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10ac37d:	49 89 c6             	mov    r14,rax
 10ac380:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ac383:	4c 89 ff             	mov    rdi,r15
 10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]
```
## Stack slot references inside constructor window

### `rsp+0x40` (1 refs)

```text
 10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
```
### `rsp+0x28` (2 refs)

```text
 10ac304:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 10ac3ab:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
```
### `rsp+0x80` (1 refs)

```text
 10ac1da:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
```
### `rsp+0x110` (8 refs)

```text
 10ac134:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
 10ac15e:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ac204:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac228:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac237:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac327:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10ac350:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac365:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
```
### `rsp+0x120` (1 refs)

```text
 10ac13d:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
```
## Raw/AP data around candidate object tables

### `0x184d898` raw qwords, section `None`

| slot | raw qword | relocation |
|---:|---:|---|

### `0x184d808` raw qwords, section `None`

| slot | raw qword | relocation |
|---:|---:|---|

### `0x187e260` raw qwords, section `None`

| slot | raw qword | relocation |
|---:|---:|---|

### `0x184da88` raw qwords, section `None`

| slot | raw qword | relocation |
|---:|---:|---|

### `0x184ca90` raw qwords, section `None`

| slot | raw qword | relocation |
|---:|---:|---|

## Relocation entries around candidate APs

### `0x184d898` relocations (0)

| slot | reloc target | symbol/tail |
|---:|---:|---|

### `0x184d808` relocations (1)

| slot | reloc target | symbol/tail |
|---:|---:|---|
| `0x70` / `0x184d878` | `0x9d81d0` | `_ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0` |

### `0x187e260` relocations (1)

| slot | reloc target | symbol/tail |
|---:|---:|---|
| `0x78` / `0x187e2d8` | `0x9d81d0` | `_ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0` |

### `0x184da88` relocations (0)

| slot | reloc target | symbol/tail |
|---:|---:|---|

### `0x184ca90` relocations (0)

| slot | reloc target | symbol/tail |
|---:|---:|---|

## Targeted xrefs

### `184d898` xrefs (2)

#### xref at `0x10ac180`

```text
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
```
#### xref at `0x10bff2c`

```text
 10bff1c:	5b                   	pop    rbx
 10bff1d:	e9 fe df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff22:	48 83 c7 18          	add    rdi,0x18
 10bff26:	e9 ff dd fe ff       	jmp    10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10bff2b:	cc                   	int3
 10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10bff33:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff36:	48 83 c7 08          	add    rdi,0x8
 10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10bff3f:	cc                   	int3
 10bff40:	53                   	push   rbx
 10bff41:	48 89 fb             	mov    rbx,rdi
 10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>
 10bff49:	48 89 df             	mov    rdi,rbx
 10bff4c:	5b                   	pop    rbx
```
### `184d808` xrefs (1)

#### xref at `0x10ac24e`

```text
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
```
### `187e260` xrefs (2)

#### xref at `0x10ac1bf`

```text
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
```
#### xref at `0x153c9f0`

```text
 153c9e6:	40 88 77 40          	mov    BYTE PTR [rdi+0x40],sil
 153c9ea:	c3                   	ret
 153c9eb:	cc                   	int3
 153c9ec:	53                   	push   rbx
 153c9ed:	48 89 fb             	mov    rbx,rdi
 153c9f0:	48 8d 05 69 18 34 00 	lea    rax,[rip+0x341869]        # 187e260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a948>
 153c9f7:	48 89 07             	mov    QWORD PTR [rdi],rax
 153c9fa:	48 8b 7f 50          	mov    rdi,QWORD PTR [rdi+0x50]
 153c9fe:	e8 af 1a 56 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 153ca03:	48 83 c3 08          	add    rbx,0x8
 153ca07:	48 89 df             	mov    rdi,rbx
 153ca0a:	5b                   	pop    rbx
 153ca0b:	e9 3c 1a b8 ff       	jmp    10be44c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285862>
 153ca10:	53                   	push   rbx
 153ca11:	48 89 fb             	mov    rbx,rdi
```
### `10bff2c` xrefs (2)

#### xref at `0x10bff2c`

```text
 10bff1c:	5b                   	pop    rbx
 10bff1d:	e9 fe df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff22:	48 83 c7 18          	add    rdi,0x18
 10bff26:	e9 ff dd fe ff       	jmp    10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10bff2b:	cc                   	int3
 10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10bff33:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff36:	48 83 c7 08          	add    rdi,0x8
 10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10bff3f:	cc                   	int3
 10bff40:	53                   	push   rbx
 10bff41:	48 89 fb             	mov    rbx,rdi
 10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>
 10bff49:	48 89 df             	mov    rdi,rbx
 10bff4c:	5b                   	pop    rbx
```
#### xref at `0x10bff44`

```text
 10bff36:	48 83 c7 08          	add    rdi,0x8
 10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10bff3f:	cc                   	int3
 10bff40:	53                   	push   rbx
 10bff41:	48 89 fb             	mov    rbx,rdi
 10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>
 10bff49:	48 89 df             	mov    rdi,rbx
 10bff4c:	5b                   	pop    rbx
 10bff4d:	e9 ce df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff52:	41 56                	push   r14
 10bff54:	53                   	push   rbx
 10bff55:	48 83 ec 28          	sub    rsp,0x28
 10bff59:	48 89 d3             	mov    rbx,rdx
 10bff5c:	48 89 f2             	mov    rdx,rsi
 10bff5f:	48 89 f8             	mov    rax,rdi
```
### `10bff40` xrefs (1)

#### xref at `0x10bff40`

```text
 10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10bff33:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff36:	48 83 c7 08          	add    rdi,0x8
 10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10bff3f:	cc                   	int3
 10bff40:	53                   	push   rbx
 10bff41:	48 89 fb             	mov    rbx,rdi
 10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>
 10bff49:	48 89 df             	mov    rdi,rbx
 10bff4c:	5b                   	pop    rbx
 10bff4d:	e9 ce df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff52:	41 56                	push   r14
 10bff54:	53                   	push   rbx
 10bff55:	48 83 ec 28          	sub    rsp,0x28
 10bff59:	48 89 d3             	mov    rbx,rdx
```
### `107162a` xrefs (5)

#### xref at `0x106e01a`

```text
 106e003:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 106e008:	4d 89 74 24 30       	mov    QWORD PTR [r12+0x30],r14
 106e00d:	4d 8d 7c 24 38       	lea    r15,[r12+0x38]
 106e012:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
 106e017:	4c 89 ff             	mov    rdi,r15
 106e01a:	e8 0b 36 00 00       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
 106e01f:	4d 8d 74 24 58       	lea    r14,[r12+0x58]
 106e024:	0f 57 c0             	xorps  xmm0,xmm0
 106e027:	41 0f 11 44 24 68    	movups XMMWORD PTR [r12+0x68],xmm0
 106e02d:	41 0f 11 44 24 58    	movups XMMWORD PTR [r12+0x58],xmm0
 106e033:	bb 00 00 80 3f       	mov    ebx,0x3f800000
 106e038:	41 89 5c 24 78       	mov    DWORD PTR [r12+0x78],ebx
 106e03d:	4d 8d ac 24 a0 00 00 	lea    r13,[r12+0xa0]
 106e044:	00
 106e045:	41 0f 11 84 24 80 00 	movups XMMWORD PTR [r12+0x80],xmm0
```
#### xref at `0x107162a`

```text
 1071620:	74 06                	je     1071628 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a3e>
 1071622:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1071625:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
 1071628:	c3                   	ret
 1071629:	cc                   	int3
 107162a:	41 56                	push   r14
 107162c:	53                   	push   rbx
 107162d:	50                   	push   rax
 107162e:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1071632:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 1071637:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 107163b:	48 85 c0             	test   rax,rax
 107163e:	74 22                	je     1071662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a78>
 1071640:	48 89 fb             	mov    rbx,rdi
 1071643:	49 89 f6             	mov    r14,rsi
```
#### xref at `0x10ac194`

```text
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
```
#### xref at `0x11ef75c`

```text
 11ef749:	48 8d ac 24 20 05 00 	lea    rbp,[rsp+0x520]
 11ef750:	00
 11ef751:	48 89 ef             	mov    rdi,rbp
 11ef754:	48 8d b4 24 a0 04 00 	lea    rsi,[rsp+0x4a0]
 11ef75b:	00
 11ef75c:	e8 c9 1e e8 ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
 11ef761:	48 8d 05 38 01 67 00 	lea    rax,[rip+0x670138]        # 185f8a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1bf88>
 11ef768:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
 11ef76c:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
 11ef770:	48 8b 84 24 58 06 00 	mov    rax,QWORD PTR [rsp+0x658]
 11ef777:	00
 11ef778:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 11ef77b:	e8 26 a1 3f 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
 11ef780:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 11ef785:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
```
#### xref at `0x11ef810`

```text
 11ef7f3:	4c 89 a3 d0 00 00 00 	mov    QWORD PTR [rbx+0xd0],r12
 11ef7fa:	4c 89 bb d8 00 00 00 	mov    QWORD PTR [rbx+0xd8],r15
 11ef801:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
 11ef808:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
 11ef80d:	48 89 ee             	mov    rsi,rbp
 11ef810:	e8 15 1e e8 ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
 11ef815:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
 11ef81c:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
 11ef821:	4c 89 ee             	mov    rsi,r13
 11ef824:	e8 99 1e 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 11ef829:	4c 8d ab 10 01 00 00 	lea    r13,[rbx+0x110]
 11ef830:	4c 89 ef             	mov    rdi,r13
 11ef833:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
 11ef838:	48 8b 54 24 70       	mov    rdx,QWORD PTR [rsp+0x70]
 11ef83d:	e8 d8 d1 8a ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
```
### `de1c52` xrefs (15)

#### xref at `0xde1bb4`

```text
  de1ba4:	48 85 ff             	test   rdi,rdi
  de1ba7:	74 06                	je     de1baf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaec35>
  de1ba9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  de1bac:	ff 50 08             	call   QWORD PTR [rax+0x8]
  de1baf:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  de1bb4:	e8 99 00 00 00       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
  de1bb9:	49 89 1e             	mov    QWORD PTR [r14],rbx
  de1bbc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  de1bc3:	00 00
  de1bc5:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
  de1bca:	75 6e                	jne    de1c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecc0>
  de1bcc:	4c 89 f0             	mov    rax,r14
  de1bcf:	48 83 c4 58          	add    rsp,0x58
  de1bd3:	5b                   	pop    rbx
  de1bd4:	41 5c                	pop    r12
```
#### xref at `0xde1c15`

```text
  de1c03:	eb 03                	jmp    de1c08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaec8e>
  de1c05:	49 89 c6             	mov    r14,rax
  de1c08:	4c 89 ff             	mov    rdi,r15
  de1c0b:	e8 18 82 c9 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  de1c10:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  de1c15:	e8 38 00 00 00       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
  de1c1a:	48 89 df             	mov    rdi,rbx
  de1c1d:	e8 fe c2 a0 00       	call   17edf20 <_ZdlPv@plt>
  de1c22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  de1c29:	00 00
  de1c2b:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
  de1c30:	75 08                	jne    de1c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecc0>
  de1c32:	4c 89 f7             	mov    rdi,r14
  de1c35:	e8 96 e0 c8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  de1c3a:	e8 71 de a0 00       	call   17efab0 <__stack_chk_fail@plt>
```
#### xref at `0xde1c52`

```text
  de1c47:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  de1c4a:	ff 50 28             	call   QWORD PTR [rax+0x28]
  de1c4d:	48 89 d8             	mov    rax,rbx
  de1c50:	5b                   	pop    rbx
  de1c51:	c3                   	ret
  de1c52:	53                   	push   rbx
  de1c53:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  de1c57:	48 85 c0             	test   rax,rax
  de1c5a:	74 11                	je     de1c6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecf3>
  de1c5c:	48 89 fb             	mov    rbx,rdi
  de1c5f:	31 ff                	xor    edi,edi
  de1c61:	48 89 de             	mov    rsi,rbx
  de1c64:	31 d2                	xor    edx,edx
  de1c66:	ff d0                	call   rax
  de1c68:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
```
#### xref at `0x106e096`

```text
 106e083:	00
 106e084:	49 8d bc 24 d8 00 00 	lea    rdi,[r12+0xd8]
 106e08b:	00
 106e08c:	e8 99 76 af ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 106e091:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 106e096:	e8 b7 3b d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 106e09b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 106e0a0:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 106e0a3:	4c 89 20             	mov    QWORD PTR [rax],r12
 106e0a6:	48 85 ff             	test   rdi,rdi
 106e0a9:	74 06                	je     106e0b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2354c7>
 106e0ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 106e0ae:	ff 50 08             	call   QWORD PTR [rax+0x8]
 106e0b1:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
 106e0b6:	e8 cb 03 a3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
```
#### xref at `0x106e19b`

```text
 106e189:	00
 106e18a:	e8 f7 02 a3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 106e18f:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 106e193:	e8 46 fe b0 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
 106e198:	4c 89 ff             	mov    rdi,r15
 106e19b:	e8 b2 3a d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 106e1a0:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
 106e1a5:	e8 dc 02 a3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 106e1aa:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 106e1af:	e8 9e 3a d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 106e1b4:	4c 89 e7             	mov    rdi,r12
 106e1b7:	e8 64 fd 77 00       	call   17edf20 <_ZdlPv@plt>
 106e1bc:	eb 05                	jmp    106e1c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2355d9>
 106e1be:	eb 32                	jmp    106e1f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235608>
 106e1c0:	49 89 c6             	mov    r14,rax
```
#### xref at `0x106e1af`

```text
 106e198:	4c 89 ff             	mov    rdi,r15
 106e19b:	e8 b2 3a d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 106e1a0:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
 106e1a5:	e8 dc 02 a3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 106e1aa:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 106e1af:	e8 9e 3a d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 106e1b4:	4c 89 e7             	mov    rdi,r12
 106e1b7:	e8 64 fd 77 00       	call   17edf20 <_ZdlPv@plt>
 106e1bc:	eb 05                	jmp    106e1c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2355d9>
 106e1be:	eb 32                	jmp    106e1f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235608>
 106e1c0:	49 89 c6             	mov    r14,rax
 106e1c3:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
 106e1c8:	e8 b9 02 a3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 106e1cd:	eb 3c                	jmp    106e20b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235621>
 106e1cf:	eb 21                	jmp    106e1f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235608>
```
#### xref at `0x1071704`

```text
 10716eb:	48 8b bb 88 00 00 00 	mov    rdi,QWORD PTR [rbx+0x88]
 10716f2:	e8 8f cd a2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10716f7:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10716fb:	e8 de c8 b0 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
 1071700:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 1071704:	e8 49 05 d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 1071709:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
 107170d:	48 83 c4 08          	add    rsp,0x8
 1071711:	5b                   	pop    rbx
 1071712:	41 5e                	pop    r14
 1071714:	e9 6d cd a2 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 1071719:	48 89 c7             	mov    rdi,rax
 107171c:	e8 84 83 a0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1071721:	cc                   	int3
 1071722:	53                   	push   rbx
```
#### xref at `0x10ac19c`

```text
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
```
#### xref at `0x10ad964`

```text
 10ad952:	e8 c9 05 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad957:	eb 03                	jmp    10ad95c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d72>
 10ad959:	48 89 c3             	mov    rbx,rax
 10ad95c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad963:	00
 10ad964:	e8 e9 42 d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10ad969:	4c 89 f7             	mov    rdi,r14
 10ad96c:	e8 af 05 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad971:	e9 02 02 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ad976:	e9 fa 01 00 00       	jmp    10adb75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8b>
 10ad97b:	48 89 c3             	mov    rbx,rax
 10ad97e:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ad982:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ad989:	e8 02 05 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad98e:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
```
#### xref at `0x10bff3a`

```text
 10bff26:	e9 ff dd fe ff       	jmp    10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10bff2b:	cc                   	int3
 10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10bff33:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff36:	48 83 c7 08          	add    rdi,0x8
 10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10bff3f:	cc                   	int3
 10bff40:	53                   	push   rbx
 10bff41:	48 89 fb             	mov    rbx,rdi
 10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>
 10bff49:	48 89 df             	mov    rdi,rbx
 10bff4c:	5b                   	pop    rbx
 10bff4d:	e9 ce df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff52:	41 56                	push   r14
 10bff54:	53                   	push   rbx
```
#### xref at `0x11ef911`

```text
 11ef8fc:	48 83 a3 b8 02 00 00 	and    QWORD PTR [rbx+0x2b8],0x0
 11ef903:	00
 11ef904:	e8 21 5e 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 11ef909:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
 11ef910:	00
 11ef911:	e8 3c 23 bf ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 11ef916:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11ef91d:	00
 11ef91e:	e8 2d 98 00 00       	call   11f9150 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6d4>
 11ef923:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11ef92a:	00
 11ef92b:	e8 46 98 00 00       	call   11f9176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6fa>
 11ef930:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11ef937:	00
 11ef938:	e8 77 40 8d ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
```
#### xref at `0x11ef945`

```text
 11ef930:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11ef937:	00
 11ef938:	e8 77 40 8d ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
 11ef93d:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
 11ef944:	00
 11ef945:	e8 08 23 bf ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 11ef94a:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11ef951:	00
 11ef952:	e8 39 e5 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ef957:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
 11ef95e:	00
 11ef95f:	e8 2c e5 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ef964:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
 11ef96b:	00
 11ef96c:	e8 43 40 8d ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
```
... truncated 3 more xrefs ...

### `15e74c8` xrefs (77)

#### xref at `0xb62aa8`

```text
  b62a9d:	00
  b62a9e:	6a 1a                	push   0x1a
  b62aa0:	41 59                	pop    r9
  b62aa2:	4c 89 ff             	mov    rdi,r15
  b62aa5:	4c 89 f1             	mov    rcx,r14
  b62aa8:	e8 1b 4a a8 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  b62aad:	41 80 7f 18 00       	cmp    BYTE PTR [r15+0x18],0x0
  b62ab2:	89 5c 24 5c          	mov    DWORD PTR [rsp+0x5c],ebx
  b62ab6:	74 7d                	je     b62b35 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xafad5>
  b62ab8:	48 8d 35 80 6a 81 ff 	lea    rsi,[rip+0xffffffffff816a80]        # 37953f <_ZTSSt12bad_any_cast@@Base-0x16c89>
  b62abf:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b62ac6:	00
  b62ac7:	e8 83 8d f1 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  b62acc:	84 c0                	test   al,al
  b62ace:	74 49                	je     b62b19 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xafab9>
```
#### xref at `0xbd72a4`

```text
  bd7295:	48 89 ef             	mov    rdi,rbp
  bd7298:	4c 89 fa             	mov    rdx,r15
  bd729b:	48 89 d9             	mov    rcx,rbx
  bd729e:	4d 89 f0             	mov    r8,r14
  bd72a1:	4d 89 e9             	mov    r9,r13
  bd72a4:	e8 1f 02 a1 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  bd72a9:	bb 00 01 00 00       	mov    ebx,0x100
  bd72ae:	80 7d 18 00          	cmp    BYTE PTR [rbp+0x18],0x0
  bd72b2:	74 2e                	je     bd72e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x124282>
  bd72b4:	48 8d 35 ce 22 85 ff 	lea    rsi,[rip+0xffffffffff8522ce]        # 429589 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x4efd8>
  bd72bb:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  bd72c0:	e8 8a 45 ea ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  bd72c5:	84 c0                	test   al,al
  bd72c7:	75 19                	jne    bd72e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x124282>
  bd72c9:	48 8d 35 24 e9 76 ff 	lea    rsi,[rip+0xffffffffff76e924]        # 345bf4 <_ZTSSt12bad_any_cast@@Base-0x4a5d4>
```
#### xref at `0xbd73d3`

```text
  bd73c4:	4c 89 e7             	mov    rdi,r12
  bd73c7:	48 89 da             	mov    rdx,rbx
  bd73ca:	4c 89 f9             	mov    rcx,r15
  bd73cd:	4d 89 f0             	mov    r8,r14
  bd73d0:	49 89 e9             	mov    r9,rbp
  bd73d3:	e8 f0 00 a1 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  bd73d8:	6a 01                	push   0x1
  bd73da:	41 5e                	pop    r14
  bd73dc:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
  bd73e2:	74 25                	je     bd7409 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1243a9>
  bd73e4:	48 8d 35 76 3d 76 ff 	lea    rsi,[rip+0xffffffffff763d76]        # 33b161 <_ZTSSt12bad_any_cast@@Base-0x55067>
  bd73eb:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  bd73f0:	e8 5a 44 ea ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  bd73f5:	84 c0                	test   al,al
  bd73f7:	40 8a 6c 24 07       	mov    bpl,BYTE PTR [rsp+0x7]
```
#### xref at `0xbd8e60`

```text
  bd8e51:	4c 89 ff             	mov    rdi,r15
  bd8e54:	4c 89 f2             	mov    rdx,r14
  bd8e57:	4c 89 e1             	mov    rcx,r12
  bd8e5a:	49 89 d8             	mov    r8,rbx
  bd8e5d:	49 89 e9             	mov    r9,rbp
  bd8e60:	e8 63 e6 a0 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  bd8e65:	6a 01                	push   0x1
  bd8e67:	5b                   	pop    rbx
  bd8e68:	41 80 7f 18 00       	cmp    BYTE PTR [r15+0x18],0x0
  bd8e6d:	74 2b                	je     bd8e9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x125e3a>
  bd8e6f:	48 8d 35 a0 df 7e ff 	lea    rsi,[rip+0xffffffffff7edfa0]        # 3c6e16 <_ZTSN5boost9exceptionE@@Base+0x277f8>
  bd8e76:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  bd8e7b:	e8 cf 29 ea ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  bd8e80:	84 c0                	test   al,al
  bd8e82:	75 16                	jne    bd8e9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x125e3a>
```
#### xref at `0xbd8f74`

```text
  bd8f65:	4c 89 ff             	mov    rdi,r15
  bd8f68:	48 89 da             	mov    rdx,rbx
  bd8f6b:	4c 89 e1             	mov    rcx,r12
  bd8f6e:	4d 89 f0             	mov    r8,r14
  bd8f71:	4d 89 e9             	mov    r9,r13
  bd8f74:	e8 4f e5 a0 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  bd8f79:	45 31 ed             	xor    r13d,r13d
  bd8f7c:	41 80 7f 18 00       	cmp    BYTE PTR [r15+0x18],0x0
  bd8f81:	74 45                	je     bd8fc8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x125f68>
  bd8f83:	48 8d 35 2b 39 79 ff 	lea    rsi,[rip+0xffffffffff79392b]        # 36c8b5 <_ZTSSt12bad_any_cast@@Base-0x23913>
  bd8f8a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  bd8f8f:	e8 bb 28 ea ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  bd8f94:	84 c0                	test   al,al
  bd8f96:	74 06                	je     bd8f9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x125f3e>
  bd8f98:	6a 02                	push   0x2
```
#### xref at `0xc0697c`

```text
  c06965:	4c 89 f7             	mov    rdi,r14
  c06968:	48 8d 15 a6 0c 7c ff 	lea    rdx,[rip+0xffffffffff7c0ca6]        # 3c7615 <_ZTSN5boost9exceptionE@@Base+0x27ff7>
  c0696f:	4c 89 e1             	mov    rcx,r12
  c06972:	4c 8d 05 b7 0c 7c ff 	lea    r8,[rip+0xffffffffff7c0cb7]        # 3c7630 <_ZTSN5boost9exceptionE@@Base+0x28012>
  c06979:	4d 89 f9             	mov    r9,r15
  c0697c:	e8 47 0b 9e 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c06981:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  c06986:	74 38                	je     c069c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x153960>
  c06988:	48 8d 35 7b 41 72 ff 	lea    rsi,[rip+0xffffffffff72417b]        # 32ab0a <_ZTSSt12bad_any_cast@@Base-0x656be>
  c0698f:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  c06996:	00
  c06997:	e8 b3 4e e7 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c0699c:	84 c0                	test   al,al
  c0699e:	74 06                	je     c069a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x153946>
  c069a0:	6a 02                	push   0x2
```
#### xref at `0xc54fe1`

```text
  c54fd6:	00
  c54fd7:	6a 26                	push   0x26
  c54fd9:	41 59                	pop    r9
  c54fdb:	4c 89 f7             	mov    rdi,r14
  c54fde:	48 89 d9             	mov    rcx,rbx
  c54fe1:	e8 e2 24 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c54fe6:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  c54feb:	74 4e                	je     c5503b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a1fdb>
  c54fed:	48 8d 35 29 45 6f ff 	lea    rsi,[rip+0xffffffffff6f4529]        # 34951d <_ZTSSt12bad_any_cast@@Base-0x46cab>
  c54ff4:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c54ffb:	00
  c54ffc:	e8 4e 68 e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c55001:	84 c0                	test   al,al
  c55003:	74 06                	je     c5500b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a1fab>
  c55005:	6a 02                	push   0x2
```
#### xref at `0xc5524a`

```text
  c5523f:	00
  c55240:	6a 36                	push   0x36
  c55242:	41 59                	pop    r9
  c55244:	4c 89 e7             	mov    rdi,r12
  c55247:	4c 89 f1             	mov    rcx,r14
  c5524a:	e8 79 22 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c5524f:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
  c55255:	74 58                	je     c552af <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a224f>
  c55257:	48 8d 35 44 36 78 ff 	lea    rsi,[rip+0xffffffffff783644]        # 3d88a2 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3487>
  c5525e:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c55265:	00
  c55266:	e8 e4 65 e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c5526b:	84 c0                	test   al,al
  c5526d:	74 15                	je     c55284 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a2224>
  c5526f:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
```
#### xref at `0xc552f4`

```text
  c552ea:	6a 15                	push   0x15
  c552ec:	59                   	pop    rcx
  c552ed:	6a 34                	push   0x34
  c552ef:	41 59                	pop    r9
  c552f1:	4c 89 f7             	mov    rdi,r14
  c552f4:	e8 cf 21 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c552f9:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  c552fe:	74 58                	je     c55358 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a22f8>
  c55300:	48 8d 35 9b 35 78 ff 	lea    rsi,[rip+0xffffffffff78359b]        # 3d88a2 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3487>
  c55307:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c5530e:	00
  c5530f:	e8 3b 65 e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c55314:	84 c0                	test   al,al
  c55316:	74 15                	je     c5532d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a22cd>
  c55318:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
```
#### xref at `0xc553fd`

```text
  c553f2:	00
  c553f3:	6a 3c                	push   0x3c
  c553f5:	41 59                	pop    r9
  c553f7:	4c 89 e7             	mov    rdi,r12
  c553fa:	4c 89 f1             	mov    rcx,r14
  c553fd:	e8 c6 20 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c55402:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
  c55408:	74 49                	je     c55453 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a23f3>
  c5540a:	48 8d 35 91 34 78 ff 	lea    rsi,[rip+0xffffffffff783491]        # 3d88a2 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3487>
  c55411:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c55418:	00
  c55419:	e8 31 64 e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c5541e:	84 c0                	test   al,al
  c55420:	74 15                	je     c55437 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a23d7>
  c55422:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
```
#### xref at `0xc55494`

```text
  c5548a:	6a 15                	push   0x15
  c5548c:	59                   	pop    rcx
  c5548d:	6a 3a                	push   0x3a
  c5548f:	41 59                	pop    r9
  c55491:	4c 89 f7             	mov    rdi,r14
  c55494:	e8 2f 20 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c55499:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  c5549e:	74 49                	je     c554e9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a2489>
  c554a0:	48 8d 35 fb 33 78 ff 	lea    rsi,[rip+0xffffffffff7833fb]        # 3d88a2 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3487>
  c554a7:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c554ae:	00
  c554af:	e8 9b 63 e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c554b4:	84 c0                	test   al,al
  c554b6:	74 15                	je     c554cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a246d>
  c554b8:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
```
#### xref at `0xc5552a`

```text
  c55520:	6a 15                	push   0x15
  c55522:	59                   	pop    rcx
  c55523:	6a 3d                	push   0x3d
  c55525:	41 59                	pop    r9
  c55527:	4c 89 f7             	mov    rdi,r14
  c5552a:	e8 99 1f 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c5552f:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  c55534:	74 49                	je     c5557f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a251f>
  c55536:	48 8d 35 65 33 78 ff 	lea    rsi,[rip+0xffffffffff783365]        # 3d88a2 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3487>
  c5553d:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c55544:	00
  c55545:	e8 05 63 e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c5554a:	84 c0                	test   al,al
  c5554c:	74 15                	je     c55563 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a2503>
  c5554e:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
```
... truncated 65 more xrefs ...

### `aa6d30` xrefs (2826)

#### xref at `0xaa4f45`

```text
  aa4f35:	5a                   	pop    rdx
  aa4f36:	31 c0                	xor    eax,eax
  aa4f38:	e8 95 19 d3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  aa4f3d:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
  aa4f44:	00
  aa4f45:	e8 e6 1d 00 00       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa4f4a:	48 8b 5d 00          	mov    rbx,QWORD PTR [rbp+0x0]
  aa4f4e:	48 8d 35 3c 81 ff ff 	lea    rsi,[rip+0xffffffffffff813c]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  aa4f55:	48 8d 0d d2 6c 01 00 	lea    rcx,[rip+0x16cd2]        # abbc2e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bce>
  aa4f5c:	4c 8d b4 24 10 08 00 	lea    r14,[rsp+0x810]
  aa4f63:	00
  aa4f64:	4c 8d 84 24 70 02 00 	lea    r8,[rsp+0x270]
  aa4f6b:	00
  aa4f6c:	6a 01                	push   0x1
  aa4f6e:	41 59                	pop    r9
```
#### xref at `0xaa6cb9`

```text
  aa6ca8:	e8 12 33 fd ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  aa6cad:	cc                   	int3
  aa6cae:	53                   	push   rbx
  aa6caf:	48 89 fb             	mov    rbx,rdi
  aa6cb2:	48 81 c7 68 04 00 00 	add    rdi,0x468
  aa6cb9:	e8 72 00 00 00       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa6cbe:	48 8d bb 50 04 00 00 	lea    rdi,[rbx+0x450]
  aa6cc5:	e8 c6 71 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6cca:	48 8d bb e8 03 00 00 	lea    rdi,[rbx+0x3e8]
  aa6cd1:	e8 66 00 00 00       	call   aa6d3c <JNI_OnUnload@@Base+0x2e609>
  aa6cd6:	48 8d bb a8 03 00 00 	lea    rdi,[rbx+0x3a8]
  aa6cdd:	e8 7a 00 00 00       	call   aa6d5c <JNI_OnUnload@@Base+0x2e629>
  aa6ce2:	48 8d bb 30 03 00 00 	lea    rdi,[rbx+0x330]
  aa6ce9:	e8 7a 00 00 00       	call   aa6d68 <JNI_OnUnload@@Base+0x2e635>
  aa6cee:	48 8d bb a0 02 00 00 	lea    rdi,[rbx+0x2a0]
```
#### xref at `0xaa6d30`

```text
  aa6d1e:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
  aa6d22:	e8 01 01 00 00       	call   aa6e28 <JNI_OnUnload@@Base+0x2e6f5>
  aa6d27:	48 89 df             	mov    rdi,rbx
  aa6d2a:	5b                   	pop    rbx
  aa6d2b:	e9 24 01 00 00       	jmp    aa6e54 <JNI_OnUnload@@Base+0x2e721>
  aa6d30:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
  aa6d34:	0f 85 56 71 d4 00    	jne    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6d3a:	c3                   	ret
  aa6d3b:	cc                   	int3
  aa6d3c:	53                   	push   rbx
  aa6d3d:	48 89 fb             	mov    rbx,rdi
  aa6d40:	48 83 c7 40          	add    rdi,0x40
  aa6d44:	e8 e7 ff ff ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa6d49:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  aa6d4d:	e8 de ff ff ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
```
#### xref at `0xaa6d44`

```text
  aa6d3a:	c3                   	ret
  aa6d3b:	cc                   	int3
  aa6d3c:	53                   	push   rbx
  aa6d3d:	48 89 fb             	mov    rbx,rdi
  aa6d40:	48 83 c7 40          	add    rdi,0x40
  aa6d44:	e8 e7 ff ff ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa6d49:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  aa6d4d:	e8 de ff ff ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa6d52:	48 89 df             	mov    rdi,rbx
  aa6d55:	5b                   	pop    rbx
  aa6d56:	e9 33 01 00 00       	jmp    aa6e8e <JNI_OnUnload@@Base+0x2e75b>
  aa6d5b:	cc                   	int3
  aa6d5c:	80 7f 30 00          	cmp    BYTE PTR [rdi+0x30],0x0
  aa6d60:	0f 85 50 03 b4 00    	jne    15e70b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c63a>
  aa6d66:	c3                   	ret
```
#### xref at `0xaa6d4d`

```text
  aa6d3c:	53                   	push   rbx
  aa6d3d:	48 89 fb             	mov    rbx,rdi
  aa6d40:	48 83 c7 40          	add    rdi,0x40
  aa6d44:	e8 e7 ff ff ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa6d49:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  aa6d4d:	e8 de ff ff ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa6d52:	48 89 df             	mov    rdi,rbx
  aa6d55:	5b                   	pop    rbx
  aa6d56:	e9 33 01 00 00       	jmp    aa6e8e <JNI_OnUnload@@Base+0x2e75b>
  aa6d5b:	cc                   	int3
  aa6d5c:	80 7f 30 00          	cmp    BYTE PTR [rdi+0x30],0x0
  aa6d60:	0f 85 50 03 b4 00    	jne    15e70b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c63a>
  aa6d66:	c3                   	ret
  aa6d67:	cc                   	int3
  aa6d68:	53                   	push   rbx
```
#### xref at `0xaa6e7c`

```text
  aa6e6e:	e9 1d 70 d4 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e73:	cc                   	int3
  aa6e74:	53                   	push   rbx
  aa6e75:	48 89 fb             	mov    rbx,rdi
  aa6e78:	48 83 c7 30          	add    rdi,0x30
  aa6e7c:	e8 af fe ff ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  aa6e81:	48 83 c3 04          	add    rbx,0x4
  aa6e85:	48 89 df             	mov    rdi,rbx
  aa6e88:	5b                   	pop    rbx
  aa6e89:	e9 c2 71 d4 00       	jmp    17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  aa6e8e:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
  aa6e92:	0f 85 02 00 00 00    	jne    aa6e9a <JNI_OnUnload@@Base+0x2e767>
  aa6e98:	c3                   	ret
  aa6e99:	cc                   	int3
  aa6e9a:	48 83 ec 18          	sub    rsp,0x18
```
#### xref at `0xab6dbb`

```text
  ab6da5:	89 c5                	mov    ebp,eax
  ab6da7:	48 8d 5c 24 58       	lea    rbx,[rsp+0x58]
  ab6dac:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
  ab6db1:	e8 b4 31 fc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ab6db6:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  ab6dbb:	e8 70 ff fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ab6dc0:	85 ed                	test   ebp,ebp
  ab6dc2:	74 1b                	je     ab6ddf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3d7f>
  ab6dc4:	48 8d 35 52 55 8b ff 	lea    rsi,[rip+0xffffffffff8b5552]        # 36c31d <_ZTSSt12bad_any_cast@@Base-0x23eab>
  ab6dcb:	48 8d 0d 06 b9 8c ff 	lea    rcx,[rip+0xffffffffff8cb906]        # 3826d8 <_ZTSSt12bad_any_cast@@Base-0xdaf0>
  ab6dd2:	6a 03                	push   0x3
  ab6dd4:	5f                   	pop    rdi
  ab6dd5:	6a 55                	push   0x55
  ab6dd7:	5a                   	pop    rdx
  ab6dd8:	31 c0                	xor    eax,eax
```
#### xref at `0xac14b4`

```text
  ac14a7:	eb 1a                	jmp    ac14c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe463>
  ac14a9:	31 db                	xor    ebx,ebx
  ac14ab:	eb 0c                	jmp    ac14b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe459>
  ac14ad:	31 db                	xor    ebx,ebx
  ac14af:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  ac14b4:	e8 77 58 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac14b9:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  ac14be:	e8 6d 58 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac14c3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  ac14ca:	00
  ac14cb:	e8 60 58 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac14d0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ac14d7:	00 00
  ac14d9:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
  ac14e0:	00
```
#### xref at `0xac14be`

```text
  ac14ab:	eb 0c                	jmp    ac14b9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe459>
  ac14ad:	31 db                	xor    ebx,ebx
  ac14af:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  ac14b4:	e8 77 58 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac14b9:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  ac14be:	e8 6d 58 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac14c3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  ac14ca:	00
  ac14cb:	e8 60 58 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac14d0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ac14d7:	00 00
  ac14d9:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
  ac14e0:	00
  ac14e1:	75 15                	jne    ac14f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe498>
  ac14e3:	48 89 d8             	mov    rax,rbx
```
#### xref at `0xac14cb`

```text
  ac14b4:	e8 77 58 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac14b9:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  ac14be:	e8 6d 58 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac14c3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  ac14ca:	00
  ac14cb:	e8 60 58 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac14d0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ac14d7:	00 00
  ac14d9:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
  ac14e0:	00
  ac14e1:	75 15                	jne    ac14f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe498>
  ac14e3:	48 89 d8             	mov    rax,rbx
  ac14e6:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
  ac14ed:	5b                   	pop    rbx
  ac14ee:	41 5c                	pop    r12
```
#### xref at `0xac168c`

```text
  ac167f:	eb 1a                	jmp    ac169b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe63b>
  ac1681:	31 db                	xor    ebx,ebx
  ac1683:	eb 0c                	jmp    ac1691 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe631>
  ac1685:	31 db                	xor    ebx,ebx
  ac1687:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  ac168c:	e8 9f 56 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac1691:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  ac1696:	e8 95 56 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac169b:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  ac16a2:	00
  ac16a3:	e8 88 56 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac16a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ac16af:	00 00
  ac16b1:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
  ac16b8:	00
```
#### xref at `0xac1696`

```text
  ac1683:	eb 0c                	jmp    ac1691 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe631>
  ac1685:	31 db                	xor    ebx,ebx
  ac1687:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  ac168c:	e8 9f 56 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac1691:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  ac1696:	e8 95 56 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac169b:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  ac16a2:	00
  ac16a3:	e8 88 56 fe ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  ac16a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ac16af:	00 00
  ac16b1:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
  ac16b8:	00
  ac16b9:	75 15                	jne    ac16d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe670>
  ac16bb:	48 89 d8             	mov    rax,rbx
```
... truncated 2814 more xrefs ...

### `a7b84f` xrefs (937)

#### xref at `0xa7aef5`

```text
  a7aee2:	48 8b ac 24 d0 00 00 	mov    rbp,QWORD PTR [rsp+0xd0]
  a7aee9:	00
  a7aeea:	4a 8b 5c 35 f8       	mov    rbx,QWORD PTR [rbp+r14*1-0x8]
  a7aeef:	4c 89 e7             	mov    rdi,r12
  a7aef2:	48 89 de             	mov    rsi,rbx
  a7aef5:	e8 55 09 00 00       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  a7aefa:	84 c0                	test   al,al
  a7aefc:	75 30                	jne    a7af2e <JNI_OnUnload@@Base+0x27fb>
  a7aefe:	4d 8d 3c 2e          	lea    r15,[r14+rbp*1]
  a7af02:	42 80 7c 35 00 06    	cmp    BYTE PTR [rbp+r14*1+0x0],0x6
  a7af08:	48 8d 05 21 6d 9d ff 	lea    rax,[rip+0xffffffffff9d6d21]        # 451c30 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1783c>
  a7af0f:	4c 0f 45 f8          	cmovne r15,rax
  a7af13:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
  a7af1a:	00
  a7af1b:	48 89 de             	mov    rsi,rbx
```
#### xref at `0xa7b84f`

```text
  a7b83f:	d1 ea                	shr    edx,1
  a7b841:	f6 c1 01             	test   cl,0x1
  a7b844:	48 0f 45 47 10       	cmovne rax,QWORD PTR [rdi+0x10]
  a7b849:	48 0f 45 57 08       	cmovne rdx,QWORD PTR [rdi+0x8]
  a7b84e:	c3                   	ret
  a7b84f:	41 57                	push   r15
  a7b851:	41 56                	push   r14
  a7b853:	53                   	push   rbx
  a7b854:	48 89 f3             	mov    rbx,rsi
  a7b857:	e8 da ff ff ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  a7b85c:	49 89 c6             	mov    r14,rax
  a7b85f:	49 89 d7             	mov    r15,rdx
  a7b862:	48 89 df             	mov    rdi,rbx
  a7b865:	e8 a6 26 d7 00       	call   17edf10 <strlen@plt>
  a7b86a:	4c 89 f7             	mov    rdi,r14
```
#### xref at `0xabbe3e`

```text
  abbe2b:	48 85 db             	test   rbx,rbx
  abbe2e:	74 52                	je     abbe82 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e22>
  abbe30:	48 83 c3 28          	add    rbx,0x28
  abbe34:	48 8d 35 6c 87 88 ff 	lea    rsi,[rip+0xffffffffff88876c]        # 3445a7 <_ZTSSt12bad_any_cast@@Base-0x4bc21>
  abbe3b:	48 89 df             	mov    rdi,rbx
  abbe3e:	e8 0c fa fb ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  abbe43:	84 c0                	test   al,al
  abbe45:	74 3b                	je     abbe82 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e22>
  abbe47:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
  abbe4e:	00
  abbe4f:	4c 89 f6             	mov    rsi,r14
  abbe52:	e8 2e 0b 00 00       	call   abc985 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9925>
  abbe57:	48 8d 5c 24 58       	lea    rbx,[rsp+0x58]
  abbe5c:	4c 8d b4 24 a8 00 00 	lea    r14,[rsp+0xa8]
  abbe63:	00
```
#### xref at `0xac832b`

```text
  ac8318:	c6 84 04 50 04 00 00 	mov    BYTE PTR [rsp+rax*1+0x450],0x0
  ac831f:	00
  ac8320:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
  ac8327:	00
  ac8328:	4c 89 ee             	mov    rsi,r13
  ac832b:	e8 1f 35 fb ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  ac8330:	45 31 ed             	xor    r13d,r13d
  ac8333:	84 c0                	test   al,al
  ac8335:	74 23                	je     ac835a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152fa>
  ac8337:	4c 89 ff             	mov    rdi,r15
  ac833a:	e8 81 63 d2 00       	call   17ee6c0 <atoi@plt>
  ac833f:	89 c7                	mov    edi,eax
  ac8341:	e8 8a 65 d2 00       	call   17ee8d0 <dup@plt>
  ac8346:	85 c0                	test   eax,eax
  ac8348:	0f 49 e8             	cmovns ebp,eax
```
#### xref at `0xace211`

```text
  ace1fc:	4c 89 ef             	mov    rdi,r13
  ace1ff:	4c 89 e1             	mov    rcx,r12
  ace202:	e8 e9 4d b4 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
  ace207:	48 8d 35 6f 3d 98 ff 	lea    rsi,[rip+0xffffffffff983d6f]        # 451f7d <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b89>
  ace20e:	4c 89 ef             	mov    rdi,r13
  ace211:	e8 39 d6 fa ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  ace216:	89 c5                	mov    ebp,eax
  ace218:	4c 89 ef             	mov    rdi,r13
  ace21b:	e8 70 fc d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ace220:	4c 89 e7             	mov    rdi,r12
  ace223:	e8 68 fc d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ace228:	48 83 7c 24 38 00    	cmp    QWORD PTR [rsp+0x38],0x0
  ace22e:	74 45                	je     ace275 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b215>
  ace230:	6a 60                	push   0x60
  ace232:	5f                   	pop    rdi
```
#### xref at `0xaead70`

```text
  aead5b:	50                   	push   rax
  aead5c:	49 89 fe             	mov    r14,rdi
  aead5f:	48 bb 01 00 00 00 01 	movabs rbx,0x100000001
  aead66:	00 00 00
  aead69:	48 8d 35 73 58 85 ff 	lea    rsi,[rip+0xffffffffff855873]        # 3405e3 <_ZTSSt12bad_any_cast@@Base-0x4fbe5>
  aead70:	e8 da 0a f9 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  aead75:	84 c0                	test   al,al
  aead77:	75 1a                	jne    aead93 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x37d33>
  aead79:	48 8d 35 cc 0b 8a ff 	lea    rsi,[rip+0xffffffffff8a0bcc]        # 38b94c <_ZTSSt12bad_any_cast@@Base-0x487c>
  aead80:	4c 89 f7             	mov    rdi,r14
  aead83:	e8 c7 0a f9 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  aead88:	48 ff c3             	inc    rbx
  aead8b:	31 c9                	xor    ecx,ecx
  aead8d:	84 c0                	test   al,al
  aead8f:	48 0f 44 d9          	cmove  rbx,rcx
```
#### xref at `0xaead83`

```text
  aead70:	e8 da 0a f9 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  aead75:	84 c0                	test   al,al
  aead77:	75 1a                	jne    aead93 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x37d33>
  aead79:	48 8d 35 cc 0b 8a ff 	lea    rsi,[rip+0xffffffffff8a0bcc]        # 38b94c <_ZTSSt12bad_any_cast@@Base-0x487c>
  aead80:	4c 89 f7             	mov    rdi,r14
  aead83:	e8 c7 0a f9 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  aead88:	48 ff c3             	inc    rbx
  aead8b:	31 c9                	xor    ecx,ecx
  aead8d:	84 c0                	test   al,al
  aead8f:	48 0f 44 d9          	cmove  rbx,rcx
  aead93:	48 89 d8             	mov    rax,rbx
  aead96:	48 83 c4 08          	add    rsp,0x8
  aead9a:	5b                   	pop    rbx
  aead9b:	41 5e                	pop    r14
  aead9d:	c3                   	ret
```
#### xref at `0xaf205d`

```text
  af2047:	31 d2                	xor    edx,edx
  af2049:	48 89 c1             	mov    rcx,rax
  af204c:	e8 d3 b5 fc ff       	call   abd624 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5c4>
  af2051:	48 8d 35 58 c5 84 ff 	lea    rsi,[rip+0xffffffffff84c558]        # 33e5b0 <_ZTSSt12bad_any_cast@@Base-0x51c18>
  af2058:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  af205d:	e8 ed 97 f8 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  af2062:	84 c0                	test   al,al
  af2064:	74 26                	je     af208c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f02c>
  af2066:	48 8d 35 4d 84 86 ff 	lea    rsi,[rip+0xffffffffff86844d]        # 35a4ba <_ZTSSt12bad_any_cast@@Base-0x35d0e>
  af206d:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  af2072:	e8 07 7a f8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  af2077:	eb 22                	jmp    af209b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f03b>
  af2079:	48 8d 35 98 fb 95 ff 	lea    rsi,[rip+0xffffffffff95fb98]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
  af2080:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  af2085:	e8 f4 79 f8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
```
#### xref at `0xaf20b1`

```text
  af2096:	e8 a5 be cf 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  af209b:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  af20a0:	e8 eb bd cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  af20a5:	48 8d 35 76 65 89 ff 	lea    rsi,[rip+0xffffffffff896576]        # 388622 <_ZTSSt12bad_any_cast@@Base-0x7ba6>
  af20ac:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  af20b1:	e8 99 97 f8 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  af20b6:	84 c0                	test   al,al
  af20b8:	75 15                	jne    af20cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f06f>
  af20ba:	48 8d 35 4c 90 85 ff 	lea    rsi,[rip+0xffffffffff85904c]        # 34b10d <_ZTSSt12bad_any_cast@@Base-0x450bb>
  af20c1:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  af20c6:	e8 84 97 f8 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  af20cb:	84 c0                	test   al,al
  af20cd:	74 17                	je     af20e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f086>
  af20cf:	80 7d 88 00          	cmp    BYTE PTR [rbp-0x78],0x0
  af20d3:	74 11                	je     af20e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f086>
```
#### xref at `0xaf20c6`

```text
  af20b1:	e8 99 97 f8 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  af20b6:	84 c0                	test   al,al
  af20b8:	75 15                	jne    af20cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f06f>
  af20ba:	48 8d 35 4c 90 85 ff 	lea    rsi,[rip+0xffffffffff85904c]        # 34b10d <_ZTSSt12bad_any_cast@@Base-0x450bb>
  af20c1:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  af20c6:	e8 84 97 f8 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  af20cb:	84 c0                	test   al,al
  af20cd:	74 17                	je     af20e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f086>
  af20cf:	80 7d 88 00          	cmp    BYTE PTR [rbp-0x78],0x0
  af20d3:	74 11                	je     af20e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f086>
  af20d5:	48 8d b5 70 ff ff ff 	lea    rsi,[rbp-0x90]
  af20dc:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  af20e1:	e8 9a bf cf 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  af20e6:	49 bd 00 40 fa c1 08 	movabs r13,0x59b08c1fa4000
  af20ed:	9b 05 00
```
#### xref at `0xafeed7`

```text
  afeebe:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  afeec3:	48 89 c6             	mov    rsi,rax
  afeec6:	e8 b3 ab f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  afeecb:	48 8d 35 f6 2e 86 ff 	lea    rsi,[rip+0xffffffffff862ef6]        # 361dc8 <_ZTSSt12bad_any_cast@@Base-0x2e400>
  afeed2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  afeed7:	e8 73 c9 f7 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  afeedc:	84 c0                	test   al,al
  afeede:	0f 84 12 01 00 00    	je     afeff6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4bf96>
  afeee4:	48 89 df             	mov    rdi,rbx
  afeee7:	e8 16 f6 ff ff       	call   afe502 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4b4a2>
  afeeec:	e9 a5 01 00 00       	jmp    aff096 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4c036>
  afeef1:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  afeef8:	00
  afeef9:	89 47 d0             	mov    DWORD PTR [rdi-0x30],eax
  afeefc:	48 8d 05 65 15 dd 00 	lea    rax,[rip+0xdd1565]        # 18d0468 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x17878>
```
#### xref at `0xaff002`

```text
  afefe9:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
  afeff0:	00
  afeff1:	e9 58 01 00 00       	jmp    aff14e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4c0ee>
  afeff6:	48 8d 35 bc db 87 ff 	lea    rsi,[rip+0xffffffffff87dbbc]        # 37cbb9 <_ZTSSt12bad_any_cast@@Base-0x1360f>
  afeffd:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  aff002:	e8 48 c8 f7 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  aff007:	84 c0                	test   al,al
  aff009:	75 19                	jne    aff024 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4bfc4>
  aff00b:	48 8d 35 a1 f5 83 ff 	lea    rsi,[rip+0xffffffffff83f5a1]        # 33e5b3 <_ZTSSt12bad_any_cast@@Base-0x51c15>
  aff012:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  aff017:	e8 33 c8 f7 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  aff01c:	84 c0                	test   al,al
  aff01e:	0f 84 81 00 00 00    	je     aff0a5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4c045>
  aff024:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  aff02b:	00
```
... truncated 925 more xrefs ...

## Preliminary interpretation checklist

- `10ac37a` calls `vtable+0x28` on the object loaded from `[rsp+0x40]`. The stack-slot table above should show where `[rsp+0x40]` was last written.
- `10ac386` calls `vtable+0x28` on `r15`. The backward slice should show whether `r15` still names the installed `allocated_0x28` or a later object/temporary.
- If `0x184d898+0x28` has a relocation target, that is the concrete method target for the installed `0x28` object. If not, treat `0x184d898` as an AP/literal requiring constructor/xref-based resolution.
- The next step after this report is to follow the return values placed into `r14` and `r15` after the two `+0x28` calls, and check whether either is assigned into `child+0x18` or into the `state+0x40` readiness path.
