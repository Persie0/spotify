# Restrictions vtable +0x30 method summary

Target: `0x153cbfc..0x153cd4e`, resolved from vptr AP `0x187e3c8 + 0x30`.

Initial ABI at `1661095`:
```text
rdi = bundle_base = rsp+0x2e0
rsi = local descriptor at rsp+0x20 inside 166103c
descriptor+0x8 = post_add2a_obj = rsp+0x230
```

## Body
```text
     153cbfc:	55                   	push   rbp
     153cbfd:	41 57                	push   r15
     153cbff:	41 56                	push   r14
     153cc01:	41 55                	push   r13
     153cc03:	41 54                	push   r12
     153cc05:	53                   	push   rbx
     153cc06:	48 83 ec 28          	sub    rsp,0x28
     153cc0a:	48 89 f3             	mov    rbx,rsi
     153cc0d:	49 89 fe             	mov    r14,rdi
     153cc10:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     153cc17:	00 00 
     153cc19:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     153cc1e:	48 8d 57 10          	lea    rdx,[rdi+0x10]
     153cc22:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     153cc27:	48 89 df             	mov    rdi,rbx
     153cc2a:	e8 3b 32 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>
     153cc2f:	4d 8d be 90 00 00 00 	lea    r15,[r14+0x90]
     153cc36:	49 8d 46 58          	lea    rax,[r14+0x58]
     153cc3a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     153cc3f:	4d 8d 6e 50          	lea    r13,[r14+0x50]
     153cc43:	49 8d 6e 18          	lea    rbp,[r14+0x18]
     153cc47:	4c 8d 25 16 c2 e5 fe 	lea    r12,[rip+0xfffffffffee5c216]        # 398e64 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x5a45>
     153cc4e:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]
     153cc51:	85 c9                	test   ecx,ecx
     153cc53:	0f 84 b0 00 00 00    	je     153cd09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38228d>
     153cc59:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
     153cc5d:	0f b6 02             	movzx  eax,BYTE PTR [rdx]
     153cc60:	84 c0                	test   al,al
     153cc62:	0f 88 a1 00 00 00    	js     153cd09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38228d>
     153cc68:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax
     153cc6b:	48 ff c2             	inc    rdx
     153cc6e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
     153cc72:	ff c9                	dec    ecx
     153cc74:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx
     153cc77:	c1 e8 03             	shr    eax,0x3
     153cc7a:	83 f8 04             	cmp    eax,0x4
     153cc7d:	77 7d                	ja     153ccfc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382280>
     153cc7f:	49 63 04 84          	movsxd rax,DWORD PTR [r12+rax*4]
     153cc83:	4c 01 e0             	add    rax,r12
     153cc86:	ff e0                	jmp    rax
     153cc88:	48 89 df             	mov    rdi,rbx
     153cc8b:	e8 da 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>
     153cc90:	84 c0                	test   al,al
     153cc92:	74 ba                	je     153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cc94:	48 89 ef             	mov    rdi,rbp
     153cc97:	e8 02 ae fc ff       	call   1507a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d022>
     153cc9c:	48 89 c7             	mov    rdi,rax
     153cc9f:	48 89 de             	mov    rsi,rbx
     153cca2:	e8 fd 05 00 00       	call   153d2a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382828>
     153cca7:	eb a5                	jmp    153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cca9:	48 89 df             	mov    rdi,rbx
     153ccac:	e8 b9 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>
     153ccb1:	84 c0                	test   al,al
     153ccb3:	74 99                	je     153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153ccb5:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     153ccba:	e8 61 ae fc ff       	call   1507b20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d0a4>
     153ccbf:	48 89 c7             	mov    rdi,rax
     153ccc2:	48 89 de             	mov    rsi,rbx
     153ccc5:	e8 06 04 00 00       	call   153d0d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382654>
     153ccca:	eb 82                	jmp    153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cccc:	48 89 df             	mov    rdi,rbx
     153cccf:	4c 89 fe             	mov    rsi,r15
     153ccd2:	e8 5b 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>
     153ccd7:	0f b6 c0             	movzx  eax,al
     153ccda:	01 c0                	add    eax,eax
     153ccdc:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax
     153cce0:	e9 69 ff ff ff       	jmp    153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cce5:	48 89 df             	mov    rdi,rbx
     153cce8:	4c 89 ee             	mov    rsi,r13
     153cceb:	e8 42 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>
     153ccf0:	0f b6 c0             	movzx  eax,al
     153ccf3:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax
     153ccf7:	e9 52 ff ff ff       	jmp    153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153ccfc:	48 89 df             	mov    rdi,rbx
     153ccff:	e8 42 36 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>
     153cd04:	e9 45 ff ff ff       	jmp    153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cd09:	48 89 df             	mov    rdi,rbx
     153cd0c:	e8 15 32 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>
     153cd11:	e9 61 ff ff ff       	jmp    153cc77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821fb>
     153cd16:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     153cd1b:	48 89 df             	mov    rdi,rbx
     153cd1e:	e8 8d 32 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>
     153cd23:	80 3b 00             	cmp    BYTE PTR [rbx],0x0
     153cd26:	0f 95 c0             	setne  al
     153cd29:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     153cd30:	00 00 
     153cd32:	48 3b 4c 24 20       	cmp    rcx,QWORD PTR [rsp+0x20]
     153cd37:	75 0f                	jne    153cd48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3822cc>
     153cd39:	48 83 c4 28          	add    rsp,0x28
     153cd3d:	5b                   	pop    rbx
     153cd3e:	41 5c                	pop    r12
     153cd40:	41 5d                	pop    r13
     153cd42:	41 5e                	pop    r14
     153cd44:	41 5f                	pop    r15
     153cd46:	5d                   	pop    rbp
     153cd47:	c3                   	ret
     153cd48:	e8 63 2d 2b 00       	call   17efab0 <__stack_chk_fail@plt>
     153cd4d:	cc                   	int3
```

## Bundle/descriptor memory refs
| addr | classified location | instruction |
|---|---|---|
| `0x153cc1e` | `bundle+10` | `153cc1e:	48 8d 57 10          	lea    rdx,[rdi+0x10]` |
| `0x153cc2f` | `bundle+90` | `153cc2f:	4d 8d be 90 00 00 00 	lea    r15,[r14+0x90]` |
| `0x153cc36` | `bundle+58` | `153cc36:	49 8d 46 58          	lea    rax,[r14+0x58]` |
| `0x153cc3f` | `bundle+50` | `153cc3f:	4d 8d 6e 50          	lea    r13,[r14+0x50]` |
| `0x153cc43` | `bundle+18` | `153cc43:	49 8d 6e 18          	lea    rbp,[r14+0x18]` |
| `0x153cc4e` | `descriptor+18` | `153cc4e:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]` |
| `0x153cc59` | `descriptor+10` | `153cc59:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]` |
| `0x153cc5d` | `load(descriptor+10)` | `153cc5d:	0f b6 02             	movzx  eax,BYTE PTR [rdx]` |
| `0x153cc68` | `descriptor+38` | `153cc68:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153cc6e` | `descriptor+10` | `153cc6e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153cc74` | `descriptor+18` | `153cc74:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x153ccdc` | `bundle+8` | `153ccdc:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153ccf3` | `bundle+8` | `153ccf3:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153cd23` | `descriptor` | `153cd23:	80 3b 00             	cmp    BYTE PTR [rbx],0x0` |

## Writes / indirect calls through classified aliases
| addr | classified location | instruction |
|---|---|---|
| `0x153cc68` | `descriptor+38` | `153cc68:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153cc6e` | `descriptor+10` | `153cc6e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153cc74` | `descriptor+18` | `153cc74:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x153ccdc` | `bundle+8` | `153ccdc:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153ccf3` | `bundle+8` | `153ccf3:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |

## Calls with tracked args
| call | tracked args | instruction |
|---|---|---|
| `0x153cc2a` | `rdi=descriptor, rdx=bundle+10, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `153cc2a:	e8 3b 32 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |
| `0x153cc8b` | `rdi=descriptor, r8=arg:r8, r9=arg:r9` | `153cc8b:	e8 da 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>` |
| `0x153cc97` | `rdi=bundle+18, r8=arg:r8, r9=arg:r9` | `153cc97:	e8 02 ae fc ff       	call   1507a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d022>` |
| `0x153cca2` | `rsi=descriptor, r8=arg:r8, r9=arg:r9` | `153cca2:	e8 fd 05 00 00       	call   153d2a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382828>` |
| `0x153ccac` | `rdi=descriptor, rsi=descriptor, r8=arg:r8, r9=arg:r9` | `153ccac:	e8 b9 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>` |
| `0x153ccba` | `rsi=descriptor, r8=arg:r8, r9=arg:r9` | `153ccba:	e8 61 ae fc ff       	call   1507b20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d0a4>` |
| `0x153ccc5` | `rsi=descriptor, r8=arg:r8, r9=arg:r9` | `153ccc5:	e8 06 04 00 00       	call   153d0d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382654>` |
| `0x153ccd2` | `rdi=descriptor, rsi=bundle+90, r8=arg:r8, r9=arg:r9` | `153ccd2:	e8 5b 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x153cceb` | `rdi=descriptor, rsi=bundle+50, r8=arg:r8, r9=arg:r9` | `153cceb:	e8 42 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x153ccff` | `rdi=descriptor, rsi=bundle+50, r8=arg:r8, r9=arg:r9` | `153ccff:	e8 42 36 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153cd0c` | `rdi=descriptor, rsi=bundle+50, r8=arg:r8, r9=arg:r9` | `153cd0c:	e8 15 32 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>` |
| `0x153cd1e` | `rdi=descriptor, r8=arg:r8, r9=arg:r9` | `153cd1e:	e8 8d 32 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>` |
| `0x153cd48` | `rdi=descriptor, r8=arg:r8, r9=arg:r9` | `153cd48:	e8 63 2d 2b 00       	call   17efab0 <__stack_chk_fail@plt>` |

## Key interpretation
- No direct `bundle+0x30` memory access appears inside this method body.
- The method mainly consumes the descriptor and mutates bundle substructures via aliases such as `bundle+0x18`, `bundle+0x50`, `bundle+0x58`, and `bundle+0x90`.
- The field later read by `RestrictionsSetupImpl` as `rdx+0x30` may therefore be pre-existing bundle storage, not written in this `+0x30` method, unless one of the called helpers writes it indirectly.
