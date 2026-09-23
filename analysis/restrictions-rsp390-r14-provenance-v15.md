# Restrictions `[rsp+0x390] -> r14` provenance v15

Focus: trace the concrete receiver loaded at `e95091 r14 = [rsp+0x390]` before `e95105 call [r14.vtable+0xa0]`. Static provenance only.

## Local window around receiver load and callback pass

```text
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
  e9535d:	e8 dc 46 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e95362:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e95366:	e8 1b 91 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9536b:	40 84 ed             	test   bpl,bpl
  e9536e:	74 0f                	je     e9537f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c795>
  e95370:	48 8d bc 24 d0 0f 00 	lea    rdi,[rsp+0xfd0]
  e95377:	00
  e95378:	e8 57 48 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  e9537d:	eb 0d                	jmp    e9538c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c7a2>
  e9537f:	48 8d bc 24 d0 0f 00 	lea    rdi,[rsp+0xfd0]
  e95386:	00
  e95387:	e8 5c 54 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9538c:	41 8a 6e 01          	mov    bpl,BYTE PTR [r14+0x1]
  e95390:	40 84 ed             	test   bpl,bpl
  e95393:	74 22                	je     e953b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c7cd>
  e95395:	48 8d 9c 24 90 0f 00 	lea    rbx,[rsp+0xf90]
  e9539c:	00
  e9539d:	48 89 df             	mov    rdi,rbx
  e953a0:	e8 51 46 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  e953a5:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e953ac:	00
  e953ad:	48 89 de             	mov    rsi,rbx
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
```
## All local references to `[rsp+0x390]` / neighboring slots in e8d000-e95600

| addr | instruction |
|---:|---|
| `0xe8e121` | `e8e121:	48 8b bc 24 88 03 00 	mov    rdi,QWORD PTR [rsp+0x388]` |
| `0xe8e13b` | `e8e13b:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]` |
| `0xe8e728` | `e8e728:	48 8b bc 24 88 03 00 	mov    rdi,QWORD PTR [rsp+0x388]` |
| `0xe8e74a` | `e8e74a:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]` |
| `0xe91355` | `e91355:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]` |
| `0xe92df2` | `e92df2:	48 8b bb 88 03 00 00 	mov    rdi,QWORD PTR [rbx+0x388]` |
| `0xe92f6b` | `e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]` |
| `0xe930dd` | `e930dd:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe930e5` | `e930e5:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe932a5` | `e932a5:	66 0f 7f 84 24 80 03 	movdqa XMMWORD PTR [rsp+0x380],xmm0` |
| `0xe9341b` | `e9341b:	66 0f 7f 8c 24 80 03 	movdqa XMMWORD PTR [rsp+0x380],xmm1` |
| `0xe9344e` | `e9344e:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe93456` | `e93456:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |
| `0xe93c68` | `e93c68:	49 8b b4 24 80 03 00 	mov    rsi,QWORD PTR [r12+0x380]` |
| `0xe95091` | `e95091:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]` |
| `0xe95099` | `e95099:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]` |

## Windows around writes/reads of `[rsp+0x390]` and `[rsp+0x398]`

### `0xe8e13b`

```text
  e8e0bf:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  e8e0c6:	00
  e8e0c7:	e8 c4 fd 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e8e0cc:	48 8b bc 24 b8 04 00 	mov    rdi,QWORD PTR [rsp+0x4b8]
  e8e0d3:	00
  e8e0d4:	e8 ad 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e0d9:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  e8e0de:	e8 a3 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e0e3:	48 8b bc 24 c8 04 00 	mov    rdi,QWORD PTR [rsp+0x4c8]
  e8e0ea:	00
  e8e0eb:	e8 96 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e0f0:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8e0f7:	00
  e8e0f8:	e8 27 09 00 00       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
  e8e0fd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  e8e102:	e8 7f 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e107:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
  e8e10e:	00
  e8e10f:	e8 72 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e114:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e8e11b:	00
  e8e11c:	e8 65 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e121:	48 8b bc 24 88 03 00 	mov    rdi,QWORD PTR [rsp+0x388]
  e8e128:	00
  e8e129:	e8 58 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e12e:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
  e8e135:	00
  e8e136:	e8 4b 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e13b:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]
  e8e142:	00
  e8e143:	e8 3e 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e148:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
  e8e14f:	00
  e8e150:	e8 15 be be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e155:	48 8b 9c 24 a0 01 00 	mov    rbx,QWORD PTR [rsp+0x1a0]
  e8e15c:	00
  e8e15d:	4c 89 33             	mov    QWORD PTR [rbx],r14
  e8e160:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
  e8e167:	00
  e8e168:	e8 19 03 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e16d:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
  e8e174:	00
  e8e175:	e8 96 49 c6 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
  e8e17a:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
  e8e181:	00
  e8e182:	e8 ff 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e187:	48 8b bc 24 a8 02 00 	mov    rdi,QWORD PTR [rsp+0x2a8]
  e8e18e:	00
  e8e18f:	e8 f2 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e194:	48 8b bc 24 b8 02 00 	mov    rdi,QWORD PTR [rsp+0x2b8]
  e8e19b:	00
  e8e19c:	e8 e5 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e1a1:	48 8b bc 24 c8 02 00 	mov    rdi,QWORD PTR [rsp+0x2c8]
  e8e1a8:	00
  e8e1a9:	e8 d8 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e1ae:	48 8b bc 24 d8 02 00 	mov    rdi,QWORD PTR [rsp+0x2d8]
  e8e1b5:	00
  e8e1b6:	e8 cb 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e1bb:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
  e8e1c2:	00
  e8e1c3:	e8 02 c1 be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e8e1c8:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
  e8e1cf:	00
  e8e1d0:	e8 4f 08 00 00       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
  e8e1d5:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
  e8e1dc:	00
  e8e1dd:	e8 8c a0 cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
  e8e1e2:	48 8b bc 24 08 03 00 	mov    rdi,QWORD PTR [rsp+0x308]
  e8e1e9:	00
  e8e1ea:	e8 97 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e1ef:	48 8b bc 24 18 03 00 	mov    rdi,QWORD PTR [rsp+0x318]
  e8e1f6:	00
  e8e1f7:	48 83 a4 24 18 03 00 	and    QWORD PTR [rsp+0x318],0x0
  e8e1fe:	00 00
  e8e200:	48 85 ff             	test   rdi,rdi
  e8e203:	74 06                	je     e8e20b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55621>
  e8e205:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8e208:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e8e20b:	48 8b bc 24 28 03 00 	mov    rdi,QWORD PTR [rsp+0x328]
  e8e212:	00
  e8e213:	e8 6e 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e218:	48 8b bc 24 38 03 00 	mov    rdi,QWORD PTR [rsp+0x338]
  e8e21f:	00
  e8e220:	e8 61 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e225:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
  e8e22c:	00
  e8e22d:	e8 38 bd be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e232:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
  e8e239:	00
  e8e23a:	e8 51 fc 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e8e23f:	48 8b bc 24 60 03 00 	mov    rdi,QWORD PTR [rsp+0x360]
  e8e246:	00
  e8e247:	e8 3a 02 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e24c:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
  e8e253:	00
  e8e254:	e8 11 bd be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e259:	48 8b bc 24 68 03 00 	mov    rdi,QWORD PTR [rsp+0x368]
  e8e260:	00
  e8e261:	48 85 ff             	test   rdi,rdi
  e8e264:	74 06                	je     e8e26c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55682>
  e8e266:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8e269:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e8e26c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e8e273:	00 00
  e8e275:	48 3b 84 24 c0 07 00 	cmp    rax,QWORD PTR [rsp+0x7c0]
  e8e27c:	00
  e8e27d:	0f 85 10 06 00 00    	jne    e8e893 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55ca9>
  e8e283:	48 89 d8             	mov    rax,rbx
  e8e286:	48 81 c4 c8 07 00 00 	add    rsp,0x7c8
  e8e28d:	5b                   	pop    rbx
  e8e28e:	41 5c                	pop    r12
  e8e290:	41 5d                	pop    r13
  e8e292:	41 5e                	pop    r14
```
### `0xe8e74a`

```text
  e8e6c1:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
  e8e6c8:	00
  e8e6c9:	e8 56 03 00 00       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
  e8e6ce:	49 8b be 40 01 00 00 	mov    rdi,QWORD PTR [r14+0x140]
  e8e6d5:	e8 ac fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e6da:	48 8b bc 24 30 01 00 	mov    rdi,QWORD PTR [rsp+0x130]
  e8e6e1:	00
  e8e6e2:	e8 41 b7 be ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  e8e6e7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  e8e6ec:	e8 55 85 62 00       	call   14b6c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc1ca>
  e8e6f1:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
  e8e6f8:	00 00
  e8e6fa:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e8e701:	e8 80 fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e706:	66 0f 6f 84 24 20 01 	movdqa xmm0,XMMWORD PTR [rsp+0x120]
  e8e70d:	00 00
  e8e70f:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e8e716:	e8 6b fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e71b:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e8e722:	00
  e8e723:	e8 5e fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e728:	48 8b bc 24 88 03 00 	mov    rdi,QWORD PTR [rsp+0x388]
  e8e72f:	00
  e8e730:	e8 51 fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e735:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
  e8e73c:	00 00
  e8e73e:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e8e745:	e8 3c fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e74a:	48 8b bc 24 98 03 00 	mov    rdi,QWORD PTR [rsp+0x398]
  e8e751:	00
  e8e752:	e8 2f fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e757:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
  e8e75e:	00
  e8e75f:	e8 06 b8 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e764:	4c 89 f7             	mov    rdi,r14
  e8e767:	e8 b4 f7 95 00       	call   17edf20 <_ZdlPv@plt>
  e8e76c:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
  e8e773:	00
  e8e774:	e8 0d fd c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e779:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
  e8e780:	00
  e8e781:	e8 8a 43 c6 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
  e8e786:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
  e8e78d:	00
  e8e78e:	e8 f3 fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e793:	48 8b bc 24 a8 02 00 	mov    rdi,QWORD PTR [rsp+0x2a8]
  e8e79a:	00
  e8e79b:	e8 e6 fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e7a0:	48 8b bc 24 b8 02 00 	mov    rdi,QWORD PTR [rsp+0x2b8]
  e8e7a7:	00
  e8e7a8:	e8 d9 fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e7ad:	48 8b bc 24 c8 02 00 	mov    rdi,QWORD PTR [rsp+0x2c8]
  e8e7b4:	00
  e8e7b5:	e8 cc fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e7ba:	48 8b bc 24 d8 02 00 	mov    rdi,QWORD PTR [rsp+0x2d8]
  e8e7c1:	00
  e8e7c2:	e8 bf fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e7c7:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
  e8e7ce:	00
  e8e7cf:	e8 f6 ba be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e8e7d4:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
  e8e7db:	00
  e8e7dc:	e8 43 02 00 00       	call   e8ea24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e3a>
  e8e7e1:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
  e8e7e8:	00
  e8e7e9:	e8 80 9a cf ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
  e8e7ee:	48 8b bc 24 08 03 00 	mov    rdi,QWORD PTR [rsp+0x308]
  e8e7f5:	00
  e8e7f6:	e8 8b fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e7fb:	48 8b bc 24 18 03 00 	mov    rdi,QWORD PTR [rsp+0x318]
  e8e802:	00
  e8e803:	48 83 a4 24 18 03 00 	and    QWORD PTR [rsp+0x318],0x0
  e8e80a:	00 00
  e8e80c:	48 85 ff             	test   rdi,rdi
  e8e80f:	74 06                	je     e8e817 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55c2d>
  e8e811:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8e814:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e8e817:	48 8b bc 24 28 03 00 	mov    rdi,QWORD PTR [rsp+0x328]
  e8e81e:	00
  e8e81f:	e8 62 fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e824:	48 8b bc 24 38 03 00 	mov    rdi,QWORD PTR [rsp+0x338]
  e8e82b:	00
  e8e82c:	e8 55 fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e831:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
  e8e838:	00
  e8e839:	e8 2c b7 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e83e:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
  e8e845:	00
  e8e846:	e8 45 f6 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e8e84b:	48 8b bc 24 60 03 00 	mov    rdi,QWORD PTR [rsp+0x360]
  e8e852:	00
  e8e853:	e8 2e fc c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8e858:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
  e8e85f:	00
  e8e860:	e8 05 b7 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e8e865:	48 8b bc 24 68 03 00 	mov    rdi,QWORD PTR [rsp+0x368]
  e8e86c:	00
  e8e86d:	48 85 ff             	test   rdi,rdi
  e8e870:	74 06                	je     e8e878 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55c8e>
  e8e872:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8e875:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e8e878:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e8e87f:	00 00
  e8e881:	48 3b 84 24 c0 07 00 	cmp    rax,QWORD PTR [rsp+0x7c0]
  e8e888:	00
  e8e889:	75 08                	jne    e8e893 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55ca9>
  e8e88b:	48 89 df             	mov    rdi,rbx
  e8e88e:	e8 3d 14 be ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e8e893:	e8 18 12 96 00       	call   17efab0 <__stack_chk_fail@plt>
  e8e898:	53                   	push   rbx
  e8e899:	48 89 fb             	mov    rbx,rdi
  e8e89c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  e8e8a0:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
```
### `0xe91355`

```text
  e912f1:	4c 8b a4 24 18 04 00 	mov    r12,QWORD PTR [rsp+0x418]
  e912f8:	00
  e912f9:	49 29 d4             	sub    r12,rdx
  e912fc:	4c 89 e0             	mov    rax,r12
  e912ff:	48 c1 f8 07          	sar    rax,0x7
  e91303:	4c 39 f8             	cmp    rax,r15
  e91306:	73 26                	jae    e9132e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58744>
  e91308:	4d 01 f4             	add    r12,r14
  e9130b:	4c 89 f7             	mov    rdi,r14
  e9130e:	4c 89 e6             	mov    rsi,r12
  e91311:	e8 33 19 00 00       	call   e92c49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05f>
  e91316:	4d 89 e6             	mov    r14,r12
  e91319:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9131e:	4c 89 ef             	mov    rdi,r13
  e91321:	4c 89 f6             	mov    rsi,r14
  e91324:	48 89 da             	mov    rdx,rbx
  e91327:	e8 5e 19 00 00       	call   e92c8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a0a0>
  e9132c:	eb 1b                	jmp    e91349 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5875f>
  e9132e:	4c 89 f7             	mov    rdi,r14
  e91331:	48 89 de             	mov    rsi,rbx
  e91334:	e8 10 19 00 00       	call   e92c49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a05f>
  e91339:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9133e:	4c 89 ef             	mov    rdi,r13
  e91341:	48 89 c6             	mov    rsi,rax
  e91344:	e8 3f d7 ff ff       	call   e8ea88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55e9e>
  e91349:	48 8b 84 24 70 0a 00 	mov    rax,QWORD PTR [rsp+0xa70]
  e91350:	00
  e91351:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e91355:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
  e9135c:	00
  e9135d:	e8 d4 d7 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  e91362:	48 8b 8c 24 a0 0a 00 	mov    rcx,QWORD PTR [rsp+0xaa0]
  e91369:	00
  e9136a:	48 8b 01             	mov    rax,QWORD PTR [rcx]
  e9136d:	48 85 c0             	test   rax,rax
  e91370:	74 1f                	je     e91391 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587a7>
  e91372:	48 83 21 00          	and    QWORD PTR [rcx],0x0
  e91376:	48 8b bc 24 90 04 00 	mov    rdi,QWORD PTR [rsp+0x490]
  e9137d:	00
  e9137e:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
  e91385:	00
  e91386:	48 85 ff             	test   rdi,rdi
  e91389:	74 06                	je     e91391 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587a7>
  e9138b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9138e:	ff 50 08             	call   QWORD PTR [rax+0x8]
  e91391:	48 8b 84 24 a8 0a 00 	mov    rax,QWORD PTR [rsp+0xaa8]
  e91398:	00
  e91399:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
  e9139d:	74 11                	je     e913b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587c6>
  e9139f:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e913a3:	48 8d bc 24 98 04 00 	lea    rdi,[rsp+0x498]
  e913aa:	00
  e913ab:	e8 86 d7 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  e913b0:	48 8b b4 24 b0 0a 00 	mov    rsi,QWORD PTR [rsp+0xab0]
  e913b7:	00
  e913b8:	48 83 7e 20 00       	cmp    QWORD PTR [rsi+0x20],0x0
  e913bd:	74 28                	je     e913e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x587fd>
  e913bf:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
  e913c6:	00
  e913c7:	48 89 df             	mov    rdi,rbx
  e913ca:	e8 5d b6 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
  e913cf:	48 8d bc 24 b0 04 00 	lea    rdi,[rsp+0x4b0]
  e913d6:	00
  e913d7:	48 89 de             	mov    rsi,rbx
  e913da:	e8 c1 05 d8 ff       	call   c119a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e940>
  e913df:	48 89 df             	mov    rdi,rbx
  e913e2:	e8 83 8b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e913e7:	48 8b 84 24 e0 0b 00 	mov    rax,QWORD PTR [rsp+0xbe0]
  e913ee:	00
  e913ef:	48 89 84 24 f8 07 00 	mov    QWORD PTR [rsp+0x7f8],rax
  e913f6:	00
  e913f7:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e913fe:	00
  e913ff:	48 8b b4 24 80 0a 00 	mov    rsi,QWORD PTR [rsp+0xa80]
  e91406:	00
  e91407:	e8 84 8e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9140c:	48 8d 9c 24 a0 08 00 	lea    rbx,[rsp+0x8a0]
  e91413:	00
  e91414:	48 89 df             	mov    rdi,rbx
  e91417:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
  e9141e:	00
  e9141f:	e8 02 6f cf ff       	call   b88326 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd52c6>
  e91424:	48 89 df             	mov    rdi,rbx
  e91427:	e8 3e 8b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9142c:	ba f0 00 00 00       	mov    edx,0xf0
  e91431:	4c 89 e7             	mov    rdi,r12
  e91434:	31 f6                	xor    esi,esi
  e91436:	e8 55 d7 95 00       	call   17eeb90 <memset@plt>
  e9143b:	41 c6 84 24 f0 00 00 	mov    BYTE PTR [r12+0xf0],0x1
  e91442:	00 01
  e91444:	66 0f ef c0          	pxor   xmm0,xmm0
  e91448:	f3 41 0f 7f 84 24 f8 	movdqu XMMWORD PTR [r12+0xf8],xmm0
  e9144f:	00 00 00
  e91452:	f3 41 0f 7f 84 24 08 	movdqu XMMWORD PTR [r12+0x108],xmm0
  e91459:	01 00 00
  e9145c:	48 8b bc 24 50 03 00 	mov    rdi,QWORD PTR [rsp+0x350]
  e91463:	00
  e91464:	e8 72 58 62 00       	call   14b6cdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc25f>
  e91469:	48 8b 84 24 c8 06 00 	mov    rax,QWORD PTR [rsp+0x6c8]
  e91470:	00
  e91471:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  e91474:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
  e91478:	48 85 c0             	test   rax,rax
  e9147b:	66 0f ef c9          	pxor   xmm1,xmm1
  e9147f:	74 0f                	je     e91490 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x588a6>
  e91481:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e91486:	f3 41 0f 6f 8c 24 80 	movdqu xmm1,XMMWORD PTR [r12+0x80]
  e9148d:	00 00 00
  e91490:	41 0f 11 84 24 80 00 	movups XMMWORD PTR [r12+0x80],xmm0
  e91497:	00 00
  e91499:	66 48 0f 3a 16 cf 01 	pextrq rdi,xmm1,0x1
  e914a0:	e8 e1 cf c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e914a5:	f3 41 0f 6f 84 24 80 	movdqu xmm0,XMMWORD PTR [r12+0x80]
```
### `0xe92f6b`

```text
  e92f0d:	48 85 c0             	test   rax,rax
  e92f10:	74 0a                	je     e92f1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a332>
  e92f12:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e92f17:	eb 03                	jmp    e92f1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a332>
  e92f19:	48 89 f2             	mov    rdx,rsi
  e92f1c:	48 8b 7a 08          	mov    rdi,QWORD PTR [rdx+0x8]
  e92f20:	e9 bf c6 c4 ff       	jmp    adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
  e92f25:	c3                   	ret
  e92f26:	e9 47 8f 01 00       	jmp    eabe72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73288>
  e92f2b:	cc                   	int3
  e92f2c:	55                   	push   rbp
  e92f2d:	41 57                	push   r15
  e92f2f:	41 56                	push   r14
  e92f31:	41 55                	push   r13
  e92f33:	41 54                	push   r12
  e92f35:	53                   	push   rbx
  e92f36:	48 81 ec b8 10 00 00 	sub    rsp,0x10b8
  e92f3d:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
  e92f44:	00
  e92f45:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
  e92f4c:	00
  e92f4d:	49 89 f5             	mov    r13,rsi
  e92f50:	49 89 ff             	mov    r15,rdi
  e92f53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e92f5a:	00 00
  e92f5c:	48 89 84 24 b0 10 00 	mov    QWORD PTR [rsp+0x10b0],rax
  e92f63:	00
  e92f64:	48 8b b6 80 04 00 00 	mov    rsi,QWORD PTR [rsi+0x480]
  e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
  e92f72:	00
  e92f73:	e8 40 ff c5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>
  e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92f7f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92f82:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92f86:	48 8d 15 28 8b 4d ff 	lea    rdx,[rip+0xffffffffff4d8b28]        # 36bab5 <_ZTSSt12bad_any_cast@@Base-0x24713>
  e92f8d:	e8 27 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92f92:	b3 01                	mov    bl,0x1
  e92f94:	40 b5 01             	mov    bpl,0x1
  e92f97:	84 c0                	test   al,al
  e92f99:	75 1c                	jne    e92fb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a3cd>
  e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fa2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fa5:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fa9:	48 8d 15 b8 03 4a ff 	lea    rdx,[rip+0xffffffffff4a03b8]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fb0:	e8 04 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fb5:	89 c5                	mov    ebp,eax
  e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fbe:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fc1:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fc5:	48 8d 15 1a 6d 4a ff 	lea    rdx,[rip+0xffffffffff4a6d1a]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
  e92fcc:	e8 e8 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fd1:	84 c0                	test   al,al
  e92fd3:	75 1c                	jne    e92ff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a407>
  e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fdc:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fdf:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fe3:	48 8d 15 7e 03 4a ff 	lea    rdx,[rip+0xffffffffff4a037e]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fea:	e8 ca 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fef:	89 c3                	mov    ebx,eax
  e92ff1:	31 c0                	xor    eax,eax
  e92ff3:	88 84 24 e8 03 00 00 	mov    BYTE PTR [rsp+0x3e8],al
  e92ffa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al
  e93001:	40 84 dd             	test   bpl,bl
  e93004:	0f 85 87 00 00 00    	jne    e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9300a:	66 0f ef c0          	pxor   xmm0,xmm0
  e9300e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
  e93015:	00
  e93016:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
  e9301c:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
  e93021:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000
  e93028:	3f
  e93029:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93030:	00
  e93031:	4c 89 f6             	mov    rsi,r14
  e93034:	e8 c3 63 00 00       	call   e993fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60812>
  e93039:	4c 89 f7             	mov    rdi,r14
  e9303c:	e8 25 f6 c4 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  e93041:	40 84 ed             	test   bpl,bpl
  e93044:	74 14                	je     e9305a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a470>
  e93046:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc60 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x186c>
  e9304d:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e93054:	00
  e93055:	e8 16 a8 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e9305a:	84 db                	test   bl,bl
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93091:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
  e93098:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
  e9309c:	48 8d 1d 3d b8 97 00 	lea    rbx,[rip+0x97b83d]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e930a3:	4c 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],r15
  e930a8:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
  e930ad:	0f 85 ca 01 00 00    	jne    e9327d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a693>
  e930b3:	4d 8b bd 10 04 00 00 	mov    r15,QWORD PTR [r13+0x410]
  e930ba:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
  e930c1:	00
  e930c2:	48 89 1e             	mov    QWORD PTR [rsi],rbx
  e930c5:	48 8b 05 d4 e9 a1 00 	mov    rax,QWORD PTR [rip+0xa1e9d4]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e930cc:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e930d0:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
  e930d4:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e930d7:	4c 89 ff             	mov    rdi,r15
  e930da:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e930dd:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]
```
### `0xe930dd`

```text
  e9305c:	74 14                	je     e93072 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a488>
  e9305e:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1884>
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93091:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
  e93098:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
  e9309c:	48 8d 1d 3d b8 97 00 	lea    rbx,[rip+0x97b83d]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e930a3:	4c 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],r15
  e930a8:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
  e930ad:	0f 85 ca 01 00 00    	jne    e9327d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a693>
  e930b3:	4d 8b bd 10 04 00 00 	mov    r15,QWORD PTR [r13+0x410]
  e930ba:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
  e930c1:	00
  e930c2:	48 89 1e             	mov    QWORD PTR [rsi],rbx
  e930c5:	48 8b 05 d4 e9 a1 00 	mov    rax,QWORD PTR [rip+0xa1e9d4]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e930cc:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e930d0:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
  e930d4:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e930d7:	4c 89 ff             	mov    rdi,r15
  e930da:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e930dd:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]
  e930e4:	00
  e930e5:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]
  e930ec:	00
  e930ed:	48 85 c0             	test   rax,rax
  e930f0:	74 0f                	je     e93101 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a517>
  e930f2:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e930f7:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e930fc:	48 89 c3             	mov    rbx,rax
  e930ff:	eb 02                	jmp    e93103 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a519>
  e93101:	31 db                	xor    ebx,ebx
  e93103:	66 0f ef c0          	pxor   xmm0,xmm0
  e93107:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
  e9310e:	00 00
  e93110:	48 83 a4 24 60 10 00 	and    QWORD PTR [rsp+0x1060],0x0
  e93117:	00 00
  e93119:	4c 8d 84 24 10 0e 00 	lea    r8,[rsp+0xe10]
  e93120:	00
  e93121:	4d 89 30             	mov    QWORD PTR [r8],r14
  e93124:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
  e93128:	4d 89 78 10          	mov    QWORD PTR [r8+0x10],r15
  e9312c:	48 8d 35 43 67 c9 ff 	lea    rsi,[rip+0xffffffffffc96743]        # b29876 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76816>
  e93133:	48 8d 15 af aa cf ff 	lea    rdx,[rip+0xffffffffffcfaaaf]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
  e9313a:	48 8d 0d cb 62 00 00 	lea    rcx,[rip+0x62cb]        # e9940c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60822>
  e93141:	4c 8d a4 24 e0 0b 00 	lea    r12,[rsp+0xbe0]
  e93148:	00
  e93149:	6a 18                	push   0x18
  e9314b:	41 59                	pop    r9
  e9314d:	4c 89 e7             	mov    rdi,r12
  e93150:	e8 3f 76 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e93155:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e93158:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
  e9315f:	00
  e93160:	4c 89 f6             	mov    rsi,r14
  e93163:	4c 89 e2             	mov    rdx,r12
  e93166:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e9316c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93173:	00
  e93174:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9317b:	00
  e9317c:	e8 4d 63 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e93181:	4c 8d a4 24 30 03 00 	lea    r12,[rsp+0x330]
  e93188:	00
  e93189:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  e9318e:	e8 f3 b2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e93193:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9319a:	00
  e9319b:	e8 48 76 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e931a0:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
  e931a7:	00
  e931a8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e931ac:	e8 01 b3 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e931b1:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14
  e931b5:	49 89 5d 08          	mov    QWORD PTR [r13+0x8],rbx
  e931b9:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e931bd:	48 8d 35 b2 66 c9 ff 	lea    rsi,[rip+0xffffffffffc966b2]        # b29876 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76816>
  e931c4:	48 8d 15 1e aa cf ff 	lea    rdx,[rip+0xffffffffffcfaa1e]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
  e931cb:	48 8d 0d ca 63 00 00 	lea    rcx,[rip+0x63ca]        # e9959c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609b2>
  e931d2:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e931d9:	00
  e931da:	6a 18                	push   0x18
  e931dc:	41 59                	pop    r9
  e931de:	48 89 df             	mov    rdi,rbx
  e931e1:	4d 89 e8             	mov    r8,r13
  e931e4:	e8 ab 75 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e931e9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e931ec:	4c 89 e7             	mov    rdi,r12
  e931ef:	4c 89 f6             	mov    rsi,r14
  e931f2:	48 89 da             	mov    rdx,rbx
  e931f5:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e931fb:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93202:	00
  e93203:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9320a:	00
  e9320b:	e8 be 62 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e93210:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e93215:	48 8b bc 24 38 03 00 	mov    rdi,QWORD PTR [rsp+0x338]
  e9321c:	00
  e9321d:	e8 64 b2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e93222:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e93229:	00
  e9322a:	e8 b9 75 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9322f:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
  e93236:	00
  e93237:	e8 76 b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
```
### `0xe930e5`

```text
  e93065:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9306c:	00
  e9306d:	e8 fe a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93072:	48 83 bc 24 00 04 00 	cmp    QWORD PTR [rsp+0x400],0x0
  e93079:	00 00
  e9307b:	74 14                	je     e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
  e9307d:	48 8d 35 0c 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c0c]        # 43bc90 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x189c>
  e93084:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
  e9308b:	00
  e9308c:	e8 df a7 d8 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
  e93091:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
  e93098:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
  e9309c:	48 8d 1d 3d b8 97 00 	lea    rbx,[rip+0x97b83d]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e930a3:	4c 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],r15
  e930a8:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
  e930ad:	0f 85 ca 01 00 00    	jne    e9327d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a693>
  e930b3:	4d 8b bd 10 04 00 00 	mov    r15,QWORD PTR [r13+0x410]
  e930ba:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
  e930c1:	00
  e930c2:	48 89 1e             	mov    QWORD PTR [rsi],rbx
  e930c5:	48 8b 05 d4 e9 a1 00 	mov    rax,QWORD PTR [rip+0xa1e9d4]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e930cc:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e930d0:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
  e930d4:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e930d7:	4c 89 ff             	mov    rdi,r15
  e930da:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e930dd:	4c 8b b4 24 90 03 00 	mov    r14,QWORD PTR [rsp+0x390]
  e930e4:	00
  e930e5:	48 8b 84 24 98 03 00 	mov    rax,QWORD PTR [rsp+0x398]
  e930ec:	00
  e930ed:	48 85 c0             	test   rax,rax
  e930f0:	74 0f                	je     e93101 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a517>
  e930f2:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e930f7:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e930fc:	48 89 c3             	mov    rbx,rax
  e930ff:	eb 02                	jmp    e93103 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a519>
  e93101:	31 db                	xor    ebx,ebx
  e93103:	66 0f ef c0          	pxor   xmm0,xmm0
  e93107:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
  e9310e:	00 00
  e93110:	48 83 a4 24 60 10 00 	and    QWORD PTR [rsp+0x1060],0x0
  e93117:	00 00
  e93119:	4c 8d 84 24 10 0e 00 	lea    r8,[rsp+0xe10]
  e93120:	00
  e93121:	4d 89 30             	mov    QWORD PTR [r8],r14
  e93124:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
  e93128:	4d 89 78 10          	mov    QWORD PTR [r8+0x10],r15
  e9312c:	48 8d 35 43 67 c9 ff 	lea    rsi,[rip+0xffffffffffc96743]        # b29876 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76816>
  e93133:	48 8d 15 af aa cf ff 	lea    rdx,[rip+0xffffffffffcfaaaf]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
  e9313a:	48 8d 0d cb 62 00 00 	lea    rcx,[rip+0x62cb]        # e9940c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60822>
  e93141:	4c 8d a4 24 e0 0b 00 	lea    r12,[rsp+0xbe0]
  e93148:	00
  e93149:	6a 18                	push   0x18
  e9314b:	41 59                	pop    r9
  e9314d:	4c 89 e7             	mov    rdi,r12
  e93150:	e8 3f 76 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e93155:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e93158:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
  e9315f:	00
  e93160:	4c 89 f6             	mov    rsi,r14
  e93163:	4c 89 e2             	mov    rdx,r12
  e93166:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e9316c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93173:	00
  e93174:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9317b:	00
  e9317c:	e8 4d 63 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e93181:	4c 8d a4 24 30 03 00 	lea    r12,[rsp+0x330]
  e93188:	00
  e93189:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  e9318e:	e8 f3 b2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e93193:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e9319a:	00
  e9319b:	e8 48 76 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e931a0:	4c 8d ac 24 10 0e 00 	lea    r13,[rsp+0xe10]
  e931a7:	00
  e931a8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  e931ac:	e8 01 b3 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e931b1:	4d 89 75 00          	mov    QWORD PTR [r13+0x0],r14
  e931b5:	49 89 5d 08          	mov    QWORD PTR [r13+0x8],rbx
  e931b9:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e931bd:	48 8d 35 b2 66 c9 ff 	lea    rsi,[rip+0xffffffffffc966b2]        # b29876 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x76816>
  e931c4:	48 8d 15 1e aa cf ff 	lea    rdx,[rip+0xffffffffffcfaa1e]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
  e931cb:	48 8d 0d ca 63 00 00 	lea    rcx,[rip+0x63ca]        # e9959c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609b2>
  e931d2:	48 8d 9c 24 e0 0b 00 	lea    rbx,[rsp+0xbe0]
  e931d9:	00
  e931da:	6a 18                	push   0x18
  e931dc:	41 59                	pop    r9
  e931de:	48 89 df             	mov    rdi,rbx
  e931e1:	4d 89 e8             	mov    r8,r13
  e931e4:	e8 ab 75 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e931e9:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e931ec:	4c 89 e7             	mov    rdi,r12
  e931ef:	4c 89 f6             	mov    rsi,r14
  e931f2:	48 89 da             	mov    rdx,rbx
  e931f5:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e931fb:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
  e93202:	00
  e93203:	48 8d b4 24 30 03 00 	lea    rsi,[rsp+0x330]
  e9320a:	00
  e9320b:	e8 be 62 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e93210:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e93215:	48 8b bc 24 38 03 00 	mov    rdi,QWORD PTR [rsp+0x338]
  e9321c:	00
  e9321d:	e8 64 b2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e93222:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e93229:	00
  e9322a:	e8 b9 75 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e9322f:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
  e93236:	00
  e93237:	e8 76 b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e9323c:	31 ff                	xor    edi,edi
  e9323e:	e8 6f b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
```
### `0xe932a5`

```text
  e93236:	00
  e93237:	e8 76 b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e9323c:	31 ff                	xor    edi,edi
  e9323e:	e8 6f b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e93243:	31 ff                	xor    edi,edi
  e93245:	e8 68 b2 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e9324a:	49 8d bd e0 03 00 00 	lea    rdi,[r13+0x3e0]
  e93251:	48 8d 9c 24 50 10 00 	lea    rbx,[rsp+0x1050]
  e93258:	00
  e93259:	48 89 de             	mov    rsi,rbx
  e9325c:	e8 fd 63 00 00       	call   e9965e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a74>
  e93261:	48 89 df             	mov    rdi,rbx
  e93264:	e8 fb 98 c2 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
  e93269:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
  e93270:	00
  e93271:	e8 f4 6c be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e93276:	48 8d 1d 63 b6 97 00 	lea    rbx,[rip+0x97b663]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e9327d:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
  e93281:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e93284:	48 8d 35 06 0b 54 ff 	lea    rsi,[rip+0xffffffffff540b06]        # 3d3d91 <_ZTSN5boost17bad_function_callE@@Base+0x10d7>
  e9328b:	48 8d 0d 0e 0b 54 ff 	lea    rcx,[rip+0xffffffffff540b0e]        # 3d3da0 <_ZTSN5boost17bad_function_callE@@Base+0x10e6>
  e93292:	6a 0b                	push   0xb
  e93294:	5a                   	pop    rdx
  e93295:	6a 17                	push   0x17
  e93297:	41 58                	pop    r8
  e93299:	45 31 c9             	xor    r9d,r9d
  e9329c:	e8 e9 40 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e932a1:	66 0f ef c0          	pxor   xmm0,xmm0
  e932a5:	66 0f 7f 84 24 80 03 	movdqa XMMWORD PTR [rsp+0x380],xmm0
  e932ac:	00 00
  e932ae:	84 c0                	test   al,al
  e932b0:	0f 84 45 03 00 00    	je     e935fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aa11>
  e932b6:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
  e932bd:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
  e932c1:	0f 85 34 03 00 00    	jne    e935fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5aa11>
  e932c7:	48 8d 84 24 20 0f 00 	lea    rax,[rsp+0xf20]
  e932ce:	00
  e932cf:	48 89 18             	mov    QWORD PTR [rax],rbx
  e932d2:	48 8b 0d c7 e7 a1 00 	mov    rcx,QWORD PTR [rip+0xa1e7c7]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e932d9:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  e932dd:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
  e932e1:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
  e932e5:	4d 8b a5 e8 00 00 00 	mov    r12,QWORD PTR [r13+0xe8]
  e932ec:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e932ef:	48 8d 35 c2 0a 54 ff 	lea    rsi,[rip+0xffffffffff540ac2]        # 3d3db8 <_ZTSN5boost17bad_function_callE@@Base+0x10fe>
  e932f6:	48 8d 0d d3 0a 54 ff 	lea    rcx,[rip+0xffffffffff540ad3]        # 3d3dd0 <_ZTSN5boost17bad_function_callE@@Base+0x1116>
  e932fd:	6a 0b                	push   0xb
  e932ff:	5a                   	pop    rdx
  e93300:	6a 20                	push   0x20
  e93302:	41 58                	pop    r8
  e93304:	6a 3c                	push   0x3c
  e93306:	41 59                	pop    r9
  e93308:	e8 1d 41 75 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  e9330d:	89 c5                	mov    ebp,eax
  e9330f:	bf c0 00 00 00       	mov    edi,0xc0
  e93314:	e8 e7 ab 95 00       	call   17edf00 <_Znwm@plt>
  e93319:	49 89 c6             	mov    r14,rax
  e9331c:	4c 63 ed             	movsxd r13,ebp
  e9331f:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
  e93326:	00
  e93327:	49 89 1f             	mov    QWORD PTR [r15],rbx
  e9332a:	48 8b 05 6f e7 a1 00 	mov    rax,QWORD PTR [rip+0xa1e76f]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e93331:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
  e93335:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
  e93339:	4c 89 f7             	mov    rdi,r14
  e9333c:	e8 4d 4f c9 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  e93341:	31 ed                	xor    ebp,ebp
  e93343:	41 88 6e 58          	mov    BYTE PTR [r14+0x58],bpl
  e93347:	49 8d 7e 60          	lea    rdi,[r14+0x60]
  e9334b:	4c 89 fe             	mov    rsi,r15
  e9334e:	e8 9d 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e93353:	4d 89 ae 90 00 00 00 	mov    QWORD PTR [r14+0x90],r13
  e9335a:	41 88 ae 98 00 00 00 	mov    BYTE PTR [r14+0x98],bpl
  e93361:	41 88 ae a0 00 00 00 	mov    BYTE PTR [r14+0xa0],bpl
  e93368:	4c 89 f7             	mov    rdi,r14
  e9336b:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
  e93372:	4c 89 e6             	mov    rsi,r12
  e93375:	e8 48 e3 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
  e9337a:	4c 89 b4 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],r14
  e93381:	00
  e93382:	4c 89 ff             	mov    rdi,r15
  e93385:	e8 e0 6b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9338a:	6a 70                	push   0x70
  e9338c:	5f                   	pop    rdi
  e9338d:	e8 6e ab 95 00       	call   17edf00 <_Znwm@plt>
  e93392:	48 89 c3             	mov    rbx,rax
  e93395:	66 0f ef c0          	pxor   xmm0,xmm0
  e93399:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9339e:	48 8d 05 23 7a 97 00 	lea    rax,[rip+0x977a23]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
  e933a5:	48 89 03             	mov    QWORD PTR [rbx],rax
  e933a8:	4c 8d 63 20          	lea    r12,[rbx+0x20]
  e933ac:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
  e933b3:	00
  e933b4:	48 8d b4 24 20 0f 00 	lea    rsi,[rsp+0xf20]
  e933bb:	00
  e933bc:	4c 89 ff             	mov    rdi,r15
  e933bf:	e8 2c 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e933c4:	48 8d 05 f5 0f 9b 00 	lea    rax,[rip+0x9b0ff5]        # 18443c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaa8>
  e933cb:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  e933cf:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  e933d3:	4c 89 fe             	mov    rsi,r15
  e933d6:	e8 15 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e933db:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
  e933e2:	00 00
  e933e4:	4c 89 73 60          	mov    QWORD PTR [rbx+0x60],r14
  e933e8:	48 83 7b 50 00       	cmp    QWORD PTR [rbx+0x50],0x0
  e933ed:	0f 84 8e 47 00 00    	je     e97b81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ef97>
  e933f3:	4c 8d 6b 08          	lea    r13,[rbx+0x8]
  e933f7:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e933fe:	00
  e933ff:	e8 66 6b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e93404:	66 48 0f 6e c3       	movq   xmm0,rbx
  e93409:	66 49 0f 6e cc       	movq   xmm1,r12
```
### `0xe9341b`

```text
  e9339e:	48 8d 05 23 7a 97 00 	lea    rax,[rip+0x977a23]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
  e933a5:	48 89 03             	mov    QWORD PTR [rbx],rax
  e933a8:	4c 8d 63 20          	lea    r12,[rbx+0x20]
  e933ac:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]
  e933b3:	00
  e933b4:	48 8d b4 24 20 0f 00 	lea    rsi,[rsp+0xf20]
  e933bb:	00
  e933bc:	4c 89 ff             	mov    rdi,r15
  e933bf:	e8 2c 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e933c4:	48 8d 05 f5 0f 9b 00 	lea    rax,[rip+0x9b0ff5]        # 18443c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaa8>
  e933cb:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  e933cf:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  e933d3:	4c 89 fe             	mov    rsi,r15
  e933d6:	e8 15 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e933db:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
  e933e2:	00 00
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
  e9345d:	00
  e9345e:	48 85 c0             	test   rax,rax
  e93461:	74 0d                	je     e93470 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a886>
  e93463:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e93468:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
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
  e934e3:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e934e9:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e934f0:	00
  e934f1:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e934f8:	00
  e934f9:	e8 d0 5f 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e934fe:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
  e93505:	00
  e93506:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
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
```
### `0xe9344e`

```text
  e933d6:	e8 15 4b c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
  e933db:	48 83 a4 24 50 10 00 	and    QWORD PTR [rsp+0x1050],0x0
  e933e2:	00 00
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
  e9345d:	00
  e9345e:	48 85 c0             	test   rax,rax
  e93461:	74 0d                	je     e93470 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a886>
  e93463:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e93468:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
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
  e934e3:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e934e9:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e934f0:	00
  e934f1:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e934f8:	00
  e934f9:	e8 d0 5f 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e934fe:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
  e93505:	00
  e93506:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
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
  e93584:	48 89 da             	mov    rdx,rbx
  e93587:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e9358d:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e93594:	00
  e93595:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e9359c:	00
  e9359d:	e8 2c 5f 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e935a2:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e935a7:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
  e935ae:	00
  e935af:	e8 d2 ae c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e935b4:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
```
### `0xe93456`

```text
  e933e2:	00 00
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
  e9345d:	00
  e9345e:	48 85 c0             	test   rax,rax
  e93461:	74 0d                	je     e93470 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a886>
  e93463:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  e93468:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
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
  e934e3:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
  e934e9:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e934f0:	00
  e934f1:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e934f8:	00
  e934f9:	e8 d0 5f 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e934fe:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
  e93505:	00
  e93506:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
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
  e93584:	48 89 da             	mov    rdx,rbx
  e93587:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e9358d:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
  e93594:	00
  e93595:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
  e9359c:	00
  e9359d:	e8 2c 5f 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
  e935a2:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
  e935a7:	48 8b bc 24 58 10 00 	mov    rdi,QWORD PTR [rsp+0x1058]
  e935ae:	00
  e935af:	e8 d2 ae c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e935b4:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
  e935bb:	00
  e935bc:	e8 27 72 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
```
### `0xe95091`

```text
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
```
### `0xe95099`

```text
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
```
## Candidate AP literal materializations in the surrounding window

| addr | instruction |
|---:|---|
| `0xe9204a` | `e9204a:	48 8d 05 57 f9 99 00 	lea    rax,[rip+0x99f957]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>` |
| `0xe9207e` | `e9207e:	48 8d 05 5b f9 99 00 	lea    rax,[rip+0x99f95b]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>` |
| `0xe920a8` | `e920a8:	48 8d 05 79 f9 99 00 	lea    rax,[rip+0x99f979]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>` |
| `0xe94f99` | `e94f99:	48 8d 05 f0 f8 9a 00 	lea    rax,[rip+0x9af8f0]        # 1844890 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf78>` |
| `0xe94fd4` | `e94fd4:	48 8d 05 fd f8 9a 00 	lea    rax,[rip+0x9af8fd]        # 18448d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xfc0>` |

## Interpretation guide

If `[rsp+0x390]` is filled from a constructed object or shared pointer before `e95091`, the decisive rows are the last writer to `[rsp+0x390]` and the AP literal installed into that pointed object.
