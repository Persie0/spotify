# Restrictions virtual `+0xa0` receiver at `e95105` v14

Focus: identify the receiver used at `e95105 call [r14.vtable+0xa0]` and how the callback package at `rsp+0xbe0` is passed. Static provenance only.

## Full local window around callback package and virtual `+0xa0` call

```text
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
```
## Filtered `r14` / callback-package dataflow rows

| addr | instruction |
|---:|---|
| `0xe94e0f` | `e94e0f:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]` |
| `0xe94e20` | `e94e20:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]` |
| `0xe94e28` | `e94e28:	4c 89 f7             	mov    rdi,r14` |
| `0xe94ec0` | `e94ec0:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi` |
| `0xe94ecd` | `e94ecd:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0` |
| `0xe94ed6` | `e94ed6:	49 89 9c 24 b0 00 00 	mov    QWORD PTR [r12+0xb0],rbx` |
| `0xe94ee6` | `e94ee6:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]` |
| `0xe94eee` | `e94eee:	48 89 df             	mov    rdi,rbx` |
| `0xe94f10` | `e94f10:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax` |
| `0xe94fa0` | `e94fa0:	48 89 84 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rax` |
| `0xe94fb0` | `e94fb0:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14` |
| `0xe94fbc` | `e94fbc:	4c 89 f6             	mov    rsi,r14` |
| `0xe94fc4` | `e94fc4:	4c 89 f7             	mov    rdi,r14` |
| `0xe95006` | `e95006:	48 8d 9c 24 30 0a 00 	lea    rbx,[rsp+0xa30]` |
| `0xe9500e` | `e9500e:	48 89 df             	mov    rdi,rbx` |
| `0xe95016` | `e95016:	4c 8d b4 24 10 0e 00 	lea    r14,[rsp+0xe10]` |
| `0xe9501e` | `e9501e:	4c 89 f7             	mov    rdi,r14` |
| `0xe95034` | `e95034:	66 0f 7f 4c 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm1` |
| `0xe95041` | `e95041:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]` |
| `0xe95046` | `e95046:	0f 29 84 24 20 03 00 	movaps XMMWORD PTR [rsp+0x320],xmm0` |
| `0xe9506b` | `e9506b:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]` |
| `0xe95088` | `e95088:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0` |
| `0xe9508c` | `e9508c:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0` |
| `0xe95091` | `e95091:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe95099` | `e95099:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe950a1` | `e950a1:	4c 89 33             	mov    QWORD PTR [rbx],r14` |
| `0xe950a4` | `e950a4:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0xe950ba` | `e950ba:	66 0f 6f 44 24 70    	movdqa xmm0,XMMWORD PTR [rsp+0x70]` |
| `0xe950d9` | `e950d9:	48 8d 0d 74 4b 00 00 	lea    rcx,[rip+0x4b74]        # e99c54 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6106a>` |
| `0xe950e0` | `e950e0:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]` |
| `0xe950ec` | `e950ec:	48 89 df             	mov    rdi,rbx` |
| `0xe950ef` | `e950ef:	e8 a0 56 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xe950f4` | `e950f4:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xe950f7` | `e950f7:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]` |
| `0xe950ff` | `e950ff:	4c 89 f6             	mov    rsi,r14` |
| `0xe95102` | `e95102:	48 89 da             	mov    rdx,rbx` |
| `0xe95105` | `e95105:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]` |
| `0xe9511d` | `e9511d:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]` |
| `0xe95137` | `e95137:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]` |
| `0xe95158` | `e95158:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]` |
| `0xe95160` | `e95160:	48 89 de             	mov    rsi,rbx` |
| `0xe95168` | `e95168:	48 89 df             	mov    rdi,rbx` |
| `0xe951a9` | `e951a9:	49 89 c6             	mov    r14,rax` |
| `0xe951bc` | `e951bc:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xe951bf` | `e951bf:	4d 8d 66 18          	lea    r12,[r14+0x18]` |
| `0xe951c3` | `e951c3:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]` |
| `0xe951fd` | `e951fd:	4c 89 b4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r14` |
| `0xe9520a` | `e9520a:	48 89 c3             	mov    rbx,rax` |
| `0xe9520d` | `e9520d:	4c 89 f0             	mov    rax,r14` |
| `0xe95218` | `e95218:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0` |
| `0xe95224` | `e95224:	48 89 0b             	mov    QWORD PTR [rbx],rcx` |
| `0xe95232` | `e95232:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax` |
| `0xe95236` | `e95236:	48 c7 43 20 32 00 00 	mov    QWORD PTR [rbx+0x20],0x32` |
| `0xe95246` | `e95246:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0` |
| `0xe9525c` | `e9525c:	4c 89 63 38          	mov    QWORD PTR [rbx+0x38],r12` |
| `0xe95260` | `e95260:	4c 89 73 40          	mov    QWORD PTR [rbx+0x40],r14` |
| `0xe95264` | `e95264:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]` |
| `0xe9527e` | `e9527e:	48 89 5c 24 70       	mov    QWORD PTR [rsp+0x70],rbx` |
| `0xe95288` | `e95288:	4c 8d 7b 48          	lea    r15,[rbx+0x48]` |
| `0xe952ac` | `e952ac:	49 89 d6             	mov    r14,rdx` |
| `0xe952c0` | `e952c0:	4c 89 f2             	mov    rdx,r14` |

## Relocation tables with plausible `+0xa0` code slots

| AP base | +0x00 | +0x10 | +0xa0 | +0xa8 | tags |
|---:|---:|---:|---:|---:|---|
| `0x1831918` | `10321376` | `15361530` | `0xe993ae` | `-` | `near-e95/e99` |
| `0x1831940` | `10814320` | `-` | `0xe992a2` | `15307446` | `near-e95/e99` |
| `0x1831948` | `15361582` | `-` | `0xe992b6` | `15307464` | `near-e95/e99` |
| `0x1831968` | `10814320` | `15361384` | `0xad647a` | `15307650` | `near-e95/e99` |
| `0x1831970` | `15361352` | `10321376` | `0xe99382` | `-` | `near-e95/e99` |
| `0x1831990` | `15361404` | `-` | `0xa50370` | `15307370` | `near-e95/e99` |
| `0x18319a8` | `15307660` | `15307694` | `0x9d7de0` | `10814320` | `near-e95/e99` |
| `0x18319b0` | `15307676` | `-` | `0xa50370` | `15307418` | `near-e95/e99` |
| `0x18319b8` | `15307694` | `10814320` | `0xe9929a` | `-` | `near-e95/e99` |
| `0x18319e0` | `15307426` | `15307464` | `0xeaaf6e` | `-` | `near-e95/e99` |
| `0x18319f0` | `15307464` | `11363440` | `0xa50370` | `-` | `near-e95/e99` |
| `0x1831a10` | `15307650` | `-` | `0xa50370` | `15383198` | `near-e95/e99` |
| `0x1831a28` | `10321376` | `15307370` | `0xeabc4e` | `-` | `near-e95/e99` |
| `0x1831a40` | `15307400` | `10814320` | `0xeaba70` | `15383168` | `near-e95/e99` |
| `0x1831a48` | `10321376` | `15307418` | `0xeaba80` | `15383186` | `near-e95/e99` |
| `0x188bd38` | `23114236` | `23114256` | `0xad647a` | `15307650` | `near-e95/e99` |
| `0x188bd40` | `23114246` | `23114266` | `0xe99382` | `-` | `near-e95/e99` |
| `0x188bde0` | `15307650` | `-` | `0xa02220` | `-` | `near-e95/e99` |
| `0x18903e8` | `18678048` | `18678206` | `0x1635176` | `15307650` | `near-e95/e99` |
| `0x18903f0` | `18678048` | `18678206` | `0xe99382` | `22068834` | `near-e95/e99` |
| `0x1890480` | `23286098` | `15307650` | `0x1635366` | `23286642` | `near-e95/e99` |
| `0x1890490` | `15307650` | `23286152` | `0x163537e` | `23286666` | `near-e95/e99` |
| `0x17f4710` | `3303495` | `3429691` | `0x9e6d90` | `10383328` | `` |
| `0x17f4718` | `3692688` | `3588161` | `0x9e6fe0` | `3519441` | `` |
| `0x17f4728` | `3588161` | `3707273` | `0x9e2d20` | `10366352` | `` |
| `0x17f4730` | `3575403` | `3400152` | `0x9e2d90` | `3559800` | `` |
| `0x17f4740` | `3400152` | `3601176` | `0x9e5140` | `10376688` | `` |
| `0x17f4748` | `3412910` | `3442960` | `0x9e55f0` | `3628770` | `` |
| `0x17f4758` | `3442960` | `3318594` | `0x9e9890` | `10394448` | `` |
| `0x17f4760` | `3601120` | `3303550` | `0x9e9b50` | `3493215` | `` |
| `0x17f4770` | `3303550` | `3692721` | `0x9eed30` | `10415840` | `` |
| `0x17f4778` | `3442977` | `3533346` | `0x9eeee0` | `3679406` | `` |
| `0x17f4788` | `3533346` | `3588194` | `0x9ee7c0` | `10414128` | `` |
| `0x17f4790` | `3601140` | `3666314` | `0x9ee830` | `3666259` | `` |
| `0x17f47a0` | `3666314` | `10382736` | `0x9e2e10` | `10366512` | `` |
| `0x17f47a8` | `3641170` | `10383328` | `0x9e2e30` | `10322384` | `` |
| `0x17f47b0` | `10382736` | `3519441` | `0x9d81d0` | `10322384` | `` |
| `0x17f47b8` | `10383328` | `10366240` | `0x9d81d0` | `10366672` | `` |
| `0x17f47c0` | `3519441` | `10366352` | `0x9e2ed0` | `10366880` | `` |
| `0x17f47c8` | `10366240` | `3559800` | `0x9e2fa0` | `10366896` | `` |
| `0x17f47d0` | `10366352` | `10375488` | `0x9e2fb0` | `10367056` | `` |
| `0x17f47d8` | `3559800` | `10376688` | `0x9e3050` | `10322384` | `` |
| `0x17f47e0` | `10375488` | `3628770` | `0x9d81d0` | `-` | `` |
| `0x17f47f0` | `3628770` | `10394448` | `0x17f48d0` | `-` | `` |
| `0x17f4808` | `3493215` | `10415840` | `0x17f4890` | `-` | `` |
| `0x17f4860` | `10366672` | `10366896` | `0x9e5970` | `10377856` | `` |
| `0x17f4868` | `10366880` | `10367056` | `0x9e5a80` | `10379792` | `` |
| `0x17f4870` | `10366896` | `10322384` | `0x9e6210` | `10322384` | `` |
| `0x17f4878` | `10367056` | `-` | `0x9d81d0` | `10379888` | `` |
| `0x17f4880` | `10322384` | `25118928` | `0x9e6270` | `10380336` | `` |
| `0x17f4890` | `25118928` | `3730112` | `0x9e6700` | `10381248` | `` |
| `0x17f48a0` | `3730112` | `-` | `0x9d81d0` | `3730368` | `` |
| `0x17f4910` | `10379792` | `10379888` | `0x17f48d0` | `-` | `` |
| `0x17f4928` | `10380336` | `10381248` | `0x17f49b0` | `-` | `` |
| `0x17f4950` | `3730384` | `10375408` | `0x17f4948` | `25119096` | `` |
| `0x17f4960` | `10375408` | `-` | `0x17f48d0` | `-` | `` |
| `0x17f4978` | `3730392` | `-` | `0x17f49f0` | `-` | `` |
| `0x17f49b0` | `25118928` | `3730416` | `0x9e7820` | `10322384` | `` |
| `0x17f49c0` | `3730416` | `-` | `0x9e7870` | `10385904` | `` |
| `0x17f49c8` | `25119152` | `-` | `0x9e79f0` | `10385936` | `` |
| `0x17f4a48` | `10383936` | `10322384` | `0x9e50f0` | `-` | `` |
| `0x17f4a60` | `10385520` | `10385936` | `0x17f4ad0` | `-` | `` |
| `0x17f4a78` | `10386352` | `3730592` | `0x17f4b00` | `-` | `` |
| `0x17f4a88` | `3730592` | `-` | `0x9e50f0` | `-` | `` |
| `0x17f4b68` | `10375408` | `-` | `0x9e9ce0` | `10395344` | `` |
| `0x17f4b80` | `25118928` | `3730736` | `0x9e9f10` | `10395712` | `` |
| `0x17f4b90` | `3730736` | `-` | `0x9ea120` | `10396304` | `` |
| `0x17f4b98` | `25119616` | `-` | `0x9ea290` | `10322384` | `` |
| `0x17f4bc0` | `25118928` | `3730816` | `0x9e50f0` | `-` | `` |
| `0x17f4c08` | `10394848` | `10395392` | `0x9e50f0` | `-` | `` |
| `0x17f4c20` | `10395408` | `10395936` | `0x17f4c90` | `-` | `` |
| `0x17f4c38` | `10396304` | `3732896` | `0x17f4cc0` | `-` | `` |
| `0x17f4c48` | `3732896` | `-` | `0x9e50f0` | `-` | `` |
| `0x17f4c60` | `10375408` | `-` | `0x17f48d0` | `-` | `` |
| `0x17f4ce8` | `10375408` | `-` | `0x9ee8c0` | `10415104` | `` |
| `0x17f4d00` | `25118928` | `3732992` | `0x9eec10` | `10366880` | `` |
| `0x17f4d10` | `3732992` | `-` | `0x9eeca0` | `10322384` | `` |
| `0x17f4d18` | `25120000` | `-` | `0x9d81d0` | `10322384` | `` |
| `0x17f4d80` | `10414240` | `10415104` | `0x9ef200` | `10322384` | `` |
| `0x17f4d88` | `10414272` | `10322384` | `0x9d81d0` | `10416656` | `` |
| `0x17f4d90` | `10415104` | `10415120` | `0x9ef210` | `10416896` | `` |
| `0x17f4d98` | `10322384` | `10366880` | `0x9ef300` | `10417008` | `` |
| `0x17f4da0` | `10415120` | `10415264` | `0x9ef370` | `10405344` | `` |
| `0x17f4da8` | `10366880` | `10322384` | `0x9ec5e0` | `10417392` | `` |
| `0x17f4db0` | `10415264` | `10322384` | `0x9ef4f0` | `3734240` | `` |
| `0x17f4e30` | `10416656` | `10417008` | `0x17f4e58` | `25118928` | `` |
| `0x17f4e38` | `10416896` | `10405344` | `0x17f48d0` | `-` | `` |
| `0x17f4e50` | `10417392` | `3734280` | `0x17f4ed0` | `-` | `` |
| `0x17f4ef0` | `25120464` | `-` | `0x17f4f60` | `-` | `` |
| `0x17f4f18` | `3734432` | `-` | `0x9e50f0` | `-` | `` |
| `0x17f4f90` | `25120608` | `3734488` | `0xa01fd0` | `-` | `` |
| `0x17f5328` | `10539536` | `-` | `0x17f5388` | `-` | `` |
| `0x17f5390` | `3738018` | `-` | `0xa0e260` | `-` | `` |
| `0x17f53b0` | `25121672` | `3738082` | `0xa0e270` | `-` | `` |
| `0x17f5450` | `10543728` | `-` | `0x17f5388` | `-` | `` |
| `0x17f61a0` | `10602080` | `-` | `0xa1c9c0` | `-` | `` |
| `0x17f61f0` | `10602224` | `-` | `0xa1ca90` | `10603264` | `` |
| `0x17f6238` | `10602080` | `-` | `0xa1cc40` | `-` | `` |
| `0x17f62d0` | `10603552` | `-` | `0xa1cf80` | `-` | `` |
| `0x17f6320` | `10603696` | `-` | `0xa1cfc0` | `10604592` | `` |
| `0x17f6358` | `25125840` | `10603552` | `0xa3c750` | `10733584` | `` |
| `0x17f7aa8` | `10795040` | `-` | `0xa4b8f0` | `10795264` | `` |
| `0x17f7ab0` | `10795072` | `10795104` | `0xa4b900` | `10795280` | `` |
| `0x17f7ac0` | `10795104` | `-` | `0xa4b920` | `10795312` | `` |
| `0x17f7b48` | `10795248` | `10795280` | `0xa4b950` | `10795376` | `` |
| `0x17f7b50` | `10795264` | `10795296` | `0xa4b970` | `-` | `` |
| `0x17f7b60` | `10795296` | `10795328` | `0xa4b990` | `-` | `` |
| `0x17f7be8` | `10795344` | `-` | `0xa4b8f0` | `10795264` | `` |
| `0x17f7bf0` | `10795376` | `10795408` | `0xa4b900` | `10795280` | `` |
| `0x17f7c00` | `10795408` | `-` | `0xa4b920` | `10795312` | `` |
| `0x17f7c80` | `10795232` | `10795264` | `0xa4b9a0` | `-` | `` |
| `0x17f8098` | `10795008` | `-` | `0xa4b9e0` | `10795616` | `` |
| `0x17f9270` | `3533417` | `3545712` | `0x17f9340` | `10814208` | `` |
| `0x17f9280` | `3545712` | `3318786` | `0xa50310` | `10814256` | `` |
| `0x17f92c0` | `3468789` | `3654100` | `0x17f9390` | `10815152` | `` |
| `0x17f92d0` | `3654100` | `3679560` | `0xa506c0` | `10815200` | `` |
| `0x17f9310` | `25137984` | `10814224` | `0x17f93e0` | `10815280` | `` |
| `0x17f9318` | `10814208` | `10814256` | `0xa50730` | `10815296` | `` |
| `0x17f9320` | `10814224` | `-` | `0xa50740` | `10815328` | `` |
| `0x17f9328` | `10814256` | `10814320` | `0xa50760` | `-` | `` |
| `0x17f9338` | `10814320` | `3747552` | `0xa50370` | `-` | `` |
| `0x17fa088` | `10837968` | `10321376` | `0x9d7de0` | `10838016` | `` |
| `0x17fa090` | `10837984` | `10321376` | `0xa56000` | `-` | `` |
| `0x17fa0d8` | `10837968` | `10321376` | `0x9d7de0` | `10838032` | `` |
| `0x17fa0e0` | `10837984` | `10321376` | `0xa56010` | `10842784` | `` |
| `0x17fa0e8` | `10321376` | `10322384` | `0xa572a0` | `10841840` | `` |
| `0x17fa0f0` | `10321376` | `-` | `0xa56ef0` | `10838720` | `` |
| `0x17fa0f8` | `10322384` | `-` | `0xa562c0` | `-` | `` |
| `0x17fa110` | `10837968` | `10321376` | `0xa55fd0` | `10837984` | `` |
| `0x17fa118` | `10837984` | `10321376` | `0xa55fe0` | `10321376` | `` |
| `0x17fa120` | `10321376` | `10838016` | `0x9d7de0` | `10321376` | `` |
| `0x17fa128` | `10321376` | `-` | `0x9d7de0` | `10838032` | `` |
| `0x17fa130` | `10838016` | `-` | `0xa56010` | `10842544` | `` |
| `0x17fa178` | `10321376` | `10842784` | `0xa55fd0` | `10837984` | `` |
| `0x17fa180` | `10838032` | `10841840` | `0xa55fe0` | `10321376` | `` |
| `0x17fa188` | `10842784` | `10838720` | `0x9d7de0` | `10321376` | `` |
| `0x17fa190` | `10841840` | `-` | `0x9d7de0` | `10838032` | `` |
| `0x17fa198` | `10838720` | `-` | `0xa56010` | `10842032` | `` |
| `0x17fa1b0` | `10837968` | `10321376` | `0xa56370` | `-` | `` |
| `0x17fa1e0` | `10841504` | `-` | `0xa55fd0` | `10837984` | `` |
| `0x17fa1e8` | `10838800` | `-` | `0xa55fe0` | `10321376` | `` |
| `0x17fa218` | `10837968` | `10321376` | `0xa55fd0` | `10837984` | `` |
| `0x17fa220` | `10837984` | `10321376` | `0xa55fe0` | `10321376` | `` |
| `0x17fa228` | `10321376` | `10838032` | `0x9d7de0` | `10321376` | `` |
| `0x17fa230` | `10321376` | `10842032` | `0x9d7de0` | `10839376` | `` |
| `0x17fa238` | `10838032` | `10840624` | `0xa56550` | `-` | `` |
| `0x17fa250` | `10838896` | `-` | `0xa55fd0` | `10837984` | `` |
| `0x17fa280` | `10837968` | `10321376` | `0x17fa380` | `10322384` | `` |
| `0x17fa288` | `10837984` | `10321376` | `0x9d81d0` | `10322384` | `` |
| `0x17fa290` | `10321376` | `10839248` | `0x9d81d0` | `10322384` | `` |
| `0x17fa298` | `10321376` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fa2a0` | `10839248` | `-` | `0xa10ec0` | `10861360` | `` |
| `0x17fa2b8` | `10837968` | `10321376` | `0xa5bbf0` | `10321376` | `` |
| `0x17fa2c0` | `10837984` | `10321376` | `0x9d7de0` | `10814320` | `` |
| `0x17fa2c8` | `10321376` | `10839376` | `0xa50370` | `-` | `` |
| `0x17fa2f0` | `10837968` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fa300` | `10321376` | `10840320` | `0x17fa3f0` | `10322384` | `` |
| `0x17fa308` | `10321376` | `-` | `0x9d81d0` | `10322384` | `` |
| `0x17fa310` | `10840320` | `25142144` | `0x9d81d0` | `10322384` | `` |
| `0x17fa320` | `25142144` | `10322384` | `0xa10ec0` | `10861568` | `` |
| `0x17fa328` | `10322384` | `10322384` | `0xa5bc00` | `10321376` | `` |
| `0x17fa330` | `10322384` | `10555072` | `0x9d7de0` | `10861552` | `` |
| `0x17fa338` | `10322384` | `10861360` | `0xa5bbf0` | `10321376` | `` |
| `0x17fa340` | `10555072` | `10321376` | `0x9d7de0` | `10814320` | `` |
| `0x17fa348` | `10861360` | `10861552` | `0xa50370` | `-` | `` |
| `0x17fa360` | `10321376` | `-` | `0x17fa370` | `-` | `` |
| `0x17fa378` | `3750080` | `3750032` | `0x9d81d0` | `10322384` | `` |
| `0x17fa388` | `3750032` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fa390` | `25142128` | `25142256` | `0xa10ec0` | `10862432` | `` |
| `0x17fa3a0` | `25142256` | `10322384` | `0x9d7de0` | `10862544` | `` |
| `0x17fa3a8` | `10322384` | `10322384` | `0xa5bfd0` | `10321376` | `` |
| `0x17fa3b0` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fa3b8` | `10322384` | `10861568` | `0xa50370` | `-` | `` |
| `0x17fa3d0` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fa3e0` | `10321376` | `-` | `0x17fa4d0` | `10322384` | `` |
| `0x17fa3e8` | `10814320` | `3750120` | `0x9d81d0` | `10322384` | `` |
| `0x17fa3f8` | `3750120` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fa400` | `25142128` | `25142368` | `0xa10ec0` | `10862560` | `` |
| `0x17fa410` | `25142368` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fa418` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fa420` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fa428` | `10322384` | `10862432` | `0xa50370` | `-` | `` |
| `0x17fa440` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fa450` | `10321376` | `-` | `0x17fa540` | `10868800` | `` |
| `0x17fa458` | `10814320` | `3750178` | `0xa5d840` | `10868880` | `` |
| `0x17fa468` | `3750178` | `-` | `0xa5d8e0` | `10869040` | `` |
| `0x17fa470` | `25142128` | `25142480` | `0xa5d930` | `10869104` | `` |
| `0x17fa480` | `25142480` | `10322384` | `0xa5d9a0` | `10861552` | `` |
| `0x17fa488` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fa490` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fa498` | `10322384` | `10862560` | `0xa50370` | `-` | `` |
| `0x17fa4b0` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fa8a8` | `3456175` | `3413313` | `0x17fa998` | `10322384` | `` |
| `0x17fa8b8` | `3413313` | `3615721` | `0x9d81d0` | `10322384` | `` |
| `0x17fa8c8` | `3615721` | `3358869` | `0xa10ec0` | `10886896` | `` |
| `0x17fa8d8` | `3358869` | `3373292` | `0x9d7de0` | `10861552` | `` |
| `0x17fa8e8` | `3373292` | `3480151` | `0x9d7de0` | `10814320` | `` |
| `0x17fa908` | `3345944` | `3345944` | `0x17fa370` | `-` | `` |
| `0x17fa918` | `3345944` | `3693058` | `0x17faa08` | `10322384` | `` |
| `0x17fa928` | `3693058` | `3693058` | `0x9d81d0` | `10322384` | `` |
| `0x17fa938` | `3693058` | `25143704` | `0xa10ec0` | `10888064` | `` |
| `0x17fa948` | `25143704` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fa950` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fa958` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fa960` | `10322384` | `10886896` | `0xa50370` | `-` | `` |
| `0x17fa978` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fa988` | `10321376` | `-` | `0x17faa78` | `10322384` | `` |
| `0x17fa990` | `10814320` | `3750330` | `0x9d81d0` | `10322384` | `` |
| `0x17fa9a0` | `3750330` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fa9a8` | `25142128` | `25143816` | `0xa10ec0` | `10888224` | `` |
| `0x17fa9b8` | `25143816` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fa9c0` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fa9c8` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fa9d0` | `10322384` | `10888064` | `0xa50370` | `-` | `` |
| `0x17fa9e8` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fa9f8` | `10321376` | `-` | `0x17faae8` | `10322384` | `` |
| `0x17faa00` | `10814320` | `3750377` | `0x9d81d0` | `10322384` | `` |
| `0x17faa10` | `3750377` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17faa18` | `25142128` | `25143928` | `0xa10ec0` | `10888368` | `` |
| `0x17faa28` | `25143928` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17faa30` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17faa38` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17faa40` | `10322384` | `10888224` | `0xa50370` | `-` | `` |
| `0x17faa58` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17faa68` | `10321376` | `-` | `0x17fab58` | `10322384` | `` |
| `0x17faa70` | `10814320` | `3750424` | `0x9d81d0` | `10322384` | `` |
| `0x17faa80` | `3750424` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17faa88` | `25142128` | `25144040` | `0xa10ec0` | `10888592` | `` |
| `0x17faa98` | `25144040` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17faaa0` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17faaa8` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17faab0` | `10322384` | `10888368` | `0xa50370` | `-` | `` |
| `0x17faac8` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17faad8` | `10321376` | `-` | `0x17fabc8` | `10322384` | `` |
| `0x17faae0` | `10814320` | `3750472` | `0x9d81d0` | `10322384` | `` |
| `0x17faaf0` | `3750472` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17faaf8` | `25142128` | `25144152` | `0xa10ec0` | `10888784` | `` |
| `0x17fab08` | `25144152` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fab10` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fab18` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fab20` | `10322384` | `10888592` | `0xa50370` | `-` | `` |
| `0x17fab38` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fab48` | `10321376` | `-` | `0x17fac38` | `10322384` | `` |
| `0x17fab50` | `10814320` | `3750527` | `0x9d81d0` | `10322384` | `` |
| `0x17fab60` | `3750527` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fab68` | `25142128` | `25144264` | `0xa10ec0` | `10889824` | `` |
| `0x17fab78` | `25144264` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fab80` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fab88` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fab90` | `10322384` | `10888784` | `0xa50370` | `-` | `` |
| `0x17faba8` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fabb8` | `10321376` | `-` | `0x17faca8` | `10322384` | `` |
| `0x17fabc0` | `10814320` | `3750574` | `0x9d81d0` | `10322384` | `` |
| `0x17fabd0` | `3750574` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fabd8` | `25142128` | `25144376` | `0xa10ec0` | `10890256` | `` |
| `0x17fabe8` | `25144376` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fabf0` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fabf8` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fac00` | `10322384` | `10889824` | `0xa50370` | `-` | `` |
| `0x17fac18` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fac28` | `10321376` | `-` | `0x17fad18` | `10322384` | `` |
| `0x17fac30` | `10814320` | `3750617` | `0x9d81d0` | `10322384` | `` |
| `0x17fac40` | `3750617` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fac48` | `25142128` | `25144488` | `0xa10ec0` | `10890496` | `` |
| `0x17fac58` | `25144488` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fac60` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fac68` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fac70` | `10322384` | `10890256` | `0xa50370` | `-` | `` |
| `0x17fac88` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fac98` | `10321376` | `-` | `0x17fad88` | `10322384` | `` |
| `0x17faca0` | `10814320` | `3750664` | `0x9d81d0` | `10322384` | `` |
| `0x17facb0` | `3750664` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17facb8` | `25142128` | `25144600` | `0xa10ec0` | `10890912` | `` |
| `0x17facc8` | `25144600` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17facd0` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17facd8` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17face0` | `10322384` | `10890496` | `0xa50370` | `-` | `` |
| `0x17facf8` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fad08` | `10321376` | `-` | `0x17fadf8` | `10322384` | `` |
| `0x17fad10` | `10814320` | `3750708` | `0x9d81d0` | `10322384` | `` |
| `0x17fad20` | `3750708` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fad28` | `25142128` | `25144712` | `0xa10ec0` | `10891168` | `` |
| `0x17fad38` | `25144712` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fad40` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fad48` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fad50` | `10322384` | `10890912` | `0xa50370` | `-` | `` |
| `0x17fad68` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fad78` | `10321376` | `-` | `0x17fae68` | `10322384` | `` |
| `0x17fad80` | `10814320` | `3750759` | `0x9d81d0` | `10322384` | `` |
| `0x17fad90` | `3750759` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fad98` | `25142128` | `25144824` | `0xa10ec0` | `10891680` | `` |
| `0x17fada8` | `25144824` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fadb0` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fadb8` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fadc0` | `10322384` | `10891168` | `0xa50370` | `-` | `` |
| `0x17fadd8` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fade8` | `10321376` | `-` | `0x17faed8` | `10322384` | `` |
| `0x17fadf0` | `10814320` | `3750811` | `0x9d81d0` | `10322384` | `` |
| `0x17fae00` | `3750811` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fae08` | `25142128` | `25144936` | `0xa10ec0` | `10894992` | `` |
| `0x17fae18` | `25144936` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fae20` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fae28` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fae30` | `10322384` | `10891680` | `0xa50370` | `-` | `` |
| `0x17fae48` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fae58` | `10321376` | `-` | `0x17faf48` | `10322384` | `` |
| `0x17fae60` | `10814320` | `3750855` | `0x9d81d0` | `10322384` | `` |
| `0x17fae70` | `3750855` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fae78` | `25142128` | `25145048` | `0xa10ec0` | `10895712` | `` |
| `0x17fae88` | `25145048` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fae90` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fae98` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17faea0` | `10322384` | `10894992` | `0xa50370` | `-` | `` |
| `0x17faeb8` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17faec8` | `10321376` | `-` | `0x17fafb8` | `10322384` | `` |
| `0x17faed0` | `10814320` | `3750905` | `0x9d81d0` | `10322384` | `` |
| `0x17faee0` | `3750905` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17faee8` | `25142128` | `25145160` | `0xa10ec0` | `10895856` | `` |
| `0x17faef8` | `25145160` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17faf00` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17faf08` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17faf10` | `10322384` | `10895712` | `0xa50370` | `-` | `` |
| `0x17faf28` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17faf38` | `10321376` | `-` | `0x17fb028` | `10322384` | `` |
| `0x17faf40` | `10814320` | `3750956` | `0x9d81d0` | `10322384` | `` |
| `0x17faf50` | `3750956` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17faf58` | `25142128` | `25145272` | `0xa10ec0` | `10896272` | `` |
| `0x17faf68` | `25145272` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17faf70` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17faf78` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17faf80` | `10322384` | `10895856` | `0xa50370` | `-` | `` |
| `0x17faf98` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fafa8` | `10321376` | `-` | `0x17fb098` | `10322384` | `` |
| `0x17fafb0` | `10814320` | `3751000` | `0x9d81d0` | `10322384` | `` |
| `0x17fafc0` | `3751000` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fafc8` | `25142128` | `25145384` | `0xa10ec0` | `10896848` | `` |
| `0x17fafd8` | `25145384` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fafe0` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fafe8` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17faff0` | `10322384` | `10896272` | `0xa50370` | `-` | `` |
| `0x17fb008` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| `0x17fb018` | `10321376` | `-` | `0x17fb108` | `10322384` | `` |
| `0x17fb020` | `10814320` | `3751056` | `0x9d81d0` | `10322384` | `` |
| `0x17fb030` | `3751056` | `-` | `0x9d81d0` | `10555072` | `` |
| `0x17fb038` | `25142128` | `25145496` | `0xa10ec0` | `10897568` | `` |
| `0x17fb048` | `25145496` | `10322384` | `0x9d7de0` | `10861552` | `` |
| `0x17fb050` | `10322384` | `10322384` | `0xa5bbf0` | `10321376` | `` |
| `0x17fb058` | `10322384` | `10555072` | `0x9d7de0` | `10814320` | `` |
| `0x17fb060` | `10322384` | `10896848` | `0xa50370` | `-` | `` |
| `0x17fb078` | `10321376` | `10321376` | `0x17fa370` | `-` | `` |
| ... | ... | ... | ... | ... | truncated 61769 more |

## Target windows for near-region `+0xa0` candidates

### `+0xa0` target `0x9d7de0`

```text
  9d7db8:	cc                   	int3
  9d7db9:	cc                   	int3
  9d7dba:	cc                   	int3
  9d7dbb:	cc                   	int3
  9d7dbc:	cc                   	int3
  9d7dbd:	cc                   	int3
  9d7dbe:	cc                   	int3
  9d7dbf:	cc                   	int3
  9d7dc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  9d7dc3:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  9d7dc7:	ff e0                	jmp    rax
  9d7dc9:	cc                   	int3
  9d7dca:	cc                   	int3
  9d7dcb:	cc                   	int3
  9d7dcc:	cc                   	int3
  9d7dcd:	cc                   	int3
  9d7dce:	cc                   	int3
  9d7dcf:	cc                   	int3
  9d7dd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  9d7dd3:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
  9d7dd7:	ff e0                	jmp    rax
  9d7dd9:	cc                   	int3
  9d7dda:	cc                   	int3
  9d7ddb:	cc                   	int3
  9d7ddc:	cc                   	int3
  9d7ddd:	cc                   	int3
  9d7dde:	cc                   	int3
  9d7ddf:	cc                   	int3
  9d7de0:	c3                   	ret
  9d7de1:	cc                   	int3
  9d7de2:	cc                   	int3
  9d7de3:	cc                   	int3
  9d7de4:	cc                   	int3
  9d7de5:	cc                   	int3
  9d7de6:	cc                   	int3
  9d7de7:	cc                   	int3
  9d7de8:	cc                   	int3
  9d7de9:	cc                   	int3
  9d7dea:	cc                   	int3
  9d7deb:	cc                   	int3
  9d7dec:	cc                   	int3
  9d7ded:	cc                   	int3
  9d7dee:	cc                   	int3
  9d7def:	cc                   	int3
  9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
  9d7df4:	0f 94 c0             	sete   al
  9d7df7:	c3                   	ret
  9d7df8:	cc                   	int3
  9d7df9:	cc                   	int3
  9d7dfa:	cc                   	int3
  9d7dfb:	cc                   	int3
  9d7dfc:	cc                   	int3
  9d7dfd:	cc                   	int3
  9d7dfe:	cc                   	int3
  9d7dff:	cc                   	int3
  9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]
  9d7e03:	c3                   	ret
  9d7e04:	cc                   	int3
  9d7e05:	cc                   	int3
  9d7e06:	cc                   	int3
  9d7e07:	cc                   	int3
  9d7e08:	cc                   	int3
  9d7e09:	cc                   	int3
  9d7e0a:	cc                   	int3
  9d7e0b:	cc                   	int3
  9d7e0c:	cc                   	int3
  9d7e0d:	cc                   	int3
  9d7e0e:	cc                   	int3
  9d7e0f:	cc                   	int3
  9d7e10:	50                   	push   rax
  9d7e11:	48 89 f7             	mov    rdi,rsi
  9d7e14:	4c 8d 05 65 24 00 01 	lea    r8,[rip+0x1002465]        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7e1b:	48 c7 c6 ff ff ff ff 	mov    rsi,0xffffffffffffffff
  9d7e22:	31 c0                	xor    eax,eax
  9d7e24:	e8 17 00 00 00       	call   9d7e40 <_ZNSt13bad_exceptionD1Ev@@Base+0x60>
  9d7e29:	48 98                	cdqe
  9d7e2b:	c6 05 4e 24 00 01 00 	mov    BYTE PTR [rip+0x100244e],0x0        # 19da280 <__stop_pb_defaults@@Base+0x20>
  9d7e32:	59                   	pop    rcx
  9d7e33:	c3                   	ret
  9d7e34:	cc                   	int3
  9d7e35:	cc                   	int3
  9d7e36:	cc                   	int3
  9d7e37:	cc                   	int3
  9d7e38:	cc                   	int3
  9d7e39:	cc                   	int3
  9d7e3a:	cc                   	int3
  9d7e3b:	cc                   	int3
  9d7e3c:	cc                   	int3
  9d7e3d:	cc                   	int3
  9d7e3e:	cc                   	int3
  9d7e3f:	cc                   	int3
  9d7e40:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
  9d7e47:	48 89 f1             	mov    rcx,rsi
  9d7e4a:	84 c0                	test   al,al
  9d7e4c:	74 31                	je     9d7e7f <_ZNSt13bad_exceptionD1Ev@@Base+0x9f>
  9d7e4e:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
  9d7e53:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
  9d7e58:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2
  9d7e5d:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3
  9d7e62:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4
  9d7e67:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5
  9d7e6e:	00
  9d7e6f:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6
  9d7e76:	00
  9d7e77:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
  9d7e7e:	00
  9d7e7f:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8
  9d7e84:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
  9d7e89:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  9d7e90:	00 00
  9d7e92:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
  9d7e99:	00
  9d7e9a:	48 89 e0             	mov    rax,rsp
  9d7e9d:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
  9d7ea4:	00
  9d7ea5:	48 8d 84 24 e0 00 00 	lea    rax,[rsp+0xe0]
  9d7eac:	00
  9d7ead:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
  9d7eb4:	00
  9d7eb5:	48 b8 20 00 00 00 30 	movabs rax,0x3000000020
  9d7ebc:	00 00 00
  9d7ebf:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
  9d7ec6:	00
  9d7ec7:	4c 8d 05 41 6e 97 ff 	lea    r8,[rip+0xffffffffff976e41]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
  9d7ece:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
  9d7ed5:	00
  9d7ed6:	48 89 d6             	mov    rsi,rdx
  9d7ed9:	31 d2                	xor    edx,edx
```
### `+0xa0` target `0xa02220`

```text
  a021d5:	75 13                	jne    a021ea <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0x2a>
  a021d7:	48 69 44 24 08 00 ca 	imul   rax,QWORD PTR [rsp+0x8],0x3b9aca00
  a021de:	9a 3b
  a021e0:	48 03 44 24 10       	add    rax,QWORD PTR [rsp+0x10]
  a021e5:	48 83 c4 18          	add    rsp,0x18
  a021e9:	c3                   	ret
  a021ea:	e8 91 c0 de 00       	call   17ee280 <__errno@plt>
  a021ef:	8b 38                	mov    edi,DWORD PTR [rax]
  a021f1:	48 8d 35 d9 1d 93 ff 	lea    rsi,[rip+0xffffffffff931dd9]        # 333fd1 <_ZTSSt12bad_any_cast@@Base-0x5c1f7>
  a021f8:	e8 53 c2 de 00       	call   17ee450 <_ZNSt6__ndk120__throw_system_errorEiPKc@plt>
  a021fd:	48 89 c7             	mov    rdi,rax
  a02200:	e8 a0 78 07 00       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  a02205:	cc                   	int3
  a02206:	cc                   	int3
  a02207:	cc                   	int3
  a02208:	cc                   	int3
  a02209:	cc                   	int3
  a0220a:	cc                   	int3
  a0220b:	cc                   	int3
  a0220c:	cc                   	int3
  a0220d:	cc                   	int3
  a0220e:	cc                   	int3
  a0220f:	cc                   	int3
  a02210:	48 8b 05 e1 fc ea 00 	mov    rax,QWORD PTR [rip+0xeafce1]        # 18b1ef8 <_ZTVNSt6__ndk114error_categoryE@@Base+0xbce60>
  a02217:	48 83 c0 10          	add    rax,0x10
  a0221b:	48 89 07             	mov    QWORD PTR [rdi],rax
  a0221e:	c3                   	ret
  a0221f:	cc                   	int3
  a02220:	0f 0b                	ud2
  a02222:	cc                   	int3
  a02223:	cc                   	int3
  a02224:	cc                   	int3
  a02225:	cc                   	int3
  a02226:	cc                   	int3
  a02227:	cc                   	int3
  a02228:	cc                   	int3
  a02229:	cc                   	int3
  a0222a:	cc                   	int3
  a0222b:	cc                   	int3
  a0222c:	cc                   	int3
  a0222d:	cc                   	int3
  a0222e:	cc                   	int3
  a0222f:	cc                   	int3
  a02230:	89 f0                	mov    eax,esi
  a02232:	48 89 fa             	mov    rdx,rdi
  a02235:	c3                   	ret
  a02236:	cc                   	int3
  a02237:	cc                   	int3
  a02238:	cc                   	int3
  a02239:	cc                   	int3
  a0223a:	cc                   	int3
  a0223b:	cc                   	int3
  a0223c:	cc                   	int3
  a0223d:	cc                   	int3
  a0223e:	cc                   	int3
  a0223f:	cc                   	int3
  a02240:	53                   	push   rbx
  a02241:	48 89 d3             	mov    rbx,rdx
  a02244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a02247:	ff 50 18             	call   QWORD PTR [rax+0x18]
  a0224a:	48 3b 53 08          	cmp    rdx,QWORD PTR [rbx+0x8]
  a0224e:	0f 94 c1             	sete   cl
  a02251:	3b 03                	cmp    eax,DWORD PTR [rbx]
  a02253:	0f 94 c0             	sete   al
  a02256:	20 c8                	and    al,cl
  a02258:	5b                   	pop    rbx
  a02259:	c3                   	ret
  a0225a:	cc                   	int3
  a0225b:	cc                   	int3
  a0225c:	cc                   	int3
  a0225d:	cc                   	int3
  a0225e:	cc                   	int3
  a0225f:	cc                   	int3
  a02260:	48 39 7e 08          	cmp    QWORD PTR [rsi+0x8],rdi
  a02264:	0f 94 c1             	sete   cl
  a02267:	39 16                	cmp    DWORD PTR [rsi],edx
  a02269:	0f 94 c0             	sete   al
  a0226c:	20 c8                	and    al,cl
  a0226e:	c3                   	ret
  a0226f:	cc                   	int3
  a02270:	50                   	push   rax
  a02271:	e8 fa d8 de 00       	call   17efb70 <__cxa_uncaught_exceptions@plt>
  a02276:	85 c0                	test   eax,eax
  a02278:	0f 9f c0             	setg   al
  a0227b:	59                   	pop    rcx
  a0227c:	c3                   	ret
  a0227d:	cc                   	int3
  a0227e:	cc                   	int3
  a0227f:	cc                   	int3
  a02280:	e9 eb d8 de 00       	jmp    17efb70 <__cxa_uncaught_exceptions@plt>
  a02285:	cc                   	int3
  a02286:	cc                   	int3
  a02287:	cc                   	int3
  a02288:	cc                   	int3
  a02289:	cc                   	int3
  a0228a:	cc                   	int3
  a0228b:	cc                   	int3
  a0228c:	cc                   	int3
  a0228d:	cc                   	int3
  a0228e:	cc                   	int3
  a0228f:	cc                   	int3
  a02290:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
  a02293:	e9 e8 d8 de 00       	jmp    17efb80 <__cxa_decrement_exception_refcount@plt>
  a02298:	cc                   	int3
  a02299:	cc                   	int3
  a0229a:	cc                   	int3
  a0229b:	cc                   	int3
  a0229c:	cc                   	int3
  a0229d:	cc                   	int3
  a0229e:	cc                   	int3
  a0229f:	cc                   	int3
  a022a0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  a022a3:	48 89 07             	mov    QWORD PTR [rdi],rax
  a022a6:	48 89 c7             	mov    rdi,rax
  a022a9:	e9 e2 d8 de 00       	jmp    17efb90 <__cxa_increment_exception_refcount@plt>
  a022ae:	cc                   	int3
  a022af:	cc                   	int3
  a022b0:	41 56                	push   r14
  a022b2:	53                   	push   rbx
  a022b3:	50                   	push   rax
  a022b4:	48 89 fb             	mov    rbx,rdi
  a022b7:	48 8b 3e             	mov    rdi,QWORD PTR [rsi]
  a022ba:	48 39 3b             	cmp    QWORD PTR [rbx],rdi
  a022bd:	74 16                	je     a022d5 <_ZNSt13exception_ptraSERKS_@@Base+0x25>
  a022bf:	49 89 f6             	mov    r14,rsi
  a022c2:	e8 c9 d8 de 00       	call   17efb90 <__cxa_increment_exception_refcount@plt>
  a022c7:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  a022ca:	e8 b1 d8 de 00       	call   17efb80 <__cxa_decrement_exception_refcount@plt>
```
### `+0xa0` target `0xa50370`

```text
  a50323:	48 89 df             	mov    rdi,rbx
  a50326:	5b                   	pop    rbx
  a50327:	e9 f4 db d9 00       	jmp    17edf20 <_ZdlPv@plt>
  a5032c:	cc                   	int3
  a5032d:	cc                   	int3
  a5032e:	cc                   	int3
  a5032f:	cc                   	int3
  a50330:	53                   	push   rbx
  a50331:	48 89 fb             	mov    rbx,rdi
  a50334:	f6 47 48 01          	test   BYTE PTR [rdi+0x48],0x1
  a50338:	75 0e                	jne    a50348 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa28>
  a5033a:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
  a5033e:	75 17                	jne    a50357 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa37>
  a50340:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
  a50344:	75 20                	jne    a50366 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa46>
  a50346:	5b                   	pop    rbx
  a50347:	c3                   	ret
  a50348:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
  a5034c:	e8 cf db d9 00       	call   17edf20 <_ZdlPv@plt>
  a50351:	f6 43 30 01          	test   BYTE PTR [rbx+0x30],0x1
  a50355:	74 e9                	je     a50340 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa20>
  a50357:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
  a5035b:	e8 c0 db d9 00       	call   17edf20 <_ZdlPv@plt>
  a50360:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
  a50364:	74 e0                	je     a50346 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa26>
  a50366:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  a5036a:	5b                   	pop    rbx
  a5036b:	e9 b0 db d9 00       	jmp    17edf20 <_ZdlPv@plt>
  a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>
  a50375:	cc                   	int3
  a50376:	cc                   	int3
  a50377:	cc                   	int3
  a50378:	cc                   	int3
  a50379:	cc                   	int3
  a5037a:	cc                   	int3
  a5037b:	cc                   	int3
  a5037c:	cc                   	int3
  a5037d:	cc                   	int3
  a5037e:	cc                   	int3
  a5037f:	cc                   	int3
  a50380:	41 57                	push   r15
  a50382:	41 56                	push   r14
  a50384:	53                   	push   rbx
  a50385:	48 83 ec 30          	sub    rsp,0x30
  a50389:	49 89 d7             	mov    r15,rdx
  a5038c:	48 89 f0             	mov    rax,rsi
  a5038f:	48 89 fb             	mov    rbx,rdi
  a50392:	89 ce                	mov    esi,ecx
  a50394:	4c 89 c2             	mov    rdx,r8
  a50397:	48 89 c1             	mov    rcx,rax
  a5039a:	e8 41 fa d9 00       	call   17efde0 <_ZNSt6__ndk112system_errorC2ENS_10error_codeERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@plt>
  a5039f:	48 8b 05 62 1b e6 00 	mov    rax,QWORD PTR [rip+0xe61b62]        # 18b1f08 <_ZTVNSt6__ndk14__fs10filesystem16filesystem_errorE@@Base+0xbcde8>
  a503a6:	48 83 c0 10          	add    rax,0x10
  a503aa:	48 89 03             	mov    QWORD PTR [rbx],rax
  a503ad:	4c 8d 73 20          	lea    r14,[rbx+0x20]
  a503b1:	0f 57 c0             	xorps  xmm0,xmm0
  a503b4:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  a503b9:	48 c7 44 24 20 00 00 	mov    QWORD PTR [rsp+0x20],0x0
  a503c0:	00 00
  a503c2:	48 8d 74 24 0f       	lea    rsi,[rsp+0xf]
  a503c7:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
  a503cc:	4c 89 f7             	mov    rdi,r14
  a503cf:	4c 89 fa             	mov    rdx,r15
  a503d2:	e8 69 00 00 00       	call   a50440 <_ZdaPv@@Base+0xd0>
  a503d7:	f6 44 24 10 01       	test   BYTE PTR [rsp+0x10],0x1
  a503dc:	74 0a                	je     a503e8 <_ZdaPv@@Base+0x78>
  a503de:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  a503e3:	e8 38 db d9 00       	call   17edf20 <_ZdlPv@plt>
  a503e8:	48 89 df             	mov    rdi,rbx
  a503eb:	be 01 00 00 00       	mov    esi,0x1
  a503f0:	e8 eb f7 d9 00       	call   17efbe0 <_ZNSt6__ndk14__fs10filesystem16filesystem_error13__create_whatEi@plt>
  a503f5:	48 83 c4 30          	add    rsp,0x30
  a503f9:	5b                   	pop    rbx
  a503fa:	41 5e                	pop    r14
  a503fc:	41 5f                	pop    r15
  a503fe:	c3                   	ret
  a503ff:	49 89 c7             	mov    r15,rax
  a50402:	4c 89 f7             	mov    rdi,r14
  a50405:	e8 e6 f0 ff ff       	call   a4f4f0 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iteratorC1ERKNS1_4pathENS1_17directory_optionsEPNS_10error_codeE@@Base+0x3e0>
  a5040a:	48 89 df             	mov    rdi,rbx
  a5040d:	e8 de f7 d9 00       	call   17efbf0 <_ZNSt6__ndk112system_errorD2Ev@plt>
  a50412:	4c 89 ff             	mov    rdi,r15
  a50415:	e8 b6 f8 01 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a5041a:	49 89 c7             	mov    r15,rax
  a5041d:	f6 44 24 10 01       	test   BYTE PTR [rsp+0x10],0x1
  a50422:	74 0a                	je     a5042e <_ZdaPv@@Base+0xbe>
  a50424:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  a50429:	e8 f2 da d9 00       	call   17edf20 <_ZdlPv@plt>
  a5042e:	48 89 df             	mov    rdi,rbx
  a50431:	e8 ba f7 d9 00       	call   17efbf0 <_ZNSt6__ndk112system_errorD2Ev@plt>
  a50436:	4c 89 ff             	mov    rdi,r15
  a50439:	e8 92 f8 01 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  a5043e:	cc                   	int3
  a5043f:	cc                   	int3
  a50440:	55                   	push   rbp
  a50441:	41 57                	push   r15
  a50443:	41 56                	push   r14
  a50445:	41 55                	push   r13
  a50447:	41 54                	push   r12
  a50449:	53                   	push   rbx
  a5044a:	50                   	push   rax
  a5044b:	49 89 cc             	mov    r12,rcx
  a5044e:	48 89 d5             	mov    rbp,rdx
  a50451:	49 89 fe             	mov    r14,rdi
  a50454:	bf 60 00 00 00       	mov    edi,0x60
  a50459:	e8 a2 da d9 00       	call   17edf00 <_Znwm@plt>
  a5045e:	49 89 c5             	mov    r13,rax
  a50461:	48 89 c3             	mov    rbx,rax
  a50464:	0f 57 c0             	xorps  xmm0,xmm0
  a50467:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  a5046b:	48 8d 05 a6 8e da 00 	lea    rax,[rip+0xda8ea6]        # 17f9318 <_ZTINSt6__ndk111regex_errorE@@Base+0x28>
  a50472:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  a50476:	4d 8d 7d 18          	lea    r15,[r13+0x18]
  a5047a:	f6 45 00 01          	test   BYTE PTR [rbp+0x0],0x1
  a5047e:	75 12                	jne    a50492 <_ZdaPv@@Base+0x122>
  a50480:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
  a50484:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
  a50488:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
  a5048c:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
  a50490:	eb 10                	jmp    a504a2 <_ZdaPv@@Base+0x132>
  a50492:	48 8b 55 08          	mov    rdx,QWORD PTR [rbp+0x8]
  a50496:	48 8b 75 10          	mov    rsi,QWORD PTR [rbp+0x10]
  a5049a:	4c 89 ff             	mov    rdi,r15
  a5049d:	e8 c0 b5 02 00       	call   a7ba62 <JNI_OnUnload@@Base+0x332f>
  a504a2:	49 83 c5 30          	add    r13,0x30
  a504a6:	41 f6 04 24 01       	test   BYTE PTR [r12],0x1
  a504ab:	75 15                	jne    a504c2 <_ZdaPv@@Base+0x152>
  a504ad:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
```
### `+0xa0` target `0xad647a`

```text
  ad6413:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad641a:	00 00
  ad641c:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  ad6421:	75 2e                	jne    ad6451 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x233f1>
  ad6423:	48 89 d8             	mov    rax,rbx
  ad6426:	48 83 c4 28          	add    rsp,0x28
  ad642a:	5b                   	pop    rbx
  ad642b:	41 5e                	pop    r14
  ad642d:	c3                   	ret
  ad642e:	48 89 c3             	mov    rbx,rax
  ad6431:	48 89 e7             	mov    rdi,rsp
  ad6434:	e8 91 3e fa ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  ad6439:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad6440:	00 00
  ad6442:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  ad6447:	75 08                	jne    ad6451 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x233f1>
  ad6449:	48 89 df             	mov    rdi,rbx
  ad644c:	e8 7f 98 f9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  ad6451:	e8 5a 96 d1 00       	call   17efab0 <__stack_chk_fail@plt>
  ad6456:	48 8d 47 10          	lea    rax,[rdi+0x10]
  ad645a:	48 8d 0d 0f ab d2 00 	lea    rcx,[rip+0xd2ab0f]        # 1800f70 <_ZTIN4asio22service_already_existsE@@Base+0x2758>
  ad6461:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  ad6464:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  ad6468:	48 89 c6             	mov    rsi,rax
  ad646b:	e9 20 3e fa ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ad6470:	48 83 c7 10          	add    rdi,0x10
  ad6474:	e9 f1 3a fa ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  ad6479:	cc                   	int3
  ad647a:	53                   	push   rbx
  ad647b:	48 89 fb             	mov    rbx,rdi
  ad647e:	48 83 c7 10          	add    rdi,0x10
  ad6482:	e8 e3 3a fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad6487:	48 89 df             	mov    rdi,rbx
  ad648a:	5b                   	pop    rbx
  ad648b:	e9 90 7a d1 00       	jmp    17edf20 <_ZdlPv@plt>
  ad6490:	41 57                	push   r15
  ad6492:	41 56                	push   r14
  ad6494:	41 55                	push   r13
  ad6496:	41 54                	push   r12
  ad6498:	53                   	push   rbx
  ad6499:	48 81 ec 60 01 00 00 	sub    rsp,0x160
  ad64a0:	4d 89 cf             	mov    r15,r9
  ad64a3:	4d 89 c4             	mov    r12,r8
  ad64a6:	49 89 f6             	mov    r14,rsi
  ad64a9:	48 89 fb             	mov    rbx,rdi
  ad64ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad64b3:	00 00
  ad64b5:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
  ad64bc:	00
  ad64bd:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
  ad64c2:	4c 89 ef             	mov    rdi,r13
  ad64c5:	48 89 ce             	mov    rsi,rcx
  ad64c8:	e8 a3 af b2 00       	call   1601470 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4469f4>
  ad64cd:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
  ad64d4:	00
  ad64d5:	4c 89 e6             	mov    rsi,r12
  ad64d8:	e8 29 01 00 00       	call   ad6606 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235a6>
  ad64dd:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  ad64e4:	00
  ad64e5:	4c 89 fe             	mov    rsi,r15
  ad64e8:	e8 5d 01 00 00       	call   ad664a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235ea>
  ad64ed:	4c 89 ef             	mov    rdi,r13
  ad64f0:	e8 bd b7 b2 00       	call   1601cb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x447236>
  ad64f5:	84 c0                	test   al,al
  ad64f7:	75 4e                	jne    ad6547 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x234e7>
  ad64f9:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
  ad64fd:	e8 60 3f fa ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
  ad6502:	84 c0                	test   al,al
  ad6504:	74 41                	je     ad6547 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x234e7>
  ad6506:	4c 8d b4 24 90 00 00 	lea    r14,[rsp+0x90]
  ad650d:	00
  ad650e:	4c 89 f7             	mov    rdi,r14
  ad6511:	e8 e6 3e b1 00       	call   15ea3fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f980>
  ad6516:	41 c7 06 0b 00 00 00 	mov    DWORD PTR [r14],0xb
  ad651d:	48 8d 05 34 a3 e7 00 	lea    rax,[rip+0xe7a334]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>
  ad6524:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  ad6528:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
  ad652f:	00
  ad6530:	4c 89 f6             	mov    rsi,r14
  ad6533:	e8 58 78 fe ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  ad6538:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  ad653f:	00
  ad6540:	e8 0f 09 fd ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
  ad6545:	eb 12                	jmp    ad6559 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x234f9>
  ad6547:	48 8b bc 24 40 01 00 	mov    rdi,QWORD PTR [rsp+0x140]
  ad654e:	00
  ad654f:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  ad6554:	e8 37 78 fe ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  ad6559:	48 89 df             	mov    rdi,rbx
  ad655c:	e8 b0 85 b7 00       	call   164eb11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7d>
  ad6561:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  ad6568:	00
  ad6569:	e8 fc 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad656e:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
  ad6575:	00
  ad6576:	e8 ef 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad657b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  ad6580:	e8 19 b0 b2 00       	call   160159e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x446b22>
  ad6585:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad658c:	00 00
  ad658e:	48 3b 84 24 58 01 00 	cmp    rax,QWORD PTR [rsp+0x158]
  ad6595:	00
  ad6596:	75 68                	jne    ad6600 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x235a0>
  ad6598:	48 89 d8             	mov    rax,rbx
  ad659b:	48 81 c4 60 01 00 00 	add    rsp,0x160
  ad65a2:	5b                   	pop    rbx
  ad65a3:	41 5c                	pop    r12
  ad65a5:	41 5d                	pop    r13
  ad65a7:	41 5e                	pop    r14
  ad65a9:	41 5f                	pop    r15
  ad65ab:	c3                   	ret
  ad65ac:	48 89 c3             	mov    rbx,rax
  ad65af:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  ad65b6:	00
  ad65b7:	e8 98 08 fd ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
  ad65bc:	eb 03                	jmp    ad65c1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23561>
  ad65be:	48 89 c3             	mov    rbx,rax
  ad65c1:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  ad65c8:	00
  ad65c9:	e8 9c 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad65ce:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
  ad65d5:	00
  ad65d6:	e8 8f 39 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad65db:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  ad65e0:	e8 b9 af b2 00       	call   160159e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x446b22>
  ad65e5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ad65ec:	00 00
  ad65ee:	48 3b 84 24 58 01 00 	cmp    rax,QWORD PTR [rsp+0x158]
```
### `+0xa0` target `0xe9929a`

```text
  e99242:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99249:	00 00
  e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>
  e99252:	48 83 c4 20          	add    rsp,0x20
  e99256:	5b                   	pop    rbx
  e99257:	e9 2a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9925c:	e8 4f 68 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99261:	48 89 c7             	mov    rdi,rax
  e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e99269:	cc                   	int3
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
```
### `+0xa0` target `0xe992a2`

```text
  e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>
  e99252:	48 83 c4 20          	add    rsp,0x20
  e99256:	5b                   	pop    rbx
  e99257:	e9 2a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9925c:	e8 4f 68 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99261:	48 89 c7             	mov    rdi,rax
  e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e99269:	cc                   	int3
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
```
### `+0xa0` target `0xe992b6`

```text
  e99261:	48 89 c7             	mov    rdi,rax
  e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e99269:	cc                   	int3
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
```
### `+0xa0` target `0xe99382`

```text
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
```
### `+0xa0` target `0xe993ae`

```text
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
```
### `+0xa0` target `0xeaaf6e`

```text
  eaaf14:	5b                   	pop    rbx
  eaaf15:	41 5e                	pop    r14
  eaaf17:	41 5f                	pop    r15
  eaaf19:	e9 14 7b c4 ff       	jmp    af2a32 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f9d2>
  eaaf1e:	48 8d 05 a3 64 98 00 	lea    rax,[rip+0x9864a3]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  eaaf25:	48 89 07             	mov    QWORD PTR [rdi],rax
  eaaf28:	e9 e3 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  eaaf2d:	cc                   	int3
  eaaf2e:	53                   	push   rbx
  eaaf2f:	48 89 fb             	mov    rbx,rdi
  eaaf32:	e8 e7 ff ff ff       	call   eaaf1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72334>
  eaaf37:	48 89 df             	mov    rdi,rbx
  eaaf3a:	5b                   	pop    rbx
  eaaf3b:	e9 e0 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaaf40:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
  eaaf44:	48 83 c7 18          	add    rdi,0x18
  eaaf48:	ff 60 10             	jmp    QWORD PTR [rax+0x10]
  eaaf4b:	cc                   	int3
  eaaf4c:	48 8d 05 1d 6b 98 00 	lea    rax,[rip+0x986b1d]        # 1831a70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a08>
  eaaf53:	48 89 07             	mov    QWORD PTR [rdi],rax
  eaaf56:	e9 b5 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  eaaf5b:	cc                   	int3
  eaaf5c:	53                   	push   rbx
  eaaf5d:	48 89 fb             	mov    rbx,rdi
  eaaf60:	e8 e7 ff ff ff       	call   eaaf4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72362>
  eaaf65:	48 89 df             	mov    rdi,rbx
  eaaf68:	5b                   	pop    rbx
  eaaf69:	e9 b2 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaaf6e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
  eaaf72:	48 83 c7 18          	add    rdi,0x18
  eaaf76:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
  eaaf79:	cc                   	int3
  eaaf7a:	48 8d 05 17 6c 98 00 	lea    rax,[rip+0x986c17]        # 1831b98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3b30>
  eaaf81:	48 89 07             	mov    QWORD PTR [rdi],rax
  eaaf84:	e9 87 30 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  eaaf89:	cc                   	int3
  eaaf8a:	53                   	push   rbx
  eaaf8b:	48 89 fb             	mov    rbx,rdi
  eaaf8e:	e8 e7 ff ff ff       	call   eaaf7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72390>
  eaaf93:	48 89 df             	mov    rdi,rbx
  eaaf96:	5b                   	pop    rbx
  eaaf97:	e9 84 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaaf9c:	48 83 c7 18          	add    rdi,0x18
  eaafa0:	e9 01 00 00 00       	jmp    eaafa6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723bc>
  eaafa5:	cc                   	int3
  eaafa6:	41 57                	push   r15
  eaafa8:	41 56                	push   r14
  eaafaa:	53                   	push   rbx
  eaafab:	48 89 fb             	mov    rbx,rdi
  eaafae:	e8 3b 00 00 00       	call   eaafee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72404>
  eaafb3:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
  eaafb7:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
  eaafbb:	4d 39 fe             	cmp    r14,r15
  eaafbe:	74 0e                	je     eaafce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723e4>
  eaafc0:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  eaafc3:	e8 58 2f 94 00       	call   17edf20 <_ZdlPv@plt>
  eaafc8:	49 83 c6 08          	add    r14,0x8
  eaafcc:	eb ed                	jmp    eaafbb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723d1>
  eaafce:	48 89 df             	mov    rdi,rbx
  eaafd1:	e8 8e c0 db ff       	call   c67064 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b4004>
  eaafd6:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  eaafd9:	48 85 ff             	test   rdi,rdi
  eaafdc:	74 0a                	je     eaafe8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x723fe>
  eaafde:	5b                   	pop    rbx
  eaafdf:	41 5e                	pop    r14
  eaafe1:	41 5f                	pop    r15
  eaafe3:	e9 38 2f 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaafe8:	5b                   	pop    rbx
  eaafe9:	41 5e                	pop    r14
  eaafeb:	41 5f                	pop    r15
  eaafed:	c3                   	ret
  eaafee:	41 57                	push   r15
  eaaff0:	41 56                	push   r14
  eaaff2:	41 54                	push   r12
  eaaff4:	53                   	push   rbx
  eaaff5:	50                   	push   rax
  eaaff6:	48 89 fb             	mov    rbx,rdi
  eaaff9:	e8 a0 00 00 00       	call   eab09e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x724b4>
  eaaffe:	49 89 c6             	mov    r14,rax
  eab001:	49 89 d7             	mov    r15,rdx
  eab004:	48 89 df             	mov    rdi,rbx
  eab007:	e8 ba 00 00 00       	call   eab0c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x724dc>
  eab00c:	49 39 d7             	cmp    r15,rdx
  eab00f:	74 2a                	je     eab03b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72451>
  eab011:	49 89 d4             	mov    r12,rdx
  eab014:	4c 89 ff             	mov    rdi,r15
  eab017:	e8 b0 37 bf ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
  eab01c:	49 83 c7 30          	add    r15,0x30
  eab020:	4c 89 f8             	mov    rax,r15
  eab023:	49 2b 06             	sub    rax,QWORD PTR [r14]
  eab026:	48 3d f0 0f 00 00    	cmp    rax,0xff0
  eab02c:	75 08                	jne    eab036 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7244c>
  eab02e:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
  eab032:	49 83 c6 08          	add    r14,0x8
  eab036:	4d 39 e7             	cmp    r15,r12
  eab039:	75 d9                	jne    eab014 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7242a>
  eab03b:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0
  eab040:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
  eab044:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
  eab048:	48 29 c1             	sub    rcx,rax
  eab04b:	48 c1 f9 03          	sar    rcx,0x3
  eab04f:	48 83 f9 03          	cmp    rcx,0x3
  eab053:	72 25                	jb     eab07a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72490>
  eab055:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  eab058:	e8 c3 2e 94 00       	call   17edf20 <_ZdlPv@plt>
  eab05d:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
  eab061:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
  eab065:	48 83 c0 08          	add    rax,0x8
  eab069:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  eab06d:	48 29 c1             	sub    rcx,rax
  eab070:	48 c1 f9 03          	sar    rcx,0x3
  eab074:	48 83 f9 02          	cmp    rcx,0x2
  eab078:	77 db                	ja     eab055 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7246b>
  eab07a:	48 83 f9 01          	cmp    rcx,0x1
  eab07e:	74 0a                	je     eab08a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x724a0>
  eab080:	48 83 f9 02          	cmp    rcx,0x2
  eab084:	75 0b                	jne    eab091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x724a7>
  eab086:	6a 55                	push   0x55
  eab088:	eb 02                	jmp    eab08c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x724a2>
  eab08a:	6a 2a                	push   0x2a
  eab08c:	58                   	pop    rax
  eab08d:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  eab091:	48 83 c4 08          	add    rsp,0x8
  eab095:	5b                   	pop    rbx
  eab096:	41 5c                	pop    r12
  eab098:	41 5e                	pop    r14
  eab09a:	41 5f                	pop    r15
  eab09c:	c3                   	ret
```
### `+0xa0` target `0xeaba70`

```text
  eaba13:	e9 08 25 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaba18:	41 56                	push   r14
  eaba1a:	53                   	push   rbx
  eaba1b:	50                   	push   rax
  eaba1c:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
  eaba20:	6a 20                	push   0x20
  eaba22:	5f                   	pop    rdi
  eaba23:	e8 d8 24 94 00       	call   17edf00 <_Znwm@plt>
  eaba28:	49 89 c6             	mov    r14,rax
  eaba2b:	48 8d 05 e6 60 98 00 	lea    rax,[rip+0x9860e6]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
  eaba32:	49 89 06             	mov    QWORD PTR [r14],rax
  eaba35:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  eaba39:	48 89 de             	mov    rsi,rbx
  eaba3c:	e8 17 d3 c8 ff       	call   b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
  eaba41:	4c 89 f0             	mov    rax,r14
  eaba44:	48 83 c4 08          	add    rsp,0x8
  eaba48:	5b                   	pop    rbx
  eaba49:	41 5e                	pop    r14
  eaba4b:	c3                   	ret
  eaba4c:	48 8d 47 08          	lea    rax,[rdi+0x8]
  eaba50:	48 8d 0d c1 60 98 00 	lea    rcx,[rip+0x9860c1]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
  eaba57:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  eaba5a:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
  eaba5e:	48 89 c6             	mov    rsi,rax
  eaba61:	e9 f2 d2 c8 ff       	jmp    b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
  eaba66:	48 83 c7 08          	add    rdi,0x8
  eaba6a:	e9 70 df fe ff       	jmp    e999df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60df5>
  eaba6f:	cc                   	int3
  eaba70:	48 8d 05 69 60 98 00 	lea    rax,[rip+0x986069]        # 1831ae0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a78>
  eaba77:	48 89 07             	mov    QWORD PTR [rdi],rax
  eaba7a:	e9 91 25 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  eaba7f:	cc                   	int3
  eaba80:	53                   	push   rbx
  eaba81:	48 89 fb             	mov    rbx,rdi
  eaba84:	e8 e7 ff ff ff       	call   eaba70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72e86>
  eaba89:	48 89 df             	mov    rdi,rbx
  eaba8c:	5b                   	pop    rbx
  eaba8d:	e9 8e 24 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaba92:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  eaba96:	48 83 c7 20          	add    rdi,0x20
  eaba9a:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
  eaba9d:	cc                   	int3
  eaba9e:	41 57                	push   r15
  eabaa0:	41 56                	push   r14
  eabaa2:	41 54                	push   r12
  eabaa4:	53                   	push   rbx
  eabaa5:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  eabaac:	48 89 fb             	mov    rbx,rdi
  eabaaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabab6:	00 00
  eabab8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  eababf:	00
  eabac0:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
  eabac4:	49 89 e7             	mov    r15,rsp
  eabac7:	4c 89 ff             	mov    rdi,r15
  eabaca:	48 89 d6             	mov    rsi,rdx
  eabacd:	e8 68 ec 92 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  eabad2:	48 8d 35 86 f2 d8 ff 	lea    rsi,[rip+0xffffffffffd8f286]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
  eabad9:	48 8d 15 a6 da cb ff 	lea    rdx,[rip+0xffffffffffcbdaa6]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
  eabae0:	48 8d 0d 01 02 00 00 	lea    rcx,[rip+0x201]        # eabce8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730fe>
  eabae7:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  eabaec:	6a 40                	push   0x40
  eabaee:	41 59                	pop    r9
  eabaf0:	4c 89 e7             	mov    rdi,r12
  eabaf3:	4d 89 f8             	mov    r8,r15
  eabaf6:	e8 99 ec 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  eabafb:	49 8b 06             	mov    rax,QWORD PTR [r14]
  eabafe:	48 89 df             	mov    rdi,rbx
  eabb01:	4c 89 f6             	mov    rsi,r14
  eabb04:	4c 89 e2             	mov    rdx,r12
  eabb07:	ff 50 40             	call   QWORD PTR [rax+0x40]
  eabb0a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabb0f:	e8 d4 ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb14:	48 89 e7             	mov    rdi,rsp
  eabb17:	e8 cc ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb1c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb23:	00 00
  eabb25:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabb2c:	00
  eabb2d:	75 42                	jne    eabb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72f87>
  eabb2f:	48 89 d8             	mov    rax,rbx
  eabb32:	48 81 c4 88 00 00 00 	add    rsp,0x88
  eabb39:	5b                   	pop    rbx
  eabb3a:	41 5c                	pop    r12
  eabb3c:	41 5e                	pop    r14
  eabb3e:	41 5f                	pop    r15
  eabb40:	c3                   	ret
  eabb41:	48 89 c3             	mov    rbx,rax
  eabb44:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabb49:	e8 9a ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb4e:	48 89 e7             	mov    rdi,rsp
  eabb51:	e8 92 ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb56:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb5d:	00 00
  eabb5f:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabb66:	00
  eabb67:	75 08                	jne    eabb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72f87>
  eabb69:	48 89 df             	mov    rdi,rbx
  eabb6c:	e8 5f 41 bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabb71:	e8 3a 3f 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabb76:	41 57                	push   r15
  eabb78:	41 56                	push   r14
  eabb7a:	41 54                	push   r12
  eabb7c:	53                   	push   rbx
  eabb7d:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  eabb84:	48 89 fb             	mov    rbx,rdi
  eabb87:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb8e:	00 00
  eabb90:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  eabb97:	00
  eabb98:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
  eabb9c:	49 89 e7             	mov    r15,rsp
  eabb9f:	4c 89 ff             	mov    rdi,r15
  eabba2:	48 89 d6             	mov    rsi,rdx
  eabba5:	e8 90 eb 92 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  eabbaa:	48 8d 35 ae f1 d8 ff 	lea    rsi,[rip+0xffffffffffd8f1ae]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
  eabbb1:	48 8d 15 ce d9 cb ff 	lea    rdx,[rip+0xffffffffffcbd9ce]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
  eabbb8:	48 8d 0d a5 00 00 00 	lea    rcx,[rip+0xa5]        # eabc64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7307a>
  eabbbf:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  eabbc4:	6a 40                	push   0x40
  eabbc6:	41 59                	pop    r9
  eabbc8:	4c 89 e7             	mov    rdi,r12
  eabbcb:	4d 89 f8             	mov    r8,r15
  eabbce:	e8 c1 eb 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  eabbd3:	49 8b 06             	mov    rax,QWORD PTR [r14]
  eabbd6:	48 89 df             	mov    rdi,rbx
  eabbd9:	4c 89 f6             	mov    rsi,r14
  eabbdc:	4c 89 e2             	mov    rdx,r12
```
### `+0xa0` target `0xeaba80`

```text
  eaba1c:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
  eaba20:	6a 20                	push   0x20
  eaba22:	5f                   	pop    rdi
  eaba23:	e8 d8 24 94 00       	call   17edf00 <_Znwm@plt>
  eaba28:	49 89 c6             	mov    r14,rax
  eaba2b:	48 8d 05 e6 60 98 00 	lea    rax,[rip+0x9860e6]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
  eaba32:	49 89 06             	mov    QWORD PTR [r14],rax
  eaba35:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  eaba39:	48 89 de             	mov    rsi,rbx
  eaba3c:	e8 17 d3 c8 ff       	call   b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
  eaba41:	4c 89 f0             	mov    rax,r14
  eaba44:	48 83 c4 08          	add    rsp,0x8
  eaba48:	5b                   	pop    rbx
  eaba49:	41 5e                	pop    r14
  eaba4b:	c3                   	ret
  eaba4c:	48 8d 47 08          	lea    rax,[rdi+0x8]
  eaba50:	48 8d 0d c1 60 98 00 	lea    rcx,[rip+0x9860c1]        # 1831b18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3ab0>
  eaba57:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  eaba5a:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
  eaba5e:	48 89 c6             	mov    rsi,rax
  eaba61:	e9 f2 d2 c8 ff       	jmp    b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
  eaba66:	48 83 c7 08          	add    rdi,0x8
  eaba6a:	e9 70 df fe ff       	jmp    e999df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60df5>
  eaba6f:	cc                   	int3
  eaba70:	48 8d 05 69 60 98 00 	lea    rax,[rip+0x986069]        # 1831ae0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3a78>
  eaba77:	48 89 07             	mov    QWORD PTR [rdi],rax
  eaba7a:	e9 91 25 94 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  eaba7f:	cc                   	int3
  eaba80:	53                   	push   rbx
  eaba81:	48 89 fb             	mov    rbx,rdi
  eaba84:	e8 e7 ff ff ff       	call   eaba70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72e86>
  eaba89:	48 89 df             	mov    rdi,rbx
  eaba8c:	5b                   	pop    rbx
  eaba8d:	e9 8e 24 94 00       	jmp    17edf20 <_ZdlPv@plt>
  eaba92:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  eaba96:	48 83 c7 20          	add    rdi,0x20
  eaba9a:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
  eaba9d:	cc                   	int3
  eaba9e:	41 57                	push   r15
  eabaa0:	41 56                	push   r14
  eabaa2:	41 54                	push   r12
  eabaa4:	53                   	push   rbx
  eabaa5:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  eabaac:	48 89 fb             	mov    rbx,rdi
  eabaaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabab6:	00 00
  eabab8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  eababf:	00
  eabac0:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
  eabac4:	49 89 e7             	mov    r15,rsp
  eabac7:	4c 89 ff             	mov    rdi,r15
  eabaca:	48 89 d6             	mov    rsi,rdx
  eabacd:	e8 68 ec 92 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  eabad2:	48 8d 35 86 f2 d8 ff 	lea    rsi,[rip+0xffffffffffd8f286]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
  eabad9:	48 8d 15 a6 da cb ff 	lea    rdx,[rip+0xffffffffffcbdaa6]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
  eabae0:	48 8d 0d 01 02 00 00 	lea    rcx,[rip+0x201]        # eabce8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730fe>
  eabae7:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  eabaec:	6a 40                	push   0x40
  eabaee:	41 59                	pop    r9
  eabaf0:	4c 89 e7             	mov    rdi,r12
  eabaf3:	4d 89 f8             	mov    r8,r15
  eabaf6:	e8 99 ec 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  eabafb:	49 8b 06             	mov    rax,QWORD PTR [r14]
  eabafe:	48 89 df             	mov    rdi,rbx
  eabb01:	4c 89 f6             	mov    rsi,r14
  eabb04:	4c 89 e2             	mov    rdx,r12
  eabb07:	ff 50 40             	call   QWORD PTR [rax+0x40]
  eabb0a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabb0f:	e8 d4 ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb14:	48 89 e7             	mov    rdi,rsp
  eabb17:	e8 cc ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb1c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb23:	00 00
  eabb25:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabb2c:	00
  eabb2d:	75 42                	jne    eabb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72f87>
  eabb2f:	48 89 d8             	mov    rax,rbx
  eabb32:	48 81 c4 88 00 00 00 	add    rsp,0x88
  eabb39:	5b                   	pop    rbx
  eabb3a:	41 5c                	pop    r12
  eabb3c:	41 5e                	pop    r14
  eabb3e:	41 5f                	pop    r15
  eabb40:	c3                   	ret
  eabb41:	48 89 c3             	mov    rbx,rax
  eabb44:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabb49:	e8 9a ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb4e:	48 89 e7             	mov    rdi,rsp
  eabb51:	e8 92 ec 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabb56:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb5d:	00 00
  eabb5f:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabb66:	00
  eabb67:	75 08                	jne    eabb71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72f87>
  eabb69:	48 89 df             	mov    rdi,rbx
  eabb6c:	e8 5f 41 bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabb71:	e8 3a 3f 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabb76:	41 57                	push   r15
  eabb78:	41 56                	push   r14
  eabb7a:	41 54                	push   r12
  eabb7c:	53                   	push   rbx
  eabb7d:	48 81 ec 88 00 00 00 	sub    rsp,0x88
  eabb84:	48 89 fb             	mov    rbx,rdi
  eabb87:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabb8e:	00 00
  eabb90:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
  eabb97:	00
  eabb98:	4c 8b 76 08          	mov    r14,QWORD PTR [rsi+0x8]
  eabb9c:	49 89 e7             	mov    r15,rsp
  eabb9f:	4c 89 ff             	mov    rdi,r15
  eabba2:	48 89 d6             	mov    rsi,rdx
  eabba5:	e8 90 eb 92 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
  eabbaa:	48 8d 35 ae f1 d8 ff 	lea    rsi,[rip+0xffffffffffd8f1ae]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
  eabbb1:	48 8d 15 ce d9 cb ff 	lea    rdx,[rip+0xffffffffffcbd9ce]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
  eabbb8:	48 8d 0d a5 00 00 00 	lea    rcx,[rip+0xa5]        # eabc64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7307a>
  eabbbf:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  eabbc4:	6a 40                	push   0x40
  eabbc6:	41 59                	pop    r9
  eabbc8:	4c 89 e7             	mov    rdi,r12
  eabbcb:	4d 89 f8             	mov    r8,r15
  eabbce:	e8 c1 eb 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  eabbd3:	49 8b 06             	mov    rax,QWORD PTR [r14]
  eabbd6:	48 89 df             	mov    rdi,rbx
  eabbd9:	4c 89 f6             	mov    rsi,r14
  eabbdc:	4c 89 e2             	mov    rdx,r12
  eabbdf:	ff 50 38             	call   QWORD PTR [rax+0x38]
  eabbe2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabbe7:	e8 fc eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabbec:	48 89 e7             	mov    rdi,rsp
```
### `+0xa0` target `0xeabc4e`

```text
  eabbe7:	e8 fc eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabbec:	48 89 e7             	mov    rdi,rsp
  eabbef:	e8 f4 eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabbf4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabbfb:	00 00
  eabbfd:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabc04:	00
  eabc05:	75 42                	jne    eabc49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7305f>
  eabc07:	48 89 d8             	mov    rax,rbx
  eabc0a:	48 81 c4 88 00 00 00 	add    rsp,0x88
  eabc11:	5b                   	pop    rbx
  eabc12:	41 5c                	pop    r12
  eabc14:	41 5e                	pop    r14
  eabc16:	41 5f                	pop    r15
  eabc18:	c3                   	ret
  eabc19:	48 89 c3             	mov    rbx,rax
  eabc1c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  eabc21:	e8 c2 eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabc26:	48 89 e7             	mov    rdi,rsp
  eabc29:	e8 ba eb 92 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  eabc2e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabc35:	00 00
  eabc37:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
  eabc3e:	00
  eabc3f:	75 08                	jne    eabc49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7305f>
  eabc41:	48 89 df             	mov    rdi,rbx
  eabc44:	e8 87 40 bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabc49:	e8 62 3e 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabc4e:	53                   	push   rbx
  eabc4f:	48 89 fb             	mov    rbx,rdi
  eabc52:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
  eabc56:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  eabc59:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
  eabc5f:	48 89 d8             	mov    rax,rbx
  eabc62:	5b                   	pop    rbx
  eabc63:	c3                   	ret
  eabc64:	41 57                	push   r15
  eabc66:	41 56                	push   r14
  eabc68:	53                   	push   rbx
  eabc69:	48 83 ec 20          	sub    rsp,0x20
  eabc6d:	48 89 d3             	mov    rbx,rdx
  eabc70:	49 89 fe             	mov    r14,rdi
  eabc73:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabc7a:	00 00
  eabc7c:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  eabc81:	48 83 c6 30          	add    rsi,0x30
  eabc85:	49 89 e7             	mov    r15,rsp
  eabc88:	4c 89 ff             	mov    rdi,r15
  eabc8b:	e8 9a e8 81 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
  eabc90:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
  eabc94:	4c 89 fe             	mov    rsi,r15
  eabc97:	48 89 da             	mov    rdx,rbx
  eabc9a:	41 ff 56 28          	call   QWORD PTR [r14+0x28]
  eabc9e:	48 89 e7             	mov    rdi,rsp
  eabca1:	e8 ea 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabca6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcad:	00 00
  eabcaf:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabcb4:	75 2d                	jne    eabce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730f9>
  eabcb6:	48 83 c4 20          	add    rsp,0x20
  eabcba:	5b                   	pop    rbx
  eabcbb:	41 5e                	pop    r14
  eabcbd:	41 5f                	pop    r15
  eabcbf:	c3                   	ret
  eabcc0:	48 89 c3             	mov    rbx,rax
  eabcc3:	48 89 e7             	mov    rdi,rsp
  eabcc6:	e8 c5 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabccb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcd2:	00 00
  eabcd4:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabcd9:	75 08                	jne    eabce3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x730f9>
  eabcdb:	48 89 df             	mov    rdi,rbx
  eabcde:	e8 ed 3f bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabce3:	e8 c8 3d 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabce8:	41 57                	push   r15
  eabcea:	41 56                	push   r14
  eabcec:	53                   	push   rbx
  eabced:	48 83 ec 20          	sub    rsp,0x20
  eabcf1:	48 89 f3             	mov    rbx,rsi
  eabcf4:	49 89 fe             	mov    r14,rdi
  eabcf7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabcfe:	00 00
  eabd00:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  eabd05:	48 83 c6 30          	add    rsi,0x30
  eabd09:	49 89 e7             	mov    r15,rsp
  eabd0c:	4c 89 ff             	mov    rdi,r15
  eabd0f:	e8 16 e8 81 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
  eabd14:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  eabd18:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
  eabd1c:	4c 89 fe             	mov    rsi,r15
  eabd1f:	41 ff 56 28          	call   QWORD PTR [r14+0x28]
  eabd23:	48 89 e7             	mov    rdi,rsp
  eabd26:	e8 65 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabd2b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabd32:	00 00
  eabd34:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabd39:	75 2d                	jne    eabd68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7317e>
  eabd3b:	48 83 c4 20          	add    rsp,0x20
  eabd3f:	5b                   	pop    rbx
  eabd40:	41 5e                	pop    r14
  eabd42:	41 5f                	pop    r15
  eabd44:	c3                   	ret
  eabd45:	48 89 c3             	mov    rbx,rax
  eabd48:	48 89 e7             	mov    rdi,rsp
  eabd4b:	e8 40 21 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  eabd50:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabd57:	00 00
  eabd59:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  eabd5e:	75 08                	jne    eabd68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7317e>
  eabd60:	48 89 df             	mov    rdi,rbx
  eabd63:	e8 68 3f bc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  eabd68:	e8 43 3d 94 00       	call   17efab0 <__stack_chk_fail@plt>
  eabd6d:	cc                   	int3
  eabd6e:	53                   	push   rbx
  eabd6f:	48 83 ec 10          	sub    rsp,0x10
  eabd73:	48 89 fb             	mov    rbx,rdi
  eabd76:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  eabd7d:	00 00
  eabd7f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  eabd84:	8b 87 28 05 00 00    	mov    eax,DWORD PTR [rdi+0x528]
  eabd8a:	b9 ff ff ff ff       	mov    ecx,0xffffffff
  eabd8f:	48 39 c8             	cmp    rax,rcx
  eabd92:	74 12                	je     eabda6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x731bc>
  eabd94:	48 8d 0d 0d 56 98 00 	lea    rcx,[rip+0x98560d]        # 18313a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3340>
  eabd9b:	48 8d 7c 24 07       	lea    rdi,[rsp+0x7]
  eabda0:	48 89 de             	mov    rsi,rbx
  eabda3:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
  eabda6:	83 8b 28 05 00 00 ff 	or     DWORD PTR [rbx+0x528],0xffffffff
```
### `+0xa0` target `0x1635176`

```text
 163511b:	50                   	push   rax
 163511c:	49 89 f6             	mov    r14,rsi
 163511f:	48 89 fb             	mov    rbx,rdi
 1635122:	e8 19 8e 1b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1635127:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 163512b:	49 83 c6 18          	add    r14,0x18
 163512f:	4c 89 f6             	mov    rsi,r14
 1635132:	e8 09 8e 1b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 1635137:	48 83 c4 08          	add    rsp,0x8
 163513b:	5b                   	pop    rbx
 163513c:	41 5e                	pop    r14
 163513e:	c3                   	ret
 163513f:	49 89 c6             	mov    r14,rax
 1635142:	48 89 df             	mov    rdi,rbx
 1635145:	e8 46 8d 1b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 163514a:	4c 89 f7             	mov    rdi,r14
 163514d:	e8 7e ab 43 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1635152:	53                   	push   rbx
 1635153:	48 89 fb             	mov    rbx,rdi
 1635156:	48 83 c7 70          	add    rdi,0x70
 163515a:	e8 07 4d 1a 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 163515f:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 1635163:	e8 64 96 46 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
 1635168:	48 83 c3 10          	add    rbx,0x10
 163516c:	48 89 df             	mov    rdi,rbx
 163516f:	5b                   	pop    rbx
 1635170:	e9 f5 4d 44 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
 1635175:	cc                   	int3
 1635176:	53                   	push   rbx
 1635177:	48 89 fb             	mov    rbx,rdi
 163517a:	e8 d3 ff ff ff       	call   1635152 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x302c0>
 163517f:	48 89 df             	mov    rdi,rbx
 1635182:	5b                   	pop    rbx
 1635183:	e9 98 8d 1b 00       	jmp    17edf20 <_ZdlPv@plt>
 1635188:	41 57                	push   r15
 163518a:	41 56                	push   r14
 163518c:	53                   	push   rbx
 163518d:	49 89 f6             	mov    r14,rsi
 1635190:	48 89 fb             	mov    rbx,rdi
 1635193:	4c 8d 7f 40          	lea    r15,[rdi+0x40]
 1635197:	48 89 f7             	mov    rdi,rsi
 163519a:	4c 89 fe             	mov    rsi,r15
 163519d:	e8 4c a5 46 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 16351a2:	84 c0                	test   al,al
 16351a4:	74 17                	je     16351bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3032b>
 16351a6:	49 8d 7e 18          	lea    rdi,[r14+0x18]
 16351aa:	48 8d 73 58          	lea    rsi,[rbx+0x58]
 16351ae:	e8 3b a5 46 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 16351b3:	84 c0                	test   al,al
 16351b5:	74 06                	je     16351bd <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3032b>
 16351b7:	5b                   	pop    rbx
 16351b8:	41 5e                	pop    r14
 16351ba:	41 5f                	pop    r15
 16351bc:	c3                   	ret
 16351bd:	4c 89 ff             	mov    rdi,r15
 16351c0:	4c 89 f6             	mov    rsi,r14
 16351c3:	e8 b8 8e 1b 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 16351c8:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 16351cc:	49 83 c6 18          	add    r14,0x18
 16351d0:	4c 89 f6             	mov    rsi,r14
 16351d3:	e8 a8 8e 1b 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
 16351d8:	48 83 c3 70          	add    rbx,0x70
 16351dc:	48 89 df             	mov    rdi,rbx
 16351df:	5b                   	pop    rbx
 16351e0:	41 5e                	pop    r14
 16351e2:	41 5f                	pop    r15
 16351e4:	e9 bf 38 4f ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
 16351e9:	cc                   	int3
 16351ea:	41 56                	push   r14
 16351ec:	53                   	push   rbx
 16351ed:	50                   	push   rax
 16351ee:	48 89 f3             	mov    rbx,rsi
 16351f1:	49 89 fe             	mov    r14,rdi
 16351f4:	e8 af 35 53 ff       	call   b687a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5748>
 16351f9:	48 8d 05 c0 b2 25 00 	lea    rax,[rip+0x25b2c0]        # 18904c0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9198>
 1635200:	49 89 06             	mov    QWORD PTR [r14],rax
 1635203:	48 8d 05 46 b4 25 00 	lea    rax,[rip+0x25b446]        # 1890650 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9328>
 163520a:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 163520e:	48 8d 05 6b b4 25 00 	lea    rax,[rip+0x25b46b]        # 1890680 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9358>
 1635215:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 1635219:	48 8d 05 88 b4 25 00 	lea    rax,[rip+0x25b488]        # 18906a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9380>
 1635220:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 1635224:	48 8d 05 ad b4 25 00 	lea    rax,[rip+0x25b4ad]        # 18906d8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x93b0>
 163522b:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
 163522f:	48 8d 05 e2 b4 25 00 	lea    rax,[rip+0x25b4e2]        # 1890718 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x93f0>
 1635236:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
 163523a:	48 8d 05 1f b5 25 00 	lea    rax,[rip+0x25b51f]        # 1890760 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9438>
 1635241:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 1635245:	48 8d 05 4c b5 25 00 	lea    rax,[rip+0x25b54c]        # 1890798 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9470>
 163524c:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
 1635250:	48 8d 05 71 b5 25 00 	lea    rax,[rip+0x25b571]        # 18907c8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x94a0>
 1635257:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
 163525b:	48 8d 05 9e b5 25 00 	lea    rax,[rip+0x25b59e]        # 1890800 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x94d8>
 1635262:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
 1635266:	48 8d 05 c3 b5 25 00 	lea    rax,[rip+0x25b5c3]        # 1890830 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9508>
 163526d:	49 89 46 50          	mov    QWORD PTR [r14+0x50],rax
 1635271:	48 8d 05 e0 b5 25 00 	lea    rax,[rip+0x25b5e0]        # 1890858 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9530>
 1635278:	49 89 46 58          	mov    QWORD PTR [r14+0x58],rax
 163527c:	48 8d 05 fd b5 25 00 	lea    rax,[rip+0x25b5fd]        # 1890880 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9558>
 1635283:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
 1635287:	48 8d 05 1a b6 25 00 	lea    rax,[rip+0x25b61a]        # 18908a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9580>
 163528e:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
 1635292:	48 8d 05 37 b6 25 00 	lea    rax,[rip+0x25b637]        # 18908d0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x95a8>
 1635299:	49 89 46 70          	mov    QWORD PTR [r14+0x70],rax
 163529d:	48 8d 05 54 b6 25 00 	lea    rax,[rip+0x25b654]        # 18908f8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x95d0>
 16352a4:	49 89 46 78          	mov    QWORD PTR [r14+0x78],rax
 16352a8:	48 8d 05 79 b6 25 00 	lea    rax,[rip+0x25b679]        # 1890928 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9600>
 16352af:	49 89 86 80 00 00 00 	mov    QWORD PTR [r14+0x80],rax
 16352b6:	48 8d 05 93 b6 25 00 	lea    rax,[rip+0x25b693]        # 1890950 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9628>
 16352bd:	49 89 86 88 00 00 00 	mov    QWORD PTR [r14+0x88],rax
 16352c4:	49 81 c6 90 00 00 00 	add    r14,0x90
 16352cb:	4c 89 f7             	mov    rdi,r14
 16352ce:	48 89 de             	mov    rsi,rbx
 16352d1:	48 83 c4 08          	add    rsp,0x8
 16352d5:	5b                   	pop    rbx
 16352d6:	41 5e                	pop    r14
 16352d8:	e9 71 d7 61 ff       	jmp    c52a4e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f9ee>
 16352dd:	cc                   	int3
 16352de:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 16352e5:	48 83 c0 50          	add    rax,0x50
 16352e9:	c3                   	ret
 16352ea:	50                   	push   rax
 16352eb:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16352f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16352f5:	ff 50 48             	call   QWORD PTR [rax+0x48]
 16352f8:	48 85 c0             	test   rax,rax
 16352fb:	0f 95 c0             	setne  al
 16352fe:	59                   	pop    rcx
```
### `+0xa0` target `0x1635366`

```text
 1635314:	59                   	pop    rcx
 1635315:	c3                   	ret
 1635316:	50                   	push   rax
 1635317:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163531e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635321:	ff 50 78             	call   QWORD PTR [rax+0x78]
 1635324:	48 85 c0             	test   rax,rax
 1635327:	0f 95 c0             	setne  al
 163532a:	59                   	pop    rcx
 163532b:	c3                   	ret
 163532c:	50                   	push   rax
 163532d:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 1635334:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635337:	ff 50 38             	call   QWORD PTR [rax+0x38]
 163533a:	48 85 c0             	test   rax,rax
 163533d:	0f 95 c0             	setne  al
 1635340:	59                   	pop    rcx
 1635341:	c3                   	ret
 1635342:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635349:	8b 40 44             	mov    eax,DWORD PTR [rax+0x44]
 163534c:	c3                   	ret
 163534d:	cc                   	int3
 163534e:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635355:	0f b6 40 48          	movzx  eax,BYTE PTR [rax+0x48]
 1635359:	c3                   	ret
 163535a:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635361:	0f b6 40 40          	movzx  eax,BYTE PTR [rax+0x40]
 1635365:	c3                   	ret
 1635366:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163536d:	e9 ce 32 00 00       	jmp    1638640 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337ae>
 1635372:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635379:	e9 e2 32 00 00       	jmp    1638660 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337ce>
 163537e:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635385:	e9 04 33 00 00       	jmp    163868e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337fc>
 163538a:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635391:	e9 26 33 00 00       	jmp    16386bc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3382a>
 1635396:	50                   	push   rax
 1635397:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163539e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16353a1:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16353a4:	8b 88 d0 00 00 00    	mov    ecx,DWORD PTR [rax+0xd0]
 16353aa:	8d 51 01             	lea    edx,[rcx+0x1]
 16353ad:	31 c0                	xor    eax,eax
 16353af:	83 f9 03             	cmp    ecx,0x3
 16353b2:	0f 42 c2             	cmovb  eax,edx
 16353b5:	59                   	pop    rcx
 16353b6:	c3                   	ret
 16353b7:	cc                   	int3
 16353b8:	53                   	push   rbx
 16353b9:	48 89 fb             	mov    rbx,rdi
 16353bc:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]
 16353c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 16353c6:	31 d2                	xor    edx,edx
 16353c8:	ff 50 10             	call   QWORD PTR [rax+0x10]
 16353cb:	48 89 d8             	mov    rax,rbx
 16353ce:	5b                   	pop    rbx
 16353cf:	c3                   	ret
 16353d0:	50                   	push   rax
 16353d1:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16353d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16353db:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16353de:	48 8d 88 20 01 00 00 	lea    rcx,[rax+0x120]
 16353e5:	48 85 c0             	test   rax,rax
 16353e8:	48 8d 05 49 66 e0 fe 	lea    rax,[rip+0xfffffffffee06649]        # 43ba38 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1644>
 16353ef:	48 0f 45 c1          	cmovne rax,rcx
 16353f3:	59                   	pop    rcx
 16353f4:	c3                   	ret
 16353f5:	cc                   	int3
 16353f6:	48 81 c7 90 00 00 00 	add    rdi,0x90
 16353fd:	e9 2c 2e 00 00       	jmp    163822e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3339c>
 1635402:	50                   	push   rax
 1635403:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163540a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 163540d:	ff 50 48             	call   QWORD PTR [rax+0x48]
 1635410:	48 8d 88 d8 00 00 00 	lea    rcx,[rax+0xd8]
 1635417:	48 85 c0             	test   rax,rax
 163541a:	48 0f 45 c1          	cmovne rax,rcx
 163541e:	59                   	pop    rcx
 163541f:	c3                   	ret
 1635420:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635427:	e9 3c 2f 00 00       	jmp    1638368 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334d6>
 163542c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635433:	e9 7c 30 00 00       	jmp    16384b4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33622>
 1635438:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 163543f:	8a 40 49             	mov    al,BYTE PTR [rax+0x49]
 1635442:	c3                   	ret
 1635443:	cc                   	int3
 1635444:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 163544b:	8b 40 68             	mov    eax,DWORD PTR [rax+0x68]
 163544e:	c3                   	ret
 163544f:	cc                   	int3
 1635450:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635457:	69 40 68 e8 03 00 00 	imul   eax,DWORD PTR [rax+0x68],0x3e8
 163545e:	c3                   	ret
 163545f:	cc                   	int3
 1635460:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635467:	e9 50 31 00 00       	jmp    16385bc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3372a>
 163546c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635473:	e9 58 31 00 00       	jmp    16385d0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3373e>
 1635478:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163547f:	e9 60 31 00 00       	jmp    16385e4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33752>
 1635484:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163548b:	e9 68 31 00 00       	jmp    16385f8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33766>
 1635490:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635497:	e9 a2 30 00 00       	jmp    163853e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x336ac>
 163549c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 16354a3:	e9 ea 30 00 00       	jmp    1638592 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33700>
 16354a8:	53                   	push   rbx
 16354a9:	48 89 fb             	mov    rbx,rdi
 16354ac:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]
 16354b3:	e8 50 32 00 00       	call   1638708 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33876>
 16354b8:	48 89 d8             	mov    rax,rbx
 16354bb:	5b                   	pop    rbx
 16354bc:	c3                   	ret
 16354bd:	cc                   	int3
 16354be:	50                   	push   rax
 16354bf:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16354c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16354c9:	ff 50 30             	call   QWORD PTR [rax+0x30]
 16354cc:	48 85 c0             	test   rax,rax
 16354cf:	74 09                	je     16354da <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30648>
 16354d1:	80 78 28 00          	cmp    BYTE PTR [rax+0x28],0x0
 16354d5:	0f 95 c0             	setne  al
 16354d8:	eb 02                	jmp    16354dc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3064a>
 16354da:	b0 01                	mov    al,0x1
 16354dc:	59                   	pop    rcx
 16354dd:	c3                   	ret
 16354de:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
```
### `+0xa0` target `0x163537e`

```text
 163531e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635321:	ff 50 78             	call   QWORD PTR [rax+0x78]
 1635324:	48 85 c0             	test   rax,rax
 1635327:	0f 95 c0             	setne  al
 163532a:	59                   	pop    rcx
 163532b:	c3                   	ret
 163532c:	50                   	push   rax
 163532d:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 1635334:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1635337:	ff 50 38             	call   QWORD PTR [rax+0x38]
 163533a:	48 85 c0             	test   rax,rax
 163533d:	0f 95 c0             	setne  al
 1635340:	59                   	pop    rcx
 1635341:	c3                   	ret
 1635342:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635349:	8b 40 44             	mov    eax,DWORD PTR [rax+0x44]
 163534c:	c3                   	ret
 163534d:	cc                   	int3
 163534e:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635355:	0f b6 40 48          	movzx  eax,BYTE PTR [rax+0x48]
 1635359:	c3                   	ret
 163535a:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635361:	0f b6 40 40          	movzx  eax,BYTE PTR [rax+0x40]
 1635365:	c3                   	ret
 1635366:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163536d:	e9 ce 32 00 00       	jmp    1638640 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337ae>
 1635372:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635379:	e9 e2 32 00 00       	jmp    1638660 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337ce>
 163537e:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635385:	e9 04 33 00 00       	jmp    163868e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x337fc>
 163538a:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635391:	e9 26 33 00 00       	jmp    16386bc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3382a>
 1635396:	50                   	push   rax
 1635397:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163539e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16353a1:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16353a4:	8b 88 d0 00 00 00    	mov    ecx,DWORD PTR [rax+0xd0]
 16353aa:	8d 51 01             	lea    edx,[rcx+0x1]
 16353ad:	31 c0                	xor    eax,eax
 16353af:	83 f9 03             	cmp    ecx,0x3
 16353b2:	0f 42 c2             	cmovb  eax,edx
 16353b5:	59                   	pop    rcx
 16353b6:	c3                   	ret
 16353b7:	cc                   	int3
 16353b8:	53                   	push   rbx
 16353b9:	48 89 fb             	mov    rbx,rdi
 16353bc:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]
 16353c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 16353c6:	31 d2                	xor    edx,edx
 16353c8:	ff 50 10             	call   QWORD PTR [rax+0x10]
 16353cb:	48 89 d8             	mov    rax,rbx
 16353ce:	5b                   	pop    rbx
 16353cf:	c3                   	ret
 16353d0:	50                   	push   rax
 16353d1:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16353d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16353db:	ff 50 78             	call   QWORD PTR [rax+0x78]
 16353de:	48 8d 88 20 01 00 00 	lea    rcx,[rax+0x120]
 16353e5:	48 85 c0             	test   rax,rax
 16353e8:	48 8d 05 49 66 e0 fe 	lea    rax,[rip+0xfffffffffee06649]        # 43ba38 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1644>
 16353ef:	48 0f 45 c1          	cmovne rax,rcx
 16353f3:	59                   	pop    rcx
 16353f4:	c3                   	ret
 16353f5:	cc                   	int3
 16353f6:	48 81 c7 90 00 00 00 	add    rdi,0x90
 16353fd:	e9 2c 2e 00 00       	jmp    163822e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3339c>
 1635402:	50                   	push   rax
 1635403:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 163540a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 163540d:	ff 50 48             	call   QWORD PTR [rax+0x48]
 1635410:	48 8d 88 d8 00 00 00 	lea    rcx,[rax+0xd8]
 1635417:	48 85 c0             	test   rax,rax
 163541a:	48 0f 45 c1          	cmovne rax,rcx
 163541e:	59                   	pop    rcx
 163541f:	c3                   	ret
 1635420:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635427:	e9 3c 2f 00 00       	jmp    1638368 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334d6>
 163542c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635433:	e9 7c 30 00 00       	jmp    16384b4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33622>
 1635438:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 163543f:	8a 40 49             	mov    al,BYTE PTR [rax+0x49]
 1635442:	c3                   	ret
 1635443:	cc                   	int3
 1635444:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 163544b:	8b 40 68             	mov    eax,DWORD PTR [rax+0x68]
 163544e:	c3                   	ret
 163544f:	cc                   	int3
 1635450:	48 8b 87 f8 00 00 00 	mov    rax,QWORD PTR [rdi+0xf8]
 1635457:	69 40 68 e8 03 00 00 	imul   eax,DWORD PTR [rax+0x68],0x3e8
 163545e:	c3                   	ret
 163545f:	cc                   	int3
 1635460:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635467:	e9 50 31 00 00       	jmp    16385bc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3372a>
 163546c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635473:	e9 58 31 00 00       	jmp    16385d0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3373e>
 1635478:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163547f:	e9 60 31 00 00       	jmp    16385e4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33752>
 1635484:	48 81 c7 90 00 00 00 	add    rdi,0x90
 163548b:	e9 68 31 00 00       	jmp    16385f8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33766>
 1635490:	48 81 c7 90 00 00 00 	add    rdi,0x90
 1635497:	e9 a2 30 00 00       	jmp    163853e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x336ac>
 163549c:	48 81 c7 90 00 00 00 	add    rdi,0x90
 16354a3:	e9 ea 30 00 00       	jmp    1638592 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33700>
 16354a8:	53                   	push   rbx
 16354a9:	48 89 fb             	mov    rbx,rdi
 16354ac:	48 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [rsi+0xf8]
 16354b3:	e8 50 32 00 00       	call   1638708 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33876>
 16354b8:	48 89 d8             	mov    rax,rbx
 16354bb:	5b                   	pop    rbx
 16354bc:	c3                   	ret
 16354bd:	cc                   	int3
 16354be:	50                   	push   rax
 16354bf:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16354c6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 16354c9:	ff 50 30             	call   QWORD PTR [rax+0x30]
 16354cc:	48 85 c0             	test   rax,rax
 16354cf:	74 09                	je     16354da <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30648>
 16354d1:	80 78 28 00          	cmp    BYTE PTR [rax+0x28],0x0
 16354d5:	0f 95 c0             	setne  al
 16354d8:	eb 02                	jmp    16354dc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3064a>
 16354da:	b0 01                	mov    al,0x1
 16354dc:	59                   	pop    rcx
 16354dd:	c3                   	ret
 16354de:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16354e5:	e9 de 5c 01 00       	jmp    164b1c8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46336>
 16354ea:	48 8b bf f8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xf8]
 16354f1:	e9 d8 5a 01 00       	jmp    164afce <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4613c>
 16354f6:	48 81 c7 90 00 00 00 	add    rdi,0x90
```
