# Final r14 definition feeding TimelineConductor+0xc8

- total r14 definitions before 0x135fd57: 28

## All r14 definitions in address order
 135d1a2:	4c 8b 31             	mov    r14,QWORD PTR [rcx]
 135d38e:	4c 8d 35 30 90 fd fe 	lea    r14,[rip+0xfffffffffefd9030]        # 3363c5 <_ZTSSt12bad_any_cast@@Base-0x59e03>
 135d3c3:	4c 8d 35 84 33 00 ff 	lea    r14,[rip+0xffffffffff003384]        # 36074e <_ZTSSt12bad_any_cast@@Base-0x2fa7a>
 135d3e8:	4c 8d 35 e3 2b fe fe 	lea    r14,[rip+0xfffffffffefe2be3]        # 33ffd2 <_ZTSSt12bad_any_cast@@Base-0x501f6>
 135d405:	4c 8d 35 e6 7d fc fe 	lea    r14,[rip+0xfffffffffefc7de6]        # 3251f2 <_ZTSSt12bad_any_cast@@Base-0x6afd6>
 135d422:	4c 8d 35 a0 3b 02 ff 	lea    r14,[rip+0xffffffffff023ba0]        # 380fc9 <_ZTSSt12bad_any_cast@@Base-0xf1ff>
 135d4f3:	49 89 c6             	mov    r14,rax
 135d572:	49 89 c6             	mov    r14,rax
 135d707:	4c 8d b4 24 28 0b 00 	lea    r14,[rsp+0xb28]
 135d85a:	4c 8d b4 24 a0 05 00 	lea    r14,[rsp+0x5a0]
 135d95d:	4c 8b b4 24 b8 0d 00 	mov    r14,QWORD PTR [rsp+0xdb8]
 135d9c2:	4c 8d b4 24 20 03 00 	lea    r14,[rsp+0x320]
 135dcc0:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
 135de86:	4c 8d 35 83 f4 07 ff 	lea    r14,[rip+0xffffffffff07f483]        # 3dd310 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d5f>
 135dff7:	4c 8d b4 24 20 06 00 	lea    r14,[rsp+0x620]
 135e2d5:	4c 8d b4 24 40 05 00 	lea    r14,[rsp+0x540]
 135e654:	4d 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [r12+0xa8]
 135e6ce:	4d 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [r12+0xa8]
 135e843:	4c 8d b4 24 d0 0a 00 	lea    r14,[rsp+0xad0]
 135e930:	4c 8d b4 24 d0 0a 00 	lea    r14,[rsp+0xad0]
 135ea1d:	4c 8d b4 24 d0 0a 00 	lea    r14,[rsp+0xad0]
 135ebf8:	4c 8d b4 24 20 03 00 	lea    r14,[rsp+0x320]
 135ec72:	49 89 c6             	mov    r14,rax
 135edd4:	49 89 c6             	mov    r14,rax
 135efaa:	4c 8d 35 17 8b 5d 00 	lea    r14,[rip+0x5d8b17]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
 135f171:	4c 8b b4 24 08 02 00 	mov    r14,QWORD PTR [rsp+0x208]
 135f22a:	49 89 c6             	mov    r14,rax
 135f2bd:	49 89 c6             	mov    r14,rax

## Last 12 definitions with context
### 0x135e654: mov    r14,QWORD PTR [r12+0xa8]
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
     135e64b:	00 
     135e64c:	41 88 9c 24 00 02 00 	mov    BYTE PTR [r12+0x200],bl
     135e653:	00 
     135e654:	4d 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [r12+0xa8]
     135e65b:	00 
     135e65c:	4c 8d 84 24 20 03 00 	lea    r8,[rsp+0x320]
     135e663:	00 
     135e664:	4d 89 20             	mov    QWORD PTR [r8],r12
     135e667:	48 8d 35 23 ea 73 ff 	lea    rsi,[rip+0xffffffffff73ea23]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     135e66e:	48 8d 0d ed b3 02 00 	lea    rcx,[rip+0x2b3ed]        # 1389a62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cefe6>
     135e675:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135e67c:	00 
     135e67d:	6a 08                	push   0x8
     135e67f:	41 59                	pop    r9
     135e681:	48 89 df             	mov    rdi,rbx
     135e684:	31 d2                	xor    edx,edx
     135e686:	e8 09 c1 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135e68b:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     135e68e:	48 8d 15 1b f3 07 ff 	lea    rdx,[rip+0xffffffffff07f31b]        # 3dd9b0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x33ff>
     135e695:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135e69c:	00 
     135e69d:	48 89 d9             	mov    rcx,rbx
     135e6a0:	e8 3b 2c 46 00       	call   17c12e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17544c>
     135e6a5:	48 8d 9c 24 40 0e 00 	lea    rbx,[rsp+0xe40]
     135e6ac:	00 
     135e6ad:	4c 89 ff             	mov    rdi,r15
     135e6b0:	48 89 de             	mov    rsi,rbx
     135e6b3:	e8 3a b5 47 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     135e6b8:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135e6bc:	e8 c5 fd 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e6c1:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135e6c8:	00 
     135e6c9:	e8 1a c1 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     135e6ce:	4d 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [r12+0xa8]
     135e6d5:	00 
     135e6d6:	4c 8d 84 24 20 03 00 	lea    r8,[rsp+0x320]
     135e6dd:	00 
     135e6de:	4d 89 20             	mov    QWORD PTR [r8],r12
     135e6e1:	48 8d 35 a9 e9 73 ff 	lea    rsi,[rip+0xffffffffff73e9a9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     135e6e8:	48 8d 0d 1f b4 02 00 	lea    rcx,[rip+0x2b41f]        # 1389b0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf092>
     135e6ef:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135e6f6:	00 
     135e6f7:	6a 08                	push   0x8
     135e6f9:	41 59                	pop    r9
     135e6fb:	48 89 df             	mov    rdi,rbx
     135e6fe:	31 d2                	xor    edx,edx
     135e700:	e8 8f c0 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135e705:	49 8b 36             	mov    rsi,QWORD PTR [r14]

### 0x135e6ce: mov    r14,QWORD PTR [r12+0xa8]
     135e66e:	48 8d 0d ed b3 02 00 	lea    rcx,[rip+0x2b3ed]        # 1389a62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cefe6>
     135e675:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135e67c:	00 
     135e67d:	6a 08                	push   0x8
     135e67f:	41 59                	pop    r9
     135e681:	48 89 df             	mov    rdi,rbx
     135e684:	31 d2                	xor    edx,edx
     135e686:	e8 09 c1 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135e68b:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     135e68e:	48 8d 15 1b f3 07 ff 	lea    rdx,[rip+0xffffffffff07f31b]        # 3dd9b0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x33ff>
     135e695:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135e69c:	00 
     135e69d:	48 89 d9             	mov    rcx,rbx
     135e6a0:	e8 3b 2c 46 00       	call   17c12e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17544c>
     135e6a5:	48 8d 9c 24 40 0e 00 	lea    rbx,[rsp+0xe40]
     135e6ac:	00 
     135e6ad:	4c 89 ff             	mov    rdi,r15
     135e6b0:	48 89 de             	mov    rsi,rbx
     135e6b3:	e8 3a b5 47 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     135e6b8:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135e6bc:	e8 c5 fd 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e6c1:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135e6c8:	00 
     135e6c9:	e8 1a c1 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     135e6ce:	4d 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [r12+0xa8]
     135e6d5:	00 
     135e6d6:	4c 8d 84 24 20 03 00 	lea    r8,[rsp+0x320]
     135e6dd:	00 
     135e6de:	4d 89 20             	mov    QWORD PTR [r8],r12
     135e6e1:	48 8d 35 a9 e9 73 ff 	lea    rsi,[rip+0xffffffffff73e9a9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     135e6e8:	48 8d 0d 1f b4 02 00 	lea    rcx,[rip+0x2b41f]        # 1389b0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf092>
     135e6ef:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135e6f6:	00 
     135e6f7:	6a 08                	push   0x8
     135e6f9:	41 59                	pop    r9
     135e6fb:	48 89 df             	mov    rdi,rbx
     135e6fe:	31 d2                	xor    edx,edx
     135e700:	e8 8f c0 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135e705:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     135e708:	48 8d 15 b1 f2 07 ff 	lea    rdx,[rip+0xffffffffff07f2b1]        # 3dd9c0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x340f>
     135e70f:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135e716:	00 
     135e717:	48 89 d9             	mov    rcx,rbx
     135e71a:	e8 c1 2b 46 00       	call   17c12e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17544c>
     135e71f:	48 8d 9c 24 40 0e 00 	lea    rbx,[rsp+0xe40]
     135e726:	00 
     135e727:	48 89 ef             	mov    rdi,rbp
     135e72a:	48 89 de             	mov    rsi,rbx
     135e72d:	e8 c0 b4 47 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     135e732:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135e736:	e8 4b fd 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e73b:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135e742:	00 
     135e743:	48 89 df             	mov    rdi,rbx
     135e746:	e8 9d c0 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     135e74b:	66 0f ef c0          	pxor   xmm0,xmm0
     135e74f:	66 0f 7f 84 24 20 03 	movdqa XMMWORD PTR [rsp+0x320],xmm0
     135e756:	00 00 
     135e758:	48 83 a4 24 30 03 00 	and    QWORD PTR [rsp+0x330],0x0
     135e75f:	00 00 
     135e761:	4c 89 23             	mov    QWORD PTR [rbx],r12
     135e764:	48 8d 05 f9 dc 71 ff 	lea    rax,[rip+0xffffffffff71dcf9]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135e76b:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     135e76f:	48 8d 05 ce b3 02 00 	lea    rax,[rip+0x2b3ce]        # 1389b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf0c8>
     135e776:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     135e77a:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
     135e781:	00 
     135e782:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135e789:	00 

### 0x135e843: lea    r14,[rsp+0xad0]
     135e7de:	48 8d 8c 24 40 0e 00 	lea    rcx,[rsp+0xe40]
     135e7e5:	00 
     135e7e6:	48 89 df             	mov    rdi,rbx
     135e7e9:	e8 b5 04 37 00       	call   16ceca3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82e0f>
     135e7ee:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135e7f5:	00 
     135e7f6:	48 89 de             	mov    rsi,rbx
     135e7f9:	e8 fc 5d 75 ff       	call   ab45fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x159a>
     135e7fe:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
     135e805:	00 
     135e806:	e8 7b fc 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e80b:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135e812:	00 
     135e813:	e8 ce 1e 7e ff       	call   b406e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d686>
     135e818:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135e81f:	00 
     135e820:	e8 71 1c 94 ff       	call   ca0496 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ed436>
     135e825:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135e82c:	00 
     135e82d:	e8 5e f6 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135e832:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
     135e839:	00 
     135e83a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135e83e:	e8 43 fc 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e843:	4c 8d b4 24 d0 0a 00 	lea    r14,[rsp+0xad0]
     135e84a:	00 
     135e84b:	4c 89 f7             	mov    rdi,r14
     135e84e:	e8 b9 87 7e ff       	call   b4700c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93fac>
     135e853:	4d 89 26             	mov    QWORD PTR [r14],r12
     135e856:	48 8d 05 07 dc 71 ff 	lea    rax,[rip+0xffffffffff71dc07]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135e85d:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     135e861:	48 8d 05 98 b8 02 00 	lea    rax,[rip+0x2b898]        # 138a100 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf684>
     135e868:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     135e86c:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135e873:	00 
     135e874:	48 89 df             	mov    rdi,rbx
     135e877:	e8 3c 07 37 00       	call   16cefb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83124>
     135e87c:	48 8d 35 11 94 01 ff 	lea    rsi,[rip+0xffffffffff019411]        # 377c94 <_ZTSSt12bad_any_cast@@Base-0x18534>
     135e883:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135e88a:	00 
     135e88b:	e8 ee b1 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135e890:	48 8d 9c 24 b0 0d 00 	lea    rbx,[rsp+0xdb0]
     135e897:	00 
     135e898:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
     135e89f:	00 
     135e8a0:	48 89 df             	mov    rdi,rbx
     135e8a3:	e8 3c 09 37 00       	call   16cf1e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83350>
     135e8a8:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135e8af:	00 
     135e8b0:	48 89 de             	mov    rsi,rbx
     135e8b3:	e8 58 86 7e ff       	call   b46f10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93eb0>
     135e8b8:	48 8d 9c 24 90 02 00 	lea    rbx,[rsp+0x290]
     135e8bf:	00 
     135e8c0:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]
     135e8c7:	00 
     135e8c8:	6a 04                	push   0x4
     135e8ca:	5a                   	pop    rdx
     135e8cb:	48 8d 8c 24 40 0e 00 	lea    rcx,[rsp+0xe40]
     135e8d2:	00 
     135e8d3:	48 89 df             	mov    rdi,rbx
     135e8d6:	e8 c8 03 37 00       	call   16ceca3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82e0f>
     135e8db:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135e8e2:	00 
     135e8e3:	48 89 de             	mov    rsi,rbx
     135e8e6:	e8 0f 5d 75 ff       	call   ab45fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x159a>
     135e8eb:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
     135e8f2:	00 
     135e8f3:	e8 8e fb 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e8f8:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]

### 0x135e930: lea    r14,[rsp+0xad0]
     135e8cb:	48 8d 8c 24 40 0e 00 	lea    rcx,[rsp+0xe40]
     135e8d2:	00 
     135e8d3:	48 89 df             	mov    rdi,rbx
     135e8d6:	e8 c8 03 37 00       	call   16ceca3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82e0f>
     135e8db:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135e8e2:	00 
     135e8e3:	48 89 de             	mov    rsi,rbx
     135e8e6:	e8 0f 5d 75 ff       	call   ab45fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x159a>
     135e8eb:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
     135e8f2:	00 
     135e8f3:	e8 8e fb 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e8f8:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135e8ff:	00 
     135e900:	e8 e1 1d 7e ff       	call   b406e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d686>
     135e905:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135e90c:	00 
     135e90d:	e8 84 1b 94 ff       	call   ca0496 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ed436>
     135e912:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135e919:	00 
     135e91a:	e8 71 f5 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135e91f:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
     135e926:	00 
     135e927:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135e92b:	e8 56 fb 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e930:	4c 8d b4 24 d0 0a 00 	lea    r14,[rsp+0xad0]
     135e937:	00 
     135e938:	4c 89 f7             	mov    rdi,r14
     135e93b:	e8 cc 86 7e ff       	call   b4700c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93fac>
     135e940:	4d 89 26             	mov    QWORD PTR [r14],r12
     135e943:	48 8d 05 1a db 71 ff 	lea    rax,[rip+0xffffffffff71db1a]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135e94a:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     135e94e:	48 8d 05 43 c2 02 00 	lea    rax,[rip+0x2c243]        # 138ab98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d011c>
     135e955:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     135e959:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135e960:	00 
     135e961:	48 89 df             	mov    rdi,rbx
     135e964:	e8 4f 06 37 00       	call   16cefb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83124>
     135e969:	48 8d 35 bb 89 fe fe 	lea    rsi,[rip+0xfffffffffefe89bb]        # 34732b <_ZTSSt12bad_any_cast@@Base-0x48e9d>
     135e970:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135e977:	00 
     135e978:	e8 01 b1 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135e97d:	48 8d 9c 24 b0 0d 00 	lea    rbx,[rsp+0xdb0]
     135e984:	00 
     135e985:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
     135e98c:	00 
     135e98d:	48 89 df             	mov    rdi,rbx
     135e990:	e8 4f 08 37 00       	call   16cf1e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83350>
     135e995:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135e99c:	00 
     135e99d:	48 89 de             	mov    rsi,rbx
     135e9a0:	e8 6b 85 7e ff       	call   b46f10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93eb0>
     135e9a5:	48 8d 9c 24 90 02 00 	lea    rbx,[rsp+0x290]
     135e9ac:	00 
     135e9ad:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]
     135e9b4:	00 
     135e9b5:	6a 04                	push   0x4
     135e9b7:	5a                   	pop    rdx
     135e9b8:	48 8d 8c 24 40 0e 00 	lea    rcx,[rsp+0xe40]
     135e9bf:	00 
     135e9c0:	48 89 df             	mov    rdi,rbx
     135e9c3:	e8 db 02 37 00       	call   16ceca3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82e0f>
     135e9c8:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135e9cf:	00 
     135e9d0:	48 89 de             	mov    rsi,rbx
     135e9d3:	e8 22 5c 75 ff       	call   ab45fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x159a>
     135e9d8:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
     135e9df:	00 
     135e9e0:	e8 a1 fa 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e9e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]

### 0x135ea1d: lea    r14,[rsp+0xad0]
     135e9b8:	48 8d 8c 24 40 0e 00 	lea    rcx,[rsp+0xe40]
     135e9bf:	00 
     135e9c0:	48 89 df             	mov    rdi,rbx
     135e9c3:	e8 db 02 37 00       	call   16ceca3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82e0f>
     135e9c8:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135e9cf:	00 
     135e9d0:	48 89 de             	mov    rsi,rbx
     135e9d3:	e8 22 5c 75 ff       	call   ab45fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x159a>
     135e9d8:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
     135e9df:	00 
     135e9e0:	e8 a1 fa 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135e9e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135e9ec:	00 
     135e9ed:	e8 f4 1c 7e ff       	call   b406e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d686>
     135e9f2:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135e9f9:	00 
     135e9fa:	e8 97 1a 94 ff       	call   ca0496 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ed436>
     135e9ff:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135ea06:	00 
     135ea07:	e8 84 f4 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135ea0c:	48 8d 9c 24 10 0e 00 	lea    rbx,[rsp+0xe10]
     135ea13:	00 
     135ea14:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     135ea18:	e8 69 fa 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ea1d:	4c 8d b4 24 d0 0a 00 	lea    r14,[rsp+0xad0]
     135ea24:	00 
     135ea25:	4c 89 f7             	mov    rdi,r14
     135ea28:	e8 df 85 7e ff       	call   b4700c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93fac>
     135ea2d:	4d 89 26             	mov    QWORD PTR [r14],r12
     135ea30:	48 8d 05 2d da 71 ff 	lea    rax,[rip+0xffffffffff71da2d]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135ea37:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     135ea3b:	48 8d 05 9e c1 02 00 	lea    rax,[rip+0x2c19e]        # 138abe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0164>
     135ea42:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     135ea46:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135ea4d:	00 
     135ea4e:	48 89 df             	mov    rdi,rbx
     135ea51:	e8 62 05 37 00       	call   16cefb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83124>
     135ea56:	48 8d 35 3c 1c ff fe 	lea    rsi,[rip+0xfffffffffeff1c3c]        # 350699 <_ZTSSt12bad_any_cast@@Base-0x3fb2f>
     135ea5d:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135ea64:	00 
     135ea65:	e8 14 b0 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135ea6a:	48 8d 9c 24 b0 0d 00 	lea    rbx,[rsp+0xdb0]
     135ea71:	00 
     135ea72:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
     135ea79:	00 
     135ea7a:	48 89 df             	mov    rdi,rbx
     135ea7d:	e8 62 07 37 00       	call   16cf1e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83350>
     135ea82:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135ea89:	00 
     135ea8a:	48 89 de             	mov    rsi,rbx
     135ea8d:	e8 7e 84 7e ff       	call   b46f10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93eb0>
     135ea92:	48 8d 9c 24 90 02 00 	lea    rbx,[rsp+0x290]
     135ea99:	00 
     135ea9a:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]
     135eaa1:	00 
     135eaa2:	6a 04                	push   0x4
     135eaa4:	5a                   	pop    rdx
     135eaa5:	48 8d 8c 24 40 0e 00 	lea    rcx,[rsp+0xe40]
     135eaac:	00 
     135eaad:	48 89 df             	mov    rdi,rbx
     135eab0:	e8 ee 01 37 00       	call   16ceca3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82e0f>
     135eab5:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135eabc:	00 
     135eabd:	48 89 de             	mov    rsi,rbx
     135eac0:	e8 35 5b 75 ff       	call   ab45fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x159a>
     135eac5:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
     135eacc:	00 
     135eacd:	e8 b4 f9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ead2:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]

### 0x135ebf8: lea    r14,[rsp+0x320]
     135eb93:	e8 0b 01 37 00       	call   16ceca3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82e0f>
     135eb98:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135eb9f:	00 
     135eba0:	48 89 de             	mov    rsi,rbx
     135eba3:	e8 52 5a 75 ff       	call   ab45fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x159a>
     135eba8:	4c 89 e3             	mov    rbx,r12
     135ebab:	48 83 c3 08          	add    rbx,0x8
     135ebaf:	48 8b bc 24 38 0a 00 	mov    rdi,QWORD PTR [rsp+0xa38]
     135ebb6:	00 
     135ebb7:	e8 ca f8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ebbc:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135ebc3:	00 
     135ebc4:	e8 1d 1b 7e ff       	call   b406e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d686>
     135ebc9:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135ebd0:	00 
     135ebd1:	e8 c0 18 94 ff       	call   ca0496 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ed436>
     135ebd6:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135ebdd:	00 
     135ebde:	e8 ad f2 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135ebe3:	48 8b bc 24 98 02 00 	mov    rdi,QWORD PTR [rsp+0x298]
     135ebea:	00 
     135ebeb:	e8 96 f8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ebf0:	4c 8d ac 24 d0 0a 00 	lea    r13,[rsp+0xad0]
     135ebf7:	00 
     135ebf8:	4c 8d b4 24 20 03 00 	lea    r14,[rsp+0x320]
     135ebff:	00 
     135ec00:	4c 89 ef             	mov    rdi,r13
     135ec03:	4c 89 f6             	mov    rsi,r14
     135ec06:	e8 a9 12 37 00       	call   16cfeb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84020>
     135ec0b:	48 89 df             	mov    rdi,rbx
     135ec0e:	4c 89 ee             	mov    rsi,r13
     135ec11:	e8 06 ac 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135ec16:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     135ec1a:	e8 67 f8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ec1f:	4c 89 f7             	mov    rdi,r14
     135ec22:	e8 21 5c 75 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
     135ec27:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135ec2e:	00 
     135ec2f:	e8 36 b3 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ec34:	48 8b 9c 24 00 01 00 	mov    rbx,QWORD PTR [rsp+0x100]
     135ec3b:	00 
     135ec3c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135ec3f:	4c 89 23             	mov    QWORD PTR [rbx],r12
     135ec42:	48 85 ff             	test   rdi,rdi
     135ec45:	74 09                	je     135ec50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a41d4>
     135ec47:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec4a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135ec4d:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
     135ec50:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135ec57:	00 
     135ec58:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec5b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135ec5e:	4c 8b bc 24 b0 10 00 	mov    r15,QWORD PTR [rsp+0x10b0]
     135ec65:	00 
     135ec66:	48 89 c3             	mov    rbx,rax
     135ec69:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec6c:	4c 89 ff             	mov    rdi,r15
     135ec6f:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135ec72:	49 89 c6             	mov    r14,rax
     135ec75:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec78:	4c 89 ff             	mov    rdi,r15
     135ec7b:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135ec7e:	48 89 c5             	mov    rbp,rax
     135ec81:	6a 40                	push   0x40
     135ec83:	5f                   	pop    rdi
     135ec84:	e8 77 f2 48 00       	call   17edf00 <_Znwm@plt>
     135ec89:	49 89 c7             	mov    r15,rax
     135ec8c:	48 8d 05 cd 29 51 00 	lea    rax,[rip+0x5129cd]        # 1871660 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dd48>
     135ec93:	49 89 07             	mov    QWORD PTR [r15],rax

### 0x135ec72: mov    r14,rax
     135ec1f:	4c 89 f7             	mov    rdi,r14
     135ec22:	e8 21 5c 75 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
     135ec27:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135ec2e:	00 
     135ec2f:	e8 36 b3 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ec34:	48 8b 9c 24 00 01 00 	mov    rbx,QWORD PTR [rsp+0x100]
     135ec3b:	00 
     135ec3c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135ec3f:	4c 89 23             	mov    QWORD PTR [rbx],r12
     135ec42:	48 85 ff             	test   rdi,rdi
     135ec45:	74 09                	je     135ec50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a41d4>
     135ec47:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec4a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135ec4d:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
     135ec50:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135ec57:	00 
     135ec58:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec5b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135ec5e:	4c 8b bc 24 b0 10 00 	mov    r15,QWORD PTR [rsp+0x10b0]
     135ec65:	00 
     135ec66:	48 89 c3             	mov    rbx,rax
     135ec69:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec6c:	4c 89 ff             	mov    rdi,r15
     135ec6f:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135ec72:	49 89 c6             	mov    r14,rax
     135ec75:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec78:	4c 89 ff             	mov    rdi,r15
     135ec7b:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135ec7e:	48 89 c5             	mov    rbp,rax
     135ec81:	6a 40                	push   0x40
     135ec83:	5f                   	pop    rdi
     135ec84:	e8 77 f2 48 00       	call   17edf00 <_Znwm@plt>
     135ec89:	49 89 c7             	mov    r15,rax
     135ec8c:	48 8d 05 cd 29 51 00 	lea    rax,[rip+0x5129cd]        # 1871660 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dd48>
     135ec93:	49 89 07             	mov    QWORD PTR [r15],rax
     135ec96:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135ec9d:	00 
     135ec9e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
     135eca2:	49 89 5f 10          	mov    QWORD PTR [r15+0x10],rbx
     135eca6:	48 8b 84 24 c0 10 00 	mov    rax,QWORD PTR [rsp+0x10c0]
     135ecad:	00 
     135ecae:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     135ecb2:	4d 89 77 20          	mov    QWORD PTR [r15+0x20],r14
     135ecb6:	49 89 6f 28          	mov    QWORD PTR [r15+0x28],rbp
     135ecba:	4c 89 ff             	mov    rdi,r15
     135ecbd:	48 83 c7 30          	add    rdi,0x30
     135ecc1:	e8 64 6a 80 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     135ecc6:	4c 89 bc 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r15
     135eccd:	00 
     135ecce:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135ecd5:	00 
     135ecd6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ecd9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135ecdc:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     135ece1:	bf 10 01 00 00       	mov    edi,0x110
     135ece6:	e8 15 f2 48 00       	call   17edf00 <_Znwm@plt>
     135eceb:	48 89 c3             	mov    rbx,rax
     135ecee:	48 8d 05 b3 b1 50 00 	lea    rax,[rip+0x50b1b3]        # 1869ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26590>
     135ecf5:	48 89 03             	mov    QWORD PTR [rbx],rax
     135ecf8:	48 8d 05 49 b2 50 00 	lea    rax,[rip+0x50b249]        # 1869f48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26630>
     135ecff:	48 89 84 24 d0 0a 00 	mov    QWORD PTR [rsp+0xad0],rax
     135ed06:	00 
     135ed07:	48 8b 84 24 00 11 00 	mov    rax,QWORD PTR [rsp+0x1100]
     135ed0e:	00 
     135ed0f:	48 89 84 24 d8 0a 00 	mov    QWORD PTR [rsp+0xad8],rax
     135ed16:	00 
     135ed17:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ed1e:	00 
     135ed1f:	48 8d 73 10          	lea    rsi,[rbx+0x10]

### 0x135edd4: mov    r14,rax
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

### 0x135efaa: lea    r14,[rip+0x5d8b17]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
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
     135ef6d:	f3 0f 7e 05 4b e1 02 	movq   xmm0,QWORD PTR [rip+0xffffffffff02e14b]        # 38d0c0 <_ZTSSt12bad_any_cast@@Base-0x3108>
     135ef74:	ff 
     135ef75:	66 0f d6 84 24 6c 03 	movq   QWORD PTR [rsp+0x36c],xmm0
     135ef7c:	00 00 
     135ef7e:	48 c7 84 24 78 03 00 	mov    QWORD PTR [rsp+0x378],0x7d0
     135ef85:	00 d0 07 00 00 
     135ef8a:	8a 45 04             	mov    al,BYTE PTR [rbp+0x4]
     135ef8d:	88 84 24 80 03 00 00 	mov    BYTE PTR [rsp+0x380],al
     135ef94:	48 8b 45 38          	mov    rax,QWORD PTR [rbp+0x38]
     135ef98:	48 8d b4 24 f0 02 00 	lea    rsi,[rsp+0x2f0]
     135ef9f:	00 
     135efa0:	48 89 06             	mov    QWORD PTR [rsi],rax
     135efa3:	c7 46 08 4e 1f 00 00 	mov    DWORD PTR [rsi+0x8],0x1f4e
     135efaa:	4c 8d 35 17 8b 5d 00 	lea    r14,[rip+0x5d8b17]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     135efb1:	4c 89 76 10          	mov    QWORD PTR [rsi+0x10],r14
     135efb5:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]
     135efb9:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     135efbd:	c7 46 20 4f 1f 00 00 	mov    DWORD PTR [rsi+0x20],0x1f4f
     135efc4:	4c 89 76 28          	mov    QWORD PTR [rsi+0x28],r14
     135efc8:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135efcf:	00 
     135efd0:	6a 02                	push   0x2
     135efd2:	5a                   	pop    rdx
     135efd3:	e8 24 1d 00 00       	call   1360cfc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6280>
     135efd8:	48 8d 9c 24 88 03 00 	lea    rbx,[rsp+0x388]
     135efdf:	00 
     135efe0:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
     135efe7:	00 
     135efe8:	66 0f 6f 84 24 90 01 	movdqa xmm0,XMMWORD PTR [rsp+0x190]
     135efef:	00 00 
     135eff1:	0f 57 c9             	xorps  xmm1,xmm1
     135eff4:	0f 29 8c 24 90 01 00 	movaps XMMWORD PTR [rsp+0x190],xmm1
     135effb:	00 
     135effc:	48 83 a4 24 a0 01 00 	and    QWORD PTR [rsp+0x1a0],0x0
     135f003:	00 00 
     135f005:	66 0f 7f 84 24 30 02 	movdqa XMMWORD PTR [rsp+0x230],xmm0
     135f00c:	00 00 
     135f00e:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
     135f015:	00 
     135f016:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f01d:	00 
     135f01e:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     135f021:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135f026:	0f 11 8c 24 48 02 00 	movups XMMWORD PTR [rsp+0x248],xmm1
     135f02d:	00 
     135f02e:	e8 f5 c6 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135f033:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     135f038:	66 0f ef c0          	pxor   xmm0,xmm0
     135f03c:	f3 0f 7f 03          	movdqu XMMWORD PTR [rbx],xmm0
     135f040:	80 bc 24 50 02 00 00 	cmp    BYTE PTR [rsp+0x250],0x0
     135f047:	00 
     135f048:	4c 8b ac 24 38 02 00 	mov    r13,QWORD PTR [rsp+0x238]
     135f04f:	00 
     135f050:	74 0a                	je     135f05c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a45e0>
     135f052:	48 8b 9c 24 48 02 00 	mov    rbx,QWORD PTR [rsp+0x248]
     135f059:	00 
     135f05a:	eb 37                	jmp    135f093 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4617>
     135f05c:	48 8b 84 24 30 02 00 	mov    rax,QWORD PTR [rsp+0x230]

### 0x135f171: mov    r14,QWORD PTR [rsp+0x208]
     135f10e:	00 
     135f10f:	66 0f 6f 84 24 70 01 	movdqa xmm0,XMMWORD PTR [rsp+0x170]
     135f116:	00 00 
     135f118:	0f 57 c9             	xorps  xmm1,xmm1
     135f11b:	0f 29 8c 24 70 01 00 	movaps XMMWORD PTR [rsp+0x170],xmm1
     135f122:	00 
     135f123:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
     135f12a:	00 00 
     135f12c:	66 0f 7f 84 24 00 02 	movdqa XMMWORD PTR [rsp+0x200],xmm0
     135f133:	00 00 
     135f135:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
     135f13c:	00 
     135f13d:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f144:	00 
     135f145:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     135f148:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135f14d:	0f 11 8c 24 18 02 00 	movups XMMWORD PTR [rsp+0x218],xmm1
     135f154:	00 
     135f155:	e8 ce c5 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135f15a:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     135f15f:	66 0f ef c0          	pxor   xmm0,xmm0
     135f163:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
     135f169:	80 bc 24 20 02 00 00 	cmp    BYTE PTR [rsp+0x220],0x0
     135f170:	00 
     135f171:	4c 8b b4 24 08 02 00 	mov    r14,QWORD PTR [rsp+0x208]
     135f178:	00 
     135f179:	74 0a                	je     135f185 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4709>
     135f17b:	48 8b 9c 24 18 02 00 	mov    rbx,QWORD PTR [rsp+0x218]
     135f182:	00 
     135f183:	eb 37                	jmp    135f1bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4740>
     135f185:	48 8b 84 24 00 02 00 	mov    rax,QWORD PTR [rsp+0x200]
     135f18c:	00 
     135f18d:	4c 89 f3             	mov    rbx,r14
     135f190:	4c 39 f0             	cmp    rax,r14
     135f193:	74 17                	je     135f1ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4730>
     135f195:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
     135f199:	7f 0e                	jg     135f1a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a472d>
     135f19b:	48 83 c0 18          	add    rax,0x18
     135f19f:	4c 39 f0             	cmp    rax,r14
     135f1a2:	75 f1                	jne    135f195 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4719>
     135f1a4:	4c 89 f3             	mov    rbx,r14
     135f1a7:	eb 03                	jmp    135f1ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4730>
     135f1a9:	48 89 c3             	mov    rbx,rax
     135f1ac:	48 89 9c 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rbx
     135f1b3:	00 
     135f1b4:	c6 84 24 20 02 00 00 	mov    BYTE PTR [rsp+0x220],0x1
     135f1bb:	01 
     135f1bc:	4c 39 f3             	cmp    rbx,r14
     135f1bf:	74 38                	je     135f1f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a477d>
     135f1c1:	4c 89 ef             	mov    rdi,r13
     135f1c4:	48 89 de             	mov    rsi,rbx
     135f1c7:	e8 ec 1b 00 00       	call   1360db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a633c>
     135f1cc:	48 8b 84 24 08 02 00 	mov    rax,QWORD PTR [rsp+0x208]
     135f1d3:	00 
     135f1d4:	48 83 c3 18          	add    rbx,0x18
     135f1d8:	48 39 c3             	cmp    rbx,rax
     135f1db:	74 14                	je     135f1f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4775>
     135f1dd:	48 8d 4b 18          	lea    rcx,[rbx+0x18]
     135f1e1:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     135f1e5:	48 89 cb             	mov    rbx,rcx
     135f1e8:	7e ee                	jle    135f1d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a475c>
     135f1ea:	48 83 c1 e8          	add    rcx,0xffffffffffffffe8
     135f1ee:	48 89 c8             	mov    rax,rcx
     135f1f1:	48 89 c3             	mov    rbx,rax
     135f1f4:	4c 39 f0             	cmp    rax,r14
     135f1f7:	75 c8                	jne    135f1c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4745>
     135f1f9:	8a 44 24 2f          	mov    al,BYTE PTR [rsp+0x2f]
     135f1fd:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     135f204:	48 63 84 24 e8 00 00 	movsxd rax,DWORD PTR [rsp+0xe8]

### 0x135f22a: mov    r14,rax
     135f1d4:	48 83 c3 18          	add    rbx,0x18
     135f1d8:	48 39 c3             	cmp    rbx,rax
     135f1db:	74 14                	je     135f1f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4775>
     135f1dd:	48 8d 4b 18          	lea    rcx,[rbx+0x18]
     135f1e1:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     135f1e5:	48 89 cb             	mov    rbx,rcx
     135f1e8:	7e ee                	jle    135f1d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a475c>
     135f1ea:	48 83 c1 e8          	add    rcx,0xffffffffffffffe8
     135f1ee:	48 89 c8             	mov    rax,rcx
     135f1f1:	48 89 c3             	mov    rbx,rax
     135f1f4:	4c 39 f0             	cmp    rax,r14
     135f1f7:	75 c8                	jne    135f1c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4745>
     135f1f9:	8a 44 24 2f          	mov    al,BYTE PTR [rsp+0x2f]
     135f1fd:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     135f204:	48 63 84 24 e8 00 00 	movsxd rax,DWORD PTR [rsp+0xe8]
     135f20b:	00 
     135f20c:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
     135f213:	00 
     135f214:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     135f21b:	00 
     135f21c:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f21f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135f224:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f227:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f22a:	49 89 c6             	mov    r14,rax
     135f22d:	4c 89 a4 24 90 02 00 	mov    QWORD PTR [rsp+0x290],r12
     135f234:	00 
     135f235:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f23c:	00 
     135f23d:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
     135f244:	00 
     135f245:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     135f24a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f24d:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135f250:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135f257:	00 
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

### 0x135f2bd: mov    r14,rax
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
     135f2e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135f2ec:	00 
     135f2ed:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135f2f4:	00 
     135f2f5:	e8 ec dc 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135f2fa:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135f301:	00 
     135f302:	48 8d b4 24 50 08 00 	lea    rsi,[rsp+0x850]
     135f309:	00 
     135f30a:	e8 fd 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f30f:	48 83 a4 24 30 0e 00 	and    QWORD PTR [rsp+0xe30],0x0
     135f316:	00 00 
     135f318:	6a 70                	push   0x70
     135f31a:	5f                   	pop    rdi
     135f31b:	e8 e0 eb 48 00       	call   17edf00 <_Znwm@plt>
     135f320:	48 89 c3             	mov    rbx,rax
     135f323:	48 8d 05 c6 8c 50 00 	lea    rax,[rip+0x508cc6]        # 1867ff0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x246d8>
     135f32a:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f32d:	48 89 df             	mov    rdi,rbx
     135f330:	48 83 c7 10          	add    rdi,0x10
     135f334:	48 8d b4 24 b0 0d 00 	lea    rsi,[rsp+0xdb0]
     135f33b:	00 
     135f33c:	e8 cb 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f341:	48 89 9c 24 30 0e 00 	mov    QWORD PTR [rsp+0xe30],rbx
     135f348:	00 
     135f349:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f350:	00 
     135f351:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135f358:	00 
     135f359:	e8 08 1c 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f35e:	48 83 a4 24 a0 0d 00 	and    QWORD PTR [rsp+0xda0],0x0
     135f365:	00 00 
     135f367:	bf c0 02 00 00       	mov    edi,0x2c0
     135f36c:	e8 8f eb 48 00       	call   17edf00 <_Znwm@plt>
     135f371:	48 89 c3             	mov    rbx,rax

## Final definition only
- 0x135f2bd: mov    r14,rax
     135f195:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
     135f199:	7f 0e                	jg     135f1a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a472d>
     135f19b:	48 83 c0 18          	add    rax,0x18
     135f19f:	4c 39 f0             	cmp    rax,r14
     135f1a2:	75 f1                	jne    135f195 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4719>
     135f1a4:	4c 89 f3             	mov    rbx,r14
     135f1a7:	eb 03                	jmp    135f1ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4730>
     135f1a9:	48 89 c3             	mov    rbx,rax
     135f1ac:	48 89 9c 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rbx
     135f1b3:	00 
     135f1b4:	c6 84 24 20 02 00 00 	mov    BYTE PTR [rsp+0x220],0x1
     135f1bb:	01 
     135f1bc:	4c 39 f3             	cmp    rbx,r14
     135f1bf:	74 38                	je     135f1f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a477d>
     135f1c1:	4c 89 ef             	mov    rdi,r13
     135f1c4:	48 89 de             	mov    rsi,rbx
     135f1c7:	e8 ec 1b 00 00       	call   1360db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a633c>
     135f1cc:	48 8b 84 24 08 02 00 	mov    rax,QWORD PTR [rsp+0x208]
     135f1d3:	00 
     135f1d4:	48 83 c3 18          	add    rbx,0x18
     135f1d8:	48 39 c3             	cmp    rbx,rax
     135f1db:	74 14                	je     135f1f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4775>
     135f1dd:	48 8d 4b 18          	lea    rcx,[rbx+0x18]
     135f1e1:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     135f1e5:	48 89 cb             	mov    rbx,rcx
     135f1e8:	7e ee                	jle    135f1d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a475c>
     135f1ea:	48 83 c1 e8          	add    rcx,0xffffffffffffffe8
     135f1ee:	48 89 c8             	mov    rax,rcx
     135f1f1:	48 89 c3             	mov    rbx,rax
     135f1f4:	4c 39 f0             	cmp    rax,r14
     135f1f7:	75 c8                	jne    135f1c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4745>
     135f1f9:	8a 44 24 2f          	mov    al,BYTE PTR [rsp+0x2f]
     135f1fd:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     135f204:	48 63 84 24 e8 00 00 	movsxd rax,DWORD PTR [rsp+0xe8]
     135f20b:	00 
     135f20c:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
     135f213:	00 
     135f214:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     135f21b:	00 
     135f21c:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f21f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135f224:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f227:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f22a:	49 89 c6             	mov    r14,rax
     135f22d:	4c 89 a4 24 90 02 00 	mov    QWORD PTR [rsp+0x290],r12
     135f234:	00 
     135f235:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f23c:	00 
     135f23d:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
     135f244:	00 
     135f245:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     135f24a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f24d:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135f250:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135f257:	00 
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
     135f2e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135f2ec:	00 
     135f2ed:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135f2f4:	00 
     135f2f5:	e8 ec dc 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135f2fa:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135f301:	00 
     135f302:	48 8d b4 24 50 08 00 	lea    rsi,[rsp+0x850]
     135f309:	00 
     135f30a:	e8 fd 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f30f:	48 83 a4 24 30 0e 00 	and    QWORD PTR [rsp+0xe30],0x0
     135f316:	00 00 
     135f318:	6a 70                	push   0x70
     135f31a:	5f                   	pop    rdi
     135f31b:	e8 e0 eb 48 00       	call   17edf00 <_Znwm@plt>
     135f320:	48 89 c3             	mov    rbx,rax
     135f323:	48 8d 05 c6 8c 50 00 	lea    rax,[rip+0x508cc6]        # 1867ff0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x246d8>
     135f32a:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f32d:	48 89 df             	mov    rdi,rbx
     135f330:	48 83 c7 10          	add    rdi,0x10
     135f334:	48 8d b4 24 b0 0d 00 	lea    rsi,[rsp+0xdb0]
     135f33b:	00 
     135f33c:	e8 cb 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f341:	48 89 9c 24 30 0e 00 	mov    QWORD PTR [rsp+0xe30],rbx
     135f348:	00 
     135f349:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f350:	00 
     135f351:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135f358:	00 
     135f359:	e8 08 1c 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f35e:	48 83 a4 24 a0 0d 00 	and    QWORD PTR [rsp+0xda0],0x0
     135f365:	00 00 
     135f367:	bf c0 02 00 00       	mov    edi,0x2c0
     135f36c:	e8 8f eb 48 00       	call   17edf00 <_Znwm@plt>
     135f371:	48 89 c3             	mov    rbx,rax
     135f374:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135f37b:	00 
     135f37c:	48 8d 84 24 30 0a 00 	lea    rax,[rsp+0xa30]
     135f383:	00 
     135f384:	48 89 84 24 68 0f 00 	mov    QWORD PTR [rsp+0xf68],rax
     135f38b:	00 
     135f38c:	48 c7 84 24 70 0f 00 	mov    QWORD PTR [rsp+0xf70],0x1
     135f393:	00 01 00 00 00 
     135f398:	48 8d 05 99 8c 50 00 	lea    rax,[rip+0x508c99]        # 1868038 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24720>
     135f39f:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f3a2:	48 89 df             	mov    rdi,rbx
     135f3a5:	48 83 c7 10          	add    rdi,0x10
     135f3a9:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135f3b0:	00 
     135f3b1:	e8 b0 1b 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f3b6:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
     135f3bb:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135f3c2:	00 
     135f3c3:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135f3c7:	48 89 9c 24 a0 0d 00 	mov    QWORD PTR [rsp+0xda0],rbx
     135f3ce:	00 
     135f3cf:	e8 f6 ae 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     135f3d4:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     135f3db:	00 00 
     135f3dd:	48 8d 05 9c 8c 50 00 	lea    rax,[rip+0x508c9c]        # 1868080 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24768>
     135f3e4:	48 8d 8c 24 a0 0a 00 	lea    rcx,[rsp+0xaa0]
     135f3eb:	00 
     135f3ec:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f3ef:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f3f3:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135f3fa:	00 
     135f3fb:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     135f402:	00 
     135f403:	e8 9a 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
     135f408:	48 83 a4 24 90 0a 00 	and    QWORD PTR [rsp+0xa90],0x0
     135f40f:	00 00 
     135f411:	6a 50                	push   0x50
     135f413:	5f                   	pop    rdi
     135f414:	e8 e7 ea 48 00       	call   17edf00 <_Znwm@plt>
     135f419:	48 89 c3             	mov    rbx,rax
     135f41c:	48 8d ac 24 b8 03 00 	lea    rbp,[rsp+0x3b8]
     135f423:	00 
     135f424:	48 8d 05 9d 8c 50 00 	lea    rax,[rip+0x508c9d]        # 18680c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247b0>
     135f42b:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f42e:	48 89 df             	mov    rdi,rbx
     135f431:	48 83 c7 10          	add    rdi,0x10
     135f435:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
     135f43c:	00 
     135f43d:	e8 60 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
     135f442:	48 89 9c 24 90 0a 00 	mov    QWORD PTR [rsp+0xa90],rbx
     135f449:	00 
     135f44a:	48 8d 05 8f f4 4a 00 	lea    rax,[rip+0x4af48f]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     135f451:	48 8d 8c 24 00 0a 00 	lea    rcx,[rsp+0xa00]
     135f458:	00 
     135f459:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f45c:	48 8d 05 63 1a 00 00 	lea    rax,[rip+0x1a63]        # 1360ec6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a644a>
     135f463:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
     135f467:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f46b:	48 8d 05 9e 8c 50 00 	lea    rax,[rip+0x508c9e]        # 1868110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247f8>
     135f472:	48 8d 8c 24 d0 09 00 	lea    rcx,[rsp+0x9d0]
     135f479:	00 
     135f47a:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f47d:	48 8b 84 24 80 10 00 	mov    rax,QWORD PTR [rsp+0x1080]
     135f484:	00 
     135f485:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
     135f489:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f48d:	48 8d 05 6c 8d 50 00 	lea    rax,[rip+0x508d6c]        # 1868200 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x248e8>
     135f494:	49 89 06             	mov    QWORD PTR [r14],rax
     135f497:	48 8d 05 2a 8f 50 00 	lea    rax,[rip+0x508f2a]        # 18683c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ab0>
     135f49e:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     135f4a2:	48 8d 05 4f 8f 50 00 	lea    rax,[rip+0x508f4f]        # 18683f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ae0>
     135f4a9:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     135f4ad:	48 8d 05 0c 90 50 00 	lea    rax,[rip+0x50900c]        # 18684c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ba8>
     135f4b4:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     135f4b8:	49 8d 5e 20          	lea    rbx,[r14+0x20]
