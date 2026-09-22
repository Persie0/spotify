# Restrictions other bundle vtable methods

Purpose: inspect the remaining methods in bundle AP `0x187e3c8` for direct or indirect `bundle+0x30` writes/passes after `+0x30` did not close the source.

Initial ABI assumption for each method: `rdi = bundle_base`.

## Summary table

| vtable offset | target | insns | refs | writes | exact bundle+0x30 writes | bundle+0x30 passes | calls |
|---:|---:|---:|---:|---:|---:|---:|---:|
| `+0x0` | `0x153cada` | `54` | `12` | `1` | `0` | `1` | `2` |
| `+0x8` | `0x153cb74` | `6` | `0` | `0` | `0` | `0` | `1` |
| `+0x10` | `0x153cb86` | `134` | `27` | `10` | `0` | `0` | `12` |
| `+0x20` | `0x165d0fa` | `240` | `3` | `0` | `0` | `0` | `25` |
| `+0x28` | `0x165dd40` | `240` | `1` | `0` | `0` | `0` | `23` |
| `+0x38` | `0x153cd4e` | `60` | `10` | `0` | `0` | `0` | `4` |
| `+0x40` | `0x153cdf2` | `63` | `11` | `0` | `0` | `0` | `5` |
| `+0x48` | `0x153cea8` | `2` | `0` | `0` | `0` | `0` | `0` |
| `+0x50` | `0x153ceb0` | `238` | `45` | `13` | `0` | `1` | `13` |

## Details

### Vtable `+0x0` target `0x153cada` — method at AP+0x0

- scanned instructions: `54`
- bundle-relative refs: `12`
- bundle-relative writes: `1`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` passes/aliases: `1`
- calls: `2`

#### Entry excerpt
```text
 153cada:	55                   	push   rbp
 153cadb:	53                   	push   rbx
 153cadc:	50                   	push   rax
 153cadd:	48 89 fb             	mov    rbx,rdi
 153cae0:	48 8d 05 e1 18 34 00 	lea    rax,[rip+0x3418e1]        # 187e3c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3aab0>
 153cae7:	48 89 07             	mov    QWORD PTR [rdi],rax
 153caea:	8b 4f 68             	mov    ecx,DWORD PTR [rdi+0x68]
 153caed:	48 8b 7f 58          	mov    rdi,QWORD PTR [rdi+0x58]
 153caf1:	85 c9                	test   ecx,ecx
 153caf3:	74 23                	je     153cb18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38209c>
 153caf5:	31 ed                	xor    ebp,ebp
 153caf7:	89 e8                	mov    eax,ebp
 153caf9:	48 8b 04 c7          	mov    rax,QWORD PTR [rdi+rax*8]
 153cafd:	48 85 c0             	test   rax,rax
 153cb00:	74 10                	je     153cb12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382096>
 153cb02:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 153cb05:	48 89 c7             	mov    rdi,rax
 153cb08:	ff 51 08             	call   QWORD PTR [rcx+0x8]
 153cb0b:	8b 4b 68             	mov    ecx,DWORD PTR [rbx+0x68]
 153cb0e:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
 153cb12:	ff c5                	inc    ebp
 153cb14:	39 cd                	cmp    ebp,ecx
 153cb16:	75 df                	jne    153caf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38207b>
 153cb18:	48 8d 43 70          	lea    rax,[rbx+0x70]
 153cb1c:	48 39 c7             	cmp    rdi,rax
 153cb1f:	74 05                	je     153cb26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3820aa>
 153cb21:	e8 3a 1c 2b 00       	call   17ee760 <free@plt>
 153cb26:	8b 4b 28             	mov    ecx,DWORD PTR [rbx+0x28]
 153cb29:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 153cb2d:	85 c9                	test   ecx,ecx
 153cb2f:	74 23                	je     153cb54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3820d8>
 153cb31:	31 ed                	xor    ebp,ebp
 153cb33:	89 e8                	mov    eax,ebp
 153cb35:	48 8b 04 c7          	mov    rax,QWORD PTR [rdi+rax*8]
 153cb39:	48 85 c0             	test   rax,rax
 153cb3c:	74 10                	je     153cb4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3820d2>
 153cb3e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 153cb41:	48 89 c7             	mov    rdi,rax
 153cb44:	ff 51 08             	call   QWORD PTR [rcx+0x8]
 153cb47:	8b 4b 28             	mov    ecx,DWORD PTR [rbx+0x28]
 153cb4a:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 153cb4e:	ff c5                	inc    ebp
 153cb50:	39 cd                	cmp    ebp,ecx
 153cb52:	75 df                	jne    153cb33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3820b7>
 153cb54:	48 8d 43 30          	lea    rax,[rbx+0x30]
 153cb58:	48 39 c7             	cmp    rdi,rax
 153cb5b:	74 05                	je     153cb62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3820e6>
 153cb5d:	e8 fe 1b 2b 00       	call   17ee760 <free@plt>
 153cb62:	48 83 c3 10          	add    rbx,0x10
 153cb66:	48 89 df             	mov    rdi,rbx
 153cb69:	48 83 c4 08          	add    rsp,0x8
 153cb6d:	5b                   	pop    rbx
 153cb6e:	5d                   	pop    rbp
 153cb6f:	e9 0e 47 12 00       	jmp    1661282 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x153ee>
```

#### Bundle-relative writes
| addr | resolved offset | instruction |
|---:|---:|---|
| `0x153cae7` | `0x0` | `153cae7:	48 89 07             	mov    QWORD PTR [rdi],rax` |

#### Exact `bundle+0x30` aliases/passes
- `0x153cb54` lea-alias: `153cb54:	48 8d 43 30          	lea    rax,[rbx+0x30]`

#### Calls with tracked bundle args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x153cb21` | `0x17ee760` | `rdi=bundle+0x0` | `153cb21:	e8 3a 1c 2b 00       	call   17ee760 <free@plt>` |
| `0x153cb5d` | `0x17ee760` | `rdi=bundle+0x70` | `153cb5d:	e8 fe 1b 2b 00       	call   17ee760 <free@plt>` |

### Vtable `+0x8` target `0x153cb74` — method at AP+0x8

- scanned instructions: `6`
- bundle-relative refs: `0`
- bundle-relative writes: `0`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` passes/aliases: `0`
- calls: `1`

#### Entry excerpt
```text
 153cb74:	53                   	push   rbx
 153cb75:	48 89 fb             	mov    rbx,rdi
 153cb78:	e8 5d ff ff ff       	call   153cada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38205e>
 153cb7d:	48 89 df             	mov    rdi,rbx
 153cb80:	5b                   	pop    rbx
 153cb81:	e9 9a 13 2b 00       	jmp    17edf20 <_ZdlPv@plt>
```

#### Calls with tracked bundle args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x153cb78` | `0x153cada` | `rdi=bundle+0x0` | `153cb78:	e8 5d ff ff ff       	call   153cada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38205e>` |

### Vtable `+0x10` target `0x153cb86` — method reached before +0x30

- scanned instructions: `134`
- bundle-relative refs: `27`
- bundle-relative writes: `10`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` passes/aliases: `0`
- calls: `12`

#### Entry excerpt
```text
 153cb86:	41 56                	push   r14
 153cb88:	53                   	push   rbx
 153cb89:	50                   	push   rax
 153cb8a:	48 89 fb             	mov    rbx,rdi
 153cb8d:	83 67 50 00          	and    DWORD PTR [rdi+0x50],0x0
 153cb91:	83 a7 90 00 00 00 00 	and    DWORD PTR [rdi+0x90],0x0
 153cb98:	31 c0                	xor    eax,eax
 153cb9a:	39 47 20             	cmp    DWORD PTR [rdi+0x20],eax
 153cb9d:	74 20                	je     153cbbf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382143>
 153cb9f:	45 31 f6             	xor    r14d,r14d
 153cba2:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
 153cba6:	4a 8b 3c f0          	mov    rdi,QWORD PTR [rax+r14*8]
 153cbaa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 153cbad:	ff 50 10             	call   QWORD PTR [rax+0x10]
 153cbb0:	49 ff c6             	inc    r14
 153cbb3:	8b 43 20             	mov    eax,DWORD PTR [rbx+0x20]
 153cbb6:	49 39 c6             	cmp    r14,rax
 153cbb9:	72 e7                	jb     153cba2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382126>
 153cbbb:	83 63 20 00          	and    DWORD PTR [rbx+0x20],0x0
 153cbbf:	83 7b 60 00          	cmp    DWORD PTR [rbx+0x60],0x0
 153cbc3:	74 20                	je     153cbe5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382169>
 153cbc5:	45 31 f6             	xor    r14d,r14d
 153cbc8:	48 8b 43 58          	mov    rax,QWORD PTR [rbx+0x58]
 153cbcc:	4a 8b 3c f0          	mov    rdi,QWORD PTR [rax+r14*8]
 153cbd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 153cbd3:	ff 50 10             	call   QWORD PTR [rax+0x10]
 153cbd6:	49 ff c6             	inc    r14
 153cbd9:	8b 43 60             	mov    eax,DWORD PTR [rbx+0x60]
 153cbdc:	49 39 c6             	cmp    r14,rax
 153cbdf:	72 e7                	jb     153cbc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38214c>
 153cbe1:	83 63 60 00          	and    DWORD PTR [rbx+0x60],0x0
 153cbe5:	83 63 08 00          	and    DWORD PTR [rbx+0x8],0x0
 153cbe9:	48 83 c3 10          	add    rbx,0x10
 153cbed:	48 89 df             	mov    rdi,rbx
 153cbf0:	48 83 c4 08          	add    rsp,0x8
 153cbf4:	5b                   	pop    rbx
 153cbf5:	41 5e                	pop    r14
 153cbf7:	e9 02 d8 7e ff       	jmp    d2a3fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27739e>
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
... truncated 64 instructions ...
```

#### Bundle-relative writes
| addr | resolved offset | instruction |
|---:|---:|---|
| `0x153cb8d` | `0x50` | `153cb8d:	83 67 50 00          	and    DWORD PTR [rdi+0x50],0x0` |
| `0x153cb91` | `0x90` | `153cb91:	83 a7 90 00 00 00 00 	and    DWORD PTR [rdi+0x90],0x0` |
| `0x153cbbb` | `0x20` | `153cbbb:	83 63 20 00          	and    DWORD PTR [rbx+0x20],0x0` |
| `0x153cbe1` | `0x60` | `153cbe1:	83 63 60 00          	and    DWORD PTR [rbx+0x60],0x0` |
| `0x153cbe5` | `0x8` | `153cbe5:	83 63 08 00          	and    DWORD PTR [rbx+0x8],0x0` |
| `0x153cc68` | `0x38` | `153cc68:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153cc6e` | `0x10` | `153cc6e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153cc74` | `0x18` | `153cc74:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x153ccdc` | `0x8` | `153ccdc:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153ccf3` | `0x8` | `153ccf3:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |

#### Calls with tracked bundle args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x153cc2a` | `0x165fe6a` | `rdi=bundle+0x0, rdx=bundle+0x10` | `153cc2a:	e8 3b 32 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |
| `0x153cc8b` | `0x153d46a` | `rdi=bundle+0x0, rdx=bundle+0x10` | `153cc8b:	e8 da 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>` |
| `0x153cc97` | `0x1507a9e` | `rdi=bundle+0x18, rdx=bundle+0x10` | `153cc97:	e8 02 ae fc ff       	call   1507a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d022>` |
| `0x153cca2` | `0x153d2a4` | `rdi=bundle+0x58, rsi=bundle+0x0, rdx=bundle+0x10` | `153cca2:	e8 fd 05 00 00       	call   153d2a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382828>` |
| `0x153ccac` | `0x153d46a` | `rdi=bundle+0x0, rsi=bundle+0x0, rdx=bundle+0x10` | `153ccac:	e8 b9 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>` |
| `0x153ccba` | `0x1507b20` | `rdi=bundle+0x0, rsi=bundle+0x0, rdx=bundle+0x10` | `153ccba:	e8 61 ae fc ff       	call   1507b20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d0a4>` |
| `0x153ccc5` | `0x153d0d0` | `rdi=bundle+0x58, rsi=bundle+0x0, rdx=bundle+0x10` | `153ccc5:	e8 06 04 00 00       	call   153d0d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382654>` |
| `0x153ccd2` | `0x1660032` | `rdi=bundle+0x0, rsi=bundle+0x90, rdx=bundle+0x10` | `153ccd2:	e8 5b 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x153cceb` | `0x1660032` | `rdi=bundle+0x0, rsi=bundle+0x50, rdx=bundle+0x10` | `153cceb:	e8 42 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x153ccff` | `0x1660346` | `rdi=bundle+0x0, rsi=bundle+0x50, rdx=bundle+0x10` | `153ccff:	e8 42 36 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153cd0c` | `0x165ff26` | `rdi=bundle+0x0, rsi=bundle+0x50, rdx=bundle+0x10` | `153cd0c:	e8 15 32 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>` |
| `0x153cd1e` | `0x165ffb0` | `rdi=bundle+0x0, rsi=bundle+0x50, rdx=bundle+0x10` | `153cd1e:	e8 8d 32 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>` |

### Vtable `+0x20` target `0x165d0fa` — secondary method at AP+0x20

- scanned instructions: `240`
- bundle-relative refs: `3`
- bundle-relative writes: `0`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` passes/aliases: `0`
- calls: `25`

#### Entry excerpt
```text
 165d0fa:	55                   	push   rbp
 165d0fb:	41 57                	push   r15
 165d0fd:	41 56                	push   r14
 165d0ff:	41 55                	push   r13
 165d101:	41 54                	push   r12
 165d103:	53                   	push   rbx
 165d104:	48 83 ec 48          	sub    rsp,0x48
 165d108:	48 89 f3             	mov    rbx,rsi
 165d10b:	49 89 fe             	mov    r14,rdi
 165d10e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 165d115:	00 00
 165d117:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 165d11c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 165d11f:	ff 50 48             	call   QWORD PTR [rax+0x48]
 165d122:	8b 48 14             	mov    ecx,DWORD PTR [rax+0x14]
 165d125:	4c 01 f1             	add    rcx,r14
 165d128:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
 165d12d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 165d132:	8b 50 1c             	mov    edx,DWORD PTR [rax+0x1c]
 165d135:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
 165d13a:	4c 01 f2             	add    rdx,r14
 165d13d:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 165d142:	48 89 df             	mov    rdi,rbx
 165d145:	e8 a0 e8 ff ff       	call   165b9ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb56>
 165d14a:	4c 8d 7b 38          	lea    r15,[rbx+0x38]
 165d14e:	45 31 ed             	xor    r13d,r13d
 165d151:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
 165d156:	44 89 e8             	mov    eax,r13d
 165d159:	41 8d 6d 01          	lea    ebp,[r13+0x1]
 165d15d:	4c 6b f0 28          	imul   r14,rax,0x28
 165d161:	8b 4b 10             	mov    ecx,DWORD PTR [rbx+0x10]
 165d164:	85 c9                	test   ecx,ecx
 165d166:	0f 84 c4 00 00 00    	je     165d230 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1139c>
 165d16c:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
 165d170:	0f b6 32             	movzx  esi,BYTE PTR [rdx]
 165d173:	83 fe 77             	cmp    esi,0x77
 165d176:	0f 87 a5 00 00 00    	ja     165d221 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1138d>
 165d17c:	8b 43 30             	mov    eax,DWORD PTR [rbx+0x30]
 165d17f:	83 e0 f8             	and    eax,0xfffffff8
 165d182:	01 f0                	add    eax,esi
 165d184:	89 43 30             	mov    DWORD PTR [rbx+0x30],eax
 165d187:	48 ff c2             	inc    rdx
 165d18a:	48 89 53 08          	mov    QWORD PTR [rbx+0x8],rdx
 165d18e:	ff c9                	dec    ecx
 165d190:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
 165d193:	83 f8 07             	cmp    eax,0x7
 165d196:	77 16                	ja     165d1ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1131a>
 165d198:	48 89 df             	mov    rdi,rbx
 165d19b:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 165d1a0:	e8 6f e8 ff ff       	call   165ba14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb80>
 165d1a5:	84 c0                	test   al,al
 165d1a7:	74 b8                	je     165d161 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x112cd>
 165d1a9:	e9 06 06 00 00       	jmp    165d7b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11920>
 165d1ae:	c1 e8 03             	shr    eax,0x3
 165d1b1:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 165d1b6:	8b 49 10             	mov    ecx,DWORD PTR [rcx+0x10]
 165d1b9:	41 39 cd             	cmp    r13d,ecx
 165d1bc:	73 23                	jae    165d1e1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1134d>
 165d1be:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
 165d1c3:	4c 8b 62 08          	mov    r12,QWORD PTR [rdx+0x8]
 165d1c7:	4d 85 e4             	test   r12,r12
 165d1ca:	74 15                	je     165d1e1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1134d>
 165d1cc:	43 8b 3c 34          	mov    edi,DWORD PTR [r12+r14*1]
 165d1d0:	39 f8                	cmp    eax,edi
 165d1d2:	0f 84 85 01 00 00    	je     165d35d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x114c9>
 165d1d8:	31 d2                	xor    edx,edx
 165d1da:	44 89 ee             	mov    esi,r13d
 165d1dd:	39 f8                	cmp    eax,edi
 165d1df:	7e 04                	jle    165d1e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11351>
 165d1e1:	89 ea                	mov    edx,ebp
... truncated 170 instructions ...
```

#### Calls with tracked bundle args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x165d145` | `0x165b9ea` | `rdi=bundle+0x0` | `165d145:	e8 a0 e8 ff ff       	call   165b9ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb56>` |
| `0x165d1a0` | `0x165ba14` | `rdi=bundle+0x0` | `165d1a0:	e8 6f e8 ff ff       	call   165ba14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb80>` |
| `0x165d217` | `0x165ba4c` | `rdi=bundle+0x0` | `165d217:	e8 30 e8 ff ff       	call   165ba4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfbb8>` |
| `0x165d233` | `0x165b63c` | `rdi=bundle+0x0` | `165d233:	e8 04 e4 ff ff       	call   165b63c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7a8>` |
| `0x165d27c` | `0x165c158` | `rdi=bundle+0x0` | `165d27c:	e8 d7 ee ff ff       	call   165c158 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102c4>` |
| `0x165d294` | `0x165b6fa` | `rdi=bundle+0x0` | `165d294:	e8 61 e4 ff ff       	call   165b6fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf866>` |
| `0x165d2a8` | `0xd90af2` | `rdi=bundle+0x0` | `165d2a8:	e8 45 38 73 ff       	call   d90af2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5db78>` |
| `0x165d2bd` | `0x165c158` | `rdi=bundle+0x0` | `165d2bd:	e8 96 ee ff ff       	call   165c158 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102c4>` |
| `0x165d2d5` | `0x165dbce` | `rdi=bundle+0x0` | `165d2d5:	e8 f4 08 00 00       	call   165dbce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11d3a>` |
| `0x165d2ea` | `0x165daf0` | `rdi=bundle+0x0` | `165d2ea:	e8 01 08 00 00       	call   165daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11c5c>` |
| `0x165d302` | `0x165c158` | `rdi=bundle+0x0` | `165d302:	e8 51 ee ff ff       	call   165c158 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102c4>` |
| `0x165d31a` | `0x165dba4` | `rdi=bundle+0x0` | `165d31a:	e8 85 08 00 00       	call   165dba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11d10>` |
| `0x165d32e` | `0xd90af2` | `rdi=bundle+0x0` | `165d32e:	e8 bf 37 73 ff       	call   d90af2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5db78>` |
| `0x165d343` | `0x165d928` | `rdi=bundle+0x0` | `165d343:	e8 e0 05 00 00       	call   165d928 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11a94>` |
| `0x165d353` | `0x165d8be` | `rdi=bundle+0x0` | `165d353:	e8 66 05 00 00       	call   165d8be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11a2a>` |
| `0x165d36b` | `0x165c158` | `rdi=bundle+0x0` | `165d36b:	e8 e8 ed ff ff       	call   165c158 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102c4>` |
| `0x165d382` | `0xd15dfa` | `rdi=bundle+0x0` | `165d382:	e8 73 8a 6b ff       	call   d15dfa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d9a>` |
| `0x165d38d` | `0x165c462` | `rdi=bundle+0x0` | `165d38d:	e8 d0 f0 ff ff       	call   165c462 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105ce>` |
| `0x165d3a0` | `0x165c158` | `rdi=bundle+0x0` | `165d3a0:	e8 b3 ed ff ff       	call   165c158 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102c4>` |
| `0x165d3b8` | `0x165b850` | `rdi=bundle+0x0` | `165d3b8:	e8 93 e4 ff ff       	call   165b850 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf9bc>` |
| `0x165d3cd` | `0x165daf0` | `rdi=bundle+0x0` | `165d3cd:	e8 1e 07 00 00       	call   165daf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11c5c>` |
| `0x165d3e4` | `0x165c158` | `rdi=bundle+0x0` | `165d3e4:	e8 6f ed ff ff       	call   165c158 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102c4>` |
| `0x165d3ff` | `0x165b6fa` | `rdi=bundle+0x0` | `165d3ff:	e8 f6 e2 ff ff       	call   165b6fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf866>` |
| `0x165d416` | `0x165d9ce` | `rdi=bundle+0x0` | `165d416:	e8 b3 05 00 00       	call   165d9ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11b3a>` |
| `0x165d42a` | `0x165c158` | `rdi=bundle+0x0` | `165d42a:	e8 29 ed ff ff       	call   165c158 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102c4>` |

### Vtable `+0x28` target `0x165dd40` — secondary method at AP+0x28

- scanned instructions: `240`
- bundle-relative refs: `1`
- bundle-relative writes: `0`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` passes/aliases: `0`
- calls: `23`

#### Entry excerpt
```text
 165dd40:	55                   	push   rbp
 165dd41:	41 57                	push   r15
 165dd43:	41 56                	push   r14
 165dd45:	41 55                	push   r13
 165dd47:	41 54                	push   r12
 165dd49:	53                   	push   rbx
 165dd4a:	48 83 ec 28          	sub    rsp,0x28
 165dd4e:	48 89 f3             	mov    rbx,rsi
 165dd51:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 165dd54:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
 165dd59:	ff 50 48             	call   QWORD PTR [rax+0x48]
 165dd5c:	48 89 c1             	mov    rcx,rax
 165dd5f:	8b 40 14             	mov    eax,DWORD PTR [rax+0x14]
 165dd62:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 165dd66:	8b 43 20             	mov    eax,DWORD PTR [rbx+0x20]
 165dd69:	89 44 24 14          	mov    DWORD PTR [rsp+0x14],eax
 165dd6d:	c7 43 20 01 00 00 00 	mov    DWORD PTR [rbx+0x20],0x1
 165dd74:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
 165dd79:	8b 41 10             	mov    eax,DWORD PTR [rcx+0x10]
 165dd7c:	48 85 c0             	test   rax,rax
 165dd7f:	0f 84 df 05 00 00    	je     165e364 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124d0>
 165dd85:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
 165dd89:	48 03 4c 24 08       	add    rcx,QWORD PTR [rsp+0x8]
 165dd8e:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
 165dd92:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 165dd97:	4c 8b 79 08          	mov    r15,QWORD PTR [rcx+0x8]
 165dd9b:	48 6b c0 28          	imul   rax,rax,0x28
 165dd9f:	4c 01 f8             	add    rax,r15
 165dda2:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 165dda7:	41 0f b7 47 06       	movzx  eax,WORD PTR [r15+0x6]
 165ddac:	3d ff ff 00 00       	cmp    eax,0xffff
 165ddb1:	74 15                	je     165ddc8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11f34>
 165ddb3:	89 c1                	mov    ecx,eax
 165ddb5:	c1 e9 05             	shr    ecx,0x5
 165ddb8:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
 165ddbc:	8b 0c 8a             	mov    ecx,DWORD PTR [rdx+rcx*4]
 165ddbf:	0f a3 c1             	bt     ecx,eax
 165ddc2:	0f 83 8d 05 00 00    	jae    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165ddc8:	41 0f b6 47 04       	movzx  eax,BYTE PTR [r15+0x4]
 165ddcd:	83 e0 3f             	and    eax,0x3f
 165ddd0:	83 f8 37             	cmp    eax,0x37
 165ddd3:	0f 87 7c 05 00 00    	ja     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165ddd9:	45 8b 67 18          	mov    r12d,DWORD PTR [r15+0x18]
 165dddd:	4c 03 64 24 08       	add    r12,QWORD PTR [rsp+0x8]
 165dde2:	48 8d 0d 4b da d3 fe 	lea    rcx,[rip+0xfffffffffed3da4b]        # 39b834 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x8415>
 165dde9:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
 165dded:	48 01 c8             	add    rax,rcx
 165ddf0:	ff e0                	jmp    rax
 165ddf2:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165ddf5:	41 8b 14 24          	mov    edx,DWORD PTR [r12]
 165ddf9:	48 89 df             	mov    rdi,rbx
 165ddfc:	e8 1d 07 00 00       	call   165e51e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1268a>
 165de01:	e9 4f 05 00 00       	jmp    165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165de06:	41 8b 4c 24 08       	mov    ecx,DWORD PTR [r12+0x8]
 165de0b:	85 c9                	test   ecx,ecx
 165de0d:	0f 84 42 05 00 00    	je     165e355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124c1>
 165de13:	41 8b 37             	mov    esi,DWORD PTR [r15]
 165de16:	6a 02                	push   0x2
 165de18:	5a                   	pop    rdx
 165de19:	48 89 df             	mov    rdi,rbx
 165de1c:	e8 61 ee ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>
 165de21:	31 ed                	xor    ebp,ebp
 165de23:	89 e8                	mov    eax,ebp
 165de25:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
 165de29:	8b 34 81             	mov    esi,DWORD PTR [rcx+rax*4]
 165de2c:	48 89 df             	mov    rdi,rbx
 165de2f:	e8 d8 07 00 00       	call   165e60c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12778>
 165de34:	ff c5                	inc    ebp
 165de36:	41 3b 6c 24 08       	cmp    ebp,DWORD PTR [r12+0x8]
 165de3b:	75 e6                	jne    165de23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11f8f>
... truncated 170 instructions ...
```

#### Calls with tracked bundle args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x165ddfc` | `0x165e51e` | `rdi=bundle+0x0` | `165ddfc:	e8 1d 07 00 00       	call   165e51e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1268a>` |
| `0x165de1c` | `0x165cc82` | `rdi=bundle+0x0` | `165de1c:	e8 61 ee ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165de2f` | `0x165e60c` | `rdi=bundle+0x0` | `165de2f:	e8 d8 07 00 00       	call   165e60c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12778>` |
| `0x165de58` | `0x165cc82` | `rdi=bundle+0x0` | `165de58:	e8 25 ee ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165de6c` | `0x165e626` | `rdi=bundle+0x0` | `165de6c:	e8 b5 07 00 00       	call   165e626 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12792>` |
| `0x165de89` | `0x165e494` | `rdi=bundle+0x0` | `165de89:	e8 06 06 00 00       	call   165e494 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12600>` |
| `0x165dea9` | `0x165cc82` | `rdi=bundle+0x0` | `165dea9:	e8 d4 ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165debd` | `0x165cd7c` | `rdi=bundle+0x0` | `165debd:	e8 ba ee ff ff       	call   165cd7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ee8>` |
| `0x165ded9` | `0x165ca0c` | `rdi=bundle+0x0` | `165ded9:	e8 2e eb ff ff       	call   165ca0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10b78>` |
| `0x165defa` | `0x165cc82` | `rdi=bundle+0x0` | `165defa:	e8 83 ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165df0b` | `0x165e5a4` | `rdi=bundle+0x0` | `165df0b:	e8 94 06 00 00       	call   165e5a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12710>` |
| `0x165df4e` | `0x165cc82` | `rdi=bundle+0x0` | `165df4e:	e8 2f ed ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165df60` | `0x165e5d4` | `rdi=bundle+0x0` | `165df60:	e8 6f 06 00 00       	call   165e5d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12740>` |
| `0x165df8a` | `0x165cc82` | `rdi=bundle+0x0` | `165df8a:	e8 f3 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165df9c` | `0x165e5a4` | `rdi=bundle+0x0` | `165df9c:	e8 03 06 00 00       	call   165e5a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12710>` |
| `0x165dfc6` | `0x165cc82` | `rdi=bundle+0x0` | `165dfc6:	e8 b7 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165dfd8` | `0x165cd76` | `rdi=bundle+0x0` | `165dfd8:	e8 99 ed ff ff       	call   165cd76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ee2>` |
| `0x165dffb` | `0x165caf2` | `rdi=bundle+0x0` | `165dffb:	e8 f2 ea ff ff       	call   165caf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c5e>` |
| `0x165e01c` | `0x165cc82` | `rdi=bundle+0x0` | `165e01c:	e8 61 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165e02e` | `0x165cd54` | `rdi=bundle+0x0` | `165e02e:	e8 21 ed ff ff       	call   165cd54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ec0>` |
| `0x165e058` | `0x165cc82` | `rdi=bundle+0x0` | `165e058:	e8 25 ec ff ff       	call   165cc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dee>` |
| `0x165e069` | `0x165cd54` | `rdi=bundle+0x0` | `165e069:	e8 e6 ec ff ff       	call   165cd54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ec0>` |
| `0x165e086` | `0x165cbc2` | `rdi=bundle+0x0` | `165e086:	e8 37 eb ff ff       	call   165cbc2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d2e>` |

### Vtable `+0x38` target `0x153cd4e` — method after +0x30 body

- scanned instructions: `60`
- bundle-relative refs: `10`
- bundle-relative writes: `0`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` passes/aliases: `0`
- calls: `4`

#### Entry excerpt
```text
 153cd4e:	55                   	push   rbp
 153cd4f:	41 57                	push   r15
 153cd51:	41 56                	push   r14
 153cd53:	53                   	push   rbx
 153cd54:	50                   	push   rax
 153cd55:	49 89 fe             	mov    r14,rdi
 153cd58:	83 7f 20 00          	cmp    DWORD PTR [rdi+0x20],0x0
 153cd5c:	74 27                	je     153cd85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382309>
 153cd5e:	45 31 ff             	xor    r15d,r15d
 153cd61:	6a 01                	push   0x1
 153cd63:	5d                   	pop    rbp
 153cd64:	31 db                	xor    ebx,ebx
 153cd66:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 153cd6a:	4a 8b 34 f8          	mov    rsi,QWORD PTR [rax+r15*8]
 153cd6e:	89 ef                	mov    edi,ebp
 153cd70:	e8 bf 81 b5 ff       	call   1094f34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c34a>
 153cd75:	01 c3                	add    ebx,eax
 153cd77:	49 ff c7             	inc    r15
 153cd7a:	41 8b 46 20          	mov    eax,DWORD PTR [r14+0x20]
 153cd7e:	49 39 c7             	cmp    r15,rax
 153cd81:	72 e3                	jb     153cd66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3822ea>
 153cd83:	eb 02                	jmp    153cd87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38230b>
 153cd85:	31 db                	xor    ebx,ebx
 153cd87:	41 8b 6e 08          	mov    ebp,DWORD PTR [r14+0x8]
 153cd8b:	40 f6 c5 01          	test   bpl,0x1
 153cd8f:	74 0e                	je     153cd9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382323>
 153cd91:	41 8b 76 50          	mov    esi,DWORD PTR [r14+0x50]
 153cd95:	6a 02                	push   0x2
 153cd97:	5f                   	pop    rdi
 153cd98:	e8 57 85 b5 ff       	call   10952f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c70a>
 153cd9d:	01 c3                	add    ebx,eax
 153cd9f:	41 83 7e 60 00       	cmp    DWORD PTR [r14+0x60],0x0
 153cda4:	74 27                	je     153cdcd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382351>
 153cda6:	45 31 ff             	xor    r15d,r15d
 153cda9:	6a 03                	push   0x3
 153cdab:	5d                   	pop    rbp
 153cdac:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
 153cdb0:	4a 8b 34 f8          	mov    rsi,QWORD PTR [rax+r15*8]
 153cdb4:	89 ef                	mov    edi,ebp
 153cdb6:	e8 79 81 b5 ff       	call   1094f34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c34a>
 153cdbb:	01 c3                	add    ebx,eax
 153cdbd:	49 ff c7             	inc    r15
 153cdc0:	41 8b 46 60          	mov    eax,DWORD PTR [r14+0x60]
 153cdc4:	49 39 c7             	cmp    r15,rax
 153cdc7:	72 e3                	jb     153cdac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382330>
 153cdc9:	41 8b 6e 08          	mov    ebp,DWORD PTR [r14+0x8]
 153cdcd:	40 f6 c5 02          	test   bpl,0x2
 153cdd1:	74 11                	je     153cde4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382368>
 153cdd3:	41 8b b6 90 00 00 00 	mov    esi,DWORD PTR [r14+0x90]
 153cdda:	6a 04                	push   0x4
 153cddc:	5f                   	pop    rdi
 153cddd:	e8 12 85 b5 ff       	call   10952f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c70a>
 153cde2:	01 c3                	add    ebx,eax
 153cde4:	89 d8                	mov    eax,ebx
 153cde6:	48 83 c4 08          	add    rsp,0x8
 153cdea:	5b                   	pop    rbx
 153cdeb:	41 5e                	pop    r14
 153cded:	41 5f                	pop    r15
 153cdef:	5d                   	pop    rbp
 153cdf0:	c3                   	ret
```

#### Calls with tracked bundle args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x153cd70` | `0x1094f34` | `rdi=bundle+0x0` | `153cd70:	e8 bf 81 b5 ff       	call   1094f34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c34a>` |
| `0x153cd98` | `0x10952f4` | `rdi=bundle+0x0` | `153cd98:	e8 57 85 b5 ff       	call   10952f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c70a>` |
| `0x153cdb6` | `0x1094f34` | `rdi=bundle+0x0` | `153cdb6:	e8 79 81 b5 ff       	call   1094f34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c34a>` |
| `0x153cddd` | `0x10952f4` | `rdi=bundle+0x0` | `153cddd:	e8 12 85 b5 ff       	call   10952f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c70a>` |

### Vtable `+0x40` target `0x153cdf2` — method after +0x30 body

- scanned instructions: `63`
- bundle-relative refs: `11`
- bundle-relative writes: `0`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` passes/aliases: `0`
- calls: `5`

#### Entry excerpt
```text
 153cdf2:	55                   	push   rbp
 153cdf3:	41 57                	push   r15
 153cdf5:	41 56                	push   r14
 153cdf7:	53                   	push   rbx
 153cdf8:	50                   	push   rax
 153cdf9:	48 89 f3             	mov    rbx,rsi
 153cdfc:	49 89 fe             	mov    r14,rdi
 153cdff:	83 7f 20 00          	cmp    DWORD PTR [rdi+0x20],0x0
 153ce03:	74 24                	je     153ce29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3823ad>
 153ce05:	45 31 ff             	xor    r15d,r15d
 153ce08:	6a 01                	push   0x1
 153ce0a:	5d                   	pop    rbp
 153ce0b:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 153ce0f:	4a 8b 14 f8          	mov    rdx,QWORD PTR [rax+r15*8]
 153ce13:	48 89 df             	mov    rdi,rbx
 153ce16:	89 ee                	mov    esi,ebp
 153ce18:	e8 87 29 12 00       	call   165f7a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13910>
 153ce1d:	49 ff c7             	inc    r15
 153ce20:	41 8b 46 20          	mov    eax,DWORD PTR [r14+0x20]
 153ce24:	49 39 c7             	cmp    r15,rax
 153ce27:	72 e2                	jb     153ce0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38238f>
 153ce29:	41 f6 46 08 01       	test   BYTE PTR [r14+0x8],0x1
 153ce2e:	74 0f                	je     153ce3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3823c3>
 153ce30:	41 8b 56 50          	mov    edx,DWORD PTR [r14+0x50]
 153ce34:	6a 02                	push   0x2
 153ce36:	5e                   	pop    rsi
 153ce37:	48 89 df             	mov    rdi,rbx
 153ce3a:	e8 15 25 12 00       	call   165f354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x134c0>
 153ce3f:	41 83 7e 60 00       	cmp    DWORD PTR [r14+0x60],0x0
 153ce44:	74 24                	je     153ce6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3823ee>
 153ce46:	45 31 ff             	xor    r15d,r15d
 153ce49:	6a 03                	push   0x3
 153ce4b:	5d                   	pop    rbp
 153ce4c:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
 153ce50:	4a 8b 14 f8          	mov    rdx,QWORD PTR [rax+r15*8]
 153ce54:	48 89 df             	mov    rdi,rbx
 153ce57:	89 ee                	mov    esi,ebp
 153ce59:	e8 46 29 12 00       	call   165f7a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13910>
 153ce5e:	49 ff c7             	inc    r15
 153ce61:	41 8b 46 60          	mov    eax,DWORD PTR [r14+0x60]
 153ce65:	49 39 c7             	cmp    r15,rax
 153ce68:	72 e2                	jb     153ce4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3823d0>
 153ce6a:	41 f6 46 08 02       	test   BYTE PTR [r14+0x8],0x2
 153ce6f:	74 12                	je     153ce83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382407>
 153ce71:	41 8b 96 90 00 00 00 	mov    edx,DWORD PTR [r14+0x90]
 153ce78:	6a 04                	push   0x4
 153ce7a:	5e                   	pop    rsi
 153ce7b:	48 89 df             	mov    rdi,rbx
 153ce7e:	e8 d1 24 12 00       	call   165f354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x134c0>
 153ce83:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
 153ce87:	48 85 f6             	test   rsi,rsi
 153ce8a:	74 0e                	je     153ce9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38241e>
 153ce8c:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
 153ce90:	74 08                	je     153ce9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38241e>
 153ce92:	48 89 df             	mov    rdi,rbx
 153ce95:	e8 86 29 12 00       	call   165f820 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1398c>
 153ce9a:	8a 03                	mov    al,BYTE PTR [rbx]
 153ce9c:	48 83 c4 08          	add    rsp,0x8
 153cea0:	5b                   	pop    rbx
 153cea1:	41 5e                	pop    r14
 153cea3:	41 5f                	pop    r15
 153cea5:	5d                   	pop    rbp
 153cea6:	c3                   	ret
```

#### Calls with tracked bundle args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x153ce18` | `0x165f7a4` | `rdi=bundle+0x0` | `153ce18:	e8 87 29 12 00       	call   165f7a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13910>` |
| `0x153ce3a` | `0x165f354` | `rdi=bundle+0x0` | `153ce3a:	e8 15 25 12 00       	call   165f354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x134c0>` |
| `0x153ce59` | `0x165f7a4` | `rdi=bundle+0x0` | `153ce59:	e8 46 29 12 00       	call   165f7a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13910>` |
| `0x153ce7e` | `0x165f354` | `rdi=bundle+0x0` | `153ce7e:	e8 d1 24 12 00       	call   165f354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x134c0>` |
| `0x153ce95` | `0x165f820` | `rdi=bundle+0x0` | `153ce95:	e8 86 29 12 00       	call   165f820 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1398c>` |

### Vtable `+0x48` target `0x153cea8` — method after +0x30 body

- scanned instructions: `2`
- bundle-relative refs: `0`
- bundle-relative writes: `0`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` passes/aliases: `0`
- calls: `0`

#### Entry excerpt
```text
 153cea8:	48 8d 05 c9 ac 3f 00 	lea    rax,[rip+0x3facc9]        # 1937b78 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x7c0>
 153ceaf:	c3                   	ret
```

### Vtable `+0x50` target `0x153ceb0` — method after +0x30 body

- scanned instructions: `238`
- bundle-relative refs: `45`
- bundle-relative writes: `13`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` passes/aliases: `1`
- calls: `13`

#### Entry excerpt
```text
 153ceb0:	55                   	push   rbp
 153ceb1:	41 57                	push   r15
 153ceb3:	41 56                	push   r14
 153ceb5:	41 55                	push   r13
 153ceb7:	41 54                	push   r12
 153ceb9:	53                   	push   rbx
 153ceba:	50                   	push   rax
 153cebb:	48 89 f3             	mov    rbx,rsi
 153cebe:	49 89 fe             	mov    r14,rdi
 153cec1:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
 153cec4:	a8 01                	test   al,0x1
 153cec6:	74 0a                	je     153ced2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382456>
 153cec8:	8b 43 50             	mov    eax,DWORD PTR [rbx+0x50]
 153cecb:	41 89 46 50          	mov    DWORD PTR [r14+0x50],eax
 153cecf:	8b 43 08             	mov    eax,DWORD PTR [rbx+0x8]
 153ced2:	a8 02                	test   al,0x2
 153ced4:	74 10                	je     153cee6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38246a>
 153ced6:	8b 83 90 00 00 00    	mov    eax,DWORD PTR [rbx+0x90]
 153cedc:	41 89 86 90 00 00 00 	mov    DWORD PTR [r14+0x90],eax
 153cee3:	8b 43 08             	mov    eax,DWORD PTR [rbx+0x8]
 153cee6:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax
 153ceea:	49 8d 7e 18          	lea    rdi,[r14+0x18]
 153ceee:	8b 6b 20             	mov    ebp,DWORD PTR [rbx+0x20]
 153cef1:	41 03 6e 20          	add    ebp,DWORD PTR [r14+0x20]
 153cef5:	89 ee                	mov    esi,ebp
 153cef7:	e8 9c 8e 7d ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>
 153cefc:	41 39 6e 20          	cmp    DWORD PTR [r14+0x20],ebp
 153cf00:	73 51                	jae    153cf53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3824d7>
 153cf02:	45 8b 66 28          	mov    r12d,DWORD PTR [r14+0x28]
 153cf06:	41 39 ec             	cmp    r12d,ebp
 153cf09:	73 67                	jae    153cf72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3824f6>
 153cf0b:	6a 38                	push   0x38
 153cf0d:	41 5f                	pop    r15
 153cf0f:	4c 8d 2d e2 13 34 00 	lea    r13,[rip+0x3413e2]        # 187e2f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a9e0>
 153cf16:	4c 89 ff             	mov    rdi,r15
 153cf19:	e8 e2 0f 2b 00       	call   17edf00 <_Znwm@plt>
 153cf1e:	4c 89 28             	mov    QWORD PTR [rax],r13
 153cf21:	0f 57 c0             	xorps  xmm0,xmm0
 153cf24:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
 153cf28:	83 60 30 00          	and    DWORD PTR [rax+0x30],0x0
 153cf2c:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
 153cf30:	83 60 08 00          	and    DWORD PTR [rax+0x8],0x0
 153cf34:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
 153cf38:	41 8d 54 24 01       	lea    edx,[r12+0x1]
 153cf3d:	41 89 56 28          	mov    DWORD PTR [r14+0x28],edx
 153cf41:	44 89 e2             	mov    edx,r12d
 153cf44:	48 89 04 d1          	mov    QWORD PTR [rcx+rdx*8],rax
 153cf48:	45 8b 66 28          	mov    r12d,DWORD PTR [r14+0x28]
 153cf4c:	41 39 ec             	cmp    r12d,ebp
 153cf4f:	72 c5                	jb     153cf16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38249a>
 153cf51:	eb 1f                	jmp    153cf72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3824f6>
 153cf53:	74 1d                	je     153cf72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3824f6>
 153cf55:	41 89 ef             	mov    r15d,ebp
 153cf58:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 153cf5c:	44 89 f9             	mov    ecx,r15d
 153cf5f:	48 8b 3c c8          	mov    rdi,QWORD PTR [rax+rcx*8]
 153cf63:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 153cf66:	ff 50 10             	call   QWORD PTR [rax+0x10]
 153cf69:	41 ff c7             	inc    r15d
 153cf6c:	45 3b 7e 20          	cmp    r15d,DWORD PTR [r14+0x20]
 153cf70:	75 e6                	jne    153cf58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3824dc>
 153cf72:	41 89 6e 20          	mov    DWORD PTR [r14+0x20],ebp
 153cf76:	8b 43 20             	mov    eax,DWORD PTR [rbx+0x20]
 153cf79:	85 c0                	test   eax,eax
 153cf7b:	74 2d                	je     153cfaa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38252e>
 153cf7d:	45 31 ff             	xor    r15d,r15d
 153cf80:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]
 153cf84:	41 8b 56 20          	mov    edx,DWORD PTR [r14+0x20]
 153cf88:	29 c2                	sub    edx,eax
 153cf8a:	44 01 fa             	add    edx,r15d
... truncated 168 instructions ...
```

#### Bundle-relative writes
| addr | resolved offset | instruction |
|---:|---:|---|
| `0x153cecb` | `0x50` | `153cecb:	41 89 46 50          	mov    DWORD PTR [r14+0x50],eax` |
| `0x153cedc` | `0x90` | `153cedc:	41 89 86 90 00 00 00 	mov    DWORD PTR [r14+0x90],eax` |
| `0x153cee6` | `0x8` | `153cee6:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153cf3d` | `0x28` | `153cf3d:	41 89 56 28          	mov    DWORD PTR [r14+0x28],edx` |
| `0x153cf72` | `0x20` | `153cf72:	41 89 6e 20          	mov    DWORD PTR [r14+0x20],ebp` |
| `0x153d002` | `0x68` | `153d002:	41 89 56 68          	mov    DWORD PTR [r14+0x68],edx` |
| `0x153d037` | `0x60` | `153d037:	41 89 6e 60          	mov    DWORD PTR [r14+0x60],ebp` |
| `0x153d09b` | `0x0` | `153d09b:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x153d118` | `0x38` | `153d118:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153d11e` | `0x10` | `153d11e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153d124` | `0x18` | `153d124:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x153d152` | `0x8` | `153d152:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153d166` | `0x8` | `153d166:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |

#### Exact `bundle+0x30` aliases/passes
- `0x153d0fe` lea-alias: `153d0fe:	4d 8d 7e 30          	lea    r15,[r14+0x30]`

#### Calls with tracked bundle args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x153cef7` | `0xd15d98` | `rdi=bundle+0x18` | `153cef7:	e8 9c 8e 7d ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0x153cf19` | `0x17edf00` | `rdi=bundle+0x18` | `153cf19:	e8 e2 0f 2b 00       	call   17edf00 <_Znwm@plt>` |
| `0x153cfb7` | `0xd15d98` | `rdi=bundle+0x58` | `153cfb7:	e8 dc 8d 7d ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0x153cfd9` | `0x17edf00` | `rdi=bundle+0x58` | `153cfd9:	e8 22 0f 2b 00       	call   17edf00 <_Znwm@plt>` |
| `0x153d0a2` | `0x17ede90` | `rdi=bundle+0x0` | `153d0a2:	e8 e9 0d 2b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x153d0ab` | `0x17ede90` | `rdi=bundle+0x18` | `153d0ab:	e8 e0 0d 2b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x153d0c2` | `0x153d090` | `rdi=bundle+0x0` | `153d0c2:	e8 c9 ff ff ff       	call   153d090 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382614>` |
| `0x153d0f9` | `0x165fe6a` | `rdi=bundle+0x0, rdx=bundle+0x10` | `153d0f9:	e8 6c 2d 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |
| `0x153d13b` | `0x1660346` | `rdi=bundle+0x0, rdx=bundle+0x10` | `153d13b:	e8 06 32 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153d148` | `0x1660234` | `rdi=bundle+0x0, rsi=bundle+0x30, rdx=bundle+0x10` | `153d148:	e8 e7 30 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>` |
| `0x153d15e` | `0x1660234` | `rdi=bundle+0x0, rsi=bundle+0x18, rdx=bundle+0x10` | `153d15e:	e8 d1 30 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>` |
| `0x153d16f` | `0x165ff26` | `rdi=bundle+0x0, rsi=bundle+0x18, rdx=bundle+0x10` | `153d16f:	e8 b2 2d 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>` |
| `0x153d17c` | `0x165ffb0` | `rdi=bundle+0x0, rsi=bundle+0x18, rdx=bundle+0x10` | `153d17c:	e8 2f 2e 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>` |

## Interpretation

No scanned remaining vtable method produced a direct write resolving exactly to `bundle+0x30` under the conservative `rdi=bundle_base` tracker.
Found `2` direct aliases/passes of `bundle+0x30`; inspect pass sections above.

This narrows the remaining source toward either the local constructor materialization itself, a non-vtable helper not reached with a simple bundle alias, or an initialized inline field whose semantics come from the object layout rather than an explicit local store.

