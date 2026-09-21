# Final readiness arg13 pair origin

Known:
- e94b93 loads base = [rsp+0x48]
- e94b98 computes head = base+0x18
- e94b9c saves head to [rsp+0x20]
- e94f60/f68 copy {head, base} to r12+0x138/+0x140
- e95570 passes &r12+0x138 as e99d07 arg13
- e99d07 eventually copies that pair into source+0x178, then owner+0x428

## Containing FDE (15281964, 15306555)

## All writes to stable [rsp+0x48] before e94b93
### 0xe93b2d: mov    BYTE PTR [rsp+0x48],al
      e93af2:	00 
      e93af3:	eb 17                	jmp    e93b0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5af22>
      e93af5:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e93af9:	48 8b 28             	mov    rbp,QWORD PTR [rax]
      e93afc:	41 b7 01             	mov    r15b,0x1
      e93aff:	31 c0                	xor    eax,eax
      e93b01:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      e93b08:	00 
      e93b09:	48 89 ef             	mov    rdi,rbp
      e93b0c:	48 8d 35 26 fa 53 ff 	lea    rsi,[rip+0xffffffffff53fa26]        # 3d3539 <_ZTSN5boost17bad_function_callE@@Base+0x87f>
      e93b13:	48 8d 0d 36 fa 53 ff 	lea    rcx,[rip+0xffffffffff53fa36]        # 3d3550 <_ZTSN5boost17bad_function_callE@@Base+0x896>
      e93b1a:	6a 0b                	push   0xb
      e93b1c:	41 5e                	pop    r14
      e93b1e:	6a 23                	push   0x23
      e93b20:	41 58                	pop    r8
      e93b22:	4c 89 f2             	mov    rdx,r14
      e93b25:	45 31 c9             	xor    r9d,r9d
      e93b28:	e8 5d 38 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e93b2d:	88 44 24 48          	mov    BYTE PTR [rsp+0x48],al
      e93b31:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e93b35:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e93b38:	48 8d 35 1c 0b 54 ff 	lea    rsi,[rip+0xffffffffff540b1c]        # 3d465b <_ZTSN5boost17bad_function_callE@@Base+0x19a1>
      e93b3f:	48 8d 0d 2a 0b 54 ff 	lea    rcx,[rip+0xffffffffff540b2a]        # 3d4670 <_ZTSN5boost17bad_function_callE@@Base+0x19b6>
      e93b46:	6a 27                	push   0x27
      e93b48:	41 58                	pop    r8
      e93b4a:	6a 01                	push   0x1
      e93b4c:	41 59                	pop    r9
      e93b4e:	4c 89 f2             	mov    rdx,r14
      e93b51:	e8 d4 38 75 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
      e93b56:	4d 89 ec             	mov    r12,r13
      e93b59:	41 89 c5             	mov    r13d,eax
      e93b5c:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e93b61:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e93b64:	48 8d 35 09 fa 53 ff 	lea    rsi,[rip+0xffffffffff53fa09]        # 3d3574 <_ZTSN5boost17bad_function_callE@@Base+0x8ba>
      e93b6b:	48 8d 0d 0e fa 53 ff 	lea    rcx,[rip+0xffffffffff53fa0e]        # 3d3580 <_ZTSN5boost17bad_function_callE@@Base+0x8c6>
      e93b72:	6a 2d                	push   0x2d
      e93b74:	41 58                	pop    r8
      e93b76:	4c 89 f2             	mov    rdx,r14
      e93b79:	45 31 c9             	xor    r9d,r9d
      e93b7c:	e8 09 38 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e93b81:	88 84 24 90 01 00 00 	mov    BYTE PTR [rsp+0x190],al
      e93b88:	48 8d 35 c0 fe 53 ff 	lea    rsi,[rip+0xffffffffff53fec0]        # 3d3a4f <_ZTSN5boost17bad_function_callE@@Base+0xd95>
      e93b8f:	48 8d 0d ca fe 53 ff 	lea    rcx,[rip+0xffffffffff53feca]        # 3d3a60 <_ZTSN5boost17bad_function_callE@@Base+0xda6>
      e93b96:	6a 20                	push   0x20
      e93b98:	41 58                	pop    r8
      e93b9a:	48 89 ef             	mov    rdi,rbp

### 0xe94996: mov    QWORD PTR [rsp+0x48],r14
      e94950:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      e94955:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e94959:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
      e9495f:	48 85 c0             	test   rax,rax
      e94962:	74 05                	je     e94969 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bd7f>
      e94964:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e94969:	48 89 df             	mov    rdi,rbx
      e9496c:	e8 15 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94971:	31 ff                	xor    edi,edi
      e94973:	e8 a4 9a c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e94978:	31 ff                	xor    edi,edi
      e9497a:	e8 07 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9497f:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]
      e94986:	00 
      e94987:	e8 fa 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9498c:	49 8b 9d e8 00 00 00 	mov    rbx,QWORD PTR [r13+0xe8]
      e94993:	6a 38                	push   0x38
      e94995:	5f                   	pop    rdi
      e94996:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
      e9499b:	e8 60 95 95 00       	call   17edf00 <_Znwm@plt>
      e949a0:	49 89 c4             	mov    r12,rax
      e949a3:	66 0f ef c0          	pxor   xmm0,xmm0
      e949a7:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
      e949ae:	48 8d 05 5b fa 9a 00 	lea    rax,[rip+0x9afa5b]        # 1844410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf8>
      e949b5:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e949b9:	48 8d 05 88 fa 9a 00 	lea    rax,[rip+0x9afa88]        # 1844448 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb30>
      e949c0:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      e949c5:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      e949cc:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
      e949d3:	00 
      e949d4:	49 89 5c 24 30       	mov    QWORD PTR [r12+0x30],rbx
      e949d9:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e949dd:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e949e0:	66 0f 7f 84 24 20 03 	movdqa XMMWORD PTR [rsp+0x320],xmm0
      e949e7:	00 00 
      e949e9:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0
      e949f0:	00 00 
      e949f2:	48 83 a4 24 10 03 00 	and    QWORD PTR [rsp+0x310],0x0
      e949f9:	00 00 
      e949fb:	48 8d 35 90 f6 53 ff 	lea    rsi,[rip+0xffffffffff53f690]        # 3d4092 <_ZTSN5boost17bad_function_callE@@Base+0x13d8>
      e94a02:	48 8d 0d 97 f6 53 ff 	lea    rcx,[rip+0xffffffffff53f697]        # 3d40a0 <_ZTSN5boost17bad_function_callE@@Base+0x13e6>
      e94a09:	6a 0b                	push   0xb
      e94a0b:	5a                   	pop    rdx
      e94a0c:	6a 1e                	push   0x1e
      e94a0e:	41 58                	pop    r8
      e94a10:	45 31 c9             	xor    r9d,r9d

## Last reaching definition of [rsp+0x48]
(1621, 15288726, 'mov    QWORD PTR [rsp+0x48],r14')
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
      e94925:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
      e94929:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e9492d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e94932:	49 8d 7e 30          	lea    rdi,[r14+0x30]
      e94936:	48 8d 35 12 37 49 ff 	lea    rsi,[rip+0xffffffffff493712]        # 32804f <_ZTSSt12bad_any_cast@@Base-0x68179>
      e9493d:	6a 0a                	push   0xa
      e9493f:	5a                   	pop    rdx
      e94940:	e8 d5 80 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e94945:	49 8d 8d 70 04 00 00 	lea    rcx,[r13+0x470]
      e9494c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e94950:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      e94955:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e94959:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
      e9495f:	48 85 c0             	test   rax,rax
      e94962:	74 05                	je     e94969 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bd7f>
      e94964:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e94969:	48 89 df             	mov    rdi,rbx
      e9496c:	e8 15 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94971:	31 ff                	xor    edi,edi
      e94973:	e8 a4 9a c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e94978:	31 ff                	xor    edi,edi
      e9497a:	e8 07 9b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9497f:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]
      e94986:	00 
      e94987:	e8 fa 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9498c:	49 8b 9d e8 00 00 00 	mov    rbx,QWORD PTR [r13+0xe8]
      e94993:	6a 38                	push   0x38
      e94995:	5f                   	pop    rdi
      e94996:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
      e9499b:	e8 60 95 95 00       	call   17edf00 <_Znwm@plt>
      e949a0:	49 89 c4             	mov    r12,rax
      e949a3:	66 0f ef c0          	pxor   xmm0,xmm0
      e949a7:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
      e949ae:	48 8d 05 5b fa 9a 00 	lea    rax,[rip+0x9afa5b]        # 1844410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf8>
      e949b5:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e949b9:	48 8d 05 88 fa 9a 00 	lea    rax,[rip+0x9afa88]        # 1844448 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb30>
      e949c0:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      e949c5:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      e949cc:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
      e949d3:	00 
      e949d4:	49 89 5c 24 30       	mov    QWORD PTR [r12+0x30],rbx
      e949d9:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e949dd:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e949e0:	66 0f 7f 84 24 20 03 	movdqa XMMWORD PTR [rsp+0x320],xmm0
      e949e7:	00 00 
      e949e9:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0
      e949f0:	00 00 
      e949f2:	48 83 a4 24 10 03 00 	and    QWORD PTR [rsp+0x310],0x0
      e949f9:	00 00 
      e949fb:	48 8d 35 90 f6 53 ff 	lea    rsi,[rip+0xffffffffff53f690]        # 3d4092 <_ZTSN5boost17bad_function_callE@@Base+0x13d8>
      e94a02:	48 8d 0d 97 f6 53 ff 	lea    rcx,[rip+0xffffffffff53f697]        # 3d40a0 <_ZTSN5boost17bad_function_callE@@Base+0x13e6>
      e94a09:	6a 0b                	push   0xb
      e94a0b:	5a                   	pop    rdx
      e94a0c:	6a 1e                	push   0x1e
      e94a0e:	41 58                	pop    r8
      e94a10:	45 31 c9             	xor    r9d,r9d
      e94a13:	e8 72 29 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e94a18:	89 c5                	mov    ebp,eax
      e94a1a:	84 c0                	test   al,al
      e94a1c:	74 68                	je     e94a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5be9c>
      e94a1e:	49 8b 9d 78 05 00 00 	mov    rbx,QWORD PTR [r13+0x578]
      e94a25:	6a 28                	push   0x28
      e94a27:	5f                   	pop    rdi
      e94a28:	e8 d3 94 95 00       	call   17edf00 <_Znwm@plt>
      e94a2d:	66 0f ef c0          	pxor   xmm0,xmm0
      e94a31:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94a36:	48 8d 0d 2b 8a 96 00 	lea    rcx,[rip+0x968a2b]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e94a3d:	48 89 08             	mov    QWORD PTR [rax],rcx
      e94a40:	48 89 c1             	mov    rcx,rax
      e94a43:	48 83 c1 18          	add    rcx,0x18
      e94a47:	48 8d 15 f2 fb 9a 00 	lea    rdx,[rip+0x9afbf2]        # 1844640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd28>
      e94a4e:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e94a52:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e94a56:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e94a5d:	00 
      e94a5e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      e94a61:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e94a65:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]

## Reads of stable [rsp+0x48] before/after pair publication
### 0xe93f5f: mov    cl,BYTE PTR [rsp+0x48]
      e93f3b:	48 8d bd b0 00 00 00 	lea    rdi,[rbp+0xb0]
      e93f42:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      e93f47:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e93f4e:	00 
      e93f4f:	e8 a4 52 cf ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      e93f54:	48 63 45 50          	movsxd rax,DWORD PTR [rbp+0x50]
      e93f58:	48 39 45 28          	cmp    QWORD PTR [rbp+0x28],rax
      e93f5c:	0f 9f c0             	setg   al
      e93f5f:	8a 4c 24 48          	mov    cl,BYTE PTR [rsp+0x48]
      e93f63:	20 c1                	and    cl,al
      e93f65:	88 8d e0 00 00 00    	mov    BYTE PTR [rbp+0xe0],cl
      e93f6b:	8a 84 24 90 01 00 00 	mov    al,BYTE PTR [rsp+0x190]
      e93f72:	88 85 e1 00 00 00    	mov    BYTE PTR [rbp+0xe1],al
      e93f78:	31 c0                	xor    eax,eax
      e93f7a:	88 85 08 01 00 00    	mov    BYTE PTR [rbp+0x108],al
      e93f80:	66 0f ef c0          	pxor   xmm0,xmm0
      e93f84:	f3 0f 7f 85 e8 00 00 	movdqu XMMWORD PTR [rbp+0xe8],xmm0
      e93f8b:	00 
      e93f8c:	f3 0f 7f 85 f1 00 00 	movdqu XMMWORD PTR [rbp+0xf1],xmm0
      e93f93:	00 
      e93f94:	48 8b 84 24 f0 00 00 	mov    rax,QWORD PTR [rsp+0xf0]
      e93f9b:	00 
      e93f9c:	48 89 85 10 01 00 00 	mov    QWORD PTR [rbp+0x110],rax
      e93fa3:	4c 89 a5 18 01 00 00 	mov    QWORD PTR [rbp+0x118],r12
      e93faa:	4c 89 ad 20 01 00 00 	mov    QWORD PTR [rbp+0x120],r13
      e93fb1:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]

### 0xe94b93: mov    r14,QWORD PTR [rsp+0x48]
      e94b72:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e94b79:	00 
      e94b7a:	e8 2f 4f 00 00       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e94b7f:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e94b86:	00 
      e94b87:	e8 fa 98 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94b8c:	31 ff                	xor    edi,edi
      e94b8e:	e8 f3 98 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94b93:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      e94b98:	49 8d 46 18          	lea    rax,[r14+0x18]
      e94b9c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      e94ba1:	49 8d 46 08          	lea    rax,[r14+0x8]
      e94ba5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e94baa:	49 83 c4 18          	add    r12,0x18
      e94bae:	4c 89 a4 24 88 01 00 	mov    QWORD PTR [rsp+0x188],r12
      e94bb5:	00 
      e94bb6:	48 8b 9c 24 00 03 00 	mov    rbx,QWORD PTR [rsp+0x300]
      e94bbd:	00 
      e94bbe:	4c 8b b4 24 08 03 00 	mov    r14,QWORD PTR [rsp+0x308]
      e94bc5:	00 
      e94bc6:	4c 39 f3             	cmp    rbx,r14
      e94bc9:	0f 84 ae 05 00 00    	je     e9517d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c593>
      e94bcf:	40 88 ac 24 88 00 00 	mov    BYTE PTR [rsp+0x88],bpl
      e94bd6:	00 
      e94bd7:	6a 38                	push   0x38
      e94bd9:	5f                   	pop    rdi

### 0xe94f68: mov    r15,QWORD PTR [rsp+0x48]
      e94f46:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
      e94f4d:	00 
      e94f4e:	49 89 84 24 30 01 00 	mov    QWORD PTR [r12+0x130],rax
      e94f55:	00 
      e94f56:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e94f5b:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e94f60:	49 89 84 24 38 01 00 	mov    QWORD PTR [r12+0x138],rax
      e94f67:	00 
      e94f68:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]
      e94f6d:	4d 89 bc 24 40 01 00 	mov    QWORD PTR [r12+0x140],r15
      e94f74:	00 
      e94f75:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e94f7a:	8a 84 24 88 00 00 00 	mov    al,BYTE PTR [rsp+0x88]
      e94f81:	41 88 84 24 48 01 00 	mov    BYTE PTR [r12+0x148],al
      e94f88:	00 
      e94f89:	41 89 ac 24 4c 01 00 	mov    DWORD PTR [r12+0x14c],ebp
      e94f90:	00 
      e94f91:	49 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [r12+0xb0]
      e94f98:	00 
      e94f99:	48 8d 05 f0 f8 9a 00 	lea    rax,[rip+0x9af8f0]        # 1844890 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf78>
      e94fa0:	48 89 84 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rax
      e94fa7:	00 
      e94fa8:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
      e94faf:	00 
      e94fb0:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
      e94fb7:	00 

### 0xe951d3: mov    rax,QWORD PTR [rsp+0x48]
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
      e95214:	66 0f ef c0          	pxor   xmm0,xmm0
      e95218:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0

### 0xe954e4: mov    rbx,QWORD PTR [rsp+0x48]
      e954c2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e954c7:	48 8b 84 24 a8 03 00 	mov    rax,QWORD PTR [rsp+0x3a8]
      e954ce:	00 
      e954cf:	f3 0f 6f 84 24 a0 03 	movdqu xmm0,XMMWORD PTR [rsp+0x3a0]
      e954d6:	00 00 
      e954d8:	66 0f 7f 84 24 f0 0b 	movdqa XMMWORD PTR [rsp+0xbf0],xmm0
      e954df:	00 00 
      e954e1:	48 85 c0             	test   rax,rax
      e954e4:	48 8b 5c 24 48       	mov    rbx,QWORD PTR [rsp+0x48]
      e954e9:	74 05                	je     e954f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c906>
      e954eb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e954f0:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e954f7:	00 
      e954f8:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e954ff:	00 
      e95500:	6a 02                	push   0x2
      e95502:	5a                   	pop    rdx
      e95503:	e8 d6 97 c3 ff       	call   acecde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bc7e>
      e95508:	f3 0f 7e 84 24 f8 00 	movq   xmm0,QWORD PTR [rsp+0xf8]
      e9550f:	00 00 
      e95511:	66 49 0f 6e ce       	movq   xmm1,r14
      e95516:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9551a:	66 0f 7f 8c 24 c0 00 	movdqa XMMWORD PTR [rsp+0xc0],xmm1
      e95521:	00 00 
      e95523:	66 48 0f 6e c3       	movq   xmm0,rbx
      e95528:	f3 0f 7e 4c 24 20    	movq   xmm1,QWORD PTR [rsp+0x20]

## Register backslice from final [rsp+0x48] write
(1621, 15288726, 'r14', 'mov    QWORD PTR [rsp+0x48],r14')
### def 0xe94904: mov    r14,rax
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
      e94925:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
      e94929:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e9492d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e94932:	49 8d 7e 30          	lea    rdi,[r14+0x30]
      e94936:	48 8d 35 12 37 49 ff 	lea    rsi,[rip+0xffffffffff493712]        # 32804f <_ZTSSt12bad_any_cast@@Base-0x68179>
      e9493d:	6a 0a                	push   0xa
      e9493f:	5a                   	pop    rdx
      e94940:	e8 d5 80 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e94945:	49 8d 8d 70 04 00 00 	lea    rcx,[r13+0x470]
      e9494c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e94950:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      e94955:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e94959:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
      e9495f:	48 85 c0             	test   rax,rax
      e94962:	74 05                	je     e94969 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bd7f>
      e94964:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e94969:	48 89 df             	mov    rdi,rbx

### def 0xe948b6: lea    r14,[rsp+0xbe0]
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

### def 0xe94839: lea    r14,[rsp+0xf50]
      e947f9:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14
      e947fd:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
      e94802:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
      e94807:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
      e9480c:	c7 43 68 00 00 80 3f 	mov    DWORD PTR [rbx+0x68],0x3f800000
      e94813:	b8 10 27 00 00       	mov    eax,0x2710
      e94818:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
      e9481c:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
      e94820:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
      e94827:	00 
      e94828:	f3 0f 7f 83 90 00 00 	movdqu XMMWORD PTR [rbx+0x90],xmm0
      e9482f:	00 
      e94830:	41 8a 6f 01          	mov    bpl,BYTE PTR [r15+0x1]
      e94834:	40 84 ed             	test   bpl,bpl
      e94837:	74 22                	je     e9485b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bc71>
      e94839:	4c 8d b4 24 50 0f 00 	lea    r14,[rsp+0xf50]
      e94840:	00 
      e94841:	4c 89 f7             	mov    rdi,r14
      e94844:	e8 ad 51 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e94849:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e94850:	00 
      e94851:	4c 89 f6             	mov    rsi,r14
      e94854:	e8 e5 51 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
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

### def 0xe947f1: lea    r14,[rbx+0x30]
      e947ab:	bf b0 00 00 00       	mov    edi,0xb0
      e947b0:	e8 4b 97 95 00       	call   17edf00 <_Znwm@plt>
      e947b5:	48 89 c3             	mov    rbx,rax
      e947b8:	66 0f ef c0          	pxor   xmm0,xmm0
      e947bc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e947c1:	48 8d 05 a8 d2 99 00 	lea    rax,[rip+0x99d2a8]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e947c8:	48 89 03             	mov    QWORD PTR [rbx],rax
      e947cb:	4c 8d 63 18          	lea    r12,[rbx+0x18]
      e947cf:	48 8d 05 12 e4 99 00 	lea    rax,[rip+0x99e412]        # 1832be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4b80>
      e947d6:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e947da:	66 0f 6f 8c 24 30 0a 	movdqa xmm1,XMMWORD PTR [rsp+0xa30]
      e947e1:	00 00 
      e947e3:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
      e947e8:	66 0f 7f 84 24 30 0a 	movdqa XMMWORD PTR [rsp+0xa30],xmm0
      e947ef:	00 00 
      e947f1:	4c 8d 73 30          	lea    r14,[rbx+0x30]
      e947f5:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
      e947f9:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14
      e947fd:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
      e94802:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
      e94807:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
      e9480c:	c7 43 68 00 00 80 3f 	mov    DWORD PTR [rbx+0x68],0x3f800000
      e94813:	b8 10 27 00 00       	mov    eax,0x2710
      e94818:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
      e9481c:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
      e94820:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
      e94827:	00 
      e94828:	f3 0f 7f 83 90 00 00 	movdqu XMMWORD PTR [rbx+0x90],xmm0
      e9482f:	00 
      e94830:	41 8a 6f 01          	mov    bpl,BYTE PTR [r15+0x1]
      e94834:	40 84 ed             	test   bpl,bpl
      e94837:	74 22                	je     e9485b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bc71>
      e94839:	4c 8d b4 24 50 0f 00 	lea    r14,[rsp+0xf50]
      e94840:	00 
      e94841:	4c 89 f7             	mov    rdi,r14
      e94844:	e8 ad 51 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e94849:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e94850:	00 
      e94851:	4c 89 f6             	mov    rsi,r14

### def 0xe946b4: lea    r14,[rsp+0xa30]
      e9467c:	00 
      e9467d:	e8 de 46 06 00       	call   ef8d60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0176>
      e94682:	6a 30                	push   0x30
      e94684:	5b                   	pop    rbx
      e94685:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
      e94689:	48 81 c7 e0 0b 00 00 	add    rdi,0xbe0
      e94690:	e8 37 a1 c0 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
      e94695:	48 83 c3 d0          	add    rbx,0xffffffffffffffd0
      e94699:	48 83 fb d0          	cmp    rbx,0xffffffffffffffd0
      e9469d:	75 e6                	jne    e94685 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ba9b>
      e9469f:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e946a6:	00 
      e946a7:	e8 be 58 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e946ac:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e946b3:	00 
      e946b4:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
      e946bb:	00 
      e946bc:	4c 89 f6             	mov    rsi,r14
      e946bf:	e8 a8 1c 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e946c4:	48 8d 35 bd 2a b5 00 	lea    rsi,[rip+0xb52abd]        # 19e7188 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1778>
      e946cb:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e946d2:	00 
      e946d3:	e8 aa df 06 00       	call   f02682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9a98>
      e946d8:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
      e946df:	00 
      e946e0:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e946e7:	00 
      e946e8:	6a 01                	push   0x1
      e946ea:	5a                   	pop    rdx
      e946eb:	e8 50 45 06 00       	call   ef8c40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0056>
      e946f0:	48 8d bc 24 f0 0e 00 	lea    rdi,[rsp+0xef0]
      e946f7:	00 
      e946f8:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e946ff:	00 
      e94700:	48 8d 94 24 50 0f 00 	lea    rdx,[rsp+0xf50]
      e94707:	00 
      e94708:	e8 cb 44 7e 00       	call   1678bd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cd44>
      e9470d:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
      e94714:	00 

### def 0xe945fe: lea    r14,[rsp+0xe10]
      e945be:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e945c5:	00 
      e945c6:	e8 9f 59 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e945cb:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
      e945d2:	00 
      e945d3:	e9 64 01 00 00       	jmp    e9473c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bb52>
      e945d8:	48 8d 05 89 0a 9a 00 	lea    rax,[rip+0x9a0a89]        # 1835068 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x7000>
      e945df:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e945e6:	00 
      e945e7:	48 89 06             	mov    QWORD PTR [rsi],rax
      e945ea:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      e945ee:	4c 8d bc 24 d0 0f 00 	lea    r15,[rsp+0xfd0]
      e945f5:	00 
      e945f6:	4c 89 ff             	mov    rdi,r15
      e945f9:	e8 6e 1d 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e945fe:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]
      e94605:	00 
      e94606:	4c 89 f7             	mov    rdi,r14
      e94609:	4c 89 fe             	mov    rsi,r15
      e9460c:	e8 5b 1d 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e94611:	48 8d 35 10 e3 b5 00 	lea    rsi,[rip+0xb5e310]        # 19f2928 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9e7>
      e94618:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9461f:	00 
      e94620:	e8 5d e0 06 00       	call   f02682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9a98>
      e94625:	48 8d bc 24 10 0c 00 	lea    rdi,[rsp+0xc10]
      e9462c:	00 
      e9462d:	48 8d 35 f4 e2 b5 00 	lea    rsi,[rip+0xb5e2f4]        # 19f2928 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9e7>
      e94634:	48 8d 15 4d 2b b5 00 	lea    rdx,[rip+0xb52b4d]        # 19e7188 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1778>
      e9463b:	e8 7a e0 06 00       	call   f026ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9ad0>
      e94640:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e94647:	00 
      e94648:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e9464f:	00 
      e94650:	6a 02                	push   0x2
      e94652:	5a                   	pop    rdx
      e94653:	e8 e8 45 06 00       	call   ef8c40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0056>
      e94658:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e9465f:	00 
      e94660:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]

### def 0xe9453e: lea    r14,[rsp+0xa30]
      e944fc:	48 8d bc 24 c0 0e 00 	lea    rdi,[rsp+0xec0]
      e94503:	00 
      e94504:	e8 57 48 06 00       	call   ef8d60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0176>
      e94509:	41 be 90 00 00 00    	mov    r14d,0x90
      e9450f:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
      e94513:	48 81 c7 e0 0b 00 00 	add    rdi,0xbe0
      e9451a:	e8 ad a2 c0 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
      e9451f:	49 83 c6 d0          	add    r14,0xffffffffffffffd0
      e94523:	49 83 fe d0          	cmp    r14,0xffffffffffffffd0
      e94527:	75 e6                	jne    e9450f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b925>
      e94529:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e94530:	00 
      e94531:	e8 34 5a be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94536:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9453d:	00 
      e9453e:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
      e94545:	00 
      e94546:	4c 89 f6             	mov    rsi,r14
      e94549:	e8 1e 1e 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9454e:	48 8d 35 33 2c b5 00 	lea    rsi,[rip+0xb52c33]        # 19e7188 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1778>
      e94555:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e9455c:	00 
      e9455d:	e8 20 e1 06 00       	call   f02682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9a98>
      e94562:	48 8d bc 24 00 0a 00 	lea    rdi,[rsp+0xa00]
      e94569:	00 
      e9456a:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e94571:	00 
      e94572:	6a 01                	push   0x1
      e94574:	5a                   	pop    rdx
      e94575:	e8 c6 46 06 00       	call   ef8c40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0056>
      e9457a:	48 8d bc 24 f0 0e 00 	lea    rdi,[rsp+0xef0]
      e94581:	00 
      e94582:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e94589:	00 
      e9458a:	48 8d 94 24 00 0a 00 	lea    rdx,[rsp+0xa00]
      e94591:	00 
      e94592:	e8 41 46 7e 00       	call   1678bd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cd44>
      e94597:	48 8d bc 24 00 0a 00 	lea    rdi,[rsp+0xa00]
      e9459e:	00 

### def 0xe9444a: lea    r14,[rsp+0xe10]
      e9440d:	e8 5a 1f 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e94412:	48 8d bc 24 d0 0f 00 	lea    rdi,[rsp+0xfd0]
      e94419:	00 
      e9441a:	48 89 de             	mov    rsi,rbx
      e9441d:	e8 ae 44 06 00       	call   ef88d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbfce6>
      e94422:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e94429:	00 
      e9442a:	e8 3b 5b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9442f:	4c 8d bc 24 50 0f 00 	lea    r15,[rsp+0xf50]
      e94436:	00 
      e94437:	48 8d 9c 24 d0 0f 00 	lea    rbx,[rsp+0xfd0]
      e9443e:	00 
      e9443f:	4c 89 ff             	mov    rdi,r15
      e94442:	48 89 de             	mov    rsi,rbx
      e94445:	e8 22 1f 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9444a:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]
      e94451:	00 
      e94452:	4c 89 f7             	mov    rdi,r14
      e94455:	4c 89 fe             	mov    rsi,r15
      e94458:	e8 0f 1f 01 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
      e9445d:	48 8d 35 c4 e4 b5 00 	lea    rsi,[rip+0xb5e4c4]        # 19f2928 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9e7>
      e94464:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
      e9446b:	00 
      e9446c:	4c 89 ff             	mov    rdi,r15
      e9446f:	e8 0e e2 06 00       	call   f02682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9a98>
      e94474:	4c 8d a4 24 10 0c 00 	lea    r12,[rsp+0xc10]
      e9447b:	00 
      e9447c:	48 8d 35 a5 e4 b5 00 	lea    rsi,[rip+0xb5e4a5]        # 19f2928 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9e7>
      e94483:	48 8d 15 fe 2c b5 00 	lea    rdx,[rip+0xb52cfe]        # 19e7188 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1778>
      e9448a:	4c 89 e7             	mov    rdi,r12
      e9448d:	e8 28 e2 06 00       	call   f026ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9ad0>
      e94492:	4c 8d a4 24 40 0c 00 	lea    r12,[rsp+0xc40]
      e94499:	00 
      e9449a:	48 8d 35 9f e4 b5 00 	lea    rsi,[rip+0xb5e49f]        # 19f2940 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9ff>
      e944a1:	4c 89 e7             	mov    rdi,r12
      e944a4:	e8 d9 e1 06 00       	call   f02682 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9a98>
      e944a9:	4c 8d a4 24 70 0c 00 	lea    r12,[rsp+0xc70]
      e944b0:	00 
      e944b1:	48 8d 35 88 e4 b5 00 	lea    rsi,[rip+0xb5e488]        # 19f2940 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x9ff>

## Stores to +0x18 subobjects near candidate source construction
### store 0xe93679: mov    QWORD PTR [r14+0x18],rax; nearby=[(15283786, '18313c8', 'lea    rax,[rip+0x99dd77]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>'), (15283826, '1844968', 'lea    rax,[rip+0x9b12ef]        # 1844968 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1050>')]
      e93641:	66 0f ef c0          	pxor   xmm0,xmm0
      e93645:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9364a:	48 8d 05 77 dd 99 00 	lea    rax,[rip+0x99dd77]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e93651:	49 89 06             	mov    QWORD PTR [r14],rax
      e93654:	f3 41 0f 6f 85 a8 04 	movdqu xmm0,XMMWORD PTR [r13+0x4a8]
      e9365b:	00 00 
      e9365d:	49 8b 85 b0 04 00 00 	mov    rax,QWORD PTR [r13+0x4b0]
      e93664:	48 85 c0             	test   rax,rax
      e93667:	74 05                	je     e9366e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aa84>
      e93669:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9366e:	4d 8d 6e 18          	lea    r13,[r14+0x18]
      e93672:	48 8d 05 ef 12 9b 00 	lea    rax,[rip+0x9b12ef]        # 1844968 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1050>
      e93679:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e9367d:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
      e93683:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e9368a:	48 85 db             	test   rbx,rbx
      e9368d:	74 36                	je     e936c5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aadb>
      e9368f:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e93694:	4d 8b 7e 20          	mov    r15,QWORD PTR [r14+0x20]
      e93698:	eb 30                	jmp    e936ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aae0>
      e9369a:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e936a1:	00 
      e936a2:	e8 df 61 00 00       	call   e99886 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60c9c>
      e936a7:	66 0f 6f 84 24 e0 0b 	movdqa xmm0,XMMWORD PTR [rsp+0xbe0]
      e936ae:	00 00 
      e936b0:	66 0f 7f 84 24 00 01 	movdqa XMMWORD PTR [rsp+0x100],xmm0
      e936b7:	00 00 
      e936b9:	31 ff                	xor    edi,edi

### store 0xe937a7: mov    QWORD PTR [rbx+0x18],rax; nearby=[(15284096, '18313c8', 'lea    rax,[rip+0x99dc41]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>'), (15284128, '1843e90', 'lea    rax,[rip+0x9b06e9]        # 1843e90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x578>')]
      e9376f:	e8 8c a7 95 00       	call   17edf00 <_Znwm@plt>
      e93774:	48 89 c3             	mov    rbx,rax
      e93777:	66 0f ef c9          	pxor   xmm1,xmm1
      e9377b:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
      e93780:	48 8d 05 41 dc 99 00 	lea    rax,[rip+0x99dc41]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e93787:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9378a:	4c 8d 63 18          	lea    r12,[rbx+0x18]
      e9378e:	66 0f 6f 84 24 10 0e 	movdqa xmm0,XMMWORD PTR [rsp+0xe10]
      e93795:	00 00 
      e93797:	66 0f 7f 8c 24 10 0e 	movdqa XMMWORD PTR [rsp+0xe10],xmm1
      e9379e:	00 00 
      e937a0:	48 8d 05 e9 06 9b 00 	lea    rax,[rip+0x9b06e9]        # 1843e90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x578>
      e937a7:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e937ab:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
      e937b0:	4c 89 6b 30          	mov    QWORD PTR [rbx+0x30],r13
      e937b4:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14
      e937b8:	4c 8d 73 40          	lea    r14,[rbx+0x40]
      e937bc:	4c 89 f7             	mov    rdi,r14
      e937bf:	e8 32 62 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e937c4:	4c 8d 7b 50          	lea    r15,[rbx+0x50]
      e937c8:	4c 89 ff             	mov    rdi,r15
      e937cb:	e8 26 62 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e937d0:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
      e937d7:	66 0f ef c0          	pxor   xmm0,xmm0
      e937db:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
      e937e2:	00 
      e937e3:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      e937e8:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0

### store 0xe938fb: mov    QWORD PTR [r14+0x18],rax; nearby=[(15284454, '18313c8', 'lea    rax,[rip+0x99dadb]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>'), (15284468, '1832c90', 'lea    rax,[rip+0x99f395]        # 1832c90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4c28>')]
      e938c8:	e8 4f ab c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e938cd:	6a 48                	push   0x48
      e938cf:	5f                   	pop    rdi
      e938d0:	e8 2b a6 95 00       	call   17edf00 <_Znwm@plt>
      e938d5:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      e938da:	49 89 c6             	mov    r14,rax
      e938dd:	66 0f ef c0          	pxor   xmm0,xmm0
      e938e1:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e938e6:	48 8d 05 db da 99 00 	lea    rax,[rip+0x99dadb]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e938ed:	49 89 06             	mov    QWORD PTR [r14],rax
      e938f0:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      e938f4:	48 8d 05 95 f3 99 00 	lea    rax,[rip+0x99f395]        # 1832c90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4c28>
      e938fb:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e938ff:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
      e93903:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e93907:	31 c0                	xor    eax,eax
      e93909:	41 88 46 30          	mov    BYTE PTR [r14+0x30],al
      e9390d:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
      e93911:	31 ff                	xor    edi,edi
      e93913:	e8 6e ab c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e93918:	66 49 0f 6e c6       	movq   xmm0,r14
      e9391d:	66 49 0f 6e cf       	movq   xmm1,r15
      e93922:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e93926:	66 0f 7f 8c 24 00 01 	movdqa XMMWORD PTR [rsp+0x100],xmm1
      e9392d:	00 00 
      e9392f:	31 ff                	xor    edi,edi
      e93931:	e8 50 ab c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e93936:	31 ff                	xor    edi,edi

### store 0xe939bc: mov    QWORD PTR [rbx+0x18],rax; nearby=[(15284632, '17fd468', 'lea    rax,[rip+0x969ac9]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>'), (15284661, '18783a0', 'lea    rax,[rip+0x9e49e4]        # 18783a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34a88>')]
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

### store 0xe93bf6: mov    QWORD PTR [r14+0x18],rcx; nearby=[(15285192, '1831a70', 'lea    rcx,[rip+0x99dea1]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>'), (15285202, '18b1aa0', 'mov    rcx,QWORD PTR [rip+0xa1dec7]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>'), (15285242, '1843c70', 'lea    rcx,[rip+0x9b006f]        # 1843c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358>')]
      e93bba:	e8 41 a3 95 00       	call   17edf00 <_Znwm@plt>
      e93bbf:	66 0f ef c0          	pxor   xmm0,xmm0
      e93bc3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e93bc8:	48 8d 0d a1 de 99 00 	lea    rcx,[rip+0x99dea1]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e93bcf:	48 89 08             	mov    QWORD PTR [rax],rcx
      e93bd2:	48 8b 0d c7 de a1 00 	mov    rcx,QWORD PTR [rip+0xa1dec7]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e93bd9:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e93be0:	00 
      e93be1:	49 89 0e             	mov    QWORD PTR [r14],rcx
      e93be4:	48 8d 0d 79 88 be ff 	lea    rcx,[rip+0xffffffffffbe8879]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e93beb:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
      e93bef:	48 8d 0d 2a 19 c4 ff 	lea    rcx,[rip+0xffffffffffc4192a]        # ad5520 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224c0>
      e93bf6:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx
      e93bfa:	48 8d 0d 6f 00 9b 00 	lea    rcx,[rip+0x9b006f]        # 1843c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358>
      e93c01:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      e93c05:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
      e93c0c:	00 
      e93c0d:	48 8d 78 20          	lea    rdi,[rax+0x20]
      e93c11:	4c 89 f6             	mov    rsi,r14
      e93c14:	e8 8d e8 c4 ff       	call   ae24a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f446>
      e93c19:	4c 89 f7             	mov    rdi,r14
      e93c1c:	e8 17 19 c4 ff       	call   ad5538 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224d8>
      e93c21:	4d 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [r12+0xe8]
      e93c28:	00 
      e93c29:	6a 68                	push   0x68
      e93c2b:	5f                   	pop    rdi
      e93c2c:	e8 cf a2 95 00       	call   17edf00 <_Znwm@plt>
      e93c31:	48 89 c3             	mov    rbx,rax

### store 0xe93c01: mov    QWORD PTR [rax+0x18],rcx; nearby=[(15285202, '18b1aa0', 'mov    rcx,QWORD PTR [rip+0xa1dec7]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>'), (15285242, '1843c70', 'lea    rcx,[rip+0x9b006f]        # 1843c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358>')]
      e93bc3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e93bc8:	48 8d 0d a1 de 99 00 	lea    rcx,[rip+0x99dea1]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e93bcf:	48 89 08             	mov    QWORD PTR [rax],rcx
      e93bd2:	48 8b 0d c7 de a1 00 	mov    rcx,QWORD PTR [rip+0xa1dec7]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e93bd9:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e93be0:	00 
      e93be1:	49 89 0e             	mov    QWORD PTR [r14],rcx
      e93be4:	48 8d 0d 79 88 be ff 	lea    rcx,[rip+0xffffffffffbe8879]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e93beb:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
      e93bef:	48 8d 0d 2a 19 c4 ff 	lea    rcx,[rip+0xffffffffffc4192a]        # ad5520 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224c0>
      e93bf6:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx
      e93bfa:	48 8d 0d 6f 00 9b 00 	lea    rcx,[rip+0x9b006f]        # 1843c70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x358>
      e93c01:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      e93c05:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
      e93c0c:	00 
      e93c0d:	48 8d 78 20          	lea    rdi,[rax+0x20]
      e93c11:	4c 89 f6             	mov    rsi,r14
      e93c14:	e8 8d e8 c4 ff       	call   ae24a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f446>
      e93c19:	4c 89 f7             	mov    rdi,r14
      e93c1c:	e8 17 19 c4 ff       	call   ad5538 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224d8>
      e93c21:	4d 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [r12+0xe8]
      e93c28:	00 
      e93c29:	6a 68                	push   0x68
      e93c2b:	5f                   	pop    rdi
      e93c2c:	e8 cf a2 95 00       	call   17edf00 <_Znwm@plt>
      e93c31:	48 89 c3             	mov    rbx,rax
      e93c34:	66 0f ef c0          	pxor   xmm0,xmm0
      e93c38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0

### store 0xe93c5c: mov    QWORD PTR [rbx+0x18],rax; nearby=[(15285309, '17fd468', 'lea    rax,[rip+0x969824]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>'), (15285333, '1843dd8', 'lea    rax,[rip+0x9b017c]        # 1843dd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4c0>')]
      e93c29:	6a 68                	push   0x68
      e93c2b:	5f                   	pop    rdi
      e93c2c:	e8 cf a2 95 00       	call   17edf00 <_Znwm@plt>
      e93c31:	48 89 c3             	mov    rbx,rax
      e93c34:	66 0f ef c0          	pxor   xmm0,xmm0
      e93c38:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e93c3d:	48 8d 05 24 98 96 00 	lea    rax,[rip+0x969824]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e93c44:	48 89 03             	mov    QWORD PTR [rbx],rax
      e93c47:	48 8d 43 18          	lea    rax,[rbx+0x18]
      e93c4b:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e93c50:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
      e93c55:	48 8d 05 7c 01 9b 00 	lea    rax,[rip+0x9b017c]        # 1843dd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4c0>
      e93c5c:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e93c60:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
      e93c64:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
      e93c68:	49 8b b4 24 80 03 00 	mov    rsi,QWORD PTR [r12+0x380]
      e93c6f:	00 
      e93c70:	e8 31 5c 75 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      e93c75:	66 0f ef c0          	pxor   xmm0,xmm0
      e93c79:	f3 0f 7f 43 48       	movdqu XMMWORD PTR [rbx+0x48],xmm0
      e93c7e:	48 89 df             	mov    rdi,rbx
      e93c81:	48 83 c7 58          	add    rdi,0x58
      e93c85:	4c 89 f6             	mov    rsi,r14
      e93c88:	e8 35 da 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e93c8d:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      e93c91:	48 85 ff             	test   rdi,rdi
      e93c94:	74 0a                	je     e93ca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b0b6>
      e93c96:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]

### store 0xe93cfa: mov    QWORD PTR [rax+0x18],rcx; nearby=[(15285481, '18008d0', 'lea    rcx,[rip+0x96cbe0]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>'), (15285491, '1831aa8', 'lea    rcx,[rip+0x99ddae]        # 1831aa8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a40>')]
      e93cc4:	48 89 9c 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rbx
      e93ccb:	00 
      e93ccc:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      e93cd1:	49 8b 9e b0 00 00 00 	mov    rbx,QWORD PTR [r14+0xb0]
      e93cd8:	6a 28                	push   0x28
      e93cda:	5f                   	pop    rdi
      e93cdb:	e8 20 a2 95 00       	call   17edf00 <_Znwm@plt>
      e93ce0:	66 0f ef c0          	pxor   xmm0,xmm0
      e93ce4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e93ce9:	48 8d 0d e0 cb 96 00 	lea    rcx,[rip+0x96cbe0]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
      e93cf0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e93cf3:	48 8d 0d ae dd 99 00 	lea    rcx,[rip+0x99ddae]        # 1831aa8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a40>
      e93cfa:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      e93cfe:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
      e93d05:	00 
      e93d06:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e93d0a:	49 8b 86 b0 02 00 00 	mov    rax,QWORD PTR [r14+0x2b0]
      e93d11:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      e93d18:	00 
      e93d19:	49 8b 9e 20 04 00 00 	mov    rbx,QWORD PTR [r14+0x420]
      e93d20:	48 8d 15 87 f8 53 ff 	lea    rdx,[rip+0xffffffffff53f887]        # 3d35ae <_ZTSN5boost17bad_function_callE@@Base+0x8f4>
      e93d27:	4c 8d 05 92 f8 53 ff 	lea    r8,[rip+0xffffffffff53f892]        # 3d35c0 <_ZTSN5boost17bad_function_callE@@Base+0x906>
      e93d2e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e93d35:	00 
      e93d36:	6a 0b                	push   0xb
      e93d38:	59                   	pop    rcx
      e93d39:	6a 26                	push   0x26
      e93d3b:	41 59                	pop    r9

### store 0xe94253: mov    QWORD PTR [r15+0x18],rax; nearby=[(15286847, '1831b60', 'lea    rax,[rip+0x99d91a]        # 1831b60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3af8>')]
      e94224:	f0 48 ff 03          	lock inc QWORD PTR [rbx]
      e94228:	6a 30                	push   0x30
      e9422a:	5b                   	pop    rbx
      e9422b:	48 89 df             	mov    rdi,rbx
      e9422e:	e8 cd 9c 95 00       	call   17edf00 <_Znwm@plt>
      e94233:	49 89 c7             	mov    r15,rax
      e94236:	66 0f ef c0          	pxor   xmm0,xmm0
      e9423a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9423f:	48 8d 05 1a d9 99 00 	lea    rax,[rip+0x99d91a]        # 1831b60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3af8>
      e94246:	49 89 07             	mov    QWORD PTR [r15],rax
      e94249:	49 8d 47 20          	lea    rax,[r15+0x20]
      e9424d:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
      e94253:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e94257:	6a 48                	push   0x48
      e94259:	5f                   	pop    rdi
      e9425a:	e8 a1 9c 95 00       	call   17edf00 <_Znwm@plt>
      e9425f:	4c 89 f9             	mov    rcx,r15
      e94262:	48 83 c1 18          	add    rcx,0x18
      e94266:	66 0f ef c0          	pxor   xmm0,xmm0
      e9426a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9426f:	48 8d 15 22 d9 99 00 	lea    rdx,[rip+0x99d922]        # 1831b98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3b30>
      e94276:	48 89 10             	mov    QWORD PTR [rax],rdx
      e94279:	48 89 c2             	mov    rdx,rax
      e9427c:	48 83 c2 18          	add    rdx,0x18
      e94280:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e94285:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
      e9428a:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
      e9428f:	48 8b b4 24 90 00 00 	mov    rsi,QWORD PTR [rsp+0x90]

### store 0xe947d6: mov    QWORD PTR [rbx+0x18],rax; nearby=[(15288257, '1831a70', 'lea    rax,[rip+0x99d2a8]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>'), (15288271, '1832be8', 'lea    rax,[rip+0x99e412]        # 1832be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4b80>')]
      e9479c:	48 89 ac 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbp
      e947a3:	00 
      e947a4:	4d 8b bd 70 05 00 00 	mov    r15,QWORD PTR [r13+0x570]
      e947ab:	bf b0 00 00 00       	mov    edi,0xb0
      e947b0:	e8 4b 97 95 00       	call   17edf00 <_Znwm@plt>
      e947b5:	48 89 c3             	mov    rbx,rax
      e947b8:	66 0f ef c0          	pxor   xmm0,xmm0
      e947bc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e947c1:	48 8d 05 a8 d2 99 00 	lea    rax,[rip+0x99d2a8]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
      e947c8:	48 89 03             	mov    QWORD PTR [rbx],rax
      e947cb:	4c 8d 63 18          	lea    r12,[rbx+0x18]
      e947cf:	48 8d 05 12 e4 99 00 	lea    rax,[rip+0x99e412]        # 1832be8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4b80>
      e947d6:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e947da:	66 0f 6f 8c 24 30 0a 	movdqa xmm1,XMMWORD PTR [rsp+0xa30]
      e947e1:	00 00 
      e947e3:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
      e947e8:	66 0f 7f 84 24 30 0a 	movdqa XMMWORD PTR [rsp+0xa30],xmm0
      e947ef:	00 00 
      e947f1:	4c 8d 73 30          	lea    r14,[rbx+0x30]
      e947f5:	4c 89 73 30          	mov    QWORD PTR [rbx+0x30],r14
      e947f9:	4c 89 73 38          	mov    QWORD PTR [rbx+0x38],r14
      e947fd:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
      e94802:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
      e94807:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
      e9480c:	c7 43 68 00 00 80 3f 	mov    DWORD PTR [rbx+0x68],0x3f800000
      e94813:	b8 10 27 00 00       	mov    eax,0x2710
      e94818:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
      e9481c:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax

### store 0xe94921: mov    QWORD PTR [r14+0x18],rax; nearby=[(15288592, '1831a70', 'lea    rax,[rip+0x99d159]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>'), (15288602, '1843bf8', 'lea    rax,[rip+0x9af2d7]        # 1843bf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e0>')]
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
      e94925:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
      e94929:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e9492d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e94932:	49 8d 7e 30          	lea    rdi,[r14+0x30]
      e94936:	48 8d 35 12 37 49 ff 	lea    rsi,[rip+0xffffffffff493712]        # 32804f <_ZTSSt12bad_any_cast@@Base-0x68179>
      e9493d:	6a 0a                	push   0xa
      e9493f:	5a                   	pop    rdx
      e94940:	e8 d5 80 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e94945:	49 8d 8d 70 04 00 00 	lea    rcx,[r13+0x470]
      e9494c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e94950:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      e94955:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e94959:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
      e9495f:	48 85 c0             	test   rax,rax
      e94962:	74 05                	je     e94969 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bd7f>

### store 0xe949c0: mov    QWORD PTR [r12+0x18],rax; nearby=[(15288750, '1844410', 'lea    rax,[rip+0x9afa5b]        # 1844410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf8>'), (15288761, '1844448', 'lea    rax,[rip+0x9afa88]        # 1844448 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb30>')]
      e94987:	e8 fa 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9498c:	49 8b 9d e8 00 00 00 	mov    rbx,QWORD PTR [r13+0xe8]
      e94993:	6a 38                	push   0x38
      e94995:	5f                   	pop    rdi
      e94996:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
      e9499b:	e8 60 95 95 00       	call   17edf00 <_Znwm@plt>
      e949a0:	49 89 c4             	mov    r12,rax
      e949a3:	66 0f ef c0          	pxor   xmm0,xmm0
      e949a7:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
      e949ae:	48 8d 05 5b fa 9a 00 	lea    rax,[rip+0x9afa5b]        # 1844410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf8>
      e949b5:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e949b9:	48 8d 05 88 fa 9a 00 	lea    rax,[rip+0x9afa88]        # 1844448 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb30>
      e949c0:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      e949c5:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      e949cc:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
      e949d3:	00 
      e949d4:	49 89 5c 24 30       	mov    QWORD PTR [r12+0x30],rbx
      e949d9:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e949dd:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e949e0:	66 0f 7f 84 24 20 03 	movdqa XMMWORD PTR [rsp+0x320],xmm0
      e949e7:	00 00 
      e949e9:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0
      e949f0:	00 00 
      e949f2:	48 83 a4 24 10 03 00 	and    QWORD PTR [rsp+0x310],0x0
      e949f9:	00 00 
      e949fb:	48 8d 35 90 f6 53 ff 	lea    rsi,[rip+0xffffffffff53f690]        # 3d4092 <_ZTSN5boost17bad_function_callE@@Base+0x13d8>
      e94a02:	48 8d 0d 97 f6 53 ff 	lea    rcx,[rip+0xffffffffff53f697]        # 3d40a0 <_ZTSN5boost17bad_function_callE@@Base+0x13e6>
      e94a09:	6a 0b                	push   0xb

### store 0xe94a4e: mov    QWORD PTR [rax+0x18],rdx; nearby=[(15288886, '17fd468', 'lea    rcx,[rip+0x968a2b]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>'), (15288903, '1844640', 'lea    rdx,[rip+0x9afbf2]        # 1844640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd28>')]
      e94a1c:	74 68                	je     e94a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5be9c>
      e94a1e:	49 8b 9d 78 05 00 00 	mov    rbx,QWORD PTR [r13+0x578]
      e94a25:	6a 28                	push   0x28
      e94a27:	5f                   	pop    rdi
      e94a28:	e8 d3 94 95 00       	call   17edf00 <_Znwm@plt>
      e94a2d:	66 0f ef c0          	pxor   xmm0,xmm0
      e94a31:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94a36:	48 8d 0d 2b 8a 96 00 	lea    rcx,[rip+0x968a2b]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e94a3d:	48 89 08             	mov    QWORD PTR [rax],rcx
      e94a40:	48 89 c1             	mov    rcx,rax
      e94a43:	48 83 c1 18          	add    rcx,0x18
      e94a47:	48 8d 15 f2 fb 9a 00 	lea    rdx,[rip+0x9afbf2]        # 1844640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd28>
      e94a4e:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e94a52:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e94a56:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e94a5d:	00 
      e94a5e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      e94a61:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e94a65:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e94a6c:	00 
      e94a6d:	e8 3c 50 00 00       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e94a72:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e94a79:	00 
      e94a7a:	e8 07 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94a7f:	31 ff                	xor    edi,edi
      e94a81:	e8 00 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94a86:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e94a8a:	48 8b 38             	mov    rdi,QWORD PTR [rax]

### store 0xe94ac3: mov    QWORD PTR [rax+0x18],rdx; nearby=[(15289003, '17fd468', 'lea    rcx,[rip+0x9689b6]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>'), (15289020, '1844770', 'lea    rdx,[rip+0x9afcad]        # 1844770 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe58>')]
      e94a94:	74 65                	je     e94afb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bf11>
      e94a96:	49 8b 5d 18          	mov    rbx,QWORD PTR [r13+0x18]
      e94a9a:	6a 28                	push   0x28
      e94a9c:	5f                   	pop    rdi
      e94a9d:	e8 5e 94 95 00       	call   17edf00 <_Znwm@plt>
      e94aa2:	66 0f ef c0          	pxor   xmm0,xmm0
      e94aa6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94aab:	48 8d 0d b6 89 96 00 	lea    rcx,[rip+0x9689b6]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e94ab2:	48 89 08             	mov    QWORD PTR [rax],rcx
      e94ab5:	48 89 c1             	mov    rcx,rax
      e94ab8:	48 83 c1 18          	add    rcx,0x18
      e94abc:	48 8d 15 ad fc 9a 00 	lea    rdx,[rip+0x9afcad]        # 1844770 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe58>
      e94ac3:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e94ac7:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e94acb:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e94ad2:	00 
      e94ad3:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      e94ad6:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e94ada:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e94ae1:	00 
      e94ae2:	e8 c7 4f 00 00       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e94ae7:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e94aee:	00 
      e94aef:	e8 92 99 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94af4:	31 ff                	xor    edi,edi
      e94af6:	e8 8b 99 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94afb:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e94aff:	48 8b 38             	mov    rdi,QWORD PTR [rax]

### store 0xe94b57: mov    QWORD PTR [rax+0x18],rdx; nearby=[(15289151, '17fd468', 'lea    rcx,[rip+0x968922]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>'), (15289168, '18446a0', 'lea    rdx,[rip+0x9afb49]        # 18446a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd88>')]
      e94b23:	49 8b 5d 18          	mov    rbx,QWORD PTR [r13+0x18]
      e94b27:	4d 8b b5 78 05 00 00 	mov    r14,QWORD PTR [r13+0x578]
      e94b2e:	6a 30                	push   0x30
      e94b30:	5f                   	pop    rdi
      e94b31:	e8 ca 93 95 00       	call   17edf00 <_Znwm@plt>
      e94b36:	66 0f ef c0          	pxor   xmm0,xmm0
      e94b3a:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94b3f:	48 8d 0d 22 89 96 00 	lea    rcx,[rip+0x968922]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e94b46:	48 89 08             	mov    QWORD PTR [rax],rcx
      e94b49:	48 89 c1             	mov    rcx,rax
      e94b4c:	48 83 c1 18          	add    rcx,0x18
      e94b50:	48 8d 15 49 fb 9a 00 	lea    rdx,[rip+0x9afb49]        # 18446a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd88>
      e94b57:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e94b5b:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e94b5f:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
      e94b63:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e94b6a:	00 
      e94b6b:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      e94b6e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e94b72:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e94b79:	00 
      e94b7a:	e8 2f 4f 00 00       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e94b7f:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e94b86:	00 
      e94b87:	e8 fa 98 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94b8c:	31 ff                	xor    edi,edi
      e94b8e:	e8 f3 98 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94b93:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]

### store 0xe94c13: mov    QWORD PTR [rax+0x18],rdx; nearby=[(15289320, '17fd468', 'lea    rdx,[rip+0x968879]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>'), (15289356, '18446c8', 'lea    rdx,[rip+0x9afab5]        # 18446c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xdb0>')]
      e94bda:	e8 21 93 95 00       	call   17edf00 <_Znwm@plt>
      e94bdf:	66 0f ef c0          	pxor   xmm0,xmm0
      e94be3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94be8:	48 8d 15 79 88 96 00 	lea    rdx,[rip+0x968879]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e94bef:	48 8b 8c 24 10 03 00 	mov    rcx,QWORD PTR [rsp+0x310]
      e94bf6:	00 
      e94bf7:	48 83 a4 24 10 03 00 	and    QWORD PTR [rsp+0x310],0x0
      e94bfe:	00 00 
      e94c00:	48 89 10             	mov    QWORD PTR [rax],rdx
      e94c03:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0
      e94c0a:	00 00 
      e94c0c:	48 8d 15 b5 fa 9a 00 	lea    rdx,[rip+0x9afab5]        # 18446c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xdb0>
      e94c13:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e94c17:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e94c1b:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
      e94c1f:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
      e94c23:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94c2a:	00 
      e94c2b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
      e94c30:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      e94c35:	49 89 c4             	mov    r12,rax
      e94c38:	4c 89 f7             	mov    rdi,r14
      e94c3b:	e8 e2 8e c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e94c40:	48 8d 84 24 90 0e 00 	lea    rax,[rsp+0xe90]
      e94c47:	00 
      e94c48:	48 8d 2d 91 9c 97 00 	lea    rbp,[rip+0x979c91]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e94c4f:	48 89 28             	mov    QWORD PTR [rax],rbp
      e94c52:	4c 8b 2d 47 ce a1 00 	mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>

### store 0xe95232: mov    QWORD PTR [rbx+0x18],rax; nearby=[(15290909, '18313c8', 'lea    rcx,[rip+0x99c1a4]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>'), (15290923, '1832c60', 'lea    rax,[rip+0x99da2e]        # 1832c60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4bf8>')]
      e951fd:	4c 89 b4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r14
      e95204:	00 
      e95205:	e8 f6 8c 95 00       	call   17edf00 <_Znwm@plt>
      e9520a:	48 89 c3             	mov    rbx,rax
      e9520d:	4c 89 f0             	mov    rax,r14
      e95210:	48 83 c0 08          	add    rax,0x8
      e95214:	66 0f ef c0          	pxor   xmm0,xmm0
      e95218:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9521d:	48 8d 0d a4 c1 99 00 	lea    rcx,[rip+0x99c1a4]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e95224:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      e95227:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9522b:	48 8d 05 2e da 99 00 	lea    rax,[rip+0x99da2e]        # 1832c60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4bf8>
      e95232:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e95236:	48 c7 43 20 32 00 00 	mov    QWORD PTR [rbx+0x20],0x32
      e9523d:	00 
      e9523e:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
      e95245:	00 
      e95246:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      e9524a:	4d 85 ff             	test   r15,r15
      e9524d:	74 05                	je     e95254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c66a>
      e9524f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95254:	4c 89 a4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r12
      e9525b:	00 
      e9525c:	4c 89 63 38          	mov    QWORD PTR [rbx+0x38],r12
      e95260:	4c 89 73 40          	mov    QWORD PTR [rbx+0x40],r14
      e95264:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e95269:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      e95270:	00 00 

### store 0xe9566f: mov    QWORD PTR [r12+0x18],rax; nearby=[(15291979, '17fd468', 'lea    rax,[rip+0x967e16]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>'), (15292008, '1832b08', 'lea    rax,[rip+0x99d499]        # 1832b08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4aa0>')]
      e95639:	00 
      e9563a:	4c 89 ac 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],r13
      e95641:	00 
      e95642:	66 0f ef c9          	pxor   xmm1,xmm1
      e95646:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
      e9564b:	48 8d 05 16 7e 96 00 	lea    rax,[rip+0x967e16]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e95652:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e95656:	66 0f 6f 84 24 10 0e 	movdqa xmm0,XMMWORD PTR [rsp+0xe10]
      e9565d:	00 00 
      e9565f:	66 0f 7f 8c 24 10 0e 	movdqa XMMWORD PTR [rsp+0xe10],xmm1
      e95666:	00 00 
      e95668:	48 8d 05 99 d4 99 00 	lea    rax,[rip+0x99d499]        # 1832b08 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4aa0>
      e9566f:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      e95674:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      e9567b:	4d 89 74 24 30       	mov    QWORD PTR [r12+0x30],r14
      e95680:	48 8d 35 3d b7 4d ff 	lea    rsi,[rip+0xffffffffff4db73d]        # 370dc4 <_ZTSSt12bad_any_cast@@Base-0x1f404>
      e95687:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9568e:	00 
      e9568f:	e8 ea 43 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e95694:	4d 8d 7c 24 18       	lea    r15,[r12+0x18]
      e95699:	49 8d 5c 24 38       	lea    rbx,[r12+0x38]
      e9569e:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e956a5:	00 
      e956a6:	48 89 df             	mov    rdi,rbx
      e956a9:	4c 89 f6             	mov    rsi,r14
      e956ac:	4c 89 ea             	mov    rdx,r13
      e956af:	e8 66 c0 92 00       	call   17c171a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175886>
      e956b4:	4c 89 ef             	mov    rdi,r13

### store 0xe9583a: mov    QWORD PTR [r15+0x18],rax; nearby=[(15292457, '17fd468', 'lea    rax,[rip+0x967c38]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>'), (15292467, '1843bc0', 'lea    rax,[rip+0x9ae386]        # 1843bc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2a8>')]
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
      e95857:	6a 08                	push   0x8
      e95859:	5a                   	pop    rdx
      e9585a:	e8 bb 71 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e9585f:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e95864:	4c 8b 35 35 c2 a1 00 	mov    r14,QWORD PTR [rip+0xa1c235]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e9586b:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      e95870:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e95874:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e95878:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
      e9587e:	48 85 c0             	test   rax,rax

### store 0xe96cf5: mov    QWORD PTR [r14+0x18],rbp; nearby=[(15297771, '1832118', 'lea    rax,[rip+0x99b426]        # 1832118 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe5a338>')]
      e96cc6:	e8 09 d4 d6 ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
      e96ccb:	49 89 2e             	mov    QWORD PTR [r14],rbp
      e96cce:	6a 20                	push   0x20
      e96cd0:	5f                   	pop    rdi
      e96cd1:	4c 8b 64 24 68       	mov    r12,QWORD PTR [rsp+0x68]
      e96cd6:	e8 25 72 95 00       	call   17edf00 <_Znwm@plt>
      e96cdb:	49 89 c6             	mov    r14,rax
      e96cde:	49 89 c5             	mov    r13,rax
      e96ce1:	66 0f ef c0          	pxor   xmm0,xmm0
      e96ce5:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      e96ceb:	48 8d 05 26 b4 99 00 	lea    rax,[rip+0x99b426]        # 1832118 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe5a338>
      e96cf2:	49 89 06             	mov    QWORD PTR [r14],rax
      e96cf5:	49 89 6e 18          	mov    QWORD PTR [r14+0x18],rbp
      e96cf9:	66 49 0f 6e c6       	movq   xmm0,r14
      e96cfe:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e96d05:	00 00 
      e96d07:	66 48 0f 6e cd       	movq   xmm1,rbp
      e96d0c:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e96d10:	66 0f 7f 4c 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm1
      e96d16:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
      e96d1a:	48 85 c0             	test   rax,rax
      e96d1d:	74 0a                	je     e96d29 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e13f>
      e96d1f:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e96d23:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
      e96d27:	75 2c                	jne    e96d55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e16b>
      e96d29:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      e96d2e:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e96d33:	48 89 e8             	mov    rax,rbp

### store 0xe96e90: mov    QWORD PTR [r15+0x18],rax; nearby=[(15298170, '1831cf0', 'lea    rcx,[rip+0x99ae6f]        # 1831cf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3c88>')]
      e96e58:	00 
      e96e59:	e8 28 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96e5e:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96e65:	00 
      e96e66:	4c 89 ff             	mov    rdi,r15
      e96e69:	e8 7a 39 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e96e6e:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e96e73:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
      e96e7a:	48 8d 0d 6f ae 99 00 	lea    rcx,[rip+0x99ae6f]        # 1831cf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3c88>
      e96e81:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e96e84:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96e8a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      e96e90:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e96e94:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e96e98:	48 8b 5c 24 58       	mov    rbx,QWORD PTR [rsp+0x58]
      e96e9d:	4c 8b a4 24 f0 01 00 	mov    r12,QWORD PTR [rsp+0x1f0]
      e96ea4:	00 
      e96ea5:	4c 39 63 40          	cmp    QWORD PTR [rbx+0x40],r12
      e96ea9:	74 30                	je     e96edb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e2f1>
      e96eab:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96eb2:	00 
      e96eb3:	4c 89 ff             	mov    rdi,r15
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]

### store 0xe973ef: mov    QWORD PTR [r14+0x18],rax; nearby=[(15299536, '1831dc8', 'lea    rax,[rip+0x99a9f1]        # 1831dc8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d60>'), (15299560, '18341e0', 'lea    rax,[rip+0x99cdf1]        # 18341e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6178>')]
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
      e973ef:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e973f3:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e973f7:	48 8b 80 d8 fe ff ff 	mov    rax,QWORD PTR [rax-0x128]
      e973fe:	48 01 e8             	add    rax,rbp
      e97401:	48 8d 94 24 50 10 00 	lea    rdx,[rsp+0x1050]
      e97408:	00 
      e97409:	48 89 02             	mov    QWORD PTR [rdx],rax
      e9740c:	4c 89 7a 08          	mov    QWORD PTR [rdx+0x8],r15
      e97410:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e97415:	48 8d 35 e4 ce 99 00 	lea    rsi,[rip+0x99cee4]        # 1834300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6298>
      e9741c:	4c 89 ef             	mov    rdi,r13
      e9741f:	e8 5a 24 03 00       	call   ec987e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90c94>
      e97424:	4c 89 ff             	mov    rdi,r15
      e97427:	e8 5a 70 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9742c:	48 8d 05 5d c3 99 00 	lea    rax,[rip+0x99c35d]        # 1833790 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5728>
      e97433:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax

### store 0xe97433: mov    QWORD PTR [r14+0x18],rax; nearby=[(15299605, '1834300', 'lea    rsi,[rip+0x99cee4]        # 1834300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6298>'), (15299628, '1833790', 'lea    rax,[rip+0x99c35d]        # 1833790 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5728>'), (15299639, '18339e0', 'lea    rax,[rip+0x99c5a2]        # 18339e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5978>')]
      e973fe:	48 01 e8             	add    rax,rbp
      e97401:	48 8d 94 24 50 10 00 	lea    rdx,[rsp+0x1050]
      e97408:	00 
      e97409:	48 89 02             	mov    QWORD PTR [rdx],rax
      e9740c:	4c 89 7a 08          	mov    QWORD PTR [rdx+0x8],r15
      e97410:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e97415:	48 8d 35 e4 ce 99 00 	lea    rsi,[rip+0x99cee4]        # 1834300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6298>
      e9741c:	4c 89 ef             	mov    rdi,r13
      e9741f:	e8 5a 24 03 00       	call   ec987e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90c94>
      e97424:	4c 89 ff             	mov    rdi,r15
      e97427:	e8 5a 70 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9742c:	48 8d 05 5d c3 99 00 	lea    rax,[rip+0x99c35d]        # 1833790 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5728>
      e97433:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e97437:	48 8d 05 a2 c5 99 00 	lea    rax,[rip+0x99c5a2]        # 18339e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5978>
      e9743e:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
      e97442:	49 89 6e 38          	mov    QWORD PTR [r14+0x38],rbp
      e97446:	4d 89 7e 40          	mov    QWORD PTR [r14+0x40],r15
      e9744a:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9744f:	49 8d 7e 48          	lea    rdi,[r14+0x48]
      e97453:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      e97458:	e8 cd 36 7d 00       	call   166ab2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ec96>
      e9745d:	49 8d be 38 0f 00 00 	lea    rdi,[r14+0xf38]
      e97464:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
      e9746b:	00 
      e9746c:	e8 cd dc f6 ff       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>
      e97471:	4d 89 f4             	mov    r12,r14
      e97474:	49 81 c4 90 0f 00 00 	add    r12,0xf90
      e9747b:	4c 89 e7             	mov    rdi,r12

### store 0xe97585: mov    QWORD PTR [r14+0x18],rax; nearby=[(15299952, '1831e00', 'lea    rax,[rip+0x99a889]        # 1831e00 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d98>'), (15299966, '18341e0', 'lea    rax,[rip+0x99cc5b]        # 18341e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6178>'), (15299977, '1833650', 'lea    rsi,[rip+0x99c0c0]        # 1833650 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x55e8>')]
      e9754e:	e8 33 6f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97553:	31 ff                	xor    edi,edi
      e97555:	e8 2c 6f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9755a:	bf e8 00 00 00       	mov    edi,0xe8
      e9755f:	e8 9c 69 95 00       	call   17edf00 <_Znwm@plt>
      e97564:	49 89 c6             	mov    r14,rax
      e97567:	66 0f ef c0          	pxor   xmm0,xmm0
      e9756b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e97570:	48 8d 05 89 a8 99 00 	lea    rax,[rip+0x99a889]        # 1831e00 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d98>
      e97577:	49 89 06             	mov    QWORD PTR [r14],rax
      e9757a:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      e9757e:	48 8d 05 5b cc 99 00 	lea    rax,[rip+0x99cc5b]        # 18341e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6178>
      e97585:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e97589:	48 8d 35 c0 c0 99 00 	lea    rsi,[rip+0x99c0c0]        # 1833650 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x55e8>
      e97590:	48 8d 94 24 20 06 00 	lea    rdx,[rsp+0x620]
      e97597:	00 
      e97598:	4c 89 ff             	mov    rdi,r15
      e9759b:	e8 de 22 03 00       	call   ec987e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90c94>
      e975a0:	48 8d 05 e9 be 99 00 	lea    rax,[rip+0x99bee9]        # 1833490 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5428>
      e975a7:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e975ab:	49 8d 6e 30          	lea    rbp,[r14+0x30]
      e975af:	48 89 ef             	mov    rdi,rbp
      e975b2:	e8 4f db f6 ff       	call   e05106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd218c>
      e975b7:	4d 8b 66 20          	mov    r12,QWORD PTR [r14+0x20]
      e975bb:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
      e975c2:	48 89 bc 24 10 10 00 	mov    QWORD PTR [rsp+0x1010],rdi
      e975c9:	00 
      e975ca:	c6 84 24 18 10 00 00 	mov    BYTE PTR [rsp+0x1018],0x1

### store 0xe975a7: mov    QWORD PTR [r14+0x18],rax; nearby=[(15299966, '18341e0', 'lea    rax,[rip+0x99cc5b]        # 18341e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6178>'), (15299977, '1833650', 'lea    rsi,[rip+0x99c0c0]        # 1833650 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x55e8>'), (15300000, '1833490', 'lea    rax,[rip+0x99bee9]        # 1833490 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5428>')]
      e9756b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e97570:	48 8d 05 89 a8 99 00 	lea    rax,[rip+0x99a889]        # 1831e00 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d98>
      e97577:	49 89 06             	mov    QWORD PTR [r14],rax
      e9757a:	4d 8d 7e 18          	lea    r15,[r14+0x18]
      e9757e:	48 8d 05 5b cc 99 00 	lea    rax,[rip+0x99cc5b]        # 18341e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6178>
      e97585:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e97589:	48 8d 35 c0 c0 99 00 	lea    rsi,[rip+0x99c0c0]        # 1833650 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x55e8>
      e97590:	48 8d 94 24 20 06 00 	lea    rdx,[rsp+0x620]
      e97597:	00 
      e97598:	4c 89 ff             	mov    rdi,r15
      e9759b:	e8 de 22 03 00       	call   ec987e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90c94>
      e975a0:	48 8d 05 e9 be 99 00 	lea    rax,[rip+0x99bee9]        # 1833490 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5428>
      e975a7:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e975ab:	49 8d 6e 30          	lea    rbp,[r14+0x30]
      e975af:	48 89 ef             	mov    rdi,rbp
      e975b2:	e8 4f db f6 ff       	call   e05106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd218c>
      e975b7:	4d 8b 66 20          	mov    r12,QWORD PTR [r14+0x20]
      e975bb:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
      e975c2:	48 89 bc 24 10 10 00 	mov    QWORD PTR [rsp+0x1010],rdi
      e975c9:	00 
      e975ca:	c6 84 24 18 10 00 00 	mov    BYTE PTR [rsp+0x1018],0x1
      e975d1:	01 
      e975d2:	e8 19 6b 95 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
      e975d7:	48 8d 05 ea bf 99 00 	lea    rax,[rip+0x99bfea]        # 18335c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5560>
      e975de:	48 89 84 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rax
      e975e5:	00 
      e975e6:	48 89 ac 24 58 10 00 	mov    QWORD PTR [rsp+0x1058],rbp
      e975ed:	00 

### store 0xe97787: mov    QWORD PTR [rbx+0x18],rax; nearby=[(15300466, '17fd468', 'lea    rax,[rip+0x965cef]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>'), (15300480, '1832b40', 'lea    rax,[rip+0x99b3b9]        # 1832b40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4ad8>')]
      e97758:	00 
      e97759:	e8 28 6d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9775e:	6a 70                	push   0x70
      e97760:	5f                   	pop    rdi
      e97761:	e8 9a 67 95 00       	call   17edf00 <_Znwm@plt>
      e97766:	48 89 c3             	mov    rbx,rax
      e97769:	66 0f ef c0          	pxor   xmm0,xmm0
      e9776d:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e97772:	48 8d 05 ef 5c 96 00 	lea    rax,[rip+0x965cef]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e97779:	48 89 03             	mov    QWORD PTR [rbx],rax
      e9777c:	4c 8d 6b 18          	lea    r13,[rbx+0x18]
      e97780:	48 8d 05 b9 b3 99 00 	lea    rax,[rip+0x99b3b9]        # 1832b40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4ad8>
      e97787:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e9778b:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
      e97790:	f3 41 0f 6f 0c 24    	movdqu xmm1,XMMWORD PTR [r12]
      e97796:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
      e9779b:	48 85 c0             	test   rax,rax
      e9779e:	74 05                	je     e977a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ebbb>
      e977a0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e977a5:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
      e977aa:	4c 8d 73 40          	lea    r14,[rbx+0x40]
      e977ae:	4c 89 f7             	mov    rdi,r14
      e977b1:	e8 40 22 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e977b6:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
      e977ba:	4c 8d 84 24 00 0a 00 	lea    r8,[rsp+0xa00]
      e977c1:	00 
      e977c2:	4d 89 28             	mov    QWORD PTR [r8],r13
      e977c5:	48 8d 35 c5 58 c0 ff 	lea    rsi,[rip+0xffffffffffc058c5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>

## Candidate final inline AP materializations in same FDE
### AP 0x183d258
### AP 0x183d3b0
### AP 0x183d470
## Writes/copies involving the three APs or +0x18 around them
