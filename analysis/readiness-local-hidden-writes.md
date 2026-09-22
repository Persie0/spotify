# Readiness local hidden-write resolver

Linear stack-alias pass over FDE e8fad0..e92c49. Hits are candidate concrete writes to fields of the rsp+0x260 object through direct stack operands or register aliases.

## 0xe8feee: provider +0x3b8 (rsp+0x618)
- instruction: mov    QWORD PTR [rbx+0x38],rax
- resolved alias: rbx=rsp+0x5e0, displacement=+0x38
  e8fea7:	48 8b 30             	mov    rsi,QWORD PTR [rax]
  e8feaa:	48 89 df             	mov    rdi,rbx
  e8fead:	e8 f4 99 75 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
  e8feb2:	4c 89 73 10          	mov    QWORD PTR [rbx+0x10],r14
  e8feb6:	48 8b 84 24 08 0b 00 	mov    rax,QWORD PTR [rsp+0xb08]
  e8febd:	00 
  e8febe:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  e8fec2:	48 8b 84 24 10 0b 00 	mov    rax,QWORD PTR [rsp+0xb10]
  e8fec9:	00 
  e8feca:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  e8fece:	48 8b 84 24 58 0b 00 	mov    rax,QWORD PTR [rsp+0xb58]
  e8fed5:	00 
  e8fed6:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
  e8feda:	48 8b 84 24 60 0b 00 	mov    rax,QWORD PTR [rsp+0xb60]
  e8fee1:	00 
  e8fee2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
  e8fee6:	48 8b 84 24 68 0b 00 	mov    rax,QWORD PTR [rsp+0xb68]
  e8feed:	00 
  e8feee:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
  e8fef2:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
  e8fef6:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
  e8fefa:	0f 29 43 40          	movaps XMMWORD PTR [rbx+0x40],xmm0
  e8fefe:	48 85 c0             	test   rax,rax
  e8ff01:	74 05                	je     e8ff08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5731e>
  e8ff03:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8ff08:	48 8b 84 24 48 0b 00 	mov    rax,QWORD PTR [rsp+0xb48]
  e8ff0f:	00 
  e8ff10:	48 8b 8c 24 40 0b 00 	mov    rcx,QWORD PTR [rsp+0xb40]
  e8ff17:	00 
  e8ff18:	48 8b 94 24 38 0b 00 	mov    rdx,QWORD PTR [rsp+0xb38]
  e8ff1f:	00 
  e8ff20:	48 8b bc 24 30 0b 00 	mov    rdi,QWORD PTR [rsp+0xb30]
  e8ff27:	00 
  e8ff28:	4c 8b 84 24 28 0b 00 	mov    r8,QWORD PTR [rsp+0xb28]
  e8ff2f:	00 
  e8ff30:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
  e8ff34:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
  e8ff38:	0f 29 84 24 30 06 00 	movaps XMMWORD PTR [rsp+0x630],xmm0

## 0xe8ff88: readiness +0x428 (rsp+0x688)
- instruction: mov    QWORD PTR [rsp+0x688],rcx
  e8ff43:	4c 89 e3             	mov    rbx,r12
  e8ff46:	74 05                	je     e8ff4d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57363>
  e8ff48:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
  e8ff4d:	48 8b b4 24 50 0b 00 	mov    rsi,QWORD PTR [rsp+0xb50]
  e8ff54:	00 
  e8ff55:	0f 57 c0             	xorps  xmm0,xmm0
  e8ff58:	0f 29 84 24 60 06 00 	movaps XMMWORD PTR [rsp+0x660],xmm0
  e8ff5f:	00 
  e8ff60:	0f 29 84 24 50 06 00 	movaps XMMWORD PTR [rsp+0x650],xmm0
  e8ff67:	00 
  e8ff68:	0f 29 84 24 40 06 00 	movaps XMMWORD PTR [rsp+0x640],xmm0
  e8ff6f:	00 
  e8ff70:	4c 89 84 24 70 06 00 	mov    QWORD PTR [rsp+0x670],r8
  e8ff77:	00 
  e8ff78:	48 89 bc 24 78 06 00 	mov    QWORD PTR [rsp+0x678],rdi
  e8ff7f:	00 
  e8ff80:	48 89 94 24 80 06 00 	mov    QWORD PTR [rsp+0x680],rdx
  e8ff87:	00 
  e8ff88:	48 89 8c 24 88 06 00 	mov    QWORD PTR [rsp+0x688],rcx
  e8ff8f:	00 
  e8ff90:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
  e8ff94:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  e8ff97:	0f 29 84 24 90 06 00 	movaps XMMWORD PTR [rsp+0x690],xmm0
  e8ff9e:	00 
  e8ff9f:	48 85 c9             	test   rcx,rcx
  e8ffa2:	74 05                	je     e8ffa9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x573bf>
  e8ffa4:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e8ffa9:	48 89 b4 24 a0 06 00 	mov    QWORD PTR [rsp+0x6a0],rsi
  e8ffb0:	00 
  e8ffb1:	6a 20                	push   0x20
  e8ffb3:	5f                   	pop    rdi
  e8ffb4:	e8 47 df 95 00       	call   17edf00 <_Znwm@plt>
  e8ffb9:	48 8b 94 24 80 0b 00 	mov    rdx,QWORD PTR [rsp+0xb80]
  e8ffc0:	00 
  e8ffc1:	48 8b 8c 24 78 0b 00 	mov    rcx,QWORD PTR [rsp+0xb78]
  e8ffc8:	00 
  e8ffc9:	48 89 c6             	mov    rsi,rax
  e8ffcc:	48 83 c6 18          	add    rsi,0x18

## 0xe9002b: state +0x470 (rsp+0x6d0)
- instruction: movaps XMMWORD PTR [rsp+0x6d0],xmm0
  e8ffe5:	48 89 b4 24 a8 06 00 	mov    QWORD PTR [rsp+0x6a8],rsi
  e8ffec:	00 
  e8ffed:	48 89 84 24 b0 06 00 	mov    QWORD PTR [rsp+0x6b0],rax
  e8fff4:	00 
  e8fff5:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
  e8fffa:	0f 11 84 24 b8 06 00 	movups XMMWORD PTR [rsp+0x6b8],xmm0
  e90001:	00 
  e90002:	4d 85 ed             	test   r13,r13
  e90005:	74 05                	je     e9000c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57422>
  e90007:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
  e9000c:	48 8b b4 24 90 0b 00 	mov    rsi,QWORD PTR [rsp+0xb90]
  e90013:	00 
  e90014:	48 8b bc 24 88 0b 00 	mov    rdi,QWORD PTR [rsp+0xb88]
  e9001b:	00 
  e9001c:	48 89 94 24 c8 06 00 	mov    QWORD PTR [rsp+0x6c8],rdx
  e90023:	00 
  e90024:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e90028:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
  e9002b:	0f 29 84 24 d0 06 00 	movaps XMMWORD PTR [rsp+0x6d0],xmm0
  e90032:	00 
  e90033:	48 85 c0             	test   rax,rax
  e90036:	74 05                	je     e9003d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57453>
  e90038:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9003d:	48 8b 84 24 a0 0b 00 	mov    rax,QWORD PTR [rsp+0xba0]
  e90044:	00 
  e90045:	48 8b 8c 24 98 0b 00 	mov    rcx,QWORD PTR [rsp+0xb98]
  e9004c:	00 
  e9004d:	48 89 bc 24 e0 06 00 	mov    QWORD PTR [rsp+0x6e0],rdi
  e90054:	00 
  e90055:	48 8b 56 08          	mov    rdx,QWORD PTR [rsi+0x8]
  e90059:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
  e9005c:	0f 11 84 24 e8 06 00 	movups XMMWORD PTR [rsp+0x6e8],xmm0
  e90063:	00 
  e90064:	48 85 d2             	test   rdx,rdx
  e90067:	74 05                	je     e9006e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57484>
  e90069:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e9006e:	4c 8b b4 24 c8 0b 00 	mov    r14,QWORD PTR [rsp+0xbc8]
  e90075:	00 

## 0xe900d9: dep +0x570 (rsp+0x7d0)
- instruction: mov    QWORD PTR [rbx+0xb8],r15
- resolved alias: rbx=rsp+0x718, displacement=+0xb8
  e9008e:	48 89 8c 24 f8 06 00 	mov    QWORD PTR [rsp+0x6f8],rcx
  e90095:	00 
  e90096:	48 89 84 24 00 07 00 	mov    QWORD PTR [rsp+0x700],rax
  e9009d:	00 
  e9009e:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  e900a3:	0f 11 84 24 08 07 00 	movups XMMWORD PTR [rsp+0x708],xmm0
  e900aa:	00 
  e900ab:	48 85 db             	test   rbx,rbx
  e900ae:	74 05                	je     e900b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x574cb>
  e900b0:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e900b5:	4c 8b ac 24 d8 0b 00 	mov    r13,QWORD PTR [rsp+0xbd8]
  e900bc:	00 
  e900bd:	48 8d 9c 24 18 07 00 	lea    rbx,[rsp+0x718]
  e900c4:	00 
  e900c5:	ba b0 00 00 00       	mov    edx,0xb0
  e900ca:	48 89 df             	mov    rdi,rbx
  e900cd:	e8 fe f9 95 00       	call   17efad0 <memcpy@plt>
  e900d2:	4c 89 a3 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],r12
  e900d9:	4c 89 bb b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],r15
  e900e0:	4c 89 b3 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],r14
  e900e7:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
  e900ec:	0f 29 83 c8 00 00 00 	movaps XMMWORD PTR [rbx+0xc8],xmm0
  e900f3:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
  e900f8:	48 85 c0             	test   rax,rax
  e900fb:	74 05                	je     e90102 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57518>
  e900fd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e90102:	4c 89 ac 24 f0 07 00 	mov    QWORD PTR [rsp+0x7f0],r13
  e90109:	00 
  e9010a:	48 83 a4 24 f8 07 00 	and    QWORD PTR [rsp+0x7f8],0x0
  e90111:	00 00 
  e90113:	48 8b 84 24 00 0a 00 	mov    rax,QWORD PTR [rsp+0xa00]
  e9011a:	00 
  e9011b:	48 8b 18             	mov    rbx,QWORD PTR [rax]
  e9011e:	48 8d 35 0d 31 54 ff 	lea    rsi,[rip+0xffffffffff54310d]        # 3d3232 <_ZTSN5boost17bad_function_callE@@Base+0x578>
  e90125:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e9012c:	00 
  e9012d:	e8 4c 99 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e90132:	4c 8d b4 24 b8 08 00 	lea    r14,[rsp+0x8b8]

## 0xe9010a: state +0x598 (rsp+0x7f8)
- instruction: and    QWORD PTR [rsp+0x7f8],0x0
  e900b5:	4c 8b ac 24 d8 0b 00 	mov    r13,QWORD PTR [rsp+0xbd8]
  e900bc:	00 
  e900bd:	48 8d 9c 24 18 07 00 	lea    rbx,[rsp+0x718]
  e900c4:	00 
  e900c5:	ba b0 00 00 00       	mov    edx,0xb0
  e900ca:	48 89 df             	mov    rdi,rbx
  e900cd:	e8 fe f9 95 00       	call   17efad0 <memcpy@plt>
  e900d2:	4c 89 a3 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],r12
  e900d9:	4c 89 bb b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],r15
  e900e0:	4c 89 b3 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],r14
  e900e7:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
  e900ec:	0f 29 83 c8 00 00 00 	movaps XMMWORD PTR [rbx+0xc8],xmm0
  e900f3:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
  e900f8:	48 85 c0             	test   rax,rax
  e900fb:	74 05                	je     e90102 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57518>
  e900fd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e90102:	4c 89 ac 24 f0 07 00 	mov    QWORD PTR [rsp+0x7f0],r13
  e90109:	00 
  e9010a:	48 83 a4 24 f8 07 00 	and    QWORD PTR [rsp+0x7f8],0x0
  e90111:	00 00 
  e90113:	48 8b 84 24 00 0a 00 	mov    rax,QWORD PTR [rsp+0xa00]
  e9011a:	00 
  e9011b:	48 8b 18             	mov    rbx,QWORD PTR [rax]
  e9011e:	48 8d 35 0d 31 54 ff 	lea    rsi,[rip+0xffffffffff54310d]        # 3d3232 <_ZTSN5boost17bad_function_callE@@Base+0x578>
  e90125:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e9012c:	00 
  e9012d:	e8 4c 99 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e90132:	4c 8d b4 24 b8 08 00 	lea    r14,[rsp+0x8b8]
  e90139:	00 
  e9013a:	48 8d 35 fa 30 54 ff 	lea    rsi,[rip+0xffffffffff5430fa]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
  e90141:	4c 89 f7             	mov    rdi,r14
  e90144:	e8 35 99 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e90149:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
  e90150:	00 
  e90151:	48 8d b4 24 a0 08 00 	lea    rsi,[rsp+0x8a0]
  e90158:	00 
  e90159:	6a 02                	push   0x2
  e9015b:	5a                   	pop    rdx

## 0xe913ef: state +0x598 (rsp+0x7f8)
- instruction: mov    QWORD PTR [rsp+0x7f8],rax
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

## memcpy / memmove / memset calls in FDE
### 0xe900cd: call   17efad0 <memcpy@plt>
  e90076:	4c 8b bc 24 c0 0b 00 	mov    r15,QWORD PTR [rsp+0xbc0]
  e9007d:	00 
  e9007e:	4c 8b a4 24 b8 0b 00 	mov    r12,QWORD PTR [rsp+0xbb8]
  e90085:	00 
  e90086:	48 8b b4 24 b0 0b 00 	mov    rsi,QWORD PTR [rsp+0xbb0]
  e9008d:	00 
  e9008e:	48 89 8c 24 f8 06 00 	mov    QWORD PTR [rsp+0x6f8],rcx
  e90095:	00 
  e90096:	48 89 84 24 00 07 00 	mov    QWORD PTR [rsp+0x700],rax
  e9009d:	00 
  e9009e:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  e900a3:	0f 11 84 24 08 07 00 	movups XMMWORD PTR [rsp+0x708],xmm0
  e900aa:	00 
  e900ab:	48 85 db             	test   rbx,rbx
  e900ae:	74 05                	je     e900b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x574cb>
  e900b0:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e900b5:	4c 8b ac 24 d8 0b 00 	mov    r13,QWORD PTR [rsp+0xbd8]
  e900bc:	00 
  e900bd:	48 8d 9c 24 18 07 00 	lea    rbx,[rsp+0x718]
  e900c4:	00 
  e900c5:	ba b0 00 00 00       	mov    edx,0xb0
  e900ca:	48 89 df             	mov    rdi,rbx
  e900cd:	e8 fe f9 95 00       	call   17efad0 <memcpy@plt>
  e900d2:	4c 89 a3 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],r12
  e900d9:	4c 89 bb b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],r15
  e900e0:	4c 89 b3 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],r14
  e900e7:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
  e900ec:	0f 29 83 c8 00 00 00 	movaps XMMWORD PTR [rbx+0xc8],xmm0
  e900f3:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
  e900f8:	48 85 c0             	test   rax,rax

### 0xe91436: call   17eeb90 <memset@plt>
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

## Construction prologue e8fad0..e90130
  e8fad0:	55                   	push   rbp
  e8fad1:	41 57                	push   r15
  e8fad3:	41 56                	push   r14
  e8fad5:	41 55                	push   r13
  e8fad7:	41 54                	push   r12
  e8fad9:	53                   	push   rbx
  e8fada:	48 81 ec c8 09 00 00 	sub    rsp,0x9c8
  e8fae1:	49 89 fe             	mov    r14,rdi
  e8fae4:	48 8b 84 24 a8 0b 00 	mov    rax,QWORD PTR [rsp+0xba8]
  e8faeb:	00 
  e8faec:	48 8b bc 24 70 0b 00 	mov    rdi,QWORD PTR [rsp+0xb70]
  e8faf3:	00 
  e8faf4:	4c 8b 94 24 e8 0a 00 	mov    r10,QWORD PTR [rsp+0xae8]
  e8fafb:	00 
  e8fafc:	4c 8b 9c 24 08 0a 00 	mov    r11,QWORD PTR [rsp+0xa08]
  e8fb03:	00 
  e8fb04:	64 48 8b 1c 25 28 00 	mov    rbx,QWORD PTR fs:0x28
  e8fb0b:	00 00 
  e8fb0d:	48 89 9c 24 c0 09 00 	mov    QWORD PTR [rsp+0x9c0],rbx
  e8fb14:	00 
  e8fb15:	41 0f 10 03          	movups xmm0,XMMWORD PTR [r11]
  e8fb19:	0f 57 c9             	xorps  xmm1,xmm1
  e8fb1c:	41 0f 11 0b          	movups XMMWORD PTR [r11],xmm1
  e8fb20:	4d 8b 5a 10          	mov    r11,QWORD PTR [r10+0x10]
  e8fb24:	4c 89 9c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r11
  e8fb2b:	00 
  e8fb2c:	41 0f 10 12          	movups xmm2,XMMWORD PTR [r10]
  e8fb30:	0f 29 94 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm2
  e8fb37:	00 
  e8fb38:	49 83 62 10 00       	and    QWORD PTR [r10+0x10],0x0
  e8fb3d:	41 0f 11 0a          	movups XMMWORD PTR [r10],xmm1
  e8fb41:	0f 10 0f             	movups xmm1,XMMWORD PTR [rdi]
  e8fb44:	0f 29 4c 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm1
  e8fb49:	4c 8b 6f 08          	mov    r13,QWORD PTR [rdi+0x8]
  e8fb4d:	4d 85 ed             	test   r13,r13
  e8fb50:	74 05                	je     e8fb57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56f6d>
  e8fb52:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
  e8fb57:	4c 8b 9c 24 d0 0b 00 	mov    r11,QWORD PTR [rsp+0xbd0]
  e8fb5e:	00 
  e8fb5f:	0f 10 08             	movups xmm1,XMMWORD PTR [rax]
  e8fb62:	0f 29 4c 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm1
  e8fb67:	4c 8b 60 08          	mov    r12,QWORD PTR [rax+0x8]
  e8fb6b:	4d 85 e4             	test   r12,r12
  e8fb6e:	74 06                	je     e8fb76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56f8c>
  e8fb70:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
  e8fb76:	48 8b 84 24 28 0a 00 	mov    rax,QWORD PTR [rsp+0xa28]
  e8fb7d:	00 
  e8fb7e:	48 8b 9c 24 18 0a 00 	mov    rbx,QWORD PTR [rsp+0xa18]
  e8fb85:	00 
  e8fb86:	4c 8b 94 24 10 0a 00 	mov    r10,QWORD PTR [rsp+0xa10]
  e8fb8d:	00 
  e8fb8e:	f3 41 0f 6f 0b       	movdqu xmm1,XMMWORD PTR [r11]
  e8fb93:	66 0f 7f 4c 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm1
  e8fb99:	4d 8b 7b 08          	mov    r15,QWORD PTR [r11+0x8]
  e8fb9d:	4d 85 ff             	test   r15,r15
  e8fba0:	74 05                	je     e8fba7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56fbd>
  e8fba2:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
  e8fba7:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
  e8fbae:	00 
  e8fbaf:	48 89 77 b0          	mov    QWORD PTR [rdi-0x50],rsi
  e8fbb3:	48 89 57 b8          	mov    QWORD PTR [rdi-0x48],rdx
  e8fbb7:	48 89 4f c0          	mov    QWORD PTR [rdi-0x40],rcx
  e8fbbb:	4c 89 47 c8          	mov    QWORD PTR [rdi-0x38],r8
  e8fbbf:	4c 89 4f d0          	mov    QWORD PTR [rdi-0x30],r9
  e8fbc3:	48 8b 8c 24 00 0a 00 	mov    rcx,QWORD PTR [rsp+0xa00]
  e8fbca:	00 
  e8fbcb:	48 89 4f d8          	mov    QWORD PTR [rdi-0x28],rcx
  e8fbcf:	0f 29 47 e0          	movaps XMMWORD PTR [rdi-0x20],xmm0
  e8fbd3:	4c 89 57 f0          	mov    QWORD PTR [rdi-0x10],r10
  e8fbd7:	48 89 5f f8          	mov    QWORD PTR [rdi-0x8],rbx
  e8fbdb:	48 89 c6             	mov    rsi,rax
  e8fbde:	e8 ad a6 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8fbe3:	48 8b b4 24 30 0a 00 	mov    rsi,QWORD PTR [rsp+0xa30]
  e8fbea:	00 
  e8fbeb:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
  e8fbf2:	00 
  e8fbf3:	e8 98 a6 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8fbf8:	48 8b 94 24 48 0a 00 	mov    rdx,QWORD PTR [rsp+0xa48]
  e8fbff:	00 
  e8fc00:	48 8b 84 24 40 0a 00 	mov    rax,QWORD PTR [rsp+0xa40]
  e8fc07:	00 
  e8fc08:	48 8b 8c 24 38 0a 00 	mov    rcx,QWORD PTR [rsp+0xa38]
  e8fc0f:	00 
  e8fc10:	48 89 84 24 10 03 00 	mov    QWORD PTR [rsp+0x310],rax
  e8fc17:	00 
  e8fc18:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
  e8fc1c:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
  e8fc1f:	0f 11 84 24 18 03 00 	movups XMMWORD PTR [rsp+0x318],xmm0
  e8fc26:	00 
  e8fc27:	48 85 c0             	test   rax,rax
  e8fc2a:	74 05                	je     e8fc31 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57047>
  e8fc2c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8fc31:	8a 84 24 20 0a 00 00 	mov    al,BYTE PTR [rsp+0xa20]
  e8fc38:	48 8b bc 24 90 0a 00 	mov    rdi,QWORD PTR [rsp+0xa90]
  e8fc3f:	00 
  e8fc40:	48 8b 94 24 88 0a 00 	mov    rdx,QWORD PTR [rsp+0xa88]
  e8fc47:	00 
  e8fc48:	48 8b b4 24 68 0a 00 	mov    rsi,QWORD PTR [rsp+0xa68]
  e8fc4f:	00 
  e8fc50:	4c 8b 84 24 60 0a 00 	mov    r8,QWORD PTR [rsp+0xa60]
  e8fc57:	00 
  e8fc58:	4c 8b 8c 24 58 0a 00 	mov    r9,QWORD PTR [rsp+0xa58]
  e8fc5f:	00 
  e8fc60:	4c 8b 94 24 50 0a 00 	mov    r10,QWORD PTR [rsp+0xa50]
  e8fc67:	00 
  e8fc68:	4c 8b 59 08          	mov    r11,QWORD PTR [rcx+0x8]
  e8fc6c:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
  e8fc6f:	0f 11 84 24 28 03 00 	movups XMMWORD PTR [rsp+0x328],xmm0
  e8fc76:	00 
  e8fc77:	4d 85 db             	test   r11,r11
  e8fc7a:	74 05                	je     e8fc81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57097>
  e8fc7c:	f0 49 ff 43 08       	lock inc QWORD PTR [r11+0x8]
  e8fc81:	48 8d 8c 24 60 03 00 	lea    rcx,[rsp+0x360]
  e8fc88:	00 
  e8fc89:	4c 89 51 d8          	mov    QWORD PTR [rcx-0x28],r10
  e8fc8d:	4c 89 49 e0          	mov    QWORD PTR [rcx-0x20],r9
  e8fc91:	4c 89 41 e8          	mov    QWORD PTR [rcx-0x18],r8
  e8fc95:	48 89 71 f0          	mov    QWORD PTR [rcx-0x10],rsi
  e8fc99:	48 89 51 f8          	mov    QWORD PTR [rcx-0x8],rdx
  e8fc9d:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
  e8fca2:	88 41 31             	mov    BYTE PTR [rcx+0x31],al
  e8fca5:	0f 57 c0             	xorps  xmm0,xmm0
  e8fca8:	0f 11 41 38          	movups XMMWORD PTR [rcx+0x38],xmm0
  e8fcac:	48 83 61 70 00       	and    QWORD PTR [rcx+0x70],0x0
  e8fcb1:	48 83 a1 a0 00 00 00 	and    QWORD PTR [rcx+0xa0],0x0
  e8fcb8:	00 
  e8fcb9:	48 8d 84 24 10 04 00 	lea    rax,[rsp+0x410]
  e8fcc0:	00 
  e8fcc1:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
  e8fcc6:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
  e8fcc9:	48 8d b4 24 30 04 00 	lea    rsi,[rsp+0x430]
  e8fcd0:	00 
  e8fcd1:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e8fcd5:	48 85 c0             	test   rax,rax
  e8fcd8:	74 10                	je     e8fcea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57100>
  e8fcda:	48 39 f8             	cmp    rax,rdi
  e8fcdd:	74 17                	je     e8fcf6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5710c>
  e8fcdf:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8fce2:	48 89 c7             	mov    rdi,rax
  e8fce5:	ff 51 10             	call   QWORD PTR [rcx+0x10]
  e8fce8:	eb 02                	jmp    e8fcec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57102>
  e8fcea:	31 c0                	xor    eax,eax
  e8fcec:	48 89 84 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rax
  e8fcf3:	00 
  e8fcf4:	eb 0e                	jmp    e8fd04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5711a>
  e8fcf6:	48 89 b4 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rsi
  e8fcfd:	00 
  e8fcfe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8fd01:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8fd04:	48 8b b4 24 98 0a 00 	mov    rsi,QWORD PTR [rsp+0xa98]
  e8fd0b:	00 
  e8fd0c:	48 8d bc 24 60 04 00 	lea    rdi,[rsp+0x460]
  e8fd13:	00 
  e8fd14:	e8 77 a5 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8fd19:	48 8d 84 24 b0 04 00 	lea    rax,[rsp+0x4b0]
  e8fd20:	00 
  e8fd21:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
  e8fd26:	48 8b b4 24 b8 0a 00 	mov    rsi,QWORD PTR [rsp+0xab8]
  e8fd2d:	00 
  e8fd2e:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
  e8fd35:	00 
  e8fd36:	0f 57 c0             	xorps  xmm0,xmm0
  e8fd39:	0f 29 47 b0          	movaps XMMWORD PTR [rdi-0x50],xmm0
  e8fd3d:	48 83 67 c0 00       	and    QWORD PTR [rdi-0x40],0x0
  e8fd42:	e8 49 a5 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e8fd47:	48 8b bc 24 c8 0a 00 	mov    rdi,QWORD PTR [rsp+0xac8]
  e8fd4e:	00 
  e8fd4f:	48 8b 84 24 c0 0a 00 	mov    rax,QWORD PTR [rsp+0xac0]
  e8fd56:	00 
  e8fd57:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
  e8fd5e:	00 
  e8fd5f:	48 89 46 f0          	mov    QWORD PTR [rsi-0x10],rax
  e8fd63:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e8fd67:	48 85 c0             	test   rax,rax
  e8fd6a:	74 10                	je     e8fd7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57192>
  e8fd6c:	48 39 f8             	cmp    rax,rdi
  e8fd6f:	74 17                	je     e8fd88 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5719e>
  e8fd71:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8fd74:	48 89 c7             	mov    rdi,rax
  e8fd77:	ff 51 10             	call   QWORD PTR [rcx+0x10]
  e8fd7a:	eb 02                	jmp    e8fd7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57194>
  e8fd7c:	31 c0                	xor    eax,eax
  e8fd7e:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e8fd85:	00 
  e8fd86:	eb 0e                	jmp    e8fd96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x571ac>
  e8fd88:	48 89 b4 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rsi
  e8fd8f:	00 
  e8fd90:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8fd93:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8fd96:	48 8b bc 24 d0 0a 00 	mov    rdi,QWORD PTR [rsp+0xad0]
  e8fd9d:	00 
  e8fd9e:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
  e8fda5:	00 
  e8fda6:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e8fdaa:	48 85 c0             	test   rax,rax
  e8fdad:	74 10                	je     e8fdbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x571d5>
  e8fdaf:	48 39 f8             	cmp    rax,rdi
  e8fdb2:	74 17                	je     e8fdcb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x571e1>
  e8fdb4:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8fdb7:	48 89 c7             	mov    rdi,rax
  e8fdba:	ff 51 10             	call   QWORD PTR [rcx+0x10]
  e8fdbd:	eb 02                	jmp    e8fdc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x571d7>
  e8fdbf:	31 c0                	xor    eax,eax
  e8fdc1:	48 89 84 24 70 05 00 	mov    QWORD PTR [rsp+0x570],rax
  e8fdc8:	00 
  e8fdc9:	eb 0e                	jmp    e8fdd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x571ef>
  e8fdcb:	48 89 b4 24 70 05 00 	mov    QWORD PTR [rsp+0x570],rsi
  e8fdd2:	00 
  e8fdd3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8fdd6:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8fdd9:	48 8b bc 24 d8 0a 00 	mov    rdi,QWORD PTR [rsp+0xad8]
  e8fde0:	00 
  e8fde1:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
  e8fde8:	00 
  e8fde9:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e8fded:	48 85 c0             	test   rax,rax
  e8fdf0:	74 10                	je     e8fe02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57218>
  e8fdf2:	48 39 f8             	cmp    rax,rdi
  e8fdf5:	74 17                	je     e8fe0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57224>
  e8fdf7:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8fdfa:	48 89 c7             	mov    rdi,rax
  e8fdfd:	ff 51 10             	call   QWORD PTR [rcx+0x10]
  e8fe00:	eb 02                	jmp    e8fe04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5721a>
  e8fe02:	31 c0                	xor    eax,eax
  e8fe04:	48 89 84 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],rax
  e8fe0b:	00 
  e8fe0c:	eb 0e                	jmp    e8fe1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57232>
  e8fe0e:	48 89 b4 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],rsi
  e8fe15:	00 
  e8fe16:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8fe19:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e8fe1c:	4c 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],r15
  e8fe21:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
  e8fe26:	48 8b ac 24 18 0b 00 	mov    rbp,QWORD PTR [rsp+0xb18]
  e8fe2d:	00 
  e8fe2e:	4c 8b b4 24 00 0b 00 	mov    r14,QWORD PTR [rsp+0xb00]
  e8fe35:	00 
  e8fe36:	48 8b 84 24 f8 0a 00 	mov    rax,QWORD PTR [rsp+0xaf8]
  e8fe3d:	00 
  e8fe3e:	48 8b 8c 24 f0 0a 00 	mov    rcx,QWORD PTR [rsp+0xaf0]
  e8fe45:	00 
  e8fe46:	48 8b b4 24 e0 0a 00 	mov    rsi,QWORD PTR [rsp+0xae0]
  e8fe4d:	00 
  e8fe4e:	48 8b 56 08          	mov    rdx,QWORD PTR [rsi+0x8]
  e8fe52:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
  e8fe55:	0f 29 84 24 b0 05 00 	movaps XMMWORD PTR [rsp+0x5b0],xmm0
  e8fe5c:	00 
  e8fe5d:	48 85 d2             	test   rdx,rdx
  e8fe60:	74 05                	je     e8fe67 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5727d>
  e8fe62:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e8fe67:	4c 8b bc 24 20 0b 00 	mov    r15,QWORD PTR [rsp+0xb20]
  e8fe6e:	00 
  e8fe6f:	48 8b 94 24 90 00 00 	mov    rdx,QWORD PTR [rsp+0x90]
  e8fe76:	00 
  e8fe77:	48 8d 9c 24 e0 05 00 	lea    rbx,[rsp+0x5e0]
  e8fe7e:	00 
  e8fe7f:	48 89 53 f0          	mov    QWORD PTR [rbx-0x10],rdx
  e8fe83:	0f 28 84 24 80 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x80]
  e8fe8a:	00 
  e8fe8b:	0f 29 43 e0          	movaps XMMWORD PTR [rbx-0x20],xmm0
  e8fe8f:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
  e8fe96:	00 00 
  e8fe98:	0f 57 c0             	xorps  xmm0,xmm0
  e8fe9b:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
  e8fea2:	00 
  e8fea3:	48 89 4b f8          	mov    QWORD PTR [rbx-0x8],rcx
  e8fea7:	48 8b 30             	mov    rsi,QWORD PTR [rax]
  e8feaa:	48 89 df             	mov    rdi,rbx
  e8fead:	e8 f4 99 75 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
  e8feb2:	4c 89 73 10          	mov    QWORD PTR [rbx+0x10],r14
  e8feb6:	48 8b 84 24 08 0b 00 	mov    rax,QWORD PTR [rsp+0xb08]
  e8febd:	00 
  e8febe:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  e8fec2:	48 8b 84 24 10 0b 00 	mov    rax,QWORD PTR [rsp+0xb10]
  e8fec9:	00 
  e8feca:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  e8fece:	48 8b 84 24 58 0b 00 	mov    rax,QWORD PTR [rsp+0xb58]
  e8fed5:	00 
  e8fed6:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
  e8feda:	48 8b 84 24 60 0b 00 	mov    rax,QWORD PTR [rsp+0xb60]
  e8fee1:	00 
  e8fee2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
  e8fee6:	48 8b 84 24 68 0b 00 	mov    rax,QWORD PTR [rsp+0xb68]
  e8feed:	00 
  e8feee:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
  e8fef2:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
  e8fef6:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
  e8fefa:	0f 29 43 40          	movaps XMMWORD PTR [rbx+0x40],xmm0
  e8fefe:	48 85 c0             	test   rax,rax
  e8ff01:	74 05                	je     e8ff08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5731e>
  e8ff03:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8ff08:	48 8b 84 24 48 0b 00 	mov    rax,QWORD PTR [rsp+0xb48]
  e8ff0f:	00 
  e8ff10:	48 8b 8c 24 40 0b 00 	mov    rcx,QWORD PTR [rsp+0xb40]
  e8ff17:	00 
  e8ff18:	48 8b 94 24 38 0b 00 	mov    rdx,QWORD PTR [rsp+0xb38]
  e8ff1f:	00 
  e8ff20:	48 8b bc 24 30 0b 00 	mov    rdi,QWORD PTR [rsp+0xb30]
  e8ff27:	00 
  e8ff28:	4c 8b 84 24 28 0b 00 	mov    r8,QWORD PTR [rsp+0xb28]
  e8ff2f:	00 
  e8ff30:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
  e8ff34:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
  e8ff38:	0f 29 84 24 30 06 00 	movaps XMMWORD PTR [rsp+0x630],xmm0
  e8ff3f:	00 
  e8ff40:	48 85 f6             	test   rsi,rsi
  e8ff43:	4c 89 e3             	mov    rbx,r12
  e8ff46:	74 05                	je     e8ff4d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57363>
  e8ff48:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
  e8ff4d:	48 8b b4 24 50 0b 00 	mov    rsi,QWORD PTR [rsp+0xb50]
  e8ff54:	00 
  e8ff55:	0f 57 c0             	xorps  xmm0,xmm0
  e8ff58:	0f 29 84 24 60 06 00 	movaps XMMWORD PTR [rsp+0x660],xmm0
  e8ff5f:	00 
  e8ff60:	0f 29 84 24 50 06 00 	movaps XMMWORD PTR [rsp+0x650],xmm0
  e8ff67:	00 
  e8ff68:	0f 29 84 24 40 06 00 	movaps XMMWORD PTR [rsp+0x640],xmm0
  e8ff6f:	00 
  e8ff70:	4c 89 84 24 70 06 00 	mov    QWORD PTR [rsp+0x670],r8
  e8ff77:	00 
  e8ff78:	48 89 bc 24 78 06 00 	mov    QWORD PTR [rsp+0x678],rdi
  e8ff7f:	00 
  e8ff80:	48 89 94 24 80 06 00 	mov    QWORD PTR [rsp+0x680],rdx
  e8ff87:	00 
  e8ff88:	48 89 8c 24 88 06 00 	mov    QWORD PTR [rsp+0x688],rcx
  e8ff8f:	00 
  e8ff90:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
  e8ff94:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  e8ff97:	0f 29 84 24 90 06 00 	movaps XMMWORD PTR [rsp+0x690],xmm0
  e8ff9e:	00 
  e8ff9f:	48 85 c9             	test   rcx,rcx
  e8ffa2:	74 05                	je     e8ffa9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x573bf>
  e8ffa4:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e8ffa9:	48 89 b4 24 a0 06 00 	mov    QWORD PTR [rsp+0x6a0],rsi
  e8ffb0:	00 
  e8ffb1:	6a 20                	push   0x20
  e8ffb3:	5f                   	pop    rdi
  e8ffb4:	e8 47 df 95 00       	call   17edf00 <_Znwm@plt>
  e8ffb9:	48 8b 94 24 80 0b 00 	mov    rdx,QWORD PTR [rsp+0xb80]
  e8ffc0:	00 
  e8ffc1:	48 8b 8c 24 78 0b 00 	mov    rcx,QWORD PTR [rsp+0xb78]
  e8ffc8:	00 
  e8ffc9:	48 89 c6             	mov    rsi,rax
  e8ffcc:	48 83 c6 18          	add    rsi,0x18
  e8ffd0:	83 60 18 00          	and    DWORD PTR [rax+0x18],0x0
  e8ffd4:	0f 57 c0             	xorps  xmm0,xmm0
  e8ffd7:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e8ffdb:	48 8d 3d ee 08 97 00 	lea    rdi,[rip+0x9708ee]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
  e8ffe2:	48 89 38             	mov    QWORD PTR [rax],rdi
  e8ffe5:	48 89 b4 24 a8 06 00 	mov    QWORD PTR [rsp+0x6a8],rsi
  e8ffec:	00 
  e8ffed:	48 89 84 24 b0 06 00 	mov    QWORD PTR [rsp+0x6b0],rax
  e8fff4:	00 
  e8fff5:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
  e8fffa:	0f 11 84 24 b8 06 00 	movups XMMWORD PTR [rsp+0x6b8],xmm0
  e90001:	00 
  e90002:	4d 85 ed             	test   r13,r13
  e90005:	74 05                	je     e9000c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57422>
  e90007:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
  e9000c:	48 8b b4 24 90 0b 00 	mov    rsi,QWORD PTR [rsp+0xb90]
  e90013:	00 
  e90014:	48 8b bc 24 88 0b 00 	mov    rdi,QWORD PTR [rsp+0xb88]
  e9001b:	00 
  e9001c:	48 89 94 24 c8 06 00 	mov    QWORD PTR [rsp+0x6c8],rdx
  e90023:	00 
  e90024:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e90028:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
  e9002b:	0f 29 84 24 d0 06 00 	movaps XMMWORD PTR [rsp+0x6d0],xmm0
  e90032:	00 
  e90033:	48 85 c0             	test   rax,rax
  e90036:	74 05                	je     e9003d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57453>
  e90038:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9003d:	48 8b 84 24 a0 0b 00 	mov    rax,QWORD PTR [rsp+0xba0]
  e90044:	00 
  e90045:	48 8b 8c 24 98 0b 00 	mov    rcx,QWORD PTR [rsp+0xb98]
  e9004c:	00 
  e9004d:	48 89 bc 24 e0 06 00 	mov    QWORD PTR [rsp+0x6e0],rdi
  e90054:	00 
  e90055:	48 8b 56 08          	mov    rdx,QWORD PTR [rsi+0x8]
  e90059:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
  e9005c:	0f 11 84 24 e8 06 00 	movups XMMWORD PTR [rsp+0x6e8],xmm0
  e90063:	00 
  e90064:	48 85 d2             	test   rdx,rdx
  e90067:	74 05                	je     e9006e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57484>
  e90069:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e9006e:	4c 8b b4 24 c8 0b 00 	mov    r14,QWORD PTR [rsp+0xbc8]
  e90075:	00 
  e90076:	4c 8b bc 24 c0 0b 00 	mov    r15,QWORD PTR [rsp+0xbc0]
  e9007d:	00 
  e9007e:	4c 8b a4 24 b8 0b 00 	mov    r12,QWORD PTR [rsp+0xbb8]
  e90085:	00 
  e90086:	48 8b b4 24 b0 0b 00 	mov    rsi,QWORD PTR [rsp+0xbb0]
  e9008d:	00 
  e9008e:	48 89 8c 24 f8 06 00 	mov    QWORD PTR [rsp+0x6f8],rcx
  e90095:	00 
  e90096:	48 89 84 24 00 07 00 	mov    QWORD PTR [rsp+0x700],rax
  e9009d:	00 
  e9009e:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  e900a3:	0f 11 84 24 08 07 00 	movups XMMWORD PTR [rsp+0x708],xmm0
  e900aa:	00 
  e900ab:	48 85 db             	test   rbx,rbx
  e900ae:	74 05                	je     e900b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x574cb>
  e900b0:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e900b5:	4c 8b ac 24 d8 0b 00 	mov    r13,QWORD PTR [rsp+0xbd8]
  e900bc:	00 
  e900bd:	48 8d 9c 24 18 07 00 	lea    rbx,[rsp+0x718]
  e900c4:	00 
  e900c5:	ba b0 00 00 00       	mov    edx,0xb0
  e900ca:	48 89 df             	mov    rdi,rbx
  e900cd:	e8 fe f9 95 00       	call   17efad0 <memcpy@plt>
  e900d2:	4c 89 a3 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],r12
  e900d9:	4c 89 bb b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],r15
  e900e0:	4c 89 b3 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],r14
  e900e7:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
  e900ec:	0f 29 83 c8 00 00 00 	movaps XMMWORD PTR [rbx+0xc8],xmm0
  e900f3:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
  e900f8:	48 85 c0             	test   rax,rax
  e900fb:	74 05                	je     e90102 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57518>
  e900fd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e90102:	4c 89 ac 24 f0 07 00 	mov    QWORD PTR [rsp+0x7f0],r13
  e90109:	00 
  e9010a:	48 83 a4 24 f8 07 00 	and    QWORD PTR [rsp+0x7f8],0x0
  e90111:	00 00 
  e90113:	48 8b 84 24 00 0a 00 	mov    rax,QWORD PTR [rsp+0xa00]
  e9011a:	00 
  e9011b:	48 8b 18             	mov    rbx,QWORD PTR [rax]
  e9011e:	48 8d 35 0d 31 54 ff 	lea    rsi,[rip+0xffffffffff54310d]        # 3d3232 <_ZTSN5boost17bad_function_callE@@Base+0x578>
  e90125:	48 8d bc 24 a0 08 00 	lea    rdi,[rsp+0x8a0]
  e9012c:	00 
  e9012d:	e8 4c 99 be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
