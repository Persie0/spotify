# ef91cc owner publication trace

Known:
- 0xe9ccb0 allocates 0x3d0-byte object
- 0xe9cceb stores AP 0x18365e0 into object[0]
- AP 0x18365e0 +0x30 = 0xef91cc
- 0xe9d0bd stores completed object pointer r12 into [rsp+0x660]
- ef91cc readiness source is incoming second argument rsi, not this+0x10

## Enclosing FDE for e9ccb0: (15310087, 15343400)
- size: 0x8221

## Every rsp+0x660 reference in enclosing FDE
### WRITE 0xe9cca2: and    QWORD PTR [rsp+0x660],0x0
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

### WRITE 0xe9d0bd: mov    QWORD PTR [rsp+0x660],r12
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

- reference count: 2

## r12 uses after publication until first obvious clobber
      e9d0bd:	4c 89 a4 24 60 06 00 	mov    QWORD PTR [rsp+0x660],r12
      e9d26f:	4c 8d a4 24 80 07 00 	lea    r12,[rsp+0x780]
      e9d277:	4d 89 74 24 f0       	mov    QWORD PTR [r12-0x10],r14
      e9d284:	4c 89 e7             	mov    rdi,r12
      e9d35a:	4c 89 e6             	mov    rsi,r12
      e9d367:	4c 8d 63 50          	lea    r12,[rbx+0x50]
      e9d36b:	4c 89 e7             	mov    rdi,r12
      e9d494:	4c 8d a4 24 60 11 00 	lea    r12,[rsp+0x1160]
      e9d4a4:	4c 89 e7             	mov    rdi,r12
      e9d571:	4c 89 e6             	mov    rsi,r12
      e9d5c6:	4c 8d a4 24 e0 03 00 	lea    r12,[rsp+0x3e0]
      e9d5d6:	4c 89 e7             	mov    rdi,r12
      e9d612:	4c 89 e2             	mov    rdx,r12
      e9d625:	4c 89 e7             	mov    rdi,r12
      e9d690:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]

## Final 0x1000 bytes of enclosing FDE
      ea0f2b:	e8 56 d5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea0f30:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      ea0f37:	00 
      ea0f38:	e8 53 cf 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea0f3d:	e9 d6 02 00 00       	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea0f42:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0f47:	eb b3                	jmp    ea0efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68312>
      ea0f49:	49 89 c5             	mov    r13,rax
      ea0f4c:	4c 89 e7             	mov    rdi,r12
      ea0f4f:	e8 72 57 00 00       	call   ea66c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dadc>
      ea0f54:	48 89 df             	mov    rdi,rbx
      ea0f57:	e8 4c bd ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
      ea0f5c:	4c 89 ff             	mov    rdi,r15
      ea0f5f:	e8 02 8f 93 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ea0f64:	48 89 ef             	mov    rdi,rbp
      ea0f67:	e8 a4 d0 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea0f6c:	48 89 ef             	mov    rdi,rbp
      ea0f6f:	e8 a8 d4 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea0f74:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      ea0f79:	eb a3                	jmp    ea0f1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68334>
      ea0f7b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0f80:	eb 9c                	jmp    ea0f1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68334>
      ea0f82:	48 89 c3             	mov    rbx,rax
      ea0f85:	4c 89 e7             	mov    rdi,r12
      ea0f88:	e8 47 58 00 00       	call   ea67d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6dbea>
      ea0f8d:	4c 89 ef             	mov    rdi,r13
      ea0f90:	e8 13 bd ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
      ea0f95:	4c 89 ff             	mov    rdi,r15
      ea0f98:	e8 c9 8e 93 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ea0f9d:	4c 89 f7             	mov    rdi,r14
      ea0fa0:	e8 6b d0 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea0fa5:	4c 89 f7             	mov    rdi,r14
      ea0fa8:	e8 6f d4 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea0fad:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0fb2:	e9 6f ff ff ff       	jmp    ea0f26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6833c>
      ea0fb7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0fbc:	e9 65 ff ff ff       	jmp    ea0f26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6833c>
      ea0fc1:	48 89 c3             	mov    rbx,rax
      ea0fc4:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      ea0fc9:	4c 89 f7             	mov    rdi,r14
      ea0fcc:	e8 3f d0 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea0fd1:	4c 89 f7             	mov    rdi,r14
      ea0fd4:	e8 43 d4 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea0fd9:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea0fde:	e9 4d ff ff ff       	jmp    ea0f30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68346>
      ea0fe3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea0fe8:	e9 43 ff ff ff       	jmp    ea0f30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68346>
      ea0fed:	48 89 c3             	mov    rbx,rax
      ea0ff0:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea0ff7:	00 
      ea0ff8:	e8 71 72 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea0ffd:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea1002:	e9 11 02 00 00       	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea1007:	e9 07 02 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea100c:	48 89 c3             	mov    rbx,rax
      ea100f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1016:	00 
      ea1017:	e8 52 72 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea101c:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ea1021:	eb 05                	jmp    ea1028 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6843e>
      ea1023:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1028:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
      ea102f:	00 
      ea1030:	e8 51 d4 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1035:	e9 de 01 00 00       	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea103a:	e9 c0 01 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea103f:	e9 88 00 00 00       	jmp    ea10cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684e2>
      ea1044:	e9 ca 01 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea1049:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea104e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1055:	00 
      ea1056:	e8 13 72 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea105b:	eb 33                	jmp    ea1090 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684a6>
      ea105d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1062:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1069:	00 
      ea106a:	e8 fb 8e bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea106f:	eb 05                	jmp    ea1076 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6848c>
      ea1071:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1076:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea107d:	00 
      ea107e:	e8 6b 1b 06 00       	call   f02bee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca004>
      ea1083:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea108a:	00 
      ea108b:	e8 00 ce 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea1090:	66 0f ef c0          	pxor   xmm0,xmm0
      ea1094:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      ea109a:	eb 05                	jmp    ea10a1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684b7>
      ea109c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10a1:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      ea10a8:	00 
      ea10a9:	e8 4c 6a 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      ea10ae:	eb 05                	jmp    ea10b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684cb>
      ea10b0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10b5:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea10bb:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea10c2:	e9 23 01 00 00       	jmp    ea11ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68600>
      ea10c7:	e9 33 01 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea10cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10d1:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea10d8:	00 
      ea10d9:	e8 8c 8e bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea10de:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea10e5:	00 
      ea10e6:	e9 4d fe ff ff       	jmp    ea0f38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6834e>
      ea10eb:	e9 23 01 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea10f0:	e9 0a 01 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea10f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea10fa:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1101:	00 
      ea1102:	e8 63 8e bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1107:	eb 05                	jmp    ea110e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68524>
      ea1109:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea110e:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1115:	00 
      ea1116:	e8 f5 19 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea111b:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1122:	00 
      ea1123:	e9 10 fe ff ff       	jmp    ea0f38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6834e>
      ea1128:	e9 e6 00 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea112d:	e9 e1 00 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea1132:	e9 c8 00 00 00       	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea1137:	e9 d7 00 00 00       	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea113c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1141:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1148:	00 
      ea1149:	e8 20 71 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea114e:	eb 12                	jmp    ea1162 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68578>
      ea1150:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1155:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea115b:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      ea1162:	48 89 df             	mov    rdi,rbx
      ea1165:	e9 80 00 00 00       	jmp    ea11ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68600>
      ea116a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea116f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1176:	00 
      ea1177:	e8 f2 70 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea117c:	eb 61                	jmp    ea11df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685f5>
      ea117e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1183:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea118a:	00 
      ea118b:	e8 74 2d 06 00       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
      ea1190:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1197:	00 
      ea1198:	e8 cd 8d bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea119d:	eb 05                	jmp    ea11a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685ba>
      ea119f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea11a4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea11ab:	00 
      ea11ac:	e8 53 2d 06 00       	call   f03f04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb31a>
      ea11b1:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea11b8:	00 
      ea11b9:	e8 d2 cc 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea11be:	eb 1f                	jmp    ea11df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685f5>
      ea11c0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea11c5:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea11cb:	66 49 0f 3a 16 c5 01 	pextrq r13,xmm0,0x1
      ea11d2:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
      ea11d8:	66 49 0f 3a 16 c4 01 	pextrq r12,xmm0,0x1
      ea11df:	4c 89 ef             	mov    rdi,r13
      ea11e2:	e8 9f d2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea11e7:	4c 89 e7             	mov    rdi,r12
      ea11ea:	e8 97 d2 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea11ef:	eb 27                	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea11f1:	eb 0c                	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea11f3:	eb 1e                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11f5:	eb 08                	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea11f7:	eb 1a                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11f9:	eb 04                	jmp    ea11ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68615>
      ea11fb:	eb 16                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11fd:	eb 14                	jmp    ea1213 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68629>
      ea11ff:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1204:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea120b:	00 
      ea120c:	e8 5d 70 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea1211:	eb 05                	jmp    ea1218 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6862e>
      ea1213:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1218:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea121f:	00 
      ea1220:	e8 49 70 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea1225:	e9 22 06 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea122a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea122f:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      ea1236:	00 
      ea1237:	e8 8e 90 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea123c:	eb 05                	jmp    ea1243 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68659>
      ea123e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1243:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea124a:	00 
      ea124b:	e8 02 79 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea1250:	eb 05                	jmp    ea1257 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6866d>
      ea1252:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1257:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea125e:	00 
      ea125f:	e8 06 8d bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1264:	eb 19                	jmp    ea127f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68695>
      ea1266:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea126b:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1272:	00 
      ea1273:	e8 52 90 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea1278:	eb 05                	jmp    ea127f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68695>
      ea127a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea127f:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1286:	00 
      ea1287:	e8 c6 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea128c:	48 8d bc 24 88 01 00 	lea    rdi,[rsp+0x188]
      ea1293:	00 
      ea1294:	e8 f7 cb 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea1299:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea12a0:	00 
      ea12a1:	e8 ac 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea12a6:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea12ad:	00 
      ea12ae:	e8 9f 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea12b3:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea12ba:	00 
      ea12bb:	e8 92 78 61 00       	call   14b8b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe0d6>
      ea12c0:	e9 bd 00 00 00       	jmp    ea1382 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68798>
      ea12c5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12ca:	eb c0                	jmp    ea128c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686a2>
      ea12cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12d1:	eb c6                	jmp    ea1299 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686af>
      ea12d3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12d8:	eb cc                	jmp    ea12a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686bc>
      ea12da:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12df:	eb d2                	jmp    ea12b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686c9>
      ea12e1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea12e6:	48 8b bc 24 08 10 00 	mov    rdi,QWORD PTR [rsp+0x1008]
      ea12ed:	00 
      ea12ee:	e8 93 d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea12f3:	48 8b bc 24 f8 0f 00 	mov    rdi,QWORD PTR [rsp+0xff8]
      ea12fa:	00 
      ea12fb:	e8 86 d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1300:	48 8b bc 24 e8 0f 00 	mov    rdi,QWORD PTR [rsp+0xfe8]
      ea1307:	00 
      ea1308:	e8 79 d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea130d:	48 8b bc 24 d8 0f 00 	mov    rdi,QWORD PTR [rsp+0xfd8]
      ea1314:	00 
      ea1315:	e8 6c d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea131a:	48 8b bc 24 c8 0f 00 	mov    rdi,QWORD PTR [rsp+0xfc8]
      ea1321:	00 
      ea1322:	e8 5f d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1327:	4c 89 ef             	mov    rdi,r13
      ea132a:	e8 3b 8c bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea132f:	eb 05                	jmp    ea1336 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6874c>
      ea1331:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1336:	48 89 df             	mov    rdi,rbx
      ea1339:	e8 2c 8c bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea133e:	eb 05                	jmp    ea1345 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6875b>
      ea1340:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1345:	48 8b bc 24 58 0f 00 	mov    rdi,QWORD PTR [rsp+0xf58]
      ea134c:	00 
      ea134d:	e8 34 d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1352:	48 8b bc 24 48 0f 00 	mov    rdi,QWORD PTR [rsp+0xf48]
      ea1359:	00 
      ea135a:	e8 27 d1 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea135f:	4c 89 e7             	mov    rdi,r12
      ea1362:	e8 03 8c bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1367:	eb 05                	jmp    ea136e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68784>
      ea1369:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea136e:	48 8d bc 24 e0 0e 00 	lea    rdi,[rsp+0xee0]
      ea1375:	00 
      ea1376:	e8 ef 8b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea137b:	eb 05                	jmp    ea1382 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68798>
      ea137d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1382:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      ea1389:	00 
      ea138a:	e8 db 8b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea138f:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
      ea1396:	00 
      ea1397:	e8 ce 8b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea139c:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
      ea13a3:	00 
      ea13a4:	e8 c1 8b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea13a9:	48 89 ef             	mov    rdi,rbp
      ea13ac:	e8 d5 d0 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea13b1:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
      ea13b8:	00 
      ea13b9:	e8 ac 8b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea13be:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      ea13c5:	00 
      ea13c6:	e8 9f 8b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea13cb:	e9 7c 04 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea13d0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea13d5:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea13dc:	00 
      ea13dd:	e8 8c 6e ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea13e2:	eb 26                	jmp    ea140a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68820>
      ea13e4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea13e9:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea13f0:	00 
      ea13f1:	e8 74 8b bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea13f6:	31 ff                	xor    edi,edi
      ea13f8:	e8 89 d0 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea13fd:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1404:	00 
      ea1405:	e8 86 ca 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea140a:	0f 57 c0             	xorps  xmm0,xmm0
      ea140d:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      ea1412:	eb 05                	jmp    ea1419 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6882f>
      ea1414:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1419:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea141f:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1426:	e8 5b d0 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea142b:	e9 1c 04 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea1430:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1435:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      ea143c:	00 
      ea143d:	e8 06 34 c1 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
      ea1442:	eb 05                	jmp    ea1449 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6885f>
      ea1444:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1449:	6a 40                	push   0x40
      ea144b:	5b                   	pop    rbx
      ea144c:	48 8b bc 1c 68 07 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0x768]
      ea1453:	00 
      ea1454:	e8 2d d0 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1459:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      ea145d:	75 ed                	jne    ea144c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68862>
      ea145f:	45 31 ed             	xor    r13d,r13d
      ea1462:	31 ff                	xor    edi,edi
      ea1464:	e8 1d d0 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1469:	b3 01                	mov    bl,0x1
      ea146b:	eb 07                	jmp    ea1474 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6888a>
      ea146d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1472:	31 db                	xor    ebx,ebx
      ea1474:	48 8d 84 24 a0 07 00 	lea    rax,[rsp+0x7a0]
      ea147b:	00 
      ea147c:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      ea1481:	31 ff                	xor    edi,edi
      ea1483:	e8 fe cf bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1488:	eb 0c                	jmp    ea1496 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x688ac>
      ea148a:	4c 89 74 24 50       	mov    QWORD PTR [rsp+0x50],r14
      ea148f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1494:	31 db                	xor    ebx,ebx
      ea1496:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea149d:	00 
      ea149e:	e8 c7 8a bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea14a3:	31 ff                	xor    edi,edi
      ea14a5:	e8 dc cf bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea14aa:	eb 07                	jmp    ea14b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x688c9>
      ea14ac:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea14b1:	31 db                	xor    ebx,ebx
      ea14b3:	31 ff                	xor    edi,edi
      ea14b5:	e8 cc cf bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea14ba:	84 db                	test   bl,bl
      ea14bc:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      ea14c3:	00 
      ea14c4:	4c 8b 74 24 50       	mov    r14,QWORD PTR [rsp+0x50]
      ea14c9:	75 12                	jne    ea14dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x688f3>
      ea14cb:	49 8b 7e f8          	mov    rdi,QWORD PTR [r14-0x8]
      ea14cf:	49 83 c6 f0          	add    r14,0xfffffffffffffff0
      ea14d3:	e8 ae cf bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea14d8:	49 39 de             	cmp    r14,rbx
      ea14db:	75 ee                	jne    ea14cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x688e1>
      ea14dd:	4d 85 ed             	test   r13,r13
      ea14e0:	75 07                	jne    ea14e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x688ff>
      ea14e2:	eb 0f                	jmp    ea14f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68909>
      ea14e4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea14e9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      ea14ed:	4c 89 ef             	mov    rdi,r13
      ea14f0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      ea14f3:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea14fa:	00 
      ea14fb:	e8 6a 8a bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1500:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea1507:	00 
      ea1508:	e8 e1 63 e1 ff       	call   cb78ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20488e>
      ea150d:	e9 11 07 00 00       	jmp    ea1c23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69039>
      ea1512:	e9 77 05 00 00       	jmp    ea1a8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ea4>
      ea1517:	e9 6e 06 00 00       	jmp    ea1b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa0>
      ea151c:	e9 90 09 00 00       	jmp    ea1eb1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x692c7>
      ea1521:	e9 8b 09 00 00       	jmp    ea1eb1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x692c7>
      ea1526:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea152b:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1532:	00 
      ea1533:	e8 58 c9 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea1538:	e9 0f 03 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea153d:	eb 3d                	jmp    ea157c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68992>
      ea153f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1544:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea154b:	00 
      ea154c:	e8 1d 6d ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea1551:	eb 05                	jmp    ea1558 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6896e>
      ea1553:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1558:	48 8b bc 24 68 01 00 	mov    rdi,QWORD PTR [rsp+0x168]
      ea155f:	00 
      ea1560:	e8 21 cf bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1565:	e9 e2 02 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea156a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea156f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1576:	00 
      ea1577:	e9 a4 fc ff ff       	jmp    ea1220 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68636>
      ea157c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1581:	e9 c6 02 00 00       	jmp    ea184c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c62>
      ea1586:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea158b:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
      ea1592:	00 
      ea1593:	e8 ee ce bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1598:	31 ff                	xor    edi,edi
      ea159a:	e8 e7 ce bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea159f:	e9 79 05 00 00       	jmp    ea1b1d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f33>
      ea15a4:	e9 60 08 00 00       	jmp    ea1e09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6921f>
      ea15a9:	e9 a3 04 00 00       	jmp    ea1a51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68e67>
      ea15ae:	e9 b9 04 00 00       	jmp    ea1a6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68e82>
      ea15b3:	e9 d6 04 00 00       	jmp    ea1a8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ea4>
      ea15b8:	e9 cd 05 00 00       	jmp    ea1b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa0>
      ea15bd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea15c2:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
      ea15c9:	00 
      ea15ca:	e8 b7 ce bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea15cf:	31 ff                	xor    edi,edi
      ea15d1:	e8 b0 ce bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea15d6:	e9 b4 05 00 00       	jmp    ea1b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa5>
      ea15db:	e9 aa 05 00 00       	jmp    ea1b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa0>
      ea15e0:	e9 4b 05 00 00       	jmp    ea1b30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f46>
      ea15e5:	e9 61 05 00 00       	jmp    ea1b4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f61>
      ea15ea:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea15ef:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea15f6:	00 
      ea15f7:	e8 72 6c ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea15fc:	eb 51                	jmp    ea164f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68a65>
      ea15fe:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1603:	e9 1b 06 00 00       	jmp    ea1c23 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69039>
      ea1608:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea160d:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1614:	00 
      ea1615:	e8 50 89 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea161a:	eb 12                	jmp    ea162e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68a44>
      ea161c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1621:	48 8d bc 24 a0 0e 00 	lea    rdi,[rsp+0xea0]
      ea1628:	00 
      ea1629:	e8 e2 14 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea162e:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1635:	00 
      ea1636:	e8 2f 89 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea163b:	eb 12                	jmp    ea164f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68a65>
      ea163d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1642:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea1649:	00 
      ea164a:	e8 c1 14 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea164f:	48 89 df             	mov    rdi,rbx
      ea1652:	e8 2f ce bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1657:	e9 3c 06 00 00       	jmp    ea1c98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690ae>
      ea165c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1661:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1668:	00 
      ea1669:	e8 fc 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea166e:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1675:	00 
      ea1676:	e8 ef 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea167b:	e9 01 07 00 00       	jmp    ea1d81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69197>
      ea1680:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1685:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea168c:	00 
      ea168d:	e8 dc 6b ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
      ea1692:	e9 9b 01 00 00       	jmp    ea1832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c48>
      ea1697:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea169c:	48 8d bc 24 d0 0e 00 	lea    rdi,[rsp+0xed0]
      ea16a3:	00 
      ea16a4:	e8 c1 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16a9:	e9 b2 00 00 00       	jmp    ea1760 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b76>
      ea16ae:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16b3:	48 89 ef             	mov    rdi,rbp
      ea16b6:	e8 af 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16bb:	eb 05                	jmp    ea16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ad8>
      ea16bd:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16c2:	4c 89 f7             	mov    rdi,r14
      ea16c5:	e8 a0 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16ca:	eb 05                	jmp    ea16d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ae7>
      ea16cc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16d1:	48 89 df             	mov    rdi,rbx
      ea16d4:	e8 91 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16d9:	eb 05                	jmp    ea16e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68af6>
      ea16db:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16e0:	4c 89 ff             	mov    rdi,r15
      ea16e3:	e8 82 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea16e8:	eb 05                	jmp    ea16ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b05>
      ea16ea:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea16ef:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]
      ea16f6:	00 
      ea16f7:	e8 ce 8b bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea16fc:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1703:	00 
      ea1704:	e8 df 71 06 00       	call   f088e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcfe>
      ea1709:	eb 55                	jmp    ea1760 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b76>
      ea170b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1710:	eb ea                	jmp    ea16fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b12>
      ea1712:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1717:	48 8d bc 24 30 11 00 	lea    rdi,[rsp+0x1130]
      ea171e:	00 
      ea171f:	e8 46 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1724:	eb 05                	jmp    ea172b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b41>
      ea1726:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea172b:	4c 89 ff             	mov    rdi,r15
      ea172e:	e8 37 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1733:	eb 05                	jmp    ea173a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b50>
      ea1735:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea173a:	48 89 ef             	mov    rdi,rbp
      ea173d:	e8 28 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1742:	eb 05                	jmp    ea1749 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b5f>
      ea1744:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1749:	4c 89 f7             	mov    rdi,r14
      ea174c:	e8 19 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1751:	eb 05                	jmp    ea1758 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b6e>
      ea1753:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1758:	48 89 df             	mov    rdi,rbx
      ea175b:	e8 0a 88 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1760:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1767:	00 
      ea1768:	e8 fd 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea176d:	e9 c0 00 00 00       	jmp    ea1832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c48>
      ea1772:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1777:	eb e7                	jmp    ea1760 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68b76>
      ea1779:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea177e:	4c 89 ff             	mov    rdi,r15
      ea1781:	e8 e4 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1786:	eb 05                	jmp    ea178d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ba3>
      ea1788:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea178d:	4c 89 f7             	mov    rdi,r14
      ea1790:	e8 d5 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1795:	eb 05                	jmp    ea179c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68bb2>
      ea1797:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea179c:	4c 89 e7             	mov    rdi,r12
      ea179f:	e8 c6 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea17a4:	eb 05                	jmp    ea17ab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68bc1>
      ea17a6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea17ab:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ea17b0:	e8 b5 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea17b5:	eb 05                	jmp    ea17bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68bd2>
      ea17b7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea17bc:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea17c3:	00 
      ea17c4:	e8 01 8b bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea17c9:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea17d0:	00 
      ea17d1:	e8 12 71 06 00       	call   f088e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcfcfe>
      ea17d6:	eb 5a                	jmp    ea1832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c48>
      ea17d8:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea17dd:	eb ea                	jmp    ea17c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68bdf>
      ea17df:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea17e4:	48 8d bc 24 40 08 00 	lea    rdi,[rsp+0x840]
      ea17eb:	00 
      ea17ec:	e8 79 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea17f1:	eb 05                	jmp    ea17f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c0e>
      ea17f3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea17f8:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
      ea17ff:	00 
      ea1800:	e8 65 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1805:	eb 05                	jmp    ea180c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c22>
      ea1807:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea180c:	4c 89 ef             	mov    rdi,r13
      ea180f:	e8 56 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1814:	eb 05                	jmp    ea181b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68c31>
      ea1816:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea181b:	4c 89 f7             	mov    rdi,r14
      ea181e:	e8 47 87 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
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
      ea18b9:	00 
      ea18ba:	e8 c7 cb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea18bf:	48 89 df             	mov    rdi,rbx
      ea18c2:	e8 a3 86 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea18c7:	eb 05                	jmp    ea18ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68ce4>
      ea18c9:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea18ce:	49 8b bc 24 08 02 00 	mov    rdi,QWORD PTR [r12+0x208]
      ea18d5:	00 
      ea18d6:	e8 ab cb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea18db:	4c 89 e7             	mov    rdi,r12
      ea18de:	48 81 c7 80 01 00 00 	add    rdi,0x180
      ea18e5:	e8 80 86 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea18ea:	eb 05                	jmp    ea18f1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68d07>
      ea18ec:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea18f1:	49 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [r12+0x158]
      ea18f8:	00 
      ea18f9:	e8 88 cb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea18fe:	4c 89 f7             	mov    rdi,r14
      ea1901:	e8 64 86 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1906:	48 89 ef             	mov    rdi,rbp
      ea1909:	e8 5c 86 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea190e:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      ea1915:	00 
      ea1916:	e8 4f 86 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea191b:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      ea1920:	e8 45 86 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1925:	49 8b 7c 24 68       	mov    rdi,QWORD PTR [r12+0x68]
      ea192a:	e8 57 cb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea192f:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ea1934:	e8 31 86 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1939:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1940:	00 
      ea1941:	e8 84 89 bd ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ea1946:	eb 05                	jmp    ea194d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68d63>
      ea1948:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea194d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      ea1954:	00 
      ea1955:	e8 14 76 05 00       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      ea195a:	e9 b5 00 00 00       	jmp    ea1a14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68e2a>
      ea195f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1964:	48 8d bc 24 c0 09 00 	lea    rdi,[rsp+0x9c0]
      ea196b:	00 
      ea196c:	e8 f9 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1971:	eb 05                	jmp    ea1978 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68d8e>
      ea1973:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1978:	48 8b bc 24 b8 09 00 	mov    rdi,QWORD PTR [rsp+0x9b8]
      ea197f:	00 
      ea1980:	e8 01 cb bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1985:	48 8d bc 24 80 09 00 	lea    rdi,[rsp+0x980]
      ea198c:	00 
      ea198d:	e8 d8 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1992:	eb 05                	jmp    ea1999 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68daf>
      ea1994:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1999:	4c 8d b4 24 e0 08 00 	lea    r14,[rsp+0x8e0]
      ea19a0:	00 
      ea19a1:	49 8b be 88 00 00 00 	mov    rdi,QWORD PTR [r14+0x88]
      ea19a8:	e8 d9 ca bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea19ad:	4c 89 f7             	mov    rdi,r14
      ea19b0:	e8 b5 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea19b5:	eb 05                	jmp    ea19bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68dd2>
      ea19b7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea19bc:	48 8b bc 24 b8 08 00 	mov    rdi,QWORD PTR [rsp+0x8b8]
      ea19c3:	00 
      ea19c4:	e8 bd ca bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea19c9:	48 89 df             	mov    rdi,rbx
      ea19cc:	e8 99 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea19d1:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
      ea19d8:	00 
      ea19d9:	e8 8c 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea19de:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      ea19e5:	00 
      ea19e6:	e8 7f 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea19eb:	48 8d bc 24 d0 07 00 	lea    rdi,[rsp+0x7d0]
      ea19f2:	00 
      ea19f3:	e8 72 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea19f8:	48 8b bc 24 c8 07 00 	mov    rdi,QWORD PTR [rsp+0x7c8]
      ea19ff:	00 
      ea1a00:	e8 81 ca bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1a05:	eb 05                	jmp    ea1a0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68e22>
      ea1a07:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1a0c:	48 89 ef             	mov    rdi,rbp
      ea1a0f:	e8 56 85 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1a14:	4c 89 ef             	mov    rdi,r13
      ea1a17:	e8 6a ca bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1a1c:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      ea1a23:	00 
      ea1a24:	e8 67 c4 94 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ea1a29:	e9 61 01 00 00       	jmp    ea1b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa5>
      ea1a2e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1a33:	4c 89 ef             	mov    rdi,r13
      ea1a36:	e8 d5 c5 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea1a3b:	4c 89 ef             	mov    rdi,r13
      ea1a3e:	e8 d9 c9 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea1a43:	eb d7                	jmp    ea1a1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68e32>
      ea1a45:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1a4a:	eb d0                	jmp    ea1a1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68e32>
      ea1a4c:	e9 39 01 00 00       	jmp    ea1b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa0>
      ea1a51:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1a56:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
      ea1a5d:	00 
      ea1a5e:	e8 23 ca bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1a63:	31 ff                	xor    edi,edi
      ea1a65:	e8 1c ca bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1a6a:	eb 1a                	jmp    ea1a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68e9c>
      ea1a6c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1a71:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1a77:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      ea1a7e:	48 89 df             	mov    rdi,rbx
      ea1a81:	e8 00 ca bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1a86:	48 89 df             	mov    rdi,rbx
      ea1a89:	e9 da 00 00 00       	jmp    ea1b68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f7e>
      ea1a8e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1a93:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
      ea1a9a:	00 
      ea1a9b:	e8 e6 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1aa0:	31 ff                	xor    edi,edi
      ea1aa2:	e8 df c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1aa7:	e9 e3 00 00 00       	jmp    ea1b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa5>
      ea1aac:	e9 d9 00 00 00       	jmp    ea1b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa0>
      ea1ab1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1ab6:	48 8b bc 24 28 05 00 	mov    rdi,QWORD PTR [rsp+0x528]
      ea1abd:	00 
      ea1abe:	e8 c3 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1ac3:	31 ff                	xor    edi,edi
      ea1ac5:	e8 bc c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1aca:	eb 44                	jmp    ea1b10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f26>
      ea1acc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1ad1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1ad8:	00 
      ea1ad9:	e8 32 10 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea1ade:	48 89 df             	mov    rdi,rbx
      ea1ae1:	e8 2a c5 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea1ae6:	48 89 df             	mov    rdi,rbx
      ea1ae9:	e8 2e c9 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea1aee:	eb 05                	jmp    ea1af5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f0b>
      ea1af0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1af5:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      ea1afc:	00 
      ea1afd:	e8 0e 10 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ea1b02:	31 ff                	xor    edi,edi
      ea1b04:	e8 7d c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b09:	eb 05                	jmp    ea1b10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f26>
      ea1b0b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b10:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      ea1b17:	00 
      ea1b18:	e8 dd 5f 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      ea1b1d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1b23:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1b2a:	eb 3c                	jmp    ea1b68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f7e>
      ea1b2c:	eb 02                	jmp    ea1b30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f46>
      ea1b2e:	eb 1b                	jmp    ea1b4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f61>
      ea1b30:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b35:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      ea1b3c:	00 
      ea1b3d:	e8 44 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b42:	31 ff                	xor    edi,edi
      ea1b44:	e8 3d c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b49:	eb 1a                	jmp    ea1b65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68f7b>
      ea1b4b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b50:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ea1b56:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
      ea1b5d:	4c 89 f7             	mov    rdi,r14
      ea1b60:	e8 21 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b65:	4c 89 f7             	mov    rdi,r14
      ea1b68:	e8 19 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b6d:	eb 20                	jmp    ea1b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa5>
      ea1b6f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b74:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
      ea1b7b:	00 
      ea1b7c:	e8 05 c9 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b81:	31 ff                	xor    edi,edi
      ea1b83:	e8 fe c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1b88:	eb 05                	jmp    ea1b8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fa5>
      ea1b8a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1b8f:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      ea1b96:	00 
      ea1b97:	e8 86 bf c1 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      ea1b9c:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]
      ea1ba2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      ea1ba9:	e8 d8 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1bae:	31 c0                	xor    eax,eax
      ea1bb0:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      ea1bb5:	31 ff                	xor    edi,edi
      ea1bb7:	e8 ca c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1bbc:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1bc3:	00 
      ea1bc4:	e8 a1 83 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1bc9:	31 ff                	xor    edi,edi
      ea1bcb:	e8 b6 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1bd0:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
      ea1bd7:	00 
      ea1bd8:	e8 1d 5f 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      ea1bdd:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      ea1be2:	e8 9f c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1be7:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      ea1bec:	e8 95 c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1bf1:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      ea1bf6:	e8 8b c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1bfb:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      ea1c02:	00 
      ea1c03:	e8 7e c8 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
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
      ea1e29:	e8 38 80 93 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ea1e2e:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1e35:	00 
      ea1e36:	e8 2f 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1e3b:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1e42:	00 
      ea1e43:	e8 22 81 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1e48:	4c 89 ef             	mov    rdi,r13
      ea1e4b:	e8 c0 c1 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea1e50:	4c 89 ef             	mov    rdi,r13
      ea1e53:	e8 c4 c5 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea1e58:	e9 7a fe ff ff       	jmp    ea1cd7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690ed>
      ea1e5d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ea1e62:	e9 70 fe ff ff       	jmp    ea1cd7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690ed>
      ea1e67:	49 89 c4             	mov    r12,rax
      ea1e6a:	4c 89 ff             	mov    rdi,r15
      ea1e6d:	e8 f8 80 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1e72:	4c 89 f7             	mov    rdi,r14
      ea1e75:	e8 2e ae ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
      ea1e7a:	48 89 df             	mov    rdi,rbx
      ea1e7d:	e8 e4 7f 93 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ea1e82:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1e89:	00 
      ea1e8a:	e8 db 80 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1e8f:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1e96:	00 
      ea1e97:	e8 ce 80 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1e9c:	4c 89 ef             	mov    rdi,r13
      ea1e9f:	e8 6c c1 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea1ea4:	4c 89 ef             	mov    rdi,r13
      ea1ea7:	e8 70 c5 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea1eac:	e9 35 fe ff ff       	jmp    ea1ce6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690fc>
      ea1eb1:	49 89 c4             	mov    r12,rax
      ea1eb4:	e9 2d fe ff ff       	jmp    ea1ce6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x690fc>
      ea1eb9:	49 89 c4             	mov    r12,rax
      ea1ebc:	4c 89 ff             	mov    rdi,r15
      ea1ebf:	e8 a6 80 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1ec4:	4c 89 f7             	mov    rdi,r14
      ea1ec7:	e8 dc ad ee ff       	call   d8cca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59d2e>
      ea1ecc:	48 89 df             	mov    rdi,rbx
      ea1ecf:	e8 92 7f 93 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      ea1ed4:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
      ea1edb:	00 
      ea1edc:	e8 89 80 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1ee1:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
      ea1ee8:	00 
      ea1ee9:	e8 7c 80 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ea1eee:	4c 89 ef             	mov    rdi,r13
      ea1ef1:	e8 1a c1 94 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      ea1ef6:	4c 89 ef             	mov    rdi,r13
      ea1ef9:	e8 1e c5 bf ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ea1efe:	e9 ed fd ff ff       	jmp    ea1cf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69106>
      ea1f03:	49 89 c4             	mov    r12,rax
      ea1f06:	e9 e5 fd ff ff       	jmp    ea1cf0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69106>
      ea1f0b:	49 89 c4             	mov    r12,rax
      ea1f0e:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
      ea1f15:	00 
      ea1f16:	e8 6b c5 bf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ea1f1b:	e9 fc fd ff ff       	jmp    ea1d1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69132>
      ea1f20:	49 89 c4             	mov    r12,rax
      ea1f23:	e9 f4 fd ff ff       	jmp    ea1d1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69132>

## Candidate output stores sourced from rsp+0x660 / r12
### around ref 0xe9d0bd
      e9d08e:	48 8b 84 24 28 0b 00 	mov    rax,QWORD PTR [rsp+0xb28]
      e9d0d7:	4c 89 ef             	mov    rdi,r13
      e9d0e7:	48 89 df             	mov    rdi,rbx
      e9d0f7:	4c 89 f7             	mov    rdi,r14
      e9d139:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      e9d143:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      e9d14d:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e9d157:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e9d164:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      e9d16e:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]

## Direct callers of enclosing FDE entry
### 0xe95d35; caller FDE=(15281964, 15306555)
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

## Direct callers of likely interior entry points near e9ccb0
- target 0xe998b3: 0 direct refs
### target 0xe99aae, caller 0xe94a6d, FDE=(15281964, 15306555)
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

### target 0xe99aae, caller 0xe94ae2, FDE=(15281964, 15306555)
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

### target 0xe99aae, caller 0xe94b7a, FDE=(15281964, 15306555)
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

### target 0xe99aae, caller 0xe9bd4a, FDE=(15310087, 15343400)
      e9bcf9:	48 8d 48 18          	lea    rcx,[rax+0x18]
      e9bcfd:	48 8d 15 fc 18 9a 00 	lea    rdx,[rip+0x9a18fc]        # 183d600 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf598>
      e9bd04:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e9bd08:	48 8b b4 24 58 12 00 	mov    rsi,QWORD PTR [rsp+0x1258]
      e9bd0f:	00 
      e9bd10:	48 8b 56 08          	mov    rdx,QWORD PTR [rsi+0x8]
      e9bd14:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
      e9bd17:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      e9bd1b:	48 85 d2             	test   rdx,rdx
      e9bd1e:	74 05                	je     e9bd25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6313b>
      e9bd20:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
      e9bd25:	66 48 0f 6e c0       	movq   xmm0,rax
      e9bd2a:	66 48 0f 6e c9       	movq   xmm1,rcx
      e9bd2f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9bd33:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
      e9bd3a:	00 
      e9bd3b:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      e9bd3f:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9bd46:	00 
      e9bd47:	48 89 de             	mov    rsi,rbx
      e9bd4a:	e8 5f dd ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9bd4f:	4c 8b b4 24 98 12 00 	mov    r14,QWORD PTR [rsp+0x1298]
      e9bd56:	00 
      e9bd57:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
      e9bd5e:	00 
      e9bd5f:	e8 22 27 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bd64:	31 ff                	xor    edi,edi
      e9bd66:	e8 1b 27 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bd6b:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      e9bd6f:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9bd74:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
      e9bd78:	48 85 c0             	test   rax,rax
      e9bd7b:	74 0a                	je     e9bd87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6319d>
      e9bd7d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9bd82:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9bd87:	6a 60                	push   0x60
      e9bd89:	5f                   	pop    rdi
      e9bd8a:	e8 71 21 95 00       	call   17edf00 <_Znwm@plt>
      e9bd8f:	49 89 c7             	mov    r15,rax
      e9bd92:	0f 57 c0             	xorps  xmm0,xmm0
      e9bd95:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9bd99:	48 8d 2d 90 18 9a 00 	lea    rbp,[rip+0x9a1890]        # 183d630 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf5c8>
      e9bda0:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9bda3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9bda9:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
      e9bdb0:	4d 85 f6             	test   r14,r14
      e9bdb3:	44 88 64 24 26       	mov    BYTE PTR [rsp+0x26],r12b
      e9bdb8:	74 15                	je     e9bdcf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631e5>
      e9bdba:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bdbf:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9bdc6:	00 00 
      e9bdc8:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bdcd:	eb 12                	jmp    e9bde1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631f7>
      e9bdcf:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9bdd6:	00 00 
      e9bdd8:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0

### target 0xe99aae, caller 0xe9be54, FDE=(15310087, 15343400)
      e9bdff:	48 89 de             	mov    rsi,rbx
      e9be02:	e8 81 b4 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9be07:	48 89 df             	mov    rdi,rbx
      e9be0a:	e8 5b e1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9be0f:	4c 89 f7             	mov    rdi,r14
      e9be12:	e8 6f 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be17:	66 49 0f 6e c7       	movq   xmm0,r15
      e9be1c:	66 49 0f 6e cc       	movq   xmm1,r12
      e9be21:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9be25:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9be2b:	31 ff                	xor    edi,edi
      e9be2d:	e8 ea 25 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9be32:	4c 89 f7             	mov    rdi,r14
      e9be35:	e8 4c 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be3a:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9be41:	00 
      e9be42:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9be48:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9be4c:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9be53:	00 
      e9be54:	e8 55 dc ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9be59:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9be60:	00 
      e9be61:	e8 20 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be66:	31 ff                	xor    edi,edi
      e9be68:	e8 19 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be6d:	4c 89 f7             	mov    rdi,r14
      e9be70:	e8 11 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be75:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9be7c:	00 
      e9be7d:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9be80:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9be85:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      e9be89:	4d 85 f6             	test   r14,r14
      e9be8c:	74 0a                	je     e9be98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x632ae>
      e9be8e:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9be93:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9be98:	6a 60                	push   0x60
      e9be9a:	5f                   	pop    rdi
      e9be9b:	e8 60 20 95 00       	call   17edf00 <_Znwm@plt>
      e9bea0:	49 89 c7             	mov    r15,rax
      e9bea3:	48 8b 8c 24 48 13 00 	mov    rcx,QWORD PTR [rsp+0x1348]
      e9beaa:	00 
      e9beab:	0f 57 c0             	xorps  xmm0,xmm0
      e9beae:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9beb2:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9beb5:	48 8d 05 f4 14 9a 00 	lea    rax,[rip+0x9a14f4]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>
      e9bebc:	4d 85 f6             	test   r14,r14
      e9bebf:	74 21                	je     e9bee2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x632f8>
      e9bec1:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bec6:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9becd:	00 
      e9bece:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9bed3:	0f 11 84 24 78 07 00 	movups XMMWORD PTR [rsp+0x778],xmm0
      e9beda:	00 
      e9bedb:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]

### target 0xe99aae, caller 0xe9bf63, FDE=(15310087, 15343400)
      e9bf0e:	48 89 de             	mov    rsi,rbx
      e9bf11:	e8 72 b3 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9bf16:	48 89 df             	mov    rdi,rbx
      e9bf19:	e8 4c e0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9bf1e:	4c 89 f7             	mov    rdi,r14
      e9bf21:	e8 60 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf26:	66 49 0f 6e c7       	movq   xmm0,r15
      e9bf2b:	66 49 0f 6e cc       	movq   xmm1,r12
      e9bf30:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9bf34:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9bf3a:	31 ff                	xor    edi,edi
      e9bf3c:	e8 db 24 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9bf41:	4c 89 f7             	mov    rdi,r14
      e9bf44:	e8 3d 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf49:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9bf50:	00 
      e9bf51:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9bf57:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9bf5b:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9bf62:	00 
      e9bf63:	e8 46 db ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9bf68:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9bf6f:	00 
      e9bf70:	e8 11 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
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

### target 0xe99aae, caller 0xe9c076, FDE=(15310087, 15343400)
      e9c021:	48 89 de             	mov    rsi,rbx
      e9c024:	e8 5f b2 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c029:	48 89 df             	mov    rdi,rbx
      e9c02c:	e8 39 df bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c031:	4c 89 f7             	mov    rdi,r14
      e9c034:	e8 4d 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c039:	66 49 0f 6e c7       	movq   xmm0,r15
      e9c03e:	66 49 0f 6e cc       	movq   xmm1,r12
      e9c043:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c047:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c04d:	31 ff                	xor    edi,edi
      e9c04f:	e8 c8 23 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c054:	4c 89 f7             	mov    rdi,r14
      e9c057:	e8 2a 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c05c:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9c063:	00 
      e9c064:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c06a:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c06e:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c075:	00 
      e9c076:	e8 33 da ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c07b:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9c082:	00 
      e9c083:	e8 fe 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c088:	31 ff                	xor    edi,edi
      e9c08a:	e8 f7 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c08f:	4c 89 f7             	mov    rdi,r14
      e9c092:	e8 ef 23 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c097:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9c09e:	00 
      e9c09f:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9c0a3:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9c0a9:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
      e9c0ad:	48 85 db             	test   rbx,rbx
      e9c0b0:	74 05                	je     e9c0b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x634cd>
      e9c0b2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c0b7:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9c0be:	00 
      e9c0bf:	48 8d b4 24 28 02 00 	lea    rsi,[rsp+0x228]
      e9c0c6:	00 
      e9c0c7:	e8 f0 b9 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9c0cc:	bf 80 00 00 00       	mov    edi,0x80
      e9c0d1:	e8 2a 1e 95 00       	call   17edf00 <_Znwm@plt>
      e9c0d6:	49 89 c6             	mov    r14,rax
      e9c0d9:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c0dd:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c0e2:	48 8d 05 b7 11 9a 00 	lea    rax,[rip+0x9a11b7]        # 183d2a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf238>
      e9c0e9:	49 89 06             	mov    QWORD PTR [r14],rax
      e9c0ec:	4d 89 f7             	mov    r15,r14
      e9c0ef:	49 83 c7 18          	add    r15,0x18
      e9c0f3:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9c0fa:	00 
      e9c0fb:	4c 89 ff             	mov    rdi,r15
      e9c0fe:	e8 b9 b9 0d 00       	call   f77abc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13eed2>
      e9c103:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c109:	66 0f 7f 84 24 d0 0c 	movdqa XMMWORD PTR [rsp+0xcd0],xmm0

### target 0xe99aae, caller 0xe9c243, FDE=(15310087, 15343400)
      e9c1ef:	e8 1c 69 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9c1f4:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c1f9:	66 49 0f 6e cc       	movq   xmm1,r12
      e9c1fe:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c202:	66 0f 7f 8c 24 f0 00 	movdqa XMMWORD PTR [rsp+0xf0],xmm1
      e9c209:	00 00 
      e9c20b:	31 ff                	xor    edi,edi
      e9c20d:	e8 0a 22 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c212:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      e9c219:	00 
      e9c21a:	e8 f1 68 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      e9c21f:	31 ff                	xor    edi,edi
      e9c221:	e8 60 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c226:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
      e9c22d:	00 
      e9c22e:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
      e9c235:	00 00 
      e9c237:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c23b:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c242:	00 
      e9c243:	e8 66 d8 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c248:	48 8b bc 24 28 05 00 	mov    rdi,QWORD PTR [rsp+0x528]
      e9c24f:	00 
      e9c250:	e8 31 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c255:	31 ff                	xor    edi,edi
      e9c257:	e8 2a 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c25c:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
      e9c263:	00 
      e9c264:	e8 91 b8 0d 00       	call   f77afa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ef10>
      e9c269:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c26f:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9c276:	e8 0b 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c27b:	80 bc 24 21 07 00 00 	cmp    BYTE PTR [rsp+0x721],0x0
      e9c282:	00 
      e9c283:	0f 84 8b 00 00 00    	je     e9c314 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6372a>
      e9c289:	6a 30                	push   0x30
      e9c28b:	5f                   	pop    rdi
      e9c28c:	e8 6f 1c 95 00       	call   17edf00 <_Znwm@plt>
      e9c291:	48 89 c3             	mov    rbx,rax
      e9c294:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      e9c299:	66 48 0f 6e c0       	movq   xmm0,rax
      e9c29e:	f3 0f 7e 8c 24 20 01 	movq   xmm1,QWORD PTR [rsp+0x120]
      e9c2a5:	00 00 
      e9c2a7:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c2ab:	48 83 c0 08          	add    rax,0x8
      e9c2af:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c2b3:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9c2b8:	48 8d 0d 09 51 99 00 	lea    rcx,[rip+0x995109]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e9c2bf:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      e9c2c2:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9c2c6:	49 89 de             	mov    r14,rbx
      e9c2c9:	49 83 c6 18          	add    r14,0x18
      e9c2cd:	48 8d 05 6c 11 9a 00 	lea    rax,[rip+0x9a116c]        # 183d440 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf3d8>
      e9c2d4:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e9c2d8:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
      e9c2dd:	31 ff                	xor    edi,edi

### target 0xe99aae, caller 0xe9c2fb, FDE=(15310087, 15343400)
      e9c2a7:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c2ab:	48 83 c0 08          	add    rax,0x8
      e9c2af:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c2b3:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9c2b8:	48 8d 0d 09 51 99 00 	lea    rcx,[rip+0x995109]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e9c2bf:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      e9c2c2:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9c2c6:	49 89 de             	mov    r14,rbx
      e9c2c9:	49 83 c6 18          	add    r14,0x18
      e9c2cd:	48 8d 05 6c 11 9a 00 	lea    rax,[rip+0x9a116c]        # 183d440 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf3d8>
      e9c2d4:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e9c2d8:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
      e9c2dd:	31 ff                	xor    edi,edi
      e9c2df:	e8 a2 21 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c2e4:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9c2eb:	00 
      e9c2ec:	4c 89 36             	mov    QWORD PTR [rsi],r14
      e9c2ef:	48 89 5e 08          	mov    QWORD PTR [rsi+0x8],rbx
      e9c2f3:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c2fa:	00 
      e9c2fb:	e8 ae d7 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c300:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
      e9c307:	00 
      e9c308:	e8 79 21 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c30d:	31 ff                	xor    edi,edi
      e9c30f:	e8 72 21 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c314:	6a 60                	push   0x60
      e9c316:	5f                   	pop    rdi
      e9c317:	e8 e4 1b 95 00       	call   17edf00 <_Znwm@plt>
      e9c31c:	48 89 c3             	mov    rbx,rax
      e9c31f:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c323:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c328:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9c32b:	4c 8d 70 20          	lea    r14,[rax+0x20]
      e9c32f:	48 8d 05 c2 10 9a 00 	lea    rax,[rip+0x9a10c2]        # 183d3f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf390>
      e9c336:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c33d:	00 
      e9c33e:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c345:	00 
      e9c346:	4c 89 f7             	mov    rdi,r14
      e9c349:	4c 89 ee             	mov    rsi,r13
      e9c34c:	e8 37 af 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c351:	4c 89 ef             	mov    rdi,r13
      e9c354:	e8 11 dc bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c359:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c35e:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c363:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c367:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c36d:	31 ff                	xor    edi,edi
      e9c36f:	e8 a8 20 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c374:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c37b:	00 
      e9c37c:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c382:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c386:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c38d:	00 

### target 0xe99aae, caller 0xe9c38e, FDE=(15310087, 15343400)
      e9c33d:	00 
      e9c33e:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c345:	00 
      e9c346:	4c 89 f7             	mov    rdi,r14
      e9c349:	4c 89 ee             	mov    rsi,r13
      e9c34c:	e8 37 af 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c351:	4c 89 ef             	mov    rdi,r13
      e9c354:	e8 11 dc bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c359:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c35e:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c363:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c367:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c36d:	31 ff                	xor    edi,edi
      e9c36f:	e8 a8 20 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c374:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c37b:	00 
      e9c37c:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c382:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c386:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c38d:	00 
      e9c38e:	e8 1b d7 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c393:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
      e9c39a:	00 
      e9c39b:	e8 e6 20 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c3a0:	31 ff                	xor    edi,edi
      e9c3a2:	e8 df 20 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c3a7:	80 bc 24 67 07 00 00 	cmp    BYTE PTR [rsp+0x767],0x0
      e9c3ae:	00 
      e9c3af:	0f 84 a3 00 00 00    	je     e9c458 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6386e>
      e9c3b5:	6a 60                	push   0x60
      e9c3b7:	5f                   	pop    rdi
      e9c3b8:	e8 43 1b 95 00       	call   17edf00 <_Znwm@plt>
      e9c3bd:	48 89 c3             	mov    rbx,rax
      e9c3c0:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c3c4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c3c9:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9c3cc:	4c 8d 70 20          	lea    r14,[rax+0x20]
      e9c3d0:	48 8d 05 91 12 9a 00 	lea    rax,[rip+0x9a1291]        # 183d668 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf600>
      e9c3d7:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c3de:	00 
      e9c3df:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
      e9c3e6:	00 
      e9c3e7:	48 89 84 24 78 07 00 	mov    QWORD PTR [rsp+0x778],rax
      e9c3ee:	00 
      e9c3ef:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c3f6:	00 
      e9c3f7:	4c 89 f7             	mov    rdi,r14
      e9c3fa:	4c 89 ee             	mov    rsi,r13
      e9c3fd:	e8 86 ae 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c402:	4c 89 ef             	mov    rdi,r13
      e9c405:	e8 60 db bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c40a:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c40f:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c414:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c418:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c41e:	31 ff                	xor    edi,edi

### target 0xe99aae, caller 0xe9c43f, FDE=(15310087, 15343400)
      e9c3ee:	00 
      e9c3ef:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c3f6:	00 
      e9c3f7:	4c 89 f7             	mov    rdi,r14
      e9c3fa:	4c 89 ee             	mov    rsi,r13
      e9c3fd:	e8 86 ae 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c402:	4c 89 ef             	mov    rdi,r13
      e9c405:	e8 60 db bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c40a:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c40f:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c414:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c418:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c41e:	31 ff                	xor    edi,edi
      e9c420:	e8 f7 1f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c425:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c42c:	00 
      e9c42d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c433:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c437:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c43e:	00 
      e9c43f:	e8 6a d6 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c444:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
      e9c44b:	00 
      e9c44c:	e8 35 20 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c451:	31 ff                	xor    edi,edi
      e9c453:	e8 2e 20 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c458:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9c45f:	00 
      e9c460:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9c463:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9c468:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9c46c:	48 85 c0             	test   rax,rax
      e9c46f:	74 0a                	je     e9c47b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63891>
      e9c471:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9c476:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9c47b:	6a 60                	push   0x60
      e9c47d:	5f                   	pop    rdi
      e9c47e:	e8 7d 1a 95 00       	call   17edf00 <_Znwm@plt>
      e9c483:	49 89 c6             	mov    r14,rax
      e9c486:	0f 57 c0             	xorps  xmm0,xmm0
      e9c489:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9c48d:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9c490:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c496:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e9c49d:	48 85 db             	test   rbx,rbx
      e9c4a0:	74 15                	je     e9c4b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x638cd>
      e9c4a2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c4a7:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9c4ae:	00 00 
      e9c4b0:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c4b5:	eb 12                	jmp    e9c4c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x638df>
      e9c4b7:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9c4be:	00 00 
      e9c4c0:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c4c7:	00 00 
      e9c4c9:	4d 8d 7e 20          	lea    r15,[r14+0x20]

### target 0xe99aae, caller 0xe9c53c, FDE=(15310087, 15343400)
      e9c4e7:	4c 89 ee             	mov    rsi,r13
      e9c4ea:	e8 99 ad 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c4ef:	4c 89 ef             	mov    rdi,r13
      e9c4f2:	e8 73 da bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c4f7:	48 89 df             	mov    rdi,rbx
      e9c4fa:	e8 87 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c4ff:	66 49 0f 6e c6       	movq   xmm0,r14
      e9c504:	66 49 0f 6e cf       	movq   xmm1,r15
      e9c509:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c50d:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c513:	31 ff                	xor    edi,edi
      e9c515:	e8 02 1f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c51a:	48 89 df             	mov    rdi,rbx
      e9c51d:	e8 64 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c522:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c529:	00 
      e9c52a:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c530:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c534:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c53b:	00 
      e9c53c:	e8 6d d5 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c541:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
      e9c548:	00 
      e9c549:	e8 38 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c54e:	31 ff                	xor    edi,edi
      e9c550:	e8 31 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c555:	48 89 df             	mov    rdi,rbx
      e9c558:	e8 29 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c55d:	80 bc 24 28 07 00 00 	cmp    BYTE PTR [rsp+0x728],0x0
      e9c564:	00 
      e9c565:	0f 84 05 01 00 00    	je     e9c670 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63a86>
      e9c56b:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9c572:	00 
      e9c573:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      e9c576:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e9c57b:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e9c57f:	48 85 c0             	test   rax,rax
      e9c582:	74 0a                	je     e9c58e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x639a4>
      e9c584:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9c589:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e9c58e:	6a 60                	push   0x60
      e9c590:	5f                   	pop    rdi
      e9c591:	e8 6a 19 95 00       	call   17edf00 <_Znwm@plt>
      e9c596:	49 89 c6             	mov    r14,rax
      e9c599:	0f 57 c0             	xorps  xmm0,xmm0
      e9c59c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9c5a0:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9c5a3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c5a9:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
      e9c5b0:	48 85 db             	test   rbx,rbx
      e9c5b3:	74 15                	je     e9c5ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x639e0>
      e9c5b5:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c5ba:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9c5c1:	00 00 
      e9c5c3:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c5c8:	eb 12                	jmp    e9c5dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x639f2>

### target 0xe99aae, caller 0xe9c64f, FDE=(15310087, 15343400)
      e9c5fa:	4c 89 ee             	mov    rsi,r13
      e9c5fd:	e8 86 ac 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c602:	4c 89 ef             	mov    rdi,r13
      e9c605:	e8 60 d9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c60a:	48 89 df             	mov    rdi,rbx
      e9c60d:	e8 74 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c612:	66 49 0f 6e c6       	movq   xmm0,r14
      e9c617:	66 49 0f 6e cf       	movq   xmm1,r15
      e9c61c:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c620:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c626:	31 ff                	xor    edi,edi
      e9c628:	e8 ef 1d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c62d:	48 89 df             	mov    rdi,rbx
      e9c630:	e8 51 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c635:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c63c:	00 
      e9c63d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c643:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c647:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
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

### target 0xe99aae, caller 0xe9c72d, FDE=(15310087, 15343400)
      e9c6dc:	00 
      e9c6dd:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
      e9c6e4:	00 
      e9c6e5:	4c 89 f7             	mov    rdi,r14
      e9c6e8:	4c 89 ee             	mov    rsi,r13
      e9c6eb:	e8 98 ab 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c6f0:	4c 89 ef             	mov    rdi,r13
      e9c6f3:	e8 72 d8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c6f8:	66 48 0f 6e c3       	movq   xmm0,rbx
      e9c6fd:	66 49 0f 6e ce       	movq   xmm1,r14
      e9c702:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c706:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c70c:	31 ff                	xor    edi,edi
      e9c70e:	e8 09 1d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c713:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
      e9c71a:	00 
      e9c71b:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c721:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c725:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c72c:	00 
      e9c72d:	e8 7c d3 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c732:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
      e9c739:	00 
      e9c73a:	e8 47 1d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c73f:	31 ff                	xor    edi,edi
      e9c741:	e8 40 1d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c746:	80 bc 24 61 07 00 00 	cmp    BYTE PTR [rsp+0x761],0x0
      e9c74d:	00 
      e9c74e:	0f 84 c2 00 00 00    	je     e9c816 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63c2c>
      e9c754:	48 8b 84 24 98 12 00 	mov    rax,QWORD PTR [rsp+0x1298]
      e9c75b:	00 
      e9c75c:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e9c760:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e9c766:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
      e9c76a:	48 85 db             	test   rbx,rbx
      e9c76d:	74 05                	je     e9c774 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63b8a>
      e9c76f:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c774:	6a 40                	push   0x40
      e9c776:	5f                   	pop    rdi
      e9c777:	e8 84 17 95 00       	call   17edf00 <_Znwm@plt>
      e9c77c:	48 8d 48 18          	lea    rcx,[rax+0x18]
      e9c780:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c784:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e9c789:	48 8d 15 38 4c 99 00 	lea    rdx,[rip+0x994c38]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e9c790:	48 89 10             	mov    QWORD PTR [rax],rdx
      e9c793:	48 8d 15 16 0f 9a 00 	lea    rdx,[rip+0x9a0f16]        # 183d6b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf648>
      e9c79a:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e9c79e:	48 8b 94 24 38 13 00 	mov    rdx,QWORD PTR [rsp+0x1338]
      e9c7a5:	00 
      e9c7a6:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
      e9c7aa:	48 8b 94 24 d0 00 00 	mov    rdx,QWORD PTR [rsp+0xd0]
      e9c7b1:	00 
      e9c7b2:	48 89 50 28          	mov    QWORD PTR [rax+0x28],rdx
      e9c7b6:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9c7bb:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      e9c7bf:	48 85 db             	test   rbx,rbx

### target 0xe99aae, caller 0xe9c7eb, FDE=(15310087, 15343400)
      e9c79a:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e9c79e:	48 8b 94 24 38 13 00 	mov    rdx,QWORD PTR [rsp+0x1338]
      e9c7a5:	00 
      e9c7a6:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
      e9c7aa:	48 8b 94 24 d0 00 00 	mov    rdx,QWORD PTR [rsp+0xd0]
      e9c7b1:	00 
      e9c7b2:	48 89 50 28          	mov    QWORD PTR [rax+0x28],rdx
      e9c7b6:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9c7bb:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      e9c7bf:	48 85 db             	test   rbx,rbx
      e9c7c2:	74 05                	je     e9c7c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63bdf>
      e9c7c4:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e9c7c9:	66 48 0f 6e c0       	movq   xmm0,rax
      e9c7ce:	66 48 0f 6e c9       	movq   xmm1,rcx
      e9c7d3:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c7d7:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
      e9c7de:	00 
      e9c7df:	66 0f 7f 0e          	movdqa XMMWORD PTR [rsi],xmm1
      e9c7e3:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c7ea:	00 
      e9c7eb:	e8 be d2 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c7f0:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
      e9c7f7:	00 
      e9c7f8:	e8 89 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c7fd:	31 ff                	xor    edi,edi
      e9c7ff:	e8 82 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c804:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c80a:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      e9c811:	e8 70 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c816:	48 8d 35 13 0b 5a ff 	lea    rsi,[rip+0xffffffffff5a0b13]        # 43d330 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2f3c>
      e9c81d:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
      e9c824:	00 
      e9c825:	e8 16 17 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e9c82a:	6a 50                	push   0x50
      e9c82c:	5f                   	pop    rdi
      e9c82d:	e8 ce 16 95 00       	call   17edf00 <_Znwm@plt>
      e9c832:	49 89 c4             	mov    r12,rax
      e9c835:	49 89 c5             	mov    r13,rax
      e9c838:	66 0f ef c0          	pxor   xmm0,xmm0
      e9c83c:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
      e9c843:	48 8d 05 7e 4b 99 00 	lea    rax,[rip+0x994b7e]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e9c84a:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e9c84e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
      e9c855:	00 
      e9c856:	48 8d b4 24 d0 0c 00 	lea    rsi,[rsp+0xcd0]
      e9c85d:	00 
      e9c85e:	6a 01                	push   0x1
      e9c860:	5a                   	pop    rdx
      e9c861:	e8 f2 ab c0 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
      e9c866:	4c 8b bc 24 30 13 00 	mov    r15,QWORD PTR [rsp+0x1330]
      e9c86d:	00 
      e9c86e:	48 8b 9c 24 10 13 00 	mov    rbx,QWORD PTR [rsp+0x1310]
      e9c875:	00 
      e9c876:	48 8d 05 3b 0c 9a 00 	lea    rax,[rip+0x9a0c3b]        # 183d4b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf450>
      e9c87d:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      e9c881:	0f 28 84 24 50 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x550]

### target 0xe99aae, caller 0x10f753f, FDE=(17790036, 17790462)
     10f74e3:	4c 8d 74 24 48       	lea    r14,[rsp+0x48]
     10f74e8:	4c 89 f7             	mov    rdi,r14
     10f74eb:	48 89 c6             	mov    rsi,rax
     10f74ee:	e8 35 df 5c 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     10f74f3:	48 89 e7             	mov    rdi,rsp
     10f74f6:	4c 89 f6             	mov    rsi,r14
     10f74f9:	e8 66 2f c7 ff       	call   d6a464 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x374ea>
     10f74fe:	48 8d b3 18 03 00 00 	lea    rsi,[rbx+0x318]
     10f7505:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
     10f750a:	48 89 19             	mov    QWORD PTR [rcx],rbx
     10f750d:	48 8d 05 50 4f 98 ff 	lea    rax,[rip+0xffffffffff984f50]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     10f7514:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     10f7518:	48 8d 05 a1 22 00 00 	lea    rax,[rip+0x22a1]        # 10f97c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0bd6>
     10f751f:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     10f7523:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10f7528:	48 89 e2             	mov    rdx,rsp
     10f752b:	e8 f2 31 00 00       	call   10fa722 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1b38>
     10f7530:	48 81 c3 f0 08 00 00 	add    rbx,0x8f0
     10f7537:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     10f753c:	48 89 df             	mov    rdi,rbx
     10f753f:	e8 6a 25 da ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
     10f7544:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     10f7549:	e8 38 6f 9a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10f754e:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     10f7553:	e8 9a 0c a7 ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     10f7558:	48 89 e7             	mov    rdi,rsp
     10f755b:	e8 ac be b1 ff       	call   c1340c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1603ac>
     10f7560:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     10f7565:	e8 c4 dd 5c 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10f756a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10f7571:	00 00 
     10f7573:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
     10f757a:	00 
     10f757b:	75 7c                	jne    10f75f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bea0f>
     10f757d:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
     10f7584:	5b                   	pop    rbx
     10f7585:	41 5e                	pop    r14
     10f7587:	c3                   	ret
     10f7588:	48 89 c3             	mov    rbx,rax
     10f758b:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     10f7590:	e8 f1 6e 9a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10f7595:	eb 03                	jmp    10f759a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2be9b0>
     10f7597:	48 89 c3             	mov    rbx,rax
     10f759a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     10f759f:	e8 4e 0c a7 ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     10f75a4:	48 89 e7             	mov    rdi,rsp
     10f75a7:	e8 60 be b1 ff       	call   c1340c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1603ac>
     10f75ac:	eb 03                	jmp    10f75b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2be9c7>
     10f75ae:	48 89 c3             	mov    rbx,rax
     10f75b1:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     10f75b6:	e8 73 dd 5c 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10f75bb:	eb 21                	jmp    10f75de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2be9f4>
     10f75bd:	48 89 c3             	mov    rbx,rax
     10f75c0:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     10f75c5:	e8 1e 40 98 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     10f75ca:	eb 03                	jmp    10f75cf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2be9e5>

### target 0xe99aae, caller 0x10f7a51, FDE=(17791196, 17791740)
     10f79f9:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     10f79fe:	4c 89 ff             	mov    rdi,r15
     10f7a01:	4c 89 f6             	mov    rsi,r14
     10f7a04:	e8 53 17 00 00       	call   10f915c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0572>
     10f7a09:	49 83 c6 18          	add    r14,0x18
     10f7a0d:	4d 39 e6             	cmp    r14,r12
     10f7a10:	75 ec                	jne    10f79fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bee14>
     10f7a12:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
     10f7a17:	48 89 19             	mov    QWORD PTR [rcx],rbx
     10f7a1a:	48 8d 05 43 4a 98 ff 	lea    rax,[rip+0xffffffffff984a43]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     10f7a21:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     10f7a25:	48 8d 05 04 18 00 00 	lea    rax,[rip+0x1804]        # 10f9230 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0646>
     10f7a2c:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     10f7a30:	48 8d b3 18 03 00 00 	lea    rsi,[rbx+0x318]
     10f7a37:	48 89 e7             	mov    rdi,rsp
     10f7a3a:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     10f7a3f:	e8 de 2c 00 00       	call   10fa722 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c1b38>
     10f7a44:	48 81 c3 f0 08 00 00 	add    rbx,0x8f0
     10f7a4b:	48 89 e6             	mov    rsi,rsp
     10f7a4e:	48 89 df             	mov    rdi,rbx
     10f7a51:	e8 58 20 da ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
     10f7a56:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     10f7a5b:	e8 26 6a 9a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10f7a60:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10f7a65:	e8 88 07 a7 ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     10f7a6a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     10f7a6f:	e8 98 b9 b1 ff       	call   c1340c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1603ac>
     10f7a74:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     10f7a79:	e8 6a 3b 98 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     10f7a7e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10f7a85:	00 00 
     10f7a87:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     10f7a8e:	00 
     10f7a8f:	75 66                	jne    10f7af7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bef0d>
     10f7a91:	48 81 c4 88 00 00 00 	add    rsp,0x88
     10f7a98:	5b                   	pop    rbx
     10f7a99:	41 5c                	pop    r12
     10f7a9b:	41 5e                	pop    r14
     10f7a9d:	41 5f                	pop    r15
     10f7a9f:	c3                   	ret
     10f7aa0:	48 89 c3             	mov    rbx,rax
     10f7aa3:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     10f7aa8:	e8 d9 69 9a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10f7aad:	eb 03                	jmp    10f7ab2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2beec8>
     10f7aaf:	48 89 c3             	mov    rbx,rax
     10f7ab2:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10f7ab7:	e8 36 07 a7 ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     10f7abc:	eb 0a                	jmp    10f7ac8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2beede>
     10f7abe:	eb 05                	jmp    10f7ac5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2beedb>
     10f7ac0:	48 89 c3             	mov    rbx,rax
     10f7ac3:	eb 0d                	jmp    10f7ad2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2beee8>
     10f7ac5:	48 89 c3             	mov    rbx,rax
     10f7ac8:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     10f7acd:	e8 3a b9 b1 ff       	call   c1340c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1603ac>
     10f7ad2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     10f7ad7:	e8 0c 3b 98 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>

- target 0xe99aae: 17 direct refs
- target 0xe9ccb0: 0 direct refs

## All code materializations of AP 0x18365e0
### 0xe9cce4; FDE=(15310087, 15343400): lea    rax,[rip+0x9998f5]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
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
      e9cd6c:	48 8d b4 24 30 08 00 	lea    rsi,[rsp+0x830]
      e9cd73:	00 

### 0xef90ca; FDE=(15700170, 15700189): lea    rax,[rip+0x93d50f]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef908d:	e8 d8 0e b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef9092:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
      ef9099:	e8 cc 0e b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef909e:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
      ef90a5:	e8 c0 0e b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef90aa:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
      ef90ae:	e8 b7 0e b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef90b3:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      ef90b7:	e8 ca 53 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef90bc:	48 83 c3 10          	add    rbx,0x10
      ef90c0:	48 89 df             	mov    rdi,rbx
      ef90c3:	5b                   	pop    rbx
      ef90c4:	e9 a1 0e b8 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
      ef90c9:	cc                   	int3
      ef90ca:	48 8d 05 0f d5 93 00 	lea    rax,[rip+0x93d50f]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef90d1:	48 89 07             	mov    QWORD PTR [rdi],rax
      ef90d4:	48 83 c7 10          	add    rdi,0x10
      ef90d8:	e9 91 fe ff ff       	jmp    ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      ef90dd:	cc                   	int3
      ef90de:	53                   	push   rbx
      ef90df:	48 89 fb             	mov    rbx,rdi
      ef90e2:	e8 e3 ff ff ff       	call   ef90ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc04e0>
      ef90e7:	48 89 df             	mov    rdi,rbx
      ef90ea:	5b                   	pop    rbx
      ef90eb:	e9 30 4e 8f 00       	jmp    17edf20 <_ZdlPv@plt>
      ef90f0:	41 56                	push   r14
      ef90f2:	53                   	push   rbx
      ef90f3:	48 83 ec 28          	sub    rsp,0x28
      ef90f7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef90fe:	00 00 
      ef9100:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ef9105:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      ef9109:	bf d0 03 00 00       	mov    edi,0x3d0
      ef910e:	e8 ed 4d 8f 00       	call   17edf00 <_Znwm@plt>
      ef9113:	48 89 c3             	mov    rbx,rax
      ef9116:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef911a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      ef911f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ef9124:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      ef912b:	00 00 
      ef912d:	48 8d 05 ac d4 93 00 	lea    rax,[rip+0x93d4ac]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef9134:	48 89 03             	mov    QWORD PTR [rbx],rax
      ef9137:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      ef913b:	4c 89 f6             	mov    rsi,r14
      ef913e:	e8 2d 8a 00 00       	call   f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>
      ef9143:	48 89 e7             	mov    rdi,rsp
      ef9146:	48 83 27 00          	and    QWORD PTR [rdi],0x0

### 0xef912d; FDE=(15700208, 15700370): lea    rax,[rip+0x93d4ac]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef90f2:	53                   	push   rbx
      ef90f3:	48 83 ec 28          	sub    rsp,0x28
      ef90f7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef90fe:	00 00 
      ef9100:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ef9105:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      ef9109:	bf d0 03 00 00       	mov    edi,0x3d0
      ef910e:	e8 ed 4d 8f 00       	call   17edf00 <_Znwm@plt>
      ef9113:	48 89 c3             	mov    rbx,rax
      ef9116:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef911a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      ef911f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ef9124:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      ef912b:	00 00 
      ef912d:	48 8d 05 ac d4 93 00 	lea    rax,[rip+0x93d4ac]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef9134:	48 89 03             	mov    QWORD PTR [rbx],rax
      ef9137:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      ef913b:	4c 89 f6             	mov    rsi,r14
      ef913e:	e8 2d 8a 00 00       	call   f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>
      ef9143:	48 89 e7             	mov    rdi,rsp
      ef9146:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ef914a:	e8 7b 11 b8 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ef914f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef9156:	00 00 
      ef9158:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef915d:	75 2e                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
      ef915f:	48 89 d8             	mov    rax,rbx
      ef9162:	48 83 c4 28          	add    rsp,0x28
      ef9166:	5b                   	pop    rbx
      ef9167:	41 5e                	pop    r14
      ef9169:	c3                   	ret
      ef916a:	48 89 c3             	mov    rbx,rax
      ef916d:	48 89 e7             	mov    rdi,rsp
      ef9170:	e8 55 11 b8 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ef9175:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef917c:	00 00 
      ef917e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef9183:	75 08                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
      ef9185:	48 89 df             	mov    rdi,rbx
      ef9188:	e8 43 6b b7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ef918d:	e8 1e 69 8f 00       	call   17efab0 <__stack_chk_fail@plt>
      ef9192:	48 8d 47 10          	lea    rax,[rdi+0x10]
      ef9196:	48 8d 0d 43 d4 93 00 	lea    rcx,[rip+0x93d443]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef919d:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ef91a0:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      ef91a4:	48 89 c6             	mov    rsi,rax
      ef91a7:	e9 c4 89 00 00       	jmp    f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>

### 0xef9196; FDE=(15700370, 15700396): lea    rcx,[rip+0x93d443]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef9166:	5b                   	pop    rbx
      ef9167:	41 5e                	pop    r14
      ef9169:	c3                   	ret
      ef916a:	48 89 c3             	mov    rbx,rax
      ef916d:	48 89 e7             	mov    rdi,rsp
      ef9170:	e8 55 11 b8 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ef9175:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef917c:	00 00 
      ef917e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef9183:	75 08                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
      ef9185:	48 89 df             	mov    rdi,rbx
      ef9188:	e8 43 6b b7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ef918d:	e8 1e 69 8f 00       	call   17efab0 <__stack_chk_fail@plt>
      ef9192:	48 8d 47 10          	lea    rax,[rdi+0x10]
      ef9196:	48 8d 0d 43 d4 93 00 	lea    rcx,[rip+0x93d443]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef919d:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      ef91a0:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      ef91a4:	48 89 c6             	mov    rsi,rax
      ef91a7:	e9 c4 89 00 00       	jmp    f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>
      ef91ac:	48 83 c7 10          	add    rdi,0x10
      ef91b0:	e9 b9 fd ff ff       	jmp    ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      ef91b5:	cc                   	int3
      ef91b6:	53                   	push   rbx
      ef91b7:	48 89 fb             	mov    rbx,rdi
      ef91ba:	48 83 c7 10          	add    rdi,0x10
      ef91be:	e8 ab fd ff ff       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      ef91c3:	48 89 df             	mov    rdi,rbx
      ef91c6:	5b                   	pop    rbx
      ef91c7:	e9 54 4d 8f 00       	jmp    17edf20 <_ZdlPv@plt>
      ef91cc:	55                   	push   rbp
      ef91cd:	41 57                	push   r15
      ef91cf:	41 56                	push   r14
      ef91d1:	41 55                	push   r13
      ef91d3:	41 54                	push   r12
      ef91d5:	53                   	push   rbx
      ef91d6:	48 81 ec f8 0a 00 00 	sub    rsp,0xaf8
      ef91dd:	49 89 fc             	mov    r12,rdi
      ef91e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef91e7:	00 00 
      ef91e9:	48 89 84 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],rax
      ef91f0:	00 
      ef91f1:	0f 57 c0             	xorps  xmm0,xmm0
      ef91f4:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ef91f7:	48 8d 47 18          	lea    rax,[rdi+0x18]
      ef91fb:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
      ef91ff:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ef9203:	48 8d 47 30          	lea    rax,[rdi+0x30]

## +0x30 virtual calls near direct callers of owner-producing FDE
### caller FDE 0xe92f2c..0xe98f3b
#### vcall +0x30 @0xe9397f
      e93913:	e8 6e ab c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e93918:	66 49 0f 6e c6       	movq   xmm0,r14
      e9391d:	66 49 0f 6e cf       	movq   xmm1,r15
      e93922:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e93926:	66 0f 7f 8c 24 00 01 	movdqa XMMWORD PTR [rsp+0x100],xmm1
      e9392d:	00 00 
      e9392f:	31 ff                	xor    edi,edi
      e93931:	e8 50 ab c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
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

#### vcall +0x30 @0xe948a9
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

#### vcall +0x30 @0xe957d6
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

#### vcall +0x30 @0xe97362
      e972fc:	00 
      e972fd:	48 8d b4 24 50 10 00 	lea    rsi,[rsp+0x1050]
      e97304:	00 
      e97305:	4c 8d 8c 24 80 03 00 	lea    r9,[rsp+0x380]
      e9730c:	00 
      e9730d:	4c 8b 84 24 b8 01 00 	mov    r8,QWORD PTR [rsp+0x1b8]
      e97314:	00 
      e97315:	48 8d 84 24 20 06 00 	lea    rax,[rsp+0x620]
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

