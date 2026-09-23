# Restrictions `e99c54` caller/original provenance v13

Focus: identify who calls or owns `e99c54`, what object is passed as `original` in `rdi`, and whether `e99c54` is itself a vtable/AP method. Static provenance only.

## `e99c54` bridge body

```text
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
```
## Relocation/AP entries that point directly to `e99c54`

| entry | possible AP base/offset | relocation |
|---:|---|---|
| none | - | no direct relocation to e99c54 found |

## Code references / direct call windows mentioning `e99c54`

### mention at `0xe950d9`

```text
  e94ff3:	48 89 b4 24 50 0a 00 	mov    QWORD PTR [rsp+0xa50],rsi
  e94ffa:	00
  e94ffb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e94ffe:	ff 50 20             	call   QWORD PTR [rax+0x20]
  e95001:	49 8d 6c 24 08       	lea    rbp,[r12+0x8]
  e95006:	48 8d 9c 24 30 0a 00 	lea    rbx,[rsp+0xa30]
  e9500d:	00
  e9500e:	48 89 df             	mov    rdi,rbx
  e95011:	e8 54 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e95016:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]
  e9501d:	00
  e9501e:	4c 89 f7             	mov    rdi,r14
  e95021:	e8 44 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e95026:	66 49 0f 6e c4       	movq   xmm0,r12
  e9502b:	66 49 0f 6e cd       	movq   xmm1,r13
  e95030:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e95034:	66 0f 7f 4c 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm1
  e9503a:	31 ff                	xor    edi,edi
  e9503c:	e8 db 93 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e95041:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
  e95046:	0f 29 84 24 20 03 00 	movaps XMMWORD PTR [rsp+0x320],xmm0
  e9504d:	00
  e9504e:	31 ff                	xor    edi,edi
  e95050:	e8 31 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95055:	31 ff                	xor    edi,edi
  e95057:	e8 2a 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9505c:	4c 89 ff             	mov    rdi,r15
  e9505f:	e8 22 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95064:	31 ff                	xor    edi,edi
  e95066:	e8 1b 94 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9506b:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e95072:	00
  e95073:	e8 a6 4b 00 00       	call   e99c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61034>
  e95078:	48 8d bc 24 90 0e 00 	lea    rdi,[rsp+0xe90]
  e9507f:	00
  e95080:	e8 e5 4e be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e95085:	0f 57 c0             	xorps  xmm0,xmm0
  e95088:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
  e9508c:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  e95091:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]
  e95098:	00
  e95099:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]
  e950a0:	00
  e950a1:	4c 89 33             	mov    QWORD PTR [rbx],r14
  e950a4:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  e950a8:	48 85 c0             	test   rax,rax
  e950ab:	74 05                	je     e950b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c4c8>
  e950ad:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e950b2:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
  e950b9:	00
  e950ba:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]
  e950c0:	f3 41 0f 7f 40 10    	movdqu XMMWORD PTR [r8+0x10],xmm0
  e950c6:	f0 48 ff 45 00       	lock inc QWORD PTR [rbp+0x0]
  e950cb:	48 8d 35 80 4f f6 ff 	lea    rsi,[rip+0xfffffffffff64f80]        # dfa052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc70d8>
  e950d2:	48 8d 15 ad 4f f6 ff 	lea    rdx,[rip+0xfffffffffff64fad]        # dfa086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc710c>
  e950d9:	48 8d 0d 74 4b 00 00 	lea    rcx,[rip+0x4b74]        # e99c54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6106a>
  e950e0:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e950e7:	00
  e950e8:	6a 20                	push   0x20
  e950ea:	41 59                	pop    r9
  e950ec:	48 89 df             	mov    rdi,rbx
  e950ef:	e8 a0 56 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e950f4:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e950f7:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e950fe:	00
  e950ff:	4c 89 f6             	mov    rsi,r14
  e95102:	48 89 da             	mov    rdx,rbx
  e95105:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e9510b:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e95110:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
  e95115:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e9511c:	00
  e9511d:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e95124:	00
  e95125:	e8 a4 43 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e9512a:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
  e95131:	00
  e95132:	e8 4f 93 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e95137:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9513e:	00
  e9513f:	e8 a4 56 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e95144:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e9514b:	00
  e9514c:	e8 73 57 f6 ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
  e95151:	49 8d bd f8 03 00 00 	lea    rdi,[r13+0x3f8]
  e95158:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
  e9515f:	00
  e95160:	48 89 de             	mov    rsi,rbx
  e95163:	e8 f6 44 00 00       	call   e9965e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a74>
  e95168:	48 89 df             	mov    rdi,rbx
  e9516b:	e8 f4 79 c2 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
  e95170:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
  e95177:	00
  e95178:	e8 09 93 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9517d:	4d 85 ff             	test   r15,r15
  e95180:	74 05                	je     e95187 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c59d>
  e95182:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  e95187:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e9518c:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e95190:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
  e95197:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e9519e:	00
  e9519f:	bf 98 00 00 00       	mov    edi,0x98
  e951a4:	e8 57 8d 95 00       	call   17edf00 <_Znwm@plt>
  e951a9:	49 89 c6             	mov    r14,rax
  e951ac:	66 0f ef c0          	pxor   xmm0,xmm0
  e951b0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e951b5:	48 8d 05 ac 82 96 00 	lea    rax,[rip+0x9682ac]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  e951bc:	49 89 06             	mov    QWORD PTR [r14],rax
  e951bf:	4d 8d 66 18          	lea    r12,[r14+0x18]
  e951c3:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
  e951ca:	00
  e951cb:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  e951d0:	48 89 06             	mov    QWORD PTR [rsi],rax
  e951d3:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
  e951d8:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e951dc:	4c 89 e7             	mov    rdi,r12
  e951df:	e8 34 2a 03 00       	call   ec7c18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f02e>
  e951e4:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
  e951eb:	00
  e951ec:	e8 95 92 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e951f1:	31 ff                	xor    edi,edi
  e951f3:	e8 24 92 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e951f8:	bf f0 00 00 00       	mov    edi,0xf0
  e951fd:	4c 89 b4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r14
  e95204:	00
  e95205:	e8 f6 8c 95 00       	call   17edf00 <_Znwm@plt>
  e9520a:	48 89 c3             	mov    rbx,rax
  e9520d:	4c 89 f0             	mov    rax,r14
  e95210:	48 83 c0 08          	add    rax,0x8
```
### mention at `0xe99c54`

```text
  e99ba7:	eb 06                	jmp    e99baf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60fc5>
  e99ba9:	4d 89 ef             	mov    r15,r13
  e99bac:	4c 89 e1             	mov    rcx,r12
  e99baf:	49 83 c4 10          	add    r12,0x10
  e99bb3:	4c 01 f0             	add    rax,r14
  e99bb6:	48 89 0b             	mov    QWORD PTR [rbx],rcx
  e99bb9:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
  e99bbd:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  e99bc1:	4d 39 fd             	cmp    r13,r15
  e99bc4:	74 0f                	je     e99bd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60feb>
  e99bc6:	49 8b 7d f8          	mov    rdi,QWORD PTR [r13-0x8]
  e99bca:	49 83 c5 f0          	add    r13,0xfffffffffffffff0
  e99bce:	e8 b3 48 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
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
```
## Text materialization of guessed owner AP bases

