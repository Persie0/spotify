# Restrictions AP `0x184d898` method trace

Parallel v6 report. Focus: the method table of the `0x28` object installed into `this+0x18` / returned by `b411a4`.

## Relocation-backed entries near AP `0x184d898`

```text
000000000184d898  0000000000000008 R_X86_64_RELATIVE                         10bff2c
000000000184d8a0  0000000000000008 R_X86_64_RELATIVE                         10bff40
000000000184d8a8  0000000000000008 R_X86_64_RELATIVE                         10bff52
000000000184d8b0  0000000000000008 R_X86_64_RELATIVE                         10bffde
000000000184d8c8  0000000000000008 R_X86_64_RELATIVE                         abfe12
000000000184d8d0  0000000000000008 R_X86_64_RELATIVE                         abfe54
000000000184d8d8  0000000000000008 R_X86_64_RELATIVE                         174ec6a
000000000184d8e0  0000000000000008 R_X86_64_RELATIVE                         174f1dc
000000000184d8e8  0000000000000008 R_X86_64_RELATIVE                         10c01f4
000000000184d8f0  0000000000000008 R_X86_64_RELATIVE                         174ef82
000000000184d908  0000000000000008 R_X86_64_RELATIVE                         10c0192
000000000184d910  0000000000000008 R_X86_64_RELATIVE                         10c01c8
000000000184d918  0000000000000008 R_X86_64_RELATIVE                         174ec6a
000000000184d920  0000000000000008 R_X86_64_RELATIVE                         174f1dc
000000000184d928  0000000000000008 R_X86_64_RELATIVE                         10c01da
000000000184d930  0000000000000008 R_X86_64_RELATIVE                         174ef82
000000000184d948  0000000000000008 R_X86_64_RELATIVE                         10c00bc
000000000184d950  0000000000000008 R_X86_64_RELATIVE                         10c00e4
000000000184d958  0000000000000008 R_X86_64_RELATIVE                         174ec6a
000000000184d960  0000000000000008 R_X86_64_RELATIVE                         174f1dc
000000000184d968  0000000000000008 R_X86_64_RELATIVE                         10c00f6
000000000184d970  0000000000000008 R_X86_64_RELATIVE                         174ef82
000000000184d980  0000000000000008 R_X86_64_RELATIVE                         18f9058
000000000184d988  0000000000000008 R_X86_64_RELATIVE                         18f9080
000000000184d990  0000000000000008 R_X86_64_RELATIVE                         18f90e0
000000000184d9a8  0000000000000008 R_X86_64_RELATIVE                         10c0806
000000000184d9b0  0000000000000008 R_X86_64_RELATIVE                         10c0854
```
## AP entry `0x0` -> `0x10bff2c`

```text
 10bfef3:	5d                   	pop    rbp
 10bfef4:	c3                   	ret
 10bfef5:	e8 c6 46 94 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
 10bfefa:	e8 e0 b7 9b ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
 10bfeff:	cc                   	int3
 10bff00:	48 8d 05 59 d9 78 00 	lea    rax,[rip+0x78d959]        # 184d860 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f48>
 10bff07:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff0a:	e9 01 e1 72 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 10bff0f:	cc                   	int3
 10bff10:	53                   	push   rbx
 10bff11:	48 89 fb             	mov    rbx,rdi
 10bff14:	e8 e7 ff ff ff       	call   10bff00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287316>
 10bff19:	48 89 df             	mov    rdi,rbx
 10bff1c:	5b                   	pop    rbx
 10bff1d:	e9 fe df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff22:	48 83 c7 18          	add    rdi,0x18
 10bff26:	e9 ff dd fe ff       	jmp    10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10bff2b:	cc                   	int3
 10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10bff33:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff36:	48 83 c7 08          	add    rdi,0x8
 10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10bff3f:	cc                   	int3
 10bff40:	53                   	push   rbx
 10bff41:	48 89 fb             	mov    rbx,rdi
 10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>
 10bff49:	48 89 df             	mov    rdi,rbx
 10bff4c:	5b                   	pop    rbx
 10bff4d:	e9 ce df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff52:	41 56                	push   r14
 10bff54:	53                   	push   rbx
 10bff55:	48 83 ec 28          	sub    rsp,0x28
 10bff59:	48 89 d3             	mov    rbx,rdx
 10bff5c:	48 89 f2             	mov    rdx,rsi
 10bff5f:	48 89 f8             	mov    rax,rdi
 10bff62:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bff69:	00 00
 10bff6b:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 10bff70:	48 8d 77 08          	lea    rsi,[rdi+0x8]
 10bff74:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bff79:	4c 89 f7             	mov    rdi,r14
 10bff7c:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10bff7f:	48 89 df             	mov    rdi,rbx
 10bff82:	e8 af b8 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bff87:	4c 89 f7             	mov    rdi,r14
 10bff8a:	48 89 c6             	mov    rsi,rax
 10bff8d:	e8 60 4f 70 00       	call   17c4ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17905e>
 10bff92:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bff97:	e8 f4 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bff9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffa3:	00 00
 10bffa5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffaa:	75 2d                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffac:	48 83 c4 28          	add    rsp,0x28
 10bffb0:	5b                   	pop    rbx
 10bffb1:	41 5e                	pop    r14
 10bffb3:	c3                   	ret
 10bffb4:	48 89 c3             	mov    rbx,rax
 10bffb7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bffbc:	e8 cf de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bffc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffc8:	00 00
 10bffca:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffcf:	75 08                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffd1:	48 89 df             	mov    rdi,rbx
 10bffd4:	e8 f7 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bffd9:	e8 d2 fa 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10bffde:	55                   	push   rbp
 10bffdf:	53                   	push   rbx
 10bffe0:	48 83 ec 48          	sub    rsp,0x48
 10bffe4:	48 89 f0             	mov    rax,rsi
 10bffe7:	48 89 fb             	mov    rbx,rdi
 10bffea:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bfff1:	00 00
 10bfff3:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
 10bfff8:	0f 57 c0             	xorps  xmm0,xmm0
 10bfffb:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c0000:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0006:	48 83 c6 08          	add    rsi,0x8
 10c000a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c000f:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c0012:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c0017:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10c001c:	31 d2                	xor    edx,edx
 10c001e:	e8 b9 4e 70 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
 10c0023:	89 c5                	mov    ebp,eax
 10c0025:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c002a:	e8 61 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c002f:	40 84 ed             	test   bpl,bpl
 10c0032:	74 23                	je     10c0057 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28746d>
```
## AP entry `0x8` -> `0x10bff40`

```text
 10bff00:	48 8d 05 59 d9 78 00 	lea    rax,[rip+0x78d959]        # 184d860 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f48>
 10bff07:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff0a:	e9 01 e1 72 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 10bff0f:	cc                   	int3
 10bff10:	53                   	push   rbx
 10bff11:	48 89 fb             	mov    rbx,rdi
 10bff14:	e8 e7 ff ff ff       	call   10bff00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287316>
 10bff19:	48 89 df             	mov    rdi,rbx
 10bff1c:	5b                   	pop    rbx
 10bff1d:	e9 fe df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff22:	48 83 c7 18          	add    rdi,0x18
 10bff26:	e9 ff dd fe ff       	jmp    10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10bff2b:	cc                   	int3
 10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10bff33:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff36:	48 83 c7 08          	add    rdi,0x8
 10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10bff3f:	cc                   	int3
 10bff40:	53                   	push   rbx
 10bff41:	48 89 fb             	mov    rbx,rdi
 10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>
 10bff49:	48 89 df             	mov    rdi,rbx
 10bff4c:	5b                   	pop    rbx
 10bff4d:	e9 ce df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff52:	41 56                	push   r14
 10bff54:	53                   	push   rbx
 10bff55:	48 83 ec 28          	sub    rsp,0x28
 10bff59:	48 89 d3             	mov    rbx,rdx
 10bff5c:	48 89 f2             	mov    rdx,rsi
 10bff5f:	48 89 f8             	mov    rax,rdi
 10bff62:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bff69:	00 00
 10bff6b:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 10bff70:	48 8d 77 08          	lea    rsi,[rdi+0x8]
 10bff74:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bff79:	4c 89 f7             	mov    rdi,r14
 10bff7c:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10bff7f:	48 89 df             	mov    rdi,rbx
 10bff82:	e8 af b8 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bff87:	4c 89 f7             	mov    rdi,r14
 10bff8a:	48 89 c6             	mov    rsi,rax
 10bff8d:	e8 60 4f 70 00       	call   17c4ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17905e>
 10bff92:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bff97:	e8 f4 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bff9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffa3:	00 00
 10bffa5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffaa:	75 2d                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffac:	48 83 c4 28          	add    rsp,0x28
 10bffb0:	5b                   	pop    rbx
 10bffb1:	41 5e                	pop    r14
 10bffb3:	c3                   	ret
 10bffb4:	48 89 c3             	mov    rbx,rax
 10bffb7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bffbc:	e8 cf de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bffc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffc8:	00 00
 10bffca:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffcf:	75 08                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffd1:	48 89 df             	mov    rdi,rbx
 10bffd4:	e8 f7 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bffd9:	e8 d2 fa 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10bffde:	55                   	push   rbp
 10bffdf:	53                   	push   rbx
 10bffe0:	48 83 ec 48          	sub    rsp,0x48
 10bffe4:	48 89 f0             	mov    rax,rsi
 10bffe7:	48 89 fb             	mov    rbx,rdi
 10bffea:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bfff1:	00 00
 10bfff3:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
 10bfff8:	0f 57 c0             	xorps  xmm0,xmm0
 10bfffb:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c0000:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0006:	48 83 c6 08          	add    rsi,0x8
 10c000a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c000f:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c0012:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c0017:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10c001c:	31 d2                	xor    edx,edx
 10c001e:	e8 b9 4e 70 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
 10c0023:	89 c5                	mov    ebp,eax
 10c0025:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c002a:	e8 61 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c002f:	40 84 ed             	test   bpl,bpl
 10c0032:	74 23                	je     10c0057 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28746d>
 10c0034:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10c0039:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 10c003d:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
 10c0042:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10c0045:	0f 57 c0             	xorps  xmm0,xmm0
```
## AP entry `0x10` -> `0x10bff52`

```text
 10bff14:	e8 e7 ff ff ff       	call   10bff00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287316>
 10bff19:	48 89 df             	mov    rdi,rbx
 10bff1c:	5b                   	pop    rbx
 10bff1d:	e9 fe df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff22:	48 83 c7 18          	add    rdi,0x18
 10bff26:	e9 ff dd fe ff       	jmp    10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10bff2b:	cc                   	int3
 10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>
 10bff33:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bff36:	48 83 c7 08          	add    rdi,0x8
 10bff3a:	e9 13 1d d2 ff       	jmp    de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10bff3f:	cc                   	int3
 10bff40:	53                   	push   rbx
 10bff41:	48 89 fb             	mov    rbx,rdi
 10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>
 10bff49:	48 89 df             	mov    rdi,rbx
 10bff4c:	5b                   	pop    rbx
 10bff4d:	e9 ce df 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10bff52:	41 56                	push   r14
 10bff54:	53                   	push   rbx
 10bff55:	48 83 ec 28          	sub    rsp,0x28
 10bff59:	48 89 d3             	mov    rbx,rdx
 10bff5c:	48 89 f2             	mov    rdx,rsi
 10bff5f:	48 89 f8             	mov    rax,rdi
 10bff62:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bff69:	00 00
 10bff6b:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 10bff70:	48 8d 77 08          	lea    rsi,[rdi+0x8]
 10bff74:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bff79:	4c 89 f7             	mov    rdi,r14
 10bff7c:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10bff7f:	48 89 df             	mov    rdi,rbx
 10bff82:	e8 af b8 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bff87:	4c 89 f7             	mov    rdi,r14
 10bff8a:	48 89 c6             	mov    rsi,rax
 10bff8d:	e8 60 4f 70 00       	call   17c4ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17905e>
 10bff92:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bff97:	e8 f4 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bff9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffa3:	00 00
 10bffa5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffaa:	75 2d                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffac:	48 83 c4 28          	add    rsp,0x28
 10bffb0:	5b                   	pop    rbx
 10bffb1:	41 5e                	pop    r14
 10bffb3:	c3                   	ret
 10bffb4:	48 89 c3             	mov    rbx,rax
 10bffb7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bffbc:	e8 cf de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bffc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffc8:	00 00
 10bffca:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffcf:	75 08                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffd1:	48 89 df             	mov    rdi,rbx
 10bffd4:	e8 f7 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bffd9:	e8 d2 fa 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10bffde:	55                   	push   rbp
 10bffdf:	53                   	push   rbx
 10bffe0:	48 83 ec 48          	sub    rsp,0x48
 10bffe4:	48 89 f0             	mov    rax,rsi
 10bffe7:	48 89 fb             	mov    rbx,rdi
 10bffea:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bfff1:	00 00
 10bfff3:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
 10bfff8:	0f 57 c0             	xorps  xmm0,xmm0
 10bfffb:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c0000:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0006:	48 83 c6 08          	add    rsi,0x8
 10c000a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c000f:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c0012:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c0017:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10c001c:	31 d2                	xor    edx,edx
 10c001e:	e8 b9 4e 70 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
 10c0023:	89 c5                	mov    ebp,eax
 10c0025:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c002a:	e8 61 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c002f:	40 84 ed             	test   bpl,bpl
 10c0032:	74 23                	je     10c0057 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28746d>
 10c0034:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10c0039:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 10c003d:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
 10c0042:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10c0045:	0f 57 c0             	xorps  xmm0,xmm0
 10c0048:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c004d:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0053:	b0 01                	mov    al,0x1
 10c0055:	eb 05                	jmp    10c005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287472>
 10c0057:	c6 03 00             	mov    BYTE PTR [rbx],0x0
 10c005a:	31 c0                	xor    eax,eax
```
## AP entry `0x18` -> `0x10bffde`

```text
 10bff9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffa3:	00 00
 10bffa5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffaa:	75 2d                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffac:	48 83 c4 28          	add    rsp,0x28
 10bffb0:	5b                   	pop    rbx
 10bffb1:	41 5e                	pop    r14
 10bffb3:	c3                   	ret
 10bffb4:	48 89 c3             	mov    rbx,rax
 10bffb7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bffbc:	e8 cf de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bffc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bffc8:	00 00
 10bffca:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bffcf:	75 08                	jne    10bffd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2873ef>
 10bffd1:	48 89 df             	mov    rdi,rbx
 10bffd4:	e8 f7 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bffd9:	e8 d2 fa 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10bffde:	55                   	push   rbp
 10bffdf:	53                   	push   rbx
 10bffe0:	48 83 ec 48          	sub    rsp,0x48
 10bffe4:	48 89 f0             	mov    rax,rsi
 10bffe7:	48 89 fb             	mov    rbx,rdi
 10bffea:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bfff1:	00 00
 10bfff3:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
 10bfff8:	0f 57 c0             	xorps  xmm0,xmm0
 10bfffb:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c0000:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0006:	48 83 c6 08          	add    rsi,0x8
 10c000a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c000f:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10c0012:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c0017:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10c001c:	31 d2                	xor    edx,edx
 10c001e:	e8 b9 4e 70 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>
 10c0023:	89 c5                	mov    ebp,eax
 10c0025:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c002a:	e8 61 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c002f:	40 84 ed             	test   bpl,bpl
 10c0032:	74 23                	je     10c0057 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28746d>
 10c0034:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10c0039:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 10c003d:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
 10c0042:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10c0045:	0f 57 c0             	xorps  xmm0,xmm0
 10c0048:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 10c004d:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 10c0053:	b0 01                	mov    al,0x1
 10c0055:	eb 05                	jmp    10c005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287472>
 10c0057:	c6 03 00             	mov    BYTE PTR [rbx],0x0
 10c005a:	31 c0                	xor    eax,eax
 10c005c:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
 10c005f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10c0064:	e8 27 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c0069:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10c0070:	00 00
 10c0072:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10c0077:	75 3e                	jne    10c00b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874cd>
 10c0079:	48 89 d8             	mov    rax,rbx
 10c007c:	48 83 c4 48          	add    rsp,0x48
 10c0080:	5b                   	pop    rbx
 10c0081:	5d                   	pop    rbp
 10c0082:	c3                   	ret
 10c0083:	48 89 c3             	mov    rbx,rax
 10c0086:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10c008b:	e8 00 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c0090:	eb 03                	jmp    10c0095 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874ab>
 10c0092:	48 89 c3             	mov    rbx,rax
 10c0095:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10c009a:	e8 f1 dd 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10c009f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10c00a6:	00 00
 10c00a8:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10c00ad:	75 08                	jne    10c00b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874cd>
 10c00af:	48 89 df             	mov    rdi,rbx
 10c00b2:	e8 19 fc 9a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10c00b7:	e8 f4 f9 72 00       	call   17efab0 <__stack_chk_fail@plt>
 10c00bc:	53                   	push   rbx
 10c00bd:	48 89 fb             	mov    rbx,rdi
 10c00c0:	48 83 c7 08          	add    rdi,0x8
 10c00c4:	e8 3f a9 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10c00c9:	48 8b 5b 18          	mov    rbx,QWORD PTR [rbx+0x18]
 10c00cd:	48 85 db             	test   rbx,rbx
 10c00d0:	74 08                	je     10c00da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874f0>
 10c00d2:	48 89 df             	mov    rdi,rbx
 10c00d5:	e8 b8 00 00 00       	call   10c0192 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2875a8>
 10c00da:	48 89 df             	mov    rdi,rbx
 10c00dd:	5b                   	pop    rbx
 10c00de:	e9 3d de 72 00       	jmp    17edf20 <_ZdlPv@plt>
```
## AP entry `0x30` -> `0xabfe12`

```text
  abfdd5:	74 2e                	je     abfe05 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcda5>
  abfdd7:	49 8b 2e             	mov    rbp,QWORD PTR [r14]
  abfdda:	0f 18 45 00          	prefetchnta BYTE PTR [rbp+0x0]
  abfdde:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  abfde2:	e8 a9 e0 d2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  abfde7:	0f b6 43 0e          	movzx  eax,BYTE PTR [rbx+0xe]
  abfdeb:	49 8d 3c 06          	lea    rdi,[r14+rax*1]
  abfdef:	49 8b 04 06          	mov    rax,QWORD PTR [r14+rax*1]
  abfdf3:	ff 10                	call   QWORD PTR [rax]
  abfdf5:	4c 89 f7             	mov    rdi,r14
  abfdf8:	e8 23 e1 d2 00       	call   17edf20 <_ZdlPv@plt>
  abfdfd:	49 89 ee             	mov    r14,rbp
  abfe00:	48 85 ed             	test   rbp,rbp
  abfe03:	75 d2                	jne    abfdd7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd77>
  abfe05:	49 ff c4             	inc    r12
  abfe08:	4d 39 fc             	cmp    r12,r15
  abfe0b:	72 c0                	jb     abfdcd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd6d>
  abfe0d:	e9 b9 fd ff ff       	jmp    abfbcb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb6b>
  abfe12:	53                   	push   rbx
  abfe13:	48 89 fb             	mov    rbx,rdi
  abfe16:	48 8d 05 d3 fd d3 00 	lea    rax,[rip+0xd3fdd3]        # 17ffbf0 <_ZTIN4asio22service_already_existsE@@Base+0x13d8>
  abfe1d:	48 89 07             	mov    QWORD PTR [rdi],rax
  abfe20:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  abfe24:	a8 01                	test   al,0x1
  abfe26:	75 23                	jne    abfe4b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdeb>
  abfe28:	48 85 c0             	test   rax,rax
  abfe2b:	74 02                	je     abfe2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdcf>
  abfe2d:	5b                   	pop    rbx
  abfe2e:	c3                   	ret
  abfe2f:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
  abfe33:	e8 d0 ab fe ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  abfe38:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  abfe3c:	e8 67 5a ca 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
  abfe41:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
  abfe45:	5b                   	pop    rbx
  abfe46:	e9 5d 5a ca 00       	jmp    17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
  abfe4b:	48 83 e0 fe          	and    rax,0xfffffffffffffffe
  abfe4f:	48 8b 00             	mov    rax,QWORD PTR [rax]
  abfe52:	eb d4                	jmp    abfe28 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdc8>
  abfe54:	53                   	push   rbx
  abfe55:	48 89 fb             	mov    rbx,rdi
  abfe58:	e8 b5 ff ff ff       	call   abfe12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdb2>
  abfe5d:	48 89 df             	mov    rdi,rbx
  abfe60:	5b                   	pop    rbx
  abfe61:	e9 ba e0 d2 00       	jmp    17edf20 <_ZdlPv@plt>
  abfe66:	0f 18 0d 4b c4 df 00 	prefetcht0 BYTE PTR [rip+0xdfc44b]        # 18bc2b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x36c8>
  abfe6d:	48 8d 05 44 c4 df 00 	lea    rax,[rip+0xdfc444]        # 18bc2b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x36c8>
  abfe74:	48 8b 0d 45 c4 df 00 	mov    rcx,QWORD PTR [rip+0xdfc445]        # 18bc2c0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x36d0>
  abfe7b:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  abfe7e:	c3                   	ret
  abfe7f:	cc                   	int3
  abfe80:	48 89 f0             	mov    rax,rsi
  abfe83:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  abfe87:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
  abfe8c:	48 8d 0d 65 f9 97 ff 	lea    rcx,[rip+0xffffffffff97f965]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
  abfe93:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
  abfe97:	48 89 4e 20          	mov    QWORD PTR [rsi+0x20],rcx
  abfe9b:	48 8d 0d 1e fb d3 00 	lea    rcx,[rip+0xd3fb1e]        # 17ff9c0 <_ZTIN4asio22service_already_existsE@@Base+0x11a8>
  abfea2:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  abfea5:	c3                   	ret
  abfea6:	53                   	push   rbx
  abfea7:	48 89 fb             	mov    rbx,rdi
  abfeaa:	48 83 c7 08          	add    rdi,0x8
  abfeae:	e8 55 ab fe ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  abfeb3:	48 83 c3 10          	add    rbx,0x10
  abfeb7:	48 89 df             	mov    rdi,rbx
  abfeba:	5b                   	pop    rbx
  abfebb:	e9 4e 00 00 00       	jmp    abff0e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xceae>
  abfec0:	53                   	push   rbx
  abfec1:	48 89 fb             	mov    rbx,rdi
  abfec4:	e8 dd ff ff ff       	call   abfea6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xce46>
  abfec9:	48 89 df             	mov    rdi,rbx
  abfecc:	5b                   	pop    rbx
  abfecd:	e9 4e e0 d2 00       	jmp    17edf20 <_ZdlPv@plt>
  abfed2:	0f 18 0d 0f c3 df 00 	prefetcht0 BYTE PTR [rip+0xdfc30f]        # 18bc1e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x35f8>
  abfed9:	48 8d 05 08 c3 df 00 	lea    rax,[rip+0xdfc308]        # 18bc1e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x35f8>
  abfee0:	48 8b 0d 09 c3 df 00 	mov    rcx,QWORD PTR [rip+0xdfc309]        # 18bc1f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3600>
  abfee7:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  abfeea:	c3                   	ret
  abfeeb:	cc                   	int3
  abfeec:	48 89 f0             	mov    rax,rsi
  abfeef:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  abfef3:	48 8d 0d c6 fb d3 00 	lea    rcx,[rip+0xd3fbc6]        # 17ffac0 <_ZTIN4asio22service_already_existsE@@Base+0x12a8>
  abfefa:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  abfefd:	0f 57 c0             	xorps  xmm0,xmm0
  abff00:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  abff04:	48 89 56 20          	mov    QWORD PTR [rsi+0x20],rdx
  abff08:	83 66 28 00          	and    DWORD PTR [rsi+0x28],0x0
  abff0c:	c3                   	ret
  abff0d:	cc                   	int3
```
## AP entry `0x38` -> `0xabfe54`

```text
  abfe1d:	48 89 07             	mov    QWORD PTR [rdi],rax
  abfe20:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  abfe24:	a8 01                	test   al,0x1
  abfe26:	75 23                	jne    abfe4b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdeb>
  abfe28:	48 85 c0             	test   rax,rax
  abfe2b:	74 02                	je     abfe2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdcf>
  abfe2d:	5b                   	pop    rbx
  abfe2e:	c3                   	ret
  abfe2f:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
  abfe33:	e8 d0 ab fe ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  abfe38:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  abfe3c:	e8 67 5a ca 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
  abfe41:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
  abfe45:	5b                   	pop    rbx
  abfe46:	e9 5d 5a ca 00       	jmp    17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
  abfe4b:	48 83 e0 fe          	and    rax,0xfffffffffffffffe
  abfe4f:	48 8b 00             	mov    rax,QWORD PTR [rax]
  abfe52:	eb d4                	jmp    abfe28 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdc8>
  abfe54:	53                   	push   rbx
  abfe55:	48 89 fb             	mov    rbx,rdi
  abfe58:	e8 b5 ff ff ff       	call   abfe12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdb2>
  abfe5d:	48 89 df             	mov    rdi,rbx
  abfe60:	5b                   	pop    rbx
  abfe61:	e9 ba e0 d2 00       	jmp    17edf20 <_ZdlPv@plt>
  abfe66:	0f 18 0d 4b c4 df 00 	prefetcht0 BYTE PTR [rip+0xdfc44b]        # 18bc2b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x36c8>
  abfe6d:	48 8d 05 44 c4 df 00 	lea    rax,[rip+0xdfc444]        # 18bc2b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x36c8>
  abfe74:	48 8b 0d 45 c4 df 00 	mov    rcx,QWORD PTR [rip+0xdfc445]        # 18bc2c0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x36d0>
  abfe7b:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  abfe7e:	c3                   	ret
  abfe7f:	cc                   	int3
  abfe80:	48 89 f0             	mov    rax,rsi
  abfe83:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  abfe87:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
  abfe8c:	48 8d 0d 65 f9 97 ff 	lea    rcx,[rip+0xffffffffff97f965]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
  abfe93:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
  abfe97:	48 89 4e 20          	mov    QWORD PTR [rsi+0x20],rcx
  abfe9b:	48 8d 0d 1e fb d3 00 	lea    rcx,[rip+0xd3fb1e]        # 17ff9c0 <_ZTIN4asio22service_already_existsE@@Base+0x11a8>
  abfea2:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  abfea5:	c3                   	ret
  abfea6:	53                   	push   rbx
  abfea7:	48 89 fb             	mov    rbx,rdi
  abfeaa:	48 83 c7 08          	add    rdi,0x8
  abfeae:	e8 55 ab fe ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
  abfeb3:	48 83 c3 10          	add    rbx,0x10
  abfeb7:	48 89 df             	mov    rdi,rbx
  abfeba:	5b                   	pop    rbx
  abfebb:	e9 4e 00 00 00       	jmp    abff0e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xceae>
  abfec0:	53                   	push   rbx
  abfec1:	48 89 fb             	mov    rbx,rdi
  abfec4:	e8 dd ff ff ff       	call   abfea6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xce46>
  abfec9:	48 89 df             	mov    rdi,rbx
  abfecc:	5b                   	pop    rbx
  abfecd:	e9 4e e0 d2 00       	jmp    17edf20 <_ZdlPv@plt>
  abfed2:	0f 18 0d 0f c3 df 00 	prefetcht0 BYTE PTR [rip+0xdfc30f]        # 18bc1e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x35f8>
  abfed9:	48 8d 05 08 c3 df 00 	lea    rax,[rip+0xdfc308]        # 18bc1e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x35f8>
  abfee0:	48 8b 0d 09 c3 df 00 	mov    rcx,QWORD PTR [rip+0xdfc309]        # 18bc1f0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3600>
  abfee7:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  abfeea:	c3                   	ret
  abfeeb:	cc                   	int3
  abfeec:	48 89 f0             	mov    rax,rsi
  abfeef:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  abfef3:	48 8d 0d c6 fb d3 00 	lea    rcx,[rip+0xd3fbc6]        # 17ffac0 <_ZTIN4asio22service_already_existsE@@Base+0x12a8>
  abfefa:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  abfefd:	0f 57 c0             	xorps  xmm0,xmm0
  abff00:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
  abff04:	48 89 56 20          	mov    QWORD PTR [rsi+0x20],rdx
  abff08:	83 66 28 00          	and    DWORD PTR [rsi+0x28],0x0
  abff0c:	c3                   	ret
  abff0d:	cc                   	int3
  abff0e:	50                   	push   rax
  abff0f:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
  abff13:	74 05                	je     abff1a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xceba>
  abff15:	e8 6a 25 cc 00       	call   1782484 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1365f0>
  abff1a:	58                   	pop    rax
  abff1b:	c3                   	ret
  abff1c:	48 89 c7             	mov    rdi,rax
  abff1f:	e8 81 9b fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  abff24:	0f 18 0d cd c1 df 00 	prefetcht0 BYTE PTR [rip+0xdfc1cd]        # 18bc0f8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3508>
  abff2b:	48 8d 05 c6 c1 df 00 	lea    rax,[rip+0xdfc1c6]        # 18bc0f8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3508>
  abff32:	48 8b 0d c7 c1 df 00 	mov    rcx,QWORD PTR [rip+0xdfc1c7]        # 18bc100 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3510>
  abff39:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
  abff3c:	c3                   	ret
  abff3d:	cc                   	int3
  abff3e:	48 89 f0             	mov    rax,rsi
  abff41:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
  abff45:	48 8d 0d f4 f9 d3 00 	lea    rcx,[rip+0xd3f9f4]        # 17ff940 <_ZTIN4asio22service_already_existsE@@Base+0x1128>
  abff4c:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  abff4f:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
  abff54:	48 8d 0d 9d f8 97 ff 	lea    rcx,[rip+0xffffffffff97f89d]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
  abff5b:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
```
## AP entry `0x40` -> `0x174ec6a`

```text
 174ec30:	74 13                	je     174ec45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102db1>
 174ec32:	48 8d 35 07 09 cf fe 	lea    rsi,[rip+0xfffffffffecf0907]        # 43f540 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x514c>
 174ec39:	4c 89 ff             	mov    rdi,r15
 174ec3c:	e8 24 cb 04 00       	call   179b765 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14f8d1>
 174ec41:	85 c0                	test   eax,eax
 174ec43:	75 cd                	jne    174ec12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d7e>
 174ec45:	4c 89 f7             	mov    rdi,r14
 174ec48:	e8 11 93 ff ff       	call   1747f5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfc0ca>
 174ec4d:	b8 dd 00 00 00       	mov    eax,0xdd
 174ec52:	41 87 07             	xchg   DWORD PTR [r15],eax
 174ec55:	3d d2 08 a3 05       	cmp    eax,0x5a308d2
 174ec5a:	75 b6                	jne    174ec12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d7e>
 174ec5c:	6a 01                	push   0x1
 174ec5e:	5e                   	pop    rsi
 174ec5f:	4c 89 ff             	mov    rdi,r15
 174ec62:	e8 d7 ca 04 00       	call   179b73e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14f8aa>
 174ec67:	eb a9                	jmp    174ec12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d7e>
 174ec69:	cc                   	int3
 174ec6a:	e9 3f 31 00 00       	jmp    1751dae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105f1a>
 174ec6f:	cc                   	int3
 174ec70:	55                   	push   rbp
 174ec71:	41 57                	push   r15
 174ec73:	41 56                	push   r14
 174ec75:	41 55                	push   r13
 174ec77:	41 54                	push   r12
 174ec79:	53                   	push   rbx
 174ec7a:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
 174ec81:	48 89 fb             	mov    rbx,rdi
 174ec84:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 174ec8b:	00 00
 174ec8d:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 174ec94:	00
 174ec95:	e8 40 ff ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
 174ec9a:	49 89 c7             	mov    r15,rax
 174ec9d:	48 89 df             	mov    rdi,rbx
 174eca0:	e8 e6 40 00 00       	call   1752d8b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106ef7>
 174eca5:	49 89 c6             	mov    r14,rax
 174eca8:	41 8b 4f 08          	mov    ecx,DWORD PTR [r15+0x8]
 174ecac:	31 c0                	xor    eax,eax
 174ecae:	85 c9                	test   ecx,ecx
 174ecb0:	0f 4f c1             	cmovg  eax,ecx
 174ecb3:	7e 35                	jle    174ecea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102e56>
 174ecb5:	4c 6b e0 58          	imul   r12,rax,0x58
 174ecb9:	45 31 ed             	xor    r13d,r13d
 174ecbc:	49 8b 57 40          	mov    rdx,QWORD PTR [r15+0x40]
 174ecc0:	4a 8b 44 2a 48       	mov    rax,QWORD PTR [rdx+r13*1+0x48]
 174ecc5:	83 78 30 03          	cmp    DWORD PTR [rax+0x30],0x3
 174ecc9:	75 16                	jne    174ece1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102e4d>
 174eccb:	4c 01 ea             	add    rdx,r13
 174ecce:	4c 89 f7             	mov    rdi,r14
 174ecd1:	48 89 de             	mov    rsi,rbx
 174ecd4:	e8 4d f0 fe ff       	call   173dd26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf1e92>
 174ecd9:	84 c0                	test   al,al
 174ecdb:	0f 84 b1 01 00 00    	je     174ee92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102ffe>
 174ece1:	49 83 c5 58          	add    r13,0x58
 174ece5:	4d 39 ec             	cmp    r12,r13
 174ece8:	75 d2                	jne    174ecbc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102e28>
 174ecea:	0f 57 c0             	xorps  xmm0,xmm0
 174eced:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
 174ecf3:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 174ecf8:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
 174ecfc:	80 78 53 00          	cmp    BYTE PTR [rax+0x53],0x0
 174ed00:	74 2c                	je     174ed2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102e9a>
 174ed02:	4d 8b 7f 40          	mov    r15,QWORD PTR [r15+0x40]
 174ed06:	6a 01                	push   0x1
 174ed08:	5f                   	pop    rdi
 174ed09:	e8 14 0c 35 ff       	call   a9f922 <JNI_OnUnload@@Base+0x271ef>
 174ed0e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 174ed13:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
 174ed17:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
 174ed1c:	49 83 c7 58          	add    r15,0x58
 174ed20:	4c 89 38             	mov    QWORD PTR [rax],r15
 174ed23:	48 83 c0 08          	add    rax,0x8
 174ed27:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 174ed2c:	eb 15                	jmp    174ed43 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102eaf>
 174ed2e:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
 174ed33:	4c 89 f7             	mov    rdi,r14
 174ed36:	48 89 de             	mov    rsi,rbx
 174ed39:	e8 d8 f2 fe ff       	call   173e016 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2182>
 174ed3e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 174ed43:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
 174ed48:	40 b5 01             	mov    bpl,0x1
 174ed4b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 174ed50:	49 39 c7             	cmp    r15,rax
 174ed53:	0f 84 2d 01 00 00    	je     174ee86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102ff2>
 174ed59:	49 8b 2f             	mov    rbp,QWORD PTR [r15]
 174ed5c:	8a 45 02             	mov    al,BYTE PTR [rbp+0x2]
 174ed5f:	24 fe                	and    al,0xfe
 174ed61:	3c 0a                	cmp    al,0xa
 174ed63:	0f 85 07 01 00 00    	jne    174ee70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102fdc>
```
## AP entry `0x48` -> `0x174f1dc`

```text
 174f19c:	e9 cc fe ff ff       	jmp    174f06d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1031d9>
 174f1a1:	48 83 e7 fe          	and    rdi,0xfffffffffffffffe
 174f1a5:	48 83 c7 08          	add    rdi,0x8
 174f1a9:	eb af                	jmp    174f15a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1032c6>
 174f1ab:	eb 04                	jmp    174f1b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10331d>
 174f1ad:	eb 02                	jmp    174f1b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10331d>
 174f1af:	eb 00                	jmp    174f1b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10331d>
 174f1b1:	48 89 c3             	mov    rbx,rax
 174f1b4:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 174f1b9:	e8 6a c5 32 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 174f1be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 174f1c5:	00 00
 174f1c7:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 174f1cc:	75 08                	jne    174f1d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103342>
 174f1ce:	48 89 df             	mov    rdi,rbx
 174f1d1:	e8 fa 0a 32 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 174f1d6:	e8 d5 08 0a 00       	call   17efab0 <__stack_chk_fail@plt>
 174f1db:	cc                   	int3
 174f1dc:	55                   	push   rbp
 174f1dd:	41 57                	push   r15
 174f1df:	41 56                	push   r14
 174f1e1:	41 55                	push   r13
 174f1e3:	41 54                	push   r12
 174f1e5:	53                   	push   rbx
 174f1e6:	48 83 ec 48          	sub    rsp,0x48
 174f1ea:	48 89 fb             	mov    rbx,rdi
 174f1ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 174f1f4:	00 00
 174f1f6:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 174f1fb:	e8 da f9 ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
 174f200:	48 89 c5             	mov    rbp,rax
 174f203:	48 89 df             	mov    rdi,rbx
 174f206:	e8 cf f9 ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
 174f20b:	0f 57 c0             	xorps  xmm0,xmm0
 174f20e:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 174f214:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 174f219:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
 174f21d:	80 78 53 00          	cmp    BYTE PTR [rax+0x53],0x0
 174f221:	74 3f                	je     174f262 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1033ce>
 174f223:	83 7d 08 00          	cmp    DWORD PTR [rbp+0x8],0x0
 174f227:	7e 4c                	jle    174f275 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1033e1>
 174f229:	45 31 f6             	xor    r14d,r14d
 174f22c:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 174f231:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
 174f236:	45 31 ed             	xor    r13d,r13d
 174f239:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]
 174f23d:	4c 01 f0             	add    rax,r14
 174f240:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 174f245:	4c 89 ff             	mov    rdi,r15
 174f248:	4c 89 e6             	mov    rsi,r12
 174f24b:	e8 5a 05 35 ff       	call   a9f7aa <JNI_OnUnload@@Base+0x27077>
 174f250:	49 ff c5             	inc    r13
 174f253:	48 63 45 08          	movsxd rax,DWORD PTR [rbp+0x8]
 174f257:	49 83 c6 58          	add    r14,0x58
 174f25b:	49 39 c5             	cmp    r13,rax
 174f25e:	7c d9                	jl     174f239 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1033a5>
 174f260:	eb 13                	jmp    174f275 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1033e1>
 174f262:	48 8d 44 24 20       	lea    rax,[rsp+0x20]
 174f267:	48 89 d7             	mov    rdi,rdx
 174f26a:	48 89 de             	mov    rsi,rbx
 174f26d:	48 89 c2             	mov    rdx,rax
 174f270:	e8 a1 ed fe ff       	call   173e016 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2182>
 174f275:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
 174f27a:	48 8b 6c 24 20       	mov    rbp,QWORD PTR [rsp+0x20]
 174f27f:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 174f284:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 174f289:	45 31 ed             	xor    r13d,r13d
 174f28c:	48 39 c5             	cmp    rbp,rax
 174f28f:	0f 84 7f 01 00 00    	je     174f414 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103580>
 174f295:	4c 8b 7d 00          	mov    r15,QWORD PTR [rbp+0x0]
 174f299:	48 89 df             	mov    rdi,rbx
 174f29c:	e8 39 f9 ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
 174f2a1:	49 89 d4             	mov    r12,rdx
 174f2a4:	41 8a 47 01          	mov    al,BYTE PTR [r15+0x1]
 174f2a8:	a8 08                	test   al,0x8
 174f2aa:	74 73                	je     174f31f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10348b>
 174f2ac:	49 8b 4f 20          	mov    rcx,QWORD PTR [r15+0x20]
 174f2b0:	48 8b 49 28          	mov    rcx,QWORD PTR [rcx+0x28]
 174f2b4:	80 79 50 00          	cmp    BYTE PTR [rcx+0x50],0x0
 174f2b8:	74 65                	je     174f31f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10348b>
 174f2ba:	a8 20                	test   al,0x20
 174f2bc:	75 61                	jne    174f31f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10348b>
 174f2be:	41 8a 4f 02          	mov    cl,BYTE PTR [r15+0x2]
 174f2c2:	80 c1 f4             	add    cl,0xf4
 174f2c5:	80 f9 fe             	cmp    cl,0xfe
 174f2c8:	72 55                	jb     174f31f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10348b>
 174f2ca:	48 89 df             	mov    rdi,rbx
 174f2cd:	e8 08 f9 ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
 174f2d2:	45 8b 77 04          	mov    r14d,DWORD PTR [r15+0x4]
 174f2d6:	48 89 d7             	mov    rdi,rdx
```
## AP entry `0x50` -> `0x10c01f4`

```text
 10c01b5:	e8 ee 56 6a 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
 10c01ba:	48 83 c3 18          	add    rbx,0x18
 10c01be:	48 89 df             	mov    rdi,rbx
 10c01c1:	5b                   	pop    rbx
 10c01c2:	e9 b5 f9 9f ff       	jmp    abfb7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb1c>
 10c01c7:	cc                   	int3
 10c01c8:	53                   	push   rbx
 10c01c9:	48 89 fb             	mov    rbx,rdi
 10c01cc:	e8 c1 ff ff ff       	call   10c0192 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2875a8>
 10c01d1:	48 89 df             	mov    rdi,rbx
 10c01d4:	5b                   	pop    rbx
 10c01d5:	e9 46 dd 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10c01da:	0f 18 0d b7 90 83 00 	prefetcht0 BYTE PTR [rip+0x8390b7]        # 18f9298 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x406a8>
 10c01e1:	48 8d 05 b0 90 83 00 	lea    rax,[rip+0x8390b0]        # 18f9298 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x406a8>
 10c01e8:	48 8b 0d b1 90 83 00 	mov    rcx,QWORD PTR [rip+0x8390b1]        # 18f92a0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x406b0>
 10c01ef:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10c01f2:	c3                   	ret
 10c01f3:	cc                   	int3
 10c01f4:	0f 18 0d 65 8f 83 00 	prefetcht0 BYTE PTR [rip+0x838f65]        # 18f9160 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40570>
 10c01fb:	48 8d 05 5e 8f 83 00 	lea    rax,[rip+0x838f5e]        # 18f9160 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40570>
 10c0202:	48 8b 0d 5f 8f 83 00 	mov    rcx,QWORD PTR [rip+0x838f5f]        # 18f9168 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40578>
 10c0209:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10c020c:	c3                   	ret
 10c020d:	cc                   	int3
 10c020e:	48 89 f0             	mov    rax,rsi
 10c0211:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10c0215:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 10c021a:	48 8d 0d d7 f5 37 ff 	lea    rcx,[rip+0xffffffffff37f5d7]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10c0221:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
 10c0225:	48 89 4e 20          	mov    QWORD PTR [rsi+0x20],rcx
 10c0229:	48 8d 0d 98 d6 78 00 	lea    rcx,[rip+0x78d698]        # 184d8c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9fb0>
 10c0230:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10c0233:	c3                   	ret
 10c0234:	41 57                	push   r15
 10c0236:	41 56                	push   r14
 10c0238:	53                   	push   rbx
 10c0239:	49 89 f7             	mov    r15,rsi
 10c023c:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10c023f:	4c 8d 73 40          	lea    r14,[rbx+0x40]
 10c0243:	4c 89 f7             	mov    rdi,r14
 10c0246:	48 89 d6             	mov    rsi,rdx
 10c0249:	e8 32 de 72 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 10c024e:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
 10c0252:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
 10c0256:	80 bb 90 00 00 00 00 	cmp    BYTE PTR [rbx+0x90],0x0
 10c025d:	74 45                	je     10c02a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876ba>
 10c025f:	4c 8d 7b 78          	lea    r15,[rbx+0x78]
 10c0263:	4c 89 ff             	mov    rdi,r15
 10c0266:	4c 89 f6             	mov    rsi,r14
 10c0269:	e8 80 f4 9d ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 10c026e:	84 c0                	test   al,al
 10c0270:	74 32                	je     10c02a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2876ba>
 10c0272:	c6 43 70 01          	mov    BYTE PTR [rbx+0x70],0x1
 10c0276:	4c 89 ff             	mov    rdi,r15
 10c0279:	e8 ae f0 a0 ff       	call   acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
 10c027e:	4c 8d b3 b8 00 00 00 	lea    r14,[rbx+0xb8]
 10c0285:	48 81 c3 98 00 00 00 	add    rbx,0x98
 10c028c:	48 89 df             	mov    rdi,rbx
 10c028f:	4c 89 f6             	mov    rsi,r14
 10c0292:	e8 c3 51 a1 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
 10c0297:	4c 89 f7             	mov    rdi,r14
 10c029a:	5b                   	pop    rbx
 10c029b:	41 5e                	pop    r14
 10c029d:	41 5f                	pop    r15
 10c029f:	e9 88 f0 a0 ff       	jmp    acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
 10c02a4:	c6 43 70 00          	mov    BYTE PTR [rbx+0x70],0x0
 10c02a8:	5b                   	pop    rbx
 10c02a9:	41 5e                	pop    r14
 10c02ab:	41 5f                	pop    r15
 10c02ad:	c3                   	ret
 10c02ae:	41 57                	push   r15
 10c02b0:	41 56                	push   r14
 10c02b2:	41 54                	push   r12
 10c02b4:	53                   	push   rbx
 10c02b5:	48 81 ec 98 00 00 00 	sub    rsp,0x98
 10c02bc:	48 89 cb             	mov    rbx,rcx
 10c02bf:	49 89 f6             	mov    r14,rsi
 10c02c2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10c02c9:	00 00
 10c02cb:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 10c02d2:	00
 10c02d3:	4c 8b 27             	mov    r12,QWORD PTR [rdi]
 10c02d6:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 10c02db:	48 89 d6             	mov    rsi,rdx
 10c02de:	e8 5d dc 72 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10c02e3:	49 2b 5c 24 68       	sub    rbx,QWORD PTR [r12+0x68]
 10c02e8:	48 8d 7c 24 6f       	lea    rdi,[rsp+0x6f]
 10c02ed:	4c 89 f6             	mov    rsi,r14
 10c02f0:	e8 2b 40 ad ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
 10c02f5:	41 80 7c 24 18 00    	cmp    BYTE PTR [r12+0x18],0x0
```
## AP entry `0x58` -> `0x174ef82`

```text
 174ef48:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 174ef4d:	75 2d                	jne    174ef7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1030e8>
 174ef4f:	48 83 c4 20          	add    rsp,0x20
 174ef53:	5b                   	pop    rbx
 174ef54:	41 5e                	pop    r14
 174ef56:	41 5f                	pop    r15
 174ef58:	c3                   	ret
 174ef59:	48 89 c3             	mov    rbx,rax
 174ef5c:	48 89 e7             	mov    rdi,rsp
 174ef5f:	e8 2c ef 09 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 174ef64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 174ef6b:	00 00
 174ef6d:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 174ef72:	75 08                	jne    174ef7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1030e8>
 174ef74:	48 89 df             	mov    rdi,rbx
 174ef77:	e8 54 0d 32 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 174ef7c:	e8 2f 0b 0a 00       	call   17efab0 <__stack_chk_fail@plt>
 174ef81:	cc                   	int3
 174ef82:	55                   	push   rbp
 174ef83:	41 57                	push   r15
 174ef85:	41 56                	push   r14
 174ef87:	41 55                	push   r13
 174ef89:	41 54                	push   r12
 174ef8b:	53                   	push   rbx
 174ef8c:	48 83 ec 48          	sub    rsp,0x48
 174ef90:	48 89 d3             	mov    rbx,rdx
 174ef93:	49 89 f6             	mov    r14,rsi
 174ef96:	49 89 ff             	mov    r15,rdi
 174ef99:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 174efa0:	00 00
 174efa2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 174efa7:	e8 2e fc ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
 174efac:	49 89 c4             	mov    r12,rax
 174efaf:	4c 89 ff             	mov    rdi,r15
 174efb2:	e8 23 fc ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
 174efb7:	0f 57 c0             	xorps  xmm0,xmm0
 174efba:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
 174efc0:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 174efc5:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
 174efca:	80 78 53 00          	cmp    BYTE PTR [rax+0x53],0x0
 174efce:	74 3c                	je     174f00c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103178>
 174efd0:	41 83 7c 24 08 00    	cmp    DWORD PTR [r12+0x8],0x0
 174efd6:	7e 47                	jle    174f01f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10318b>
 174efd8:	45 31 ed             	xor    r13d,r13d
 174efdb:	31 ed                	xor    ebp,ebp
 174efdd:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
 174efe2:	4c 01 e8             	add    rax,r13
 174efe5:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 174efea:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 174efef:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 174eff4:	e8 b1 07 35 ff       	call   a9f7aa <JNI_OnUnload@@Base+0x27077>
 174eff9:	48 ff c5             	inc    rbp
 174effc:	49 63 44 24 08       	movsxd rax,DWORD PTR [r12+0x8]
 174f001:	49 83 c5 58          	add    r13,0x58
 174f005:	48 39 c5             	cmp    rbp,rax
 174f008:	7c d3                	jl     174efdd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103149>
 174f00a:	eb 13                	jmp    174f01f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10318b>
 174f00c:	48 8d 44 24 20       	lea    rax,[rsp+0x20]
 174f011:	48 89 d7             	mov    rdi,rdx
 174f014:	4c 89 fe             	mov    rsi,r15
 174f017:	48 89 c2             	mov    rdx,rax
 174f01a:	e8 f7 ef fe ff       	call   173e016 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2182>
 174f01f:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
 174f024:	48 8b 6c 24 28       	mov    rbp,QWORD PTR [rsp+0x28]
 174f029:	49 39 ed             	cmp    r13,rbp
 174f02c:	74 1b                	je     174f049 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1031b5>
 174f02e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 174f032:	4c 89 fe             	mov    rsi,r15
 174f035:	4c 89 f2             	mov    rdx,r14
 174f038:	48 89 d9             	mov    rcx,rbx
 174f03b:	e8 80 11 01 00       	call   17601c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11432c>
 174f040:	49 89 c6             	mov    r14,rax
 174f043:	49 83 c5 08          	add    r13,0x8
 174f047:	eb e0                	jmp    174f029 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103195>
 174f049:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
 174f04e:	80 78 50 00          	cmp    BYTE PTR [rax+0x50],0x0
 174f052:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 174f056:	0f 84 f1 00 00 00    	je     174f14d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1032b9>
 174f05c:	40 f6 c7 01          	test   dil,0x1
 174f060:	0f 85 2e 01 00 00    	jne    174f194 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103300>
 174f066:	48 8d 3d 03 05 cf fe 	lea    rdi,[rip+0xfffffffffecf0503]        # 43f570 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x517c>
 174f06d:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 174f071:	89 c6                	mov    esi,eax
 174f073:	83 e6 03             	and    esi,0x3
 174f076:	a8 04                	test   al,0x4
 174f078:	0f 94 c2             	sete   dl
 174f07b:	8b 4f 10             	mov    ecx,DWORD PTR [rdi+0x10]
 174f07e:	0f 45 f1             	cmovne esi,ecx
 174f081:	85 f6                	test   esi,esi
 174f083:	0f 8e df 00 00 00    	jle    174f168 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1032d4>
```
## Constructor references and follow-on calls

| addr | instruction |
|---:|---|
| `0x10aba8e` | `10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0x10ac180` | `10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |
| `0x10ac1a1` | `10ac1a1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ac1e6` | `10ac1e6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ac266` | `10ac266:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0` |
| `0x10ac37a` | `10ac37a:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac386` | `10ac386:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac3f5` | `10ac3f5:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ac4ec` | `10ac4ec:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ac513` | `10ac513:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0` |
| `0x10ac517` | `10ac517:	48 8d 78 20          	lea    rdi,[rax+0x20]` |
| `0x10ac674` | `10ac674:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]` |
| `0x10ac936` | `10ac936:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]` |
| `0x10acd3b` | `10acd3b:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acd6a` | `10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx` |
| `0x10acd76` | `10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx` |
| `0x10acdb5` | `10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acdc6` | `10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad136` | `10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ad38a` | `10ad38a:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10ad3ff` | `10ad3ff:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad474` | `10ad474:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad5b8` | `10ad5b8:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad62a` | `10ad62a:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad6a4` | `10ad6a4:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp` |
| `0x10ad6ad` | `10ad6ad:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx` |
| `0x10adb57` | `10adb57:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10adbde` | `10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]` |
| `0x10adc1d` | `10adc1d:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]` |

## Text mentions of AP/method targets

| addr | instruction |
|---:|---|
| `0xabfe12` | `abfe12:	53                   	push   rbx` |
| `0xabfe54` | `abfe54:	53                   	push   rbx` |
| `0xabfe58` | `abfe58:	e8 b5 ff ff ff       	call   abfe12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcdb2>` |
| `0xae904c` | `ae904c:	e8 8b 61 c6 00       	call   174f1dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103348>` |
| `0xae9079` | `ae9079:	e8 5e 61 c6 00       	call   174f1dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103348>` |
| `0xb226ce` | `b226ce:	e8 09 cb c2 00       	call   174f1dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103348>` |
| `0xb23df6` | `b23df6:	e8 e1 b3 c2 00       	call   174f1dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103348>` |
| `0xe1e8f2` | `e1e8f2:	e8 e5 08 93 00       	call   174f1dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103348>` |
| `0xe76cb2` | `e76cb2:	e8 25 85 8d 00       	call   174f1dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103348>` |
| `0xe7703c` | `e7703c:	e8 9b 81 8d 00       	call   174f1dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103348>` |
| `0x10ac180` | `10ac180:	48 8d 05 11 17 7a 00 	lea    rax,[rip+0x7a1711]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |
| `0x10bff2c` | `10bff2c:	48 8d 05 65 d9 78 00 	lea    rax,[rip+0x78d965]        # 184d898 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9f80>` |
| `0x10bff40` | `10bff40:	53                   	push   rbx` |
| `0x10bff44` | `10bff44:	e8 e3 ff ff ff       	call   10bff2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287342>` |
| `0x10bff52` | `10bff52:	41 56                	push   r14` |
| `0x10bffde` | `10bffde:	55                   	push   rbp` |
| `0x174ec6a` | `174ec6a:	e9 3f 31 00 00       	jmp    1751dae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105f1a>` |
| `0x174f1dc` | `174f1dc:	55                   	push   rbp` |

