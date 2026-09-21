# ef91cc owner aggregate / publication alias trace

Known:
- owner object allocated at e9ccb0, AP 0x18365e0
- owner pointer r12 stored at [rsp+0x660] at e9d0bd
- direct reads of [rsp+0x660] were not found in the same FDE
- goal: identify aggregate aliases / helper calls that carry this slot out

## Enclosing FDE (15310087, 15343400)

## Function prologue and frame setup
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

## Every stack reference in 0x5c0..0x700
- 0xe99d39: lea    r8,[rsp+0x6f0] ; offs=['0x6f0']
- 0xe99f87: mov    BYTE PTR [rsp+0x6e7],al ; offs=['0x6e7']
- 0xe9a3ce: movd   DWORD PTR [rsp+0x6d4],xmm0 ; offs=['0x6d4']
- 0xe9a3de: mov    BYTE PTR [rsp+0x6d8],cl ; offs=['0x6d8']
- 0xe9a3e9: mov    BYTE PTR [rsp+0x6d9],cl ; offs=['0x6d9']
- 0xe9a3f0: mov    BYTE PTR [rsp+0x6e0],r12b ; offs=['0x6e0']
- 0xe9a3f8: mov    BYTE PTR [rsp+0x6e1],bl ; offs=['0x6e1']
- 0xe9a3ff: mov    BYTE PTR [rsp+0x6e2],al ; offs=['0x6e2']
- 0xe9a418: mov    DWORD PTR [rsp+0x6dc],r14d ; offs=['0x6dc']
- 0xe9a43a: mov    DWORD PTR [rsp+0x6dc],0x6 ; offs=['0x6dc']
- 0xe9a95b: mov    DWORD PTR [rsp+0x6d0],r13d ; offs=['0x6d0']
- 0xe9ab77: mov    BYTE PTR [rsp+0x6e4],al ; offs=['0x6e4']
- 0xe9aba2: mov    BYTE PTR [rsp+0x6e6],al ; offs=['0x6e6']
- 0xe9abca: mov    BYTE PTR [rsp+0x6e5],al ; offs=['0x6e5']
- 0xe9acc6: lea    rdi,[rsp+0x670] ; offs=['0x670']
- 0xe9acde: lea    rsi,[rsp+0x670] ; offs=['0x670']
- 0xe9ad9e: and    QWORD PTR [rsp+0x6c0],0x0 ; offs=['0x6c0']
- 0xe9add3: mov    QWORD PTR [rsp+0x6c0],rbx ; offs=['0x6c0']
- 0xe9ade5: and    QWORD PTR [rsp+0x6c0],0x0 ; offs=['0x6c0']
- 0xe9ae22: lea    rdi,[rsp+0x670] ; offs=['0x670']
- 0xe9ae67: lea    rsi,[rsp+0x6a0] ; offs=['0x6a0']
- 0xe9b240: lea    rdi,[rsp+0x610] ; offs=['0x610']
- 0xe9b2ef: lea    rdi,[rsp+0x5e0] ; offs=['0x5e0']
- 0xe9bf84: cmp    BYTE PTR [rsp+0x6e7],0x0 ; offs=['0x6e7']
- 0xe9c670: movzx  r14d,BYTE PTR [rsp+0x6d9] ; offs=['0x6d9']
- 0xe9c8f7: lea    rsi,[rsp+0x610] ; offs=['0x610']
- 0xe9c94c: lea    rsi,[rsp+0x5e0] ; offs=['0x5e0']
- 0xe9c9e2: lea    rsi,[rsp+0x6d0] ; offs=['0x6d0']
- 0xe9cca2: and    QWORD PTR [rsp+0x660],0x0 ; offs=['0x660']
- 0xe9d0bd: mov    QWORD PTR [rsp+0x660],r12 ; offs=['0x660']
- 0xe9d195: lea    rdi,[rsp+0x5e0] ; offs=['0x5e0']
- 0xe9d1d9: lea    rdi,[rsp+0x610] ; offs=['0x610']
- 0xe9d27c: lea    rsi,[rsp+0x640] ; offs=['0x640']
- 0xe9d424: lea    rsi,[rsp+0x640] ; offs=['0x640']
- 0xe9d6a3: movzx  edx,BYTE PTR [rsp+0x6d4] ; offs=['0x6d4']
- 0xe9eb7a: movzx  edx,BYTE PTR [rsp+0x6d4] ; offs=['0x6d4']
- 0xea0797: lea    rdi,[rsp+0x640] ; offs=['0x640']
- 0xea07ae: lea    rdi,[rsp+0x6a0] ; offs=['0x6a0']
- 0xea07fc: lea    rdi,[rsp+0x6f0] ; offs=['0x6f0']
- 0xea1866: lea    rdi,[rsp+0x640] ; offs=['0x640']
- 0xea1c4a: lea    rdi,[rsp+0x5e0] ; offs=['0x5e0']
- 0xea1c8b: lea    rdi,[rsp+0x610] ; offs=['0x610']
- 0xea1ca2: lea    rdi,[rsp+0x6a0] ; offs=['0x6a0']
- 0xea1d1c: lea    rdi,[rsp+0x6f0] ; offs=['0x6f0']
- 0xea1da0: lea    rdi,[rsp+0x670] ; offs=['0x670']

## Context for every rsp+0x660 reference
### 0xe9cca2: and    QWORD PTR [rsp+0x660],0x0
      e9cc4c:	00 
      e9cc4d:	48 8b 51 08          	mov    rdx,QWORD PTR [rcx+0x8]
      e9cc51:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      e9cc54:	0f 29 84 24 00 0b 00 	movaps XMMWORD PTR [rsp+0xb00],xmm0
      e9cc5b:	00 
      e9cc5c:	48 85 d2             	test   rdx,rdx
      e9cc5f:	74 05                	je     e9cc66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6407c>
      e9cc61:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      e9cc66:	48 8b 8c 24 e0 12 00 	mov    rcx,QWORD PTR [rsp+0x12e0]
      e9cc6d:	00 
      e9cc6e:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
      e9cc72:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9cc75:	0f 29 84 24 10 0b 00 	movaps XMMWORD PTR [rsp+0xb10],xmm0
      e9cc7c:	00 
      e9cc7d:	48 85 d2             	test   rdx,rdx
      e9cc80:	74 05                	je     e9cc87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6409d>
      e9cc82:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      e9cc87:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9cc8b:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9cc8f:	66 0f 7f 84 24 20 0b 	movdqa XMMWORD PTR [rsp+0xb20],xmm0
      e9cc96:	00 00 
      e9cc98:	48 85 c0             	test   rax,rax
      e9cc9b:	74 05                	je     e9cca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x640b8>
      e9cc9d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9cca2:	48 83 a4 24 60 06 00 	and    QWORD PTR [rsp+0x660],0x0
      e9cca9:	00 00 
      e9ccab:	bf d0 03 00 00       	mov    edi,0x3d0
      e9ccb0:	e8 4b 12 95 00       	call   17edf00 <_Znwm@plt>
      e9ccb5:	49 89 c4             	mov    r12,rax
      e9ccb8:	4c 8d bc 24 b0 07 00 	lea    r15,[rsp+0x7b0]
      e9ccbf:	00 
      e9ccc0:	48 89 84 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],rax
      e9ccc7:	00 
      e9ccc8:	48 8d 84 24 20 05 00 	lea    rax,[rsp+0x520]
      e9cccf:	00 
      e9ccd0:	48 89 84 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],rax
      e9ccd7:	00 
      e9ccd8:	48 c7 84 24 40 0b 00 	mov    QWORD PTR [rsp+0xb40],0x1
      e9ccdf:	00 01 00 00 00 
      e9cce4:	48 8d 05 f5 98 99 00 	lea    rax,[rip+0x9998f5]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      e9cceb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ccef:	49 8b 47 c0          	mov    rax,QWORD PTR [r15-0x40]
      e9ccf3:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      e9ccf8:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
      e9ccfd:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      e9cd02:	48 89 ee             	mov    rsi,rbp
      e9cd05:	e8 ee c4 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      e9cd0a:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
      e9cd0e:	41 0f 29 44 24 50    	movaps XMMWORD PTR [r12+0x50],xmm0
      e9cd14:	41 0f 28 47 10       	movaps xmm0,XMMWORD PTR [r15+0x10]
      e9cd19:	41 0f 11 44 24 60    	movups XMMWORD PTR [r12+0x60],xmm0
      e9cd1f:	0f 57 c0             	xorps  xmm0,xmm0
      e9cd22:	48 8d 84 24 c0 07 00 	lea    rax,[rsp+0x7c0]
      e9cd29:	00 
      e9cd2a:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      e9cd2d:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e9cd32:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      e9cd37:	48 8d b4 24 d0 07 00 	lea    rsi,[rsp+0x7d0]
      e9cd3e:	00 
      e9cd3f:	e8 60 c1 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
      e9cd44:	49 8d bc 24 a0 00 00 	lea    rdi,[r12+0xa0]
      e9cd4b:	00 
      e9cd4c:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
      e9cd53:	00 
      e9cd54:	48 8d b4 24 00 08 00 	lea    rsi,[rsp+0x800]
      e9cd5b:	00 
      e9cd5c:	e8 0b 96 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9cd61:	49 8d ac 24 d0 00 00 	lea    rbp,[r12+0xd0]
      e9cd68:	00 
      e9cd69:	48 89 ef             	mov    rdi,rbp

### 0xe9d0bd: mov    QWORD PTR [rsp+0x660],r12
      e9d061:	48 85 c0             	test   rax,rax
      e9d064:	74 05                	je     e9d06b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64481>
      e9d066:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d06b:	48 8b 84 24 18 0b 00 	mov    rax,QWORD PTR [rsp+0xb18]
      e9d072:	00 
      e9d073:	0f 28 84 24 10 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb10]
      e9d07a:	00 
      e9d07b:	41 0f 11 84 24 b0 03 	movups XMMWORD PTR [r12+0x3b0],xmm0
      e9d082:	00 00 
      e9d084:	48 85 c0             	test   rax,rax
      e9d087:	74 05                	je     e9d08e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x644a4>
      e9d089:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d08e:	48 8b 84 24 28 0b 00 	mov    rax,QWORD PTR [rsp+0xb28]
      e9d095:	00 
      e9d096:	0f 28 84 24 20 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb20]
      e9d09d:	00 
      e9d09e:	41 0f 11 84 24 c0 03 	movups XMMWORD PTR [r12+0x3c0],xmm0
      e9d0a5:	00 00 
      e9d0a7:	48 85 c0             	test   rax,rax
      e9d0aa:	74 05                	je     e9d0b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x644c7>
      e9d0ac:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d0b1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9d0b8:	00 
      e9d0b9:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9d0bd:	4c 89 a4 24 60 06 00 	mov    QWORD PTR [rsp+0x660],r12
      e9d0c4:	00 
      e9d0c5:	e8 00 d2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9d0ca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d0d1:	00 
      e9d0d2:	e8 97 be 05 00       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      e9d0d7:	4c 89 ef             	mov    rdi,r13
      e9d0da:	e8 a7 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d0df:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
      e9d0e6:	00 
      e9d0e7:	48 89 df             	mov    rdi,rbx
      e9d0ea:	e8 a1 0d 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9d0ef:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
      e9d0f6:	00 
      e9d0f7:	4c 89 f7             	mov    rdi,r14
      e9d0fa:	e8 23 0a c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e9d0ff:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
      e9d105:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9d10c:	e8 75 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d111:	31 ff                	xor    edi,edi
      e9d113:	e8 6e 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d118:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9d11f:	00 
      e9d120:	e8 45 ce bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d125:	31 ff                	xor    edi,edi
      e9d127:	e8 5a 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d12c:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
      e9d133:	00 
      e9d134:	e8 c1 a9 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      e9d139:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      e9d13e:	e8 43 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d143:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      e9d148:	e8 39 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d14d:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e9d152:	e8 2f 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d157:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e9d15e:	00 
      e9d15f:	e8 22 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d164:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      e9d169:	e8 18 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d16e:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      e9d175:	00 
      e9d176:	e8 0b 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d17b:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      e9d182:	00 
      e9d183:	e8 e2 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

## LEA aliases into 0x5c0..0x700 and first subsequent call
### alias r8=rsp+0x6f0 at 0xe99d39
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

### alias rdi=rsp+0x670 at 0xe9acc6
      e9acc6:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9accd:	00 
      e9acce:	48 89 de             	mov    rsi,rbx
      e9acd1:	e8 ba f5 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>

### alias rsi=rsp+0x670 at 0xe9acde
      e9acde:	48 8d b4 24 70 06 00 	lea    rsi,[rsp+0x670]
      e9ace5:	00 
      e9ace6:	e8 41 1d fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>

### alias rdi=rsp+0x670 at 0xe9ae22
      e9ae22:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9ae29:	00 
      e9ae2a:	e8 3b f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### alias rsi=rsp+0x6a0 at 0xe9ae67
      e9ae67:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
      e9ae6e:	00 
      e9ae6f:	49 89 c6             	mov    r14,rax
      e9ae72:	4c 89 e7             	mov    rdi,r12
      e9ae75:	e8 6a b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>

### alias rdi=rsp+0x610 at 0xe9b240
      e9b240:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      e9b247:	00 
      e9b248:	48 89 17             	mov    QWORD PTR [rdi],rdx
      e9b24b:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      e9b24f:	48 89 7f 20          	mov    QWORD PTR [rdi+0x20],rdi
      e9b253:	48 8d 05 56 77 99 00 	lea    rax,[rip+0x997756]        # 18329b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4948>
      e9b25a:	48 89 84 24 d0 0e 00 	mov    QWORD PTR [rsp+0xed0],rax
      e9b261:	00 
      e9b262:	4c 89 84 24 d8 0e 00 	mov    QWORD PTR [rsp+0xed8],r8
      e9b269:	00 
      e9b26a:	48 8d 84 24 d0 0e 00 	lea    rax,[rsp+0xed0]
      e9b271:	00 
      e9b272:	48 89 84 24 f0 0e 00 	mov    QWORD PTR [rsp+0xef0],rax
      e9b279:	00 
      e9b27a:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      e9b27d:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
      e9b282:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9b286:	48 85 c0             	test   rax,rax
      e9b289:	74 05                	je     e9b290 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x626a6>
      e9b28b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9b290:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
      e9b297:	00 
      e9b298:	4c 8b b4 24 98 13 00 	mov    r14,QWORD PTR [rsp+0x1398]
      e9b29f:	00 
      e9b2a0:	48 8d 05 39 36 97 00 	lea    rax,[rip+0x973639]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e9b2a7:	48 89 84 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rax
      e9b2ae:	00 
      e9b2af:	48 8b 05 f2 67 a1 00 	mov    rax,QWORD PTR [rip+0xa167f2]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
      e9b2b6:	48 89 84 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rax
      e9b2bd:	00 
      e9b2be:	48 8d 84 24 e0 03 00 	lea    rax,[rsp+0x3e0]
      e9b2c5:	00 
      e9b2c6:	48 89 84 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rax
      e9b2cd:	00 
      e9b2ce:	48 8d 0d 0b 36 97 00 	lea    rcx,[rip+0x97360b]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e9b2d5:	48 8d 84 24 a0 0e 00 	lea    rax,[rsp+0xea0]

### alias rdi=rsp+0x5e0 at 0xe9b2ef
      e9b2ef:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9b2f6:	00 
      e9b2f7:	e8 70 b0 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>

### alias rsi=rsp+0x610 at 0xe9c8f7
      e9c8f7:	48 8d b4 24 10 06 00 	lea    rsi,[rsp+0x610]
      e9c8fe:	00 
      e9c8ff:	48 89 ef             	mov    rdi,rbp
      e9c902:	e8 f1 c8 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>

### alias rsi=rsp+0x5e0 at 0xe9c94c
      e9c94c:	48 8d b4 24 e0 05 00 	lea    rsi,[rsp+0x5e0]
      e9c953:	00 
      e9c954:	e8 13 9a 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>

### alias rsi=rsp+0x6d0 at 0xe9c9e2
      e9c9e2:	48 8d b4 24 d0 06 00 	lea    rsi,[rsp+0x6d0]
      e9c9e9:	00 
      e9c9ea:	e8 3d c5 05 00       	call   ef8f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0342>

### alias rdi=rsp+0x5e0 at 0xe9d195
      e9d195:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9d19c:	00 
      e9d19d:	e8 c8 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### alias rdi=rsp+0x610 at 0xe9d1d9
      e9d1d9:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      e9d1e0:	00 
      e9d1e1:	e8 84 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### alias rsi=rsp+0x640 at 0xe9d27c
      e9d27c:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e9d283:	00 
      e9d284:	4c 89 e7             	mov    rdi,r12
      e9d287:	e8 04 d0 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>

### alias rsi=rsp+0x640 at 0xe9d424
      e9d424:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e9d42b:	00 
      e9d42c:	48 89 df             	mov    rdi,rbx
      e9d42f:	e8 5c ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>

### alias rdi=rsp+0x640 at 0xea0797
      ea0797:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea079e:	00 
      ea079f:	e8 c6 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### alias rdi=rsp+0x6a0 at 0xea07ae
      ea07ae:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea07b5:	00 
      ea07b6:	e8 af 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### alias rdi=rsp+0x6f0 at 0xea07fc
      ea07fc:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea0803:	00 
      ea0804:	e8 61 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### alias rdi=rsp+0x640 at 0xea1866
      ea1866:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea186d:	00 
      ea186e:	e8 f7 86 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### alias rdi=rsp+0x5e0 at 0xea1c4a
      ea1c4a:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      ea1c51:	00 
      ea1c52:	e8 13 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### alias rdi=rsp+0x610 at 0xea1c8b
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### alias rdi=rsp+0x6a0 at 0xea1ca2
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### alias rdi=rsp+0x6f0 at 0xea1d1c
      ea1d1c:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea1d23:	00 
      ea1d24:	e8 41 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### alias rdi=rsp+0x670 at 0xea1da0
      ea1da0:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      ea1da7:	00 
      ea1da8:	e8 bd 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

## Calls whose preceding 16 instructions mention stack range 0x5c0..0x700
### call 0xe99f9e: call   17edf00 <_Znwm@plt>
- prior range refs: 0xe99f87->0x6e7
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

### call 0xe9a430: call   QWORD PTR [rax+0x148]
- prior range refs: 0xe9a3f0->0x6e0, 0xe9a3f8->0x6e1, 0xe9a3ff->0x6e2, 0xe9a418->0x6dc
      e9a3e5:	8a 4c 24 30          	mov    cl,BYTE PTR [rsp+0x30]
      e9a3e9:	88 8c 24 d9 06 00 00 	mov    BYTE PTR [rsp+0x6d9],cl
      e9a3f0:	44 88 a4 24 e0 06 00 	mov    BYTE PTR [rsp+0x6e0],r12b
      e9a3f7:	00 
      e9a3f8:	88 9c 24 e1 06 00 00 	mov    BYTE PTR [rsp+0x6e1],bl
      e9a3ff:	88 84 24 e2 06 00 00 	mov    BYTE PTR [rsp+0x6e2],al
      e9a406:	84 db                	test   bl,bl
      e9a408:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      e9a40d:	44 0f 45 f0          	cmovne r14d,eax
      e9a411:	45 84 ed             	test   r13b,r13b
      e9a414:	44 0f 45 f0          	cmovne r14d,eax
      e9a418:	44 89 b4 24 dc 06 00 	mov    DWORD PTR [rsp+0x6dc],r14d
      e9a41f:	00 
      e9a420:	40 84 ed             	test   bpl,bpl
      e9a423:	74 20                	je     e9a445 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6185b>
      e9a425:	48 8b bc 24 38 13 00 	mov    rdi,QWORD PTR [rsp+0x1338]
      e9a42c:	00 
      e9a42d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e9a430:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
      e9a436:	84 c0                	test   al,al
      e9a438:	75 0b                	jne    e9a445 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6185b>
      e9a43a:	c7 84 24 dc 06 00 00 	mov    DWORD PTR [rsp+0x6dc],0x6
      e9a441:	06 00 00 00 
      e9a445:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
      e9a44c:	00 
      e9a44d:	48 8b 18             	mov    rbx,QWORD PTR [rax]
      e9a450:	bf 60 01 00 00       	mov    edi,0x160
      e9a455:	e8 a6 3a 95 00       	call   17edf00 <_Znwm@plt>
      e9a45a:	49 89 c6             	mov    r14,rax
      e9a45d:	49 89 c5             	mov    r13,rax
      e9a460:	66 0f ef c0          	pxor   xmm0,xmm0
      e9a464:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      e9a46a:	48 8d 05 57 09 97 00 	lea    rax,[rip+0x970957]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      e9a471:	49 89 06             	mov    QWORD PTR [r14],rax
      e9a474:	48 8d 05 e5 6f 99 00 	lea    rax,[rip+0x996fe5]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
      e9a47b:	48 89 84 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],rax
      e9a482:	00 

### call 0xe9a455: call   17edf00 <_Znwm@plt>
- prior range refs: 0xe9a418->0x6dc, 0xe9a43a->0x6dc
      e9a411:	45 84 ed             	test   r13b,r13b
      e9a414:	44 0f 45 f0          	cmovne r14d,eax
      e9a418:	44 89 b4 24 dc 06 00 	mov    DWORD PTR [rsp+0x6dc],r14d
      e9a41f:	00 
      e9a420:	40 84 ed             	test   bpl,bpl
      e9a423:	74 20                	je     e9a445 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6185b>
      e9a425:	48 8b bc 24 38 13 00 	mov    rdi,QWORD PTR [rsp+0x1338]
      e9a42c:	00 
      e9a42d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e9a430:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
      e9a436:	84 c0                	test   al,al
      e9a438:	75 0b                	jne    e9a445 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6185b>
      e9a43a:	c7 84 24 dc 06 00 00 	mov    DWORD PTR [rsp+0x6dc],0x6
      e9a441:	06 00 00 00 
      e9a445:	48 8b 84 24 58 12 00 	mov    rax,QWORD PTR [rsp+0x1258]
      e9a44c:	00 
      e9a44d:	48 8b 18             	mov    rbx,QWORD PTR [rax]
      e9a450:	bf 60 01 00 00       	mov    edi,0x160
      e9a455:	e8 a6 3a 95 00       	call   17edf00 <_Znwm@plt>
      e9a45a:	49 89 c6             	mov    r14,rax
      e9a45d:	49 89 c5             	mov    r13,rax
      e9a460:	66 0f ef c0          	pxor   xmm0,xmm0
      e9a464:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      e9a46a:	48 8d 05 57 09 97 00 	lea    rax,[rip+0x970957]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      e9a471:	49 89 06             	mov    QWORD PTR [r14],rax
      e9a474:	48 8d 05 e5 6f 99 00 	lea    rax,[rip+0x996fe5]        # 1831460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x33f8>
      e9a47b:	48 89 84 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],rax
      e9a482:	00 
      e9a483:	48 8d 05 0b 72 09 00 	lea    rax,[rip+0x9720b]        # f31695 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf8aab>
      e9a48a:	48 89 84 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],rax
      e9a491:	00 
      e9a492:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9a499:	00 
      e9a49a:	48 89 b4 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],rsi
      e9a4a1:	00 
      e9a4a2:	48 8d 05 ff 6f 99 00 	lea    rax,[rip+0x996fff]        # 18314a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3440>
      e9a4a9:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax

### call 0xe9a96f: call   ea1f28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6933e>
- prior range refs: 0xe9a95b->0x6d0
      e9a922:	e8 a1 cb 74 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
      e9a927:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
      e9a92c:	74 18                	je     e9a946 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61d5c>
      e9a92e:	48 8d 35 06 89 53 ff 	lea    rsi,[rip+0xffffffffff538906]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
      e9a935:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9a93c:	00 
      e9a93d:	e8 0d 0f be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e9a942:	44 0f b6 e8          	movzx  r13d,al
      e9a946:	48 8b 9c 24 08 13 00 	mov    rbx,QWORD PTR [rsp+0x1308]
      e9a94d:	00 
      e9a94e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9a955:	00 
      e9a956:	e8 d5 c3 c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e9a95b:	44 89 ac 24 d0 06 00 	mov    DWORD PTR [rsp+0x6d0],r13d
      e9a962:	00 
      e9a963:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
      e9a96a:	00 
      e9a96b:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9a96f:	e8 b4 75 00 00       	call   ea1f28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6933e>
      e9a974:	88 84 24 23 07 00 00 	mov    BYTE PTR [rsp+0x723],al
      e9a97b:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9a97f:	48 8d 35 f7 8e 53 ff 	lea    rsi,[rip+0xffffffffff538ef7]        # 3d387d <_ZTSN5boost17bad_function_callE@@Base+0xbc3>
      e9a986:	48 8d 0d 03 8f 53 ff 	lea    rcx,[rip+0xffffffffff538f03]        # 3d3890 <_ZTSN5boost17bad_function_callE@@Base+0xbd6>
      e9a98d:	6a 0b                	push   0xb
      e9a98f:	41 5e                	pop    r14
      e9a991:	6a 26                	push   0x26
      e9a993:	41 58                	pop    r8
      e9a995:	4c 89 f2             	mov    rdx,r14
      e9a998:	45 31 c9             	xor    r9d,r9d
      e9a99b:	e8 ea c9 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9a9a0:	88 84 24 24 07 00 00 	mov    BYTE PTR [rsp+0x724],al
      e9a9a7:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9a9ab:	48 8d 35 57 8e 53 ff 	lea    rsi,[rip+0xffffffffff538e57]        # 3d3809 <_ZTSN5boost17bad_function_callE@@Base+0xb4f>
      e9a9b2:	48 8d 0d 67 8e 53 ff 	lea    rcx,[rip+0xffffffffff538e67]        # 3d3820 <_ZTSN5boost17bad_function_callE@@Base+0xb66>
      e9a9b9:	6a 18                	push   0x18
      e9a9bb:	41 58                	pop    r8
      e9a9bd:	4c 89 f2             	mov    rdx,r14

### call 0xe9a99b: call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
- prior range refs: 0xe9a95b->0x6d0
      e9a955:	00 
      e9a956:	e8 d5 c3 c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e9a95b:	44 89 ac 24 d0 06 00 	mov    DWORD PTR [rsp+0x6d0],r13d
      e9a962:	00 
      e9a963:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
      e9a96a:	00 
      e9a96b:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9a96f:	e8 b4 75 00 00       	call   ea1f28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6933e>
      e9a974:	88 84 24 23 07 00 00 	mov    BYTE PTR [rsp+0x723],al
      e9a97b:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9a97f:	48 8d 35 f7 8e 53 ff 	lea    rsi,[rip+0xffffffffff538ef7]        # 3d387d <_ZTSN5boost17bad_function_callE@@Base+0xbc3>
      e9a986:	48 8d 0d 03 8f 53 ff 	lea    rcx,[rip+0xffffffffff538f03]        # 3d3890 <_ZTSN5boost17bad_function_callE@@Base+0xbd6>
      e9a98d:	6a 0b                	push   0xb
      e9a98f:	41 5e                	pop    r14
      e9a991:	6a 26                	push   0x26
      e9a993:	41 58                	pop    r8
      e9a995:	4c 89 f2             	mov    rdx,r14
      e9a998:	45 31 c9             	xor    r9d,r9d
      e9a99b:	e8 ea c9 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9a9a0:	88 84 24 24 07 00 00 	mov    BYTE PTR [rsp+0x724],al
      e9a9a7:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9a9ab:	48 8d 35 57 8e 53 ff 	lea    rsi,[rip+0xffffffffff538e57]        # 3d3809 <_ZTSN5boost17bad_function_callE@@Base+0xb4f>
      e9a9b2:	48 8d 0d 67 8e 53 ff 	lea    rcx,[rip+0xffffffffff538e67]        # 3d3820 <_ZTSN5boost17bad_function_callE@@Base+0xb66>
      e9a9b9:	6a 18                	push   0x18
      e9a9bb:	41 58                	pop    r8
      e9a9bd:	4c 89 f2             	mov    rdx,r14
      e9a9c0:	45 31 c9             	xor    r9d,r9d
      e9a9c3:	e8 c2 c9 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9a9c8:	88 44 24 25          	mov    BYTE PTR [rsp+0x25],al
      e9a9cc:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9a9d0:	48 8d 35 46 8f 53 ff 	lea    rsi,[rip+0xffffffffff538f46]        # 3d391d <_ZTSN5boost17bad_function_callE@@Base+0xc63>
      e9a9d7:	48 8d 0d 52 8f 53 ff 	lea    rcx,[rip+0xffffffffff538f52]        # 3d3930 <_ZTSN5boost17bad_function_callE@@Base+0xc76>
      e9a9de:	6a 1e                	push   0x1e
      e9a9e0:	41 5f                	pop    r15
      e9a9e2:	4c 89 f2             	mov    rdx,r14
      e9a9e5:	4d 89 f8             	mov    r8,r15
      e9a9e8:	45 31 c9             	xor    r9d,r9d

### call 0xe9ab9d: call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
- prior range refs: 0xe9ab77->0x6e4
      e9ab56:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ab5a:	48 8d 35 27 94 53 ff 	lea    rsi,[rip+0xffffffffff539427]        # 3d3f88 <_ZTSN5boost17bad_function_callE@@Base+0x12ce>
      e9ab61:	48 8d 0d 38 94 53 ff 	lea    rcx,[rip+0xffffffffff539438]        # 3d3fa0 <_ZTSN5boost17bad_function_callE@@Base+0x12e6>
      e9ab68:	6a 2e                	push   0x2e
      e9ab6a:	41 58                	pop    r8
      e9ab6c:	4c 89 f2             	mov    rdx,r14
      e9ab6f:	45 31 c9             	xor    r9d,r9d
      e9ab72:	e8 13 c8 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ab77:	88 84 24 e4 06 00 00 	mov    BYTE PTR [rsp+0x6e4],al
      e9ab7e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ab82:	48 8d 35 f8 98 53 ff 	lea    rsi,[rip+0xffffffffff5398f8]        # 3d4481 <_ZTSN5boost17bad_function_callE@@Base+0x17c7>
      e9ab89:	48 8d 0d 00 99 53 ff 	lea    rcx,[rip+0xffffffffff539900]        # 3d4490 <_ZTSN5boost17bad_function_callE@@Base+0x17d6>
      e9ab90:	6a 27                	push   0x27
      e9ab92:	41 58                	pop    r8
      e9ab94:	6a 01                	push   0x1
      e9ab96:	5d                   	pop    rbp
      e9ab97:	4c 89 f2             	mov    rdx,r14
      e9ab9a:	41 89 e9             	mov    r9d,ebp
      e9ab9d:	e8 e8 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9aba2:	88 84 24 e6 06 00 00 	mov    BYTE PTR [rsp+0x6e6],al
      e9aba9:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abad:	48 8d 35 58 94 53 ff 	lea    rsi,[rip+0xffffffffff539458]        # 3d400c <_ZTSN5boost17bad_function_callE@@Base+0x1352>
      e9abb4:	48 8d 0d 65 94 53 ff 	lea    rcx,[rip+0xffffffffff539465]        # 3d4020 <_ZTSN5boost17bad_function_callE@@Base+0x1366>
      e9abbb:	6a 21                	push   0x21
      e9abbd:	41 58                	pop    r8
      e9abbf:	4c 89 f2             	mov    rdx,r14
      e9abc2:	41 89 e9             	mov    r9d,ebp
      e9abc5:	e8 c0 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9abca:	88 84 24 e5 06 00 00 	mov    BYTE PTR [rsp+0x6e5],al
      e9abd1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abd5:	e8 ce b6 00 00       	call   ea62a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6be>
      e9abda:	88 84 24 44 07 00 00 	mov    BYTE PTR [rsp+0x744],al
      e9abe1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abe5:	e8 16 f0 ff ff       	call   e99c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61016>
      e9abea:	88 84 24 25 07 00 00 	mov    BYTE PTR [rsp+0x725],al
      e9abf1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abf5:	48 8d 35 af 96 53 ff 	lea    rsi,[rip+0xffffffffff5396af]        # 3d42ab <_ZTSN5boost17bad_function_callE@@Base+0x15f1>

### call 0xe9abc5: call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
- prior range refs: 0xe9aba2->0x6e6
      e9ab7e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ab82:	48 8d 35 f8 98 53 ff 	lea    rsi,[rip+0xffffffffff5398f8]        # 3d4481 <_ZTSN5boost17bad_function_callE@@Base+0x17c7>
      e9ab89:	48 8d 0d 00 99 53 ff 	lea    rcx,[rip+0xffffffffff539900]        # 3d4490 <_ZTSN5boost17bad_function_callE@@Base+0x17d6>
      e9ab90:	6a 27                	push   0x27
      e9ab92:	41 58                	pop    r8
      e9ab94:	6a 01                	push   0x1
      e9ab96:	5d                   	pop    rbp
      e9ab97:	4c 89 f2             	mov    rdx,r14
      e9ab9a:	41 89 e9             	mov    r9d,ebp
      e9ab9d:	e8 e8 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9aba2:	88 84 24 e6 06 00 00 	mov    BYTE PTR [rsp+0x6e6],al
      e9aba9:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abad:	48 8d 35 58 94 53 ff 	lea    rsi,[rip+0xffffffffff539458]        # 3d400c <_ZTSN5boost17bad_function_callE@@Base+0x1352>
      e9abb4:	48 8d 0d 65 94 53 ff 	lea    rcx,[rip+0xffffffffff539465]        # 3d4020 <_ZTSN5boost17bad_function_callE@@Base+0x1366>
      e9abbb:	6a 21                	push   0x21
      e9abbd:	41 58                	pop    r8
      e9abbf:	4c 89 f2             	mov    rdx,r14
      e9abc2:	41 89 e9             	mov    r9d,ebp
      e9abc5:	e8 c0 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9abca:	88 84 24 e5 06 00 00 	mov    BYTE PTR [rsp+0x6e5],al
      e9abd1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abd5:	e8 ce b6 00 00       	call   ea62a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6be>
      e9abda:	88 84 24 44 07 00 00 	mov    BYTE PTR [rsp+0x744],al
      e9abe1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abe5:	e8 16 f0 ff ff       	call   e99c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61016>
      e9abea:	88 84 24 25 07 00 00 	mov    BYTE PTR [rsp+0x725],al
      e9abf1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abf5:	48 8d 35 af 96 53 ff 	lea    rsi,[rip+0xffffffffff5396af]        # 3d42ab <_ZTSN5boost17bad_function_callE@@Base+0x15f1>
      e9abfc:	48 8d 0d bd 96 53 ff 	lea    rcx,[rip+0xffffffffff5396bd]        # 3d42c0 <_ZTSN5boost17bad_function_callE@@Base+0x1606>
      e9ac03:	6a 1d                	push   0x1d
      e9ac05:	41 5f                	pop    r15
      e9ac07:	4c 89 f2             	mov    rdx,r14
      e9ac0a:	4d 89 f8             	mov    r8,r15
      e9ac0d:	45 31 c9             	xor    r9d,r9d
      e9ac10:	e8 75 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ac15:	88 84 24 50 07 00 00 	mov    BYTE PTR [rsp+0x750],al
      e9ac1c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]

### call 0xe9abd5: call   ea62a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6be>
- prior range refs: 0xe9aba2->0x6e6, 0xe9abca->0x6e5
      e9ab90:	6a 27                	push   0x27
      e9ab92:	41 58                	pop    r8
      e9ab94:	6a 01                	push   0x1
      e9ab96:	5d                   	pop    rbp
      e9ab97:	4c 89 f2             	mov    rdx,r14
      e9ab9a:	41 89 e9             	mov    r9d,ebp
      e9ab9d:	e8 e8 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9aba2:	88 84 24 e6 06 00 00 	mov    BYTE PTR [rsp+0x6e6],al
      e9aba9:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abad:	48 8d 35 58 94 53 ff 	lea    rsi,[rip+0xffffffffff539458]        # 3d400c <_ZTSN5boost17bad_function_callE@@Base+0x1352>
      e9abb4:	48 8d 0d 65 94 53 ff 	lea    rcx,[rip+0xffffffffff539465]        # 3d4020 <_ZTSN5boost17bad_function_callE@@Base+0x1366>
      e9abbb:	6a 21                	push   0x21
      e9abbd:	41 58                	pop    r8
      e9abbf:	4c 89 f2             	mov    rdx,r14
      e9abc2:	41 89 e9             	mov    r9d,ebp
      e9abc5:	e8 c0 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9abca:	88 84 24 e5 06 00 00 	mov    BYTE PTR [rsp+0x6e5],al
      e9abd1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abd5:	e8 ce b6 00 00       	call   ea62a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6be>
      e9abda:	88 84 24 44 07 00 00 	mov    BYTE PTR [rsp+0x744],al
      e9abe1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abe5:	e8 16 f0 ff ff       	call   e99c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61016>
      e9abea:	88 84 24 25 07 00 00 	mov    BYTE PTR [rsp+0x725],al
      e9abf1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abf5:	48 8d 35 af 96 53 ff 	lea    rsi,[rip+0xffffffffff5396af]        # 3d42ab <_ZTSN5boost17bad_function_callE@@Base+0x15f1>
      e9abfc:	48 8d 0d bd 96 53 ff 	lea    rcx,[rip+0xffffffffff5396bd]        # 3d42c0 <_ZTSN5boost17bad_function_callE@@Base+0x1606>
      e9ac03:	6a 1d                	push   0x1d
      e9ac05:	41 5f                	pop    r15
      e9ac07:	4c 89 f2             	mov    rdx,r14
      e9ac0a:	4d 89 f8             	mov    r8,r15
      e9ac0d:	45 31 c9             	xor    r9d,r9d
      e9ac10:	e8 75 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ac15:	88 84 24 50 07 00 00 	mov    BYTE PTR [rsp+0x750],al
      e9ac1c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ac20:	e8 a1 b6 00 00       	call   ea62c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6dc>
      e9ac25:	48 98                	cdqe
      e9ac27:	48 89 84 24 58 07 00 	mov    QWORD PTR [rsp+0x758],rax

### call 0xe9abe5: call   e99c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61016>
- prior range refs: 0xe9aba2->0x6e6, 0xe9abca->0x6e5
      e9ab96:	5d                   	pop    rbp
      e9ab97:	4c 89 f2             	mov    rdx,r14
      e9ab9a:	41 89 e9             	mov    r9d,ebp
      e9ab9d:	e8 e8 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9aba2:	88 84 24 e6 06 00 00 	mov    BYTE PTR [rsp+0x6e6],al
      e9aba9:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abad:	48 8d 35 58 94 53 ff 	lea    rsi,[rip+0xffffffffff539458]        # 3d400c <_ZTSN5boost17bad_function_callE@@Base+0x1352>
      e9abb4:	48 8d 0d 65 94 53 ff 	lea    rcx,[rip+0xffffffffff539465]        # 3d4020 <_ZTSN5boost17bad_function_callE@@Base+0x1366>
      e9abbb:	6a 21                	push   0x21
      e9abbd:	41 58                	pop    r8
      e9abbf:	4c 89 f2             	mov    rdx,r14
      e9abc2:	41 89 e9             	mov    r9d,ebp
      e9abc5:	e8 c0 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9abca:	88 84 24 e5 06 00 00 	mov    BYTE PTR [rsp+0x6e5],al
      e9abd1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abd5:	e8 ce b6 00 00       	call   ea62a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6be>
      e9abda:	88 84 24 44 07 00 00 	mov    BYTE PTR [rsp+0x744],al
      e9abe1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abe5:	e8 16 f0 ff ff       	call   e99c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61016>
      e9abea:	88 84 24 25 07 00 00 	mov    BYTE PTR [rsp+0x725],al
      e9abf1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abf5:	48 8d 35 af 96 53 ff 	lea    rsi,[rip+0xffffffffff5396af]        # 3d42ab <_ZTSN5boost17bad_function_callE@@Base+0x15f1>
      e9abfc:	48 8d 0d bd 96 53 ff 	lea    rcx,[rip+0xffffffffff5396bd]        # 3d42c0 <_ZTSN5boost17bad_function_callE@@Base+0x1606>
      e9ac03:	6a 1d                	push   0x1d
      e9ac05:	41 5f                	pop    r15
      e9ac07:	4c 89 f2             	mov    rdx,r14
      e9ac0a:	4d 89 f8             	mov    r8,r15
      e9ac0d:	45 31 c9             	xor    r9d,r9d
      e9ac10:	e8 75 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ac15:	88 84 24 50 07 00 00 	mov    BYTE PTR [rsp+0x750],al
      e9ac1c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ac20:	e8 a1 b6 00 00       	call   ea62c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6dc>
      e9ac25:	48 98                	cdqe
      e9ac27:	48 89 84 24 58 07 00 	mov    QWORD PTR [rsp+0x758],rax
      e9ac2e:	00 
      e9ac2f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ac33:	48 8d 35 a1 92 53 ff 	lea    rsi,[rip+0xffffffffff5392a1]        # 3d3edb <_ZTSN5boost17bad_function_callE@@Base+0x1221>

### call 0xe9ac10: call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
- prior range refs: 0xe9abca->0x6e5
      e9abbf:	4c 89 f2             	mov    rdx,r14
      e9abc2:	41 89 e9             	mov    r9d,ebp
      e9abc5:	e8 c0 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9abca:	88 84 24 e5 06 00 00 	mov    BYTE PTR [rsp+0x6e5],al
      e9abd1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abd5:	e8 ce b6 00 00       	call   ea62a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6be>
      e9abda:	88 84 24 44 07 00 00 	mov    BYTE PTR [rsp+0x744],al
      e9abe1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abe5:	e8 16 f0 ff ff       	call   e99c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61016>
      e9abea:	88 84 24 25 07 00 00 	mov    BYTE PTR [rsp+0x725],al
      e9abf1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9abf5:	48 8d 35 af 96 53 ff 	lea    rsi,[rip+0xffffffffff5396af]        # 3d42ab <_ZTSN5boost17bad_function_callE@@Base+0x15f1>
      e9abfc:	48 8d 0d bd 96 53 ff 	lea    rcx,[rip+0xffffffffff5396bd]        # 3d42c0 <_ZTSN5boost17bad_function_callE@@Base+0x1606>
      e9ac03:	6a 1d                	push   0x1d
      e9ac05:	41 5f                	pop    r15
      e9ac07:	4c 89 f2             	mov    rdx,r14
      e9ac0a:	4d 89 f8             	mov    r8,r15
      e9ac0d:	45 31 c9             	xor    r9d,r9d
      e9ac10:	e8 75 c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ac15:	88 84 24 50 07 00 00 	mov    BYTE PTR [rsp+0x750],al
      e9ac1c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ac20:	e8 a1 b6 00 00       	call   ea62c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6dc>
      e9ac25:	48 98                	cdqe
      e9ac27:	48 89 84 24 58 07 00 	mov    QWORD PTR [rsp+0x758],rax
      e9ac2e:	00 
      e9ac2f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ac33:	48 8d 35 a1 92 53 ff 	lea    rsi,[rip+0xffffffffff5392a1]        # 3d3edb <_ZTSN5boost17bad_function_callE@@Base+0x1221>
      e9ac3a:	48 8d 0d af 92 53 ff 	lea    rcx,[rip+0xffffffffff5392af]        # 3d3ef0 <_ZTSN5boost17bad_function_callE@@Base+0x1236>
      e9ac41:	6a 24                	push   0x24
      e9ac43:	41 58                	pop    r8
      e9ac45:	4c 89 f2             	mov    rdx,r14
      e9ac48:	45 31 c9             	xor    r9d,r9d
      e9ac4b:	e8 3a c7 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ac50:	88 84 24 60 07 00 00 	mov    BYTE PTR [rsp+0x760],al
      e9ac57:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ac5b:	48 8d 35 b3 92 53 ff 	lea    rsi,[rip+0xffffffffff5392b3]        # 3d3f15 <_ZTSN5boost17bad_function_callE@@Base+0x125b>
      e9ac62:	48 8d 0d c7 92 53 ff 	lea    rcx,[rip+0xffffffffff5392c7]        # 3d3f30 <_ZTSN5boost17bad_function_callE@@Base+0x1276>

### call 0xe9acd1: call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
- prior range refs: 0xe9acc6->0x670
      e9ac83:	48 8d 35 b8 93 53 ff 	lea    rsi,[rip+0xffffffffff5393b8]        # 3d4042 <_ZTSN5boost17bad_function_callE@@Base+0x1388>
      e9ac8a:	48 8d 0d bf 93 53 ff 	lea    rcx,[rip+0xffffffffff5393bf]        # 3d4050 <_ZTSN5boost17bad_function_callE@@Base+0x1396>
      e9ac91:	4c 89 f2             	mov    rdx,r14
      e9ac94:	4d 89 f8             	mov    r8,r15
      e9ac97:	45 31 c9             	xor    r9d,r9d
      e9ac9a:	e8 eb c6 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ac9f:	88 84 24 67 07 00 00 	mov    BYTE PTR [rsp+0x767],al
      e9aca6:	48 8b 84 24 70 12 00 	mov    rax,QWORD PTR [rsp+0x1270]
      e9acad:	00 
      e9acae:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9acb2:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9acb8:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      e9acbc:	4d 85 f6             	test   r14,r14
      e9acbf:	74 05                	je     e9acc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x620dc>
      e9acc1:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9acc6:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9accd:	00 
      e9acce:	48 89 de             	mov    rsi,rbx
      e9acd1:	e8 ba f5 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9acd6:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9acdd:	00 
      e9acde:	48 8d b4 24 70 06 00 	lea    rsi,[rsp+0x670]
      e9ace5:	00 
      e9ace6:	e8 41 1d fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e9aceb:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9acf0:	0f 29 84 24 70 07 00 	movaps XMMWORD PTR [rsp+0x770],xmm0
      e9acf7:	00 
      e9acf8:	4d 85 f6             	test   r14,r14
      e9acfb:	74 05                	je     e9ad02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62118>
      e9acfd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9ad02:	4c 8d b4 24 80 07 00 	lea    r14,[rsp+0x780]
      e9ad09:	00 
      e9ad0a:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ad11:	00 
      e9ad12:	4c 89 f7             	mov    rdi,r14
      e9ad15:	e8 12 1d fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e9ad1a:	66 41 c7 46 30 00 01 	mov    WORD PTR [r14+0x30],0x100

### call 0xe9ace6: call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
- prior range refs: 0xe9acc6->0x670, 0xe9acde->0x670
      e9ac9a:	e8 eb c6 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ac9f:	88 84 24 67 07 00 00 	mov    BYTE PTR [rsp+0x767],al
      e9aca6:	48 8b 84 24 70 12 00 	mov    rax,QWORD PTR [rsp+0x1270]
      e9acad:	00 
      e9acae:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9acb2:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9acb8:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      e9acbc:	4d 85 f6             	test   r14,r14
      e9acbf:	74 05                	je     e9acc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x620dc>
      e9acc1:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9acc6:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9accd:	00 
      e9acce:	48 89 de             	mov    rsi,rbx
      e9acd1:	e8 ba f5 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9acd6:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9acdd:	00 
      e9acde:	48 8d b4 24 70 06 00 	lea    rsi,[rsp+0x670]
      e9ace5:	00 
      e9ace6:	e8 41 1d fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e9aceb:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9acf0:	0f 29 84 24 70 07 00 	movaps XMMWORD PTR [rsp+0x770],xmm0
      e9acf7:	00 
      e9acf8:	4d 85 f6             	test   r14,r14
      e9acfb:	74 05                	je     e9ad02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62118>
      e9acfd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9ad02:	4c 8d b4 24 80 07 00 	lea    r14,[rsp+0x780]
      e9ad09:	00 
      e9ad0a:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ad11:	00 
      e9ad12:	4c 89 f7             	mov    rdi,r14
      e9ad15:	e8 12 1d fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e9ad1a:	66 41 c7 46 30 00 01 	mov    WORD PTR [r14+0x30],0x100
      e9ad21:	48 83 a4 24 80 10 00 	and    QWORD PTR [rsp+0x1080],0x0
      e9ad28:	00 00 
      e9ad2a:	6a 60                	push   0x60
      e9ad2c:	5f                   	pop    rdi
      e9ad2d:	e8 ce 31 95 00       	call   17edf00 <_Znwm@plt>

### call 0xe9ad15: call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
- prior range refs: 0xe9acde->0x670
      e9acce:	48 89 de             	mov    rsi,rbx
      e9acd1:	e8 ba f5 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9acd6:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9acdd:	00 
      e9acde:	48 8d b4 24 70 06 00 	lea    rsi,[rsp+0x670]
      e9ace5:	00 
      e9ace6:	e8 41 1d fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e9aceb:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9acf0:	0f 29 84 24 70 07 00 	movaps XMMWORD PTR [rsp+0x770],xmm0
      e9acf7:	00 
      e9acf8:	4d 85 f6             	test   r14,r14
      e9acfb:	74 05                	je     e9ad02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62118>
      e9acfd:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9ad02:	4c 8d b4 24 80 07 00 	lea    r14,[rsp+0x780]
      e9ad09:	00 
      e9ad0a:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ad11:	00 
      e9ad12:	4c 89 f7             	mov    rdi,r14
      e9ad15:	e8 12 1d fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e9ad1a:	66 41 c7 46 30 00 01 	mov    WORD PTR [r14+0x30],0x100
      e9ad21:	48 83 a4 24 80 10 00 	and    QWORD PTR [rsp+0x1080],0x0
      e9ad28:	00 00 
      e9ad2a:	6a 60                	push   0x60
      e9ad2c:	5f                   	pop    rdi
      e9ad2d:	e8 ce 31 95 00       	call   17edf00 <_Znwm@plt>
      e9ad32:	48 89 c3             	mov    rbx,rax
      e9ad35:	48 8d 05 ac da 9f 00 	lea    rax,[rip+0x9fdaac]        # 18987e8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5728>
      e9ad3c:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9ad3f:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9ad46:	00 
      e9ad47:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
      e9ad4b:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
      e9ad4f:	0f 57 c0             	xorps  xmm0,xmm0
      e9ad52:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
      e9ad56:	48 89 df             	mov    rdi,rbx
      e9ad59:	48 83 c7 20          	add    rdi,0x20
      e9ad5d:	4c 89 f6             	mov    rsi,r14

### call 0xe9adaa: call   17edf00 <_Znwm@plt>
- prior range refs: 0xe9ad9e->0x6c0
      e9ad65:	41 0f b7 47 40       	movzx  eax,WORD PTR [r15+0x40]
      e9ad6a:	66 89 43 50          	mov    WORD PTR [rbx+0x50],ax
      e9ad6e:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9ad75:	00 
      e9ad76:	4c 89 ff             	mov    rdi,r15
      e9ad79:	e8 66 ae c9 ff       	call   b35be4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82b84>
      e9ad7e:	48 83 bc 24 80 10 00 	cmp    QWORD PTR [rsp+0x1080],0x0
      e9ad85:	00 00 
      e9ad87:	74 5c                	je     e9ade5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x621fb>
      e9ad89:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ad90:	00 
      e9ad91:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9ad98:	00 
      e9ad99:	e8 06 de 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9ad9e:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9ada5:	00 00 
      e9ada7:	6a 40                	push   0x40
      e9ada9:	5f                   	pop    rdi
      e9adaa:	e8 51 31 95 00       	call   17edf00 <_Znwm@plt>
      e9adaf:	48 89 c3             	mov    rbx,rax
      e9adb2:	48 8d 05 0f d9 9f 00 	lea    rax,[rip+0x9fd90f]        # 18986c8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5608>
      e9adb9:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9adbc:	48 89 df             	mov    rdi,rbx
      e9adbf:	48 83 c7 10          	add    rdi,0x10
      e9adc3:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9adca:	00 
      e9adcb:	4c 89 fe             	mov    rsi,r15
      e9adce:	e8 d1 dd 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9add3:	48 89 9c 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rbx
      e9adda:	00 
      e9addb:	4c 89 ff             	mov    rdi,r15
      e9adde:	e8 87 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ade3:	eb 09                	jmp    e9adee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62204>
      e9ade5:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9adec:	00 00 
      e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]

### call 0xe9adce: call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
- prior range refs: 0xe9ad9e->0x6c0
      e9ad89:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ad90:	00 
      e9ad91:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9ad98:	00 
      e9ad99:	e8 06 de 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9ad9e:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9ada5:	00 00 
      e9ada7:	6a 40                	push   0x40
      e9ada9:	5f                   	pop    rdi
      e9adaa:	e8 51 31 95 00       	call   17edf00 <_Znwm@plt>
      e9adaf:	48 89 c3             	mov    rbx,rax
      e9adb2:	48 8d 05 0f d9 9f 00 	lea    rax,[rip+0x9fd90f]        # 18986c8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5608>
      e9adb9:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9adbc:	48 89 df             	mov    rdi,rbx
      e9adbf:	48 83 c7 10          	add    rdi,0x10
      e9adc3:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9adca:	00 
      e9adcb:	4c 89 fe             	mov    rsi,r15
      e9adce:	e8 d1 dd 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9add3:	48 89 9c 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rbx
      e9adda:	00 
      e9addb:	4c 89 ff             	mov    rdi,r15
      e9adde:	e8 87 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ade3:	eb 09                	jmp    e9adee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62204>
      e9ade5:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9adec:	00 00 
      e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9adfa:	00 
      e9adfb:	48 89 df             	mov    rdi,rbx
      e9adfe:	e8 67 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae03:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ae0a:	00 
      e9ae0b:	e8 5a f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae10:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ae16:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9ae1d:	e8 64 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### call 0xe9adde: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xe9add3->0x6c0
      e9ad99:	e8 06 de 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9ad9e:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9ada5:	00 00 
      e9ada7:	6a 40                	push   0x40
      e9ada9:	5f                   	pop    rdi
      e9adaa:	e8 51 31 95 00       	call   17edf00 <_Znwm@plt>
      e9adaf:	48 89 c3             	mov    rbx,rax
      e9adb2:	48 8d 05 0f d9 9f 00 	lea    rax,[rip+0x9fd90f]        # 18986c8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5608>
      e9adb9:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9adbc:	48 89 df             	mov    rdi,rbx
      e9adbf:	48 83 c7 10          	add    rdi,0x10
      e9adc3:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9adca:	00 
      e9adcb:	4c 89 fe             	mov    rsi,r15
      e9adce:	e8 d1 dd 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9add3:	48 89 9c 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rbx
      e9adda:	00 
      e9addb:	4c 89 ff             	mov    rdi,r15
      e9adde:	e8 87 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ade3:	eb 09                	jmp    e9adee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62204>
      e9ade5:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9adec:	00 00 
      e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9adfa:	00 
      e9adfb:	48 89 df             	mov    rdi,rbx
      e9adfe:	e8 67 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae03:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ae0a:	00 
      e9ae0b:	e8 5a f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae10:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ae16:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9ae1d:	e8 64 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae22:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9ae29:	00 
      e9ae2a:	e8 3b f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae2f:	31 ff                	xor    edi,edi

### call 0xe9adfe: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xe9add3->0x6c0, 0xe9ade5->0x6c0
      e9adb9:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9adbc:	48 89 df             	mov    rdi,rbx
      e9adbf:	48 83 c7 10          	add    rdi,0x10
      e9adc3:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9adca:	00 
      e9adcb:	4c 89 fe             	mov    rsi,r15
      e9adce:	e8 d1 dd 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9add3:	48 89 9c 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rbx
      e9adda:	00 
      e9addb:	4c 89 ff             	mov    rdi,r15
      e9adde:	e8 87 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ade3:	eb 09                	jmp    e9adee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62204>
      e9ade5:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9adec:	00 00 
      e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9adfa:	00 
      e9adfb:	48 89 df             	mov    rdi,rbx
      e9adfe:	e8 67 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae03:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ae0a:	00 
      e9ae0b:	e8 5a f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae10:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ae16:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9ae1d:	e8 64 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae22:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9ae29:	00 
      e9ae2a:	e8 3b f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae2f:	31 ff                	xor    edi,edi
      e9ae31:	e8 50 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae36:	bf 00 01 00 00       	mov    edi,0x100
      e9ae3b:	e8 c0 30 95 00       	call   17edf00 <_Znwm@plt>
      e9ae40:	4c 8b bc 24 e8 12 00 	mov    r15,QWORD PTR [rsp+0x12e8]
      e9ae47:	00 
      e9ae48:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ae4c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ae51:	48 8d 0d 48 67 99 00 	lea    rcx,[rip+0x996748]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>

### call 0xe9ae0b: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xe9add3->0x6c0, 0xe9ade5->0x6c0
      e9adc3:	4c 8d bc 24 70 07 00 	lea    r15,[rsp+0x770]
      e9adca:	00 
      e9adcb:	4c 89 fe             	mov    rsi,r15
      e9adce:	e8 d1 dd 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9add3:	48 89 9c 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rbx
      e9adda:	00 
      e9addb:	4c 89 ff             	mov    rdi,r15
      e9adde:	e8 87 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ade3:	eb 09                	jmp    e9adee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62204>
      e9ade5:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9adec:	00 00 
      e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9adfa:	00 
      e9adfb:	48 89 df             	mov    rdi,rbx
      e9adfe:	e8 67 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae03:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ae0a:	00 
      e9ae0b:	e8 5a f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae10:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ae16:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9ae1d:	e8 64 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae22:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9ae29:	00 
      e9ae2a:	e8 3b f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae2f:	31 ff                	xor    edi,edi
      e9ae31:	e8 50 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae36:	bf 00 01 00 00       	mov    edi,0x100
      e9ae3b:	e8 c0 30 95 00       	call   17edf00 <_Znwm@plt>
      e9ae40:	4c 8b bc 24 e8 12 00 	mov    r15,QWORD PTR [rsp+0x12e8]
      e9ae47:	00 
      e9ae48:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ae4c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ae51:	48 8d 0d 48 67 99 00 	lea    rcx,[rip+0x996748]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>
      e9ae58:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9ae5b:	48 8d 68 20          	lea    rbp,[rax+0x20]
      e9ae5f:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]

### call 0xe9ae1d: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xe9ade5->0x6c0
      e9adce:	e8 d1 dd 7c 00       	call   1668ba4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cd10>
      e9add3:	48 89 9c 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rbx
      e9adda:	00 
      e9addb:	4c 89 ff             	mov    rdi,r15
      e9adde:	e8 87 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ade3:	eb 09                	jmp    e9adee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62204>
      e9ade5:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9adec:	00 00 
      e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9adfa:	00 
      e9adfb:	48 89 df             	mov    rdi,rbx
      e9adfe:	e8 67 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae03:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ae0a:	00 
      e9ae0b:	e8 5a f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae10:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ae16:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9ae1d:	e8 64 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae22:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9ae29:	00 
      e9ae2a:	e8 3b f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae2f:	31 ff                	xor    edi,edi
      e9ae31:	e8 50 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae36:	bf 00 01 00 00       	mov    edi,0x100
      e9ae3b:	e8 c0 30 95 00       	call   17edf00 <_Znwm@plt>
      e9ae40:	4c 8b bc 24 e8 12 00 	mov    r15,QWORD PTR [rsp+0x12e8]
      e9ae47:	00 
      e9ae48:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ae4c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ae51:	48 8d 0d 48 67 99 00 	lea    rcx,[rip+0x996748]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>
      e9ae58:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9ae5b:	48 8d 68 20          	lea    rbp,[rax+0x20]
      e9ae5f:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9ae66:	00 
      e9ae67:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
      e9ae6e:	00 

### call 0xe9ae2a: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xe9ade5->0x6c0, 0xe9ae22->0x670
      e9addb:	4c 89 ff             	mov    rdi,r15
      e9adde:	e8 87 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ade3:	eb 09                	jmp    e9adee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62204>
      e9ade5:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9adec:	00 00 
      e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9adfa:	00 
      e9adfb:	48 89 df             	mov    rdi,rbx
      e9adfe:	e8 67 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae03:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ae0a:	00 
      e9ae0b:	e8 5a f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae10:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ae16:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9ae1d:	e8 64 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae22:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9ae29:	00 
      e9ae2a:	e8 3b f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae2f:	31 ff                	xor    edi,edi
      e9ae31:	e8 50 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae36:	bf 00 01 00 00       	mov    edi,0x100
      e9ae3b:	e8 c0 30 95 00       	call   17edf00 <_Znwm@plt>
      e9ae40:	4c 8b bc 24 e8 12 00 	mov    r15,QWORD PTR [rsp+0x12e8]
      e9ae47:	00 
      e9ae48:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ae4c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ae51:	48 8d 0d 48 67 99 00 	lea    rcx,[rip+0x996748]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>
      e9ae58:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9ae5b:	48 8d 68 20          	lea    rbp,[rax+0x20]
      e9ae5f:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9ae66:	00 
      e9ae67:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
      e9ae6e:	00 
      e9ae6f:	49 89 c6             	mov    r14,rax
      e9ae72:	4c 89 e7             	mov    rdi,r12
      e9ae75:	e8 6a b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>

### call 0xe9ae31: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xe9ae22->0x670
      e9ade3:	eb 09                	jmp    e9adee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62204>
      e9ade5:	48 83 a4 24 c0 06 00 	and    QWORD PTR [rsp+0x6c0],0x0
      e9adec:	00 00 
      e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9adfa:	00 
      e9adfb:	48 89 df             	mov    rdi,rbx
      e9adfe:	e8 67 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae03:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ae0a:	00 
      e9ae0b:	e8 5a f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae10:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ae16:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9ae1d:	e8 64 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae22:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9ae29:	00 
      e9ae2a:	e8 3b f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae2f:	31 ff                	xor    edi,edi
      e9ae31:	e8 50 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae36:	bf 00 01 00 00       	mov    edi,0x100
      e9ae3b:	e8 c0 30 95 00       	call   17edf00 <_Znwm@plt>
      e9ae40:	4c 8b bc 24 e8 12 00 	mov    r15,QWORD PTR [rsp+0x12e8]
      e9ae47:	00 
      e9ae48:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ae4c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ae51:	48 8d 0d 48 67 99 00 	lea    rcx,[rip+0x996748]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>
      e9ae58:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9ae5b:	48 8d 68 20          	lea    rbp,[rax+0x20]
      e9ae5f:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9ae66:	00 
      e9ae67:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
      e9ae6e:	00 
      e9ae6f:	49 89 c6             	mov    r14,rax
      e9ae72:	4c 89 e7             	mov    rdi,r12
      e9ae75:	e8 6a b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
      e9ae7a:	48 8d 05 57 67 99 00 	lea    rax,[rip+0x996757]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
      e9ae81:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax

### call 0xe9ae3b: call   17edf00 <_Znwm@plt>
- prior range refs: 0xe9ae22->0x670
      e9adec:	00 00 
      e9adee:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      e9adf3:	48 8d 9c 24 60 10 00 	lea    rbx,[rsp+0x1060]
      e9adfa:	00 
      e9adfb:	48 89 df             	mov    rdi,rbx
      e9adfe:	e8 67 f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae03:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9ae0a:	00 
      e9ae0b:	e8 5a f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae10:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9ae16:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9ae1d:	e8 64 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae22:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      e9ae29:	00 
      e9ae2a:	e8 3b f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae2f:	31 ff                	xor    edi,edi
      e9ae31:	e8 50 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae36:	bf 00 01 00 00       	mov    edi,0x100
      e9ae3b:	e8 c0 30 95 00       	call   17edf00 <_Znwm@plt>
      e9ae40:	4c 8b bc 24 e8 12 00 	mov    r15,QWORD PTR [rsp+0x12e8]
      e9ae47:	00 
      e9ae48:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ae4c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ae51:	48 8d 0d 48 67 99 00 	lea    rcx,[rip+0x996748]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>
      e9ae58:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9ae5b:	48 8d 68 20          	lea    rbp,[rax+0x20]
      e9ae5f:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9ae66:	00 
      e9ae67:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
      e9ae6e:	00 
      e9ae6f:	49 89 c6             	mov    r14,rax
      e9ae72:	4c 89 e7             	mov    rdi,r12
      e9ae75:	e8 6a b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
      e9ae7a:	48 8d 05 57 67 99 00 	lea    rax,[rip+0x996757]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
      e9ae81:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ae88:	00 
      e9ae89:	4c 89 bc 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],r15

### call 0xe9ae75: call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
- prior range refs: 0xe9ae67->0x6a0
      e9ae2a:	e8 3b f1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9ae2f:	31 ff                	xor    edi,edi
      e9ae31:	e8 50 36 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9ae36:	bf 00 01 00 00       	mov    edi,0x100
      e9ae3b:	e8 c0 30 95 00       	call   17edf00 <_Znwm@plt>
      e9ae40:	4c 8b bc 24 e8 12 00 	mov    r15,QWORD PTR [rsp+0x12e8]
      e9ae47:	00 
      e9ae48:	66 0f ef c0          	pxor   xmm0,xmm0
      e9ae4c:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9ae51:	48 8d 0d 48 67 99 00 	lea    rcx,[rip+0x996748]        # 18315a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3538>
      e9ae58:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9ae5b:	48 8d 68 20          	lea    rbp,[rax+0x20]
      e9ae5f:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9ae66:	00 
      e9ae67:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
      e9ae6e:	00 
      e9ae6f:	49 89 c6             	mov    r14,rax
      e9ae72:	4c 89 e7             	mov    rdi,r12
      e9ae75:	e8 6a b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
      e9ae7a:	48 8d 05 57 67 99 00 	lea    rax,[rip+0x996757]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
      e9ae81:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ae88:	00 
      e9ae89:	4c 89 bc 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],r15
      e9ae90:	00 
      e9ae91:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9ae98:	00 
      e9ae99:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
      e9ae9e:	48 89 ef             	mov    rdi,rbp
      e9aea1:	4c 89 e6             	mov    rsi,r12
      e9aea4:	e8 3b b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
      e9aea9:	49 8d 7e 50          	lea    rdi,[r14+0x50]
      e9aead:	48 89 de             	mov    rsi,rbx
      e9aeb0:	e8 73 b4 00 00       	call   ea6328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d73e>
      e9aeb5:	66 0f ef c0          	pxor   xmm0,xmm0
      e9aeb9:	66 41 0f 7f 86 90 00 	movdqa XMMWORD PTR [r14+0x90],xmm0
      e9aec0:	00 00 
      e9aec2:	66 41 0f 7f 86 80 00 	movdqa XMMWORD PTR [r14+0x80],xmm0

### call 0xe9aea4: call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
- prior range refs: 0xe9ae67->0x6a0
      e9ae5b:	48 8d 68 20          	lea    rbp,[rax+0x20]
      e9ae5f:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
      e9ae66:	00 
      e9ae67:	48 8d b4 24 a0 06 00 	lea    rsi,[rsp+0x6a0]
      e9ae6e:	00 
      e9ae6f:	49 89 c6             	mov    r14,rax
      e9ae72:	4c 89 e7             	mov    rdi,r12
      e9ae75:	e8 6a b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
      e9ae7a:	48 8d 05 57 67 99 00 	lea    rax,[rip+0x996757]        # 18315d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3570>
      e9ae81:	48 89 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],rax
      e9ae88:	00 
      e9ae89:	4c 89 bc 24 68 10 00 	mov    QWORD PTR [rsp+0x1068],r15
      e9ae90:	00 
      e9ae91:	48 89 9c 24 80 10 00 	mov    QWORD PTR [rsp+0x1080],rbx
      e9ae98:	00 
      e9ae99:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
      e9ae9e:	48 89 ef             	mov    rdi,rbp
      e9aea1:	4c 89 e6             	mov    rsi,r12
      e9aea4:	e8 3b b4 00 00       	call   ea62e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6fa>
      e9aea9:	49 8d 7e 50          	lea    rdi,[r14+0x50]
      e9aead:	48 89 de             	mov    rsi,rbx
      e9aeb0:	e8 73 b4 00 00       	call   ea6328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d73e>
      e9aeb5:	66 0f ef c0          	pxor   xmm0,xmm0
      e9aeb9:	66 41 0f 7f 86 90 00 	movdqa XMMWORD PTR [r14+0x90],xmm0
      e9aec0:	00 00 
      e9aec2:	66 41 0f 7f 86 80 00 	movdqa XMMWORD PTR [r14+0x80],xmm0
      e9aec9:	00 00 
      e9aecb:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e9aed0:	41 89 86 a0 00 00 00 	mov    DWORD PTR [r14+0xa0],eax
      e9aed7:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
      e9aede:	00 00 
      e9aee0:	f3 41 0f 7f 86 b8 00 	movdqu XMMWORD PTR [r14+0xb8],xmm0
      e9aee7:	00 00 
      e9aee9:	41 89 86 c8 00 00 00 	mov    DWORD PTR [r14+0xc8],eax
      e9aef0:	66 41 0f 7f 86 d0 00 	movdqa XMMWORD PTR [r14+0xd0],xmm0
      e9aef7:	00 00 
      e9aef9:	66 41 0f 7f 86 e0 00 	movdqa XMMWORD PTR [r14+0xe0],xmm0

### call 0xe9b2f7: call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
- prior range refs: 0xe9b2ef->0x5e0
      e9b2a7:	48 89 84 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rax
      e9b2ae:	00 
      e9b2af:	48 8b 05 f2 67 a1 00 	mov    rax,QWORD PTR [rip+0xa167f2]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
      e9b2b6:	48 89 84 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rax
      e9b2bd:	00 
      e9b2be:	48 8d 84 24 e0 03 00 	lea    rax,[rsp+0x3e0]
      e9b2c5:	00 
      e9b2c6:	48 89 84 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rax
      e9b2cd:	00 
      e9b2ce:	48 8d 0d 0b 36 97 00 	lea    rcx,[rip+0x97360b]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e9b2d5:	48 8d 84 24 a0 0e 00 	lea    rax,[rsp+0xea0]
      e9b2dc:	00 
      e9b2dd:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9b2e0:	48 8d 0d 3b 25 91 00 	lea    rcx,[rip+0x91253b]        # 17ad822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16198e>
      e9b2e7:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e9b2eb:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e9b2ef:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9b2f6:	00 
      e9b2f7:	e8 70 b0 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9b2fc:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e9b303:	00 
      e9b304:	48 89 de             	mov    rsi,rbx
      e9b307:	e8 a4 b0 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
      e9b30c:	48 8d 05 3d 83 97 00 	lea    rax,[rip+0x97833d]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>
      e9b313:	48 8d 8c 24 80 05 00 	lea    rcx,[rsp+0x580]
      e9b31a:	00 
      e9b31b:	48 89 01             	mov    QWORD PTR [rcx],rax
      e9b31e:	48 8d 05 88 d3 05 00 	lea    rax,[rip+0x5d388]        # ef86ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbfac3>
      e9b325:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      e9b329:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      e9b32d:	48 8b 84 24 80 12 00 	mov    rax,QWORD PTR [rsp+0x1280]
      e9b334:	00 
      e9b335:	f3 0f 6f 08          	movdqu xmm1,XMMWORD PTR [rax]
      e9b339:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9b33d:	48 85 c0             	test   rax,rax
      e9b340:	74 05                	je     e9b347 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6275d>
      e9b342:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### call 0xe9b307: call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
- prior range refs: 0xe9b2ef->0x5e0
      e9b2bd:	00 
      e9b2be:	48 8d 84 24 e0 03 00 	lea    rax,[rsp+0x3e0]
      e9b2c5:	00 
      e9b2c6:	48 89 84 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rax
      e9b2cd:	00 
      e9b2ce:	48 8d 0d 0b 36 97 00 	lea    rcx,[rip+0x97360b]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e9b2d5:	48 8d 84 24 a0 0e 00 	lea    rax,[rsp+0xea0]
      e9b2dc:	00 
      e9b2dd:	48 89 08             	mov    QWORD PTR [rax],rcx
      e9b2e0:	48 8d 0d 3b 25 91 00 	lea    rcx,[rip+0x91253b]        # 17ad822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16198e>
      e9b2e7:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e9b2eb:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e9b2ef:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9b2f6:	00 
      e9b2f7:	e8 70 b0 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9b2fc:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e9b303:	00 
      e9b304:	48 89 de             	mov    rsi,rbx
      e9b307:	e8 a4 b0 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
      e9b30c:	48 8d 05 3d 83 97 00 	lea    rax,[rip+0x97833d]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>
      e9b313:	48 8d 8c 24 80 05 00 	lea    rcx,[rsp+0x580]
      e9b31a:	00 
      e9b31b:	48 89 01             	mov    QWORD PTR [rcx],rax
      e9b31e:	48 8d 05 88 d3 05 00 	lea    rax,[rip+0x5d388]        # ef86ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbfac3>
      e9b325:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
      e9b329:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      e9b32d:	48 8b 84 24 80 12 00 	mov    rax,QWORD PTR [rsp+0x1280]
      e9b334:	00 
      e9b335:	f3 0f 6f 08          	movdqu xmm1,XMMWORD PTR [rax]
      e9b339:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9b33d:	48 85 c0             	test   rax,rax
      e9b340:	74 05                	je     e9b347 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6275d>
      e9b342:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9b347:	41 80 7e 01 00       	cmp    BYTE PTR [r14+0x1],0x0
      e9b34c:	66 48 0f 3a 16 8c 24 	pextrq QWORD PTR [rsp+0x90],xmm1,0x1
      e9b353:	90 00 00 00 01 
      e9b358:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]

### call 0xe9bfb8: call   17edf00 <_Znwm@plt>
- prior range refs: 0xe9bf84->0x6e7
      e9bf75:	31 ff                	xor    edi,edi
      e9bf77:	e8 0a 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf7c:	4c 89 f7             	mov    rdi,r14
      e9bf7f:	e8 02 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf84:	80 bc 24 e7 06 00 00 	cmp    BYTE PTR [rsp+0x6e7],0x0
      e9bf8b:	00 
      e9bf8c:	0f 84 05 01 00 00    	je     e9c097 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x634ad>
      e9bf92:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9bf99:	00 
      e9bf9a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9bf9d:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9bfa2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9bfa6:	48 85 c0             	test   rax,rax
      e9bfa9:	74 0a                	je     e9bfb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x633cb>
      e9bfab:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9bfb0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9bfb5:	6a 60                	push   0x60
      e9bfb7:	5f                   	pop    rdi
      e9bfb8:	e8 43 1f 95 00       	call   17edf00 <_Znwm@plt>
      e9bfbd:	49 89 c7             	mov    r15,rax
      e9bfc0:	0f 57 c0             	xorps  xmm0,xmm0
      e9bfc3:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9bfc7:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9bfca:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9bfd0:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
      e9bfd7:	4d 85 f6             	test   r14,r14
      e9bfda:	74 15                	je     e9bff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63407>
      e9bfdc:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bfe1:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9bfe8:	00 00 
      e9bfea:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bfef:	eb 12                	jmp    e9c003 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63419>
      e9bff1:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9bff8:	00 00 
      e9bffa:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c001:	00 00 
      e9c003:	4d 8d 67 20          	lea    r12,[r15+0x20]

### call 0xe9c690: call   17edf00 <_Znwm@plt>
- prior range refs: 0xe9c670->0x6d9
      e9c64e:	00 
      e9c64f:	e8 5a d4 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c654:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
      e9c65b:	00 
      e9c65c:	e8 25 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c661:	31 ff                	xor    edi,edi
      e9c663:	e8 1e 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c668:	48 89 df             	mov    rdi,rbx
      e9c66b:	e8 16 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c670:	44 0f b6 b4 24 d9 06 	movzx  r14d,BYTE PTR [rsp+0x6d9]
      e9c677:	00 00 
      e9c679:	44 8a bc 24 60 07 00 	mov    r15b,BYTE PTR [rsp+0x760]
      e9c680:	00 
      e9c681:	44 89 f0             	mov    eax,r14d
      e9c684:	44 08 f8             	or     al,r15b
      e9c687:	0f 84 b9 00 00 00    	je     e9c746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63b5c>
      e9c68d:	6a 60                	push   0x60
      e9c68f:	5f                   	pop    rdi
      e9c690:	e8 6b 18 95 00       	call   17edf00 <_Znwm@plt>
      e9c695:	48 89 c3             	mov    rbx,rax
      e9c698:	31 c0                	xor    eax,eax
      e9c69a:	45 84 ff             	test   r15b,r15b
      e9c69d:	0f 95 c0             	setne  al
      e9c6a0:	c1 e0 08             	shl    eax,0x8
      e9c6a3:	4c 09 f0             	or     rax,r14
      e9c6a6:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c6aa:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9c6af:	48 89 2b             	mov    QWORD PTR [rbx],rbp
      e9c6b2:	4c 8d 73 20          	lea    r14,[rbx+0x20]
      e9c6b6:	48 8d 0d 23 0b 9a 00 	lea    rcx,[rip+0x9a0b23]        # 183d1e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf178>
      e9c6bd:	48 89 8c 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rcx
      e9c6c4:	00 
      e9c6c5:	48 8b 8c 24 38 13 00 	mov    rcx,QWORD PTR [rsp+0x1338]
      e9c6cc:	00 
      e9c6cd:	48 89 8c 24 78 07 00 	mov    QWORD PTR [rsp+0x778],rcx
      e9c6d4:	00 
      e9c6d5:	48 89 84 24 80 07 00 	mov    QWORD PTR [rsp+0x780],rax

### call 0xe9c902: call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
- prior range refs: 0xe9c8f7->0x610
      e9c8b8:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      e9c8bd:	f3 41 0f 7f 45 38    	movdqu XMMWORD PTR [r13+0x38],xmm0
      e9c8c3:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      e9c8c7:	49 89 45 48          	mov    QWORD PTR [r13+0x48],rax
      e9c8cb:	66 41 0f 7f 0e       	movdqa XMMWORD PTR [r14],xmm1
      e9c8d0:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      e9c8d5:	4c 89 f7             	mov    rdi,r14
      e9c8d8:	e8 0b ed bd ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
      e9c8dd:	31 ff                	xor    edi,edi
      e9c8df:	e8 38 1b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c8e4:	48 8b 84 24 38 13 00 	mov    rax,QWORD PTR [rsp+0x1338]
      e9c8eb:	00 
      e9c8ec:	49 89 06             	mov    QWORD PTR [r14],rax
      e9c8ef:	48 8d ac 24 80 07 00 	lea    rbp,[rsp+0x780]
      e9c8f6:	00 
      e9c8f7:	48 8d b4 24 10 06 00 	lea    rsi,[rsp+0x610]
      e9c8fe:	00 
      e9c8ff:	48 89 ef             	mov    rdi,rbp
      e9c902:	e8 f1 c8 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      e9c907:	48 8b 84 24 00 13 00 	mov    rax,QWORD PTR [rsp+0x1300]
      e9c90e:	00 
      e9c90f:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
      e9c913:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15
      e9c917:	48 8d bc 24 c0 07 00 	lea    rdi,[rsp+0x7c0]
      e9c91e:	00 
      e9c91f:	48 89 de             	mov    rsi,rbx
      e9c922:	e8 97 f3 c2 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e9c927:	4c 8b b4 24 50 13 00 	mov    r14,QWORD PTR [rsp+0x1350]
      e9c92e:	00 
      e9c92f:	48 8d bc 24 d0 07 00 	lea    rdi,[rsp+0x7d0]
      e9c936:	00 
      e9c937:	48 8d b4 24 d0 0e 00 	lea    rsi,[rsp+0xed0]
      e9c93e:	00 
      e9c93f:	e8 60 c5 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
      e9c944:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e9c94b:	00 
      e9c94c:	48 8d b4 24 e0 05 00 	lea    rsi,[rsp+0x5e0]

### call 0xe9c922: call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
- prior range refs: 0xe9c8f7->0x610
      e9c8dd:	31 ff                	xor    edi,edi
      e9c8df:	e8 38 1b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c8e4:	48 8b 84 24 38 13 00 	mov    rax,QWORD PTR [rsp+0x1338]
      e9c8eb:	00 
      e9c8ec:	49 89 06             	mov    QWORD PTR [r14],rax
      e9c8ef:	48 8d ac 24 80 07 00 	lea    rbp,[rsp+0x780]
      e9c8f6:	00 
      e9c8f7:	48 8d b4 24 10 06 00 	lea    rsi,[rsp+0x610]
      e9c8fe:	00 
      e9c8ff:	48 89 ef             	mov    rdi,rbp
      e9c902:	e8 f1 c8 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      e9c907:	48 8b 84 24 00 13 00 	mov    rax,QWORD PTR [rsp+0x1300]
      e9c90e:	00 
      e9c90f:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
      e9c913:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15
      e9c917:	48 8d bc 24 c0 07 00 	lea    rdi,[rsp+0x7c0]
      e9c91e:	00 
      e9c91f:	48 89 de             	mov    rsi,rbx
      e9c922:	e8 97 f3 c2 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e9c927:	4c 8b b4 24 50 13 00 	mov    r14,QWORD PTR [rsp+0x1350]
      e9c92e:	00 
      e9c92f:	48 8d bc 24 d0 07 00 	lea    rdi,[rsp+0x7d0]
      e9c936:	00 
      e9c937:	48 8d b4 24 d0 0e 00 	lea    rsi,[rsp+0xed0]
      e9c93e:	00 
      e9c93f:	e8 60 c5 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
      e9c944:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e9c94b:	00 
      e9c94c:	48 8d b4 24 e0 05 00 	lea    rsi,[rsp+0x5e0]
      e9c953:	00 
      e9c954:	e8 13 9a 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9c959:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
      e9c960:	00 
      e9c961:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
      e9c968:	00 
      e9c969:	e8 42 9a 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
      e9c96e:	48 8d 9c 24 60 08 00 	lea    rbx,[rsp+0x860]

### call 0xe9c954: call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
- prior range refs: 0xe9c94c->0x5e0
      e9c90e:	00 
      e9c90f:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
      e9c913:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15
      e9c917:	48 8d bc 24 c0 07 00 	lea    rdi,[rsp+0x7c0]
      e9c91e:	00 
      e9c91f:	48 89 de             	mov    rsi,rbx
      e9c922:	e8 97 f3 c2 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e9c927:	4c 8b b4 24 50 13 00 	mov    r14,QWORD PTR [rsp+0x1350]
      e9c92e:	00 
      e9c92f:	48 8d bc 24 d0 07 00 	lea    rdi,[rsp+0x7d0]
      e9c936:	00 
      e9c937:	48 8d b4 24 d0 0e 00 	lea    rsi,[rsp+0xed0]
      e9c93e:	00 
      e9c93f:	e8 60 c5 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
      e9c944:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e9c94b:	00 
      e9c94c:	48 8d b4 24 e0 05 00 	lea    rsi,[rsp+0x5e0]
      e9c953:	00 
      e9c954:	e8 13 9a 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9c959:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
      e9c960:	00 
      e9c961:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
      e9c968:	00 
      e9c969:	e8 42 9a 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
      e9c96e:	48 8d 9c 24 60 08 00 	lea    rbx,[rsp+0x860]
      e9c975:	00 
      e9c976:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
      e9c97d:	00 
      e9c97e:	48 89 df             	mov    rdi,rbx
      e9c981:	e8 62 c5 05 00       	call   ef8ee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02fe>
      e9c986:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
      e9c98d:	00 
      e9c98e:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      e9c992:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9c999:	00 
      e9c99a:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      e9c99e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]

### call 0xe9c969: call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
- prior range refs: 0xe9c94c->0x5e0
      e9c91f:	48 89 de             	mov    rsi,rbx
      e9c922:	e8 97 f3 c2 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e9c927:	4c 8b b4 24 50 13 00 	mov    r14,QWORD PTR [rsp+0x1350]
      e9c92e:	00 
      e9c92f:	48 8d bc 24 d0 07 00 	lea    rdi,[rsp+0x7d0]
      e9c936:	00 
      e9c937:	48 8d b4 24 d0 0e 00 	lea    rsi,[rsp+0xed0]
      e9c93e:	00 
      e9c93f:	e8 60 c5 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
      e9c944:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e9c94b:	00 
      e9c94c:	48 8d b4 24 e0 05 00 	lea    rsi,[rsp+0x5e0]
      e9c953:	00 
      e9c954:	e8 13 9a 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9c959:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
      e9c960:	00 
      e9c961:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
      e9c968:	00 
      e9c969:	e8 42 9a 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
      e9c96e:	48 8d 9c 24 60 08 00 	lea    rbx,[rsp+0x860]
      e9c975:	00 
      e9c976:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
      e9c97d:	00 
      e9c97e:	48 89 df             	mov    rdi,rbx
      e9c981:	e8 62 c5 05 00       	call   ef8ee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02fe>
      e9c986:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
      e9c98d:	00 
      e9c98e:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      e9c992:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9c999:	00 
      e9c99a:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      e9c99e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9c9a3:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      e9c9a7:	4c 89 73 48          	mov    QWORD PTR [rbx+0x48],r14
      e9c9ab:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
      e9c9b2:	00 
      e9c9b3:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]

### call 0xe9c981: call   ef8ee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02fe>
- prior range refs: 0xe9c94c->0x5e0
      e9c937:	48 8d b4 24 d0 0e 00 	lea    rsi,[rsp+0xed0]
      e9c93e:	00 
      e9c93f:	e8 60 c5 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
      e9c944:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e9c94b:	00 
      e9c94c:	48 8d b4 24 e0 05 00 	lea    rsi,[rsp+0x5e0]
      e9c953:	00 
      e9c954:	e8 13 9a 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9c959:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
      e9c960:	00 
      e9c961:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
      e9c968:	00 
      e9c969:	e8 42 9a 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
      e9c96e:	48 8d 9c 24 60 08 00 	lea    rbx,[rsp+0x860]
      e9c975:	00 
      e9c976:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
      e9c97d:	00 
      e9c97e:	48 89 df             	mov    rdi,rbx
      e9c981:	e8 62 c5 05 00       	call   ef8ee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02fe>
      e9c986:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
      e9c98d:	00 
      e9c98e:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      e9c992:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9c999:	00 
      e9c99a:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      e9c99e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9c9a3:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      e9c9a7:	4c 89 73 48          	mov    QWORD PTR [rbx+0x48],r14
      e9c9ab:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
      e9c9b2:	00 
      e9c9b3:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9c9b7:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9c9bb:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
      e9c9c0:	48 85 c0             	test   rax,rax
      e9c9c3:	4c 8b b4 24 80 00 00 	mov    r14,QWORD PTR [rsp+0x80]
      e9c9ca:	00 
      e9c9cb:	4c 8b bc 24 b8 00 00 	mov    r15,QWORD PTR [rsp+0xb8]

### call 0xe9c9ea: call   ef8f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0342>
- prior range refs: 0xe9c9e2->0x6d0
      e9c9a3:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      e9c9a7:	4c 89 73 48          	mov    QWORD PTR [rbx+0x48],r14
      e9c9ab:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
      e9c9b2:	00 
      e9c9b3:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9c9b7:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9c9bb:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
      e9c9c0:	48 85 c0             	test   rax,rax
      e9c9c3:	4c 8b b4 24 80 00 00 	mov    r14,QWORD PTR [rsp+0x80]
      e9c9ca:	00 
      e9c9cb:	4c 8b bc 24 b8 00 00 	mov    r15,QWORD PTR [rsp+0xb8]
      e9c9d2:	00 
      e9c9d3:	74 05                	je     e9c9da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63df0>
      e9c9d5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9c9da:	48 8d bc 24 c0 08 00 	lea    rdi,[rsp+0x8c0]
      e9c9e1:	00 
      e9c9e2:	48 8d b4 24 d0 06 00 	lea    rsi,[rsp+0x6d0]
      e9c9e9:	00 
      e9c9ea:	e8 3d c5 05 00       	call   ef8f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0342>
      e9c9ef:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
      e9c9f4:	66 48 0f 6e c0       	movq   xmm0,rax
      e9c9f9:	f3 0f 7e 4c 24 70    	movq   xmm1,QWORD PTR [rsp+0x70]
      e9c9ff:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9ca03:	48 83 c0 08          	add    rax,0x8
      e9ca07:	48 8d bc 24 80 09 00 	lea    rdi,[rsp+0x980]
      e9ca0e:	00 
      e9ca0f:	66 0f 7f 4f e0       	movdqa XMMWORD PTR [rdi-0x20],xmm1
      e9ca14:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9ca18:	8a 44 24 27          	mov    al,BYTE PTR [rsp+0x27]
      e9ca1c:	88 47 f0             	mov    BYTE PTR [rdi-0x10],al
      e9ca1f:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9ca26:	00 
      e9ca27:	e8 64 d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ca2c:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      e9ca31:	66 48 0f 6e c0       	movq   xmm0,rax
      e9ca36:	f3 0f 7e 8c 24 30 01 	movq   xmm1,QWORD PTR [rsp+0x130]
      e9ca3d:	00 00 

### call 0xe9ca27: call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
- prior range refs: 0xe9c9e2->0x6d0
      e9c9da:	48 8d bc 24 c0 08 00 	lea    rdi,[rsp+0x8c0]
      e9c9e1:	00 
      e9c9e2:	48 8d b4 24 d0 06 00 	lea    rsi,[rsp+0x6d0]
      e9c9e9:	00 
      e9c9ea:	e8 3d c5 05 00       	call   ef8f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0342>
      e9c9ef:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
      e9c9f4:	66 48 0f 6e c0       	movq   xmm0,rax
      e9c9f9:	f3 0f 7e 4c 24 70    	movq   xmm1,QWORD PTR [rsp+0x70]
      e9c9ff:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9ca03:	48 83 c0 08          	add    rax,0x8
      e9ca07:	48 8d bc 24 80 09 00 	lea    rdi,[rsp+0x980]
      e9ca0e:	00 
      e9ca0f:	66 0f 7f 4f e0       	movdqa XMMWORD PTR [rdi-0x20],xmm1
      e9ca14:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9ca18:	8a 44 24 27          	mov    al,BYTE PTR [rsp+0x27]
      e9ca1c:	88 47 f0             	mov    BYTE PTR [rdi-0x10],al
      e9ca1f:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
      e9ca26:	00 
      e9ca27:	e8 64 d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ca2c:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      e9ca31:	66 48 0f 6e c0       	movq   xmm0,rax
      e9ca36:	f3 0f 7e 8c 24 30 01 	movq   xmm1,QWORD PTR [rsp+0x130]
      e9ca3d:	00 00 
      e9ca3f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9ca43:	48 8d bc 24 c0 09 00 	lea    rdi,[rsp+0x9c0]
      e9ca4a:	00 
      e9ca4b:	66 0f 7f 4f f0       	movdqa XMMWORD PTR [rdi-0x10],xmm1
      e9ca50:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9ca55:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
      e9ca5c:	00 
      e9ca5d:	e8 2e d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ca62:	48 8d bc 24 f0 09 00 	lea    rdi,[rsp+0x9f0]
      e9ca69:	00 
      e9ca6a:	48 8d b4 24 e0 03 00 	lea    rsi,[rsp+0x3e0]
      e9ca71:	00 
      e9ca72:	e8 19 d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ca77:	66 49 0f 6e cf       	movq   xmm1,r15

### call 0xe9ccb0: call   17edf00 <_Znwm@plt>
- prior range refs: 0xe9cca2->0x660
      e9cc6d:	00 
      e9cc6e:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
      e9cc72:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9cc75:	0f 29 84 24 10 0b 00 	movaps XMMWORD PTR [rsp+0xb10],xmm0
      e9cc7c:	00 
      e9cc7d:	48 85 d2             	test   rdx,rdx
      e9cc80:	74 05                	je     e9cc87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6409d>
      e9cc82:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      e9cc87:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9cc8b:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9cc8f:	66 0f 7f 84 24 20 0b 	movdqa XMMWORD PTR [rsp+0xb20],xmm0
      e9cc96:	00 00 
      e9cc98:	48 85 c0             	test   rax,rax
      e9cc9b:	74 05                	je     e9cca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x640b8>
      e9cc9d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9cca2:	48 83 a4 24 60 06 00 	and    QWORD PTR [rsp+0x660],0x0
      e9cca9:	00 00 
      e9ccab:	bf d0 03 00 00       	mov    edi,0x3d0
      e9ccb0:	e8 4b 12 95 00       	call   17edf00 <_Znwm@plt>
      e9ccb5:	49 89 c4             	mov    r12,rax
      e9ccb8:	4c 8d bc 24 b0 07 00 	lea    r15,[rsp+0x7b0]
      e9ccbf:	00 
      e9ccc0:	48 89 84 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],rax
      e9ccc7:	00 
      e9ccc8:	48 8d 84 24 20 05 00 	lea    rax,[rsp+0x520]
      e9cccf:	00 
      e9ccd0:	48 89 84 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],rax
      e9ccd7:	00 
      e9ccd8:	48 c7 84 24 40 0b 00 	mov    QWORD PTR [rsp+0xb40],0x1
      e9ccdf:	00 01 00 00 00 
      e9cce4:	48 8d 05 f5 98 99 00 	lea    rax,[rip+0x9998f5]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      e9cceb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ccef:	49 8b 47 c0          	mov    rax,QWORD PTR [r15-0x40]
      e9ccf3:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      e9ccf8:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
      e9ccfd:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      e9cd02:	48 89 ee             	mov    rsi,rbp

### call 0xe9d0c5: call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
- prior range refs: 0xe9d0bd->0x660
      e9d082:	00 00 
      e9d084:	48 85 c0             	test   rax,rax
      e9d087:	74 05                	je     e9d08e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x644a4>
      e9d089:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d08e:	48 8b 84 24 28 0b 00 	mov    rax,QWORD PTR [rsp+0xb28]
      e9d095:	00 
      e9d096:	0f 28 84 24 20 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb20]
      e9d09d:	00 
      e9d09e:	41 0f 11 84 24 c0 03 	movups XMMWORD PTR [r12+0x3c0],xmm0
      e9d0a5:	00 00 
      e9d0a7:	48 85 c0             	test   rax,rax
      e9d0aa:	74 05                	je     e9d0b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x644c7>
      e9d0ac:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d0b1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9d0b8:	00 
      e9d0b9:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9d0bd:	4c 89 a4 24 60 06 00 	mov    QWORD PTR [rsp+0x660],r12
      e9d0c4:	00 
      e9d0c5:	e8 00 d2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9d0ca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d0d1:	00 
      e9d0d2:	e8 97 be 05 00       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      e9d0d7:	4c 89 ef             	mov    rdi,r13
      e9d0da:	e8 a7 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d0df:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
      e9d0e6:	00 
      e9d0e7:	48 89 df             	mov    rdi,rbx
      e9d0ea:	e8 a1 0d 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9d0ef:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
      e9d0f6:	00 
      e9d0f7:	4c 89 f7             	mov    rdi,r14
      e9d0fa:	e8 23 0a c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e9d0ff:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
      e9d105:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9d10c:	e8 75 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d111:	31 ff                	xor    edi,edi
      e9d113:	e8 6e 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### call 0xe9d0d2: call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
- prior range refs: 0xe9d0bd->0x660
      e9d089:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d08e:	48 8b 84 24 28 0b 00 	mov    rax,QWORD PTR [rsp+0xb28]
      e9d095:	00 
      e9d096:	0f 28 84 24 20 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb20]
      e9d09d:	00 
      e9d09e:	41 0f 11 84 24 c0 03 	movups XMMWORD PTR [r12+0x3c0],xmm0
      e9d0a5:	00 00 
      e9d0a7:	48 85 c0             	test   rax,rax
      e9d0aa:	74 05                	je     e9d0b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x644c7>
      e9d0ac:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d0b1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9d0b8:	00 
      e9d0b9:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9d0bd:	4c 89 a4 24 60 06 00 	mov    QWORD PTR [rsp+0x660],r12
      e9d0c4:	00 
      e9d0c5:	e8 00 d2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9d0ca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d0d1:	00 
      e9d0d2:	e8 97 be 05 00       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      e9d0d7:	4c 89 ef             	mov    rdi,r13
      e9d0da:	e8 a7 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d0df:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
      e9d0e6:	00 
      e9d0e7:	48 89 df             	mov    rdi,rbx
      e9d0ea:	e8 a1 0d 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9d0ef:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
      e9d0f6:	00 
      e9d0f7:	4c 89 f7             	mov    rdi,r14
      e9d0fa:	e8 23 0a c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e9d0ff:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
      e9d105:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9d10c:	e8 75 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d111:	31 ff                	xor    edi,edi
      e9d113:	e8 6e 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d118:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9d11f:	00 
      e9d120:	e8 45 ce bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### call 0xe9d0da: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xe9d0bd->0x660
      e9d095:	00 
      e9d096:	0f 28 84 24 20 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb20]
      e9d09d:	00 
      e9d09e:	41 0f 11 84 24 c0 03 	movups XMMWORD PTR [r12+0x3c0],xmm0
      e9d0a5:	00 00 
      e9d0a7:	48 85 c0             	test   rax,rax
      e9d0aa:	74 05                	je     e9d0b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x644c7>
      e9d0ac:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d0b1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9d0b8:	00 
      e9d0b9:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9d0bd:	4c 89 a4 24 60 06 00 	mov    QWORD PTR [rsp+0x660],r12
      e9d0c4:	00 
      e9d0c5:	e8 00 d2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9d0ca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d0d1:	00 
      e9d0d2:	e8 97 be 05 00       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      e9d0d7:	4c 89 ef             	mov    rdi,r13
      e9d0da:	e8 a7 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d0df:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
      e9d0e6:	00 
      e9d0e7:	48 89 df             	mov    rdi,rbx
      e9d0ea:	e8 a1 0d 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9d0ef:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
      e9d0f6:	00 
      e9d0f7:	4c 89 f7             	mov    rdi,r14
      e9d0fa:	e8 23 0a c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e9d0ff:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
      e9d105:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9d10c:	e8 75 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d111:	31 ff                	xor    edi,edi
      e9d113:	e8 6e 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d118:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9d11f:	00 
      e9d120:	e8 45 ce bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d125:	31 ff                	xor    edi,edi
      e9d127:	e8 5a 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### call 0xe9d0ea: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- prior range refs: 0xe9d0bd->0x660
      e9d0a5:	00 00 
      e9d0a7:	48 85 c0             	test   rax,rax
      e9d0aa:	74 05                	je     e9d0b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x644c7>
      e9d0ac:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d0b1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9d0b8:	00 
      e9d0b9:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9d0bd:	4c 89 a4 24 60 06 00 	mov    QWORD PTR [rsp+0x660],r12
      e9d0c4:	00 
      e9d0c5:	e8 00 d2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9d0ca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d0d1:	00 
      e9d0d2:	e8 97 be 05 00       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      e9d0d7:	4c 89 ef             	mov    rdi,r13
      e9d0da:	e8 a7 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d0df:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
      e9d0e6:	00 
      e9d0e7:	48 89 df             	mov    rdi,rbx
      e9d0ea:	e8 a1 0d 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9d0ef:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
      e9d0f6:	00 
      e9d0f7:	4c 89 f7             	mov    rdi,r14
      e9d0fa:	e8 23 0a c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e9d0ff:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
      e9d105:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9d10c:	e8 75 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d111:	31 ff                	xor    edi,edi
      e9d113:	e8 6e 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d118:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9d11f:	00 
      e9d120:	e8 45 ce bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d125:	31 ff                	xor    edi,edi
      e9d127:	e8 5a 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d12c:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
      e9d133:	00 
      e9d134:	e8 c1 a9 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      e9d139:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]

### call 0xe9d0fa: call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
- prior range refs: 0xe9d0bd->0x660
      e9d0b1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      e9d0b8:	00 
      e9d0b9:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e9d0bd:	4c 89 a4 24 60 06 00 	mov    QWORD PTR [rsp+0x660],r12
      e9d0c4:	00 
      e9d0c5:	e8 00 d2 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9d0ca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d0d1:	00 
      e9d0d2:	e8 97 be 05 00       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      e9d0d7:	4c 89 ef             	mov    rdi,r13
      e9d0da:	e8 a7 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d0df:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
      e9d0e6:	00 
      e9d0e7:	48 89 df             	mov    rdi,rbx
      e9d0ea:	e8 a1 0d 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9d0ef:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
      e9d0f6:	00 
      e9d0f7:	4c 89 f7             	mov    rdi,r14
      e9d0fa:	e8 23 0a c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e9d0ff:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
      e9d105:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9d10c:	e8 75 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d111:	31 ff                	xor    edi,edi
      e9d113:	e8 6e 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d118:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      e9d11f:	00 
      e9d120:	e8 45 ce bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d125:	31 ff                	xor    edi,edi
      e9d127:	e8 5a 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d12c:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
      e9d133:	00 
      e9d134:	e8 c1 a9 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      e9d139:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      e9d13e:	e8 43 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d143:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      e9d148:	e8 39 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d14d:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]

### call 0xe9d19d: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xe9d195->0x5e0
      e9d14d:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e9d152:	e8 2f 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d157:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e9d15e:	00 
      e9d15f:	e8 22 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d164:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      e9d169:	e8 18 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d16e:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      e9d175:	00 
      e9d176:	e8 0b 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d17b:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      e9d182:	00 
      e9d183:	e8 e2 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d188:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e9d18f:	00 
      e9d190:	e8 d5 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d195:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9d19c:	00 
      e9d19d:	e8 c8 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1a2:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9d1a9:	00 
      e9d1aa:	e8 bb cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1af:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9d1b6:	00 
      e9d1b7:	e8 ae cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1bc:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      e9d1c3:	00 
      e9d1c4:	e8 bd 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d1c9:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9d1d0:	00 
      e9d1d1:	48 89 ef             	mov    rdi,rbp
      e9d1d4:	e8 91 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1d9:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      e9d1e0:	00 
      e9d1e1:	e8 84 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1e6:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
      e9d1eb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]

### call 0xe9d1aa: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xe9d195->0x5e0
      e9d15e:	00 
      e9d15f:	e8 22 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d164:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      e9d169:	e8 18 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d16e:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      e9d175:	00 
      e9d176:	e8 0b 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d17b:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      e9d182:	00 
      e9d183:	e8 e2 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d188:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e9d18f:	00 
      e9d190:	e8 d5 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d195:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9d19c:	00 
      e9d19d:	e8 c8 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1a2:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9d1a9:	00 
      e9d1aa:	e8 bb cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1af:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9d1b6:	00 
      e9d1b7:	e8 ae cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1bc:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      e9d1c3:	00 
      e9d1c4:	e8 bd 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d1c9:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9d1d0:	00 
      e9d1d1:	48 89 ef             	mov    rdi,rbp
      e9d1d4:	e8 91 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1d9:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      e9d1e0:	00 
      e9d1e1:	e8 84 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1e6:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
      e9d1eb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e9d1f0:	48 8d 05 b9 44 99 00 	lea    rax,[rip+0x9944b9]        # 18316b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3648>
      e9d1f7:	49 89 06             	mov    QWORD PTR [r14],rax
      e9d1fa:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]

### call 0xe9d1b7: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xe9d195->0x5e0
      e9d169:	e8 18 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d16e:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      e9d175:	00 
      e9d176:	e8 0b 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d17b:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      e9d182:	00 
      e9d183:	e8 e2 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d188:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e9d18f:	00 
      e9d190:	e8 d5 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d195:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9d19c:	00 
      e9d19d:	e8 c8 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1a2:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9d1a9:	00 
      e9d1aa:	e8 bb cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1af:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9d1b6:	00 
      e9d1b7:	e8 ae cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1bc:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      e9d1c3:	00 
      e9d1c4:	e8 bd 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d1c9:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9d1d0:	00 
      e9d1d1:	48 89 ef             	mov    rdi,rbp
      e9d1d4:	e8 91 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1d9:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      e9d1e0:	00 
      e9d1e1:	e8 84 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1e6:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
      e9d1eb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e9d1f0:	48 8d 05 b9 44 99 00 	lea    rax,[rip+0x9944b9]        # 18316b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3648>
      e9d1f7:	49 89 06             	mov    QWORD PTR [r14],rax
      e9d1fa:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e9d1ff:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      e9d203:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
      e9d207:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14

### call 0xe9d1c4: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xe9d195->0x5e0
      e9d176:	e8 0b 13 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d17b:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      e9d182:	00 
      e9d183:	e8 e2 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d188:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e9d18f:	00 
      e9d190:	e8 d5 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d195:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9d19c:	00 
      e9d19d:	e8 c8 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1a2:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9d1a9:	00 
      e9d1aa:	e8 bb cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1af:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9d1b6:	00 
      e9d1b7:	e8 ae cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1bc:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      e9d1c3:	00 
      e9d1c4:	e8 bd 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d1c9:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9d1d0:	00 
      e9d1d1:	48 89 ef             	mov    rdi,rbp
      e9d1d4:	e8 91 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1d9:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      e9d1e0:	00 
      e9d1e1:	e8 84 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1e6:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
      e9d1eb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e9d1f0:	48 8d 05 b9 44 99 00 	lea    rax,[rip+0x9944b9]        # 18316b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3648>
      e9d1f7:	49 89 06             	mov    QWORD PTR [r14],rax
      e9d1fa:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e9d1ff:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      e9d203:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
      e9d207:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
      e9d20b:	31 ff                	xor    edi,edi
      e9d20d:	e8 74 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d212:	48 8d 05 37 64 97 00 	lea    rax,[rip+0x976437]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>

### call 0xe9d1d4: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xe9d195->0x5e0
      e9d188:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      e9d18f:	00 
      e9d190:	e8 d5 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d195:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9d19c:	00 
      e9d19d:	e8 c8 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1a2:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9d1a9:	00 
      e9d1aa:	e8 bb cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1af:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9d1b6:	00 
      e9d1b7:	e8 ae cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1bc:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      e9d1c3:	00 
      e9d1c4:	e8 bd 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d1c9:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9d1d0:	00 
      e9d1d1:	48 89 ef             	mov    rdi,rbp
      e9d1d4:	e8 91 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1d9:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      e9d1e0:	00 
      e9d1e1:	e8 84 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1e6:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
      e9d1eb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e9d1f0:	48 8d 05 b9 44 99 00 	lea    rax,[rip+0x9944b9]        # 18316b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3648>
      e9d1f7:	49 89 06             	mov    QWORD PTR [r14],rax
      e9d1fa:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e9d1ff:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      e9d203:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
      e9d207:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
      e9d20b:	31 ff                	xor    edi,edi
      e9d20d:	e8 74 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d212:	48 8d 05 37 64 97 00 	lea    rax,[rip+0x976437]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>
      e9d219:	48 89 84 24 20 05 00 	mov    QWORD PTR [rsp+0x520],rax
      e9d220:	00 
      e9d221:	48 8d 05 a0 81 06 00 	lea    rax,[rip+0x681a0]        # f053c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc7de>
      e9d228:	48 89 84 24 28 05 00 	mov    QWORD PTR [rsp+0x528],rax

### call 0xe9d1e1: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xe9d1d9->0x610
      e9d195:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e9d19c:	00 
      e9d19d:	e8 c8 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1a2:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      e9d1a9:	00 
      e9d1aa:	e8 bb cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1af:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      e9d1b6:	00 
      e9d1b7:	e8 ae cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1bc:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      e9d1c3:	00 
      e9d1c4:	e8 bd 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d1c9:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9d1d0:	00 
      e9d1d1:	48 89 ef             	mov    rdi,rbp
      e9d1d4:	e8 91 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1d9:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      e9d1e0:	00 
      e9d1e1:	e8 84 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1e6:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
      e9d1eb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e9d1f0:	48 8d 05 b9 44 99 00 	lea    rax,[rip+0x9944b9]        # 18316b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3648>
      e9d1f7:	49 89 06             	mov    QWORD PTR [r14],rax
      e9d1fa:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e9d1ff:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      e9d203:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
      e9d207:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
      e9d20b:	31 ff                	xor    edi,edi
      e9d20d:	e8 74 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d212:	48 8d 05 37 64 97 00 	lea    rax,[rip+0x976437]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>
      e9d219:	48 89 84 24 20 05 00 	mov    QWORD PTR [rsp+0x520],rax
      e9d220:	00 
      e9d221:	48 8d 05 a0 81 06 00 	lea    rax,[rip+0x681a0]        # f053c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc7de>
      e9d228:	48 89 84 24 28 05 00 	mov    QWORD PTR [rsp+0x528],rax
      e9d22f:	00 
      e9d230:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
      e9d237:	00 

### call 0xe9d20d: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xe9d1d9->0x610
      e9d1c3:	00 
      e9d1c4:	e8 bd 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d1c9:	48 8d ac 24 d0 0e 00 	lea    rbp,[rsp+0xed0]
      e9d1d0:	00 
      e9d1d1:	48 89 ef             	mov    rdi,rbp
      e9d1d4:	e8 91 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1d9:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      e9d1e0:	00 
      e9d1e1:	e8 84 cd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d1e6:	48 8b 4c 24 78       	mov    rcx,QWORD PTR [rsp+0x78]
      e9d1eb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e9d1f0:	48 8d 05 b9 44 99 00 	lea    rax,[rip+0x9944b9]        # 18316b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3648>
      e9d1f7:	49 89 06             	mov    QWORD PTR [r14],rax
      e9d1fa:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e9d1ff:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      e9d203:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
      e9d207:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
      e9d20b:	31 ff                	xor    edi,edi
      e9d20d:	e8 74 12 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9d212:	48 8d 05 37 64 97 00 	lea    rax,[rip+0x976437]        # 1813650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9310>
      e9d219:	48 89 84 24 20 05 00 	mov    QWORD PTR [rsp+0x520],rax
      e9d220:	00 
      e9d221:	48 8d 05 a0 81 06 00 	lea    rax,[rip+0x681a0]        # f053c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc7de>
      e9d228:	48 89 84 24 28 05 00 	mov    QWORD PTR [rsp+0x528],rax
      e9d22f:	00 
      e9d230:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
      e9d237:	00 
      e9d238:	48 89 b4 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rsi
      e9d23f:	00 
      e9d240:	48 8d 05 b1 44 99 00 	lea    rax,[rip+0x9944b1]        # 18316f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3690>
      e9d247:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9d24a:	4c 8b b4 24 e8 12 00 	mov    r14,QWORD PTR [rsp+0x12e8]
      e9d251:	00 
      e9d252:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
      e9d256:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
      e9d25a:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
      e9d261:	00 

### call 0xe9d287: call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
- prior range refs: 0xe9d27c->0x640
      e9d23f:	00 
      e9d240:	48 8d 05 b1 44 99 00 	lea    rax,[rip+0x9944b1]        # 18316f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3690>
      e9d247:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9d24a:	4c 8b b4 24 e8 12 00 	mov    r14,QWORD PTR [rsp+0x12e8]
      e9d251:	00 
      e9d252:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
      e9d256:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
      e9d25a:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
      e9d261:	00 
      e9d262:	e8 29 d0 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d267:	44 8b bc 24 48 07 00 	mov    r15d,DWORD PTR [rsp+0x748]
      e9d26e:	00 
      e9d26f:	4c 8d a4 24 80 07 00 	lea    r12,[rsp+0x780]
      e9d276:	00 
      e9d277:	4d 89 74 24 f0       	mov    QWORD PTR [r12-0x10],r14
      e9d27c:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e9d283:	00 
      e9d284:	4c 89 e7             	mov    rdi,r12
      e9d287:	e8 04 d0 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d28c:	4c 8d b4 24 b0 07 00 	lea    r14,[rsp+0x7b0]
      e9d293:	00 
      e9d294:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
      e9d29b:	00 
      e9d29c:	4c 89 f7             	mov    rdi,r14
      e9d29f:	e8 ec cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2a4:	4c 8d ac 24 e0 07 00 	lea    r13,[rsp+0x7e0]
      e9d2ab:	00 
      e9d2ac:	48 8d b4 24 d0 0c 00 	lea    rsi,[rsp+0xcd0]
      e9d2b3:	00 
      e9d2b4:	4c 89 ef             	mov    rdi,r13
      e9d2b7:	e8 d4 cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2bc:	48 8b b4 24 b8 12 00 	mov    rsi,QWORD PTR [rsp+0x12b8]
      e9d2c3:	00 
      e9d2c4:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
      e9d2cb:	00 
      e9d2cc:	e8 bf cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2d1:	48 8b b4 24 c0 12 00 	mov    rsi,QWORD PTR [rsp+0x12c0]

### call 0xe9d29f: call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
- prior range refs: 0xe9d27c->0x640
      e9d256:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
      e9d25a:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
      e9d261:	00 
      e9d262:	e8 29 d0 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d267:	44 8b bc 24 48 07 00 	mov    r15d,DWORD PTR [rsp+0x748]
      e9d26e:	00 
      e9d26f:	4c 8d a4 24 80 07 00 	lea    r12,[rsp+0x780]
      e9d276:	00 
      e9d277:	4d 89 74 24 f0       	mov    QWORD PTR [r12-0x10],r14
      e9d27c:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e9d283:	00 
      e9d284:	4c 89 e7             	mov    rdi,r12
      e9d287:	e8 04 d0 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d28c:	4c 8d b4 24 b0 07 00 	lea    r14,[rsp+0x7b0]
      e9d293:	00 
      e9d294:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
      e9d29b:	00 
      e9d29c:	4c 89 f7             	mov    rdi,r14
      e9d29f:	e8 ec cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2a4:	4c 8d ac 24 e0 07 00 	lea    r13,[rsp+0x7e0]
      e9d2ab:	00 
      e9d2ac:	48 8d b4 24 d0 0c 00 	lea    rsi,[rsp+0xcd0]
      e9d2b3:	00 
      e9d2b4:	4c 89 ef             	mov    rdi,r13
      e9d2b7:	e8 d4 cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2bc:	48 8b b4 24 b8 12 00 	mov    rsi,QWORD PTR [rsp+0x12b8]
      e9d2c3:	00 
      e9d2c4:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
      e9d2cb:	00 
      e9d2cc:	e8 bf cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2d1:	48 8b b4 24 c0 12 00 	mov    rsi,QWORD PTR [rsp+0x12c0]
      e9d2d8:	00 
      e9d2d9:	48 8d bc 24 40 08 00 	lea    rdi,[rsp+0x840]
      e9d2e0:	00 
      e9d2e1:	e8 aa cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2e6:	48 8d bc 24 70 08 00 	lea    rdi,[rsp+0x870]
      e9d2ed:	00 

### call 0xe9d2b7: call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
- prior range refs: 0xe9d27c->0x640
      e9d26f:	4c 8d a4 24 80 07 00 	lea    r12,[rsp+0x780]
      e9d276:	00 
      e9d277:	4d 89 74 24 f0       	mov    QWORD PTR [r12-0x10],r14
      e9d27c:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e9d283:	00 
      e9d284:	4c 89 e7             	mov    rdi,r12
      e9d287:	e8 04 d0 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d28c:	4c 8d b4 24 b0 07 00 	lea    r14,[rsp+0x7b0]
      e9d293:	00 
      e9d294:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
      e9d29b:	00 
      e9d29c:	4c 89 f7             	mov    rdi,r14
      e9d29f:	e8 ec cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2a4:	4c 8d ac 24 e0 07 00 	lea    r13,[rsp+0x7e0]
      e9d2ab:	00 
      e9d2ac:	48 8d b4 24 d0 0c 00 	lea    rsi,[rsp+0xcd0]
      e9d2b3:	00 
      e9d2b4:	4c 89 ef             	mov    rdi,r13
      e9d2b7:	e8 d4 cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2bc:	48 8b b4 24 b8 12 00 	mov    rsi,QWORD PTR [rsp+0x12b8]
      e9d2c3:	00 
      e9d2c4:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
      e9d2cb:	00 
      e9d2cc:	e8 bf cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2d1:	48 8b b4 24 c0 12 00 	mov    rsi,QWORD PTR [rsp+0x12c0]
      e9d2d8:	00 
      e9d2d9:	48 8d bc 24 40 08 00 	lea    rdi,[rsp+0x840]
      e9d2e0:	00 
      e9d2e1:	e8 aa cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2e6:	48 8d bc 24 70 08 00 	lea    rdi,[rsp+0x870]
      e9d2ed:	00 
      e9d2ee:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
      e9d2f5:	00 
      e9d2f6:	e8 95 cf bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d2fb:	44 89 bc 24 a0 08 00 	mov    DWORD PTR [rsp+0x8a0],r15d
      e9d302:	00 
      e9d303:	c6 84 24 a4 08 00 00 	mov    BYTE PTR [rsp+0x8a4],0x1

### call 0xe9d42f: call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
- prior range refs: 0xe9d424->0x640
      e9d3e8:	4c 8d b4 24 60 10 00 	lea    r14,[rsp+0x1060]
      e9d3ef:	00 
      e9d3f0:	49 83 26 00          	and    QWORD PTR [r14],0x0
      e9d3f4:	48 89 9c 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],rbx
      e9d3fb:	00 
      e9d3fc:	4c 89 f7             	mov    rdi,r14
      e9d3ff:	e8 c6 ce bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9d404:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d40b:	00 
      e9d40c:	e8 d7 b4 06 00       	call   f088e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcfe>
      e9d411:	48 8b 84 24 e8 12 00 	mov    rax,QWORD PTR [rsp+0x12e8]
      e9d418:	00 
      e9d419:	49 89 06             	mov    QWORD PTR [r14],rax
      e9d41c:	48 8d 9c 24 70 10 00 	lea    rbx,[rsp+0x1070]
      e9d423:	00 
      e9d424:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e9d42b:	00 
      e9d42c:	48 89 df             	mov    rdi,rbx
      e9d42f:	e8 5c ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d434:	4c 8d b4 24 a0 10 00 	lea    r14,[rsp+0x10a0]
      e9d43b:	00 
      e9d43c:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
      e9d443:	00 
      e9d444:	4c 89 f7             	mov    rdi,r14
      e9d447:	e8 44 ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d44c:	41 89 ed             	mov    r13d,ebp
      e9d44f:	48 8d ac 24 d0 10 00 	lea    rbp,[rsp+0x10d0]
      e9d456:	00 
      e9d457:	48 8d b4 24 d0 0c 00 	lea    rsi,[rsp+0xcd0]
      e9d45e:	00 
      e9d45f:	48 89 ef             	mov    rdi,rbp
      e9d462:	e8 29 ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d467:	4c 8d bc 24 00 11 00 	lea    r15,[rsp+0x1100]
      e9d46e:	00 
      e9d46f:	4c 89 ff             	mov    rdi,r15
      e9d472:	48 8b b4 24 b8 12 00 	mov    rsi,QWORD PTR [rsp+0x12b8]
      e9d479:	00 

### call 0xe9d447: call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
- prior range refs: 0xe9d424->0x640
      e9d3ff:	e8 c6 ce bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e9d404:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d40b:	00 
      e9d40c:	e8 d7 b4 06 00       	call   f088e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcfe>
      e9d411:	48 8b 84 24 e8 12 00 	mov    rax,QWORD PTR [rsp+0x12e8]
      e9d418:	00 
      e9d419:	49 89 06             	mov    QWORD PTR [r14],rax
      e9d41c:	48 8d 9c 24 70 10 00 	lea    rbx,[rsp+0x1070]
      e9d423:	00 
      e9d424:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e9d42b:	00 
      e9d42c:	48 89 df             	mov    rdi,rbx
      e9d42f:	e8 5c ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d434:	4c 8d b4 24 a0 10 00 	lea    r14,[rsp+0x10a0]
      e9d43b:	00 
      e9d43c:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
      e9d443:	00 
      e9d444:	4c 89 f7             	mov    rdi,r14
      e9d447:	e8 44 ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d44c:	41 89 ed             	mov    r13d,ebp
      e9d44f:	48 8d ac 24 d0 10 00 	lea    rbp,[rsp+0x10d0]
      e9d456:	00 
      e9d457:	48 8d b4 24 d0 0c 00 	lea    rsi,[rsp+0xcd0]
      e9d45e:	00 
      e9d45f:	48 89 ef             	mov    rdi,rbp
      e9d462:	e8 29 ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d467:	4c 8d bc 24 00 11 00 	lea    r15,[rsp+0x1100]
      e9d46e:	00 
      e9d46f:	4c 89 ff             	mov    rdi,r15
      e9d472:	48 8b b4 24 b8 12 00 	mov    rsi,QWORD PTR [rsp+0x12b8]
      e9d479:	00 
      e9d47a:	e8 11 ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d47f:	48 8d bc 24 30 11 00 	lea    rdi,[rsp+0x1130]
      e9d486:	00 
      e9d487:	48 8b b4 24 c0 12 00 	mov    rsi,QWORD PTR [rsp+0x12c0]
      e9d48e:	00 
      e9d48f:	e8 fc cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>

### call 0xe9d462: call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
- prior range refs: 0xe9d424->0x640
      e9d41c:	48 8d 9c 24 70 10 00 	lea    rbx,[rsp+0x1070]
      e9d423:	00 
      e9d424:	48 8d b4 24 40 06 00 	lea    rsi,[rsp+0x640]
      e9d42b:	00 
      e9d42c:	48 89 df             	mov    rdi,rbx
      e9d42f:	e8 5c ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d434:	4c 8d b4 24 a0 10 00 	lea    r14,[rsp+0x10a0]
      e9d43b:	00 
      e9d43c:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
      e9d443:	00 
      e9d444:	4c 89 f7             	mov    rdi,r14
      e9d447:	e8 44 ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d44c:	41 89 ed             	mov    r13d,ebp
      e9d44f:	48 8d ac 24 d0 10 00 	lea    rbp,[rsp+0x10d0]
      e9d456:	00 
      e9d457:	48 8d b4 24 d0 0c 00 	lea    rsi,[rsp+0xcd0]
      e9d45e:	00 
      e9d45f:	48 89 ef             	mov    rdi,rbp
      e9d462:	e8 29 ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d467:	4c 8d bc 24 00 11 00 	lea    r15,[rsp+0x1100]
      e9d46e:	00 
      e9d46f:	4c 89 ff             	mov    rdi,r15
      e9d472:	48 8b b4 24 b8 12 00 	mov    rsi,QWORD PTR [rsp+0x12b8]
      e9d479:	00 
      e9d47a:	e8 11 ce bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d47f:	48 8d bc 24 30 11 00 	lea    rdi,[rsp+0x1130]
      e9d486:	00 
      e9d487:	48 8b b4 24 c0 12 00 	mov    rsi,QWORD PTR [rsp+0x12c0]
      e9d48e:	00 
      e9d48f:	e8 fc cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d494:	4c 8d a4 24 60 11 00 	lea    r12,[rsp+0x1160]
      e9d49b:	00 
      e9d49c:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
      e9d4a3:	00 
      e9d4a4:	4c 89 e7             	mov    rdi,r12
      e9d4a7:	e8 e4 cd bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9d4ac:	44 89 ac 24 90 11 00 	mov    DWORD PTR [rsp+0x1190],r13d

### call 0xe9d6bb: call   f1abb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1fc8>
- prior range refs: 0xe9d6a3->0x6d4
      e9d66f:	4c 8d b4 24 d0 0c 00 	lea    r14,[rsp+0xcd0]
      e9d676:	00 
      e9d677:	4c 89 f7             	mov    rdi,r14
      e9d67a:	e8 eb c8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9d67f:	48 8b 84 24 98 13 00 	mov    rax,QWORD PTR [rsp+0x1398]
      e9d686:	00 
      e9d687:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e9d68b:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e9d690:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
      e9d695:	48 8b 9c 24 48 12 00 	mov    rbx,QWORD PTR [rsp+0x1248]
      e9d69c:	00 
      e9d69d:	0f 84 11 01 00 00    	je     e9d7b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64bca>
      e9d6a3:	0f b6 94 24 d4 06 00 	movzx  edx,BYTE PTR [rsp+0x6d4]
      e9d6aa:	00 
      e9d6ab:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d6b2:	00 
      e9d6b3:	48 8b b4 24 90 12 00 	mov    rsi,QWORD PTR [rsp+0x1290]
      e9d6ba:	00 
      e9d6bb:	e8 f2 d4 07 00       	call   f1abb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1fc8>
      e9d6c0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9d6c7:	00 
      e9d6c8:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9d6cf:	00 
      e9d6d0:	e8 23 1a ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9d6d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d6dc:	00 
      e9d6dd:	e8 8c ab ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9d6e2:	48 8b 8c 24 58 12 00 	mov    rcx,QWORD PTR [rsp+0x1258]
      e9d6e9:	00 
      e9d6ea:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9d6ee:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9d6f2:	66 0f 7f 84 24 60 01 	movdqa XMMWORD PTR [rsp+0x160],xmm0
      e9d6f9:	00 00 
      e9d6fb:	48 85 c0             	test   rax,rax
      e9d6fe:	74 05                	je     e9d705 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64b1b>
      e9d700:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d705:	48 8b bc 24 50 12 00 	mov    rdi,QWORD PTR [rsp+0x1250]

### call 0xe9d6d0: call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
- prior range refs: 0xe9d6a3->0x6d4
      e9d686:	00 
      e9d687:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e9d68b:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e9d690:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
      e9d695:	48 8b 9c 24 48 12 00 	mov    rbx,QWORD PTR [rsp+0x1248]
      e9d69c:	00 
      e9d69d:	0f 84 11 01 00 00    	je     e9d7b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64bca>
      e9d6a3:	0f b6 94 24 d4 06 00 	movzx  edx,BYTE PTR [rsp+0x6d4]
      e9d6aa:	00 
      e9d6ab:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d6b2:	00 
      e9d6b3:	48 8b b4 24 90 12 00 	mov    rsi,QWORD PTR [rsp+0x1290]
      e9d6ba:	00 
      e9d6bb:	e8 f2 d4 07 00       	call   f1abb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1fc8>
      e9d6c0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9d6c7:	00 
      e9d6c8:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9d6cf:	00 
      e9d6d0:	e8 23 1a ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9d6d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d6dc:	00 
      e9d6dd:	e8 8c ab ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9d6e2:	48 8b 8c 24 58 12 00 	mov    rcx,QWORD PTR [rsp+0x1258]
      e9d6e9:	00 
      e9d6ea:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9d6ee:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9d6f2:	66 0f 7f 84 24 60 01 	movdqa XMMWORD PTR [rsp+0x160],xmm0
      e9d6f9:	00 00 
      e9d6fb:	48 85 c0             	test   rax,rax
      e9d6fe:	74 05                	je     e9d705 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64b1b>
      e9d700:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d705:	48 8b bc 24 50 12 00 	mov    rdi,QWORD PTR [rsp+0x1250]
      e9d70c:	00 
      e9d70d:	e8 d1 8d 00 00       	call   ea64e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d8f9>
      e9d712:	0f b6 d0             	movzx  edx,al
      e9d715:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d71c:	00 

### call 0xe9d6dd: call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
- prior range refs: 0xe9d6a3->0x6d4
      e9d690:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
      e9d695:	48 8b 9c 24 48 12 00 	mov    rbx,QWORD PTR [rsp+0x1248]
      e9d69c:	00 
      e9d69d:	0f 84 11 01 00 00    	je     e9d7b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64bca>
      e9d6a3:	0f b6 94 24 d4 06 00 	movzx  edx,BYTE PTR [rsp+0x6d4]
      e9d6aa:	00 
      e9d6ab:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d6b2:	00 
      e9d6b3:	48 8b b4 24 90 12 00 	mov    rsi,QWORD PTR [rsp+0x1290]
      e9d6ba:	00 
      e9d6bb:	e8 f2 d4 07 00       	call   f1abb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1fc8>
      e9d6c0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9d6c7:	00 
      e9d6c8:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9d6cf:	00 
      e9d6d0:	e8 23 1a ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9d6d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d6dc:	00 
      e9d6dd:	e8 8c ab ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9d6e2:	48 8b 8c 24 58 12 00 	mov    rcx,QWORD PTR [rsp+0x1258]
      e9d6e9:	00 
      e9d6ea:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e9d6ee:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
      e9d6f2:	66 0f 7f 84 24 60 01 	movdqa XMMWORD PTR [rsp+0x160],xmm0
      e9d6f9:	00 00 
      e9d6fb:	48 85 c0             	test   rax,rax
      e9d6fe:	74 05                	je     e9d705 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64b1b>
      e9d700:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d705:	48 8b bc 24 50 12 00 	mov    rdi,QWORD PTR [rsp+0x1250]
      e9d70c:	00 
      e9d70d:	e8 d1 8d 00 00       	call   ea64e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d8f9>
      e9d712:	0f b6 d0             	movzx  edx,al
      e9d715:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9d71c:	00 
      e9d71d:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
      e9d724:	00 
      e9d725:	e8 5d a9 06 00       	call   f08087 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf49d>

### call 0xe9eb92: call   f1abb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1fc8>
- prior range refs: 0xe9eb7a->0x6d4
      e9eb48:	e8 ab 05 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9eb4d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eb54:	00 
      e9eb55:	e8 14 97 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9eb5a:	4c 89 ff             	mov    rdi,r15
      e9eb5d:	e8 24 f9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9eb62:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
      e9eb69:	00 
      e9eb6a:	4c 8b b4 24 40 12 00 	mov    r14,QWORD PTR [rsp+0x1240]
      e9eb71:	00 
      e9eb72:	48 8d ac 24 00 0d 00 	lea    rbp,[rsp+0xd00]
      e9eb79:	00 
      e9eb7a:	0f b6 94 24 d4 06 00 	movzx  edx,BYTE PTR [rsp+0x6d4]
      e9eb81:	00 
      e9eb82:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eb89:	00 
      e9eb8a:	48 8b b4 24 90 12 00 	mov    rsi,QWORD PTR [rsp+0x1290]
      e9eb91:	00 
      e9eb92:	e8 1b c0 07 00       	call   f1abb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1fc8>
      e9eb97:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9eb9e:	00 
      e9eb9f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9eba6:	00 
      e9eba7:	e8 4c 05 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ebac:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9ebb3:	00 
      e9ebb4:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ebbb:	00 
      e9ebbc:	e8 ad 96 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9ebc1:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ebc8:	00 
      e9ebc9:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
      e9ebcd:	48 8b 84 24 10 01 00 	mov    rax,QWORD PTR [rsp+0x110]
      e9ebd4:	00 
      e9ebd5:	48 8b 10             	mov    rdx,QWORD PTR [rax]
      e9ebd8:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
      e9ebdc:	e8 1f 01 ff ff       	call   e8ed00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56116>

### call 0xe9eba7: call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
- prior range refs: 0xe9eb7a->0x6d4
      e9eb5d:	e8 24 f9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9eb62:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
      e9eb69:	00 
      e9eb6a:	4c 8b b4 24 40 12 00 	mov    r14,QWORD PTR [rsp+0x1240]
      e9eb71:	00 
      e9eb72:	48 8d ac 24 00 0d 00 	lea    rbp,[rsp+0xd00]
      e9eb79:	00 
      e9eb7a:	0f b6 94 24 d4 06 00 	movzx  edx,BYTE PTR [rsp+0x6d4]
      e9eb81:	00 
      e9eb82:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eb89:	00 
      e9eb8a:	48 8b b4 24 90 12 00 	mov    rsi,QWORD PTR [rsp+0x1290]
      e9eb91:	00 
      e9eb92:	e8 1b c0 07 00       	call   f1abb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1fc8>
      e9eb97:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9eb9e:	00 
      e9eb9f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9eba6:	00 
      e9eba7:	e8 4c 05 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ebac:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9ebb3:	00 
      e9ebb4:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ebbb:	00 
      e9ebbc:	e8 ad 96 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9ebc1:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ebc8:	00 
      e9ebc9:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
      e9ebcd:	48 8b 84 24 10 01 00 	mov    rax,QWORD PTR [rsp+0x110]
      e9ebd4:	00 
      e9ebd5:	48 8b 10             	mov    rdx,QWORD PTR [rax]
      e9ebd8:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
      e9ebdc:	e8 1f 01 ff ff       	call   e8ed00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56116>
      e9ebe1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ebe5:	48 8d 35 e9 57 53 ff 	lea    rsi,[rip+0xffffffffff5357e9]        # 3d43d5 <_ZTSN5boost17bad_function_callE@@Base+0x171b>
      e9ebec:	48 8d 0d fd 57 53 ff 	lea    rcx,[rip+0xffffffffff5357fd]        # 3d43f0 <_ZTSN5boost17bad_function_callE@@Base+0x1736>
      e9ebf3:	6a 0b                	push   0xb
      e9ebf5:	5a                   	pop    rdx

### call 0xe9ebbc: call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
- prior range refs: 0xe9eb7a->0x6d4
      e9eb72:	48 8d ac 24 00 0d 00 	lea    rbp,[rsp+0xd00]
      e9eb79:	00 
      e9eb7a:	0f b6 94 24 d4 06 00 	movzx  edx,BYTE PTR [rsp+0x6d4]
      e9eb81:	00 
      e9eb82:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9eb89:	00 
      e9eb8a:	48 8b b4 24 90 12 00 	mov    rsi,QWORD PTR [rsp+0x1290]
      e9eb91:	00 
      e9eb92:	e8 1b c0 07 00       	call   f1abb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1fc8>
      e9eb97:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9eb9e:	00 
      e9eb9f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9eba6:	00 
      e9eba7:	e8 4c 05 ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
      e9ebac:	4c 8d bc 24 60 10 00 	lea    r15,[rsp+0x1060]
      e9ebb3:	00 
      e9ebb4:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9ebbb:	00 
      e9ebbc:	e8 ad 96 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9ebc1:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      e9ebc8:	00 
      e9ebc9:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
      e9ebcd:	48 8b 84 24 10 01 00 	mov    rax,QWORD PTR [rsp+0x110]
      e9ebd4:	00 
      e9ebd5:	48 8b 10             	mov    rdx,QWORD PTR [rax]
      e9ebd8:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
      e9ebdc:	e8 1f 01 ff ff       	call   e8ed00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56116>
      e9ebe1:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      e9ebe5:	48 8d 35 e9 57 53 ff 	lea    rsi,[rip+0xffffffffff5357e9]        # 3d43d5 <_ZTSN5boost17bad_function_callE@@Base+0x171b>
      e9ebec:	48 8d 0d fd 57 53 ff 	lea    rcx,[rip+0xffffffffff5357fd]        # 3d43f0 <_ZTSN5boost17bad_function_callE@@Base+0x1736>
      e9ebf3:	6a 0b                	push   0xb
      e9ebf5:	5a                   	pop    rdx
      e9ebf6:	6a 27                	push   0x27
      e9ebf8:	41 58                	pop    r8
      e9ebfa:	45 31 c9             	xor    r9d,r9d
      e9ebfd:	e8 88 87 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e9ec02:	84 c0                	test   al,al

### call 0xea079f: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea0797->0x640
      ea074f:	e8 32 dd bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0754:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ea0759:	e8 28 dd bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea075e:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      ea0765:	00 
      ea0766:	e8 25 d7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea076b:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea0772:	00 
      ea0773:	e8 f6 7a ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0778:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
      ea077d:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
      ea0784:	00 
      ea0785:	e8 e0 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea078a:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea0791:	00 
      ea0792:	e8 d3 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0797:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea079e:	00 
      ea079f:	e8 c6 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07a4:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea07a9:	e8 d8 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07ae:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea07b5:	00 
      ea07b6:	e8 af 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07bb:	31 ff                	xor    edi,edi
      ea07bd:	e8 c4 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c2:	31 ff                	xor    edi,edi
      ea07c4:	e8 bd dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c9:	31 ff                	xor    edi,edi
      ea07cb:	e8 b6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d0:	4c 89 e7             	mov    rdi,r12
      ea07d3:	e8 ae dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d8:	4c 89 ff             	mov    rdi,r15
      ea07db:	e8 a6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea07e7:	00 
      ea07e8:	e8 37 e2 fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>

### call 0xea07a9: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea0797->0x640
      ea0759:	e8 28 dd bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea075e:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      ea0765:	00 
      ea0766:	e8 25 d7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea076b:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea0772:	00 
      ea0773:	e8 f6 7a ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0778:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
      ea077d:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
      ea0784:	00 
      ea0785:	e8 e0 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea078a:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea0791:	00 
      ea0792:	e8 d3 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0797:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea079e:	00 
      ea079f:	e8 c6 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07a4:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea07a9:	e8 d8 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07ae:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea07b5:	00 
      ea07b6:	e8 af 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07bb:	31 ff                	xor    edi,edi
      ea07bd:	e8 c4 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c2:	31 ff                	xor    edi,edi
      ea07c4:	e8 bd dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c9:	31 ff                	xor    edi,edi
      ea07cb:	e8 b6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d0:	4c 89 e7             	mov    rdi,r12
      ea07d3:	e8 ae dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d8:	4c 89 ff             	mov    rdi,r15
      ea07db:	e8 a6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea07e7:	00 
      ea07e8:	e8 37 e2 fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea07ed:	48 89 df             	mov    rdi,rbx
      ea07f0:	e8 91 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### call 0xea07b6: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea0797->0x640, 0xea07ae->0x6a0
      ea0766:	e8 25 d7 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea076b:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea0772:	00 
      ea0773:	e8 f6 7a ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0778:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
      ea077d:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
      ea0784:	00 
      ea0785:	e8 e0 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea078a:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea0791:	00 
      ea0792:	e8 d3 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0797:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea079e:	00 
      ea079f:	e8 c6 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07a4:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea07a9:	e8 d8 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07ae:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea07b5:	00 
      ea07b6:	e8 af 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07bb:	31 ff                	xor    edi,edi
      ea07bd:	e8 c4 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c2:	31 ff                	xor    edi,edi
      ea07c4:	e8 bd dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c9:	31 ff                	xor    edi,edi
      ea07cb:	e8 b6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d0:	4c 89 e7             	mov    rdi,r12
      ea07d3:	e8 ae dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d8:	4c 89 ff             	mov    rdi,r15
      ea07db:	e8 a6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea07e7:	00 
      ea07e8:	e8 37 e2 fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea07ed:	48 89 df             	mov    rdi,rbx
      ea07f0:	e8 91 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07f5:	31 ff                	xor    edi,edi
      ea07f7:	e8 8a dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07fc:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]

### call 0xea07bd: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea0797->0x640, 0xea07ae->0x6a0
      ea0772:	00 
      ea0773:	e8 f6 7a ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0778:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
      ea077d:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
      ea0784:	00 
      ea0785:	e8 e0 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea078a:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea0791:	00 
      ea0792:	e8 d3 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0797:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea079e:	00 
      ea079f:	e8 c6 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07a4:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea07a9:	e8 d8 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07ae:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea07b5:	00 
      ea07b6:	e8 af 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07bb:	31 ff                	xor    edi,edi
      ea07bd:	e8 c4 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c2:	31 ff                	xor    edi,edi
      ea07c4:	e8 bd dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c9:	31 ff                	xor    edi,edi
      ea07cb:	e8 b6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d0:	4c 89 e7             	mov    rdi,r12
      ea07d3:	e8 ae dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d8:	4c 89 ff             	mov    rdi,r15
      ea07db:	e8 a6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea07e7:	00 
      ea07e8:	e8 37 e2 fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea07ed:	48 89 df             	mov    rdi,rbx
      ea07f0:	e8 91 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07f5:	31 ff                	xor    edi,edi
      ea07f7:	e8 8a dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07fc:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea0803:	00 
      ea0804:	e8 61 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### call 0xea07c4: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea0797->0x640, 0xea07ae->0x6a0
      ea0778:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
      ea077d:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
      ea0784:	00 
      ea0785:	e8 e0 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea078a:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea0791:	00 
      ea0792:	e8 d3 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0797:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea079e:	00 
      ea079f:	e8 c6 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07a4:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea07a9:	e8 d8 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07ae:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea07b5:	00 
      ea07b6:	e8 af 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07bb:	31 ff                	xor    edi,edi
      ea07bd:	e8 c4 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c2:	31 ff                	xor    edi,edi
      ea07c4:	e8 bd dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c9:	31 ff                	xor    edi,edi
      ea07cb:	e8 b6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d0:	4c 89 e7             	mov    rdi,r12
      ea07d3:	e8 ae dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d8:	4c 89 ff             	mov    rdi,r15
      ea07db:	e8 a6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea07e7:	00 
      ea07e8:	e8 37 e2 fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea07ed:	48 89 df             	mov    rdi,rbx
      ea07f0:	e8 91 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07f5:	31 ff                	xor    edi,edi
      ea07f7:	e8 8a dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07fc:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea0803:	00 
      ea0804:	e8 61 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0809:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea0810:	00 00 

### call 0xea07cb: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea0797->0x640, 0xea07ae->0x6a0
      ea0784:	00 
      ea0785:	e8 e0 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea078a:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea0791:	00 
      ea0792:	e8 d3 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0797:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea079e:	00 
      ea079f:	e8 c6 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07a4:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea07a9:	e8 d8 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07ae:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea07b5:	00 
      ea07b6:	e8 af 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07bb:	31 ff                	xor    edi,edi
      ea07bd:	e8 c4 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c2:	31 ff                	xor    edi,edi
      ea07c4:	e8 bd dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c9:	31 ff                	xor    edi,edi
      ea07cb:	e8 b6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d0:	4c 89 e7             	mov    rdi,r12
      ea07d3:	e8 ae dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d8:	4c 89 ff             	mov    rdi,r15
      ea07db:	e8 a6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea07e7:	00 
      ea07e8:	e8 37 e2 fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea07ed:	48 89 df             	mov    rdi,rbx
      ea07f0:	e8 91 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07f5:	31 ff                	xor    edi,edi
      ea07f7:	e8 8a dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07fc:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea0803:	00 
      ea0804:	e8 61 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0809:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea0810:	00 00 
      ea0812:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea0819:	00 

### call 0xea07d3: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea0797->0x640, 0xea07ae->0x6a0
      ea078a:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea0791:	00 
      ea0792:	e8 d3 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0797:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea079e:	00 
      ea079f:	e8 c6 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07a4:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea07a9:	e8 d8 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07ae:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea07b5:	00 
      ea07b6:	e8 af 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07bb:	31 ff                	xor    edi,edi
      ea07bd:	e8 c4 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c2:	31 ff                	xor    edi,edi
      ea07c4:	e8 bd dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c9:	31 ff                	xor    edi,edi
      ea07cb:	e8 b6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d0:	4c 89 e7             	mov    rdi,r12
      ea07d3:	e8 ae dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d8:	4c 89 ff             	mov    rdi,r15
      ea07db:	e8 a6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea07e7:	00 
      ea07e8:	e8 37 e2 fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea07ed:	48 89 df             	mov    rdi,rbx
      ea07f0:	e8 91 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07f5:	31 ff                	xor    edi,edi
      ea07f7:	e8 8a dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07fc:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea0803:	00 
      ea0804:	e8 61 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0809:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea0810:	00 00 
      ea0812:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea0819:	00 
      ea081a:	0f 85 d5 15 00 00    	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea0820:	48 81 c4 08 12 00 00 	add    rsp,0x1208

### call 0xea07db: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea07ae->0x6a0
      ea0792:	e8 d3 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0797:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea079e:	00 
      ea079f:	e8 c6 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07a4:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea07a9:	e8 d8 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07ae:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea07b5:	00 
      ea07b6:	e8 af 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07bb:	31 ff                	xor    edi,edi
      ea07bd:	e8 c4 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c2:	31 ff                	xor    edi,edi
      ea07c4:	e8 bd dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c9:	31 ff                	xor    edi,edi
      ea07cb:	e8 b6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d0:	4c 89 e7             	mov    rdi,r12
      ea07d3:	e8 ae dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d8:	4c 89 ff             	mov    rdi,r15
      ea07db:	e8 a6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea07e7:	00 
      ea07e8:	e8 37 e2 fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea07ed:	48 89 df             	mov    rdi,rbx
      ea07f0:	e8 91 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07f5:	31 ff                	xor    edi,edi
      ea07f7:	e8 8a dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07fc:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea0803:	00 
      ea0804:	e8 61 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0809:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea0810:	00 00 
      ea0812:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea0819:	00 
      ea081a:	0f 85 d5 15 00 00    	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea0820:	48 81 c4 08 12 00 00 	add    rsp,0x1208
      ea0827:	5b                   	pop    rbx
      ea0828:	41 5c                	pop    r12

### call 0xea07e8: call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
- prior range refs: 0xea07ae->0x6a0
      ea079f:	e8 c6 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07a4:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea07a9:	e8 d8 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07ae:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea07b5:	00 
      ea07b6:	e8 af 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea07bb:	31 ff                	xor    edi,edi
      ea07bd:	e8 c4 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c2:	31 ff                	xor    edi,edi
      ea07c4:	e8 bd dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c9:	31 ff                	xor    edi,edi
      ea07cb:	e8 b6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d0:	4c 89 e7             	mov    rdi,r12
      ea07d3:	e8 ae dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d8:	4c 89 ff             	mov    rdi,r15
      ea07db:	e8 a6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea07e7:	00 
      ea07e8:	e8 37 e2 fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea07ed:	48 89 df             	mov    rdi,rbx
      ea07f0:	e8 91 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07f5:	31 ff                	xor    edi,edi
      ea07f7:	e8 8a dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07fc:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea0803:	00 
      ea0804:	e8 61 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0809:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea0810:	00 00 
      ea0812:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea0819:	00 
      ea081a:	0f 85 d5 15 00 00    	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea0820:	48 81 c4 08 12 00 00 	add    rsp,0x1208
      ea0827:	5b                   	pop    rbx
      ea0828:	41 5c                	pop    r12
      ea082a:	41 5d                	pop    r13
      ea082c:	41 5e                	pop    r14
      ea082e:	41 5f                	pop    r15

### call 0xea0804: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea07fc->0x6f0
      ea07bd:	e8 c4 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c2:	31 ff                	xor    edi,edi
      ea07c4:	e8 bd dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07c9:	31 ff                	xor    edi,edi
      ea07cb:	e8 b6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d0:	4c 89 e7             	mov    rdi,r12
      ea07d3:	e8 ae dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07d8:	4c 89 ff             	mov    rdi,r15
      ea07db:	e8 a6 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07e0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea07e7:	00 
      ea07e8:	e8 37 e2 fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea07ed:	48 89 df             	mov    rdi,rbx
      ea07f0:	e8 91 dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07f5:	31 ff                	xor    edi,edi
      ea07f7:	e8 8a dc bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea07fc:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea0803:	00 
      ea0804:	e8 61 97 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea0809:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea0810:	00 00 
      ea0812:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea0819:	00 
      ea081a:	0f 85 d5 15 00 00    	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea0820:	48 81 c4 08 12 00 00 	add    rsp,0x1208
      ea0827:	5b                   	pop    rbx
      ea0828:	41 5c                	pop    r12
      ea082a:	41 5d                	pop    r13
      ea082c:	41 5e                	pop    r14
      ea082e:	41 5f                	pop    r15
      ea0830:	5d                   	pop    rbp
      ea0831:	c3                   	ret
      ea0832:	e9 d2 15 00 00       	jmp    ea1e09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6921f>
      ea0837:	e9 c3 09 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea083c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0841:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea0848:	00 

### call 0xea186e: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea1866->0x640
      ea1823:	eb 05                	jmp    ea182a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c40>
      ea1825:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea182a:	4c 89 e7             	mov    rdi,r12
      ea182d:	e8 38 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1832:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
      ea1839:	00 
      ea183a:	e8 2b 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea183f:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      ea1846:	00 
      ea1847:	e8 1e 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea184c:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
      ea1853:	00 
      ea1854:	e8 11 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1859:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea1860:	00 
      ea1861:	e8 04 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1866:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      ea186d:	00 
      ea186e:	e8 f7 86 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1873:	31 c0                	xor    eax,eax
      ea1875:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      ea187a:	31 c0                	xor    eax,eax
      ea187c:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      ea1883:	00 
      ea1884:	31 c0                	xor    eax,eax
      ea1886:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea188b:	e9 08 04 00 00       	jmp    ea1c98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690ae>
      ea1890:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1895:	eb 9b                	jmp    ea1832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c48>
      ea1897:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea189c:	eb a1                	jmp    ea183f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c55>
      ea189e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea18a3:	4c 89 ff             	mov    rdi,r15
      ea18a6:	e8 bf 86 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea18ab:	eb 05                	jmp    ea18b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68cc8>
      ea18ad:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea18b2:	49 8b bc 24 58 02 00 	mov    rdi,QWORD PTR [r12+0x258]

### call 0xea1c52: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea1c4a->0x5e0
      ea1c08:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      ea1c0d:	e8 74 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c12:	31 c0                	xor    eax,eax
      ea1c14:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      ea1c19:	31 c0                	xor    eax,eax
      ea1c1b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      ea1c22:	00 
      ea1c23:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      ea1c2a:	00 
      ea1c2b:	e8 56 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c30:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      ea1c37:	00 
      ea1c38:	e8 2d 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c3d:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      ea1c44:	00 
      ea1c45:	e8 20 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c4a:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      ea1c51:	00 
      ea1c52:	e8 13 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c57:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea1c5e:	00 
      ea1c5f:	e8 06 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c64:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1c6b:	00 
      ea1c6c:	e8 f9 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c71:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ea1c78:	00 
      ea1c79:	e8 08 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c7e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]

### call 0xea1c5f: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea1c4a->0x5e0
      ea1c14:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      ea1c19:	31 c0                	xor    eax,eax
      ea1c1b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      ea1c22:	00 
      ea1c23:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      ea1c2a:	00 
      ea1c2b:	e8 56 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c30:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      ea1c37:	00 
      ea1c38:	e8 2d 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c3d:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      ea1c44:	00 
      ea1c45:	e8 20 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c4a:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      ea1c51:	00 
      ea1c52:	e8 13 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c57:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea1c5e:	00 
      ea1c5f:	e8 06 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c64:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1c6b:	00 
      ea1c6c:	e8 f9 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c71:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ea1c78:	00 
      ea1c79:	e8 08 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c7e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]

### call 0xea1c6c: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea1c4a->0x5e0
      ea1c22:	00 
      ea1c23:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      ea1c2a:	00 
      ea1c2b:	e8 56 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c30:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      ea1c37:	00 
      ea1c38:	e8 2d 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c3d:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      ea1c44:	00 
      ea1c45:	e8 20 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c4a:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      ea1c51:	00 
      ea1c52:	e8 13 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c57:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea1c5e:	00 
      ea1c5f:	e8 06 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c64:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1c6b:	00 
      ea1c6c:	e8 f9 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c71:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ea1c78:	00 
      ea1c79:	e8 08 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c7e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 

### call 0xea1c79: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea1c4a->0x5e0
      ea1c2b:	e8 56 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c30:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      ea1c37:	00 
      ea1c38:	e8 2d 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c3d:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      ea1c44:	00 
      ea1c45:	e8 20 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c4a:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      ea1c51:	00 
      ea1c52:	e8 13 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c57:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea1c5e:	00 
      ea1c5f:	e8 06 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c64:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1c6b:	00 
      ea1c6c:	e8 f9 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c71:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ea1c78:	00 
      ea1c79:	e8 08 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c7e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 
      ea1cc1:	e8 c0 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cc6:	31 c0                	xor    eax,eax
      ea1cc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax

### call 0xea1c86: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea1c4a->0x5e0
      ea1c38:	e8 2d 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c3d:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
      ea1c44:	00 
      ea1c45:	e8 20 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c4a:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      ea1c51:	00 
      ea1c52:	e8 13 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c57:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea1c5e:	00 
      ea1c5f:	e8 06 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c64:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1c6b:	00 
      ea1c6c:	e8 f9 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c71:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ea1c78:	00 
      ea1c79:	e8 08 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c7e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 
      ea1cc1:	e8 c0 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cc6:	31 c0                	xor    eax,eax
      ea1cc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1ccd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1cd2:	e8 af c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cd7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]

### call 0xea1c93: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea1c8b->0x610
      ea1c45:	e8 20 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c4a:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      ea1c51:	00 
      ea1c52:	e8 13 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c57:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea1c5e:	00 
      ea1c5f:	e8 06 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c64:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1c6b:	00 
      ea1c6c:	e8 f9 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c71:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ea1c78:	00 
      ea1c79:	e8 08 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c7e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 
      ea1cc1:	e8 c0 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cc6:	31 c0                	xor    eax,eax
      ea1cc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1ccd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1cd2:	e8 af c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cd7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      ea1cdc:	e8 a5 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ce1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      ea1ce6:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]

### call 0xea1c9d: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea1c8b->0x610
      ea1c51:	00 
      ea1c52:	e8 13 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c57:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea1c5e:	00 
      ea1c5f:	e8 06 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c64:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1c6b:	00 
      ea1c6c:	e8 f9 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c71:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ea1c78:	00 
      ea1c79:	e8 08 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c7e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 
      ea1cc1:	e8 c0 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cc6:	31 c0                	xor    eax,eax
      ea1cc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1ccd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1cd2:	e8 af c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cd7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      ea1cdc:	e8 a5 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ce1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      ea1ce6:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      ea1ceb:	e8 96 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cf0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]

### call 0xea1caa: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea1c8b->0x610, 0xea1ca2->0x6a0
      ea1c5e:	00 
      ea1c5f:	e8 06 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c64:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1c6b:	00 
      ea1c6c:	e8 f9 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c71:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ea1c78:	00 
      ea1c79:	e8 08 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c7e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 
      ea1cc1:	e8 c0 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cc6:	31 c0                	xor    eax,eax
      ea1cc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1ccd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1cd2:	e8 af c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cd7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      ea1cdc:	e8 a5 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ce1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      ea1ce6:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      ea1ceb:	e8 96 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cf0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea1cf7:	00 
      ea1cf8:	e8 27 cd fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea1cfd:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]

### call 0xea1cb4: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea1c8b->0x610, 0xea1ca2->0x6a0
      ea1c64:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1c6b:	00 
      ea1c6c:	e8 f9 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c71:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ea1c78:	00 
      ea1c79:	e8 08 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c7e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 
      ea1cc1:	e8 c0 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cc6:	31 c0                	xor    eax,eax
      ea1cc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1ccd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1cd2:	e8 af c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cd7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      ea1cdc:	e8 a5 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ce1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      ea1ce6:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      ea1ceb:	e8 96 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cf0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea1cf7:	00 
      ea1cf8:	e8 27 cd fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea1cfd:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      ea1d04:	00 00 
      ea1d06:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1

### call 0xea1cc1: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea1c8b->0x610, 0xea1ca2->0x6a0
      ea1c71:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      ea1c78:	00 
      ea1c79:	e8 08 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1c7e:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 
      ea1cc1:	e8 c0 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cc6:	31 c0                	xor    eax,eax
      ea1cc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1ccd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1cd2:	e8 af c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cd7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      ea1cdc:	e8 a5 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ce1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      ea1ce6:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      ea1ceb:	e8 96 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cf0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea1cf7:	00 
      ea1cf8:	e8 27 cd fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea1cfd:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      ea1d04:	00 00 
      ea1d06:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1d0d:	e8 74 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d12:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1d17:	e8 6a c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### call 0xea1cd2: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea1c8b->0x610, 0xea1ca2->0x6a0
      ea1c85:	00 
      ea1c86:	e8 df 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 
      ea1cc1:	e8 c0 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cc6:	31 c0                	xor    eax,eax
      ea1cc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1ccd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1cd2:	e8 af c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cd7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      ea1cdc:	e8 a5 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ce1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      ea1ce6:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      ea1ceb:	e8 96 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cf0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea1cf7:	00 
      ea1cf8:	e8 27 cd fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea1cfd:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      ea1d04:	00 00 
      ea1d06:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1d0d:	e8 74 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d12:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1d17:	e8 6a c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d1c:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea1d23:	00 
      ea1d24:	e8 41 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1d29:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### call 0xea1cdc: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea1ca2->0x6a0
      ea1c8b:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
      ea1c92:	00 
      ea1c93:	e8 d2 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 
      ea1cc1:	e8 c0 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cc6:	31 c0                	xor    eax,eax
      ea1cc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1ccd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1cd2:	e8 af c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cd7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      ea1cdc:	e8 a5 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ce1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      ea1ce6:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      ea1ceb:	e8 96 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cf0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea1cf7:	00 
      ea1cf8:	e8 27 cd fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea1cfd:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      ea1d04:	00 00 
      ea1d06:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1d0d:	e8 74 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d12:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1d17:	e8 6a c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d1c:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea1d23:	00 
      ea1d24:	e8 41 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1d29:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea1d30:	00 00 
      ea1d32:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]

### call 0xea1ceb: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea1ca2->0x6a0
      ea1c98:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ea1c9d:	e8 e4 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ca2:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
      ea1ca9:	00 
      ea1caa:	e8 bb 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1caf:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1cb4:	e8 cd c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cb9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1cc0:	00 
      ea1cc1:	e8 c0 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cc6:	31 c0                	xor    eax,eax
      ea1cc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1ccd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1cd2:	e8 af c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cd7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      ea1cdc:	e8 a5 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ce1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      ea1ce6:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      ea1ceb:	e8 96 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cf0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea1cf7:	00 
      ea1cf8:	e8 27 cd fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea1cfd:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      ea1d04:	00 00 
      ea1d06:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1d0d:	e8 74 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d12:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1d17:	e8 6a c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d1c:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea1d23:	00 
      ea1d24:	e8 41 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1d29:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea1d30:	00 00 
      ea1d32:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea1d39:	00 
      ea1d3a:	0f 85 b5 00 00 00    	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea1d40:	4c 89 e7             	mov    rdi,r12

### call 0xea1d24: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea1d1c->0x6f0
      ea1ccd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1cd2:	e8 af c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cd7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      ea1cdc:	e8 a5 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ce1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      ea1ce6:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      ea1ceb:	e8 96 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1cf0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea1cf7:	00 
      ea1cf8:	e8 27 cd fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea1cfd:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      ea1d04:	00 00 
      ea1d06:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1d0d:	e8 74 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d12:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1d17:	e8 6a c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d1c:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea1d23:	00 
      ea1d24:	e8 41 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1d29:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea1d30:	00 00 
      ea1d32:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea1d39:	00 
      ea1d3a:	0f 85 b5 00 00 00    	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea1d40:	4c 89 e7             	mov    rdi,r12
      ea1d43:	e8 88 df bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ea1d48:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d4d:	e9 8b fe ff ff       	jmp    ea1bdd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ff3>
      ea1d52:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d57:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ea1d5a:	48 89 df             	mov    rdi,rbx
      ea1d5d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      ea1d60:	e9 be fe ff ff       	jmp    ea1c23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69039>
      ea1d65:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d6a:	e9 33 ff ff ff       	jmp    ea1ca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690b8>
      ea1d6f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d74:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]

### call 0xea1d43: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- prior range refs: 0xea1d1c->0x6f0
      ea1cf0:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ea1cf7:	00 
      ea1cf8:	e8 27 cd fe ff       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
      ea1cfd:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      ea1d04:	00 00 
      ea1d06:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1d0d:	e8 74 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d12:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1d17:	e8 6a c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d1c:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea1d23:	00 
      ea1d24:	e8 41 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1d29:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea1d30:	00 00 
      ea1d32:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea1d39:	00 
      ea1d3a:	0f 85 b5 00 00 00    	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea1d40:	4c 89 e7             	mov    rdi,r12
      ea1d43:	e8 88 df bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ea1d48:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d4d:	e9 8b fe ff ff       	jmp    ea1bdd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ff3>
      ea1d52:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d57:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ea1d5a:	48 89 df             	mov    rdi,rbx
      ea1d5d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      ea1d60:	e9 be fe ff ff       	jmp    ea1c23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69039>
      ea1d65:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d6a:	e9 33 ff ff ff       	jmp    ea1ca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690b8>
      ea1d6f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d74:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1d7b:	00 
      ea1d7c:	e8 63 3e c9 ff       	call   b35be4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82b84>
      ea1d81:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1d88:	00 
      ea1d89:	e8 dc 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1d8e:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1d94:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1

### call 0xea1d5d: call   QWORD PTR [rax+0x8]
- prior range refs: 0xea1d1c->0x6f0
      ea1d0d:	e8 74 c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d12:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
      ea1d17:	e8 6a c7 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1d1c:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
      ea1d23:	00 
      ea1d24:	e8 41 82 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1d29:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea1d30:	00 00 
      ea1d32:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea1d39:	00 
      ea1d3a:	0f 85 b5 00 00 00    	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea1d40:	4c 89 e7             	mov    rdi,r12
      ea1d43:	e8 88 df bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ea1d48:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d4d:	e9 8b fe ff ff       	jmp    ea1bdd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ff3>
      ea1d52:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d57:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ea1d5a:	48 89 df             	mov    rdi,rbx
      ea1d5d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      ea1d60:	e9 be fe ff ff       	jmp    ea1c23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69039>
      ea1d65:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d6a:	e9 33 ff ff ff       	jmp    ea1ca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690b8>
      ea1d6f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d74:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1d7b:	00 
      ea1d7c:	e8 63 3e c9 ff       	call   b35be4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82b84>
      ea1d81:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1d88:	00 
      ea1d89:	e8 dc 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1d8e:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1d94:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1d9b:	e8 e6 c6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1da0:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      ea1da7:	00 
      ea1da8:	e8 bd 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1dad:	66 0f ef c0          	pxor   xmm0,xmm0
      ea1db1:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0

### call 0xea1da8: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- prior range refs: 0xea1da0->0x670
      ea1d57:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ea1d5a:	48 89 df             	mov    rdi,rbx
      ea1d5d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      ea1d60:	e9 be fe ff ff       	jmp    ea1c23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69039>
      ea1d65:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d6a:	e9 33 ff ff ff       	jmp    ea1ca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690b8>
      ea1d6f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1d74:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1d7b:	00 
      ea1d7c:	e8 63 3e c9 ff       	call   b35be4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82b84>
      ea1d81:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1d88:	00 
      ea1d89:	e8 dc 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1d8e:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1d94:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1d9b:	e8 e6 c6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1da0:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      ea1da7:	00 
      ea1da8:	e8 bd 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1dad:	66 0f ef c0          	pxor   xmm0,xmm0
      ea1db1:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      ea1db7:	eb 05                	jmp    ea1dbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x691d4>
      ea1db9:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1dbe:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1dc4:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1dcb:	e8 b6 c6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1dd0:	e9 da fe ff ff       	jmp    ea1caf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690c5>
      ea1dd5:	48 89 c7             	mov    rdi,rax
      ea1dd8:	e8 93 c0 94 00       	call   17ede70 <__cxa_begin_catch@plt>
      ea1ddd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea1de4:	00 00 
      ea1de6:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea1ded:	00 
      ea1dee:	75 05                	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea1df0:	e8 ab c9 94 00       	call   17ee7a0 <__cxa_rethrow@plt>
      ea1df5:	e8 b6 dc 94 00       	call   17efab0 <__stack_chk_fail@plt>
      ea1dfa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

### call 0xea1dcb: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
- prior range refs: 0xea1da0->0x670
      ea1d74:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1d7b:	00 
      ea1d7c:	e8 63 3e c9 ff       	call   b35be4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82b84>
      ea1d81:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1d88:	00 
      ea1d89:	e8 dc 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1d8e:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1d94:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1d9b:	e8 e6 c6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1da0:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      ea1da7:	00 
      ea1da8:	e8 bd 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1dad:	66 0f ef c0          	pxor   xmm0,xmm0
      ea1db1:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      ea1db7:	eb 05                	jmp    ea1dbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x691d4>
      ea1db9:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1dbe:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1dc4:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1dcb:	e8 b6 c6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1dd0:	e9 da fe ff ff       	jmp    ea1caf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690c5>
      ea1dd5:	48 89 c7             	mov    rdi,rax
      ea1dd8:	e8 93 c0 94 00       	call   17ede70 <__cxa_begin_catch@plt>
      ea1ddd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea1de4:	00 00 
      ea1de6:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea1ded:	00 
      ea1dee:	75 05                	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea1df0:	e8 ab c9 94 00       	call   17ee7a0 <__cxa_rethrow@plt>
      ea1df5:	e8 b6 dc 94 00       	call   17efab0 <__stack_chk_fail@plt>
      ea1dfa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1dff:	e8 8c c7 94 00       	call   17ee590 <__cxa_end_catch@plt>
      ea1e04:	e9 c4 fe ff ff       	jmp    ea1ccd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690e3>
      ea1e09:	48 89 c7             	mov    rdi,rax
      ea1e0c:	e8 94 7c bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      ea1e11:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1e16:	4c 89 ff             	mov    rdi,r15
      ea1e19:	e8 4c 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### call 0xea1dd8: call   17ede70 <__cxa_begin_catch@plt>
- prior range refs: 0xea1da0->0x670
      ea1d81:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1d88:	00 
      ea1d89:	e8 dc 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1d8e:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1d94:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1d9b:	e8 e6 c6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1da0:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      ea1da7:	00 
      ea1da8:	e8 bd 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1dad:	66 0f ef c0          	pxor   xmm0,xmm0
      ea1db1:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      ea1db7:	eb 05                	jmp    ea1dbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x691d4>
      ea1db9:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1dbe:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1dc4:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1dcb:	e8 b6 c6 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1dd0:	e9 da fe ff ff       	jmp    ea1caf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690c5>
      ea1dd5:	48 89 c7             	mov    rdi,rax
      ea1dd8:	e8 93 c0 94 00       	call   17ede70 <__cxa_begin_catch@plt>
      ea1ddd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea1de4:	00 00 
      ea1de6:	48 3b 84 24 00 12 00 	cmp    rax,QWORD PTR [rsp+0x1200]
      ea1ded:	00 
      ea1dee:	75 05                	jne    ea1df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6920b>
      ea1df0:	e8 ab c9 94 00       	call   17ee7a0 <__cxa_rethrow@plt>
      ea1df5:	e8 b6 dc 94 00       	call   17efab0 <__stack_chk_fail@plt>
      ea1dfa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1dff:	e8 8c c7 94 00       	call   17ee590 <__cxa_end_catch@plt>
      ea1e04:	e9 c4 fe ff ff       	jmp    ea1ccd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690e3>
      ea1e09:	48 89 c7             	mov    rdi,rax
      ea1e0c:	e8 94 7c bd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      ea1e11:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1e16:	4c 89 ff             	mov    rdi,r15
      ea1e19:	e8 4c 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1e1e:	4c 89 f7             	mov    rdi,r14
      ea1e21:	e8 82 ae ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
      ea1e26:	48 89 df             	mov    rdi,rbx

## Exact r12 lifetime from allocation to first clobber after publication
      e9ccb5:	49 89 c4             	mov    r12,rax
      e9cceb:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9ccf3:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      e9ccf8:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
      e9cd0e:	41 0f 29 44 24 50    	movaps XMMWORD PTR [r12+0x50],xmm0
      e9cd19:	41 0f 11 44 24 60    	movups XMMWORD PTR [r12+0x60],xmm0
      e9cd2d:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e9cd44:	49 8d bc 24 a0 00 00 	lea    rdi,[r12+0xa0]
      e9cd61:	49 8d ac 24 d0 00 00 	lea    rbp,[r12+0xd0]
      e9cd79:	4d 8d b4 24 00 01 00 	lea    r14,[r12+0x100]
      e9cd9d:	66 41 0f 7f 8c 24 40 	movdqa XMMWORD PTR [r12+0x140],xmm1
      e9cda7:	41 0f 29 84 24 30 01 	movaps XMMWORD PTR [r12+0x130],xmm0
      e9cdc0:	f3 41 0f 7f 84 24 50 	movdqu XMMWORD PTR [r12+0x150],xmm0
      e9cdd4:	49 8d bc 24 60 01 00 	lea    rdi,[r12+0x160]
      e9cdfa:	f3 41 0f 7f 84 24 00 	movdqu XMMWORD PTR [r12+0x200],xmm0
      e9ce15:	41 88 84 24 10 02 00 	mov    BYTE PTR [r12+0x210],al
      e9ce1d:	49 8d 9c 24 20 02 00 	lea    rbx,[r12+0x220]
      e9ce46:	f3 41 0f 7f 84 24 50 	movdqu XMMWORD PTR [r12+0x250],xmm0
      e9ce5a:	4d 8d bc 24 60 02 00 	lea    r15,[r12+0x260]
      e9ce72:	49 8d bc 24 90 02 00 	lea    rdi,[r12+0x290]
      e9ce92:	41 0f 11 84 24 c0 02 	movups XMMWORD PTR [r12+0x2c0],xmm0
      e9cea9:	41 0f 11 84 24 d0 02 	movups XMMWORD PTR [r12+0x2d0],xmm0
      e9cecc:	41 0f 11 84 24 e0 02 	movups XMMWORD PTR [r12+0x2e0],xmm0
      e9ceef:	41 0f 11 84 24 f0 02 	movups XMMWORD PTR [r12+0x2f0],xmm0
      e9cf12:	41 0f 11 84 24 00 03 	movups XMMWORD PTR [r12+0x300],xmm0
      e9cf35:	41 0f 11 84 24 10 03 	movups XMMWORD PTR [r12+0x310],xmm0
      e9cf58:	41 0f 11 84 24 20 03 	movups XMMWORD PTR [r12+0x320],xmm0
      e9cf7b:	41 0f 11 84 24 30 03 	movups XMMWORD PTR [r12+0x330],xmm0
      e9cf95:	41 88 84 24 40 03 00 	mov    BYTE PTR [r12+0x340],al
      e9cfad:	41 0f 11 84 24 48 03 	movups XMMWORD PTR [r12+0x348],xmm0
      e9cfcc:	41 0f 11 84 24 58 03 	movups XMMWORD PTR [r12+0x358],xmm0
      e9cfd9:	49 89 8c 24 68 03 00 	mov    QWORD PTR [r12+0x368],rcx
      e9cff3:	41 0f 11 84 24 70 03 	movups XMMWORD PTR [r12+0x370],xmm0
      e9d012:	41 0f 11 84 24 80 03 	movups XMMWORD PTR [r12+0x380],xmm0
      e9d035:	41 0f 11 84 24 90 03 	movups XMMWORD PTR [r12+0x390],xmm0
      e9d058:	41 0f 11 84 24 a0 03 	movups XMMWORD PTR [r12+0x3a0],xmm0
      e9d07b:	41 0f 11 84 24 b0 03 	movups XMMWORD PTR [r12+0x3b0],xmm0
      e9d09e:	41 0f 11 84 24 c0 03 	movups XMMWORD PTR [r12+0x3c0],xmm0
      e9d0bd:	4c 89 a4 24 60 06 00 	mov    QWORD PTR [rsp+0x660],r12
      e9d26f:	4c 8d a4 24 80 07 00 	lea    r12,[rsp+0x780]
- first post-publication clobber/definition: 0xe9d26f lea    r12,[rsp+0x780]

## Stores into caller/output-looking pointer registers near owner completion
### 0xe9cd2a: movaps XMMWORD PTR [rax],xmm0
      e9cd05:	e8 ee c4 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      e9cd0a:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
      e9cd0e:	41 0f 29 44 24 50    	movaps XMMWORD PTR [r12+0x50],xmm0
      e9cd14:	41 0f 28 47 10       	movaps xmm0,XMMWORD PTR [r15+0x10]
      e9cd19:	41 0f 11 44 24 60    	movups XMMWORD PTR [r12+0x60],xmm0
      e9cd1f:	0f 57 c0             	xorps  xmm0,xmm0
      e9cd22:	48 8d 84 24 c0 07 00 	lea    rax,[rsp+0x7c0]
      e9cd29:	00 
      e9cd2a:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      e9cd2d:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e9cd32:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      e9cd37:	48 8d b4 24 d0 07 00 	lea    rsi,[rsp+0x7d0]
      e9cd3e:	00 
      e9cd3f:	e8 60 c1 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
      e9cd44:	49 8d bc 24 a0 00 00 	lea    rdi,[r12+0xa0]
      e9cd4b:	00 
      e9cd4c:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
      e9cd53:	00 
      e9cd54:	48 8d b4 24 00 08 00 	lea    rsi,[rsp+0x800]
      e9cd5b:	00 
      e9cd5c:	e8 0b 96 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>

### 0xe9ce9e: movaps XMMWORD PTR [rcx],xmm0
      e9ce81:	00 
      e9ce82:	e8 09 d4 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9ce87:	48 8d 8c 24 20 0a 00 	lea    rcx,[rsp+0xa20]
      e9ce8e:	00 
      e9ce8f:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
      e9ce92:	41 0f 11 84 24 c0 02 	movups XMMWORD PTR [r12+0x2c0],xmm0
      e9ce99:	00 00 
      e9ce9b:	0f 57 c0             	xorps  xmm0,xmm0
      e9ce9e:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
      e9cea1:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
      e9cea5:	0f 28 41 10          	movaps xmm0,XMMWORD PTR [rcx+0x10]
      e9cea9:	41 0f 11 84 24 d0 02 	movups XMMWORD PTR [r12+0x2d0],xmm0
      e9ceb0:	00 00 
      e9ceb2:	48 85 c0             	test   rax,rax
      e9ceb5:	74 05                	je     e9cebc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x642d2>
      e9ceb7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9cebc:	48 8b 84 24 48 0a 00 	mov    rax,QWORD PTR [rsp+0xa48]
      e9cec3:	00 
      e9cec4:	0f 28 84 24 40 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xa40]
      e9cecb:	00 
      e9cecc:	41 0f 11 84 24 e0 02 	movups XMMWORD PTR [r12+0x2e0],xmm0

### 0xe9cfff: movaps XMMWORD PTR [rax],xmm0
      e9cfe1:	48 85 c9             	test   rcx,rcx
      e9cfe4:	74 05                	je     e9cfeb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64401>
      e9cfe6:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e9cfeb:	0f 28 84 24 d0 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xad0]
      e9cff2:	00 
      e9cff3:	41 0f 11 84 24 70 03 	movups XMMWORD PTR [r12+0x370],xmm0
      e9cffa:	00 00 
      e9cffc:	0f 57 c0             	xorps  xmm0,xmm0
      e9cfff:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      e9d002:	48 8b 84 24 e8 0a 00 	mov    rax,QWORD PTR [rsp+0xae8]
      e9d009:	00 
      e9d00a:	0f 28 84 24 e0 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xae0]
      e9d011:	00 
      e9d012:	41 0f 11 84 24 80 03 	movups XMMWORD PTR [r12+0x380],xmm0
      e9d019:	00 00 
      e9d01b:	48 85 c0             	test   rax,rax
      e9d01e:	74 05                	je     e9d025 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6443b>
      e9d020:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9d025:	48 8b 84 24 f8 0a 00 	mov    rax,QWORD PTR [rsp+0xaf8]
      e9d02c:	00 
      e9d02d:	0f 28 84 24 f0 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xaf0]

## Direct caller setup for FDE entry
### caller 0xe95d35; FDE=(15281964, 15306555)
      e95bb3:	48 85 c9             	test   rcx,rcx
      e95bb6:	74 05                	je     e95bbd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cfd3>
      e95bb8:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e95bbd:	48 8d 84 24 c0 02 00 	lea    rax,[rsp+0x2c0]
      e95bc4:	00 
      e95bc5:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      e95bc9:	f0 48 ff 45 00       	lock inc QWORD PTR [rbp+0x0]
      e95bce:	48 83 ec 08          	sub    rsp,0x8
      e95bd2:	48 8d bc 24 18 0e 00 	lea    rdi,[rsp+0xe18]
      e95bd9:	00 
      e95bda:	48 8b 94 24 58 01 00 	mov    rdx,QWORD PTR [rsp+0x158]
      e95be1:	00 
      e95be2:	48 8b 8c 24 50 01 00 	mov    rcx,QWORD PTR [rsp+0x150]
      e95be9:	00 
      e95bea:	4c 8b 84 24 48 01 00 	mov    r8,QWORD PTR [rsp+0x148]
      e95bf1:	00 
      e95bf2:	4c 8b 8c 24 40 01 00 	mov    r9,QWORD PTR [rsp+0x140]
      e95bf9:	00 
      e95bfa:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
      e95bff:	ff b5 98 05 00 00    	push   QWORD PTR [rbp+0x598]
      e95c05:	50                   	push   rax
      e95c06:	48 8d 84 24 e8 02 00 	lea    rax,[rsp+0x2e8]
      e95c0d:	00 
      e95c0e:	50                   	push   rax
      e95c0f:	41 54                	push   r12
      e95c11:	41 56                	push   r14
      e95c13:	41 57                	push   r15
      e95c15:	53                   	push   rbx
      e95c16:	41 55                	push   r13
      e95c18:	ff b4 24 a8 00 00 00 	push   QWORD PTR [rsp+0xa8]
      e95c1f:	41 53                	push   r11
      e95c21:	41 52                	push   r10
      e95c23:	ff b4 24 30 01 00 00 	push   QWORD PTR [rsp+0x130]
      e95c2a:	ff b4 24 80 02 00 00 	push   QWORD PTR [rsp+0x280]
      e95c31:	ff b4 24 90 02 00 00 	push   QWORD PTR [rsp+0x290]
      e95c38:	ff b4 24 78 02 00 00 	push   QWORD PTR [rsp+0x278]
      e95c3f:	ff b4 24 a8 02 00 00 	push   QWORD PTR [rsp+0x2a8]
      e95c46:	ff b4 24 b8 02 00 00 	push   QWORD PTR [rsp+0x2b8]
      e95c4d:	ff b4 24 98 02 00 00 	push   QWORD PTR [rsp+0x298]
      e95c54:	ff b4 24 a8 02 00 00 	push   QWORD PTR [rsp+0x2a8]
      e95c5b:	48 8d 84 24 80 03 00 	lea    rax,[rsp+0x380]
      e95c62:	00 
      e95c63:	50                   	push   rax
      e95c64:	48 8d 84 24 b8 10 00 	lea    rax,[rsp+0x10b8]
      e95c6b:	00 
      e95c6c:	50                   	push   rax
      e95c6d:	ff b4 24 d0 00 00 00 	push   QWORD PTR [rsp+0xd0]
      e95c74:	ff b4 24 e8 01 00 00 	push   QWORD PTR [rsp+0x1e8]
      e95c7b:	48 8d 84 24 70 0e 00 	lea    rax,[rsp+0xe70]
      e95c82:	00 
      e95c83:	50                   	push   rax
      e95c84:	48 8d 84 24 a8 0e 00 	lea    rax,[rsp+0xea8]
      e95c8b:	00 
      e95c8c:	50                   	push   rax
      e95c8d:	ff b4 24 28 02 00 00 	push   QWORD PTR [rsp+0x228]
      e95c94:	ff b4 24 90 01 00 00 	push   QWORD PTR [rsp+0x190]
      e95c9b:	ff b4 24 40 02 00 00 	push   QWORD PTR [rsp+0x240]
      e95ca2:	ff b4 24 30 03 00 00 	push   QWORD PTR [rsp+0x330]
      e95ca9:	ff b4 24 10 02 00 00 	push   QWORD PTR [rsp+0x210]
      e95cb0:	ff b4 24 30 03 00 00 	push   QWORD PTR [rsp+0x330]
      e95cb7:	48 8d 84 24 e0 0c 00 	lea    rax,[rsp+0xce0]
      e95cbe:	00 
      e95cbf:	50                   	push   rax
      e95cc0:	ff b4 24 18 01 00 00 	push   QWORD PTR [rsp+0x118]
      e95cc7:	48 8d 84 24 30 04 00 	lea    rax,[rsp+0x430]
      e95cce:	00 
      e95ccf:	50                   	push   rax
      e95cd0:	48 8d 84 24 98 04 00 	lea    rax,[rsp+0x498]
      e95cd7:	00 
      e95cd8:	50                   	push   rax
      e95cd9:	48 8d 84 24 70 11 00 	lea    rax,[rsp+0x1170]
      e95ce0:	00 
      e95ce1:	50                   	push   rax
      e95ce2:	48 8d 84 24 58 0b 00 	lea    rax,[rsp+0xb58]
      e95ce9:	00 
      e95cea:	50                   	push   rax
      e95ceb:	ff b4 24 d8 01 00 00 	push   QWORD PTR [rsp+0x1d8]
      e95cf2:	48 8d 84 24 68 04 00 	lea    rax,[rsp+0x468]
      e95cf9:	00 
      e95cfa:	50                   	push   rax
      e95cfb:	ff b4 24 20 02 00 00 	push   QWORD PTR [rsp+0x220]
      e95d02:	ff b4 24 d0 01 00 00 	push   QWORD PTR [rsp+0x1d0]
      e95d09:	ff b4 24 b8 02 00 00 	push   QWORD PTR [rsp+0x2b8]
      e95d10:	ff b4 24 98 03 00 00 	push   QWORD PTR [rsp+0x398]
      e95d17:	ff b4 24 20 02 00 00 	push   QWORD PTR [rsp+0x220]
      e95d1e:	48 8d 84 24 50 05 00 	lea    rax,[rsp+0x550]
      e95d25:	00 
      e95d26:	50                   	push   rax
      e95d27:	ff b4 24 10 02 00 00 	push   QWORD PTR [rsp+0x210]
      e95d2e:	ff b4 24 a0 02 00 00 	push   QWORD PTR [rsp+0x2a0]
      e95d35:	e8 cd 3f 00 00       	call   e99d07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6111d>
      e95d3a:	48 81 c4 80 01 00 00 	add    rsp,0x180
      e95d41:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e95d46:	e8 3b 87 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95d4b:	48 8b bc 24 d8 02 00 	mov    rdi,QWORD PTR [rsp+0x2d8]
      e95d52:	00 
      e95d53:	e8 2e 87 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95d58:	66 0f 6f 84 24 c0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1c0]
      e95d5f:	00 00 
      e95d61:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e95d68:	e8 19 87 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95d6d:	48 8b bc 24 e8 02 00 	mov    rdi,QWORD PTR [rsp+0x2e8]
      e95d74:	00 
      e95d75:	e8 0c 87 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95d7a:	48 8b bc 24 10 10 00 	mov    rdi,QWORD PTR [rsp+0x1010]
      e95d81:	00 
      e95d82:	48 85 ff             	test   rdi,rdi
      e95d85:	74 06                	je     e95d8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d1a3>
      e95d87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e95d8a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e95d8d:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
      e95d94:	00 
      e95d95:	e8 d0 41 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e95d9a:	48 8d bc 24 e0 0d 00 	lea    rdi,[rsp+0xde0]
      e95da1:	00 
      e95da2:	e8 c3 41 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e95da7:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95dae:	00 
      e95daf:	e8 b6 41 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e95db4:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
      e95dbb:	00 
      e95dbc:	e8 c5 86 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95dc1:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]
      e95dc8:	00 
      e95dc9:	e8 b8 86 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95dce:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]

## Calls to owner AP +0x30 candidate pattern in nearby owner consumers
### +0x30 vcall 0xe9397f; FDE=(15281964, 15306555)
      e93936:	31 ff                	xor    edi,edi
      e93938:	e8 49 ab c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9393d:	31 ff                	xor    edi,edi
      e9393f:	e8 42 ab c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e93944:	31 ff                	xor    edi,edi
      e93946:	e8 3b ab c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9394b:	49 8b 9d 40 04 00 00 	mov    rbx,QWORD PTR [r13+0x440]
      e93952:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e93956:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e93959:	48 8d 35 b1 fd 53 ff 	lea    rsi,[rip+0xffffffffff53fdb1]        # 3d3711 <_ZTSN5boost17bad_function_callE@@Base+0xa57>
      e93960:	48 8d 0d b9 fd 53 ff 	lea    rcx,[rip+0xffffffffff53fdb9]        # 3d3720 <_ZTSN5boost17bad_function_callE@@Base+0xa66>
      e93967:	6a 0b                	push   0xb
      e93969:	5a                   	pop    rdx
      e9396a:	6a 28                	push   0x28
      e9396c:	41 58                	pop    r8
      e9396e:	45 31 c9             	xor    r9d,r9d
      e93971:	e8 14 3a 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e93976:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e93979:	0f b6 f0             	movzx  esi,al
      e9397c:	48 89 df             	mov    rdi,rbx
      e9397f:	ff 51 30             	call   QWORD PTR [rcx+0x30]
      e93982:	bf 00 02 00 00       	mov    edi,0x200
      e93987:	e8 74 a5 95 00       	call   17edf00 <_Znwm@plt>
      e9398c:	48 89 c3             	mov    rbx,rax
      e9398f:	66 0f ef c0          	pxor   xmm0,xmm0
      e93993:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e93998:	48 8d 05 c9 9a 96 00 	lea    rax,[rip+0x969ac9]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e9399f:	48 89 03             	mov    QWORD PTR [rbx],rax
      e939a2:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
      e939a9:	ba c8 00 00 00       	mov    edx,0xc8
      e939ae:	31 f6                	xor    esi,esi
      e939b0:	e8 db b1 95 00       	call   17eeb90 <memset@plt>
      e939b5:	48 8d 05 e4 49 9e 00 	lea    rax,[rip+0x9e49e4]        # 18783a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34a88>
      e939bc:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e939c0:	48 8d 43 28          	lea    rax,[rbx+0x28]
      e939c4:	66 0f ef c0          	pxor   xmm0,xmm0
      e939c8:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0
      e939cd:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      e939d1:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0
      e939d6:	f3 0f 7f 43 48       	movdqu XMMWORD PTR [rbx+0x48],xmm0
      e939db:	48 8d 43 60          	lea    rax,[rbx+0x60]
      e939df:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0
      e939e4:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
      e939e8:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      e939ed:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
      e939f4:	00 
      e939f5:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
      e939fc:	f3 0f 7f 83 98 00 00 	movdqu XMMWORD PTR [rbx+0x98],xmm0
      e93a03:	00 
      e93a04:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
      e93a0b:	f3 0f 7f 83 a8 00 00 	movdqu XMMWORD PTR [rbx+0xa8],xmm0

### +0x30 vcall 0xe948a9; FDE=(15281964, 15306555)
      e94859:	eb 51                	jmp    e948ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bcc2>
      e9485b:	4c 8d 84 24 10 0e 00 	lea    r8,[rsp+0xe10]
      e94862:	00 
      e94863:	4d 89 20             	mov    QWORD PTR [r8],r12
      e94866:	48 8d 35 24 88 c0 ff 	lea    rsi,[rip+0xffffffffffc08824]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e9486d:	48 8d 0d a2 08 03 00 	lea    rcx,[rip+0x308a2]        # ec5116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c52c>
      e94874:	4c 8d bc 24 50 0f 00 	lea    r15,[rsp+0xf50]
      e9487b:	00 
      e9487c:	6a 08                	push   0x8
      e9487e:	41 59                	pop    r9
      e94880:	4c 89 ff             	mov    rdi,r15
      e94883:	31 d2                	xor    edx,edx
      e94885:	66 0f 7f 4c 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm1
      e9488b:	e8 04 5f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e94890:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
      e94896:	66 48 0f 7e c6       	movq   rsi,xmm0
      e9489b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e9489e:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e948a5:	00 
      e948a6:	4c 89 fa             	mov    rdx,r15
      e948a9:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e948ac:	48 89 df             	mov    rdi,rbx
      e948af:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
      e948b6:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e948bd:	00 
      e948be:	4c 89 f6             	mov    rsi,r14
      e948c1:	e8 78 51 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e948c6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      e948ca:	e8 b7 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e948cf:	40 84 ed             	test   bpl,bpl
      e948d2:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
      e948d7:	74 0f                	je     e948e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bcfe>
      e948d9:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
      e948e0:	00 
      e948e1:	e8 ee 52 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e948e6:	eb 0d                	jmp    e948f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bd0b>
      e948e8:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
      e948ef:	00 
      e948f0:	e8 f3 5e 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e948f5:	31 ff                	xor    edi,edi
      e948f7:	e8 20 9b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e948fc:	6a 58                	push   0x58
      e948fe:	5f                   	pop    rdi
      e948ff:	e8 fc 95 95 00       	call   17edf00 <_Znwm@plt>
      e94904:	49 89 c6             	mov    r14,rax
      e94907:	66 0f ef c0          	pxor   xmm0,xmm0
      e9490b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94910:	48 8d 05 59 d1 99 00 	lea    rax,[rip+0x99d159]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e94917:	49 89 06             	mov    QWORD PTR [r14],rax
      e9491a:	48 8d 05 d7 f2 9a 00 	lea    rax,[rip+0x9af2d7]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>
      e94921:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax

### +0x30 vcall 0xe957d6; FDE=(15281964, 15306555)
      e95788:	4c 89 ef             	mov    rdi,r13
      e9578b:	e8 0e 1b c1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      e95790:	4d 8b 6c 24 20       	mov    r13,QWORD PTR [r12+0x20]
      e95795:	4c 8d 84 24 50 10 00 	lea    r8,[rsp+0x1050]
      e9579c:	00 
      e9579d:	4d 89 38             	mov    QWORD PTR [r8],r15
      e957a0:	48 8d 35 ea 78 c0 ff 	lea    rsi,[rip+0xffffffffffc078ea]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e957a7:	48 8d 0d 8c d5 02 00 	lea    rcx,[rip+0x2d58c]        # ec2d3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a150>
      e957ae:	48 8d ac 24 e0 0b 00 	lea    rbp,[rsp+0xbe0]
      e957b5:	00 
      e957b6:	6a 08                	push   0x8
      e957b8:	41 59                	pop    r9
      e957ba:	48 89 ef             	mov    rdi,rbp
      e957bd:	31 d2                	xor    edx,edx
      e957bf:	e8 d0 4f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e957c4:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e957c8:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e957cf:	00 
      e957d0:	4c 89 ee             	mov    rsi,r13
      e957d3:	48 89 ea             	mov    rdx,rbp
      e957d6:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e957d9:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
      e957e0:	00 
      e957e1:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e957e6:	4c 89 f6             	mov    rsi,r14
      e957e9:	e8 04 44 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e957ee:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      e957f2:	e8 8f 8c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e957f7:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e957fe:	00 
      e957ff:	4c 89 ef             	mov    rdi,r13
      e95802:	e8 e1 4f 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e95807:	31 ff                	xor    edi,edi
      e95809:	e8 78 8c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9580e:	31 ff                	xor    edi,edi
      e95810:	e8 07 8c c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e95815:	6a 58                	push   0x58
      e95817:	5f                   	pop    rdi
      e95818:	e8 e3 86 95 00       	call   17edf00 <_Znwm@plt>
      e9581d:	49 89 c7             	mov    r15,rax
      e95820:	66 0f ef c0          	pxor   xmm0,xmm0
      e95824:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e95829:	48 8d 05 38 7c 96 00 	lea    rax,[rip+0x967c38]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e95830:	49 89 07             	mov    QWORD PTR [r15],rax
      e95833:	48 8d 05 86 e3 9a 00 	lea    rax,[rip+0x9ae386]        # 1843bc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2a8>
      e9583a:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e9583e:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
      e95842:	4d 89 67 28          	mov    QWORD PTR [r15+0x28],r12
      e95846:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      e9584c:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      e95850:	48 8d 35 e9 4b 4e ff 	lea    rsi,[rip+0xffffffffff4e4be9]        # 37a440 <_ZTSSt12bad_any_cast@@Base-0x15d88>

### +0x30 vcall 0xe97362; FDE=(15281964, 15306555)
      e9731c:	00 
      e9731d:	50                   	push   rax
      e9731e:	48 8d 84 24 28 03 00 	lea    rax,[rsp+0x328]
      e97325:	00 
      e97326:	50                   	push   rax
      e97327:	e8 d1 8b 15 00       	call   fefefd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7313>
      e9732c:	58                   	pop    rax
      e9732d:	59                   	pop    rcx
      e9732e:	48 8b 84 24 d0 03 00 	mov    rax,QWORD PTR [rsp+0x3d0]
      e97335:	00 
      e97336:	48 8d bc 24 88 02 00 	lea    rdi,[rsp+0x288]
      e9733d:	00 
      e9733e:	48 89 47 f8          	mov    QWORD PTR [rdi-0x8],rax
      e97342:	e8 af 26 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e97347:	48 8b bb 10 03 00 00 	mov    rdi,QWORD PTR [rbx+0x310]
      e9734e:	48 85 ff             	test   rdi,rdi
      e97351:	0f 84 ee 08 00 00    	je     e97c45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f05b>
      e97357:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e9735a:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
      e97361:	00 
      e97362:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e97365:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
      e9736c:	00 
      e9736d:	e8 0a b4 f5 ff       	call   df277c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf802>
      e97372:	48 8d bc 24 00 0a 00 	lea    rdi,[rsp+0xa00]
      e97379:	00 
      e9737a:	e8 eb 2b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9737f:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e97386:	00 
      e97387:	e8 de 2b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9738c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e97393:	00 
      e97394:	e8 d1 2b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e97399:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      e973a0:	00 
      e973a1:	e8 4a b2 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e973a6:	49 8d 7d 10          	lea    rdi,[r13+0x10]
      e973aa:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      e973b0:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
      e973b5:	e8 7c 77 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e973ba:	bf a0 0f 00 00       	mov    edi,0xfa0
      e973bf:	e8 3c 6b 95 00       	call   17edf00 <_Znwm@plt>
      e973c4:	49 89 c6             	mov    r14,rax
      e973c7:	66 0f ef c0          	pxor   xmm0,xmm0
      e973cb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e973d0:	48 8d 05 f1 a9 99 00 	lea    rax,[rip+0x99a9f1]        # 1831dc8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d60>
      e973d7:	49 89 06             	mov    QWORD PTR [r14],rax
      e973da:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e973df:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e973e4:	4d 8d 6e 18          	lea    r13,[r14+0x18]
      e973e8:	48 8d 05 f1 cd 99 00 	lea    rax,[rip+0x99cdf1]        # 18341e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6178>

