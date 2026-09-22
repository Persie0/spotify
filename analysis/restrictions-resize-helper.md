# Restrictions resize helper trace

Purpose: follow `d15d98`, the capacity/resize helper called by `1507a9e` and `1507b20`, to see whether it writes a substructure offset that resolves to `bundle+0x30`.

Target: `0xd15d98` / `_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base`

## Body excerpt
```text
      d15d98:	41 56                	push   r14
      d15d9a:	53                   	push   rbx
      d15d9b:	50                   	push   rax
      d15d9c:	89 f0                	mov    eax,esi
      d15d9e:	8b 77 0c             	mov    esi,DWORD PTR [rdi+0xc]
      d15da1:	39 c6                	cmp    esi,eax
      d15da3:	73 28                	jae    d15dcd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d6d>
      d15da5:	48 89 fb             	mov    rbx,rdi
      d15da8:	01 f6                	add    esi,esi
      d15daa:	39 c6                	cmp    esi,eax
      d15dac:	0f 46 f0             	cmovbe esi,eax
      d15daf:	89 77 0c             	mov    DWORD PTR [rdi+0xc],esi
      d15db2:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
      d15db5:	48 8d 47 18          	lea    rax,[rdi+0x18]
      d15db9:	48 c1 e6 03          	shl    rsi,0x3
      d15dbd:	49 39 c6             	cmp    r14,rax
      d15dc0:	74 13                	je     d15dd5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d75>
      d15dc2:	4c 89 f7             	mov    rdi,r14
      d15dc5:	e8 96 90 ad 00       	call   17eee60 <realloc@plt>
      d15dca:	48 89 03             	mov    QWORD PTR [rbx],rax
      d15dcd:	48 83 c4 08          	add    rsp,0x8
      d15dd1:	5b                   	pop    rbx
      d15dd2:	41 5e                	pop    r14
      d15dd4:	c3                   	ret
      d15dd5:	48 89 f7             	mov    rdi,rsi
      d15dd8:	e8 23 8e ad 00       	call   17eec00 <malloc@plt>
      d15ddd:	48 89 03             	mov    QWORD PTR [rbx],rax
      d15de0:	8b 53 10             	mov    edx,DWORD PTR [rbx+0x10]
      d15de3:	48 c1 e2 03          	shl    rdx,0x3
      d15de7:	48 89 c7             	mov    rdi,rax
      d15dea:	4c 89 f6             	mov    rsi,r14
      d15ded:	48 83 c4 08          	add    rsp,0x8
      d15df1:	5b                   	pop    rbx
      d15df2:	41 5e                	pop    r14
      d15df4:	e9 d7 9c ad 00       	jmp    17efad0 <memcpy@plt>
      d15df9:	cc                   	int3
      d15dfa:	41 56                	push   r14
      d15dfc:	53                   	push   rbx
      d15dfd:	50                   	push   rax
      d15dfe:	48 89 fb             	mov    rbx,rdi
      d15e01:	44 8b 77 08          	mov    r14d,DWORD PTR [rdi+0x8]
      d15e05:	8b 47 10             	mov    eax,DWORD PTR [rdi+0x10]
      d15e08:	41 39 c6             	cmp    r14d,eax
      d15e0b:	73 17                	jae    d15e24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262dc4>
      d15e0d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      d15e10:	44 89 f1             	mov    ecx,r14d
      d15e13:	ff c1                	inc    ecx
      d15e15:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx
      d15e18:	4a 8b 04 f0          	mov    rax,QWORD PTR [rax+r14*8]
      d15e1c:	48 83 c4 08          	add    rsp,0x8
      d15e20:	5b                   	pop    rbx
      d15e21:	41 5e                	pop    r14
      d15e23:	c3                   	ret
      d15e24:	44 3b 73 0c          	cmp    r14d,DWORD PTR [rbx+0xc]
      d15e28:	75 15                	jne    d15e3f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262ddf>
      d15e2a:	41 ff c6             	inc    r14d
      d15e2d:	48 89 df             	mov    rdi,rbx
      d15e30:	44 89 f6             	mov    esi,r14d
      d15e33:	e8 60 ff ff ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>
      d15e38:	44 8b 73 08          	mov    r14d,DWORD PTR [rbx+0x8]
      d15e3c:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
      d15e3f:	ff c0                	inc    eax
      d15e41:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
      d15e44:	6a 18                	push   0x18
      d15e46:	5f                   	pop    rdi
      d15e47:	e8 b4 80 ad 00       	call   17edf00 <_Znwm@plt>
      d15e4c:	0f 57 c0             	xorps  xmm0,xmm0
      d15e4f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      d15e52:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
      d15e57:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      d15e5a:	41 8d 56 01          	lea    edx,[r14+0x1]
      d15e5e:	89 53 08             	mov    DWORD PTR [rbx+0x8],edx
      d15e61:	44 89 f2             	mov    edx,r14d
      d15e64:	48 89 04 d1          	mov    QWORD PTR [rcx+rdx*8],rax
      d15e68:	eb b2                	jmp    d15e1c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262dbc>
      d15e6a:	41 57                	push   r15
      d15e6c:	41 56                	push   r14
      d15e6e:	53                   	push   rbx
      d15e6f:	48 89 fb             	mov    rbx,rdi
      d15e72:	44 8b 77 08          	mov    r14d,DWORD PTR [rdi+0x8]
      d15e76:	8b 47 10             	mov    eax,DWORD PTR [rdi+0x10]
      d15e79:	41 39 c6             	cmp    r14d,eax
      d15e7c:	73 18                	jae    d15e96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262e36>
      d15e7e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      d15e81:	44 89 f1             	mov    ecx,r14d
      d15e84:	ff c1                	inc    ecx
      d15e86:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx
      d15e89:	4e 8b 3c f0          	mov    r15,QWORD PTR [rax+r14*8]
      d15e8d:	4c 89 f8             	mov    rax,r15
      d15e90:	5b                   	pop    rbx
      d15e91:	41 5e                	pop    r14
      d15e93:	41 5f                	pop    r15
      d15e95:	c3                   	ret
      d15e96:	44 3b 73 0c          	cmp    r14d,DWORD PTR [rbx+0xc]
      d15e9a:	75 15                	jne    d15eb1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262e51>
      d15e9c:	41 ff c6             	inc    r14d
      d15e9f:	48 89 df             	mov    rdi,rbx
      d15ea2:	44 89 f6             	mov    esi,r14d
      d15ea5:	e8 ee fe ff ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>
      d15eaa:	44 8b 73 08          	mov    r14d,DWORD PTR [rbx+0x8]
      d15eae:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
      d15eb1:	ff c0                	inc    eax
      d15eb3:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
      d15eb6:	bf a8 00 00 00       	mov    edi,0xa8
      d15ebb:	e8 40 80 ad 00       	call   17edf00 <_Znwm@plt>
      d15ec0:	49 89 c7             	mov    r15,rax
      d15ec3:	48 89 c7             	mov    rdi,rax
      d15ec6:	e8 9b 53 01 00       	call   d2b266 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x278206>
      d15ecb:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      d15ece:	41 8d 4e 01          	lea    ecx,[r14+0x1]
      d15ed2:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx
      d15ed5:	44 89 f1             	mov    ecx,r14d
      d15ed8:	4c 89 3c c8          	mov    QWORD PTR [rax+rcx*8],r15
      d15edc:	eb af                	jmp    d15e8d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262e2d>
      d15ede:	53                   	push   rbx
      d15edf:	48 89 fb             	mov    rbx,rdi
      d15ee2:	6a 10                	push   0x10
      d15ee4:	5f                   	pop    rdi
      d15ee5:	e8 16 80 ad 00       	call   17edf00 <_Znwm@plt>
      d15eea:	48 8d 0d 87 ce b0 00 	lea    rcx,[rip+0xb0ce87]        # 1822d78 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18a38>
    ... truncated 522 instructions ...
```

## Analysis: from bundle+0x18 vector
- initial `rdi`: `bundle+0x18`
- tracked refs: `9`
- tracked writes: `3`
- writes resolving exactly to `bundle+0x30`: `0`

### Writes
| addr | tracked location | resolved bundle offset | instruction |
|---|---|---:|---|
| `0xd15daf` | `bundle+0x18+0xc` | `0x24` | `d15daf:	89 77 0c             	mov    DWORD PTR [rdi+0xc],esi` |
| `0xd15dca` | `bundle+0x18` | `0x18` | `d15dca:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xd15e15` | `bundle+0x18+0x18+0x8` | `0x20` | `d15e15:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx` |

### Calls
| call | tracked args | instruction |
|---|---|---|
| `0xd15dc5` | `rdi=load(bundle+0x18+0)` | `d15dc5:	e8 96 90 ad 00       	call   17eee60 <realloc@plt>` |
| `0xd15dd8` | `` | `d15dd8:	e8 23 8e ad 00       	call   17eec00 <malloc@plt>` |
| `0xd15e33` | `` | `d15e33:	e8 60 ff ff ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0xd15e47` | `` | `d15e47:	e8 b4 80 ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd15ea5` | `` | `d15ea5:	e8 ee fe ff ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0xd15ebb` | `` | `d15ebb:	e8 40 80 ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd15ec6` | `` | `d15ec6:	e8 9b 53 01 00       	call   d2b266 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x278206>` |
| `0xd15ee5` | `` | `d15ee5:	e8 16 80 ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd15f5e` | `` | `d15f5e:	e8 4f 00 00 00       	call   d15fb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262f52>` |
| `0xd15f6f` | `` | `d15f6f:	e8 2c 01 00 00       	call   d160a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263040>` |
| `0xd15f92` | `` | `d15f92:	e8 19 9b ad 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xd15fa2` | `` | `d15fa2:	e8 ef a7 e2 ff       	call   b40796 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d736>` |
| `0xd15ffd` | `` | `d15ffd:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]` |
| `0xd1600b` | `` | `d1600b:	e8 7a 01 00 00       	call   d1618a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26312a>` |
| `0xd1603d` | `` | `d1603d:	e8 1e 76 92 00       	call   163d660 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387ce>` |
| `0xd16047` | `` | `d16047:	e8 3a 84 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xd1606e` | `` | `d1606e:	e8 13 84 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xd1607d` | `` | `d1607d:	e8 08 01 00 00       	call   d1618a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26312a>` |
| `0xd16095` | `` | `d16095:	e8 36 9c d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xd1609a` | `` | `d1609a:	e8 11 9a ad 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xd160e0` | `` | `d160e0:	ff d5                	call   rbp` |
| `0xd16105` | `` | `d16105:	ff d5                	call   rbp` |
| `0xd16111` | `` | `d16111:	e8 9a 00 00 00       	call   d161b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263150>` |
| `0xd1613f` | `` | `d1613f:	e8 18 93 f3 ff       	call   c4f45c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19c3fc>` |
| `0xd1615c` | `` | `d1615c:	e8 79 00 00 00       	call   d161da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26317a>` |
| `0xd1619e` | `` | `d1619e:	ff d0                	call   rax` |
| `0xd161aa` | `` | `d161aa:	e8 f6 38 d6 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xd161ba` | `` | `d161ba:	e8 6f 58 d6 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>` |
| `0xd161f3` | `` | `d161f3:	e8 b8 ff ff ff       	call   d161b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263150>` |
| `0xd16215` | `` | `d16215:	e8 e6 7c ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd16272` | `` | `d16272:	e8 9d 78 92 00       	call   163db14 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38c82>` |
| `0xd16287` | `` | `d16287:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xd16296` | `` | `d16296:	e8 cb 3b 9b 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>` |
| `0xd162b0` | `` | `d162b0:	e8 d1 81 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xd162c8` | `` | `d162c8:	e8 b9 81 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xd162e0` | `` | `d162e0:	e8 eb 99 d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xd162e5` | `` | `d162e5:	e8 c6 97 ad 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xd162f1` | `` | `d162f1:	e8 0a 7c ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd16333` | `` | `d16333:	e8 c8 7b ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd163ce` | `` | `d163ce:	e8 7f f9 de ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>` |
| `0xd163e8` | `` | `d163e8:	e8 a5 f3 a4 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0xd1640d` | `` | `d1640d:	e8 10 ea 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>` |
| `0xd16417` | `` | `d16417:	e8 4e 3b d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xd1641f` | `` | `d1641f:	e8 0c 09 d9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0xd16429` | `` | `d16429:	e8 b6 85 da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>` |
| `0xd1645d` | `` | `d1645d:	e8 08 3b d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xd16465` | `` | `d16465:	e8 c6 08 d9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0xd16474` | `` | `d16474:	e8 6b 85 da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>` |
| `0xd1648f` | `` | `d1648f:	e8 3c 98 d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xd16494` | `` | `d16494:	e8 17 96 ad 00       	call   17efab0 <__stack_chk_fail@plt>` |

## Analysis: from bundle+0x58 vector
- initial `rdi`: `bundle+0x58`
- tracked refs: `9`
- tracked writes: `3`
- writes resolving exactly to `bundle+0x30`: `0`

### Writes
| addr | tracked location | resolved bundle offset | instruction |
|---|---|---:|---|
| `0xd15daf` | `bundle+0x58+0xc` | `0x64` | `d15daf:	89 77 0c             	mov    DWORD PTR [rdi+0xc],esi` |
| `0xd15dca` | `bundle+0x58` | `0x58` | `d15dca:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xd15e15` | `bundle+0x58+0x18+0x8` | `0x60` | `d15e15:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx` |

### Calls
| call | tracked args | instruction |
|---|---|---|
| `0xd15dc5` | `rdi=load(bundle+0x58+0)` | `d15dc5:	e8 96 90 ad 00       	call   17eee60 <realloc@plt>` |
| `0xd15dd8` | `` | `d15dd8:	e8 23 8e ad 00       	call   17eec00 <malloc@plt>` |
| `0xd15e33` | `` | `d15e33:	e8 60 ff ff ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0xd15e47` | `` | `d15e47:	e8 b4 80 ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd15ea5` | `` | `d15ea5:	e8 ee fe ff ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0xd15ebb` | `` | `d15ebb:	e8 40 80 ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd15ec6` | `` | `d15ec6:	e8 9b 53 01 00       	call   d2b266 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x278206>` |
| `0xd15ee5` | `` | `d15ee5:	e8 16 80 ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd15f5e` | `` | `d15f5e:	e8 4f 00 00 00       	call   d15fb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262f52>` |
| `0xd15f6f` | `` | `d15f6f:	e8 2c 01 00 00       	call   d160a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263040>` |
| `0xd15f92` | `` | `d15f92:	e8 19 9b ad 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xd15fa2` | `` | `d15fa2:	e8 ef a7 e2 ff       	call   b40796 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d736>` |
| `0xd15ffd` | `` | `d15ffd:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]` |
| `0xd1600b` | `` | `d1600b:	e8 7a 01 00 00       	call   d1618a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26312a>` |
| `0xd1603d` | `` | `d1603d:	e8 1e 76 92 00       	call   163d660 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387ce>` |
| `0xd16047` | `` | `d16047:	e8 3a 84 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xd1606e` | `` | `d1606e:	e8 13 84 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xd1607d` | `` | `d1607d:	e8 08 01 00 00       	call   d1618a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26312a>` |
| `0xd16095` | `` | `d16095:	e8 36 9c d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xd1609a` | `` | `d1609a:	e8 11 9a ad 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xd160e0` | `` | `d160e0:	ff d5                	call   rbp` |
| `0xd16105` | `` | `d16105:	ff d5                	call   rbp` |
| `0xd16111` | `` | `d16111:	e8 9a 00 00 00       	call   d161b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263150>` |
| `0xd1613f` | `` | `d1613f:	e8 18 93 f3 ff       	call   c4f45c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19c3fc>` |
| `0xd1615c` | `` | `d1615c:	e8 79 00 00 00       	call   d161da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26317a>` |
| `0xd1619e` | `` | `d1619e:	ff d0                	call   rax` |
| `0xd161aa` | `` | `d161aa:	e8 f6 38 d6 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xd161ba` | `` | `d161ba:	e8 6f 58 d6 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>` |
| `0xd161f3` | `` | `d161f3:	e8 b8 ff ff ff       	call   d161b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263150>` |
| `0xd16215` | `` | `d16215:	e8 e6 7c ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd16272` | `` | `d16272:	e8 9d 78 92 00       	call   163db14 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38c82>` |
| `0xd16287` | `` | `d16287:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xd16296` | `` | `d16296:	e8 cb 3b 9b 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>` |
| `0xd162b0` | `` | `d162b0:	e8 d1 81 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xd162c8` | `` | `d162c8:	e8 b9 81 d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xd162e0` | `` | `d162e0:	e8 eb 99 d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xd162e5` | `` | `d162e5:	e8 c6 97 ad 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xd162f1` | `` | `d162f1:	e8 0a 7c ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd16333` | `` | `d16333:	e8 c8 7b ad 00       	call   17edf00 <_Znwm@plt>` |
| `0xd163ce` | `` | `d163ce:	e8 7f f9 de ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>` |
| `0xd163e8` | `` | `d163e8:	e8 a5 f3 a4 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0xd1640d` | `` | `d1640d:	e8 10 ea 90 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>` |
| `0xd16417` | `` | `d16417:	e8 4e 3b d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xd1641f` | `` | `d1641f:	e8 0c 09 d9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0xd16429` | `` | `d16429:	e8 b6 85 da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>` |
| `0xd1645d` | `` | `d1645d:	e8 08 3b d6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xd16465` | `` | `d16465:	e8 c6 08 d9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0xd16474` | `` | `d16474:	e8 6b 85 da ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>` |
| `0xd1648f` | `` | `d1648f:	e8 3c 98 d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xd16494` | `` | `d16494:	e8 17 96 ad 00       	call   17efab0 <__stack_chk_fail@plt>` |

## Interpretation
- A write through `rdi+0x18` when `rdi=bundle+0x18` resolves to `bundle+0x30`.
- If this report still shows zero `bundle+0x30` writes, then `[rdx+0x30]` likely belongs to a different substructure/base than the `bundle+0x18` vector helper path.
