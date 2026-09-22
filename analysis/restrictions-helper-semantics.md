# Restrictions helper semantics trace

Purpose: continue after constructor-dataflow trace. The constructor `0x10aba36` does not directly store `rcx` into `child+0x18`; instead it repeatedly dereferences the `bundle30_slot` object and calls helper functions. This report inspects the strongest helpers.

## Summary

| helper | refs | writes | calls with tracked args | likely role |
|---|---:|---:|---:|---|
| `15e768e` | 2 | 0 | 4 | forwards tracked dependency to callees |
| `a7b5e8` | 0 | 0 | 1 | forwards tracked dependency to callees |
| `15e75f2` | 2 | 0 | 5 | forwards tracked dependency to callees |

## 15e768e from constructor call 10abfc3

Receives rdi=load(bundle30_slot), rdx=bundle30_slot, r8=load(bundle30_slot).

### Body excerpt
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

### Tracked refs
| addr | resolved | instruction |
|---:|---|---|
| `0x15e76ea` | `slot_obj` | ` 15e76ea:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x15e7708` | `load(slot_obj)+0x90` | ` 15e7708:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]` |

### Tracked writes
No writes to tracked origins in scanned window.

### Calls with tracked args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x15e76b8` | `a9ca1a` | `r15=slot_obj, r8=slot_obj, rdx=bundle30_slot` | ` 15e76b8:	e8 5d 53 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>` |
| `0x15e76c8` | `a9ca1a` | `r15=slot_obj, r8=slot_obj, rdx=slot_obj` | ` 15e76c8:	e8 4d 53 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>` |
| `0x15e76dd` | `a9ca1a` | `r15=slot_obj, r8=slot_obj` | ` 15e76dd:	e8 38 53 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>` |
| `0x15e7708` | `?` | `rdi=slot_obj` | ` 15e7708:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]` |

### Notable synthetic load/alias events
| addr | event | instruction |
|---:|---|---|
| `0x15e76ea` | `rax=load(slot_obj)` | ` 15e76ea:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |

## a7b5e8 after 15e768e at 10abfcd

Immediately follows 15e768e in constructor dataflow; may cleanup/wrap bundle30-derived objects.

### Body excerpt
```text
  a7b5e8:	48 83 ec 18          	sub    rsp,0x18
  a7b5ec:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7b5f3:	00 00
  a7b5f5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  a7b5fa:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
  a7b5ff:	48 89 38             	mov    QWORD PTR [rax],rdi
  a7b602:	48 89 c7             	mov    rdi,rax
  a7b605:	e8 1a 00 00 00       	call   a7b624 <JNI_OnUnload@@Base+0x2ef1>
  a7b60a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7b611:	00 00
  a7b613:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  a7b618:	75 05                	jne    a7b61f <JNI_OnUnload@@Base+0x2eec>
  a7b61a:	48 83 c4 18          	add    rsp,0x18
  a7b61e:	c3                   	ret
```

### Tracked refs
No memory refs to tracked origins in scanned window.

### Tracked writes
No writes to tracked origins in scanned window.

### Calls with tracked args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0xa7b605` | `a7b624` | `r8=slot_obj, rdx=bundle30_slot` | `  a7b605:	e8 1a 00 00 00       	call   a7b624 <JNI_OnUnload@@Base+0x2ef1>` |

### Notable synthetic load/alias events
No notable tracked load/alias events.

## 15e75f2 from constructor calls 10abff8 and 10ac028

Receives rdi=load(load(bundle30_slot)) and r8=load(bundle30_slot), likely method-helper on the resolved slot object.

### Body excerpt
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
```

### Tracked refs
| addr | resolved | instruction |
|---:|---|---|
| `0x15e7639` | `slot_obj_inner` | ` 15e7639:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x15e764f` | `load(slot_obj_inner)+0x98` | ` 15e764f:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]` |

### Tracked writes
No writes to tracked origins in scanned window.

### Calls with tracked args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x15e761c` | `a9ca1a` | `r14=slot_obj_inner, r15=slot_obj, r8=slot_obj, rdx=bundle30_slot` | ` 15e761c:	e8 f9 53 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>` |
| `0x15e762a` | `a9ca1a` | `r14=slot_obj_inner, r15=slot_obj, r8=slot_obj, rdx=slot_obj` | ` 15e762a:	e8 eb 53 4b ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>` |
| `0x15e764f` | `?` | `r14=slot_obj_inner, rdi=slot_obj_inner` | ` 15e764f:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]` |
| `0x15e7658` | `17ede90` | `r14=slot_obj_inner` | ` 15e7658:	e8 33 68 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x15e7660` | `17ede90` | `r14=slot_obj_inner` | ` 15e7660:	e8 2b 68 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |

### Notable synthetic load/alias events
| addr | event | instruction |
|---:|---|---|
| `0x15e7639` | `rax=load(slot_obj_inner)` | ` 15e7639:	49 8b 06             	mov    rax,QWORD PTR [r14]` |

## Interpretation

This trace distinguishes three candidate roles: direct mutation of the `bundle30_slot` object, forwarding of the resolved slot object to deeper helpers, and pure cleanup/reference-management. The next target should be whichever helper first writes a stable object field or forwards the dependency toward the object returned by `b411a4` (`child+0x18`).
