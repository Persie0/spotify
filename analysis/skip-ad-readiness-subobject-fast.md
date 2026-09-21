# Fast readiness subobject dump

## f419b4 constructor

/tmp/rsubfast/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000f41980 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108d96>:
  f41980:	41 5f                	pop    r15
  f41982:	c3                   	ret
  f41983:	cc                   	int3
  f41984:	48 83 c7 08          	add    rdi,0x8
  f41988:	e9 07 69 ff ff       	jmp    f38294 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xff6aa>
  f4198d:	cc                   	int3
  f4198e:	53                   	push   rbx
  f4198f:	48 89 fb             	mov    rbx,rdi
  f41992:	48 83 c7 08          	add    rdi,0x8
  f41996:	e8 f9 68 ff ff       	call   f38294 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xff6aa>
  f4199b:	48 89 df             	mov    rdi,rbx
  f4199e:	5b                   	pop    rbx
  f4199f:	e9 7c c5 8a 00       	jmp    17edf20 <_ZdlPv@plt>
  f419a4:	e9 eb 68 ff ff       	jmp    f38294 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xff6aa>
  f419a9:	cc                   	int3
  f419aa:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  f419ae:	e9 db ff ff ff       	jmp    f4198e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108da4>
  f419b3:	cc                   	int3
  f419b4:	41 57                	push   r15
  f419b6:	41 56                	push   r14
  f419b8:	41 54                	push   r12
  f419ba:	53                   	push   rbx
  f419bb:	50                   	push   rax
  f419bc:	48 89 f3             	mov    rbx,rsi
  f419bf:	49 89 fe             	mov    r14,rdi
  f419c2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  f419c9:	48 85 ff             	test   rdi,rdi
  f419cc:	74 05                	je     f419d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108de9>
  f419ce:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
  f419d3:	48 8d 05 ee 1b 90 00 	lea    rax,[rip+0x901bee]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
  f419da:	49 89 06             	mov    QWORD PTR [r14],rax
  f419dd:	0f 57 c9             	xorps  xmm1,xmm1
  f419e0:	41 0f 29 4e 10       	movaps XMMWORD PTR [r14+0x10],xmm1
  f419e5:	48 8d 05 74 a2 8f 00 	lea    rax,[rip+0x8fa274]        # 183bc60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbf8>
  f419ec:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  f419f0:	66 41 0f 7f 46 20    	movdqa XMMWORD PTR [r14+0x20],xmm0
  f419f6:	48 85 ff             	test   rdi,rdi
  f419f9:	74 05                	je     f41a00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108e16>
  f419fb:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
  f41a00:	4d 8d 7e 08          	lea    r15,[r14+0x8]
  f41a04:	48 8d 05 7d a2 8f 00 	lea    rax,[rip+0x8fa27d]        # 183bc88 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdc20>
  f41a0b:	49 89 06             	mov    QWORD PTR [r14],rax
  f41a0e:	48 8d 05 63 a2 8f 00 	lea    rax,[rip+0x8fa263]        # 183bc78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdc10>
  f41a15:	41 bc f8 01 00 00    	mov    r12d,0x1f8
  f41a1b:	4c 01 e0             	add    rax,r12
  f41a1e:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  f41a22:	e8 5f ca b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f41a27:	48 8d 05 22 a0 8f 00 	lea    rax,[rip+0x8fa022]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
  f41a2e:	49 89 06             	mov    QWORD PTR [r14],rax
  f41a31:	48 8d 05 08 a0 8f 00 	lea    rax,[rip+0x8fa008]        # 183ba40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9d8>
  f41a38:	4c 01 e0             	add    rax,r12
  f41a3b:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  f41a3f:	41 c6 46 30 00       	mov    BYTE PTR [r14+0x30],0x0
  f41a44:	49 83 c6 40          	add    r14,0x40
  f41a48:	4c 89 f7             	mov    rdi,r14
  f41a4b:	48 89 de             	mov    rsi,rbx
  f41a4e:	e8 3d 88 b3 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  f41a53:	48 83 c4 08          	add    rsp,0x8
  f41a57:	5b                   	pop    rbx
  f41a58:	41 5c                	pop    r12
  f41a5a:	41 5e                	pop    r14
  f41a5c:	41 5f                	pop    r15
  f41a5e:	c3                   	ret
  f41a5f:	48 89 c3             	mov    rbx,rax
  f41a62:	4c 89 ff             	mov    rdi,r15
  f41a65:	e8 08 00 00 00       	call   f41a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108e88>
  f41a6a:	48 89 df             	mov    rdi,rbx
  f41a6d:	e8 5e e2 b2 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  f41a72:	53                   	push   rbx
  f41a73:	48 89 fb             	mov    rbx,rdi
  f41a76:	48 8d 05 e3 a1 8f 00 	lea    rax,[rip+0x8fa1e3]        # 183bc60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbf8>
  f41a7d:	48 89 07             	mov    QWORD PTR [rdi],rax
  f41a80:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
  f41a84:	e8 fd c9 b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f41a89:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  f41a8d:	5b                   	pop    rbx
  f41a8e:	e9 1f ca b5 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  f41a93:	cc                   	int3
  f41a94:	53                   	push   rbx
  f41a95:	48 89 fb             	mov    rbx,rdi
  f41a98:	e8 d5 ff ff ff       	call   f41a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108e88>
  f41a9d:	48 89 df             	mov    rdi,rbx
  f41aa0:	5b                   	pop    rbx
  f41aa1:	e9 7a c4 8a 00       	jmp    17edf20 <_ZdlPv@plt>
  f41aa6:	53                   	push   rbx
  f41aa7:	48 89 fb             	mov    rbx,rdi
  f41aaa:	e8 05 00 00 00       	call   f41ab4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108eca>
  f41aaf:	48 89 d8             	mov    rax,rbx
  f41ab2:	5b                   	pop    rbx
  f41ab3:	c3                   	ret
  f41ab4:	55                   	push   rbp
  f41ab5:	41 57                	push   r15
  f41ab7:	41 56                	push   r14
  f41ab9:	41 55                	push   r13
  f41abb:	41 54                	push   r12
  f41abd:	53                   	push   rbx
  f41abe:	48 83 ec 68          	sub    rsp,0x68
  f41ac2:	48 89 fb             	mov    rbx,rdi
  f41ac5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f41acc:	00 00 
  f41ace:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  f41ad3:	48 83 c6 08          	add    rsi,0x8
  f41ad7:	48 89 e7             	mov    rdi,rsp
  f41ada:	e8 7b a3 d4 ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  f41adf:	bf 80 00 00 00       	mov    edi,0x80
  f41ae4:	e8 17 c4 8a 00       	call   17edf00 <_Znwm@plt>
  f41ae9:	49 89 c6             	mov    r14,rax
  f41aec:	0f 57 c0             	xorps  xmm0,xmm0
  f41aef:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  f41af3:	48 8d 05 ae 89 8f 00 	lea    rax,[rip+0x8f89ae]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
  f41afa:	49 89 06             	mov    QWORD PTR [r14],rax
  f41afd:	4d 89 f7             	mov    r15,r14
  f41b00:	49 83 c7 18          	add    r15,0x18
  f41b04:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
  f41b09:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
  f41b0e:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
  f41b14:	4c 8d 6c 24 28       	lea    r13,[rsp+0x28]
  f41b19:	48 89 e5             	mov    rbp,rsp
  f41b1c:	4c 89 ef             	mov    rdi,r13
  f41b1f:	48 89 ee             	mov    rsi,rbp
  f41b22:	4c 89 e2             	mov    rdx,r12
  f41b25:	e8 30 35 fe ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  f41b2a:	4c 89 ff             	mov    rdi,r15
  f41b2d:	4c 89 ee             	mov    rsi,r13
  f41b30:	e8 e5 3f fe ff       	call   f25b1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf30>
  f41b35:	4c 89 ef             	mov    rdi,r13
  f41b38:	e8 d5 37 fe ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  f41b3d:	4c 89 e7             	mov    rdi,r12
  f41b40:	e8 37 a4 ec ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  f41b45:	4c 89 3b             	mov    QWORD PTR [rbx],r15
  f41b48:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
  f41b4c:	31 ff                	xor    edi,edi
  f41b4e:	e8 c9 c8 b5 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  f41b53:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
  f41b57:	e8 2a c9 b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f41b5c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f41b63:	00 00 
  f41b65:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
  f41b6a:	75 0f                	jne    f41b7b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108f91>
  f41b6c:	48 83 c4 68          	add    rsp,0x68
  f41b70:	5b                   	pop    rbx
  f41b71:	41 5c                	pop    r12
  f41b73:	41 5d                	pop    r13
  f41b75:	41 5e                	pop    r14
  f41b77:	41 5f                	pop    r15
  f41b79:	5d                   	pop    rbp
  f41b7a:	c3                   	ret
  f41b7b:	e8 30 df 8a 00       	call   17efab0 <__stack_chk_fail@plt>

## vtable/high-address refs in constructor
  f419d3:	48 8d 05 ee 1b 90 00 	lea    rax,[rip+0x901bee]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
  f419e5:	48 8d 05 74 a2 8f 00 	lea    rax,[rip+0x8fa274]        # 183bc60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbf8>
  f41a04:	48 8d 05 7d a2 8f 00 	lea    rax,[rip+0x8fa27d]        # 183bc88 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdc20>
  f41a0e:	48 8d 05 63 a2 8f 00 	lea    rax,[rip+0x8fa263]        # 183bc78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdc10>
  f41a27:	48 8d 05 22 a0 8f 00 	lea    rax,[rip+0x8fa022]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
  f41a31:	48 8d 05 08 a0 8f 00 	lea    rax,[rip+0x8fa008]        # 183ba40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9d8>
  f41a76:	48 8d 05 e3 a1 8f 00 	lea    rax,[rip+0x8fa1e3]        # 183bc60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbf8>
  f41af3:	48 8d 05 ae 89 8f 00 	lea    rax,[rip+0x8f89ae]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>

## relocations around all referenced 0x18xxxxxx addresses
### around 0x183a4a8
000000000183a488  0000000000000008 R_X86_64_RELATIVE                         f2503e
000000000183a490  0000000000000008 R_X86_64_RELATIVE                         f25048
000000000183a4a8  0000000000000008 R_X86_64_RELATIVE                         f25d12
000000000183a4b0  0000000000000008 R_X86_64_RELATIVE                         f25d22
000000000183a4b8  0000000000000008 R_X86_64_RELATIVE                         f25d34
000000000183a4c8  0000000000000008 R_X86_64_RELATIVE                         a50370
000000000183a4e0  0000000000000008 R_X86_64_RELATIVE                         f282de
000000000183a4e8  0000000000000008 R_X86_64_RELATIVE                         f282ee
000000000183a4f0  0000000000000008 R_X86_64_RELATIVE                         f28300
000000000183a500  0000000000000008 R_X86_64_RELATIVE                         a50370
000000000183a518  0000000000000008 R_X86_64_RELATIVE                         faff70
000000000183a520  0000000000000008 R_X86_64_RELATIVE                         fb0002
000000000183a528  0000000000000008 R_X86_64_RELATIVE                         fb00aa
000000000183a530  0000000000000008 R_X86_64_RELATIVE                         fb0152
000000000183a538  0000000000000008 R_X86_64_RELATIVE                         fb01ea
000000000183a540  0000000000000008 R_X86_64_RELATIVE                         fb0282
000000000183a548  0000000000000008 R_X86_64_RELATIVE                         fb0312
000000000183a550  0000000000000008 R_X86_64_RELATIVE                         fb03a4
000000000183a558  0000000000000008 R_X86_64_RELATIVE                         fb043c
000000000183a560  0000000000000008 R_X86_64_RELATIVE                         fb04e6
000000000183a568  0000000000000008 R_X86_64_RELATIVE                         fb05dc
000000000183a570  0000000000000008 R_X86_64_RELATIVE                         fb0674
000000000183a578  0000000000000008 R_X86_64_RELATIVE                         fb08b0
000000000183a580  0000000000000008 R_X86_64_RELATIVE                         fb0948
000000000183a588  0000000000000008 R_X86_64_RELATIVE                         fb09e0
000000000183a590  0000000000000008 R_X86_64_RELATIVE                         fb0792
000000000183a598  0000000000000008 R_X86_64_RELATIVE                         fb0708
000000000183a5a0  0000000000000008 R_X86_64_RELATIVE                         fb0826
000000000183a5a8  0000000000000008 R_X86_64_RELATIVE                         fb0a84
000000000183a5b0  0000000000000008 R_X86_64_RELATIVE                         fb296a
000000000183a5b8  0000000000000008 R_X86_64_RELATIVE                         fb0c64
000000000183a5c0  0000000000000008 R_X86_64_RELATIVE                         fb0da6
000000000183a5c8  0000000000000008 R_X86_64_RELATIVE                         fb0ece
000000000183a5d0  0000000000000008 R_X86_64_RELATIVE                         fb0fc6
000000000183a5d8  0000000000000008 R_X86_64_RELATIVE                         fb10be
000000000183a5e0  0000000000000008 R_X86_64_RELATIVE                         fb11b6
000000000183a5e8  0000000000000008 R_X86_64_RELATIVE                         fb2a4c
000000000183a5f0  0000000000000008 R_X86_64_RELATIVE                         fb2b60
000000000183a5f8  0000000000000008 R_X86_64_RELATIVE                         fb2b7a
000000000183a600  0000000000000008 R_X86_64_RELATIVE                         fb2c84
000000000183a608  0000000000000008 R_X86_64_RELATIVE                         fb2c9a
000000000183a610  0000000000000008 R_X86_64_RELATIVE                         fb2dae
000000000183a618  0000000000000008 R_X86_64_RELATIVE                         fb12ae
000000000183a620  0000000000000008 R_X86_64_RELATIVE                         fb13c0
000000000183a4c0  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0
000000000183a4f8  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0
### around 0x183ba40
000000000183ba20  0000000000000008 R_X86_64_RELATIVE                         f3bd74
000000000183ba28  0000000000000008 R_X86_64_RELATIVE                         f3bd86
000000000183ba38  0000000000000008 R_X86_64_RELATIVE                         a50370
000000000183ba50  0000000000000008 R_X86_64_RELATIVE                         faff70
000000000183ba58  0000000000000008 R_X86_64_RELATIVE                         fb0002
000000000183ba60  0000000000000008 R_X86_64_RELATIVE                         fb00aa
000000000183ba68  0000000000000008 R_X86_64_RELATIVE                         fb0152
000000000183ba70  0000000000000008 R_X86_64_RELATIVE                         fb01ea
000000000183ba78  0000000000000008 R_X86_64_RELATIVE                         fb0282
000000000183ba80  0000000000000008 R_X86_64_RELATIVE                         fb0312
000000000183ba88  0000000000000008 R_X86_64_RELATIVE                         fb03a4
000000000183ba90  0000000000000008 R_X86_64_RELATIVE                         fb043c
000000000183ba98  0000000000000008 R_X86_64_RELATIVE                         fb04e6
000000000183baa0  0000000000000008 R_X86_64_RELATIVE                         fb05dc
000000000183baa8  0000000000000008 R_X86_64_RELATIVE                         fb0674
000000000183bab0  0000000000000008 R_X86_64_RELATIVE                         fb08b0
000000000183bab8  0000000000000008 R_X86_64_RELATIVE                         fb0948
000000000183bac0  0000000000000008 R_X86_64_RELATIVE                         fb09e0
000000000183bac8  0000000000000008 R_X86_64_RELATIVE                         fb0792
000000000183bad0  0000000000000008 R_X86_64_RELATIVE                         fb0708
000000000183bad8  0000000000000008 R_X86_64_RELATIVE                         fb0826
000000000183bae0  0000000000000008 R_X86_64_RELATIVE                         fb0a84
000000000183bae8  0000000000000008 R_X86_64_RELATIVE                         fb296a
000000000183baf0  0000000000000008 R_X86_64_RELATIVE                         f41b8a
000000000183baf8  0000000000000008 R_X86_64_RELATIVE                         fb0da6
000000000183bb00  0000000000000008 R_X86_64_RELATIVE                         f42176
000000000183bb08  0000000000000008 R_X86_64_RELATIVE                         fb0fc6
000000000183bb10  0000000000000008 R_X86_64_RELATIVE                         fb10be
000000000183bb18  0000000000000008 R_X86_64_RELATIVE                         fb11b6
000000000183bb20  0000000000000008 R_X86_64_RELATIVE                         fb2a4c
000000000183bb28  0000000000000008 R_X86_64_RELATIVE                         fb2b60
000000000183bb30  0000000000000008 R_X86_64_RELATIVE                         fb2b7a
000000000183bb38  0000000000000008 R_X86_64_RELATIVE                         fb2c84
000000000183bb40  0000000000000008 R_X86_64_RELATIVE                         fb2c9a
000000000183bb48  0000000000000008 R_X86_64_RELATIVE                         fb2dae
000000000183bb50  0000000000000008 R_X86_64_RELATIVE                         fb12ae
000000000183bb58  0000000000000008 R_X86_64_RELATIVE                         fb13c0
000000000183bb60  0000000000000008 R_X86_64_RELATIVE                         fb14a6
000000000183bb68  0000000000000008 R_X86_64_RELATIVE                         fb1598
000000000183bb70  0000000000000008 R_X86_64_RELATIVE                         fb16bc
000000000183bb78  0000000000000008 R_X86_64_RELATIVE                         fb17e0
000000000183bb80  0000000000000008 R_X86_64_RELATIVE                         fb1908
000000000183bb88  0000000000000008 R_X86_64_RELATIVE                         fb1a2c
000000000183bb90  0000000000000008 R_X86_64_RELATIVE                         fb1b50
000000000183bb98  0000000000000008 R_X86_64_RELATIVE                         f4266e
000000000183bba0  0000000000000008 R_X86_64_RELATIVE                         fb0d90
000000000183bba8  0000000000000008 R_X86_64_RELATIVE                         fb1fc0
000000000183bbb0  0000000000000008 R_X86_64_RELATIVE                         fb2062
000000000183bbb8  0000000000000008 R_X86_64_RELATIVE                         fb2104
000000000183ba30  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0
### around 0x183ba50
000000000183ba38  0000000000000008 R_X86_64_RELATIVE                         a50370
000000000183ba50  0000000000000008 R_X86_64_RELATIVE                         faff70
000000000183ba58  0000000000000008 R_X86_64_RELATIVE                         fb0002
000000000183ba60  0000000000000008 R_X86_64_RELATIVE                         fb00aa
000000000183ba68  0000000000000008 R_X86_64_RELATIVE                         fb0152
000000000183ba70  0000000000000008 R_X86_64_RELATIVE                         fb01ea
000000000183ba78  0000000000000008 R_X86_64_RELATIVE                         fb0282
000000000183ba80  0000000000000008 R_X86_64_RELATIVE                         fb0312
000000000183ba88  0000000000000008 R_X86_64_RELATIVE                         fb03a4
000000000183ba90  0000000000000008 R_X86_64_RELATIVE                         fb043c
000000000183ba98  0000000000000008 R_X86_64_RELATIVE                         fb04e6
000000000183baa0  0000000000000008 R_X86_64_RELATIVE                         fb05dc
000000000183baa8  0000000000000008 R_X86_64_RELATIVE                         fb0674
000000000183bab0  0000000000000008 R_X86_64_RELATIVE                         fb08b0
000000000183bab8  0000000000000008 R_X86_64_RELATIVE                         fb0948
000000000183bac0  0000000000000008 R_X86_64_RELATIVE                         fb09e0
000000000183bac8  0000000000000008 R_X86_64_RELATIVE                         fb0792
000000000183bad0  0000000000000008 R_X86_64_RELATIVE                         fb0708
000000000183bad8  0000000000000008 R_X86_64_RELATIVE                         fb0826
000000000183bae0  0000000000000008 R_X86_64_RELATIVE                         fb0a84
000000000183bae8  0000000000000008 R_X86_64_RELATIVE                         fb296a
000000000183baf0  0000000000000008 R_X86_64_RELATIVE                         f41b8a
000000000183baf8  0000000000000008 R_X86_64_RELATIVE                         fb0da6
000000000183bb00  0000000000000008 R_X86_64_RELATIVE                         f42176
000000000183bb08  0000000000000008 R_X86_64_RELATIVE                         fb0fc6
000000000183bb10  0000000000000008 R_X86_64_RELATIVE                         fb10be
000000000183bb18  0000000000000008 R_X86_64_RELATIVE                         fb11b6
000000000183bb20  0000000000000008 R_X86_64_RELATIVE                         fb2a4c
000000000183bb28  0000000000000008 R_X86_64_RELATIVE                         fb2b60
000000000183bb30  0000000000000008 R_X86_64_RELATIVE                         fb2b7a
000000000183bb38  0000000000000008 R_X86_64_RELATIVE                         fb2c84
000000000183bb40  0000000000000008 R_X86_64_RELATIVE                         fb2c9a
000000000183bb48  0000000000000008 R_X86_64_RELATIVE                         fb2dae
000000000183bb50  0000000000000008 R_X86_64_RELATIVE                         fb12ae
000000000183bb58  0000000000000008 R_X86_64_RELATIVE                         fb13c0
000000000183bb60  0000000000000008 R_X86_64_RELATIVE                         fb14a6
000000000183bb68  0000000000000008 R_X86_64_RELATIVE                         fb1598
000000000183bb70  0000000000000008 R_X86_64_RELATIVE                         fb16bc
000000000183bb78  0000000000000008 R_X86_64_RELATIVE                         fb17e0
000000000183bb80  0000000000000008 R_X86_64_RELATIVE                         fb1908
000000000183bb88  0000000000000008 R_X86_64_RELATIVE                         fb1a2c
000000000183bb90  0000000000000008 R_X86_64_RELATIVE                         fb1b50
000000000183bb98  0000000000000008 R_X86_64_RELATIVE                         f4266e
000000000183bba0  0000000000000008 R_X86_64_RELATIVE                         fb0d90
000000000183bba8  0000000000000008 R_X86_64_RELATIVE                         fb1fc0
000000000183bbb0  0000000000000008 R_X86_64_RELATIVE                         fb2062
000000000183bbb8  0000000000000008 R_X86_64_RELATIVE                         fb2104
000000000183bbc0  0000000000000008 R_X86_64_RELATIVE                         fb2584
000000000183bbc8  0000000000000008 R_X86_64_RELATIVE                         fb1de8
000000000183ba30  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0
### around 0x183bc60
000000000183bc40  0000000000000008 R_X86_64_RELATIVE                         f43bb6
000000000183bc48  0000000000000008 R_X86_64_RELATIVE                         f41aa6
000000000183bc60  0000000000000008 R_X86_64_RELATIVE                         f41a72
000000000183bc68  0000000000000008 R_X86_64_RELATIVE                         f41a94
000000000183bc70  0000000000000008 R_X86_64_RELATIVE                         f41aa6
000000000183bc88  0000000000000008 R_X86_64_RELATIVE                         faff70
000000000183bc90  0000000000000008 R_X86_64_RELATIVE                         fb0002
000000000183bc98  0000000000000008 R_X86_64_RELATIVE                         fb00aa
000000000183bca0  0000000000000008 R_X86_64_RELATIVE                         fb0152
000000000183bca8  0000000000000008 R_X86_64_RELATIVE                         fb01ea
000000000183bcb0  0000000000000008 R_X86_64_RELATIVE                         fb0282
000000000183bcb8  0000000000000008 R_X86_64_RELATIVE                         fb0312
000000000183bcc0  0000000000000008 R_X86_64_RELATIVE                         fb03a4
000000000183bcc8  0000000000000008 R_X86_64_RELATIVE                         fb043c
000000000183bcd0  0000000000000008 R_X86_64_RELATIVE                         fb04e6
000000000183bcd8  0000000000000008 R_X86_64_RELATIVE                         fb05dc
000000000183bce0  0000000000000008 R_X86_64_RELATIVE                         fb0674
000000000183bce8  0000000000000008 R_X86_64_RELATIVE                         fb08b0
000000000183bcf0  0000000000000008 R_X86_64_RELATIVE                         fb0948
000000000183bcf8  0000000000000008 R_X86_64_RELATIVE                         fb09e0
000000000183bd00  0000000000000008 R_X86_64_RELATIVE                         fb0792
000000000183bd08  0000000000000008 R_X86_64_RELATIVE                         fb0708
000000000183bd10  0000000000000008 R_X86_64_RELATIVE                         fb0826
000000000183bd18  0000000000000008 R_X86_64_RELATIVE                         fb0a84
000000000183bd20  0000000000000008 R_X86_64_RELATIVE                         fb296a
000000000183bd28  0000000000000008 R_X86_64_RELATIVE                         fb0c64
000000000183bd30  0000000000000008 R_X86_64_RELATIVE                         fb0da6
000000000183bd38  0000000000000008 R_X86_64_RELATIVE                         fb0ece
000000000183bd40  0000000000000008 R_X86_64_RELATIVE                         fb0fc6
000000000183bd48  0000000000000008 R_X86_64_RELATIVE                         fb10be
000000000183bd50  0000000000000008 R_X86_64_RELATIVE                         fb11b6
000000000183bd58  0000000000000008 R_X86_64_RELATIVE                         fb2a4c
000000000183bd60  0000000000000008 R_X86_64_RELATIVE                         fb2b60
000000000183bd68  0000000000000008 R_X86_64_RELATIVE                         fb2b7a
000000000183bd70  0000000000000008 R_X86_64_RELATIVE                         fb2c84
000000000183bd78  0000000000000008 R_X86_64_RELATIVE                         fb2c9a
000000000183bd80  0000000000000008 R_X86_64_RELATIVE                         fb2dae
000000000183bd88  0000000000000008 R_X86_64_RELATIVE                         fb12ae
000000000183bd90  0000000000000008 R_X86_64_RELATIVE                         fb13c0
000000000183bd98  0000000000000008 R_X86_64_RELATIVE                         fb14a6
000000000183bda0  0000000000000008 R_X86_64_RELATIVE                         fb1598
000000000183bda8  0000000000000008 R_X86_64_RELATIVE                         fb16bc
000000000183bdb0  0000000000000008 R_X86_64_RELATIVE                         fb17e0
000000000183bdb8  0000000000000008 R_X86_64_RELATIVE                         fb1908
000000000183bdc0  0000000000000008 R_X86_64_RELATIVE                         fb1a2c
000000000183bdc8  0000000000000008 R_X86_64_RELATIVE                         fb1b50
000000000183bdd0  0000000000000008 R_X86_64_RELATIVE                         fb1c5e
000000000183bdd8  0000000000000008 R_X86_64_RELATIVE                         fb0d90
### around 0x183bc78
000000000183bc60  0000000000000008 R_X86_64_RELATIVE                         f41a72
000000000183bc68  0000000000000008 R_X86_64_RELATIVE                         f41a94
000000000183bc70  0000000000000008 R_X86_64_RELATIVE                         f41aa6
000000000183bc88  0000000000000008 R_X86_64_RELATIVE                         faff70
000000000183bc90  0000000000000008 R_X86_64_RELATIVE                         fb0002
000000000183bc98  0000000000000008 R_X86_64_RELATIVE                         fb00aa
000000000183bca0  0000000000000008 R_X86_64_RELATIVE                         fb0152
000000000183bca8  0000000000000008 R_X86_64_RELATIVE                         fb01ea
000000000183bcb0  0000000000000008 R_X86_64_RELATIVE                         fb0282
000000000183bcb8  0000000000000008 R_X86_64_RELATIVE                         fb0312
000000000183bcc0  0000000000000008 R_X86_64_RELATIVE                         fb03a4
000000000183bcc8  0000000000000008 R_X86_64_RELATIVE                         fb043c
000000000183bcd0  0000000000000008 R_X86_64_RELATIVE                         fb04e6
000000000183bcd8  0000000000000008 R_X86_64_RELATIVE                         fb05dc
000000000183bce0  0000000000000008 R_X86_64_RELATIVE                         fb0674
000000000183bce8  0000000000000008 R_X86_64_RELATIVE                         fb08b0
000000000183bcf0  0000000000000008 R_X86_64_RELATIVE                         fb0948
000000000183bcf8  0000000000000008 R_X86_64_RELATIVE                         fb09e0
000000000183bd00  0000000000000008 R_X86_64_RELATIVE                         fb0792
000000000183bd08  0000000000000008 R_X86_64_RELATIVE                         fb0708
000000000183bd10  0000000000000008 R_X86_64_RELATIVE                         fb0826
000000000183bd18  0000000000000008 R_X86_64_RELATIVE                         fb0a84
000000000183bd20  0000000000000008 R_X86_64_RELATIVE                         fb296a
000000000183bd28  0000000000000008 R_X86_64_RELATIVE                         fb0c64
000000000183bd30  0000000000000008 R_X86_64_RELATIVE                         fb0da6
000000000183bd38  0000000000000008 R_X86_64_RELATIVE                         fb0ece
000000000183bd40  0000000000000008 R_X86_64_RELATIVE                         fb0fc6
000000000183bd48  0000000000000008 R_X86_64_RELATIVE                         fb10be
000000000183bd50  0000000000000008 R_X86_64_RELATIVE                         fb11b6
000000000183bd58  0000000000000008 R_X86_64_RELATIVE                         fb2a4c
000000000183bd60  0000000000000008 R_X86_64_RELATIVE                         fb2b60
000000000183bd68  0000000000000008 R_X86_64_RELATIVE                         fb2b7a
000000000183bd70  0000000000000008 R_X86_64_RELATIVE                         fb2c84
000000000183bd78  0000000000000008 R_X86_64_RELATIVE                         fb2c9a
000000000183bd80  0000000000000008 R_X86_64_RELATIVE                         fb2dae
000000000183bd88  0000000000000008 R_X86_64_RELATIVE                         fb12ae
000000000183bd90  0000000000000008 R_X86_64_RELATIVE                         fb13c0
000000000183bd98  0000000000000008 R_X86_64_RELATIVE                         fb14a6
000000000183bda0  0000000000000008 R_X86_64_RELATIVE                         fb1598
000000000183bda8  0000000000000008 R_X86_64_RELATIVE                         fb16bc
000000000183bdb0  0000000000000008 R_X86_64_RELATIVE                         fb17e0
000000000183bdb8  0000000000000008 R_X86_64_RELATIVE                         fb1908
000000000183bdc0  0000000000000008 R_X86_64_RELATIVE                         fb1a2c
000000000183bdc8  0000000000000008 R_X86_64_RELATIVE                         fb1b50
000000000183bdd0  0000000000000008 R_X86_64_RELATIVE                         fb1c5e
000000000183bdd8  0000000000000008 R_X86_64_RELATIVE                         fb0d90
000000000183bde0  0000000000000008 R_X86_64_RELATIVE                         fb1fc0
000000000183bde8  0000000000000008 R_X86_64_RELATIVE                         fb2062
000000000183bdf0  0000000000000008 R_X86_64_RELATIVE                         fb2104
### around 0x183bc88
000000000183bc68  0000000000000008 R_X86_64_RELATIVE                         f41a94
000000000183bc70  0000000000000008 R_X86_64_RELATIVE                         f41aa6
000000000183bc88  0000000000000008 R_X86_64_RELATIVE                         faff70
000000000183bc90  0000000000000008 R_X86_64_RELATIVE                         fb0002
000000000183bc98  0000000000000008 R_X86_64_RELATIVE                         fb00aa
000000000183bca0  0000000000000008 R_X86_64_RELATIVE                         fb0152
000000000183bca8  0000000000000008 R_X86_64_RELATIVE                         fb01ea
000000000183bcb0  0000000000000008 R_X86_64_RELATIVE                         fb0282
000000000183bcb8  0000000000000008 R_X86_64_RELATIVE                         fb0312
000000000183bcc0  0000000000000008 R_X86_64_RELATIVE                         fb03a4
000000000183bcc8  0000000000000008 R_X86_64_RELATIVE                         fb043c
000000000183bcd0  0000000000000008 R_X86_64_RELATIVE                         fb04e6
000000000183bcd8  0000000000000008 R_X86_64_RELATIVE                         fb05dc
000000000183bce0  0000000000000008 R_X86_64_RELATIVE                         fb0674
000000000183bce8  0000000000000008 R_X86_64_RELATIVE                         fb08b0
000000000183bcf0  0000000000000008 R_X86_64_RELATIVE                         fb0948
000000000183bcf8  0000000000000008 R_X86_64_RELATIVE                         fb09e0
000000000183bd00  0000000000000008 R_X86_64_RELATIVE                         fb0792
000000000183bd08  0000000000000008 R_X86_64_RELATIVE                         fb0708
000000000183bd10  0000000000000008 R_X86_64_RELATIVE                         fb0826
000000000183bd18  0000000000000008 R_X86_64_RELATIVE                         fb0a84
000000000183bd20  0000000000000008 R_X86_64_RELATIVE                         fb296a
000000000183bd28  0000000000000008 R_X86_64_RELATIVE                         fb0c64
000000000183bd30  0000000000000008 R_X86_64_RELATIVE                         fb0da6
000000000183bd38  0000000000000008 R_X86_64_RELATIVE                         fb0ece
000000000183bd40  0000000000000008 R_X86_64_RELATIVE                         fb0fc6
000000000183bd48  0000000000000008 R_X86_64_RELATIVE                         fb10be
000000000183bd50  0000000000000008 R_X86_64_RELATIVE                         fb11b6
000000000183bd58  0000000000000008 R_X86_64_RELATIVE                         fb2a4c
000000000183bd60  0000000000000008 R_X86_64_RELATIVE                         fb2b60
000000000183bd68  0000000000000008 R_X86_64_RELATIVE                         fb2b7a
000000000183bd70  0000000000000008 R_X86_64_RELATIVE                         fb2c84
000000000183bd78  0000000000000008 R_X86_64_RELATIVE                         fb2c9a
000000000183bd80  0000000000000008 R_X86_64_RELATIVE                         fb2dae
000000000183bd88  0000000000000008 R_X86_64_RELATIVE                         fb12ae
000000000183bd90  0000000000000008 R_X86_64_RELATIVE                         fb13c0
000000000183bd98  0000000000000008 R_X86_64_RELATIVE                         fb14a6
000000000183bda0  0000000000000008 R_X86_64_RELATIVE                         fb1598
000000000183bda8  0000000000000008 R_X86_64_RELATIVE                         fb16bc
000000000183bdb0  0000000000000008 R_X86_64_RELATIVE                         fb17e0
000000000183bdb8  0000000000000008 R_X86_64_RELATIVE                         fb1908
000000000183bdc0  0000000000000008 R_X86_64_RELATIVE                         fb1a2c
000000000183bdc8  0000000000000008 R_X86_64_RELATIVE                         fb1b50
000000000183bdd0  0000000000000008 R_X86_64_RELATIVE                         fb1c5e
000000000183bdd8  0000000000000008 R_X86_64_RELATIVE                         fb0d90
000000000183bde0  0000000000000008 R_X86_64_RELATIVE                         fb1fc0
000000000183bde8  0000000000000008 R_X86_64_RELATIVE                         fb2062
000000000183bdf0  0000000000000008 R_X86_64_RELATIVE                         fb2104
000000000183bdf8  0000000000000008 R_X86_64_RELATIVE                         fb2584
000000000183be00  0000000000000008 R_X86_64_RELATIVE                         fb1de8
### around 0x18435c8
00000000018435a8  0000000000000008 R_X86_64_RELATIVE                         fe4230
00000000018435b0  0000000000000008 R_X86_64_RELATIVE                         fe4268
00000000018435c8  0000000000000008 R_X86_64_RELATIVE                         faff70
00000000018435d0  0000000000000008 R_X86_64_RELATIVE                         fb0002
00000000018435d8  0000000000000008 R_X86_64_RELATIVE                         fb00aa
00000000018435e0  0000000000000008 R_X86_64_RELATIVE                         fb0152
00000000018435e8  0000000000000008 R_X86_64_RELATIVE                         fb01ea
00000000018435f0  0000000000000008 R_X86_64_RELATIVE                         fb0282
00000000018435f8  0000000000000008 R_X86_64_RELATIVE                         fb0312
0000000001843600  0000000000000008 R_X86_64_RELATIVE                         fb03a4
0000000001843608  0000000000000008 R_X86_64_RELATIVE                         fb043c
0000000001843610  0000000000000008 R_X86_64_RELATIVE                         fb04e6
0000000001843618  0000000000000008 R_X86_64_RELATIVE                         fb05dc
0000000001843620  0000000000000008 R_X86_64_RELATIVE                         fb0674
0000000001843628  0000000000000008 R_X86_64_RELATIVE                         fb08b0
0000000001843630  0000000000000008 R_X86_64_RELATIVE                         fb0948
0000000001843638  0000000000000008 R_X86_64_RELATIVE                         fb09e0
0000000001843640  0000000000000008 R_X86_64_RELATIVE                         fb0792
0000000001843648  0000000000000008 R_X86_64_RELATIVE                         fb0708
0000000001843650  0000000000000008 R_X86_64_RELATIVE                         fb0826
0000000001843658  0000000000000008 R_X86_64_RELATIVE                         fb0a84
0000000001843660  0000000000000008 R_X86_64_RELATIVE                         fb296a
0000000001843668  0000000000000008 R_X86_64_RELATIVE                         fb0c64
0000000001843670  0000000000000008 R_X86_64_RELATIVE                         fb0da6
0000000001843678  0000000000000008 R_X86_64_RELATIVE                         fb0ece
0000000001843680  0000000000000008 R_X86_64_RELATIVE                         fb0fc6
0000000001843688  0000000000000008 R_X86_64_RELATIVE                         fb10be
0000000001843690  0000000000000008 R_X86_64_RELATIVE                         fb11b6
0000000001843698  0000000000000008 R_X86_64_RELATIVE                         fb2a4c
00000000018436a0  0000000000000008 R_X86_64_RELATIVE                         fb2b60
00000000018436a8  0000000000000008 R_X86_64_RELATIVE                         fb2b7a
00000000018436b0  0000000000000008 R_X86_64_RELATIVE                         fb2c84
00000000018436b8  0000000000000008 R_X86_64_RELATIVE                         fb2c9a
00000000018436c0  0000000000000008 R_X86_64_RELATIVE                         fb2dae
00000000018436c8  0000000000000008 R_X86_64_RELATIVE                         fb12ae
00000000018436d0  0000000000000008 R_X86_64_RELATIVE                         fb13c0
00000000018436d8  0000000000000008 R_X86_64_RELATIVE                         fb14a6
00000000018436e0  0000000000000008 R_X86_64_RELATIVE                         fb1598
00000000018436e8  0000000000000008 R_X86_64_RELATIVE                         fb16bc
00000000018436f0  0000000000000008 R_X86_64_RELATIVE                         fb17e0
00000000018436f8  0000000000000008 R_X86_64_RELATIVE                         fb1908
0000000001843700  0000000000000008 R_X86_64_RELATIVE                         fb1a2c
0000000001843708  0000000000000008 R_X86_64_RELATIVE                         fb1b50
0000000001843710  0000000000000008 R_X86_64_RELATIVE                         fb1c5e
0000000001843718  0000000000000008 R_X86_64_RELATIVE                         fb0d90
0000000001843720  0000000000000008 R_X86_64_RELATIVE                         fb1fc0
0000000001843728  0000000000000008 R_X86_64_RELATIVE                         fb2062
0000000001843730  0000000000000008 R_X86_64_RELATIVE                         fb2104
0000000001843738  0000000000000008 R_X86_64_RELATIVE                         fb2584
0000000001843740  0000000000000008 R_X86_64_RELATIVE                         fb1de8
