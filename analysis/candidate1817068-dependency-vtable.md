# Candidate 0x1817068 returned dependency vtable

Proven constructor path under candidate owner:
- owner AP 0x1817068 allocated at 0xc2c5f6
- owner+0x10 starts null
- 0xc2c7dc allocates 0x10 bytes
- 0xc2c7e1 stores AP 0x1884978 into dependency[0]
- 0xc2c7fc installs dependency into owner+0x10
- owner virtual +0x28 returns [owner+0x10]

## Header AP=0x1884978
- offset-to-top: 0
- typeinfo: 0x0

## Vtable slots
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x111b2c2 FDE=(17937090, 17937183)
- +0x18: 0x15c2456 FDE=(22815830, 22815996)
- +0x20: 0x0 FDE=None
- +0x28: 0x0 FDE=None
- +0x30: 0x15c252e FDE=(22816046, 22816065)
- +0x38: 0x15c2542 FDE=(22816066, 22816084)
- +0x40: 0xc877aa FDE=(13137834, 13137844)
- +0x48: 0x15c2554 FDE=(22816084, 22816432)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x15c2856 FDE=(22816854, 22816873)
- +0x68: 0x15c286a FDE=(22816874, 22816892)
- +0x70: 0x15c287c FDE=(22816892, 22816901)
- +0x78: 0x15c2886 FDE=(22816902, 22817504)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0x15c2bfc FDE=(22817788, 22817793)
- +0x98: 0x15b3014 FDE=(22753300, 22753318)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0x15b367c FDE=(22754940, 22754945)
- +0xb8: 0x15b3682 FDE=(22754946, 22754964)
- +0xc0: 0x15c366c FDE=(22820460, 22821024)
- +0xc8: 0x9d7de0 FDE=(10321376, 10321377)
- +0xd0: 0x15c2c02 FDE=(22817794, 22819151)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0x15b367c FDE=(22754940, 22754945)
- +0xf0: 0x15b3682 FDE=(22754946, 22754964)
- +0xf8: 0x15c366c FDE=(22820460, 22821024)
- +0x100: 0x9d7de0 FDE=(10321376, 10321377)
- +0x108: 0x9d81d0 FDE=(10322384, 10322387)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None

## slot +0x0 -> 0x9d7de0
      9d7de0:	c3                   	ret

## slot +0x8 -> 0xa50370
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

## slot +0x10 -> 0x111b2c2
     111b2c2:	41 56                	push   r14
     111b2c4:	53                   	push   rbx
     111b2c5:	48 83 ec 38          	sub    rsp,0x38
     111b2c9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     111b2d0:	00 00 
     111b2d2:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     111b2d7:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
     111b2db:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     111b2de:	49 89 e6             	mov    r14,rsp
     111b2e1:	4c 89 f7             	mov    rdi,r14
     111b2e4:	ff 50 18             	call   QWORD PTR [rax+0x18]
     111b2e7:	41 8b 06             	mov    eax,DWORD PTR [r14]
     111b2ea:	ff c8                	dec    eax
     111b2ec:	83 f8 fe             	cmp    eax,0xfffffffe
     111b2ef:	0f 92 c3             	setb   bl
     111b2f2:	41 22 5e 0c          	and    bl,BYTE PTR [r14+0xc]
     111b2f6:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     111b2fb:	e8 28 04 96 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     111b300:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     111b307:	00 00 
     111b309:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     111b30e:	75 0a                	jne    111b31a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e2730>
     111b310:	89 d8                	mov    eax,ebx
     111b312:	48 83 c4 38          	add    rsp,0x38
     111b316:	5b                   	pop    rbx
     111b317:	41 5e                	pop    r14
     111b319:	c3                   	ret
     111b31a:	e8 91 47 6d 00       	call   17efab0 <__stack_chk_fail@plt>

## slot +0x18 -> 0x15c2456
     15c2456:	41 57                	push   r15
     15c2458:	41 56                	push   r14
     15c245a:	41 54                	push   r12
     15c245c:	53                   	push   rbx
     15c245d:	48 81 ec 88 00 00 00 	sub    rsp,0x88
     15c2464:	48 89 fb             	mov    rbx,rdi
     15c2467:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c246e:	00 00 
     15c2470:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     15c2477:	00 
     15c2478:	4c 8b 7e 08          	mov    r15,QWORD PTR [rsi+0x8]
     15c247c:	49 89 e6             	mov    r14,rsp
     15c247f:	4c 89 f7             	mov    rdi,r14
     15c2482:	48 89 d6             	mov    rsi,rdx
     15c2485:	e8 50 82 21 00       	call   17da6da <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x64fb>
     15c248a:	48 8d 35 ce 88 67 ff 	lea    rsi,[rip+0xffffffffff6788ce]        # c3ad5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187cff>
     15c2491:	48 8d 15 ee 70 5a ff 	lea    rdx,[rip+0xffffffffff5a70ee]        # b69586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6526>
     15c2498:	48 8d 0d 5d 00 00 00 	lea    rcx,[rip+0x5d]        # 15c24fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407a80>
     15c249f:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
     15c24a4:	6a 40                	push   0x40
     15c24a6:	41 59                	pop    r9
     15c24a8:	4c 89 e7             	mov    rdi,r12
     15c24ab:	4d 89 f0             	mov    r8,r14
     15c24ae:	e8 e1 82 21 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     15c24b3:	49 8b 07             	mov    rax,QWORD PTR [r15]
     15c24b6:	48 89 df             	mov    rdi,rbx
     15c24b9:	4c 89 fe             	mov    rsi,r15
     15c24bc:	4c 89 e2             	mov    rdx,r12
     15c24bf:	ff 50 10             	call   QWORD PTR [rax+0x10]
     15c24c2:	4c 89 e7             	mov    rdi,r12
     15c24c5:	e8 1e 83 21 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     15c24ca:	4c 89 f7             	mov    rdi,r14
     15c24cd:	e8 16 83 21 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     15c24d2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c24d9:	00 00 
     15c24db:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     15c24e2:	00 
     15c24e3:	75 12                	jne    15c24f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407a7b>
     15c24e5:	48 89 d8             	mov    rax,rbx
     15c24e8:	48 81 c4 88 00 00 00 	add    rsp,0x88
     15c24ef:	5b                   	pop    rbx
     15c24f0:	41 5c                	pop    r12
     15c24f2:	41 5e                	pop    r14
     15c24f4:	41 5f                	pop    r15
     15c24f6:	c3                   	ret
     15c24f7:	e8 b4 d5 22 00       	call   17efab0 <__stack_chk_fail@plt>

## slot +0x30 -> 0x15c252e
     15c252e:	48 8d 05 73 24 2c 00 	lea    rax,[rip+0x2c2473]        # 18849a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41090>
     15c2535:	48 89 07             	mov    QWORD PTR [rdi],rax
     15c2538:	48 83 c7 10          	add    rdi,0x10
     15c253c:	e9 e7 78 4b ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>

## slot +0x38 -> 0x15c2542
     15c2542:	53                   	push   rbx
     15c2543:	48 89 fb             	mov    rbx,rdi
     15c2546:	e8 e3 ff ff ff       	call   15c252e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407ab2>
     15c254b:	48 89 df             	mov    rdi,rbx
     15c254e:	5b                   	pop    rbx
     15c254f:	e9 cc b9 22 00       	jmp    17edf20 <_ZdlPv@plt>

## slot +0x40 -> 0xc877aa
      c877aa:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      c877ae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c877b1:	ff 60 10             	jmp    QWORD PTR [rax+0x10]

## slot +0x48 -> 0x15c2554
     15c2554:	55                   	push   rbp
     15c2555:	41 57                	push   r15
     15c2557:	41 56                	push   r14
     15c2559:	41 55                	push   r13
     15c255b:	41 54                	push   r12
     15c255d:	53                   	push   rbx
     15c255e:	48 83 ec 78          	sub    rsp,0x78
     15c2562:	49 89 cc             	mov    r12,rcx
     15c2565:	48 89 d3             	mov    rbx,rdx
     15c2568:	49 89 f6             	mov    r14,rsi
     15c256b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c2572:	00 00 
     15c2574:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     15c2579:	4c 8b 7f 10          	mov    r15,QWORD PTR [rdi+0x10]
     15c257d:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     15c2582:	49 89 7d f8          	mov    QWORD PTR [r13-0x8],rdi
     15c2586:	4c 89 ef             	mov    rdi,r13
     15c2589:	e8 1e 6c 5b ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     15c258e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     15c2593:	48 89 de             	mov    rsi,rbx
     15c2596:	e8 63 4b 65 ff       	call   c170fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16409e>
     15c259b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     15c25a0:	4c 89 e6             	mov    rsi,r12
     15c25a3:	e8 08 01 00 00       	call   15c26b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407c34>
     15c25a8:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
     15c25ae:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
     15c25b4:	6a 50                	push   0x50
     15c25b6:	5f                   	pop    rdi
     15c25b7:	e8 44 b9 22 00       	call   17edf00 <_Znwm@plt>
     15c25bc:	49 89 c4             	mov    r12,rax
     15c25bf:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     15c25c3:	49 89 04 24          	mov    QWORD PTR [r12],rax
     15c25c7:	49 8d 6c 24 08       	lea    rbp,[r12+0x8]
     15c25cc:	48 89 ef             	mov    rdi,rbp
     15c25cf:	4c 89 ee             	mov    rsi,r13
     15c25d2:	e8 d5 6b 5b ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     15c25d7:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
     15c25dc:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     15c25e1:	e8 18 4b 65 ff       	call   c170fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16409e>
     15c25e6:	4c 89 e7             	mov    rdi,r12
     15c25e9:	48 83 c7 30          	add    rdi,0x30
     15c25ed:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     15c25f2:	e8 b9 00 00 00       	call   15c26b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407c34>
     15c25f7:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
     15c25fc:	4c 89 21             	mov    QWORD PTR [rcx],r12
     15c25ff:	48 8d 05 f2 00 00 00 	lea    rax,[rip+0xf2]        # 15c26f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407c7c>
     15c2606:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     15c260a:	48 8d 05 11 01 00 00 	lea    rax,[rip+0x111]        # 15c2722 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407ca6>
     15c2611:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     15c2615:	49 8b 07             	mov    rax,QWORD PTR [r15]
     15c2618:	4c 89 ff             	mov    rdi,r15
     15c261b:	4c 89 f6             	mov    rsi,r14
     15c261e:	48 89 da             	mov    rdx,rbx
     15c2621:	ff 50 18             	call   QWORD PTR [rax+0x18]
     15c2624:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     15c2629:	e8 d4 50 65 ff       	call   c17702 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1646a2>
     15c262e:	48 89 e7             	mov    rdi,rsp
     15c2631:	e8 ee 01 00 00       	call   15c2824 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407da8>
     15c2636:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c263d:	00 00 
     15c263f:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
     15c2644:	75 65                	jne    15c26ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407c2f>
     15c2646:	48 83 c4 78          	add    rsp,0x78
     15c264a:	5b                   	pop    rbx
     15c264b:	41 5c                	pop    r12
     15c264d:	41 5d                	pop    r13
     15c264f:	41 5e                	pop    r14
     15c2651:	41 5f                	pop    r15
     15c2653:	5d                   	pop    rbp
     15c2654:	c3                   	ret
     15c2655:	eb 1a                	jmp    15c2671 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407bf5>
     15c2657:	48 89 c3             	mov    rbx,rax
     15c265a:	48 89 ef             	mov    rdi,rbp
     15c265d:	e8 c4 e4 4d ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     15c2662:	eb 03                	jmp    15c2667 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407beb>
     15c2664:	48 89 c3             	mov    rbx,rax
     15c2667:	4c 89 e7             	mov    rdi,r12
     15c266a:	e8 b1 b8 22 00       	call   17edf20 <_ZdlPv@plt>
     15c266f:	eb 03                	jmp    15c2674 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407bf8>
     15c2671:	48 89 c3             	mov    rbx,rax
     15c2674:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     15c2679:	e8 84 50 65 ff       	call   c17702 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1646a2>
     15c267e:	48 89 e7             	mov    rdi,rsp
     15c2681:	e8 9e 01 00 00       	call   15c2824 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407da8>
     15c2686:	eb 0b                	jmp    15c2693 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407c17>
     15c2688:	48 89 c3             	mov    rbx,rax
     15c268b:	4c 89 ef             	mov    rdi,r13
     15c268e:	e8 93 e4 4d ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     15c2693:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c269a:	00 00 
     15c269c:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
     15c26a1:	75 08                	jne    15c26ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407c2f>
     15c26a3:	48 89 df             	mov    rdi,rbx
     15c26a6:	e8 25 d6 4a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     15c26ab:	e8 00 d4 22 00       	call   17efab0 <__stack_chk_fail@plt>

## slot +0x60 -> 0x15c2856
     15c2856:	48 8d 05 7b 21 2c 00 	lea    rax,[rip+0x2c217b]        # 18849d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x410c0>
     15c285d:	48 89 07             	mov    QWORD PTR [rdi],rax
     15c2860:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     15c2864:	e9 1d bc 4d ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>

## slot +0x68 -> 0x15c286a
     15c286a:	53                   	push   rbx
     15c286b:	48 89 fb             	mov    rbx,rdi
     15c286e:	e8 e3 ff ff ff       	call   15c2856 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407dda>
     15c2873:	48 89 df             	mov    rdi,rbx
     15c2876:	5b                   	pop    rbx
     15c2877:	e9 a4 b6 22 00       	jmp    17edf20 <_ZdlPv@plt>

## slot +0x70 -> 0x15c287c
     15c287c:	48 83 c7 10          	add    rdi,0x10
     15c2880:	e9 a1 c0 4e ff       	jmp    aae926 <JNI_OnUnload@@Base+0x361f3>

## slot +0x78 -> 0x15c2886
     15c2886:	55                   	push   rbp
     15c2887:	41 57                	push   r15
     15c2889:	41 56                	push   r14
     15c288b:	41 55                	push   r13
     15c288d:	41 54                	push   r12
     15c288f:	53                   	push   rbx
     15c2890:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
     15c2897:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     15c289c:	49 89 d5             	mov    r13,rdx
     15c289f:	48 89 74 24 18       	mov    QWORD PTR [rsp+0x18],rsi
     15c28a4:	48 89 fb             	mov    rbx,rdi
     15c28a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c28ae:	00 00 
     15c28b0:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     15c28b7:	00 
     15c28b8:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     15c28bd:	e8 84 56 5a ff       	call   b67f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4ee6>
     15c28c2:	0f 57 c0             	xorps  xmm0,xmm0
     15c28c5:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
     15c28cb:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     15c28d0:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
     15c28d4:	4d 8b 7d 08          	mov    r15,QWORD PTR [r13+0x8]
     15c28d8:	4d 39 fc             	cmp    r12,r15
     15c28db:	0f 84 81 00 00 00    	je     15c2962 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407ee6>
     15c28e1:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
     15c28e6:	6a 08                	push   0x8
     15c28e8:	5d                   	pop    rbp
     15c28e9:	41 83 7c 24 38 01    	cmp    DWORD PTR [r12+0x38],0x1
     15c28ef:	75 68                	jne    15c2959 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407edd>
     15c28f1:	4c 89 e7             	mov    rdi,r12
     15c28f4:	4c 89 ee             	mov    rsi,r13
     15c28f7:	e8 ae 7e 6e ff       	call   caa7aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f774a>
     15c28fc:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
     15c2901:	4c 89 ef             	mov    rdi,r13
     15c2904:	e8 2d 8f 4b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     15c2909:	48 89 d1             	mov    rcx,rdx
     15c290c:	4c 89 f7             	mov    rdi,r14
     15c290f:	89 ee                	mov    esi,ebp
     15c2911:	48 89 c2             	mov    rdx,rax
     15c2914:	e8 75 8e 0b 00       	call   167b78e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8fa>
     15c2919:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
     15c291e:	4c 89 ef             	mov    rdi,r13
     15c2921:	e8 10 8f 4b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     15c2926:	48 89 d1             	mov    rcx,rdx
     15c2929:	4c 89 f7             	mov    rdi,r14
     15c292c:	be b2 00 00 00       	mov    esi,0xb2
     15c2931:	48 89 c2             	mov    rdx,rax
     15c2934:	e8 55 8e 0b 00       	call   167b78e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8fa>
     15c2939:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
     15c293e:	4c 89 ef             	mov    rdi,r13
     15c2941:	e8 f0 8e 4b ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     15c2946:	48 89 d1             	mov    rcx,rdx
     15c2949:	4c 89 f7             	mov    rdi,r14
     15c294c:	be b7 00 00 00       	mov    esi,0xb7
     15c2951:	48 89 c2             	mov    rdx,rax
     15c2954:	e8 35 8e 0b 00       	call   167b78e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8fa>
     15c2959:	49 83 c4 58          	add    r12,0x58
     15c295d:	4d 39 fc             	cmp    r12,r15
     15c2960:	75 87                	jne    15c28e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407e6d>
     15c2962:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]
     15c2966:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     15c296b:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     15c2970:	e8 37 68 5b ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     15c2975:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
     15c297a:	4c 89 ff             	mov    rdi,r15
     15c297d:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     15c2982:	e8 59 01 00 00       	call   15c2ae0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408064>
     15c2987:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     15c298e:	00 00 
     15c2990:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
     15c2997:	00 00 
     15c2999:	6a 30                	push   0x30
     15c299b:	5f                   	pop    rdi
     15c299c:	e8 5f b5 22 00       	call   17edf00 <_Znwm@plt>
     15c29a1:	49 89 c6             	mov    r14,rax
     15c29a4:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     15c29a9:	48 89 c7             	mov    rdi,rax
     15c29ac:	e8 fb 67 5b ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     15c29b1:	4c 89 f7             	mov    rdi,r14
     15c29b4:	48 83 c7 10          	add    rdi,0x10
     15c29b8:	4c 89 fe             	mov    rsi,r15
     15c29bb:	e8 20 01 00 00       	call   15c2ae0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408064>
     15c29c0:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]
     15c29c7:	00 
     15c29c8:	4c 89 30             	mov    QWORD PTR [rax],r14
     15c29cb:	48 8d 0d 56 01 00 00 	lea    rcx,[rip+0x156]        # 15c2b28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4080ac>
     15c29d2:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     15c29d6:	48 8d 0d 75 01 00 00 	lea    rcx,[rip+0x175]        # 15c2b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4080d6>
     15c29dd:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     15c29e1:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     15c29e5:	4c 8b 51 18          	mov    r10,QWORD PTR [rcx+0x18]
     15c29e9:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     15c29ed:	48 8d 15 f0 92 db fe 	lea    rdx,[rip+0xfffffffffedb92f0]        # 37bce4 <_ZTSSt12bad_any_cast@@Base-0x144e4>
     15c29f4:	4c 8d 0d 65 77 e7 fe 	lea    r9,[rip+0xfffffffffee77765]        # 43a160 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5fbaf>
     15c29fb:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     15c2a00:	48 8d 4c 24 48       	lea    rcx,[rsp+0x48]
     15c2a05:	6a 01                	push   0x1
     15c2a07:	41 58                	pop    r8
     15c2a09:	4c 89 e6             	mov    rsi,r12
     15c2a0c:	41 ff d2             	call   r10
     15c2a0f:	48 83 c3 10          	add    rbx,0x10
     15c2a13:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     15c2a18:	48 89 df             	mov    rdi,rbx
     15c2a1b:	4c 89 f6             	mov    rsi,r14
     15c2a1e:	e8 f9 6d 4f ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     15c2a23:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     15c2a27:	e8 5a ba 4d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15c2a2c:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     15c2a33:	00 
     15c2a34:	e8 b9 57 5a ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     15c2a39:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     15c2a3e:	e8 63 01 00 00       	call   15c2ba6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40812a>
     15c2a43:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     15c2a48:	e8 43 b4 22 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15c2a4d:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     15c2a52:	e8 e5 57 5a ff       	call   b6823c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb51dc>
     15c2a57:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c2a5e:	00 00 
     15c2a60:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
     15c2a67:	00 
     15c2a68:	75 71                	jne    15c2adb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40805f>
     15c2a6a:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
     15c2a71:	5b                   	pop    rbx
     15c2a72:	41 5c                	pop    r12
     15c2a74:	41 5d                	pop    r13
     15c2a76:	41 5e                	pop    r14
     15c2a78:	41 5f                	pop    r15
     15c2a7a:	5d                   	pop    rbp
     15c2a7b:	c3                   	ret
     15c2a7c:	eb 0d                	jmp    15c2a8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40800f>
     15c2a7e:	48 89 c3             	mov    rbx,rax
     15c2a81:	4c 89 f7             	mov    rdi,r14
     15c2a84:	e8 97 b4 22 00       	call   17edf20 <_ZdlPv@plt>
     15c2a89:	eb 03                	jmp    15c2a8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408012>
     15c2a8b:	48 89 c3             	mov    rbx,rax
     15c2a8e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     15c2a95:	00 
     15c2a96:	e8 57 57 5a ff       	call   b681f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5192>
     15c2a9b:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     15c2aa0:	e8 01 01 00 00       	call   15c2ba6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40812a>
     15c2aa5:	eb 05                	jmp    15c2aac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408030>
     15c2aa7:	eb 00                	jmp    15c2aa9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40802d>
     15c2aa9:	48 89 c3             	mov    rbx,rax
     15c2aac:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     15c2ab1:	e8 da b3 22 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15c2ab6:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     15c2abb:	e8 7c 57 5a ff       	call   b6823c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb51dc>
     15c2ac0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c2ac7:	00 00 
     15c2ac9:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
     15c2ad0:	00 
     15c2ad1:	75 08                	jne    15c2adb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40805f>
     15c2ad3:	48 89 df             	mov    rdi,rbx
     15c2ad6:	e8 f5 d1 4a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     15c2adb:	e8 d0 cf 22 00       	call   17efab0 <__stack_chk_fail@plt>
- strings: 'collection'

## slot +0x90 -> 0x15c2bfc
     15c2bfc:	e9 f1 03 ff ff       	jmp    15b2ff2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8576>

## slot +0x98 -> 0x15b3014
     15b3014:	53                   	push   rbx
     15b3015:	48 89 fb             	mov    rbx,rdi
     15b3018:	e8 d5 ff ff ff       	call   15b2ff2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8576>
     15b301d:	48 89 df             	mov    rdi,rbx
     15b3020:	5b                   	pop    rbx
     15b3021:	e9 fa ae 23 00       	jmp    17edf20 <_ZdlPv@plt>

## slot +0xb0 -> 0x15b367c
     15b367c:	e9 a5 45 00 00       	jmp    15b7c26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fd1aa>

## slot +0xb8 -> 0x15b3682
     15b3682:	53                   	push   rbx
     15b3683:	48 89 fb             	mov    rbx,rdi
     15b3686:	e8 9b 45 00 00       	call   15b7c26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fd1aa>
     15b368b:	48 89 df             	mov    rdi,rbx
     15b368e:	5b                   	pop    rbx
     15b368f:	e9 8c a8 23 00       	jmp    17edf20 <_ZdlPv@plt>

## slot +0xc0 -> 0x15c366c
     15c366c:	55                   	push   rbp
     15c366d:	41 57                	push   r15
     15c366f:	41 56                	push   r14
     15c3671:	41 55                	push   r13
     15c3673:	41 54                	push   r12
     15c3675:	53                   	push   rbx
     15c3676:	48 81 ec 18 01 00 00 	sub    rsp,0x118
     15c367d:	44 89 c5             	mov    ebp,r8d
     15c3680:	49 89 cd             	mov    r13,rcx
     15c3683:	49 89 d6             	mov    r14,rdx
     15c3686:	49 89 f7             	mov    r15,rsi
     15c3689:	49 89 fc             	mov    r12,rdi
     15c368c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c3693:	00 00 
     15c3695:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
     15c369c:	00 
     15c369d:	48 8b 77 68          	mov    rsi,QWORD PTR [rdi+0x68]
     15c36a1:	48 8d 9c 24 80 00 00 	lea    rbx,[rsp+0x80]
     15c36a8:	00 
     15c36a9:	48 89 df             	mov    rdi,rbx
     15c36ac:	e8 3b ce 0b 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
     15c36b1:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
     15c36b4:	48 85 db             	test   rbx,rbx
     15c36b7:	0f 84 5e 01 00 00    	je     15c381b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408d9f>
     15c36bd:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     15c36c2:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
     15c36c7:	4d 8b bc 24 d8 00 00 	mov    r15,QWORD PTR [r12+0xd8]
     15c36ce:	00 
     15c36cf:	48 8d 35 0e 86 db fe 	lea    rsi,[rip+0xfffffffffedb860e]        # 37bce4 <_ZTSSt12bad_any_cast@@Base-0x144e4>
     15c36d6:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     15c36db:	e8 9e 63 4b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     15c36e0:	48 8d 05 c9 6d 2c 00 	lea    rax,[rip+0x2c6dc9]        # 188a4b0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3188>
     15c36e7:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     15c36ee:	00 
     15c36ef:	49 89 06             	mov    QWORD PTR [r14],rax
     15c36f2:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
     15c36f6:	0f 57 c0             	xorps  xmm0,xmm0
     15c36f9:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
     15c36fe:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     15c3703:	41 c7 46 30 00 00 80 	mov    DWORD PTR [r14+0x30],0x3f800000
     15c370a:	3f 
     15c370b:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
     15c3710:	41 0f 11 46 41       	movups XMMWORD PTR [r14+0x41],xmm0
     15c3715:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     15c371a:	0f 28 0f             	movaps xmm1,XMMWORD PTR [rdi]
     15c371d:	41 0f 11 4e 58       	movups XMMWORD PTR [r14+0x58],xmm1
     15c3722:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     15c3726:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
     15c372a:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     15c372d:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     15c3732:	e8 59 a7 22 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15c3737:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     15c373b:	4c 89 e7             	mov    rdi,r12
     15c373e:	4c 89 f6             	mov    rsi,r14
     15c3741:	ff 50 18             	call   QWORD PTR [rax+0x18]
     15c3744:	4c 8d 74 24 48       	lea    r14,[rsp+0x48]
     15c3749:	4c 89 f7             	mov    rdi,r14
     15c374c:	e8 1f 26 0d 00       	call   1695d70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49edc>
     15c3751:	4c 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r13
     15c3758:	00 
     15c3759:	40 88 ac 24 98 00 00 	mov    BYTE PTR [rsp+0x98],bpl
     15c3760:	00 
     15c3761:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     15c3765:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
     15c3769:	0f 10 84 24 90 00 00 	movups xmm0,XMMWORD PTR [rsp+0x90]
     15c3770:	00 
     15c3771:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     15c3775:	4c 8d 8c 24 a0 00 00 	lea    r9,[rsp+0xa0]
     15c377c:	00 
     15c377d:	4c 89 e7             	mov    rdi,r12
     15c3780:	48 89 de             	mov    rsi,rbx
     15c3783:	4c 89 f2             	mov    rdx,r14
     15c3786:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     15c378b:	4c 8b 44 24 20       	mov    r8,QWORD PTR [rsp+0x20]
     15c3790:	ff d0                	call   rax
     15c3792:	84 c0                	test   al,al
     15c3794:	74 6e                	je     15c3804 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408d88>
     15c3796:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     15c3799:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     15c379e:	48 8d 54 24 48       	lea    rdx,[rsp+0x48]
     15c37a3:	e8 9c 22 59 ff       	call   b55a44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa29e4>
     15c37a8:	48 83 7c 24 40 00    	cmp    QWORD PTR [rsp+0x40],0x0
     15c37ae:	74 1e                	je     15c37ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408d52>
     15c37b0:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
     15c37b5:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     15c37ba:	48 89 df             	mov    rdi,rbx
     15c37bd:	e8 04 75 0d 00       	call   169acc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ee32>
     15c37c2:	f6 03 01             	test   BYTE PTR [rbx],0x1
     15c37c5:	74 0b                	je     15c37d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408d56>
     15c37c7:	4c 8b 44 24 38       	mov    r8,QWORD PTR [rsp+0x38]
     15c37cc:	eb 09                	jmp    15c37d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408d5b>
     15c37ce:	31 ff                	xor    edi,edi
     15c37d0:	eb 2d                	jmp    15c37ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408d83>
     15c37d2:	4c 8d 44 24 29       	lea    r8,[rsp+0x29]
     15c37d7:	48 8d 35 9e e7 e8 fe 	lea    rsi,[rip+0xfffffffffee8e79e]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     15c37de:	48 8d 0d 92 77 d8 fe 	lea    rcx,[rip+0xfffffffffed87792]        # 34af77 <_ZTSSt12bad_any_cast@@Base-0x45251>
     15c37e5:	6a 03                	push   0x3
     15c37e7:	5f                   	pop    rdi
     15c37e8:	6a 25                	push   0x25
     15c37ea:	5a                   	pop    rdx
     15c37eb:	31 c0                	xor    eax,eax
     15c37ed:	e8 e0 30 21 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     15c37f2:	48 89 df             	mov    rdi,rbx
     15c37f5:	e8 96 a6 22 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15c37fa:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     15c37ff:	e8 e8 2e 4f ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     15c3804:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     15c3809:	e8 82 a6 22 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15c380e:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15c3815:	00 
     15c3816:	e8 4f 50 02 00       	call   15e886a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ddee>
     15c381b:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     15c3822:	00 
     15c3823:	e8 5e ac 4d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15c3828:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c382f:	00 00 
     15c3831:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
     15c3838:	00 
     15c3839:	75 60                	jne    15c389b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408e1f>
     15c383b:	48 81 c4 18 01 00 00 	add    rsp,0x118
     15c3842:	5b                   	pop    rbx
     15c3843:	41 5c                	pop    r12
     15c3845:	41 5d                	pop    r13
     15c3847:	41 5e                	pop    r14
     15c3849:	41 5f                	pop    r15
     15c384b:	5d                   	pop    rbp
     15c384c:	c3                   	ret
     15c384d:	eb 00                	jmp    15c384f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408dd3>
     15c384f:	48 89 c3             	mov    rbx,rax
     15c3852:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     15c3857:	e8 34 a6 22 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15c385c:	eb 03                	jmp    15c3861 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408de5>
     15c385e:	48 89 c3             	mov    rbx,rax
     15c3861:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15c3868:	00 
     15c3869:	e8 fc 4f 02 00       	call   15e886a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ddee>
     15c386e:	eb 03                	jmp    15c3873 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408df7>
     15c3870:	48 89 c3             	mov    rbx,rax
     15c3873:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     15c387a:	00 
     15c387b:	e8 06 ac 4d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15c3880:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c3887:	00 00 
     15c3889:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
     15c3890:	00 
     15c3891:	75 08                	jne    15c389b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408e1f>
     15c3893:	48 89 df             	mov    rdi,rbx
     15c3896:	e8 35 c4 4a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     15c389b:	e8 10 c2 22 00       	call   17efab0 <__stack_chk_fail@plt>
- strings: 'collection' | 'Failed to refresh index entry. Ignoring. %s'

## AP materializations
### 0xc2c7e1 FDE=(12764448, 12771716): lea    rcx,[rip+0xc58190]        # 1884978 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41060>
      c2c7b2:	45 31 c9             	xor    r9d,r9d
      c2c7b5:	e8 d0 ab 9b 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      c2c7ba:	41 88 87 d0 00 00 00 	mov    BYTE PTR [r15+0xd0],al
      c2c7c1:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      c2c7c8:	00 
      c2c7c9:	48 89 ee             	mov    rsi,rbp
      c2c7cc:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
      c2c7d3:	00 
      c2c7d4:	e8 0f b7 f3 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
      c2c7d9:	6a 10                	push   0x10
      c2c7db:	5f                   	pop    rdi
      c2c7dc:	e8 1f 17 bc 00       	call   17edf00 <_Znwm@plt>
      c2c7e1:	48 8d 0d 90 81 c5 00 	lea    rcx,[rip+0xc58190]        # 1884978 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41060>
      c2c7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
      c2c7eb:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
      c2c7f0:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      c2c7f4:	48 8b 4c 24 58       	mov    rcx,QWORD PTR [rsp+0x58]
      c2c7f9:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
      c2c7fc:	48 89 01             	mov    QWORD PTR [rcx],rax
      c2c7ff:	48 85 ff             	test   rdi,rdi
      c2c802:	74 06                	je     c2c80a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1797aa>
      c2c804:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c2c807:	ff 50 08             	call   QWORD PTR [rax+0x8]
      c2c80a:	48 8b b4 24 88 00 00 	mov    rsi,QWORD PTR [rsp+0x88]
      c2c811:	00 
      c2c812:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      c2c815:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      c2c81c:	00 
      c2c81d:	ff 50 28             	call   QWORD PTR [rax+0x28]
      c2c820:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      c2c825:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c2c828:	ff 50 28             	call   QWORD PTR [rax+0x28]
      c2c82b:	49 89 c4             	mov    r12,rax
      c2c82e:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
      c2c833:	4c 8b 30             	mov    r14,QWORD PTR [rax]

## Direct calls to dependency slot +0x68 implementation
## Constructor field writes around owner+0x10
### 0xc2c613: lea    rcx,[rax+0x10]
      c2c5ec:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]
      c2c5f1:	bf f0 00 00 00       	mov    edi,0xf0
      c2c5f6:	e8 05 19 bc 00       	call   17edf00 <_Znwm@plt>
      c2c5fb:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      c2c5ff:	48 8d 0d 62 aa be 00 	lea    rcx,[rip+0xbeaa62]        # 1817068 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcd28>
      c2c606:	48 89 08             	mov    QWORD PTR [rax],rcx
      c2c609:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
      c2c60e:	48 83 60 60 00       	and    QWORD PTR [rax+0x60],0x0
      c2c613:	48 8d 48 10          	lea    rcx,[rax+0x10]
      c2c617:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
      c2c61c:	48 83 60 70 00       	and    QWORD PTR [rax+0x70],0x0
      c2c621:	48 8d 48 18          	lea    rcx,[rax+0x18]
      c2c625:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
      c2c62a:	48 83 a0 a0 00 00 00 	and    QWORD PTR [rax+0xa0],0x0
      c2c631:	00 
      c2c632:	48 8d 48 30          	lea    rcx,[rax+0x30]
      c2c636:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
      c2c63b:	48 8d 48 70          	lea    rcx,[rax+0x70]
      c2c63f:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      c2c644:	48 8d 88 c0 00 00 00 	lea    rcx,[rax+0xc0]
      c2c64b:	48 89 4c 24 78       	mov    QWORD PTR [rsp+0x78],rcx

### 0xc2c654: movdqa XMMWORD PTR [rax+0x10],xmm0
      c2c631:	00 
      c2c632:	48 8d 48 30          	lea    rcx,[rax+0x30]
      c2c636:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
      c2c63b:	48 8d 48 70          	lea    rcx,[rax+0x70]
      c2c63f:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      c2c644:	48 8d 88 c0 00 00 00 	lea    rcx,[rax+0xc0]
      c2c64b:	48 89 4c 24 78       	mov    QWORD PTR [rsp+0x78],rcx
      c2c650:	66 0f ef c0          	pxor   xmm0,xmm0
      c2c654:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
      c2c659:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
      c2c65e:	66 0f 7f 80 b0 00 00 	movdqa XMMWORD PTR [rax+0xb0],xmm0
      c2c665:	00 
      c2c666:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      c2c66b:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
      c2c672:	00 
      c2c673:	6a 18                	push   0x18
      c2c675:	5f                   	pop    rdi
      c2c676:	e8 85 18 bc 00       	call   17edf00 <_Znwm@plt>
      c2c67b:	48 89 c3             	mov    rbx,rax
      c2c67e:	48 89 ac 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rbp
      c2c685:	00 

### 0xc2c7f9: mov    rdi,QWORD PTR [rcx]
      c2c7d9:	6a 10                	push   0x10
      c2c7db:	5f                   	pop    rdi
      c2c7dc:	e8 1f 17 bc 00       	call   17edf00 <_Znwm@plt>
      c2c7e1:	48 8d 0d 90 81 c5 00 	lea    rcx,[rip+0xc58190]        # 1884978 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41060>
      c2c7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
      c2c7eb:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
      c2c7f0:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      c2c7f4:	48 8b 4c 24 58       	mov    rcx,QWORD PTR [rsp+0x58]
      c2c7f9:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
      c2c7fc:	48 89 01             	mov    QWORD PTR [rcx],rax
      c2c7ff:	48 85 ff             	test   rdi,rdi
      c2c802:	74 06                	je     c2c80a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1797aa>
      c2c804:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c2c807:	ff 50 08             	call   QWORD PTR [rax+0x8]
      c2c80a:	48 8b b4 24 88 00 00 	mov    rsi,QWORD PTR [rsp+0x88]
      c2c811:	00 
      c2c812:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      c2c815:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      c2c81c:	00 
      c2c81d:	ff 50 28             	call   QWORD PTR [rax+0x28]
      c2c820:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]

### 0xc2c7fc: mov    QWORD PTR [rcx],rax
      c2c7db:	5f                   	pop    rdi
      c2c7dc:	e8 1f 17 bc 00       	call   17edf00 <_Znwm@plt>
      c2c7e1:	48 8d 0d 90 81 c5 00 	lea    rcx,[rip+0xc58190]        # 1884978 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41060>
      c2c7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
      c2c7eb:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
      c2c7f0:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      c2c7f4:	48 8b 4c 24 58       	mov    rcx,QWORD PTR [rsp+0x58]
      c2c7f9:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
      c2c7fc:	48 89 01             	mov    QWORD PTR [rcx],rax
      c2c7ff:	48 85 ff             	test   rdi,rdi
      c2c802:	74 06                	je     c2c80a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1797aa>
      c2c804:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c2c807:	ff 50 08             	call   QWORD PTR [rax+0x8]
      c2c80a:	48 8b b4 24 88 00 00 	mov    rsi,QWORD PTR [rsp+0x88]
      c2c811:	00 
      c2c812:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      c2c815:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      c2c81c:	00 
      c2c81d:	ff 50 28             	call   QWORD PTR [rax+0x28]
      c2c820:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      c2c825:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0xc2c879: call   QWORD PTR [rax+0x10]
      c2c861:	00 
      c2c862:	4c 89 fe             	mov    rsi,r15
      c2c865:	ff 50 18             	call   QWORD PTR [rax+0x18]
      c2c868:	49 8b 07             	mov    rax,QWORD PTR [r15]
      c2c86b:	48 8d 9c 24 d0 00 00 	lea    rbx,[rsp+0xd0]
      c2c872:	00 
      c2c873:	48 89 df             	mov    rdi,rbx
      c2c876:	4c 89 fe             	mov    rsi,r15
      c2c879:	ff 50 10             	call   QWORD PTR [rax+0x10]
      c2c87c:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
      c2c87f:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
      c2c884:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
      c2c888:	4d 85 ff             	test   r15,r15
      c2c88b:	74 05                	je     c2c892 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179832>
      c2c88d:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      c2c892:	48 8d 9c 24 f0 01 00 	lea    rbx,[rsp+0x1f0]
      c2c899:	00 
      c2c89a:	4c 89 73 f0          	mov    QWORD PTR [rbx-0x10],r14
      c2c89e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      c2c8a3:	48 89 43 f8          	mov    QWORD PTR [rbx-0x8],rax
      c2c8a7:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]

### 0xc2c88d: lock inc QWORD PTR [r15+0x10]
      c2c873:	48 89 df             	mov    rdi,rbx
      c2c876:	4c 89 fe             	mov    rsi,r15
      c2c879:	ff 50 10             	call   QWORD PTR [rax+0x10]
      c2c87c:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
      c2c87f:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
      c2c884:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
      c2c888:	4d 85 ff             	test   r15,r15
      c2c88b:	74 05                	je     c2c892 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179832>
      c2c88d:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      c2c892:	48 8d 9c 24 f0 01 00 	lea    rbx,[rsp+0x1f0]
      c2c899:	00 
      c2c89a:	4c 89 73 f0          	mov    QWORD PTR [rbx-0x10],r14
      c2c89e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      c2c8a3:	48 89 43 f8          	mov    QWORD PTR [rbx-0x8],rax
      c2c8a7:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
      c2c8ae:	00 
      c2c8af:	48 89 df             	mov    rdi,rbx
      c2c8b2:	e8 ef cf 9b 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      c2c8b7:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
      c2c8bd:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
      c2c8c2:	4d 85 ff             	test   r15,r15

### 0xc2c8c7: lock inc QWORD PTR [r15+0x10]
      c2c8a7:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
      c2c8ae:	00 
      c2c8af:	48 89 df             	mov    rdi,rbx
      c2c8b2:	e8 ef cf 9b 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      c2c8b7:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
      c2c8bd:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
      c2c8c2:	4d 85 ff             	test   r15,r15
      c2c8c5:	74 05                	je     c2c8cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17986c>
      c2c8c7:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      c2c8cc:	4c 8d b4 24 10 02 00 	lea    r14,[rsp+0x210]
      c2c8d3:	00 
      c2c8d4:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
      c2c8db:	00 
      c2c8dc:	4c 89 f7             	mov    rdi,r14
      c2c8df:	e8 5c 16 bc 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      c2c8e4:	48 83 a4 24 30 02 00 	and    QWORD PTR [rsp+0x230],0x0
      c2c8eb:	00 00 
      c2c8ed:	48 83 a4 24 40 02 00 	and    QWORD PTR [rsp+0x240],0x0
      c2c8f4:	00 00 
      c2c8f6:	6a 48                	push   0x48
      c2c8f8:	5f                   	pop    rdi

### 0xc2c90c: lea    rdi,[rax+0x10]
      c2c8f4:	00 00 
      c2c8f6:	6a 48                	push   0x48
      c2c8f8:	5f                   	pop    rdi
      c2c8f9:	e8 02 16 bc 00       	call   17edf00 <_Znwm@plt>
      c2c8fe:	48 89 c3             	mov    rbx,rax
      c2c901:	0f 10 84 24 e0 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1e0]
      c2c908:	00 
      c2c909:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      c2c90c:	48 8d 78 10          	lea    rdi,[rax+0x10]
      c2c910:	48 8b b4 24 f0 01 00 	mov    rsi,QWORD PTR [rsp+0x1f0]
      c2c917:	00 
      c2c918:	e8 89 cf 9b 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      c2c91d:	48 8b 84 24 08 02 00 	mov    rax,QWORD PTR [rsp+0x208]
      c2c924:	00 
      c2c925:	f3 0f 6f 84 24 00 02 	movdqu xmm0,XMMWORD PTR [rsp+0x200]
      c2c92c:	00 00 
      c2c92e:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
      c2c933:	48 85 c0             	test   rax,rax
      c2c936:	74 05                	je     c2c93d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1798dd>
      c2c938:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      c2c93d:	48 89 df             	mov    rdi,rbx

### 0xc2c938: lock inc QWORD PTR [rax+0x10]
      c2c918:	e8 89 cf 9b 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      c2c91d:	48 8b 84 24 08 02 00 	mov    rax,QWORD PTR [rsp+0x208]
      c2c924:	00 
      c2c925:	f3 0f 6f 84 24 00 02 	movdqu xmm0,XMMWORD PTR [rsp+0x200]
      c2c92c:	00 00 
      c2c92e:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
      c2c933:	48 85 c0             	test   rax,rax
      c2c936:	74 05                	je     c2c93d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1798dd>
      c2c938:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      c2c93d:	48 89 df             	mov    rdi,rbx
      c2c940:	48 83 c7 30          	add    rdi,0x30
      c2c944:	4c 89 f6             	mov    rsi,r14
      c2c947:	e8 f4 15 bc 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      c2c94c:	48 89 9c 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rbx
      c2c953:	00 
      c2c954:	48 8d 05 8b 27 98 00 	lea    rax,[rip+0x98278b]        # 15af0e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f466a>
      c2c95b:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
      c2c962:	00 
      c2c963:	48 8d 05 a6 27 98 00 	lea    rax,[rip+0x9827a6]        # 15af110 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f4694>
      c2c96a:	48 89 84 24 48 02 00 	mov    QWORD PTR [rsp+0x248],rax
      c2c971:	00 

### 0xc2ca83: mov    QWORD PTR [rax+0x10],r13
      c2ca69:	49 89 ef             	mov    r15,rbp
      c2ca6c:	6a 20                	push   0x20
      c2ca6e:	5f                   	pop    rdi
      c2ca6f:	e8 8c 14 bc 00       	call   17edf00 <_Znwm@plt>
      c2ca74:	41 8b 4e 1c          	mov    ecx,DWORD PTR [r14+0x1c]
      c2ca78:	89 48 1c             	mov    DWORD PTR [rax+0x1c],ecx
      c2ca7b:	66 0f ef c0          	pxor   xmm0,xmm0
      c2ca7f:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
      c2ca83:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
      c2ca87:	49 89 07             	mov    QWORD PTR [r15],rax
      c2ca8a:	48 8b 8c 24 00 02 00 	mov    rcx,QWORD PTR [rsp+0x200]
      c2ca91:	00 
      c2ca92:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
      c2ca95:	48 85 c9             	test   rcx,rcx
      c2ca98:	74 0b                	je     c2caa5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a45>
      c2ca9a:	48 89 8c 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rcx
      c2caa1:	00 
      c2caa2:	49 8b 07             	mov    rax,QWORD PTR [r15]
      c2caa5:	48 8b bc 24 08 02 00 	mov    rdi,QWORD PTR [rsp+0x208]
      c2caac:	00 
      c2caad:	48 89 c6             	mov    rsi,rax

### 0xc2ca92: mov    rcx,QWORD PTR [rcx]
      c2ca74:	41 8b 4e 1c          	mov    ecx,DWORD PTR [r14+0x1c]
      c2ca78:	89 48 1c             	mov    DWORD PTR [rax+0x1c],ecx
      c2ca7b:	66 0f ef c0          	pxor   xmm0,xmm0
      c2ca7f:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
      c2ca83:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
      c2ca87:	49 89 07             	mov    QWORD PTR [r15],rax
      c2ca8a:	48 8b 8c 24 00 02 00 	mov    rcx,QWORD PTR [rsp+0x200]
      c2ca91:	00 
      c2ca92:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
      c2ca95:	48 85 c9             	test   rcx,rcx
      c2ca98:	74 0b                	je     c2caa5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a45>
      c2ca9a:	48 89 8c 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rcx
      c2caa1:	00 
      c2caa2:	49 8b 07             	mov    rax,QWORD PTR [r15]
      c2caa5:	48 8b bc 24 08 02 00 	mov    rdi,QWORD PTR [rsp+0x208]
      c2caac:	00 
      c2caad:	48 89 c6             	mov    rsi,rax
      c2cab0:	e8 69 d5 e7 ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
      c2cab5:	48 ff 84 24 10 02 00 	inc    QWORD PTR [rsp+0x210]
      c2cabc:	00 
      c2cabd:	4c 89 f7             	mov    rdi,r14

