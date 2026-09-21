# smartSkipEmbeddedPodcastAd post-seek reporting path

Proven call after successful seek:
  0x1371f7c -> 0x1382662 builds state
  0x1371f88 literal = smart-skip-embedded-podcast-ad
  0x1371fa0 -> 0x13825fa(reporter=this+0xd0, sink=this+0x958, label, len=30, state)
  0x13825fa -> 0x1382113

## label/state wrapper: 0x13825fa FDE=(20456954, 20457057)
     13825fa:	80 7e 50 00          	cmp    BYTE PTR [rsi+0x50],0x0
     13825fe:	74 60                	je     1382660 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be4>
     1382600:	55                   	push   rbp
     1382601:	41 57                	push   r15
     1382603:	41 56                	push   r14
     1382605:	41 55                	push   r13
     1382607:	41 54                	push   r12
     1382609:	53                   	push   rbx
     138260a:	50                   	push   rax
     138260b:	4d 89 c6             	mov    r14,r8
     138260e:	49 89 d7             	mov    r15,rdx
     1382611:	49 89 f5             	mov    r13,rsi
     1382614:	49 89 fc             	mov    r12,rdi
     1382617:	48 89 f7             	mov    rdi,rsi
     138261a:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
     138261e:	e8 13 92 6f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1382623:	48 89 c5             	mov    rbp,rax
     1382626:	48 89 d3             	mov    rbx,rdx
     1382629:	49 83 c5 18          	add    r13,0x18
     138262d:	4c 89 ef             	mov    rdi,r13
     1382630:	e8 01 92 6f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1382635:	49 89 d0             	mov    r8,rdx
     1382638:	4c 89 e7             	mov    rdi,r12
     138263b:	48 89 ee             	mov    rsi,rbp
     138263e:	48 89 da             	mov    rdx,rbx
     1382641:	48 89 c1             	mov    rcx,rax
     1382644:	4d 89 f9             	mov    r9,r15
     1382647:	41 56                	push   r14
     1382649:	ff 74 24 08          	push   QWORD PTR [rsp+0x8]
     138264d:	e8 c1 fa ff ff       	call   1382113 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7697>
     1382652:	48 83 c4 18          	add    rsp,0x18
     1382656:	5b                   	pop    rbx
     1382657:	41 5c                	pop    r12
     1382659:	41 5d                	pop    r13
     138265b:	41 5e                	pop    r14
     138265d:	41 5f                	pop    r15
     138265f:	5d                   	pop    rbp
     1382660:	c3                   	ret

### direct calls
- 0x138261e -> 0xa7b836: call   a7b836 <JNI_OnUnload@@Base+0x3103>
- 0x1382630 -> 0xa7b836: call   a7b836 <JNI_OnUnload@@Base+0x3103>
- 0x138264d -> 0x1382113: call   1382113 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7697>

## downstream report/action sink: 0x1382113 FDE=(20455699, 20456954)
     1382113:	41 57                	push   r15
     1382115:	41 56                	push   r14
     1382117:	41 55                	push   r13
     1382119:	41 54                	push   r12
     138211b:	53                   	push   rbx
     138211c:	48 81 ec 00 01 00 00 	sub    rsp,0x100
     1382123:	4d 89 cf             	mov    r15,r9
     1382126:	4d 89 c6             	mov    r14,r8
     1382129:	49 89 cc             	mov    r12,rcx
     138212c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1382133:	00 00 
     1382135:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
     138213c:	00 
     138213d:	48 8d 44 24 38       	lea    rax,[rsp+0x38]
     1382142:	48 83 60 f0 00       	and    QWORD PTR [rax-0x10],0x0
     1382147:	48 89 fb             	mov    rbx,rdi
     138214a:	48 8d 0d a7 38 51 00 	lea    rcx,[rip+0x5138a7]        # 18959f8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x2938>
     1382151:	48 89 48 e8          	mov    QWORD PTR [rax-0x18],rcx
     1382155:	48 8d 0d 9c d6 0b ff 	lea    rcx,[rip+0xffffffffff0bd69c]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     138215c:	48 89 08             	mov    QWORD PTR [rax],rcx
     138215f:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1382163:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     1382167:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     138216b:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     138216f:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     1382173:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
     1382177:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
     138217b:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
     138217f:	48 89 48 48          	mov    QWORD PTR [rax+0x48],rcx
     1382183:	48 89 48 50          	mov    QWORD PTR [rax+0x50],rcx
     1382187:	48 89 48 58          	mov    QWORD PTR [rax+0x58],rcx
     138218b:	0f 57 c0             	xorps  xmm0,xmm0
     138218e:	0f 11 40 60          	movups XMMWORD PTR [rax+0x60],xmm0
     1382192:	0f 11 40 70          	movups XMMWORD PTR [rax+0x70],xmm0
     1382196:	48 83 a0 80 00 00 00 	and    QWORD PTR [rax+0x80],0x0
     138219d:	00 
     138219e:	48 c7 40 f8 01 00 00 	mov    QWORD PTR [rax-0x8],0x1
     13821a5:	00 
     13821a6:	48 89 c7             	mov    rdi,rax
     13821a9:	31 c9                	xor    ecx,ecx
     13821ab:	e8 ac 35 3e 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
     13821b0:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     13821b5:	80 4f f0 02          	or     BYTE PTR [rdi-0x10],0x2
     13821b9:	48 8b 4f e8          	mov    rcx,QWORD PTR [rdi-0x18]
     13821bd:	f6 c1 01             	test   cl,0x1
     13821c0:	0f 85 4d 03 00 00    	jne    1382513 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7a97>
     13821c6:	4c 89 e6             	mov    rsi,r12
     13821c9:	4c 89 f2             	mov    rdx,r14
     13821cc:	e8 8b 35 3e 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
     13821d1:	4c 8b b4 24 38 01 00 	mov    r14,QWORD PTR [rsp+0x138]
     13821d8:	00 
     13821d9:	41 80 be 98 00 00 00 	cmp    BYTE PTR [r14+0x98],0x0
     13821e0:	00 
     13821e1:	0f 84 8c 00 00 00    	je     1382273 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c77f7>
     13821e7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     13821ec:	80 4f e0 08          	or     BYTE PTR [rdi-0x20],0x8
     13821f0:	49 8d 76 58          	lea    rsi,[r14+0x58]
     13821f4:	48 8b 57 d8          	mov    rdx,QWORD PTR [rdi-0x28]
     13821f8:	f6 c2 01             	test   dl,0x1
     13821fb:	0f 85 2a 03 00 00    	jne    138252b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7aaf>
     1382201:	e8 8c 35 3e 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1382206:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     138220b:	80 4f d8 10          	or     BYTE PTR [rdi-0x28],0x10
     138220f:	49 8d 76 70          	lea    rsi,[r14+0x70]
     1382213:	48 8b 57 d0          	mov    rdx,QWORD PTR [rdi-0x30]
     1382217:	f6 c2 01             	test   dl,0x1
     138221a:	0f 85 17 03 00 00    	jne    1382537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7abb>
     1382220:	e8 6d 35 3e 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1382225:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
     138222a:	49 8d b6 88 00 00 00 	lea    rsi,[r14+0x88]
     1382231:	4c 8d ac 24 c0 00 00 	lea    r13,[rsp+0xc0]
     1382238:	00 
     1382239:	4c 89 ef             	mov    rdi,r13
     138223c:	e8 df 20 81 ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
     1382241:	41 80 4c 24 d0 20    	or     BYTE PTR [r12-0x30],0x20
     1382247:	48 89 e7             	mov    rdi,rsp
     138224a:	4c 89 ee             	mov    rsi,r13
     138224d:	e8 6a 61 ff ff       	call   13783bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bd940>
     1382252:	49 8b 54 24 c8       	mov    rdx,QWORD PTR [r12-0x38]
     1382257:	f6 c2 01             	test   dl,0x1
     138225a:	0f 85 ef 02 00 00    	jne    138254f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7ad3>
     1382260:	48 89 e6             	mov    rsi,rsp
     1382263:	4c 89 e7             	mov    rdi,r12
     1382266:	e8 7b 35 3e 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     138226b:	48 89 e7             	mov    rdi,rsp
     138226e:	e8 1d bc 46 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1382273:	41 80 be 10 01 00 00 	cmp    BYTE PTR [r14+0x110],0x0
     138227a:	00 
     138227b:	0f 84 f9 00 00 00    	je     138237a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c78fe>
     1382281:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     1382286:	80 4f c8 40          	or     BYTE PTR [rdi-0x38],0x40
     138228a:	49 8d b6 a0 00 00 00 	lea    rsi,[r14+0xa0]
     1382291:	48 8b 57 c0          	mov    rdx,QWORD PTR [rdi-0x40]
     1382295:	f6 c2 01             	test   dl,0x1
     1382298:	0f 85 a5 02 00 00    	jne    1382543 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7ac7>
     138229e:	e8 ef 34 3e 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     13822a3:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     13822a8:	80 4f c0 80          	or     BYTE PTR [rdi-0x40],0x80
     13822ac:	49 8d b6 b8 00 00 00 	lea    rsi,[r14+0xb8]
     13822b3:	48 8b 57 b8          	mov    rdx,QWORD PTR [rdi-0x48]
     13822b7:	f6 c2 01             	test   dl,0x1
     13822ba:	0f 85 9b 02 00 00    	jne    138255b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7adf>
     13822c0:	e8 cd 34 3e 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     13822c5:	41 80 be e0 00 00 00 	cmp    BYTE PTR [r14+0xe0],0x0
     13822cc:	00 
     13822cd:	74 4e                	je     138231d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c78a1>
     13822cf:	4c 8d 64 24 48       	lea    r12,[rsp+0x48]
     13822d4:	49 8d b6 d0 00 00 00 	lea    rsi,[r14+0xd0]
     13822db:	4c 8d ac 24 c0 00 00 	lea    r13,[rsp+0xc0]
     13822e2:	00 
     13822e3:	4c 89 ef             	mov    rdi,r13
     13822e6:	e8 35 20 81 ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
     13822eb:	41 80 4c 24 e8 04    	or     BYTE PTR [r12-0x18],0x4
     13822f1:	48 89 e7             	mov    rdi,rsp
     13822f4:	4c 89 ee             	mov    rsi,r13
     13822f7:	e8 e8 c0 e9 ff       	call   121e3e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63968>
     13822fc:	49 8b 54 24 e0       	mov    rdx,QWORD PTR [r12-0x20]
     1382301:	f6 c2 01             	test   dl,0x1
     1382304:	0f 85 75 02 00 00    	jne    138257f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b03>
     138230a:	48 89 e6             	mov    rsi,rsp
     138230d:	4c 89 e7             	mov    rdi,r12
     1382310:	e8 d1 34 3e 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     1382315:	48 89 e7             	mov    rdi,rsp
     1382318:	e8 73 bb 46 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     138231d:	41 80 be f1 00 00 00 	cmp    BYTE PTR [r14+0xf1],0x0
     1382324:	00 
     1382325:	74 53                	je     138237a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c78fe>
     1382327:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     138232e:	00 
     138232f:	41 0f 10 86 e1 00 00 	movups xmm0,XMMWORD PTR [r14+0xe1]
     1382336:	00 
     1382337:	0f 11 84 24 c1 00 00 	movups XMMWORD PTR [rsp+0xc1],xmm0
     138233e:	00 
     138233f:	80 4f a1 08          	or     BYTE PTR [rdi-0x5f],0x8
     1382343:	c6 84 24 c0 00 00 00 	mov    BYTE PTR [rsp+0xc0],0x20
     138234a:	20 
     138234b:	c6 84 24 d1 00 00 00 	mov    BYTE PTR [rsp+0xd1],0x0
     1382352:	00 
     1382353:	48 8b 57 98          	mov    rdx,QWORD PTR [rdi-0x68]
     1382357:	f6 c2 01             	test   dl,0x1
     138235a:	0f 85 2b 02 00 00    	jne    138258b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b0f>
     1382360:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
     1382367:	00 
     1382368:	e8 79 34 3e 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     138236d:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1382374:	00 
     1382375:	e8 16 bb 46 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     138237a:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     138237f:	80 4f b9 01          	or     BYTE PTR [rdi-0x47],0x1
     1382383:	48 8b 94 24 30 01 00 	mov    rdx,QWORD PTR [rsp+0x130]
     138238a:	00 
     138238b:	48 8b 4f b0          	mov    rcx,QWORD PTR [rdi-0x50]
     138238f:	f6 c1 01             	test   cl,0x1
     1382392:	0f 85 87 01 00 00    	jne    138251f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7aa3>
     1382398:	4c 89 fe             	mov    rsi,r15
     138239b:	e8 bc 33 3e 00       	call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
     13823a0:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
     13823a4:	41 8b 3e             	mov    edi,DWORD PTR [r14]
     13823a7:	e8 74 94 6f ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     13823ac:	84 c0                	test   al,al
     13823ae:	75 21                	jne    13823d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7955>
     13823b0:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     13823b7:	00 
     13823b8:	80 4f b1 02          	or     BYTE PTR [rdi-0x4f],0x2
     13823bc:	48 8b 57 a8          	mov    rdx,QWORD PTR [rdi-0x58]
     13823c0:	f6 c2 01             	test   dl,0x1
     13823c3:	0f 85 9e 01 00 00    	jne    1382567 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7aeb>
     13823c9:	4c 89 f6             	mov    rsi,r14
     13823cc:	e8 c1 33 3e 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     13823d1:	49 8b 76 20          	mov    rsi,QWORD PTR [r14+0x20]
     13823d5:	41 8b 7e 18          	mov    edi,DWORD PTR [r14+0x18]
     13823d9:	e8 42 94 6f ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     13823de:	84 c0                	test   al,al
     13823e0:	75 22                	jne    1382404 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7988>
     13823e2:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     13823e9:	00 
     13823ea:	80 4f a9 04          	or     BYTE PTR [rdi-0x57],0x4
     13823ee:	49 8d 76 18          	lea    rsi,[r14+0x18]
     13823f2:	48 8b 57 a0          	mov    rdx,QWORD PTR [rdi-0x60]
     13823f6:	f6 c2 01             	test   dl,0x1
     13823f9:	0f 85 74 01 00 00    	jne    1382573 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7af7>
     13823ff:	e8 8e 33 3e 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1382404:	41 80 7e 38 00       	cmp    BYTE PTR [r14+0x38],0x0
     1382409:	74 11                	je     138241c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c79a0>
     138240b:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     138240f:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     1382416:	00 
     1382417:	80 4c 24 31 10       	or     BYTE PTR [rsp+0x31],0x10
     138241c:	41 80 7e 48 00       	cmp    BYTE PTR [r14+0x48],0x0
     1382421:	74 11                	je     1382434 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c79b8>
     1382423:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     1382427:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     138242e:	00 
     138242f:	80 4c 24 31 20       	or     BYTE PTR [rsp+0x31],0x20
     1382434:	41 80 7e 51 00       	cmp    BYTE PTR [r14+0x51],0x0
     1382439:	74 10                	je     138244b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c79cf>
     138243b:	41 8a 46 50          	mov    al,BYTE PTR [r14+0x50]
     138243f:	88 84 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],al
     1382446:	80 4c 24 31 40       	or     BYTE PTR [rsp+0x31],0x40
     138244b:	41 80 be 10 01 00 00 	cmp    BYTE PTR [r14+0x110],0x0
     1382452:	00 
     1382453:	74 53                	je     13824a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7a2c>
     1382455:	f3 41 0f 10 86 f4 00 	movss  xmm0,DWORD PTR [r14+0xf4]
     138245c:	00 00 
     138245e:	f3 0f 11 84 24 ac 00 	movss  DWORD PTR [rsp+0xac],xmm0
     1382465:	00 00 
     1382467:	8b 44 24 30          	mov    eax,DWORD PTR [rsp+0x30]
     138246b:	49 8b 8e f8 00 00 00 	mov    rcx,QWORD PTR [r14+0xf8]
     1382472:	48 89 8c 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rcx
     1382479:	00 
     138247a:	89 c1                	mov    ecx,eax
     138247c:	81 c9 00 80 01 00    	or     ecx,0x18000
     1382482:	89 4c 24 30          	mov    DWORD PTR [rsp+0x30],ecx
     1382486:	41 80 be 08 01 00 00 	cmp    BYTE PTR [r14+0x108],0x0
     138248d:	00 
     138248e:	74 18                	je     13824a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7a2c>
     1382490:	49 8b 8e 00 01 00 00 	mov    rcx,QWORD PTR [r14+0x100]
     1382497:	48 89 8c 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rcx
     138249e:	00 
     138249f:	0d 00 80 03 00       	or     eax,0x38000
     13824a4:	89 44 24 30          	mov    DWORD PTR [rsp+0x30],eax
     13824a8:	31 c0                	xor    eax,eax
     13824aa:	48 89 e2             	mov    rdx,rsp
     13824ad:	88 02                	mov    BYTE PTR [rdx],al
     13824af:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
     13824b2:	48 8d 8c 24 c0 00 00 	lea    rcx,[rsp+0xc0]
     13824b9:	00 
     13824ba:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
     13824bf:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     13824c4:	48 89 df             	mov    rdi,rbx
     13824c7:	e8 56 29 2a 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
     13824cc:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     13824d3:	00 
     13824d4:	e8 91 7a 6f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     13824d9:	48 89 e7             	mov    rdi,rsp
     13824dc:	e8 4f 48 72 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     13824e1:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13824e6:	e8 87 0a 2d 00       	call   1652f72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70de>
     13824eb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13824f2:	00 00 
     13824f4:	48 3b 84 24 f8 00 00 	cmp    rax,QWORD PTR [rsp+0xf8]
     13824fb:	00 
     13824fc:	0f 85 f3 00 00 00    	jne    13825f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b79>
     1382502:	48 81 c4 00 01 00 00 	add    rsp,0x100
     1382509:	5b                   	pop    rbx
     138250a:	41 5c                	pop    r12
     138250c:	41 5d                	pop    r13
     138250e:	41 5e                	pop    r14
     1382510:	41 5f                	pop    r15
     1382512:	c3                   	ret
     1382513:	48 83 e1 fe          	and    rcx,0xfffffffffffffffe
     1382517:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
     138251a:	e9 a7 fc ff ff       	jmp    13821c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c774a>
     138251f:	48 83 e1 fe          	and    rcx,0xfffffffffffffffe
     1382523:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
     1382526:	e9 6d fe ff ff       	jmp    1382398 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c791c>
     138252b:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     138252f:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     1382532:	e9 ca fc ff ff       	jmp    1382201 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7785>
     1382537:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     138253b:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     138253e:	e9 dd fc ff ff       	jmp    1382220 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c77a4>
     1382543:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     1382547:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     138254a:	e9 4f fd ff ff       	jmp    138229e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7822>
     138254f:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     1382553:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     1382556:	e9 05 fd ff ff       	jmp    1382260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c77e4>
     138255b:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     138255f:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     1382562:	e9 59 fd ff ff       	jmp    13822c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7844>
     1382567:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     138256b:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     138256e:	e9 56 fe ff ff       	jmp    13823c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c794d>
     1382573:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     1382577:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     138257a:	e9 80 fe ff ff       	jmp    13823ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7983>
     138257f:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     1382583:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     1382586:	e9 7f fd ff ff       	jmp    138230a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c788e>
     138258b:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     138258f:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     1382592:	e9 c9 fd ff ff       	jmp    1382360 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c78e4>
     1382597:	48 89 c3             	mov    rbx,rax
     138259a:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     13825a1:	00 
     13825a2:	eb 08                	jmp    13825ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b30>
     13825a4:	eb 00                	jmp    13825a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b2a>
     13825a6:	48 89 c3             	mov    rbx,rax
     13825a9:	48 89 e7             	mov    rdi,rsp
     13825ac:	e8 df b8 46 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13825b1:	eb 1d                	jmp    13825d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b54>
     13825b3:	48 89 c3             	mov    rbx,rax
     13825b6:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     13825bd:	00 
     13825be:	e8 a7 79 6f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     13825c3:	48 89 e7             	mov    rdi,rsp
     13825c6:	e8 65 47 72 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     13825cb:	eb 03                	jmp    13825d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b54>
     13825cd:	48 89 c3             	mov    rbx,rax
     13825d0:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     13825d5:	e8 98 09 2d 00       	call   1652f72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70de>
     13825da:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13825e1:	00 00 
     13825e3:	48 3b 84 24 f8 00 00 	cmp    rax,QWORD PTR [rsp+0xf8]
     13825ea:	00 
     13825eb:	75 08                	jne    13825f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b79>
     13825ed:	48 89 df             	mov    rdi,rbx
     13825f0:	e8 db d6 6e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13825f5:	e8 b6 d4 46 00       	call   17efab0 <__stack_chk_fail@plt>

### direct calls
- 0x13821ab -> 0x176575c: call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
- 0x13821cc -> 0x176575c: call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
- 0x1382201 -> 0x1765792: call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
- 0x1382220 -> 0x1765792: call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
- 0x138223c -> 0xb94320: call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
- 0x138224d -> 0x13783bc: call   13783bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bd940>
- 0x1382266 -> 0x17657e6: call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
- 0x138226e -> 0x17ede90: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- 0x138229e -> 0x1765792: call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
- 0x13822c0 -> 0x1765792: call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
- 0x13822e6 -> 0xb94320: call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
- 0x13822f7 -> 0x121e3e4: call   121e3e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63968>
- 0x1382310 -> 0x17657e6: call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
- 0x1382318 -> 0x17ede90: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- 0x1382368 -> 0x17657e6: call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
- 0x1382375 -> 0x17ede90: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- 0x138239b -> 0x176575c: call   176575c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198c8>
- 0x13823a7 -> 0xa7b820: call   a7b820 <JNI_OnUnload@@Base+0x30ed>
- 0x13823cc -> 0x1765792: call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
- 0x13823d9 -> 0xa7b820: call   a7b820 <JNI_OnUnload@@Base+0x30ed>
- 0x13823ff -> 0x1765792: call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
- 0x13824c7 -> 0x1624e22: call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
- 0x13824d4 -> 0xa79f6a: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- 0x13824dc -> 0xaa6d30: call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
- 0x13824e6 -> 0x1652f72: call   1652f72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70de>
- 0x13825ac -> 0x17ede90: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- 0x13825be -> 0xa79f6a: call   a79f6a <JNI_OnUnload@@Base+0x1837>
- 0x13825c6 -> 0xaa6d30: call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
- 0x13825d5 -> 0x1652f72: call   1652f72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70de>
- 0x13825f0 -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- 0x13825f5 -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

## post-seek state builder: 0x1382662 FDE=(20457058, 20457656)
     1382662:	41 57                	push   r15
     1382664:	41 56                	push   r14
     1382666:	41 55                	push   r13
     1382668:	41 54                	push   r12
     138266a:	53                   	push   rbx
     138266b:	48 81 ec a0 00 00 00 	sub    rsp,0xa0
     1382672:	49 89 d4             	mov    r12,rdx
     1382675:	48 89 fb             	mov    rbx,rdi
     1382678:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138267f:	00 00 
     1382681:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     1382688:	00 
     1382689:	e8 2a 02 00 00       	call   13828b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e3c>
     138268e:	31 c0                	xor    eax,eax
     1382690:	88 43 58             	mov    BYTE PTR [rbx+0x58],al
     1382693:	88 83 98 00 00 00    	mov    BYTE PTR [rbx+0x98],al
     1382699:	88 83 a0 00 00 00    	mov    BYTE PTR [rbx+0xa0],al
     138269f:	88 83 10 01 00 00    	mov    BYTE PTR [rbx+0x110],al
     13826a5:	4d 85 e4             	test   r12,r12
     13826a8:	0f 84 78 01 00 00    	je     1382826 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7daa>
     13826ae:	4c 8d 7b 58          	lea    r15,[rbx+0x58]
     13826b2:	4c 8d b3 a0 00 00 00 	lea    r14,[rbx+0xa0]
     13826b9:	49 8d b4 24 98 01 00 	lea    rsi,[r12+0x198]
     13826c0:	00 
     13826c1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     13826c6:	e8 9b a0 74 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     13826cb:	48 8d 15 aa f8 0c ff 	lea    rdx,[rip+0xffffffffff0cf8aa]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     13826d2:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     13826d7:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     13826dc:	e8 0d 5d 7c ff       	call   b483ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9538e>
     13826e1:	49 8d b4 24 38 01 00 	lea    rsi,[r12+0x138]
     13826e8:	00 
     13826e9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     13826ee:	e8 4d b8 46 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13826f3:	41 0f 10 84 24 61 01 	movups xmm0,XMMWORD PTR [r12+0x161]
     13826fa:	00 00 
     13826fc:	4c 8d 6c 24 28       	lea    r13,[rsp+0x28]
     1382701:	41 0f 11 45 30       	movups XMMWORD PTR [r13+0x30],xmm0
     1382706:	4c 89 ff             	mov    rdi,r15
     1382709:	4c 89 ee             	mov    rsi,r13
     138270c:	e8 f9 01 00 00       	call   138290a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e8e>
     1382711:	4c 89 ef             	mov    rdi,r13
     1382714:	e8 b3 c0 71 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1382719:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     138271e:	e8 0d 46 72 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1382723:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1382728:	4c 89 e6             	mov    rsi,r12
     138272b:	e8 fa 14 01 00       	call   1393c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d91ae>
     1382730:	48 8d 15 45 f8 0c ff 	lea    rdx,[rip+0xffffffffff0cf845]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1382737:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     138273c:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     1382741:	e8 a8 5c 7c ff       	call   b483ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9538e>
     1382746:	49 8d b4 24 20 01 00 	lea    rsi,[r12+0x120]
     138274d:	00 
     138274e:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
     1382753:	4c 89 ef             	mov    rdi,r13
     1382756:	e8 e5 b7 46 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     138275b:	41 8a 84 24 60 01 00 	mov    al,BYTE PTR [r12+0x160]
     1382762:	00 
     1382763:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
     1382767:	41 0f 10 84 24 50 01 	movups xmm0,XMMWORD PTR [r12+0x150]
     138276e:	00 00 
     1382770:	0f 11 44 24 58       	movups XMMWORD PTR [rsp+0x58],xmm0
     1382775:	41 0f 10 84 24 08 01 	movups xmm0,XMMWORD PTR [r12+0x108]
     138277c:	00 00 
     138277e:	0f 11 44 24 69       	movups XMMWORD PTR [rsp+0x69],xmm0
     1382783:	c6 44 24 79 01       	mov    BYTE PTR [rsp+0x79],0x1
     1382788:	4c 89 e7             	mov    rdi,r12
     138278b:	e8 82 13 01 00       	call   1393b12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d9096>
     1382790:	f3 0f 11 44 24 7c    	movss  DWORD PTR [rsp+0x7c],xmm0
     1382796:	49 69 84 24 d0 04 00 	imul   rax,QWORD PTR [r12+0x4d0],0x3e8
     138279d:	00 e8 03 00 00 
     13827a2:	48 99                	cqo
     13827a4:	49 f7 bc 24 d8 04 00 	idiv   QWORD PTR [r12+0x4d8]
     13827ab:	00 
     13827ac:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     13827b3:	00 
     13827b4:	41 80 bc 24 f0 04 00 	cmp    BYTE PTR [r12+0x4f0],0x0
     13827bb:	00 00 
     13827bd:	74 35                	je     13827f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7d78>
     13827bf:	49 8d bc 24 e0 04 00 	lea    rdi,[r12+0x4e0]
     13827c6:	00 
     13827c7:	e8 da 3d 7f ff       	call   b765a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc3546>
     13827cc:	49 69 84 24 e0 04 00 	imul   rax,QWORD PTR [r12+0x4e0],0x3e8
     13827d3:	00 e8 03 00 00 
     13827d8:	48 99                	cqo
     13827da:	49 f7 bc 24 e8 04 00 	idiv   QWORD PTR [r12+0x4e8]
     13827e1:	00 
     13827e2:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     13827e9:	00 
     13827ea:	c6 84 24 90 00 00 00 	mov    BYTE PTR [rsp+0x90],0x1
     13827f1:	01 
     13827f2:	eb 10                	jmp    1382804 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7d88>
     13827f4:	31 c0                	xor    eax,eax
     13827f6:	88 84 24 88 00 00 00 	mov    BYTE PTR [rsp+0x88],al
     13827fd:	88 84 24 90 00 00 00 	mov    BYTE PTR [rsp+0x90],al
     1382804:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
     1382809:	4c 89 f7             	mov    rdi,r14
     138280c:	48 89 de             	mov    rsi,rbx
     138280f:	e8 78 01 00 00       	call   138298c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7f10>
     1382814:	48 89 df             	mov    rdi,rbx
     1382817:	e8 b0 bf 71 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     138281c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1382821:	e8 0a 45 72 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1382826:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138282d:	00 00 
     138282f:	48 3b 84 24 98 00 00 	cmp    rax,QWORD PTR [rsp+0x98]
     1382836:	00 
     1382837:	75 7a                	jne    13828b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e37>
     1382839:	48 81 c4 a0 00 00 00 	add    rsp,0xa0
     1382840:	5b                   	pop    rbx
     1382841:	41 5c                	pop    r12
     1382843:	41 5d                	pop    r13
     1382845:	41 5e                	pop    r14
     1382847:	41 5f                	pop    r15
     1382849:	c3                   	ret
     138284a:	eb 00                	jmp    138284c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7dd0>
     138284c:	49 89 c4             	mov    r12,rax
     138284f:	4c 89 ef             	mov    rdi,r13
     1382852:	e8 39 b6 46 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1382857:	eb 09                	jmp    1382862 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7de6>
     1382859:	eb 04                	jmp    138285f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7de3>
     138285b:	eb 11                	jmp    138286e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7df2>
     138285d:	eb 1e                	jmp    138287d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e01>
     138285f:	49 89 c4             	mov    r12,rax
     1382862:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1382867:	e8 24 b6 46 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     138286c:	eb 03                	jmp    1382871 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7df5>
     138286e:	49 89 c4             	mov    r12,rax
     1382871:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1382876:	e8 b5 44 72 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     138287b:	eb 03                	jmp    1382880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e04>
     138287d:	49 89 c4             	mov    r12,rax
     1382880:	4c 89 f7             	mov    rdi,r14
     1382883:	e8 f6 50 fe ff       	call   136797e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acf02>
     1382888:	4c 89 ff             	mov    rdi,r15
     138288b:	e8 dc 7e e7 ff       	call   11fa76c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fcf0>
     1382890:	48 89 df             	mov    rdi,rbx
     1382893:	e8 34 bf 71 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1382898:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138289f:	00 00 
     13828a1:	48 3b 84 24 98 00 00 	cmp    rax,QWORD PTR [rsp+0x98]
     13828a8:	00 
     13828a9:	75 08                	jne    13828b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e37>
     13828ab:	4c 89 e7             	mov    rdi,r12
     13828ae:	e8 1d d4 6e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13828b3:	e8 f8 d1 46 00       	call   17efab0 <__stack_chk_fail@plt>

### direct calls
- 0x1382689 -> 0x13828b8: call   13828b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e3c>
- 0x13826c6 -> 0xacc766: call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
- 0x13826dc -> 0xb483ee: call   b483ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9538e>
- 0x13826ee -> 0x17edf40: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
- 0x138270c -> 0x138290a: call   138290a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7e8e>
- 0x1382714 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x138271e -> 0xaa6d30: call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
- 0x138272b -> 0x1393c2a: call   1393c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d91ae>
- 0x1382741 -> 0xb483ee: call   b483ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9538e>
- 0x1382756 -> 0x17edf40: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
- 0x138278b -> 0x1393b12: call   1393b12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d9096>
- 0x13827c7 -> 0xb765a6: call   b765a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc3546>
- 0x138280f -> 0x138298c: call   138298c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7f10>
- 0x1382817 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x1382821 -> 0xaa6d30: call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
- 0x1382852 -> 0x17ede90: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- 0x1382867 -> 0x17ede90: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- 0x1382876 -> 0xaa6d30: call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
- 0x1382883 -> 0x136797e: call   136797e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acf02>
- 0x138288b -> 0x11fa76c: call   11fa76c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fcf0>
- 0x1382893 -> 0xa9e7cc: call   a9e7cc <JNI_OnUnload@@Base+0x26099>
- 0x13828ae -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>
- 0x13828b3 -> 0x17efab0: call   17efab0 <__stack_chk_fail@plt>

## state install/copy helper: 0x138298c FDE=(20457868, 20458051)
     138298c:	41 56                	push   r14
     138298e:	53                   	push   rbx
     138298f:	50                   	push   rax
     1382990:	49 89 f6             	mov    r14,rsi
     1382993:	48 89 fb             	mov    rbx,rdi
     1382996:	80 7f 70 00          	cmp    BYTE PTR [rdi+0x70],0x0
     138299a:	74 3e                	je     13829da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7f5e>
     138299c:	48 89 df             	mov    rdi,rbx
     138299f:	4c 89 f6             	mov    rsi,r14
     13829a2:	e8 87 90 6f ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     13829a7:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     13829ab:	49 8d 76 18          	lea    rsi,[r14+0x18]
     13829af:	e8 7a 90 6f ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     13829b4:	41 0f 10 46 30       	movups xmm0,XMMWORD PTR [r14+0x30]
     13829b9:	41 0f 10 4e 40       	movups xmm1,XMMWORD PTR [r14+0x40]
     13829be:	41 0f 10 56 50       	movups xmm2,XMMWORD PTR [r14+0x50]
     13829c3:	41 0f 10 5e 59       	movups xmm3,XMMWORD PTR [r14+0x59]
     13829c8:	0f 11 5b 59          	movups XMMWORD PTR [rbx+0x59],xmm3
     13829cc:	0f 11 53 50          	movups XMMWORD PTR [rbx+0x50],xmm2
     13829d0:	0f 11 4b 40          	movups XMMWORD PTR [rbx+0x40],xmm1
     13829d4:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     13829d8:	eb 5e                	jmp    1382a38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7fbc>
     13829da:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     13829de:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     13829e2:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     13829e6:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     13829e9:	0f 57 c0             	xorps  xmm0,xmm0
     13829ec:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     13829f0:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     13829f5:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
     13829f9:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     13829fd:	41 0f 10 4e 18       	movups xmm1,XMMWORD PTR [r14+0x18]
     1382a02:	0f 11 4b 18          	movups XMMWORD PTR [rbx+0x18],xmm1
     1382a06:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
     1382a0b:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
     1382a10:	41 0f 10 46 30       	movups xmm0,XMMWORD PTR [r14+0x30]
     1382a15:	41 0f 10 4e 40       	movups xmm1,XMMWORD PTR [r14+0x40]
     1382a1a:	41 0f 10 56 50       	movups xmm2,XMMWORD PTR [r14+0x50]
     1382a1f:	41 0f 10 5e 59       	movups xmm3,XMMWORD PTR [r14+0x59]
     1382a24:	0f 11 53 50          	movups XMMWORD PTR [rbx+0x50],xmm2
     1382a28:	0f 11 4b 40          	movups XMMWORD PTR [rbx+0x40],xmm1
     1382a2c:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     1382a30:	0f 11 5b 59          	movups XMMWORD PTR [rbx+0x59],xmm3
     1382a34:	c6 43 70 01          	mov    BYTE PTR [rbx+0x70],0x1
     1382a38:	48 89 d8             	mov    rax,rbx
     1382a3b:	48 83 c4 08          	add    rsp,0x8
     1382a3f:	5b                   	pop    rbx
     1382a40:	41 5e                	pop    r14
     1382a42:	c3                   	ret

### direct calls
- 0x13829a2 -> 0xa7ba2e: call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
- 0x13829af -> 0xa7ba2e: call   a7ba2e <JNI_OnUnload@@Base+0x32fb>

## state reset/init helper: 0x13828b8 FDE=(20457656, 20457738)
     13828b8:	41 56                	push   r14
     13828ba:	53                   	push   rbx
     13828bb:	50                   	push   rax
     13828bc:	49 89 f6             	mov    r14,rsi
     13828bf:	48 89 fb             	mov    rbx,rdi
     13828c2:	e8 79 b6 46 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13828c7:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     13828cb:	49 8d 76 18          	lea    rsi,[r14+0x18]
     13828cf:	e8 6c b6 46 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     13828d4:	41 0f b7 46 50       	movzx  eax,WORD PTR [r14+0x50]
     13828d9:	66 89 43 50          	mov    WORD PTR [rbx+0x50],ax
     13828dd:	41 0f 10 46 30       	movups xmm0,XMMWORD PTR [r14+0x30]
     13828e2:	41 0f 10 4e 40       	movups xmm1,XMMWORD PTR [r14+0x40]
     13828e7:	0f 11 4b 40          	movups XMMWORD PTR [rbx+0x40],xmm1
     13828eb:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     13828ef:	48 83 c4 08          	add    rsp,0x8
     13828f3:	5b                   	pop    rbx
     13828f4:	41 5e                	pop    r14
     13828f6:	c3                   	ret
     13828f7:	49 89 c6             	mov    r14,rax
     13828fa:	48 89 df             	mov    rdi,rbx
     13828fd:	e8 8e b5 46 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1382902:	4c 89 f7             	mov    rdi,r14
     1382905:	e8 c6 d3 6e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

### direct calls
- 0x13828c2 -> 0x17edf40: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
- 0x13828cf -> 0x17edf40: call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
- 0x13828fd -> 0x17ede90: call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
- 0x1382905 -> 0xa6fcd0: call   a6fcd0 <__emutls_get_address@@Base+0xa90>

## Exact 0x1382113 caller argument setup
     13825e3:	48 3b 84 24 f8 00 00 	cmp    rax,QWORD PTR [rsp+0xf8]
     13825ea:	00 
     13825eb:	75 08                	jne    13825f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b79>
     13825ed:	48 89 df             	mov    rdi,rbx
     13825f0:	e8 db d6 6e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13825f5:	e8 b6 d4 46 00       	call   17efab0 <__stack_chk_fail@plt>
     13825fa:	80 7e 50 00          	cmp    BYTE PTR [rsi+0x50],0x0
     13825fe:	74 60                	je     1382660 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be4>
     1382600:	55                   	push   rbp
     1382601:	41 57                	push   r15
     1382603:	41 56                	push   r14
     1382605:	41 55                	push   r13
     1382607:	41 54                	push   r12
     1382609:	53                   	push   rbx
     138260a:	50                   	push   rax
     138260b:	4d 89 c6             	mov    r14,r8
     138260e:	49 89 d7             	mov    r15,rdx
     1382611:	49 89 f5             	mov    r13,rsi
     1382614:	49 89 fc             	mov    r12,rdi
     1382617:	48 89 f7             	mov    rdi,rsi
     138261a:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
     138261e:	e8 13 92 6f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1382623:	48 89 c5             	mov    rbp,rax
     1382626:	48 89 d3             	mov    rbx,rdx
     1382629:	49 83 c5 18          	add    r13,0x18
     138262d:	4c 89 ef             	mov    rdi,r13
     1382630:	e8 01 92 6f ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1382635:	49 89 d0             	mov    r8,rdx
     1382638:	4c 89 e7             	mov    rdi,r12
     138263b:	48 89 ee             	mov    rsi,rbp
     138263e:	48 89 da             	mov    rdx,rbx
     1382641:	48 89 c1             	mov    rcx,rax
     1382644:	4d 89 f9             	mov    r9,r15
     1382647:	41 56                	push   r14
     1382649:	ff 74 24 08          	push   QWORD PTR [rsp+0x8]
     138264d:	e8 c1 fa ff ff       	call   1382113 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7697>
     1382652:	48 83 c4 18          	add    rsp,0x18
     1382656:	5b                   	pop    rbx
     1382657:	41 5c                	pop    r12
     1382659:	41 5d                	pop    r13
     138265b:	41 5e                	pop    r14
     138265d:	41 5f                	pop    r15
     138265f:	5d                   	pop    rbp
     1382660:	c3                   	ret
     1382661:	cc                   	int3
     1382662:	41 57                	push   r15
     1382664:	41 56                	push   r14
     1382666:	41 55                	push   r13
     1382668:	41 54                	push   r12
     138266a:	53                   	push   rbx
     138266b:	48 81 ec a0 00 00 00 	sub    rsp,0xa0
     1382672:	49 89 d4             	mov    r12,rdx
     1382675:	48 89 fb             	mov    rbx,rdi
     1382678:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138267f:	00 00 

## All callers of 0x13825fa and labels passed nearby
### caller 0x13670a3 FDE=(20344824, 20345119)
     1367048:	88 44 24 38          	mov    BYTE PTR [rsp+0x38],al
     136704c:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al
     1367050:	88 44 24 48          	mov    BYTE PTR [rsp+0x48],al
     1367054:	66 83 64 24 50 00    	and    WORD PTR [rsp+0x50],0x0
     136705a:	0f 57 c0             	xorps  xmm0,xmm0
     136705d:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     1367061:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1367066:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     136706b:	88 44 24 30          	mov    BYTE PTR [rsp+0x30],al
     136706f:	48 89 df             	mov    rdi,rbx
     1367072:	e8 cd 08 00 00       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     1367077:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     136707c:	48 89 e6             	mov    rsi,rsp
     136707f:	48 89 c2             	mov    rdx,rax
     1367082:	e8 db b5 01 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     1367087:	48 81 c3 58 09 00 00 	add    rbx,0x958
     136708e:	48 8d 15 a9 08 02 ff 	lea    rdx,[rip+0xffffffffff0208a9]        # 38793e <_ZTSSt12bad_any_cast@@Base-0x888a>
      STRING='video-subscribe-after-play'
     1367095:	6a 1a                	push   0x1a
     1367097:	59                   	pop    rcx
     1367098:	4c 8d 44 24 58       	lea    r8,[rsp+0x58]
     136709d:	4c 89 f7             	mov    rdi,r14
     13670a0:	48 89 de             	mov    rsi,rbx
     13670a3:	e8 52 b5 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     13670a8:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     13670ad:	e8 aa 08 00 00       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     13670b2:	48 89 e7             	mov    rdi,rsp
     13670b5:	e8 12 77 73 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     13670ba:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13670c1:	00 00 
     13670c3:	48 3b 84 24 70 01 00 	cmp    rax,QWORD PTR [rsp+0x170]
     13670ca:	00 
     13670cb:	75 4d                	jne    136711a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac69e>
     13670cd:	48 81 c4 78 01 00 00 	add    rsp,0x178
     13670d4:	5b                   	pop    rbx
     13670d5:	41 5e                	pop    r14
     13670d7:	c3                   	ret

### caller 0x136f526 FDE=(20377578, 20379228)
     136f4cf:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
     136f4d3:	80 bc 24 e8 02 00 00 	cmp    BYTE PTR [rsp+0x2e8],0x2
     136f4da:	02 
     136f4db:	88 44 24 78          	mov    BYTE PTR [rsp+0x78],al
     136f4df:	0f 94 84 24 80 00 00 	sete   BYTE PTR [rsp+0x80]
     136f4e6:	00 
     136f4e7:	0f 94 84 24 81 00 00 	sete   BYTE PTR [rsp+0x81]
     136f4ee:	00 
     136f4ef:	48 89 df             	mov    rdi,rbx
     136f4f2:	e8 4d 84 ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     136f4f7:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
     136f4fe:	00 
     136f4ff:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     136f504:	48 89 c2             	mov    rdx,rax
     136f507:	e8 56 31 01 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     136f50c:	48 8d 15 a8 08 fc fe 	lea    rdx,[rip+0xfffffffffefc08a8]        # 32fdbb <_ZTSSt12bad_any_cast@@Base-0x6040d>
      STRING='play'
     136f513:	6a 04                	push   0x4
     136f515:	59                   	pop    rcx
     136f516:	4c 8d 84 24 e8 00 00 	lea    r8,[rsp+0xe8]
     136f51d:	00 
     136f51e:	4c 89 f7             	mov    rdi,r14
     136f521:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     136f526:	e8 cf 30 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     136f52b:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
     136f532:	00 
     136f533:	e8 24 84 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     136f538:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     136f53d:	e8 8a f2 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     136f542:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     136f549:	00 
     136f54a:	e8 2d 5a 01 00       	call   1384f7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ca500>
     136f54f:	48 8d bc 24 68 02 00 	lea    rdi,[rsp+0x268]
     136f556:	00 
     136f557:	e8 5c 51 a4 ff       	call   db46b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8173e>
     136f55c:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     136f561:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]

### caller 0x136ff35 FDE=(20381174, 20381762)
     136fed7:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
     136fedb:	88 44 24 78          	mov    BYTE PTR [rsp+0x78],al
     136fedf:	88 84 24 80 00 00 00 	mov    BYTE PTR [rsp+0x80],al
     136fee6:	66 83 a4 24 88 00 00 	and    WORD PTR [rsp+0x88],0x0
     136feed:	00 00 
     136feef:	0f 57 c0             	xorps  xmm0,xmm0
     136fef2:	0f 11 44 24 50       	movups XMMWORD PTR [rsp+0x50],xmm0
     136fef7:	0f 11 44 24 59       	movups XMMWORD PTR [rsp+0x59],xmm0
     136fefc:	48 89 df             	mov    rdi,rbx
     136feff:	e8 40 7a ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     136ff04:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     136ff0b:	00 
     136ff0c:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
     136ff11:	48 89 c2             	mov    rdx,rax
     136ff14:	e8 49 27 01 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     136ff19:	48 8d b3 58 09 00 00 	lea    rsi,[rbx+0x958]
     136ff20:	48 8d 15 f2 b2 00 ff 	lea    rdx,[rip+0xffffffffff00b2f2]        # 37b219 <_ZTSSt12bad_any_cast@@Base-0x14faf>
      STRING='stop'
     136ff27:	6a 04                	push   0x4
     136ff29:	59                   	pop    rcx
     136ff2a:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]
     136ff31:	00 
     136ff32:	4c 89 f7             	mov    rdi,r14
     136ff35:	e8 c0 26 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     136ff3a:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     136ff41:	00 
     136ff42:	e8 15 7a ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     136ff47:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     136ff4c:	e8 7b e8 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     136ff51:	31 c0                	xor    eax,eax
     136ff53:	83 fd 06             	cmp    ebp,0x6
     136ff56:	77 0b                	ja     136ff63 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b54e7>
     136ff58:	48 8d 05 d1 81 0c ff 	lea    rax,[rip+0xffffffffff0c81d1]        # 438130 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5db7f>
      STRING='\x01'
     136ff5f:	42 8b 04 b8          	mov    eax,DWORD PTR [rax+r15*4]
     136ff63:	4c 8d b4 24 98 00 00 	lea    r14,[rsp+0x98]
     136ff6a:	00 
     136ff6b:	41 89 06             	mov    DWORD PTR [r14],eax

### caller 0x1370325 FDE=(20381762, 20382807)
     13702cd:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     13702d4:	00 
     13702d5:	e8 f2 e4 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     13702da:	eb 08                	jmp    13702e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b5868>
     13702dc:	4c 89 f7             	mov    rdi,r14
     13702df:	e8 ce b6 ff ff       	call   136b9b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b0f36>
     13702e4:	4d 8b a6 d0 00 00 00 	mov    r12,QWORD PTR [r14+0xd0]
     13702eb:	4c 89 f7             	mov    rdi,r14
     13702ee:	e8 51 76 ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     13702f3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     13702fa:	00 
     13702fb:	4c 89 fe             	mov    rsi,r15
     13702fe:	48 89 c2             	mov    rdx,rax
     1370301:	e8 5c 23 01 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     1370306:	49 81 c6 58 09 00 00 	add    r14,0x958
     137030d:	48 8d 15 1b 4e 01 ff 	lea    rdx,[rip+0xffffffffff014e1b]        # 38512f <_ZTSSt12bad_any_cast@@Base-0xb099>
      STRING='pause'
     1370314:	6a 05                	push   0x5
     1370316:	59                   	pop    rcx
     1370317:	4c 8d 84 24 a0 00 00 	lea    r8,[rsp+0xa0]
     137031e:	00 
     137031f:	4c 89 e7             	mov    rdi,r12
     1370322:	4c 89 f6             	mov    rsi,r14
     1370325:	e8 d0 22 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     137032a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1370331:	00 
     1370332:	e8 25 76 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1370337:	48 8d 43 08          	lea    rax,[rbx+0x8]
     137033b:	0f 57 c0             	xorps  xmm0,xmm0
     137033e:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     1370342:	48 89 03             	mov    QWORD PTR [rbx],rax
     1370345:	40 88 6b 18          	mov    BYTE PTR [rbx+0x18],bpl
     1370349:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     137034e:	e8 d3 d8 ea ff       	call   121dc26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631aa>
     1370353:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     1370358:	e8 89 3a 7c ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     137035d:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]

### caller 0x13706cd FDE=(20383004, 20383763)
     1370670:	c6 84 24 88 00 00 00 	mov    BYTE PTR [rsp+0x88],0x1
     1370677:	01 
     1370678:	31 c0                	xor    eax,eax
     137067a:	88 84 24 90 00 00 00 	mov    BYTE PTR [rsp+0x90],al
     1370681:	88 84 24 98 00 00 00 	mov    BYTE PTR [rsp+0x98],al
     1370688:	66 83 a4 24 a0 00 00 	and    WORD PTR [rsp+0xa0],0x0
     137068f:	00 00 
     1370691:	4c 89 ff             	mov    rdi,r15
     1370694:	e8 ab 72 ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     1370699:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     13706a0:	00 
     13706a1:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     13706a6:	48 89 c2             	mov    rdx,rax
     13706a9:	e8 b4 1f 01 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     13706ae:	49 81 c7 58 09 00 00 	add    r15,0x958
     13706b5:	48 8d 15 51 ac ff fe 	lea    rdx,[rip+0xfffffffffeffac51]        # 36b30d <_ZTSSt12bad_any_cast@@Base-0x24ebb>
      STRING='seek'
     13706bc:	6a 04                	push   0x4
     13706be:	59                   	pop    rcx
     13706bf:	4c 8d 84 24 a8 00 00 	lea    r8,[rsp+0xa8]
     13706c6:	00 
     13706c7:	48 89 ef             	mov    rdi,rbp
     13706ca:	4c 89 fe             	mov    rsi,r15
     13706cd:	e8 28 1f 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     13706d2:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     13706d9:	00 
     13706da:	e8 7d 72 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     13706df:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     13706e4:	e8 e3 e0 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     13706e9:	4c 8d b4 24 a8 00 00 	lea    r14,[rsp+0xa8]
     13706f0:	00 
     13706f1:	4c 89 f7             	mov    rdi,r14
     13706f4:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     13706f9:	e8 6a 2a 01 00       	call   1383168 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c86ec>
     13706fe:	49 83 7e 50 00       	cmp    QWORD PTR [r14+0x50],0x0
     1370703:	74 0e                	je     1370713 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b5c97>
     1370705:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]

### caller 0x1370ed1 FDE=(20383764, 20385890)
     1370e79:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
     1370e80:	00 
     1370e81:	c6 46 38 00          	mov    BYTE PTR [rsi+0x38],0x0
     1370e85:	0f 57 c0             	xorps  xmm0,xmm0
     1370e88:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
     1370e8c:	0f 11 46 21          	movups XMMWORD PTR [rsi+0x21],xmm0
     1370e90:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     1370e95:	48 89 46 40          	mov    QWORD PTR [rsi+0x40],rax
     1370e99:	c6 46 48 01          	mov    BYTE PTR [rsi+0x48],0x1
     1370e9d:	66 83 66 50 00       	and    WORD PTR [rsi+0x50],0x0
     1370ea2:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     1370ea9:	00 
     1370eaa:	4c 89 e2             	mov    rdx,r12
     1370ead:	e8 b0 17 01 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     1370eb2:	49 81 c6 58 09 00 00 	add    r14,0x958
     1370eb9:	48 8d 15 4d a4 ff fe 	lea    rdx,[rip+0xfffffffffeffa44d]        # 36b30d <_ZTSSt12bad_any_cast@@Base-0x24ebb>
      STRING='seek'
     1370ec0:	6a 04                	push   0x4
     1370ec2:	59                   	pop    rcx
     1370ec3:	4c 8d 84 24 00 01 00 	lea    r8,[rsp+0x100]
     1370eca:	00 
     1370ecb:	4c 89 ff             	mov    rdi,r15
     1370ece:	4c 89 f6             	mov    rsi,r14
     1370ed1:	e8 24 17 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     1370ed6:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     1370edd:	00 
     1370ede:	e8 79 6a ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1370ee3:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
     1370eea:	00 
     1370eeb:	e8 dc d8 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1370ef0:	49 8d 45 08          	lea    rax,[r13+0x8]
     1370ef4:	0f 57 c0             	xorps  xmm0,xmm0
     1370ef7:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
     1370efc:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     1370f00:	41 c6 45 18 01       	mov    BYTE PTR [r13+0x18],0x1
     1370f05:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
     1370f0c:	00 

### caller 0x1371fa0 FDE=(20389264, 20389947)
     1371f45:	66 83 a4 24 80 00 00 	and    WORD PTR [rsp+0x80],0x0
     1371f4c:	00 00 
     1371f4e:	0f 57 c0             	xorps  xmm0,xmm0
     1371f51:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1371f56:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1371f5b:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     1371f60:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
     1371f64:	48 89 df             	mov    rdi,rbx
     1371f67:	e8 d8 59 ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     1371f6c:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371f73:	00 
     1371f74:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     1371f79:	48 89 c2             	mov    rdx,rax
     1371f7c:	e8 e1 06 01 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     1371f81:	48 81 c3 58 09 00 00 	add    rbx,0x958
     1371f88:	48 8d 15 e7 b9 fd fe 	lea    rdx,[rip+0xfffffffffefdb9e7]        # 34d976 <_ZTSSt12bad_any_cast@@Base-0x42852>
      STRING='smart-skip-embedded-podcast-ad'
     1371f8f:	6a 1e                	push   0x1e
     1371f91:	59                   	pop    rcx
     1371f92:	4c 8d 84 24 88 00 00 	lea    r8,[rsp+0x88]
     1371f99:	00 
     1371f9a:	4c 89 f7             	mov    rdi,r14
     1371f9d:	48 89 de             	mov    rsi,rbx
     1371fa0:	e8 55 06 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     1371fa5:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fac:	00 
     1371fad:	e8 aa 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1371fb2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371fb7:	e8 10 c8 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1371fbc:	e9 4a fe ff ff       	jmp    1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371fc1:	eb 14                	jmp    1371fd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b755b>
     1371fc3:	48 89 c3             	mov    rbx,rax
     1371fc6:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fcd:	00 
     1371fce:	e8 89 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1371fd3:	eb 26                	jmp    1371ffb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b757f>
     1371fd5:	eb 32                	jmp    1372009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b758d>

### caller 0x1373af8 FDE=(20396548, 20397011)
     1373a9e:	31 c0                	xor    eax,eax
     1373aa0:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
     1373aa4:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
     1373aa8:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
     1373aac:	66 83 64 24 78 00    	and    WORD PTR [rsp+0x78],0x0
     1373ab2:	0f 57 c0             	xorps  xmm0,xmm0
     1373ab5:	0f 11 44 24 40       	movups XMMWORD PTR [rsp+0x40],xmm0
     1373aba:	0f 11 44 24 49       	movups XMMWORD PTR [rsp+0x49],xmm0
     1373abf:	48 89 df             	mov    rdi,rbx
     1373ac2:	e8 7d 3e ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     1373ac7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1373ace:	00 
     1373acf:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     1373ad4:	48 89 c2             	mov    rdx,rax
     1373ad7:	e8 86 eb 00 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     1373adc:	48 8d b3 58 09 00 00 	lea    rsi,[rbx+0x958]
     1373ae3:	48 8d 15 2f 77 00 ff 	lea    rdx,[rip+0xffffffffff00772f]        # 37b219 <_ZTSSt12bad_any_cast@@Base-0x14faf>
      STRING='stop'
     1373aea:	6a 04                	push   0x4
     1373aec:	59                   	pop    rcx
     1373aed:	4c 8d 84 24 80 00 00 	lea    r8,[rsp+0x80]
     1373af4:	00 
     1373af5:	4c 89 f7             	mov    rdi,r14
     1373af8:	e8 fd ea 00 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     1373afd:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1373b04:	00 
     1373b05:	e8 52 3e ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1373b0a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1373b0f:	e8 b8 ac 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1373b14:	4c 8d b4 24 88 00 00 	lea    r14,[rsp+0x88]
     1373b1b:	00 
     1373b1c:	41 c7 06 07 00 00 00 	mov    DWORD PTR [r14],0x7
     1373b23:	41 83 66 68 00       	and    DWORD PTR [r14+0x68],0x0
     1373b28:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
     1373b2f:	00 
     1373b30:	6a 01                	push   0x1
     1373b32:	5a                   	pop    rdx

### caller 0x137c1cd FDE=(20430632, 20431563)
     137c175:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     137c17c:	00 
     137c17d:	e8 4a 26 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     137c182:	eb 08                	jmp    137c18c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1710>
     137c184:	4c 89 f7             	mov    rdi,r14
     137c187:	e8 2c f7 fe ff       	call   136b8b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b0e3c>
     137c18c:	4d 8b a6 d0 00 00 00 	mov    r12,QWORD PTR [r14+0xd0]
     137c193:	4c 89 f7             	mov    rdi,r14
     137c196:	e8 a9 b7 fe ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     137c19b:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     137c1a2:	00 
     137c1a3:	4c 89 fe             	mov    rsi,r15
     137c1a6:	48 89 c2             	mov    rdx,rax
     137c1a9:	e8 b4 64 00 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     137c1ae:	49 81 c6 58 09 00 00 	add    r14,0x958
     137c1b5:	48 8d 15 0a d9 fa fe 	lea    rdx,[rip+0xfffffffffefad90a]        # 329ac6 <_ZTSSt12bad_any_cast@@Base-0x66702>
      STRING='resume'
     137c1bc:	6a 06                	push   0x6
     137c1be:	59                   	pop    rcx
     137c1bf:	4c 8d 84 24 80 00 00 	lea    r8,[rsp+0x80]
     137c1c6:	00 
     137c1c7:	4c 89 e7             	mov    rdi,r12
     137c1ca:	4c 89 f6             	mov    rsi,r14
     137c1cd:	e8 28 64 00 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     137c1d2:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     137c1d9:	00 
     137c1da:	e8 7d b7 fe ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     137c1df:	48 8d 43 08          	lea    rax,[rbx+0x8]
     137c1e3:	0f 57 c0             	xorps  xmm0,xmm0
     137c1e6:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     137c1ea:	48 89 03             	mov    QWORD PTR [rbx],rax
     137c1ed:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     137c1f2:	e8 2f 1a ea ff       	call   121dc26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631aa>
     137c1f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     137c1fc:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     137c201:	e8 12 6c 00 00       	call   1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
     137c206:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### caller 0x137fe31 FDE=(20439064, 20449599)
     137fddd:	0f 29 46 10          	movaps XMMWORD PTR [rsi+0x10],xmm0
     137fde1:	0f 29 46 20          	movaps XMMWORD PTR [rsi+0x20],xmm0
     137fde5:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     137fde8:	48 8d bc 24 b0 06 00 	lea    rdi,[rsp+0x6b0]
     137fdef:	00 
     137fdf0:	4c 89 ea             	mov    rdx,r13
     137fdf3:	e8 6a 28 00 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     137fdf8:	6a 11                	push   0x11
     137fdfa:	58                   	pop    rax
     137fdfb:	48 8d 0d f5 01 fc fe 	lea    rcx,[rip+0xfffffffffefc01f5]        # 33fff7 <_ZTSSt12bad_any_cast@@Base-0x501d1>
      STRING='update-clip-slice-reset'
     137fe02:	48 8d 15 dc 01 fc fe 	lea    rdx,[rip+0xfffffffffefc01dc]        # 33ffe5 <_ZTSSt12bad_any_cast@@Base-0x501e3>
      STRING='update-clip-slice'
     137fe09:	44 8a a4 24 88 00 00 	mov    r12b,BYTE PTR [rsp+0x88]
     137fe10:	00 
     137fe11:	45 84 e4             	test   r12b,r12b
     137fe14:	48 0f 45 d1          	cmovne rdx,rcx
     137fe18:	6a 17                	push   0x17
     137fe1a:	59                   	pop    rcx
     137fe1b:	48 0f 44 c8          	cmove  rcx,rax
     137fe1f:	49 8d b6 58 09 00 00 	lea    rsi,[r14+0x958]
     137fe26:	4c 8d 84 24 b0 06 00 	lea    r8,[rsp+0x6b0]
     137fe2d:	00 
     137fe2e:	48 89 df             	mov    rdi,rbx
     137fe31:	e8 c4 27 00 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     137fe36:	48 8d bc 24 b0 06 00 	lea    rdi,[rsp+0x6b0]
     137fe3d:	00 
     137fe3e:	e8 19 7b fe ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     137fe43:	48 8d bc 24 50 06 00 	lea    rdi,[rsp+0x650]
     137fe4a:	00 
     137fe4b:	e8 7c e9 71 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     137fe50:	45 84 e4             	test   r12b,r12b
     137fe53:	74 32                	je     137fe87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c540b>
     137fe55:	80 bc 24 80 00 00 00 	cmp    BYTE PTR [rsp+0x80],0x0
     137fe5c:	00 
     137fe5d:	48 8b b4 24 d0 00 00 	mov    rsi,QWORD PTR [rsp+0xd0]
     137fe64:	00 
     137fe65:	48 0f 45 74 24 38    	cmovne rsi,QWORD PTR [rsp+0x38]

## Strings in direct callees of 0x1382113
### 0xa6fcd0 FDE=(10943696, 10943824)
- 'libunwind: %s - %s\n'
- '_Unwind_Resume'
- "_Unwind_Resume() can't return"
