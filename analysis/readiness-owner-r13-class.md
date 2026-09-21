# Readiness e92f owner r13 class

Known: e92f2c saves incoming rsi in r13; e94787 later reads [r13+0x3b8] and calls provider virtual +0x10.

## Direct calls/jumps to e92f2c
### 0xe91e06: call   e92f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a342>
      e91d53:	48 8d 0d 76 a1 01 00 	lea    rcx,[rip+0x1a176]        # eabed0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x732e6>
      e91d5a:	4c 8d 84 24 60 08 00 	lea    r8,[rsp+0x860]
      e91d61:	00 
      e91d62:	6a 18                	push   0x18
      e91d64:	41 59                	pop    r9
      e91d66:	e8 29 8a 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e91d6b:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e91d6e:	48 89 ef             	mov    rdi,rbp
      e91d71:	4c 89 f6             	mov    rsi,r14
      e91d74:	48 89 da             	mov    rdx,rbx
      e91d77:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e91d7a:	4c 89 ff             	mov    rdi,r15
      e91d7d:	48 89 ee             	mov    rsi,rbp
      e91d80:	e8 49 77 00 00       	call   e994ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608e4>
      e91d85:	48 8b bc 24 38 08 00 	mov    rdi,QWORD PTR [rsp+0x838]
      e91d8c:	00 
      e91d8d:	e8 f4 c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91d92:	48 89 df             	mov    rdi,rbx
      e91d95:	e8 4e 8a 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e91d9a:	49 83 c5 10          	add    r13,0x10
      e91d9e:	4d 39 e5             	cmp    r13,r12
      e91da1:	0f 85 77 ff ff ff    	jne    e91d1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59134>
      e91da7:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
      e91dae:	00 
      e91daf:	e8 6e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e91db4:	31 ff                	xor    edi,edi
      e91db6:	e8 61 c6 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e91dbb:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
      e91dc2:	00 
      e91dc3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e91dc8:	48 89 03             	mov    QWORD PTR [rbx],rax
      e91dcb:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      e91dd0:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      e91dd4:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]
      e91ddb:	00 
      e91ddc:	4c 89 f7             	mov    rdi,r14
      e91ddf:	e8 3e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e91de4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e91de9:	e8 98 c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91dee:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e91df5:	00 
      e91df6:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
      e91dfd:	00 
      e91dfe:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
      e91e03:	48 89 d9             	mov    rcx,rbx
      e91e06:	e8 21 11 00 00       	call   e92f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a342>
      e91e0b:	0f 28 84 24 b0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8b0]
      e91e12:	00 
      e91e13:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e91e18:	4c 89 ff             	mov    rdi,r15
      e91e1b:	e8 16 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e20:	49 8d 7f 10          	lea    rdi,[r15+0x10]
      e91e24:	0f 28 84 24 a0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8a0]
      e91e2b:	00 
      e91e2c:	e8 05 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e31:	0f 28 84 24 c0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8c0]
      e91e38:	00 
      e91e39:	48 8b 84 24 c8 08 00 	mov    rax,QWORD PTR [rsp+0x8c8]
      e91e40:	00 
      e91e41:	48 85 c0             	test   rax,rax
      e91e44:	74 05                	je     e91e4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59261>
      e91e46:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91e4b:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      e91e4f:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      e91e54:	e8 2d c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91e59:	48 8d 9c 24 e0 08 00 	lea    rbx,[rsp+0x8e0]
      e91e60:	00 
      e91e61:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      e91e65:	48 89 de             	mov    rsi,rbx
      e91e68:	e8 cf 70 00 00       	call   e98f3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60352>
      e91e6d:	4d 8d a7 90 00 00 00 	lea    r12,[r15+0x90]
      e91e74:	0f 28 43 50          	movaps xmm0,XMMWORD PTR [rbx+0x50]
      e91e78:	4c 89 e7             	mov    rdi,r12
      e91e7b:	e8 b6 cc c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e80:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
      e91e87:	0f 28 43 60          	movaps xmm0,XMMWORD PTR [rbx+0x60]
      e91e8b:	e8 a6 cc c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e90:	0f 28 43 70          	movaps xmm0,XMMWORD PTR [rbx+0x70]
      e91e94:	48 8b 43 78          	mov    rax,QWORD PTR [rbx+0x78]
      e91e98:	48 85 c0             	test   rax,rax
      e91e9b:	74 05                	je     e91ea2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x592b8>
      e91e9d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91ea2:	49 8b bf b8 00 00 00 	mov    rdi,QWORD PTR [r15+0xb8]
      e91ea9:	41 0f 11 87 b0 00 00 	movups XMMWORD PTR [r15+0xb0],xmm0
      e91eb0:	00 
      e91eb1:	e8 d0 c5 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91eb6:	0f 28 84 24 e0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xe0]
      e91ebd:	00 
      e91ebe:	48 8b 84 24 e8 00 00 	mov    rax,QWORD PTR [rsp+0xe8]
      e91ec5:	00 
      e91ec6:	48 85 c0             	test   rax,rax
      e91ec9:	74 05                	je     e91ed0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x592e6>
      e91ecb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91ed0:	49 8d 9f f8 00 00 00 	lea    rbx,[r15+0xf8]
      e91ed7:	49 8b bf c8 00 00 00 	mov    rdi,QWORD PTR [r15+0xc8]
      e91ede:	41 0f 11 87 c0 00 00 	movups XMMWORD PTR [r15+0xc0],xmm0
      e91ee5:	00 
      e91ee6:	e8 9b c5 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91eeb:	48 8b 84 24 f8 05 00 	mov    rax,QWORD PTR [rsp+0x5f8]
      e91ef2:	00 
      e91ef3:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
      e91ef7:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      e91efb:	48 85 c0             	test   rax,rax
      e91efe:	74 05                	je     e91f05 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5931b>
      e91f00:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91f05:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]

## Near-call RSI reaching definitions
### call 0xe91e06
      e91df6:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
      e91dae:	00 
      e91daf:	e8 6e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e91db4:	31 ff                	xor    edi,edi
      e91db6:	e8 61 c6 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e91dbb:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
      e91dc2:	00 
      e91dc3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e91dc8:	48 89 03             	mov    QWORD PTR [rbx],rax
      e91dcb:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      e91dd0:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      e91dd4:	4c 8d b4 24 60 09 00 	lea    r14,[rsp+0x960]
      e91ddb:	00 
      e91ddc:	4c 89 f7             	mov    rdi,r14
      e91ddf:	e8 3e bd c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e91de4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e91de9:	e8 98 c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91dee:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
      e91df5:	00 
      e91df6:	48 8d b4 24 60 02 00 	lea    rsi,[rsp+0x260]
      e91dfd:	00 
      e91dfe:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
      e91e03:	48 89 d9             	mov    rcx,rbx
      e91e06:	e8 21 11 00 00       	call   e92f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a342>
      e91e0b:	0f 28 84 24 b0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8b0]
      e91e12:	00 
      e91e13:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e91e18:	4c 89 ff             	mov    rdi,r15
      e91e1b:	e8 16 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e20:	49 8d 7f 10          	lea    rdi,[r15+0x10]
      e91e24:	0f 28 84 24 a0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8a0]
      e91e2b:	00 
      e91e2c:	e8 05 cd c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e91e31:	0f 28 84 24 c0 08 00 	movaps xmm0,XMMWORD PTR [rsp+0x8c0]
      e91e38:	00 
      e91e39:	48 8b 84 24 c8 08 00 	mov    rax,QWORD PTR [rsp+0x8c8]
      e91e40:	00 
      e91e41:	48 85 c0             	test   rax,rax
      e91e44:	74 05                	je     e91e4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59261>
      e91e46:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e91e4b:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
      e91e4f:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      e91e54:	e8 2d c6 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e91e59:	48 8d 9c 24 e0 08 00 	lea    rbx,[rsp+0x8e0]

## All materializations/stores of known constructor-zero family around 0x109917a
     109926b:	48 8d 15 be 23 7b 00 	lea    rdx,[rip+0x7b23be]        # 184b630 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7d18>
     1099285:	48 8d 15 ec 23 7b 00 	lea    rdx,[rip+0x7b23ec]        # 184b678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7d60>
     10992a8:	48 8d 0d 11 24 7b 00 	lea    rcx,[rip+0x7b2411]        # 184b6c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7da8>
     109935d:	48 8d 05 fc 2f 7b 00 	lea    rax,[rip+0x7b2ffc]        # 184c360 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8a48>
     1099364:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     1099416:	48 8d 05 bb 2f 7b 00 	lea    rax,[rip+0x7b2fbb]        # 184c3d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8ac0>
     1099430:	48 8d 05 e9 2f 7b 00 	lea    rax,[rip+0x7b2fe9]        # 184c420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b08>
     109944a:	4c 89 75 00          	mov    QWORD PTR [rbp+0x0],r14
     1099608:	48 8d 05 59 2e 7b 00 	lea    rax,[rip+0x7b2e59]        # 184c468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b50>
     10996ff:	48 8d 05 aa 2d 7b 00 	lea    rax,[rip+0x7b2daa]        # 184c4b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b98>
     109976e:	48 8d 05 3b 0d 7f 00 	lea    rax,[rip+0x7f0d3b]        # 188a4b0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3188>
     109982b:	4c 89 6d 00          	mov    QWORD PTR [rbp+0x0],r13
     109995b:	48 8d 0d e6 1d 7b 00 	lea    rcx,[rip+0x7b1de6]        # 184b748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7e30>
     1099970:	48 8d 15 f9 2c 7b 00 	lea    rdx,[rip+0x7b2cf9]        # 184c670 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d58>

## Candidate same-owner nonzero +0x3b8 writers
### 0xacdf98 score=1: mov    QWORD PTR [rsp+0x3b8],r14
      acdf23:	48 8d b4 24 30 07 00 	lea    rsi,[rsp+0x730]
      acdf2a:	00 
      acdf2b:	48 89 06             	mov    QWORD PTR [rsi],rax
      acdf2e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      acdf32:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      acdf37:	48 8d 9c 24 b0 03 00 	lea    rbx,[rsp+0x3b0]
      acdf3e:	00 
      acdf3f:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
      acdf43:	48 8d 05 b2 7c 06 00 	lea    rax,[rip+0x67cb2]        # b35bfc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82b9c>
      acdf4a:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      acdf4e:	48 8d 05 d3 7c 06 00 	lea    rax,[rip+0x67cd3]        # b35c28 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82bc8>
      acdf55:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      acdf59:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      acdf60:	00 
      acdf61:	48 89 da             	mov    rdx,rbx
      acdf64:	31 c9                	xor    ecx,ecx
      acdf66:	45 31 c0             	xor    r8d,r8d
      acdf69:	e8 5e 38 cf 00       	call   17c17cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175938>
      acdf6e:	48 89 df             	mov    rdi,rbx
      acdf71:	e8 28 93 fd ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      acdf76:	31 ff                	xor    edi,edi
      acdf78:	e8 b9 2d 00 00       	call   ad0d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1dcd6>
      acdf7d:	31 ff                	xor    edi,edi
      acdf7f:	e8 02 05 fd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      acdf84:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      acdf89:	48 8d 0d 38 c2 d3 00 	lea    rcx,[rip+0xd3c238]        # 180a1c8 <_ZTIN4asio22service_already_existsE@@Base+0xb9b0>
      acdf90:	48 89 8c 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rcx
      acdf97:	00 
      acdf98:	4c 89 b4 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r14
      acdf9f:	00 
      acdfa0:	48 89 ac 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],rbp
      acdfa7:	00 
      acdfa8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      acdfab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      acdfae:	48 89 ee             	mov    rsi,rbp
      acdfb1:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      acdfb7:	48 89 ef             	mov    rdi,rbp
      acdfba:	e8 ab bf fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      acdfbf:	4c 89 e7             	mov    rdi,r12
      acdfc2:	e8 61 68 fe ff       	call   ab4828 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17c8>
      acdfc7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      acdfcc:	4c 89 60 28          	mov    QWORD PTR [rax+0x28],r12
      acdfd0:	49 89 c4             	mov    r12,rax
      acdfd3:	48 8d bc 24 70 03 00 	lea    rdi,[rsp+0x370]
      acdfda:	00 
      acdfdb:	e8 04 7c 06 00       	call   b35be4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82b84>
      acdfe0:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
      acdfe7:	00 
      acdfe8:	e8 99 04 fd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      acdfed:	48 8d 05 3c bc d3 00 	lea    rax,[rip+0xd3bc3c]        # 1809c30 <_ZTIN4asio22service_already_existsE@@Base+0xb418>
      acdff4:	49 89 44 24 30       	mov    QWORD PTR [r12+0x30],rax
      acdff9:	6a 58                	push   0x58
      acdffb:	5f                   	pop    rdi
      acdffc:	e8 ff fe d1 00       	call   17edf00 <_Znwm@plt>
      ace001:	48 89 c3             	mov    rbx,rax
      ace004:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
      ace00b:	00 
      ace00c:	e8 be 30 fe ff       	call   ab10cf <JNI_OnUnload@@Base+0x3899c>
      ace011:	48 8d 05 d0 31 da 00 	lea    rax,[rip+0xda31d0]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
      ace018:	48 8b b4 24 b0 03 00 	mov    rsi,QWORD PTR [rsp+0x3b0]
      ace01f:	00 
      ace020:	48 89 33             	mov    QWORD PTR [rbx],rsi
      ace023:	4c 8d 73 08          	lea    r14,[rbx+0x8]
      ace027:	c6 43 10 00          	mov    BYTE PTR [rbx+0x10],0x0
      ace02b:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      ace02f:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      ace034:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      ace038:	48 8d 05 25 e4 fa ff 	lea    rax,[rip+0xfffffffffffae425]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      ace03f:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      ace043:	48 8d 05 8a 5c 06 00 	lea    rax,[rip+0x65c8a]        # b33cd4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80c74>
      ace04a:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      ace04e:	66 0f ef c0          	pxor   xmm0,xmm0
      ace052:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0
      ace057:	4c 89 f7             	mov    rdi,r14
      ace05a:	e8 e5 0b 00 00       	call   acec44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbe4>
      ace05f:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
      ace062:	48 8d bc 24 30 07 00 	lea    rdi,[rsp+0x730]

### 0xb7e60e score=2: mov    QWORD PTR [r12+0x3b8],rax
      b7e59d:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]
      b7e5a4:	00 
      b7e5a5:	8b 45 00             	mov    eax,DWORD PTR [rbp+0x0]
      b7e5a8:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax
      b7e5af:	b8 00 00 00 00       	mov    eax,0x0
      b7e5b4:	4d 85 ed             	test   r13,r13
      b7e5b7:	74 1d                	je     b7e5d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb576>
      b7e5b9:	8b 45 04             	mov    eax,DWORD PTR [rbp+0x4]
      b7e5bc:	48 2b 44 24 10       	sub    rax,QWORD PTR [rsp+0x10]
      b7e5c1:	b9 00 00 00 00       	mov    ecx,0x0
      b7e5c6:	48 0f 42 c1          	cmovb  rax,rcx
      b7e5ca:	48 69 c0 40 1f 00 00 	imul   rax,rax,0x1f40
      b7e5d1:	31 d2                	xor    edx,edx
      b7e5d3:	49 f7 f6             	div    r14
      b7e5d6:	89 84 24 b4 00 00 00 	mov    DWORD PTR [rsp+0xb4],eax
      b7e5dd:	48 89 df             	mov    rdi,rbx
      b7e5e0:	4c 89 fe             	mov    rsi,r15
      b7e5e3:	e8 c4 f8 ff ff       	call   b7deac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcae4c>
      b7e5e8:	48 83 c5 08          	add    rbp,0x8
      b7e5ec:	4c 39 e5             	cmp    rbp,r12
      b7e5ef:	75 b4                	jne    b7e5a5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb545>
      b7e5f1:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
      b7e5f6:	4d 8d ac 24 b0 03 00 	lea    r13,[r12+0x3b0]
      b7e5fd:	00 
      b7e5fe:	49 8b 84 24 b0 03 00 	mov    rax,QWORD PTR [r12+0x3b0]
      b7e605:	00 
      b7e606:	4d 8b b4 24 08 04 00 	mov    r14,QWORD PTR [r12+0x408]
      b7e60d:	00 
      b7e60e:	49 89 84 24 b8 03 00 	mov    QWORD PTR [r12+0x3b8],rax
      b7e615:	00 
      b7e616:	4d 8b bc 24 10 04 00 	mov    r15,QWORD PTR [r12+0x410]
      b7e61d:	00 
      b7e61e:	4d 39 fe             	cmp    r14,r15
      b7e621:	74 52                	je     b7e675 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb615>
      b7e623:	48 8d 9c 24 b0 00 00 	lea    rbx,[rsp+0xb0]
      b7e62a:	00 
      b7e62b:	49 8b bc 24 70 03 00 	mov    rdi,QWORD PTR [r12+0x370]
      b7e632:	00 
      b7e633:	49 8b b4 24 78 03 00 	mov    rsi,QWORD PTR [r12+0x378]
      b7e63a:	00 
      b7e63b:	41 8b 16             	mov    edx,DWORD PTR [r14]
      b7e63e:	e8 4f 1d 00 00       	call   b80392 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd332>
      b7e643:	48 85 c0             	test   rax,rax
      b7e646:	74 24                	je     b7e66c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb60c>
      b7e648:	8b 40 14             	mov    eax,DWORD PTR [rax+0x14]
      b7e64b:	85 c0                	test   eax,eax
      b7e64d:	78 1d                	js     b7e66c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb60c>
      b7e64f:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax
      b7e656:	41 8b 46 04          	mov    eax,DWORD PTR [r14+0x4]
      b7e65a:	89 84 24 b4 00 00 00 	mov    DWORD PTR [rsp+0xb4],eax
      b7e661:	4c 89 ef             	mov    rdi,r13
      b7e664:	48 89 de             	mov    rsi,rbx
      b7e667:	e8 ac 1d 00 00       	call   b80418 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcd3b8>
      b7e66c:	49 83 c6 08          	add    r14,0x8
      b7e670:	4d 39 fe             	cmp    r14,r15
      b7e673:	75 b6                	jne    b7e62b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb5cb>
      b7e675:	41 c6 84 24 c8 03 00 	mov    BYTE PTR [r12+0x3c8],0x1
      b7e67c:	00 01 
      b7e67e:	4c 89 e7             	mov    rdi,r12
      b7e681:	e8 5e 18 00 00       	call   b7fee4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcce84>
      b7e686:	4d 8b 84 24 b8 03 00 	mov    r8,QWORD PTR [r12+0x3b8]
      b7e68d:	00 
      b7e68e:	4d 2b 84 24 b0 03 00 	sub    r8,QWORD PTR [r12+0x3b0]
      b7e695:	00 
      b7e696:	49 c1 f8 03          	sar    r8,0x3
      b7e69a:	48 8d 35 db 38 8d ff 	lea    rsi,[rip+0xffffffffff8d38db]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      b7e6a1:	48 8d 0d 40 f5 7a ff 	lea    rcx,[rip+0xffffffffff7af540]        # 32dbe8 <_ZTSSt12bad_any_cast@@Base-0x625e0>
      b7e6a8:	6a 04                	push   0x4
      b7e6aa:	5f                   	pop    rdi
      b7e6ab:	ba b7 01 00 00       	mov    edx,0x1b7
      b7e6b0:	31 c0                	xor    eax,eax
      b7e6b2:	e8 1b 82 c5 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      b7e6b7:	49 8b 84 24 98 03 00 	mov    rax,QWORD PTR [r12+0x398]
      b7e6be:	00 
      b7e6bf:	4d 8b bc 24 a0 03 00 	mov    r15,QWORD PTR [r12+0x3a0]
      b7e6c6:	00 
      b7e6c7:	4c 39 f8             	cmp    rax,r15

### 0xb8c70d score=3: mov    QWORD PTR [rsp+0x3b8],r13
      b8c6a6:	00 
      b8c6a7:	40 84 ed             	test   bpl,bpl
      b8c6aa:	75 05                	jne    b8c6b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9651>
      b8c6ac:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c6b1:	4c 89 bc 24 20 04 00 	mov    QWORD PTR [rsp+0x420],r15
      b8c6b8:	00 
      b8c6b9:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      b8c6bc:	0f 11 84 24 28 04 00 	movups XMMWORD PTR [rsp+0x428],xmm0
      b8c6c3:	00 
      b8c6c4:	4c 89 ac 24 38 04 00 	mov    QWORD PTR [rsp+0x438],r13
      b8c6cb:	00 
      b8c6cc:	4c 89 b4 24 40 04 00 	mov    QWORD PTR [rsp+0x440],r14
      b8c6d3:	00 
      b8c6d4:	4d 85 f6             	test   r14,r14
      b8c6d7:	74 05                	je     b8c6de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd967e>
      b8c6d9:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c6de:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
      b8c6e3:	48 89 8c 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rcx
      b8c6ea:	00 
      b8c6eb:	4c 89 ac 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],r13
      b8c6f2:	00 
      b8c6f3:	4c 89 b4 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],r14
      b8c6fa:	00 
      b8c6fb:	4d 85 f6             	test   r14,r14
      b8c6fe:	74 05                	je     b8c705 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd96a5>
      b8c700:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c705:	4c 89 bc 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],r15
      b8c70c:	00 
      b8c70d:	4c 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r13
      b8c714:	00 
      b8c715:	4c 89 b4 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],r14
      b8c71c:	00 
      b8c71d:	40 84 ed             	test   bpl,bpl
      b8c720:	75 05                	jne    b8c727 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd96c7>
      b8c722:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c727:	4c 89 bc 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r15
      b8c72e:	00 
      b8c72f:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      b8c732:	0f 11 84 24 d0 03 00 	movups XMMWORD PTR [rsp+0x3d0],xmm0
      b8c739:	00 
      b8c73a:	4c 89 ac 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],r13
      b8c741:	00 
      b8c742:	4c 89 b4 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],r14
      b8c749:	00 
      b8c74a:	4d 85 f6             	test   r14,r14
      b8c74d:	74 05                	je     b8c754 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd96f4>
      b8c74f:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c754:	48 83 a4 24 48 03 00 	and    QWORD PTR [rsp+0x348],0x0
      b8c75b:	00 00 
      b8c75d:	48 83 a4 24 58 03 00 	and    QWORD PTR [rsp+0x358],0x0
      b8c764:	00 00 
      b8c766:	6a 58                	push   0x58
      b8c768:	5f                   	pop    rdi
      b8c769:	e8 92 17 c6 00       	call   17edf00 <_Znwm@plt>
      b8c76e:	49 89 c7             	mov    r15,rax
      b8c771:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
      b8c778:	00 
      b8c779:	48 89 c7             	mov    rdi,rax
      b8c77c:	e8 79 41 8e 00       	call   14708fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b5e7e>
      b8c781:	4d 89 6f 48          	mov    QWORD PTR [r15+0x48],r13
      b8c785:	4d 89 77 50          	mov    QWORD PTR [r15+0x50],r14
      b8c789:	40 84 ed             	test   bpl,bpl
      b8c78c:	75 05                	jne    b8c793 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9733>
      b8c78e:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c793:	48 8d b4 24 48 03 00 	lea    rsi,[rsp+0x348]
      b8c79a:	00 
      b8c79b:	4c 89 3e             	mov    QWORD PTR [rsi],r15
      b8c79e:	48 8d 05 a9 41 8e 00 	lea    rax,[rip+0x8e41a9]        # 147094e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b5ed2>
      b8c7a5:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
      b8c7a9:	48 8d 05 c8 41 8e 00 	lea    rax,[rip+0x8e41c8]        # 1470978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b5efc>
      b8c7b0:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
      b8c7b4:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
      b8c7bb:	00 
      b8c7bc:	e8 f7 27 b4 00       	call   16cefb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83124>
      b8c7c1:	48 8d 35 26 76 7d ff 	lea    rsi,[rip+0xffffffffff7d7626]        # 363dee <_ZTSSt12bad_any_cast@@Base-0x2c3da>
      b8c7c8:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
      b8c7cf:	00 

### 0xbda8ee score=2: mov    BYTE PTR [r13+0x3b8],0x1
      bda873:	48 89 df             	mov    rdi,rbx
      bda876:	e8 95 41 01 00       	call   beea10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13b9b0>
      bda87b:	49 8d ad 60 03 00 00 	lea    rbp,[r13+0x360]
      bda882:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      bda886:	48 8d 94 24 30 02 00 	lea    rdx,[rsp+0x230]
      bda88d:	00 
      bda88e:	48 89 ef             	mov    rdi,rbp
      bda891:	4c 89 fe             	mov    rsi,r15
      bda894:	e8 57 51 01 00       	call   bef9f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13c990>
      bda899:	49 8d 9d 78 03 00 00 	lea    rbx,[r13+0x378]
      bda8a0:	48 8d 94 24 30 02 00 	lea    rdx,[rsp+0x230]
      bda8a7:	00 
      bda8a8:	48 83 22 00          	and    QWORD PTR [rdx],0x0
      bda8ac:	48 89 df             	mov    rdi,rbx
      bda8af:	4c 89 fe             	mov    rsi,r15
      bda8b2:	e8 39 51 01 00       	call   bef9f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13c990>
      bda8b7:	49 8d bd 90 03 00 00 	lea    rdi,[r13+0x390]
      bda8be:	48 8d 94 24 30 02 00 	lea    rdx,[rsp+0x230]
      bda8c5:	00 
      bda8c6:	48 83 22 00          	and    QWORD PTR [rdx],0x0
      bda8ca:	4c 89 fe             	mov    rsi,r15
      bda8cd:	e8 1e 51 01 00       	call   bef9f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13c990>
      bda8d2:	49 8d 85 a8 03 00 00 	lea    rax,[r13+0x3a8]
      bda8d9:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      bda8e0:	00 
      bda8e1:	66 0f 57 c0          	xorpd  xmm0,xmm0
      bda8e5:	66 41 0f 11 85 a8 03 	movupd XMMWORD PTR [r13+0x3a8],xmm0
      bda8ec:	00 00 
      bda8ee:	41 c6 85 b8 03 00 00 	mov    BYTE PTR [r13+0x3b8],0x1
      bda8f5:	01 
      bda8f6:	48 b8 01 00 00 00 01 	movabs rax,0x100000001
      bda8fd:	00 00 00 
      bda900:	49 89 85 bc 03 00 00 	mov    QWORD PTR [r13+0x3bc],rax
      bda907:	41 c7 85 c4 03 00 00 	mov    DWORD PTR [r13+0x3c4],0x1
      bda90e:	01 00 00 00 
      bda912:	49 8d 85 08 04 00 00 	lea    rax,[r13+0x408]
      bda919:	66 41 0f 11 85 08 04 	movupd XMMWORD PTR [r13+0x408],xmm0
      bda920:	00 00 
      bda922:	66 41 0f 11 85 c8 03 	movupd XMMWORD PTR [r13+0x3c8],xmm0
      bda929:	00 00 
      bda92b:	66 41 0f 11 85 d8 03 	movupd XMMWORD PTR [r13+0x3d8],xmm0
      bda932:	00 00 
      bda934:	66 41 0f 11 85 e8 03 	movupd XMMWORD PTR [r13+0x3e8],xmm0
      bda93b:	00 00 
      bda93d:	49 83 a5 f8 03 00 00 	and    QWORD PTR [r13+0x3f8],0x0
      bda944:	00 
      bda945:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
      bda94c:	00 
      bda94d:	49 89 85 00 04 00 00 	mov    QWORD PTR [r13+0x400],rax
      bda954:	41 83 a5 18 04 00 00 	and    DWORD PTR [r13+0x418],0x0
      bda95b:	00 
      bda95c:	f2 41 0f 10 85 a0 00 	movsd  xmm0,QWORD PTR [r13+0xa0]
      bda963:	00 00 
      bda965:	f2 41 0f 2a 8d ac 00 	cvtsi2sd xmm1,DWORD PTR [r13+0xac]
      bda96c:	00 00 
      bda96e:	49 8b bd 80 00 00 00 	mov    rdi,QWORD PTR [r13+0x80]
      bda975:	41 8b b5 90 00 00 00 	mov    esi,DWORD PTR [r13+0x90]
      bda97c:	48 8d 0d ea b6 7a ff 	lea    rcx,[rip+0xffffffffff7ab6ea]        # 38606d <_ZTSSt12bad_any_cast@@Base-0xa15b>
      bda983:	6a 01                	push   0x1
      bda985:	5a                   	pop    rdx
      bda986:	e8 23 5f 00 00       	call   be08ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d84e>
      bda98b:	f2 41 0f 10 85 c8 00 	movsd  xmm0,QWORD PTR [r13+0xc8]
      bda992:	00 00 
      bda994:	f2 41 0f 10 8d d0 00 	movsd  xmm1,QWORD PTR [r13+0xd0]
      bda99b:	00 00 
      bda99d:	49 8b bd 80 00 00 00 	mov    rdi,QWORD PTR [r13+0x80]
      bda9a4:	41 8b b5 90 00 00 00 	mov    esi,DWORD PTR [r13+0x90]
      bda9ab:	48 8d 0d 97 71 76 ff 	lea    rcx,[rip+0xffffffffff767197]        # 341b49 <_ZTSSt12bad_any_cast@@Base-0x4e67f>
      bda9b2:	6a 01                	push   0x1
      bda9b4:	5a                   	pop    rdx
      bda9b5:	e8 f4 5e 00 00       	call   be08ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d84e>
      bda9ba:	41 f6 85 ac 00 00 00 	test   BYTE PTR [r13+0xac],0x1
      bda9c1:	01 
      bda9c2:	48 8d 05 fd 83 7a ff 	lea    rax,[rip+0xffffffffff7a83fd]        # 382dc6 <_ZTSSt12bad_any_cast@@Base-0xd402>
      bda9c9:	48 8d 0d 4c bf 79 ff 	lea    rcx,[rip+0xffffffffff79bf4c]        # 37691c <_ZTSSt12bad_any_cast@@Base-0x198ac>
      bda9d0:	48 0f 44 c8          	cmove  rcx,rax
      bda9d4:	49 8b 7d 20          	mov    rdi,QWORD PTR [r13+0x20]

### 0xbf0520 score=1: setl   BYTE PTR [rbx+0x3b8]
      bf0498:	66 0f 3a 0b c0 09    	roundsd xmm0,xmm0,0x9
      bf049e:	f2 0f 2c c0          	cvttsd2si eax,xmm0
      bf04a2:	87 83 bc 03 00 00    	xchg   DWORD PTR [rbx+0x3bc],eax
      bf04a8:	8b 83 bc 03 00 00    	mov    eax,DWORD PTR [rbx+0x3bc]
      bf04ae:	f2 0f 2a c0          	cvtsi2sd xmm0,eax
      bf04b2:	8b 83 bc 03 00 00    	mov    eax,DWORD PTR [rbx+0x3bc]
      bf04b8:	f2 0f 2a d0          	cvtsi2sd xmm2,eax
      bf04bc:	f2 0f 10 4c 24 08    	movsd  xmm1,QWORD PTR [rsp+0x8]
      bf04c2:	f2 0f 59 ca          	mulsd  xmm1,xmm2
      bf04c6:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
      bf04cd:	8b b3 90 00 00 00    	mov    esi,DWORD PTR [rbx+0x90]
      bf04d3:	48 8d 0d 87 6e 73 ff 	lea    rcx,[rip+0xffffffffff736e87]        # 327361 <_ZTSSt12bad_any_cast@@Base-0x68e67>
      bf04da:	6a 01                	push   0x1
      bf04dc:	5d                   	pop    rbp
      bf04dd:	89 ea                	mov    edx,ebp
      bf04df:	e8 ca 03 ff ff       	call   be08ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d84e>
      bf04e4:	44 8b b3 bc 03 00 00 	mov    r14d,DWORD PTR [rbx+0x3bc]
      bf04eb:	44 8b bb bc 00 00 00 	mov    r15d,DWORD PTR [rbx+0xbc]
      bf04f2:	45 39 fe             	cmp    r14d,r15d
      bf04f5:	f2 41 0f 2a c7       	cvtsi2sd xmm0,r15d
      bf04fa:	48 8d 05 4f c5 78 ff 	lea    rax,[rip+0xffffffffff78c54f]        # 37ca50 <_ZTSSt12bad_any_cast@@Base-0x13778>
      bf0501:	48 8d 0d 7e 16 75 ff 	lea    rcx,[rip+0xffffffffff75167e]        # 341b86 <_ZTSSt12bad_any_cast@@Base-0x4e642>
      bf0508:	48 0f 4c c8          	cmovl  rcx,rax
      bf050c:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
      bf0510:	8b b3 90 00 00 00    	mov    esi,DWORD PTR [rbx+0x90]
      bf0516:	89 ea                	mov    edx,ebp
      bf0518:	e8 e3 04 ff ff       	call   be0a00 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12d9a0>
      bf051d:	45 39 fe             	cmp    r14d,r15d
      bf0520:	0f 9c 83 b8 03 00 00 	setl   BYTE PTR [rbx+0x3b8]
      bf0527:	83 bb 18 04 00 00 00 	cmp    DWORD PTR [rbx+0x418],0x0
      bf052e:	75 56                	jne    bf0586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13d526>
      bf0530:	8b 83 bc 03 00 00    	mov    eax,DWORD PTR [rbx+0x3bc]
      bf0536:	89 83 c0 03 00 00    	mov    DWORD PTR [rbx+0x3c0],eax
      bf053c:	8b 83 bc 03 00 00    	mov    eax,DWORD PTR [rbx+0x3bc]
      bf0542:	f2 0f 2a c0          	cvtsi2sd xmm0,eax
      bf0546:	f2 0f 10 8b c8 00 00 	movsd  xmm1,QWORD PTR [rbx+0xc8]
      bf054d:	00 
      bf054e:	f2 0f 10 93 d0 00 00 	movsd  xmm2,QWORD PTR [rbx+0xd0]
      bf0555:	00 
      bf0556:	f2 0f 59 d1          	mulsd  xmm2,xmm1
      bf055a:	f2 0f 59 d0          	mulsd  xmm2,xmm0
      bf055e:	66 0f 28 05 ba d9 79 	movapd xmm0,XMMWORD PTR [rip+0xffffffffff79d9ba]        # 38df20 <_ZTSSt12bad_any_cast@@Base-0x22a8>
      bf0565:	ff 
      bf0566:	66 0f 54 c2          	andpd  xmm0,xmm2
      bf056a:	66 0f 56 05 2e c6 79 	orpd   xmm0,XMMWORD PTR [rip+0xffffffffff79c62e]        # 38cba0 <_ZTSSt12bad_any_cast@@Base-0x3628>
      bf0571:	ff 
      bf0572:	f2 0f 58 c2          	addsd  xmm0,xmm2
      bf0576:	66 0f 3a 0b c0 0b    	roundsd xmm0,xmm0,0xb
      bf057c:	f2 0f 2c c0          	cvttsd2si eax,xmm0
      bf0580:	89 83 c4 03 00 00    	mov    DWORD PTR [rbx+0x3c4],eax
      bf0586:	48 83 c4 18          	add    rsp,0x18
      bf058a:	5b                   	pop    rbx
      bf058b:	41 5e                	pop    r14
      bf058d:	41 5f                	pop    r15
      bf058f:	5d                   	pop    rbp
      bf0590:	c3                   	ret
      bf0591:	cc                   	int3
      bf0592:	48 85 f6             	test   rsi,rsi
      bf0595:	74 03                	je     bf059a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13d53a>
      bf0597:	c6 06 00             	mov    BYTE PTR [rsi],0x0
      bf059a:	48 85 d2             	test   rdx,rdx
      bf059d:	74 03                	je     bf05a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13d542>
      bf059f:	c6 02 00             	mov    BYTE PTR [rdx],0x0
      bf05a2:	48 83 bf b0 03 00 00 	cmp    QWORD PTR [rdi+0x3b0],0x0
      bf05a9:	00 
      bf05aa:	74 23                	je     bf05cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13d56f>
      bf05ac:	8b 87 ac 00 00 00    	mov    eax,DWORD PTR [rdi+0xac]
      bf05b2:	a8 01                	test   al,0x1
      bf05b4:	75 1a                	jne    bf05d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13d570>
      bf05b6:	f2 0f 10 87 d0 00 00 	movsd  xmm0,QWORD PTR [rdi+0xd0]
      bf05bd:	00 
      bf05be:	48 85 d2             	test   rdx,rdx
      bf05c1:	74 0c                	je     bf05cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13d56f>
      bf05c3:	66 0f 2e 05 7d ea 79 	ucomisd xmm0,QWORD PTR [rip+0xffffffffff79ea7d]        # 38f048 <_ZTSSt12bad_any_cast@@Base-0x1180>
      bf05ca:	ff 
      bf05cb:	75 66                	jne    bf0633 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13d5d3>
      bf05cd:	7a 64                	jp     bf0633 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13d5d3>

### 0xd6cad8 score=1: mov    QWORD PTR [rsp+0x3b8],rdx
      d6ca5f:	00 
      d6ca60:	c6 41 08 00          	mov    BYTE PTR [rcx+0x8],0x0
      d6ca64:	48 8d 35 4d a6 ab 00 	lea    rsi,[rip+0xaba64d]        # 18270b8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x36e8>
      d6ca6b:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
      d6ca72:	00 
      d6ca73:	e8 7e 0a e2 ff       	call   b8d4f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda496>
      d6ca78:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
      d6ca7f:	00 
      d6ca80:	48 8d 94 24 c0 03 00 	lea    rdx,[rsp+0x3c0]
      d6ca87:	00 
      d6ca88:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
      d6ca8d:	e8 15 b8 d3 ff       	call   aa82a7 <JNI_OnUnload@@Base+0x2fb74>
      d6ca92:	48 8d bc 24 f0 03 00 	lea    rdi,[rsp+0x3f0]
      d6ca99:	00 
      d6ca9a:	48 8d b4 24 d8 03 00 	lea    rsi,[rsp+0x3d8]
      d6caa1:	00 
      d6caa2:	e8 99 14 a8 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d6caa7:	48 8b 94 24 d8 00 00 	mov    rdx,QWORD PTR [rsp+0xd8]
      d6caae:	00 
      d6caaf:	48 8b 1a             	mov    rbx,QWORD PTR [rdx]
      d6cab2:	48 8b 83 88 00 00 00 	mov    rax,QWORD PTR [rbx+0x88]
      d6cab9:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
      d6cabe:	48 8d 05 5b a7 ab 00 	lea    rax,[rip+0xaba75b]        # 1827220 <_ZTIN4asio2ip16bad_address_castE@@Base+0x3850>
      d6cac5:	48 8d 8c 24 30 07 00 	lea    rcx,[rsp+0x730]
      d6cacc:	00 
      d6cacd:	48 89 01             	mov    QWORD PTR [rcx],rax
      d6cad0:	48 89 51 08          	mov    QWORD PTR [rcx+0x8],rdx
      d6cad4:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      d6cad8:	48 89 94 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rdx
      d6cadf:	00 
      d6cae0:	4c 8d b4 24 c0 04 00 	lea    r14,[rsp+0x4c0]
      d6cae7:	00 
      d6cae8:	48 8d b4 24 f0 03 00 	lea    rsi,[rsp+0x3f0]
      d6caef:	00 
      d6caf0:	4c 89 f7             	mov    rdi,r14
      d6caf3:	e8 32 12 a4 00       	call   17add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x161e96>
      d6caf8:	48 8b 84 24 c8 04 00 	mov    rax,QWORD PTR [rsp+0x4c8]
      d6caff:	00 
      d6cb00:	80 78 14 00          	cmp    BYTE PTR [rax+0x14],0x0
      d6cb04:	0f 85 1f 0d 00 00    	jne    d6d829 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a8af>
      d6cb0a:	48 8d 83 a8 0b 00 00 	lea    rax,[rbx+0xba8]
      d6cb11:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      d6cb18:	00 
      d6cb19:	48 8d 8c 24 a8 04 00 	lea    rcx,[rsp+0x4a8]
      d6cb20:	00 
      d6cb21:	66 c7 41 d8 01 00    	mov    WORD PTR [rcx-0x28],0x1
      d6cb27:	48 83 61 e0 00       	and    QWORD PTR [rcx-0x20],0x0
      d6cb2c:	83 61 e8 00          	and    DWORD PTR [rcx-0x18],0x0
      d6cb30:	4c 89 71 f0          	mov    QWORD PTR [rcx-0x10],r14
      d6cb34:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      d6cb38:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
      d6cb3c:	48 b8 01 00 00 00 40 	movabs rax,0x4000000001
      d6cb43:	00 00 00 
      d6cb46:	48 89 41 f8          	mov    QWORD PTR [rcx-0x8],rax
      d6cb4a:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      d6cb4d:	48 89 84 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rax
      d6cb54:	00 
      d6cb55:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      d6cb59:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      d6cb5d:	48 89 84 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rax
      d6cb64:	00 
      d6cb65:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
      d6cb69:	48 8d 83 20 0c 00 00 	lea    rax,[rbx+0xc20]
      d6cb70:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
      d6cb77:	00 
      d6cb78:	48 8d 83 30 0c 00 00 	lea    rax,[rbx+0xc30]
      d6cb7f:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      d6cb86:	00 
      d6cb87:	48 8d 83 48 0c 00 00 	lea    rax,[rbx+0xc48]
      d6cb8e:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      d6cb95:	00 
      d6cb96:	b8 88 00 00 00       	mov    eax,0x88
      d6cb9b:	4c 01 e0             	add    rax,r12
      d6cb9e:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      d6cba3:	48 8d 84 24 60 07 00 	lea    rax,[rsp+0x760]
      d6cbaa:	00 
      d6cbab:	48 01 e8             	add    rax,rbp

### 0xdf1a54 score=1: mov    QWORD PTR [rsp+0x3b8],r13
      df19df:	00 
      df19e0:	41 80 be 70 fe ff ff 	cmp    BYTE PTR [r14-0x190],0x0
      df19e7:	00 
      df19e8:	0f 85 eb 02 00 00    	jne    df1cd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbed5f>
      df19ee:	41 83 be 8c fd ff ff 	cmp    DWORD PTR [r14-0x274],0x0
      df19f5:	00 
      df19f6:	0f 84 dd 02 00 00    	je     df1cd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbed5f>
      df19fc:	48 83 a4 24 68 03 00 	and    QWORD PTR [rsp+0x368],0x0
      df1a03:	00 00 
      df1a05:	48 8d 05 34 23 aa 00 	lea    rax,[rip+0xaa2334]        # 1893d40 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xc80>
      df1a0c:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
      df1a13:	00 
      df1a14:	4c 89 ac 24 78 03 00 	mov    QWORD PTR [rsp+0x378],r13
      df1a1b:	00 
      df1a1c:	4c 89 ac 24 80 03 00 	mov    QWORD PTR [rsp+0x380],r13
      df1a23:	00 
      df1a24:	4c 89 ac 24 88 03 00 	mov    QWORD PTR [rsp+0x388],r13
      df1a2b:	00 
      df1a2c:	4c 89 ac 24 90 03 00 	mov    QWORD PTR [rsp+0x390],r13
      df1a33:	00 
      df1a34:	4c 89 ac 24 98 03 00 	mov    QWORD PTR [rsp+0x398],r13
      df1a3b:	00 
      df1a3c:	4c 89 ac 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],r13
      df1a43:	00 
      df1a44:	4c 89 ac 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],r13
      df1a4b:	00 
      df1a4c:	4c 89 ac 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],r13
      df1a53:	00 
      df1a54:	4c 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],r13
      df1a5b:	00 
      df1a5c:	4c 89 ac 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],r13
      df1a63:	00 
      df1a64:	4c 89 ac 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],r13
      df1a6b:	00 
      df1a6c:	4c 89 ac 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],r13
      df1a73:	00 
      df1a74:	4c 89 ac 24 d8 03 00 	mov    QWORD PTR [rsp+0x3d8],r13
      df1a7b:	00 
      df1a7c:	c6 84 24 e0 03 00 00 	mov    BYTE PTR [rsp+0x3e0],0x0
      df1a83:	00 
      df1a84:	48 c7 84 24 70 03 00 	mov    QWORD PTR [rsp+0x370],0x1
      df1a8b:	00 01 00 00 00 
      df1a90:	48 8d bc 24 78 03 00 	lea    rdi,[rsp+0x378]
      df1a97:	00 
      df1a98:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      df1a9d:	31 d2                	xor    edx,edx
      df1a9f:	e8 ee 3c 97 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      df1aa4:	41 8b 86 8c fd ff ff 	mov    eax,DWORD PTR [r14-0x274]
      df1aab:	48 8d 35 66 01 66 ff 	lea    rsi,[rip+0xffffffffff660166]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      df1ab2:	48 83 f8 03          	cmp    rax,0x3
      df1ab6:	77 0e                	ja     df1ac6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbeb4c>
      df1ab8:	48 8d 0d 51 14 5e ff 	lea    rcx,[rip+0xffffffffff5e1451]        # 3d2f10 <_ZTSN5boost17bad_function_callE@@Base+0x256>
      df1abf:	48 63 34 81          	movsxd rsi,DWORD PTR [rcx+rax*4]
      df1ac3:	48 01 ce             	add    rsi,rcx
      df1ac6:	80 8c 24 70 03 00 00 	or     BYTE PTR [rsp+0x370],0x2
      df1acd:	02 
      df1ace:	48 8b 94 24 68 03 00 	mov    rdx,QWORD PTR [rsp+0x368]
      df1ad5:	00 
      df1ad6:	f6 c2 01             	test   dl,0x1
      df1ad9:	0f 85 13 02 00 00    	jne    df1cf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbed78>
      df1adf:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
      df1ae6:	00 
      df1ae7:	e8 66 42 d1 ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
      df1aec:	80 8c 24 70 03 00 00 	or     BYTE PTR [rsp+0x370],0x4
      df1af3:	04 
      df1af4:	48 8b 94 24 68 03 00 	mov    rdx,QWORD PTR [rsp+0x368]
      df1afb:	00 
      df1afc:	f6 c2 01             	test   dl,0x1
      df1aff:	0f 85 f9 01 00 00    	jne    df1cfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbed84>
      df1b05:	49 8d b6 a8 fd ff ff 	lea    rsi,[r14-0x258]
      df1b0c:	48 8d bc 24 88 03 00 	lea    rdi,[rsp+0x388]
      df1b13:	00 
      df1b14:	e8 79 3c 97 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      df1b19:	41 8b be f0 fd ff ff 	mov    edi,DWORD PTR [r14-0x210]
      df1b20:	e8 4f 20 6b 00       	call   14a3b74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e90f8>
      df1b25:	80 8c 24 70 03 00 00 	or     BYTE PTR [rsp+0x370],0x8
      df1b2c:	08 

### 0xdf878e score=1: mov    QWORD PTR [rsp+0x3b8],rbp
      df8714:	e8 47 63 95 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
      df8719:	e9 2a 09 00 00       	jmp    df9048 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc60ce>
      df871e:	0f 57 c0             	xorps  xmm0,xmm0
      df8721:	4c 8d ac 24 80 02 00 	lea    r13,[rsp+0x280]
      df8728:	00 
      df8729:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
      df872e:	48 8d 05 83 e1 a7 00 	lea    rax,[rip+0xa7e183]        # 18768b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32fa0>
      df8735:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      df8739:	48 8d 2d b8 70 64 ff 	lea    rbp,[rip+0xffffffffff6470b8]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      df8740:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
      df8744:	49 89 6d 20          	mov    QWORD PTR [r13+0x20],rbp
      df8748:	49 83 65 28 00       	and    QWORD PTR [r13+0x28],0x0
      df874d:	49 83 c4 30          	add    r12,0x30
      df8751:	4c 89 e7             	mov    rdi,r12
      df8754:	e8 dd 30 c8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      df8759:	4c 89 ef             	mov    rdi,r13
      df875c:	48 89 c6             	mov    rsi,rax
      df875f:	e8 ee 70 98 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
      df8764:	0f 57 c0             	xorps  xmm0,xmm0
      df8767:	84 c0                	test   al,al
      df8769:	0f 84 25 02 00 00    	je     df8994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5a1a>
      df876f:	0f 11 84 24 a0 03 00 	movups XMMWORD PTR [rsp+0x3a0],xmm0
      df8776:	00 
      df8777:	48 8d 05 3a e1 a7 00 	lea    rax,[rip+0xa7e13a]        # 18768b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32fa0>
      df877e:	48 89 84 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rax
      df8785:	00 
      df8786:	48 89 ac 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbp
      df878d:	00 
      df878e:	48 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rbp
      df8795:	00 
      df8796:	48 83 a4 24 c0 03 00 	and    QWORD PTR [rsp+0x3c0],0x0
      df879d:	00 00 
      df879f:	48 8b 84 24 88 02 00 	mov    rax,QWORD PTR [rsp+0x288]
      df87a6:	00 
      df87a7:	a8 01                	test   al,0x1
      df87a9:	0f 85 57 0a 00 00    	jne    df9206 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc628c>
      df87af:	48 85 c0             	test   rax,rax
      df87b2:	0f 84 0b 09 00 00    	je     df90c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6149>
      df87b8:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
      df87bf:	00 
      df87c0:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
      df87c7:	00 
      df87c8:	e8 93 62 95 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
      df87cd:	e9 29 09 00 00       	jmp    df90fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6181>
      df87d2:	4c 8d ac 24 80 02 00 	lea    r13,[rsp+0x280]
      df87d9:	00 
      df87da:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
      df87df:	41 83 65 10 00       	and    DWORD PTR [r13+0x10],0x0
      df87e4:	48 8d 05 4d 05 ab 00 	lea    rax,[rip+0xab054d]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>
      df87eb:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      df87ef:	49 83 c4 30          	add    r12,0x30
      df87f3:	4c 89 e7             	mov    rdi,r12
      df87f6:	e8 3b 30 c8 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      df87fb:	4c 89 ef             	mov    rdi,r13
      df87fe:	48 89 c6             	mov    rsi,rax
      df8801:	e8 4c 70 98 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
      df8806:	84 c0                	test   al,al
      df8808:	0f 84 df 00 00 00    	je     df88ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5973>
      df880e:	48 8d bc 24 10 03 00 	lea    rdi,[rsp+0x310]
      df8815:	00 
      df8816:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
      df881d:	00 
      df881e:	e8 e1 70 cb ff       	call   aaf904 <JNI_OnUnload@@Base+0x371d1>
      df8823:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
      df882a:	00 
      df882b:	4c 89 fe             	mov    rsi,r15
      df882e:	e8 06 21 cb ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
      df8833:	49 8b 06             	mov    rax,QWORD PTR [r14]
      df8836:	4c 8d bc 24 10 03 00 	lea    r15,[rsp+0x310]
      df883d:	00 
      df883e:	4c 8d a4 24 98 00 00 	lea    r12,[rsp+0x98]
      df8845:	00 
      df8846:	48 89 df             	mov    rdi,rbx
      df8849:	4c 89 f6             	mov    rsi,r14
      df884c:	4c 89 fa             	mov    rdx,r15
      df884f:	4c 89 e1             	mov    rcx,r12
      df8852:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]

### 0xe0d7fb score=1: cmp    BYTE PTR [r14+0x3b8],0x0
      e0d78d:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      e0d791:	4c 8d b4 24 68 10 00 	lea    r14,[rsp+0x1068]
      e0d798:	00 
      e0d799:	4c 39 fb             	cmp    rbx,r15
      e0d79c:	41 0f 94 c5          	sete   r13b
      e0d7a0:	0f 84 b1 00 00 00    	je     e0d857 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda8dd>
      e0d7a6:	49 8b 74 24 38       	mov    rsi,QWORD PTR [r12+0x38]
      e0d7ab:	b8 c0 00 00 00       	mov    eax,0xc0
      e0d7b0:	48 01 c6             	add    rsi,rax
      e0d7b3:	4c 89 f7             	mov    rdi,r14
      e0d7b6:	e8 9d 67 f2 ff       	call   d33f58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfde>
      e0d7bb:	0f b6 53 18          	movzx  edx,BYTE PTR [rbx+0x18]
      e0d7bf:	4c 89 f7             	mov    rdi,r14
      e0d7c2:	48 89 de             	mov    rsi,rbx
      e0d7c5:	e8 15 7e 02 00       	call   e355df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102665>
      e0d7ca:	89 c5                	mov    ebp,eax
      e0d7cc:	4c 89 f7             	mov    rdi,r14
      e0d7cf:	e8 bc 06 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e0d7d4:	48 83 c3 20          	add    rbx,0x20
      e0d7d8:	40 84 ed             	test   bpl,bpl
      e0d7db:	74 bc                	je     e0d799 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda81f>
      e0d7dd:	eb 78                	jmp    e0d857 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda8dd>
      e0d7df:	41 80 be a0 02 00 00 	cmp    BYTE PTR [r14+0x2a0],0x0
      e0d7e6:	00 
      e0d7e7:	75 12                	jne    e0d7fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda881>
      e0d7e9:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e0d7ee:	80 b8 78 03 00 00 00 	cmp    BYTE PTR [rax+0x378],0x0
      e0d7f5:	0f 85 a8 07 00 00    	jne    e0dfa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdb029>
      e0d7fb:	41 80 be b8 03 00 00 	cmp    BYTE PTR [r14+0x3b8],0x0
      e0d802:	00 
      e0d803:	74 0c                	je     e0d811 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda897>
      e0d805:	b3 01                	mov    bl,0x1
      e0d807:	41 80 be b9 03 00 00 	cmp    BYTE PTR [r14+0x3b9],0x0
      e0d80e:	00 
      e0d80f:	75 15                	jne    e0d826 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda8ac>
      e0d811:	49 8b b6 a0 00 00 00 	mov    rsi,QWORD PTR [r14+0xa0]
      e0d818:	41 8b be 98 00 00 00 	mov    edi,DWORD PTR [r14+0x98]
      e0d81f:	e8 06 5f e6 ff       	call   c7372a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c06ca>
      e0d824:	89 c3                	mov    ebx,eax
      e0d826:	41 80 be d8 00 00 00 	cmp    BYTE PTR [r14+0xd8],0x0
      e0d82d:	00 
      e0d82e:	0f 84 60 02 00 00    	je     e0da94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdab1a>
      e0d834:	49 69 86 d0 00 00 00 	imul   rax,QWORD PTR [r14+0xd0],0x3b9aca00
      e0d83b:	00 ca 9a 3b 
      e0d83f:	49 03 86 90 03 00 00 	add    rax,QWORD PTR [r14+0x390]
      e0d846:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      e0d84b:	40 0f 9d c5          	setge  bpl
      e0d84f:	e9 43 02 00 00       	jmp    e0da97 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdab1d>
      e0d854:	45 31 ed             	xor    r13d,r13d
      e0d857:	4d 8b 7c 24 38       	mov    r15,QWORD PTR [r12+0x38]
      e0d85c:	40 b5 01             	mov    bpl,0x1
      e0d85f:	49 81 bf 30 01 00 00 	cmp    QWORD PTR [r15+0x130],0x1f3
      e0d866:	f3 01 00 00 
      e0d86a:	77 20                	ja     e0d88c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda912>
      e0d86c:	41 80 bf 08 01 00 00 	cmp    BYTE PTR [r15+0x108],0x0
      e0d873:	00 
      e0d874:	74 14                	je     e0d88a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda910>
      e0d876:	49 8b b7 80 00 00 00 	mov    rsi,QWORD PTR [r15+0x80]
      e0d87d:	41 8b 7f 78          	mov    edi,DWORD PTR [r15+0x78]
      e0d881:	e8 9a df c6 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
      e0d886:	89 c5                	mov    ebp,eax
      e0d888:	eb 02                	jmp    e0d88c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda912>
      e0d88a:	31 ed                	xor    ebp,ebp
      e0d88c:	45 8b b7 0c 01 00 00 	mov    r14d,DWORD PTR [r15+0x10c]
      e0d893:	41 83 fe 02          	cmp    r14d,0x2
      e0d897:	75 0e                	jne    e0d8a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda92d>
      e0d899:	4c 89 ff             	mov    rdi,r15
      e0d89c:	e8 99 ee ff ff       	call   e0c73a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd97c0>
      e0d8a1:	b3 01                	mov    bl,0x1
      e0d8a3:	84 c0                	test   al,al
      e0d8a5:	75 07                	jne    e0d8ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda934>
      e0d8a7:	41 83 fe 02          	cmp    r14d,0x2
      e0d8ab:	0f 92 c3             	setb   bl
      e0d8ae:	49 83 7c 24 28 00    	cmp    QWORD PTR [r12+0x28],0x0
      e0d8b4:	74 0f                	je     e0d8c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda94b>
      e0d8b6:	31 c9                	xor    ecx,ecx
      e0d8b8:	4c 8d b4 24 68 10 00 	lea    r14,[rsp+0x1068]

### 0xe3aafb score=1: mov    WORD PTR [rbx+0x3b8],0x1
      e3aa60:	40 88 ab 08 03 00 00 	mov    BYTE PTR [rbx+0x308],bpl
      e3aa67:	40 88 ab 10 03 00 00 	mov    BYTE PTR [rbx+0x310],bpl
      e3aa6e:	40 88 ab 28 03 00 00 	mov    BYTE PTR [rbx+0x328],bpl
      e3aa75:	40 88 ab 50 03 00 00 	mov    BYTE PTR [rbx+0x350],bpl
      e3aa7c:	40 88 ab 68 03 00 00 	mov    BYTE PTR [rbx+0x368],bpl
      e3aa83:	40 88 ab e8 02 00 00 	mov    BYTE PTR [rbx+0x2e8],bpl
      e3aa8a:	0f 11 83 d8 02 00 00 	movups XMMWORD PTR [rbx+0x2d8],xmm0
      e3aa91:	0f 11 83 c8 02 00 00 	movups XMMWORD PTR [rbx+0x2c8],xmm0
      e3aa98:	0f 11 83 39 03 00 00 	movups XMMWORD PTR [rbx+0x339],xmm0
      e3aa9f:	0f 29 83 30 03 00 00 	movaps XMMWORD PTR [rbx+0x330],xmm0
      e3aaa6:	48 83 a3 70 03 00 00 	and    QWORD PTR [rbx+0x370],0x0
      e3aaad:	00 
      e3aaae:	ba 91 00 00 00       	mov    edx,0x91
      e3aab3:	31 f6                	xor    esi,esi
      e3aab5:	e8 d6 40 9b 00       	call   17eeb90 <memset@plt>
      e3aaba:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e3aabd:	48 89 83 78 03 00 00 	mov    QWORD PTR [rbx+0x378],rax
      e3aac4:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
      e3aac8:	48 89 83 80 03 00 00 	mov    QWORD PTR [rbx+0x380],rax
      e3aacf:	0f 57 c0             	xorps  xmm0,xmm0
      e3aad2:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      e3aad6:	e8 75 36 9b 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
      e3aadb:	48 89 83 88 03 00 00 	mov    QWORD PTR [rbx+0x388],rax
      e3aae2:	48 83 a3 b0 03 00 00 	and    QWORD PTR [rbx+0x3b0],0x0
      e3aae9:	00 
      e3aaea:	0f 57 c0             	xorps  xmm0,xmm0
      e3aaed:	0f 29 83 90 03 00 00 	movaps XMMWORD PTR [rbx+0x390],xmm0
      e3aaf4:	0f 29 83 a0 03 00 00 	movaps XMMWORD PTR [rbx+0x3a0],xmm0
      e3aafb:	66 c7 83 b8 03 00 00 	mov    WORD PTR [rbx+0x3b8],0x1
      e3ab02:	01 00 
      e3ab04:	48 8d bb c0 03 00 00 	lea    rdi,[rbx+0x3c0]
      e3ab0b:	e8 ce 20 dc ff       	call   bfcbde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x149b7e>
      e3ab10:	40 88 ab d0 03 00 00 	mov    BYTE PTR [rbx+0x3d0],bpl
      e3ab17:	40 88 ab d4 03 00 00 	mov    BYTE PTR [rbx+0x3d4],bpl
      e3ab1e:	48 83 a3 d8 03 00 00 	and    QWORD PTR [rbx+0x3d8],0x0
      e3ab25:	00 
      e3ab26:	48 83 c4 08          	add    rsp,0x8
      e3ab2a:	5b                   	pop    rbx
      e3ab2b:	41 5e                	pop    r14
      e3ab2d:	41 5f                	pop    r15
      e3ab2f:	5d                   	pop    rbp
      e3ab30:	c3                   	ret
      e3ab31:	cc                   	int3
      e3ab32:	53                   	push   rbx
      e3ab33:	48 89 fb             	mov    rbx,rdi
      e3ab36:	48 8d 05 db 34 9f 00 	lea    rax,[rip+0x9f34db]        # 182e018 <_ZTIN4asio2ip16bad_address_castE@@Base+0xa648>
      e3ab3d:	48 89 07             	mov    QWORD PTR [rdi],rax
      e3ab40:	48 8b bf d8 03 00 00 	mov    rdi,QWORD PTR [rdi+0x3d8]
      e3ab47:	48 83 a3 d8 03 00 00 	and    QWORD PTR [rbx+0x3d8],0x0
      e3ab4e:	00 
      e3ab4f:	48 85 ff             	test   rdi,rdi
      e3ab52:	74 06                	je     e3ab5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f70>
      e3ab54:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e3ab57:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e3ab5a:	48 8d bb a0 03 00 00 	lea    rdi,[rbx+0x3a0]
      e3ab61:	e8 2a 33 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e3ab66:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
      e3ab6d:	e8 98 25 c7 ff       	call   aad10a <JNI_OnUnload@@Base+0x349d7>
      e3ab72:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
      e3ab79:	e8 58 2b 00 00       	call   e3d6d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4aec>
      e3ab7e:	48 8d bb 28 01 00 00 	lea    rdi,[rbx+0x128]
      e3ab85:	e8 ca c2 c6 ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
      e3ab8a:	48 8d bb 10 01 00 00 	lea    rdi,[rbx+0x110]
      e3ab91:	e8 fa 32 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e3ab96:	48 8d bb f8 00 00 00 	lea    rdi,[rbx+0xf8]
      e3ab9d:	e8 ee 32 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e3aba2:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
      e3aba9:	e8 c8 3b c6 ff       	call   a9e776 <JNI_OnUnload@@Base+0x26043>
      e3abae:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
      e3abb5:	e8 d6 32 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e3abba:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
      e3abc1:	e8 ca 32 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e3abc6:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
      e3abcd:	e8 be 32 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e3abd2:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
      e3abd6:	e8 b5 32 9b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e3abdb:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]

### 0xe41cc7 score=1: cmp    BYTE PTR [r12+0x3b8],0x0
      e41c63:	41 5e                	pop    r14
      e41c65:	41 5f                	pop    r15
      e41c67:	c3                   	ret
      e41c68:	55                   	push   rbp
      e41c69:	41 57                	push   r15
      e41c6b:	41 56                	push   r14
      e41c6d:	41 55                	push   r13
      e41c6f:	41 54                	push   r12
      e41c71:	53                   	push   rbx
      e41c72:	48 83 ec 78          	sub    rsp,0x78
      e41c76:	89 74 24 04          	mov    DWORD PTR [rsp+0x4],esi
      e41c7a:	48 89 fb             	mov    rbx,rdi
      e41c7d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e41c84:	00 00 
      e41c86:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e41c8b:	48 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [rdi+0x178]
      e41c92:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e41c95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e41c98:	48 8b 28             	mov    rbp,QWORD PTR [rax]
      e41c9b:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      e41c9f:	4c 39 f5             	cmp    rbp,r14
      e41ca2:	0f 84 46 01 00 00    	je     e41dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9204>
      e41ca8:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      e41cad:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      e41cb2:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      e41cb7:	48 8b bb 60 02 00 00 	mov    rdi,QWORD PTR [rbx+0x260]
      e41cbe:	e8 9f 87 c3 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      e41cc3:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]
      e41cc7:	41 80 bc 24 b8 03 00 	cmp    BYTE PTR [r12+0x3b8],0x0
      e41cce:	00 00 
      e41cd0:	0f 84 0b 01 00 00    	je     e41de1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91f7>
      e41cd6:	80 7c 24 04 00       	cmp    BYTE PTR [rsp+0x4],0x0
      e41cdb:	75 1c                	jne    e41cf9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x910f>
      e41cdd:	49 2b 84 24 70 03 00 	sub    rax,QWORD PTR [r12+0x370]
      e41ce4:	00 
      e41ce5:	48 69 8b d0 01 00 00 	imul   rcx,QWORD PTR [rbx+0x1d0],0xf4240
      e41cec:	40 42 0f 00 
      e41cf0:	48 39 c8             	cmp    rax,rcx
      e41cf3:	0f 8e e8 00 00 00    	jle    e41de1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91f7>
      e41cf9:	48 8b b3 a0 02 00 00 	mov    rsi,QWORD PTR [rbx+0x2a0]
      e41d00:	4c 89 ff             	mov    rdi,r15
      e41d03:	e8 9e 7b 7a 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      e41d08:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
      e41d0d:	4c 8b ab 78 03 00 00 	mov    r13,QWORD PTR [rbx+0x378]
      e41d14:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
      e41d19:	48 8b 9b 80 03 00 00 	mov    rbx,QWORD PTR [rbx+0x380]
      e41d20:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
      e41d25:	48 85 db             	test   rbx,rbx
      e41d28:	74 05                	je     e41d2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9145>
      e41d2a:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e41d2f:	4c 8b 7d 00          	mov    r15,QWORD PTR [rbp+0x0]
      e41d33:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
      e41d38:	4c 8b 75 08          	mov    r14,QWORD PTR [rbp+0x8]
      e41d3c:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
      e41d41:	4d 85 f6             	test   r14,r14
      e41d44:	74 05                	je     e41d4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9161>
      e41d46:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      e41d4b:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
      e41d51:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
      e41d57:	6a 28                	push   0x28
      e41d59:	5f                   	pop    rdi
      e41d5a:	e8 a1 c1 9a 00       	call   17edf00 <_Znwm@plt>
      e41d5f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      e41d64:	48 89 08             	mov    QWORD PTR [rax],rcx
      e41d67:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      e41d6b:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
      e41d6f:	48 89 cb             	mov    rbx,rcx
      e41d72:	48 8d 4c 24 20       	lea    rcx,[rsp+0x20]
      e41d77:	0f 57 c0             	xorps  xmm0,xmm0
      e41d7a:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
      e41d7d:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
      e41d81:	4c 89 70 20          	mov    QWORD PTR [rax+0x20],r14
      e41d85:	0f 11 41 10          	movups XMMWORD PTR [rcx+0x10],xmm0
      e41d89:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      e41d8e:	48 8d 05 9b 00 00 00 	lea    rax,[rip+0x9b]        # e41e30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9246>
      e41d95:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      e41d9a:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # e41e5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9270>

### 0xee6023 score=1: mov    QWORD PTR [rdi+0x3b8],rax
      ee5f7d:	00 
      ee5f7e:	48 8b 86 80 03 00 00 	mov    rax,QWORD PTR [rsi+0x380]
      ee5f85:	48 89 87 80 03 00 00 	mov    QWORD PTR [rdi+0x380],rax
      ee5f8c:	48 8b 86 88 03 00 00 	mov    rax,QWORD PTR [rsi+0x388]
      ee5f93:	48 89 87 88 03 00 00 	mov    QWORD PTR [rdi+0x388],rax
      ee5f9a:	48 8b 86 90 03 00 00 	mov    rax,QWORD PTR [rsi+0x390]
      ee5fa1:	48 89 87 90 03 00 00 	mov    QWORD PTR [rdi+0x390],rax
      ee5fa8:	48 83 a6 90 03 00 00 	and    QWORD PTR [rsi+0x390],0x0
      ee5faf:	00 
      ee5fb0:	0f 11 86 80 03 00 00 	movups XMMWORD PTR [rsi+0x380],xmm0
      ee5fb7:	48 83 a7 a8 03 00 00 	and    QWORD PTR [rdi+0x3a8],0x0
      ee5fbe:	00 
      ee5fbf:	0f 11 87 98 03 00 00 	movups XMMWORD PTR [rdi+0x398],xmm0
      ee5fc6:	48 8b 86 98 03 00 00 	mov    rax,QWORD PTR [rsi+0x398]
      ee5fcd:	48 89 87 98 03 00 00 	mov    QWORD PTR [rdi+0x398],rax
      ee5fd4:	48 8b 86 a0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3a0]
      ee5fdb:	48 89 87 a0 03 00 00 	mov    QWORD PTR [rdi+0x3a0],rax
      ee5fe2:	48 8b 86 a8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3a8]
      ee5fe9:	48 89 87 a8 03 00 00 	mov    QWORD PTR [rdi+0x3a8],rax
      ee5ff0:	0f 11 86 98 03 00 00 	movups XMMWORD PTR [rsi+0x398],xmm0
      ee5ff7:	48 83 a6 a8 03 00 00 	and    QWORD PTR [rsi+0x3a8],0x0
      ee5ffe:	00 
      ee5fff:	0f 11 87 b0 03 00 00 	movups XMMWORD PTR [rdi+0x3b0],xmm0
      ee6006:	48 83 a7 c0 03 00 00 	and    QWORD PTR [rdi+0x3c0],0x0
      ee600d:	00 
      ee600e:	48 8b 86 b0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3b0]
      ee6015:	48 89 87 b0 03 00 00 	mov    QWORD PTR [rdi+0x3b0],rax
      ee601c:	48 8b 86 b8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3b8]
      ee6023:	48 89 87 b8 03 00 00 	mov    QWORD PTR [rdi+0x3b8],rax
      ee602a:	48 8b 86 c0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3c0]
      ee6031:	48 89 87 c0 03 00 00 	mov    QWORD PTR [rdi+0x3c0],rax
      ee6038:	48 83 a6 c0 03 00 00 	and    QWORD PTR [rsi+0x3c0],0x0
      ee603f:	00 
      ee6040:	0f 11 86 b0 03 00 00 	movups XMMWORD PTR [rsi+0x3b0],xmm0
      ee6047:	48 83 a7 d8 03 00 00 	and    QWORD PTR [rdi+0x3d8],0x0
      ee604e:	00 
      ee604f:	0f 11 87 c8 03 00 00 	movups XMMWORD PTR [rdi+0x3c8],xmm0
      ee6056:	48 8b 86 c8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3c8]
      ee605d:	48 89 87 c8 03 00 00 	mov    QWORD PTR [rdi+0x3c8],rax
      ee6064:	48 8b 86 d0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3d0]
      ee606b:	48 89 87 d0 03 00 00 	mov    QWORD PTR [rdi+0x3d0],rax
      ee6072:	48 8b 86 d8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3d8]
      ee6079:	48 89 87 d8 03 00 00 	mov    QWORD PTR [rdi+0x3d8],rax
      ee6080:	0f 11 86 c8 03 00 00 	movups XMMWORD PTR [rsi+0x3c8],xmm0
      ee6087:	48 83 a6 d8 03 00 00 	and    QWORD PTR [rsi+0x3d8],0x0
      ee608e:	00 
      ee608f:	48 8b 86 e0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3e0]
      ee6096:	48 89 87 e0 03 00 00 	mov    QWORD PTR [rdi+0x3e0],rax
      ee609d:	48 83 a7 f8 03 00 00 	and    QWORD PTR [rdi+0x3f8],0x0
      ee60a4:	00 
      ee60a5:	0f 11 87 e8 03 00 00 	movups XMMWORD PTR [rdi+0x3e8],xmm0
      ee60ac:	48 8b 86 e8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3e8]
      ee60b3:	48 89 87 e8 03 00 00 	mov    QWORD PTR [rdi+0x3e8],rax
      ee60ba:	48 8b 86 f0 03 00 00 	mov    rax,QWORD PTR [rsi+0x3f0]
      ee60c1:	48 89 87 f0 03 00 00 	mov    QWORD PTR [rdi+0x3f0],rax
      ee60c8:	48 8b 86 f8 03 00 00 	mov    rax,QWORD PTR [rsi+0x3f8]
      ee60cf:	48 89 87 f8 03 00 00 	mov    QWORD PTR [rdi+0x3f8],rax
      ee60d6:	0f 11 86 e8 03 00 00 	movups XMMWORD PTR [rsi+0x3e8],xmm0
      ee60dd:	48 83 a6 f8 03 00 00 	and    QWORD PTR [rsi+0x3f8],0x0
      ee60e4:	00 
      ee60e5:	0f 10 86 00 04 00 00 	movups xmm0,XMMWORD PTR [rsi+0x400]
      ee60ec:	0f 10 8e 10 04 00 00 	movups xmm1,XMMWORD PTR [rsi+0x410]
      ee60f3:	0f 11 8f 10 04 00 00 	movups XMMWORD PTR [rdi+0x410],xmm1
      ee60fa:	0f 11 87 00 04 00 00 	movups XMMWORD PTR [rdi+0x400],xmm0
      ee6101:	c3                   	ret
      ee6102:	53                   	push   rbx
      ee6103:	48 89 fb             	mov    rbx,rdi
      ee6106:	e8 09 9c ff ff       	call   edfd14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa712a>
      ee610b:	c6 83 20 04 00 00 01 	mov    BYTE PTR [rbx+0x420],0x1
      ee6112:	5b                   	pop    rbx
      ee6113:	c3                   	ret
      ee6114:	41 56                	push   r14
      ee6116:	53                   	push   rbx
      ee6117:	50                   	push   rax
      ee6118:	49 89 f6             	mov    r14,rsi
      ee611b:	48 89 fb             	mov    rbx,rdi
      ee611e:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]

### 0xf01f68 score=1: mov    QWORD PTR [rbx+0x3b8],rax
      f01ed0:	48 89 83 78 03 00 00 	mov    QWORD PTR [rbx+0x378],rax
      f01ed7:	48 85 c0             	test   rax,rax
      f01eda:	74 05                	je     f01ee1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc92f7>
      f01edc:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f01ee1:	49 8b 86 80 03 00 00 	mov    rax,QWORD PTR [r14+0x380]
      f01ee8:	48 89 83 80 03 00 00 	mov    QWORD PTR [rbx+0x380],rax
      f01eef:	49 8b 86 88 03 00 00 	mov    rax,QWORD PTR [r14+0x388]
      f01ef6:	48 89 83 88 03 00 00 	mov    QWORD PTR [rbx+0x388],rax
      f01efd:	48 85 c0             	test   rax,rax
      f01f00:	74 05                	je     f01f07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc931d>
      f01f02:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f01f07:	49 8b 86 90 03 00 00 	mov    rax,QWORD PTR [r14+0x390]
      f01f0e:	48 89 83 90 03 00 00 	mov    QWORD PTR [rbx+0x390],rax
      f01f15:	49 8b 86 98 03 00 00 	mov    rax,QWORD PTR [r14+0x398]
      f01f1c:	48 89 83 98 03 00 00 	mov    QWORD PTR [rbx+0x398],rax
      f01f23:	48 85 c0             	test   rax,rax
      f01f26:	74 05                	je     f01f2d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9343>
      f01f28:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f01f2d:	49 8b 86 a0 03 00 00 	mov    rax,QWORD PTR [r14+0x3a0]
      f01f34:	48 89 83 a0 03 00 00 	mov    QWORD PTR [rbx+0x3a0],rax
      f01f3b:	49 8b 86 a8 03 00 00 	mov    rax,QWORD PTR [r14+0x3a8]
      f01f42:	48 89 83 a8 03 00 00 	mov    QWORD PTR [rbx+0x3a8],rax
      f01f49:	48 85 c0             	test   rax,rax
      f01f4c:	74 05                	je     f01f53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9369>
      f01f4e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f01f53:	49 8b 86 b0 03 00 00 	mov    rax,QWORD PTR [r14+0x3b0]
      f01f5a:	48 89 83 b0 03 00 00 	mov    QWORD PTR [rbx+0x3b0],rax
      f01f61:	49 8b 86 b8 03 00 00 	mov    rax,QWORD PTR [r14+0x3b8]
      f01f68:	48 89 83 b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],rax
      f01f6f:	48 85 c0             	test   rax,rax
      f01f72:	74 05                	je     f01f79 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc938f>
      f01f74:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f01f79:	48 83 c4 18          	add    rsp,0x18
      f01f7d:	5b                   	pop    rbx
      f01f7e:	41 5c                	pop    r12
      f01f80:	41 5d                	pop    r13
      f01f82:	41 5e                	pop    r14
      f01f84:	41 5f                	pop    r15
      f01f86:	5d                   	pop    rbp
      f01f87:	c3                   	ret
      f01f88:	49 89 c6             	mov    r14,rax
      f01f8b:	4c 89 ef             	mov    rdi,r13
      f01f8e:	e8 d7 7f b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f01f93:	eb 03                	jmp    f01f98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc93ae>
      f01f95:	49 89 c6             	mov    r14,rax
      f01f98:	48 8b bb 48 02 00 00 	mov    rdi,QWORD PTR [rbx+0x248]
      f01f9f:	e8 e2 c4 b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f01fa4:	4c 89 e7             	mov    rdi,r12
      f01fa7:	e8 be 7f b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f01fac:	eb 03                	jmp    f01fb1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc93c7>
      f01fae:	49 89 c6             	mov    r14,rax
      f01fb1:	48 8b bb f8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1f8]
      f01fb8:	e8 c9 c4 b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f01fbd:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
      f01fc4:	e8 a1 7f b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f01fc9:	eb 03                	jmp    f01fce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc93e4>
      f01fcb:	49 89 c6             	mov    r14,rax
      f01fce:	48 8b bb 48 01 00 00 	mov    rdi,QWORD PTR [rbx+0x148]
      f01fd5:	e8 ac c4 b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f01fda:	4c 89 ff             	mov    rdi,r15
      f01fdd:	e8 88 7f b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f01fe2:	eb 03                	jmp    f01fe7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc93fd>
      f01fe4:	49 89 c6             	mov    r14,rax
      f01fe7:	48 89 ef             	mov    rdi,rbp
      f01fea:	e8 7b 7f b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f01fef:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      f01ff3:	e8 72 7f b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f01ff8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      f01ffd:	e8 68 7f b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f02002:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      f02006:	e8 7b c4 b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f0200b:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      f02010:	e8 55 7f b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f02015:	4c 89 f7             	mov    rdi,r14
      f02018:	e8 b3 dc b6 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      f0201d:	49 89 c6             	mov    r14,rax
      f02020:	eb cd                	jmp    f01fef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9405>

### 0x1145e74 score=2: mov    QWORD PTR [rsp+0x3b8],rbp
     1145e02:	49 83 c4 30          	add    r12,0x30
     1145e06:	4c 89 e7             	mov    rdi,r12
     1145e09:	e8 28 5a 93 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1145e0e:	4c 89 ef             	mov    rdi,r13
     1145e11:	48 89 c6             	mov    rsi,rax
     1145e14:	e8 39 9a 63 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     1145e19:	0f 57 c0             	xorps  xmm0,xmm0
     1145e1c:	84 c0                	test   al,al
     1145e1e:	0f 84 5d 08 00 00    	je     1146681 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30da97>
     1145e24:	0f 11 84 24 68 03 00 	movups XMMWORD PTR [rsp+0x368],xmm0
     1145e2b:	00 
     1145e2c:	48 8d 05 35 ee 70 00 	lea    rax,[rip+0x70ee35]        # 1854c68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11350>
     1145e33:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
     1145e3a:	00 
     1145e3b:	83 a4 24 78 03 00 00 	and    DWORD PTR [rsp+0x378],0x0
     1145e42:	00 
     1145e43:	0f 11 84 24 80 03 00 	movups XMMWORD PTR [rsp+0x380],xmm0
     1145e4a:	00 
     1145e4b:	48 83 a4 24 90 03 00 	and    QWORD PTR [rsp+0x390],0x0
     1145e52:	00 00 
     1145e54:	48 89 ac 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rbp
     1145e5b:	00 
     1145e5c:	48 89 ac 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],rbp
     1145e63:	00 
     1145e64:	48 89 ac 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],rbp
     1145e6b:	00 
     1145e6c:	48 89 ac 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbp
     1145e73:	00 
     1145e74:	48 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rbp
     1145e7b:	00 
     1145e7c:	48 89 ac 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rbp
     1145e83:	00 
     1145e84:	48 89 ac 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],rbp
     1145e8b:	00 
     1145e8c:	48 89 ac 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],rbp
     1145e93:	00 
     1145e94:	48 89 ac 24 d8 03 00 	mov    QWORD PTR [rsp+0x3d8],rbp
     1145e9b:	00 
     1145e9c:	48 89 ac 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rbp
     1145ea3:	00 
     1145ea4:	48 89 ac 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rbp
     1145eab:	00 
     1145eac:	48 89 ac 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],rbp
     1145eb3:	00 
     1145eb4:	48 89 ac 24 f8 03 00 	mov    QWORD PTR [rsp+0x3f8],rbp
     1145ebb:	00 
     1145ebc:	48 89 ac 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rbp
     1145ec3:	00 
     1145ec4:	48 89 ac 24 08 04 00 	mov    QWORD PTR [rsp+0x408],rbp
     1145ecb:	00 
     1145ecc:	48 89 ac 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rbp
     1145ed3:	00 
     1145ed4:	48 89 ac 24 48 04 00 	mov    QWORD PTR [rsp+0x448],rbp
     1145edb:	00 
     1145edc:	48 89 ac 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rbp
     1145ee3:	00 
     1145ee4:	48 89 ac 24 58 04 00 	mov    QWORD PTR [rsp+0x458],rbp
     1145eeb:	00 
     1145eec:	48 89 ac 24 60 04 00 	mov    QWORD PTR [rsp+0x460],rbp
     1145ef3:	00 
     1145ef4:	48 89 ac 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rbp
     1145efb:	00 
     1145efc:	48 89 ac 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rbp
     1145f03:	00 
     1145f04:	48 89 ac 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rbp
     1145f0b:	00 
     1145f0c:	0f 11 84 24 2c 04 00 	movups XMMWORD PTR [rsp+0x42c],xmm0
     1145f13:	00 
     1145f14:	0f 11 84 24 20 04 00 	movups XMMWORD PTR [rsp+0x420],xmm0
     1145f1b:	00 
     1145f1c:	0f 11 84 24 10 04 00 	movups XMMWORD PTR [rsp+0x410],xmm0
     1145f23:	00 
     1145f24:	48 83 a4 24 90 04 00 	and    QWORD PTR [rsp+0x490],0x0
     1145f2b:	00 00 
     1145f2d:	0f 11 84 24 80 04 00 	movups XMMWORD PTR [rsp+0x480],xmm0
     1145f34:	00 
     1145f35:	48 8b 84 24 a0 04 00 	mov    rax,QWORD PTR [rsp+0x4a0]

### 0x11cb1c5 score=2: mov    QWORD PTR [rbp+0x3b8],rax
     11cb13d:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
     11cb141:	48 89 85 50 03 00 00 	mov    QWORD PTR [rbp+0x350],rax
     11cb148:	66 0f 10 07          	movupd xmm0,XMMWORD PTR [rdi]
     11cb14c:	0f 10 4f 10          	movups xmm1,XMMWORD PTR [rdi+0x10]
     11cb150:	0f 11 8d 40 03 00 00 	movups XMMWORD PTR [rbp+0x340],xmm1
     11cb157:	66 0f 11 85 30 03 00 	movupd XMMWORD PTR [rbp+0x330],xmm0
     11cb15e:	00 
     11cb15f:	48 8d bd 58 03 00 00 	lea    rdi,[rbp+0x358]
     11cb166:	48 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rdi
     11cb16d:	00 
     11cb16e:	e8 81 ed ff ff       	call   11c9ef4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf478>
     11cb173:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     11cb177:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
     11cb17c:	48 89 85 78 03 00 00 	mov    QWORD PTR [rbp+0x378],rax
     11cb183:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11cb187:	48 89 85 80 03 00 00 	mov    QWORD PTR [rbp+0x380],rax
     11cb18e:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
     11cb193:	48 89 85 88 03 00 00 	mov    QWORD PTR [rbp+0x388],rax
     11cb19a:	66 0f 57 c0          	xorpd  xmm0,xmm0
     11cb19e:	66 41 0f 11 04 24    	movupd XMMWORD PTR [r12],xmm0
     11cb1a4:	66 0f 11 85 a0 03 00 	movupd XMMWORD PTR [rbp+0x3a0],xmm0
     11cb1ab:	00 
     11cb1ac:	66 0f 11 85 90 03 00 	movupd XMMWORD PTR [rbp+0x390],xmm0
     11cb1b3:	00 
     11cb1b4:	c7 85 b0 03 00 00 00 	mov    DWORD PTR [rbp+0x3b0],0x3f800000
     11cb1bb:	00 80 3f 
     11cb1be:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11cb1c1:	49 83 27 00          	and    QWORD PTR [r15],0x0
     11cb1c5:	48 89 85 b8 03 00 00 	mov    QWORD PTR [rbp+0x3b8],rax
     11cb1cc:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     11cb1d0:	48 89 85 c0 03 00 00 	mov    QWORD PTR [rbp+0x3c0],rax
     11cb1d7:	4c 89 b5 c8 03 00 00 	mov    QWORD PTR [rbp+0x3c8],r14
     11cb1de:	48 8d bd d0 03 00 00 	lea    rdi,[rbp+0x3d0]
     11cb1e5:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
     11cb1ec:	00 
     11cb1ed:	48 89 de             	mov    rsi,rbx
     11cb1f0:	e8 47 ed ff ff       	call   11c9f3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf4c0>
     11cb1f5:	48 8d bd 48 04 00 00 	lea    rdi,[rbp+0x448]
     11cb1fc:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
     11cb203:	00 
     11cb204:	48 89 eb             	mov    rbx,rbp
     11cb207:	e8 23 3f 97 ff       	call   b3f12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c0cf>
     11cb20c:	66 0f 57 c0          	xorpd  xmm0,xmm0
     11cb210:	66 0f 11 83 68 04 00 	movupd XMMWORD PTR [rbx+0x468],xmm0
     11cb217:	00 
     11cb218:	66 0f 11 83 58 04 00 	movupd XMMWORD PTR [rbx+0x458],xmm0
     11cb21f:	00 
     11cb220:	48 83 a3 78 04 00 00 	and    QWORD PTR [rbx+0x478],0x0
     11cb227:	00 
     11cb228:	6a 01                	push   0x1
     11cb22a:	58                   	pop    rax
     11cb22b:	48 89 83 80 04 00 00 	mov    QWORD PTR [rbx+0x480],rax
     11cb232:	48 83 a3 88 04 00 00 	and    QWORD PTR [rbx+0x488],0x0
     11cb239:	00 
     11cb23a:	48 89 83 90 04 00 00 	mov    QWORD PTR [rbx+0x490],rax
     11cb241:	48 83 a3 98 04 00 00 	and    QWORD PTR [rbx+0x498],0x0
     11cb248:	00 
     11cb249:	48 8b 83 e0 02 00 00 	mov    rax,QWORD PTR [rbx+0x2e0]
     11cb250:	45 31 f6             	xor    r14d,r14d
     11cb253:	4c 39 70 08          	cmp    QWORD PTR [rax+0x8],r14
     11cb257:	0f 95 83 a0 04 00 00 	setne  BYTE PTR [rbx+0x4a0]
     11cb25e:	83 a3 a4 04 00 00 00 	and    DWORD PTR [rbx+0x4a4],0x0
     11cb265:	4c 8b ac 24 80 0f 00 	mov    r13,QWORD PTR [rsp+0xf80]
     11cb26c:	00 
     11cb26d:	8b ac 24 78 0f 00 00 	mov    ebp,DWORD PTR [rsp+0xf78]
     11cb274:	4c 8d bb a8 04 00 00 	lea    r15,[rbx+0x4a8]
     11cb27b:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     11cb27f:	4c 89 ff             	mov    rdi,r15
     11cb282:	e8 3b 64 5f 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     11cb287:	4c 8d a3 b8 04 00 00 	lea    r12,[rbx+0x4b8]
     11cb28e:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     11cb292:	4c 89 e7             	mov    rdi,r12
     11cb295:	e8 28 64 5f 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     11cb29a:	48 8d 83 c8 04 00 00 	lea    rax,[rbx+0x4c8]
     11cb2a1:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11cb2a6:	66 0f 57 c0          	xorpd  xmm0,xmm0
     11cb2aa:	66 0f 11 83 e8 04 00 	movupd XMMWORD PTR [rbx+0x4e8],xmm0

### 0x11f2602 score=1: mov    QWORD PTR [rbp+0x3b8],rax
     11f2579:	48 89 ef             	mov    rdi,rbp
     11f257c:	e8 33 b9 a1 ff       	call   c0deb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15ae54>
     11f2581:	48 8d bd d0 01 00 00 	lea    rdi,[rbp+0x1d0]
     11f2588:	e8 c1 5f 97 ff       	call   b6854e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54ee>
     11f258d:	48 83 a5 30 03 00 00 	and    QWORD PTR [rbp+0x330],0x0
     11f2594:	00 
     11f2595:	48 8d 05 5c 5e 6a 00 	lea    rax,[rip+0x6a5e5c]        # 18983f8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5338>
     11f259c:	48 89 85 28 03 00 00 	mov    QWORD PTR [rbp+0x328],rax
     11f25a3:	66 0f ef c0          	pxor   xmm0,xmm0
     11f25a7:	f3 0f 7f 85 38 03 00 	movdqu XMMWORD PTR [rbp+0x338],xmm0
     11f25ae:	00 
     11f25af:	f3 0f 7f 85 48 03 00 	movdqu XMMWORD PTR [rbp+0x348],xmm0
     11f25b6:	00 
     11f25b7:	f3 0f 7f 85 58 03 00 	movdqu XMMWORD PTR [rbp+0x358],xmm0
     11f25be:	00 
     11f25bf:	f3 0f 7f 85 68 03 00 	movdqu XMMWORD PTR [rbp+0x368],xmm0
     11f25c6:	00 
     11f25c7:	48 83 a5 80 03 00 00 	and    QWORD PTR [rbp+0x380],0x0
     11f25ce:	00 
     11f25cf:	48 8d 05 c2 5a 6a 00 	lea    rax,[rip+0x6a5ac2]        # 1898098 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4fd8>
     11f25d6:	48 89 85 78 03 00 00 	mov    QWORD PTR [rbp+0x378],rax
     11f25dd:	f3 0f 7f 85 88 03 00 	movdqu XMMWORD PTR [rbp+0x388],xmm0
     11f25e4:	00 
     11f25e5:	f3 0f 7f 85 98 03 00 	movdqu XMMWORD PTR [rbp+0x398],xmm0
     11f25ec:	00 
     11f25ed:	48 8d 05 04 d2 24 ff 	lea    rax,[rip+0xffffffffff24d204]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     11f25f4:	48 89 85 a8 03 00 00 	mov    QWORD PTR [rbp+0x3a8],rax
     11f25fb:	48 89 85 b0 03 00 00 	mov    QWORD PTR [rbp+0x3b0],rax
     11f2602:	48 89 85 b8 03 00 00 	mov    QWORD PTR [rbp+0x3b8],rax
     11f2609:	48 83 a5 c0 03 00 00 	and    QWORD PTR [rbp+0x3c0],0x0
     11f2610:	00 
     11f2611:	48 83 a5 d0 03 00 00 	and    QWORD PTR [rbp+0x3d0],0x0
     11f2618:	00 
     11f2619:	48 8d 05 60 d5 69 00 	lea    rax,[rip+0x69d560]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     11f2620:	48 89 85 c8 03 00 00 	mov    QWORD PTR [rbp+0x3c8],rax
     11f2627:	48 89 ef             	mov    rdi,rbp
     11f262a:	48 81 c7 08 04 00 00 	add    rdi,0x408
     11f2631:	f3 0f 7f 85 d8 03 00 	movdqu XMMWORD PTR [rbp+0x3d8],xmm0
     11f2638:	00 
     11f2639:	f3 0f 7f 85 e8 03 00 	movdqu XMMWORD PTR [rbp+0x3e8],xmm0
     11f2640:	00 
     11f2641:	f3 0f 7f 85 f8 03 00 	movdqu XMMWORD PTR [rbp+0x3f8],xmm0
     11f2648:	00 
     11f2649:	e8 2a b3 ba ff       	call   d9d978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a9fe>
     11f264e:	49 89 6f 10          	mov    QWORD PTR [r15+0x10],rbp
     11f2652:	80 7c 24 40 00       	cmp    BYTE PTR [rsp+0x40],0x0
     11f2657:	74 3d                	je     11f2696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37c1a>
     11f2659:	6a 50                	push   0x50
     11f265b:	5f                   	pop    rdi
     11f265c:	e8 9f b8 5f 00       	call   17edf00 <_Znwm@plt>
     11f2661:	49 89 c6             	mov    r14,rax
     11f2664:	66 0f ef c0          	pxor   xmm0,xmm0
     11f2668:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     11f266d:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     11f2671:	c7 40 20 00 00 80 3f 	mov    DWORD PTR [rax+0x20],0x3f800000
     11f2678:	0f 28 8c 24 e0 00 00 	movaps xmm1,XMMWORD PTR [rsp+0xe0]
     11f267f:	00 
     11f2680:	0f 11 48 28          	movups XMMWORD PTR [rax+0x28],xmm1
     11f2684:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     11f268b:	00 
     11f268c:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     11f2690:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
     11f2696:	48 8b 84 24 48 06 00 	mov    rax,QWORD PTR [rsp+0x648]
     11f269d:	00 
     11f269e:	49 8d 6f 18          	lea    rbp,[r15+0x18]
     11f26a2:	4d 89 77 18          	mov    QWORD PTR [r15+0x18],r14
     11f26a6:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
     11f26ab:	66 0f ef c0          	pxor   xmm0,xmm0
     11f26af:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
     11f26b5:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f26b9:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11f26be:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f26c2:	48 8b 84 24 c0 06 00 	mov    rax,QWORD PTR [rsp+0x6c0]
     11f26c9:	00 
     11f26ca:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
     11f26ce:	4d 8d 77 50          	lea    r14,[r15+0x50]
     11f26d2:	4d 89 67 50          	mov    QWORD PTR [r15+0x50],r12

### 0x1228af8 score=1: mov    BYTE PTR [rsp+0x3b8],al
     1228a89:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
     1228a8d:	41 0f 11 4d 00       	movups XMMWORD PTR [r13+0x0],xmm1
     1228a92:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     1228a97:	41 8a 44 24 10       	mov    al,BYTE PTR [r12+0x10]
     1228a9c:	88 45 28             	mov    BYTE PTR [rbp+0x28],al
     1228a9f:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     1228aa4:	0f 11 45 18          	movups XMMWORD PTR [rbp+0x18],xmm0
     1228aa8:	48 8d bc 24 78 03 00 	lea    rdi,[rsp+0x378]
     1228aaf:	00 
     1228ab0:	48 89 de             	mov    rsi,rbx
     1228ab3:	e8 88 54 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1228ab8:	4b 8b 84 3e 78 01 00 	mov    rax,QWORD PTR [r14+r15*1+0x178]
     1228abf:	00 
     1228ac0:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
     1228ac7:	00 
     1228ac8:	43 8a 84 3e 88 01 00 	mov    al,BYTE PTR [r14+r15*1+0x188]
     1228acf:	00 
     1228ad0:	88 45 58             	mov    BYTE PTR [rbp+0x58],al
     1228ad3:	4b 8b 84 3e 80 01 00 	mov    rax,QWORD PTR [r14+r15*1+0x180]
     1228ada:	00 
     1228adb:	48 89 45 50          	mov    QWORD PTR [rbp+0x50],rax
     1228adf:	43 8a 84 3e 98 01 00 	mov    al,BYTE PTR [r14+r15*1+0x198]
     1228ae6:	00 
     1228ae7:	88 45 68             	mov    BYTE PTR [rbp+0x68],al
     1228aea:	4b 8b 84 3e 90 01 00 	mov    rax,QWORD PTR [r14+r15*1+0x190]
     1228af1:	00 
     1228af2:	48 89 45 60          	mov    QWORD PTR [rbp+0x60],rax
     1228af6:	31 c0                	xor    eax,eax
     1228af8:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     1228aff:	88 84 24 f8 04 00 00 	mov    BYTE PTR [rsp+0x4f8],al
     1228b06:	88 84 24 00 05 00 00 	mov    BYTE PTR [rsp+0x500],al
     1228b0d:	88 84 24 58 05 00 00 	mov    BYTE PTR [rsp+0x558],al
     1228b14:	f3 43 0f 10 84 3e a8 	movss  xmm0,DWORD PTR [r14+r15*1+0x2a8]
     1228b1b:	02 00 00 
     1228b1e:	f3 0f 11 84 24 60 05 	movss  DWORD PTR [rsp+0x560],xmm0
     1228b25:	00 00 
     1228b27:	43 8a 8c 3e c0 02 00 	mov    cl,BYTE PTR [r14+r15*1+0x2c0]
     1228b2e:	00 
     1228b2f:	88 8c 24 64 05 00 00 	mov    BYTE PTR [rsp+0x564],cl
     1228b36:	43 8a 8c 3e c1 02 00 	mov    cl,BYTE PTR [r14+r15*1+0x2c1]
     1228b3d:	00 
     1228b3e:	88 8c 24 65 05 00 00 	mov    BYTE PTR [rsp+0x565],cl
     1228b45:	43 8a 8c 3e c2 02 00 	mov    cl,BYTE PTR [r14+r15*1+0x2c2]
     1228b4c:	00 
     1228b4d:	88 8c 24 66 05 00 00 	mov    BYTE PTR [rsp+0x566],cl
     1228b54:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     1228b59:	8a 8a 79 06 00 00    	mov    cl,BYTE PTR [rdx+0x679]
     1228b5f:	88 8c 24 67 05 00 00 	mov    BYTE PTR [rsp+0x567],cl
     1228b66:	8a 8a 7b 06 00 00    	mov    cl,BYTE PTR [rdx+0x67b]
     1228b6c:	88 8c 24 68 05 00 00 	mov    BYTE PTR [rsp+0x568],cl
     1228b73:	88 84 24 69 05 00 00 	mov    BYTE PTR [rsp+0x569],al
     1228b7a:	4b 8b 8c 3e 80 02 00 	mov    rcx,QWORD PTR [r14+r15*1+0x280]
     1228b81:	00 
     1228b82:	4b 8b 94 3e 85 02 00 	mov    rdx,QWORD PTR [r14+r15*1+0x285]
     1228b89:	00 
     1228b8a:	48 89 95 29 02 00 00 	mov    QWORD PTR [rbp+0x229],rdx
     1228b91:	48 89 8d 24 02 00 00 	mov    QWORD PTR [rbp+0x224],rcx
     1228b98:	48 83 a5 48 02 00 00 	and    QWORD PTR [rbp+0x248],0x0
     1228b9f:	00 
     1228ba0:	0f 57 c0             	xorps  xmm0,xmm0
     1228ba3:	0f 11 85 38 02 00 00 	movups XMMWORD PTR [rbp+0x238],xmm0
     1228baa:	43 38 84 3e c6 02 00 	cmp    BYTE PTR [r14+r15*1+0x2c6],al
     1228bb1:	00 
     1228bb2:	75 26                	jne    1228bda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e15e>
     1228bb4:	66 c7 84 24 99 05 00 	mov    WORD PTR [rsp+0x599],0x1
     1228bbb:	00 01 00 
     1228bbe:	b0 01                	mov    al,0x1
     1228bc0:	88 84 24 9b 05 00 00 	mov    BYTE PTR [rsp+0x59b],al
     1228bc7:	48 c7 84 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],0xbb8
     1228bce:	00 b8 0b 00 00 
     1228bd3:	88 84 24 a8 05 00 00 	mov    BYTE PTR [rsp+0x5a8],al
     1228bda:	c6 84 24 98 05 00 00 	mov    BYTE PTR [rsp+0x598],0x0
     1228be1:	00 
     1228be2:	88 84 24 b0 05 00 00 	mov    BYTE PTR [rsp+0x5b0],al
     1228be9:	43 80 bc 3e c3 02 00 	cmp    BYTE PTR [r14+r15*1+0x2c3],0x1
     1228bf0:	00 01 
     1228bf2:	0f 94 84 24 b8 05 00 	sete   BYTE PTR [rsp+0x5b8]

### 0x1391732 score=1: mov    BYTE PTR [rsp+0x3b8],r12b
     13916c2:	44 88 a4 24 a0 02 00 	mov    BYTE PTR [rsp+0x2a0],r12b
     13916c9:	00 
     13916ca:	44 88 a4 24 a8 02 00 	mov    BYTE PTR [rsp+0x2a8],r12b
     13916d1:	00 
     13916d2:	44 88 a4 24 c8 02 00 	mov    BYTE PTR [rsp+0x2c8],r12b
     13916d9:	00 
     13916da:	44 88 a4 24 d0 02 00 	mov    BYTE PTR [rsp+0x2d0],r12b
     13916e1:	00 
     13916e2:	44 88 a4 24 f0 02 00 	mov    BYTE PTR [rsp+0x2f0],r12b
     13916e9:	00 
     13916ea:	44 88 a4 24 f8 02 00 	mov    BYTE PTR [rsp+0x2f8],r12b
     13916f1:	00 
     13916f2:	44 88 a4 24 18 03 00 	mov    BYTE PTR [rsp+0x318],r12b
     13916f9:	00 
     13916fa:	44 88 a4 24 20 03 00 	mov    BYTE PTR [rsp+0x320],r12b
     1391701:	00 
     1391702:	44 88 a4 24 40 03 00 	mov    BYTE PTR [rsp+0x340],r12b
     1391709:	00 
     139170a:	44 88 a4 24 48 03 00 	mov    BYTE PTR [rsp+0x348],r12b
     1391711:	00 
     1391712:	44 88 a4 24 68 03 00 	mov    BYTE PTR [rsp+0x368],r12b
     1391719:	00 
     139171a:	44 88 a4 24 70 03 00 	mov    BYTE PTR [rsp+0x370],r12b
     1391721:	00 
     1391722:	44 88 a4 24 90 03 00 	mov    BYTE PTR [rsp+0x390],r12b
     1391729:	00 
     139172a:	44 88 a4 24 98 03 00 	mov    BYTE PTR [rsp+0x398],r12b
     1391731:	00 
     1391732:	44 88 a4 24 b8 03 00 	mov    BYTE PTR [rsp+0x3b8],r12b
     1391739:	00 
     139173a:	44 88 a4 24 c0 03 00 	mov    BYTE PTR [rsp+0x3c0],r12b
     1391741:	00 
     1391742:	44 88 a4 24 e0 03 00 	mov    BYTE PTR [rsp+0x3e0],r12b
     1391749:	00 
     139174a:	44 88 a4 24 e8 03 00 	mov    BYTE PTR [rsp+0x3e8],r12b
     1391751:	00 
     1391752:	44 88 a4 24 08 04 00 	mov    BYTE PTR [rsp+0x408],r12b
     1391759:	00 
     139175a:	44 88 a4 24 10 04 00 	mov    BYTE PTR [rsp+0x410],r12b
     1391761:	00 
     1391762:	44 88 a4 24 30 04 00 	mov    BYTE PTR [rsp+0x430],r12b
     1391769:	00 
     139176a:	44 88 a4 24 38 04 00 	mov    BYTE PTR [rsp+0x438],r12b
     1391771:	00 
     1391772:	44 88 a4 24 58 04 00 	mov    BYTE PTR [rsp+0x458],r12b
     1391779:	00 
     139177a:	44 88 a4 24 60 04 00 	mov    BYTE PTR [rsp+0x460],r12b
     1391781:	00 
     1391782:	44 88 a4 24 80 04 00 	mov    BYTE PTR [rsp+0x480],r12b
     1391789:	00 
     139178a:	44 88 a4 24 88 04 00 	mov    BYTE PTR [rsp+0x488],r12b
     1391791:	00 
     1391792:	44 88 a4 24 a8 04 00 	mov    BYTE PTR [rsp+0x4a8],r12b
     1391799:	00 
     139179a:	44 88 a4 24 b0 04 00 	mov    BYTE PTR [rsp+0x4b0],r12b
     13917a1:	00 
     13917a2:	44 88 a4 24 d0 04 00 	mov    BYTE PTR [rsp+0x4d0],r12b
     13917a9:	00 
     13917aa:	44 88 a4 24 d8 04 00 	mov    BYTE PTR [rsp+0x4d8],r12b
     13917b1:	00 
     13917b2:	44 88 a4 24 f8 04 00 	mov    BYTE PTR [rsp+0x4f8],r12b
     13917b9:	00 
     13917ba:	44 88 a4 24 00 05 00 	mov    BYTE PTR [rsp+0x500],r12b
     13917c1:	00 
     13917c2:	44 88 a4 24 18 05 00 	mov    BYTE PTR [rsp+0x518],r12b
     13917c9:	00 
     13917ca:	31 c0                	xor    eax,eax
     13917cc:	88 84 24 20 05 00 00 	mov    BYTE PTR [rsp+0x520],al
     13917d3:	88 84 24 38 05 00 00 	mov    BYTE PTR [rsp+0x538],al
     13917da:	48 8b b3 c8 08 00 00 	mov    rsi,QWORD PTR [rbx+0x8c8]
     13917e1:	48 85 f6             	test   rsi,rsi
     13917e4:	74 1b                	je     1391801 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6d85>
     13917e6:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     13917ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13917ed:	ff 50 20             	call   QWORD PTR [rax+0x20]
     13917f0:	48 85 c0             	test   rax,rax
     13917f3:	74 0c                	je     1391801 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6d85>

### 0x1446429 score=2: mov    QWORD PTR [r12+0x3b8],r15
     14463ab:	41 0f 11 4c 24 28    	movups XMMWORD PTR [r12+0x28],xmm1
     14463b1:	41 0f 11 44 24 18    	movups XMMWORD PTR [r12+0x18],xmm0
     14463b7:	8a 84 24 e8 00 00 00 	mov    al,BYTE PTR [rsp+0xe8]
     14463be:	41 88 44 24 38       	mov    BYTE PTR [r12+0x38],al
     14463c3:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
     14463c8:	41 0f 29 44 24 40    	movaps XMMWORD PTR [r12+0x40],xmm0
     14463ce:	41 88 6c 24 50       	mov    BYTE PTR [r12+0x50],bpl
     14463d3:	31 c0                	xor    eax,eax
     14463d5:	41 88 44 24 58       	mov    BYTE PTR [r12+0x58],al
     14463da:	41 88 84 24 38 02 00 	mov    BYTE PTR [r12+0x238],al
     14463e1:	00 
     14463e2:	41 88 84 24 40 02 00 	mov    BYTE PTR [r12+0x240],al
     14463e9:	00 
     14463ea:	41 88 84 24 70 02 00 	mov    BYTE PTR [r12+0x270],al
     14463f1:	00 
     14463f2:	4d 8d ac 24 80 02 00 	lea    r13,[r12+0x280]
     14463f9:	00 
     14463fa:	4c 89 ef             	mov    rdi,r13
     14463fd:	e8 e4 6b 66 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     1446402:	49 81 c6 90 01 00 00 	add    r14,0x190
     1446409:	31 c0                	xor    eax,eax
     144640b:	41 88 84 24 40 03 00 	mov    BYTE PTR [r12+0x340],al
     1446412:	00 
     1446413:	41 88 84 24 a0 03 00 	mov    BYTE PTR [r12+0x3a0],al
     144641a:	00 
     144641b:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
     1446420:	41 0f 11 84 24 a8 03 	movups XMMWORD PTR [r12+0x3a8],xmm0
     1446427:	00 00 
     1446429:	4d 89 bc 24 b8 03 00 	mov    QWORD PTR [r12+0x3b8],r15
     1446430:	00 
     1446431:	4d 8d bc 24 c0 03 00 	lea    r15,[r12+0x3c0]
     1446438:	00 
     1446439:	4c 89 ff             	mov    rdi,r15
     144643c:	4c 89 f6             	mov    rsi,r14
     144643f:	4c 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],r13
     1446444:	e8 47 3e 63 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1446449:	4d 8d b4 24 f0 03 00 	lea    r14,[r12+0x3f0]
     1446450:	00 
     1446451:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
     1446458:	00 
     1446459:	4c 89 f7             	mov    rdi,r14
     144645c:	e8 97 2d 74 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
     1446461:	49 89 9c 24 20 04 00 	mov    QWORD PTR [r12+0x420],rbx
     1446468:	00 
     1446469:	31 c0                	xor    eax,eax
     144646b:	41 88 84 24 28 04 00 	mov    BYTE PTR [r12+0x428],al
     1446472:	00 
     1446473:	41 88 84 24 b8 04 00 	mov    BYTE PTR [r12+0x4b8],al
     144647a:	00 
     144647b:	48 8d 8c 24 80 05 00 	lea    rcx,[rsp+0x580]
     1446482:	00 
     1446483:	c7 41 f0 01 00 00 00 	mov    DWORD PTR [rcx-0x10],0x1
     144648a:	48 8d 05 d7 b5 42 00 	lea    rax,[rip+0x42b5d7]        # 1871a68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e150>
     1446491:	48 89 01             	mov    QWORD PTR [rcx],rax
     1446494:	4c 89 61 08          	mov    QWORD PTR [rcx+0x8],r12
     1446498:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     144649c:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
     14464a3:	00 
     14464a4:	48 8d 94 24 70 05 00 	lea    rdx,[rsp+0x570]
     14464ab:	00 
     14464ac:	31 f6                	xor    esi,esi
     14464ae:	4c 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],r15
     14464b3:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
     14464b8:	e8 b1 1c 00 00       	call   144816e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28d6f2>
     14464bd:	48 8d 9c 24 00 06 00 	lea    rbx,[rsp+0x600]
     14464c4:	00 
     14464c5:	48 8d 8c 24 40 05 00 	lea    rcx,[rsp+0x540]
     14464cc:	00 
     14464cd:	83 61 f0 00          	and    DWORD PTR [rcx-0x10],0x0
     14464d1:	48 8d 05 d8 b5 42 00 	lea    rax,[rip+0x42b5d8]        # 1871ab0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e198>
     14464d8:	48 89 01             	mov    QWORD PTR [rcx],rax
     14464db:	4c 89 61 08          	mov    QWORD PTR [rcx+0x8],r12
     14464df:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     14464e3:	48 be 00 00 00 00 01 	movabs rsi,0x100000000
     14464ea:	00 00 00 
     14464ed:	48 8d 94 24 30 05 00 	lea    rdx,[rsp+0x530]
     14464f4:	00 

### 0x1475492 score=1: mov    DWORD PTR [rsp+0x3b8],ebp
     1475422:	5e                   	pop    rsi
     1475423:	e8 22 28 00 00       	call   1477c4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bd1ce>
     1475428:	84 c0                	test   al,al
     147542a:	0f 85 ba 01 00 00    	jne    14755ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bab6e>
     1475430:	48 83 a4 24 70 03 00 	and    QWORD PTR [rsp+0x370],0x0
     1475437:	00 00 
     1475439:	0f 57 c0             	xorps  xmm0,xmm0
     147543c:	0f 29 84 24 60 03 00 	movaps XMMWORD PTR [rsp+0x360],xmm0
     1475443:	00 
     1475444:	6a 64                	push   0x64
     1475446:	5d                   	pop    rbp
     1475447:	89 ac 24 78 03 00 00 	mov    DWORD PTR [rsp+0x378],ebp
     147544e:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     1475453:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1475456:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
     147545c:	48 f7 d8             	neg    rax
     147545f:	48 89 84 24 80 03 00 	mov    QWORD PTR [rsp+0x380],rax
     1475466:	00 
     1475467:	31 c9                	xor    ecx,ecx
     1475469:	88 8c 24 88 03 00 00 	mov    BYTE PTR [rsp+0x388],cl
     1475470:	88 8c 24 90 03 00 00 	mov    BYTE PTR [rsp+0x390],cl
     1475477:	c6 84 24 98 03 00 00 	mov    BYTE PTR [rsp+0x398],0x2
     147547e:	02 
     147547f:	48 8d 84 24 a0 03 00 	lea    rax,[rsp+0x3a0]
     1475486:	00 
     1475487:	0f 57 c0             	xorps  xmm0,xmm0
     147548a:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     147548d:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     1475492:	89 ac 24 b8 03 00 00 	mov    DWORD PTR [rsp+0x3b8],ebp
     1475499:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     147549e:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
     14754a5:	00 
     14754a6:	88 8c 24 c8 03 00 00 	mov    BYTE PTR [rsp+0x3c8],cl
     14754ad:	88 8c 24 d0 03 00 00 	mov    BYTE PTR [rsp+0x3d0],cl
     14754b4:	c6 84 24 d8 03 00 00 	mov    BYTE PTR [rsp+0x3d8],0x3
     14754bb:	03 
     14754bc:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
     14754c3:	00 
     14754c4:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
     14754cb:	00 
     14754cc:	6a 02                	push   0x2
     14754ce:	5a                   	pop    rdx
     14754cf:	e8 16 0c 00 00       	call   14760ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb66e>
     14754d4:	48 8b 94 24 10 07 00 	mov    rdx,QWORD PTR [rsp+0x710]
     14754db:	00 
     14754dc:	48 8b 8c 24 18 07 00 	mov    rcx,QWORD PTR [rsp+0x718]
     14754e3:	00 
     14754e4:	48 29 d1             	sub    rcx,rdx
     14754e7:	48 c1 f9 06          	sar    rcx,0x6
     14754eb:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     14754ef:	48 89 de             	mov    rsi,rbx
     14754f2:	e8 f1 34 0e 00       	call   15589e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39df6c>
     14754f7:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
     14754fe:	00 
     14754ff:	e8 16 f0 da ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     1475504:	6a 40                	push   0x40
     1475506:	5b                   	pop    rbx
     1475507:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
     147550b:	48 81 c7 60 03 00 00 	add    rdi,0x360
     1475512:	e8 79 89 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1475517:	48 83 c3 c0          	add    rbx,0xffffffffffffffc0
     147551b:	48 83 fb c0          	cmp    rbx,0xffffffffffffffc0
     147551f:	75 e6                	jne    1475507 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2baa8b>
     1475521:	e9 c4 00 00 00       	jmp    14755ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bab6e>
     1475526:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     147552b:	80 78 10 00          	cmp    BYTE PTR [rax+0x10],0x0
     147552f:	0f 84 b5 00 00 00    	je     14755ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bab6e>
     1475535:	4c 89 f7             	mov    rdi,r14
     1475538:	6a 04                	push   0x4
     147553a:	5e                   	pop    rsi
     147553b:	e8 0a 27 00 00       	call   1477c4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bd1ce>
     1475540:	84 c0                	test   al,al
     1475542:	0f 85 a2 00 00 00    	jne    14755ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bab6e>
     1475548:	0f 57 c0             	xorps  xmm0,xmm0
     147554b:	0f 29 84 24 60 03 00 	movaps XMMWORD PTR [rsp+0x360],xmm0
     1475552:	00 
     1475553:	48 83 a4 24 70 03 00 	and    QWORD PTR [rsp+0x370],0x0

### 0x1518f1f score=1: cmp    BYTE PTR [rsp+0x3b8],0x0
     1518ea6:	00 
     1518ea7:	4c 89 e6             	mov    rsi,r12
     1518eaa:	e8 8b 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518eaf:	80 bb 98 02 00 00 00 	cmp    BYTE PTR [rbx+0x298],0x0
     1518eb6:	74 1f                	je     1518ed7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e45b>
     1518eb8:	4c 8d a3 80 02 00 00 	lea    r12,[rbx+0x280]
     1518ebf:	4c 89 e7             	mov    rdi,r12
     1518ec2:	e8 8b cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518ec7:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]
     1518ece:	00 
     1518ecf:	4c 89 e6             	mov    rsi,r12
     1518ed2:	e8 63 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518ed7:	80 bb b8 02 00 00 00 	cmp    BYTE PTR [rbx+0x2b8],0x0
     1518ede:	74 1f                	je     1518eff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e483>
     1518ee0:	4c 8d a3 a0 02 00 00 	lea    r12,[rbx+0x2a0]
     1518ee7:	4c 89 e7             	mov    rdi,r12
     1518eea:	e8 63 cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518eef:	48 8d bc 24 88 03 00 	lea    rdi,[rsp+0x388]
     1518ef6:	00 
     1518ef7:	4c 89 e6             	mov    rsi,r12
     1518efa:	e8 3b 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518eff:	4c 8d b4 24 a8 03 00 	lea    r14,[rsp+0x3a8]
     1518f06:	00 
     1518f07:	80 bb d0 02 00 00 00 	cmp    BYTE PTR [rbx+0x2d0],0x0
     1518f0e:	74 2a                	je     1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f10:	4c 8d a3 c0 02 00 00 	lea    r12,[rbx+0x2c0]
     1518f17:	4c 89 e7             	mov    rdi,r12
     1518f1a:	e8 87 d6 65 ff       	call   b765a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc3546>
     1518f1f:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     1518f26:	00 
     1518f27:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     1518f2c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1518f30:	75 08                	jne    1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f32:	c6 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],0x1
     1518f39:	01 
     1518f3a:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1518f3f:	48 8d b0 78 13 00 00 	lea    rsi,[rax+0x1378]
     1518f46:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
     1518f4d:	00 
     1518f4e:	e8 75 25 01 00       	call   152b4c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370a4c>
     1518f53:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
     1518f58:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1518f5d:	89 84 24 bc 03 00 00 	mov    DWORD PTR [rsp+0x3bc],eax
     1518f64:	48 c1 e8 20          	shr    rax,0x20
     1518f68:	88 84 24 c0 03 00 00 	mov    BYTE PTR [rsp+0x3c0],al
     1518f6f:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     1518f74:	41 80 7f 40 00       	cmp    BYTE PTR [r15+0x40],0x0
     1518f79:	0f 85 80 06 00 00    	jne    15195ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35eb83>
     1518f7f:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
     1518f86:	00 
     1518f87:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1518f8e:	00 
     1518f8f:	e8 91 34 01 00       	call   152c425 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3719a9>
     1518f94:	49 8d bf f8 06 00 00 	lea    rdi,[r15+0x6f8]
     1518f9b:	4c 8d a4 24 80 04 00 	lea    r12,[rsp+0x480]
     1518fa2:	00 
     1518fa3:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     1518fa8:	4c 89 e6             	mov    rsi,r12
     1518fab:	e8 7e 2a 56 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1518fb0:	4c 89 e7             	mov    rdi,r12
     1518fb3:	e8 d8 4e 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1518fb8:	41 83 a7 10 07 00 00 	and    DWORD PTR [r15+0x710],0x0
     1518fbf:	00 
     1518fc0:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
     1518fc7:	00 f0 3f 
     1518fca:	49 89 87 18 07 00 00 	mov    QWORD PTR [r15+0x718],rax
     1518fd1:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     1518fd5:	41 0f 11 87 4c 07 00 	movups XMMWORD PTR [r15+0x74c],xmm0
     1518fdc:	00 
     1518fdd:	41 8a 46 10          	mov    al,BYTE PTR [r14+0x10]
     1518fe1:	41 88 87 5c 07 00 00 	mov    BYTE PTR [r15+0x75c],al
     1518fe8:	44 8a b4 24 b2 02 00 	mov    r14b,BYTE PTR [rsp+0x2b2]
     1518fef:	00 
     1518ff0:	48 8b b4 24 b4 02 00 	mov    rsi,QWORD PTR [rsp+0x2b4]
     1518ff7:	00 
     1518ff8:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1518fff:	00 

### 0x1518f32 score=1: mov    BYTE PTR [rsp+0x3b8],0x1
     1518eb8:	4c 8d a3 80 02 00 00 	lea    r12,[rbx+0x280]
     1518ebf:	4c 89 e7             	mov    rdi,r12
     1518ec2:	e8 8b cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518ec7:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]
     1518ece:	00 
     1518ecf:	4c 89 e6             	mov    rsi,r12
     1518ed2:	e8 63 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518ed7:	80 bb b8 02 00 00 00 	cmp    BYTE PTR [rbx+0x2b8],0x0
     1518ede:	74 1f                	je     1518eff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e483>
     1518ee0:	4c 8d a3 a0 02 00 00 	lea    r12,[rbx+0x2a0]
     1518ee7:	4c 89 e7             	mov    rdi,r12
     1518eea:	e8 63 cc 62 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1518eef:	48 8d bc 24 88 03 00 	lea    rdi,[rsp+0x388]
     1518ef6:	00 
     1518ef7:	4c 89 e6             	mov    rsi,r12
     1518efa:	e8 3b 94 5e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1518eff:	4c 8d b4 24 a8 03 00 	lea    r14,[rsp+0x3a8]
     1518f06:	00 
     1518f07:	80 bb d0 02 00 00 00 	cmp    BYTE PTR [rbx+0x2d0],0x0
     1518f0e:	74 2a                	je     1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f10:	4c 8d a3 c0 02 00 00 	lea    r12,[rbx+0x2c0]
     1518f17:	4c 89 e7             	mov    rdi,r12
     1518f1a:	e8 87 d6 65 ff       	call   b765a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc3546>
     1518f1f:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     1518f26:	00 
     1518f27:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     1518f2c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1518f30:	75 08                	jne    1518f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4be>
     1518f32:	c6 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],0x1
     1518f39:	01 
     1518f3a:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1518f3f:	48 8d b0 78 13 00 00 	lea    rsi,[rax+0x1378]
     1518f46:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
     1518f4d:	00 
     1518f4e:	e8 75 25 01 00       	call   152b4c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370a4c>
     1518f53:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
     1518f58:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1518f5d:	89 84 24 bc 03 00 00 	mov    DWORD PTR [rsp+0x3bc],eax
     1518f64:	48 c1 e8 20          	shr    rax,0x20
     1518f68:	88 84 24 c0 03 00 00 	mov    BYTE PTR [rsp+0x3c0],al
     1518f6f:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
     1518f74:	41 80 7f 40 00       	cmp    BYTE PTR [r15+0x40],0x0
     1518f79:	0f 85 80 06 00 00    	jne    15195ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35eb83>
     1518f7f:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
     1518f86:	00 
     1518f87:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     1518f8e:	00 
     1518f8f:	e8 91 34 01 00       	call   152c425 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3719a9>
     1518f94:	49 8d bf f8 06 00 00 	lea    rdi,[r15+0x6f8]
     1518f9b:	4c 8d a4 24 80 04 00 	lea    r12,[rsp+0x480]
     1518fa2:	00 
     1518fa3:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     1518fa8:	4c 89 e6             	mov    rsi,r12
     1518fab:	e8 7e 2a 56 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1518fb0:	4c 89 e7             	mov    rdi,r12
     1518fb3:	e8 d8 4e 2d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1518fb8:	41 83 a7 10 07 00 00 	and    DWORD PTR [r15+0x710],0x0
     1518fbf:	00 
     1518fc0:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
     1518fc7:	00 f0 3f 
     1518fca:	49 89 87 18 07 00 00 	mov    QWORD PTR [r15+0x718],rax
     1518fd1:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     1518fd5:	41 0f 11 87 4c 07 00 	movups XMMWORD PTR [r15+0x74c],xmm0
     1518fdc:	00 
     1518fdd:	41 8a 46 10          	mov    al,BYTE PTR [r14+0x10]
     1518fe1:	41 88 87 5c 07 00 00 	mov    BYTE PTR [r15+0x75c],al
     1518fe8:	44 8a b4 24 b2 02 00 	mov    r14b,BYTE PTR [rsp+0x2b2]
     1518fef:	00 
     1518ff0:	48 8b b4 24 b4 02 00 	mov    rsi,QWORD PTR [rsp+0x2b4]
     1518ff7:	00 
     1518ff8:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1518fff:	00 
     1519000:	e8 ed 2d 01 00       	call   152bdf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371376>
     1519005:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     151900c:	00 
     151900d:	48 8d 8c 24 80 04 00 	lea    rcx,[rsp+0x480]
     1519014:	00 

### 0x15230d0 score=3: mov    QWORD PTR [rbx+0x3b8],rax
     152303d:	48 89 83 80 03 00 00 	mov    QWORD PTR [rbx+0x380],rax
     1523044:	49 8b be 88 03 00 00 	mov    rdi,QWORD PTR [r14+0x388]
     152304b:	31 f6                	xor    esi,esi
     152304d:	e8 b4 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523052:	48 89 83 88 03 00 00 	mov    QWORD PTR [rbx+0x388],rax
     1523059:	49 8b be 90 03 00 00 	mov    rdi,QWORD PTR [r14+0x390]
     1523060:	31 f6                	xor    esi,esi
     1523062:	e8 9f 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523067:	48 89 83 90 03 00 00 	mov    QWORD PTR [rbx+0x390],rax
     152306e:	49 8b be 98 03 00 00 	mov    rdi,QWORD PTR [r14+0x398]
     1523075:	31 f6                	xor    esi,esi
     1523077:	e8 8a 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152307c:	48 89 83 98 03 00 00 	mov    QWORD PTR [rbx+0x398],rax
     1523083:	49 8b be a0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3a0]
     152308a:	31 f6                	xor    esi,esi
     152308c:	e8 75 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523091:	48 89 83 a0 03 00 00 	mov    QWORD PTR [rbx+0x3a0],rax
     1523098:	49 8b be a8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3a8]
     152309f:	31 f6                	xor    esi,esi
     15230a1:	e8 60 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230a6:	48 89 83 a8 03 00 00 	mov    QWORD PTR [rbx+0x3a8],rax
     15230ad:	49 8b be b0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3b0]
     15230b4:	31 f6                	xor    esi,esi
     15230b6:	e8 4b 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230bb:	48 89 83 b0 03 00 00 	mov    QWORD PTR [rbx+0x3b0],rax
     15230c2:	49 8b be b8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3b8]
     15230c9:	31 f6                	xor    esi,esi
     15230cb:	e8 36 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230d0:	48 89 83 b8 03 00 00 	mov    QWORD PTR [rbx+0x3b8],rax
     15230d7:	49 8b be c0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3c0]
     15230de:	31 f6                	xor    esi,esi
     15230e0:	e8 21 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230e5:	48 89 83 c0 03 00 00 	mov    QWORD PTR [rbx+0x3c0],rax
     15230ec:	49 8b be c8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3c8]
     15230f3:	31 f6                	xor    esi,esi
     15230f5:	e8 0c 7c 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15230fa:	48 89 83 c8 03 00 00 	mov    QWORD PTR [rbx+0x3c8],rax
     1523101:	49 8b be d0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3d0]
     1523108:	31 f6                	xor    esi,esi
     152310a:	e8 f7 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152310f:	48 89 83 d0 03 00 00 	mov    QWORD PTR [rbx+0x3d0],rax
     1523116:	49 8b be d8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3d8]
     152311d:	31 f6                	xor    esi,esi
     152311f:	e8 e2 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523124:	48 89 83 d8 03 00 00 	mov    QWORD PTR [rbx+0x3d8],rax
     152312b:	49 8b be e0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3e0]
     1523132:	31 f6                	xor    esi,esi
     1523134:	e8 cd 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523139:	48 89 83 e0 03 00 00 	mov    QWORD PTR [rbx+0x3e0],rax
     1523140:	49 8b be e8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3e8]
     1523147:	31 f6                	xor    esi,esi
     1523149:	e8 b8 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152314e:	48 89 83 e8 03 00 00 	mov    QWORD PTR [rbx+0x3e8],rax
     1523155:	49 8b be f0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3f0]
     152315c:	31 f6                	xor    esi,esi
     152315e:	e8 a3 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523163:	48 89 83 f0 03 00 00 	mov    QWORD PTR [rbx+0x3f0],rax
     152316a:	49 8b be 20 04 00 00 	mov    rdi,QWORD PTR [r14+0x420]
     1523171:	31 f6                	xor    esi,esi
     1523173:	e8 8e 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523178:	48 89 83 20 04 00 00 	mov    QWORD PTR [rbx+0x420],rax
     152317f:	49 8b be 28 04 00 00 	mov    rdi,QWORD PTR [r14+0x428]
     1523186:	31 f6                	xor    esi,esi
     1523188:	e8 79 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152318d:	48 89 83 28 04 00 00 	mov    QWORD PTR [rbx+0x428],rax
     1523194:	49 8b be 30 04 00 00 	mov    rdi,QWORD PTR [r14+0x430]
     152319b:	31 f6                	xor    esi,esi
     152319d:	e8 64 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231a2:	48 89 83 30 04 00 00 	mov    QWORD PTR [rbx+0x430],rax
     15231a9:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     15231b0:	31 f6                	xor    esi,esi
     15231b2:	e8 4f 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231b7:	48 89 83 38 04 00 00 	mov    QWORD PTR [rbx+0x438],rax
     15231be:	49 8b be 40 04 00 00 	mov    rdi,QWORD PTR [r14+0x440]
     15231c5:	31 f6                	xor    esi,esi
     15231c7:	e8 3a 7b 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15231cc:	48 89 83 40 04 00 00 	mov    QWORD PTR [rbx+0x440],rax

### 0x152863f score=2: cmp    BYTE PTR [rbx+0x3b8],0x0
     15285b1:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
     15285b8:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     15285bc:	f6 c2 01             	test   dl,0x1
     15285bf:	0f 85 2b 03 00 00    	jne    15288f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36de74>
     15285c5:	e8 c8 d1 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15285ca:	80 4b 11 04          	or     BYTE PTR [rbx+0x11],0x4
     15285ce:	48 8d b3 80 03 00 00 	lea    rsi,[rbx+0x380]
     15285d5:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
     15285dc:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     15285e0:	f6 c2 01             	test   dl,0x1
     15285e3:	0f 85 13 03 00 00    	jne    15288fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36de80>
     15285e9:	e8 a4 d1 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15285ee:	80 bb 9c 03 00 00 00 	cmp    BYTE PTR [rbx+0x39c],0x0
     15285f5:	74 48                	je     152863f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dbc3>
     15285f7:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
     15285fe:	e8 5f d5 61 ff       	call   b45b62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b02>
     1528603:	8b b3 98 03 00 00    	mov    esi,DWORD PTR [rbx+0x398]
     1528609:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     152860e:	e8 cf 36 00 00       	call   152bce2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371266>
     1528613:	80 4b 14 04          	or     BYTE PTR [rbx+0x14],0x4
     1528617:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
     152861e:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1528622:	f6 c2 01             	test   dl,0x1
     1528625:	0f 85 f5 02 00 00    	jne    1528920 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dea4>
     152862b:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
     1528630:	e8 b1 d1 23 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     1528635:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     152863a:	e8 51 58 2c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     152863f:	80 bb b8 03 00 00 00 	cmp    BYTE PTR [rbx+0x3b8],0x0
     1528646:	74 2f                	je     1528677 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dbfb>
     1528648:	4c 8d b3 a0 03 00 00 	lea    r14,[rbx+0x3a0]
     152864f:	4c 89 f7             	mov    rdi,r14
     1528652:	e8 fb d4 61 ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1528657:	80 4b 14 08          	or     BYTE PTR [rbx+0x14],0x8
     152865b:	48 8d bb 60 01 00 00 	lea    rdi,[rbx+0x160]
     1528662:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1528666:	f6 c2 01             	test   dl,0x1
     1528669:	0f 85 bd 02 00 00    	jne    152892c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36deb0>
     152866f:	4c 89 f6             	mov    rsi,r14
     1528672:	e8 1b d1 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1528677:	80 bb f8 03 00 00 00 	cmp    BYTE PTR [rbx+0x3f8],0x0
     152867e:	74 24                	je     15286a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dc28>
     1528680:	80 4b 14 10          	or     BYTE PTR [rbx+0x14],0x10
     1528684:	48 8d b3 e0 03 00 00 	lea    rsi,[rbx+0x3e0]
     152868b:	48 8d bb 68 01 00 00 	lea    rdi,[rbx+0x168]
     1528692:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1528696:	f6 c2 01             	test   dl,0x1
     1528699:	0f 85 99 02 00 00    	jne    1528938 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36debc>
     152869f:	e8 ee d0 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15286a4:	80 bb 18 04 00 00 00 	cmp    BYTE PTR [rbx+0x418],0x0
     15286ab:	74 24                	je     15286d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dc55>
     15286ad:	80 4b 14 20          	or     BYTE PTR [rbx+0x14],0x20
     15286b1:	48 8d b3 00 04 00 00 	lea    rsi,[rbx+0x400]
     15286b8:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
     15286bf:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     15286c3:	f6 c2 01             	test   dl,0x1
     15286c6:	0f 85 78 02 00 00    	jne    1528944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dec8>
     15286cc:	e8 c1 d0 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15286d1:	80 bb 38 04 00 00 00 	cmp    BYTE PTR [rbx+0x438],0x0
     15286d8:	74 24                	je     15286fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dc82>
     15286da:	80 4b 14 40          	or     BYTE PTR [rbx+0x14],0x40
     15286de:	48 8d b3 20 04 00 00 	lea    rsi,[rbx+0x420]
     15286e5:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
     15286ec:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     15286f0:	f6 c2 01             	test   dl,0x1
     15286f3:	0f 85 57 02 00 00    	jne    1528950 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ded4>
     15286f9:	e8 94 d0 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15286fe:	80 bb 58 04 00 00 00 	cmp    BYTE PTR [rbx+0x458],0x0
     1528705:	74 24                	je     152872b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dcaf>
     1528707:	80 4b 14 80          	or     BYTE PTR [rbx+0x14],0x80
     152870b:	48 8d b3 40 04 00 00 	lea    rsi,[rbx+0x440]
     1528712:	48 8d bb 80 01 00 00 	lea    rdi,[rbx+0x180]
     1528719:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     152871d:	f6 c2 01             	test   dl,0x1
     1528720:	0f 85 36 02 00 00    	jne    152895c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36dee0>
     1528726:	e8 67 d0 23 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     152872b:	80 bb 78 04 00 00 00 	cmp    BYTE PTR [rbx+0x478],0x0

### 0x1540dd0 score=1: movups XMMWORD PTR [rsp+0x3b8],xmm1
     1540d5f:	48 8b bc 24 80 03 00 	mov    rdi,QWORD PTR [rsp+0x380]
     1540d66:	00 
     1540d67:	e8 ab 50 00 00       	call   1545e17 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b39b>
     1540d6c:	88 84 24 30 0b 00 00 	mov    BYTE PTR [rsp+0xb30],al
     1540d73:	80 bc 24 d8 03 00 00 	cmp    BYTE PTR [rsp+0x3d8],0x0
     1540d7a:	00 
     1540d7b:	74 17                	je     1540d94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x386318>
     1540d7d:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1540d84:	00 
     1540d85:	48 8d b4 24 00 0b 00 	lea    rsi,[rsp+0xb00]
     1540d8c:	00 
     1540d8d:	e8 9c 50 00 00       	call   1545e2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b3b2>
     1540d92:	eb 6c                	jmp    1540e00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x386384>
     1540d94:	0f 28 84 24 00 0b 00 	movaps xmm0,XMMWORD PTR [rsp+0xb00]
     1540d9b:	00 
     1540d9c:	0f 29 84 24 a0 03 00 	movaps XMMWORD PTR [rsp+0x3a0],xmm0
     1540da3:	00 
     1540da4:	48 8b 8c 24 10 0b 00 	mov    rcx,QWORD PTR [rsp+0xb10]
     1540dab:	00 
     1540dac:	48 89 8c 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rcx
     1540db3:	00 
     1540db4:	48 83 a4 24 10 0b 00 	and    QWORD PTR [rsp+0xb10],0x0
     1540dbb:	00 00 
     1540dbd:	0f 57 c0             	xorps  xmm0,xmm0
     1540dc0:	0f 29 84 24 00 0b 00 	movaps XMMWORD PTR [rsp+0xb00],xmm0
     1540dc7:	00 
     1540dc8:	0f 10 8c 24 18 0b 00 	movups xmm1,XMMWORD PTR [rsp+0xb18]
     1540dcf:	00 
     1540dd0:	0f 11 8c 24 b8 03 00 	movups XMMWORD PTR [rsp+0x3b8],xmm1
     1540dd7:	00 
     1540dd8:	48 8b 8c 24 28 0b 00 	mov    rcx,QWORD PTR [rsp+0xb28]
     1540ddf:	00 
     1540de0:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     1540de5:	48 89 8c 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],rcx
     1540dec:	00 
     1540ded:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1540df1:	88 84 24 d0 03 00 00 	mov    BYTE PTR [rsp+0x3d0],al
     1540df8:	c6 84 24 d8 03 00 00 	mov    BYTE PTR [rsp+0x3d8],0x1
     1540dff:	01 
     1540e00:	48 8d bc 24 00 0b 00 	lea    rdi,[rsp+0xb00]
     1540e07:	00 
     1540e08:	e8 e9 9a 78 ff       	call   cca8f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x217896>
     1540e0d:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
     1540e14:	00 
     1540e15:	e8 ee 99 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1540e1a:	48 8d bc 24 e0 0a 00 	lea    rdi,[rsp+0xae0]
     1540e21:	00 
     1540e22:	e8 e1 99 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1540e27:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
     1540e2e:	00 
     1540e2f:	e8 38 4f 00 00       	call   1545d6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b2f0>
     1540e34:	48 8d b4 24 a0 02 00 	lea    rsi,[rsp+0x2a0]
     1540e3b:	00 
     1540e3c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1540e41:	e8 48 45 00 00       	call   154538e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38a912>
     1540e46:	84 c0                	test   al,al
     1540e48:	0f 84 92 01 00 00    	je     1540fe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x386564>
     1540e4e:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
     1540e55:	00 
     1540e56:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     1540e5d:	00 
     1540e5e:	48 8d 94 24 a0 02 00 	lea    rdx,[rsp+0x2a0]
     1540e65:	00 
     1540e66:	e8 41 46 00 00       	call   15454ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38aa30>
     1540e6b:	80 bc 24 98 03 00 00 	cmp    BYTE PTR [rsp+0x398],0x0
     1540e72:	00 
     1540e73:	0f 84 5a 01 00 00    	je     1540fd3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x386557>
     1540e79:	48 8b b4 24 80 03 00 	mov    rsi,QWORD PTR [rsp+0x380]
     1540e80:	00 
     1540e81:	48 8d bc 24 e0 0a 00 	lea    rdi,[rsp+0xae0]
     1540e88:	00 
     1540e89:	31 d2                	xor    edx,edx
     1540e8b:	e8 24 4f 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     1540e90:	0f 28 84 24 e0 0a 00 	movaps xmm0,XMMWORD PTR [rsp+0xae0]
     1540e97:	00 
     1540e98:	0f 29 84 24 00 0b 00 	movaps XMMWORD PTR [rsp+0xb00],xmm0
     1540e9f:	00 

### 0x1541bae score=1: cmp    BYTE PTR [rsp+0x3b8],0x0
     1541b3b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1541b3f:	0f 57 c0             	xorps  xmm0,xmm0
     1541b42:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     1541b45:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     1541b4a:	48 8d bc 24 00 0b 00 	lea    rdi,[rsp+0xb00]
     1541b51:	00 
     1541b52:	4c 89 f6             	mov    rsi,r14
     1541b55:	e8 5e 9a f3 ff       	call   147b5b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0b3c>
     1541b5a:	4c 89 f7             	mov    rdi,r14
     1541b5d:	e8 a6 8c 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1541b62:	48 89 df             	mov    rdi,rbx
     1541b65:	e8 9e 8c 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1541b6a:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1541b71:	00 
     1541b72:	e8 f5 41 00 00       	call   1545d6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b2f0>
     1541b77:	48 8d b4 24 00 03 00 	lea    rsi,[rsp+0x300]
     1541b7e:	00 
     1541b7f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1541b84:	e8 05 38 00 00       	call   154538e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38a912>
     1541b89:	84 c0                	test   al,al
     1541b8b:	0f 84 90 00 00 00    	je     1541c21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3871a5>
     1541b91:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1541b98:	00 
     1541b99:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     1541ba0:	00 
     1541ba1:	48 8d 94 24 00 03 00 	lea    rdx,[rsp+0x300]
     1541ba8:	00 
     1541ba9:	e8 fe 38 00 00       	call   15454ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38aa30>
     1541bae:	80 bc 24 b8 03 00 00 	cmp    BYTE PTR [rsp+0x3b8],0x0
     1541bb5:	00 
     1541bb6:	74 5c                	je     1541c14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x387198>
     1541bb8:	48 8b b4 24 a0 03 00 	mov    rsi,QWORD PTR [rsp+0x3a0]
     1541bbf:	00 
     1541bc0:	48 8d bc 24 e0 0a 00 	lea    rdi,[rsp+0xae0]
     1541bc7:	00 
     1541bc8:	31 d2                	xor    edx,edx
     1541bca:	e8 e5 41 00 00       	call   1545db4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b338>
     1541bcf:	48 8d 9c 24 e0 0a 00 	lea    rbx,[rsp+0xae0]
     1541bd6:	00 
     1541bd7:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
     1541bda:	4c 8d b4 24 80 03 00 	lea    r14,[rsp+0x380]
     1541be1:	00 
     1541be2:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1541be6:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     1541bea:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1541bee:	0f 57 c0             	xorps  xmm0,xmm0
     1541bf1:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     1541bf4:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     1541bf9:	4c 89 ff             	mov    rdi,r15
     1541bfc:	4c 89 f6             	mov    rsi,r14
     1541bff:	e8 b4 99 f3 ff       	call   147b5b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0b3c>
     1541c04:	4c 89 f7             	mov    rdi,r14
     1541c07:	e8 fc 8b 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1541c0c:	48 89 df             	mov    rdi,rbx
     1541c0f:	e8 f4 8b 78 ff       	call   cca808 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2177a8>
     1541c14:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     1541c1b:	00 
     1541c1c:	e8 4b 41 00 00       	call   1545d6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b2f0>
     1541c21:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
     1541c28:	00 
     1541c29:	e8 4a 41 00 00       	call   1545d78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b2fc>
     1541c2e:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
     1541c35:	00 
     1541c36:	e8 3d 41 00 00       	call   1545d78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38b2fc>
     1541c3b:	48 8d bd 60 04 00 00 	lea    rdi,[rbp+0x460]
     1541c42:	8a 85 78 04 00 00    	mov    al,BYTE PTR [rbp+0x478]
     1541c48:	3a 84 24 18 0b 00 00 	cmp    al,BYTE PTR [rsp+0xb18]
     1541c4f:	75 13                	jne    1541c64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3871e8>
     1541c51:	84 c0                	test   al,al
     1541c53:	74 53                	je     1541ca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38722c>
     1541c55:	48 8d b4 24 00 0b 00 	lea    rsi,[rsp+0xb00]
     1541c5c:	00 
     1541c5d:	e8 70 9b f3 ff       	call   147b7d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c0d56>
     1541c62:	eb 44                	jmp    1541ca8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38722c>
     1541c64:	84 c0                	test   al,al
     1541c66:	74 07                	je     1541c6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3871f3>
     1541c68:	e8 77 9c 79 ff       	call   cdb8e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x228884>

## Vptr-looking constants near e92f callers
- call 0xe91e06: 0xe91c9b -> 0x1831e38 :: lea    rcx,[rip+0x9a0196]        # 1831e38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3dd0>
