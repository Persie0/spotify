# e99d07 argument 13 source

Proven: e99d07 rsp+0x1270 = arg13; caller 0xe95d02 reads stable rsp+0x88.

## Normalized stable rsp+0x88 accesses in push sequence
### WRITE 0xe95d02: raw=0x1d0, delta=0x148: push   QWORD PTR [rsp+0x1d0]
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

## Literal rsp+0x88 accesses before variable pushes
### WRITE 0xe94bcf: mov    BYTE PTR [rsp+0x88],bpl
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

### READ 0xe94f7a: mov    al,BYTE PTR [rsp+0x88]
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

### WRITE 0xe95197: mov    QWORD PTR [rsp+0x88],rax
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
      e95214:	66 0f ef c0          	pxor   xmm0,xmm0
      e95218:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9521d:	48 8d 0d a4 c1 99 00 	lea    rcx,[rip+0x99c1a4]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e95224:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      e95227:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9522b:	48 8d 05 2e da 99 00 	lea    rax,[rip+0x99da2e]        # 1832c60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4bf8>
      e95232:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e95236:	48 c7 43 20 32 00 00 	mov    QWORD PTR [rbx+0x20],0x32

### READ 0xe952cf: mov    r14,QWORD PTR [rsp+0x88]
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
      e95300:	eb 44                	jmp    e95346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c75c>
      e95302:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
      e95309:	00 
      e9530a:	4d 89 28             	mov    QWORD PTR [r8],r13
      e9530d:	48 8d 35 7d 7d c0 ff 	lea    rsi,[rip+0xffffffffffc07d7d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e95314:	48 8d 0d 95 10 03 00 	lea    rcx,[rip+0x31095]        # ec63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d7c6>
      e9531b:	48 8d 9c 24 d0 0f 00 	lea    rbx,[rsp+0xfd0]
      e95322:	00 
      e95323:	6a 08                	push   0x8
      e95325:	41 59                	pop    r9
      e95327:	48 89 df             	mov    rdi,rbx
      e9532a:	31 d2                	xor    edx,edx
      e9532c:	e8 63 54 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e95331:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      e95335:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e9533c:	00 
      e9533d:	4c 89 e6             	mov    rsi,r12
      e95340:	48 89 da             	mov    rdx,rbx
      e95343:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e95346:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      e9534b:	4c 8d 60 78          	lea    r12,[rax+0x78]
      e9534f:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e95356:	00 
      e95357:	4c 89 e7             	mov    rdi,r12
      e9535a:	48 89 de             	mov    rsi,rbx

### WRITE 0xe95578: mov    QWORD PTR [rsp+0x88],rcx
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

## Nearby +0x80/+0x88/+0x90 accesses before push sequence
### 0xe93412: movdqa XMMWORD PTR [rsp+0x90],xmm1
      e933e4:	4c 89 73 60          	mov    QWORD PTR [rbx+0x60],r14
      e933e8:	48 83 7b 50 00       	cmp    QWORD PTR [rbx+0x50],0x0
      e933ed:	0f 84 8e 47 00 00    	je     e97b81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ef97>
      e933f3:	4c 8d 6b 08          	lea    r13,[rbx+0x8]
      e933f7:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e933fe:	00 
      e933ff:	e8 66 6b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e93404:	66 48 0f 6e c3       	movq   xmm0,rbx
      e93409:	66 49 0f 6e cc       	movq   xmm1,r12
      e9340e:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e93412:	66 0f 7f 8c 24 90 00 	movdqa XMMWORD PTR [rsp+0x90],xmm1
      e93419:	00 00 
      e9341b:	66 0f 7f 8c 24 80 03 	movdqa XMMWORD PTR [rsp+0x380],xmm1
      e93422:	00 00 
      e93424:	31 db                	xor    ebx,ebx
      e93426:	31 ff                	xor    edi,edi
      e93428:	e8 59 b0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9342d:	31 ff                	xor    edi,edi
      e9342f:	e8 52 b0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e93434:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e9343b:	00 
      e9343c:	e8 73 62 00 00       	call   e996b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60aca>
      e93441:	48 8d bc 24 20 0f 00 	lea    rdi,[rsp+0xf20]
      e93448:	00 
      e93449:	e8 1c 6b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9344e:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]
      e93455:	00 
      e93456:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]

### 0xe93495: movdqa xmm0,XMMWORD PTR [rsp+0x90]
      e9346d:	48 89 c3             	mov    rbx,rax
      e93470:	66 0f ef c0          	pxor   xmm0,xmm0
      e93474:	48 83 a4 24 20 0e 00 	and    QWORD PTR [rsp+0xe20],0x0
      e9347b:	00 00 
      e9347d:	66 0f 7f 84 24 10 0e 	movdqa XMMWORD PTR [rsp+0xe10],xmm0
      e93484:	00 00 
      e93486:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
      e9348d:	00 
      e9348e:	4d 89 30             	mov    QWORD PTR [r8],r14
      e93491:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
      e93495:	66 0f 6f 84 24 90 00 	movdqa xmm0,XMMWORD PTR [rsp+0x90]
      e9349c:	00 00 
      e9349e:	f3 41 0f 7f 40 10    	movdqu XMMWORD PTR [r8+0x10],xmm0
      e934a4:	f0 49 ff 45 00       	lock inc QWORD PTR [r13+0x0]
      e934a9:	48 8d 35 a2 6b f6 ff 	lea    rsi,[rip+0xfffffffffff66ba2]        # dfa052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc70d8>
      e934b0:	48 8d 15 cf 6b f6 ff 	lea    rdx,[rip+0xfffffffffff66bcf]        # dfa086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc710c>
      e934b7:	48 8d 0d 2c 62 00 00 	lea    rcx,[rip+0x622c]        # e996ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60b00>
      e934be:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
      e934c5:	00 
      e934c6:	6a 20                	push   0x20
      e934c8:	41 59                	pop    r9
      e934ca:	4c 89 ff             	mov    rdi,r15
      e934cd:	e8 c2 72 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e934d2:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e934d5:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e934dc:	00 
      e934dd:	4c 89 f6             	mov    rsi,r14
      e934e0:	4c 89 fa             	mov    rdx,r15

### 0xe93535: movdqa xmm0,XMMWORD PTR [rsp+0x90]
      e9350a:	e8 77 af c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9350f:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e93516:	00 
      e93517:	e8 cc 72 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e9351c:	4c 8d a4 24 30 0a 00 	lea    r12,[rsp+0xa30]
      e93523:	00 
      e93524:	4c 89 e7             	mov    rdi,r12
      e93527:	e8 98 73 f6 ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
      e9352c:	4d 89 34 24          	mov    QWORD PTR [r12],r14
      e93530:	49 89 5c 24 08       	mov    QWORD PTR [r12+0x8],rbx
      e93535:	66 0f 6f 84 24 90 00 	movdqa xmm0,XMMWORD PTR [rsp+0x90]
      e9353c:	00 00 
      e9353e:	f3 41 0f 7f 44 24 10 	movdqu XMMWORD PTR [r12+0x10],xmm0
      e93545:	f0 49 ff 45 00       	lock inc QWORD PTR [r13+0x0]
      e9354a:	48 8d 35 01 6b f6 ff 	lea    rsi,[rip+0xfffffffffff66b01]        # dfa052 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc70d8>
      e93551:	48 8d 15 2e 6b f6 ff 	lea    rdx,[rip+0xfffffffffff66b2e]        # dfa086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc710c>
      e93558:	48 8d 0d 63 62 00 00 	lea    rcx,[rip+0x6263]        # e997c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60bd8>
      e9355f:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
      e93566:	00 
      e93567:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
      e9356e:	00 
      e9356f:	6a 20                	push   0x20
      e93571:	41 59                	pop    r9
      e93573:	48 89 df             	mov    rdi,rbx
      e93576:	e8 19 72 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e9357b:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e9357e:	4c 89 ff             	mov    rdi,r15
      e93581:	4c 89 f6             	mov    rsi,r14

### 0xe937f4: mov    QWORD PTR [rsp+0x90],rdi
      e937c4:	4c 8d 7b 50          	lea    r15,[rbx+0x50]
      e937c8:	4c 89 ff             	mov    rdi,r15
      e937cb:	e8 26 62 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e937d0:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
      e937d7:	66 0f ef c0          	pxor   xmm0,xmm0
      e937db:	f3 0f 7f 83 80 00 00 	movdqu XMMWORD PTR [rbx+0x80],xmm0
      e937e2:	00 
      e937e3:	f3 0f 7f 43 70       	movdqu XMMWORD PTR [rbx+0x70],xmm0
      e937e8:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0
      e937ed:	c6 83 90 00 00 00 00 	mov    BYTE PTR [rbx+0x90],0x0
      e937f4:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
      e937fb:	00 
      e937fc:	e8 8d 4a c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      e93801:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e93808:	00 
      e93809:	4c 89 26             	mov    QWORD PTR [rsi],r12
      e9380c:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]
      e93810:	48 8d ac 24 e0 0b 00 	lea    rbp,[rsp+0xbe0]
      e93817:	00 
      e93818:	48 89 ef             	mov    rdi,rbp
      e9381b:	e8 c2 b0 15 00       	call   fee8e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b5cf8>
      e93820:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e93824:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
      e9382b:	00 
      e9382c:	4c 89 ee             	mov    rsi,r13
      e9382f:	48 89 ea             	mov    rdx,rbp
      e93832:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e93835:	4c 8d ac 24 30 0a 00 	lea    r13,[rsp+0xa30]

### 0xe93dfa: mov    QWORD PTR [rsp+0x90],rax
      e93dd1:	49 89 d4             	mov    r12,rdx
      e93dd4:	49 83 c4 18          	add    r12,0x18
      e93dd8:	48 8b b4 24 70 01 00 	mov    rsi,QWORD PTR [rsp+0x170]
      e93ddf:	00 
      e93de0:	49 89 f6             	mov    r14,rsi
      e93de3:	49 83 c6 18          	add    r14,0x18
      e93de7:	66 0f ef c0          	pxor   xmm0,xmm0
      e93deb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e93df0:	48 8d 0d e9 dc 99 00 	lea    rcx,[rip+0x99dce9]        # 1831ae0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a78>
      e93df7:	48 89 08             	mov    QWORD PTR [rax],rcx
      e93dfa:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      e93e01:	00 
      e93e02:	48 83 c0 20          	add    rax,0x20
      e93e06:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      e93e0b:	48 8d 05 06 dd 99 00 	lea    rax,[rip+0x99dd06]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
      e93e12:	45 84 ff             	test   r15b,r15b
      e93e15:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
      e93e1a:	74 27                	je     e93e43 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b259>
      e93e1c:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e93e23:	00 
      e93e24:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e93e29:	48 89 84 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],rax
      e93e30:	00 
      e93e31:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
      e93e38:	00 
      e93e39:	48 89 84 24 40 0a 00 	mov    QWORD PTR [rsp+0xa40],rax
      e93e40:	00 
      e93e41:	eb 2f                	jmp    e93e72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b288>

### 0xe93eac: mov    rbp,QWORD PTR [rsp+0x90]
      e93e7e:	48 89 ac 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rbp
      e93e85:	00 
      e93e86:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
      e93e8a:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e93e8e:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      e93e93:	48 8b 9c 24 78 01 00 	mov    rbx,QWORD PTR [rsp+0x178]
      e93e9a:	00 
      e93e9b:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e93ea0:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
      e93ea5:	48 8d 05 04 fe 9a 00 	lea    rax,[rip+0x9afe04]        # 1843cb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x398>
      e93eac:	48 8b ac 24 90 00 00 	mov    rbp,QWORD PTR [rsp+0x90]
      e93eb3:	00 
      e93eb4:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      e93eb8:	69 c1 60 ea 00 00    	imul   eax,ecx,0xea60
      e93ebe:	48 98                	cdqe
      e93ec0:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
      e93ec4:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
      e93ec8:	48 89 45 38          	mov    QWORD PTR [rbp+0x38],rax
      e93ecc:	41 69 c5 60 ea 00 00 	imul   eax,r13d,0xea60
      e93ed3:	66 0f 7f 45 40       	movdqa XMMWORD PTR [rbp+0x40],xmm0
      e93ed8:	89 45 50             	mov    DWORD PTR [rbp+0x50],eax
      e93edb:	66 83 65 54 00       	and    WORD PTR [rbp+0x54],0x0
      e93ee0:	31 c0                	xor    eax,eax
      e93ee2:	88 45 58             	mov    BYTE PTR [rbp+0x58],al
      e93ee5:	88 45 60             	mov    BYTE PTR [rbp+0x60],al
      e93ee8:	48 8d 7d 68          	lea    rdi,[rbp+0x68]
      e93eec:	49 89 d5             	mov    r13,rdx
      e93eef:	49 89 f7             	mov    r15,rsi

### 0xe9428f: mov    rsi,QWORD PTR [rsp+0x90]
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
      e94296:	00 
      e94297:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
      e9429c:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
      e942a3:	00 
      e942a4:	0f 29 84 24 30 03 00 	movaps XMMWORD PTR [rsp+0x330],xmm0
      e942ab:	00 
      e942ac:	48 89 ac 24 40 03 00 	mov    QWORD PTR [rsp+0x340],rbp
      e942b3:	00 
      e942b4:	4c 89 a4 24 48 03 00 	mov    QWORD PTR [rsp+0x348],r12
      e942bb:	00 
      e942bc:	48 89 8c 24 50 03 00 	mov    QWORD PTR [rsp+0x350],rcx
      e942c3:	00 
      e942c4:	4c 89 bc 24 58 03 00 	mov    QWORD PTR [rsp+0x358],r15
      e942cb:	00 
      e942cc:	48 89 94 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rdx
      e942d3:	00 
      e942d4:	48 89 84 24 68 03 00 	mov    QWORD PTR [rsp+0x368],rax

### 0xe94bcf: mov    BYTE PTR [rsp+0x88],bpl
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
      e94c17:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx

### 0xe94f00: mov    QWORD PTR [rsp+0x80],rax
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

### 0xe94f7a: mov    al,BYTE PTR [rsp+0x88]
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

### 0xe95197: mov    QWORD PTR [rsp+0x88],rax
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

### 0xe95254: mov    QWORD PTR [rsp+0x80],r12
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

### 0xe952cf: mov    r14,QWORD PTR [rsp+0x88]
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
      e95300:	eb 44                	jmp    e95346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c75c>
      e95302:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
      e95309:	00 
      e9530a:	4d 89 28             	mov    QWORD PTR [r8],r13
      e9530d:	48 8d 35 7d 7d c0 ff 	lea    rsi,[rip+0xffffffffffc07d7d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>

### 0xe953e6: mov    rsi,QWORD PTR [rsp+0x80]
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

### 0xe95557: mov    rcx,QWORD PTR [rsp+0x90]
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

### 0xe95578: mov    QWORD PTR [rsp+0x88],rcx
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
      e955a2:	4c 89 f6             	mov    rsi,r14
      e955a5:	e8 0a a9 83 00       	call   16cfeb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84020>
      e955aa:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
      e955b1:	48 89 de             	mov    rsi,rbx
      e955b4:	e8 63 42 c2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      e955b9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e955bd:	e8 c4 8e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0xe956c1: mov    QWORD PTR [rsp+0x80],rax
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

### 0xe958ba: mov    QWORD PTR [rsp+0x80],r15
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

## Object-field accesses in last 0x500 bytes before pushes
      e956d4:	f3 41 0f 7f 44 24 48 	movdqu XMMWORD PTR [r12+0x48],xmm0
      e956e0:	41 89 6c 24 68       	mov    DWORD PTR [r12+0x68],ebp
      e956e5:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      e956f4:	49 8d bc 24 80 00 00 	lea    rdi,[r12+0x80]
      e95717:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0xe8],xmm0
      e95721:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0xd8],xmm0
      e9572b:	41 89 ac 24 f8 00 00 	mov    DWORD PTR [r12+0xf8],ebp
      e9574e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
      e95759:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      e95764:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      e95790:	4d 8b 6c 24 20       	mov    r13,QWORD PTR [r12+0x20]
      e957c4:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      e957d6:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e957ee:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      e95824:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e95830:	49 89 07             	mov    QWORD PTR [r15],rax
      e9583a:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e9583e:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
      e95842:	4d 89 67 28          	mov    QWORD PTR [r15+0x28],r12
      e95846:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      e9584c:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      e95870:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e95874:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e95878:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
      e95883:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e958ab:	48 8d b3 30 02 00 00 	lea    rsi,[rbx+0x230]
      e958d6:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      e95964:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95980:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e95984:	48 8b 83 78 05 00 00 	mov    rax,QWORD PTR [rbx+0x578]
      e959af:	4c 8b b3 98 03 00 00 	mov    r14,QWORD PTR [rbx+0x398]
      e959b6:	4c 8b ab a0 03 00 00 	mov    r13,QWORD PTR [rbx+0x3a0]
      e959bd:	48 8b 83 a8 03 00 00 	mov    rax,QWORD PTR [rbx+0x3a8]
      e959cc:	48 8b 83 b0 03 00 00 	mov    rax,QWORD PTR [rbx+0x3b0]
      e959db:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
      e95a14:	48 8b 83 b0 02 00 00 	mov    rax,QWORD PTR [rbx+0x2b0]
      e95a40:	48 8d 4d 20          	lea    rcx,[rbp+0x20]
      e95a44:	48 8b 83 40 02 00 00 	mov    rax,QWORD PTR [rbx+0x240]
      e95a4b:	0f 10 83 38 02 00 00 	movups xmm0,XMMWORD PTR [rbx+0x238]
      e95a5f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95a6e:	48 8b 83 18 04 00 00 	mov    rax,QWORD PTR [rbx+0x418]
      e95a7d:	48 8b 83 28 04 00 00 	mov    rax,QWORD PTR [rbx+0x428]
      e95a8c:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
      e95a98:	48 8b 83 40 04 00 00 	mov    rax,QWORD PTR [rbx+0x440]
      e95ab4:	0f 10 93 58 04 00 00 	movups xmm2,XMMWORD PTR [rbx+0x458]
      e95abb:	48 8b 83 60 04 00 00 	mov    rax,QWORD PTR [rbx+0x460]
      e95ac7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95afc:	48 8d b3 b0 01 00 00 	lea    rsi,[rbx+0x1b0]
      e95b03:	48 8d 43 30          	lea    rax,[rbx+0x30]
      e95b0f:	48 8d 83 80 00 00 00 	lea    rax,[rbx+0x80]
      e95b1e:	48 8d 83 50 02 00 00 	lea    rax,[rbx+0x250]
      e95b2a:	48 8d 83 50 03 00 00 	lea    rax,[rbx+0x350]
      e95b39:	48 8d 83 d0 03 00 00 	lea    rax,[rbx+0x3d0]
      e95b48:	48 8d 83 30 04 00 00 	lea    rax,[rbx+0x430]
      e95b57:	48 8d 83 48 04 00 00 	lea    rax,[rbx+0x448]
      e95b6e:	4c 8b 9b b8 03 00 00 	mov    r11,QWORD PTR [rbx+0x3b8]
      e95b78:	4c 8b ab 98 04 00 00 	mov    r13,QWORD PTR [rbx+0x498]
      e95b7f:	48 8b 9b a0 04 00 00 	mov    rbx,QWORD PTR [rbx+0x4a0]
      e95b86:	4c 8b b0 68 05 00 00 	mov    r14,QWORD PTR [rax+0x568]
      e95b8d:	4c 8b a0 70 05 00 00 	mov    r12,QWORD PTR [rax+0x570]
      e95b94:	48 8b 88 88 05 00 00 	mov    rcx,QWORD PTR [rax+0x588]
      e95b9b:	66 0f 6f 88 80 05 00 	movdqa xmm1,XMMWORD PTR [rax+0x580]
      e95bac:	4c 8d b8 b8 04 00 00 	lea    r15,[rax+0x4b8]
      e95bb8:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      e95bc5:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      e95bc9:	f0 48 ff 45 00       	lock inc QWORD PTR [rbp+0x0]
