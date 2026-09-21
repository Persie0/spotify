# TimelineConductor +0xb0 / +0xb8 smart-skip provider trace

Known aliases from constructor entry:
- 0x135d155 lea rax,[this+0xb0]; 0x135d15c -> [rsp+0xa8]
- 0x135d164 lea rax,[this+0xb8]; 0x135d16b -> [rsp+0xa0]
- later primary provider base = *([rsp+0xa8]); dependency+0xb08 = base+0x10
- later fallback provider base = *([rsp+0xa0]); dependency+0xb10 = base+0x10

## Alias slot rsp+0xa8 / TimelineConductor+0xb0
### 0x135d15c: mov    QWORD PTR [rsp+0xa8],rax
     135d120:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     135d127:	00 
     135d128:	48 8d 87 88 00 00 00 	lea    rax,[rdi+0x88]
     135d12f:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
     135d136:	00 
     135d137:	48 8d 87 a0 00 00 00 	lea    rax,[rdi+0xa0]
     135d13e:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     135d145:	00 
     135d146:	48 8d 87 a8 00 00 00 	lea    rax,[rdi+0xa8]
     135d14d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     135d154:	00 
     135d155:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     135d15c:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     135d163:	00 
     135d164:	48 8d 87 b8 00 00 00 	lea    rax,[rdi+0xb8]
     135d16b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     135d172:	00 
     135d173:	48 8d 87 c0 00 00 00 	lea    rax,[rdi+0xc0]
     135d17a:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     135d181:	00 
     135d182:	48 8d 87 c8 00 00 00 	lea    rax,[rdi+0xc8]
     135d189:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     135d18e:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     135d193:	48 8d 87 d8 00 00 00 	lea    rax,[rdi+0xd8]
     135d19a:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
     135d1a1:	00 
     135d1a2:	4c 8b 31             	mov    r14,QWORD PTR [rcx]
     135d1a5:	48 8d 35 19 92 fd fe 	lea    rsi,[rip+0xfffffffffefd9219]        # 3363c5 <_ZTSSt12bad_any_cast@@Base-0x59e03>
     135d1ac:	4c 8d bc 24 d0 0a 00 	lea    r15,[rsp+0xad0]
     135d1b3:	00 
     135d1b4:	4c 89 ff             	mov    rdi,r15
     135d1b7:	4c 89 ac 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r13
     135d1be:	00 
     135d1bf:	e8 ba c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1c4:	4c 8d a4 24 e8 0a 00 	lea    r12,[rsp+0xae8]

### 0x135edad: mov    rax,QWORD PTR [rsp+0xa8]
     135ed7a:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ed81:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ed88:	00 
     135ed89:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ed90:	00 
     135ed91:	4c 89 ef             	mov    rdi,r13
     135ed94:	e8 d1 b1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ed99:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135eda0:	00 
     135eda1:	66 0f ef c0          	pxor   xmm0,xmm0
     135eda5:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135edac:	00 
     135edad:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135edb4:	00 
     135edb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135edb8:	48 89 18             	mov    QWORD PTR [rax],rbx
     135edbb:	48 85 ff             	test   rdi,rdi
     135edbe:	74 06                	je     135edc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a434a>
     135edc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edc3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135edc6:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135edcd:	00 
     135edce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edd1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135edd4:	49 89 c6             	mov    r14,rax
     135edd7:	bf 10 01 00 00       	mov    edi,0x110
     135eddc:	e8 1f f1 48 00       	call   17edf00 <_Znwm@plt>
     135ede1:	48 89 c3             	mov    rbx,rax
     135ede4:	48 8d 05 cd b2 50 00 	lea    rax,[rip+0x50b2cd]        # 186a0b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x267a0>
     135edeb:	48 89 03             	mov    QWORD PTR [rbx],rax
     135edee:	48 8d 05 63 b3 50 00 	lea    rax,[rip+0x50b363]        # 186a158 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26840>
     135edf5:	48 89 84 24 d0 0a 00 	mov    QWORD PTR [rsp+0xad0],rax
     135edfc:	00 
     135edfd:	48 8b 84 24 00 11 00 	mov    rax,QWORD PTR [rsp+0x1100]
     135ee04:	00 

### 0x135f288: mov    rax,QWORD PTR [rsp+0xa8]
     135f258:	48 89 c6             	mov    rsi,rax
     135f25b:	e8 30 b0 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f260:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
     135f265:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
     135f26a:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     135f271:	00 
     135f272:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f275:	48 8b bc 24 08 11 00 	mov    rdi,QWORD PTR [rsp+0x1108]
     135f27c:	00 
     135f27d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f28f:	00 
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 
     135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135f2d6:	48 85 c0             	test   rax,rax
     135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>
     135f2db:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135f2e0:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx

### 0x135feb5: mov    rax,QWORD PTR [rsp+0xa8]
     135fe80:	41 ff 91 c0 00 00 00 	call   QWORD PTR [r9+0xc0]
     135fe87:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135fe8e:	00 
     135fe8f:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     135fe96:	00 
     135fe97:	48 89 de             	mov    rsi,rbx
     135fe9a:	e8 7d 99 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135fe9f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135fea3:	e8 de e5 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fea8:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
     135feaf:	00 
     135feb0:	e8 0b e7 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     135feb5:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135febc:	00 
     135febd:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fec0:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     135fec3:	4c 89 b3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r14
     135feca:	48 8d 35 a0 e4 07 ff 	lea    rsi,[rip+0xffffffffff07e4a0]        # 3de371 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3dc0>
     135fed1:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135fed8:	00 
     135fed9:	6a 01                	push   0x1
     135fedb:	5a                   	pop    rdx
     135fedc:	e8 4b 9b d4 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     135fee1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135fee4:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135feeb:	00 
     135feec:	6a 07                	push   0x7
     135feee:	59                   	pop    rcx
     135feef:	4c 8d 84 24 d0 0a 00 	lea    r8,[rsp+0xad0]
     135fef6:	00 
     135fef7:	4c 89 f6             	mov    rsi,r14
     135fefa:	48 89 da             	mov    rdx,rbx
     135fefd:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     135ff03:	48 81 c3 f8 00 00 00 	add    rbx,0xf8
     135ff0a:	4c 8d b4 24 60 0f 00 	lea    r14,[rsp+0xf60]

### 0x1360b92: mov    rdi,QWORD PTR [rsp+0xa8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>

### alias-slot writes only
     135d15c:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax

## Alias slot rsp+0xa0 / TimelineConductor+0xb8
### 0x135d16b: mov    QWORD PTR [rsp+0xa0],rax
     135d12f:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
     135d136:	00 
     135d137:	48 8d 87 a0 00 00 00 	lea    rax,[rdi+0xa0]
     135d13e:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     135d145:	00 
     135d146:	48 8d 87 a8 00 00 00 	lea    rax,[rdi+0xa8]
     135d14d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     135d154:	00 
     135d155:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     135d15c:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     135d163:	00 
     135d164:	48 8d 87 b8 00 00 00 	lea    rax,[rdi+0xb8]
     135d16b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     135d172:	00 
     135d173:	48 8d 87 c0 00 00 00 	lea    rax,[rdi+0xc0]
     135d17a:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     135d181:	00 
     135d182:	48 8d 87 c8 00 00 00 	lea    rax,[rdi+0xc8]
     135d189:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     135d18e:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     135d193:	48 8d 87 d8 00 00 00 	lea    rax,[rdi+0xd8]
     135d19a:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
     135d1a1:	00 
     135d1a2:	4c 8b 31             	mov    r14,QWORD PTR [rcx]
     135d1a5:	48 8d 35 19 92 fd fe 	lea    rsi,[rip+0xfffffffffefd9219]        # 3363c5 <_ZTSSt12bad_any_cast@@Base-0x59e03>
     135d1ac:	4c 8d bc 24 d0 0a 00 	lea    r15,[rsp+0xad0]
     135d1b3:	00 
     135d1b4:	4c 89 ff             	mov    rdi,r15
     135d1b7:	4c 89 ac 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r13
     135d1be:	00 
     135d1bf:	e8 ba c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1c4:	4c 8d a4 24 e8 0a 00 	lea    r12,[rsp+0xae8]
     135d1cb:	00 
     135d1cc:	48 8d 35 7b 35 00 ff 	lea    rsi,[rip+0xffffffffff00357b]        # 36074e <_ZTSSt12bad_any_cast@@Base-0x2fa7a>
     135d1d3:	4c 89 e7             	mov    rdi,r12

### 0x135eeab: mov    rax,QWORD PTR [rsp+0xa0]
     135ee78:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ee7f:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ee86:	00 
     135ee87:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ee8e:	00 
     135ee8f:	4c 89 ef             	mov    rdi,r13
     135ee92:	e8 d3 b0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ee97:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135ee9e:	00 
     135ee9f:	66 0f ef c0          	pxor   xmm0,xmm0
     135eea3:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135eeaa:	00 
     135eeab:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135eeb2:	00 
     135eeb3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135eeb6:	48 89 18             	mov    QWORD PTR [rax],rbx
     135eeb9:	48 85 ff             	test   rdi,rdi
     135eebc:	74 06                	je     135eec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4448>
     135eebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135eec1:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135eec4:	8a 45 01             	mov    al,BYTE PTR [rbp+0x1]
     135eec7:	88 84 24 20 03 00 00 	mov    BYTE PTR [rsp+0x320],al
     135eece:	8a 45 02             	mov    al,BYTE PTR [rbp+0x2]
     135eed1:	88 84 24 21 03 00 00 	mov    BYTE PTR [rsp+0x321],al
     135eed8:	8a 45 03             	mov    al,BYTE PTR [rbp+0x3]
     135eedb:	88 84 24 22 03 00 00 	mov    BYTE PTR [rsp+0x322],al
     135eee2:	0f 10 45 10          	movups xmm0,XMMWORD PTR [rbp+0x10]
     135eee6:	0f 11 84 24 28 03 00 	movups XMMWORD PTR [rsp+0x328],xmm0
     135eeed:	00 
     135eeee:	0f 10 45 20          	movups xmm0,XMMWORD PTR [rbp+0x20]
     135eef2:	0f 11 84 24 38 03 00 	movups XMMWORD PTR [rsp+0x338],xmm0
     135eef9:	00 
     135eefa:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
     135eefe:	48 89 84 24 48 03 00 	mov    QWORD PTR [rsp+0x348],rax
     135ef05:	00 

### 0x135f2a3: mov    rax,QWORD PTR [rsp+0xa0]
     135f275:	48 8b bc 24 08 11 00 	mov    rdi,QWORD PTR [rsp+0x1108]
     135f27c:	00 
     135f27d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f28f:	00 
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 
     135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135f2d6:	48 85 c0             	test   rax,rax
     135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>
     135f2db:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135f2e0:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
     135f2e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135f2ec:	00 
     135f2ed:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135f2f4:	00 
     135f2f5:	e8 ec dc 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135f2fa:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135f301:	00 

### 0x135ff37: mov    rax,QWORD PTR [rsp+0xa0]
     135ff03:	48 81 c3 f8 00 00 00 	add    rbx,0xf8
     135ff0a:	4c 8d b4 24 60 0f 00 	lea    r14,[rsp+0xf60]
     135ff11:	00 
     135ff12:	48 89 df             	mov    rdi,rbx
     135ff15:	4c 89 f6             	mov    rsi,r14
     135ff18:	e8 ff 98 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135ff1d:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     135ff21:	e8 60 e5 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ff26:	4c 8d bc 24 d0 0a 00 	lea    r15,[rsp+0xad0]
     135ff2d:	00 
     135ff2e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     135ff32:	e8 89 e6 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     135ff37:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135ff3e:	00 
     135ff3f:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135ff42:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135ff47:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     135ff4a:	4c 89 b3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r14
     135ff51:	48 8d 35 48 e4 07 ff 	lea    rsi,[rip+0xffffffffff07e448]        # 3de3a0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3def>
     135ff58:	6a 01                	push   0x1
     135ff5a:	5a                   	pop    rdx
     135ff5b:	4c 89 ff             	mov    rdi,r15
     135ff5e:	e8 c9 9a d4 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
     135ff63:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135ff66:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135ff6d:	00 
     135ff6e:	6a 08                	push   0x8
     135ff70:	59                   	pop    rcx
     135ff71:	4c 8d 84 24 d0 0a 00 	lea    r8,[rsp+0xad0]
     135ff78:	00 
     135ff79:	4c 89 f6             	mov    rsi,r14
     135ff7c:	48 89 da             	mov    rdx,rbx
     135ff7f:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     135ff85:	48 81 c3 f8 00 00 00 	add    rbx,0xf8
     135ff8c:	4c 8d b4 24 60 0f 00 	lea    r14,[rsp+0xf60]

### 0x1360b85: mov    rdi,QWORD PTR [rsp+0xa0]
     1360b4b:	e8 40 d3 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1360b50:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     1360b55:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>

### alias-slot writes only
     135d16b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax

## Direct writes to this+0xb0 and this+0xb8 in constructor
### 0x135d0cc: movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0db:	00 
     135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0
     135d0e3:	00 
     135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0
     135d0eb:	00 
     135d0ec:	38 06                	cmp    BYTE PTR [rsi],al
     135d0ee:	0f 84 1d 30 00 00    	je     1360111 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5695>
     135d0f4:	48 89 f5             	mov    rbp,rsi
     135d0f7:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     135d0fc:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
     135d101:	48 8b 8c 24 88 10 00 	mov    rcx,QWORD PTR [rsp+0x1088]
     135d108:	00 
     135d109:	4c 8d 6f 10          	lea    r13,[rdi+0x10]
     135d10d:	48 8d 47 20          	lea    rax,[rdi+0x20]
     135d111:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
     135d118:	00 
     135d119:	48 8d 87 80 00 00 00 	lea    rax,[rdi+0x80]
     135d120:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     135d127:	00 
     135d128:	48 8d 87 88 00 00 00 	lea    rax,[rdi+0x88]
     135d12f:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
     135d136:	00 
     135d137:	48 8d 87 a0 00 00 00 	lea    rax,[rdi+0xa0]
     135d13e:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax

### 0x135d5bf: mov    DWORD PTR [rsp+0xb8],ebx
     135d587:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d58a:	e8 83 1d 96 ff       	call   cbf312 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20c2b2>
     135d58f:	83 f8 01             	cmp    eax,0x1
     135d592:	b9 00 77 01 00       	mov    ecx,0x17700
     135d597:	ba 80 bb 00 00       	mov    edx,0xbb80
     135d59c:	0f 44 d1             	cmove  edx,ecx
     135d59f:	83 f8 02             	cmp    eax,0x2
     135d5a2:	bb 00 ee 02 00       	mov    ebx,0x2ee00
     135d5a7:	0f 45 da             	cmovne ebx,edx
     135d5aa:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     135d5b1:	00 
     135d5b2:	48 8b b4 24 d8 10 00 	mov    rsi,QWORD PTR [rsp+0x10d8]
     135d5b9:	00 
     135d5ba:	e8 27 0f 1b 00       	call   150e4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353a6a>
     135d5bf:	89 9c 24 b8 00 00 00 	mov    DWORD PTR [rsp+0xb8],ebx
     135d5c6:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135d5cb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135d5ce:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135d5d1:	49 89 c5             	mov    r13,rax
     135d5d4:	48 8d 9c 24 a8 05 00 	lea    rbx,[rsp+0x5a8]
     135d5db:	00 
     135d5dc:	c7 43 f8 01 00 00 01 	mov    DWORD PTR [rbx-0x8],0x1000001
     135d5e3:	48 8d 35 1b d0 fe fe 	lea    rsi,[rip+0xfffffffffefed01b]        # 34a605 <_ZTSSt12bad_any_cast@@Base-0x45bc3>
     135d5ea:	48 89 df             	mov    rdi,rbx
     135d5ed:	e8 8c c4 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d5f2:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     135d5f9:	00 
     135d5fa:	48 8d 35 b0 2f ff fe 	lea    rsi,[rip+0xfffffffffeff2fb0]        # 3505b1 <_ZTSSt12bad_any_cast@@Base-0x3fc17>
     135d601:	e8 78 c4 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d606:	6a 64                	push   0x64
     135d608:	58                   	pop    rax
     135d609:	48 89 84 24 d8 05 00 	mov    QWORD PTR [rsp+0x5d8],rax
     135d610:	00 
     135d611:	66 0f 76 c0          	pcmpeqd xmm0,xmm0
     135d615:	f3 0f 7f 84 24 e0 05 	movdqu XMMWORD PTR [rsp+0x5e0],xmm0
     135d61c:	00 00 
     135d61e:	c6 84 24 f0 05 00 00 	mov    BYTE PTR [rsp+0x5f0],0x0
     135d625:	00 
     135d626:	66 0f ef c0          	pxor   xmm0,xmm0
     135d62a:	f3 0f 7f 84 24 f8 05 	movdqu XMMWORD PTR [rsp+0x5f8],xmm0
     135d631:	00 00 

### 0x135deb9: mov    DWORD PTR [rsp+0xb0],eax
     135de8d:	6a 1c                	push   0x1c
     135de8f:	41 5d                	pop    r13
     135de91:	4c 89 fe             	mov    rsi,r15
     135de94:	48 89 ea             	mov    rdx,rbp
     135de97:	4c 89 f1             	mov    rcx,r14
     135de9a:	4d 89 e8             	mov    r8,r13
     135de9d:	41 b9 10 27 00 00    	mov    r9d,0x2710
     135dea3:	68 60 ea 00 00       	push   0xea60
     135dea8:	6a 00                	push   0x0
     135deaa:	e8 43 97 28 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     135deaf:	58                   	pop    rax
     135deb0:	59                   	pop    rcx
     135deb1:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135deb4:	e8 43 02 96 ff       	call   cbe0fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b09c>
     135deb9:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax
     135dec0:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135dec3:	e8 80 02 96 ff       	call   cbe148 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b0e8>
     135dec8:	89 84 24 ec 00 00 00 	mov    DWORD PTR [rsp+0xec],eax
     135decf:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135ded2:	48 8d 35 d7 f3 07 ff 	lea    rsi,[rip+0xffffffffff07f3d7]        # 3dd2b0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2cff>
     135ded9:	48 89 ea             	mov    rdx,rbp
     135dedc:	48 8d 0d ed f3 07 ff 	lea    rcx,[rip+0xffffffffff07f3ed]        # 3dd2d0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d1f>
     135dee3:	4d 89 e0             	mov    r8,r12
     135dee6:	45 31 c9             	xor    r9d,r9d
     135dee9:	e8 9c 94 28 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
     135deee:	88 44 24 2f          	mov    BYTE PTR [rsp+0x2f],al
     135def2:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135def5:	4c 89 fe             	mov    rsi,r15
     135def8:	48 89 ea             	mov    rdx,rbp
     135defb:	4c 89 f1             	mov    rcx,r14
     135defe:	4d 89 e8             	mov    r8,r13
     135df01:	41 b9 10 27 00 00    	mov    r9d,0x2710
     135df07:	e8 1e 95 28 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     135df0c:	89 84 24 e8 00 00 00 	mov    DWORD PTR [rsp+0xe8],eax
     135df13:	6a 28                	push   0x28
     135df15:	5f                   	pop    rdi
     135df16:	e8 e5 ff 48 00       	call   17edf00 <_Znwm@plt>
     135df1b:	49 89 c7             	mov    r15,rax
     135df1e:	66 0f ef c0          	pxor   xmm0,xmm0
     135df22:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135df27:	48 8d 05 a2 29 4a 00 	lea    rax,[rip+0x4a29a2]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>

### 0x135e4f4: movdqu XMMWORD PTR [r15+0xb8],xmm0
     135e4b0:	4c 89 fe             	mov    rsi,r15
     135e4b3:	e8 18 16 49 00       	call   17efad0 <memcpy@plt>
     135e4b8:	66 41 0f 6f 87 a0 00 	movdqa xmm0,XMMWORD PTR [r15+0xa0]
     135e4bf:	00 00 
     135e4c1:	f3 0f 7f 83 80 01 00 	movdqu XMMWORD PTR [rbx+0x180],xmm0
     135e4c8:	00 
     135e4c9:	49 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [r15+0xb0]
     135e4d0:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
     135e4d7:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     135e4dc:	66 0f ef c0          	pxor   xmm0,xmm0
     135e4e0:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     135e4e5:	41 0f 10 8f b8 00 00 	movups xmm1,XMMWORD PTR [r15+0xb8]
     135e4ec:	00 
     135e4ed:	0f 11 8b 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm1
     135e4f4:	f3 41 0f 7f 87 b8 00 	movdqu XMMWORD PTR [r15+0xb8],xmm0
     135e4fb:	00 00 
     135e4fd:	49 8b 87 c8 00 00 00 	mov    rax,QWORD PTR [r15+0xc8]
     135e504:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
     135e50b:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135e512:	00 
     135e513:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135e517:	48 89 9c 24 90 05 00 	mov    QWORD PTR [rsp+0x590],rbx
     135e51e:	00 
     135e51f:	e8 a6 bd 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     135e524:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
     135e52b:	00 
     135e52c:	e8 a1 27 00 00       	call   1360cd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6256>
     135e531:	bf 10 02 00 00       	mov    edi,0x210
     135e536:	e8 c5 f9 48 00       	call   17edf00 <_Znwm@plt>
     135e53b:	49 89 c4             	mov    r12,rax
     135e53e:	48 8b 84 24 f8 10 00 	mov    rax,QWORD PTR [rsp+0x10f8]
     135e545:	00 
     135e546:	48 8d 70 30          	lea    rsi,[rax+0x30]
     135e54a:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135e551:	00 
     135e552:	e8 39 bd 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135e557:	48 8d 05 1a a7 50 00 	lea    rax,[rip+0x50a71a]        # 1868c78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25360>
     135e55e:	49 89 04 24          	mov    QWORD PTR [r12],rax
     135e562:	66 0f ef c0          	pxor   xmm0,xmm0
     135e566:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
     135e56d:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]

### 0x135e5d6: movdqa XMMWORD PTR [r12+0xb0],xmm0
     135e59f:	31 db                	xor    ebx,ebx
     135e5a1:	41 88 5c 24 68       	mov    BYTE PTR [r12+0x68],bl
     135e5a6:	41 88 9c 24 98 00 00 	mov    BYTE PTR [r12+0x98],bl
     135e5ad:	00 
     135e5ae:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135e5b5:	00 
     135e5b6:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
     135e5bd:	00 
     135e5be:	48 8b 84 24 90 10 00 	mov    rax,QWORD PTR [rsp+0x1090]
     135e5c5:	00 
     135e5c6:	49 89 84 24 a8 00 00 	mov    QWORD PTR [r12+0xa8],rax
     135e5cd:	00 
     135e5ce:	4d 8d bc 24 d0 00 00 	lea    r15,[r12+0xd0]
     135e5d5:	00 
     135e5d6:	66 41 0f 7f 84 24 b0 	movdqa XMMWORD PTR [r12+0xb0],xmm0
     135e5dd:	00 00 00 
     135e5e0:	f3 41 0f 7f 84 24 b9 	movdqu XMMWORD PTR [r12+0xb9],xmm0
     135e5e7:	00 00 00 
     135e5ea:	4c 89 ff             	mov    rdi,r15
     135e5ed:	e8 04 b4 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135e5f2:	49 8d ac 24 e0 00 00 	lea    rbp,[r12+0xe0]
     135e5f9:	00 
     135e5fa:	48 89 ef             	mov    rdi,rbp
     135e5fd:	e8 f4 b3 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135e602:	4d 8d ac 24 f0 00 00 	lea    r13,[r12+0xf0]
     135e609:	00 
     135e60a:	48 8d b4 24 60 0f 00 	lea    rsi,[rsp+0xf60]
     135e611:	00 
     135e612:	4c 89 ef             	mov    rdi,r13
     135e615:	e8 d6 98 77 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
     135e61a:	49 83 a4 24 20 01 00 	and    QWORD PTR [r12+0x120],0x0
     135e621:	00 00 
     135e623:	49 83 a4 24 30 01 00 	and    QWORD PTR [r12+0x130],0x0
     135e62a:	00 00 
     135e62c:	41 88 9c 24 40 01 00 	mov    BYTE PTR [r12+0x140],bl
     135e633:	00 
     135e634:	41 88 9c 24 d0 01 00 	mov    BYTE PTR [r12+0x1d0],bl
     135e63b:	00 
     135e63c:	41 88 9c 24 d8 01 00 	mov    BYTE PTR [r12+0x1d8],bl
     135e643:	00 
     135e644:	41 88 9c 24 f8 01 00 	mov    BYTE PTR [r12+0x1f8],bl

### 0x135ed7a: mov    QWORD PTR [rbx+0xb0],rax
     135ed42:	48 89 d8             	mov    rax,rbx
     135ed45:	48 83 c0 68          	add    rax,0x68
     135ed49:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ed4d:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ed51:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ed58:	00 
     135ed59:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ed5e:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ed65:	00 
     135ed66:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ed6d:	00 80 3f 
     135ed70:	6a 64                	push   0x64
     135ed72:	58                   	pop    rax
     135ed73:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ed7a:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ed81:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ed88:	00 
     135ed89:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ed90:	00 
     135ed91:	4c 89 ef             	mov    rdi,r13
     135ed94:	e8 d1 b1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ed99:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135eda0:	00 
     135eda1:	66 0f ef c0          	pxor   xmm0,xmm0
     135eda5:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135edac:	00 
     135edad:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135edb4:	00 
     135edb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135edb8:	48 89 18             	mov    QWORD PTR [rax],rbx
     135edbb:	48 85 ff             	test   rdi,rdi
     135edbe:	74 06                	je     135edc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a434a>
     135edc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edc3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135edc6:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135edcd:	00 
     135edce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edd1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135edd4:	49 89 c6             	mov    r14,rax
     135edd7:	bf 10 01 00 00       	mov    edi,0x110
     135eddc:	e8 1f f1 48 00       	call   17edf00 <_Znwm@plt>

### 0x135ed81: and    QWORD PTR [rbx+0xb8],0x0
     135ed45:	48 83 c0 68          	add    rax,0x68
     135ed49:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ed4d:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ed51:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ed58:	00 
     135ed59:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ed5e:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ed65:	00 
     135ed66:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ed6d:	00 80 3f 
     135ed70:	6a 64                	push   0x64
     135ed72:	58                   	pop    rax
     135ed73:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ed7a:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ed81:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ed88:	00 
     135ed89:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ed90:	00 
     135ed91:	4c 89 ef             	mov    rdi,r13
     135ed94:	e8 d1 b1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ed99:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135eda0:	00 
     135eda1:	66 0f ef c0          	pxor   xmm0,xmm0
     135eda5:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135edac:	00 
     135edad:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135edb4:	00 
     135edb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135edb8:	48 89 18             	mov    QWORD PTR [rax],rbx
     135edbb:	48 85 ff             	test   rdi,rdi
     135edbe:	74 06                	je     135edc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a434a>
     135edc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edc3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135edc6:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135edcd:	00 
     135edce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edd1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135edd4:	49 89 c6             	mov    r14,rax
     135edd7:	bf 10 01 00 00       	mov    edi,0x110
     135eddc:	e8 1f f1 48 00       	call   17edf00 <_Znwm@plt>
     135ede1:	48 89 c3             	mov    rbx,rax

### 0x135ee78: mov    QWORD PTR [rbx+0xb0],rax
     135ee40:	48 89 d8             	mov    rax,rbx
     135ee43:	48 83 c0 68          	add    rax,0x68
     135ee47:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ee4b:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ee4f:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ee56:	00 
     135ee57:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ee5c:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ee63:	00 
     135ee64:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ee6b:	00 80 3f 
     135ee6e:	6a 64                	push   0x64
     135ee70:	58                   	pop    rax
     135ee71:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ee78:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ee7f:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ee86:	00 
     135ee87:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ee8e:	00 
     135ee8f:	4c 89 ef             	mov    rdi,r13
     135ee92:	e8 d3 b0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ee97:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135ee9e:	00 
     135ee9f:	66 0f ef c0          	pxor   xmm0,xmm0
     135eea3:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135eeaa:	00 
     135eeab:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135eeb2:	00 
     135eeb3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135eeb6:	48 89 18             	mov    QWORD PTR [rax],rbx
     135eeb9:	48 85 ff             	test   rdi,rdi
     135eebc:	74 06                	je     135eec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4448>
     135eebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135eec1:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135eec4:	8a 45 01             	mov    al,BYTE PTR [rbp+0x1]
     135eec7:	88 84 24 20 03 00 00 	mov    BYTE PTR [rsp+0x320],al
     135eece:	8a 45 02             	mov    al,BYTE PTR [rbp+0x2]
     135eed1:	88 84 24 21 03 00 00 	mov    BYTE PTR [rsp+0x321],al
     135eed8:	8a 45 03             	mov    al,BYTE PTR [rbp+0x3]
     135eedb:	88 84 24 22 03 00 00 	mov    BYTE PTR [rsp+0x322],al
     135eee2:	0f 10 45 10          	movups xmm0,XMMWORD PTR [rbp+0x10]

### 0x135ee7f: and    QWORD PTR [rbx+0xb8],0x0
     135ee43:	48 83 c0 68          	add    rax,0x68
     135ee47:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ee4b:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ee4f:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ee56:	00 
     135ee57:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ee5c:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ee63:	00 
     135ee64:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ee6b:	00 80 3f 
     135ee6e:	6a 64                	push   0x64
     135ee70:	58                   	pop    rax
     135ee71:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ee78:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ee7f:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ee86:	00 
     135ee87:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ee8e:	00 
     135ee8f:	4c 89 ef             	mov    rdi,r13
     135ee92:	e8 d3 b0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ee97:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135ee9e:	00 
     135ee9f:	66 0f ef c0          	pxor   xmm0,xmm0
     135eea3:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135eeaa:	00 
     135eeab:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135eeb2:	00 
     135eeb3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135eeb6:	48 89 18             	mov    QWORD PTR [rax],rbx
     135eeb9:	48 85 ff             	test   rdi,rdi
     135eebc:	74 06                	je     135eec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4448>
     135eebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135eec1:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135eec4:	8a 45 01             	mov    al,BYTE PTR [rbp+0x1]
     135eec7:	88 84 24 20 03 00 00 	mov    BYTE PTR [rsp+0x320],al
     135eece:	8a 45 02             	mov    al,BYTE PTR [rbp+0x2]
     135eed1:	88 84 24 21 03 00 00 	mov    BYTE PTR [rsp+0x321],al
     135eed8:	8a 45 03             	mov    al,BYTE PTR [rbp+0x3]
     135eedb:	88 84 24 22 03 00 00 	mov    BYTE PTR [rsp+0x322],al
     135eee2:	0f 10 45 10          	movups xmm0,XMMWORD PTR [rbp+0x10]
     135eee6:	0f 11 84 24 28 03 00 	movups XMMWORD PTR [rsp+0x328],xmm0

### 0x135f509: mov    QWORD PTR [r14+0xb0],rax
     135f4cf:	0f 10 40 68          	movups xmm0,XMMWORD PTR [rax+0x68]
     135f4d3:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0
     135f4da:	00 
     135f4db:	48 8b 40 78          	mov    rax,QWORD PTR [rax+0x78]
     135f4df:	49 89 86 98 00 00 00 	mov    QWORD PTR [r14+0x98],rax
     135f4e6:	0f 57 c0             	xorps  xmm0,xmm0
     135f4e9:	48 8d 84 24 88 03 00 	lea    rax,[rsp+0x388]
     135f4f0:	00 
     135f4f1:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     135f4f6:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     135f4f9:	0f 10 4d e8          	movups xmm1,XMMWORD PTR [rbp-0x18]
     135f4fd:	41 0f 29 8e a0 00 00 	movaps XMMWORD PTR [r14+0xa0],xmm1
     135f504:	00 
     135f505:	48 8b 45 f8          	mov    rax,QWORD PTR [rbp-0x8]
     135f509:	49 89 86 b0 00 00 00 	mov    QWORD PTR [r14+0xb0],rax
     135f510:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     135f515:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     135f51a:	f3 0f 6f 45 00       	movdqu xmm0,XMMWORD PTR [rbp+0x0]
     135f51f:	f3 41 0f 7f 86 b8 00 	movdqu XMMWORD PTR [r14+0xb8],xmm0
     135f526:	00 00 
     135f528:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f52f:	00 
     135f530:	49 89 86 c8 00 00 00 	mov    QWORD PTR [r14+0xc8],rax
     135f537:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135f53e:	00 
     135f53f:	49 89 86 d0 00 00 00 	mov    QWORD PTR [r14+0xd0],rax
     135f546:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135f54b:	49 89 86 d8 00 00 00 	mov    QWORD PTR [r14+0xd8],rax
     135f552:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     135f557:	49 89 86 e0 00 00 00 	mov    QWORD PTR [r14+0xe0],rax
     135f55e:	49 8d be f0 00 00 00 	lea    rdi,[r14+0xf0]
     135f565:	48 8d b4 24 40 0e 00 	lea    rsi,[rsp+0xe40]
     135f56c:	00 
     135f56d:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
     135f572:	e8 27 fa 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
     135f577:	4d 8d ae b0 01 00 00 	lea    r13,[r14+0x1b0]
     135f57e:	48 8b 84 24 30 0e 00 	mov    rax,QWORD PTR [rsp+0xe30]
     135f585:	00 
     135f586:	48 85 c0             	test   rax,rax
     135f589:	74 1e                	je     135f5a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4b2d>
     135f58b:	48 8d 8c 24 10 0e 00 	lea    rcx,[rsp+0xe10]

### 0x135f51f: movdqu XMMWORD PTR [r14+0xb8],xmm0
     135f4df:	49 89 86 98 00 00 00 	mov    QWORD PTR [r14+0x98],rax
     135f4e6:	0f 57 c0             	xorps  xmm0,xmm0
     135f4e9:	48 8d 84 24 88 03 00 	lea    rax,[rsp+0x388]
     135f4f0:	00 
     135f4f1:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     135f4f6:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     135f4f9:	0f 10 4d e8          	movups xmm1,XMMWORD PTR [rbp-0x18]
     135f4fd:	41 0f 29 8e a0 00 00 	movaps XMMWORD PTR [r14+0xa0],xmm1
     135f504:	00 
     135f505:	48 8b 45 f8          	mov    rax,QWORD PTR [rbp-0x8]
     135f509:	49 89 86 b0 00 00 00 	mov    QWORD PTR [r14+0xb0],rax
     135f510:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     135f515:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     135f51a:	f3 0f 6f 45 00       	movdqu xmm0,XMMWORD PTR [rbp+0x0]
     135f51f:	f3 41 0f 7f 86 b8 00 	movdqu XMMWORD PTR [r14+0xb8],xmm0
     135f526:	00 00 
     135f528:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f52f:	00 
     135f530:	49 89 86 c8 00 00 00 	mov    QWORD PTR [r14+0xc8],rax
     135f537:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135f53e:	00 
     135f53f:	49 89 86 d0 00 00 00 	mov    QWORD PTR [r14+0xd0],rax
     135f546:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135f54b:	49 89 86 d8 00 00 00 	mov    QWORD PTR [r14+0xd8],rax
     135f552:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     135f557:	49 89 86 e0 00 00 00 	mov    QWORD PTR [r14+0xe0],rax
     135f55e:	49 8d be f0 00 00 00 	lea    rdi,[r14+0xf0]
     135f565:	48 8d b4 24 40 0e 00 	lea    rsi,[rsp+0xe40]
     135f56c:	00 
     135f56d:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
     135f572:	e8 27 fa 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
     135f577:	4d 8d ae b0 01 00 00 	lea    r13,[r14+0x1b0]
     135f57e:	48 8b 84 24 30 0e 00 	mov    rax,QWORD PTR [rsp+0xe30]
     135f585:	00 
     135f586:	48 85 c0             	test   rax,rax
     135f589:	74 1e                	je     135f5a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4b2d>
     135f58b:	48 8d 8c 24 10 0e 00 	lea    rcx,[rsp+0xe10]
     135f592:	00 
     135f593:	48 39 c8             	cmp    rax,rcx
     135f596:	74 1e                	je     135f5b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4b3a>
     135f598:	48 8d 8c 24 30 0e 00 	lea    rcx,[rsp+0xe30]

### 0x135f641: mov    QWORD PTR [rsp+0xb8],rbp
     135f607:	48 83 21 00          	and    QWORD PTR [rcx],0x0
     135f60b:	eb 18                	jmp    135f625 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4ba9>
     135f60d:	49 89 ae 00 02 00 00 	mov    QWORD PTR [r14+0x200],rbp
     135f614:	48 8d bc 24 80 0d 00 	lea    rdi,[rsp+0xd80]
     135f61b:	00 
     135f61c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f61f:	48 89 ee             	mov    rsi,rbp
     135f622:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135f625:	49 8d b6 10 02 00 00 	lea    rsi,[r14+0x210]
     135f62c:	48 8b 84 24 90 05 00 	mov    rax,QWORD PTR [rsp+0x590]
     135f633:	00 
     135f634:	48 85 c0             	test   rax,rax
     135f637:	48 89 5c 24 68       	mov    QWORD PTR [rsp+0x68],rbx
     135f63c:	4c 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],r13
     135f641:	48 89 ac 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rbp
     135f648:	00 
     135f649:	48 89 b4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rsi
     135f650:	00 
     135f651:	74 1e                	je     135f671 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4bf5>
     135f653:	48 8d 8c 24 70 05 00 	lea    rcx,[rsp+0x570]
     135f65a:	00 
     135f65b:	48 39 c8             	cmp    rax,rcx
     135f65e:	74 1e                	je     135f67e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4c02>
     135f660:	48 8d 8c 24 90 05 00 	lea    rcx,[rsp+0x590]
     135f667:	00 
     135f668:	49 89 86 30 02 00 00 	mov    QWORD PTR [r14+0x230],rax
     135f66f:	eb 07                	jmp    135f678 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4bfc>
     135f671:	49 8d 8e 30 02 00 00 	lea    rcx,[r14+0x230]
     135f678:	48 83 21 00          	and    QWORD PTR [rcx],0x0
     135f67c:	eb 15                	jmp    135f693 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4c17>
     135f67e:	49 89 b6 30 02 00 00 	mov    QWORD PTR [r14+0x230],rsi
     135f685:	48 8d bc 24 70 05 00 	lea    rdi,[rsp+0x570]
     135f68c:	00 
     135f68d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f690:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135f693:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     135f698:	49 89 86 40 02 00 00 	mov    QWORD PTR [r14+0x240],rax
     135f69f:	31 db                	xor    ebx,ebx
     135f6a1:	41 88 9e 48 02 00 00 	mov    BYTE PTR [r14+0x248],bl
     135f6a8:	41 88 9e b8 05 00 00 	mov    BYTE PTR [r14+0x5b8],bl
     135f6af:	66 41 83 a6 c0 05 00 	and    WORD PTR [r14+0x5c0],0x0

### 0x135fa1b: mov    QWORD PTR [rsp+0xb0],rdi
     135f9db:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f9de:	4c 89 ee             	mov    rsi,r13
     135f9e1:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135f9e4:	4c 89 ac 24 88 00 00 	mov    QWORD PTR [rsp+0x88],r13
     135f9eb:	00 
     135f9ec:	4c 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r15
     135f9f3:	00 
     135f9f4:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
     135f9f9:	49 89 9e a0 08 00 00 	mov    QWORD PTR [r14+0x8a0],rbx
     135fa00:	49 8d be a8 08 00 00 	lea    rdi,[r14+0x8a8]
     135fa07:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
     135fa0e:	00 
     135fa0f:	e8 ee a3 47 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     135fa14:	49 8d be 00 09 00 00 	lea    rdi,[r14+0x900]
     135fa1b:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
     135fa22:	00 
     135fa23:	e8 e2 1c 96 ff       	call   cc170a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20e6aa>
     135fa28:	31 ed                	xor    ebp,ebp
     135fa2a:	41 88 ae 58 09 00 00 	mov    BYTE PTR [r14+0x958],bpl
     135fa31:	41 88 ae a8 09 00 00 	mov    BYTE PTR [r14+0x9a8],bpl
     135fa38:	41 83 a6 b0 09 00 00 	and    DWORD PTR [r14+0x9b0],0x0
     135fa3f:	00 
     135fa40:	66 41 83 a6 b4 09 00 	and    WORD PTR [r14+0x9b4],0x0
     135fa47:	00 00 
     135fa49:	49 8d 86 b8 09 00 00 	lea    rax,[r14+0x9b8]
     135fa50:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135fa55:	48 8d 9c 24 40 0f 00 	lea    rbx,[rsp+0xf40]
     135fa5c:	00 
     135fa5d:	4c 89 33             	mov    QWORD PTR [rbx],r14
     135fa60:	48 8d 05 fd c9 71 ff 	lea    rax,[rip+0xffffffffff71c9fd]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135fa67:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     135fa6b:	4c 8d 25 b0 5f 00 00 	lea    r12,[rip+0x5fb0]        # 1365a22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aafa6>
     135fa72:	4c 89 63 18          	mov    QWORD PTR [rbx+0x18],r12
     135fa76:	4c 8d ac 24 20 0f 00 	lea    r13,[rsp+0xf20]
     135fa7d:	00 
     135fa7e:	48 8b 8c 24 98 10 00 	mov    rcx,QWORD PTR [rsp+0x1098]
     135fa85:	00 
     135fa86:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
     135fa8a:	48 8d 0d d3 c9 71 ff 	lea    rcx,[rip+0xffffffffff71c9d3]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135fa91:	49 89 4d 10          	mov    QWORD PTR [r13+0x10],rcx
     135fa95:	48 8d 0d 70 72 00 00 	lea    rcx,[rip+0x7270]        # 1366d0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac290>

## Writes through aliases loaded from rsp+a8/a0
### b0 alias rax loaded @0x135edad
     135edad:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135edb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135edb8:	48 89 18             	mov    QWORD PTR [rax],rbx
    CLOBBER  135edc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### b0 alias rax loaded @0x135f288
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
    CLOBBER  135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]

### b0 alias rax loaded @0x135feb5
     135feb5:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135febd:	48 8b 18             	mov    rbx,QWORD PTR [rax]
    CLOBBER  135fee1:	49 8b 06             	mov    rax,QWORD PTR [r14]

### b0 alias rdi loaded @0x1360b92
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
    CLOBBER  1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]

### b8 alias rax loaded @0x135eeab
     135eeab:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135eeb3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135eeb6:	48 89 18             	mov    QWORD PTR [rax],rbx
    CLOBBER  135eebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### b8 alias rax loaded @0x135f2a3
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
    CLOBBER  135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]

### b8 alias rax loaded @0x135ff37
     135ff37:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135ff3f:	48 8b 18             	mov    rbx,QWORD PTR [rax]
    CLOBBER  135ff42:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]

### b8 alias rdi loaded @0x1360b85
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
    CLOBBER  1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]

## Candidate pointer assignments to b0/b8 fields
### field b0; store 0x135edb8: mov    QWORD PTR [rax],rbx
     135ed16:	00 
     135ed17:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ed1e:	00 
     135ed1f:	48 8d 73 10          	lea    rsi,[rbx+0x10]
     135ed23:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
     135ed27:	4c 89 ef             	mov    rdi,r13
     135ed2a:	e8 01 2e 04 00       	call   13a1b30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e70b4>
     135ed2f:	66 0f ef c0          	pxor   xmm0,xmm0
     135ed33:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ed38:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ed3d:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ed42:	48 89 d8             	mov    rax,rbx
     135ed45:	48 83 c0 68          	add    rax,0x68
     135ed49:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ed4d:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ed51:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ed58:	00 
     135ed59:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ed5e:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ed65:	00 
     135ed66:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ed6d:	00 80 3f 
     135ed70:	6a 64                	push   0x64
     135ed72:	58                   	pop    rax
     135ed73:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ed7a:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ed81:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ed88:	00 
     135ed89:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ed90:	00 
     135ed91:	4c 89 ef             	mov    rdi,r13
     135ed94:	e8 d1 b1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ed99:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135eda0:	00 
     135eda1:	66 0f ef c0          	pxor   xmm0,xmm0
     135eda5:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135edac:	00 
     135edad:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135edb4:	00 
     135edb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135edb8:	48 89 18             	mov    QWORD PTR [rax],rbx
     135edbb:	48 85 ff             	test   rdi,rdi
     135edbe:	74 06                	je     135edc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a434a>
     135edc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edc3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135edc6:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135edcd:	00 
     135edce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edd1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135edd4:	49 89 c6             	mov    r14,rax
     135edd7:	bf 10 01 00 00       	mov    edi,0x110
     135eddc:	e8 1f f1 48 00       	call   17edf00 <_Znwm@plt>
     135ede1:	48 89 c3             	mov    rbx,rax
     135ede4:	48 8d 05 cd b2 50 00 	lea    rax,[rip+0x50b2cd]        # 186a0b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x267a0>
     135edeb:	48 89 03             	mov    QWORD PTR [rbx],rax
     135edee:	48 8d 05 63 b3 50 00 	lea    rax,[rip+0x50b363]        # 186a158 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26840>
     135edf5:	48 89 84 24 d0 0a 00 	mov    QWORD PTR [rsp+0xad0],rax
     135edfc:	00 
     135edfd:	48 8b 84 24 00 11 00 	mov    rax,QWORD PTR [rsp+0x1100]
     135ee04:	00 
     135ee05:	48 89 84 24 d8 0a 00 	mov    QWORD PTR [rsp+0xad8],rax
     135ee0c:	00 
     135ee0d:	4c 89 b4 24 e0 0a 00 	mov    QWORD PTR [rsp+0xae0],r14
     135ee14:	00 
     135ee15:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ee1c:	00 
     135ee1d:	48 8d 73 10          	lea    rsi,[rbx+0x10]
     135ee21:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
     135ee25:	4c 89 ef             	mov    rdi,r13
     135ee28:	e8 39 4d 04 00       	call   13a3b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e90ea>
     135ee2d:	66 0f ef c0          	pxor   xmm0,xmm0
     135ee31:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ee36:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ee3b:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ee40:	48 89 d8             	mov    rax,rbx
     135ee43:	48 83 c0 68          	add    rax,0x68
     135ee47:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ee4b:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ee4f:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ee56:	00 
     135ee57:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0

### field b8; store 0x135eeb6: mov    QWORD PTR [rax],rbx
     135ee14:	00 
     135ee15:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ee1c:	00 
     135ee1d:	48 8d 73 10          	lea    rsi,[rbx+0x10]
     135ee21:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
     135ee25:	4c 89 ef             	mov    rdi,r13
     135ee28:	e8 39 4d 04 00       	call   13a3b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e90ea>
     135ee2d:	66 0f ef c0          	pxor   xmm0,xmm0
     135ee31:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ee36:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ee3b:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ee40:	48 89 d8             	mov    rax,rbx
     135ee43:	48 83 c0 68          	add    rax,0x68
     135ee47:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ee4b:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ee4f:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ee56:	00 
     135ee57:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ee5c:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ee63:	00 
     135ee64:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ee6b:	00 80 3f 
     135ee6e:	6a 64                	push   0x64
     135ee70:	58                   	pop    rax
     135ee71:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ee78:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
     135ee7f:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ee86:	00 
     135ee87:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ee8e:	00 
     135ee8f:	4c 89 ef             	mov    rdi,r13
     135ee92:	e8 d3 b0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ee97:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135ee9e:	00 
     135ee9f:	66 0f ef c0          	pxor   xmm0,xmm0
     135eea3:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135eeaa:	00 
     135eeab:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135eeb2:	00 
     135eeb3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135eeb6:	48 89 18             	mov    QWORD PTR [rax],rbx
     135eeb9:	48 85 ff             	test   rdi,rdi
     135eebc:	74 06                	je     135eec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4448>
     135eebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135eec1:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135eec4:	8a 45 01             	mov    al,BYTE PTR [rbp+0x1]
     135eec7:	88 84 24 20 03 00 00 	mov    BYTE PTR [rsp+0x320],al
     135eece:	8a 45 02             	mov    al,BYTE PTR [rbp+0x2]
     135eed1:	88 84 24 21 03 00 00 	mov    BYTE PTR [rsp+0x321],al
     135eed8:	8a 45 03             	mov    al,BYTE PTR [rbp+0x3]
     135eedb:	88 84 24 22 03 00 00 	mov    BYTE PTR [rsp+0x322],al
     135eee2:	0f 10 45 10          	movups xmm0,XMMWORD PTR [rbp+0x10]
     135eee6:	0f 11 84 24 28 03 00 	movups XMMWORD PTR [rsp+0x328],xmm0
     135eeed:	00 
     135eeee:	0f 10 45 20          	movups xmm0,XMMWORD PTR [rbp+0x20]
     135eef2:	0f 11 84 24 38 03 00 	movups XMMWORD PTR [rsp+0x338],xmm0
     135eef9:	00 
     135eefa:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
     135eefe:	48 89 84 24 48 03 00 	mov    QWORD PTR [rsp+0x348],rax
     135ef05:	00 
     135ef06:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
     135ef0d:	00 
     135ef0e:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135ef11:	e8 c6 05 96 ff       	call   cbf4dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20c47c>
     135ef16:	88 84 24 50 03 00 00 	mov    BYTE PTR [rsp+0x350],al
     135ef1d:	48 b8 fa 00 00 00 fa 	movabs rax,0xfa000000fa
     135ef24:	00 00 00 
     135ef27:	48 89 84 24 58 03 00 	mov    QWORD PTR [rsp+0x358],rax
     135ef2e:	00 
     135ef2f:	c7 84 24 60 03 00 00 	mov    DWORD PTR [rsp+0x360],0xfa
     135ef36:	fa 00 00 00 
     135ef3a:	8b 44 24 40          	mov    eax,DWORD PTR [rsp+0x40]
     135ef3e:	88 84 24 64 03 00 00 	mov    BYTE PTR [rsp+0x364],al
     135ef45:	8b 44 24 58          	mov    eax,DWORD PTR [rsp+0x58]
     135ef49:	88 84 24 65 03 00 00 	mov    BYTE PTR [rsp+0x365],al
     135ef50:	8b 44 24 50          	mov    eax,DWORD PTR [rsp+0x50]
     135ef54:	88 84 24 66 03 00 00 	mov    BYTE PTR [rsp+0x366],al
     135ef5b:	66 c7 84 24 67 03 00 	mov    WORD PTR [rsp+0x367],0x101
     135ef62:	00 01 01 
     135ef65:	c6 84 24 69 03 00 00 	mov    BYTE PTR [rsp+0x369],0x1
     135ef6c:	01 

## High-address/vptr constants near provider-field assignments


     135ede4:	48 8d 05 cd b2 50 00 	lea    rax,[rip+0x50b2cd]        # 186a0b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x267a0>
     135edee:	48 8d 05 63 b3 50 00 	lea    rax,[rip+0x50b363]        # 186a158 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26840>


     135f323:	48 8d 05 c6 8c 50 00 	lea    rax,[rip+0x508cc6]        # 1867ff0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x246d8>

     135f323:	48 8d 05 c6 8c 50 00 	lea    rax,[rip+0x508cc6]        # 1867ff0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x246d8>
     135f398:	48 8d 05 99 8c 50 00 	lea    rax,[rip+0x508c99]        # 1868038 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24720>





## Compact getters reading +0xb0/+0xb8 across binary
### hit
      ac3c2d:	49 89 f6             	mov    r14,rsi
      ac3c30:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ac3c37:	00 00 
      ac3c39:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ac3c3e:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
      ac3c45:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      ac3c49:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ac3c4c:	ff 50 30             	call   QWORD PTR [rax+0x30]
      ac3c4f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ac3c54:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
      ac3c59:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ac3c5c:	6a 10                	push   0x10

### hit
      ac3d21:	49 89 f6             	mov    r14,rsi
      ac3d24:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ac3d2b:	00 00 
      ac3d2d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ac3d32:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
      ac3d39:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      ac3d3d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ac3d40:	ff 50 38             	call   QWORD PTR [rax+0x38]
      ac3d43:	89 44 24 1c          	mov    DWORD PTR [rsp+0x1c],eax
      ac3d47:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ac3d4a:	6a 04                	push   0x4
      ac3d4c:	5e                   	pop    rsi

### hit
      ac3e09:	48 83 ec 20          	sub    rsp,0x20
      ac3e0d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ac3e14:	00 00 
      ac3e16:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      ac3e1b:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
      ac3e22:	48 8b 18             	mov    rbx,QWORD PTR [rax]
      ac3e25:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
      ac3e29:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      ac3e2e:	c6 44 24 10 01       	mov    BYTE PTR [rsp+0x10],0x1
      ac3e33:	e8 b8 a2 d2 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
      ac3e38:	c6 83 88 00 00 00 01 	mov    BYTE PTR [rbx+0x88],0x1
      ac3e3f:	48 8d 7b 78          	lea    rdi,[rbx+0x78]

### hit
      be90f2:	f3 0f 11 45 cc       	movss  DWORD PTR [rbp-0x34],xmm0
      be90f7:	f7 f9                	idiv   ecx
      be90f9:	41 89 c4             	mov    r12d,eax
      be90fc:	48 89 7d b8          	mov    QWORD PTR [rbp-0x48],rdi
      be9100:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
      be9107:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      be910a:	48 89 75 b0          	mov    QWORD PTR [rbp-0x50],rsi
      be910e:	4c 89 ea             	mov    rdx,r13
      be9111:	e8 9e 31 00 00       	call   bec2b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x139254>
      be9116:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      be9119:	b9 bc 02 00 00       	mov    ecx,0x2bc
      be911e:	31 d2                	xor    edx,edx

### hit
      c82c62:	e8 a5 ff ff ff       	call   c82c0c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1cfbac>
      c82c67:	48 89 df             	mov    rdi,rbx
      c82c6a:	5b                   	pop    rbx
      c82c6b:	e9 b0 b2 b6 00       	jmp    17edf20 <_ZdlPv@plt>
      c82c70:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
      c82c77:	c3                   	ret
      c82c78:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      c82c7c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c82c7f:	ff 60 28             	jmp    QWORD PTR [rax+0x28]
      c82c82:	50                   	push   rax
      c82c83:	48 89 f8             	mov    rax,rdi
      c82c86:	48 8b 56 20          	mov    rdx,QWORD PTR [rsi+0x20]

### hit
      cc03bb:	74 05                	je     cc03c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d362>
      cc03bd:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      cc03c2:	c3                   	ret
      cc03c3:	cc                   	int3
      cc03c4:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
      cc03cb:	c3                   	ret
      cc03cc:	53                   	push   rbx
      cc03cd:	48 89 fb             	mov    rbx,rdi
      cc03d0:	48 81 c6 10 01 00 00 	add    rsi,0x110
      cc03d7:	e8 b4 9e db ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      cc03dc:	48 89 d8             	mov    rax,rbx
      cc03df:	5b                   	pop    rbx

### hit
      d443db:	75 08                	jne    d443e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1146b>
      d443dd:	48 89 df             	mov    rdi,rbx
      d443e0:	e8 eb b8 d2 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d443e5:	e8 c6 b6 aa 00       	call   17efab0 <__stack_chk_fail@plt>
      d443ea:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
      d443f1:	48 85 c0             	test   rax,rax
      d443f4:	74 18                	je     d4440e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11494>
      d443f6:	83 b8 c4 00 00 00 01 	cmp    DWORD PTR [rax+0xc4],0x1
      d443fd:	75 0f                	jne    d4440e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11494>
      d443ff:	48 85 d2             	test   rdx,rdx
      d44402:	74 17                	je     d4441b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x114a1>
      d44404:	8b 88 e0 00 00 00    	mov    ecx,DWORD PTR [rax+0xe0]

### hit
     106f868:	48 89 c7             	mov    rdi,rax
     106f86b:	e8 35 a2 a0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     106f870:	53                   	push   rbx
     106f871:	48 89 fb             	mov    rbx,rdi
     106f874:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     106f87b:	48 85 c0             	test   rax,rax
     106f87e:	74 15                	je     106f895 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x236cab>
     106f880:	48 8d b3 a0 00 00 00 	lea    rsi,[rbx+0xa0]
     106f887:	31 ff                	xor    edi,edi
     106f889:	31 d2                	xor    edx,edx
     106f88b:	ff d0                	call   rax
     106f88d:	48 83 a3 b0 00 00 00 	and    QWORD PTR [rbx+0xb0],0x0

### hit
     10caf80:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10caf87:	00 00 
     10caf89:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     10caf8e:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
     10caf92:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
     10caf99:	0f 10 87 b0 00 00 00 	movups xmm0,XMMWORD PTR [rdi+0xb0]
     10cafa0:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     10cafa4:	48 85 c0             	test   rax,rax
     10cafa7:	74 05                	je     10cafae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2923c4>
     10cafa9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10cafae:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     10cafb1:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]

### hit
     10cbd54:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10cbd5b:	00 00 
     10cbd5d:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     10cbd62:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
     10cbd66:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
     10cbd6d:	0f 10 87 b0 00 00 00 	movups xmm0,XMMWORD PTR [rdi+0xb0]
     10cbd74:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     10cbd78:	48 85 c0             	test   rax,rax
     10cbd7b:	74 05                	je     10cbd82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x293198>
     10cbd7d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10cbd82:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     10cbd85:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]

### hit
     10cc098:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10cc09f:	00 00 
     10cc0a1:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     10cc0a6:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
     10cc0aa:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
     10cc0b1:	0f 10 87 b0 00 00 00 	movups xmm0,XMMWORD PTR [rdi+0xb0]
     10cc0b8:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     10cc0bc:	48 85 c0             	test   rax,rax
     10cc0bf:	74 05                	je     10cc0c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2934dc>
     10cc0c1:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10cc0c6:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     10cc0c9:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]

### hit
     10cc8cc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10cc8d3:	00 00 
     10cc8d5:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     10cc8da:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
     10cc8de:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
     10cc8e5:	0f 10 87 b0 00 00 00 	movups xmm0,XMMWORD PTR [rdi+0xb0]
     10cc8ec:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     10cc8f0:	48 85 c0             	test   rax,rax
     10cc8f3:	74 05                	je     10cc8fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x293d10>
     10cc8f5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10cc8fa:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     10cc8fd:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]

### hit
     10ccc50:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ccc57:	00 00 
     10ccc59:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     10ccc5e:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
     10ccc62:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
     10ccc69:	0f 10 87 b0 00 00 00 	movups xmm0,XMMWORD PTR [rdi+0xb0]
     10ccc70:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     10ccc74:	48 85 c0             	test   rax,rax
     10ccc77:	74 05                	je     10ccc7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x294094>
     10ccc79:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10ccc7e:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     10ccc81:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]

### hit
     10ccfd4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ccfdb:	00 00 
     10ccfdd:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     10ccfe2:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
     10ccfe6:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
     10ccfed:	0f 10 87 b0 00 00 00 	movups xmm0,XMMWORD PTR [rdi+0xb0]
     10ccff4:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     10ccff8:	48 85 c0             	test   rax,rax
     10ccffb:	74 05                	je     10cd002 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x294418>
     10ccffd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10cd002:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     10cd005:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]

### hit
     11a8be5:	00 00 
     11a8be7:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
     11a8bee:	00 
     11a8bef:	48 8b 8f 98 00 00 00 	mov    rcx,QWORD PTR [rdi+0x98]
     11a8bf6:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     11a8bfd:	48 89 c2             	mov    rdx,rax
     11a8c00:	48 c1 ea 07          	shr    rdx,0x7
     11a8c04:	4c 8b 34 d1          	mov    r14,QWORD PTR [rcx+rdx*8]
     11a8c08:	4d 85 f6             	test   r14,r14
     11a8c0b:	0f 84 94 01 00 00    	je     11a8da5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3701bb>
     11a8c11:	49 89 ff             	mov    r15,rdi
     11a8c14:	83 e0 7f             	and    eax,0x7f

### hit
     126db1d:	48 83 ec 48          	sub    rsp,0x48
     126db21:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     126db28:	00 00 
     126db2a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     126db2f:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     126db36:	48 3b 87 a0 00 00 00 	cmp    rax,QWORD PTR [rdi+0xa0]
     126db3d:	73 62                	jae    126dba1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3125>
     126db3f:	48 89 fb             	mov    rbx,rdi
     126db42:	48 81 c7 88 00 00 00 	add    rdi,0x88
     126db49:	e8 2a 38 00 00       	call   1271378 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb68fc>
     126db4e:	48 8d 0d c3 40 1e ff 	lea    rcx,[rip+0xffffffffff1e40c3]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     126db55:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]

### hit
     12d0b18:	31 f6                	xor    esi,esi
     12d0b1a:	e9 05 97 3e 00       	jmp    16ba224 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e390>
     12d0b1f:	cc                   	int3
     12d0b20:	80 4f 10 02          	or     BYTE PTR [rdi+0x10],0x2
     12d0b24:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     12d0b2b:	48 85 c0             	test   rax,rax
     12d0b2e:	74 01                	je     12d0b31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1160b5>
     12d0b30:	c3                   	ret
     12d0b31:	53                   	push   rbx
     12d0b32:	48 89 fb             	mov    rbx,rdi
     12d0b35:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     12d0b39:	40 f6 c7 01          	test   dil,0x1

### hit
     1320fb7:	48 89 df             	mov    rdi,rbx
     1320fba:	e8 11 ed 74 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1320fbf:	e8 ec ea 4c 00       	call   17efab0 <__stack_chk_fail@plt>
     1320fc4:	80 4f 11 01          	or     BYTE PTR [rdi+0x11],0x1
     1320fc8:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
     1320fcf:	48 85 c0             	test   rax,rax
     1320fd2:	74 01                	je     1320fd5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166559>
     1320fd4:	c3                   	ret
     1320fd5:	53                   	push   rbx
     1320fd6:	48 89 fb             	mov    rbx,rdi
     1320fd9:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     1320fdd:	40 f6 c7 01          	test   dil,0x1

### hit
     143f402:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143f409:	00 00 
     143f40b:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
     143f412:	00 
     143f413:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     143f41a:	48 85 c0             	test   rax,rax
     143f41d:	74 70                	je     143f48f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284a13>
     143f41f:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     143f423:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     143f427:	74 66                	je     143f48f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284a13>
     143f429:	48 89 fb             	mov    rbx,rdi
     143f42c:	48 8d 77 40          	lea    rsi,[rdi+0x40]

### hit
     143f6c4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143f6cb:	00 00 
     143f6cd:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
     143f6d4:	00 
     143f6d5:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     143f6dc:	48 85 c0             	test   rax,rax
     143f6df:	74 70                	je     143f751 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284cd5>
     143f6e1:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     143f6e5:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     143f6e9:	74 66                	je     143f751 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284cd5>
     143f6eb:	48 89 fb             	mov    rbx,rdi
     143f6ee:	48 8d 77 40          	lea    rsi,[rdi+0x40]

### hit
     146b8fb:	0f 57 c0             	xorps  xmm0,xmm0
     146b8fe:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     146b905:	00 00 
     146b907:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     146b90c:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     146b913:	48 3b 87 b8 00 00 00 	cmp    rax,QWORD PTR [rdi+0xb8]
     146b91a:	74 3c                	je     146b958 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b0edc>
     146b91c:	49 81 c7 b0 00 00 00 	add    r15,0xb0
     146b923:	4c 8d 74 24 58       	lea    r14,[rsp+0x58]
     146b928:	4c 89 f7             	mov    rdi,r14
     146b92b:	4c 89 fe             	mov    rsi,r15
     146b92e:	e8 db 23 ff ff       	call   145dd0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a3292>

### hit
     1500458:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     150045f:	00 00 
     1500461:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
     1500468:	00 
     1500469:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     1500470:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     1500474:	48 89 87 b8 00 00 00 	mov    QWORD PTR [rdi+0xb8],rax
     150047b:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     1500482:	00 
     1500483:	c6 07 07             	mov    BYTE PTR [rdi],0x7
     1500486:	0f 57 c0             	xorps  xmm0,xmm0
     1500489:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0

### hit
     1591a42:	48 83 bf 80 00 00 00 	cmp    QWORD PTR [rdi+0x80],0x0
     1591a49:	00 
     1591a4a:	0f 85 74 02 00 00    	jne    1591cc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d7248>
     1591a50:	49 89 fd             	mov    r13,rdi
     1591a53:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     1591a5a:	48 0b 87 d8 00 00 00 	or     rax,QWORD PTR [rdi+0xd8]
     1591a61:	0f 84 5d 02 00 00    	je     1591cc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d7248>
     1591a67:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1591a6c:	e8 d5 64 5d ff       	call   b67f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4ee6>
     1591a71:	49 8b ad a8 00 00 00 	mov    rbp,QWORD PTR [r13+0xa8]
     1591a78:	48 85 ed             	test   rbp,rbp
     1591a7b:	0f 84 08 01 00 00    	je     1591b89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d710d>

### hit
     15ee5f0:	0f 11 8b 98 00 00 00 	movups XMMWORD PTR [rbx+0x98],xmm1
     15ee5f7:	0f 29 45 58          	movaps XMMWORD PTR [rbp+0x58],xmm0
     15ee5fb:	0f 28 8f a0 00 00 00 	movaps xmm1,XMMWORD PTR [rdi+0xa0]
     15ee602:	0f 11 8b a8 00 00 00 	movups XMMWORD PTR [rbx+0xa8],xmm1
     15ee609:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     15ee610:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
     15ee617:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
     15ee61e:	48 89 83 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],rax
     15ee625:	0f 29 45 78          	movaps XMMWORD PTR [rbp+0x78],xmm0
     15ee629:	0f 29 45 68          	movaps XMMWORD PTR [rbp+0x68],xmm0
     15ee62d:	66 0f 6f 8f c0 00 00 	movdqa xmm1,XMMWORD PTR [rdi+0xc0]
     15ee634:	00 

### hit
     15ee5fb:	0f 28 8f a0 00 00 00 	movaps xmm1,XMMWORD PTR [rdi+0xa0]
     15ee602:	0f 11 8b a8 00 00 00 	movups XMMWORD PTR [rbx+0xa8],xmm1
     15ee609:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     15ee610:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
     15ee617:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
     15ee61e:	48 89 83 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],rax
     15ee625:	0f 29 45 78          	movaps XMMWORD PTR [rbp+0x78],xmm0
     15ee629:	0f 29 45 68          	movaps XMMWORD PTR [rbp+0x68],xmm0
     15ee62d:	66 0f 6f 8f c0 00 00 	movdqa xmm1,XMMWORD PTR [rdi+0xc0]
     15ee634:	00 
     15ee635:	f3 0f 7f 8b c8 00 00 	movdqu XMMWORD PTR [rbx+0xc8],xmm1
     15ee63c:	00 

### hit
     1637b68:	48 8b bf b8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb8]
     1637b6f:	e9 54 36 01 00       	jmp    164b1c8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46336>
     1637b74:	48 8b bf b8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb8]
     1637b7b:	e9 4e 34 01 00       	jmp    164afce <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4613c>
     1637b80:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     1637b87:	8b 40 68             	mov    eax,DWORD PTR [rax+0x68]
     1637b8a:	c3                   	ret
     1637b8b:	cc                   	int3
     1637b8c:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     1637b93:	69 40 68 e8 03 00 00 	imul   eax,DWORD PTR [rax+0x68],0x3e8
     1637b9a:	c3                   	ret
     1637b9b:	cc                   	int3

### hit
     1637b80:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     1637b87:	8b 40 68             	mov    eax,DWORD PTR [rax+0x68]
     1637b8a:	c3                   	ret
     1637b8b:	cc                   	int3
     1637b8c:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
     1637b93:	69 40 68 e8 03 00 00 	imul   eax,DWORD PTR [rax+0x68],0x3e8
     1637b9a:	c3                   	ret
     1637b9b:	cc                   	int3
     1637b9c:	48 83 c7 38          	add    rdi,0x38
     1637ba0:	e9 99 09 00 00       	jmp    163853e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x336ac>
     1637ba5:	cc                   	int3
     1637ba6:	48 83 c7 38          	add    rdi,0x38

