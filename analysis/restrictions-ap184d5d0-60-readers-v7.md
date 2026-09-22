# Restrictions AP `0x184d5d0` `+0x60` reader trace

Parallel v7 report. Focus: actual method-table entries that read/call through `+0x60`, after the constructor stores the installed `this+0x18` object into `0x198+0x60`.

## AP relocation entries scanned

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
000000000184d7f0  0000000000000008 R_X86_64_RELATIVE                         18f8f00
000000000184d808  0000000000000008 R_X86_64_RELATIVE                         10ae330
000000000184d810  0000000000000008 R_X86_64_RELATIVE                         10be954
000000000184d818  0000000000000008 R_X86_64_RELATIVE                         10be966
000000000184d820  0000000000000008 R_X86_64_RELATIVE                         10bea08
000000000184d828  0000000000000008 R_X86_64_RELATIVE                         10beaaa
```
## Candidate `+0x60` hits inside AP method windows

| addr | instruction |
|---:|---|
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |
| `0x10bb186` | `10bb186:	48 8b 77 60          	mov    rsi,QWORD PTR [rdi+0x60]` |
| `0x10bb186` | `10bb186:	48 8b 77 60          	mov    rsi,QWORD PTR [rdi+0x60]` |
| `0x10bb29f` | `10bb29f:	48 8d 44 24 60       	lea    rax,[rsp+0x60]` |
| `0x10bb29f` | `10bb29f:	48 8d 44 24 60       	lea    rax,[rsp+0x60]` |

## Candidate AP entry `0x38` -> `0x10ba93e`

Hits:

| addr | instruction |
|---:|---|
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |

```text
 10ba92d:	eb c4                	jmp    10ba8f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d09>
 10ba92f:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10ba932:	0f 92 c0             	setb   al
 10ba935:	48 83 c4 08          	add    rsp,0x8
 10ba939:	5b                   	pop    rbx
 10ba93a:	41 5e                	pop    r14
 10ba93c:	c3                   	ret
 10ba93d:	cc                   	int3
 10ba93e:	48 83 ec 18          	sub    rsp,0x18
 10ba942:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba949:	00 00
 10ba94b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba950:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba953:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba958:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ba95b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba962:	00 00
 10ba964:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba969:	75 05                	jne    10ba970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d86>
 10ba96b:	48 83 c4 18          	add    rsp,0x18
 10ba96f:	c3                   	ret
 10ba970:	e8 3b 51 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba975:	cc                   	int3
 10ba976:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba97c:	31 c9                	xor    ecx,ecx
 10ba97e:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba982:	0f 93 c1             	setae  cl
 10ba985:	0f 92 c0             	setb   al
 10ba988:	01 c9                	add    ecx,ecx
 10ba98a:	89 0e                	mov    DWORD PTR [rsi],ecx
 10ba98c:	c3                   	ret
 10ba98d:	cc                   	int3
 10ba98e:	48 83 ec 18          	sub    rsp,0x18
 10ba992:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba999:	00 00
 10ba99b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba9a0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9a3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba9a8:	ff 50 50             	call   QWORD PTR [rax+0x50]
 10ba9ab:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba9b2:	00 00
 10ba9b4:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba9b9:	75 05                	jne    10ba9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281dd6>
 10ba9bb:	48 83 c4 18          	add    rsp,0x18
 10ba9bf:	c3                   	ret
 10ba9c0:	e8 eb 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba9c5:	cc                   	int3
 10ba9c6:	41 56                	push   r14
 10ba9c8:	53                   	push   rbx
 10ba9c9:	50                   	push   rax
 10ba9ca:	48 89 f3             	mov    rbx,rsi
 10ba9cd:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba9d3:	31 c0                	xor    eax,eax
 10ba9d5:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba9d9:	73 04                	jae    10ba9df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df5>
 10ba9db:	89 03                	mov    DWORD PTR [rbx],eax
 10ba9dd:	eb 38                	jmp    10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9df:	49 89 fe             	mov    r14,rdi
 10ba9e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9e5:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10ba9eb:	84 c0                	test   al,al
 10ba9ed:	74 28                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9ef:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba9f3:	e8 b2 26 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba9f8:	84 c0                	test   al,al
 10ba9fa:	74 1b                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9fc:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baa00:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baa04:	e8 71 27 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baa09:	34 01                	xor    al,0x1
 10baa0b:	0f b6 c0             	movzx  eax,al
 10baa0e:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
 10baa15:	eb c4                	jmp    10ba9db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df1>
 10baa17:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10baa1a:	0f 92 c0             	setb   al
 10baa1d:	48 83 c4 08          	add    rsp,0x8
 10baa21:	5b                   	pop    rbx
 10baa22:	41 5e                	pop    r14
 10baa24:	c3                   	ret
 10baa25:	cc                   	int3
 10baa26:	48 83 ec 18          	sub    rsp,0x18
 10baa2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baa31:	00 00
 10baa33:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baa38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa3b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]
 10baa43:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10baa4a:	00 00
 10baa4c:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baa51:	75 05                	jne    10baa58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e6e>
 10baa53:	48 83 c4 18          	add    rsp,0x18
 10baa57:	c3                   	ret
 10baa58:	e8 53 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10baa5d:	cc                   	int3
 10baa5e:	41 56                	push   r14
 10baa60:	53                   	push   rbx
 10baa61:	50                   	push   rax
```
## Candidate AP entry `0x40` -> `0x10ba976`

Hits:

| addr | instruction |
|---:|---|
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |

```text
 10ba95b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba962:	00 00
 10ba964:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba969:	75 05                	jne    10ba970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d86>
 10ba96b:	48 83 c4 18          	add    rsp,0x18
 10ba96f:	c3                   	ret
 10ba970:	e8 3b 51 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba975:	cc                   	int3
 10ba976:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba97c:	31 c9                	xor    ecx,ecx
 10ba97e:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba982:	0f 93 c1             	setae  cl
 10ba985:	0f 92 c0             	setb   al
 10ba988:	01 c9                	add    ecx,ecx
 10ba98a:	89 0e                	mov    DWORD PTR [rsi],ecx
 10ba98c:	c3                   	ret
 10ba98d:	cc                   	int3
 10ba98e:	48 83 ec 18          	sub    rsp,0x18
 10ba992:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba999:	00 00
 10ba99b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba9a0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9a3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba9a8:	ff 50 50             	call   QWORD PTR [rax+0x50]
 10ba9ab:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba9b2:	00 00
 10ba9b4:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba9b9:	75 05                	jne    10ba9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281dd6>
 10ba9bb:	48 83 c4 18          	add    rsp,0x18
 10ba9bf:	c3                   	ret
 10ba9c0:	e8 eb 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba9c5:	cc                   	int3
 10ba9c6:	41 56                	push   r14
 10ba9c8:	53                   	push   rbx
 10ba9c9:	50                   	push   rax
 10ba9ca:	48 89 f3             	mov    rbx,rsi
 10ba9cd:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba9d3:	31 c0                	xor    eax,eax
 10ba9d5:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba9d9:	73 04                	jae    10ba9df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df5>
 10ba9db:	89 03                	mov    DWORD PTR [rbx],eax
 10ba9dd:	eb 38                	jmp    10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9df:	49 89 fe             	mov    r14,rdi
 10ba9e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9e5:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10ba9eb:	84 c0                	test   al,al
 10ba9ed:	74 28                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9ef:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba9f3:	e8 b2 26 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba9f8:	84 c0                	test   al,al
 10ba9fa:	74 1b                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9fc:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baa00:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baa04:	e8 71 27 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baa09:	34 01                	xor    al,0x1
 10baa0b:	0f b6 c0             	movzx  eax,al
 10baa0e:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
 10baa15:	eb c4                	jmp    10ba9db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df1>
 10baa17:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10baa1a:	0f 92 c0             	setb   al
 10baa1d:	48 83 c4 08          	add    rsp,0x8
 10baa21:	5b                   	pop    rbx
 10baa22:	41 5e                	pop    r14
 10baa24:	c3                   	ret
 10baa25:	cc                   	int3
 10baa26:	48 83 ec 18          	sub    rsp,0x18
 10baa2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baa31:	00 00
 10baa33:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baa38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa3b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]
 10baa43:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10baa4a:	00 00
 10baa4c:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baa51:	75 05                	jne    10baa58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e6e>
 10baa53:	48 83 c4 18          	add    rsp,0x18
 10baa57:	c3                   	ret
 10baa58:	e8 53 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10baa5d:	cc                   	int3
 10baa5e:	41 56                	push   r14
 10baa60:	53                   	push   rbx
 10baa61:	50                   	push   rax
 10baa62:	48 89 f3             	mov    rbx,rsi
 10baa65:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10baa6b:	31 c0                	xor    eax,eax
 10baa6d:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10baa71:	73 04                	jae    10baa77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e8d>
 10baa73:	89 03                	mov    DWORD PTR [rbx],eax
 10baa75:	eb 2f                	jmp    10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa77:	49 89 fe             	mov    r14,rdi
 10baa7a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa7d:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10baa83:	84 c0                	test   al,al
 10baa85:	74 1f                	je     10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa87:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10baa8b:	e8 1a 26 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10baa90:	84 c0                	test   al,al
```
## Candidate AP entry `0x48` -> `0x10ba98e`

Hits:

| addr | instruction |
|---:|---|
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |

```text
 10ba97c:	31 c9                	xor    ecx,ecx
 10ba97e:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba982:	0f 93 c1             	setae  cl
 10ba985:	0f 92 c0             	setb   al
 10ba988:	01 c9                	add    ecx,ecx
 10ba98a:	89 0e                	mov    DWORD PTR [rsi],ecx
 10ba98c:	c3                   	ret
 10ba98d:	cc                   	int3
 10ba98e:	48 83 ec 18          	sub    rsp,0x18
 10ba992:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba999:	00 00
 10ba99b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba9a0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9a3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba9a8:	ff 50 50             	call   QWORD PTR [rax+0x50]
 10ba9ab:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba9b2:	00 00
 10ba9b4:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba9b9:	75 05                	jne    10ba9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281dd6>
 10ba9bb:	48 83 c4 18          	add    rsp,0x18
 10ba9bf:	c3                   	ret
 10ba9c0:	e8 eb 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba9c5:	cc                   	int3
 10ba9c6:	41 56                	push   r14
 10ba9c8:	53                   	push   rbx
 10ba9c9:	50                   	push   rax
 10ba9ca:	48 89 f3             	mov    rbx,rsi
 10ba9cd:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba9d3:	31 c0                	xor    eax,eax
 10ba9d5:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba9d9:	73 04                	jae    10ba9df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df5>
 10ba9db:	89 03                	mov    DWORD PTR [rbx],eax
 10ba9dd:	eb 38                	jmp    10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9df:	49 89 fe             	mov    r14,rdi
 10ba9e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9e5:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10ba9eb:	84 c0                	test   al,al
 10ba9ed:	74 28                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9ef:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba9f3:	e8 b2 26 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba9f8:	84 c0                	test   al,al
 10ba9fa:	74 1b                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9fc:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baa00:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baa04:	e8 71 27 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baa09:	34 01                	xor    al,0x1
 10baa0b:	0f b6 c0             	movzx  eax,al
 10baa0e:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
 10baa15:	eb c4                	jmp    10ba9db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df1>
 10baa17:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10baa1a:	0f 92 c0             	setb   al
 10baa1d:	48 83 c4 08          	add    rsp,0x8
 10baa21:	5b                   	pop    rbx
 10baa22:	41 5e                	pop    r14
 10baa24:	c3                   	ret
 10baa25:	cc                   	int3
 10baa26:	48 83 ec 18          	sub    rsp,0x18
 10baa2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baa31:	00 00
 10baa33:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baa38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa3b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]
 10baa43:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10baa4a:	00 00
 10baa4c:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baa51:	75 05                	jne    10baa58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e6e>
 10baa53:	48 83 c4 18          	add    rsp,0x18
 10baa57:	c3                   	ret
 10baa58:	e8 53 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10baa5d:	cc                   	int3
 10baa5e:	41 56                	push   r14
 10baa60:	53                   	push   rbx
 10baa61:	50                   	push   rax
 10baa62:	48 89 f3             	mov    rbx,rsi
 10baa65:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10baa6b:	31 c0                	xor    eax,eax
 10baa6d:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10baa71:	73 04                	jae    10baa77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e8d>
 10baa73:	89 03                	mov    DWORD PTR [rbx],eax
 10baa75:	eb 2f                	jmp    10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa77:	49 89 fe             	mov    r14,rdi
 10baa7a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa7d:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10baa83:	84 c0                	test   al,al
 10baa85:	74 1f                	je     10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa87:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10baa8b:	e8 1a 26 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10baa90:	84 c0                	test   al,al
 10baa92:	74 12                	je     10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa94:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baa98:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baa9c:	e8 d9 26 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baaa1:	0f b6 c0             	movzx  eax,al
 10baaa4:	eb cd                	jmp    10baa73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e89>
 10baaa6:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10baaa9:	0f 92 c0             	setb   al
 10baaac:	48 83 c4 08          	add    rsp,0x8
```
## Candidate AP entry `0x50` -> `0x10ba9c6`

Hits:

| addr | instruction |
|---:|---|
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |

```text
 10ba9ab:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba9b2:	00 00
 10ba9b4:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba9b9:	75 05                	jne    10ba9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281dd6>
 10ba9bb:	48 83 c4 18          	add    rsp,0x18
 10ba9bf:	c3                   	ret
 10ba9c0:	e8 eb 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba9c5:	cc                   	int3
 10ba9c6:	41 56                	push   r14
 10ba9c8:	53                   	push   rbx
 10ba9c9:	50                   	push   rax
 10ba9ca:	48 89 f3             	mov    rbx,rsi
 10ba9cd:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba9d3:	31 c0                	xor    eax,eax
 10ba9d5:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba9d9:	73 04                	jae    10ba9df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df5>
 10ba9db:	89 03                	mov    DWORD PTR [rbx],eax
 10ba9dd:	eb 38                	jmp    10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9df:	49 89 fe             	mov    r14,rdi
 10ba9e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba9e5:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10ba9eb:	84 c0                	test   al,al
 10ba9ed:	74 28                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9ef:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba9f3:	e8 b2 26 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba9f8:	84 c0                	test   al,al
 10ba9fa:	74 1b                	je     10baa17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e2d>
 10ba9fc:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baa00:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baa04:	e8 71 27 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baa09:	34 01                	xor    al,0x1
 10baa0b:	0f b6 c0             	movzx  eax,al
 10baa0e:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
 10baa15:	eb c4                	jmp    10ba9db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df1>
 10baa17:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10baa1a:	0f 92 c0             	setb   al
 10baa1d:	48 83 c4 08          	add    rsp,0x8
 10baa21:	5b                   	pop    rbx
 10baa22:	41 5e                	pop    r14
 10baa24:	c3                   	ret
 10baa25:	cc                   	int3
 10baa26:	48 83 ec 18          	sub    rsp,0x18
 10baa2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baa31:	00 00
 10baa33:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baa38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa3b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]
 10baa43:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10baa4a:	00 00
 10baa4c:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baa51:	75 05                	jne    10baa58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e6e>
 10baa53:	48 83 c4 18          	add    rsp,0x18
 10baa57:	c3                   	ret
 10baa58:	e8 53 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10baa5d:	cc                   	int3
 10baa5e:	41 56                	push   r14
 10baa60:	53                   	push   rbx
 10baa61:	50                   	push   rax
 10baa62:	48 89 f3             	mov    rbx,rsi
 10baa65:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10baa6b:	31 c0                	xor    eax,eax
 10baa6d:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10baa71:	73 04                	jae    10baa77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e8d>
 10baa73:	89 03                	mov    DWORD PTR [rbx],eax
 10baa75:	eb 2f                	jmp    10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa77:	49 89 fe             	mov    r14,rdi
 10baa7a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa7d:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10baa83:	84 c0                	test   al,al
 10baa85:	74 1f                	je     10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa87:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10baa8b:	e8 1a 26 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10baa90:	84 c0                	test   al,al
 10baa92:	74 12                	je     10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa94:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baa98:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baa9c:	e8 d9 26 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baaa1:	0f b6 c0             	movzx  eax,al
 10baaa4:	eb cd                	jmp    10baa73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e89>
 10baaa6:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10baaa9:	0f 92 c0             	setb   al
 10baaac:	48 83 c4 08          	add    rsp,0x8
 10baab0:	5b                   	pop    rbx
 10baab1:	41 5e                	pop    r14
 10baab3:	c3                   	ret
 10baab4:	48 83 ec 18          	sub    rsp,0x18
 10baab8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baabf:	00 00
 10baac1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baac6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baac9:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10baace:	ff 50 70             	call   QWORD PTR [rax+0x70]
 10baad1:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10baad8:	00 00
 10baada:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baadf:	75 05                	jne    10baae6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281efc>
 10baae1:	48 83 c4 18          	add    rsp,0x18
```
## Candidate AP entry `0x58` -> `0x10baa26`

Hits:

| addr | instruction |
|---:|---|
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |

```text
 10baa15:	eb c4                	jmp    10ba9db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281df1>
 10baa17:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10baa1a:	0f 92 c0             	setb   al
 10baa1d:	48 83 c4 08          	add    rsp,0x8
 10baa21:	5b                   	pop    rbx
 10baa22:	41 5e                	pop    r14
 10baa24:	c3                   	ret
 10baa25:	cc                   	int3
 10baa26:	48 83 ec 18          	sub    rsp,0x18
 10baa2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baa31:	00 00
 10baa33:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baa38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa3b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]
 10baa43:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10baa4a:	00 00
 10baa4c:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baa51:	75 05                	jne    10baa58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e6e>
 10baa53:	48 83 c4 18          	add    rsp,0x18
 10baa57:	c3                   	ret
 10baa58:	e8 53 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10baa5d:	cc                   	int3
 10baa5e:	41 56                	push   r14
 10baa60:	53                   	push   rbx
 10baa61:	50                   	push   rax
 10baa62:	48 89 f3             	mov    rbx,rsi
 10baa65:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10baa6b:	31 c0                	xor    eax,eax
 10baa6d:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10baa71:	73 04                	jae    10baa77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e8d>
 10baa73:	89 03                	mov    DWORD PTR [rbx],eax
 10baa75:	eb 2f                	jmp    10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa77:	49 89 fe             	mov    r14,rdi
 10baa7a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baa7d:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10baa83:	84 c0                	test   al,al
 10baa85:	74 1f                	je     10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa87:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10baa8b:	e8 1a 26 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10baa90:	84 c0                	test   al,al
 10baa92:	74 12                	je     10baaa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281ebc>
 10baa94:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10baa98:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10baa9c:	e8 d9 26 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10baaa1:	0f b6 c0             	movzx  eax,al
 10baaa4:	eb cd                	jmp    10baa73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281e89>
 10baaa6:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10baaa9:	0f 92 c0             	setb   al
 10baaac:	48 83 c4 08          	add    rsp,0x8
 10baab0:	5b                   	pop    rbx
 10baab1:	41 5e                	pop    r14
 10baab3:	c3                   	ret
 10baab4:	48 83 ec 18          	sub    rsp,0x18
 10baab8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baabf:	00 00
 10baac1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10baac6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baac9:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10baace:	ff 50 70             	call   QWORD PTR [rax+0x70]
 10baad1:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10baad8:	00 00
 10baada:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baadf:	75 05                	jne    10baae6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281efc>
 10baae1:	48 83 c4 18          	add    rsp,0x18
 10baae5:	c3                   	ret
 10baae6:	e8 c5 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10baaeb:	cc                   	int3
 10baaec:	41 56                	push   r14
 10baaee:	53                   	push   rbx
 10baaef:	50                   	push   rax
 10baaf0:	48 89 f3             	mov    rbx,rsi
 10baaf3:	49 89 fe             	mov    r14,rdi
 10baaf6:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10baafc:	31 c0                	xor    eax,eax
 10baafe:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bab02:	0f 93 c0             	setae  al
 10bab05:	01 c0                	add    eax,eax
 10bab07:	89 06                	mov    DWORD PTR [rsi],eax
 10bab09:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bab0d:	e8 98 25 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bab12:	84 c0                	test   al,al
 10bab14:	74 17                	je     10bab2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281f43>
 10bab16:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bab1a:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bab1e:	e8 57 26 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bab23:	84 c0                	test   al,al
 10bab25:	74 06                	je     10bab2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281f43>
 10bab27:	c7 03 01 00 00 00    	mov    DWORD PTR [rbx],0x1
 10bab2d:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10bab30:	0f 92 c0             	setb   al
 10bab33:	48 83 c4 08          	add    rsp,0x8
 10bab37:	5b                   	pop    rbx
 10bab38:	41 5e                	pop    r14
 10bab3a:	c3                   	ret
 10bab3b:	cc                   	int3
 10bab3c:	48 83 ec 18          	sub    rsp,0x18
 10bab40:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
```
## Candidate AP entry `0x128` -> `0x10bb002`

Hits:

| addr | instruction |
|---:|---|
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |

```text
 10bafee:	75 0d                	jne    10baffd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282413>
 10baff0:	48 89 d8             	mov    rax,rbx
 10baff3:	48 83 c4 50          	add    rsp,0x50
 10baff7:	5b                   	pop    rbx
 10baff8:	41 5e                	pop    r14
 10baffa:	41 5f                	pop    r15
 10baffc:	c3                   	ret
 10baffd:	e8 ae 4a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb002:	40 88 77 54          	mov    BYTE PTR [rdi+0x54],sil
 10bb006:	c3                   	ret
 10bb007:	cc                   	int3
 10bb008:	40 88 77 55          	mov    BYTE PTR [rdi+0x55],sil
 10bb00c:	c3                   	ret
 10bb00d:	cc                   	int3
 10bb00e:	31 c0                	xor    eax,eax
 10bb010:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bb014:	72 13                	jb     10bb029 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28243f>
 10bb016:	50                   	push   rax
 10bb017:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bb01b:	e8 8a 20 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bb020:	34 01                	xor    al,0x1
 10bb022:	0f b6 c0             	movzx  eax,al
 10bb025:	48 83 c4 08          	add    rsp,0x8
 10bb029:	c3                   	ret
 10bb02a:	31 c0                	xor    eax,eax
 10bb02c:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bb030:	0f 95 c0             	setne  al
 10bb033:	c3                   	ret
 10bb034:	41 56                	push   r14
 10bb036:	53                   	push   rbx
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
```
## Candidate AP entry `0x130` -> `0x10bb008`

Hits:

| addr | instruction |
|---:|---|
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |

```text
 10baff7:	5b                   	pop    rbx
 10baff8:	41 5e                	pop    r14
 10baffa:	41 5f                	pop    r15
 10baffc:	c3                   	ret
 10baffd:	e8 ae 4a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb002:	40 88 77 54          	mov    BYTE PTR [rdi+0x54],sil
 10bb006:	c3                   	ret
 10bb007:	cc                   	int3
 10bb008:	40 88 77 55          	mov    BYTE PTR [rdi+0x55],sil
 10bb00c:	c3                   	ret
 10bb00d:	cc                   	int3
 10bb00e:	31 c0                	xor    eax,eax
 10bb010:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bb014:	72 13                	jb     10bb029 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28243f>
 10bb016:	50                   	push   rax
 10bb017:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bb01b:	e8 8a 20 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bb020:	34 01                	xor    al,0x1
 10bb022:	0f b6 c0             	movzx  eax,al
 10bb025:	48 83 c4 08          	add    rsp,0x8
 10bb029:	c3                   	ret
 10bb02a:	31 c0                	xor    eax,eax
 10bb02c:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bb030:	0f 95 c0             	setne  al
 10bb033:	c3                   	ret
 10bb034:	41 56                	push   r14
 10bb036:	53                   	push   rbx
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
```
## Candidate AP entry `0x138` -> `0x10bb00e`

Hits:

| addr | instruction |
|---:|---|
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |

```text
 10baffc:	c3                   	ret
 10baffd:	e8 ae 4a 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bb002:	40 88 77 54          	mov    BYTE PTR [rdi+0x54],sil
 10bb006:	c3                   	ret
 10bb007:	cc                   	int3
 10bb008:	40 88 77 55          	mov    BYTE PTR [rdi+0x55],sil
 10bb00c:	c3                   	ret
 10bb00d:	cc                   	int3
 10bb00e:	31 c0                	xor    eax,eax
 10bb010:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bb014:	72 13                	jb     10bb029 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28243f>
 10bb016:	50                   	push   rax
 10bb017:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bb01b:	e8 8a 20 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bb020:	34 01                	xor    al,0x1
 10bb022:	0f b6 c0             	movzx  eax,al
 10bb025:	48 83 c4 08          	add    rsp,0x8
 10bb029:	c3                   	ret
 10bb02a:	31 c0                	xor    eax,eax
 10bb02c:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bb030:	0f 95 c0             	setne  al
 10bb033:	c3                   	ret
 10bb034:	41 56                	push   r14
 10bb036:	53                   	push   rbx
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
```
## Candidate AP entry `0x140` -> `0x10bb02a`

Hits:

| addr | instruction |
|---:|---|
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |

```text
 10bb014:	72 13                	jb     10bb029 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28243f>
 10bb016:	50                   	push   rax
 10bb017:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bb01b:	e8 8a 20 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bb020:	34 01                	xor    al,0x1
 10bb022:	0f b6 c0             	movzx  eax,al
 10bb025:	48 83 c4 08          	add    rsp,0x8
 10bb029:	c3                   	ret
 10bb02a:	31 c0                	xor    eax,eax
 10bb02c:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bb030:	0f 95 c0             	setne  al
 10bb033:	c3                   	ret
 10bb034:	41 56                	push   r14
 10bb036:	53                   	push   rbx
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
```
## Candidate AP entry `0x148` -> `0x10bb034`

Hits:

| addr | instruction |
|---:|---|
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |

```text
 10bb020:	34 01                	xor    al,0x1
 10bb022:	0f b6 c0             	movzx  eax,al
 10bb025:	48 83 c4 08          	add    rsp,0x8
 10bb029:	c3                   	ret
 10bb02a:	31 c0                	xor    eax,eax
 10bb02c:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bb030:	0f 95 c0             	setne  al
 10bb033:	c3                   	ret
 10bb034:	41 56                	push   r14
 10bb036:	53                   	push   rbx
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
```
## Candidate AP entry `0x150` -> `0x10bb09e`

Hits:

| addr | instruction |
|---:|---|
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |
| `0x10bb186` | `10bb186:	48 8b 77 60          	mov    rsi,QWORD PTR [rdi+0x60]` |

```text
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
```
## Candidate AP entry `0x158` -> `0x10bb16e`

Hits:

| addr | instruction |
|---:|---|
| `0x10bb186` | `10bb186:	48 8b 77 60          	mov    rsi,QWORD PTR [rdi+0x60]` |
| `0x10bb29f` | `10bb29f:	48 8d 44 24 60       	lea    rax,[rsp+0x60]` |

```text
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
```
## Candidate AP entry `0x160` -> `0x10bb258`

Hits:

| addr | instruction |
|---:|---|
| `0x10bb29f` | `10bb29f:	48 8d 44 24 60       	lea    rax,[rsp+0x60]` |

```text
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
```
## Broader nearby `+0x60` references

| addr | instruction |
|---:|---|
| `0x10ad217` | `10ad217:	48 89 5d 60          	mov    QWORD PTR [rbp+0x60],rbx` |
| `0x10ae17f` | `10ae17f:	48 8d 7b 60          	lea    rdi,[rbx+0x60]` |
| `0x10ae226` | `10ae226:	48 8b 47 60          	mov    rax,QWORD PTR [rdi+0x60]` |
| `0x10ae230` | `10ae230:	48 8b 4f 60          	mov    rcx,QWORD PTR [rdi+0x60]` |
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |
| `0x10bb0e5` | `10bb0e5:	4c 8b 77 60          	mov    r14,QWORD PTR [rdi+0x60]` |
| `0x10bb186` | `10bb186:	48 8b 77 60          	mov    rsi,QWORD PTR [rdi+0x60]` |
| `0x10bc3bb` | `10bc3bb:	41 80 7f 60 00       	cmp    BYTE PTR [r15+0x60],0x0` |

