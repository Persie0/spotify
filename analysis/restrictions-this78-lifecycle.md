# Restrictions this+0x78 lifecycle trace

Purpose: batch trace the next semantic pivot after wrapper outputs were shown to be ignored: constructor-owned state around `this+0x78`, the object AP written as `0x184d898`, the `operator new(0x28)` / `operator new(0x30)` objects, helper `a7a290`, and write sites `10ac1a9`, `10ac1c6`, `10ac255`.

## Executive summary

- This report resolves the `this+0x78` construction area in one pass.
- The previous wrapper outputs are temporary; the persistent-looking graph begins after the two `15e75f2` calls, at the `operator new(0x28)` and `operator new(0x30)` sequence.
- `0x184d898` is treated relocation-aware because adjacent C++ RTTI/vtable regions often cannot be trusted from raw bytes alone.

## Focused constructor window: allocation and this+0x78 graph

```text
 10ac0d0:	6a 01                	push   0x1
 10ac0d2:	41 5c                	pop    r12
 10ac0d4:	48 8d 35 d5 b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5d5]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
 10ac0db:	48 8d 0d ee b5 32 ff 	lea    rcx,[rip+0xffffffffff32b5ee]        # 3d76d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22b5>
 10ac0e2:	6a 12                	push   0x12
 10ac0e4:	41 58                	pop    r8
 10ac0e6:	6a 03                	push   0x3
 10ac0e8:	41 59                	pop    r9
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
 10ac27e:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0
 10ac282:	48 8d 0d 57 26 76 00 	lea    rcx,[rip+0x762657]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
 10ac289:	48 89 88 90 00 00 00 	mov    QWORD PTR [rax+0x90],rcx
 10ac290:	48 8b 0d 09 58 80 00 	mov    rcx,QWORD PTR [rip+0x805809]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
 10ac297:	48 89 88 98 00 00 00 	mov    QWORD PTR [rax+0x98],rcx
 10ac29e:	48 89 90 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],rdx
```
## AP / vtable relocation entries around `0x184d898`

| AP offset | relocation offset | resolved value | kind |
|---:|---:|---:|---|
| `-0x20` | `0x184d878` | `0x0` | `reloc` |
| `-0x18` | `0x184d880` | — | `missing` |
| `-0x10` | `0x184d888` | — | `missing` |
| `-0x8` | `0x184d890` | — | `missing` |
| `+0x0` | `0x184d898` | — | `missing` |
| `+0x8` | `0x184d8a0` | — | `missing` |
| `+0x10` | `0x184d8a8` | — | `missing` |
| `+0x18` | `0x184d8b0` | — | `missing` |
| `+0x20` | `0x184d8b8` | — | `missing` |
| `+0x28` | `0x184d8c0` | — | `missing` |
| `+0x30` | `0x184d8c8` | — | `missing` |
| `+0x38` | `0x184d8d0` | — | `missing` |
| `+0x40` | `0x184d8d8` | — | `missing` |
| `+0x48` | `0x184d8e0` | — | `missing` |
| `+0x50` | `0x184d8e8` | — | `missing` |
| `+0x58` | `0x184d8f0` | — | `missing` |
| `+0x60` | `0x184d8f8` | — | `missing` |
| `+0x68` | `0x184d900` | — | `missing` |
| `+0x70` | `0x184d908` | — | `missing` |
| `+0x78` | `0x184d910` | — | `missing` |
| `+0x80` | `0x184d918` | — | `missing` |
| `+0x88` | `0x184d920` | — | `missing` |
| `+0x90` | `0x184d928` | — | `missing` |
| `+0x98` | `0x184d930` | — | `missing` |
| `+0xa0` | `0x184d938` | — | `missing` |
| `+0xa8` | `0x184d940` | — | `missing` |
| `+0xb0` | `0x184d948` | — | `missing` |
| `+0xb8` | `0x184d950` | — | `missing` |
| `+0xc0` | `0x184d958` | — | `missing` |
| `+0xc8` | `0x184d960` | — | `missing` |
| `+0xd0` | `0x184d968` | — | `missing` |
| `+0xd8` | `0x184d970` | — | `missing` |
| `+0xe0` | `0x184d978` | — | `missing` |
| `+0xe8` | `0x184d980` | — | `missing` |
| `+0xf0` | `0x184d988` | — | `missing` |
| `+0xf8` | `0x184d990` | — | `missing` |
| `+0x100` | `0x184d998` | — | `missing` |

## Xrefs to important literals / helpers

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
### `a7a290` xrefs (1419)

#### xref at `0xa7a1d8`

```text
  a7a1c9:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
  a7a1ce:	48 89 43 f0          	mov    QWORD PTR [rbx-0x10],rax
  a7a1d2:	48 89 df             	mov    rdi,rbx
  a7a1d5:	48 89 ce             	mov    rsi,rcx
  a7a1d8:	e8 b3 00 00 00       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  a7a1dd:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
  a7a1e2:	6a 50                	push   0x50
  a7a1e4:	5f                   	pop    rdi
  a7a1e5:	e8 16 3d d7 00       	call   17edf00 <_Znwm@plt>
  a7a1ea:	49 89 c7             	mov    r15,rax
  a7a1ed:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  a7a1f1:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
```
#### xref at `0xa7a221`

```text
  a7a213:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  a7a217:	4c 89 ff             	mov    rdi,r15
  a7a21a:	48 83 c7 20          	add    rdi,0x20
  a7a21e:	48 89 de             	mov    rsi,rbx
  a7a221:	e8 6a 00 00 00       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  a7a226:	48 89 e7             	mov    rdi,rsp
  a7a229:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  a7a22d:	4d 89 7e 20          	mov    QWORD PTR [r14+0x20],r15
  a7a231:	e8 94 00 00 00       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  a7a236:	48 89 df             	mov    rdi,rbx
  a7a239:	e8 2c fd ff ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  a7a23e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
```
#### xref at `0xa7a290`

```text
  a7a281:	75 08                	jne    a7a28b <JNI_OnUnload@@Base+0x1b58>
  a7a283:	4c 89 f7             	mov    rdi,r14
  a7a286:	e8 45 5a ff ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a7a28b:	e8 20 58 d7 00       	call   17efab0 <__stack_chk_fail@plt>
  a7a290:	53                   	push   rbx
  a7a291:	48 89 fb             	mov    rbx,rdi
  a7a294:	48 8b 7e 20          	mov    rdi,QWORD PTR [rsi+0x20]
  a7a298:	48 85 ff             	test   rdi,rdi
  a7a29b:	74 11                	je     a7a2ae <JNI_OnUnload@@Base+0x1b7b>
  a7a29d:	48 39 f7             	cmp    rdi,rsi
  a7a2a0:	74 13                	je     a7a2b5 <JNI_OnUnload@@Base+0x1b82>
  a7a2a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
```
#### xref at `0xa7a4aa`

```text
  a7a49c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  a7a49f:	48 89 07             	mov    QWORD PTR [rdi],rax
  a7a4a2:	48 83 c7 10          	add    rdi,0x10
  a7a4a6:	48 83 c6 10          	add    rsi,0x10
  a7a4aa:	e9 e1 fd ff ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  a7a4af:	cc                   	int3
  a7a4b0:	41 56                	push   r14
  a7a4b2:	53                   	push   rbx
  a7a4b3:	50                   	push   rax
  a7a4b4:	48 89 f3             	mov    rbx,rsi
  a7a4b7:	49 89 fe             	mov    r14,rdi
  a7a4ba:	e8 f5 00 00 00       	call   a7a5b4 <JNI_OnUnload@@Base+0x1e81>
```
#### xref at `0xaa39a4`

```text
  aa3994:	48 8d bc 24 b0 07 00 	lea    rdi,[rsp+0x7b0]
  aa399b:	00
  aa399c:	48 8d b4 24 80 07 00 	lea    rsi,[rsp+0x780]
  aa39a3:	00
  aa39a4:	e8 e7 68 fd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aa39a9:	4c 8b 64 24 78       	mov    r12,QWORD PTR [rsp+0x78]
  aa39ae:	48 8d 05 4b b0 d5 00 	lea    rax,[rip+0xd5b04b]        # 17fea00 <_ZTIN4asio22service_already_existsE@@Base+0x1e8>
  aa39b5:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
  aa39ba:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
  aa39be:	4c 8d 71 10          	lea    r14,[rcx+0x10]
  aa39c2:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0
  aa39c7:	bf 20 0b 00 00       	mov    edi,0xb20
```
#### xref at `0xaa3a20`

```text
  aa3a10:	48 8d bc 24 e0 07 00 	lea    rdi,[rsp+0x7e0]
  aa3a17:	00
  aa3a18:	48 8d b4 24 b0 07 00 	lea    rsi,[rsp+0x7b0]
  aa3a1f:	00
  aa3a20:	e8 6b 68 fd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aa3a25:	6a 40                	push   0x40
  aa3a27:	5f                   	pop    rdi
  aa3a28:	e8 d3 a4 d4 00       	call   17edf00 <_Znwm@plt>
  aa3a2d:	48 89 c3             	mov    rbx,rax
  aa3a30:	48 8d 35 c3 db 89 ff 	lea    rsi,[rip+0xffffffffff89dbc3]        # 3415fa <_ZTSSt12bad_any_cast@@Base-0x4ebce>
  aa3a37:	48 8d bc 24 30 10 00 	lea    rdi,[rsp+0x1030]
  aa3a3e:	00
```
#### xref at `0xaa3ed7`

```text
  aa3ec1:	4d 8d b7 d0 01 00 00 	lea    r14,[r15+0x1d0]
  aa3ec8:	49 8d bf 00 02 00 00 	lea    rdi,[r15+0x200]
  aa3ecf:	48 8d b4 24 e0 07 00 	lea    rsi,[rsp+0x7e0]
  aa3ed6:	00
  aa3ed7:	e8 b4 63 fd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aa3edc:	49 89 af 30 02 00 00 	mov    QWORD PTR [r15+0x230],rbp
  aa3ee3:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
  aa3ee8:	49 89 87 38 02 00 00 	mov    QWORD PTR [r15+0x238],rax
  aa3eef:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
  aa3ef4:	49 89 87 40 02 00 00 	mov    QWORD PTR [r15+0x240],rax
  aa3efb:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
  aa3eff:	49 89 87 48 02 00 00 	mov    QWORD PTR [r15+0x248],rax
```
#### xref at `0xaa5736`

```text
  aa5728:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  aa572b:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
  aa5732:	00
  aa5733:	48 89 c6             	mov    rsi,rax
  aa5736:	e8 55 4b fd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aa573b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  aa573f:	4c 8b 60 08          	mov    r12,QWORD PTR [rax+0x8]
  aa5743:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aa5748:	e8 f5 14 00 00       	call   aa6c42 <JNI_OnUnload@@Base+0x2e50f>
  aa574d:	49 89 c6             	mov    r14,rax
  aa5750:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  aa5754:	e8 f3 35 00 00       	call   aa8d4c <JNI_OnUnload@@Base+0x30619>
```
#### xref at `0xaa5a73`

```text
  aa5a65:	48 89 c3             	mov    rbx,rax
  aa5a68:	48 8d bc 24 30 10 00 	lea    rdi,[rsp+0x1030]
  aa5a6f:	00
  aa5a70:	4c 89 f6             	mov    rsi,r14
  aa5a73:	e8 18 48 fd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aa5a78:	48 8d 35 b5 39 8e ff 	lea    rsi,[rip+0xffffffffff8e39b5]        # 389434 <_ZTSSt12bad_any_cast@@Base-0x6d94>
  aa5a7f:	48 89 df             	mov    rdi,rbx
  aa5a82:	e8 49 e1 b3 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>
  aa5a87:	49 83 c7 10          	add    r15,0x10
  aa5a8b:	48 8d 05 ae 7c d5 00 	lea    rax,[rip+0xd57cae]        # 17fd740 <_ZTINSt6__ndk117bad_function_callE@@Base+0x7e0>
  aa5a92:	48 89 03             	mov    QWORD PTR [rbx],rax
  aa5a95:	48 8d 43 28          	lea    rax,[rbx+0x28]
```
#### xref at `0xaabfb7`

```text
  aabfa7:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  aabfae:	00
  aabfaf:	48 89 de             	mov    rsi,rbx
  aabfb2:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
  aabfb7:	e8 d4 e2 fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aabfbc:	48 8d 05 ad 1d d5 00 	lea    rax,[rip+0xd51dad]        # 17fdd70 <_ZTINSt6__ndk117bad_function_callE@@Base+0xe10>
  aabfc3:	49 89 06             	mov    QWORD PTR [r14],rax
  aabfc6:	4c 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],r15
  aabfcb:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
  aabfcf:	41 83 66 10 00       	and    DWORD PTR [r14+0x10],0x0
  aabfd4:	49 8d 7e 20          	lea    rdi,[r14+0x20]
  aabfd8:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
```
#### xref at `0xaac5bd`

```text
  aac5b0:	48 39 f3             	cmp    rbx,rsi
  aac5b3:	73 17                	jae    aac5cc <JNI_OnUnload@@Base+0x33e99>
  aac5b5:	48 89 df             	mov    rdi,rbx
  aac5b8:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
  aac5bd:	e8 ce dc fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aac5c2:	48 83 c3 30          	add    rbx,0x30
  aac5c6:	48 89 5d 58          	mov    QWORD PTR [rbp+0x58],rbx
  aac5ca:	eb 7d                	jmp    aac649 <JNI_OnUnload@@Base+0x33f16>
  aac5cc:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  aac5cf:	48 29 fb             	sub    rbx,rdi
  aac5d2:	48 89 d8             	mov    rax,rbx
  aac5d5:	48 99                	cqo
```
#### xref at `0xaac618`

```text
  aac608:	48 8b 9c 24 20 01 00 	mov    rbx,QWORD PTR [rsp+0x120]
  aac60f:	00
  aac610:	48 89 df             	mov    rdi,rbx
  aac613:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
  aac618:	e8 73 dc fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aac61d:	48 83 c3 30          	add    rbx,0x30
  aac621:	4c 8d a4 24 10 01 00 	lea    r12,[rsp+0x110]
  aac628:	00
  aac629:	49 89 5c 24 10       	mov    QWORD PTR [r12+0x10],rbx
  aac62e:	4c 89 f7             	mov    rdi,r14
  aac631:	4c 89 e6             	mov    rsi,r12
  aac634:	e8 07 08 00 00       	call   aace40 <JNI_OnUnload@@Base+0x3470d>
```
#### xref at `0xaacff4`

```text
  aacfec:	53                   	push   rbx
  aacfed:	50                   	push   rax
  aacfee:	49 89 f7             	mov    r15,rsi
  aacff1:	48 89 fb             	mov    rbx,rdi
  aacff4:	e8 97 d2 fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aacff9:	4c 8d 73 30          	lea    r14,[rbx+0x30]
  aacffd:	49 8d 77 30          	lea    rsi,[r15+0x30]
  aad001:	4c 89 f7             	mov    rdi,r14
  aad004:	e8 87 d2 fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aad009:	4c 8d 63 60          	lea    r12,[rbx+0x60]
  aad00d:	49 8d 77 60          	lea    rsi,[r15+0x60]
  aad011:	4c 89 e7             	mov    rdi,r12
```
#### xref at `0xaad004`

```text
  aacff4:	e8 97 d2 fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aacff9:	4c 8d 73 30          	lea    r14,[rbx+0x30]
  aacffd:	49 8d 77 30          	lea    rsi,[r15+0x30]
  aad001:	4c 89 f7             	mov    rdi,r14
  aad004:	e8 87 d2 fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aad009:	4c 8d 63 60          	lea    r12,[rbx+0x60]
  aad00d:	49 8d 77 60          	lea    rsi,[r15+0x60]
  aad011:	4c 89 e7             	mov    rdi,r12
  aad014:	e8 77 d2 fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aad019:	b8 90 00 00 00       	mov    eax,0x90
  aad01e:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
  aad022:	49 01 c7             	add    r15,rax
```
#### xref at `0xaad014`

```text
  aad004:	e8 87 d2 fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aad009:	4c 8d 63 60          	lea    r12,[rbx+0x60]
  aad00d:	49 8d 77 60          	lea    rsi,[r15+0x60]
  aad011:	4c 89 e7             	mov    rdi,r12
  aad014:	e8 77 d2 fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aad019:	b8 90 00 00 00       	mov    eax,0x90
  aad01e:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
  aad022:	49 01 c7             	add    r15,rax
  aad025:	4c 89 fe             	mov    rsi,r15
  aad028:	e8 63 d2 fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aad02d:	48 83 c4 08          	add    rsp,0x8
  aad031:	5b                   	pop    rbx
```
#### xref at `0xaad028`

```text
  aad019:	b8 90 00 00 00       	mov    eax,0x90
  aad01e:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
  aad022:	49 01 c7             	add    r15,rax
  aad025:	4c 89 fe             	mov    rsi,r15
  aad028:	e8 63 d2 fc ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  aad02d:	48 83 c4 08          	add    rsp,0x8
  aad031:	5b                   	pop    rbx
  aad032:	41 5c                	pop    r12
  aad034:	41 5e                	pop    r14
  aad036:	41 5f                	pop    r15
  aad038:	c3                   	ret
  aad039:	49 89 c7             	mov    r15,rax
```
#### xref at `0xac19fb`

```text
  ac19ed:	e8 0e c5 d2 00       	call   17edf00 <_Znwm@plt>
  ac19f2:	48 89 c3             	mov    rbx,rax
  ac19f5:	48 89 c7             	mov    rdi,rax
  ac19f8:	4c 89 e6             	mov    rsi,r12
  ac19fb:	e8 90 88 fb ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ac1a00:	48 89 9c 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rbx
  ac1a07:	00
  ac1a08:	48 8d 05 cb 1f 00 00 	lea    rax,[rip+0x1fcb]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  ac1a0f:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
  ac1a16:	00
  ac1a17:	48 8d 05 e6 1f 00 00 	lea    rax,[rip+0x1fe6]        # ac3a04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109a4>
  ac1a1e:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
```
#### xref at `0xac235b`

```text
  ac234e:	00
  ac234f:	4d 89 67 f0          	mov    QWORD PTR [r15-0x10],r12
  ac2353:	4c 89 ff             	mov    rdi,r15
  ac2356:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
  ac235b:	e8 30 7f fb ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ac2360:	48 8d 35 35 81 fb ff 	lea    rsi,[rip+0xfffffffffffb8135]        # a7a49c <JNI_OnUnload@@Base+0x1d69>
  ac2367:	48 8d 15 02 41 01 00 	lea    rdx,[rip+0x14102]        # ad6470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23410>
  ac236e:	48 8d 0d 87 cc 09 00 	lea    rcx,[rip+0x9cc87]        # b5effc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xabf9c>
  ac2375:	4c 8d a4 24 80 01 00 	lea    r12,[rsp+0x180]
  ac237c:	00
  ac237d:	4c 8d 84 24 40 01 00 	lea    r8,[rsp+0x140]
  ac2384:	00
```
#### xref at `0xacbe83`

```text
  acbe74:	be c0 01 00 00       	mov    esi,0x1c0
  acbe79:	4c 8d 3c 33          	lea    r15,[rbx+rsi*1]
  acbe7d:	4c 01 e6             	add    rsi,r12
  acbe80:	4c 89 ff             	mov    rdi,r15
  acbe83:	e8 08 e4 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  acbe88:	41 8a 84 24 f0 01 00 	mov    al,BYTE PTR [r12+0x1f0]
  acbe8f:	00
  acbe90:	88 83 f0 01 00 00    	mov    BYTE PTR [rbx+0x1f0],al
  acbe96:	be f8 01 00 00       	mov    esi,0x1f8
  acbe9b:	4c 8d 2c 33          	lea    r13,[rbx+rsi*1]
  acbe9f:	4c 01 e6             	add    rsi,r12
  acbea2:	4c 89 ef             	mov    rdi,r13
```
#### xref at `0xacd5cc`

```text
  acd5bc:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
  acd5c3:	00
  acd5c4:	48 8d b4 24 50 04 00 	lea    rsi,[rsp+0x450]
  acd5cb:	00
  acd5cc:	e8 bf cc fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  acd5d1:	48 83 a4 24 70 07 00 	and    QWORD PTR [rsp+0x770],0x0
  acd5d8:	00 00
  acd5da:	6a 40                	push   0x40
  acd5dc:	5f                   	pop    rdi
  acd5dd:	e8 1e 09 d2 00       	call   17edf00 <_Znwm@plt>
  acd5e2:	48 89 c3             	mov    rbx,rax
  acd5e5:	4c 89 74 24 58       	mov    QWORD PTR [rsp+0x58],r14
```
#### xref at `0xacd61f`

```text
  acd610:	48 89 df             	mov    rdi,rbx
  acd613:	48 83 c7 10          	add    rdi,0x10
  acd617:	48 8d b4 24 e0 06 00 	lea    rsi,[rsp+0x6e0]
  acd61e:	00
  acd61f:	e8 6c cc fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  acd624:	48 8d bc 24 90 06 00 	lea    rdi,[rsp+0x690]
  acd62b:	00
  acd62c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  acd630:	4c 8d b4 24 30 07 00 	lea    r14,[rsp+0x730]
  acd637:	00
  acd638:	49 89 5e 40          	mov    QWORD PTR [r14+0x40],rbx
  acd63c:	e8 89 cc fa ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
```
#### xref at `0xad1878`

```text
  ad186b:	00 00
  ad186d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  ad1872:	49 89 e6             	mov    r14,rsp
  ad1875:	4c 89 f7             	mov    rdi,r14
  ad1878:	e8 13 8a fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad187d:	4c 89 f7             	mov    rdi,r14
  ad1880:	48 89 de             	mov    rsi,rbx
  ad1883:	e8 28 00 00 00       	call   ad18b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e850>
  ad1888:	4c 89 f7             	mov    rdi,r14
  ad188b:	e8 da 86 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad1890:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad1897:	00 00
```
#### xref at `0xad1bf2`

```text
  ad1be1:	49 83 a4 24 88 00 00 	and    QWORD PTR [r12+0x88],0x0
  ad1be8:	00 00
  ad1bea:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
  ad1bf1:	00
  ad1bf2:	e8 99 86 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad1bf7:	4d 8d 7c 24 10       	lea    r15,[r12+0x10]
  ad1bfc:	48 8d 05 6d 9e db 00 	lea    rax,[rip+0xdb9e6d]        # 188ba70 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4748>
  ad1c03:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  ad1c08:	4d 8d b4 24 c0 00 00 	lea    r14,[r12+0xc0]
  ad1c0f:	00
  ad1c10:	49 8d 84 24 c8 00 00 	lea    rax,[r12+0xc8]
  ad1c17:	00
```
#### xref at `0xad1d69`

```text
  ad1d59:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
  ad1d60:	00
  ad1d61:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
  ad1d68:	00
  ad1d69:	e8 22 85 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad1d6e:	48 83 a4 24 70 07 00 	and    QWORD PTR [rsp+0x770],0x0
  ad1d75:	00 00
  ad1d77:	6a 40                	push   0x40
  ad1d79:	5f                   	pop    rdi
  ad1d7a:	e8 81 c1 d1 00       	call   17edf00 <_Znwm@plt>
  ad1d7f:	49 89 c6             	mov    r14,rax
  ad1d82:	48 89 84 24 a0 04 00 	mov    QWORD PTR [rsp+0x4a0],rax
```
#### xref at `0xad1dbf`

```text
  ad1db0:	4c 89 f7             	mov    rdi,r14
  ad1db3:	48 83 c7 10          	add    rdi,0x10
  ad1db7:	48 8d b4 24 f0 06 00 	lea    rsi,[rsp+0x6f0]
  ad1dbe:	00
  ad1dbf:	e8 cc 84 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad1dc4:	4d 8d bc 24 80 01 00 	lea    r15,[r12+0x180]
  ad1dcb:	00
  ad1dcc:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
  ad1dd3:	00
  ad1dd4:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  ad1dd8:	4c 89 b4 24 70 07 00 	mov    QWORD PTR [rsp+0x770],r14
  ad1ddf:	00
```
#### xref at `0xad1ea7`

```text
  ad1e99:	00
  ad1e9a:	48 8d b4 24 70 04 00 	lea    rsi,[rsp+0x470]
  ad1ea1:	00
  ad1ea2:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
  ad1ea7:	e8 e4 83 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad1eac:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
  ad1eb1:	6a 10                	push   0x10
  ad1eb3:	5f                   	pop    rdi
  ad1eb4:	e8 47 c0 d1 00       	call   17edf00 <_Znwm@plt>
  ad1eb9:	49 89 c6             	mov    r14,rax
  ad1ebc:	48 8d b4 24 90 06 00 	lea    rsi,[rsp+0x690]
  ad1ec3:	00
```
#### xref at `0xad21d1`

```text
  ad21c2:	74 05                	je     ad21c9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f169>
  ad21c4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ad21c9:	49 8d bc 24 d0 01 00 	lea    rdi,[r12+0x1d0]
  ad21d0:	00
  ad21d1:	e8 ba 80 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad21d6:	e8 75 bf d1 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
  ad21db:	49 89 84 24 00 02 00 	mov    QWORD PTR [r12+0x200],rax
  ad21e2:	00
  ad21e3:	e8 78 bf d1 00       	call   17ee160 <_ZNSt6__ndk16chrono12steady_clock3nowEv@plt>
  ad21e8:	49 89 84 24 08 02 00 	mov    QWORD PTR [r12+0x208],rax
  ad21ef:	00
  ad21f0:	4c 89 e7             	mov    rdi,r12
```
#### xref at `0xad2bd4`

```text
  ad2bc5:	49 89 6f f0          	mov    QWORD PTR [r15-0x10],rbp
  ad2bc9:	48 8d b4 24 f0 03 00 	lea    rsi,[rsp+0x3f0]
  ad2bd0:	00
  ad2bd1:	4c 89 ff             	mov    rdi,r15
  ad2bd4:	e8 b7 76 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad2bd9:	4c 8d a4 24 60 04 00 	lea    r12,[rsp+0x460]
  ad2be0:	00
  ad2be1:	48 8b b4 24 08 01 00 	mov    rsi,QWORD PTR [rsp+0x108]
  ad2be8:	00
  ad2be9:	4c 89 e7             	mov    rdi,r12
  ad2bec:	e8 b5 6c b1 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
  ad2bf1:	48 83 a4 24 90 04 00 	and    QWORD PTR [rsp+0x490],0x0
```
#### xref at `0xad2c42`

```text
  ad2c34:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
  ad2c38:	4c 89 ef             	mov    rdi,r13
  ad2c3b:	48 83 c7 20          	add    rdi,0x20
  ad2c3f:	4c 89 fe             	mov    rsi,r15
  ad2c42:	e8 49 76 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad2c47:	66 0f 6f 84 24 60 04 	movdqa xmm0,XMMWORD PTR [rsp+0x460]
  ad2c4e:	00 00
  ad2c50:	f3 41 0f 7f 45 50    	movdqu XMMWORD PTR [r13+0x50],xmm0
  ad2c56:	66 0f ef c0          	pxor   xmm0,xmm0
  ad2c5a:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
  ad2c60:	48 8d bc 24 50 07 00 	lea    rdi,[rsp+0x750]
  ad2c67:	00
```
#### xref at `0xad2d35`

```text
  ad2d29:	00
  ad2d2a:	48 8d b4 24 f0 03 00 	lea    rsi,[rsp+0x3f0]
  ad2d31:	00
  ad2d32:	4c 89 ef             	mov    rdi,r13
  ad2d35:	e8 56 75 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad2d3a:	8a 44 24 30          	mov    al,BYTE PTR [rsp+0x30]
  ad2d3e:	41 88 84 24 f0 02 00 	mov    BYTE PTR [r12+0x2f0],al
  ad2d45:	00
  ad2d46:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
  ad2d4d:	00
  ad2d4e:	48 85 ff             	test   rdi,rdi
  ad2d51:	74 15                	je     ad2d68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fd08>
```
... truncated 1389 more xrefs ...

### `ac39da` xrefs (31)

#### xref at `0xac1a08`

```text
  ac19f8:	4c 89 e6             	mov    rsi,r12
  ac19fb:	e8 90 88 fb ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ac1a00:	48 89 9c 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rbx
  ac1a07:	00
  ac1a08:	48 8d 05 cb 1f 00 00 	lea    rax,[rip+0x1fcb]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  ac1a0f:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
  ac1a16:	00
  ac1a17:	48 8d 05 e6 1f 00 00 	lea    rax,[rip+0x1fe6]        # ac3a04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109a4>
  ac1a1e:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
  ac1a25:	00
  ac1a26:	bf f0 00 00 00       	mov    edi,0xf0
  ac1a2b:	e8 d0 c4 d2 00       	call   17edf00 <_Znwm@plt>
```
#### xref at `0xac39da`

```text
  ac39d0:	c3                   	ret
  ac39d1:	48 89 c7             	mov    rdi,rax
  ac39d4:	e8 cc 60 fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ac39d9:	cc                   	int3
  ac39da:	83 ff 01             	cmp    edi,0x1
  ac39dd:	74 1e                	je     ac39fd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1099d>
  ac39df:	85 ff                	test   edi,edi
  ac39e1:	75 20                	jne    ac3a03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109a3>
  ac39e3:	53                   	push   rbx
  ac39e4:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
  ac39e7:	48 85 db             	test   rbx,rbx
  ac39ea:	74 08                	je     ac39f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10994>
```
#### xref at `0xadee2c`

```text
  adee1a:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
  adee1f:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
  adee23:	4c 8d 6c 24 70       	lea    r13,[rsp+0x70]
  adee28:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
  adee2c:	48 8d 05 a7 4b fe ff 	lea    rax,[rip+0xfffffffffffe4ba7]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  adee33:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
  adee37:	48 8d 05 36 01 00 00 	lea    rax,[rip+0x136]        # adef74 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bf14>
  adee3e:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
  adee42:	49 8b 06             	mov    rax,QWORD PTR [r14]
  adee45:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
  adee4a:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
  adee4f:	4c 89 ff             	mov    rdi,r15
```
#### xref at `0xae155e`

```text
  ae154d:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
  ae1551:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
  ae1555:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  ae155a:	4d 89 34 24          	mov    QWORD PTR [r12],r14
  ae155e:	48 8d 05 75 24 fe ff 	lea    rax,[rip+0xfffffffffffe2475]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  ae1565:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  ae156a:	48 8d 05 7d 00 00 00 	lea    rax,[rip+0x7d]        # ae15ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2e58e>
  ae1571:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  ae1576:	48 89 df             	mov    rdi,rbx
  ae1579:	4c 89 e6             	mov    rsi,r12
  ae157c:	e8 0d 02 b0 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
  ae1581:	4c 89 e7             	mov    rdi,r12
```
#### xref at `0xc2e253`

```text
  c2e245:	48 89 c7             	mov    rdi,rax
  c2e248:	4c 89 fe             	mov    rsi,r15
  c2e24b:	e8 40 c0 e4 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  c2e250:	4c 89 33             	mov    QWORD PTR [rbx],r14
  c2e253:	48 8d 05 80 57 e9 ff 	lea    rax,[rip+0xffffffffffe95780]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  c2e25a:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  c2e25e:	48 8d 05 9f 57 e9 ff 	lea    rax,[rip+0xffffffffffe9579f]        # ac3a04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109a4>
  c2e265:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  c2e269:	5b                   	pop    rbx
  c2e26a:	41 5e                	pop    r14
  c2e26c:	41 5f                	pop    r15
  c2e26e:	c3                   	ret
```
#### xref at `0xc35412`

```text
  c35400:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
  c35405:	e8 86 4e e4 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  c3540a:	48 89 9c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rbx
  c35411:	00
  c35412:	48 8d 05 c1 e5 e8 ff 	lea    rax,[rip+0xffffffffffe8e5c1]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  c35419:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
  c35420:	00
  c35421:	48 8d 05 dc e5 e8 ff 	lea    rax,[rip+0xffffffffffe8e5dc]        # ac3a04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109a4>
  c35428:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
  c3542f:	00
  c35430:	48 8d 05 91 2a be 00 	lea    rax,[rip+0xbe2a91]        # 1817ec8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xdb88>
  c35437:	49 89 04 24          	mov    QWORD PTR [r12],rax
```
#### xref at `0xc3dcfd`

```text
  c3dcef:	48 89 c7             	mov    rdi,rax
  c3dcf2:	4c 89 f6             	mov    rsi,r14
  c3dcf5:	e8 f6 a1 e9 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  c3dcfa:	4c 89 3b             	mov    QWORD PTR [rbx],r15
  c3dcfd:	48 8d 05 d6 5c e8 ff 	lea    rax,[rip+0xffffffffffe85cd6]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  c3dd04:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  c3dd08:	48 8d 05 f5 5c e8 ff 	lea    rax,[rip+0xffffffffffe85cf5]        # ac3a04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109a4>
  c3dd0f:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  c3dd13:	5b                   	pop    rbx
  c3dd14:	41 5e                	pop    r14
  c3dd16:	41 5f                	pop    r15
  c3dd18:	c3                   	ret
```
#### xref at `0xd8a541`

```text
  d8a533:	48 89 c7             	mov    rdi,rax
  d8a536:	4c 89 f6             	mov    rsi,r14
  d8a539:	e8 7a dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
  d8a53e:	4c 89 3b             	mov    QWORD PTR [rbx],r15
  d8a541:	48 8d 05 92 94 d3 ff 	lea    rax,[rip+0xffffffffffd39492]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  d8a548:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  d8a54c:	48 8d 05 37 00 00 00 	lea    rax,[rip+0x37]        # d8a58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57610>
  d8a553:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  d8a557:	5b                   	pop    rbx
  d8a558:	41 5e                	pop    r14
  d8a55a:	41 5f                	pop    r15
  d8a55c:	c3                   	ret
```
#### xref at `0xd95a4f`

```text
  d95a40:	ff 50 18             	call   QWORD PTR [rax+0x18]
  d95a43:	4c 8d a4 24 a8 00 00 	lea    r12,[rsp+0xa8]
  d95a4a:	00
  d95a4b:	4d 89 34 24          	mov    QWORD PTR [r12],r14
  d95a4f:	48 8d 05 84 df d2 ff 	lea    rax,[rip+0xffffffffffd2df84]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  d95a56:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  d95a5b:	48 8d 05 fe 14 00 00 	lea    rax,[rip+0x14fe]        # d96f60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63fe6>
  d95a62:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
  d95a67:	49 8b 07             	mov    rax,QWORD PTR [r15]
  d95a6a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  d95a6f:	4c 8d 6c 24 18       	lea    r13,[rsp+0x18]
  d95a74:	4c 89 f7             	mov    rdi,r14
```
#### xref at `0xdf14d6`

```text
  df14c8:	48 89 c7             	mov    rdi,rax
  df14cb:	4c 89 fe             	mov    rsi,r15
  df14ce:	e8 bd 8d c8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  df14d3:	4c 89 33             	mov    QWORD PTR [rbx],r14
  df14d6:	48 8d 05 fd 24 cd ff 	lea    rax,[rip+0xffffffffffcd24fd]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  df14dd:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  df14e1:	48 8d 05 1c 25 cd ff 	lea    rax,[rip+0xffffffffffcd251c]        # ac3a04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109a4>
  df14e8:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  df14ec:	5b                   	pop    rbx
  df14ed:	41 5e                	pop    r14
  df14ef:	41 5f                	pop    r15
  df14f1:	c3                   	ret
```
#### xref at `0xe036ef`

```text
  e036df:	48 8d 94 24 98 00 00 	lea    rdx,[rsp+0x98]
  e036e6:	00
  e036e7:	4c 8d 44 24 58       	lea    r8,[rsp+0x58]
  e036ec:	4d 89 30             	mov    QWORD PTR [r8],r14
  e036ef:	48 8d 05 e4 02 cc ff 	lea    rax,[rip+0xffffffffffcc02e4]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  e036f6:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax
  e036fa:	48 8d 05 e1 0f 00 00 	lea    rax,[rip+0xfe1]        # e046e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd1768>
  e03701:	49 89 40 18          	mov    QWORD PTR [r8+0x18],rax
  e03705:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e03708:	48 89 e1             	mov    rcx,rsp
  e0370b:	4c 89 ff             	mov    rdi,r15
  e0370e:	48 89 de             	mov    rsi,rbx
```
#### xref at `0xe1d6f5`

```text
  e1d6e6:	49 83 e6 fc          	and    r14,0xfffffffffffffffc
  e1d6ea:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
  e1d6f1:	00
  e1d6f2:	4c 89 3e             	mov    QWORD PTR [rsi],r15
  e1d6f5:	48 8d 05 de 62 ca ff 	lea    rax,[rip+0xffffffffffca62de]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  e1d6fc:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  e1d700:	48 8d 05 1f 32 00 00 	lea    rax,[rip+0x321f]        # e20926 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xed9ac>
  e1d707:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
  e1d70b:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
  e1d712:	00
  e1d713:	4c 89 ff             	mov    rdi,r15
  e1d716:	e8 d9 32 00 00       	call   e209f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeda7a>
```
#### xref at `0xe1da69`

```text
  e1da5d:	00
  e1da5e:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
  e1da65:	00
  e1da66:	4c 89 36             	mov    QWORD PTR [rsi],r14
  e1da69:	48 8d 05 6a 5f ca ff 	lea    rax,[rip+0xffffffffffca5f6a]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  e1da70:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  e1da74:	48 8d 05 93 2b 00 00 	lea    rax,[rip+0x2b93]        # e2060e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xed694>
  e1da7b:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
  e1da7f:	4c 8d b4 24 c8 00 00 	lea    r14,[rsp+0xc8]
  e1da86:	00
  e1da87:	4c 89 f7             	mov    rdi,r14
  e1da8a:	e8 43 2c 00 00       	call   e206d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xed758>
```
#### xref at `0xe1e144`

```text
  e1e137:	00
  e1e138:	0f 57 c0             	xorps  xmm0,xmm0
  e1e13b:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
  e1e13f:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
  e1e144:	48 8d 0d 8f 58 ca ff 	lea    rcx,[rip+0xffffffffffca588f]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
  e1e14b:	48 89 8c 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rcx
  e1e152:	00
  e1e153:	4c 89 ac 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],r13
  e1e15a:	00
  e1e15b:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
  e1e162:	00
  e1e163:	48 83 67 38 00       	and    QWORD PTR [rdi+0x38],0x0
```
#### xref at `0x10ac16a`

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
```
#### xref at `0x11cc2e6`

```text
 11cc2d5:	41 0f 29 47 30       	movaps XMMWORD PTR [r15+0x30],xmm0
 11cc2da:	4c 8d a4 24 80 08 00 	lea    r12,[rsp+0x880]
 11cc2e1:	00
 11cc2e2:	4d 89 3c 24          	mov    QWORD PTR [r12],r15
 11cc2e6:	48 8d 05 ed 76 8f ff 	lea    rax,[rip+0xffffffffff8f76ed]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11cc2ed:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
 11cc2f2:	48 8d 0d 97 27 00 00 	lea    rcx,[rip+0x2797]        # 11cea90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14014>
 11cc2f9:	49 89 4c 24 18       	mov    QWORD PTR [r12+0x18],rcx
 11cc2fe:	49 81 c6 30 02 00 00 	add    r14,0x230
 11cc305:	48 83 a4 24 20 0a 00 	and    QWORD PTR [rsp+0xa20],0x0
 11cc30c:	00 00
 11cc30e:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
```
#### xref at `0x11cc31f`

```text
 11cc316:	6a 01                	push   0x1
 11cc318:	5f                   	pop    rdi
 11cc319:	48 89 de             	mov    rsi,rbx
 11cc31c:	4c 89 e2             	mov    rdx,r12
 11cc31f:	e8 b6 76 8f ff       	call   ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11cc324:	49 8b 44 24 18       	mov    rax,QWORD PTR [r12+0x18]
 11cc329:	48 89 84 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],rax
 11cc330:	00
 11cc331:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
 11cc337:	48 8b 8c 24 30 0a 00 	mov    rcx,QWORD PTR [rsp+0xa30]
 11cc33e:	00
 11cc33f:	4d 89 f7             	mov    r15,r14
```
#### xref at `0x11cc666`

```text
 11cc656:	e8 35 dc 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11cc65b:	4c 8d bc 24 20 0a 00 	lea    r15,[rsp+0xa20]
 11cc662:	00
 11cc663:	4d 89 37             	mov    QWORD PTR [r15],r14
 11cc666:	48 8d 05 6d 73 8f ff 	lea    rax,[rip+0xffffffffff8f736d]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11cc66d:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
 11cc671:	48 8d 05 f6 2a 00 00 	lea    rax,[rip+0x2af6]        # 11cf16e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146f2>
 11cc678:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 11cc67c:	48 83 c3 60          	add    rbx,0x60
 11cc680:	48 89 df             	mov    rdi,rbx
 11cc683:	4c 89 fe             	mov    rsi,r15
 11cc686:	e8 45 2b 00 00       	call   11cf1d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14754>
```
#### xref at `0x11cc6f1`

```text
 11cc6e1:	e8 aa db 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11cc6e6:	4c 8d bc 24 20 0a 00 	lea    r15,[rsp+0xa20]
 11cc6ed:	00
 11cc6ee:	4d 89 37             	mov    QWORD PTR [r15],r14
 11cc6f1:	48 8d 05 e2 72 8f ff 	lea    rax,[rip+0xffffffffff8f72e2]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11cc6f8:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
 11cc6fc:	48 8d 05 0f 2c 00 00 	lea    rax,[rip+0x2c0f]        # 11cf312 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14896>
 11cc703:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 11cc707:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
 11cc70b:	48 89 df             	mov    rdi,rbx
 11cc70e:	4c 89 fe             	mov    rsi,r15
 11cc711:	e8 9a 2c 00 00       	call   11cf3b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14934>
```
#### xref at `0x11cc781`

```text
 11cc771:	e8 1a db 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11cc776:	4c 8d b4 24 20 0a 00 	lea    r14,[rsp+0xa20]
 11cc77d:	00
 11cc77e:	4d 89 3e             	mov    QWORD PTR [r14],r15
 11cc781:	48 8d 05 52 72 8f ff 	lea    rax,[rip+0xffffffffff8f7252]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11cc788:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 11cc78c:	48 8d 05 5f 2d 00 00 	lea    rax,[rip+0x2d5f]        # 11cf4f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14a76>
 11cc793:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 11cc797:	48 81 c3 a0 00 00 00 	add    rbx,0xa0
 11cc79e:	48 89 df             	mov    rdi,rbx
 11cc7a1:	4c 89 f6             	mov    rsi,r14
 11cc7a4:	e8 9f 2d 00 00       	call   11cf548 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14acc>
```
#### xref at `0x11cc819`

```text
 11cc808:	e8 83 da 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11cc80d:	4c 8d a4 24 20 0a 00 	lea    r12,[rsp+0xa20]
 11cc814:	00
 11cc815:	4d 89 3c 24          	mov    QWORD PTR [r12],r15
 11cc819:	48 8d 05 ba 71 8f ff 	lea    rax,[rip+0xffffffffff8f71ba]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11cc820:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
 11cc825:	48 8d 05 38 2e 00 00 	lea    rax,[rip+0x2e38]        # 11cf664 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14be8>
 11cc82c:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
 11cc831:	48 83 c3 60          	add    rbx,0x60
 11cc835:	48 89 df             	mov    rdi,rbx
 11cc838:	4c 89 e6             	mov    rsi,r12
 11cc83b:	e8 90 29 00 00       	call   11cf1d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14754>
```
#### xref at `0x11cc8a7`

```text
 11cc896:	e8 f5 d9 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11cc89b:	4c 8d a4 24 20 0a 00 	lea    r12,[rsp+0xa20]
 11cc8a2:	00
 11cc8a3:	4d 89 3c 24          	mov    QWORD PTR [r12],r15
 11cc8a7:	48 8d 05 2c 71 8f ff 	lea    rax,[rip+0xffffffffff8f712c]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11cc8ae:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
 11cc8b3:	48 8d 05 10 2e 00 00 	lea    rax,[rip+0x2e10]        # 11cf6ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c4e>
 11cc8ba:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
 11cc8bf:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
 11cc8c3:	48 89 df             	mov    rdi,rbx
 11cc8c6:	4c 89 e6             	mov    rsi,r12
 11cc8c9:	e8 e2 2a 00 00       	call   11cf3b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14934>
```
#### xref at `0x11cc935`

```text
 11cc924:	e8 67 d9 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11cc929:	4c 8d a4 24 20 0a 00 	lea    r12,[rsp+0xa20]
 11cc930:	00
 11cc931:	4d 89 3c 24          	mov    QWORD PTR [r12],r15
 11cc935:	48 8d 05 9e 70 8f ff 	lea    rax,[rip+0xffffffffff8f709e]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11cc93c:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
 11cc941:	48 8d 05 aa 2b 00 00 	lea    rax,[rip+0x2baa]        # 11cf4f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14a76>
 11cc948:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
 11cc94d:	48 81 c3 a0 00 00 00 	add    rbx,0xa0
 11cc954:	48 89 df             	mov    rdi,rbx
 11cc957:	4c 89 e6             	mov    rsi,r12
 11cc95a:	e8 e9 2b 00 00       	call   11cf548 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14acc>
```
#### xref at `0x11cc9d1`

```text
 11cc9c1:	00
 11cc9c2:	48 8d 05 c7 2d 00 00 	lea    rax,[rip+0x2dc7]        # 11cf790 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d14>
 11cc9c9:	48 89 84 24 88 0e 00 	mov    QWORD PTR [rsp+0xe88],rax
 11cc9d0:	00
 11cc9d1:	48 8d 15 02 70 8f ff 	lea    rdx,[rip+0xffffffffff8f7002]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11cc9d8:	48 89 94 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rdx
 11cc9df:	00
 11cc9e0:	48 83 a4 24 80 0e 00 	and    QWORD PTR [rsp+0xe80],0x0
 11cc9e7:	00 00
 11cc9e9:	48 89 9c 24 20 0a 00 	mov    QWORD PTR [rsp+0xa20],rbx
 11cc9f0:	00
 11cc9f1:	48 89 84 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],rax
```
#### xref at `0x11ccaf4`

```text
 11ccae4:	e8 a7 d7 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11ccae9:	4c 8d bc 24 70 0e 00 	lea    r15,[rsp+0xe70]
 11ccaf0:	00
 11ccaf1:	49 89 1f             	mov    QWORD PTR [r15],rbx
 11ccaf4:	48 8d 05 df 6e 8f ff 	lea    rax,[rip+0xffffffffff8f6edf]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11ccafb:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
 11ccaff:	48 8d 0d 10 2d 00 00 	lea    rcx,[rip+0x2d10]        # 11cf816 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d9a>
 11ccb06:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
 11ccb0a:	48 83 a4 24 20 0a 00 	and    QWORD PTR [rsp+0xa20],0x0
 11ccb11:	00 00
 11ccb13:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
 11ccb1a:	00
```
#### xref at `0x11ccb24`

```text
 11ccb1b:	6a 01                	push   0x1
 11ccb1d:	5f                   	pop    rdi
 11ccb1e:	4c 89 f6             	mov    rsi,r14
 11ccb21:	4c 89 fa             	mov    rdx,r15
 11ccb24:	e8 b1 6e 8f ff       	call   ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11ccb29:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
 11ccb2d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 11ccb32:	48 89 84 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],rax
 11ccb39:	00
 11ccb3a:	48 8b 8c 24 30 0a 00 	mov    rcx,QWORD PTR [rsp+0xa30]
 11ccb41:	00
 11ccb42:	4c 8b bc 24 98 00 00 	mov    r15,QWORD PTR [rsp+0x98]
```
#### xref at `0x11ccc4e`

```text
 11ccc3e:	e8 4d d6 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11ccc43:	4c 8d bc 24 60 08 00 	lea    r15,[rsp+0x860]
 11ccc4a:	00
 11ccc4b:	4d 89 37             	mov    QWORD PTR [r15],r14
 11ccc4e:	48 8d 05 85 6d 8f ff 	lea    rax,[rip+0xffffffffff8f6d85]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11ccc55:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
 11ccc59:	48 8d 05 32 2c 00 00 	lea    rax,[rip+0x2c32]        # 11cf892 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e16>
 11ccc60:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 11ccc64:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ccc67:	48 89 df             	mov    rdi,rbx
 11ccc6a:	4c 89 fe             	mov    rsi,r15
 11ccc6d:	ff 50 10             	call   QWORD PTR [rax+0x10]
```
#### xref at `0x11d1f3a`

```text
 11d1f2a:	48 89 c7             	mov    rdi,rax
 11d1f2d:	e8 5e 83 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11d1f32:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
 11d1f37:	4d 89 37             	mov    QWORD PTR [r15],r14
 11d1f3a:	48 8d 05 99 1a 8f ff 	lea    rax,[rip+0xffffffffff8f1a99]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 11d1f41:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
 11d1f45:	48 8d 05 b0 29 00 00 	lea    rax,[rip+0x29b0]        # 11d48fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19e80>
 11d1f4c:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 11d1f50:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11d1f53:	48 89 df             	mov    rdi,rbx
 11d1f56:	89 ee                	mov    esi,ebp
 11d1f58:	4c 89 fa             	mov    rdx,r15
```
#### xref at `0x12ed642`

```text
 12ed62c:	3d 03 9a a4 87       	cmp    eax,0x87a49a03
 12ed631:	0f 84 c2 06 00 00    	je     12edcf9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13327d>
 12ed637:	3d 98 61 13 a0       	cmp    eax,0xa0136198
 12ed63c:	0f 84 38 02 00 00    	je     12ed87a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x132dfe>
 12ed642:	3d 04 da 39 ac       	cmp    eax,0xac39da04
 12ed647:	0f 84 52 0a 00 00    	je     12ee09f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133623>
 12ed64d:	3d fb 7e 62 af       	cmp    eax,0xaf627efb
 12ed652:	0f 84 a1 09 00 00    	je     12edff9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13357d>
 12ed658:	3d 28 08 8c 77       	cmp    eax,0x778c0828
 12ed65d:	0f 84 ee 05 00 00    	je     12edc51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1331d5>
 12ed663:	3d fb 00 27 b4       	cmp    eax,0xb42700fb
 12ed668:	0f 84 ab 03 00 00    	je     12eda19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x132f9d>
```
#### xref at `0x1362d7e`

```text
 1362d6c:	e8 1f 75 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 1362d71:	4c 8d a4 24 c8 04 00 	lea    r12,[rsp+0x4c8]
 1362d78:	00
 1362d79:	4d 89 6c 24 d8       	mov    QWORD PTR [r12-0x28],r13
 1362d7e:	48 8d 05 55 0c 76 ff 	lea    rax,[rip+0xffffffffff760c55]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
 1362d85:	49 89 44 24 e8       	mov    QWORD PTR [r12-0x18],rax
 1362d8a:	48 8d 05 09 03 00 00 	lea    rax,[rip+0x309]        # 136309a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a861e>
 1362d91:	49 89 44 24 f0       	mov    QWORD PTR [r12-0x10],rax
 1362d96:	48 8b 85 90 00 00 00 	mov    rax,QWORD PTR [rbp+0x90]
 1362d9d:	49 89 44 24 f8       	mov    QWORD PTR [r12-0x8],rax
 1362da2:	41 83 64 24 48 00    	and    DWORD PTR [r12+0x48],0x0
 1362da8:	31 c0                	xor    eax,eax
```
... truncated 1 more xrefs ...

### `10adc16` xrefs (2)

#### xref at `0x10ac175`

```text
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
```
#### xref at `0x10adc16`

```text
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
```
## Constructor tracked field events

| addr | origin | mem | kind | instruction |
|---:|---|---|---|---|
| `0x10aba70` | `constructor_this_initial` | `rdi+0x8` | `write` | `10aba70:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0` |
| `0x10aba7b` | `constructor_this_initial` | `rdi` | `write` | `10aba7b:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10aba7e` | `constructor_this_initial` | `rdi+0x10` | `read` | `10aba7e:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0x10aba8a` | `constructor_this_initial` | `rdi+0x18` | `read` | `10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]` |
| `0x10aba93` | `constructor_this_initial` | `rdi+0x40` | `read` | `10aba93:	48 8d 47 40          	lea    rax,[rdi+0x40]` |
| `0x10abaa3` | `constructor_this_initial` | `rbx+0x10` | `write` | `10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0` |
| `0x10abaa7` | `constructor_this_initial` | `rbx+0x20` | `write` | `10abaa7:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0` |
| `0x10abaab` | `constructor_this_initial` | `rbx+0x30` | `write` | `10abaab:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0` |
| `0x10abaaf` | `constructor_this_initial` | `rbx+0x40` | `write` | `10abaaf:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0` |
| `0x10abaed` | `constructor_this_initial` | `rbx+0x78` | `read` | `10abaed:	48 8d 43 78          	lea    rax,[rbx+0x78]` |
| `0x10abafc` | `constructor_this_initial` | `rbx+0x68` | `write` | `10abafc:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0` |
| `0x10abb00` | `constructor_this_initial` | `rbx+0x58` | `write` | `10abb00:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0` |
| `0x10abb04` | `constructor_this_initial` | `rbx+0x78` | `write` | `10abb04:	48 83 63 78 00       	and    QWORD PTR [rbx+0x78],0x0` |
| `0x10ac166` | `stack_wrapper_at_rsp+0x110` | `r13+0x0` | `write` | `10ac166:	4d 89 65 00          	mov    QWORD PTR [r13+0x0],r12` |
| `0x10ac171` | `stack_wrapper_at_rsp+0x110` | `r13+0x10` | `write` | `10ac171:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ac17c` | `stack_wrapper_at_rsp+0x110` | `r13+0x18` | `write` | `10ac17c:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ac187` | `allocated_0x28_at_10ac12c` | `r14` | `write` | `10ac187:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ac1a9` | `addr(constructor_this_initial:rbx+0x78)` | `rax` | `write` | `10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac1c6` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax` | `write` | `10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac1cb` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x8` | `write` | `10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl` |
| `0x10ac1cf` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x38` | `write` | `10ac1cf:	40 88 68 38          	mov    BYTE PTR [rax+0x38],bpl` |
| `0x10ac1d3` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x40` | `write` | `10ac1d3:	40 88 68 40          	mov    BYTE PTR [rax+0x40],bpl` |
| `0x10ac1e2` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x48` | `write` | `10ac1e2:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0` |
| `0x10ac21b` | `allocated_0x28_at_10ac12c` | `r14+0x18` | `read` | `10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl` |
| `0x10ac255` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax` | `write` | `10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac262` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x8` | `write` | `10ac262:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0` |
| `0x10ac266` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x18` | `write` | `10ac266:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0` |
| `0x10ac26a` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x28` | `write` | `10ac26a:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0` |
| `0x10ac26e` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x38` | `write` | `10ac26e:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0` |
| `0x10ac272` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x48` | `write` | `10ac272:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0` |
| `0x10ac276` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x58` | `write` | `10ac276:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0` |
| `0x10ac27a` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x68` | `write` | `10ac27a:	0f 11 40 68          	movups XMMWORD PTR [rax+0x68],xmm0` |
| `0x10ac27e` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x78` | `write` | `10ac27e:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0` |
| `0x10ac289` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x90` | `write` | `10ac289:	48 89 88 90 00 00 00 	mov    QWORD PTR [rax+0x90],rcx` |
| `0x10ac297` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x98` | `write` | `10ac297:	48 89 88 98 00 00 00 	mov    QWORD PTR [rax+0x98],rcx` |
| `0x10ac29e` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0xb0` | `write` | `10ac29e:	48 89 90 b0 00 00 00 	mov    QWORD PTR [rax+0xb0],rdx` |
| `0x10ac2b6` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0xc0` | `write` | `10ac2b6:	48 89 88 c0 00 00 00 	mov    QWORD PTR [rax+0xc0],rcx` |
| `0x10ac2c4` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0xc8` | `write` | `10ac2c4:	48 89 88 c8 00 00 00 	mov    QWORD PTR [rax+0xc8],rcx` |
| `0x10ac2cb` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0xe0` | `write` | `10ac2cb:	48 89 90 e0 00 00 00 	mov    QWORD PTR [rax+0xe0],rdx` |
| `0x10ac2d2` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0xf0` | `write` | `10ac2d2:	0f 29 80 f0 00 00 00 	movaps XMMWORD PTR [rax+0xf0],xmm0` |
| `0x10ac2d9` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x100` | `write` | `10ac2d9:	0f 29 80 00 01 00 00 	movaps XMMWORD PTR [rax+0x100],xmm0` |
| `0x10ac2e0` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x110` | `write` | `10ac2e0:	0f 29 80 10 01 00 00 	movaps XMMWORD PTR [rax+0x110],xmm0` |
| `0x10ac2e7` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x119` | `write` | `10ac2e7:	0f 11 80 19 01 00 00 	movups XMMWORD PTR [rax+0x119],xmm0` |
| `0x10ac2ee` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x130` | `write` | `10ac2ee:	4c 89 a8 30 01 00 00 	mov    QWORD PTR [rax+0x130],r13` |
| `0x10ac2fd` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x138` | `write` | `10ac2fd:	48 89 88 38 01 00 00 	mov    QWORD PTR [rax+0x138],rcx` |
| `0x10ac309` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x140` | `write` | `10ac309:	40 88 a8 40 01 00 00 	mov    BYTE PTR [rax+0x140],bpl` |
| `0x10ac33e` | `allocated_0x28_at_10ac12c` | `r14+0x18` | `read` | `10ac33e:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |

## Calls with tracked args in constructor window

| addr | tracked args / note | instruction |
|---:|---|---|
| `0x10abac1` | `rdi=constructor_this_initial, rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rdi+0x40), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial` | `10abac1:	e8 64 9c ab ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>` |
| `0x10abb1c` | `rdi=constructor_this_initial, rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abb1c:	e8 5d df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abb30` | `rdi=constructor_this_initial, rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abb30:	e8 49 df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abb4b` | `rdi=constructor_this_initial, rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abb4b:	e8 08 b9 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abb66` | `rdi=constructor_this_initial, rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abb66:	e8 25 23 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abb9b` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abb9b:	e8 ee ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abba5` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abba5:	e8 3e fa 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abbb9` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abbb9:	e8 c0 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abbcd` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abbcd:	e8 ac de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abbe8` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abbe8:	e8 6b b8 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abbfc` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abbfc:	e8 8f 22 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abc2e` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abc2e:	e8 5b ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abc38` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abc38:	e8 ab f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abc50` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abc50:	e8 29 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abc64` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abc64:	e8 15 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abc7f` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abc7f:	e8 d4 b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abc93` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abc93:	e8 f8 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abcc5` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abcc5:	e8 c4 b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abccf` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abccf:	e8 14 f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abce7` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abce7:	e8 92 dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abcfb` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abcfb:	e8 7e dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abd16` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abd16:	e8 3d b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abd2a` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abd2a:	e8 61 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abd5c` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abd5c:	e8 2d b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abd66` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abd66:	e8 7d f8 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abd7e` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abd7e:	e8 fb dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abd92` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abd92:	e8 e7 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abdad` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abdad:	e8 a6 b6 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abdc1` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abdc1:	e8 ca 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abdf3` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abdf3:	e8 96 b8 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abdfd` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abdfd:	e8 e6 f7 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abe15` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abe15:	e8 64 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abe29` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abe29:	e8 50 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abe44` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abe44:	e8 0f b6 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abe58` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abe58:	e8 33 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abe8a` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abe8a:	e8 ff b7 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abe94` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abe94:	e8 4f f7 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abeac` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abeac:	e8 cd db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abec0` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abec0:	e8 b9 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abedb` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abedb:	e8 78 b5 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abeef` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abeef:	e8 9c 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abf21` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abf21:	e8 68 b7 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abf2b` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abf2b:	e8 b8 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abf43` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r12=load(bundle30_slot_arg_initial:rbp+0x0), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abf43:	e8 36 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abf57` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r12=load(bundle30_slot_arg_initial:rbp+0x0), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abf57:	e8 22 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abf72` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r12=load(bundle30_slot_arg_initial:rbp+0x0), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abf72:	e8 e1 b4 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abf8b` | `rdi=addr(load(bundle30_slot_arg_initial:rbp+0x0):rsp+r14*1), rcx=bundle30_slot_arg_initial, rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r12=load(bundle30_slot_arg_initial:rbp+0x0), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abf8b:	e8 00 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abfc3` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rdx=bundle30_slot_arg_initial, rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r12=load(bundle30_slot_arg_initial:rbp+0x0), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abfc3:	e8 c6 b6 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abfcd` | `rdi=load(bundle30_slot_arg_initial:rbp+0x0), rdx=bundle30_slot_arg_initial, rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r12=load(bundle30_slot_arg_initial:rbp+0x0), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abfcd:	e8 16 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abff8` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), rdx=bundle30_slot_arg_initial, rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=bundle30_slot_arg_initial, r12=load(bundle30_slot_arg_initial:rbp+0x0), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10abff8:	e8 f5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac028` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), rdx=bundle30_slot_arg_initial, rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(bundle30_slot_arg_initial:rbp+0x0), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10ac028:	e8 c5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac044` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), rdx=bundle30_slot_arg_initial, rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10ac044:	e8 35 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac058` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), rdx=bundle30_slot_arg_initial, rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10ac058:	e8 21 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac073` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), rdx=bundle30_slot_arg_initial, rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10ac073:	e8 e0 b3 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10ac087` | `rdi=addr(load(bundle30_slot_arg_initial:rbp+0x0):rsp+r14*1), rdx=bundle30_slot_arg_initial, rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10ac087:	e8 04 1e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10ac0bd` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10ac0bd:	e8 cc b5 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10ac0c7` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10ac0c7:	e8 1c f5 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10ac0f1` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):rbp+0x0), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10ac0f1:	e8 fc b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac120` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):rbp+0x0), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10ac120:	e8 cd b4 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac12c` | `operator new call; next rax result may be allocation` | `10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac12c` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):rbp+0x0), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac149` | `operator new call; next rax result may be allocation` | `10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac149` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):rbp+0x0), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=allocated_0x28_at_10ac12c` | `10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac159` | `rdi=addr(constructor_this_initial:rbx+0x78), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r14=allocated_0x28_at_10ac12c` | `10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>` |
| `0x10ac194` | `rdi=allocated_0x28_at_10ac12c, rsi=stack_wrapper_at_rsp+0x110, rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=stack_wrapper_at_rsp+0x110, r14=allocated_0x28_at_10ac12c` | `10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>` |
| `0x10ac19c` | `rdi=stack_wrapper_at_rsp+0x110, rsi=stack_wrapper_at_rsp+0x110, rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=stack_wrapper_at_rsp+0x110, r14=allocated_0x28_at_10ac12c` | `10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ac1b4` | `rdi=load(addr(constructor_this_initial:rbx+0x78):rax), rsi=stack_wrapper_at_rsp+0x110, rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=stack_wrapper_at_rsp+0x110, r14=allocated_0x28_at_10ac12c` | `10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac1ba` | `operator new call; next rax result may be allocation` | `10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac1ba` | `rdi=load(addr(constructor_this_initial:rbx+0x78):rax), rsi=stack_wrapper_at_rsp+0x110, rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=stack_wrapper_at_rsp+0x110, r14=allocated_0x28_at_10ac12c` | `10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac216` | `rdi=allocated_0x28_at_10ac12c, rsi=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=allocated_0x28_at_10ac12c` | `10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac230` | `rdi=allocated_0x28_at_10ac12c, rsi=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=allocated_0x28_at_10ac12c` | `10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac23f` | `rdi=allocated_0x28_at_10ac12c, rsi=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=allocated_0x28_at_10ac12c` | `10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac249` | `operator new call; next rax result may be allocation` | `10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac249` | `rdi=allocated_0x28_at_10ac12c, rsi=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=allocated_0x28_at_10ac12c` | `10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac339` | `rdi=allocated_0x28_at_10ac12c, rsi=load(allocated_0x30_at_10ac149:r12), rdx=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=allocated_0x28_at_10ac12c` | `10ac339:	e8 8a b1 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac358` | `rdi=allocated_0x28_at_10ac12c, rsi=load(allocated_0x30_at_10ac149:r12), rdx=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=allocated_0x28_at_10ac12c` | `10ac358:	e8 f2 f4 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac36d` | `rdi=allocated_0x28_at_10ac12c, rsi=load(allocated_0x30_at_10ac149:r12), rdx=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=allocated_0x28_at_10ac12c` | `10ac36d:	e8 be a9 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac37a` | `rdi=allocated_0x28_at_10ac12c, rsi=load(allocated_0x30_at_10ac149:r12), rdx=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(allocated_0x28_at_10ac12c:rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=allocated_0x28_at_10ac12c` | `10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac386` | `rdi=allocated_0x28_at_10ac12c, rsi=load(allocated_0x30_at_10ac149:r12), rdx=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(allocated_0x28_at_10ac12c:rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=load(allocated_0x28_at_10ac12c:rdi)` | `10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac391` | `operator new call; next rax result may be allocation` | `10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac391` | `rdi=allocated_0x28_at_10ac12c, rsi=load(allocated_0x30_at_10ac149:r12), rdx=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(allocated_0x28_at_10ac12c:rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=allocated_0x30_at_10ac149, r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=load(allocated_0x28_at_10ac12c:rdi), r15=load(allocated_0x28_at_10ac12c:rdi)` | `10ac391:	e8 6a 1b 74 00       	call   17edf00 <_Znwm@plt>` |

## Explicit helper / method target windows

### `0xa7a290` — a7a290 helper called on allocated_0x30

```text
  a7a202:	00 00
  a7a204:	48 8d 05 1d 2d d8 00 	lea    rax,[rip+0xd82d1d]        # 17fcf28 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2c48>
  a7a20b:	49 89 07             	mov    QWORD PTR [r15],rax
  a7a20e:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  a7a213:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  a7a217:	4c 89 ff             	mov    rdi,r15
  a7a21a:	48 83 c7 20          	add    rdi,0x20
  a7a21e:	48 89 de             	mov    rsi,rbx
  a7a221:	e8 6a 00 00 00       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  a7a226:	48 89 e7             	mov    rdi,rsp
  a7a229:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  a7a22d:	4d 89 7e 20          	mov    QWORD PTR [r14+0x20],r15
  a7a231:	e8 94 00 00 00       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  a7a236:	48 89 df             	mov    rdi,rbx
  a7a239:	e8 2c fd ff ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  a7a23e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7a245:	00 00
  a7a247:	48 3b 44 24 68       	cmp    rax,QWORD PTR [rsp+0x68]
  a7a24c:	75 3d                	jne    a7a28b <JNI_OnUnload@@Base+0x1b58>
  a7a24e:	4c 89 f0             	mov    rax,r14
  a7a251:	48 83 c4 70          	add    rsp,0x70
  a7a255:	5b                   	pop    rbx
  a7a256:	41 5e                	pop    r14
  a7a258:	41 5f                	pop    r15
  a7a25a:	c3                   	ret
  a7a25b:	49 89 c6             	mov    r14,rax
  a7a25e:	48 89 e7             	mov    rdi,rsp
  a7a261:	e8 64 00 00 00       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  a7a266:	eb 03                	jmp    a7a26b <JNI_OnUnload@@Base+0x1b38>
  a7a268:	49 89 c6             	mov    r14,rax
  a7a26b:	48 89 df             	mov    rdi,rbx
  a7a26e:	e8 f7 fc ff ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  a7a273:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7a27a:	00 00
  a7a27c:	48 3b 44 24 68       	cmp    rax,QWORD PTR [rsp+0x68]
  a7a281:	75 08                	jne    a7a28b <JNI_OnUnload@@Base+0x1b58>
  a7a283:	4c 89 f7             	mov    rdi,r14
  a7a286:	e8 45 5a ff ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a7a28b:	e8 20 58 d7 00       	call   17efab0 <__stack_chk_fail@plt>
  a7a290:	53                   	push   rbx
  a7a291:	48 89 fb             	mov    rbx,rdi
  a7a294:	48 8b 7e 20          	mov    rdi,QWORD PTR [rsi+0x20]
  a7a298:	48 85 ff             	test   rdi,rdi
  a7a29b:	74 11                	je     a7a2ae <JNI_OnUnload@@Base+0x1b7b>
  a7a29d:	48 39 f7             	cmp    rdi,rsi
  a7a2a0:	74 13                	je     a7a2b5 <JNI_OnUnload@@Base+0x1b82>
  a7a2a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a7a2a5:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a7a2a8:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  a7a2ac:	eb 05                	jmp    a7a2b3 <JNI_OnUnload@@Base+0x1b80>
  a7a2ae:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
  a7a2b3:	5b                   	pop    rbx
  a7a2b4:	c3                   	ret
  a7a2b5:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
  a7a2b9:	48 8b 7e 20          	mov    rdi,QWORD PTR [rsi+0x20]
  a7a2bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a7a2c0:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
  a7a2c4:	48 89 de             	mov    rsi,rbx
  a7a2c7:	5b                   	pop    rbx
  a7a2c8:	ff e0                	jmp    rax
  a7a2ca:	48 89 f8             	mov    rax,rdi
  a7a2cd:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  a7a2d0:	48 83 20 00          	and    QWORD PTR [rax],0x0
  a7a2d4:	48 85 ff             	test   rdi,rdi
  a7a2d7:	0f 85 43 3c d7 00    	jne    17edf20 <_ZdlPv@plt>
  a7a2dd:	c3                   	ret
  a7a2de:	48 8d 05 43 2c d8 00 	lea    rax,[rip+0xd82c43]        # 17fcf28 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2c48>
  a7a2e5:	48 89 07             	mov    QWORD PTR [rdi],rax
  a7a2e8:	48 83 c7 20          	add    rdi,0x20
  a7a2ec:	e9 79 fc ff ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  a7a2f1:	cc                   	int3
  a7a2f2:	53                   	push   rbx
  a7a2f3:	48 89 fb             	mov    rbx,rdi
  a7a2f6:	e8 e3 ff ff ff       	call   a7a2de <JNI_OnUnload@@Base+0x1bab>
  a7a2fb:	48 89 df             	mov    rdi,rbx
  a7a2fe:	5b                   	pop    rbx
  a7a2ff:	e9 1c 3c d7 00       	jmp    17edf20 <_ZdlPv@plt>
  a7a304:	41 56                	push   r14
  a7a306:	53                   	push   rbx
  a7a307:	48 83 ec 28          	sub    rsp,0x28
  a7a30b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7a312:	00 00
  a7a314:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  a7a319:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  a7a31d:	6a 50                	push   0x50
  a7a31f:	5f                   	pop    rdi
```
### `0xac39da` — ac39da function stored at stack wrapper +0x10

```text
  ac394e:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
  ac3955:	00
  ac3956:	e8 35 a5 d2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ac395b:	e9 f9 fe ff ff       	jmp    ac3859 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x107f9>
  ac3960:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  ac3964:	e9 08 ff ff ff       	jmp    ac3871 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10811>
  ac3969:	cc                   	int3
  ac396a:	48 8b 05 37 06 f2 00 	mov    rax,QWORD PTR [rip+0xf20637]        # 19e3fa8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x9d8>
  ac3971:	48 85 c0             	test   rax,rax
  ac3974:	74 01                	je     ac3977 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10917>
  ac3976:	c3                   	ret
  ac3977:	50                   	push   rax
  ac3978:	e8 42 66 fb ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  ac397d:	cc                   	int3
  ac397e:	41 56                	push   r14
  ac3980:	53                   	push   rbx
  ac3981:	50                   	push   rax
  ac3982:	49 89 ce             	mov    r14,rcx
  ac3985:	48 89 fb             	mov    rbx,rdi
  ac3988:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
  ac398b:	e8 46 3d d0 00       	call   17c76d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b842>
  ac3990:	48 83 7b 08 00       	cmp    QWORD PTR [rbx+0x8],0x0
  ac3995:	74 06                	je     ac399d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1093d>
  ac3997:	49 83 26 00          	and    QWORD PTR [r14],0x0
  ac399b:	eb 0e                	jmp    ac39ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1094b>
  ac399d:	48 89 df             	mov    rdi,rbx
  ac39a0:	e8 21 23 d1 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
  ac39a5:	0f 57 c0             	xorps  xmm0,xmm0
  ac39a8:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  ac39ab:	48 83 c4 08          	add    rsp,0x8
  ac39af:	5b                   	pop    rbx
  ac39b0:	41 5e                	pop    r14
  ac39b2:	c3                   	ret
  ac39b3:	cc                   	int3
  ac39b4:	53                   	push   rbx
  ac39b5:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  ac39b9:	48 85 c0             	test   rax,rax
  ac39bc:	74 11                	je     ac39cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1096f>
  ac39be:	48 89 fb             	mov    rbx,rdi
  ac39c1:	31 ff                	xor    edi,edi
  ac39c3:	48 89 de             	mov    rsi,rbx
  ac39c6:	31 d2                	xor    edx,edx
  ac39c8:	ff d0                	call   rax
  ac39ca:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  ac39cf:	5b                   	pop    rbx
  ac39d0:	c3                   	ret
  ac39d1:	48 89 c7             	mov    rdi,rax
  ac39d4:	e8 cc 60 fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ac39d9:	cc                   	int3
  ac39da:	83 ff 01             	cmp    edi,0x1
  ac39dd:	74 1e                	je     ac39fd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1099d>
  ac39df:	85 ff                	test   edi,edi
  ac39e1:	75 20                	jne    ac3a03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109a3>
  ac39e3:	53                   	push   rbx
  ac39e4:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
  ac39e7:	48 85 db             	test   rbx,rbx
  ac39ea:	74 08                	je     ac39f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10994>
  ac39ec:	48 89 df             	mov    rdi,rbx
  ac39ef:	e8 76 65 fb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ac39f4:	48 89 df             	mov    rdi,rbx
  ac39f7:	5b                   	pop    rbx
  ac39f8:	e9 23 a5 d2 00       	jmp    17edf20 <_ZdlPv@plt>
  ac39fd:	48 8b 02             	mov    rax,QWORD PTR [rdx]
  ac3a00:	48 89 06             	mov    QWORD PTR [rsi],rax
  ac3a03:	c3                   	ret
  ac3a04:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ac3a07:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
  ac3a0b:	e9 52 6a fb ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  ac3a10:	41 57                	push   r15
  ac3a12:	41 56                	push   r14
  ac3a14:	53                   	push   rbx
  ac3a15:	49 89 fe             	mov    r14,rdi
  ac3a18:	4c 8b 3e             	mov    r15,QWORD PTR [rsi]
  ac3a1b:	6a 38                	push   0x38
  ac3a1d:	5f                   	pop    rdi
  ac3a1e:	e8 dd a4 d2 00       	call   17edf00 <_Znwm@plt>
  ac3a23:	48 89 c3             	mov    rbx,rax
  ac3a26:	48 8d 35 be b8 88 ff 	lea    rsi,[rip+0xffffffffff88b8be]        # 34f2eb <_ZTSSt12bad_any_cast@@Base-0x40edd>
  ac3a2d:	48 89 c7             	mov    rdi,rax
  ac3a30:	e8 9b 01 b2 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>
  ac3a35:	48 8d 05 cc 91 d4 00 	lea    rax,[rip+0xd491cc]        # 180cc08 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x28c8>
  ac3a3c:	48 89 03             	mov    QWORD PTR [rbx],rax
  ac3a3f:	4c 89 7b 20          	mov    QWORD PTR [rbx+0x20],r15
  ac3a43:	48 89 df             	mov    rdi,rbx
  ac3a46:	48 83 c7 28          	add    rdi,0x28
  ac3a4a:	e8 e0 b6 07 00       	call   b3f12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c0cf>
  ac3a4f:	49 89 1e             	mov    QWORD PTR [r14],rbx
  ac3a52:	4c 89 f0             	mov    rax,r14
  ac3a55:	5b                   	pop    rbx
  ac3a56:	41 5e                	pop    r14
  ac3a58:	41 5f                	pop    r15
  ac3a5a:	c3                   	ret
  ac3a5b:	49 89 c6             	mov    r14,rax
  ac3a5e:	48 89 df             	mov    rdi,rbx
  ac3a61:	e8 7e 01 b2 00       	call   15e3be4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429168>
  ac3a66:	48 89 df             	mov    rdi,rbx
  ac3a69:	e8 b2 a4 d2 00       	call   17edf20 <_ZdlPv@plt>
```
### `0x10adc16` — 10adc16 function stored at stack wrapper +0x18

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
```
### `0x10ac12c` — operator new(0x28) callsite

```text
 10ac09d:	48 8d 0d 2c b4 32 ff 	lea    rcx,[rip+0xffffffffff32b42c]        # 3d74d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20b5>
 10ac0a4:	4c 8d 0d ed b5 32 ff 	lea    r9,[rip+0xffffffffff32b5ed]        # 3d7698 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x227d>
 10ac0ab:	6a 11                	push   0x11
 10ac0ad:	41 5e                	pop    r14
 10ac0af:	6a 19                	push   0x19
 10ac0b1:	41 58                	pop    r8
 10ac0b3:	4c 89 e7             	mov    rdi,r12
 10ac0b6:	4c 89 f2             	mov    rdx,r14
 10ac0b9:	41 55                	push   r13
 10ac0bb:	6a 08                	push   0x8
 10ac0bd:	e8 cc b5 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10ac0c2:	58                   	pop    rax
 10ac0c3:	59                   	pop    rcx
 10ac0c4:	4c 89 ef             	mov    rdi,r13
 10ac0c7:	e8 1c f5 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10ac0cc:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10ac0d0:	6a 01                	push   0x1
 10ac0d2:	41 5c                	pop    r12
 10ac0d4:	48 8d 35 d5 b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5d5]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
 10ac0db:	48 8d 0d ee b5 32 ff 	lea    rcx,[rip+0xffffffffff32b5ee]        # 3d76d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22b5>
 10ac0e2:	6a 12                	push   0x12
 10ac0e4:	41 58                	pop    r8
 10ac0e6:	6a 03                	push   0x3
 10ac0e8:	41 59                	pop    r9
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
```
### `0x10ac149` — operator new(0x30) callsite

```text
 10ac0b9:	41 55                	push   r13
 10ac0bb:	6a 08                	push   0x8
 10ac0bd:	e8 cc b5 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10ac0c2:	58                   	pop    rax
 10ac0c3:	59                   	pop    rcx
 10ac0c4:	4c 89 ef             	mov    rdi,r13
 10ac0c7:	e8 1c f5 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10ac0cc:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10ac0d0:	6a 01                	push   0x1
 10ac0d2:	41 5c                	pop    r12
 10ac0d4:	48 8d 35 d5 b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5d5]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
 10ac0db:	48 8d 0d ee b5 32 ff 	lea    rcx,[rip+0xffffffffff32b5ee]        # 3d76d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22b5>
 10ac0e2:	6a 12                	push   0x12
 10ac0e4:	41 58                	pop    r8
 10ac0e6:	6a 03                	push   0x3
 10ac0e8:	41 59                	pop    r9
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
```
### `0x10ac159` — a7a290 callsite

```text
 10ac0cc:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 10ac0d0:	6a 01                	push   0x1
 10ac0d2:	41 5c                	pop    r12
 10ac0d4:	48 8d 35 d5 b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5d5]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
 10ac0db:	48 8d 0d ee b5 32 ff 	lea    rcx,[rip+0xffffffffff32b5ee]        # 3d76d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22b5>
 10ac0e2:	6a 12                	push   0x12
 10ac0e4:	41 58                	pop    r8
 10ac0e6:	6a 03                	push   0x3
 10ac0e8:	41 59                	pop    r9
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
```
### `0x10ac1a9` — this+0x78 target install/write

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
```
### `0x10ac1c6` — inner+0 write

```text
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
```
### `0x10ac255` — later inner+0 write

```text
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
```
## Interpretation checklist / next targets

- If `0x184d898` resolves to AP methods, follow the method that reads/writes the `0x28` object and compare with `b411a4` returned object semantics.
- If `a7a290` initializes the `0x30` object with the saved stack argument from `[rsp+0x10]`, trace that argument back to the factory inputs.
- If writes at `10ac1a9`, `10ac1c6`, or `10ac255` install pointers behind `this+0x78`, trace readers of `this+0x78` and the AP `0x184d898` methods.
- If no direct `this+0x18` write is found, the child accessor may return an embedded subobject whose data dependency is held indirectly via `this+0x78`.
