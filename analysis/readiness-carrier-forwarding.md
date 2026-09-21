# Readiness carrier forwarding methods

Known small carrier: base e948ff, secondary this=base+0x18 AP 0x1843bf8, [base+0x20]=P, [base+0x28]=outer.

## 0xc7e83e

/tmp/carrierfw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000c7e81e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb7be>:
  c7e81e:	5b                   	pop    rbx
  c7e81f:	41 5e                	pop    r14
  c7e821:	41 5f                	pop    r15
  c7e823:	c3                   	ret
  c7e824:	53                   	push   rbx
  c7e825:	48 89 fb             	mov    rbx,rdi
  c7e828:	48 83 c7 20          	add    rdi,0x20
  c7e82c:	e8 51 a2 ee ff       	call   b68a82 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5a22>
  c7e831:	48 83 c3 08          	add    rbx,0x8
  c7e835:	48 89 df             	mov    rdi,rbx
  c7e838:	5b                   	pop    rbx
  c7e839:	e9 52 f6 b6 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c7e83e:	48 8d 05 f3 53 bc 00 	lea    rax,[rip+0xbc53f3]        # 1843c38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320>
  c7e845:	48 89 07             	mov    QWORD PTR [rdi],rax
  c7e848:	e9 c3 f7 b6 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  c7e84d:	cc                   	int3
  c7e84e:	53                   	push   rbx
  c7e84f:	48 89 fb             	mov    rbx,rdi
  c7e852:	e8 e7 ff ff ff       	call   c7e83e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb7de>
  c7e857:	48 89 df             	mov    rdi,rbx
  c7e85a:	5b                   	pop    rbx
  c7e85b:	e9 c0 f6 b6 00       	jmp    17edf20 <_ZdlPv@plt>
  c7e860:	48 83 c7 18          	add    rdi,0x18
  c7e864:	e9 67 d5 9e 00       	jmp    166bdd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff3c>
  c7e869:	41 57                	push   r15
  c7e86b:	41 56                	push   r14
  c7e86d:	41 55                	push   r13
  c7e86f:	41 54                	push   r12
  c7e871:	53                   	push   rbx
  c7e872:	49 89 d7             	mov    r15,rdx
  c7e875:	49 89 f5             	mov    r13,rsi
  c7e878:	49 89 fe             	mov    r14,rdi
  c7e87b:	6a 58                	push   0x58
  c7e87d:	5f                   	pop    rdi
  c7e87e:	e8 7d f6 b6 00       	call   17edf00 <_Znwm@plt>
  c7e883:	48 89 c3             	mov    rbx,rax
  c7e886:	0f 57 c0             	xorps  xmm0,xmm0
  c7e889:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  c7e88d:	48 8d 05 a4 53 bc 00 	lea    rax,[rip+0xbc53a4]        # 1843c38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320>
  c7e894:	48 89 03             	mov    QWORD PTR [rbx],rax
  c7e897:	49 89 dc             	mov    r12,rbx
  c7e89a:	49 83 c4 18          	add    r12,0x18
  c7e89e:	4c 89 ef             	mov    rdi,r13
  c7e8a1:	e8 90 cf df ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c7e8a6:	48 8d 0d 03 8d 6a ff 	lea    rcx,[rip+0xffffffffff6a8d03]        # 3275b0 <_ZTSSt12bad_any_cast@@Base-0x68c18>
  c7e8ad:	6a 05                	push   0x5
  c7e8af:	41 58                	pop    r8
  c7e8b1:	4c 89 e7             	mov    rdi,r12
  c7e8b4:	48 89 c6             	mov    rsi,rax
  c7e8b7:	4d 89 f9             	mov    r9,r15
  c7e8ba:	e8 05 d4 9e 00       	call   166bcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fe30>
  c7e8bf:	4d 89 26             	mov    QWORD PTR [r14],r12
  c7e8c2:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
  c7e8c6:	31 ff                	xor    edi,edi
  c7e8c8:	5b                   	pop    rbx
  c7e8c9:	41 5c                	pop    r12
  c7e8cb:	41 5d                	pop    r13
  c7e8cd:	41 5e                	pop    r14
  c7e8cf:	41 5f                	pop    r15
  c7e8d1:	e9 46 fb e1 ff       	jmp    a9e41c <JNI_OnUnload@@Base+0x25ce9>
  c7e8d6:	49 89 c6             	mov    r14,rax
  c7e8d9:	48 89 df             	mov    rdi,rbx
  c7e8dc:	e8 2f f7 b6 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  c7e8e1:	48 89 df             	mov    rdi,rbx
  c7e8e4:	e8 33 fb e1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  c7e8e9:	4c 89 f7             	mov    rdi,r14
  c7e8ec:	e8 df 13 df ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  c7e8f1:	cc                   	int3
  c7e8f2:	41 56                	push   r14
  c7e8f4:	53                   	push   rbx
  c7e8f5:	50                   	push   rax
  c7e8f6:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  c7e8fa:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
  c7e8ff:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
  c7e903:	48 85 c0             	test   rax,rax
  c7e906:	74 22                	je     c7e92a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb8ca>
  c7e908:	48 89 fb             	mov    rbx,rdi
  c7e90b:	49 89 f6             	mov    r14,rsi
  c7e90e:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
  c7e912:	6a 01                	push   0x1
  c7e914:	5f                   	pop    rdi
  c7e915:	48 89 de             	mov    rsi,rbx
  c7e918:	4c 89 f2             	mov    rdx,r14
  c7e91b:	ff d0                	call   rax
  c7e91d:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
  c7e921:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  c7e925:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  c7e92a:	48 83 c4 08          	add    rsp,0x8
  c7e92e:	5b                   	pop    rbx
  c7e92f:	41 5e                	pop    r14
  c7e931:	c3                   	ret
  c7e932:	48 89 c7             	mov    rdi,rax
  c7e935:	e8 6b b1 df ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  c7e93a:	83 ff 01             	cmp    edi,0x1
  c7e93d:	74 1e                	je     c7e95d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb8fd>
  c7e93f:	85 ff                	test   edi,edi
  c7e941:	75 20                	jne    c7e963 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb903>
  c7e943:	53                   	push   rbx
  c7e944:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
  c7e947:	48 85 db             	test   rbx,rbx
  c7e94a:	74 08                	je     c7e954 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb8f4>
  c7e94c:	48 89 df             	mov    rdi,rbx
  c7e94f:	e8 8a 00 00 00       	call   c7e9de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb97e>
  c7e954:	48 89 df             	mov    rdi,rbx
  c7e957:	5b                   	pop    rbx
  c7e958:	e9 c3 f5 b6 00       	jmp    17edf20 <_ZdlPv@plt>
  c7e95d:	48 8b 02             	mov    rax,QWORD PTR [rdx]
  c7e960:	48 89 06             	mov    QWORD PTR [rsi],rax
  c7e963:	c3                   	ret
  c7e964:	41 57                	push   r15
  c7e966:	41 56                	push   r14
  c7e968:	53                   	push   rbx
  c7e969:	48 83 ec 30          	sub    rsp,0x30
  c7e96d:	89 f3                	mov    ebx,esi
  c7e96f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c7e976:	00 00 
  c7e978:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  c7e97d:	48                   	rex.W

## 0xc7e84e

/tmp/carrierfw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000c7e82e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb7ce>:
  c7e82e:	a2 ee ff 48 83 c3 08 	movabs ds:0x894808c38348ffee,al
  c7e835:	48 89 
  c7e837:	df 5b e9             	fistp  WORD PTR [rbx-0x17]
  c7e83a:	52                   	push   rdx
  c7e83b:	f6 b6 00 48 8d 05    	div    BYTE PTR [rsi+0x58d4800]
  c7e841:	f3 53                	repz push rbx
  c7e843:	bc 00 48 89 07       	mov    esp,0x7894800
  c7e848:	e9 c3 f7 b6 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  c7e84d:	cc                   	int3
  c7e84e:	53                   	push   rbx
  c7e84f:	48 89 fb             	mov    rbx,rdi
  c7e852:	e8 e7 ff ff ff       	call   c7e83e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb7de>
  c7e857:	48 89 df             	mov    rdi,rbx
  c7e85a:	5b                   	pop    rbx
  c7e85b:	e9 c0 f6 b6 00       	jmp    17edf20 <_ZdlPv@plt>
  c7e860:	48 83 c7 18          	add    rdi,0x18
  c7e864:	e9 67 d5 9e 00       	jmp    166bdd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff3c>
  c7e869:	41 57                	push   r15
  c7e86b:	41 56                	push   r14
  c7e86d:	41 55                	push   r13
  c7e86f:	41 54                	push   r12
  c7e871:	53                   	push   rbx
  c7e872:	49 89 d7             	mov    r15,rdx
  c7e875:	49 89 f5             	mov    r13,rsi
  c7e878:	49 89 fe             	mov    r14,rdi
  c7e87b:	6a 58                	push   0x58
  c7e87d:	5f                   	pop    rdi
  c7e87e:	e8 7d f6 b6 00       	call   17edf00 <_Znwm@plt>
  c7e883:	48 89 c3             	mov    rbx,rax
  c7e886:	0f 57 c0             	xorps  xmm0,xmm0
  c7e889:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  c7e88d:	48 8d 05 a4 53 bc 00 	lea    rax,[rip+0xbc53a4]        # 1843c38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320>
  c7e894:	48 89 03             	mov    QWORD PTR [rbx],rax
  c7e897:	49 89 dc             	mov    r12,rbx
  c7e89a:	49 83 c4 18          	add    r12,0x18
  c7e89e:	4c 89 ef             	mov    rdi,r13
  c7e8a1:	e8 90 cf df ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c7e8a6:	48 8d 0d 03 8d 6a ff 	lea    rcx,[rip+0xffffffffff6a8d03]        # 3275b0 <_ZTSSt12bad_any_cast@@Base-0x68c18>
  c7e8ad:	6a 05                	push   0x5
  c7e8af:	41 58                	pop    r8
  c7e8b1:	4c 89 e7             	mov    rdi,r12
  c7e8b4:	48 89 c6             	mov    rsi,rax
  c7e8b7:	4d 89 f9             	mov    r9,r15
  c7e8ba:	e8 05 d4 9e 00       	call   166bcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fe30>
  c7e8bf:	4d 89 26             	mov    QWORD PTR [r14],r12
  c7e8c2:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
  c7e8c6:	31 ff                	xor    edi,edi
  c7e8c8:	5b                   	pop    rbx
  c7e8c9:	41 5c                	pop    r12
  c7e8cb:	41 5d                	pop    r13
  c7e8cd:	41 5e                	pop    r14
  c7e8cf:	41 5f                	pop    r15
  c7e8d1:	e9 46 fb e1 ff       	jmp    a9e41c <JNI_OnUnload@@Base+0x25ce9>
  c7e8d6:	49 89 c6             	mov    r14,rax
  c7e8d9:	48 89 df             	mov    rdi,rbx
  c7e8dc:	e8 2f f7 b6 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  c7e8e1:	48 89 df             	mov    rdi,rbx
  c7e8e4:	e8 33 fb e1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  c7e8e9:	4c 89 f7             	mov    rdi,r14
  c7e8ec:	e8 df 13 df ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  c7e8f1:	cc                   	int3
  c7e8f2:	41 56                	push   r14
  c7e8f4:	53                   	push   rbx
  c7e8f5:	50                   	push   rax
  c7e8f6:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  c7e8fa:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
  c7e8ff:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
  c7e903:	48 85 c0             	test   rax,rax
  c7e906:	74 22                	je     c7e92a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb8ca>
  c7e908:	48 89 fb             	mov    rbx,rdi
  c7e90b:	49 89 f6             	mov    r14,rsi
  c7e90e:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
  c7e912:	6a 01                	push   0x1
  c7e914:	5f                   	pop    rdi
  c7e915:	48 89 de             	mov    rsi,rbx
  c7e918:	4c 89 f2             	mov    rdx,r14
  c7e91b:	ff d0                	call   rax
  c7e91d:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
  c7e921:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  c7e925:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  c7e92a:	48 83 c4 08          	add    rsp,0x8
  c7e92e:	5b                   	pop    rbx
  c7e92f:	41 5e                	pop    r14
  c7e931:	c3                   	ret
  c7e932:	48 89 c7             	mov    rdi,rax
  c7e935:	e8 6b b1 df ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  c7e93a:	83 ff 01             	cmp    edi,0x1
  c7e93d:	74 1e                	je     c7e95d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb8fd>
  c7e93f:	85 ff                	test   edi,edi
  c7e941:	75 20                	jne    c7e963 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb903>
  c7e943:	53                   	push   rbx
  c7e944:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
  c7e947:	48 85 db             	test   rbx,rbx
  c7e94a:	74 08                	je     c7e954 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb8f4>
  c7e94c:	48 89 df             	mov    rdi,rbx
  c7e94f:	e8 8a 00 00 00       	call   c7e9de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb97e>
  c7e954:	48 89 df             	mov    rdi,rbx
  c7e957:	5b                   	pop    rbx
  c7e958:	e9 c3 f5 b6 00       	jmp    17edf20 <_ZdlPv@plt>
  c7e95d:	48 8b 02             	mov    rax,QWORD PTR [rdx]
  c7e960:	48 89 06             	mov    QWORD PTR [rsi],rax
  c7e963:	c3                   	ret
  c7e964:	41 57                	push   r15
  c7e966:	41 56                	push   r14
  c7e968:	53                   	push   rbx
  c7e969:	48 83 ec 30          	sub    rsp,0x30
  c7e96d:	89 f3                	mov    ebx,esi
  c7e96f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c7e976:	00 00 
  c7e978:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  c7e97d:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  c7e980:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  c7e984:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
  c7e987:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  c7e98b:	0f 57 c0             	xorps  xmm0,xmm0

## 0xc7e860

/tmp/carrierfw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000c7e840 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb7e0>:
  c7e840:	05 f3 53 bc 00       	add    eax,0xbc53f3
  c7e845:	48 89 07             	mov    QWORD PTR [rdi],rax
  c7e848:	e9 c3 f7 b6 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  c7e84d:	cc                   	int3
  c7e84e:	53                   	push   rbx
  c7e84f:	48 89 fb             	mov    rbx,rdi
  c7e852:	e8 e7 ff ff ff       	call   c7e83e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb7de>
  c7e857:	48 89 df             	mov    rdi,rbx
  c7e85a:	5b                   	pop    rbx
  c7e85b:	e9 c0 f6 b6 00       	jmp    17edf20 <_ZdlPv@plt>
  c7e860:	48 83 c7 18          	add    rdi,0x18
  c7e864:	e9 67 d5 9e 00       	jmp    166bdd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff3c>
  c7e869:	41 57                	push   r15
  c7e86b:	41 56                	push   r14
  c7e86d:	41 55                	push   r13
  c7e86f:	41 54                	push   r12
  c7e871:	53                   	push   rbx
  c7e872:	49 89 d7             	mov    r15,rdx
  c7e875:	49 89 f5             	mov    r13,rsi
  c7e878:	49 89 fe             	mov    r14,rdi
  c7e87b:	6a 58                	push   0x58
  c7e87d:	5f                   	pop    rdi
  c7e87e:	e8 7d f6 b6 00       	call   17edf00 <_Znwm@plt>
  c7e883:	48 89 c3             	mov    rbx,rax
  c7e886:	0f 57 c0             	xorps  xmm0,xmm0
  c7e889:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  c7e88d:	48 8d 05 a4 53 bc 00 	lea    rax,[rip+0xbc53a4]        # 1843c38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320>
  c7e894:	48 89 03             	mov    QWORD PTR [rbx],rax
  c7e897:	49 89 dc             	mov    r12,rbx
  c7e89a:	49 83 c4 18          	add    r12,0x18
  c7e89e:	4c 89 ef             	mov    rdi,r13
  c7e8a1:	e8 90 cf df ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c7e8a6:	48 8d 0d 03 8d 6a ff 	lea    rcx,[rip+0xffffffffff6a8d03]        # 3275b0 <_ZTSSt12bad_any_cast@@Base-0x68c18>
  c7e8ad:	6a 05                	push   0x5
  c7e8af:	41 58                	pop    r8
  c7e8b1:	4c 89 e7             	mov    rdi,r12
  c7e8b4:	48 89 c6             	mov    rsi,rax
  c7e8b7:	4d 89 f9             	mov    r9,r15
  c7e8ba:	e8 05 d4 9e 00       	call   166bcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fe30>
  c7e8bf:	4d 89 26             	mov    QWORD PTR [r14],r12
  c7e8c2:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
  c7e8c6:	31 ff                	xor    edi,edi
  c7e8c8:	5b                   	pop    rbx
  c7e8c9:	41 5c                	pop    r12
  c7e8cb:	41 5d                	pop    r13
  c7e8cd:	41 5e                	pop    r14
  c7e8cf:	41 5f                	pop    r15
  c7e8d1:	e9 46 fb e1 ff       	jmp    a9e41c <JNI_OnUnload@@Base+0x25ce9>
  c7e8d6:	49 89 c6             	mov    r14,rax
  c7e8d9:	48 89 df             	mov    rdi,rbx
  c7e8dc:	e8 2f f7 b6 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  c7e8e1:	48 89 df             	mov    rdi,rbx
  c7e8e4:	e8 33 fb e1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  c7e8e9:	4c 89 f7             	mov    rdi,r14
  c7e8ec:	e8 df 13 df ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  c7e8f1:	cc                   	int3
  c7e8f2:	41 56                	push   r14
  c7e8f4:	53                   	push   rbx
  c7e8f5:	50                   	push   rax
  c7e8f6:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  c7e8fa:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
  c7e8ff:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
  c7e903:	48 85 c0             	test   rax,rax
  c7e906:	74 22                	je     c7e92a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb8ca>
  c7e908:	48 89 fb             	mov    rbx,rdi
  c7e90b:	49 89 f6             	mov    r14,rsi
  c7e90e:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
  c7e912:	6a 01                	push   0x1
  c7e914:	5f                   	pop    rdi
  c7e915:	48 89 de             	mov    rsi,rbx
  c7e918:	4c 89 f2             	mov    rdx,r14
  c7e91b:	ff d0                	call   rax
  c7e91d:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
  c7e921:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  c7e925:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  c7e92a:	48 83 c4 08          	add    rsp,0x8
  c7e92e:	5b                   	pop    rbx
  c7e92f:	41 5e                	pop    r14
  c7e931:	c3                   	ret
  c7e932:	48 89 c7             	mov    rdi,rax
  c7e935:	e8 6b b1 df ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  c7e93a:	83 ff 01             	cmp    edi,0x1
  c7e93d:	74 1e                	je     c7e95d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb8fd>
  c7e93f:	85 ff                	test   edi,edi
  c7e941:	75 20                	jne    c7e963 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb903>
  c7e943:	53                   	push   rbx
  c7e944:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
  c7e947:	48 85 db             	test   rbx,rbx
  c7e94a:	74 08                	je     c7e954 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb8f4>
  c7e94c:	48 89 df             	mov    rdi,rbx
  c7e94f:	e8 8a 00 00 00       	call   c7e9de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb97e>
  c7e954:	48 89 df             	mov    rdi,rbx
  c7e957:	5b                   	pop    rbx
  c7e958:	e9 c3 f5 b6 00       	jmp    17edf20 <_ZdlPv@plt>
  c7e95d:	48 8b 02             	mov    rax,QWORD PTR [rdx]
  c7e960:	48 89 06             	mov    QWORD PTR [rsi],rax
  c7e963:	c3                   	ret
  c7e964:	41 57                	push   r15
  c7e966:	41 56                	push   r14
  c7e968:	53                   	push   rbx
  c7e969:	48 83 ec 30          	sub    rsp,0x30
  c7e96d:	89 f3                	mov    ebx,esi
  c7e96f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c7e976:	00 00 
  c7e978:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  c7e97d:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  c7e980:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  c7e984:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
  c7e987:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  c7e98b:	0f 57 c0             	xorps  xmm0,xmm0
  c7e98e:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
  c7e991:	e8 90 ff e2 ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
  c7e996:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
  c7e99b:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  c7e99f:	41                   	rex.B

## 0xfec818

/tmp/carrierfw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fec7f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3c0e>:
  fec7f8:	94                   	xchg   esp,eax
  fec7f9:	16                   	(bad)
  fec7fa:	80 00 48             	add    BYTE PTR [rax],0x48
  fec7fd:	8b 7b 10             	mov    edi,DWORD PTR [rbx+0x10]
  fec800:	5b                   	pop    rbx
  fec801:	e9 80 1c ab ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  fec806:	53                   	push   rbx
  fec807:	48 89 fb             	mov    rbx,rdi
  fec80a:	e8 cd ff ff ff       	call   fec7dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3bf2>
  fec80f:	48 89 df             	mov    rdi,rbx
  fec812:	5b                   	pop    rbx
  fec813:	e9 08 17 80 00       	jmp    17edf20 <_ZdlPv@plt>
  fec818:	55                   	push   rbp
  fec819:	41 57                	push   r15
  fec81b:	41 56                	push   r14
  fec81d:	41 55                	push   r13
  fec81f:	41 54                	push   r12
  fec821:	53                   	push   rbx
  fec822:	48 83 ec 48          	sub    rsp,0x48
  fec826:	89 d5                	mov    ebp,edx
  fec828:	49 89 f7             	mov    r15,rsi
  fec82b:	49 89 fe             	mov    r14,rdi
  fec82e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fec835:	00 00 
  fec837:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  fec83c:	49 83 c6 10          	add    r14,0x10
  fec840:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
  fec845:	48 89 df             	mov    rdi,rbx
  fec848:	4c 89 f6             	mov    rsi,r14
  fec84b:	e8 e0 ea ab ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  fec850:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
  fec853:	48 85 db             	test   rbx,rbx
  fec856:	0f 84 2e 01 00 00    	je     fec98a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3da0>
  fec85c:	40 84 ed             	test   bpl,bpl
  fec85f:	74 23                	je     fec884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3c9a>
  fec861:	0f 57 c0             	xorps  xmm0,xmm0
  fec864:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
  fec869:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
  fec86e:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
  fec872:	4c 89 e6             	mov    rsi,r12
  fec875:	e8 a2 cf ac ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fec87a:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  fec87f:	e8 02 1c ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fec884:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fec889:	4c 89 fe             	mov    rsi,r15
  fec88c:	e8 c5 94 ed ff       	call   ec5d56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d16c>
  fec891:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
  fec895:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  fec899:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
  fec89d:	4d 85 f6             	test   r14,r14
  fec8a0:	74 05                	je     fec8a7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3cbd>
  fec8a2:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fec8a7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
  fec8ac:	4d 85 ff             	test   r15,r15
  fec8af:	74 75                	je     fec926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d3c>
  fec8b1:	6a 28                	push   0x28
  fec8b3:	5f                   	pop    rdi
  fec8b4:	e8 47 16 80 00       	call   17edf00 <_Znwm@plt>
  fec8b9:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  fec8bd:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
  fec8c1:	4d 85 f6             	test   r14,r14
  fec8c4:	74 05                	je     fec8cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3ce1>
  fec8c6:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fec8cb:	40 88 68 20          	mov    BYTE PTR [rax+0x20],bpl
  fec8cf:	48 8d 0d ea 00 00 00 	lea    rcx,[rip+0xea]        # fec9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3dd6>
  fec8d6:	48 89 08             	mov    QWORD PTR [rax],rcx
  fec8d9:	48 8d 0d d8 2f b5 ff 	lea    rcx,[rip+0xffffffffffb52fd8]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
  fec8e0:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  fec8e4:	4c 89 ff             	mov    rdi,r15
  fec8e7:	48 89 c6             	mov    rsi,rax
  fec8ea:	e8 c1 ab f3 ff       	call   f274b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee8c6>
  fec8ef:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fec8f4:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
  fec8f8:	0f 57 c0             	xorps  xmm0,xmm0
  fec8fb:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  fec8fe:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
  fec903:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
  fec908:	4c 89 ee             	mov    rsi,r13
  fec90b:	e8 0c cf ac ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fec910:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fec914:	e8 6d 1b ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fec919:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd
  fec91d:	76 11                	jbe    fec930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d46>
  fec91f:	31 c0                	xor    eax,eax
  fec921:	45 31 ff             	xor    r15d,r15d
  fec924:	eb 1c                	jmp    fec942 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d58>
  fec926:	0f 57 c0             	xorps  xmm0,xmm0
  fec929:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
  fec92e:	eb 2b                	jmp    fec95b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d71>
  fec930:	4d 85 e4             	test   r12,r12
  fec933:	74 0b                	je     fec940 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d56>
  fec935:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
  fec93b:	4c 89 e0             	mov    rax,r12
  fec93e:	eb 02                	jmp    fec942 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3d58>
  fec940:	31 c0                	xor    eax,eax
  fec942:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
  fec947:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  fec94c:	31 ff                	xor    edi,edi
  fec94e:	e8 33 1b ab ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fec953:	4c 89 e7             	mov    rdi,r12
  fec956:	e8                   	.byte 0xe8
  fec957:	2b                   	.byte 0x2b

## 0xfeca6c

/tmp/carrierfw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000feca4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3e62>:
  feca4c:	8b 04 25 28 00 00 00 	mov    eax,DWORD PTR ds:0x28
  feca53:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
  feca58:	75 0c                	jne    feca66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3e7c>
  feca5a:	48 83 c4 38          	add    rsp,0x38
  feca5e:	5b                   	pop    rbx
  feca5f:	41 5c                	pop    r12
  feca61:	41 5e                	pop    r14
  feca63:	41 5f                	pop    r15
  feca65:	c3                   	ret
  feca66:	e8 45 30 80 00       	call   17efab0 <__stack_chk_fail@plt>
  feca6b:	cc                   	int3
  feca6c:	48 81 fe 00 5c 26 05 	cmp    rsi,0x5265c00
  feca73:	0f 9c c0             	setl   al
  feca76:	c3                   	ret
  feca77:	cc                   	int3
  feca78:	55                   	push   rbp
  feca79:	41 57                	push   r15
  feca7b:	41 56                	push   r14
  feca7d:	41 55                	push   r13
  feca7f:	41 54                	push   r12
  feca81:	53                   	push   rbx
  feca82:	48 83 ec 58          	sub    rsp,0x58
  feca86:	45 89 cd             	mov    r13d,r9d
  feca89:	4d 89 c4             	mov    r12,r8
  feca8c:	49 89 cf             	mov    r15,rcx
  feca8f:	89 d5                	mov    ebp,edx
  feca91:	89 74 24 08          	mov    DWORD PTR [rsp+0x8],esi
  feca95:	49 89 fe             	mov    r14,rdi
  feca98:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  feca9f:	00 00 
  fecaa1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
  fecaa6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fecaa9:	ff 50 10             	call   QWORD PTR [rax+0x10]
  fecaac:	89 c3                	mov    ebx,eax
  fecaae:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fecab1:	4c 89 f7             	mov    rdi,r14
  fecab4:	ff 50 18             	call   QWORD PTR [rax+0x18]
  fecab7:	44 89 6c 24 0c       	mov    DWORD PTR [rsp+0xc],r13d
  fecabc:	49 63 cd             	movsxd rcx,r13d
  fecabf:	49 29 cf             	sub    r15,rcx
  fecac2:	39 e8                	cmp    eax,ebp
  fecac4:	75 2d                	jne    fecaf3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3f09>
  fecac6:	4c 2b a4 24 90 00 00 	sub    r12,QWORD PTR [rsp+0x90]
  fecacd:	00 
  fecace:	31 c0                	xor    eax,eax
  fecad0:	4d 85 e4             	test   r12,r12
  fecad3:	4c 0f 4e e0          	cmovle r12,rax
  fecad7:	4d 01 fc             	add    r12,r15
  fecada:	8b 4c 24 08          	mov    ecx,DWORD PTR [rsp+0x8]
  fecade:	f7 d1                	not    ecx
  fecae0:	01 cb                	add    ebx,ecx
  fecae2:	85 db                	test   ebx,ebx
  fecae4:	0f 4e d8             	cmovle ebx,eax
  fecae7:	49 0f af df          	imul   rbx,r15
  fecaeb:	4c 01 e3             	add    rbx,r12
  fecaee:	e9 a9 00 00 00       	jmp    fecb9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3fb2>
  fecaf3:	ff cb                	dec    ebx
  fecaf5:	48 63 c3             	movsxd rax,ebx
  fecaf8:	49 0f af c7          	imul   rax,r15
  fecafc:	31 db                	xor    ebx,ebx
  fecafe:	85 ed                	test   ebp,ebp
  fecb00:	48 0f 4f d8          	cmovg  rbx,rax
  fecb04:	4c 01 fb             	add    rbx,r15
  fecb07:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  fecb0b:	41 ff 56 20          	call   QWORD PTR [r14+0x20]
  fecb0f:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fecb14:	48 89 07             	mov    QWORD PTR [rdi],rax
  fecb17:	e8 24 20 80 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
  fecb1c:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
  fecb21:	48 89 06             	mov    QWORD PTR [rsi],rax
  fecb24:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
  fecb29:	4c 89 ff             	mov    rdi,r15
  fecb2c:	e8 37 b4 7e 00       	call   17d7f68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3d89>
  fecb31:	41 8b 6f 14          	mov    ebp,DWORD PTR [r15+0x14]
  fecb35:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fecb38:	4c 89 f7             	mov    rdi,r14
  fecb3b:	ff 50 18             	call   QWORD PTR [rax+0x18]
  fecb3e:	89 c1                	mov    ecx,eax
  fecb40:	80 f9 02             	cmp    cl,0x2
  fecb43:	75 33                	jne    fecb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3f8e>
  fecb45:	40 f6 c5 03          	test   bpl,0x3
  fecb49:	75 34                	jne    fecb7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3f95>
  fecb4b:	81 c5 6c 07 00 00    	add    ebp,0x76c
  fecb51:	66 be 64 00          	mov    si,0x64
  fecb55:	89 e8                	mov    eax,ebp
  fecb57:	66 99                	cwd
  fecb59:	66 f7 fe             	idiv   si
  fecb5c:	89 d6                	mov    esi,edx
  fecb5e:	66 bf 90 01          	mov    di,0x190
  fecb62:	89 e8                	mov    eax,ebp
  fecb64:	66 99                	cwd
  fecb66:	66 f7 ff             	idiv   di
  fecb69:	6a 1d                	push   0x1d
  fecb6b:	58                   	pop    rax
  fecb6c:	66 85 f6             	test   si,si
  fecb6f:	75 23                	jne    fecb94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3faa>
  fecb71:	66 85 d2             	test   dx,dx
  fecb74:	75 09                	jne    fecb7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3f95>
  fecb76:	eb 1c                	jmp    fecb94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3faa>
  fecb78:	8d 41 ff             	lea    eax,[rcx-0x1]
  fecb7b:	3c 0b                	cmp    al,0xb
  fecb7d:	77 12                	ja     fecb91 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3fa7>
  fecb7f:	0f b6 c1             	movzx  eax,cl
  fecb82:	ff c8                	dec    eax
  fecb84:	48 8d 0d bd 88 3e ff 	lea    rcx,[rip+0xffffffffff3e88bd]        # 3d5448 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d>
  fecb8b:	0f b6 04 08          	movzx  eax,BYTE PTR [rax+rcx*1]
  fecb8f:	eb 03                	jmp    fecb94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3faa>
  fecb91:	6a 1d                	push   0x1d
  fecb93:	58                   	pop    rax
  fecb94:	0f af 44 24 0c       	imul   eax,DWORD PTR [rsp+0xc]
  fecb99:	48 01 c3             	add    rbx,rax
  fecb9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fecba3:	00 00 
  fecba5:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
  fecbaa:	75 12                	jne    fecbbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3fd4>

## 0xfeca78

/tmp/carrierfw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000feca58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3e6e>:
  feca58:	75 0c                	jne    feca66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3e7c>
  feca5a:	48 83 c4 38          	add    rsp,0x38
  feca5e:	5b                   	pop    rbx
  feca5f:	41 5c                	pop    r12
  feca61:	41 5e                	pop    r14
  feca63:	41 5f                	pop    r15
  feca65:	c3                   	ret
  feca66:	e8 45 30 80 00       	call   17efab0 <__stack_chk_fail@plt>
  feca6b:	cc                   	int3
  feca6c:	48 81 fe 00 5c 26 05 	cmp    rsi,0x5265c00
  feca73:	0f 9c c0             	setl   al
  feca76:	c3                   	ret
  feca77:	cc                   	int3
  feca78:	55                   	push   rbp
  feca79:	41 57                	push   r15
  feca7b:	41 56                	push   r14
  feca7d:	41 55                	push   r13
  feca7f:	41 54                	push   r12
  feca81:	53                   	push   rbx
  feca82:	48 83 ec 58          	sub    rsp,0x58
  feca86:	45 89 cd             	mov    r13d,r9d
  feca89:	4d 89 c4             	mov    r12,r8
  feca8c:	49 89 cf             	mov    r15,rcx
  feca8f:	89 d5                	mov    ebp,edx
  feca91:	89 74 24 08          	mov    DWORD PTR [rsp+0x8],esi
  feca95:	49 89 fe             	mov    r14,rdi
  feca98:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  feca9f:	00 00 
  fecaa1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
  fecaa6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fecaa9:	ff 50 10             	call   QWORD PTR [rax+0x10]
  fecaac:	89 c3                	mov    ebx,eax
  fecaae:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fecab1:	4c 89 f7             	mov    rdi,r14
  fecab4:	ff 50 18             	call   QWORD PTR [rax+0x18]
  fecab7:	44 89 6c 24 0c       	mov    DWORD PTR [rsp+0xc],r13d
  fecabc:	49 63 cd             	movsxd rcx,r13d
  fecabf:	49 29 cf             	sub    r15,rcx
  fecac2:	39 e8                	cmp    eax,ebp
  fecac4:	75 2d                	jne    fecaf3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3f09>
  fecac6:	4c 2b a4 24 90 00 00 	sub    r12,QWORD PTR [rsp+0x90]
  fecacd:	00 
  fecace:	31 c0                	xor    eax,eax
  fecad0:	4d 85 e4             	test   r12,r12
  fecad3:	4c 0f 4e e0          	cmovle r12,rax
  fecad7:	4d 01 fc             	add    r12,r15
  fecada:	8b 4c 24 08          	mov    ecx,DWORD PTR [rsp+0x8]
  fecade:	f7 d1                	not    ecx
  fecae0:	01 cb                	add    ebx,ecx
  fecae2:	85 db                	test   ebx,ebx
  fecae4:	0f 4e d8             	cmovle ebx,eax
  fecae7:	49 0f af df          	imul   rbx,r15
  fecaeb:	4c 01 e3             	add    rbx,r12
  fecaee:	e9 a9 00 00 00       	jmp    fecb9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3fb2>
  fecaf3:	ff cb                	dec    ebx
  fecaf5:	48 63 c3             	movsxd rax,ebx
  fecaf8:	49 0f af c7          	imul   rax,r15
  fecafc:	31 db                	xor    ebx,ebx
  fecafe:	85 ed                	test   ebp,ebp
  fecb00:	48 0f 4f d8          	cmovg  rbx,rax
  fecb04:	4c 01 fb             	add    rbx,r15
  fecb07:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  fecb0b:	41 ff 56 20          	call   QWORD PTR [r14+0x20]
  fecb0f:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fecb14:	48 89 07             	mov    QWORD PTR [rdi],rax
  fecb17:	e8 24 20 80 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
  fecb1c:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
  fecb21:	48 89 06             	mov    QWORD PTR [rsi],rax
  fecb24:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
  fecb29:	4c 89 ff             	mov    rdi,r15
  fecb2c:	e8 37 b4 7e 00       	call   17d7f68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3d89>
  fecb31:	41 8b 6f 14          	mov    ebp,DWORD PTR [r15+0x14]
  fecb35:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fecb38:	4c 89 f7             	mov    rdi,r14
  fecb3b:	ff 50 18             	call   QWORD PTR [rax+0x18]
  fecb3e:	89 c1                	mov    ecx,eax
  fecb40:	80 f9 02             	cmp    cl,0x2
  fecb43:	75 33                	jne    fecb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3f8e>
  fecb45:	40 f6 c5 03          	test   bpl,0x3
  fecb49:	75 34                	jne    fecb7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3f95>
  fecb4b:	81 c5 6c 07 00 00    	add    ebp,0x76c
  fecb51:	66 be 64 00          	mov    si,0x64
  fecb55:	89 e8                	mov    eax,ebp
  fecb57:	66 99                	cwd
  fecb59:	66 f7 fe             	idiv   si
  fecb5c:	89 d6                	mov    esi,edx
  fecb5e:	66 bf 90 01          	mov    di,0x190
  fecb62:	89 e8                	mov    eax,ebp
  fecb64:	66 99                	cwd
  fecb66:	66 f7 ff             	idiv   di
  fecb69:	6a 1d                	push   0x1d
  fecb6b:	58                   	pop    rax
  fecb6c:	66 85 f6             	test   si,si
  fecb6f:	75 23                	jne    fecb94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3faa>
  fecb71:	66 85 d2             	test   dx,dx
  fecb74:	75 09                	jne    fecb7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3f95>
  fecb76:	eb 1c                	jmp    fecb94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3faa>
  fecb78:	8d 41 ff             	lea    eax,[rcx-0x1]
  fecb7b:	3c 0b                	cmp    al,0xb
  fecb7d:	77 12                	ja     fecb91 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3fa7>
  fecb7f:	0f b6 c1             	movzx  eax,cl
  fecb82:	ff c8                	dec    eax
  fecb84:	48 8d 0d bd 88 3e ff 	lea    rcx,[rip+0xffffffffff3e88bd]        # 3d5448 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d>
  fecb8b:	0f b6 04 08          	movzx  eax,BYTE PTR [rax+rcx*1]
  fecb8f:	eb 03                	jmp    fecb94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3faa>
  fecb91:	6a 1d                	push   0x1d
  fecb93:	58                   	pop    rax
  fecb94:	0f af 44 24 0c       	imul   eax,DWORD PTR [rsp+0xc]
  fecb99:	48 01 c3             	add    rbx,rax
  fecb9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fecba3:	00 00 
  fecba5:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
  fecbaa:	75 12                	jne    fecbbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3fd4>
  fecbac:	48 89 d8             	mov    rax,rbx
  fecbaf:	48 83 c4 58          	add    rsp,0x58
  fecbb3:	5b                   	pop    rbx
  fecbb4:	41 5c                	pop    r12
  fecbb6:	41 5d                	pop    r13

## 0xfecbc4

/tmp/carrierfw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fecba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3fba>:
  fecba4:	00 48 3b             	add    BYTE PTR [rax+0x3b],cl
  fecba7:	44 24 50             	rex.R and al,0x50
  fecbaa:	75 12                	jne    fecbbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b3fd4>
  fecbac:	48 89 d8             	mov    rax,rbx
  fecbaf:	48 83 c4 58          	add    rsp,0x58
  fecbb3:	5b                   	pop    rbx
  fecbb4:	41 5c                	pop    r12
  fecbb6:	41 5d                	pop    r13
  fecbb8:	41 5e                	pop    r14
  fecbba:	41 5f                	pop    r15
  fecbbc:	5d                   	pop    rbp
  fecbbd:	c3                   	ret
  fecbbe:	e8 ed 2e 80 00       	call   17efab0 <__stack_chk_fail@plt>
  fecbc3:	cc                   	int3
  fecbc4:	53                   	push   rbx
  fecbc5:	48 83 ec 50          	sub    rsp,0x50
  fecbc9:	48 89 f8             	mov    rax,rdi
  fecbcc:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  fecbd3:	00 00 
  fecbd5:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
  fecbda:	48 83 c7 08          	add    rdi,0x8
  fecbde:	ff 50 20             	call   QWORD PTR [rax+0x20]
  fecbe1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fecbe6:	48 89 07             	mov    QWORD PTR [rdi],rax
  fecbe9:	e8 52 1f 80 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
  fecbee:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  fecbf3:	48 89 06             	mov    QWORD PTR [rsi],rax
  fecbf6:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  fecbfb:	48 89 df             	mov    rdi,rbx
  fecbfe:	e8 65 b3 7e 00       	call   17d7f68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3d89>
  fecc03:	8b 43 0c             	mov    eax,DWORD PTR [rbx+0xc]
  fecc06:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  fecc0d:	00 00 
  fecc0f:	48 3b 4c 24 48       	cmp    rcx,QWORD PTR [rsp+0x48]
  fecc14:	75 06                	jne    fecc1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4032>
  fecc16:	48 83 c4 50          	add    rsp,0x50
  fecc1a:	5b                   	pop    rbx
  fecc1b:	c3                   	ret
  fecc1c:	e8 8f 2e 80 00       	call   17efab0 <__stack_chk_fail@plt>
  fecc21:	cc                   	int3
  fecc22:	53                   	push   rbx
  fecc23:	48 83 ec 50          	sub    rsp,0x50
  fecc27:	48 89 f8             	mov    rax,rdi
  fecc2a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  fecc31:	00 00 
  fecc33:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
  fecc38:	48 83 c7 08          	add    rdi,0x8
  fecc3c:	ff 50 20             	call   QWORD PTR [rax+0x20]
  fecc3f:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fecc44:	48 89 07             	mov    QWORD PTR [rdi],rax
  fecc47:	e8 f4 1e 80 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
  fecc4c:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  fecc51:	48 89 06             	mov    QWORD PTR [rsi],rax
  fecc54:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  fecc59:	48 89 df             	mov    rdi,rbx
  fecc5c:	e8 07 b3 7e 00       	call   17d7f68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3d89>
  fecc61:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
  fecc64:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  fecc6b:	00 00 
  fecc6d:	48 3b 4c 24 48       	cmp    rcx,QWORD PTR [rsp+0x48]
  fecc72:	75 08                	jne    fecc7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4092>
  fecc74:	ff c0                	inc    eax
  fecc76:	48 83 c4 50          	add    rsp,0x50
  fecc7a:	5b                   	pop    rbx
  fecc7b:	c3                   	ret
  fecc7c:	e8 2f 2e 80 00       	call   17efab0 <__stack_chk_fail@plt>
  fecc81:	cc                   	int3
  fecc82:	48 8d 05 e7 6f 85 00 	lea    rax,[rip+0x856fe7]        # 1843c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358>
  fecc89:	48 89 07             	mov    QWORD PTR [rdi],rax
  fecc8c:	48 83 c7 08          	add    rdi,0x8
  fecc90:	e9 a3 88 ae ff       	jmp    ad5538 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224d8>
  fecc95:	cc                   	int3
  fecc96:	53                   	push   rbx
  fecc97:	48 89 fb             	mov    rbx,rdi
  fecc9a:	e8 e3 ff ff ff       	call   fecc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4098>
  fecc9f:	48 89 df             	mov    rdi,rbx
  fecca2:	5b                   	pop    rbx
  fecca3:	e9 78 12 80 00       	jmp    17edf20 <_ZdlPv@plt>
  fecca8:	55                   	push   rbp
  fecca9:	41 57                	push   r15
  feccab:	41 56                	push   r14
  feccad:	41 55                	push   r13
  feccaf:	41 54                	push   r12
  feccb1:	53                   	push   rbx
  feccb2:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  feccb9:	49 89 d6             	mov    r14,rdx
  feccbc:	49 89 f4             	mov    r12,rsi
  feccbf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  feccc6:	00 00 
  feccc8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  fecccf:	00 
  feccd0:	48 8b 2f             	mov    rbp,QWORD PTR [rdi]
  feccd3:	80 bd e8 00 00 00 00 	cmp    BYTE PTR [rbp+0xe8],0x0
  feccda:	74 07                	je     fecce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b40f9>
  feccdc:	c6 85 e8 00 00 00 00 	mov    BYTE PTR [rbp+0xe8],0x0
  fecce3:	48 8d 5d 68          	lea    rbx,[rbp+0x68]
  fecce7:	48 8b 7d 68          	mov    rdi,QWORD PTR [rbp+0x68]
  fecceb:	e8 78 ce 7e 00       	call   17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
  feccf0:	84 c0                	test   al,al
  feccf2:	74 08                	je     feccfc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4112>
  feccf4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  feccf7:	e8 22 ce 7e 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
  feccfc:	48 8b 45 18          	mov    rax,QWORD PTR [rbp+0x18]
  fecd00:	48 2b 45 28          	sub    rax,QWORD PTR [rbp+0x28]

## 0xfecc22

/tmp/carrierfw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fecc02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4018>:
  fecc02:	00 8b 43 0c 64 48    	add    BYTE PTR [rbx+0x48640c43],cl
  fecc08:	8b 0c 25 28 00 00 00 	mov    ecx,DWORD PTR ds:0x28
  fecc0f:	48 3b 4c 24 48       	cmp    rcx,QWORD PTR [rsp+0x48]
  fecc14:	75 06                	jne    fecc1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4032>
  fecc16:	48 83 c4 50          	add    rsp,0x50
  fecc1a:	5b                   	pop    rbx
  fecc1b:	c3                   	ret
  fecc1c:	e8 8f 2e 80 00       	call   17efab0 <__stack_chk_fail@plt>
  fecc21:	cc                   	int3
  fecc22:	53                   	push   rbx
  fecc23:	48 83 ec 50          	sub    rsp,0x50
  fecc27:	48 89 f8             	mov    rax,rdi
  fecc2a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  fecc31:	00 00 
  fecc33:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
  fecc38:	48 83 c7 08          	add    rdi,0x8
  fecc3c:	ff 50 20             	call   QWORD PTR [rax+0x20]
  fecc3f:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fecc44:	48 89 07             	mov    QWORD PTR [rdi],rax
  fecc47:	e8 f4 1e 80 00       	call   17eeb40 <_ZNSt6__ndk16chrono12system_clock9to_time_tERKNS0_10time_pointIS1_NS0_8durationIxNS_5ratioILl1ELl1000000EEEEEEE@plt>
  fecc4c:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  fecc51:	48 89 06             	mov    QWORD PTR [rsi],rax
  fecc54:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  fecc59:	48 89 df             	mov    rdi,rbx
  fecc5c:	e8 07 b3 7e 00       	call   17d7f68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3d89>
  fecc61:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
  fecc64:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  fecc6b:	00 00 
  fecc6d:	48 3b 4c 24 48       	cmp    rcx,QWORD PTR [rsp+0x48]
  fecc72:	75 08                	jne    fecc7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4092>
  fecc74:	ff c0                	inc    eax
  fecc76:	48 83 c4 50          	add    rsp,0x50
  fecc7a:	5b                   	pop    rbx
  fecc7b:	c3                   	ret
  fecc7c:	e8 2f 2e 80 00       	call   17efab0 <__stack_chk_fail@plt>
  fecc81:	cc                   	int3
  fecc82:	48 8d 05 e7 6f 85 00 	lea    rax,[rip+0x856fe7]        # 1843c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358>
  fecc89:	48 89 07             	mov    QWORD PTR [rdi],rax
  fecc8c:	48 83 c7 08          	add    rdi,0x8
  fecc90:	e9 a3 88 ae ff       	jmp    ad5538 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224d8>
  fecc95:	cc                   	int3
  fecc96:	53                   	push   rbx
  fecc97:	48 89 fb             	mov    rbx,rdi
  fecc9a:	e8 e3 ff ff ff       	call   fecc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4098>
  fecc9f:	48 89 df             	mov    rdi,rbx
  fecca2:	5b                   	pop    rbx
  fecca3:	e9 78 12 80 00       	jmp    17edf20 <_ZdlPv@plt>
  fecca8:	55                   	push   rbp
  fecca9:	41 57                	push   r15
  feccab:	41 56                	push   r14
  feccad:	41 55                	push   r13
  feccaf:	41 54                	push   r12
  feccb1:	53                   	push   rbx
  feccb2:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  feccb9:	49 89 d6             	mov    r14,rdx
  feccbc:	49 89 f4             	mov    r12,rsi
  feccbf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  feccc6:	00 00 
  feccc8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  fecccf:	00 
  feccd0:	48 8b 2f             	mov    rbp,QWORD PTR [rdi]
  feccd3:	80 bd e8 00 00 00 00 	cmp    BYTE PTR [rbp+0xe8],0x0
  feccda:	74 07                	je     fecce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b40f9>
  feccdc:	c6 85 e8 00 00 00 00 	mov    BYTE PTR [rbp+0xe8],0x0
  fecce3:	48 8d 5d 68          	lea    rbx,[rbp+0x68]
  fecce7:	48 8b 7d 68          	mov    rdi,QWORD PTR [rbp+0x68]
  fecceb:	e8 78 ce 7e 00       	call   17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
  feccf0:	84 c0                	test   al,al
  feccf2:	74 08                	je     feccfc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4112>
  feccf4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  feccf7:	e8 22 ce 7e 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
  feccfc:	48 8b 45 18          	mov    rax,QWORD PTR [rbp+0x18]
  fecd00:	48 2b 45 28          	sub    rax,QWORD PTR [rbp+0x28]
  fecd04:	48 8d 48 ff          	lea    rcx,[rax-0x1]
  fecd08:	48 81 f9 2f 75 00 00 	cmp    rcx,0x752f
  fecd0f:	41 bf 30 75 00 00    	mov    r15d,0x7530
  fecd15:	4c 0f 43 f8          	cmovae r15,rax
  fecd19:	4c 89 e7             	mov    rdi,r12
  fecd1c:	e8 25 03 00 00       	call   fed046 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b445c>
  fecd21:	84 c0                	test   al,al
  fecd23:	0f 84 ee 00 00 00    	je     fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd29:	48 8b bd c8 00 00 00 	mov    rdi,QWORD PTR [rbp+0xc8]
  fecd30:	48 8b b5 d0 00 00 00 	mov    rsi,QWORD PTR [rbp+0xd0]
  fecd37:	4c 89 e2             	mov    rdx,r12
  fecd3a:	e8 21 03 00 00       	call   fed060 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4476>
  fecd3f:	84 c0                	test   al,al
  fecd41:	0f 84 d0 00 00 00    	je     fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd47:	4d 85 ff             	test   r15,r15
  fecd4a:	0f 8e c7 00 00 00    	jle    fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd50:	4d 39 f7             	cmp    r15,r14
  fecd53:	0f 8d be 00 00 00    	jge    fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd59:	4c 8b ad 18 01 00 00 	mov    r13,QWORD PTR [rbp+0x118]
  fecd60:	4c                   	rex.WR
  fecd61:	8d                   	.byte 0x8d

## 0xfecc82

/tmp/carrierfw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fecc62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4078>:
  fecc62:	43 10 64 48 8b       	adc    BYTE PTR [r8+r9*2-0x75],spl
  fecc67:	0c 25                	or     al,0x25
  fecc69:	28 00                	sub    BYTE PTR [rax],al
  fecc6b:	00 00                	add    BYTE PTR [rax],al
  fecc6d:	48 3b 4c 24 48       	cmp    rcx,QWORD PTR [rsp+0x48]
  fecc72:	75 08                	jne    fecc7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4092>
  fecc74:	ff c0                	inc    eax
  fecc76:	48 83 c4 50          	add    rsp,0x50
  fecc7a:	5b                   	pop    rbx
  fecc7b:	c3                   	ret
  fecc7c:	e8 2f 2e 80 00       	call   17efab0 <__stack_chk_fail@plt>
  fecc81:	cc                   	int3
  fecc82:	48 8d 05 e7 6f 85 00 	lea    rax,[rip+0x856fe7]        # 1843c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358>
  fecc89:	48 89 07             	mov    QWORD PTR [rdi],rax
  fecc8c:	48 83 c7 08          	add    rdi,0x8
  fecc90:	e9 a3 88 ae ff       	jmp    ad5538 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224d8>
  fecc95:	cc                   	int3
  fecc96:	53                   	push   rbx
  fecc97:	48 89 fb             	mov    rbx,rdi
  fecc9a:	e8 e3 ff ff ff       	call   fecc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4098>
  fecc9f:	48 89 df             	mov    rdi,rbx
  fecca2:	5b                   	pop    rbx
  fecca3:	e9 78 12 80 00       	jmp    17edf20 <_ZdlPv@plt>
  fecca8:	55                   	push   rbp
  fecca9:	41 57                	push   r15
  feccab:	41 56                	push   r14
  feccad:	41 55                	push   r13
  feccaf:	41 54                	push   r12
  feccb1:	53                   	push   rbx
  feccb2:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  feccb9:	49 89 d6             	mov    r14,rdx
  feccbc:	49 89 f4             	mov    r12,rsi
  feccbf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  feccc6:	00 00 
  feccc8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  fecccf:	00 
  feccd0:	48 8b 2f             	mov    rbp,QWORD PTR [rdi]
  feccd3:	80 bd e8 00 00 00 00 	cmp    BYTE PTR [rbp+0xe8],0x0
  feccda:	74 07                	je     fecce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b40f9>
  feccdc:	c6 85 e8 00 00 00 00 	mov    BYTE PTR [rbp+0xe8],0x0
  fecce3:	48 8d 5d 68          	lea    rbx,[rbp+0x68]
  fecce7:	48 8b 7d 68          	mov    rdi,QWORD PTR [rbp+0x68]
  fecceb:	e8 78 ce 7e 00       	call   17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
  feccf0:	84 c0                	test   al,al
  feccf2:	74 08                	je     feccfc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4112>
  feccf4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  feccf7:	e8 22 ce 7e 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
  feccfc:	48 8b 45 18          	mov    rax,QWORD PTR [rbp+0x18]
  fecd00:	48 2b 45 28          	sub    rax,QWORD PTR [rbp+0x28]
  fecd04:	48 8d 48 ff          	lea    rcx,[rax-0x1]
  fecd08:	48 81 f9 2f 75 00 00 	cmp    rcx,0x752f
  fecd0f:	41 bf 30 75 00 00    	mov    r15d,0x7530
  fecd15:	4c 0f 43 f8          	cmovae r15,rax
  fecd19:	4c 89 e7             	mov    rdi,r12
  fecd1c:	e8 25 03 00 00       	call   fed046 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b445c>
  fecd21:	84 c0                	test   al,al
  fecd23:	0f 84 ee 00 00 00    	je     fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd29:	48 8b bd c8 00 00 00 	mov    rdi,QWORD PTR [rbp+0xc8]
  fecd30:	48 8b b5 d0 00 00 00 	mov    rsi,QWORD PTR [rbp+0xd0]
  fecd37:	4c 89 e2             	mov    rdx,r12
  fecd3a:	e8 21 03 00 00       	call   fed060 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4476>
  fecd3f:	84 c0                	test   al,al
  fecd41:	0f 84 d0 00 00 00    	je     fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd47:	4d 85 ff             	test   r15,r15
  fecd4a:	0f 8e c7 00 00 00    	jle    fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd50:	4d 39 f7             	cmp    r15,r14
  fecd53:	0f 8d be 00 00 00    	jge    fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd59:	4c 8b ad 18 01 00 00 	mov    r13,QWORD PTR [rbp+0x118]
  fecd60:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  fecd65:	49 89 6e f8          	mov    QWORD PTR [r14-0x8],rbp
  fecd69:	4c 89 f7             	mov    rdi,r14
  fecd6c:	4c 89 e6             	mov    rsi,r12
  fecd6f:	e8 cc 11 80 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  fecd74:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
  fecd7a:	6a 28                	push   0x28
  fecd7c:	5f                   	pop    rdi
  fecd7d:	e8 7e 11 80 00       	call   17edf00 <_Znwm@plt>
  fecd82:	49 89 c4             	mov    r12,rax
  fecd85:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  fecd8a:	48 8d 44 24 4f       	lea    rax,[rsp+0x4f]
  fecd8f:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  fecd94:	48 c7 44 24 40 01 00 	mov    QWORD PTR [rsp+0x40],0x1
  fecd9b:	00 00 
  fecd9d:	48 8d 05 5c 6f 85 00 	lea    rax,[rip+0x856f5c]        # 1843d00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e8>
  fecda4:	49 89 04 24          	mov    QWORD PTR [r12],rax
  fecda8:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
  fecdac:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
  fecdb1:	4c 89 e7             	mov    rdi,r12
  fecdb4:	48 83 c7 10          	add    rdi,0x10
  fecdb8:	4c 89 f6             	mov    rsi,r14
  fecdbb:	e8 80 11 80 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  fecdc0:	48                   	rex.W
  fecdc1:	8d                   	.byte 0x8d

## 0xfecc96

/tmp/carrierfw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fecc76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b408c>:
  fecc76:	48 83 c4 50          	add    rsp,0x50
  fecc7a:	5b                   	pop    rbx
  fecc7b:	c3                   	ret
  fecc7c:	e8 2f 2e 80 00       	call   17efab0 <__stack_chk_fail@plt>
  fecc81:	cc                   	int3
  fecc82:	48 8d 05 e7 6f 85 00 	lea    rax,[rip+0x856fe7]        # 1843c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358>
  fecc89:	48 89 07             	mov    QWORD PTR [rdi],rax
  fecc8c:	48 83 c7 08          	add    rdi,0x8
  fecc90:	e9 a3 88 ae ff       	jmp    ad5538 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224d8>
  fecc95:	cc                   	int3
  fecc96:	53                   	push   rbx
  fecc97:	48 89 fb             	mov    rbx,rdi
  fecc9a:	e8 e3 ff ff ff       	call   fecc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4098>
  fecc9f:	48 89 df             	mov    rdi,rbx
  fecca2:	5b                   	pop    rbx
  fecca3:	e9 78 12 80 00       	jmp    17edf20 <_ZdlPv@plt>
  fecca8:	55                   	push   rbp
  fecca9:	41 57                	push   r15
  feccab:	41 56                	push   r14
  feccad:	41 55                	push   r13
  feccaf:	41 54                	push   r12
  feccb1:	53                   	push   rbx
  feccb2:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  feccb9:	49 89 d6             	mov    r14,rdx
  feccbc:	49 89 f4             	mov    r12,rsi
  feccbf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  feccc6:	00 00 
  feccc8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  fecccf:	00 
  feccd0:	48 8b 2f             	mov    rbp,QWORD PTR [rdi]
  feccd3:	80 bd e8 00 00 00 00 	cmp    BYTE PTR [rbp+0xe8],0x0
  feccda:	74 07                	je     fecce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b40f9>
  feccdc:	c6 85 e8 00 00 00 00 	mov    BYTE PTR [rbp+0xe8],0x0
  fecce3:	48 8d 5d 68          	lea    rbx,[rbp+0x68]
  fecce7:	48 8b 7d 68          	mov    rdi,QWORD PTR [rbp+0x68]
  fecceb:	e8 78 ce 7e 00       	call   17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
  feccf0:	84 c0                	test   al,al
  feccf2:	74 08                	je     feccfc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4112>
  feccf4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  feccf7:	e8 22 ce 7e 00       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
  feccfc:	48 8b 45 18          	mov    rax,QWORD PTR [rbp+0x18]
  fecd00:	48 2b 45 28          	sub    rax,QWORD PTR [rbp+0x28]
  fecd04:	48 8d 48 ff          	lea    rcx,[rax-0x1]
  fecd08:	48 81 f9 2f 75 00 00 	cmp    rcx,0x752f
  fecd0f:	41 bf 30 75 00 00    	mov    r15d,0x7530
  fecd15:	4c 0f 43 f8          	cmovae r15,rax
  fecd19:	4c 89 e7             	mov    rdi,r12
  fecd1c:	e8 25 03 00 00       	call   fed046 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b445c>
  fecd21:	84 c0                	test   al,al
  fecd23:	0f 84 ee 00 00 00    	je     fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd29:	48 8b bd c8 00 00 00 	mov    rdi,QWORD PTR [rbp+0xc8]
  fecd30:	48 8b b5 d0 00 00 00 	mov    rsi,QWORD PTR [rbp+0xd0]
  fecd37:	4c 89 e2             	mov    rdx,r12
  fecd3a:	e8 21 03 00 00       	call   fed060 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4476>
  fecd3f:	84 c0                	test   al,al
  fecd41:	0f 84 d0 00 00 00    	je     fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd47:	4d 85 ff             	test   r15,r15
  fecd4a:	0f 8e c7 00 00 00    	jle    fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd50:	4d 39 f7             	cmp    r15,r14
  fecd53:	0f 8d be 00 00 00    	jge    fece17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b422d>
  fecd59:	4c 8b ad 18 01 00 00 	mov    r13,QWORD PTR [rbp+0x118]
  fecd60:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  fecd65:	49 89 6e f8          	mov    QWORD PTR [r14-0x8],rbp
  fecd69:	4c 89 f7             	mov    rdi,r14
  fecd6c:	4c 89 e6             	mov    rsi,r12
  fecd6f:	e8 cc 11 80 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  fecd74:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
  fecd7a:	6a 28                	push   0x28
  fecd7c:	5f                   	pop    rdi
  fecd7d:	e8 7e 11 80 00       	call   17edf00 <_Znwm@plt>
  fecd82:	49 89 c4             	mov    r12,rax
  fecd85:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  fecd8a:	48 8d 44 24 4f       	lea    rax,[rsp+0x4f]
  fecd8f:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  fecd94:	48 c7 44 24 40 01 00 	mov    QWORD PTR [rsp+0x40],0x1
  fecd9b:	00 00 
  fecd9d:	48 8d 05 5c 6f 85 00 	lea    rax,[rip+0x856f5c]        # 1843d00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e8>
  fecda4:	49 89 04 24          	mov    QWORD PTR [r12],rax
  fecda8:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
  fecdac:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
  fecdb1:	4c 89 e7             	mov    rdi,r12
  fecdb4:	48 83 c7 10          	add    rdi,0x10
  fecdb8:	4c 89 f6             	mov    rsi,r14
  fecdbb:	e8 80 11 80 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  fecdc0:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  fecdc5:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  fecdc9:	48 8d 6c 24 50       	lea    rbp,[rsp+0x50]
  fecdce:	4c 89 65 20          	mov    QWORD PTR [rbp+0x20],r12
  fecdd2:	e8                   	.byte 0xe8
  fecdd3:	f3 d4                	repz (bad)
  fecdd5:	a8                   	.byte 0xa8

## Direct references/callers
  c7e824:	53                   	push   rbx
  c7e825:	48 89 fb             	mov    rbx,rdi
  c7e828:	48 83 c7 20          	add    rdi,0x20
  c7e82c:	e8 51 a2 ee ff       	call   b68a82 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5a22>
  c7e831:	48 83 c3 08          	add    rbx,0x8
  c7e835:	48 89 df             	mov    rdi,rbx
  c7e838:	5b                   	pop    rbx
  c7e839:	e9 52 f6 b6 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c7e83e:	48 8d 05 f3 53 bc 00 	lea    rax,[rip+0xbc53f3]        # 1843c38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320>
  c7e845:	48 89 07             	mov    QWORD PTR [rdi],rax
  c7e848:	e9 c3 f7 b6 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  c7e84d:	cc                   	int3
  c7e84e:	53                   	push   rbx
  c7e84f:	48 89 fb             	mov    rbx,rdi
  c7e852:	e8 e7 ff ff ff       	call   c7e83e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cb7de>
  c7e857:	48 89 df             	mov    rdi,rbx
  c7e85a:	5b                   	pop    rbx
  c7e85b:	e9 c0 f6 b6 00       	jmp    17edf20 <_ZdlPv@plt>
  c7e860:	48 83 c7 18          	add    rdi,0x18
  c7e864:	e9 67 d5 9e 00       	jmp    166bdd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff3c>
  c7e869:	41 57                	push   r15
  c7e86b:	41 56                	push   r14
  c7e86d:	41 55                	push   r13
  c7e86f:	41 54                	push   r12
  c7e871:	53                   	push   rbx
  c7e872:	49 89 d7             	mov    r15,rdx
  c7e875:	49 89 f5             	mov    r13,rsi
  c7e878:	49 89 fe             	mov    r14,rdi
  c7e87b:	6a 58                	push   0x58
  c7e87d:	5f                   	pop    rdi
  c7e87e:	e8 7d f6 b6 00       	call   17edf00 <_Znwm@plt>
  c7e883:	48 89 c3             	mov    rbx,rax
  c7e886:	0f 57 c0             	xorps  xmm0,xmm0
  c7e889:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  c7e88d:	48 8d 05 a4 53 bc 00 	lea    rax,[rip+0xbc53a4]        # 1843c38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320>
  c7e894:	48 89 03             	mov    QWORD PTR [rbx],rax
  c7e897:	49 89 dc             	mov    r12,rbx
  c7e89a:	49 83 c4 18          	add    r12,0x18
  c7e89e:	4c 89 ef             	mov    rdi,r13
--
  fecc72:	75 08                	jne    fecc7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4092>
  fecc74:	ff c0                	inc    eax
  fecc76:	48 83 c4 50          	add    rsp,0x50
  fecc7a:	5b                   	pop    rbx
  fecc7b:	c3                   	ret
  fecc7c:	e8 2f 2e 80 00       	call   17efab0 <__stack_chk_fail@plt>
  fecc81:	cc                   	int3
  fecc82:	48 8d 05 e7 6f 85 00 	lea    rax,[rip+0x856fe7]        # 1843c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358>
  fecc89:	48 89 07             	mov    QWORD PTR [rdi],rax
  fecc8c:	48 83 c7 08          	add    rdi,0x8
  fecc90:	e9 a3 88 ae ff       	jmp    ad5538 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224d8>
  fecc95:	cc                   	int3
  fecc96:	53                   	push   rbx
  fecc97:	48 89 fb             	mov    rbx,rdi
  fecc9a:	e8 e3 ff ff ff       	call   fecc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b4098>
  fecc9f:	48 89 df             	mov    rdi,rbx
  fecca2:	5b                   	pop    rbx
  fecca3:	e9 78 12 80 00       	jmp    17edf20 <_ZdlPv@plt>
  fecca8:	55                   	push   rbp
  fecca9:	41 57                	push   r15
  feccab:	41 56                	push   r14
  feccad:	41 55                	push   r13
  feccaf:	41 54                	push   r12
  feccb1:	53                   	push   rbx
  feccb2:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  feccb9:	49 89 d6             	mov    r14,rdx
  feccbc:	49 89 f4             	mov    r12,rsi
  feccbf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  feccc6:	00 00 
  feccc8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  fecccf:	00 
  feccd0:	48 8b 2f             	mov    rbp,QWORD PTR [rdi]
  feccd3:	80 bd e8 00 00 00 00 	cmp    BYTE PTR [rbp+0xe8],0x0
  feccda:	74 07                	je     fecce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b40f9>
  feccdc:	c6 85 e8 00 00 00 00 	mov    BYTE PTR [rbp+0xe8],0x0
  fecce3:	48 8d 5d 68          	lea    rbx,[rbp+0x68]
  fecce7:	48 8b 7d 68          	mov    rdi,QWORD PTR [rbp+0x68]
  fecceb:	e8 78 ce 7e 00       	call   17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
  feccf0:	84 c0                	test   al,al
