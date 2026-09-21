# Readiness subobject constructor raw

Callsite: rdi = readiness-object base+0x20; call 0xf419b4.


/tmp/subraw/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000f419b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108dca>:
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
  f41b80:	eb 00                	jmp    f41b82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108f98>
  f41b82:	48 89 c7             	mov    rdi,rax
  f41b85:	e8 1b 7f b3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  f41b8a:	55                   	push   rbp
  f41b8b:	41 57                	push   r15
  f41b8d:	41 56                	push   r14
  f41b8f:	41 55                	push   r13
  f41b91:	41 54                	push   r12
  f41b93:	53                   	push   rbx
  f41b94:	48 81 ec 78 20 00 00 	sub    rsp,0x2078
  f41b9b:	4d 89 c7             	mov    r15,r8
  f41b9e:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
  f41ba3:	49 89 d4             	mov    r12,rdx
  f41ba6:	49 89 f5             	mov    r13,rsi
  f41ba9:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
  f41bae:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  f41bb5:	00 00 
  f41bb7:	48 89 84 24 70 20 00 	mov    QWORD PTR [rsp+0x2070],rax
  f41bbe:	00 
  f41bbf:	44 0f b6 b2 00 0c 00 	movzx  r14d,BYTE PTR [rdx+0xc00]
  f41bc6:	00 
  f41bc7:	48 8b 82 48 0c 00 00 	mov    rax,QWORD PTR [rdx+0xc48]
  f41bce:	48 8b aa 50 0c 00 00 	mov    rbp,QWORD PTR [rdx+0xc50]
  f41bd5:	48 85 ed             	test   rbp,rbp
  f41bd8:	74 05                	je     f41bdf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108ff5>
  f41bda:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
  f41bdf:	48 85 c0             	test   rax,rax
  f41be2:	74 2b                	je     f41c0f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x109025>
  f41be4:	48 8b 18             	mov    rbx,QWORD PTR [rax]
  f41be7:	48 8d 35 bc 50 42 ff 	lea    rsi,[rip+0xffffffffff4250bc]        # 366caa <_ZTSSt12bad_any_cast@@Base-0x2951e>
  f41bee:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  f41bf3:	e8 86 7e b3 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  f41bf8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  f41bfb:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
  f41c00:	48 89 df             	mov    rdi,rbx
  f41c03:	ff 10                	call   QWORD PTR [rax]
  f41c05:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  f41c0a:	e8 81 c2 8a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  f41c0f:	43 8d 1c 76          	lea    ebx,[r14+r14*2]
  f41c13:	ff c3                	inc    ebx
  f41c15:	48 89 ef             	mov    rdi,rbp
  f41c18:	e8 69 c8 b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  f41c1d:	48 8d ac 24 88 00 00 	lea    rbp,[rsp+0x88]
  f41c24:	00 
  f41c25:	48 89 ef             	mov    rdi,rbp
  f41c28:	4c 89 e6             	mov    rsi,r12
  f41c2b:	e8 7c e6 78 00       	call   16d02ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84418>
  f41c30:	49 8b 75 60          	mov    rsi,QWORD PTR [r13+0x60]
  f41c34:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  f41c39:	48 89 ea             	mov    rdx,rbp
  f41c3c:	89 d9                	mov    ecx,ebx
  f41c3e:	45                   	rex.RB
  f41c3f:	31                   	.byte 0x31
