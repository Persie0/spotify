# Restrictions 0x184d5d0 caller / method-index bridge v9

Focus: relate AP `0x184d5d0` entries that read `+0x60` back to method-table indexes and downstream call shape. Static analysis only; no patching or runtime modification.

## AP entries around 0x184d5d0

```text
000000000184d5d0  0000000000000008 R_X86_64_RELATIVE                         a3fa60
000000000184d5d8  0000000000000008 R_X86_64_RELATIVE                         10ba7ca
000000000184d5e0  0000000000000008 R_X86_64_RELATIVE                         10ba802
000000000184d5e8  0000000000000008 R_X86_64_RELATIVE                         10ba86e
000000000184d5f0  0000000000000008 R_X86_64_RELATIVE                         10ba802
000000000184d5f8  0000000000000008 R_X86_64_RELATIVE                         10ba8a6
000000000184d600  0000000000000008 R_X86_64_RELATIVE                         10ba8de
000000000184d608  0000000000000008 R_X86_64_RELATIVE                         10ba93e
000000000184d610  0000000000000008 R_X86_64_RELATIVE                         10ba976
000000000184d618  0000000000000008 R_X86_64_RELATIVE                         10ba98e
000000000184d620  0000000000000008 R_X86_64_RELATIVE                         10ba9c6
000000000184d628  0000000000000008 R_X86_64_RELATIVE                         10baa26
000000000184d630  0000000000000008 R_X86_64_RELATIVE                         10baa5e
000000000184d638  0000000000000008 R_X86_64_RELATIVE                         10baab4
000000000184d640  0000000000000008 R_X86_64_RELATIVE                         10baaec
000000000184d648  0000000000000008 R_X86_64_RELATIVE                         10bab3c
000000000184d650  0000000000000008 R_X86_64_RELATIVE                         10ba976
000000000184d658  0000000000000008 R_X86_64_RELATIVE                         10bab76
000000000184d660  0000000000000008 R_X86_64_RELATIVE                         10babb0
000000000184d668  0000000000000008 R_X86_64_RELATIVE                         10bac0a
000000000184d670  0000000000000008 R_X86_64_RELATIVE                         10bac44
000000000184d678  0000000000000008 R_X86_64_RELATIVE                         10bac9e
000000000184d680  0000000000000008 R_X86_64_RELATIVE                         10bacd8
000000000184d688  0000000000000008 R_X86_64_RELATIVE                         10bad36
000000000184d690  0000000000000008 R_X86_64_RELATIVE                         10bad7c
000000000184d698  0000000000000008 R_X86_64_RELATIVE                         10bad8a
000000000184d6a0  0000000000000008 R_X86_64_RELATIVE                         10badc4
000000000184d6a8  0000000000000008 R_X86_64_RELATIVE                         10badde
000000000184d6b0  0000000000000008 R_X86_64_RELATIVE                         10bae18
000000000184d6b8  0000000000000008 R_X86_64_RELATIVE                         10bae1e
000000000184d6c0  0000000000000008 R_X86_64_RELATIVE                         10badc4
000000000184d6c8  0000000000000008 R_X86_64_RELATIVE                         10bae58
000000000184d6d0  0000000000000008 R_X86_64_RELATIVE                         10bae60
000000000184d6d8  0000000000000008 R_X86_64_RELATIVE                         10bae9a
000000000184d6e0  0000000000000008 R_X86_64_RELATIVE                         10baf08
000000000184d6e8  0000000000000008 R_X86_64_RELATIVE                         10baf5c
000000000184d6f0  0000000000000008 R_X86_64_RELATIVE                         10baf96
000000000184d6f8  0000000000000008 R_X86_64_RELATIVE                         10bb002
000000000184d700  0000000000000008 R_X86_64_RELATIVE                         10bb008
000000000184d708  0000000000000008 R_X86_64_RELATIVE                         10bb00e
000000000184d710  0000000000000008 R_X86_64_RELATIVE                         10bb02a
000000000184d718  0000000000000008 R_X86_64_RELATIVE                         10bb034
000000000184d720  0000000000000008 R_X86_64_RELATIVE                         10bb09e
000000000184d728  0000000000000008 R_X86_64_RELATIVE                         10bb16e
000000000184d730  0000000000000008 R_X86_64_RELATIVE                         10bb258
000000000184d738  0000000000000008 R_X86_64_RELATIVE                         10bc22a
000000000184d740  0000000000000008 R_X86_64_RELATIVE                         10bc6aa
000000000184d748  0000000000000008 R_X86_64_RELATIVE                         10bc716
000000000184d750  0000000000000008 R_X86_64_RELATIVE                         10bcfda
000000000184d758  0000000000000008 R_X86_64_RELATIVE                         10bcfe8
000000000184d760  0000000000000008 R_X86_64_RELATIVE                         10bcff0
000000000184d768  0000000000000008 R_X86_64_RELATIVE                         10bcff8
000000000184d770  0000000000000008 R_X86_64_RELATIVE                         10bd000
000000000184d778  0000000000000008 R_X86_64_RELATIVE                         10bd004
000000000184d780  0000000000000008 R_X86_64_RELATIVE                         10bd008
000000000184d788  0000000000000008 R_X86_64_RELATIVE                         10bd00c
000000000184d790  0000000000000008 R_X86_64_RELATIVE                         10bd010
000000000184d798  0000000000000008 R_X86_64_RELATIVE                         10bd014
000000000184d7a0  0000000000000008 R_X86_64_RELATIVE                         10bd038
000000000184d7a8  0000000000000008 R_X86_64_RELATIVE                         10bd098
000000000184d7c0  0000000000000008 R_X86_64_RELATIVE                         aaa9b2
000000000184d7c8  0000000000000008 R_X86_64_RELATIVE                         aaa9bc
000000000184d7d0  0000000000000008 R_X86_64_RELATIVE                         174ec6a
000000000184d7d8  0000000000000008 R_X86_64_RELATIVE                         174f1dc
000000000184d7e0  0000000000000008 R_X86_64_RELATIVE                         10be91e
000000000184d7e8  0000000000000008 R_X86_64_RELATIVE                         174ef82
```
## AP entry `0x150` -> `0x10bb09e`

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
```
## AP entry `0x158` -> `0x10bb16e`

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
```
## AP entry `0x160` -> `0x10bb258`

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
```
## Text mentions / materializations

| addr | instruction |
|---:|---|
| `0x10ad19e` | `10ad19e:	48 8d 05 2b 04 7a 00 	lea    rax,[rip+0x7a042b]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>` |
| `0x10bb09e` | `10bb09e:	41 56                	push   r14` |
| `0x10bb16e` | `10bb16e:	41 56                	push   r14` |
| `0x10bb258` | `10bb258:	55                   	push   rbp` |
| `0x10bd03c` | `10bd03c:	48 8d 05 8d 05 79 00 	lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>` |

## Candidate method-index / +0x60 hits

| addr | instruction |
|---:|---|
| `0x9d864b` | `9d864b:	66 0f d4 d0          	paddq  xmm2,xmm0` |
| `0x9d864f` | `9d864f:	f3 0f 6f 47 50       	movdqu xmm0,XMMWORD PTR [rdi+0x50]` |
| `0x9d8654` | `9d8654:	66 0f d4 c3          	paddq  xmm0,xmm3` |
| `0x9d8658` | `9d8658:	66 0f d4 c4          	paddq  xmm0,xmm4` |
| `0x9d865c` | `9d865c:	f3 0f 6f 5f 60       	movdqu xmm3,XMMWORD PTR [rdi+0x60]` |
| `0x9d8661` | `9d8661:	66 0f d4 d9          	paddq  xmm3,xmm1` |
| `0x9d8665` | `9d8665:	66 0f d4 da          	paddq  xmm3,xmm2` |
| `0x9d8669` | `9d8669:	66 0f d4 d8          	paddq  xmm3,xmm0` |
| `0x9d866d` | `9d866d:	66 0f 70 c3 ee       	pshufd xmm0,xmm3,0xee` |
| `0x9d8672` | `9d8672:	66 0f d4 c3          	paddq  xmm0,xmm3` |
| `0x9d8676` | `9d8676:	66 48 0f 7e c0       	movq   rax,xmm0` |
| `0x9d867b` | `9d867b:	c3                   	ret` |
| `0x9d93f2` | `9d93f2:	41 54                	push   r12` |
| `0x9d93f4` | `9d93f4:	ff 10                	call   QWORD PTR [rax]` |
| `0x9d93f6` | `9d93f6:	4d 89 ec             	mov    r12,r13` |
| `0x9d93f9` | `9d93f9:	48 83 c4 10          	add    rsp,0x10` |
| `0x9d93fd` | `9d93fd:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax` |
| `0x9d9401` | `9d9401:	45 85 e4             	test   r12d,r12d` |
| `0x9d9404` | `9d9404:	74 4b                	je     9d9451 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x1281>` |
| `0x9d9406` | `9d9406:	89 e8                	mov    eax,ebp` |
| `0x9d9408` | `9d9408:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0x9d940d` | `9d940d:	45 31 ed             	xor    r13d,r13d` |
| `0x9d9410` | `9d9410:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0x9d9414` | `9d9414:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x9e545c` | `9e545c:	6a 00                	push   0x0` |
| `0x9e545e` | `9e545e:	41 52                	push   r10` |
| `0x9e5460` | `9e5460:	ff 10                	call   QWORD PTR [rax]` |
| `0x9e5462` | `9e5462:	48 83 c4 10          	add    rsp,0x10` |
| `0x9e5466` | `9e5466:	49 89 84 24 50 01 00 	mov    QWORD PTR [r12+0x150],rax` |
| `0x9e546d` | `9e546d:	00` |
| `0x9e546e` | `9e546e:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x9e5471` | `9e5471:	48 63 4b 08          	movsxd rcx,DWORD PTR [rbx+0x8]` |
| `0x9e5475` | `9e5475:	49 63 d5             	movsxd rdx,r13d` |
| `0x9e5478` | `9e5478:	48 0f af d1          	imul   rdx,rcx` |
| `0x9e547c` | `9e547c:	b9 04 00 00 00       	mov    ecx,0x4` |
| `0x9e5481` | `9e5481:	4c 89 ff             	mov    rdi,r15` |
| `0x9e5494` | `9e5494:	48 8d 1d aa 52 95 ff 	lea    rbx,[rip+0xffffffffff9552aa]        # 33a745 <_ZTSSt12bad_any_cast@@Base-0x55a83>` |
| `0x9e549b` | `9e549b:	53                   	push   rbx` |
| `0x9e549c` | `9e549c:	ff 10                	call   QWORD PTR [rax]` |
| `0x9e549e` | `9e549e:	48 83 c4 10          	add    rsp,0x10` |
| `0x9e54a2` | `9e54a2:	49 89 84 24 58 01 00 	mov    QWORD PTR [r12+0x158],rax` |
| `0x9e54a9` | `9e54a9:	00` |
| `0x9e54aa` | `9e54aa:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0x9e54ad` | `9e54ad:	48 63 d5             	movsxd rdx,ebp` |
| `0x9e54b0` | `9e54b0:	b9 10 00 00 00       	mov    ecx,0x10` |
| `0x9e54b5` | `9e54b5:	4c 89 ff             	mov    rdi,r15` |
| `0x9e54b8` | `9e54b8:	31 f6                	xor    esi,esi` |
| `0x9e54ba` | `9e54ba:	41 b8 02 00 00 00    	mov    r8d,0x2` |
| `0x9e5df0` | `9e5df0:	48 63 d0             	movsxd rdx,eax` |
| `0x9e5df3` | `9e5df3:	0f af c5             	imul   eax,ebp` |
| `0x9e5df6` | `9e5df6:	48 63 f8             	movsxd rdi,eax` |
| `0x9e5df9` | `9e5df9:	48 c1 e7 02          	shl    rdi,0x2` |
| `0x9e5dfd` | `9e5dfd:	49 03 bc 24 58 01 00 	add    rdi,QWORD PTR [r12+0x158]` |
| `0x9e5e04` | `9e5e04:	00` |
| `0x9e5e05` | `9e5e05:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0x9e5e09` | `9e5e09:	49 8b 8c 24 70 01 00 	mov    rcx,QWORD PTR [r12+0x170]` |
| `0x9e5e10` | `9e5e10:	00` |
| `0x9e5e11` | `9e5e11:	48 63 0c 19          	movsxd rcx,DWORD PTR [rcx+rbx*1]` |
| `0x9e5e15` | `9e5e15:	48 8b 34 c8          	mov    rsi,QWORD PTR [rax+rcx*8]` |
| `0x9e5e19` | `9e5e19:	48 c1 e2 02          	shl    rdx,0x2` |
| `0x9e5e26` | `9e5e26:	89 c1                	mov    ecx,eax` |
| `0x9e5e28` | `9e5e28:	0f af cd             	imul   ecx,ebp` |
| `0x9e5e2b` | `9e5e2b:	48 63 c9             	movsxd rcx,ecx` |
| `0x9e5e2e` | `9e5e2e:	48 c1 e1 02          	shl    rcx,0x2` |
| `0x9e5e32` | `9e5e32:	49 03 8c 24 58 01 00 	add    rcx,QWORD PTR [r12+0x158]` |
| `0x9e5e39` | `9e5e39:	00` |
| `0x9e5e3a` | `9e5e3a:	49 8b 94 24 48 01 00 	mov    rdx,QWORD PTR [r12+0x148]` |
| `0x9e5e41` | `9e5e41:	00` |
| `0x9e5e42` | `9e5e42:	49 8b b4 24 70 01 00 	mov    rsi,QWORD PTR [r12+0x170]` |
| `0x9e5e49` | `9e5e49:	00` |
| `0x9e5e4a` | `9e5e4a:	48 63 34 1e          	movsxd rsi,DWORD PTR [rsi+rbx*1]` |
| `0x9e5e4e` | `9e5e4e:	48 89 0c f2          	mov    QWORD PTR [rdx+rsi*8],rcx` |
| `0x9e5f3b` | `9e5f3b:	83 e5 fe             	and    ebp,0xfffffffe` |
| `0x9e5f3e` | `9e5f3e:	31 db                	xor    ebx,ebx` |
| `0x9e5f40` | `9e5f40:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0x9e5f44` | `9e5f44:	48 8b 04 d8          	mov    rax,QWORD PTR [rax+rbx*8]` |
| `0x9e5f48` | `9e5f48:	49 8b 8c 24 50 01 00 	mov    rcx,QWORD PTR [r12+0x150]` |
| `0x9e5f4f` | `9e5f4f:	00` |
| `0x9e5f50` | `9e5f50:	48 89 04 d9          	mov    QWORD PTR [rcx+rbx*8],rax` |
| `0x9e5f54` | `9e5f54:	49 8b 84 24 50 01 00 	mov    rax,QWORD PTR [r12+0x150]` |
| `0x9e5f5b` | `9e5f5b:	00` |
| `0x9e5f5c` | `9e5f5c:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]` |
| `0x9e5f60` | `9e5f60:	49 63 56 04          	movsxd rdx,DWORD PTR [r14+0x4]` |
| `0x9e5f64` | `9e5f64:	48 c1 e2 02          	shl    rdx,0x2` |
| `0x9e5f68` | `9e5f68:	31 f6                	xor    esi,esi` |
| `0x9e5f6a` | `9e5f6a:	e8 21 8c e0 00       	call   17eeb90 <memset@plt>` |
| `0x9e5f6f` | `9e5f6f:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0x9e5f73` | `9e5f73:	48 8b 44 d8 08       	mov    rax,QWORD PTR [rax+rbx*8+0x8]` |
| `0x9e5f78` | `9e5f78:	49 8b 8c 24 50 01 00 	mov    rcx,QWORD PTR [r12+0x150]` |
| `0x9e5f7f` | `9e5f7f:	00` |
| `0x9e5f80` | `9e5f80:	48 89 44 d9 08       	mov    QWORD PTR [rcx+rbx*8+0x8],rax` |
| `0x9e5f85` | `9e5f85:	49 8b 84 24 50 01 00 	mov    rax,QWORD PTR [r12+0x150]` |
| `0x9e5f8c` | `9e5f8c:	00` |
| `0x9e5f8d` | `9e5f8d:	48 8b 7c d8 08       	mov    rdi,QWORD PTR [rax+rbx*8+0x8]` |
| `0x9e5f92` | `9e5f92:	49 63 56 04          	movsxd rdx,DWORD PTR [r14+0x4]` |
| `0x9e5f96` | `9e5f96:	48 c1 e2 02          	shl    rdx,0x2` |
| `0x9e5f9a` | `9e5f9a:	31 f6                	xor    esi,esi` |
| `0x9e5f9c` | `9e5f9c:	e8 ef 8b e0 00       	call   17eeb90 <memset@plt>` |
| `0x9e5fa1` | `9e5fa1:	48 83 c3 02          	add    rbx,0x2` |
| `0x9e5faa` | `9e5faa:	41 f6 c5 01          	test   r13b,0x1` |
| `0x9e5fae` | `9e5fae:	0f 84 05 01 00 00    	je     9e60b9 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xdee9>` |
| `0x9e5fb4` | `9e5fb4:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0x9e5fb8` | `9e5fb8:	48 8b 04 d8          	mov    rax,QWORD PTR [rax+rbx*8]` |
| `0x9e5fbc` | `9e5fbc:	49 8b 8c 24 50 01 00 	mov    rcx,QWORD PTR [r12+0x150]` |
| `0x9e5fc3` | `9e5fc3:	00` |
| `0x9e5fc4` | `9e5fc4:	48 89 04 d9          	mov    QWORD PTR [rcx+rbx*8],rax` |
| `0x9e5fc8` | `9e5fc8:	49 8b 84 24 50 01 00 	mov    rax,QWORD PTR [r12+0x150]` |
| `0x9e5fcf` | `9e5fcf:	00` |
| `0x9e5fd0` | `9e5fd0:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]` |
| `0x9e5fd4` | `9e5fd4:	49 63 56 04          	movsxd rdx,DWORD PTR [r14+0x4]` |
| `0x9e5fd8` | `9e5fd8:	e9 d1 00 00 00       	jmp    9e60ae <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xdede>` |
| `0x9e5fdd` | `9e5fdd:	45 89 ef             	mov    r15d,r13d` |
| `0x9e5fe0` | `9e5fe0:	41 83 e7 fe          	and    r15d,0xfffffffe` |
| `0x9e5fe4` | `9e5fe4:	31 db                	xor    ebx,ebx` |
| `0x9e5ff4` | `9e5ff4:	48 63 eb             	movsxd rbp,ebx` |
| `0x9e5ff7` | `9e5ff7:	48 89 d0             	mov    rax,rdx` |
| `0x9e5ffa` | `9e5ffa:	48 0f af c5          	imul   rax,rbp` |
| `0x9e5ffe` | `9e5ffe:	48 c1 e0 02          	shl    rax,0x2` |
| `0x9e6002` | `9e6002:	49 03 84 24 58 01 00 	add    rax,QWORD PTR [r12+0x158]` |
| `0x9e6009` | `9e6009:	00` |
| `0x9e600a` | `9e600a:	49 8b 8c 24 50 01 00 	mov    rcx,QWORD PTR [r12+0x150]` |
| `0x9e6011` | `9e6011:	00` |
| `0x9e6012` | `9e6012:	48 89 04 d9          	mov    QWORD PTR [rcx+rbx*8],rax` |
| `0x9e6016` | `9e6016:	49 8b 84 24 50 01 00 	mov    rax,QWORD PTR [r12+0x150]` |
| `0x9e601d` | `9e601d:	00` |
| `0x9e601e` | `9e601e:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]` |
| `0x9e6022` | `9e6022:	48 c1 e2 02          	shl    rdx,0x2` |
| `0x9e6026` | `9e6026:	31 f6                	xor    esi,esi` |
| `0x9e6028` | `9e6028:	e8 63 8b e0 00       	call   17eeb90 <memset@plt>` |
| `0x9e602d` | `9e602d:	49 63 56 0c          	movsxd rdx,DWORD PTR [r14+0xc]` |
| `0x9e6031` | `9e6031:	83 c5 01             	add    ebp,0x1` |
| `0x9e6034` | `9e6034:	48 63 c5             	movsxd rax,ebp` |
| `0x9e6037` | `9e6037:	48 0f af c2          	imul   rax,rdx` |
| `0x9e603b` | `9e603b:	48 c1 e0 02          	shl    rax,0x2` |
| `0x9e603f` | `9e603f:	49 03 84 24 58 01 00 	add    rax,QWORD PTR [r12+0x158]` |
| `0x9e6046` | `9e6046:	00` |
| `0x9e6047` | `9e6047:	49 8b 8c 24 50 01 00 	mov    rcx,QWORD PTR [r12+0x150]` |
| `0x9e604e` | `9e604e:	00` |
| `0x9e604f` | `9e604f:	48 89 44 d9 08       	mov    QWORD PTR [rcx+rbx*8+0x8],rax` |
| `0x9e6054` | `9e6054:	49 8b 84 24 50 01 00 	mov    rax,QWORD PTR [r12+0x150]` |
| `0x9e605b` | `9e605b:	00` |
| `0x9e605c` | `9e605c:	48 8b 7c d8 08       	mov    rdi,QWORD PTR [rax+rbx*8+0x8]` |
| `0x9e6061` | `9e6061:	48 c1 e2 02          	shl    rdx,0x2` |
| `0x9e6065` | `9e6065:	31 f6                	xor    esi,esi` |
| `0x9e6067` | `9e6067:	e8 24 8b e0 00       	call   17eeb90 <memset@plt>` |
| `0x9e606c` | `9e606c:	48 83 c3 02          	add    rbx,0x2` |
| `0x9e6070` | `9e6070:	49 39 df             	cmp    r15,rbx` |
| `0x9e607f` | `9e607f:	49 63 56 0c          	movsxd rdx,DWORD PTR [r14+0xc]` |
| `0x9e6083` | `9e6083:	48 63 c3             	movsxd rax,ebx` |
| `0x9e6086` | `9e6086:	48 0f af c2          	imul   rax,rdx` |
| `0x9e608a` | `9e608a:	48 c1 e0 02          	shl    rax,0x2` |
| `0x9e608e` | `9e608e:	49 03 84 24 58 01 00 	add    rax,QWORD PTR [r12+0x158]` |
| `0x9e6095` | `9e6095:	00` |
| `0x9e6096` | `9e6096:	49 8b 8c 24 50 01 00 	mov    rcx,QWORD PTR [r12+0x150]` |
| `0x9e609d` | `9e609d:	00` |
| `0x9e609e` | `9e609e:	48 89 04 d9          	mov    QWORD PTR [rcx+rbx*8],rax` |
| `0x9e60a2` | `9e60a2:	49 8b 84 24 50 01 00 	mov    rax,QWORD PTR [r12+0x150]` |
| `0x9e60a9` | `9e60a9:	00` |
| `0x9e60aa` | `9e60aa:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]` |
| `0x9e60ae` | `9e60ae:	48 c1 e2 02          	shl    rdx,0x2` |
| `0x9e60b2` | `9e60b2:	31 f6                	xor    esi,esi` |
| `0x9e60b4` | `9e60b4:	e8 d7 8a e0 00       	call   17eeb90 <memset@plt>` |
| `0x9e60b9` | `9e60b9:	41 83 bc 24 68 01 00 	cmp    DWORD PTR [r12+0x168],0x0` |
| `0x9e60c0` | `9e60c0:	00 00` |
| `0x9e6125` | `9e6125:	f3 0f 10 0c 18       	movss  xmm1,DWORD PTR [rax+rbx*1]` |
| `0x9e612a` | `9e612a:	0f 2e c8             	ucomiss xmm1,xmm0` |
| `0x9e612d` | `9e612d:	49 8b 84 24 48 01 00 	mov    rax,QWORD PTR [r12+0x148]` |
| `0x9e6134` | `9e6134:	00` |
| `0x9e6135` | `9e6135:	49 8b b4 24 50 01 00 	mov    rsi,QWORD PTR [r12+0x150]` |
| `0x9e613c` | `9e613c:	00` |
| `0x9e613d` | `9e613d:	48 8b 3c c8          	mov    rdi,QWORD PTR [rax+rcx*8]` |
| `0x9e6141` | `9e6141:	48 8b 34 d6          	mov    rsi,QWORD PTR [rsi+rdx*8]` |
| `0x9e6145` | `9e6145:	41 8b 56 04          	mov    edx,DWORD PTR [r14+0x4]` |
| `0x9e6149` | `9e6149:	b9 1b 00 00 00       	mov    ecx,0x1b` |
| `0x9e614e` | `9e614e:	75 90                	jne    9e60e0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xdf10>` |
| `0x9e6150` | `9e6150:	7a 8e                	jp     9e60e0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xdf10>` |
| `0x9e6187` | `9e6187:	66 0f 1f 84 00 00 00 	nop    WORD PTR [rax+rax*1+0x0]` |
| `0x9e618e` | `9e618e:	00 00` |
| `0x9e6190` | `9e6190:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0x9e6194` | `9e6194:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]` |
| `0x9e6198` | `9e6198:	49 8b 84 24 50 01 00 	mov    rax,QWORD PTR [r12+0x150]` |
| `0x9e619f` | `9e619f:	00` |
| `0x9e61a0` | `9e61a0:	48 8b 34 d8          	mov    rsi,QWORD PTR [rax+rbx*8]` |
| `0x9e61a4` | `9e61a4:	49 63 56 0c          	movsxd rdx,DWORD PTR [r14+0xc]` |
| `0x9e61a8` | `9e61a8:	48 c1 e2 02          	shl    rdx,0x2` |
| `0x9e61ac` | `9e61ac:	e8 1f 99 e0 00       	call   17efad0 <memcpy@plt>` |
| `0x9e61b1` | `9e61b1:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0x9e61b5` | `9e61b5:	48 8b 7c d8 08       	mov    rdi,QWORD PTR [rax+rbx*8+0x8]` |
| `0x9e61ba` | `9e61ba:	49 8b 84 24 50 01 00 	mov    rax,QWORD PTR [r12+0x150]` |
| `0x9e61c1` | `9e61c1:	00` |
| `0x9e61c2` | `9e61c2:	48 8b 74 d8 08       	mov    rsi,QWORD PTR [rax+rbx*8+0x8]` |
| `0x9e61c7` | `9e61c7:	49 63 56 0c          	movsxd rdx,DWORD PTR [r14+0xc]` |
| `0x9e61cb` | `9e61cb:	48 c1 e2 02          	shl    rdx,0x2` |
| `0x9e61cf` | `9e61cf:	e8 fc 98 e0 00       	call   17efad0 <memcpy@plt>` |
| `0x9e61d4` | `9e61d4:	48 83 c3 02          	add    rbx,0x2` |
| `0x9e61d8` | `9e61d8:	48 39 dd             	cmp    rbp,rbx` |
| `0x9e61dd` | `9e61dd:	41 f6 c5 01          	test   r13b,0x1` |
| `0x9e61e1` | `9e61e1:	74 21                	je     9e6204 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xe034>` |
| `0x9e61e3` | `9e61e3:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0x9e61e7` | `9e61e7:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]` |
| `0x9e61eb` | `9e61eb:	49 8b 84 24 50 01 00 	mov    rax,QWORD PTR [r12+0x150]` |
| `0x9e61f2` | `9e61f2:	00` |
| `0x9e61f3` | `9e61f3:	48 8b 34 d8          	mov    rsi,QWORD PTR [rax+rbx*8]` |
| `0x9e61f7` | `9e61f7:	49 63 56 0c          	movsxd rdx,DWORD PTR [r14+0xc]` |
| `0x9e61fb` | `9e61fb:	48 c1 e2 02          	shl    rdx,0x2` |
| `0x9e61ff` | `9e61ff:	e8 cc 98 e0 00       	call   17efad0 <memcpy@plt>` |
| `0x9e6204` | `9e6204:	31 c0                	xor    eax,eax` |
| `0x9e6206` | `9e6206:	e9 a1 f8 ff ff       	jmp    9e5aac <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xd8dc>` |
| `0x9e6f4e` | `9e6f4e:	00 00` |
| `0x9e6f50` | `9e6f50:	48 89 df             	mov    rdi,rbx` |
| `0x9e6f53` | `9e6f53:	4c 89 e6             	mov    rsi,r12` |
| `0x9e6f56` | `9e6f56:	e8 65 0e ff ff       	call   9d7dc0 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x850>` |
| `0x9e6f5b` | `9e6f5b:	49 8b 76 60          	mov    rsi,QWORD PTR [r14+0x60]` |
| `0x9e6f5f` | `9e6f5f:	48 01 ee             	add    rsi,rbp` |
| `0x9e6f62` | `9e6f62:	48 89 df             	mov    rdi,rbx` |
| `0x9e6f65` | `9e6f65:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]` |
| `0x9e6f6a` | `9e6f6a:	44 89 f9             	mov    ecx,r15d` |
| `0x9e6f6d` | `9e6f6d:	44 8b 44 24 0c       	mov    r8d,DWORD PTR [rsp+0xc]` |
| `0x9e6f72` | `9e6f72:	e8 79 0f 00 00       	call   9e7ef0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x340>` |
| `0x9e6f77` | `9e6f77:	48 89 df             	mov    rdi,rbx` |
| `0x9e7286` | `9e7286:	83 3b 00             	cmp    DWORD PTR [rbx],0x0` |
| `0x9e7289` | `9e7289:	7e 2c                	jle    9e72b7 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xf0e7>` |
| `0x9e728b` | `9e728b:	31 ed                	xor    ebp,ebp` |
| `0x9e728d` | `9e728d:	0f 1f 00             	nop    DWORD PTR [rax]` |
| `0x9e7290` | `9e7290:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]` |
| `0x9e7294` | `9e7294:	48 8b 3c e8          	mov    rdi,QWORD PTR [rax+rbp*8]` |
| `0x9e7298` | `9e7298:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0x9e729c` | `9e729c:	48 8b 14 e8          	mov    rdx,QWORD PTR [rax+rbp*8]` |
| `0x9e72a0` | `9e72a0:	8b 4b 04             	mov    ecx,DWORD PTR [rbx+0x4]` |
| `0x9e72a3` | `9e72a3:	48 89 d6             	mov    rsi,rdx` |
| `0x9e72a6` | `9e72a6:	e8 b5 0d 00 00       	call   9e8060 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x4b0>` |
| `0x9e72ab` | `9e72ab:	48 83 c5 01          	add    rbp,0x1` |
| `0x9e7323` | `9e7323:	31 ed                	xor    ebp,ebp` |
| `0x9e7325` | `9e7325:	66 2e 0f 1f 84 00 00 	cs nop WORD PTR [rax+rax*1+0x0]` |
| `0x9e732c` | `9e732c:	00 00 00` |
| `0x9e732f` | `9e732f:	90                   	nop` |
| `0x9e7330` | `9e7330:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]` |
| `0x9e7334` | `9e7334:	48 8b 3c e8          	mov    rdi,QWORD PTR [rax+rbp*8]` |
| `0x9e7338` | `9e7338:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0x9e733c` | `9e733c:	48 8b 14 e8          	mov    rdx,QWORD PTR [rax+rbp*8]` |
| `0x9e7340` | `9e7340:	8b 4b 04             	mov    ecx,DWORD PTR [rbx+0x4]` |
| `0x9e7343` | `9e7343:	48 89 d6             	mov    rsi,rdx` |
| `0x9e7346` | `9e7346:	e8 15 0d 00 00       	call   9e8060 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x4b0>` |
| `0x9e734b` | `9e734b:	48 83 c5 01          	add    rbp,0x1` |
| `0x9e7562` | `9e7562:	7e 33                	jle    9e7597 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xf3c7>` |
| `0x9e7564` | `9e7564:	31 ed                	xor    ebp,ebp` |
| `0x9e7566` | `9e7566:	66 2e 0f 1f 84 00 00 	cs nop WORD PTR [rax+rax*1+0x0]` |
| `0x9e756d` | `9e756d:	00 00 00` |
| `0x9e7570` | `9e7570:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]` |
| `0x9e7574` | `9e7574:	48 8b 3c e8          	mov    rdi,QWORD PTR [rax+rbp*8]` |
| `0x9e7578` | `9e7578:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0x9e757c` | `9e757c:	48 8b 14 e8          	mov    rdx,QWORD PTR [rax+rbp*8]` |
| `0x9e7580` | `9e7580:	8b 4b 04             	mov    ecx,DWORD PTR [rbx+0x4]` |
| `0x9e7583` | `9e7583:	48 89 d6             	mov    rsi,rdx` |
| `0x9e7586` | `9e7586:	e8 d5 0a 00 00       	call   9e8060 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x4b0>` |
| `0x9e758b` | `9e758b:	48 83 c5 01          	add    rbp,0x1` |
| `0x9e75be` | `9e75be:	83 3b 00             	cmp    DWORD PTR [rbx],0x0` |
| `0x9e75c1` | `9e75c1:	0f 8e 30 00 00 00    	jle    9e75f7 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xf427>` |
| `0x9e75c7` | `9e75c7:	31 ed                	xor    ebp,ebp` |
| `0x9e75c9` | `9e75c9:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]` |
| `0x9e75d0` | `9e75d0:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]` |
| `0x9e75d4` | `9e75d4:	48 8b 3c e8          	mov    rdi,QWORD PTR [rax+rbp*8]` |
| `0x9e75d8` | `9e75d8:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0x9e75dc` | `9e75dc:	48 8b 14 e8          	mov    rdx,QWORD PTR [rax+rbp*8]` |
| `0x9e75e0` | `9e75e0:	8b 4b 04             	mov    ecx,DWORD PTR [rbx+0x4]` |
| `0x9e75e3` | `9e75e3:	48 89 d6             	mov    rsi,rdx` |
| `0x9e75e6` | `9e75e6:	e8 75 0a 00 00       	call   9e8060 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x4b0>` |
| `0x9e75eb` | `9e75eb:	48 83 c5 01          	add    rbp,0x1` |
| `0x9e7827` | `9e7827:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0` |
| `0x9e782b` | `9e782b:	7e 1d                	jle    9e784a <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xf67a>` |
| `0x9e782d` | `9e782d:	31 db                	xor    ebx,ebx` |
| `0x9e782f` | `9e782f:	90                   	nop` |
| `0x9e7830` | `9e7830:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]` |
| `0x9e7834` | `9e7834:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]` |
| `0x9e7838` | `9e7838:	e8 63 08 00 00       	call   9e80a0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x4f0>` |
| `0x9e783d` | `9e783d:	48 83 c3 01          	add    rbx,0x1` |
| `0x9e7841` | `9e7841:	49 63 46 08          	movsxd rax,DWORD PTR [r14+0x8]` |
| `0x9e7845` | `9e7845:	48 39 c3             	cmp    rbx,rax` |
| `0x9e7848` | `9e7848:	7c e6                	jl     9e7830 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xf660>` |
| `0x9e784a` | `9e784a:	41 c7 46 78 00 00 00 	mov    DWORD PTR [r14+0x78],0x0` |
| `0x9e9cba` | `9e9cba:	b8 02 00 00 00       	mov    eax,0x2` |
| `0x9e9cbf` | `9e9cbf:	c3                   	ret` |
| `0x9e9cc0` | `9e9cc0:	89 77 34             	mov    DWORD PTR [rdi+0x34],esi` |
| `0x9e9cc3` | `9e9cc3:	89 57 38             	mov    DWORD PTR [rdi+0x38],edx` |
| `0x9e9cc6` | `9e9cc6:	c7 47 60 00 00 00 00 	mov    DWORD PTR [rdi+0x60],0x0` |
| `0x9e9ccd` | `9e9ccd:	c6 47 78 01          	mov    BYTE PTR [rdi+0x78],0x1` |
| `0x9e9cd1` | `9e9cd1:	e9 ca 05 00 00       	jmp    9ea2a0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x26f0>` |
| `0x9e9cd6` | `9e9cd6:	cc                   	int3` |
| `0x9e9cd7` | `9e9cd7:	cc                   	int3` |
| `0x9e9cd8` | `9e9cd8:	cc                   	int3` |
| `0x9e9cd9` | `9e9cd9:	cc                   	int3` |
| `0x9e9cda` | `9e9cda:	cc                   	int3` |
| `0x9e9cfb` | `9e9cfb:	8b 47 38             	mov    eax,DWORD PTR [rdi+0x38]` |
| `0x9e9cfe` | `9e9cfe:	44 39 c0             	cmp    eax,r8d` |
| `0x9e9d01` | `9e9d01:	44 0f 4c c0          	cmovl  r8d,eax` |
| `0x9e9d05` | `9e9d05:	c7 47 5c 01 00 00 00 	mov    DWORD PTR [rdi+0x5c],0x1` |
| `0x9e9d0c` | `9e9d0c:	8b 47 60             	mov    eax,DWORD PTR [rdi+0x60]` |
| `0x9e9d0f` | `9e9d0f:	31 ed                	xor    ebp,ebp` |
| `0x9e9d11` | `9e9d11:	85 c0                	test   eax,eax` |
| `0x9e9d13` | `9e9d13:	74 14                	je     9e9d29 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x2179>` |
| `0x9e9d15` | `9e9d15:	83 f8 01             	cmp    eax,0x1` |
| `0x9e9d18` | `9e9d18:	74 39                	je     9e9d53 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x21a3>` |
| `0x9e9d1a` | `9e9d1a:	83 f8 02             	cmp    eax,0x2` |
| `0x9e9d1d` | `9e9d1d:	75 3c                	jne    9e9d5b <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x21ab>` |
| `0x9e9e38` | `9e9e38:	29 43 68             	sub    DWORD PTR [rbx+0x68],eax` |
| `0x9e9e3b` | `9e9e3b:	7f 2e                	jg     9e9e6b <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x22bb>` |
| `0x9e9e3d` | `9e9e3d:	80 7b 78 00          	cmp    BYTE PTR [rbx+0x78],0x0` |
| `0x9e9e41` | `9e9e41:	74 1c                	je     9e9e5f <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x22af>` |
| `0x9e9e43` | `9e9e43:	83 7b 60 02          	cmp    DWORD PTR [rbx+0x60],0x2` |
| `0x9e9e47` | `9e9e47:	75 16                	jne    9e9e5f <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x22af>` |
| `0x9e9e49` | `9e9e49:	48 89 df             	mov    rdi,rbx` |
| `0x9e9e4c` | `9e9e4c:	e8 4f 04 00 00       	call   9ea2a0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x26f0>` |
| `0x9e9e51` | `9e9e51:	89 c5                	mov    ebp,eax` |
| `0x9e9e53` | `9e9e53:	85 c0                	test   eax,eax` |
| `0x9e9e55` | `9e9e55:	75 14                	jne    9e9e6b <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x22bb>` |
| `0x9e9e57` | `9e9e57:	8b 43 64             	mov    eax,DWORD PTR [rbx+0x64]` |
| `0x9e9e5a` | `9e9e5a:	03 43 10             	add    eax,DWORD PTR [rbx+0x10]` |
| `0x9e9e5d` | `9e9e5d:	eb 03                	jmp    9e9e62 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x22b2>` |
| `0x9e9e5f` | `9e9e5f:	8b 43 64             	mov    eax,DWORD PTR [rbx+0x64]` |
| `0x9e9e62` | `9e9e62:	89 43 68             	mov    DWORD PTR [rbx+0x68],eax` |
| `0x9e9e65` | `9e9e65:	83 43 60 ff          	add    DWORD PTR [rbx+0x60],0xffffffff` |
| `0x9e9e69` | `9e9e69:	31 ed                	xor    ebp,ebp` |
| `0x9e9e6b` | `9e9e6b:	89 e8                	mov    eax,ebp` |
| `0x9e9e6d` | `9e9e6d:	48 83 c4 30          	add    rsp,0x30` |
| `0x9e9e71` | `9e9e71:	5b                   	pop    rbx` |
| `0x9e9e72` | `9e9e72:	41 5e                	pop    r14` |
| `0x9e9e74` | `9e9e74:	5d                   	pop    rbp` |
| `0x9e9e75` | `9e9e75:	c3                   	ret` |
| `0x9e9ee6` | `9e9ee6:	5b                   	pop    rbx` |
| `0x9e9ee7` | `9e9ee7:	c3                   	ret` |
| `0x9e9ee8` | `9e9ee8:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0x9e9eec` | `9e9eec:	e8 ff 0c 00 00       	call   9eabf0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x3040>` |
| `0x9e9ef1` | `9e9ef1:	c7 43 60 00 00 00 00 	mov    DWORD PTR [rbx+0x60],0x0` |
| `0x9e9ef8` | `9e9ef8:	31 c0                	xor    eax,eax` |
| `0x9e9efa` | `9e9efa:	5b                   	pop    rbx` |
| `0x9e9efb` | `9e9efb:	c3                   	ret` |
| `0x9e9efc` | `9e9efc:	cc                   	int3` |
| `0x9e9efd` | `9e9efd:	cc                   	int3` |
| `0x9e9efe` | `9e9efe:	cc                   	int3` |
| `0x9e9eff` | `9e9eff:	cc                   	int3` |
| `0x9ea261` | `9ea261:	41 88 46 4c          	mov    BYTE PTR [r14+0x4c],al` |
| `0x9ea265` | `9ea265:	eb 19                	jmp    9ea280 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x26d0>` |
| `0x9ea267` | `9ea267:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]` |
| `0x9ea26b` | `9ea26b:	e8 80 09 00 00       	call   9eabf0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x3040>` |
| `0x9ea270` | `9ea270:	41 c7 46 60 02 00 00 	mov    DWORD PTR [r14+0x60],0x2` |
| `0x9ea277` | `9ea277:	00` |
| `0x9ea278` | `9ea278:	41 8b 46 64          	mov    eax,DWORD PTR [r14+0x64]` |
| `0x9ea27c` | `9ea27c:	41 89 46 68          	mov    DWORD PTR [r14+0x68],eax` |
| `0x9ea280` | `9ea280:	31 c0                	xor    eax,eax` |
| `0x9ea282` | `9ea282:	e9 df fe ff ff       	jmp    9ea166 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x25b6>` |
| `0x9ea287` | `9ea287:	e8 24 58 e0 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x9ea28c` | `9ea28c:	cc                   	int3` |
| `0x9eabf3` | `9eabf3:	41 56                	push   r14` |
| `0x9eabf5` | `9eabf5:	53                   	push   rbx` |
| `0x9eabf6` | `9eabf6:	50                   	push   rax` |
| `0x9eabf7` | `9eabf7:	48 89 fb             	mov    rbx,rdi` |
| `0x9eabfa` | `9eabfa:	48 8b 7f 60          	mov    rdi,QWORD PTR [rdi+0x60]` |
| `0x9eabfe` | `9eabfe:	48 63 43 04          	movsxd rax,DWORD PTR [rbx+0x4]` |
| `0x9eac02` | `9eac02:	48 63 53 10          	movsxd rdx,DWORD PTR [rbx+0x10]` |
| `0x9eac06` | `9eac06:	48 0f af d0          	imul   rdx,rax` |
| `0x9eac0a` | `9eac0a:	48 c1 e2 02          	shl    rdx,0x2` |
| `0x9eac0e` | `9eac0e:	31 f6                	xor    esi,esi` |
| `0x9eac10` | `9eac10:	e8 7b 3f e0 00       	call   17eeb90 <memset@plt>` |
| `0x9eac15` | `9eac15:	48 63 43 04          	movsxd rax,DWORD PTR [rbx+0x4]` |
| `0x9ee14f` | `9ee14f:	cc                   	int3` |
| `0x9ee150` | `9ee150:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]` |
| `0x9ee153` | `9ee153:	89 47 68             	mov    DWORD PTR [rdi+0x68],eax` |
| `0x9ee156` | `9ee156:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0x9ee159` | `9ee159:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax` |
| `0x9ee15d` | `9ee15d:	c3                   	ret` |
| `0x9ee15e` | `9ee15e:	cc                   	int3` |
| `0x9ee15f` | `9ee15f:	cc                   	int3` |
| `0x9ee160` | `9ee160:	55                   	push   rbp` |
| `0x9ee161` | `9ee161:	41 57                	push   r15` |
| `0x9ee163` | `9ee163:	41 56                	push   r14` |
| `0x9ee165` | `9ee165:	41 55                	push   r13` |
| `0x9ef475` | `9ef475:	f3 0f 10 44 24 0c    	movss  xmm0,DWORD PTR [rsp+0xc]` |
| `0x9ef47b` | `9ef47b:	f3 41 0f 11 46 5c    	movss  DWORD PTR [r14+0x5c],xmm0` |
| `0x9ef481` | `9ef481:	e9 46 ff ff ff       	jmp    9ef3cc <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x781c>` |
| `0x9ef486` | `9ef486:	f3 0f 10 44 24 0c    	movss  xmm0,DWORD PTR [rsp+0xc]` |
| `0x9ef48c` | `9ef48c:	f3 41 0f 11 46 60    	movss  DWORD PTR [r14+0x60],xmm0` |
| `0x9ef492` | `9ef492:	e9 35 ff ff ff       	jmp    9ef3cc <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x781c>` |
| `0x9ef497` | `9ef497:	f3 0f 10 44 24 0c    	movss  xmm0,DWORD PTR [rsp+0xc]` |
| `0x9ef49d` | `9ef49d:	f3 41 0f 11 46 64    	movss  DWORD PTR [r14+0x64],xmm0` |
| `0x9ef4a3` | `9ef4a3:	e9 24 ff ff ff       	jmp    9ef3cc <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x781c>` |
| `0x9ef4a8` | `9ef4a8:	f3 0f 10 44 24 0c    	movss  xmm0,DWORD PTR [rsp+0xc]` |
| `0x9ef4ae` | `9ef4ae:	f3 41 0f 11 46 6c    	movss  DWORD PTR [r14+0x6c],xmm0` |
| `0x9ef4b4` | `9ef4b4:	e9 13 ff ff ff       	jmp    9ef3cc <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x781c>` |
| `0x9f0165` | `9f0165:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0` |
| `0x9f0169` | `9f0169:	48 8b 05 10 f9 99 ff 	mov    rax,QWORD PTR [rip+0xffffffffff99f910]        # 38fa80 <_ZTSSt12bad_any_cast@@Base-0x748>` |
| `0x9f0170` | `9f0170:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax` |
| `0x9f0174` | `9f0174:	0f 10 05 1d f9 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f91d]        # 38fa98 <_ZTSSt12bad_any_cast@@Base-0x730>` |
| `0x9f017b` | `9f017b:	0f 11 47 60          	movups XMMWORD PTR [rdi+0x60],xmm0` |
| `0x9f017f` | `9f017f:	0f 10 05 22 f9 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f922]        # 38faa8 <_ZTSSt12bad_any_cast@@Base-0x720>` |
| `0x9f0186` | `9f0186:	0f 11 47 70          	movups XMMWORD PTR [rdi+0x70],xmm0` |
| `0x9f018a` | `9f018a:	0f 10 05 27 f9 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f927]        # 38fab8 <_ZTSSt12bad_any_cast@@Base-0x710>` |
| `0x9f0191` | `9f0191:	0f 11 87 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm0` |
| `0x9f0198` | `9f0198:	0f 10 05 29 f9 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f929]        # 38fac8 <_ZTSSt12bad_any_cast@@Base-0x700>` |
| `0x9f019f` | `9f019f:	0f 11 87 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm0` |
| `0x9f01a6` | `9f01a6:	0f 10 05 db f8 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f8db]        # 38fa88 <_ZTSSt12bad_any_cast@@Base-0x740>` |
| `0x9f0212` | `9f0212:	0f 11 87 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm0` |
| `0x9f0219` | `9f0219:	0f 10 05 a8 f8 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f8a8]        # 38fac8 <_ZTSSt12bad_any_cast@@Base-0x700>` |
| `0x9f0220` | `9f0220:	0f 11 87 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm0` |
| `0x9f0227` | `9f0227:	0f 10 05 6a f8 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f86a]        # 38fa98 <_ZTSSt12bad_any_cast@@Base-0x730>` |
| `0x9f022e` | `9f022e:	0f 11 47 60          	movups XMMWORD PTR [rdi+0x60],xmm0` |
| `0x9f0232` | `9f0232:	0f 10 05 4f f8 99 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff99f84f]        # 38fa88 <_ZTSSt12bad_any_cast@@Base-0x740>` |
| `0x9f0239` | `9f0239:	0f 11 47 50          	movups XMMWORD PTR [rdi+0x50],xmm0` |
| `0x9f023d` | `9f023d:	8b 4f 28             	mov    ecx,DWORD PTR [rdi+0x28]` |
| `0x9f0240` | `9f0240:	89 4f 7c             	mov    DWORD PTR [rdi+0x7c],ecx` |
| `0x9f0243` | `9f0243:	8d 04 09             	lea    eax,[rcx+rcx*1]` |
| `0x9f0246` | `9f0246:	89 87 80 00 00 00    	mov    DWORD PTR [rdi+0x80],eax` |
| `0x9f024c` | `9f024c:	f3 0f 10 05 34 e4 99 	movss  xmm0,DWORD PTR [rip+0xffffffffff99e434]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>` |
| `0x9f0447` | `9f0447:	0f 11 93 80 00 00 00 	movups XMMWORD PTR [rbx+0x80],xmm2` |
| `0x9f044e` | `9f044e:	0f 10 15 53 f6 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f653]        # 38faa8 <_ZTSSt12bad_any_cast@@Base-0x720>` |
| `0x9f0455` | `9f0455:	0f 11 53 70          	movups XMMWORD PTR [rbx+0x70],xmm2` |
| `0x9f0459` | `9f0459:	0f 10 15 38 f6 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f638]        # 38fa98 <_ZTSSt12bad_any_cast@@Base-0x730>` |
| `0x9f0460` | `9f0460:	0f 11 53 60          	movups XMMWORD PTR [rbx+0x60],xmm2` |
| `0x9f0464` | `9f0464:	0f 10 15 1d f6 99 ff 	movups xmm2,XMMWORD PTR [rip+0xffffffffff99f61d]        # 38fa88 <_ZTSSt12bad_any_cast@@Base-0x740>` |
| `0x9f046b` | `9f046b:	0f 11 53 50          	movups XMMWORD PTR [rbx+0x50],xmm2` |
| `0x9f046f` | `9f046f:	44 89 73 7c          	mov    DWORD PTR [rbx+0x7c],r14d` |
| ... | truncated 94907 more |

