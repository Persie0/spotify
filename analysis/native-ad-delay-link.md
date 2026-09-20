# Native ContextPlayer ↔ ad delay link

## Ad-model method bodies

### ad metadata mapper: 0x14e06e2 (0x14e06e2..0x14e0722)
     14e06e2:	41 57                	push   r15
     14e06e4:	41 56                	push   r14
     14e06e6:	53                   	push   rbx
     14e06e7:	48 89 f3             	mov    rbx,rsi
     14e06ea:	49 89 fe             	mov    r14,rdi
     14e06ed:	48 8d 7a 20          	lea    rdi,[rdx+0x20]
     14e06f1:	48 89 ce             	mov    rsi,rcx
     14e06f4:	e8 c5 89 76 ff       	call   c490be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19605e>
     14e06f9:	48 85 c0             	test   rax,rax
     14e06fc:	74 1e                	je     14e071c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325ca0>
     14e06fe:	49 89 c7             	mov    r15,rax
     14e0701:	4c 89 f7             	mov    rdi,r14
     14e0704:	48 89 de             	mov    rsi,rbx
     14e0707:	e8 18 a2 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     14e070c:	48 89 c7             	mov    rdi,rax
     14e070f:	4c 89 fe             	mov    rsi,r15
     14e0712:	5b                   	pop    rbx
     14e0713:	41 5e                	pop    r14
     14e0715:	41 5f                	pop    r15
     14e0717:	e9 64 d9 30 00       	jmp    17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14e071c:	5b                   	pop    rbx
     14e071d:	41 5e                	pop    r14
     14e071f:	41 5f                	pop    r15
     14e0721:	c3                   	ret

### ad skippable metadata getter: 0x14e2472 (0x14e2472..0x14e2489)
     14e2472:	48 83 c7 20          	add    rdi,0x20
     14e2476:	48 8d 35 73 64 f5 fe 	lea    rsi,[rip+0xfffffffffef56473]        # 4388f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e33f>
     14e247d:	48 8d 15 9c f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f79c]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e2484:	e9 5e 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>

### ad state/timing decision: 0x14e248a (0x14e248a..0x14e24b8)
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

### ad seekable getter: 0x14e24b8 (0x14e24b8..0x14e24cf)
     14e24b8:	48 83 c7 20          	add    rdi,0x20
     14e24bc:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389c8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e417>
     14e24c3:	48 8d 15 56 f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f756]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e24ca:	e9 18 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>

### ad interruptible getter: 0x14e24d0 (0x14e24d0..0x14e24e7)
     14e24d0:	48 83 c7 20          	add    rdi,0x20
     14e24d4:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e42f>
     14e24db:	48 8d 15 3e f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f73e]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e24e2:	e9 00 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>

### ad skippable delay integer getter: 0x14e24e8 (0x14e24e8..0x14e25cf)
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

### generic ad metadata getter: 0x14e25e7 (0x14e25e7..0x14e2609)
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

## Direct code xrefs

### ad metadata mapper: 0x14e06e2 — 2 direct xref(s)
- 0x14dfb86 from 0x14df800..0x14e06e2
     14dfb63:	e8 18 e4 30 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     14dfb68:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfb6d:	e8 1e e3 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfb72:	48 8d 35 87 8c f5 fe 	lea    rsi,[rip+0xfffffffffef58c87]        # 438800 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e24f>
     14dfb79:	48 8d 0d d0 8d f5 fe 	lea    rcx,[rip+0xfffffffffef58dd0]        # 438950 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e39f>
     14dfb80:	4c 89 ef             	mov    rdi,r13
     14dfb83:	48 89 da             	mov    rdx,rbx
     14dfb86:	e8 57 0b 00 00       	call   14e06e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325c66>
     14dfb8b:	48 8d 35 8e 20 f7 fe 	lea    rsi,[rip+0xfffffffffef7208e]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14dfb92:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfb97:	e8 e2 9e 59 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14dfb9c:	4c 8d 73 20          	lea    r14,[rbx+0x20]
     14dfba0:	48 8d 35 a1 8c f5 fe 	lea    rsi,[rip+0xfffffffffef58ca1]        # 438848 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e297>
     14dfba7:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     14dfbac:	4c 89 f7             	mov    rdi,r14
     14dfbaf:	e8 b6 2d 77 ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>

- 0x14dfc3b from 0x14df800..0x14e06e2
     14dfc18:	e8 63 e4 30 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     14dfc1d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     14dfc22:	e8 69 e2 30 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dfc27:	48 8d 35 8a c2 f5 fe 	lea    rsi,[rip+0xfffffffffef5c28a]        # 43beb8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1ac4>
     14dfc2e:	48 8d 0d 43 8c f5 fe 	lea    rcx,[rip+0xfffffffffef58c43]        # 438878 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e2c7>
     14dfc35:	4c 89 ef             	mov    rdi,r13
     14dfc38:	48 89 da             	mov    rdx,rbx
     14dfc3b:	e8 a2 0a 00 00       	call   14e06e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325c66>
     14dfc40:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14dfc43:	48 89 df             	mov    rdi,rbx
     14dfc46:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14dfc49:	84 c0                	test   al,al
     14dfc4b:	74 71                	je     14dfcbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x325242>
     14dfc4d:	48 8d 35 dc bf f5 fe 	lea    rsi,[rip+0xfffffffffef5bfdc]        # 43bc30 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x183c>
     14dfc54:	4c 89 ef             	mov    rdi,r13
     14dfc57:	e8 c8 ac 9a ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>


### ad skippable metadata getter: 0x14e2472 — 0 direct xref(s)

### ad state/timing decision: 0x14e248a — 0 direct xref(s)

### ad seekable getter: 0x14e24b8 — 0 direct xref(s)

### ad interruptible getter: 0x14e24d0 — 0 direct xref(s)

### ad skippable delay integer getter: 0x14e24e8 — 0 direct xref(s)

### generic ad metadata getter: 0x14e25e7 — 6 direct xref(s)
- 0x14e1f28 from 0x14e1f16..0x14e1f2d
     14e1f0b:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     14e1f0f:	88 08                	mov    BYTE PTR [rax],cl
     14e1f11:	88 48 50             	mov    BYTE PTR [rax+0x50],cl
     14e1f14:	eb c9                	jmp    14e1edf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327463>
     14e1f16:	48 83 c7 20          	add    rdi,0x20
     14e1f1a:	48 8d 35 e7 69 f5 fe 	lea    rsi,[rip+0xfffffffffef569e7]        # 438908 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e357>
     14e1f21:	48 8d 15 f8 fc f6 fe 	lea    rdx,[rip+0xfffffffffef6fcf8]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14e1f28:	e9 ba 06 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14e1f2d:	cc                   	int3
     14e1f2e:	41 57                	push   r15
     14e1f30:	41 56                	push   r14
     14e1f32:	53                   	push   rbx
     14e1f33:	48 83 ec 20          	sub    rsp,0x20
     14e1f37:	48 89 fb             	mov    rbx,rdi
     14e1f3a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e1f41:	00 00 

- 0x14e2484 from 0x14e2472..0x14e2489
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

- 0x14e24ca from 0x14e24b8..0x14e24cf
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

- 0x14e24e2 from 0x14e24d0..0x14e24e7
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

- 0x14e25e2 from 0x14e25d0..0x14e25e7
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

- 0x14edaee from 0x14edac8..0x14edb06
     14edad3:	48 85 ff             	test   rdi,rdi
     14edad6:	74 2b                	je     14edb03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333087>
     14edad8:	53                   	push   rbx
     14edad9:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     14edadc:	48 83 c7 20          	add    rdi,0x20
     14edae0:	48 8d 35 21 b0 f4 fe 	lea    rsi,[rip+0xfffffffffef4b021]        # 438b08 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e557>
     14edae7:	48 8d 15 32 41 f6 fe 	lea    rdx,[rip+0xfffffffffef64132]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     14edaee:	e8 f4 4a ff ff       	call   14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
     14edaf3:	84 c0                	test   al,al
     14edaf5:	74 0b                	je     14edb02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333086>
     14edaf7:	6a 01                	push   0x1
     14edaf9:	5e                   	pop    rsi
     14edafa:	48 89 df             	mov    rdi,rbx
     14edafd:	e8 78 00 00 00       	call   14edb7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3330fe>
     14edb02:	5b                   	pop    rbx
     14edb03:	31 c0                	xor    eax,eax


### ContextPlayer restriction event: 0x10a9668 — 1 direct xref(s)
- 0x10a96b4 from 0x10a96b0..0x10a96b9
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>
     10a96af:	cc                   	int3
     10a96b0:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96b4:	e9 af ff ff ff       	jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>
     10a96b9:	cc                   	int3
     10a96ba:	41 56                	push   r14
     10a96bc:	53                   	push   rbx
     10a96bd:	48 83 ec 28          	sub    rsp,0x28
     10a96c1:	48 89 fb             	mov    rbx,rdi
     10a96c4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a96cb:	00 00 
     10a96cd:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax


### ContextPlayer restriction builder: 0x10a6464 — 4 direct xref(s)
- 0x10a645f from 0x10a645c..0x10a6464
     10a644b:	48 89 87 b0 03 00 00 	mov    QWORD PTR [rdi+0x3b0],rax
     10a6452:	c3                   	ret
     10a6453:	cc                   	int3
     10a6454:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10a6457:	e9 00 00 00 00       	jmp    10a645c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d872>
     10a645c:	6a 01                	push   0x1
     10a645e:	5e                   	pop    rsi
     10a645f:	e9 00 00 00 00       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a6464:	55                   	push   rbp
     10a6465:	41 57                	push   r15
     10a6467:	41 56                	push   r14
     10a6469:	41 55                	push   r13
     10a646b:	41 54                	push   r12
     10a646d:	53                   	push   rbx
     10a646e:	48 81 ec 38 08 00 00 	sub    rsp,0x838
     10a6475:	89 f5                	mov    ebp,esi

- 0x10a8d97 from 0x10a8aae..0x10a8da4
     10a8d85:	e8 0a a1 d8 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     10a8d8a:	6a 01                	push   0x1
     10a8d8c:	5e                   	pop    rsi
     10a8d8d:	48 89 df             	mov    rdi,rbx
     10a8d90:	48 83 c4 08          	add    rsp,0x8
     10a8d94:	5b                   	pop    rbx
     10a8d95:	41 5e                	pop    r14
     10a8d97:	e9 c8 d6 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a8d9c:	48 89 c7             	mov    rdi,rax
     10a8d9f:	e8 01 0d 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a8da4:	48 8d 87 90 10 00 00 	lea    rax,[rdi+0x1090]
     10a8dab:	c3                   	ret
     10a8dac:	48 8d 87 58 14 00 00 	lea    rax,[rdi+0x1458]
     10a8db3:	c3                   	ret
     10a8db4:	41 57                	push   r15
     10a8db6:	41 56                	push   r14

- 0x10a9696 from 0x10a9668..0x10a969c
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>
     10a96af:	cc                   	int3
     10a96b0:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8

- 0x10a9fb1 from 0x10a9f9e..0x10a9fbe
     10a9f9e:	53                   	push   rbx
     10a9f9f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     10a9fa2:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     10a9fa6:	e8 13 00 00 00       	call   10a9fbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713d4>
     10a9fab:	48 89 df             	mov    rdi,rbx
     10a9fae:	31 f6                	xor    esi,esi
     10a9fb0:	5b                   	pop    rbx
     10a9fb1:	e9 ae c4 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a9fb6:	48 89 c7             	mov    rdi,rax
     10a9fb9:	e8 e7 fa 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9fbe:	55                   	push   rbp
     10a9fbf:	41 57                	push   r15
     10a9fc1:	41 56                	push   r14
     10a9fc3:	41 55                	push   r13
     10a9fc5:	41 54                	push   r12
     10a9fc7:	53                   	push   rbx


## Static function-pointer slots

### ad metadata mapper: 0x14e06e2
- none

### ad skippable metadata getter: 0x14e2472
- file 0x162578 / VA 0x162578
    +-0x60: 0x14e226a
    +-0x48: 0x14e22a4
    +-0x30: 0x14e233e
    +-0x18: 0x14e23d8
    ++0x0: 0x14e2472
    ++0x18: 0x14e248a
    ++0x30: 0x14e24b8
    ++0x48: 0x14e24d0
    ++0x60: 0x14e24e8
    ++0x78: 0x14e25d0

### ad state/timing decision: 0x14e248a
- file 0x162590 / VA 0x162590
    +-0x60: 0x14e22a4
    +-0x48: 0x14e233e
    +-0x30: 0x14e23d8
    +-0x18: 0x14e2472
    ++0x0: 0x14e248a
    ++0x18: 0x14e24b8
    ++0x30: 0x14e24d0
    ++0x48: 0x14e24e8
    ++0x60: 0x14e25d0
    ++0x78: 0x14e40ca

### ad seekable getter: 0x14e24b8
- file 0x1625a8 / VA 0x1625a8
    +-0x60: 0x14e233e
    +-0x48: 0x14e23d8
    +-0x30: 0x14e2472
    +-0x18: 0x14e248a
    ++0x0: 0x14e24b8
    ++0x18: 0x14e24d0
    ++0x30: 0x14e24e8
    ++0x48: 0x14e25d0
    ++0x60: 0x14e40ca
    ++0x78: 0x14e41c2

### ad interruptible getter: 0x14e24d0
- file 0x1625c0 / VA 0x1625c0
    +-0x60: 0x14e23d8
    +-0x48: 0x14e2472
    +-0x30: 0x14e248a
    +-0x18: 0x14e24b8
    ++0x0: 0x14e24d0
    ++0x18: 0x14e24e8
    ++0x30: 0x14e25d0
    ++0x48: 0x14e40ca
    ++0x60: 0x14e41c2
    ++0x78: 0x14e41d4

### ad skippable delay integer getter: 0x14e24e8
- file 0x1625d8 / VA 0x1625d8
    +-0x60: 0x14e2472
    +-0x48: 0x14e248a
    +-0x30: 0x14e24b8
    +-0x18: 0x14e24d0
    ++0x0: 0x14e24e8
    ++0x18: 0x14e25d0
    ++0x30: 0x14e40ca
    ++0x48: 0x14e41c2
    ++0x60: 0x14e41d4
    ++0x78: 0x14e42b0

### generic ad metadata getter: 0x14e25e7
- none

### ContextPlayer restriction event: 0x10a9668
- file 0xf6518 / VA 0xf6518
    +-0x60: 0x10a95a2
    +-0x48: 0x10a95c0
    +-0x30: 0x10a95de
    +-0x18: 0x10a95fc
    ++0x0: 0x10a9668
    ++0x18: 0x10a969c
    ++0x30: 0x10a96a6

### ContextPlayer restriction builder: 0x10a6464
- none

## +0x1b8 references in relevant native areas

### 0x1012ae7 in 0x1012abc..0x10132c0
     1012ac3:	41 54                	push   r12
     1012ac5:	53                   	push   rbx
     1012ac6:	48 81 ec 58 02 00 00 	sub    rsp,0x258
     1012acd:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     1012ad1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1012ad8:	00 00 
     1012ada:	48 89 84 24 50 02 00 	mov    QWORD PTR [rsp+0x250],rax
     1012ae1:	00 
     1012ae2:	48 89 74 24 20       	mov    QWORD PTR [rsp+0x20],rsi
     1012ae7:	48 89 b4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rsi
     1012aee:	00 
     1012aef:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
     1012af4:	48 89 94 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rdx
     1012afb:	00 
     1012afc:	48 89 8c 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rcx
     1012b03:	00 
     1012b04:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
     1012b09:	4c 89 8c 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],r9
     1012b10:	00 
     1012b11:	41 8b 40 28          	mov    eax,DWORD PTR [r8+0x28]

### 0x1012b23 in 0x1012abc..0x10132c0
     1012afc:	48 89 8c 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rcx
     1012b03:	00 
     1012b04:	4c 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],r9
     1012b09:	4c 89 8c 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],r9
     1012b10:	00 
     1012b11:	41 8b 40 28          	mov    eax,DWORD PTR [r8+0x28]
     1012b15:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1012b1a:	48 39 c8             	cmp    rax,rcx
     1012b1d:	0f 84 b4 06 00 00    	je     10131d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da5ed>
     1012b23:	48 8d 8c 24 b8 01 00 	lea    rcx,[rsp+0x1b8]
     1012b2a:	00 
     1012b2b:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     1012b30:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     1012b33:	49 83 c0 08          	add    r8,0x8
     1012b37:	48 8d 0d c2 24 83 00 	lea    rcx,[rip+0x8324c2]        # 1845000 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16e8>
     1012b3e:	48 8d 9c 24 d8 00 00 	lea    rbx,[rsp+0xd8]
     1012b45:	00 
     1012b46:	48 89 df             	mov    rdi,rbx
     1012b49:	4c 89 c2             	mov    rdx,r8
     1012b4c:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]

### 0x1012b90 in 0x1012abc..0x10132c0
     1012b6a:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     1012b6f:	48 39 c2             	cmp    rdx,rax
     1012b72:	0f 84 d2 02 00 00    	je     1012e4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da260>
     1012b78:	48 8d 9c 24 c0 01 00 	lea    rbx,[rsp+0x1c0]
     1012b7f:	00 
     1012b80:	4c 8d ac 24 38 02 00 	lea    r13,[rsp+0x238]
     1012b87:	00 
     1012b88:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
     1012b8f:	00 
     1012b90:	48 8d ac 24 b8 01 00 	lea    rbp,[rsp+0x1b8]
     1012b97:	00 
     1012b98:	49 c7 c6 68 ff ff ff 	mov    r14,0xffffffffffffff68
     1012b9f:	8b 42 30             	mov    eax,DWORD PTR [rdx+0x30]
     1012ba2:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1012ba7:	48 39 c8             	cmp    rax,rcx
     1012baa:	0f 84 0b 06 00 00    	je     10131bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da5d1>
     1012bb0:	48 8d 4c 24 48       	lea    rcx,[rsp+0x48]
     1012bb5:	48 89 8c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rcx
     1012bbc:	00 
     1012bbd:	4c 89 ff             	mov    rdi,r15

### 0x1012bb5 in 0x1012abc..0x10132c0
     1012b8f:	00 
     1012b90:	48 8d ac 24 b8 01 00 	lea    rbp,[rsp+0x1b8]
     1012b97:	00 
     1012b98:	49 c7 c6 68 ff ff ff 	mov    r14,0xffffffffffffff68
     1012b9f:	8b 42 30             	mov    eax,DWORD PTR [rdx+0x30]
     1012ba2:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1012ba7:	48 39 c8             	cmp    rax,rcx
     1012baa:	0f 84 0b 06 00 00    	je     10131bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da5d1>
     1012bb0:	48 8d 4c 24 48       	lea    rcx,[rsp+0x48]
     1012bb5:	48 89 8c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rcx
     1012bbc:	00 
     1012bbd:	4c 89 ff             	mov    rdi,r15
     1012bc0:	48 89 ee             	mov    rsi,rbp
     1012bc3:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     1012bc8:	48 8d 0d 91 38 83 00 	lea    rcx,[rip+0x833891]        # 1846460 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2b48>
     1012bcf:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
     1012bd2:	4c 8b a4 24 a0 00 00 	mov    r12,QWORD PTR [rsp+0xa0]
     1012bd9:	00 
     1012bda:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     1012be1:	00 

### 0x1012dff in 0x1012abc..0x10132c0
     1012dda:	00 
     1012ddb:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1012de0:	0f 13 44 24 48       	movlps QWORD PTR [rsp+0x48],xmm0
     1012de5:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1012dea:	e8 23 06 00 00       	call   1013412 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da828>
     1012def:	48 8d 9c 24 c0 01 00 	lea    rbx,[rsp+0x1c0]
     1012df6:	00 
     1012df7:	4c 8d ac 24 38 02 00 	lea    r13,[rsp+0x238]
     1012dfe:	00 
     1012dff:	48 8d ac 24 b8 01 00 	lea    rbp,[rsp+0x1b8]
     1012e06:	00 
     1012e07:	4c 89 bc 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],r15
     1012e0e:	00 
     1012e0f:	48 89 ef             	mov    rdi,rbp
     1012e12:	e8 3d 06 00 00       	call   1013454 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da86a>
     1012e17:	49 83 ec 80          	sub    r12,0xffffffffffffff80
     1012e1b:	4c 3b 64 24 10       	cmp    r12,QWORD PTR [rsp+0x10]
     1012e20:	0f 85 d8 fd ff ff    	jne    1012bfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da014>
     1012e26:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
     1012e2d:	00 

### 0x1012eb2 in 0x1012abc..0x10132c0
     1012e8d:	48 89 47 f8          	mov    QWORD PTR [rdi-0x8],rax
     1012e91:	0f 57 c0             	xorps  xmm0,xmm0
     1012e94:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
     1012e9b:	00 
     1012e9c:	48 83 a4 24 d0 00 00 	and    QWORD PTR [rsp+0xd0],0x0
     1012ea3:	00 00 
     1012ea5:	48 8d b4 24 78 01 00 	lea    rsi,[rsp+0x178]
     1012eac:	00 
     1012ead:	e8 c8 a5 ff ff       	call   100d47a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4890>
     1012eb2:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1012eb9:	00 
     1012eba:	c6 46 60 01          	mov    BYTE PTR [rsi+0x60],0x1
     1012ebe:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     1012ec5:	00 
     1012ec6:	e8 63 c8 ff ff       	call   100f72e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6b44>
     1012ecb:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1012ed2:	00 
     1012ed3:	48 8d b4 24 78 01 00 	lea    rsi,[rsp+0x178]
     1012eda:	00 
     1012edb:	e8 84 c8 ff ff       	call   100f764 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6b7a>

### 0x1013147 in 0x1012abc..0x10132c0
     1013120:	e8 61 b3 a8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1013125:	48 89 df             	mov    rdi,rbx
     1013128:	e8 23 a3 ff ff       	call   100d450 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4866>
     101312d:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     1013134:	00 
     1013135:	e8 4c b3 a8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     101313a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     1013141:	00 
     1013142:	e8 ab 05 00 00       	call   10136f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dab08>
     1013147:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     101314e:	00 
     101314f:	e8 9e 05 00 00       	call   10136f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dab08>
     1013154:	eb 11                	jmp    1013167 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da57d>
     1013156:	48 8d b4 24 78 01 00 	lea    rsi,[rsp+0x178]
     101315d:	00 
     101315e:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     1013162:	e8 fd c5 ff ff       	call   100f764 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6b7a>
     1013167:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
     101316e:	00 
     101316f:	e8 78 13 fb ff       	call   fc44ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18b902>

### 0x1013204 in 0x1012abc..0x10132c0
     10131e7:	00 
     10131e8:	0f 85 cd 00 00 00    	jne    10132bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da6d1>
     10131ee:	e8 b0 bc a9 ff       	call   aaeea3 <JNI_OnUnload@@Base+0x36770>
     10131f3:	eb 04                	jmp    10131f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da60f>
     10131f5:	eb 02                	jmp    10131f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da60f>
     10131f7:	eb 00                	jmp    10131f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da60f>
     10131f9:	48 89 c7             	mov    rdi,rax
     10131fc:	e8 a4 68 a6 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1013201:	49 89 c6             	mov    r14,rax
     1013204:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     101320b:	00 
     101320c:	e8 f7 04 00 00       	call   1013708 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dab1e>
     1013211:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
     1013218:	00 
     1013219:	e8 ce 12 fb ff       	call   fc44ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18b902>
     101321e:	eb 66                	jmp    1013286 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da69c>
     1013220:	eb 02                	jmp    1013224 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da63a>
     1013222:	eb 00                	jmp    1013224 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da63a>
     1013224:	49 89 c6             	mov    r14,rax
     1013227:	eb 5d                	jmp    1013286 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da69c>

### 0x101326c in 0x1012abc..0x10132c0
     1013248:	48 89 df             	mov    rdi,rbx
     101324b:	e8 de ca ff ff       	call   100fd2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d7144>
     1013250:	eb 27                	jmp    1013279 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da68f>
     1013252:	49 89 c6             	mov    r14,rax
     1013255:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
     101325c:	00 
     101325d:	e8 76 01 00 00       	call   10133d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da7ee>
     1013262:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1013267:	e8 a6 01 00 00       	call   1013412 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da828>
     101326c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1013273:	00 
     1013274:	e8 db 01 00 00       	call   1013454 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1da86a>
     1013279:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1013280:	00 
     1013281:	e8 4a c8 ff ff       	call   100fad0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6ee6>
     1013286:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     101328d:	00 
     101328e:	e8 75 04 00 00       	call   1013708 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dab1e>
     1013293:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     101329a:	00 

### 0x101590c in 0x1015876..0x101600a
     10158e3:	e8 9e 8b a8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10158e8:	41 80 7e 28 00       	cmp    BYTE PTR [r14+0x28],0x0
     10158ed:	0f 84 a8 00 00 00    	je     101599b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dcdb1>
     10158f3:	49 8b 47 38          	mov    rax,QWORD PTR [r15+0x38]
     10158f7:	48 8b 70 18          	mov    rsi,QWORD PTR [rax+0x18]
     10158fb:	48 8b 50 20          	mov    rdx,QWORD PTR [rax+0x20]
     10158ff:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     1015906:	00 
     1015907:	e8 60 7e 02 00       	call   103d76c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x204b82>
     101590c:	80 bc 24 b8 01 00 00 	cmp    BYTE PTR [rsp+0x1b8],0x0
     1015913:	00 
     1015914:	0f 84 0c 01 00 00    	je     1015a26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dce3c>
     101591a:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
     101591f:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
     1015924:	89 6c 24 04          	mov    DWORD PTR [rsp+0x4],ebp
     1015928:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
     101592d:	49 8b 6f 20          	mov    rbp,QWORD PTR [r15+0x20]
     1015931:	4d 8b 6f 28          	mov    r13,QWORD PTR [r15+0x28]
     1015935:	4c 89 e8             	mov    rax,r13
     1015938:	48 29 e8             	sub    rax,rbp

### 0x102127c in 0x10211ed..0x10216c1
     1021262:	4c 29 f0             	sub    rax,r14
     1021265:	74 3c                	je     10212a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e86b9>
     1021267:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     102126c:	6a 30                	push   0x30
     102126e:	59                   	pop    rcx
     102126f:	48 99                	cqo
     1021271:	48 f7 f9             	idiv   rcx
     1021274:	48 89 c6             	mov    rsi,rax
     1021277:	e8 3c 5a c9 ff       	call   cb6cb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c58>
     102127c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1021283:	00 
     1021284:	4c 8b 7f f8          	mov    r15,QWORD PTR [rdi-0x8]
     1021288:	4c 89 f6             	mov    rsi,r14
     102128b:	48 89 da             	mov    rdx,rbx
     102128e:	4c 89 f9             	mov    rcx,r15
     1021291:	e8 2b 04 00 00       	call   10216c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8ad7>
     1021296:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     102129d:	00 
     102129e:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     10212a3:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]

### 0x1025c46 in 0x1025b26..0x102628e
     1025c1e:	e8 49 7b 01 00       	call   103d76c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x204b82>
     1025c23:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     1025c2a:	00 
     1025c2b:	e8 9a 9f b1 ff       	call   b3fbca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8cb6a>
     1025c30:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1025c35:	48 8d b4 24 00 02 00 	lea    rsi,[rsp+0x200]
     1025c3c:	00 
     1025c3d:	e8 b6 18 ab ff       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
     1025c42:	4d 8d 67 30          	lea    r12,[r15+0x30]
     1025c46:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1025c4d:	00 
     1025c4e:	4c 89 e6             	mov    rsi,r12
     1025c51:	e8 dc 8b ff ff       	call   101e832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e5c48>
     1025c56:	4c 8d ac 24 e0 01 00 	lea    r13,[rsp+0x1e0]
     1025c5d:	00 
     1025c5e:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1025c65:	00 
     1025c66:	4c 89 ef             	mov    rdi,r13
     1025c69:	e8 4e 8b ff ff       	call   101e7bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e5bd2>
     1025c6e:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]

### 0x1025c5e in 0x1025b26..0x102628e
     1025c3c:	00 
     1025c3d:	e8 b6 18 ab ff       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
     1025c42:	4d 8d 67 30          	lea    r12,[r15+0x30]
     1025c46:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1025c4d:	00 
     1025c4e:	4c 89 e6             	mov    rsi,r12
     1025c51:	e8 dc 8b ff ff       	call   101e832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e5c48>
     1025c56:	4c 8d ac 24 e0 01 00 	lea    r13,[rsp+0x1e0]
     1025c5d:	00 
     1025c5e:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1025c65:	00 
     1025c66:	4c 89 ef             	mov    rdi,r13
     1025c69:	e8 4e 8b ff ff       	call   101e7bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e5bd2>
     1025c6e:	48 8d bc 24 90 04 00 	lea    rdi,[rsp+0x490]
     1025c75:	00 
     1025c76:	4c 89 ee             	mov    rsi,r13
     1025c79:	e8 c8 81 ff ff       	call   101de46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e525c>
     1025c7e:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     1025c85:	00 
     1025c86:	4c 89 e6             	mov    rsi,r12

### 0x1025fc1 in 0x1025b26..0x102628e
     1025f9a:	48 8d bc 24 98 01 00 	lea    rdi,[rsp+0x198]
     1025fa1:	00 
     1025fa2:	e8 8d 84 ff ff       	call   101e434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e584a>
     1025fa7:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     1025fae:	00 
     1025faf:	e8 86 06 00 00       	call   102663a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1eda50>
     1025fb4:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     1025fbb:	00 
     1025fbc:	e8 73 84 ff ff       	call   101e434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e584a>
     1025fc1:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1025fc8:	00 
     1025fc9:	e8 6c 06 00 00       	call   102663a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1eda50>
     1025fce:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1025fd3:	e8 10 56 a5 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     1025fd8:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     1025fdf:	00 
     1025fe0:	e8 37 4f fa ff       	call   fcaf1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x192332>
     1025fe5:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1025fea:	e8 fd e4 f9 ff       	call   fc44ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18b902>
     1025fef:	31 ff                	xor    edi,edi

### 0x1026214 in 0x1025b26..0x102628e
     10261f7:	00 
     10261f8:	e8 3d 04 00 00       	call   102663a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1eda50>
     10261fd:	40 b5 01             	mov    bpl,0x1
     1026200:	eb 05                	jmp    1026207 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ed61d>
     1026202:	48 89 c3             	mov    rbx,rax
     1026205:	31 ed                	xor    ebp,ebp
     1026207:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     102620e:	00 
     102620f:	e8 20 82 ff ff       	call   101e434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e584a>
     1026214:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     102621b:	00 
     102621c:	e8 19 04 00 00       	call   102663a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1eda50>
     1026221:	40 84 ed             	test   bpl,bpl
     1026224:	75 12                	jne    1026238 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ed64e>
     1026226:	48 8d bc 24 98 04 00 	lea    rdi,[rsp+0x498]
     102622d:	00 
     102622e:	e8 a5 81 ff ff       	call   101e3d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e57ee>
     1026233:	eb 03                	jmp    1026238 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ed64e>
     1026235:	48 89 c3             	mov    rbx,rax
     1026238:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]

### 0x102eea4 in 0x102e90a..0x102f6da
     102ee7f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     102ee84:	4c 8d a4 24 a0 01 00 	lea    r12,[rsp+0x1a0]
     102ee8b:	00 
     102ee8c:	4c 89 e7             	mov    rdi,r12
     102ee8f:	e8 88 a8 fe ff       	call   101971c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0b32>
     102ee94:	48 8b 84 24 30 01 00 	mov    rax,QWORD PTR [rsp+0x130]
     102ee9b:	00 
     102ee9c:	0f 10 84 24 28 01 00 	movups xmm0,XMMWORD PTR [rsp+0x128]
     102eea3:	00 
     102eea4:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
     102eeab:	00 
     102eeac:	48 85 c0             	test   rax,rax
     102eeaf:	74 05                	je     102eeb6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f62cc>
     102eeb1:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     102eeb6:	48 8b 84 24 40 01 00 	mov    rax,QWORD PTR [rsp+0x140]
     102eebd:	00 
     102eebe:	0f 10 84 24 38 01 00 	movups xmm0,XMMWORD PTR [rsp+0x138]
     102eec5:	00 
     102eec6:	0f 11 84 24 c8 01 00 	movups XMMWORD PTR [rsp+0x1c8],xmm0
     102eecd:	00 

### 0x103de8f in 0x103de64..0x103e0e4
     103de69:	48 81 ec 00 02 00 00 	sub    rsp,0x200
     103de70:	48 89 fb             	mov    rbx,rdi
     103de73:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     103de7a:	00 00 
     103de7c:	48 89 84 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rax
     103de83:	00 
     103de84:	31 c0                	xor    eax,eax
     103de86:	48 83 a4 24 88 01 00 	and    QWORD PTR [rsp+0x188],0x0
     103de8d:	00 00 
     103de8f:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
     103de96:	88 84 24 f0 01 00 00 	mov    BYTE PTR [rsp+0x1f0],al
     103de9d:	48 8d 05 fc 02 86 00 	lea    rax,[rip+0x8602fc]        # 189e1a0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xb0e0>
     103dea4:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
     103deab:	00 
     103deac:	0f 57 c0             	xorps  xmm0,xmm0
     103deaf:	83 a4 24 b0 01 00 00 	and    DWORD PTR [rsp+0x1b0],0x0
     103deb6:	00 
     103deb7:	0f 11 84 24 90 01 00 	movups XMMWORD PTR [rsp+0x190],xmm0
     103debe:	00 
     103debf:	0f 11 84 24 a0 01 00 	movups XMMWORD PTR [rsp+0x1a0],xmm0

### 0x103defd in 0x103de64..0x103e0e4
     103ded7:	4c 8d 3d ca 37 95 00 	lea    r15,[rip+0x9537ca]        # 19916a8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x5a2f0>
     103dede:	48 89 c1             	mov    rcx,rax
     103dee1:	49 0f 44 cf          	cmove  rcx,r15
     103dee5:	f6 41 10 01          	test   BYTE PTR [rcx+0x10],0x1
     103dee9:	74 23                	je     103df0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x205324>
     103deeb:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
     103deef:	48 85 c0             	test   rax,rax
     103def2:	48 8d 35 bf 92 95 00 	lea    rsi,[rip+0x9592bf]        # 19971b8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x5fe00>
     103def9:	48 0f 45 f0          	cmovne rsi,rax
     103defd:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     103df04:	00 
     103df05:	e8 60 a7 fd ff       	call   101866a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dfa80>
     103df0a:	49 8b 46 48          	mov    rax,QWORD PTR [r14+0x48]
     103df0e:	48 85 c0             	test   rax,rax
     103df11:	4c 0f 45 f8          	cmovne r15,rax
     103df15:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
     103df19:	48 85 c0             	test   rax,rax
     103df1c:	48 8d 35 6d 8e 95 00 	lea    rsi,[rip+0x958e6d]        # 1996d90 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x5f9d8>
     103df23:	48 0f 45 f0          	cmovne rsi,rax
     103df27:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]

### 0x103df4b in 0x103de64..0x103e0e4
     103df23:	48 0f 45 f0          	cmovne rsi,rax
     103df27:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     103df2e:	00 
     103df2f:	e8 2c 0b 71 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
     103df34:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     103df39:	48 8d b4 24 80 01 00 	lea    rsi,[rsp+0x180]
     103df40:	00 
     103df41:	e8 1e de f8 ff       	call   fcbd64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19317a>
     103df46:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
     103df4b:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     103df52:	00 
     103df53:	4c 89 f7             	mov    rdi,r14
     103df56:	e8 ab fc ff ff       	call   103dc06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20501c>
     103df5b:	0f 57 c0             	xorps  xmm0,xmm0
     103df5e:	41 0f 11 46 70       	movups XMMWORD PTR [r14+0x70],xmm0
     103df63:	41 0f 11 46 60       	movups XMMWORD PTR [r14+0x60],xmm0
     103df68:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
     103df6d:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     103df72:	49 83 a6 80 00 00 00 	and    QWORD PTR [r14+0x80],0x0
     103df79:	00 

### 0x103e055 in 0x103de64..0x103e0e4
     103e02e:	48 89 e6             	mov    rsi,rsp
     103e031:	e8 18 0d 00 00       	call   103ed4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x206164>
     103e036:	48 89 e7             	mov    rdi,rsp
     103e039:	e8 8e fd ff ff       	call   103ddcc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2051e2>
     103e03e:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     103e043:	e8 04 80 fd ff       	call   101604c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dd462>
     103e048:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     103e04f:	00 
     103e050:	e8 13 ca 66 00       	call   16aaa68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ebd4>
     103e055:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     103e05c:	00 
     103e05d:	e8 08 78 fd ff       	call   101586a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dcc80>
     103e062:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     103e069:	00 00 
     103e06b:	48 3b 84 24 f8 01 00 	cmp    rax,QWORD PTR [rsp+0x1f8]
     103e072:	00 
     103e073:	75 6a                	jne    103e0df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2054f5>
     103e075:	48 81 c4 00 02 00 00 	add    rsp,0x200
     103e07c:	5b                   	pop    rbx
     103e07d:	41 5e                	pop    r14

### 0x103e0b7 in 0x103de64..0x103e0e4
     103e093:	eb 03                	jmp    103e098 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2054ae>
     103e095:	49 89 c6             	mov    r14,rax
     103e098:	48 89 e7             	mov    rdi,rsp
     103e09b:	e8 2c fd ff ff       	call   103ddcc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2051e2>
     103e0a0:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     103e0a5:	e8 a2 7f fd ff       	call   101604c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dd462>
     103e0aa:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     103e0b1:	00 
     103e0b2:	e8 b1 c9 66 00       	call   16aaa68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ebd4>
     103e0b7:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     103e0be:	00 
     103e0bf:	e8 a6 77 fd ff       	call   101586a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dcc80>
     103e0c4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     103e0cb:	00 00 
     103e0cd:	48 3b 84 24 f8 01 00 	cmp    rax,QWORD PTR [rsp+0x1f8]
     103e0d4:	00 
     103e0d5:	75 08                	jne    103e0df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2054f5>
     103e0d7:	4c 89 f7             	mov    rdi,r14
     103e0da:	e8 f1 1b a3 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     103e0df:	e8 cc 19 7b 00       	call   17efab0 <__stack_chk_fail@plt>

### 0x104ef7a in 0x104eb38..0x104f2bd
     104ef54:	4c 89 ee             	mov    rsi,r13
     104ef57:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     104ef5d:	4d 85 f6             	test   r14,r14
     104ef60:	74 05                	je     104ef67 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21637d>
     104ef62:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     104ef67:	48 8d 05 c2 88 7f 00 	lea    rax,[rip+0x7f88c2]        # 1847830 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3f18>
     104ef6e:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     104ef75:	00 
     104ef76:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     104ef7a:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     104ef81:	00 
     104ef82:	4c 89 b4 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],r14
     104ef89:	00 
     104ef8a:	48 89 9c 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rbx
     104ef91:	00 
     104ef92:	31 ff                	xor    edi,edi
     104ef94:	e8 19 f5 a4 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     104ef99:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
     104efa0:	00 
     104efa1:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0x104f107 in 0x104eb38..0x104f2bd
     104f0e1:	0f 57 c0             	xorps  xmm0,xmm0
     104f0e4:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     104f0e8:	48 8d 05 a9 f6 7c 00 	lea    rax,[rip+0x7cf6a9]        # 181e798 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14458>
     104f0ef:	48 89 03             	mov    QWORD PTR [rbx],rax
     104f0f2:	48 83 63 18 00       	and    QWORD PTR [rbx+0x18],0x0
     104f0f7:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     104f0fc:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     104f100:	31 ff                	xor    edi,edi
     104f102:	e8 7f f3 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     104f107:	48 89 9c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbx
     104f10e:	00 
     104f10f:	31 ff                	xor    edi,edi
     104f111:	e8 70 f3 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     104f116:	31 ff                	xor    edi,edi
     104f118:	e8 69 f3 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     104f11d:	4c 89 ff             	mov    rdi,r15
     104f120:	e8 61 f3 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     104f125:	48 8b bc 24 28 01 00 	mov    rdi,QWORD PTR [rsp+0x128]
     104f12c:	00 
     104f12d:	e8 54 f3 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x104f172 in 0x104eb38..0x104f2bd
     104f14f:	48 8d b4 24 b0 01 00 	lea    rsi,[rsp+0x1b0]
     104f156:	00 
     104f157:	e8 c0 a6 a6 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     104f15c:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
     104f161:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     104f164:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
     104f168:	4d 85 f6             	test   r14,r14
     104f16b:	74 05                	je     104f172 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x216588>
     104f16d:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     104f172:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     104f179:	00 
     104f17a:	e8 07 f3 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     104f17f:	4c 89 f7             	mov    rdi,r14
     104f182:	e8 ff f2 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     104f187:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     104f18e:	00 00 
     104f190:	48 3b 84 24 00 02 00 	cmp    rax,QWORD PTR [rsp+0x200]
     104f197:	00 
     104f198:	75 57                	jne    104f1f1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x216607>
     104f19a:	48 89 d8             	mov    rax,rbx

### 0x10515b7 in 0x1051456..0x10516ad
     1051587:	48 89 83 80 01 00 00 	mov    QWORD PTR [rbx+0x180],rax
     105158e:	0f 57 c0             	xorps  xmm0,xmm0
     1051591:	0f 11 83 88 01 00 00 	movups XMMWORD PTR [rbx+0x188],xmm0
     1051598:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
     105159f:	48 83 a3 a8 01 00 00 	and    QWORD PTR [rbx+0x1a8],0x0
     10515a6:	00 
     10515a7:	b8 00 00 80 3f       	mov    eax,0x3f800000
     10515ac:	89 83 b0 01 00 00    	mov    DWORD PTR [rbx+0x1b0],eax
     10515b2:	b9 e8 03 00 00       	mov    ecx,0x3e8
     10515b7:	48 89 8b b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],rcx
     10515be:	48 89 8b c0 01 00 00 	mov    QWORD PTR [rbx+0x1c0],rcx
     10515c5:	48 83 a3 c8 01 00 00 	and    QWORD PTR [rbx+0x1c8],0x0
     10515cc:	00 
     10515cd:	48 8d 8b d0 01 00 00 	lea    rcx,[rbx+0x1d0]
     10515d4:	48 89 8b d0 01 00 00 	mov    QWORD PTR [rbx+0x1d0],rcx
     10515db:	48 89 8b d8 01 00 00 	mov    QWORD PTR [rbx+0x1d8],rcx
     10515e2:	48 83 a3 00 02 00 00 	and    QWORD PTR [rbx+0x200],0x0
     10515e9:	00 
     10515ea:	0f 29 83 e0 01 00 00 	movaps XMMWORD PTR [rbx+0x1e0],xmm0
     10515f1:	0f 29 83 f0 01 00 00 	movaps XMMWORD PTR [rbx+0x1f0],xmm0

### 0x105526c in 0x10550ac..0x105572b
     1055245:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     1055249:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     105524e:	0f 10 0e             	movups xmm1,XMMWORD PTR [rsi]
     1055251:	0f 29 4c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm1
     1055256:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
     105525a:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     105525f:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     1055264:	48 89 bc 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rdi
     105526b:	00 
     105526c:	4c 89 a4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r12
     1055273:	00 
     1055274:	48 8d 05 47 9b b0 ff 	lea    rax,[rip+0xffffffffffb09b47]        # b5edc2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xabd62>
     105527b:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
     1055282:	00 
     1055283:	48 8d 05 cc 06 00 00 	lea    rax,[rip+0x6cc]        # 1055956 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21cd6c>
     105528a:	83 a4 24 10 01 00 00 	and    DWORD PTR [rsp+0x110],0x0
     1055291:	00 
     1055292:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
     1055299:	00 
     105529a:	48 83 a4 24 d0 01 00 	and    QWORD PTR [rsp+0x1d0],0x0

### 0x1056c3a in 0x1056b26..0x105732e
     1056c13:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     1056c1a:	00 
     1056c1b:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     1056c22:	00 
     1056c23:	e8 38 d1 ff ff       	call   1053d60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21b176>
     1056c28:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1056c2d:	48 8d b4 24 b0 01 00 	lea    rsi,[rsp+0x1b0]
     1056c34:	00 
     1056c35:	e8 32 d1 ff ff       	call   1053d6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21b182>
     1056c3a:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1056c41:	00 
     1056c42:	e8 e9 00 a5 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1056c47:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1056c4e:	00 
     1056c4f:	e8 3c 72 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1056c54:	e9 6a 04 00 00       	jmp    10570c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21e4d9>
     1056c59:	f3 41 0f 6f 04 24    	movdqu xmm0,XMMWORD PTR [r12]
     1056c5f:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
     1056c64:	66 0f ef c0          	pxor   xmm0,xmm0
     1056c68:	f3 41 0f 7f 04 24    	movdqu XMMWORD PTR [r12],xmm0

### 0x1056ce8 in 0x1056b26..0x105732e
     1056cc1:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     1056cc8:	00 
     1056cc9:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     1056cd0:	00 
     1056cd1:	e8 8a d0 ff ff       	call   1053d60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21b176>
     1056cd6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1056cdb:	48 8d b4 24 b0 01 00 	lea    rsi,[rsp+0x1b0]
     1056ce2:	00 
     1056ce3:	e8 84 d0 ff ff       	call   1053d6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21b182>
     1056ce8:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1056cef:	00 
     1056cf0:	e8 3b 00 a5 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1056cf5:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1056cfc:	00 
     1056cfd:	e8 8e 71 79 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1056d02:	e9 97 03 00 00       	jmp    105709e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21e4b4>
     1056d07:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
     1056d0b:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
     1056d12:	00 
     1056d13:	66 0f 6f 44 24 60    	movdqa xmm0,XMMWORD PTR [rsp+0x60]

### 0x105718e in 0x1056b26..0x105732e
     1057173:	eb 30                	jmp    10571a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21e5bb>
     1057175:	48 85 db             	test   rbx,rbx
     1057178:	74 0a                	je     1057184 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21e59a>
     105717a:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     105717f:	48 89 d8             	mov    rax,rbx
     1057182:	eb 02                	jmp    1057186 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21e59c>
     1057184:	31 c0                	xor    eax,eax
     1057186:	4c 89 bc 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r15
     105718d:	00 
     105718e:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     1057195:	00 
     1057196:	31 ff                	xor    edi,edi
     1057198:	e8 e9 72 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     105719d:	48 89 df             	mov    rdi,rbx
     10571a0:	e8 e1 72 a4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10571a5:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     10571aa:	48 83 c7 18          	add    rdi,0x18
     10571ae:	48 8d 9c 24 b0 01 00 	lea    rbx,[rsp+0x1b0]
     10571b5:	00 
     10571b6:	48 89 de             	mov    rsi,rbx

### 0x10579e2 in 0x10575d6..0x1058f3c
     10579b5:	49 89 c5             	mov    r13,rax
     10579b8:	66 0f ef c0          	pxor   xmm0,xmm0
     10579bc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     10579c1:	48 8d 05 00 34 7b 00 	lea    rax,[rip+0x7b3400]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     10579c8:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     10579cc:	48 8d 05 0d 6f 7b 00 	lea    rax,[rip+0x7b6f0d]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     10579d3:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     10579da:	00 
     10579db:	48 8b 05 be a0 85 00 	mov    rax,QWORD PTR [rip+0x85a0be]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
     10579e2:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     10579e9:	00 
     10579ea:	48 89 9c 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rbx
     10579f1:	00 
     10579f2:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     10579f9:	00 
     10579fa:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
     10579ff:	e8 14 c5 e4 ff       	call   ea3f18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6b32e>
     1057a04:	89 6c 24 60          	mov    DWORD PTR [rsp+0x60],ebp
     1057a08:	48 8d 05 09 07 7f 00 	lea    rax,[rip+0x7f0709]        # 1848118 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4800>
     1057a0f:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax

### 0x10586c7 in 0x10575d6..0x1058f3c
     105869a:	48 8d 05 27 27 7b 00 	lea    rax,[rip+0x7b2727]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     10586a1:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     10586a5:	48 8d 05 5c fd 7e 00 	lea    rax,[rip+0x7efd5c]        # 1848408 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4af0>
     10586ac:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
     10586b0:	49 83 65 38 00       	and    QWORD PTR [r13+0x38],0x0
     10586b5:	4d 8d 65 28          	lea    r12,[r13+0x28]
     10586b9:	f3 41 0f 7f 45 28    	movdqu XMMWORD PTR [r13+0x28],xmm0
     10586bf:	4c 8b b4 24 b0 01 00 	mov    r14,QWORD PTR [rsp+0x1b0]
     10586c6:	00 
     10586c7:	4c 8b bc 24 b8 01 00 	mov    r15,QWORD PTR [rsp+0x1b8]
     10586ce:	00 
     10586cf:	4c 89 ff             	mov    rdi,r15
     10586d2:	4c 89 a4 24 20 02 00 	mov    QWORD PTR [rsp+0x220],r12
     10586d9:	00 
     10586da:	c6 84 24 28 02 00 00 	mov    BYTE PTR [rsp+0x228],0x0
     10586e1:	00 
     10586e2:	4c 29 f7             	sub    rdi,r14
     10586e5:	74 52                	je     1058739 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21fb4f>
     10586e7:	48 c1 ff 04          	sar    rdi,0x4
     10586eb:	48 89 f8             	mov    rax,rdi

### 0x1074d5e in 0x1074aca..0x10759bb
     1074d43:	74 32                	je     1074d77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23c18d>
     1074d45:	48 8d b4 24 c0 01 00 	lea    rsi,[rsp+0x1c0]
     1074d4c:	00 
     1074d4d:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     1074d51:	6a 01                	push   0x1
     1074d53:	5f                   	pop    rdi
     1074d54:	48 8d 94 24 a0 01 00 	lea    rdx,[rsp+0x1a0]
     1074d5b:	00 
     1074d5c:	ff d0                	call   rax
     1074d5e:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     1074d65:	00 
     1074d66:	48 89 84 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],rax
     1074d6d:	00 
     1074d6e:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     1074d75:	00 00 
     1074d77:	4c 89 b4 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],r14
     1074d7e:	00 
     1074d7f:	48 89 ac 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rbp
     1074d86:	00 
     1074d87:	4c 89 ac 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],r13

### 0x107851f in 0x1077eae..0x10790ae
     10784f8:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
     10784fd:	31 d2                	xor    edx,edx
     10784ff:	e8 78 4b 53 00       	call   15ad07c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f2600>
     1078504:	66 0f ef c0          	pxor   xmm0,xmm0
     1078508:	f3 41 0f 7f 86 a8 01 	movdqu XMMWORD PTR [r14+0x1a8],xmm0
     107850f:	00 00 
     1078511:	f3 41 0f 7f 86 98 01 	movdqu XMMWORD PTR [r14+0x198],xmm0
     1078518:	00 00 
     107851a:	b8 00 00 80 3f       	mov    eax,0x3f800000
     107851f:	41 89 86 b8 01 00 00 	mov    DWORD PTR [r14+0x1b8],eax
     1078526:	66 41 0f 7f 86 c0 01 	movdqa XMMWORD PTR [r14+0x1c0],xmm0
     107852d:	00 00 
     107852f:	66 41 0f 7f 86 d0 01 	movdqa XMMWORD PTR [r14+0x1d0],xmm0
     1078536:	00 00 
     1078538:	41 89 86 e0 01 00 00 	mov    DWORD PTR [r14+0x1e0],eax
     107853f:	f3 41 0f 7f 86 e8 01 	movdqu XMMWORD PTR [r14+0x1e8],xmm0
     1078546:	00 00 
     1078548:	f3 41 0f 7f 86 f8 01 	movdqu XMMWORD PTR [r14+0x1f8],xmm0
     107854f:	00 00 
     1078551:	41 89 86 08 02 00 00 	mov    DWORD PTR [r14+0x208],eax

### 0x107b934 in 0x107a02c..0x107e484
     107b917:	00 
     107b918:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     107b91b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     107b91e:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     107b925:	00 
     107b926:	48 8b bc 24 40 05 00 	mov    rdi,QWORD PTR [rsp+0x540]
     107b92d:	00 
     107b92e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     107b931:	ff 50 28             	call   QWORD PTR [rax+0x28]
     107b934:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     107b93b:	00 
     107b93c:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
     107b941:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     107b944:	48 8d 9c 24 00 02 00 	lea    rbx,[rsp+0x200]
     107b94b:	00 
     107b94c:	48 89 df             	mov    rdi,rbx
     107b94f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     107b952:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
     107b956:	66 0f 7f 84 24 f0 00 	movdqa XMMWORD PTR [rsp+0xf0],xmm0
     107b95d:	00 00 

### 0x107be87 in 0x107a02c..0x107e484
     107be5b:	48 8d 2d b6 5d 3d ff 	lea    rbp,[rip+0xffffffffff3d5db6]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     107be62:	74 05                	je     107be69 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24327f>
     107be64:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     107be69:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
     107be70:	00 
     107be71:	49 89 87 e8 03 00 00 	mov    QWORD PTR [r15+0x3e8],rax
     107be78:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
     107be7f:	00 
     107be80:	49 89 87 f0 03 00 00 	mov    QWORD PTR [r15+0x3f0],rax
     107be87:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     107be8e:	00 
     107be8f:	49 89 87 f8 03 00 00 	mov    QWORD PTR [r15+0x3f8],rax
     107be96:	49 89 b7 00 04 00 00 	mov    QWORD PTR [r15+0x400],rsi
     107be9d:	4d 8d b7 08 04 00 00 	lea    r14,[r15+0x408]
     107bea4:	4c 89 f7             	mov    rdi,r14
     107bea7:	e8 16 58 74 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     107beac:	49 83 a7 40 04 00 00 	and    QWORD PTR [r15+0x440],0x0
     107beb3:	00 
     107beb4:	48 8d 05 05 5c 80 00 	lea    rax,[rip+0x805c05]        # 1881ac0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e1a8>
     107bebb:	49 89 87 18 04 00 00 	mov    QWORD PTR [r15+0x418],rax

### 0x10849cb in 0x108480a..0x10850fb
     10849a1:	e8 46 1d a3 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     10849a6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     10849ad:	00 
     10849ae:	e8 dd 94 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10849b3:	48 83 a4 24 98 01 00 	and    QWORD PTR [rsp+0x198],0x0
     10849ba:	00 00 
     10849bc:	4c 8d 25 4d 57 7c 00 	lea    r12,[rip+0x7c574d]        # 184a110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x67f8>
     10849c3:	4c 89 a4 24 90 01 00 	mov    QWORD PTR [rsp+0x190],r12
     10849ca:	00 
     10849cb:	83 a4 24 b8 01 00 00 	and    DWORD PTR [rsp+0x1b8],0x0
     10849d2:	00 
     10849d3:	0f 57 c0             	xorps  xmm0,xmm0
     10849d6:	66 c7 84 24 a8 00 00 	mov    WORD PTR [rsp+0xa8],0x100
     10849dd:	00 00 01 
     10849e0:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     10849e7:	00 00 
     10849e9:	0f 11 84 24 a0 01 00 	movups XMMWORD PTR [rsp+0x1a0],xmm0
     10849f0:	00 
     10849f1:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
     10849f8:	00 00 

### 0x108ab1b in 0x108aa5c..0x108b283
     108aaf6:	48 89 c1             	mov    rcx,rax
     108aaf9:	4d 89 e9             	mov    r9,r13
     108aafc:	41 ff 52 38          	call   QWORD PTR [r10+0x38]
     108ab00:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     108ab07:	00 
     108ab08:	e8 83 33 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     108ab0d:	80 bc 24 90 00 00 00 	cmp    BYTE PTR [rsp+0x90],0x0
     108ab14:	00 
     108ab15:	0f 84 6c 06 00 00    	je     108b187 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25259d>
     108ab1b:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     108ab22:	00 
     108ab23:	48 89 de             	mov    rsi,rbx
     108ab26:	e8 3b f3 63 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     108ab2b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     108ab30:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     108ab37:	00 
     108ab38:	e8 51 17 00 00       	call   108c28e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2536a4>
     108ab3d:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     108ab44:	00 
     108ab45:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax

### 0x108ab4d in 0x108aa5c..0x108b283
     108ab26:	e8 3b f3 63 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     108ab2b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     108ab30:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     108ab37:	00 
     108ab38:	e8 51 17 00 00       	call   108c28e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2536a4>
     108ab3d:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     108ab44:	00 
     108ab45:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     108ab4c:	00 
     108ab4d:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     108ab54:	00 
     108ab55:	4c 89 f7             	mov    rdi,r14
     108ab58:	e8 05 18 00 00       	call   108c362 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253778>
     108ab5d:	49 89 c4             	mov    r12,rax
     108ab60:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     108ab65:	49 83 bf e0 07 00 00 	cmp    QWORD PTR [r15+0x7e0],0x0
     108ab6c:	00 
     108ab6d:	0f 95 c0             	setne  al
     108ab70:	49 83 bf e8 07 00 00 	cmp    QWORD PTR [r15+0x7e8],0x0
     108ab77:	00 

### 0x108ac3f in 0x108aa5c..0x108b283
     108ac1c:	49 8b af f0 07 00 00 	mov    rbp,QWORD PTR [r15+0x7f0]
     108ac23:	4c 89 f7             	mov    rdi,r14
     108ac26:	4c 89 ee             	mov    rsi,r13
     108ac29:	e8 78 17 00 00       	call   108c3a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2537bc>
     108ac2e:	49 8b 87 f0 07 00 00 	mov    rax,QWORD PTR [r15+0x7f0]
     108ac35:	48 39 c5             	cmp    rbp,rax
     108ac38:	75 05                	jne    108ac3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252055>
     108ac3a:	48 85 c0             	test   rax,rax
     108ac3d:	75 c2                	jne    108ac01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252017>
     108ac3f:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     108ac46:	00 
     108ac47:	4c 89 f7             	mov    rdi,r14
     108ac4a:	e8 85 00 d0 ff       	call   d8acd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57d5a>
     108ac4f:	49 8b af a8 07 00 00 	mov    rbp,QWORD PTR [r15+0x7a8]
     108ac56:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     108ac5d:	00 
     108ac5e:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     108ac63:	e8 26 16 00 00       	call   108c28e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2536a4>
     108ac68:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
     108ac6f:	00 

### 0x108ac88 in 0x108aa5c..0x108b283
     108ac63:	e8 26 16 00 00       	call   108c28e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2536a4>
     108ac68:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
     108ac6f:	00 
     108ac70:	4c 8d ac 24 38 01 00 	lea    r13,[rsp+0x138]
     108ac77:	00 
     108ac78:	49 89 45 58          	mov    QWORD PTR [r13+0x58],rax
     108ac7c:	49 89 6d 60          	mov    QWORD PTR [r13+0x60],rbp
     108ac80:	48 8d ac 24 10 02 00 	lea    rbp,[rsp+0x210]
     108ac87:	00 
     108ac88:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     108ac8f:	00 
     108ac90:	48 89 ef             	mov    rdi,rbp
     108ac93:	e8 9c f7 63 00       	call   16ca434 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e5a0>
     108ac98:	48 8d bc 24 68 02 00 	lea    rdi,[rsp+0x268]
     108ac9f:	00 
     108aca0:	4c 89 ee             	mov    rsi,r13
     108aca3:	e8 58 18 00 00       	call   108c500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253916>
     108aca8:	48 89 ef             	mov    rdi,rbp
     108acab:	e8 38 1a 64 00       	call   16cc6e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80854>
     108acb0:	89 c0                	mov    eax,eax

### 0x108b165 in 0x108aa5c..0x108b283
     108b13c:	00 
     108b13d:	e8 30 ec ff ff       	call   1089d72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251188>
     108b142:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     108b149:	00 
     108b14a:	e8 09 0b 5a 00       	call   162bc58 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc6>
     108b14f:	49 ff 87 f0 07 00 00 	inc    QWORD PTR [r15+0x7f0]
     108b156:	40 8a 6c 24 07       	mov    bpl,BYTE PTR [rsp+0x7]
     108b15b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     108b160:	e8 f3 0a 5a 00       	call   162bc58 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc6>
     108b165:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     108b16c:	00 
     108b16d:	e8 bc a1 63 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     108b172:	40 84 ed             	test   bpl,bpl
     108b175:	74 10                	je     108b187 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25259d>
     108b177:	4c 89 f7             	mov    rdi,r14
     108b17a:	48 89 de             	mov    rsi,rbx
     108b17d:	e8 f8 10 00 00       	call   108c27a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253690>
     108b182:	49 89 c5             	mov    r13,rax
     108b185:	eb 03                	jmp    108b18a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2525a0>
     108b187:	45 31 ed             	xor    r13d,r13d

### 0x108b22f in 0x108aa5c..0x108b283
     108b20e:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
     108b215:	00 
     108b216:	e8 3d 0a 5a 00       	call   162bc58 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc6>
     108b21b:	eb 03                	jmp    108b220 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252636>
     108b21d:	48 89 c3             	mov    rbx,rax
     108b220:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     108b225:	e8 2e 0a 5a 00       	call   162bc58 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc6>
     108b22a:	eb 03                	jmp    108b22f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252645>
     108b22c:	48 89 c3             	mov    rbx,rax
     108b22f:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     108b236:	00 
     108b237:	e8 f2 a0 63 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     108b23c:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     108b243:	00 
     108b244:	eb 0b                	jmp    108b251 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x252667>
     108b246:	48 89 c3             	mov    rbx,rax
     108b249:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     108b250:	00 
     108b251:	e8 3a 2c 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     108b256:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]

### 0x108f515 in 0x108ec98..0x108fa88
     108f4f4:	6a 01                	push   0x1
     108f4f6:	41 58                	pop    r8
     108f4f8:	ff d0                	call   rax
     108f4fa:	48 8b bc 24 98 01 00 	mov    rdi,QWORD PTR [rsp+0x198]
     108f501:	00 
     108f502:	e8 7f ef a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     108f507:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     108f50c:	0f 10 40 08          	movups xmm0,XMMWORD PTR [rax+0x8]
     108f510:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     108f515:	0f 11 81 b8 01 00 00 	movups XMMWORD PTR [rcx+0x1b8],xmm0
     108f51c:	48 8b 59 40          	mov    rbx,QWORD PTR [rcx+0x40]
     108f520:	48 85 db             	test   rbx,rbx
     108f523:	74 28                	je     108f54d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256963>
     108f525:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     108f52c:	00 
     108f52d:	e8 04 c3 9e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     108f532:	48 89 d1             	mov    rcx,rdx
     108f535:	48 89 df             	mov    rdi,rbx
     108f538:	31 f6                	xor    esi,esi
     108f53a:	48 89 c2             	mov    rdx,rax

### 0x108f5b3 in 0x108ec98..0x108fa88
     108f58e:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     108f592:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
     108f599:	00 
     108f59a:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     108f5a1:	00 00 
     108f5a3:	41 0f 11 47 28       	movups XMMWORD PTR [r15+0x28],xmm0
     108f5a8:	0f 57 c0             	xorps  xmm0,xmm0
     108f5ab:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     108f5b2:	00 
     108f5b3:	49 8b 8e b8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1b8]
     108f5ba:	49 8b b6 c0 01 00 00 	mov    rsi,QWORD PTR [r14+0x1c0]
     108f5c1:	49 89 cf             	mov    r15,rcx
     108f5c4:	49 31 f7             	xor    r15,rsi
     108f5c7:	49 8b ae d0 01 00 00 	mov    rbp,QWORD PTR [r14+0x1d0]
     108f5ce:	48 85 ed             	test   rbp,rbp
     108f5d1:	74 14                	je     108f5e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2569fd>
     108f5d3:	f3 48 0f b8 fd       	popcnt rdi,rbp
     108f5d8:	48 83 ff 01          	cmp    rdi,0x1
     108f5dc:	77 0b                	ja     108f5e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2569ff>
     108f5de:	4c 8d 6d ff          	lea    r13,[rbp-0x1]

### 0x108f667 in 0x108ec98..0x108fa88
     108f64a:	4d 8b 00             	mov    r8,QWORD PTR [r8]
     108f64d:	4d 85 c0             	test   r8,r8
     108f650:	75 c2                	jne    108f614 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256a2a>
     108f652:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
     108f657:	6a 70                	push   0x70
     108f659:	5f                   	pop    rdi
     108f65a:	e8 a1 e8 75 00       	call   17edf00 <_Znwm@plt>
     108f65f:	49 89 c4             	mov    r12,rax
     108f662:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     108f667:	48 8d 83 b8 01 00 00 	lea    rax,[rbx+0x1b8]
     108f66e:	4c 8d b4 24 c8 01 00 	lea    r14,[rsp+0x1c8]
     108f675:	00 
     108f676:	4c 89 a4 24 30 01 00 	mov    QWORD PTR [rsp+0x130],r12
     108f67d:	00 
     108f67e:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     108f683:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
     108f68a:	00 
     108f68b:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
     108f690:	4d 89 7c 24 08       	mov    QWORD PTR [r12+0x8],r15
     108f695:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]

### 0x10903be in 0x108fcb0..0x10905a2
     109039a:	00 
     109039b:	31 f6                	xor    esi,esi
     109039d:	e8 f4 f3 a0 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     10903a2:	48 83 a4 24 b8 00 00 	and    QWORD PTR [rsp+0xb8],0x0
     10903a9:	00 00 
     10903ab:	e9 0d fc ff ff       	jmp    108ffbd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2573d3>
     10903b0:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     10903b5:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     10903b9:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10903be:	f3 0f 6f 88 b8 01 00 	movdqu xmm1,XMMWORD PTR [rax+0x1b8]
     10903c5:	00 
     10903c6:	66 0f ef c8          	pxor   xmm1,xmm0
     10903ca:	66 0f 38 17 c9       	ptest  xmm1,xmm1
     10903cf:	0f 85 0a 01 00 00    	jne    10904df <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2578f5>
     10903d5:	4c 8b a0 40 01 00 00 	mov    r12,QWORD PTR [rax+0x140]
     10903dc:	4d 85 e4             	test   r12,r12
     10903df:	0f 84 f0 00 00 00    	je     10904d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2578eb>
     10903e5:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]
     10903ea:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]
     10903f1:	00 

### 0x109b832 in 0x109b054..0x109d090
     109b80e:	48 83 a4 24 f8 01 00 	and    QWORD PTR [rsp+0x1f8],0x0
     109b815:	00 00 
     109b817:	48 85 ff             	test   rdi,rdi
     109b81a:	74 06                	je     109b822 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262c38>
     109b81c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     109b81f:	ff 50 08             	call   QWORD PTR [rax+0x8]
     109b822:	48 83 a4 24 c0 01 00 	and    QWORD PTR [rsp+0x1c0],0x0
     109b829:	00 00 
     109b82b:	48 8d 05 3e 04 7b 00 	lea    rax,[rip+0x7b043e]        # 184bc70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8358>
     109b832:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     109b839:	00 
     109b83a:	0f 57 c0             	xorps  xmm0,xmm0
     109b83d:	0f 11 84 24 c8 01 00 	movups XMMWORD PTR [rsp+0x1c8],xmm0
     109b844:	00 
     109b845:	0f 11 84 24 d8 01 00 	movups XMMWORD PTR [rsp+0x1d8],xmm0
     109b84c:	00 
     109b84d:	48 8d 05 a4 3f 3a ff 	lea    rax,[rip+0xffffffffff3a3fa4]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     109b854:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
     109b85b:	00 
     109b85c:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0

### 0x109cb58 in 0x109b054..0x109d090
     109cb32:	e9 92 fd ff ff       	jmp    109c8c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x263cdf>
     109cb37:	48 83 e7 fe          	and    rdi,0xfffffffffffffffe
     109cb3b:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     109cb3e:	e9 ff fd ff ff       	jmp    109c942 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x263d58>
     109cb43:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     109cb47:	49 8b 87 d0 00 00 00 	mov    rax,QWORD PTR [r15+0xd0]
     109cb4e:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
     109cb52:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     109cb55:	ff 50 40             	call   QWORD PTR [rax+0x40]
     109cb58:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     109cb5f:	00 
     109cb60:	88 47 38             	mov    BYTE PTR [rdi+0x38],al
     109cb63:	c7 47 3c c8 00 00 00 	mov    DWORD PTR [rdi+0x3c],0xc8
     109cb6a:	80 4f 10 06          	or     BYTE PTR [rdi+0x10],0x6
     109cb6e:	0f 57 c0             	xorps  xmm0,xmm0
     109cb71:	48 8d b4 24 50 02 00 	lea    rsi,[rsp+0x250]
     109cb78:	00 
     109cb79:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
     109cb7c:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     109cb81:	e8 1a 31 6e 00       	call   177fca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e0c>

### 0x109cd13 in 0x109b054..0x109d090
     109ccec:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     109ccf3:	00 
     109ccf4:	e8 df 6e 63 00       	call   16d3bd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87d44>
     109ccf9:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     109cd00:	00 
     109cd01:	e8 66 67 63 00       	call   16d346c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x875d8>
     109cd06:	48 8d bc 24 60 05 00 	lea    rdi,[rsp+0x560]
     109cd0d:	00 
     109cd0e:	e8 b5 64 63 00       	call   16d31c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87334>
     109cd13:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     109cd1a:	00 
     109cd1b:	e8 f2 33 00 00       	call   10a0112 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x267528>
     109cd20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     109cd27:	00 00 
     109cd29:	48 3b 84 24 d0 06 00 	cmp    rax,QWORD PTR [rsp+0x6d0]
     109cd30:	00 
     109cd31:	0f 85 54 03 00 00    	jne    109d08b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2644a1>
     109cd37:	48 81 c4 d8 06 00 00 	add    rsp,0x6d8
     109cd3e:	5b                   	pop    rbx
     109cd3f:	41 5c                	pop    r12

### 0x109d026 in 0x109b054..0x109d090
     109cfff:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     109d006:	00 
     109d007:	e8 cc 6b 63 00       	call   16d3bd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87d44>
     109d00c:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     109d013:	00 
     109d014:	e8 53 64 63 00       	call   16d346c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x875d8>
     109d019:	48 8d bc 24 60 05 00 	lea    rdi,[rsp+0x560]
     109d020:	00 
     109d021:	e8 a2 61 63 00       	call   16d31c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87334>
     109d026:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     109d02d:	00 
     109d02e:	e8 df 30 00 00       	call   10a0112 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x267528>
     109d033:	eb 3b                	jmp    109d070 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x264486>
     109d035:	eb 00                	jmp    109d037 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26444d>
     109d037:	48 89 c3             	mov    rbx,rax
     109d03a:	48 8d bc 24 28 03 00 	lea    rdi,[rsp+0x328]
     109d041:	00 
     109d042:	e8 c7 da a0 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
     109d047:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     109d04e:	00 

### 0x10a6296 in 0x10a614a..0x10a6453
     10a6257:	48 8d 87 70 01 00 00 	lea    rax,[rdi+0x170]
     10a625e:	0f 11 87 70 01 00 00 	movups XMMWORD PTR [rdi+0x170],xmm0
     10a6265:	48 89 87 68 01 00 00 	mov    QWORD PTR [rdi+0x168],rax
     10a626c:	48 8d 87 88 01 00 00 	lea    rax,[rdi+0x188]
     10a6273:	0f 11 87 88 01 00 00 	movups XMMWORD PTR [rdi+0x188],xmm0
     10a627a:	48 89 87 80 01 00 00 	mov    QWORD PTR [rdi+0x180],rax
     10a6281:	48 8d 87 a0 01 00 00 	lea    rax,[rdi+0x1a0]
     10a6288:	0f 11 87 a0 01 00 00 	movups XMMWORD PTR [rdi+0x1a0],xmm0
     10a628f:	48 89 87 98 01 00 00 	mov    QWORD PTR [rdi+0x198],rax
     10a6296:	48 8d 87 b8 01 00 00 	lea    rax,[rdi+0x1b8]
     10a629d:	0f 11 87 b8 01 00 00 	movups XMMWORD PTR [rdi+0x1b8],xmm0
     10a62a4:	48 89 87 b0 01 00 00 	mov    QWORD PTR [rdi+0x1b0],rax
     10a62ab:	48 8d 87 d0 01 00 00 	lea    rax,[rdi+0x1d0]
     10a62b2:	0f 11 87 d0 01 00 00 	movups XMMWORD PTR [rdi+0x1d0],xmm0
     10a62b9:	48 89 87 c8 01 00 00 	mov    QWORD PTR [rdi+0x1c8],rax
     10a62c0:	48 8d 87 e8 01 00 00 	lea    rax,[rdi+0x1e8]
     10a62c7:	0f 11 87 e8 01 00 00 	movups XMMWORD PTR [rdi+0x1e8],xmm0
     10a62ce:	48 89 87 e0 01 00 00 	mov    QWORD PTR [rdi+0x1e0],rax
     10a62d5:	48 8d 87 00 02 00 00 	lea    rax,[rdi+0x200]
     10a62dc:	0f 11 87 00 02 00 00 	movups XMMWORD PTR [rdi+0x200],xmm0

### 0x10a629d in 0x10a614a..0x10a6453
     10a625e:	0f 11 87 70 01 00 00 	movups XMMWORD PTR [rdi+0x170],xmm0
     10a6265:	48 89 87 68 01 00 00 	mov    QWORD PTR [rdi+0x168],rax
     10a626c:	48 8d 87 88 01 00 00 	lea    rax,[rdi+0x188]
     10a6273:	0f 11 87 88 01 00 00 	movups XMMWORD PTR [rdi+0x188],xmm0
     10a627a:	48 89 87 80 01 00 00 	mov    QWORD PTR [rdi+0x180],rax
     10a6281:	48 8d 87 a0 01 00 00 	lea    rax,[rdi+0x1a0]
     10a6288:	0f 11 87 a0 01 00 00 	movups XMMWORD PTR [rdi+0x1a0],xmm0
     10a628f:	48 89 87 98 01 00 00 	mov    QWORD PTR [rdi+0x198],rax
     10a6296:	48 8d 87 b8 01 00 00 	lea    rax,[rdi+0x1b8]
     10a629d:	0f 11 87 b8 01 00 00 	movups XMMWORD PTR [rdi+0x1b8],xmm0
     10a62a4:	48 89 87 b0 01 00 00 	mov    QWORD PTR [rdi+0x1b0],rax
     10a62ab:	48 8d 87 d0 01 00 00 	lea    rax,[rdi+0x1d0]
     10a62b2:	0f 11 87 d0 01 00 00 	movups XMMWORD PTR [rdi+0x1d0],xmm0
     10a62b9:	48 89 87 c8 01 00 00 	mov    QWORD PTR [rdi+0x1c8],rax
     10a62c0:	48 8d 87 e8 01 00 00 	lea    rax,[rdi+0x1e8]
     10a62c7:	0f 11 87 e8 01 00 00 	movups XMMWORD PTR [rdi+0x1e8],xmm0
     10a62ce:	48 89 87 e0 01 00 00 	mov    QWORD PTR [rdi+0x1e0],rax
     10a62d5:	48 8d 87 00 02 00 00 	lea    rax,[rdi+0x200]
     10a62dc:	0f 11 87 00 02 00 00 	movups XMMWORD PTR [rdi+0x200],xmm0
     10a62e3:	48 89 87 f8 01 00 00 	mov    QWORD PTR [rdi+0x1f8],rax

### 0x10a968c in 0x10a9668..0x10a969c
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>
     10a96af:	cc                   	int3

### 0x10ad24e in 0x10aba36..0x10adc15
     10ad227:	48 8b 84 24 a0 01 00 	mov    rax,QWORD PTR [rsp+0x1a0]
     10ad22e:	00 
     10ad22f:	48 89 45 70          	mov    QWORD PTR [rbp+0x70],rax
     10ad233:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
     10ad23a:	00 
     10ad23b:	48 89 45 78          	mov    QWORD PTR [rbp+0x78],rax
     10ad23f:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
     10ad246:	00 
     10ad247:	48 89 85 80 00 00 00 	mov    QWORD PTR [rbp+0x80],rax
     10ad24e:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     10ad255:	00 
     10ad256:	48 89 85 88 00 00 00 	mov    QWORD PTR [rbp+0x88],rax
     10ad25d:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
     10ad264:	00 
     10ad265:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax
     10ad26c:	0f 57 c0             	xorps  xmm0,xmm0
     10ad26f:	48 83 a5 b8 00 00 00 	and    QWORD PTR [rbp+0xb8],0x0
     10ad276:	00 
     10ad277:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0
     10ad27e:	0f 11 85 a8 00 00 00 	movups XMMWORD PTR [rbp+0xa8],xmm0

### 0x140fcee in 0x140fa7e..0x1410640
     140fcd1:	00 
     140fcd2:	48 8d 8c 24 d0 01 00 	lea    rcx,[rsp+0x1d0]
     140fcd9:	00 
     140fcda:	48 89 19             	mov    QWORD PTR [rcx],rbx
     140fcdd:	48 8d 94 24 48 01 00 	lea    rdx,[rsp+0x148]
     140fce4:	00 
     140fce5:	e8 2c 0c 00 00       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
     140fcea:	84 c0                	test   al,al
     140fcec:	75 30                	jne    140fd1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552a2>
     140fcee:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     140fcf5:	00 
     140fcf6:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
     140fcfd:	00 
     140fcfe:	48 8d 8c 24 c8 01 00 	lea    rcx,[rsp+0x1c8]
     140fd05:	00 
     140fd06:	48 89 19             	mov    QWORD PTR [rcx],rbx
     140fd09:	48 8d 94 24 48 01 00 	lea    rdx,[rsp+0x148]
     140fd10:	00 
     140fd11:	e8 00 0c 00 00       	call   1410916 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255e9a>
     140fd16:	84 c0                	test   al,al

### 0x140fdab in 0x140fa7e..0x1410640
     140fd8a:	00 
     140fd8b:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
     140fd92:	00 
     140fd93:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
     140fd9a:	00 
     140fd9b:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
     140fda2:	00 
     140fda3:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     140fdaa:	00 
     140fdab:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     140fdb2:	00 
     140fdb3:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     140fdba:	00 
     140fdbb:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]
     140fdc2:	00 
     140fdc3:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     140fdca:	00 
     140fdcb:	48 83 7c 24 48 02    	cmp    QWORD PTR [rsp+0x48],0x2
     140fdd1:	0f 8c dd 06 00 00    	jl     14104b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255a38>
     140fdd7:	31 ed                	xor    ebp,ebp

### 0x1410621 in 0x140fa7e..0x1410640
     1410600:	00 
     1410601:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     1410608:	00 
     1410609:	48 8b bc 24 a8 01 00 	mov    rdi,QWORD PTR [rsp+0x1a8]
     1410610:	00 
     1410611:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
     1410618:	00 
     1410619:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     1410620:	00 
     1410621:	4c 8b 8c 24 b8 01 00 	mov    r9,QWORD PTR [rsp+0x1b8]
     1410628:	00 
     1410629:	4c 8b bc 24 c0 01 00 	mov    r15,QWORD PTR [rsp+0x1c0]
     1410630:	00 
     1410631:	44 8b 44 24 60       	mov    r8d,DWORD PTR [rsp+0x60]
     1410636:	e9 a9 fe ff ff       	jmp    14104e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255a68>
     141063b:	e8 70 f4 3d 00       	call   17efab0 <__stack_chk_fail@plt>
     1410640:	53                   	push   rbx
     1410641:	48 89 fb             	mov    rbx,rdi
     1410644:	48 8b bf 50 03 00 00 	mov    rdi,QWORD PTR [rdi+0x350]
     141064b:	48 85 ff             	test   rdi,rdi

### 0x1411cfe in 0x1411be4..0x14128bf
     1411cd8:	4d 8b b5 c0 00 00 00 	mov    r14,QWORD PTR [r13+0xc0]
     1411cdf:	49 29 d6             	sub    r14,rdx
     1411ce2:	49 c1 fe 02          	sar    r14,0x2
     1411ce6:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     1411ced:	00 
     1411cee:	4c 89 a4 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r12
     1411cf5:	00 
     1411cf6:	48 89 8c 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rcx
     1411cfd:	00 
     1411cfe:	48 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbp
     1411d05:	00 
     1411d06:	48 89 94 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rdx
     1411d0d:	00 
     1411d0e:	4c 89 b4 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],r14
     1411d15:	00 
     1411d16:	49 8d 7d 60          	lea    rdi,[r13+0x60]
     1411d1a:	0f 10 84 24 a0 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1a0]
     1411d21:	00 
     1411d22:	0f 10 8c 24 b0 01 00 	movups xmm1,XMMWORD PTR [rsp+0x1b0]
     1411d29:	00 

### 0x1411d87 in 0x1411be4..0x14128bf
     1411d61:	48 c1 f9 02          	sar    rcx,0x2
     1411d65:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     1411d6a:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     1411d71:	00 
     1411d72:	4c 89 a4 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r12
     1411d79:	00 
     1411d7a:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     1411d7f:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     1411d86:	00 
     1411d87:	48 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbp
     1411d8e:	00 
     1411d8f:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     1411d94:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
     1411d9b:	00 
     1411d9c:	4c 89 b4 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],r14
     1411da3:	00 
     1411da4:	41 0f b6 75 58       	movzx  esi,BYTE PTR [r13+0x58]
     1411da9:	0f 10 84 24 a0 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1a0]
     1411db0:	00 
     1411db1:	0f 10 8c 24 b0 01 00 	movups xmm1,XMMWORD PTR [rsp+0x1b0]

### 0x1413755 in 0x141329e..0x1413a8b
     1413736:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
     141373a:	48 29 d8             	sub    rax,rbx
     141373d:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     1413744:	00 
     1413745:	80 7e 10 00          	cmp    BYTE PTR [rsi+0x10],0x0
     1413749:	48 89 f8             	mov    rax,rdi
     141374c:	74 07                	je     1413755 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258cd9>
     141374e:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
     1413752:	48 29 d8             	sub    rax,rbx
     1413755:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     141375c:	00 
     141375d:	80 79 10 00          	cmp    BYTE PTR [rcx+0x10],0x0
     1413761:	48 89 f8             	mov    rax,rdi
     1413764:	74 07                	je     141376d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258cf1>
     1413766:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     141376a:	48 29 d8             	sub    rax,rbx
     141376d:	48 89 d9             	mov    rcx,rbx
     1413770:	48 2b 8c 24 c8 00 00 	sub    rcx,QWORD PTR [rsp+0xc8]
     1413777:	00 
     1413778:	7c 1e                	jl     1413798 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x258d1c>

### 0x141a637 in 0x141a626..0x141a742
     141a61c:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
     141a620:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
     141a625:	c3                   	ret
     141a626:	55                   	push   rbp
     141a627:	53                   	push   rbx
     141a628:	50                   	push   rax
     141a629:	48 89 fb             	mov    rbx,rdi
     141a62c:	48 8b 87 c8 02 00 00 	mov    rax,QWORD PTR [rdi+0x2c8]
     141a633:	c6 40 18 01          	mov    BYTE PTR [rax+0x18],0x1
     141a637:	8a 87 b8 01 00 00    	mov    al,BYTE PTR [rdi+0x1b8]
     141a63d:	48 8d 35 38 79 03 ff 	lea    rsi,[rip+0xffffffffff037938]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     141a644:	a8 01                	test   al,0x1
     141a646:	75 1b                	jne    141a663 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25fbe7>
     141a648:	48 8d 0d c6 01 f3 fe 	lea    rcx,[rip+0xfffffffffef301c6]        # 34a815 <_ZTSSt12bad_any_cast@@Base-0x459b3>
     141a64f:	6a 04                	push   0x4
     141a651:	5f                   	pop    rdi
     141a652:	ba b2 02 00 00       	mov    edx,0x2b2
     141a657:	49 89 d8             	mov    r8,rbx
     141a65a:	31 c0                	xor    eax,eax
     141a65c:	e8 71 c2 3b 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>

### 0x141b2b7 in 0x141a788..0x141b53b
     141b294:	4c 89 38             	mov    QWORD PTR [rax],r15
     141b297:	49 ff 84 24 00 02 00 	inc    QWORD PTR [r12+0x200]
     141b29e:	00 
     141b29f:	48 83 a4 24 50 04 00 	and    QWORD PTR [rsp+0x450],0x0
     141b2a6:	00 00 
     141b2a8:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
     141b2af:	00 
     141b2b0:	e8 19 5e 83 ff       	call   c510ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19e06e>
     141b2b5:	31 c0                	xor    eax,eax
     141b2b7:	41 86 84 24 b8 01 00 	xchg   BYTE PTR [r12+0x1b8],al
     141b2be:	00 
     141b2bf:	48 89 df             	mov    rdi,rbx
     141b2c2:	e8 bf 31 68 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     141b2c7:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     141b2cc:	e8 f9 ef 65 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     141b2d1:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     141b2d8:	00 
     141b2d9:	e8 0c 76 00 00       	call   14228ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x267e6e>
     141b2de:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     141b2e5:	00 00 

### 0x141b620 in 0x141b53c..0x141b8e8
     141b600:	31 c9                	xor    ecx,ecx
     141b602:	45 31 c0             	xor    r8d,r8d
     141b605:	e8 c2 61 3a 00       	call   17c17cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175938>
     141b60a:	4c 89 ef             	mov    rdi,r13
     141b60d:	e8 8c bc 68 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     141b612:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     141b616:	8a 80 e1 03 00 00    	mov    al,BYTE PTR [rax+0x3e1]
     141b61c:	a8 01                	test   al,0x1
     141b61e:	75 07                	jne    141b627 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260bab>
     141b620:	40 86 ab b8 01 00 00 	xchg   BYTE PTR [rbx+0x1b8],bpl
     141b627:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     141b62b:	49 8b 8c 24 c8 04 00 	mov    rcx,QWORD PTR [r12+0x4c8]
     141b632:	00 
     141b633:	48 83 39 00          	cmp    QWORD PTR [rcx],0x0
     141b637:	0f 84 4e 01 00 00    	je     141b78b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260d0f>
     141b63d:	4c 8b ab 40 02 00 00 	mov    r13,QWORD PTR [rbx+0x240]
     141b644:	48 8b 83 48 02 00 00 	mov    rax,QWORD PTR [rbx+0x248]
     141b64b:	49 39 c5             	cmp    r13,rax
     141b64e:	73 23                	jae    141b673 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260bf7>
     141b650:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx

### 0x141d91a in 0x141cf80..0x141e06b
     141d8f6:	e8 87 38 00 00       	call   1421182 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x266706>
     141d8fb:	80 bc 24 d8 00 00 00 	cmp    BYTE PTR [rsp+0xd8],0x0
     141d902:	00 
     141d903:	74 08                	je     141d90d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x262e91>
     141d905:	4c 89 f7             	mov    rdi,r14
     141d908:	e8 eb 01 ff ff       	call   140daf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25307c>
     141d90d:	4c 8b 7d 40          	mov    r15,QWORD PTR [rbp+0x40]
     141d911:	4d 85 ff             	test   r15,r15
     141d914:	0f 84 19 02 00 00    	je     141db33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2630b7>
     141d91a:	49 8d 95 b8 01 00 00 	lea    rdx,[r13+0x1b8]
     141d921:	4d 8d 67 08          	lea    r12,[r15+0x8]
     141d925:	c6 44 24 67 00       	mov    BYTE PTR [rsp+0x67],0x0
     141d92a:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
     141d92f:	48 8d 44 24 67       	lea    rax,[rsp+0x67]
     141d934:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     141d939:	48 8d 44 24 68       	lea    rax,[rsp+0x68]
     141d93e:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     141d943:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     141d948:	4c 89 e6             	mov    rsi,r12
     141d94b:	e8 ea 39 00 00       	call   142133a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2668be>

### 0x14221e0 in 0x1421d56..0x1422627
     14221ad:	48 89 87 a8 01 00 00 	mov    QWORD PTR [rdi+0x1a8],rax
     14221b4:	48 83 a6 a8 01 00 00 	and    QWORD PTR [rsi+0x1a8],0x0
     14221bb:	00 
     14221bc:	0f 11 86 98 01 00 00 	movups XMMWORD PTR [rsi+0x198],xmm0
     14221c3:	48 83 a7 c0 01 00 00 	and    QWORD PTR [rdi+0x1c0],0x0
     14221ca:	00 
     14221cb:	0f 11 87 b0 01 00 00 	movups XMMWORD PTR [rdi+0x1b0],xmm0
     14221d2:	48 8b 86 b0 01 00 00 	mov    rax,QWORD PTR [rsi+0x1b0]
     14221d9:	48 89 87 b0 01 00 00 	mov    QWORD PTR [rdi+0x1b0],rax
     14221e0:	48 8b 86 b8 01 00 00 	mov    rax,QWORD PTR [rsi+0x1b8]
     14221e7:	48 89 87 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rax
     14221ee:	48 8b 86 c0 01 00 00 	mov    rax,QWORD PTR [rsi+0x1c0]
     14221f5:	48 89 87 c0 01 00 00 	mov    QWORD PTR [rdi+0x1c0],rax
     14221fc:	0f 11 86 b0 01 00 00 	movups XMMWORD PTR [rsi+0x1b0],xmm0
     1422203:	48 83 a6 c0 01 00 00 	and    QWORD PTR [rsi+0x1c0],0x0
     142220a:	00 
     142220b:	0f 11 87 c8 01 00 00 	movups XMMWORD PTR [rdi+0x1c8],xmm0
     1422212:	48 83 a7 d8 01 00 00 	and    QWORD PTR [rdi+0x1d8],0x0
     1422219:	00 
     142221a:	48 8b 86 c8 01 00 00 	mov    rax,QWORD PTR [rsi+0x1c8]

### 0x14221e7 in 0x1421d56..0x1422627
     14221b4:	48 83 a6 a8 01 00 00 	and    QWORD PTR [rsi+0x1a8],0x0
     14221bb:	00 
     14221bc:	0f 11 86 98 01 00 00 	movups XMMWORD PTR [rsi+0x198],xmm0
     14221c3:	48 83 a7 c0 01 00 00 	and    QWORD PTR [rdi+0x1c0],0x0
     14221ca:	00 
     14221cb:	0f 11 87 b0 01 00 00 	movups XMMWORD PTR [rdi+0x1b0],xmm0
     14221d2:	48 8b 86 b0 01 00 00 	mov    rax,QWORD PTR [rsi+0x1b0]
     14221d9:	48 89 87 b0 01 00 00 	mov    QWORD PTR [rdi+0x1b0],rax
     14221e0:	48 8b 86 b8 01 00 00 	mov    rax,QWORD PTR [rsi+0x1b8]
     14221e7:	48 89 87 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rax
     14221ee:	48 8b 86 c0 01 00 00 	mov    rax,QWORD PTR [rsi+0x1c0]
     14221f5:	48 89 87 c0 01 00 00 	mov    QWORD PTR [rdi+0x1c0],rax
     14221fc:	0f 11 86 b0 01 00 00 	movups XMMWORD PTR [rsi+0x1b0],xmm0
     1422203:	48 83 a6 c0 01 00 00 	and    QWORD PTR [rsi+0x1c0],0x0
     142220a:	00 
     142220b:	0f 11 87 c8 01 00 00 	movups XMMWORD PTR [rdi+0x1c8],xmm0
     1422212:	48 83 a7 d8 01 00 00 	and    QWORD PTR [rdi+0x1d8],0x0
     1422219:	00 
     142221a:	48 8b 86 c8 01 00 00 	mov    rax,QWORD PTR [rsi+0x1c8]
     1422221:	48 89 87 c8 01 00 00 	mov    QWORD PTR [rdi+0x1c8],rax

### 0x1427f22 in 0x1427ebe..0x1427fa6
     1427eed:	e8 fe 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
     1427ef2:	48 8d bb 58 02 00 00 	lea    rdi,[rbx+0x258]
     1427ef9:	e8 f2 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
     1427efe:	48 8d bb 30 02 00 00 	lea    rdi,[rbx+0x230]
     1427f05:	e8 e6 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
     1427f0a:	48 8d bb 08 02 00 00 	lea    rdi,[rbx+0x208]
     1427f11:	e8 da 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
     1427f16:	48 8d bb e0 01 00 00 	lea    rdi,[rbx+0x1e0]
     1427f1d:	e8 ce 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
     1427f22:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
     1427f29:	e8 c2 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
     1427f2e:	48 8d bb 90 01 00 00 	lea    rdi,[rbx+0x190]
     1427f35:	e8 b6 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
     1427f3a:	48 8d bb 68 01 00 00 	lea    rdi,[rbx+0x168]
     1427f41:	e8 aa 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
     1427f46:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
     1427f4d:	e8 9e 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
     1427f52:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
     1427f59:	e8 92 19 8b ff       	call   cd98f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x226890>
     1427f5e:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]

### 0x1428011 in 0x1427fa6..0x14280a4
     1427fdc:	e8 47 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
     1427fe1:	49 8d be 38 02 00 00 	lea    rdi,[r14+0x238]
     1427fe8:	e8 3b 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
     1427fed:	49 8d be 18 02 00 00 	lea    rdi,[r14+0x218]
     1427ff4:	e8 2f 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
     1427ff9:	49 8d be f8 01 00 00 	lea    rdi,[r14+0x1f8]
     1428000:	e8 23 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
     1428005:	49 8d be d8 01 00 00 	lea    rdi,[r14+0x1d8]
     142800c:	e8 17 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
     1428011:	49 8d be b8 01 00 00 	lea    rdi,[r14+0x1b8]
     1428018:	e8 0b 35 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
     142801d:	49 8d be 98 01 00 00 	lea    rdi,[r14+0x198]
     1428024:	e8 ff 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
     1428029:	49 8d be 78 01 00 00 	lea    rdi,[r14+0x178]
     1428030:	e8 f3 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
     1428035:	49 8d be 58 01 00 00 	lea    rdi,[r14+0x158]
     142803c:	e8 e7 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
     1428041:	49 8d be 38 01 00 00 	lea    rdi,[r14+0x138]
     1428048:	e8 db 34 85 ff       	call   c7b528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c84c8>
     142804d:	49 8d be 18 01 00 00 	lea    rdi,[r14+0x118]

### 0x14335a3 in 0x1433512..0x1433894
     143357d:	4c 89 ff             	mov    rdi,r15
     1433580:	4c 89 ea             	mov    rdx,r13
     1433583:	4c 89 e1             	mov    rcx,r12
     1433586:	49 89 d8             	mov    r8,rbx
     1433589:	e8 1c d3 ff ff       	call   14308aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275e2e>
     143358e:	88 44 24 07          	mov    BYTE PTR [rsp+0x7],al
     1433592:	49 8d be 28 01 00 00 	lea    rdi,[r14+0x128]
     1433599:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     143359e:	e8 fd e6 ff ff       	call   1431ca0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277224>
     14335a3:	4d 8d a6 b8 01 00 00 	lea    r12,[r14+0x1b8]
     14335aa:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     14335b1:	00 
     14335b2:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
     14335b7:	4c 89 e6             	mov    rsi,r12
     14335ba:	4c 89 fa             	mov    rdx,r15
     14335bd:	49 89 d8             	mov    r8,rbx
     14335c0:	e8 4f e8 ff ff       	call   1431e14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277398>
     14335c5:	48 8d 8c 24 b8 00 00 	lea    rcx,[rsp+0xb8]
     14335cc:	00 
     14335cd:	4c 89 61 f8          	mov    QWORD PTR [rcx-0x8],r12

### 0x14335eb in 0x1433512..0x1433894
     14335cc:	00 
     14335cd:	4c 89 61 f8          	mov    QWORD PTR [rcx-0x8],r12
     14335d1:	48 8d 84 24 40 01 00 	lea    rax,[rsp+0x140]
     14335d8:	00 
     14335d9:	48 89 01             	mov    QWORD PTR [rcx],rax
     14335dc:	0f 57 c0             	xorps  xmm0,xmm0
     14335df:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     14335e3:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
     14335e8:	48 89 0a             	mov    QWORD PTR [rdx],rcx
     14335eb:	49 8b be b8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1b8]
     14335f2:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
     14335f7:	49 8b b6 c0 01 00 00 	mov    rsi,QWORD PTR [r14+0x1c0]
     14335fe:	e8 91 02 00 00       	call   1433894 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278e18>
     1433603:	49 89 c4             	mov    r12,rax
     1433606:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     143360d:	00 
     143360e:	c6 84 24 c8 00 00 00 	mov    BYTE PTR [rsp+0xc8],0x1
     1433615:	01 
     1433616:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
     143361d:	00 

### 0x1435bad in 0x1435020..0x1436dd5
     1435b80:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     1435b87:	00 
     1435b88:	0f 11 8b 70 01 00 00 	movups XMMWORD PTR [rbx+0x170],xmm1
     1435b8f:	48 83 a3 80 01 00 00 	and    QWORD PTR [rbx+0x180],0x0
     1435b96:	00 
     1435b97:	0f 10 83 88 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x188]
     1435b9e:	0f 11 84 24 a8 01 00 	movups XMMWORD PTR [rsp+0x1a8],xmm0
     1435ba5:	00 
     1435ba6:	48 8b 83 98 01 00 00 	mov    rax,QWORD PTR [rbx+0x198]
     1435bad:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     1435bb4:	00 
     1435bb5:	0f 11 8b 88 01 00 00 	movups XMMWORD PTR [rbx+0x188],xmm1
     1435bbc:	48 83 a3 98 01 00 00 	and    QWORD PTR [rbx+0x198],0x0
     1435bc3:	00 
     1435bc4:	0f 10 83 a0 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1a0]
     1435bcb:	0f 29 84 24 c0 01 00 	movaps XMMWORD PTR [rsp+0x1c0],xmm0
     1435bd2:	00 
     1435bd3:	48 8b 83 b0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1b0]
     1435bda:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
     1435be1:	00 

### 0x1435bf1 in 0x1435020..0x1436dd5
     1435bc4:	0f 10 83 a0 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1a0]
     1435bcb:	0f 29 84 24 c0 01 00 	movaps XMMWORD PTR [rsp+0x1c0],xmm0
     1435bd2:	00 
     1435bd3:	48 8b 83 b0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1b0]
     1435bda:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
     1435be1:	00 
     1435be2:	0f 11 8b a0 01 00 00 	movups XMMWORD PTR [rbx+0x1a0],xmm1
     1435be9:	48 83 a3 b0 01 00 00 	and    QWORD PTR [rbx+0x1b0],0x0
     1435bf0:	00 
     1435bf1:	0f 10 83 b8 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1b8]
     1435bf8:	0f 11 84 24 d8 01 00 	movups XMMWORD PTR [rsp+0x1d8],xmm0
     1435bff:	00 
     1435c00:	48 8b 83 c8 01 00 00 	mov    rax,QWORD PTR [rbx+0x1c8]
     1435c07:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
     1435c0e:	00 
     1435c0f:	0f 11 8b b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm1
     1435c16:	48 83 a3 c8 01 00 00 	and    QWORD PTR [rbx+0x1c8],0x0
     1435c1d:	00 
     1435c1e:	0f 10 83 d0 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1d0]
     1435c25:	0f 29 84 24 f0 01 00 	movaps XMMWORD PTR [rsp+0x1f0],xmm0

### 0x1435c0f in 0x1435020..0x1436dd5
     1435be2:	0f 11 8b a0 01 00 00 	movups XMMWORD PTR [rbx+0x1a0],xmm1
     1435be9:	48 83 a3 b0 01 00 00 	and    QWORD PTR [rbx+0x1b0],0x0
     1435bf0:	00 
     1435bf1:	0f 10 83 b8 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1b8]
     1435bf8:	0f 11 84 24 d8 01 00 	movups XMMWORD PTR [rsp+0x1d8],xmm0
     1435bff:	00 
     1435c00:	48 8b 83 c8 01 00 00 	mov    rax,QWORD PTR [rbx+0x1c8]
     1435c07:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
     1435c0e:	00 
     1435c0f:	0f 11 8b b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm1
     1435c16:	48 83 a3 c8 01 00 00 	and    QWORD PTR [rbx+0x1c8],0x0
     1435c1d:	00 
     1435c1e:	0f 10 83 d0 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1d0]
     1435c25:	0f 29 84 24 f0 01 00 	movaps XMMWORD PTR [rsp+0x1f0],xmm0
     1435c2c:	00 
     1435c2d:	48 8b 83 e0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1e0]
     1435c34:	48 89 84 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rax
     1435c3b:	00 
     1435c3c:	0f 11 8b d0 01 00 00 	movups XMMWORD PTR [rbx+0x1d0],xmm1
     1435c43:	48 83 a3 e0 01 00 00 	and    QWORD PTR [rbx+0x1e0],0x0

### 0x143a83f in 0x143a734..0x143ad68
     143a81b:	00 
     143a81c:	0f 29 84 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm0
     143a823:	00 
     143a824:	0f 29 84 24 90 01 00 	movaps XMMWORD PTR [rsp+0x190],xmm0
     143a82b:	00 
     143a82c:	c7 84 24 a8 01 00 00 	mov    DWORD PTR [rsp+0x1a8],0xc
     143a833:	0c 00 00 00 
     143a837:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     143a83e:	00 
     143a83f:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
     143a846:	00 
     143a847:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     143a84a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     143a84d:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     143a854:	00 
     143a855:	ff 50 68             	call   QWORD PTR [rax+0x68]
     143a858:	80 bc 24 50 01 00 00 	cmp    BYTE PTR [rsp+0x150],0x0
     143a85f:	00 
     143a860:	0f 84 32 01 00 00    	je     143a998 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27ff1c>
     143a866:	8b 84 24 48 01 00 00 	mov    eax,DWORD PTR [rsp+0x148]

### 0x1440555 in 0x144048e..0x14405a3
     1440522:	88 83 08 02 00 00    	mov    BYTE PTR [rbx+0x208],al
     1440528:	88 83 20 02 00 00    	mov    BYTE PTR [rbx+0x220],al
     144052e:	88 83 28 02 00 00    	mov    BYTE PTR [rbx+0x228],al
     1440534:	88 83 40 02 00 00    	mov    BYTE PTR [rbx+0x240],al
     144053a:	88 83 48 02 00 00    	mov    BYTE PTR [rbx+0x248],al
     1440540:	88 83 60 02 00 00    	mov    BYTE PTR [rbx+0x260],al
     1440546:	48 83 a3 70 02 00 00 	and    QWORD PTR [rbx+0x270],0x0
     144054d:	00 
     144054e:	0f 11 83 a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm0
     1440555:	88 83 b8 01 00 00    	mov    BYTE PTR [rbx+0x1b8],al
     144055b:	4c 89 b3 68 02 00 00 	mov    QWORD PTR [rbx+0x268],r14
     1440562:	88 83 b0 02 00 00    	mov    BYTE PTR [rbx+0x2b0],al
     1440568:	88 83 b8 02 00 00    	mov    BYTE PTR [rbx+0x2b8],al
     144056e:	88 83 d0 02 00 00    	mov    BYTE PTR [rbx+0x2d0],al
     1440574:	88 83 d8 02 00 00    	mov    BYTE PTR [rbx+0x2d8],al
     144057a:	88 83 f0 02 00 00    	mov    BYTE PTR [rbx+0x2f0],al
     1440580:	83 a3 f8 02 00 00 00 	and    DWORD PTR [rbx+0x2f8],0x0
     1440587:	88 83 fc 02 00 00    	mov    BYTE PTR [rbx+0x2fc],al
     144058d:	0f 11 83 81 02 00 00 	movups XMMWORD PTR [rbx+0x281],xmm0
     1440594:	0f 11 83 78 02 00 00 	movups XMMWORD PTR [rbx+0x278],xmm0

### 0x144097f in 0x14405a3..0x1440ea2
     1440957:	ba 89 00 00 00       	mov    edx,0x89
     144095c:	49 89 f0             	mov    r8,rsi
     144095f:	31 c0                	xor    eax,eax
     1440961:	e8 6c 5f 39 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     1440966:	eb 70                	jmp    14409d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285f5c>
     1440968:	4c 8d bb f9 00 00 00 	lea    r15,[rbx+0xf9]
     144096f:	80 bb c8 01 00 00 00 	cmp    BYTE PTR [rbx+0x1c8],0x0
     1440976:	74 10                	je     1440988 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285f0c>
     1440978:	48 8b 83 c0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1c0]
     144097f:	48 8b 8b b8 01 00 00 	mov    rcx,QWORD PTR [rbx+0x1b8]
     1440986:	eb 04                	jmp    144098c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285f10>
     1440988:	31 c0                	xor    eax,eax
     144098a:	31 c9                	xor    ecx,ecx
     144098c:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     1440991:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     1440994:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     1440998:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
     144099f:	00 
     14409a0:	4c 89 e7             	mov    rdi,r12
     14409a3:	e8 78 39 75 ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>

### 0x1440ee9 in 0x1440ea2..0x144110c
     1440ebe:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
     1440ec2:	49 8d 76 78          	lea    rsi,[r14+0x78]
     1440ec6:	e8 c9 66 f5 ff       	call   1397594 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dcb18>
     1440ecb:	be 70 01 00 00       	mov    esi,0x170
     1440ed0:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     1440ed4:	4c 01 f6             	add    rsi,r14
     1440ed7:	e8 2e 3a 80 ff       	call   c4490a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1918aa>
     1440edc:	41 8a 86 c8 01 00 00 	mov    al,BYTE PTR [r14+0x1c8]
     1440ee3:	88 83 c8 01 00 00    	mov    BYTE PTR [rbx+0x1c8],al
     1440ee9:	41 0f 10 86 b8 01 00 	movups xmm0,XMMWORD PTR [r14+0x1b8]
     1440ef0:	00 
     1440ef1:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
     1440ef8:	31 c0                	xor    eax,eax
     1440efa:	88 83 d0 01 00 00    	mov    BYTE PTR [rbx+0x1d0],al
     1440f00:	88 83 00 02 00 00    	mov    BYTE PTR [rbx+0x200],al
     1440f06:	41 38 86 00 02 00 00 	cmp    BYTE PTR [r14+0x200],al
     1440f0d:	74 13                	je     1440f22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2864a6>
     1440f0f:	48 8d bb d0 01 00 00 	lea    rdi,[rbx+0x1d0]
     1440f16:	49 8d b6 d0 01 00 00 	lea    rsi,[r14+0x1d0]
     1440f1d:	e8 b0 09 00 00       	call   14418d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286e56>

### 0x1440ef1 in 0x1440ea2..0x144110c
     1440ec6:	e8 c9 66 f5 ff       	call   1397594 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dcb18>
     1440ecb:	be 70 01 00 00       	mov    esi,0x170
     1440ed0:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     1440ed4:	4c 01 f6             	add    rsi,r14
     1440ed7:	e8 2e 3a 80 ff       	call   c4490a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1918aa>
     1440edc:	41 8a 86 c8 01 00 00 	mov    al,BYTE PTR [r14+0x1c8]
     1440ee3:	88 83 c8 01 00 00    	mov    BYTE PTR [rbx+0x1c8],al
     1440ee9:	41 0f 10 86 b8 01 00 	movups xmm0,XMMWORD PTR [r14+0x1b8]
     1440ef0:	00 
     1440ef1:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
     1440ef8:	31 c0                	xor    eax,eax
     1440efa:	88 83 d0 01 00 00    	mov    BYTE PTR [rbx+0x1d0],al
     1440f00:	88 83 00 02 00 00    	mov    BYTE PTR [rbx+0x200],al
     1440f06:	41 38 86 00 02 00 00 	cmp    BYTE PTR [r14+0x200],al
     1440f0d:	74 13                	je     1440f22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2864a6>
     1440f0f:	48 8d bb d0 01 00 00 	lea    rdi,[rbx+0x1d0]
     1440f16:	49 8d b6 d0 01 00 00 	lea    rsi,[r14+0x1d0]
     1440f1d:	e8 b0 09 00 00       	call   14418d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286e56>
     1440f22:	31 c0                	xor    eax,eax
     1440f24:	88 83 08 02 00 00    	mov    BYTE PTR [rbx+0x208],al

### 0x1441466 in 0x144144a..0x144149c
     1441442:	0f 85 92 25 f1 ff    	jne    13539da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198f5e>
     1441448:	c3                   	ret
     1441449:	cc                   	int3
     144144a:	53                   	push   rbx
     144144b:	48 89 fb             	mov    rbx,rdi
     144144e:	48 81 c7 f8 01 00 00 	add    rdi,0x1f8
     1441455:	e8 d6 58 66 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     144145a:	48 8d bb d8 01 00 00 	lea    rdi,[rbx+0x1d8]
     1441461:	e8 ca 58 66 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1441466:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
     144146d:	e8 be 58 66 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1441472:	48 8d bb 80 01 00 00 	lea    rdi,[rbx+0x180]
     1441479:	e8 1e 00 00 00       	call   144149c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286a20>
     144147e:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
     1441485:	e8 42 37 22 00       	call   1664bcc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18d38>
     144148a:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     144148e:	e8 e1 a3 81 ff       	call   c5b874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a8814>
     1441493:	48 89 df             	mov    rdi,rbx
     1441496:	5b                   	pop    rbx
     1441497:	e9 a6 c3 7f ff       	jmp    c3d842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18a7e2>

### 0x1441651 in 0x14415f2..0x1441827
     1441626:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
     144162b:	e8 10 8f 92 ff       	call   d6a540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375c6>
     1441630:	be 70 01 00 00       	mov    esi,0x170
     1441635:	4c 8d 2c 33          	lea    r13,[rbx+rsi*1]
     1441639:	4c 01 fe             	add    rsi,r15
     144163c:	4c 89 ef             	mov    rdi,r13
     144163f:	e8 22 7b 81 ff       	call   c59166 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a6106>
     1441644:	41 8a 87 c8 01 00 00 	mov    al,BYTE PTR [r15+0x1c8]
     144164b:	88 83 c8 01 00 00    	mov    BYTE PTR [rbx+0x1c8],al
     1441651:	41 0f 10 87 b8 01 00 	movups xmm0,XMMWORD PTR [r15+0x1b8]
     1441658:	00 
     1441659:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
     1441660:	be d0 01 00 00       	mov    esi,0x1d0
     1441665:	48 8d 2c 33          	lea    rbp,[rbx+rsi*1]
     1441669:	31 c0                	xor    eax,eax
     144166b:	88 83 d0 01 00 00    	mov    BYTE PTR [rbx+0x1d0],al
     1441671:	88 83 00 02 00 00    	mov    BYTE PTR [rbx+0x200],al
     1441677:	41 38 87 00 02 00 00 	cmp    BYTE PTR [r15+0x200],al
     144167e:	74 29                	je     14416a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286c2d>
     1441680:	31 c0                	xor    eax,eax

### 0x1441659 in 0x14415f2..0x1441827
     1441630:	be 70 01 00 00       	mov    esi,0x170
     1441635:	4c 8d 2c 33          	lea    r13,[rbx+rsi*1]
     1441639:	4c 01 fe             	add    rsi,r15
     144163c:	4c 89 ef             	mov    rdi,r13
     144163f:	e8 22 7b 81 ff       	call   c59166 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a6106>
     1441644:	41 8a 87 c8 01 00 00 	mov    al,BYTE PTR [r15+0x1c8]
     144164b:	88 83 c8 01 00 00    	mov    BYTE PTR [rbx+0x1c8],al
     1441651:	41 0f 10 87 b8 01 00 	movups xmm0,XMMWORD PTR [r15+0x1b8]
     1441658:	00 
     1441659:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
     1441660:	be d0 01 00 00       	mov    esi,0x1d0
     1441665:	48 8d 2c 33          	lea    rbp,[rbx+rsi*1]
     1441669:	31 c0                	xor    eax,eax
     144166b:	88 83 d0 01 00 00    	mov    BYTE PTR [rbx+0x1d0],al
     1441671:	88 83 00 02 00 00    	mov    BYTE PTR [rbx+0x200],al
     1441677:	41 38 87 00 02 00 00 	cmp    BYTE PTR [r15+0x200],al
     144167e:	74 29                	je     14416a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286c2d>
     1441680:	31 c0                	xor    eax,eax
     1441682:	88 83 d0 01 00 00    	mov    BYTE PTR [rbx+0x1d0],al
     1441688:	88 83 f8 01 00 00    	mov    BYTE PTR [rbx+0x1f8],al

### 0x14482cb in 0x144821a..0x144838c
     144828c:	0f 11 83 a4 00 00 00 	movups XMMWORD PTR [rbx+0xa4],xmm0
     1448293:	0f 11 83 b4 00 00 00 	movups XMMWORD PTR [rbx+0xb4],xmm0
     144829a:	0f 11 83 c4 00 00 00 	movups XMMWORD PTR [rbx+0xc4],xmm0
     14482a1:	0f 11 83 d4 00 00 00 	movups XMMWORD PTR [rbx+0xd4],xmm0
     14482a8:	0f 11 83 e4 00 00 00 	movups XMMWORD PTR [rbx+0xe4],xmm0
     14482af:	0f 11 83 f4 00 00 00 	movups XMMWORD PTR [rbx+0xf4],xmm0
     14482b6:	0f 11 83 04 01 00 00 	movups XMMWORD PTR [rbx+0x104],xmm0
     14482bd:	0f 11 83 11 01 00 00 	movups XMMWORD PTR [rbx+0x111],xmm0
     14482c4:	0f 11 83 c4 01 00 00 	movups XMMWORD PTR [rbx+0x1c4],xmm0
     14482cb:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
     14482d2:	0f 11 83 a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm0
     14482d9:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
     14482e0:	0f 11 83 88 01 00 00 	movups XMMWORD PTR [rbx+0x188],xmm0
     14482e7:	48 b9 00 00 00 00 00 	movabs rcx,0x3ff0000000000000
     14482ee:	00 f0 3f 
     14482f1:	48 89 8b d8 01 00 00 	mov    QWORD PTR [rbx+0x1d8],rcx
     14482f8:	88 83 e0 01 00 00    	mov    BYTE PTR [rbx+0x1e0],al
     14482fe:	88 83 e4 01 00 00    	mov    BYTE PTR [rbx+0x1e4],al
     1448304:	66 83 a3 e8 01 00 00 	and    WORD PTR [rbx+0x1e8],0x0
     144830b:	00 

### 0x144ae36 in 0x144ab94..0x144b5e5
     144ae18:	a8 01                	test   al,0x1
     144ae1a:	74 0a                	je     144ae26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2903aa>
     144ae1c:	48 8b 84 24 88 02 00 	mov    rax,QWORD PTR [rsp+0x288]
     144ae23:	00 
     144ae24:	eb 02                	jmp    144ae28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2903ac>
     144ae26:	d1 e8                	shr    eax,1
     144ae28:	49 81 c4 98 02 00 00 	add    r12,0x298
     144ae2f:	48 85 c0             	test   rax,rax
     144ae32:	49 0f 44 f4          	cmove  rsi,r12
     144ae36:	4c 8d a3 b8 01 00 00 	lea    r12,[rbx+0x1b8]
     144ae3d:	4c 89 e7             	mov    rdi,r12
     144ae40:	e8 3b 32 3a 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     144ae45:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     144ae49:	48 8d b3 80 02 00 00 	lea    rsi,[rbx+0x280]
     144ae50:	e8 27 da ff ff       	call   144887c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28de00>
     144ae55:	49 89 c5             	mov    r13,rax
     144ae58:	80 bb 38 02 00 00 00 	cmp    BYTE PTR [rbx+0x238],0x0
     144ae5f:	75 41                	jne    144aea2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x290426>
     144ae61:	48 8d 35 17 9c f2 fe 	lea    rsi,[rip+0xfffffffffef29c17]        # 374a7f <_ZTSSt12bad_any_cast@@Base-0x1b749>
     144ae68:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]

### 0x144e098 in 0x144e012..0x144e23a
     144e070:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     144e075:	f2 41 0f 10 44 24 18 	movsd  xmm0,QWORD PTR [r12+0x18]
     144e07c:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     144e081:	49 8b 84 24 90 00 00 	mov    rax,QWORD PTR [r12+0x90]
     144e088:	00 
     144e089:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     144e08e:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     144e092:	4c 89 ef             	mov    rdi,r13
     144e095:	ff 50 28             	call   QWORD PTR [rax+0x28]
     144e098:	44 8a a8 b8 01 00 00 	mov    r13b,BYTE PTR [rax+0x1b8]
     144e09f:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
     144e0a3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     144e0a6:	48 8d 35 b2 79 fe fe 	lea    rsi,[rip+0xfffffffffefe79b2]        # 435a5f <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4ae>
     144e0ad:	48 8d 0d bc 79 fe fe 	lea    rcx,[rip+0xfffffffffefe79bc]        # 435a70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4bf>
     144e0b4:	6a 08                	push   0x8
     144e0b6:	41 5c                	pop    r12
     144e0b8:	6a 16                	push   0x16
     144e0ba:	41 58                	pop    r8
     144e0bc:	4c 89 e2             	mov    rdx,r12
     144e0bf:	45 31 c9             	xor    r9d,r9d

### 0x144f35a in 0x144f226..0x144f557
     144f33b:	84 c0                	test   al,al
     144f33d:	74 1b                	je     144f35a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2948de>
     144f33f:	4c 89 e7             	mov    rdi,r12
     144f342:	e8 ef c4 62 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     144f347:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     144f34e:	00 
     144f34f:	48 89 c6             	mov    rsi,rax
     144f352:	e8 89 11 67 ff       	call   ac04e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd480>
     144f357:	41 89 c5             	mov    r13d,eax
     144f35a:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     144f361:	00 
     144f362:	6a 50                	push   0x50
     144f364:	5e                   	pop    rsi
     144f365:	e8 ec 14 67 ff       	call   ac0856 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7f6>
     144f36a:	49 89 c7             	mov    r15,rax
     144f36d:	48 8d 78 08          	lea    rdi,[rax+0x8]
     144f371:	48 8b b4 24 b8 01 00 	mov    rsi,QWORD PTR [rsp+0x1b8]
     144f378:	00 
     144f379:	4c 89 e2             	mov    rdx,r12
     144f37c:	e8 e7 14 67 ff       	call   ac0868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd808>

### 0x144f371 in 0x144f226..0x144f557
     144f352:	e8 89 11 67 ff       	call   ac04e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd480>
     144f357:	41 89 c5             	mov    r13d,eax
     144f35a:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     144f361:	00 
     144f362:	6a 50                	push   0x50
     144f364:	5e                   	pop    rsi
     144f365:	e8 ec 14 67 ff       	call   ac0856 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7f6>
     144f36a:	49 89 c7             	mov    r15,rax
     144f36d:	48 8d 78 08          	lea    rdi,[rax+0x8]
     144f371:	48 8b b4 24 b8 01 00 	mov    rsi,QWORD PTR [rsp+0x1b8]
     144f378:	00 
     144f379:	4c 89 e2             	mov    rdx,r12
     144f37c:	e8 e7 14 67 ff       	call   ac0868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd808>
     144f381:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     144f388:	00 
     144f389:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     144f38d:	48 8d 0d 0c 4d 42 00 	lea    rcx,[rip+0x424d0c]        # 18740a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30788>
     144f394:	49 89 4f 20          	mov    QWORD PTR [r15+0x20],rcx
     144f398:	0f 57 c0             	xorps  xmm0,xmm0
     144f39b:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0

### 0x144f381 in 0x144f226..0x144f557
     144f362:	6a 50                	push   0x50
     144f364:	5e                   	pop    rsi
     144f365:	e8 ec 14 67 ff       	call   ac0856 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7f6>
     144f36a:	49 89 c7             	mov    r15,rax
     144f36d:	48 8d 78 08          	lea    rdi,[rax+0x8]
     144f371:	48 8b b4 24 b8 01 00 	mov    rsi,QWORD PTR [rsp+0x1b8]
     144f378:	00 
     144f379:	4c 89 e2             	mov    rdx,r12
     144f37c:	e8 e7 14 67 ff       	call   ac0868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd808>
     144f381:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     144f388:	00 
     144f389:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     144f38d:	48 8d 0d 0c 4d 42 00 	lea    rcx,[rip+0x424d0c]        # 18740a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30788>
     144f394:	49 89 4f 20          	mov    QWORD PTR [r15+0x20],rcx
     144f398:	0f 57 c0             	xorps  xmm0,xmm0
     144f39b:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     144f3a0:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     144f3a4:	41 83 67 48 00       	and    DWORD PTR [r15+0x48],0x0
     144f3a9:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]
     144f3b0:	00 

### 0x14562ea in 0x145622c..0x14567ca
     14562c8:	49 83 c4 30          	add    r12,0x30
     14562cc:	4c 89 e7             	mov    rdi,r12
     14562cf:	e8 62 55 62 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     14562d4:	4c 89 ef             	mov    rdi,r13
     14562d7:	48 89 c6             	mov    rsi,rax
     14562da:	e8 73 95 32 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     14562df:	0f 57 c0             	xorps  xmm0,xmm0
     14562e2:	84 c0                	test   al,al
     14562e4:	0f 84 99 02 00 00    	je     1456583 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29bb07>
     14562ea:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
     14562f1:	00 
     14562f2:	48 8d 05 47 c3 41 00 	lea    rax,[rip+0x41c347]        # 1872640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ed28>
     14562f9:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     1456300:	00 
     1456301:	48 89 ac 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rbp
     1456308:	00 
     1456309:	48 89 ac 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rbp
     1456310:	00 
     1456311:	83 a4 24 d8 01 00 00 	and    DWORD PTR [rsp+0x1d8],0x0
     1456318:	00 

### 0x14572c5 in 0x1456f26..0x1457c78
     145729e:	e8 af 85 32 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     14572a3:	0f 57 c0             	xorps  xmm0,xmm0
     14572a6:	84 c0                	test   al,al
     14572a8:	0f 84 93 04 00 00    	je     1457741 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ccc5>
     14572ae:	0f 11 84 24 a8 01 00 	movups XMMWORD PTR [rsp+0x1a8],xmm0
     14572b5:	00 
     14572b6:	48 8d 05 93 b9 41 00 	lea    rax,[rip+0x41b993]        # 1872c50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2f338>
     14572bd:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     14572c4:	00 
     14572c5:	48 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbp
     14572cc:	00 
     14572cd:	48 8b 84 24 58 01 00 	mov    rax,QWORD PTR [rsp+0x158]
     14572d4:	00 
     14572d5:	a8 01                	test   al,0x1
     14572d7:	0f 85 36 09 00 00    	jne    1457c13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d197>
     14572dd:	48 85 c0             	test   rax,rax
     14572e0:	0f 84 a4 05 00 00    	je     145788a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ce0e>
     14572e6:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     14572ed:	00 
     14572ee:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]

### 0x1457f46 in 0x1457d06..0x14587de
     1457f24:	49 83 c4 30          	add    r12,0x30
     1457f28:	4c 89 e7             	mov    rdi,r12
     1457f2b:	e8 06 39 62 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1457f30:	4c 89 ef             	mov    rdi,r13
     1457f33:	48 89 c6             	mov    rsi,rax
     1457f36:	e8 17 79 32 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     1457f3b:	0f 57 c0             	xorps  xmm0,xmm0
     1457f3e:	84 c0                	test   al,al
     1457f40:	0f 84 c5 03 00 00    	je     145830b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29d88f>
     1457f46:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
     1457f4d:	00 
     1457f4e:	48 8d 05 83 b0 41 00 	lea    rax,[rip+0x41b083]        # 1872fd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2f6c0>
     1457f55:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     1457f5c:	00 
     1457f5d:	48 89 ac 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rbp
     1457f64:	00 
     1457f65:	48 8b 84 24 48 01 00 	mov    rax,QWORD PTR [rsp+0x148]
     1457f6c:	00 
     1457f6d:	a8 01                	test   al,0x1
     1457f6f:	0f 85 08 08 00 00    	jne    145877d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29dd01>

### 0x1474895 in 0x14740f4..0x147584c
     1474865:	48 8d 88 f0 00 00 00 	lea    rcx,[rax+0xf0]
     147486c:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
     1474871:	48 8d 88 b0 00 00 00 	lea    rcx,[rax+0xb0]
     1474878:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
     147487d:	48 8d 48 50          	lea    rcx,[rax+0x50]
     1474881:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
     1474886:	48 8d 88 e0 01 00 00 	lea    rcx,[rax+0x1e0]
     147488d:	48 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rcx
     1474894:	00 
     1474895:	48 8d 88 b8 01 00 00 	lea    rcx,[rax+0x1b8]
     147489c:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     14748a3:	00 
     14748a4:	48 05 90 01 00 00    	add    rax,0x190
     14748aa:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     14748af:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
     14748b6:	00 
     14748b7:	4d 8d 7d 20          	lea    r15,[r13+0x20]
     14748bb:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     14748bf:	4c 89 fe             	mov    rsi,r15
     14748c2:	e8 13 38 0e 00       	call   15580da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39d65e>

### 0x148060a in 0x1480242..0x148086f
     14805d4:	00 03 01 
     14805d7:	31 c9                	xor    ecx,ecx
     14805d9:	88 8c 24 80 01 00 00 	mov    BYTE PTR [rsp+0x180],cl
     14805e0:	88 8c 24 88 01 00 00 	mov    BYTE PTR [rsp+0x188],cl
     14805e7:	88 8c 24 90 01 00 00 	mov    BYTE PTR [rsp+0x190],cl
     14805ee:	88 8c 24 98 01 00 00 	mov    BYTE PTR [rsp+0x198],cl
     14805f5:	88 8c 24 a0 01 00 00 	mov    BYTE PTR [rsp+0x1a0],cl
     14805fc:	88 8c 24 a8 01 00 00 	mov    BYTE PTR [rsp+0x1a8],cl
     1480603:	88 8c 24 b0 01 00 00 	mov    BYTE PTR [rsp+0x1b0],cl
     148060a:	88 8c 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],cl
     1480611:	88 8c 24 c0 01 00 00 	mov    BYTE PTR [rsp+0x1c0],cl
     1480618:	88 8c 24 c8 01 00 00 	mov    BYTE PTR [rsp+0x1c8],cl
     148061f:	88 8c 24 d0 01 00 00 	mov    BYTE PTR [rsp+0x1d0],cl
     1480626:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     148062b:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     148062e:	83 a4 24 00 02 00 00 	and    DWORD PTR [rsp+0x200],0x0
     1480635:	00 
     1480636:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     148063b:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     148063e:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0

### 0x148071a in 0x1480242..0x148086f
     14806e6:	01 
     14806e7:	31 c9                	xor    ecx,ecx
     14806e9:	88 8c 24 80 01 00 00 	mov    BYTE PTR [rsp+0x180],cl
     14806f0:	88 8c 24 88 01 00 00 	mov    BYTE PTR [rsp+0x188],cl
     14806f7:	88 8c 24 90 01 00 00 	mov    BYTE PTR [rsp+0x190],cl
     14806fe:	88 8c 24 98 01 00 00 	mov    BYTE PTR [rsp+0x198],cl
     1480705:	88 8c 24 a0 01 00 00 	mov    BYTE PTR [rsp+0x1a0],cl
     148070c:	88 8c 24 a8 01 00 00 	mov    BYTE PTR [rsp+0x1a8],cl
     1480713:	88 8c 24 b0 01 00 00 	mov    BYTE PTR [rsp+0x1b0],cl
     148071a:	88 8c 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],cl
     1480721:	88 8c 24 c0 01 00 00 	mov    BYTE PTR [rsp+0x1c0],cl
     1480728:	88 8c 24 c8 01 00 00 	mov    BYTE PTR [rsp+0x1c8],cl
     148072f:	88 8c 24 d0 01 00 00 	mov    BYTE PTR [rsp+0x1d0],cl
     1480736:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     148073b:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     148073e:	83 a4 24 00 02 00 00 	and    DWORD PTR [rsp+0x200],0x0
     1480745:	00 
     1480746:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     148074b:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     148074e:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0

### 0x1483458 in 0x1483002..0x1483c35
     1483435:	0f 11 45 58          	movups XMMWORD PTR [rbp+0x58],xmm0
     1483439:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
     148343c:	48 89 ef             	mov    rdi,rbp
     148343f:	48 83 c7 70          	add    rdi,0x70
     1483443:	48 8b b4 24 b8 00 00 	mov    rsi,QWORD PTR [rsp+0xb8]
     148344a:	00 
     148344b:	e8 4c 85 db ff       	call   123b99c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80f20>
     1483450:	c6 84 24 f0 01 00 00 	mov    BYTE PTR [rsp+0x1f0],0x1
     1483457:	01 
     1483458:	49 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [r12+0x1b8]
     148345f:	00 
     1483460:	48 ff c0             	inc    rax
     1483463:	78 07                	js     148346c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c89f0>
     1483465:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
     148346a:	eb 15                	jmp    1483481 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c8a05>
     148346c:	48 89 c1             	mov    rcx,rax
     148346f:	48 d1 e9             	shr    rcx,1
     1483472:	83 e0 01             	and    eax,0x1
     1483475:	48 09 c8             	or     rax,rcx
     1483478:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax

### 0x14838c0 in 0x1483002..0x1483c35
     14838a0:	31 d2                	xor    edx,edx
     14838a2:	48 f7 f3             	div    rbx
     14838a5:	48 89 d0             	mov    rax,rdx
     14838a8:	48 c1 e0 03          	shl    rax,0x3
     14838ac:	48 8b 4c 24 68       	mov    rcx,QWORD PTR [rsp+0x68]
     14838b1:	48 03 01             	add    rax,QWORD PTR [rcx]
     14838b4:	48 89 28             	mov    QWORD PTR [rax],rbp
     14838b7:	48 83 a4 24 e0 01 00 	and    QWORD PTR [rsp+0x1e0],0x0
     14838be:	00 00 
     14838c0:	49 ff 84 24 b8 01 00 	inc    QWORD PTR [r12+0x1b8]
     14838c7:	00 
     14838c8:	e8 09 81 db ff       	call   123b9d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80f5a>
     14838cd:	48 8d bc 24 30 06 00 	lea    rdi,[rsp+0x630]
     14838d4:	00 
     14838d5:	e8 d4 3b 67 ff       	call   af74ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4444e>
     14838da:	4c 8b 64 24 60       	mov    r12,QWORD PTR [rsp+0x60]
     14838df:	4c 8d b4 24 c8 0e 00 	lea    r14,[rsp+0xec8]
     14838e6:	00 
     14838e7:	49 ff 84 24 98 01 00 	inc    QWORD PTR [r12+0x198]
     14838ee:	00 

### 0x1485bdf in 0x14851b1..0x1486a6c
     1485bb5:	48 8d b8 90 02 00 00 	lea    rdi,[rax+0x290]
     1485bbc:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     1485bc3:	00 
     1485bc4:	e8 ab 7b a5 ff       	call   edd774 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4b8a>
     1485bc9:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1485bd0:	00 
     1485bd1:	e8 a0 6e 78 ff       	call   c0ca76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x159a16>
     1485bd6:	80 bb d0 01 00 00 00 	cmp    BYTE PTR [rbx+0x1d0],0x0
     1485bdd:	74 21                	je     1485c00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb184>
     1485bdf:	4c 8d a3 b8 01 00 00 	lea    r12,[rbx+0x1b8]
     1485be6:	4c 89 e7             	mov    rdi,r12
     1485be9:	e8 64 ff 6b ff       	call   b45b52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92af2>
     1485bee:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1485bf5:	00 
     1485bf6:	4c 89 e6             	mov    rsi,r12
     1485bf9:	e8 a8 78 a5 ff       	call   edd4a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa48bc>
     1485bfe:	eb 14                	jmp    1485c14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb198>
     1485c00:	0f 57 c0             	xorps  xmm0,xmm0
     1485c03:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     1485c0a:	00 

### 0x148b70d in 0x148b1f6..0x148cfee
     148b6eb:	00 
     148b6ec:	e8 31 42 61 ff       	call   a9f922 <JNI_OnUnload@@Base+0x271ef>
     148b6f1:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     148b6f8:	00 
     148b6f9:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     148b700:	00 
     148b701:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
     148b708:	00 
     148b709:	48 8d 04 d0          	lea    rax,[rax+rdx*8]
     148b70d:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     148b714:	00 
     148b715:	bf f0 0f 00 00       	mov    edi,0xff0
     148b71a:	e8 e1 27 36 00       	call   17edf00 <_Znwm@plt>
     148b71f:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     148b726:	00 
     148b727:	48 8d 8c 24 68 01 00 	lea    rcx,[rsp+0x168]
     148b72e:	00 
     148b72f:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
     148b736:	00 
     148b737:	48 c7 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],0xcc

### 0x148b7f6 in 0x148b1f6..0x148cfee
     148b7d3:	00 
     148b7d4:	66 0f 11 84 24 40 01 	movupd XMMWORD PTR [rsp+0x140],xmm0
     148b7db:	00 00 
     148b7dd:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
     148b7e4:	00 
     148b7e5:	4c 89 bc 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r15
     148b7ec:	00 
     148b7ed:	66 0f 11 8c 24 50 01 	movupd XMMWORD PTR [rsp+0x150],xmm1
     148b7f4:	00 00 
     148b7f6:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
     148b7fd:	00 
     148b7fe:	48 8b 84 24 60 01 00 	mov    rax,QWORD PTR [rsp+0x160]
     148b805:	00 
     148b806:	4c 01 e0             	add    rax,r12
     148b809:	48 83 fe 08          	cmp    rsi,0x8
     148b80d:	6a 66                	push   0x66
     148b80f:	59                   	pop    rcx
     148b810:	48 0f 44 c1          	cmove  rax,rcx
     148b814:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
     148b81b:	00 

### 0x148bc02 in 0x148b1f6..0x148cfee
     148bbde:	e8 3f 3d 61 ff       	call   a9f922 <JNI_OnUnload@@Base+0x271ef>
     148bbe3:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     148bbea:	00 
     148bbeb:	49 01 c7             	add    r15,rax
     148bbee:	4c 89 bc 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r15
     148bbf5:	00 
     148bbf6:	4c 89 bc 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r15
     148bbfd:	00 
     148bbfe:	48 8d 04 d0          	lea    rax,[rax+rdx*8]
     148bc02:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     148bc09:	00 
     148bc0a:	bf 00 10 00 00       	mov    edi,0x1000
     148bc0f:	e8 ec 22 36 00       	call   17edf00 <_Znwm@plt>
     148bc14:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     148bc1b:	00 
     148bc1c:	48 8d 8c 24 98 01 00 	lea    rcx,[rsp+0x198]
     148bc23:	00 
     148bc24:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
     148bc2b:	00 
     148bc2c:	48 c7 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],0x100

### 0x148c9aa in 0x148b1f6..0x148cfee
     148c98c:	00 
     148c98d:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
     148c994:	00 
     148c995:	48 89 ee             	mov    rsi,rbp
     148c998:	e8 c5 2e b7 ff       	call   fff862 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c6c78>
     148c99d:	49 ff cd             	dec    r13
     148c9a0:	75 d9                	jne    148c97b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1eff>
     148c9a2:	48 8b b4 24 b0 01 00 	mov    rsi,QWORD PTR [rsp+0x1b0]
     148c9a9:	00 
     148c9aa:	48 8b 94 24 b8 01 00 	mov    rdx,QWORD PTR [rsp+0x1b8]
     148c9b1:	00 
     148c9b2:	48 8b 8c 24 a0 01 00 	mov    rcx,QWORD PTR [rsp+0x1a0]
     148c9b9:	00 
     148c9ba:	4c 8b 8c 24 a8 01 00 	mov    r9,QWORD PTR [rsp+0x1a8]
     148c9c1:	00 
     148c9c2:	48 81 7c 24 30 00 01 	cmp    QWORD PTR [rsp+0x30],0x100
     148c9c9:	00 00 
     148c9cb:	0f 82 cb 01 00 00    	jb     148cb9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d2120>
     148c9d1:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]
     148c9d8:	00 

### 0x148ce1d in 0x148b1f6..0x148cfee
     148ce05:	41 5d                	pop    r13
     148ce07:	41 5e                	pop    r14
     148ce09:	41 5f                	pop    r15
     148ce0b:	5d                   	pop    rbp
     148ce0c:	c3                   	ret
     148ce0d:	49 89 c6             	mov    r14,rax
     148ce10:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     148ce15:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
     148ce1c:	00 
     148ce1d:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     148ce24:	00 
     148ce25:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     148ce2a:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
     148ce31:	00 
     148ce32:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     148ce37:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     148ce3e:	00 
     148ce3f:	e9 a5 00 00 00       	jmp    148cee9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d246d>
     148ce44:	49 89 c6             	mov    r14,rax
     148ce47:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]

### 0x1497bc3 in 0x149769a..0x149876a
     1497ba0:	fe 
     1497ba1:	48 8d b4 24 a0 03 00 	lea    rsi,[rsp+0x3a0]
     1497ba8:	00 
     1497ba9:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     1497bad:	c6 84 24 d8 02 00 00 	mov    BYTE PTR [rsp+0x2d8],0x1
     1497bb4:	01 
     1497bb5:	f2 0f 11 4e 08       	movsd  QWORD PTR [rsi+0x8],xmm1
     1497bba:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     1497bbe:	f2 0f 11 4e 18       	movsd  QWORD PTR [rsi+0x18],xmm1
     1497bc3:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1497bca:	00 
     1497bcb:	6a 02                	push   0x2
     1497bcd:	5a                   	pop    rdx
     1497bce:	e8 5f 0f ff ff       	call   1488b32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce0b6>
     1497bd3:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
     1497bda:	00 
     1497bdb:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1497be2:	00 
     1497be3:	e8 a0 27 ff ff       	call   148a388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf90c>
     1497be8:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]

### 0x1497bdb in 0x149769a..0x149876a
     1497bba:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     1497bbe:	f2 0f 11 4e 18       	movsd  QWORD PTR [rsi+0x18],xmm1
     1497bc3:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1497bca:	00 
     1497bcb:	6a 02                	push   0x2
     1497bcd:	5a                   	pop    rdx
     1497bce:	e8 5f 0f ff ff       	call   1488b32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce0b6>
     1497bd3:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
     1497bda:	00 
     1497bdb:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1497be2:	00 
     1497be3:	e8 a0 27 ff ff       	call   148a388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf90c>
     1497be8:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
     1497bef:	00 
     1497bf0:	48 89 df             	mov    rdi,rbx
     1497bf3:	e8 ae 58 a4 ff       	call   edd4a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa48bc>
     1497bf8:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1497bff:	00 
     1497c00:	e9 0f ff ff ff       	jmp    1497b14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd098>
     1497c05:	83 fa 0d             	cmp    edx,0xd

### 0x1497bf8 in 0x149769a..0x149876a
     1497bd3:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
     1497bda:	00 
     1497bdb:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1497be2:	00 
     1497be3:	e8 a0 27 ff ff       	call   148a388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cf90c>
     1497be8:	48 8d b4 24 c0 02 00 	lea    rsi,[rsp+0x2c0]
     1497bef:	00 
     1497bf0:	48 89 df             	mov    rdi,rbx
     1497bf3:	e8 ae 58 a4 ff       	call   edd4a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa48bc>
     1497bf8:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1497bff:	00 
     1497c00:	e9 0f ff ff ff       	jmp    1497b14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd098>
     1497c05:	83 fa 0d             	cmp    edx,0xd
     1497c08:	0f 84 4a 05 00 00    	je     1498158 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd6dc>
     1497c0e:	83 fa 10             	cmp    edx,0x10
     1497c11:	0f 84 cf 04 00 00    	je     14980e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd66a>
     1497c17:	83 fa 0f             	cmp    edx,0xf
     1497c1a:	0f 85 77 02 00 00    	jne    1497e97 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dd41b>
     1497c20:	0f 57 c9             	xorps  xmm1,xmm1
     1497c23:	0f 29 8c 24 c0 02 00 	movaps XMMWORD PTR [rsp+0x2c0],xmm1

### 0x149866c in 0x149769a..0x149876a
     1498647:	e8 dc 30 5e ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     149864c:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     1498653:	00 
     1498654:	e9 df 00 00 00       	jmp    1498738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddcbc>
     1498659:	48 89 c3             	mov    rbx,rax
     149865c:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     1498663:	00 
     1498664:	e9 cf 00 00 00       	jmp    1498738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddcbc>
     1498669:	48 89 c3             	mov    rbx,rax
     149866c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1498673:	00 
     1498674:	e9 bf 00 00 00       	jmp    1498738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddcbc>
     1498679:	eb 00                	jmp    149867b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddbff>
     149867b:	48 89 c3             	mov    rbx,rax
     149867e:	eb 2e                	jmp    14986ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc32>
     1498680:	eb 00                	jmp    1498682 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc06>
     1498682:	48 89 c3             	mov    rbx,rax
     1498685:	eb 34                	jmp    14986bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc3f>
     1498687:	eb 00                	jmp    1498689 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ddc0d>
     1498689:	48 89 c3             	mov    rbx,rax

### 0x14a0f0c in 0x14a0ad4..0x14a1134
     14a0eee:	e8 31 fb ff ff       	call   14a0a24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5fa8>
     14a0ef3:	41 8a 5e 40          	mov    bl,BYTE PTR [r14+0x40]
     14a0ef7:	41 8a 6e 38          	mov    bpl,BYTE PTR [r14+0x38]
     14a0efb:	4c 89 f7             	mov    rdi,r14
     14a0efe:	e8 a5 fa ff ff       	call   14a09a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5f2c>
     14a0f03:	84 db                	test   bl,bl
     14a0f05:	74 28                	je     14a0f2f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e64b3>
     14a0f07:	40 84 ed             	test   bpl,bpl
     14a0f0a:	74 23                	je     14a0f2f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e64b3>
     14a0f0c:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     14a0f13:	00 
     14a0f14:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     14a0f19:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     14a0f1d:	48 c7 46 08 01 00 00 	mov    QWORD PTR [rsi+0x8],0x1
     14a0f24:	00 
     14a0f25:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     14a0f2a:	e8 7d 88 fe ff       	call   14897ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ced30>
     14a0f2f:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
     14a0f34:	4c 89 f7             	mov    rdi,r14
     14a0f37:	4c 89 ee             	mov    rsi,r13

### 0x14a4052 in 0x14a3fc2..0x14a4116
     14a401e:	00 
     14a401f:	83 a7 00 01 00 00 00 	and    DWORD PTR [rdi+0x100],0x0
     14a4026:	31 ed                	xor    ebp,ebp
     14a4028:	40 88 af 04 01 00 00 	mov    BYTE PTR [rdi+0x104],bpl
     14a402f:	40 88 af 08 01 00 00 	mov    BYTE PTR [rdi+0x108],bpl
     14a4036:	40 88 af 50 01 00 00 	mov    BYTE PTR [rdi+0x150],bpl
     14a403d:	40 88 af 8c 01 00 00 	mov    BYTE PTR [rdi+0x18c],bpl
     14a4044:	83 a7 ac 01 00 00 00 	and    DWORD PTR [rdi+0x1ac],0x0
     14a404b:	40 88 af b0 01 00 00 	mov    BYTE PTR [rdi+0x1b0],bpl
     14a4052:	40 88 af b8 01 00 00 	mov    BYTE PTR [rdi+0x1b8],bpl
     14a4059:	40 88 af 28 02 00 00 	mov    BYTE PTR [rdi+0x228],bpl
     14a4060:	40 88 af 30 02 00 00 	mov    BYTE PTR [rdi+0x230],bpl
     14a4067:	40 88 af 58 02 00 00 	mov    BYTE PTR [rdi+0x258],bpl
     14a406e:	40 88 af 70 02 00 00 	mov    BYTE PTR [rdi+0x270],bpl
     14a4075:	40 88 af b0 02 00 00 	mov    BYTE PTR [rdi+0x2b0],bpl
     14a407c:	66 83 a7 b8 02 00 00 	and    WORD PTR [rdi+0x2b8],0x0
     14a4083:	00 
     14a4084:	48 83 c7 70          	add    rdi,0x70
     14a4088:	40 88 ab ba 02 00 00 	mov    BYTE PTR [rbx+0x2ba],bpl
     14a408f:	40 88 ab c0 02 00 00 	mov    BYTE PTR [rbx+0x2c0],bpl

### 0x14a414a in 0x14a4116..0x14a41f3
     14a4117:	48 89 fb             	mov    rbx,rdi
     14a411a:	48 81 c7 90 02 00 00 	add    rdi,0x290
     14a4121:	e8 8c 4f 94 ff       	call   de90b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb6138>
     14a4126:	48 8d bb 78 02 00 00 	lea    rdi,[rbx+0x278]
     14a412d:	e8 5e 9d 34 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14a4132:	48 8d bb 58 02 00 00 	lea    rdi,[rbx+0x258]
     14a4139:	e8 f2 2b 60 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     14a413e:	48 8d bb 38 02 00 00 	lea    rdi,[rbx+0x238]
     14a4145:	e8 46 9d 34 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14a414a:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
     14a4151:	e8 88 eb 94 ff       	call   df2cde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbfd64>
     14a4156:	48 8d bb 90 01 00 00 	lea    rdi,[rbx+0x190]
     14a415d:	e8 c6 75 5d ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     14a4162:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
     14a4169:	e8 86 00 00 00       	call   14a41f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e9778>
     14a416e:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
     14a4175:	e8 16 9d 34 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14a417a:	48 8d bb 30 01 00 00 	lea    rdi,[rbx+0x130]
     14a4181:	e8 56 74 5d ff       	call   a7b5dc <JNI_OnUnload@@Base+0x2ea9>
     14a4186:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]

### 0x14b9c34 in 0x14b91f2..0x14ba12f
     14b9c0f:	48 85 c0             	test   rax,rax
     14b9c12:	74 05                	je     14b9c19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ff19d>
     14b9c14:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14b9c19:	4c 8d b4 24 10 02 00 	lea    r14,[rsp+0x210]
     14b9c20:	00 
     14b9c21:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     14b9c28:	00 
     14b9c29:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     14b9c2d:	49 8b 86 a8 01 00 00 	mov    rax,QWORD PTR [r14+0x1a8]
     14b9c34:	49 89 87 b8 01 00 00 	mov    QWORD PTR [r15+0x1b8],rax
     14b9c3b:	4c 8d a4 24 c0 03 00 	lea    r12,[rsp+0x3c0]
     14b9c42:	00 
     14b9c43:	4d 89 7c 24 20       	mov    QWORD PTR [r12+0x20],r15
     14b9c48:	e8 7d 06 5c ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     14b9c4d:	4c 8d 7c 24 78       	lea    r15,[rsp+0x78]
     14b9c52:	4c 8d ac 24 00 06 00 	lea    r13,[rsp+0x600]
     14b9c59:	00 
     14b9c5a:	48 89 df             	mov    rdi,rbx
     14b9c5d:	4c 89 fe             	mov    rsi,r15
     14b9c60:	4c 89 ea             	mov    rdx,r13

### 0x14ba5a1 in 0x14ba462..0x14ba783
     14ba57a:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     14ba57e:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
     14ba582:	48 89 e7             	mov    rdi,rsp
     14ba585:	e8 d0 d5 ff ff       	call   14b7b5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd0de>
     14ba58a:	49 8b 8e b0 01 00 00 	mov    rcx,QWORD PTR [r14+0x1b0]
     14ba591:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
     14ba595:	80 48 10 04          	or     BYTE PTR [rax+0x10],0x4
     14ba599:	48 89 e7             	mov    rdi,rsp
     14ba59c:	e8 e9 d5 ff ff       	call   14b7b8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd10e>
     14ba5a1:	49 8b 8e b8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1b8]
     14ba5a8:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     14ba5ac:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     14ba5b0:	48 89 e7             	mov    rdi,rsp
     14ba5b3:	e8 d2 d5 ff ff       	call   14b7b8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd10e>
     14ba5b8:	49 8b 8e c0 01 00 00 	mov    rcx,QWORD PTR [r14+0x1c0]
     14ba5bf:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     14ba5c3:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
     14ba5c7:	48 89 e7             	mov    rdi,rsp
     14ba5ca:	e8 bb d5 ff ff       	call   14b7b8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd10e>
     14ba5cf:	49 8b 8e c8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1c8]

### 0x14bac1d in 0x14bab24..0x14bae13
     14babf0:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     14babf5:	49 89 85 b0 01 00 00 	mov    QWORD PTR [r13+0x1b0],rax
     14babfc:	0f 10 44 24 58       	movups xmm0,XMMWORD PTR [rsp+0x58]
     14bac01:	41 0f 11 85 a0 01 00 	movups XMMWORD PTR [r13+0x1a0],xmm0
     14bac08:	00 
     14bac09:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
     14bac10:	00 
     14bac11:	49 89 85 c8 01 00 00 	mov    QWORD PTR [r13+0x1c8],rax
     14bac18:	0f 10 44 24 70       	movups xmm0,XMMWORD PTR [rsp+0x70]
     14bac1d:	41 0f 11 85 b8 01 00 	movups XMMWORD PTR [r13+0x1b8],xmm0
     14bac24:	00 
     14bac25:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
     14bac2c:	00 
     14bac2d:	49 89 85 e0 01 00 00 	mov    QWORD PTR [r13+0x1e0],rax
     14bac34:	0f 10 84 24 88 00 00 	movups xmm0,XMMWORD PTR [rsp+0x88]
     14bac3b:	00 
     14bac3c:	41 0f 11 85 d0 01 00 	movups XMMWORD PTR [r13+0x1d0],xmm0
     14bac43:	00 
     14bac44:	0f 10 84 24 a0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xa0]
     14bac4b:	00 

### 0x14bacbc in 0x14bab24..0x14bae13
     14bac8f:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     14bac94:	49 89 85 b0 01 00 00 	mov    QWORD PTR [r13+0x1b0],rax
     14bac9b:	0f 10 44 24 58       	movups xmm0,XMMWORD PTR [rsp+0x58]
     14baca0:	41 0f 11 85 a0 01 00 	movups XMMWORD PTR [r13+0x1a0],xmm0
     14baca7:	00 
     14baca8:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
     14bacaf:	00 
     14bacb0:	49 89 85 c8 01 00 00 	mov    QWORD PTR [r13+0x1c8],rax
     14bacb7:	0f 10 44 24 70       	movups xmm0,XMMWORD PTR [rsp+0x70]
     14bacbc:	41 0f 11 85 b8 01 00 	movups XMMWORD PTR [r13+0x1b8],xmm0
     14bacc3:	00 
     14bacc4:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
     14baccb:	00 
     14baccc:	49 89 85 e0 01 00 00 	mov    QWORD PTR [r13+0x1e0],rax
     14bacd3:	0f 10 84 24 88 00 00 	movups xmm0,XMMWORD PTR [rsp+0x88]
     14bacda:	00 
     14bacdb:	41 0f 11 85 d0 01 00 	movups XMMWORD PTR [r13+0x1d0],xmm0
     14bace2:	00 
     14bace3:	0f 10 84 24 a0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xa0]
     14bacea:	00 

### 0x14bb0a3 in 0x14bb042..0x14bb90c
     14bb078:	4c 8b 66 18          	mov    r12,QWORD PTR [rsi+0x18]
     14bb07c:	bf 40 03 00 00       	mov    edi,0x340
     14bb081:	e8 7a 2e 33 00       	call   17edf00 <_Znwm@plt>
     14bb086:	48 89 c3             	mov    rbx,rax
     14bb089:	66 0f ef c0          	pxor   xmm0,xmm0
     14bb08d:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14bb092:	48 8d 05 2f fd 34 00 	lea    rax,[rip+0x34fd2f]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     14bb099:	48 89 03             	mov    QWORD PTR [rbx],rax
     14bb09c:	41 8b af a0 01 00 00 	mov    ebp,DWORD PTR [r15+0x1a0]
     14bb0a3:	49 8b 87 b8 01 00 00 	mov    rax,QWORD PTR [r15+0x1b8]
     14bb0aa:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     14bb0b1:	00 
     14bb0b2:	48 8d 35 4b 65 ec fe 	lea    rsi,[rip+0xfffffffffeec654b]        # 381604 <_ZTSSt12bad_any_cast@@Base-0xebc4>
     14bb0b9:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     14bb0c0:	00 
     14bb0c1:	e8 b8 e9 5b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14bb0c6:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     14bb0cb:	4c 89 b4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r14
     14bb0d2:	00 
     14bb0d3:	48 8d 7b 20          	lea    rdi,[rbx+0x20]

### 0x14bc73a in 0x14bc4aa..0x14bda9d
     14bc70f:	4d 89 77 08          	mov    QWORD PTR [r15+0x8],r14
     14bc713:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
     14bc717:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
     14bc71b:	45 8a ae 70 01 00 00 	mov    r13b,BYTE PTR [r14+0x170]
     14bc722:	48 8d bc 24 b0 09 00 	lea    rdi,[rsp+0x9b0]
     14bc729:	00 
     14bc72a:	e8 61 db 5b ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14bc72f:	49 81 c4 98 0d 00 00 	add    r12,0xd98
     14bc736:	49 8d 7e 58          	lea    rdi,[r14+0x58]
     14bc73a:	4d 8d 96 b8 01 00 00 	lea    r10,[r14+0x1b8]
     14bc741:	49 8d 86 28 02 00 00 	lea    rax,[r14+0x228]
     14bc748:	45 8b 9e b0 01 00 00 	mov    r11d,DWORD PTR [r14+0x1b0]
     14bc74f:	41 8b ae b4 01 00 00 	mov    ebp,DWORD PTR [r14+0x1b4]
     14bc756:	49 81 c6 40 02 00 00 	add    r14,0x240
     14bc75d:	45 0f b6 ed          	movzx  r13d,r13b
     14bc761:	6a 04                	push   0x4
     14bc763:	59                   	pop    rcx
     14bc764:	4c 8d 84 24 f0 04 00 	lea    r8,[rsp+0x4f0]
     14bc76b:	00 
     14bc76c:	4c 89 e6             	mov    rsi,r12

### 0x14bd60c in 0x14bc4aa..0x14bda9d
     14bd5ee:	00 
     14bd5ef:	e8 9c 08 33 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14bd5f4:	45 84 ff             	test   r15b,r15b
     14bd5f7:	0f 84 98 00 00 00    	je     14bd695 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x302c19>
     14bd5fd:	40 b5 01             	mov    bpl,0x1
     14bd600:	45 84 f6             	test   r14b,r14b
     14bd603:	75 17                	jne    14bd61c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x302ba0>
     14bd605:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     14bd609:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14bd60c:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
     14bd612:	84 c0                	test   al,al
     14bd614:	0f 85 80 00 00 00    	jne    14bd69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x302c1e>
     14bd61a:	31 ed                	xor    ebp,ebp
     14bd61c:	48 8d 05 73 e2 1a 00 	lea    rax,[rip+0x1ae273]        # 166b896 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa02>
     14bd623:	48 89 84 24 60 09 00 	mov    QWORD PTR [rsp+0x960],rax
     14bd62a:	00 
     14bd62b:	48 83 a4 24 68 09 00 	and    QWORD PTR [rsp+0x968],0x0
     14bd632:	00 00 
     14bd634:	48 8d 35 0e 73 ec fe 	lea    rsi,[rip+0xfffffffffeec730e]        # 384949 <_ZTSSt12bad_any_cast@@Base-0xb87f>
     14bd63b:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]

### 0x14bdba0 in 0x14bda9e..0x14bdcd8
     14bdb77:	4c 89 65 10          	mov    QWORD PTR [rbp+0x10],r12
     14bdb7b:	48 89 6d 20          	mov    QWORD PTR [rbp+0x20],rbp
     14bdb7f:	41 8a 9d 70 01 00 00 	mov    bl,BYTE PTR [r13+0x170]
     14bdb86:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     14bdb8b:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
     14bdb8f:	e8 fc c6 5b ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14bdb94:	49 8d b4 24 98 0d 00 	lea    rsi,[r12+0xd98]
     14bdb9b:	00 
     14bdb9c:	49 8d 7d 58          	lea    rdi,[r13+0x58]
     14bdba0:	49 8d 85 b8 01 00 00 	lea    rax,[r13+0x1b8]
     14bdba7:	49 8d 8d 28 02 00 00 	lea    rcx,[r13+0x228]
     14bdbae:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
     14bdbb2:	45 8b 9d b0 01 00 00 	mov    r11d,DWORD PTR [r13+0x1b0]
     14bdbb9:	45 8b 95 b4 01 00 00 	mov    r10d,DWORD PTR [r13+0x1b4]
     14bdbc0:	49 81 c5 40 02 00 00 	add    r13,0x240
     14bdbc7:	0f b6 db             	movzx  ebx,bl
     14bdbca:	4c 8d 44 24 78       	lea    r8,[rsp+0x78]
     14bdbcf:	4c 89 f2             	mov    rdx,r14
     14bdbd2:	31 c9                	xor    ecx,ecx
     14bdbd4:	4c 8b 4c 24 08       	mov    r9,QWORD PTR [rsp+0x8]

### 0x14c2233 in 0x14c20c4..0x14c235e
     14c2203:	48 8d ab 80 01 00 00 	lea    rbp,[rbx+0x180]
     14c220a:	48 89 ef             	mov    rdi,rbp
     14c220d:	e8 7e 80 5b ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14c2212:	8b 84 24 80 00 00 00 	mov    eax,DWORD PTR [rsp+0x80]
     14c2219:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]
     14c221e:	4c 8b 74 24 58       	mov    r14,QWORD PTR [rsp+0x58]
     14c2223:	89 83 b0 01 00 00    	mov    DWORD PTR [rbx+0x1b0],eax
     14c2229:	83 a3 b4 01 00 00 00 	and    DWORD PTR [rbx+0x1b4],0x0
     14c2230:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     14c2233:	48 89 83 b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],rax
     14c223a:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
     14c223e:	48 89 83 c0 01 00 00 	mov    QWORD PTR [rbx+0x1c0],rax
     14c2245:	48 85 c0             	test   rax,rax
     14c2248:	74 05                	je     14c224f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3077d3>
     14c224a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14c224f:	0f 57 c0             	xorps  xmm0,xmm0
     14c2252:	0f 11 83 c8 01 00 00 	movups XMMWORD PTR [rbx+0x1c8],xmm0
     14c2259:	48 83 a3 d8 01 00 00 	and    QWORD PTR [rbx+0x1d8],0x0
     14c2260:	00 
     14c2261:	4c 8d bb e0 01 00 00 	lea    r15,[rbx+0x1e0]

### 0x14c5c21 in 0x14c5b40..0x14c5d4d
     14c5bf3:	0f 11 45 08          	movups XMMWORD PTR [rbp+0x8],xmm0
     14c5bf7:	48 89 6d 20          	mov    QWORD PTR [rbp+0x20],rbp
     14c5bfb:	41 8a 9d 70 01 00 00 	mov    bl,BYTE PTR [r13+0x170]
     14c5c02:	49 8d b5 80 01 00 00 	lea    rsi,[r13+0x180]
     14c5c09:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
     14c5c10:	00 
     14c5c11:	e8 7a 46 5b ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14c5c16:	49 81 c4 98 0d 00 00 	add    r12,0xd98
     14c5c1d:	49 8d 7d 58          	lea    rdi,[r13+0x58]
     14c5c21:	4d 8d 95 b8 01 00 00 	lea    r10,[r13+0x1b8]
     14c5c28:	49 8d 85 28 02 00 00 	lea    rax,[r13+0x228]
     14c5c2f:	45 8b 9d b0 01 00 00 	mov    r11d,DWORD PTR [r13+0x1b0]
     14c5c36:	45 8b b5 b4 01 00 00 	mov    r14d,DWORD PTR [r13+0x1b4]
     14c5c3d:	49 81 c5 40 02 00 00 	add    r13,0x240
     14c5c44:	0f b6 db             	movzx  ebx,bl
     14c5c47:	48 8d 54 24 40       	lea    rdx,[rsp+0x40]
     14c5c4c:	4c 8d 84 24 38 05 00 	lea    r8,[rsp+0x538]
     14c5c53:	00 
     14c5c54:	4c 89 e6             	mov    rsi,r12
     14c5c57:	8b 4c 24 0c          	mov    ecx,DWORD PTR [rsp+0xc]

### 0x14cf20f in 0x14cdc2a..0x14d4d4c
     14cf1df:	41 88 85 90 01 00 00 	mov    BYTE PTR [r13+0x190],al
     14cf1e6:	49 8d bd 98 01 00 00 	lea    rdi,[r13+0x198]
     14cf1ed:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
     14cf1f2:	48 8d b4 24 b8 02 00 	lea    rsi,[rsp+0x2b8]
     14cf1f9:	00 
     14cf1fa:	e8 41 ed 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14cf1ff:	8a 84 24 d0 02 00 00 	mov    al,BYTE PTR [rsp+0x2d0]
     14cf206:	41 88 85 b0 01 00 00 	mov    BYTE PTR [r13+0x1b0],al
     14cf20d:	31 c0                	xor    eax,eax
     14cf20f:	41 88 85 b8 01 00 00 	mov    BYTE PTR [r13+0x1b8],al
     14cf216:	41 88 85 c0 01 00 00 	mov    BYTE PTR [r13+0x1c0],al
     14cf21d:	41 88 85 f0 01 00 00 	mov    BYTE PTR [r13+0x1f0],al
     14cf224:	4d 8d b5 f8 01 00 00 	lea    r14,[r13+0x1f8]
     14cf22b:	4c 89 f7             	mov    rdi,r14
     14cf22e:	e8 cf ab 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14cf233:	49 8d 9d 50 02 00 00 	lea    rbx,[r13+0x250]
     14cf23a:	48 89 df             	mov    rdi,rbx
     14cf23d:	e8 c0 ab 30 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     14cf242:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
     14cf249:	00 

### 0x14cf5d6 in 0x14cdc2a..0x14d4d4c
     14cf5ae:	48 8b 84 24 b8 03 00 	mov    rax,QWORD PTR [rsp+0x3b8]
     14cf5b5:	00 
     14cf5b6:	48 85 c0             	test   rax,rax
     14cf5b9:	48 8d 35 08 a5 46 00 	lea    rsi,[rip+0x46a508]        # 1939ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x2710>
     14cf5c0:	48 0f 45 f0          	cmovne rsi,rax
     14cf5c4:	83 7e 20 00          	cmp    DWORD PTR [rsi+0x20],0x0
     14cf5c8:	0f 84 0c 01 00 00    	je     14cf6da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x314c5e>
     14cf5ce:	4c 89 ef             	mov    rdi,r13
     14cf5d1:	e8 ac 48 03 00       	call   1503e82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349406>
     14cf5d6:	41 c6 85 b8 01 00 00 	mov    BYTE PTR [r13+0x1b8],0x1
     14cf5dd:	01 
     14cf5de:	e8 6d eb 31 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
     14cf5e3:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     14cf5e8:	e8 73 eb 31 00       	call   17ee160 <_ZNSt6__ndk16chrono12steady_clock3nowEv@plt>
     14cf5ed:	49 89 c6             	mov    r14,rax
     14cf5f0:	e8 5b eb 31 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
     14cf5f5:	48 89 c5             	mov    rbp,rax
     14cf5f8:	48 8d 35 7d 29 f8 fe 	lea    rsi,[rip+0xfffffffffef8297d]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     14cf5ff:	48 8d 0d bc 61 e5 fe 	lea    rcx,[rip+0xfffffffffee561bc]        # 3257c2 <_ZTSSt12bad_any_cast@@Base-0x6aa06>
     14cf606:	6a 04                	push   0x4

### 0x14d20e9 in 0x14cdc2a..0x14d4d4c
     14d20bd:	e8 7e be 31 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14d20c2:	4d 8d 7c 24 20       	lea    r15,[r12+0x20]
     14d20c7:	66 0f ef c0          	pxor   xmm0,xmm0
     14d20cb:	f3 41 0f 7f 84 24 e8 	movdqu XMMWORD PTR [r12+0x1e8],xmm0
     14d20d2:	01 00 00 
     14d20d5:	f3 41 0f 7f 84 24 d8 	movdqu XMMWORD PTR [r12+0x1d8],xmm0
     14d20dc:	01 00 00 
     14d20df:	f3 41 0f 7f 84 24 c8 	movdqu XMMWORD PTR [r12+0x1c8],xmm0
     14d20e6:	01 00 00 
     14d20e9:	f3 41 0f 7f 84 24 b8 	movdqu XMMWORD PTR [r12+0x1b8],xmm0
     14d20f0:	01 00 00 
     14d20f3:	4d 8b 74 24 48       	mov    r14,QWORD PTR [r12+0x48]
     14d20f8:	4c 8d 84 24 10 02 00 	lea    r8,[rsp+0x210]
     14d20ff:	00 
     14d2100:	4d 89 38             	mov    QWORD PTR [r8],r15
     14d2103:	48 8d 35 87 af 5c ff 	lea    rsi,[rip+0xffffffffff5caf87]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14d210a:	48 8d 0d 1b 24 02 00 	lea    rcx,[rip+0x2241b]        # 14f452c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339ab0>
     14d2111:	4c 8d ac 24 e0 02 00 	lea    r13,[rsp+0x2e0]
     14d2118:	00 
     14d2119:	6a 08                	push   0x8

### 0x14d3211 in 0x14cdc2a..0x14d4d4c
     14d31e5:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     14d31ea:	49 8d be c0 01 00 00 	lea    rdi,[r14+0x1c0]
     14d31f1:	48 8d 9c 24 e0 02 00 	lea    rbx,[rsp+0x2e0]
     14d31f8:	00 
     14d31f9:	48 89 de             	mov    rsi,rbx
     14d31fc:	e8 1b 66 5e ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     14d3201:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     14d3205:	e8 7c b2 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d320a:	8a 84 24 98 00 00 00 	mov    al,BYTE PTR [rsp+0x98]
     14d3211:	41 88 86 b8 01 00 00 	mov    BYTE PTR [r14+0x1b8],al
     14d3218:	bf 80 00 00 00       	mov    edi,0x80
     14d321d:	e8 de ac 31 00       	call   17edf00 <_Znwm@plt>
     14d3222:	49 89 c6             	mov    r14,rax
     14d3225:	66 0f ef c0          	pxor   xmm0,xmm0
     14d3229:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     14d322e:	48 8d 05 33 a2 32 00 	lea    rax,[rip+0x32a233]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     14d3235:	49 89 06             	mov    QWORD PTR [r14],rax
     14d3238:	48 8d 05 79 66 3a 00 	lea    rax,[rip+0x3a6679]        # 18798b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35fa0>
     14d323f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     14d3243:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]

### 0x14d3d5c in 0x14cdc2a..0x14d4d4c
     14d3d34:	e8 e3 a6 5c ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     14d3d39:	e9 ae 0c 00 00       	jmp    14d49ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319f70>
     14d3d3e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d3d43:	e9 a4 0c 00 00       	jmp    14d49ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x319f70>
     14d3d48:	eb 00                	jmp    14d3d4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3192ce>
     14d3d4a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14d3d4f:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
     14d3d56:	00 
     14d3d57:	e8 8c 6a 30 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     14d3d5c:	4d 8d b4 24 b8 01 00 	lea    r14,[r12+0x1b8]
     14d3d63:	00 
     14d3d64:	4c 89 e7             	mov    rdi,r12
     14d3d67:	48 81 c7 f0 01 00 00 	add    rdi,0x1f0
     14d3d6e:	e8 23 09 02 00       	call   14f4696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339c1a>
     14d3d73:	49 8b bc 24 e8 01 00 	mov    rdi,QWORD PTR [r12+0x1e8]
     14d3d7a:	00 
     14d3d7b:	e8 06 a7 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d3d80:	49 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [r12+0x1d8]
     14d3d87:	00 
     14d3d88:	e8 f9 a6 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x14dcbc8 in 0x14dcba2..0x14dcce1
     14dcba6:	53                   	push   rbx
     14dcba7:	48 83 ec 70          	sub    rsp,0x70
     14dcbab:	49 89 f6             	mov    r14,rsi
     14dcbae:	48 89 fb             	mov    rbx,rdi
     14dcbb1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14dcbb8:	00 00 
     14dcbba:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     14dcbbf:	48 8b 7f 58          	mov    rdi,QWORD PTR [rdi+0x58]
     14dcbc3:	e8 22 01 00 00       	call   14dccea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32226e>
     14dcbc8:	80 bb b8 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b8],0x0
     14dcbcf:	0f 85 9d 00 00 00    	jne    14dcc72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3221f6>
     14dcbd5:	49 89 e7             	mov    r15,rsp
     14dcbd8:	4c 89 ff             	mov    rdi,r15
     14dcbdb:	4c 89 f6             	mov    rsi,r14
     14dcbde:	e8 bd 1a 31 00       	call   17ee6a0 <_ZNSt6__ndk19to_stringEx@plt>
     14dcbe3:	48 8d 35 89 b7 e9 fe 	lea    rsi,[rip+0xfffffffffee9b789]        # 378373 <_ZTSSt12bad_any_cast@@Base-0x17e55>
     14dcbea:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     14dcbef:	4c 89 fa             	mov    rdx,r15
     14dcbf2:	e8 a2 91 5d ff       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
     14dcbf7:	48 8d 15 62 d6 e7 fe 	lea    rdx,[rip+0xfffffffffee7d662]        # 35a260 <_ZTSSt12bad_any_cast@@Base-0x35f68>

### 0x14dcdf8 in 0x14dcdee..0x14dce0b
     14dcdd7:	00 00 
     14dcdd9:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     14dcdde:	75 08                	jne    14dcde8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32236c>
     14dcde0:	48 89 df             	mov    rdi,rbx
     14dcde3:	e8 e8 2e 59 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14dcde8:	e8 c3 2c 31 00       	call   17efab0 <__stack_chk_fail@plt>
     14dcded:	cc                   	int3
     14dcdee:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     14dcdf1:	48 8b 87 c0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1c0]
     14dcdf8:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     14dcdff:	48 81 c7 60 01 00 00 	add    rdi,0x160
     14dce06:	e9 9d bc 64 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14dce0b:	cc                   	int3
     14dce0c:	49 89 f0             	mov    r8,rsi
     14dce0f:	48 8d 35 7b 02 5c ff 	lea    rsi,[rip+0xffffffffff5c027b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     14dce16:	48 8d 0d 0b 00 00 00 	lea    rcx,[rip+0xb]        # 14dce28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3223ac>
     14dce1d:	6a 08                	push   0x8
     14dce1f:	41 59                	pop    r9
     14dce21:	31 d2                	xor    edx,edx
     14dce23:	e9 6c d9 2f 00       	jmp    17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>

### 0x14e16bf in 0x14e15e4..0x14e16e6
     14e1681:	0f 11 83 a0 01 00 00 	movups XMMWORD PTR [rbx+0x1a0],xmm0
     14e1688:	0f 11 83 28 01 00 00 	movups XMMWORD PTR [rbx+0x128],xmm0
     14e168f:	0f 11 83 38 01 00 00 	movups XMMWORD PTR [rbx+0x138],xmm0
     14e1696:	0f 11 83 48 01 00 00 	movups XMMWORD PTR [rbx+0x148],xmm0
     14e169d:	0f 11 83 58 01 00 00 	movups XMMWORD PTR [rbx+0x158],xmm0
     14e16a4:	0f 11 83 68 01 00 00 	movups XMMWORD PTR [rbx+0x168],xmm0
     14e16ab:	0f 11 83 78 01 00 00 	movups XMMWORD PTR [rbx+0x178],xmm0
     14e16b2:	83 a3 88 01 00 00 00 	and    DWORD PTR [rbx+0x188],0x0
     14e16b9:	89 ab b0 01 00 00    	mov    DWORD PTR [rbx+0x1b0],ebp
     14e16bf:	44 88 b3 b8 01 00 00 	mov    BYTE PTR [rbx+0x1b8],r14b
     14e16c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14e16cd:	00 00 
     14e16cf:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     14e16d4:	75 0b                	jne    14e16e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x326c65>
     14e16d6:	48 83 c4 48          	add    rsp,0x48
     14e16da:	5b                   	pop    rbx
     14e16db:	41 5e                	pop    r14
     14e16dd:	41 5f                	pop    r15
     14e16df:	5d                   	pop    rbp
     14e16e0:	c3                   	ret

### 0x14e248d in 0x14e248a..0x14e24b8
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

### 0x14edbef in 0x14edbc8..0x14edc11
     14edbcf:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     14edbd3:	48 8d 35 bc a2 e7 fe 	lea    rsi,[rip+0xfffffffffee7a2bc]        # 367e96 <_ZTSSt12bad_any_cast@@Base-0x28332>
     14edbda:	4c 89 f7             	mov    rdi,r14
     14edbdd:	e8 6d dc 58 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     14edbe2:	84 c0                	test   al,al
     14edbe4:	74 23                	je     14edc09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33318d>
     14edbe6:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     14edbea:	48 85 c0             	test   rax,rax
     14edbed:	74 1a                	je     14edc09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33318d>
     14edbef:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     14edbf6:	48 83 c3 68          	add    rbx,0x68
     14edbfa:	48 89 df             	mov    rdi,rbx
     14edbfd:	48 83 c4 08          	add    rsp,0x8
     14edc01:	5b                   	pop    rbx
     14edc02:	41 5e                	pop    r14
     14edc04:	e9 9f ae 63 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14edc09:	48 83 c4 08          	add    rsp,0x8
     14edc0d:	5b                   	pop    rbx
     14edc0e:	41 5e                	pop    r14
     14edc10:	c3                   	ret

### 0x14ef9ca in 0x14ef972..0x14efc1d
     14ef9a6:	00 00 
     14ef9a8:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
     14ef9af:	00 
     14ef9b0:	48 8d 35 51 97 f4 fe 	lea    rsi,[rip+0xfffffffffef49751]        # 439108 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb57>
     14ef9b7:	4c 89 ef             	mov    rdi,r13
     14ef9ba:	e8 2f fd 5a ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     14ef9bf:	88 44 24 0b          	mov    BYTE PTR [rsp+0xb],al
     14ef9c3:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     14ef9c6:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     14ef9ca:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
     14ef9d1:	00 
     14ef9d2:	48 89 df             	mov    rdi,rbx
     14ef9d5:	e8 76 da de ff       	call   12dd450 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1229d4>
     14ef9da:	48 89 df             	mov    rdi,rbx
     14ef9dd:	e8 58 a3 ff ff       	call   14e9d3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32f2be>
     14ef9e2:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
     14ef9e6:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
     14ef9ed:	00 
     14ef9ee:	48 8d 35 d2 a0 ff ff 	lea    rsi,[rip+0xffffffffffffa0d2]        # 14e9ac7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32f04b>
     14ef9f5:	e8 f0 7e f7 ff       	call   14678ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ace6e>

### 0x14efb74 in 0x14ef972..0x14efc1d
     14efb49:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     14efb50:	00 
     14efb51:	e8 aa ee f5 ff       	call   144ea00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x293f84>
     14efb56:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14efb5b:	e8 d0 71 5b ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     14efb60:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14efb65:	e8 26 e3 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14efb6a:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     14efb6f:	e8 8c ee f5 ff       	call   144ea00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x293f84>
     14efb74:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     14efb7b:	00 
     14efb7c:	e8 e5 2a 5f ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     14efb81:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14efb88:	00 00 
     14efb8a:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
     14efb91:	00 
     14efb92:	0f 85 80 00 00 00    	jne    14efc18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33519c>
     14efb98:	48 81 c4 e8 01 00 00 	add    rsp,0x1e8
     14efb9f:	5b                   	pop    rbx
     14efba0:	41 5c                	pop    r12

### 0x14efbf0 in 0x14ef972..0x14efc1d
     14efbca:	48 89 c3             	mov    rbx,rax
     14efbcd:	eb 21                	jmp    14efbf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x335174>
     14efbcf:	48 89 c3             	mov    rbx,rax
     14efbd2:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14efbd7:	e8 54 71 5b ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     14efbdc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14efbe1:	e8 aa e2 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14efbe6:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     14efbeb:	e8 10 ee f5 ff       	call   144ea00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x293f84>
     14efbf0:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     14efbf7:	00 
     14efbf8:	e8 69 2a 5f ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     14efbfd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14efc04:	00 00 
     14efc06:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
     14efc0d:	00 
     14efc0e:	75 08                	jne    14efc18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33519c>
     14efc10:	48 89 df             	mov    rdi,rbx
     14efc13:	e8 b8 00 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14efc18:	e8 93 fe 2f 00       	call   17efab0 <__stack_chk_fail@plt>

### 0x14f7253 in 0x14f69f0..0x14f78a8
     14f722a:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     14f722e:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
     14f7233:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     14f7238:	e8 5e bc 2c 00       	call   17c2e9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177007>
     14f723d:	84 c0                	test   al,al
     14f723f:	0f 84 1d 01 00 00    	je     14f7362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33c8e6>
     14f7245:	80 bc 24 b0 01 00 00 	cmp    BYTE PTR [rsp+0x1b0],0x7
     14f724c:	07 
     14f724d:	0f 85 0f 01 00 00    	jne    14f7362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33c8e6>
     14f7253:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     14f725a:	00 
     14f725b:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
     14f7262:	00 
     14f7263:	48 8d 15 e6 40 e8 fe 	lea    rdx,[rip+0xfffffffffee840e6]        # 37b350 <_ZTSSt12bad_any_cast@@Base-0x14e78>
     14f726a:	e8 e7 d7 2c 00       	call   17c4a56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178bc2>
     14f726f:	84 c0                	test   al,al
     14f7271:	0f 84 eb 00 00 00    	je     14f7362 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33c8e6>
     14f7277:	48 8d 35 d2 40 e8 fe 	lea    rsi,[rip+0xfffffffffee840d2]        # 37b350 <_ZTSSt12bad_any_cast@@Base-0x14e78>
     14f727e:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     14f7285:	00 

### 0x14f759b in 0x14f69f0..0x14f78a8
     14f7576:	e8 d4 33 5f ff       	call   aea94f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x378ef>
     14f757b:	48 8d 9c 24 b0 02 00 	lea    rbx,[rsp+0x2b0]
     14f7582:	00 
     14f7583:	48 89 df             	mov    rdi,rbx
     14f7586:	e8 05 69 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14f758b:	4c 8d b4 24 60 02 00 	lea    r14,[rsp+0x260]
     14f7592:	00 
     14f7593:	4c 89 f7             	mov    rdi,r14
     14f7596:	e8 f5 68 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14f759b:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     14f75a2:	00 
     14f75a3:	48 8b bd b0 00 00 00 	mov    rdi,QWORD PTR [rbp+0xb0]
     14f75aa:	31 c0                	xor    eax,eax
     14f75ac:	88 03                	mov    BYTE PTR [rbx],al
     14f75ae:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
     14f75b1:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
     14f75b6:	48 8d 94 24 b0 02 00 	lea    rdx,[rsp+0x2b0]
     14f75bd:	00 
     14f75be:	48 8d 8c 24 60 02 00 	lea    rcx,[rsp+0x260]
     14f75c5:	00 

### 0x14f80b6 in 0x14f806c..0x14f819e
     14f808c:	48 8b bb c0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1c0]
     14f8093:	48 85 ff             	test   rdi,rdi
     14f8096:	74 06                	je     14f809e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d622>
     14f8098:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14f809b:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14f809e:	48 8d bb d0 01 00 00 	lea    rdi,[rbx+0x1d0]
     14f80a5:	e8 ec c5 ff ff       	call   14f4696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339c1a>
     14f80aa:	48 8b bb c8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1c8]
     14f80b1:	e8 d0 63 5a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14f80b6:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]
     14f80bd:	e8 c4 63 5a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14f80c2:	48 8d bb 98 01 00 00 	lea    rdi,[rbx+0x198]
     14f80c9:	e8 c2 5d 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14f80ce:	48 8d bb 80 01 00 00 	lea    rdi,[rbx+0x180]
     14f80d5:	e8 b6 5d 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14f80da:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
     14f80e1:	e8 3c 09 66 ff       	call   b58a22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59c2>
     14f80e6:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
     14f80ed:	e8 30 09 66 ff       	call   b58a22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa59c2>
     14f80f2:	48 8d bb 68 01 00 00 	lea    rdi,[rbx+0x168]

### 0x14fad7e in 0x14faad2..0x14fb0ea
     14fad57:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     14fad5e:	00 
     14fad5f:	89 47 f8             	mov    DWORD PTR [rdi-0x8],eax
     14fad62:	48 8d 73 70          	lea    rsi,[rbx+0x70]
     14fad66:	e8 43 2d f6 ff       	call   145daae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a3032>
     14fad6b:	48 8b 83 b8 00 00 00 	mov    rax,QWORD PTR [rbx+0xb8]
     14fad72:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
     14fad79:	00 
     14fad7a:	48 89 46 68          	mov    QWORD PTR [rsi+0x68],rax
     14fad7e:	4c 8d b4 24 b8 01 00 	lea    r14,[rsp+0x1b8]
     14fad85:	00 
     14fad86:	4c 89 f7             	mov    rdi,r14
     14fad89:	e8 2e 93 ff ff       	call   14f40bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x339640>
     14fad8e:	41 c6 46 70 01       	mov    BYTE PTR [r14+0x70],0x1
     14fad93:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14fad97:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
     14fad9b:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     14fad9f:	48 85 c0             	test   rax,rax
     14fada2:	74 05                	je     14fada9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34032d>
     14fada4:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]

### 0x14faebf in 0x14faad2..0x14fb0ea
     14faea0:	41 52                	push   r10
     14faea2:	41 52                	push   r10
     14faea4:	ff d0                	call   rax
     14faea6:	48 83 c4 20          	add    rsp,0x20
     14faeaa:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     14faeb1:	00 
     14faeb2:	e8 b3 f0 57 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     14faeb7:	48 89 e7             	mov    rdi,rsp
     14faeba:	e8 55 02 00 00       	call   14fb114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x340698>
     14faebf:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     14faec6:	00 
     14faec7:	e8 a6 8a ff ff       	call   14f3972 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338ef6>
     14faecc:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     14faed3:	00 
     14faed4:	e8 a5 8a ff ff       	call   14f397e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338f02>
     14faed9:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     14faede:	e8 ad 2f 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14faee3:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     14faee8:	e8 a3 2f 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14faeed:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]

### 0x14fafb5 in 0x14faad2..0x14fb0ea
     14faf94:	e8 7b 01 00 00       	call   14fb114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x340698>
     14faf99:	eb 1a                	jmp    14fafb5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x340539>
     14faf9b:	48 89 c3             	mov    rbx,rax
     14faf9e:	4c 89 ff             	mov    rdi,r15
     14fafa1:	e8 ea 2e 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14fafa6:	eb 03                	jmp    14fafab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34052f>
     14fafa8:	48 89 c3             	mov    rbx,rax
     14fafab:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     14fafb0:	e8 fd 34 5a ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     14fafb5:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     14fafbc:	00 
     14fafbd:	e8 b0 89 ff ff       	call   14f3972 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338ef6>
     14fafc2:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     14fafc9:	00 
     14fafca:	e8 af 89 ff ff       	call   14f397e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338f02>
     14fafcf:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     14fafd4:	e8 b7 2e 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14fafd9:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     14fafde:	e8 ad 2e 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14fafe3:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]

