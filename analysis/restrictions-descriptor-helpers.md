# Restrictions descriptor helper trace

Purpose: follow the descriptor helper branch from `bundle.vtable+0x30` because the call at `153cc2a` uses `rdx=bundle+0x10`. A write to `rdx+0x20` would resolve to the factory-consumed `bundle+0x30`.

Known call context:
```text
153cc1e  lea rdx, [rdi+0x10]   ; rdi=bundle_base, so rdx=bundle+0x10
153cc22  lea rsi, [rsp+0x10]   ; local output/context
153cc27  mov rdi, rbx          ; descriptor
153cc2a  call 165fe6a
```

## Summary table

| target | insns | refs | writes | exact bundle+0x30 writes | bundle+0x30 aliases/passes | calls |
|---:|---:|---:|---:|---:|---:|---:|
| `0x165fe6a` | `21` | `5` | `1` | `0` | `0` | `1` |
| `0x165ffb0` | `15` | `8` | `4` | `0` | `0` | `2` |
| `0x1660032` | `16` | `7` | `3` | `0` | `0` | `1` |
| `0x153d2a4` | `38` | `9` | `3` | `0` | `0` | `3` |
| `0x153d0d0` | `38` | `9` | `3` | `0` | `0` | `3` |

## `descriptor pre-read helper 165fe6a, callsite rdx=bundle+0x10` at `0x165fe6a`
- label: `_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6`
- instructions scanned: `21`
- tracked refs: `5`
- tracked writes: `1`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` aliases/passes: `0`

### Entry excerpt
```text
 165fe6a:	55                   	push   rbp
 165fe6b:	41 57                	push   r15
 165fe6d:	41 56                	push   r14
 165fe6f:	53                   	push   rbx
 165fe70:	50                   	push   rax
 165fe71:	49 89 d6             	mov    r14,rdx
 165fe74:	49 89 f7             	mov    r15,rsi
 165fe77:	48 89 fb             	mov    rbx,rdi
 165fe7a:	83 7f 24 00          	cmp    DWORD PTR [rdi+0x24],0x0
 165fe7e:	7e 72                	jle    165fef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1405e>
 165fe80:	8b 43 18             	mov    eax,DWORD PTR [rbx+0x18]
 165fe83:	85 c0                	test   eax,eax
 165fe85:	74 16                	je     165fe9d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14009>
 165fe87:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
 165fe8b:	0f b6 0a             	movzx  ecx,BYTE PTR [rdx]
 165fe8e:	84 c9                	test   cl,cl
 165fe90:	78 0b                	js     165fe9d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14009>
 165fe92:	48 ff c2             	inc    rdx
 165fe95:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
 165fe99:	ff c8                	dec    eax
 165fe9b:	eb 16                	jmp    165feb3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1401f>
```

### Tracked writes
| addr | resolved location | instruction |
|---:|---|---|
| `0x165fe95` | `descriptor+0x10` | `165fe95:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |

### Calls with tracked args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x165fe9b` | `0x165feb3` | `rdi=descriptor+0x0, rsi=local_out+0x0, rdx=load(descriptor+0x10)+0x0` | `165fe9b:	eb 16                	jmp    165feb3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1401f>` |

## `nearby descriptor helper 165ffb0, conservative rdx=bundle+0x10` at `0x165ffb0`
- label: `_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c`
- instructions scanned: `15`
- tracked refs: `8`
- tracked writes: `4`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` aliases/passes: `0`

### Entry excerpt
```text
 165ffb0:	53                   	push   rbx
 165ffb1:	48 89 fb             	mov    rbx,rdi
 165ffb4:	83 7f 38 00          	cmp    DWORD PTR [rdi+0x38],0x0
 165ffb8:	75 24                	jne    165ffde <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1414a>
 165ffba:	80 7b 01 00          	cmp    BYTE PTR [rbx+0x1],0x0
 165ffbe:	74 1e                	je     165ffde <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1414a>
 165ffc0:	ff 4b 24             	dec    DWORD PTR [rbx+0x24]
 165ffc3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 165ffc6:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 165ffca:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
 165ffcd:	89 43 3c             	mov    DWORD PTR [rbx+0x3c],eax
 165ffd0:	48 89 df             	mov    rdi,rbx
 165ffd3:	e8 d8 09 00 00       	call   16609b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b1c>
 165ffd8:	c6 43 01 00          	mov    BYTE PTR [rbx+0x1],0x0
 165ffdc:	eb 08                	jmp    165ffe6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14152>
```

### Tracked writes
| addr | resolved location | instruction |
|---:|---|---|
| `0x165ffc0` | `descriptor+0x24` | `165ffc0:	ff 4b 24             	dec    DWORD PTR [rbx+0x24]` |
| `0x165ffc6` | `descriptor+0x30` | `165ffc6:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax` |
| `0x165ffcd` | `descriptor+0x3c` | `165ffcd:	89 43 3c             	mov    DWORD PTR [rbx+0x3c],eax` |
| `0x165ffd8` | `descriptor+0x1` | `165ffd8:	c6 43 01 00          	mov    BYTE PTR [rbx+0x1],0x0` |

### Calls with tracked args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x165ffd3` | `0x16609b0` | `rdi=descriptor+0x0, rsi=local_out+0x0, rdx=bundle+0x10` | `165ffd3:	e8 d8 09 00 00       	call   16609b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b1c>` |
| `0x165ffdc` | `0x165ffe6` | `` | `165ffdc:	eb 08                	jmp    165ffe6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14152>` |

## `descriptor merge helper 1660032 with rsi=bundle substructure` at `0x1660032`
- label: `_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e`
- instructions scanned: `16`
- tracked refs: `7`
- tracked writes: `3`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` aliases/passes: `0`

### Entry excerpt
```text
 1660032:	41 56                	push   r14
 1660034:	53                   	push   rbx
 1660035:	50                   	push   rax
 1660036:	f6 47 38 07          	test   BYTE PTR [rdi+0x38],0x7
 166003a:	75 38                	jne    1660074 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141e0>
 166003c:	48 89 f3             	mov    rbx,rsi
 166003f:	83 7f 18 00          	cmp    DWORD PTR [rdi+0x18],0x0
 1660043:	74 16                	je     166005b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141c7>
 1660045:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 1660049:	0f b6 00             	movzx  eax,BYTE PTR [rax]
 166004c:	84 c0                	test   al,al
 166004e:	78 0b                	js     166005b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141c7>
 1660050:	89 03                	mov    DWORD PTR [rbx],eax
 1660052:	48 ff 47 10          	inc    QWORD PTR [rdi+0x10]
 1660056:	ff 4f 18             	dec    DWORD PTR [rdi+0x18]
 1660059:	eb 15                	jmp    1660070 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141dc>
```

### Tracked writes
| addr | resolved location | instruction |
|---:|---|---|
| `0x1660050` | `substructure+0x0` | `1660050:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x1660052` | `descriptor+0x10` | `1660052:	48 ff 47 10          	inc    QWORD PTR [rdi+0x10]` |
| `0x1660056` | `descriptor+0x18` | `1660056:	ff 4f 18             	dec    DWORD PTR [rdi+0x18]` |

### Calls with tracked args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x1660059` | `0x1660070` | `rdi=descriptor+0x0, rsi=substructure+0x0` | `1660059:	eb 15                	jmp    1660070 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141dc>` |

## `bundle+0x18 slot fill helper 153d2a4` at `0x153d2a4`
- label: `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382828`
- instructions scanned: `38`
- tracked refs: `9`
- tracked writes: `3`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` aliases/passes: `0`

### Entry excerpt
```text
 153d2a4:	41 57                	push   r15
 153d2a6:	41 56                	push   r14
 153d2a8:	41 54                	push   r12
 153d2aa:	53                   	push   rbx
 153d2ab:	48 83 ec 18          	sub    rsp,0x18
 153d2af:	48 89 f3             	mov    rbx,rsi
 153d2b2:	49 89 fe             	mov    r14,rdi
 153d2b5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 153d2bc:	00 00 
 153d2be:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 153d2c3:	48 8d 57 10          	lea    rdx,[rdi+0x10]
 153d2c7:	48 89 e6             	mov    rsi,rsp
 153d2ca:	48 89 df             	mov    rdi,rbx
 153d2cd:	e8 98 2b 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>
 153d2d2:	4d 8d 7e 30          	lea    r15,[r14+0x30]
 153d2d6:	4d 8d 66 18          	lea    r12,[r14+0x18]
 153d2da:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]
 153d2dd:	85 c9                	test   ecx,ecx
 153d2df:	74 5f                	je     153d340 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3828c4>
 153d2e1:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
 153d2e5:	0f b6 02             	movzx  eax,BYTE PTR [rdx]
 153d2e8:	84 c0                	test   al,al
 153d2ea:	78 54                	js     153d340 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3828c4>
 153d2ec:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax
 153d2ef:	48 ff c2             	inc    rdx
 153d2f2:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
 153d2f6:	ff c9                	dec    ecx
 153d2f8:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx
 153d2fb:	c1 e8 03             	shr    eax,0x3
 153d2fe:	83 f8 01             	cmp    eax,0x1
 153d301:	74 29                	je     153d32c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3828b0>
 153d303:	83 f8 02             	cmp    eax,0x2
 153d306:	74 0e                	je     153d316 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38289a>
 153d308:	85 c0                	test   eax,eax
 153d30a:	74 3e                	je     153d34a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3828ce>
 153d30c:	48 89 df             	mov    rdi,rbx
 153d30f:	e8 32 30 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>
 153d314:	eb c4                	jmp    153d2da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38285e>
```

### Tracked writes
| addr | resolved location | instruction |
|---:|---|---|
| `0x153d2ec` | `descriptor+0x38` | `153d2ec:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153d2f2` | `descriptor+0x10` | `153d2f2:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153d2f8` | `descriptor+0x18` | `153d2f8:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |

### Calls with tracked args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x153d2cd` | `0x165fe6a` | `rdi=descriptor+0x0, rdx=slot+0x10` | `153d2cd:	e8 98 2b 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |
| `0x153d30f` | `0x1660346` | `rdi=descriptor+0x0, rdx=load(descriptor+0x10)+0x0, rcx=load(descriptor+0x18)+0x0` | `153d30f:	e8 32 30 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153d314` | `0x153d2da` | `` | `153d314:	eb c4                	jmp    153d2da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38285e>` |

## `bundle+0x58 slot fill helper 153d0d0` at `0x153d0d0`
- label: `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382654`
- instructions scanned: `38`
- tracked refs: `9`
- tracked writes: `3`
- exact `bundle+0x30` writes: `0`
- exact `bundle+0x30` aliases/passes: `0`

### Entry excerpt
```text
 153d0d0:	41 57                	push   r15
 153d0d2:	41 56                	push   r14
 153d0d4:	41 54                	push   r12
 153d0d6:	53                   	push   rbx
 153d0d7:	48 83 ec 18          	sub    rsp,0x18
 153d0db:	48 89 f3             	mov    rbx,rsi
 153d0de:	49 89 fe             	mov    r14,rdi
 153d0e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 153d0e8:	00 00 
 153d0ea:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 153d0ef:	48 8d 57 10          	lea    rdx,[rdi+0x10]
 153d0f3:	48 89 e6             	mov    rsi,rsp
 153d0f6:	48 89 df             	mov    rdi,rbx
 153d0f9:	e8 6c 2d 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>
 153d0fe:	4d 8d 7e 30          	lea    r15,[r14+0x30]
 153d102:	4d 8d 66 18          	lea    r12,[r14+0x18]
 153d106:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]
 153d109:	85 c9                	test   ecx,ecx
 153d10b:	74 5f                	je     153d16c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826f0>
 153d10d:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
 153d111:	0f b6 02             	movzx  eax,BYTE PTR [rdx]
 153d114:	84 c0                	test   al,al
 153d116:	78 54                	js     153d16c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826f0>
 153d118:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax
 153d11b:	48 ff c2             	inc    rdx
 153d11e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
 153d122:	ff c9                	dec    ecx
 153d124:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx
 153d127:	c1 e8 03             	shr    eax,0x3
 153d12a:	83 f8 01             	cmp    eax,0x1
 153d12d:	74 29                	je     153d158 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826dc>
 153d12f:	83 f8 02             	cmp    eax,0x2
 153d132:	74 0e                	je     153d142 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826c6>
 153d134:	85 c0                	test   eax,eax
 153d136:	74 3e                	je     153d176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826fa>
 153d138:	48 89 df             	mov    rdi,rbx
 153d13b:	e8 06 32 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>
 153d140:	eb c4                	jmp    153d106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38268a>
```

### Tracked writes
| addr | resolved location | instruction |
|---:|---|---|
| `0x153d118` | `descriptor+0x38` | `153d118:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153d11e` | `descriptor+0x10` | `153d11e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153d124` | `descriptor+0x18` | `153d124:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |

### Calls with tracked args
| call | target | tracked args | instruction |
|---:|---:|---|---|
| `0x153d0f9` | `0x165fe6a` | `rdi=descriptor+0x0, rdx=slot+0x10` | `153d0f9:	e8 6c 2d 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |
| `0x153d13b` | `0x1660346` | `rdi=descriptor+0x0, rdx=load(descriptor+0x10)+0x0, rcx=load(descriptor+0x18)+0x0` | `153d13b:	e8 06 32 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153d140` | `0x153d106` | `` | `153d140:	eb c4                	jmp    153d106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38268a>` |

## Interpretation

No scanned descriptor helper writes exactly to `bundle+0x30` under the tracked ABI assumptions.
No scanned descriptor helper even aliases/passes `bundle+0x30` directly.
