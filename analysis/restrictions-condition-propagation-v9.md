# Restrictions condition propagation from 10bffde / 10bb16e v9

Focus: how the condition/update result from installed object method `10bffde` is propagated through the `0x184d5d0` reader methods.

## 10bff52 stringify/helper `0x10bff52`

```text
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
 10c0132:	48 89 f7             	mov    rdi,rsi
 10c0135:	48 89 d6             	mov    rsi,rdx
 10c0138:	e8 05 00 00 00       	call   10c0142 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287558>
 10c013d:	48 89 d8             	mov    rax,rbx
 10c0140:	5b                   	pop    rbx
 10c0141:	c3                   	ret
 10c0142:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
 10c0146:	48 8d 05 bb d7 78 00 	lea    rax,[rip+0x78d7bb]        # 184d908 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ff0>
 10c014d:	48 89 07             	mov    QWORD PTR [rdi],rax
 10c0150:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 10c0155:	48 89 77 18          	mov    QWORD PTR [rdi+0x18],rsi
 10c0159:	48 8d 05 f8 8e 83 00 	lea    rax,[rip+0x838ef8]        # 18f9058 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40468>
 10c0160:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
 10c0164:	0f 28 05 65 db 2c ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff2cdb65]        # 38dcd0 <_ZTSSt12bad_any_cast@@Base-0x24f8>
 10c016b:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
 10c016f:	48 8d 05 52 f4 37 ff 	lea    rax,[rip+0xffffffffff37f452]        # 43f5c8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x51d4>
 10c0176:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
 10c017a:	48 89 77 40          	mov    QWORD PTR [rdi+0x40],rsi
 10c017e:	48 8d 05 73 f6 37 ff 	lea    rax,[rip+0xffffffffff37f673]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10c0185:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
 10c0189:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
 10c018d:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
 10c0191:	c3                   	ret
 10c0192:	53                   	push   rbx
 10c0193:	48 89 fb             	mov    rbx,rdi
 10c0196:	48 83 c7 08          	add    rdi,0x8
 10c019a:	e8 69 a8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10c019f:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
 10c01a3:	e8 00 57 6a 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
 10c01a8:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
 10c01ac:	e8 f7 56 6a 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
 10c01b1:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
 10c01b5:	e8 ee 56 6a 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
 10c01ba:	48 83 c3 18          	add    rbx,0x18
 10c01be:	48 89 df             	mov    rdi,rbx
 10c01c1:	5b                   	pop    rbx
 10c01c2:	e9 b5 f9 9f ff       	jmp    abfb7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb1c>
```
## 10bffde condition/update helper `0x10bffde`

```text
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
 10c0132:	48 89 f7             	mov    rdi,rsi
 10c0135:	48 89 d6             	mov    rsi,rdx
 10c0138:	e8 05 00 00 00       	call   10c0142 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287558>
 10c013d:	48 89 d8             	mov    rax,rbx
 10c0140:	5b                   	pop    rbx
 10c0141:	c3                   	ret
 10c0142:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
 10c0146:	48 8d 05 bb d7 78 00 	lea    rax,[rip+0x78d7bb]        # 184d908 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ff0>
 10c014d:	48 89 07             	mov    QWORD PTR [rdi],rax
 10c0150:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 10c0155:	48 89 77 18          	mov    QWORD PTR [rdi+0x18],rsi
 10c0159:	48 8d 05 f8 8e 83 00 	lea    rax,[rip+0x838ef8]        # 18f9058 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x40468>
 10c0160:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
 10c0164:	0f 28 05 65 db 2c ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff2cdb65]        # 38dcd0 <_ZTSSt12bad_any_cast@@Base-0x24f8>
 10c016b:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
 10c016f:	48 8d 05 52 f4 37 ff 	lea    rax,[rip+0xffffffffff37f452]        # 43f5c8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x51d4>
 10c0176:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
 10c017a:	48 89 77 40          	mov    QWORD PTR [rdi+0x40],rsi
 10c017e:	48 8d 05 73 f6 37 ff 	lea    rax,[rip+0xffffffffff37f673]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 10c0185:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
 10c0189:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
 10c018d:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
 10c0191:	c3                   	ret
 10c0192:	53                   	push   rbx
 10c0193:	48 89 fb             	mov    rbx,rdi
 10c0196:	48 83 c7 08          	add    rdi,0x8
 10c019a:	e8 69 a8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10c019f:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
 10c01a3:	e8 00 57 6a 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
 10c01a8:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
 10c01ac:	e8 f7 56 6a 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
 10c01b1:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
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
```
## 10bb09e caller of +0x10 `0x10bb09e`

```text
 10bb037:	48 83 ec 28          	sub    rsp,0x28
 10bb03b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb042:	00 00
 10bb044:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10bb049:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
 10bb04d:	48 8d 35 c4 d1 92 00 	lea    rsi,[rip+0x92d1c4]        # 19e8218 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x2808>
 10bb054:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bb059:	4c 89 f7             	mov    rdi,r14
 10bb05c:	e8 49 6d 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bb061:	48 8d 54 24 07       	lea    rdx,[rsp+0x7]
 10bb066:	c6 02 01             	mov    BYTE PTR [rdx],0x1
 10bb069:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 10bb06c:	4c 89 f6             	mov    rsi,r14
 10bb06f:	e8 ea 26 ad ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
 10bb074:	89 c3                	mov    ebx,eax
 10bb076:	4c 89 f7             	mov    rdi,r14
 10bb079:	e8 12 2e 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bb07e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb085:	00 00
 10bb087:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
 10bb08c:	75 0a                	jne    10bb098 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2824ae>
 10bb08e:	89 d8                	mov    eax,ebx
 10bb090:	48 83 c4 28          	add    rsp,0x28
 10bb094:	5b                   	pop    rbx
 10bb095:	41 5e                	pop    r14
 10bb097:	c3                   	ret
 10bb098:	e8 13 4a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb09d:	cc                   	int3
 10bb09e:	41 56                	push   r14
 10bb0a0:	53                   	push   rbx
 10bb0a1:	48 83 ec 48          	sub    rsp,0x48
 10bb0a5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb0ac:	00 00
 10bb0ae:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10bb0b3:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
 10bb0b8:	0f 57 c0             	xorps  xmm0,xmm0
 10bb0bb:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 10bb0be:	48 8d 05 fb 26 79 00 	lea    rax,[rip+0x7926fb]        # 184d7c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ea8>
 10bb0c5:	48 89 43 f8          	mov    QWORD PTR [rbx-0x8],rax
 10bb0c9:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bb0cc:	83 f8 05             	cmp    eax,0x5
 10bb0cf:	6a 05                	push   0x5
 10bb0d1:	59                   	pop    rcx
 10bb0d2:	0f 42 c8             	cmovb  ecx,eax
 10bb0d5:	89 4b 10             	mov    DWORD PTR [rbx+0x10],ecx
 10bb0d8:	8a 47 54             	mov    al,BYTE PTR [rdi+0x54]
 10bb0db:	88 43 14             	mov    BYTE PTR [rbx+0x14],al
 10bb0de:	c7 43 08 03 00 00 00 	mov    DWORD PTR [rbx+0x8],0x3
 10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]
 10bb0e9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bb0ee:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
 10bb0f3:	e8 cc 4b 6c 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
 10bb0f8:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bb0fb:	48 8d 35 ae d0 92 00 	lea    rsi,[rip+0x92d0ae]        # 19e81b0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27a0>
 10bb102:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
 10bb107:	4c 89 f7             	mov    rdi,r14
 10bb10a:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10bb10d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bb112:	e8 79 2d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bb117:	48 89 df             	mov    rdi,rbx
 10bb11a:	e8 e9 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10bb11f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb126:	00 00
 10bb128:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10bb12d:	75 3a                	jne    10bb169 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28257f>
 10bb12f:	48 83 c4 48          	add    rsp,0x48
 10bb133:	5b                   	pop    rbx
 10bb134:	41 5e                	pop    r14
 10bb136:	c3                   	ret
 10bb137:	49 89 c6             	mov    r14,rax
 10bb13a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bb13f:	e8 4c 2d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bb144:	eb 03                	jmp    10bb149 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28255f>
 10bb146:	49 89 c6             	mov    r14,rax
 10bb149:	48 89 df             	mov    rdi,rbx
 10bb14c:	e8 b7 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10bb151:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb158:	00 00
 10bb15a:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10bb15f:	75 08                	jne    10bb169 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28257f>
 10bb161:	4c 89 f7             	mov    rdi,r14
 10bb164:	e8 67 4b 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bb169:	e8 42 49 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb16e:	41 56                	push   r14
 10bb170:	53                   	push   rbx
 10bb171:	48 83 ec 48          	sub    rsp,0x48
 10bb175:	48 89 fb             	mov    rbx,rdi
 10bb178:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb17f:	00 00
 10bb181:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10bb186:	48 8b 77 60          	mov    rsi,QWORD PTR [rdi+0x60]
 10bb18a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10bb18d:	48 8d 15 1c d0 92 00 	lea    rdx,[rip+0x92d01c]        # 19e81b0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27a0>
 10bb194:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
 10bb199:	4c 89 f7             	mov    rdi,r14
 10bb19c:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10bb19f:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10bb1a4:	74 5e                	je     10bb204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28261a>
 10bb1a6:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bb1ab:	0f 57 c0             	xorps  xmm0,xmm0
 10bb1ae:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 10bb1b2:	48 8d 05 07 26 79 00 	lea    rax,[rip+0x792607]        # 184d7c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ea8>
 10bb1b9:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
 10bb1bd:	49 83 66 0d 00       	and    QWORD PTR [r14+0xd],0x0
 10bb1c2:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bb1c7:	e8 86 a9 a8 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
 10bb1cc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bb1d1:	e8 60 06 9c ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bb1d6:	48 89 e7             	mov    rdi,rsp
 10bb1d9:	48 89 c6             	mov    rsi,rax
 10bb1dc:	e8 71 46 6c 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 10bb1e1:	84 c0                	test   al,al
 10bb1e3:	74 17                	je     10bb1fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282612>
 10bb1e5:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
 10bb1e9:	83 f8 05             	cmp    eax,0x5
 10bb1ec:	6a 05                	push   0x5
 10bb1ee:	59                   	pop    rcx
 10bb1ef:	0f 42 c8             	cmovb  ecx,eax
 10bb1f2:	89 4b 50             	mov    DWORD PTR [rbx+0x50],ecx
 10bb1f5:	8a 44 24 1c          	mov    al,BYTE PTR [rsp+0x1c]
 10bb1f9:	88 43 54             	mov    BYTE PTR [rbx+0x54],al
 10bb1fc:	4c 89 f7             	mov    rdi,r14
 10bb1ff:	e8 04 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10bb204:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bb209:	e8 22 bb 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10bb20e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb215:	00 00
 10bb217:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10bb21c:	75 35                	jne    10bb253 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282669>
 10bb21e:	48 83 c4 48          	add    rsp,0x48
 10bb222:	5b                   	pop    rbx
 10bb223:	41 5e                	pop    r14
 10bb225:	c3                   	ret
 10bb226:	48 89 c3             	mov    rbx,rax
 10bb229:	4c 89 f7             	mov    rdi,r14
 10bb22c:	e8 d7 f7 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10bb231:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bb236:	e8 f5 ba 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10bb23b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb242:	00 00
 10bb244:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10bb249:	75 08                	jne    10bb253 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282669>
 10bb24b:	48 89 df             	mov    rdi,rbx
 10bb24e:	e8 7d 4a 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bb253:	e8 58 48 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb258:	55                   	push   rbp
 10bb259:	41 57                	push   r15
 10bb25b:	41 56                	push   r14
 10bb25d:	41 55                	push   r13
 10bb25f:	41 54                	push   r12
 10bb261:	53                   	push   rbx
 10bb262:	48 81 ec e8 07 00 00 	sub    rsp,0x7e8
 10bb269:	4c 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],r9
 10bb26e:	89 4c 24 34          	mov    DWORD PTR [rsp+0x34],ecx
 10bb272:	48 89 fb             	mov    rbx,rdi
 10bb275:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb27c:	00 00
 10bb27e:	48 89 84 24 e0 07 00 	mov    QWORD PTR [rsp+0x7e0],rax
 10bb285:	00
 10bb286:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 10bb28b:	0f 57 c0             	xorps  xmm0,xmm0
 10bb28e:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
 10bb295:	00 00
 10bb297:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 10bb29a:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
 10bb29f:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
 10bb2a4:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10bb2a7:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 10bb2ab:	4c 8b 2a             	mov    r13,QWORD PTR [rdx]
 10bb2ae:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
 10bb2b2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10bb2b7:	49 39 c5             	cmp    r13,rax
 10bb2ba:	0f 84 49 0d 00 00    	je     10bc009 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28341f>
 10bb2c0:	4c 89 44 24 48       	mov    QWORD PTR [rsp+0x48],r8
 10bb2c5:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
 10bb2ca:	48 8d 43 10          	lea    rax,[rbx+0x10]
 10bb2ce:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10bb2d3:	b8 a8 00 00 00       	mov    eax,0xa8
 10bb2d8:	4c 8d b4 24 90 06 00 	lea    r14,[rsp+0x690]
 10bb2df:	00
 10bb2e0:	49 8d 0c 06          	lea    rcx,[r14+rax*1]
 10bb2e4:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
 10bb2e9:	48 8d 8c 24 80 03 00 	lea    rcx,[rsp+0x380]
 10bb2f0:	00
 10bb2f1:	48 01 c8             	add    rax,rcx
 10bb2f4:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 10bb2f9:	31 ed                	xor    ebp,ebp
 10bb2fb:	48 8d 9c 24 88 00 00 	lea    rbx,[rsp+0x88]
 10bb302:	00
 10bb303:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
 10bb307:	4c 8d a4 24 50 06 00 	lea    r12,[rsp+0x650]
 10bb30e:	00
 10bb30f:	c7 44 24 14 00 00 00 	mov    DWORD PTR [rsp+0x14],0x0
 10bb316:	00
 10bb317:	4c 89 ef             	mov    rdi,r13
 10bb31a:	e8 c3 fe 49 00       	call   155b1e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a0766>
 10bb31f:	84 c0                	test   al,al
 10bb321:	0f 84 3c 02 00 00    	je     10bb563 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282979>
```
## 10bb16e caller of +0x18 `0x10bb16e`

```text
 10bb107:	4c 89 f7             	mov    rdi,r14
 10bb10a:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10bb10d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bb112:	e8 79 2d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bb117:	48 89 df             	mov    rdi,rbx
 10bb11a:	e8 e9 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10bb11f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb126:	00 00
 10bb128:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10bb12d:	75 3a                	jne    10bb169 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28257f>
 10bb12f:	48 83 c4 48          	add    rsp,0x48
 10bb133:	5b                   	pop    rbx
 10bb134:	41 5e                	pop    r14
 10bb136:	c3                   	ret
 10bb137:	49 89 c6             	mov    r14,rax
 10bb13a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bb13f:	e8 4c 2d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bb144:	eb 03                	jmp    10bb149 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28255f>
 10bb146:	49 89 c6             	mov    r14,rax
 10bb149:	48 89 df             	mov    rdi,rbx
 10bb14c:	e8 b7 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10bb151:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb158:	00 00
 10bb15a:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10bb15f:	75 08                	jne    10bb169 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28257f>
 10bb161:	4c 89 f7             	mov    rdi,r14
 10bb164:	e8 67 4b 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bb169:	e8 42 49 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb16e:	41 56                	push   r14
 10bb170:	53                   	push   rbx
 10bb171:	48 83 ec 48          	sub    rsp,0x48
 10bb175:	48 89 fb             	mov    rbx,rdi
 10bb178:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb17f:	00 00
 10bb181:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10bb186:	48 8b 77 60          	mov    rsi,QWORD PTR [rdi+0x60]
 10bb18a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10bb18d:	48 8d 15 1c d0 92 00 	lea    rdx,[rip+0x92d01c]        # 19e81b0 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27a0>
 10bb194:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
 10bb199:	4c 89 f7             	mov    rdi,r14
 10bb19c:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10bb19f:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
 10bb1a4:	74 5e                	je     10bb204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28261a>
 10bb1a6:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 10bb1ab:	0f 57 c0             	xorps  xmm0,xmm0
 10bb1ae:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 10bb1b2:	48 8d 05 07 26 79 00 	lea    rax,[rip+0x792607]        # 184d7c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9ea8>
 10bb1b9:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
 10bb1bd:	49 83 66 0d 00       	and    QWORD PTR [r14+0xd],0x0
 10bb1c2:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bb1c7:	e8 86 a9 a8 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
 10bb1cc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bb1d1:	e8 60 06 9c ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bb1d6:	48 89 e7             	mov    rdi,rsp
 10bb1d9:	48 89 c6             	mov    rsi,rax
 10bb1dc:	e8 71 46 6c 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 10bb1e1:	84 c0                	test   al,al
 10bb1e3:	74 17                	je     10bb1fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282612>
 10bb1e5:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
 10bb1e9:	83 f8 05             	cmp    eax,0x5
 10bb1ec:	6a 05                	push   0x5
 10bb1ee:	59                   	pop    rcx
 10bb1ef:	0f 42 c8             	cmovb  ecx,eax
 10bb1f2:	89 4b 50             	mov    DWORD PTR [rbx+0x50],ecx
 10bb1f5:	8a 44 24 1c          	mov    al,BYTE PTR [rsp+0x1c]
 10bb1f9:	88 43 54             	mov    BYTE PTR [rbx+0x54],al
 10bb1fc:	4c 89 f7             	mov    rdi,r14
 10bb1ff:	e8 04 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10bb204:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bb209:	e8 22 bb 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10bb20e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb215:	00 00
 10bb217:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10bb21c:	75 35                	jne    10bb253 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282669>
 10bb21e:	48 83 c4 48          	add    rsp,0x48
 10bb222:	5b                   	pop    rbx
 10bb223:	41 5e                	pop    r14
 10bb225:	c3                   	ret
 10bb226:	48 89 c3             	mov    rbx,rax
 10bb229:	4c 89 f7             	mov    rdi,r14
 10bb22c:	e8 d7 f7 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10bb231:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bb236:	e8 f5 ba 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10bb23b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb242:	00 00
 10bb244:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10bb249:	75 08                	jne    10bb253 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282669>
 10bb24b:	48 89 df             	mov    rdi,rbx
 10bb24e:	e8 7d 4a 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bb253:	e8 58 48 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb258:	55                   	push   rbp
 10bb259:	41 57                	push   r15
 10bb25b:	41 56                	push   r14
 10bb25d:	41 55                	push   r13
 10bb25f:	41 54                	push   r12
 10bb261:	53                   	push   rbx
 10bb262:	48 81 ec e8 07 00 00 	sub    rsp,0x7e8
 10bb269:	4c 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],r9
 10bb26e:	89 4c 24 34          	mov    DWORD PTR [rsp+0x34],ecx
 10bb272:	48 89 fb             	mov    rbx,rdi
 10bb275:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb27c:	00 00
 10bb27e:	48 89 84 24 e0 07 00 	mov    QWORD PTR [rsp+0x7e0],rax
 10bb285:	00
 10bb286:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 10bb28b:	0f 57 c0             	xorps  xmm0,xmm0
 10bb28e:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
 10bb295:	00 00
 10bb297:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 10bb29a:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
 10bb29f:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
 10bb2a4:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10bb2a7:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 10bb2ab:	4c 8b 2a             	mov    r13,QWORD PTR [rdx]
 10bb2ae:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
 10bb2b2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10bb2b7:	49 39 c5             	cmp    r13,rax
 10bb2ba:	0f 84 49 0d 00 00    	je     10bc009 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28341f>
 10bb2c0:	4c 89 44 24 48       	mov    QWORD PTR [rsp+0x48],r8
 10bb2c5:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
 10bb2ca:	48 8d 43 10          	lea    rax,[rbx+0x10]
 10bb2ce:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10bb2d3:	b8 a8 00 00 00       	mov    eax,0xa8
 10bb2d8:	4c 8d b4 24 90 06 00 	lea    r14,[rsp+0x690]
 10bb2df:	00
 10bb2e0:	49 8d 0c 06          	lea    rcx,[r14+rax*1]
 10bb2e4:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
 10bb2e9:	48 8d 8c 24 80 03 00 	lea    rcx,[rsp+0x380]
 10bb2f0:	00
 10bb2f1:	48 01 c8             	add    rax,rcx
 10bb2f4:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 10bb2f9:	31 ed                	xor    ebp,ebp
 10bb2fb:	48 8d 9c 24 88 00 00 	lea    rbx,[rsp+0x88]
 10bb302:	00
 10bb303:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
 10bb307:	4c 8d a4 24 50 06 00 	lea    r12,[rsp+0x650]
 10bb30e:	00
 10bb30f:	c7 44 24 14 00 00 00 	mov    DWORD PTR [rsp+0x14],0x0
 10bb316:	00
 10bb317:	4c 89 ef             	mov    rdi,r13
 10bb31a:	e8 c3 fe 49 00       	call   155b1e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a0766>
 10bb31f:	84 c0                	test   al,al
 10bb321:	0f 84 3c 02 00 00    	je     10bb563 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282979>
 10bb327:	31 ed                	xor    ebp,ebp
 10bb329:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10bb32e:	4c 89 f7             	mov    rdi,r14
 10bb331:	44 0f b6 30          	movzx  r14d,BYTE PTR [rax]
 10bb335:	ba fc 00 00 00       	mov    edx,0xfc
 10bb33a:	31 f6                	xor    esi,esi
 10bb33c:	e8 4f 38 73 00       	call   17eeb90 <memset@plt>
 10bb341:	0f b6 4c 24 34       	movzx  ecx,BYTE PTR [rsp+0x34]
 10bb346:	48 89 df             	mov    rdi,rbx
 10bb349:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
 10bb34d:	4c 89 ea             	mov    rdx,r13
 10bb350:	89 4c 24 18          	mov    DWORD PTR [rsp+0x18],ecx
 10bb354:	45 89 f0             	mov    r8d,r14d
 10bb357:	e8 30 1e 00 00       	call   10bd18c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2845a2>
 10bb35c:	48 83 bc 24 98 00 00 	cmp    QWORD PTR [rsp+0x98],0x0
 10bb363:	00 00
 10bb365:	0f 84 52 03 00 00    	je     10bb6bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282ad3>
 10bb36b:	48 89 df             	mov    rdi,rbx
 10bb36e:	be ef 00 00 00       	mov    esi,0xef
 10bb373:	e8 46 26 ce ff       	call   d9d9be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6aa44>
 10bb378:	84 c0                	test   al,al
 10bb37a:	4c 8d b4 24 90 06 00 	lea    r14,[rsp+0x690]
 10bb381:	00
 10bb382:	0f 84 e1 00 00 00    	je     10bb469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28287f>
 10bb388:	48 83 a4 24 f0 02 00 	and    QWORD PTR [rsp+0x2f0],0x0
 10bb38f:	00 00
 10bb391:	48 8d 05 40 a6 7b 00 	lea    rax,[rip+0x7ba640]        # 18759d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320c0>
 10bb398:	48 89 84 24 e8 02 00 	mov    QWORD PTR [rsp+0x2e8],rax
 10bb39f:	00
 10bb3a0:	0f 57 c0             	xorps  xmm0,xmm0
 10bb3a3:	48 8d 84 24 f8 02 00 	lea    rax,[rsp+0x2f8]
 10bb3aa:	00
 10bb3ab:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
 10bb3af:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
 10bb3b3:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10bb3b6:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 10bb3ba:	4c 8b 70 68          	mov    r14,QWORD PTR [rax+0x68]
 10bb3be:	4c 89 ef             	mov    rdi,r13
 10bb3c1:	e8 70 04 9c ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bb3c6:	49 89 d0             	mov    r8,rdx
 10bb3c9:	4d 8b 16             	mov    r10,QWORD PTR [r14]
 10bb3cc:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
 10bb3d3:	00
 10bb3d4:	4c 89 f6             	mov    rsi,r14
 10bb3d7:	ba ef 00 00 00       	mov    edx,0xef
 10bb3dc:	48 89 c1             	mov    rcx,rax
 10bb3df:	4c 8d 8c 24 e8 02 00 	lea    r9,[rsp+0x2e8]
 10bb3e6:	00
 10bb3e7:	41 ff 52 38          	call   QWORD PTR [r10+0x38]
 10bb3eb:	80 bc 24 80 04 00 00 	cmp    BYTE PTR [rsp+0x480],0x0
 10bb3f2:	00
 10bb3f3:	4c 8d b4 24 90 06 00 	lea    r14,[rsp+0x690]
 10bb3fa:	00
 10bb3fb:	74 52                	je     10bb44f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282865>
 10bb3fd:	48 8b b4 24 18 03 00 	mov    rsi,QWORD PTR [rsp+0x318]
```
## 10bb258 larger method `0x10bb258`

```text
 10bb1ef:	0f 42 c8             	cmovb  ecx,eax
 10bb1f2:	89 4b 50             	mov    DWORD PTR [rbx+0x50],ecx
 10bb1f5:	8a 44 24 1c          	mov    al,BYTE PTR [rsp+0x1c]
 10bb1f9:	88 43 54             	mov    BYTE PTR [rbx+0x54],al
 10bb1fc:	4c 89 f7             	mov    rdi,r14
 10bb1ff:	e8 04 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10bb204:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bb209:	e8 22 bb 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10bb20e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb215:	00 00
 10bb217:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10bb21c:	75 35                	jne    10bb253 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282669>
 10bb21e:	48 83 c4 48          	add    rsp,0x48
 10bb222:	5b                   	pop    rbx
 10bb223:	41 5e                	pop    r14
 10bb225:	c3                   	ret
 10bb226:	48 89 c3             	mov    rbx,rax
 10bb229:	4c 89 f7             	mov    rdi,r14
 10bb22c:	e8 d7 f7 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
 10bb231:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bb236:	e8 f5 ba 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10bb23b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb242:	00 00
 10bb244:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 10bb249:	75 08                	jne    10bb253 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282669>
 10bb24b:	48 89 df             	mov    rdi,rbx
 10bb24e:	e8 7d 4a 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bb253:	e8 58 48 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb258:	55                   	push   rbp
 10bb259:	41 57                	push   r15
 10bb25b:	41 56                	push   r14
 10bb25d:	41 55                	push   r13
 10bb25f:	41 54                	push   r12
 10bb261:	53                   	push   rbx
 10bb262:	48 81 ec e8 07 00 00 	sub    rsp,0x7e8
 10bb269:	4c 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],r9
 10bb26e:	89 4c 24 34          	mov    DWORD PTR [rsp+0x34],ecx
 10bb272:	48 89 fb             	mov    rbx,rdi
 10bb275:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bb27c:	00 00
 10bb27e:	48 89 84 24 e0 07 00 	mov    QWORD PTR [rsp+0x7e0],rax
 10bb285:	00
 10bb286:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 10bb28b:	0f 57 c0             	xorps  xmm0,xmm0
 10bb28e:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
 10bb295:	00 00
 10bb297:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 10bb29a:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
 10bb29f:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
 10bb2a4:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10bb2a7:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 10bb2ab:	4c 8b 2a             	mov    r13,QWORD PTR [rdx]
 10bb2ae:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
 10bb2b2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10bb2b7:	49 39 c5             	cmp    r13,rax
 10bb2ba:	0f 84 49 0d 00 00    	je     10bc009 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28341f>
 10bb2c0:	4c 89 44 24 48       	mov    QWORD PTR [rsp+0x48],r8
 10bb2c5:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
 10bb2ca:	48 8d 43 10          	lea    rax,[rbx+0x10]
 10bb2ce:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 10bb2d3:	b8 a8 00 00 00       	mov    eax,0xa8
 10bb2d8:	4c 8d b4 24 90 06 00 	lea    r14,[rsp+0x690]
 10bb2df:	00
 10bb2e0:	49 8d 0c 06          	lea    rcx,[r14+rax*1]
 10bb2e4:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
 10bb2e9:	48 8d 8c 24 80 03 00 	lea    rcx,[rsp+0x380]
 10bb2f0:	00
 10bb2f1:	48 01 c8             	add    rax,rcx
 10bb2f4:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 10bb2f9:	31 ed                	xor    ebp,ebp
 10bb2fb:	48 8d 9c 24 88 00 00 	lea    rbx,[rsp+0x88]
 10bb302:	00
 10bb303:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
 10bb307:	4c 8d a4 24 50 06 00 	lea    r12,[rsp+0x650]
 10bb30e:	00
 10bb30f:	c7 44 24 14 00 00 00 	mov    DWORD PTR [rsp+0x14],0x0
 10bb316:	00
 10bb317:	4c 89 ef             	mov    rdi,r13
 10bb31a:	e8 c3 fe 49 00       	call   155b1e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a0766>
 10bb31f:	84 c0                	test   al,al
 10bb321:	0f 84 3c 02 00 00    	je     10bb563 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282979>
 10bb327:	31 ed                	xor    ebp,ebp
 10bb329:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10bb32e:	4c 89 f7             	mov    rdi,r14
 10bb331:	44 0f b6 30          	movzx  r14d,BYTE PTR [rax]
 10bb335:	ba fc 00 00 00       	mov    edx,0xfc
 10bb33a:	31 f6                	xor    esi,esi
 10bb33c:	e8 4f 38 73 00       	call   17eeb90 <memset@plt>
 10bb341:	0f b6 4c 24 34       	movzx  ecx,BYTE PTR [rsp+0x34]
 10bb346:	48 89 df             	mov    rdi,rbx
 10bb349:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
 10bb34d:	4c 89 ea             	mov    rdx,r13
 10bb350:	89 4c 24 18          	mov    DWORD PTR [rsp+0x18],ecx
 10bb354:	45 89 f0             	mov    r8d,r14d
 10bb357:	e8 30 1e 00 00       	call   10bd18c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2845a2>
 10bb35c:	48 83 bc 24 98 00 00 	cmp    QWORD PTR [rsp+0x98],0x0
 10bb363:	00 00
 10bb365:	0f 84 52 03 00 00    	je     10bb6bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282ad3>
 10bb36b:	48 89 df             	mov    rdi,rbx
 10bb36e:	be ef 00 00 00       	mov    esi,0xef
 10bb373:	e8 46 26 ce ff       	call   d9d9be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6aa44>
 10bb378:	84 c0                	test   al,al
 10bb37a:	4c 8d b4 24 90 06 00 	lea    r14,[rsp+0x690]
 10bb381:	00
 10bb382:	0f 84 e1 00 00 00    	je     10bb469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28287f>
 10bb388:	48 83 a4 24 f0 02 00 	and    QWORD PTR [rsp+0x2f0],0x0
 10bb38f:	00 00
 10bb391:	48 8d 05 40 a6 7b 00 	lea    rax,[rip+0x7ba640]        # 18759d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320c0>
 10bb398:	48 89 84 24 e8 02 00 	mov    QWORD PTR [rsp+0x2e8],rax
 10bb39f:	00
 10bb3a0:	0f 57 c0             	xorps  xmm0,xmm0
 10bb3a3:	48 8d 84 24 f8 02 00 	lea    rax,[rsp+0x2f8]
 10bb3aa:	00
 10bb3ab:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
 10bb3af:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
 10bb3b3:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 10bb3b6:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
 10bb3ba:	4c 8b 70 68          	mov    r14,QWORD PTR [rax+0x68]
 10bb3be:	4c 89 ef             	mov    rdi,r13
 10bb3c1:	e8 70 04 9c ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bb3c6:	49 89 d0             	mov    r8,rdx
 10bb3c9:	4d 8b 16             	mov    r10,QWORD PTR [r14]
 10bb3cc:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
 10bb3d3:	00
 10bb3d4:	4c 89 f6             	mov    rsi,r14
 10bb3d7:	ba ef 00 00 00       	mov    edx,0xef
 10bb3dc:	48 89 c1             	mov    rcx,rax
 10bb3df:	4c 8d 8c 24 e8 02 00 	lea    r9,[rsp+0x2e8]
 10bb3e6:	00
 10bb3e7:	41 ff 52 38          	call   QWORD PTR [r10+0x38]
 10bb3eb:	80 bc 24 80 04 00 00 	cmp    BYTE PTR [rsp+0x480],0x0
 10bb3f2:	00
 10bb3f3:	4c 8d b4 24 90 06 00 	lea    r14,[rsp+0x690]
 10bb3fa:	00
 10bb3fb:	74 52                	je     10bb44f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282865>
 10bb3fd:	48 8b b4 24 18 03 00 	mov    rsi,QWORD PTR [rsp+0x318]
 10bb404:	00
 10bb405:	4c 89 e7             	mov    rdi,r12
 10bb408:	e8 b6 35 29 00       	call   134e9c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x193f47>
 10bb40d:	4c 8d bc 24 80 03 00 	lea    r15,[rsp+0x380]
 10bb414:	00
 10bb415:	4c 89 ff             	mov    rdi,r15
 10bb418:	4c 89 e6             	mov    rsi,r12
 10bb41b:	e8 d6 2e 00 00       	call   10be2f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28570c>
 10bb420:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 10bb425:	4c 89 fe             	mov    rsi,r15
 10bb428:	e8 67 2f 00 00       	call   10be394 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2857aa>
 10bb42d:	48 8d bc 24 88 03 00 	lea    rdi,[rsp+0x388]
 10bb434:	00
 10bb435:	e8 02 30 00 00       	call   10be43c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285852>
 10bb43a:	48 8d bc 24 58 06 00 	lea    rdi,[rsp+0x658]
 10bb441:	00
 10bb442:	e8 05 30 00 00       	call   10be44c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285862>
 10bb447:	48 8d 9c 24 88 00 00 	lea    rbx,[rsp+0x88]
 10bb44e:	00
 10bb44f:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]
 10bb456:	00
 10bb457:	e8 34 2a 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bb45c:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
 10bb463:	00
 10bb464:	e8 af 60 3c 00       	call   1481518 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6a9c>
 10bb469:	48 89 df             	mov    rdi,rbx
 10bb46c:	6a 0a                	push   0xa
 10bb46e:	5e                   	pop    rsi
 10bb46f:	e8 4a 25 ce ff       	call   d9d9be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6aa44>
 10bb474:	84 c0                	test   al,al
 10bb476:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
 10bb47a:	0f 84 76 02 00 00    	je     10bb6f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282b0c>
 10bb480:	4c 8d bc 24 80 04 00 	lea    r15,[rsp+0x480]
 10bb487:	00
 10bb488:	4c 89 ff             	mov    rdi,r15
 10bb48b:	e8 24 2a b5 ff       	call   c0deb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15ae54>
 10bb490:	4d 8b 74 24 68       	mov    r14,QWORD PTR [r12+0x68]
 10bb495:	4c 89 ef             	mov    rdi,r13
 10bb498:	e8 99 03 9c ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bb49d:	49 89 d0             	mov    r8,rdx
 10bb4a0:	4d 8b 16             	mov    r10,QWORD PTR [r14]
 10bb4a3:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
 10bb4aa:	00
 10bb4ab:	4c 89 f6             	mov    rsi,r14
 10bb4ae:	6a 0a                	push   0xa
 10bb4b0:	5a                   	pop    rdx
 10bb4b1:	48 89 c1             	mov    rcx,rax
 10bb4b4:	4d 89 f9             	mov    r9,r15
 10bb4b7:	41 ff 52 38          	call   QWORD PTR [r10+0x38]
 10bb4bb:	80 bc 24 30 02 00 00 	cmp    BYTE PTR [rsp+0x230],0x0
 10bb4c2:	00
 10bb4c3:	4c 8d b4 24 90 06 00 	lea    r14,[rsp+0x690]
 10bb4ca:	00
 10bb4cb:	0f 84 0b 02 00 00    	je     10bb6dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282af2>
 10bb4d1:	80 bc 24 38 02 00 00 	cmp    BYTE PTR [rsp+0x238],0x1
 10bb4d8:	01
 10bb4d9:	0f 85 fd 01 00 00    	jne    10bb6dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282af2>
 10bb4df:	4c 89 e3             	mov    rbx,r12
 10bb4e2:	4c 8d a4 24 e8 02 00 	lea    r12,[rsp+0x2e8]
 10bb4e9:	00
 10bb4ea:	4c 89 e7             	mov    rdi,r12
 10bb4ed:	48 8d b4 24 80 04 00 	lea    rsi,[rsp+0x480]
```
## Field updates / virtual calls in reader methods

| addr | instruction |
|---:|---|
| `0x10bb0c9` | `10bb0c9:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]` |
| `0x10bb0d8` | `10bb0d8:	8a 47 54             	mov    al,BYTE PTR [rdi+0x54]` |
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |
| `0x10bb0f8` | `10bb0f8:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0x10bb10a` | `10bb10a:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10bb186` | `10bb186:	48 8b 77 60          	mov    rsi,QWORD PTR [rdi+0x60]` |
| `0x10bb19c` | `10bb19c:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10bb1ae` | `10bb1ae:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0` |
| `0x10bb1f2` | `10bb1f2:	89 4b 50             	mov    DWORD PTR [rbx+0x50],ecx` |
| `0x10bb1f9` | `10bb1f9:	88 43 54             	mov    BYTE PTR [rbx+0x54],al` |

