# Inner ad-object vtable resolution

Candidate address point: 0x1879950
Builder calls through owner+0x438 at vtable slots +0xd0, +0xd8, +0xe0.

## Raw bytes around candidate vtable

/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64

Contents of section .data.rel.ro:
 1879900 00000000 00000000 00000000 00000000  ................
 1879910 00000000 00000000 00000000 00000000  ................
 1879920 00000000 00000000 00000000 00000000  ................
 1879930 00000000 00000000 00000000 00000000  ................
 1879940 00000000 00000000 00000000 00000000  ................
 1879950 00000000 00000000 00000000 00000000  ................
 1879960 00000000 00000000 00000000 00000000  ................
 1879970 00000000 00000000 00000000 00000000  ................
 1879980 00000000 00000000 00000000 00000000  ................
 1879990 00000000 00000000 00000000 00000000  ................
 18799a0 00000000 00000000 00000000 00000000  ................
 18799b0 00000000 00000000 00000000 00000000  ................
 18799c0 00000000 00000000 00000000 00000000  ................
 18799d0 00000000 00000000 00000000 00000000  ................
 18799e0 00000000 00000000 00000000 00000000  ................
 18799f0 00000000 00000000 00000000 00000000  ................
 1879a00 00000000 00000000 00000000 00000000  ................
 1879a10 00000000 00000000 00000000 00000000  ................
 1879a20 00000000 00000000 00000000 00000000  ................
 1879a30 00000000 00000000 00000000 00000000  ................
 1879a40 00000000 00000000 00000000 00000000  ................
 1879a50 00000000 00000000 00000000 00000000  ................

## Relocations in candidate vtable range
0000000001879900  0000000000000008 R_X86_64_RELATIVE                         14e0f5c
0000000001879908  0000000000000008 R_X86_64_RELATIVE                         14e0fa2
0000000001879920  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001879928  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001879930  0000000000000008 R_X86_64_RELATIVE                         aeb7c0
0000000001879938  0000000000000008 R_X86_64_RELATIVE                         14e0e68
0000000001879950  0000000000000008 R_X86_64_RELATIVE                         1455804
0000000001879958  0000000000000008 R_X86_64_RELATIVE                         14e16e6
0000000001879960  0000000000000008 R_X86_64_RELATIVE                         a10ec0
0000000001879968  0000000000000008 R_X86_64_RELATIVE                         14e16f8
0000000001879970  0000000000000008 R_X86_64_RELATIVE                         14e1702
0000000001879978  0000000000000008 R_X86_64_RELATIVE                         14e194e
0000000001879980  0000000000000008 R_X86_64_RELATIVE                         14e19e8
0000000001879988  0000000000000008 R_X86_64_RELATIVE                         14e1a82
0000000001879990  0000000000000008 R_X86_64_RELATIVE                         14e1a98
0000000001879998  0000000000000008 R_X86_64_RELATIVE                         14e1d2c
00000000018799a0  0000000000000008 R_X86_64_RELATIVE                         14e1d38
00000000018799a8  0000000000000008 R_X86_64_RELATIVE                         14e1d4a
00000000018799b0  0000000000000008 R_X86_64_RELATIVE                         14e1d5c
00000000018799b8  0000000000000008 R_X86_64_RELATIVE                         14e1d9c
00000000018799c0  0000000000000008 R_X86_64_RELATIVE                         14e1f16
00000000018799c8  0000000000000008 R_X86_64_RELATIVE                         14e1f2e
00000000018799d0  0000000000000008 R_X86_64_RELATIVE                         14e1fc8
00000000018799d8  0000000000000008 R_X86_64_RELATIVE                         14e2040
00000000018799e0  0000000000000008 R_X86_64_RELATIVE                         14e20da
00000000018799e8  0000000000000008 R_X86_64_RELATIVE                         14e2174
00000000018799f0  0000000000000008 R_X86_64_RELATIVE                         14e21b4
00000000018799f8  0000000000000008 R_X86_64_RELATIVE                         14e226a
0000000001879a00  0000000000000008 R_X86_64_RELATIVE                         14e22a4
0000000001879a08  0000000000000008 R_X86_64_RELATIVE                         14e233e
0000000001879a10  0000000000000008 R_X86_64_RELATIVE                         14e23d8
0000000001879a18  0000000000000008 R_X86_64_RELATIVE                         14e2472
0000000001879a20  0000000000000008 R_X86_64_RELATIVE                         14e248a
0000000001879a28  0000000000000008 R_X86_64_RELATIVE                         14e24b8
0000000001879a30  0000000000000008 R_X86_64_RELATIVE                         14e24d0
0000000001879a38  0000000000000008 R_X86_64_RELATIVE                         14e24e8
0000000001879a40  0000000000000008 R_X86_64_RELATIVE                         14e25d0
0000000001879a58  0000000000000008 R_X86_64_RELATIVE                         14e40ca

## Known adjacent method bodies

### 0x14e2440..0x14e248a

/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000014e2440 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3279c4>:
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

### 0x14e248a..0x14e24b8

/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000014e248a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a0e>:
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

### 0x14e24b8..0x14e24d0

/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000014e24b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a3c>:
 14e24b8:	48 83 c7 20          	add    rdi,0x20
 14e24bc:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389c8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e417>
 14e24c3:	48 8d 15 56 f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f756]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
 14e24ca:	e9 18 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
 14e24cf:	cc                   	int3

### 0x14e24d0..0x14e24e8

/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000014e24d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a54>:
 14e24d0:	48 83 c7 20          	add    rdi,0x20
 14e24d4:	48 8d 35 05 65 f5 fe 	lea    rsi,[rip+0xfffffffffef56505]        # 4389e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e42f>
 14e24db:	48 8d 15 3e f7 f6 fe 	lea    rdx,[rip+0xfffffffffef6f73e]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
 14e24e2:	e9 00 01 00 00       	jmp    14e25e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327b6b>
 14e24e7:	cc                   	int3

### 0x14e24e8..0x14e25d0

/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000014e24e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327a6c>:
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

## Code references to candidate address point / nearby vtable
 14557d2:	48 8d 05 c7 e5 41 00 	lea    rax,[rip+0x41e5c7]        # 1873da0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30488>
 14557d9:	48 89 07             	mov    QWORD PTR [rdi],rax
 14557dc:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 14557e1:	48 8d 05 10 a0 fe fe 	lea    rax,[rip+0xfffffffffefea010]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 14557e8:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
 14557ec:	83 67 40 00          	and    DWORD PTR [rdi+0x40],0x0
 14557f0:	83 67 30 00          	and    DWORD PTR [rdi+0x30],0x0
 14557f4:	0f 57 c0             	xorps  xmm0,xmm0
 14557f7:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
 14557fb:	48 89 d6             	mov    rsi,rdx
 14557fe:	e9 f5 fe ff ff       	jmp    14556f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ac7c>
 1455803:	cc                   	int3
 1455804:	41 56                	push   r14
 1455806:	53                   	push   rbx
 1455807:	50                   	push   rax
 1455808:	48 89 fb             	mov    rbx,rdi
 145580b:	48 8d 05 3e 41 42 00 	lea    rax,[rip+0x42413e]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
 1455812:	48 89 07             	mov    QWORD PTR [rdi],rax
 1455815:	48 81 c7 90 01 00 00 	add    rdi,0x190
 145581c:	e8 45 ce 68 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 1455821:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
 1455828:	e8 63 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 145582d:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
 1455834:	e8 57 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1455839:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
 1455840:	e8 4b 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1455845:	48 8d bb 28 01 00 00 	lea    rdi,[rbx+0x128]
 145584c:	e8 3f 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1455851:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
 1455858:	e8 8d 5a 6a ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
 145585d:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
 1455864:	e8 27 86 39 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1455869:	48 83 bb c8 00 00 00 	cmp    QWORD PTR [rbx+0xc8],0x0
 1455870:	00 
 1455871:	74 17                	je     145588a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29ae0e>
 1455873:	4c 8d b3 c8 00 00 00 	lea    r14,[rbx+0xc8]
 145587a:	4c 89 f7             	mov    rdi,r14
 145587d:	e8 a8 00 00 00       	call   145592a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29aeae>
 1455882:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
--
 14e15ce:	48 8d 35 eb ba f5 fe 	lea    rsi,[rip+0xfffffffffef5baeb]        # 43d0c0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2ccc>
 14e15d5:	48 83 c4 08          	add    rsp,0x8
 14e15d9:	5b                   	pop    rbx
 14e15da:	41 5e                	pop    r14
 14e15dc:	41 5f                	pop    r15
 14e15de:	5d                   	pop    rbp
 14e15df:	e9 3a a3 18 00       	jmp    166b91e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fa8a>
 14e15e4:	55                   	push   rbp
 14e15e5:	41 57                	push   r15
 14e15e7:	41 56                	push   r14
 14e15e9:	53                   	push   rbx
 14e15ea:	48 83 ec 48          	sub    rsp,0x48
 14e15ee:	48 89 fb             	mov    rbx,rdi
 14e15f1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 14e15f8:	00 00 
 14e15fa:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 14e15ff:	48 8d 05 4a 83 39 00 	lea    rax,[rip+0x39834a]        # 1879950 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36038>
 14e1606:	48 89 07             	mov    QWORD PTR [rdi],rax
 14e1609:	4c 8d 77 08          	lea    r14,[rdi+0x8]
 14e160d:	48 89 f7             	mov    rdi,rsi
 14e1610:	e8 a7 11 00 00       	call   14e27bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x327d40>
 14e1615:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
 14e161a:	48 89 06             	mov    QWORD PTR [rsi],rax
 14e161d:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
 14e1621:	4c 8d 7c 24 1f       	lea    r15,[rsp+0x1f]
 14e1626:	4c 89 ff             	mov    rdi,r15
 14e1629:	e8 f2 2c 6b ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
 14e162e:	4c 89 f7             	mov    rdi,r14
 14e1631:	4c 89 fe             	mov    rsi,r15
 14e1634:	e8 af 2d e7 ff       	call   13543e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19996c>
 14e1639:	0f 57 c0             	xorps  xmm0,xmm0
 14e163c:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
 14e1640:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 14e1644:	bd 00 00 80 3f       	mov    ebp,0x3f800000
 14e1649:	89 6b 40             	mov    DWORD PTR [rbx+0x40],ebp
 14e164c:	45 31 f6             	xor    r14d,r14d
 14e164f:	44 88 73 48          	mov    BYTE PTR [rbx+0x48],r14b
 14e1653:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
 14e1657:	0f 11 83 00 01 00 00 	movups XMMWORD PTR [rbx+0x100],xmm0

## Relocations whose target is candidate-ad method family
0000000001879a18  0000000000000008 R_X86_64_RELATIVE                         14e2472
0000000001879a20  0000000000000008 R_X86_64_RELATIVE                         14e248a
0000000001879a28  0000000000000008 R_X86_64_RELATIVE                         14e24b8
0000000001879a30  0000000000000008 R_X86_64_RELATIVE                         14e24d0
0000000001879a38  0000000000000008 R_X86_64_RELATIVE                         14e24e8
0000000001879a40  0000000000000008 R_X86_64_RELATIVE                         14e25d0
