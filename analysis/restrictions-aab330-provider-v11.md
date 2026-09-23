# Restrictions `aab330(original)` provider creation v11

Focus: classify the provider created at `e99c7d aab330(&stack_slot, original)` for the erased bridge. Static provenance only.

## bridge method e99c54 `0xe99c54`

```text
  e99bd3:	eb ec                	jmp    e99bc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60fd7>
  e99bd5:	4d 85 ff             	test   r15,r15
  e99bd8:	74 08                	je     e99be2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ff8>
  e99bda:	4c 89 ff             	mov    rdi,r15
  e99bdd:	e8 3e 43 95 00       	call   17edf20 <_ZdlPv@plt>
  e99be2:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
  e99be6:	48 83 c4 08          	add    rsp,0x8
  e99bea:	5b                   	pop    rbx
  e99beb:	41 5c                	pop    r12
  e99bed:	41 5d                	pop    r13
  e99bef:	41 5e                	pop    r14
  e99bf1:	41 5f                	pop    r15
  e99bf3:	5d                   	pop    rbp
  e99bf4:	c3                   	ret
  e99bf5:	e8 c6 a9 b6 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
  e99bfa:	e8 e0 1a be ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
  e99bff:	cc                   	int3
  e99c00:	48 8d 35 67 a4 53 ff 	lea    rsi,[rip+0xffffffffff53a467]        # 3d406e <_ZTSN5boost17bad_function_callE@@Base+0x13b4>
  e99c07:	48 8d 0d 72 a4 53 ff 	lea    rcx,[rip+0xffffffffff53a472]        # 3d4080 <_ZTSN5boost17bad_function_callE@@Base+0x13c6>
  e99c0e:	6a 0b                	push   0xb
  e99c10:	5a                   	pop    rdx
  e99c11:	6a 11                	push   0x11
  e99c13:	41 58                	pop    r8
  e99c15:	45 31 c9             	xor    r9d,r9d
  e99c18:	e9 6d d7 74 00       	jmp    15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e99c1d:	cc                   	int3
  e99c1e:	53                   	push   rbx
  e99c1f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  e99c22:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99c26:	48 85 db             	test   rbx,rbx
  e99c29:	74 27                	je     e99c52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61068>
  e99c2b:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
  e99c32:	e8 0f 7b 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  e99c37:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
  e99c3b:	e8 2a 03 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e99c40:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  e99c44:	e8 21 03 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e99c49:	48 89 df             	mov    rdi,rbx
  e99c4c:	5b                   	pop    rbx
  e99c4d:	e9 ce 42 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e99c52:	5b                   	pop    rbx
  e99c53:	c3                   	ret
  e99c54:	41 56                	push   r14
  e99c56:	53                   	push   rbx
  e99c57:	48 81 ec 48 05 00 00 	sub    rsp,0x548
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
```
## aab330 `0xaab330`

```text
  aab296:	49 c1 e7 08          	shl    r15,0x8
  aab29a:	45 0f b6 e5          	movzx  r12d,r13b
  aab29e:	e9 0b fd ff ff       	jmp    aaafae <JNI_OnUnload@@Base+0x3287b>
  aab2a3:	e8 08 48 d4 00       	call   17efab0 <__stack_chk_fail@plt>
  aab2a8:	48 89 c3             	mov    rbx,rax
  aab2ab:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  aab2b0:	e8 37 0b 00 00       	call   aabdec <JNI_OnUnload@@Base+0x336b9>
  aab2b5:	eb 18                	jmp    aab2cf <JNI_OnUnload@@Base+0x32b9c>
  aab2b7:	48 89 c3             	mov    rbx,rax
  aab2ba:	4c 89 ff             	mov    rdi,r15
  aab2bd:	e8 66 eb fc ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  aab2c2:	4c 89 ff             	mov    rdi,r15
  aab2c5:	e8 56 2c d4 00       	call   17edf20 <_ZdlPv@plt>
  aab2ca:	eb 03                	jmp    aab2cf <JNI_OnUnload@@Base+0x32b9c>
  aab2cc:	48 89 c3             	mov    rbx,rax
  aab2cf:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aab2d4:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
  aab2da:	48 85 ff             	test   rdi,rdi
  aab2dd:	74 0b                	je     aab2ea <JNI_OnUnload@@Base+0x32bb7>
  aab2df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  aab2e2:	ff 50 08             	call   QWORD PTR [rax+0x8]
  aab2e5:	eb 03                	jmp    aab2ea <JNI_OnUnload@@Base+0x32bb7>
  aab2e7:	48 89 c3             	mov    rbx,rax
  aab2ea:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  aab2ef:	e8 3c 0b 00 00       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
  aab2f4:	eb 31                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>
  aab2f6:	48 89 c3             	mov    rbx,rax
  aab2f9:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
  aab2fe:	e8 83 31 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aab303:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
  aab307:	e8 a6 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab30c:	31 ff                	xor    edi,edi
  aab30e:	e8 9f 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab313:	31 ff                	xor    edi,edi
  aab315:	e8 98 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab31a:	4c 89 f7             	mov    rdi,r14
  aab31d:	e8 fe 2b d4 00       	call   17edf20 <_ZdlPv@plt>
  aab322:	eb 03                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>
  aab324:	48 89 c3             	mov    rbx,rax
  aab327:	48 89 df             	mov    rdi,rbx
  aab32a:	e8 76 e7 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  aab32f:	cc                   	int3
  aab330:	41 56                	push   r14
  aab332:	53                   	push   rbx
  aab333:	50                   	push   rax
  aab334:	48 89 fb             	mov    rbx,rdi
  aab337:	0f 57 c0             	xorps  xmm0,xmm0
  aab33a:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  aab33d:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
  aab341:	48 85 ff             	test   rdi,rdi
  aab344:	74 17                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>
  aab346:	49 89 f6             	mov    r14,rsi
  aab349:	e8 f2 2d d4 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
  aab34e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  aab352:	48 85 c0             	test   rax,rax
  aab355:	74 06                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>
  aab357:	49 8b 06             	mov    rax,QWORD PTR [r14]
  aab35a:	48 89 03             	mov    QWORD PTR [rbx],rax
  aab35d:	48 83 c4 08          	add    rsp,0x8
  aab361:	5b                   	pop    rbx
  aab362:	41 5e                	pop    r14
  aab364:	c3                   	ret
  aab365:	cc                   	int3
  aab366:	48 8b 05 d3 81 f3 00 	mov    rax,QWORD PTR [rip+0xf381d3]        # 19e3540 <__cxa_new_handler@@Base+0x2dd0>
  aab36d:	48 85 c0             	test   rax,rax
  aab370:	74 01                	je     aab373 <JNI_OnUnload@@Base+0x32c40>
  aab372:	c3                   	ret
  aab373:	50                   	push   rax
  aab374:	e8 46 ec fc ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  aab379:	cc                   	int3
  aab37a:	48 83 c7 08          	add    rdi,0x8
  aab37e:	e9 d5 0a 00 00       	jmp    aabe58 <JNI_OnUnload@@Base+0x33725>
  aab383:	cc                   	int3
  aab384:	53                   	push   rbx
  aab385:	48 89 fb             	mov    rbx,rdi
  aab388:	48 83 c7 08          	add    rdi,0x8
  aab38c:	e8 c7 0a 00 00       	call   aabe58 <JNI_OnUnload@@Base+0x33725>
  aab391:	48 89 df             	mov    rdi,rbx
  aab394:	5b                   	pop    rbx
  aab395:	e9 86 2b d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aab39a:	50                   	push   rax
  aab39b:	48 83 c7 28          	add    rdi,0x28
  aab39f:	e8 02 06 00 00       	call   aab9a6 <JNI_OnUnload@@Base+0x33273>
  aab3a4:	59                   	pop    rcx
  aab3a5:	c3                   	ret
  aab3a6:	55                   	push   rbp
  aab3a7:	41 57                	push   r15
  aab3a9:	41 56                	push   r14
  aab3ab:	41 55                	push   r13
  aab3ad:	41 54                	push   r12
  aab3af:	53                   	push   rbx
  aab3b0:	48 83 ec 68          	sub    rsp,0x68
  aab3b4:	45 89 c6             	mov    r14d,r8d
  aab3b7:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx
  aab3bb:	49 89 ff             	mov    r15,rdi
  aab3be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aab3c5:	00 00
  aab3c7:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  aab3cc:	48 8d 77 08          	lea    rsi,[rdi+0x8]
  aab3d0:	48 8b 6f 28          	mov    rbp,QWORD PTR [rdi+0x28]
  aab3d4:	48 8b 5f 30          	mov    rbx,QWORD PTR [rdi+0x30]
  aab3d8:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
  aab3dd:	4c 89 e7             	mov    rdi,r12
  aab3e0:	e8 4b ff ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  aab3e5:	4d 8b 2c 24          	mov    r13,QWORD PTR [r12]
  aab3e9:	4d 85 ed             	test   r13,r13
  aab3ec:	74 53                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab3ee:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]
  aab3f2:	4d 85 e4             	test   r12,r12
  aab3f5:	74 46                	je     aab43d <JNI_OnUnload@@Base+0x32d0a>
  aab3f7:	48 89 e8             	mov    rax,rbp
  aab3fa:	31 ed                	xor    ebp,ebp
  aab3fc:	48 85 c0             	test   rax,rax
  aab3ff:	74 40                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab401:	48 85 db             	test   rbx,rbx
  aab404:	78 3b                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab406:	49 89 c7             	mov    r15,rax
  aab409:	44 89 f0             	mov    eax,r14d
  aab40c:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]
  aab410:	09 d0                	or     eax,edx
  aab412:	78 2d                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab414:	41 8b 8c 24 e0 13 00 	mov    ecx,DWORD PTR [r12+0x13e0]
  aab41b:	00
  aab41c:	8d 41 fd             	lea    eax,[rcx-0x3]
  aab41f:	83 f8 fe             	cmp    eax,0xfffffffe
  aab422:	72 1d                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab424:	89 d0                	mov    eax,edx
  aab426:	31 ed                	xor    ebp,ebp
  aab428:	48 29 c3             	sub    rbx,rax
  aab42b:	72 14                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab42d:	44 89 f2             	mov    edx,r14d
  aab430:	48 39 d3             	cmp    rbx,rdx
  aab433:	72 0c                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab435:	4c 89 fa             	mov    rdx,r15
  aab438:	4c 01 f8             	add    rax,r15
  aab43b:	73 3c                	jae    aab479 <JNI_OnUnload@@Base+0x32d46>
  aab43d:	31 ed                	xor    ebp,ebp
  aab43f:	eb 00                	jmp    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab441:	4d 85 ed             	test   r13,r13
  aab444:	0f 95 c3             	setne  bl
  aab447:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  aab44c:	e8 35 30 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aab451:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aab458:	00 00
  aab45a:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
  aab45f:	0f 85 39 01 00 00    	jne    aab59e <JNI_OnUnload@@Base+0x32e6b>
  aab465:	40 20 eb             	and    bl,bpl
  aab468:	89 d8                	mov    eax,ebx
  aab46a:	48 83 c4 68          	add    rsp,0x68
  aab46e:	5b                   	pop    rbx
  aab46f:	41 5c                	pop    r12
  aab471:	41 5d                	pop    r13
  aab473:	41 5e                	pop    r14
  aab475:	41 5f                	pop    r15
  aab477:	5d                   	pop    rbp
  aab478:	c3                   	ret
  aab479:	31 ed                	xor    ebp,ebp
  aab47b:	48 85 c0             	test   rax,rax
  aab47e:	74 c1                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab480:	83 e0 01             	and    eax,0x1
  aab483:	75 bc                	jne    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab485:	01 c9                	add    ecx,ecx
  aab487:	31 ed                	xor    ebp,ebp
  aab489:	44 89 f0             	mov    eax,r14d
  aab48c:	31 d2                	xor    edx,edx
  aab48e:	f7 f1                	div    ecx
  aab490:	85 d2                	test   edx,edx
  aab492:	75 ad                	jne    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab494:	45 85 f6             	test   r14d,r14d
  aab497:	74 47                	je     aab4e0 <JNI_OnUnload@@Base+0x32dad>
  aab499:	49 8b 9c 24 e8 13 00 	mov    rbx,QWORD PTR [r12+0x13e8]
  aab4a0:	00
  aab4a1:	49 83 a4 24 e8 13 00 	and    QWORD PTR [r12+0x13e8],0x0
  aab4a8:	00 00
  aab4aa:	4d 63 f6             	movsxd r14,r14d
  aab4ad:	49 d1 ee             	shr    r14,1
  aab4b0:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
  aab4b5:	48 85 db             	test   rbx,rbx
  aab4b8:	74 2e                	je     aab4e8 <JNI_OnUnload@@Base+0x32db5>
  aab4ba:	6a 01                	push   0x1
  aab4bc:	5a                   	pop    rdx
  aab4bd:	48 89 df             	mov    rdi,rbx
  aab4c0:	4c 89 f6             	mov    rsi,r14
  aab4c3:	e8 fe f5 aa 00       	call   155aac6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a004a>
  aab4c8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  aab4cb:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  aab4cf:	4c 89 73 20          	mov    QWORD PTR [rbx+0x20],r14
  aab4d3:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0
  aab4d7:	c7 43 2c 00 00 80 3f 	mov    DWORD PTR [rbx+0x2c],0x3f800000
  aab4de:	eb 66                	jmp    aab546 <JNI_OnUnload@@Base+0x32e13>
  aab4e0:	40 b5 01             	mov    bpl,0x1
  aab4e3:	e9 59 ff ff ff       	jmp    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab4e8:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  aab4ed:	4c 89 f6             	mov    rsi,r14
  aab4f0:	e8 0f d7 ff ff       	call   aa8c04 <JNI_OnUnload@@Base+0x304d1>
  aab4f5:	48 8d 54 24 47       	lea    rdx,[rsp+0x47]
  aab4fa:	c6 02 00             	mov    BYTE PTR [rdx],0x0
  aab4fd:	48 8d 4c 24 18       	lea    rcx,[rsp+0x18]
  aab502:	c7 01 00 00 80 3f    	mov    DWORD PTR [rcx],0x3f800000
  aab508:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  aab50d:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
  aab512:	e8 2f d6 ff ff       	call   aa8b46 <JNI_OnUnload@@Base+0x30413>
  aab517:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
  aab51c:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
  aab51f:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  aab523:	48 8d 6c 24 38       	lea    rbp,[rsp+0x38]
  aab528:	48 89 ef             	mov    rdi,rbp
  aab52b:	e8 b4 d6 ff ff       	call   aa8be4 <JNI_OnUnload@@Base+0x304b1>
  aab530:	48 89 df             	mov    rdi,rbx
  aab533:	e8 a4 d6 ff ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
  aab538:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  aab53d:	e8 e6 01 fd ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
  aab542:	48 8b 5d 00          	mov    rbx,QWORD PTR [rbp+0x0]
  aab546:	48 63 44 24 04       	movsxd rax,DWORD PTR [rsp+0x4]
  aab54b:	49 01 c7             	add    r15,rax
  aab54e:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  aab553:	4c 89 3f             	mov    QWORD PTR [rdi],r15
  aab556:	4c 89 77 08          	mov    QWORD PTR [rdi+0x8],r14
  aab55a:	0f 10 43 18          	movups xmm0,XMMWORD PTR [rbx+0x18]
  aab55e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  aab563:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
  aab566:	e8 d0 ed aa 00       	call   155a33b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39f8bf>
  aab56b:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  aab56f:	48 83 64 24 38 00    	and    QWORD PTR [rsp+0x38],0x0
  aab575:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  aab57a:	48 89 1e             	mov    QWORD PTR [rsi],rbx
  aab57d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  aab580:	ff 50 10             	call   QWORD PTR [rax+0x10]
  aab583:	89 c5                	mov    ebp,eax
  aab585:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  aab58a:	e8 4d d6 ff ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
  aab58f:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
```
## aab330 prelude `0xaab2c0`

```text
  aab224:	49 89 ec             	mov    r12,rbp
  aab227:	6a 30                	push   0x30
  aab229:	5f                   	pop    rdi
  aab22a:	e8 d1 2c d4 00       	call   17edf00 <_Znwm@plt>
  aab22f:	4c 89 68 20          	mov    QWORD PTR [rax+0x20],r13
  aab233:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
  aab239:	4c 89 78 28          	mov    QWORD PTR [rax+0x28],r15
  aab23d:	0f 57 c0             	xorps  xmm0,xmm0
  aab240:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
  aab243:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
  aab247:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
  aab24b:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
  aab24f:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
  aab252:	48 85 c9             	test   rcx,rcx
  aab255:	74 08                	je     aab25f <JNI_OnUnload@@Base+0x32b2c>
  aab257:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx
  aab25b:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  aab25f:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  aab263:	48 89 c6             	mov    rsi,rax
  aab266:	e8 b3 ed ff ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
  aab26b:	49 ff 46 48          	inc    QWORD PTR [r14+0x48]
  aab26f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  aab274:	e8 73 0b 00 00       	call   aabdec <JNI_OnUnload@@Base+0x336b9>
  aab279:	4d 89 ef             	mov    r15,r13
  aab27c:	49 c1 ef 08          	shr    r15,0x8
  aab280:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aab285:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
  aab28b:	48 85 ff             	test   rdi,rdi
  aab28e:	74 06                	je     aab296 <JNI_OnUnload@@Base+0x32b63>
  aab290:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  aab293:	ff 50 08             	call   QWORD PTR [rax+0x8]
  aab296:	49 c1 e7 08          	shl    r15,0x8
  aab29a:	45 0f b6 e5          	movzx  r12d,r13b
  aab29e:	e9 0b fd ff ff       	jmp    aaafae <JNI_OnUnload@@Base+0x3287b>
  aab2a3:	e8 08 48 d4 00       	call   17efab0 <__stack_chk_fail@plt>
  aab2a8:	48 89 c3             	mov    rbx,rax
  aab2ab:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  aab2b0:	e8 37 0b 00 00       	call   aabdec <JNI_OnUnload@@Base+0x336b9>
  aab2b5:	eb 18                	jmp    aab2cf <JNI_OnUnload@@Base+0x32b9c>
  aab2b7:	48 89 c3             	mov    rbx,rax
  aab2ba:	4c 89 ff             	mov    rdi,r15
  aab2bd:	e8 66 eb fc ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  aab2c2:	4c 89 ff             	mov    rdi,r15
  aab2c5:	e8 56 2c d4 00       	call   17edf20 <_ZdlPv@plt>
  aab2ca:	eb 03                	jmp    aab2cf <JNI_OnUnload@@Base+0x32b9c>
  aab2cc:	48 89 c3             	mov    rbx,rax
  aab2cf:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  aab2d4:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0
  aab2da:	48 85 ff             	test   rdi,rdi
  aab2dd:	74 0b                	je     aab2ea <JNI_OnUnload@@Base+0x32bb7>
  aab2df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  aab2e2:	ff 50 08             	call   QWORD PTR [rax+0x8]
  aab2e5:	eb 03                	jmp    aab2ea <JNI_OnUnload@@Base+0x32bb7>
  aab2e7:	48 89 c3             	mov    rbx,rax
  aab2ea:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  aab2ef:	e8 3c 0b 00 00       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
  aab2f4:	eb 31                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>
  aab2f6:	48 89 c3             	mov    rbx,rax
  aab2f9:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
  aab2fe:	e8 83 31 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aab303:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
  aab307:	e8 a6 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab30c:	31 ff                	xor    edi,edi
  aab30e:	e8 9f 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab313:	31 ff                	xor    edi,edi
  aab315:	e8 98 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  aab31a:	4c 89 f7             	mov    rdi,r14
  aab31d:	e8 fe 2b d4 00       	call   17edf20 <_ZdlPv@plt>
  aab322:	eb 03                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>
  aab324:	48 89 c3             	mov    rbx,rax
  aab327:	48 89 df             	mov    rdi,rbx
  aab32a:	e8 76 e7 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  aab32f:	cc                   	int3
  aab330:	41 56                	push   r14
  aab332:	53                   	push   rbx
  aab333:	50                   	push   rax
  aab334:	48 89 fb             	mov    rbx,rdi
  aab337:	0f 57 c0             	xorps  xmm0,xmm0
  aab33a:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  aab33d:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]
  aab341:	48 85 ff             	test   rdi,rdi
  aab344:	74 17                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>
  aab346:	49 89 f6             	mov    r14,rsi
  aab349:	e8 f2 2d d4 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
  aab34e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  aab352:	48 85 c0             	test   rax,rax
  aab355:	74 06                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>
  aab357:	49 8b 06             	mov    rax,QWORD PTR [r14]
  aab35a:	48 89 03             	mov    QWORD PTR [rbx],rax
  aab35d:	48 83 c4 08          	add    rsp,0x8
  aab361:	5b                   	pop    rbx
  aab362:	41 5e                	pop    r14
  aab364:	c3                   	ret
  aab365:	cc                   	int3
  aab366:	48 8b 05 d3 81 f3 00 	mov    rax,QWORD PTR [rip+0xf381d3]        # 19e3540 <__cxa_new_handler@@Base+0x2dd0>
  aab36d:	48 85 c0             	test   rax,rax
  aab370:	74 01                	je     aab373 <JNI_OnUnload@@Base+0x32c40>
  aab372:	c3                   	ret
  aab373:	50                   	push   rax
  aab374:	e8 46 ec fc ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  aab379:	cc                   	int3
  aab37a:	48 83 c7 08          	add    rdi,0x8
  aab37e:	e9 d5 0a 00 00       	jmp    aabe58 <JNI_OnUnload@@Base+0x33725>
  aab383:	cc                   	int3
  aab384:	53                   	push   rbx
  aab385:	48 89 fb             	mov    rbx,rdi
  aab388:	48 83 c7 08          	add    rdi,0x8
  aab38c:	e8 c7 0a 00 00       	call   aabe58 <JNI_OnUnload@@Base+0x33725>
  aab391:	48 89 df             	mov    rdi,rbx
  aab394:	5b                   	pop    rbx
  aab395:	e9 86 2b d4 00       	jmp    17edf20 <_ZdlPv@plt>
  aab39a:	50                   	push   rax
  aab39b:	48 83 c7 28          	add    rdi,0x28
  aab39f:	e8 02 06 00 00       	call   aab9a6 <JNI_OnUnload@@Base+0x33273>
  aab3a4:	59                   	pop    rcx
  aab3a5:	c3                   	ret
  aab3a6:	55                   	push   rbp
  aab3a7:	41 57                	push   r15
  aab3a9:	41 56                	push   r14
  aab3ab:	41 55                	push   r13
  aab3ad:	41 54                	push   r12
  aab3af:	53                   	push   rbx
  aab3b0:	48 83 ec 68          	sub    rsp,0x68
  aab3b4:	45 89 c6             	mov    r14d,r8d
  aab3b7:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx
  aab3bb:	49 89 ff             	mov    r15,rdi
  aab3be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aab3c5:	00 00
  aab3c7:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  aab3cc:	48 8d 77 08          	lea    rsi,[rdi+0x8]
  aab3d0:	48 8b 6f 28          	mov    rbp,QWORD PTR [rdi+0x28]
  aab3d4:	48 8b 5f 30          	mov    rbx,QWORD PTR [rdi+0x30]
  aab3d8:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
  aab3dd:	4c 89 e7             	mov    rdi,r12
  aab3e0:	e8 4b ff ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  aab3e5:	4d 8b 2c 24          	mov    r13,QWORD PTR [r12]
  aab3e9:	4d 85 ed             	test   r13,r13
  aab3ec:	74 53                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab3ee:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]
  aab3f2:	4d 85 e4             	test   r12,r12
  aab3f5:	74 46                	je     aab43d <JNI_OnUnload@@Base+0x32d0a>
  aab3f7:	48 89 e8             	mov    rax,rbp
  aab3fa:	31 ed                	xor    ebp,ebp
  aab3fc:	48 85 c0             	test   rax,rax
  aab3ff:	74 40                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab401:	48 85 db             	test   rbx,rbx
  aab404:	78 3b                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab406:	49 89 c7             	mov    r15,rax
  aab409:	44 89 f0             	mov    eax,r14d
  aab40c:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]
  aab410:	09 d0                	or     eax,edx
  aab412:	78 2d                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab414:	41 8b 8c 24 e0 13 00 	mov    ecx,DWORD PTR [r12+0x13e0]
  aab41b:	00
  aab41c:	8d 41 fd             	lea    eax,[rcx-0x3]
  aab41f:	83 f8 fe             	cmp    eax,0xfffffffe
  aab422:	72 1d                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab424:	89 d0                	mov    eax,edx
  aab426:	31 ed                	xor    ebp,ebp
  aab428:	48 29 c3             	sub    rbx,rax
  aab42b:	72 14                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab42d:	44 89 f2             	mov    edx,r14d
  aab430:	48 39 d3             	cmp    rbx,rdx
  aab433:	72 0c                	jb     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab435:	4c 89 fa             	mov    rdx,r15
  aab438:	4c 01 f8             	add    rax,r15
  aab43b:	73 3c                	jae    aab479 <JNI_OnUnload@@Base+0x32d46>
  aab43d:	31 ed                	xor    ebp,ebp
  aab43f:	eb 00                	jmp    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab441:	4d 85 ed             	test   r13,r13
  aab444:	0f 95 c3             	setne  bl
  aab447:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  aab44c:	e8 35 30 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aab451:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  aab458:	00 00
  aab45a:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
  aab45f:	0f 85 39 01 00 00    	jne    aab59e <JNI_OnUnload@@Base+0x32e6b>
  aab465:	40 20 eb             	and    bl,bpl
  aab468:	89 d8                	mov    eax,ebx
  aab46a:	48 83 c4 68          	add    rsp,0x68
  aab46e:	5b                   	pop    rbx
  aab46f:	41 5c                	pop    r12
  aab471:	41 5d                	pop    r13
  aab473:	41 5e                	pop    r14
  aab475:	41 5f                	pop    r15
  aab477:	5d                   	pop    rbp
  aab478:	c3                   	ret
  aab479:	31 ed                	xor    ebp,ebp
  aab47b:	48 85 c0             	test   rax,rax
  aab47e:	74 c1                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab480:	83 e0 01             	and    eax,0x1
  aab483:	75 bc                	jne    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab485:	01 c9                	add    ecx,ecx
  aab487:	31 ed                	xor    ebp,ebp
  aab489:	44 89 f0             	mov    eax,r14d
  aab48c:	31 d2                	xor    edx,edx
  aab48e:	f7 f1                	div    ecx
  aab490:	85 d2                	test   edx,edx
  aab492:	75 ad                	jne    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab494:	45 85 f6             	test   r14d,r14d
  aab497:	74 47                	je     aab4e0 <JNI_OnUnload@@Base+0x32dad>
  aab499:	49 8b 9c 24 e8 13 00 	mov    rbx,QWORD PTR [r12+0x13e8]
  aab4a0:	00
  aab4a1:	49 83 a4 24 e8 13 00 	and    QWORD PTR [r12+0x13e8],0x0
  aab4a8:	00 00
  aab4aa:	4d 63 f6             	movsxd r14,r14d
  aab4ad:	49 d1 ee             	shr    r14,1
  aab4b0:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
  aab4b5:	48 85 db             	test   rbx,rbx
  aab4b8:	74 2e                	je     aab4e8 <JNI_OnUnload@@Base+0x32db5>
  aab4ba:	6a 01                	push   0x1
  aab4bc:	5a                   	pop    rdx
  aab4bd:	48 89 df             	mov    rdi,rbx
  aab4c0:	4c 89 f6             	mov    rsi,r14
  aab4c3:	e8 fe f5 aa 00       	call   155aac6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a004a>
  aab4c8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  aab4cb:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  aab4cf:	4c 89 73 20          	mov    QWORD PTR [rbx+0x20],r14
  aab4d3:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0
  aab4d7:	c7 43 2c 00 00 80 3f 	mov    DWORD PTR [rbx+0x2c],0x3f800000
  aab4de:	eb 66                	jmp    aab546 <JNI_OnUnload@@Base+0x32e13>
  aab4e0:	40 b5 01             	mov    bpl,0x1
  aab4e3:	e9 59 ff ff ff       	jmp    aab441 <JNI_OnUnload@@Base+0x32d0e>
  aab4e8:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  aab4ed:	4c 89 f6             	mov    rsi,r14
  aab4f0:	e8 0f d7 ff ff       	call   aa8c04 <JNI_OnUnload@@Base+0x304d1>
  aab4f5:	48 8d 54 24 47       	lea    rdx,[rsp+0x47]
  aab4fa:	c6 02 00             	mov    BYTE PTR [rdx],0x0
  aab4fd:	48 8d 4c 24 18       	lea    rcx,[rsp+0x18]
  aab502:	c7 01 00 00 80 3f    	mov    DWORD PTR [rcx],0x3f800000
  aab508:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  aab50d:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
```
## Direct call-site windows mentioning `aab330`

| addr | instruction |
|---:|---|
| `0xa7c4b9` | `a7c4b9:	48 83 ec 28          	sub    rsp,0x28` |
| `0xa7c4bd` | `a7c4bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa7c4c4` | `a7c4c4:	00 00` |
| `0xa7c4c6` | `a7c4c6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xa7c4cb` | `a7c4cb:	48 89 e3             	mov    rbx,rsp` |
| `0xa7c4ce` | `a7c4ce:	48 89 df             	mov    rdi,rbx` |
| `0xa7c4d1` | `a7c4d1:	e8 4e 9d d5 00       	call   17d6224 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x2045>` |
| `0xa7c4d6` | `a7c4d6:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]` |
| `0xa7c4db` | `a7c4db:	4c 89 f7             	mov    rdi,r14` |
| `0xa7c4de` | `a7c4de:	48 89 de             	mov    rsi,rbx` |
| `0xa7c4e1` | `a7c4e1:	e8 4a ee 02 00       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xa7c4e6` | `a7c4e6:	49 8b 1e             	mov    rbx,QWORD PTR [r14]` |
| `0xa7c4e9` | `a7c4e9:	48 85 db             	test   rbx,rbx` |
| `0xa7c4ec` | `a7c4ec:	74 49                	je     a7c537 <JNI_OnUnload@@Base+0x3e04>` |
| `0xa7c4ee` | `a7c4ee:	48 89 df             	mov    rdi,rbx` |
| `0xa7c4f1` | `a7c4f1:	e8 b4 a0 d5 00       	call   17d65aa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x23cb>` |
| `0xa7c4f6` | `a7c4f6:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xa7c4fb` | `a7c4fb:	74 2f                	je     a7c52c <JNI_OnUnload@@Base+0x3df9>` |
| `0xa7c4fd` | `a7c4fd:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]` |
| `0xa7c501` | `a7c501:	e8 d8 b1 03 00       	call   ab76de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x467e>` |
| `0xa7c506` | `a7c506:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0` |
| `0xa7c50b` | `a7c50b:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]` |
| `0xa7c50f` | `a7c50f:	48 85 c0             	test   rax,rax` |
| `0xa7c512` | `a7c512:	74 13                	je     a7c527 <JNI_OnUnload@@Base+0x3df4>` |
| `0xa7c514` | `a7c514:	31 c9                	xor    ecx,ecx` |
| `0xa7c516` | `a7c516:	48 8b 53 28          	mov    rdx,QWORD PTR [rbx+0x28]` |
| `0xaaaf18` | `aaaf18:	44 89 c5             	mov    ebp,r8d` |
| `0xaaaf1b` | `aaaf1b:	41 89 cc             	mov    r12d,ecx` |
| `0xaaaf1e` | `aaaf1e:	89 d3                	mov    ebx,edx` |
| `0xaaaf20` | `aaaf20:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi` |
| `0xaaaf25` | `aaaf25:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaaaf2c` | `aaaf2c:	00 00` |
| `0xaaaf2e` | `aaaf2e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0xaaaf33` | `aaaf33:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaaaf37` | `aaaf37:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]` |
| `0xaaaf3c` | `aaaf3c:	4c 89 f7             	mov    rdi,r14` |
| `0xaaaf3f` | `aaaf3f:	e8 ec 03 00 00       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaaaf44` | `aaaf44:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaaaf47` | `aaaf47:	45 31 ff             	xor    r15d,r15d` |
| `0xaaaf4a` | `aaaf4a:	4d 85 f6             	test   r14,r14` |
| `0xaaaf4d` | `aaaf4d:	0f 84 95 02 00 00    	je     aab1e8 <JNI_OnUnload@@Base+0x32ab5>` |
| `0xaaaf53` | `aaaf53:	84 db                	test   bl,bl` |
| `0xaaaf55` | `aaaf55:	0f 95 44 24 30       	setne  BYTE PTR [rsp+0x30]` |
| `0xaaaf5a` | `aaaf5a:	45 84 ed             	test   r13b,r13b` |
| `0xaaaf5d` | `aaaf5d:	66 0f 6e 44 24 04    	movd   xmm0,DWORD PTR [rsp+0x4]` |
| `0xaaaf63` | `aaaf63:	66 0f 7e c0          	movd   eax,xmm0` |
| `0xaaaf67` | `aaaf67:	44 0f 45 f8          	cmovne r15d,eax` |
| `0xaaaf6b` | `aaaf6b:	44 89 64 24 34       	mov    DWORD PTR [rsp+0x34],r12d` |
| `0xaaaf70` | `aaaf70:	89 6c 24 38          	mov    DWORD PTR [rsp+0x38],ebp` |
| `0xaaaf74` | `aaaf74:	44 89 7c 24 3c       	mov    DWORD PTR [rsp+0x3c],r15d` |
| `0xaaaf79` | `aaaf79:	f3 0f 10 04 24       	movss  xmm0,DWORD PTR [rsp]` |
| `0xaaaf7e` | `aaaf7e:	f3 0f 11 44 24 40    	movss  DWORD PTR [rsp+0x40],xmm0` |
| `0xaaafe1` | `aaafe1:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]` |
| `0xaaafe6` | `aaafe6:	48 8d 05 13 2c d5 00 	lea    rax,[rip+0xd52c13]        # 17fdc00 <_ZTINSt6__ndk117bad_function_callE@@Base+0xca0>` |
| `0xaaafed` | `aaafed:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xaaaff0` | `aaaff0:	4c 89 f6             	mov    rsi,r14` |
| `0xaaaff3` | `aaaff3:	48 83 c6 08          	add    rsi,0x8` |
| `0xaaaff7` | `aaaff7:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0` |
| `0xaaaffc` | `aaaffc:	49 83 66 18 00       	and    QWORD PTR [r14+0x18],0x0` |
| `0xaab001` | `aab001:	4d 89 7e 20          	mov    QWORD PTR [r14+0x20],r15` |
| `0xaab005` | `aab005:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]` |
| `0xaab00a` | `aab00a:	48 89 df             	mov    rdi,rbx` |
| `0xaab00d` | `aab00d:	e8 1e 03 00 00       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab012` | `aab012:	4c 8b 23             	mov    r12,QWORD PTR [rbx]` |
| `0xaab015` | `aab015:	4d 85 e4             	test   r12,r12` |
| `0xaab018` | `aab018:	0f 84 49 01 00 00    	je     aab167 <JNI_OnUnload@@Base+0x32a34>` |
| `0xaab01e` | `aab01e:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12` |
| `0xaab023` | `aab023:	c6 44 24 38 01       	mov    BYTE PTR [rsp+0x38],0x1` |
| `0xaab028` | `aab028:	4c 89 e7             	mov    rdi,r12` |
| `0xaab02b` | `aab02b:	e8 c0 30 d4 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0xaab030` | `aab030:	49 8d 7c 24 38       	lea    rdi,[r12+0x38]` |
| `0xaab035` | `aab035:	4c 89 fe             	mov    rsi,r15` |
| `0xaab038` | `aab038:	e8 33 ec ff ff       	call   aa9c70 <JNI_OnUnload@@Base+0x3153d>` |
| `0xaab03d` | `aab03d:	49 83 c4 40          	add    r12,0x40` |
| `0xaab041` | `aab041:	4c 39 e0             	cmp    rax,r12` |
| `0xaab044` | `aab044:	0f 84 0d 01 00 00    	je     aab157 <JNI_OnUnload@@Base+0x32a24>` |
| `0xaab04a` | `aab04a:	48 8b 58 28          	mov    rbx,QWORD PTR [rax+0x28]` |
| `0xaab04e` | `aab04e:	e9 06 01 00 00       	jmp    aab159 <JNI_OnUnload@@Base+0x32a26>` |
| `0xaab30e` | `aab30e:	e8 9f 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xaab313` | `aab313:	31 ff                	xor    edi,edi` |
| `0xaab315` | `aab315:	e8 98 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xaab31a` | `aab31a:	4c 89 f7             	mov    rdi,r14` |
| `0xaab31d` | `aab31d:	e8 fe 2b d4 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xaab322` | `aab322:	eb 03                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>` |
| `0xaab324` | `aab324:	48 89 c3             	mov    rbx,rax` |
| `0xaab327` | `aab327:	48 89 df             	mov    rdi,rbx` |
| `0xaab32a` | `aab32a:	e8 76 e7 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xaab32f` | `aab32f:	cc                   	int3` |
| `0xaab330` | `aab330:	41 56                	push   r14` |
| `0xaab332` | `aab332:	53                   	push   rbx` |
| `0xaab333` | `aab333:	50                   	push   rax` |
| `0xaab334` | `aab334:	48 89 fb             	mov    rbx,rdi` |
| `0xaab337` | `aab337:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xaab33a` | `aab33a:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0xaab33d` | `aab33d:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]` |
| `0xaab341` | `aab341:	48 85 ff             	test   rdi,rdi` |
| `0xaab344` | `aab344:	74 17                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>` |
| `0xaab346` | `aab346:	49 89 f6             	mov    r14,rsi` |
| `0xaab349` | `aab349:	e8 f2 2d d4 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>` |
| `0xaab34e` | `aab34e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0xaab352` | `aab352:	48 85 c0             	test   rax,rax` |
| `0xaab355` | `aab355:	74 06                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>` |
| `0xaab357` | `aab357:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xaab35a` | `aab35a:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xaab3b7` | `aab3b7:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx` |
| `0xaab3bb` | `aab3bb:	49 89 ff             	mov    r15,rdi` |
| `0xaab3be` | `aab3be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab3c5` | `aab3c5:	00 00` |
| `0xaab3c7` | `aab3c7:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0xaab3cc` | `aab3cc:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab3d0` | `aab3d0:	48 8b 6f 28          	mov    rbp,QWORD PTR [rdi+0x28]` |
| `0xaab3d4` | `aab3d4:	48 8b 5f 30          	mov    rbx,QWORD PTR [rdi+0x30]` |
| `0xaab3d8` | `aab3d8:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]` |
| `0xaab3dd` | `aab3dd:	4c 89 e7             	mov    rdi,r12` |
| `0xaab3e0` | `aab3e0:	e8 4b ff ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab3e5` | `aab3e5:	4d 8b 2c 24          	mov    r13,QWORD PTR [r12]` |
| `0xaab3e9` | `aab3e9:	4d 85 ed             	test   r13,r13` |
| `0xaab3ec` | `aab3ec:	74 53                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab3ee` | `aab3ee:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]` |
| `0xaab3f2` | `aab3f2:	4d 85 e4             	test   r12,r12` |
| `0xaab3f5` | `aab3f5:	74 46                	je     aab43d <JNI_OnUnload@@Base+0x32d0a>` |
| `0xaab3f7` | `aab3f7:	48 89 e8             	mov    rax,rbp` |
| `0xaab3fa` | `aab3fa:	31 ed                	xor    ebp,ebp` |
| `0xaab3fc` | `aab3fc:	48 85 c0             	test   rax,rax` |
| `0xaab3ff` | `aab3ff:	74 40                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab401` | `aab401:	48 85 db             	test   rbx,rbx` |
| `0xaab404` | `aab404:	78 3b                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab406` | `aab406:	49 89 c7             	mov    r15,rax` |
| `0xaab409` | `aab409:	44 89 f0             	mov    eax,r14d` |
| `0xaab40c` | `aab40c:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]` |
| `0xaab5e5` | `aab5e5:	41 56                	push   r14` |
| `0xaab5e7` | `aab5e7:	53                   	push   rbx` |
| `0xaab5e8` | `aab5e8:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaab5ec` | `aab5ec:	48 89 fb             	mov    rbx,rdi` |
| `0xaab5ef` | `aab5ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab5f6` | `aab5f6:	00 00` |
| `0xaab5f8` | `aab5f8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaab5fd` | `aab5fd:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab601` | `aab601:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xaab606` | `aab606:	4c 89 f7             	mov    rdi,r14` |
| `0xaab609` | `aab609:	e8 22 fd ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab60e` | `aab60e:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaab611` | `aab611:	4d 85 f6             	test   r14,r14` |
| `0xaab614` | `aab614:	74 42                	je     aab658 <JNI_OnUnload@@Base+0x32f25>` |
| `0xaab616` | `aab616:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]` |
| `0xaab61a` | `aab61a:	4d 85 ff             	test   r15,r15` |
| `0xaab61d` | `aab61d:	74 3b                	je     aab65a <JNI_OnUnload@@Base+0x32f27>` |
| `0xaab61f` | `aab61f:	40 b5 01             	mov    bpl,0x1` |
| `0xaab622` | `aab622:	41 80 bf e4 13 00 00 	cmp    BYTE PTR [r15+0x13e4],0x0` |
| `0xaab629` | `aab629:	00` |
| `0xaab62a` | `aab62a:	75 30                	jne    aab65c <JNI_OnUnload@@Base+0x32f29>` |
| `0xaab62c` | `aab62c:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xaab62f` | `aab62f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xaab634` | `aab634:	48 83 26 00          	and    QWORD PTR [rsi],0x0` |
| `0xaab638` | `aab638:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xaab63b` | `aab63b:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xaab6c6` | `aab6c6:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaab6ca` | `aab6ca:	48 89 fb             	mov    rbx,rdi` |
| `0xaab6cd` | `aab6cd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab6d4` | `aab6d4:	00 00` |
| `0xaab6d6` | `aab6d6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaab6db` | `aab6db:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab6df` | `aab6df:	4c 8b 7f 38          	mov    r15,QWORD PTR [rdi+0x38]` |
| `0xaab6e3` | `aab6e3:	48 8b 6f 40          	mov    rbp,QWORD PTR [rdi+0x40]` |
| `0xaab6e7` | `aab6e7:	49 89 e6             	mov    r14,rsp` |
| `0xaab6ea` | `aab6ea:	4c 89 f7             	mov    rdi,r14` |
| `0xaab6ed` | `aab6ed:	e8 3e fc ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab6f2` | `aab6f2:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0` |
| `0xaab6f6` | `aab6f6:	74 49                	je     aab741 <JNI_OnUnload@@Base+0x3300e>` |
| `0xaab6f8` | `aab6f8:	4c 8b 73 18          	mov    r14,QWORD PTR [rbx+0x18]` |
| `0xaab6fc` | `aab6fc:	31 db                	xor    ebx,ebx` |
| `0xaab6fe` | `aab6fe:	4d 85 f6             	test   r14,r14` |
| `0xaab701` | `aab701:	0f 84 da 00 00 00    	je     aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab707` | `aab707:	48 85 ed             	test   rbp,rbp` |
| `0xaab70a` | `aab70a:	0f 88 d1 00 00 00    	js     aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab710` | `aab710:	74 15                	je     aab727 <JNI_OnUnload@@Base+0x32ff4>` |
| `0xaab712` | `aab712:	4d 85 ff             	test   r15,r15` |
| `0xaab715` | `aab715:	0f 84 c6 00 00 00    	je     aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab71b` | `aab71b:	44 89 f8             	mov    eax,r15d` |
| `0xaab71e` | `aab71e:	83 e0 01             	and    eax,0x1` |
| `0xaab721` | `aab721:	0f 85 ba 00 00 00    	jne    aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab727` | `aab727:	4d 8d ae f0 13 00 00 	lea    r13,[r14+0x13f0]` |
| `0xaab845` | `aab845:	41 56                	push   r14` |
| `0xaab847` | `aab847:	53                   	push   rbx` |
| `0xaab848` | `aab848:	48 83 ec 20          	sub    rsp,0x20` |
| `0xaab84c` | `aab84c:	48 89 fb             	mov    rbx,rdi` |
| `0xaab84f` | `aab84f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab856` | `aab856:	00 00` |
| `0xaab858` | `aab858:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xaab85d` | `aab85d:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab861` | `aab861:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xaab866` | `aab866:	4c 89 f7             	mov    rdi,r14` |
| `0xaab869` | `aab869:	e8 c2 fa ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab86e` | `aab86e:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaab871` | `aab871:	4d 85 f6             	test   r14,r14` |
| `0xaab874` | `aab874:	74 16                	je     aab88c <JNI_OnUnload@@Base+0x33159>` |
| `0xaab876` | `aab876:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]` |
| `0xaab87a` | `aab87a:	48 85 c0             	test   rax,rax` |
| `0xaab87d` | `aab87d:	74 0f                	je     aab88e <JNI_OnUnload@@Base+0x3315b>` |
| `0xaab87f` | `aab87f:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0xaab882` | `aab882:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xaab885` | `aab885:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xaab888` | `aab888:	89 c3                	mov    ebx,eax` |
| `0xaab88a` | `aab88a:	eb 04                	jmp    aab890 <JNI_OnUnload@@Base+0x3315d>` |
| `0xaab88c` | `aab88c:	eb 02                	jmp    aab890 <JNI_OnUnload@@Base+0x3315d>` |
| `0xaab88e` | `aab88e:	31 db                	xor    ebx,ebx` |
| `0xaab890` | `aab890:	4d 85 f6             	test   r14,r14` |
| `0xaab893` | `aab893:	40 0f 95 c5          	setne  bpl` |
| `0xaab8df` | `aab8df:	53                   	push   rbx` |
| `0xaab8e0` | `aab8e0:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaab8e4` | `aab8e4:	48 89 d3             	mov    rbx,rdx` |
| `0xaab8e7` | `aab8e7:	49 89 fe             	mov    r14,rdi` |
| `0xaab8ea` | `aab8ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab8f1` | `aab8f1:	00 00` |
| `0xaab8f3` | `aab8f3:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaab8f8` | `aab8f8:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab8fc` | `aab8fc:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]` |
| `0xaab901` | `aab901:	4c 89 ff             	mov    rdi,r15` |
| `0xaab904` | `aab904:	e8 27 fa ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab909` | `aab909:	4d 8b 3f             	mov    r15,QWORD PTR [r15]` |
| `0xaab90c` | `aab90c:	4d 85 ff             	test   r15,r15` |
| `0xaab90f` | `aab90f:	74 4b                	je     aab95c <JNI_OnUnload@@Base+0x33229>` |
| `0xaab911` | `aab911:	4d 8b 76 18          	mov    r14,QWORD PTR [r14+0x18]` |
| `0xaab915` | `aab915:	31 ed                	xor    ebp,ebp` |
| `0xaab917` | `aab917:	4d 85 f6             	test   r14,r14` |
| `0xaab91a` | `aab91a:	74 40                	je     aab95c <JNI_OnUnload@@Base+0x33229>` |
| `0xaab91c` | `aab91c:	48 85 db             	test   rbx,rbx` |
| `0xaab91f` | `aab91f:	78 3b                	js     aab95c <JNI_OnUnload@@Base+0x33229>` |
| `0xaab921` | `aab921:	49 83 be f0 13 00 00 	cmp    QWORD PTR [r14+0x13f0],0x0` |
| `0xaab928` | `aab928:	00` |
| `0xaab929` | `aab929:	74 13                	je     aab93e <JNI_OnUnload@@Base+0x3320b>` |
| `0xaab92b` | `aab92b:	49 8d b6 f0 13 00 00 	lea    rsi,[r14+0x13f0]` |
| `0xaab932` | `aab932:	49 8d be e8 13 00 00 	lea    rdi,[r14+0x13e8]` |
| `0xaab939` | `aab939:	e8 02 05 00 00       	call   aabe40 <JNI_OnUnload@@Base+0x3370d>` |
| `0xaabe5c` | `aabe5c:	41 54                	push   r12` |
| `0xaabe5e` | `aabe5e:	53                   	push   rbx` |
| `0xaabe5f` | `aabe5f:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaabe63` | `aabe63:	48 89 fb             	mov    rbx,rdi` |
| `0xaabe66` | `aabe66:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaabe6d` | `aabe6d:	00 00` |
| `0xaabe6f` | `aabe6f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaabe74` | `aabe74:	49 89 e6             	mov    r14,rsp` |
| `0xaabe77` | `aabe77:	4c 89 f7             	mov    rdi,r14` |
| `0xaabe7a` | `aabe7a:	48 89 de             	mov    rsi,rbx` |
| `0xaabe7d` | `aabe7d:	e8 ae f4 ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaabe82` | `aabe82:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaabe85` | `aabe85:	4d 85 f6             	test   r14,r14` |
| `0xaabe88` | `aabe88:	74 71                	je     aabefb <JNI_OnUnload@@Base+0x337c8>` |
| `0xaabe8a` | `aabe8a:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]` |
| `0xaabe8e` | `aabe8e:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14` |
| `0xaabe93` | `aabe93:	c6 44 24 18 01       	mov    BYTE PTR [rsp+0x18],0x1` |
| `0xaabe98` | `aabe98:	4c 89 f7             	mov    rdi,r14` |
| `0xaabe9b` | `aabe9b:	e8 50 22 d4 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0xaabea0` | `aabea0:	4d 8d 66 38          	lea    r12,[r14+0x38]` |
| `0xaabea4` | `aabea4:	4c 89 e7             	mov    rdi,r12` |
| `0xaabea7` | `aabea7:	4c 89 fe             	mov    rsi,r15` |
| `0xaabeaa` | `aabeaa:	e8 c1 dd ff ff       	call   aa9c70 <JNI_OnUnload@@Base+0x3153d>` |
| `0xaabeaf` | `aabeaf:	49 89 c7             	mov    r15,rax` |
| `0xaabeb2` | `aabeb2:	49 8d 46 40          	lea    rax,[r14+0x40]` |
| `0xaabeb6` | `aabeb6:	49 39 c7             	cmp    r15,rax` |
| `0xad5fdc` | `ad5fdc:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]` |
| `0xad5fe1` | `ad5fe1:	49 39 ee             	cmp    r14,rbp` |
| `0xad5fe4` | `ad5fe4:	74 74                	je     ad605a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22ffa>` |
| `0xad5fe6` | `ad5fe6:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]` |
| `0xad5feb` | `ad5feb:	4c 8d 25 8a bf 97 ff 	lea    r12,[rip+0xffffffffff97bf8a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>` |
| `0xad5ff2` | `ad5ff2:	4c 8d 2d 9a f0 87 ff 	lea    r13,[rip+0xffffffffff87f09a]        # 355093 <_ZTSSt12bad_any_cast@@Base-0x3b135>` |
| `0xad5ff9` | `ad5ff9:	6a 03                	push   0x3` |
| `0xad5ffb` | `ad5ffb:	5b                   	pop    rbx` |
| `0xad5ffc` | `ad5ffc:	49 8d 76 20          	lea    rsi,[r14+0x20]` |
| `0xad6000` | `ad6000:	4c 89 ff             	mov    rdi,r15` |
| `0xad6003` | `ad6003:	e8 28 53 fd ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xad6008` | `ad6008:	48 83 7c 24 38 00    	cmp    QWORD PTR [rsp+0x38],0x0` |
| `0xad600e` | `ad600e:	74 30                	je     ad6040 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22fe0>` |
| `0xad6010` | `ad6010:	41 f6 46 30 01       	test   BYTE PTR [r14+0x30],0x1` |
| `0xad6015` | `ad6015:	74 06                	je     ad601d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22fbd>` |
| `0xad6017` | `ad6017:	4d 8b 46 40          	mov    r8,QWORD PTR [r14+0x40]` |
| `0xad601b` | `ad601b:	eb 04                	jmp    ad6021 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22fc1>` |
| `0xad601d` | `ad601d:	4d 8d 46 31          	lea    r8,[r14+0x31]` |
| `0xad6021` | `ad6021:	89 df                	mov    edi,ebx` |
| `0xad6023` | `ad6023:	4c 89 e6             	mov    rsi,r12` |
| `0xad6026` | `ad6026:	ba 4f 01 00 00       	mov    edx,0x14f` |
| `0xad602b` | `ad602b:	4c 89 e9             	mov    rcx,r13` |
| `0xad602e` | `ad602e:	31 c0                	xor    eax,eax` |
| `0xad6030` | `ad6030:	e8 9d 08 d0 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xad6035` | `ad6035:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]` |
| `0xad603a` | `ad603a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xadb9de` | `adb9de:	41 56                	push   r14` |
| `0xadb9e0` | `adb9e0:	53                   	push   rbx` |
| `0xadb9e1` | `adb9e1:	48 83 ec 78          	sub    rsp,0x78` |
| `0xadb9e5` | `adb9e5:	48 89 fb             	mov    rbx,rdi` |
| `0xadb9e8` | `adb9e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadb9ef` | `adb9ef:	00 00` |
| `0xadb9f1` | `adb9f1:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0xadb9f6` | `adb9f6:	48 8d b7 88 00 00 00 	lea    rsi,[rdi+0x88]` |
| `0xadb9fd` | `adb9fd:	49 89 e6             	mov    r14,rsp` |
| `0xadba00` | `adba00:	4c 89 f7             	mov    rdi,r14` |
| `0xadba03` | `adba03:	e8 28 f9 fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadba08` | `adba08:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0` |
| `0xadba0c` | `adba0c:	74 2a                	je     adba38 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x289d8>` |
| `0xadba0e` | `adba0e:	48 8d 73 30          	lea    rsi,[rbx+0x30]` |
| `0xadba12` | `adba12:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xadba17` | `adba17:	e8 7c ba ff ff       	call   ad7498 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24438>` |
| `0xadba1c` | `adba1c:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xadba21` | `adba21:	83 66 58 00          	and    DWORD PTR [rsi+0x58],0x0` |
| `0xadba25` | `adba25:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]` |
| `0xadba29` | `adba29:	e8 62 23 fe ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>` |
| `0xadba2e` | `adba2e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xadba33` | `adba33:	e8 30 00 00 00       	call   adba68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x28a08>` |
| `0xadba38` | `adba38:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xadba3d` | `adba3d:	e8 44 2a fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xadba42` | `adba42:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadba49` | `adba49:	00 00` |
| `0xadc0f6` | `adc0f6:	41 56                	push   r14` |
| `0xadc0f8` | `adc0f8:	53                   	push   rbx` |
| `0xadc0f9` | `adc0f9:	48 83 ec 78          	sub    rsp,0x78` |
| `0xadc0fd` | `adc0fd:	48 89 fb             	mov    rbx,rdi` |
| `0xadc100` | `adc100:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadc107` | `adc107:	00 00` |
| `0xadc109` | `adc109:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0xadc10e` | `adc10e:	48 8d 77 40          	lea    rsi,[rdi+0x40]` |
| `0xadc112` | `adc112:	49 89 e6             	mov    r14,rsp` |
| `0xadc115` | `adc115:	4c 89 f7             	mov    rdi,r14` |
| `0xadc118` | `adc118:	e8 13 f2 fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadc11d` | `adc11d:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0` |
| `0xadc121` | `adc121:	74 26                	je     adc149 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x290e9>` |
| `0xadc123` | `adc123:	0f 10 43 30          	movups xmm0,XMMWORD PTR [rbx+0x30]` |
| `0xadc127` | `adc127:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xadc12c` | `adc12c:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0` |
| `0xadc12f` | `adc12f:	c7 46 58 01 00 00 00 	mov    DWORD PTR [rsi+0x58],0x1` |
| `0xadc136` | `adc136:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]` |
| `0xadc13a` | `adc13a:	e8 51 1c fe ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>` |
| `0xadc13f` | `adc13f:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xadc144` | `adc144:	e8 1f f9 ff ff       	call   adba68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x28a08>` |
| `0xadc149` | `adc149:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xadc14e` | `adc14e:	e8 33 23 fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xadc153` | `adc153:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadc15a` | `adc15a:	00 00` |
| `0xadc15c` | `adc15c:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]` |
| `0xadf4a7` | `adf4a7:	41 56                	push   r14` |
| `0xadf4a9` | `adf4a9:	53                   	push   rbx` |
| `0xadf4aa` | `adf4aa:	48 83 ec 60          	sub    rsp,0x60` |
| `0xadf4ae` | `adf4ae:	49 89 f6             	mov    r14,rsi` |
| `0xadf4b1` | `adf4b1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadf4b8` | `adf4b8:	00 00` |
| `0xadf4ba` | `adf4ba:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax` |
| `0xadf4bf` | `adf4bf:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xadf4c3` | `adf4c3:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]` |
| `0xadf4c8` | `adf4c8:	48 89 df             	mov    rdi,rbx` |
| `0xadf4cb` | `adf4cb:	e8 60 be fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadf4d0` | `adf4d0:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xadf4d3` | `adf4d3:	48 85 c0             	test   rax,rax` |
| `0xadf4d6` | `adf4d6:	0f 84 96 00 00 00    	je     adf572 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c512>` |
| `0xadf4dc` | `adf4dc:	48 8b 58 10          	mov    rbx,QWORD PTR [rax+0x10]` |
| `0xadf4e0` | `adf4e0:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]` |
| `0xadf4e3` | `adf4e3:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0` |
| `0xadf4e7` | `adf4e7:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]` |
| `0xadf4eb` | `adf4eb:	48 85 c0             	test   rax,rax` |
| `0xadf4ee` | `adf4ee:	74 05                	je     adf4f5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c495>` |
| `0xadf4f0` | `adf4f0:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]` |
| `0xadf4f5` | `adf4f5:	41 8a 2e             	mov    bpl,BYTE PTR [r14]` |
| `0xadf4f8` | `adf4f8:	48 8d 05 19 27 97 ff 	lea    rax,[rip+0xffffffffff972719]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>` |
| `0xadf4ff` | `adf4ff:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xadf504` | `adf504:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0xadf509` | `adf509:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0` |
| `0xadf5ea` | `adf5ea:	41 56                	push   r14` |
| `0xadf5ec` | `adf5ec:	53                   	push   rbx` |
| `0xadf5ed` | `adf5ed:	48 83 ec 78          	sub    rsp,0x78` |
| `0xadf5f1` | `adf5f1:	49 89 fe             	mov    r14,rdi` |
| `0xadf5f4` | `adf5f4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadf5fb` | `adf5fb:	00 00` |
| `0xadf5fd` | `adf5fd:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0xadf602` | `adf602:	48 89 e3             	mov    rbx,rsp` |
| `0xadf605` | `adf605:	48 89 df             	mov    rdi,rbx` |
| `0xadf608` | `adf608:	4c 89 f6             	mov    rsi,r14` |
| `0xadf60b` | `adf60b:	e8 20 bd fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadf610` | `adf610:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xadf613` | `adf613:	48 85 db             	test   rbx,rbx` |
| `0xadf616` | `adf616:	0f 84 4b 01 00 00    	je     adf767 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c707>` |
| `0xadf61c` | `adf61c:	41 80 7e 10 00       	cmp    BYTE PTR [r14+0x10],0x0` |
| `0xadf621` | `adf621:	48 8d 05 3c 3f 96 ff 	lea    rax,[rip+0xffffffffff963f3c]        # 443564 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9170>` |
| `0xadf628` | `adf628:	4c 8d 05 31 3f 96 ff 	lea    r8,[rip+0xffffffffff963f31]        # 443560 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x916c>` |
| `0xadf62f` | `adf62f:	4c 0f 44 c0          	cmove  r8,rax` |
| `0xadf633` | `adf633:	48 8d 35 42 29 97 ff 	lea    rsi,[rip+0xffffffffff972942]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>` |
| `0xadf63a` | `adf63a:	48 8d 0d 5b 6b 89 ff 	lea    rcx,[rip+0xffffffffff896b5b]        # 37619c <_ZTSSt12bad_any_cast@@Base-0x1a02c>` |
| `0xadf641` | `adf641:	6a 04                	push   0x4` |
| `0xadf643` | `adf643:	5f                   	pop    rdi` |
| `0xadf644` | `adf644:	ba 86 00 00 00       	mov    edx,0x86` |
| `0xadf649` | `adf649:	31 c0                	xor    eax,eax` |
| `0xadf64b` | `adf64b:	e8 82 72 cf 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xadf650` | `adf650:	80 bb 08 01 00 00 00 	cmp    BYTE PTR [rbx+0x108],0x0` |
| `0xae061e` | `ae061e:	53                   	push   rbx` |
| `0xae061f` | `ae061f:	48 81 ec 88 00 00 00 	sub    rsp,0x88` |
| `0xae0626` | `ae0626:	49 89 fe             	mov    r14,rdi` |
| `0xae0629` | `ae0629:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xae0630` | `ae0630:	00 00` |
| `0xae0632` | `ae0632:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax` |
| `0xae0639` | `ae0639:	00` |
| `0xae063a` | `ae063a:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]` |
| `0xae063f` | `ae063f:	48 89 df             	mov    rdi,rbx` |
| `0xae0642` | `ae0642:	4c 89 f6             	mov    rsi,r14` |
| `0xae0645` | `ae0645:	e8 e6 ac fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xae064a` | `ae064a:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xae064d` | `ae064d:	48 85 db             	test   rbx,rbx` |
| `0xae0650` | `ae0650:	0f 84 5c 01 00 00    	je     ae07b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d752>` |
| `0xae0656` | `ae0656:	4d 8d 7e 10          	lea    r15,[r14+0x10]` |
| `0xae065a` | `ae065a:	80 bb c0 00 00 00 00 	cmp    BYTE PTR [rbx+0xc0],0x0` |
| `0xae0661` | `ae0661:	74 40                	je     ae06a3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d643>` |
| `0xae0663` | `ae0663:	41 8a 46 10          	mov    al,BYTE PTR [r14+0x10]` |
| `0xae0667` | `ae0667:	88 83 80 00 00 00    	mov    BYTE PTR [rbx+0x80],al` |
| `0xae066d` | `ae066d:	83 bb b0 00 00 00 ff 	cmp    DWORD PTR [rbx+0xb0],0xffffffff` |
| `0xae0674` | `ae0674:	41 8b 46 40          	mov    eax,DWORD PTR [r14+0x40]` |
| `0xae0678` | `ae0678:	75 05                	jne    ae067f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d61f>` |
| `0xae067a` | `ae067a:	83 f8 ff             	cmp    eax,0xffffffff` |
| `0xae067d` | `ae067d:	74 44                	je     ae06c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d663>` |
| `0xae067f` | `ae067f:	48 8d b3 88 00 00 00 	lea    rsi,[rbx+0x88]` |
| `0xae0686` | `ae0686:	83 f8 ff             	cmp    eax,0xffffffff` |
| `0xae0c44` | `ae0c44:	41 54                	push   r12` |
| `0xae0c46` | `ae0c46:	53                   	push   rbx` |
| `0xae0c47` | `ae0c47:	48 83 ec 20          	sub    rsp,0x20` |
| `0xae0c4b` | `ae0c4b:	49 89 fe             	mov    r14,rdi` |
| `0xae0c4e` | `ae0c4e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xae0c55` | `ae0c55:	00 00` |
| `0xae0c57` | `ae0c57:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xae0c5c` | `ae0c5c:	48 89 e3             	mov    rbx,rsp` |
| `0xae0c5f` | `ae0c5f:	48 89 df             	mov    rdi,rbx` |
| `0xae0c62` | `ae0c62:	4c 89 f6             	mov    rsi,r14` |
| `0xae0c65` | `ae0c65:	e8 c6 a6 fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xae0c6a` | `ae0c6a:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xae0c6d` | `ae0c6d:	48 85 db             	test   rbx,rbx` |
| `0xae0c70` | `ae0c70:	0f 84 b6 00 00 00    	je     ae0d2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dccc>` |
| `0xae0c76` | `ae0c76:	4c 8d bb 18 01 00 00 	lea    r15,[rbx+0x118]` |
| `0xae0c7d` | `ae0c7d:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]` |
| `0xae0c81` | `ae0c81:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xae0c86` | `ae0c86:	4c 89 ff             	mov    rdi,r15` |
| `0xae0c89` | `ae0c89:	e8 ee 00 00 00       	call   ae0d7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dd1c>` |
| `0xae0c8e` | `ae0c8e:	48 83 38 00          	cmp    QWORD PTR [rax],0x0` |
| `0xae0c92` | `ae0c92:	75 63                	jne    ae0cf7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dc97>` |
| `0xae0c94` | `ae0c94:	49 89 c4             	mov    r12,rax` |
| `0xae0c97` | `ae0c97:	6a 60                	push   0x60` |
| `0xae0c99` | `ae0c99:	5f                   	pop    rdi` |
| `0xae0c9a` | `ae0c9a:	e8 61 d2 d0 00       	call   17edf00 <_Znwm@plt>` |
| `0xae0c9f` | `ae0c9f:	49 89 c5             	mov    r13,rax` |
| `0xae0e9e` | `ae0e9e:	41 56                	push   r14` |
| `0xae0ea0` | `ae0ea0:	53                   	push   rbx` |
| `0xae0ea1` | `ae0ea1:	48 83 ec 20          	sub    rsp,0x20` |
| `0xae0ea5` | `ae0ea5:	48 89 fb             	mov    rbx,rdi` |
| `0xae0ea8` | `ae0ea8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xae0eaf` | `ae0eaf:	00 00` |
| `0xae0eb1` | `ae0eb1:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xae0eb6` | `ae0eb6:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xae0ebb` | `ae0ebb:	4c 89 f7             	mov    rdi,r14` |
| `0xae0ebe` | `ae0ebe:	48 89 de             	mov    rsi,rbx` |
| `0xae0ec1` | `ae0ec1:	e8 6a a4 fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xae0ec6` | `ae0ec6:	4d 8b 3e             	mov    r15,QWORD PTR [r14]` |
| `0xae0ec9` | `ae0ec9:	4d 85 ff             	test   r15,r15` |
| `0xae0ecc` | `ae0ecc:	74 7b                	je     ae0f49 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dee9>` |
| `0xae0ece` | `ae0ece:	4d 8b b7 20 01 00 00 	mov    r14,QWORD PTR [r15+0x120]` |
| `0xae0ed5` | `ae0ed5:	4d 85 f6             	test   r14,r14` |
| `0xae0ed8` | `ae0ed8:	74 6f                	je     ae0f49 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dee9>` |
| `0xae0eda` | `ae0eda:	49 8d 8f 20 01 00 00 	lea    rcx,[r15+0x120]` |
| `0xae0ee1` | `ae0ee1:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0xae0ee5` | `ae0ee5:	48 89 cb             	mov    rbx,rcx` |
| `0xae0ee8` | `ae0ee8:	4c 89 f2             	mov    rdx,r14` |
| `0xae0eeb` | `ae0eeb:	48 8d 72 08          	lea    rsi,[rdx+0x8]` |
| `0xae0eef` | `ae0eef:	48 39 42 20          	cmp    QWORD PTR [rdx+0x20],rax` |
| `0xae0ef3` | `ae0ef3:	48 0f 43 f2          	cmovae rsi,rdx` |
| `0xae0ef7` | `ae0ef7:	48 0f 43 da          	cmovae rbx,rdx` |
| `0xae0efb` | `ae0efb:	48 8b 16             	mov    rdx,QWORD PTR [rsi]` |
| `0xae5c31` | `ae5c31:	48 89 ca             	mov    rdx,rcx` |
| `0xae5c34` | `ae5c34:	f3 0f 5c 05 e0 8b 8a 	subss  xmm0,DWORD PTR [rip+0xffffffffff8a8be0]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>` |
| `0xae5c3b` | `ae5c3b:	ff` |
| `0xae5c3c` | `ae5c3c:	f3 48 0f 2c e8       	cvttss2si rbp,xmm0` |
| `0xae5c41` | `ae5c41:	48 c1 fa 3f          	sar    rdx,0x3f` |
| `0xae5c45` | `ae5c45:	48 21 d5             	and    rbp,rdx` |
| `0xae5c48` | `ae5c48:	48 09 cd             	or     rbp,rcx` |
| `0xae5c4b` | `ae5c4b:	48 39 e8             	cmp    rax,rbp` |
| `0xae5c4e` | `ae5c4e:	48 0f 47 e8          	cmova  rbp,rax` |
| `0xae5c52` | `ae5c52:	48 83 fd 01          	cmp    rbp,0x1` |
| `0xae5c56` | `ae5c56:	75 05                	jne    ae5c5d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32bfd>` |
| `0xae5c58` | `ae5c58:	6a 02                	push   0x2` |
| `0xae5c5a` | `ae5c5a:	5d                   	pop    rbp` |
| `0xae5c5b` | `ae5c5b:	eb 14                	jmp    ae5c71 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32c11>` |
| `0xae5c5d` | `ae5c5d:	48 8d 45 ff          	lea    rax,[rbp-0x1]` |
| `0xae5c61` | `ae5c61:	48 85 c5             	test   rbp,rax` |
| `0xae5c64` | `ae5c64:	74 0b                	je     ae5c71 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32c11>` |
| `0xae5c66` | `ae5c66:	48 89 ef             	mov    rdi,rbp` |
| `0xae5c69` | `ae5c69:	e8 72 83 d0 00       	call   17edfe0 <_ZNSt6__ndk112__next_primeEm@plt>` |
| `0xae5c6e` | `ae5c6e:	48 89 c5             	mov    rbp,rax` |
| `0xae5c71` | `ae5c71:	49 8b 5e 50          	mov    rbx,QWORD PTR [r14+0x50]` |
| `0xae5c75` | `ae5c75:	48 39 dd             	cmp    rbp,rbx` |
| `0xae5c78` | `ae5c78:	76 67                	jbe    ae5ce1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32c81>` |
| `0xae5c7a` | `ae5c7a:	49 89 ed             	mov    r13,rbp` |
| `0xae5c7d` | `ae5c7d:	4c 89 e8             	mov    rax,r13` |
| `0xae5c80` | `ae5c80:	48 c1 e8 3d          	shr    rax,0x3d` |
| `0xafdc05` | `afdc05:	48 83 ec 40          	sub    rsp,0x40` |
| `0xafdc09` | `afdc09:	48 89 f3             	mov    rbx,rsi` |
| `0xafdc0c` | `afdc0c:	49 89 fe             	mov    r14,rdi` |
| `0xafdc0f` | `afdc0f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xafdc16` | `afdc16:	00 00` |
| `0xafdc18` | `afdc18:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax` |
| `0xafdc1d` | `afdc1d:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xafdc20` | `afdc20:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0xafdc23` | `afdc23:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]` |
| `0xafdc28` | `afdc28:	4c 89 ff             	mov    rdi,r15` |
| `0xafdc2b` | `afdc2b:	e8 00 d7 fa ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xafdc30` | `afdc30:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]` |
| `0xafdc34` | `afdc34:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]` |
| `0xafdc38` | `afdc38:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0` |
| `0xafdc3c` | `afdc3c:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0` |
| `0xafdc41` | `afdc41:	48 85 c0             	test   rax,rax` |
| `0xafdc44` | `afdc44:	74 05                	je     afdc4b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4abeb>` |
| `0xafdc46` | `afdc46:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]` |
| `0xafdc4b` | `afdc4b:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]` |
| `0xafdc50` | `afdc50:	4c 89 f7             	mov    rdi,r14` |
| `0xafdc53` | `afdc53:	4c 89 fe             	mov    rsi,r15` |
| `0xafdc56` | `afdc56:	e8 7b a7 fd ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>` |
| `0xafdc5b` | `afdc5b:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xafdc5f` | `afdc5f:	e8 4e 08 fa ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xafdc64` | `afdc64:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xafdc68` | `afdc68:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xafdf55` | `afdf55:	cc                   	int3` |
| `0xafdf56` | `afdf56:	41 56                	push   r14` |
| `0xafdf58` | `afdf58:	53                   	push   rbx` |
| `0xafdf59` | `afdf59:	48 83 ec 58          	sub    rsp,0x58` |
| `0xafdf5d` | `afdf5d:	48 89 fe             	mov    rsi,rdi` |
| `0xafdf60` | `afdf60:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xafdf67` | `afdf67:	00 00` |
| `0xafdf69` | `afdf69:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax` |
| `0xafdf6e` | `afdf6e:	48 89 e3             	mov    rbx,rsp` |
| `0xafdf71` | `afdf71:	48 89 df             	mov    rdi,rbx` |
| `0xafdf74` | `afdf74:	e8 b7 d3 fa ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xafdf79` | `afdf79:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xafdf7c` | `afdf7c:	48 85 db             	test   rbx,rbx` |
| `0xafdf7f` | `afdf7f:	74 32                	je     afdfb3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4af53>` |
| `0xafdf81` | `afdf81:	48 8d 73 60          	lea    rsi,[rbx+0x60]` |
| `0xafdf85` | `afdf85:	48 8d 93 90 00 00 00 	lea    rdx,[rbx+0x90]` |
| `0xafdf8c` | `afdf8c:	48 8d 8b d0 00 00 00 	lea    rcx,[rbx+0xd0]` |
| `0xafdf93` | `afdf93:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]` |
| `0xafdf98` | `afdf98:	4c 89 f7             	mov    rdi,r14` |
| `0xafdf9b` | `afdf9b:	e8 6b f8 ff ff       	call   afd80b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4a7ab>` |
| `0xafdfa0` | `afdfa0:	48 89 df             	mov    rdi,rbx` |
| `0xafdfa3` | `afdfa3:	4c 89 f6             	mov    rsi,r14` |
| `0xafdfa6` | `afdfa6:	e8 5b fa ff ff       	call   afda06 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4a9a6>` |
| `0xafdfab` | `afdfab:	4c 89 f7             	mov    rdi,r14` |
| `0xafdfae` | `afdfae:	e8 d9 d3 ff ff       	call   afb38c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4832c>` |
| `0xafdfb3` | `afdfb3:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xafe5b2` | `afe5b2:	41 54                	push   r12` |
| `0xafe5b4` | `afe5b4:	53                   	push   rbx` |
| `0xafe5b5` | `afe5b5:	48 81 ec 50 01 00 00 	sub    rsp,0x150` |
| `0xafe5bc` | `afe5bc:	48 89 fe             	mov    rsi,rdi` |
| `0xafe5bf` | `afe5bf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xafe5c6` | `afe5c6:	00 00` |
| `0xafe5c8` | `afe5c8:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax` |
| `0xafe5cf` | `afe5cf:	00` |
| `0xafe5d0` | `afe5d0:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]` |
| `0xafe5d5` | `afe5d5:	48 89 df             	mov    rdi,rbx` |
| `0xafe5d8` | `afe5d8:	e8 53 cd fa ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xafe5dd` | `afe5dd:	4c 8b 2b             	mov    r13,QWORD PTR [rbx]` |
| `0xafe5e0` | `afe5e0:	4d 85 ed             	test   r13,r13` |
| `0xafe5e3` | `afe5e3:	0f 84 4a 02 00 00    	je     afe833 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4b7d3>` |
| `0xafe5e9` | `afe5e9:	49 8d 4d 60          	lea    rcx,[r13+0x60]` |
| `0xafe5ed` | `afe5ed:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]` |
| `0xafe5f4` | `afe5f4:	00` |
| `0xafe5f5` | `afe5f5:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xafe5f8` | `afe5f8:	0f 11 00             	movups XMMWORD PTR [rax],xmm0` |
| `0xafe5fb` | `afe5fb:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax` |
| `0xafe5ff` | `afe5ff:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0` |
| `0xafe603` | `afe603:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0` |
| `0xafe607` | `afe607:	c7 40 30 00 00 80 3f 	mov    DWORD PTR [rax+0x30],0x3f800000` |
| `0xafe60e` | `afe60e:	48 8d 35 d9 b7 84 ff 	lea    rsi,[rip+0xffffffffff84b7d9]        # 349dee <_ZTSSt12bad_any_cast@@Base-0x463da>` |
| `0xafe615` | `afe615:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]` |
| `0xafe61a` | `afe61a:	6a 09                	push   0x9` |
| `0xb0660f` | `b0660f:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0` |
| `0xb06614` | `b06614:	4d 85 e4             	test   r12,r12` |
| `0xb06617` | `b06617:	74 06                	je     b0661f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x535bf>` |
| `0xb06619` | `b06619:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]` |
| `0xb0661f` | `b0661f:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xb06622` | `b06622:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0` |
| `0xb06627` | `b06627:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]` |
| `0xb0662e` | `b0662e:	00` |
| `0xb0662f` | `b0662f:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xb06634` | `b06634:	4c 89 ff             	mov    rdi,r15` |
| `0xb06637` | `b06637:	e8 f4 4c fa ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb0663c` | `b0663c:	4d 8b 6f 08          	mov    r13,QWORD PTR [r15+0x8]` |
| `0xb06640` | `b06640:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]` |
| `0xb06644` | `b06644:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0` |
| `0xb0664b` | `b0664b:	00` |
| `0xb0664c` | `b0664c:	4d 85 ed             	test   r13,r13` |
| `0xb0664f` | `b0664f:	74 05                	je     b06656 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x535f6>` |
| `0xb06651` | `b06651:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]` |
| `0xb06656` | `b06656:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]` |
| `0xb0665b` | `b0665b:	48 8d ac 24 90 00 00 	lea    rbp,[rsp+0x90]` |
| `0xb06662` | `b06662:	00` |
| `0xb06663` | `b06663:	4c 89 ff             	mov    rdi,r15` |
| `0xb06666` | `b06666:	48 89 ee             	mov    rsi,rbp` |
| `0xb06669` | `b06669:	e8 68 1d fd ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>` |
| `0xb0666e` | `b0666e:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]` |
| `0xb06672` | `b06672:	e8 3b 7e f9 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xb08c99` | `b08c99:	49 89 d6             	mov    r14,rdx` |
| `0xb08c9c` | `b08c9c:	49 89 f7             	mov    r15,rsi` |
| `0xb08c9f` | `b08c9f:	48 89 fb             	mov    rbx,rdi` |
| `0xb08ca2` | `b08ca2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xb08ca9` | `b08ca9:	00 00` |
| `0xb08cab` | `b08cab:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xb08cb0` | `b08cb0:	4c 8b 67 10          	mov    r12,QWORD PTR [rdi+0x10]` |
| `0xb08cb4` | `b08cb4:	48 8d 77 18          	lea    rsi,[rdi+0x18]` |
| `0xb08cb8` | `b08cb8:	48 89 e5             	mov    rbp,rsp` |
| `0xb08cbb` | `b08cbb:	48 89 ef             	mov    rdi,rbp` |
| `0xb08cbe` | `b08cbe:	e8 6d 26 fa ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb08cc3` | `b08cc3:	48 83 7d 00 00       	cmp    QWORD PTR [rbp+0x0],0x0` |
| `0xb08cc8` | `b08cc8:	74 2b                	je     b08cf5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x55c95>` |
| `0xb08cca` | `b08cca:	4d 8b 45 00          	mov    r8,QWORD PTR [r13+0x0]` |
| `0xb08cce` | `b08cce:	4c 03 43 68          	add    r8,QWORD PTR [rbx+0x68]` |
| `0xb08cd2` | `b08cd2:	48 8b 4b 60          	mov    rcx,QWORD PTR [rbx+0x60]` |
| `0xb08cd6` | `b08cd6:	48 ff c1             	inc    rcx` |
| `0xb08cd9` | `b08cd9:	4c 8d 4b 70          	lea    r9,[rbx+0x70]` |
| `0xb08cdd` | `b08cdd:	48 8d 43 30          	lea    rax,[rbx+0x30]` |
| `0xb08ce1` | `b08ce1:	4c 89 e7             	mov    rdi,r12` |
| `0xb08ce4` | `b08ce4:	4c 89 fe             	mov    rsi,r15` |
| `0xb08ce7` | `b08ce7:	4c 89 f2             	mov    rdx,r14` |
| `0xb08cea` | `b08cea:	50                   	push   rax` |
| `0xb08ceb` | `b08ceb:	ff 73 78             	push   QWORD PTR [rbx+0x78]` |
| `0xb08cee` | `b08cee:	e8 6f eb ff ff       	call   b07862 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54802>` |
| `0xb08cf3` | `b08cf3:	58                   	pop    rax` |
| `0xb08e9b` | `b08e9b:	48 89 d3             	mov    rbx,rdx` |
| `0xb08e9e` | `b08e9e:	49 89 f7             	mov    r15,rsi` |
| `0xb08ea1` | `b08ea1:	49 89 fc             	mov    r12,rdi` |
| `0xb08ea4` | `b08ea4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xb08eab` | `b08eab:	00 00` |
| `0xb08ead` | `b08ead:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xb08eb2` | `b08eb2:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]` |
| `0xb08eb6` | `b08eb6:	48 8d 77 10          	lea    rsi,[rdi+0x10]` |
| `0xb08eba` | `b08eba:	48 89 e5             	mov    rbp,rsp` |
| `0xb08ebd` | `b08ebd:	48 89 ef             	mov    rdi,rbp` |
| `0xb08ec0` | `b08ec0:	e8 6b 24 fa ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb08ec5` | `b08ec5:	48 83 7d 00 00       	cmp    QWORD PTR [rbp+0x0],0x0` |
| `0xb08eca` | `b08eca:	74 5c                	je     b08f28 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x55ec8>` |
| `0xb08ecc` | `b08ecc:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xb08ed0` | `b08ed0:	49 01 86 f8 00 00 00 	add    QWORD PTR [r14+0xf8],rax` |
| `0xb08ed7` | `b08ed7:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]` |
| `0xb08edb` | `b08edb:	83 4b 10 01          	or     DWORD PTR [rbx+0x10],0x1` |
| `0xb08edf` | `b08edf:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc` |
| `0xb08ee3` | `b08ee3:	48 8d 7b 18          	lea    rdi,[rbx+0x18]` |
| `0xb08ee7` | `b08ee7:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |
| `0xb08eeb` | `b08eeb:	f6 c2 01             	test   dl,0x1` |
| `0xb08eee` | `b08eee:	75 60                	jne    b08f50 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x55ef0>` |
| `0xb08ef0` | `b08ef0:	e8 9d c8 c5 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0xb08ef5` | `b08ef5:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]` |
| `0xb08efa` | `b08efa:	41 80 7c 24 78 00    	cmp    BYTE PTR [r12+0x78],0x0` |
| `0xb08f00` | `b08f00:	74 0d                	je     b08f0f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x55eaf>` |
| `0xb0a3ef` | `b0a3ef:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0` |
| `0xb0a3f4` | `b0a3f4:	4d 85 e4             	test   r12,r12` |
| `0xb0a3f7` | `b0a3f7:	74 06                	je     b0a3ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5739f>` |
| `0xb0a3f9` | `b0a3f9:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]` |
| `0xb0a3ff` | `b0a3ff:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xb0a402` | `b0a402:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0` |
| `0xb0a407` | `b0a407:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]` |
| `0xb0a40e` | `b0a40e:	00` |
| `0xb0a40f` | `b0a40f:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xb0a414` | `b0a414:	4c 89 ff             	mov    rdi,r15` |
| `0xb0a417` | `b0a417:	e8 14 0f fa ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb0a41c` | `b0a41c:	4d 8b 6f 08          	mov    r13,QWORD PTR [r15+0x8]` |
| `0xb0a420` | `b0a420:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]` |
| `0xb0a424` | `b0a424:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0` |
| `0xb0a42b` | `b0a42b:	00` |
| `0xb0a42c` | `b0a42c:	4d 85 ed             	test   r13,r13` |
| `0xb0a42f` | `b0a42f:	74 05                	je     b0a436 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x573d6>` |
| `0xb0a431` | `b0a431:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]` |
| `0xb0a436` | `b0a436:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]` |
| `0xb0a43b` | `b0a43b:	48 8d ac 24 90 00 00 	lea    rbp,[rsp+0x90]` |
| `0xb0a442` | `b0a442:	00` |
| `0xb0a443` | `b0a443:	4c 89 ff             	mov    rdi,r15` |
| `0xb0a446` | `b0a446:	48 89 ee             	mov    rsi,rbp` |
| `0xb0a449` | `b0a449:	e8 88 df fc ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>` |
| `0xb0a44e` | `b0a44e:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]` |
| `0xb0a452` | `b0a452:	e8 5b 40 f9 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xb0df59` | `b0df59:	49 89 d6             	mov    r14,rdx` |
| `0xb0df5c` | `b0df5c:	49 89 f7             	mov    r15,rsi` |
| `0xb0df5f` | `b0df5f:	48 89 fb             	mov    rbx,rdi` |
| `0xb0df62` | `b0df62:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xb0df69` | `b0df69:	00 00` |
| `0xb0df6b` | `b0df6b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xb0df70` | `b0df70:	4c 8b 67 10          	mov    r12,QWORD PTR [rdi+0x10]` |
| `0xb0df74` | `b0df74:	48 8d 77 18          	lea    rsi,[rdi+0x18]` |
| `0xb0df78` | `b0df78:	48 89 e5             	mov    rbp,rsp` |
| `0xb0df7b` | `b0df7b:	48 89 ef             	mov    rdi,rbp` |
| `0xb0df7e` | `b0df7e:	e8 ad d3 f9 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb0df83` | `b0df83:	48 83 7d 00 00       	cmp    QWORD PTR [rbp+0x0],0x0` |
| `0xb0df88` | `b0df88:	74 40                	je     b0dfca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5af6a>` |
| `0xb0df8a` | `b0df8a:	4d 8b 4d 00          	mov    r9,QWORD PTR [r13+0x0]` |
| `0xb0df8e` | `b0df8e:	4c 03 8b 80 00 00 00 	add    r9,QWORD PTR [rbx+0x80]` |
| `0xb0df95` | `b0df95:	4c 8d 43 68          	lea    r8,[rbx+0x68]` |
| `0xb0df99` | `b0df99:	48 8b 4b 60          	mov    rcx,QWORD PTR [rbx+0x60]` |
| `0xb0df9d` | `b0df9d:	48 ff c1             	inc    rcx` |
| `0xb0dfa0` | `b0dfa0:	48 8d 83 88 00 00 00 	lea    rax,[rbx+0x88]` |
| `0xb0dfa7` | `b0dfa7:	4c 8d 53 30          	lea    r10,[rbx+0x30]` |
| `0xb0dfab` | `b0dfab:	48 83 ec 08          	sub    rsp,0x8` |
| `0xb0dfaf` | `b0dfaf:	4c 89 e7             	mov    rdi,r12` |
| `0xb0dfb2` | `b0dfb2:	4c 89 fe             	mov    rsi,r15` |
| `0xb0dfb5` | `b0dfb5:	4c 89 f2             	mov    rdx,r14` |
| `0xb0dfb8` | `b0dfb8:	41 52                	push   r10` |
| `0xb0dfba` | `b0dfba:	ff b3 90 00 00 00    	push   QWORD PTR [rbx+0x90]` |
| `0xb0e199` | `b0e199:	48 89 d3             	mov    rbx,rdx` |
| `0xb0e19c` | `b0e19c:	49 89 f7             	mov    r15,rsi` |
| `0xb0e19f` | `b0e19f:	49 89 fc             	mov    r12,rdi` |
| `0xb0e1a2` | `b0e1a2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xb0e1a9` | `b0e1a9:	00 00` |
| `0xb0e1ab` | `b0e1ab:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xb0e1b0` | `b0e1b0:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]` |
| `0xb0e1b4` | `b0e1b4:	48 8d 77 10          	lea    rsi,[rdi+0x10]` |
| `0xb0e1b8` | `b0e1b8:	48 89 e5             	mov    rbp,rsp` |
| `0xb0e1bb` | `b0e1bb:	48 89 ef             	mov    rdi,rbp` |
| `0xb0e1be` | `b0e1be:	e8 6d d1 f9 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb0e1c3` | `b0e1c3:	48 83 7d 00 00       	cmp    QWORD PTR [rbp+0x0],0x0` |
| `0xb0e1c8` | `b0e1c8:	74 5c                	je     b0e226 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5b1c6>` |
| `0xb0e1ca` | `b0e1ca:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]` |
| `0xb0e1ce` | `b0e1ce:	49 01 86 78 01 00 00 	add    QWORD PTR [r14+0x178],rax` |
| `0xb0e1d5` | `b0e1d5:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]` |
| `0xb0e1d9` | `b0e1d9:	83 4b 10 01          	or     DWORD PTR [rbx+0x10],0x1` |
| `0xb0e1dd` | `b0e1dd:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc` |
| `0xb0e1e1` | `b0e1e1:	48 8d 7b 18          	lea    rdi,[rbx+0x18]` |
| `0xb0e1e5` | `b0e1e5:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |
| `0xb0e1e9` | `b0e1e9:	f6 c2 01             	test   dl,0x1` |
| `0xb0e1ec` | `b0e1ec:	75 60                	jne    b0e24e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5b1ee>` |
| `0xb0e1ee` | `b0e1ee:	e8 9f 75 c5 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>` |
| `0xb0e1f3` | `b0e1f3:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]` |
| `0xb0e1f8` | `b0e1f8:	41 80 7c 24 78 00    	cmp    BYTE PTR [r12+0x78],0x0` |
| `0xb0e1fe` | `b0e1fe:	74 0d                	je     b0e20d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5b1ad>` |
| `0xb28a3e` | `b28a3e:	e9 01 00 00 00       	jmp    b28a44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x759e4>` |
| `0xb28a43` | `b28a43:	cc                   	int3` |
| `0xb28a44` | `b28a44:	53                   	push   rbx` |
| `0xb28a45` | `b28a45:	48 83 ec 20          	sub    rsp,0x20` |
| `0xb28a49` | `b28a49:	48 89 fe             	mov    rsi,rdi` |
| `0xb28a4c` | `b28a4c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xb28a53` | `b28a53:	00 00` |
| `0xb28a55` | `b28a55:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xb28a5a` | `b28a5a:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]` |
| `0xb28a5f` | `b28a5f:	48 89 df             	mov    rdi,rbx` |
| `0xb28a62` | `b28a62:	e8 c9 28 f8 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb28a67` | `b28a67:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0xb28a6a` | `b28a6a:	48 85 ff             	test   rdi,rdi` |
| `0xb28a6d` | `b28a6d:	74 0c                	je     b28a7b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a1b>` |
| `0xb28a6f` | `b28a6f:	48 81 c7 90 01 00 00 	add    rdi,0x190` |
| `0xb28a76` | `b28a76:	e8 2d 00 00 00       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>` |
| `0xb28a7b` | `b28a7b:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xb28a80` | `b28a80:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xb28a87` | `b28a87:	00 00` |
| `0xb28a89` | `b28a89:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xb28a8e` | `b28a8e:	75 0a                	jne    b28a9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a3a>` |
| `0xb28a90` | `b28a90:	48 83 c4 20          	add    rsp,0x20` |
| `0xb28a94` | `b28a94:	5b                   	pop    rbx` |
| `0xb28a95` | `b28a95:	e9 ec 59 f7 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xb28a9a` | `b28a9a:	e8 11 70 cc 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xb28a9f` | `b28a9f:	48 89 c7             	mov    rdi,rax` |
| `0xb28f27` | `b28f27:	48 8d 35 4e 90 92 ff 	lea    rsi,[rip+0xffffffffff92904e]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>` |
| `0xb28f2e` | `b28f2e:	48 8d 0d 0a 17 80 ff 	lea    rcx,[rip+0xffffffffff80170a]        # 32a63f <_ZTSSt12bad_any_cast@@Base-0x65b89>` |
| `0xb28f35` | `b28f35:	6a 04                	push   0x4` |
| `0xb28f37` | `b28f37:	5f                   	pop    rdi` |
| `0xb28f38` | `b28f38:	ba d0 00 00 00       	mov    edx,0xd0` |
| `0xb28f3d` | `b28f3d:	31 c0                	xor    eax,eax` |
| `0xb28f3f` | `b28f3f:	e8 8e d9 ca 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xb28f44` | `b28f44:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]` |
| `0xb28f49` | `b28f49:	4c 89 e7             	mov    rdi,r12` |
| `0xb28f4c` | `b28f4c:	4c 89 fe             	mov    rsi,r15` |
| `0xb28f4f` | `b28f4f:	e8 dc 23 f8 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb28f54` | `b28f54:	49 83 3c 24 00       	cmp    QWORD PTR [r12],0x0` |
| `0xb28f59` | `b28f59:	0f 84 a5 01 00 00    	je     b29104 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x760a4>` |
| `0xb28f5f` | `b28f5f:	31 c0                	xor    eax,eax` |
| `0xb28f61` | `b28f61:	86 83 c0 00 00 00    	xchg   BYTE PTR [rbx+0xc0],al` |
| `0xb28f67` | `b28f67:	41 8b 86 f0 00 00 00 	mov    eax,DWORD PTR [r14+0xf0]` |
| `0xb28f6e` | `b28f6e:	85 c0                	test   eax,eax` |
| `0xb28f70` | `b28f70:	74 3f                	je     b28fb1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75f51>` |
| `0xb28f72` | `b28f72:	83 f8 05             	cmp    eax,0x5` |
| `0xb28f75` | `b28f75:	0f 85 d5 00 00 00    	jne    b29050 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75ff0>` |
| `0xb28f7b` | `b28f7b:	4c 8d 3d 66 eb e0 00 	lea    r15,[rip+0xe0eb66]        # 1937ae8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x730>` |
| `0xb28f82` | `b28f82:	4d 39 7e 08          	cmp    QWORD PTR [r14+0x8],r15` |
| `0xb28f86` | `b28f86:	0f 84 a9 01 00 00    	je     b29135 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x760d5>` |
| `0xb28f8c` | `b28f8c:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]` |
| `0xb28f91` | `b28f91:	4c 89 f6             	mov    rsi,r14` |
| `0xb28f94` | `b28f94:	e8 47 55 cc 00       	call   17ee4e0 <_ZNKSt6__ndk110error_code7messageEv@plt>` |
| `0xb2979f` | `b2979f:	48 8b 6f 08          	mov    rbp,QWORD PTR [rdi+0x8]` |
| `0xb297a3` | `b297a3:	49 39 ee             	cmp    r14,rbp` |
| `0xb297a6` | `b297a6:	74 61                	je     b29809 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x767a9>` |
| `0xb297a8` | `b297a8:	48 89 fb             	mov    rbx,rdi` |
| `0xb297ab` | `b297ab:	4c 8d 7f 18          	lea    r15,[rdi+0x18]` |
| `0xb297af` | `b297af:	49 83 c6 30          	add    r14,0x30` |
| `0xb297b3` | `b297b3:	49 89 e4             	mov    r12,rsp` |
| `0xb297b6` | `b297b6:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]` |
| `0xb297bb` | `b297bb:	4c 89 e7             	mov    rdi,r12` |
| `0xb297be` | `b297be:	4c 89 f6             	mov    rsi,r14` |
| `0xb297c1` | `b297c1:	e8 6a 1b f8 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb297c6` | `b297c6:	48 83 3c 24 00       	cmp    QWORD PTR [rsp],0x0` |
| `0xb297cb` | `b297cb:	74 22                	je     b297ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7678f>` |
| `0xb297cd` | `b297cd:	4c 89 ef             	mov    rdi,r13` |
| `0xb297d0` | `b297d0:	4c 89 fe             	mov    rsi,r15` |
| `0xb297d3` | `b297d3:	e8 e4 f4 ff ff       	call   b28cbc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75c5c>` |
| `0xb297d8` | `b297d8:	8b 53 58             	mov    edx,DWORD PTR [rbx+0x58]` |
| `0xb297db` | `b297db:	49 8b 7e f0          	mov    rdi,QWORD PTR [r14-0x10]` |
| `0xb297df` | `b297df:	4c 89 ee             	mov    rsi,r13` |
| `0xb297e2` | `b297e2:	e8 0d f5 ff ff       	call   b28cf4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75c94>` |
| `0xb297e7` | `b297e7:	4c 89 ef             	mov    rdi,r13` |
| `0xb297ea` | `b297ea:	e8 15 b1 fd ff       	call   b04904 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x518a4>` |
| `0xb297ef` | `b297ef:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xb297f4` | `b297f4:	e8 8d 4c f7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xb297f9` | `b297f9:	49 8d 46 40          	lea    rax,[r14+0x40]` |
| `0xb297fd` | `b297fd:	49 83 c6 10          	add    r14,0x10` |
| `0xb2c6dc` | `b2c6dc:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]` |
| `0xb2c6e0` | `b2c6e0:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]` |
| `0xb2c6e4` | `b2c6e4:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]` |
| `0xb2c6e7` | `b2c6e7:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0` |
| `0xb2c6eb` | `b2c6eb:	4d 85 f6             	test   r14,r14` |
| `0xb2c6ee` | `b2c6ee:	74 05                	je     b2c6f5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x79695>` |
| `0xb2c6f0` | `b2c6f0:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]` |
| `0xb2c6f5` | `b2c6f5:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]` |
| `0xb2c6fa` | `b2c6fa:	48 89 e6             	mov    rsi,rsp` |
| `0xb2c6fd` | `b2c6fd:	4c 89 e7             	mov    rdi,r12` |
| `0xb2c700` | `b2c700:	e8 2b ec f7 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb2c705` | `b2c705:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]` |
| `0xb2c709` | `b2c709:	4d 85 e4             	test   r12,r12` |
| `0xb2c70c` | `b2c70c:	74 74                	je     b2c782 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x79722>` |
| `0xb2c70e` | `b2c70e:	4d 8b 2f             	mov    r13,QWORD PTR [r15]` |
| `0xb2c711` | `b2c711:	48 8d 35 75 62 84 ff 	lea    rsi,[rip+0xffffffffff846275]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>` |
| `0xb2c718` | `b2c718:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]` |
| `0xb2c71d` | `b2c71d:	e8 5c d3 f4 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xb2c722` | `b2c722:	49 8b bd a8 00 00 00 	mov    rdi,QWORD PTR [r13+0xa8]` |
| `0xb2c729` | `b2c729:	49 8b b5 b0 00 00 00 	mov    rsi,QWORD PTR [r13+0xb0]` |
| `0xb2c730` | `b2c730:	48 8d 15 90 bf 82 ff 	lea    rdx,[rip+0xffffffffff82bf90]        # 3586c7 <_ZTSSt12bad_any_cast@@Base-0x37b01>` |
| `0xb2c737` | `b2c737:	6a 05                	push   0x5` |
| `0xb2c739` | `b2c739:	59                   	pop    rcx` |
| `0xb2c73a` | `b2c73a:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]` |
| `0xb2c73f` | `b2c73f:	4d 89 e8             	mov    r8,r13` |
| `0xb2c742` | `b2c742:	e8 7b db 81 00       	call   134a2c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f846>` |
| `0xb2fbe9` | `b2fbe9:	e8 b0 76 f7 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0xb2fbee` | `b2fbee:	4c 89 ff             	mov    rdi,r15` |
| `0xb2fbf1` | `b2fbf1:	e8 ea a8 fc ff       	call   afa4e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x47480>` |
| `0xb2fbf6` | `b2fbf6:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]` |
| `0xb2fbfb` | `b2fbfb:	e8 6a a3 f4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xb2fc00` | `b2fc00:	e9 d8 00 00 00       	jmp    b2fcdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7cc7d>` |
| `0xb2fc05` | `b2fc05:	48 8d b3 40 01 00 00 	lea    rsi,[rbx+0x140]` |
| `0xb2fc0c` | `b2fc0c:	4c 8d b4 24 e0 00 00 	lea    r14,[rsp+0xe0]` |
| `0xb2fc13` | `b2fc13:	00` |
| `0xb2fc14` | `b2fc14:	4c 89 f7             	mov    rdi,r14` |
| `0xb2fc17` | `b2fc17:	e8 14 b7 f7 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb2fc1c` | `b2fc1c:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xb2fc1f` | `b2fc1f:	4d 85 f6             	test   r14,r14` |
| `0xb2fc22` | `b2fc22:	0f 84 a8 00 00 00    	je     b2fcd0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7cc70>` |
| `0xb2fc28` | `b2fc28:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]` |
| `0xb2fc2f` | `b2fc2f:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]` |
| `0xb2fc34` | `b2fc34:	e8 47 e4 cb 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>` |
| `0xb2fc39` | `b2fc39:	4c 8b bb 08 01 00 00 	mov    r15,QWORD PTR [rbx+0x108]` |
| `0xb2fc40` | `b2fc40:	4c 8b a3 50 01 00 00 	mov    r12,QWORD PTR [rbx+0x150]` |
| `0xb2fc47` | `b2fc47:	48 8d b3 10 01 00 00 	lea    rsi,[rbx+0x110]` |
| `0xb2fc4e` | `b2fc4e:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]` |
| `0xb2fc53` | `b2fc53:	e8 dc ee ff ff       	call   b2eb34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7bad4>` |
| `0xb2fc58` | `b2fc58:	6a 40                	push   0x40` |
| `0xb2fc5a` | `b2fc5a:	5f                   	pop    rdi` |
| `0xb2fc5b` | `b2fc5b:	e8 a0 e2 cb 00       	call   17edf00 <_Znwm@plt>` |
| `0xb2fc60` | `b2fc60:	48 89 c5             	mov    rbp,rax` |
| `0xb30d29` | `b30d29:	e8 70 65 f7 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0xb30d2e` | `b30d2e:	4c 89 ff             	mov    rdi,r15` |
| `0xb30d31` | `b30d31:	e8 aa 97 fc ff       	call   afa4e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x47480>` |
| `0xb30d36` | `b30d36:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]` |
| `0xb30d3b` | `b30d3b:	e8 2a 92 f4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xb30d40` | `b30d40:	e9 d8 00 00 00       	jmp    b30e1d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7ddbd>` |
| `0xb30d45` | `b30d45:	48 8d b3 40 01 00 00 	lea    rsi,[rbx+0x140]` |
| `0xb30d4c` | `b30d4c:	4c 8d b4 24 e0 00 00 	lea    r14,[rsp+0xe0]` |
| `0xb30d53` | `b30d53:	00` |
| `0xb30d54` | `b30d54:	4c 89 f7             	mov    rdi,r14` |
| `0xb30d57` | `b30d57:	e8 d4 a5 f7 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb30d5c` | `b30d5c:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xb30d5f` | `b30d5f:	4d 85 f6             	test   r14,r14` |
| `0xb30d62` | `b30d62:	0f 84 a8 00 00 00    	je     b30e10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7ddb0>` |
| `0xb30d68` | `b30d68:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]` |
| `0xb30d6f` | `b30d6f:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]` |
| `0xb30d74` | `b30d74:	e8 07 d3 cb 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>` |
| `0xb30d79` | `b30d79:	4c 8b bb 08 01 00 00 	mov    r15,QWORD PTR [rbx+0x108]` |
| `0xb30d80` | `b30d80:	4c 8b a3 50 01 00 00 	mov    r12,QWORD PTR [rbx+0x150]` |
| `0xb30d87` | `b30d87:	48 8d b3 10 01 00 00 	lea    rsi,[rbx+0x110]` |
| `0xb30d8e` | `b30d8e:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]` |
| `0xb30d93` | `b30d93:	e8 9c dd ff ff       	call   b2eb34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7bad4>` |
| `0xb30d98` | `b30d98:	6a 40                	push   0x40` |
| `0xb30d9a` | `b30d9a:	5f                   	pop    rdi` |
| `0xb30d9b` | `b30d9b:	e8 60 d1 cb 00       	call   17edf00 <_Znwm@plt>` |
| `0xb30da0` | `b30da0:	48 89 c5             	mov    rbp,rax` |
| `0xb314d1` | `b314d1:	e8 c8 5d f7 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>` |
| `0xb314d6` | `b314d6:	4c 89 ff             	mov    rdi,r15` |
| `0xb314d9` | `b314d9:	e8 02 90 fc ff       	call   afa4e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x47480>` |
| `0xb314de` | `b314de:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]` |
| `0xb314e3` | `b314e3:	e8 82 8a f4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xb314e8` | `b314e8:	e9 d8 00 00 00       	jmp    b315c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7e565>` |
| `0xb314ed` | `b314ed:	48 8d b3 40 01 00 00 	lea    rsi,[rbx+0x140]` |
| `0xb314f4` | `b314f4:	4c 8d b4 24 e0 00 00 	lea    r14,[rsp+0xe0]` |
| `0xb314fb` | `b314fb:	00` |
| `0xb314fc` | `b314fc:	4c 89 f7             	mov    rdi,r14` |
| `0xb314ff` | `b314ff:	e8 2c 9e f7 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xb31504` | `b31504:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xb31507` | `b31507:	4d 85 f6             	test   r14,r14` |
| `0xb3150a` | `b3150a:	0f 84 a8 00 00 00    	je     b315b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7e558>` |
| `0xb31510` | `b31510:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]` |
| `0xb31517` | `b31517:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]` |
| ... | truncated 26651 more |

## Relocation entries pointing into bridge/provider area

```text
00000000017fdc00  0000000000000008 R_X86_64_RELATIVE                         aab37a
00000000017fdc08  0000000000000008 R_X86_64_RELATIVE                         aab384
00000000017fdc18  0000000000000008 R_X86_64_RELATIVE                         aab39a
00000000017fdc20  0000000000000008 R_X86_64_RELATIVE                         aab3a6
```
## Candidate AP neighborhoods around e99c54-relocations

