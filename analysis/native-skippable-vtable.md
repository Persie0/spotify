# Orbit skippable vtable resolution

The derived predicate dispatches through virtual offsets +0xc8 and +0xe8.

## skippable metadata getter 0x14e2472
- pointer file+0x162578, VA 0x162578

## derived skippable predicate 0x14e248a
- pointer file+0x162590, VA 0x162590

## seekable metadata getter 0x14e24b8
- pointer file+0x1625a8, VA 0x1625a8

## interruptible metadata getter 0x14e24d0
- pointer file+0x1625c0, VA 0x1625c0

## skippable_ad_delay parser 0x14e24e8
- pointer file+0x1625d8, VA 0x1625d8

## generic metadata getter 0x14e25e7
- no literal 64-bit function pointer found

## Pointer-table neighborhoods

### around file+0x162578 / VA 0x162578
- slot VA 0x1624d0: 0x14e20da
- slot VA 0x1624e8: 0x14e2174
- slot VA 0x162500: 0x14e21b4
- slot VA 0x162518: 0x14e226a
- slot VA 0x162530: 0x14e22a4
- slot VA 0x162548: 0x14e233e
- slot VA 0x162560: 0x14e23d8
- slot VA 0x162578: 0x14e2472 ; skippable metadata getter
- slot VA 0x162590: 0x14e248a ; derived skippable predicate
- slot VA 0x1625a8: 0x14e24b8 ; seekable metadata getter
- slot VA 0x1625c0: 0x14e24d0 ; interruptible metadata getter
- slot VA 0x1625d8: 0x14e24e8 ; skippable_ad_delay parser
- slot VA 0x1625f0: 0x14e25d0

### around file+0x162590 / VA 0x162590
- slot VA 0x162548: 0x14e233e
- slot VA 0x162560: 0x14e23d8
- slot VA 0x162578: 0x14e2472 ; skippable metadata getter
- slot VA 0x162590: 0x14e248a ; derived skippable predicate
- slot VA 0x1625a8: 0x14e24b8 ; seekable metadata getter
- slot VA 0x1625c0: 0x14e24d0 ; interruptible metadata getter
- slot VA 0x1625d8: 0x14e24e8 ; skippable_ad_delay parser
- slot VA 0x1625f0: 0x14e25d0

## Exact +0xc8 / +0xe8 dispatch candidates

- no exact literal table match; dispatch may use thunks or a secondary interface vtable

## Target function cluster disassembly

    
    /tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64
    
    
    Disassembly of section .text:
    
    00000000014e2380 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327904>:
     14e2380:	48 89 df             	mov    rdi,rbx
     14e2383:	48 89 c6             	mov    rsi,rax
     14e2386:	e8 b5 bb 30 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14e238b:	48 89 e7             	mov    rdi,rsp
     14e238e:	e8 fd ba 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e2393:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e239a:	00 00 
     14e239c:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14e23a1:	75 30                	jne    14e23d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327957>
     14e23a3:	48 89 d8             	mov    rax,rbx
     14e23a6:	48 83 c4 20          	add    rsp,0x20
     14e23aa:	5b                   	pop    rbx
     14e23ab:	41 5e                	pop    r14
     14e23ad:	41 5f                	pop    r15
     14e23af:	c3                   	ret
     14e23b0:	48 89 c3             	mov    rbx,rax
     14e23b3:	48 89 e7             	mov    rdi,rsp
     14e23b6:	e8 d5 ba 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e23bb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e23c2:	00 00 
     14e23c4:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14e23c9:	75 08                	jne    14e23d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327957>
     14e23cb:	48 89 df             	mov    rdi,rbx
     14e23ce:	e8 fd d8 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14e23d3:	e8 d8 d6 30 00       	call   17efab0 <__stack_chk_fail@plt>
     14e23d8:	41 57                	push   r15
     14e23da:	41 56                	push   r14
     14e23dc:	53                   	push   rbx
     14e23dd:	48 83 ec 20          	sub    rsp,0x20
     14e23e1:	48 89 fb             	mov    rbx,rdi
     14e23e4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e23eb:	00 00 
     14e23ed:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     14e23f2:	4c 8d 76 20          	lea    r14,[rsi+0x20]
     14e23f6:	48 8d 35 7f fb f6 fe 	lea    rsi,[rip+0xfffffffffef6fb7f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     14e23fd:	49 89 e7             	mov    r15,rsp
     14e2400:	4c 89 ff             	mov    rdi,r15
     14e2403:	e8 76 76 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14e2408:	48 8d 35 a1 65 f5 fe 	lea    rsi,[rip+0xfffffffffef565a1]        # 4389b0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e3ff>
     14e240f:	4c 89 f7             	mov    rdi,r14
     14e2412:	4c 89 fa             	mov    rdx,r15
     14e2415:	e8 50 05 77 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     14e241a:	48 89 df             	mov    rdi,rbx
     14e241d:	48 89 c6             	mov    rsi,rax
     14e2420:	e8 1b bb 30 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14e2425:	48 89 e7             	mov    rdi,rsp
     14e2428:	e8 63 ba 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e242d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e2434:	00 00 
     14e2436:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14e243b:	75 30                	jne    14e246d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3279f1>
     14e243d:	48 89 d8             	mov    rax,rbx
     14e2440:	48 83 c4 20          	add    rsp,0x20
     14e2444:	5b                   	pop    rbx
     14e2445:	41 5e                	pop    r14
     14e2447:	41 5f                	pop    r15
     14e2449:	c3                   	ret
     14e244a:	48 89 c3             	mov    rbx,rax
     14e244d:	48 89 e7             	mov    rdi,rsp
     14e2450:	e8 3b ba 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e2455:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e245c:	00 00 
     14e245e:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14e2463:	75 08                	jne    14e246d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3279f1>
     14e2465:	48 89 df             	mov    rdi,rbx
     14e2468:	e8 63 d8 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14e246d:	e8 3e d6 30 00       	call   17efab0 <__stack_chk_fail@plt>
     14e2472:	48 83 c7 20          	add    rdi,0x20
     14e2476:	48 8d 35 73 64 f5 fe 	lea    rsi,[rip+0xfffffffffef56473]        # 4388f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e33f>
     14e247d:	48 8d 15 9c f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f79c]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e2484:	e9 5e 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e2489:	cc                   	int3
     14e248a:	53                   	push   rbx
     14e248b:	b0 01                	mov    al,0x1
     14e248d:	80 bf b8 01 00 00 00 	cmp    BYTE PTR [rdi+0x1b8],0x0
     14e2494:	75 13                	jne    14e24a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a2d>
     14e2496:	48 89 fb             	mov    rbx,rdi
     14e2499:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e249c:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     14e24a2:	48 85 c0             	test   rax,rax
     14e24a5:	7e 04                	jle    14e24ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a2f>
     14e24a7:	31 c0                	xor    eax,eax
     14e24a9:	5b                   	pop    rbx
     14e24aa:	c3                   	ret
     14e24ab:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14e24ae:	48 89 df             	mov    rdi,rbx
     14e24b1:	5b                   	pop    rbx
     14e24b2:	ff a0 c8 00 00 00    	jmp    QWORD PTR [rax+0xc8]
     14e24b8:	48 83 c7 20          	add    rdi,0x20
     14e24bc:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389c8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e417>
     14e24c3:	48 8d 15 56 f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f756]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e24ca:	e9 18 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e24cf:	cc                   	int3
     14e24d0:	48 83 c7 20          	add    rdi,0x20
     14e24d4:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e42f>
     14e24db:	48 8d 15 3e f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f73e]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e24e2:	e9 00 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e24e7:	cc                   	int3
     14e24e8:	41 56                	push   r14
     14e24ea:	53                   	push   rbx
     14e24eb:	48 83 ec 38          	sub    rsp,0x38
     14e24ef:	48 89 fb             	mov    rbx,rdi
     14e24f2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e24f9:	00 00 
     14e24fb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     14e2500:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14e2503:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     14e2509:	84 c0                	test   al,al
     14e250b:	74 7d                	je     14e258a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b0e>
     14e250d:	48 83 c3 20          	add    rbx,0x20
     14e2511:	48 8d 35 75 04 e9 fe 	lea    rsi,[rip+0xfffffffffee90475]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
     14e2518:	49 89 e6             	mov    r14,rsp
     14e251b:	4c 89 f7             	mov    rdi,r14
     14e251e:	e8 5b 75 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14e2523:	48 8d 35 26 64 f5 fe 	lea    rsi,[rip+0xfffffffffef56426]        # 438950 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e39f>
     14e252a:	48 89 df             	mov    rdi,rbx
     14e252d:	4c 89 f2             	mov    rdx,r14
     14e2530:	e8 35 04 77 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     14e2535:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     14e253a:	48 89 c6             	mov    rsi,rax
     14e253d:	e8 fe b9 30 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14e2542:	48 89 e3             	mov    rbx,rsp
     14e2545:	48 89 df             	mov    rdi,rbx
     14e2548:	e8 43 b9 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e254d:	83 23 00             	and    DWORD PTR [rbx],0x0
     14e2550:	48 8d 44 24 19       	lea    rax,[rsp+0x19]
     14e2555:	0f b6 48 ff          	movzx  ecx,BYTE PTR [rax-0x1]
     14e2559:	89 ce                	mov    esi,ecx
     14e255b:	d1 ee                	shr    esi,1
     14e255d:	f6 c1 01             	test   cl,0x1
     14e2560:	48 8b 78 0f          	mov    rdi,QWORD PTR [rax+0xf]
     14e2564:	48 0f 44 f8          	cmove  rdi,rax
     14e2568:	48 0f 45 70 07       	cmovne rsi,QWORD PTR [rax+0x7]
     14e256d:	48 01 fe             	add    rsi,rdi
     14e2570:	48 89 e3             	mov    rbx,rsp
     14e2573:	48 89 da             	mov    rdx,rbx
     14e2576:	e8 08 79 7e ff       	call   cc9e83 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216e23>
     14e257b:	48 63 1b             	movsxd rbx,DWORD PTR [rbx]
     14e257e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     14e2583:	e8 08 b9 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e2588:	eb 02                	jmp    14e258c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b10>
     14e258a:	31 db                	xor    ebx,ebx
     14e258c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e2593:	00 00 
     14e2595:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     14e259a:	75 2e                	jne    14e25ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b4e>
     14e259c:	48 89 d8             	mov    rax,rbx
     14e259f:	48 83 c4 38          	add    rsp,0x38
     14e25a3:	5b                   	pop    rbx
     14e25a4:	41 5e                	pop    r14
     14e25a6:	c3                   	ret
     14e25a7:	48 89 c3             	mov    rbx,rax
     14e25aa:	48 89 e7             	mov    rdi,rsp
     14e25ad:	e8 de b8 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14e25b2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e25b9:	00 00 
     14e25bb:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     14e25c0:	75 08                	jne    14e25ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b4e>
     14e25c2:	48 89 df             	mov    rdi,rbx
     14e25c5:	e8 06 d7 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14e25ca:	e8 e1 d4 30 00       	call   17efab0 <__stack_chk_fail@plt>
     14e25cf:	cc                   	int3
     14e25d0:	48 83 c7 20          	add    rdi,0x20
     14e25d4:	48 8d 35 45 63 f5 fe 	lea    rsi,[rip+0xfffffffffef56345]        # 438920 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e36f>
     14e25db:	48 8d 15 3e f6 f6 fe 	lea    rdx,[rip+0xfffffffffef6f63e]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e25e2:	e9 00 00 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e25e7:	53                   	push   rbx
     14e25e8:	48 89 d3             	mov    rbx,rdx
     14e25eb:	e8 d2 a2 5d ff       	call   abc8c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9862>
     14e25f0:	48 85 c0             	test   rax,rax
     14e25f3:	74 10                	je     14e2605 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b89>
     14e25f5:	48 83 c0 28          	add    rax,0x28
     14e25f9:	48 89 c7             	mov    rdi,rax
     14e25fc:	48 89 de             	mov    rsi,rbx
     14e25ff:	5b                   	pop    rbx
     14e2600:	e9 4a 92 59 ff       	jmp    a7b84f <JNI_OnUnload@@Base+0x311c>
     14e2605:	31 c0                	xor    eax,eax
     14e2607:	5b                   	pop    rbx
     14e2608:	c3                   	ret
     14e2609:	cc                   	int3
     14e260a:	53                   	push   rbx
     14e260b:	48 89 fb             	mov    rbx,rdi
     14e260e:	e8 69 7b f5 ff       	call   143a17c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f700>
     14e2613:	c6 43 50 01          	mov    BYTE PTR [rbx+0x50],0x1
     14e2617:	5b                   	pop    rbx
     14e2618:	c3                   	ret
     14e2619:	cc                   	int3
     14e261a:	48 89 f8             	mov    rax,rdi
     14e261d:	48 83 c7 50          	add    rdi,0x50
     14e2621:	48 83 3e 00          	cmp    QWORD PTR [rsi],0x0
     14e2625:	0f 84 fd 00 00 00    	je     14e2728 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327cac>
     14e262b:	48 8b 48 50          	mov    rcx,QWORD PTR [rax+0x50]
     14e262f:	48 39 48 58          	cmp    QWORD PTR [rax+0x58],rcx
     14e2633:	0f 84 09 00 00 00    	je     14e2642 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327bc6>
     14e2639:	48 89 cf             	mov    rdi,rcx
     14e263c:	e9 67 c6 7f ff       	jmp    cdeca8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22bc48>
     14e2641:	cc                   	int3
     14e2642:	41 57                	push   r15
     14e2644:	41 56                	push   r14
     14e2646:	41 54                	push   r12
     14e2648:	53                   	push   rbx
     14e2649:	48 83 ec 38          	sub    rsp,0x38
     14e264d:	49 89 f6             	mov    r14,rsi
