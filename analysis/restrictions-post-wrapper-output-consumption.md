# Restrictions post-wrapper output consumption trace

Purpose: after rejecting the `builder+0x18` sink as a semantic Restrictions object in the wrapper-local layout, trace what constructor `0x10aba36` does *after* the wrapper calls (`15e768e`, `a7b5e8`, `15e75f2`). This focuses on return-value use, constructor object field writes, and calls with tracked constructor/dependency arguments.

## Wrapper callsites in constructor `0x10aba36`

### `0x10abb9b` -> `15e768e / slot AP +0x90 wrapper`

```text
 10abb6b:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abb6f:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abb73:	75 e6                	jne    10abb5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x272f71>
 10abb75:	48 8d 35 a4 b8 32 ff 	lea    rsi,[rip+0xffffffffff32b8a4]        # 3d7420 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2005>
 10abb7c:	48 8d 0d bd b8 32 ff 	lea    rcx,[rip+0xffffffffff32b8bd]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>
 10abb83:	4c 8d 2d 86 b8 32 ff 	lea    r13,[rip+0xffffffffff32b886]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abb8a:	6a 11                	push   0x11
 10abb8c:	5a                   	pop    rdx
 10abb8d:	6a 20                	push   0x20
 10abb8f:	41 58                	pop    r8
 10abb91:	4c 89 f7             	mov    rdi,r14
 10abb94:	4d 89 e9             	mov    r9,r13
 10abb97:	41 54                	push   r12
 10abb99:	6a 08                	push   0x8
 10abb9b:	e8 ee ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abba0:	58                   	pop    rax
 10abba1:	59                   	pop    rcx
 10abba2:	4c 89 e7             	mov    rdi,r12
 10abba5:	e8 3e fa 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abbaa:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abbae:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abbb5:	00
 10abbb6:	4c 89 ee             	mov    rsi,r13
 10abbb9:	e8 c0 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abbbe:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abbc5:	00
 10abbc6:	48 8d 35 de cc 32 ff 	lea    rsi,[rip+0xffffffffff32ccde]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abbcd:	e8 ac de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abbd2:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abbd9:	00
 10abbda:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abbe1:	00
 10abbe2:	6a 02                	push   0x2
 10abbe4:	5a                   	pop    rdx
 10abbe5:	4c 89 e7             	mov    rdi,r12
 10abbe8:	e8 6b b8 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abbed:	6a 18                	push   0x18
 10abbef:	41 5d                	pop    r13
 10abbf1:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abbf5:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abbfc:	e8 8f 22 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abc01:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
```
### `0x10abba5` -> `a7b5e8 / cleanup-style wrapper`

```text
 10abb7c:	48 8d 0d bd b8 32 ff 	lea    rcx,[rip+0xffffffffff32b8bd]        # 3d7440 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2025>
 10abb83:	4c 8d 2d 86 b8 32 ff 	lea    r13,[rip+0xffffffffff32b886]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abb8a:	6a 11                	push   0x11
 10abb8c:	5a                   	pop    rdx
 10abb8d:	6a 20                	push   0x20
 10abb8f:	41 58                	pop    r8
 10abb91:	4c 89 f7             	mov    rdi,r14
 10abb94:	4d 89 e9             	mov    r9,r13
 10abb97:	41 54                	push   r12
 10abb99:	6a 08                	push   0x8
 10abb9b:	e8 ee ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abba0:	58                   	pop    rax
 10abba1:	59                   	pop    rcx
 10abba2:	4c 89 e7             	mov    rdi,r12
 10abba5:	e8 3e fa 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abbaa:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abbae:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abbb5:	00
 10abbb6:	4c 89 ee             	mov    rsi,r13
 10abbb9:	e8 c0 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abbbe:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abbc5:	00
 10abbc6:	48 8d 35 de cc 32 ff 	lea    rsi,[rip+0xffffffffff32ccde]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abbcd:	e8 ac de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abbd2:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abbd9:	00
 10abbda:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abbe1:	00
 10abbe2:	6a 02                	push   0x2
 10abbe4:	5a                   	pop    rdx
 10abbe5:	4c 89 e7             	mov    rdi,r12
 10abbe8:	e8 6b b8 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abbed:	6a 18                	push   0x18
 10abbef:	41 5d                	pop    r13
 10abbf1:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abbf5:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abbfc:	e8 8f 22 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abc01:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abc05:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abc09:	75 e6                	jne    10abbf1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273007>
 10abc0b:	48 8d 35 5e b8 32 ff 	lea    rsi,[rip+0xffffffffff32b85e]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>
 10abc12:	48 8d 0d 77 b8 32 ff 	lea    rcx,[rip+0xffffffffff32b877]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>
```
### `0x10abc2e` -> `15e768e / slot AP +0x90 wrapper`

```text
 10abbfc:	e8 8f 22 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abc01:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abc05:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abc09:	75 e6                	jne    10abbf1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273007>
 10abc0b:	48 8d 35 5e b8 32 ff 	lea    rsi,[rip+0xffffffffff32b85e]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>
 10abc12:	48 8d 0d 77 b8 32 ff 	lea    rcx,[rip+0xffffffffff32b877]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>
 10abc19:	4c 8d 0d eb b9 32 ff 	lea    r9,[rip+0xffffffffff32b9eb]        # 3d760b <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21f0>
 10abc20:	6a 11                	push   0x11
 10abc22:	5a                   	pop    rdx
 10abc23:	6a 19                	push   0x19
 10abc25:	41 58                	pop    r8
 10abc27:	4c 89 f7             	mov    rdi,r14
 10abc2a:	41 54                	push   r12
 10abc2c:	6a 08                	push   0x8
 10abc2e:	e8 5b ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abc33:	58                   	pop    rax
 10abc34:	59                   	pop    rcx
 10abc35:	4c 89 e7             	mov    rdi,r12
 10abc38:	e8 ab f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abc3d:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abc41:	48 8d 35 c8 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b7c8]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abc48:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abc4f:	00
 10abc50:	e8 29 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abc55:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abc5c:	00
 10abc5d:	48 8d 35 47 cc 32 ff 	lea    rsi,[rip+0xffffffffff32cc47]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abc64:	e8 15 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abc69:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abc70:	00
 10abc71:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abc78:	00
 10abc79:	6a 02                	push   0x2
 10abc7b:	5a                   	pop    rdx
 10abc7c:	4c 89 e7             	mov    rdi,r12
 10abc7f:	e8 d4 b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abc84:	6a 18                	push   0x18
 10abc86:	41 5d                	pop    r13
 10abc88:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abc8c:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abc93:	e8 f8 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abc98:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
```
### `0x10abc38` -> `a7b5e8 / cleanup-style wrapper`

```text
 10abc0b:	48 8d 35 5e b8 32 ff 	lea    rsi,[rip+0xffffffffff32b85e]        # 3d7470 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2055>
 10abc12:	48 8d 0d 77 b8 32 ff 	lea    rcx,[rip+0xffffffffff32b877]        # 3d7490 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2075>
 10abc19:	4c 8d 0d eb b9 32 ff 	lea    r9,[rip+0xffffffffff32b9eb]        # 3d760b <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21f0>
 10abc20:	6a 11                	push   0x11
 10abc22:	5a                   	pop    rdx
 10abc23:	6a 19                	push   0x19
 10abc25:	41 58                	pop    r8
 10abc27:	4c 89 f7             	mov    rdi,r14
 10abc2a:	41 54                	push   r12
 10abc2c:	6a 08                	push   0x8
 10abc2e:	e8 5b ba 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abc33:	58                   	pop    rax
 10abc34:	59                   	pop    rcx
 10abc35:	4c 89 e7             	mov    rdi,r12
 10abc38:	e8 ab f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abc3d:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abc41:	48 8d 35 c8 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b7c8]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abc48:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abc4f:	00
 10abc50:	e8 29 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abc55:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abc5c:	00
 10abc5d:	48 8d 35 47 cc 32 ff 	lea    rsi,[rip+0xffffffffff32cc47]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abc64:	e8 15 de 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abc69:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abc70:	00
 10abc71:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abc78:	00
 10abc79:	6a 02                	push   0x2
 10abc7b:	5a                   	pop    rdx
 10abc7c:	4c 89 e7             	mov    rdi,r12
 10abc7f:	e8 d4 b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abc84:	6a 18                	push   0x18
 10abc86:	41 5d                	pop    r13
 10abc88:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abc8c:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abc93:	e8 f8 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abc98:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abc9c:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abca0:	75 e6                	jne    10abc88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27309e>
 10abca2:	48 8d 35 27 b9 32 ff 	lea    rsi,[rip+0xffffffffff32b927]        # 3d75d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21b5>
 10abca9:	48 8d 0d 40 b9 32 ff 	lea    rcx,[rip+0xffffffffff32b940]        # 3d75f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21d5>
```
### `0x10abcc5` -> `15e768e / slot AP +0x90 wrapper`

```text
 10abc93:	e8 f8 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abc98:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abc9c:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abca0:	75 e6                	jne    10abc88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27309e>
 10abca2:	48 8d 35 27 b9 32 ff 	lea    rsi,[rip+0xffffffffff32b927]        # 3d75d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21b5>
 10abca9:	48 8d 0d 40 b9 32 ff 	lea    rcx,[rip+0xffffffffff32b940]        # 3d75f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21d5>
 10abcb0:	4c 8d 0d 5d b9 32 ff 	lea    r9,[rip+0xffffffffff32b95d]        # 3d7614 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21f9>
 10abcb7:	6a 11                	push   0x11
 10abcb9:	5a                   	pop    rdx
 10abcba:	6a 1a                	push   0x1a
 10abcbc:	41 58                	pop    r8
 10abcbe:	4c 89 f7             	mov    rdi,r14
 10abcc1:	41 54                	push   r12
 10abcc3:	6a 08                	push   0x8
 10abcc5:	e8 c4 b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abcca:	58                   	pop    rax
 10abccb:	59                   	pop    rcx
 10abccc:	4c 89 e7             	mov    rdi,r12
 10abccf:	e8 14 f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abcd4:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abcd8:	48 8d 35 31 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b731]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abcdf:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abce6:	00
 10abce7:	e8 92 dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abcec:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abcf3:	00
 10abcf4:	48 8d 35 b0 cb 32 ff 	lea    rsi,[rip+0xffffffffff32cbb0]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abcfb:	e8 7e dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abd00:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abd07:	00
 10abd08:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abd0f:	00
 10abd10:	6a 02                	push   0x2
 10abd12:	5a                   	pop    rdx
 10abd13:	4c 89 e7             	mov    rdi,r12
 10abd16:	e8 3d b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abd1b:	6a 18                	push   0x18
 10abd1d:	41 5d                	pop    r13
 10abd1f:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abd23:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abd2a:	e8 61 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abd2f:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
```
### `0x10abccf` -> `a7b5e8 / cleanup-style wrapper`

```text
 10abca2:	48 8d 35 27 b9 32 ff 	lea    rsi,[rip+0xffffffffff32b927]        # 3d75d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21b5>
 10abca9:	48 8d 0d 40 b9 32 ff 	lea    rcx,[rip+0xffffffffff32b940]        # 3d75f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21d5>
 10abcb0:	4c 8d 0d 5d b9 32 ff 	lea    r9,[rip+0xffffffffff32b95d]        # 3d7614 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21f9>
 10abcb7:	6a 11                	push   0x11
 10abcb9:	5a                   	pop    rdx
 10abcba:	6a 1a                	push   0x1a
 10abcbc:	41 58                	pop    r8
 10abcbe:	4c 89 f7             	mov    rdi,r14
 10abcc1:	41 54                	push   r12
 10abcc3:	6a 08                	push   0x8
 10abcc5:	e8 c4 b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abcca:	58                   	pop    rax
 10abccb:	59                   	pop    rcx
 10abccc:	4c 89 e7             	mov    rdi,r12
 10abccf:	e8 14 f9 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abcd4:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abcd8:	48 8d 35 31 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b731]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abcdf:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abce6:	00
 10abce7:	e8 92 dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abcec:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abcf3:	00
 10abcf4:	48 8d 35 b0 cb 32 ff 	lea    rsi,[rip+0xffffffffff32cbb0]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abcfb:	e8 7e dd 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abd00:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abd07:	00
 10abd08:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abd0f:	00
 10abd10:	6a 02                	push   0x2
 10abd12:	5a                   	pop    rdx
 10abd13:	4c 89 e7             	mov    rdi,r12
 10abd16:	e8 3d b7 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abd1b:	6a 18                	push   0x18
 10abd1d:	41 5d                	pop    r13
 10abd1f:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abd23:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abd2a:	e8 61 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abd2f:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abd33:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abd37:	75 e6                	jne    10abd1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273135>
 10abd39:	48 8d 35 b0 bb 32 ff 	lea    rsi,[rip+0xffffffffff32bbb0]        # 3d78f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24d5>
 10abd40:	48 8d 0d c9 bb 32 ff 	lea    rcx,[rip+0xffffffffff32bbc9]        # 3d7910 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24f5>
```
### `0x10abd5c` -> `15e768e / slot AP +0x90 wrapper`

```text
 10abd2a:	e8 61 21 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abd2f:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abd33:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abd37:	75 e6                	jne    10abd1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273135>
 10abd39:	48 8d 35 b0 bb 32 ff 	lea    rsi,[rip+0xffffffffff32bbb0]        # 3d78f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24d5>
 10abd40:	48 8d 0d c9 bb 32 ff 	lea    rcx,[rip+0xffffffffff32bbc9]        # 3d7910 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24f5>
 10abd47:	4c 8d 0d cf b8 32 ff 	lea    r9,[rip+0xffffffffff32b8cf]        # 3d761d <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2202>
 10abd4e:	6a 11                	push   0x11
 10abd50:	5a                   	pop    rdx
 10abd51:	6a 24                	push   0x24
 10abd53:	41 58                	pop    r8
 10abd55:	4c 89 f7             	mov    rdi,r14
 10abd58:	41 54                	push   r12
 10abd5a:	6a 08                	push   0x8
 10abd5c:	e8 2d b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abd61:	58                   	pop    rax
 10abd62:	59                   	pop    rcx
 10abd63:	4c 89 e7             	mov    rdi,r12
 10abd66:	e8 7d f8 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abd6b:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abd6f:	48 8d 35 9a b6 32 ff 	lea    rsi,[rip+0xffffffffff32b69a]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abd76:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abd7d:	00
 10abd7e:	e8 fb dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abd83:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abd8a:	00
 10abd8b:	48 8d 35 19 cb 32 ff 	lea    rsi,[rip+0xffffffffff32cb19]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abd92:	e8 e7 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abd97:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abd9e:	00
 10abd9f:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abda6:	00
 10abda7:	6a 02                	push   0x2
 10abda9:	5a                   	pop    rdx
 10abdaa:	4c 89 e7             	mov    rdi,r12
 10abdad:	e8 a6 b6 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abdb2:	6a 18                	push   0x18
 10abdb4:	41 5d                	pop    r13
 10abdb6:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abdba:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abdc1:	e8 ca 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abdc6:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
```
### `0x10abd66` -> `a7b5e8 / cleanup-style wrapper`

```text
 10abd39:	48 8d 35 b0 bb 32 ff 	lea    rsi,[rip+0xffffffffff32bbb0]        # 3d78f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24d5>
 10abd40:	48 8d 0d c9 bb 32 ff 	lea    rcx,[rip+0xffffffffff32bbc9]        # 3d7910 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24f5>
 10abd47:	4c 8d 0d cf b8 32 ff 	lea    r9,[rip+0xffffffffff32b8cf]        # 3d761d <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2202>
 10abd4e:	6a 11                	push   0x11
 10abd50:	5a                   	pop    rdx
 10abd51:	6a 24                	push   0x24
 10abd53:	41 58                	pop    r8
 10abd55:	4c 89 f7             	mov    rdi,r14
 10abd58:	41 54                	push   r12
 10abd5a:	6a 08                	push   0x8
 10abd5c:	e8 2d b9 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abd61:	58                   	pop    rax
 10abd62:	59                   	pop    rcx
 10abd63:	4c 89 e7             	mov    rdi,r12
 10abd66:	e8 7d f8 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abd6b:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abd6f:	48 8d 35 9a b6 32 ff 	lea    rsi,[rip+0xffffffffff32b69a]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abd76:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abd7d:	00
 10abd7e:	e8 fb dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abd83:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abd8a:	00
 10abd8b:	48 8d 35 19 cb 32 ff 	lea    rsi,[rip+0xffffffffff32cb19]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abd92:	e8 e7 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abd97:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abd9e:	00
 10abd9f:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abda6:	00
 10abda7:	6a 02                	push   0x2
 10abda9:	5a                   	pop    rdx
 10abdaa:	4c 89 e7             	mov    rdi,r12
 10abdad:	e8 a6 b6 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abdb2:	6a 18                	push   0x18
 10abdb4:	41 5d                	pop    r13
 10abdb6:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abdba:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abdc1:	e8 ca 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abdc6:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abdca:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abdce:	75 e6                	jne    10abdb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2731cc>
 10abdd0:	48 8d 35 f9 b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5f9]        # 3d73d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fb5>
 10abdd7:	48 8d 0d 12 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b612]        # 3d73f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fd5>
```
### `0x10abdf3` -> `15e768e / slot AP +0x90 wrapper`

```text
 10abdc1:	e8 ca 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abdc6:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abdca:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abdce:	75 e6                	jne    10abdb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2731cc>
 10abdd0:	48 8d 35 f9 b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5f9]        # 3d73d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fb5>
 10abdd7:	48 8d 0d 12 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b612]        # 3d73f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fd5>
 10abdde:	4c 8d 0d 41 b8 32 ff 	lea    r9,[rip+0xffffffffff32b841]        # 3d7626 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x220b>
 10abde5:	6a 11                	push   0x11
 10abde7:	5a                   	pop    rdx
 10abde8:	6a 1f                	push   0x1f
 10abdea:	41 58                	pop    r8
 10abdec:	4c 89 f7             	mov    rdi,r14
 10abdef:	41 54                	push   r12
 10abdf1:	6a 08                	push   0x8
 10abdf3:	e8 96 b8 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abdf8:	58                   	pop    rax
 10abdf9:	59                   	pop    rcx
 10abdfa:	4c 89 e7             	mov    rdi,r12
 10abdfd:	e8 e6 f7 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abe02:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abe06:	48 8d 35 03 b6 32 ff 	lea    rsi,[rip+0xffffffffff32b603]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abe0d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abe14:	00
 10abe15:	e8 64 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abe1a:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abe21:	00
 10abe22:	48 8d 35 82 ca 32 ff 	lea    rsi,[rip+0xffffffffff32ca82]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abe29:	e8 50 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abe2e:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abe35:	00
 10abe36:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abe3d:	00
 10abe3e:	6a 02                	push   0x2
 10abe40:	5a                   	pop    rdx
 10abe41:	4c 89 e7             	mov    rdi,r12
 10abe44:	e8 0f b6 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abe49:	6a 18                	push   0x18
 10abe4b:	41 5d                	pop    r13
 10abe4d:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abe51:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abe58:	e8 33 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abe5d:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
```
### `0x10abdfd` -> `a7b5e8 / cleanup-style wrapper`

```text
 10abdd0:	48 8d 35 f9 b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5f9]        # 3d73d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fb5>
 10abdd7:	48 8d 0d 12 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b612]        # 3d73f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1fd5>
 10abdde:	4c 8d 0d 41 b8 32 ff 	lea    r9,[rip+0xffffffffff32b841]        # 3d7626 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x220b>
 10abde5:	6a 11                	push   0x11
 10abde7:	5a                   	pop    rdx
 10abde8:	6a 1f                	push   0x1f
 10abdea:	41 58                	pop    r8
 10abdec:	4c 89 f7             	mov    rdi,r14
 10abdef:	41 54                	push   r12
 10abdf1:	6a 08                	push   0x8
 10abdf3:	e8 96 b8 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abdf8:	58                   	pop    rax
 10abdf9:	59                   	pop    rcx
 10abdfa:	4c 89 e7             	mov    rdi,r12
 10abdfd:	e8 e6 f7 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abe02:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abe06:	48 8d 35 03 b6 32 ff 	lea    rsi,[rip+0xffffffffff32b603]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abe0d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abe14:	00
 10abe15:	e8 64 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abe1a:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abe21:	00
 10abe22:	48 8d 35 82 ca 32 ff 	lea    rsi,[rip+0xffffffffff32ca82]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abe29:	e8 50 dc 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abe2e:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abe35:	00
 10abe36:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abe3d:	00
 10abe3e:	6a 02                	push   0x2
 10abe40:	5a                   	pop    rdx
 10abe41:	4c 89 e7             	mov    rdi,r12
 10abe44:	e8 0f b6 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abe49:	6a 18                	push   0x18
 10abe4b:	41 5d                	pop    r13
 10abe4d:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abe51:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abe58:	e8 33 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abe5d:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abe61:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abe65:	75 e6                	jne    10abe4d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273263>
 10abe67:	48 8d 35 c2 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b7c2]        # 3d7630 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2215>
 10abe6e:	48 8d 0d db b7 32 ff 	lea    rcx,[rip+0xffffffffff32b7db]        # 3d7650 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2235>
```
### `0x10abe8a` -> `15e768e / slot AP +0x90 wrapper`

```text
 10abe58:	e8 33 20 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abe5d:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abe61:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abe65:	75 e6                	jne    10abe4d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273263>
 10abe67:	48 8d 35 c2 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b7c2]        # 3d7630 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2215>
 10abe6e:	48 8d 0d db b7 32 ff 	lea    rcx,[rip+0xffffffffff32b7db]        # 3d7650 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2235>
 10abe75:	4c 8d 0d 01 b8 32 ff 	lea    r9,[rip+0xffffffffff32b801]        # 3d767d <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2262>
 10abe7c:	6a 11                	push   0x11
 10abe7e:	5a                   	pop    rdx
 10abe7f:	6a 2c                	push   0x2c
 10abe81:	41 58                	pop    r8
 10abe83:	4c 89 f7             	mov    rdi,r14
 10abe86:	41 54                	push   r12
 10abe88:	6a 08                	push   0x8
 10abe8a:	e8 ff b7 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abe8f:	58                   	pop    rax
 10abe90:	59                   	pop    rcx
 10abe91:	4c 89 e7             	mov    rdi,r12
 10abe94:	e8 4f f7 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abe99:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abe9d:	48 8d 35 6c b5 32 ff 	lea    rsi,[rip+0xffffffffff32b56c]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abea4:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abeab:	00
 10abeac:	e8 cd db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abeb1:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abeb8:	00
 10abeb9:	48 8d 35 eb c9 32 ff 	lea    rsi,[rip+0xffffffffff32c9eb]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abec0:	e8 b9 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abec5:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abecc:	00
 10abecd:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abed4:	00
 10abed5:	6a 02                	push   0x2
 10abed7:	5a                   	pop    rdx
 10abed8:	4c 89 e7             	mov    rdi,r12
 10abedb:	e8 78 b5 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abee0:	6a 18                	push   0x18
 10abee2:	41 5d                	pop    r13
 10abee4:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abee8:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abeef:	e8 9c 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abef4:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
```
### `0x10abe94` -> `a7b5e8 / cleanup-style wrapper`

```text
 10abe67:	48 8d 35 c2 b7 32 ff 	lea    rsi,[rip+0xffffffffff32b7c2]        # 3d7630 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2215>
 10abe6e:	48 8d 0d db b7 32 ff 	lea    rcx,[rip+0xffffffffff32b7db]        # 3d7650 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2235>
 10abe75:	4c 8d 0d 01 b8 32 ff 	lea    r9,[rip+0xffffffffff32b801]        # 3d767d <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2262>
 10abe7c:	6a 11                	push   0x11
 10abe7e:	5a                   	pop    rdx
 10abe7f:	6a 2c                	push   0x2c
 10abe81:	41 58                	pop    r8
 10abe83:	4c 89 f7             	mov    rdi,r14
 10abe86:	41 54                	push   r12
 10abe88:	6a 08                	push   0x8
 10abe8a:	e8 ff b7 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abe8f:	58                   	pop    rax
 10abe90:	59                   	pop    rcx
 10abe91:	4c 89 e7             	mov    rdi,r12
 10abe94:	e8 4f f7 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abe99:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]
 10abe9d:	48 8d 35 6c b5 32 ff 	lea    rsi,[rip+0xffffffffff32b56c]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abea4:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abeab:	00
 10abeac:	e8 cd db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abeb1:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abeb8:	00
 10abeb9:	48 8d 35 eb c9 32 ff 	lea    rsi,[rip+0xffffffffff32c9eb]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abec0:	e8 b9 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abec5:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
 10abecc:	00
 10abecd:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abed4:	00
 10abed5:	6a 02                	push   0x2
 10abed7:	5a                   	pop    rdx
 10abed8:	4c 89 e7             	mov    rdi,r12
 10abedb:	e8 78 b5 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abee0:	6a 18                	push   0x18
 10abee2:	41 5d                	pop    r13
 10abee4:	4a 8d 3c 2c          	lea    rdi,[rsp+r13*1]
 10abee8:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abeef:	e8 9c 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abef4:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abef8:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abefc:	75 e6                	jne    10abee4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2732fa>
 10abefe:	48 8d 35 3b b6 32 ff 	lea    rsi,[rip+0xffffffffff32b63b]        # 3d7540 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2125>
 10abf05:	48 8d 0d 54 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b654]        # 3d7560 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2145>
```
### `0x10abf21` -> `15e768e / slot AP +0x90 wrapper`

```text
 10abeef:	e8 9c 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abef4:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
 10abef8:	49 83 fd e8          	cmp    r13,0xffffffffffffffe8
 10abefc:	75 e6                	jne    10abee4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2732fa>
 10abefe:	48 8d 35 3b b6 32 ff 	lea    rsi,[rip+0xffffffffff32b63b]        # 3d7540 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2125>
 10abf05:	48 8d 0d 54 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b654]        # 3d7560 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2145>
 10abf0c:	4c 8d 0d 73 b7 32 ff 	lea    r9,[rip+0xffffffffff32b773]        # 3d7686 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x226b>
 10abf13:	6a 11                	push   0x11
 10abf15:	5a                   	pop    rdx
 10abf16:	6a 2b                	push   0x2b
 10abf18:	41 58                	pop    r8
 10abf1a:	4c 89 f7             	mov    rdi,r14
 10abf1d:	41 54                	push   r12
 10abf1f:	6a 08                	push   0x8
 10abf21:	e8 68 b7 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abf26:	58                   	pop    rax
 10abf27:	59                   	pop    rcx
 10abf28:	4c 89 e7             	mov    rdi,r12
 10abf2b:	e8 b8 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abf30:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]
 10abf34:	48 8d 35 d5 b4 32 ff 	lea    rsi,[rip+0xffffffffff32b4d5]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abf3b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abf42:	00
 10abf43:	e8 36 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abf48:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abf4f:	00
 10abf50:	48 8d 35 54 c9 32 ff 	lea    rsi,[rip+0xffffffffff32c954]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abf57:	e8 22 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abf5c:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]
 10abf63:	00
 10abf64:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abf6b:	00
 10abf6c:	6a 02                	push   0x2
 10abf6e:	5a                   	pop    rdx
 10abf6f:	4c 89 ef             	mov    rdi,r13
 10abf72:	e8 e1 b4 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abf77:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
 10abf7c:	6a 18                	push   0x18
 10abf7e:	41 5e                	pop    r14
 10abf80:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10abf84:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abf8b:	e8 00 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
```
### `0x10abf2b` -> `a7b5e8 / cleanup-style wrapper`

```text
 10abefe:	48 8d 35 3b b6 32 ff 	lea    rsi,[rip+0xffffffffff32b63b]        # 3d7540 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2125>
 10abf05:	48 8d 0d 54 b6 32 ff 	lea    rcx,[rip+0xffffffffff32b654]        # 3d7560 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2145>
 10abf0c:	4c 8d 0d 73 b7 32 ff 	lea    r9,[rip+0xffffffffff32b773]        # 3d7686 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x226b>
 10abf13:	6a 11                	push   0x11
 10abf15:	5a                   	pop    rdx
 10abf16:	6a 2b                	push   0x2b
 10abf18:	41 58                	pop    r8
 10abf1a:	4c 89 f7             	mov    rdi,r14
 10abf1d:	41 54                	push   r12
 10abf1f:	6a 08                	push   0x8
 10abf21:	e8 68 b7 53 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>
 10abf26:	58                   	pop    rax
 10abf27:	59                   	pop    rcx
 10abf28:	4c 89 e7             	mov    rdi,r12
 10abf2b:	e8 b8 f6 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10abf30:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]
 10abf34:	48 8d 35 d5 b4 32 ff 	lea    rsi,[rip+0xffffffffff32b4d5]        # 3d7410 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ff5>
 10abf3b:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10abf42:	00
 10abf43:	e8 36 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abf48:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 10abf4f:	00
 10abf50:	48 8d 35 54 c9 32 ff 	lea    rsi,[rip+0xffffffffff32c954]        # 3d88ab <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3490>
 10abf57:	e8 22 db 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10abf5c:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]
 10abf63:	00
 10abf64:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
 10abf6b:	00
 10abf6c:	6a 02                	push   0x2
 10abf6e:	5a                   	pop    rdx
 10abf6f:	4c 89 ef             	mov    rdi,r13
 10abf72:	e8 e1 b4 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10abf77:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
 10abf7c:	6a 18                	push   0x18
 10abf7e:	41 5e                	pop    r14
 10abf80:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10abf84:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10abf8b:	e8 00 1f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10abf90:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10abf94:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10abf98:	75 e6                	jne    10abf80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273396>
 10abf9a:	48 8d 35 ef b5 32 ff 	lea    rsi,[rip+0xffffffffff32b5ef]        # 3d7590 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2175>
```
### `0x10abfc3` -> `15e768e / slot AP +0x90 wrapper`

```text
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
```
### `0x10abfcd` -> `a7b5e8 / cleanup-style wrapper`

```text
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
```
### `0x10abff8` -> `15e75f2 / slot AP +0x98 wrapper`

```text
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
```
### `0x10ac028` -> `15e75f2 / slot AP +0x98 wrapper`

```text
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
 10ac080:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ac087:	e8 04 1e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac08c:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ac090:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ac094:	75 e6                	jne    10ac07c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273492>
 10ac096:	48 8d 35 13 b4 32 ff 	lea    rsi,[rip+0xffffffffff32b413]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
```
### `0x10ac0bd` -> `15e768e / slot AP +0x90 wrapper`

```text
 10ac08c:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ac090:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ac094:	75 e6                	jne    10ac07c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273492>
 10ac096:	48 8d 35 13 b4 32 ff 	lea    rsi,[rip+0xffffffffff32b413]        # 3d74b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2095>
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
```
### `0x10ac0c7` -> `a7b5e8 / cleanup-style wrapper`

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
```
### `0x10ac0f1` -> `15e75f2 / slot AP +0x98 wrapper`

```text
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
```
### `0x10ac120` -> `15e75f2 / slot AP +0x98 wrapper`

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
```
## Immediate wrapper return-value uses

| wrapper call | use addr | origin | instruction |
|---:|---:|---|---|
| `0x10abb9b` | `0x10abba0` | `return from 15e768e / slot AP +0x90 wrapper at 0x10abb9b` | `10abba0:	58                   	pop    rax` |
| `0x10abc2e` | `0x10abc33` | `return from 15e768e / slot AP +0x90 wrapper at 0x10abc2e` | `10abc33:	58                   	pop    rax` |
| `0x10abcc5` | `0x10abcca` | `return from 15e768e / slot AP +0x90 wrapper at 0x10abcc5` | `10abcca:	58                   	pop    rax` |
| `0x10abd5c` | `0x10abd61` | `return from 15e768e / slot AP +0x90 wrapper at 0x10abd5c` | `10abd61:	58                   	pop    rax` |
| `0x10abdf3` | `0x10abdf8` | `return from 15e768e / slot AP +0x90 wrapper at 0x10abdf3` | `10abdf8:	58                   	pop    rax` |
| `0x10abe8a` | `0x10abe8f` | `return from 15e768e / slot AP +0x90 wrapper at 0x10abe8a` | `10abe8f:	58                   	pop    rax` |
| `0x10abf21` | `0x10abf26` | `return from 15e768e / slot AP +0x90 wrapper at 0x10abf21` | `10abf26:	58                   	pop    rax` |
| `0x10abfc3` | `0x10abfc8` | `return from 15e768e / slot AP +0x90 wrapper at 0x10abfc3` | `10abfc8:	58                   	pop    rax` |
| `0x10ac0bd` | `0x10ac0c2` | `return from 15e768e / slot AP +0x90 wrapper at 0x10ac0bd` | `10ac0c2:	58                   	pop    rax` |

## Constructor object / bundle30-slot field events

Initial aliases: `rdi=constructor_this_initial`, `rcx=bundle30_slot_arg_initial`. Aliases are simple syntactic propagation only.

| addr | origin | mem | kind | instruction |
|---:|---|---|---|---|
| `0x10aba70` | `constructor_this_initial` | `rdi+0x8` | `write` | `10aba70:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0` |
| `0x10aba7b` | `constructor_this_initial` | `rdi` | `write` | `10aba7b:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0x10aba7e` | `constructor_this_initial` | `rdi+0x10` | `read` | `10aba7e:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0x10aba8a` | `constructor_this_initial` | `rdi+0x18` | `read` | `10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]` |
| `0x10abaa3` | `constructor_this_initial` | `rbx+0x10` | `write` | `10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0` |
| `0x10abaa7` | `constructor_this_initial` | `rbx+0x20` | `write` | `10abaa7:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0` |
| `0x10abaab` | `constructor_this_initial` | `rbx+0x30` | `write` | `10abaab:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0` |
| `0x10abaaf` | `constructor_this_initial` | `rbx+0x40` | `write` | `10abaaf:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0` |
| `0x10abafc` | `constructor_this_initial` | `rbx+0x68` | `write` | `10abafc:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0` |
| `0x10abb00` | `constructor_this_initial` | `rbx+0x58` | `write` | `10abb00:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0` |
| `0x10abb04` | `constructor_this_initial` | `rbx+0x78` | `write` | `10abb04:	48 83 63 78 00       	and    QWORD PTR [rbx+0x78],0x0` |
| `0x10ac187` | `addr(constructor_this_initial:rbx+0x78)` | `r14` | `write` | `10ac187:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ac1a9` | `addr(constructor_this_initial:rbx+0x78)` | `rax` | `write` | `10ac1a9:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac1c6` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax` | `write` | `10ac1c6:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ac1cb` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x8` | `write` | `10ac1cb:	40 88 68 08          	mov    BYTE PTR [rax+0x8],bpl` |
| `0x10ac1cf` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x38` | `write` | `10ac1cf:	40 88 68 38          	mov    BYTE PTR [rax+0x38],bpl` |
| `0x10ac1d3` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x40` | `write` | `10ac1d3:	40 88 68 40          	mov    BYTE PTR [rax+0x40],bpl` |
| `0x10ac1e2` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax+0x48` | `write` | `10ac1e2:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0` |
| `0x10ac21b` | `addr(constructor_this_initial:rbx+0x78)` | `r14+0x18` | `read` | `10ac21b:	41 38 6e 18          	cmp    BYTE PTR [r14+0x18],bpl` |
| `0x10ac255` | `load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi)` | `rax` | `write` | `10ac255:	48 89 08             	mov    QWORD PTR [rax],rcx` |

## Calls with tracked constructor/dependency args

| addr | tracked args | instruction |
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
| `0x10ac12c` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):rbp+0x0), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=load(bundle30_slot_arg_initial:rbp+0x0)` | `10ac12c:	e8 cf 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac149` | `rdi=load(load(bundle30_slot_arg_initial:rbp+0x0):rbp+0x0), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=load(load(bundle30_slot_arg_initial:rbp+0x0):r12), r14=addr(constructor_this_initial:rbx+0x78)` | `10ac149:	e8 b2 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac159` | `rdi=addr(constructor_this_initial:rbx+0x78), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=addr(constructor_this_initial:rbx+0x78), r14=addr(constructor_this_initial:rbx+0x78)` | `10ac159:	e8 32 e1 9c ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>` |
| `0x10ac194` | `rdi=addr(constructor_this_initial:rbx+0x78), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=addr(constructor_this_initial:rbx+0x78), r14=addr(constructor_this_initial:rbx+0x78)` | `10ac194:	e8 91 54 fc ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>` |
| `0x10ac19c` | `rdi=addr(constructor_this_initial:rbx+0x78), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=addr(constructor_this_initial:rbx+0x78), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=addr(constructor_this_initial:rbx+0x78), r14=addr(constructor_this_initial:rbx+0x78)` | `10ac19c:	e8 b1 5a d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>` |
| `0x10ac1b4` | `rdi=load(addr(constructor_this_initial:rbx+0x78):rax), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=addr(constructor_this_initial:rbx+0x78), r14=addr(constructor_this_initial:rbx+0x78)` | `10ac1b4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac1ba` | `rdi=load(addr(constructor_this_initial:rbx+0x78):rax), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=addr(constructor_this_initial:rbx+0x78), r14=addr(constructor_this_initial:rbx+0x78)` | `10ac1ba:	e8 41 1d 74 00       	call   17edf00 <_Znwm@plt>` |
| `0x10ac216` | `rdi=addr(constructor_this_initial:rbx+0x78), rsi=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=addr(constructor_this_initial:rbx+0x78), r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=addr(constructor_this_initial:rbx+0x78)` | `10ac216:	e8 ad b2 53 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>` |
| `0x10ac230` | `rdi=addr(constructor_this_initial:rbx+0x78), rsi=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=addr(constructor_this_initial:rbx+0x78), r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=addr(constructor_this_initial:rbx+0x78)` | `10ac230:	e8 1a f6 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10ac23f` | `rdi=addr(constructor_this_initial:rbx+0x78), rsi=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=addr(constructor_this_initial:rbx+0x78), r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=addr(constructor_this_initial:rbx+0x78)` | `10ac23f:	e8 ec aa 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10ac249` | `rdi=addr(constructor_this_initial:rbx+0x78), rsi=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), rdx=load(bundle30_slot_arg_initial:rbp+0x0), rcx=bundle30_slot_arg_initial, r8=load(bundle30_slot_arg_initial:rbp+0x0), rax=load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi), rbx=constructor_this_initial, rbp=load(bundle30_slot_arg_initial:rbp+0x0), r12=addr(constructor_this_initial:rbx+0x78), r13=load(load(load(addr(constructor_this_initial:rbx+0x78):rax):rdi):rax), r14=addr(constructor_this_initial:rbx+0x78)` | `10ac249:	e8 b2 1c 74 00       	call   17edf00 <_Znwm@plt>` |

## Interpretation checklist

- If wrapper returns are unused, the stack-local output objects likely serve as temporary builder/finalizer inputs inside the wrapper itself.
- If constructor object writes cluster before the wrapper calls, `child+0x18` may have been set earlier by a helper not in the naive scanned direct-store window.
- If post-wrapper calls carry `constructor_this_initial` plus wrapper-produced state, those calls become the next semantic target.
- If no post-wrapper consumption is visible, the next target should be resolving constructor helper calls that receive `constructor_this_initial` and `bundle30_slot_arg_initial`, rather than following builder internals.
