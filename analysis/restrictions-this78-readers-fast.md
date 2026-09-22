# Restrictions this+0x78 readers fast trace

Fast replacement for the broad reader/xref workflow. Focuses only on concrete constructor-tail events and next-target helper windows.

## Constructor tail interesting events

| addr | instruction |
|---:|---|
| `0x10ac120` | `10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac12c` | `10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac149` | `10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac159` | `10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>` |
| `0x10ac166` | `10ac166:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12` |
| `0x10ac171` | `10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ac17c` | `10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ac187` | `10ac187:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ac194` | `10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>` |
| `0x10ac19c` | `10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ac1a9` | `10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac1b4` | `10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac1ba` | `10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac1c6` | `10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac1cb` | `10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl` |
| `0x10ac1cf` | `10ac1cf:	40 88 68 38          	mov    BYTE PTR [rax+0x38],bpl` |
| `0x10ac1d3` | `10ac1d3:	40 88 68 40          	mov    BYTE PTR [rax+0x40],bpl` |
| `0x10ac1da` | `10ac1da:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax` |
| `0x10ac216` | `10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac230` | `10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac23f` | `10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac249` | `10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac255` | `10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac26a` | `10ac26a:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0` |
| `0x10ac27e` | `10ac27e:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0` |
| `0x10ac289` | `10ac289:	48 89 88 90 00 00 00 	mov    QWORD PTR [rax+0x90],rcx` |
| `0x10ac297` | `10ac297:	48 89 88 98 00 00 00 	mov    QWORD PTR [rax+0x98],rcx` |
| `0x10ac29e` | `10ac29e:	48 89 90 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],rdx` |
| `0x10ac2b6` | `10ac2b6:	48 89 88 c0 00 00 00 	mov    QWORD PTR [rax+0xc0],rcx` |
| `0x10ac2c4` | `10ac2c4:	48 89 88 c8 00 00 00 	mov    QWORD PTR [rax+0xc8],rcx` |
| `0x10ac2cb` | `10ac2cb:	48 89 90 e0 00 00 00 	mov    QWORD PTR [rax+0xe0],rdx` |
| `0x10ac2ee` | `10ac2ee:	4c 89 a8 30 01 00 00 	mov    QWORD PTR [rax+0x130],r13` |
| `0x10ac2fd` | `10ac2fd:	48 89 88 38 01 00 00 	mov    QWORD PTR [rax+0x138],rcx` |
| `0x10ac304` | `10ac304:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0x10ac309` | `10ac309:	40 88 a8 40 01 00 00 	mov    BYTE PTR [rax+0x140],bpl` |
| `0x10ac339` | `10ac339:	e8 8a b1 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac358` | `10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac36d` | `10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac37a` | `10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac386` | `10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac391` | `10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac3a0` | `10ac3a0:	48 89 01             	mov    QWORD PTR [rcx],rax` |

## Focused callsite / helper windows

### `0x10ac12c` — operator new(0x28) for installed object

```text
 10ac0ea:	4c 89 f2             	mov    rdx,r14
 10ac0ed:	6a 64                	push   0x64
 10ac0ef:	41 54                	push   r12
 10ac0f1:	e8 fc b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac0f6:	48 83 c4 10          	add    rsp,0x10
 10ac0fa:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10ac0fe:	48 8d 35 eb b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5eb]        # 3d76f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d5>
 10ac105:	48 8d 0d 04 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b604]        # 3d7710 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22f5>
 10ac10c:	6a 1f                	push   0x1f
 10ac10e:	41 58                	pop    r8
 10ac110:	4c 89 f2             	mov    rdx,r14
 10ac113:	41 b9 10 0e 00 00    	mov    r9d,0xe10
 10ac119:	68 80 51 01 00       	push   0x15180
 10ac11e:	41 54                	push   r12
 10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac125:	48 83 c4 10          	add    rsp,0x10
 10ac129:	6a 28                	push   0x28
 10ac12b:	5f                   	pop    rdi
 10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac131:	49 89 c6             	mov    r14,rax
 10ac134:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
 10ac13b:	00 00
 10ac13d:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 10ac144:	00 00
 10ac146:	6a 30                	push   0x30
 10ac148:	5f                   	pop    rdi
 10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac14e:	49 89 c4             	mov    r12,rax
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
```
### `0x10ac149` — operator new(0x30) copied into stack wrapper

```text
 10ac10c:	6a 1f                	push   0x1f
 10ac10e:	41 58                	pop    r8
 10ac110:	4c 89 f2             	mov    rdx,r14
 10ac113:	41 b9 10 0e 00 00    	mov    r9d,0xe10
 10ac119:	68 80 51 01 00       	push   0x15180
 10ac11e:	41 54                	push   r12
 10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac125:	48 83 c4 10          	add    rsp,0x10
 10ac129:	6a 28                	push   0x28
 10ac12b:	5f                   	pop    rdi
 10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac131:	49 89 c6             	mov    r14,rax
 10ac134:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
 10ac13b:	00 00
 10ac13d:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 10ac144:	00 00
 10ac146:	6a 30                	push   0x30
 10ac148:	5f                   	pop    rdi
 10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac14e:	49 89 c4             	mov    r12,rax
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
```
### `0x10ac159` — a7a290 copy/helper for allocated_0x30

```text
 10ac119:	68 80 51 01 00       	push   0x15180
 10ac11e:	41 54                	push   r12
 10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac125:	48 83 c4 10          	add    rsp,0x10
 10ac129:	6a 28                	push   0x28
 10ac12b:	5f                   	pop    rdi
 10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac131:	49 89 c6             	mov    r14,rax
 10ac134:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
 10ac13b:	00 00
 10ac13d:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 10ac144:	00 00
 10ac146:	6a 30                	push   0x30
 10ac148:	5f                   	pop    rdi
 10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac14e:	49 89 c4             	mov    r12,rax
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
```
### `0x10ac194` — 107162a(allocated_0x28+0x08, stack_wrapper)

```text
 10ac148:	5f                   	pop    rdi
 10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>
 10ac14e:	49 89 c4             	mov    r12,rax
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
```
### `0x10ac19c` — de1c52(stack_wrapper)

```text
 10ac14e:	49 89 c4             	mov    r12,rax
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
```
### `0x10ac1a9` — [this+0x78_target] = allocated_0x28

```text
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
```
### `0x10ac216` — 15e74c8 with stack wrapper / installed object state

```text
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
```
### `0x10ac339` — second 15e74c8 with allocated_0x30 data

```text
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
```
### `0x10ac37a` — indirect call [allocated_0x28.vtable+0x28] #1

```text
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
```
### `0x10ac386` — indirect call [allocated_0x28.vtable+0x28] #2

```text
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
```
### `0x107162a` — method/helper called at install time

```text
 10715f8:	48 89 df             	mov    rdi,rbx
 10715fb:	5b                   	pop    rbx
 10715fc:	e9 25 d3 a3 ff       	jmp    aae926 <JNI_OnUnload@@Base+0x361f3>
 1071601:	cc                   	int3
 1071602:	48 8b bf a0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xa0]
 1071609:	e9 5a 85 76 00       	jmp    17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
 107160e:	80 7f 10 00          	cmp    BYTE PTR [rdi+0x10],0x0
 1071612:	74 06                	je     107161a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a30>
 1071614:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1071617:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
 107161a:	c3                   	ret
 107161b:	cc                   	int3
 107161c:	80 7f 11 00          	cmp    BYTE PTR [rdi+0x11],0x0
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
 1071646:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 107164a:	6a 01                	push   0x1
 107164c:	5f                   	pop    rdi
 107164d:	48 89 de             	mov    rsi,rbx
 1071650:	4c 89 f2             	mov    rdx,r14
 1071653:	ff d0                	call   rax
 1071655:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 1071659:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 107165d:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 1071662:	48 83 c4 08          	add    rsp,0x8
 1071666:	5b                   	pop    rbx
 1071667:	41 5e                	pop    r14
 1071669:	c3                   	ret
 107166a:	48 89 c7             	mov    rdi,rax
 107166d:	e8 33 84 a0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1071672:	53                   	push   rbx
 1071673:	48 89 fb             	mov    rbx,rdi
 1071676:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 107167a:	e8 c3 fa ff ff       	call   1071142 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238558>
 107167f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1071682:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 1071686:	48 85 ff             	test   rdi,rdi
 1071689:	74 06                	je     1071691 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238aa7>
 107168b:	5b                   	pop    rbx
 107168c:	e9 8f c8 77 00       	jmp    17edf20 <_ZdlPv@plt>
 1071691:	5b                   	pop    rbx
 1071692:	c3                   	ret
 1071693:	cc                   	int3
 1071694:	41 56                	push   r14
 1071696:	53                   	push   rbx
 1071697:	50                   	push   rax
 1071698:	48 89 fb             	mov    rbx,rdi
 107169b:	48 8d 05 ce 77 7d 00 	lea    rax,[rip+0x7d77ce]        # 1848e70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5558>
 10716a2:	48 89 07             	mov    QWORD PTR [rdi],rax
 10716a5:	48 8d 05 54 78 7d 00 	lea    rax,[rip+0x7d7854]        # 1848f00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x55e8>
 10716ac:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 10716b0:	4c 8d b7 d8 00 00 00 	lea    r14,[rdi+0xd8]
 10716b7:	4c 89 f7             	mov    rdi,r14
 10716ba:	e8 23 da af ff       	call   b6f0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc082>
 10716bf:	4c 89 f7             	mov    rdi,r14
 10716c2:	e8 b5 da af ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 10716c7:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
 10716ce:	e8 9f ff ff ff       	call   1071672 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a88>
 10716d3:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10716da:	e8 f5 84 76 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10716df:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
 10716e6:	e8 19 08 c4 ff       	call   cb1f04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feea4>
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
 1071723:	48 89 fb             	mov    rbx,rdi
 1071726:	e8 69 ff ff ff       	call   1071694 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238aaa>
 107172b:	48 89 df             	mov    rdi,rbx
 107172e:	5b                   	pop    rbx
 107172f:	e9 ec c7 77 00       	jmp    17edf20 <_ZdlPv@plt>
 1071734:	e9 f9 e3 ff ff       	jmp    106fb32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236f48>
 1071739:	cc                   	int3
 107173a:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
 107173e:	e9 51 ff ff ff       	jmp    1071694 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238aaa>
 1071743:	cc                   	int3
 1071744:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
 1071748:	e9 d5 ff ff ff       	jmp    1071722 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238b38>
 107174d:	cc                   	int3
```
### `0xde1c52` — stack wrapper finalizer

```text
  de1c1a:	48 89 df             	mov    rdi,rbx
  de1c1d:	e8 fe c2 a0 00       	call   17edf20 <_ZdlPv@plt>
  de1c22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  de1c29:	00 00
  de1c2b:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
  de1c30:	75 08                	jne    de1c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecc0>
  de1c32:	4c 89 f7             	mov    rdi,r14
  de1c35:	e8 96 e0 c8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  de1c3a:	e8 71 de a0 00       	call   17efab0 <__stack_chk_fail@plt>
  de1c3f:	cc                   	int3
  de1c40:	53                   	push   rbx
  de1c41:	48 89 fb             	mov    rbx,rdi
  de1c44:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
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
  de1c6d:	5b                   	pop    rbx
  de1c6e:	c3                   	ret
  de1c6f:	48 89 c7             	mov    rdi,rax
  de1c72:	e8 2e 7e c9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  de1c77:	cc                   	int3
  de1c78:	53                   	push   rbx
  de1c79:	48 89 fb             	mov    rbx,rdi
  de1c7c:	48 8d 05 25 95 a4 00 	lea    rax,[rip+0xa49525]        # 182b1a8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x77d8>
  de1c83:	48 89 07             	mov    QWORD PTR [rdi],rax
  de1c86:	48 83 c7 30          	add    rdi,0x30
  de1c8a:	e8 db 82 c9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  de1c8f:	48 89 df             	mov    rdi,rbx
  de1c92:	5b                   	pop    rbx
  de1c93:	e9 4c 1f 80 00       	jmp    15e3be4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429168>
  de1c98:	53                   	push   rbx
  de1c99:	48 89 fb             	mov    rbx,rdi
  de1c9c:	e8 d7 ff ff ff       	call   de1c78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecfe>
  de1ca1:	48 89 df             	mov    rdi,rbx
  de1ca4:	5b                   	pop    rbx
  de1ca5:	e9 76 c2 a0 00       	jmp    17edf20 <_ZdlPv@plt>
  de1caa:	55                   	push   rbp
  de1cab:	41 57                	push   r15
  de1cad:	41 56                	push   r14
  de1caf:	41 55                	push   r13
  de1cb1:	41 54                	push   r12
  de1cb3:	53                   	push   rbx
  de1cb4:	48 81 ec 98 00 00 00 	sub    rsp,0x98
  de1cbb:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
  de1cbf:	49 89 d4             	mov    r12,rdx
  de1cc2:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
  de1cc7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  de1cce:	00 00
  de1cd0:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  de1cd7:	00
  de1cd8:	4c 8b 7e 20          	mov    r15,QWORD PTR [rsi+0x20]
  de1cdc:	0f 57 c0             	xorps  xmm0,xmm0
  de1cdf:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  de1ce4:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
  de1ce8:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  de1ceb:	c7 47 20 00 00 80 3f 	mov    DWORD PTR [rdi+0x20],0x3f800000
  de1cf2:	48 63 72 18          	movsxd rsi,DWORD PTR [rdx+0x18]
  de1cf6:	e8 f7 de e6 ff       	call   c4fbf2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb92>
  de1cfb:	49 8d 44 24 10       	lea    rax,[r12+0x10]
  de1d00:	49 8b 4c 24 10       	mov    rcx,QWORD PTR [r12+0x10]
  de1d05:	48 89 cd             	mov    rbp,rcx
  de1d08:	48 83 c5 07          	add    rbp,0x7
  de1d0c:	f6 c1 01             	test   cl,0x1
  de1d0f:	48 0f 44 e8          	cmove  rbp,rax
  de1d13:	4d 63 74 24 18       	movsxd r14,DWORD PTR [r12+0x18]
  de1d18:	4d 85 f6             	test   r14,r14
  de1d1b:	74 48                	je     de1d65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaedeb>
  de1d1d:	49 c1 e6 03          	shl    r14,0x3
  de1d21:	31 db                	xor    ebx,ebx
  de1d23:	4c 8d 64 24 38       	lea    r12,[rsp+0x38]
  de1d28:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
  de1d2d:	48 8b 7c 1d 00       	mov    rdi,QWORD PTR [rbp+rbx*1+0x0]
  de1d32:	e8 ff 9a c9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  de1d37:	4c 89 e7             	mov    rdi,r12
  de1d3a:	48 89 c6             	mov    rsi,rax
  de1d3d:	e8 e6 36 8e 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
  de1d42:	83 7c 24 70 00       	cmp    DWORD PTR [rsp+0x70],0x0
  de1d47:	74 0b                	je     de1d54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaedda>
  de1d49:	4c 89 ef             	mov    rdi,r13
  de1d4c:	4c 89 e6             	mov    rsi,r12
  de1d4f:	e8 ee de e6 ff       	call   c4fc42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cbe2>
  de1d54:	4c 89 e7             	mov    rdi,r12
  de1d57:	e8 d2 35 8e 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  de1d5c:	48 83 c3 08          	add    rbx,0x8
  de1d60:	49 39 de             	cmp    r14,rbx
  de1d63:	75 c8                	jne    de1d2d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaedb3>
  de1d65:	49 8b 07             	mov    rax,QWORD PTR [r15]
  de1d68:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
  de1d6d:	4c 89 ff             	mov    rdi,r15
  de1d70:	ff 50 10             	call   QWORD PTR [rax+0x10]
  de1d73:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
```
### `0x10bff2c` — alternate 0x184d898 object constructor

```text
 10bfef3:	5d                   	pop    rbp
 10bfef4:	c3                   	ret
 10bfef5:	e8 c6 46 94 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
 10bfefa:	e8 e0 b7 9b ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
 10bfeff:	cc                   	int3
 10bff00:	48 8d 05 59 d9 78 00 	lea    rax,[rip+0x78d959]        # 184d860 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f48>
 10bff07:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff0a:	e9 01 e1 72 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 10bff0f:	cc                   	int3
 10bff10:	53                   	push   rbx
 10bff11:	48 89 fb             	mov    rbx,rdi
 10bff14:	e8 e7 ff ff ff       	call   10bff00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287316>
 10bff19:	48 89 df             	mov    rdi,rbx
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
 10bff4d:	e9 ce df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff52:	41 56                	push   r14
 10bff54:	53                   	push   rbx
 10bff55:	48 83 ec 28          	sub    rsp,0x28
 10bff59:	48 89 d3             	mov    rbx,rdx
 10bff5c:	48 89 f2             	mov    rdx,rsi
 10bff5f:	48 89 f8             	mov    rax,rdi
 10bff62:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bff69:	00 00
 10bff6b:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 10bff70:	48 8d 77 08          	lea    rsi,[rdi+0x8]
 10bff74:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bff79:	4c 89 f7             	mov    rdi,r14
 10bff7c:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10bff7f:	48 89 df             	mov    rdi,rbx
 10bff82:	e8 af b8 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bff87:	4c 89 f7             	mov    rdi,r14
 10bff8a:	48 89 c6             	mov    rsi,rax
 10bff8d:	e8 60 4f 70 00       	call   17c4ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17905e>
 10bff92:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bff97:	e8 f4 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bff9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffa3:	00 00
 10bffa5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffaa:	75 2d                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffac:	48 83 c4 28          	add    rsp,0x28
 10bffb0:	5b                   	pop    rbx
 10bffb1:	41 5e                	pop    r14
 10bffb3:	c3                   	ret
 10bffb4:	48 89 c3             	mov    rbx,rax
 10bffb7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bffbc:	e8 cf de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bffc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffc8:	00 00
 10bffca:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffcf:	75 08                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffd1:	48 89 df             	mov    rdi,rbx
 10bffd4:	e8 f7 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bffd9:	e8 d2 fa 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10bffde:	55                   	push   rbp
 10bffdf:	53                   	push   rbx
 10bffe0:	48 83 ec 48          	sub    rsp,0x48
 10bffe4:	48 89 f0             	mov    rax,rsi
 10bffe7:	48 89 fb             	mov    rbx,rdi
 10bffea:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bfff1:	00 00
 10bfff3:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
 10bfff8:	0f 57 c0             	xorps  xmm0,xmm0
 10bfffb:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c0000:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0006:	48 83 c6 08          	add    rsi,0x8
 10c000a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c000f:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c0012:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c0017:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10c001c:	31 d2                	xor    edx,edx
 10c001e:	e8 b9 4e 70 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
 10c0023:	89 c5                	mov    ebp,eax
 10c0025:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c002a:	e8 61 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c002f:	40 84 ed             	test   bpl,bpl
 10c0032:	74 23                	je     10c0057 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28746d>
 10c0034:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10c0039:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 10c003d:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
 10c0042:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10c0045:	0f 57 c0             	xorps  xmm0,xmm0
 10c0048:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c004d:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0053:	b0 01                	mov    al,0x1
 10c0055:	eb 05                	jmp    10c005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287472>
 10c0057:	c6 03 00             	mov    BYTE PTR [rbx],0x0
 10c005a:	31 c0                	xor    eax,eax
 10c005c:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
 10c005f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
```
### `0x10bff40` — alternate wrapper around 10bff2c

```text
 10bff00:	48 8d 05 59 d9 78 00 	lea    rax,[rip+0x78d959]        # 184d860 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f48>
 10bff07:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff0a:	e9 01 e1 72 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 10bff0f:	cc                   	int3
 10bff10:	53                   	push   rbx
 10bff11:	48 89 fb             	mov    rbx,rdi
 10bff14:	e8 e7 ff ff ff       	call   10bff00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287316>
 10bff19:	48 89 df             	mov    rdi,rbx
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
 10bff4d:	e9 ce df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff52:	41 56                	push   r14
 10bff54:	53                   	push   rbx
 10bff55:	48 83 ec 28          	sub    rsp,0x28
 10bff59:	48 89 d3             	mov    rbx,rdx
 10bff5c:	48 89 f2             	mov    rdx,rsi
 10bff5f:	48 89 f8             	mov    rax,rdi
 10bff62:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bff69:	00 00
 10bff6b:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 10bff70:	48 8d 77 08          	lea    rsi,[rdi+0x8]
 10bff74:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bff79:	4c 89 f7             	mov    rdi,r14
 10bff7c:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10bff7f:	48 89 df             	mov    rdi,rbx
 10bff82:	e8 af b8 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bff87:	4c 89 f7             	mov    rdi,r14
 10bff8a:	48 89 c6             	mov    rsi,rax
 10bff8d:	e8 60 4f 70 00       	call   17c4ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17905e>
 10bff92:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bff97:	e8 f4 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bff9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffa3:	00 00
 10bffa5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffaa:	75 2d                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffac:	48 83 c4 28          	add    rsp,0x28
 10bffb0:	5b                   	pop    rbx
 10bffb1:	41 5e                	pop    r14
 10bffb3:	c3                   	ret
 10bffb4:	48 89 c3             	mov    rbx,rax
 10bffb7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bffbc:	e8 cf de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bffc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffc8:	00 00
 10bffca:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffcf:	75 08                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffd1:	48 89 df             	mov    rdi,rbx
 10bffd4:	e8 f7 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bffd9:	e8 d2 fa 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10bffde:	55                   	push   rbp
 10bffdf:	53                   	push   rbx
 10bffe0:	48 83 ec 48          	sub    rsp,0x48
 10bffe4:	48 89 f0             	mov    rax,rsi
 10bffe7:	48 89 fb             	mov    rbx,rdi
 10bffea:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bfff1:	00 00
 10bfff3:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
 10bfff8:	0f 57 c0             	xorps  xmm0,xmm0
 10bfffb:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c0000:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0006:	48 83 c6 08          	add    rsi,0x8
 10c000a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c000f:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c0012:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c0017:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10c001c:	31 d2                	xor    edx,edx
 10c001e:	e8 b9 4e 70 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
 10c0023:	89 c5                	mov    ebp,eax
 10c0025:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c002a:	e8 61 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c002f:	40 84 ed             	test   bpl,bpl
 10c0032:	74 23                	je     10c0057 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28746d>
 10c0034:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10c0039:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 10c003d:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
 10c0042:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10c0045:	0f 57 c0             	xorps  xmm0,xmm0
 10c0048:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c004d:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0053:	b0 01                	mov    al,0x1
 10c0055:	eb 05                	jmp    10c005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287472>
 10c0057:	c6 03 00             	mov    BYTE PTR [rbx],0x0
 10c005a:	31 c0                	xor    eax,eax
 10c005c:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
 10c005f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10c0064:	e8 27 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c0069:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10c0070:	00 00
 10c0072:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10c0077:	75 3e                	jne    10c00b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874cd>
```
### `0x15e74c8` — post-install descriptor/helper call

```text
 15e748d:	4c 89 e7             	mov    rdi,r12
 15e7490:	e8 fb 69 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15e7495:	4c 89 ff             	mov    rdi,r15
 15e7498:	e8 f3 69 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15e749d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15e74a4:	00 00
 15e74a6:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 15e74ab:	75 0e                	jne    15e74bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca3f>
 15e74ad:	89 d8                	mov    eax,ebx
 15e74af:	48 83 c4 38          	add    rsp,0x38
 15e74b3:	5b                   	pop    rbx
 15e74b4:	41 5c                	pop    r12
 15e74b6:	41 5e                	pop    r14
 15e74b8:	41 5f                	pop    r15
 15e74ba:	c3                   	ret
 15e74bb:	e8 f0 85 20 00       	call   17efab0 <__stack_chk_fail@plt>
 15e74c0:	48 89 c7             	mov    rdi,rax
 15e74c3:	e8 dd 25 49 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 15e74c8:	41 57                	push   r15
 15e74ca:	41 56                	push   r14
 15e74cc:	41 54                	push   r12
 15e74ce:	53                   	push   rbx
 15e74cf:	48 83 ec 38          	sub    rsp,0x38
 15e74d3:	4d 89 cf             	mov    r15,r9
 15e74d6:	4d 89 c4             	mov    r12,r8
 15e74d9:	48 89 f3             	mov    rbx,rsi
 15e74dc:	49 89 fe             	mov    r14,rdi
 15e74df:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15e74e6:	00 00
 15e74e8:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 15e74ed:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15e74f2:	48 89 d6             	mov    rsi,rdx
 15e74f5:	48 89 ca             	mov    rdx,rcx
 15e74f8:	e8 1d 55 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 15e74fd:	48 89 e7             	mov    rdi,rsp
 15e7500:	4c 89 e6             	mov    rsi,r12
 15e7503:	4c 89 fa             	mov    rdx,r15
 15e7506:	e8 0f 55 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 15e750b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 15e750e:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
 15e7513:	49 89 e4             	mov    r12,rsp
 15e7516:	4c 89 f7             	mov    rdi,r14
 15e7519:	48 89 de             	mov    rsi,rbx
 15e751c:	4c 89 fa             	mov    rdx,r15
 15e751f:	4c 89 e1             	mov    rcx,r12
 15e7522:	ff 50 70             	call   QWORD PTR [rax+0x70]
 15e7525:	4c 89 e7             	mov    rdi,r12
 15e7528:	e8 63 69 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15e752d:	4c 89 ff             	mov    rdi,r15
 15e7530:	e8 5b 69 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15e7535:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15e753c:	00 00
 15e753e:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 15e7543:	75 0c                	jne    15e7551 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cad5>
 15e7545:	48 83 c4 38          	add    rsp,0x38
 15e7549:	5b                   	pop    rbx
 15e754a:	41 5c                	pop    r12
 15e754c:	41 5e                	pop    r14
 15e754e:	41 5f                	pop    r15
 15e7550:	c3                   	ret
 15e7551:	e8 5a 85 20 00       	call   17efab0 <__stack_chk_fail@plt>
 15e7556:	48 89 c7             	mov    rdi,rax
 15e7559:	e8 47 25 49 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 15e755e:	41 57                	push   r15
 15e7560:	41 56                	push   r14
 15e7562:	41 54                	push   r12
 15e7564:	53                   	push   rbx
 15e7565:	48 83 ec 38          	sub    rsp,0x38
 15e7569:	44 89 cb             	mov    ebx,r9d
 15e756c:	4d 89 c7             	mov    r15,r8
 15e756f:	49 89 cc             	mov    r12,rcx
 15e7572:	49 89 fe             	mov    r14,rdi
 15e7575:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15e757c:	00 00
 15e757e:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 15e7583:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15e7588:	e8 8d 54 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 15e758d:	48 89 e7             	mov    rdi,rsp
 15e7590:	4c 89 e6             	mov    rsi,r12
 15e7593:	4c 89 fa             	mov    rdx,r15
 15e7596:	e8 7f 54 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 15e759b:	49 8b 06             	mov    rax,QWORD PTR [r14]
 15e759e:	0f b6 cb             	movzx  ecx,bl
 15e75a1:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
 15e75a6:	49 89 e7             	mov    r15,rsp
 15e75a9:	4c 89 f7             	mov    rdi,r14
 15e75ac:	48 89 de             	mov    rsi,rbx
 15e75af:	4c 89 fa             	mov    rdx,r15
 15e75b2:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
 15e75b8:	4c 89 ff             	mov    rdi,r15
 15e75bb:	e8 d0 68 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15e75c0:	48 89 df             	mov    rdi,rbx
 15e75c3:	e8 c8 68 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15e75c8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15e75cf:	00 00
 15e75d1:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 15e75d6:	75 0c                	jne    15e75e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb68>
 15e75d8:	48 83 c4 38          	add    rsp,0x38
 15e75dc:	5b                   	pop    rbx
 15e75dd:	41 5c                	pop    r12
 15e75df:	41 5e                	pop    r14
 15e75e1:	41 5f                	pop    r15
 15e75e3:	c3                   	ret
```
### `0xa7b84f` — conditional string/helper after 15e74c8

```text
  a7b81e:	c3                   	ret
  a7b81f:	cc                   	int3
  a7b820:	89 f8                	mov    eax,edi
  a7b822:	d0 e8                	shr    al,1
  a7b824:	40 f6 c7 01          	test   dil,0x1
  a7b828:	0f b6 c0             	movzx  eax,al
  a7b82b:	48 0f 45 c6          	cmovne rax,rsi
  a7b82f:	48 85 c0             	test   rax,rax
  a7b832:	0f 94 c0             	sete   al
  a7b835:	c3                   	ret
  a7b836:	0f b6 0f             	movzx  ecx,BYTE PTR [rdi]
  a7b839:	48 8d 47 01          	lea    rax,[rdi+0x1]
  a7b83d:	89 ca                	mov    edx,ecx
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
  a7b86d:	4c 89 fe             	mov    rsi,r15
  a7b870:	48 89 da             	mov    rdx,rbx
  a7b873:	48 89 c1             	mov    rcx,rax
  a7b876:	5b                   	pop    rbx
  a7b877:	41 5e                	pop    r14
  a7b879:	41 5f                	pop    r15
  a7b87b:	e9 00 00 00 00       	jmp    a7b880 <JNI_OnUnload@@Base+0x314d>
  a7b880:	48 39 ce             	cmp    rsi,rcx
  a7b883:	75 13                	jne    a7b898 <JNI_OnUnload@@Base+0x3165>
  a7b885:	50                   	push   rax
  a7b886:	48 89 f1             	mov    rcx,rsi
  a7b889:	e8 0e 00 00 00       	call   a7b89c <JNI_OnUnload@@Base+0x3169>
  a7b88e:	85 c0                	test   eax,eax
  a7b890:	0f 94 c0             	sete   al
  a7b893:	48 83 c4 08          	add    rsp,0x8
  a7b897:	c3                   	ret
  a7b898:	31 c0                	xor    eax,eax
  a7b89a:	c3                   	ret
  a7b89b:	cc                   	int3
  a7b89c:	41 56                	push   r14
  a7b89e:	53                   	push   rbx
  a7b89f:	50                   	push   rax
  a7b8a0:	48 89 cb             	mov    rbx,rcx
  a7b8a3:	49 89 f6             	mov    r14,rsi
  a7b8a6:	48 39 ce             	cmp    rsi,rcx
  a7b8a9:	48 89 c8             	mov    rax,rcx
  a7b8ac:	48 0f 42 c6          	cmovb  rax,rsi
  a7b8b0:	48 89 d6             	mov    rsi,rdx
  a7b8b3:	48 89 c2             	mov    rdx,rax
  a7b8b6:	e8 b5 26 d7 00       	call   17edf70 <memcmp@plt>
  a7b8bb:	85 c0                	test   eax,eax
  a7b8bd:	75 11                	jne    a7b8d0 <JNI_OnUnload@@Base+0x319d>
  a7b8bf:	31 c0                	xor    eax,eax
  a7b8c1:	49 39 de             	cmp    r14,rbx
  a7b8c4:	74 0a                	je     a7b8d0 <JNI_OnUnload@@Base+0x319d>
  a7b8c6:	31 c0                	xor    eax,eax
  a7b8c8:	49 39 de             	cmp    r14,rbx
  a7b8cb:	19 c0                	sbb    eax,eax
  a7b8cd:	83 c8 01             	or     eax,0x1
  a7b8d0:	48 83 c4 08          	add    rsp,0x8
  a7b8d4:	5b                   	pop    rbx
  a7b8d5:	41 5e                	pop    r14
  a7b8d7:	c3                   	ret
  a7b8d8:	41 57                	push   r15
  a7b8da:	41 56                	push   r14
  a7b8dc:	41 54                	push   r12
  a7b8de:	53                   	push   rbx
  a7b8df:	50                   	push   rax
  a7b8e0:	4c 89 cb             	mov    rbx,r9
  a7b8e3:	49 89 ce             	mov    r14,rcx
  a7b8e6:	49 89 ff             	mov    r15,rdi
  a7b8e9:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
  a7b8ee:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
  a7b8f2:	e8 a9 26 d7 00       	call   17edfa0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9__grow_byEmmmmmm@plt>
  a7b8f7:	49 29 de             	sub    r14,rbx
  a7b8fa:	4d 01 e6             	add    r14,r12
  a7b8fd:	4d 89 77 08          	mov    QWORD PTR [r15+0x8],r14
  a7b901:	48 83 c4 08          	add    rsp,0x8
  a7b905:	5b                   	pop    rbx
  a7b906:	41 5c                	pop    r12
  a7b908:	41 5e                	pop    r14
  a7b90a:	41 5f                	pop    r15
  a7b90c:	c3                   	ret
  a7b90d:	cc                   	int3
  a7b90e:	f6 02 01             	test   BYTE PTR [rdx],0x1
  a7b911:	74 09                	je     a7b91c <JNI_OnUnload@@Base+0x31e9>
  a7b913:	48 8b 52 10          	mov    rdx,QWORD PTR [rdx+0x10]
  a7b917:	e9 3a 91 d4 00       	jmp    17c4a56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178bc2>
  a7b91c:	48 ff c2             	inc    rdx
  a7b91f:	e9 32 91 d4 00       	jmp    17c4a56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178bc2>
  a7b924:	0f b6 0f             	movzx  ecx,BYTE PTR [rdi]
  a7b927:	48 8d 57 01          	lea    rdx,[rdi+0x1]
  a7b92b:	89 c8                	mov    eax,ecx
  a7b92d:	d1 e8                	shr    eax,1
  a7b92f:	f6 c1 01             	test   cl,0x1
```
### `0xaa6d30` — cleanup/finalizer after 15e74c8

```text
  aa6cd1:	e8 66 00 00 00       	call   aa6d3c <JNI_OnUnload@@Base+0x2e609>
  aa6cd6:	48 8d bb a8 03 00 00 	lea    rdi,[rbx+0x3a8]
  aa6cdd:	e8 7a 00 00 00       	call   aa6d5c <JNI_OnUnload@@Base+0x2e629>
  aa6ce2:	48 8d bb 30 03 00 00 	lea    rdi,[rbx+0x330]
  aa6ce9:	e8 7a 00 00 00       	call   aa6d68 <JNI_OnUnload@@Base+0x2e635>
  aa6cee:	48 8d bb a0 02 00 00 	lea    rdi,[rbx+0x2a0]
  aa6cf5:	e8 88 00 00 00       	call   aa6d82 <JNI_OnUnload@@Base+0x2e64f>
  aa6cfa:	48 8d bb 90 01 00 00 	lea    rdi,[rbx+0x190]
  aa6d01:	e8 a8 00 00 00       	call   aa6dae <JNI_OnUnload@@Base+0x2e67b>
  aa6d06:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
  aa6d0d:	e8 bc 00 00 00       	call   aa6dce <JNI_OnUnload@@Base+0x2e69b>
  aa6d12:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
  aa6d19:	e8 d0 00 00 00       	call   aa6dee <JNI_OnUnload@@Base+0x2e6bb>
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
  aa6d52:	48 89 df             	mov    rdi,rbx
  aa6d55:	5b                   	pop    rbx
  aa6d56:	e9 33 01 00 00       	jmp    aa6e8e <JNI_OnUnload@@Base+0x2e75b>
  aa6d5b:	cc                   	int3
  aa6d5c:	80 7f 30 00          	cmp    BYTE PTR [rdi+0x30],0x0
  aa6d60:	0f 85 50 03 b4 00    	jne    15e70b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c63a>
  aa6d66:	c3                   	ret
  aa6d67:	cc                   	int3
  aa6d68:	53                   	push   rbx
  aa6d69:	48 89 fb             	mov    rbx,rdi
  aa6d6c:	48 83 c7 40          	add    rdi,0x40
  aa6d70:	e8 f5 31 fd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  aa6d75:	48 83 c3 10          	add    rbx,0x10
  aa6d79:	48 89 df             	mov    rdi,rbx
  aa6d7c:	5b                   	pop    rbx
  aa6d7d:	e9 e8 31 fd ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  aa6d82:	53                   	push   rbx
  aa6d83:	48 89 fb             	mov    rbx,rdi
  aa6d86:	48 83 c7 58          	add    rdi,0x58
  aa6d8a:	e8 01 71 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6d8f:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
  aa6d93:	e8 f8 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6d98:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  aa6d9c:	e8 ef 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6da1:	48 83 c3 08          	add    rbx,0x8
  aa6da5:	48 89 df             	mov    rdi,rbx
  aa6da8:	5b                   	pop    rbx
  aa6da9:	e9 e2 70 d4 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6dae:	53                   	push   rbx
  aa6daf:	48 89 fb             	mov    rbx,rdi
  aa6db2:	48 83 c7 48          	add    rdi,0x48
  aa6db6:	e8 b9 00 00 00       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
  aa6dbb:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  aa6dbf:	e8 cc 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6dc4:	48 89 df             	mov    rdi,rbx
  aa6dc7:	5b                   	pop    rbx
  aa6dc8:	e9 9d 31 fd ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  aa6dcd:	cc                   	int3
  aa6dce:	53                   	push   rbx
  aa6dcf:	48 89 fb             	mov    rbx,rdi
  aa6dd2:	48 83 c7 30          	add    rdi,0x30
  aa6dd6:	e8 b5 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6ddb:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
  aa6ddf:	e8 ac 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6de4:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  aa6de8:	5b                   	pop    rbx
  aa6de9:	e9 88 79 ff ff       	jmp    a9e776 <JNI_OnUnload@@Base+0x26043>
  aa6dee:	53                   	push   rbx
  aa6def:	48 89 fb             	mov    rbx,rdi
  aa6df2:	48 83 c7 78          	add    rdi,0x78
  aa6df6:	e8 ed 47 fd ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  aa6dfb:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
  aa6dff:	e8 8c 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e04:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
  aa6e08:	e8 83 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e0d:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  aa6e11:	e8 7a 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e16:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
  aa6e1a:	e8 71 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e1f:	48 89 df             	mov    rdi,rbx
  aa6e22:	5b                   	pop    rbx
  aa6e23:	e9 68 70 d4 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e28:	53                   	push   rbx
  aa6e29:	48 89 fb             	mov    rbx,rdi
  aa6e2c:	48 83 c7 50          	add    rdi,0x50
  aa6e30:	e8 5b 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e35:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
  aa6e39:	e8 52 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e3e:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  aa6e42:	e8 49 70 d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e47:	48 83 c3 08          	add    rbx,0x8
  aa6e4b:	48 89 df             	mov    rdi,rbx
  aa6e4e:	5b                   	pop    rbx
  aa6e4f:	e9 3c 70 d4 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  aa6e54:	53                   	push   rbx
```
## Targeted xrefs

### `184d898` xrefs (2)

#### xref at `0x10ac180`

```text
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
```
#### xref at `0x10bff2c`

```text
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
```
### `184d808` xrefs (1)

#### xref at `0x10ac24e`

```text
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
```
### `187e260` xrefs (2)

#### xref at `0x10ac1bf`

```text
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
```
#### xref at `0x153c9f0`

```text
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
```
### `107162a` xrefs (5)

#### xref at `0x106e01a`

```text
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
```
#### xref at `0x107162a`

```text
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
```
#### xref at `0x10ac194`

```text
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
```
#### xref at `0x11ef75c`

```text
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
```
#### xref at `0x11ef810`

```text
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
```
### `de1c52` xrefs (15)

#### xref at `0xde1bb4`

```text
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
```
#### xref at `0xde1c15`

```text
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
```
#### xref at `0xde1c52`

```text
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
```
#### xref at `0x106e096`

```text
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
```
#### xref at `0x106e19b`

```text
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
```
#### xref at `0x106e1af`

```text
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
```
#### xref at `0x1071704`

```text
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
```
#### xref at `0x10ac19c`

```text
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
#### xref at `0x10ad964`

```text
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
```
#### xref at `0x10bff3a`

```text
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
```
#### xref at `0x11ef911`

```text
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
```
#### xref at `0x11ef945`

```text
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
```
#### xref at `0x11f5935`

```text
 11f5921:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 11f5926:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 11f592b:	e8 16 be 5c 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
 11f5930:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 11f5935:	e8 18 c3 be ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 11f593a:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
 11f593f:	e8 70 e0 8c ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
 11f5944:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
 11f5948:	e8 39 8b 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f594d:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
 11f5954:	00
 11f5955:	e8 f8 c2 be ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
```
#### xref at `0x11f5955`

```text
 11f5944:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
 11f5948:	e8 39 8b 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f594d:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
 11f5954:	00
 11f5955:	e8 f8 c2 be ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 11f595a:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f5961:	00
 11f5962:	e8 e9 37 00 00       	call   11f9150 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6d4>
 11f5967:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f596e:	00
 11f596f:	e8 02 38 00 00       	call   11f9176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6fa>
 11f5974:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
```
#### xref at `0x11fa142`

```text
 11fa12d:	e8 5e 3d 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11fa132:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
 11fa139:	e8 08 76 5c 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
 11fa13e:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 11fa142:	e8 0b 7b be ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 11fa147:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
 11fa14b:	e8 64 98 8c ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
 11fa150:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 11fa154:	5b                   	pop    rbx
 11fa155:	e9 2c 43 8a ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 11fa15a:	53                   	push   rbx
 11fa15b:	48 89 fb             	mov    rbx,rdi
```
### `10bff2c` xrefs (2)

#### xref at `0x10bff2c`

```text
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
```
#### xref at `0x10bff44`

```text
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
### `15e74c8` xrefs (77)

#### xref at `0xb62aa8`

```text
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
```
#### xref at `0xbd72a4`

```text
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
```
#### xref at `0xbd73d3`

```text
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
```
#### xref at `0xbd8e60`

```text
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
```
#### xref at `0xbd8f74`

```text
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
```
#### xref at `0xc0697c`

```text
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
```
#### xref at `0xc54fe1`

```text
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
```
#### xref at `0xc5524a`

```text
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
```
#### xref at `0xc552f4`

```text
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
```
#### xref at `0xc553fd`

```text
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
```
#### xref at `0xc55494`

```text
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
```
#### xref at `0xc5552a`

```text
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
```
#### xref at `0xc555ca`

```text
  c555c2:	59                   	pop    rcx
  c555c3:	6a 38                	push   0x38
  c555c5:	41 59                	pop    r9
  c555c7:	4c 89 f7             	mov    rdi,r14
  c555ca:	e8 f9 1e 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c555cf:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  c555d4:	74 4a                	je     c55620 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a25c0>
  c555d6:	48 8d 35 40 3f 6f ff 	lea    rsi,[rip+0xffffffffff6f3f40]        # 34951d <_ZTSSt12bad_any_cast@@Base-0x46cab>
  c555dd:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c555e4:	00
  c555e5:	e8 65 62 e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c555ea:	84 c0                	test   al,al
```
#### xref at `0xc556f6`

```text
  c556ec:	6a 3d                	push   0x3d
  c556ee:	41 59                	pop    r9
  c556f0:	4c 89 e7             	mov    rdi,r12
  c556f3:	4c 89 f1             	mov    rcx,r14
  c556f6:	e8 cd 1d 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c556fb:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
  c55701:	74 49                	je     c5574c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a26ec>
  c55703:	48 8d 35 98 31 78 ff 	lea    rsi,[rip+0xffffffffff783198]        # 3d88a2 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3487>
  c5570a:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c55711:	00
  c55712:	e8 38 61 e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c55717:	84 c0                	test   al,al
```
#### xref at `0xc5578d`

```text
  c55785:	59                   	pop    rcx
  c55786:	6a 3b                	push   0x3b
  c55788:	41 59                	pop    r9
  c5578a:	4c 89 f7             	mov    rdi,r14
  c5578d:	e8 36 1d 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c55792:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  c55797:	74 49                	je     c557e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a2782>
  c55799:	48 8d 35 02 31 78 ff 	lea    rsi,[rip+0xffffffffff783102]        # 3d88a2 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3487>
  c557a0:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c557a7:	00
  c557a8:	e8 a2 60 e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c557ad:	84 c0                	test   al,al
```
#### xref at `0xc55823`

```text
  c5581b:	59                   	pop    rcx
  c5581c:	6a 3e                	push   0x3e
  c5581e:	41 59                	pop    r9
  c55820:	4c 89 f7             	mov    rdi,r14
  c55823:	e8 a0 1c 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c55828:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  c5582d:	74 49                	je     c55878 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a2818>
  c5582f:	48 8d 35 6c 30 78 ff 	lea    rsi,[rip+0xffffffffff78306c]        # 3d88a2 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3487>
  c55836:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c5583d:	00
  c5583e:	e8 0c 60 e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c55843:	84 c0                	test   al,al
```
#### xref at `0xc55944`

```text
  c5593a:	6a 41                	push   0x41
  c5593c:	41 59                	pop    r9
  c5593e:	4c 89 e7             	mov    rdi,r12
  c55941:	4c 89 f1             	mov    rcx,r14
  c55944:	e8 7f 1b 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c55949:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
  c5594f:	74 49                	je     c5599a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a293a>
  c55951:	48 8d 35 4a 2f 78 ff 	lea    rsi,[rip+0xffffffffff782f4a]        # 3d88a2 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3487>
  c55958:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c5595f:	00
  c55960:	e8 ea 5e e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c55965:	84 c0                	test   al,al
```
#### xref at `0xc55a48`

```text
  c55a3e:	6a 39                	push   0x39
  c55a40:	41 59                	pop    r9
  c55a42:	4c 89 e7             	mov    rdi,r12
  c55a45:	4c 89 f1             	mov    rcx,r14
  c55a48:	e8 7b 1a 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c55a4d:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
  c55a53:	74 49                	je     c55a9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a2a3e>
  c55a55:	48 8d 35 c1 3a 6f ff 	lea    rsi,[rip+0xffffffffff6f3ac1]        # 34951d <_ZTSSt12bad_any_cast@@Base-0x46cab>
  c55a5c:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c55a63:	00
  c55a64:	e8 e6 5d e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c55a69:	84 c0                	test   al,al
```
#### xref at `0xc55b6c`

```text
  c55b62:	6a 44                	push   0x44
  c55b64:	41 59                	pop    r9
  c55b66:	4c 89 e7             	mov    rdi,r12
  c55b69:	4c 89 f1             	mov    rcx,r14
  c55b6c:	e8 57 19 99 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c55b71:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
  c55b77:	74 46                	je     c55bbf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a2b5f>
  c55b79:	48 8d 35 9d 39 6f ff 	lea    rsi,[rip+0xffffffffff6f399d]        # 34951d <_ZTSSt12bad_any_cast@@Base-0x46cab>
  c55b80:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  c55b87:	00
  c55b88:	e8 c2 5c e2 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c55b8d:	84 c0                	test   al,al
```
#### xref at `0xc81df2`

```text
  c81dea:	59                   	pop    rcx
  c81deb:	6a 1a                	push   0x1a
  c81ded:	41 59                	pop    r9
  c81def:	4c 89 f7             	mov    rdi,r14
  c81df2:	e8 d1 56 96 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  c81df7:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
  c81dfc:	74 5a                	je     c81e58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cedf8>
  c81dfe:	48 8d 35 ef 41 6c ff 	lea    rsi,[rip+0xffffffffff6c41ef]        # 345ff4 <_ZTSSt12bad_any_cast@@Base-0x4a1d4>
  c81e05:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  c81e0a:	e8 40 9a df ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  c81e0f:	84 c0                	test   al,al
  c81e11:	74 45                	je     c81e58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cedf8>
```
... truncated 57 more xrefs ...

## Preliminary conclusion

- `10ac1a9` is the concrete install of the `operator new(0x28)` object into the constructor-owned `this+0x78` target.
- `107162a` and `de1c52` are now the primary construction/finalization helpers for that installed object path.
- The constructor later makes indirect calls through the installed object vtable at `10ac37a` and `10ac386` using `[rax+0x28]`; resolving the concrete AP behind `0x184d898` or those call targets is the next method-level step.
- If the installed object still does not connect to `b411a4`, return to the `child AP 0x184da88` object layout and find the direct `child+0x18` assignment/reader.
