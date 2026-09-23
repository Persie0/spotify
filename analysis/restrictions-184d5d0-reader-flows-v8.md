# Restrictions `0x184d5d0 +0x60` reader flow trace v8

Focus: go deeper than v7 for actual AP methods that read the captured installed `child+0x18` at object field `+0x60`.

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
```
## Reader/candidate method `0x10bb09e`

```text
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
```
## Reader/candidate method `0x10bb16e`

```text
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
```
## Reader/candidate method `0x10bb258`

```text
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
```
## Reader/candidate method `0x10bc22a`

```text
 10bc1c7:	e8 f6 22 00 00       	call   10be4c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2858d8>
 10bc1cc:	eb 1d                	jmp    10bc1eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283601>
 10bc1ce:	49 89 c6             	mov    r14,rax
 10bc1d1:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
 10bc1d8:	00
 10bc1d9:	e8 52 ab 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10bc1de:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
 10bc1e5:	00
 10bc1e6:	e8 37 26 00 00       	call   10be822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285c38>
 10bc1eb:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 10bc1f0:	e8 cb 23 a2 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
 10bc1f5:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 10bc1fa:	e8 e9 f3 9b ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10bc1ff:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 10bc204:	e8 01 e4 e5 ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>
 10bc209:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bc210:	00 00
 10bc212:	48 3b 84 24 e0 07 00 	cmp    rax,QWORD PTR [rsp+0x7e0]
 10bc219:	00
 10bc21a:	75 08                	jne    10bc224 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28363a>
 10bc21c:	4c 89 f7             	mov    rdi,r14
 10bc21f:	e8 ac 3a 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bc224:	e8 87 38 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bc229:	cc                   	int3
 10bc22a:	55                   	push   rbp
 10bc22b:	41 57                	push   r15
 10bc22d:	41 56                	push   r14
 10bc22f:	41 55                	push   r13
 10bc231:	41 54                	push   r12
 10bc233:	53                   	push   rbx
 10bc234:	48 81 ec 98 00 00 00 	sub    rsp,0x98
 10bc23b:	4d 89 cc             	mov    r12,r9
 10bc23e:	49 89 cf             	mov    r15,rcx
 10bc241:	49 89 f6             	mov    r14,rsi
 10bc244:	49 89 fd             	mov    r13,rdi
 10bc247:	48 8b 9c 24 d0 00 00 	mov    rbx,QWORD PTR [rsp+0xd0]
 10bc24e:	00
 10bc24f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bc256:	00 00
 10bc258:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 10bc25f:	00
 10bc260:	8b 81 f8 00 00 00    	mov    eax,DWORD PTR [rcx+0xf8]
 10bc266:	41 0f b6 c8          	movzx  ecx,r8b
 10bc26a:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx
 10bc26e:	85 c0                	test   eax,eax
 10bc270:	0f 84 b0 00 00 00    	je     10bc326 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28373c>
 10bc276:	83 f8 02             	cmp    eax,0x2
 10bc279:	0f 84 98 00 00 00    	je     10bc317 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28372d>
 10bc27f:	83 f8 01             	cmp    eax,0x1
 10bc282:	0f 85 b1 00 00 00    	jne    10bc339 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28374f>
 10bc288:	49 8d 77 08          	lea    rsi,[r15+0x8]
 10bc28c:	41 8a 4f 58          	mov    cl,BYTE PTR [r15+0x58]
 10bc290:	31 c0                	xor    eax,eax
 10bc292:	84 c9                	test   cl,cl
 10bc294:	48 0f 45 c6          	cmovne rax,rsi
 10bc298:	44 89 c6             	mov    esi,r8d
 10bc29b:	40 80 e6 20          	and    sil,0x20
 10bc29f:	40 0a 33             	or     sil,BYTE PTR [rbx]
 10bc2a2:	0f 84 4b 02 00 00    	je     10bc4f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283909>
 10bc2a8:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 10bc2ad:	48 89 d6             	mov    rsi,rdx
 10bc2b0:	e8 8b 1c 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10bc2b5:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10bc2ba:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
 10bc2bf:	6a 01                	push   0x1
 10bc2c1:	5a                   	pop    rdx
 10bc2c2:	e8 91 b1 9e ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10bc2c7:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bc2ca:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 10bc2cf:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
 10bc2d4:	4c 89 f6             	mov    rsi,r14
 10bc2d7:	8b 4c 24 04          	mov    ecx,DWORD PTR [rsp+0x4]
 10bc2db:	4d 89 e0             	mov    r8,r12
 10bc2de:	49 89 d9             	mov    r9,rbx
 10bc2e1:	ff 90 60 01 00 00    	call   QWORD PTR [rax+0x160]
 10bc2e7:	48 8b 74 24 48       	mov    rsi,QWORD PTR [rsp+0x48]
 10bc2ec:	4c 89 ef             	mov    rdi,r13
 10bc2ef:	e8 d2 13 00 00       	call   10bd6c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284adc>
 10bc2f4:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 10bc2f9:	e8 0c e3 e5 ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>
 10bc2fe:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10bc303:	e8 e0 f2 9b ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10bc308:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 10bc30d:	e8 7e 1b 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bc312:	e9 b0 01 00 00       	jmp    10bc4c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2838dd>
 10bc317:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 10bc31c:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
 10bc321:	41 b6 01             	mov    r14b,0x1
 10bc324:	eb 20                	jmp    10bc346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28375c>
 10bc326:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 10bc32b:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
 10bc330:	80 3b 00             	cmp    BYTE PTR [rbx],0x0
 10bc333:	41 0f 95 c6          	setne  r14b
 10bc337:	eb 0d                	jmp    10bc346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28375c>
 10bc339:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
 10bc33e:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
 10bc343:	45 31 f6             	xor    r14d,r14d
 10bc346:	45 0f b6 e6          	movzx  r12d,r14b
 10bc34a:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
 10bc34f:	48 89 df             	mov    rdi,rbx
 10bc352:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
 10bc357:	8b 4c 24 04          	mov    ecx,DWORD PTR [rsp+0x4]
 10bc35b:	45 89 e0             	mov    r8d,r12d
 10bc35e:	48 89 d5             	mov    rbp,rdx
 10bc361:	e8 26 0e 00 00       	call   10bd18c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2845a2>
 10bc366:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0
 10bc36b:	0f 84 d9 00 00 00    	je     10bc44a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283860>
 10bc371:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
 10bc376:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
 10bc37b:	48 8d 6c 24 48       	lea    rbp,[rsp+0x48]
 10bc380:	48 89 ef             	mov    rdi,rbp
 10bc383:	be b6 00 00 00       	mov    esi,0xb6
 10bc388:	e8 31 16 ce ff       	call   d9d9be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6aa44>
 10bc38d:	89 c3                	mov    ebx,eax
 10bc38f:	48 89 ef             	mov    rdi,rbp
 10bc392:	be ef 00 00 00       	mov    esi,0xef
 10bc397:	e8 22 16 ce ff       	call   d9d9be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6aa44>
 10bc39c:	89 c5                	mov    ebp,eax
 10bc39e:	84 db                	test   bl,bl
 10bc3a0:	74 06                	je     10bc3a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2837be>
 10bc3a2:	41 80 3f 00          	cmp    BYTE PTR [r15],0x0
 10bc3a6:	74 32                	je     10bc3da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2837f0>
 10bc3a8:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 10bc3ad:	be d4 00 00 00       	mov    esi,0xd4
 10bc3b2:	e8 07 16 ce ff       	call   d9d9be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6aa44>
 10bc3b7:	84 c0                	test   al,al
 10bc3b9:	74 07                	je     10bc3c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2837d8>
 10bc3bb:	41 80 7f 60 00       	cmp    BYTE PTR [r15+0x60],0x0
 10bc3c0:	74 18                	je     10bc3da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2837f0>
 10bc3c2:	41 80 bf a8 00 00 00 	cmp    BYTE PTR [r15+0xa8],0x0
 10bc3c9:	00
 10bc3ca:	0f 94 c0             	sete   al
 10bc3cd:	40 20 c5             	and    bpl,al
 10bc3d0:	40 80 fd 01          	cmp    bpl,0x1
 10bc3d4:	0f 85 5c 01 00 00    	jne    10bc536 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28394c>
 10bc3da:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
 10bc3e1:	00
 10bc3e2:	48 8b 00             	mov    rax,QWORD PTR [rax]
 10bc3e5:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 10bc3ea:	44 88 74 24 28       	mov    BYTE PTR [rsp+0x28],r14b
 10bc3ef:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10bc3f4:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 10bc3f9:	e8 42 1b 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10bc3fe:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 10bc403:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
 10bc408:	6a 01                	push   0x1
 10bc40a:	5a                   	pop    rdx
 10bc40b:	e8 48 b0 9e ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
 10bc410:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
```
## Reader/candidate method `0x10bc6aa`

```text
 10bc64f:	48 89 c3             	mov    rbx,rax
 10bc652:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 10bc657:	e8 ae df e5 ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>
 10bc65c:	eb 03                	jmp    10bc661 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283a77>
 10bc65e:	48 89 c3             	mov    rbx,rax
 10bc661:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 10bc666:	e8 7d ef 9b ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10bc66b:	eb 03                	jmp    10bc670 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283a86>
 10bc66d:	48 89 c3             	mov    rbx,rax
 10bc670:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 10bc675:	e8 16 18 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bc67a:	eb 03                	jmp    10bc67f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283a95>
 10bc67c:	48 89 c3             	mov    rbx,rax
 10bc67f:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 10bc684:	e8 37 1f a2 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
 10bc689:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bc690:	00 00
 10bc692:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
 10bc699:	00
 10bc69a:	75 08                	jne    10bc6a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283aba>
 10bc69c:	48 89 df             	mov    rdi,rbx
 10bc69f:	e8 2c 36 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bc6a4:	e8 07 34 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bc6a9:	cc                   	int3
 10bc6aa:	41 57                	push   r15
 10bc6ac:	41 56                	push   r14
 10bc6ae:	53                   	push   rbx
 10bc6af:	48 83 ec 50          	sub    rsp,0x50
 10bc6b3:	49 89 f6             	mov    r14,rsi
 10bc6b6:	48 89 fb             	mov    rbx,rdi
 10bc6b9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bc6c0:	00 00
 10bc6c2:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 10bc6c7:	49 81 c6 c8 00 00 00 	add    r14,0xc8
 10bc6ce:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
 10bc6d3:	4c 89 ff             	mov    rdi,r15
 10bc6d6:	48 89 d6             	mov    rsi,rdx
 10bc6d9:	e8 fc df 71 00       	call   17da6da <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x64fb>
 10bc6de:	48 89 df             	mov    rdi,rbx
 10bc6e1:	4c 89 f6             	mov    rsi,r14
 10bc6e4:	4c 89 fa             	mov    rdx,r15
 10bc6e7:	e8 de d8 71 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
 10bc6ec:	4c 89 ff             	mov    rdi,r15
 10bc6ef:	e8 f4 e0 71 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10bc6f4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bc6fb:	00 00
 10bc6fd:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
 10bc702:	75 0d                	jne    10bc711 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283b27>
 10bc704:	48 89 d8             	mov    rax,rbx
 10bc707:	48 83 c4 50          	add    rsp,0x50
 10bc70b:	5b                   	pop    rbx
 10bc70c:	41 5e                	pop    r14
 10bc70e:	41 5f                	pop    r15
 10bc710:	c3                   	ret
 10bc711:	e8 9a 33 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bc716:	55                   	push   rbp
 10bc717:	41 57                	push   r15
 10bc719:	41 56                	push   r14
 10bc71b:	41 55                	push   r13
 10bc71d:	41 54                	push   r12
 10bc71f:	53                   	push   rbx
 10bc720:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
 10bc727:	4c 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],r9
 10bc72c:	89 4c 24 1c          	mov    DWORD PTR [rsp+0x1c],ecx
 10bc730:	48 89 d3             	mov    rbx,rdx
 10bc733:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi
 10bc738:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
 10bc73d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bc744:	00 00
 10bc746:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
 10bc74d:	00
 10bc74e:	48 8d 35 3d 84 26 ff 	lea    rsi,[rip+0xffffffffff26843d]        # 324b92 <_ZTSSt12bad_any_cast@@Base-0x6b636>
 10bc755:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 10bc75a:	4c 89 c2             	mov    rdx,r8
 10bc75d:	e8 0e 1e 73 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>
 10bc762:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10bc767:	e8 da b7 aa ff       	call   b67f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4ee6>
 10bc76c:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]
 10bc76f:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
 10bc774:	48 8b 6b 08          	mov    rbp,QWORD PTR [rbx+0x8]
 10bc778:	49 39 ef             	cmp    r15,rbp
 10bc77b:	0f 84 8d 00 00 00    	je     10bc80e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c24>
 10bc781:	4c 8d ac 24 88 00 00 	lea    r13,[rsp+0x88]
 10bc788:	00
 10bc789:	0f b6 44 24 1c       	movzx  eax,BYTE PTR [rsp+0x1c]
 10bc78e:	89 44 24 10          	mov    DWORD PTR [rsp+0x10],eax
 10bc792:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
 10bc799:	00
 10bc79a:	44 0f b6 00          	movzx  r8d,BYTE PTR [rax]
 10bc79e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 10bc7a5:	00
 10bc7a6:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
 10bc7ab:	4c 89 fa             	mov    rdx,r15
 10bc7ae:	8b 4c 24 10          	mov    ecx,DWORD PTR [rsp+0x10]
 10bc7b2:	e8 d5 09 00 00       	call   10bd18c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2845a2>
 10bc7b7:	4c 8b a4 24 80 00 00 	mov    r12,QWORD PTR [rsp+0x80]
 10bc7be:	00
 10bc7bf:	4d 39 ec             	cmp    r12,r13
 10bc7c2:	74 34                	je     10bc7f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c0e>
 10bc7c4:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
 10bc7c9:	45 0f b7 74 24 1a    	movzx  r14d,WORD PTR [r12+0x1a]
 10bc7cf:	4c 89 ff             	mov    rdi,r15
 10bc7d2:	e8 5f f0 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bc7d7:	48 89 d1             	mov    rcx,rdx
 10bc7da:	48 89 df             	mov    rdi,rbx
 10bc7dd:	44 89 f6             	mov    esi,r14d
 10bc7e0:	48 89 c2             	mov    rdx,rax
 10bc7e3:	e8 a6 ef 5b 00       	call   167b78e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8fa>
 10bc7e8:	4c 89 e7             	mov    rdi,r12
 10bc7eb:	e8 f2 1f 9e ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
 10bc7f0:	49 89 c4             	mov    r12,rax
 10bc7f3:	4c 39 e8             	cmp    rax,r13
 10bc7f6:	75 cc                	jne    10bc7c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283bda>
 10bc7f8:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10bc7ff:	00
 10bc800:	e8 bb 1d a2 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
 10bc805:	49 83 c7 18          	add    r15,0x18
 10bc809:	49 39 ef             	cmp    r15,rbp
 10bc80c:	75 84                	jne    10bc792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283ba8>
 10bc80e:	6a 50                	push   0x50
 10bc810:	5f                   	pop    rdi
 10bc811:	e8 ea 16 73 00       	call   17edf00 <_Znwm@plt>
 10bc816:	48 89 c5             	mov    rbp,rax
 10bc819:	0f 57 c0             	xorps  xmm0,xmm0
 10bc81c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10bc820:	48 8d 05 01 4b 74 00 	lea    rax,[rip+0x744b01]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
 10bc827:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 10bc82b:	4c 8d 6d 20          	lea    r13,[rbp+0x20]
 10bc82f:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
 10bc834:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
 10bc838:	48 85 c0             	test   rax,rax
 10bc83b:	74 0f                	je     10bc84c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c62>
 10bc83d:	48 39 f8             	cmp    rax,rdi
 10bc840:	74 17                	je     10bc859 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c6f>
 10bc842:	48 83 c7 20          	add    rdi,0x20
 10bc846:	48 89 45 40          	mov    QWORD PTR [rbp+0x40],rax
 10bc84a:	eb 07                	jmp    10bc853 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c69>
 10bc84c:	48 89 ef             	mov    rdi,rbp
 10bc84f:	48 83 c7 40          	add    rdi,0x40
 10bc853:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 10bc857:	eb 0d                	jmp    10bc866 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c7c>
 10bc859:	4c 89 6d 40          	mov    QWORD PTR [rbp+0x40],r13
 10bc85d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bc860:	4c 89 ee             	mov    rsi,r13
 10bc863:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10bc866:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10bc86b:	4c 89 28             	mov    QWORD PTR [rax],r13
 10bc86e:	48 89 68 08          	mov    QWORD PTR [rax+0x8],rbp
 10bc872:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
```
## Reader/candidate method `0x10bc716`

```text
 10bc6c0:	00 00
 10bc6c2:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 10bc6c7:	49 81 c6 c8 00 00 00 	add    r14,0xc8
 10bc6ce:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
 10bc6d3:	4c 89 ff             	mov    rdi,r15
 10bc6d6:	48 89 d6             	mov    rsi,rdx
 10bc6d9:	e8 fc df 71 00       	call   17da6da <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x64fb>
 10bc6de:	48 89 df             	mov    rdi,rbx
 10bc6e1:	4c 89 f6             	mov    rsi,r14
 10bc6e4:	4c 89 fa             	mov    rdx,r15
 10bc6e7:	e8 de d8 71 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
 10bc6ec:	4c 89 ff             	mov    rdi,r15
 10bc6ef:	e8 f4 e0 71 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10bc6f4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bc6fb:	00 00
 10bc6fd:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
 10bc702:	75 0d                	jne    10bc711 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283b27>
 10bc704:	48 89 d8             	mov    rax,rbx
 10bc707:	48 83 c4 50          	add    rsp,0x50
 10bc70b:	5b                   	pop    rbx
 10bc70c:	41 5e                	pop    r14
 10bc70e:	41 5f                	pop    r15
 10bc710:	c3                   	ret
 10bc711:	e8 9a 33 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bc716:	55                   	push   rbp
 10bc717:	41 57                	push   r15
 10bc719:	41 56                	push   r14
 10bc71b:	41 55                	push   r13
 10bc71d:	41 54                	push   r12
 10bc71f:	53                   	push   rbx
 10bc720:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
 10bc727:	4c 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],r9
 10bc72c:	89 4c 24 1c          	mov    DWORD PTR [rsp+0x1c],ecx
 10bc730:	48 89 d3             	mov    rbx,rdx
 10bc733:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi
 10bc738:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
 10bc73d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bc744:	00 00
 10bc746:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
 10bc74d:	00
 10bc74e:	48 8d 35 3d 84 26 ff 	lea    rsi,[rip+0xffffffffff26843d]        # 324b92 <_ZTSSt12bad_any_cast@@Base-0x6b636>
 10bc755:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 10bc75a:	4c 89 c2             	mov    rdx,r8
 10bc75d:	e8 0e 1e 73 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>
 10bc762:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 10bc767:	e8 da b7 aa ff       	call   b67f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4ee6>
 10bc76c:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]
 10bc76f:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
 10bc774:	48 8b 6b 08          	mov    rbp,QWORD PTR [rbx+0x8]
 10bc778:	49 39 ef             	cmp    r15,rbp
 10bc77b:	0f 84 8d 00 00 00    	je     10bc80e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c24>
 10bc781:	4c 8d ac 24 88 00 00 	lea    r13,[rsp+0x88]
 10bc788:	00
 10bc789:	0f b6 44 24 1c       	movzx  eax,BYTE PTR [rsp+0x1c]
 10bc78e:	89 44 24 10          	mov    DWORD PTR [rsp+0x10],eax
 10bc792:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
 10bc799:	00
 10bc79a:	44 0f b6 00          	movzx  r8d,BYTE PTR [rax]
 10bc79e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 10bc7a5:	00
 10bc7a6:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
 10bc7ab:	4c 89 fa             	mov    rdx,r15
 10bc7ae:	8b 4c 24 10          	mov    ecx,DWORD PTR [rsp+0x10]
 10bc7b2:	e8 d5 09 00 00       	call   10bd18c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2845a2>
 10bc7b7:	4c 8b a4 24 80 00 00 	mov    r12,QWORD PTR [rsp+0x80]
 10bc7be:	00
 10bc7bf:	4d 39 ec             	cmp    r12,r13
 10bc7c2:	74 34                	je     10bc7f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c0e>
 10bc7c4:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]
 10bc7c9:	45 0f b7 74 24 1a    	movzx  r14d,WORD PTR [r12+0x1a]
 10bc7cf:	4c 89 ff             	mov    rdi,r15
 10bc7d2:	e8 5f f0 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bc7d7:	48 89 d1             	mov    rcx,rdx
 10bc7da:	48 89 df             	mov    rdi,rbx
 10bc7dd:	44 89 f6             	mov    esi,r14d
 10bc7e0:	48 89 c2             	mov    rdx,rax
 10bc7e3:	e8 a6 ef 5b 00       	call   167b78e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8fa>
 10bc7e8:	4c 89 e7             	mov    rdi,r12
 10bc7eb:	e8 f2 1f 9e ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
 10bc7f0:	49 89 c4             	mov    r12,rax
 10bc7f3:	4c 39 e8             	cmp    rax,r13
 10bc7f6:	75 cc                	jne    10bc7c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283bda>
 10bc7f8:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10bc7ff:	00
 10bc800:	e8 bb 1d a2 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
 10bc805:	49 83 c7 18          	add    r15,0x18
 10bc809:	49 39 ef             	cmp    r15,rbp
 10bc80c:	75 84                	jne    10bc792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283ba8>
 10bc80e:	6a 50                	push   0x50
 10bc810:	5f                   	pop    rdi
 10bc811:	e8 ea 16 73 00       	call   17edf00 <_Znwm@plt>
 10bc816:	48 89 c5             	mov    rbp,rax
 10bc819:	0f 57 c0             	xorps  xmm0,xmm0
 10bc81c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10bc820:	48 8d 05 01 4b 74 00 	lea    rax,[rip+0x744b01]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
 10bc827:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 10bc82b:	4c 8d 6d 20          	lea    r13,[rbp+0x20]
 10bc82f:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
 10bc834:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
 10bc838:	48 85 c0             	test   rax,rax
 10bc83b:	74 0f                	je     10bc84c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c62>
 10bc83d:	48 39 f8             	cmp    rax,rdi
 10bc840:	74 17                	je     10bc859 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c6f>
 10bc842:	48 83 c7 20          	add    rdi,0x20
 10bc846:	48 89 45 40          	mov    QWORD PTR [rbp+0x40],rax
 10bc84a:	eb 07                	jmp    10bc853 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c69>
 10bc84c:	48 89 ef             	mov    rdi,rbp
 10bc84f:	48 83 c7 40          	add    rdi,0x40
 10bc853:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 10bc857:	eb 0d                	jmp    10bc866 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283c7c>
 10bc859:	4c 89 6d 40          	mov    QWORD PTR [rbp+0x40],r13
 10bc85d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bc860:	4c 89 ee             	mov    rsi,r13
 10bc863:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10bc866:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10bc86b:	4c 89 28             	mov    QWORD PTR [rax],r13
 10bc86e:	48 89 68 08          	mov    QWORD PTR [rax+0x8],rbp
 10bc872:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 10bc877:	4c 8b b9 98 00 00 00 	mov    r15,QWORD PTR [rcx+0x98]
 10bc87e:	49 8d 47 01          	lea    rax,[r15+0x1]
 10bc882:	48 89 81 98 00 00 00 	mov    QWORD PTR [rcx+0x98],rax
 10bc889:	0f 57 c0             	xorps  xmm0,xmm0
 10bc88c:	48 8d 9c 24 a0 00 00 	lea    rbx,[rsp+0xa0]
 10bc893:	00
 10bc894:	0f 29 43 e0          	movaps XMMWORD PTR [rbx-0x20],xmm0
 10bc898:	4c 89 6b f0          	mov    QWORD PTR [rbx-0x10],r13
 10bc89c:	48 89 6b f8          	mov    QWORD PTR [rbx-0x8],rbp
 10bc8a0:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]
 10bc8a5:	48 89 df             	mov    rdi,rbx
 10bc8a8:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
 10bc8ad:	48 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],rbp
 10bc8b2:	e8 41 ac a1 ff       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
 10bc8b7:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 10bc8be:	00
 10bc8bf:	8b 44 24 1c          	mov    eax,DWORD PTR [rsp+0x1c]
 10bc8c3:	88 47 f8             	mov    BYTE PTR [rdi-0x8],al
 10bc8c6:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
 10bc8cb:	e8 70 16 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 10bc8d0:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
 10bc8d5:	4d 8d a5 a0 00 00 00 	lea    r12,[r13+0xa0]
 10bc8dc:	4d 8b b5 a8 00 00 00 	mov    r14,QWORD PTR [r13+0xa8]
 10bc8e3:	4d 85 f6             	test   r14,r14
 10bc8e6:	74 14                	je     10bc8fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283d12>
 10bc8e8:	f3 49 0f b8 ce       	popcnt rcx,r14
 10bc8ed:	48 83 f9 01          	cmp    rcx,0x1
 10bc8f1:	77 0b                	ja     10bc8fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283d14>
 10bc8f3:	49 8d 6e ff          	lea    rbp,[r14-0x1]
 10bc8f7:	4c 21 fd             	and    rbp,r15
 10bc8fa:	eb 15                	jmp    10bc911 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x283d27>
```
## Reader/candidate method `0x10bd038`

```text
 10bd000:	8a 47 56             	mov    al,BYTE PTR [rdi+0x56]
 10bd003:	c3                   	ret
 10bd004:	8a 47 57             	mov    al,BYTE PTR [rdi+0x57]
 10bd007:	c3                   	ret
 10bd008:	8a 47 58             	mov    al,BYTE PTR [rdi+0x58]
 10bd00b:	c3                   	ret
 10bd00c:	8a 47 59             	mov    al,BYTE PTR [rdi+0x59]
 10bd00f:	c3                   	ret
 10bd010:	8a 47 5a             	mov    al,BYTE PTR [rdi+0x5a]
 10bd013:	c3                   	ret
 10bd014:	53                   	push   rbx
 10bd015:	48 89 fb             	mov    rbx,rdi
 10bd018:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bd01c:	e8 89 00 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bd021:	84 c0                	test   al,al
 10bd023:	74 0e                	je     10bd033 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284449>
 10bd025:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
 10bd029:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]
 10bd02d:	5b                   	pop    rbx
 10bd02e:	e9 47 01 00 00       	jmp    10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bd033:	31 c0                	xor    eax,eax
 10bd035:	5b                   	pop    rbx
 10bd036:	c3                   	ret
 10bd037:	cc                   	int3
 10bd038:	53                   	push   rbx
 10bd039:	48 89 fb             	mov    rbx,rdi
 10bd03c:	48 8d 05 8d 05 79 00 	lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10bd043:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bd046:	48 81 c7 88 01 00 00 	add    rdi,0x188
 10bd04d:	e8 82 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd052:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
 10bd059:	e8 76 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd05e:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 10bd065:	e8 fc cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd06a:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
 10bd071:	e8 f0 cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd076:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10bd07d:	e8 d4 d6 ff ff       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>
 10bd082:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10bd086:	e8 49 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd08b:	48 83 c3 20          	add    rbx,0x20
 10bd08f:	48 89 df             	mov    rdi,rbx
 10bd092:	5b                   	pop    rbx
 10bd093:	e9 3c cb 71 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd098:	53                   	push   rbx
 10bd099:	48 89 fb             	mov    rbx,rdi
 10bd09c:	e8 97 ff ff ff       	call   10bd038 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28444e>
 10bd0a1:	48 89 df             	mov    rdi,rbx
 10bd0a4:	5b                   	pop    rbx
 10bd0a5:	e9 76 0e 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10bd0aa:	41 57                	push   r15
 10bd0ac:	41 56                	push   r14
 10bd0ae:	41 54                	push   r12
 10bd0b0:	53                   	push   rbx
 10bd0b1:	48 83 ec 58          	sub    rsp,0x58
 10bd0b5:	48 89 fb             	mov    rbx,rdi
 10bd0b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd0bf:	00 00
 10bd0c1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10bd0c6:	48 8d 35 fb b0 92 00 	lea    rsi,[rip+0x92b0fb]        # 19e81c8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27b8>
 10bd0cd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bd0d2:	e8 d3 4c 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bd0d7:	48 8d 35 af 58 2b ff 	lea    rsi,[rip+0xffffffffff2b58af]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
 10bd0de:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bd0e3:	e8 96 c9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bd0e8:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 10bd0eb:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
 10bd0f0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 10bd0f5:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
 10bd0fa:	4c 89 f7             	mov    rdi,r14
 10bd0fd:	4c 89 fa             	mov    rdx,r15
 10bd100:	4c 89 e1             	mov    rcx,r12
 10bd103:	e8 e8 5e 55 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
 10bd108:	48 8d 35 6e 4e 39 ff 	lea    rsi,[rip+0xffffffffff394e6e]        # 451f7d <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b89>
 10bd10f:	4c 89 f7             	mov    rdi,r14
 10bd112:	e8 38 e7 9b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10bd117:	89 c3                	mov    ebx,eax
 10bd119:	4c 89 f7             	mov    rdi,r14
 10bd11c:	e8 6f 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bd121:	4c 89 e7             	mov    rdi,r12
 10bd124:	e8 67 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bd129:	4c 89 ff             	mov    rdi,r15
 10bd12c:	e8 5f 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bd131:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd138:	00 00
 10bd13a:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
 10bd13f:	75 33                	jne    10bd174 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28458a>
 10bd141:	89 d8                	mov    eax,ebx
 10bd143:	48 83 c4 58          	add    rsp,0x58
 10bd147:	5b                   	pop    rbx
 10bd148:	41 5c                	pop    r12
 10bd14a:	41 5e                	pop    r14
 10bd14c:	41 5f                	pop    r15
 10bd14e:	c3                   	ret
 10bd14f:	48 89 c3             	mov    rbx,rax
 10bd152:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bd157:	e8 34 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bd15c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd163:	00 00
 10bd165:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
 10bd16a:	75 08                	jne    10bd174 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28458a>
 10bd16c:	48 89 df             	mov    rdi,rbx
 10bd16f:	e8 5c 2b 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bd174:	e8 37 29 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bd179:	cc                   	int3
 10bd17a:	50                   	push   rax
 10bd17b:	48 85 f6             	test   rsi,rsi
 10bd17e:	48 0f 45 fe          	cmovne rdi,rsi
 10bd182:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bd185:	ff 10                	call   QWORD PTR [rax]
 10bd187:	34 01                	xor    al,0x1
 10bd189:	59                   	pop    rcx
 10bd18a:	c3                   	ret
 10bd18b:	cc                   	int3
 10bd18c:	55                   	push   rbp
 10bd18d:	41 57                	push   r15
 10bd18f:	41 56                	push   r14
 10bd191:	41 55                	push   r13
 10bd193:	41 54                	push   r12
 10bd195:	53                   	push   rbx
 10bd196:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
 10bd19d:	45 89 c7             	mov    r15d,r8d
 10bd1a0:	89 cd                	mov    ebp,ecx
 10bd1a2:	49 89 f6             	mov    r14,rsi
 10bd1a5:	48 89 fb             	mov    rbx,rdi
 10bd1a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd1af:	00 00
 10bd1b1:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
 10bd1b8:	00
 10bd1b9:	4c 8d 6f 08          	lea    r13,[rdi+0x8]
 10bd1bd:	0f 57 c0             	xorps  xmm0,xmm0
 10bd1c0:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
 10bd1c4:	4c 89 2f             	mov    QWORD PTR [rdi],r13
 10bd1c7:	48 89 d7             	mov    rdi,rdx
 10bd1ca:	e8 67 e6 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bd1cf:	4c 8d 64 24 78       	lea    r12,[rsp+0x78]
 10bd1d4:	4c 89 e7             	mov    rdi,r12
 10bd1d7:	48 89 c6             	mov    rsi,rax
 10bd1da:	e8 49 82 60 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
 10bd1df:	45 8b 64 24 38       	mov    r12d,DWORD PTR [r12+0x38]
 10bd1e4:	41 83 fc 3f          	cmp    r12d,0x3f
 10bd1e8:	74 34                	je     10bd21e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284634>
 10bd1ea:	41 83 fc 04          	cmp    r12d,0x4
 10bd1ee:	75 59                	jne    10bd249 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28465f>
 10bd1f0:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
 10bd1f5:	45 84 ff             	test   r15b,r15b
 10bd1f8:	74 70                	je     10bd26a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284680>
 10bd1fa:	66 c7 06 b6 00       	mov    WORD PTR [rsi],0xb6
 10bd1ff:	48 89 df             	mov    rdi,rbx
```
## Reader/candidate method `0x10bd098`

```text
 10bd033:	31 c0                	xor    eax,eax
 10bd035:	5b                   	pop    rbx
 10bd036:	c3                   	ret
 10bd037:	cc                   	int3
 10bd038:	53                   	push   rbx
 10bd039:	48 89 fb             	mov    rbx,rdi
 10bd03c:	48 8d 05 8d 05 79 00 	lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10bd043:	48 89 07             	mov    QWORD PTR [rdi],rax
 10bd046:	48 81 c7 88 01 00 00 	add    rdi,0x188
 10bd04d:	e8 82 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd052:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
 10bd059:	e8 76 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd05e:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
 10bd065:	e8 fc cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd06a:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]
 10bd071:	e8 f0 cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10bd076:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 10bd07d:	e8 d4 d6 ff ff       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>
 10bd082:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 10bd086:	e8 49 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd08b:	48 83 c3 20          	add    rbx,0x20
 10bd08f:	48 89 df             	mov    rdi,rbx
 10bd092:	5b                   	pop    rbx
 10bd093:	e9 3c cb 71 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10bd098:	53                   	push   rbx
 10bd099:	48 89 fb             	mov    rbx,rdi
 10bd09c:	e8 97 ff ff ff       	call   10bd038 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28444e>
 10bd0a1:	48 89 df             	mov    rdi,rbx
 10bd0a4:	5b                   	pop    rbx
 10bd0a5:	e9 76 0e 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10bd0aa:	41 57                	push   r15
 10bd0ac:	41 56                	push   r14
 10bd0ae:	41 54                	push   r12
 10bd0b0:	53                   	push   rbx
 10bd0b1:	48 83 ec 58          	sub    rsp,0x58
 10bd0b5:	48 89 fb             	mov    rbx,rdi
 10bd0b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd0bf:	00 00
 10bd0c1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 10bd0c6:	48 8d 35 fb b0 92 00 	lea    rsi,[rip+0x92b0fb]        # 19e81c8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x27b8>
 10bd0cd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bd0d2:	e8 d3 4c 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 10bd0d7:	48 8d 35 af 58 2b ff 	lea    rsi,[rip+0xffffffffff2b58af]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
 10bd0de:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 10bd0e3:	e8 96 c9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 10bd0e8:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 10bd0eb:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
 10bd0f0:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 10bd0f5:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
 10bd0fa:	4c 89 f7             	mov    rdi,r14
 10bd0fd:	4c 89 fa             	mov    rdx,r15
 10bd100:	4c 89 e1             	mov    rcx,r12
 10bd103:	e8 e8 5e 55 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
 10bd108:	48 8d 35 6e 4e 39 ff 	lea    rsi,[rip+0xffffffffff394e6e]        # 451f7d <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b89>
 10bd10f:	4c 89 f7             	mov    rdi,r14
 10bd112:	e8 38 e7 9b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10bd117:	89 c3                	mov    ebx,eax
 10bd119:	4c 89 f7             	mov    rdi,r14
 10bd11c:	e8 6f 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bd121:	4c 89 e7             	mov    rdi,r12
 10bd124:	e8 67 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bd129:	4c 89 ff             	mov    rdi,r15
 10bd12c:	e8 5f 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bd131:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd138:	00 00
 10bd13a:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
 10bd13f:	75 33                	jne    10bd174 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28458a>
 10bd141:	89 d8                	mov    eax,ebx
 10bd143:	48 83 c4 58          	add    rsp,0x58
 10bd147:	5b                   	pop    rbx
 10bd148:	41 5c                	pop    r12
 10bd14a:	41 5e                	pop    r14
 10bd14c:	41 5f                	pop    r15
 10bd14e:	c3                   	ret
 10bd14f:	48 89 c3             	mov    rbx,rax
 10bd152:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 10bd157:	e8 34 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10bd15c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd163:	00 00
 10bd165:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
 10bd16a:	75 08                	jne    10bd174 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28458a>
 10bd16c:	48 89 df             	mov    rdi,rbx
 10bd16f:	e8 5c 2b 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10bd174:	e8 37 29 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bd179:	cc                   	int3
 10bd17a:	50                   	push   rax
 10bd17b:	48 85 f6             	test   rsi,rsi
 10bd17e:	48 0f 45 fe          	cmovne rdi,rsi
 10bd182:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bd185:	ff 10                	call   QWORD PTR [rax]
 10bd187:	34 01                	xor    al,0x1
 10bd189:	59                   	pop    rcx
 10bd18a:	c3                   	ret
 10bd18b:	cc                   	int3
 10bd18c:	55                   	push   rbp
 10bd18d:	41 57                	push   r15
 10bd18f:	41 56                	push   r14
 10bd191:	41 55                	push   r13
 10bd193:	41 54                	push   r12
 10bd195:	53                   	push   rbx
 10bd196:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
 10bd19d:	45 89 c7             	mov    r15d,r8d
 10bd1a0:	89 cd                	mov    ebp,ecx
 10bd1a2:	49 89 f6             	mov    r14,rsi
 10bd1a5:	48 89 fb             	mov    rbx,rdi
 10bd1a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bd1af:	00 00
 10bd1b1:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
 10bd1b8:	00
 10bd1b9:	4c 8d 6f 08          	lea    r13,[rdi+0x8]
 10bd1bd:	0f 57 c0             	xorps  xmm0,xmm0
 10bd1c0:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
 10bd1c4:	4c 89 2f             	mov    QWORD PTR [rdi],r13
 10bd1c7:	48 89 d7             	mov    rdi,rdx
 10bd1ca:	e8 67 e6 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10bd1cf:	4c 8d 64 24 78       	lea    r12,[rsp+0x78]
 10bd1d4:	4c 89 e7             	mov    rdi,r12
 10bd1d7:	48 89 c6             	mov    rsi,rax
 10bd1da:	e8 49 82 60 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
 10bd1df:	45 8b 64 24 38       	mov    r12d,DWORD PTR [r12+0x38]
 10bd1e4:	41 83 fc 3f          	cmp    r12d,0x3f
 10bd1e8:	74 34                	je     10bd21e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284634>
 10bd1ea:	41 83 fc 04          	cmp    r12d,0x4
 10bd1ee:	75 59                	jne    10bd249 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28465f>
 10bd1f0:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
 10bd1f5:	45 84 ff             	test   r15b,r15b
 10bd1f8:	74 70                	je     10bd26a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284680>
 10bd1fa:	66 c7 06 b6 00       	mov    WORD PTR [rsi],0xb6
 10bd1ff:	48 89 df             	mov    rdi,rbx
 10bd202:	e8 03 42 c9 ff       	call   d5140a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e490>
 10bd207:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
 10bd20c:	66 c7 06 d4 00       	mov    WORD PTR [rsi],0xd4
 10bd211:	48 89 df             	mov    rdi,rbx
 10bd214:	e8 f1 41 c9 ff       	call   d5140a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e490>
 10bd219:	e9 a0 00 00 00       	jmp    10bd2be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2846d4>
 10bd21e:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
 10bd223:	45 84 ff             	test   r15b,r15b
 10bd226:	74 51                	je     10bd279 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28468f>
 10bd228:	66 c7 06 b6 00       	mov    WORD PTR [rsi],0xb6
 10bd22d:	48 89 df             	mov    rdi,rbx
 10bd230:	e8 d5 41 c9 ff       	call   d5140a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e490>
 10bd235:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
 10bd23a:	66 c7 06 d4 00       	mov    WORD PTR [rsi],0xd4
 10bd23f:	48 89 df             	mov    rdi,rbx
 10bd242:	e8 c3 41 c9 ff       	call   d5140a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e490>
 10bd247:	eb 75                	jmp    10bd2be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2846d4>
 10bd249:	41 83 fc 3e          	cmp    r12d,0x3e
 10bd24d:	75 39                	jne    10bd288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28469e>
 10bd24f:	41 80 7e 5e 00       	cmp    BYTE PTR [r14+0x5e],0x0
```
## Condensed local flow signals

| addr | instruction |
|---:|---|
| `0x10bb098` | `10bb098:	e8 13 4a 73 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x10bb0cc` | `10bb0cc:	83 f8 05             	cmp    eax,0x5` |
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |
| `0x10bb0f3` | `10bb0f3:	e8 cc 4b 6c 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>` |
| `0x10bb107` | `10bb107:	4c 89 f7             	mov    rdi,r14` |
| `0x10bb10a` | `10bb10a:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10bb112` | `10bb112:	e8 79 2d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bb117` | `10bb117:	48 89 df             	mov    rdi,rbx` |
| `0x10bb11a` | `10bb11a:	e8 e9 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>` |
| `0x10bb128` | `10bb128:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0x10bb137` | `10bb137:	49 89 c6             	mov    r14,rax` |
| `0x10bb13f` | `10bb13f:	e8 4c 2d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bb146` | `10bb146:	49 89 c6             	mov    r14,rax` |
| `0x10bb149` | `10bb149:	48 89 df             	mov    rdi,rbx` |
| `0x10bb14c` | `10bb14c:	e8 b7 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>` |
| `0x10bb15a` | `10bb15a:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0x10bb161` | `10bb161:	4c 89 f7             	mov    rdi,r14` |
| `0x10bb164` | `10bb164:	e8 67 4b 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x10bb169` | `10bb169:	e8 42 49 73 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x10bb186` | `10bb186:	48 8b 77 60          	mov    rsi,QWORD PTR [rdi+0x60]` |
| `0x10bb199` | `10bb199:	4c 89 f7             	mov    rdi,r14` |
| `0x10bb19c` | `10bb19c:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10bb19f` | `10bb19f:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10bb1c7` | `10bb1c7:	e8 86 a9 a8 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>` |
| `0x10bb1d1` | `10bb1d1:	e8 60 06 9c ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0x10bb1d6` | `10bb1d6:	48 89 e7             	mov    rdi,rsp` |
| `0x10bb1d9` | `10bb1d9:	48 89 c6             	mov    rsi,rax` |
| `0x10bb1dc` | `10bb1dc:	e8 71 46 6c 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>` |
| `0x10bb1e1` | `10bb1e1:	84 c0                	test   al,al` |
| `0x10bb1e9` | `10bb1e9:	83 f8 05             	cmp    eax,0x5` |
| `0x10bb1fc` | `10bb1fc:	4c 89 f7             	mov    rdi,r14` |
| `0x10bb1ff` | `10bb1ff:	e8 04 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>` |
| `0x10bb14c` | `10bb14c:	e8 b7 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>` |
| `0x10bb15a` | `10bb15a:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0x10bb161` | `10bb161:	4c 89 f7             	mov    rdi,r14` |
| `0x10bb164` | `10bb164:	e8 67 4b 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x10bb169` | `10bb169:	e8 42 49 73 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x10bb186` | `10bb186:	48 8b 77 60          	mov    rsi,QWORD PTR [rdi+0x60]` |
| `0x10bb199` | `10bb199:	4c 89 f7             	mov    rdi,r14` |
| `0x10bb19c` | `10bb19c:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10bb19f` | `10bb19f:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0` |
| `0x10bb1c7` | `10bb1c7:	e8 86 a9 a8 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>` |
| `0x10bb1d1` | `10bb1d1:	e8 60 06 9c ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0x10bb1d6` | `10bb1d6:	48 89 e7             	mov    rdi,rsp` |
| `0x10bb1d9` | `10bb1d9:	48 89 c6             	mov    rsi,rax` |
| `0x10bb1dc` | `10bb1dc:	e8 71 46 6c 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>` |
| `0x10bb1e1` | `10bb1e1:	84 c0                	test   al,al` |
| `0x10bb1e9` | `10bb1e9:	83 f8 05             	cmp    eax,0x5` |
| `0x10bb1fc` | `10bb1fc:	4c 89 f7             	mov    rdi,r14` |
| `0x10bb1ff` | `10bb1ff:	e8 04 f8 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>` |
| `0x10bb209` | `10bb209:	e8 22 bb 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10bb217` | `10bb217:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0x10bb229` | `10bb229:	4c 89 f7             	mov    rdi,r14` |
| `0x10bb22c` | `10bb22c:	e8 d7 f7 9e ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>` |
| `0x10bb236` | `10bb236:	e8 f5 ba 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10bb244` | `10bb244:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0x10bb24b` | `10bb24b:	48 89 df             	mov    rdi,rbx` |
| `0x10bb24e` | `10bb24e:	e8 7d 4a 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x10bb253` | `10bb253:	e8 58 48 73 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x10bb2b7` | `10bb2b7:	49 39 c5             	cmp    r13,rax` |
| `0x10bb236` | `10bb236:	e8 f5 ba 9e ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0x10bb244` | `10bb244:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0x10bb24b` | `10bb24b:	48 89 df             	mov    rdi,rbx` |
| `0x10bb24e` | `10bb24e:	e8 7d 4a 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x10bb253` | `10bb253:	e8 58 48 73 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x10bb2b7` | `10bb2b7:	49 39 c5             	cmp    r13,rax` |
| `0x10bb317` | `10bb317:	4c 89 ef             	mov    rdi,r13` |
| `0x10bb31a` | `10bb31a:	e8 c3 fe 49 00       	call   155b1e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a0766>` |
| `0x10bb31f` | `10bb31f:	84 c0                	test   al,al` |
| `0x10bb32e` | `10bb32e:	4c 89 f7             	mov    rdi,r14` |
| `0x10bb33c` | `10bb33c:	e8 4f 38 73 00       	call   17eeb90 <memset@plt>` |
| `0x10bb346` | `10bb346:	48 89 df             	mov    rdi,rbx` |
| `0x10bb349` | `10bb349:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]` |
| `0x10bb357` | `10bb357:	e8 30 1e 00 00       	call   10bd18c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2845a2>` |
| `0x10bb35c` | `10bb35c:	48 83 bc 24 98 00 00 	cmp    QWORD PTR [rsp+0x98],0x0` |
| `0x10bb36b` | `10bb36b:	48 89 df             	mov    rdi,rbx` |
| `0x10bb373` | `10bb373:	e8 46 26 ce ff       	call   d9d9be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6aa44>` |
| `0x10bb378` | `10bb378:	84 c0                	test   al,al` |
| `0x10bb3ba` | `10bb3ba:	4c 8b 70 68          	mov    r14,QWORD PTR [rax+0x68]` |
| `0x10bb3be` | `10bb3be:	4c 89 ef             	mov    rdi,r13` |
| `0x10bb3c1` | `10bb3c1:	e8 70 04 9c ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0x10bc212` | `10bc212:	48 3b 84 24 e0 07 00 	cmp    rax,QWORD PTR [rsp+0x7e0]` |
| `0x10bc21c` | `10bc21c:	4c 89 f7             	mov    rdi,r14` |
| `0x10bc21f` | `10bc21f:	e8 ac 3a 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x10bc224` | `10bc224:	e8 87 38 73 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x10bc241` | `10bc241:	49 89 f6             	mov    r14,rsi` |
| `0x10bc26e` | `10bc26e:	85 c0                	test   eax,eax` |
| `0x10bc276` | `10bc276:	83 f8 02             	cmp    eax,0x2` |
| `0x10bc27f` | `10bc27f:	83 f8 01             	cmp    eax,0x1` |
| `0x10bc292` | `10bc292:	84 c9                	test   cl,cl` |
| `0x10bc2ad` | `10bc2ad:	48 89 d6             	mov    rsi,rdx` |
| `0x10bc2b0` | `10bc2b0:	e8 8b 1c 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0x10bc2c2` | `10bc2c2:	e8 91 b1 9e ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>` |
| `0x10bc2d4` | `10bc2d4:	4c 89 f6             	mov    rsi,r14` |
| `0x10bc2e1` | `10bc2e1:	ff 90 60 01 00 00    	call   QWORD PTR [rax+0x160]` |
| `0x10bc2e7` | `10bc2e7:	48 8b 74 24 48       	mov    rsi,QWORD PTR [rsp+0x48]` |
| `0x10bc2ec` | `10bc2ec:	4c 89 ef             	mov    rdi,r13` |
| `0x10bc2ef` | `10bc2ef:	e8 d2 13 00 00       	call   10bd6c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284adc>` |
| `0x10bc2f9` | `10bc2f9:	e8 0c e3 e5 ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>` |
| `0x10bc303` | `10bc303:	e8 e0 f2 9b ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>` |
| `0x10bc30d` | `10bc30d:	e8 7e 1b 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bc321` | `10bc321:	41 b6 01             	mov    r14b,0x1` |
| `0x10bc330` | `10bc330:	80 3b 00             	cmp    BYTE PTR [rbx],0x0` |
| `0x10bc333` | `10bc333:	41 0f 95 c6          	setne  r14b` |
| `0x10bc34f` | `10bc34f:	48 89 df             	mov    rdi,rbx` |
| `0x10bc352` | `10bc352:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]` |
| `0x10bc361` | `10bc361:	e8 26 0e 00 00       	call   10bd18c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2845a2>` |
| `0x10bc366` | `10bc366:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0` |
| `0x10bc380` | `10bc380:	48 89 ef             	mov    rdi,rbp` |
| `0x10bc388` | `10bc388:	e8 31 16 ce ff       	call   d9d9be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6aa44>` |
| `0x10bc38f` | `10bc38f:	48 89 ef             	mov    rdi,rbp` |
| `0x10bc397` | `10bc397:	e8 22 16 ce ff       	call   d9d9be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6aa44>` |
| `0x10bc39e` | `10bc39e:	84 db                	test   bl,bl` |
| `0x10bc692` | `10bc692:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]` |
| `0x10bc69c` | `10bc69c:	48 89 df             	mov    rdi,rbx` |
| `0x10bc69f` | `10bc69f:	e8 2c 36 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x10bc6a4` | `10bc6a4:	e8 07 34 73 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x10bc6b3` | `10bc6b3:	49 89 f6             	mov    r14,rsi` |
| `0x10bc6d3` | `10bc6d3:	4c 89 ff             	mov    rdi,r15` |
| `0x10bc6d6` | `10bc6d6:	48 89 d6             	mov    rsi,rdx` |
| `0x10bc6d9` | `10bc6d9:	e8 fc df 71 00       	call   17da6da <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x64fb>` |
| `0x10bc6de` | `10bc6de:	48 89 df             	mov    rdi,rbx` |
| `0x10bc6e1` | `10bc6e1:	4c 89 f6             	mov    rsi,r14` |
| `0x10bc6e7` | `10bc6e7:	e8 de d8 71 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0x10bc6ec` | `10bc6ec:	4c 89 ff             	mov    rdi,r15` |
| `0x10bc6ef` | `10bc6ef:	e8 f4 e0 71 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0x10bc6fd` | `10bc6fd:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]` |
| `0x10bc711` | `10bc711:	e8 9a 33 73 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x10bc75d` | `10bc75d:	e8 0e 1e 73 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>` |
| `0x10bc767` | `10bc767:	e8 da b7 aa ff       	call   b67f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4ee6>` |
| `0x10bc778` | `10bc778:	49 39 ef             	cmp    r15,rbp` |
| `0x10bc7a6` | `10bc7a6:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]` |
| `0x10bc7b2` | `10bc7b2:	e8 d5 09 00 00       	call   10bd18c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2845a2>` |
| `0x10bc7bf` | `10bc7bf:	4d 39 ec             	cmp    r12,r13` |
| `0x10bc7cf` | `10bc7cf:	4c 89 ff             	mov    rdi,r15` |
| `0x10bc7d2` | `10bc7d2:	e8 5f f0 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0x10bc7da` | `10bc7da:	48 89 df             	mov    rdi,rbx` |
| `0x10bc7e3` | `10bc7e3:	e8 a6 ef 5b 00       	call   167b78e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8fa>` |
| `0x10bc7e8` | `10bc7e8:	4c 89 e7             	mov    rdi,r12` |
| `0x10bc7eb` | `10bc7eb:	e8 f2 1f 9e ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>` |
| `0x10bc7f3` | `10bc7f3:	4c 39 e8             	cmp    rax,r13` |
| `0x10bc7f8` | `10bc7f8:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]` |
| `0x10bc800` | `10bc800:	e8 bb 1d a2 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>` |
| `0x10bc809` | `10bc809:	49 39 ef             	cmp    r15,rbp` |
| `0x10bc711` | `10bc711:	e8 9a 33 73 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x10bc75d` | `10bc75d:	e8 0e 1e 73 00       	call   17ee570 <_ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_@plt>` |
| `0x10bc767` | `10bc767:	e8 da b7 aa ff       	call   b67f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4ee6>` |
| `0x10bc778` | `10bc778:	49 39 ef             	cmp    r15,rbp` |
| `0x10bc7a6` | `10bc7a6:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]` |
| `0x10bc7b2` | `10bc7b2:	e8 d5 09 00 00       	call   10bd18c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2845a2>` |
| `0x10bc7bf` | `10bc7bf:	4d 39 ec             	cmp    r12,r13` |
| `0x10bc7cf` | `10bc7cf:	4c 89 ff             	mov    rdi,r15` |
| `0x10bc7d2` | `10bc7d2:	e8 5f f0 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0x10bc7da` | `10bc7da:	48 89 df             	mov    rdi,rbx` |
| `0x10bc7e3` | `10bc7e3:	e8 a6 ef 5b 00       	call   167b78e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8fa>` |
| `0x10bc7e8` | `10bc7e8:	4c 89 e7             	mov    rdi,r12` |
| `0x10bc7eb` | `10bc7eb:	e8 f2 1f 9e ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>` |
| `0x10bc7f3` | `10bc7f3:	4c 39 e8             	cmp    rax,r13` |
| `0x10bc7f8` | `10bc7f8:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]` |
| `0x10bc800` | `10bc800:	e8 bb 1d a2 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>` |
| `0x10bc809` | `10bc809:	49 39 ef             	cmp    r15,rbp` |
| `0x10bc811` | `10bc811:	e8 ea 16 73 00       	call   17edf00 <_Znwm@plt>` |
| `0x10bc82f` | `10bc82f:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]` |
| `0x10bc838` | `10bc838:	48 85 c0             	test   rax,rax` |
| `0x10bc83d` | `10bc83d:	48 39 f8             	cmp    rax,rdi` |
| `0x10bc84c` | `10bc84c:	48 89 ef             	mov    rdi,rbp` |
| `0x10bc860` | `10bc860:	4c 89 ee             	mov    rsi,r13` |
| `0x10bc863` | `10bc863:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10bd025` | `10bd025:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]` |
| `0x10bd029` | `10bd029:	48 8b 73 30          	mov    rsi,QWORD PTR [rbx+0x30]` |
| `0x10bd04d` | `10bd04d:	e8 82 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10bd059` | `10bd059:	e8 76 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10bd065` | `10bd065:	e8 fc cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>` |
| `0x10bd071` | `10bd071:	e8 f0 cd 71 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>` |
| `0x10bd07d` | `10bd07d:	e8 d4 d6 ff ff       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>` |
| `0x10bd086` | `10bd086:	e8 49 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10bd08f` | `10bd08f:	48 89 df             	mov    rdi,rbx` |
| `0x10bd09c` | `10bd09c:	e8 97 ff ff ff       	call   10bd038 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28444e>` |
| `0x10bd0a1` | `10bd0a1:	48 89 df             	mov    rdi,rbx` |
| `0x10bd0d2` | `10bd0d2:	e8 d3 4c 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>` |
| `0x10bd0e3` | `10bd0e3:	e8 96 c9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10bd0e8` | `10bd0e8:	48 8b 33             	mov    rsi,QWORD PTR [rbx]` |
| `0x10bd0fa` | `10bd0fa:	4c 89 f7             	mov    rdi,r14` |
| `0x10bd103` | `10bd103:	e8 e8 5e 55 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>` |
| `0x10bd10f` | `10bd10f:	4c 89 f7             	mov    rdi,r14` |
| `0x10bd112` | `10bd112:	e8 38 e7 9b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10bd119` | `10bd119:	4c 89 f7             	mov    rdi,r14` |
| `0x10bd11c` | `10bd11c:	e8 6f 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bd121` | `10bd121:	4c 89 e7             	mov    rdi,r12` |
| `0x10bd124` | `10bd124:	e8 67 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bd129` | `10bd129:	4c 89 ff             	mov    rdi,r15` |
| `0x10bd12c` | `10bd12c:	e8 5f 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bd13a` | `10bd13a:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]` |
| `0x10bd157` | `10bd157:	e8 34 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bd165` | `10bd165:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]` |
| `0x10bd16c` | `10bd16c:	48 89 df             	mov    rdi,rbx` |
| `0x10bd16f` | `10bd16f:	e8 5c 2b 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x10bd174` | `10bd174:	e8 37 29 73 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x10bd17b` | `10bd17b:	48 85 f6             	test   rsi,rsi` |
| `0x10bd185` | `10bd185:	ff 10                	call   QWORD PTR [rax]` |
| `0x10bd07d` | `10bd07d:	e8 d4 d6 ff ff       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>` |
| `0x10bd086` | `10bd086:	e8 49 cb 71 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0x10bd08f` | `10bd08f:	48 89 df             	mov    rdi,rbx` |
| `0x10bd09c` | `10bd09c:	e8 97 ff ff ff       	call   10bd038 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28444e>` |
| `0x10bd0a1` | `10bd0a1:	48 89 df             	mov    rdi,rbx` |
| `0x10bd0d2` | `10bd0d2:	e8 d3 4c 70 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>` |
| `0x10bd0e3` | `10bd0e3:	e8 96 c9 9b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x10bd0e8` | `10bd0e8:	48 8b 33             	mov    rsi,QWORD PTR [rbx]` |
| `0x10bd0fa` | `10bd0fa:	4c 89 f7             	mov    rdi,r14` |
| `0x10bd103` | `10bd103:	e8 e8 5e 55 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>` |
| `0x10bd10f` | `10bd10f:	4c 89 f7             	mov    rdi,r14` |
| `0x10bd112` | `10bd112:	e8 38 e7 9b ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0x10bd119` | `10bd119:	4c 89 f7             	mov    rdi,r14` |
| `0x10bd11c` | `10bd11c:	e8 6f 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bd121` | `10bd121:	4c 89 e7             	mov    rdi,r12` |
| `0x10bd124` | `10bd124:	e8 67 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bd129` | `10bd129:	4c 89 ff             	mov    rdi,r15` |
| `0x10bd12c` | `10bd12c:	e8 5f 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bd13a` | `10bd13a:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]` |
| `0x10bd157` | `10bd157:	e8 34 0d 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x10bd165` | `10bd165:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]` |
| `0x10bd16c` | `10bd16c:	48 89 df             	mov    rdi,rbx` |
| `0x10bd16f` | `10bd16f:	e8 5c 2b 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x10bd174` | `10bd174:	e8 37 29 73 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x10bd17b` | `10bd17b:	48 85 f6             	test   rsi,rsi` |
| `0x10bd185` | `10bd185:	ff 10                	call   QWORD PTR [rax]` |
| `0x10bd1a2` | `10bd1a2:	49 89 f6             	mov    r14,rsi` |
| `0x10bd1c7` | `10bd1c7:	48 89 d7             	mov    rdi,rdx` |
| `0x10bd1ca` | `10bd1ca:	e8 67 e6 9b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0x10bd1d4` | `10bd1d4:	4c 89 e7             	mov    rdi,r12` |
| `0x10bd1d7` | `10bd1d7:	48 89 c6             	mov    rsi,rax` |
| `0x10bd1da` | `10bd1da:	e8 49 82 60 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>` |

## AP materializations / constructors

| addr | instruction |
|---:|---|
| `0x10ad19e` | `10ad19e:	48 8d 05 2b 04 7a 00 	lea    rax,[rip+0x7a042b]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>` |
| `0x10bd03c` | `10bd03c:	48 8d 05 8d 05 79 00 	lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>` |

## v8 interpretation checklist

- `10bb09e` and `10bb16e` are the two strongest direct readers of field `+0x60`.
- The next useful step after v8 is to name the callee reached immediately after the loaded `+0x60` object is moved into argument registers.
