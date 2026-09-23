# Restrictions fd381a state bridge v9

Focus: the remaining erased-interface bridge between the Restrictions-derived objects and `fd381a state+0x40 / virtual +0x140`. Static provenance only.

## `e99d07` window `0xe99d07`

```text
  e99c5e:	48 89 fb             	mov    rbx,rdi
  e99c61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99c68:	00 00
  e99c6a:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99c71:	00
  e99c72:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e99c77:	4c 89 f7             	mov    rdi,r14
  e99c7a:	48 89 de             	mov    rsi,rbx
  e99c7d:	e8 ae 16 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e99c82:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e99c85:	48 85 f6             	test   rsi,rsi
  e99c88:	74 28                	je     e99cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x610c8>
  e99c8a:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99c8e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99c91:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99c96:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99c99:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99c9c:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
  e99ca1:	48 89 df             	mov    rdi,rbx
  e99ca4:	4c 89 f6             	mov    rsi,r14
  e99ca7:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e99caa:	4c 89 f7             	mov    rdi,r14
  e99cad:	e8 ac db 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99cb2:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99cb7:	e8 ca 47 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99cbc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99cc3:	00 00
  e99cc5:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99ccc:	00
  e99ccd:	75 33                	jne    e99d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61118>
  e99ccf:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e99cd6:	5b                   	pop    rbx
  e99cd7:	41 5e                	pop    r14
  e99cd9:	c3                   	ret
  e99cda:	48 89 c3             	mov    rbx,rax
  e99cdd:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99ce2:	e8 9f 47 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99ce7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99cee:	00 00
  e99cf0:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99cf7:	00
  e99cf8:	75 08                	jne    e99d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61118>
  e99cfa:	48 89 df             	mov    rdi,rbx
  e99cfd:	e8 ce 5f bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99d02:	e8 a9 5d 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99d07:	55                   	push   rbp
  e99d08:	41 57                	push   r15
  e99d0a:	41 56                	push   r14
  e99d0c:	41 55                	push   r13
  e99d0e:	41 54                	push   r12
  e99d10:	53                   	push   rbx
  e99d11:	48 81 ec 08 12 00 00 	sub    rsp,0x1208
  e99d18:	4c 89 cb             	mov    rbx,r9
  e99d1b:	4d 89 c6             	mov    r14,r8
  e99d1e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99d25:	00 00
  e99d27:	48 89 84 24 00 12 00 	mov    QWORD PTR [rsp+0x1200],rax
  e99d2e:	00
  e99d2f:	48 b8 00 00 00 00 00 	movabs rax,0x1000000000000
  e99d36:	00 01 00
  e99d39:	4c 8d 84 24 f0 06 00 	lea    r8,[rsp+0x6f0]
  e99d40:	00
  e99d41:	49 89 40 e0          	mov    QWORD PTR [r8-0x20],rax
  e99d45:	66 41 83 60 e8 00    	and    WORD PTR [r8-0x18],0x0
  e99d4b:	48 89 8c 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rcx
  e99d52:	00
  e99d53:	41 83 60 ec 00       	and    DWORD PTR [r8-0x14],0x0
  e99d58:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
  e99d5d:	41 83 60 ef 00       	and    DWORD PTR [r8-0x11],0x0
  e99d62:	49 89 f4             	mov    r12,rsi
  e99d65:	41 c7 40 f4 00 01 00 	mov    DWORD PTR [r8-0xc],0x100
  e99d6c:	00
  e99d6d:	48 8d 05 4c 40 96 00 	lea    rax,[rip+0x96404c]        # 17fddc0 <_ZTINSt6__ndk117bad_function_callE@@Base+0xe60>
  e99d74:	49 89 00             	mov    QWORD PTR [r8],rax
  e99d77:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
  e99d7b:	49 83 60 30 00       	and    QWORD PTR [r8+0x30],0x0
  e99d80:	49 89 ff             	mov    r15,rdi
  e99d83:	41 83 60 37 00       	and    DWORD PTR [r8+0x37],0x0
  e99d88:	48 8b b4 24 68 13 00 	mov    rsi,QWORD PTR [rsp+0x1368]
  e99d8f:	00
  e99d90:	49 c7 40 40 96 00 00 	mov    QWORD PTR [r8+0x40],0x96
  e99d97:	00
  e99d98:	41 c6 40 48 01       	mov    BYTE PTR [r8+0x48],0x1
  e99d9d:	48 b8 00 00 00 00 0a 	movabs rax,0xa00000000
  e99da4:	00 00 00
  e99da7:	49 89 40 58          	mov    QWORD PTR [r8+0x58],rax
  e99dab:	41 83 60 50 00       	and    DWORD PTR [r8+0x50],0x0
  e99db0:	31 c0                	xor    eax,eax
  e99db2:	41 88 40 54          	mov    BYTE PTR [r8+0x54],al
  e99db6:	41 88 40 60          	mov    BYTE PTR [r8+0x60],al
  e99dba:	49 c7 40 68 50 00 00 	mov    QWORD PTR [r8+0x68],0x50
  e99dc1:	00
  e99dc2:	49 83 60 70 00       	and    QWORD PTR [r8+0x70],0x0
  e99dc7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99dca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99dd1:	00
  e99dd2:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e99dd5:	4c 89 a4 24 10 01 00 	mov    QWORD PTR [rsp+0x110],r12
  e99ddc:	00
  e99ddd:	6a 38                	push   0x38
  e99ddf:	5f                   	pop    rdi
  e99de0:	e8 1b 41 95 00       	call   17edf00 <_Znwm@plt>
  e99de5:	4c 8b a4 24 58 12 00 	mov    r12,QWORD PTR [rsp+0x1258]
  e99dec:	00
  e99ded:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
  e99df4:	00
  e99df5:	66 0f ef c9          	pxor   xmm1,xmm1
  e99df9:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
  e99dfe:	48 8d 0d 7b 72 96 00 	lea    rcx,[rip+0x96727b]        # 1801080 <_ZTIN4asio22service_already_existsE@@Base+0x2868>
  e99e05:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99e08:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
  e99e0f:	00
  e99e10:	66 0f 7f 8c 24 70 07 	movdqa XMMWORD PTR [rsp+0x770],xmm1
  e99e17:	00 00
  e99e19:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
  e99e1d:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
  e99e21:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  e99e26:	48 89 58 30          	mov    QWORD PTR [rax+0x30],rbx
  e99e2a:	31 ff                	xor    edi,edi
  e99e2c:	e8 55 46 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99e31:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
  e99e38:	00
  e99e39:	e8 48 46 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99e3e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e99e42:	48 8d 35 ee 9e 53 ff 	lea    rsi,[rip+0xffffffffff539eee]        # 3d3d37 <_ZTSN5boost17bad_function_callE@@Base+0x107d>
  e99e49:	48 8d 0d 00 9f 53 ff 	lea    rcx,[rip+0xffffffffff539f00]        # 3d3d50 <_ZTSN5boost17bad_function_callE@@Base+0x1096>
  e99e50:	6a 0b                	push   0xb
  e99e52:	5a                   	pop    rdx
  e99e53:	6a 40                	push   0x40
  e99e55:	41 58                	pop    r8
  e99e57:	45 31 c9             	xor    r9d,r9d
  e99e5a:	e8 2b d5 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e99e5f:	88 44 24 24          	mov    BYTE PTR [rsp+0x24],al
  e99e63:	f3 41 0f 6f 04 24    	movdqu xmm0,XMMWORD PTR [r12]
  e99e69:	66 0f 7f 84 24 00 01 	movdqa XMMWORD PTR [rsp+0x100],xmm0
  e99e70:	00 00
  e99e72:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
  e99e77:	48 85 c0             	test   rax,rax
  e99e7a:	74 05                	je     e99e81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61297>
  e99e7c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e99e81:	66 0f ef c0          	pxor   xmm0,xmm0
  e99e85:	66 0f 7f 84 24 70 01 	movdqa XMMWORD PTR [rsp+0x170],xmm0
  e99e8c:	00 00
  e99e8e:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
  e99e95:	00 00
  e99e97:	48 83 bc 24 40 12 00 	cmp    QWORD PTR [rsp+0x1240],0x0
  e99e9e:	00 00
  e99ea0:	74 73                	je     e99f15 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6132b>
  e99ea2:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e99ea6:	48 8d 15 5f 93 53 ff 	lea    rdx,[rip+0xffffffffff53935f]        # 3d320c <_ZTSN5boost17bad_function_callE@@Base+0x552>
  e99ead:	4c 8d 05 6c 93 53 ff 	lea    r8,[rip+0xffffffffff53936c]        # 3d3220 <_ZTSN5boost17bad_function_callE@@Base+0x566>
  e99eb4:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e99ebb:	00
  e99ebc:	6a 0b                	push   0xb
  e99ebe:	59                   	pop    rcx
  e99ebf:	6a 11                	push   0x11
  e99ec1:	41 59                	pop    r9
  e99ec3:	48 89 df             	mov    rdi,rbx
  e99ec6:	e8 fd d5 74 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  e99ecb:	40 b5 01             	mov    bpl,0x1
  e99ece:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
  e99ed2:	74 32                	je     e99f06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6131c>
  e99ed4:	48 8d 35 60 93 53 ff 	lea    rsi,[rip+0xffffffffff539360]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
  e99edb:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99ee2:	00
  e99ee3:	e8 67 19 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e99ee8:	84 c0                	test   al,al
  e99eea:	75 1a                	jne    e99f06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6131c>
  e99eec:	48 8d 35 3f 93 53 ff 	lea    rsi,[rip+0xffffffffff53933f]        # 3d3232 <_ZTSN5boost17bad_function_callE@@Base+0x578>
  e99ef3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99efa:	00
  e99efb:	e8 4f 19 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e99f00:	89 c5                	mov    ebp,eax
  e99f02:	40 80 f5 01          	xor    bpl,0x1
  e99f06:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99f0d:	00
  e99f0e:	e8 1d ce c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e99f13:	eb 02                	jmp    e99f17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6132d>
  e99f15:	31 ed                	xor    ebp,ebp
  e99f17:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e99f1b:	48 8d 15 5f 9b 53 ff 	lea    rdx,[rip+0xffffffffff539b5f]        # 3d3a81 <_ZTSN5boost17bad_function_callE@@Base+0xdc7>
  e99f22:	4c 8d 05 67 9b 53 ff 	lea    r8,[rip+0xffffffffff539b67]        # 3d3a90 <_ZTSN5boost17bad_function_callE@@Base+0xdd6>
  e99f29:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e99f30:	00
  e99f31:	6a 0b                	push   0xb
  e99f33:	59                   	pop    rcx
  e99f34:	6a 27                	push   0x27
  e99f36:	41 59                	pop    r9
  e99f38:	48 89 df             	mov    rdi,rbx
  e99f3b:	e8 88 d5 74 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  e99f40:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
  e99f44:	74 18                	je     e99f5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61374>
  e99f46:	48 8d 35 ee 92 53 ff 	lea    rsi,[rip+0xffffffffff5392ee]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
  e99f4d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99f54:	00
  e99f55:	e8 f5 18 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e99f5a:	89 c3                	mov    ebx,eax
  e99f5c:	eb 02                	jmp    e99f60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61376>
  e99f5e:	31 db                	xor    ebx,ebx
  e99f60:	4c 89 bc 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r15
  e99f67:	00
  e99f68:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99f6f:	00
  e99f70:	e8 bb cd c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e99f75:	88 9c 24 29 07 00 00 	mov    BYTE PTR [rsp+0x729],bl
  e99f7c:	89 ac 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],ebp
  e99f83:	89 e8                	mov    eax,ebp
  e99f85:	34 01                	xor    al,0x1
  e99f87:	88 84 24 e7 06 00 00 	mov    BYTE PTR [rsp+0x6e7],al
  e99f8e:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
  e99f95:	00
  e99f96:	48 8b 18             	mov    rbx,QWORD PTR [rax]
  e99f99:	bf 60 01 00 00       	mov    edi,0x160
  e99f9e:	e8 5d 3f 95 00       	call   17edf00 <_Znwm@plt>
  e99fa3:	49 89 c5             	mov    r13,rax
  e99fa6:	66 0f ef c0          	pxor   xmm0,xmm0
  e99faa:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e99faf:	48 8d 05 12 0e 97 00 	lea    rax,[rip+0x970e12]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
  e99fb6:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  e99fba:	48 8d 05 8f 96 97 00 	lea    rax,[rip+0x97968f]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>
  e99fc1:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e99fc8:	00
  e99fc9:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99fcc:	48 8d 05 37 68 02 00 	lea    rax,[rip+0x26837]        # ec080a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87c20>
  e99fd3:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e99fd7:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
  e99fdb:	48 8d 05 1e 74 99 00 	lea    rax,[rip+0x99741e]        # 1831400 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3398>
  e99fe2:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
  e99fe6:	4c 8d a4 24 00 0d 00 	lea    r12,[rsp+0xd00]
  e99fed:	00
  e99fee:	4c 89 e7             	mov    rdi,r12
  e99ff1:	e8 20 b6 00 00       	call   ea5616 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ca2c>
  e99ff6:	66 41 c7 45 30 4c 00 	mov    WORD PTR [r13+0x30],0x4c
  e99ffd:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e9a002:	49 89 45 38          	mov    QWORD PTR [r13+0x38],rax
```
## `fd4c04` window `0xfd4c04`

```text
  fd4b6a:	4c 89 fe             	mov    rsi,r15
  fd4b6d:	e8 8e 01 00 00       	call   fd4d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c116>
  fd4b72:	48 89 df             	mov    rdi,rbx
  fd4b75:	4c 89 e6             	mov    rsi,r12
  fd4b78:	e8 3d 0f f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  fd4b7d:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  fd4b82:	e8 ff 98 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4b87:	4c 89 ff             	mov    rdi,r15
  fd4b8a:	e8 83 07 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd4b8f:	4c 89 f7             	mov    rdi,r14
  fd4b92:	e8 7b 07 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd4b97:	48 89 e7             	mov    rdi,rsp
  fd4b9a:	e8 dd 73 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd4b9f:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fd4ba4:	e8 dd 98 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4ba9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4bb0:	00 00
  fd4bb2:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
  fd4bb9:	00
  fd4bba:	75 14                	jne    fd4bd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bfe6>
  fd4bbc:	48 89 d8             	mov    rax,rbx
  fd4bbf:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
  fd4bc6:	5b                   	pop    rbx
  fd4bc7:	41 5c                	pop    r12
  fd4bc9:	41 5d                	pop    r13
  fd4bcb:	41 5e                	pop    r14
  fd4bcd:	41 5f                	pop    r15
  fd4bcf:	c3                   	ret
  fd4bd0:	e8 db ae 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd4bd5:	48 89 c7             	mov    rdi,rax
  fd4bd8:	e8 c8 4e aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4bdd:	cc                   	int3
  fd4bde:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd4be2:	e9 ff fb ff ff       	jmp    fd47e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbfc>
  fd4be7:	cc                   	int3
  fd4be8:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd4bec:	e9 37 fc ff ff       	jmp    fd4828 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bc3e>
  fd4bf1:	cc                   	int3
  fd4bf2:	53                   	push   rbx
  fd4bf3:	48 89 fb             	mov    rbx,rdi
  fd4bf6:	48 83 c6 f8          	add    rsi,0xfffffffffffffff8
  fd4bfa:	e8 93 fe ff ff       	call   fd4a92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bea8>
  fd4bff:	48 89 d8             	mov    rax,rbx
  fd4c02:	5b                   	pop    rbx
  fd4c03:	c3                   	ret
  fd4c04:	41 56                	push   r14
  fd4c06:	53                   	push   rbx
  fd4c07:	50                   	push   rax
  fd4c08:	48 89 fb             	mov    rbx,rdi
  fd4c0b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fd4c0e:	48 85 c0             	test   rax,rax
  fd4c11:	74 21                	je     fd4c34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c04a>
  fd4c13:	84 d2                	test   dl,dl
  fd4c15:	74 1d                	je     fd4c34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c04a>
  fd4c17:	48 89 03             	mov    QWORD PTR [rbx],rax
  fd4c1a:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
  fd4c1e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  fd4c22:	48 85 c0             	test   rax,rax
  fd4c25:	74 05                	je     fd4c2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c042>
  fd4c27:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  fd4c2c:	48 83 c4 08          	add    rsp,0x8
  fd4c30:	5b                   	pop    rbx
  fd4c31:	41 5e                	pop    r14
  fd4c33:	c3                   	ret
  fd4c34:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
  fd4c38:	bf 88 00 00 00       	mov    edi,0x88
  fd4c3d:	e8 be 92 81 00       	call   17edf00 <_Znwm@plt>
  fd4c42:	48 89 c2             	mov    rdx,rax
  fd4c45:	0f 57 c0             	xorps  xmm0,xmm0
  fd4c48:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  fd4c4c:	48 8d 0d 6d 5b 86 00 	lea    rcx,[rip+0x865b6d]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  fd4c53:	48 89 08             	mov    QWORD PTR [rax],rcx
  fd4c56:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
  fd4c5a:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
  fd4c5e:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
  fd4c62:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
  fd4c66:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
  fd4c6a:	48 85 c9             	test   rcx,rcx
  fd4c6d:	74 05                	je     fd4c74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c08a>
  fd4c6f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4c74:	48 8d 0d 45 d3 86 00 	lea    rcx,[rip+0x86d345]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
  fd4c7b:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
  fd4c7f:	48 8d 0d 2a d5 86 00 	lea    rcx,[rip+0x86d52a]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
  fd4c86:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
  fd4c8a:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
  fd4c8e:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
  fd4c92:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
  fd4c96:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
  fd4c9a:	48 85 c9             	test   rcx,rcx
  fd4c9d:	74 05                	je     fd4ca4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c0ba>
  fd4c9f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4ca4:	48 83 c0 18          	add    rax,0x18
  fd4ca8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
  fd4cac:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx
  fd4cb0:	49 8b 4e 48          	mov    rcx,QWORD PTR [r14+0x48]
  fd4cb4:	48 89 4a 60          	mov    QWORD PTR [rdx+0x60],rcx
  fd4cb8:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
  fd4cbc:	48 89 4a 68          	mov    QWORD PTR [rdx+0x68],rcx
  fd4cc0:	48 85 c9             	test   rcx,rcx
  fd4cc3:	74 05                	je     fd4cca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c0e0>
  fd4cc5:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4cca:	49 8b 4e 68          	mov    rcx,QWORD PTR [r14+0x68]
  fd4cce:	48 89 8a 80 00 00 00 	mov    QWORD PTR [rdx+0x80],rcx
  fd4cd5:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]
  fd4cda:	0f 11 42 70          	movups XMMWORD PTR [rdx+0x70],xmm0
  fd4cde:	48 89 df             	mov    rdi,rbx
  fd4ce1:	48 89 c6             	mov    rsi,rax
  fd4ce4:	e8 1b 9b f2 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  fd4ce9:	31 ff                	xor    edi,edi
  fd4ceb:	48 83 c4 08          	add    rsp,0x8
  fd4cef:	5b                   	pop    rbx
  fd4cf0:	41 5e                	pop    r14
  fd4cf2:	e9 25 97 ac ff       	jmp    a9e41c <JNI_OnUnload@@Base+0x25ce9>
  fd4cf7:	48 89 c7             	mov    rdi,rax
  fd4cfa:	e8 a6 4d aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4cff:	cc                   	int3
  fd4d00:	41 57                	push   r15
  fd4d02:	41 56                	push   r14
  fd4d04:	41 55                	push   r13
  fd4d06:	41 54                	push   r12
  fd4d08:	53                   	push   rbx
  fd4d09:	48 83 ec 40          	sub    rsp,0x40
  fd4d0d:	49 89 f7             	mov    r15,rsi
  fd4d10:	48 89 fb             	mov    rbx,rdi
  fd4d13:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4d1a:	00 00
  fd4d1c:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  fd4d21:	bf 80 00 00 00       	mov    edi,0x80
  fd4d26:	e8 d5 91 81 00       	call   17edf00 <_Znwm@plt>
  fd4d2b:	49 89 c6             	mov    r14,rax
  fd4d2e:	0f 57 c0             	xorps  xmm0,xmm0
  fd4d31:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  fd4d35:	48 8d 05 6c 57 86 00 	lea    rax,[rip+0x86576c]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
  fd4d3c:	49 89 06             	mov    QWORD PTR [r14],rax
  fd4d3f:	4d 89 f4             	mov    r12,r14
  fd4d42:	49 83 c4 18          	add    r12,0x18
  fd4d46:	49 89 e5             	mov    r13,rsp
  fd4d49:	4c 89 ef             	mov    rdi,r13
  fd4d4c:	4c 89 fe             	mov    rsi,r15
  fd4d4f:	e8 30 0e f5 ff       	call   f25b84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf9a>
  fd4d54:	4c 89 e7             	mov    rdi,r12
  fd4d57:	4c 89 ee             	mov    rsi,r13
  fd4d5a:	e8 bb 0d f5 ff       	call   f25b1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf30>
  fd4d5f:	4c 89 ef             	mov    rdi,r13
  fd4d62:	e8 ab 05 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd4d67:	4c 89 23             	mov    QWORD PTR [rbx],r12
  fd4d6a:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
  fd4d6e:	31 ff                	xor    edi,edi
  fd4d70:	e8 a7 96 ac ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  fd4d75:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4d7c:	00 00
  fd4d7e:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
  fd4d83:	75 0e                	jne    fd4d93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1a9>
  fd4d85:	48 83 c4 40          	add    rsp,0x40
  fd4d89:	5b                   	pop    rbx
  fd4d8a:	41 5c                	pop    r12
  fd4d8c:	41 5d                	pop    r13
  fd4d8e:	41 5e                	pop    r14
  fd4d90:	41 5f                	pop    r15
  fd4d92:	c3                   	ret
  fd4d93:	e8 18 ad 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd4d98:	48 89 c7             	mov    rdi,rax
  fd4d9b:	e8 05 4d aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4da0:	53                   	push   rbx
  fd4da1:	48 89 fb             	mov    rbx,rdi
  fd4da4:	48 8d 05 2d d4 86 00 	lea    rax,[rip+0x86d42d]        # 18421d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14170>
  fd4dab:	48 89 07             	mov    QWORD PTR [rdi],rax
  fd4dae:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
  fd4db2:	e8 cf 96 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4db7:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  fd4dbb:	5b                   	pop    rbx
  fd4dbc:	e9 f1 96 ac ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd4dc1:	cc                   	int3
  fd4dc2:	53                   	push   rbx
  fd4dc3:	48 89 fb             	mov    rbx,rdi
  fd4dc6:	e8 d5 ff ff ff       	call   fd4da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1b6>
  fd4dcb:	48 89 df             	mov    rdi,rbx
  fd4dce:	5b                   	pop    rbx
  fd4dcf:	e9 4c 91 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd4dd4:	53                   	push   rbx
  fd4dd5:	48 89 fb             	mov    rbx,rdi
  fd4dd8:	e8 05 00 00 00       	call   fd4de2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1f8>
  fd4ddd:	48 89 d8             	mov    rax,rbx
  fd4de0:	5b                   	pop    rbx
  fd4de1:	c3                   	ret
  fd4de2:	55                   	push   rbp
  fd4de3:	41 57                	push   r15
  fd4de5:	41 56                	push   r14
  fd4de7:	41 55                	push   r13
  fd4de9:	41 54                	push   r12
  fd4deb:	53                   	push   rbx
  fd4dec:	48 83 ec 68          	sub    rsp,0x68
  fd4df0:	48 89 fb             	mov    rbx,rdi
  fd4df3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4dfa:	00 00
  fd4dfc:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  fd4e01:	48 83 c6 08          	add    rsi,0x8
  fd4e05:	48 89 e7             	mov    rdi,rsp
  fd4e08:	e8 4d 70 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd4e0d:	bf 80 00 00 00       	mov    edi,0x80
  fd4e12:	e8 e9 90 81 00       	call   17edf00 <_Znwm@plt>
  fd4e17:	49 89 c6             	mov    r14,rax
  fd4e1a:	0f 57 c0             	xorps  xmm0,xmm0
  fd4e1d:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  fd4e21:	48 8d 05 80 56 86 00 	lea    rax,[rip+0x865680]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
  fd4e28:	49 89 06             	mov    QWORD PTR [r14],rax
  fd4e2b:	4d 89 f7             	mov    r15,r14
  fd4e2e:	49 83 c7 18          	add    r15,0x18
  fd4e32:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
  fd4e37:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
  fd4e3c:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
  fd4e42:	4c 8d 6c 24 28       	lea    r13,[rsp+0x28]
  fd4e47:	48 89 e5             	mov    rbp,rsp
  fd4e4a:	4c 89 ef             	mov    rdi,r13
  fd4e4d:	48 89 ee             	mov    rsi,rbp
  fd4e50:	4c 89 e2             	mov    rdx,r12
  fd4e53:	e8 02 02 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  fd4e58:	4c 89 ff             	mov    rdi,r15
  fd4e5b:	4c 89 ee             	mov    rsi,r13
  fd4e5e:	e8 b7 0c f5 ff       	call   f25b1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf30>
  fd4e63:	4c 89 ef             	mov    rdi,r13
  fd4e66:	e8 a7 04 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd4e6b:	4c 89 e7             	mov    rdi,r12
  fd4e6e:	e8 09 71 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd4e73:	4c 89 3b             	mov    QWORD PTR [rbx],r15
  fd4e76:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
  fd4e7a:	31 ff                	xor    edi,edi
  fd4e7c:	e8 9b 95 ac ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  fd4e81:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
  fd4e85:	e8 fc 95 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4e8a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4e91:	00 00
  fd4e93:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
  fd4e98:	75 0f                	jne    fd4ea9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c2bf>
  fd4e9a:	48 83 c4 68          	add    rsp,0x68
```
## `fd381a` window `0xfd381a`

```text
  fd377b:	e8 06 ad ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3780:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  fd3785:	e8 fc ac ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd378a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3791:	00 00
  fd3793:	48 3b 84 24 c0 0c 00 	cmp    rax,QWORD PTR [rsp+0xcc0]
  fd379a:	00
  fd379b:	75 12                	jne    fd37af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19abc5>
  fd379d:	48 81 c4 c8 0c 00 00 	add    rsp,0xcc8
  fd37a4:	5b                   	pop    rbx
  fd37a5:	41 5c                	pop    r12
  fd37a7:	41 5d                	pop    r13
  fd37a9:	41 5e                	pop    r14
  fd37ab:	41 5f                	pop    r15
  fd37ad:	5d                   	pop    rbp
  fd37ae:	c3                   	ret
  fd37af:	e8 fc c2 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd37b4:	48 89 c7             	mov    rdi,rax
  fd37b7:	e8 e9 62 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd37bc:	48 89 c3             	mov    rbx,rax
  fd37bf:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  fd37c4:	e8 01 3b 69 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
  fd37c9:	eb 03                	jmp    fd37ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19abe4>
  fd37cb:	48 89 c3             	mov    rbx,rax
  fd37ce:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  fd37d3:	e8 58 35 ad ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  fd37d8:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  fd37dd:	e8 a4 ac ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd37e2:	48 89 df             	mov    rdi,rbx
  fd37e5:	e8 bb 62 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd37ea:	48 83 c7 08          	add    rdi,0x8
  fd37ee:	e9 f9 fb ff ff       	jmp    fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd37f3:	cc                   	int3
  fd37f4:	53                   	push   rbx
  fd37f5:	48 89 fb             	mov    rbx,rdi
  fd37f8:	48 83 c7 08          	add    rdi,0x8
  fd37fc:	e8 eb fb ff ff       	call   fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd3801:	48 89 df             	mov    rdi,rbx
  fd3804:	5b                   	pop    rbx
  fd3805:	e9 16 a7 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd380a:	e9 dd fb ff ff       	jmp    fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd380f:	cc                   	int3
  fd3810:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd3814:	e9 db ff ff ff       	jmp    fd37f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac0a>
  fd3819:	cc                   	int3
  fd381a:	41 56                	push   r14
  fd381c:	53                   	push   rbx
  fd381d:	48 83 ec 28          	sub    rsp,0x28
  fd3821:	49 89 f6             	mov    r14,rsi
  fd3824:	48 89 fb             	mov    rbx,rdi
  fd3827:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd382e:	00 00
  fd3830:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  fd3835:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
  fd3839:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fd383c:	ff 50 70             	call   QWORD PTR [rax+0x70]
  fd383f:	41 80 7e 68 00       	cmp    BYTE PTR [r14+0x68],0x0
  fd3844:	74 3c                	je     fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
  fd3846:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  fd384a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd384d:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  fd3853:	85 c0                	test   eax,eax
  fd3855:	75 2b                	jne    fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
  fd3857:	48 8d 35 2c 38 37 ff 	lea    rsi,[rip+0xffffffffff37382c]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  fd385e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd3863:	6a 07                	push   0x7
  fd3865:	5a                   	pop    rdx
  fd3866:	e8 af 91 ac ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
  fd386b:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  fd3870:	48 89 df             	mov    rdi,rbx
  fd3873:	e8 b4 01 d5 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  fd3878:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd387d:	e8 0e a6 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fd3882:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3889:	00 00
  fd388b:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fd3890:	75 3f                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
  fd3892:	48 89 d8             	mov    rax,rbx
  fd3895:	48 83 c4 28          	add    rsp,0x28
  fd3899:	5b                   	pop    rbx
  fd389a:	41 5e                	pop    r14
  fd389c:	c3                   	ret
  fd389d:	49 89 c6             	mov    r14,rax
  fd38a0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd38a5:	e8 e6 a5 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fd38aa:	eb 05                	jmp    fd38b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19acc7>
  fd38ac:	eb 00                	jmp    fd38ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19acc4>
  fd38ae:	49 89 c6             	mov    r14,rax
  fd38b1:	48 89 df             	mov    rdi,rbx
  fd38b4:	e8 ad ed b0 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  fd38b9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd38c0:	00 00
  fd38c2:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fd38c7:	75 08                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
  fd38c9:	4c 89 f7             	mov    rdi,r14
  fd38cc:	e8 ff c3 a9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  fd38d1:	e8 da c1 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd38d6:	41 57                	push   r15
  fd38d8:	41 56                	push   r14
  fd38da:	41 55                	push   r13
  fd38dc:	41 54                	push   r12
  fd38de:	53                   	push   rbx
  fd38df:	48 83 ec 20          	sub    rsp,0x20
  fd38e3:	49 89 ce             	mov    r14,rcx
  fd38e6:	49 89 d7             	mov    r15,rdx
  fd38e9:	49 89 f4             	mov    r12,rsi
  fd38ec:	48 89 fb             	mov    rbx,rdi
  fd38ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd38f6:	00 00
  fd38f8:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  fd38fd:	48 89 d7             	mov    rdi,rdx
  fd3900:	e8 31 7f aa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  fd3905:	48 89 d1             	mov    rcx,rdx
  fd3908:	48 8d 3d 7b 37 37 ff 	lea    rdi,[rip+0xffffffffff37377b]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  fd390f:	6a 07                	push   0x7
  fd3911:	5e                   	pop    rsi
  fd3912:	48 89 c2             	mov    rdx,rax
  fd3915:	e8 66 7f aa ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  fd391a:	84 c0                	test   al,al
  fd391c:	74 12                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd391e:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
  fd3923:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd3926:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  fd392c:	85 c0                	test   eax,eax
  fd392e:	74 4f                	je     fd397f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad95>
  fd3930:	49 83 c4 08          	add    r12,0x8
  fd3934:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
  fd3939:	4c 89 ef             	mov    rdi,r13
  fd393c:	4c 89 e6             	mov    rsi,r12
  fd393f:	4c 89 fa             	mov    rdx,r15
  fd3942:	4c 89 f1             	mov    rcx,r14
  fd3945:	e8 8a 30 00 00       	call   fd69d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ddea>
  fd394a:	48 89 df             	mov    rdi,rbx
  fd394d:	4c 89 ee             	mov    rsi,r13
  fd3950:	e8 7f 2c 00 00       	call   fd65d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9ea>
  fd3955:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fd3959:	e8 28 ab ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd395e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3965:	00 00
  fd3967:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  fd396c:	75 48                	jne    fd39b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19adcc>
  fd396e:	48 89 d8             	mov    rax,rbx
  fd3971:	48 83 c4 20          	add    rsp,0x20
  fd3975:	5b                   	pop    rbx
  fd3976:	41 5c                	pop    r12
  fd3978:	41 5d                	pop    r13
  fd397a:	41 5e                	pop    r14
  fd397c:	41 5f                	pop    r15
  fd397e:	c3                   	ret
  fd397f:	41 80 7c 24 68 00    	cmp    BYTE PTR [r12+0x68],0x0
  fd3985:	74 a9                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3987:	41 80 7e 60 00       	cmp    BYTE PTR [r14+0x60],0x0
  fd398c:	74 a2                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd398e:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
  fd3992:	49 3b 44 24 58       	cmp    rax,QWORD PTR [r12+0x58]
  fd3997:	7e 97                	jle    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3999:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
  fd399e:	48 39 f0             	cmp    rax,rsi
  fd39a1:	7d 8d                	jge    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39a3:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
  fd39a8:	48 ff c6             	inc    rsi
  fd39ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd39ae:	ff 50 20             	call   QWORD PTR [rax+0x20]
  fd39b1:	e9 7a ff ff ff       	jmp    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39b6:	e8 f5 c0 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd39bb:	cc                   	int3
  fd39bc:	55                   	push   rbp
  fd39bd:	41 57                	push   r15
  fd39bf:	41 56                	push   r14
  fd39c1:	41 55                	push   r13
  fd39c3:	41 54                	push   r12
  fd39c5:	53                   	push   rbx
  fd39c6:	48 81 ec 58 01 00 00 	sub    rsp,0x158
  fd39cd:	49 89 f4             	mov    r12,rsi
  fd39d0:	49 89 ff             	mov    r15,rdi
  fd39d3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd39da:	00 00
  fd39dc:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
  fd39e3:	00
  fd39e4:	48 8d 5e 10          	lea    rbx,[rsi+0x10]
  fd39e8:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  fd39ef:	00
  fd39f0:	48 89 de             	mov    rsi,rbx
  fd39f3:	e8 62 84 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd39f8:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  fd39ff:	00
  fd3a00:	48 89 de             	mov    rsi,rbx
  fd3a03:	e8 52 84 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd3a08:	66 0f ef c0          	pxor   xmm0,xmm0
  fd3a0c:	48 8d 94 24 e0 00 00 	lea    rdx,[rsp+0xe0]
  fd3a13:	00
  fd3a14:	66 0f 7f 02          	movdqa XMMWORD PTR [rdx],xmm0
  fd3a18:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
  fd3a1d:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
  fd3a24:	00
  fd3a25:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  fd3a2c:	00
  fd3a2d:	48 89 df             	mov    rdi,rbx
  fd3a30:	e8 25 16 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  fd3a35:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
  fd3a39:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
  fd3a3d:	48 85 f6             	test   rsi,rsi
  fd3a40:	74 3e                	je     fd3a80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ae96>
  fd3a42:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fd3a45:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  fd3a4c:	00
  fd3a4d:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
  fd3a53:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  fd3a5a:	00
  fd3a5b:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
  fd3a62:	00
  fd3a63:	48 8d 9c 24 c0 00 00 	lea    rbx,[rsp+0xc0]
  fd3a6a:	00
  fd3a6b:	31 d2                	xor    edx,edx
  fd3a6d:	48 89 d9             	mov    rcx,rbx
  fd3a70:	e8 43 14 00 00       	call   fd4eb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c2ce>
  fd3a75:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  fd3a79:	e8 08 aa ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3a7e:	eb 15                	jmp    fd3a95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19aeab>
  fd3a80:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  fd3a87:	00
  fd3a88:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
  fd3a8f:	00
  fd3a90:	e8 6b 12 00 00       	call   fd4d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c116>
  fd3a95:	48 8d 5c 24 70       	lea    rbx,[rsp+0x70]
  fd3a9a:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
  fd3aa1:	00
  fd3aa2:	48 89 df             	mov    rdi,rbx
  fd3aa5:	4c 89 f6             	mov    rsi,r14
  fd3aa8:	e8 0d 20 f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  fd3aad:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fd3ab1:	e8 d0 a9 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3ab6:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  fd3abd:	00
  fd3abe:	e8 4f 18 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
```
## Filtered bridge signals

| addr | instruction |
|---:|---|
| `0xe99d90` | `e99d90:	49 c7 40 40 96 00 00 	mov    QWORD PTR [r8+0x40],0x96` |
| `0xe99da7` | `e99da7:	49 89 40 58          	mov    QWORD PTR [r8+0x58],rax` |
| `0xe9a006` | `e9a006:	49 89 5d 40          	mov    QWORD PTR [r13+0x40],rbx` |
| `0xe9a0a7` | `e9a0a7:	49 83 a5 40 01 00 00 	and    QWORD PTR [r13+0x140],0x0` |
| `0xe9a1d8` | `e9a1d8:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al` |
| `0xe9a3ad` | `e9a3ad:	0f b6 4c 24 40       	movzx  ecx,BYTE PTR [rsp+0x40]` |
| `0xe9a4cd` | `e9a4cd:	49 89 5e 40          	mov    QWORD PTR [r14+0x40],rbx` |
| `0xe9a576` | `e9a576:	49 83 a5 40 01 00 00 	and    QWORD PTR [r13+0x140],0x0` |
| `0xe9a6b3` | `e9a6b3:	4d 89 77 40          	mov    QWORD PTR [r15+0x40],r14` |
| `0xe9a75c` | `e9a75c:	49 83 a5 40 01 00 00 	and    QWORD PTR [r13+0x140],0x0` |
| `0xe9a783` | `e9a783:	4c 89 bc 24 40 01 00 	mov    QWORD PTR [rsp+0x140],r15` |
| `0xe9ad65` | `e9ad65:	41 0f b7 47 40       	movzx  eax,WORD PTR [r15+0x40]` |
| `0xfd4c66` | `fd4c66:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx` |
| `0xfd4ca8` | `fd4ca8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]` |
| `0xfd4cac` | `fd4cac:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx` |
| `0xfd4cd5` | `fd4cd5:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]` |
| `0xfd4eec` | `fd4eec:	40 88 6c 24 58       	mov    BYTE PTR [rsp+0x58],bpl` |
| `0xfd4f59` | `fd4f59:	8a 44 24 58          	mov    al,BYTE PTR [rsp+0x58]` |
| `0xfd4f9f` | `fd4f9f:	88 45 58             	mov    BYTE PTR [rbp+0x58],al` |
| `0xfd52b4` | `fd52b4:	49 8d 74 24 40       	lea    rsi,[r12+0x40]` |
| `0xfd536c` | `fd536c:	41 80 7c 24 58 00    	cmp    BYTE PTR [r12+0x58],0x0` |
| `0xfd53e1` | `fd53e1:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xfd5487` | `fd5487:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xfd54c4` | `fd54c4:	4c 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],r13` |
| `0xfd360a` | `fd360a:	c6 44 24 58 01       	mov    BYTE PTR [rsp+0x58],0x1` |
| `0xfd3626` | `fd3626:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xfd367c` | `fd367c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xfd37ce` | `fd37ce:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xfd3846` | `fd3846:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]` |
| `0xfd384d` | `fd384d:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]` |
| `0xfd391e` | `fd391e:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]` |
| `0xfd3926` | `fd3926:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]` |
| `0xfd398e` | `fd398e:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]` |
| `0xfd3992` | `fd3992:	49 3b 44 24 58       	cmp    rax,QWORD PTR [r12+0x58]` |
| `0xfd3da6` | `fd3da6:	4c 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],r15` |
| `0xfd3ddc` | `fd3ddc:	48 83 63 58 00       	and    QWORD PTR [rbx+0x58],0x0` |
| `0xfd3f3e` | `fd3f3e:	80 7b 58 00          	cmp    BYTE PTR [rbx+0x58],0x0` |
| `0xfd3f44` | `fd3f44:	48 8d 73 40          	lea    rsi,[rbx+0x40]` |
| `0xfd41c2` | `fd41c2:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0` |
| `0xfd41ec` | `fd41ec:	66 0f 7f 4c 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm1` |
| `0xfd422f` | `fd422f:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xfd4254` | `fd4254:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]` |

## Text mentions of bridge functions

| addr | instruction |
|---:|---|
| `0xe95d35` | `e95d35:	e8 cd 3f 00 00       	call   e99d07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6111d>` |
| `0xe99d07` | `e99d07:	55                   	push   rbp` |
| `0xfd381a` | `fd381a:	41 56                	push   r14` |
| `0xfd4af5` | `fd4af5:	e8 0a 01 00 00       	call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>` |
| `0xfd4c04` | `fd4c04:	41 56                	push   r14` |
| `0xfd5344` | `fd5344:	e8 bb f8 ff ff       	call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>` |
| `0xfd6196` | `fd6196:	e8 69 ea ff ff       	call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>` |
| `0xfd62b6` | `fd62b6:	e8 49 e9 ff ff       	call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>` |

