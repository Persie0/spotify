# Restrictions substructure writer trace

Purpose: test whether `RestrictionsSetupImpl` field `bundle+0x30` is written indirectly as `bundle+0x18` substructure offset `+0x18`.

Context from `0x153cbfc`:
```text
153cc94  mov rdi, rbp        ; rbp = bundle+0x18
153cc97  call 1507a9e        ; candidate vector/slot helper
153cc9c  mov rdi, rax
153cc9f  mov rsi, rbx        ; descriptor
153cca2  call 153d2a4        ; fill returned slot
```

## `bundle+0x18 vector slot helper` at `0x1507a9e`
- label: `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`
- initial `rdi` interpretation: `bundle+0x18`
- instructions scanned: `286`
- arg/substructure refs: `4`
- arg/substructure writes: `1`
- writes resolving exactly to `bundle+0x30`: `0`

### Body excerpt
```text
     1507a9e:	41 56                	push   r14
     1507aa0:	53                   	push   rbx
     1507aa1:	50                   	push   rax
     1507aa2:	48 89 fb             	mov    rbx,rdi
     1507aa5:	44 8b 77 08          	mov    r14d,DWORD PTR [rdi+0x8]
     1507aa9:	8b 47 10             	mov    eax,DWORD PTR [rdi+0x10]
     1507aac:	41 39 c6             	cmp    r14d,eax
     1507aaf:	73 17                	jae    1507ac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d04c>
     1507ab1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1507ab4:	44 89 f1             	mov    ecx,r14d
     1507ab7:	ff c1                	inc    ecx
     1507ab9:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx
     1507abc:	4a 8b 04 f0          	mov    rax,QWORD PTR [rax+r14*8]
     1507ac0:	48 83 c4 08          	add    rsp,0x8
     1507ac4:	5b                   	pop    rbx
     1507ac5:	41 5e                	pop    r14
     1507ac7:	c3                   	ret
     1507ac8:	44 3b 73 0c          	cmp    r14d,DWORD PTR [rbx+0xc]
     1507acc:	75 15                	jne    1507ae3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d067>
     1507ace:	41 ff c6             	inc    r14d
     1507ad1:	48 89 df             	mov    rdi,rbx
     1507ad4:	44 89 f6             	mov    esi,r14d
     1507ad7:	e8 bc e2 80 ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>
     1507adc:	44 8b 73 08          	mov    r14d,DWORD PTR [rbx+0x8]
     1507ae0:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
     1507ae3:	ff c0                	inc    eax
     1507ae5:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
     1507ae8:	6a 38                	push   0x38
     1507aea:	5f                   	pop    rdi
     1507aeb:	e8 10 64 2e 00       	call   17edf00 <_Znwm@plt>
     1507af0:	48 8d 0d 01 68 37 00 	lea    rcx,[rip+0x376801]        # 187e2f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a9e0>
     1507af7:	48 89 08             	mov    QWORD PTR [rax],rcx
     1507afa:	0f 57 c0             	xorps  xmm0,xmm0
     1507afd:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     1507b01:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     1507b05:	83 60 30 00          	and    DWORD PTR [rax+0x30],0x0
     1507b09:	83 60 08 00          	and    DWORD PTR [rax+0x8],0x0
     1507b0d:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
     1507b10:	41 8d 56 01          	lea    edx,[r14+0x1]
     1507b14:	89 53 08             	mov    DWORD PTR [rbx+0x8],edx
     1507b17:	44 89 f2             	mov    edx,r14d
     1507b1a:	48 89 04 d1          	mov    QWORD PTR [rcx+rdx*8],rax
     1507b1e:	eb a0                	jmp    1507ac0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d044>
     1507b20:	41 56                	push   r14
     1507b22:	53                   	push   rbx
     1507b23:	50                   	push   rax
     1507b24:	48 89 fb             	mov    rbx,rdi
     1507b27:	44 8b 77 08          	mov    r14d,DWORD PTR [rdi+0x8]
     1507b2b:	8b 47 10             	mov    eax,DWORD PTR [rdi+0x10]
     1507b2e:	41 39 c6             	cmp    r14d,eax
     1507b31:	73 17                	jae    1507b4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d0ce>
     1507b33:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1507b36:	44 89 f1             	mov    ecx,r14d
     1507b39:	ff c1                	inc    ecx
     1507b3b:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx
     1507b3e:	4a 8b 04 f0          	mov    rax,QWORD PTR [rax+r14*8]
     1507b42:	48 83 c4 08          	add    rsp,0x8
     1507b46:	5b                   	pop    rbx
     1507b47:	41 5e                	pop    r14
     1507b49:	c3                   	ret
     1507b4a:	44 3b 73 0c          	cmp    r14d,DWORD PTR [rbx+0xc]
     1507b4e:	75 15                	jne    1507b65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d0e9>
     1507b50:	41 ff c6             	inc    r14d
     1507b53:	48 89 df             	mov    rdi,rbx
     1507b56:	44 89 f6             	mov    esi,r14d
     1507b59:	e8 3a e2 80 ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>
     1507b5e:	44 8b 73 08          	mov    r14d,DWORD PTR [rbx+0x8]
     1507b62:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
     1507b65:	ff c0                	inc    eax
     1507b67:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
    ... truncated 216 instructions ...
```

### Writes through tracked args/substructures
| addr | tracked location | resolved bundle offset | instruction |
|---|---|---:|---|
| `0x1507ab9` | `bundle+0x18+0x8` | `0x20` | `1507ab9:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx` |

### Calls with tracked args
| call | tracked args | instruction |
|---|---|---|
| `0x1507ad7` | `rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `1507ad7:	e8 bc e2 80 ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0x1507aeb` | `rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `1507aeb:	e8 10 64 2e 00       	call   17edf00 <_Znwm@plt>` |
| `0x1507b59` | `r8=arg:r8, r9=arg:r9` | `1507b59:	e8 3a e2 80 ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0x1507b6d` | `r8=arg:r8, r9=arg:r9` | `1507b6d:	e8 8e 63 2e 00       	call   17edf00 <_Znwm@plt>` |
| `0x1507bcc` | `r8=arg:r8, r9=arg:r9` | `1507bcc:	e8 5f 37 5a ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0x1507bd9` | `r8=arg:r8, r9=arg:r9` | `1507bd9:	e8 2c 00 00 00       	call   1507c0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d18e>` |
| `0x1507bfd` | `r8=arg:r8, r9=arg:r9` | `1507bfd:	e8 ae 7e 2e 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x1507c05` | `r8=arg:r8, r9=arg:r9` | `1507c05:	e8 9b 1e 57 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x1507c8f` | `r8=arg:r8, r9=arg:r9` | `1507c8f:	e8 42 12 5d ff       	call   ad8ed6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e76>` |
| `0x1507caf` | `r8=arg:r8, r9=arg:r9` | `1507caf:	e8 de da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507cd0` | `r8=arg:r8, r9=arg:r9` | `1507cd0:	e8 bd da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507cf1` | `r8=arg:r8, r9=arg:r9` | `1507cf1:	e8 9c da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507d12` | `r8=arg:r8, r9=arg:r9` | `1507d12:	e8 7b da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507d33` | `r8=arg:r8, r9=arg:r9` | `1507d33:	e8 5a da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507d50` | `r8=arg:r8, r9=arg:r9` | `1507d50:	e8 3d da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507d70` | `r8=arg:r8, r9=arg:r9` | `1507d70:	e8 1d da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507ddf` | `r8=arg:r8, r9=arg:r9` | `1507ddf:	e8 e0 7e 27 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>` |
| `0x1507df7` | `r8=arg:r8, r9=arg:r9` | `1507df7:	e8 f4 62 2e 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0x1507e08` | `r8=arg:r8, r9=arg:r9` | `1507e08:	e8 33 61 2e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0x1507e12` | `r8=arg:r8, r9=arg:r9` | `1507e12:	e8 1f 3a 57 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0x1507e1f` | `r8=arg:r8, r9=arg:r9` | `1507e1f:	e8 e6 d1 2b 00       	call   17c500a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179176>` |
| `0x1507e29` | `r8=arg:r8, r9=arg:r9` | `1507e29:	e8 62 60 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x1507e33` | `r8=arg:r8, r9=arg:r9` | `1507e33:	e8 f8 3f 5a ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>` |
| `0x1507e3d` | `r8=arg:r8, r9=arg:r9` | `1507e3d:	e8 4e 60 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x1507e47` | `r8=arg:r8, r9=arg:r9` | `1507e47:	e8 20 5f 03 00       	call   153dd6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3832f0>` |
| `0x1507e79` | `r8=arg:r8, r9=arg:r9` | `1507e79:	e8 12 60 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x1507e88` | `r8=arg:r8, r9=arg:r9` | `1507e88:	e8 a3 3f 5a ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>` |
| `0x1507e97` | `r8=arg:r8, r9=arg:r9` | `1507e97:	e8 f4 5f 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x1507ea8` | `r8=arg:r8, r9=arg:r9` | `1507ea8:	e8 bf 5e 03 00       	call   153dd6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3832f0>` |

## `bundle+0x58 vector slot helper` at `0x1507b20`
- label: `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`
- initial `rdi` interpretation: `bundle+0x58`
- instructions scanned: `291`
- arg/substructure refs: `4`
- arg/substructure writes: `1`
- writes resolving exactly to `bundle+0x30`: `0`

### Body excerpt
```text
     1507b20:	41 56                	push   r14
     1507b22:	53                   	push   rbx
     1507b23:	50                   	push   rax
     1507b24:	48 89 fb             	mov    rbx,rdi
     1507b27:	44 8b 77 08          	mov    r14d,DWORD PTR [rdi+0x8]
     1507b2b:	8b 47 10             	mov    eax,DWORD PTR [rdi+0x10]
     1507b2e:	41 39 c6             	cmp    r14d,eax
     1507b31:	73 17                	jae    1507b4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d0ce>
     1507b33:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1507b36:	44 89 f1             	mov    ecx,r14d
     1507b39:	ff c1                	inc    ecx
     1507b3b:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx
     1507b3e:	4a 8b 04 f0          	mov    rax,QWORD PTR [rax+r14*8]
     1507b42:	48 83 c4 08          	add    rsp,0x8
     1507b46:	5b                   	pop    rbx
     1507b47:	41 5e                	pop    r14
     1507b49:	c3                   	ret
     1507b4a:	44 3b 73 0c          	cmp    r14d,DWORD PTR [rbx+0xc]
     1507b4e:	75 15                	jne    1507b65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d0e9>
     1507b50:	41 ff c6             	inc    r14d
     1507b53:	48 89 df             	mov    rdi,rbx
     1507b56:	44 89 f6             	mov    esi,r14d
     1507b59:	e8 3a e2 80 ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>
     1507b5e:	44 8b 73 08          	mov    r14d,DWORD PTR [rbx+0x8]
     1507b62:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
     1507b65:	ff c0                	inc    eax
     1507b67:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
     1507b6a:	6a 48                	push   0x48
     1507b6c:	5f                   	pop    rdi
     1507b6d:	e8 8e 63 2e 00       	call   17edf00 <_Znwm@plt>
     1507b72:	48 8d 0d e7 67 37 00 	lea    rcx,[rip+0x3767e7]        # 187e360 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3aa48>
     1507b79:	48 89 08             	mov    QWORD PTR [rax],rcx
     1507b7c:	0f 57 c0             	xorps  xmm0,xmm0
     1507b7f:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     1507b83:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     1507b87:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     1507b8b:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
     1507b90:	83 60 08 00          	and    DWORD PTR [rax+0x8],0x0
     1507b94:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
     1507b97:	41 8d 56 01          	lea    edx,[r14+0x1]
     1507b9b:	89 53 08             	mov    DWORD PTR [rbx+0x8],edx
     1507b9e:	44 89 f2             	mov    edx,r14d
     1507ba1:	48 89 04 d1          	mov    QWORD PTR [rcx+rdx*8],rax
     1507ba5:	eb 9b                	jmp    1507b42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d0c6>
     1507ba7:	cc                   	int3
     1507ba8:	e9 01 00 00 00       	jmp    1507bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d132>
     1507bad:	cc                   	int3
     1507bae:	53                   	push   rbx
     1507baf:	48 83 ec 20          	sub    rsp,0x20
     1507bb3:	48 89 fe             	mov    rsi,rdi
     1507bb6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1507bbd:	00 00 
     1507bbf:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     1507bc4:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
     1507bc9:	48 89 df             	mov    rdi,rbx
     1507bcc:	e8 5f 37 5a ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     1507bd1:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1507bd4:	48 85 ff             	test   rdi,rdi
     1507bd7:	74 05                	je     1507bde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d162>
     1507bd9:	e8 2c 00 00 00       	call   1507c0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d18e>
     1507bde:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1507be3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1507bea:	00 00 
     1507bec:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     1507bf1:	75 0a                	jne    1507bfd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d181>
     1507bf3:	48 83 c4 20          	add    rsp,0x20
     1507bf7:	5b                   	pop    rbx
     1507bf8:	e9 89 68 59 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     1507bfd:	e8 ae 7e 2e 00       	call   17efab0 <__stack_chk_fail@plt>
     1507c02:	48 89 c7             	mov    rdi,rax
    ... truncated 221 instructions ...
```

### Writes through tracked args/substructures
| addr | tracked location | resolved bundle offset | instruction |
|---|---|---:|---|
| `0x1507b3b` | `bundle+0x58+0x8` | `0x60` | `1507b3b:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx` |

### Calls with tracked args
| call | tracked args | instruction |
|---|---|---|
| `0x1507b59` | `rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `1507b59:	e8 3a e2 80 ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0x1507b6d` | `rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `1507b6d:	e8 8e 63 2e 00       	call   17edf00 <_Znwm@plt>` |
| `0x1507bcc` | `r8=arg:r8, r9=arg:r9` | `1507bcc:	e8 5f 37 5a ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0x1507bd9` | `r8=arg:r8, r9=arg:r9` | `1507bd9:	e8 2c 00 00 00       	call   1507c0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d18e>` |
| `0x1507bfd` | `r8=arg:r8, r9=arg:r9` | `1507bfd:	e8 ae 7e 2e 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x1507c05` | `r8=arg:r8, r9=arg:r9` | `1507c05:	e8 9b 1e 57 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x1507c8f` | `r8=arg:r8, r9=arg:r9` | `1507c8f:	e8 42 12 5d ff       	call   ad8ed6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e76>` |
| `0x1507caf` | `r8=arg:r8, r9=arg:r9` | `1507caf:	e8 de da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507cd0` | `r8=arg:r8, r9=arg:r9` | `1507cd0:	e8 bd da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507cf1` | `r8=arg:r8, r9=arg:r9` | `1507cf1:	e8 9c da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507d12` | `r8=arg:r8, r9=arg:r9` | `1507d12:	e8 7b da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507d33` | `r8=arg:r8, r9=arg:r9` | `1507d33:	e8 5a da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507d50` | `r8=arg:r8, r9=arg:r9` | `1507d50:	e8 3d da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507d70` | `r8=arg:r8, r9=arg:r9` | `1507d70:	e8 1d da 25 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0x1507ddf` | `r8=arg:r8, r9=arg:r9` | `1507ddf:	e8 e0 7e 27 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>` |
| `0x1507df7` | `r8=arg:r8, r9=arg:r9` | `1507df7:	e8 f4 62 2e 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0x1507e08` | `r8=arg:r8, r9=arg:r9` | `1507e08:	e8 33 61 2e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0x1507e12` | `r8=arg:r8, r9=arg:r9` | `1507e12:	e8 1f 3a 57 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0x1507e1f` | `r8=arg:r8, r9=arg:r9` | `1507e1f:	e8 e6 d1 2b 00       	call   17c500a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179176>` |
| `0x1507e29` | `r8=arg:r8, r9=arg:r9` | `1507e29:	e8 62 60 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x1507e33` | `r8=arg:r8, r9=arg:r9` | `1507e33:	e8 f8 3f 5a ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>` |
| `0x1507e3d` | `r8=arg:r8, r9=arg:r9` | `1507e3d:	e8 4e 60 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x1507e47` | `r8=arg:r8, r9=arg:r9` | `1507e47:	e8 20 5f 03 00       	call   153dd6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3832f0>` |
| `0x1507e79` | `r8=arg:r8, r9=arg:r9` | `1507e79:	e8 12 60 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x1507e88` | `r8=arg:r8, r9=arg:r9` | `1507e88:	e8 a3 3f 5a ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>` |
| `0x1507e97` | `r8=arg:r8, r9=arg:r9` | `1507e97:	e8 f4 5f 2e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x1507ea8` | `r8=arg:r8, r9=arg:r9` | `1507ea8:	e8 bf 5e 03 00       	call   153dd6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3832f0>` |
| `0x1507ec3` | `r8=arg:r8, r9=arg:r9` | `1507ec3:	e8 08 7e 56 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x1507ec8` | `r8=arg:r8, r9=arg:r9` | `1507ec8:	e8 e3 7b 2e 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x1507ed4` | `r8=arg:r8, r9=arg:r9` | `1507ed4:	e8 05 00 00 00       	call   1507ede <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d462>` |
| `0x1507eed` | `r8=arg:r8, r9=arg:r9` | `1507eed:	e8 3a 25 28 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>` |
| `0x1507f00` | `r8=arg:r8, r9=arg:r9` | `1507f00:	e8 fb 5f 2e 00       	call   17edf00 <_Znwm@plt>` |
| `0x1507f0d` | `r8=arg:r8, r9=arg:r9` | `1507f0d:	e8 e6 5e 03 00       	call   153ddf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38337c>` |

## `fill object returned by bundle+0x18 helper` at `0x153d2a4`
- label: `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`
- initial `rdi` interpretation: `plain arg:rdi`
- instructions scanned: `333`
- arg/substructure refs: `20`
- arg/substructure writes: `7`
- writes resolving exactly to `bundle+0x30`: `0`

### Body excerpt
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
     153d316:	48 89 df             	mov    rdi,rbx
     153d319:	4c 89 fe             	mov    rsi,r15
     153d31c:	e8 11 2d 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>
     153d321:	0f b6 c0             	movzx  eax,al
     153d324:	01 c0                	add    eax,eax
     153d326:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax
     153d32a:	eb ae                	jmp    153d2da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38285e>
     153d32c:	48 89 df             	mov    rdi,rbx
     153d32f:	4c 89 e6             	mov    rsi,r12
     153d332:	e8 fd 2e 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>
     153d337:	0f b6 c0             	movzx  eax,al
     153d33a:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax
     153d33e:	eb 9a                	jmp    153d2da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38285e>
     153d340:	48 89 df             	mov    rdi,rbx
     153d343:	e8 de 2b 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>
     153d348:	eb b1                	jmp    153d2fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38287f>
     153d34a:	48 89 e6             	mov    rsi,rsp
     153d34d:	48 89 df             	mov    rdi,rbx
     153d350:	e8 5b 2c 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>
     153d355:	80 3b 00             	cmp    BYTE PTR [rbx],0x0
     153d358:	0f 95 c0             	setne  al
     153d35b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     153d362:	00 00 
     153d364:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
     153d369:	75 0c                	jne    153d377 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3828fb>
     153d36b:	48 83 c4 18          	add    rsp,0x18
     153d36f:	5b                   	pop    rbx
     153d370:	41 5c                	pop    r12
     153d372:	41 5e                	pop    r14
     153d374:	41 5f                	pop    r15
     153d376:	c3                   	ret
     153d377:	e8 34 27 2b 00       	call   17efab0 <__stack_chk_fail@plt>
    ... truncated 263 instructions ...
```

### Writes through tracked args/substructures
| addr | tracked location | resolved bundle offset | instruction |
|---|---|---:|---|
| `0x153d2ec` | `arg:rsi+0x38` | `?` | `153d2ec:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153d2f2` | `arg:rsi+0x10` | `?` | `153d2f2:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153d2f8` | `arg:rsi+0x18` | `?` | `153d2f8:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x153d326` | `arg:rdi+0x8` | `?` | `153d326:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153d33a` | `arg:rdi+0x8` | `?` | `153d33a:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153d444` | `load(arg:rsi+30)+0x30` | `?` | `153d444:	41 89 46 30          	mov    DWORD PTR [r14+0x30],eax` |
| `0x153d44b` | `load(arg:rsi+30)+0x8` | `?` | `153d44b:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |

### Calls with tracked args
| call | tracked args | instruction |
|---|---|---|
| `0x153d2cd` | `rdi=arg:rsi, rdx=arg:rdi+0x10, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `153d2cd:	e8 98 2b 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |
| `0x153d30f` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153d30f:	e8 32 30 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153d31c` | `rdi=arg:rsi, rsi=arg:rdi+0x30, r8=arg:r8, r9=arg:r9` | `153d31c:	e8 11 2d 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x153d332` | `rdi=arg:rsi, rsi=arg:rdi+0x18, r8=arg:r8, r9=arg:r9` | `153d332:	e8 fd 2e 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>` |
| `0x153d343` | `rdi=arg:rsi, rsi=arg:rdi+0x18, r8=arg:r8, r9=arg:r9` | `153d343:	e8 de 2b 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>` |
| `0x153d350` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153d350:	e8 5b 2c 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>` |
| `0x153d377` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153d377:	e8 34 27 2b 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x153d399` | `rsi=load(arg:rsi+18), rdx=load(arg:rsi+20), r8=arg:r8, r9=arg:r9` | `153d399:	e8 26 7f b5 ff       	call   10952c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c6da>` |
| `0x153d3ad` | `rsi=load(arg:rsi+30), rdx=load(arg:rsi+20), r8=arg:r8, r9=arg:r9` | `153d3ad:	e8 42 7f b5 ff       	call   10952f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c70a>` |
| `0x153d3d7` | `rdi=load(arg:rsi+30), r8=arg:r8, r9=arg:r9` | `153d3d7:	e8 42 22 12 00       	call   165f61e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1378a>` |
| `0x153d3ee` | `rdi=load(arg:rsi+30), r8=arg:r8, r9=arg:r9` | `153d3ee:	e8 61 1f 12 00       	call   165f354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x134c0>` |
| `0x153d405` | `rdi=load(arg:rsi+30), r8=arg:r8, r9=arg:r9` | `153d405:	e8 16 24 12 00       	call   165f820 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1398c>` |
| `0x153d435` | `rdi=load(arg:rsi+30)+0x18, r8=arg:r8, r9=arg:r9` | `153d435:	e8 46 0c 2b 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>` |
| `0x153d476` | `r8=arg:r8, r9=arg:r9` | `153d476:	e8 cb 2e 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153d487` | `r8=arg:r8, r9=arg:r9` | `153d487:	e8 74 0a 2b 00       	call   17edf00 <_Znwm@plt>` |
| `0x153d4b4` | `r8=arg:r8, r9=arg:r9` | `153d4b4:	e8 47 0a 2b 00       	call   17edf00 <_Znwm@plt>` |
| `0x153d4e0` | `r8=arg:r8, r9=arg:r9` | `153d4e0:	e8 23 d5 56 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>` |
| `0x153d4f3` | `r8=arg:r8, r9=arg:r9` | `153d4f3:	e8 8c 4f 24 00       	call   1782484 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1365f0>` |
| `0x153d4fd` | `r8=arg:r8, r9=arg:r9` | `153d4fd:	e8 a3 c5 53 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x153d506` | `r8=arg:r8, r9=arg:r9` | `153d506:	e8 cd ff ff ff       	call   153d4d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382a5c>` |
| `0x153d606` | `r8=arg:r8, r9=arg:r9` | `153d606:	e8 fd d3 56 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>` |
| `0x153d60f` | `r8=arg:r8, r9=arg:r9` | `153d60f:	e8 94 82 22 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>` |
| `0x153d627` | `r8=arg:r8, r9=arg:r9` | `153d627:	e8 7c 82 22 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>` |
| `0x153d636` | `r8=arg:r8, r9=arg:r9` | `153d636:	e8 c3 ff ff ff       	call   153d5fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382b82>` |
| `0x153d692` | `r8=arg:r8, r9=arg:r9` | `153d692:	e8 71 d3 56 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>` |
| `0x153d69b` | `r8=arg:r8, r9=arg:r9` | `153d69b:	e8 08 82 22 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>` |
| `0x153d6b3` | `r8=arg:r8, r9=arg:r9` | `153d6b3:	e8 f0 81 22 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>` |
| `0x153d6c2` | `r8=arg:r8, r9=arg:r9` | `153d6c2:	e8 c3 ff ff ff       	call   153d68a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382c0e>` |

## `fill object returned by bundle+0x58 helper` at `0x153d0d0`
- label: `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`
- initial `rdi` interpretation: `plain arg:rdi`
- instructions scanned: `362`
- arg/substructure refs: `19`
- arg/substructure writes: `6`
- writes resolving exactly to `bundle+0x30`: `0`

### Body excerpt
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
     153d142:	48 89 df             	mov    rdi,rbx
     153d145:	4c 89 fe             	mov    rsi,r15
     153d148:	e8 e7 30 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>
     153d14d:	0f b6 c0             	movzx  eax,al
     153d150:	01 c0                	add    eax,eax
     153d152:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax
     153d156:	eb ae                	jmp    153d106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38268a>
     153d158:	48 89 df             	mov    rdi,rbx
     153d15b:	4c 89 e6             	mov    rsi,r12
     153d15e:	e8 d1 30 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>
     153d163:	0f b6 c0             	movzx  eax,al
     153d166:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax
     153d16a:	eb 9a                	jmp    153d106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38268a>
     153d16c:	48 89 df             	mov    rdi,rbx
     153d16f:	e8 b2 2d 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>
     153d174:	eb b1                	jmp    153d127 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3826ab>
     153d176:	48 89 e6             	mov    rsi,rsp
     153d179:	48 89 df             	mov    rdi,rbx
     153d17c:	e8 2f 2e 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>
     153d181:	80 3b 00             	cmp    BYTE PTR [rbx],0x0
     153d184:	0f 95 c0             	setne  al
     153d187:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     153d18e:	00 00 
     153d190:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
     153d195:	75 0c                	jne    153d1a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382727>
     153d197:	48 83 c4 18          	add    rsp,0x18
     153d19b:	5b                   	pop    rbx
     153d19c:	41 5c                	pop    r12
     153d19e:	41 5e                	pop    r14
     153d1a0:	41 5f                	pop    r15
     153d1a2:	c3                   	ret
     153d1a3:	e8 08 29 2b 00       	call   17efab0 <__stack_chk_fail@plt>
    ... truncated 292 instructions ...
```

### Writes through tracked args/substructures
| addr | tracked location | resolved bundle offset | instruction |
|---|---|---:|---|
| `0x153d118` | `arg:rsi+0x38` | `?` | `153d118:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153d11e` | `arg:rsi+0x10` | `?` | `153d11e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153d124` | `arg:rsi+0x18` | `?` | `153d124:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x153d152` | `arg:rdi+0x8` | `?` | `153d152:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153d166` | `arg:rdi+0x8` | `?` | `153d166:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153d257` | `load(arg:rsi+30)` | `?` | `153d257:	48 89 07             	mov    QWORD PTR [rdi],rax` |

### Calls with tracked args
| call | tracked args | instruction |
|---|---|---|
| `0x153d0f9` | `rdi=arg:rsi, rdx=arg:rdi+0x10, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `153d0f9:	e8 6c 2d 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |
| `0x153d13b` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153d13b:	e8 06 32 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153d148` | `rdi=arg:rsi, rsi=arg:rdi+0x30, r8=arg:r8, r9=arg:r9` | `153d148:	e8 e7 30 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>` |
| `0x153d15e` | `rdi=arg:rsi, rsi=arg:rdi+0x18, r8=arg:r8, r9=arg:r9` | `153d15e:	e8 d1 30 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>` |
| `0x153d16f` | `rdi=arg:rsi, rsi=arg:rdi+0x18, r8=arg:r8, r9=arg:r9` | `153d16f:	e8 b2 2d 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>` |
| `0x153d17c` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153d17c:	e8 2f 2e 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>` |
| `0x153d1a3` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153d1a3:	e8 08 29 2b 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x153d1c5` | `rsi=load(arg:rsi+18), rdx=load(arg:rsi+20), r8=arg:r8, r9=arg:r9` | `153d1c5:	e8 fa 80 b5 ff       	call   10952c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c6da>` |
| `0x153d1dd` | `rsi=load(arg:rsi+30), rdx=load(arg:rsi+38), r8=arg:r8, r9=arg:r9` | `153d1dd:	e8 e2 80 b5 ff       	call   10952c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c6da>` |
| `0x153d207` | `rdi=load(arg:rsi+30), r8=arg:r8, r9=arg:r9` | `153d207:	e8 12 24 12 00       	call   165f61e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1378a>` |
| `0x153d21e` | `rdi=load(arg:rsi+30), r8=arg:r8, r9=arg:r9` | `153d21e:	e8 fb 23 12 00       	call   165f61e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1378a>` |
| `0x153d235` | `rdi=load(arg:rsi+30), r8=arg:r8, r9=arg:r9` | `153d235:	e8 e6 25 12 00       	call   165f820 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1398c>` |
| `0x153d25e` | `r8=arg:r8, r9=arg:r9` | `153d25e:	e8 2d 0c 2b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x153d274` | `r8=arg:r8, r9=arg:r9` | `153d274:	e8 d3 ff ff ff       	call   153d24c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3827d0>` |
| `0x153d28a` | `r8=arg:r8, r9=arg:r9` | `153d28a:	e8 cb b3 56 ff       	call   aa865a <JNI_OnUnload@@Base+0x2ff27>` |
| `0x153d2cd` | `r8=arg:r8, r9=arg:r9` | `153d2cd:	e8 98 2b 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |
| `0x153d30f` | `r8=arg:r8, r9=arg:r9` | `153d30f:	e8 32 30 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153d31c` | `r8=arg:r8, r9=arg:r9` | `153d31c:	e8 11 2d 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x153d332` | `r8=arg:r8, r9=arg:r9` | `153d332:	e8 fd 2e 12 00       	call   1660234 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x143a0>` |
| `0x153d343` | `r8=arg:r8, r9=arg:r9` | `153d343:	e8 de 2b 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>` |
| `0x153d350` | `r8=arg:r8, r9=arg:r9` | `153d350:	e8 5b 2c 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>` |
| `0x153d377` | `r8=arg:r8, r9=arg:r9` | `153d377:	e8 34 27 2b 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x153d399` | `r8=arg:r8, r9=arg:r9` | `153d399:	e8 26 7f b5 ff       	call   10952c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c6da>` |
| `0x153d3ad` | `r8=arg:r8, r9=arg:r9` | `153d3ad:	e8 42 7f b5 ff       	call   10952f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c70a>` |
| `0x153d3d7` | `r8=arg:r8, r9=arg:r9` | `153d3d7:	e8 42 22 12 00       	call   165f61e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1378a>` |
| `0x153d3ee` | `r8=arg:r8, r9=arg:r9` | `153d3ee:	e8 61 1f 12 00       	call   165f354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x134c0>` |
| `0x153d405` | `r8=arg:r8, r9=arg:r9` | `153d405:	e8 16 24 12 00       	call   165f820 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1398c>` |
| `0x153d435` | `r8=arg:r8, r9=arg:r9` | `153d435:	e8 46 0c 2b 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>` |
| `0x153d476` | `r8=arg:r8, r9=arg:r9` | `153d476:	e8 cb 2e 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153d487` | `r8=arg:r8, r9=arg:r9` | `153d487:	e8 74 0a 2b 00       	call   17edf00 <_Znwm@plt>` |
| `0x153d4b4` | `r8=arg:r8, r9=arg:r9` | `153d4b4:	e8 47 0a 2b 00       	call   17edf00 <_Znwm@plt>` |
| `0x153d4e0` | `r8=arg:r8, r9=arg:r9` | `153d4e0:	e8 23 d5 56 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>` |

## `descriptor-to-bundle flag helper` at `0x1660032`
- label: `_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`
- initial `rdi` interpretation: `plain arg:rdi`
- instructions scanned: `371`
- arg/substructure refs: `92`
- arg/substructure writes: `29`
- writes resolving exactly to `bundle+0x30`: `0`

### Body excerpt
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
     166005b:	4c 8d 77 40          	lea    r14,[rdi+0x40]
     166005f:	4c 89 f6             	mov    rsi,r14
     1660062:	e8 d5 06 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>
     1660067:	84 c0                	test   al,al
     1660069:	74 0e                	je     1660079 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141e5>
     166006b:	41 8b 06             	mov    eax,DWORD PTR [r14]
     166006e:	89 03                	mov    DWORD PTR [rbx],eax
     1660070:	b0 01                	mov    al,0x1
     1660072:	eb 07                	jmp    166007b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141e7>
     1660074:	e8 cd 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>
     1660079:	31 c0                	xor    eax,eax
     166007b:	48 83 c4 08          	add    rsp,0x8
     166007f:	5b                   	pop    rbx
     1660080:	41 5e                	pop    r14
     1660082:	c3                   	ret
     1660083:	cc                   	int3
     1660084:	f6 47 38 07          	test   BYTE PTR [rdi+0x38],0x7
     1660088:	0f 84 ee 04 00 00    	je     166057c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146e8>
     166008e:	50                   	push   rax
     166008f:	e8 b2 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>
     1660094:	31 c0                	xor    eax,eax
     1660096:	59                   	pop    rcx
     1660097:	c3                   	ret
     1660098:	41 56                	push   r14
     166009a:	53                   	push   rbx
     166009b:	50                   	push   rax
     166009c:	48 89 f3             	mov    rbx,rsi
     166009f:	4c 8d 77 40          	lea    r14,[rdi+0x40]
     16600a3:	4c 89 f6             	mov    rsi,r14
     16600a6:	e8 37 00 00 00       	call   16600e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1424e>
     16600ab:	84 c0                	test   al,al
     16600ad:	74 05                	je     16600b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14220>
     16600af:	41 8a 0e             	mov    cl,BYTE PTR [r14]
     16600b2:	88 0b                	mov    BYTE PTR [rbx],cl
     16600b4:	48 83 c4 08          	add    rsp,0x8
     16600b8:	5b                   	pop    rbx
     16600b9:	41 5e                	pop    r14
     16600bb:	c3                   	ret
     16600bc:	41 56                	push   r14
     16600be:	53                   	push   rbx
     16600bf:	50                   	push   rax
     16600c0:	48 89 f3             	mov    rbx,rsi
     16600c3:	4c 8d 77 40          	lea    r14,[rdi+0x40]
     16600c7:	4c 89 f6             	mov    rsi,r14
     16600ca:	e8 13 00 00 00       	call   16600e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1424e>
     16600cf:	84 c0                	test   al,al
     16600d1:	74 07                	je     16600da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14246>
     16600d3:	41 0f b7 0e          	movzx  ecx,WORD PTR [r14]
     16600d7:	66 89 0b             	mov    WORD PTR [rbx],cx
     16600da:	48 83 c4 08          	add    rsp,0x8
     16600de:	5b                   	pop    rbx
     16600df:	41 5e                	pop    r14
     16600e1:	c3                   	ret
     16600e2:	41 56                	push   r14
    ... truncated 301 instructions ...
```

### Writes through tracked args/substructures
| addr | tracked location | resolved bundle offset | instruction |
|---|---|---:|---|
| `0x1660050` | `arg:rsi` | `?` | `1660050:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x1660052` | `arg:rdi+0x10` | `?` | `1660052:	48 ff 47 10          	inc    QWORD PTR [rdi+0x10]` |
| `0x1660056` | `arg:rdi+0x18` | `?` | `1660056:	ff 4f 18             	dec    DWORD PTR [rdi+0x18]` |
| `0x166006e` | `arg:rsi` | `?` | `166006e:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x16600b2` | `arg:rdi+0x40` | `?` | `16600b2:	88 0b                	mov    BYTE PTR [rbx],cl` |
| `0x16600d7` | `arg:rdi+0x40` | `?` | `16600d7:	66 89 0b             	mov    WORD PTR [rbx],cx` |
| `0x1660104` | `arg:rdi+0x10` | `?` | `1660104:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx` |
| `0x166010a` | `arg:rdi+0x18` | `?` | `166010a:	89 4f 18             	mov    DWORD PTR [rdi+0x18],ecx` |
| `0x166012d` | `arg:rdi+0x40` | `?` | `166012d:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x1660171` | `arg:rdi+0x40` | `?` | `1660171:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0x16601a3` | `arg:rdi+0x10` | `?` | `16601a3:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx` |
| `0x16601aa` | `arg:rdi+0x18` | `?` | `16601aa:	89 47 18             	mov    DWORD PTR [rdi+0x18],eax` |
| `0x16601b0` | `arg:rdi+0x40` | `?` | `16601b0:	48 89 06             	mov    QWORD PTR [rsi],rax` |
| `0x16601e7` | `arg:rdi+0x10` | `?` | `16601e7:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx` |
| `0x16601ee` | `arg:rdi+0x18` | `?` | `16601ee:	89 47 18             	mov    DWORD PTR [rdi+0x18],eax` |
| `0x16601f3` | `arg:rdi+0x40` | `?` | `16601f3:	89 06                	mov    DWORD PTR [rsi],eax` |
| `0x1660229` | `arg:rdi+0x40` | `?` | `1660229:	0f 95 03             	setne  BYTE PTR [rbx]` |
| `0x166025f` | `arg:rdi+0x10` | `?` | `166025f:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx` |
| `0x1660265` | `arg:rdi+0x18` | `?` | `1660265:	41 89 46 18          	mov    DWORD PTR [r14+0x18],eax` |
| `0x166029b` | `arg:rdi+0x10` | `?` | `166029b:	49 89 76 10          	mov    QWORD PTR [r14+0x10],rsi` |
| `0x166029f` | `arg:rdi+0x18` | `?` | `166029f:	41 89 46 18          	mov    DWORD PTR [r14+0x18],eax` |
| `0x16602f7` | `arg:rdi+0x10` | `?` | `16602f7:	49 89 56 10          	mov    QWORD PTR [r14+0x10],rdx` |
| `0x16602fd` | `arg:rdi+0x18` | `?` | `16602fd:	41 89 4e 18          	mov    DWORD PTR [r14+0x18],ecx` |
| `0x16603d0` | `arg:rdi+0x10` | `?` | `16603d0:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx` |
| `0x16603d6` | `arg:rdi+0x18` | `?` | `16603d6:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax` |
| `0x16603f2` | `arg:rdi+0x10` | `?` | `16603f2:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x16603f9` | `arg:rdi+0x18` | `?` | `16603f9:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax` |
| `0x1660438` | `arg:rdi+0x10` | `?` | `1660438:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x166043f` | `arg:rdi+0x18` | `?` | `166043f:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax` |

### Calls with tracked args
| call | tracked args | instruction |
|---|---|---|
| `0x1660062` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `1660062:	e8 d5 06 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x1660074` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `1660074:	e8 cd 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x166008f` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `166008f:	e8 b2 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x16600a6` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `16600a6:	e8 37 00 00 00       	call   16600e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1424e>` |
| `0x16600ca` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, rcx=load(arg:rdi+0x40+0), r8=arg:r8, r9=arg:r9` | `16600ca:	e8 13 00 00 00       	call   16600e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1424e>` |
| `0x1660116` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660116:	e8 21 06 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x1660133` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660133:	e8 0e 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x1660156` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660156:	e8 21 04 00 00       	call   166057c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146e8>` |
| `0x1660178` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660178:	e8 c9 01 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x16601b7` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=load(arg:rdi+10)+0x8, rcx=load(arg:rdi+10), r8=arg:r8, r9=arg:r9` | `16601b7:	e8 8a 01 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x16601f9` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=load(arg:rdi+10)+0x4, rcx=load(arg:rdi+10), r8=arg:r8, r9=arg:r9` | `16601f9:	e8 48 01 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x166021c` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rcx=load(arg:rdi+10), r8=arg:r8, r9=arg:r9` | `166021c:	e8 11 fe ff ff       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x1660272` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660272:	e8 c5 04 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x166028d` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `166028d:	e8 e0 05 00 00       	call   1660872 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x149de>` |
| `0x16602ab` | `rdi=arg:rdi+0x40, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `16602ab:	e8 a0 e4 18 00       	call   17ee750 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKcm@plt>` |
| `0x16602b7` | `rdi=arg:rdi, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `16602b7:	e8 8a 00 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x166030d` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `166030d:	e8 2a 04 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x1660326` | `rdi=arg:rdi, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `1660326:	e8 11 06 00 00       	call   166093c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14aa8>` |
| `0x1660332` | `rdi=arg:rdi, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `1660332:	e8 0f 00 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x1660384` | `rdi=arg:rdi, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `1660384:	e8 f3 01 00 00       	call   166057c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146e8>` |
| `0x16603a8` | `rdi=load(arg:rdi+30), r8=arg:r8, r9=arg:r9` | `16603a8:	e8 b9 ba ff ff       	call   165be66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xffd2>` |
| `0x166041a` | `rdi=load(arg:rdi+30), rcx=load(arg:rdi+10), r8=arg:r8, r9=arg:r9` | `166041a:	e8 ab bb ff ff       	call   165bfca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10136>` |

## `descriptor setup helper using bundle+0x10` at `0x165fe6a`
- label: `_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`
- initial `rdi` interpretation: `plain arg:rdi`
- instructions scanned: `400`
- arg/substructure refs: `113`
- arg/substructure writes: `42`
- writes resolving exactly to `bundle+0x30`: `0`

### Body excerpt
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
     165fe9d:	48 8d 73 40          	lea    rsi,[rbx+0x40]
     165fea1:	48 89 df             	mov    rdi,rbx
     165fea4:	e8 93 08 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>
     165fea9:	84 c0                	test   al,al
     165feab:	74 6f                	je     165ff1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14088>
     165fead:	8b 43 18             	mov    eax,DWORD PTR [rbx+0x18]
     165feb0:	8b 4b 40             	mov    ecx,DWORD PTR [rbx+0x40]
     165feb3:	03 43 1c             	add    eax,DWORD PTR [rbx+0x1c]
     165feb6:	8b 53 20             	mov    edx,DWORD PTR [rbx+0x20]
     165feb9:	29 c2                	sub    edx,eax
     165febb:	be ff ff ff 7f       	mov    esi,0x7fffffff
     165fec0:	89 d7                	mov    edi,edx
     165fec2:	31 f7                	xor    edi,esi
     165fec4:	01 ca                	add    edx,ecx
     165fec6:	39 cf                	cmp    edi,ecx
     165fec8:	0f 42 d6             	cmovb  edx,esi
     165fecb:	85 c9                	test   ecx,ecx
     165fecd:	0f 48 d6             	cmovs  edx,esi
     165fed0:	8b 6b 3c             	mov    ebp,DWORD PTR [rbx+0x3c]
     165fed3:	39 d5                	cmp    ebp,edx
     165fed5:	0f 4c d5             	cmovl  edx,ebp
     165fed8:	89 53 3c             	mov    DWORD PTR [rbx+0x3c],edx
     165fedb:	39 c2                	cmp    edx,eax
     165fedd:	0f 4d d0             	cmovge edx,eax
     165fee0:	89 53 18             	mov    DWORD PTR [rbx+0x18],edx
     165fee3:	29 d0                	sub    eax,edx
     165fee5:	89 43 1c             	mov    DWORD PTR [rbx+0x1c],eax
     165fee8:	48 89 df             	mov    rdi,rbx
     165feeb:	e8 c0 0a 00 00       	call   16609b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b1c>
     165fef0:	eb 03                	jmp    165fef5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14061>
     165fef2:	8b 6b 3c             	mov    ebp,DWORD PTR [rbx+0x3c]
     165fef5:	41 89 6f 08          	mov    DWORD PTR [r15+0x8],ebp
     165fef9:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
     165fefd:	49 89 07             	mov    QWORD PTR [r15],rax
     165ff00:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
     165ff04:	8b 43 24             	mov    eax,DWORD PTR [rbx+0x24]
     165ff07:	ff c0                	inc    eax
     165ff09:	89 43 24             	mov    DWORD PTR [rbx+0x24],eax
     165ff0c:	3b 43 28             	cmp    eax,DWORD PTR [rbx+0x28]
     165ff0f:	7d 0b                	jge    165ff1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14088>
     165ff11:	48 83 c4 08          	add    rsp,0x8
     165ff15:	5b                   	pop    rbx
     165ff16:	41 5e                	pop    r14
     165ff18:	41 5f                	pop    r15
     165ff1a:	5d                   	pop    rbp
     165ff1b:	c3                   	ret
     165ff1c:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
     165ff21:	c6 03 00             	mov    BYTE PTR [rbx],0x0
     165ff24:	eb eb                	jmp    165ff11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1407d>
    ... truncated 330 instructions ...
```

### Writes through tracked args/substructures
| addr | tracked location | resolved bundle offset | instruction |
|---|---|---:|---|
| `0x165fe95` | `arg:rdi+0x10` | `?` | `165fe95:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x165fed8` | `arg:rdi+0x3c` | `?` | `165fed8:	89 53 3c             	mov    DWORD PTR [rbx+0x3c],edx` |
| `0x165fee0` | `arg:rdi+0x18` | `?` | `165fee0:	89 53 18             	mov    DWORD PTR [rbx+0x18],edx` |
| `0x165fee5` | `arg:rdi+0x1c` | `?` | `165fee5:	89 43 1c             	mov    DWORD PTR [rbx+0x1c],eax` |
| `0x165fef5` | `arg:rsi+0x8` | `?` | `165fef5:	41 89 6f 08          	mov    DWORD PTR [r15+0x8],ebp` |
| `0x165fefd` | `arg:rsi` | `?` | `165fefd:	49 89 07             	mov    QWORD PTR [r15],rax` |
| `0x165ff00` | `arg:rdi+0x30` | `?` | `165ff00:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14` |
| `0x165ff09` | `arg:rdi+0x24` | `?` | `165ff09:	89 43 24             	mov    DWORD PTR [rbx+0x24],eax` |
| `0x165ff44` | `arg:rdi+0x38` | `?` | `165ff44:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x165ff4a` | `arg:rdi+0x10` | `?` | `165ff4a:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x165ff50` | `arg:rdi+0x18` | `?` | `165ff50:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x165ff5b` | `arg:rdi+0x1` | `?` | `165ff5b:	c6 43 01 01          	mov    BYTE PTR [rbx+0x1],0x1` |
| `0x165ff5f` | `arg:rdi+0x38` | `?` | `165ff5f:	83 63 38 00          	and    DWORD PTR [rbx+0x38],0x0` |
| `0x165ff97` | `arg:rdi+0x38` | `?` | `165ff97:	41 89 07             	mov    DWORD PTR [r15],eax` |
| `0x165ff9c` | `arg:rdi+0x38` | `?` | `165ff9c:	41 83 27 00          	and    DWORD PTR [r15],0x0` |
| `0x165ffc0` | `arg:rdi+0x24` | `?` | `165ffc0:	ff 4b 24             	dec    DWORD PTR [rbx+0x24]` |
| `0x165ffc6` | `arg:rdi+0x30` | `?` | `165ffc6:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax` |
| `0x165ffcd` | `arg:rdi+0x3c` | `?` | `165ffcd:	89 43 3c             	mov    DWORD PTR [rbx+0x3c],eax` |
| `0x165ffd8` | `arg:rdi+0x1` | `?` | `165ffd8:	c6 43 01 00          	mov    BYTE PTR [rbx+0x1],0x0` |
| `0x165ffde` | `arg:rdi+0x18` | `?` | `165ffde:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0` |
| `0x165ffe3` | `arg:rdi` | `?` | `165ffe3:	c6 03 00             	mov    BYTE PTR [rbx],0x0` |
| `0x1660002` | `arg:rdi+0x40` | `?` | `1660002:	88 0b                	mov    BYTE PTR [rbx],cl` |
| `0x1660027` | `arg:rdi+0x40` | `?` | `1660027:	66 89 0b             	mov    WORD PTR [rbx],cx` |
| `0x1660050` | `arg:rdi+0x40` | `?` | `1660050:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x1660052` | `arg:rdi+0x10` | `?` | `1660052:	48 ff 47 10          	inc    QWORD PTR [rdi+0x10]` |
| `0x1660056` | `arg:rdi+0x18` | `?` | `1660056:	ff 4f 18             	dec    DWORD PTR [rdi+0x18]` |
| `0x166006e` | `arg:rdi+0x40` | `?` | `166006e:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x16600b2` | `arg:rdi+0x40` | `?` | `16600b2:	88 0b                	mov    BYTE PTR [rbx],cl` |
| `0x16600d7` | `arg:rdi+0x40` | `?` | `16600d7:	66 89 0b             	mov    WORD PTR [rbx],cx` |
| `0x1660104` | `arg:rdi+0x10` | `?` | `1660104:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx` |
| `0x166010a` | `arg:rdi+0x18` | `?` | `166010a:	89 4f 18             	mov    DWORD PTR [rdi+0x18],ecx` |
| `0x166012d` | `arg:rdi+0x40` | `?` | `166012d:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x1660171` | `arg:rdi+0x40` | `?` | `1660171:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0x16601a3` | `arg:rdi+0x10` | `?` | `16601a3:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx` |
| `0x16601aa` | `arg:rdi+0x18` | `?` | `16601aa:	89 47 18             	mov    DWORD PTR [rdi+0x18],eax` |
| `0x16601b0` | `arg:rdi+0x40` | `?` | `16601b0:	48 89 06             	mov    QWORD PTR [rsi],rax` |
| `0x16601e7` | `arg:rdi+0x10` | `?` | `16601e7:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx` |
| `0x16601ee` | `arg:rdi+0x18` | `?` | `16601ee:	89 47 18             	mov    DWORD PTR [rdi+0x18],eax` |
| `0x16601f3` | `arg:rdi+0x40` | `?` | `16601f3:	89 06                	mov    DWORD PTR [rsi],eax` |
| `0x1660229` | `arg:rdi+0x40` | `?` | `1660229:	0f 95 03             	setne  BYTE PTR [rbx]` |
| `0x166025f` | `arg:rdi+0x10` | `?` | `166025f:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx` |
| `0x1660265` | `arg:rdi+0x18` | `?` | `1660265:	41 89 46 18          	mov    DWORD PTR [r14+0x18],eax` |

### Calls with tracked args
| call | tracked args | instruction |
|---|---|---|
| `0x165fea4` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `165fea4:	e8 93 08 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x165feeb` | `rdi=arg:rdi, rcx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `165feeb:	e8 c0 0a 00 00       	call   16609b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b1c>` |
| `0x165ff6d` | `rdi=arg:rdi, r8=arg:r8, r9=arg:r9` | `165ff6d:	e8 7c 09 00 00       	call   16608ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14a5a>` |
| `0x165ff8b` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rcx=load(arg:rdi+18), r8=arg:r8, r9=arg:r9` | `165ff8b:	e8 ac 07 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x165ffd3` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rcx=load(arg:rdi+18), r8=arg:r8, r9=arg:r9` | `165ffd3:	e8 d8 09 00 00       	call   16609b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b1c>` |
| `0x165fff6` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rcx=load(arg:rdi+18), r8=arg:r8, r9=arg:r9` | `165fff6:	e8 37 00 00 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x166001a` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rcx=load(arg:rdi+0x40+0), r8=arg:r8, r9=arg:r9` | `166001a:	e8 13 00 00 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x1660062` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660062:	e8 d5 06 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x1660074` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660074:	e8 cd 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x166008f` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `166008f:	e8 b2 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x16600a6` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `16600a6:	e8 37 00 00 00       	call   16600e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1424e>` |
| `0x16600ca` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rcx=load(arg:rdi+0x40+0), r8=arg:r8, r9=arg:r9` | `16600ca:	e8 13 00 00 00       	call   16600e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1424e>` |
| `0x1660116` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660116:	e8 21 06 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x1660133` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660133:	e8 0e 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x1660156` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660156:	e8 21 04 00 00       	call   166057c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146e8>` |
| `0x1660178` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660178:	e8 c9 01 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x16601b7` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=load(arg:rdi+10)+0x8, rcx=load(arg:rdi+10), r8=arg:r8, r9=arg:r9` | `16601b7:	e8 8a 01 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x16601f9` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=load(arg:rdi+10)+0x4, rcx=load(arg:rdi+10), r8=arg:r8, r9=arg:r9` | `16601f9:	e8 48 01 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x166021c` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rcx=load(arg:rdi+10), r8=arg:r8, r9=arg:r9` | `166021c:	e8 11 fe ff ff       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x1660272` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660272:	e8 c5 04 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |

## `descriptor finalizer helper` at `0x165ffb0`
- label: `_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`
- initial `rdi` interpretation: `plain arg:rdi`
- instructions scanned: `385`
- arg/substructure refs: `91`
- arg/substructure writes: `31`
- writes resolving exactly to `bundle+0x30`: `0`

### Body excerpt
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
     165ffde:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
     165ffe3:	c6 03 00             	mov    BYTE PTR [rbx],0x0
     165ffe6:	5b                   	pop    rbx
     165ffe7:	c3                   	ret
     165ffe8:	41 56                	push   r14
     165ffea:	53                   	push   rbx
     165ffeb:	50                   	push   rax
     165ffec:	48 89 f3             	mov    rbx,rsi
     165ffef:	4c 8d 77 40          	lea    r14,[rdi+0x40]
     165fff3:	4c 89 f6             	mov    rsi,r14
     165fff6:	e8 37 00 00 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>
     165fffb:	84 c0                	test   al,al
     165fffd:	74 05                	je     1660004 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14170>
     165ffff:	41 8a 0e             	mov    cl,BYTE PTR [r14]
     1660002:	88 0b                	mov    BYTE PTR [rbx],cl
     1660004:	48 83 c4 08          	add    rsp,0x8
     1660008:	5b                   	pop    rbx
     1660009:	41 5e                	pop    r14
     166000b:	c3                   	ret
     166000c:	41 56                	push   r14
     166000e:	53                   	push   rbx
     166000f:	50                   	push   rax
     1660010:	48 89 f3             	mov    rbx,rsi
     1660013:	4c 8d 77 40          	lea    r14,[rdi+0x40]
     1660017:	4c 89 f6             	mov    rsi,r14
     166001a:	e8 13 00 00 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>
     166001f:	84 c0                	test   al,al
     1660021:	74 07                	je     166002a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14196>
     1660023:	41 0f b7 0e          	movzx  ecx,WORD PTR [r14]
     1660027:	66 89 0b             	mov    WORD PTR [rbx],cx
     166002a:	48 83 c4 08          	add    rsp,0x8
     166002e:	5b                   	pop    rbx
     166002f:	41 5e                	pop    r14
     1660031:	c3                   	ret
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
     166005b:	4c 8d 77 40          	lea    r14,[rdi+0x40]
     166005f:	4c 89 f6             	mov    rsi,r14
     1660062:	e8 d5 06 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>
     1660067:	84 c0                	test   al,al
     1660069:	74 0e                	je     1660079 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141e5>
    ... truncated 315 instructions ...
```

### Writes through tracked args/substructures
| addr | tracked location | resolved bundle offset | instruction |
|---|---|---:|---|
| `0x165ffc0` | `arg:rdi+0x24` | `?` | `165ffc0:	ff 4b 24             	dec    DWORD PTR [rbx+0x24]` |
| `0x165ffc6` | `arg:rdi+0x30` | `?` | `165ffc6:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax` |
| `0x165ffcd` | `arg:rdi+0x3c` | `?` | `165ffcd:	89 43 3c             	mov    DWORD PTR [rbx+0x3c],eax` |
| `0x165ffd8` | `arg:rdi+0x1` | `?` | `165ffd8:	c6 43 01 00          	mov    BYTE PTR [rbx+0x1],0x0` |
| `0x165ffde` | `arg:rdi+0x18` | `?` | `165ffde:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0` |
| `0x165ffe3` | `arg:rdi` | `?` | `165ffe3:	c6 03 00             	mov    BYTE PTR [rbx],0x0` |
| `0x1660002` | `arg:rsi` | `?` | `1660002:	88 0b                	mov    BYTE PTR [rbx],cl` |
| `0x1660027` | `arg:rdi+0x40` | `?` | `1660027:	66 89 0b             	mov    WORD PTR [rbx],cx` |
| `0x1660050` | `arg:rdi+0x40` | `?` | `1660050:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x1660052` | `arg:rdi+0x10` | `?` | `1660052:	48 ff 47 10          	inc    QWORD PTR [rdi+0x10]` |
| `0x1660056` | `arg:rdi+0x18` | `?` | `1660056:	ff 4f 18             	dec    DWORD PTR [rdi+0x18]` |
| `0x166006e` | `arg:rdi+0x40` | `?` | `166006e:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x16600b2` | `arg:rdi+0x40` | `?` | `16600b2:	88 0b                	mov    BYTE PTR [rbx],cl` |
| `0x16600d7` | `arg:rdi+0x40` | `?` | `16600d7:	66 89 0b             	mov    WORD PTR [rbx],cx` |
| `0x1660104` | `arg:rdi+0x10` | `?` | `1660104:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx` |
| `0x166010a` | `arg:rdi+0x18` | `?` | `166010a:	89 4f 18             	mov    DWORD PTR [rdi+0x18],ecx` |
| `0x166012d` | `arg:rdi+0x40` | `?` | `166012d:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x1660171` | `arg:rdi+0x40` | `?` | `1660171:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0x16601a3` | `arg:rdi+0x10` | `?` | `16601a3:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx` |
| `0x16601aa` | `arg:rdi+0x18` | `?` | `16601aa:	89 47 18             	mov    DWORD PTR [rdi+0x18],eax` |
| `0x16601b0` | `arg:rdi+0x40` | `?` | `16601b0:	48 89 06             	mov    QWORD PTR [rsi],rax` |
| `0x16601e7` | `arg:rdi+0x10` | `?` | `16601e7:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx` |
| `0x16601ee` | `arg:rdi+0x18` | `?` | `16601ee:	89 47 18             	mov    DWORD PTR [rdi+0x18],eax` |
| `0x16601f3` | `arg:rdi+0x40` | `?` | `16601f3:	89 06                	mov    DWORD PTR [rsi],eax` |
| `0x1660229` | `arg:rdi+0x40` | `?` | `1660229:	0f 95 03             	setne  BYTE PTR [rbx]` |
| `0x166025f` | `arg:rdi+0x10` | `?` | `166025f:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx` |
| `0x1660265` | `arg:rdi+0x18` | `?` | `1660265:	41 89 46 18          	mov    DWORD PTR [r14+0x18],eax` |
| `0x166029b` | `arg:rdi+0x10` | `?` | `166029b:	49 89 76 10          	mov    QWORD PTR [r14+0x10],rsi` |
| `0x166029f` | `arg:rdi+0x18` | `?` | `166029f:	41 89 46 18          	mov    DWORD PTR [r14+0x18],eax` |
| `0x16602f7` | `arg:rdi+0x10` | `?` | `16602f7:	49 89 56 10          	mov    QWORD PTR [r14+0x10],rdx` |
| `0x16602fd` | `arg:rdi+0x18` | `?` | `16602fd:	41 89 4e 18          	mov    DWORD PTR [r14+0x18],ecx` |

### Calls with tracked args
| call | tracked args | instruction |
|---|---|---|
| `0x165ffd3` | `rdi=arg:rdi, rsi=arg:rsi, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `165ffd3:	e8 d8 09 00 00       	call   16609b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b1c>` |
| `0x165fff6` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `165fff6:	e8 37 00 00 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x166001a` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, rcx=load(arg:rdi+0x40+0), r8=arg:r8, r9=arg:r9` | `166001a:	e8 13 00 00 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x1660062` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `1660062:	e8 d5 06 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x1660074` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `1660074:	e8 cd 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x166008f` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `166008f:	e8 b2 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x16600a6` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, r8=arg:r8, r9=arg:r9` | `16600a6:	e8 37 00 00 00       	call   16600e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1424e>` |
| `0x16600ca` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=arg:rdx, rcx=load(arg:rdi+0x40+0), r8=arg:r8, r9=arg:r9` | `16600ca:	e8 13 00 00 00       	call   16600e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1424e>` |
| `0x1660116` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660116:	e8 21 06 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x1660133` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660133:	e8 0e 02 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x1660156` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660156:	e8 21 04 00 00       	call   166057c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146e8>` |
| `0x1660178` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660178:	e8 c9 01 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x16601b7` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=load(arg:rdi+10)+0x8, rcx=load(arg:rdi+10), r8=arg:r8, r9=arg:r9` | `16601b7:	e8 8a 01 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x16601f9` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=load(arg:rdi+10)+0x4, rcx=load(arg:rdi+10), r8=arg:r8, r9=arg:r9` | `16601f9:	e8 48 01 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x166021c` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rcx=load(arg:rdi+10), r8=arg:r8, r9=arg:r9` | `166021c:	e8 11 fe ff ff       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x1660272` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `1660272:	e8 c5 04 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x166028d` | `rdi=arg:rdi, rsi=arg:rdi+0x40, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `166028d:	e8 e0 05 00 00       	call   1660872 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x149de>` |
| `0x16602ab` | `rdi=arg:rdi+0x40, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `16602ab:	e8 a0 e4 18 00       	call   17ee750 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKcm@plt>` |
| `0x16602b7` | `rdi=arg:rdi, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `16602b7:	e8 8a 00 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x166030d` | `rdi=arg:rdi, rsi=arg:rdi+0x40, r8=arg:r8, r9=arg:r9` | `166030d:	e8 2a 04 00 00       	call   166073c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148a8>` |
| `0x1660326` | `rdi=arg:rdi, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `1660326:	e8 11 06 00 00       	call   166093c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14aa8>` |
| `0x1660332` | `rdi=arg:rdi, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `1660332:	e8 0f 00 00 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x1660384` | `rdi=arg:rdi, rdx=load(arg:rdi+40), r8=arg:r8, r9=arg:r9` | `1660384:	e8 f3 01 00 00       	call   166057c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146e8>` |
| `0x16603a8` | `rdi=load(arg:rdi+30), r8=arg:r8, r9=arg:r9` | `16603a8:	e8 b9 ba ff ff       	call   165be66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xffd2>` |

## Interpretation
- If `1507a9e` writes through `bundle+0x18 + 0x18`, that resolves exactly to `bundle+0x30`, closing the source of the Restrictions factory `[rdx+0x30]` read.
- If not, the next likely source is another substructure helper or initial bundle construction before the provider vector call.
