# Restrictions installed object method semantics v8

Focus: semantic classification of AP `0x184d898` methods `10bff52` and `10bffde`, including their helper callees and payload offsets.

## AP `0x184d898` relocation entries

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
## reset/destructor body `0x10bff2c`

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
```
## deleting destructor `0x10bff40`

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
```
## string/forward helper candidate `0x10bff52`

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
```
## boolean/condition helper candidate `0x10bffde`

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
 10c00e3:	cc                   	int3
 10c00e4:	53                   	push   rbx
 10c00e5:	48 89 fb             	mov    rbx,rdi
 10c00e8:	e8 cf ff ff ff       	call   10c00bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2874d2>
 10c00ed:	48 89 df             	mov    rdi,rbx
 10c00f0:	5b                   	pop    rbx
 10c00f1:	e9 2a de 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10c00f6:	0f 18 0d 1b 93 83 00 	prefetcht0 BYTE PTR [rip+0x83931b]        # 18f9418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40828>
 10c00fd:	48 8d 05 14 93 83 00 	lea    rax,[rip+0x839314]        # 18f9418 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40828>
 10c0104:	48 8b 0d 15 93 83 00 	mov    rcx,QWORD PTR [rip+0x839315]        # 18f9420 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40830>
 10c010b:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
 10c010e:	c3                   	ret
 10c010f:	cc                   	int3
 10c0110:	48 89 f0             	mov    rax,rsi
 10c0113:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 10c0117:	48 8d 0d 2a d8 78 00 	lea    rcx,[rip+0x78d82a]        # 184d948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa030>
 10c011e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 10c0121:	0f 57 c0             	xorps  xmm0,xmm0
 10c0124:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 10c0128:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
 10c012d:	c3                   	ret
 10c012e:	53                   	push   rbx
 10c012f:	48 89 f3             	mov    rbx,rsi
```
## Helper window `0xa7b836`

```text
  a7b810:	48 89 d8             	mov    rax,rbx
  a7b813:	48 83 c4 08          	add    rsp,0x8
  a7b817:	5b                   	pop    rbx
  a7b818:	41 5c                	pop    r12
  a7b81a:	41 5e                	pop    r14
  a7b81c:	41 5f                	pop    r15
  a7b81e:	c3                   	ret
  a7b81f:	cc                   	int3
  a7b820:	89 f8                	mov    eax,edi
  a7b822:	d0 e8                	shr    al,1
  a7b824:	40 f6 c7 01          	test   dil,0x1
  a7b828:	0f b6 c0             	movzx  eax,al
  a7b82b:	48 0f 45 c6          	cmovne rax,rsi
  a7b82f:	48 85 c0             	test   rax,rax
  a7b832:	0f 94 c0             	sete   al
  a7b835:	c3                   	ret
  a7b836:	0f b6 0f             	movzx  ecx,BYTE PTR [rdi]
  a7b839:	48 8d 47 01          	lea    rax,[rdi+0x1]
  a7b83d:	89 ca                	mov    edx,ecx
  a7b83f:	d1 ea                	shr    edx,1
  a7b841:	f6 c1 01             	test   cl,0x1
  a7b844:	48 0f 45 47 10       	cmovne rax,QWORD PTR [rdi+0x10]
  a7b849:	48 0f 45 57 08       	cmovne rdx,QWORD PTR [rdi+0x8]
  a7b84e:	c3                   	ret
  a7b84f:	41 57                	push   r15
  a7b851:	41 56                	push   r14
  a7b853:	53                   	push   rbx
  a7b854:	48 89 f3             	mov    rbx,rsi
  a7b857:	e8 da ff ff ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  a7b85c:	49 89 c6             	mov    r14,rax
  a7b85f:	49 89 d7             	mov    r15,rdx
  a7b862:	48 89 df             	mov    rdi,rbx
  a7b865:	e8 a6 26 d7 00       	call   17edf10 <strlen@plt>
  a7b86a:	4c 89 f7             	mov    rdi,r14
  a7b86d:	4c 89 fe             	mov    rsi,r15
  a7b870:	48 89 da             	mov    rdx,rbx
  a7b873:	48 89 c1             	mov    rcx,rax
  a7b876:	5b                   	pop    rbx
  a7b877:	41 5e                	pop    r14
  a7b879:	41 5f                	pop    r15
  a7b87b:	e9 00 00 00 00       	jmp    a7b880 <JNI_OnUnload@@Base+0x314d>
  a7b880:	48 39 ce             	cmp    rsi,rcx
  a7b883:	75 13                	jne    a7b898 <JNI_OnUnload@@Base+0x3165>
  a7b885:	50                   	push   rax
  a7b886:	48 89 f1             	mov    rcx,rsi
  a7b889:	e8 0e 00 00 00       	call   a7b89c <JNI_OnUnload@@Base+0x3169>
  a7b88e:	85 c0                	test   eax,eax
  a7b890:	0f 94 c0             	sete   al
  a7b893:	48 83 c4 08          	add    rsp,0x8
  a7b897:	c3                   	ret
  a7b898:	31 c0                	xor    eax,eax
  a7b89a:	c3                   	ret
  a7b89b:	cc                   	int3
  a7b89c:	41 56                	push   r14
  a7b89e:	53                   	push   rbx
  a7b89f:	50                   	push   rax
  a7b8a0:	48 89 cb             	mov    rbx,rcx
  a7b8a3:	49 89 f6             	mov    r14,rsi
  a7b8a6:	48 39 ce             	cmp    rsi,rcx
  a7b8a9:	48 89 c8             	mov    rax,rcx
  a7b8ac:	48 0f 42 c6          	cmovb  rax,rsi
  a7b8b0:	48 89 d6             	mov    rsi,rdx
  a7b8b3:	48 89 c2             	mov    rdx,rax
  a7b8b6:	e8 b5 26 d7 00       	call   17edf70 <memcmp@plt>
  a7b8bb:	85 c0                	test   eax,eax
  a7b8bd:	75 11                	jne    a7b8d0 <JNI_OnUnload@@Base+0x319d>
  a7b8bf:	31 c0                	xor    eax,eax
  a7b8c1:	49 39 de             	cmp    r14,rbx
  a7b8c4:	74 0a                	je     a7b8d0 <JNI_OnUnload@@Base+0x319d>
  a7b8c6:	31 c0                	xor    eax,eax
  a7b8c8:	49 39 de             	cmp    r14,rbx
  a7b8cb:	19 c0                	sbb    eax,eax
  a7b8cd:	83 c8 01             	or     eax,0x1
  a7b8d0:	48 83 c4 08          	add    rsp,0x8
  a7b8d4:	5b                   	pop    rbx
  a7b8d5:	41 5e                	pop    r14
  a7b8d7:	c3                   	ret
  a7b8d8:	41 57                	push   r15
  a7b8da:	41 56                	push   r14
  a7b8dc:	41 54                	push   r12
  a7b8de:	53                   	push   rbx
  a7b8df:	50                   	push   rax
  a7b8e0:	4c 89 cb             	mov    rbx,r9
  a7b8e3:	49 89 ce             	mov    r14,rcx
  a7b8e6:	49 89 ff             	mov    r15,rdi
  a7b8e9:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
```
## Helper window `0x17c4ef2`

```text
 17c4eb2:	48 89 c3             	mov    rbx,rax
 17c4eb5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 17c4eba:	e8 69 68 2b ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 17c4ebf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17c4ec6:	00 00
 17c4ec8:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
 17c4ecd:	75 08                	jne    17c4ed7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179043>
 17c4ecf:	48 89 df             	mov    rdi,rbx
 17c4ed2:	e8 f9 ad 2a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 17c4ed7:	e8 d4 ab 02 00       	call   17efab0 <__stack_chk_fail@plt>
 17c4edc:	f6 07 01             	test   BYTE PTR [rdi],0x1
 17c4edf:	74 09                	je     17c4eea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179056>
 17c4ee1:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 17c4ee5:	e9 69 fe ff ff       	jmp    17c4d53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178ebf>
 17c4eea:	48 ff c7             	inc    rdi
 17c4eed:	e9 61 fe ff ff       	jmp    17c4d53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178ebf>
 17c4ef2:	55                   	push   rbp
 17c4ef3:	41 56                	push   r14
 17c4ef5:	53                   	push   rbx
 17c4ef6:	48 89 d3             	mov    rbx,rdx
 17c4ef9:	49 89 f6             	mov    r14,rsi
 17c4efc:	f6 07 01             	test   BYTE PTR [rdi],0x1
 17c4eff:	74 06                	je     17c4f07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179073>
 17c4f01:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 17c4f05:	eb 03                	jmp    17c4f0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179076>
 17c4f07:	48 ff c7             	inc    rdi
 17c4f0a:	6a 03                	push   0x3
 17c4f0c:	5e                   	pop    rsi
 17c4f0d:	e8 7e 03 00 00       	call   17c5290 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1793fc>
 17c4f12:	83 f8 ff             	cmp    eax,0xffffffff
 17c4f15:	74 1f                	je     17c4f36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1790a2>
 17c4f17:	89 c5                	mov    ebp,eax
 17c4f19:	89 c7                	mov    edi,eax
 17c4f1b:	4c 89 f6             	mov    rsi,r14
 17c4f1e:	48 89 da             	mov    rdx,rbx
 17c4f21:	e8 80 04 00 00       	call   17c53a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179512>
 17c4f26:	89 c3                	mov    ebx,eax
 17c4f28:	89 ef                	mov    edi,ebp
 17c4f2a:	e8 0c 05 00 00       	call   17c543b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1795a7>
 17c4f2f:	85 db                	test   ebx,ebx
 17c4f31:	0f 94 c0             	sete   al
 17c4f34:	eb 02                	jmp    17c4f38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1790a4>
 17c4f36:	31 c0                	xor    eax,eax
 17c4f38:	5b                   	pop    rbx
 17c4f39:	41 5e                	pop    r14
 17c4f3b:	5d                   	pop    rbp
 17c4f3c:	c3                   	ret
 17c4f3d:	41 57                	push   r15
 17c4f3f:	41 56                	push   r14
 17c4f41:	41 54                	push   r12
 17c4f43:	53                   	push   rbx
 17c4f44:	48 83 ec 28          	sub    rsp,0x28
 17c4f48:	49 89 d6             	mov    r14,rdx
 17c4f4b:	49 89 f7             	mov    r15,rsi
 17c4f4e:	48 89 fb             	mov    rbx,rdi
 17c4f51:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17c4f58:	00 00
 17c4f5a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 17c4f5f:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
 17c4f64:	4c 89 e7             	mov    rdi,r12
 17c4f67:	48 89 de             	mov    rsi,rbx
 17c4f6a:	e8 0f 4b 2b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 17c4f6f:	48 8d 35 41 bc b6 fe 	lea    rsi,[rip+0xfffffffffeb6bc41]        # 330bb7 <_ZTSSt12bad_any_cast@@Base-0x5f611>
 17c4f76:	4c 89 e7             	mov    rdi,r12
 17c4f79:	e8 42 90 02 00       	call   17edfc0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKc@plt>
 17c4f7e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 17c4f83:	4c 89 fe             	mov    rsi,r15
 17c4f86:	4c 89 f2             	mov    rdx,r14
 17c4f89:	e8 64 ff ff ff       	call   17c4ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17905e>
 17c4f8e:	84 c0                	test   al,al
 17c4f90:	74 0e                	je     17c4fa0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17910c>
 17c4f92:	f6 44 24 08 01       	test   BYTE PTR [rsp+0x8],0x1
 17c4f97:	74 0b                	je     17c4fa4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179110>
 17c4f99:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 17c4f9e:	eb 09                	jmp    17c4fa9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179115>
 17c4fa0:	31 db                	xor    ebx,ebx
 17c4fa2:	eb 12                	jmp    17c4fb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179122>
 17c4fa4:	48 8d 7c 24 09       	lea    rdi,[rsp+0x9]
 17c4fa9:	48 89 de             	mov    rsi,rbx
 17c4fac:	e8 5f 06 00 00       	call   17c5610 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17977c>
 17c4fb1:	85 c0                	test   eax,eax
 17c4fb3:	0f 94 c3             	sete   bl
 17c4fb6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 17c4fbb:	e8 d0 8e 02 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 17c4fc0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17c4fc7:	00 00
```
## Helper window `0x17c4edc`

```text
 17c4e9d:	e8 86 68 2b ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 17c4ea2:	89 ef                	mov    edi,ebp
 17c4ea4:	e8 92 05 00 00       	call   17c543b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1795a7>
 17c4ea9:	b0 01                	mov    al,0x1
 17c4eab:	e9 3e ff ff ff       	jmp    17c4dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178f5a>
 17c4eb0:	eb 00                	jmp    17c4eb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17901e>
 17c4eb2:	48 89 c3             	mov    rbx,rax
 17c4eb5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 17c4eba:	e8 69 68 2b ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 17c4ebf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17c4ec6:	00 00
 17c4ec8:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
 17c4ecd:	75 08                	jne    17c4ed7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179043>
 17c4ecf:	48 89 df             	mov    rdi,rbx
 17c4ed2:	e8 f9 ad 2a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 17c4ed7:	e8 d4 ab 02 00       	call   17efab0 <__stack_chk_fail@plt>
 17c4edc:	f6 07 01             	test   BYTE PTR [rdi],0x1
 17c4edf:	74 09                	je     17c4eea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179056>
 17c4ee1:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 17c4ee5:	e9 69 fe ff ff       	jmp    17c4d53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178ebf>
 17c4eea:	48 ff c7             	inc    rdi
 17c4eed:	e9 61 fe ff ff       	jmp    17c4d53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178ebf>
 17c4ef2:	55                   	push   rbp
 17c4ef3:	41 56                	push   r14
 17c4ef5:	53                   	push   rbx
 17c4ef6:	48 89 d3             	mov    rbx,rdx
 17c4ef9:	49 89 f6             	mov    r14,rsi
 17c4efc:	f6 07 01             	test   BYTE PTR [rdi],0x1
 17c4eff:	74 06                	je     17c4f07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179073>
 17c4f01:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 17c4f05:	eb 03                	jmp    17c4f0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179076>
 17c4f07:	48 ff c7             	inc    rdi
 17c4f0a:	6a 03                	push   0x3
 17c4f0c:	5e                   	pop    rsi
 17c4f0d:	e8 7e 03 00 00       	call   17c5290 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1793fc>
 17c4f12:	83 f8 ff             	cmp    eax,0xffffffff
 17c4f15:	74 1f                	je     17c4f36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1790a2>
 17c4f17:	89 c5                	mov    ebp,eax
 17c4f19:	89 c7                	mov    edi,eax
 17c4f1b:	4c 89 f6             	mov    rsi,r14
 17c4f1e:	48 89 da             	mov    rdx,rbx
 17c4f21:	e8 80 04 00 00       	call   17c53a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179512>
 17c4f26:	89 c3                	mov    ebx,eax
 17c4f28:	89 ef                	mov    edi,ebp
 17c4f2a:	e8 0c 05 00 00       	call   17c543b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1795a7>
 17c4f2f:	85 db                	test   ebx,ebx
 17c4f31:	0f 94 c0             	sete   al
 17c4f34:	eb 02                	jmp    17c4f38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1790a4>
 17c4f36:	31 c0                	xor    eax,eax
 17c4f38:	5b                   	pop    rbx
 17c4f39:	41 5e                	pop    r14
 17c4f3b:	5d                   	pop    rbp
 17c4f3c:	c3                   	ret
 17c4f3d:	41 57                	push   r15
 17c4f3f:	41 56                	push   r14
 17c4f41:	41 54                	push   r12
 17c4f43:	53                   	push   rbx
 17c4f44:	48 83 ec 28          	sub    rsp,0x28
 17c4f48:	49 89 d6             	mov    r14,rdx
 17c4f4b:	49 89 f7             	mov    r15,rsi
 17c4f4e:	48 89 fb             	mov    rbx,rdi
 17c4f51:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17c4f58:	00 00
 17c4f5a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 17c4f5f:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
 17c4f64:	4c 89 e7             	mov    rdi,r12
 17c4f67:	48 89 de             	mov    rsi,rbx
 17c4f6a:	e8 0f 4b 2b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 17c4f6f:	48 8d 35 41 bc b6 fe 	lea    rsi,[rip+0xfffffffffeb6bc41]        # 330bb7 <_ZTSSt12bad_any_cast@@Base-0x5f611>
 17c4f76:	4c 89 e7             	mov    rdi,r12
 17c4f79:	e8 42 90 02 00       	call   17edfc0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKc@plt>
 17c4f7e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 17c4f83:	4c 89 fe             	mov    rsi,r15
 17c4f86:	4c 89 f2             	mov    rdx,r14
 17c4f89:	e8 64 ff ff ff       	call   17c4ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17905e>
 17c4f8e:	84 c0                	test   al,al
 17c4f90:	74 0e                	je     17c4fa0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17910c>
 17c4f92:	f6 44 24 08 01       	test   BYTE PTR [rsp+0x8],0x1
 17c4f97:	74 0b                	je     17c4fa4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179110>
 17c4f99:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 17c4f9e:	eb 09                	jmp    17c4fa9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179115>
 17c4fa0:	31 db                	xor    ebx,ebx
 17c4fa2:	eb 12                	jmp    17c4fb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179122>
 17c4fa4:	48 8d 7c 24 09       	lea    rdi,[rsp+0x9]
 17c4fa9:	48 89 de             	mov    rsi,rbx
 17c4fac:	e8 5f 06 00 00       	call   17c5610 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17977c>
```
## Helper window `0xde1c52`

```text
  de1c22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  de1c29:	00 00
  de1c2b:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
  de1c30:	75 08                	jne    de1c3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecc0>
  de1c32:	4c 89 f7             	mov    rdi,r14
  de1c35:	e8 96 e0 c8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  de1c3a:	e8 71 de a0 00       	call   17efab0 <__stack_chk_fail@plt>
  de1c3f:	cc                   	int3
  de1c40:	53                   	push   rbx
  de1c41:	48 89 fb             	mov    rbx,rdi
  de1c44:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
  de1c47:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  de1c4a:	ff 50 28             	call   QWORD PTR [rax+0x28]
  de1c4d:	48 89 d8             	mov    rax,rbx
  de1c50:	5b                   	pop    rbx
  de1c51:	c3                   	ret
  de1c52:	53                   	push   rbx
  de1c53:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  de1c57:	48 85 c0             	test   rax,rax
  de1c5a:	74 11                	je     de1c6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecf3>
  de1c5c:	48 89 fb             	mov    rbx,rdi
  de1c5f:	31 ff                	xor    edi,edi
  de1c61:	48 89 de             	mov    rsi,rbx
  de1c64:	31 d2                	xor    edx,edx
  de1c66:	ff d0                	call   rax
  de1c68:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  de1c6d:	5b                   	pop    rbx
  de1c6e:	c3                   	ret
  de1c6f:	48 89 c7             	mov    rdi,rax
  de1c72:	e8 2e 7e c9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  de1c77:	cc                   	int3
  de1c78:	53                   	push   rbx
  de1c79:	48 89 fb             	mov    rbx,rdi
  de1c7c:	48 8d 05 25 95 a4 00 	lea    rax,[rip+0xa49525]        # 182b1a8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x77d8>
  de1c83:	48 89 07             	mov    QWORD PTR [rdi],rax
  de1c86:	48 83 c7 30          	add    rdi,0x30
  de1c8a:	e8 db 82 c9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  de1c8f:	48 89 df             	mov    rdi,rbx
  de1c92:	5b                   	pop    rbx
  de1c93:	e9 4c 1f 80 00       	jmp    15e3be4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429168>
  de1c98:	53                   	push   rbx
  de1c99:	48 89 fb             	mov    rbx,rdi
  de1c9c:	e8 d7 ff ff ff       	call   de1c78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecfe>
  de1ca1:	48 89 df             	mov    rdi,rbx
  de1ca4:	5b                   	pop    rbx
  de1ca5:	e9 76 c2 a0 00       	jmp    17edf20 <_ZdlPv@plt>
  de1caa:	55                   	push   rbp
  de1cab:	41 57                	push   r15
  de1cad:	41 56                	push   r14
  de1caf:	41 55                	push   r13
  de1cb1:	41 54                	push   r12
  de1cb3:	53                   	push   rbx
  de1cb4:	48 81 ec 98 00 00 00 	sub    rsp,0x98
  de1cbb:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
  de1cbf:	49 89 d4             	mov    r12,rdx
  de1cc2:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
  de1cc7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  de1cce:	00 00
  de1cd0:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  de1cd7:	00
  de1cd8:	4c 8b 7e 20          	mov    r15,QWORD PTR [rsi+0x20]
  de1cdc:	0f 57 c0             	xorps  xmm0,xmm0
  de1cdf:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  de1ce4:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
  de1ce8:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  de1ceb:	c7 47 20 00 00 80 3f 	mov    DWORD PTR [rdi+0x20],0x3f800000
  de1cf2:	48 63 72 18          	movsxd rsi,DWORD PTR [rdx+0x18]
  de1cf6:	e8 f7 de e6 ff       	call   c4fbf2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb92>
  de1cfb:	49 8d 44 24 10       	lea    rax,[r12+0x10]
  de1d00:	49 8b 4c 24 10       	mov    rcx,QWORD PTR [r12+0x10]
  de1d05:	48 89 cd             	mov    rbp,rcx
  de1d08:	48 83 c5 07          	add    rbp,0x7
  de1d0c:	f6 c1 01             	test   cl,0x1
  de1d0f:	48 0f 44 e8          	cmove  rbp,rax
  de1d13:	4d 63 74 24 18       	movsxd r14,DWORD PTR [r12+0x18]
  de1d18:	4d 85 f6             	test   r14,r14
  de1d1b:	74 48                	je     de1d65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaedeb>
  de1d1d:	49 c1 e6 03          	shl    r14,0x3
  de1d21:	31 db                	xor    ebx,ebx
  de1d23:	4c 8d 64 24 38       	lea    r12,[rsp+0x38]
  de1d28:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
  de1d2d:	48 8b 7c 1d 00       	mov    rdi,QWORD PTR [rbp+rbx*1+0x0]
  de1d32:	e8 ff 9a c9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  de1d37:	4c 89 e7             	mov    rdi,r12
  de1d3a:	48 89 c6             	mov    rsi,rax
  de1d3d:	e8 e6 36 8e 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
```
## Helper window `0x107162a`

```text
 10715fc:	e9 25 d3 a3 ff       	jmp    aae926 <JNI_OnUnload@@Base+0x361f3>
 1071601:	cc                   	int3
 1071602:	48 8b bf a0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xa0]
 1071609:	e9 5a 85 76 00       	jmp    17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
 107160e:	80 7f 10 00          	cmp    BYTE PTR [rdi+0x10],0x0
 1071612:	74 06                	je     107161a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a30>
 1071614:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1071617:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
 107161a:	c3                   	ret
 107161b:	cc                   	int3
 107161c:	80 7f 11 00          	cmp    BYTE PTR [rdi+0x11],0x0
 1071620:	74 06                	je     1071628 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a3e>
 1071622:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1071625:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
 1071628:	c3                   	ret
 1071629:	cc                   	int3
 107162a:	41 56                	push   r14
 107162c:	53                   	push   rbx
 107162d:	50                   	push   rax
 107162e:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1071632:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 1071637:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 107163b:	48 85 c0             	test   rax,rax
 107163e:	74 22                	je     1071662 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a78>
 1071640:	48 89 fb             	mov    rbx,rdi
 1071643:	49 89 f6             	mov    r14,rsi
 1071646:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 107164a:	6a 01                	push   0x1
 107164c:	5f                   	pop    rdi
 107164d:	48 89 de             	mov    rsi,rbx
 1071650:	4c 89 f2             	mov    rdx,r14
 1071653:	ff d0                	call   rax
 1071655:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 1071659:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 107165d:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 1071662:	48 83 c4 08          	add    rsp,0x8
 1071666:	5b                   	pop    rbx
 1071667:	41 5e                	pop    r14
 1071669:	c3                   	ret
 107166a:	48 89 c7             	mov    rdi,rax
 107166d:	e8 33 84 a0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1071672:	53                   	push   rbx
 1071673:	48 89 fb             	mov    rbx,rdi
 1071676:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 107167a:	e8 c3 fa ff ff       	call   1071142 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238558>
 107167f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1071682:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 1071686:	48 85 ff             	test   rdi,rdi
 1071689:	74 06                	je     1071691 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238aa7>
 107168b:	5b                   	pop    rbx
 107168c:	e9 8f c8 77 00       	jmp    17edf20 <_ZdlPv@plt>
 1071691:	5b                   	pop    rbx
 1071692:	c3                   	ret
 1071693:	cc                   	int3
 1071694:	41 56                	push   r14
 1071696:	53                   	push   rbx
 1071697:	50                   	push   rax
 1071698:	48 89 fb             	mov    rbx,rdi
 107169b:	48 8d 05 ce 77 7d 00 	lea    rax,[rip+0x7d77ce]        # 1848e70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5558>
 10716a2:	48 89 07             	mov    QWORD PTR [rdi],rax
 10716a5:	48 8d 05 54 78 7d 00 	lea    rax,[rip+0x7d7854]        # 1848f00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x55e8>
 10716ac:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 10716b0:	4c 8d b7 d8 00 00 00 	lea    r14,[rdi+0xd8]
 10716b7:	4c 89 f7             	mov    rdi,r14
 10716ba:	e8 23 da af ff       	call   b6f0e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc082>
 10716bf:	4c 89 f7             	mov    rdi,r14
 10716c2:	e8 b5 da af ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 10716c7:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
 10716ce:	e8 9f ff ff ff       	call   1071672 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a88>
 10716d3:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10716da:	e8 f5 84 76 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10716df:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
 10716e6:	e8 19 08 c4 ff       	call   cb1f04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feea4>
 10716eb:	48 8b bb 88 00 00 00 	mov    rdi,QWORD PTR [rbx+0x88]
 10716f2:	e8 8f cd a2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10716f7:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 10716fb:	e8 de c8 b0 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
 1071700:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 1071704:	e8 49 05 d7 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 1071709:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
 107170d:	48 83 c4 08          	add    rsp,0x8
 1071711:	5b                   	pop    rbx
 1071712:	41 5e                	pop    r14
 1071714:	e9 6d cd a2 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 1071719:	48 89 c7             	mov    rdi,rax
 107171c:	e8 84 83 a0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
```
## Helper window `0x10adc16`

```text
 10adbd5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10adbd9:	e8 a8 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 10adbe3:	e8 40 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbe8:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
 10adbef:	00
 10adbf0:	e8 33 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbf5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10adbfc:	00 00
 10adbfe:	48 3b 84 24 50 01 00 	cmp    rax,QWORD PTR [rsp+0x150]
 10adc05:	00
 10adc06:	75 08                	jne    10adc10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275026>
 10adc08:	48 89 df             	mov    rdi,rbx
 10adc0b:	e8 c0 20 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10adc10:	e8 9b 1e 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10adc15:	cc                   	int3
 10adc16:	53                   	push   rbx
 10adc17:	48 89 fb             	mov    rbx,rdi
 10adc1a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10adc1d:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10adc21:	e8 94 f4 9f ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10adc26:	48 89 d8             	mov    rax,rbx
 10adc29:	5b                   	pop    rbx
 10adc2a:	c3                   	ret
 10adc2b:	cc                   	int3
 10adc2c:	50                   	push   rax
 10adc2d:	e8 4c 60 3d 00       	call   1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
 10adc32:	59                   	pop    rcx
 10adc33:	c3                   	ret
 10adc34:	48 89 c7             	mov    rdi,rax
 10adc37:	e8 69 be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc3c:	53                   	push   rbx
 10adc3d:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 10adc41:	48 85 c0             	test   rax,rax
 10adc44:	74 11                	je     10adc57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27506d>
 10adc46:	48 89 fb             	mov    rbx,rdi
 10adc49:	31 ff                	xor    edi,edi
 10adc4b:	48 89 de             	mov    rsi,rbx
 10adc4e:	31 d2                	xor    edx,edx
 10adc50:	ff d0                	call   rax
 10adc52:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 10adc57:	5b                   	pop    rbx
 10adc58:	c3                   	ret
 10adc59:	48 89 c7             	mov    rdi,rax
 10adc5c:	e8 44 be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc61:	cc                   	int3
 10adc62:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10adc65:	e9 dc 02 00 00       	jmp    10adf46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27535c>
 10adc6a:	50                   	push   rax
 10adc6b:	e8 0e 60 3d 00       	call   1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
 10adc70:	59                   	pop    rcx
 10adc71:	c3                   	ret
 10adc72:	48 89 c7             	mov    rdi,rax
 10adc75:	e8 2b be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc7a:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 10adc7d:	e9 ce 00 00 00       	jmp    10add50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275166>
 10adc82:	53                   	push   rbx
 10adc83:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10adc86:	48 89 37             	mov    QWORD PTR [rdi],rsi
 10adc89:	48 85 db             	test   rbx,rbx
 10adc8c:	74 12                	je     10adca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b6>
 10adc8e:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
 10adc92:	e8 19 46 00 00       	call   10b22b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2796c6>
 10adc97:	48 89 df             	mov    rdi,rbx
 10adc9a:	5b                   	pop    rbx
 10adc9b:	e9 80 02 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10adca0:	5b                   	pop    rbx
 10adca1:	c3                   	ret
 10adca2:	31 f6                	xor    esi,esi
 10adca4:	e9 d9 ff ff ff       	jmp    10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>
 10adca9:	cc                   	int3
 10adcaa:	53                   	push   rbx
 10adcab:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10adcae:	48 89 37             	mov    QWORD PTR [rdi],rsi
 10adcb1:	48 85 db             	test   rbx,rbx
 10adcb4:	74 11                	je     10adcc7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750dd>
 10adcb6:	48 89 df             	mov    rdi,rbx
 10adcb9:	e8 96 08 00 00       	call   10ae554 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27596a>
 10adcbe:	48 89 df             	mov    rdi,rbx
 10adcc1:	5b                   	pop    rbx
 10adcc2:	e9 59 02 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10adcc7:	5b                   	pop    rbx
 10adcc8:	c3                   	ret
 10adcc9:	cc                   	int3
 10adcca:	31 f6                	xor    esi,esi
 10adccc:	e9 d9 ff ff ff       	jmp    10adcaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750c0>
```
## Helper window `0xac39da`

```text
  ac39b3:	cc                   	int3
  ac39b4:	53                   	push   rbx
  ac39b5:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  ac39b9:	48 85 c0             	test   rax,rax
  ac39bc:	74 11                	je     ac39cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1096f>
  ac39be:	48 89 fb             	mov    rbx,rdi
  ac39c1:	31 ff                	xor    edi,edi
  ac39c3:	48 89 de             	mov    rsi,rbx
  ac39c6:	31 d2                	xor    edx,edx
  ac39c8:	ff d0                	call   rax
  ac39ca:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  ac39cf:	5b                   	pop    rbx
  ac39d0:	c3                   	ret
  ac39d1:	48 89 c7             	mov    rdi,rax
  ac39d4:	e8 cc 60 fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ac39d9:	cc                   	int3
  ac39da:	83 ff 01             	cmp    edi,0x1
  ac39dd:	74 1e                	je     ac39fd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1099d>
  ac39df:	85 ff                	test   edi,edi
  ac39e1:	75 20                	jne    ac3a03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x109a3>
  ac39e3:	53                   	push   rbx
  ac39e4:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
  ac39e7:	48 85 db             	test   rbx,rbx
  ac39ea:	74 08                	je     ac39f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10994>
  ac39ec:	48 89 df             	mov    rdi,rbx
  ac39ef:	e8 76 65 fb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ac39f4:	48 89 df             	mov    rdi,rbx
  ac39f7:	5b                   	pop    rbx
  ac39f8:	e9 23 a5 d2 00       	jmp    17edf20 <_ZdlPv@plt>
  ac39fd:	48 8b 02             	mov    rax,QWORD PTR [rdx]
  ac3a00:	48 89 06             	mov    QWORD PTR [rsi],rax
  ac3a03:	c3                   	ret
  ac3a04:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ac3a07:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
  ac3a0b:	e9 52 6a fb ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  ac3a10:	41 57                	push   r15
  ac3a12:	41 56                	push   r14
  ac3a14:	53                   	push   rbx
  ac3a15:	49 89 fe             	mov    r14,rdi
  ac3a18:	4c 8b 3e             	mov    r15,QWORD PTR [rsi]
  ac3a1b:	6a 38                	push   0x38
  ac3a1d:	5f                   	pop    rdi
  ac3a1e:	e8 dd a4 d2 00       	call   17edf00 <_Znwm@plt>
  ac3a23:	48 89 c3             	mov    rbx,rax
  ac3a26:	48 8d 35 be b8 88 ff 	lea    rsi,[rip+0xffffffffff88b8be]        # 34f2eb <_ZTSSt12bad_any_cast@@Base-0x40edd>
  ac3a2d:	48 89 c7             	mov    rdi,rax
  ac3a30:	e8 9b 01 b2 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>
  ac3a35:	48 8d 05 cc 91 d4 00 	lea    rax,[rip+0xd491cc]        # 180cc08 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x28c8>
  ac3a3c:	48 89 03             	mov    QWORD PTR [rbx],rax
  ac3a3f:	4c 89 7b 20          	mov    QWORD PTR [rbx+0x20],r15
  ac3a43:	48 89 df             	mov    rdi,rbx
  ac3a46:	48 83 c7 28          	add    rdi,0x28
  ac3a4a:	e8 e0 b6 07 00       	call   b3f12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c0cf>
  ac3a4f:	49 89 1e             	mov    QWORD PTR [r14],rbx
  ac3a52:	4c 89 f0             	mov    rax,r14
  ac3a55:	5b                   	pop    rbx
  ac3a56:	41 5e                	pop    r14
  ac3a58:	41 5f                	pop    r15
  ac3a5a:	c3                   	ret
  ac3a5b:	49 89 c6             	mov    r14,rax
  ac3a5e:	48 89 df             	mov    rdi,rbx
  ac3a61:	e8 7e 01 b2 00       	call   15e3be4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429168>
  ac3a66:	48 89 df             	mov    rdi,rbx
  ac3a69:	e8 b2 a4 d2 00       	call   17edf20 <_ZdlPv@plt>
  ac3a6e:	eb 0b                	jmp    ac3a7b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a1b>
  ac3a70:	48 89 c7             	mov    rdi,rax
  ac3a73:	e8 2d 60 fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ac3a78:	49 89 c6             	mov    r14,rax
  ac3a7b:	4c 89 f7             	mov    rdi,r14
  ac3a7e:	e8 22 60 fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ac3a83:	cc                   	int3
  ac3a84:	53                   	push   rbx
  ac3a85:	48 89 fb             	mov    rbx,rdi
  ac3a88:	48 8d 05 59 d7 da 00 	lea    rax,[rip+0xdad759]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
  ac3a8f:	48 89 07             	mov    QWORD PTR [rdi],rax
  ac3a92:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
  ac3a96:	e8 eb a9 fd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  ac3a9b:	48 83 c3 10          	add    rbx,0x10
  ac3a9f:	48 89 df             	mov    rdi,rbx
  ac3aa2:	5b                   	pop    rbx
  ac3aa3:	e9 00 00 00 00       	jmp    ac3aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a48>
  ac3aa8:	53                   	push   rbx
  ac3aa9:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  ac3aad:	48 85 c0             	test   rax,rax
  ac3ab0:	74 11                	je     ac3ac3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a63>
  ac3ab2:	48 89 fb             	mov    rbx,rdi
```
## Method-internal signals

| addr | instruction |
|---:|---|
| `0x10bff59` | `10bff59:	48 89 d3             	mov    rbx,rdx` |
| `0x10bff5f` | `10bff5f:	48 89 f8             	mov    rax,rdi` |
| `0x10bff70` | `10bff70:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0x10bff7c` | `10bff7c:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10bff82` | `10bff82:	e8 af b8 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0x10bff8d` | `10bff8d:	e8 60 4f 70 00       	call   17c4ef2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17905e>` |
| `0x10bff97` | `10bff97:	e8 f4 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bff9c` | `10bff9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0x10bffa5` | `10bffa5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0x10bffe4` | `10bffe4:	48 89 f0             	mov    rax,rsi` |
| `0x10bffe7` | `10bffe7:	48 89 fb             	mov    rbx,rdi` |
| `0x10c0006` | `10c0006:	48 83 c6 08          	add    rsi,0x8` |
| `0x10c000f` | `10c000f:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10c001e` | `10c001e:	e8 b9 4e 70 00       	call   17c4edc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179048>` |
| `0x10c0023` | `10c0023:	89 c5                	mov    ebp,eax` |
| `0x10c002a` | `10c002a:	e8 61 de 72 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10c002f` | `10c002f:	40 84 ed             	test   bpl,bpl` |
| `0x10c0034` | `10c0034:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]` |

## Text mentions / call sites for methods and helpers

| addr | instruction |
|---:|---|
| `0xa7adeb` | `a7adeb:	e8 46 0a 00 00       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa7af6b` | `a7af6b:	e8 c6 08 00 00       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa7afc2` | `a7afc2:	e8 6f 08 00 00       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa7afe5` | `a7afe5:	e8 4c 08 00 00       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa7b01b` | `a7b01b:	e8 16 08 00 00       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa7b836` | `a7b836:	0f b6 0f             	movzx  ecx,BYTE PTR [rdi]` |
| `0xa7b857` | `a7b857:	e8 da ff ff ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8fd86` | `a8fd86:	e8 ab ba fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8fd9e` | `a8fd9e:	e8 93 ba fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8fdb2` | `a8fdb2:	e8 7f ba fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8fdc2` | `a8fdc2:	e8 6f ba fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8fe62` | `a8fe62:	e8 cf b9 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8fe7a` | `a8fe7a:	e8 b7 b9 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8fe8e` | `a8fe8e:	e8 a3 b9 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8fe9e` | `a8fe9e:	e8 93 b9 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8ff8c` | `a8ff8c:	e8 a5 b8 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8ffa4` | `a8ffa4:	e8 8d b8 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8ffb8` | `a8ffb8:	e8 79 b8 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa8ffc8` | `a8ffc8:	e8 69 b8 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa900b6` | `a900b6:	e8 7b b7 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa900ce` | `a900ce:	e8 63 b7 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa900e2` | `a900e2:	e8 4f b7 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa900f2` | `a900f2:	e8 3f b7 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa901a6` | `a901a6:	e8 8b b6 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa901be` | `a901be:	e8 73 b6 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa901d2` | `a901d2:	e8 5f b6 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa901e2` | `a901e2:	e8 4f b6 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa90282` | `a90282:	e8 af b5 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9029a` | `a9029a:	e8 97 b5 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa902ae` | `a902ae:	e8 83 b5 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa902be` | `a902be:	e8 73 b5 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa903a0` | `a903a0:	e8 91 b4 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa903b8` | `a903b8:	e8 79 b4 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa903cc` | `a903cc:	e8 65 b4 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa903dc` | `a903dc:	e8 55 b4 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9047c` | `a9047c:	e8 b5 b3 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa90494` | `a90494:	e8 9d b3 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa904a8` | `a904a8:	e8 89 b3 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa904b8` | `a904b8:	e8 79 b3 fe ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9bdac` | `a9bdac:	e8 85 fa fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9bddc` | `a9bddc:	e8 55 fa fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9bf40` | `a9bf40:	e8 f1 f8 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9bf70` | `a9bf70:	e8 c1 f8 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9c0d9` | `a9c0d9:	e8 58 f7 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9c10d` | `a9c10d:	e8 24 f7 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9c2e3` | `a9c2e3:	e8 4e f5 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9c317` | `a9c317:	e8 1a f5 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9c5df` | `a9c5df:	e8 52 f2 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9c637` | `a9c637:	e8 fa f1 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9c679` | `a9c679:	e8 b8 f1 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9c974` | `a9c974:	e8 bd ee fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9d000` | `a9d000:	e8 31 e8 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9d101` | `a9d101:	e8 30 e7 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9d233` | `a9d233:	e8 fe e5 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9d54d` | `a9d54d:	e8 e4 e2 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9d674` | `a9d674:	e8 bd e1 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9d8ef` | `a9d8ef:	e8 42 df fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9d90a` | `a9d90a:	e8 27 df fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9db7a` | `a9db7a:	e8 b7 dc fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9db95` | `a9db95:	e8 9c dc fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9dd4d` | `a9dd4d:	e8 e4 da fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9e024` | `a9e024:	e8 0d d8 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9e609` | `a9e609:	e8 28 d2 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9e631` | `a9e631:	e8 00 d2 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9eb96` | `a9eb96:	e8 9b cc fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9fea6` | `a9fea6:	e8 8b b9 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xa9fec4` | `a9fec4:	e8 6d b9 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaa0013` | `aa0013:	e8 1e b8 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaa0031` | `aa0031:	e8 00 b8 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaa04b6` | `aa04b6:	e8 7b b3 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaa311c` | `aa311c:	e8 15 87 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaa7972` | `aa7972:	e8 bf 3e fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaa7f7d` | `aa7f7d:	e8 b4 38 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaa801b` | `aa801b:	e8 16 38 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaa80c0` | `aa80c0:	e8 71 37 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaa816e` | `aa816e:	e8 c3 36 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaa9cc8` | `aa9cc8:	e8 69 1b fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaaa196` | `aaa196:	e8 9b 16 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaaa253` | `aaa253:	e8 de 15 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaaa2e9` | `aaa2e9:	e8 48 15 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaaa377` | `aaa377:	e8 ba 14 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaaa3f9` | `aaa3f9:	e8 38 14 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaaa48c` | `aaa48c:	e8 a5 13 fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaaad14` | `aaad14:	e8 1d 0b fd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaaf5ce` | `aaf5ce:	e8 63 c2 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaaf68e` | `aaf68e:	e8 a3 c1 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaaf720` | `aaf720:	e8 11 c1 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaafeaa` | `aafeaa:	e8 87 b9 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xab02b0` | `ab02b0:	e8 81 b5 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xab5c81` | `ab5c81:	e8 b0 5b fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xab7195` | `ab7195:	e8 9c 46 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xab9d65` | `ab9d65:	e8 cc 1a fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xab9e4b` | `ab9e4b:	e8 e6 19 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xab9eed` | `ab9eed:	e8 44 19 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xab9f95` | `ab9f95:	e8 9c 18 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaba04d` | `aba04d:	e8 e4 17 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaba0f8` | `aba0f8:	e8 39 17 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaba195` | `aba195:	e8 9c 16 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb02f` | `abb02f:	e8 02 08 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb108` | `abb108:	e8 29 07 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb1bf` | `abb1bf:	e8 72 06 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb276` | `abb276:	e8 bb 05 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb346` | `abb346:	e8 eb 04 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb3f7` | `abb3f7:	e8 3a 04 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb494` | `abb494:	e8 9d 03 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb53c` | `abb53c:	e8 f5 02 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb5fd` | `abb5fd:	e8 34 02 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb6a7` | `abb6a7:	e8 8a 01 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb75e` | `abb75e:	e8 d3 00 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb812` | `abb812:	e8 1f 00 fc ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabb8a4` | `abb8a4:	e8 8d ff fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xabd01f` | `abd01f:	e8 12 e8 fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xac03fa` | `ac03fa:	e8 37 b4 fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xac0495` | `ac0495:	e8 9c b3 fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xac1a08` | `ac1a08:	48 8d 05 cb 1f 00 00 	lea    rax,[rip+0x1fcb]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>` |
| `0xac2cdb` | `ac2cdb:	e8 56 8b fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xac2ced` | `ac2ced:	e8 44 8b fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xac39da` | `ac39da:	83 ff 01             	cmp    edi,0x1` |
| `0xac8e5d` | `ac8e5d:	e8 d4 29 fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xac8fd6` | `ac8fd6:	e8 5b 28 fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xac90ec` | `ac90ec:	e8 45 27 fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xac926c` | `ac926c:	e8 c5 25 fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xac986d` | `ac986d:	e8 c4 1f fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xac9c41` | `ac9c41:	e8 f0 1b fb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xad0bda` | `ad0bda:	e8 57 ac fa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xad15af` | `ad15af:	e8 82 a2 fa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xad1669` | `ad1669:	e8 c8 a1 fa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xad29b7` | `ad29b7:	e8 7a 8e fa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xad29df` | `ad29df:	e8 52 8e fa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xad86a4` | `ad86a4:	e8 8d 31 fa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xad8802` | `ad8802:	e8 2f 30 fa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xadee2c` | `adee2c:	48 8d 05 a7 4b fe ff 	lea    rax,[rip+0xfffffffffffe4ba7]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>` |
| `0xadf3a2` | `adf3a2:	e8 8f c4 f9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xae155e` | `ae155e:	48 8d 05 75 24 fe ff 	lea    rax,[rip+0xfffffffffffe2475]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>` |
| `0xae1af2` | `ae1af2:	e8 3f 9d f9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xae1eb7` | `ae1eb7:	e8 7a 99 f9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xae5314` | `ae5314:	e8 1d 65 f9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaf734e` | `af734e:	e8 e3 44 f8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xaf8049` | `af8049:	e8 e8 37 f8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xafbbc1` | `afbbc1:	e8 70 fc f7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xafbbcf` | `afbbcf:	e8 62 fc f7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb06e3a` | `b06e3a:	e8 f7 49 f7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb0a9e2` | `b0a9e2:	e8 4f 0e f7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb0ff46` | `b0ff46:	e8 eb b8 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1023e` | `b1023e:	e8 f3 b5 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb10617` | `b10617:	e8 1a b2 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb10991` | `b10991:	e8 a0 ae f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb10e6f` | `b10e6f:	e8 c2 a9 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb10ee4` | `b10ee4:	e8 4d a9 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1121e` | `b1121e:	e8 13 a6 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb11263` | `b11263:	e8 ce a5 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb116e1` | `b116e1:	e8 50 a1 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb11756` | `b11756:	e8 db a0 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb11799` | `b11799:	e8 98 a0 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb11aff` | `b11aff:	e8 32 9d f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb11b74` | `b11b74:	e8 bd 9c f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb11e3a` | `b11e3a:	e8 f7 99 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb121ca` | `b121ca:	e8 67 96 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb12501` | `b12501:	e8 30 93 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb12576` | `b12576:	e8 bb 92 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb125ec` | `b125ec:	e8 45 92 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb12953` | `b12953:	e8 de 8e f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb129c8` | `b129c8:	e8 69 8e f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb12a3e` | `b12a3e:	e8 f3 8d f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb12da5` | `b12da5:	e8 8c 8a f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb12e1a` | `b12e1a:	e8 17 8a f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb130e3` | `b130e3:	e8 4e 87 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb13158` | `b13158:	e8 d9 86 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb131ce` | `b131ce:	e8 63 86 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb13d0b` | `b13d0b:	e8 26 7b f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb14626` | `b14626:	e8 0b 72 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb146a6` | `b146a6:	e8 8b 71 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1546e` | `b1546e:	e8 c3 63 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb154ec` | `b154ec:	e8 45 63 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb15532` | `b15532:	e8 ff 62 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb15997` | `b15997:	e8 9a 5e f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb15a0c` | `b15a0c:	e8 25 5e f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb15ab2` | `b15ab2:	e8 7f 5d f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb15b57` | `b15b57:	e8 da 5c f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb15fd6` | `b15fd6:	e8 5b 58 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb16322` | `b16322:	e8 0f 55 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb16733` | `b16733:	e8 fe 50 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb16c42` | `b16c42:	e8 ef 4b f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb16e56` | `b16e56:	e8 db 49 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1706a` | `b1706a:	e8 c7 47 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb17648` | `b17648:	e8 e9 41 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1768d` | `b1768d:	e8 a4 41 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb17950` | `b17950:	e8 e1 3e f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb17b67` | `b17b67:	e8 ca 3c f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb17bdc` | `b17bdc:	e8 55 3c f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb17c52` | `b17c52:	e8 df 3b f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb17fb6` | `b17fb6:	e8 7b 38 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb181d6` | `b181d6:	e8 5b 36 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1850d` | `b1850d:	e8 24 33 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb18582` | `b18582:	e8 af 32 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb185f8` | `b185f8:	e8 39 32 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb18b1f` | `b18b1f:	e8 12 2d f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb18b94` | `b18b94:	e8 9d 2c f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb18c0a` | `b18c0a:	e8 27 2c f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb18c80` | `b18c80:	e8 b1 2b f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb19089` | `b19089:	e8 a8 27 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb190fe` | `b190fe:	e8 33 27 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb19174` | `b19174:	e8 bd 26 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb194db` | `b194db:	e8 56 23 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb19550` | `b19550:	e8 e1 22 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb19819` | `b19819:	e8 18 20 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1988e` | `b1988e:	e8 a3 1f f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb198d1` | `b198d1:	e8 60 1f f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb19d14` | `b19d14:	e8 1d 1b f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb19f2b` | `b19f2b:	e8 06 19 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb19fa0` | `b19fa0:	e8 91 18 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1a016` | `b1a016:	e8 1b 18 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1a954` | `b1a954:	e8 dd 0e f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1a9d3` | `b1a9d3:	e8 5e 0e f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1ae73` | `b1ae73:	e8 be 09 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1b4f3` | `b1b4f3:	e8 3e 03 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1b568` | `b1b568:	e8 c9 02 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1b831` | `b1b831:	e8 00 00 f6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1b8a6` | `b1b8a6:	e8 8b ff f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1be8e` | `b1be8e:	e8 a3 f9 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1bf5a` | `b1bf5a:	e8 d7 f8 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1cb28` | `b1cb28:	e8 09 ed f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1cba8` | `b1cba8:	e8 89 ec f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1d3e2` | `b1d3e2:	e8 4f e4 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1d460` | `b1d460:	e8 d1 e3 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1d4a6` | `b1d4a6:	e8 8b e3 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1d66d` | `b1d66d:	e8 c4 e1 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1d6e2` | `b1d6e2:	e8 4f e1 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1d788` | `b1d788:	e8 a9 e0 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1d82d` | `b1d82d:	e8 04 e0 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1ebe4` | `b1ebe4:	e8 4d cc f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1ecb7` | `b1ecb7:	e8 7a cb f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1ed42` | `b1ed42:	e8 ef ca f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1ef47` | `b1ef47:	e8 ea c8 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1f030` | `b1f030:	e8 01 c8 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1f0e7` | `b1f0e7:	e8 4a c7 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1f182` | `b1f182:	e8 af c6 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1f22f` | `b1f22f:	e8 02 c6 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1f964` | `b1f964:	e8 cd be f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1f9e2` | `b1f9e2:	e8 4f be f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb1fe0d` | `b1fe0d:	e8 24 ba f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb20518` | `b20518:	e8 19 b3 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb20d00` | `b20d00:	e8 31 ab f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb20fc5` | `b20fc5:	e8 6c a8 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb2103a` | `b2103a:	e8 f7 a7 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb21303` | `b21303:	e8 2e a5 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb21378` | `b21378:	e8 b9 a4 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb21641` | `b21641:	e8 f0 a1 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb216b6` | `b216b6:	e8 7b a1 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb21a1d` | `b21a1d:	e8 14 9e f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb21a92` | `b21a92:	e8 9f 9d f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb21b08` | `b21b08:	e8 29 9d f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb21e6f` | `b21e6f:	e8 c2 99 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb21ee4` | `b21ee4:	e8 4d 99 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb21f5a` | `b21f5a:	e8 d7 98 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb222c1` | `b222c1:	e8 70 95 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb22336` | `b22336:	e8 fb 94 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb223ac` | `b223ac:	e8 85 94 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb227ae` | `b227ae:	e8 83 90 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb22b7f` | `b22b7f:	e8 b2 8c f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb22bf4` | `b22bf4:	e8 3d 8c f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb22c6a` | `b22c6a:	e8 c7 8b f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb22fd1` | `b22fd1:	e8 60 88 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb23046` | `b23046:	e8 eb 87 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb230bc` | `b230bc:	e8 75 87 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb232d4` | `b232d4:	e8 5d 85 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb23511` | `b23511:	e8 20 83 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb2384f` | `b2384f:	e8 e2 7f f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb238b0` | `b238b0:	e8 81 7f f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb2392a` | `b2392a:	e8 07 7f f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb23ede` | `b23ede:	e8 53 79 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb2424f` | `b2424f:	e8 e2 75 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb24bbf` | `b24bbf:	e8 72 6c f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb25743` | `b25743:	e8 ee 60 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb25823` | `b25823:	e8 0e 60 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb260cb` | `b260cb:	e8 66 57 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb26b07` | `b26b07:	e8 2a 4d f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb26b84` | `b26b84:	e8 ad 4c f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb26ed1` | `b26ed1:	e8 60 49 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb26f4e` | `b26f4e:	e8 e3 48 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb274d5` | `b274d5:	e8 5c 43 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb2754a` | `b2754a:	e8 e7 42 f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb27b07` | `b27b07:	e8 2a 3d f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb27b7c` | `b27b7c:	e8 b5 3c f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb27c22` | `b27c22:	e8 0f 3c f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb27cc7` | `b27cc7:	e8 6a 3b f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb27d9d` | `b27d9d:	e8 94 3a f5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb3363c` | `b3363c:	e8 f5 81 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb33703` | `b33703:	e8 2e 81 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb33b63` | `b33b63:	e8 ce 7c f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb34a52` | `b34a52:	e8 df 6d f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb34a7d` | `b34a7d:	e8 b4 6d f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb34b2a` | `b34b2a:	e8 07 6d f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb34dba` | `b34dba:	e8 77 6a f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb34dec` | `b34dec:	e8 45 6a f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb34f0e` | `b34f0e:	e8 23 69 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb34fe2` | `b34fe2:	e8 4f 68 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb350cc` | `b350cc:	e8 65 67 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb3518c` | `b3518c:	e8 a5 66 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb3521c` | `b3521c:	e8 15 66 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb352ca` | `b352ca:	e8 67 65 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb376a4` | `b376a4:	e8 8d 41 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb37751` | `b37751:	e8 e0 40 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb377db` | `b377db:	e8 56 40 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb37866` | `b37866:	e8 cb 3f f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb378e5` | `b378e5:	e8 4c 3f f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb37977` | `b37977:	e8 ba 3e f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb38f6e` | `b38f6e:	e8 c3 28 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb3904e` | `b3904e:	e8 e3 27 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb390cc` | `b390cc:	e8 65 27 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb3934d` | `b3934d:	e8 e4 24 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb39434` | `b39434:	e8 fd 23 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb3a1ee` | `b3a1ee:	e8 43 16 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb3b514` | `b3b514:	e8 1d 03 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb3b548` | `b3b548:	e8 e9 02 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb3c93c` | `b3c93c:	e8 f5 ee f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb3c9ec` | `b3c9ec:	e8 45 ee f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb3caab` | `b3caab:	e8 86 ed f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb40c9c` | `b40c9c:	e8 95 ab f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb41cac` | `b41cac:	e8 85 9b f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb41d68` | `b41d68:	e8 c9 9a f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb41df7` | `b41df7:	e8 3a 9a f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb41eb9` | `b41eb9:	e8 78 99 f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb4584e` | `b4584e:	e8 e3 5f f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb4587b` | `b4587b:	e8 b6 5f f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb460e1` | `b460e1:	e8 50 57 f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb461cc` | `b461cc:	e8 65 56 f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb47c6a` | `b47c6a:	e8 c7 3b f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb47d15` | `b47d15:	e8 1c 3b f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb47df5` | `b47df5:	e8 3c 3a f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb4b53d` | `b4b53d:	e8 f4 02 f3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb4c10d` | `b4c10d:	e8 24 f7 f2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb55cf5` | `b55cf5:	e8 3c 5b f2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb55d9c` | `b55d9c:	e8 95 5a f2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb59286` | `b59286:	e8 ab 25 f2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb592b9` | `b592b9:	e8 78 25 f2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb59a4d` | `b59a4d:	e8 e4 1d f2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb59b2f` | `b59b2f:	e8 02 1d f2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb59bf4` | `b59bf4:	e8 3d 1c f2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb5e9c5` | `b5e9c5:	e8 6c ce f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb636bd` | `b636bd:	e8 74 81 f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb636db` | `b636db:	e8 56 81 f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb639e0` | `b639e0:	e8 51 7e f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb63a00` | `b63a00:	e8 31 7e f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb63c18` | `b63c18:	e8 19 7c f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb63c39` | `b63c39:	e8 f8 7b f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb63e2c` | `b63e2c:	e8 05 7a f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb63e4a` | `b63e4a:	e8 e7 79 f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb64ccd` | `b64ccd:	e8 64 6b f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb64d9a` | `b64d9a:	e8 97 6a f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb64e3c` | `b64e3c:	e8 f5 69 f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb64ee9` | `b64ee9:	e8 48 69 f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb675cb` | `b675cb:	e8 66 42 f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb67609` | `b67609:	e8 28 42 f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb68568` | `b68568:	e8 c9 32 f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb68597` | `b68597:	e8 9a 32 f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb6ab1e` | `b6ab1e:	e8 13 0d f1 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb79498` | `b79498:	e8 99 23 f0 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb79c15` | `b79c15:	e8 1c 1c f0 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb7ae6d` | `b7ae6d:	e8 c4 09 f0 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb9211d` | `b9211d:	e9 14 97 ee ff       	jmp    a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb9336c` | `b9336c:	e8 c5 84 ee ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb94f5b` | `b94f5b:	e8 d6 68 ee ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xb95141` | `b95141:	e8 f0 66 ee ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbbc378` | `bbc378:	e8 b9 f4 eb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbc6ca9` | `bc6ca9:	e8 88 4b eb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbc6cec` | `bc6cec:	e8 45 4b eb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbc70c9` | `bc70c9:	e8 68 47 eb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbc710c` | `bc710c:	e8 25 47 eb ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbce6b6` | `bce6b6:	e8 7b d1 ea ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbce768` | `bce768:	e8 c9 d0 ea ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbce7f1` | `bce7f1:	e8 40 d0 ea ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbd69f9` | `bd69f9:	e8 38 4e ea ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbd6acf` | `bd6acf:	e8 62 4d ea ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbd6b87` | `bd6b87:	e8 aa 4c ea ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbd6c11` | `bd6c11:	e8 20 4c ea ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbd6c90` | `bd6c90:	e8 a1 4b ea ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbd6d1f` | `bd6d1f:	e8 12 4b ea ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbd6e20` | `bd6e20:	e8 11 4a ea ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbf9775` | `bf9775:	e8 bc 20 e8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbf9800` | `bf9800:	e8 31 20 e8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbf9b1c` | `bf9b1c:	e8 15 1d e8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbf9e5b` | `bf9e5b:	e8 d6 19 e8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbf9ed4` | `bf9ed4:	e8 5d 19 e8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbfa3e7` | `bfa3e7:	e8 4a 14 e8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbfa45c` | `bfa45c:	e8 d5 13 e8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbfa814` | `bfa814:	e8 1d 10 e8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xbfab80` | `bfab80:	e8 b1 0c e8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc05954` | `c05954:	e8 dd 5e e7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc05985` | `c05985:	e8 ac 5e e7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc081e7` | `c081e7:	e8 4a 36 e7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc099d4` | `c099d4:	e8 5d 1e e7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc09abe` | `c09abe:	e8 73 1d e7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0aa7a` | `c0aa7a:	e8 b7 0d e7 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0bf4c` | `c0bf4c:	e8 e5 f8 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0d220` | `c0d220:	e8 11 e6 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0f09f` | `c0f09f:	e8 92 c7 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0f180` | `c0f180:	e8 b1 c6 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0f241` | `c0f241:	e8 f0 c5 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0f2ce` | `c0f2ce:	e8 63 c5 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0f360` | `c0f360:	e8 d1 c4 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0f3fb` | `c0f3fb:	e8 36 c4 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0f496` | `c0f496:	e8 9b c3 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0f532` | `c0f532:	e8 ff c2 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0f5cd` | `c0f5cd:	e8 64 c2 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0f660` | `c0f660:	e8 d1 c1 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc0f731` | `c0f731:	e8 00 c1 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc12182` | `c12182:	e8 af 96 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc12284` | `c12284:	e8 ad 95 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc12364` | `c12364:	e8 cd 94 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc12384` | `c12384:	e8 ad 94 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc12c0f` | `c12c0f:	e8 22 8c e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc12ee2` | `c12ee2:	e8 4f 89 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc12f76` | `c12f76:	e8 bb 88 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc13756` | `c13756:	e8 db 80 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc137ea` | `c137ea:	e8 47 80 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc13a59` | `c13a59:	e8 d8 7d e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc13aa4` | `c13aa4:	e8 8d 7d e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc13f1f` | `c13f1f:	e8 12 79 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc13f6a` | `c13f6a:	e8 c7 78 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc14611` | `c14611:	e8 20 72 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc148c5` | `c148c5:	e8 6c 6f e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc14a5a` | `c14a5a:	e8 d7 6d e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc14a7a` | `c14a7a:	e8 b7 6d e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc14ba7` | `c14ba7:	e8 8a 6c e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc14bc8` | `c14bc8:	e8 69 6c e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc14ce4` | `c14ce4:	e8 4d 6b e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc14e02` | `c14e02:	e8 2f 6a e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc14f55` | `c14f55:	e8 dc 68 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc151d3` | `c151d3:	e8 5e 66 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc1520f` | `c1520f:	e8 22 66 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc153b2` | `c153b2:	e8 7f 64 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc153d8` | `c153d8:	e8 59 64 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc15c0b` | `c15c0b:	e8 26 5c e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc15f41` | `c15f41:	e8 f0 58 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc160b2` | `c160b2:	e8 7f 57 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc16f6e` | `c16f6e:	e8 c3 48 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc173eb` | `c173eb:	e8 46 44 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc17880` | `c17880:	e8 b1 3f e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc17dea` | `c17dea:	e8 47 3a e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc17e36` | `c17e36:	e8 fb 39 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc181d5` | `c181d5:	e8 5c 36 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc18239` | `c18239:	e8 f8 35 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc1961f` | `c1961f:	e8 12 22 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc19e22` | `c19e22:	e8 0f 1a e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc19e6e` | `c19e6e:	e8 c3 19 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc1a046` | `c1a046:	e8 eb 17 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc1a092` | `c1a092:	e8 9f 17 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc1d02c` | `c1d02c:	e8 05 e8 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc1d66a` | `c1d66a:	e8 c7 e1 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc1d6b6` | `c1d6b6:	e8 7b e1 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc1d70c` | `c1d70c:	e8 25 e1 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc1d758` | `c1d758:	e8 d9 e0 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc203b8` | `c203b8:	e8 79 b4 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc27e9e` | `c27e9e:	e8 93 39 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc28613` | `c28613:	e8 1e 32 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc286ff` | `c286ff:	e8 32 31 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc287a1` | `c287a1:	e8 90 30 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc28840` | `c28840:	e8 f1 2f e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc28915` | `c28915:	e8 1c 2f e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc289cd` | `c289cd:	e8 64 2e e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc28aab` | `c28aab:	e8 86 2d e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc28b7a` | `c28b7a:	e8 b7 2c e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc28c15` | `c28c15:	e8 1c 2c e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc28ca6` | `c28ca6:	e8 8b 2b e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc28d48` | `c28d48:	e8 e9 2a e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc28e04` | `c28e04:	e8 2d 2a e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc28ec9` | `c28ec9:	e8 68 29 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc28f5b` | `c28f5b:	e8 d6 28 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc29007` | `c29007:	e8 2a 28 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc290b4` | `c290b4:	e8 7d 27 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc29183` | `c29183:	e8 ae 26 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc2921c` | `c2921c:	e8 15 26 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc292d1` | `c292d1:	e8 60 25 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc293a9` | `c293a9:	e8 88 24 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc29453` | `c29453:	e8 de 23 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc294f6` | `c294f6:	e8 3b 23 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc295b2` | `c295b2:	e8 7f 22 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc29681` | `c29681:	e8 b0 21 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc2e253` | `c2e253:	48 8d 05 80 57 e9 ff 	lea    rax,[rip+0xffffffffffe95780]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>` |
| `0xc2ec1d` | `c2ec1d:	e8 14 cc e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc2f18b` | `c2f18b:	e8 a6 c6 e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc30386` | `c30386:	e8 ab b4 e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc303a1` | `c303a1:	e8 90 b4 e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc309bd` | `c309bd:	e8 74 ae e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc309d6` | `c309d6:	e8 5b ae e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc30bb3` | `c30bb3:	e8 7e ac e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc30bc1` | `c30bc1:	e8 70 ac e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc31c11` | `c31c11:	e8 20 9c e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc31d57` | `c31d57:	e8 da 9a e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc33610` | `c33610:	e8 21 82 e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc33705` | `c33705:	e8 2c 81 e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc33794` | `c33794:	e8 9d 80 e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc33862` | `c33862:	e8 cf 7f e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc33930` | `c33930:	e8 01 7f e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc339d1` | `c339d1:	e8 60 7e e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc33aa7` | `c33aa7:	e8 8a 7d e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc33b36` | `c33b36:	e8 fb 7c e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc33bde` | `c33bde:	e8 53 7c e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc33c8b` | `c33c8b:	e8 a6 7b e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| ... | truncated 3700 more |

## v8 interpretation checklist

- `10bff52` and `10bffde` both call the installed payload through virtual `+0x20` before doing string/bool work.
- `10bffde` contains the stronger readiness-style boolean branch because it calls `17c4edc` and tests its return.
- This report does not patch behavior; it only classifies the static dataflow.
