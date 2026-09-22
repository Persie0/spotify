# Restrictions local builder layout trace

Purpose: test whether the `builder+0x18` sink/refill path seen in `165c600` is a real Restrictions readiness sink in the wrapper call path, or a generic slow path for stack-local output/string builders. Previous traces showed the byte-emitter helpers are generic builder-buffer helpers with no direct `child+0x18` hits.

## Executive summary

The output objects passed into the slot AP methods are stack-local objects inside `15e768e` and `15e75f2`. For the first output object in each wrapper, `builder+0x18` resolves to the stack canary slot, not to a stable Restrictions object. For the following output objects, `builder+0x18` overlaps adjacent local output objects. This strongly indicates that the `builder+0x18 -> sink.vtable+0x10` path in `165c600` is a generic conditional slow path for a builder/string representation, not the semantic Restrictions readiness object.

## 15e768e / AP +0x90 wrapper stack-local output layout

Frame allocation: `sub rsp, 0x58`. Stack canary at `[rsp+0x50]`.

| local output object | base | `base+0x8` | `base+0x10` | `base+0x18` | sink-field interpretation |
|---|---:|---:|---:|---:|---|
| `out0 passed as rsi to AP+0x90` | `rsp+0x38` | `rsp+0x40` | `rsp+0x48` | `rsp+0x50` | **overlaps stack canary** |
| `out1 passed as rdx to AP+0x90` | `rsp+0x20` | `rsp+0x28` | `rsp+0x30` | `rsp+0x38` | overlaps `out0 passed as rsi to AP+0x90` base |
| `out2 passed as rcx to AP+0x90` | `rsp+0x8` | `rsp+0x10` | `rsp+0x18` | `rsp+0x20` | overlaps `out1 passed as rdx to AP+0x90` base |

Wrapper callsite: `15e7708 call [slot_obj.vtable+0x90]` with `rdi=slot_obj`, `rsi=rsp+0x38`, `rdx=rsp+0x20`, `rcx=rsp+0x08`.

## 15e75f2 / AP +0x98 wrapper stack-local output layout

Frame allocation: `sub rsp, 0x38`. Stack canary at `[rsp+0x30]`.

| local output object | base | `base+0x8` | `base+0x10` | `base+0x18` | sink-field interpretation |
|---|---:|---:|---:|---:|---|
| `out0 passed as rsi to AP+0x98` | `rsp+0x18` | `rsp+0x20` | `rsp+0x28` | `rsp+0x30` | **overlaps stack canary** |
| `out1 passed as rdx to AP+0x98` | `rsp+0x0` | `rsp+0x8` | `rsp+0x10` | `rsp+0x18` | overlaps `out0 passed as rsi to AP+0x98` base |

Wrapper callsite: `15e764f call [slot_obj.vtable+0x98]` with `rdi=slot_obj`, `rsi=rsp+0x18`, `rdx=rsp`.

## 165c600 sink/refill branch condition

The sink/refill path is guarded by a builder flag/capacity branch. It is reached only after a copy attempt when `[builder+0] != 0` and capacity is insufficient. In the stack-local wrapper layout above, the alleged `builder+0x18` sink location is not a stable object field for the first local output.

```text
 165c600:	41 57                	push   r15
 165c602:	41 56                	push   r14
 165c604:	41 55                	push   r13
 165c606:	41 54                	push   r12
 165c608:	53                   	push   rbx
 165c609:	89 d3                	mov    ebx,edx
 165c60b:	49 89 f4             	mov    r12,rsi
 165c60e:	49 89 fd             	mov    r13,rdi
 165c611:	4c 8d 77 10          	lea    r14,[rdi+0x10]
 165c615:	4c 8d 7f 08          	lea    r15,[rdi+0x8]
 165c619:	41 8b 16             	mov    edx,DWORD PTR [r14]
 165c61c:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
 165c61f:	39 d3                	cmp    ebx,edx
 165c621:	76 3d                	jbe    165c660 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107cc>
 165c623:	4c 89 e6             	mov    rsi,r12
 165c626:	e8 a5 34 19 00       	call   17efad0 <memcpy@plt>
 165c62b:	41 80 7d 00 00       	cmp    BYTE PTR [r13+0x0],0x0
 165c630:	74 41                	je     165c673 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107df>
 165c632:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
 165c636:	49 01 c4             	add    r12,rax
 165c639:	29 c3                	sub    ebx,eax
 165c63b:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
 165c63f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 165c642:	4c 89 fe             	mov    rsi,r15
 165c645:	4c 89 f2             	mov    rdx,r14
 165c648:	ff 50 10             	call   QWORD PTR [rax+0x10]
 165c64b:	84 c0                	test   al,al
 165c64d:	75 ca                	jne    165c619 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10785>
 165c64f:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
 165c654:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0
 165c659:	41 c6 45 00 00       	mov    BYTE PTR [r13+0x0],0x0
 165c65e:	eb 13                	jmp    165c673 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x107df>
 165c660:	89 da                	mov    edx,ebx
 165c662:	4c 89 e6             	mov    rsi,r12
 165c665:	e8 66 34 19 00       	call   17efad0 <memcpy@plt>
 165c66a:	48 63 c3             	movsxd rax,ebx
 165c66d:	49 01 07             	add    QWORD PTR [r15],rax
 165c670:	41 29 1e             	sub    DWORD PTR [r14],ebx
 165c673:	5b                   	pop    rbx
 165c674:	41 5c                	pop    r12
 165c676:	41 5d                	pop    r13
 165c678:	41 5e                	pop    r14
 165c67a:	41 5f                	pop    r15
 165c67c:	c3                   	ret
 165c67d:	cc                   	int3
```
## 15e768e wrapper excerpt

```text
 15e768e:	41 57                	push   r15
 15e7690:	41 56                	push   r14
 15e7692:	41 54                	push   r12
 15e7694:	53                   	push   rbx
 15e7695:	48 83 ec 58          	sub    rsp,0x58
 15e7699:	4d 89 ce             	mov    r14,r9
 15e769c:	4d 89 c7             	mov    r15,r8
 15e769f:	49 89 cc             	mov    r12,rcx
 15e76a2:	48 89 fb             	mov    rbx,rdi
 15e76a5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15e76ac:	00 00
 15e76ae:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 15e76b3:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 15e76b8:	e8 5d 53 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 15e76bd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 15e76c2:	4c 89 e6             	mov    rsi,r12
 15e76c5:	4c 89 fa             	mov    rdx,r15
 15e76c8:	e8 4d 53 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 15e76cd:	48 8b 94 24 80 00 00 	mov    rdx,QWORD PTR [rsp+0x80]
 15e76d4:	00
 15e76d5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 15e76da:	4c 89 f6             	mov    rsi,r14
 15e76dd:	e8 38 53 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 15e76e2:	4c 8b 84 24 88 00 00 	mov    r8,QWORD PTR [rsp+0x88]
 15e76e9:	00
 15e76ea:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 15e76ed:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
 15e76f2:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 15e76f7:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
 15e76fc:	48 89 df             	mov    rdi,rbx
 15e76ff:	4c 89 f6             	mov    rsi,r14
 15e7702:	4c 89 fa             	mov    rdx,r15
 15e7705:	4c 89 e1             	mov    rcx,r12
 15e7708:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
 15e770e:	4c 89 e7             	mov    rdi,r12
 15e7711:	e8 7a 67 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15e7716:	4c 89 ff             	mov    rdi,r15
 15e7719:	e8 72 67 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15e771e:	4c 89 f7             	mov    rdi,r14
 15e7721:	e8 6a 67 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15e7726:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15e772d:	00 00
 15e772f:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
 15e7734:	75 0c                	jne    15e7742 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ccc6>
 15e7736:	48 83 c4 58          	add    rsp,0x58
 15e773a:	5b                   	pop    rbx
 15e773b:	41 5c                	pop    r12
 15e773d:	41 5e                	pop    r14
 15e773f:	41 5f                	pop    r15
 15e7741:	c3                   	ret
```
## 15e75f2 wrapper excerpt

```text
 15e75f2:	41 57                	push   r15
 15e75f4:	41 56                	push   r14
 15e75f6:	41 54                	push   r12
 15e75f8:	53                   	push   rbx
 15e75f9:	48 83 ec 38          	sub    rsp,0x38
 15e75fd:	44 89 cb             	mov    ebx,r9d
 15e7600:	4d 89 c7             	mov    r15,r8
 15e7603:	49 89 cc             	mov    r12,rcx
 15e7606:	49 89 fe             	mov    r14,rdi
 15e7609:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15e7610:	00 00
 15e7612:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 15e7617:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15e761c:	e8 f9 53 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 15e7621:	48 89 e7             	mov    rdi,rsp
 15e7624:	4c 89 e6             	mov    rsi,r12
 15e7627:	4c 89 fa             	mov    rdx,r15
 15e762a:	e8 eb 53 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
 15e762f:	44 8b 4c 24 68       	mov    r9d,DWORD PTR [rsp+0x68]
 15e7634:	44 8b 44 24 60       	mov    r8d,DWORD PTR [rsp+0x60]
 15e7639:	49 8b 06             	mov    rax,QWORD PTR [r14]
 15e763c:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
 15e7641:	49 89 e4             	mov    r12,rsp
 15e7644:	4c 89 f7             	mov    rdi,r14
 15e7647:	4c 89 fe             	mov    rsi,r15
 15e764a:	4c 89 e2             	mov    rdx,r12
 15e764d:	89 d9                	mov    ecx,ebx
 15e764f:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
 15e7655:	4c 89 e7             	mov    rdi,r12
 15e7658:	e8 33 68 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15e765d:	4c 89 ff             	mov    rdi,r15
 15e7660:	e8 2b 68 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 15e7665:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15e766c:	00 00
 15e766e:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 15e7673:	75 0c                	jne    15e7681 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc05>
 15e7675:	48 83 c4 38          	add    rsp,0x38
 15e7679:	5b                   	pop    rbx
 15e767a:	41 5c                	pop    r12
 15e767c:	41 5e                	pop    r14
 15e767e:	41 5f                	pop    r15
 15e7680:	c3                   	ret
 15e7681:	e8 2a 84 20 00       	call   17efab0 <__stack_chk_fail@plt>
```
## Constructor tail around wrapper calls

```text
 10abf80:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10abf84:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abf8b:	e8 00 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abf90:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10abf94:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10abf98:	75 e6                	jne    10abf80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273396>
 10abf9a:	48 8d 35 ef b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5ef]        # 3d7590 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2175>
 10abfa1:	48 8d 0d 08 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b608]        # 3d75b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2195>
 10abfa8:	4c 8d 0d e0 b6 32 ff 	lea    r9,[rip+0xffffffffff32b6e0]        # 3d768f <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2274>
 10abfaf:	6a 11                	push   0x11
 10abfb1:	5d                   	pop    rbp
 10abfb2:	6a 18                	push   0x18
 10abfb4:	41 5e                	pop    r14
 10abfb6:	4c 89 e7             	mov    rdi,r12
 10abfb9:	48 89 ea             	mov    rdx,rbp
 10abfbc:	4d 89 f0             	mov    r8,r14
 10abfbf:	41 55                	push   r13
 10abfc1:	6a 08                	push   0x8
 10abfc3:	e8 c6 b6 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abfc8:	58                   	pop    rax
 10abfc9:	59                   	pop    rcx
 10abfca:	4c 89 ef             	mov    rdi,r13
 10abfcd:	e8 16 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abfd2:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10abfd7:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10abfdb:	48 8d 35 3e b8 32 ff 	lea    rsi,[rip+0xffffffffff32b83e]        # 3d7820 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2405>
 10abfe2:	48 8d 0d 49 b8 32 ff 	lea    rcx,[rip+0xffffffffff32b849]        # 3d7832 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2417>
 10abfe9:	6a 0a                	push   0xa
 10abfeb:	41 58                	pop    r8
 10abfed:	6a 06                	push   0x6
 10abfef:	41 59                	pop    r9
 10abff1:	48 89 ea             	mov    rdx,rbp
 10abff4:	6a 06                	push   0x6
 10abff6:	6a 01                	push   0x1
 10abff8:	e8 f5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10abffd:	48 83 c4 10          	add    rsp,0x10
 10ac001:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac005:	48 8d 35 34 b8 32 ff 	lea    rsi,[rip+0xffffffffff32b834]        # 3d7840 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2425>
 10ac00c:	48 8d 0d 4d b8 32 ff 	lea    rcx,[rip+0xffffffffff32b84d]        # 3d7860 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2445>
 10ac013:	6a 17                	push   0x17
 10ac015:	41 58                	pop    r8
 10ac017:	6a 3c                	push   0x3c
 10ac019:	41 59                	pop    r9
 10ac01b:	48 89 ea             	mov    rdx,rbp
 10ac01e:	4c 89 e5             	mov    rbp,r12
 10ac021:	68 a0 05 00 00       	push   0x5a0
 10ac026:	6a 3c                	push   0x3c
 10ac028:	e8 c5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 10ac02d:	48 83 c4 10          	add    rsp,0x10
 10ac031:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
 10ac035:	48 8d 35 d4 b3 32 ff 	lea    rsi,[rip+0xffffffffff32b3d4]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10ac03c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ac043:	00
 10ac044:	e8 35 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac049:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10ac050:	00
 10ac051:	48 8d 35 53 c8 32 ff 	lea    rsi,[rip+0xffffffffff32c853]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10ac058:	e8 21 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10ac05d:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]
 10ac064:	00
 10ac065:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10ac06c:	00
 10ac06d:	6a 02                	push   0x2
 10ac06f:	5a                   	pop    rdx
 10ac070:	4c 89 ef             	mov    rdi,r13
 10ac073:	e8 e0 b3 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10ac078:	6a 18                	push   0x18
 10ac07a:	41 5e                	pop    r14
 10ac07c:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
```
## Interpretation

- The `builder+0x18` slow path should no longer be treated as the next semantic Restrictions object without proof of an initialized sink object in this exact call path.
- The AP methods `0x165dd40` and `0x153d0d0` appear to materialize textual/buffer outputs into stack-local output objects passed by the wrapper helpers.
- The semantic bridge likely sits after these wrapper calls inside `0x10aba36`, where their output strings/buffers are consumed, copied, or wrapped into the child object state.
- Next concrete target: trace uses of the stack-local outputs after `15e768e`, `a7b5e8`, and `15e75f2` return in `0x10aba36`, rather than following generic buffer slow paths further.
