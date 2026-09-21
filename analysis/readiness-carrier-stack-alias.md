# Readiness carrier stack-alias trace

Anchor: e94996 stores carrier base in [rsp+0x48]. The carrier has P at +0x20 and outer at +0x28.

## Hits containing [rsp+0x48]
### 0xe94996: mov    QWORD PTR [rsp+0x48],r14
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
### 0xe94b93: mov    r14,QWORD PTR [rsp+0x48]
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
### 0xe94f68: mov    r15,QWORD PTR [rsp+0x48]
      e94f17:	00 
      e94f18:	49 8d 84 24 b8 00 00 	lea    rax,[r12+0xb8]
      e94f1f:	00 
      e94f20:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      e94f27:	00 
      e94f28:	66 0f ef c0          	pxor   xmm0,xmm0
      e94f2c:	f3 41 0f 7f 84 24 18 	movdqu XMMWORD PTR [r12+0x118],xmm0
      e94f33:	01 00 00 
      e94f36:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
      e94f3d:	00 
      e94f3e:	49 89 84 24 28 01 00 	mov    QWORD PTR [r12+0x128],rax
      e94f45:	00 
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
      e94fb8:	48 83 c7 20          	add    rdi,0x20
      e94fbc:	4c 89 f6             	mov    rsi,r14
      e94fbf:	e8 3a 3b 17 00       	call   1008afe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cff14>
      e94fc4:	4c 89 f7             	mov    rdi,r14
      e94fc7:	e8 9e 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94fcc:	49 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [r12+0xb8]
      e94fd3:	00 
      e94fd4:	48 8d 05 fd f8 9a 00 	lea    rax,[rip+0x9af8fd]        # 18448d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xfc0>
      e94fdb:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e94fe2:	00 
      e94fe3:	4c 89 ac 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r13
### 0xe951d3: mov    rax,QWORD PTR [rsp+0x48]
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
### 0xe954e4: mov    rbx,QWORD PTR [rsp+0x48]
      e9548e:	e8 f3 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95493:	ba c0 00 00 00       	mov    edx,0xc0
      e95498:	4c 89 ff             	mov    rdi,r15
      e9549b:	31 f6                	xor    esi,esi
      e9549d:	e8 ee 96 95 00       	call   17eeb90 <memset@plt>
      e954a2:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      e954a7:	48 8b 81 90 04 00 00 	mov    rax,QWORD PTR [rcx+0x490]
      e954ae:	0f 10 81 88 04 00 00 	movups xmm0,XMMWORD PTR [rcx+0x488]
      e954b5:	0f 29 84 24 e0 0b 00 	movaps XMMWORD PTR [rsp+0xbe0],xmm0
      e954bc:	00 
      e954bd:	48 85 c0             	test   rax,rax
      e954c0:	74 05                	je     e954c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c8dd>
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
      e9552e:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e95532:	66 0f 7f 8c 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm1
      e95539:	00 00 
      e9553b:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95540:	66 48 0f 6e c0       	movq   xmm0,rax
      e95545:	66 49 0f 6e cd       	movq   xmm1,r13
      e9554a:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9554e:	66 0f 7f 8c 24 50 02 	movdqa XMMWORD PTR [rsp+0x250],xmm1
      e95555:	00 00 
      e95557:	48 8b 8c 24 90 00 00 	mov    rcx,QWORD PTR [rsp+0x90]
      e9555e:	00 
### 0xe979d7: mov    rdi,QWORD PTR [rsp+0x48]
      e9797d:	e8 ec 08 cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e97982:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e97987:	e8 fa 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9798c:	48 8b bc 24 f8 02 00 	mov    rdi,QWORD PTR [rsp+0x2f8]
      e97993:	00 
      e97994:	e8 ed 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97999:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e979a0:	00 
      e979a1:	e8 e0 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979a6:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      e979ab:	e8 d6 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979b0:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e979b7:	00 
      e979b8:	e8 65 61 c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e979bd:	48 8b bc 24 28 03 00 	mov    rdi,QWORD PTR [rsp+0x328]
      e979c4:	00 
      e979c5:	e8 bc 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979ca:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
      e979d1:	00 
      e979d2:	e8 af 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979d7:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e979dc:	e8 a5 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979e1:	48 8d bc 24 c0 0e 00 	lea    rdi,[rsp+0xec0]
      e979e8:	00 
      e979e9:	e8 7c 25 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e979ee:	48 8d bc 24 f0 0e 00 	lea    rdi,[rsp+0xef0]
      e979f5:	00 
      e979f6:	e8 6f 25 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e979fb:	66 0f 6f 84 24 90 01 	movdqa xmm0,XMMWORD PTR [rsp+0x190]
      e97a02:	00 00 
      e97a04:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e97a0b:	e8 76 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a10:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]
      e97a17:	00 
      e97a18:	e8 69 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a1d:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
      e97a24:	00 
      e97a25:	e8 b0 17 00 00       	call   e991da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x605f0>
      e97a2a:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      e97a31:	00 
      e97a32:	e8 4f 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a37:	48 8b bc 24 70 01 00 	mov    rdi,QWORD PTR [rsp+0x170]
      e97a3e:	00 
      e97a3f:	e8 42 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a44:	48 8b bc 24 78 01 00 	mov    rdi,QWORD PTR [rsp+0x178]
      e97a4b:	00 
      e97a4c:	e8 35 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a51:	48 8b bc 24 80 01 00 	mov    rdi,QWORD PTR [rsp+0x180]
      e97a58:	00 
### 0xe9822a: mov    rdi,QWORD PTR [rsp+0x48]
      e981d5:	e8 4e 1c be ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
      e981da:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e981e1:	00 
      e981e2:	e8 37 1a 00 00       	call   e99c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61034>
      e981e7:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      e981ec:	e8 79 1d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e981f1:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e981f8:	00 
      e981f9:	e8 92 5c 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e981fe:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e98205:	00 
      e98206:	e8 5f 1d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9820b:	4c 89 e7             	mov    rdi,r12
      e9820e:	e8 fd 5d 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98213:	4c 89 e7             	mov    rdi,r12
      e98216:	e8 01 62 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9821b:	45 31 ff             	xor    r15d,r15d
      e9821e:	eb 0a                	jmp    e9822a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f640>
      e98220:	e9 bc 00 00 00       	jmp    e982e1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f6f7>
      e98225:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9822a:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e9822f:	e8 52 62 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98234:	4d 85 ff             	test   r15,r15
      e98237:	74 09                	je     e98242 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f658>
      e98239:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e9823c:	4c 89 ff             	mov    rdi,r15
      e9823f:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e98242:	31 ff                	xor    edi,edi
      e98244:	eb 08                	jmp    e9824e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f664>
      e98246:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9824b:	4c 89 e7             	mov    rdi,r12
      e9824e:	e8 33 62 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98253:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e9825a:	00 
      e9825b:	e8 be 19 00 00       	call   e99c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61034>
      e98260:	eb 05                	jmp    e98267 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f67d>
      e98262:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98267:	48 8d bc 24 90 0e 00 	lea    rdi,[rsp+0xe90]
      e9826e:	00 
      e9826f:	e8 f6 1c be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98274:	45 31 e4             	xor    r12d,r12d
      e98277:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
      e9827e:	00 
      e9827f:	e8 02 62 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98284:	e9 32 05 00 00       	jmp    e987bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbd1>
      e98289:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9828e:	45 31 e4             	xor    r12d,r12d
      e98291:	e9 25 05 00 00       	jmp    e987bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbd1>
      e98296:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
### 0xe987dd: mov    rdi,QWORD PTR [rsp+0x48]
      e98785:	48 8b bc 24 f8 02 00 	mov    rdi,QWORD PTR [rsp+0x2f8]
      e9878c:	00 
      e9878d:	e8 f4 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98792:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e98799:	00 
      e9879a:	e8 e7 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9879f:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e987a4:	e8 db 09 00 00       	call   e99184 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6059a>
      e987a9:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      e987ae:	e8 d3 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987b3:	4c 8b a4 24 28 03 00 	mov    r12,QWORD PTR [rsp+0x328]
      e987ba:	00 
      e987bb:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e987c2:	00 
      e987c3:	e8 5a 53 c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e987c8:	4c 89 e7             	mov    rdi,r12
      e987cb:	e8 b6 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987d0:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
      e987d7:	00 
      e987d8:	e8 a9 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987dd:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e987e2:	e8 9f 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987e7:	48 8d bc 24 c0 0e 00 	lea    rdi,[rsp+0xec0]
      e987ee:	00 
      e987ef:	e8 76 17 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e987f4:	48 8d bc 24 f0 0e 00 	lea    rdi,[rsp+0xef0]
      e987fb:	00 
      e987fc:	e8 69 17 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98801:	66 0f 6f 84 24 90 01 	movdqa xmm0,XMMWORD PTR [rsp+0x190]
      e98808:	00 00 
      e9880a:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e98811:	e8 70 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98816:	66 0f 6f 84 24 d0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1d0]
      e9881d:	00 00 
      e9881f:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e98826:	e8 5b 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9882b:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
      e98832:	00 
      e98833:	e8 a2 09 00 00       	call   e991da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x605f0>
      e98838:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      e9883f:	00 
      e98840:	e8 41 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98845:	48 8b bc 24 70 01 00 	mov    rdi,QWORD PTR [rsp+0x170]
      e9884c:	00 
      e9884d:	e8 34 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98852:	48 8b bc 24 78 01 00 	mov    rdi,QWORD PTR [rsp+0x178]
      e98859:	00 
      e9885a:	e8 27 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9885f:	48 8b bc 24 80 01 00 	mov    rdi,QWORD PTR [rsp+0x180]
### 0xe98b90: mov    r14,QWORD PTR [rsp+0x48]
      e98b45:	48 8b bc 24 e8 02 00 	mov    rdi,QWORD PTR [rsp+0x2e8]
      e98b4c:	00 
      e98b4d:	e8 34 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98b52:	48 8b bc 24 10 10 00 	mov    rdi,QWORD PTR [rsp+0x1010]
      e98b59:	00 
      e98b5a:	48 85 ff             	test   rdi,rdi
      e98b5d:	74 0d                	je     e98b6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ff82>
      e98b5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e98b62:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e98b65:	eb 05                	jmp    e98b6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ff82>
      e98b67:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b6c:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
      e98b73:	00 
      e98b74:	e8 f1 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98b79:	4c 8b b4 24 58 10 00 	mov    r14,QWORD PTR [rsp+0x1058]
      e98b80:	00 
      e98b81:	4c 8b bc 24 38 0a 00 	mov    r15,QWORD PTR [rsp+0xa38]
      e98b88:	00 
      e98b89:	eb 0a                	jmp    e98b95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ffab>
      e98b8b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b90:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      e98b95:	48 8d bc 24 e0 0d 00 	lea    rdi,[rsp+0xde0]
      e98b9c:	00 
      e98b9d:	e8 c8 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98ba2:	eb 0a                	jmp    e98bae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ffc4>
      e98ba4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98ba9:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      e98bae:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98bb5:	00 
      e98bb6:	e8 af 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98bbb:	4c 89 f7             	mov    rdi,r14
      e98bbe:	e8 c3 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bc3:	4c 89 ff             	mov    rdi,r15
      e98bc6:	e8 bb 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bcb:	e9 ab fb ff ff       	jmp    e9877b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb91>
      e98bd0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98bd5:	e9 ab fb ff ff       	jmp    e98785 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb9b>
      e98bda:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98bdf:	e9 ae fb ff ff       	jmp    e98792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fba8>
      e98be4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98be9:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      e98bed:	e8 94 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bf2:	4c 89 e7             	mov    rdi,r12
      e98bf5:	e8 8c 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bfa:	4c 89 ff             	mov    rdi,r15
      e98bfd:	e8 0e 54 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98c02:	4c 89 ff             	mov    rdi,r15
      e98c05:	e8 12 58 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98c0a:	45 31 e4             	xor    r12d,r12d
### 0xe98ba9: mov    r14,QWORD PTR [rsp+0x48]
      e98b5d:	74 0d                	je     e98b6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ff82>
      e98b5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e98b62:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e98b65:	eb 05                	jmp    e98b6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ff82>
      e98b67:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b6c:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
      e98b73:	00 
      e98b74:	e8 f1 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98b79:	4c 8b b4 24 58 10 00 	mov    r14,QWORD PTR [rsp+0x1058]
      e98b80:	00 
      e98b81:	4c 8b bc 24 38 0a 00 	mov    r15,QWORD PTR [rsp+0xa38]
      e98b88:	00 
      e98b89:	eb 0a                	jmp    e98b95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ffab>
      e98b8b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b90:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      e98b95:	48 8d bc 24 e0 0d 00 	lea    rdi,[rsp+0xde0]
      e98b9c:	00 
      e98b9d:	e8 c8 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98ba2:	eb 0a                	jmp    e98bae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ffc4>
      e98ba4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98ba9:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      e98bae:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98bb5:	00 
      e98bb6:	e8 af 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98bbb:	4c 89 f7             	mov    rdi,r14
      e98bbe:	e8 c3 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bc3:	4c 89 ff             	mov    rdi,r15
      e98bc6:	e8 bb 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bcb:	e9 ab fb ff ff       	jmp    e9877b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb91>
      e98bd0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98bd5:	e9 ab fb ff ff       	jmp    e98785 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb9b>
      e98bda:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98bdf:	e9 ae fb ff ff       	jmp    e98792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fba8>
      e98be4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98be9:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      e98bed:	e8 94 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bf2:	4c 89 e7             	mov    rdi,r12
      e98bf5:	e8 8c 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bfa:	4c 89 ff             	mov    rdi,r15
      e98bfd:	e8 0e 54 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98c02:	4c 89 ff             	mov    rdi,r15
      e98c05:	e8 12 58 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98c0a:	45 31 e4             	xor    r12d,r12d
      e98c0d:	eb 05                	jmp    e98c14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6002a>
      e98c0f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c14:	4c 89 e7             	mov    rdi,r12
      e98c17:	e8 6a 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c1c:	eb 77                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c1e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
### 0xe98d6c: mov    rdi,QWORD PTR [rsp+0x48]
      e98d19:	eb 05                	jmp    e98d20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60136>
      e98d1b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d20:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
      e98d27:	00 
      e98d28:	e8 59 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d2d:	eb 22                	jmp    e98d51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60167>
      e98d2f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d34:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e98d3b:	00 
      e98d3c:	e8 45 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d41:	4c 89 f7             	mov    rdi,r14
      e98d44:	e8 c7 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d49:	4c 89 f7             	mov    rdi,r14
      e98d4c:	e8 cb 56 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98d51:	31 ff                	xor    edi,edi
      e98d53:	e8 2e 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d58:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e98d5d:	e8 24 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d62:	e9 4c fa ff ff       	jmp    e987b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbc9>
      e98d67:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d6c:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e98d71:	eb e0                	jmp    e98d53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60169>
      e98d73:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d78:	e9 60 fa ff ff       	jmp    e987dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbf3>
      e98d7d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d82:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      e98d86:	e8 fb 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d8b:	48 89 df             	mov    rdi,rbx
      e98d8e:	e8 f3 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d93:	4c 89 f7             	mov    rdi,r14
      e98d96:	e8 75 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d9b:	4c 89 f7             	mov    rdi,r14
      e98d9e:	e8 79 56 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98da3:	31 db                	xor    ebx,ebx
      e98da5:	eb 05                	jmp    e98dac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x601c2>
      e98da7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98dac:	48 89 df             	mov    rdi,rbx
      e98daf:	e8 d2 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98db4:	eb 05                	jmp    e98dbb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x601d1>
      e98db6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98dbb:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]
      e98dc2:	00 
      e98dc3:	e8 be 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98dc8:	e9 1a fa ff ff       	jmp    e987e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbfd>
      e98dcd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98dd2:	e9 10 fa ff ff       	jmp    e987e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbfd>
      e98dd7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98ddc:	e9 20 fa ff ff       	jmp    e98801 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc17>
      e98de1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

## Hits containing +0x20]
### 0xe94925: mov    QWORD PTR [r14+0x20],r12
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
### 0xe949c5: movdqu XMMWORD PTR [r12+0x20],xmm0
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
### 0xe94a52: mov    QWORD PTR [rax+0x20],rbx
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
      e94a6c:	00 
      e94a6d:	e8 3c 50 00 00       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e94a72:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e94a79:	00 
      e94a7a:	e8 07 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94a7f:	31 ff                	xor    edi,edi
      e94a81:	e8 00 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94a86:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e94a8a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e94a8d:	e8 6e 51 00 00       	call   e99c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61016>
      e94a92:	84 c0                	test   al,al
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
### 0xe94ac7: mov    QWORD PTR [rax+0x20],rbx
      e94a7a:	e8 07 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94a7f:	31 ff                	xor    edi,edi
      e94a81:	e8 00 9a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e94a86:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      e94a8a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e94a8d:	e8 6e 51 00 00       	call   e99c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61016>
      e94a92:	84 c0                	test   al,al
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
      e94b02:	48 8d 35 b6 f5 53 ff 	lea    rsi,[rip+0xffffffffff53f5b6]        # 3d40bf <_ZTSN5boost17bad_function_callE@@Base+0x1405>
      e94b09:	48 8d 0d c0 f5 53 ff 	lea    rcx,[rip+0xffffffffff53f5c0]        # 3d40d0 <_ZTSN5boost17bad_function_callE@@Base+0x1416>
      e94b10:	6a 0b                	push   0xb
      e94b12:	5a                   	pop    rdx
      e94b13:	6a 21                	push   0x21
      e94b15:	41 58                	pop    r8
      e94b17:	45 31 c9             	xor    r9d,r9d
      e94b1a:	e8 6b 28 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e94b1f:	84 c0                	test   al,al
      e94b21:	74 75                	je     e94b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bfae>
      e94b23:	49 8b 5d 18          	mov    rbx,QWORD PTR [r13+0x18]
      e94b27:	4d 8b b5 78 05 00 00 	mov    r14,QWORD PTR [r13+0x578]
      e94b2e:	6a 30                	push   0x30
      e94b30:	5f                   	pop    rdi
### 0xe94b5b: mov    QWORD PTR [rax+0x20],rbx
      e94b12:	5a                   	pop    rdx
      e94b13:	6a 21                	push   0x21
      e94b15:	41 58                	pop    r8
      e94b17:	45 31 c9             	xor    r9d,r9d
      e94b1a:	e8 6b 28 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e94b1f:	84 c0                	test   al,al
      e94b21:	74 75                	je     e94b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bfae>
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
### 0xe94b9c: mov    QWORD PTR [rsp+0x20],rax
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
### 0xe94c17: mov    QWORD PTR [rax+0x20],rbx
      e94bc5:	00 
      e94bc6:	4c 39 f3             	cmp    rbx,r14
      e94bc9:	0f 84 ae 05 00 00    	je     e9517d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c593>
      e94bcf:	40 88 ac 24 88 00 00 	mov    BYTE PTR [rsp+0x88],bpl
      e94bd6:	00 
      e94bd7:	6a 38                	push   0x38
      e94bd9:	5f                   	pop    rdi
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
      e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      e94c5d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e94c72:	bf 90 00 00 00       	mov    edi,0x90
      e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
      e94c7e:	00 
      e94c7f:	e8 7c 92 95 00       	call   17edf00 <_Znwm@plt>
      e94c84:	48 89 c3             	mov    rbx,rax
      e94c87:	4d 8d 7c 24 08       	lea    r15,[r12+0x8]
      e94c8c:	48 89 ac 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rbp
      e94c93:	00 
      e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
### 0xe94c5d: mov    QWORD PTR [rax+0x20],rax
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
      e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      e94c5d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e94c72:	bf 90 00 00 00       	mov    edi,0x90
      e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
      e94c7e:	00 
      e94c7f:	e8 7c 92 95 00       	call   17edf00 <_Znwm@plt>
      e94c84:	48 89 c3             	mov    rbx,rax
      e94c87:	4d 8d 7c 24 08       	lea    r15,[r12+0x8]
      e94c8c:	48 89 ac 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rbp
      e94c93:	00 
      e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
      e94c9b:	00 
      e94c9c:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
      e94ca3:	00 
      e94ca4:	66 0f ef c0          	pxor   xmm0,xmm0
      e94ca8:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      e94cac:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94cb3:	00 f0 3f 
      e94cb6:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e94cba:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e94cbf:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
      e94cc3:	4c 89 f6             	mov    rsi,r14
      e94cc6:	e8 25 32 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ccb:	48 89 df             	mov    rdi,rbx
      e94cce:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      e94cd2:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
      e94cd7:	e8 e6 c9 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
### 0xe94e82: mov    QWORD PTR [r12+0x20],rax
      e94e2b:	e8 00 1f c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e94e30:	31 ed                	xor    ebp,ebp
      e94e32:	41 83 fc 01          	cmp    r12d,0x1
      e94e36:	40 0f 94 c5          	sete   bpl
      e94e3a:	41 83 fc 02          	cmp    r12d,0x2
      e94e3e:	41 0f 44 ec          	cmove  ebp,r12d
      e94e42:	bf 50 01 00 00       	mov    edi,0x150
      e94e47:	e8 b4 90 95 00       	call   17edf00 <_Znwm@plt>
      e94e4c:	49 89 c4             	mov    r12,rax
      e94e4f:	66 0f ef c0          	pxor   xmm0,xmm0
      e94e53:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94e58:	48 8d 05 b9 f9 9a 00 	lea    rax,[rip+0x9af9b9]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
      e94e5f:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e94e63:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
      e94e6a:	00 
      e94e6b:	48 8d b4 24 90 0e 00 	lea    rsi,[rsp+0xe90]
      e94e72:	00 
      e94e73:	4c 89 ef             	mov    rdi,r13
      e94e76:	e8 75 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94e7b:	48 8d 05 ce f9 9a 00 	lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
      e94e82:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      e94e87:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94e8e:	00 f0 3f 
      e94e91:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      e94e96:	31 c0                	xor    eax,eax
      e94e98:	41 88 44 24 30       	mov    BYTE PTR [r12+0x30],al
      e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al
      e94ea2:	49 83 64 24 58 00    	and    QWORD PTR [r12+0x58],0x0
      e94ea8:	66 0f ef c0          	pxor   xmm0,xmm0
      e94eac:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e94eb3:	41 88 44 24 70       	mov    BYTE PTR [r12+0x70],al
      e94eb8:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e94ebf:	00 
      e94ec0:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      e94ec5:	4c 89 ee             	mov    rsi,r13
      e94ec8:	e8 23 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ecd:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e94ed4:	00 00 
      e94ed6:	49 89 9c 24 b0 00 00 	mov    QWORD PTR [r12+0xb0],rbx
      e94edd:	00 
      e94ede:	4d 89 bc 24 b8 00 00 	mov    QWORD PTR [r12+0xb8],r15
      e94ee5:	00 
      e94ee6:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
      e94eed:	00 
      e94eee:	48 89 df             	mov    rdi,rbx
      e94ef1:	e8 0c 4f 94 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]
      e94efb:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e94f00:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
### 0xe94ef6: lea    r13,[r12+0x20]
      e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al
      e94ea2:	49 83 64 24 58 00    	and    QWORD PTR [r12+0x58],0x0
      e94ea8:	66 0f ef c0          	pxor   xmm0,xmm0
      e94eac:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e94eb3:	41 88 44 24 70       	mov    BYTE PTR [r12+0x70],al
      e94eb8:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e94ebf:	00 
      e94ec0:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      e94ec5:	4c 89 ee             	mov    rsi,r13
      e94ec8:	e8 23 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ecd:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e94ed4:	00 00 
      e94ed6:	49 89 9c 24 b0 00 00 	mov    QWORD PTR [r12+0xb0],rbx
      e94edd:	00 
      e94ede:	4d 89 bc 24 b8 00 00 	mov    QWORD PTR [r12+0xb8],r15
      e94ee5:	00 
      e94ee6:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
      e94eed:	00 
      e94eee:	48 89 df             	mov    rdi,rbx
      e94ef1:	e8 0c 4f 94 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]
      e94efb:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e94f00:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e94f07:	00 
      e94f08:	49 8d 84 24 b0 00 00 	lea    rax,[r12+0xb0]
      e94f0f:	00 
      e94f10:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      e94f17:	00 
      e94f18:	49 8d 84 24 b8 00 00 	lea    rax,[r12+0xb8]
      e94f1f:	00 
      e94f20:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      e94f27:	00 
      e94f28:	66 0f ef c0          	pxor   xmm0,xmm0
      e94f2c:	f3 41 0f 7f 84 24 18 	movdqu XMMWORD PTR [r12+0x118],xmm0
      e94f33:	01 00 00 
      e94f36:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
      e94f3d:	00 
      e94f3e:	49 89 84 24 28 01 00 	mov    QWORD PTR [r12+0x128],rax
      e94f45:	00 
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
### 0xe94f5b: mov    rax,QWORD PTR [rsp+0x20]
      e94f08:	49 8d 84 24 b0 00 00 	lea    rax,[r12+0xb0]
      e94f0f:	00 
      e94f10:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      e94f17:	00 
      e94f18:	49 8d 84 24 b8 00 00 	lea    rax,[r12+0xb8]
      e94f1f:	00 
      e94f20:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      e94f27:	00 
      e94f28:	66 0f ef c0          	pxor   xmm0,xmm0
      e94f2c:	f3 41 0f 7f 84 24 18 	movdqu XMMWORD PTR [r12+0x118],xmm0
      e94f33:	01 00 00 
      e94f36:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
      e94f3d:	00 
      e94f3e:	49 89 84 24 28 01 00 	mov    QWORD PTR [r12+0x128],rax
      e94f45:	00 
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
      e94fb8:	48 83 c7 20          	add    rdi,0x20
      e94fbc:	4c 89 f6             	mov    rsi,r14
      e94fbf:	e8 3a 3b 17 00       	call   1008afe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cff14>
      e94fc4:	4c 89 f7             	mov    rdi,r14
      e94fc7:	e8 9e 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94fcc:	49 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [r12+0xb8]
      e94fd3:	00 
      e94fd4:	48 8d 05 fd f8 9a 00 	lea    rax,[rip+0x9af8fd]        # 18448d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xfc0>
### 0xe94ffe: call   QWORD PTR [rax+0x20]
      e94faf:	00 
      e94fb0:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
      e94fb7:	00 
      e94fb8:	48 83 c7 20          	add    rdi,0x20
      e94fbc:	4c 89 f6             	mov    rsi,r14
      e94fbf:	e8 3a 3b 17 00       	call   1008afe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cff14>
      e94fc4:	4c 89 f7             	mov    rdi,r14
      e94fc7:	e8 9e 4f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94fcc:	49 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [r12+0xb8]
      e94fd3:	00 
      e94fd4:	48 8d 05 fd f8 9a 00 	lea    rax,[rip+0x9af8fd]        # 18448d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xfc0>
      e94fdb:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e94fe2:	00 
      e94fe3:	4c 89 ac 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r13
      e94fea:	00 
      e94feb:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e94ff2:	00 
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
### 0xe951cb: mov    rax,QWORD PTR [rsp+0x20]
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
### 0xe95236: mov    QWORD PTR [rbx+0x20],0x32
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
      e95272:	66 49 0f 7e c4       	movq   r12,xmm0
      e95277:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      e9527b:	4c 89 e7             	mov    rdi,r12
      e9527e:	48 89 5c 24 70       	mov    QWORD PTR [rsp+0x70],rbx
      e95283:	ff 10                	call   QWORD PTR [rax]
      e95285:	49 89 c5             	mov    r13,rax
      e95288:	4c 8d 7b 48          	lea    r15,[rbx+0x48]
      e9528c:	66 0f ef c0          	pxor   xmm0,xmm0
      e95290:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
      e95296:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
      e9529c:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      e952a1:	48 89 c7             	mov    rdi,rax
      e952a4:	e8 51 47 ff ff       	call   e899fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e10>
      e952a9:	48 89 c5             	mov    rbp,rax
### 0xe95290: movdqu XMMWORD PTR [r15+0x20],xmm0
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
      e95272:	66 49 0f 7e c4       	movq   r12,xmm0
      e95277:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      e9527b:	4c 89 e7             	mov    rdi,r12
      e9527e:	48 89 5c 24 70       	mov    QWORD PTR [rsp+0x70],rbx
      e95283:	ff 10                	call   QWORD PTR [rax]
      e95285:	49 89 c5             	mov    r13,rax
      e95288:	4c 8d 7b 48          	lea    r15,[rbx+0x48]
      e9528c:	66 0f ef c0          	pxor   xmm0,xmm0
      e95290:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
      e95296:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
      e9529c:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      e952a1:	48 89 c7             	mov    rdi,rax
      e952a4:	e8 51 47 ff ff       	call   e899fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e10>
      e952a9:	48 89 c5             	mov    rbp,rax
      e952ac:	49 89 d6             	mov    r14,rdx
      e952af:	4c 89 ef             	mov    rdi,r13
      e952b2:	e8 6b 47 ff ff       	call   e89a22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e38>
      e952b7:	49 89 d0             	mov    r8,rdx
      e952ba:	4c 89 ff             	mov    rdi,r15
      e952bd:	48 89 ee             	mov    rsi,rbp
      e952c0:	4c 89 f2             	mov    rdx,r14
      e952c3:	48 89 c1             	mov    rcx,rax
      e952c6:	e8 09 0c 03 00       	call   ec5ed4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d2ea>
      e952cb:	4c 8d 6b 18          	lea    r13,[rbx+0x18]
      e952cf:	4c 8b b4 24 88 00 00 	mov    r14,QWORD PTR [rsp+0x88]
      e952d6:	00 
      e952d7:	41 8a 6e 01          	mov    bpl,BYTE PTR [r14+0x1]
      e952db:	40 84 ed             	test   bpl,bpl
      e952de:	74 22                	je     e95302 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c718>
      e952e0:	48 8d 9c 24 d0 0f 00 	lea    rbx,[rsp+0xfd0]
      e952e7:	00 
      e952e8:	48 89 df             	mov    rdi,rbx
      e952eb:	e8 06 47 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e952f0:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e952f7:	00 
      e952f8:	48 89 de             	mov    rsi,rbx
      e952fb:	e8 3e 47 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
### 0xe95528: movq   xmm1,QWORD PTR [rsp+0x20]
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
      e9552e:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e95532:	66 0f 7f 8c 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm1
      e95539:	00 00 
      e9553b:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95540:	66 48 0f 6e c0       	movq   xmm0,rax
      e95545:	66 49 0f 6e cd       	movq   xmm1,r13
      e9554a:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9554e:	66 0f 7f 8c 24 50 02 	movdqa XMMWORD PTR [rsp+0x250],xmm1
      e95555:	00 00 
      e95557:	48 8b 8c 24 90 00 00 	mov    rcx,QWORD PTR [rsp+0x90]
      e9555e:	00 
      e9555f:	48 83 c1 08          	add    rcx,0x8
      e95563:	48 89 8c 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rcx
      e9556a:	00 
      e9556b:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      e95570:	49 8d 8c 24 38 01 00 	lea    rcx,[r12+0x138]
      e95577:	00 
      e95578:	48 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rcx
      e9557f:	00 
      e95580:	49 8d ac 24 c8 00 00 	lea    rbp,[r12+0xc8]
      e95587:	00 
      e95588:	49 89 c5             	mov    r13,rax
      e9558b:	49 83 c5 08          	add    r13,0x8
      e9558f:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
      e95596:	00 
      e95597:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
      e9559e:	00 
      e9559f:	48 89 df             	mov    rdi,rbx
### 0xe95674: movdqu XMMWORD PTR [r12+0x20],xmm0
      e9561a:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e9561d:	4d 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [r12+0xe8]
      e95624:	00 
      e95625:	bf 00 01 00 00       	mov    edi,0x100
      e9562a:	e8 d1 88 95 00       	call   17edf00 <_Znwm@plt>
      e9562f:	49 89 c4             	mov    r12,rax
      e95632:	48 89 ac 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbp
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
      e956b7:	e8 d4 87 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e956bc:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e956c1:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e956c8:	00 
      e956c9:	66 0f ef c0          	pxor   xmm0,xmm0
      e956cd:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
      e956d4:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e956db:	bd 00 00 80 3f       	mov    ebp,0x3f800000
      e956e0:	41 89 6c 24 68       	mov    DWORD PTR [r12+0x68],ebp
      e956e5:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e956ea:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      e956ef:	e8 02 43 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e956f4:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e956fb:	00 
### 0xe956ea: mov    QWORD PTR [rsp+0x20],rdi
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
      e956b7:	e8 d4 87 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e956bc:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e956c1:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e956c8:	00 
      e956c9:	66 0f ef c0          	pxor   xmm0,xmm0
      e956cd:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
      e956d4:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e956db:	bd 00 00 80 3f       	mov    ebp,0x3f800000
      e956e0:	41 89 6c 24 68       	mov    DWORD PTR [r12+0x68],ebp
      e956e5:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e956ea:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      e956ef:	e8 02 43 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e956f4:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e956fb:	00 
      e956fc:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
      e95703:	00 
      e95704:	e8 85 2b c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95709:	4d 89 e6             	mov    r14,r12
      e9570c:	49 81 c6 d8 00 00 00 	add    r14,0xd8
      e95713:	66 0f ef c0          	pxor   xmm0,xmm0
      e95717:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0xe8],xmm0
      e9571e:	00 00 00 
      e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
      e95728:	00 00 00 
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e95732:	00 
      e95733:	48 8d 05 de c4 5b ff 	lea    rax,[rip+0xffffffffff5bc4de]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e9573a:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e95741:	00 
      e95742:	48 89 06             	mov    QWORD PTR [rsi],rax
      e95745:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e95749:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
      e95752:	48 8d 05 0b 6d be ff 	lea    rax,[rip+0xffffffffffbe6d0b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e95759:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e9575d:	48 8d 05 ce d5 02 00 	lea    rax,[rip+0x2d5ce]        # ec2d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a148>
      e95764:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      e95768:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e9576f:	00 
### 0xe95790: mov    r13,QWORD PTR [r12+0x20]
      e9573a:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e95741:	00 
      e95742:	48 89 06             	mov    QWORD PTR [rsi],rax
      e95745:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e95749:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
      e95752:	48 8d 05 0b 6d be ff 	lea    rax,[rip+0xffffffffffbe6d0b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e95759:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e9575d:	48 8d 05 ce d5 02 00 	lea    rax,[rip+0x2d5ce]        # ec2d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a148>
      e95764:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      e95768:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e9576f:	00 
      e95770:	b9 60 ea 00 00       	mov    ecx,0xea60
      e95775:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
      e9577a:	48 89 df             	mov    rdi,rbx
      e9577d:	4c 89 fb             	mov    rbx,r15
      e95780:	4c 89 ea             	mov    rdx,r13
      e95783:	e8 fc c0 92 00       	call   17c1884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759f0>
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
### 0xe957e1: mov    rdi,QWORD PTR [rsp+0x20]
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
      e95857:	6a 08                	push   0x8
### 0xe9583e: mov    QWORD PTR [r15+0x20],rbx
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
      e95881:	74 05                	je     e95888 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cc9e>
      e95883:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95888:	4c 89 e7             	mov    rdi,r12
      e9588b:	e8 f6 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95890:	31 ff                	xor    edi,edi
      e95892:	e8 85 8b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e95897:	31 ff                	xor    edi,edi
      e95899:	e8 e8 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9589e:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e958a5:	00 
      e958a6:	e8 db 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e958ab:	48 8d b3 30 02 00 00 	lea    rsi,[rbx+0x230]
      e958b2:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      e958b9:	00 
### 0xe95938: mov    r12,QWORD PTR [rbx+0x20]
      e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f0:	4c 89 f8             	mov    rax,r15
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
      e9590d:	00 
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
      e95919:	00 
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
      e95928:	00 
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
      e95937:	00 
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
      e95947:	00 
      e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      e9594c:	48 89 8c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rcx
      e95953:	00 
      e95954:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e9595b:	00 
      e9595c:	4c 89 bc 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r15
      e95963:	00 
      e95964:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95969:	66 0f 6f 84 24 d0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xd0]
      e95970:	00 00 
      e95972:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
      e95979:	00 00 
      e9597b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e95980:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e95984:	48 8b 83 78 05 00 00 	mov    rax,QWORD PTR [rbx+0x578]
      e9598b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e95990:	48 8d 05 49 8f 97 00 	lea    rax,[rip+0x978f49]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e95997:	48 89 84 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rax
      e9599e:	00 
      e9599f:	4c 89 b4 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r14
      e959a6:	00 
      e959a7:	4c 89 ac 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r13
      e959ae:	00 
      e959af:	4c 8b b3 98 03 00 00 	mov    r14,QWORD PTR [rbx+0x398]
      e959b6:	4c 8b ab a0 03 00 00 	mov    r13,QWORD PTR [rbx+0x3a0]
### 0xe95a40: lea    rcx,[rbp+0x20]
      e959ea:	48 8d bc 24 e0 0d 00 	lea    rdi,[rsp+0xde0]
      e959f1:	00 
      e959f2:	48 8d b4 24 f0 0e 00 	lea    rsi,[rsp+0xef0]
      e959f9:	00 
      e959fa:	e8 91 48 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e959ff:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
      e95a06:	00 
      e95a07:	48 8d b4 24 c0 0e 00 	lea    rsi,[rsp+0xec0]
      e95a0e:	00 
      e95a0f:	e8 7c 48 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e95a14:	48 8b 83 b0 02 00 00 	mov    rax,QWORD PTR [rbx+0x2b0]
      e95a1b:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
      e95a22:	00 
      e95a23:	48 8b b4 24 f0 02 00 	mov    rsi,QWORD PTR [rsp+0x2f0]
      e95a2a:	00 
      e95a2b:	48 8b 94 24 f8 02 00 	mov    rdx,QWORD PTR [rsp+0x2f8]
      e95a32:	00 
      e95a33:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e95a3a:	00 
      e95a3b:	e8 de 49 7d 00       	call   166a41e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e58a>
      e95a40:	48 8d 4d 20          	lea    rcx,[rbp+0x20]
      e95a44:	48 8b 83 40 02 00 00 	mov    rax,QWORD PTR [rbx+0x240]
      e95a4b:	0f 10 83 38 02 00 00 	movups xmm0,XMMWORD PTR [rbx+0x238]
      e95a52:	0f 29 84 24 e0 02 00 	movaps XMMWORD PTR [rsp+0x2e0],xmm0
      e95a59:	00 
      e95a5a:	48 85 c0             	test   rax,rax
      e95a5d:	74 05                	je     e95a64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ce7a>
      e95a5f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95a64:	66 48 0f 6e cd       	movq   xmm1,rbp
      e95a69:	66 48 0f 6e c1       	movq   xmm0,rcx
      e95a6e:	48 8b 83 18 04 00 00 	mov    rax,QWORD PTR [rbx+0x418]
      e95a75:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
      e95a7c:	00 
      e95a7d:	48 8b 83 28 04 00 00 	mov    rax,QWORD PTR [rbx+0x428]
      e95a84:	48 89 84 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rax
      e95a8b:	00 
      e95a8c:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
      e95a90:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
      e95a97:	00 
      e95a98:	48 8b 83 40 04 00 00 	mov    rax,QWORD PTR [rbx+0x440]
      e95a9f:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
      e95aa6:	00 
      e95aa7:	0f 57 d2             	xorps  xmm2,xmm2
      e95aaa:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
      e95ab1:	00 
      e95ab2:	74 18                	je     e95acc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cee2>
      e95ab4:	0f 10 93 58 04 00 00 	movups xmm2,XMMWORD PTR [rbx+0x458]
      e95abb:	48 8b 83 60 04 00 00 	mov    rax,QWORD PTR [rbx+0x460]
      e95ac2:	48 85 c0             	test   rax,rax
### 0xe95b25: mov    QWORD PTR [rsp+0x20],rax
      e95acc:	4c 89 ac 24 48 02 00 	mov    QWORD PTR [rsp+0x248],r13
      e95ad3:	00 
      e95ad4:	4c 89 b4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r14
      e95adb:	00 
      e95adc:	0f 29 94 24 c0 01 00 	movaps XMMWORD PTR [rsp+0x1c0],xmm2
      e95ae3:	00 
      e95ae4:	4c 89 a4 24 28 01 00 	mov    QWORD PTR [rsp+0x128],r12
      e95aeb:	00 
      e95aec:	48 89 8c 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rcx
      e95af3:	00 
      e95af4:	48 83 c5 08          	add    rbp,0x8
      e95af8:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
      e95afc:	48 8d b3 b0 01 00 00 	lea    rsi,[rbx+0x1b0]
      e95b03:	48 8d 43 30          	lea    rax,[rbx+0x30]
      e95b07:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
      e95b0e:	00 
      e95b0f:	48 8d 83 80 00 00 00 	lea    rax,[rbx+0x80]
      e95b16:	48 89 84 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rax
      e95b1d:	00 
      e95b1e:	48 8d 83 50 02 00 00 	lea    rax,[rbx+0x250]
      e95b25:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      e95b2a:	48 8d 83 50 03 00 00 	lea    rax,[rbx+0x350]
      e95b31:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
      e95b38:	00 
      e95b39:	48 8d 83 d0 03 00 00 	lea    rax,[rbx+0x3d0]
      e95b40:	48 89 84 24 08 02 00 	mov    QWORD PTR [rsp+0x208],rax
      e95b47:	00 
      e95b48:	48 8d 83 30 04 00 00 	lea    rax,[rbx+0x430]
      e95b4f:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
      e95b56:	00 
      e95b57:	48 8d 83 48 04 00 00 	lea    rax,[rbx+0x448]
      e95b5e:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
      e95b65:	00 
      e95b66:	4c 8b 94 24 90 03 00 	mov    r10,QWORD PTR [rsp+0x390]
      e95b6d:	00 
      e95b6e:	4c 8b 9b b8 03 00 00 	mov    r11,QWORD PTR [rbx+0x3b8]
      e95b75:	48 89 d8             	mov    rax,rbx
      e95b78:	4c 8b ab 98 04 00 00 	mov    r13,QWORD PTR [rbx+0x498]
      e95b7f:	48 8b 9b a0 04 00 00 	mov    rbx,QWORD PTR [rbx+0x4a0]
      e95b86:	4c 8b b0 68 05 00 00 	mov    r14,QWORD PTR [rax+0x568]
      e95b8d:	4c 8b a0 70 05 00 00 	mov    r12,QWORD PTR [rax+0x570]
      e95b94:	48 8b 88 88 05 00 00 	mov    rcx,QWORD PTR [rax+0x588]
      e95b9b:	66 0f 6f 88 80 05 00 	movdqa xmm1,XMMWORD PTR [rax+0x580]
      e95ba2:	00 
      e95ba3:	66 0f 7f 8c 24 d0 02 	movdqa XMMWORD PTR [rsp+0x2d0],xmm1
      e95baa:	00 00 
      e95bac:	4c 8d b8 b8 04 00 00 	lea    r15,[rax+0x4b8]
      e95bb3:	48 85 c9             	test   rcx,rcx
      e95bb6:	74 05                	je     e95bbd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cfd3>
### 0xe95fba: mov    rsi,QWORD PTR [rsp+0x20]
      e95f65:	e8 26 43 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e95f6a:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      e95f71:	00 
      e95f72:	48 8d b4 24 c0 0e 00 	lea    rsi,[rsp+0xec0]
      e95f79:	00 
      e95f7a:	e8 11 43 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e95f7f:	48 8b 05 1a bb a1 00 	mov    rax,QWORD PTR [rip+0xa1bb1a]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e95f86:	48 89 84 24 00 0d 00 	mov    QWORD PTR [rsp+0xd00],rax
      e95f8d:	00 
      e95f8e:	48 8b 84 24 f8 02 00 	mov    rax,QWORD PTR [rsp+0x2f8]
      e95f95:	00 
      e95f96:	66 0f 6f 84 24 f0 02 	movdqa xmm0,XMMWORD PTR [rsp+0x2f0]
      e95f9d:	00 00 
      e95f9f:	f3 0f 7f 84 24 08 0d 	movdqu XMMWORD PTR [rsp+0xd08],xmm0
      e95fa6:	00 00 
      e95fa8:	48 85 c0             	test   rax,rax
      e95fab:	74 05                	je     e95fb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d3c8>
      e95fad:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95fb2:	48 8d bc 24 20 0d 00 	lea    rdi,[rsp+0xd20]
      e95fb9:	00 
      e95fba:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
      e95fbf:	e8 cc 42 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e95fc4:	4c 8d ac 24 50 0d 00 	lea    r13,[rsp+0xd50]
      e95fcb:	00 
      e95fcc:	48 8d b4 24 a8 02 00 	lea    rsi,[rsp+0x2a8]
      e95fd3:	00 
      e95fd4:	4c 89 ef             	mov    rdi,r13
      e95fd7:	e8 64 7f 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e95fdc:	48 8d bc 24 68 0d 00 	lea    rdi,[rsp+0xd68]
      e95fe3:	00 
      e95fe4:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e95fe9:	4c 8d a3 60 03 00 00 	lea    r12,[rbx+0x360]
      e95ff0:	4c 89 e6             	mov    rsi,r12
      e95ff3:	e8 48 7f 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e95ff8:	48 8b 83 90 03 00 00 	mov    rax,QWORD PTR [rbx+0x390]
      e95fff:	48 89 84 24 80 0d 00 	mov    QWORD PTR [rsp+0xd80],rax
      e96006:	00 
      e96007:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      e9600c:	48 89 84 24 88 0d 00 	mov    QWORD PTR [rsp+0xd88],rax
      e96013:	00 
      e96014:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      e9601b:	00 
      e9601c:	48 89 84 24 90 0d 00 	mov    QWORD PTR [rsp+0xd90],rax
      e96023:	00 
      e96024:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e96029:	48 8b 83 28 04 00 00 	mov    rax,QWORD PTR [rbx+0x428]
      e96030:	48 89 84 24 98 0d 00 	mov    QWORD PTR [rsp+0xd98],rax
      e96037:	00 
      e96038:	48 8b 83 98 05 00 00 	mov    rax,QWORD PTR [rbx+0x598]
### 0xe96145: mov    rsi,QWORD PTR [rsp+0x20]
      e960f4:	48 8d b4 24 c0 0e 00 	lea    rsi,[rsp+0xec0]
      e960fb:	00 
      e960fc:	4c 89 ff             	mov    rdi,r15
      e960ff:	e8 8c 41 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e96104:	4c 89 eb             	mov    rbx,r13
      e96107:	48 8b 05 92 b9 a1 00 	mov    rax,QWORD PTR [rip+0xa1b992]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e9610e:	48 89 84 24 50 0b 00 	mov    QWORD PTR [rsp+0xb50],rax
      e96115:	00 
      e96116:	48 8b 84 24 f8 02 00 	mov    rax,QWORD PTR [rsp+0x2f8]
      e9611d:	00 
      e9611e:	66 0f 6f 84 24 f0 02 	movdqa xmm0,XMMWORD PTR [rsp+0x2f0]
      e96125:	00 00 
      e96127:	f3 0f 7f 84 24 58 0b 	movdqu XMMWORD PTR [rsp+0xb58],xmm0
      e9612e:	00 00 
      e96130:	48 85 c0             	test   rax,rax
      e96133:	74 05                	je     e9613a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d550>
      e96135:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9613a:	4c 8d ac 24 70 0b 00 	lea    r13,[rsp+0xb70]
      e96141:	00 
      e96142:	4c 89 ef             	mov    rdi,r13
      e96145:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
      e9614a:	e8 41 41 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9614f:	48 8d bc 24 a0 0b 00 	lea    rdi,[rsp+0xba0]
      e96156:	00 
      e96157:	4c 89 e6             	mov    rsi,r12
      e9615a:	e8 e1 7d 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9615f:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      e96164:	49 8b 85 90 03 00 00 	mov    rax,QWORD PTR [r13+0x390]
      e9616b:	48 89 84 24 b8 0b 00 	mov    QWORD PTR [rsp+0xbb8],rax
      e96172:	00 
      e96173:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      e96178:	48 89 84 24 c0 0b 00 	mov    QWORD PTR [rsp+0xbc0],rax
      e9617f:	00 
      e96180:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      e96187:	00 
      e96188:	48 89 84 24 c8 0b 00 	mov    QWORD PTR [rsp+0xbc8],rax
      e9618f:	00 
      e96190:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e96195:	49 8b 85 28 04 00 00 	mov    rax,QWORD PTR [r13+0x428]
      e9619c:	48 89 84 24 d0 0b 00 	mov    QWORD PTR [rsp+0xbd0],rax
      e961a3:	00 
      e961a4:	49 8b 85 98 05 00 00 	mov    rax,QWORD PTR [r13+0x598]
      e961ab:	48 89 84 24 d8 0b 00 	mov    QWORD PTR [rsp+0xbd8],rax
      e961b2:	00 
      e961b3:	48 8d 35 fd d6 53 ff 	lea    rsi,[rip+0xffffffffff53d6fd]        # 3d38b7 <_ZTSN5boost17bad_function_callE@@Base+0xbfd>
      e961ba:	48 8d 0d 0f d7 53 ff 	lea    rcx,[rip+0xffffffffff53d70f]        # 3d38d0 <_ZTSN5boost17bad_function_callE@@Base+0xc16>
      e961c1:	6a 0b                	push   0xb
      e961c3:	5b                   	pop    rbx
      e961c4:	6a 1f                	push   0x1f
### 0xe9638e: lea    r14,[rbx+0x20]
      e9633b:	00 00 
      e9633d:	bf c0 01 00 00       	mov    edi,0x1c0
      e96342:	e8 b9 7b 95 00       	call   17edf00 <_Znwm@plt>
      e96347:	48 89 c3             	mov    rbx,rax
      e9634a:	48 89 84 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rax
      e96351:	00 
      e96352:	48 8d 84 24 10 10 00 	lea    rax,[rsp+0x1010]
      e96359:	00 
      e9635a:	48 89 84 24 58 10 00 	mov    QWORD PTR [rsp+0x1058],rax
      e96361:	00 
      e96362:	48 c7 84 24 60 10 00 	mov    QWORD PTR [rsp+0x1060],0x1
      e96369:	00 01 00 00 00 
      e9636e:	48 8d 05 eb b8 99 00 	lea    rax,[rip+0x99b8eb]        # 1831c60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3bf8>
      e96375:	48 89 03             	mov    QWORD PTR [rbx],rax
      e96378:	48 8d b4 24 60 06 00 	lea    rsi,[rsp+0x660]
      e9637f:	00 
      e96380:	48 8b 46 f0          	mov    rax,QWORD PTR [rsi-0x10]
      e96384:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e96388:	8b 46 f8             	mov    eax,DWORD PTR [rsi-0x8]
      e9638b:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax
      e9638e:	4c 8d 73 20          	lea    r14,[rbx+0x20]
      e96392:	4c 89 f7             	mov    rdi,r14
      e96395:	e8 7c 85 ff ff       	call   e8e916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d2c>
      e9639a:	48 8b 84 24 e8 06 00 	mov    rax,QWORD PTR [rsp+0x6e8]
      e963a1:	00 
      e963a2:	0f 28 84 24 e0 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x6e0]
      e963a9:	00 
      e963aa:	0f 11 83 a0 00 00 00 	movups XMMWORD PTR [rbx+0xa0],xmm0
      e963b1:	48 85 c0             	test   rax,rax
      e963b4:	74 05                	je     e963bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d7d1>
      e963b6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e963bb:	44 88 bc 24 68 01 00 	mov    BYTE PTR [rsp+0x168],r15b
      e963c2:	00 
      e963c3:	0f 28 84 24 f0 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x6f0]
      e963ca:	00 
      e963cb:	0f 29 83 b0 00 00 00 	movaps XMMWORD PTR [rbx+0xb0],xmm0
      e963d2:	48 8b 84 24 08 07 00 	mov    rax,QWORD PTR [rsp+0x708]
      e963d9:	00 
      e963da:	66 0f 6f 84 24 00 07 	movdqa xmm0,XMMWORD PTR [rsp+0x700]
      e963e1:	00 00 
      e963e3:	f3 0f 7f 83 c0 00 00 	movdqu XMMWORD PTR [rbx+0xc0],xmm0
      e963ea:	00 
      e963eb:	48 85 c0             	test   rax,rax
      e963ee:	74 05                	je     e963f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d80b>
      e963f0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e963f5:	4c 8d bb d0 00 00 00 	lea    r15,[rbx+0xd0]
      e963fc:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      e96403:	00 
      e96404:	4c 89 ff             	mov    rdi,r15
### 0xe964a1: movaps XMMWORD PTR [rsp+0x20],xmm0
      e9643c:	49 8b 46 f0          	mov    rax,QWORD PTR [r14-0x10]
      e96440:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
      e96447:	0f 57 c0             	xorps  xmm0,xmm0
      e9644a:	41 0f 11 46 e8       	movups XMMWORD PTR [r14-0x18],xmm0
      e9644f:	48 89 df             	mov    rdi,rbx
      e96452:	48 81 c7 50 01 00 00 	add    rdi,0x150
      e96459:	4c 89 f6             	mov    rsi,r14
      e9645c:	e8 cb 65 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e96461:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      e96465:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
      e9646c:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
      e96471:	0f 29 83 80 01 00 00 	movaps XMMWORD PTR [rbx+0x180],xmm0
      e96478:	66 0f ef c9          	pxor   xmm1,xmm1
      e9647c:	66 41 0f 7f 4e 30    	movdqa XMMWORD PTR [r14+0x30],xmm1
      e96482:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
      e96487:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
      e9648c:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      e96493:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      e96497:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      e9649e:	0f 57 c0             	xorps  xmm0,xmm0
      e964a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e964a6:	66 41 0f 7f 4e 50    	movdqa XMMWORD PTR [r14+0x50],xmm1
      e964ac:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
      e964b1:	0f 29 83 b0 01 00 00 	movaps XMMWORD PTR [rbx+0x1b0],xmm0
      e964b8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e964bf:	00 
      e964c0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e964c4:	48 89 9c 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rbx
      e964cb:	00 
      e964cc:	e8 f9 3d be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e964d1:	48 8d 84 24 20 06 00 	lea    rax,[rsp+0x620]
      e964d8:	00 
      e964d9:	48 8d 0d 00 84 97 00 	lea    rcx,[rip+0x978400]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
      e964f9:	00 
      e964fa:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e964fe:	4d 8b a5 28 04 00 00 	mov    r12,QWORD PTR [r13+0x428]
      e96505:	41 0f 28 85 70 04 00 	movaps xmm0,XMMWORD PTR [r13+0x470]
      e9650c:	00 
      e9650d:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      e96514:	00 
      e96515:	49 8b 9d 78 04 00 00 	mov    rbx,QWORD PTR [r13+0x478]
      e9651c:	48 85 db             	test   rbx,rbx
      e9651f:	74 05                	je     e96526 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d93c>
      e96521:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
### 0xe964ee: mov    QWORD PTR [rax+0x20],rax
      e9648c:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      e96493:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      e96497:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      e9649e:	0f 57 c0             	xorps  xmm0,xmm0
      e964a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e964a6:	66 41 0f 7f 4e 50    	movdqa XMMWORD PTR [r14+0x50],xmm1
      e964ac:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
      e964b1:	0f 29 83 b0 01 00 00 	movaps XMMWORD PTR [rbx+0x1b0],xmm0
      e964b8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e964bf:	00 
      e964c0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e964c4:	48 89 9c 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rbx
      e964cb:	00 
      e964cc:	e8 f9 3d be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e964d1:	48 8d 84 24 20 06 00 	lea    rax,[rsp+0x620]
      e964d8:	00 
      e964d9:	48 8d 0d 00 84 97 00 	lea    rcx,[rip+0x978400]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
      e964f9:	00 
      e964fa:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e964fe:	4d 8b a5 28 04 00 00 	mov    r12,QWORD PTR [r13+0x428]
      e96505:	41 0f 28 85 70 04 00 	movaps xmm0,XMMWORD PTR [r13+0x470]
      e9650c:	00 
      e9650d:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      e96514:	00 
      e96515:	49 8b 9d 78 04 00 00 	mov    rbx,QWORD PTR [r13+0x478]
      e9651c:	48 85 db             	test   rbx,rbx
      e9651f:	74 05                	je     e96526 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d93c>
      e96521:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e96526:	4d 8b bd 90 05 00 00 	mov    r15,QWORD PTR [r13+0x590]
      e9652d:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
      e96534:	00 
      e96535:	74 1e                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>
      e96537:	41 0f 10 85 58 04 00 	movups xmm0,XMMWORD PTR [r13+0x458]
      e9653e:	00 
      e9653f:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e96544:	49 8b 85 60 04 00 00 	mov    rax,QWORD PTR [r13+0x460]
      e9654b:	48 85 c0             	test   rax,rax
      e9654e:	74 05                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>
      e96550:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e96555:	bf 60 03 00 00       	mov    edi,0x360
      e9655a:	e8 a1 79 95 00       	call   17edf00 <_Znwm@plt>
      e9655f:	48 89 c5             	mov    rbp,rax
      e96562:	48 85 db             	test   rbx,rbx
      e96565:	4c 8b ac 24 b8 01 00 	mov    r13,QWORD PTR [rsp+0x1b8]
### 0xe9653f: movaps XMMWORD PTR [rsp+0x20],xmm0
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
      e964f9:	00 
      e964fa:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e964fe:	4d 8b a5 28 04 00 00 	mov    r12,QWORD PTR [r13+0x428]
      e96505:	41 0f 28 85 70 04 00 	movaps xmm0,XMMWORD PTR [r13+0x470]
      e9650c:	00 
      e9650d:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      e96514:	00 
      e96515:	49 8b 9d 78 04 00 00 	mov    rbx,QWORD PTR [r13+0x478]
      e9651c:	48 85 db             	test   rbx,rbx
      e9651f:	74 05                	je     e96526 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d93c>
      e96521:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e96526:	4d 8b bd 90 05 00 00 	mov    r15,QWORD PTR [r13+0x590]
      e9652d:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
      e96534:	00 
      e96535:	74 1e                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>
      e96537:	41 0f 10 85 58 04 00 	movups xmm0,XMMWORD PTR [r13+0x458]
      e9653e:	00 
      e9653f:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e96544:	49 8b 85 60 04 00 00 	mov    rax,QWORD PTR [r13+0x460]
      e9654b:	48 85 c0             	test   rax,rax
      e9654e:	74 05                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>
      e96550:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e96555:	bf 60 03 00 00       	mov    edi,0x360
      e9655a:	e8 a1 79 95 00       	call   17edf00 <_Znwm@plt>
      e9655f:	48 89 c5             	mov    rbp,rax
      e96562:	48 85 db             	test   rbx,rbx
      e96565:	4c 8b ac 24 b8 01 00 	mov    r13,QWORD PTR [rsp+0x1b8]
      e9656c:	00 
      e9656d:	74 05                	je     e96574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d98a>
      e9656f:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e96574:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e9657a:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      e96581:	48 85 c0             	test   rax,rax
      e96584:	74 05                	je     e9658b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d9a1>
      e96586:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9658b:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      e96592:	00 
      e96593:	0f b7 84 24 e2 03 00 	movzx  eax,WORD PTR [rsp+0x3e2]
      e9659a:	00 
      e9659b:	66 89 84 24 1c 04 00 	mov    WORD PTR [rsp+0x41c],ax
      e965a2:	00 
      e965a3:	8a 84 24 e4 03 00 00 	mov    al,BYTE PTR [rsp+0x3e4]
      e965aa:	88 84 24 1e 04 00 00 	mov    BYTE PTR [rsp+0x41e],al
      e965b1:	66 0f ef c0          	pxor   xmm0,xmm0
      e965b5:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e965ba:	48 8d 05 1f ba 99 00 	lea    rax,[rip+0x99ba1f]        # 1831fe0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3f78>
### 0xe96574: movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96521:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e96526:	4d 8b bd 90 05 00 00 	mov    r15,QWORD PTR [r13+0x590]
      e9652d:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
      e96534:	00 
      e96535:	74 1e                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>
      e96537:	41 0f 10 85 58 04 00 	movups xmm0,XMMWORD PTR [r13+0x458]
      e9653e:	00 
      e9653f:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e96544:	49 8b 85 60 04 00 00 	mov    rax,QWORD PTR [r13+0x460]
      e9654b:	48 85 c0             	test   rax,rax
      e9654e:	74 05                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>
      e96550:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e96555:	bf 60 03 00 00       	mov    edi,0x360
      e9655a:	e8 a1 79 95 00       	call   17edf00 <_Znwm@plt>
      e9655f:	48 89 c5             	mov    rbp,rax
      e96562:	48 85 db             	test   rbx,rbx
      e96565:	4c 8b ac 24 b8 01 00 	mov    r13,QWORD PTR [rsp+0x1b8]
      e9656c:	00 
      e9656d:	74 05                	je     e96574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d98a>
      e9656f:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e96574:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e9657a:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
      e96581:	48 85 c0             	test   rax,rax
      e96584:	74 05                	je     e9658b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d9a1>
      e96586:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9658b:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      e96592:	00 
      e96593:	0f b7 84 24 e2 03 00 	movzx  eax,WORD PTR [rsp+0x3e2]
      e9659a:	00 
      e9659b:	66 89 84 24 1c 04 00 	mov    WORD PTR [rsp+0x41c],ax
      e965a2:	00 
      e965a3:	8a 84 24 e4 03 00 00 	mov    al,BYTE PTR [rsp+0x3e4]
      e965aa:	88 84 24 1e 04 00 00 	mov    BYTE PTR [rsp+0x41e],al
      e965b1:	66 0f ef c0          	pxor   xmm0,xmm0
      e965b5:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e965ba:	48 8d 05 1f ba 99 00 	lea    rax,[rip+0x99ba1f]        # 1831fe0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3f78>
      e965c1:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e965c5:	48 8d 7d 18          	lea    rdi,[rbp+0x18]
      e965c9:	48 89 bc 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rdi
      e965d0:	00 
      e965d1:	e8 c0 eb f6 ff       	call   e05196 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd221c>
      e965d6:	48 8d 7d 70          	lea    rdi,[rbp+0x70]
      e965da:	48 89 bc 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rdi
      e965e1:	00 
      e965e2:	e8 57 eb f6 ff       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>
      e965e7:	48 83 a5 c8 00 00 00 	and    QWORD PTR [rbp+0xc8],0x0
      e965ee:	00 
      e965ef:	48 8d bd d0 00 00 00 	lea    rdi,[rbp+0xd0]
      e965f6:	48 89 bc 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rdi
### 0xe96a99: movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96a2d:	8a 94 24 c0 00 00 00 	mov    dl,BYTE PTR [rsp+0xc0]
      e96a34:	88 95 00 03 00 00    	mov    BYTE PTR [rbp+0x300],dl
      e96a3a:	0f b7 94 24 1c 04 00 	movzx  edx,WORD PTR [rsp+0x41c]
      e96a41:	00 
      e96a42:	66 89 95 01 03 00 00 	mov    WORD PTR [rbp+0x301],dx
      e96a49:	8a 94 24 1e 04 00 00 	mov    dl,BYTE PTR [rsp+0x41e]
      e96a50:	88 95 03 03 00 00    	mov    BYTE PTR [rbp+0x303],dl
      e96a56:	8a 94 24 68 01 00 00 	mov    dl,BYTE PTR [rsp+0x168]
      e96a5d:	88 95 04 03 00 00    	mov    BYTE PTR [rbp+0x304],dl
      e96a63:	88 8d 05 03 00 00    	mov    BYTE PTR [rbp+0x305],cl
      e96a69:	66 0f 6f 84 24 a0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1a0]
      e96a70:	00 00 
      e96a72:	f3 0f 7f 85 08 03 00 	movdqu XMMWORD PTR [rbp+0x308],xmm0
      e96a79:	00 
      e96a7a:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e96a81:	48 85 db             	test   rbx,rbx
      e96a84:	74 05                	je     e96a8b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dea1>
      e96a86:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e96a8b:	48 89 85 18 03 00 00 	mov    QWORD PTR [rbp+0x318],rax
      e96a92:	4c 89 bd 20 03 00 00 	mov    QWORD PTR [rbp+0x320],r15
      e96a99:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96a9f:	f3 0f 7f 85 28 03 00 	movdqu XMMWORD PTR [rbp+0x328],xmm0
      e96aa6:	00 
      e96aa7:	66 49 0f 3a 16 c7 01 	pextrq r15,xmm0,0x1
      e96aae:	4d 85 ff             	test   r15,r15
      e96ab1:	74 05                	je     e96ab8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dece>
      e96ab3:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e96ab8:	66 0f ef c0          	pxor   xmm0,xmm0
      e96abc:	f3 0f 7f 85 48 03 00 	movdqu XMMWORD PTR [rbp+0x348],xmm0
      e96ac3:	00 
      e96ac4:	48 83 a5 58 03 00 00 	and    QWORD PTR [rbp+0x358],0x0
      e96acb:	00 
      e96acc:	f3 0f 7f 85 38 03 00 	movdqu XMMWORD PTR [rbp+0x338],xmm0
      e96ad3:	00 
      e96ad4:	4c 8b b5 50 02 00 00 	mov    r14,QWORD PTR [rbp+0x250]
      e96adb:	4c 8d 84 24 10 10 00 	lea    r8,[rsp+0x1010]
      e96ae2:	00 
      e96ae3:	49 89 28             	mov    QWORD PTR [r8],rbp
      e96ae6:	48 8d 35 a4 65 c0 ff 	lea    rsi,[rip+0xffffffffffc065a4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e96aed:	48 8d 0d e0 c7 01 00 	lea    rcx,[rip+0x1c7e0]        # eb32d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6ea>
      e96af4:	4c 8d ac 24 50 10 00 	lea    r13,[rsp+0x1050]
      e96afb:	00 
      e96afc:	6a 08                	push   0x8
      e96afe:	41 59                	pop    r9
      e96b00:	4c 89 ef             	mov    rdi,r13
      e96b03:	31 d2                	xor    edx,edx
      e96b05:	e8 8a 3c 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e96b0a:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e96b0d:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
### 0xe96c13: and    QWORD PTR [r12+0x20],0x0
      e96bbd:	4c 8b ad 50 02 00 00 	mov    r13,QWORD PTR [rbp+0x250]
      e96bc4:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96bcb:	00 
      e96bcc:	48 8b b4 24 e8 00 00 	mov    rsi,QWORD PTR [rsp+0xe8]
      e96bd3:	00 
      e96bd4:	e8 05 c7 01 00       	call   eb32de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6f4>
      e96bd9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e96bdd:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e96be4:	00 
      e96be5:	48 8d 94 24 50 10 00 	lea    rdx,[rsp+0x1050]
      e96bec:	00 
      e96bed:	4c 89 ee             	mov    rsi,r13
      e96bf0:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
      e96bf6:	48 8b bc 24 b8 03 00 	mov    rdi,QWORD PTR [rsp+0x3b8]
      e96bfd:	00 
      e96bfe:	e8 83 78 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96c03:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e96c0a:	00 
      e96c0b:	4c 89 e7             	mov    rdi,r12
      e96c0e:	e8 d5 3b 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e96c13:	49 83 64 24 20 00    	and    QWORD PTR [r12+0x20],0x0
      e96c19:	4c 8d a4 24 80 10 00 	lea    r12,[rsp+0x1080]
      e96c20:	00 
      e96c21:	49 83 64 24 20 00    	and    QWORD PTR [r12+0x20],0x0
      e96c27:	48 8d 05 ea 8d 02 00 	lea    rax,[rip+0x28dea]        # ebfa18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x86e2e>
      e96c2e:	48 89 84 24 18 10 00 	mov    QWORD PTR [rsp+0x1018],rax
      e96c35:	00 
      e96c36:	48 83 a4 24 20 10 00 	and    QWORD PTR [rsp+0x1020],0x0
      e96c3d:	00 00 
      e96c3f:	48 89 ac 24 28 10 00 	mov    QWORD PTR [rsp+0x1028],rbp
      e96c46:	00 
      e96c47:	48 8d 05 d2 bc 99 00 	lea    rax,[rip+0x99bcd2]        # 1832920 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x48b8>
      e96c4e:	48 89 84 24 10 10 00 	mov    QWORD PTR [rsp+0x1010],rax
      e96c55:	00 
      e96c56:	4c 89 b4 24 30 10 00 	mov    QWORD PTR [rsp+0x1030],r14
      e96c5d:	00 
      e96c5e:	4c 8d ac 24 50 10 00 	lea    r13,[rsp+0x1050]
      e96c65:	00 
      e96c66:	4c 89 f7             	mov    rdi,r14
      e96c69:	4c 89 ee             	mov    rsi,r13
      e96c6c:	e8 bd 96 02 00       	call   ec032e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87744>
      e96c71:	4c 89 f7             	mov    rdi,r14
      e96c74:	e8 f1 32 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96c79:	48 8d 05 e8 bc 99 00 	lea    rax,[rip+0x99bce8]        # 1832968 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4900>
      e96c80:	48 89 84 24 10 10 00 	mov    QWORD PTR [rsp+0x1010],rax
      e96c87:	00 
      e96c88:	48 89 ac 24 18 10 00 	mov    QWORD PTR [rsp+0x1018],rbp
      e96c8f:	00 
      e96c90:	4c 89 b4 24 30 10 00 	mov    QWORD PTR [rsp+0x1030],r14
### 0xe96c21: and    QWORD PTR [r12+0x20],0x0
      e96bcc:	48 8b b4 24 e8 00 00 	mov    rsi,QWORD PTR [rsp+0xe8]
      e96bd3:	00 
      e96bd4:	e8 05 c7 01 00       	call   eb32de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6f4>
      e96bd9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e96bdd:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      e96be4:	00 
      e96be5:	48 8d 94 24 50 10 00 	lea    rdx,[rsp+0x1050]
      e96bec:	00 
      e96bed:	4c 89 ee             	mov    rsi,r13
      e96bf0:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
      e96bf6:	48 8b bc 24 b8 03 00 	mov    rdi,QWORD PTR [rsp+0x3b8]
      e96bfd:	00 
      e96bfe:	e8 83 78 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96c03:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e96c0a:	00 
      e96c0b:	4c 89 e7             	mov    rdi,r12
      e96c0e:	e8 d5 3b 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e96c13:	49 83 64 24 20 00    	and    QWORD PTR [r12+0x20],0x0
      e96c19:	4c 8d a4 24 80 10 00 	lea    r12,[rsp+0x1080]
      e96c20:	00 
      e96c21:	49 83 64 24 20 00    	and    QWORD PTR [r12+0x20],0x0
      e96c27:	48 8d 05 ea 8d 02 00 	lea    rax,[rip+0x28dea]        # ebfa18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x86e2e>
      e96c2e:	48 89 84 24 18 10 00 	mov    QWORD PTR [rsp+0x1018],rax
      e96c35:	00 
      e96c36:	48 83 a4 24 20 10 00 	and    QWORD PTR [rsp+0x1020],0x0
      e96c3d:	00 00 
      e96c3f:	48 89 ac 24 28 10 00 	mov    QWORD PTR [rsp+0x1028],rbp
      e96c46:	00 
      e96c47:	48 8d 05 d2 bc 99 00 	lea    rax,[rip+0x99bcd2]        # 1832920 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x48b8>
      e96c4e:	48 89 84 24 10 10 00 	mov    QWORD PTR [rsp+0x1010],rax
      e96c55:	00 
      e96c56:	4c 89 b4 24 30 10 00 	mov    QWORD PTR [rsp+0x1030],r14
      e96c5d:	00 
      e96c5e:	4c 8d ac 24 50 10 00 	lea    r13,[rsp+0x1050]
      e96c65:	00 
      e96c66:	4c 89 f7             	mov    rdi,r14
      e96c69:	4c 89 ee             	mov    rsi,r13
      e96c6c:	e8 bd 96 02 00       	call   ec032e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87744>
      e96c71:	4c 89 f7             	mov    rdi,r14
      e96c74:	e8 f1 32 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96c79:	48 8d 05 e8 bc 99 00 	lea    rax,[rip+0x99bce8]        # 1832968 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4900>
      e96c80:	48 89 84 24 10 10 00 	mov    QWORD PTR [rsp+0x1010],rax
      e96c87:	00 
      e96c88:	48 89 ac 24 18 10 00 	mov    QWORD PTR [rsp+0x1018],rbp
      e96c8f:	00 
      e96c90:	4c 89 b4 24 30 10 00 	mov    QWORD PTR [rsp+0x1030],r14
      e96c97:	00 
      e96c98:	4c 89 f7             	mov    rdi,r14
      e96c9b:	4c 89 e6             	mov    rsi,r12
### 0xe96d10: movdqa XMMWORD PTR [rsp+0x20],xmm1
      e96cc2:	00 
      e96cc3:	4c 89 f7             	mov    rdi,r14
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
      e96d36:	48 83 c0 08          	add    rax,0x8
      e96d3a:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      e96d3e:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96d44:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
      e96d48:	e8 65 77 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96d4d:	4c 89 ef             	mov    rdi,r13
      e96d50:	e8 31 77 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96d55:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96d5c:	00 
      e96d5d:	e8 40 6d 01 00       	call   eadaa2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x74eb8>
      e96d62:	4c 89 ff             	mov    rdi,r15
      e96d65:	e8 1c 77 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96d6a:	48 89 df             	mov    rdi,rbx
      e96d6d:	e8 14 77 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96d72:	4c 89 ff             	mov    rdi,r15
      e96d75:	e8 0c 77 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96d7a:	48 89 df             	mov    rdi,rbx
      e96d7d:	e8 04 77 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96d82:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
### 0xe96d3e: movdqa xmm0,XMMWORD PTR [rsp+0x20]
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
      e96d36:	48 83 c0 08          	add    rax,0x8
      e96d3a:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
      e96d3e:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96d44:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
      e96d48:	e8 65 77 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96d4d:	4c 89 ef             	mov    rdi,r13
      e96d50:	e8 31 77 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96d55:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96d5c:	00 
      e96d5d:	e8 40 6d 01 00       	call   eadaa2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x74eb8>
      e96d62:	4c 89 ff             	mov    rdi,r15
      e96d65:	e8 1c 77 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96d6a:	48 89 df             	mov    rdi,rbx
      e96d6d:	e8 14 77 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96d72:	4c 89 ff             	mov    rdi,r15
      e96d75:	e8 0c 77 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96d7a:	48 89 df             	mov    rdi,rbx
      e96d7d:	e8 04 77 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96d82:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      e96d89:	00 
      e96d8a:	e8 f7 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96d8f:	48 8d bc 24 20 06 00 	lea    rdi,[rsp+0x620]
      e96d96:	00 
      e96d97:	e8 ce 31 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96d9c:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e96da3:	00 
      e96da4:	e8 c1 31 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96da9:	48 8d bc 24 50 06 00 	lea    rdi,[rsp+0x650]
      e96db0:	00 
      e96db1:	e8 c8 b7 00 00       	call   ea257e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69994>
      e96db6:	48 8d bc 24 00 0a 00 	lea    rdi,[rsp+0xa00]
### 0xe96e84: movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96e31:	31 d2                	xor    edx,edx
      e96e33:	e8 5c 39 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e96e38:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e96e3b:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
      e96e42:	00 
      e96e43:	4c 89 fe             	mov    rsi,r15
      e96e46:	4c 89 e2             	mov    rdx,r12
      e96e49:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
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
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
### 0xe96e94: mov    QWORD PTR [r15+0x20],r15
      e96e3b:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
      e96e42:	00 
      e96e43:	4c 89 fe             	mov    rsi,r15
      e96e46:	4c 89 e2             	mov    rdx,r12
      e96e49:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
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
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
### 0xe96ebe: mov    rdi,QWORD PTR [r15+0x20]
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
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
### 0xe96ec5: call   QWORD PTR [rax+0x20]
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
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
### 0xe96ecc: mov    QWORD PTR [r15+0x20],rax
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
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
### 0xe96ef3: mov    rdi,QWORD PTR [r15+0x20]
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
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
### 0xe96efa: call   QWORD PTR [rax+0x20]
      e96eb2:	00 
      e96eb3:	4c 89 ff             	mov    rdi,r15
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
### 0xe96efd: and    QWORD PTR [r15+0x20],0x0
      e96eb3:	4c 89 ff             	mov    rdi,r15
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### 0xe96f1b: call   QWORD PTR [rax+0x20]
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
### 0xe96f47: call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f91:	00 
      e96f92:	4c 89 fe             	mov    rsi,r15
      e96f95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f98:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      e96f9c:	e8 e5 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96fa1:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e96fa6:	48 8b b3 c0 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3c0]
      e96fad:	48 85 f6             	test   rsi,rsi
      e96fb0:	0f 84 8e 00 00 00    	je     e97044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e45a>
      e96fb6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e96fb9:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
### 0xe96f70: movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f91:	00 
      e96f92:	4c 89 fe             	mov    rsi,r15
      e96f95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f98:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      e96f9c:	e8 e5 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96fa1:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e96fa6:	48 8b b3 c0 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3c0]
      e96fad:	48 85 f6             	test   rsi,rsi
      e96fb0:	0f 84 8e 00 00 00    	je     e97044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e45a>
      e96fb6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e96fb9:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96fc0:	00 
      e96fc1:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96fc4:	48 8b bc 24 50 10 00 	mov    rdi,QWORD PTR [rsp+0x1050]
      e96fcb:	00 
      e96fcc:	48 85 ff             	test   rdi,rdi
      e96fcf:	74 66                	je     e97037 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e44d>
      e96fd1:	48 8b 9c 24 18 01 00 	mov    rbx,QWORD PTR [rsp+0x118]
      e96fd8:	00 
      e96fd9:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fde:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fe3:	48 8d 05 96 ad 99 00 	lea    rax,[rip+0x99ad96]        # 1831d80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d18>
### 0xe96fc1: call   QWORD PTR [rax+0x20]
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f91:	00 
      e96f92:	4c 89 fe             	mov    rsi,r15
      e96f95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f98:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      e96f9c:	e8 e5 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96fa1:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e96fa6:	48 8b b3 c0 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3c0]
      e96fad:	48 85 f6             	test   rsi,rsi
      e96fb0:	0f 84 8e 00 00 00    	je     e97044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e45a>
      e96fb6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e96fb9:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96fc0:	00 
      e96fc1:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96fc4:	48 8b bc 24 50 10 00 	mov    rdi,QWORD PTR [rsp+0x1050]
      e96fcb:	00 
      e96fcc:	48 85 ff             	test   rdi,rdi
      e96fcf:	74 66                	je     e97037 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e44d>
      e96fd1:	48 8b 9c 24 18 01 00 	mov    rbx,QWORD PTR [rsp+0x118]
      e96fd8:	00 
      e96fd9:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fde:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fe3:	48 8d 05 96 ad 99 00 	lea    rax,[rip+0x99ad96]        # 1831d80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d18>
      e96fea:	4c 8d a4 24 f0 05 00 	lea    r12,[rsp+0x5f0]
      e96ff1:	00 
      e96ff2:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e96ff6:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
      e96ffd:	00 
      e96ffe:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      e97003:	49 89 5c 24 10       	mov    QWORD PTR [r12+0x10],rbx
      e97008:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      e9700d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e97010:	4c 89 e6             	mov    rsi,r12
      e97013:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e97016:	4c 89 e7             	mov    rdi,r12
      e97019:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e9701e:	e8 47 2f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e97023:	31 ff                	xor    edi,edi
      e97025:	e8 88 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e9702a:	48 89 df             	mov    rdi,rbx
      e9702d:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e97032:	e8 7b 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### 0xe97008: mov    QWORD PTR [r12+0x20],r12
      e96fb6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e96fb9:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96fc0:	00 
      e96fc1:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96fc4:	48 8b bc 24 50 10 00 	mov    rdi,QWORD PTR [rsp+0x1050]
      e96fcb:	00 
      e96fcc:	48 85 ff             	test   rdi,rdi
      e96fcf:	74 66                	je     e97037 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e44d>
      e96fd1:	48 8b 9c 24 18 01 00 	mov    rbx,QWORD PTR [rsp+0x118]
      e96fd8:	00 
      e96fd9:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fde:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fe3:	48 8d 05 96 ad 99 00 	lea    rax,[rip+0x99ad96]        # 1831d80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d18>
      e96fea:	4c 8d a4 24 f0 05 00 	lea    r12,[rsp+0x5f0]
      e96ff1:	00 
      e96ff2:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e96ff6:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
      e96ffd:	00 
      e96ffe:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      e97003:	49 89 5c 24 10       	mov    QWORD PTR [r12+0x10],rbx
      e97008:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      e9700d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e97010:	4c 89 e6             	mov    rsi,r12
      e97013:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e97016:	4c 89 e7             	mov    rdi,r12
      e97019:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e9701e:	e8 47 2f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e97023:	31 ff                	xor    edi,edi
      e97025:	e8 88 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e9702a:	48 89 df             	mov    rdi,rbx
      e9702d:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e97032:	e8 7b 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e97037:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
      e9703e:	00 
      e9703f:	e8 42 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97044:	48 8b bc 24 20 03 00 	mov    rdi,QWORD PTR [rsp+0x320]
      e9704b:	00 
      e9704c:	48 85 ff             	test   rdi,rdi
      e9704f:	74 30                	je     e97081 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e497>
      e97051:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e97058:	00 
      e97059:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e9705f:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
      e97065:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e97069:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e9706c:	4c 89 e6             	mov    rsi,r12
      e9706f:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e97072:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e97077:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
### 0xe97059: movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e9700d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e97010:	4c 89 e6             	mov    rsi,r12
      e97013:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e97016:	4c 89 e7             	mov    rdi,r12
      e97019:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e9701e:	e8 47 2f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e97023:	31 ff                	xor    edi,edi
      e97025:	e8 88 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e9702a:	48 89 df             	mov    rdi,rbx
      e9702d:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e97032:	e8 7b 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e97037:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
      e9703e:	00 
      e9703f:	e8 42 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97044:	48 8b bc 24 20 03 00 	mov    rdi,QWORD PTR [rsp+0x320]
      e9704b:	00 
      e9704c:	48 85 ff             	test   rdi,rdi
      e9704f:	74 30                	je     e97081 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e497>
      e97051:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e97058:	00 
      e97059:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e9705f:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
      e97065:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e97069:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e9706c:	4c 89 e6             	mov    rsi,r12
      e9706f:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e97072:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e97077:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e9707c:	e8 05 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97081:	48 8d 35 60 fa 4a ff 	lea    rsi,[rip+0xffffffffff4afa60]        # 346ae8 <_ZTSSt12bad_any_cast@@Base-0x496e0>
      e97088:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e9708f:	00 
      e97090:	e8 e9 29 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e97095:	bf e0 00 00 00       	mov    edi,0xe0
      e9709a:	e8 61 6e 95 00       	call   17edf00 <_Znwm@plt>
      e9709f:	49 89 c6             	mov    r14,rax
      e970a2:	66 0f ef c0          	pxor   xmm0,xmm0
      e970a6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e970ab:	48 8d 05 16 3d 97 00 	lea    rax,[rip+0x973d16]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      e970b2:	49 89 06             	mov    QWORD PTR [r14],rax
      e970b5:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
      e970ba:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e970bf:	48 8d 05 1a 78 97 00 	lea    rax,[rip+0x97781a]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e970c6:	48 89 84 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rax
      e970cd:	00 
      e970ce:	48 8d 05 a9 cb 5e 00 	lea    rax,[rip+0x5ecba9]        # 1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
      e970d5:	48 89 84 24 58 10 00 	mov    QWORD PTR [rsp+0x1058],rax
      e970dc:	00 
      e970dd:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
### 0xe970ec: mov    QWORD PTR [r14+0x20],rax
      e9708f:	00 
      e97090:	e8 e9 29 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e97095:	bf e0 00 00 00       	mov    edi,0xe0
      e9709a:	e8 61 6e 95 00       	call   17edf00 <_Znwm@plt>
      e9709f:	49 89 c6             	mov    r14,rax
      e970a2:	66 0f ef c0          	pxor   xmm0,xmm0
      e970a6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e970ab:	48 8d 05 16 3d 97 00 	lea    rax,[rip+0x973d16]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      e970b2:	49 89 06             	mov    QWORD PTR [r14],rax
      e970b5:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
      e970ba:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e970bf:	48 8d 05 1a 78 97 00 	lea    rax,[rip+0x97781a]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e970c6:	48 89 84 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rax
      e970cd:	00 
      e970ce:	48 8d 05 a9 cb 5e 00 	lea    rax,[rip+0x5ecba9]        # 1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
      e970d5:	48 89 84 24 58 10 00 	mov    QWORD PTR [rsp+0x1058],rax
      e970dc:	00 
      e970dd:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e970e4:	00 
      e970e5:	48 8d 05 84 ad 99 00 	lea    rax,[rip+0x99ad84]        # 1831e70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3e08>
      e970ec:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      e970f0:	49 89 6e 28          	mov    QWORD PTR [r14+0x28],rbp
      e970f4:	49 89 4e 30          	mov    QWORD PTR [r14+0x30],rcx
      e970f8:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e970fd:	48 8b 84 24 38 03 00 	mov    rax,QWORD PTR [rsp+0x338]
      e97104:	00 
      e97105:	0f 28 84 24 30 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x330]
      e9710c:	00 
      e9710d:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
      e97112:	48 85 c0             	test   rax,rax
      e97115:	74 05                	je     e9711c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e532>
      e97117:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9711c:	48 8b 84 24 48 03 00 	mov    rax,QWORD PTR [rsp+0x348]
      e97123:	00 
      e97124:	0f 28 84 24 40 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x340]
      e9712b:	00 
      e9712c:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
      e97131:	48 85 c0             	test   rax,rax
      e97134:	74 05                	je     e9713b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e551>
      e97136:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9713b:	48 8b 84 24 58 03 00 	mov    rax,QWORD PTR [rsp+0x358]
      e97142:	00 
      e97143:	0f 28 84 24 50 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x350]
      e9714a:	00 
      e9714b:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      e97150:	48 85 c0             	test   rax,rax
      e97153:	74 05                	je     e9715a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e570>
      e97155:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9715a:	48 8b 84 24 68 03 00 	mov    rax,QWORD PTR [rsp+0x368]
### 0xe975b7: mov    r12,QWORD PTR [r14+0x20]
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
      e975d1:	01 
      e975d2:	e8 19 6b 95 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
      e975d7:	48 8d 05 ea bf 99 00 	lea    rax,[rip+0x99bfea]        # 18335c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5560>
      e975de:	48 89 84 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rax
      e975e5:	00 
      e975e6:	48 89 ac 24 58 10 00 	mov    QWORD PTR [rsp+0x1058],rbp
      e975ed:	00 
      e975ee:	48 89 9c 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],rbx
      e975f5:	00 
      e975f6:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      e975fa:	48 8d bc 24 00 0a 00 	lea    rdi,[rsp+0xa00]
      e97601:	00 
      e97602:	4c 89 e6             	mov    rsi,r12
      e97605:	48 89 da             	mov    rdx,rbx
      e97608:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      e9760e:	48 8d 9c 24 50 10 00 	lea    rbx,[rsp+0x1050]
      e97615:	00 
      e97616:	48 89 df             	mov    rdi,rbx
      e97619:	e8 4c 29 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9761e:	4c 89 f7             	mov    rdi,r14
      e97621:	48 81 c7 b0 00 00 00 	add    rdi,0xb0
      e97628:	48 8b 84 24 08 0a 00 	mov    rax,QWORD PTR [rsp+0xa08]
      e9762f:	00 
      e97630:	66 0f 6f 84 24 00 0a 	movdqa xmm0,XMMWORD PTR [rsp+0xa00]
### 0xe97796: movdqu XMMWORD PTR [rbx+0x20],xmm1
      e9773f:	e8 42 6d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97744:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e9774b:	00 
      e9774c:	e8 97 30 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e97751:	48 8b bc 24 18 10 00 	mov    rdi,QWORD PTR [rsp+0x1018]
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
      e977cc:	48 8d 0d a5 c5 02 00 	lea    rcx,[rip+0x2c5a5]        # ec3d78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b18e>
      e977d3:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e977da:	00 
      e977db:	6a 08                	push   0x8
      e977dd:	41 59                	pop    r9
      e977df:	4c 89 e7             	mov    rdi,r12
      e977e2:	31 d2                	xor    edx,edx
      e977e4:	e8 ab 2f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e977e9:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e977ec:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e977f3:	00 
      e977f4:	4c 89 fe             	mov    rsi,r15
      e977f7:	4c 89 e2             	mov    rdx,r12
      e977fa:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      e97800:	4c 8d 7b 50          	lea    r15,[rbx+0x50]
      e97804:	4c 8d a4 24 10 10 00 	lea    r12,[rsp+0x1010]
### 0xe97846: mov    QWORD PTR [r14+0x20],r13
      e977f4:	4c 89 fe             	mov    rsi,r15
      e977f7:	4c 89 e2             	mov    rdx,r12
      e977fa:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      e97800:	4c 8d 7b 50          	lea    r15,[rbx+0x50]
      e97804:	4c 8d a4 24 10 10 00 	lea    r12,[rsp+0x1010]
      e9780b:	00 
      e9780c:	4c 89 ff             	mov    rdi,r15
      e9780f:	4c 89 e6             	mov    rsi,r12
      e97812:	e8 27 22 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e97817:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e9781c:	e8 65 6c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97821:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e97828:	00 
      e97829:	e8 ba 2f 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9782e:	48 89 df             	mov    rdi,rbx
      e97831:	48 83 c7 60          	add    rdi,0x60
      e97835:	e8 f0 de cc ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
      e9783a:	31 ff                	xor    edi,edi
      e9783c:	e8 db 6b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e97841:	4c 8b 74 24 68       	mov    r14,QWORD PTR [rsp+0x68]
      e97846:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
      e9784a:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      e9784e:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e97852:	e8 2f 6c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97857:	48 8b 84 24 e8 01 00 	mov    rax,QWORD PTR [rsp+0x1e8]
      e9785e:	00 
      e9785f:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e97863:	49 8b be b8 00 00 00 	mov    rdi,QWORD PTR [r14+0xb8]
      e9786a:	0f 28 84 24 50 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x250]
      e97871:	00 
      e97872:	41 0f 11 86 b0 00 00 	movups XMMWORD PTR [r14+0xb0],xmm0
      e97879:	00 
      e9787a:	e8 07 6c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9787f:	48 8b 9c 24 80 03 00 	mov    rbx,QWORD PTR [rsp+0x380]
      e97886:	00 
      e97887:	48 85 db             	test   rbx,rbx
      e9788a:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
      e9788f:	0f 84 97 00 00 00    	je     e9792c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ed42>
      e97895:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9789a:	48 8b 80 70 05 00 00 	mov    rax,QWORD PTR [rax+0x570]
      e978a1:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e978a5:	0f 85 81 00 00 00    	jne    e9792c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ed42>
      e978ab:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      e978b0:	4c 8d b4 24 10 10 00 	lea    r14,[rsp+0x1010]
      e978b7:	00 
      e978b8:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      e978bd:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      e978c1:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e978c6:	48 8d 35 03 63 cf ff 	lea    rsi,[rip+0xffffffffffcf6303]        # b8dbd0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab70>
### 0xe978b8: movaps xmm0,XMMWORD PTR [rsp+0x20]
      e9785e:	00 
      e9785f:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e97863:	49 8b be b8 00 00 00 	mov    rdi,QWORD PTR [r14+0xb8]
      e9786a:	0f 28 84 24 50 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x250]
      e97871:	00 
      e97872:	41 0f 11 86 b0 00 00 	movups XMMWORD PTR [r14+0xb0],xmm0
      e97879:	00 
      e9787a:	e8 07 6c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9787f:	48 8b 9c 24 80 03 00 	mov    rbx,QWORD PTR [rsp+0x380]
      e97886:	00 
      e97887:	48 85 db             	test   rbx,rbx
      e9788a:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
      e9788f:	0f 84 97 00 00 00    	je     e9792c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ed42>
      e97895:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9789a:	48 8b 80 70 05 00 00 	mov    rax,QWORD PTR [rax+0x570]
      e978a1:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e978a5:	0f 85 81 00 00 00    	jne    e9792c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ed42>
      e978ab:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      e978b0:	4c 8d b4 24 10 10 00 	lea    r14,[rsp+0x1010]
      e978b7:	00 
      e978b8:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      e978bd:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      e978c1:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e978c6:	48 8d 35 03 63 cf ff 	lea    rsi,[rip+0xffffffffffcf6303]        # b8dbd0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab70>
      e978cd:	48 8d 15 15 63 cf ff 	lea    rdx,[rip+0xffffffffffcf6315]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
      e978d4:	48 8d 0d 07 84 16 00 	lea    rcx,[rip+0x168407]        # fffce2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c70f8>
      e978db:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e978e2:	00 
      e978e3:	6a 10                	push   0x10
      e978e5:	41 59                	pop    r9
      e978e7:	4c 89 ff             	mov    rdi,r15
      e978ea:	4d 89 f0             	mov    r8,r14
      e978ed:	e8 a2 2e 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e978f2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e978f5:	4c 8d a4 24 60 02 00 	lea    r12,[rsp+0x260]
      e978fc:	00 
      e978fd:	4c 89 e7             	mov    rdi,r12
      e97900:	48 89 de             	mov    rsi,rbx
      e97903:	4c 89 fa             	mov    rdx,r15
      e97906:	ff 50 38             	call   QWORD PTR [rax+0x38]
      e97909:	4c 89 ff             	mov    rdi,r15
      e9790c:	e8 d7 2e 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e97911:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      e97915:	e8 98 6b c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e9791a:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e9791f:	e8 62 6b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97924:	4c 89 ef             	mov    rdi,r13
      e97927:	e8 5a 6b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9792c:	48 8b bc 24 28 06 00 	mov    rdi,QWORD PTR [rsp+0x628]
### 0xe98964: movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e98908:	00 
      e98909:	e8 5c 16 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9890e:	e9 e6 fc ff ff       	jmp    e985f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fa0f>
      e98913:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98918:	e9 eb fc ff ff       	jmp    e98608 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fa1e>
      e9891d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98922:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e98929:	00 
      e9892a:	e8 b9 1e 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9892f:	e9 0b fd ff ff       	jmp    e9863f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fa55>
      e98934:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98939:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e98940:	00 
      e98941:	e8 a2 1e 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98946:	e9 01 fd ff ff       	jmp    e9864c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fa62>
      e9894b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98950:	e9 04 fd ff ff       	jmp    e98659 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fa6f>
      e98955:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9895a:	e9 14 fd ff ff       	jmp    e98673 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fa89>
      e9895f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98964:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e9896a:	66 48 0f 3a 16 84 24 	pextrq QWORD PTR [rsp+0xb8],xmm0,0x1
      e98971:	b8 00 00 00 01 
      e98976:	66 0f 6f 84 24 a0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1a0]
      e9897d:	00 00 
      e9897f:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e98986:	e9 59 fd ff ff       	jmp    e986e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fafa>
      e9898b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98990:	4c 89 ff             	mov    rdi,r15
      e98993:	e8 d2 15 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98998:	eb 05                	jmp    e9899f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fdb5>
      e9899a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9899f:	48 8b bb c8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc8]
      e989a6:	e8 db 5a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e989ab:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
      e989b2:	e8 cf 5a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e989b7:	4c 89 f7             	mov    rdi,r14
      e989ba:	e8 af f8 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e989bf:	eb 05                	jmp    e989c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fddc>
      e989c1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e989c6:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e989cd:	00 
      e989ce:	e8 f7 18 be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e989d3:	e9 48 fd ff ff       	jmp    e98720 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb36>
      e989d8:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e989dd:	e9 3e fd ff ff       	jmp    e98720 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb36>
      e989e2:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e989e7:	e9 41 fd ff ff       	jmp    e9872d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb43>
      e989ec:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
### 0xe98c45: mov    rdi,QWORD PTR [rsp+0x20]
      e98bf5:	e8 8c 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bfa:	4c 89 ff             	mov    rdi,r15
      e98bfd:	e8 0e 54 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98c02:	4c 89 ff             	mov    rdi,r15
      e98c05:	e8 12 58 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98c0a:	45 31 e4             	xor    r12d,r12d
      e98c0d:	eb 05                	jmp    e98c14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6002a>
      e98c0f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c14:	4c 89 e7             	mov    rdi,r12
      e98c17:	e8 6a 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c1c:	eb 77                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c1e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c23:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98c2a:	00 
      e98c2b:	e8 b8 1b 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98c30:	4c 89 f7             	mov    rdi,r14
      e98c33:	e8 be a2 02 00       	call   ec2ef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a30c>
      e98c38:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e98c3f:	00 
      e98c40:	e8 21 12 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e98c45:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e98c4a:	e8 85 0f 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98c4f:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e98c56:	00 
      e98c57:	e8 e4 a2 02 00       	call   ec2f40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a356>
      e98c5c:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e98c61:	e8 e0 8a 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      e98c66:	eb 05                	jmp    e98c6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60083>
      e98c68:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c6d:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      e98c72:	e8 0f 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c77:	31 ff                	xor    edi,edi
      e98c79:	e8 08 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c7e:	4c 89 e7             	mov    rdi,r12
      e98c81:	e8 8a 53 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98c86:	4c 89 e7             	mov    rdi,r12
      e98c89:	e8 8e 57 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98c8e:	eb 05                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c90:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c95:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e98c9c:	00 
      e98c9d:	e8 e4 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ca2:	e9 f8 fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98ca7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cac:	e9 ee fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98cb1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cb6:	6a 20                	push   0x20
      e98cb8:	5b                   	pop    rbx
      e98cb9:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
### 0xe98ec4: mov    rdi,QWORD PTR [rsp+0x20]
      e98e61:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e66:	e9 01 fa ff ff       	jmp    e9886c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc82>
      e98e6b:	eb 00                	jmp    e98e6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60283>
      e98e6d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e72:	e9 27 fa ff ff       	jmp    e9889e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fcb4>
      e98e77:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e7c:	4c 8b b4 24 90 00 00 	mov    r14,QWORD PTR [rsp+0x90]
      e98e83:	00 
      e98e84:	4c 89 f3             	mov    rbx,r14
      e98e87:	48 81 c3 e8 00 00 00 	add    rbx,0xe8
      e98e8e:	49 8b be 40 01 00 00 	mov    rdi,QWORD PTR [r14+0x140]
      e98e95:	e8 ec 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98e9a:	49 8b be 30 01 00 00 	mov    rdi,QWORD PTR [r14+0x130]
      e98ea1:	e8 e0 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ea6:	49 8b be 20 01 00 00 	mov    rdi,QWORD PTR [r14+0x120]
      e98ead:	e8 d4 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98eb2:	48 89 df             	mov    rdi,rbx
      e98eb5:	e8 2e 27 be ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
      e98eba:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e98ebf:	e8 a6 10 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98ec4:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e98ec9:	e8 06 0d 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98ece:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
      e98ed5:	00 
      e98ed6:	e8 f9 0c 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98edb:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e98ee0:	e8 ef 0c 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98ee5:	4c 89 ff             	mov    rdi,r15
      e98ee8:	e8 e7 0c 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98eed:	31 ff                	xor    edi,edi
      e98eef:	e8 92 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ef4:	31 ff                	xor    edi,edi
      e98ef6:	e8 8b 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98efb:	31 ff                	xor    edi,edi
      e98efd:	e8 84 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98f02:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e98f09:	00 
      e98f0a:	e8 5b 10 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98f0f:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      e98f16:	00 
      e98f17:	e8 6a 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98f1c:	4c 89 f7             	mov    rdi,r14
      e98f1f:	e8 ec 50 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98f24:	4c 89 f7             	mov    rdi,r14
      e98f27:	e8 f0 54 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98f2c:	e9 14 f9 ff ff       	jmp    e98845 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc5b>
      e98f31:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98f36:	e9 fd f8 ff ff       	jmp    e98838 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc4e>

## Hits containing +0x28]
### 0xe94929: mov    QWORD PTR [r14+0x28],rbx
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
### 0xe949d9: mov    rax,QWORD PTR [r13+0x28]
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
### 0xe94a86: mov    rax,QWORD PTR [r13+0x28]
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
      e94a8d:	e8 6e 51 00 00       	call   e99c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61016>
      e94a92:	84 c0                	test   al,al
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
### 0xe94afb: mov    rax,QWORD PTR [r13+0x28]
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
      e94b02:	48 8d 35 b6 f5 53 ff 	lea    rsi,[rip+0xffffffffff53f5b6]        # 3d40bf <_ZTSN5boost17bad_function_callE@@Base+0x1405>
      e94b09:	48 8d 0d c0 f5 53 ff 	lea    rcx,[rip+0xffffffffff53f5c0]        # 3d40d0 <_ZTSN5boost17bad_function_callE@@Base+0x1416>
      e94b10:	6a 0b                	push   0xb
      e94b12:	5a                   	pop    rdx
      e94b13:	6a 21                	push   0x21
      e94b15:	41 58                	pop    r8
      e94b17:	45 31 c9             	xor    r9d,r9d
      e94b1a:	e8 6b 28 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e94b1f:	84 c0                	test   al,al
      e94b21:	74 75                	je     e94b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bfae>
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
### 0xe94b5f: mov    QWORD PTR [rax+0x28],r14
      e94b13:	6a 21                	push   0x21
      e94b15:	41 58                	pop    r8
      e94b17:	45 31 c9             	xor    r9d,r9d
      e94b1a:	e8 6b 28 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e94b1f:	84 c0                	test   al,al
      e94b21:	74 75                	je     e94b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5bfae>
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
### 0xe94c1b: mov    QWORD PTR [rax+0x28],r14
      e94bc6:	4c 39 f3             	cmp    rbx,r14
      e94bc9:	0f 84 ae 05 00 00    	je     e9517d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c593>
      e94bcf:	40 88 ac 24 88 00 00 	mov    BYTE PTR [rsp+0x88],bpl
      e94bd6:	00 
      e94bd7:	6a 38                	push   0x38
      e94bd9:	5f                   	pop    rdi
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
      e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      e94c5d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e94c72:	bf 90 00 00 00       	mov    edi,0x90
      e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
      e94c7e:	00 
      e94c7f:	e8 7c 92 95 00       	call   17edf00 <_Znwm@plt>
      e94c84:	48 89 c3             	mov    rbx,rax
      e94c87:	4d 8d 7c 24 08       	lea    r15,[r12+0x8]
      e94c8c:	48 89 ac 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rbp
      e94c93:	00 
      e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
      e94c9b:	00 
### 0xe94d20: movdqu XMMWORD PTR [r15+0x28],xmm0
      e94ccb:	48 89 df             	mov    rdi,rbx
      e94cce:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      e94cd2:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
      e94cd7:	e8 e6 c9 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e94cdc:	48 89 9c 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rbx
      e94ce3:	00 
      e94ce4:	4c 89 f7             	mov    rdi,r14
      e94ce7:	e8 7e 52 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94cec:	f0 49 ff 07          	lock inc QWORD PTR [r15]
      e94cf0:	bf 00 01 00 00       	mov    edi,0x100
      e94cf5:	e8 06 92 95 00       	call   17edf00 <_Znwm@plt>
      e94cfa:	49 89 c7             	mov    r15,rax
      e94cfd:	4c 89 e0             	mov    rax,r12
      e94d00:	48 83 c0 18          	add    rax,0x18
      e94d04:	48 8d 0d 8d fa 9a 00 	lea    rcx,[rip+0x9afa8d]        # 1844798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe80>
      e94d0b:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e94d0e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e94d12:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
      e94d16:	66 0f ef c0          	pxor   xmm0,xmm0
      e94d1a:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      e94d20:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
      e94d26:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
      e94d2b:	4c 89 f8             	mov    rax,r15
      e94d2e:	48 83 c0 40          	add    rax,0x40
      e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
      e94d36:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
      e94d3a:	66 41 0f 7f 47 50    	movdqa XMMWORD PTR [r15+0x50],xmm0
      e94d40:	66 41 0f 7f 47 60    	movdqa XMMWORD PTR [r15+0x60],xmm0
      e94d46:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      e94d4b:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e94d50:	41 89 47 78          	mov    DWORD PTR [r15+0x78],eax
      e94d54:	6a 64                	push   0x64
      e94d56:	59                   	pop    rcx
      e94d57:	49 89 8f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rcx
      e94d5e:	49 89 8f 88 00 00 00 	mov    QWORD PTR [r15+0x88],rcx
      e94d65:	49 83 a7 90 00 00 00 	and    QWORD PTR [r15+0x90],0x0
      e94d6c:	00 
      e94d6d:	49 83 a7 c0 00 00 00 	and    QWORD PTR [r15+0xc0],0x0
      e94d74:	00 
      e94d75:	66 41 0f 7f 87 d0 00 	movdqa XMMWORD PTR [r15+0xd0],xmm0
      e94d7c:	00 00 
      e94d7e:	66 41 0f 7f 87 e0 00 	movdqa XMMWORD PTR [r15+0xe0],xmm0
      e94d85:	00 00 
      e94d87:	41 89 87 f0 00 00 00 	mov    DWORD PTR [r15+0xf0],eax
      e94d8e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e94d93:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e94d97:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94d9c:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
      e94da0:	48 8b 30             	mov    rsi,QWORD PTR [rax]
### 0xe94d9c: mov    rax,QWORD PTR [rax+0x28]
      e94d40:	66 41 0f 7f 47 60    	movdqa XMMWORD PTR [r15+0x60],xmm0
      e94d46:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      e94d4b:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e94d50:	41 89 47 78          	mov    DWORD PTR [r15+0x78],eax
      e94d54:	6a 64                	push   0x64
      e94d56:	59                   	pop    rcx
      e94d57:	49 89 8f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rcx
      e94d5e:	49 89 8f 88 00 00 00 	mov    QWORD PTR [r15+0x88],rcx
      e94d65:	49 83 a7 90 00 00 00 	and    QWORD PTR [r15+0x90],0x0
      e94d6c:	00 
      e94d6d:	49 83 a7 c0 00 00 00 	and    QWORD PTR [r15+0xc0],0x0
      e94d74:	00 
      e94d75:	66 41 0f 7f 87 d0 00 	movdqa XMMWORD PTR [r15+0xd0],xmm0
      e94d7c:	00 00 
      e94d7e:	66 41 0f 7f 87 e0 00 	movdqa XMMWORD PTR [r15+0xe0],xmm0
      e94d85:	00 00 
      e94d87:	41 89 87 f0 00 00 00 	mov    DWORD PTR [r15+0xf0],eax
      e94d8e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e94d93:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e94d97:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94d9c:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
      e94da0:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      e94da3:	48 8d 15 48 f3 53 ff 	lea    rdx,[rip+0xffffffffff53f348]        # 3d40f2 <_ZTSN5boost17bad_function_callE@@Base+0x1438>
      e94daa:	4c 8d 05 4f f3 53 ff 	lea    r8,[rip+0xffffffffff53f34f]        # 3d4100 <_ZTSN5boost17bad_function_callE@@Base+0x1446>
      e94db1:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94db8:	00 
      e94db9:	6a 0b                	push   0xb
      e94dbb:	59                   	pop    rcx
      e94dbc:	6a 25                	push   0x25
      e94dbe:	41 59                	pop    r9
      e94dc0:	4c 89 f7             	mov    rdi,r14
      e94dc3:	e8 00 27 75 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
      e94dc8:	45 31 e4             	xor    r12d,r12d
      e94dcb:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
      e94dd0:	74 4e                	je     e94e20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c236>
      e94dd2:	48 8d 35 f7 3d 54 ff 	lea    rsi,[rip+0xffffffffff543df7]        # 3d8bd0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37b5>
      e94dd9:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e94de0:	00 
      e94de1:	e8 69 6a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e94de6:	84 c0                	test   al,al
      e94de8:	74 06                	je     e94df0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c206>
      e94dea:	6a 02                	push   0x2
      e94dec:	41 5c                	pop    r12
      e94dee:	eb 30                	jmp    e94e20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c236>
      e94df0:	48 8d 35 2f f3 53 ff 	lea    rsi,[rip+0xffffffffff53f32f]        # 3d4126 <_ZTSN5boost17bad_function_callE@@Base+0x146c>
      e94df7:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e94dfe:	00 
      e94dff:	e8 4b 6a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e94e04:	84 c0                	test   al,al
### 0xe94e91: mov    QWORD PTR [r12+0x28],rax
      e94e36:	40 0f 94 c5          	sete   bpl
      e94e3a:	41 83 fc 02          	cmp    r12d,0x2
      e94e3e:	41 0f 44 ec          	cmove  ebp,r12d
      e94e42:	bf 50 01 00 00       	mov    edi,0x150
      e94e47:	e8 b4 90 95 00       	call   17edf00 <_Znwm@plt>
      e94e4c:	49 89 c4             	mov    r12,rax
      e94e4f:	66 0f ef c0          	pxor   xmm0,xmm0
      e94e53:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94e58:	48 8d 05 b9 f9 9a 00 	lea    rax,[rip+0x9af9b9]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
      e94e5f:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e94e63:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
      e94e6a:	00 
      e94e6b:	48 8d b4 24 90 0e 00 	lea    rsi,[rsp+0xe90]
      e94e72:	00 
      e94e73:	4c 89 ef             	mov    rdi,r13
      e94e76:	e8 75 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94e7b:	48 8d 05 ce f9 9a 00 	lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
      e94e82:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      e94e87:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94e8e:	00 f0 3f 
      e94e91:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      e94e96:	31 c0                	xor    eax,eax
      e94e98:	41 88 44 24 30       	mov    BYTE PTR [r12+0x30],al
      e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al
      e94ea2:	49 83 64 24 58 00    	and    QWORD PTR [r12+0x58],0x0
      e94ea8:	66 0f ef c0          	pxor   xmm0,xmm0
      e94eac:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e94eb3:	41 88 44 24 70       	mov    BYTE PTR [r12+0x70],al
      e94eb8:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e94ebf:	00 
      e94ec0:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      e94ec5:	4c 89 ee             	mov    rsi,r13
      e94ec8:	e8 23 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ecd:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e94ed4:	00 00 
      e94ed6:	49 89 9c 24 b0 00 00 	mov    QWORD PTR [r12+0xb0],rbx
      e94edd:	00 
      e94ede:	4d 89 bc 24 b8 00 00 	mov    QWORD PTR [r12+0xb8],r15
      e94ee5:	00 
      e94ee6:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
      e94eed:	00 
      e94eee:	48 89 df             	mov    rdi,rbx
      e94ef1:	e8 0c 4f 94 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]
      e94efb:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e94f00:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e94f07:	00 
      e94f08:	49 8d 84 24 b0 00 00 	lea    rax,[r12+0xb0]
      e94f0f:	00 
### 0xe95246: movups XMMWORD PTR [rbx+0x28],xmm0
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
      e95272:	66 49 0f 7e c4       	movq   r12,xmm0
      e95277:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      e9527b:	4c 89 e7             	mov    rdi,r12
      e9527e:	48 89 5c 24 70       	mov    QWORD PTR [rsp+0x70],rbx
      e95283:	ff 10                	call   QWORD PTR [rax]
      e95285:	49 89 c5             	mov    r13,rax
      e95288:	4c 8d 7b 48          	lea    r15,[rbx+0x48]
      e9528c:	66 0f ef c0          	pxor   xmm0,xmm0
      e95290:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
      e95296:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
      e9529c:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      e952a1:	48 89 c7             	mov    rdi,rax
      e952a4:	e8 51 47 ff ff       	call   e899fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e10>
      e952a9:	48 89 c5             	mov    rbp,rax
      e952ac:	49 89 d6             	mov    r14,rdx
      e952af:	4c 89 ef             	mov    rdi,r13
      e952b2:	e8 6b 47 ff ff       	call   e89a22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e38>
      e952b7:	49 89 d0             	mov    r8,rdx
### 0xe953fc: call   QWORD PTR [rax+0x28]
      e953b0:	e8 89 46 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e953b5:	eb 48                	jmp    e953ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c815>
      e953b7:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
      e953be:	00 
      e953bf:	4d 89 28             	mov    QWORD PTR [r8],r13
      e953c2:	48 8d 35 c8 7c c0 ff 	lea    rsi,[rip+0xffffffffffc07cc8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e953c9:	48 8d 0d e0 0f 03 00 	lea    rcx,[rip+0x30fe0]        # ec63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d7c6>
      e953d0:	48 8d 9c 24 90 0f 00 	lea    rbx,[rsp+0xf90]
      e953d7:	00 
      e953d8:	6a 08                	push   0x8
      e953da:	41 59                	pop    r9
      e953dc:	48 89 df             	mov    rdi,rbx
      e953df:	31 d2                	xor    edx,edx
      e953e1:	e8 ae 53 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e953e6:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
      e953ed:	00 
      e953ee:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e953f1:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e953f8:	00 
      e953f9:	48 89 da             	mov    rdx,rbx
      e953fc:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e953ff:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95404:	48 8d b8 88 00 00 00 	lea    rdi,[rax+0x88]
      e9540b:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e95412:	00 
      e95413:	48 89 de             	mov    rsi,rbx
      e95416:	e8 23 46 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e9541b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e9541f:	e8 62 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95424:	40 84 ed             	test   bpl,bpl
      e95427:	74 0f                	je     e95438 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c84e>
      e95429:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e95430:	00 
      e95431:	e8 9e 47 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e95436:	eb 0d                	jmp    e95445 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c85b>
      e95438:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e9543f:	00 
      e95440:	e8 a3 53 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e95445:	4c 8b 7c 24 68       	mov    r15,QWORD PTR [rsp+0x68]
      e9544a:	4c 8b b4 24 c0 00 00 	mov    r14,QWORD PTR [rsp+0xc0]
      e95451:	00 
      e95452:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95457:	48 8d b8 98 00 00 00 	lea    rdi,[rax+0x98]
      e9545e:	e8 2b 2e c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95463:	48 8b 9c 24 d0 00 00 	mov    rbx,QWORD PTR [rsp+0xd0]
      e9546a:	00 
      e9546b:	48 89 df             	mov    rdi,rbx
      e9546e:	e8 13 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95473:	31 ff                	xor    edi,edi
### 0xe95842: mov    QWORD PTR [r15+0x28],r12
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
      e95881:	74 05                	je     e95888 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cc9e>
      e95883:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95888:	4c 89 e7             	mov    rdi,r12
      e9588b:	e8 f6 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95890:	31 ff                	xor    edi,edi
      e95892:	e8 85 8b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e95897:	31 ff                	xor    edi,edi
      e95899:	e8 e8 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9589e:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e958a5:	00 
      e958a6:	e8 db 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e958ab:	48 8d b3 30 02 00 00 	lea    rsi,[rbx+0x230]
      e958b2:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      e958b9:	00 
      e958ba:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
### 0xe9593c: mov    rcx,QWORD PTR [rbx+0x28]
      e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f0:	4c 89 f8             	mov    rax,r15
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
      e9590d:	00 
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
      e95919:	00 
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
      e95928:	00 
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
      e95937:	00 
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
      e95947:	00 
      e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      e9594c:	48 89 8c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rcx
      e95953:	00 
      e95954:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e9595b:	00 
      e9595c:	4c 89 bc 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r15
      e95963:	00 
      e95964:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95969:	66 0f 6f 84 24 d0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xd0]
      e95970:	00 00 
      e95972:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
      e95979:	00 00 
      e9597b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e95980:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e95984:	48 8b 83 78 05 00 00 	mov    rax,QWORD PTR [rbx+0x578]
      e9598b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e95990:	48 8d 05 49 8f 97 00 	lea    rax,[rip+0x978f49]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e95997:	48 89 84 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rax
      e9599e:	00 
      e9599f:	4c 89 b4 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r14
      e959a6:	00 
      e959a7:	4c 89 ac 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r13
      e959ae:	00 
      e959af:	4c 8b b3 98 03 00 00 	mov    r14,QWORD PTR [rbx+0x398]
      e959b6:	4c 8b ab a0 03 00 00 	mov    r13,QWORD PTR [rbx+0x3a0]
      e959bd:	48 8b 83 a8 03 00 00 	mov    rax,QWORD PTR [rbx+0x3a8]
### 0xe95dd3: mov    rax,QWORD PTR [r12+0x28]
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
      e95dd3:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e95dd8:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      e95ddb:	48 8d 15 8c d6 53 ff 	lea    rdx,[rip+0xffffffffff53d68c]        # 3d346e <_ZTSN5boost17bad_function_callE@@Base+0x7b4>
      e95de2:	4c 8d 05 97 d6 53 ff 	lea    r8,[rip+0xffffffffff53d697]        # 3d3480 <_ZTSN5boost17bad_function_callE@@Base+0x7c6>
      e95de9:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e95df0:	00 
      e95df1:	6a 0b                	push   0xb
      e95df3:	59                   	pop    rcx
      e95df4:	6a 1f                	push   0x1f
      e95df6:	41 59                	pop    r9
      e95df8:	48 89 df             	mov    rdi,rbx
      e95dfb:	e8 c8 16 75 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
      e95e00:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
      e95e04:	74 57                	je     e95e5d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d273>
      e95e06:	48 8d 35 37 eb 48 ff 	lea    rsi,[rip+0xffffffffff48eb37]        # 324944 <_ZTSSt12bad_any_cast@@Base-0x6b884>
      e95e0d:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95e14:	00 
      e95e15:	e8 35 5a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e95e1a:	84 c0                	test   al,al
      e95e1c:	74 23                	je     e95e41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d257>
      e95e1e:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95e25:	00 
      e95e26:	e8 05 0f c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e95e2b:	48 8d 35 16 14 5a ff 	lea    rsi,[rip+0xffffffffff5a1416]        # 437248 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cc97>
      e95e32:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
      e95e39:	00 
      e95e3a:	e8 01 81 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e95e3f:	eb 3d                	jmp    e95e7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d294>
      e95e41:	48 8d 35 58 d6 53 ff 	lea    rsi,[rip+0xffffffffff53d658]        # 3d34a0 <_ZTSN5boost17bad_function_callE@@Base+0x7e6>
### 0xe95e7e: mov    rax,QWORD PTR [r12+0x28]
      e95e25:	00 
      e95e26:	e8 05 0f c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e95e2b:	48 8d 35 16 14 5a ff 	lea    rsi,[rip+0xffffffffff5a1416]        # 437248 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5cc97>
      e95e32:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
      e95e39:	00 
      e95e3a:	e8 01 81 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e95e3f:	eb 3d                	jmp    e95e7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d294>
      e95e41:	48 8d 35 58 d6 53 ff 	lea    rsi,[rip+0xffffffffff53d658]        # 3d34a0 <_ZTSN5boost17bad_function_callE@@Base+0x7e6>
      e95e48:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95e4f:	00 
      e95e50:	e8 fa 59 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e95e55:	84 c0                	test   al,al
      e95e57:	0f 84 8d 1c 00 00    	je     e97aea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ef00>
      e95e5d:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95e64:	00 
      e95e65:	e8 c6 0e c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e95e6a:	48 8d 35 0b c1 5b ff 	lea    rsi,[rip+0xffffffffff5bc10b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e95e71:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
      e95e78:	00 
      e95e79:	e8 00 3c be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e95e7e:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e95e83:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e95e86:	e8 9d c0 00 00       	call   ea1f28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6933e>
      e95e8b:	89 c5                	mov    ebp,eax
      e95e8d:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e95e92:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e95e95:	e8 ac c0 00 00       	call   ea1f46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6935c>
      e95e9a:	41 89 c6             	mov    r14d,eax
      e95e9d:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e95ea2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e95ea5:	48 8d 35 6c e5 53 ff 	lea    rsi,[rip+0xffffffffff53e56c]        # 3d4418 <_ZTSN5boost17bad_function_callE@@Base+0x175e>
      e95eac:	48 8d 0d 7d e5 53 ff 	lea    rcx,[rip+0xffffffffff53e57d]        # 3d4430 <_ZTSN5boost17bad_function_callE@@Base+0x1776>
      e95eb3:	6a 0b                	push   0xb
      e95eb5:	5a                   	pop    rdx
      e95eb6:	6a 17                	push   0x17
      e95eb8:	41 58                	pop    r8
      e95eba:	45 31 c9             	xor    r9d,r9d
      e95ebd:	e8 c8 14 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e95ec2:	41 89 c7             	mov    r15d,eax
      e95ec5:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95ecc:	00 
      e95ecd:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]
      e95ed4:	00 
      e95ed5:	e8 3c 8a ff ff       	call   e8e916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d2c>
      e95eda:	40 88 ac 24 60 0c 00 	mov    BYTE PTR [rsp+0xc60],bpl
      e95ee1:	00 
      e95ee2:	44 89 b4 24 64 0c 00 	mov    DWORD PTR [rsp+0xc64],r14d
      e95ee9:	00 
      e95eea:	44 88 bc 24 68 0c 00 	mov    BYTE PTR [rsp+0xc68],r15b
### 0xe95e8d: mov    rax,QWORD PTR [r12+0x28]
      e95e39:	00 
      e95e3a:	e8 01 81 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e95e3f:	eb 3d                	jmp    e95e7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d294>
      e95e41:	48 8d 35 58 d6 53 ff 	lea    rsi,[rip+0xffffffffff53d658]        # 3d34a0 <_ZTSN5boost17bad_function_callE@@Base+0x7e6>
      e95e48:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95e4f:	00 
      e95e50:	e8 fa 59 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e95e55:	84 c0                	test   al,al
      e95e57:	0f 84 8d 1c 00 00    	je     e97aea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ef00>
      e95e5d:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95e64:	00 
      e95e65:	e8 c6 0e c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e95e6a:	48 8d 35 0b c1 5b ff 	lea    rsi,[rip+0xffffffffff5bc10b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e95e71:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
      e95e78:	00 
      e95e79:	e8 00 3c be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e95e7e:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e95e83:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e95e86:	e8 9d c0 00 00       	call   ea1f28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6933e>
      e95e8b:	89 c5                	mov    ebp,eax
      e95e8d:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e95e92:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e95e95:	e8 ac c0 00 00       	call   ea1f46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6935c>
      e95e9a:	41 89 c6             	mov    r14d,eax
      e95e9d:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e95ea2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e95ea5:	48 8d 35 6c e5 53 ff 	lea    rsi,[rip+0xffffffffff53e56c]        # 3d4418 <_ZTSN5boost17bad_function_callE@@Base+0x175e>
      e95eac:	48 8d 0d 7d e5 53 ff 	lea    rcx,[rip+0xffffffffff53e57d]        # 3d4430 <_ZTSN5boost17bad_function_callE@@Base+0x1776>
      e95eb3:	6a 0b                	push   0xb
      e95eb5:	5a                   	pop    rdx
      e95eb6:	6a 17                	push   0x17
      e95eb8:	41 58                	pop    r8
      e95eba:	45 31 c9             	xor    r9d,r9d
      e95ebd:	e8 c8 14 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e95ec2:	41 89 c7             	mov    r15d,eax
      e95ec5:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95ecc:	00 
      e95ecd:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]
      e95ed4:	00 
      e95ed5:	e8 3c 8a ff ff       	call   e8e916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d2c>
      e95eda:	40 88 ac 24 60 0c 00 	mov    BYTE PTR [rsp+0xc60],bpl
      e95ee1:	00 
      e95ee2:	44 89 b4 24 64 0c 00 	mov    DWORD PTR [rsp+0xc64],r14d
      e95ee9:	00 
      e95eea:	44 88 bc 24 68 0c 00 	mov    BYTE PTR [rsp+0xc68],r15b
      e95ef1:	00 
      e95ef2:	0f 28 84 24 d0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1d0]
      e95ef9:	00 
      e95efa:	0f 29 84 24 70 0c 00 	movaps XMMWORD PTR [rsp+0xc70],xmm0
### 0xe95e9d: mov    rax,QWORD PTR [r12+0x28]
      e95e48:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95e4f:	00 
      e95e50:	e8 fa 59 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e95e55:	84 c0                	test   al,al
      e95e57:	0f 84 8d 1c 00 00    	je     e97aea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ef00>
      e95e5d:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95e64:	00 
      e95e65:	e8 c6 0e c1 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e95e6a:	48 8d 35 0b c1 5b ff 	lea    rsi,[rip+0xffffffffff5bc10b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e95e71:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
      e95e78:	00 
      e95e79:	e8 00 3c be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e95e7e:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e95e83:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e95e86:	e8 9d c0 00 00       	call   ea1f28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6933e>
      e95e8b:	89 c5                	mov    ebp,eax
      e95e8d:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e95e92:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e95e95:	e8 ac c0 00 00       	call   ea1f46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6935c>
      e95e9a:	41 89 c6             	mov    r14d,eax
      e95e9d:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      e95ea2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      e95ea5:	48 8d 35 6c e5 53 ff 	lea    rsi,[rip+0xffffffffff53e56c]        # 3d4418 <_ZTSN5boost17bad_function_callE@@Base+0x175e>
      e95eac:	48 8d 0d 7d e5 53 ff 	lea    rcx,[rip+0xffffffffff53e57d]        # 3d4430 <_ZTSN5boost17bad_function_callE@@Base+0x1776>
      e95eb3:	6a 0b                	push   0xb
      e95eb5:	5a                   	pop    rdx
      e95eb6:	6a 17                	push   0x17
      e95eb8:	41 58                	pop    r8
      e95eba:	45 31 c9             	xor    r9d,r9d
      e95ebd:	e8 c8 14 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      e95ec2:	41 89 c7             	mov    r15d,eax
      e95ec5:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e95ecc:	00 
      e95ecd:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]
      e95ed4:	00 
      e95ed5:	e8 3c 8a ff ff       	call   e8e916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d2c>
      e95eda:	40 88 ac 24 60 0c 00 	mov    BYTE PTR [rsp+0xc60],bpl
      e95ee1:	00 
      e95ee2:	44 89 b4 24 64 0c 00 	mov    DWORD PTR [rsp+0xc64],r14d
      e95ee9:	00 
      e95eea:	44 88 bc 24 68 0c 00 	mov    BYTE PTR [rsp+0xc68],r15b
      e95ef1:	00 
      e95ef2:	0f 28 84 24 d0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1d0]
      e95ef9:	00 
      e95efa:	0f 29 84 24 70 0c 00 	movaps XMMWORD PTR [rsp+0xc70],xmm0
      e95f01:	00 
      e95f02:	48 8b 84 24 f0 00 00 	mov    rax,QWORD PTR [rsp+0xf0]
      e95f09:	00 
      e95f0a:	48 85 c0             	test   rax,rax
### 0xe9684c: movdqu XMMWORD PTR [rax+0x28],xmm0
      e967f5:	66 0f ef c0          	pxor   xmm0,xmm0
      e967f9:	f3 0f 7f 85 28 02 00 	movdqu XMMWORD PTR [rbp+0x228],xmm0
      e96800:	00 
      e96801:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
      e96808:	00 
      e96809:	48 89 85 20 02 00 00 	mov    QWORD PTR [rbp+0x220],rax
      e96810:	48 8d bd 38 02 00 00 	lea    rdi,[rbp+0x238]
      e96817:	48 89 bc 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rdi
      e9681e:	00 
      e9681f:	e8 d2 31 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e96824:	6a 48                	push   0x48
      e96826:	5f                   	pop    rdi
      e96827:	e8 d4 76 95 00       	call   17edf00 <_Znwm@plt>
      e9682c:	48 c7 00 64 00 00 00 	mov    QWORD PTR [rax],0x64
      e96833:	48 c7 40 08 3c 00 00 	mov    QWORD PTR [rax+0x8],0x3c
      e9683a:	00 
      e9683b:	48 c7 40 10 0a 00 00 	mov    QWORD PTR [rax+0x10],0xa
      e96842:	00 
      e96843:	66 0f ef c0          	pxor   xmm0,xmm0
      e96847:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
      e9684c:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
      e96851:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
      e96856:	48 89 85 48 02 00 00 	mov    QWORD PTR [rbp+0x248],rax
      e9685d:	48 8d 05 7c 80 97 00 	lea    rax,[rip+0x97807c]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e96864:	48 89 84 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rax
      e9686b:	00 
      e9686c:	48 8d 05 af 6f 91 00 	lea    rax,[rip+0x916faf]        # 17ad822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16198e>
      e96873:	48 89 84 24 58 10 00 	mov    QWORD PTR [rsp+0x1058],rax
      e9687a:	00 
      e9687b:	4c 89 b4 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r14
      e96882:	00 
      e96883:	8a 44 24 10          	mov    al,BYTE PTR [rsp+0x10]
      e96887:	88 84 24 10 10 00 00 	mov    BYTE PTR [rsp+0x1010],al
      e9688e:	8a 44 24 60          	mov    al,BYTE PTR [rsp+0x60]
      e96892:	88 84 24 11 10 00 00 	mov    BYTE PTR [rsp+0x1011],al
      e96899:	8a 44 24 50          	mov    al,BYTE PTR [rsp+0x50]
      e9689d:	88 84 24 12 10 00 00 	mov    BYTE PTR [rsp+0x1012],al
      e968a4:	8b 84 24 a8 00 00 00 	mov    eax,DWORD PTR [rsp+0xa8]
      e968ab:	89 84 24 14 10 00 00 	mov    DWORD PTR [rsp+0x1014],eax
      e968b2:	8a 84 24 c0 00 00 00 	mov    al,BYTE PTR [rsp+0xc0]
      e968b9:	88 84 24 18 10 00 00 	mov    BYTE PTR [rsp+0x1018],al
      e968c0:	0f b7 84 24 e2 03 00 	movzx  eax,WORD PTR [rsp+0x3e2]
      e968c7:	00 
      e968c8:	66 89 84 24 19 10 00 	mov    WORD PTR [rsp+0x1019],ax
      e968cf:	00 
      e968d0:	8a 84 24 e4 03 00 00 	mov    al,BYTE PTR [rsp+0x3e4]
      e968d7:	88 84 24 1b 10 00 00 	mov    BYTE PTR [rsp+0x101b],al
      e968de:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
      e968e5:	00 
### 0xe9706f: call   QWORD PTR [rax+0x28]
      e9701e:	e8 47 2f be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e97023:	31 ff                	xor    edi,edi
      e97025:	e8 88 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e9702a:	48 89 df             	mov    rdi,rbx
      e9702d:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e97032:	e8 7b 74 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e97037:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
      e9703e:	00 
      e9703f:	e8 42 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97044:	48 8b bc 24 20 03 00 	mov    rdi,QWORD PTR [rsp+0x320]
      e9704b:	00 
      e9704c:	48 85 ff             	test   rdi,rdi
      e9704f:	74 30                	je     e97081 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e497>
      e97051:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e97058:	00 
      e97059:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e9705f:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
      e97065:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e97069:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e9706c:	4c 89 e6             	mov    rsi,r12
      e9706f:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e97072:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e97077:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e9707c:	e8 05 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97081:	48 8d 35 60 fa 4a ff 	lea    rsi,[rip+0xffffffffff4afa60]        # 346ae8 <_ZTSSt12bad_any_cast@@Base-0x496e0>
      e97088:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e9708f:	00 
      e97090:	e8 e9 29 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e97095:	bf e0 00 00 00       	mov    edi,0xe0
      e9709a:	e8 61 6e 95 00       	call   17edf00 <_Znwm@plt>
      e9709f:	49 89 c6             	mov    r14,rax
      e970a2:	66 0f ef c0          	pxor   xmm0,xmm0
      e970a6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e970ab:	48 8d 05 16 3d 97 00 	lea    rax,[rip+0x973d16]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      e970b2:	49 89 06             	mov    QWORD PTR [r14],rax
      e970b5:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
      e970ba:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e970bf:	48 8d 05 1a 78 97 00 	lea    rax,[rip+0x97781a]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e970c6:	48 89 84 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rax
      e970cd:	00 
      e970ce:	48 8d 05 a9 cb 5e 00 	lea    rax,[rip+0x5ecba9]        # 1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
      e970d5:	48 89 84 24 58 10 00 	mov    QWORD PTR [rsp+0x1058],rax
      e970dc:	00 
      e970dd:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e970e4:	00 
      e970e5:	48 8d 05 84 ad 99 00 	lea    rax,[rip+0x99ad84]        # 1831e70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3e08>
      e970ec:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      e970f0:	49 89 6e 28          	mov    QWORD PTR [r14+0x28],rbp
      e970f4:	49 89 4e 30          	mov    QWORD PTR [r14+0x30],rcx
### 0xe970f0: mov    QWORD PTR [r14+0x28],rbp
      e97090:	e8 e9 29 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e97095:	bf e0 00 00 00       	mov    edi,0xe0
      e9709a:	e8 61 6e 95 00       	call   17edf00 <_Znwm@plt>
      e9709f:	49 89 c6             	mov    r14,rax
      e970a2:	66 0f ef c0          	pxor   xmm0,xmm0
      e970a6:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e970ab:	48 8d 05 16 3d 97 00 	lea    rax,[rip+0x973d16]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      e970b2:	49 89 06             	mov    QWORD PTR [r14],rax
      e970b5:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
      e970ba:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e970bf:	48 8d 05 1a 78 97 00 	lea    rax,[rip+0x97781a]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e970c6:	48 89 84 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rax
      e970cd:	00 
      e970ce:	48 8d 05 a9 cb 5e 00 	lea    rax,[rip+0x5ecba9]        # 1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
      e970d5:	48 89 84 24 58 10 00 	mov    QWORD PTR [rsp+0x1058],rax
      e970dc:	00 
      e970dd:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e970e4:	00 
      e970e5:	48 8d 05 84 ad 99 00 	lea    rax,[rip+0x99ad84]        # 1831e70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3e08>
      e970ec:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      e970f0:	49 89 6e 28          	mov    QWORD PTR [r14+0x28],rbp
      e970f4:	49 89 4e 30          	mov    QWORD PTR [r14+0x30],rcx
      e970f8:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e970fd:	48 8b 84 24 38 03 00 	mov    rax,QWORD PTR [rsp+0x338]
      e97104:	00 
      e97105:	0f 28 84 24 30 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x330]
      e9710c:	00 
      e9710d:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
      e97112:	48 85 c0             	test   rax,rax
      e97115:	74 05                	je     e9711c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e532>
      e97117:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9711c:	48 8b 84 24 48 03 00 	mov    rax,QWORD PTR [rsp+0x348]
      e97123:	00 
      e97124:	0f 28 84 24 40 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x340]
      e9712b:	00 
      e9712c:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
      e97131:	48 85 c0             	test   rax,rax
      e97134:	74 05                	je     e9713b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e551>
      e97136:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9713b:	48 8b 84 24 58 03 00 	mov    rax,QWORD PTR [rsp+0x358]
      e97142:	00 
      e97143:	0f 28 84 24 50 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x350]
      e9714a:	00 
      e9714b:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      e97150:	48 85 c0             	test   rax,rax
      e97153:	74 05                	je     e9715a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e570>
      e97155:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9715a:	48 8b 84 24 68 03 00 	mov    rax,QWORD PTR [rsp+0x368]
      e97161:	00 
### 0xe9784a: mov    rdi,QWORD PTR [r14+0x28]
      e977f7:	4c 89 e2             	mov    rdx,r12
      e977fa:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      e97800:	4c 8d 7b 50          	lea    r15,[rbx+0x50]
      e97804:	4c 8d a4 24 10 10 00 	lea    r12,[rsp+0x1010]
      e9780b:	00 
      e9780c:	4c 89 ff             	mov    rdi,r15
      e9780f:	4c 89 e6             	mov    rsi,r12
      e97812:	e8 27 22 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e97817:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e9781c:	e8 65 6c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97821:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e97828:	00 
      e97829:	e8 ba 2f 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9782e:	48 89 df             	mov    rdi,rbx
      e97831:	48 83 c7 60          	add    rdi,0x60
      e97835:	e8 f0 de cc ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
      e9783a:	31 ff                	xor    edi,edi
      e9783c:	e8 db 6b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e97841:	4c 8b 74 24 68       	mov    r14,QWORD PTR [rsp+0x68]
      e97846:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
      e9784a:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      e9784e:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e97852:	e8 2f 6c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97857:	48 8b 84 24 e8 01 00 	mov    rax,QWORD PTR [rsp+0x1e8]
      e9785e:	00 
      e9785f:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e97863:	49 8b be b8 00 00 00 	mov    rdi,QWORD PTR [r14+0xb8]
      e9786a:	0f 28 84 24 50 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x250]
      e97871:	00 
      e97872:	41 0f 11 86 b0 00 00 	movups XMMWORD PTR [r14+0xb0],xmm0
      e97879:	00 
      e9787a:	e8 07 6c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9787f:	48 8b 9c 24 80 03 00 	mov    rbx,QWORD PTR [rsp+0x380]
      e97886:	00 
      e97887:	48 85 db             	test   rbx,rbx
      e9788a:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
      e9788f:	0f 84 97 00 00 00    	je     e9792c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ed42>
      e97895:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9789a:	48 8b 80 70 05 00 00 	mov    rax,QWORD PTR [rax+0x570]
      e978a1:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e978a5:	0f 85 81 00 00 00    	jne    e9792c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ed42>
      e978ab:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      e978b0:	4c 8d b4 24 10 10 00 	lea    r14,[rsp+0x1010]
      e978b7:	00 
      e978b8:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      e978bd:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      e978c1:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e978c6:	48 8d 35 03 63 cf ff 	lea    rsi,[rip+0xffffffffffcf6303]        # b8dbd0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab70>
      e978cd:	48 8d 15 15 63 cf ff 	lea    rdx,[rip+0xffffffffffcf6315]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
### 0xe9784e: mov    QWORD PTR [r14+0x28],rbx
      e977fa:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      e97800:	4c 8d 7b 50          	lea    r15,[rbx+0x50]
      e97804:	4c 8d a4 24 10 10 00 	lea    r12,[rsp+0x1010]
      e9780b:	00 
      e9780c:	4c 89 ff             	mov    rdi,r15
      e9780f:	4c 89 e6             	mov    rsi,r12
      e97812:	e8 27 22 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e97817:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e9781c:	e8 65 6c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97821:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e97828:	00 
      e97829:	e8 ba 2f 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9782e:	48 89 df             	mov    rdi,rbx
      e97831:	48 83 c7 60          	add    rdi,0x60
      e97835:	e8 f0 de cc ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
      e9783a:	31 ff                	xor    edi,edi
      e9783c:	e8 db 6b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e97841:	4c 8b 74 24 68       	mov    r14,QWORD PTR [rsp+0x68]
      e97846:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
      e9784a:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      e9784e:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      e97852:	e8 2f 6c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97857:	48 8b 84 24 e8 01 00 	mov    rax,QWORD PTR [rsp+0x1e8]
      e9785e:	00 
      e9785f:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e97863:	49 8b be b8 00 00 00 	mov    rdi,QWORD PTR [r14+0xb8]
      e9786a:	0f 28 84 24 50 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x250]
      e97871:	00 
      e97872:	41 0f 11 86 b0 00 00 	movups XMMWORD PTR [r14+0xb0],xmm0
      e97879:	00 
      e9787a:	e8 07 6c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9787f:	48 8b 9c 24 80 03 00 	mov    rbx,QWORD PTR [rsp+0x380]
      e97886:	00 
      e97887:	48 85 db             	test   rbx,rbx
      e9788a:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
      e9788f:	0f 84 97 00 00 00    	je     e9792c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ed42>
      e97895:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e9789a:	48 8b 80 70 05 00 00 	mov    rax,QWORD PTR [rax+0x570]
      e978a1:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e978a5:	0f 85 81 00 00 00    	jne    e9792c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ed42>
      e978ab:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      e978b0:	4c 8d b4 24 10 10 00 	lea    r14,[rsp+0x1010]
      e978b7:	00 
      e978b8:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      e978bd:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      e978c1:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e978c6:	48 8d 35 03 63 cf ff 	lea    rsi,[rip+0xffffffffffcf6303]        # b8dbd0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab70>
      e978cd:	48 8d 15 15 63 cf ff 	lea    rdx,[rip+0xffffffffffcf6315]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
      e978d4:	48 8d 0d 07 84 16 00 	lea    rcx,[rip+0x168407]        # fffce2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c70f8>
### 0xe97f0a: mov    rdi,QWORD PTR [rbx+0x28]
      e97eb5:	4c 89 e7             	mov    rdi,r12
      e97eb8:	e8 17 1d 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e97ebd:	eb 12                	jmp    e97ed1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f2e7>
      e97ebf:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e97ec4:	48 8d bc 24 d0 0f 00 	lea    rdi,[rsp+0xfd0]
      e97ecb:	00 
      e97ecc:	e8 17 29 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e97ed1:	4c 89 ff             	mov    rdi,r15
      e97ed4:	e8 df e4 02 00       	call   ec63b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d7ce>
      e97ed9:	e9 07 0e 00 00       	jmp    e98ce5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600fb>
      e97ede:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e97ee3:	49 89 df             	mov    r15,rbx
      e97ee6:	49 81 c7 88 00 00 00 	add    r15,0x88
      e97eed:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
      e97ef4:	00 
      e97ef5:	e8 ee 28 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e97efa:	4c 89 ff             	mov    rdi,r15
      e97efd:	e8 02 d6 02 00       	call   ec5504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c91a>
      e97f02:	4c 89 f7             	mov    rdi,r14
      e97f05:	e8 da ad 02 00       	call   ec2ce4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a0fa>
      e97f0a:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      e97f0e:	e8 73 65 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97f13:	48 89 df             	mov    rdi,rbx
      e97f16:	e8 f5 60 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e97f1b:	48 89 df             	mov    rdi,rbx
      e97f1e:	e8 f9 64 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e97f23:	e9 93 0e 00 00       	jmp    e98dbb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x601d1>
      e97f28:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e97f2d:	48 8b bc 24 38 03 00 	mov    rdi,QWORD PTR [rsp+0x338]
      e97f34:	00 
      e97f35:	e8 4c 65 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97f3a:	eb 05                	jmp    e97f41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f357>
      e97f3c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e97f41:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e97f48:	00 
      e97f49:	e8 9a 28 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e97f4e:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e97f55:	00 
      e97f56:	e8 57 65 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e97f5b:	31 db                	xor    ebx,ebx
      e97f5d:	eb 33                	jmp    e97f92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f3a8>
      e97f5f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e97f64:	48 8b bc 24 38 03 00 	mov    rdi,QWORD PTR [rsp+0x338]
      e97f6b:	00 
      e97f6c:	e8 15 65 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97f71:	eb 05                	jmp    e97f78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f38e>
      e97f73:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e97f78:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e97f7f:	00 
### 0xe98088: mov    rdi,QWORD PTR [rbx+0x28]
      e98038:	e8 49 64 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9803d:	eb 70                	jmp    e980af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f4c5>
      e9803f:	eb 00                	jmp    e98041 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f457>
      e98041:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98046:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9804d:	00 
      e9804e:	e8 95 27 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98053:	49 89 dd             	mov    r13,rbx
      e98056:	49 83 c5 60          	add    r13,0x60
      e9805a:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      e98061:	00 
      e98062:	e8 ff 1d 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e98067:	4c 89 ef             	mov    rdi,r13
      e9806a:	e8 49 e3 02 00       	call   ec63b8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d7ce>
      e9806f:	4c 89 ff             	mov    rdi,r15
      e98072:	e8 5d 1b 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98077:	4c 89 f7             	mov    rdi,r14
      e9807a:	e8 55 1b 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e9807f:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      e98083:	e8 fe 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98088:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      e9808c:	e8 f5 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98091:	31 ff                	xor    edi,edi
      e98093:	e8 ee 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98098:	31 ff                	xor    edi,edi
      e9809a:	e8 e7 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9809f:	48 89 df             	mov    rdi,rbx
      e980a2:	e8 69 5f 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e980a7:	48 89 df             	mov    rdi,rbx
      e980aa:	e8 6d 63 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e980af:	66 0f ef c0          	pxor   xmm0,xmm0
      e980b3:	eb 13                	jmp    e980c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f4de>
      e980b5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e980ba:	66 49 0f 6e ce       	movq   xmm1,r14
      e980bf:	66 49 0f 6e c5       	movq   xmm0,r13
      e980c4:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
      e980c8:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e980cf:	e8 b2 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e980d4:	eb 3a                	jmp    e98110 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f526>
      e980d6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e980db:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e980e2:	00 
      e980e3:	e8 00 27 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e980e8:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      e980ec:	e8 95 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e980f1:	48 89 df             	mov    rdi,rbx
      e980f4:	e8 8d 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e980f9:	4c 89 f7             	mov    rdi,r14
      e980fc:	e8 0f 5f 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
### 0xe980e8: mov    rdi,QWORD PTR [r14+0x28]
      e98093:	e8 ee 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98098:	31 ff                	xor    edi,edi
      e9809a:	e8 e7 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9809f:	48 89 df             	mov    rdi,rbx
      e980a2:	e8 69 5f 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e980a7:	48 89 df             	mov    rdi,rbx
      e980aa:	e8 6d 63 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e980af:	66 0f ef c0          	pxor   xmm0,xmm0
      e980b3:	eb 13                	jmp    e980c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f4de>
      e980b5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e980ba:	66 49 0f 6e ce       	movq   xmm1,r14
      e980bf:	66 49 0f 6e c5       	movq   xmm0,r13
      e980c4:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
      e980c8:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e980cf:	e8 b2 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e980d4:	eb 3a                	jmp    e98110 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f526>
      e980d6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e980db:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e980e2:	00 
      e980e3:	e8 00 27 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e980e8:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      e980ec:	e8 95 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e980f1:	48 89 df             	mov    rdi,rbx
      e980f4:	e8 8d 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e980f9:	4c 89 f7             	mov    rdi,r14
      e980fc:	e8 0f 5f 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98101:	4c 89 f7             	mov    rdi,r14
      e98104:	e8 13 63 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98109:	eb 05                	jmp    e98110 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f526>
      e9810b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98110:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e98117:	00 
      e98118:	e8 69 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9811d:	eb 07                	jmp    e98126 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f53c>
      e9811f:	eb 00                	jmp    e98121 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f537>
      e98121:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98126:	66 0f ef c0          	pxor   xmm0,xmm0
      e9812a:	66 0f 7f 84 24 00 01 	movdqa XMMWORD PTR [rsp+0x100],xmm0
      e98131:	00 00 
      e98133:	e9 66 07 00 00       	jmp    e9889e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fcb4>
      e98138:	e9 c4 03 00 00       	jmp    e98501 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f917>
      e9813d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98142:	e9 1f 05 00 00       	jmp    e98666 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fa7c>
      e98147:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9814c:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
      e98153:	00 
      e98154:	e8 2d 63 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98159:	eb 05                	jmp    e98160 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f576>
      e9815b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
### 0xe98365: mov    rdi,QWORD PTR [rbx+0x28]
      e98311:	48 8d bc 24 50 0f 00 	lea    rdi,[rsp+0xf50]
      e98318:	00 
      e98319:	e8 4c 1c be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9831e:	48 89 df             	mov    rdi,rbx
      e98321:	e8 44 1c be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98326:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e9832d:	00 
      e9832e:	e9 c9 04 00 00       	jmp    e987fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc12>
      e98333:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98338:	4c 89 ff             	mov    rdi,r15
      e9833b:	e8 94 18 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98340:	eb 12                	jmp    e98354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f76a>
      e98342:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98347:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e9834e:	00 
      e9834f:	e8 94 24 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98354:	4c 89 f7             	mov    rdi,r14
      e98357:	e8 78 18 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e9835c:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      e98360:	e8 21 61 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98365:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      e98369:	e8 18 61 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9836e:	48 89 df             	mov    rdi,rbx
      e98371:	e8 9a 5c 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98376:	48 89 df             	mov    rdi,rbx
      e98379:	e8 9e 60 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9837e:	eb 77                	jmp    e983f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f80d>
      e98380:	eb 70                	jmp    e983f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f808>
      e98382:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98387:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e9838e:	00 
      e9838f:	e8 40 18 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98394:	48 8b bc 24 08 0a 00 	mov    rdi,QWORD PTR [rsp+0xa08]
      e9839b:	00 
      e9839c:	e8 e5 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e983a1:	eb 12                	jmp    e983b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f7cb>
      e983a3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e983a8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e983af:	00 
      e983b0:	e8 b5 1b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e983b5:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e983bc:	00 
      e983bd:	e8 6e 3a c1 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
      e983c2:	eb 05                	jmp    e983c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f7df>
      e983c4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e983c9:	48 89 ef             	mov    rdi,rbp
      e983cc:	e8 7d 3b f7 ff       	call   e0bf4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd8fd4>
      e983d1:	48 8d 35 78 b2 99 00 	lea    rsi,[rip+0x99b278]        # 1833650 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x55e8>
      e983d8:	4c 89 ff             	mov    rdi,r15
### 0xe98be9: mov    rdi,QWORD PTR [r15+0x28]
      e98b90:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      e98b95:	48 8d bc 24 e0 0d 00 	lea    rdi,[rsp+0xde0]
      e98b9c:	00 
      e98b9d:	e8 c8 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98ba2:	eb 0a                	jmp    e98bae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ffc4>
      e98ba4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98ba9:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      e98bae:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98bb5:	00 
      e98bb6:	e8 af 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98bbb:	4c 89 f7             	mov    rdi,r14
      e98bbe:	e8 c3 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bc3:	4c 89 ff             	mov    rdi,r15
      e98bc6:	e8 bb 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bcb:	e9 ab fb ff ff       	jmp    e9877b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb91>
      e98bd0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98bd5:	e9 ab fb ff ff       	jmp    e98785 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb9b>
      e98bda:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98bdf:	e9 ae fb ff ff       	jmp    e98792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fba8>
      e98be4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98be9:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      e98bed:	e8 94 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bf2:	4c 89 e7             	mov    rdi,r12
      e98bf5:	e8 8c 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98bfa:	4c 89 ff             	mov    rdi,r15
      e98bfd:	e8 0e 54 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98c02:	4c 89 ff             	mov    rdi,r15
      e98c05:	e8 12 58 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98c0a:	45 31 e4             	xor    r12d,r12d
      e98c0d:	eb 05                	jmp    e98c14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6002a>
      e98c0f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c14:	4c 89 e7             	mov    rdi,r12
      e98c17:	e8 6a 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c1c:	eb 77                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c1e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c23:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98c2a:	00 
      e98c2b:	e8 b8 1b 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98c30:	4c 89 f7             	mov    rdi,r14
      e98c33:	e8 be a2 02 00       	call   ec2ef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a30c>
      e98c38:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e98c3f:	00 
      e98c40:	e8 21 12 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e98c45:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e98c4a:	e8 85 0f 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98c4f:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e98c56:	00 
      e98c57:	e8 e4 a2 02 00       	call   ec2f40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a356>
      e98c5c:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
### 0xe98c6d: mov    rdi,QWORD PTR [r12+0x28]
      e98c17:	e8 6a 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c1c:	eb 77                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c1e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c23:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98c2a:	00 
      e98c2b:	e8 b8 1b 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98c30:	4c 89 f7             	mov    rdi,r14
      e98c33:	e8 be a2 02 00       	call   ec2ef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a30c>
      e98c38:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e98c3f:	00 
      e98c40:	e8 21 12 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e98c45:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e98c4a:	e8 85 0f 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98c4f:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e98c56:	00 
      e98c57:	e8 e4 a2 02 00       	call   ec2f40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a356>
      e98c5c:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e98c61:	e8 e0 8a 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      e98c66:	eb 05                	jmp    e98c6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60083>
      e98c68:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c6d:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      e98c72:	e8 0f 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c77:	31 ff                	xor    edi,edi
      e98c79:	e8 08 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c7e:	4c 89 e7             	mov    rdi,r12
      e98c81:	e8 8a 53 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98c86:	4c 89 e7             	mov    rdi,r12
      e98c89:	e8 8e 57 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98c8e:	eb 05                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c90:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c95:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e98c9c:	00 
      e98c9d:	e8 e4 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ca2:	e9 f8 fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98ca7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cac:	e9 ee fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98cb1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cb6:	6a 20                	push   0x20
      e98cb8:	5b                   	pop    rbx
      e98cb9:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
      e98cc0:	00 
      e98cc1:	e8 c0 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98cc6:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      e98cca:	75 ed                	jne    e98cb9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600cf>
      e98ccc:	e9 ce fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98cd1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cd6:	4c 89 ff             	mov    rdi,r15
      e98cd9:	e8 12 34 f7 ff       	call   e0c0f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9176>
      e98cde:	eb 05                	jmp    e98ce5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600fb>
### 0xe98d82: mov    rdi,QWORD PTR [r14+0x28]
      e98d2d:	eb 22                	jmp    e98d51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60167>
      e98d2f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d34:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e98d3b:	00 
      e98d3c:	e8 45 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d41:	4c 89 f7             	mov    rdi,r14
      e98d44:	e8 c7 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d49:	4c 89 f7             	mov    rdi,r14
      e98d4c:	e8 cb 56 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98d51:	31 ff                	xor    edi,edi
      e98d53:	e8 2e 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d58:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e98d5d:	e8 24 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d62:	e9 4c fa ff ff       	jmp    e987b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbc9>
      e98d67:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d6c:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e98d71:	eb e0                	jmp    e98d53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60169>
      e98d73:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d78:	e9 60 fa ff ff       	jmp    e987dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbf3>
      e98d7d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d82:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      e98d86:	e8 fb 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d8b:	48 89 df             	mov    rdi,rbx
      e98d8e:	e8 f3 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d93:	4c 89 f7             	mov    rdi,r14
      e98d96:	e8 75 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d9b:	4c 89 f7             	mov    rdi,r14
      e98d9e:	e8 79 56 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98da3:	31 db                	xor    ebx,ebx
      e98da5:	eb 05                	jmp    e98dac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x601c2>
      e98da7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98dac:	48 89 df             	mov    rdi,rbx
      e98daf:	e8 d2 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98db4:	eb 05                	jmp    e98dbb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x601d1>
      e98db6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98dbb:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]
      e98dc2:	00 
      e98dc3:	e8 be 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98dc8:	e9 1a fa ff ff       	jmp    e987e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbfd>
      e98dcd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98dd2:	e9 10 fa ff ff       	jmp    e987e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbfd>
      e98dd7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98ddc:	e9 20 fa ff ff       	jmp    e98801 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc17>
      e98de1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98de6:	4c 89 ff             	mov    rdi,r15
      e98de9:	e8 98 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98dee:	eb 05                	jmp    e98df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6020b>
      e98df0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98df5:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]

## Hits containing +0x40]
### 0xe94cba: and    QWORD PTR [rbx+0x40],0x0
      e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e94c72:	bf 90 00 00 00       	mov    edi,0x90
      e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
      e94c7e:	00 
      e94c7f:	e8 7c 92 95 00       	call   17edf00 <_Znwm@plt>
      e94c84:	48 89 c3             	mov    rbx,rax
      e94c87:	4d 8d 7c 24 08       	lea    r15,[r12+0x8]
      e94c8c:	48 89 ac 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rbp
      e94c93:	00 
      e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
      e94c9b:	00 
      e94c9c:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
      e94ca3:	00 
      e94ca4:	66 0f ef c0          	pxor   xmm0,xmm0
      e94ca8:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      e94cac:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94cb3:	00 f0 3f 
      e94cb6:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e94cba:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e94cbf:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
      e94cc3:	4c 89 f6             	mov    rsi,r14
      e94cc6:	e8 25 32 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ccb:	48 89 df             	mov    rdi,rbx
      e94cce:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      e94cd2:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
      e94cd7:	e8 e6 c9 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e94cdc:	48 89 9c 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rbx
      e94ce3:	00 
      e94ce4:	4c 89 f7             	mov    rdi,r14
      e94ce7:	e8 7e 52 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94cec:	f0 49 ff 07          	lock inc QWORD PTR [r15]
      e94cf0:	bf 00 01 00 00       	mov    edi,0x100
      e94cf5:	e8 06 92 95 00       	call   17edf00 <_Znwm@plt>
      e94cfa:	49 89 c7             	mov    r15,rax
      e94cfd:	4c 89 e0             	mov    rax,r12
      e94d00:	48 83 c0 18          	add    rax,0x18
      e94d04:	48 8d 0d 8d fa 9a 00 	lea    rcx,[rip+0x9afa8d]        # 1844798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe80>
      e94d0b:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e94d0e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e94d12:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
      e94d16:	66 0f ef c0          	pxor   xmm0,xmm0
      e94d1a:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      e94d20:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
      e94d26:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
      e94d2b:	4c 89 f8             	mov    rax,r15
      e94d2e:	48 83 c0 40          	add    rax,0x40
      e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
### 0xe94d32: mov    QWORD PTR [r15+0x40],rax
      e94cdc:	48 89 9c 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rbx
      e94ce3:	00 
      e94ce4:	4c 89 f7             	mov    rdi,r14
      e94ce7:	e8 7e 52 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94cec:	f0 49 ff 07          	lock inc QWORD PTR [r15]
      e94cf0:	bf 00 01 00 00       	mov    edi,0x100
      e94cf5:	e8 06 92 95 00       	call   17edf00 <_Znwm@plt>
      e94cfa:	49 89 c7             	mov    r15,rax
      e94cfd:	4c 89 e0             	mov    rax,r12
      e94d00:	48 83 c0 18          	add    rax,0x18
      e94d04:	48 8d 0d 8d fa 9a 00 	lea    rcx,[rip+0x9afa8d]        # 1844798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe80>
      e94d0b:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e94d0e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e94d12:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
      e94d16:	66 0f ef c0          	pxor   xmm0,xmm0
      e94d1a:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      e94d20:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
      e94d26:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
      e94d2b:	4c 89 f8             	mov    rax,r15
      e94d2e:	48 83 c0 40          	add    rax,0x40
      e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
      e94d36:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
      e94d3a:	66 41 0f 7f 47 50    	movdqa XMMWORD PTR [r15+0x50],xmm0
      e94d40:	66 41 0f 7f 47 60    	movdqa XMMWORD PTR [r15+0x60],xmm0
      e94d46:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      e94d4b:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e94d50:	41 89 47 78          	mov    DWORD PTR [r15+0x78],eax
      e94d54:	6a 64                	push   0x64
      e94d56:	59                   	pop    rcx
      e94d57:	49 89 8f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rcx
      e94d5e:	49 89 8f 88 00 00 00 	mov    QWORD PTR [r15+0x88],rcx
      e94d65:	49 83 a7 90 00 00 00 	and    QWORD PTR [r15+0x90],0x0
      e94d6c:	00 
      e94d6d:	49 83 a7 c0 00 00 00 	and    QWORD PTR [r15+0xc0],0x0
      e94d74:	00 
      e94d75:	66 41 0f 7f 87 d0 00 	movdqa XMMWORD PTR [r15+0xd0],xmm0
      e94d7c:	00 00 
      e94d7e:	66 41 0f 7f 87 e0 00 	movdqa XMMWORD PTR [r15+0xe0],xmm0
      e94d85:	00 00 
      e94d87:	41 89 87 f0 00 00 00 	mov    DWORD PTR [r15+0xf0],eax
      e94d8e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e94d93:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e94d97:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94d9c:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
      e94da0:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      e94da3:	48 8d 15 48 f3 53 ff 	lea    rdx,[rip+0xffffffffff53f348]        # 3d40f2 <_ZTSN5boost17bad_function_callE@@Base+0x1438>
      e94daa:	4c 8d 05 4f f3 53 ff 	lea    r8,[rip+0xffffffffff53f34f]        # 3d4100 <_ZTSN5boost17bad_function_callE@@Base+0x1446>
      e94db1:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94db8:	00 
### 0xe94e9d: mov    BYTE PTR [r12+0x40],al
      e94e42:	bf 50 01 00 00       	mov    edi,0x150
      e94e47:	e8 b4 90 95 00       	call   17edf00 <_Znwm@plt>
      e94e4c:	49 89 c4             	mov    r12,rax
      e94e4f:	66 0f ef c0          	pxor   xmm0,xmm0
      e94e53:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94e58:	48 8d 05 b9 f9 9a 00 	lea    rax,[rip+0x9af9b9]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
      e94e5f:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e94e63:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
      e94e6a:	00 
      e94e6b:	48 8d b4 24 90 0e 00 	lea    rsi,[rsp+0xe90]
      e94e72:	00 
      e94e73:	4c 89 ef             	mov    rdi,r13
      e94e76:	e8 75 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94e7b:	48 8d 05 ce f9 9a 00 	lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
      e94e82:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      e94e87:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94e8e:	00 f0 3f 
      e94e91:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      e94e96:	31 c0                	xor    eax,eax
      e94e98:	41 88 44 24 30       	mov    BYTE PTR [r12+0x30],al
      e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al
      e94ea2:	49 83 64 24 58 00    	and    QWORD PTR [r12+0x58],0x0
      e94ea8:	66 0f ef c0          	pxor   xmm0,xmm0
      e94eac:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e94eb3:	41 88 44 24 70       	mov    BYTE PTR [r12+0x70],al
      e94eb8:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e94ebf:	00 
      e94ec0:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      e94ec5:	4c 89 ee             	mov    rsi,r13
      e94ec8:	e8 23 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ecd:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e94ed4:	00 00 
      e94ed6:	49 89 9c 24 b0 00 00 	mov    QWORD PTR [r12+0xb0],rbx
      e94edd:	00 
      e94ede:	4d 89 bc 24 b8 00 00 	mov    QWORD PTR [r12+0xb8],r15
      e94ee5:	00 
      e94ee6:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
      e94eed:	00 
      e94eee:	48 89 df             	mov    rdi,rbx
      e94ef1:	e8 0c 4f 94 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]
      e94efb:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e94f00:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e94f07:	00 
      e94f08:	49 8d 84 24 b0 00 00 	lea    rax,[r12+0xb0]
      e94f0f:	00 
      e94f10:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      e94f17:	00 
      e94f18:	49 8d 84 24 b8 00 00 	lea    rax,[r12+0xb8]
### 0xe95110: mov    r15,QWORD PTR [rsp+0x40]
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
### 0xe95260: mov    QWORD PTR [rbx+0x40],r14
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
      e95272:	66 49 0f 7e c4       	movq   r12,xmm0
      e95277:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      e9527b:	4c 89 e7             	mov    rdi,r12
      e9527e:	48 89 5c 24 70       	mov    QWORD PTR [rsp+0x70],rbx
      e95283:	ff 10                	call   QWORD PTR [rax]
      e95285:	49 89 c5             	mov    r13,rax
      e95288:	4c 8d 7b 48          	lea    r15,[rbx+0x48]
      e9528c:	66 0f ef c0          	pxor   xmm0,xmm0
      e95290:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
      e95296:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
      e9529c:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      e952a1:	48 89 c7             	mov    rdi,rax
      e952a4:	e8 51 47 ff ff       	call   e899fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e10>
      e952a9:	48 89 c5             	mov    rbp,rax
      e952ac:	49 89 d6             	mov    r14,rdx
      e952af:	4c 89 ef             	mov    rdi,r13
      e952b2:	e8 6b 47 ff ff       	call   e89a22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e38>
      e952b7:	49 89 d0             	mov    r8,rdx
      e952ba:	4c 89 ff             	mov    rdi,r15
      e952bd:	48 89 ee             	mov    rsi,rbp
      e952c0:	4c 89 f2             	mov    rdx,r14
      e952c3:	48 89 c1             	mov    rcx,rax
      e952c6:	e8 09 0c 03 00       	call   ec5ed4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d2ea>
      e952cb:	4c 8d 6b 18          	lea    r13,[rbx+0x18]
      e952cf:	4c 8b b4 24 88 00 00 	mov    r14,QWORD PTR [rsp+0x88]
### 0xe95489: mov    rdi,QWORD PTR [rsp+0x40]
      e95436:	eb 0d                	jmp    e95445 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c85b>
      e95438:	48 8d bc 24 90 0f 00 	lea    rdi,[rsp+0xf90]
      e9543f:	00 
      e95440:	e8 a3 53 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e95445:	4c 8b 7c 24 68       	mov    r15,QWORD PTR [rsp+0x68]
      e9544a:	4c 8b b4 24 c0 00 00 	mov    r14,QWORD PTR [rsp+0xc0]
      e95451:	00 
      e95452:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e95457:	48 8d b8 98 00 00 00 	lea    rdi,[rax+0x98]
      e9545e:	e8 2b 2e c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95463:	48 8b 9c 24 d0 00 00 	mov    rbx,QWORD PTR [rsp+0xd0]
      e9546a:	00 
      e9546b:	48 89 df             	mov    rdi,rbx
      e9546e:	e8 13 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95473:	31 ff                	xor    edi,edi
      e95475:	e8 a2 8f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9547a:	48 89 df             	mov    rdi,rbx
      e9547d:	e8 04 90 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95482:	31 ff                	xor    edi,edi
      e95484:	e8 fd 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95489:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e9548e:	e8 f3 8f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95493:	ba c0 00 00 00       	mov    edx,0xc0
      e95498:	4c 89 ff             	mov    rdi,r15
      e9549b:	31 f6                	xor    esi,esi
      e9549d:	e8 ee 96 95 00       	call   17eeb90 <memset@plt>
      e954a2:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      e954a7:	48 8b 81 90 04 00 00 	mov    rax,QWORD PTR [rcx+0x490]
      e954ae:	0f 10 81 88 04 00 00 	movups xmm0,XMMWORD PTR [rcx+0x488]
      e954b5:	0f 29 84 24 e0 0b 00 	movaps XMMWORD PTR [rsp+0xbe0],xmm0
      e954bc:	00 
      e954bd:	48 85 c0             	test   rax,rax
      e954c0:	74 05                	je     e954c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c8dd>
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
### 0xe958eb: and    QWORD PTR [rbp+0x40],0x0
      e95897:	31 ff                	xor    edi,edi
      e95899:	e8 e8 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9589e:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e958a5:	00 
      e958a6:	e8 db 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e958ab:	48 8d b3 30 02 00 00 	lea    rsi,[rbx+0x230]
      e958b2:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      e958b9:	00 
      e958ba:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
      e958c1:	00 
      e958c2:	e8 f7 63 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e958c7:	6a 50                	push   0x50
      e958c9:	5f                   	pop    rdi
      e958ca:	e8 31 86 95 00       	call   17edf00 <_Znwm@plt>
      e958cf:	48 89 c5             	mov    rbp,rax
      e958d2:	66 0f ef c0          	pxor   xmm0,xmm0
      e958d6:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e958db:	48 8d 05 46 ba 96 00 	lea    rax,[rip+0x96ba46]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
      e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f0:	4c 89 f8             	mov    rax,r15
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
      e9590d:	00 
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
      e95919:	00 
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
      e95928:	00 
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
      e95937:	00 
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
      e95947:	00 
      e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      e9594c:	48 89 8c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rcx
      e95953:	00 
      e95954:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e9595b:	00 
      e9595c:	4c 89 bc 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r15
      e95963:	00 
### 0xe95948: mov    rcx,QWORD PTR [rbx+0x40]
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
      e9590d:	00 
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
      e95919:	00 
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
      e95928:	00 
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
      e95937:	00 
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
      e95947:	00 
      e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      e9594c:	48 89 8c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rcx
      e95953:	00 
      e95954:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e9595b:	00 
      e9595c:	4c 89 bc 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r15
      e95963:	00 
      e95964:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95969:	66 0f 6f 84 24 d0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xd0]
      e95970:	00 00 
      e95972:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
      e95979:	00 00 
      e9597b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e95980:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e95984:	48 8b 83 78 05 00 00 	mov    rax,QWORD PTR [rbx+0x578]
      e9598b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e95990:	48 8d 05 49 8f 97 00 	lea    rax,[rip+0x978f49]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e95997:	48 89 84 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rax
      e9599e:	00 
      e9599f:	4c 89 b4 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r14
      e959a6:	00 
      e959a7:	4c 89 ac 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r13
      e959ae:	00 
      e959af:	4c 8b b3 98 03 00 00 	mov    r14,QWORD PTR [rbx+0x398]
      e959b6:	4c 8b ab a0 03 00 00 	mov    r13,QWORD PTR [rbx+0x3a0]
      e959bd:	48 8b 83 a8 03 00 00 	mov    rax,QWORD PTR [rbx+0x3a8]
      e959c4:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
      e959cb:	00 
      e959cc:	48 8b 83 b0 03 00 00 	mov    rax,QWORD PTR [rbx+0x3b0]
### 0xe96461: mov    rax,QWORD PTR [r14+0x40]
      e96404:	4c 89 ff             	mov    rdi,r15
      e96407:	e8 84 3e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9640c:	44 88 a4 24 60 01 00 	mov    BYTE PTR [rsp+0x160],r12b
      e96413:	00 
      e96414:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
      e9641b:	48 8d b4 24 40 07 00 	lea    rsi,[rsp+0x740]
      e96422:	00 
      e96423:	e8 68 3e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e96428:	4c 8d b4 24 90 07 00 	lea    r14,[rsp+0x790]
      e9642f:	00 
      e96430:	41 0f 28 46 e0       	movaps xmm0,XMMWORD PTR [r14-0x20]
      e96435:	0f 29 83 30 01 00 00 	movaps XMMWORD PTR [rbx+0x130],xmm0
      e9643c:	49 8b 46 f0          	mov    rax,QWORD PTR [r14-0x10]
      e96440:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
      e96447:	0f 57 c0             	xorps  xmm0,xmm0
      e9644a:	41 0f 11 46 e8       	movups XMMWORD PTR [r14-0x18],xmm0
      e9644f:	48 89 df             	mov    rdi,rbx
      e96452:	48 81 c7 50 01 00 00 	add    rdi,0x150
      e96459:	4c 89 f6             	mov    rsi,r14
      e9645c:	e8 cb 65 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e96461:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      e96465:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
      e9646c:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
      e96471:	0f 29 83 80 01 00 00 	movaps XMMWORD PTR [rbx+0x180],xmm0
      e96478:	66 0f ef c9          	pxor   xmm1,xmm1
      e9647c:	66 41 0f 7f 4e 30    	movdqa XMMWORD PTR [r14+0x30],xmm1
      e96482:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
      e96487:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
      e9648c:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      e96493:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      e96497:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      e9649e:	0f 57 c0             	xorps  xmm0,xmm0
      e964a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e964a6:	66 41 0f 7f 4e 50    	movdqa XMMWORD PTR [r14+0x50],xmm1
      e964ac:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
      e964b1:	0f 29 83 b0 01 00 00 	movaps XMMWORD PTR [rbx+0x1b0],xmm0
      e964b8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e964bf:	00 
      e964c0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e964c4:	48 89 9c 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rbx
      e964cb:	00 
      e964cc:	e8 f9 3d be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e964d1:	48 8d 84 24 20 06 00 	lea    rax,[rsp+0x620]
      e964d8:	00 
      e964d9:	48 8d 0d 00 84 97 00 	lea    rcx,[rip+0x978400]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
### 0xe96482: and    QWORD PTR [r14+0x40],0x0
      e96422:	00 
      e96423:	e8 68 3e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e96428:	4c 8d b4 24 90 07 00 	lea    r14,[rsp+0x790]
      e9642f:	00 
      e96430:	41 0f 28 46 e0       	movaps xmm0,XMMWORD PTR [r14-0x20]
      e96435:	0f 29 83 30 01 00 00 	movaps XMMWORD PTR [rbx+0x130],xmm0
      e9643c:	49 8b 46 f0          	mov    rax,QWORD PTR [r14-0x10]
      e96440:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
      e96447:	0f 57 c0             	xorps  xmm0,xmm0
      e9644a:	41 0f 11 46 e8       	movups XMMWORD PTR [r14-0x18],xmm0
      e9644f:	48 89 df             	mov    rdi,rbx
      e96452:	48 81 c7 50 01 00 00 	add    rdi,0x150
      e96459:	4c 89 f6             	mov    rsi,r14
      e9645c:	e8 cb 65 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e96461:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      e96465:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
      e9646c:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
      e96471:	0f 29 83 80 01 00 00 	movaps XMMWORD PTR [rbx+0x180],xmm0
      e96478:	66 0f ef c9          	pxor   xmm1,xmm1
      e9647c:	66 41 0f 7f 4e 30    	movdqa XMMWORD PTR [r14+0x30],xmm1
      e96482:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
      e96487:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
      e9648c:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      e96493:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      e96497:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      e9649e:	0f 57 c0             	xorps  xmm0,xmm0
      e964a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e964a6:	66 41 0f 7f 4e 50    	movdqa XMMWORD PTR [r14+0x50],xmm1
      e964ac:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
      e964b1:	0f 29 83 b0 01 00 00 	movaps XMMWORD PTR [rbx+0x1b0],xmm0
      e964b8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e964bf:	00 
      e964c0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e964c4:	48 89 9c 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rbx
      e964cb:	00 
      e964cc:	e8 f9 3d be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e964d1:	48 8d 84 24 20 06 00 	lea    rax,[rsp+0x620]
      e964d8:	00 
      e964d9:	48 8d 0d 00 84 97 00 	lea    rcx,[rip+0x978400]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
      e964f9:	00 
      e964fa:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e964fe:	4d 8b a5 28 04 00 00 	mov    r12,QWORD PTR [r13+0x428]
      e96505:	41 0f 28 85 70 04 00 	movaps xmm0,XMMWORD PTR [r13+0x470]
      e9650c:	00 
### 0xe96e4e: call   QWORD PTR [rax+0x40]
      e96dfb:	4c 8b bb b0 00 00 00 	mov    r15,QWORD PTR [rbx+0xb0]
      e96e02:	48 8b 83 90 05 00 00 	mov    rax,QWORD PTR [rbx+0x590]
      e96e09:	4c 8d 84 24 10 10 00 	lea    r8,[rsp+0x1010]
      e96e10:	00 
      e96e11:	49 89 00             	mov    QWORD PTR [r8],rax
      e96e14:	48 8d 35 76 62 c0 ff 	lea    rsi,[rip+0xffffffffffc06276]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e96e1b:	48 8d 0d 48 b8 00 00 	lea    rcx,[rip+0xb848]        # ea266a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a80>
      e96e22:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e96e29:	00 
      e96e2a:	6a 08                	push   0x8
      e96e2c:	41 59                	pop    r9
      e96e2e:	4c 89 e7             	mov    rdi,r12
      e96e31:	31 d2                	xor    edx,edx
      e96e33:	e8 5c 39 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e96e38:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e96e3b:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
      e96e42:	00 
      e96e43:	4c 89 fe             	mov    rsi,r15
      e96e46:	4c 89 e2             	mov    rdx,r12
      e96e49:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
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
### 0xe96ea5: cmp    QWORD PTR [rbx+0x40],r12
      e96e49:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
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
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
### 0xe96ec8: mov    rax,QWORD PTR [rbx+0x40]
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
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
### 0xe96ed0: mov    QWORD PTR [rbx+0x40],r12
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
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
### 0xe96f02: mov    rdi,QWORD PTR [rbx+0x40]
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
### 0xe96f14: mov    rdi,QWORD PTR [rbx+0x40]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
### 0xe96f1e: and    QWORD PTR [rbx+0x40],0x0
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
### 0xe96f4a: mov    QWORD PTR [rbx+0x40],r12
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f91:	00 
      e96f92:	4c 89 fe             	mov    rsi,r15
      e96f95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f98:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      e96f9c:	e8 e5 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96fa1:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e96fa6:	48 8b b3 c0 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3c0]
      e96fad:	48 85 f6             	test   rsi,rsi
      e96fb0:	0f 84 8e 00 00 00    	je     e97044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e45a>
      e96fb6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e96fb9:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96fc0:	00 
### 0xe97446: mov    QWORD PTR [r14+0x40],r15
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
      e9747e:	e8 73 25 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e97483:	49 8b 5e 38          	mov    rbx,QWORD PTR [r14+0x38]
      e97487:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e9748a:	48 8b a8 d8 fe ff ff 	mov    rbp,QWORD PTR [rax-0x128]
      e97491:	4c 8d 84 24 d0 03 00 	lea    r8,[rsp+0x3d0]
      e97498:	00 
      e97499:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
      e9749e:	4d 89 28             	mov    QWORD PTR [r8],r13
      e974a1:	48 8d 35 e9 5b c0 ff 	lea    rsi,[rip+0xffffffffffc05be9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e974a8:	48 8d 0d b7 41 03 00 	lea    rcx,[rip+0x341b7]        # ecb666 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92a7c>
      e974af:	4c 8d ac 24 50 10 00 	lea    r13,[rsp+0x1050]
      e974b6:	00 
      e974b7:	6a 08                	push   0x8
      e974b9:	41 59                	pop    r9
      e974bb:	4c 89 ef             	mov    rdi,r13
      e974be:	31 d2                	xor    edx,edx
      e974c0:	e8 cf 32 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
### 0xe9769a: lea    rdi,[r12+0x40]
      e97645:	74 05                	je     e9764c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ea62>
      e97647:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9764c:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e97653:	00 
      e97654:	e8 01 46 c2 ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
      e97659:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e97660:	00 
      e97661:	e8 6e 25 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e97666:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e9766d:	00 
      e9766e:	e8 bd 47 c1 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
      e97673:	48 8b bc 24 08 0a 00 	mov    rdi,QWORD PTR [rsp+0xa08]
      e9767a:	00 
      e9767b:	e8 06 6e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97680:	31 ff                	xor    edi,edi
      e97682:	e8 95 6d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e97687:	4d 89 3c 24          	mov    QWORD PTR [r12],r15
      e9768b:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e97690:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14
      e97695:	e8 ec 6d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9769a:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]
      e9769f:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
      e976a6:	00 
      e976a7:	e8 90 18 00 00       	call   e98f3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60352>
      e976ac:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
      e976b3:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e976b7:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      e976bc:	0f 85 9c 00 00 00    	jne    e9775e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5eb74>
      e976c2:	80 7c 24 1f 00       	cmp    BYTE PTR [rsp+0x1f],0x0
      e976c7:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      e976cc:	49 0f 44 cc          	cmove  rcx,r12
      e976d0:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
      e976d3:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      e976da:	00 00 
      e976dc:	66 0f 7f 84 24 10 10 	movdqa XMMWORD PTR [rsp+0x1010],xmm0
      e976e3:	00 00 
      e976e5:	48 85 c0             	test   rax,rax
      e976e8:	74 05                	je     e976ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5eb05>
      e976ea:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e976ef:	48 8d 35 2e 25 c2 ff 	lea    rsi,[rip+0xffffffffffc2252e]        # ab9c24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6bc4>
      e976f6:	48 8d 15 41 25 c2 ff 	lea    rdx,[rip+0xffffffffffc22541]        # ab9c3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6bde>
      e976fd:	48 8d 0d 70 15 e3 ff 	lea    rcx,[rip+0xffffffffffe31570]        # cc8c74 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215c14>
      e97704:	4c 8d b4 24 50 10 00 	lea    r14,[rsp+0x1050]
      e9770b:	00 
      e9770c:	4c 8d 84 24 10 10 00 	lea    r8,[rsp+0x1010]
      e97713:	00 
      e97714:	6a 10                	push   0x10
      e97716:	41 59                	pop    r9
      e97718:	4c 89 f7             	mov    rdi,r14
### 0xe976b7: mov    rax,QWORD PTR [rsp+0x40]
      e97660:	00 
      e97661:	e8 6e 25 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e97666:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e9766d:	00 
      e9766e:	e8 bd 47 c1 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
      e97673:	48 8b bc 24 08 0a 00 	mov    rdi,QWORD PTR [rsp+0xa08]
      e9767a:	00 
      e9767b:	e8 06 6e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97680:	31 ff                	xor    edi,edi
      e97682:	e8 95 6d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e97687:	4d 89 3c 24          	mov    QWORD PTR [r12],r15
      e9768b:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e97690:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14
      e97695:	e8 ec 6d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9769a:	49 8d 7c 24 40       	lea    rdi,[r12+0x40]
      e9769f:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
      e976a6:	00 
      e976a7:	e8 90 18 00 00       	call   e98f3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60352>
      e976ac:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
      e976b3:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
      e976b7:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      e976bc:	0f 85 9c 00 00 00    	jne    e9775e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5eb74>
      e976c2:	80 7c 24 1f 00       	cmp    BYTE PTR [rsp+0x1f],0x0
      e976c7:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      e976cc:	49 0f 44 cc          	cmove  rcx,r12
      e976d0:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
      e976d3:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      e976da:	00 00 
      e976dc:	66 0f 7f 84 24 10 10 	movdqa XMMWORD PTR [rsp+0x1010],xmm0
      e976e3:	00 00 
      e976e5:	48 85 c0             	test   rax,rax
      e976e8:	74 05                	je     e976ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5eb05>
      e976ea:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e976ef:	48 8d 35 2e 25 c2 ff 	lea    rsi,[rip+0xffffffffffc2252e]        # ab9c24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6bc4>
      e976f6:	48 8d 15 41 25 c2 ff 	lea    rdx,[rip+0xffffffffffc22541]        # ab9c3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6bde>
      e976fd:	48 8d 0d 70 15 e3 ff 	lea    rcx,[rip+0xffffffffffe31570]        # cc8c74 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x215c14>
      e97704:	4c 8d b4 24 50 10 00 	lea    r14,[rsp+0x1050]
      e9770b:	00 
      e9770c:	4c 8d 84 24 10 10 00 	lea    r8,[rsp+0x1010]
      e97713:	00 
      e97714:	6a 10                	push   0x10
      e97716:	41 59                	pop    r9
      e97718:	4c 89 f7             	mov    rdi,r14
      e9771b:	e8 74 30 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e97720:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e97723:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
      e9772a:	00 
      e9772b:	48 89 de             	mov    rsi,rbx
      e9772e:	4c 89 f2             	mov    rdx,r14
### 0xe977aa: lea    r14,[rbx+0x40]
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
      e977cc:	48 8d 0d a5 c5 02 00 	lea    rcx,[rip+0x2c5a5]        # ec3d78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b18e>
      e977d3:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e977da:	00 
      e977db:	6a 08                	push   0x8
      e977dd:	41 59                	pop    r9
      e977df:	4c 89 e7             	mov    rdi,r12
      e977e2:	31 d2                	xor    edx,edx
      e977e4:	e8 ab 2f 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e977e9:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e977ec:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e977f3:	00 
      e977f4:	4c 89 fe             	mov    rsi,r15
      e977f7:	4c 89 e2             	mov    rdx,r12
      e977fa:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      e97800:	4c 8d 7b 50          	lea    r15,[rbx+0x50]
      e97804:	4c 8d a4 24 10 10 00 	lea    r12,[rsp+0x1010]
      e9780b:	00 
      e9780c:	4c 89 ff             	mov    rdi,r15
      e9780f:	4c 89 e6             	mov    rsi,r12
      e97812:	e8 27 22 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e97817:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
### 0xe97a90: mov    rdi,QWORD PTR [rsp+0x40]
      e97a3e:	00 
      e97a3f:	e8 42 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a44:	48 8b bc 24 78 01 00 	mov    rdi,QWORD PTR [rsp+0x178]
      e97a4b:	00 
      e97a4c:	e8 35 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a51:	48 8b bc 24 80 01 00 	mov    rdi,QWORD PTR [rsp+0x180]
      e97a58:	00 
      e97a59:	e8 28 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a5e:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      e97a65:	00 
      e97a66:	e8 1b 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a6b:	48 8b bc 24 b0 01 00 	mov    rdi,QWORD PTR [rsp+0x1b0]
      e97a72:	00 
      e97a73:	e8 0e 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a78:	48 8b 9c 24 f8 00 00 	mov    rbx,QWORD PTR [rsp+0xf8]
      e97a7f:	00 
      e97a80:	48 89 df             	mov    rdi,rbx
      e97a83:	e8 fe 69 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a88:	48 89 df             	mov    rdi,rbx
      e97a8b:	e8 f6 69 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a90:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e97a95:	e8 ec 69 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97a9a:	48 8b bc 24 88 03 00 	mov    rdi,QWORD PTR [rsp+0x388]
      e97aa1:	00 
      e97aa2:	e8 df 69 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97aa7:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
      e97aae:	00 
      e97aaf:	e8 80 4e cc ff       	call   b5c934 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa98d4>
      e97ab4:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
      e97abb:	00 
      e97abc:	e8 4f b0 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e97ac1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e97ac8:	00 00 
      e97aca:	48 3b 84 24 b0 10 00 	cmp    rax,QWORD PTR [rsp+0x10b0]
      e97ad1:	00 
      e97ad2:	0f 85 1f 0e 00 00    	jne    e988f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fd0d>
      e97ad8:	48 81 c4 b8 10 00 00 	add    rsp,0x10b8
      e97adf:	5b                   	pop    rbx
      e97ae0:	41 5c                	pop    r12
      e97ae2:	41 5d                	pop    r13
      e97ae4:	41 5e                	pop    r14
      e97ae6:	41 5f                	pop    r15
      e97ae8:	5d                   	pop    rbp
      e97ae9:	c3                   	ret
      e97aea:	48 8d 35 b3 ff 59 ff 	lea    rsi,[rip+0xffffffffff59ffb3]        # 437aa4 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5d4f3>
      e97af1:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e97af8:	00 
      e97af9:	e8 51 3d be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e97afe:	84 c0                	test   al,al
### 0xe98458: mov    rdi,QWORD PTR [r14+0x40]
      e983ff:	e8 82 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98404:	e9 dc 00 00 00       	jmp    e984e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8fb>
      e98409:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9840e:	48 8b bc 24 08 0a 00 	mov    rdi,QWORD PTR [rsp+0xa08]
      e98415:	00 
      e98416:	e8 6b 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9841b:	31 ff                	xor    edi,edi
      e9841d:	e8 64 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98422:	e9 be 00 00 00       	jmp    e984e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8fb>
      e98427:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9842c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e98433:	00 
      e98434:	e8 af 23 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98439:	4c 89 e7             	mov    rdi,r12
      e9843c:	e8 93 17 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98441:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
      e98448:	00 
      e98449:	e8 18 1a 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e9844e:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      e98453:	e8 d0 2b 7d 00       	call   166b028 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f194>
      e98458:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      e9845c:	e8 25 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98461:	48 8d 35 98 be 99 00 	lea    rsi,[rip+0x99be98]        # 1834300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6298>
      e98468:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e9846d:	e8 c4 a3 00 00       	call   ea2836 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69c4c>
      e98472:	4c 89 ff             	mov    rdi,r15
      e98475:	e8 0c 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9847a:	4c 89 f7             	mov    rdi,r14
      e9847d:	e8 8e 5b 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98482:	4c 89 f7             	mov    rdi,r14
      e98485:	e8 92 5f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9848a:	eb 59                	jmp    e984e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8fb>
      e9848c:	eb 52                	jmp    e984e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8f6>
      e9848e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98493:	4c 89 ff             	mov    rdi,r15
      e98496:	e8 cf 1a be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9849b:	eb 05                	jmp    e984a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8b8>
      e9849d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e984a2:	4c 89 f7             	mov    rdi,r14
      e984a5:	48 83 c7 38          	add    rdi,0x38
      e984a9:	e8 2c 0d 00 00       	call   e991da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x605f0>
      e984ae:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
      e984b2:	e8 cf 5f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e984b7:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e984be:	00 
      e984bf:	e8 a6 1a be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e984c4:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e984c9:	e8 b8 5f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e984ce:	4c 89 f7             	mov    rdi,r14
### 0xe98cea: mov    rdi,QWORD PTR [rbx+0x40]
      e98c9c:	00 
      e98c9d:	e8 e4 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ca2:	e9 f8 fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98ca7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cac:	e9 ee fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98cb1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cb6:	6a 20                	push   0x20
      e98cb8:	5b                   	pop    rbx
      e98cb9:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
      e98cc0:	00 
      e98cc1:	e8 c0 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98cc6:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      e98cca:	75 ed                	jne    e98cb9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600cf>
      e98ccc:	e9 ce fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98cd1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cd6:	4c 89 ff             	mov    rdi,r15
      e98cd9:	e8 12 34 f7 ff       	call   e0c0f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9176>
      e98cde:	eb 05                	jmp    e98ce5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600fb>
      e98ce0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98ce5:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
      e98cea:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e98cee:	e8 93 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98cf3:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
      e98cf7:	e8 8a 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98cfc:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
      e98d03:	00 
      e98d04:	e8 7d 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d09:	48 89 df             	mov    rdi,rbx
      e98d0c:	e8 ff 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d11:	48 89 df             	mov    rdi,rbx
      e98d14:	e8 03 57 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98d19:	eb 05                	jmp    e98d20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60136>
      e98d1b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d20:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
      e98d27:	00 
      e98d28:	e8 59 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d2d:	eb 22                	jmp    e98d51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60167>
      e98d2f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d34:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e98d3b:	00 
      e98d3c:	e8 45 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d41:	4c 89 f7             	mov    rdi,r14
      e98d44:	e8 c7 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d49:	4c 89 f7             	mov    rdi,r14
      e98d4c:	e8 cb 56 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98d51:	31 ff                	xor    edi,edi
      e98d53:	e8 2e 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d58:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e98d5d:	e8 24 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
### 0xe98d58: mov    rdi,QWORD PTR [rsp+0x40]
      e98d09:	48 89 df             	mov    rdi,rbx
      e98d0c:	e8 ff 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d11:	48 89 df             	mov    rdi,rbx
      e98d14:	e8 03 57 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98d19:	eb 05                	jmp    e98d20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60136>
      e98d1b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d20:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
      e98d27:	00 
      e98d28:	e8 59 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d2d:	eb 22                	jmp    e98d51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60167>
      e98d2f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d34:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e98d3b:	00 
      e98d3c:	e8 45 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d41:	4c 89 f7             	mov    rdi,r14
      e98d44:	e8 c7 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d49:	4c 89 f7             	mov    rdi,r14
      e98d4c:	e8 cb 56 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98d51:	31 ff                	xor    edi,edi
      e98d53:	e8 2e 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d58:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e98d5d:	e8 24 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d62:	e9 4c fa ff ff       	jmp    e987b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbc9>
      e98d67:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d6c:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e98d71:	eb e0                	jmp    e98d53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60169>
      e98d73:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d78:	e9 60 fa ff ff       	jmp    e987dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbf3>
      e98d7d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d82:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      e98d86:	e8 fb 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d8b:	48 89 df             	mov    rdi,rbx
      e98d8e:	e8 f3 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d93:	4c 89 f7             	mov    rdi,r14
      e98d96:	e8 75 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d9b:	4c 89 f7             	mov    rdi,r14
      e98d9e:	e8 79 56 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98da3:	31 db                	xor    ebx,ebx
      e98da5:	eb 05                	jmp    e98dac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x601c2>
      e98da7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98dac:	48 89 df             	mov    rdi,rbx
      e98daf:	e8 d2 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98db4:	eb 05                	jmp    e98dbb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x601d1>
      e98db6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98dbb:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]
      e98dc2:	00 
      e98dc3:	e8 be 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98dc8:	e9 1a fa ff ff       	jmp    e987e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbfd>
      e98dcd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
### 0xe98e02: mov    rdi,QWORD PTR [rsp+0x40]
      e98dac:	48 89 df             	mov    rdi,rbx
      e98daf:	e8 d2 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98db4:	eb 05                	jmp    e98dbb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x601d1>
      e98db6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98dbb:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]
      e98dc2:	00 
      e98dc3:	e8 be 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98dc8:	e9 1a fa ff ff       	jmp    e987e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbfd>
      e98dcd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98dd2:	e9 10 fa ff ff       	jmp    e987e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbfd>
      e98dd7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98ddc:	e9 20 fa ff ff       	jmp    e98801 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc17>
      e98de1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98de6:	4c 89 ff             	mov    rdi,r15
      e98de9:	e8 98 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98dee:	eb 05                	jmp    e98df5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6020b>
      e98df0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98df5:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
      e98dfc:	00 
      e98dfd:	e8 84 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98e02:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e98e07:	e8 7a 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98e0c:	e9 27 fa ff ff       	jmp    e98838 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc4e>
      e98e11:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e16:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98e1d:	00 
      e98e1e:	e8 85 0b 00 00       	call   e999a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60dbe>
      e98e23:	e9 10 fa ff ff       	jmp    e98838 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc4e>
      e98e28:	eb 05                	jmp    e98e2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60245>
      e98e2a:	4c 8b 7c 24 50       	mov    r15,QWORD PTR [rsp+0x50]
      e98e2f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e34:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98e3b:	00 
      e98e3c:	e8 a7 19 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98e41:	eb 39                	jmp    e98e7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60292>
      e98e43:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e48:	e9 f8 f9 ff ff       	jmp    e98845 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc5b>
      e98e4d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e52:	e9 fb f9 ff ff       	jmp    e98852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc68>
      e98e57:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e5c:	e9 fe f9 ff ff       	jmp    e9885f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc75>
      e98e61:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e66:	e9 01 fa ff ff       	jmp    e9886c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc82>
      e98e6b:	eb 00                	jmp    e98e6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60283>
      e98e6d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e72:	e9 27 fa ff ff       	jmp    e9889e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fcb4>
      e98e77:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e7c:	4c 8b b4 24 90 00 00 	mov    r14,QWORD PTR [rsp+0x90]
      e98e83:	00 
### 0xe98edb: mov    rdi,QWORD PTR [rsp+0x40]
      e98e77:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98e7c:	4c 8b b4 24 90 00 00 	mov    r14,QWORD PTR [rsp+0x90]
      e98e83:	00 
      e98e84:	4c 89 f3             	mov    rbx,r14
      e98e87:	48 81 c3 e8 00 00 00 	add    rbx,0xe8
      e98e8e:	49 8b be 40 01 00 00 	mov    rdi,QWORD PTR [r14+0x140]
      e98e95:	e8 ec 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98e9a:	49 8b be 30 01 00 00 	mov    rdi,QWORD PTR [r14+0x130]
      e98ea1:	e8 e0 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ea6:	49 8b be 20 01 00 00 	mov    rdi,QWORD PTR [r14+0x120]
      e98ead:	e8 d4 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98eb2:	48 89 df             	mov    rdi,rbx
      e98eb5:	e8 2e 27 be ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
      e98eba:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e98ebf:	e8 a6 10 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98ec4:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e98ec9:	e8 06 0d 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98ece:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
      e98ed5:	00 
      e98ed6:	e8 f9 0c 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98edb:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e98ee0:	e8 ef 0c 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98ee5:	4c 89 ff             	mov    rdi,r15
      e98ee8:	e8 e7 0c 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98eed:	31 ff                	xor    edi,edi
      e98eef:	e8 92 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ef4:	31 ff                	xor    edi,edi
      e98ef6:	e8 8b 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98efb:	31 ff                	xor    edi,edi
      e98efd:	e8 84 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98f02:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e98f09:	00 
      e98f0a:	e8 5b 10 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98f0f:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      e98f16:	00 
      e98f17:	e8 6a 55 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98f1c:	4c 89 f7             	mov    rdi,r14
      e98f1f:	e8 ec 50 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98f24:	4c 89 f7             	mov    rdi,r14
      e98f27:	e8 f0 54 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98f2c:	e9 14 f9 ff ff       	jmp    e98845 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc5b>
      e98f31:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98f36:	e9 fd f8 ff ff       	jmp    e98838 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fc4e>

## Hits containing +0x58]
### 0xe94ea2: and    QWORD PTR [r12+0x58],0x0
      e94e47:	e8 b4 90 95 00       	call   17edf00 <_Znwm@plt>
      e94e4c:	49 89 c4             	mov    r12,rax
      e94e4f:	66 0f ef c0          	pxor   xmm0,xmm0
      e94e53:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94e58:	48 8d 05 b9 f9 9a 00 	lea    rax,[rip+0x9af9b9]        # 1844818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf00>
      e94e5f:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e94e63:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
      e94e6a:	00 
      e94e6b:	48 8d b4 24 90 0e 00 	lea    rsi,[rsp+0xe90]
      e94e72:	00 
      e94e73:	4c 89 ef             	mov    rdi,r13
      e94e76:	e8 75 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94e7b:	48 8d 05 ce f9 9a 00 	lea    rax,[rip+0x9af9ce]        # 1844850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf38>
      e94e82:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      e94e87:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94e8e:	00 f0 3f 
      e94e91:	49 89 44 24 28       	mov    QWORD PTR [r12+0x28],rax
      e94e96:	31 c0                	xor    eax,eax
      e94e98:	41 88 44 24 30       	mov    BYTE PTR [r12+0x30],al
      e94e9d:	41 88 44 24 40       	mov    BYTE PTR [r12+0x40],al
      e94ea2:	49 83 64 24 58 00    	and    QWORD PTR [r12+0x58],0x0
      e94ea8:	66 0f ef c0          	pxor   xmm0,xmm0
      e94eac:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e94eb3:	41 88 44 24 70       	mov    BYTE PTR [r12+0x70],al
      e94eb8:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e94ebf:	00 
      e94ec0:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
      e94ec5:	4c 89 ee             	mov    rsi,r13
      e94ec8:	e8 23 30 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ecd:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
      e94ed4:	00 00 
      e94ed6:	49 89 9c 24 b0 00 00 	mov    QWORD PTR [r12+0xb0],rbx
      e94edd:	00 
      e94ede:	4d 89 bc 24 b8 00 00 	mov    QWORD PTR [r12+0xb8],r15
      e94ee5:	00 
      e94ee6:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
      e94eed:	00 
      e94eee:	48 89 df             	mov    rdi,rbx
      e94ef1:	e8 0c 4f 94 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e94ef6:	4d 8d 6c 24 20       	lea    r13,[r12+0x20]
      e94efb:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e94f00:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e94f07:	00 
      e94f08:	49 8d 84 24 b0 00 00 	lea    rax,[r12+0xb0]
      e94f0f:	00 
      e94f10:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      e94f17:	00 
      e94f18:	49 8d 84 24 b8 00 00 	lea    rax,[r12+0xb8]
      e94f1f:	00 
### 0xe955e0: mov    rax,QWORD PTR [rsp+0x58]
      e95596:	00 
      e95597:	4c 8d b4 24 30 0a 00 	lea    r14,[rsp+0xa30]
      e9559e:	00 
      e9559f:	48 89 df             	mov    rdi,rbx
      e955a2:	4c 89 f6             	mov    rsi,r14
      e955a5:	e8 0a a9 83 00       	call   16cfeb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84020>
      e955aa:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
      e955b1:	48 89 de             	mov    rsi,rbx
      e955b4:	e8 63 42 c2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      e955b9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e955bd:	e8 c4 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e955c2:	4c 89 f7             	mov    rdi,r14
      e955c5:	e8 7e f2 c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
      e955ca:	6a 20                	push   0x20
      e955cc:	5b                   	pop    rbx
      e955cd:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
      e955d4:	00 
      e955d5:	e8 ac 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e955da:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      e955de:	75 ed                	jne    e955cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c9e3>
      e955e0:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
      e955e5:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e955e9:	49 8b bf 98 00 00 00 	mov    rdi,QWORD PTR [r15+0x98]
      e955f0:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      e955f7:	00 00 
      e955f9:	f3 41 0f 7f 87 90 00 	movdqu XMMWORD PTR [r15+0x90],xmm0
      e95600:	00 00 
      e95602:	e8 7f 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95607:	49 8b b4 24 b8 03 00 	mov    rsi,QWORD PTR [r12+0x3b8]
      e9560e:	00 
      e9560f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e95612:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e95619:	00 
      e9561a:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e9561d:	4d 8b b4 24 e8 00 00 	mov    r14,QWORD PTR [r12+0xe8]
      e95624:	00 
      e95625:	bf 00 01 00 00       	mov    edi,0x100
      e9562a:	e8 d1 88 95 00       	call   17edf00 <_Znwm@plt>
      e9562f:	49 89 c4             	mov    r12,rax
      e95632:	48 89 ac 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbp
      e95639:	00 
      e9563a:	4c 89 ac 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],r13
      e95641:	00 
      e95642:	66 0f ef c9          	pxor   xmm1,xmm1
      e95646:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
      e9564b:	48 8d 05 16 7e 96 00 	lea    rax,[rip+0x967e16]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e95652:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e95656:	66 0f 6f 84 24 10 0e 	movdqa xmm0,XMMWORD PTR [rsp+0xe10]
      e9565d:	00 00 
### 0xe956cd: movdqu XMMWORD PTR [r12+0x58],xmm0
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
      e956b7:	e8 d4 87 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e956bc:	49 8d 44 24 48       	lea    rax,[r12+0x48]
      e956c1:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      e956c8:	00 
      e956c9:	66 0f ef c0          	pxor   xmm0,xmm0
      e956cd:	f3 41 0f 7f 44 24 58 	movdqu XMMWORD PTR [r12+0x58],xmm0
      e956d4:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e956db:	bd 00 00 80 3f       	mov    ebp,0x3f800000
      e956e0:	41 89 6c 24 68       	mov    DWORD PTR [r12+0x68],ebp
      e956e5:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e956ea:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      e956ef:	e8 02 43 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e956f4:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e956fb:	00 
      e956fc:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
      e95703:	00 
      e95704:	e8 85 2b c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e95709:	4d 89 e6             	mov    r14,r12
      e9570c:	49 81 c6 d8 00 00 00 	add    r14,0xd8
      e95713:	66 0f ef c0          	pxor   xmm0,xmm0
      e95717:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0xe8],xmm0
      e9571e:	00 00 00 
      e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
      e95728:	00 00 00 
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e95732:	00 
      e95733:	48 8d 05 de c4 5b ff 	lea    rax,[rip+0xffffffffff5bc4de]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e9573a:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e95741:	00 
      e95742:	48 89 06             	mov    QWORD PTR [rsi],rax
      e95745:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e95749:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
      e95752:	48 8d 05 0b 6d be ff 	lea    rax,[rip+0xffffffffffbe6d0b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
### 0xe95775: mov    QWORD PTR [rsp+0x58],rbx
      e95717:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0xe8],xmm0
      e9571e:	00 00 00 
      e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
      e95728:	00 00 00 
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e95732:	00 
      e95733:	48 8d 05 de c4 5b ff 	lea    rax,[rip+0xffffffffff5bc4de]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      e9573a:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
      e95741:	00 
      e95742:	48 89 06             	mov    QWORD PTR [rsi],rax
      e95745:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e95749:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
      e95752:	48 8d 05 0b 6d be ff 	lea    rax,[rip+0xffffffffffbe6d0b]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e95759:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e9575d:	48 8d 05 ce d5 02 00 	lea    rax,[rip+0x2d5ce]        # ec2d32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a148>
      e95764:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      e95768:	4c 8d ac 24 e0 0b 00 	lea    r13,[rsp+0xbe0]
      e9576f:	00 
      e95770:	b9 60 ea 00 00       	mov    ecx,0xea60
      e95775:	48 89 5c 24 58       	mov    QWORD PTR [rsp+0x58],rbx
      e9577a:	48 89 df             	mov    rdi,rbx
      e9577d:	4c 89 fb             	mov    rbx,r15
      e95780:	4c 89 ea             	mov    rdx,r13
      e95783:	e8 fc c0 92 00       	call   17c1884 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1759f0>
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
### 0xe958e6: mov    QWORD PTR [rsp+0x58],rbp
      e95892:	e8 85 8b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e95897:	31 ff                	xor    edi,edi
      e95899:	e8 e8 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9589e:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e958a5:	00 
      e958a6:	e8 db 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e958ab:	48 8d b3 30 02 00 00 	lea    rsi,[rbx+0x230]
      e958b2:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      e958b9:	00 
      e958ba:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
      e958c1:	00 
      e958c2:	e8 f7 63 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e958c7:	6a 50                	push   0x50
      e958c9:	5f                   	pop    rdi
      e958ca:	e8 31 86 95 00       	call   17edf00 <_Znwm@plt>
      e958cf:	48 89 c5             	mov    rbp,rax
      e958d2:	66 0f ef c0          	pxor   xmm0,xmm0
      e958d6:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e958db:	48 8d 05 46 ba 96 00 	lea    rax,[rip+0x96ba46]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
      e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f0:	4c 89 f8             	mov    rax,r15
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
      e9590d:	00 
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
      e95919:	00 
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
      e95928:	00 
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
      e95937:	00 
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
      e95947:	00 
      e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      e9594c:	48 89 8c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rcx
      e95953:	00 
      e95954:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e9595b:	00 
      e9595c:	4c 89 bc 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r15
### 0xe95d41: mov    rdi,QWORD PTR [rsp+0x58]
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
### 0xe96493: mov    rax,QWORD PTR [r14+0x58]
      e9642f:	00 
      e96430:	41 0f 28 46 e0       	movaps xmm0,XMMWORD PTR [r14-0x20]
      e96435:	0f 29 83 30 01 00 00 	movaps XMMWORD PTR [rbx+0x130],xmm0
      e9643c:	49 8b 46 f0          	mov    rax,QWORD PTR [r14-0x10]
      e96440:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
      e96447:	0f 57 c0             	xorps  xmm0,xmm0
      e9644a:	41 0f 11 46 e8       	movups XMMWORD PTR [r14-0x18],xmm0
      e9644f:	48 89 df             	mov    rdi,rbx
      e96452:	48 81 c7 50 01 00 00 	add    rdi,0x150
      e96459:	4c 89 f6             	mov    rsi,r14
      e9645c:	e8 cb 65 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e96461:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      e96465:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
      e9646c:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
      e96471:	0f 29 83 80 01 00 00 	movaps XMMWORD PTR [rbx+0x180],xmm0
      e96478:	66 0f ef c9          	pxor   xmm1,xmm1
      e9647c:	66 41 0f 7f 4e 30    	movdqa XMMWORD PTR [r14+0x30],xmm1
      e96482:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
      e96487:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
      e9648c:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      e96493:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      e96497:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      e9649e:	0f 57 c0             	xorps  xmm0,xmm0
      e964a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e964a6:	66 41 0f 7f 4e 50    	movdqa XMMWORD PTR [r14+0x50],xmm1
      e964ac:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
      e964b1:	0f 29 83 b0 01 00 00 	movaps XMMWORD PTR [rbx+0x1b0],xmm0
      e964b8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e964bf:	00 
      e964c0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e964c4:	48 89 9c 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rbx
      e964cb:	00 
      e964cc:	e8 f9 3d be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e964d1:	48 8d 84 24 20 06 00 	lea    rax,[rsp+0x620]
      e964d8:	00 
      e964d9:	48 8d 0d 00 84 97 00 	lea    rcx,[rip+0x978400]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
      e964f9:	00 
      e964fa:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e964fe:	4d 8b a5 28 04 00 00 	mov    r12,QWORD PTR [r13+0x428]
      e96505:	41 0f 28 85 70 04 00 	movaps xmm0,XMMWORD PTR [r13+0x470]
      e9650c:	00 
      e9650d:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      e96514:	00 
      e96515:	49 8b 9d 78 04 00 00 	mov    rbx,QWORD PTR [r13+0x478]
### 0xe96e98: mov    rbx,QWORD PTR [rsp+0x58]
      e96e42:	00 
      e96e43:	4c 89 fe             	mov    rsi,r15
      e96e46:	4c 89 e2             	mov    rdx,r12
      e96e49:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
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
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
### 0xe9714b: movups XMMWORD PTR [r14+0x58],xmm0
      e970fd:	48 8b 84 24 38 03 00 	mov    rax,QWORD PTR [rsp+0x338]
      e97104:	00 
      e97105:	0f 28 84 24 30 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x330]
      e9710c:	00 
      e9710d:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
      e97112:	48 85 c0             	test   rax,rax
      e97115:	74 05                	je     e9711c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e532>
      e97117:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9711c:	48 8b 84 24 48 03 00 	mov    rax,QWORD PTR [rsp+0x348]
      e97123:	00 
      e97124:	0f 28 84 24 40 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x340]
      e9712b:	00 
      e9712c:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
      e97131:	48 85 c0             	test   rax,rax
      e97134:	74 05                	je     e9713b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e551>
      e97136:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9713b:	48 8b 84 24 58 03 00 	mov    rax,QWORD PTR [rsp+0x358]
      e97142:	00 
      e97143:	0f 28 84 24 50 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x350]
      e9714a:	00 
      e9714b:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      e97150:	48 85 c0             	test   rax,rax
      e97153:	74 05                	je     e9715a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e570>
      e97155:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9715a:	48 8b 84 24 68 03 00 	mov    rax,QWORD PTR [rsp+0x368]
      e97161:	00 
      e97162:	0f 28 84 24 60 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x360]
      e97169:	00 
      e9716a:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
      e9716f:	48 85 c0             	test   rax,rax
      e97172:	74 05                	je     e97179 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e58f>
      e97174:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e97179:	48 8b 84 24 78 03 00 	mov    rax,QWORD PTR [rsp+0x378]
      e97180:	00 
      e97181:	66 0f 6f 84 24 70 03 	movdqa xmm0,XMMWORD PTR [rsp+0x370]
      e97188:	00 00 
      e9718a:	f3 41 0f 7f 46 78    	movdqu XMMWORD PTR [r14+0x78],xmm0
      e97190:	48 85 c0             	test   rax,rax
      e97193:	74 05                	je     e9719a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e5b0>
      e97195:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9719a:	4d 8d be 90 00 00 00 	lea    r15,[r14+0x90]
      e971a1:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e971a8:	00 
      e971a9:	4c 89 ff             	mov    rdi,r15
      e971ac:	e8 df 30 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e971b1:	49 8d be c0 00 00 00 	lea    rdi,[r14+0xc0]
      e971b8:	48 8d b4 24 00 08 00 	lea    rsi,[rsp+0x800]
      e971bf:	00 
      e971c0:	e8 7b 6d 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
### 0xe97982: mov    rdi,QWORD PTR [rsp+0x58]
      e9792c:	48 8b bc 24 28 06 00 	mov    rdi,QWORD PTR [rsp+0x628]
      e97933:	00 
      e97934:	e8 4d 6b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97939:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e97940:	00 
      e97941:	e8 4a 65 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e97946:	4c 89 ef             	mov    rdi,r13
      e97949:	e8 38 6b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9794e:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e97955:	00 
      e97956:	e8 23 ac 00 00       	call   ea257e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69994>
      e9795b:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e97962:	00 
      e97963:	e8 88 ac 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e97968:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
      e9796f:	00 
      e97970:	e8 1b 65 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e97975:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e9797c:	00 
      e9797d:	e8 ec 08 cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e97982:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e97987:	e8 fa 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9798c:	48 8b bc 24 f8 02 00 	mov    rdi,QWORD PTR [rsp+0x2f8]
      e97993:	00 
      e97994:	e8 ed 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e97999:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e979a0:	00 
      e979a1:	e8 e0 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979a6:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      e979ab:	e8 d6 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979b0:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e979b7:	00 
      e979b8:	e8 65 61 c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e979bd:	48 8b bc 24 28 03 00 	mov    rdi,QWORD PTR [rsp+0x328]
      e979c4:	00 
      e979c5:	e8 bc 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979ca:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
      e979d1:	00 
      e979d2:	e8 af 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979d7:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e979dc:	e8 a5 6a c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e979e1:	48 8d bc 24 c0 0e 00 	lea    rdi,[rsp+0xec0]
      e979e8:	00 
      e979e9:	e8 7c 25 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e979ee:	48 8d bc 24 f0 0e 00 	lea    rdi,[rsp+0xef0]
      e979f5:	00 
      e979f6:	e8 6f 25 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e979fb:	66 0f 6f 84 24 90 01 	movdqa xmm0,XMMWORD PTR [rsp+0x190]
      e97a02:	00 00 
### 0xe9877b: mov    rdi,QWORD PTR [rsp+0x58]
      e98727:	00 
      e98728:	e8 51 9e 00 00       	call   ea257e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69994>
      e9872d:	48 8d bc 24 00 0a 00 	lea    rdi,[rsp+0xa00]
      e98734:	00 
      e98735:	e8 30 18 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9873a:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
      e98741:	00 
      e98742:	e8 a9 9e 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e98747:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e9874e:	00 
      e9874f:	e8 2a 9e 00 00       	call   ea257e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69994>
      e98754:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9875b:	00 
      e9875c:	e8 8f 9e 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e98761:	48 8d bc 24 a8 02 00 	lea    rdi,[rsp+0x2a8]
      e98768:	00 
      e98769:	e8 22 57 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e9876e:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
      e98775:	00 
      e98776:	e8 f3 fa ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e9877b:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e98780:	e8 01 5d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98785:	48 8b bc 24 f8 02 00 	mov    rdi,QWORD PTR [rsp+0x2f8]
      e9878c:	00 
      e9878d:	e8 f4 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98792:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e98799:	00 
      e9879a:	e8 e7 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9879f:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      e987a4:	e8 db 09 00 00       	call   e99184 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6059a>
      e987a9:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      e987ae:	e8 d3 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987b3:	4c 8b a4 24 28 03 00 	mov    r12,QWORD PTR [rsp+0x328]
      e987ba:	00 
      e987bb:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
      e987c2:	00 
      e987c3:	e8 5a 53 c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e987c8:	4c 89 e7             	mov    rdi,r12
      e987cb:	e8 b6 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987d0:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
      e987d7:	00 
      e987d8:	e8 a9 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987dd:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e987e2:	e8 9f 5c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e987e7:	48 8d bc 24 c0 0e 00 	lea    rdi,[rsp+0xec0]
      e987ee:	00 
      e987ef:	e8 76 17 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e987f4:	48 8d bc 24 f0 0e 00 	lea    rdi,[rsp+0xef0]
      e987fb:	00 
### 0xe98b19: mov    rdi,QWORD PTR [rsp+0x58]
      e98aba:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98abf:	48 8d bc 24 a0 0c 00 	lea    rdi,[rsp+0xca0]
      e98ac6:	00 
      e98ac7:	e8 9e 14 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98acc:	eb 05                	jmp    e98ad3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fee9>
      e98ace:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98ad3:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e98ada:	00 
      e98adb:	48 8b bb b8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb8]
      e98ae2:	e8 9f 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ae7:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
      e98aee:	e8 93 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98af3:	48 89 df             	mov    rdi,rbx
      e98af6:	e8 73 f7 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      e98afb:	e9 61 fc ff ff       	jmp    e98761 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb77>
      e98b00:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b05:	e9 57 fc ff ff       	jmp    e98761 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb77>
      e98b0a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b0f:	e9 5a fc ff ff       	jmp    e9876e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb84>
      e98b14:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b19:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e98b1e:	e8 63 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98b23:	48 8b bc 24 d8 02 00 	mov    rdi,QWORD PTR [rsp+0x2d8]
      e98b2a:	00 
      e98b2b:	e8 56 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98b30:	66 0f 6f 84 24 c0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1c0]
      e98b37:	00 00 
      e98b39:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e98b40:	e8 41 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98b45:	48 8b bc 24 e8 02 00 	mov    rdi,QWORD PTR [rsp+0x2e8]
      e98b4c:	00 
      e98b4d:	e8 34 59 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98b52:	48 8b bc 24 10 10 00 	mov    rdi,QWORD PTR [rsp+0x1010]
      e98b59:	00 
      e98b5a:	48 85 ff             	test   rdi,rdi
      e98b5d:	74 0d                	je     e98b6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ff82>
      e98b5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e98b62:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e98b65:	eb 05                	jmp    e98b6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ff82>
      e98b67:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98b6c:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
      e98b73:	00 
      e98b74:	e8 f1 13 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e98b79:	4c 8b b4 24 58 10 00 	mov    r14,QWORD PTR [rsp+0x1058]
      e98b80:	00 
      e98b81:	4c 8b bc 24 38 0a 00 	mov    r15,QWORD PTR [rsp+0xa38]
      e98b88:	00 
      e98b89:	eb 0a                	jmp    e98b95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ffab>
      e98b8b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
### 0xe98c5c: mov    rdi,QWORD PTR [rsp+0x58]
      e98c0a:	45 31 e4             	xor    r12d,r12d
      e98c0d:	eb 05                	jmp    e98c14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6002a>
      e98c0f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c14:	4c 89 e7             	mov    rdi,r12
      e98c17:	e8 6a 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c1c:	eb 77                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c1e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c23:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98c2a:	00 
      e98c2b:	e8 b8 1b 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98c30:	4c 89 f7             	mov    rdi,r14
      e98c33:	e8 be a2 02 00       	call   ec2ef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a30c>
      e98c38:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e98c3f:	00 
      e98c40:	e8 21 12 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e98c45:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e98c4a:	e8 85 0f 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98c4f:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e98c56:	00 
      e98c57:	e8 e4 a2 02 00       	call   ec2f40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a356>
      e98c5c:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e98c61:	e8 e0 8a 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      e98c66:	eb 05                	jmp    e98c6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60083>
      e98c68:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c6d:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      e98c72:	e8 0f 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c77:	31 ff                	xor    edi,edi
      e98c79:	e8 08 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c7e:	4c 89 e7             	mov    rdi,r12
      e98c81:	e8 8a 53 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98c86:	4c 89 e7             	mov    rdi,r12
      e98c89:	e8 8e 57 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98c8e:	eb 05                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c90:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c95:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e98c9c:	00 
      e98c9d:	e8 e4 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ca2:	e9 f8 fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98ca7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cac:	e9 ee fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98cb1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cb6:	6a 20                	push   0x20
      e98cb8:	5b                   	pop    rbx
      e98cb9:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
      e98cc0:	00 
      e98cc1:	e8 c0 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98cc6:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      e98cca:	75 ed                	jne    e98cb9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600cf>
      e98ccc:	e9 ce fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>

## Simple straight-line taint from carrier loads
### carrier reload 0xe94b93
- 0xe94b93 [carrier-load] mov    r14,QWORD PTR [rsp+0x48]
- 0xe94b98 [carrier+0x18] lea    rax,[r14+0x18]
- 0xe94ba1 [carrier+0x8] lea    rax,[r14+0x8]
### carrier reload 0xe94f68
- 0xe94f68 [carrier-load] mov    r15,QWORD PTR [rsp+0x48]
- 0xe94fbf [call/barrier] call   1008afe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cff14>
### carrier reload 0xe951d3
- 0xe951d3 [carrier-load] mov    rax,QWORD PTR [rsp+0x48]
- 0xe951df [call/barrier] call   ec7c18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f02e>
### carrier reload 0xe954e4
- 0xe954e4 [carrier-load] mov    rbx,QWORD PTR [rsp+0x48]
### carrier reload 0xe979d7
- 0xe979d7 [carrier-load] mov    rdi,QWORD PTR [rsp+0x48]
- 0xe979dc [call/barrier] call   a9e486 <JNI_OnUnload@@Base+0x25d53>
### carrier reload 0xe9822a
- 0xe9822a [carrier-load] mov    rdi,QWORD PTR [rsp+0x48]
- 0xe9822f [call/barrier] call   a9e486 <JNI_OnUnload@@Base+0x25d53>
### carrier reload 0xe987dd
- 0xe987dd [carrier-load] mov    rdi,QWORD PTR [rsp+0x48]
- 0xe987e2 [call/barrier] call   a9e486 <JNI_OnUnload@@Base+0x25d53>
### carrier reload 0xe98b90
- 0xe98b90 [carrier-load] mov    r14,QWORD PTR [rsp+0x48]
- 0xe98b9d [call/barrier] call   a79f6a <JNI_OnUnload@@Base+0x1837>
### carrier reload 0xe98ba9
- 0xe98ba9 [carrier-load] mov    r14,QWORD PTR [rsp+0x48]
- 0xe98bb6 [call/barrier] call   a79f6a <JNI_OnUnload@@Base+0x1837>
### carrier reload 0xe98d6c
- 0xe98d6c [carrier-load] mov    rdi,QWORD PTR [rsp+0x48]
