# Indirect restriction-owner ad-gate mutators

owner+0x470 = state(owner+0x38)+0x438.

## Owner wrappers around 0x10a9d00..0x10a9f9e

/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000010a9d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271116>:
 10a9d00:	2c d0                	sub    al,0xd0
 10a9d02:	9f                   	lahf
 10a9d03:	ff 48 8d             	dec    DWORD PTR [rax-0x73]
 10a9d06:	bb a8 00 00 00       	mov    ebx,0xa8
 10a9d0b:	e8 80 41 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9d10:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
 10a9d17:	e8 74 41 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9d1c:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 10a9d20:	e8 6b 41 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9d25:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 10a9d29:	e8 62 41 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9d2e:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 10a9d32:	e8 59 41 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9d37:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
 10a9d3b:	e8 50 41 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9d40:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 10a9d44:	e8 47 41 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9d49:	48 89 df             	mov    rdi,rbx
 10a9d4c:	5b                   	pop    rbx
 10a9d4d:	e9 3e 41 74 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9d52:	53                   	push   rbx
 10a9d53:	48 89 fb             	mov    rbx,rdi
 10a9d56:	48 83 c7 78          	add    rdi,0x78
 10a9d5a:	e8 1f 00 00 00       	call   10a9d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271194>
 10a9d5f:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
 10a9d63:	e8 1e 47 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a9d68:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 10a9d6c:	e8 bf cf 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10a9d71:	48 83 c3 08          	add    rbx,0x8
 10a9d75:	48 89 df             	mov    rdi,rbx
 10a9d78:	5b                   	pop    rbx
 10a9d79:	e9 b2 cf 9f ff       	jmp    aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10a9d7e:	53                   	push   rbx
 10a9d7f:	48 89 fb             	mov    rbx,rdi
 10a9d82:	48 83 c7 18          	add    rdi,0x18
 10a9d86:	e8 b7 70 fa ff       	call   1050e42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x218258>
 10a9d8b:	48 89 df             	mov    rdi,rbx
 10a9d8e:	5b                   	pop    rbx
 10a9d8f:	e9 54 18 9d ff       	jmp    a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10a9d94:	53                   	push   rbx
 10a9d95:	48 89 fb             	mov    rbx,rdi
 10a9d98:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10a9d9b:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
 10a9d9f:	74 11                	je     10a9db2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2711c8>
 10a9da1:	e8 0e 00 00 00       	call   10a9db4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2711ca>
 10a9da6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10a9da9:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10a9dac:	5b                   	pop    rbx
 10a9dad:	e9 6e 41 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10a9db2:	5b                   	pop    rbx
 10a9db3:	c3                   	ret
 10a9db4:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
 10a9db7:	e9 00 00 00 00       	jmp    10a9dbc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2711d2>
 10a9dbc:	41 57                	push   r15
 10a9dbe:	41 56                	push   r14
 10a9dc0:	53                   	push   rbx
 10a9dc1:	48 89 f3             	mov    rbx,rsi
 10a9dc4:	49 89 fe             	mov    r14,rdi
 10a9dc7:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
 10a9dcb:	49 39 f7             	cmp    r15,rsi
 10a9dce:	74 14                	je     10a9de4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2711fa>
 10a9dd0:	49 81 c7 a0 fe ff ff 	add    r15,0xfffffffffffffea0
 10a9dd7:	4c 89 ff             	mov    rdi,r15
 10a9dda:	e8 0f 00 00 00       	call   10a9dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271204>
 10a9ddf:	49 39 df             	cmp    r15,rbx
 10a9de2:	75 ec                	jne    10a9dd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2711e6>
 10a9de4:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
 10a9de8:	5b                   	pop    rbx
 10a9de9:	41 5e                	pop    r14
 10a9deb:	41 5f                	pop    r15
 10a9ded:	c3                   	ret
 10a9dee:	53                   	push   rbx
 10a9def:	48 89 fb             	mov    rbx,rdi
 10a9df2:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10a9df9:	e8 9a fd fd ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
 10a9dfe:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
 10a9e05:	e8 86 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9e0a:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 10a9e0e:	e8 7d 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9e13:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 10a9e17:	e8 74 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9e1c:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
 10a9e20:	e8 6b 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9e25:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 10a9e29:	e8 62 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9e2e:	48 89 df             	mov    rdi,rbx
 10a9e31:	5b                   	pop    rbx
 10a9e32:	e9 59 40 74 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a9e37:	cc                   	int3
 10a9e38:	53                   	push   rbx
 10a9e39:	48 89 fb             	mov    rbx,rdi
 10a9e3c:	48 81 c7 60 01 00 00 	add    rdi,0x160
 10a9e43:	e8 2a fc fd ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
 10a9e48:	48 89 df             	mov    rdi,rbx
 10a9e4b:	5b                   	pop    rbx
 10a9e4c:	e9 9d ff ff ff       	jmp    10a9dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271204>
 10a9e51:	cc                   	int3
 10a9e52:	53                   	push   rbx
 10a9e53:	48 89 fb             	mov    rbx,rdi
 10a9e56:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10a9e59:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
 10a9e5d:	74 11                	je     10a9e70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271286>
 10a9e5f:	e8 0e 00 00 00       	call   10a9e72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271288>
 10a9e64:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10a9e67:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10a9e6a:	5b                   	pop    rbx
 10a9e6b:	e9 b0 40 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10a9e70:	5b                   	pop    rbx
 10a9e71:	c3                   	ret
 10a9e72:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
 10a9e75:	e9 00 00 00 00       	jmp    10a9e7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271290>
 10a9e7a:	41 57                	push   r15
 10a9e7c:	41 56                	push   r14
 10a9e7e:	53                   	push   rbx
 10a9e7f:	48 89 f3             	mov    rbx,rsi
 10a9e82:	49 89 fe             	mov    r14,rdi
 10a9e85:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
 10a9e89:	49 39 f7             	cmp    r15,rsi
 10a9e8c:	74 14                	je     10a9ea2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2712b8>
 10a9e8e:	49 81 c7 50 f9 ff ff 	add    r15,0xfffffffffffff950
 10a9e95:	4c 89 ff             	mov    rdi,r15
 10a9e98:	e8 9b ff ff ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
 10a9e9d:	49 39 df             	cmp    r15,rbx
 10a9ea0:	75 ec                	jne    10a9e8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2712a4>
 10a9ea2:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
 10a9ea6:	5b                   	pop    rbx
 10a9ea7:	41 5e                	pop    r14
 10a9ea9:	41 5f                	pop    r15
 10a9eab:	c3                   	ret
 10a9eac:	41 57                	push   r15
 10a9eae:	41 56                	push   r14
 10a9eb0:	53                   	push   rbx
 10a9eb1:	49 89 f7             	mov    r15,rsi
 10a9eb4:	48 89 fb             	mov    rbx,rdi
 10a9eb7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10a9eba:	48 89 f7             	mov    rdi,rsi
 10a9ebd:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10a9ec0:	80 78 10 00          	cmp    BYTE PTR [rax+0x10],0x0
 10a9ec4:	74 10                	je     10a9ed6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2712ec>
 10a9ec6:	49 89 c6             	mov    r14,rax
 10a9ec9:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10a9ecc:	4c 89 ff             	mov    rdi,r15
 10a9ecf:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10a9ed2:	84 c0                	test   al,al
 10a9ed4:	74 09                	je     10a9edf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2712f5>
 10a9ed6:	31 c0                	xor    eax,eax
 10a9ed8:	88 03                	mov    BYTE PTR [rbx],al
 10a9eda:	88 43 10             	mov    BYTE PTR [rbx+0x10],al
 10a9edd:	eb 0f                	jmp    10a9eee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271304>
 10a9edf:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
 10a9ee3:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 10a9ee7:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
 10a9eeb:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10a9eee:	5b                   	pop    rbx
 10a9eef:	41 5e                	pop    r14
 10a9ef1:	41 5f                	pop    r15
 10a9ef3:	c3                   	ret
 10a9ef4:	41 56                	push   r14
 10a9ef6:	53                   	push   rbx
 10a9ef7:	48 83 ec 48          	sub    rsp,0x48
 10a9efb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a9f02:	00 00 
 10a9f04:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10a9f09:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
 10a9f0c:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
 10a9f10:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10a9f15:	e8 92 ff ff ff       	call   10a9eac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2712c2>
 10a9f1a:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 10a9f1f:	8a 43 10             	mov    al,BYTE PTR [rbx+0x10]
 10a9f22:	41 88 86 30 18 00 00 	mov    BYTE PTR [r14+0x1830],al
 10a9f29:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
 10a9f2c:	41 0f 11 86 20 18 00 	movups XMMWORD PTR [r14+0x1820],xmm0
 10a9f33:	00 
 10a9f34:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10a9f38:	48 8d 05 d9 7c 3a ff 	lea    rax,[rip+0xffffffffff3a7cd9]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 10a9f3f:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 10a9f44:	48 89 06             	mov    QWORD PTR [rsi],rax
 10a9f47:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 10a9f4b:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10a9f50:	4c 89 33             	mov    QWORD PTR [rbx],r14
 10a9f53:	48 8d 05 0a 25 9d ff 	lea    rax,[rip+0xffffffffff9d250a]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 10a9f5a:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 10a9f5e:	48 8d 05 ef c4 ff ff 	lea    rax,[rip+0xffffffffffffc4ef]        # 10a6454 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d86a>
 10a9f65:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 10a9f69:	48 89 da             	mov    rdx,rbx
 10a9f6c:	e8 17 75 71 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
 10a9f71:	48 89 df             	mov    rdi,rbx
 10a9f74:	e8 25 d3 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 10a9f79:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a9f80:	00 00 
 10a9f82:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10a9f87:	75 08                	jne    10a9f91 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713a7>
 10a9f89:	48 83 c4 48          	add    rsp,0x48
 10a9f8d:	5b                   	pop    rbx
 10a9f8e:	41 5e                	pop    r14
 10a9f90:	c3                   	ret
 10a9f91:	e8 1a 5b 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10a9f96:	48 89 c7             	mov    rdi,rax
 10a9f99:	e8 07 fb 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10a9f9e:	53                   	push   rbx
 10a9f9f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10a9fa2:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 10a9fa6:	e8 13 00 00 00       	call   10a9fbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713d4>
 10a9fab:	48 89 df             	mov    rdi,rbx
 10a9fae:	31 f6                	xor    esi,esi
 10a9fb0:	5b                   	pop    rbx
 10a9fb1:	e9 ae c4 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
 10a9fb6:	48 89 c7             	mov    rdi,rax
 10a9fb9:	e8 e7 fa 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## lower helper 0x1089a72

/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001089a50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e66>:
 1089a50:	00 00                	add    BYTE PTR [rax],al
 1089a52:	00 48 3b             	add    BYTE PTR [rax+0x3b],cl
 1089a55:	44 24 10             	rex.R and al,0x10
 1089a58:	75 05                	jne    1089a5f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e75>
 1089a5a:	48 83 c4 18          	add    rsp,0x18
 1089a5e:	c3                   	ret
 1089a5f:	e8 4c 60 76 00       	call   17efab0 <__stack_chk_fail@plt>
 1089a64:	80 bf 50 05 00 00 00 	cmp    BYTE PTR [rdi+0x550],0x0
 1089a6b:	0f 85 01 00 00 00    	jne    1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
 1089a71:	c3                   	ret
 1089a72:	53                   	push   rbx
 1089a73:	48 89 fb             	mov    rbx,rdi
 1089a76:	48 81 c7 30 04 00 00 	add    rdi,0x430
 1089a7d:	e8 48 00 00 00       	call   1089aca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250ee0>
 1089a82:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
 1089a89:	e8 4a 00 00 00       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
 1089a8e:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
 1089a95:	e8 4a 00 00 00       	call   1089ae4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250efa>
 1089a9a:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
 1089aa1:	e8 5e 00 00 00       	call   1089b04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250f1a>
 1089aa6:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 1089aaa:	e8 e1 43 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089aaf:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 1089ab3:	e8 d8 43 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089ab8:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 1089abc:	e8 cf 43 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089ac1:	48 89 df             	mov    rdi,rbx
 1089ac4:	5b                   	pop    rbx
 1089ac5:	e9 02 4d a1 ff       	jmp    a9e7cc <JNI_OnUnload@@Base+0x26099>
 1089aca:	80 bf 10 01 00 00 00 	cmp    BYTE PTR [rdi+0x110],0x0
 1089ad1:	0f 85 13 01 00 00    	jne    1089bea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251000>
 1089ad7:	c3                   	ret
 1089ad8:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
 1089adc:	0f 85 5c c8 fc ff    	jne    105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
 1089ae2:	c3                   	ret
 1089ae3:	cc                   	int3
 1089ae4:	53                   	push   rbx
 1089ae5:	48 89 fb             	mov    rbx,rdi
 1089ae8:	48 83 c7 38          	add    rdi,0x38
 1089aec:	e8                   	.byte 0xe8
 1089aed:	3f                   	(bad)
 1089aee:	d2                   	.byte 0xd2
 1089aef:	a1                   	.byte 0xa1

## lower helper 0x1089b98

/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001089b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250f86>:
 1089b70:	bc d1 a1 ff 48       	mov    esp,0x48ffa1d1
 1089b75:	8d 7b 60             	lea    edi,[rbx+0x60]
 1089b78:	e8 b3 d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b7d:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 1089b81:	e8 aa d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b86:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
 1089b8a:	e8 a1 d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b8f:	48 89 df             	mov    rdi,rbx
 1089b92:	5b                   	pop    rbx
 1089b93:	e9 98 d1 a1 ff       	jmp    aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b98:	53                   	push   rbx
 1089b99:	48 89 fb             	mov    rbx,rdi
 1089b9c:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
 1089ba3:	e8 e8 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089ba8:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
 1089baf:	e8 dc 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bb4:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 1089bb8:	e8 d3 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bbd:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 1089bc1:	e8 ca 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bc6:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 1089bca:	e8 c1 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bcf:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
 1089bd3:	e8 b8 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bd8:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 1089bdc:	e8 af 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089be1:	48 89 df             	mov    rdi,rbx
 1089be4:	5b                   	pop    rbx
 1089be5:	e9 a6 42 76 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bea:	53                   	push   rbx
 1089beb:	48 89 fb             	mov    rbx,rdi
 1089bee:	48 81 c7 f8 00 00 00 	add    rdi,0xf8
 1089bf5:	e8 96 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bfa:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
 1089c01:	e8 28 00 00 00       	call   1089c2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251044>
 1089c06:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]
 1089c0d:	e8                   	.byte 0xe8
 1089c0e:	74 48                	je     1089c58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25106e>

## nearby lower helper cluster

/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000010898f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250d06>:
 10898f0:	00 4c 89 f7          	add    BYTE PTR [rcx+rcx*4-0x9],cl
 10898f4:	e8 b7 bc ce ff       	call   d755b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42636>
 10898f9:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
 10898fd:	4d 85 f6             	test   r14,r14
 1089900:	74 1c                	je     108991e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250d34>
 1089902:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
 1089905:	49 8d 7e 10          	lea    rdi,[r14+0x10]
 1089909:	e8 64 04 00 00       	call   1089d72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251188>
 108990e:	4c 89 f7             	mov    rdi,r14
 1089911:	e8 0a 46 76 00       	call   17edf20 <_ZdlPv@plt>
 1089916:	4d 89 fe             	mov    r14,r15
 1089919:	4d 85 ff             	test   r15,r15
 108991c:	75 e4                	jne    1089902 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250d18>
 108991e:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 1089922:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
 1089927:	48 85 ff             	test   rdi,rdi
 108992a:	74 05                	je     1089931 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250d47>
 108992c:	e8 ef 45 76 00       	call   17edf20 <_ZdlPv@plt>
 1089931:	48 89 df             	mov    rdi,rbx
 1089934:	5b                   	pop    rbx
 1089935:	41 5e                	pop    r14
 1089937:	41 5f                	pop    r15
 1089939:	e9 72 bc ce ff       	jmp    d755b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42636>
 108993e:	53                   	push   rbx
 108993f:	48 89 fb             	mov    rbx,rdi
 1089942:	48 8b bf 18 06 00 00 	mov    rdi,QWORD PTR [rdi+0x618]
 1089949:	e8 6c 4c a5 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
 108994e:	48 8b bb 00 06 00 00 	mov    rdi,QWORD PTR [rbx+0x600]
 1089955:	e8 60 4c a5 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
 108995a:	48 8d bb c8 05 00 00 	lea    rdi,[rbx+0x5c8]
 1089961:	e8 3e 00 00 00       	call   10899a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250dba>
 1089966:	48 8d bb b0 05 00 00 	lea    rdi,[rbx+0x5b0]
 108996d:	e8 1e 45 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089972:	48 8d bb 98 05 00 00 	lea    rdi,[rbx+0x598]
 1089979:	e8 6e 00 00 00       	call   10899ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e02>
 108997e:	48 8d bb 80 05 00 00 	lea    rdi,[rbx+0x580]
 1089985:	e8 62 00 00 00       	call   10899ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e02>
 108998a:	48 8d bb 68 05 00 00 	lea    rdi,[rbx+0x568]
 1089991:	e8 92 00 00 00       	call   1089a28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e3e>
 1089996:	48 83 c3 10          	add    rbx,0x10
 108999a:	48 89 df             	mov    rdi,rbx
 108999d:	5b                   	pop    rbx
 108999e:	e9 c1 00 00 00       	jmp    1089a64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e7a>
 10899a3:	cc                   	int3
 10899a4:	53                   	push   rbx
 10899a5:	48 83 ec 10          	sub    rsp,0x10
 10899a9:	48 89 fb             	mov    rbx,rdi
 10899ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10899b3:	00 00 
 10899b5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 10899ba:	48 8d 47 18          	lea    rax,[rdi+0x18]
 10899be:	48 89 e7             	mov    rdi,rsp
 10899c1:	48 89 07             	mov    QWORD PTR [rdi],rax
 10899c4:	e8 69 7a ac ff       	call   b51432 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9e3d2>
 10899c9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10899d0:	00 00 
 10899d2:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 10899d7:	75 0d                	jne    10899e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250dfc>
 10899d9:	48 89 df             	mov    rdi,rbx
 10899dc:	48 83 c4 10          	add    rsp,0x10
 10899e0:	5b                   	pop    rbx
 10899e1:	e9 aa 44 76 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10899e6:	e8 c5 60 76 00       	call   17efab0 <__stack_chk_fail@plt>
 10899eb:	cc                   	int3
 10899ec:	48 83 ec 18          	sub    rsp,0x18
 10899f0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10899f7:	00 00 
 10899f9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10899fe:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
 1089a03:	48 89 38             	mov    QWORD PTR [rax],rdi
 1089a06:	48 89 c7             	mov    rdi,rax
 1089a09:	e8 d6 02 00 00       	call   1089ce4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510fa>
 1089a0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1089a15:	00 00 
 1089a17:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 1089a1c:	75 05                	jne    1089a23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e39>
 1089a1e:	48 83 c4 18          	add    rsp,0x18
 1089a22:	c3                   	ret
 1089a23:	e8 88 60 76 00       	call   17efab0 <__stack_chk_fail@plt>
 1089a28:	48 83 ec 18          	sub    rsp,0x18
 1089a2c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1089a33:	00 00 
 1089a35:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 1089a3a:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
 1089a3f:	48 89 38             	mov    QWORD PTR [rax],rdi
 1089a42:	48 89 c7             	mov    rdi,rax
 1089a45:	e8 40 02 00 00       	call   1089c8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510a0>
 1089a4a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1089a51:	00 00 
 1089a53:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 1089a58:	75 05                	jne    1089a5f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e75>
 1089a5a:	48 83 c4 18          	add    rsp,0x18
 1089a5e:	c3                   	ret
 1089a5f:	e8 4c 60 76 00       	call   17efab0 <__stack_chk_fail@plt>
 1089a64:	80 bf 50 05 00 00 00 	cmp    BYTE PTR [rdi+0x550],0x0
 1089a6b:	0f 85 01 00 00 00    	jne    1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
 1089a71:	c3                   	ret
 1089a72:	53                   	push   rbx
 1089a73:	48 89 fb             	mov    rbx,rdi
 1089a76:	48 81 c7 30 04 00 00 	add    rdi,0x430
 1089a7d:	e8 48 00 00 00       	call   1089aca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250ee0>
 1089a82:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
 1089a89:	e8 4a 00 00 00       	call   1089ad8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250eee>
 1089a8e:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
 1089a95:	e8 4a 00 00 00       	call   1089ae4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250efa>
 1089a9a:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
 1089aa1:	e8 5e 00 00 00       	call   1089b04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250f1a>
 1089aa6:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 1089aaa:	e8 e1 43 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089aaf:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 1089ab3:	e8 d8 43 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089ab8:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 1089abc:	e8 cf 43 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089ac1:	48 89 df             	mov    rdi,rbx
 1089ac4:	5b                   	pop    rbx
 1089ac5:	e9 02 4d a1 ff       	jmp    a9e7cc <JNI_OnUnload@@Base+0x26099>
 1089aca:	80 bf 10 01 00 00 00 	cmp    BYTE PTR [rdi+0x110],0x0
 1089ad1:	0f 85 13 01 00 00    	jne    1089bea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251000>
 1089ad7:	c3                   	ret
 1089ad8:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
 1089adc:	0f 85 5c c8 fc ff    	jne    105633e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21d754>
 1089ae2:	c3                   	ret
 1089ae3:	cc                   	int3
 1089ae4:	53                   	push   rbx
 1089ae5:	48 89 fb             	mov    rbx,rdi
 1089ae8:	48 83 c7 38          	add    rdi,0x38
 1089aec:	e8 3f d2 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089af1:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 1089af5:	e8 96 43 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089afa:	48 89 df             	mov    rdi,rbx
 1089afd:	5b                   	pop    rbx
 1089afe:	e9 8d 43 76 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089b03:	cc                   	int3
 1089b04:	53                   	push   rbx
 1089b05:	48 89 fb             	mov    rbx,rdi
 1089b08:	48 81 c7 28 02 00 00 	add    rdi,0x228
 1089b0f:	e8 1c d2 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b14:	48 8d bb 68 01 00 00 	lea    rdi,[rbx+0x168]
 1089b1b:	e8 78 00 00 00       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
 1089b20:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
 1089b27:	e8 04 d2 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b2c:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 1089b33:	e8 f8 d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b38:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
 1089b3f:	e8 ec d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b44:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
 1089b4b:	e8 e0 d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b50:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
 1089b57:	e8 d4 d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b5c:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 1089b63:	e8 c8 d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b68:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
 1089b6f:	e8 bc d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b74:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 1089b78:	e8 b3 d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b7d:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 1089b81:	e8 aa d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b86:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
 1089b8a:	e8 a1 d1 a1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b8f:	48 89 df             	mov    rdi,rbx
 1089b92:	5b                   	pop    rbx
 1089b93:	e9 98 d1 a1 ff       	jmp    aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1089b98:	53                   	push   rbx
 1089b99:	48 89 fb             	mov    rbx,rdi
 1089b9c:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
 1089ba3:	e8 e8 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089ba8:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
 1089baf:	e8 dc 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bb4:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
 1089bb8:	e8 d3 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bbd:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 1089bc1:	e8 ca 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bc6:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
 1089bca:	e8 c1 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bcf:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
 1089bd3:	e8 b8 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bd8:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 1089bdc:	e8 af 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089be1:	48 89 df             	mov    rdi,rbx
 1089be4:	5b                   	pop    rbx
 1089be5:	e9 a6 42 76 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bea:	53                   	push   rbx
 1089beb:	48 89 fb             	mov    rbx,rdi
 1089bee:	48 81 c7 f8 00 00 00 	add    rdi,0xf8
 1089bf5:	e8 96 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089bfa:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
 1089c01:	e8 28 00 00 00       	call   1089c2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251044>
 1089c06:	48 8b bb c0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc0]
 1089c0d:	e8 74 48 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1089c12:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
 1089c16:	e8 75 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089c1b:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 1089c1f:	e8 6c 42 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089c24:	48 89 df             	mov    rdi,rbx
 1089c27:	5b                   	pop    rbx
 1089c28:	e9 63 42 76 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1089c2d:	cc                   	int3
 1089c2e:	53                   	push   rbx
 1089c2f:	48 83 ec 10          	sub    rsp,0x10
 1089c33:	48 89 fb             	mov    rbx,rdi
 1089c36:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1089c3d:	00 00 
 1089c3f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1089c44:	8b 47 18             	mov    eax,DWORD PTR [rdi+0x18]
 1089c47:	b9 ff ff ff ff       	mov    ecx,0xffffffff
 1089c4c:	48 39 c8             	cmp    rax,rcx
 1089c4f:	74 12                	je     1089c63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251079>
 1089c51:	48 8d 0d c0 0b 7c 00 	lea    rcx,[rip+0x7c0bc0]        # 184a818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6f00>
 1089c58:	48 8d 7c 24 07       	lea    rdi,[rsp+0x7]
 1089c5d:	48 89 de             	mov    rsi,rbx
 1089c60:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
 1089c63:	83 4b 18 ff          	or     DWORD PTR [rbx+0x18],0xffffffff
 1089c67:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1089c6e:	00 00 
 1089c70:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 1089c75:	75 06                	jne    1089c7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251093>
 1089c77:	48 83 c4 10          	add    rsp,0x10
 1089c7b:	5b                   	pop    rbx
 1089c7c:	c3                   	ret
 1089c7d:	e8 2e 5e 76 00       	call   17efab0 <__stack_chk_fail@plt>
 1089c82:	48 89 c7             	mov    rdi,rax
 1089c85:	e8 1b fe 9e ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1089c8a:	53                   	push   rbx
 1089c8b:	48 89 fb             	mov    rbx,rdi
 1089c8e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 1089c91:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
 1089c95:	74 11                	je     1089ca8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510be>
 1089c97:	e8 0e 00 00 00       	call   1089caa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c0>
 1089c9c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1089c9f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 1089ca2:	5b                   	pop    rbx
 1089ca3:	e9 78 42 76 00       	jmp    17edf20 <_ZdlPv@plt>
 1089ca8:	5b                   	pop    rbx
 1089ca9:	c3                   	ret
 1089caa:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
 1089cad:	e9 00 00 00 00       	jmp    1089cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510c8>
 1089cb2:	41 57                	push   r15
 1089cb4:	41 56                	push   r14
 1089cb6:	53                   	push   rbx
 1089cb7:	48 89 f3             	mov    rbx,rsi
 1089cba:	49 89 fe             	mov    r14,rdi
 1089cbd:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
 1089cc1:	49 39 f7             	cmp    r15,rsi
 1089cc4:	74 14                	je     1089cda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510f0>
 1089cc6:	49 81 c7 b0 fa ff ff 	add    r15,0xfffffffffffffab0
 1089ccd:	4c 89 ff             	mov    rdi,r15
 1089cd0:	e8 9d fd ff ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
 1089cd5:	49 39 df             	cmp    r15,rbx
 1089cd8:	75 ec                	jne    1089cc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2510dc>
 1089cda:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
 1089cde:	5b                   	pop    rbx
 1089cdf:	41 5e                	pop    r14
 1089ce1:	41 5f                	pop    r15
 1089ce3:	c3                   	ret
 1089ce4:	53                   	push   rbx
 1089ce5:	48 89 fb             	mov    rbx,rdi
 1089ce8:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 1089ceb:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
 1089cef:	74 11                	je     1089d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251118>
 1089cf1:	e8 0e 00 00 00       	call   1089d04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25111a>
 1089cf6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1089cf9:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 1089cfc:	5b                   	pop    rbx
 1089cfd:	e9 1e 42 76 00       	jmp    17edf20 <_ZdlPv@plt>
 1089d02:	5b                   	pop    rbx
 1089d03:	c3                   	ret
 1089d04:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
 1089d07:	e9 00 00 00 00       	jmp    1089d0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251122>
 1089d0c:	41 57                	push   r15
 1089d0e:	41 56                	push   r14
 1089d10:	53                   	push   rbx
 1089d11:	48 89 f3             	mov    rbx,rsi
 1089d14:	49 89 fe             	mov    r14,rdi
 1089d17:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
 1089d1b:	49 39 f7             	cmp    r15,rsi
 1089d1e:	74 14                	je     1089d34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25114a>

## Owner wrapper address arithmetic
72- 10a9ddf:	49 39 df             	cmp    r15,rbx
73- 10a9de2:	75 ec                	jne    10a9dd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2711e6>
74- 10a9de4:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
75- 10a9de8:	5b                   	pop    rbx
76- 10a9de9:	41 5e                	pop    r14
77- 10a9deb:	41 5f                	pop    r15
78- 10a9ded:	c3                   	ret
79- 10a9dee:	53                   	push   rbx
80- 10a9def:	48 89 fb             	mov    rbx,rdi
81- 10a9df2:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
82: 10a9df9:	e8 9a fd fd ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
83- 10a9dfe:	48 8d bb 88 00 00 00 	lea    rdi,[rbx+0x88]
84- 10a9e05:	e8 86 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
85- 10a9e0a:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
86- 10a9e0e:	e8 7d 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
87- 10a9e13:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
88- 10a9e17:	e8 74 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
89- 10a9e1c:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
90- 10a9e20:	e8 6b 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
91- 10a9e25:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
92- 10a9e29:	e8 62 40 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
93- 10a9e2e:	48 89 df             	mov    rdi,rbx
94- 10a9e31:	5b                   	pop    rbx
95- 10a9e32:	e9 59 40 74 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
96- 10a9e37:	cc                   	int3
97- 10a9e38:	53                   	push   rbx
98- 10a9e39:	48 89 fb             	mov    rbx,rdi
99- 10a9e3c:	48 81 c7 60 01 00 00 	add    rdi,0x160
100: 10a9e43:	e8 2a fc fd ff       	call   1089a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250e88>
101- 10a9e48:	48 89 df             	mov    rdi,rbx
102- 10a9e4b:	5b                   	pop    rbx
103- 10a9e4c:	e9 9d ff ff ff       	jmp    10a9dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271204>
104- 10a9e51:	cc                   	int3
105- 10a9e52:	53                   	push   rbx
106- 10a9e53:	48 89 fb             	mov    rbx,rdi
107- 10a9e56:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
108- 10a9e59:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
109- 10a9e5d:	74 11                	je     10a9e70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271286>
110- 10a9e5f:	e8 0e 00 00 00       	call   10a9e72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271288>
111- 10a9e64:	48 8b 03             	mov    rax,QWORD PTR [rbx]
112- 10a9e67:	48 8b 38             	mov    rdi,QWORD PTR [rax]
113- 10a9e6a:	5b                   	pop    rbx
114- 10a9e6b:	e9 b0 40 74 00       	jmp    17edf20 <_ZdlPv@plt>
--
199- 10a9f87:	75 08                	jne    10a9f91 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713a7>
200- 10a9f89:	48 83 c4 48          	add    rsp,0x48
201- 10a9f8d:	5b                   	pop    rbx
202- 10a9f8e:	41 5e                	pop    r14
203- 10a9f90:	c3                   	ret
204- 10a9f91:	e8 1a 5b 74 00       	call   17efab0 <__stack_chk_fail@plt>
205- 10a9f96:	48 89 c7             	mov    rdi,rax
206- 10a9f99:	e8 07 fb 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
207- 10a9f9e:	53                   	push   rbx
208- 10a9f9f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
209: 10a9fa2:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
210- 10a9fa6:	e8 13 00 00 00       	call   10a9fbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713d4>
211- 10a9fab:	48 89 df             	mov    rdi,rbx
212- 10a9fae:	31 f6                	xor    esi,esi
213- 10a9fb0:	5b                   	pop    rbx
214- 10a9fb1:	e9 ae c4 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
215- 10a9fb6:	48 89 c7             	mov    rdi,rax
216- 10a9fb9:	e8 e7 fa 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
