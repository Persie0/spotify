# Restrictions constructor dataflow trace

Purpose: follow `0x10aba36` with symbolic origins: `rdi=child`, `rcx=bundle30_slot`, stack aliases, and calls using either the dependency or `child+0x18`.

## Key child field writes

| addr | resolved location | instruction |
|---:|---|---|
| `0x10aba70` | `child+0x8` | ` 10aba70:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0` |
| `0x10aba7b` | `child` | ` 10aba7b:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10abaa3` | `child+0x10` | ` 10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0` |
| `0x10abaa7` | `child+0x20` | ` 10abaa7:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0` |
| `0x10abaab` | `child+0x30` | ` 10abaab:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0` |
| `0x10abaaf` | `child+0x40` | ` 10abaaf:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0` |
| `0x10abafc` | `child+0x68` | ` 10abafc:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0` |
| `0x10abb00` | `child+0x58` | ` 10abb00:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0` |
| `0x10abb04` | `child+0x78` | ` 10abb04:	48 83 63 78 00       	and    QWORD PTR [rbx+0x78],0x0` |
| `0x10ac187` | `child+0x78` | ` 10ac187:	49 89 06             	mov    QWORD PTR [r14],rax` |

## Calls that receive the resolved bundle30 dependency

| call | tracked args | instruction |
|---:|---|---|
| `0x10abac1` | `rdi=child, rsi=arg_rsi, rdx=arg_rdx, rcx=bundle30_slot, r8=arg_r8, r9=arg_r9` | ` 10abac1:	e8 64 9c ab ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>` |
| `0x10abb1c` | `rdx=arg_rdx, rcx=bundle30_slot, r8=arg_r8, r9=arg_r9` | ` 10abb1c:	e8 5d df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abb30` | `rdx=arg_rdx, rcx=bundle30_slot, r8=arg_r8, r9=arg_r9` | ` 10abb30:	e8 49 df 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10abb4b` | `rdx=arg_rdx, rcx=bundle30_slot, r8=arg_r8, r9=arg_r9` | ` 10abb4b:	e8 08 b9 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10abb66` | `rdx=arg_rdx, rcx=bundle30_slot, r8=arg_r8, r9=arg_r9` | ` 10abb66:	e8 25 23 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10abfc3` | `rdi=load(bundle30_slot), rdx=bundle30_slot, r8=load(bundle30_slot)` | ` 10abfc3:	e8 c6 b6 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>` |
| `0x10abfcd` | `rdx=bundle30_slot, r8=load(bundle30_slot)` | ` 10abfcd:	e8 16 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10abff8` | `rdi=load(load(bundle30_slot)), rdx=bundle30_slot, r8=load(bundle30_slot)` | ` 10abff8:	e8 f5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac028` | `rdi=load(load(bundle30_slot)), rdx=bundle30_slot, r8=load(bundle30_slot)` | ` 10ac028:	e8 c5 b5 53 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>` |
| `0x10ac044` | `rdx=bundle30_slot, r8=load(bundle30_slot)` | ` 10ac044:	e8 35 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac058` | `rdx=bundle30_slot, r8=load(bundle30_slot)` | ` 10ac058:	e8 21 da 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10ac073` | `rdx=bundle30_slot, r8=load(bundle30_slot)` | ` 10ac073:	e8 e0 b3 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10ac087` | `rdx=bundle30_slot, r8=load(bundle30_slot)` | ` 10ac087:	e8 04 1e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |

## Calls that receive child+0x18

| call | tracked args | instruction |
|---:|---|---|

## Direct refs involving bundle30 dependency

```text
0x10abb09 bundle30_slot:  10abb09:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
0x10abbaa bundle30_slot:  10abbaa:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
0x10abc3d bundle30_slot:  10abc3d:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
0x10abcd4 bundle30_slot:  10abcd4:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
0x10abd6b bundle30_slot:  10abd6b:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
0x10abe02 bundle30_slot:  10abe02:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
0x10abe99 bundle30_slot:  10abe99:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
0x10abf30 bundle30_slot:  10abf30:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]
0x10abfd2 bundle30_slot:  10abfd2:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
0x10ac1ee bundle30_slot:  10ac1ee:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
0x10ac310 bundle30_slot:  10ac310:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
0x10ac817 bundle30_slot:  10ac817:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
```

## Interpretation

If the dependency is passed to a helper rather than directly stored to `child+0x18`, the child accessor `b411a4` still tells us the eventual exported field is `child+0x18`; the helper receiving both the dependency and `child+0x18` is the next semantic target.
