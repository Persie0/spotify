# Potential restriction +0x470 field registration/parser trace

- 0x325e59: 'play_origin'
- 0x325e65: 'playback_id'

## Candidate caller around 0x105a45c
Function: 0x105a2d2..0x105af25

     105a2d2:	55                   	push   rbp
     105a2d3:	41 57                	push   r15
     105a2d5:	41 56                	push   r14
     105a2d7:	41 55                	push   r13
     105a2d9:	41 54                	push   r12
     105a2db:	53                   	push   rbx
     105a2dc:	48 81 ec 18 02 00 00 	sub    rsp,0x218
     105a2e3:	44 89 cd             	mov    ebp,r9d
     105a2e6:	4d 89 c6             	mov    r14,r8
     105a2e9:	48 89 cb             	mov    rbx,rcx
     105a2ec:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     105a2f1:	49 89 f7             	mov    r15,rsi
     105a2f4:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
     105a2f9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     105a300:	00 00 
     105a302:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
     105a309:	00 
     105a30a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     105a30f:	48 89 ce             	mov    rsi,rcx
     105a312:	e8 05 31 dd ff       	call   e2d41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4a2>
     105a317:	48 8d 35 cc 29 3e ff 	lea    rsi,[rip+0xffffffffff3e29cc]        # 43ccea <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x28f6>
     105a31e:	48 89 df             	mov    rdi,rbx
     105a321:	e8 12 31 dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a326:	48 8d 35 29 b5 2c ff 	lea    rsi,[rip+0xffffffffff2cb529]        # 325856 <_ZTSSt12bad_any_cast@@Base-0x6a972>
     105a32d:	48 89 df             	mov    rdi,rbx
     105a330:	e8 27 3c dd ff       	call   e2df5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfafe2>
     105a335:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     105a33a:	48 8b 80 b0 0d 00 00 	mov    rax,QWORD PTR [rax+0xdb0]
     105a341:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     105a346:	48 8d 35 60 95 2d ff 	lea    rsi,[rip+0xffffffffff2d9560]        # 3338ad <_ZTSSt12bad_any_cast@@Base-0x5c91b>
     105a34d:	48 89 df             	mov    rdi,rbx
     105a350:	e8 e3 30 dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a355:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
     105a35a:	48 89 df             	mov    rdi,rbx
     105a35d:	e8 ef f0 fa ff       	call   1009451 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0867>
     105a362:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
     105a367:	40 84 ed             	test   bpl,bpl
     105a36a:	74 26                	je     105a392 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2217a8>
     105a36c:	4c 89 74 24 68       	mov    QWORD PTR [rsp+0x68],r14
     105a371:	48 8d 35 70 b7 2d ff 	lea    rsi,[rip+0xffffffffff2db770]        # 335ae8 <_ZTSSt12bad_any_cast@@Base-0x5a6e0>
     105a378:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     105a37d:	48 89 df             	mov    rdi,rbx
     105a380:	e8 b3 30 dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a385:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
     105a38a:	48 89 df             	mov    rdi,rbx
     105a38d:	e8 bf f0 fa ff       	call   1009451 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0867>
     105a392:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a397:	80 b8 70 05 00 00 00 	cmp    BYTE PTR [rax+0x570],0x0
     105a39e:	0f 84 2d 01 00 00    	je     105a4d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2218e7>
     105a3a4:	48 8d b8 70 06 00 00 	lea    rdi,[rax+0x670]
     105a3ab:	4c 8d b0 a8 00 00 00 	lea    r14,[rax+0xa8]
     105a3b2:	48 8d 90 30 05 00 00 	lea    rdx,[rax+0x530]
     105a3b9:	48 8d 35 d0 21 3e ff 	lea    rsi,[rip+0xffffffffff3e21d0]        # 43c590 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x219c>
     105a3c0:	e8 17 f2 b7 ff       	call   bd95dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12657c>
     105a3c5:	48 8d 35 ac 26 3e ff 	lea    rsi,[rip+0xffffffffff3e26ac]        # 43ca78 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2684>
     105a3cc:	4c 89 f7             	mov    rdi,r14
     105a3cf:	48 89 c2             	mov    rdx,rax
     105a3d2:	e8 05 f2 b7 ff       	call   bd95dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12657c>
     105a3d7:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     105a3de:	00 
     105a3df:	48 89 c6             	mov    rsi,rax
     105a3e2:	e8 59 3b 79 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     105a3e7:	48 8d 35 f2 ce 2d ff 	lea    rsi,[rip+0xffffffffff2dcef2]        # 3372e0 <_ZTSSt12bad_any_cast@@Base-0x58ee8>
     105a3ee:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
     105a3f5:	00 
     105a3f6:	e8 83 f6 a1 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     105a3fb:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     105a400:	48 8d 94 24 d8 01 00 	lea    rdx,[rsp+0x1d8]
     105a407:	00 
     105a408:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     105a40d:	48 89 de             	mov    rsi,rbx
     105a410:	e8 97 0b 00 00       	call   105afac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2223c2>
     105a415:	48 8d 35 c4 ce 2d ff 	lea    rsi,[rip+0xffffffffff2dcec4]        # 3372e0 <_ZTSSt12bad_any_cast@@Base-0x58ee8>
     105a41c:	48 89 df             	mov    rdi,rbx
     105a41f:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     105a424:	e8 c5 0b 00 00       	call   105afee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222404>
     105a429:	48 8d 35 b9 6c 30 ff 	lea    rsi,[rip+0xffffffffff306cb9]        # 3610e9 <_ZTSSt12bad_any_cast@@Base-0x2f0df>
     105a430:	48 8d 94 24 38 01 00 	lea    rdx,[rsp+0x138]
     105a437:	00 
     105a438:	48 89 df             	mov    rdi,rbx
     105a43b:	e8 ef 0c 00 00       	call   105b12f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222545>
     105a440:	48 8d 35 62 fc 2d ff 	lea    rsi,[rip+0xffffffffff2dfc62]        # 33a0a9 <_ZTSSt12bad_any_cast@@Base-0x5611f>
     105a447:	48 8d 94 24 38 01 00 	lea    rdx,[rsp+0x138]
     105a44e:	00 
     105a44f:	48 89 df             	mov    rdi,rbx
     105a452:	e8 09 31 dd ff       	call   e2d560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa5e6>
     105a457:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a45c:	48 8d 90 70 04 00 00 	lea    rdx,[rax+0x470]
     105a463:	48 8d 35 ef b9 2c ff 	lea    rsi,[rip+0xffffffffff2cb9ef]        # 325e59 <_ZTSSt12bad_any_cast@@Base-0x6a36f>
     105a46a:	48 89 df             	mov    rdi,rbx
     105a46d:	e8 c2 0c 00 00       	call   105b134 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22254a>
     105a472:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a477:	48 8d b0 48 05 00 00 	lea    rsi,[rax+0x548]
     105a47e:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105a483:	e8 56 df 61 00       	call   16783de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c54a>
     105a488:	48 8d 35 d6 b9 2c ff 	lea    rsi,[rip+0xffffffffff2cb9d6]        # 325e65 <_ZTSSt12bad_any_cast@@Base-0x6a363>
     105a48f:	48 8d 54 24 68       	lea    rdx,[rsp+0x68]
     105a494:	48 89 df             	mov    rdi,rbx
     105a497:	e8 c4 30 dd ff       	call   e2d560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa5e6>
     105a49c:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105a4a1:	e8 ea 39 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105a4a6:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     105a4ab:	e8 2a 31 dd ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     105a4b0:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
     105a4b7:	00 
     105a4b8:	e8 d3 39 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105a4bd:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     105a4c4:	00 
     105a4c5:	e8 c6 39 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105a4ca:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     105a4cf:	eb 2e                	jmp    105a4ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221915>
     105a4d1:	48 8d 35 08 ce 2d ff 	lea    rsi,[rip+0xffffffffff2dce08]        # 3372e0 <_ZTSSt12bad_any_cast@@Base-0x58ee8>
     105a4d8:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     105a4dd:	48 89 df             	mov    rdi,rbx
     105a4e0:	e8 53 2f dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a4e5:	48 89 df             	mov    rdi,rbx
     105a4e8:	e8 19 37 dd ff       	call   e2dc06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfac8c>
     105a4ed:	48 8d 35 56 6d 2e ff 	lea    rsi,[rip+0xffffffffff2e6d56]        # 34124a <_ZTSSt12bad_any_cast@@Base-0x4ef7e>
     105a4f4:	6a 04                	push   0x4
     105a4f6:	5a                   	pop    rdx
     105a4f7:	48 89 df             	mov    rdi,rbx
     105a4fa:	e8 8b 38 dd ff       	call   e2dd8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfae10>
     105a4ff:	48 8d 35 2d 3d 2e ff 	lea    rsi,[rip+0xffffffffff2e3d2d]        # 33e233 <_ZTSSt12bad_any_cast@@Base-0x51f95>
     105a506:	48 89 df             	mov    rdi,rbx
     105a509:	e8 2a 2f dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a50e:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
     105a515:	00 
     105a516:	48 89 de             	mov    rsi,rbx
     105a519:	e8 12 0d 00 00       	call   105b230 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222646>
     105a51e:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     105a523:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a528:	4c 8b a8 78 05 00 00 	mov    r13,QWORD PTR [rax+0x578]
     105a52f:	4c 3b a8 80 05 00 00 	cmp    r13,QWORD PTR [rax+0x580]
     105a536:	0f 84 c8 00 00 00    	je     105a604 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221a1a>
     105a53c:	4c 8d 3d 66 fb 2d ff 	lea    r15,[rip+0xffffffffff2dfb66]        # 33a0a9 <_ZTSSt12bad_any_cast@@Base-0x5611f>
     105a543:	48 8d 2d 0f b9 2c ff 	lea    rbp,[rip+0xffffffffff2cb90f]        # 325e59 <_ZTSSt12bad_any_cast@@Base-0x6a36f>
     105a54a:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
     105a54f:	4c 8d 35 0f b9 2c ff 	lea    r14,[rip+0xffffffffff2cb90f]        # 325e65 <_ZTSSt12bad_any_cast@@Base-0x6a363>
     105a556:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     105a55b:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     105a562:	00 
     105a563:	48 89 de             	mov    rsi,rbx
     105a566:	e8 b1 2e dd ff       	call   e2d41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4a2>
     105a56b:	48 89 df             	mov    rdi,rbx
     105a56e:	48 8d 35 6b cd 2d ff 	lea    rsi,[rip+0xffffffffff2dcd6b]        # 3372e0 <_ZTSSt12bad_any_cast@@Base-0x58ee8>
     105a575:	4c 89 ea             	mov    rdx,r13
     105a578:	e8 71 0a 00 00       	call   105afee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222404>
     105a57d:	49 81 c5 30 05 00 00 	add    r13,0x530
     105a584:	48 89 df             	mov    rdi,rbx
     105a587:	48 8d 35 5b 6b 30 ff 	lea    rsi,[rip+0xffffffffff306b5b]        # 3610e9 <_ZTSSt12bad_any_cast@@Base-0x2f0df>
     105a58e:	4c 89 ea             	mov    rdx,r13
     105a591:	e8 99 0b 00 00       	call   105b12f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222545>
     105a596:	48 89 df             	mov    rdi,rbx
     105a599:	4c 89 fe             	mov    rsi,r15
     105a59c:	4c 89 ea             	mov    rdx,r13
     105a59f:	e8 bc 2f dd ff       	call   e2d560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa5e6>
     105a5a4:	49 81 c5 40 ff ff ff 	add    r13,0xffffffffffffff40
     105a5ab:	48 89 df             	mov    rdi,rbx
     105a5ae:	48 89 ee             	mov    rsi,rbp
     105a5b1:	4c 89 ea             	mov    rdx,r13
     105a5b4:	e8 7b 0b 00 00       	call   105b134 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22254a>
     105a5b9:	49 81 c5 d8 00 00 00 	add    r13,0xd8
     105a5c0:	4c 89 e7             	mov    rdi,r12
     105a5c3:	4c 89 ee             	mov    rsi,r13
     105a5c6:	e8 13 de 61 00       	call   16783de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c54a>
     105a5cb:	48 89 df             	mov    rdi,rbx
     105a5ce:	4c 89 f6             	mov    rsi,r14
     105a5d1:	4c 89 e2             	mov    rdx,r12
     105a5d4:	e8 87 2f dd ff       	call   e2d560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa5e6>
     105a5d9:	4c 89 e7             	mov    rdi,r12
     105a5dc:	e8 af 38 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105a5e1:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
     105a5e8:	00 
     105a5e9:	e8 ec 2f dd ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     105a5ee:	49 83 c5 28          	add    r13,0x28
     105a5f2:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a5f7:	4c 3b a8 80 05 00 00 	cmp    r13,QWORD PTR [rax+0x580]
     105a5fe:	0f 85 57 ff ff ff    	jne    105a55b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221971>
     105a604:	4c 8d b4 24 d8 01 00 	lea    r14,[rsp+0x1d8]
     105a60b:	00 
     105a60c:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     105a60f:	e8 6e ee fa ff       	call   1009482 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0898>
     105a614:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a619:	48 8d b0 38 06 00 00 	lea    rsi,[rax+0x638]
     105a620:	4c 89 f7             	mov    rdi,r14
     105a623:	e8 58 03 61 00       	call   166a980 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1eaec>
     105a628:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
     105a62d:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     105a632:	80 b8 20 0e 00 00 00 	cmp    BYTE PTR [rax+0xe20],0x0
     105a639:	74 6e                	je     105a6a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221abf>
     105a63b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a640:	80 b8 70 05 00 00 00 	cmp    BYTE PTR [rax+0x570],0x0
     105a647:	74 60                	je     105a6a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221abf>
     105a649:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     105a64e:	48 8d 73 30          	lea    rsi,[rbx+0x30]
     105a652:	48 8d 15 e7 1a 3e ff 	lea    rdx,[rip+0xffffffffff3e1ae7]        # 43c140 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1d4c>
     105a659:	4c 8d 74 24 68       	lea    r14,[rsp+0x68]
     105a65e:	4c 89 f7             	mov    rdi,r14
     105a661:	e8 da ef b7 ff       	call   bd9640 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1265e0>
     105a666:	48 6b 43 38 30       	imul   rax,QWORD PTR [rbx+0x38],0x30
     105a66b:	48 03 43 30          	add    rax,QWORD PTR [rbx+0x30]
     105a66f:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     105a672:	48 39 c7             	cmp    rdi,rax
     105a675:	74 32                	je     105a6a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221abf>
     105a677:	48 83 c7 18          	add    rdi,0x18
     105a67b:	e8 b6 11 a2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     105a680:	48 89 c7             	mov    rdi,rax
     105a683:	48 89 d6             	mov    rsi,rdx
     105a686:	e8 b9 1f 78 00       	call   17dc644 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x8465>
     105a68b:	84 d2                	test   dl,dl
     105a68d:	74 1a                	je     105a6a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221abf>
     105a68f:	66 48 0f 6e c0       	movq   xmm0,rax
     105a694:	f2 0f 5a c0          	cvtsd2ss xmm0,xmm0
     105a698:	f3 0f 11 84 24 dc 01 	movss  DWORD PTR [rsp+0x1dc],xmm0
     105a69f:	00 00 
     105a6a1:	c6 84 24 e0 01 00 00 	mov    BYTE PTR [rsp+0x1e0],0x1
     105a6a8:	01 
     105a6a9:	48 8d 35 a3 96 31 ff 	lea    rsi,[rip+0xffffffffff3196a3]        # 373d53 <_ZTSSt12bad_any_cast@@Base-0x1c475>
     105a6b0:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     105a6b5:	48 89 df             	mov    rdi,rbx
     105a6b8:	e8 7b 2d dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a6bd:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105a6c2:	48 89 de             	mov    rsi,rbx
     105a6c5:	e8 52 2d dd ff       	call   e2d41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4a2>
     105a6ca:	48 8d 35 ae 43 32 ff 	lea    rsi,[rip+0xffffffffff3243ae]        # 37ea7f <_ZTSSt12bad_any_cast@@Base-0x11749>
     105a6d1:	48 8d 94 24 d8 01 00 	lea    rdx,[rsp+0x1d8]
     105a6d8:	00 
     105a6d9:	48 89 df             	mov    rdi,rbx
     105a6dc:	e8 6a 0b 00 00       	call   105b24b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222661>
     105a6e1:	48 8d 94 24 d9 01 00 	lea    rdx,[rsp+0x1d9]
     105a6e8:	00 
     105a6e9:	48 8d 35 de 17 33 ff 	lea    rsi,[rip+0xffffffffff3317de]        # 38bece <_ZTSSt12bad_any_cast@@Base-0x42fa>
     105a6f0:	48 89 df             	mov    rdi,rbx
     105a6f3:	e8 53 0b 00 00       	call   105b24b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222661>
     105a6f8:	48 8d 35 0d 13 32 ff 	lea    rsi,[rip+0xffffffffff32130d]        # 37ba0c <_ZTSSt12bad_any_cast@@Base-0x147bc>
     105a6ff:	48 89 df             	mov    rdi,rbx
     105a702:	e8 31 2d dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a707:	0f b6 b4 24 da 01 00 	movzx  esi,BYTE PTR [rsp+0x1da]
     105a70e:	00 
     105a70f:	48 89 df             	mov    rdi,rbx
     105a712:	e8 6b 2e dd ff       	call   e2d582 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa608>
     105a717:	80 bc 24 e0 01 00 00 	cmp    BYTE PTR [rsp+0x1e0],0x0
     105a71e:	00 
     105a71f:	74 1f                	je     105a740 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221b56>
     105a721:	48 8d 35 a0 43 32 ff 	lea    rsi,[rip+0xffffffffff3243a0]        # 37eac8 <_ZTSSt12bad_any_cast@@Base-0x11700>
     105a728:	48 89 df             	mov    rdi,rbx
     105a72b:	e8 08 2d dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a730:	48 8d b4 24 dc 01 00 	lea    rsi,[rsp+0x1dc]
     105a737:	00 
     105a738:	48 89 df             	mov    rdi,rbx
     105a73b:	e8 2c 0b 00 00       	call   105b26c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222682>
     105a740:	48 83 bc 24 00 02 00 	cmp    QWORD PTR [rsp+0x200],0x0
     105a747:	00 00 
     105a749:	74 1f                	je     105a76a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221b80>
     105a74b:	48 8d 35 59 69 30 ff 	lea    rsi,[rip+0xffffffffff306959]        # 3610ab <_ZTSSt12bad_any_cast@@Base-0x2f11d>
     105a752:	48 89 df             	mov    rdi,rbx
     105a755:	e8 de 2c dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a75a:	48 8d b4 24 e8 01 00 	lea    rsi,[rsp+0x1e8]
     105a761:	00 
     105a762:	48 89 df             	mov    rdi,rbx
     105a765:	e8 2b 0c 00 00       	call   105b395 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2227ab>
     105a76a:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     105a76f:	e8 66 2e dd ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     105a774:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     105a779:	48 8d 90 30 06 00 00 	lea    rdx,[rax+0x630]
     105a780:	48 8d 35 49 0b 2f ff 	lea    rsi,[rip+0xffffffffff2f0b49]        # 34b2d0 <_ZTSSt12bad_any_cast@@Base-0x44ef8>
     105a787:	48 89 df             	mov    rdi,rbx
     105a78a:	e8 bc 0a 00 00       	call   105b24b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222661>
     105a78f:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     105a794:	48 8b b8 10 0e 00 00 	mov    rdi,QWORD PTR [rax+0xe10]
     105a79b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     105a79e:	ff 50 10             	call   QWORD PTR [rax+0x10]
     105a7a1:	89 c5                	mov    ebp,eax
     105a7a3:	48 8d 35 eb 45 2d ff 	lea    rsi,[rip+0xffffffffff2d45eb]        # 32ed95 <_ZTSSt12bad_any_cast@@Base-0x61433>
     105a7aa:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105a7af:	e8 84 2c dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a7b4:	31 f6                	xor    esi,esi
     105a7b6:	85 ed                	test   ebp,ebp
     105a7b8:	40 0f 94 c6          	sete   sil
     105a7bc:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105a7c1:	e8 bc 2d dd ff       	call   e2d582 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa608>
     105a7c6:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     105a7cb:	80 bb 70 05 00 00 00 	cmp    BYTE PTR [rbx+0x570],0x0
     105a7d2:	74 2d                	je     105a801 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221c17>
     105a7d4:	48 89 df             	mov    rdi,rbx
     105a7d7:	e8 5b 04 62 00       	call   167ac37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eda3>
     105a7dc:	84 c0                	test   al,al
     105a7de:	74 21                	je     105a801 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221c17>
     105a7e0:	80 bb 11 06 00 00 00 	cmp    BYTE PTR [rbx+0x611],0x0
     105a7e7:	74 18                	je     105a801 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221c17>
     105a7e9:	4c 8d b3 10 06 00 00 	lea    r14,[rbx+0x610]
     105a7f0:	4c 89 f7             	mov    rdi,r14
     105a7f3:	e8 e8 be b7 ff       	call   bd66e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x123680>
     105a7f8:	41 8a 06             	mov    al,BYTE PTR [r14]
     105a7fb:	88 44 24 67          	mov    BYTE PTR [rsp+0x67],al
     105a7ff:	eb 2b                	jmp    105a82c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221c42>
     105a801:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105a806:	6a 03                	push   0x3
     105a808:	5e                   	pop    rsi
     105a809:	e8 a4 11 4d 00       	call   152b9b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370f36>
     105a80e:	4c 8d 74 24 68       	lea    r14,[rsp+0x68]
     105a813:	4c 89 ff             	mov    rdi,r15
     105a816:	4c 89 f6             	mov    rsi,r14
     105a819:	e8 d0 4e a4 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     105a81e:	34 01                	xor    al,0x1
     105a820:	88 44 24 67          	mov    BYTE PTR [rsp+0x67],al
     105a824:	4c 89 f7             	mov    rdi,r14
     105a827:	e8 64 36 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105a82c:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     105a831:	48 8d 35 8c 90 2d ff 	lea    rsi,[rip+0xffffffffff2d908c]        # 3338c4 <_ZTSSt12bad_any_cast@@Base-0x5c904>
     105a838:	48 8d 54 24 67       	lea    rdx,[rsp+0x67]
     105a83d:	48 89 df             	mov    rdi,rbx
     105a840:	e8 06 0a 00 00       	call   105b24b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222661>
     105a845:	48 8d 35 88 5f 30 ff 	lea    rsi,[rip+0xffffffffff305f88]        # 3607d4 <_ZTSSt12bad_any_cast@@Base-0x2f9f4>
     105a84c:	48 89 df             	mov    rdi,rbx
     105a84f:	e8 e4 2b dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a854:	48 89 df             	mov    rdi,rbx
     105a857:	4c 89 fe             	mov    rsi,r15
     105a85a:	e8 81 35 dd ff       	call   e2dde0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfae66>
     105a85f:	48 8d 15 36 68 30 ff 	lea    rdx,[rip+0xffffffffff306836]        # 36109c <_ZTSSt12bad_any_cast@@Base-0x2f12c>
     105a866:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     105a86d:	00 
     105a86e:	48 89 de             	mov    rsi,rbx
     105a871:	e8 b4 0b 00 00       	call   105b42a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222840>
     105a876:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     105a87b:	80 bb 98 05 00 00 00 	cmp    BYTE PTR [rbx+0x598],0x0
     105a882:	74 3b                	je     105a8bf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221cd5>
     105a884:	48 8b 83 90 05 00 00 	mov    rax,QWORD PTR [rbx+0x590]
     105a88b:	b9 e8 03 00 00       	mov    ecx,0x3e8
     105a890:	48 99                	cqo
     105a892:	48 f7 f9             	idiv   rcx
     105a895:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     105a89a:	48 8d 35 f9 f1 2c ff 	lea    rsi,[rip+0xffffffffff2cf1f9]        # 329a9a <_ZTSSt12bad_any_cast@@Base-0x6672e>
     105a8a1:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105a8a6:	e8 8d 2b dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105a8ab:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
     105a8b0:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105a8b5:	e8 97 eb fa ff       	call   1009451 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0867>
     105a8ba:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     105a8bf:	80 bb a8 05 00 00 00 	cmp    BYTE PTR [rbx+0x5a8],0x0
     105a8c6:	74 2f                	je     105a8f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221d0d>
     105a8c8:	48 8b 83 a0 05 00 00 	mov    rax,QWORD PTR [rbx+0x5a0]
     105a8cf:	b9 e8 03 00 00       	mov    ecx,0x3e8
     105a8d4:	48 99                	cqo
     105a8d6:	48 f7 f9             	idiv   rcx
     105a8d9:	48 8d 54 24 68       	lea    rdx,[rsp+0x68]
     105a8de:	48 89 02             	mov    QWORD PTR [rdx],rax
     105a8e1:	48 8d 35 97 9e 2e ff 	lea    rsi,[rip+0xffffffffff2e9e97]        # 34477f <_ZTSSt12bad_any_cast@@Base-0x4ba49>
     105a8e8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105a8ed:	e8 7a 0b 00 00       	call   105b46c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222882>
     105a8f2:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     105a8f7:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
     105a8fe:	00 
     105a8ff:	e8 d6 2c dd ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     105a904:	80 bb b0 06 00 00 00 	cmp    BYTE PTR [rbx+0x6b0],0x0
     105a90b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105a910:	74 2f                	je     105a941 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221d57>
     105a912:	48 8b 83 a8 06 00 00 	mov    rax,QWORD PTR [rbx+0x6a8]
     105a919:	b9 e8 03 00 00       	mov    ecx,0x3e8
     105a91e:	48 99                	cqo
     105a920:	48 f7 f9             	idiv   rcx
     105a923:	48 8d 54 24 68       	lea    rdx,[rsp+0x68]
     105a928:	48 89 02             	mov    QWORD PTR [rdx],rax
     105a92b:	48 8d 35 8f ce 30 ff 	lea    rsi,[rip+0xffffffffff30ce8f]        # 3677c1 <_ZTSSt12bad_any_cast@@Base-0x28a07>
     105a932:	e8 35 0b 00 00       	call   105b46c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222882>
     105a937:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105a93c:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     105a941:	48 8b 83 18 06 00 00 	mov    rax,QWORD PTR [rbx+0x618]
     105a948:	48 85 c0             	test   rax,rax
     105a94b:	0f 84 b1 03 00 00    	je     105ad02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222118>
     105a951:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     105a954:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     105a958:	48 85 c0             	test   rax,rax
     105a95b:	74 05                	je     105a962 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221d78>
     105a95d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     105a962:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     105a967:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     105a96a:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     105a971:	00 
     105a972:	ff 50 58             	call   QWORD PTR [rax+0x58]
     105a975:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
     105a97c:	00 
     105a97d:	48 83 a7 48 ff ff ff 	and    QWORD PTR [rdi-0xb8],0x0
     105a984:	00 
     105a985:	48 8d 05 cc dd 7e 00 	lea    rax,[rip+0x7eddcc]        # 1848758 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4e40>
     105a98c:	48 89 87 40 ff ff ff 	mov    QWORD PTR [rdi-0xc0],rax
     105a993:	0f 57 c0             	xorps  xmm0,xmm0
     105a996:	0f 11 87 50 ff ff ff 	movups XMMWORD PTR [rdi-0xb0],xmm0
     105a99d:	0f 11 87 60 ff ff ff 	movups XMMWORD PTR [rdi-0xa0],xmm0
     105a9a4:	0f 11 87 70 ff ff ff 	movups XMMWORD PTR [rdi-0x90],xmm0
     105a9ab:	0f 11 47 80          	movups XMMWORD PTR [rdi-0x80],xmm0
     105a9af:	48 83 67 a0 00       	and    QWORD PTR [rdi-0x60],0x0
     105a9b4:	0f 11 47 90          	movups XMMWORD PTR [rdi-0x70],xmm0
     105a9b8:	48 8d 05 69 63 89 00 	lea    rax,[rip+0x896369]        # 18f0d28 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x38138>
     105a9bf:	48 89 47 a8          	mov    QWORD PTR [rdi-0x58],rax
     105a9c3:	0f 28 0d 06 33 33 ff 	movaps xmm1,XMMWORD PTR [rip+0xffffffffff333306]        # 38dcd0 <_ZTSSt12bad_any_cast@@Base-0x24f8>
     105a9ca:	0f 11 4f b0          	movups XMMWORD PTR [rdi-0x50],xmm1
     105a9ce:	48 8d 05 f3 4b 3e ff 	lea    rax,[rip+0xffffffffff3e4bf3]        # 43f5c8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x51d4>
     105a9d5:	48 89 47 c0          	mov    QWORD PTR [rdi-0x40],rax
     105a9d9:	0f 11 47 c8          	movups XMMWORD PTR [rdi-0x38],xmm0
     105a9dd:	48 8d 0d 1c 63 89 00 	lea    rcx,[rip+0x89631c]        # 18f0d00 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x38110>
     105a9e4:	48 89 4f d8          	mov    QWORD PTR [rdi-0x28],rcx
     105a9e8:	0f 11 4f e0          	movups XMMWORD PTR [rdi-0x20],xmm1
     105a9ec:	48 89 47 f0          	mov    QWORD PTR [rdi-0x10],rax
     105a9f0:	48 83 67 f8 00       	and    QWORD PTR [rdi-0x8],0x0
     105a9f5:	48 8d 05 fc 4d 3e ff 	lea    rax,[rip+0xffffffffff3e4dfc]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     105a9fc:	48 89 07             	mov    QWORD PTR [rdi],rax
     105a9ff:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0
     105aa04:	80 bc 24 a0 01 00 00 	cmp    BYTE PTR [rsp+0x1a0],0x0
     105aa0b:	00 
     105aa0c:	74 1e                	je     105aa2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221e42>
     105aa0e:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
     105aa15:	00 
     105aa16:	b9 e8 03 00 00       	mov    ecx,0x3e8
     105aa1b:	48 99                	cqo
     105aa1d:	48 f7 f9             	idiv   rcx
     105aa20:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
     105aa27:	00 
     105aa28:	6a 03                	push   0x3
     105aa2a:	eb 02                	jmp    105aa2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221e44>
     105aa2c:	6a 01                	push   0x1
     105aa2e:	58                   	pop    rax
     105aa2f:	89 44 24 78          	mov    DWORD PTR [rsp+0x78],eax
     105aa33:	48 8d b4 24 38 01 00 	lea    rsi,[rsp+0x138]
     105aa3a:	00 
     105aa3b:	31 d2                	xor    edx,edx
     105aa3d:	e8 50 ad 70 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     105aa42:	48 8d 9c 24 b0 01 00 	lea    rbx,[rsp+0x1b0]
     105aa49:	00 
     105aa4a:	4c 8b 73 f8          	mov    r14,QWORD PTR [rbx-0x8]
     105aa4e:	49 39 de             	cmp    r14,rbx
     105aa51:	74 38                	je     105aa8b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221ea1>
     105aa53:	4c 8d bc 24 c8 00 00 	lea    r15,[rsp+0xc8]
     105aa5a:	00 
     105aa5b:	4c 89 ff             	mov    rdi,r15
     105aa5e:	e8 a7 9f ad ff       	call   b34a0a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x819aa>
     105aa63:	49 8d 76 20          	lea    rsi,[r14+0x20]
     105aa67:	48 89 c7             	mov    rdi,rax
     105aa6a:	e8 cf ad ae ff       	call   b4583e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x927de>
     105aa6f:	49 8d 76 38          	lea    rsi,[r14+0x38]
     105aa73:	48 89 c7             	mov    rdi,rax
     105aa76:	e8 05 36 79 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     105aa7b:	4c 89 f7             	mov    rdi,r14
     105aa7e:	e8 5f 3d a4 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     105aa83:	49 89 c6             	mov    r14,rax
     105aa86:	48 39 d8             	cmp    rax,rbx
     105aa89:	75 d0                	jne    105aa5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221e71>
     105aa8b:	48 8d 9c 24 c8 01 00 	lea    rbx,[rsp+0x1c8]
     105aa92:	00 
     105aa93:	4c 8b 73 f8          	mov    r14,QWORD PTR [rbx-0x8]
     105aa97:	49 39 de             	cmp    r14,rbx
     105aa9a:	74 38                	je     105aad4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221eea>
     105aa9c:	4c 8d bc 24 f8 00 00 	lea    r15,[rsp+0xf8]
     105aaa3:	00 
     105aaa4:	4c 89 ff             	mov    rdi,r15
     105aaa7:	e8 5e 9f ad ff       	call   b34a0a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x819aa>
     105aaac:	49 8d 76 20          	lea    rsi,[r14+0x20]
     105aab0:	48 89 c7             	mov    rdi,rax
     105aab3:	e8 86 ad ae ff       	call   b4583e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x927de>
     105aab8:	49 8d 76 38          	lea    rsi,[r14+0x38]
     105aabc:	48 89 c7             	mov    rdi,rax
     105aabf:	e8 bc 35 79 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     105aac4:	4c 89 f7             	mov    rdi,r14
     105aac7:	e8 16 3d a4 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     105aacc:	49 89 c6             	mov    r14,rax
     105aacf:	48 39 d8             	cmp    rax,rbx
     105aad2:	75 d0                	jne    105aaa4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221eba>
     105aad4:	4c 8b b4 24 50 01 00 	mov    r14,QWORD PTR [rsp+0x150]
     105aadb:	00 
     105aadc:	4c 8b ac 24 58 01 00 	mov    r13,QWORD PTR [rsp+0x158]
     105aae3:	00 
     105aae4:	4d 39 ee             	cmp    r14,r13
     105aae7:	74 77                	je     105ab60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221f76>
     105aae9:	48 8d 6c 24 48       	lea    rbp,[rsp+0x48]
     105aaee:	bb e8 03 00 00       	mov    ebx,0x3e8
     105aaf3:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     105aafa:	00 
     105aafb:	48 89 ee             	mov    rsi,rbp
     105aafe:	48 8d 15 6c de 00 00 	lea    rdx,[rip+0xde6c]        # 1068971 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22fd87>
     105ab05:	e8 cc e3 a7 ff       	call   ad8ed6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e76>
     105ab0a:	49 89 c4             	mov    r12,rax
     105ab0d:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     105ab11:	48 99                	cqo
     105ab13:	48 f7 fb             	idiv   rbx
     105ab16:	49 89 c7             	mov    r15,rax
     105ab19:	41 83 4c 24 10 01    	or     DWORD PTR [r12+0x10],0x1
     105ab1f:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
     105ab24:	f6 c2 01             	test   dl,0x1
     105ab27:	75 2e                	jne    105ab57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221f6d>
     105ab29:	4c 89 e7             	mov    rdi,r12
     105ab2c:	48 83 c7 18          	add    rdi,0x18
     105ab30:	4c 89 f6             	mov    rsi,r14
     105ab33:	e8 5a ac 70 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     105ab38:	41 8a 46 20          	mov    al,BYTE PTR [r14+0x20]
     105ab3c:	41 88 44 24 30       	mov    BYTE PTR [r12+0x30],al
     105ab41:	4d 89 7c 24 28       	mov    QWORD PTR [r12+0x28],r15
     105ab46:	41 80 4c 24 10 0c    	or     BYTE PTR [r12+0x10],0xc
     105ab4c:	49 83 c6 28          	add    r14,0x28
     105ab50:	4d 39 ee             	cmp    r14,r13
     105ab53:	75 9e                	jne    105aaf3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221f09>
     105ab55:	eb 09                	jmp    105ab60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221f76>
     105ab57:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     105ab5b:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     105ab5e:	eb c9                	jmp    105ab29 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221f3f>
     105ab60:	4c 8b b4 24 68 01 00 	mov    r14,QWORD PTR [rsp+0x168]
     105ab67:	00 
     105ab68:	48 8b 9c 24 70 01 00 	mov    rbx,QWORD PTR [rsp+0x170]
     105ab6f:	00 
     105ab70:	49 39 de             	cmp    r14,rbx
     105ab73:	74 6f                	je     105abe4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221ffa>
     105ab75:	48 8d 6c 24 48       	lea    rbp,[rsp+0x48]
     105ab7a:	41 bd e8 03 00 00    	mov    r13d,0x3e8
     105ab80:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
     105ab87:	00 
     105ab88:	48 89 ee             	mov    rsi,rbp
     105ab8b:	48 8d 15 f0 dd 00 00 	lea    rdx,[rip+0xddf0]        # 1068982 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22fd98>
     105ab92:	e8 3f e3 a7 ff       	call   ad8ed6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e76>
     105ab97:	49 89 c4             	mov    r12,rax
     105ab9a:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     105ab9e:	48 99                	cqo
     105aba0:	49 f7 fd             	idiv   r13
     105aba3:	49 89 c7             	mov    r15,rax
     105aba6:	41 83 4c 24 10 01    	or     DWORD PTR [r12+0x10],0x1
     105abac:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
     105abb1:	f6 c2 01             	test   dl,0x1
     105abb4:	75 25                	jne    105abdb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221ff1>
     105abb6:	4c 89 e7             	mov    rdi,r12
     105abb9:	48 83 c7 18          	add    rdi,0x18
     105abbd:	4c 89 f6             	mov    rsi,r14
     105abc0:	e8 cd ab 70 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     105abc5:	4d 89 7c 24 20       	mov    QWORD PTR [r12+0x20],r15
     105abca:	41 80 4c 24 10 02    	or     BYTE PTR [r12+0x10],0x2
     105abd0:	49 83 c6 20          	add    r14,0x20
     105abd4:	49 39 de             	cmp    r14,rbx
     105abd7:	75 a7                	jne    105ab80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221f96>
     105abd9:	eb 09                	jmp    105abe4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221ffa>
     105abdb:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     105abdf:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     105abe2:	eb d2                	jmp    105abb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x221fcc>
     105abe4:	4c 8b b4 24 80 01 00 	mov    r14,QWORD PTR [rsp+0x180]
     105abeb:	00 
     105abec:	48 8b ac 24 88 01 00 	mov    rbp,QWORD PTR [rsp+0x188]
     105abf3:	00 
     105abf4:	49 39 ee             	cmp    r14,rbp
     105abf7:	0f 84 82 00 00 00    	je     105ac7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222095>
     105abfd:	bb e8 03 00 00       	mov    ebx,0x3e8
     105ac02:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     105ac09:	00 
     105ac0a:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     105ac0f:	48 8d 15 7d dd 00 00 	lea    rdx,[rip+0xdd7d]        # 1068993 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22fda9>
     105ac16:	e8 bb e2 a7 ff       	call   ad8ed6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e76>
     105ac1b:	49 89 c4             	mov    r12,rax
     105ac1e:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     105ac22:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
     105ac26:	48 99                	cqo
     105ac28:	48 f7 fb             	idiv   rbx
     105ac2b:	49 89 c7             	mov    r15,rax
     105ac2e:	48 89 c8             	mov    rax,rcx
     105ac31:	48 99                	cqo
     105ac33:	48 f7 fb             	idiv   rbx
     105ac36:	49 89 c5             	mov    r13,rax
     105ac39:	41 83 4c 24 10 01    	or     DWORD PTR [r12+0x10],0x1
     105ac3f:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
     105ac44:	f6 c2 01             	test   dl,0x1
     105ac47:	75 2d                	jne    105ac76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22208c>
     105ac49:	4c 89 e7             	mov    rdi,r12
     105ac4c:	48 83 c7 18          	add    rdi,0x18
     105ac50:	4c 89 f6             	mov    rsi,r14
     105ac53:	e8 3a ab 70 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     105ac58:	4d 29 fd             	sub    r13,r15
     105ac5b:	4d 89 7c 24 28       	mov    QWORD PTR [r12+0x28],r15
     105ac60:	4d 89 6c 24 30       	mov    QWORD PTR [r12+0x30],r13
     105ac65:	41 80 4c 24 10 0c    	or     BYTE PTR [r12+0x10],0xc
     105ac6b:	49 83 c6 28          	add    r14,0x28
     105ac6f:	49 39 ee             	cmp    r14,rbp
     105ac72:	75 8e                	jne    105ac02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222018>
     105ac74:	eb 09                	jmp    105ac7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222095>
     105ac76:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     105ac7a:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     105ac7d:	eb ca                	jmp    105ac49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22205f>
     105ac7f:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     105ac84:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
     105ac89:	e8 36 50 72 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
     105ac8e:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     105ac93:	e8 9e 0b a2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     105ac98:	0f 57 c0             	xorps  xmm0,xmm0
     105ac9b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     105aca0:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     105aca3:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     105aca8:	48 89 c6             	mov    rsi,rax
     105acab:	31 c9                	xor    ecx,ecx
     105acad:	e8 69 08 78 00       	call   17db51b <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x733c>
     105acb2:	48 8d 35 a6 bf 2e ff 	lea    rsi,[rip+0xffffffffff2ebfa6]        # 346c5f <_ZTSSt12bad_any_cast@@Base-0x49569>
     105acb9:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
     105acbe:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105acc3:	e8 67 04 00 00       	call   105b12f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222545>
     105acc8:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     105accd:	e8 be 31 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105acd2:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     105acd7:	e8 b4 31 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105acdc:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105ace1:	e8 70 de 00 00       	call   1068b56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ff6c>
     105ace6:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     105aced:	00 
     105acee:	e8 9b 07 00 00       	call   105b48e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2228a4>
     105acf3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     105acf8:	e8 89 37 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     105acfd:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105ad02:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     105ad07:	48 81 c2 b8 06 00 00 	add    rdx,0x6b8
     105ad0e:	48 8d 35 06 0b 31 ff 	lea    rsi,[rip+0xffffffffff310b06]        # 36b81b <_ZTSSt12bad_any_cast@@Base-0x249ad>
     105ad15:	e8 15 04 00 00       	call   105b12f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222545>
     105ad1a:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     105ad1f:	48 8d b3 c0 0d 00 00 	lea    rsi,[rbx+0xdc0]
     105ad26:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     105ad2d:	00 
     105ad2e:	e8 e5 91 e4 ff       	call   ea3f18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6b32e>
     105ad33:	48 8d 93 58 01 00 00 	lea    rdx,[rbx+0x158]
     105ad3a:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105ad3f:	48 8d b4 24 38 01 00 	lea    rsi,[rsp+0x138]
     105ad46:	00 
     105ad47:	e8 7f 07 00 00       	call   105b4cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2228e1>
     105ad4c:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     105ad53:	00 
     105ad54:	e8 c5 0c e2 ff       	call   e7ba1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42e34>
     105ad59:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
     105ad5e:	48 89 df             	mov    rdi,rbx
     105ad61:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
     105ad66:	e8 23 f4 ff ff       	call   105a18e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2215a4>
     105ad6b:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105ad70:	e8 a9 0c e2 ff       	call   e7ba1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42e34>
     105ad75:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     105ad7c:	00 
     105ad7d:	e8 68 05 aa ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     105ad82:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     105ad87:	e8 4e 28 dd ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     105ad8c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     105ad93:	00 00 
     105ad95:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
     105ad9c:	00 
     105ad9d:	0f 85 7d 01 00 00    	jne    105af20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222336>
     105ada3:	48 81 c4 18 02 00 00 	add    rsp,0x218
     105adaa:	5b                   	pop    rbx
     105adab:	41 5c                	pop    r12
     105adad:	41 5d                	pop    r13
     105adaf:	41 5e                	pop    r14
     105adb1:	41 5f                	pop    r15
     105adb3:	5d                   	pop    rbp
     105adb4:	c3                   	ret
     105adb5:	e9 87 00 00 00       	jmp    105ae41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222257>
     105adba:	eb 00                	jmp    105adbc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2221d2>
     105adbc:	48 89 c3             	mov    rbx,rax
     105adbf:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     105adc4:	e8 c7 30 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105adc9:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     105adce:	e8 bd 30 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105add3:	e9 d6 00 00 00       	jmp    105aeae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222c4>
     105add8:	e9 ce 00 00 00       	jmp    105aeab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222c1>
     105addd:	e9 c9 00 00 00       	jmp    105aeab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222c1>
     105ade2:	48 89 c3             	mov    rbx,rax
     105ade5:	e9 db 00 00 00       	jmp    105aec5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222db>
     105adea:	eb 55                	jmp    105ae41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222257>
     105adec:	48 89 c3             	mov    rbx,rax
     105adef:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105adf4:	e8 97 30 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105adf9:	eb 51                	jmp    105ae4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222262>
     105adfb:	48 89 c3             	mov    rbx,rax
     105adfe:	eb 56                	jmp    105ae56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22226c>
     105ae00:	48 89 c3             	mov    rbx,rax
     105ae03:	eb 5e                	jmp    105ae63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222279>
     105ae05:	eb 3a                	jmp    105ae41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222257>
     105ae07:	48 89 c3             	mov    rbx,rax
     105ae0a:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105ae0f:	eb 0b                	jmp    105ae1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222232>
     105ae11:	48 89 c3             	mov    rbx,rax
     105ae14:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     105ae1b:	00 
     105ae1c:	e8 fd 0b e2 ff       	call   e7ba1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42e34>
     105ae21:	e9 a9 00 00 00       	jmp    105aecf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222e5>
     105ae26:	eb 19                	jmp    105ae41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222257>
     105ae28:	eb 17                	jmp    105ae41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222257>
     105ae2a:	eb 15                	jmp    105ae41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222257>
     105ae2c:	eb 13                	jmp    105ae41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222257>
     105ae2e:	eb 11                	jmp    105ae41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222257>
     105ae30:	48 89 c3             	mov    rbx,rax
     105ae33:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
     105ae3a:	00 
     105ae3b:	eb 40                	jmp    105ae7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222293>
     105ae3d:	eb 02                	jmp    105ae41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222257>
     105ae3f:	eb 00                	jmp    105ae41 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222257>
     105ae41:	48 89 c3             	mov    rbx,rax
     105ae44:	e9 86 00 00 00       	jmp    105aecf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222e5>
     105ae49:	48 89 c3             	mov    rbx,rax
     105ae4c:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     105ae51:	e8 84 27 dd ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     105ae56:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
     105ae5d:	00 
     105ae5e:	e8 2d 30 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105ae63:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     105ae6a:	00 
     105ae6b:	e8 20 30 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105ae70:	e9 86 00 00 00       	jmp    105aefb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222311>
     105ae75:	48 89 c3             	mov    rbx,rax
     105ae78:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     105ae7d:	e8 58 27 dd ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     105ae82:	eb 4b                	jmp    105aecf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222e5>
     105ae84:	48 89 c3             	mov    rbx,rax
     105ae87:	eb 72                	jmp    105aefb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222311>
     105ae89:	eb 20                	jmp    105aeab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222c1>
     105ae8b:	eb 1e                	jmp    105aeab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222c1>
     105ae8d:	eb 1c                	jmp    105aeab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222c1>
     105ae8f:	eb 1a                	jmp    105aeab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222c1>
     105ae91:	eb 18                	jmp    105aeab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222c1>
     105ae93:	eb 16                	jmp    105aeab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222c1>
     105ae95:	48 89 c3             	mov    rbx,rax
     105ae98:	eb 54                	jmp    105aeee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222304>
     105ae9a:	48 89 c3             	mov    rbx,rax
     105ae9d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105aea2:	e8 e9 2f 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     105aea7:	eb 38                	jmp    105aee1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222f7>
     105aea9:	eb 00                	jmp    105aeab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2222c1>
     105aeab:	48 89 c3             	mov    rbx,rax
     105aeae:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     105aeb3:	e8 9e dc 00 00       	call   1068b56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ff6c>
     105aeb8:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     105aebf:	00 
     105aec0:	e8 c9 05 00 00       	call   105b48e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2228a4>
     105aec5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     105aeca:	e8 b7 35 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     105aecf:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     105aed6:	00 
     105aed7:	e8 0e 04 aa ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     105aedc:	eb 1d                	jmp    105aefb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222311>
     105aede:	48 89 c3             	mov    rbx,rax
     105aee1:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
     105aee8:	00 
     105aee9:	e8 ec 26 dd ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     105aeee:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
     105aef5:	00 
     105aef6:	e8 87 e5 fa ff       	call   1009482 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d0898>
     105aefb:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     105af00:	e8 d5 26 dd ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     105af05:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     105af0c:	00 00 
     105af0e:	48 3b 84 24 10 02 00 	cmp    rax,QWORD PTR [rsp+0x210]
     105af15:	00 
     105af16:	75 08                	jne    105af20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222336>
     105af18:	48 89 df             	mov    rdi,rbx
     105af1b:	e8 b0 4d a1 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     105af20:	e8 8b 4b 79 00       	call   17efab0 <__stack_chk_fail@plt>

## Helper 0x105b134
Function: 0x105b134..0x105b230

     105b134:	41 56                	push   r14
     105b136:	53                   	push   rbx
     105b137:	48 83 ec 18          	sub    rsp,0x18
     105b13b:	48 89 d3             	mov    rbx,rdx
     105b13e:	49 89 fe             	mov    r14,rdi
     105b141:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     105b148:	00 00 
     105b14a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     105b14f:	e8 e4 22 dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105b154:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     105b159:	4c 89 f6             	mov    rsi,r14
     105b15c:	e8 bb 22 dd ff       	call   e2d41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4a2>
     105b161:	48 8d 35 75 f9 2f ff 	lea    rsi,[rip+0xffffffffff2ff975]        # 35aadd <_ZTSSt12bad_any_cast@@Base-0x356eb>
     105b168:	4c 89 f7             	mov    rdi,r14
     105b16b:	48 89 da             	mov    rdx,rbx
     105b16e:	e8 bc ff ff ff       	call   105b12f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222545>
     105b173:	48 8d 35 5b 87 2d ff 	lea    rsi,[rip+0xffffffffff2d875b]        # 3338d5 <_ZTSSt12bad_any_cast@@Base-0x5c8f3>
     105b17a:	4c 89 f7             	mov    rdi,r14
     105b17d:	e8 b6 22 dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105b182:	48 8d 73 18          	lea    rsi,[rbx+0x18]
     105b186:	4c 89 f7             	mov    rdi,r14
     105b189:	e8 52 2c dd ff       	call   e2dde0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfae66>
     105b18e:	48 8d 53 30          	lea    rdx,[rbx+0x30]
     105b192:	48 8d 35 7d 3a 31 ff 	lea    rsi,[rip+0xffffffffff313a7d]        # 36ec16 <_ZTSSt12bad_any_cast@@Base-0x215b2>
     105b199:	4c 89 f7             	mov    rdi,r14
     105b19c:	e8 bf 23 dd ff       	call   e2d560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa5e6>
     105b1a1:	48 8d 53 48          	lea    rdx,[rbx+0x48]
     105b1a5:	48 8d 35 c0 08 32 ff 	lea    rsi,[rip+0xffffffffff3208c0]        # 37ba6c <_ZTSSt12bad_any_cast@@Base-0x1475c>
     105b1ac:	4c 89 f7             	mov    rdi,r14
     105b1af:	e8 ac 23 dd ff       	call   e2d560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa5e6>
     105b1b4:	48 8d 53 78          	lea    rdx,[rbx+0x78]
     105b1b8:	48 8d 35 a6 51 2d ff 	lea    rsi,[rip+0xffffffffff2d51a6]        # 330365 <_ZTSSt12bad_any_cast@@Base-0x5fe63>
     105b1bf:	4c 89 f7             	mov    rdi,r14
     105b1c2:	e8 99 23 dd ff       	call   e2d560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa5e6>
     105b1c7:	48 8d 35 85 9f 32 ff 	lea    rsi,[rip+0xffffffffff329f85]        # 385153 <_ZTSSt12bad_any_cast@@Base-0xb075>
     105b1ce:	4c 89 f7             	mov    rdi,r14
     105b1d1:	e8 62 22 dd ff       	call   e2d438 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa4be>
     105b1d6:	48 83 c3 60          	add    rbx,0x60
     105b1da:	4c 89 f7             	mov    rdi,r14
     105b1dd:	48 89 de             	mov    rsi,rbx
     105b1e0:	e8 fb 2b dd ff       	call   e2dde0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfae66>
     105b1e5:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105b1ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     105b1f1:	00 00 
     105b1f3:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     105b1f8:	75 31                	jne    105b22b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222641>
     105b1fa:	48 83 c4 18          	add    rsp,0x18
     105b1fe:	5b                   	pop    rbx
     105b1ff:	41 5e                	pop    r14
     105b201:	e9 d4 23 dd ff       	jmp    e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     105b206:	48 89 c3             	mov    rbx,rax
     105b209:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     105b20e:	e8 c7 23 dd ff       	call   e2d5da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa660>
     105b213:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     105b21a:	00 00 
     105b21c:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     105b221:	75 08                	jne    105b22b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222641>
     105b223:	48 89 df             	mov    rdi,rbx
     105b226:	e8 a5 4a a1 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     105b22b:	e8 80 48 79 00       	call   17efab0 <__stack_chk_fail@plt>

## Printable strings in caller

- 0x43ccea: type
- 0x325856: start
- 0x3338ad: seek_to
- 0x335ae8: end_position
- 0x43ca78: *reporting.context_uri
- 0x3372e0: track
- 0x3610e9: entity_uri
- 0x33a0a9: context_uri
- 0x325e59: play_origin
- 0x325e65: playback_id
- 0x34124a: null
- 0x33e233: future
- 0x373d53: player_options
- 0x37ea7f: shuffling_context
- 0x38bece: repeating_context
- 0x37ba0c: repeating_track
- 0x37eac8: playback_speed
- 0x3610ab: modes
- 0x34b2d0: initially_paused
- 0x32ed95: client_offline
- 0x3338c4: system_initiated
- 0x3607d4: start_reason
- 0x36109c: logging_params
- 0x329a9a: command_initiated_time
- 0x34477f: command_received_time
- 0x3677c1: system_initiated_time
- 0x1068971: SH��H���
- 0x1068982: SH��H���b
- 0x346c5f: timekeeper_builder
- 0x36b81b: session_id

## Printable strings in helper

- 0x35aadd: feature_identifier
- 0x3338d5: feature_version
- 0x36ec16: view_uri
- 0x37ba6c: external_referrer
- 0x330365: device_identifier
- 0x385153: referrer_identifier

## Calls targeting helper 0x105b134 in candidate disassembly

     105a46d:	e8 c2 0c 00 00       	call   105b134 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22254a>
     105a5b4:	e8 7b 0b 00 00       	call   105b134 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22254a>

## Nearby offset references around the candidate object

     105a45c:	48 8d 90 70 04 00 00 	lea    rdx,[rax+0x470]
     105a477:	48 8d b0 48 05 00 00 	lea    rsi,[rax+0x548]
     105a87b:	80 bb 98 05 00 00 00 	cmp    BYTE PTR [rbx+0x598],0x0
     105b4ea:	80 ba 70 04 00 00 00 	cmp    BYTE PTR [rdx+0x470],0x0
     105b794:	8a 81 70 04 00 00    	mov    al,BYTE PTR [rcx+0x470]
     105baba:	80 be 70 04 00 00 00 	cmp    BYTE PTR [rsi+0x470],0x0
