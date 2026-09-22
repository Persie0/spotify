# Restrictions AP `0x184d5d0` / `0x198` object method trace

Parallel v6 report. Focus: methods of the late `0x198` object that captures installed `this+0x18` at object field `+0x60`.

## Relocation-backed entries near AP `0x184d5d0`

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
```
## AP entry `0x0` -> `0xa3fa60`

```text
  a3fa4a:	cc                   	int3
  a3fa4b:	cc                   	int3
  a3fa4c:	cc                   	int3
  a3fa4d:	cc                   	int3
  a3fa4e:	cc                   	int3
  a3fa4f:	cc                   	int3
  a3fa50:	b8 01 00 00 00       	mov    eax,0x1
  a3fa55:	c3                   	ret
  a3fa56:	cc                   	int3
  a3fa57:	cc                   	int3
  a3fa58:	cc                   	int3
  a3fa59:	cc                   	int3
  a3fa5a:	cc                   	int3
  a3fa5b:	cc                   	int3
  a3fa5c:	cc                   	int3
  a3fa5d:	cc                   	int3
  a3fa5e:	cc                   	int3
  a3fa5f:	cc                   	int3
  a3fa60:	b0 01                	mov    al,0x1
  a3fa62:	c3                   	ret
  a3fa63:	cc                   	int3
  a3fa64:	cc                   	int3
  a3fa65:	cc                   	int3
  a3fa66:	cc                   	int3
  a3fa67:	cc                   	int3
  a3fa68:	cc                   	int3
  a3fa69:	cc                   	int3
  a3fa6a:	cc                   	int3
  a3fa6b:	cc                   	int3
  a3fa6c:	cc                   	int3
  a3fa6d:	cc                   	int3
  a3fa6e:	cc                   	int3
  a3fa6f:	cc                   	int3
  a3fa70:	48 89 c8             	mov    rax,rcx
  a3fa73:	48 29 d0             	sub    rax,rdx
  a3fa76:	4c 39 c0             	cmp    rax,r8
  a3fa79:	49 0f 43 c0          	cmovae rax,r8
  a3fa7d:	c3                   	ret
  a3fa7e:	cc                   	int3
  a3fa7f:	cc                   	int3
  a3fa80:	41 56                	push   r14
  a3fa82:	53                   	push   rbx
  a3fa83:	50                   	push   rax
  a3fa84:	48 89 fb             	mov    rbx,rdi
  a3fa87:	48 ff ce             	dec    rsi
  a3fa8a:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
  a3fa8e:	48 8b 05 ab 27 e7 00 	mov    rax,QWORD PTR [rip+0xe727ab]        # 18b2240 <_ZTVNSt6__ndk17codecvtIwc9mbstate_tEE@@Base+0xbbc58>
  a3fa95:	48 83 c0 10          	add    rax,0x10
  a3fa99:	48 89 07             	mov    QWORD PTR [rdi],rax
  a3fa9c:	0f b6 05 8d ff f9 00 	movzx  eax,BYTE PTR [rip+0xf9ff8d]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
  a3faa3:	84 c0                	test   al,al
  a3faa5:	74 13                	je     a3faba <_ZNSt6__ndk17codecvtIwc9mbstate_tEC1Em@@Base+0x3a>
  a3faa7:	48 8b 05 7a ff f9 00 	mov    rax,QWORD PTR [rip+0xf9ff7a]        # 19dfa28 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x10>
  a3faae:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  a3fab2:	48 83 c4 08          	add    rsp,0x8
  a3fab6:	5b                   	pop    rbx
  a3fab7:	41 5e                	pop    r14
  a3fab9:	c3                   	ret
  a3faba:	48 8d 3d 6f ff f9 00 	lea    rdi,[rip+0xf9ff6f]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
  a3fac1:	e8 aa e6 da 00       	call   17ee170 <__cxa_guard_acquire@plt>
  a3fac6:	85 c0                	test   eax,eax
  a3fac8:	74 dd                	je     a3faa7 <_ZNSt6__ndk17codecvtIwc9mbstate_tEC1Em@@Base+0x27>
  a3faca:	48 8d 35 3b 94 92 ff 	lea    rsi,[rip+0xffffffffff92943b]        # 368f0c <_ZTSSt12bad_any_cast@@Base-0x272bc>
  a3fad1:	bf bf 1f 00 00       	mov    edi,0x1fbf
  a3fad6:	31 d2                	xor    edx,edx
  a3fad8:	e8 b3 06 db 00       	call   17f0190 <newlocale@plt>
  a3fadd:	48 89 05 44 ff f9 00 	mov    QWORD PTR [rip+0xf9ff44],rax        # 19dfa28 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x10>
  a3fae4:	48 8d 3d 45 ff f9 00 	lea    rdi,[rip+0xf9ff45]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
  a3faeb:	e8 90 e6 da 00       	call   17ee180 <__cxa_guard_release@plt>
  a3faf0:	eb b5                	jmp    a3faa7 <_ZNSt6__ndk17codecvtIwc9mbstate_tEC1Em@@Base+0x27>
  a3faf2:	49 89 c6             	mov    r14,rax
  a3faf5:	48 8d 3d 34 ff f9 00 	lea    rdi,[rip+0xf9ff34]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
  a3fafc:	e8 ff ec da 00       	call   17ee800 <__cxa_guard_abort@plt>
  a3fb01:	48 89 df             	mov    rdi,rbx
  a3fb04:	e8 97 f6 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
  a3fb09:	4c 89 f7             	mov    rdi,r14
  a3fb0c:	e8 bf 01 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a3fb11:	cc                   	int3
  a3fb12:	cc                   	int3
  a3fb13:	cc                   	int3
  a3fb14:	cc                   	int3
  a3fb15:	cc                   	int3
  a3fb16:	cc                   	int3
  a3fb17:	cc                   	int3
  a3fb18:	cc                   	int3
  a3fb19:	cc                   	int3
```
## AP entry `0x8` -> `0x10ba7ca`

```text
 10ba794:	e9 87 37 73 00       	jmp    17edf20 <_ZdlPv@plt>
 10ba799:	5b                   	pop    rbx
 10ba79a:	41 5e                	pop    r14
 10ba79c:	41 5f                	pop    r15
 10ba79e:	c3                   	ret
 10ba79f:	cc                   	int3
 10ba7a0:	53                   	push   rbx
 10ba7a1:	48 89 fb             	mov    rbx,rdi
 10ba7a4:	48 83 c7 40          	add    rdi,0x40
 10ba7a8:	e8 e3 36 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ba7ad:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
 10ba7b1:	e8 32 0e 9c ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
 10ba7b6:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
 10ba7ba:	e8 f3 3c 9e ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 10ba7bf:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ba7c3:	5b                   	pop    rbx
 10ba7c4:	e9 bd 3c 9e ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ba7c9:	cc                   	int3
 10ba7ca:	48 83 ec 18          	sub    rsp,0x18
 10ba7ce:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba7d5:	00 00
 10ba7d7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba7dc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba7df:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba7e4:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ba7e7:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba7ee:	00 00
 10ba7f0:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba7f5:	75 05                	jne    10ba7fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281c12>
 10ba7f7:	48 83 c4 18          	add    rsp,0x18
 10ba7fb:	c3                   	ret
 10ba7fc:	e8 af 52 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba801:	cc                   	int3
 10ba802:	41 56                	push   r14
 10ba804:	53                   	push   rbx
 10ba805:	50                   	push   rax
 10ba806:	48 89 f3             	mov    rbx,rsi
 10ba809:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba80f:	31 c0                	xor    eax,eax
 10ba811:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba815:	72 46                	jb     10ba85d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281c73>
 10ba817:	49 89 fe             	mov    r14,rdi
 10ba81a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba81d:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10ba823:	84 c0                	test   al,al
 10ba825:	75 10                	jne    10ba837 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281c4d>
 10ba827:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10ba82a:	4c 89 f7             	mov    rdi,r14
 10ba82d:	ff 90 a8 01 00 00    	call   QWORD PTR [rax+0x1a8]
 10ba833:	84 c0                	test   al,al
 10ba835:	74 28                	je     10ba85f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281c75>
 10ba837:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba83b:	e8 6a 28 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba840:	84 c0                	test   al,al
 10ba842:	74 1b                	je     10ba85f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281c75>
 10ba844:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10ba848:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10ba84c:	e8 29 29 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10ba851:	34 01                	xor    al,0x1
 10ba853:	0f b6 c0             	movzx  eax,al
 10ba856:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
 10ba85d:	89 03                	mov    DWORD PTR [rbx],eax
 10ba85f:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10ba862:	0f 92 c0             	setb   al
 10ba865:	48 83 c4 08          	add    rsp,0x8
 10ba869:	5b                   	pop    rbx
 10ba86a:	41 5e                	pop    r14
 10ba86c:	c3                   	ret
 10ba86d:	cc                   	int3
 10ba86e:	48 83 ec 18          	sub    rsp,0x18
 10ba872:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba879:	00 00
 10ba87b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba880:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba883:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba888:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10ba88b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba892:	00 00
 10ba894:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba899:	75 05                	jne    10ba8a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281cb6>
 10ba89b:	48 83 c4 18          	add    rsp,0x18
 10ba89f:	c3                   	ret
 10ba8a0:	e8 0b 52 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba8a5:	cc                   	int3
 10ba8a6:	48 83 ec 18          	sub    rsp,0x18
 10ba8aa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
```
## AP entry `0x10` -> `0x10ba802`

```text
 10ba7c3:	5b                   	pop    rbx
 10ba7c4:	e9 bd 3c 9e ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ba7c9:	cc                   	int3
 10ba7ca:	48 83 ec 18          	sub    rsp,0x18
 10ba7ce:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba7d5:	00 00
 10ba7d7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba7dc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba7df:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba7e4:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ba7e7:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba7ee:	00 00
 10ba7f0:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba7f5:	75 05                	jne    10ba7fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281c12>
 10ba7f7:	48 83 c4 18          	add    rsp,0x18
 10ba7fb:	c3                   	ret
 10ba7fc:	e8 af 52 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba801:	cc                   	int3
 10ba802:	41 56                	push   r14
 10ba804:	53                   	push   rbx
 10ba805:	50                   	push   rax
 10ba806:	48 89 f3             	mov    rbx,rsi
 10ba809:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba80f:	31 c0                	xor    eax,eax
 10ba811:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba815:	72 46                	jb     10ba85d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281c73>
 10ba817:	49 89 fe             	mov    r14,rdi
 10ba81a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba81d:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
 10ba823:	84 c0                	test   al,al
 10ba825:	75 10                	jne    10ba837 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281c4d>
 10ba827:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10ba82a:	4c 89 f7             	mov    rdi,r14
 10ba82d:	ff 90 a8 01 00 00    	call   QWORD PTR [rax+0x1a8]
 10ba833:	84 c0                	test   al,al
 10ba835:	74 28                	je     10ba85f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281c75>
 10ba837:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba83b:	e8 6a 28 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba840:	84 c0                	test   al,al
 10ba842:	74 1b                	je     10ba85f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281c75>
 10ba844:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10ba848:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10ba84c:	e8 29 29 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10ba851:	34 01                	xor    al,0x1
 10ba853:	0f b6 c0             	movzx  eax,al
 10ba856:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
 10ba85d:	89 03                	mov    DWORD PTR [rbx],eax
 10ba85f:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10ba862:	0f 92 c0             	setb   al
 10ba865:	48 83 c4 08          	add    rsp,0x8
 10ba869:	5b                   	pop    rbx
 10ba86a:	41 5e                	pop    r14
 10ba86c:	c3                   	ret
 10ba86d:	cc                   	int3
 10ba86e:	48 83 ec 18          	sub    rsp,0x18
 10ba872:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba879:	00 00
 10ba87b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba880:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba883:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba888:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10ba88b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba892:	00 00
 10ba894:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba899:	75 05                	jne    10ba8a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281cb6>
 10ba89b:	48 83 c4 18          	add    rsp,0x18
 10ba89f:	c3                   	ret
 10ba8a0:	e8 0b 52 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba8a5:	cc                   	int3
 10ba8a6:	48 83 ec 18          	sub    rsp,0x18
 10ba8aa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba8b1:	00 00
 10ba8b3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba8b8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba8bb:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba8c0:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10ba8c3:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba8ca:	00 00
 10ba8cc:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba8d1:	75 05                	jne    10ba8d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281cee>
 10ba8d3:	48 83 c4 18          	add    rsp,0x18
 10ba8d7:	c3                   	ret
 10ba8d8:	e8 d3 51 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba8dd:	cc                   	int3
 10ba8de:	41 56                	push   r14
 10ba8e0:	53                   	push   rbx
```
## AP entry `0x18` -> `0x10ba86e`

```text
 10ba837:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba83b:	e8 6a 28 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba840:	84 c0                	test   al,al
 10ba842:	74 1b                	je     10ba85f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281c75>
 10ba844:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10ba848:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10ba84c:	e8 29 29 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10ba851:	34 01                	xor    al,0x1
 10ba853:	0f b6 c0             	movzx  eax,al
 10ba856:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
 10ba85d:	89 03                	mov    DWORD PTR [rbx],eax
 10ba85f:	83 3b 02             	cmp    DWORD PTR [rbx],0x2
 10ba862:	0f 92 c0             	setb   al
 10ba865:	48 83 c4 08          	add    rsp,0x8
 10ba869:	5b                   	pop    rbx
 10ba86a:	41 5e                	pop    r14
 10ba86c:	c3                   	ret
 10ba86d:	cc                   	int3
 10ba86e:	48 83 ec 18          	sub    rsp,0x18
 10ba872:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba879:	00 00
 10ba87b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba880:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba883:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba888:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10ba88b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba892:	00 00
 10ba894:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba899:	75 05                	jne    10ba8a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281cb6>
 10ba89b:	48 83 c4 18          	add    rsp,0x18
 10ba89f:	c3                   	ret
 10ba8a0:	e8 0b 52 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba8a5:	cc                   	int3
 10ba8a6:	48 83 ec 18          	sub    rsp,0x18
 10ba8aa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba8b1:	00 00
 10ba8b3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba8b8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba8bb:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba8c0:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10ba8c3:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba8ca:	00 00
 10ba8cc:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba8d1:	75 05                	jne    10ba8d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281cee>
 10ba8d3:	48 83 c4 18          	add    rsp,0x18
 10ba8d7:	c3                   	ret
 10ba8d8:	e8 d3 51 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba8dd:	cc                   	int3
 10ba8de:	41 56                	push   r14
 10ba8e0:	53                   	push   rbx
 10ba8e1:	50                   	push   rax
 10ba8e2:	48 89 f3             	mov    rbx,rsi
 10ba8e5:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba8eb:	31 c0                	xor    eax,eax
 10ba8ed:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba8f1:	73 04                	jae    10ba8f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d0d>
 10ba8f3:	89 03                	mov    DWORD PTR [rbx],eax
 10ba8f5:	eb 38                	jmp    10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba8f7:	49 89 fe             	mov    r14,rdi
 10ba8fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba8fd:	ff 90 a8 01 00 00    	call   QWORD PTR [rax+0x1a8]
 10ba903:	84 c0                	test   al,al
 10ba905:	74 28                	je     10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba907:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba90b:	e8 9a 27 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba910:	84 c0                	test   al,al
 10ba912:	74 1b                	je     10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba914:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10ba918:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10ba91c:	e8 59 28 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10ba921:	34 01                	xor    al,0x1
 10ba923:	0f b6 c0             	movzx  eax,al
 10ba926:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
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
```
## AP entry `0x28` -> `0x10ba8a6`

```text
 10ba86a:	41 5e                	pop    r14
 10ba86c:	c3                   	ret
 10ba86d:	cc                   	int3
 10ba86e:	48 83 ec 18          	sub    rsp,0x18
 10ba872:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba879:	00 00
 10ba87b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba880:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba883:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba888:	ff 50 20             	call   QWORD PTR [rax+0x20]
 10ba88b:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba892:	00 00
 10ba894:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba899:	75 05                	jne    10ba8a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281cb6>
 10ba89b:	48 83 c4 18          	add    rsp,0x18
 10ba89f:	c3                   	ret
 10ba8a0:	e8 0b 52 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba8a5:	cc                   	int3
 10ba8a6:	48 83 ec 18          	sub    rsp,0x18
 10ba8aa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba8b1:	00 00
 10ba8b3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba8b8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba8bb:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba8c0:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10ba8c3:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba8ca:	00 00
 10ba8cc:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba8d1:	75 05                	jne    10ba8d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281cee>
 10ba8d3:	48 83 c4 18          	add    rsp,0x18
 10ba8d7:	c3                   	ret
 10ba8d8:	e8 d3 51 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba8dd:	cc                   	int3
 10ba8de:	41 56                	push   r14
 10ba8e0:	53                   	push   rbx
 10ba8e1:	50                   	push   rax
 10ba8e2:	48 89 f3             	mov    rbx,rsi
 10ba8e5:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba8eb:	31 c0                	xor    eax,eax
 10ba8ed:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba8f1:	73 04                	jae    10ba8f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d0d>
 10ba8f3:	89 03                	mov    DWORD PTR [rbx],eax
 10ba8f5:	eb 38                	jmp    10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba8f7:	49 89 fe             	mov    r14,rdi
 10ba8fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba8fd:	ff 90 a8 01 00 00    	call   QWORD PTR [rax+0x1a8]
 10ba903:	84 c0                	test   al,al
 10ba905:	74 28                	je     10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba907:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba90b:	e8 9a 27 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba910:	84 c0                	test   al,al
 10ba912:	74 1b                	je     10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba914:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10ba918:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10ba91c:	e8 59 28 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10ba921:	34 01                	xor    al,0x1
 10ba923:	0f b6 c0             	movzx  eax,al
 10ba926:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
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
```
## AP entry `0x30` -> `0x10ba8de`

```text
 10ba89f:	c3                   	ret
 10ba8a0:	e8 0b 52 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba8a5:	cc                   	int3
 10ba8a6:	48 83 ec 18          	sub    rsp,0x18
 10ba8aa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ba8b1:	00 00
 10ba8b3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10ba8b8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba8bb:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10ba8c0:	ff 50 30             	call   QWORD PTR [rax+0x30]
 10ba8c3:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10ba8ca:	00 00
 10ba8cc:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10ba8d1:	75 05                	jne    10ba8d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281cee>
 10ba8d3:	48 83 c4 18          	add    rsp,0x18
 10ba8d7:	c3                   	ret
 10ba8d8:	e8 d3 51 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba8dd:	cc                   	int3
 10ba8de:	41 56                	push   r14
 10ba8e0:	53                   	push   rbx
 10ba8e1:	50                   	push   rax
 10ba8e2:	48 89 f3             	mov    rbx,rsi
 10ba8e5:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
 10ba8eb:	31 c0                	xor    eax,eax
 10ba8ed:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10ba8f1:	73 04                	jae    10ba8f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d0d>
 10ba8f3:	89 03                	mov    DWORD PTR [rbx],eax
 10ba8f5:	eb 38                	jmp    10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba8f7:	49 89 fe             	mov    r14,rdi
 10ba8fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ba8fd:	ff 90 a8 01 00 00    	call   QWORD PTR [rax+0x1a8]
 10ba903:	84 c0                	test   al,al
 10ba905:	74 28                	je     10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba907:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba90b:	e8 9a 27 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba910:	84 c0                	test   al,al
 10ba912:	74 1b                	je     10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba914:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10ba918:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10ba91c:	e8 59 28 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10ba921:	34 01                	xor    al,0x1
 10ba923:	0f b6 c0             	movzx  eax,al
 10ba926:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
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
```
## AP entry `0x38` -> `0x10ba93e`

```text
 10ba907:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10ba90b:	e8 9a 27 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10ba910:	84 c0                	test   al,al
 10ba912:	74 1b                	je     10ba92f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281d45>
 10ba914:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10ba918:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10ba91c:	e8 59 28 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10ba921:	34 01                	xor    al,0x1
 10ba923:	0f b6 c0             	movzx  eax,al
 10ba926:	8d 04 45 01 00 00 00 	lea    eax,[rax*2+0x1]
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
```
## AP entry `0x40` -> `0x10ba976`

```text
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
```
## AP entry `0x48` -> `0x10ba98e`

```text
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
 10baa62:	48 89 f3             	mov    rbx,rsi
 10baa65:	c7 06 02 00 00 00    	mov    DWORD PTR [rsi],0x2
```
## AP entry `0x50` -> `0x10ba9c6`

```text
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
```
## AP entry `0x58` -> `0x10baa26`

```text
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
```
## AP entry `0x60` -> `0x10baa5e`

```text
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
```
## AP entry `0x68` -> `0x10baab4`

```text
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
 10bab47:	00 00
 10bab49:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab4e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab51:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab56:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
 10bab5c:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab63:	00 00
 10bab65:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bab6a:	75 05                	jne    10bab71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281f87>
 10bab6c:	48 83 c4 18          	add    rsp,0x18
 10bab70:	c3                   	ret
 10bab71:	e8 3a 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bab76:	48 83 ec 18          	sub    rsp,0x18
 10bab7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bab81:	00 00
 10bab83:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab8b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab90:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
 10bab96:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab9d:	00 00
 10bab9f:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baba4:	75 05                	jne    10babab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281fc1>
```
## AP entry `0x70` -> `0x10baaec`

```text
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
 10bab47:	00 00
 10bab49:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab4e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab51:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab56:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
 10bab5c:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab63:	00 00
 10bab65:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bab6a:	75 05                	jne    10bab71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281f87>
 10bab6c:	48 83 c4 18          	add    rsp,0x18
 10bab70:	c3                   	ret
 10bab71:	e8 3a 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bab76:	48 83 ec 18          	sub    rsp,0x18
 10bab7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bab81:	00 00
 10bab83:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab8b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab90:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
 10bab96:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab9d:	00 00
 10bab9f:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baba4:	75 05                	jne    10babab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281fc1>
 10baba6:	48 83 c4 18          	add    rsp,0x18
 10babaa:	c3                   	ret
 10babab:	e8 00 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10babb0:	41 56                	push   r14
 10babb2:	53                   	push   rbx
 10babb3:	50                   	push   rax
 10babb4:	48 89 f3             	mov    rbx,rsi
 10babb7:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10babbd:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10babc0:	83 e0 fe             	and    eax,0xfffffffe
 10babc3:	83 f8 02             	cmp    eax,0x2
 10babc6:	75 31                	jne    10babf9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28200f>
 10babc8:	49 89 fe             	mov    r14,rdi
 10babcb:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10babcf:	e8 d6 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
```
## AP entry `0x78` -> `0x10bab3c`

```text
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
 10bab47:	00 00
 10bab49:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab4e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab51:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab56:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
 10bab5c:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab63:	00 00
 10bab65:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bab6a:	75 05                	jne    10bab71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281f87>
 10bab6c:	48 83 c4 18          	add    rsp,0x18
 10bab70:	c3                   	ret
 10bab71:	e8 3a 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bab76:	48 83 ec 18          	sub    rsp,0x18
 10bab7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bab81:	00 00
 10bab83:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab8b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab90:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
 10bab96:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab9d:	00 00
 10bab9f:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baba4:	75 05                	jne    10babab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281fc1>
 10baba6:	48 83 c4 18          	add    rsp,0x18
 10babaa:	c3                   	ret
 10babab:	e8 00 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10babb0:	41 56                	push   r14
 10babb2:	53                   	push   rbx
 10babb3:	50                   	push   rax
 10babb4:	48 89 f3             	mov    rbx,rsi
 10babb7:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10babbd:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10babc0:	83 e0 fe             	and    eax,0xfffffffe
 10babc3:	83 f8 02             	cmp    eax,0x2
 10babc6:	75 31                	jne    10babf9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28200f>
 10babc8:	49 89 fe             	mov    r14,rdi
 10babcb:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10babcf:	e8 d6 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10babd4:	84 c0                	test   al,al
 10babd6:	74 28                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babd8:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10babdc:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10babe0:	e8 95 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10babe5:	84 c0                	test   al,al
 10babe7:	74 17                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babe9:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10babec:	4c 89 f7             	mov    rdi,r14
 10babef:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
 10babf5:	84 c0                	test   al,al
 10babf7:	74 07                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babf9:	83 23 00             	and    DWORD PTR [rbx],0x0
 10babfc:	b0 01                	mov    al,0x1
 10babfe:	eb 02                	jmp    10bac02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282018>
 10bac00:	31 c0                	xor    eax,eax
 10bac02:	48 83 c4 08          	add    rsp,0x8
 10bac06:	5b                   	pop    rbx
 10bac07:	41 5e                	pop    r14
 10bac09:	c3                   	ret
 10bac0a:	48 83 ec 18          	sub    rsp,0x18
 10bac0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bac15:	00 00
 10bac17:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bac1c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bac1f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bac24:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 10bac2a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
```
## AP entry `0x88` -> `0x10bab76`

```text
 10bab37:	5b                   	pop    rbx
 10bab38:	41 5e                	pop    r14
 10bab3a:	c3                   	ret
 10bab3b:	cc                   	int3
 10bab3c:	48 83 ec 18          	sub    rsp,0x18
 10bab40:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bab47:	00 00
 10bab49:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab4e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab51:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab56:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
 10bab5c:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab63:	00 00
 10bab65:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bab6a:	75 05                	jne    10bab71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281f87>
 10bab6c:	48 83 c4 18          	add    rsp,0x18
 10bab70:	c3                   	ret
 10bab71:	e8 3a 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bab76:	48 83 ec 18          	sub    rsp,0x18
 10bab7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bab81:	00 00
 10bab83:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab8b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab90:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
 10bab96:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab9d:	00 00
 10bab9f:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baba4:	75 05                	jne    10babab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281fc1>
 10baba6:	48 83 c4 18          	add    rsp,0x18
 10babaa:	c3                   	ret
 10babab:	e8 00 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10babb0:	41 56                	push   r14
 10babb2:	53                   	push   rbx
 10babb3:	50                   	push   rax
 10babb4:	48 89 f3             	mov    rbx,rsi
 10babb7:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10babbd:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10babc0:	83 e0 fe             	and    eax,0xfffffffe
 10babc3:	83 f8 02             	cmp    eax,0x2
 10babc6:	75 31                	jne    10babf9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28200f>
 10babc8:	49 89 fe             	mov    r14,rdi
 10babcb:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10babcf:	e8 d6 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10babd4:	84 c0                	test   al,al
 10babd6:	74 28                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babd8:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10babdc:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10babe0:	e8 95 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10babe5:	84 c0                	test   al,al
 10babe7:	74 17                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babe9:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10babec:	4c 89 f7             	mov    rdi,r14
 10babef:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
 10babf5:	84 c0                	test   al,al
 10babf7:	74 07                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babf9:	83 23 00             	and    DWORD PTR [rbx],0x0
 10babfc:	b0 01                	mov    al,0x1
 10babfe:	eb 02                	jmp    10bac02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282018>
 10bac00:	31 c0                	xor    eax,eax
 10bac02:	48 83 c4 08          	add    rsp,0x8
 10bac06:	5b                   	pop    rbx
 10bac07:	41 5e                	pop    r14
 10bac09:	c3                   	ret
 10bac0a:	48 83 ec 18          	sub    rsp,0x18
 10bac0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bac15:	00 00
 10bac17:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bac1c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bac1f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bac24:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 10bac2a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bac31:	00 00
 10bac33:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bac38:	75 05                	jne    10bac3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282055>
 10bac3a:	48 83 c4 18          	add    rsp,0x18
 10bac3e:	c3                   	ret
 10bac3f:	e8 6c 4e 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bac44:	41 56                	push   r14
 10bac46:	53                   	push   rbx
 10bac47:	50                   	push   rax
 10bac48:	48 89 f3             	mov    rbx,rsi
 10bac4b:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bac51:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bac54:	83 e0 fe             	and    eax,0xfffffffe
 10bac57:	83 f8 02             	cmp    eax,0x2
```
## AP entry `0x90` -> `0x10babb0`

```text
 10bab6a:	75 05                	jne    10bab71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281f87>
 10bab6c:	48 83 c4 18          	add    rsp,0x18
 10bab70:	c3                   	ret
 10bab71:	e8 3a 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bab76:	48 83 ec 18          	sub    rsp,0x18
 10bab7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bab81:	00 00
 10bab83:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bab88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bab8b:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bab90:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
 10bab96:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bab9d:	00 00
 10bab9f:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baba4:	75 05                	jne    10babab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281fc1>
 10baba6:	48 83 c4 18          	add    rsp,0x18
 10babaa:	c3                   	ret
 10babab:	e8 00 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10babb0:	41 56                	push   r14
 10babb2:	53                   	push   rbx
 10babb3:	50                   	push   rax
 10babb4:	48 89 f3             	mov    rbx,rsi
 10babb7:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10babbd:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10babc0:	83 e0 fe             	and    eax,0xfffffffe
 10babc3:	83 f8 02             	cmp    eax,0x2
 10babc6:	75 31                	jne    10babf9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28200f>
 10babc8:	49 89 fe             	mov    r14,rdi
 10babcb:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10babcf:	e8 d6 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10babd4:	84 c0                	test   al,al
 10babd6:	74 28                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babd8:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10babdc:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10babe0:	e8 95 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10babe5:	84 c0                	test   al,al
 10babe7:	74 17                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babe9:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10babec:	4c 89 f7             	mov    rdi,r14
 10babef:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
 10babf5:	84 c0                	test   al,al
 10babf7:	74 07                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babf9:	83 23 00             	and    DWORD PTR [rbx],0x0
 10babfc:	b0 01                	mov    al,0x1
 10babfe:	eb 02                	jmp    10bac02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282018>
 10bac00:	31 c0                	xor    eax,eax
 10bac02:	48 83 c4 08          	add    rsp,0x8
 10bac06:	5b                   	pop    rbx
 10bac07:	41 5e                	pop    r14
 10bac09:	c3                   	ret
 10bac0a:	48 83 ec 18          	sub    rsp,0x18
 10bac0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bac15:	00 00
 10bac17:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bac1c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bac1f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bac24:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 10bac2a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bac31:	00 00
 10bac33:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bac38:	75 05                	jne    10bac3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282055>
 10bac3a:	48 83 c4 18          	add    rsp,0x18
 10bac3e:	c3                   	ret
 10bac3f:	e8 6c 4e 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bac44:	41 56                	push   r14
 10bac46:	53                   	push   rbx
 10bac47:	50                   	push   rax
 10bac48:	48 89 f3             	mov    rbx,rsi
 10bac4b:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bac51:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bac54:	83 e0 fe             	and    eax,0xfffffffe
 10bac57:	83 f8 02             	cmp    eax,0x2
 10bac5a:	75 31                	jne    10bac8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820a3>
 10bac5c:	49 89 fe             	mov    r14,rdi
 10bac5f:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bac63:	e8 42 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bac68:	84 c0                	test   al,al
 10bac6a:	74 28                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac6c:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bac70:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bac74:	e8 01 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bac79:	84 c0                	test   al,al
 10bac7b:	74 17                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac7d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bac80:	4c 89 f7             	mov    rdi,r14
 10bac83:	ff 90 b0 01 00 00    	call   QWORD PTR [rax+0x1b0]
```
## AP entry `0x98` -> `0x10bac0a`

```text
 10babd8:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10babdc:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10babe0:	e8 95 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10babe5:	84 c0                	test   al,al
 10babe7:	74 17                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babe9:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10babec:	4c 89 f7             	mov    rdi,r14
 10babef:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
 10babf5:	84 c0                	test   al,al
 10babf7:	74 07                	je     10bac00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282016>
 10babf9:	83 23 00             	and    DWORD PTR [rbx],0x0
 10babfc:	b0 01                	mov    al,0x1
 10babfe:	eb 02                	jmp    10bac02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282018>
 10bac00:	31 c0                	xor    eax,eax
 10bac02:	48 83 c4 08          	add    rsp,0x8
 10bac06:	5b                   	pop    rbx
 10bac07:	41 5e                	pop    r14
 10bac09:	c3                   	ret
 10bac0a:	48 83 ec 18          	sub    rsp,0x18
 10bac0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bac15:	00 00
 10bac17:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bac1c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bac1f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bac24:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 10bac2a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bac31:	00 00
 10bac33:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bac38:	75 05                	jne    10bac3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282055>
 10bac3a:	48 83 c4 18          	add    rsp,0x18
 10bac3e:	c3                   	ret
 10bac3f:	e8 6c 4e 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bac44:	41 56                	push   r14
 10bac46:	53                   	push   rbx
 10bac47:	50                   	push   rax
 10bac48:	48 89 f3             	mov    rbx,rsi
 10bac4b:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bac51:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bac54:	83 e0 fe             	and    eax,0xfffffffe
 10bac57:	83 f8 02             	cmp    eax,0x2
 10bac5a:	75 31                	jne    10bac8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820a3>
 10bac5c:	49 89 fe             	mov    r14,rdi
 10bac5f:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bac63:	e8 42 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bac68:	84 c0                	test   al,al
 10bac6a:	74 28                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac6c:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bac70:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bac74:	e8 01 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bac79:	84 c0                	test   al,al
 10bac7b:	74 17                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac7d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bac80:	4c 89 f7             	mov    rdi,r14
 10bac83:	ff 90 b0 01 00 00    	call   QWORD PTR [rax+0x1b0]
 10bac89:	84 c0                	test   al,al
 10bac8b:	74 07                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac8d:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bac90:	b0 01                	mov    al,0x1
 10bac92:	eb 02                	jmp    10bac96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820ac>
 10bac94:	31 c0                	xor    eax,eax
 10bac96:	48 83 c4 08          	add    rsp,0x8
 10bac9a:	5b                   	pop    rbx
 10bac9b:	41 5e                	pop    r14
 10bac9d:	c3                   	ret
 10bac9e:	48 83 ec 18          	sub    rsp,0x18
 10baca2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baca9:	00 00
 10bacab:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bacb0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bacb3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bacb8:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 10bacbe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bacc5:	00 00
 10bacc7:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baccc:	75 05                	jne    10bacd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820e9>
 10bacce:	48 83 c4 18          	add    rsp,0x18
 10bacd2:	c3                   	ret
 10bacd3:	e8 d8 4d 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bacd8:	41 56                	push   r14
 10bacda:	53                   	push   rbx
 10bacdb:	50                   	push   rax
 10bacdc:	48 89 f3             	mov    rbx,rsi
 10bacdf:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bace5:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bace8:	83 e0 fe             	and    eax,0xfffffffe
 10baceb:	83 f8 02             	cmp    eax,0x2
```
## AP entry `0xa0` -> `0x10bac44`

```text
 10bac02:	48 83 c4 08          	add    rsp,0x8
 10bac06:	5b                   	pop    rbx
 10bac07:	41 5e                	pop    r14
 10bac09:	c3                   	ret
 10bac0a:	48 83 ec 18          	sub    rsp,0x18
 10bac0e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bac15:	00 00
 10bac17:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bac1c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bac1f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bac24:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
 10bac2a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bac31:	00 00
 10bac33:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bac38:	75 05                	jne    10bac3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282055>
 10bac3a:	48 83 c4 18          	add    rsp,0x18
 10bac3e:	c3                   	ret
 10bac3f:	e8 6c 4e 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bac44:	41 56                	push   r14
 10bac46:	53                   	push   rbx
 10bac47:	50                   	push   rax
 10bac48:	48 89 f3             	mov    rbx,rsi
 10bac4b:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bac51:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bac54:	83 e0 fe             	and    eax,0xfffffffe
 10bac57:	83 f8 02             	cmp    eax,0x2
 10bac5a:	75 31                	jne    10bac8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820a3>
 10bac5c:	49 89 fe             	mov    r14,rdi
 10bac5f:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bac63:	e8 42 24 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bac68:	84 c0                	test   al,al
 10bac6a:	74 28                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac6c:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bac70:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bac74:	e8 01 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bac79:	84 c0                	test   al,al
 10bac7b:	74 17                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac7d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bac80:	4c 89 f7             	mov    rdi,r14
 10bac83:	ff 90 b0 01 00 00    	call   QWORD PTR [rax+0x1b0]
 10bac89:	84 c0                	test   al,al
 10bac8b:	74 07                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac8d:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bac90:	b0 01                	mov    al,0x1
 10bac92:	eb 02                	jmp    10bac96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820ac>
 10bac94:	31 c0                	xor    eax,eax
 10bac96:	48 83 c4 08          	add    rsp,0x8
 10bac9a:	5b                   	pop    rbx
 10bac9b:	41 5e                	pop    r14
 10bac9d:	c3                   	ret
 10bac9e:	48 83 ec 18          	sub    rsp,0x18
 10baca2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baca9:	00 00
 10bacab:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bacb0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bacb3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bacb8:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 10bacbe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bacc5:	00 00
 10bacc7:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baccc:	75 05                	jne    10bacd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820e9>
 10bacce:	48 83 c4 18          	add    rsp,0x18
 10bacd2:	c3                   	ret
 10bacd3:	e8 d8 4d 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bacd8:	41 56                	push   r14
 10bacda:	53                   	push   rbx
 10bacdb:	50                   	push   rax
 10bacdc:	48 89 f3             	mov    rbx,rsi
 10bacdf:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bace5:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bace8:	83 e0 fe             	and    eax,0xfffffffe
 10baceb:	83 f8 02             	cmp    eax,0x2
 10bacee:	75 38                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bacf0:	49 89 fe             	mov    r14,rdi
 10bacf3:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bacf7:	e8 ae 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bacfc:	84 c0                	test   al,al
 10bacfe:	74 11                	je     10bad11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282127>
 10bad00:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bad04:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bad08:	e8 6d 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad0d:	84 c0                	test   al,al
 10bad0f:	75 17                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad11:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10bad15:	48 85 ff             	test   rdi,rdi
 10bad18:	74 0a                	je     10bad24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213a>
```
## AP entry `0xa8` -> `0x10bac9e`

```text
 10bac6c:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bac70:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bac74:	e8 01 25 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bac79:	84 c0                	test   al,al
 10bac7b:	74 17                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac7d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10bac80:	4c 89 f7             	mov    rdi,r14
 10bac83:	ff 90 b0 01 00 00    	call   QWORD PTR [rax+0x1b0]
 10bac89:	84 c0                	test   al,al
 10bac8b:	74 07                	je     10bac94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820aa>
 10bac8d:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bac90:	b0 01                	mov    al,0x1
 10bac92:	eb 02                	jmp    10bac96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820ac>
 10bac94:	31 c0                	xor    eax,eax
 10bac96:	48 83 c4 08          	add    rsp,0x8
 10bac9a:	5b                   	pop    rbx
 10bac9b:	41 5e                	pop    r14
 10bac9d:	c3                   	ret
 10bac9e:	48 83 ec 18          	sub    rsp,0x18
 10baca2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baca9:	00 00
 10bacab:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bacb0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bacb3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bacb8:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 10bacbe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bacc5:	00 00
 10bacc7:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baccc:	75 05                	jne    10bacd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820e9>
 10bacce:	48 83 c4 18          	add    rsp,0x18
 10bacd2:	c3                   	ret
 10bacd3:	e8 d8 4d 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bacd8:	41 56                	push   r14
 10bacda:	53                   	push   rbx
 10bacdb:	50                   	push   rax
 10bacdc:	48 89 f3             	mov    rbx,rsi
 10bacdf:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bace5:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bace8:	83 e0 fe             	and    eax,0xfffffffe
 10baceb:	83 f8 02             	cmp    eax,0x2
 10bacee:	75 38                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bacf0:	49 89 fe             	mov    r14,rdi
 10bacf3:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bacf7:	e8 ae 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bacfc:	84 c0                	test   al,al
 10bacfe:	74 11                	je     10bad11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282127>
 10bad00:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bad04:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bad08:	e8 6d 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad0d:	84 c0                	test   al,al
 10bad0f:	75 17                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad11:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10bad15:	48 85 ff             	test   rdi,rdi
 10bad18:	74 0a                	je     10bad24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213a>
 10bad1a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad1d:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10bad20:	84 c0                	test   al,al
 10bad22:	74 04                	je     10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad24:	31 c0                	xor    eax,eax
 10bad26:	eb 05                	jmp    10bad2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282143>
 10bad28:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bad2b:	b0 01                	mov    al,0x1
 10bad2d:	48 83 c4 08          	add    rsp,0x8
 10bad31:	5b                   	pop    rbx
 10bad32:	41 5e                	pop    r14
 10bad34:	c3                   	ret
 10bad35:	cc                   	int3
 10bad36:	41 57                	push   r15
 10bad38:	41 56                	push   r14
 10bad3a:	53                   	push   rbx
 10bad3b:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bad3e:	b3 01                	mov    bl,0x1
 10bad40:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bad44:	75 2d                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad46:	49 89 f6             	mov    r14,rsi
 10bad49:	49 89 ff             	mov    r15,rdi
 10bad4c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bad50:	e8 55 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bad55:	84 c0                	test   al,al
 10bad57:	74 1a                	je     10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad59:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
 10bad5d:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
 10bad61:	e8 14 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad66:	84 c0                	test   al,al
 10bad68:	75 09                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad6a:	41 c7 06 02 00 00 00 	mov    DWORD PTR [r14],0x2
```
## AP entry `0xb0` -> `0x10bacd8`

```text
 10bac96:	48 83 c4 08          	add    rsp,0x8
 10bac9a:	5b                   	pop    rbx
 10bac9b:	41 5e                	pop    r14
 10bac9d:	c3                   	ret
 10bac9e:	48 83 ec 18          	sub    rsp,0x18
 10baca2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10baca9:	00 00
 10bacab:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bacb0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bacb3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bacb8:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 10bacbe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bacc5:	00 00
 10bacc7:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10baccc:	75 05                	jne    10bacd3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2820e9>
 10bacce:	48 83 c4 18          	add    rsp,0x18
 10bacd2:	c3                   	ret
 10bacd3:	e8 d8 4d 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bacd8:	41 56                	push   r14
 10bacda:	53                   	push   rbx
 10bacdb:	50                   	push   rax
 10bacdc:	48 89 f3             	mov    rbx,rsi
 10bacdf:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10bace5:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bace8:	83 e0 fe             	and    eax,0xfffffffe
 10baceb:	83 f8 02             	cmp    eax,0x2
 10bacee:	75 38                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bacf0:	49 89 fe             	mov    r14,rdi
 10bacf3:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bacf7:	e8 ae 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bacfc:	84 c0                	test   al,al
 10bacfe:	74 11                	je     10bad11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282127>
 10bad00:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
 10bad04:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 10bad08:	e8 6d 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad0d:	84 c0                	test   al,al
 10bad0f:	75 17                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad11:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10bad15:	48 85 ff             	test   rdi,rdi
 10bad18:	74 0a                	je     10bad24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213a>
 10bad1a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad1d:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10bad20:	84 c0                	test   al,al
 10bad22:	74 04                	je     10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad24:	31 c0                	xor    eax,eax
 10bad26:	eb 05                	jmp    10bad2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282143>
 10bad28:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bad2b:	b0 01                	mov    al,0x1
 10bad2d:	48 83 c4 08          	add    rsp,0x8
 10bad31:	5b                   	pop    rbx
 10bad32:	41 5e                	pop    r14
 10bad34:	c3                   	ret
 10bad35:	cc                   	int3
 10bad36:	41 57                	push   r15
 10bad38:	41 56                	push   r14
 10bad3a:	53                   	push   rbx
 10bad3b:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bad3e:	b3 01                	mov    bl,0x1
 10bad40:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bad44:	75 2d                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad46:	49 89 f6             	mov    r14,rsi
 10bad49:	49 89 ff             	mov    r15,rdi
 10bad4c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bad50:	e8 55 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bad55:	84 c0                	test   al,al
 10bad57:	74 1a                	je     10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad59:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
 10bad5d:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
 10bad61:	e8 14 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad66:	84 c0                	test   al,al
 10bad68:	75 09                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad6a:	41 c7 06 02 00 00 00 	mov    DWORD PTR [r14],0x2
 10bad71:	31 db                	xor    ebx,ebx
 10bad73:	89 d8                	mov    eax,ebx
 10bad75:	5b                   	pop    rbx
 10bad76:	41 5e                	pop    r14
 10bad78:	41 5f                	pop    r15
 10bad7a:	c3                   	ret
 10bad7b:	cc                   	int3
 10bad7c:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bad7f:	83 e0 fe             	and    eax,0xfffffffe
 10bad82:	83 f8 02             	cmp    eax,0x2
 10bad85:	0f 95 c0             	setne  al
 10bad88:	c3                   	ret
 10bad89:	cc                   	int3
 10bad8a:	48 83 ec 18          	sub    rsp,0x18
```
## AP entry `0xb8` -> `0x10bad36`

```text
 10bad0d:	84 c0                	test   al,al
 10bad0f:	75 17                	jne    10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad11:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10bad15:	48 85 ff             	test   rdi,rdi
 10bad18:	74 0a                	je     10bad24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213a>
 10bad1a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad1d:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10bad20:	84 c0                	test   al,al
 10bad22:	74 04                	je     10bad28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28213e>
 10bad24:	31 c0                	xor    eax,eax
 10bad26:	eb 05                	jmp    10bad2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282143>
 10bad28:	83 23 00             	and    DWORD PTR [rbx],0x0
 10bad2b:	b0 01                	mov    al,0x1
 10bad2d:	48 83 c4 08          	add    rsp,0x8
 10bad31:	5b                   	pop    rbx
 10bad32:	41 5e                	pop    r14
 10bad34:	c3                   	ret
 10bad35:	cc                   	int3
 10bad36:	41 57                	push   r15
 10bad38:	41 56                	push   r14
 10bad3a:	53                   	push   rbx
 10bad3b:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bad3e:	b3 01                	mov    bl,0x1
 10bad40:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
 10bad44:	75 2d                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad46:	49 89 f6             	mov    r14,rsi
 10bad49:	49 89 ff             	mov    r15,rdi
 10bad4c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bad50:	e8 55 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bad55:	84 c0                	test   al,al
 10bad57:	74 1a                	je     10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad59:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
 10bad5d:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
 10bad61:	e8 14 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad66:	84 c0                	test   al,al
 10bad68:	75 09                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad6a:	41 c7 06 02 00 00 00 	mov    DWORD PTR [r14],0x2
 10bad71:	31 db                	xor    ebx,ebx
 10bad73:	89 d8                	mov    eax,ebx
 10bad75:	5b                   	pop    rbx
 10bad76:	41 5e                	pop    r14
 10bad78:	41 5f                	pop    r15
 10bad7a:	c3                   	ret
 10bad7b:	cc                   	int3
 10bad7c:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bad7f:	83 e0 fe             	and    eax,0xfffffffe
 10bad82:	83 f8 02             	cmp    eax,0x2
 10bad85:	0f 95 c0             	setne  al
 10bad88:	c3                   	ret
 10bad89:	cc                   	int3
 10bad8a:	48 83 ec 18          	sub    rsp,0x18
 10bad8e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bad95:	00 00
 10bad97:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bad9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad9f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bada4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
 10badaa:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10badb1:	00 00
 10badb3:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10badb8:	75 05                	jne    10badbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2821d5>
 10badba:	48 83 c4 18          	add    rsp,0x18
 10badbe:	c3                   	ret
 10badbf:	e8 ec 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10badc4:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10badca:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10badcd:	83 e0 fe             	and    eax,0xfffffffe
 10badd0:	31 c9                	xor    ecx,ecx
 10badd2:	83 f8 02             	cmp    eax,0x2
 10badd5:	0f 95 c0             	setne  al
 10badd8:	0f 94 c1             	sete   cl
 10baddb:	89 0e                	mov    DWORD PTR [rsi],ecx
 10baddd:	c3                   	ret
 10badde:	48 83 ec 18          	sub    rsp,0x18
 10bade2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bade9:	00 00
 10badeb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10badf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10badf3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10badf8:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
 10badfe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae05:	00 00
 10bae07:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae0c:	75 05                	jne    10bae13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282229>
 10bae0e:	48 83 c4 18          	add    rsp,0x18
 10bae12:	c3                   	ret
```
## AP entry `0xc0` -> `0x10bad7c`

```text
 10bad49:	49 89 ff             	mov    r15,rdi
 10bad4c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 10bad50:	e8 55 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10bad55:	84 c0                	test   al,al
 10bad57:	74 1a                	je     10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad59:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
 10bad5d:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
 10bad61:	e8 14 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad66:	84 c0                	test   al,al
 10bad68:	75 09                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad6a:	41 c7 06 02 00 00 00 	mov    DWORD PTR [r14],0x2
 10bad71:	31 db                	xor    ebx,ebx
 10bad73:	89 d8                	mov    eax,ebx
 10bad75:	5b                   	pop    rbx
 10bad76:	41 5e                	pop    r14
 10bad78:	41 5f                	pop    r15
 10bad7a:	c3                   	ret
 10bad7b:	cc                   	int3
 10bad7c:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bad7f:	83 e0 fe             	and    eax,0xfffffffe
 10bad82:	83 f8 02             	cmp    eax,0x2
 10bad85:	0f 95 c0             	setne  al
 10bad88:	c3                   	ret
 10bad89:	cc                   	int3
 10bad8a:	48 83 ec 18          	sub    rsp,0x18
 10bad8e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bad95:	00 00
 10bad97:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bad9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad9f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bada4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
 10badaa:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10badb1:	00 00
 10badb3:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10badb8:	75 05                	jne    10badbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2821d5>
 10badba:	48 83 c4 18          	add    rsp,0x18
 10badbe:	c3                   	ret
 10badbf:	e8 ec 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10badc4:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10badca:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10badcd:	83 e0 fe             	and    eax,0xfffffffe
 10badd0:	31 c9                	xor    ecx,ecx
 10badd2:	83 f8 02             	cmp    eax,0x2
 10badd5:	0f 95 c0             	setne  al
 10badd8:	0f 94 c1             	sete   cl
 10baddb:	89 0e                	mov    DWORD PTR [rsi],ecx
 10baddd:	c3                   	ret
 10badde:	48 83 ec 18          	sub    rsp,0x18
 10bade2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bade9:	00 00
 10badeb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10badf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10badf3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10badf8:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
 10badfe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae05:	00 00
 10bae07:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae0c:	75 05                	jne    10bae13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282229>
 10bae0e:	48 83 c4 18          	add    rsp,0x18
 10bae12:	c3                   	ret
 10bae13:	e8 98 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae18:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bae1b:	b0 01                	mov    al,0x1
 10bae1d:	c3                   	ret
 10bae1e:	48 83 ec 18          	sub    rsp,0x18
 10bae22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae29:	00 00
 10bae2b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae30:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae33:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae38:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
 10bae3e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae45:	00 00
 10bae47:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae4c:	75 05                	jne    10bae53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282269>
 10bae4e:	48 83 c4 18          	add    rsp,0x18
 10bae52:	c3                   	ret
 10bae53:	e8 58 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae58:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bae5c:	0f 94 c0             	sete   al
 10bae5f:	c3                   	ret
 10bae60:	48 83 ec 18          	sub    rsp,0x18
 10bae64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae6b:	00 00
 10bae6d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae72:	48 8b 07             	mov    rax,QWORD PTR [rdi]
```
## AP entry `0xc8` -> `0x10bad8a`

```text
 10bad5d:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
 10bad61:	e8 14 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
 10bad66:	84 c0                	test   al,al
 10bad68:	75 09                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
 10bad6a:	41 c7 06 02 00 00 00 	mov    DWORD PTR [r14],0x2
 10bad71:	31 db                	xor    ebx,ebx
 10bad73:	89 d8                	mov    eax,ebx
 10bad75:	5b                   	pop    rbx
 10bad76:	41 5e                	pop    r14
 10bad78:	41 5f                	pop    r15
 10bad7a:	c3                   	ret
 10bad7b:	cc                   	int3
 10bad7c:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10bad7f:	83 e0 fe             	and    eax,0xfffffffe
 10bad82:	83 f8 02             	cmp    eax,0x2
 10bad85:	0f 95 c0             	setne  al
 10bad88:	c3                   	ret
 10bad89:	cc                   	int3
 10bad8a:	48 83 ec 18          	sub    rsp,0x18
 10bad8e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bad95:	00 00
 10bad97:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bad9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad9f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bada4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
 10badaa:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10badb1:	00 00
 10badb3:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10badb8:	75 05                	jne    10badbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2821d5>
 10badba:	48 83 c4 18          	add    rsp,0x18
 10badbe:	c3                   	ret
 10badbf:	e8 ec 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10badc4:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10badca:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10badcd:	83 e0 fe             	and    eax,0xfffffffe
 10badd0:	31 c9                	xor    ecx,ecx
 10badd2:	83 f8 02             	cmp    eax,0x2
 10badd5:	0f 95 c0             	setne  al
 10badd8:	0f 94 c1             	sete   cl
 10baddb:	89 0e                	mov    DWORD PTR [rsi],ecx
 10baddd:	c3                   	ret
 10badde:	48 83 ec 18          	sub    rsp,0x18
 10bade2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bade9:	00 00
 10badeb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10badf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10badf3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10badf8:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
 10badfe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae05:	00 00
 10bae07:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae0c:	75 05                	jne    10bae13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282229>
 10bae0e:	48 83 c4 18          	add    rsp,0x18
 10bae12:	c3                   	ret
 10bae13:	e8 98 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae18:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bae1b:	b0 01                	mov    al,0x1
 10bae1d:	c3                   	ret
 10bae1e:	48 83 ec 18          	sub    rsp,0x18
 10bae22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae29:	00 00
 10bae2b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae30:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae33:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae38:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
 10bae3e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae45:	00 00
 10bae47:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae4c:	75 05                	jne    10bae53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282269>
 10bae4e:	48 83 c4 18          	add    rsp,0x18
 10bae52:	c3                   	ret
 10bae53:	e8 58 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae58:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bae5c:	0f 94 c0             	sete   al
 10bae5f:	c3                   	ret
 10bae60:	48 83 ec 18          	sub    rsp,0x18
 10bae64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae6b:	00 00
 10bae6d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae72:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae75:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae7a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
 10bae80:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae87:	00 00
 10bae89:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae8e:	75 05                	jne    10bae95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822ab>
```
## AP entry `0xd0` -> `0x10badc4`

```text
 10bad82:	83 f8 02             	cmp    eax,0x2
 10bad85:	0f 95 c0             	setne  al
 10bad88:	c3                   	ret
 10bad89:	cc                   	int3
 10bad8a:	48 83 ec 18          	sub    rsp,0x18
 10bad8e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bad95:	00 00
 10bad97:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bad9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bad9f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bada4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
 10badaa:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10badb1:	00 00
 10badb3:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10badb8:	75 05                	jne    10badbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2821d5>
 10badba:	48 83 c4 18          	add    rsp,0x18
 10badbe:	c3                   	ret
 10badbf:	e8 ec 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10badc4:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10badca:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10badcd:	83 e0 fe             	and    eax,0xfffffffe
 10badd0:	31 c9                	xor    ecx,ecx
 10badd2:	83 f8 02             	cmp    eax,0x2
 10badd5:	0f 95 c0             	setne  al
 10badd8:	0f 94 c1             	sete   cl
 10baddb:	89 0e                	mov    DWORD PTR [rsi],ecx
 10baddd:	c3                   	ret
 10badde:	48 83 ec 18          	sub    rsp,0x18
 10bade2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bade9:	00 00
 10badeb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10badf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10badf3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10badf8:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
 10badfe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae05:	00 00
 10bae07:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae0c:	75 05                	jne    10bae13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282229>
 10bae0e:	48 83 c4 18          	add    rsp,0x18
 10bae12:	c3                   	ret
 10bae13:	e8 98 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae18:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bae1b:	b0 01                	mov    al,0x1
 10bae1d:	c3                   	ret
 10bae1e:	48 83 ec 18          	sub    rsp,0x18
 10bae22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae29:	00 00
 10bae2b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae30:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae33:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae38:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
 10bae3e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae45:	00 00
 10bae47:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae4c:	75 05                	jne    10bae53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282269>
 10bae4e:	48 83 c4 18          	add    rsp,0x18
 10bae52:	c3                   	ret
 10bae53:	e8 58 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae58:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bae5c:	0f 94 c0             	sete   al
 10bae5f:	c3                   	ret
 10bae60:	48 83 ec 18          	sub    rsp,0x18
 10bae64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae6b:	00 00
 10bae6d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae72:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae75:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae7a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
 10bae80:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae87:	00 00
 10bae89:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae8e:	75 05                	jne    10bae95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822ab>
 10bae90:	48 83 c4 18          	add    rsp,0x18
 10bae94:	c3                   	ret
 10bae95:	e8 16 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae9a:	41 56                	push   r14
 10bae9c:	53                   	push   rbx
 10bae9d:	50                   	push   rax
 10bae9e:	48 89 f3             	mov    rbx,rsi
 10baea1:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10baea7:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10baeaa:	83 e0 fe             	and    eax,0xfffffffe
 10baead:	83 f8 02             	cmp    eax,0x2
 10baeb0:	75 44                	jne    10baef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28230c>
 10baeb2:	49 89 fe             	mov    r14,rdi
 10baeb5:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
```
## AP entry `0xd8` -> `0x10badde`

```text
 10bad9f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bada4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
 10badaa:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10badb1:	00 00
 10badb3:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10badb8:	75 05                	jne    10badbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2821d5>
 10badba:	48 83 c4 18          	add    rsp,0x18
 10badbe:	c3                   	ret
 10badbf:	e8 ec 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10badc4:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10badca:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10badcd:	83 e0 fe             	and    eax,0xfffffffe
 10badd0:	31 c9                	xor    ecx,ecx
 10badd2:	83 f8 02             	cmp    eax,0x2
 10badd5:	0f 95 c0             	setne  al
 10badd8:	0f 94 c1             	sete   cl
 10baddb:	89 0e                	mov    DWORD PTR [rsi],ecx
 10baddd:	c3                   	ret
 10badde:	48 83 ec 18          	sub    rsp,0x18
 10bade2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bade9:	00 00
 10badeb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10badf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10badf3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10badf8:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
 10badfe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae05:	00 00
 10bae07:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae0c:	75 05                	jne    10bae13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282229>
 10bae0e:	48 83 c4 18          	add    rsp,0x18
 10bae12:	c3                   	ret
 10bae13:	e8 98 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae18:	83 26 00             	and    DWORD PTR [rsi],0x0
 10bae1b:	b0 01                	mov    al,0x1
 10bae1d:	c3                   	ret
 10bae1e:	48 83 ec 18          	sub    rsp,0x18
 10bae22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae29:	00 00
 10bae2b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae30:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae33:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae38:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
 10bae3e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae45:	00 00
 10bae47:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae4c:	75 05                	jne    10bae53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282269>
 10bae4e:	48 83 c4 18          	add    rsp,0x18
 10bae52:	c3                   	ret
 10bae53:	e8 58 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae58:	83 7f 50 00          	cmp    DWORD PTR [rdi+0x50],0x0
 10bae5c:	0f 94 c0             	sete   al
 10bae5f:	c3                   	ret
 10bae60:	48 83 ec 18          	sub    rsp,0x18
 10bae64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10bae6b:	00 00
 10bae6d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10bae72:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10bae75:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
 10bae7a:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
 10bae80:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
 10bae87:	00 00
 10bae89:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
 10bae8e:	75 05                	jne    10bae95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822ab>
 10bae90:	48 83 c4 18          	add    rsp,0x18
 10bae94:	c3                   	ret
 10bae95:	e8 16 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10bae9a:	41 56                	push   r14
 10bae9c:	53                   	push   rbx
 10bae9d:	50                   	push   rax
 10bae9e:	48 89 f3             	mov    rbx,rsi
 10baea1:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
 10baea7:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
 10baeaa:	83 e0 fe             	and    eax,0xfffffffe
 10baead:	83 f8 02             	cmp    eax,0x2
 10baeb0:	75 44                	jne    10baef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28230c>
 10baeb2:	49 89 fe             	mov    r14,rdi
 10baeb5:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 10baeb9:	48 85 ff             	test   rdi,rdi
 10baebc:	74 0a                	je     10baec8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2822de>
 10baebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10baec1:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10baec4:	84 c0                	test   al,al
 10baec6:	75 35                	jne    10baefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282313>
 10baec8:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 10baecc:	e8 d9 21 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
 10baed1:	84 c0                	test   al,al
```
## Candidate `+0x60` readers/writers near AP methods

| addr | instruction |
|---:|---|
| `0x10ad136` | `10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0x10ad217` | `10ad217:	48 89 5d 60          	mov    QWORD PTR [rbp+0x60],rbx` |
| `0x10adbde` | `10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]` |
| `0x10addfe` | `10addfe:	48 8d 44 24 60       	lea    rax,[rsp+0x60]` |
| `0x10adfc3` | `10adfc3:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]` |
| `0x10ae0dd` | `10ae0dd:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]` |
| `0x10ae134` | `10ae134:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]` |
| `0x10ae17f` | `10ae17f:	48 8d 7b 60          	lea    rdi,[rbx+0x60]` |
| `0x10ae226` | `10ae226:	48 8b 47 60          	mov    rax,QWORD PTR [rdi+0x60]` |
| `0x10ae230` | `10ae230:	48 8b 4f 60          	mov    rcx,QWORD PTR [rdi+0x60]` |
| `0x10baa40` | `10baa40:	ff 50 60             	call   QWORD PTR [rax+0x60]` |

## Construction/capture window `10ad136..10ad360`

```text
 10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ad13b:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10ad13e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ad143:	4c 8b 20             	mov    r12,QWORD PTR [rax]
 10ad146:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 10ad14b:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 10ad14e:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10ad153:	4c 8b 38             	mov    r15,QWORD PTR [rax]
 10ad156:	bf 98 01 00 00       	mov    edi,0x198
 10ad15b:	e8 a0 0d 74 00       	call   17edf00 <_Znwm@plt>
 10ad160:	48 89 c5             	mov    rbp,rax
 10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]
 10ad168:	66 0f 6e c0          	movd   xmm0,eax
 10ad16c:	0f b6 44 24 07       	movzx  eax,BYTE PTR [rsp+0x7]
 10ad171:	66 0f 3a 20 c0 01    	pinsrb xmm0,eax,0x1
 10ad177:	0f b6 44 24 05       	movzx  eax,BYTE PTR [rsp+0x5]
 10ad17c:	66 0f 3a 20 c0 02    	pinsrb xmm0,eax,0x2
 10ad182:	0f b6 44 24 04       	movzx  eax,BYTE PTR [rsp+0x4]
 10ad187:	66 0f 3a 20 c0 03    	pinsrb xmm0,eax,0x3
 10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
 10ad193:	4d 8d 6e 08          	lea    r13,[r14+0x8]
 10ad197:	4d 85 f6             	test   r14,r14
 10ad19a:	4d 0f 44 ee          	cmove  r13,r14
 10ad19e:	48 8d 05 2b 04 7a 00 	lea    rax,[rip+0x7a042b]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>
 10ad1a5:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
 10ad1a9:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
 10ad1ae:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
 10ad1b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 10ad1b7:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
 10ad1bb:	4c 89 65 18          	mov    QWORD PTR [rbp+0x18],r12
 10ad1bf:	4c 8d 65 20          	lea    r12,[rbp+0x20]
 10ad1c3:	4c 89 e7             	mov    rdi,r12
 10ad1c6:	e8 2b c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad1cb:	4c 89 6d 30          	mov    QWORD PTR [rbp+0x30],r13
 10ad1cf:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15
 10ad1d3:	48 8d 7d 40          	lea    rdi,[rbp+0x40]
 10ad1d7:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
 10ad1dc:	e8 15 c8 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad1e1:	c7 45 50 05 00 00 00 	mov    DWORD PTR [rbp+0x50],0x5
 10ad1e8:	66 83 65 54 00       	and    WORD PTR [rbp+0x54],0x0
 10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
 10ad1f2:	f3 0f 11 45 56       	movss  DWORD PTR [rbp+0x56],xmm0
 10ad1f7:	8a 44 24 06          	mov    al,BYTE PTR [rsp+0x6]
 10ad1fb:	88 45 5a             	mov    BYTE PTR [rbp+0x5a],al
 10ad1fe:	c6 45 5b 00          	mov    BYTE PTR [rbp+0x5b],0x0
 10ad202:	8b 44 24 10          	mov    eax,DWORD PTR [rsp+0x10]
 10ad206:	88 45 5c             	mov    BYTE PTR [rbp+0x5c],al
 10ad209:	8b 44 24 3c          	mov    eax,DWORD PTR [rsp+0x3c]
 10ad20d:	88 45 5d             	mov    BYTE PTR [rbp+0x5d],al
 10ad210:	8b 44 24 38          	mov    eax,DWORD PTR [rsp+0x38]
 10ad214:	88 45 5e             	mov    BYTE PTR [rbp+0x5e],al
 10ad217:	48 89 5d 60          	mov    QWORD PTR [rbp+0x60],rbx
 10ad21b:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
 10ad222:	00
 10ad223:	48 89 45 68          	mov    QWORD PTR [rbp+0x68],rax
 10ad227:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
 10ad22e:	00
 10ad22f:	48 89 45 70          	mov    QWORD PTR [rbp+0x70],rax
 10ad233:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
 10ad23a:	00
 10ad23b:	48 89 45 78          	mov    QWORD PTR [rbp+0x78],rax
 10ad23f:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
 10ad246:	00
 10ad247:	48 89 85 80 00 00 00 	mov    QWORD PTR [rbp+0x80],rax
 10ad24e:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
 10ad255:	00
 10ad256:	48 89 85 88 00 00 00 	mov    QWORD PTR [rbp+0x88],rax
 10ad25d:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
 10ad264:	00
 10ad265:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax
 10ad26c:	0f 57 c0             	xorps  xmm0,xmm0
 10ad26f:	48 83 a5 b8 00 00 00 	and    QWORD PTR [rbp+0xb8],0x0
 10ad276:	00
 10ad277:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0
 10ad27e:	0f 11 85 a8 00 00 00 	movups XMMWORD PTR [rbp+0xa8],xmm0
 10ad285:	c7 85 c0 00 00 00 00 	mov    DWORD PTR [rbp+0xc0],0x3f800000
 10ad28c:	00 80 3f
 10ad28f:	48 8d bd c8 00 00 00 	lea    rdi,[rbp+0xc8]
 10ad296:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 10ad29b:	e8 ee af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ad2a0:	48 8d bd 20 01 00 00 	lea    rdi,[rbp+0x120]
 10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
 10ad2ac:	e8 dd af a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ad2b1:	4c 8d b5 78 01 00 00 	lea    r14,[rbp+0x178]
 10ad2b8:	4c 89 f7             	mov    rdi,r14
 10ad2bb:	e8 36 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad2c0:	4c 8d ad 88 01 00 00 	lea    r13,[rbp+0x188]
 10ad2c7:	4c 89 ef             	mov    rdi,r13
 10ad2ca:	e8 27 c7 72 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 10ad2cf:	8a 45 5e             	mov    al,BYTE PTR [rbp+0x5e]
 10ad2d2:	86 05 68 3e 94 00    	xchg   BYTE PTR [rip+0x943e68],al        # 19f1140 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x2870>
 10ad2d8:	4c 8b 7d 08          	mov    r15,QWORD PTR [rbp+0x8]
 10ad2dc:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad2e3:	00
 10ad2e4:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad2e7:	48 8d 35 a3 fd 9e ff 	lea    rsi,[rip+0xffffffffff9efda3]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad2ee:	48 8d 0d db d2 00 00 	lea    rcx,[rip+0xd2db]        # 10ba5d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2819e6>
 10ad2f5:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ad2fc:	00
 10ad2fd:	6a 08                	push   0x8
 10ad2ff:	41 59                	pop    r9
 10ad301:	48 89 df             	mov    rdi,rbx
 10ad304:	31 d2                	xor    edx,edx
 10ad306:	e8 89 d4 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ad30b:	49 8b 37             	mov    rsi,QWORD PTR [r15]
 10ad30e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10ad311:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
 10ad318:	00
 10ad319:	4c 89 ff             	mov    rdi,r15
 10ad31c:	48 89 da             	mov    rdx,rbx
 10ad31f:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10ad322:	4c 89 f7             	mov    rdi,r14
 10ad325:	4c 89 fe             	mov    rsi,r15
 10ad328:	e8 c5 c8 72 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 10ad32d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
 10ad331:	e8 50 11 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad336:	48 89 df             	mov    rdi,rbx
 10ad339:	e8 aa d4 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad33e:	4c 8b bd 90 00 00 00 	mov    r15,QWORD PTR [rbp+0x90]
 10ad345:	4d 85 ff             	test   r15,r15
 10ad348:	74 6c                	je     10ad3b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2747cc>
 10ad34a:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ad351:	00
 10ad352:	49 89 28             	mov    QWORD PTR [r8],rbp
 10ad355:	48 8d 35 35 fd 9e ff 	lea    rsi,[rip+0xffffffffff9efd35]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ad35c:	48 8d 0d d3 d3 00 00 	lea    rcx,[rip+0xd3d3]        # 10ba736 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b4c>
```
