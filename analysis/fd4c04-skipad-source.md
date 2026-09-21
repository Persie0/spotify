# fd4c04 Skip Ad source object trace

Known field map:
- materializer fallback: r14 = [rsi+0x10]
- new adapter outer+0x58 = [r14+0x40]
- adapter this = outer+0x18, so fd381a this+0x40 = outer+0x58
- therefore final readiness receiver = [[fd4c04 source wrapper +0x10] +0x40]

## fd4c04 exact FDE / body
FDE=(16600068, 16600319)
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

## Direct call/jump xrefs to fd4c04 or interior fd4c34
### 0xfd4af5; FDE=(16599698, 16600029): call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>
      fd4aa2:	48 89 fb             	mov    rbx,rdi
      fd4aa5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fd4aac:	00 00 
      fd4aae:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
      fd4ab5:	00 
      fd4ab6:	48 83 c6 10          	add    rsi,0x10
      fd4aba:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      fd4abf:	e8 96 73 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      fd4ac4:	0f 57 c0             	xorps  xmm0,xmm0
      fd4ac7:	48 89 e2             	mov    rdx,rsp
      fd4aca:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      fd4acd:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      fd4ad2:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      fd4ad7:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      fd4adc:	4c 89 f7             	mov    rdi,r14
      fd4adf:	e8 76 05 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      fd4ae4:	4c 8d bc 24 b8 00 00 	lea    r15,[rsp+0xb8]
      fd4aeb:	00 
      fd4aec:	6a 01                	push   0x1
      fd4aee:	5a                   	pop    rdx
      fd4aef:	4c 89 ff             	mov    rdi,r15
      fd4af2:	4c 89 f6             	mov    rsi,r14
      fd4af5:	e8 0a 01 00 00       	call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>
      fd4afa:	49 8b 37             	mov    rsi,QWORD PTR [r15]
      fd4afd:	80 7e 68 00          	cmp    BYTE PTR [rsi+0x68],0x0
      fd4b01:	74 04                	je     fd4b07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bf1d>
      fd4b03:	c6 46 68 00          	mov    BYTE PTR [rsi+0x68],0x0
      fd4b07:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      fd4b0c:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
      fd4b11:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
      fd4b18:	00 
      fd4b19:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      fd4b1e:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
      fd4b22:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      fd4b27:	0f 57 c0             	xorps  xmm0,xmm0
      fd4b2a:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
      fd4b2f:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
      fd4b34:	4c 8b ac 24 c0 00 00 	mov    r13,QWORD PTR [rsp+0xc0]
      fd4b3b:	00 
      fd4b3c:	4c 8d 7c 24 68       	lea    r15,[rsp+0x68]
      fd4b41:	4c 89 ff             	mov    rdi,r15
      fd4b44:	4c 89 ea             	mov    rdx,r13
      fd4b47:	4c 89 e1             	mov    rcx,r12
      fd4b4a:	e8 b5 06 f5 ff       	call   f25204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec61a>
      fd4b4f:	4c 89 e7             	mov    rdi,r12
      fd4b52:	e8 25 74 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fd4b57:	4c 89 ef             	mov    rdi,r13
      fd4b5a:	e8 27 99 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4b5f:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
      fd4b66:	00 
      fd4b67:	4c 89 e7             	mov    rdi,r12
      fd4b6a:	4c 89 fe             	mov    rsi,r15
      fd4b6d:	e8 8e 01 00 00       	call   fd4d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c116>
      fd4b72:	48 89 df             	mov    rdi,rbx
      fd4b75:	4c 89 e6             	mov    rsi,r12
      fd4b78:	e8 3d 0f f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
      fd4b7d:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      fd4b82:	e8 ff 98 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4b87:	4c 89 ff             	mov    rdi,r15

### 0xfd5344; FDE=(16601656, 16603484): call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>
      fd52ec:	0f 57 c0             	xorps  xmm0,xmm0
      fd52ef:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0
      fd52f4:	49 83 65 20 00       	and    QWORD PTR [r13+0x20],0x0
      fd52f9:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      fd5300:	00 
      fd5301:	4c 8d b4 24 e8 00 00 	lea    r14,[rsp+0xe8]
      fd5308:	00 
      fd5309:	4c 89 f6             	mov    rsi,r14
      fd530c:	e8 4b 06 00 00       	call   fd595c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cd72>
      fd5311:	48 89 ef             	mov    rdi,rbp
      fd5314:	e8 63 6c e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fd5319:	4c 89 f7             	mov    rdi,r14
      fd531c:	e8 5b 6c e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fd5321:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
      fd5326:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
      fd532a:	48 3b 48 20          	cmp    rcx,QWORD PTR [rax+0x20]
      fd532e:	0f 84 c2 01 00 00    	je     fd54f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c90c>
      fd5334:	4c 8d b4 24 c0 00 00 	lea    r14,[rsp+0xc0]
      fd533b:	00 
      fd533c:	4c 89 f7             	mov    rdi,r14
      fd533f:	4c 89 fe             	mov    rsi,r15
      fd5342:	31 d2                	xor    edx,edx
      fd5344:	e8 bb f8 ff ff       	call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>
      fd5349:	49 8b 2e             	mov    rbp,QWORD PTR [r14]
      fd534c:	48 8d 7d 20          	lea    rdi,[rbp+0x20]
      fd5350:	4c 8b 7d 20          	mov    r15,QWORD PTR [rbp+0x20]
      fd5354:	4c 8b 75 28          	mov    r14,QWORD PTR [rbp+0x28]
      fd5358:	4d 85 f6             	test   r14,r14
      fd535b:	74 05                	je     fd5362 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c778>
      fd535d:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      fd5362:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
      fd5367:	e8 ca 97 b0 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      fd536c:	41 80 7c 24 58 00    	cmp    BYTE PTR [r12+0x58],0x0
      fd5372:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
      fd5377:	0f 84 04 02 00 00    	je     fd5581 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c997>
      fd537d:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
      fd5382:	48 8b 9c 24 00 01 00 	mov    rbx,QWORD PTR [rsp+0x100]
      fd5389:	00 
      fd538a:	4c 8b bc 24 08 01 00 	mov    r15,QWORD PTR [rsp+0x108]
      fd5391:	00 
      fd5392:	48 8b 84 24 10 01 00 	mov    rax,QWORD PTR [rsp+0x110]
      fd5399:	00 
      fd539a:	0f 57 c0             	xorps  xmm0,xmm0
      fd539d:	0f 29 84 24 00 01 00 	movaps XMMWORD PTR [rsp+0x100],xmm0
      fd53a4:	00 
      fd53a5:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
      fd53ac:	00 00 
      fd53ae:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
      fd53b5:	00 
      fd53b6:	4c 8b a4 24 c8 00 00 	mov    r12,QWORD PTR [rsp+0xc8]
      fd53bd:	00 
      fd53be:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
      fd53c5:	00 
      fd53c6:	4d 85 e4             	test   r12,r12
      fd53c9:	74 06                	je     fd53d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c7e7>
      fd53cb:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fd53d1:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
      fd53d8:	00 
      fd53d9:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15

### 0xfd6196; FDE=(16605298, 16606511): call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>
      fd6142:	e8 5b 04 00 00       	call   fd65a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9b8>
      fd6147:	84 c0                	test   al,al
      fd6149:	0f 84 2d 02 00 00    	je     fd637c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d792>
      fd614f:	49 83 c7 10          	add    r15,0x10
      fd6153:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      fd6158:	4c 89 fe             	mov    rsi,r15
      fd615b:	e8 fa 5c cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      fd6160:	89 2c 24             	mov    DWORD PTR [rsp],ebp
      fd6163:	0f 57 c0             	xorps  xmm0,xmm0
      fd6166:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      fd616b:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      fd616e:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      fd6173:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
      fd6178:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      fd617d:	4c 89 ff             	mov    rdi,r15
      fd6180:	e8 d5 ee f4 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      fd6185:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
      fd618c:	00 
      fd618d:	6a 01                	push   0x1
      fd618f:	5a                   	pop    rdx
      fd6190:	4c 89 e7             	mov    rdi,r12
      fd6193:	4c 89 fe             	mov    rsi,r15
      fd6196:	e8 69 ea ff ff       	call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>
      fd619b:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
      fd619f:	80 7e 68 00          	cmp    BYTE PTR [rsi+0x68],0x0
      fd61a3:	0f 28 84 24 50 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x150]
      fd61aa:	00 
      fd61ab:	0f 11 46 58          	movups XMMWORD PTR [rsi+0x58],xmm0
      fd61af:	0f 85 14 01 00 00    	jne    fd62c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d6df>
      fd61b5:	c6 46 68 01          	mov    BYTE PTR [rsi+0x68],0x1
      fd61b9:	e9 0b 01 00 00       	jmp    fd62c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d6df>
      fd61be:	6a 70                	push   0x70
      fd61c0:	5f                   	pop    rdi
      fd61c1:	e8 3a 7d 81 00       	call   17edf00 <_Znwm@plt>
      fd61c6:	49 89 c7             	mov    r15,rax
      fd61c9:	89 2c 24             	mov    DWORD PTR [rsp],ebp
      fd61cc:	0f 57 c0             	xorps  xmm0,xmm0
      fd61cf:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fd61d3:	48 8d 05 ce 57 86 00 	lea    rax,[rip+0x8657ce]        # 183b9a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd940>
      fd61da:	49 89 07             	mov    QWORD PTR [r15],rax
      fd61dd:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      fd61e2:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
      fd61e9:	00 
      fd61ea:	e8 6b 03 00 00       	call   fd655a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d970>
      fd61ef:	4d 89 fc             	mov    r12,r15
      fd61f2:	49 83 c4 18          	add    r12,0x18
      fd61f6:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
      fd61fb:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
      fd6200:	41 0f 28 4d 10       	movaps xmm1,XMMWORD PTR [r13+0x10]
      fd6205:	48 8d ac 24 90 00 00 	lea    rbp,[rsp+0x90]
      fd620c:	00 
      fd620d:	0f 29 45 00          	movaps XMMWORD PTR [rbp+0x0],xmm0
      fd6211:	0f 57 c0             	xorps  xmm0,xmm0
      fd6214:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      fd6219:	0f 29 4d 10          	movaps XMMWORD PTR [rbp+0x10],xmm1
      fd621d:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
      fd6221:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      fd6225:	41 0f 29 45 10       	movaps XMMWORD PTR [r13+0x10],xmm0
      fd622a:	49 83 65 20 00       	and    QWORD PTR [r13+0x20],0x0

### 0xfd62b6; FDE=(16605298, 16606511): call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>
      fd625f:	e9 4d 01 00 00       	jmp    fd63b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d7c7>
      fd6264:	41 80 7f 68 00       	cmp    BYTE PTR [r15+0x68],0x0
      fd6269:	0f 84 0d 01 00 00    	je     fd637c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d792>
      fd626f:	49 83 c7 10          	add    r15,0x10
      fd6273:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      fd6278:	4c 89 fe             	mov    rsi,r15
      fd627b:	e8 da 5b cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      fd6280:	89 2c 24             	mov    DWORD PTR [rsp],ebp
      fd6283:	0f 57 c0             	xorps  xmm0,xmm0
      fd6286:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      fd628b:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      fd628e:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      fd6293:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
      fd6298:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      fd629d:	4c 89 ff             	mov    rdi,r15
      fd62a0:	e8 b5 ed f4 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      fd62a5:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
      fd62ac:	00 
      fd62ad:	6a 01                	push   0x1
      fd62af:	5a                   	pop    rdx
      fd62b0:	4c 89 e7             	mov    rdi,r12
      fd62b3:	4c 89 fe             	mov    rsi,r15
      fd62b6:	e8 49 e9 ff ff       	call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>
      fd62bb:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
      fd62bf:	80 7e 68 00          	cmp    BYTE PTR [rsi+0x68],0x0
      fd62c3:	74 04                	je     fd62c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d6df>
      fd62c5:	c6 46 68 00          	mov    BYTE PTR [rsi+0x68],0x0
      fd62c9:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
      fd62ce:	41 0f 10 47 20       	movups xmm0,XMMWORD PTR [r15+0x20]
      fd62d3:	4c 8d ac 24 d0 00 00 	lea    r13,[rsp+0xd0]
      fd62da:	00 
      fd62db:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      fd62e0:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
      fd62e4:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
      fd62e9:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      fd62ed:	0f 57 c0             	xorps  xmm0,xmm0
      fd62f0:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      fd62f5:	48 8d 84 24 f0 00 00 	lea    rax,[rsp+0xf0]
      fd62fc:	00 
      fd62fd:	48 8b 68 08          	mov    rbp,QWORD PTR [rax+0x8]
      fd6301:	4c 8d a4 24 90 00 00 	lea    r12,[rsp+0x90]
      fd6308:	00 
      fd6309:	4c 89 e7             	mov    rdi,r12
      fd630c:	48 89 ea             	mov    rdx,rbp
      fd630f:	4c 89 e9             	mov    rcx,r13
      fd6312:	e8 ed ee f4 ff       	call   f25204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec61a>
      fd6317:	4c 89 ef             	mov    rdi,r13
      fd631a:	e8 5d 5c e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fd631f:	48 89 ef             	mov    rdi,rbp
      fd6322:	e8 5f 81 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd6327:	4c 8d ac 24 d0 00 00 	lea    r13,[rsp+0xd0]
      fd632e:	00 
      fd632f:	4c 89 ef             	mov    rdi,r13
      fd6332:	4c 89 e6             	mov    rsi,r12
      fd6335:	e8 c6 e9 ff ff       	call   fd4d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c116>
      fd633a:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      fd6341:	00 
      fd6342:	4c 89 ee             	mov    rsi,r13
      fd6345:	e8 70 f7 f3 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>

## Relocation slots targeting fd4c04/fd4c34

## Relocation neighborhoods around any target slots
## Code refs to candidate table address points around target slot
## All calls in known adapter construction family fd47e6..fd4da0
  fd480a:	e8 77 9c ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4813:	e8 6e 9c ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd482c:	e8 b5 ff ff ff       	call   fd47e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbfc>
  fd486d:	e8 e8 75 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd4898:	e8 bd 07 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  fd48b2:	e8 01 06 00 00       	call   fd4eb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c2ce>
  fd48c5:	e8 f0 11 f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  fd48d2:	e8 7d 07 00 00       	call   fd5054 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c46a>
  fd48db:	e8 a6 9b ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd48e4:	e8 9d 9b ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd48ec:	e8 21 0a f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd48f4:	e8 83 76 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd48fd:	e8 84 9b ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4905:	e8 8e 08 f4 ff       	call   f15198 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc5ae>
  fd493c:	e8 bf 95 81 00       	call   17edf00 <_Znwm@plt>
  fd4964:	e8 5b 4e ef ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
  fd4988:	e8 8f 4e ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd4991:	e8 f0 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd49db:	e8 a6 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd49e3:	e8 9e 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd49eb:	e8 c2 9a ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd49fd:	e8 2e 69 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  fd4a13:	e8 1e a1 b0 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  fd4a1d:	e8 ae ff d4 ff       	call   d249d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271970>
  fd4a27:	e8 5a 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4a38:	e8 49 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4a40:	e8 6d 9a ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd4a4a:	e8 63 9a ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd4a54:	e8 2d 9a ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4a81:	e8 2a b0 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd4a8d:	e8 13 50 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4abf:	e8 96 73 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd4adf:	e8 76 05 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  fd4af5:	e8 0a 01 00 00       	call   fd4c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c01a>
  fd4b4a:	e8 b5 06 f5 ff       	call   f25204 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec61a>
  fd4b52:	e8 25 74 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd4b5a:	e8 27 99 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4b6d:	e8 8e 01 00 00       	call   fd4d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c116>
  fd4b78:	e8 3d 0f f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  fd4b82:	e8 ff 98 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4b8a:	e8 83 07 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd4b92:	e8 7b 07 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd4b9a:	e8 dd 73 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd4ba4:	e8 dd 98 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4bd0:	e8 db ae 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd4bd8:	e8 c8 4e aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4bfa:	e8 93 fe ff ff       	call   fd4a92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bea8>
  fd4c3d:	e8 be 92 81 00       	call   17edf00 <_Znwm@plt>
  fd4ce4:	e8 1b 9b f2 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  fd4cfa:	e8 a6 4d aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4d26:	e8 d5 91 81 00       	call   17edf00 <_Znwm@plt>
  fd4d4f:	e8 30 0e f5 ff       	call   f25b84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf9a>
  fd4d5a:	e8 bb 0d f5 ff       	call   f25b1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf30>
  fd4d62:	e8 ab 05 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd4d70:	e8 a7 96 ac ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  fd4d93:	e8 18 ad 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd4d9b:	e8 05 4d aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## Exact nested source pattern elsewhere: load [X+0x10], then [loaded+0x40]
### 0xab8cad -> 0xab8cc2; FDE=(11241156, 11243730)
      ab8c81:	e8 b6 f6 fe ff       	call   aa833c <JNI_OnUnload@@Base+0x2fc09>
      ab8c86:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ab8c8d:	00 
      ab8c8e:	e8 fd 51 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab8c93:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
      ab8c9a:	00 
      ab8c9b:	e8 f0 51 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab8ca0:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      ab8ca7:	00 
      ab8ca8:	e8 e3 51 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab8cad:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ab8cb2:	8b 40 10             	mov    eax,DWORD PTR [rax+0x10]
      ab8cb5:	a8 04                	test   al,0x4
      ab8cb7:	0f 84 96 00 00 00    	je     ab8d53 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cf3>
      ab8cbd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ab8cc2:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
      ab8cc6:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
      ab8cca:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      ab8cd1:	00 
      ab8cd2:	e8 fb 03 00 00       	call   ab90d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6072>
      ab8cd7:	48 8d 35 c8 c2 89 ff 	lea    rsi,[rip+0xffffffffff89c2c8]        # 354fa6 <_ZTSSt12bad_any_cast@@Base-0x3b222>
      ab8cde:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
      ab8ce5:	00 
      ab8ce6:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]
      ab8ced:	00 
      ab8cee:	e8 a6 d0 ff ff       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      ab8cf3:	48 8d 15 05 9a 8c ff 	lea    rdx,[rip+0xffffffffff8c9a05]        # 3826ff <_ZTSSt12bad_any_cast@@Base-0xdac9>
      ab8cfa:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ab8d01:	00 
      ab8d02:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
      ab8d09:	00 

### 0xab8cbd -> 0xab8cc2; FDE=(11241156, 11243730)
      ab8c93:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
      ab8c9a:	00 
      ab8c9b:	e8 f0 51 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab8ca0:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      ab8ca7:	00 
      ab8ca8:	e8 e3 51 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab8cad:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ab8cb2:	8b 40 10             	mov    eax,DWORD PTR [rax+0x10]
      ab8cb5:	a8 04                	test   al,0x4
      ab8cb7:	0f 84 96 00 00 00    	je     ab8d53 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cf3>
      ab8cbd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ab8cc2:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
      ab8cc6:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
      ab8cca:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      ab8cd1:	00 
      ab8cd2:	e8 fb 03 00 00       	call   ab90d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6072>
      ab8cd7:	48 8d 35 c8 c2 89 ff 	lea    rsi,[rip+0xffffffffff89c2c8]        # 354fa6 <_ZTSSt12bad_any_cast@@Base-0x3b222>
      ab8cde:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
      ab8ce5:	00 
      ab8ce6:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]
      ab8ced:	00 
      ab8cee:	e8 a6 d0 ff ff       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      ab8cf3:	48 8d 15 05 9a 8c ff 	lea    rdx,[rip+0xffffffffff8c9a05]        # 3826ff <_ZTSSt12bad_any_cast@@Base-0xdac9>
      ab8cfa:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ab8d01:	00 
      ab8d02:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
      ab8d09:	00 
      ab8d0a:	e8 2e 27 fe ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
      ab8d0f:	48 8d bc 24 88 01 00 	lea    rdi,[rsp+0x188]
      ab8d16:	00 
      ab8d17:	48 8d b4 24 70 01 00 	lea    rsi,[rsp+0x170]

### 0xbd4bbf -> 0xbd4be2; FDE=(12402696, 12405956)
      bd4b8f:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      bd4b94:	e8 01 5b 98 00       	call   155a69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39fc1e>
      bd4b99:	41 88 47 10          	mov    BYTE PTR [r15+0x10],al
      bd4b9d:	e9 da 00 00 00       	jmp    bd4c7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x121c1c>
      bd4ba2:	89 c7                	mov    edi,eax
      bd4ba4:	e8 aa 1c 00 00       	call   bd6853 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1237f3>
      bd4ba9:	89 84 24 a0 00 00 00 	mov    DWORD PTR [rsp+0xa0],eax
      bd4bb0:	48 8d 05 a9 ac cf 00 	lea    rax,[rip+0xcfaca9]        # 18cf860 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x16c70>
      bd4bb7:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
      bd4bbe:	00 
      bd4bbf:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      bd4bc4:	f3 41 0f 6f 46 48    	movdqu xmm0,XMMWORD PTR [r14+0x48]
      bd4bca:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
      bd4bcf:	49 8b 46 50          	mov    rax,QWORD PTR [r14+0x50]
      bd4bd3:	48 85 c0             	test   rax,rax
      bd4bd6:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
      bd4bdb:	74 05                	je     bd4be2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x121b82>
      bd4bdd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      bd4be2:	49 8b 5e 40          	mov    rbx,QWORD PTR [r14+0x40]
      bd4be6:	48 8d 35 93 a4 78 ff 	lea    rsi,[rip+0xffffffffff78a493]        # 35f080 <_ZTSSt12bad_any_cast@@Base-0x31148>
      bd4bed:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      bd4bf4:	00 
      bd4bf5:	e8 84 4e ea ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      bd4bfa:	49 8d 96 90 01 00 00 	lea    rdx,[r14+0x190]
      bd4c01:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
      bd4c06:	66 48 0f 7e c6       	movq   rsi,xmm0
      bd4c0b:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      bd4c12:	00 
      bd4c13:	6a 01                	push   0x1
      bd4c15:	41 58                	pop    r8
      bd4c17:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]

### 0xbede44 -> 0xbede56; FDE=(12507538, 12508922)
      bede20:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
      bede25:	e8 9e 0a 00 00       	call   bee8c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13b868>
      bede2a:	eb 18                	jmp    bede44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13ade4>
      bede2c:	4c 89 e7             	mov    rdi,r12
      bede2f:	48 89 ee             	mov    rsi,rbp
      bede32:	4c 89 c2             	mov    rdx,r8
      bede35:	4d 89 c6             	mov    r14,r8
      bede38:	e8 a3 1c c0 00       	call   17efae0 <memmove@plt>
      bede3d:	4d 01 f4             	add    r12,r14
      bede40:	4c 89 63 70          	mov    QWORD PTR [rbx+0x70],r12
      bede44:	4c 8b 4c 24 10       	mov    r9,QWORD PTR [rsp+0x10]
      bede49:	41 8b 81 88 00 00 00 	mov    eax,DWORD PTR [r9+0x88]
      bede50:	89 83 88 00 00 00    	mov    DWORD PTR [rbx+0x88],eax
      bede56:	49 8b 41 40          	mov    rax,QWORD PTR [r9+0x40]
      bede5a:	49 2b 41 38          	sub    rax,QWORD PTR [r9+0x38]
      bede5e:	f2 41 0f 2a 41 2c    	cvtsi2sd xmm0,DWORD PTR [r9+0x2c]
      bede64:	48 c1 e8 04          	shr    rax,0x4
      bede68:	f2 0f 2a c8          	cvtsi2sd xmm1,eax
      bede6c:	f2 0f 5e c1          	divsd  xmm0,xmm1
      bede70:	f2 41 0f 2a cf       	cvtsi2sd xmm1,r15d
      bede75:	f2 0f 59 c8          	mulsd  xmm1,xmm0
      bede79:	66 0f 28 05 9f 00 7a 	movapd xmm0,XMMWORD PTR [rip+0xffffffffff7a009f]        # 38df20 <_ZTSSt12bad_any_cast@@Base-0x22a8>
      bede80:	ff 
      bede81:	66 0f 54 c1          	andpd  xmm0,xmm1
      bede85:	66 0f 56 05 13 ed 79 	orpd   xmm0,XMMWORD PTR [rip+0xffffffffff79ed13]        # 38cba0 <_ZTSSt12bad_any_cast@@Base-0x3628>
      bede8c:	ff 
      bede8d:	f2 0f 58 c1          	addsd  xmm0,xmm1
      bede91:	66 0f 3a 0b c0 0b    	roundsd xmm0,xmm0,0xb
      bede97:	f2 0f 2c c0          	cvttsd2si eax,xmm0
      bede9b:	41 8d 4f ff          	lea    ecx,[r15-0x1]
      bede9f:	44 39 f8             	cmp    eax,r15d

### 0xc1b75e -> 0xc1b77e; FDE=(12695290, 12696241)
      c1b734:	49 8b 5c 24 60       	mov    rbx,QWORD PTR [r12+0x60]
      c1b739:	48 85 db             	test   rbx,rbx
      c1b73c:	75 1c                	jne    c1b75a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1686fa>
      c1b73e:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      c1b743:	40 f6 c7 01          	test   dil,0x1
      c1b747:	0f 85 fd 02 00 00    	jne    c1ba4a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1689ea>
      c1b74d:	e8 b2 eb ff ff       	call   c1a304 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1672a4>
      c1b752:	48 89 c3             	mov    rbx,rax
      c1b755:	49 89 44 24 60       	mov    QWORD PTR [r12+0x60],rax
      c1b75a:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      c1b75e:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
      c1b762:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]
      c1b766:	48 85 c0             	test   rax,rax
      c1b769:	48 8d 0d a8 aa cb 00 	lea    rcx,[rip+0xcbaaa8]        # 18d6218 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1d628>
      c1b770:	48 0f 45 c8          	cmovne rcx,rax
      c1b774:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      c1b779:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
      c1b77e:	48 8b 72 40          	mov    rsi,QWORD PTR [rdx+0x40]
      c1b782:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      c1b787:	e8 1c 0b 9a 00       	call   15bc2a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40182c>
      c1b78c:	48 89 1c 24          	mov    QWORD PTR [rsp],rbx
      c1b790:	48 89 df             	mov    rdi,rbx
      c1b793:	e8 76 f8 ff ff       	call   c1b00e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x167fae>
      c1b798:	49 89 c7             	mov    r15,rax
      c1b79b:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      c1b7a0:	4c 8b 6a 38          	mov    r13,QWORD PTR [rdx+0x38]
      c1b7a4:	48 8b 42 18          	mov    rax,QWORD PTR [rdx+0x18]
      c1b7a8:	48 85 c0             	test   rax,rax
      c1b7ab:	48 8d 0d e6 a9 cb 00 	lea    rcx,[rip+0xcba9e6]        # 18d6198 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1d5a8>
      c1b7b2:	48 0f 44 c1          	cmove  rax,rcx
      c1b7b6:	48 8b 52 20          	mov    rdx,QWORD PTR [rdx+0x20]

### 0xc3b10d -> 0xc3b130; FDE=(12824704, 12825353)
      c3b0eb:	e8 82 aa f0 ff       	call   b45b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b12>
      c3b0f0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      c3b0f4:	49 3b 46 08          	cmp    rax,QWORD PTR [r14+0x8]
      c3b0f8:	7d 03                	jge    c3b0fd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18809d>
      c3b0fa:	49 89 ee             	mov    r14,rbp
      c3b0fd:	48 83 c5 30          	add    rbp,0x30
      c3b101:	48 39 dd             	cmp    rbp,rbx
      c3b104:	75 c5                	jne    c3b0cb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18806b>
      c3b106:	49 8b 5f 08          	mov    rbx,QWORD PTR [r15+0x8]
      c3b10a:	49 39 de             	cmp    r14,rbx
      c3b10d:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      c3b112:	0f 84 a4 01 00 00    	je     c3b2bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18825c>
      c3b118:	41 80 7e 10 00       	cmp    BYTE PTR [r14+0x10],0x0
      c3b11d:	0f 84 99 01 00 00    	je     c3b2bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18825c>
      c3b123:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      c3b127:	e8 46 aa f0 ff       	call   b45b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b12>
      c3b12c:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
      c3b130:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
      c3b135:	e8 28 f3 e3 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      c3b13a:	49 29 c7             	sub    r15,rax
      c3b13d:	7d 05                	jge    c3b144 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1880e4>
      c3b13f:	6a 05                	push   0x5
      c3b141:	58                   	pop    rax
      c3b142:	eb 2f                	jmp    c3b173 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x188113>
      c3b144:	b9 00 87 93 03       	mov    ecx,0x3938700
      c3b149:	4c 89 f8             	mov    rax,r15
      c3b14c:	48 99                	cqo
      c3b14e:	48 f7 f9             	idiv   rcx
      c3b151:	48 b9 ff d8 43 1a 14 	movabs rcx,0x141a43d8ff
      c3b158:	00 00 00 
      c3b15b:	49 39 cf             	cmp    r15,rcx

### 0xc7cc6f -> 0xc7cc8f; FDE=(13093890, 13094260)
      c7cc48:	0f 84 f7 00 00 00    	je     c7cd45 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c9ce5>
      c7cc4e:	48 89 df             	mov    rdi,rbx
      c7cc51:	e8 74 66 ee ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
      c7cc56:	48 89 c5             	mov    rbp,rax
      c7cc59:	48 89 df             	mov    rdi,rbx
      c7cc5c:	e8 13 6c fd ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
      c7cc61:	49 89 c7             	mov    r15,rax
      c7cc64:	48 89 df             	mov    rdi,rbx
      c7cc67:	e8 32 6c fd ff       	call   c5389e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a083e>
      c7cc6c:	49 89 c6             	mov    r14,rax
      c7cc6f:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
      c7cc74:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      c7cc79:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      c7cc7d:	48 89 ef             	mov    rdi,rbp
      c7cc80:	ff 50 48             	call   QWORD PTR [rax+0x48]
      c7cc83:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      c7cc88:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      c7cc8c:	48 89 ef             	mov    rdi,rbp
      c7cc8f:	ff 50 40             	call   QWORD PTR [rax+0x40]
      c7cc92:	49 89 c5             	mov    r13,rax
      c7cc95:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      c7cc99:	48 89 ef             	mov    rdi,rbp
      c7cc9c:	ff 50 38             	call   QWORD PTR [rax+0x38]
      c7cc9f:	48 89 c5             	mov    rbp,rax
      c7cca2:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      c7cca7:	48 8b 58 20          	mov    rbx,QWORD PTR [rax+0x20]
      c7ccab:	49 8b 07             	mov    rax,QWORD PTR [r15]
      c7ccae:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
      c7ccb3:	4c 89 e7             	mov    rdi,r12
      c7ccb6:	4c 89 fe             	mov    rsi,r15
      c7ccb9:	ff 50 38             	call   QWORD PTR [rax+0x38]

### 0xcd161a -> 0xcd1629; FDE=(13440524, 13440600)
      cd15fc:	75 08                	jne    cd1606 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5a6>
      cd15fe:	4c 89 ef             	mov    rdi,r13
      cd1601:	e8 ca e6 d9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cd1606:	e8 a5 e4 b1 00       	call   17efab0 <__stack_chk_fail@plt>
      cd160b:	cc                   	int3
      cd160c:	50                   	push   rax
      cd160d:	48 89 f0             	mov    rax,rsi
      cd1610:	31 f6                	xor    esi,esi
      cd1612:	83 78 08 00          	cmp    DWORD PTR [rax+0x8],0x0
      cd1616:	48 0f 45 c6          	cmovne rax,rsi
      cd161a:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd161e:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1622:	48 83 78 48 00       	cmp    QWORD PTR [rax+0x48],0x0
      cd1627:	74 08                	je     cd1631 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5d1>
      cd1629:	48 8b 48 40          	mov    rcx,QWORD PTR [rax+0x40]
      cd162d:	48 8b 71 18          	mov    rsi,QWORD PTR [rcx+0x18]
      cd1631:	48 85 f6             	test   rsi,rsi
      cd1634:	74 1e                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd1636:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      cd163a:	48 85 ff             	test   rdi,rdi
      cd163d:	74 15                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd163f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cd1642:	ff 50 70             	call   QWORD PTR [rax+0x70]
      cd1645:	48 85 c0             	test   rax,rax
      cd1648:	74 0a                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd164a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      cd164d:	48 89 c7             	mov    rdi,rax
      cd1650:	58                   	pop    rax
      cd1651:	ff 61 10             	jmp    QWORD PTR [rcx+0x10]
      cd1654:	b0 01                	mov    al,0x1
      cd1656:	59                   	pop    rcx

### 0xcd161e -> 0xcd1629; FDE=(13440524, 13440600)
      cd15fe:	4c 89 ef             	mov    rdi,r13
      cd1601:	e8 ca e6 d9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cd1606:	e8 a5 e4 b1 00       	call   17efab0 <__stack_chk_fail@plt>
      cd160b:	cc                   	int3
      cd160c:	50                   	push   rax
      cd160d:	48 89 f0             	mov    rax,rsi
      cd1610:	31 f6                	xor    esi,esi
      cd1612:	83 78 08 00          	cmp    DWORD PTR [rax+0x8],0x0
      cd1616:	48 0f 45 c6          	cmovne rax,rsi
      cd161a:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd161e:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1622:	48 83 78 48 00       	cmp    QWORD PTR [rax+0x48],0x0
      cd1627:	74 08                	je     cd1631 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5d1>
      cd1629:	48 8b 48 40          	mov    rcx,QWORD PTR [rax+0x40]
      cd162d:	48 8b 71 18          	mov    rsi,QWORD PTR [rcx+0x18]
      cd1631:	48 85 f6             	test   rsi,rsi
      cd1634:	74 1e                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd1636:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      cd163a:	48 85 ff             	test   rdi,rdi
      cd163d:	74 15                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd163f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cd1642:	ff 50 70             	call   QWORD PTR [rax+0x70]
      cd1645:	48 85 c0             	test   rax,rax
      cd1648:	74 0a                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd164a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      cd164d:	48 89 c7             	mov    rdi,rax
      cd1650:	58                   	pop    rax
      cd1651:	ff 61 10             	jmp    QWORD PTR [rcx+0x10]
      cd1654:	b0 01                	mov    al,0x1
      cd1656:	59                   	pop    rcx
      cd1657:	c3                   	ret

### 0xcd169f -> 0xcd16ae; FDE=(13440630, 13440982)
      cd1678:	53                   	push   rbx
      cd1679:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
      cd1680:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cd1687:	00 00 
      cd1689:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      cd1690:	00 
      cd1691:	31 c0                	xor    eax,eax
      cd1693:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
      cd1697:	48 0f 44 c6          	cmove  rax,rsi
      cd169b:	4c 8b 70 10          	mov    r14,QWORD PTR [rax+0x10]
      cd169f:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      cd16a3:	48 83 78 48 00       	cmp    QWORD PTR [rax+0x48],0x0
      cd16a8:	0f 84 c3 00 00 00    	je     cd1771 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e711>
      cd16ae:	48 8b 48 40          	mov    rcx,QWORD PTR [rax+0x40]
      cd16b2:	48 8b 59 18          	mov    rbx,QWORD PTR [rcx+0x18]
      cd16b6:	48 85 db             	test   rbx,rbx
      cd16b9:	0f 84 b2 00 00 00    	je     cd1771 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e711>
      cd16bf:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      cd16c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cd16c6:	48 89 de             	mov    rsi,rbx
      cd16c9:	ff 50 50             	call   QWORD PTR [rax+0x50]
      cd16cc:	48 85 c0             	test   rax,rax
      cd16cf:	0f 84 9c 00 00 00    	je     cd1771 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e711>
      cd16d5:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
      cd16d9:	4c 8b 71 10          	mov    r14,QWORD PTR [rcx+0x10]
      cd16dd:	48 89 9c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rbx
      cd16e4:	00 
      cd16e5:	83 a4 24 a0 00 00 00 	and    DWORD PTR [rsp+0xa0],0x0
      cd16ec:	00 
      cd16ed:	c7 84 24 a8 00 00 00 	mov    DWORD PTR [rsp+0xa8],0x1
      cd16f4:	01 00 00 00 

### 0xcd1c21 -> 0xcd1c30; FDE=(13442070, 13442106)
      cd1bff:	48 3b 84 24 d8 03 00 	cmp    rax,QWORD PTR [rsp+0x3d8]
      cd1c06:	00 
      cd1c07:	75 08                	jne    cd1c11 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21ebb1>
      cd1c09:	48 89 df             	mov    rdi,rbx
      cd1c0c:	e8 bf e0 d9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cd1c11:	e8 9a de b1 00       	call   17efab0 <__stack_chk_fail@plt>
      cd1c16:	50                   	push   rax
      cd1c17:	31 c0                	xor    eax,eax
      cd1c19:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
      cd1c1d:	48 0f 44 c6          	cmove  rax,rsi
      cd1c21:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1c25:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1c29:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      cd1c2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cd1c30:	ff 50 40             	call   QWORD PTR [rax+0x40]
      cd1c33:	85 c0                	test   eax,eax
      cd1c35:	0f 94 c0             	sete   al
      cd1c38:	59                   	pop    rcx
      cd1c39:	c3                   	ret
      cd1c3a:	31 c0                	xor    eax,eax
      cd1c3c:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
      cd1c40:	48 0f 44 c6          	cmove  rax,rsi
      cd1c44:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1c48:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1c4c:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      cd1c50:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cd1c53:	ff 60 28             	jmp    QWORD PTR [rax+0x28]
      cd1c56:	31 c0                	xor    eax,eax
      cd1c58:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
      cd1c5c:	48 0f 44 c6          	cmove  rax,rsi
      cd1c60:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]

### 0xcd1c25 -> 0xcd1c30; FDE=(13442070, 13442106)
      cd1c06:	00 
      cd1c07:	75 08                	jne    cd1c11 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21ebb1>
      cd1c09:	48 89 df             	mov    rdi,rbx
      cd1c0c:	e8 bf e0 d9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cd1c11:	e8 9a de b1 00       	call   17efab0 <__stack_chk_fail@plt>
      cd1c16:	50                   	push   rax
      cd1c17:	31 c0                	xor    eax,eax
      cd1c19:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
      cd1c1d:	48 0f 44 c6          	cmove  rax,rsi
      cd1c21:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1c25:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1c29:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      cd1c2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cd1c30:	ff 50 40             	call   QWORD PTR [rax+0x40]
      cd1c33:	85 c0                	test   eax,eax
      cd1c35:	0f 94 c0             	sete   al
      cd1c38:	59                   	pop    rcx
      cd1c39:	c3                   	ret
      cd1c3a:	31 c0                	xor    eax,eax
      cd1c3c:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
      cd1c40:	48 0f 44 c6          	cmove  rax,rsi
      cd1c44:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1c48:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1c4c:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      cd1c50:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cd1c53:	ff 60 28             	jmp    QWORD PTR [rax+0x28]
      cd1c56:	31 c0                	xor    eax,eax
      cd1c58:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
      cd1c5c:	48 0f 44 c6          	cmove  rax,rsi
      cd1c60:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1c64:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]

### 0xcdc1a2 -> 0xcdc1b0; FDE=(13484450, 13484463)
      cdc18b:	48 89 d8             	mov    rax,rbx
      cdc18e:	48 83 c4 40          	add    rsp,0x40
      cdc192:	5b                   	pop    rbx
      cdc193:	41 5c                	pop    r12
      cdc195:	41 5d                	pop    r13
      cdc197:	41 5e                	pop    r14
      cdc199:	41 5f                	pop    r15
      cdc19b:	c3                   	ret
      cdc19c:	e8 0f 39 b1 00       	call   17efab0 <__stack_chk_fail@plt>
      cdc1a1:	cc                   	int3
      cdc1a2:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      cdc1a6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cdc1a9:	ff a0 70 01 00 00    	jmp    QWORD PTR [rax+0x170]
      cdc1af:	cc                   	int3
      cdc1b0:	48 89 77 40          	mov    QWORD PTR [rdi+0x40],rsi
      cdc1b4:	c3                   	ret
      cdc1b5:	cc                   	int3
      cdc1b6:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      cdc1ba:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cdc1bd:	48 8b 80 b0 01 00 00 	mov    rax,QWORD PTR [rax+0x1b0]
      cdc1c4:	ff e0                	jmp    rax
      cdc1c6:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      cdc1ca:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cdc1cd:	ff a0 f0 00 00 00    	jmp    QWORD PTR [rax+0xf0]
      cdc1d3:	cc                   	int3
      cdc1d4:	41 57                	push   r15
      cdc1d6:	41 56                	push   r14
      cdc1d8:	41 54                	push   r12
      cdc1da:	53                   	push   rbx
      cdc1db:	48 83 ec 48          	sub    rsp,0x48
      cdc1df:	49 89 f6             	mov    r14,rsi

### 0xd11486 -> 0xd11495; FDE=(13702098, 13702840)
      d11460:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d11463:	4c 89 ff             	mov    rdi,r15
      d11466:	ff 50 58             	call   QWORD PTR [rax+0x58]
      d11469:	49 89 c6             	mov    r14,rax
      d1146c:	48 85 c0             	test   rax,rax
      d1146f:	0f 84 42 01 00 00    	je     d115b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e557>
      d11475:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d11478:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      d1147d:	4c 89 f6             	mov    rsi,r14
      d11480:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      d11486:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d1148b:	f6 40 30 01          	test   BYTE PTR [rax+0x30],0x1
      d1148f:	0f 84 be 00 00 00    	je     d11553 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e4f3>
      d11495:	48 8b 40 40          	mov    rax,QWORD PTR [rax+0x40]
      d11499:	e9 b9 00 00 00       	jmp    d11557 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e4f7>
      d1149e:	48 83 c0 29          	add    rax,0x29
      d114a2:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      d114a7:	48 89 06             	mov    QWORD PTR [rsi],rax
      d114aa:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      d114af:	e8 f8 c9 e6 ff       	call   b7deac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcae4c>
      d114b4:	4c 89 ff             	mov    rdi,r15
      d114b7:	e8 ca cf d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d114bc:	49 8b be f8 00 00 00 	mov    rdi,QWORD PTR [r14+0xf8]
      d114c3:	49 8b 9e 08 01 00 00 	mov    rbx,QWORD PTR [r14+0x108]
      d114ca:	48 89 de             	mov    rsi,rbx
      d114cd:	e8 e6 8c 93 00       	call   164a1b8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45326>
      d114d2:	85 c0                	test   eax,eax
      d114d4:	0f 84 dd 00 00 00    	je     d115b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e557>
      d114da:	45 31 ff             	xor    r15d,r15d
      d114dd:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      d114e2:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]

### 0xd426e8 -> 0xd426fe; FDE=(13902968, 13905979)
      d426c3:	00 
      d426c4:	88 84 24 48 01 00 00 	mov    BYTE PTR [rsp+0x148],al
      d426cb:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      d426cf:	4c 89 ef             	mov    rdi,r13
      d426d2:	ff 50 38             	call   QWORD PTR [rax+0x38]
      d426d5:	49 89 c4             	mov    r12,rax
      d426d8:	44 89 a4 24 34 01 00 	mov    DWORD PTR [rsp+0x134],r12d
      d426df:	00 
      d426e0:	c6 84 24 38 01 00 00 	mov    BYTE PTR [rsp+0x138],0x1
      d426e7:	01 
      d426e8:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d426ed:	8b 40 4c             	mov    eax,DWORD PTR [rax+0x4c]
      d426f0:	89 84 24 a4 00 00 00 	mov    DWORD PTR [rsp+0xa4],eax
      d426f7:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      d426fb:	4c 89 ef             	mov    rdi,r13
      d426fe:	ff 50 40             	call   QWORD PTR [rax+0x40]
      d42701:	41 29 c4             	sub    r12d,eax
      d42704:	b8 00 00 04 00       	mov    eax,0x40000
      d42709:	41 39 c4             	cmp    r12d,eax
      d4270c:	41 0f 4c c4          	cmovl  eax,r12d
      d42710:	89 44 24 30          	mov    DWORD PTR [rsp+0x30],eax
      d42714:	6a 03                	push   0x3
      d42716:	5b                   	pop    rbx
      d42717:	45 31 ed             	xor    r13d,r13d
      d4271a:	45 85 e4             	test   r12d,r12d
      d4271d:	0f 8e f6 00 00 00    	jle    d42819 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf89f>
      d42723:	bb 00 08 00 00       	mov    ebx,0x800
      d42728:	41 39 dc             	cmp    r12d,ebx
      d4272b:	41 0f 4c dc          	cmovl  ebx,r12d
      d4272f:	45 31 ff             	xor    r15d,r15d
      d42732:	89 dd                	mov    ebp,ebx

### 0xd78c43 -> 0xd78c55; FDE=(14124352, 14129483)
      d78c23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d78c26:	ff 50 38             	call   QWORD PTR [rax+0x38]
      d78c29:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      d78c2c:	48 89 c7             	mov    rdi,rax
      d78c2f:	ff 51 20             	call   QWORD PTR [rcx+0x20]
      d78c32:	84 c0                	test   al,al
      d78c34:	0f 84 dc 01 00 00    	je     d78e16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45e9c>
      d78c3a:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      d78c3d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d78c40:	ff 50 38             	call   QWORD PTR [rax+0x38]
      d78c43:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      d78c48:	0f b6 b1 04 02 00 00 	movzx  esi,BYTE PTR [rcx+0x204]
      d78c4f:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      d78c52:	48 89 c7             	mov    rdi,rax
      d78c55:	ff 51 40             	call   QWORD PTR [rcx+0x40]
      d78c58:	84 c0                	test   al,al
      d78c5a:	74 11                	je     d78c6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45cf3>
      d78c5c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      d78c5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d78c62:	ff 50 48             	call   QWORD PTR [rax+0x48]
      d78c65:	84 c0                	test   al,al
      d78c67:	0f 84 66 0a 00 00    	je     d796d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46759>
      d78c6d:	4c 89 e7             	mov    rdi,r12
      d78c70:	e8 59 23 8d 00       	call   164afce <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4613c>
      d78c75:	b9 09 04 00 00       	mov    ecx,0x409
      d78c7a:	0f a3 c1             	bt     ecx,eax
      d78c7d:	0f 83 0d 01 00 00    	jae    d78d90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45e16>
      d78c83:	49 ff 45 18          	inc    QWORD PTR [r13+0x18]
      d78c87:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      d78c8a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d78c8d:	ff 50 10             	call   QWORD PTR [rax+0x10]

### 0xd7e492 -> 0xd7e49d; FDE=(14148414, 14150526)
      d7e46b:	74 08                	je     d7e475 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b4fb>
      d7e46d:	48 89 df             	mov    rdi,rbx
      d7e470:	e8 d7 b4 ff ff       	call   d7994c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x469d2>
      d7e475:	48 8b bb f0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2f0]
      d7e47c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d7e47f:	ff 50 58             	call   QWORD PTR [rax+0x58]
      d7e482:	48 8d 8b f0 02 00 00 	lea    rcx,[rbx+0x2f0]
      d7e489:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      d7e48e:	84 c0                	test   al,al
      d7e490:	74 0e                	je     d7e4a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b526>
      d7e492:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d7e497:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      d7e49a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d7e49d:	ff 50 40             	call   QWORD PTR [rax+0x40]
      d7e4a0:	48 8b bb f8 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2f8]
      d7e4a7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d7e4aa:	ff 50 58             	call   QWORD PTR [rax+0x58]
      d7e4ad:	48 8d 8b f8 02 00 00 	lea    rcx,[rbx+0x2f8]
      d7e4b4:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
      d7e4b9:	84 c0                	test   al,al
      d7e4bb:	74 0e                	je     d7e4cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b551>
      d7e4bd:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      d7e4c2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      d7e4c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d7e4c8:	ff 50 40             	call   QWORD PTR [rax+0x40]
      d7e4cb:	48 8b bb 00 03 00 00 	mov    rdi,QWORD PTR [rbx+0x300]
      d7e4d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d7e4d5:	ff 50 58             	call   QWORD PTR [rax+0x58]
      d7e4d8:	48 8d 8b 00 03 00 00 	lea    rcx,[rbx+0x300]
      d7e4df:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
      d7e4e4:	84 c0                	test   al,al

### 0xd8b037 -> 0xd8b049; FDE=(14200712, 14201479)
      d8b01a:	48 89 ef             	mov    rdi,rbp
      d8b01d:	ff 50 40             	call   QWORD PTR [rax+0x40]
      d8b020:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      d8b023:	48 89 c7             	mov    rdi,rax
      d8b026:	ff 51 20             	call   QWORD PTR [rcx+0x20]
      d8b029:	84 c0                	test   al,al
      d8b02b:	74 29                	je     d8b056 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x580dc>
      d8b02d:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      d8b031:	48 89 ef             	mov    rdi,rbp
      d8b034:	ff 50 40             	call   QWORD PTR [rax+0x40]
      d8b037:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      d8b03c:	0f b6 b1 04 02 00 00 	movzx  esi,BYTE PTR [rcx+0x204]
      d8b043:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      d8b046:	48 89 c7             	mov    rdi,rax
      d8b049:	ff 51 40             	call   QWORD PTR [rcx+0x40]
      d8b04c:	31 db                	xor    ebx,ebx
      d8b04e:	84 c0                	test   al,al
      d8b050:	0f 84 a4 01 00 00    	je     d8b1fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58280>
      d8b056:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d8b05b:	80 b8 c0 05 00 00 00 	cmp    BYTE PTR [rax+0x5c0],0x0
      d8b062:	74 65                	je     d8b0c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5814f>
      d8b064:	4c 89 f7             	mov    rdi,r14
      d8b067:	48 89 ee             	mov    rsi,rbp
      d8b06a:	e8 e3 e3 fd ff       	call   d69452 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364d8>
      d8b06f:	4c 89 f3             	mov    rbx,r14
      d8b072:	4c 89 f7             	mov    rdi,r14
      d8b075:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
      d8b07a:	e8 29 e4 fd ff       	call   d694a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3652e>
      d8b07f:	84 c0                	test   al,al
      d8b081:	74 3e                	je     d8b0c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58147>
      d8b083:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### 0xde9916 -> 0xde991b; FDE=(14586236, 14595790)
      de98f4:	41 89 e9             	mov    r9d,ebp
      de98f7:	e8 f6 dc 7f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
      de98fc:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      de98ff:	48 89 de             	mov    rsi,rbx
      de9902:	4c 89 e2             	mov    rdx,r12
      de9905:	4c 89 f9             	mov    rcx,r15
      de9908:	4d 89 e8             	mov    r8,r13
      de990b:	41 89 e9             	mov    r9d,ebp
      de990e:	e8 17 db 7f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
      de9913:	4c 63 c0             	movsxd r8,eax
      de9916:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
      de991b:	4c 89 45 40          	mov    QWORD PTR [rbp+0x40],r8
      de991f:	83 3d 92 00 b4 00 06 	cmp    DWORD PTR [rip+0xb40092],0x6        # 19299b8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70dc8>
      de9926:	7c 1d                	jl     de9945 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb69cb>
      de9928:	48 8d 35 83 ea 58 ff 	lea    rsi,[rip+0xffffffffff58ea83]        # 3783b2 <_ZTSSt12bad_any_cast@@Base-0x17e16>
      de992f:	48 8d 0d 73 eb 54 ff 	lea    rcx,[rip+0xffffffffff54eb73]        # 3384a9 <_ZTSSt12bad_any_cast@@Base-0x57d1f>
      de9936:	6a 06                	push   0x6
      de9938:	5f                   	pop    rdi
      de9939:	ba ec 00 00 00       	mov    edx,0xec
      de993e:	31 c0                	xor    eax,eax
      de9940:	e8 8d cf 9e 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      de9945:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      de9948:	83 24 24 00          	and    DWORD PTR [rsp],0x0
      de994c:	c7 44 24 08 c0 27 09 	mov    DWORD PTR [rsp+0x8],0x927c0
      de9953:	00 
      de9954:	48 8d 1d 35 81 5e ff 	lea    rbx,[rip+0xffffffffff5e8135]        # 3d1a90 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x28e4>
      de995b:	4c 8d 3d 4e 81 5e ff 	lea    r15,[rip+0xffffffffff5e814e]        # 3d1ab0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2904>
      de9962:	6a 14                	push   0x14
      de9964:	41 5c                	pop    r12
      de9966:	6a 22                	push   0x22
      de9968:	41 5d                	pop    r13

### 0xdef815 -> 0xdef81a; FDE=(14596108, 14619287)
      def7ea:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      def7f0:	4c 89 ff             	mov    rdi,r15
      def7f3:	4c 89 e6             	mov    rsi,r12
      def7f6:	e8 5f c4 cc ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
      def7fb:	48 8b bc 24 18 13 00 	mov    rdi,QWORD PTR [rsp+0x1318]
      def802:	00 
      def803:	e8 7e ec ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      def808:	48 8d bc 24 90 13 00 	lea    rdi,[rsp+0x1390]
      def80f:	00 
      def810:	e8 d3 af 9e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      def815:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      def81a:	48 8b 58 40          	mov    rbx,QWORD PTR [rax+0x40]
      def81e:	48 85 db             	test   rbx,rbx
      def821:	74 56                	je     def879 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbc8ff>
      def823:	4c 8d b4 24 90 13 00 	lea    r14,[rsp+0x1390]
      def82a:	00 
      def82b:	48 8d b4 24 60 07 00 	lea    rsi,[rsp+0x760]
      def832:	00 
      def833:	4c 89 f7             	mov    rdi,r14
      def836:	e8 09 db 01 00       	call   e0d344 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda3ca>
      def83b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      def83e:	48 8d bc 24 10 13 00 	lea    rdi,[rsp+0x1310]
      def845:	00 
      def846:	48 89 de             	mov    rsi,rbx
      def849:	4c 89 f2             	mov    rdx,r14
      def84c:	ff 50 70             	call   QWORD PTR [rax+0x70]
      def84f:	48 8d b4 24 10 13 00 	lea    rsi,[rsp+0x1310]
      def856:	00 
      def857:	4c 89 ff             	mov    rdi,r15
      def85a:	e8 fb c3 cc ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
      def85f:	48 8b bc 24 18 13 00 	mov    rdi,QWORD PTR [rsp+0x1318]

### 0xe02282 -> 0xe02290; FDE=(14688898, 14688911)
      e0226d:	c3                   	ret
      e0226e:	53                   	push   rbx
      e0226f:	48 89 fb             	mov    rbx,rdi
      e02272:	48 8b 76 30          	mov    rsi,QWORD PTR [rsi+0x30]
      e02276:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e02279:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e0227c:	48 89 d8             	mov    rax,rbx
      e0227f:	5b                   	pop    rbx
      e02280:	c3                   	ret
      e02281:	cc                   	int3
      e02282:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      e02286:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e02289:	ff a0 88 00 00 00    	jmp    QWORD PTR [rax+0x88]
      e0228f:	cc                   	int3
      e02290:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
      e02294:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e02297:	ff a0 08 01 00 00    	jmp    QWORD PTR [rax+0x108]
      e0229d:	cc                   	int3
      e0229e:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      e022a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e022a5:	ff a0 90 00 00 00    	jmp    QWORD PTR [rax+0x90]
      e022ab:	cc                   	int3
      e022ac:	55                   	push   rbp
      e022ad:	41 57                	push   r15
      e022af:	41 56                	push   r14
      e022b1:	53                   	push   rbx
      e022b2:	48 81 ec f8 05 00 00 	sub    rsp,0x5f8
      e022b9:	49 89 f6             	mov    r14,rsi
      e022bc:	48 89 fb             	mov    rbx,rdi
      e022bf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e022c6:	00 00 

### 0xe3a299 -> 0xe3a2ab; FDE=(14918290, 14918361)
      e3a282:	50                   	push   rax
      e3a283:	e8 0a 00 00 00       	call   e3a292 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a8>
      e3a288:	58                   	pop    rax
      e3a289:	c3                   	ret
      e3a28a:	48 89 c7             	mov    rdi,rax
      e3a28d:	e8 13 f8 c3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e3a292:	41 56                	push   r14
      e3a294:	53                   	push   rbx
      e3a295:	50                   	push   rax
      e3a296:	48 89 fb             	mov    rbx,rdi
      e3a299:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]
      e3a29d:	4d 85 f6             	test   r14,r14
      e3a2a0:	74 17                	je     e3a2b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16cf>
      e3a2a2:	49 8d 7e 48          	lea    rdi,[r14+0x48]
      e3a2a6:	e8 51 76 ef ff       	call   d318fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27e89c>
      e3a2ab:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      e3a2af:	e8 d2 41 c6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e3a2b4:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      e3a2b9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e3a2bd:	48 85 ff             	test   rdi,rdi
      e3a2c0:	74 0f                	je     e3a2d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e7>
      e3a2c2:	be 80 00 00 00       	mov    esi,0x80
      e3a2c7:	e8 43 9c ef ff       	call   d33f0f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf95>
      e3a2cc:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
      e3a2d1:	48 83 c4 08          	add    rsp,0x8
      e3a2d5:	5b                   	pop    rbx
      e3a2d6:	41 5e                	pop    r14
      e3a2d8:	c3                   	ret
      e3a2d9:	cc                   	int3
      e3a2da:	48 83 ec 28          	sub    rsp,0x28
      e3a2de:	48 89 fe             	mov    rsi,rdi

### 0xeeabe1 -> 0xeeabe6; FDE=(15639632, 15643122)
      eeabb2:	e8 51 fe bb ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
      eeabb7:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      eeabbc:	e8 cf 32 90 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      eeabc1:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      eeabc8:	00 
      eeabc9:	e8 60 a7 7d 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      eeabce:	83 fb 02             	cmp    ebx,0x2
      eeabd1:	0f 85 30 03 00 00    	jne    eeaf07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb231d>
      eeabd7:	40 f6 c5 10          	test   bpl,0x10
      eeabdb:	0f 84 98 01 00 00    	je     eead79 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb218f>
      eeabe1:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      eeabe6:	4c 8b 70 40          	mov    r14,QWORD PTR [rax+0x40]
      eeabea:	4c 89 ff             	mov    rdi,r15
      eeabed:	e8 44 0c b9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      eeabf2:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
      eeabf9:	00 
      eeabfa:	48 89 df             	mov    rdi,rbx
      eeabfd:	48 89 c6             	mov    rsi,rax
      eeac00:	e8 23 a8 7d 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
      eeac05:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
      eeac0a:	4c 89 e7             	mov    rdi,r12
      eeac0d:	48 89 de             	mov    rsi,rbx
      eeac10:	e8 a7 1e 7e 00       	call   16ccabc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80c28>
      eeac15:	49 8d 7e 70          	lea    rdi,[r14+0x70]
      eeac19:	4c 89 e6             	mov    rsi,r12
      eeac1c:	e8 f5 dc fb ff       	call   ea8916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fd2c>
      eeac21:	84 c0                	test   al,al
      eeac23:	0f 84 39 01 00 00    	je     eead62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2178>
      eeac29:	0f 57 c0             	xorps  xmm0,xmm0
      eeac2c:	48 8d 94 24 50 01 00 	lea    rdx,[rsp+0x150]
      eeac33:	00 

### 0xf64f93 -> 0xf64f9c; FDE=(16140472, 16143484)
      f64f69:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
      f64f70:	00 
      f64f71:	49 89 f4             	mov    r12,rsi
      f64f74:	bf f0 0f 00 00       	mov    edi,0xff0
      f64f79:	e8 82 8f 88 00       	call   17edf00 <_Znwm@plt>
      f64f7e:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      f64f85:	00 
      f64f86:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      f64f8b:	4c 89 fe             	mov    rsi,r15
      f64f8e:	e8 27 92 be ff       	call   b4e1ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b15a>
      f64f93:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      f64f98:	48 8b 57 50          	mov    rdx,QWORD PTR [rdi+0x50]
      f64f9c:	48 8b 47 40          	mov    rax,QWORD PTR [rdi+0x40]
      f64fa0:	48 8b 4f 48          	mov    rcx,QWORD PTR [rdi+0x48]
      f64fa4:	48 29 ca             	sub    rdx,rcx
      f64fa7:	31 f6                	xor    esi,esi
      f64fa9:	48 83 fa 08          	cmp    rdx,0x8
      f64fad:	40 0f 94 c6          	sete   sil
      f64fb1:	48 8b 57 60          	mov    rdx,QWORD PTR [rdi+0x60]
      f64fb5:	48 f7 de             	neg    rsi
      f64fb8:	48 01 f2             	add    rdx,rsi
      f64fbb:	48 83 c2 66          	add    rdx,0x66
      f64fbf:	48 89 57 60          	mov    QWORD PTR [rdi+0x60],rdx
      f64fc3:	49 8d 74 24 01       	lea    rsi,[r12+0x1]
      f64fc8:	4c 39 e5             	cmp    rbp,r12
      f64fcb:	74 05                	je     f64fd2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12c3e8>
      f64fcd:	48 39 c1             	cmp    rcx,rax
      f64fd0:	75 9f                	jne    f64f71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12c387>
      f64fd2:	4d 89 f7             	mov    r15,r14
      f64fd5:	4d 29 ef             	sub    r15,r13
      f64fd8:	49 29 f7             	sub    r15,rsi

### 0x1074cf2 -> 0x1074d15; FDE=(17255114, 17258939)
     1074ccc:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1074cd1:	31 c0                	xor    eax,eax
     1074cd3:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     1074cd8:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1074cdc:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1074ce3:	00 
     1074ce4:	48 89 ee             	mov    rsi,rbp
     1074ce7:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1074cea:	48 8b ac 24 30 01 00 	mov    rbp,QWORD PTR [rsp+0x130]
     1074cf1:	00 
     1074cf2:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1074cf7:	4c 8b a0 00 01 00 00 	mov    r12,QWORD PTR [rax+0x100]
     1074cfe:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1074d01:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1074d08:	00 
     1074d09:	4c 89 f6             	mov    rsi,r14
     1074d0c:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1074d0f:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1074d12:	4c 89 f7             	mov    rdi,r14
     1074d15:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1074d18:	49 89 c6             	mov    r14,rax
     1074d1b:	6a 38                	push   0x38
     1074d1d:	5f                   	pop    rdi
     1074d1e:	e8 dd 91 77 00       	call   17edf00 <_Znwm@plt>
     1074d23:	48 89 c3             	mov    rbx,rax
     1074d26:	48 83 a4 24 c0 01 00 	and    QWORD PTR [rsp+0x1c0],0x0
     1074d2d:	00 00 
     1074d2f:	48 83 a4 24 d0 01 00 	and    QWORD PTR [rsp+0x1d0],0x0
     1074d36:	00 00 
     1074d38:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
     1074d3f:	00 

### 0x10b64b7 -> 0x10b64d5; FDE=(17523594, 17525139)
     10b648b:	e8 a8 f5 ff ff       	call   10b5a38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ce4e>
     10b6490:	48 83 c0 20          	add    rax,0x20
     10b6494:	48 89 c7             	mov    rdi,rax
     10b6497:	e8 c6 f4 ff ff       	call   10b5962 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27cd78>
     10b649c:	49 8b 5f 18          	mov    rbx,QWORD PTR [r15+0x18]
     10b64a0:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
     10b64a5:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
     10b64a9:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10b64ae:	48 39 c3             	cmp    rbx,rax
     10b64b1:	0f 84 f3 01 00 00    	je     10b66aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dac0>
     10b64b7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b64bc:	48 83 c0 48          	add    rax,0x48
     10b64c0:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     10b64c5:	48 89 df             	mov    rdi,rbx
     10b64c8:	e8 4d 09 be ff       	call   c96e1a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3dba>
     10b64cd:	49 89 c7             	mov    r15,rax
     10b64d0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b64d5:	4c 8b 68 40          	mov    r13,QWORD PTR [rax+0x40]
     10b64d9:	4d 85 ed             	test   r13,r13
     10b64dc:	0f 84 b9 01 00 00    	je     10b669b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dab1>
     10b64e2:	f3 4d 0f b8 f5       	popcnt r14,r13
     10b64e7:	49 83 fe 01          	cmp    r14,0x1
     10b64eb:	77 09                	ja     10b64f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d90c>
     10b64ed:	4d 8d 65 ff          	lea    r12,[r13-0x1]
     10b64f1:	4d 21 fc             	and    r12,r15
     10b64f4:	eb 13                	jmp    10b6509 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d91f>
     10b64f6:	4d 89 fc             	mov    r12,r15
     10b64f9:	4d 39 ef             	cmp    r15,r13
     10b64fc:	72 0b                	jb     10b6509 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d91f>
     10b64fe:	4c 89 f8             	mov    rax,r15
     10b6501:	31 d2                	xor    edx,edx

### 0x10b64d0 -> 0x10b64d5; FDE=(17523594, 17525139)
     10b64a5:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
     10b64a9:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10b64ae:	48 39 c3             	cmp    rbx,rax
     10b64b1:	0f 84 f3 01 00 00    	je     10b66aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dac0>
     10b64b7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b64bc:	48 83 c0 48          	add    rax,0x48
     10b64c0:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     10b64c5:	48 89 df             	mov    rdi,rbx
     10b64c8:	e8 4d 09 be ff       	call   c96e1a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3dba>
     10b64cd:	49 89 c7             	mov    r15,rax
     10b64d0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b64d5:	4c 8b 68 40          	mov    r13,QWORD PTR [rax+0x40]
     10b64d9:	4d 85 ed             	test   r13,r13
     10b64dc:	0f 84 b9 01 00 00    	je     10b669b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dab1>
     10b64e2:	f3 4d 0f b8 f5       	popcnt r14,r13
     10b64e7:	49 83 fe 01          	cmp    r14,0x1
     10b64eb:	77 09                	ja     10b64f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d90c>
     10b64ed:	4d 8d 65 ff          	lea    r12,[r13-0x1]
     10b64f1:	4d 21 fc             	and    r12,r15
     10b64f4:	eb 13                	jmp    10b6509 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d91f>
     10b64f6:	4d 89 fc             	mov    r12,r15
     10b64f9:	4d 39 ef             	cmp    r15,r13
     10b64fc:	72 0b                	jb     10b6509 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d91f>
     10b64fe:	4c 89 f8             	mov    rax,r15
     10b6501:	31 d2                	xor    edx,edx
     10b6503:	49 f7 f5             	div    r13
     10b6506:	49 89 d4             	mov    r12,rdx
     10b6509:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b650e:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]
     10b6512:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     10b6517:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]

### 0x10d500c -> 0x10d5024; FDE=(17649578, 17649759)
     10d4feb:	45 31 ff             	xor    r15d,r15d
     10d4fee:	4c 89 ff             	mov    rdi,r15
     10d4ff1:	e8 90 94 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d4ff6:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     10d4ffa:	48 85 ff             	test   rdi,rdi
     10d4ffd:	74 30                	je     10d502f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c445>
     10d4fff:	e8 3c 91 71 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
     10d5004:	48 85 c0             	test   rax,rax
     10d5007:	74 26                	je     10d502f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c445>
     10d5009:	49 89 c7             	mov    r15,rax
     10d500c:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     10d5010:	48 85 c0             	test   rax,rax
     10d5013:	74 1d                	je     10d5032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c448>
     10d5015:	f6 43 0c 01          	test   BYTE PTR [rbx+0xc],0x1
     10d5019:	74 17                	je     10d5032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c448>
     10d501b:	8b 0b                	mov    ecx,DWORD PTR [rbx]
     10d501d:	ff c9                	dec    ecx
     10d501f:	83 f9 fd             	cmp    ecx,0xfffffffd
     10d5022:	77 0e                	ja     10d5032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c448>
     10d5024:	48 8b 78 40          	mov    rdi,QWORD PTR [rax+0x40]
     10d5028:	e8 ab b7 00 00       	call   10e07d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a7bee>
     10d502d:	eb 03                	jmp    10d5032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c448>
     10d502f:	45 31 ff             	xor    r15d,r15d
     10d5032:	4c 89 ff             	mov    rdi,r15
     10d5035:	5b                   	pop    rbx
     10d5036:	41 5e                	pop    r14
     10d5038:	41 5f                	pop    r15
     10d503a:	e9 47 94 9c ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d503f:	48 89 c3             	mov    rbx,rax
     10d5042:	4c 89 ff             	mov    rdi,r15
     10d5045:	e8 3c 94 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x110028c -> 0x1100291; FDE=(17824772, 17827357)
     1100261:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1100266:	e8 7d b3 97 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     110026b:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1100270:	4c 8b 60 08          	mov    r12,QWORD PTR [rax+0x8]
     1100274:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
     1100278:	41 f6 44 24 10 01    	test   BYTE PTR [r12+0x10],0x1
     110027e:	74 07                	je     1100287 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c769d>
     1100280:	49 8b 54 24 20       	mov    rdx,QWORD PTR [r12+0x20]
     1100285:	eb 05                	jmp    110028c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c76a2>
     1100287:	49 8d 54 24 11       	lea    rdx,[r12+0x11]
     110028c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1100291:	48 8b 40 40          	mov    rax,QWORD PTR [rax+0x40]
     1100295:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     110029a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     110029d:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     11002a2:	ff 50 40             	call   QWORD PTR [rax+0x40]
     11002a5:	4c 8b 74 24 70       	mov    r14,QWORD PTR [rsp+0x70]
     11002aa:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     11002af:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     11002b3:	49 39 c6             	cmp    r14,rax
     11002b6:	0f 84 b1 01 00 00    	je     110046d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7883>
     11002bc:	49 8d 44 24 48       	lea    rax,[r12+0x48]
     11002c1:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11002c6:	45 31 ff             	xor    r15d,r15d
     11002c9:	41 8b 44 24 28       	mov    eax,DWORD PTR [r12+0x28]
     11002ce:	85 c0                	test   eax,eax
     11002d0:	7e 09                	jle    11002db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c76f1>
     11002d2:	41 39 c7             	cmp    r15d,eax
     11002d5:	0f 8d 5b 01 00 00    	jge    1100436 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c784c>
     11002db:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     11002de:	48 85 f6             	test   rsi,rsi

### 0x1136416 -> 0x113641f; FDE=(18046836, 18051122)
     11363eb:	48 39 cd             	cmp    rbp,rcx
     11363ee:	0f 82 ac fd ff ff    	jb     11361a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd5b6>
     11363f4:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     11363fb:	00 
     11363fc:	e8 8f 7a 6b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1136401:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     1136408:	00 
     1136409:	e8 82 7a 6b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     113640e:	85 ed                	test   ebp,ebp
     1136410:	0f 88 95 01 00 00    	js     11365ab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd9c1>
     1136416:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     113641b:	48 8b 68 38          	mov    rbp,QWORD PTR [rax+0x38]
     113641f:	4c 8b 70 40          	mov    r14,QWORD PTR [rax+0x40]
     1136423:	4c 39 f5             	cmp    rbp,r14
     1136426:	0f 84 31 01 00 00    	je     113655d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd973>
     113642c:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
     1136431:	0f 57 c0             	xorps  xmm0,xmm0
     1136434:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1136439:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
     113643f:	0f b6 55 00          	movzx  edx,BYTE PTR [rbp+0x0]
     1136443:	89 d1                	mov    ecx,edx
     1136445:	d1 e9                	shr    ecx,1
     1136447:	0f b6 44 24 70       	movzx  eax,BYTE PTR [rsp+0x70]
     113644c:	4c 8d 6d 01          	lea    r13,[rbp+0x1]
     1136450:	f6 c2 01             	test   dl,0x1
     1136453:	48 0f 45 4d 08       	cmovne rcx,QWORD PTR [rbp+0x8]
     1136458:	48 8b 55 10          	mov    rdx,QWORD PTR [rbp+0x10]
     113645c:	49 0f 44 d5          	cmove  rdx,r13
     1136460:	a8 01                	test   al,0x1
     1136462:	74 0f                	je     1136473 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd889>
     1136464:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]

### 0x1175dd8 -> 0x1175df6; FDE=(18308473, 18308959)
     1175db0:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     1175db5:	48 89 ca             	mov    rdx,rcx
     1175db8:	e8 b5 09 00 00       	call   1176772 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33db88>
     1175dbd:	4c 8b 2b             	mov    r13,QWORD PTR [rbx]
     1175dc0:	4c 89 ef             	mov    rdi,r13
     1175dc3:	e8 be 3e 4b 00       	call   1629c86 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24df4>
     1175dc8:	41 8a 45 30          	mov    al,BYTE PTR [r13+0x30]
     1175dcc:	88 44 24 0f          	mov    BYTE PTR [rsp+0xf],al
     1175dd0:	84 c0                	test   al,al
     1175dd2:	0f 84 11 01 00 00    	je     1175ee9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d2ff>
     1175dd8:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1175ddd:	48 83 c0 28          	add    rax,0x28
     1175de1:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     1175de6:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
     1175deb:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
     1175def:	48 8b 78 30          	mov    rdi,QWORD PTR [rax+0x30]
     1175df3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1175df6:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1175df9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1175dfe:	48 01 c2             	add    rdx,rax
     1175e01:	48 89 54 24 48       	mov    QWORD PTR [rsp+0x48],rdx
     1175e06:	c6 44 24 58 00       	mov    BYTE PTR [rsp+0x58],0x0
     1175e0b:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     1175e10:	8b 09                	mov    ecx,DWORD PTR [rcx]
     1175e12:	48 01 c1             	add    rcx,rax
     1175e15:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1175e1a:	48 89 df             	mov    rdi,rbx
     1175e1d:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
     1175e22:	4c 89 e6             	mov    rsi,r12
     1175e25:	e8 48 ce 50 00       	call   1682c72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dde>
     1175e2a:	48 89 c5             	mov    rbp,rax

### 0x1175ea2 -> 0x1175eab; FDE=(18308473, 18308959)
     1175e7e:	48 89 de             	mov    rsi,rbx
     1175e81:	e8 56 ff 51 00       	call   1695ddc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49f48>
     1175e86:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1175e8a:	4c 89 e7             	mov    rdi,r12
     1175e8d:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1175e90:	eb c7                	jmp    1175e59 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d26f>
     1175e92:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     1175e97:	48 89 ee             	mov    rsi,rbp
     1175e9a:	4c 89 f2             	mov    rdx,r14
     1175e9d:	e8 7c 08 00 00       	call   117671e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33db34>
     1175ea2:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     1175ea7:	4c 8b 46 38          	mov    r8,QWORD PTR [rsi+0x38]
     1175eab:	4c 8b 4e 40          	mov    r9,QWORD PTR [rsi+0x40]
     1175eaf:	4d 29 c1             	sub    r9,r8
     1175eb2:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
     1175eb6:	48 89 df             	mov    rdi,rbx
     1175eb9:	31 d2                	xor    edx,edx
     1175ebb:	31 c9                	xor    ecx,ecx
     1175ebd:	e8 7e e1 50 00       	call   1684040 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x381ac>
     1175ec2:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     1175ec7:	e8 20 08 94 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     1175ecc:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1175ed0:	4c 89 e7             	mov    rdi,r12
     1175ed3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1175ed6:	4c 89 ef             	mov    rdi,r13
     1175ed9:	e8 16 ab 50 00       	call   16809f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b60>
     1175ede:	41 80 7d 30 00       	cmp    BYTE PTR [r13+0x30],0x0
     1175ee3:	0f 85 02 ff ff ff    	jne    1175deb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d201>
     1175ee9:	80 7c 24 0f 00       	cmp    BYTE PTR [rsp+0xf],0x0
     1175eee:	0f 95 c3             	setne  bl
     1175ef1:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]

### 0x1187389 -> 0x118738e; FDE=(18379360, 18379859)
     1187363:	49 83 c4 08          	add    r12,0x8
     1187367:	4c 39 64 24 08       	cmp    QWORD PTR [rsp+0x8],r12
     118736c:	0f 85 7a ff ff ff    	jne    11872ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e702>
     1187372:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     1187377:	6a 01                	push   0x1
     1187379:	5d                   	pop    rbp
     118737a:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     118737f:	48 89 df             	mov    rdi,rbx
     1187382:	89 ea                	mov    edx,ebp
     1187384:	e8 57 cf 4d 00       	call   16642e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844c>
     1187389:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     118738e:	49 8b 76 40          	mov    rsi,QWORD PTR [r14+0x40]
     1187392:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1187396:	48 89 df             	mov    rdi,rbx
     1187399:	89 ea                	mov    edx,ebp
     118739b:	e8 40 cf 4d 00       	call   16642e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844c>
     11873a0:	49 8b 76 50          	mov    rsi,QWORD PTR [r14+0x50]
     11873a4:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     11873a8:	48 89 df             	mov    rdi,rbx
     11873ab:	89 ea                	mov    edx,ebp
     11873ad:	e8 2e cf 4d 00       	call   16642e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844c>
     11873b2:	48 8d 05 f8 2e 25 ff 	lea    rax,[rip+0xffffffffff252ef8]        # 3da2b1 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4e96>
     11873b9:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
     11873c0:	c7 83 b4 00 00 00 01 	mov    DWORD PTR [rbx+0xb4],0x1
     11873c7:	00 00 00 
     11873ca:	48 89 df             	mov    rdi,rbx
     11873cd:	e8 88 cf 4d 00       	call   166435a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184c6>
     11873d2:	85 c0                	test   eax,eax
     11873d4:	0f 9f c3             	setg   bl
     11873d7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     11873dc:	e8 af 6a 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x1198163 -> 0x1198174; FDE=(18448726, 18448777)
     119813f:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     1198146:	00 
     1198147:	75 08                	jne    1198151 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f567>
     1198149:	48 89 df             	mov    rdi,rbx
     119814c:	e8 7f 7b 8d ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1198151:	e8 5a 79 65 00       	call   17efab0 <__stack_chk_fail@plt>
     1198156:	48 89 f8             	mov    rax,rdi
     1198159:	48 83 c0 58          	add    rax,0x58
     119815d:	83 7e 1c 0a          	cmp    DWORD PTR [rsi+0x1c],0xa
     1198161:	75 06                	jne    1198169 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f57f>
     1198163:	48 8b 76 10          	mov    rsi,QWORD PTR [rsi+0x10]
     1198167:	eb 07                	jmp    1198170 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f586>
     1198169:	48 8d 35 f0 6c 77 00 	lea    rsi,[rip+0x776cf0]        # 190ee60 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x56270>
     1198170:	4c 8b 4e 20          	mov    r9,QWORD PTR [rsi+0x20]
     1198174:	4c 8b 46 40          	mov    r8,QWORD PTR [rsi+0x40]
     1198178:	48 89 d7             	mov    rdi,rdx
     119817b:	48 89 ce             	mov    rsi,rcx
     119817e:	48 89 c2             	mov    rdx,rax
     1198181:	4c 89 c9             	mov    rcx,r9
     1198184:	e9 8b 0c 00 00       	jmp    1198e14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36022a>
     1198189:	cc                   	int3
     119818a:	55                   	push   rbp
     119818b:	41 57                	push   r15
     119818d:	41 56                	push   r14
     119818f:	41 55                	push   r13
     1198191:	41 54                	push   r12
     1198193:	53                   	push   rbx
     1198194:	48 81 ec 28 02 00 00 	sub    rsp,0x228
     119819b:	49 89 cf             	mov    r15,rcx
     119819e:	49 89 f6             	mov    r14,rsi
     11981a1:	48 89 fb             	mov    rbx,rdi

### 0x11d2511 -> 0x11d2516; FDE=(18685894, 18687767)
     11d24e4:	48 c1 e0 20          	shl    rax,0x20
     11d24e8:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     11d24ed:	48 01 c8             	add    rax,rcx
     11d24f0:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
     11d24f5:	0f 57 c0             	xorps  xmm0,xmm0
     11d24f8:	49 83 64 24 38 00    	and    QWORD PTR [r12+0x38],0x0
     11d24fe:	41 0f 11 44 24 28    	movups XMMWORD PTR [r12+0x28],xmm0
     11d2504:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     11d2509:	4d 89 74 24 10       	mov    QWORD PTR [r12+0x10],r14
     11d250e:	4c 89 23             	mov    QWORD PTR [rbx],r12
     11d2511:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     11d2516:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     11d251a:	48 8b 00             	mov    rax,QWORD PTR [rax]
     11d251d:	4c 89 e6             	mov    rsi,r12
     11d2520:	48 85 c0             	test   rax,rax
     11d2523:	74 07                	je     11d252c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ab0>
     11d2525:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
     11d2529:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     11d252c:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     11d2530:	e8 e9 7a 8d ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
     11d2535:	49 ff 46 50          	inc    QWORD PTR [r14+0x50]
     11d2539:	4c 8b ac 24 f0 00 00 	mov    r13,QWORD PTR [rsp+0xf0]
     11d2540:	00 
     11d2541:	48 8d 9c 24 f8 00 00 	lea    rbx,[rsp+0xf8]
     11d2548:	00 
     11d2549:	49 8d 7c 24 28       	lea    rdi,[r12+0x28]
     11d254e:	48 83 63 f8 00       	and    QWORD PTR [rbx-0x8],0x0
     11d2553:	4c 89 ee             	mov    rsi,r13
     11d2556:	e8 35 dc 00 00       	call   11e0190 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25714>
     11d255b:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
     11d255e:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0

### 0x12127c3 -> 0x12127d2; FDE=(18949088, 18958079)
     121279e:	4c 39 fb             	cmp    rbx,r15
     12127a1:	74 12                	je     12127b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57d39>
     12127a3:	48 83 c3 18          	add    rbx,0x18
     12127a7:	48 89 ef             	mov    rdi,rbp
     12127aa:	49 89 de             	mov    r14,rbx
     12127ad:	4c 89 f6             	mov    rsi,r14
     12127b0:	e8 cb b8 5d 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     12127b5:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     12127ba:	80 b8 80 06 00 00 00 	cmp    BYTE PTR [rax+0x680],0x0
     12127c1:	74 12                	je     12127d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57d59>
     12127c3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12127c8:	48 8b b8 88 00 00 00 	mov    rdi,QWORD PTR [rax+0x88]
     12127cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12127d2:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12127d5:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     12127da:	80 b8 f0 06 00 00 00 	cmp    BYTE PTR [rax+0x6f0],0x0
     12127e1:	74 38                	je     121281b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57d9f>
     12127e3:	48 8b 98 88 06 00 00 	mov    rbx,QWORD PTR [rax+0x688]
     12127ea:	4c 8b b0 90 06 00 00 	mov    r14,QWORD PTR [rax+0x690]
     12127f1:	4c 39 f3             	cmp    rbx,r14
     12127f4:	74 25                	je     121281b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57d9f>
     12127f6:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     12127fa:	48 89 ee             	mov    rsi,rbp
     12127fd:	e8 ec ce 88 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1212802:	84 c0                	test   al,al
     1212804:	75 09                	jne    121280f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57d93>
     1212806:	48 81 c3 d0 02 00 00 	add    rbx,0x2d0
     121280d:	eb e2                	jmp    12127f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57d75>
     121280f:	4c 39 f3             	cmp    rbx,r14
     1212812:	74 07                	je     121281b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57d9f>
     1212814:	c6 83 c7 02 00 00 01 	mov    BYTE PTR [rbx+0x2c7],0x1

### 0x1212997 -> 0x12129ab; FDE=(18949088, 18958079)
     1212970:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1212973:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1212976:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     121297d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1212980:	4c 89 f6             	mov    rsi,r14
     1212983:	ff 50 20             	call   QWORD PTR [rax+0x20]
     1212986:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
     121298d:	4c 89 f6             	mov    rsi,r14
     1212990:	31 d2                	xor    edx,edx
     1212992:	e8 11 42 05 00       	call   1266ba8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac12c>
     1212997:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     121299c:	48 8b b8 90 00 00 00 	mov    rdi,QWORD PTR [rax+0x90]
     12129a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12129a6:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     12129ab:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12129ae:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     12129b3:	48 8b bb 60 01 00 00 	mov    rdi,QWORD PTR [rbx+0x160]
     12129ba:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12129bd:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     12129c2:	4c 89 f6             	mov    rsi,r14
     12129c5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12129c8:	bf e0 00 00 00       	mov    edi,0xe0
     12129cd:	48 03 bb 78 01 00 00 	add    rdi,QWORD PTR [rbx+0x178]
     12129d4:	4c 89 f6             	mov    rsi,r14
     12129d7:	e8 5e f9 8e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     12129dc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     12129e3:	00 
     12129e4:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     12129e9:	e8 52 b5 5d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12129ee:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     12129f3:	49 8b bf 68 01 00 00 	mov    rdi,QWORD PTR [r15+0x168]

### 0x12b15a3 -> 0x12b15b3; FDE=(19599540, 19603563)
     12b157e:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     12b1582:	49 2b 45 00          	sub    rax,QWORD PTR [r13+0x0]
     12b1586:	48 99                	cqo
     12b1588:	49 f7 fc             	idiv   r12
     12b158b:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     12b1592:	00 
     12b1593:	48 89 c2             	mov    rdx,rax
     12b1596:	e8 e7 35 b2 ff       	call   dd4b82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa1c08>
     12b159b:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
     12b15a2:	00 
     12b15a3:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     12b15a8:	0f 57 c0             	xorps  xmm0,xmm0
     12b15ab:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     12b15af:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     12b15b3:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
     12b15b8:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     12b15bc:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     12b15bf:	48 83 c0 48          	add    rax,0x48
     12b15c3:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
     12b15c8:	4c 89 ef             	mov    rdi,r13
     12b15cb:	4c 89 e6             	mov    rsi,r12
     12b15ce:	e8 13 7b bd ff       	call   e890e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x504fc>
     12b15d3:	4c 89 e7             	mov    rdi,r12
     12b15d6:	e8 9f 7b bd ff       	call   e8917a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50590>
     12b15db:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     12b15df:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     12b15e4:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
     12b15e8:	48 85 c0             	test   rax,rax
     12b15eb:	48 0f 44 c5          	cmove  rax,rbp
     12b15ef:	48 8b 70 30          	mov    rsi,QWORD PTR [rax+0x30]
     12b15f3:	48 85 f6             	test   rsi,rsi

### 0x12b6441 -> 0x12b645e; FDE=(19620160, 19621941)
     12b6419:	f6 c2 01             	test   dl,0x1
     12b641c:	48 8d 4c ca ff       	lea    rcx,[rdx+rcx*8-0x1]
     12b6421:	48 0f 44 c8          	cmove  rcx,rax
     12b6425:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     12b6428:	e8 ad 9c ff ff       	call   12b00da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf565e>
     12b642d:	8b 6c 24 0c          	mov    ebp,DWORD PTR [rsp+0xc]
     12b6431:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     12b6438:	00 
     12b6439:	48 89 c7             	mov    rdi,rax
     12b643c:	e8 11 d4 e5 ff       	call   1113852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dac68>
     12b6441:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12b6446:	80 78 50 00          	cmp    BYTE PTR [rax+0x50],0x0
     12b644a:	0f 84 ad 00 00 00    	je     12b64fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfba81>
     12b6450:	83 bc 24 c8 00 00 00 	cmp    DWORD PTR [rsp+0xc8],0x0
     12b6457:	00 
     12b6458:	0f 84 9f 00 00 00    	je     12b64fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfba81>
     12b645e:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     12b6462:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12b6465:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
     12b646a:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     12b6471:	00 
     12b6472:	4c 89 ff             	mov    rdi,r15
     12b6475:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12b6478:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     12b647d:	48 8d b4 24 28 01 00 	lea    rsi,[rsp+0x128]
     12b6484:	00 
     12b6485:	e8 e0 9b d9 ff       	call   105006a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x217480>
     12b648a:	49 83 3f 00          	cmp    QWORD PTR [r15],0x0
     12b648e:	0f 84 d0 00 00 00    	je     12b6564 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfbae8>
     12b6494:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     12b6499:	e8 76 9b d9 ff       	call   1050014 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21742a>

### 0x12cf9c9 -> 0x12cf9e3; FDE=(19723456, 19728531)
     12cf9a7:	00 
     12cf9a8:	48 8d 84 24 98 00 00 	lea    rax,[rsp+0x98]
     12cf9af:	00 
     12cf9b0:	83 60 0f 00          	and    DWORD PTR [rax+0xf],0x0
     12cf9b4:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
     12cf9b9:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     12cf9c0:	00 
     12cf9c1:	6a 01                	push   0x1
     12cf9c3:	5e                   	pop    rsi
     12cf9c4:	e8 38 d7 07 00       	call   134d101 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x192685>
     12cf9c9:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
     12cf9cd:	48 8b b8 98 00 00 00 	mov    rdi,QWORD PTR [rax+0x98]
     12cf9d4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12cf9d7:	ff 50 50             	call   QWORD PTR [rax+0x50]
     12cf9da:	49 89 c4             	mov    r12,rax
     12cf9dd:	49 8b 06             	mov    rax,QWORD PTR [r14]
     12cf9e0:	4c 89 f7             	mov    rdi,r14
     12cf9e3:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12cf9e6:	83 78 38 00          	cmp    DWORD PTR [rax+0x38],0x0
     12cf9ea:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     12cf9ef:	74 25                	je     12cfa16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x114f9a>
     12cf9f1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     12cf9f4:	4c 89 f7             	mov    rdi,r14
     12cf9f7:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12cf9fa:	8b 40 38             	mov    eax,DWORD PTR [rax+0x38]
     12cf9fd:	89 84 24 a0 02 00 00 	mov    DWORD PTR [rsp+0x2a0],eax
     12cfa04:	48 8d bc 24 68 02 00 	lea    rdi,[rsp+0x268]
     12cfa0b:	00 
     12cfa0c:	4c 89 fe             	mov    rsi,r15
     12cfa0f:	e8 d8 6d e3 ff       	call   11067ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cdc02>
     12cfa14:	ff 00                	inc    DWORD PTR [rax]

### 0x12d28c7 -> 0x12d28ed; FDE=(19729348, 19740878)
     12d2894:	e8 4d 2f 49 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     12d2899:	48 89 df             	mov    rdi,rbx
     12d289c:	e8 ef b5 51 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12d28a1:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     12d28a5:	41 83 bc 24 80 01 00 	cmp    DWORD PTR [r12+0x180],0x0
     12d28ac:	00 00 
     12d28ae:	0f 8e 9e 01 00 00    	jle    12d2a52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117fd6>
     12d28b4:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     12d28b9:	4c 8b b0 98 00 00 00 	mov    r14,QWORD PTR [rax+0x98]
     12d28c0:	44 8a b8 b3 01 00 00 	mov    r15b,BYTE PTR [rax+0x1b3]
     12d28c7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d28cc:	48 8d 48 48          	lea    rcx,[rax+0x48]
     12d28d0:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
     12d28d5:	83 78 50 00          	cmp    DWORD PTR [rax+0x50],0x0
     12d28d9:	7e 0a                	jle    12d28e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117e69>
     12d28db:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     12d28e0:	e8 01 e0 7e ff       	call   ac08e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd886>
     12d28e5:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12d28ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d28ed:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12d28f0:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
     12d28f7:	00 
     12d28f8:	48 89 c6             	mov    rsi,rax
     12d28fb:	e8 66 75 3f 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     12d2900:	8b 94 24 88 03 00 00 	mov    edx,DWORD PTR [rsp+0x388]
     12d2907:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     12d290b:	48 8b b8 28 06 00 00 	mov    rdi,QWORD PTR [rax+0x628]
     12d2912:	48 8b b0 30 06 00 00 	mov    rsi,QWORD PTR [rax+0x630]
     12d2919:	e8 dc fb 97 ff       	call   c524fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f49a>
     12d291e:	48 85 c0             	test   rax,rax
     12d2921:	0f 84 1a 01 00 00    	je     12d2a41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117fc5>

### 0x12d2fbd -> 0x12d2fe0; FDE=(19729348, 19740878)
     12d2f94:	48 8d 9c 24 00 03 00 	lea    rbx,[rsp+0x300]
     12d2f9b:	00 
     12d2f9c:	48 89 de             	mov    rsi,rbx
     12d2f9f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d2fa2:	48 89 df             	mov    rdi,rbx
     12d2fa5:	e8 f4 d0 af ff       	call   dd009e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d124>
     12d2faa:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     12d2fae:	41 80 bc 24 21 06 00 	cmp    BYTE PTR [r12+0x621],0x0
     12d2fb5:	00 00 
     12d2fb7:	0f 84 c2 00 00 00    	je     12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
     12d2fbd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2fc2:	80 b8 f5 00 00 00 00 	cmp    BYTE PTR [rax+0xf5],0x0
     12d2fc9:	0f 85 b0 00 00 00    	jne    12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
     12d2fcf:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     12d2fd4:	48 8b 58 60          	mov    rbx,QWORD PTR [rax+0x60]
     12d2fd8:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12d2fdd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d2fe0:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12d2fe3:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
     12d2fe6:	48 89 df             	mov    rdi,rbx
     12d2fe9:	48 89 c6             	mov    rsi,rax
     12d2fec:	48 8d 15 45 29 72 00 	lea    rdx,[rip+0x722945]        # 19f5938 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x39f7>
     12d2ff3:	ff 51 50             	call   QWORD PTR [rcx+0x50]
     12d2ff6:	84 c0                	test   al,al
     12d2ff8:	74 1e                	je     12d3018 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11859c>
     12d2ffa:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2fff:	c6 80 f5 00 00 00 01 	mov    BYTE PTR [rax+0xf5],0x1
     12d3006:	80 48 12 10          	or     BYTE PTR [rax+0x12],0x10
     12d300a:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     12d300e:	4c 8d b4 24 50 03 00 	lea    r14,[rsp+0x350]
     12d3015:	00 

### 0x12d2fcf -> 0x12d2fe0; FDE=(19729348, 19740878)
     12d2f9f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d2fa2:	48 89 df             	mov    rdi,rbx
     12d2fa5:	e8 f4 d0 af ff       	call   dd009e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d124>
     12d2faa:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     12d2fae:	41 80 bc 24 21 06 00 	cmp    BYTE PTR [r12+0x621],0x0
     12d2fb5:	00 00 
     12d2fb7:	0f 84 c2 00 00 00    	je     12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
     12d2fbd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2fc2:	80 b8 f5 00 00 00 00 	cmp    BYTE PTR [rax+0xf5],0x0
     12d2fc9:	0f 85 b0 00 00 00    	jne    12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
     12d2fcf:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     12d2fd4:	48 8b 58 60          	mov    rbx,QWORD PTR [rax+0x60]
     12d2fd8:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12d2fdd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d2fe0:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12d2fe3:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
     12d2fe6:	48 89 df             	mov    rdi,rbx
     12d2fe9:	48 89 c6             	mov    rsi,rax
     12d2fec:	48 8d 15 45 29 72 00 	lea    rdx,[rip+0x722945]        # 19f5938 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x39f7>
     12d2ff3:	ff 51 50             	call   QWORD PTR [rcx+0x50]
     12d2ff6:	84 c0                	test   al,al
     12d2ff8:	74 1e                	je     12d3018 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11859c>
     12d2ffa:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2fff:	c6 80 f5 00 00 00 01 	mov    BYTE PTR [rax+0xf5],0x1
     12d3006:	80 48 12 10          	or     BYTE PTR [rax+0x12],0x10
     12d300a:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     12d300e:	4c 8d b4 24 50 03 00 	lea    r14,[rsp+0x350]
     12d3015:	00 
     12d3016:	eb 67                	jmp    12d307f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x118603>
     12d3018:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d301d:	80 b8 f5 00 00 00 00 	cmp    BYTE PTR [rax+0xf5],0x0

### 0x12d5ee8 -> 0x12d5f09; FDE=(19749732, 19751188)
     12d5eb7:	48 89 6a 08          	mov    QWORD PTR [rdx+0x8],rbp
     12d5ebb:	48 8d 0d 82 7d 80 ff 	lea    rcx,[rip+0xffffffffff807d82]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
     12d5ec2:	48 89 4a 10          	mov    QWORD PTR [rdx+0x10],rcx
     12d5ec6:	48 8d 0d 21 0d 00 00 	lea    rcx,[rip+0xd21]        # 12d6bee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11c172>
     12d5ecd:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
     12d5ed1:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     12d5ed6:	48 89 c6             	mov    rsi,rax
     12d5ed9:	e8 8c 8e 93 ff       	call   c0ed6a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15bd0a>
     12d5ede:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     12d5ee3:	e8 58 8f 93 ff       	call   c0ee40 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15bde0>
     12d5ee8:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
     12d5eec:	48 8b 98 88 02 00 00 	mov    rbx,QWORD PTR [rax+0x288]
     12d5ef3:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0
     12d5ef8:	0f 84 9f 01 00 00    	je     12d609d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11b621>
     12d5efe:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     12d5f02:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     12d5f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12d5f09:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12d5f0c:	48 89 df             	mov    rdi,rbx
     12d5f0f:	48 89 c6             	mov    rsi,rax
     12d5f12:	e8 29 03 cb ff       	call   f86240 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d656>
     12d5f17:	84 c0                	test   al,al
     12d5f19:	0f 84 7e 01 00 00    	je     12d609d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11b621>
     12d5f1f:	48 8b 85 28 01 00 00 	mov    rax,QWORD PTR [rbp+0x128]
     12d5f26:	48 85 c0             	test   rax,rax
     12d5f29:	48 8d 0d 18 80 6f 00 	lea    rcx,[rip+0x6f8018]        # 19cdf48 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x96b90>
     12d5f30:	48 0f 45 c8          	cmovne rcx,rax
     12d5f34:	80 79 30 00          	cmp    BYTE PTR [rcx+0x30],0x0
     12d5f38:	0f 84 5f 01 00 00    	je     12d609d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11b621>
     12d5f3e:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     12d5f42:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]

### 0x12dee0e -> 0x12dee23; FDE=(19781534, 19789354)
     12dede6:	48 89 d0             	mov    rax,rdx
     12dede9:	48 39 d8             	cmp    rax,rbx
     12dedec:	0f 85 5a ff ff ff    	jne    12ded4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1242d0>
     12dedf2:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
     12dedf6:	4d 85 ed             	test   r13,r13
     12dedf9:	75 ba                	jne    12dedb5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124339>
     12dedfb:	e9 4c ff ff ff       	jmp    12ded4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1242d0>
     12dee00:	41 80 bd c8 00 00 00 	cmp    BYTE PTR [r13+0xc8],0x0
     12dee07:	00 
     12dee08:	0f 84 3e ff ff ff    	je     12ded4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1242d0>
     12dee0e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12dee13:	4c 8b 70 70          	mov    r14,QWORD PTR [rax+0x70]
     12dee17:	4c 8b 60 78          	mov    r12,QWORD PTR [rax+0x78]
     12dee1b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     12dee20:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12dee23:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12dee26:	4d 85 e4             	test   r12,r12
     12dee29:	74 75                	je     12deea0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124424>
     12dee2b:	49 89 c7             	mov    r15,rax
     12dee2e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     12dee32:	4c 89 e7             	mov    rdi,r12
     12dee35:	4c 89 fe             	mov    rsi,r15
     12dee38:	ff 50 50             	call   QWORD PTR [rax+0x50]
     12dee3b:	48 b9 00 00 00 00 ff 	movabs rcx,0xff00000000
     12dee42:	00 00 00 
     12dee45:	48 85 c8             	test   rax,rcx
     12dee48:	74 56                	je     12deea0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124424>
     12dee4a:	0f b6 c0             	movzx  eax,al
     12dee4d:	83 f8 01             	cmp    eax,0x1
     12dee50:	75 4e                	jne    12deea0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124424>
     12dee52:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]

### 0x12e416a -> 0x12e4184; FDE=(19808618, 19808626)
     12e414d:	cc                   	int3
     12e414e:	53                   	push   rbx
     12e414f:	48 89 fb             	mov    rbx,rdi
     12e4152:	e8 e3 ff ff ff       	call   12e413a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1296be>
     12e4157:	48 89 df             	mov    rdi,rbx
     12e415a:	5b                   	pop    rbx
     12e415b:	e9 c0 9d 50 00       	jmp    17edf20 <_ZdlPv@plt>
     12e4160:	48 83 c7 08          	add    rdi,0x8
     12e4164:	e9 a5 9c 4c 00       	jmp    17ade0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161f7a>
     12e4169:	cc                   	int3
     12e416a:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     12e416e:	01 70 0c             	add    DWORD PTR [rax+0xc],esi
     12e4171:	c3                   	ret
     12e4172:	48 83 c7 08          	add    rdi,0x8
     12e4176:	e9 47 9d 4c 00       	jmp    17adec2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16202e>
     12e417b:	cc                   	int3
     12e417c:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     12e4180:	48 83 c7 08          	add    rdi,0x8
     12e4184:	ff 60 40             	jmp    QWORD PTR [rax+0x40]
     12e4187:	cc                   	int3
     12e4188:	0f 18 0d d1 49 63 00 	prefetcht0 BYTE PTR [rip+0x6349d1]        # 1918b60 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5ff70>
     12e418f:	48 8d 05 ca 49 63 00 	lea    rax,[rip+0x6349ca]        # 1918b60 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5ff70>
     12e4196:	48 8b 0d cb 49 63 00 	mov    rcx,QWORD PTR [rip+0x6349cb]        # 1918b68 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5ff78>
     12e419d:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     12e41a0:	c3                   	ret
     12e41a1:	cc                   	int3
     12e41a2:	48 89 f0             	mov    rax,rsi
     12e41a5:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     12e41a9:	48 8d 0d 28 ed 57 00 	lea    rcx,[rip+0x57ed28]        # 1862ed8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f5c0>
     12e41b0:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     12e41b3:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### 0x12fd844 -> 0x12fd84c; FDE=(19912772, 19912796)
     12fd828:	75 0b                	jne    12fd835 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x142db9>
     12fd82a:	48 89 d8             	mov    rax,rbx
     12fd82d:	48 83 c4 28          	add    rsp,0x28
     12fd831:	5b                   	pop    rbx
     12fd832:	41 5e                	pop    r14
     12fd834:	c3                   	ret
     12fd835:	e8 76 22 4f 00       	call   17efab0 <__stack_chk_fail@plt>
     12fd83a:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     12fd83e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12fd841:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
     12fd844:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     12fd848:	48 8b 48 38          	mov    rcx,QWORD PTR [rax+0x38]
     12fd84c:	48 3b 48 40          	cmp    rcx,QWORD PTR [rax+0x40]
     12fd850:	48 8d 05 99 ec 0d ff 	lea    rax,[rip+0xffffffffff0dec99]        # 3dc4f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1f3f>
     12fd857:	48 0f 45 c1          	cmovne rax,rcx
     12fd85b:	c3                   	ret
     12fd85c:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     12fd860:	48 8b 48 20          	mov    rcx,QWORD PTR [rax+0x20]
     12fd864:	48 3b 48 28          	cmp    rcx,QWORD PTR [rax+0x28]
     12fd868:	48 8d 05 81 ec 0d ff 	lea    rax,[rip+0xffffffffff0dec81]        # 3dc4f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1f3f>
     12fd86f:	48 0f 45 c1          	cmovne rax,rcx
     12fd873:	c3                   	ret
     12fd874:	41 57                	push   r15
     12fd876:	41 56                	push   r14
     12fd878:	53                   	push   rbx
     12fd879:	48 81 ec d0 00 00 00 	sub    rsp,0xd0
     12fd880:	49 89 f6             	mov    r14,rsi
     12fd883:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12fd88a:	00 00 
     12fd88c:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     12fd893:	00 

### 0x12fdd9d -> 0x12fddb8; FDE=(19914096, 19914658)
     12fdd78:	53                   	push   rbx
     12fdd79:	48 83 ec 40          	sub    rsp,0x40
     12fdd7d:	49 89 f6             	mov    r14,rsi
     12fdd80:	48 89 fb             	mov    rbx,rdi
     12fdd83:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12fdd8a:	00 00 
     12fdd8c:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     12fdd91:	ba e8 00 00 00       	mov    edx,0xe8
     12fdd96:	31 f6                	xor    esi,esi
     12fdd98:	e8 f3 0d 4f 00       	call   17eeb90 <memset@plt>
     12fdd9d:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     12fdda1:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
     12fdda5:	4c 8b 60 38          	mov    r12,QWORD PTR [rax+0x38]
     12fdda9:	48 3b 70 28          	cmp    rsi,QWORD PTR [rax+0x28]
     12fddad:	4c 8d 3d 3c e7 0d ff 	lea    r15,[rip+0xffffffffff0de73c]        # 3dc4f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1f3f>
     12fddb4:	49 0f 44 f7          	cmove  rsi,r15
     12fddb8:	4c 8b 68 40          	mov    r13,QWORD PTR [rax+0x40]
     12fddbc:	48 89 df             	mov    rdi,rbx
     12fddbf:	e8 bc 02 4f 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     12fddc4:	4d 39 ec             	cmp    r12,r13
     12fddc7:	4d 0f 45 fc          	cmovne r15,r12
     12fddcb:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     12fddcf:	4c 89 fe             	mov    rsi,r15
     12fddd2:	e8 a9 02 4f 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     12fddd7:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     12fdddb:	48 83 c7 30          	add    rdi,0x30
     12fdddf:	48 8d 35 aa e7 13 ff 	lea    rsi,[rip+0xffffffffff13e7aa]        # 43c590 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x219c>
     12fdde6:	48 8d 15 03 e7 0d ff 	lea    rdx,[rip+0xffffffffff0de703]        # 3dc4f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1f3f>
     12fdded:	e8 ea b7 8d ff       	call   bd95dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12657c>
     12fddf2:	49 89 c7             	mov    r15,rax
     12fddf5:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]

### 0x1303814 -> 0x1303833; FDE=(19937174, 19938842)
     13037ec:	00 
     13037ed:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
     13037f1:	48 85 c9             	test   rcx,rcx
     13037f4:	48 8d 05 55 5e 6a 00 	lea    rax,[rip+0x6a5e55]        # 19a9650 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x72298>
     13037fb:	48 0f 45 c1          	cmovne rax,rcx
     13037ff:	8b 48 1c             	mov    ecx,DWORD PTR [rax+0x1c]
     1303802:	83 f9 02             	cmp    ecx,0x2
     1303805:	0f 84 60 01 00 00    	je     130396b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148eef>
     130380b:	83 f9 01             	cmp    ecx,0x1
     130380e:	0f 85 91 01 00 00    	jne    13039a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148f29>
     1303814:	4c 8b 60 10          	mov    r12,QWORD PTR [rax+0x10]
     1303818:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     130381d:	ba 98 00 00 00       	mov    edx,0x98
     1303822:	31 f6                	xor    esi,esi
     1303824:	e8 67 b3 4e 00       	call   17eeb90 <memset@plt>
     1303829:	41 8b 44 24 48       	mov    eax,DWORD PTR [r12+0x48]
     130382e:	83 f8 02             	cmp    eax,0x2
     1303831:	75 35                	jne    1303868 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148dec>
     1303833:	49 8b 74 24 40       	mov    rsi,QWORD PTR [r12+0x40]
     1303838:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     130383c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1303841:	e8 fa a6 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1303846:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     130384b:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
     1303850:	48 89 fe             	mov    rsi,rdi
     1303853:	48 89 da             	mov    rdx,rbx
     1303856:	e8 d3 0c 00 00       	call   130452e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x149ab2>
     130385b:	48 89 df             	mov    rdi,rbx
     130385e:	e8 2d a6 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1303863:	41 8b 44 24 48       	mov    eax,DWORD PTR [r12+0x48]
     1303868:	83 f8 01             	cmp    eax,0x1

### 0x131b61b -> 0x131b629; FDE=(20035026, 20035955)
     131b5f7:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     131b5fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131b5fe:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131b601:	8b 78 38             	mov    edi,DWORD PTR [rax+0x38]
     131b604:	e8 fc f0 ff ff       	call   131a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fc89>
     131b609:	89 c0                	mov    eax,eax
     131b60b:	48 8d 0d 42 c7 07 ff 	lea    rcx,[rip+0xffffffffff07c742]        # 397d54 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x4935>
     131b612:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
     131b616:	48 01 c8             	add    rax,rcx
     131b619:	ff e0                	jmp    rax
     131b61b:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     131b61f:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     131b622:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     131b626:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131b629:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131b62c:	4c 8d b4 24 b0 00 00 	lea    r14,[rsp+0xb0]
     131b633:	00 
     131b634:	4c 89 f7             	mov    rdi,r14
     131b637:	48 89 c6             	mov    rsi,rax
     131b63a:	e8 eb ee 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131b63f:	4c 89 ff             	mov    rdi,r15
     131b642:	4c 89 f6             	mov    rsi,r14
     131b645:	e8 18 f1 ff ff       	call   131a762 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fce6>
     131b64a:	49 89 c6             	mov    r14,rax
     131b64d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     131b654:	00 
     131b655:	e8 36 28 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131b65a:	4d 85 f6             	test   r14,r14
     131b65d:	74 18                	je     131b677 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x160bfb>
     131b65f:	4d 8b 76 38          	mov    r14,QWORD PTR [r14+0x38]
     131b663:	49 83 e6 fc          	and    r14,0xfffffffffffffffc

### 0x131b720 -> 0x131b72e; FDE=(20035026, 20035955)
     131b701:	00 00 
     131b703:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     131b70a:	00 
     131b70b:	0f 85 5d 02 00 00    	jne    131b96e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x160ef2>
     131b711:	48 81 c4 08 01 00 00 	add    rsp,0x108
     131b718:	5b                   	pop    rbx
     131b719:	41 5c                	pop    r12
     131b71b:	41 5e                	pop    r14
     131b71d:	41 5f                	pop    r15
     131b71f:	c3                   	ret
     131b720:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     131b724:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     131b727:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     131b72b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131b72e:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131b731:	4c 8d b4 24 b0 00 00 	lea    r14,[rsp+0xb0]
     131b738:	00 
     131b739:	4c 89 f7             	mov    rdi,r14
     131b73c:	48 89 c6             	mov    rsi,rax
     131b73f:	e8 e6 ed 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131b744:	4c 89 ff             	mov    rdi,r15
     131b747:	4c 89 f6             	mov    rsi,r14
     131b74a:	e8 0f 2c 00 00       	call   131e35e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1638e2>
     131b74f:	49 89 c6             	mov    r14,rax
     131b752:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     131b759:	00 
     131b75a:	e8 31 27 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131b75f:	4d 85 f6             	test   r14,r14
     131b762:	74 96                	je     131b6fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x160c7e>
     131b764:	49 8b b6 10 01 00 00 	mov    rsi,QWORD PTR [r14+0x110]
     131b76b:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc

### 0x131ba58 -> 0x131ba66; FDE=(20035956, 20036933)
     131ba2a:	48 8d 05 33 0a 76 ff 	lea    rax,[rip+0xffffffffff760a33]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     131ba31:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     131ba35:	48 8d 05 44 32 00 00 	lea    rax,[rip+0x3244]        # 131ec80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164204>
     131ba3c:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     131ba40:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131ba43:	ff 50 18             	call   QWORD PTR [rax+0x18]
     131ba46:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     131ba4d:	00 
     131ba4e:	e8 11 c6 a3 ff       	call   d58064 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250ea>
     131ba53:	e9 20 02 00 00       	jmp    131bc78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1611fc>
     131ba58:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     131ba5c:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     131ba5f:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     131ba63:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131ba66:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131ba69:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     131ba70:	00 
     131ba71:	4c 89 f7             	mov    rdi,r14
     131ba74:	48 89 c6             	mov    rsi,rax
     131ba77:	e8 ae ea 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131ba7c:	4c 89 ff             	mov    rdi,r15
     131ba7f:	4c 89 f6             	mov    rsi,r14
     131ba82:	e8 d7 28 00 00       	call   131e35e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1638e2>
     131ba87:	49 89 c6             	mov    r14,rax
     131ba8a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     131ba91:	00 
     131ba92:	e8 f9 23 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131ba97:	4d 85 f6             	test   r14,r14
     131ba9a:	0f 84 d8 01 00 00    	je     131bc78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1611fc>
     131baa0:	48 8d 05 81 b0 57 00 	lea    rax,[rip+0x57b081]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>
     131baa7:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### 0x131bdf5 -> 0x131be03; FDE=(20036934, 20037576)
     131bdc6:	48 89 5e 08          	mov    QWORD PTR [rsi+0x8],rbx
     131bdca:	48 8d 05 73 1e 7c ff 	lea    rax,[rip+0xffffffffff7c1e73]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
     131bdd1:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     131bdd5:	48 8d 05 18 2e 00 00 	lea    rax,[rip+0x2e18]        # 131ebf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164178>
     131bddc:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     131bde0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131bde3:	ff 50 10             	call   QWORD PTR [rax+0x10]
     131bde6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     131bdeb:	e8 ae 42 ab ff       	call   dd009e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d124>
     131bdf0:	e9 19 01 00 00       	jmp    131bf0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161492>
     131bdf5:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131bdf9:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131bdfc:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131be00:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131be03:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131be06:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     131be0b:	4c 89 ff             	mov    rdi,r15
     131be0e:	48 89 c6             	mov    rsi,rax
     131be11:	e8 14 e7 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131be16:	4c 89 f7             	mov    rdi,r14
     131be19:	4c 89 fe             	mov    rsi,r15
     131be1c:	e8 3d 25 00 00       	call   131e35e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1638e2>
     131be21:	49 89 c6             	mov    r14,rax
     131be24:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     131be29:	e8 62 20 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131be2e:	4d 85 f6             	test   r14,r14
     131be31:	0f 84 23 01 00 00    	je     131bf5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1614de>
     131be37:	48 8d 05 ea ac 57 00 	lea    rax,[rip+0x57acea]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>
     131be3e:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     131be43:	49 89 07             	mov    QWORD PTR [r15],rax
     131be46:	48 8d 05 cb ac 57 00 	lea    rax,[rip+0x57accb]        # 1896b18 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a58>

### 0x131bf18 -> 0x131bf26; FDE=(20036934, 20037576)
     131beef:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     131bef3:	48 8d 05 40 2d 00 00 	lea    rax,[rip+0x2d40]        # 131ec3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1641be>
     131befa:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     131befe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131bf01:	ff 50 20             	call   QWORD PTR [rax+0x20]
     131bf04:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     131bf09:	e8 ac 7e e0 ff       	call   1123dba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eb1d0>
     131bf0e:	80 7c 24 07 00       	cmp    BYTE PTR [rsp+0x7],0x0
     131bf13:	0f 95 c3             	setne  bl
     131bf16:	eb 4a                	jmp    131bf62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1614e6>
     131bf18:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131bf1c:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131bf1f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131bf23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131bf26:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131bf29:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
     131bf2e:	48 89 df             	mov    rdi,rbx
     131bf31:	48 89 c6             	mov    rsi,rax
     131bf34:	e8 f1 e5 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131bf39:	4c 89 f7             	mov    rdi,r14
     131bf3c:	48 89 de             	mov    rsi,rbx
     131bf3f:	e8 e4 15 00 00       	call   131d528 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x162aac>
     131bf44:	48 85 c0             	test   rax,rax
     131bf47:	0f 95 c3             	setne  bl
     131bf4a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     131bf4f:	e8 3c 1f 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131bf54:	eb 0c                	jmp    131bf62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1614e6>
     131bf56:	b3 01                	mov    bl,0x1
     131bf58:	eb 08                	jmp    131bf62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1614e6>
     131bf5a:	4d 85 f6             	test   r14,r14
     131bf5d:	0f 95 c3             	setne  bl

### 0x131c03f -> 0x131c04d; FDE=(20037576, 20038394)
     131c024:	00 00 
     131c026:	48 3b 4c 24 48       	cmp    rcx,QWORD PTR [rsp+0x48]
     131c02b:	0f 85 c4 02 00 00    	jne    131c2f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161879>
     131c031:	48 83 c4 50          	add    rsp,0x50
     131c035:	5b                   	pop    rbx
     131c036:	41 5c                	pop    r12
     131c038:	41 5e                	pop    r14
     131c03a:	41 5f                	pop    r15
     131c03c:	5d                   	pop    rbp
     131c03d:	ff e0                	jmp    rax
     131c03f:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c043:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c046:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c04a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c04d:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c050:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     131c055:	4c 89 ff             	mov    rdi,r15
     131c058:	48 89 c6             	mov    rsi,rax
     131c05b:	e8 ca e4 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c060:	4c 89 f7             	mov    rdi,r14
     131c063:	4c 89 fe             	mov    rsi,r15
     131c066:	ba d4 00 00 00       	mov    edx,0xd4
     131c06b:	e8 44 2a 00 00       	call   131eab4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164038>
     131c070:	89 c5                	mov    ebp,eax
     131c072:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     131c077:	e8 14 1e 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c07c:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c080:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c083:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c087:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c08a:	ff 50 40             	call   QWORD PTR [rax+0x40]

### 0x131c07c -> 0x131c08a; FDE=(20037576, 20038394)
     131c055:	4c 89 ff             	mov    rdi,r15
     131c058:	48 89 c6             	mov    rsi,rax
     131c05b:	e8 ca e4 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c060:	4c 89 f7             	mov    rdi,r14
     131c063:	4c 89 fe             	mov    rsi,r15
     131c066:	ba d4 00 00 00       	mov    edx,0xd4
     131c06b:	e8 44 2a 00 00       	call   131eab4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164038>
     131c070:	89 c5                	mov    ebp,eax
     131c072:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     131c077:	e8 14 1e 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c07c:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c080:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c083:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c087:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c08a:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c08d:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
     131c092:	48 89 df             	mov    rdi,rbx
     131c095:	48 89 c6             	mov    rsi,rax
     131c098:	e8 8d e4 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c09d:	4c 89 f7             	mov    rdi,r14
     131c0a0:	48 89 de             	mov    rsi,rbx
     131c0a3:	ba b2 00 00 00       	mov    edx,0xb2
     131c0a8:	e8 07 2a 00 00       	call   131eab4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164038>
     131c0ad:	89 c3                	mov    ebx,eax
     131c0af:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     131c0b4:	e8 d7 1d 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c0b9:	80 fb 01             	cmp    bl,0x1
     131c0bc:	0f 85 a2 01 00 00    	jne    131c264 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1617e8>
     131c0c2:	40 80 fd 01          	cmp    bpl,0x1
     131c0c6:	0f 94 c0             	sete   al
     131c0c9:	40 80 fd 04          	cmp    bpl,0x4

### 0x131c0d9 -> 0x131c0e7; FDE=(20037576, 20038394)
     131c0af:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     131c0b4:	e8 d7 1d 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c0b9:	80 fb 01             	cmp    bl,0x1
     131c0bc:	0f 85 a2 01 00 00    	jne    131c264 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1617e8>
     131c0c2:	40 80 fd 01          	cmp    bpl,0x1
     131c0c6:	0f 94 c0             	sete   al
     131c0c9:	40 80 fd 04          	cmp    bpl,0x4
     131c0cd:	40 0f 94 c5          	sete   bpl
     131c0d1:	40 08 c5             	or     bpl,al
     131c0d4:	e9 ae 01 00 00       	jmp    131c287 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16180b>
     131c0d9:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c0dd:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c0e0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c0e4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c0e7:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c0ea:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     131c0ef:	4c 89 ff             	mov    rdi,r15
     131c0f2:	48 89 c6             	mov    rsi,rax
     131c0f5:	e8 30 e4 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c0fa:	4c 89 f7             	mov    rdi,r14
     131c0fd:	4c 89 fe             	mov    rsi,r15
     131c100:	e8 5d e6 ff ff       	call   131a762 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fce6>
     131c105:	48 85 c0             	test   rax,rax
     131c108:	0f 84 5f 01 00 00    	je     131c26d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1617f1>
     131c10e:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c112:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c115:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c119:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c11c:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c11f:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
     131c124:	4c 89 ff             	mov    rdi,r15

### 0x131c10e -> 0x131c11c; FDE=(20037576, 20038394)
     131c0e7:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c0ea:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     131c0ef:	4c 89 ff             	mov    rdi,r15
     131c0f2:	48 89 c6             	mov    rsi,rax
     131c0f5:	e8 30 e4 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c0fa:	4c 89 f7             	mov    rdi,r14
     131c0fd:	4c 89 fe             	mov    rsi,r15
     131c100:	e8 5d e6 ff ff       	call   131a762 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fce6>
     131c105:	48 85 c0             	test   rax,rax
     131c108:	0f 84 5f 01 00 00    	je     131c26d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1617f1>
     131c10e:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c112:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c115:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c119:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c11c:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c11f:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
     131c124:	4c 89 ff             	mov    rdi,r15
     131c127:	48 89 c6             	mov    rsi,rax
     131c12a:	e8 fb e3 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c12f:	4c 89 f7             	mov    rdi,r14
     131c132:	4c 89 fe             	mov    rsi,r15
     131c135:	e8 ee 13 00 00       	call   131d528 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x162aac>
     131c13a:	48 85 c0             	test   rax,rax
     131c13d:	0f 84 2e 01 00 00    	je     131c271 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1617f5>
     131c143:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c147:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c14a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c14e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c151:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c154:	48 89 e3             	mov    rbx,rsp
     131c157:	48 89 df             	mov    rdi,rbx

### 0x131c143 -> 0x131c151; FDE=(20037576, 20038394)
     131c11c:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c11f:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
     131c124:	4c 89 ff             	mov    rdi,r15
     131c127:	48 89 c6             	mov    rsi,rax
     131c12a:	e8 fb e3 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c12f:	4c 89 f7             	mov    rdi,r14
     131c132:	4c 89 fe             	mov    rsi,r15
     131c135:	e8 ee 13 00 00       	call   131d528 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x162aac>
     131c13a:	48 85 c0             	test   rax,rax
     131c13d:	0f 84 2e 01 00 00    	je     131c271 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1617f5>
     131c143:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c147:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c14a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c14e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c151:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c154:	48 89 e3             	mov    rbx,rsp
     131c157:	48 89 df             	mov    rdi,rbx
     131c15a:	48 89 c6             	mov    rsi,rax
     131c15d:	e8 c8 e3 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c162:	4c 89 f7             	mov    rdi,r14
     131c165:	48 89 de             	mov    rsi,rbx
     131c168:	e8 99 25 00 00       	call   131e706 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163c8a>
     131c16d:	48 85 c0             	test   rax,rax
     131c170:	40 0f 95 c5          	setne  bpl
     131c174:	48 89 e7             	mov    rdi,rsp
     131c177:	e8 14 1d 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c17c:	e9 f2 00 00 00       	jmp    131c273 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1617f7>
     131c181:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c185:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c188:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c18c:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0x131c181 -> 0x131c18f; FDE=(20037576, 20038394)
     131c15a:	48 89 c6             	mov    rsi,rax
     131c15d:	e8 c8 e3 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c162:	4c 89 f7             	mov    rdi,r14
     131c165:	48 89 de             	mov    rsi,rbx
     131c168:	e8 99 25 00 00       	call   131e706 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163c8a>
     131c16d:	48 85 c0             	test   rax,rax
     131c170:	40 0f 95 c5          	setne  bpl
     131c174:	48 89 e7             	mov    rdi,rsp
     131c177:	e8 14 1d 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c17c:	e9 f2 00 00 00       	jmp    131c273 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1617f7>
     131c181:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c185:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c188:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c18c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c18f:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c192:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
     131c197:	48 89 df             	mov    rdi,rbx
     131c19a:	48 89 c6             	mov    rsi,rax
     131c19d:	e8 88 e3 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c1a2:	4c 89 f7             	mov    rdi,r14
     131c1a5:	48 89 de             	mov    rsi,rbx
     131c1a8:	e8 b1 21 00 00       	call   131e35e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1638e2>
     131c1ad:	48 85 c0             	test   rax,rax
     131c1b0:	40 0f 95 c5          	setne  bpl
     131c1b4:	e9 c4 00 00 00       	jmp    131c27d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161801>
     131c1b9:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c1bd:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c1c0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c1c4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c1c7:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c1ca:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]

### 0x131c1b9 -> 0x131c1c7; FDE=(20037576, 20038394)
     131c192:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
     131c197:	48 89 df             	mov    rdi,rbx
     131c19a:	48 89 c6             	mov    rsi,rax
     131c19d:	e8 88 e3 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c1a2:	4c 89 f7             	mov    rdi,r14
     131c1a5:	48 89 de             	mov    rsi,rbx
     131c1a8:	e8 b1 21 00 00       	call   131e35e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1638e2>
     131c1ad:	48 85 c0             	test   rax,rax
     131c1b0:	40 0f 95 c5          	setne  bpl
     131c1b4:	e9 c4 00 00 00       	jmp    131c27d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161801>
     131c1b9:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c1bd:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c1c0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c1c4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c1c7:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c1ca:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     131c1cf:	4c 89 ff             	mov    rdi,r15
     131c1d2:	48 89 c6             	mov    rsi,rax
     131c1d5:	e8 50 e3 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c1da:	4c 89 f7             	mov    rdi,r14
     131c1dd:	4c 89 fe             	mov    rsi,r15
     131c1e0:	e8 6d 19 00 00       	call   131db52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1630d6>
     131c1e5:	49 89 c6             	mov    r14,rax
     131c1e8:	48 85 c0             	test   rax,rax
     131c1eb:	40 0f 95 c5          	setne  bpl
     131c1ef:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     131c1f4:	e8 97 1c 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c1f9:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c1fd:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     131c200:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c204:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0x131c1f9 -> 0x131c207; FDE=(20037576, 20038394)
     131c1d2:	48 89 c6             	mov    rsi,rax
     131c1d5:	e8 50 e3 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c1da:	4c 89 f7             	mov    rdi,r14
     131c1dd:	4c 89 fe             	mov    rsi,r15
     131c1e0:	e8 6d 19 00 00       	call   131db52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1630d6>
     131c1e5:	49 89 c6             	mov    r14,rax
     131c1e8:	48 85 c0             	test   rax,rax
     131c1eb:	40 0f 95 c5          	setne  bpl
     131c1ef:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     131c1f4:	e8 97 1c 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c1f9:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c1fd:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     131c200:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c204:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c207:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c20a:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
     131c20f:	4c 89 e7             	mov    rdi,r12
     131c212:	48 89 c6             	mov    rsi,rax
     131c215:	e8 10 e3 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c21a:	4c 89 ff             	mov    rdi,r15
     131c21d:	4c 89 e6             	mov    rsi,r12
     131c220:	e8 3d e5 ff ff       	call   131a762 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fce6>
     131c225:	49 89 c7             	mov    r15,rax
     131c228:	48 85 c0             	test   rax,rax
     131c22b:	41 0f 95 c4          	setne  r12b
     131c22f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     131c234:	e8 57 1c 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c239:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c23d:	0f b6 40 18          	movzx  eax,BYTE PTR [rax+0x18]
     131c241:	85 c0                	test   eax,eax
     131c243:	74 42                	je     131c287 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16180b>

### 0x131c433 -> 0x131c441; FDE=(20038394, 20039106)
     131c404:	48 89 5e 08          	mov    QWORD PTR [rsi+0x8],rbx
     131c408:	48 8d 05 35 18 7c ff 	lea    rax,[rip+0xffffffffff7c1835]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
     131c40f:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     131c413:	48 8d 05 aa 1e 00 00 	lea    rax,[rip+0x1eaa]        # 131e2c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163848>
     131c41a:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     131c41e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c421:	ff 50 20             	call   QWORD PTR [rax+0x20]
     131c424:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     131c429:	e8 8c 79 e0 ff       	call   1123dba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eb1d0>
     131c42e:	e9 25 01 00 00       	jmp    131c558 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161adc>
     131c433:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     131c437:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     131c43a:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     131c43e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c441:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c444:	4c 8d 74 24 58       	lea    r14,[rsp+0x58]
     131c449:	4c 89 f7             	mov    rdi,r14
     131c44c:	48 89 c6             	mov    rsi,rax
     131c44f:	e8 d6 e0 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c454:	4c 89 ff             	mov    rdi,r15
     131c457:	4c 89 f6             	mov    rsi,r14
     131c45a:	e8 ff 1e 00 00       	call   131e35e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1638e2>
     131c45f:	49 89 c6             	mov    r14,rax
     131c462:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     131c467:	e8 24 1a 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c46c:	4d 85 f6             	test   r14,r14
     131c46f:	0f 84 dc 00 00 00    	je     131c551 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161ad5>
     131c475:	48 8d 05 ac a6 57 00 	lea    rax,[rip+0x57a6ac]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>
     131c47c:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     131c481:	48 89 46 d8          	mov    QWORD PTR [rsi-0x28],rax
     131c485:	48 8d 05 8c a6 57 00 	lea    rax,[rip+0x57a68c]        # 1896b18 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a58>

### 0x131c61a -> 0x131c628; FDE=(20039106, 20040246)
     131c5f9:	31 c9                	xor    ecx,ecx
     131c5fb:	31 d2                	xor    edx,edx
     131c5fd:	83 f8 0a             	cmp    eax,0xa
     131c600:	0f 87 d6 02 00 00    	ja     131c8dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e60>
     131c606:	89 c0                	mov    eax,eax
     131c608:	48 8d 35 11 b8 07 ff 	lea    rsi,[rip+0xffffffffff07b811]        # 397e20 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x4a01>
     131c60f:	48 63 04 86          	movsxd rax,DWORD PTR [rsi+rax*4]
     131c613:	48 01 f0             	add    rax,rsi
     131c616:	31 f6                	xor    esi,esi
     131c618:	ff e0                	jmp    rax
     131c61a:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c61e:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c621:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c625:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c628:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c62b:	48 8d 5c 24 78       	lea    rbx,[rsp+0x78]
     131c630:	48 89 df             	mov    rdi,rbx
     131c633:	48 89 c6             	mov    rsi,rax
     131c636:	e8 ef de 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c63b:	4c 89 f7             	mov    rdi,r14
     131c63e:	48 89 de             	mov    rsi,rbx
     131c641:	e8 6e ec ff ff       	call   131b2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x160838>
     131c646:	48 89 c3             	mov    rbx,rax
     131c649:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     131c64e:	e8 3d 18 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c653:	48 85 db             	test   rbx,rbx
     131c656:	74 06                	je     131c65e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161be2>
     131c658:	f6 43 10 01          	test   BYTE PTR [rbx+0x10],0x1
     131c65c:	75 08                	jne    131c666 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161bea>
     131c65e:	31 c9                	xor    ecx,ecx
     131c660:	31 f6                	xor    esi,esi

### 0x131c6ac -> 0x131c6ba; FDE=(20039106, 20040246)
     131c687:	b9 40 42 0f 00       	mov    ecx,0xf4240
     131c68c:	48 99                	cqo
     131c68e:	48 f7 f9             	idiv   rcx
     131c691:	0f b6 c8             	movzx  ecx,al
     131c694:	48 89 c6             	mov    rsi,rax
     131c697:	48 81 e6 00 ff ff ff 	and    rsi,0xffffffffffffff00
     131c69e:	b2 01                	mov    dl,0x1
     131c6a0:	48 09 f1             	or     rcx,rsi
     131c6a3:	48 c1 ee 08          	shr    rsi,0x8
     131c6a7:	e9 cc 02 00 00       	jmp    131c978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161efc>
     131c6ac:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c6b0:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     131c6b3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c6b7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c6ba:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c6bd:	49 89 e6             	mov    r14,rsp
     131c6c0:	4c 89 f7             	mov    rdi,r14
     131c6c3:	48 89 c6             	mov    rsi,rax
     131c6c6:	e8 5f de 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c6cb:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     131c6d0:	4c 89 f6             	mov    rsi,r14
     131c6d3:	e8 68 18 4d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     131c6d8:	4c 8d 65 08          	lea    r12,[rbp+0x8]
     131c6dc:	4c 8d 7c 24 78       	lea    r15,[rsp+0x78]
     131c6e1:	66 41 c7 47 18 04 00 	mov    WORD PTR [r15+0x18],0x4
     131c6e8:	4c 89 e7             	mov    rdi,r12
     131c6eb:	4c 89 fe             	mov    rsi,r15
     131c6ee:	e8 27 e3 ff ff       	call   131aa1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ff9e>
     131c6f3:	49 89 c6             	mov    r14,rax
     131c6f6:	4c 89 ff             	mov    rdi,r15
     131c6f9:	e8 92 17 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x131c871 -> 0x131c87f; FDE=(20039106, 20040246)
     131c84c:	e8 dd e1 ff ff       	call   131aa2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ffb2>
     131c851:	89 c5                	mov    ebp,eax
     131c853:	4c 89 f7             	mov    rdi,r14
     131c856:	e8 2b 1c 78 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     131c85b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     131c860:	e8 2b 16 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c865:	45 31 f6             	xor    r14d,r14d
     131c868:	40 84 ed             	test   bpl,bpl
     131c86b:	4d 0f 44 fe          	cmove  r15,r14
     131c86f:	eb 4a                	jmp    131c8bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e3f>
     131c871:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131c875:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131c878:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131c87c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131c87f:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131c882:	48 8d 5c 24 78       	lea    rbx,[rsp+0x78]
     131c887:	48 89 df             	mov    rdi,rbx
     131c88a:	48 89 c6             	mov    rsi,rax
     131c88d:	e8 98 dc 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131c892:	4c 89 f7             	mov    rdi,r14
     131c895:	48 89 de             	mov    rsi,rbx
     131c898:	e8 b5 12 00 00       	call   131db52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1630d6>
     131c89d:	48 89 c3             	mov    rbx,rax
     131c8a0:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     131c8a5:	e8 e6 15 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131c8aa:	48 85 db             	test   rbx,rbx
     131c8ad:	74 34                	je     131c8e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e67>
     131c8af:	48 8b 4b 60          	mov    rcx,QWORD PTR [rbx+0x60]
     131c8b3:	e9 b7 00 00 00       	jmp    131c96f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161ef3>
     131c8b8:	45 31 ff             	xor    r15d,r15d
     131c8bb:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]

### 0x131ca70 -> 0x131ca7e; FDE=(20040246, 20040999)
     131ca4e:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
     131ca55:	00 
     131ca56:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     131ca5a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131ca5d:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131ca60:	8b 78 38             	mov    edi,DWORD PTR [rax+0x38]
     131ca63:	e8 9d dc ff ff       	call   131a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fc89>
     131ca68:	8d 48 fb             	lea    ecx,[rax-0x5]
     131ca6b:	83 f9 06             	cmp    ecx,0x6
     131ca6e:	73 58                	jae    131cac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16204c>
     131ca70:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     131ca74:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     131ca77:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     131ca7b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131ca7e:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131ca81:	4c 8d b4 24 98 00 00 	lea    r14,[rsp+0x98]
     131ca88:	00 
     131ca89:	4c 89 f7             	mov    rdi,r14
     131ca8c:	48 89 c6             	mov    rsi,rax
     131ca8f:	e8 96 da 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131ca94:	48 89 df             	mov    rdi,rbx
     131ca97:	4c 89 f6             	mov    rsi,r14
     131ca9a:	e8 15 e8 ff ff       	call   131b2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x160838>
     131ca9f:	48 89 c3             	mov    rbx,rax
     131caa2:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
     131caa9:	00 
     131caaa:	e8 e1 13 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131caaf:	48 85 db             	test   rbx,rbx
     131cab2:	74 62                	je     131cb16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16209a>
     131cab4:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     131cab8:	a8 04                	test   al,0x4

### 0x131cd5a -> 0x131cd68; FDE=(20041000, 20041329)
     131cd39:	00 00 
     131cd3b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     131cd40:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     131cd44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131cd47:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131cd4a:	8b 78 38             	mov    edi,DWORD PTR [rax+0x38]
     131cd4d:	e8 b3 d9 ff ff       	call   131a705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fc89>
     131cd52:	8d 48 fb             	lea    ecx,[rax-0x5]
     131cd55:	83 f9 06             	cmp    ecx,0x6
     131cd58:	73 70                	jae    131cdca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16234e>
     131cd5a:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     131cd5e:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     131cd61:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     131cd65:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     131cd68:	ff 50 40             	call   QWORD PTR [rax+0x40]
     131cd6b:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
     131cd70:	48 89 df             	mov    rdi,rbx
     131cd73:	48 89 c6             	mov    rsi,rax
     131cd76:	e8 af d7 3a 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     131cd7b:	4c 89 f7             	mov    rdi,r14
     131cd7e:	48 89 de             	mov    rsi,rbx
     131cd81:	e8 2e e5 ff ff       	call   131b2b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x160838>
     131cd86:	48 89 c3             	mov    rbx,rax
     131cd89:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     131cd8e:	e8 fd 10 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     131cd93:	48 85 db             	test   rbx,rbx
     131cd96:	74 7c                	je     131ce14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x162398>
     131cd98:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     131cd9c:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     131cda0:	48 8d 4b 20          	lea    rcx,[rbx+0x20]
     131cda4:	49 89 c6             	mov    r14,rax

### 0x133debc -> 0x133dee1; FDE=(20176212, 20177902)
     133de95:	48 8d 05 7e 06 00 00 	lea    rax,[rip+0x67e]        # 133e51a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183a9e>
     133de9c:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     133dea0:	49 8b 06             	mov    rax,QWORD PTR [r14]
     133dea3:	4c 89 f7             	mov    rdi,r14
     133dea6:	ff 50 10             	call   QWORD PTR [rax+0x10]
     133dea9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     133deae:	e8 eb 21 a9 ff       	call   dd009e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d124>
     133deb3:	48 89 e7             	mov    rdi,rsp
     133deb6:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
     133deb9:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     133debc:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     133dec0:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     133dec4:	0f 57 c0             	xorps  xmm0,xmm0
     133dec7:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     133deca:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     133decf:	c7 43 18 02 00 00 00 	mov    DWORD PTR [rbx+0x18],0x2
     133ded6:	e9 a8 03 00 00       	jmp    133e283 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183807>
     133dedb:	49 8b 06             	mov    rax,QWORD PTR [r14]
     133dede:	4c 89 f7             	mov    rdi,r14
     133dee1:	ff 50 40             	call   QWORD PTR [rax+0x40]
     133dee4:	83 78 38 09          	cmp    DWORD PTR [rax+0x38],0x9
     133dee8:	e9 b0 00 00 00       	jmp    133df9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183521>
     133deed:	48 89 e0             	mov    rax,rsp
     133def0:	c6 00 00             	mov    BYTE PTR [rax],0x0
     133def3:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     133def8:	48 89 06             	mov    QWORD PTR [rsi],rax
     133defb:	48 8d 05 62 e5 73 ff 	lea    rax,[rip+0xffffffffff73e562]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     133df02:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     133df06:	48 8d 05 17 05 00 00 	lea    rax,[rip+0x517]        # 133e424 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1839a8>
     133df0d:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     133df11:	49 8b 06             	mov    rax,QWORD PTR [r14]

### 0x1393d8c -> 0x1393dac; FDE=(20528502, 20528617)
     1393d68:	e8 38 5d 6e ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1393d6d:	cc                   	int3
     1393d6e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1393d71:	e9 00 00 00 00       	jmp    1393d76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d92fa>
     1393d76:	53                   	push   rbx
     1393d77:	48 83 ec 20          	sub    rsp,0x20
     1393d7b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1393d82:	00 00 
     1393d84:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     1393d89:	8b 47 08             	mov    eax,DWORD PTR [rdi+0x8]
     1393d8c:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     1393d90:	89 44 24 08          	mov    DWORD PTR [rsp+0x8],eax
     1393d94:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     1393d99:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1393d9c:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     1393da0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1393da3:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1393da6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1393da9:	48 89 c7             	mov    rdi,rax
     1393dac:	ff 51 40             	call   QWORD PTR [rcx+0x40]
     1393daf:	83 f8 01             	cmp    eax,0x1
     1393db2:	75 12                	jne    1393dc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d934a>
     1393db4:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     1393db8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1393dbb:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1393dc0:	48 89 de             	mov    rsi,rbx
     1393dc3:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1393dc6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1393dcd:	00 00 
     1393dcf:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     1393dd4:	75 06                	jne    1393ddc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d9360>

### 0x13ad547 -> 0x13ad552; FDE=(20628338, 20634772)
     13ad52b:	48 85 ff             	test   rdi,rdi
     13ad52e:	74 0a                	je     13ad53a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f2abe>
     13ad530:	e8 25 f6 00 00       	call   13bcb5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2020de>
     13ad535:	48 89 c6             	mov    rsi,rax
     13ad538:	eb 02                	jmp    13ad53c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f2ac0>
     13ad53a:	31 f6                	xor    esi,esi
     13ad53c:	6a 01                	push   0x1
     13ad53e:	5a                   	pop    rdx
     13ad53f:	4c 89 f7             	mov    rdi,r14
     13ad542:	e8 ad 42 00 00       	call   13b17f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f6d78>
     13ad547:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13ad54c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     13ad54f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13ad552:	ff 50 40             	call   QWORD PTR [rax+0x40]
     13ad555:	84 c0                	test   al,al
     13ad557:	74 12                	je     13ad56b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f2aef>
     13ad559:	48 89 df             	mov    rdi,rbx
     13ad55c:	e8 ff 43 00 00       	call   13b1960 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f6ee4>
     13ad561:	48 89 df             	mov    rdi,rbx
     13ad564:	e8 bb 4b 00 00       	call   13b2124 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f76a8>
     13ad569:	eb 3e                	jmp    13ad5a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f2b2d>
     13ad56b:	48 8d 35 e1 a8 fc fe 	lea    rsi,[rip+0xfffffffffefca8e1]        # 377e53 <_ZTSSt12bad_any_cast@@Base-0x18375>
     13ad572:	48 8d 0d 6a 61 fa fe 	lea    rcx,[rip+0xfffffffffefa616a]        # 3536e3 <_ZTSSt12bad_any_cast@@Base-0x3cae5>
     13ad579:	6a 04                	push   0x4
     13ad57b:	5f                   	pop    rdi
     13ad57c:	ba 10 01 00 00       	mov    edx,0x110
     13ad581:	31 c0                	xor    eax,eax
     13ad583:	e8 4a 93 42 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     13ad588:	48 8d b4 24 40 03 00 	lea    rsi,[rsp+0x340]
     13ad58f:	00 
     13ad590:	c7 06 22 03 00 00    	mov    DWORD PTR [rsi],0x322

### 0x13ed4f7 -> 0x13ed4fb; FDE=(20894056, 20896284)
     13ed4d4:	49 c1 ec 03          	shr    r12,0x3
     13ed4d8:	49 39 c4             	cmp    r12,rax
     13ed4db:	4c 0f 43 e0          	cmovae r12,rax
     13ed4df:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     13ed4e3:	31 c9                	xor    ecx,ecx
     13ed4e5:	41 83 bd 64 07 00 00 	cmp    DWORD PTR [r13+0x764],0x1
     13ed4ec:	01 
     13ed4ed:	0f 95 c1             	setne  cl
     13ed4f0:	41 8b 4c 8d 78       	mov    ecx,DWORD PTR [r13+rcx*4+0x78]
     13ed4f5:	87 08                	xchg   DWORD PTR [rax],ecx
     13ed4f7:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     13ed4fb:	48 8b 78 40          	mov    rdi,QWORD PTR [rax+0x40]
     13ed4ff:	83 e6 fc             	and    esi,0xfffffffc
     13ed502:	48 03 74 24 68       	add    rsi,QWORD PTR [rsp+0x68]
     13ed507:	4b 8d 14 24          	lea    rdx,[r12+r12*1]
     13ed50b:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
     13ed512:	00 
     13ed513:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13ed516:	45 31 c9             	xor    r9d,r9d
     13ed519:	41 83 f8 01          	cmp    r8d,0x1
     13ed51d:	41 0f 95 c1          	setne  r9b
     13ed521:	4a 8b 04 c8          	mov    rax,QWORD PTR [rax+r9*8]
     13ed525:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     13ed52a:	4c 89 a4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r12
     13ed531:	00 
     13ed532:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13ed535:	f3 0f 6f 44 24 78    	movdqu xmm0,XMMWORD PTR [rsp+0x78]
     13ed53b:	f3 0f 7f 04 24       	movdqu XMMWORD PTR [rsp],xmm0
     13ed540:	4d 89 e0             	mov    r8,r12
     13ed543:	ff 50 18             	call   QWORD PTR [rax+0x18]
     13ed546:	41 8b 85 a8 04 00 00 	mov    eax,DWORD PTR [r13+0x4a8]

### 0x1426910 -> 0x1426915; FDE=(21128434, 21131255)
     14268de:	e8 4d 07 00 00       	call   1427030 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c5b4>
     14268e3:	49 8d bf 80 00 00 00 	lea    rdi,[r15+0x80]
     14268ea:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     14268ef:	48 89 ea             	mov    rdx,rbp
     14268f2:	e8 39 07 00 00       	call   1427030 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c5b4>
     14268f7:	49 81 c7 f8 00 00 00 	add    r15,0xf8
     14268fe:	4c 89 ff             	mov    rdi,r15
     1426901:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     1426906:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     142690b:	e8 20 07 00 00       	call   1427030 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c5b4>
     1426910:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     1426915:	4c 8b 6d 40          	mov    r13,QWORD PTR [rbp+0x40]
     1426919:	4d 85 ed             	test   r13,r13
     142691c:	74 3c                	je     142695a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bede>
     142691e:	4c 8b b3 20 01 00 00 	mov    r14,QWORD PTR [rbx+0x120]
     1426925:	4c 8b bb 28 01 00 00 	mov    r15,QWORD PTR [rbx+0x128]
     142692c:	49 83 bd 80 00 00 00 	cmp    QWORD PTR [r13+0x80],0x0
     1426933:	00 
     1426934:	0f 84 2f 05 00 00    	je     1426e69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c3ed>
     142693a:	4d 8d 65 08          	lea    r12,[r13+0x8]
     142693e:	49 83 bd a8 00 00 00 	cmp    QWORD PTR [r13+0xa8],0x0
     1426945:	00 
     1426946:	0f 84 80 05 00 00    	je     1426ecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c450>
     142694c:	4c 89 e7             	mov    rdi,r12
     142694f:	4c 89 f6             	mov    rsi,r14
     1426952:	4c 89 fa             	mov    rdx,r15
     1426955:	e8 d6 06 00 00       	call   1427030 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c5b4>
     142695a:	4c 8b 65 48          	mov    r12,QWORD PTR [rbp+0x48]
     142695e:	4d 85 e4             	test   r12,r12
     1426961:	74 3f                	je     14269a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bf26>
     1426963:	4c 8b b3 30 01 00 00 	mov    r14,QWORD PTR [rbx+0x130]

### 0x146851a -> 0x1468535; FDE=(21398520, 21399582)
     14684eb:	4c 89 e7             	mov    rdi,r12
     14684ee:	e8 ef 62 63 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     14684f3:	49 89 c4             	mov    r12,rax
     14684f6:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14684fb:	0f 85 56 ff ff ff    	jne    1468457 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ad9db>
     1468501:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
     1468506:	49 8d 7c 24 30       	lea    rdi,[r12+0x30]
     146850b:	0f 57 c0             	xorps  xmm0,xmm0
     146850e:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0
     1468514:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
     146851a:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     146851f:	8b 43 50             	mov    eax,DWORD PTR [rbx+0x50]
     1468522:	41 89 44 24 50       	mov    DWORD PTR [r12+0x50],eax
     1468527:	48 8b 73 38          	mov    rsi,QWORD PTR [rbx+0x38]
     146852b:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     1468530:	e8 6b eb 67 ff       	call   ae70a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34040>
     1468535:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
     1468539:	48 85 c0             	test   rax,rax
     146853c:	0f 84 63 02 00 00    	je     14687a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2add29>
     1468542:	49 8d 4c 24 40       	lea    rcx,[r12+0x40]
     1468547:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     146854c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1468551:	4c 8d 78 10          	lea    r15,[rax+0x10]
     1468555:	4c 89 ff             	mov    rdi,r15
     1468558:	e8 63 71 63 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
     146855d:	49 89 c5             	mov    r13,rax
     1468560:	4d 8b 74 24 38       	mov    r14,QWORD PTR [r12+0x38]
     1468565:	4d 85 f6             	test   r14,r14
     1468568:	0f 84 95 00 00 00    	je     1468603 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2adb87>
     146856e:	f3 49 0f b8 de       	popcnt rbx,r14
     1468573:	48 83 fb 01          	cmp    rbx,0x1

### 0x15b42de -> 0x15b42e2; FDE=(22758014, 22758425)
     15b42bb:	49 8b 06             	mov    rax,QWORD PTR [r14]
     15b42be:	4c 89 f7             	mov    rdi,r14
     15b42c1:	ff 50 78             	call   QWORD PTR [rax+0x78]
     15b42c4:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     15b42c9:	89 c6                	mov    esi,eax
     15b42cb:	e8 8b 44 02 00       	call   15d875b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41dcdf>
     15b42d0:	f6 44 24 28 01       	test   BYTE PTR [rsp+0x28],0x1
     15b42d5:	74 1c                	je     15b42f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9877>
     15b42d7:	4c 8b 44 24 38       	mov    r8,QWORD PTR [rsp+0x38]
     15b42dc:	eb 1a                	jmp    15b42f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f987c>
     15b42de:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b42e2:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b42e6:	48 89 df             	mov    rdi,rbx
     15b42e9:	e8 7a 7d 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b42ee:	e9 c3 00 00 00       	jmp    15b43b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f993a>
     15b42f3:	4c 8d 44 24 29       	lea    r8,[rsp+0x29]
     15b42f8:	48 8d 35 7d dc e9 fe 	lea    rsi,[rip+0xfffffffffee9dc7d]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     15b42ff:	48 8d 0d a8 93 d8 fe 	lea    rcx,[rip+0xfffffffffed893a8]        # 33d6ae <_ZTSSt12bad_any_cast@@Base-0x52b1a>
     15b4306:	6a 04                	push   0x4
     15b4308:	5f                   	pop    rdi
     15b4309:	ba af 02 00 00       	mov    edx,0x2af
     15b430e:	31 c0                	xor    eax,eax
     15b4310:	e8 bd 25 22 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     15b4315:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     15b431a:	e8 71 9b 23 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15b431f:	48 89 e7             	mov    rdi,rsp
     15b4322:	e8 49 1a 0e 00       	call   1695d70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49edc>
     15b4327:	e8 66 94 1f 00       	call   17ad792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1618fe>
     15b432c:	89 c5                	mov    ebp,eax
     15b432e:	e8 5f 94 1f 00       	call   17ad792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1618fe>
     15b4333:	89 e9                	mov    ecx,ebp

### 0x15b44c3 -> 0x15b44c7; FDE=(22758426, 22759192)
     15b4497:	48 85 db             	test   rbx,rbx
     15b449a:	74 3c                	je     15b44d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9a5c>
     15b449c:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
     15b44a1:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
     15b44a6:	4c 89 ef             	mov    rdi,r13
     15b44a9:	e8 18 68 0e 00       	call   169acc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ee32>
     15b44ae:	41 f6 45 00 01       	test   BYTE PTR [r13+0x0],0x1
     15b44b3:	0f 84 c5 00 00 00    	je     15b457e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9b02>
     15b44b9:	4c 8b 44 24 60       	mov    r8,QWORD PTR [rsp+0x60]
     15b44be:	e9 c0 00 00 00       	jmp    15b4583 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9b07>
     15b44c3:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     15b44c7:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b44cb:	4c 89 f7             	mov    rdi,r14
     15b44ce:	e8 95 7b 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b44d3:	e9 ae 01 00 00       	jmp    15b4686 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9c0a>
     15b44d8:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     15b44dd:	4c 89 ef             	mov    rdi,r13
     15b44e0:	e8 09 b2 4e ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     15b44e5:	84 c0                	test   al,al
     15b44e7:	0f 84 c3 00 00 00    	je     15b45b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9b34>
     15b44ed:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     15b44f2:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
     15b44f7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     15b44fc:	83 78 20 00          	cmp    DWORD PTR [rax+0x20],0x0
     15b4500:	7e 53                	jle    15b4555 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9ad9>
     15b4502:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     15b4507:	4c 8d 70 18          	lea    r14,[rax+0x18]
     15b450b:	6a 08                	push   0x8
     15b450d:	41 5f                	pop    r15
     15b450f:	31 ed                	xor    ebp,ebp
     15b4511:	49 8b 06             	mov    rax,QWORD PTR [r14]

### 0x15b51e4 -> 0x15b51e8; FDE=(22761682, 22762105)
     15b51c0:	49 8b 06             	mov    rax,QWORD PTR [r14]
     15b51c3:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
     15b51c8:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     15b51cd:	48 89 df             	mov    rdi,rbx
     15b51d0:	4c 89 f6             	mov    rsi,r14
     15b51d3:	31 c9                	xor    ecx,ecx
     15b51d5:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15b51d8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     15b51dd:	e8 ae 8c 23 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15b51e2:	eb 10                	jmp    15b51f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fa778>
     15b51e4:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b51e8:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b51ec:	48 89 df             	mov    rdi,rbx
     15b51ef:	e8 74 6e 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b51f4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     15b51f9:	e8 88 92 4e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15b51fe:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15b5205:	00 00 
     15b5207:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     15b520e:	00 
     15b520f:	75 63                	jne    15b5274 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fa7f8>
     15b5211:	48 89 d8             	mov    rax,rbx
     15b5214:	48 81 c4 28 01 00 00 	add    rsp,0x128
     15b521b:	5b                   	pop    rbx
     15b521c:	41 5c                	pop    r12
     15b521e:	41 5d                	pop    r13
     15b5220:	41 5e                	pop    r14
     15b5222:	41 5f                	pop    r15
     15b5224:	5d                   	pop    rbp
     15b5225:	c3                   	ret
     15b5226:	48 89 c3             	mov    rbx,rax

### 0x15b5358 -> 0x15b535c; FDE=(22762106, 22762462)
     15b5334:	e8 bb df 0c 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
     15b5339:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     15b5340:	00 
     15b5341:	e8 ae df 0c 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
     15b5346:	8a 44 24 0f          	mov    al,BYTE PTR [rsp+0xf]
     15b534a:	34 01                	xor    al,0x1
     15b534c:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
     15b5350:	88 01                	mov    BYTE PTR [rcx],al
     15b5352:	eb 14                	jmp    15b5368 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fa8ec>
     15b5354:	41 c6 06 00          	mov    BYTE PTR [r14],0x0
     15b5358:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     15b535c:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b5360:	48 89 df             	mov    rdi,rbx
     15b5363:	e8 00 6d 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b5368:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     15b536d:	e8 14 91 4e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15b5372:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15b5379:	00 00 
     15b537b:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
     15b5382:	00 
     15b5383:	75 54                	jne    15b53d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fa95d>
     15b5385:	48 89 d8             	mov    rax,rbx
     15b5388:	48 81 c4 e8 00 00 00 	add    rsp,0xe8
     15b538f:	5b                   	pop    rbx
     15b5390:	41 5c                	pop    r12
     15b5392:	41 5d                	pop    r13
     15b5394:	41 5e                	pop    r14
     15b5396:	41 5f                	pop    r15
     15b5398:	5d                   	pop    rbp
     15b5399:	c3                   	ret
     15b539a:	48 89 c3             	mov    rbx,rax

### 0x15b576b -> 0x15b576f; FDE=(22762770, 22763522)
     15b5748:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
     15b574d:	4c 89 e7             	mov    rdi,r12
     15b5750:	4c 89 f6             	mov    rsi,r14
     15b5753:	31 c9                	xor    ecx,ecx
     15b5755:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15b5758:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     15b575d:	e8 2e 87 23 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15b5762:	eb 17                	jmp    15b577b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3facff>
     15b5764:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
     15b5769:	eb 1a                	jmp    15b5785 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fad09>
     15b576b:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b576f:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b5773:	4c 89 e7             	mov    rdi,r12
     15b5776:	e8 ed 68 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b577b:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     15b5780:	e8 01 8d 4e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15b5785:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15b578c:	00 00 
     15b578e:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     15b5795:	00 
     15b5796:	75 65                	jne    15b57fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fad81>
     15b5798:	4c 89 e0             	mov    rax,r12
     15b579b:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
     15b57a2:	5b                   	pop    rbx
     15b57a3:	41 5c                	pop    r12
     15b57a5:	41 5d                	pop    r13
     15b57a7:	41 5e                	pop    r14
     15b57a9:	41 5f                	pop    r15
     15b57ab:	5d                   	pop    rbp
     15b57ac:	c3                   	ret
     15b57ad:	eb 1c                	jmp    15b57cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fad4f>

### 0x15b60eb -> 0x15b60ef; FDE=(22765708, 22766183)
     15b60ce:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     15b60d2:	48 85 c0             	test   rax,rax
     15b60d5:	74 14                	je     15b60eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb66f>
     15b60d7:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     15b60da:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15b60dd:	48 89 df             	mov    rdi,rbx
     15b60e0:	4c 89 e2             	mov    rdx,r12
     15b60e3:	4c 89 f1             	mov    rcx,r14
     15b60e6:	ff 50 20             	call   QWORD PTR [rax+0x20]
     15b60e9:	eb 10                	jmp    15b60fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb67f>
     15b60eb:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     15b60ef:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b60f3:	48 89 df             	mov    rdi,rbx
     15b60f6:	e8 6d 5f 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b60fb:	40 84 ed             	test   bpl,bpl
     15b60fe:	0f 84 d6 00 00 00    	je     15b61da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb75e>
     15b6104:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     15b6108:	0f 85 cc 00 00 00    	jne    15b61da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb75e>
     15b610e:	49 8d b7 b8 02 00 00 	lea    rsi,[r15+0x2b8]
     15b6115:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     15b611a:	e8 c9 1d 5b ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
     15b611f:	4d 8b 67 08          	mov    r12,QWORD PTR [r15+0x8]
     15b6123:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
     15b6128:	4d 89 7e f8          	mov    QWORD PTR [r14-0x8],r15
     15b612c:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     15b6131:	4c 89 f7             	mov    rdi,r14
     15b6134:	e8 73 30 5c ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     15b6139:	48 8d 05 d8 ba e9 fe 	lea    rax,[rip+0xfffffffffee9bad8]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     15b6140:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     15b6145:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     15b614a:	48 83 64 24 28 00    	and    QWORD PTR [rsp+0x28],0x0

### 0x15b634c -> 0x15b6350; FDE=(22766236, 22766698)
     15b6322:	e8 c5 a1 0c 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
     15b6327:	48 89 df             	mov    rdi,rbx
     15b632a:	4c 89 e6             	mov    rsi,r12
     15b632d:	e8 ea 34 50 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     15b6332:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     15b6337:	e8 4a 81 4e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15b633c:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     15b6340:	75 0a                	jne    15b634c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb8d0>
     15b6342:	66 41 c7 86 60 02 00 	mov    WORD PTR [r14+0x260],0x100
     15b6349:	00 00 01 
     15b634c:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b6350:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b6354:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15b635b:	00 00 
     15b635d:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     15b6362:	0f 85 fd 00 00 00    	jne    15b6465 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb9e9>
     15b6368:	4c 89 ff             	mov    rdi,r15
     15b636b:	48 83 c4 20          	add    rsp,0x20
     15b636f:	5b                   	pop    rbx
     15b6370:	41 5c                	pop    r12
     15b6372:	41 5d                	pop    r13
     15b6374:	41 5e                	pop    r14
     15b6376:	41 5f                	pop    r15
     15b6378:	e9 eb 5c 6d ff       	jmp    c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b637d:	49 89 c4             	mov    r12,rax
     15b6380:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
     15b6384:	49 89 e5             	mov    r13,rsp
     15b6387:	4c 89 ef             	mov    rdi,r13
     15b638a:	e8 5d a1 0c 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
     15b638f:	48 89 df             	mov    rdi,rbx
     15b6392:	4c 89 ee             	mov    rsi,r13

### 0x15b63b2 -> 0x15b63b6; FDE=(22766236, 22766698)
     15b638f:	48 89 df             	mov    rdi,rbx
     15b6392:	4c 89 ee             	mov    rsi,r13
     15b6395:	e8 82 34 50 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     15b639a:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     15b639e:	e8 e3 80 4e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15b63a3:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     15b63a7:	74 09                	je     15b63b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb936>
     15b63a9:	49 83 27 00          	and    QWORD PTR [r15],0x0
     15b63ad:	45 31 ed             	xor    r13d,r13d
     15b63b0:	eb 13                	jmp    15b63c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb949>
     15b63b2:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b63b6:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b63ba:	4c 89 ff             	mov    rdi,r15
     15b63bd:	e8 a6 5c 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b63c2:	4d 8b 2f             	mov    r13,QWORD PTR [r15]
     15b63c5:	4d 85 e4             	test   r12,r12
     15b63c8:	74 28                	je     15b63f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb976>
     15b63ca:	4d 85 ed             	test   r13,r13
     15b63cd:	75 23                	jne    15b63f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb976>
     15b63cf:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
     15b63d2:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     15b63d6:	48 89 e7             	mov    rdi,rsp
     15b63d9:	4c 89 e6             	mov    rsi,r12
     15b63dc:	ff 50 10             	call   QWORD PTR [rax+0x10]
     15b63df:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
     15b63e3:	4d 89 2f             	mov    QWORD PTR [r15],r13
     15b63e6:	48 83 24 24 00       	and    QWORD PTR [rsp],0x0
     15b63eb:	31 ff                	xor    edi,edi
     15b63ed:	e8 fa 02 50 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     15b63f2:	4d 85 ed             	test   r13,r13
     15b63f5:	41 0f 94 86 60 02 00 	sete   BYTE PTR [r14+0x260]

### 0x15b6a59 -> 0x15b6a5d; FDE=(22767994, 22768417)
     15b6a37:	48 89 01             	mov    QWORD PTR [rcx],rax
     15b6a3a:	48 89 51 08          	mov    QWORD PTR [rcx+0x8],rdx
     15b6a3e:	49 81 c6 c8 00 00 00 	add    r14,0xc8
     15b6a45:	49 8b 37             	mov    rsi,QWORD PTR [r15]
     15b6a48:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15b6a4b:	48 89 df             	mov    rdi,rbx
     15b6a4e:	4c 89 ea             	mov    rdx,r13
     15b6a51:	4d 89 f0             	mov    r8,r14
     15b6a54:	ff 50 28             	call   QWORD PTR [rax+0x28]
     15b6a57:	eb 46                	jmp    15b6a9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fc023>
     15b6a59:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b6a5d:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b6a61:	48 89 df             	mov    rdi,rbx
     15b6a64:	e8 ff 55 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b6a69:	eb 47                	jmp    15b6ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fc036>
     15b6a6b:	80 7c 24 70 00       	cmp    BYTE PTR [rsp+0x70],0x0
     15b6a70:	74 29                	je     15b6a9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fc01f>
     15b6a72:	48 8d 3d 03 b5 e9 fe 	lea    rdi,[rip+0xfffffffffee9b503]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     15b6a79:	6a 01                	push   0x1
     15b6a7b:	5e                   	pop    rsi
     15b6a7c:	e8 8f 7a 23 00       	call   17ee510 <__strlen_chk@plt>
     15b6a81:	48 8d 0d f4 b4 e9 fe 	lea    rcx,[rip+0xfffffffffee9b4f4]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     15b6a88:	48 89 df             	mov    rdi,rbx
     15b6a8b:	48 89 ce             	mov    rsi,rcx
     15b6a8e:	48 89 c2             	mov    rdx,rax
     15b6a91:	45 31 c0             	xor    r8d,r8d
     15b6a94:	e8 e3 f6 4f ff       	call   ab617c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x311c>
     15b6a99:	eb 04                	jmp    15b6a9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fc023>
     15b6a9b:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     15b6a9f:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     15b6aa3:	e8 44 fc 4f ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>

### 0x161910d -> 0x161911b; FDE=(23171067, 23174059)
     16190e3:	48 81 c6 00 02 00 00 	add    rsi,0x200
     16190ea:	41 ff 54 24 20       	call   QWORD PTR [r12+0x20]
     16190ef:	48 85 c0             	test   rax,rax
     16190f2:	0f 84 8d 04 00 00    	je     1619585 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146f3>
     16190f8:	49 89 84 24 d8 02 00 	mov    QWORD PTR [r12+0x2d8],rax
     16190ff:	00 
     1619100:	4d 89 f8             	mov    r8,r15
     1619103:	41 39 d8             	cmp    r8d,ebx
     1619106:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
     161910b:	7e 19                	jle    1619126 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14294>
     161910d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1619112:	48 89 ee             	mov    rsi,rbp
     1619115:	44 89 c2             	mov    edx,r8d
     1619118:	48 89 c1             	mov    rcx,rax
     161911b:	ff 57 40             	call   QWORD PTR [rdi+0x40]
     161911e:	4d 89 f8             	mov    r8,r15
     1619121:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
     1619126:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
     161912b:	4d 8b 8c 24 d8 02 00 	mov    r9,QWORD PTR [r12+0x2d8]
     1619132:	00 
     1619133:	49 8d 84 24 08 03 00 	lea    rax,[r12+0x308]
     161913a:	00 
     161913b:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     1619140:	31 c9                	xor    ecx,ecx
     1619142:	85 d2                	test   edx,edx
     1619144:	b8 00 00 00 00       	mov    eax,0x0
     1619149:	0f 4f c2             	cmovg  eax,edx
     161914c:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1619151:	b8 00 00 00 00       	mov    eax,0x0
     1619156:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     161915a:	45 85 c0             	test   r8d,r8d

### 0x164d115 -> 0x164d127; FDE=(23384334, 23384405)
     164d0f8:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
     164d0fc:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
     164d100:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     164d104:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
     164d108:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
     164d10d:	c3                   	ret
     164d10e:	41 56                	push   r14
     164d110:	53                   	push   rbx
     164d111:	50                   	push   rax
     164d112:	48 89 fb             	mov    rbx,rdi
     164d115:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]
     164d119:	4d 85 f6             	test   r14,r14
     164d11c:	74 17                	je     164d135 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12a1>
     164d11e:	49 8d 7e 48          	lea    rdi,[r14+0x48]
     164d122:	e8 d5 47 6e ff       	call   d318fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27e89c>
     164d127:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
     164d12b:	e8 82 13 45 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     164d130:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     164d135:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     164d139:	48 85 ff             	test   rdi,rdi
     164d13c:	74 0f                	je     164d14d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12b9>
     164d13e:	be 80 00 00 00       	mov    esi,0x80
     164d143:	e8 c7 6d 6e ff       	call   d33f0f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf95>
     164d148:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
     164d14d:	48 83 c4 08          	add    rsp,0x8
     164d151:	5b                   	pop    rbx
     164d152:	41 5e                	pop    r14
     164d154:	c3                   	ret
     164d155:	cc                   	int3
     164d156:	41 57                	push   r15
     164d158:	41 56                	push   r14

### 0x170cbf0 -> 0x170cbf4; FDE=(24167410, 24176494)
     170cbc4:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     170cbc9:	66 0f 57 c0          	xorpd  xmm0,xmm0
     170cbcd:	66 0f 11 00          	movupd XMMWORD PTR [rax],xmm0
     170cbd1:	48 8d 05 e0 ce 19 00 	lea    rax,[rip+0x19cee0]        # 18a9ab8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x169f8>
     170cbd8:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
     170cbdf:	00 
     170cbe0:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     170cbe5:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     170cbe8:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
     170cbef:	00 
     170cbf0:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     170cbf4:	48 8b 78 40          	mov    rdi,QWORD PTR [rax+0x40]
     170cbf8:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     170cbfc:	e8 35 ec 36 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     170cc01:	49 89 d7             	mov    r15,rdx
     170cc04:	48 f7 c2 00 00 00 80 	test   rdx,0xffffffff80000000
     170cc0b:	4c 8d b4 24 28 02 00 	lea    r14,[rsp+0x228]
     170cc12:	00 
     170cc13:	0f 85 d1 11 00 00    	jne    170ddea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1f56>
     170cc19:	48 8d 0d e8 f1 19 00 	lea    rcx,[rip+0x19f1e8]        # 18abe08 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x18d48>
     170cc20:	48 89 8c 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rcx
     170cc27:	00 
     170cc28:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
     170cc2f:	00 
     170cc30:	44 89 bc 24 a0 01 00 	mov    DWORD PTR [rsp+0x1a0],r15d
     170cc37:	00 
     170cc38:	44 89 bc 24 a4 01 00 	mov    DWORD PTR [rsp+0x1a4],r15d
     170cc3f:	00 
     170cc40:	48 83 a4 24 a8 01 00 	and    QWORD PTR [rsp+0x1a8],0x0
     170cc47:	00 00 
     170cc49:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]

### 0x173789c -> 0x17378a5; FDE=(24344450, 24344852)
     1737872:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     1737875:	48 8d 85 f0 00 00 00 	lea    rax,[rbp+0xf0]
     173787c:	80 7d 0b 00          	cmp    BYTE PTR [rbp+0xb],0x0
     1737880:	74 f0                	je     1737872 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeb9de>
     1737882:	45 31 ff             	xor    r15d,r15d
     1737885:	49 ff c5             	inc    r13
     1737888:	4c 39 e5             	cmp    rbp,r12
     173788b:	0f 85 67 ff ff ff    	jne    17377f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeb964>
     1737891:	44 3b 7c 24 0c       	cmp    r15d,DWORD PTR [rsp+0xc]
     1737896:	0f 85 5c ff ff ff    	jne    17377f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeb964>
     173789c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     17378a1:	4c 8b 78 38          	mov    r15,QWORD PTR [rax+0x38]
     17378a5:	4c 8b 60 40          	mov    r12,QWORD PTR [rax+0x40]
     17378a9:	4d 39 e7             	cmp    r15,r12
     17378ac:	74 40                	je     17378ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeba5a>
     17378ae:	4d 6b ed 18          	imul   r13,r13,0x18
     17378b2:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
     17378b7:	49 8d 7f 08          	lea    rdi,[r15+0x8]
     17378bb:	e8 76 3f 34 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     17378c0:	4c 89 f7             	mov    rdi,r14
     17378c3:	48 89 c6             	mov    rsi,rax
     17378c6:	e8 4f 51 36 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
     17378cb:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     17378ce:	4c 01 ef             	add    rdi,r13
     17378d1:	4c 89 f6             	mov    rsi,r14
     17378d4:	e8 55 41 34 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     17378d9:	4c 89 f7             	mov    rdi,r14
     17378dc:	e8 af 65 0b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     17378e1:	49 83 c7 20          	add    r15,0x20
     17378e5:	49 83 c5 18          	add    r13,0x18
     17378e9:	4d 39 e7             	cmp    r15,r12

### 0x173b14e -> 0x173b16b; FDE=(24355226, 24360599)
     173b124:	00 
     173b125:	e8 48 07 00 00       	call   173b872 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef9de>
     173b12a:	48 89 e8             	mov    rax,rbp
     173b12d:	49 01 ef             	add    r15,rbp
     173b130:	4c 39 7c 24 30       	cmp    QWORD PTR [rsp+0x30],r15
     173b135:	0f 85 a3 f8 ff ff    	jne    173a9de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeeb4a>
     173b13b:	45 8b 7d 20          	mov    r15d,DWORD PTR [r13+0x20]
     173b13f:	41 b8 ff ff ff ff    	mov    r8d,0xffffffff
     173b145:	4d 39 c7             	cmp    r15,r8
     173b148:	0f 84 87 00 00 00    	je     173b1d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef341>
     173b14e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     173b153:	48 8b 00             	mov    rax,QWORD PTR [rax]
     173b156:	83 78 08 00          	cmp    DWORD PTR [rax+0x8],0x0
     173b15a:	7e 57                	jle    173b1b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef31f>
     173b15c:	45 31 ed             	xor    r13d,r13d
     173b15f:	31 c9                	xor    ecx,ecx
     173b161:	31 ed                	xor    ebp,ebp
     173b163:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     173b168:	41 89 cc             	mov    r12d,ecx
     173b16b:	48 8b 50 40          	mov    rdx,QWORD PTR [rax+0x40]
     173b16f:	4c 01 ea             	add    rdx,r13
     173b172:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     173b176:	8b 73 20             	mov    esi,DWORD PTR [rbx+0x20]
     173b179:	e8 06 0f 00 00       	call   173c084 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf01f0>
     173b17e:	41 39 c4             	cmp    r12d,eax
     173b181:	89 c1                	mov    ecx,eax
     173b183:	41 0f 47 cc          	cmova  ecx,r12d
     173b187:	83 f8 ff             	cmp    eax,0xffffffff
     173b18a:	41 0f 44 cc          	cmove  ecx,r12d
     173b18e:	48 ff c5             	inc    rbp
     173b191:	48 8b 03             	mov    rax,QWORD PTR [rbx]

### 0x173b1eb -> 0x173b200; FDE=(24355226, 24360599)
     173b1c6:	89 3c 90             	mov    DWORD PTR [rax+rdx*4],edi
     173b1c9:	41 89 34 97          	mov    DWORD PTR [r15+rdx*4],esi
     173b1cd:	48 ff c2             	inc    rdx
     173b1d0:	48 39 d1             	cmp    rcx,rdx
     173b1d3:	75 ea                	jne    173b1bf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef32b>
     173b1d5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     173b1da:	44 8b 78 40          	mov    r15d,DWORD PTR [rax+0x40]
     173b1de:	4d 39 c7             	cmp    r15,r8
     173b1e1:	0f 84 cc 00 00 00    	je     173b2b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef41f>
     173b1e7:	4f 8d 24 3e          	lea    r12,[r14+r15*1]
     173b1eb:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     173b1f0:	48 8b 00             	mov    rax,QWORD PTR [rax]
     173b1f3:	83 78 08 00          	cmp    DWORD PTR [rax+0x8],0x0
     173b1f7:	7e 7c                	jle    173b275 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef3e1>
     173b1f9:	45 31 ed             	xor    r13d,r13d
     173b1fc:	31 d2                	xor    edx,edx
     173b1fe:	31 ed                	xor    ebp,ebp
     173b200:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     173b204:	42 0f b6 4c 2e 02    	movzx  ecx,BYTE PTR [rsi+r13*1+0x2]
     173b20a:	83 f9 0c             	cmp    ecx,0xc
     173b20d:	74 05                	je     173b214 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef380>
     173b20f:	83 f9 09             	cmp    ecx,0x9
     173b212:	75 40                	jne    173b254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef3c0>
     173b214:	42 f6 44 2e 01 28    	test   BYTE PTR [rsi+r13*1+0x1],0x28
     173b21a:	75 38                	jne    173b254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef3c0>
     173b21c:	42 8a 4c 2e 03       	mov    cl,BYTE PTR [rsi+r13*1+0x3]
     173b221:	f6 c1 08             	test   cl,0x8
     173b224:	75 2e                	jne    173b254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef3c0>
     173b226:	80 e1 07             	and    cl,0x7
     173b229:	80 f9 03             	cmp    cl,0x3
     173b22c:	75 26                	jne    173b254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef3c0>

### 0x17703f5 -> 0x1770411; FDE=(24576692, 24577592)
     17703d3:	5e                   	pop    rsi
     17703d4:	e8 77 ab f7 ff       	call   16eaf50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f0bc>
     17703d9:	e9 9e 01 00 00       	jmp    177057c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1246e8>
     17703de:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     17703e3:	6a 0a                	push   0xa
     17703e5:	5e                   	pop    rsi
     17703e6:	e8 65 ab f7 ff       	call   16eaf50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f0bc>
     17703eb:	0f b6 7b 08          	movzx  edi,BYTE PTR [rbx+0x8]
     17703ef:	40 f6 c7 01          	test   dil,0x1
     17703f3:	74 56                	je     177044b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1245b7>
     17703f5:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     17703f9:	eb 52                	jmp    177044d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1245b9>
     17703fb:	44 8b 7b 08          	mov    r15d,DWORD PTR [rbx+0x8]
     17703ff:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1770404:	6a 0d                	push   0xd
     1770406:	5e                   	pop    rsi
     1770407:	e8 44 ab f7 ff       	call   16eaf50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f0bc>
     177040c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1770411:	48 8b 77 40          	mov    rsi,QWORD PTR [rdi+0x40]
     1770415:	e8 9a fb 39 ff       	call   b0ffb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cf54>
     177041a:	44 89 38             	mov    DWORD PTR [rax],r15d
     177041d:	48 83 c0 04          	add    rax,0x4
     1770421:	eb 79                	jmp    177049c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124608>
     1770423:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
     1770427:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     177042c:	6a 09                	push   0x9
     177042e:	5e                   	pop    rsi
     177042f:	e8 1c ab f7 ff       	call   16eaf50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f0bc>
     1770434:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1770439:	48 8b 77 40          	mov    rsi,QWORD PTR [rdi+0x40]
     177043d:	e8 72 fb 39 ff       	call   b0ffb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cf54>

### 0x178bdaf -> 0x178bdce; FDE=(24689182, 24690599)
     178bd8f:	00 
     178bd90:	4c 89 f6             	mov    rsi,r14
     178bd93:	48 89 ea             	mov    rdx,rbp
     178bd96:	e8 54 f9 ff ff       	call   178b6ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13f85b>
     178bd9b:	4c 39 f0             	cmp    rax,r14
     178bd9e:	73 b2                	jae    178bd52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13febe>
     178bda0:	eb 91                	jmp    178bd33 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fe9f>
     178bda2:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     178bda7:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     178bdac:	48 29 f0             	sub    rax,rsi
     178bdaf:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     178bdb4:	66 c7 84 02 60 3c 00 	mov    WORD PTR [rdx+rax*1+0x3c60],0xa
     178bdbb:	00 0a 00 
     178bdbe:	48 83 c0 02          	add    rax,0x2
     178bdc2:	b9 98 3a 00 00       	mov    ecx,0x3a98
     178bdc7:	48 39 c8             	cmp    rax,rcx
     178bdca:	48 0f 43 c1          	cmovae rax,rcx
     178bdce:	48 89 72 40          	mov    QWORD PTR [rdx+0x40],rsi
     178bdd2:	48 89 42 48          	mov    QWORD PTR [rdx+0x48],rax
     178bdd6:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     178bddb:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     178bddf:	48 8d 9f b8 01 00 00 	lea    rbx,[rdi+0x1b8]
     178bde6:	e8 87 f4 ff ff       	call   178b272 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13f3de>
     178bdeb:	48 8b 00             	mov    rax,QWORD PTR [rax]
     178bdee:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
     178bdf2:	48 29 c8             	sub    rax,rcx
     178bdf5:	48 05 48 fe ff ff    	add    rax,0xfffffffffffffe48
     178bdfb:	48 89 59 58          	mov    QWORD PTR [rcx+0x58],rbx
     178bdff:	48 89 41 60          	mov    QWORD PTR [rcx+0x60],rax
     178be03:	49 8b 5e 08          	mov    rbx,QWORD PTR [r14+0x8]
     178be07:	83 7b 28 03          	cmp    DWORD PTR [rbx+0x28],0x3

