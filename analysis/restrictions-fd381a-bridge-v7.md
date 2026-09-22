# Restrictions bridge to `fd381a state+0x40/+0x140` candidates

Parallel v7 report. Focus: whether the installed Restrictions object or the `0x198/AP 0x184d5d0` consumer appears in the known `e99d07 -> fd4c04 -> fd381a` readiness path.

## `e99d07` `0xe99d07` window

```text
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
```
## `fd4c04` `0xfd4c04` window

```text
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
```
## `fd381a` `0xfd381a` window

```text
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
```
## `candidate installed AP method 10bffde` `0x10bffde` window

```text
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
 10c01c7:	cc                   	int3
 10c01c8:	53                   	push   rbx
 10c01c9:	48 89 fb             	mov    rbx,rdi
 10c01cc:	e8 c1 ff ff ff       	call   10c0192 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2875a8>
 10c01d1:	48 89 df             	mov    rdi,rbx
 10c01d4:	5b                   	pop    rbx
 10c01d5:	e9 46 dd 72 00       	jmp    17edf20 <_ZdlPv@plt>
 10c01da:	0f 18 0d b7 90 83 00 	prefetcht0 BYTE PTR [rip+0x8390b7]        # 18f9298 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x406a8>
```
## `late consumer AP family 10ba802` `0x10ba802` window

```text
 10ba78a:	48 85 ff             	test   rdi,rdi
 10ba78d:	74 0a                	je     10ba799 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281baf>
 10ba78f:	5b                   	pop    rbx
 10ba790:	41 5e                	pop    r14
 10ba792:	41 5f                	pop    r15
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
 10ba9bb:	48 83 c4 18          	add    rsp,0x18
 10ba9bf:	c3                   	ret
 10ba9c0:	e8 eb 50 73 00       	call   17efab0 <__stack_chk_fail@plt>
 10ba9c5:	cc                   	int3
 10ba9c6:	41 56                	push   r14
 10ba9c8:	53                   	push   rbx
```
## Filtered readiness-path signal mentions

| addr | instruction |
|---:|---|
| `0xe802ed` | `e802ed:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe802fc` | `e802fc:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]` |
| `0xe803c9` | `e803c9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe803d8` | `e803d8:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]` |
| `0xe80512` | `e80512:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0` |
| `0xe8053e` | `e8053e:	4c 89 73 40          	mov    QWORD PTR [rbx+0x40],r14` |
| `0xe81f2d` | `e81f2d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe81f64` | `e81f64:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe81f7e` | `e81f7e:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1` |
| `0xe81fba` | `e81fba:	48 89 46 40          	mov    QWORD PTR [rsi+0x40],rax` |
| `0xe82030` | `e82030:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe8262f` | `e8262f:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xe82690` | `e82690:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe8280f` | `e8280f:	49 89 45 40          	mov    QWORD PTR [r13+0x40],rax` |
| `0xe8298e` | `e8298e:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]` |
| `0xe82a70` | `e82a70:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]` |
| `0xe82b5f` | `e82b5f:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xe82b8c` | `e82b8c:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xe82db2` | `e82db2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe82e83` | `e82e83:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe82f38` | `e82f38:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xe82fa0` | `e82fa0:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe8300b` | `e8300b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe830d5` | `e830d5:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe8327c` | `e8327c:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe8335c` | `e8335c:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe833a2` | `e833a2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe83482` | `e83482:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe834c8` | `e834c8:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe835a8` | `e835a8:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe835ee` | `e835ee:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe836c4` | `e836c4:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe83799` | `e83799:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe83852` | `e83852:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe8393b` | `e8393b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe83982` | `e83982:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe83a6b` | `e83a6b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe83ab2` | `e83ab2:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe83b9d` | `e83b9d:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe83c75` | `e83c75:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe83db9` | `e83db9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe83e62` | `e83e62:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe83f3b` | `e83f3b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe84122` | `e84122:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe841fb` | `e841fb:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe84242` | `e84242:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe8431b` | `e8431b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe84362` | `e84362:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe8443b` | `e8443b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe844dd` | `e844dd:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe845d8` | `e845d8:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe846c3` | `e846c3:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe84869` | `e84869:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe84992` | `e84992:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe84ab3` | `e84ab3:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe84d0d` | `e84d0d:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe84de3` | `e84de3:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe84f33` | `e84f33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xe84f60` | `e84f60:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xe85111` | `e85111:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15` |
| `0xe85127` | `e85127:	4c 8b 7b 40          	mov    r15,QWORD PTR [rbx+0x40]` |
| `0xe8531e` | `e8531e:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]` |
| `0xe858ad` | `e858ad:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe85913` | `e85913:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xe85bbb` | `e85bbb:	41 0f 10 46 40       	movups xmm0,XMMWORD PTR [r14+0x40]` |
| `0xe85bdc` | `e85bdc:	4d 8b 76 40          	mov    r14,QWORD PTR [r14+0x40]` |
| `0xe85c0a` | `e85c0a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe85c18` | `e85c18:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]` |
| `0xe85cb7` | `e85cb7:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe85ccc` | `e85ccc:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]` |
| `0xe85cf9` | `e85cf9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe86845` | `e86845:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xe87056` | `e87056:	0f 11 84 24 40 01 00 	movups XMMWORD PTR [rsp+0x140],xmm0` |
| `0xe874dd` | `e874dd:	0f 11 84 24 40 01 00 	movups XMMWORD PTR [rsp+0x140],xmm0` |
| `0xe87890` | `e87890:	0f 11 84 24 40 01 00 	movups XMMWORD PTR [rsp+0x140],xmm0` |
| `0xe87aa4` | `e87aa4:	0f 11 84 24 40 01 00 	movups XMMWORD PTR [rsp+0x140],xmm0` |
| `0xe87cb8` | `e87cb8:	0f 11 84 24 40 01 00 	movups XMMWORD PTR [rsp+0x140],xmm0` |
| `0xe8820d` | `e8820d:	0f 29 84 24 40 01 00 	movaps XMMWORD PTR [rsp+0x140],xmm0` |
| `0xe88436` | `e88436:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe887bd` | `e887bd:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe887ea` | `e887ea:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe887fa` | `e887fa:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1` |
| `0xe8884f` | `e8884f:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe88a7a` | `e88a7a:	0f 11 84 24 40 01 00 	movups XMMWORD PTR [rsp+0x140],xmm0` |
| `0xe88c39` | `e88c39:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe89c46` | `e89c46:	0f 11 44 24 40       	movups XMMWORD PTR [rsp+0x40],xmm0` |
| `0xe89e50` | `e89e50:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe8acbb` | `e8acbb:	0f 11 44 24 40       	movups XMMWORD PTR [rsp+0x40],xmm0` |
| `0xe8ae8a` | `e8ae8a:	48 8d 7e 40          	lea    rdi,[rsi+0x40]` |
| `0xe8b48e` | `e8b48e:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp` |
| `0xe8b4a9` | `e8b4a9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe8b556` | `e8b556:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe8b5a3` | `e8b5a3:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]` |
| `0xe8b5c2` | `e8b5c2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe8bb15` | `e8bb15:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax` |
| `0xe8bb72` | `e8bb72:	4c 89 73 40          	mov    QWORD PTR [rbx+0x40],r14` |
| `0xe8bca4` | `e8bca4:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx` |
| `0xe8bd08` | `e8bd08:	48 8d 84 24 40 01 00 	lea    rax,[rsp+0x140]` |
| `0xe8bd2a` | `e8bd2a:	48 8d 44 24 40       	lea    rax,[rsp+0x40]` |
| `0xe8be60` | `e8be60:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe8be83` | `e8be83:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xe8c0a3` | `e8c0a3:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe8c142` | `e8c142:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xe8c6c9` | `e8c6c9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe8c949` | `e8c949:	48 83 7d 40 00       	cmp    QWORD PTR [rbp+0x40],0x0` |
| `0xe8c9c6` | `e8c9c6:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xe8ca0a` | `e8ca0a:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]` |
| `0xe8cb15` | `e8cb15:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xe8d093` | `e8d093:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xe8d687` | `e8d687:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xe8d6d1` | `e8d6d1:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xe8d6d9` | `e8d6d9:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xe8d6dc` | `e8d6dc:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe8d779` | `e8d779:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xe8d8e9` | `e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]` |
| `0xe8d8fb` | `e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax` |
| `0xe8da76` | `e8da76:	ff b4 24 40 01 00 00 	push   QWORD PTR [rsp+0x140]` |
| `0xe8dbeb` | `e8dbeb:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]` |
| `0xe8dc8a` | `e8dc8a:	41 0f 10 47 40       	movups xmm0,XMMWORD PTR [r15+0x40]` |
| `0xe8dc93` | `e8dc93:	f3 41 0f 7f 4f 40    	movdqu XMMWORD PTR [r15+0x40],xmm1` |
| `0xe8dd44` | `e8dd44:	41 0f 10 47 40       	movups xmm0,XMMWORD PTR [r15+0x40]` |
| `0xe8dd4d` | `e8dd4d:	f3 41 0f 7f 4f 40    	movdqu XMMWORD PTR [r15+0x40],xmm1` |
| `0xe8e6ce` | `e8e6ce:	49 8b be 40 01 00 00 	mov    rdi,QWORD PTR [r14+0x140]` |
| `0xe8edc5` | `e8edc5:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xe8f475` | `e8f475:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]` |
| `0xe8f488` | `e8f488:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax` |
| `0xe8f4ad` | `e8f4ad:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xe8f4ca` | `e8f4ca:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xe8f4d9` | `e8f4d9:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax` |
| `0xe8f503` | `e8f503:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xe8f510` | `e8f510:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xe8f51a` | `e8f51a:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0` |
| `0xe8f53d` | `e8f53d:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15` |
| `0xe8f67c` | `e8f67c:	48 8b bf 40 01 00 00 	mov    rdi,QWORD PTR [rdi+0x140]` |
| `0xe8f6f0` | `e8f6f0:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]` |
| `0xe8fb93` | `e8fb93:	66 0f 7f 4c 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm1` |
| `0xe8fbb7` | `e8fbb7:	48 89 4f c0          	mov    QWORD PTR [rdi-0x40],rcx` |
| `0xe8fd3d` | `e8fd3d:	48 83 67 c0 00       	and    QWORD PTR [rdi-0x40],0x0` |
| `0xe8fefa` | `e8fefa:	0f 29 43 40          	movaps XMMWORD PTR [rbx+0x40],xmm0` |
| `0xe900e7` | `e900e7:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe91217` | `e91217:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe91570` | `e91570:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0` |
| `0xe91630` | `e91630:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe91636` | `e91636:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0` |
| `0xe919cc` | `e919cc:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe91a7a` | `e91a7a:	49 89 86 40 01 00 00 	mov    QWORD PTR [r14+0x140],rax` |
| `0xe91ce7` | `e91ce7:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx` |
| `0xe91cf9` | `e91cf9:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xe91dcb` | `e91dcb:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xe920df` | `e920df:	4d 8d 7c 24 40       	lea    r15,[r12+0x40]` |
| `0xe92187` | `e92187:	41 88 84 24 40 01 00 	mov    BYTE PTR [r12+0x140],al` |
| `0xe9272f` | `e9272f:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe92734` | `e92734:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xe929f4` | `e929f4:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0xe92aea` | `e92aea:	49 8b 7e c0          	mov    rdi,QWORD PTR [r14-0x40]` |
| `0xe92b3c` | `e92b3c:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe92bda` | `e92bda:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xe92ea6` | `e92ea6:	48 8b bb 40 01 00 00 	mov    rdi,QWORD PTR [rbx+0x140]` |
| `0xe9374b` | `e9374b:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0` |
| `0xe937b8` | `e937b8:	4c 8d 73 40          	lea    r14,[rbx+0x40]` |
| `0xe9390d` | `e9390d:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al` |
| `0xe93a64` | `e93a64:	c6 83 40 01 00 00 00 	mov    BYTE PTR [rbx+0x140],0x0` |
| `0xe93aaf` | `e93aaf:	89 44 24 40          	mov    DWORD PTR [rsp+0x40],eax` |
| `0xe93e72` | `e93e72:	8b 4c 24 40          	mov    ecx,DWORD PTR [rsp+0x40]` |
| `0xe93ed3` | `e93ed3:	66 0f 7f 45 40       	movdqa XMMWORD PTR [rbp+0x40],xmm0` |
| `0xe93f00` | `e93f00:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |
| `0xe93fcb` | `e93fcb:	4c 89 bd 40 01 00 00 	mov    QWORD PTR [rbp+0x140],r15` |
| `0xe940b9` | `e940b9:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xe9421a` | `e9421a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xe94324` | `e94324:	49 8b 85 40 01 00 00 	mov    rax,QWORD PTR [r13+0x140]` |
| `0xe947fd` | `e947fd:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0` |
| `0xe948d2` | `e948d2:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xe94cba` | `e94cba:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0` |
| `0xe94d32` | `e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax` |
| `0xe94e9d` | `e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al` |
| `0xe94f6d` | `e94f6d:	4d 89 bc 24 40 01 00 	mov    QWORD PTR [r12+0x140],r15` |
| `0xe95110` | `e95110:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xe95260` | `e95260:	4c 89 73 40          	mov    QWORD PTR [rbx+0x40],r14` |
| `0xe95489` | `e95489:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xe958eb` | `e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0` |
| `0xe95921` | `e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx` |
| `0xe95948` | `e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]` |
| `0xe95bf2` | `e95bf2:	4c 8b 8c 24 40 01 00 	mov    r9,QWORD PTR [rsp+0x140]` |
| `0xe95d35` | `e95d35:	e8 cd 3f 00 00       	call   e99d07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6111d>` |
| `0xe96440` | `e96440:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax` |
| `0xe96461` | `e96461:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]` |
| `0xe96482` | `e96482:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0` |
| `0xe9662b` | `e9662b:	4c 8d b5 40 01 00 00 	lea    r14,[rbp+0x140]` |
| `0xe966aa` | `e966aa:	48 89 bc 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rdi` |
| `0xe96e4e` | `e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xe96ea5` | `e96ea5:	4c 39 63 40          	cmp    QWORD PTR [rbx+0x40],r12` |
| `0xe96ec8` | `e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xe96ed0` | `e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12` |
| `0xe96f02` | `e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xe96f14` | `e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xe96f1e` | `e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0` |
| `0xe96f4a` | `e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12` |
| `0xe97446` | `e97446:	4d 89 7e 40          	mov    QWORD PTR [r14+0x40],r15` |
| `0xe9769a` | `e9769a:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]` |
| `0xe976b7` | `e976b7:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xe977aa` | `e977aa:	4c 8d 73 40          	lea    r14,[rbx+0x40]` |
| `0xe97a90` | `e97a90:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xe9819e` | `e9819e:	49 8b bc 24 40 01 00 	mov    rdi,QWORD PTR [r12+0x140]` |
| `0xe98458` | `e98458:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]` |
| `0xe9864c` | `e9864c:	48 8b bc 24 40 01 00 	mov    rdi,QWORD PTR [rsp+0x140]` |
| `0xe98cea` | `e98cea:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xe98d58` | `e98d58:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xe98e02` | `e98e02:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xe98e8e` | `e98e8e:	49 8b be 40 01 00 00 	mov    rdi,QWORD PTR [r14+0x140]` |
| `0xe98edb` | `e98edb:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xe98fb1` | `e98fb1:	41 0f 10 46 40       	movups xmm0,XMMWORD PTR [r14+0x40]` |
| `0xe98fc8` | `e98fc8:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0` |
| `0xe99016` | `e99016:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]` |
| `0xe991ac` | `e991ac:	48 8d 7b 40          	lea    rdi,[rbx+0x40]` |
| `0xe998c5` | `e998c5:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0` |
| `0xe99d07` | `e99d07:	55                   	push   rbp` |
| `0xe99d90` | `e99d90:	49 c7 40 40 96 00 00 	mov    QWORD PTR [r8+0x40],0x96` |
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
| `0xe9b27d` | `e9b27d:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xe9b358` | `e9b358:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe9bb0d` | `e9bb0d:	41 88 5e 40          	mov    BYTE PTR [r14+0x40],bl` |
| `0xe9c9a3` | `e9c9a3:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax` |
| `0xe9ca7c` | `e9ca7c:	f3 0f 7e 84 24 40 01 	movq   xmm0,QWORD PTR [rsp+0x140]` |
| `0xe9ca8d` | `e9ca8d:	0f 28 54 24 40       	movaps xmm2,XMMWORD PTR [rsp+0x40]` |
| `0xe9ccef` | `e9ccef:	49 8b 47 c0          	mov    rax,QWORD PTR [r15-0x40]` |
| `0xe9cd32` | `e9cd32:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |
| `0xe9cd9d` | `e9cd9d:	66 41 0f 7f 8c 24 40 	movdqa XMMWORD PTR [r12+0x140],xmm1` |
| `0xe9d3e2` | `e9d3e2:	89 83 40 01 00 00    	mov    DWORD PTR [rbx+0x140],eax` |
| `0xe9d585` | `e9d585:	41 89 85 40 01 00 00 	mov    DWORD PTR [r13+0x140],eax` |
| `0xe9d7fb` | `e9d7fb:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al` |
| `0xe9d8b8` | `e9d8b8:	8a 4c 24 40          	mov    cl,BYTE PTR [rsp+0x40]` |
| `0xe9d9f6` | `e9d9f6:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]` |
| `0xe9daa7` | `e9daa7:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]` |
| `0xe9deab` | `e9deab:	0f 10 42 40          	movups xmm0,XMMWORD PTR [rdx+0x40]` |
| `0xe9e41d` | `e9e41d:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xe9e47f` | `e9e47f:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe9e4eb` | `e9e4eb:	66 0f 6f 4c 24 40    	movdqa xmm1,XMMWORD PTR [rsp+0x40]` |
| `0xe9e584` | `e9e584:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xe9e875` | `e9e875:	66 41 0f 7f 47 40    	movdqa XMMWORD PTR [r15+0x40],xmm0` |
| `0xe9e9fd` | `e9e9fd:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0` |
| `0xe9eaaf` | `e9eaaf:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0` |
| `0xe9fbce` | `e9fbce:	49 83 a6 40 01 00 00 	and    QWORD PTR [r14+0x140],0x0` |
| `0xe9fce9` | `e9fce9:	48 83 a5 40 01 00 00 	and    QWORD PTR [rbp+0x140],0x0` |
| `0xe9fd75` | `e9fd75:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx` |
| `0xe9fdbc` | `e9fdbc:	48 89 43 c0          	mov    QWORD PTR [rbx-0x40],rax` |
| `0xe9ff8d` | `e9ff8d:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0` |
| `0xea024d` | `ea024d:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0` |
| `0xea0420` | `ea0420:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xea04b8` | `ea04b8:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]` |
| `0xea04d3` | `ea04d3:	48 89 68 40          	mov    QWORD PTR [rax+0x40],rbp` |
| `0xea0520` | `ea0520:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xea05b8` | `ea05b8:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]` |
| `0xea05d3` | `ea05d3:	48 89 68 40          	mov    QWORD PTR [rax+0x40],rbp` |
| `0xea11d2` | `ea11d2:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xea191b` | `ea191b:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xea2263` | `ea2263:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax` |
| `0xea227d` | `ea227d:	49 8d b4 24 40 01 00 	lea    rsi,[r12+0x140]` |
| `0xea2350` | `ea2350:	48 8b bb 40 01 00 00 	mov    rdi,QWORD PTR [rbx+0x140]` |
| `0xea259a` | `ea259a:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]` |
| `0xea2618` | `ea2618:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]` |
| `0xea26c7` | `ea26c7:	41 88 47 c0          	mov    BYTE PTR [r15-0x40],al` |
| `0xea26e6` | `ea26e6:	41 88 47 40          	mov    BYTE PTR [r15+0x40],al` |
| `0xea2709` | `ea2709:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al` |
| `0xea2a38` | `ea2a38:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1` |
| `0xea2a83` | `ea2a83:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xea2c33` | `ea2c33:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0` |
| `0xea2da2` | `ea2da2:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]` |
| `0xea2dff` | `ea2dff:	48 8d 7b 40          	lea    rdi,[rbx+0x40]` |
| `0xea3136` | `ea3136:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax` |
| `0xea32bd` | `ea32bd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xea34f6` | `ea34f6:	48 8b 84 24 40 01 00 	mov    rax,QWORD PTR [rsp+0x140]` |
| `0xea3514` | `ea3514:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0` |
| `0xea367c` | `ea367c:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xea39ba` | `ea39ba:	41 0f 11 40 40       	movups XMMWORD PTR [r8+0x40],xmm0` |
| `0xea3d4c` | `ea3d4c:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xea45d0` | `ea45d0:	4c 89 ac 24 40 01 00 	mov    QWORD PTR [rsp+0x140],r13` |
| `0xea495f` | `ea495f:	0f 29 84 24 40 01 00 	movaps XMMWORD PTR [rsp+0x140],xmm0` |
| `0xea4f2c` | `ea4f2c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xea53ad` | `ea53ad:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xea589a` | `ea589a:	41 0f 10 44 24 40    	movups xmm0,XMMWORD PTR [r12+0x40]` |
| `0xea58a3` | `ea58a3:	41 0f 11 4c 24 40    	movups XMMWORD PTR [r12+0x40],xmm1` |
| `0xea5936` | `ea5936:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0` |
| `0xea5ac5` | `ea5ac5:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xea5c99` | `ea5c99:	41 0f 10 45 40       	movups xmm0,XMMWORD PTR [r13+0x40]` |
| `0xea5ca1` | `ea5ca1:	41 0f 11 4d 40       	movups XMMWORD PTR [r13+0x40],xmm1` |
| `0xea5d43` | `ea5d43:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xea5d62` | `ea5d62:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xea5d77` | `ea5d77:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xea5d9b` | `ea5d9b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xea5e1e` | `ea5e1e:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0` |
| `0xea5e74` | `ea5e74:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xea5f3d` | `ea5f3d:	4e 8d 34 2d c0 ff ff 	lea    r14,[r13*1-0x40]` |
| `0xea5fbd` | `ea5fbd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xea6026` | `ea6026:	41 0f 10 44 24 40    	movups xmm0,XMMWORD PTR [r12+0x40]` |
| `0xea602f` | `ea602f:	41 0f 11 4c 24 40    	movups XMMWORD PTR [r12+0x40],xmm1` |
| `0xea65c7` | `ea65c7:	0f 11 64 24 40       	movups XMMWORD PTR [rsp+0x40],xmm4` |
| `0xea6e47` | `ea6e47:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xea705d` | `ea705d:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xea7189` | `ea7189:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xea71b2` | `ea71b2:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xea71c2` | `ea71c2:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xea7400` | `ea7400:	41 0f 29 46 40       	movaps XMMWORD PTR [r14+0x40],xmm0` |
| `0xea75f3` | `ea75f3:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xea7c0a` | `ea7c0a:	38 44 24 40          	cmp    BYTE PTR [rsp+0x40],al` |
| `0xea81b3` | `ea81b3:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15` |
| `0xea8289` | `ea8289:	48 89 bc 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rdi` |
| `0xea82bd` | `ea82bd:	48 8b ac 24 40 01 00 	mov    rbp,QWORD PTR [rsp+0x140]` |
| `0xea85c6` | `ea85c6:	0f 28 84 24 40 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x140]` |
| `0xea86dd` | `ea86dd:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xea97a1` | `ea97a1:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15` |
| `0xea9ce5` | `ea9ce5:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xeaa171` | `eaa171:	80 7c 24 40 04       	cmp    BYTE PTR [rsp+0x40],0x4` |
| `0xeaa3ad` | `eaa3ad:	80 7b 40 00          	cmp    BYTE PTR [rbx+0x40],0x0` |
| `0xeaa3bb` | `eaa3bb:	c6 43 40 00          	mov    BYTE PTR [rbx+0x40],0x0` |
| `0xeaa53d` | `eaa53d:	0f 10 4c 24 40       	movups xmm1,XMMWORD PTR [rsp+0x40]` |
| `0xeaa542` | `eaa542:	0f 11 44 24 40       	movups XMMWORD PTR [rsp+0x40],xmm0` |
| `0xeaa6aa` | `eaa6aa:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx` |
| `0xeaa9eb` | `eaa9eb:	48 8d 9c 24 40 01 00 	lea    rbx,[rsp+0x140]` |
| `0xeaabac` | `eaabac:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeab552` | `eab552:	48 8b 6c 24 40       	mov    rbp,QWORD PTR [rsp+0x40]` |
| `0xeab5bf` | `eab5bf:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12` |
| `0xeab64c` | `eab64c:	0f 28 5c 24 40       	movaps xmm3,XMMWORD PTR [rsp+0x40]` |
| `0xeab660` | `eab660:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1` |
| `0xeab679` | `eab679:	48 8b 6c 24 40       	mov    rbp,QWORD PTR [rsp+0x40]` |
| `0xeab682` | `eab682:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp` |
| `0xeab85f` | `eab85f:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xeabae7` | `eabae7:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]` |
| `0xeabb07` | `eabb07:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xeabb0a` | `eabb0a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabb44` | `eabb44:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabbbf` | `eabbbf:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]` |
| `0xeabbe2` | `eabbe2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeabc1c` | `eabc1c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeac0a6` | `eac0a6:	c7 40 40 0f 00 00 00 	mov    DWORD PTR [rax+0x40],0xf` |
| `0xeac202` | `eac202:	0f 11 45 40          	movups XMMWORD PTR [rbp+0x40],xmm0` |
| `0xeac232` | `eac232:	48 89 45 40          	mov    QWORD PTR [rbp+0x40],rax` |
| `0xeac581` | `eac581:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0` |
| `0xeac8cd` | `eac8cd:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]` |
| `0xead1a1` | `ead1a1:	0f 11 41 40          	movups XMMWORD PTR [rcx+0x40],xmm0` |
| `0xead544` | `ead544:	48 8b 47 40          	mov    rax,QWORD PTR [rdi+0x40]` |
| `0xead561` | `ead561:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax` |
| `0xead85f` | `ead85f:	c6 40 40 00          	mov    BYTE PTR [rax+0x40],0x0` |
| `0xead937` | `ead937:	83 60 40 00          	and    DWORD PTR [rax+0x40],0x0` |
| `0xeadbb8` | `eadbb8:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]` |
| `0xeadc09` | `eadc09:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0` |
| `0xeae3cf` | `eae3cf:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0` |
| `0xeae4a6` | `eae4a6:	4c 8b 54 24 40       	mov    r10,QWORD PTR [rsp+0x40]` |
| `0xeae4e7` | `eae4e7:	ff 74 24 40          	push   QWORD PTR [rsp+0x40]` |
| `0xeaeae3` | `eaeae3:	c7 44 24 40 04 00 00 	mov    DWORD PTR [rsp+0x40],0x4` |
| `0xeaeb25` | `eaeb25:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xeaec30` | `eaec30:	c7 44 24 40 04 00 00 	mov    DWORD PTR [rsp+0x40],0x4` |
| `0xeaec72` | `eaec72:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xeaee21` | `eaee21:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xeaeff1` | `eaeff1:	c7 44 24 40 04 00 00 	mov    DWORD PTR [rsp+0x40],0x4` |
| `0xeaf033` | `eaf033:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xeaf2cd` | `eaf2cd:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xeafe6b` | `eafe6b:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]` |
| `0xeb08ea` | `eb08ea:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]` |
| `0xeb0f45` | `eb0f45:	0f 11 41 40          	movups XMMWORD PTR [rcx+0x40],xmm0` |
| `0xeb11ab` | `eb11ab:	0f 11 41 40          	movups XMMWORD PTR [rcx+0x40],xmm0` |
| `0xeb11ce` | `eb11ce:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xeb13e2` | `eb13e2:	0f 11 41 40          	movups XMMWORD PTR [rcx+0x40],xmm0` |
| `0xeb1a72` | `eb1a72:	41 8b 47 40          	mov    eax,DWORD PTR [r15+0x40]` |
| `0xeb21a9` | `eb21a9:	49 8d b6 40 01 00 00 	lea    rsi,[r14+0x140]` |
| `0xeb21f4` | `eb21f4:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]` |
| `0xeb23f1` | `eb23f1:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xeb24b2` | `eb24b2:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0` |
| `0xeb2d1a` | `eb2d1a:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xeb2e23` | `eb2e23:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]` |
| `0xeb2e4e` | `eb2e4e:	0f 11 42 40          	movups XMMWORD PTR [rdx+0x40],xmm0` |
| `0xeb2ec1` | `eb2ec1:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xeb2f12` | `eb2f12:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]` |
| `0xeb30a8` | `eb30a8:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xeb31e3` | `eb31e3:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xeb385b` | `eb385b:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xeb3f01` | `eb3f01:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xeb4518` | `eb4518:	80 7f 40 00          	cmp    BYTE PTR [rdi+0x40],0x0` |
| `0xeb47de` | `eb47de:	48 83 61 40 00       	and    QWORD PTR [rcx+0x40],0x0` |
| `0xeb49aa` | `eb49aa:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]` |
| `0xeb49ee` | `eb49ee:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeb4a99` | `eb4a99:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeb4c84` | `eb4c84:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax` |
| `0xeb4d8a` | `eb4d8a:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx` |
| `0xeb4e50` | `eb4e50:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xeb4e73` | `eb4e73:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xeb5087` | `eb5087:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xeb52a0` | `eb52a0:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14` |
| `0xeb54ed` | `eb54ed:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xeb5502` | `eb5502:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xeb5516` | `eb5516:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]` |
| `0xeb566e` | `eb566e:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx` |
| `0xeb6213` | `eb6213:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]` |
| `0xeb6343` | `eb6343:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx` |
| `0xeb6503` | `eb6503:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]` |
| `0xeb679b` | `eb679b:	4c 29 64 24 40       	sub    QWORD PTR [rsp+0x40],r12` |
| `0xeb67b5` | `eb67b5:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]` |
| `0xeb682a` | `eb682a:	48 89 9c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rbx` |
| `0xeb68c7` | `eb68c7:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xeb6a2a` | `eb6a2a:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xeb6c16` | `eb6c16:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xeb6cfd` | `eb6cfd:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xeb6d59` | `eb6d59:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xeb6d8d` | `eb6d8d:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]` |
| `0xeb6df7` | `eb6df7:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xeb717d` | `eb717d:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]` |
| `0xeb7288` | `eb7288:	4c 89 44 24 40       	mov    QWORD PTR [rsp+0x40],r8` |
| `0xeb752e` | `eb752e:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xeb75a2` | `eb75a2:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xeb76c0` | `eb76c0:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xeb7816` | `eb7816:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]` |
| `0xeb7867` | `eb7867:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx` |
| `0xeb788f` | `eb788f:	48 8d 8c 24 40 01 00 	lea    rcx,[rsp+0x140]` |
| `0xeb78b9` | `eb78b9:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]` |
| `0xeb7a3e` | `eb7a3e:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]` |
| `0xeb7f31` | `eb7f31:	48 89 74 24 40       	mov    QWORD PTR [rsp+0x40],rsi` |
| `0xeb7f58` | `eb7f58:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]` |
| `0xeb8479` | `eb8479:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xeb8926` | `eb8926:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]` |
| `0xeb9003` | `eb9003:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xeb90e3` | `eb90e3:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xeb9abd` | `eb9abd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xeb9c7d` | `eb9c7d:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xeb9c9c` | `eb9c9c:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xeba510` | `eba510:	48 8b 79 40          	mov    rdi,QWORD PTR [rcx+0x40]` |
| `0xeba528` | `eba528:	48 8b 7c 31 40       	mov    rdi,QWORD PTR [rcx+rsi*1+0x40]` |
| `0xeba52d` | `eba52d:	48 89 79 40          	mov    QWORD PTR [rcx+0x40],rdi` |
| `0xeba542` | `eba542:	48 89 7c 31 40       	mov    QWORD PTR [rcx+rsi*1+0x40],rdi` |
| `0xeba787` | `eba787:	48 8b 74 1a 40       	mov    rsi,QWORD PTR [rdx+rbx*1+0x40]` |
| `0xeba7a1` | `eba7a1:	48 89 74 1a 40       	mov    QWORD PTR [rdx+rbx*1+0x40],rsi` |
| `0xebac7e` | `ebac7e:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xebac8b` | `ebac8b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xebaf6d` | `ebaf6d:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xebb06c` | `ebb06c:	48 3b 4c 24 40       	cmp    rcx,QWORD PTR [rsp+0x40]` |
| `0xebb2be` | `ebb2be:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15` |
| `0xebb60d` | `ebb60d:	41 0f 11 40 40       	movups XMMWORD PTR [r8+0x40],xmm0` |
| `0xebb733` | `ebb733:	41 0f 11 40 40       	movups XMMWORD PTR [r8+0x40],xmm0` |
| `0xebb859` | `ebb859:	41 0f 11 40 40       	movups XMMWORD PTR [r8+0x40],xmm0` |
| `0xebc540` | `ebc540:	4d 3b 66 40          	cmp    r12,QWORD PTR [r14+0x40]` |
| `0xebc6a7` | `ebc6a7:	48 8d 7b 40          	lea    rdi,[rbx+0x40]` |
| `0xebc6d4` | `ebc6d4:	49 3b 74 24 40       	cmp    rsi,QWORD PTR [r12+0x40]` |
| `0xebd018` | `ebd018:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0` |
| `0xebd358` | `ebd358:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx` |
| `0xebd369` | `ebd369:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xebd3f3` | `ebd3f3:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]` |
| `0xebde02` | `ebde02:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xebdfab` | `ebdfab:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xebe426` | `ebe426:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xebe6a5` | `ebe6a5:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xebe6f0` | `ebe6f0:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xebe717` | `ebe717:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xebf0fe` | `ebf0fe:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx` |
| `0xebf431` | `ebf431:	88 47 40             	mov    BYTE PTR [rdi+0x40],al` |
| `0xebf485` | `ebf485:	88 87 40 01 00 00    	mov    BYTE PTR [rdi+0x140],al` |
| `0xec0001` | `ec0001:	88 47 c0             	mov    BYTE PTR [rdi-0x40],al` |
| `0xec0018` | `ec0018:	88 47 40             	mov    BYTE PTR [rdi+0x40],al` |
| `0xec0645` | `ec0645:	0f 11 46 40          	movups XMMWORD PTR [rsi+0x40],xmm0` |
| `0xec093d` | `ec093d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec0ad4` | `ec0ad4:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xec0aec` | `ec0aec:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec0cd3` | `ec0cd3:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx` |
| `0xec0d99` | `ec0d99:	88 5f 40             	mov    BYTE PTR [rdi+0x40],bl` |
| `0xec0e83` | `ec0e83:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xec0ea9` | `ec0ea9:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]` |
| `0xec0eb6` | `ec0eb6:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xec0ed4` | `ec0ed4:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xec0efd` | `ec0efd:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]` |
| `0xec0f0a` | `ec0f0a:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xec0f90` | `ec0f90:	48 8d 8c 24 40 01 00 	lea    rcx,[rsp+0x140]` |
| `0xec0faa` | `ec0faa:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xec107c` | `ec107c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xec1095` | `ec1095:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xec11d8` | `ec11d8:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]` |
| `0xec1288` | `ec1288:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xec12a9` | `ec12a9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec1329` | `ec1329:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec13ef` | `ec13ef:	48 8d 7b 40          	lea    rdi,[rbx+0x40]` |
| `0xec1461` | `ec1461:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]` |
| `0xec149b` | `ec149b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec1547` | `ec1547:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec15d1` | `ec15d1:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]` |
| `0xec160b` | `ec160b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec16b6` | `ec16b6:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec1726` | `ec1726:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xec172b` | `ec172b:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xec175f` | `ec175f:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xec1775` | `ec1775:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xec1782` | `ec1782:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xec1ceb` | `ec1ceb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax` |
| `0xec21a0` | `ec21a0:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec21f4` | `ec21f4:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]` |
| `0xec228a` | `ec228a:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xec23ac` | `ec23ac:	48 8d 73 40          	lea    rsi,[rbx+0x40]` |
| `0xec2564` | `ec2564:	41 0f b6 77 40       	movzx  esi,BYTE PTR [r15+0x40]` |
| `0xec25b7` | `ec25b7:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec27ef` | `ec27ef:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xec29a4` | `ec29a4:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xec2ff1` | `ec2ff1:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xec3008` | `ec3008:	4c 8d 63 40          	lea    r12,[rbx+0x40]` |
| `0xec31fb` | `ec31fb:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xec32ba` | `ec32ba:	4d 8d 6f 40          	lea    r13,[r15+0x40]` |
| `0xec36a0` | `ec36a0:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xec36c2` | `ec36c2:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xec36e6` | `ec36e6:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xec395d` | `ec395d:	c6 44 24 40 01       	mov    BYTE PTR [rsp+0x40],0x1` |
| `0xec3fdf` | `ec3fdf:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec4080` | `ec4080:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xec4304` | `ec4304:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xec496e` | `ec496e:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]` |
| `0xec4972` | `ec4972:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax` |
| `0xec4a61` | `ec4a61:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xec4af2` | `ec4af2:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xec4b2d` | `ec4b2d:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xec5144` | `ec5144:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xec51da` | `ec51da:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]` |
| `0xec526a` | `ec526a:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xec52bf` | `ec52bf:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]` |
| `0xec52ef` | `ec52ef:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12` |
| `0xec5358` | `ec5358:	41 0f 10 47 40       	movups xmm0,XMMWORD PTR [r15+0x40]` |
| `0xec5360` | `ec5360:	41 0f 11 4f 40       	movups XMMWORD PTR [r15+0x40],xmm1` |
| `0xec53aa` | `ec53aa:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xec5450` | `ec5450:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec54d9` | `ec54d9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec5914` | `ec5914:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx` |
| `0xec5bfd` | `ec5bfd:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]` |
| `0xec5c57` | `ec5c57:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec5ccc` | `ec5ccc:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec5fc9` | `ec5fc9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xec6595` | `ec6595:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xec65a8` | `ec65a8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xec65b0` | `ec65b0:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax` |
| `0xec65e1` | `ec65e1:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0` |
| `0xec6931` | `ec6931:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xec6999` | `ec6999:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xec69c6` | `ec69c6:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xec6af3` | `ec6af3:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0` |
| `0xec6b3c` | `ec6b3c:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15` |
| `0xec70fa` | `ec70fa:	88 4f 40             	mov    BYTE PTR [rdi+0x40],cl` |
| `0xec7137` | `ec7137:	48 8d 7b 40          	lea    rdi,[rbx+0x40]` |
| `0xec781a` | `ec781a:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0` |
| `0xec782b` | `ec782b:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xec783f` | `ec783f:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0` |
| `0xec7e09` | `ec7e09:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec7e6e` | `ec7e6e:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec7f4e` | `ec7f4e:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec7fce` | `ec7fce:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]` |
| `0xec7ff1` | `ec7ff1:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]` |
| `0xec8038` | `ec8038:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec80d7` | `ec80d7:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec8353` | `ec8353:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec8405` | `ec8405:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]` |
| `0xec842b` | `ec842b:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]` |
| `0xec8438` | `ec8438:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec852b` | `ec852b:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]` |
| `0xec87cb` | `ec87cb:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec8878` | `ec8878:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec8908` | `ec8908:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec89d6` | `ec89d6:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xec8a82` | `ec8a82:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xec8ac1` | `ec8ac1:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xec9419` | `ec9419:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec9459` | `ec9459:	4c 8b 64 24 40       	mov    r12,QWORD PTR [rsp+0x40]` |
| `0xec94ab` | `ec94ab:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xec981b` | `ec981b:	48 8b 77 40          	mov    rsi,QWORD PTR [rdi+0x40]` |
| `0xec9cc9` | `ec9cc9:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xecabf9` | `ecabf9:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]` |
| `0xecae37` | `ecae37:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xecb850` | `ecb850:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0` |
| `0xecbc53` | `ecbc53:	83 60 40 00          	and    DWORD PTR [rax+0x40],0x0` |
| `0xecbc82` | `ecbc82:	48 8b 77 40          	mov    rsi,QWORD PTR [rdi+0x40]` |
| `0xecbd54` | `ecbd54:	48 8b 73 40          	mov    rsi,QWORD PTR [rbx+0x40]` |
| `0xecbe37` | `ecbe37:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xecbe5d` | `ecbe5d:	48 8d 4b 40          	lea    rcx,[rbx+0x40]` |
| `0xecbfc1` | `ecbfc1:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xecbfd6` | `ecbfd6:	0f 29 54 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm2` |
| `0xecc016` | `ecc016:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xecc181` | `ecc181:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xecc1c4` | `ecc1c4:	48 03 4b 40          	add    rcx,QWORD PTR [rbx+0x40]` |
| `0xecc1e5` | `ecc1e5:	48 ff 43 40          	inc    QWORD PTR [rbx+0x40]` |
| `0xecc223` | `ecc223:	4c 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],r13` |
| `0xecc241` | `ecc241:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xecc567` | `ecc567:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]` |
| `0xecc56c` | `ecc56c:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax` |
| `0xecc6e7` | `ecc6e7:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xecc70f` | `ecc70f:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xecc739` | `ecc739:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeccdd1` | `eccdd1:	41 0f b6 46 40       	movzx  eax,BYTE PTR [r14+0x40]` |
| `0xecd1fe` | `ecd1fe:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0` |
| `0xecd27a` | `ecd27a:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xecd31f` | `ecd31f:	49 8d 7f 40          	lea    rdi,[r15+0x40]` |
| `0xecd5f3` | `ecd5f3:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xecd656` | `ecd656:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xecd67f` | `ecd67f:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xecd7e3` | `ecd7e3:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xecd864` | `ecd864:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xecd86c` | `ecd86c:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xecd8a9` | `ecd8a9:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xecd8c4` | `ecd8c4:	0f 10 40 40          	movups xmm0,XMMWORD PTR [rax+0x40]` |
| `0xecd8c8` | `ecd8c8:	41 0f 29 47 40       	movaps XMMWORD PTR [r15+0x40],xmm0` |
| `0xecd90f` | `ecd90f:	41 0f 29 47 40       	movaps XMMWORD PTR [r15+0x40],xmm0` |
| `0xecd914` | `ecd914:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]` |
| `0xecd9fc` | `ecd9fc:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xecda1b` | `ecda1b:	41 0f 29 47 40       	movaps XMMWORD PTR [r15+0x40],xmm0` |
| `0xecdabc` | `ecdabc:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]` |
| `0xecdb2a` | `ecdb2a:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]` |
| `0xecdba7` | `ecdba7:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xecdbb4` | `ecdbb4:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xecdbd8` | `ecdbd8:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xecdc00` | `ecdc00:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xecdc12` | `ecdc12:	4c 8b 6c 24 40       	mov    r13,QWORD PTR [rsp+0x40]` |
| `0xecdc7b` | `ecdc7b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xecdc8c` | `ecdc8c:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]` |
| `0xecdcab` | `ecdcab:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xecdcd3` | `ecdcd3:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xecdd74` | `ecdd74:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xecde82` | `ecde82:	48 8d 7b 40          	lea    rdi,[rbx+0x40]` |
| `0xecdf5d` | `ecdf5d:	48 8d 7b 40          	lea    rdi,[rbx+0x40]` |
| `0xece14c` | `ece14c:	4d 8d 4e 40          	lea    r9,[r14+0x40]` |
| `0xece85a` | `ece85a:	48 83 a5 40 01 00 00 	and    QWORD PTR [rbp+0x140],0x0` |
| `0xece974` | `ece974:	48 83 a5 40 01 00 00 	and    QWORD PTR [rbp+0x140],0x0` |
| `0xecea8f` | `ecea8f:	49 83 a5 40 01 00 00 	and    QWORD PTR [r13+0x140],0x0` |
| `0xecebd4` | `ecebd4:	49 83 a7 40 01 00 00 	and    QWORD PTR [r15+0x140],0x0` |
| `0xecee60` | `ecee60:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |
| `0xecf6ec` | `ecf6ec:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xecf7f4` | `ecf7f4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xecfe66` | `ecfe66:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]` |
| `0xecff01` | `ecff01:	48 8d 7b 40          	lea    rdi,[rbx+0x40]` |
| `0xed01fe` | `ed01fe:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xed053e` | `ed053e:	48 8d 7b 40          	lea    rdi,[rbx+0x40]` |
| `0xed0dad` | `ed0dad:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xed0de3` | `ed0de3:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xed0f15` | `ed0f15:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xed1008` | `ed1008:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xed1077` | `ed1077:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xed16ea` | `ed16ea:	66 0f 29 42 40       	movapd XMMWORD PTR [rdx+0x40],xmm0` |
| `0xed1a01` | `ed1a01:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xed1da9` | `ed1da9:	88 54 24 40          	mov    BYTE PTR [rsp+0x40],dl` |
| `0xed2035` | `ed2035:	80 7c 24 40 00       	cmp    BYTE PTR [rsp+0x40],0x0` |
| `0xed2223` | `ed2223:	48 8b bc 24 40 01 00 	mov    rdi,QWORD PTR [rsp+0x140]` |
| `0xed2235` | `ed2235:	4c 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],r13` |
| `0xed22c2` | `ed22c2:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xed31be` | `ed31be:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed31d8` | `ed31d8:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3276` | `ed3276:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3324` | `ed3324:	0f 29 87 40 01 00 00 	movaps XMMWORD PTR [rdi+0x140],xmm0` |
| `0xed3547` | `ed3547:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]` |
| `0xed3623` | `ed3623:	4c 8d b4 24 40 01 00 	lea    r14,[rsp+0x140]` |
| `0xed37f3` | `ed37f3:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3825` | `ed3825:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]` |
| `0xed3893` | `ed3893:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed38bb` | `ed38bb:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]` |
| `0xed391f` | `ed391f:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3947` | `ed3947:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]` |
| `0xed39ab` | `ed39ab:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed39d3` | `ed39d3:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]` |
| `0xed3a37` | `ed3a37:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3a5f` | `ed3a5f:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]` |
| `0xed3ac3` | `ed3ac3:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3aeb` | `ed3aeb:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]` |
| `0xed3b4f` | `ed3b4f:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3b7b` | `ed3b7b:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]` |
| `0xed3c02` | `ed3c02:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3c1a` | `ed3c1a:	48 8b b4 24 40 01 00 	mov    rsi,QWORD PTR [rsp+0x140]` |
| `0xed3c32` | `ed3c32:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3e54` | `ed3e54:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3e81` | `ed3e81:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3ea9` | `ed3ea9:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3ec0` | `ed3ec0:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]` |
| `0xed3f94` | `ed3f94:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xed3fc4` | `ed3fc4:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xed401a` | `ed401a:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xed4034` | `ed4034:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xed4126` | `ed4126:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed41f9` | `ed41f9:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xed4244` | `ed4244:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed4306` | `ed4306:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed4396` | `ed4396:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xed447e` | `ed447e:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xed44ae` | `ed44ae:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xed4504` | `ed4504:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xed451e` | `ed451e:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xed4610` | `ed4610:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed46e3` | `ed46e3:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xed472e` | `ed472e:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed47f0` | `ed47f0:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed4844` | `ed4844:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xed4874` | `ed4874:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xed48ca` | `ed48ca:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xed48e4` | `ed48e4:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xed49d6` | `ed49d6:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed4aa9` | `ed4aa9:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xed4af4` | `ed4af4:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed4bb6` | `ed4bb6:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed4c0a` | `ed4c0a:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xed4c3a` | `ed4c3a:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xed4c90` | `ed4c90:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xed4caa` | `ed4caa:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xed4d9c` | `ed4d9c:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed4e6f` | `ed4e6f:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xed4eba` | `ed4eba:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed4f7c` | `ed4f7c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed4fd0` | `ed4fd0:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xed5000` | `ed5000:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xed5056` | `ed5056:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xed5070` | `ed5070:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xed5162` | `ed5162:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed5235` | `ed5235:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xed5280` | `ed5280:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed5342` | `ed5342:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed5396` | `ed5396:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xed53c6` | `ed53c6:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xed541c` | `ed541c:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xed5436` | `ed5436:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xed5528` | `ed5528:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed55fb` | `ed55fb:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xed5646` | `ed5646:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed5708` | `ed5708:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed575c` | `ed575c:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xed578c` | `ed578c:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xed57e2` | `ed57e2:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xed57fc` | `ed57fc:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xed58ee` | `ed58ee:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed59c1` | `ed59c1:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xed5a0c` | `ed5a0c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed5ace` | `ed5ace:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed5b22` | `ed5b22:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xed5b52` | `ed5b52:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xed5ba8` | `ed5ba8:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xed5bc2` | `ed5bc2:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xed5cb4` | `ed5cb4:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed5d87` | `ed5d87:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xed5dd2` | `ed5dd2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed5e94` | `ed5e94:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed6037` | `ed6037:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]` |
| `0xed61dd` | `ed61dd:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xed6239` | `ed6239:	48 39 43 40          	cmp    QWORD PTR [rbx+0x40],rax` |
| `0xed6979` | `ed6979:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]` |
| `0xed697d` | `ed697d:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax` |
| `0xed69ed` | `ed69ed:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]` |
| `0xed69f2` | `ed69f2:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax` |
| `0xed6b0c` | `ed6b0c:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]` |
| `0xed6b10` | `ed6b10:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax` |
| `0xed6ec7` | `ed6ec7:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xed6ef0` | `ed6ef0:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax` |
| `0xed6f1c` | `ed6f1c:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xed70dd` | `ed70dd:	49 89 45 40          	mov    QWORD PTR [r13+0x40],rax` |
| `0xed74b6` | `ed74b6:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]` |
| `0xed74c9` | `ed74c9:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax` |
| `0xed7504` | `ed7504:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]` |
| `0xed780a` | `ed780a:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx` |
| `0xed7c13` | `ed7c13:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]` |
| `0xed7c23` | `ed7c23:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]` |
| `0xed7e98` | `ed7e98:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xed7ef6` | `ed7ef6:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xed8629` | `ed8629:	49 8d 7e 40          	lea    rdi,[r14+0x40]` |
| `0xed8755` | `ed8755:	0f 10 4e 40          	movups xmm1,XMMWORD PTR [rsi+0x40]` |
| `0xed8759` | `ed8759:	0f 11 4f 40          	movups XMMWORD PTR [rdi+0x40],xmm1` |
| `0xed875d` | `ed875d:	0f 11 46 40          	movups XMMWORD PTR [rsi+0x40],xmm0` |
| `0xed89a1` | `ed89a1:	66 0f d6 44 24 40    	movq   QWORD PTR [rsp+0x40],xmm0` |
| `0xed8a9c` | `ed8a9c:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xed8aa1` | `ed8aa1:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xed8aca` | `ed8aca:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed8ae0` | `ed8ae0:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed8aed` | `ed8aed:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xed93b1` | `ed93b1:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed94aa` | `ed94aa:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xed9505` | `ed9505:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xed9514` | `ed9514:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]` |
| `0xed9528` | `ed9528:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xed9596` | `ed9596:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed960f` | `ed960f:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed9687` | `ed9687:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xed99c5` | `ed99c5:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed9a31` | `ed9a31:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xed9feb` | `ed9feb:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xeda040` | `eda040:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xedab46` | `edab46:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xedaba1` | `edaba1:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xedb714` | `edb714:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0` |
| `0xedb871` | `edb871:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax` |
| `0xedb883` | `edb883:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xedb8db` | `edb8db:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xedbdd6` | `edbdd6:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xedbdfb` | `edbdfb:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xedbe41` | `edbe41:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xedc069` | `edc069:	48 8d 5f 40          	lea    rbx,[rdi+0x40]` |
| `0xedc10f` | `edc10f:	0f 11 47 40          	movups XMMWORD PTR [rdi+0x40],xmm0` |
| `0xedc118` | `edc118:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]` |
| `0xedc11c` | `edc11c:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax` |
| `0xedc135` | `edc135:	0f 11 46 40          	movups XMMWORD PTR [rsi+0x40],xmm0` |
| `0xedc500` | `edc500:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xedc530` | `edc530:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xedc586` | `edc586:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]` |
| `0xedc5a0` | `edc5a0:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]` |
| `0xedc692` | `edc692:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xedc765` | `edc765:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]` |
| `0xedc7b0` | `edc7b0:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xedc872` | `edc872:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xedcbe3` | `edcbe3:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xedcc3b` | `edcc3b:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]` |
| `0xeddb75` | `eddb75:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xeddbed` | `eddbed:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xedddbb` | `edddbb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax` |
| `0xedde55` | `edde55:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xedde8d` | `edde8d:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax` |
| `0xeddf11` | `eddf11:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xeddf67` | `eddf67:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xede00b` | `ede00b:	0f 29 42 40          	movaps XMMWORD PTR [rdx+0x40],xmm0` |
| `0xede19c` | `ede19c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xede219` | `ede219:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xedea24` | `edea24:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax` |
| `0xedec61` | `edec61:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xedecef` | `edecef:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xeded59` | `eded59:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]` |
| `0xeded8c` | `eded8c:	0f 10 44 24 40       	movups xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xededfd` | `ededfd:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xedee2b` | `edee2b:	80 7c 24 40 00       	cmp    BYTE PTR [rsp+0x40],0x0` |
| `0xedf04a` | `edf04a:	48 89 4b 40          	mov    QWORD PTR [rbx+0x40],rcx` |
| `0xedf1bc` | `edf1bc:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax` |
| `0xedf771` | `edf771:	0f 11 42 40          	movups XMMWORD PTR [rdx+0x40],xmm0` |
| `0xedf837` | `edf837:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0` |
| `0xedf940` | `edf940:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xedf9bd` | `edf9bd:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xedfb16` | `edfb16:	0f 11 42 40          	movups XMMWORD PTR [rdx+0x40],xmm0` |
| `0xedfb7f` | `edfb7f:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0` |
| `0xedfd34` | `edfd34:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax` |
| `0xedfd6b` | `edfd6b:	4d 8d 6f 40          	lea    r13,[r15+0x40]` |
| `0xedfd6f` | `edfd6f:	49 8d 74 24 40       	lea    rsi,[r12+0x40]` |
| `0xee001b` | `ee001b:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |
| `0xee018f` | `ee018f:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xee0251` | `ee0251:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xee03bb` | `ee03bb:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]` |
| `0xee0541` | `ee0541:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xee05e2` | `ee05e2:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xee074c` | `ee074c:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xee078f` | `ee078f:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xee08b1` | `ee08b1:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xee0909` | `ee0909:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xee093b` | `ee093b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xee0b33` | `ee0b33:	4c 8b 76 40          	mov    r14,QWORD PTR [rsi+0x40]` |
| `0xee0e94` | `ee0e94:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0xee0f42` | `ee0f42:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0xee0f67` | `ee0f67:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0xee0faf` | `ee0faf:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0xee0fef` | `ee0fef:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0xee1043` | `ee1043:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0xee1066` | `ee1066:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0xee10ab` | `ee10ab:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]` |
| `0xee138e` | `ee138e:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx` |
| `0xee13c9` | `ee13c9:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xee1494` | `ee1494:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xee1518` | `ee1518:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1545` | `ee1545:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee157c` | `ee157c:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xee15db` | `ee15db:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xee1614` | `ee1614:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1633` | `ee1633:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1680` | `ee1680:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xee16bf` | `ee16bf:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xee16de` | `ee16de:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xee1aed` | `ee1aed:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1b1a` | `ee1b1a:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1b75` | `ee1b75:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1bc1` | `ee1bc1:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1c0b` | `ee1c0b:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1c56` | `ee1c56:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1c81` | `ee1c81:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1ccb` | `ee1ccb:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1d2f` | `ee1d2f:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1d57` | `ee1d57:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1d98` | `ee1d98:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1dc9` | `ee1dc9:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xee1f7b` | `ee1f7b:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1fa6` | `ee1fa6:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee1fd1` | `ee1fd1:	4d 8b 65 40          	mov    r12,QWORD PTR [r13+0x40]` |
| `0xee2061` | `ee2061:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee208e` | `ee208e:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee20cf` | `ee20cf:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee2138` | `ee2138:	48 8b 78 40          	mov    rdi,QWORD PTR [rax+0x40]` |
| `0xee2ba9` | `ee2ba9:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee2c19` | `ee2c19:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee2c41` | `ee2c41:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee2c6a` | `ee2c6a:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee2cf2` | `ee2cf2:	48 8b 5c 24 40       	mov    rbx,QWORD PTR [rsp+0x40]` |
| `0xee2d22` | `ee2d22:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee2d45` | `ee2d45:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee2d89` | `ee2d89:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee2e8b` | `ee2e8b:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xee2e90` | `ee2e90:	49 8b 7d 40          	mov    rdi,QWORD PTR [r13+0x40]` |
| `0xee3165` | `ee3165:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xee3186` | `ee3186:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xee31a5` | `ee31a5:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| ... | truncated 4840 more |

## Focused `fd381a` neighborhood calls/field accesses

| addr | instruction |
|---:|---|
| `0xfcf010` | `fcf010:	48 89 df             	mov    rdi,rbx` |
| `0xfcf013` | `fcf013:	4c 89 fe             	mov    rsi,r15` |
| `0xfcf016` | `fcf016:	e8 01 a8 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfcf01b` | `fcf01b:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xfcf01f` | `fcf01f:	e8 62 f4 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf024` | `fcf024:	4c 89 f7             	mov    rdi,r14` |
| `0xfcf027` | `fcf027:	e8 86 f4 ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xfcf02c` | `fcf02c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]` |
| `0xfcf031` | `fcf031:	e8 50 f4 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf036` | `fcf036:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]` |
| `0xfcf03b` | `fcf03b:	e8 46 f4 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf040` | `fcf040:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfcf065` | `fcf065:	e8 46 0a 82 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfcf06a` | `fcf06a:	48 89 c7             	mov    rdi,rax` |
| `0xfcf06d` | `fcf06d:	e8 33 aa aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfcf072` | `fcf072:	48 89 c3             	mov    rbx,rax` |
| `0xfcf075` | `fcf075:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]` |
| `0xfcf07a` | `fcf07a:	e8 1f f7 ac ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>` |
| `0xfcf081` | `fcf081:	48 89 c3             	mov    rbx,rax` |
| `0xfcf084` | `fcf084:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xfcf089` | `fcf089:	e8 ee ce e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfcf08e` | `fcf08e:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]` |
| `0xfcf093` | `fcf093:	e8 ee f3 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf098` | `fcf098:	48 89 df             	mov    rdi,rbx` |
| `0xfcf09b` | `fcf09b:	e8 05 aa aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfcf0ab` | `fcf0ab:	48 89 fb             	mov    rbx,rdi` |
| `0xfcf0b2` | `fcf0b2:	e8 55 b2 ff ff       	call   fca30c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191722>` |
| `0xfcf0b7` | `fcf0b7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfcf0d3` | `fcf0d3:	48 89 fd             	mov    rbp,rdi` |
| `0xfcf0d6` | `fcf0d6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfcf0df` | `fcf0df:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax` |
| `0xfcf0e7` | `fcf0e7:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]` |
| `0xfcf0eb` | `fcf0eb:	0f 10 0e             	movups xmm1,XMMWORD PTR [rsi]` |
| `0xfcf0f1` | `fcf0f1:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0` |
| `0xfcf0f9` | `fcf0f9:	0f 29 4c 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm1` |
| `0xfcf0fe` | `fcf0fe:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xfcf109` | `fcf109:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0` |
| `0xfcf115` | `fcf115:	49 89 d6             	mov    r14,rdx` |
| `0xfcf120` | `fcf120:	e8 03 62 f5 ff       	call   f25328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec73e>` |
| `0xfcf125` | `fcf125:	48 8b 9c 24 80 00 00 	mov    rbx,QWORD PTR [rsp+0x80]` |
| `0xfcf131` | `fcf131:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]` |
| `0xfcf135` | `fcf135:	e8 fc f9 b0 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>` |
| `0xfcf13a` | `fcf13a:	4c 8b bc 24 88 00 00 	mov    r15,QWORD PTR [rsp+0x88]` |
| `0xfcf14c` | `fcf14c:	4d 8b 26             	mov    r12,QWORD PTR [r14]` |
| `0xfcf156` | `fcf156:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0` |
| `0xfcf15f` | `fcf15f:	4d 8b 26             	mov    r12,QWORD PTR [r14]` |
| `0xfcf167` | `fcf167:	49 89 5d f0          	mov    QWORD PTR [r13-0x10],rbx` |
| `0xfcf16b` | `fcf16b:	4d 89 7d f8          	mov    QWORD PTR [r13-0x8],r15` |
| `0xfcf174` | `fcf174:	4c 89 ef             	mov    rdi,r13` |
| `0xfcf177` | `fcf177:	e8 3a 7b f5 ff       	call   f26cb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee0cc>` |
| `0xfcf17f` | `fcf17f:	e8 7c ed 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfcf184` | `fcf184:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp` |
| `0xfcf189` | `fcf189:	48 8b 4c 24 58       	mov    rcx,QWORD PTR [rsp+0x58]` |
| `0xfcf18e` | `fcf18e:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]` |
| `0xfcf193` | `fcf193:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0` |
| `0xfcf1a6` | `fcf1a6:	0f 28 45 10          	movaps xmm0,XMMWORD PTR [rbp+0x10]` |
| `0xfcf1aa` | `fcf1aa:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0` |
| `0xfcf1ae` | `fcf1ae:	48 8b 4d 20          	mov    rcx,QWORD PTR [rbp+0x20]` |
| `0xfcf1b2` | `fcf1b2:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx` |
| `0xfcf1b9` | `fcf1b9:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0` |
| `0xfcf1ca` | `fcf1ca:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0xfcf1d4` | `fcf1d4:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx` |
| `0xfcf1d8` | `fcf1d8:	4c 89 e7             	mov    rdi,r12` |
| `0xfcf1db` | `fcf1db:	48 89 c6             	mov    rsi,rax` |
| `0xfcf1de` | `fcf1de:	e8 17 68 f5 ff       	call   f259fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xece10>` |
| `0xfcf1e3` | `fcf1e3:	48 89 ef             	mov    rdi,rbp` |
| `0xfcf1e6` | `fcf1e6:	e8 5b 7c f5 ff       	call   f26e46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee25c>` |
| `0xfcf1ee` | `fcf1ee:	0f 29 45 00          	movaps XMMWORD PTR [rbp+0x0],xmm0` |
| `0xfcf1f7` | `fcf1f7:	4c 89 f7             	mov    rdi,r14` |
| `0xfcf1fa` | `fcf1fa:	4c 89 e6             	mov    rsi,r12` |
| `0xfcf1fd` | `fcf1fd:	e8 1a a6 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfcf202` | `fcf202:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]` |
| `0xfcf207` | `fcf207:	e8 7a f2 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf20c` | `fcf20c:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0xfcf211` | `fcf211:	48 89 18             	mov    QWORD PTR [rax],rbx` |
| `0xfcf214` | `fcf214:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15` |
| `0xfcf222` | `fcf222:	4c 89 ff             	mov    rdi,r15` |
| `0xfcf225` | `fcf225:	e8 88 f2 ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xfcf22a` | `fcf22a:	4c 89 ff             	mov    rdi,r15` |
| `0xfcf22d` | `fcf22d:	e8 54 f2 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf237` | `fcf237:	e8 40 cd e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfcf241` | `fcf241:	e8 36 cd e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfcf246` | `fcf246:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfcf26b` | `fcf26b:	e8 40 08 82 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfcf272` | `fcf272:	48 89 c7             	mov    rdi,rax` |
| `0xfcf275` | `fcf275:	e8 2b a8 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfcf285` | `fcf285:	89 d3                	mov    ebx,edx` |
| `0xfcf287` | `fcf287:	49 89 f6             	mov    r14,rsi` |
| `0xfcf28a` | `fcf28a:	49 89 fc             	mov    r12,rdi` |
| `0xfcf28d` | `fcf28d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfcf296` | `fcf296:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0xfcf2a4` | `fcf2a4:	4c 89 ff             	mov    rdi,r15` |
| `0xfcf2a7` | `fcf2a7:	e8 84 c0 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfcf2ac` | `fcf2ac:	4d 8b 3f             	mov    r15,QWORD PTR [r15]` |
| `0xfcf2bd` | `fcf2bd:	4c 89 e6             	mov    rsi,r12` |
| `0xfcf2c0` | `fcf2c0:	e8 f1 79 f5 ff       	call   f26cb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee0cc>` |
| `0xfcf2c9` | `fcf2c9:	49 8b 76 20          	mov    rsi,QWORD PTR [r14+0x20]` |
| `0xfcf2cd` | `fcf2cd:	48 8b 54 24 48       	mov    rdx,QWORD PTR [rsp+0x48]` |
| `0xfcf2d2` | `fcf2d2:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]` |
| `0xfcf2d7` | `fcf2d7:	e8 82 7b f5 ff       	call   f26e5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee274>` |
| `0xfcf2dc` | `fcf2dc:	49 89 e4             	mov    r12,rsp` |
| `0xfcf2df` | `fcf2df:	4c 89 e7             	mov    rdi,r12` |
| `0xfcf2e2` | `fcf2e2:	4c 89 f6             	mov    rsi,r14` |
| `0xfcf2e5` | `fcf2e5:	e8 9a 68 f5 ff       	call   f25b84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf9a>` |
| `0xfcf2ef` | `fcf2ef:	e8 88 cc e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfcf2f4` | `fcf2f4:	0f b6 d3             	movzx  edx,bl` |
| `0xfcf2f7` | `fcf2f7:	4c 89 ff             	mov    rdi,r15` |
| `0xfcf2fa` | `fcf2fa:	4c 89 e6             	mov    rsi,r12` |
| `0xfcf2fd` | `fcf2fd:	e8 d6 68 f5 ff       	call   f25bd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecfee>` |
| `0xfcf302` | `fcf302:	4c 89 e7             	mov    rdi,r12` |
| `0xfcf305` | `fcf305:	e8 08 60 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>` |
| `0xfcf30a` | `fcf30a:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xfcf30f` | `fcf30f:	e8 72 f1 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf314` | `fcf314:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfcf330` | `fcf330:	e8 7b 07 82 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfcf335` | `fcf335:	48 89 c7             	mov    rdi,rax` |
| `0xfcf338` | `fcf338:	e8 68 a7 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfcf33d` | `fcf33d:	48 89 c3             	mov    rbx,rax` |
| `0xfcf340` | `fcf340:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xfcf345` | `fcf345:	e8 3c f1 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf34a` | `fcf34a:	48 89 df             	mov    rdi,rbx` |
| `0xfcf34d` | `fcf34d:	e8 53 a7 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfcf353` | `fcf353:	48 89 fb             	mov    rbx,rdi` |
| `0xfcf356` | `fcf356:	e8 6c b5 69 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>` |
| `0xfcf35b` | `fcf35b:	c7 03 30 00 00 00    	mov    DWORD PTR [rbx],0x30` |
| `0xfcf368` | `fcf368:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0xfcf373` | `fcf373:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0` |
| `0xfcf377` | `fcf377:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0xfcf37b` | `fcf37b:	48 89 d8             	mov    rax,rbx` |
| `0xfcf381` | `fcf381:	48 89 fb             	mov    rbx,rdi` |
| `0xfcf384` | `fcf384:	e8 3e b5 69 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>` |
| `0xfcf389` | `fcf389:	c7 03 0b 00 00 00    	mov    DWORD PTR [rbx],0xb` |
| `0xfcf396` | `fcf396:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0xfcf3a1` | `fcf3a1:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0` |
| `0xfcf3a5` | `fcf3a5:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0xfcf3a9` | `fcf3a9:	48 89 d8             	mov    rax,rbx` |
| `0xfcf3b1` | `fcf3b1:	48 89 fb             	mov    rbx,rdi` |
| `0xfcf3b4` | `fcf3b4:	8b 2a                	mov    ebp,DWORD PTR [rdx]` |
| `0xfcf3b6` | `fcf3b6:	e8 0c b5 69 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>` |
| `0xfcf3c4` | `fcf3c4:	0f 44 c8             	cmove  ecx,eax` |
| `0xfcf3cb` | `fcf3cb:	89 0b                	mov    DWORD PTR [rbx],ecx` |
| `0xfcf3d4` | `fcf3d4:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx` |
| `0xfcf3db` | `fcf3db:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0` |
| `0xfcf3df` | `fcf3df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0xfcf3e3` | `fcf3e3:	48 89 d8             	mov    rax,rbx` |
| `0xfcf3ef` | `fcf3ef:	48 89 fb             	mov    rbx,rdi` |
| `0xfcf3f2` | `fcf3f2:	e8 d0 b4 69 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>` |
| `0xfcf3f7` | `fcf3f7:	c7 03 17 00 00 00    	mov    DWORD PTR [rbx],0x17` |
| `0xfcf404` | `fcf404:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0xfcf40f` | `fcf40f:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0` |
| `0xfcf413` | `fcf413:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0xfcf417` | `fcf417:	48 89 d8             	mov    rax,rbx` |
| `0xfcf41d` | `fcf41d:	48 89 fb             	mov    rbx,rdi` |
| `0xfcf426` | `fcf426:	8b 06                	mov    eax,DWORD PTR [rsi]` |
| `0xfcf428` | `fcf428:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0xfcf432` | `fcf432:	e8 df 9b e7 ff       	call   e49016 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1042c>` |
| `0xfcf439` | `fcf439:	48 89 df             	mov    rdi,rbx` |
| `0xfcf43c` | `fcf43c:	e8 09 90 ff ff       	call   fc844a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f860>` |
| `0xfcf441` | `fcf441:	48 89 d8             	mov    rax,rbx` |
| `0xfcf457` | `fcf457:	89 d5                	mov    ebp,edx` |
| `0xfcf459` | `fcf459:	49 89 f7             	mov    r15,rsi` |
| `0xfcf45c` | `fcf45c:	49 89 fc             	mov    r12,rdi` |
| `0xfcf45f` | `fcf45f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfcf468` | `fcf468:	48 89 84 24 70 0e 00 	mov    QWORD PTR [rsp+0xe70],rax` |
| `0xfcf479` | `fcf479:	48 89 df             	mov    rdi,rbx` |
| `0xfcf47c` | `fcf47c:	48 89 74 24 28       	mov    QWORD PTR [rsp+0x28],rsi` |
| `0xfcf481` | `fcf481:	e8 aa be ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfcf486` | `fcf486:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xfcf492` | `fcf492:	89 6c 24 0c          	mov    DWORD PTR [rsp+0xc],ebp` |
| `0xfcf4a6` | `fcf4a6:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0` |
| `0xfcf4ae` | `fcf4ae:	4c 89 f6             	mov    rsi,r14` |
| `0xfcf4b1` | `fcf4b1:	e8 66 a3 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfcf4b6` | `fcf4b6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xfcf4ba` | `fcf4ba:	e8 c7 ef ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf4bf` | `fcf4bf:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx` |
| `0xfcf4c9` | `fcf4c9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xfcf4ce` | `fcf4ce:	48 89 ee             	mov    rsi,rbp` |
| `0xfcf4d1` | `fcf4d1:	e8 6a ea 81 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xfcf4d6` | `fcf4d6:	41 80 7f 40 00       	cmp    BYTE PTR [r15+0x40],0x0` |
| `0xfcf4e1` | `fcf4e1:	4d 8b 74 24 20       	mov    r14,QWORD PTR [r12+0x20]` |
| `0xfcf4e6` | `fcf4e6:	4c 89 ff             	mov    rdi,r15` |
| `0xfcf4e9` | `fcf4e9:	e8 7e ab ff ff       	call   fca06c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191482>` |
| `0xfcf4f6` | `fcf4f6:	4c 89 fe             	mov    rsi,r15` |
| `0xfcf4f9` | `fcf4f9:	e8 56 d1 ff ff       	call   fcc654 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x193a6a>` |
| `0xfcf506` | `fcf506:	48 89 df             	mov    rdi,rbx` |
| `0xfcf509` | `fcf509:	48 89 ee             	mov    rsi,rbp` |
| `0xfcf50c` | `fcf50c:	e8 df 7d 69 00       	call   16672f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b45c>` |
| `0xfcf51d` | `fcf51d:	4c 89 f6             	mov    rsi,r14` |
| `0xfcf520` | `fcf520:	e8 35 c9 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>` |
| `0xfcf52d` | `fcf52d:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0` |
| `0xfcf548` | `fcf548:	4c 89 ff             	mov    rdi,r15` |
| `0xfcf54b` | `fcf54b:	4c 89 e2             	mov    rdx,r12` |
| `0xfcf54e` | `fcf54e:	e8 07 5b f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>` |
| `0xfcf55e` | `fcf55e:	48 89 ef             	mov    rdi,rbp` |
| `0xfcf561` | `fcf561:	4c 89 fe             	mov    rsi,r15` |
| `0xfcf564` | `fcf564:	e8 f7 86 ff ff       	call   fc7c60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f076>` |
| `0xfcf569` | `fcf569:	4c 8b 6d 00          	mov    r13,QWORD PTR [rbp+0x0]` |
| `0xfcf56d` | `fcf56d:	4c 89 ef             	mov    rdi,r13` |
| `0xfcf570` | `fcf570:	e8 4d a0 ff ff       	call   fc95c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1909d8>` |
| `0xfcf575` | `fcf575:	48 8b 84 24 e0 01 00 	mov    rax,QWORD PTR [rsp+0x1e0]` |
| `0xfcf585` | `fcf585:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0xfcf589` | `fcf589:	0f 28 84 24 d0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1d0]` |
| `0xfcf59a` | `fcf59a:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0` |
| `0xfcf5a1` | `fcf5a1:	0f 29 8c 24 d0 01 00 	movaps XMMWORD PTR [rsp+0x1d0],xmm1` |
| `0xfcf5a9` | `fcf5a9:	0f 10 84 24 e8 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1e8]` |
| `0xfcf5b1` | `fcf5b1:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0` |
| `0xfcf5b6` | `fcf5b6:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]` |
| `0xfcf5c7` | `fcf5c7:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax` |
| `0xfcf5cb` | `fcf5cb:	0f 11 8c 24 e8 01 00 	movups XMMWORD PTR [rsp+0x1e8],xmm1` |
| `0xfcf5d3` | `fcf5d3:	0f 28 84 24 00 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x200]` |
| `0xfcf5db` | `fcf5db:	41 0f 29 46 30       	movaps XMMWORD PTR [r14+0x30],xmm0` |
| `0xfcf5e3` | `fcf5e3:	0f 29 84 24 00 02 00 	movaps XMMWORD PTR [rsp+0x200],xmm0` |
| `0xfcf5eb` | `fcf5eb:	41 83 66 40 00       	and    DWORD PTR [r14+0x40],0x0` |
| `0xfcf5f0` | `fcf5f0:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0` |
| `0xfcf5f5` | `fcf5f5:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0` |
| `0xfcf5fa` | `fcf5fa:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0` |
| `0xfcf5ff` | `fcf5ff:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0` |
| `0xfcf604` | `fcf604:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0` |
| `0xfcf60c` | `fcf60c:	41 0f 11 86 98 00 00 	movups XMMWORD PTR [r14+0x98],xmm0` |
| `0xfcf614` | `fcf614:	41 0f 11 86 a1 00 00 	movups XMMWORD PTR [r14+0xa1],xmm0` |
| `0xfcf623` | `fcf623:	4c 89 f6             	mov    rsi,r14` |
| `0xfcf626` | `fcf626:	e8 31 a2 ff ff       	call   fc985c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190c72>` |
| `0xfcf62b` | `fcf62b:	4c 89 f7             	mov    rdi,r14` |
| `0xfcf62e` | `fcf62e:	e8 a3 4e ff ff       	call   fc44d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18b8ec>` |
| `0xfcf633` | `fcf633:	4c 89 ef             	mov    rdi,r13` |
| `0xfcf636` | `fcf636:	48 89 de             	mov    rsi,rbx` |
| `0xfcf639` | `fcf639:	e8 0a db ff ff       	call   fcd148 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19455e>` |
| `0xfcf63e` | `fcf63e:	41 0f 10 47 20       	movups xmm0,XMMWORD PTR [r15+0x20]` |
| `0xfcf64b` | `fcf64b:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0` |
| `0xfcf64e` | `fcf64e:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]` |
| `0xfcf652` | `fcf652:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0xfcf659` | `fcf659:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0` |
| `0xfcf663` | `fcf663:	48 8b 6d 08          	mov    rbp,QWORD PTR [rbp+0x8]` |
| `0xfcf66f` | `fcf66f:	4c 89 f7             	mov    rdi,r14` |
| `0xfcf672` | `fcf672:	4c 89 ee             	mov    rsi,r13` |
| `0xfcf675` | `fcf675:	48 89 ea             	mov    rdx,rbp` |
| `0xfcf678` | `fcf678:	48 89 d9             	mov    rcx,rbx` |
| `0xfcf67b` | `fcf67b:	e8 84 5b f5 ff       	call   f25204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec61a>` |
| `0xfcf680` | `fcf680:	48 89 df             	mov    rdi,rbx` |
| `0xfcf683` | `fcf683:	e8 f4 c8 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfcf688` | `fcf688:	48 89 ef             	mov    rdi,rbp` |
| `0xfcf68b` | `fcf68b:	e8 f6 ed ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf698` | `fcf698:	4c 89 ef             	mov    rdi,r13` |
| `0xfcf69b` | `fcf69b:	4c 89 f6             	mov    rsi,r14` |
| `0xfcf69e` | `fcf69e:	e8 1d 85 ff ff       	call   fc7bc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18efd6>` |
| `0xfcf6ab` | `fcf6ab:	4c 89 ee             	mov    rsi,r13` |
| `0xfcf6ae` | `fcf6ae:	e8 07 64 f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>` |
| `0xfcf6b3` | `fcf6b3:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xfcf6b7` | `fcf6b7:	e8 ca ed ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf6bc` | `fcf6bc:	4c 89 f7             	mov    rdi,r14` |
| `0xfcf6bf` | `fcf6bf:	e8 4e 5c f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>` |
| `0xfcf6c4` | `fcf6c4:	4c 89 ff             	mov    rdi,r15` |
| `0xfcf6c7` | `fcf6c7:	e8 46 5c f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>` |
| `0xfcf6cc` | `fcf6cc:	4c 89 e7             	mov    rdi,r12` |
| `0xfcf6cf` | `fcf6cf:	e8 a8 c8 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfcf6dc` | `fcf6dc:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]` |
| `0xfcf6e0` | `fcf6e0:	e8 a1 ed ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf6e5` | `fcf6e5:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]` |
| `0xfcf6ea` | `fcf6ea:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0xfcf6ee` | `fcf6ee:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0xfcf6f3` | `fcf6f3:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0` |
| `0xfcf6fb` | `fcf6fb:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xfcf716` | `fcf716:	e8 25 e8 81 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xfcf71b` | `fcf71b:	4c 8b a4 24 b0 00 00 	mov    r12,QWORD PTR [rsp+0xb0]` |
| `0xfcf726` | `fcf726:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]` |
| `0xfcf736` | `fcf736:	e8 5d 5a f4 ff       	call   f15198 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc5ae>` |
| `0xfcf73b` | `fcf73b:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]` |
| `0xfcf744` | `fcf744:	0f 28 84 24 b0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xb0]` |
| `0xfcf74c` | `fcf74c:	e8 e5 f3 b0 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>` |
| `0xfcf751` | `fcf751:	4c 8b 7c 24 68       	mov    r15,QWORD PTR [rsp+0x68]` |
| `0xfcf764` | `fcf764:	48 89 9c 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rbx` |
| `0xfcf76c` | `fcf76c:	4c 89 bc 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r15` |
| `0xfcf77e` | `fcf77e:	49 8b 74 24 20       	mov    rsi,QWORD PTR [r12+0x20]` |
| `0xfcf78f` | `fcf78f:	e8 c6 c6 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>` |
| `0xfcf79f` | `fcf79f:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0` |
| `0xfcf7b7` | `fcf7b7:	4c 89 ef             	mov    rdi,r13` |
| `0xfcf7ba` | `fcf7ba:	e8 9b 58 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>` |
| `0xfcf7c7` | `fcf7c7:	4c 89 f7             	mov    rdi,r14` |
| `0xfcf7ca` | `fcf7ca:	4c 89 ee             	mov    rsi,r13` |
| `0xfcf7cd` | `fcf7cd:	89 da                	mov    edx,ebx` |
| `0xfcf7cf` | `fcf7cf:	e8 8c 84 ff ff       	call   fc7c60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f076>` |
| `0xfcf7d4` | `fcf7d4:	4d 8b 26             	mov    r12,QWORD PTR [r14]` |
| `0xfcf7d7` | `fcf7d7:	4c 89 e7             	mov    rdi,r12` |
| `0xfcf7da` | `fcf7da:	48 89 ee             	mov    rsi,rbp` |
| `0xfcf7dd` | `fcf7dd:	89 da                	mov    edx,ebx` |
| `0xfcf7df` | `fcf7df:	e8 4c da ff ff       	call   fcd230 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194646>` |
| `0xfcf7e4` | `fcf7e4:	41 0f 10 45 20       	movups xmm0,XMMWORD PTR [r13+0x20]` |
| `0xfcf7f1` | `fcf7f1:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0` |
| `0xfcf7f4` | `fcf7f4:	49 8b 45 30          	mov    rax,QWORD PTR [r13+0x30]` |
| `0xfcf7f8` | `fcf7f8:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0xfcf7ff` | `fcf7ff:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0` |
| `0xfcf809` | `fcf809:	49 8b 6e 08          	mov    rbp,QWORD PTR [r14+0x8]` |
| `0xfcf815` | `fcf815:	4c 89 f7             	mov    rdi,r14` |
| `0xfcf818` | `fcf818:	4c 89 e6             	mov    rsi,r12` |
| `0xfcf81b` | `fcf81b:	48 89 ea             	mov    rdx,rbp` |
| `0xfcf81e` | `fcf81e:	48 89 d9             	mov    rcx,rbx` |
| `0xfcf821` | `fcf821:	e8 de 59 f5 ff       	call   f25204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec61a>` |
| `0xfcf826` | `fcf826:	48 89 df             	mov    rdi,rbx` |
| `0xfcf829` | `fcf829:	e8 4e c7 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfcf82e` | `fcf82e:	48 89 ef             	mov    rdi,rbp` |
| `0xfcf831` | `fcf831:	e8 50 ec ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf83e` | `fcf83e:	48 89 df             	mov    rdi,rbx` |
| `0xfcf841` | `fcf841:	4c 89 f6             	mov    rsi,r14` |
| `0xfcf844` | `fcf844:	e8 77 83 ff ff       	call   fc7bc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18efd6>` |
| `0xfcf84e` | `fcf84e:	48 89 ef             	mov    rdi,rbp` |
| `0xfcf851` | `fcf851:	48 89 de             	mov    rsi,rbx` |
| `0xfcf854` | `fcf854:	e8 61 62 f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>` |
| `0xfcf859` | `fcf859:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfcf85d` | `fcf85d:	e8 24 ec ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf862` | `fcf862:	4c 89 f7             	mov    rdi,r14` |
| `0xfcf865` | `fcf865:	e8 a8 5a f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>` |
| `0xfcf86a` | `fcf86a:	4c 89 ef             	mov    rdi,r13` |
| `0xfcf86d` | `fcf86d:	e8 a0 5a f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>` |
| `0xfcf87a` | `fcf87a:	e8 fd c6 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfcf887` | `fcf887:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]` |
| `0xfcf88b` | `fcf88b:	e8 f6 eb ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf898` | `fcf898:	48 89 df             	mov    rdi,rbx` |
| `0xfcf89b` | `fcf89b:	4c 89 fe             	mov    rsi,r15` |
| `0xfcf89e` | `fcf89e:	e8 dd 9e ff ff       	call   fc9780 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190b96>` |
| `0xfcf8ab` | `fcf8ab:	48 89 de             	mov    rsi,rbx` |
| `0xfcf8ae` | `fcf8ae:	e8 cd 9e ff ff       	call   fc9780 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190b96>` |
| `0xfcf8b3` | `fcf8b3:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]` |
| `0xfcf8c8` | `fcf8c8:	e8 5b 5a f5 ff       	call   f25328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec73e>` |
| `0xfcf8cd` | `fcf8cd:	48 8b ac 24 90 00 00 	mov    rbp,QWORD PTR [rsp+0x90]` |
| `0xfcf8d9` | `fcf8d9:	0f 28 44 24 60       	movaps xmm0,XMMWORD PTR [rsp+0x60]` |
| `0xfcf8de` | `fcf8de:	e8 53 f2 b0 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>` |
| `0xfcf8e3` | `fcf8e3:	4c 8b bc 24 98 00 00 	mov    r15,QWORD PTR [rsp+0x98]` |
| `0xfcf8f9` | `fcf8f9:	48 89 ac 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rbp` |
| `0xfcf901` | `fcf901:	4c 89 bc 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],r15` |
| `0xfcf916` | `fcf916:	0f 29 84 24 10 01 00 	movaps XMMWORD PTR [rsp+0x110],xmm0` |
| `0xfcf923` | `fcf923:	48 89 9c 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rbx` |
| `0xfcf944` | `fcf944:	4c 89 ef             	mov    rdi,r13` |
| `0xfcf947` | `fcf947:	e8 f4 e5 81 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xfcf94f` | `fcf94f:	e8 ac e5 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfcf954` | `fcf954:	48 8b 8c 24 10 01 00 	mov    rcx,QWORD PTR [rsp+0x110]` |
| `0xfcf95c` | `fcf95c:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx` |
| `0xfcf960` | `fcf960:	48 8b 8c 24 18 01 00 	mov    rcx,QWORD PTR [rsp+0x118]` |
| `0xfcf968` | `fcf968:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx` |
| `0xfcf976` | `fcf976:	49 8b 4d 10          	mov    rcx,QWORD PTR [r13+0x10]` |
| `0xfcf97a` | `fcf97a:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx` |
| `0xfcf97e` | `fcf97e:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]` |
| `0xfcf983` | `fcf983:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0` |
| `0xfcf98a` | `fcf98a:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0` |
| `0xfcf99b` | `fcf99b:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0xfcf9a5` | `fcf9a5:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx` |
| `0xfcf9a9` | `fcf9a9:	4c 89 e7             	mov    rdi,r12` |
| `0xfcf9ac` | `fcf9ac:	48 89 c6             	mov    rsi,rax` |
| `0xfcf9af` | `fcf9af:	e8 46 60 f5 ff       	call   f259fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xece10>` |
| `0xfcf9bc` | `fcf9bc:	48 89 df             	mov    rdi,rbx` |
| `0xfcf9bf` | `fcf9bf:	e8 c2 68 b0 ff       	call   ad6286 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23226>` |
| `0xfcf9c7` | `fcf9c7:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0` |
| `0xfcf9da` | `fcf9da:	48 89 de             	mov    rsi,rbx` |
| `0xfcf9dd` | `fcf9dd:	e8 3a 9e ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfcf9e2` | `fcf9e2:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfcf9e6` | `fcf9e6:	e8 9b ea ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcf9eb` | `fcf9eb:	4c 8b 74 24 68       	mov    r14,QWORD PTR [rsp+0x68]` |
| `0xfcf9f0` | `fcf9f0:	0f 28 44 24 60       	movaps xmm0,XMMWORD PTR [rsp+0x60]` |
| `0xfcf9f5` | `fcf9f5:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0` |
| `0xfcfa02` | `fcfa02:	4c 8b 74 24 68       	mov    r14,QWORD PTR [rsp+0x68]` |
| `0xfcfa07` | `fcfa07:	4c 89 ff             	mov    rdi,r15` |
| `0xfcfa0a` | `fcfa0a:	e8 a3 ea ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xfcfa0f` | `fcfa0f:	4c 89 f7             	mov    rdi,r14` |
| `0xfcfa12` | `fcfa12:	e8 6f ea ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfa27` | `fcfa27:	48 89 de             	mov    rsi,rbx` |
| `0xfcfa2a` | `fcfa2a:	e8 8b 60 f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>` |
| `0xfcfa2f` | `fcfa2f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfcfa33` | `fcfa33:	e8 4e ea ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfa40` | `fcfa40:	e8 4b e4 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xfcfa4d` | `fcfa4d:	e8 3e e4 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xfcfa52` | `fcfa52:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]` |
| `0xfcfa5a` | `fcfa5a:	e8 27 ea ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfa67` | `fcfa67:	e8 5e 78 69 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>` |
| `0xfcfa74` | `fcfa74:	e8 73 4a ff ff       	call   fc44ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18b902>` |
| `0xfcfa81` | `fcfa81:	0f 29 84 24 d0 01 00 	movaps XMMWORD PTR [rsp+0x1d0],xmm0` |
| `0xfcfa8e` | `fcfa8e:	48 89 ac 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rbp` |
| `0xfcfaaf` | `fcfaaf:	4c 89 f7             	mov    rdi,r14` |
| `0xfcfab2` | `fcfab2:	e8 c9 9c ff ff       	call   fc9780 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190b96>` |
| `0xfcfaba` | `fcfaba:	e8 41 e4 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfcfabf` | `fcfabf:	49 89 c5             	mov    r13,rax` |
| `0xfcfac2` | `fcfac2:	48 8b 84 24 d0 01 00 	mov    rax,QWORD PTR [rsp+0x1d0]` |
| `0xfcfaca` | `fcfaca:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0xfcface` | `fcface:	48 8b 84 24 d8 01 00 	mov    rax,QWORD PTR [rsp+0x1d8]` |
| `0xfcfad6` | `fcfad6:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0xfcfae4` | `fcfae4:	4c 89 ef             	mov    rdi,r13` |
| `0xfcfaeb` | `fcfaeb:	4c 89 f6             	mov    rsi,r14` |
| `0xfcfaee` | `fcfaee:	e8 9b 9a ff ff       	call   fc958e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1909a4>` |
| `0xfcfafa` | `fcfafa:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax` |
| `0xfcfb05` | `fcfb05:	49 89 45 08          	mov    QWORD PTR [r13+0x8],rax` |
| `0xfcfb09` | `fcfb09:	4c 89 e7             	mov    rdi,r12` |
| `0xfcfb0c` | `fcfb0c:	4c 89 ee             	mov    rsi,r13` |
| `0xfcfb0f` | `fcfb0f:	e8 e6 5e f5 ff       	call   f259fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xece10>` |
| `0xfcfb1c` | `fcfb1c:	48 89 df             	mov    rdi,rbx` |
| `0xfcfb1f` | `fcfb1f:	e8 5a 04 00 00       	call   fcff7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197394>` |
| `0xfcfb27` | `fcfb27:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0` |
| `0xfcfb37` | `fcfb37:	48 89 de             	mov    rsi,rbx` |
| `0xfcfb3a` | `fcfb3a:	e8 dd 9c ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfcfb3f` | `fcfb3f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfcfb43` | `fcfb43:	e8 3e e9 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfb48` | `fcfb48:	48 89 2b             	mov    QWORD PTR [rbx],rbp` |
| `0xfcfb4b` | `fcfb4b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15` |
| `0xfcfb59` | `fcfb59:	4c 89 ff             	mov    rdi,r15` |
| `0xfcfb5c` | `fcfb5c:	e8 51 e9 ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xfcfb61` | `fcfb61:	4c 89 ff             	mov    rdi,r15` |
| `0xfcfb64` | `fcfb64:	e8 1d e9 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfb69` | `fcfb69:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]` |
| `0xfcfb7e` | `fcfb7e:	48 89 df             	mov    rdi,rbx` |
| `0xfcfb81` | `fcfb81:	4c 89 f6             	mov    rsi,r14` |
| `0xfcfb84` | `fcfb84:	e8 31 5f f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>` |
| `0xfcfb89` | `fcfb89:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xfcfb8d` | `fcfb8d:	e8 f4 e8 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfb9a` | `fcfb9a:	e8 5d a7 ff ff       	call   fca2fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191712>` |
| `0xfcfba7` | `fcfba7:	48 89 de             	mov    rsi,rbx` |
| `0xfcfbaa` | `fcfbaa:	e8 ad 8c ff ff       	call   fc885c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18fc72>` |
| `0xfcfbaf` | `fcfbaf:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfcfbb3` | `fcfbb3:	e8 ce e8 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfbc0` | `fcfbc0:	e8 37 a7 ff ff       	call   fca2fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191712>` |
| `0xfcfbc5` | `fcfbc5:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]` |
| `0xfcfbca` | `fcfbca:	e8 b7 e8 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfbcf` | `fcfbcf:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xfcfbd4` | `fcfbd4:	e8 b7 e2 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xfcfbd9` | `fcfbd9:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]` |
| `0xfcfbde` | `fcfbde:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]` |
| `0xfcfbe1` | `fcfbe1:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0` |
| `0xfcfbe6` | `fcfbe6:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]` |
| `0xfcfbf4` | `fcfbf4:	4c 8b bc 24 80 00 00 	mov    r15,QWORD PTR [rsp+0x80]` |
| `0xfcfc04` | `fcfc04:	e8 f7 e2 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfcfc09` | `fcfc09:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]` |
| `0xfcfc0e` | `fcfc0e:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0` |
| `0xfcfc1c` | `fcfc1c:	8b 4c 24 0c          	mov    ecx,DWORD PTR [rsp+0xc]` |
| `0xfcfc20` | `fcfc20:	88 48 20             	mov    BYTE PTR [rax+0x20],cl` |
| `0xfcfc2a` | `fcfc2a:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0xfcfc34` | `fcfc34:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx` |
| `0xfcfc38` | `fcfc38:	4c 89 ff             	mov    rdi,r15` |
| `0xfcfc3b` | `fcfc3b:	48 89 c6             	mov    rsi,rax` |
| `0xfcfc3e` | `fcfc3e:	e8 81 9b ef ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>` |
| `0xfcfc4b` | `fcfc4b:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]` |
| `0xfcfc52` | `fcfc52:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0` |
| `0xfcfc5d` | `fcfc5d:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0` |
| `0xfcfc60` | `fcfc60:	48 89 de             	mov    rsi,rbx` |
| `0xfcfc63` | `fcfc63:	e8 b4 9b ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfcfc68` | `fcfc68:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfcfc6c` | `fcfc6c:	e8 15 e8 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfc81` | `fcfc81:	0f 29 84 24 d0 01 00 	movaps XMMWORD PTR [rsp+0x1d0],xmm0` |
| `0xfcfc96` | `fcfc96:	4c 89 e0             	mov    rax,r12` |
| `0xfcfc9d` | `fcfc9d:	4c 89 bc 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],r15` |
| `0xfcfca5` | `fcfca5:	48 89 84 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],rax` |
| `0xfcfcaf` | `fcfcaf:	e8 d2 e7 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfcb4` | `fcfcb4:	4c 89 e7             	mov    rdi,r12` |
| `0xfcfcb7` | `fcfcb7:	e8 ca e7 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfcc8` | `fcfcc8:	48 89 ef             	mov    rdi,rbp` |
| `0xfcfccb` | `fcfccb:	48 89 de             	mov    rsi,rbx` |
| `0xfcfcce` | `fcfcce:	e8 49 9b ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfcfcd3` | `fcfcd3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfcfcd7` | `fcfcd7:	e8 aa e7 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfcdc` | `fcfcdc:	4c 89 f7             	mov    rdi,r14` |
| `0xfcfcdf` | `fcfcdf:	e8 ce e7 ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xfcfce4` | `fcfce4:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]` |
| `0xfcfcec` | `fcfcec:	e8 95 e7 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfcf1` | `fcfcf1:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]` |
| `0xfcfcf6` | `fcfcf6:	e8 8b e7 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfcfb` | `fcfcfb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfcfd20` | `fcfd20:	e8 8b fd 81 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfcfd35` | `fcfd35:	48 89 c7             	mov    rdi,rax` |
| `0xfcfd38` | `fcfd38:	e8 68 9d aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfcfd4c` | `fcfd4c:	89 d5                	mov    ebp,edx` |
| `0xfcfd4e` | `fcfd4e:	49 89 f4             	mov    r12,rsi` |
| `0xfcfd51` | `fcfd51:	49 89 ff             	mov    r15,rdi` |
| `0xfcfd54` | `fcfd54:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfcfd5d` | `fcfd5d:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0xfcfd6b` | `fcfd6b:	48 89 df             	mov    rdi,rbx` |
| `0xfcfd6e` | `fcfd6e:	4c 89 f6             	mov    rsi,r14` |
| `0xfcfd71` | `fcfd71:	e8 ba b5 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfcfd76` | `fcfd76:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xfcfd8a` | `fcfd8a:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]` |
| `0xfcfd8f` | `fcfd8f:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0` |
| `0xfcfd98` | `fcfd98:	4c 89 ee             	mov    rsi,r13` |
| `0xfcfd9b` | `fcfd9b:	e8 7c 9a ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfcfda0` | `fcfda0:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xfcfda4` | `fcfda4:	e8 dd e6 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfda9` | `fcfda9:	41 0f 10 44 24 20    	movups xmm0,XMMWORD PTR [r12+0x20]` |
| `0xfcfdaf` | `fcfdaf:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xfcfdb4` | `fcfdb4:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]` |
| `0xfcfdb9` | `fcfdb9:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax` |
| `0xfcfdc7` | `fcfdc7:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0` |
| `0xfcfdcd` | `fcfdcd:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]` |
| `0xfcfdd2` | `fcfdd2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax` |
| `0xfcfdd7` | `fcfdd7:	41 8b 7f 40          	mov    edi,DWORD PTR [r15+0x40]` |
| `0xfcfddb` | `fcfddb:	e8 68 ec ad ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>` |
| `0xfcfdea` | `fcfdea:	48 89 06             	mov    QWORD PTR [rsi],rax` |
| `0xfcfded` | `fcfded:	41 8b 47 40          	mov    eax,DWORD PTR [r15+0x40]` |
| `0xfcfdf5` | `fcfdf5:	b9 ff ff ff ff       	mov    ecx,0xffffffff` |
| `0xfcfe00` | `fcfe00:	48 0f 45 c8          	cmovne rcx,rax` |
| `0xfcfe04` | `fcfe04:	48 8d 05 dd 16 87 00 	lea    rax,[rip+0x8716dd]        # 18414e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13480>` |
| `0xfcfe10` | `fcfe10:	4c 89 fa             	mov    rdx,r15` |
| `0xfcfe13` | `fcfe13:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]` |
| `0xfcfe1b` | `fcfe1b:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xfcfe25` | `fcfe25:	4c 89 fe             	mov    rsi,r15` |
| `0xfcfe28` | `fcfe28:	4c 89 e2             	mov    rdx,r12` |
| `0xfcfe2b` | `fcfe2b:	e8 92 f2 ff ff       	call   fcf0c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1964d8>` |
| `0xfcfe30` | `fcfe30:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]` |
| `0xfcfe35` | `fcfe35:	e8 4c e6 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfe3a` | `fcfe3a:	4c 89 ff             	mov    rdi,r15` |
| `0xfcfe3d` | `fcfe3d:	e8 3a c1 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfcfe42` | `fcfe42:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]` |
| `0xfcfe46` | `fcfe46:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0` |
| `0xfcfe4a` | `fcfe4a:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]` |
| `0xfcfe58` | `fcfe58:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]` |
| `0xfcfe65` | `fcfe65:	e8 96 e0 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfcfe6a` | `fcfe6a:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]` |
| `0xfcfe6e` | `fcfe6e:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0` |
| `0xfcfe7c` | `fcfe7c:	40 88 68 20          	mov    BYTE PTR [rax+0x20],bpl` |
| `0xfcfe87` | `fcfe87:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0xfcfe91` | `fcfe91:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx` |
| `0xfcfe95` | `fcfe95:	4c 89 ff             	mov    rdi,r15` |
| `0xfcfe98` | `fcfe98:	48 89 c6             	mov    rsi,rax` |
| `0xfcfe9b` | `fcfe9b:	e8 5a 5b f5 ff       	call   f259fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xece10>` |
| `0xfcfea5` | `fcfea5:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]` |
| `0xfcfeac` | `fcfeac:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0` |
| `0xfcfeaf` | `fcfeaf:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]` |
| `0xfcfeb4` | `fcfeb4:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0` |
| `0xfcfeb9` | `fcfeb9:	4c 89 ee             	mov    rsi,r13` |
| `0xfcfebc` | `fcfebc:	e8 5b 99 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfcfec1` | `fcfec1:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xfcfec5` | `fcfec5:	e8 bc e5 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcfeda` | `fcfeda:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xfcfeec` | `fcfeec:	4c 89 e0             	mov    rax,r12` |
| `0xfcfef3` | `fcfef3:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15` |
| `0xfcfef8` | `fcfef8:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax` |
| `0xfcfeff` | `fcfeff:	e8 82 e5 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcff04` | `fcff04:	4c 89 e7             	mov    rdi,r12` |
| `0xfcff07` | `fcff07:	e8 7a e5 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcff10` | `fcff10:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xfcff15` | `fcff15:	48 89 df             	mov    rdi,rbx` |
| `0xfcff18` | `fcff18:	4c 89 fe             	mov    rsi,r15` |
| `0xfcff1b` | `fcff1b:	e8 fc 98 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfcff20` | `fcff20:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xfcff24` | `fcff24:	e8 5d e5 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcff29` | `fcff29:	4c 89 f7             	mov    rdi,r14` |
| `0xfcff2c` | `fcff2c:	e8 81 e5 ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xfcff31` | `fcff31:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]` |
| `0xfcff36` | `fcff36:	e8 4b e5 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcff3b` | `fcff3b:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]` |
| `0xfcff40` | `fcff40:	e8 41 e5 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfcff45` | `fcff45:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfcff64` | `fcff64:	e8 47 fb 81 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfcff6b` | `fcff6b:	48 89 c7             	mov    rdi,rax` |
| `0xfcff6e` | `fcff6e:	e8 32 9b aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfcff7f` | `fcff7f:	48 89 fb             	mov    rbx,rdi` |
| `0xfcff86` | `fcff86:	e8 71 a3 ff ff       	call   fca2fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191712>` |
| `0xfcff8b` | `fcff8b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xfcffa4` | `fcffa4:	89 d5                	mov    ebp,edx` |
| `0xfcffa6` | `fcffa6:	49 89 f7             	mov    r15,rsi` |
| `0xfcffa9` | `fcffa9:	49 89 fe             	mov    r14,rdi` |
| `0xfcffac` | `fcffac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfcffb5` | `fcffb5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0xfcffc3` | `fcffc3:	48 89 df             	mov    rdi,rbx` |
| `0xfcffc6` | `fcffc6:	4c 89 f6             	mov    rsi,r14` |
| `0xfcffc9` | `fcffc9:	e8 62 b3 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xfcffce` | `fcffce:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xfcffe2` | `fcffe2:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]` |
| `0xfcffe7` | `fcffe7:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0` |
| `0xfcfff0` | `fcfff0:	4c 89 e6             	mov    rsi,r12` |
| `0xfcfff3` | `fcfff3:	e8 24 98 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfcfff8` | `fcfff8:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]` |
| `0xfcfffd` | `fcfffd:	e8 84 e4 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd0002` | `fd0002:	41 0f 10 47 20       	movups xmm0,XMMWORD PTR [r15+0x20]` |
| `0xfd0007` | `fd0007:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]` |
| `0xfd000c` | `fd000c:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0` |
| `0xfd0011` | `fd0011:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]` |
| `0xfd0015` | `fd0015:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax` |
| `0xfd001d` | `fd001d:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0` |
| `0xfd0027` | `fd0027:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]` |
| `0xfd0030` | `fd0030:	4c 89 ff             	mov    rdi,r15` |
| `0xfd0033` | `fd0033:	e8 38 a3 ff ff       	call   fca370 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191786>` |
| `0xfd003d` | `fd003d:	4c 89 e6             	mov    rsi,r12` |
| `0xfd0040` | `fd0040:	4c 89 fa             	mov    rdx,r15` |
| `0xfd0043` | `fd0043:	e8 52 a5 ff ff       	call   fca59a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1919b0>` |
| `0xfd0048` | `fd0048:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xfd004c` | `fd004c:	e8 35 e4 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd0051` | `fd0051:	4c 89 e7             	mov    rdi,r12` |
| `0xfd0054` | `fd0054:	e8 23 bf e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfd0059` | `fd0059:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]` |
| `0xfd005d` | `fd005d:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0` |
| `0xfd0061` | `fd0061:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]` |
| `0xfd006f` | `fd006f:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]` |
| `0xfd007c` | `fd007c:	e8 7f de 81 00       	call   17edf00 <_Znwm@plt>` |
| `0xfd0081` | `fd0081:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]` |
| `0xfd0085` | `fd0085:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0` |
| `0xfd0093` | `fd0093:	40 88 68 20          	mov    BYTE PTR [rax+0x20],bpl` |
| `0xfd009e` | `fd009e:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0xfd00a8` | `fd00a8:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx` |
| `0xfd00ac` | `fd00ac:	4c 89 ff             	mov    rdi,r15` |
| `0xfd00af` | `fd00af:	48 89 c6             	mov    rsi,rax` |
| `0xfd00b2` | `fd00b2:	e8 0d 97 ef ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>` |
| `0xfd00bc` | `fd00bc:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]` |
| `0xfd00c3` | `fd00c3:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0` |
| `0xfd00c6` | `fd00c6:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]` |
| `0xfd00cb` | `fd00cb:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0` |
| `0xfd00d0` | `fd00d0:	4c 89 ee             	mov    rsi,r13` |
| `0xfd00d3` | `fd00d3:	e8 44 97 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfd00d8` | `fd00d8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xfd00dc` | `fd00dc:	e8 a5 e3 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd00f1` | `fd00f1:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xfd0103` | `fd0103:	4c 89 e0             	mov    rax,r12` |
| `0xfd010a` | `fd010a:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15` |
| `0xfd010f` | `fd010f:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax` |
| `0xfd0116` | `fd0116:	e8 6b e3 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd011b` | `fd011b:	4c 89 e7             	mov    rdi,r12` |
| `0xfd011e` | `fd011e:	e8 63 e3 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd0127` | `fd0127:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]` |
| `0xfd012c` | `fd012c:	48 89 df             	mov    rdi,rbx` |
| `0xfd012f` | `fd012f:	4c 89 fe             	mov    rsi,r15` |
| `0xfd0132` | `fd0132:	e8 e5 96 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xfd0137` | `fd0137:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xfd013b` | `fd013b:	e8 46 e3 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd0140` | `fd0140:	4c 89 f7             	mov    rdi,r14` |
| `0xfd0143` | `fd0143:	e8 6a e3 ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xfd0148` | `fd0148:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]` |
| `0xfd014d` | `fd014d:	e8 34 e3 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd0152` | `fd0152:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]` |
| `0xfd0157` | `fd0157:	e8 2a e3 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd015c` | `fd015c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd017b` | `fd017b:	e8 30 f9 81 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfd0180` | `fd0180:	48 89 c7             	mov    rdi,rax` |
| `0xfd0183` | `fd0183:	e8 1d 99 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfd0191` | `fd0191:	48 89 fb             	mov    rbx,rdi` |
| `0xfd0194` | `fd0194:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd019d` | `fd019d:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0xfd01a2` | `fd01a2:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xfd01a5` | `fd01a5:	4c 8b 30             	mov    r14,QWORD PTR [rax]` |
| `0xfd01a8` | `fd01a8:	49 89 e7             	mov    r15,rsp` |
| `0xfd01ab` | `fd01ab:	4c 89 ff             	mov    rdi,r15` |
| `0xfd01ae` | `fd01ae:	48 89 d6             	mov    rsi,rdx` |
| `0xfd01b1` | `fd01b1:	e8 1c 09 00 00       	call   fd0ad2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197ee8>` |
| `0xfd01b6` | `fd01b6:	48 89 df             	mov    rdi,rbx` |
| `0xfd01b9` | `fd01b9:	4c 89 f6             	mov    rsi,r14` |
| `0xfd01be` | `fd01be:	4c 89 f9             	mov    rcx,r15` |
| `0xfd01c1` | `fd01c1:	e8 6c e5 ff ff       	call   fce732 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195b48>` |
| `0xfd01c6` | `fd01c6:	4c 89 ff             	mov    rdi,r15` |
| `0xfd01c9` | `fd01c9:	e8 3e a1 ff ff       	call   fca30c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191722>` |
| `0xfd01ce` | `fd01ce:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd01de` | `fd01de:	48 89 d8             	mov    rax,rbx` |
| `0xfd01eb` | `fd01eb:	e8 c0 f8 81 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfd01f7` | `fd01f7:	48 89 fb             	mov    rbx,rdi` |
| `0xfd01fa` | `fd01fa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd0203` | `fd0203:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax` |
| `0xfd0208` | `fd0208:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xfd020b` | `fd020b:	48 8b 30             	mov    rsi,QWORD PTR [rax]` |
| `0xfd0213` | `fd0213:	41 c7 46 20 01 00 00 	mov    DWORD PTR [r14+0x20],0x1` |
| `0xfd021d` | `fd021d:	4c 89 f1             	mov    rcx,r14` |
| `0xfd0220` | `fd0220:	e8 0d e5 ff ff       	call   fce732 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195b48>` |
| `0xfd0225` | `fd0225:	4c 89 f7             	mov    rdi,r14` |
| `0xfd0228` | `fd0228:	e8 df a0 ff ff       	call   fca30c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191722>` |
| `0xfd022d` | `fd022d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd023d` | `fd023d:	48 89 d8             	mov    rax,rbx` |
| `0xfd0248` | `fd0248:	e8 63 f8 81 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfd0257` | `fd0257:	48 89 fb             	mov    rbx,rdi` |
| `0xfd025a` | `fd025a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd0263` | `fd0263:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0xfd0268` | `fd0268:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xfd026b` | `fd026b:	4c 8b 30             	mov    r14,QWORD PTR [rax]` |
| `0xfd026e` | `fd026e:	49 89 e7             	mov    r15,rsp` |
| `0xfd0271` | `fd0271:	4c 89 ff             	mov    rdi,r15` |
| `0xfd0274` | `fd0274:	48 89 d6             	mov    rsi,rdx` |
| `0xfd0277` | `fd0277:	e8 7c 72 b0 ff       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>` |
| `0xfd027c` | `fd027c:	41 c7 47 20 02 00 00 	mov    DWORD PTR [r15+0x20],0x2` |
| `0xfd0284` | `fd0284:	48 89 df             	mov    rdi,rbx` |
| `0xfd0287` | `fd0287:	4c 89 f6             	mov    rsi,r14` |
| `0xfd028c` | `fd028c:	4c 89 f9             	mov    rcx,r15` |
| `0xfd028f` | `fd028f:	e8 9e e4 ff ff       	call   fce732 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195b48>` |
| `0xfd0294` | `fd0294:	4c 89 ff             	mov    rdi,r15` |
| `0xfd0297` | `fd0297:	e8 70 a0 ff ff       	call   fca30c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191722>` |
| `0xfd029c` | `fd029c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd02ac` | `fd02ac:	48 89 d8             	mov    rax,rbx` |
| `0xfd02b9` | `fd02b9:	e8 f2 f7 81 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfd02c5` | `fd02c5:	48 89 fb             	mov    rbx,rdi` |
| `0xfd02c8` | `fd02c8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd02d1` | `fd02d1:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax` |
| `0xfd02d6` | `fd02d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xfd02d9` | `fd02d9:	48 8b 30             	mov    rsi,QWORD PTR [rax]` |
| `0xfd02dc` | `fd02dc:	8b 02                	mov    eax,DWORD PTR [rdx]` |
| `0xfd02e3` | `fd02e3:	41 89 06             	mov    DWORD PTR [r14],eax` |
| `0xfd02e6` | `fd02e6:	41 c7 46 20 03 00 00 	mov    DWORD PTR [r14+0x20],0x3` |
| `0xfd02f0` | `fd02f0:	4c 89 f1             	mov    rcx,r14` |
| `0xfd02f3` | `fd02f3:	e8 3a e4 ff ff       	call   fce732 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195b48>` |
| `0xfd02f8` | `fd02f8:	4c 89 f7             	mov    rdi,r14` |
| `0xfd02fb` | `fd02fb:	e8 0c a0 ff ff       	call   fca30c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191722>` |
| `0xfd0300` | `fd0300:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd0310` | `fd0310:	48 89 d8             	mov    rax,rbx` |
| `0xfd031b` | `fd031b:	e8 90 f7 81 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfd0331` | `fd0331:	49 89 d6             	mov    r14,rdx` |
| `0xfd0334` | `fd0334:	48 89 fb             	mov    rbx,rdi` |
| `0xfd0337` | `fd0337:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd0340` | `fd0340:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax` |
| `0xfd0348` | `fd0348:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xfd034b` | `fd034b:	4c 8b 38             	mov    r15,QWORD PTR [rax]` |
| `0xfd034e` | `fd034e:	8b 02                	mov    eax,DWORD PTR [rdx]` |
| `0xfd0358` | `fd0358:	89 06                	mov    DWORD PTR [rsi],eax` |
| `0xfd035a` | `fd035a:	c7 46 20 04 00 00 00 	mov    DWORD PTR [rsi+0x20],0x4` |
| `0xfd0366` | `fd0366:	e8 6e c7 06 00       	call   103cad9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x203eef>` |
| `0xfd0373` | `fd0373:	e8 94 9f ff ff       	call   fca30c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191722>` |
| `0xfd037f` | `fd037f:	4c 8b 44 24 18       	mov    r8,QWORD PTR [rsp+0x18]` |
| `0xfd039c` | `fd039c:	4c 89 ee             	mov    rsi,r13` |
| `0xfd039f` | `fd039f:	ba d9 02 00 00       	mov    edx,0x2d9` |
| `0xfd03a6` | `fd03a6:	e8 27 65 80 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xfd03b4` | `fd03b4:	4c 89 fe             	mov    rsi,r15` |
| `0xfd03b7` | `fd03b7:	e8 9e ba cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>` |
| `0xfd03c4` | `fd03c4:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0` |
| `0xfd03d6` | `fd03d6:	4c 89 ff             	mov    rdi,r15` |
| `0xfd03d9` | `fd03d9:	e8 7c 4c f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>` |
| `0xfd03e9` | `fd03e9:	4c 89 e7             	mov    rdi,r12` |
| `0xfd03ec` | `fd03ec:	4c 89 fe             	mov    rsi,r15` |
| `0xfd03ef` | `fd03ef:	e8 6c 78 ff ff       	call   fc7c60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f076>` |
| `0xfd03f4` | `fd03f4:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]` |
| `0xfd03ff` | `fd03ff:	49 8b b7 80 00 00 00 	mov    rsi,QWORD PTR [r15+0x80]` |
| `0xfd0417` | `fd0417:	e8 70 d1 ff ff       	call   fcd58c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1949a2>` |
| `0xfd041c` | `fd041c:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]` |
| `0xfd0424` | `fd0424:	41 8b 06             	mov    eax,DWORD PTR [r14]` |
| `0xfd042f` | `fd042f:	89 06                	mov    DWORD PTR [rsi],eax` |
| `0xfd0431` | `fd0431:	c7 46 20 01 00 00 00 	mov    DWORD PTR [rsi+0x20],0x1` |
| `0xfd043d` | `fd043d:	e8 0a 05 00 00       	call   fd094c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197d62>` |
| `0xfd044a` | `fd044a:	e8 27 06 00 00       	call   fd0a76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e8c>` |
| `0xfd044f` | `fd044f:	4c 8b b4 24 98 00 00 	mov    r14,QWORD PTR [rsp+0x98]` |
| `0xfd0457` | `fd0457:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]` |
| `0xfd045f` | `fd045f:	4c 89 e7             	mov    rdi,r12` |
| `0xfd0462` | `fd0462:	e8 cf e6 b0 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>` |
| `0xfd0467` | `fd0467:	4c 89 f7             	mov    rdi,r14` |
| `0xfd046a` | `fd046a:	e8 17 e0 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd046f` | `fd046f:	4c 89 ff             	mov    rdi,r15` |
| `0xfd0474` | `fd0474:	e8 21 e6 ff ff       	call   fcea9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195eb0>` |
| `0xfd047e` | `fd047e:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]` |
| `0xfd048b` | `fd048b:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0` |
| `0xfd0490` | `fd0490:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]` |
| `0xfd0494` | `fd0494:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0xfd049b` | `fd049b:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0` |
| `0xfd04a5` | `fd04a5:	48 8b ac 24 88 00 00 	mov    rbp,QWORD PTR [rsp+0x88]` |
| `0xfd04b5` | `fd04b5:	4c 89 e7             	mov    rdi,r12` |
| `0xfd04b8` | `fd04b8:	4c 89 fe             	mov    rsi,r15` |
| `0xfd04bb` | `fd04bb:	48 89 ea             	mov    rdx,rbp` |
| `0xfd04be` | `fd04be:	4c 89 e9             	mov    rcx,r13` |
| `0xfd04c1` | `fd04c1:	e8 3e 4d f5 ff       	call   f25204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec61a>` |
| `0xfd04c6` | `fd04c6:	4c 89 ef             	mov    rdi,r13` |
| `0xfd04c9` | `fd04c9:	e8 ae ba e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfd04ce` | `fd04ce:	48 89 ef             	mov    rdi,rbp` |
| `0xfd04d1` | `fd04d1:	e8 b0 df ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd04de` | `fd04de:	4c 89 ff             	mov    rdi,r15` |
| `0xfd04e1` | `fd04e1:	4c 89 e6             	mov    rsi,r12` |
| `0xfd04e4` | `fd04e4:	e8 d7 76 ff ff       	call   fc7bc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18efd6>` |
| `0xfd04e9` | `fd04e9:	48 89 df             	mov    rdi,rbx` |
| `0xfd04ec` | `fd04ec:	4c 89 fe             	mov    rsi,r15` |
| `0xfd04ef` | `fd04ef:	e8 c6 55 f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>` |
| `0xfd04f4` | `fd04f4:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xfd04f8` | `fd04f8:	e8 89 df ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd04fd` | `fd04fd:	4c 89 e7             	mov    rdi,r12` |
| `0xfd0500` | `fd0500:	e8 0d 4e f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>` |
| `0xfd0505` | `fd0505:	4c 89 f7             	mov    rdi,r14` |
| `0xfd0508` | `fd0508:	e8 05 4e f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>` |
| `0xfd0512` | `fd0512:	e8 65 ba e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfd0517` | `fd0517:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xfd051c` | `fd051c:	e8 65 df ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd0526` | `fd0526:	e8 65 d9 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xfd052b` | `fd052b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd0542` | `fd0542:	48 89 d8             	mov    rax,rbx` |
| `0xfd0562` | `fd0562:	0f 29 45 00          	movaps XMMWORD PTR [rbp+0x0],xmm0` |
| `0xfd0572` | `fd0572:	48 89 ef             	mov    rdi,rbp` |
| `0xfd0575` | `fd0575:	e8 78 5a 80 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>` |
| `0xfd0582` | `fd0582:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1` |
| `0xfd0589` | `fd0589:	4c 89 6f 08          	mov    QWORD PTR [rdi+0x8],r13` |
| `0xfd0594` | `fd0594:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax` |
| `0xfd0598` | `fd0598:	c7 47 18 db 02 00 00 	mov    DWORD PTR [rdi+0x18],0x2db` |
| `0xfd059f` | `fd059f:	48 89 ee             	mov    rsi,rbp` |
| `0xfd05a2` | `fd05a2:	e8 01 97 ad ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>` |
| `0xfd05a7` | `fd05a7:	48 89 ef             	mov    rdi,rbp` |
| `0xfd05aa` | `fd05aa:	e8 e1 d8 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xfd05af` | `fd05af:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]` |
| `0xfd05c1` | `fd05c1:	48 89 c3             	mov    rbx,rax` |
| `0xfd05cc` | `fd05cc:	e8 a5 04 00 00       	call   fd0a76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e8c>` |
| `0xfd05d1` | `fd05d1:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]` |
| `0xfd05d9` | `fd05d9:	e8 a8 de ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd05e0` | `fd05e0:	48 89 c3             	mov    rbx,rax` |
| `0xfd05e3` | `fd05e3:	48 89 df             	mov    rdi,rbx` |
| `0xfd05e6` | `fd05e6:	e8 ba 94 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfd05eb` | `fd05eb:	48 89 c7             	mov    rdi,rax` |
| `0xfd05ee` | `fd05ee:	e8 b2 94 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfd05f3` | `fd05f3:	48 89 c3             	mov    rbx,rax` |
| `0xfd05fe` | `fd05fe:	e8 09 9d ff ff       	call   fca30c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191722>` |
| `0xfd0603` | `fd0603:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd0616` | `fd0616:	48 89 df             	mov    rdi,rbx` |
| `0xfd0619` | `fd0619:	e8 b2 f6 a9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xfd061e` | `fd061e:	e8 8d f4 81 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfd0635` | `fd0635:	49 89 d6             	mov    r14,rdx` |
| `0xfd0638` | `fd0638:	48 89 fb             	mov    rbx,rdi` |
| `0xfd063b` | `fd063b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd0644` | `fd0644:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax` |
| `0xfd064c` | `fd064c:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xfd064f` | `fd064f:	4c 8b 38             	mov    r15,QWORD PTR [rax]` |
| `0xfd065a` | `fd065a:	4c 89 e7             	mov    rdi,r12` |
| `0xfd065d` | `fd065d:	48 89 d6             	mov    rsi,rdx` |
| `0xfd0660` | `fd0660:	e8 d5 02 00 00       	call   fd093a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197d50>` |
| `0xfd066a` | `fd066a:	4c 89 e6             	mov    rsi,r12` |
| `0xfd066d` | `fd066d:	e8 67 c4 06 00       	call   103cad9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x203eef>` |
| `0xfd067a` | `fd067a:	e8 8d 9c ff ff       	call   fca30c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191722>` |
| `0xfd0686` | `fd0686:	4c 8b 44 24 18       	mov    r8,QWORD PTR [rsp+0x18]` |
| `0xfd06a3` | `fd06a3:	4c 89 ee             	mov    rsi,r13` |
| `0xfd06a6` | `fd06a6:	ba d9 02 00 00       	mov    edx,0x2d9` |
| `0xfd06ad` | `fd06ad:	e8 20 62 80 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xfd06bb` | `fd06bb:	4c 89 fe             	mov    rsi,r15` |
| `0xfd06be` | `fd06be:	e8 97 b7 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>` |
| `0xfd06cb` | `fd06cb:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0` |
| `0xfd06dd` | `fd06dd:	4c 89 ff             	mov    rdi,r15` |
| `0xfd06e0` | `fd06e0:	e8 75 49 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>` |
| `0xfd06f0` | `fd06f0:	4c 89 e7             	mov    rdi,r12` |
| `0xfd06f3` | `fd06f3:	4c 89 fe             	mov    rsi,r15` |
| `0xfd06f6` | `fd06f6:	e8 65 75 ff ff       	call   fc7c60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f076>` |
| `0xfd06fb` | `fd06fb:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]` |
| `0xfd0706` | `fd0706:	49 8b b7 80 00 00 00 	mov    rsi,QWORD PTR [r15+0x80]` |
| `0xfd071e` | `fd071e:	e8 69 ce ff ff       	call   fcd58c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1949a2>` |
| `0xfd0723` | `fd0723:	4c 8b ac 24 90 00 00 	mov    r13,QWORD PTR [rsp+0x90]` |
| `0xfd0733` | `fd0733:	4c 89 f6             	mov    rsi,r14` |
| `0xfd0736` | `fd0736:	e8 e5 be ff ff       	call   fcc620 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x193a36>` |
| `0xfd074c` | `fd074c:	4c 89 ef             	mov    rdi,r13` |
| `0xfd074f` | `fd074f:	e8 f8 01 00 00       	call   fd094c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197d62>` |
| `0xfd075c` | `fd075c:	e8 15 03 00 00       	call   fd0a76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e8c>` |
| `0xfd0761` | `fd0761:	4c 8b b4 24 98 00 00 	mov    r14,QWORD PTR [rsp+0x98]` |
| `0xfd0769` | `fd0769:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]` |
| `0xfd0771` | `fd0771:	4c 89 e7             	mov    rdi,r12` |
| `0xfd0774` | `fd0774:	e8 bd e3 b0 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>` |
| `0xfd0779` | `fd0779:	4c 89 f7             	mov    rdi,r14` |
| `0xfd077c` | `fd077c:	e8 05 dd ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd0781` | `fd0781:	4c 89 ff             	mov    rdi,r15` |
| `0xfd0786` | `fd0786:	e8 0f e3 ff ff       	call   fcea9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195eb0>` |
| `0xfd0790` | `fd0790:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]` |
| `0xfd079d` | `fd079d:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0` |
| `0xfd07a2` | `fd07a2:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]` |
| `0xfd07a6` | `fd07a6:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0xfd07ad` | `fd07ad:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0` |
| `0xfd07b7` | `fd07b7:	48 8b ac 24 88 00 00 	mov    rbp,QWORD PTR [rsp+0x88]` |
| `0xfd07c7` | `fd07c7:	4c 89 e7             	mov    rdi,r12` |
| `0xfd07ca` | `fd07ca:	4c 89 fe             	mov    rsi,r15` |
| `0xfd07cd` | `fd07cd:	48 89 ea             	mov    rdx,rbp` |
| `0xfd07d0` | `fd07d0:	4c 89 e9             	mov    rcx,r13` |
| `0xfd07d3` | `fd07d3:	e8 2c 4a f5 ff       	call   f25204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec61a>` |
| `0xfd07d8` | `fd07d8:	4c 89 ef             	mov    rdi,r13` |
| `0xfd07db` | `fd07db:	e8 9c b7 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfd07e0` | `fd07e0:	48 89 ef             	mov    rdi,rbp` |
| `0xfd07e3` | `fd07e3:	e8 9e dc ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd07f0` | `fd07f0:	4c 89 ff             	mov    rdi,r15` |
| `0xfd07f3` | `fd07f3:	4c 89 e6             	mov    rsi,r12` |
| `0xfd07f6` | `fd07f6:	e8 c5 73 ff ff       	call   fc7bc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18efd6>` |
| `0xfd07fb` | `fd07fb:	48 89 df             	mov    rdi,rbx` |
| `0xfd07fe` | `fd07fe:	4c 89 fe             	mov    rsi,r15` |
| `0xfd0801` | `fd0801:	e8 b4 52 f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>` |
| `0xfd0806` | `fd0806:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xfd080a` | `fd080a:	e8 77 dc ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd080f` | `fd080f:	4c 89 e7             	mov    rdi,r12` |
| `0xfd0812` | `fd0812:	e8 fb 4a f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>` |
| `0xfd0817` | `fd0817:	4c 89 f7             	mov    rdi,r14` |
| `0xfd081a` | `fd081a:	e8 f3 4a f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>` |
| `0xfd0824` | `fd0824:	e8 53 b7 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>` |
| `0xfd0829` | `fd0829:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xfd082e` | `fd082e:	e8 53 dc ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd0838` | `fd0838:	e8 53 d6 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xfd083d` | `fd083d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd0854` | `fd0854:	48 89 d8             	mov    rax,rbx` |
| `0xfd0874` | `fd0874:	0f 29 45 00          	movaps XMMWORD PTR [rbp+0x0],xmm0` |
| `0xfd0884` | `fd0884:	48 89 ef             	mov    rdi,rbp` |
| `0xfd0887` | `fd0887:	e8 66 57 80 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>` |
| `0xfd0894` | `fd0894:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1` |
| `0xfd089b` | `fd089b:	4c 89 6f 08          	mov    QWORD PTR [rdi+0x8],r13` |
| `0xfd08a6` | `fd08a6:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax` |
| `0xfd08aa` | `fd08aa:	c7 47 18 db 02 00 00 	mov    DWORD PTR [rdi+0x18],0x2db` |
| `0xfd08b1` | `fd08b1:	48 89 ee             	mov    rsi,rbp` |
| `0xfd08b4` | `fd08b4:	e8 ef 93 ad ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>` |
| `0xfd08b9` | `fd08b9:	48 89 ef             	mov    rdi,rbp` |
| `0xfd08bc` | `fd08bc:	e8 cf d5 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xfd08c1` | `fd08c1:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]` |
| `0xfd08d3` | `fd08d3:	48 89 c3             	mov    rbx,rax` |
| `0xfd08de` | `fd08de:	e8 93 01 00 00       	call   fd0a76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197e8c>` |
| `0xfd08e5` | `fd08e5:	48 89 c3             	mov    rbx,rax` |
| `0xfd08e8` | `fd08e8:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]` |
| `0xfd08f0` | `fd08f0:	e8 91 db ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xfd08f7` | `fd08f7:	48 89 c3             	mov    rbx,rax` |
| `0xfd08fa` | `fd08fa:	48 89 df             	mov    rdi,rbx` |
| `0xfd08fd` | `fd08fd:	e8 a3 91 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfd0902` | `fd0902:	48 89 c7             	mov    rdi,rax` |
| `0xfd0905` | `fd0905:	e8 9b 91 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xfd090a` | `fd090a:	48 89 c3             	mov    rbx,rax` |
| `0xfd0915` | `fd0915:	e8 f2 99 ff ff       	call   fca30c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191722>` |
| `0xfd091a` | `fd091a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd092d` | `fd092d:	48 89 df             	mov    rdi,rbx` |
| `0xfd0930` | `fd0930:	e8 9b f3 a9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xfd0935` | `fd0935:	e8 76 f1 81 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xfd093b` | `fd093b:	48 89 fb             	mov    rbx,rdi` |
| `0xfd093e` | `fd093e:	e8 dd bc ff ff       	call   fcc620 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x193a36>` |
| `0xfd0943` | `fd0943:	c7 43 20 05 00 00 00 	mov    DWORD PTR [rbx+0x20],0x5` |
| `0xfd0957` | `fd0957:	49 89 d7             	mov    r15,rdx` |
| `0xfd095a` | `fd095a:	49 89 f6             	mov    r14,rsi` |
| `0xfd095d` | `fd095d:	48 89 fb             	mov    rbx,rdi` |
| `0xfd0960` | `fd0960:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xfd0969` | `fd0969:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| ... | truncated 3555 more |

