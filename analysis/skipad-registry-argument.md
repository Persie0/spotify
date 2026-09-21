# Skip Ad registry argument provenance

## 0x11ee608 entry

/tmp/regarg/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000011ee608 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33b8c>:
 11ee608:	55                   	push   rbp
 11ee609:	41 57                	push   r15
 11ee60b:	41 56                	push   r14
 11ee60d:	41 55                	push   r13
 11ee60f:	41 54                	push   r12
 11ee611:	53                   	push   rbx
 11ee612:	48 81 ec 68 03 00 00 	sub    rsp,0x368
 11ee619:	48 89 cb             	mov    rbx,rcx
 11ee61c:	49 89 d5             	mov    r13,rdx
 11ee61f:	49 89 ff             	mov    r15,rdi
 11ee622:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11ee629:	00 00 
 11ee62b:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
 11ee632:	00 
 11ee633:	48 89 cf             	mov    rdi,rcx
 11ee636:	e8 53 86 ac ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
 11ee63b:	49 89 c6             	mov    r14,rax
 11ee63e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11ee642:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ee646:	6a 73                	push   0x73
 11ee648:	5a                   	pop    rdx
 11ee649:	e8 90 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ee64e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee651:	48 8b 80 98 03 00 00 	mov    rax,QWORD PTR [rax+0x398]
 11ee658:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
 11ee65d:	48 85 c0             	test   rax,rax
 11ee660:	0f 84 b9 08 00 00    	je     11eef1f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344a3>
 11ee666:	48 89 df             	mov    rdi,rbx
 11ee669:	e8 36 32 a2 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
 11ee66e:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
 11ee675:	00 
 11ee676:	48 89 df             	mov    rdi,rbx
 11ee679:	e8 28 05 e8 ff       	call   106eba6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235fbc>
 11ee67e:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 11ee683:	48 89 df             	mov    rdi,rbx
 11ee686:	e8 15 4d a6 ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
 11ee68b:	48                   	rex.W
 11ee68c:	89                   	.byte 0x89
 11ee68d:	84 24 10             	test   BYTE PTR [rax+rdx*1],ah

## Direct callers of 0x11ee608

## Tail jumps to 0x11ee608
