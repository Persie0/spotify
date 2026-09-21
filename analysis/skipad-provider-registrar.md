# Skip Ad provider registrar

Provider object:
- allocation size 8 bytes at 0xb6162a
- vptr address point 0x185b8d0
- virtual +0x28 = 0x11ee608 (Skip Ad/ListPlayer setup factory)
- immediately registered through addb16

## Provider vtable 0x185b8d0
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x11ee5ec FDE=(18802156, 18802159)
- +0x18: 0x11ee5f0 FDE=(18802160, 18802171)
- +0x20: 0x11ee5fc FDE=(18802172, 18802183)
- +0x28: 0x11ee608 FDE=(18802184, 18804775)
- +0x30: 0x0 FDE=None
- +0x38: 0x0 FDE=None
- +0x40: 0x11ef054 FDE=(18804820, 18804835)
- +0x48: 0x11ef064 FDE=(18804836, 18804854)
- +0x50: 0x11ef076 FDE=(18804854, 18804943)
- +0x58: 0x0 FDE=None
- +0x60: 0xa50370 FDE=(10814320, 10814325)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0x11f9384 FDE=(18846596, 18847792)

## Provider virtual method bodies
### +0x0 -> 0x9d7de0; FDE=(10321376, 10321377)
      9d7de0:	c3                   	ret

### +0x8 -> 0xa50370; FDE=(10814320, 10814325)
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

### +0x10 -> 0x11ee5ec; FDE=(18802156, 18802159)
     11ee5ec:	b0 47                	mov    al,0x47
     11ee5ee:	c3                   	ret

### +0x18 -> 0x11ee5f0; FDE=(18802160, 18802171)
     11ee5f0:	48 8d 05 0d 4c 16 ff 	lea    rax,[rip+0xffffffffff164c0d]        # 353204 <_ZTSSt12bad_any_cast@@Base-0x3cfc4>
     11ee5f7:	6a 13                	push   0x13
     11ee5f9:	5a                   	pop    rdx
     11ee5fa:	c3                   	ret

### +0x20 -> 0x11ee5fc; FDE=(18802172, 18802183)
     11ee5fc:	48 8d 05 ad c9 1e ff 	lea    rax,[rip+0xffffffffff1ec9ad]        # 3dafb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x9ff>
     11ee603:	6a 1a                	push   0x1a
     11ee605:	5a                   	pop    rdx
     11ee606:	c3                   	ret

### +0x28 -> 0x11ee608; FDE=(18802184, 18804775)
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
     11ee68b:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
     11ee692:	00 
     11ee693:	48 89 df             	mov    rdi,rbx
     11ee696:	e8 05 4c 97 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     11ee69b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ee6a0:	48 89 df             	mov    rdi,rbx
     11ee6a3:	e8 d2 30 a2 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
     11ee6a8:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ee6ad:	48 89 df             	mov    rdi,rbx
     11ee6b0:	e8 79 09 9a ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     11ee6b5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee6ba:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee6be:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
     11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
     11ee6d6:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     11ee6db:	e8 ba 85 bf ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
     11ee6e0:	48 89 df             	mov    rdi,rbx
     11ee6e3:	e8 2c 99 99 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
     11ee6e8:	49 89 c4             	mov    r12,rax
     11ee6eb:	48 89 df             	mov    rdi,rbx
     11ee6ee:	e8 43 86 ac ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
     11ee6f3:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
     11ee6fa:	00 
     11ee6fb:	48 89 df             	mov    rdi,rbx
     11ee6fe:	e8 c7 6a bf ff       	call   de51ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2250>
     11ee703:	48 89 c5             	mov    rbp,rax
     11ee706:	48 89 df             	mov    rdi,rbx
     11ee709:	e8 c0 30 a2 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
     11ee70e:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
     11ee715:	00 
     11ee716:	48 89 df             	mov    rdi,rbx
     11ee719:	e8 10 76 eb ff       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>
     11ee71e:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     11ee723:	48 89 df             	mov    rdi,rbx
     11ee726:	e8 fd 08 00 00       	call   11ef028 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345ac>
     11ee72b:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
     11ee732:	00 
     11ee733:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee737:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee73b:	6a 48                	push   0x48
     11ee73d:	5a                   	pop    rdx
     11ee73e:	e8 9b 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee743:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee746:	48 8b 80 40 02 00 00 	mov    rax,QWORD PTR [rax+0x240]
     11ee74d:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     11ee754:	00 
     11ee755:	48 85 c0             	test   rax,rax
     11ee758:	0f 84 c6 07 00 00    	je     11eef24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344a8>
     11ee75e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee762:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee766:	ba ba 00 00 00       	mov    edx,0xba
     11ee76b:	e8 6e 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee770:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee773:	48 8b 80 d0 05 00 00 	mov    rax,QWORD PTR [rax+0x5d0]
     11ee77a:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     11ee77f:	48 85 c0             	test   rax,rax
     11ee782:	0f 84 a1 07 00 00    	je     11eef29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344ad>
     11ee788:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee78c:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee790:	6a 23                	push   0x23
     11ee792:	5a                   	pop    rdx
     11ee793:	e8 46 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee798:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee79b:	48 8b 80 18 01 00 00 	mov    rax,QWORD PTR [rax+0x118]
     11ee7a2:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
     11ee7a9:	00 
     11ee7aa:	48 85 c0             	test   rax,rax
     11ee7ad:	0f 84 7b 07 00 00    	je     11eef2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344b2>
     11ee7b3:	4c 89 b4 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],r14
     11ee7ba:	00 
     11ee7bb:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee7bf:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee7c3:	ba c2 00 00 00       	mov    edx,0xc2
     11ee7c8:	e8 11 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee7cd:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee7d0:	48 8b 80 10 06 00 00 	mov    rax,QWORD PTR [rax+0x610]
     11ee7d7:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
     11ee7de:	00 
     11ee7df:	48 85 c0             	test   rax,rax
     11ee7e2:	0f 84 4b 07 00 00    	je     11eef33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344b7>
     11ee7e8:	48 89 df             	mov    rdi,rbx
     11ee7eb:	e8 6a d1 c8 ff       	call   e7b95a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42d70>
     11ee7f0:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11ee7f5:	48 89 df             	mov    rdi,rbx
     11ee7f8:	e8 1f 8d ac ff       	call   cb751c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044bc>
     11ee7fd:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11ee802:	48 89 df             	mov    rdi,rbx
     11ee805:	e8 74 77 99 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
     11ee80a:	49 89 c6             	mov    r14,rax
     11ee80d:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee811:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee815:	6a 7a                	push   0x7a
     11ee817:	5a                   	pop    rdx
     11ee818:	e8 c1 3a 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee81d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee820:	48 8b 80 d0 03 00 00 	mov    rax,QWORD PTR [rax+0x3d0]
     11ee827:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11ee82c:	48 85 c0             	test   rax,rax
     11ee82f:	0f 84 03 07 00 00    	je     11eef38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344bc>
     11ee835:	4c 89 a4 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],r12
     11ee83c:	00 
     11ee83d:	4c 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r15
     11ee844:	00 
     11ee845:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee849:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee84d:	6a 7a                	push   0x7a
     11ee84f:	5a                   	pop    rdx
     11ee850:	e8 89 3a 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee855:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee858:	48 8b 80 d0 03 00 00 	mov    rax,QWORD PTR [rax+0x3d0]
     11ee85f:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     11ee866:	00 
     11ee867:	48 85 c0             	test   rax,rax
     11ee86a:	0f 84 cd 06 00 00    	je     11eef3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344c1>
     11ee870:	48 89 df             	mov    rdi,rbx
     11ee873:	e8 f6 73 a1 ff       	call   c05c6e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152c0e>
     11ee878:	49 89 c4             	mov    r12,rax
     11ee87b:	48 89 df             	mov    rdi,rbx
     11ee87e:	e8 69 00 ca ff       	call   e8e8ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d02>
     11ee883:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     11ee888:	48 89 df             	mov    rdi,rbx
     11ee88b:	e8 c0 2e a2 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
     11ee890:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11ee895:	48 89 df             	mov    rdi,rbx
     11ee898:	e8 1f 71 e8 ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
     11ee89d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     11ee8a4:	00 
     11ee8a5:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     11ee8aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ad:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8b0:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     11ee8b7:	00 
     11ee8b8:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
     11ee8bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8c0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8c3:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11ee8ca:	00 
     11ee8cb:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     11ee8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8d3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee8d6:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11ee8db:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     11ee8e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8e3:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11ee8e6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11ee8e9:	48 89 c7             	mov    rdi,rax
     11ee8ec:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
     11ee8f2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     11ee8f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     11ee8fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee902:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee907:	49 8b 5d 68          	mov    rbx,QWORD PTR [r13+0x68]
     11ee90b:	48 8d 35 4d 8d 19 ff 	lea    rsi,[rip+0xffffffffff198d4d]        # 38765f <_ZTSSt12bad_any_cast@@Base-0x8b69>
     11ee912:	4c 8d bc 24 38 02 00 	lea    r15,[rsp+0x238]
     11ee919:	00 
     11ee91a:	4c 89 ff             	mov    rdi,r15
     11ee91d:	e8 5c b1 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11ee922:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee925:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
     11ee92c:	00 
     11ee92d:	48 89 de             	mov    rsi,rbx
     11ee930:	4c 89 fa             	mov    rdx,r15
     11ee933:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11ee936:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]
     11ee93d:	4d 8b bd 98 00 00 00 	mov    r15,QWORD PTR [r13+0x98]
     11ee944:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee948:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
     11ee94f:	00 
     11ee950:	48 89 ee             	mov    rsi,rbp
     11ee953:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee956:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee95a:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     11ee961:	00 
     11ee962:	48 89 ee             	mov    rsi,rbp
     11ee965:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11ee968:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     11ee96d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee970:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee973:	48 89 c5             	mov    rbp,rax
     11ee976:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     11ee97b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee97e:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee981:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ee986:	49 8b 45 30          	mov    rax,QWORD PTR [r13+0x30]
     11ee98a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     11ee98f:	49 8b 45 60          	mov    rax,QWORD PTR [r13+0x60]
     11ee993:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ee998:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     11ee99d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9a0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9a3:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     11ee9a8:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
     11ee9ac:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     11ee9b3:	00 
     11ee9b4:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
     11ee9bb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11ee9c0:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     11ee9c5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ee9c8:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     11ee9cf:	00 
     11ee9d0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9d3:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9d6:	4c 89 f7             	mov    rdi,r14
     11ee9d9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9dc:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11ee9e1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9e4:	4c 89 f7             	mov    rdi,r14
     11ee9e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9ea:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     11ee9f1:	00 
     11ee9f2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     11ee9f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9fa:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9fd:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11eea02:	4c 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r15
     11eea09:	00 
     11eea0a:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
     11eea11:	00 
     11eea12:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11eea17:	48 8b 88 b0 00 00 00 	mov    rcx,QWORD PTR [rax+0xb0]
     11eea1e:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     11eea25:	00 
     11eea26:	48 8b 80 b8 00 00 00 	mov    rax,QWORD PTR [rax+0xb8]
     11eea2d:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     11eea32:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
     11eea36:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     11eea3d:	00 
     11eea3e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11eea42:	4c 89 e7             	mov    rdi,r12
     11eea45:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11eea48:	49 89 c6             	mov    r14,rax
     11eea4b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11eea4f:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     11eea56:	00 
     11eea57:	4c 89 e6             	mov    rsi,r12
     11eea5a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eea5d:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]
     11eea64:	bf 10 02 00 00       	mov    edi,0x210
     11eea69:	e8 92 f4 5f 00       	call   17edf00 <_Znwm@plt>
     11eea6e:	49 89 c7             	mov    r15,rax
     11eea71:	48 89 ac 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rbp
     11eea78:	00 
     11eea79:	0f 57 c0             	xorps  xmm0,xmm0
     11eea7c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     11eea80:	48 8d 05 89 ce 66 00 	lea    rax,[rip+0x66ce89]        # 185b910 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17ff8>
     11eea87:	49 89 07             	mov    QWORD PTR [r15],rax
     11eea8a:	4d 8d 67 18          	lea    r12,[r15+0x18]
     11eea8e:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     11eea95:	00 
     11eea96:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
     11eea9d:	00 
     11eea9e:	ba b0 00 00 00       	mov    edx,0xb0
     11eeaa3:	e8 28 10 60 00       	call   17efad0 <memcpy@plt>
     11eeaa8:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
     11eeaac:	4c 89 e7             	mov    rdi,r12
     11eeaaf:	e8 4e b3 5e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     11eeab4:	4d 89 77 70          	mov    QWORD PTR [r15+0x70],r14
     11eeab8:	49 8d 7f 78          	lea    rdi,[r15+0x78]
     11eeabc:	48 8d b4 24 b0 02 00 	lea    rsi,[rsp+0x2b0]
     11eeac3:	00 
     11eeac4:	ba b0 00 00 00       	mov    edx,0xb0
     11eeac9:	e8 02 10 60 00       	call   17efad0 <memcpy@plt>
     11eeace:	49 89 9f 28 01 00 00 	mov    QWORD PTR [r15+0x128],rbx
     11eead5:	4d 8d b7 30 01 00 00 	lea    r14,[r15+0x130]
     11eeadc:	4d 89 b7 30 01 00 00 	mov    QWORD PTR [r15+0x130],r14
     11eeae3:	4d 89 b7 38 01 00 00 	mov    QWORD PTR [r15+0x138],r14
     11eeaea:	0f 57 c0             	xorps  xmm0,xmm0
     11eeaed:	41 0f 11 87 40 01 00 	movups XMMWORD PTR [r15+0x140],xmm0
     11eeaf4:	00 
     11eeaf5:	41 0f 11 87 50 01 00 	movups XMMWORD PTR [r15+0x150],xmm0
     11eeafc:	00 
     11eeafd:	49 83 a7 60 01 00 00 	and    QWORD PTR [r15+0x160],0x0
     11eeb04:	00 
     11eeb05:	41 bc 00 00 80 3f    	mov    r12d,0x3f800000
     11eeb0b:	45 89 a7 68 01 00 00 	mov    DWORD PTR [r15+0x168],r12d
     11eeb12:	b8 00 00 10 00       	mov    eax,0x100000
     11eeb17:	49 89 87 70 01 00 00 	mov    QWORD PTR [r15+0x170],rax
     11eeb1e:	49 89 87 78 01 00 00 	mov    QWORD PTR [r15+0x178],rax
     11eeb25:	49 83 a7 80 01 00 00 	and    QWORD PTR [r15+0x180],0x0
     11eeb2c:	00 
     11eeb2d:	49 8d af 88 01 00 00 	lea    rbp,[r15+0x188]
     11eeb34:	48 89 ef             	mov    rdi,rbp
     11eeb37:	48 89 de             	mov    rsi,rbx
     11eeb3a:	e8 83 2b 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     11eeb3f:	49 8d 9f 98 01 00 00 	lea    rbx,[r15+0x198]
     11eeb46:	0f 57 c0             	xorps  xmm0,xmm0
     11eeb49:	41 0f 11 87 c8 01 00 	movups XMMWORD PTR [r15+0x1c8],xmm0
     11eeb50:	00 
     11eeb51:	41 0f 11 87 b8 01 00 	movups XMMWORD PTR [r15+0x1b8],xmm0
     11eeb58:	00 
     11eeb59:	41 0f 11 87 a8 01 00 	movups XMMWORD PTR [r15+0x1a8],xmm0
     11eeb60:	00 
     11eeb61:	41 0f 11 87 98 01 00 	movups XMMWORD PTR [r15+0x198],xmm0
     11eeb68:	00 
     11eeb69:	45 89 a7 d8 01 00 00 	mov    DWORD PTR [r15+0x1d8],r12d
     11eeb70:	41 83 a7 e0 01 00 00 	and    DWORD PTR [r15+0x1e0],0x0
     11eeb77:	00 
     11eeb78:	49 c7 87 e8 01 00 00 	mov    QWORD PTR [r15+0x1e8],0xa
     11eeb7f:	0a 00 00 00 
     11eeb83:	41 c7 87 f0 01 00 00 	mov    DWORD PTR [r15+0x1f0],0x3
     11eeb8a:	03 00 00 00 
     11eeb8e:	49 c7 87 f8 01 00 00 	mov    QWORD PTR [r15+0x1f8],0x5
     11eeb95:	05 00 00 00 
     11eeb99:	49 8d bf 00 02 00 00 	lea    rdi,[r15+0x200]
     11eeba0:	e8 85 6b 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     11eeba5:	31 ff                	xor    edi,edi
     11eeba7:	e8 70 f8 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     11eebac:	49 8b 75 58          	mov    rsi,QWORD PTR [r13+0x58]
     11eebb0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11eebb3:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     11eebba:	00 
     11eebbb:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebbe:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11eebc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebc9:	49 89 c6             	mov    r14,rax
     11eebcc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11eebd1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebd4:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebd7:	49 89 c4             	mov    r12,rax
     11eebda:	bf c0 5d 00 00       	mov    edi,0x5dc0
     11eebdf:	e8 1c f3 5f 00       	call   17edf00 <_Znwm@plt>
     11eebe4:	48 89 c7             	mov    rdi,rax
     11eebe7:	66 49 0f 6e c7       	movq   xmm0,r15
     11eebec:	f3 0f 7e 0c 24       	movq   xmm1,QWORD PTR [rsp]
     11eebf1:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     11eebf5:	48 8b 8c 24 28 02 00 	mov    rcx,QWORD PTR [rsp+0x228]
     11eebfc:	00 
     11eebfd:	0f 28 84 24 20 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x220]
     11eec04:	00 
     11eec05:	0f 29 84 24 a0 02 00 	movaps XMMWORD PTR [rsp+0x2a0],xmm0
     11eec0c:	00 
     11eec0d:	0f 57 c0             	xorps  xmm0,xmm0
     11eec10:	0f 29 84 24 20 02 00 	movaps XMMWORD PTR [rsp+0x220],xmm0
     11eec17:	00 
     11eec18:	48 8b 94 24 18 02 00 	mov    rdx,QWORD PTR [rsp+0x218]
     11eec1f:	00 
     11eec20:	0f 28 94 24 10 02 00 	movaps xmm2,XMMWORD PTR [rsp+0x210]
     11eec27:	00 
     11eec28:	0f 29 94 24 90 02 00 	movaps XMMWORD PTR [rsp+0x290],xmm2
     11eec2f:	00 
     11eec30:	0f 29 84 24 10 02 00 	movaps XMMWORD PTR [rsp+0x210],xmm0
     11eec37:	00 
     11eec38:	48 8b b4 24 08 02 00 	mov    rsi,QWORD PTR [rsp+0x208]
     11eec3f:	00 
     11eec40:	0f 28 94 24 00 02 00 	movaps xmm2,XMMWORD PTR [rsp+0x200]
     11eec47:	00 
     11eec48:	0f 29 94 24 80 02 00 	movaps XMMWORD PTR [rsp+0x280],xmm2
     11eec4f:	00 
     11eec50:	0f 29 84 24 00 02 00 	movaps XMMWORD PTR [rsp+0x200],xmm0
     11eec57:	00 
     11eec58:	66 0f 7f 8c 24 70 02 	movdqa XMMWORD PTR [rsp+0x270],xmm1
     11eec5f:	00 00 
     11eec61:	49 8b 9d e0 00 00 00 	mov    rbx,QWORD PTR [r13+0xe0]
     11eec68:	41 0f 10 8d d8 00 00 	movups xmm1,XMMWORD PTR [r13+0xd8]
     11eec6f:	00 
     11eec70:	0f 29 8c 24 60 02 00 	movaps XMMWORD PTR [rsp+0x260],xmm1
     11eec77:	00 
     11eec78:	48 85 db             	test   rbx,rbx
     11eec7b:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
     11eec80:	4c 89 e0             	mov    rax,r12
     11eec83:	74 35                	je     11eecba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3423e>
     11eec85:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     11eec8a:	48 8b 9c 24 68 02 00 	mov    rbx,QWORD PTR [rsp+0x268]
     11eec91:	00 
     11eec92:	48 8b 8c 24 88 02 00 	mov    rcx,QWORD PTR [rsp+0x288]
     11eec99:	00 
     11eec9a:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
     11eec9e:	48 8b 8c 24 98 02 00 	mov    rcx,QWORD PTR [rsp+0x298]
     11eeca5:	00 
     11eeca6:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     11eecab:	48 8b 8c 24 a8 02 00 	mov    rcx,QWORD PTR [rsp+0x2a8]
     11eecb2:	00 
     11eecb3:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     11eecb8:	eb 0e                	jmp    11eecc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3424c>
     11eecba:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     11eecbf:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     11eecc4:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
     11eecc8:	4c 8b bc 24 c8 00 00 	mov    r15,QWORD PTR [rsp+0xc8]
     11eeccf:	00 
     11eecd0:	49 83 c7 38          	add    r15,0x38
     11eecd4:	4c 8b 5c 24 28       	mov    r11,QWORD PTR [rsp+0x28]
     11eecd9:	49 83 c3 10          	add    r11,0x10
     11eecdd:	48 8b ac 24 90 00 00 	mov    rbp,QWORD PTR [rsp+0x90]
     11eece4:	00 
     11eece5:	48 83 c5 10          	add    rbp,0x10
     11eece9:	4c 8b 94 24 d0 00 00 	mov    r10,QWORD PTR [rsp+0xd0]
     11eecf0:	00 
     11eecf1:	49 83 c2 0c          	add    r10,0xc
     11eecf5:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
     11eecfc:	00 
     11eecfd:	49 81 c6 90 00 00 00 	add    r14,0x90
     11eed04:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     11eed09:	49 81 c4 f8 00 00 00 	add    r12,0xf8
     11eed10:	48 8b b4 24 f0 00 00 	mov    rsi,QWORD PTR [rsp+0xf0]
     11eed17:	00 
     11eed18:	48 83 c6 10          	add    rsi,0x10
     11eed1c:	48 8d 94 24 30 01 00 	lea    rdx,[rsp+0x130]
     11eed23:	00 
     11eed24:	48 8b 4a 10          	mov    rcx,QWORD PTR [rdx+0x10]
     11eed28:	48 89 8c 24 c0 02 00 	mov    QWORD PTR [rsp+0x2c0],rcx
     11eed2f:	00 
     11eed30:	0f 28 0a             	movaps xmm1,XMMWORD PTR [rdx]
     11eed33:	0f 29 8c 24 b0 02 00 	movaps XMMWORD PTR [rsp+0x2b0],xmm1
     11eed3a:	00 
     11eed3b:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     11eed3e:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     11eed43:	4c 8d ac 24 70 02 00 	lea    r13,[rsp+0x270]
     11eed4a:	00 
     11eed4b:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     11eed50:	48 8b 94 24 c0 00 00 	mov    rdx,QWORD PTR [rsp+0xc0]
     11eed57:	00 
     11eed58:	48 8b 8c 24 20 01 00 	mov    rcx,QWORD PTR [rsp+0x120]
     11eed5f:	00 
     11eed60:	4c 8b 84 24 b8 00 00 	mov    r8,QWORD PTR [rsp+0xb8]
     11eed67:	00 
     11eed68:	4c 8b 8c 24 10 01 00 	mov    r9,QWORD PTR [rsp+0x110]
     11eed6f:	00 
     11eed70:	41 57                	push   r15
     11eed72:	50                   	push   rax
     11eed73:	ff b4 24 80 00 00 00 	push   QWORD PTR [rsp+0x80]
     11eed7a:	4c 8d bc 24 c8 02 00 	lea    r15,[rsp+0x2c8]
     11eed81:	00 
     11eed82:	41 57                	push   r15
     11eed84:	48 8d 84 24 80 02 00 	lea    rax,[rsp+0x280]
     11eed8b:	00 
     11eed8c:	50                   	push   rax
     11eed8d:	41 55                	push   r13
     11eed8f:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     11eed96:	41 53                	push   r11
     11eed98:	55                   	push   rbp
     11eed99:	41 52                	push   r10
     11eed9b:	ff 74 24 68          	push   QWORD PTR [rsp+0x68]
     11eed9f:	41 56                	push   r14
     11eeda1:	41 54                	push   r12
     11eeda3:	48 8d 84 24 e8 02 00 	lea    rax,[rsp+0x2e8]
     11eedaa:	00 
     11eedab:	50                   	push   rax
     11eedac:	ff b4 24 20 01 00 00 	push   QWORD PTR [rsp+0x120]
     11eedb3:	ff b4 24 a8 00 00 00 	push   QWORD PTR [rsp+0xa8]
     11eedba:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     11eedc1:	ff b4 24 c8 00 00 00 	push   QWORD PTR [rsp+0xc8]
     11eedc8:	ff b4 24 78 01 00 00 	push   QWORD PTR [rsp+0x178]
     11eedcf:	ff b4 24 e0 00 00 00 	push   QWORD PTR [rsp+0xe0]
     11eedd6:	ff b4 24 98 01 00 00 	push   QWORD PTR [rsp+0x198]
     11eeddd:	ff b4 24 f8 00 00 00 	push   QWORD PTR [rsp+0xf8]
     11eede4:	ff b4 24 b0 01 00 00 	push   QWORD PTR [rsp+0x1b0]
     11eedeb:	ff b4 24 c0 01 00 00 	push   QWORD PTR [rsp+0x1c0]
     11eedf2:	ff b4 24 40 01 00 00 	push   QWORD PTR [rsp+0x140]
     11eedf9:	ff b4 24 e0 01 00 00 	push   QWORD PTR [rsp+0x1e0]
     11eee00:	48 8d 84 24 60 03 00 	lea    rax,[rsp+0x360]
     11eee07:	00 
     11eee08:	50                   	push   rax
     11eee09:	48 8d 84 24 78 03 00 	lea    rax,[rsp+0x378]
     11eee10:	00 
     11eee11:	50                   	push   rax
     11eee12:	ff b4 24 78 01 00 00 	push   QWORD PTR [rsp+0x178]
     11eee19:	ff b4 24 10 02 00 00 	push   QWORD PTR [rsp+0x210]
     11eee20:	ff b4 24 c8 01 00 00 	push   QWORD PTR [rsp+0x1c8]
     11eee27:	ff b4 24 98 01 00 00 	push   QWORD PTR [rsp+0x198]
     11eee2e:	48 8d 84 24 50 03 00 	lea    rax,[rsp+0x350]
     11eee35:	00 
     11eee36:	50                   	push   rax
     11eee37:	ff b4 24 68 01 00 00 	push   QWORD PTR [rsp+0x168]
     11eee3e:	ff b4 24 68 01 00 00 	push   QWORD PTR [rsp+0x168]
     11eee45:	ff b4 24 80 01 00 00 	push   QWORD PTR [rsp+0x180]
     11eee4c:	e8 e3 04 00 00       	call   11ef334 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348b8>
     11eee51:	48 81 c4 20 01 00 00 	add    rsp,0x120
     11eee58:	4c 89 ff             	mov    rdi,r15
     11eee5b:	e8 30 f0 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11eee60:	48 89 df             	mov    rdi,rbx
     11eee63:	e8 1e f6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eee68:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     11eee6c:	e8 15 f6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eee71:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     11eee75:	e8 0c f6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eee7a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11eee7f:	e8 02 f6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eee84:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11eee89:	e8 f8 f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eee8e:	48 8b 9c 24 e0 00 00 	mov    rbx,QWORD PTR [rsp+0xe0]
     11eee95:	00 
     11eee96:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     11eee9b:	48 89 03             	mov    QWORD PTR [rbx],rax
     11eee9e:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     11eeea5:	00 
     11eeea6:	e8 e5 ef 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11eeeab:	31 ff                	xor    edi,edi
     11eeead:	e8 d4 f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeeb2:	48 8b bc 24 08 02 00 	mov    rdi,QWORD PTR [rsp+0x208]
     11eeeb9:	00 
     11eeeba:	e8 c7 f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeebf:	48 8b bc 24 18 02 00 	mov    rdi,QWORD PTR [rsp+0x218]
     11eeec6:	00 
     11eeec7:	e8 ba f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeecc:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     11eeed3:	00 
     11eeed4:	e8 ad f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeed9:	48 8b bc 24 58 02 00 	mov    rdi,QWORD PTR [rsp+0x258]
     11eeee0:	00 
     11eeee1:	e8 a0 f5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeee6:	48 8d bc 24 38 02 00 	lea    rdi,[rsp+0x238]
     11eeeed:	00 
     11eeeee:	e8 9d ef 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11eeef3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11eeefa:	00 00 
     11eeefc:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
     11eef03:	00 
     11eef04:	0f 85 18 01 00 00    	jne    11ef022 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345a6>
     11eef0a:	48 89 d8             	mov    rax,rbx
     11eef0d:	48 81 c4 68 03 00 00 	add    rsp,0x368
     11eef14:	5b                   	pop    rbx
     11eef15:	41 5c                	pop    r12
     11eef17:	41 5d                	pop    r13
     11eef19:	41 5e                	pop    r14
     11eef1b:	41 5f                	pop    r15
     11eef1d:	5d                   	pop    rbp
     11eef1e:	c3                   	ret
     11eef1f:	e8 9b b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef24:	e8 96 b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef29:	e8 91 b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef2e:	e8 8c b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef33:	e8 87 b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef38:	e8 82 b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef3d:	e8 7d b0 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
     11eef42:	49 89 c5             	mov    r13,rax
     11eef45:	eb 70                	jmp    11eefb7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3453b>
     11eef47:	49 89 c5             	mov    r13,rax
     11eef4a:	4c 89 ff             	mov    rdi,r15
     11eef4d:	48 81 c7 b8 01 00 00 	add    rdi,0x1b8
     11eef54:	e8 77 01 00 00       	call   11ef0d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34654>
     11eef59:	48 89 df             	mov    rdi,rbx
     11eef5c:	e8 91 01 00 00       	call   11ef0f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34676>
     11eef61:	48 89 ef             	mov    rdi,rbp
     11eef64:	e8 dd 27 5d 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     11eef69:	4c 89 f7             	mov    rdi,r14
     11eef6c:	e8 9b 01 00 00       	call   11ef10c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34690>
     11eef71:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     11eef75:	e8 ec ae 5e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     11eef7a:	4c 89 ff             	mov    rdi,r15
     11eef7d:	e8 8e f0 5f 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     11eef82:	4c 89 ff             	mov    rdi,r15
     11eef85:	e8 92 f4 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     11eef8a:	eb 3a                	jmp    11eefc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3454a>
     11eef8c:	48 89 c7             	mov    rdi,rax
     11eef8f:	e8 11 ab 88 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     11eef94:	eb 2d                	jmp    11eefc3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34547>
     11eef96:	eb 00                	jmp    11eef98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3451c>
     11eef98:	49 89 c5             	mov    r13,rax
     11eef9b:	eb 36                	jmp    11eefd3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34557>
     11eef9d:	49 89 c5             	mov    r13,rax
     11eefa0:	eb 3e                	jmp    11eefe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34564>
     11eefa2:	49 89 c5             	mov    r13,rax
     11eefa5:	eb 46                	jmp    11eefed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34571>
     11eefa7:	49 89 c5             	mov    r13,rax
     11eefaa:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     11eefb1:	00 
     11eefb2:	e8 d9 ee 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11eefb7:	4c 89 ff             	mov    rdi,r15
     11eefba:	e8 c7 f4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eefbf:	eb 05                	jmp    11eefc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3454a>
     11eefc1:	eb 00                	jmp    11eefc3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34547>
     11eefc3:	49 89 c5             	mov    r13,rax
     11eefc6:	48 8b bc 24 08 02 00 	mov    rdi,QWORD PTR [rsp+0x208]
     11eefcd:	00 
     11eefce:	e8 b3 f4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eefd3:	48 8b bc 24 18 02 00 	mov    rdi,QWORD PTR [rsp+0x218]
     11eefda:	00 
     11eefdb:	e8 a6 f4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eefe0:	48 8b bc 24 28 02 00 	mov    rdi,QWORD PTR [rsp+0x228]
     11eefe7:	00 
     11eefe8:	e8 99 f4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eefed:	48 8b bc 24 58 02 00 	mov    rdi,QWORD PTR [rsp+0x258]
     11eeff4:	00 
     11eeff5:	e8 8c f4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eeffa:	48 8d bc 24 38 02 00 	lea    rdi,[rsp+0x238]
     11ef001:	00 
     11ef002:	e8 89 ee 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11ef007:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11ef00e:	00 00 
     11ef010:	48 3b 84 24 60 03 00 	cmp    rax,QWORD PTR [rsp+0x360]
     11ef017:	00 
     11ef018:	75 08                	jne    11ef022 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345a6>
     11ef01a:	4c 89 ef             	mov    rdi,r13
     11ef01d:	e8 ae 0c 88 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     11ef022:	e8 89 0a 60 00       	call   17efab0 <__stack_chk_fail@plt>

## addb16 registrar FDE (11393814, 11394115)
  addb16:	41 57                	push   r15
  addb18:	41 56                	push   r14
  addb1a:	41 54                	push   r12
  addb1c:	53                   	push   rbx
  addb1d:	50                   	push   rax
  addb1e:	49 89 f6             	mov    r14,rsi
  addb21:	48 89 fb             	mov    rbx,rdi
  addb24:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
  addb28:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  addb2c:	49 39 c4             	cmp    r12,rax
  addb2f:	73 14                	jae    addb45 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aae5>
  addb31:	49 8b 06             	mov    rax,QWORD PTR [r14]
  addb34:	49 83 26 00          	and    QWORD PTR [r14],0x0
  addb38:	49 89 04 24          	mov    QWORD PTR [r12],rax
  addb3c:	49 83 c4 08          	add    r12,0x8
  addb40:	e9 e4 00 00 00       	jmp    addc29 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abc9>
  addb45:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
  addb48:	49 29 d4             	sub    r12,rdx
  addb4b:	49 c1 fc 03          	sar    r12,0x3
  addb4f:	49 8d 74 24 01       	lea    rsi,[r12+0x1]
  addb54:	48 89 f1             	mov    rcx,rsi
  addb57:	48 c1 e9 3d          	shr    rcx,0x3d
  addb5b:	0f 85 d8 00 00 00    	jne    addc39 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abd9>
  addb61:	48 b9 ff ff ff ff ff 	movabs rcx,0x1fffffffffffffff
  addb68:	ff ff 1f 
  addb6b:	48 29 d0             	sub    rax,rdx
  addb6e:	49 89 c7             	mov    r15,rax
  addb71:	49 c1 ff 02          	sar    r15,0x2
  addb75:	49 39 f7             	cmp    r15,rsi
  addb78:	4c 0f 46 fe          	cmovbe r15,rsi
  addb7c:	48 ba f8 ff ff ff ff 	movabs rdx,0x7ffffffffffffff8
  addb83:	ff ff 7f 
  addb86:	48 39 d0             	cmp    rax,rdx
  addb89:	4c 0f 43 f9          	cmovae r15,rcx
  addb8d:	4d 85 ff             	test   r15,r15
  addb90:	74 18                	je     addbaa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2ab4a>
  addb92:	49 39 cf             	cmp    r15,rcx
  addb95:	0f 87 a3 00 00 00    	ja     addc3e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abde>
  addb9b:	4a 8d 3c fd 00 00 00 	lea    rdi,[r15*8+0x0]
  addba2:	00 
  addba3:	e8 58 03 d1 00       	call   17edf00 <_Znwm@plt>
  addba8:	eb 02                	jmp    addbac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2ab4c>
  addbaa:	31 c0                	xor    eax,eax
  addbac:	4e 8d 24 e0          	lea    r12,[rax+r12*8]
  addbb0:	4a 8d 04 f8          	lea    rax,[rax+r15*8]
  addbb4:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
  addbb7:	49 83 26 00          	and    QWORD PTR [r14],0x0
  addbbb:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
  addbbf:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
  addbc2:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
  addbc6:	49 39 d6             	cmp    r14,rdx
  addbc9:	74 29                	je     addbf4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2ab94>
  addbcb:	4c 89 e1             	mov    rcx,r12
  addbce:	49 8b 76 f8          	mov    rsi,QWORD PTR [r14-0x8]
  addbd2:	49 83 66 f8 00       	and    QWORD PTR [r14-0x8],0x0
  addbd7:	49 8d 7e f8          	lea    rdi,[r14-0x8]
  addbdb:	48 89 71 f8          	mov    QWORD PTR [rcx-0x8],rsi
  addbdf:	48 83 c1 f8          	add    rcx,0xfffffffffffffff8
  addbe3:	49 89 fe             	mov    r14,rdi
  addbe6:	48 39 d7             	cmp    rdi,rdx
  addbe9:	75 e3                	jne    addbce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2ab6e>
  addbeb:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]
  addbee:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
  addbf2:	eb 06                	jmp    addbfa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2ab9a>
  addbf4:	4d 89 f7             	mov    r15,r14
  addbf7:	4c 89 e1             	mov    rcx,r12
  addbfa:	49 83 c4 08          	add    r12,0x8
  addbfe:	48 89 0b             	mov    QWORD PTR [rbx],rcx
  addc01:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
  addc05:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  addc09:	4d 39 fe             	cmp    r14,r15
  addc0c:	74 0e                	je     addc1c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abbc>
  addc0e:	49 83 c6 f8          	add    r14,0xfffffffffffffff8
  addc12:	4c 89 f7             	mov    rdi,r14
  addc15:	e8 0e c2 f9 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  addc1a:	eb ed                	jmp    addc09 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aba9>
  addc1c:	4d 85 ff             	test   r15,r15
  addc1f:	74 08                	je     addc29 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abc9>
  addc21:	4c 89 ff             	mov    rdi,r15
  addc24:	e8 f7 02 d1 00       	call   17edf20 <_ZdlPv@plt>
  addc29:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
  addc2d:	48 83 c4 08          	add    rsp,0x8
  addc31:	5b                   	pop    rbx
  addc32:	41 5c                	pop    r12
  addc34:	41 5e                	pop    r14
  addc36:	41 5f                	pop    r15
  addc38:	c3                   	ret
  addc39:	e8 82 69 f2 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
  addc3e:	e8 9c da f9 ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>

## Direct callers of addb16
### call 0xadd896; FDE=(11392980, 11393663)
      add83f:	e8 bc 06 d1 00       	call   17edf00 <_Znwm@plt>
      add844:	49 89 c5             	mov    r13,rax
      add847:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      add84b:	48 8d 05 96 39 d9 00 	lea    rax,[rip+0xd93996]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
      add852:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      add856:	4d 89 75 10          	mov    QWORD PTR [r13+0x10],r14
      add85a:	48 8d 05 03 ec f9 ff 	lea    rax,[rip+0xfffffffffff9ec03]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      add861:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
      add865:	48 8d 05 14 02 00 00 	lea    rax,[rip+0x214]        # adda80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aa20>
      add86c:	49 89 45 28          	mov    QWORD PTR [r13+0x28],rax
      add870:	0f 57 c0             	xorps  xmm0,xmm0
      add873:	41 0f 11 45 30       	movups XMMWORD PTR [r13+0x30],xmm0
      add878:	4c 89 ef             	mov    rdi,r13
      add87b:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
      add87f:	4c 89 e6             	mov    rsi,r12
      add882:	e8 bd 13 ff ff       	call   acec44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbe4>
      add887:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      add88c:	4d 89 2c 24          	mov    QWORD PTR [r12],r13
      add890:	48 89 df             	mov    rdi,rbx
      add893:	4c 89 e6             	mov    rsi,r12
      add896:	e8 7b 02 00 00       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      add89b:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      add8a0:	48 85 ff             	test   rdi,rdi
      add8a3:	74 06                	je     add8ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2a84b>
      add8a5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      add8a8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      add8ab:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
      add8b0:	4c 89 ef             	mov    rdi,r13
      add8b3:	e8 b2 c6 f9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      add8b8:	45 31 f6             	xor    r14d,r14d
      add8bb:	31 ff                	xor    edi,edi
      add8bd:	e8 c4 0b fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      add8c2:	4d 85 ff             	test   r15,r15
      add8c5:	74 08                	je     add8cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2a86f>
      add8c7:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      add8cc:	4d 89 fe             	mov    r14,r15
      add8cf:	48 8d 05 ca 44 d2 00 	lea    rax,[rip+0xd244ca]        # 1801da0 <_ZTIN4asio22service_already_existsE@@Base+0x3588>
      add8d6:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      add8db:	48 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],rbp
      add8e0:	4c 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],r15
      add8e5:	4c 89 6c 24 60       	mov    QWORD PTR [rsp+0x60],r13
      add8ea:	4d 85 f6             	test   r14,r14
      add8ed:	74 05                	je     add8f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2a894>

### call 0xadd965; FDE=(11392980, 11393663)
      add911:	5f                   	pop    rdi
      add912:	e8 e9 05 d1 00       	call   17edf00 <_Znwm@plt>
      add917:	48 89 c5             	mov    rbp,rax
      add91a:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      add91e:	48 8d 05 c3 38 d9 00 	lea    rax,[rip+0xd938c3]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
      add925:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      add929:	4c 89 6d 10          	mov    QWORD PTR [rbp+0x10],r13
      add92d:	4c 89 65 18          	mov    QWORD PTR [rbp+0x18],r12
      add931:	48 8d 05 0c 03 00 00 	lea    rax,[rip+0x30c]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
      add938:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
      add93c:	48 8d 05 0d 03 00 00 	lea    rax,[rip+0x30d]        # addc50 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abf0>
      add943:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
      add947:	0f 57 c0             	xorps  xmm0,xmm0
      add94a:	0f 11 45 30          	movups XMMWORD PTR [rbp+0x30],xmm0
      add94e:	48 89 ef             	mov    rdi,rbp
      add951:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      add955:	e8 ea 12 ff ff       	call   acec44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbe4>
      add95a:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      add95f:	48 89 2e             	mov    QWORD PTR [rsi],rbp
      add962:	48 89 df             	mov    rdi,rbx
      add965:	e8 ac 01 00 00       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      add96a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      add96f:	48 85 ff             	test   rdi,rdi
      add972:	74 06                	je     add97a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2a91a>
      add974:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      add977:	ff 50 08             	call   QWORD PTR [rax+0x8]
      add97a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      add97f:	e8 e6 c5 f9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      add984:	31 ff                	xor    edi,edi
      add986:	e8 fb 0a fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      add98b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      add990:	e8 d5 c5 f9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      add995:	31 ff                	xor    edi,edi
      add997:	e8 ea 0a fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      add99c:	4c 89 ff             	mov    rdi,r15
      add99f:	e8 e2 0a fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      add9a4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      add9ab:	00 00 
      add9ad:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]
      add9b2:	0f 85 c2 00 00 00    	jne    adda7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aa1a>
      add9b8:	48 89 d8             	mov    rax,rbx
      add9bb:	48 83 c4 78          	add    rsp,0x78
      add9bf:	5b                   	pop    rbx

### call 0xb5f73a; FDE=(11925239, 11936142)
      b5f6f2:	e9 93 7c a8 00       	jmp    15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      b5f6f7:	55                   	push   rbp
      b5f6f8:	53                   	push   rbx
      b5f6f9:	48 83 ec 28          	sub    rsp,0x28
      b5f6fd:	89 f5                	mov    ebp,esi
      b5f6ff:	48 89 fb             	mov    rbx,rdi
      b5f702:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b5f709:	00 00 
      b5f70b:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b5f710:	0f 57 c0             	xorps  xmm0,xmm0
      b5f713:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      b5f717:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
      b5f71d:	6a 08                	push   0x8
      b5f71f:	5f                   	pop    rdi
      b5f720:	e8 db e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f725:	48 8d 0d 94 bc cc 00 	lea    rcx,[rip+0xccbc94]        # 182b3c0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x79f0>
      b5f72c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f72f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f734:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f737:	48 89 e7             	mov    rdi,rsp
      b5f73a:	e8 d7 e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f73f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f744:	48 85 ff             	test   rdi,rdi
      b5f747:	74 06                	je     b5f74f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac6ef>
      b5f749:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f74c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f74f:	6a 08                	push   0x8
      b5f751:	5f                   	pop    rdi
      b5f752:	e8 a9 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f757:	48 8d 0d 4a 45 cb 00 	lea    rcx,[rip+0xcb454a]        # 1813ca8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9968>
      b5f75e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f761:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f766:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f769:	48 89 e7             	mov    rdi,rsp
      b5f76c:	e8 a5 e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f771:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f776:	48 85 ff             	test   rdi,rdi
      b5f779:	74 06                	je     b5f781 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac721>
      b5f77b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f77e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f781:	6a 08                	push   0x8
      b5f783:	5f                   	pop    rdi
      b5f784:	e8 77 e7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f76c; FDE=(11925239, 11936142)
      b5f720:	e8 db e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f725:	48 8d 0d 94 bc cc 00 	lea    rcx,[rip+0xccbc94]        # 182b3c0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x79f0>
      b5f72c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f72f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f734:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f737:	48 89 e7             	mov    rdi,rsp
      b5f73a:	e8 d7 e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f73f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f744:	48 85 ff             	test   rdi,rdi
      b5f747:	74 06                	je     b5f74f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac6ef>
      b5f749:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f74c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f74f:	6a 08                	push   0x8
      b5f751:	5f                   	pop    rdi
      b5f752:	e8 a9 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f757:	48 8d 0d 4a 45 cb 00 	lea    rcx,[rip+0xcb454a]        # 1813ca8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9968>
      b5f75e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f761:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f766:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f769:	48 89 e7             	mov    rdi,rsp
      b5f76c:	e8 a5 e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f771:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f776:	48 85 ff             	test   rdi,rdi
      b5f779:	74 06                	je     b5f781 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac721>
      b5f77b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f77e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f781:	6a 08                	push   0x8
      b5f783:	5f                   	pop    rdi
      b5f784:	e8 77 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f789:	48 8d 0d 40 3e cb 00 	lea    rcx,[rip+0xcb3e40]        # 18135d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9290>
      b5f790:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f793:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f798:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f79b:	48 89 e7             	mov    rdi,rsp
      b5f79e:	e8 73 e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f7a3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f7a8:	48 85 ff             	test   rdi,rdi
      b5f7ab:	74 06                	je     b5f7b3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac753>
      b5f7ad:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f7b0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f7b3:	6a 08                	push   0x8
      b5f7b5:	5f                   	pop    rdi
      b5f7b6:	e8 45 e7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f79e; FDE=(11925239, 11936142)
      b5f752:	e8 a9 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f757:	48 8d 0d 4a 45 cb 00 	lea    rcx,[rip+0xcb454a]        # 1813ca8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9968>
      b5f75e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f761:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f766:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f769:	48 89 e7             	mov    rdi,rsp
      b5f76c:	e8 a5 e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f771:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f776:	48 85 ff             	test   rdi,rdi
      b5f779:	74 06                	je     b5f781 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac721>
      b5f77b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f77e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f781:	6a 08                	push   0x8
      b5f783:	5f                   	pop    rdi
      b5f784:	e8 77 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f789:	48 8d 0d 40 3e cb 00 	lea    rcx,[rip+0xcb3e40]        # 18135d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9290>
      b5f790:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f793:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f798:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f79b:	48 89 e7             	mov    rdi,rsp
      b5f79e:	e8 73 e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f7a3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f7a8:	48 85 ff             	test   rdi,rdi
      b5f7ab:	74 06                	je     b5f7b3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac753>
      b5f7ad:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f7b0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f7b3:	6a 08                	push   0x8
      b5f7b5:	5f                   	pop    rdi
      b5f7b6:	e8 45 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f7bb:	48 8d 0d 36 b2 ce 00 	lea    rcx,[rip+0xceb236]        # 184a9f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x70e0>
      b5f7c2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f7c5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f7ca:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f7cd:	48 89 e7             	mov    rdi,rsp
      b5f7d0:	e8 41 e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f7d5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f7da:	48 85 ff             	test   rdi,rdi
      b5f7dd:	74 06                	je     b5f7e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac785>
      b5f7df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f7e2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f7e5:	6a 08                	push   0x8
      b5f7e7:	5f                   	pop    rdi
      b5f7e8:	e8 13 e7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f7d0; FDE=(11925239, 11936142)
      b5f784:	e8 77 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f789:	48 8d 0d 40 3e cb 00 	lea    rcx,[rip+0xcb3e40]        # 18135d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9290>
      b5f790:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f793:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f798:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f79b:	48 89 e7             	mov    rdi,rsp
      b5f79e:	e8 73 e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f7a3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f7a8:	48 85 ff             	test   rdi,rdi
      b5f7ab:	74 06                	je     b5f7b3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac753>
      b5f7ad:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f7b0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f7b3:	6a 08                	push   0x8
      b5f7b5:	5f                   	pop    rdi
      b5f7b6:	e8 45 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f7bb:	48 8d 0d 36 b2 ce 00 	lea    rcx,[rip+0xceb236]        # 184a9f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x70e0>
      b5f7c2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f7c5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f7ca:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f7cd:	48 89 e7             	mov    rdi,rsp
      b5f7d0:	e8 41 e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f7d5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f7da:	48 85 ff             	test   rdi,rdi
      b5f7dd:	74 06                	je     b5f7e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac785>
      b5f7df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f7e2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f7e5:	6a 08                	push   0x8
      b5f7e7:	5f                   	pop    rdi
      b5f7e8:	e8 13 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f7ed:	48 8d 0d c4 b1 ce 00 	lea    rcx,[rip+0xceb1c4]        # 184a9b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x70a0>
      b5f7f4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f7f7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f7fc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f7ff:	48 89 e7             	mov    rdi,rsp
      b5f802:	e8 0f e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f807:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f80c:	48 85 ff             	test   rdi,rdi
      b5f80f:	74 06                	je     b5f817 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac7b7>
      b5f811:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f814:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f817:	6a 08                	push   0x8
      b5f819:	5f                   	pop    rdi
      b5f81a:	e8 e1 e6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f802; FDE=(11925239, 11936142)
      b5f7b6:	e8 45 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f7bb:	48 8d 0d 36 b2 ce 00 	lea    rcx,[rip+0xceb236]        # 184a9f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x70e0>
      b5f7c2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f7c5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f7ca:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f7cd:	48 89 e7             	mov    rdi,rsp
      b5f7d0:	e8 41 e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f7d5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f7da:	48 85 ff             	test   rdi,rdi
      b5f7dd:	74 06                	je     b5f7e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac785>
      b5f7df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f7e2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f7e5:	6a 08                	push   0x8
      b5f7e7:	5f                   	pop    rdi
      b5f7e8:	e8 13 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f7ed:	48 8d 0d c4 b1 ce 00 	lea    rcx,[rip+0xceb1c4]        # 184a9b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x70a0>
      b5f7f4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f7f7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f7fc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f7ff:	48 89 e7             	mov    rdi,rsp
      b5f802:	e8 0f e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f807:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f80c:	48 85 ff             	test   rdi,rdi
      b5f80f:	74 06                	je     b5f817 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac7b7>
      b5f811:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f814:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f817:	6a 08                	push   0x8
      b5f819:	5f                   	pop    rdi
      b5f81a:	e8 e1 e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f81f:	48 8d 0d 6a d5 cb 00 	lea    rcx,[rip+0xcbd56a]        # 181cd90 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12a50>
      b5f826:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f829:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f82e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f831:	48 89 e7             	mov    rdi,rsp
      b5f834:	e8 dd e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f839:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f83e:	48 85 ff             	test   rdi,rdi
      b5f841:	74 06                	je     b5f849 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac7e9>
      b5f843:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f846:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f849:	6a 08                	push   0x8
      b5f84b:	5f                   	pop    rdi
      b5f84c:	e8 af e6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f834; FDE=(11925239, 11936142)
      b5f7e8:	e8 13 e7 c8 00       	call   17edf00 <_Znwm@plt>
      b5f7ed:	48 8d 0d c4 b1 ce 00 	lea    rcx,[rip+0xceb1c4]        # 184a9b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x70a0>
      b5f7f4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f7f7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f7fc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f7ff:	48 89 e7             	mov    rdi,rsp
      b5f802:	e8 0f e3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f807:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f80c:	48 85 ff             	test   rdi,rdi
      b5f80f:	74 06                	je     b5f817 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac7b7>
      b5f811:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f814:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f817:	6a 08                	push   0x8
      b5f819:	5f                   	pop    rdi
      b5f81a:	e8 e1 e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f81f:	48 8d 0d 6a d5 cb 00 	lea    rcx,[rip+0xcbd56a]        # 181cd90 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12a50>
      b5f826:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f829:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f82e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f831:	48 89 e7             	mov    rdi,rsp
      b5f834:	e8 dd e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f839:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f83e:	48 85 ff             	test   rdi,rdi
      b5f841:	74 06                	je     b5f849 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac7e9>
      b5f843:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f846:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f849:	6a 08                	push   0x8
      b5f84b:	5f                   	pop    rdi
      b5f84c:	e8 af e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f851:	48 8d 0d f8 d4 cb 00 	lea    rcx,[rip+0xcbd4f8]        # 181cd50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12a10>
      b5f858:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f85b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f860:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f863:	48 89 e7             	mov    rdi,rsp
      b5f866:	e8 ab e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f86b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f870:	48 85 ff             	test   rdi,rdi
      b5f873:	74 06                	je     b5f87b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac81b>
      b5f875:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f878:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f87b:	6a 08                	push   0x8
      b5f87d:	5f                   	pop    rdi
      b5f87e:	e8 7d e6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f866; FDE=(11925239, 11936142)
      b5f81a:	e8 e1 e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f81f:	48 8d 0d 6a d5 cb 00 	lea    rcx,[rip+0xcbd56a]        # 181cd90 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12a50>
      b5f826:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f829:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f82e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f831:	48 89 e7             	mov    rdi,rsp
      b5f834:	e8 dd e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f839:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f83e:	48 85 ff             	test   rdi,rdi
      b5f841:	74 06                	je     b5f849 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac7e9>
      b5f843:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f846:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f849:	6a 08                	push   0x8
      b5f84b:	5f                   	pop    rdi
      b5f84c:	e8 af e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f851:	48 8d 0d f8 d4 cb 00 	lea    rcx,[rip+0xcbd4f8]        # 181cd50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12a10>
      b5f858:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f85b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f860:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f863:	48 89 e7             	mov    rdi,rsp
      b5f866:	e8 ab e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f86b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f870:	48 85 ff             	test   rdi,rdi
      b5f873:	74 06                	je     b5f87b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac81b>
      b5f875:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f878:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f87b:	6a 08                	push   0x8
      b5f87d:	5f                   	pop    rdi
      b5f87e:	e8 7d e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f883:	48 8d 0d c6 f2 cb 00 	lea    rcx,[rip+0xcbf2c6]        # 181eb50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14810>
      b5f88a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f88d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f892:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f895:	48 89 e7             	mov    rdi,rsp
      b5f898:	e8 79 e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f89d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f8a2:	48 85 ff             	test   rdi,rdi
      b5f8a5:	74 06                	je     b5f8ad <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac84d>
      b5f8a7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f8aa:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f8ad:	6a 08                	push   0x8
      b5f8af:	5f                   	pop    rdi
      b5f8b0:	e8 4b e6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f898; FDE=(11925239, 11936142)
      b5f84c:	e8 af e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f851:	48 8d 0d f8 d4 cb 00 	lea    rcx,[rip+0xcbd4f8]        # 181cd50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12a10>
      b5f858:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f85b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f860:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f863:	48 89 e7             	mov    rdi,rsp
      b5f866:	e8 ab e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f86b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f870:	48 85 ff             	test   rdi,rdi
      b5f873:	74 06                	je     b5f87b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac81b>
      b5f875:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f878:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f87b:	6a 08                	push   0x8
      b5f87d:	5f                   	pop    rdi
      b5f87e:	e8 7d e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f883:	48 8d 0d c6 f2 cb 00 	lea    rcx,[rip+0xcbf2c6]        # 181eb50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14810>
      b5f88a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f88d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f892:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f895:	48 89 e7             	mov    rdi,rsp
      b5f898:	e8 79 e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f89d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f8a2:	48 85 ff             	test   rdi,rdi
      b5f8a5:	74 06                	je     b5f8ad <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac84d>
      b5f8a7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f8aa:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f8ad:	6a 08                	push   0x8
      b5f8af:	5f                   	pop    rdi
      b5f8b0:	e8 4b e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f8b5:	48 8d 0d 9c 8b cb 00 	lea    rcx,[rip+0xcb8b9c]        # 1818458 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe118>
      b5f8bc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f8bf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f8c4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f8c7:	48 89 e7             	mov    rdi,rsp
      b5f8ca:	e8 47 e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f8cf:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f8d4:	48 85 ff             	test   rdi,rdi
      b5f8d7:	74 06                	je     b5f8df <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac87f>
      b5f8d9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f8dc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f8df:	6a 08                	push   0x8
      b5f8e1:	5f                   	pop    rdi
      b5f8e2:	e8 19 e6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f8ca; FDE=(11925239, 11936142)
      b5f87e:	e8 7d e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f883:	48 8d 0d c6 f2 cb 00 	lea    rcx,[rip+0xcbf2c6]        # 181eb50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14810>
      b5f88a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f88d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f892:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f895:	48 89 e7             	mov    rdi,rsp
      b5f898:	e8 79 e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f89d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f8a2:	48 85 ff             	test   rdi,rdi
      b5f8a5:	74 06                	je     b5f8ad <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac84d>
      b5f8a7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f8aa:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f8ad:	6a 08                	push   0x8
      b5f8af:	5f                   	pop    rdi
      b5f8b0:	e8 4b e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f8b5:	48 8d 0d 9c 8b cb 00 	lea    rcx,[rip+0xcb8b9c]        # 1818458 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe118>
      b5f8bc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f8bf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f8c4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f8c7:	48 89 e7             	mov    rdi,rsp
      b5f8ca:	e8 47 e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f8cf:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f8d4:	48 85 ff             	test   rdi,rdi
      b5f8d7:	74 06                	je     b5f8df <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac87f>
      b5f8d9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f8dc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f8df:	6a 08                	push   0x8
      b5f8e1:	5f                   	pop    rdi
      b5f8e2:	e8 19 e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f8e7:	48 8d 0d e2 d3 cb 00 	lea    rcx,[rip+0xcbd3e2]        # 181ccd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12990>
      b5f8ee:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f8f1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f8f6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f8f9:	48 89 e7             	mov    rdi,rsp
      b5f8fc:	e8 15 e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f901:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f906:	48 85 ff             	test   rdi,rdi
      b5f909:	74 06                	je     b5f911 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac8b1>
      b5f90b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f90e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f911:	6a 08                	push   0x8
      b5f913:	5f                   	pop    rdi
      b5f914:	e8 e7 e5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f8fc; FDE=(11925239, 11936142)
      b5f8b0:	e8 4b e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f8b5:	48 8d 0d 9c 8b cb 00 	lea    rcx,[rip+0xcb8b9c]        # 1818458 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe118>
      b5f8bc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f8bf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f8c4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f8c7:	48 89 e7             	mov    rdi,rsp
      b5f8ca:	e8 47 e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f8cf:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f8d4:	48 85 ff             	test   rdi,rdi
      b5f8d7:	74 06                	je     b5f8df <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac87f>
      b5f8d9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f8dc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f8df:	6a 08                	push   0x8
      b5f8e1:	5f                   	pop    rdi
      b5f8e2:	e8 19 e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f8e7:	48 8d 0d e2 d3 cb 00 	lea    rcx,[rip+0xcbd3e2]        # 181ccd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12990>
      b5f8ee:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f8f1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f8f6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f8f9:	48 89 e7             	mov    rdi,rsp
      b5f8fc:	e8 15 e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f901:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f906:	48 85 ff             	test   rdi,rdi
      b5f909:	74 06                	je     b5f911 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac8b1>
      b5f90b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f90e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f911:	6a 08                	push   0x8
      b5f913:	5f                   	pop    rdi
      b5f914:	e8 e7 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f919:	48 8d 0d 38 4d cc 00 	lea    rcx,[rip+0xcc4d38]        # 1824658 <_ZTIN4asio2ip16bad_address_castE@@Base+0xc88>
      b5f920:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f923:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f928:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f92b:	48 89 e7             	mov    rdi,rsp
      b5f92e:	e8 e3 e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f933:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f938:	48 85 ff             	test   rdi,rdi
      b5f93b:	74 06                	je     b5f943 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac8e3>
      b5f93d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f940:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f943:	6a 08                	push   0x8
      b5f945:	5f                   	pop    rdi
      b5f946:	e8 b5 e5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f92e; FDE=(11925239, 11936142)
      b5f8e2:	e8 19 e6 c8 00       	call   17edf00 <_Znwm@plt>
      b5f8e7:	48 8d 0d e2 d3 cb 00 	lea    rcx,[rip+0xcbd3e2]        # 181ccd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12990>
      b5f8ee:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f8f1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f8f6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f8f9:	48 89 e7             	mov    rdi,rsp
      b5f8fc:	e8 15 e2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f901:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f906:	48 85 ff             	test   rdi,rdi
      b5f909:	74 06                	je     b5f911 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac8b1>
      b5f90b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f90e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f911:	6a 08                	push   0x8
      b5f913:	5f                   	pop    rdi
      b5f914:	e8 e7 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f919:	48 8d 0d 38 4d cc 00 	lea    rcx,[rip+0xcc4d38]        # 1824658 <_ZTIN4asio2ip16bad_address_castE@@Base+0xc88>
      b5f920:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f923:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f928:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f92b:	48 89 e7             	mov    rdi,rsp
      b5f92e:	e8 e3 e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f933:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f938:	48 85 ff             	test   rdi,rdi
      b5f93b:	74 06                	je     b5f943 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac8e3>
      b5f93d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f940:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f943:	6a 08                	push   0x8
      b5f945:	5f                   	pop    rdi
      b5f946:	e8 b5 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f94b:	48 8d 0d b6 af cb 00 	lea    rcx,[rip+0xcbafb6]        # 181a908 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x105c8>
      b5f952:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f955:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f95a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f95d:	48 89 e7             	mov    rdi,rsp
      b5f960:	e8 b1 e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f965:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f96a:	48 85 ff             	test   rdi,rdi
      b5f96d:	74 06                	je     b5f975 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac915>
      b5f96f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f972:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f975:	6a 08                	push   0x8
      b5f977:	5f                   	pop    rdi
      b5f978:	e8 83 e5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f960; FDE=(11925239, 11936142)
      b5f914:	e8 e7 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f919:	48 8d 0d 38 4d cc 00 	lea    rcx,[rip+0xcc4d38]        # 1824658 <_ZTIN4asio2ip16bad_address_castE@@Base+0xc88>
      b5f920:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f923:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f928:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f92b:	48 89 e7             	mov    rdi,rsp
      b5f92e:	e8 e3 e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f933:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f938:	48 85 ff             	test   rdi,rdi
      b5f93b:	74 06                	je     b5f943 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac8e3>
      b5f93d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f940:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f943:	6a 08                	push   0x8
      b5f945:	5f                   	pop    rdi
      b5f946:	e8 b5 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f94b:	48 8d 0d b6 af cb 00 	lea    rcx,[rip+0xcbafb6]        # 181a908 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x105c8>
      b5f952:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f955:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f95a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f95d:	48 89 e7             	mov    rdi,rsp
      b5f960:	e8 b1 e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f965:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f96a:	48 85 ff             	test   rdi,rdi
      b5f96d:	74 06                	je     b5f975 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac915>
      b5f96f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f972:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f975:	6a 08                	push   0x8
      b5f977:	5f                   	pop    rdi
      b5f978:	e8 83 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f97d:	48 8d 0d 44 af cb 00 	lea    rcx,[rip+0xcbaf44]        # 181a8c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10588>
      b5f984:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f987:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f98c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f98f:	48 89 e7             	mov    rdi,rsp
      b5f992:	e8 7f e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f997:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f99c:	48 85 ff             	test   rdi,rdi
      b5f99f:	74 06                	je     b5f9a7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac947>
      b5f9a1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f9a4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f9a7:	6a 08                	push   0x8
      b5f9a9:	5f                   	pop    rdi
      b5f9aa:	e8 51 e5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f992; FDE=(11925239, 11936142)
      b5f946:	e8 b5 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f94b:	48 8d 0d b6 af cb 00 	lea    rcx,[rip+0xcbafb6]        # 181a908 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x105c8>
      b5f952:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f955:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f95a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f95d:	48 89 e7             	mov    rdi,rsp
      b5f960:	e8 b1 e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f965:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f96a:	48 85 ff             	test   rdi,rdi
      b5f96d:	74 06                	je     b5f975 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac915>
      b5f96f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f972:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f975:	6a 08                	push   0x8
      b5f977:	5f                   	pop    rdi
      b5f978:	e8 83 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f97d:	48 8d 0d 44 af cb 00 	lea    rcx,[rip+0xcbaf44]        # 181a8c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10588>
      b5f984:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f987:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f98c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f98f:	48 89 e7             	mov    rdi,rsp
      b5f992:	e8 7f e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f997:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f99c:	48 85 ff             	test   rdi,rdi
      b5f99f:	74 06                	je     b5f9a7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac947>
      b5f9a1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f9a4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f9a7:	6a 08                	push   0x8
      b5f9a9:	5f                   	pop    rdi
      b5f9aa:	e8 51 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f9af:	48 8d 0d 22 8e cb 00 	lea    rcx,[rip+0xcb8e22]        # 18187d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe498>
      b5f9b6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f9b9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f9be:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f9c1:	48 89 e7             	mov    rdi,rsp
      b5f9c4:	e8 4d e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f9c9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f9ce:	48 85 ff             	test   rdi,rdi
      b5f9d1:	74 06                	je     b5f9d9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac979>
      b5f9d3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f9d6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f9d9:	6a 08                	push   0x8
      b5f9db:	5f                   	pop    rdi
      b5f9dc:	e8 1f e5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f9c4; FDE=(11925239, 11936142)
      b5f978:	e8 83 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f97d:	48 8d 0d 44 af cb 00 	lea    rcx,[rip+0xcbaf44]        # 181a8c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10588>
      b5f984:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f987:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f98c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f98f:	48 89 e7             	mov    rdi,rsp
      b5f992:	e8 7f e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f997:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f99c:	48 85 ff             	test   rdi,rdi
      b5f99f:	74 06                	je     b5f9a7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac947>
      b5f9a1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f9a4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f9a7:	6a 08                	push   0x8
      b5f9a9:	5f                   	pop    rdi
      b5f9aa:	e8 51 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f9af:	48 8d 0d 22 8e cb 00 	lea    rcx,[rip+0xcb8e22]        # 18187d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe498>
      b5f9b6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f9b9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f9be:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f9c1:	48 89 e7             	mov    rdi,rsp
      b5f9c4:	e8 4d e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f9c9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f9ce:	48 85 ff             	test   rdi,rdi
      b5f9d1:	74 06                	je     b5f9d9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac979>
      b5f9d3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f9d6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f9d9:	6a 08                	push   0x8
      b5f9db:	5f                   	pop    rdi
      b5f9dc:	e8 1f e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f9e1:	48 8d 0d b0 c2 cb 00 	lea    rcx,[rip+0xcbc2b0]        # 181bc98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11958>
      b5f9e8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f9eb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f9f0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f9f3:	48 89 e7             	mov    rdi,rsp
      b5f9f6:	e8 1b e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f9fb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa00:	48 85 ff             	test   rdi,rdi
      b5fa03:	74 06                	je     b5fa0b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac9ab>
      b5fa05:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa08:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fa0b:	6a 08                	push   0x8
      b5fa0d:	5f                   	pop    rdi
      b5fa0e:	e8 ed e4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5f9f6; FDE=(11925239, 11936142)
      b5f9aa:	e8 51 e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f9af:	48 8d 0d 22 8e cb 00 	lea    rcx,[rip+0xcb8e22]        # 18187d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe498>
      b5f9b6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f9b9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f9be:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f9c1:	48 89 e7             	mov    rdi,rsp
      b5f9c4:	e8 4d e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f9c9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5f9ce:	48 85 ff             	test   rdi,rdi
      b5f9d1:	74 06                	je     b5f9d9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac979>
      b5f9d3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5f9d6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5f9d9:	6a 08                	push   0x8
      b5f9db:	5f                   	pop    rdi
      b5f9dc:	e8 1f e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f9e1:	48 8d 0d b0 c2 cb 00 	lea    rcx,[rip+0xcbc2b0]        # 181bc98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11958>
      b5f9e8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f9eb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f9f0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f9f3:	48 89 e7             	mov    rdi,rsp
      b5f9f6:	e8 1b e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f9fb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa00:	48 85 ff             	test   rdi,rdi
      b5fa03:	74 06                	je     b5fa0b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac9ab>
      b5fa05:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa08:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fa0b:	6a 08                	push   0x8
      b5fa0d:	5f                   	pop    rdi
      b5fa0e:	e8 ed e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fa13:	48 8d 0d e6 ed ca 00 	lea    rcx,[rip+0xcaede6]        # 180e800 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x44c0>
      b5fa1a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fa1d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fa22:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fa25:	48 89 e7             	mov    rdi,rsp
      b5fa28:	e8 e9 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fa2d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa32:	48 85 ff             	test   rdi,rdi
      b5fa35:	74 06                	je     b5fa3d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac9dd>
      b5fa37:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa3a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fa3d:	6a 08                	push   0x8
      b5fa3f:	5f                   	pop    rdi
      b5fa40:	e8 bb e4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fa28; FDE=(11925239, 11936142)
      b5f9dc:	e8 1f e5 c8 00       	call   17edf00 <_Znwm@plt>
      b5f9e1:	48 8d 0d b0 c2 cb 00 	lea    rcx,[rip+0xcbc2b0]        # 181bc98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11958>
      b5f9e8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5f9eb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5f9f0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5f9f3:	48 89 e7             	mov    rdi,rsp
      b5f9f6:	e8 1b e1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5f9fb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa00:	48 85 ff             	test   rdi,rdi
      b5fa03:	74 06                	je     b5fa0b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac9ab>
      b5fa05:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa08:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fa0b:	6a 08                	push   0x8
      b5fa0d:	5f                   	pop    rdi
      b5fa0e:	e8 ed e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fa13:	48 8d 0d e6 ed ca 00 	lea    rcx,[rip+0xcaede6]        # 180e800 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x44c0>
      b5fa1a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fa1d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fa22:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fa25:	48 89 e7             	mov    rdi,rsp
      b5fa28:	e8 e9 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fa2d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa32:	48 85 ff             	test   rdi,rdi
      b5fa35:	74 06                	je     b5fa3d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac9dd>
      b5fa37:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa3a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fa3d:	6a 08                	push   0x8
      b5fa3f:	5f                   	pop    rdi
      b5fa40:	e8 bb e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fa45:	48 8d 0d 84 8a cb 00 	lea    rcx,[rip+0xcb8a84]        # 18184d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe190>
      b5fa4c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fa4f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fa54:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fa57:	48 89 e7             	mov    rdi,rsp
      b5fa5a:	e8 b7 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fa5f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa64:	48 85 ff             	test   rdi,rdi
      b5fa67:	74 06                	je     b5fa6f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaca0f>
      b5fa69:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa6c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fa6f:	6a 08                	push   0x8
      b5fa71:	5f                   	pop    rdi
      b5fa72:	e8 89 e4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fa5a; FDE=(11925239, 11936142)
      b5fa0e:	e8 ed e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fa13:	48 8d 0d e6 ed ca 00 	lea    rcx,[rip+0xcaede6]        # 180e800 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x44c0>
      b5fa1a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fa1d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fa22:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fa25:	48 89 e7             	mov    rdi,rsp
      b5fa28:	e8 e9 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fa2d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa32:	48 85 ff             	test   rdi,rdi
      b5fa35:	74 06                	je     b5fa3d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac9dd>
      b5fa37:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa3a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fa3d:	6a 08                	push   0x8
      b5fa3f:	5f                   	pop    rdi
      b5fa40:	e8 bb e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fa45:	48 8d 0d 84 8a cb 00 	lea    rcx,[rip+0xcb8a84]        # 18184d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe190>
      b5fa4c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fa4f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fa54:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fa57:	48 89 e7             	mov    rdi,rsp
      b5fa5a:	e8 b7 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fa5f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa64:	48 85 ff             	test   rdi,rdi
      b5fa67:	74 06                	je     b5fa6f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaca0f>
      b5fa69:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa6c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fa6f:	6a 08                	push   0x8
      b5fa71:	5f                   	pop    rdi
      b5fa72:	e8 89 e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fa77:	48 8d 0d 52 ad cb 00 	lea    rcx,[rip+0xcbad52]        # 181a7d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10490>
      b5fa7e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fa81:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fa86:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fa89:	48 89 e7             	mov    rdi,rsp
      b5fa8c:	e8 85 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fa91:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa96:	48 85 ff             	test   rdi,rdi
      b5fa99:	74 06                	je     b5faa1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaca41>
      b5fa9b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa9e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5faa1:	6a 08                	push   0x8
      b5faa3:	5f                   	pop    rdi
      b5faa4:	e8 57 e4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fa8c; FDE=(11925239, 11936142)
      b5fa40:	e8 bb e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fa45:	48 8d 0d 84 8a cb 00 	lea    rcx,[rip+0xcb8a84]        # 18184d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe190>
      b5fa4c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fa4f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fa54:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fa57:	48 89 e7             	mov    rdi,rsp
      b5fa5a:	e8 b7 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fa5f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa64:	48 85 ff             	test   rdi,rdi
      b5fa67:	74 06                	je     b5fa6f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaca0f>
      b5fa69:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa6c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fa6f:	6a 08                	push   0x8
      b5fa71:	5f                   	pop    rdi
      b5fa72:	e8 89 e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fa77:	48 8d 0d 52 ad cb 00 	lea    rcx,[rip+0xcbad52]        # 181a7d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10490>
      b5fa7e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fa81:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fa86:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fa89:	48 89 e7             	mov    rdi,rsp
      b5fa8c:	e8 85 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fa91:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa96:	48 85 ff             	test   rdi,rdi
      b5fa99:	74 06                	je     b5faa1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaca41>
      b5fa9b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa9e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5faa1:	6a 08                	push   0x8
      b5faa3:	5f                   	pop    rdi
      b5faa4:	e8 57 e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5faa9:	48 8d 0d 58 e7 ca 00 	lea    rcx,[rip+0xcae758]        # 180e208 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3ec8>
      b5fab0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fab3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fab8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fabb:	48 89 e7             	mov    rdi,rsp
      b5fabe:	e8 53 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fac3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fac8:	48 85 ff             	test   rdi,rdi
      b5facb:	74 06                	je     b5fad3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaca73>
      b5facd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fad0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fad3:	6a 08                	push   0x8
      b5fad5:	5f                   	pop    rdi
      b5fad6:	e8 25 e4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fabe; FDE=(11925239, 11936142)
      b5fa72:	e8 89 e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fa77:	48 8d 0d 52 ad cb 00 	lea    rcx,[rip+0xcbad52]        # 181a7d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x10490>
      b5fa7e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fa81:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fa86:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fa89:	48 89 e7             	mov    rdi,rsp
      b5fa8c:	e8 85 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fa91:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fa96:	48 85 ff             	test   rdi,rdi
      b5fa99:	74 06                	je     b5faa1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaca41>
      b5fa9b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fa9e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5faa1:	6a 08                	push   0x8
      b5faa3:	5f                   	pop    rdi
      b5faa4:	e8 57 e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5faa9:	48 8d 0d 58 e7 ca 00 	lea    rcx,[rip+0xcae758]        # 180e208 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3ec8>
      b5fab0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fab3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fab8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fabb:	48 89 e7             	mov    rdi,rsp
      b5fabe:	e8 53 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fac3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fac8:	48 85 ff             	test   rdi,rdi
      b5facb:	74 06                	je     b5fad3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaca73>
      b5facd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fad0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fad3:	6a 08                	push   0x8
      b5fad5:	5f                   	pop    rdi
      b5fad6:	e8 25 e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fadb:	48 8d 0d d6 bd cb 00 	lea    rcx,[rip+0xcbbdd6]        # 181b8b8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11578>
      b5fae2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fae5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5faea:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5faed:	48 89 e7             	mov    rdi,rsp
      b5faf0:	e8 21 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5faf5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fafa:	48 85 ff             	test   rdi,rdi
      b5fafd:	74 06                	je     b5fb05 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacaa5>
      b5faff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb02:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb05:	6a 08                	push   0x8
      b5fb07:	5f                   	pop    rdi
      b5fb08:	e8 f3 e3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5faf0; FDE=(11925239, 11936142)
      b5faa4:	e8 57 e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5faa9:	48 8d 0d 58 e7 ca 00 	lea    rcx,[rip+0xcae758]        # 180e208 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3ec8>
      b5fab0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fab3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fab8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fabb:	48 89 e7             	mov    rdi,rsp
      b5fabe:	e8 53 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fac3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fac8:	48 85 ff             	test   rdi,rdi
      b5facb:	74 06                	je     b5fad3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaca73>
      b5facd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fad0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fad3:	6a 08                	push   0x8
      b5fad5:	5f                   	pop    rdi
      b5fad6:	e8 25 e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fadb:	48 8d 0d d6 bd cb 00 	lea    rcx,[rip+0xcbbdd6]        # 181b8b8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11578>
      b5fae2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fae5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5faea:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5faed:	48 89 e7             	mov    rdi,rsp
      b5faf0:	e8 21 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5faf5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fafa:	48 85 ff             	test   rdi,rdi
      b5fafd:	74 06                	je     b5fb05 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacaa5>
      b5faff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb02:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb05:	6a 08                	push   0x8
      b5fb07:	5f                   	pop    rdi
      b5fb08:	e8 f3 e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fb0d:	48 8d 0d 7c d7 cb 00 	lea    rcx,[rip+0xcbd77c]        # 181d290 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12f50>
      b5fb14:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fb17:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fb1c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fb1f:	48 89 e7             	mov    rdi,rsp
      b5fb22:	e8 ef df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fb27:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fb2c:	48 85 ff             	test   rdi,rdi
      b5fb2f:	74 06                	je     b5fb37 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacad7>
      b5fb31:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb34:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb37:	6a 08                	push   0x8
      b5fb39:	5f                   	pop    rdi
      b5fb3a:	e8 c1 e3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fb22; FDE=(11925239, 11936142)
      b5fad6:	e8 25 e4 c8 00       	call   17edf00 <_Znwm@plt>
      b5fadb:	48 8d 0d d6 bd cb 00 	lea    rcx,[rip+0xcbbdd6]        # 181b8b8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11578>
      b5fae2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fae5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5faea:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5faed:	48 89 e7             	mov    rdi,rsp
      b5faf0:	e8 21 e0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5faf5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fafa:	48 85 ff             	test   rdi,rdi
      b5fafd:	74 06                	je     b5fb05 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacaa5>
      b5faff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb02:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb05:	6a 08                	push   0x8
      b5fb07:	5f                   	pop    rdi
      b5fb08:	e8 f3 e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fb0d:	48 8d 0d 7c d7 cb 00 	lea    rcx,[rip+0xcbd77c]        # 181d290 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12f50>
      b5fb14:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fb17:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fb1c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fb1f:	48 89 e7             	mov    rdi,rsp
      b5fb22:	e8 ef df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fb27:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fb2c:	48 85 ff             	test   rdi,rdi
      b5fb2f:	74 06                	je     b5fb37 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacad7>
      b5fb31:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb34:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb37:	6a 08                	push   0x8
      b5fb39:	5f                   	pop    rdi
      b5fb3a:	e8 c1 e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fb3f:	48 8d 0d 22 d4 cb 00 	lea    rcx,[rip+0xcbd422]        # 181cf68 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12c28>
      b5fb46:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fb49:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fb4e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fb51:	48 89 e7             	mov    rdi,rsp
      b5fb54:	e8 bd df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fb59:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fb5e:	48 85 ff             	test   rdi,rdi
      b5fb61:	74 06                	je     b5fb69 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb09>
      b5fb63:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb66:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb69:	6a 08                	push   0x8
      b5fb6b:	5f                   	pop    rdi
      b5fb6c:	e8 8f e3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fb54; FDE=(11925239, 11936142)
      b5fb08:	e8 f3 e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fb0d:	48 8d 0d 7c d7 cb 00 	lea    rcx,[rip+0xcbd77c]        # 181d290 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12f50>
      b5fb14:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fb17:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fb1c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fb1f:	48 89 e7             	mov    rdi,rsp
      b5fb22:	e8 ef df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fb27:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fb2c:	48 85 ff             	test   rdi,rdi
      b5fb2f:	74 06                	je     b5fb37 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacad7>
      b5fb31:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb34:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb37:	6a 08                	push   0x8
      b5fb39:	5f                   	pop    rdi
      b5fb3a:	e8 c1 e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fb3f:	48 8d 0d 22 d4 cb 00 	lea    rcx,[rip+0xcbd422]        # 181cf68 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12c28>
      b5fb46:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fb49:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fb4e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fb51:	48 89 e7             	mov    rdi,rsp
      b5fb54:	e8 bd df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fb59:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fb5e:	48 85 ff             	test   rdi,rdi
      b5fb61:	74 06                	je     b5fb69 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb09>
      b5fb63:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb66:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb69:	6a 08                	push   0x8
      b5fb6b:	5f                   	pop    rdi
      b5fb6c:	e8 8f e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fb71:	48 8d 0d e8 54 cc 00 	lea    rcx,[rip+0xcc54e8]        # 1825060 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1690>
      b5fb78:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fb7b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fb80:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fb83:	48 89 e7             	mov    rdi,rsp
      b5fb86:	e8 8b df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fb8b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fb90:	48 85 ff             	test   rdi,rdi
      b5fb93:	74 06                	je     b5fb9b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb3b>
      b5fb95:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb98:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb9b:	6a 08                	push   0x8
      b5fb9d:	5f                   	pop    rdi
      b5fb9e:	e8 5d e3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fb86; FDE=(11925239, 11936142)
      b5fb3a:	e8 c1 e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fb3f:	48 8d 0d 22 d4 cb 00 	lea    rcx,[rip+0xcbd422]        # 181cf68 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12c28>
      b5fb46:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fb49:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fb4e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fb51:	48 89 e7             	mov    rdi,rsp
      b5fb54:	e8 bd df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fb59:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fb5e:	48 85 ff             	test   rdi,rdi
      b5fb61:	74 06                	je     b5fb69 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb09>
      b5fb63:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb66:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb69:	6a 08                	push   0x8
      b5fb6b:	5f                   	pop    rdi
      b5fb6c:	e8 8f e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fb71:	48 8d 0d e8 54 cc 00 	lea    rcx,[rip+0xcc54e8]        # 1825060 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1690>
      b5fb78:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fb7b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fb80:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fb83:	48 89 e7             	mov    rdi,rsp
      b5fb86:	e8 8b df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fb8b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fb90:	48 85 ff             	test   rdi,rdi
      b5fb93:	74 06                	je     b5fb9b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb3b>
      b5fb95:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb98:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb9b:	6a 08                	push   0x8
      b5fb9d:	5f                   	pop    rdi
      b5fb9e:	e8 5d e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fba3:	48 8d 0d 36 d8 cb 00 	lea    rcx,[rip+0xcbd836]        # 181d3e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x130a0>
      b5fbaa:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fbad:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fbb2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fbb5:	48 89 e7             	mov    rdi,rsp
      b5fbb8:	e8 59 df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fbbd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fbc2:	48 85 ff             	test   rdi,rdi
      b5fbc5:	74 06                	je     b5fbcd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb6d>
      b5fbc7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fbca:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fbcd:	6a 08                	push   0x8
      b5fbcf:	5f                   	pop    rdi
      b5fbd0:	e8 2b e3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fbb8; FDE=(11925239, 11936142)
      b5fb6c:	e8 8f e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fb71:	48 8d 0d e8 54 cc 00 	lea    rcx,[rip+0xcc54e8]        # 1825060 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1690>
      b5fb78:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fb7b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fb80:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fb83:	48 89 e7             	mov    rdi,rsp
      b5fb86:	e8 8b df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fb8b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fb90:	48 85 ff             	test   rdi,rdi
      b5fb93:	74 06                	je     b5fb9b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb3b>
      b5fb95:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fb98:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fb9b:	6a 08                	push   0x8
      b5fb9d:	5f                   	pop    rdi
      b5fb9e:	e8 5d e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fba3:	48 8d 0d 36 d8 cb 00 	lea    rcx,[rip+0xcbd836]        # 181d3e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x130a0>
      b5fbaa:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fbad:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fbb2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fbb5:	48 89 e7             	mov    rdi,rsp
      b5fbb8:	e8 59 df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fbbd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fbc2:	48 85 ff             	test   rdi,rdi
      b5fbc5:	74 06                	je     b5fbcd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb6d>
      b5fbc7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fbca:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fbcd:	6a 08                	push   0x8
      b5fbcf:	5f                   	pop    rdi
      b5fbd0:	e8 2b e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fbd5:	48 8d 0d a4 23 cc 00 	lea    rcx,[rip+0xcc23a4]        # 1821f80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17c40>
      b5fbdc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fbdf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fbe4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fbe7:	48 89 e7             	mov    rdi,rsp
      b5fbea:	e8 27 df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fbef:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fbf4:	48 85 ff             	test   rdi,rdi
      b5fbf7:	74 06                	je     b5fbff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb9f>
      b5fbf9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fbfc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fbff:	6a 08                	push   0x8
      b5fc01:	5f                   	pop    rdi
      b5fc02:	e8 f9 e2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fbea; FDE=(11925239, 11936142)
      b5fb9e:	e8 5d e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fba3:	48 8d 0d 36 d8 cb 00 	lea    rcx,[rip+0xcbd836]        # 181d3e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x130a0>
      b5fbaa:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fbad:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fbb2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fbb5:	48 89 e7             	mov    rdi,rsp
      b5fbb8:	e8 59 df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fbbd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fbc2:	48 85 ff             	test   rdi,rdi
      b5fbc5:	74 06                	je     b5fbcd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb6d>
      b5fbc7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fbca:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fbcd:	6a 08                	push   0x8
      b5fbcf:	5f                   	pop    rdi
      b5fbd0:	e8 2b e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fbd5:	48 8d 0d a4 23 cc 00 	lea    rcx,[rip+0xcc23a4]        # 1821f80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17c40>
      b5fbdc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fbdf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fbe4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fbe7:	48 89 e7             	mov    rdi,rsp
      b5fbea:	e8 27 df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fbef:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fbf4:	48 85 ff             	test   rdi,rdi
      b5fbf7:	74 06                	je     b5fbff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb9f>
      b5fbf9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fbfc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fbff:	6a 08                	push   0x8
      b5fc01:	5f                   	pop    rdi
      b5fc02:	e8 f9 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc07:	48 8d 0d c2 36 cc 00 	lea    rcx,[rip+0xcc36c2]        # 18232d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18f90>
      b5fc0e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fc11:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fc16:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fc19:	48 89 e7             	mov    rdi,rsp
      b5fc1c:	e8 f5 de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fc21:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fc26:	48 85 ff             	test   rdi,rdi
      b5fc29:	74 06                	je     b5fc31 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacbd1>
      b5fc2b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fc2e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fc31:	6a 08                	push   0x8
      b5fc33:	5f                   	pop    rdi
      b5fc34:	e8 c7 e2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fc1c; FDE=(11925239, 11936142)
      b5fbd0:	e8 2b e3 c8 00       	call   17edf00 <_Znwm@plt>
      b5fbd5:	48 8d 0d a4 23 cc 00 	lea    rcx,[rip+0xcc23a4]        # 1821f80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17c40>
      b5fbdc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fbdf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fbe4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fbe7:	48 89 e7             	mov    rdi,rsp
      b5fbea:	e8 27 df f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fbef:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fbf4:	48 85 ff             	test   rdi,rdi
      b5fbf7:	74 06                	je     b5fbff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacb9f>
      b5fbf9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fbfc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fbff:	6a 08                	push   0x8
      b5fc01:	5f                   	pop    rdi
      b5fc02:	e8 f9 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc07:	48 8d 0d c2 36 cc 00 	lea    rcx,[rip+0xcc36c2]        # 18232d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18f90>
      b5fc0e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fc11:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fc16:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fc19:	48 89 e7             	mov    rdi,rsp
      b5fc1c:	e8 f5 de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fc21:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fc26:	48 85 ff             	test   rdi,rdi
      b5fc29:	74 06                	je     b5fc31 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacbd1>
      b5fc2b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fc2e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fc31:	6a 08                	push   0x8
      b5fc33:	5f                   	pop    rdi
      b5fc34:	e8 c7 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc39:	48 8d 0d a8 8c cb 00 	lea    rcx,[rip+0xcb8ca8]        # 18188e8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe5a8>
      b5fc40:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fc43:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fc48:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fc4b:	48 89 e7             	mov    rdi,rsp
      b5fc4e:	e8 c3 de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fc53:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fc58:	48 85 ff             	test   rdi,rdi
      b5fc5b:	74 06                	je     b5fc63 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc03>
      b5fc5d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fc60:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fc63:	6a 08                	push   0x8
      b5fc65:	5f                   	pop    rdi
      b5fc66:	e8 95 e2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fc4e; FDE=(11925239, 11936142)
      b5fc02:	e8 f9 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc07:	48 8d 0d c2 36 cc 00 	lea    rcx,[rip+0xcc36c2]        # 18232d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18f90>
      b5fc0e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fc11:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fc16:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fc19:	48 89 e7             	mov    rdi,rsp
      b5fc1c:	e8 f5 de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fc21:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fc26:	48 85 ff             	test   rdi,rdi
      b5fc29:	74 06                	je     b5fc31 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacbd1>
      b5fc2b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fc2e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fc31:	6a 08                	push   0x8
      b5fc33:	5f                   	pop    rdi
      b5fc34:	e8 c7 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc39:	48 8d 0d a8 8c cb 00 	lea    rcx,[rip+0xcb8ca8]        # 18188e8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe5a8>
      b5fc40:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fc43:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fc48:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fc4b:	48 89 e7             	mov    rdi,rsp
      b5fc4e:	e8 c3 de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fc53:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fc58:	48 85 ff             	test   rdi,rdi
      b5fc5b:	74 06                	je     b5fc63 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc03>
      b5fc5d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fc60:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fc63:	6a 08                	push   0x8
      b5fc65:	5f                   	pop    rdi
      b5fc66:	e8 95 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc6b:	48 8d 0d 36 8c cb 00 	lea    rcx,[rip+0xcb8c36]        # 18188a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe568>
      b5fc72:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fc75:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fc7a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fc7d:	48 89 e7             	mov    rdi,rsp
      b5fc80:	e8 91 de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fc85:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fc8a:	48 85 ff             	test   rdi,rdi
      b5fc8d:	74 06                	je     b5fc95 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc35>
      b5fc8f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fc92:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fc95:	6a 08                	push   0x8
      b5fc97:	5f                   	pop    rdi
      b5fc98:	e8 63 e2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fc80; FDE=(11925239, 11936142)
      b5fc34:	e8 c7 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc39:	48 8d 0d a8 8c cb 00 	lea    rcx,[rip+0xcb8ca8]        # 18188e8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe5a8>
      b5fc40:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fc43:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fc48:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fc4b:	48 89 e7             	mov    rdi,rsp
      b5fc4e:	e8 c3 de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fc53:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fc58:	48 85 ff             	test   rdi,rdi
      b5fc5b:	74 06                	je     b5fc63 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc03>
      b5fc5d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fc60:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fc63:	6a 08                	push   0x8
      b5fc65:	5f                   	pop    rdi
      b5fc66:	e8 95 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc6b:	48 8d 0d 36 8c cb 00 	lea    rcx,[rip+0xcb8c36]        # 18188a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe568>
      b5fc72:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fc75:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fc7a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fc7d:	48 89 e7             	mov    rdi,rsp
      b5fc80:	e8 91 de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fc85:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fc8a:	48 85 ff             	test   rdi,rdi
      b5fc8d:	74 06                	je     b5fc95 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc35>
      b5fc8f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fc92:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fc95:	6a 08                	push   0x8
      b5fc97:	5f                   	pop    rdi
      b5fc98:	e8 63 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc9d:	48 8d 0d 6c 56 cc 00 	lea    rcx,[rip+0xcc566c]        # 1825310 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1940>
      b5fca4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fca7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fcac:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fcaf:	48 89 e7             	mov    rdi,rsp
      b5fcb2:	e8 5f de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fcb7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fcbc:	48 85 ff             	test   rdi,rdi
      b5fcbf:	74 06                	je     b5fcc7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc67>
      b5fcc1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fcc4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fcc7:	6a 08                	push   0x8
      b5fcc9:	5f                   	pop    rdi
      b5fcca:	e8 31 e2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fcb2; FDE=(11925239, 11936142)
      b5fc66:	e8 95 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc6b:	48 8d 0d 36 8c cb 00 	lea    rcx,[rip+0xcb8c36]        # 18188a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe568>
      b5fc72:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fc75:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fc7a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fc7d:	48 89 e7             	mov    rdi,rsp
      b5fc80:	e8 91 de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fc85:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fc8a:	48 85 ff             	test   rdi,rdi
      b5fc8d:	74 06                	je     b5fc95 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc35>
      b5fc8f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fc92:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fc95:	6a 08                	push   0x8
      b5fc97:	5f                   	pop    rdi
      b5fc98:	e8 63 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc9d:	48 8d 0d 6c 56 cc 00 	lea    rcx,[rip+0xcc566c]        # 1825310 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1940>
      b5fca4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fca7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fcac:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fcaf:	48 89 e7             	mov    rdi,rsp
      b5fcb2:	e8 5f de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fcb7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fcbc:	48 85 ff             	test   rdi,rdi
      b5fcbf:	74 06                	je     b5fcc7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc67>
      b5fcc1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fcc4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fcc7:	6a 08                	push   0x8
      b5fcc9:	5f                   	pop    rdi
      b5fcca:	e8 31 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fccf:	48 8d 0d 02 ca cb 00 	lea    rcx,[rip+0xcbca02]        # 181c6d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12398>
      b5fcd6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fcd9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fcde:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fce1:	48 89 e7             	mov    rdi,rsp
      b5fce4:	e8 2d de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fce9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fcee:	48 85 ff             	test   rdi,rdi
      b5fcf1:	74 06                	je     b5fcf9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc99>
      b5fcf3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fcf6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fcf9:	6a 08                	push   0x8
      b5fcfb:	5f                   	pop    rdi
      b5fcfc:	e8 ff e1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fce4; FDE=(11925239, 11936142)
      b5fc98:	e8 63 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fc9d:	48 8d 0d 6c 56 cc 00 	lea    rcx,[rip+0xcc566c]        # 1825310 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1940>
      b5fca4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fca7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fcac:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fcaf:	48 89 e7             	mov    rdi,rsp
      b5fcb2:	e8 5f de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fcb7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fcbc:	48 85 ff             	test   rdi,rdi
      b5fcbf:	74 06                	je     b5fcc7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc67>
      b5fcc1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fcc4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fcc7:	6a 08                	push   0x8
      b5fcc9:	5f                   	pop    rdi
      b5fcca:	e8 31 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fccf:	48 8d 0d 02 ca cb 00 	lea    rcx,[rip+0xcbca02]        # 181c6d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12398>
      b5fcd6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fcd9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fcde:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fce1:	48 89 e7             	mov    rdi,rsp
      b5fce4:	e8 2d de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fce9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fcee:	48 85 ff             	test   rdi,rdi
      b5fcf1:	74 06                	je     b5fcf9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc99>
      b5fcf3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fcf6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fcf9:	6a 08                	push   0x8
      b5fcfb:	5f                   	pop    rdi
      b5fcfc:	e8 ff e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd01:	48 8d 0d 50 bf cb 00 	lea    rcx,[rip+0xcbbf50]        # 181bc58 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11918>
      b5fd08:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fd0b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fd10:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fd13:	48 89 e7             	mov    rdi,rsp
      b5fd16:	e8 fb dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fd1b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fd20:	48 85 ff             	test   rdi,rdi
      b5fd23:	74 06                	je     b5fd2b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacccb>
      b5fd25:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fd28:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fd2b:	6a 08                	push   0x8
      b5fd2d:	5f                   	pop    rdi
      b5fd2e:	e8 cd e1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fd16; FDE=(11925239, 11936142)
      b5fcca:	e8 31 e2 c8 00       	call   17edf00 <_Znwm@plt>
      b5fccf:	48 8d 0d 02 ca cb 00 	lea    rcx,[rip+0xcbca02]        # 181c6d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12398>
      b5fcd6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fcd9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fcde:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fce1:	48 89 e7             	mov    rdi,rsp
      b5fce4:	e8 2d de f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fce9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fcee:	48 85 ff             	test   rdi,rdi
      b5fcf1:	74 06                	je     b5fcf9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacc99>
      b5fcf3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fcf6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fcf9:	6a 08                	push   0x8
      b5fcfb:	5f                   	pop    rdi
      b5fcfc:	e8 ff e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd01:	48 8d 0d 50 bf cb 00 	lea    rcx,[rip+0xcbbf50]        # 181bc58 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11918>
      b5fd08:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fd0b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fd10:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fd13:	48 89 e7             	mov    rdi,rsp
      b5fd16:	e8 fb dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fd1b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fd20:	48 85 ff             	test   rdi,rdi
      b5fd23:	74 06                	je     b5fd2b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacccb>
      b5fd25:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fd28:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fd2b:	6a 08                	push   0x8
      b5fd2d:	5f                   	pop    rdi
      b5fd2e:	e8 cd e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd33:	48 8d 0d 06 b9 cb 00 	lea    rcx,[rip+0xcbb906]        # 181b640 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11300>
      b5fd3a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fd3d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fd42:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fd45:	48 89 e7             	mov    rdi,rsp
      b5fd48:	e8 c9 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fd4d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fd52:	48 85 ff             	test   rdi,rdi
      b5fd55:	74 06                	je     b5fd5d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaccfd>
      b5fd57:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fd5a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fd5d:	6a 08                	push   0x8
      b5fd5f:	5f                   	pop    rdi
      b5fd60:	e8 9b e1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fd48; FDE=(11925239, 11936142)
      b5fcfc:	e8 ff e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd01:	48 8d 0d 50 bf cb 00 	lea    rcx,[rip+0xcbbf50]        # 181bc58 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11918>
      b5fd08:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fd0b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fd10:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fd13:	48 89 e7             	mov    rdi,rsp
      b5fd16:	e8 fb dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fd1b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fd20:	48 85 ff             	test   rdi,rdi
      b5fd23:	74 06                	je     b5fd2b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacccb>
      b5fd25:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fd28:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fd2b:	6a 08                	push   0x8
      b5fd2d:	5f                   	pop    rdi
      b5fd2e:	e8 cd e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd33:	48 8d 0d 06 b9 cb 00 	lea    rcx,[rip+0xcbb906]        # 181b640 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11300>
      b5fd3a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fd3d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fd42:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fd45:	48 89 e7             	mov    rdi,rsp
      b5fd48:	e8 c9 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fd4d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fd52:	48 85 ff             	test   rdi,rdi
      b5fd55:	74 06                	je     b5fd5d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaccfd>
      b5fd57:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fd5a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fd5d:	6a 08                	push   0x8
      b5fd5f:	5f                   	pop    rdi
      b5fd60:	e8 9b e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd65:	48 8d 0d 94 b8 cb 00 	lea    rcx,[rip+0xcbb894]        # 181b600 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x112c0>
      b5fd6c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fd6f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fd74:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fd77:	48 89 e7             	mov    rdi,rsp
      b5fd7a:	e8 97 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fd7f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fd84:	48 85 ff             	test   rdi,rdi
      b5fd87:	74 06                	je     b5fd8f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacd2f>
      b5fd89:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fd8c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fd8f:	6a 08                	push   0x8
      b5fd91:	5f                   	pop    rdi
      b5fd92:	e8 69 e1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fd7a; FDE=(11925239, 11936142)
      b5fd2e:	e8 cd e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd33:	48 8d 0d 06 b9 cb 00 	lea    rcx,[rip+0xcbb906]        # 181b640 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11300>
      b5fd3a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fd3d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fd42:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fd45:	48 89 e7             	mov    rdi,rsp
      b5fd48:	e8 c9 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fd4d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fd52:	48 85 ff             	test   rdi,rdi
      b5fd55:	74 06                	je     b5fd5d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaccfd>
      b5fd57:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fd5a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fd5d:	6a 08                	push   0x8
      b5fd5f:	5f                   	pop    rdi
      b5fd60:	e8 9b e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd65:	48 8d 0d 94 b8 cb 00 	lea    rcx,[rip+0xcbb894]        # 181b600 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x112c0>
      b5fd6c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fd6f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fd74:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fd77:	48 89 e7             	mov    rdi,rsp
      b5fd7a:	e8 97 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fd7f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fd84:	48 85 ff             	test   rdi,rdi
      b5fd87:	74 06                	je     b5fd8f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacd2f>
      b5fd89:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fd8c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fd8f:	6a 08                	push   0x8
      b5fd91:	5f                   	pop    rdi
      b5fd92:	e8 69 e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd97:	48 8d 0d 32 55 cc 00 	lea    rcx,[rip+0xcc5532]        # 18252d0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1900>
      b5fd9e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fda1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fda6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fda9:	48 89 e7             	mov    rdi,rsp
      b5fdac:	e8 65 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fdb1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fdb6:	48 85 ff             	test   rdi,rdi
      b5fdb9:	74 06                	je     b5fdc1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacd61>
      b5fdbb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fdbe:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fdc1:	6a 08                	push   0x8
      b5fdc3:	5f                   	pop    rdi
      b5fdc4:	e8 37 e1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fdac; FDE=(11925239, 11936142)
      b5fd60:	e8 9b e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd65:	48 8d 0d 94 b8 cb 00 	lea    rcx,[rip+0xcbb894]        # 181b600 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x112c0>
      b5fd6c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fd6f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fd74:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fd77:	48 89 e7             	mov    rdi,rsp
      b5fd7a:	e8 97 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fd7f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fd84:	48 85 ff             	test   rdi,rdi
      b5fd87:	74 06                	je     b5fd8f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacd2f>
      b5fd89:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fd8c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fd8f:	6a 08                	push   0x8
      b5fd91:	5f                   	pop    rdi
      b5fd92:	e8 69 e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd97:	48 8d 0d 32 55 cc 00 	lea    rcx,[rip+0xcc5532]        # 18252d0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1900>
      b5fd9e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fda1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fda6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fda9:	48 89 e7             	mov    rdi,rsp
      b5fdac:	e8 65 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fdb1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fdb6:	48 85 ff             	test   rdi,rdi
      b5fdb9:	74 06                	je     b5fdc1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacd61>
      b5fdbb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fdbe:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fdc1:	6a 08                	push   0x8
      b5fdc3:	5f                   	pop    rdi
      b5fdc4:	e8 37 e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fdc9:	48 8d 0d c0 54 cc 00 	lea    rcx,[rip+0xcc54c0]        # 1825290 <_ZTIN4asio2ip16bad_address_castE@@Base+0x18c0>
      b5fdd0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fdd3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fdd8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fddb:	48 89 e7             	mov    rdi,rsp
      b5fdde:	e8 33 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fde3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fde8:	48 85 ff             	test   rdi,rdi
      b5fdeb:	74 06                	je     b5fdf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacd93>
      b5fded:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fdf0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fdf3:	6a 08                	push   0x8
      b5fdf5:	5f                   	pop    rdi
      b5fdf6:	e8 05 e1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fdde; FDE=(11925239, 11936142)
      b5fd92:	e8 69 e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fd97:	48 8d 0d 32 55 cc 00 	lea    rcx,[rip+0xcc5532]        # 18252d0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1900>
      b5fd9e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fda1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fda6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fda9:	48 89 e7             	mov    rdi,rsp
      b5fdac:	e8 65 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fdb1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fdb6:	48 85 ff             	test   rdi,rdi
      b5fdb9:	74 06                	je     b5fdc1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacd61>
      b5fdbb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fdbe:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fdc1:	6a 08                	push   0x8
      b5fdc3:	5f                   	pop    rdi
      b5fdc4:	e8 37 e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fdc9:	48 8d 0d c0 54 cc 00 	lea    rcx,[rip+0xcc54c0]        # 1825290 <_ZTIN4asio2ip16bad_address_castE@@Base+0x18c0>
      b5fdd0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fdd3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fdd8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fddb:	48 89 e7             	mov    rdi,rsp
      b5fdde:	e8 33 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fde3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fde8:	48 85 ff             	test   rdi,rdi
      b5fdeb:	74 06                	je     b5fdf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacd93>
      b5fded:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fdf0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fdf3:	6a 08                	push   0x8
      b5fdf5:	5f                   	pop    rdi
      b5fdf6:	e8 05 e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fdfb:	48 8d 0d e6 57 cc 00 	lea    rcx,[rip+0xcc57e6]        # 18255e8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1c18>
      b5fe02:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe05:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fe0a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fe0d:	48 89 e7             	mov    rdi,rsp
      b5fe10:	e8 01 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fe15:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fe1a:	48 85 ff             	test   rdi,rdi
      b5fe1d:	74 06                	je     b5fe25 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacdc5>
      b5fe1f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fe22:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fe25:	6a 08                	push   0x8
      b5fe27:	5f                   	pop    rdi
      b5fe28:	e8 d3 e0 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fe10; FDE=(11925239, 11936142)
      b5fdc4:	e8 37 e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fdc9:	48 8d 0d c0 54 cc 00 	lea    rcx,[rip+0xcc54c0]        # 1825290 <_ZTIN4asio2ip16bad_address_castE@@Base+0x18c0>
      b5fdd0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fdd3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fdd8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fddb:	48 89 e7             	mov    rdi,rsp
      b5fdde:	e8 33 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fde3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fde8:	48 85 ff             	test   rdi,rdi
      b5fdeb:	74 06                	je     b5fdf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacd93>
      b5fded:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fdf0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fdf3:	6a 08                	push   0x8
      b5fdf5:	5f                   	pop    rdi
      b5fdf6:	e8 05 e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fdfb:	48 8d 0d e6 57 cc 00 	lea    rcx,[rip+0xcc57e6]        # 18255e8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1c18>
      b5fe02:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe05:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fe0a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fe0d:	48 89 e7             	mov    rdi,rsp
      b5fe10:	e8 01 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fe15:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fe1a:	48 85 ff             	test   rdi,rdi
      b5fe1d:	74 06                	je     b5fe25 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacdc5>
      b5fe1f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fe22:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fe25:	6a 08                	push   0x8
      b5fe27:	5f                   	pop    rdi
      b5fe28:	e8 d3 e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fe2d:	48 8d 0d 3c 20 cc 00 	lea    rcx,[rip+0xcc203c]        # 1821e70 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17b30>
      b5fe34:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe37:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fe3c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fe3f:	48 89 e7             	mov    rdi,rsp
      b5fe42:	e8 cf dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fe47:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fe4c:	48 85 ff             	test   rdi,rdi
      b5fe4f:	74 06                	je     b5fe57 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacdf7>
      b5fe51:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fe54:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fe57:	6a 08                	push   0x8
      b5fe59:	5f                   	pop    rdi
      b5fe5a:	e8 a1 e0 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fe42; FDE=(11925239, 11936142)
      b5fdf6:	e8 05 e1 c8 00       	call   17edf00 <_Znwm@plt>
      b5fdfb:	48 8d 0d e6 57 cc 00 	lea    rcx,[rip+0xcc57e6]        # 18255e8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1c18>
      b5fe02:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe05:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fe0a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fe0d:	48 89 e7             	mov    rdi,rsp
      b5fe10:	e8 01 dd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fe15:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fe1a:	48 85 ff             	test   rdi,rdi
      b5fe1d:	74 06                	je     b5fe25 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacdc5>
      b5fe1f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fe22:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fe25:	6a 08                	push   0x8
      b5fe27:	5f                   	pop    rdi
      b5fe28:	e8 d3 e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fe2d:	48 8d 0d 3c 20 cc 00 	lea    rcx,[rip+0xcc203c]        # 1821e70 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17b30>
      b5fe34:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe37:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fe3c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fe3f:	48 89 e7             	mov    rdi,rsp
      b5fe42:	e8 cf dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fe47:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fe4c:	48 85 ff             	test   rdi,rdi
      b5fe4f:	74 06                	je     b5fe57 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacdf7>
      b5fe51:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fe54:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fe57:	6a 08                	push   0x8
      b5fe59:	5f                   	pop    rdi
      b5fe5a:	e8 a1 e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fe5f:	48 8d 0d 0a 51 d1 00 	lea    rcx,[rip+0xd1510a]        # 1874f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x31658>
      b5fe66:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe69:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fe6e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fe71:	48 89 e7             	mov    rdi,rsp
      b5fe74:	e8 9d dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fe79:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fe7e:	48 85 ff             	test   rdi,rdi
      b5fe81:	74 06                	je     b5fe89 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xace29>
      b5fe83:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fe86:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fe89:	6a 08                	push   0x8
      b5fe8b:	5f                   	pop    rdi
      b5fe8c:	e8 6f e0 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fe74; FDE=(11925239, 11936142)
      b5fe28:	e8 d3 e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fe2d:	48 8d 0d 3c 20 cc 00 	lea    rcx,[rip+0xcc203c]        # 1821e70 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17b30>
      b5fe34:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe37:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fe3c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fe3f:	48 89 e7             	mov    rdi,rsp
      b5fe42:	e8 cf dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fe47:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fe4c:	48 85 ff             	test   rdi,rdi
      b5fe4f:	74 06                	je     b5fe57 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacdf7>
      b5fe51:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fe54:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fe57:	6a 08                	push   0x8
      b5fe59:	5f                   	pop    rdi
      b5fe5a:	e8 a1 e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fe5f:	48 8d 0d 0a 51 d1 00 	lea    rcx,[rip+0xd1510a]        # 1874f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x31658>
      b5fe66:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe69:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fe6e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fe71:	48 89 e7             	mov    rdi,rsp
      b5fe74:	e8 9d dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fe79:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fe7e:	48 85 ff             	test   rdi,rdi
      b5fe81:	74 06                	je     b5fe89 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xace29>
      b5fe83:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fe86:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fe89:	6a 08                	push   0x8
      b5fe8b:	5f                   	pop    rdi
      b5fe8c:	e8 6f e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fe91:	48 8d 0d d8 98 ce 00 	lea    rcx,[rip+0xce98d8]        # 1849770 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5e58>
      b5fe98:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe9b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fea0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fea3:	48 89 e7             	mov    rdi,rsp
      b5fea6:	e8 6b dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5feab:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5feb0:	48 85 ff             	test   rdi,rdi
      b5feb3:	74 06                	je     b5febb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xace5b>
      b5feb5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5feb8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5febb:	6a 08                	push   0x8
      b5febd:	5f                   	pop    rdi
      b5febe:	e8 3d e0 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fea6; FDE=(11925239, 11936142)
      b5fe5a:	e8 a1 e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fe5f:	48 8d 0d 0a 51 d1 00 	lea    rcx,[rip+0xd1510a]        # 1874f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x31658>
      b5fe66:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe69:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fe6e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fe71:	48 89 e7             	mov    rdi,rsp
      b5fe74:	e8 9d dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fe79:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fe7e:	48 85 ff             	test   rdi,rdi
      b5fe81:	74 06                	je     b5fe89 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xace29>
      b5fe83:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5fe86:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5fe89:	6a 08                	push   0x8
      b5fe8b:	5f                   	pop    rdi
      b5fe8c:	e8 6f e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fe91:	48 8d 0d d8 98 ce 00 	lea    rcx,[rip+0xce98d8]        # 1849770 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5e58>
      b5fe98:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe9b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fea0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fea3:	48 89 e7             	mov    rdi,rsp
      b5fea6:	e8 6b dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5feab:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5feb0:	48 85 ff             	test   rdi,rdi
      b5feb3:	74 06                	je     b5febb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xace5b>
      b5feb5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5feb8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5febb:	6a 08                	push   0x8
      b5febd:	5f                   	pop    rdi
      b5febe:	e8 3d e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fec3:	48 8d 0d 66 98 ce 00 	lea    rcx,[rip+0xce9866]        # 1849730 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5e18>
      b5feca:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fecd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fed2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fed5:	48 89 e7             	mov    rdi,rsp
      b5fed8:	e8 39 dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fedd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fee2:	48 85 ff             	test   rdi,rdi
      b5fee5:	74 06                	je     b5feed <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xace8d>
      b5fee7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5feea:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5feed:	6a 08                	push   0x8
      b5feef:	5f                   	pop    rdi
      b5fef0:	e8 0b e0 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5fed8; FDE=(11925239, 11936142)
      b5fe8c:	e8 6f e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fe91:	48 8d 0d d8 98 ce 00 	lea    rcx,[rip+0xce98d8]        # 1849770 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5e58>
      b5fe98:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fe9b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fea0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fea3:	48 89 e7             	mov    rdi,rsp
      b5fea6:	e8 6b dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5feab:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5feb0:	48 85 ff             	test   rdi,rdi
      b5feb3:	74 06                	je     b5febb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xace5b>
      b5feb5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5feb8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5febb:	6a 08                	push   0x8
      b5febd:	5f                   	pop    rdi
      b5febe:	e8 3d e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fec3:	48 8d 0d 66 98 ce 00 	lea    rcx,[rip+0xce9866]        # 1849730 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5e18>
      b5feca:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fecd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fed2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fed5:	48 89 e7             	mov    rdi,rsp
      b5fed8:	e8 39 dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fedd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fee2:	48 85 ff             	test   rdi,rdi
      b5fee5:	74 06                	je     b5feed <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xace8d>
      b5fee7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5feea:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5feed:	6a 08                	push   0x8
      b5feef:	5f                   	pop    rdi
      b5fef0:	e8 0b e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fef5:	48 8d 0d 5c 0b cf 00 	lea    rcx,[rip+0xcf0b5c]        # 1850a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd140>
      b5fefc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5feff:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff04:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff07:	48 89 e7             	mov    rdi,rsp
      b5ff0a:	e8 07 dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ff0f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ff14:	48 85 ff             	test   rdi,rdi
      b5ff17:	74 06                	je     b5ff1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacebf>
      b5ff19:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ff1c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ff1f:	6a 08                	push   0x8
      b5ff21:	5f                   	pop    rdi
      b5ff22:	e8 d9 df c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5ff0a; FDE=(11925239, 11936142)
      b5febe:	e8 3d e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fec3:	48 8d 0d 66 98 ce 00 	lea    rcx,[rip+0xce9866]        # 1849730 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5e18>
      b5feca:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fecd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fed2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5fed5:	48 89 e7             	mov    rdi,rsp
      b5fed8:	e8 39 dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5fedd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5fee2:	48 85 ff             	test   rdi,rdi
      b5fee5:	74 06                	je     b5feed <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xace8d>
      b5fee7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5feea:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5feed:	6a 08                	push   0x8
      b5feef:	5f                   	pop    rdi
      b5fef0:	e8 0b e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fef5:	48 8d 0d 5c 0b cf 00 	lea    rcx,[rip+0xcf0b5c]        # 1850a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd140>
      b5fefc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5feff:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff04:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff07:	48 89 e7             	mov    rdi,rsp
      b5ff0a:	e8 07 dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ff0f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ff14:	48 85 ff             	test   rdi,rdi
      b5ff17:	74 06                	je     b5ff1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacebf>
      b5ff19:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ff1c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ff1f:	6a 08                	push   0x8
      b5ff21:	5f                   	pop    rdi
      b5ff22:	e8 d9 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ff27:	48 8d 0d ea 0a cf 00 	lea    rcx,[rip+0xcf0aea]        # 1850a18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd100>
      b5ff2e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ff31:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff36:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff39:	48 89 e7             	mov    rdi,rsp
      b5ff3c:	e8 d5 db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ff41:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ff46:	48 85 ff             	test   rdi,rdi
      b5ff49:	74 06                	je     b5ff51 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacef1>
      b5ff4b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ff4e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ff51:	6a 08                	push   0x8
      b5ff53:	5f                   	pop    rdi
      b5ff54:	e8 a7 df c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5ff3c; FDE=(11925239, 11936142)
      b5fef0:	e8 0b e0 c8 00       	call   17edf00 <_Znwm@plt>
      b5fef5:	48 8d 0d 5c 0b cf 00 	lea    rcx,[rip+0xcf0b5c]        # 1850a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd140>
      b5fefc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5feff:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff04:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff07:	48 89 e7             	mov    rdi,rsp
      b5ff0a:	e8 07 dc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ff0f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ff14:	48 85 ff             	test   rdi,rdi
      b5ff17:	74 06                	je     b5ff1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacebf>
      b5ff19:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ff1c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ff1f:	6a 08                	push   0x8
      b5ff21:	5f                   	pop    rdi
      b5ff22:	e8 d9 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ff27:	48 8d 0d ea 0a cf 00 	lea    rcx,[rip+0xcf0aea]        # 1850a18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd100>
      b5ff2e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ff31:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff36:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff39:	48 89 e7             	mov    rdi,rsp
      b5ff3c:	e8 d5 db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ff41:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ff46:	48 85 ff             	test   rdi,rdi
      b5ff49:	74 06                	je     b5ff51 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacef1>
      b5ff4b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ff4e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ff51:	6a 08                	push   0x8
      b5ff53:	5f                   	pop    rdi
      b5ff54:	e8 a7 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ff59:	48 8d 0d 28 af ce 00 	lea    rcx,[rip+0xceaf28]        # 184ae88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7570>
      b5ff60:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ff63:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff68:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff6b:	48 89 e7             	mov    rdi,rsp
      b5ff6e:	e8 a3 db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ff73:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ff78:	48 85 ff             	test   rdi,rdi
      b5ff7b:	74 06                	je     b5ff83 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacf23>
      b5ff7d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ff80:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ff83:	6a 08                	push   0x8
      b5ff85:	5f                   	pop    rdi
      b5ff86:	e8 75 df c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5ff6e; FDE=(11925239, 11936142)
      b5ff22:	e8 d9 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ff27:	48 8d 0d ea 0a cf 00 	lea    rcx,[rip+0xcf0aea]        # 1850a18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd100>
      b5ff2e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ff31:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff36:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff39:	48 89 e7             	mov    rdi,rsp
      b5ff3c:	e8 d5 db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ff41:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ff46:	48 85 ff             	test   rdi,rdi
      b5ff49:	74 06                	je     b5ff51 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacef1>
      b5ff4b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ff4e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ff51:	6a 08                	push   0x8
      b5ff53:	5f                   	pop    rdi
      b5ff54:	e8 a7 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ff59:	48 8d 0d 28 af ce 00 	lea    rcx,[rip+0xceaf28]        # 184ae88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7570>
      b5ff60:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ff63:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff68:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff6b:	48 89 e7             	mov    rdi,rsp
      b5ff6e:	e8 a3 db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ff73:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ff78:	48 85 ff             	test   rdi,rdi
      b5ff7b:	74 06                	je     b5ff83 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacf23>
      b5ff7d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ff80:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ff83:	6a 08                	push   0x8
      b5ff85:	5f                   	pop    rdi
      b5ff86:	e8 75 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ff8b:	48 8d 0d ce a6 ce 00 	lea    rcx,[rip+0xcea6ce]        # 184a660 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6d48>
      b5ff92:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ff95:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff9a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff9d:	48 89 e7             	mov    rdi,rsp
      b5ffa0:	e8 71 db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ffa5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ffaa:	48 85 ff             	test   rdi,rdi
      b5ffad:	74 06                	je     b5ffb5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacf55>
      b5ffaf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ffb2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ffb5:	6a 08                	push   0x8
      b5ffb7:	5f                   	pop    rdi
      b5ffb8:	e8 43 df c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5ffa0; FDE=(11925239, 11936142)
      b5ff54:	e8 a7 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ff59:	48 8d 0d 28 af ce 00 	lea    rcx,[rip+0xceaf28]        # 184ae88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7570>
      b5ff60:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ff63:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff68:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff6b:	48 89 e7             	mov    rdi,rsp
      b5ff6e:	e8 a3 db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ff73:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ff78:	48 85 ff             	test   rdi,rdi
      b5ff7b:	74 06                	je     b5ff83 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacf23>
      b5ff7d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ff80:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ff83:	6a 08                	push   0x8
      b5ff85:	5f                   	pop    rdi
      b5ff86:	e8 75 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ff8b:	48 8d 0d ce a6 ce 00 	lea    rcx,[rip+0xcea6ce]        # 184a660 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6d48>
      b5ff92:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ff95:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff9a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff9d:	48 89 e7             	mov    rdi,rsp
      b5ffa0:	e8 71 db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ffa5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ffaa:	48 85 ff             	test   rdi,rdi
      b5ffad:	74 06                	je     b5ffb5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacf55>
      b5ffaf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ffb2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ffb5:	6a 08                	push   0x8
      b5ffb7:	5f                   	pop    rdi
      b5ffb8:	e8 43 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ffbd:	48 8d 0d 7c 51 cc 00 	lea    rcx,[rip+0xcc517c]        # 1825140 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1770>
      b5ffc4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ffc7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ffcc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ffcf:	48 89 e7             	mov    rdi,rsp
      b5ffd2:	e8 3f db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ffd7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ffdc:	48 85 ff             	test   rdi,rdi
      b5ffdf:	74 06                	je     b5ffe7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacf87>
      b5ffe1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ffe4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ffe7:	6a 08                	push   0x8
      b5ffe9:	5f                   	pop    rdi
      b5ffea:	e8 11 df c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb5ffd2; FDE=(11925239, 11936142)
      b5ff86:	e8 75 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ff8b:	48 8d 0d ce a6 ce 00 	lea    rcx,[rip+0xcea6ce]        # 184a660 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6d48>
      b5ff92:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ff95:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ff9a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ff9d:	48 89 e7             	mov    rdi,rsp
      b5ffa0:	e8 71 db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ffa5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ffaa:	48 85 ff             	test   rdi,rdi
      b5ffad:	74 06                	je     b5ffb5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacf55>
      b5ffaf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ffb2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ffb5:	6a 08                	push   0x8
      b5ffb7:	5f                   	pop    rdi
      b5ffb8:	e8 43 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ffbd:	48 8d 0d 7c 51 cc 00 	lea    rcx,[rip+0xcc517c]        # 1825140 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1770>
      b5ffc4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ffc7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ffcc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ffcf:	48 89 e7             	mov    rdi,rsp
      b5ffd2:	e8 3f db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ffd7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ffdc:	48 85 ff             	test   rdi,rdi
      b5ffdf:	74 06                	je     b5ffe7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacf87>
      b5ffe1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ffe4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ffe7:	6a 08                	push   0x8
      b5ffe9:	5f                   	pop    rdi
      b5ffea:	e8 11 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ffef:	48 8d 0d 72 b1 cc 00 	lea    rcx,[rip+0xccb172]        # 182b168 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7798>
      b5fff6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fff9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fffe:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60001:	48 89 e7             	mov    rdi,rsp
      b60004:	e8 0d db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60009:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6000e:	48 85 ff             	test   rdi,rdi
      b60011:	74 06                	je     b60019 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacfb9>
      b60013:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60016:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60019:	6a 08                	push   0x8
      b6001b:	5f                   	pop    rdi
      b6001c:	e8 df de c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60004; FDE=(11925239, 11936142)
      b5ffb8:	e8 43 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ffbd:	48 8d 0d 7c 51 cc 00 	lea    rcx,[rip+0xcc517c]        # 1825140 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1770>
      b5ffc4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5ffc7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5ffcc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ffcf:	48 89 e7             	mov    rdi,rsp
      b5ffd2:	e8 3f db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b5ffd7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b5ffdc:	48 85 ff             	test   rdi,rdi
      b5ffdf:	74 06                	je     b5ffe7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacf87>
      b5ffe1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b5ffe4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b5ffe7:	6a 08                	push   0x8
      b5ffe9:	5f                   	pop    rdi
      b5ffea:	e8 11 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ffef:	48 8d 0d 72 b1 cc 00 	lea    rcx,[rip+0xccb172]        # 182b168 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7798>
      b5fff6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fff9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fffe:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60001:	48 89 e7             	mov    rdi,rsp
      b60004:	e8 0d db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60009:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6000e:	48 85 ff             	test   rdi,rdi
      b60011:	74 06                	je     b60019 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacfb9>
      b60013:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60016:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60019:	6a 08                	push   0x8
      b6001b:	5f                   	pop    rdi
      b6001c:	e8 df de c8 00       	call   17edf00 <_Znwm@plt>
      b60021:	48 8d 0d 00 b1 cc 00 	lea    rcx,[rip+0xccb100]        # 182b128 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7758>
      b60028:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6002b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60030:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60033:	48 89 e7             	mov    rdi,rsp
      b60036:	e8 db da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6003b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60040:	48 85 ff             	test   rdi,rdi
      b60043:	74 06                	je     b6004b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacfeb>
      b60045:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60048:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6004b:	6a 08                	push   0x8
      b6004d:	5f                   	pop    rdi
      b6004e:	e8 ad de c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60036; FDE=(11925239, 11936142)
      b5ffea:	e8 11 df c8 00       	call   17edf00 <_Znwm@plt>
      b5ffef:	48 8d 0d 72 b1 cc 00 	lea    rcx,[rip+0xccb172]        # 182b168 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7798>
      b5fff6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b5fff9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b5fffe:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60001:	48 89 e7             	mov    rdi,rsp
      b60004:	e8 0d db f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60009:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6000e:	48 85 ff             	test   rdi,rdi
      b60011:	74 06                	je     b60019 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacfb9>
      b60013:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60016:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60019:	6a 08                	push   0x8
      b6001b:	5f                   	pop    rdi
      b6001c:	e8 df de c8 00       	call   17edf00 <_Znwm@plt>
      b60021:	48 8d 0d 00 b1 cc 00 	lea    rcx,[rip+0xccb100]        # 182b128 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7758>
      b60028:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6002b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60030:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60033:	48 89 e7             	mov    rdi,rsp
      b60036:	e8 db da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6003b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60040:	48 85 ff             	test   rdi,rdi
      b60043:	74 06                	je     b6004b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacfeb>
      b60045:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60048:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6004b:	6a 08                	push   0x8
      b6004d:	5f                   	pop    rdi
      b6004e:	e8 ad de c8 00       	call   17edf00 <_Znwm@plt>
      b60053:	48 8d 0d 66 97 cb 00 	lea    rcx,[rip+0xcb9766]        # 18197c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf480>
      b6005a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6005d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60062:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60065:	48 89 e7             	mov    rdi,rsp
      b60068:	e8 a9 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6006d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60072:	48 85 ff             	test   rdi,rdi
      b60075:	74 06                	je     b6007d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad01d>
      b60077:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6007a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6007d:	6a 08                	push   0x8
      b6007f:	5f                   	pop    rdi
      b60080:	e8 7b de c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60068; FDE=(11925239, 11936142)
      b6001c:	e8 df de c8 00       	call   17edf00 <_Znwm@plt>
      b60021:	48 8d 0d 00 b1 cc 00 	lea    rcx,[rip+0xccb100]        # 182b128 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7758>
      b60028:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6002b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60030:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60033:	48 89 e7             	mov    rdi,rsp
      b60036:	e8 db da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6003b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60040:	48 85 ff             	test   rdi,rdi
      b60043:	74 06                	je     b6004b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xacfeb>
      b60045:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60048:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6004b:	6a 08                	push   0x8
      b6004d:	5f                   	pop    rdi
      b6004e:	e8 ad de c8 00       	call   17edf00 <_Znwm@plt>
      b60053:	48 8d 0d 66 97 cb 00 	lea    rcx,[rip+0xcb9766]        # 18197c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf480>
      b6005a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6005d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60062:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60065:	48 89 e7             	mov    rdi,rsp
      b60068:	e8 a9 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6006d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60072:	48 85 ff             	test   rdi,rdi
      b60075:	74 06                	je     b6007d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad01d>
      b60077:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6007a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6007d:	6a 08                	push   0x8
      b6007f:	5f                   	pop    rdi
      b60080:	e8 7b de c8 00       	call   17edf00 <_Znwm@plt>
      b60085:	48 8d 0d f4 96 cb 00 	lea    rcx,[rip+0xcb96f4]        # 1819780 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf440>
      b6008c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6008f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60094:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60097:	48 89 e7             	mov    rdi,rsp
      b6009a:	e8 77 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6009f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b600a4:	48 85 ff             	test   rdi,rdi
      b600a7:	74 06                	je     b600af <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad04f>
      b600a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b600ac:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b600af:	6a 08                	push   0x8
      b600b1:	5f                   	pop    rdi
      b600b2:	e8 49 de c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6009a; FDE=(11925239, 11936142)
      b6004e:	e8 ad de c8 00       	call   17edf00 <_Znwm@plt>
      b60053:	48 8d 0d 66 97 cb 00 	lea    rcx,[rip+0xcb9766]        # 18197c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf480>
      b6005a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6005d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60062:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60065:	48 89 e7             	mov    rdi,rsp
      b60068:	e8 a9 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6006d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60072:	48 85 ff             	test   rdi,rdi
      b60075:	74 06                	je     b6007d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad01d>
      b60077:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6007a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6007d:	6a 08                	push   0x8
      b6007f:	5f                   	pop    rdi
      b60080:	e8 7b de c8 00       	call   17edf00 <_Znwm@plt>
      b60085:	48 8d 0d f4 96 cb 00 	lea    rcx,[rip+0xcb96f4]        # 1819780 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf440>
      b6008c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6008f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60094:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60097:	48 89 e7             	mov    rdi,rsp
      b6009a:	e8 77 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6009f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b600a4:	48 85 ff             	test   rdi,rdi
      b600a7:	74 06                	je     b600af <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad04f>
      b600a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b600ac:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b600af:	6a 08                	push   0x8
      b600b1:	5f                   	pop    rdi
      b600b2:	e8 49 de c8 00       	call   17edf00 <_Znwm@plt>
      b600b7:	48 8d 0d 82 96 cb 00 	lea    rcx,[rip+0xcb9682]        # 1819740 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf400>
      b600be:	48 89 08             	mov    QWORD PTR [rax],rcx
      b600c1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b600c6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b600c9:	48 89 e7             	mov    rdi,rsp
      b600cc:	e8 45 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b600d1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b600d6:	48 85 ff             	test   rdi,rdi
      b600d9:	74 06                	je     b600e1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad081>
      b600db:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b600de:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b600e1:	6a 08                	push   0x8
      b600e3:	5f                   	pop    rdi
      b600e4:	e8 17 de c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb600cc; FDE=(11925239, 11936142)
      b60080:	e8 7b de c8 00       	call   17edf00 <_Znwm@plt>
      b60085:	48 8d 0d f4 96 cb 00 	lea    rcx,[rip+0xcb96f4]        # 1819780 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf440>
      b6008c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6008f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60094:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60097:	48 89 e7             	mov    rdi,rsp
      b6009a:	e8 77 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6009f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b600a4:	48 85 ff             	test   rdi,rdi
      b600a7:	74 06                	je     b600af <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad04f>
      b600a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b600ac:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b600af:	6a 08                	push   0x8
      b600b1:	5f                   	pop    rdi
      b600b2:	e8 49 de c8 00       	call   17edf00 <_Znwm@plt>
      b600b7:	48 8d 0d 82 96 cb 00 	lea    rcx,[rip+0xcb9682]        # 1819740 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf400>
      b600be:	48 89 08             	mov    QWORD PTR [rax],rcx
      b600c1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b600c6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b600c9:	48 89 e7             	mov    rdi,rsp
      b600cc:	e8 45 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b600d1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b600d6:	48 85 ff             	test   rdi,rdi
      b600d9:	74 06                	je     b600e1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad081>
      b600db:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b600de:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b600e1:	6a 08                	push   0x8
      b600e3:	5f                   	pop    rdi
      b600e4:	e8 17 de c8 00       	call   17edf00 <_Znwm@plt>
      b600e9:	48 8d 0d 28 12 cc 00 	lea    rcx,[rip+0xcc1228]        # 1821318 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x16fd8>
      b600f0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b600f3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b600f8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b600fb:	48 89 e7             	mov    rdi,rsp
      b600fe:	e8 13 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60103:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60108:	48 85 ff             	test   rdi,rdi
      b6010b:	74 06                	je     b60113 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad0b3>
      b6010d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60110:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60113:	6a 08                	push   0x8
      b60115:	5f                   	pop    rdi
      b60116:	e8 e5 dd c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb600fe; FDE=(11925239, 11936142)
      b600b2:	e8 49 de c8 00       	call   17edf00 <_Znwm@plt>
      b600b7:	48 8d 0d 82 96 cb 00 	lea    rcx,[rip+0xcb9682]        # 1819740 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf400>
      b600be:	48 89 08             	mov    QWORD PTR [rax],rcx
      b600c1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b600c6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b600c9:	48 89 e7             	mov    rdi,rsp
      b600cc:	e8 45 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b600d1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b600d6:	48 85 ff             	test   rdi,rdi
      b600d9:	74 06                	je     b600e1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad081>
      b600db:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b600de:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b600e1:	6a 08                	push   0x8
      b600e3:	5f                   	pop    rdi
      b600e4:	e8 17 de c8 00       	call   17edf00 <_Znwm@plt>
      b600e9:	48 8d 0d 28 12 cc 00 	lea    rcx,[rip+0xcc1228]        # 1821318 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x16fd8>
      b600f0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b600f3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b600f8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b600fb:	48 89 e7             	mov    rdi,rsp
      b600fe:	e8 13 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60103:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60108:	48 85 ff             	test   rdi,rdi
      b6010b:	74 06                	je     b60113 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad0b3>
      b6010d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60110:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60113:	6a 08                	push   0x8
      b60115:	5f                   	pop    rdi
      b60116:	e8 e5 dd c8 00       	call   17edf00 <_Znwm@plt>
      b6011b:	48 8d 0d b6 11 cc 00 	lea    rcx,[rip+0xcc11b6]        # 18212d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x16f98>
      b60122:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60125:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6012a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6012d:	48 89 e7             	mov    rdi,rsp
      b60130:	e8 e1 d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60135:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6013a:	48 85 ff             	test   rdi,rdi
      b6013d:	74 06                	je     b60145 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad0e5>
      b6013f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60142:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60145:	6a 08                	push   0x8
      b60147:	5f                   	pop    rdi
      b60148:	e8 b3 dd c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60130; FDE=(11925239, 11936142)
      b600e4:	e8 17 de c8 00       	call   17edf00 <_Znwm@plt>
      b600e9:	48 8d 0d 28 12 cc 00 	lea    rcx,[rip+0xcc1228]        # 1821318 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x16fd8>
      b600f0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b600f3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b600f8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b600fb:	48 89 e7             	mov    rdi,rsp
      b600fe:	e8 13 da f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60103:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60108:	48 85 ff             	test   rdi,rdi
      b6010b:	74 06                	je     b60113 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad0b3>
      b6010d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60110:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60113:	6a 08                	push   0x8
      b60115:	5f                   	pop    rdi
      b60116:	e8 e5 dd c8 00       	call   17edf00 <_Znwm@plt>
      b6011b:	48 8d 0d b6 11 cc 00 	lea    rcx,[rip+0xcc11b6]        # 18212d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x16f98>
      b60122:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60125:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6012a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6012d:	48 89 e7             	mov    rdi,rsp
      b60130:	e8 e1 d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60135:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6013a:	48 85 ff             	test   rdi,rdi
      b6013d:	74 06                	je     b60145 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad0e5>
      b6013f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60142:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60145:	6a 08                	push   0x8
      b60147:	5f                   	pop    rdi
      b60148:	e8 b3 dd c8 00       	call   17edf00 <_Znwm@plt>
      b6014d:	48 8d 0d 7c 1f cb 00 	lea    rcx,[rip+0xcb1f7c]        # 18120d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7d90>
      b60154:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60157:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6015c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6015f:	48 89 e7             	mov    rdi,rsp
      b60162:	e8 af d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60167:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6016c:	48 85 ff             	test   rdi,rdi
      b6016f:	74 06                	je     b60177 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad117>
      b60171:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60174:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60177:	6a 08                	push   0x8
      b60179:	5f                   	pop    rdi
      b6017a:	e8 81 dd c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60162; FDE=(11925239, 11936142)
      b60116:	e8 e5 dd c8 00       	call   17edf00 <_Znwm@plt>
      b6011b:	48 8d 0d b6 11 cc 00 	lea    rcx,[rip+0xcc11b6]        # 18212d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x16f98>
      b60122:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60125:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6012a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6012d:	48 89 e7             	mov    rdi,rsp
      b60130:	e8 e1 d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60135:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6013a:	48 85 ff             	test   rdi,rdi
      b6013d:	74 06                	je     b60145 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad0e5>
      b6013f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60142:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60145:	6a 08                	push   0x8
      b60147:	5f                   	pop    rdi
      b60148:	e8 b3 dd c8 00       	call   17edf00 <_Znwm@plt>
      b6014d:	48 8d 0d 7c 1f cb 00 	lea    rcx,[rip+0xcb1f7c]        # 18120d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7d90>
      b60154:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60157:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6015c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6015f:	48 89 e7             	mov    rdi,rsp
      b60162:	e8 af d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60167:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6016c:	48 85 ff             	test   rdi,rdi
      b6016f:	74 06                	je     b60177 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad117>
      b60171:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60174:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60177:	6a 08                	push   0x8
      b60179:	5f                   	pop    rdi
      b6017a:	e8 81 dd c8 00       	call   17edf00 <_Znwm@plt>
      b6017f:	48 8d 0d 7a 17 cb 00 	lea    rcx,[rip+0xcb177a]        # 1811900 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x75c0>
      b60186:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60189:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6018e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60191:	48 89 e7             	mov    rdi,rsp
      b60194:	e8 7d d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60199:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6019e:	48 85 ff             	test   rdi,rdi
      b601a1:	74 06                	je     b601a9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad149>
      b601a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b601a6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b601a9:	6a 08                	push   0x8
      b601ab:	5f                   	pop    rdi
      b601ac:	e8 4f dd c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60194; FDE=(11925239, 11936142)
      b60148:	e8 b3 dd c8 00       	call   17edf00 <_Znwm@plt>
      b6014d:	48 8d 0d 7c 1f cb 00 	lea    rcx,[rip+0xcb1f7c]        # 18120d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7d90>
      b60154:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60157:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6015c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6015f:	48 89 e7             	mov    rdi,rsp
      b60162:	e8 af d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60167:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6016c:	48 85 ff             	test   rdi,rdi
      b6016f:	74 06                	je     b60177 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad117>
      b60171:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60174:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60177:	6a 08                	push   0x8
      b60179:	5f                   	pop    rdi
      b6017a:	e8 81 dd c8 00       	call   17edf00 <_Znwm@plt>
      b6017f:	48 8d 0d 7a 17 cb 00 	lea    rcx,[rip+0xcb177a]        # 1811900 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x75c0>
      b60186:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60189:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6018e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60191:	48 89 e7             	mov    rdi,rsp
      b60194:	e8 7d d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60199:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6019e:	48 85 ff             	test   rdi,rdi
      b601a1:	74 06                	je     b601a9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad149>
      b601a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b601a6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b601a9:	6a 08                	push   0x8
      b601ab:	5f                   	pop    rdi
      b601ac:	e8 4f dd c8 00       	call   17edf00 <_Znwm@plt>
      b601b1:	48 8d 0d f8 1b cb 00 	lea    rcx,[rip+0xcb1bf8]        # 1811db0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7a70>
      b601b8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b601bb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b601c0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b601c3:	48 89 e7             	mov    rdi,rsp
      b601c6:	e8 4b d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b601cb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b601d0:	48 85 ff             	test   rdi,rdi
      b601d3:	74 06                	je     b601db <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad17b>
      b601d5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b601d8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b601db:	6a 08                	push   0x8
      b601dd:	5f                   	pop    rdi
      b601de:	e8 1d dd c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb601c6; FDE=(11925239, 11936142)
      b6017a:	e8 81 dd c8 00       	call   17edf00 <_Znwm@plt>
      b6017f:	48 8d 0d 7a 17 cb 00 	lea    rcx,[rip+0xcb177a]        # 1811900 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x75c0>
      b60186:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60189:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6018e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60191:	48 89 e7             	mov    rdi,rsp
      b60194:	e8 7d d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60199:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6019e:	48 85 ff             	test   rdi,rdi
      b601a1:	74 06                	je     b601a9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad149>
      b601a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b601a6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b601a9:	6a 08                	push   0x8
      b601ab:	5f                   	pop    rdi
      b601ac:	e8 4f dd c8 00       	call   17edf00 <_Znwm@plt>
      b601b1:	48 8d 0d f8 1b cb 00 	lea    rcx,[rip+0xcb1bf8]        # 1811db0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7a70>
      b601b8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b601bb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b601c0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b601c3:	48 89 e7             	mov    rdi,rsp
      b601c6:	e8 4b d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b601cb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b601d0:	48 85 ff             	test   rdi,rdi
      b601d3:	74 06                	je     b601db <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad17b>
      b601d5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b601d8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b601db:	6a 08                	push   0x8
      b601dd:	5f                   	pop    rdi
      b601de:	e8 1d dd c8 00       	call   17edf00 <_Znwm@plt>
      b601e3:	48 8d 0d 86 1b cb 00 	lea    rcx,[rip+0xcb1b86]        # 1811d70 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7a30>
      b601ea:	48 89 08             	mov    QWORD PTR [rax],rcx
      b601ed:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b601f2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b601f5:	48 89 e7             	mov    rdi,rsp
      b601f8:	e8 19 d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b601fd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60202:	48 85 ff             	test   rdi,rdi
      b60205:	74 06                	je     b6020d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad1ad>
      b60207:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6020a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6020d:	6a 08                	push   0x8
      b6020f:	5f                   	pop    rdi
      b60210:	e8 eb dc c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb601f8; FDE=(11925239, 11936142)
      b601ac:	e8 4f dd c8 00       	call   17edf00 <_Znwm@plt>
      b601b1:	48 8d 0d f8 1b cb 00 	lea    rcx,[rip+0xcb1bf8]        # 1811db0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7a70>
      b601b8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b601bb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b601c0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b601c3:	48 89 e7             	mov    rdi,rsp
      b601c6:	e8 4b d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b601cb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b601d0:	48 85 ff             	test   rdi,rdi
      b601d3:	74 06                	je     b601db <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad17b>
      b601d5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b601d8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b601db:	6a 08                	push   0x8
      b601dd:	5f                   	pop    rdi
      b601de:	e8 1d dd c8 00       	call   17edf00 <_Znwm@plt>
      b601e3:	48 8d 0d 86 1b cb 00 	lea    rcx,[rip+0xcb1b86]        # 1811d70 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7a30>
      b601ea:	48 89 08             	mov    QWORD PTR [rax],rcx
      b601ed:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b601f2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b601f5:	48 89 e7             	mov    rdi,rsp
      b601f8:	e8 19 d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b601fd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60202:	48 85 ff             	test   rdi,rdi
      b60205:	74 06                	je     b6020d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad1ad>
      b60207:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6020a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6020d:	6a 08                	push   0x8
      b6020f:	5f                   	pop    rdi
      b60210:	e8 eb dc c8 00       	call   17edf00 <_Znwm@plt>
      b60215:	48 8d 0d 4c e3 ca 00 	lea    rcx,[rip+0xcae34c]        # 180e568 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4228>
      b6021c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6021f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60224:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60227:	48 89 e7             	mov    rdi,rsp
      b6022a:	e8 e7 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6022f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60234:	48 85 ff             	test   rdi,rdi
      b60237:	74 06                	je     b6023f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad1df>
      b60239:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6023c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6023f:	6a 08                	push   0x8
      b60241:	5f                   	pop    rdi
      b60242:	e8 b9 dc c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6022a; FDE=(11925239, 11936142)
      b601de:	e8 1d dd c8 00       	call   17edf00 <_Znwm@plt>
      b601e3:	48 8d 0d 86 1b cb 00 	lea    rcx,[rip+0xcb1b86]        # 1811d70 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7a30>
      b601ea:	48 89 08             	mov    QWORD PTR [rax],rcx
      b601ed:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b601f2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b601f5:	48 89 e7             	mov    rdi,rsp
      b601f8:	e8 19 d9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b601fd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60202:	48 85 ff             	test   rdi,rdi
      b60205:	74 06                	je     b6020d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad1ad>
      b60207:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6020a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6020d:	6a 08                	push   0x8
      b6020f:	5f                   	pop    rdi
      b60210:	e8 eb dc c8 00       	call   17edf00 <_Znwm@plt>
      b60215:	48 8d 0d 4c e3 ca 00 	lea    rcx,[rip+0xcae34c]        # 180e568 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4228>
      b6021c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6021f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60224:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60227:	48 89 e7             	mov    rdi,rsp
      b6022a:	e8 e7 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6022f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60234:	48 85 ff             	test   rdi,rdi
      b60237:	74 06                	je     b6023f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad1df>
      b60239:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6023c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6023f:	6a 08                	push   0x8
      b60241:	5f                   	pop    rdi
      b60242:	e8 b9 dc c8 00       	call   17edf00 <_Znwm@plt>
      b60247:	48 8d 0d e2 e4 ca 00 	lea    rcx,[rip+0xcae4e2]        # 180e730 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x43f0>
      b6024e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60251:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60256:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60259:	48 89 e7             	mov    rdi,rsp
      b6025c:	e8 b5 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60261:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60266:	48 85 ff             	test   rdi,rdi
      b60269:	74 06                	je     b60271 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad211>
      b6026b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6026e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60271:	6a 08                	push   0x8
      b60273:	5f                   	pop    rdi
      b60274:	e8 87 dc c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6025c; FDE=(11925239, 11936142)
      b60210:	e8 eb dc c8 00       	call   17edf00 <_Znwm@plt>
      b60215:	48 8d 0d 4c e3 ca 00 	lea    rcx,[rip+0xcae34c]        # 180e568 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4228>
      b6021c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6021f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60224:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60227:	48 89 e7             	mov    rdi,rsp
      b6022a:	e8 e7 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6022f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60234:	48 85 ff             	test   rdi,rdi
      b60237:	74 06                	je     b6023f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad1df>
      b60239:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6023c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6023f:	6a 08                	push   0x8
      b60241:	5f                   	pop    rdi
      b60242:	e8 b9 dc c8 00       	call   17edf00 <_Znwm@plt>
      b60247:	48 8d 0d e2 e4 ca 00 	lea    rcx,[rip+0xcae4e2]        # 180e730 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x43f0>
      b6024e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60251:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60256:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60259:	48 89 e7             	mov    rdi,rsp
      b6025c:	e8 b5 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60261:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60266:	48 85 ff             	test   rdi,rdi
      b60269:	74 06                	je     b60271 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad211>
      b6026b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6026e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60271:	6a 08                	push   0x8
      b60273:	5f                   	pop    rdi
      b60274:	e8 87 dc c8 00       	call   17edf00 <_Znwm@plt>
      b60279:	48 8d 0d 40 b5 cb 00 	lea    rcx,[rip+0xcbb540]        # 181b7c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11480>
      b60280:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60283:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60288:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6028b:	48 89 e7             	mov    rdi,rsp
      b6028e:	e8 83 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60293:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60298:	48 85 ff             	test   rdi,rdi
      b6029b:	74 06                	je     b602a3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad243>
      b6029d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b602a0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b602a3:	6a 08                	push   0x8
      b602a5:	5f                   	pop    rdi
      b602a6:	e8 55 dc c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6028e; FDE=(11925239, 11936142)
      b60242:	e8 b9 dc c8 00       	call   17edf00 <_Znwm@plt>
      b60247:	48 8d 0d e2 e4 ca 00 	lea    rcx,[rip+0xcae4e2]        # 180e730 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x43f0>
      b6024e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60251:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60256:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60259:	48 89 e7             	mov    rdi,rsp
      b6025c:	e8 b5 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60261:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60266:	48 85 ff             	test   rdi,rdi
      b60269:	74 06                	je     b60271 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad211>
      b6026b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6026e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60271:	6a 08                	push   0x8
      b60273:	5f                   	pop    rdi
      b60274:	e8 87 dc c8 00       	call   17edf00 <_Znwm@plt>
      b60279:	48 8d 0d 40 b5 cb 00 	lea    rcx,[rip+0xcbb540]        # 181b7c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11480>
      b60280:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60283:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60288:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6028b:	48 89 e7             	mov    rdi,rsp
      b6028e:	e8 83 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60293:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60298:	48 85 ff             	test   rdi,rdi
      b6029b:	74 06                	je     b602a3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad243>
      b6029d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b602a0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b602a3:	6a 08                	push   0x8
      b602a5:	5f                   	pop    rdi
      b602a6:	e8 55 dc c8 00       	call   17edf00 <_Znwm@plt>
      b602ab:	48 8d 0d 0e b3 cb 00 	lea    rcx,[rip+0xcbb30e]        # 181b5c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11280>
      b602b2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b602b5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b602ba:	48 89 06             	mov    QWORD PTR [rsi],rax
      b602bd:	48 89 e7             	mov    rdi,rsp
      b602c0:	e8 51 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b602c5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b602ca:	48 85 ff             	test   rdi,rdi
      b602cd:	74 06                	je     b602d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad275>
      b602cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b602d2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b602d5:	6a 08                	push   0x8
      b602d7:	5f                   	pop    rdi
      b602d8:	e8 23 dc c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb602c0; FDE=(11925239, 11936142)
      b60274:	e8 87 dc c8 00       	call   17edf00 <_Znwm@plt>
      b60279:	48 8d 0d 40 b5 cb 00 	lea    rcx,[rip+0xcbb540]        # 181b7c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11480>
      b60280:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60283:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60288:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6028b:	48 89 e7             	mov    rdi,rsp
      b6028e:	e8 83 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60293:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60298:	48 85 ff             	test   rdi,rdi
      b6029b:	74 06                	je     b602a3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad243>
      b6029d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b602a0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b602a3:	6a 08                	push   0x8
      b602a5:	5f                   	pop    rdi
      b602a6:	e8 55 dc c8 00       	call   17edf00 <_Znwm@plt>
      b602ab:	48 8d 0d 0e b3 cb 00 	lea    rcx,[rip+0xcbb30e]        # 181b5c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11280>
      b602b2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b602b5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b602ba:	48 89 06             	mov    QWORD PTR [rsi],rax
      b602bd:	48 89 e7             	mov    rdi,rsp
      b602c0:	e8 51 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b602c5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b602ca:	48 85 ff             	test   rdi,rdi
      b602cd:	74 06                	je     b602d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad275>
      b602cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b602d2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b602d5:	6a 08                	push   0x8
      b602d7:	5f                   	pop    rdi
      b602d8:	e8 23 dc c8 00       	call   17edf00 <_Znwm@plt>
      b602dd:	48 8d 0d e4 b7 cb 00 	lea    rcx,[rip+0xcbb7e4]        # 181bac8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11788>
      b602e4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b602e7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b602ec:	48 89 06             	mov    QWORD PTR [rsi],rax
      b602ef:	48 89 e7             	mov    rdi,rsp
      b602f2:	e8 1f d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b602f7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b602fc:	48 85 ff             	test   rdi,rdi
      b602ff:	74 06                	je     b60307 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad2a7>
      b60301:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60304:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60307:	6a 08                	push   0x8
      b60309:	5f                   	pop    rdi
      b6030a:	e8 f1 db c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb602f2; FDE=(11925239, 11936142)
      b602a6:	e8 55 dc c8 00       	call   17edf00 <_Znwm@plt>
      b602ab:	48 8d 0d 0e b3 cb 00 	lea    rcx,[rip+0xcbb30e]        # 181b5c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11280>
      b602b2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b602b5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b602ba:	48 89 06             	mov    QWORD PTR [rsi],rax
      b602bd:	48 89 e7             	mov    rdi,rsp
      b602c0:	e8 51 d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b602c5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b602ca:	48 85 ff             	test   rdi,rdi
      b602cd:	74 06                	je     b602d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad275>
      b602cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b602d2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b602d5:	6a 08                	push   0x8
      b602d7:	5f                   	pop    rdi
      b602d8:	e8 23 dc c8 00       	call   17edf00 <_Znwm@plt>
      b602dd:	48 8d 0d e4 b7 cb 00 	lea    rcx,[rip+0xcbb7e4]        # 181bac8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11788>
      b602e4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b602e7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b602ec:	48 89 06             	mov    QWORD PTR [rsi],rax
      b602ef:	48 89 e7             	mov    rdi,rsp
      b602f2:	e8 1f d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b602f7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b602fc:	48 85 ff             	test   rdi,rdi
      b602ff:	74 06                	je     b60307 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad2a7>
      b60301:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60304:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60307:	6a 08                	push   0x8
      b60309:	5f                   	pop    rdi
      b6030a:	e8 f1 db c8 00       	call   17edf00 <_Znwm@plt>
      b6030f:	48 8d 0d 42 9b cf 00 	lea    rcx,[rip+0xcf9b42]        # 1859e58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16540>
      b60316:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60319:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6031e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60321:	48 89 e7             	mov    rdi,rsp
      b60324:	e8 ed d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60329:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6032e:	48 85 ff             	test   rdi,rdi
      b60331:	74 06                	je     b60339 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad2d9>
      b60333:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60336:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60339:	6a 08                	push   0x8
      b6033b:	5f                   	pop    rdi
      b6033c:	e8 bf db c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60324; FDE=(11925239, 11936142)
      b602d8:	e8 23 dc c8 00       	call   17edf00 <_Znwm@plt>
      b602dd:	48 8d 0d e4 b7 cb 00 	lea    rcx,[rip+0xcbb7e4]        # 181bac8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11788>
      b602e4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b602e7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b602ec:	48 89 06             	mov    QWORD PTR [rsi],rax
      b602ef:	48 89 e7             	mov    rdi,rsp
      b602f2:	e8 1f d8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b602f7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b602fc:	48 85 ff             	test   rdi,rdi
      b602ff:	74 06                	je     b60307 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad2a7>
      b60301:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60304:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60307:	6a 08                	push   0x8
      b60309:	5f                   	pop    rdi
      b6030a:	e8 f1 db c8 00       	call   17edf00 <_Znwm@plt>
      b6030f:	48 8d 0d 42 9b cf 00 	lea    rcx,[rip+0xcf9b42]        # 1859e58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16540>
      b60316:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60319:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6031e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60321:	48 89 e7             	mov    rdi,rsp
      b60324:	e8 ed d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60329:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6032e:	48 85 ff             	test   rdi,rdi
      b60331:	74 06                	je     b60339 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad2d9>
      b60333:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60336:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60339:	6a 08                	push   0x8
      b6033b:	5f                   	pop    rdi
      b6033c:	e8 bf db c8 00       	call   17edf00 <_Znwm@plt>
      b60341:	48 8d 0d 08 31 cb 00 	lea    rcx,[rip+0xcb3108]        # 1813450 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9110>
      b60348:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6034b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60350:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60353:	48 89 e7             	mov    rdi,rsp
      b60356:	e8 bb d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6035b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60360:	48 85 ff             	test   rdi,rdi
      b60363:	74 06                	je     b6036b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30b>
      b60365:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60368:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6036b:	6a 08                	push   0x8
      b6036d:	5f                   	pop    rdi
      b6036e:	e8 8d db c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60356; FDE=(11925239, 11936142)
      b6030a:	e8 f1 db c8 00       	call   17edf00 <_Znwm@plt>
      b6030f:	48 8d 0d 42 9b cf 00 	lea    rcx,[rip+0xcf9b42]        # 1859e58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16540>
      b60316:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60319:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6031e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60321:	48 89 e7             	mov    rdi,rsp
      b60324:	e8 ed d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60329:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6032e:	48 85 ff             	test   rdi,rdi
      b60331:	74 06                	je     b60339 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad2d9>
      b60333:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60336:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60339:	6a 08                	push   0x8
      b6033b:	5f                   	pop    rdi
      b6033c:	e8 bf db c8 00       	call   17edf00 <_Znwm@plt>
      b60341:	48 8d 0d 08 31 cb 00 	lea    rcx,[rip+0xcb3108]        # 1813450 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9110>
      b60348:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6034b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60350:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60353:	48 89 e7             	mov    rdi,rsp
      b60356:	e8 bb d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6035b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60360:	48 85 ff             	test   rdi,rdi
      b60363:	74 06                	je     b6036b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30b>
      b60365:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60368:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6036b:	6a 08                	push   0x8
      b6036d:	5f                   	pop    rdi
      b6036e:	e8 8d db c8 00       	call   17edf00 <_Znwm@plt>
      b60373:	48 8d 0d 56 e8 cb 00 	lea    rcx,[rip+0xcbe856]        # 181ebd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14890>
      b6037a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6037d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60382:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60385:	48 89 e7             	mov    rdi,rsp
      b60388:	e8 89 d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6038d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60392:	48 85 ff             	test   rdi,rdi
      b60395:	74 06                	je     b6039d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad33d>
      b60397:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6039a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6039d:	6a 08                	push   0x8
      b6039f:	5f                   	pop    rdi
      b603a0:	e8 5b db c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60388; FDE=(11925239, 11936142)
      b6033c:	e8 bf db c8 00       	call   17edf00 <_Znwm@plt>
      b60341:	48 8d 0d 08 31 cb 00 	lea    rcx,[rip+0xcb3108]        # 1813450 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x9110>
      b60348:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6034b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60350:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60353:	48 89 e7             	mov    rdi,rsp
      b60356:	e8 bb d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6035b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60360:	48 85 ff             	test   rdi,rdi
      b60363:	74 06                	je     b6036b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30b>
      b60365:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60368:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6036b:	6a 08                	push   0x8
      b6036d:	5f                   	pop    rdi
      b6036e:	e8 8d db c8 00       	call   17edf00 <_Znwm@plt>
      b60373:	48 8d 0d 56 e8 cb 00 	lea    rcx,[rip+0xcbe856]        # 181ebd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14890>
      b6037a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6037d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60382:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60385:	48 89 e7             	mov    rdi,rsp
      b60388:	e8 89 d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6038d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60392:	48 85 ff             	test   rdi,rdi
      b60395:	74 06                	je     b6039d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad33d>
      b60397:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6039a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6039d:	6a 08                	push   0x8
      b6039f:	5f                   	pop    rdi
      b603a0:	e8 5b db c8 00       	call   17edf00 <_Znwm@plt>
      b603a5:	48 8d 0d 94 26 cb 00 	lea    rcx,[rip+0xcb2694]        # 1812a40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x8700>
      b603ac:	48 89 08             	mov    QWORD PTR [rax],rcx
      b603af:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b603b4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b603b7:	48 89 e7             	mov    rdi,rsp
      b603ba:	e8 57 d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b603bf:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b603c4:	48 85 ff             	test   rdi,rdi
      b603c7:	74 06                	je     b603cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad36f>
      b603c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b603cc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b603cf:	6a 08                	push   0x8
      b603d1:	5f                   	pop    rdi
      b603d2:	e8 29 db c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb603ba; FDE=(11925239, 11936142)
      b6036e:	e8 8d db c8 00       	call   17edf00 <_Znwm@plt>
      b60373:	48 8d 0d 56 e8 cb 00 	lea    rcx,[rip+0xcbe856]        # 181ebd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14890>
      b6037a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6037d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60382:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60385:	48 89 e7             	mov    rdi,rsp
      b60388:	e8 89 d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6038d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60392:	48 85 ff             	test   rdi,rdi
      b60395:	74 06                	je     b6039d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad33d>
      b60397:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6039a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6039d:	6a 08                	push   0x8
      b6039f:	5f                   	pop    rdi
      b603a0:	e8 5b db c8 00       	call   17edf00 <_Znwm@plt>
      b603a5:	48 8d 0d 94 26 cb 00 	lea    rcx,[rip+0xcb2694]        # 1812a40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x8700>
      b603ac:	48 89 08             	mov    QWORD PTR [rax],rcx
      b603af:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b603b4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b603b7:	48 89 e7             	mov    rdi,rsp
      b603ba:	e8 57 d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b603bf:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b603c4:	48 85 ff             	test   rdi,rdi
      b603c7:	74 06                	je     b603cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad36f>
      b603c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b603cc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b603cf:	6a 08                	push   0x8
      b603d1:	5f                   	pop    rdi
      b603d2:	e8 29 db c8 00       	call   17edf00 <_Znwm@plt>
      b603d7:	48 8d 0d f2 2e cb 00 	lea    rcx,[rip+0xcb2ef2]        # 18132d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x8f90>
      b603de:	48 89 08             	mov    QWORD PTR [rax],rcx
      b603e1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b603e6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b603e9:	48 89 e7             	mov    rdi,rsp
      b603ec:	e8 25 d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b603f1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b603f6:	48 85 ff             	test   rdi,rdi
      b603f9:	74 06                	je     b60401 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad3a1>
      b603fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b603fe:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60401:	6a 08                	push   0x8
      b60403:	5f                   	pop    rdi
      b60404:	e8 f7 da c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb603ec; FDE=(11925239, 11936142)
      b603a0:	e8 5b db c8 00       	call   17edf00 <_Znwm@plt>
      b603a5:	48 8d 0d 94 26 cb 00 	lea    rcx,[rip+0xcb2694]        # 1812a40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x8700>
      b603ac:	48 89 08             	mov    QWORD PTR [rax],rcx
      b603af:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b603b4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b603b7:	48 89 e7             	mov    rdi,rsp
      b603ba:	e8 57 d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b603bf:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b603c4:	48 85 ff             	test   rdi,rdi
      b603c7:	74 06                	je     b603cf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad36f>
      b603c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b603cc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b603cf:	6a 08                	push   0x8
      b603d1:	5f                   	pop    rdi
      b603d2:	e8 29 db c8 00       	call   17edf00 <_Znwm@plt>
      b603d7:	48 8d 0d f2 2e cb 00 	lea    rcx,[rip+0xcb2ef2]        # 18132d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x8f90>
      b603de:	48 89 08             	mov    QWORD PTR [rax],rcx
      b603e1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b603e6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b603e9:	48 89 e7             	mov    rdi,rsp
      b603ec:	e8 25 d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b603f1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b603f6:	48 85 ff             	test   rdi,rdi
      b603f9:	74 06                	je     b60401 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad3a1>
      b603fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b603fe:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60401:	6a 08                	push   0x8
      b60403:	5f                   	pop    rdi
      b60404:	e8 f7 da c8 00       	call   17edf00 <_Znwm@plt>
      b60409:	48 8d 0d 70 16 cb 00 	lea    rcx,[rip+0xcb1670]        # 1811a80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7740>
      b60410:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60413:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60418:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6041b:	48 89 e7             	mov    rdi,rsp
      b6041e:	e8 f3 d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60423:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60428:	48 85 ff             	test   rdi,rdi
      b6042b:	74 06                	je     b60433 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad3d3>
      b6042d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60430:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60433:	6a 08                	push   0x8
      b60435:	5f                   	pop    rdi
      b60436:	e8 c5 da c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6041e; FDE=(11925239, 11936142)
      b603d2:	e8 29 db c8 00       	call   17edf00 <_Znwm@plt>
      b603d7:	48 8d 0d f2 2e cb 00 	lea    rcx,[rip+0xcb2ef2]        # 18132d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x8f90>
      b603de:	48 89 08             	mov    QWORD PTR [rax],rcx
      b603e1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b603e6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b603e9:	48 89 e7             	mov    rdi,rsp
      b603ec:	e8 25 d7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b603f1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b603f6:	48 85 ff             	test   rdi,rdi
      b603f9:	74 06                	je     b60401 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad3a1>
      b603fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b603fe:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60401:	6a 08                	push   0x8
      b60403:	5f                   	pop    rdi
      b60404:	e8 f7 da c8 00       	call   17edf00 <_Znwm@plt>
      b60409:	48 8d 0d 70 16 cb 00 	lea    rcx,[rip+0xcb1670]        # 1811a80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7740>
      b60410:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60413:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60418:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6041b:	48 89 e7             	mov    rdi,rsp
      b6041e:	e8 f3 d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60423:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60428:	48 85 ff             	test   rdi,rdi
      b6042b:	74 06                	je     b60433 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad3d3>
      b6042d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60430:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60433:	6a 08                	push   0x8
      b60435:	5f                   	pop    rdi
      b60436:	e8 c5 da c8 00       	call   17edf00 <_Znwm@plt>
      b6043b:	48 8d 0d be 23 cb 00 	lea    rcx,[rip+0xcb23be]        # 1812800 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x84c0>
      b60442:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60445:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6044a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6044d:	48 89 e7             	mov    rdi,rsp
      b60450:	e8 c1 d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60455:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6045a:	48 85 ff             	test   rdi,rdi
      b6045d:	74 06                	je     b60465 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad405>
      b6045f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60462:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60465:	6a 08                	push   0x8
      b60467:	5f                   	pop    rdi
      b60468:	e8 93 da c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60450; FDE=(11925239, 11936142)
      b60404:	e8 f7 da c8 00       	call   17edf00 <_Znwm@plt>
      b60409:	48 8d 0d 70 16 cb 00 	lea    rcx,[rip+0xcb1670]        # 1811a80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7740>
      b60410:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60413:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60418:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6041b:	48 89 e7             	mov    rdi,rsp
      b6041e:	e8 f3 d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60423:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60428:	48 85 ff             	test   rdi,rdi
      b6042b:	74 06                	je     b60433 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad3d3>
      b6042d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60430:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60433:	6a 08                	push   0x8
      b60435:	5f                   	pop    rdi
      b60436:	e8 c5 da c8 00       	call   17edf00 <_Znwm@plt>
      b6043b:	48 8d 0d be 23 cb 00 	lea    rcx,[rip+0xcb23be]        # 1812800 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x84c0>
      b60442:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60445:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6044a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6044d:	48 89 e7             	mov    rdi,rsp
      b60450:	e8 c1 d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60455:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6045a:	48 85 ff             	test   rdi,rdi
      b6045d:	74 06                	je     b60465 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad405>
      b6045f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60462:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60465:	6a 08                	push   0x8
      b60467:	5f                   	pop    rdi
      b60468:	e8 93 da c8 00       	call   17edf00 <_Znwm@plt>
      b6046d:	48 8d 0d b4 17 cb 00 	lea    rcx,[rip+0xcb17b4]        # 1811c28 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x78e8>
      b60474:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60477:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6047c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6047f:	48 89 e7             	mov    rdi,rsp
      b60482:	e8 8f d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60487:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6048c:	48 85 ff             	test   rdi,rdi
      b6048f:	74 06                	je     b60497 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad437>
      b60491:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60494:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60497:	6a 08                	push   0x8
      b60499:	5f                   	pop    rdi
      b6049a:	e8 61 da c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60482; FDE=(11925239, 11936142)
      b60436:	e8 c5 da c8 00       	call   17edf00 <_Znwm@plt>
      b6043b:	48 8d 0d be 23 cb 00 	lea    rcx,[rip+0xcb23be]        # 1812800 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x84c0>
      b60442:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60445:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6044a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6044d:	48 89 e7             	mov    rdi,rsp
      b60450:	e8 c1 d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60455:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6045a:	48 85 ff             	test   rdi,rdi
      b6045d:	74 06                	je     b60465 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad405>
      b6045f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60462:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60465:	6a 08                	push   0x8
      b60467:	5f                   	pop    rdi
      b60468:	e8 93 da c8 00       	call   17edf00 <_Znwm@plt>
      b6046d:	48 8d 0d b4 17 cb 00 	lea    rcx,[rip+0xcb17b4]        # 1811c28 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x78e8>
      b60474:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60477:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6047c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6047f:	48 89 e7             	mov    rdi,rsp
      b60482:	e8 8f d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60487:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6048c:	48 85 ff             	test   rdi,rdi
      b6048f:	74 06                	je     b60497 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad437>
      b60491:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60494:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60497:	6a 08                	push   0x8
      b60499:	5f                   	pop    rdi
      b6049a:	e8 61 da c8 00       	call   17edf00 <_Znwm@plt>
      b6049f:	48 8d 0d d2 a1 d0 00 	lea    rcx,[rip+0xd0a1d2]        # 186a678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26d60>
      b604a6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b604a9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b604ae:	48 89 06             	mov    QWORD PTR [rsi],rax
      b604b1:	48 89 e7             	mov    rdi,rsp
      b604b4:	e8 5d d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b604b9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b604be:	48 85 ff             	test   rdi,rdi
      b604c1:	74 06                	je     b604c9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad469>
      b604c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b604c6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b604c9:	6a 08                	push   0x8
      b604cb:	5f                   	pop    rdi
      b604cc:	e8 2f da c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb604b4; FDE=(11925239, 11936142)
      b60468:	e8 93 da c8 00       	call   17edf00 <_Znwm@plt>
      b6046d:	48 8d 0d b4 17 cb 00 	lea    rcx,[rip+0xcb17b4]        # 1811c28 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x78e8>
      b60474:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60477:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6047c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6047f:	48 89 e7             	mov    rdi,rsp
      b60482:	e8 8f d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60487:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6048c:	48 85 ff             	test   rdi,rdi
      b6048f:	74 06                	je     b60497 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad437>
      b60491:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60494:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60497:	6a 08                	push   0x8
      b60499:	5f                   	pop    rdi
      b6049a:	e8 61 da c8 00       	call   17edf00 <_Znwm@plt>
      b6049f:	48 8d 0d d2 a1 d0 00 	lea    rcx,[rip+0xd0a1d2]        # 186a678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26d60>
      b604a6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b604a9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b604ae:	48 89 06             	mov    QWORD PTR [rsi],rax
      b604b1:	48 89 e7             	mov    rdi,rsp
      b604b4:	e8 5d d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b604b9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b604be:	48 85 ff             	test   rdi,rdi
      b604c1:	74 06                	je     b604c9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad469>
      b604c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b604c6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b604c9:	6a 08                	push   0x8
      b604cb:	5f                   	pop    rdi
      b604cc:	e8 2f da c8 00       	call   17edf00 <_Znwm@plt>
      b604d1:	48 8d 0d 30 0c d1 00 	lea    rcx,[rip+0xd10c30]        # 1871108 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d7f0>
      b604d8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b604db:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b604e0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b604e3:	48 89 e7             	mov    rdi,rsp
      b604e6:	e8 2b d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b604eb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b604f0:	48 85 ff             	test   rdi,rdi
      b604f3:	74 06                	je     b604fb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad49b>
      b604f5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b604f8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b604fb:	6a 08                	push   0x8
      b604fd:	5f                   	pop    rdi
      b604fe:	e8 fd d9 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb604e6; FDE=(11925239, 11936142)
      b6049a:	e8 61 da c8 00       	call   17edf00 <_Znwm@plt>
      b6049f:	48 8d 0d d2 a1 d0 00 	lea    rcx,[rip+0xd0a1d2]        # 186a678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26d60>
      b604a6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b604a9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b604ae:	48 89 06             	mov    QWORD PTR [rsi],rax
      b604b1:	48 89 e7             	mov    rdi,rsp
      b604b4:	e8 5d d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b604b9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b604be:	48 85 ff             	test   rdi,rdi
      b604c1:	74 06                	je     b604c9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad469>
      b604c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b604c6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b604c9:	6a 08                	push   0x8
      b604cb:	5f                   	pop    rdi
      b604cc:	e8 2f da c8 00       	call   17edf00 <_Znwm@plt>
      b604d1:	48 8d 0d 30 0c d1 00 	lea    rcx,[rip+0xd10c30]        # 1871108 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d7f0>
      b604d8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b604db:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b604e0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b604e3:	48 89 e7             	mov    rdi,rsp
      b604e6:	e8 2b d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b604eb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b604f0:	48 85 ff             	test   rdi,rdi
      b604f3:	74 06                	je     b604fb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad49b>
      b604f5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b604f8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b604fb:	6a 08                	push   0x8
      b604fd:	5f                   	pop    rdi
      b604fe:	e8 fd d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60503:	48 8d 0d 9e 0c d1 00 	lea    rcx,[rip+0xd10c9e]        # 18711a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d890>
      b6050a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6050d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60512:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60515:	48 89 e7             	mov    rdi,rsp
      b60518:	e8 f9 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6051d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60522:	48 85 ff             	test   rdi,rdi
      b60525:	74 06                	je     b6052d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad4cd>
      b60527:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6052a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6052d:	6a 08                	push   0x8
      b6052f:	5f                   	pop    rdi
      b60530:	e8 cb d9 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60518; FDE=(11925239, 11936142)
      b604cc:	e8 2f da c8 00       	call   17edf00 <_Znwm@plt>
      b604d1:	48 8d 0d 30 0c d1 00 	lea    rcx,[rip+0xd10c30]        # 1871108 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d7f0>
      b604d8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b604db:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b604e0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b604e3:	48 89 e7             	mov    rdi,rsp
      b604e6:	e8 2b d6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b604eb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b604f0:	48 85 ff             	test   rdi,rdi
      b604f3:	74 06                	je     b604fb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad49b>
      b604f5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b604f8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b604fb:	6a 08                	push   0x8
      b604fd:	5f                   	pop    rdi
      b604fe:	e8 fd d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60503:	48 8d 0d 9e 0c d1 00 	lea    rcx,[rip+0xd10c9e]        # 18711a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d890>
      b6050a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6050d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60512:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60515:	48 89 e7             	mov    rdi,rsp
      b60518:	e8 f9 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6051d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60522:	48 85 ff             	test   rdi,rdi
      b60525:	74 06                	je     b6052d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad4cd>
      b60527:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6052a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6052d:	6a 08                	push   0x8
      b6052f:	5f                   	pop    rdi
      b60530:	e8 cb d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60535:	48 8d 0d 3c b3 cb 00 	lea    rcx,[rip+0xcbb33c]        # 181b878 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11538>
      b6053c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6053f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60544:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60547:	48 89 e7             	mov    rdi,rsp
      b6054a:	e8 c7 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6054f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60554:	48 85 ff             	test   rdi,rdi
      b60557:	74 06                	je     b6055f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad4ff>
      b60559:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6055c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6055f:	6a 08                	push   0x8
      b60561:	5f                   	pop    rdi
      b60562:	e8 99 d9 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6054a; FDE=(11925239, 11936142)
      b604fe:	e8 fd d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60503:	48 8d 0d 9e 0c d1 00 	lea    rcx,[rip+0xd10c9e]        # 18711a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d890>
      b6050a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6050d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60512:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60515:	48 89 e7             	mov    rdi,rsp
      b60518:	e8 f9 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6051d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60522:	48 85 ff             	test   rdi,rdi
      b60525:	74 06                	je     b6052d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad4cd>
      b60527:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6052a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6052d:	6a 08                	push   0x8
      b6052f:	5f                   	pop    rdi
      b60530:	e8 cb d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60535:	48 8d 0d 3c b3 cb 00 	lea    rcx,[rip+0xcbb33c]        # 181b878 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11538>
      b6053c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6053f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60544:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60547:	48 89 e7             	mov    rdi,rsp
      b6054a:	e8 c7 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6054f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60554:	48 85 ff             	test   rdi,rdi
      b60557:	74 06                	je     b6055f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad4ff>
      b60559:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6055c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6055f:	6a 08                	push   0x8
      b60561:	5f                   	pop    rdi
      b60562:	e8 99 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60567:	48 8d 0d fa 41 cf 00 	lea    rcx,[rip+0xcf41fa]        # 1854768 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10e50>
      b6056e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60571:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60576:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60579:	48 89 e7             	mov    rdi,rsp
      b6057c:	e8 95 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60581:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60586:	48 85 ff             	test   rdi,rdi
      b60589:	74 06                	je     b60591 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad531>
      b6058b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6058e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60591:	6a 08                	push   0x8
      b60593:	5f                   	pop    rdi
      b60594:	e8 67 d9 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6057c; FDE=(11925239, 11936142)
      b60530:	e8 cb d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60535:	48 8d 0d 3c b3 cb 00 	lea    rcx,[rip+0xcbb33c]        # 181b878 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11538>
      b6053c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6053f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60544:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60547:	48 89 e7             	mov    rdi,rsp
      b6054a:	e8 c7 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6054f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60554:	48 85 ff             	test   rdi,rdi
      b60557:	74 06                	je     b6055f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad4ff>
      b60559:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6055c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6055f:	6a 08                	push   0x8
      b60561:	5f                   	pop    rdi
      b60562:	e8 99 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60567:	48 8d 0d fa 41 cf 00 	lea    rcx,[rip+0xcf41fa]        # 1854768 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10e50>
      b6056e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60571:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60576:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60579:	48 89 e7             	mov    rdi,rsp
      b6057c:	e8 95 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60581:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60586:	48 85 ff             	test   rdi,rdi
      b60589:	74 06                	je     b60591 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad531>
      b6058b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6058e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60591:	6a 08                	push   0x8
      b60593:	5f                   	pop    rdi
      b60594:	e8 67 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60599:	48 8d 0d 98 b2 cb 00 	lea    rcx,[rip+0xcbb298]        # 181b838 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x114f8>
      b605a0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b605a3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b605a8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b605ab:	48 89 e7             	mov    rdi,rsp
      b605ae:	e8 63 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b605b3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b605b8:	48 85 ff             	test   rdi,rdi
      b605bb:	74 06                	je     b605c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad563>
      b605bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b605c0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b605c3:	6a 08                	push   0x8
      b605c5:	5f                   	pop    rdi
      b605c6:	e8 35 d9 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb605ae; FDE=(11925239, 11936142)
      b60562:	e8 99 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60567:	48 8d 0d fa 41 cf 00 	lea    rcx,[rip+0xcf41fa]        # 1854768 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10e50>
      b6056e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60571:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60576:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60579:	48 89 e7             	mov    rdi,rsp
      b6057c:	e8 95 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60581:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60586:	48 85 ff             	test   rdi,rdi
      b60589:	74 06                	je     b60591 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad531>
      b6058b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6058e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60591:	6a 08                	push   0x8
      b60593:	5f                   	pop    rdi
      b60594:	e8 67 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60599:	48 8d 0d 98 b2 cb 00 	lea    rcx,[rip+0xcbb298]        # 181b838 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x114f8>
      b605a0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b605a3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b605a8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b605ab:	48 89 e7             	mov    rdi,rsp
      b605ae:	e8 63 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b605b3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b605b8:	48 85 ff             	test   rdi,rdi
      b605bb:	74 06                	je     b605c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad563>
      b605bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b605c0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b605c3:	6a 08                	push   0x8
      b605c5:	5f                   	pop    rdi
      b605c6:	e8 35 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b605cb:	48 8d 0d 56 41 cf 00 	lea    rcx,[rip+0xcf4156]        # 1854728 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10e10>
      b605d2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b605d5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b605da:	48 89 06             	mov    QWORD PTR [rsi],rax
      b605dd:	48 89 e7             	mov    rdi,rsp
      b605e0:	e8 31 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b605e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b605ea:	48 85 ff             	test   rdi,rdi
      b605ed:	74 06                	je     b605f5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad595>
      b605ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b605f2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b605f5:	6a 08                	push   0x8
      b605f7:	5f                   	pop    rdi
      b605f8:	e8 03 d9 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb605e0; FDE=(11925239, 11936142)
      b60594:	e8 67 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b60599:	48 8d 0d 98 b2 cb 00 	lea    rcx,[rip+0xcbb298]        # 181b838 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x114f8>
      b605a0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b605a3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b605a8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b605ab:	48 89 e7             	mov    rdi,rsp
      b605ae:	e8 63 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b605b3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b605b8:	48 85 ff             	test   rdi,rdi
      b605bb:	74 06                	je     b605c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad563>
      b605bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b605c0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b605c3:	6a 08                	push   0x8
      b605c5:	5f                   	pop    rdi
      b605c6:	e8 35 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b605cb:	48 8d 0d 56 41 cf 00 	lea    rcx,[rip+0xcf4156]        # 1854728 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10e10>
      b605d2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b605d5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b605da:	48 89 06             	mov    QWORD PTR [rsi],rax
      b605dd:	48 89 e7             	mov    rdi,rsp
      b605e0:	e8 31 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b605e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b605ea:	48 85 ff             	test   rdi,rdi
      b605ed:	74 06                	je     b605f5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad595>
      b605ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b605f2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b605f5:	6a 08                	push   0x8
      b605f7:	5f                   	pop    rdi
      b605f8:	e8 03 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b605fd:	48 8d 0d 74 3c cf 00 	lea    rcx,[rip+0xcf3c74]        # 1854278 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10960>
      b60604:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60607:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6060c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6060f:	48 89 e7             	mov    rdi,rsp
      b60612:	e8 ff d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60617:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6061c:	48 85 ff             	test   rdi,rdi
      b6061f:	74 06                	je     b60627 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad5c7>
      b60621:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60624:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60627:	6a 08                	push   0x8
      b60629:	5f                   	pop    rdi
      b6062a:	e8 d1 d8 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60612; FDE=(11925239, 11936142)
      b605c6:	e8 35 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b605cb:	48 8d 0d 56 41 cf 00 	lea    rcx,[rip+0xcf4156]        # 1854728 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10e10>
      b605d2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b605d5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b605da:	48 89 06             	mov    QWORD PTR [rsi],rax
      b605dd:	48 89 e7             	mov    rdi,rsp
      b605e0:	e8 31 d5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b605e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b605ea:	48 85 ff             	test   rdi,rdi
      b605ed:	74 06                	je     b605f5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad595>
      b605ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b605f2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b605f5:	6a 08                	push   0x8
      b605f7:	5f                   	pop    rdi
      b605f8:	e8 03 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b605fd:	48 8d 0d 74 3c cf 00 	lea    rcx,[rip+0xcf3c74]        # 1854278 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10960>
      b60604:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60607:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6060c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6060f:	48 89 e7             	mov    rdi,rsp
      b60612:	e8 ff d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60617:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6061c:	48 85 ff             	test   rdi,rdi
      b6061f:	74 06                	je     b60627 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad5c7>
      b60621:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60624:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60627:	6a 08                	push   0x8
      b60629:	5f                   	pop    rdi
      b6062a:	e8 d1 d8 c8 00       	call   17edf00 <_Znwm@plt>
      b6062f:	48 8d 0d 02 3c cf 00 	lea    rcx,[rip+0xcf3c02]        # 1854238 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10920>
      b60636:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60639:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6063e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60641:	48 89 e7             	mov    rdi,rsp
      b60644:	e8 cd d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60649:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6064e:	48 85 ff             	test   rdi,rdi
      b60651:	74 06                	je     b60659 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad5f9>
      b60653:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60656:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60659:	6a 08                	push   0x8
      b6065b:	5f                   	pop    rdi
      b6065c:	e8 9f d8 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60644; FDE=(11925239, 11936142)
      b605f8:	e8 03 d9 c8 00       	call   17edf00 <_Znwm@plt>
      b605fd:	48 8d 0d 74 3c cf 00 	lea    rcx,[rip+0xcf3c74]        # 1854278 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10960>
      b60604:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60607:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6060c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6060f:	48 89 e7             	mov    rdi,rsp
      b60612:	e8 ff d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60617:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6061c:	48 85 ff             	test   rdi,rdi
      b6061f:	74 06                	je     b60627 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad5c7>
      b60621:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60624:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60627:	6a 08                	push   0x8
      b60629:	5f                   	pop    rdi
      b6062a:	e8 d1 d8 c8 00       	call   17edf00 <_Znwm@plt>
      b6062f:	48 8d 0d 02 3c cf 00 	lea    rcx,[rip+0xcf3c02]        # 1854238 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10920>
      b60636:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60639:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6063e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60641:	48 89 e7             	mov    rdi,rsp
      b60644:	e8 cd d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60649:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6064e:	48 85 ff             	test   rdi,rdi
      b60651:	74 06                	je     b60659 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad5f9>
      b60653:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60656:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60659:	6a 08                	push   0x8
      b6065b:	5f                   	pop    rdi
      b6065c:	e8 9f d8 c8 00       	call   17edf00 <_Znwm@plt>
      b60661:	48 8d 0d 80 39 cf 00 	lea    rcx,[rip+0xcf3980]        # 1853fe8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x106d0>
      b60668:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6066b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60670:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60673:	48 89 e7             	mov    rdi,rsp
      b60676:	e8 9b d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6067b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60680:	48 85 ff             	test   rdi,rdi
      b60683:	74 06                	je     b6068b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad62b>
      b60685:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60688:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6068b:	6a 08                	push   0x8
      b6068d:	5f                   	pop    rdi
      b6068e:	e8 6d d8 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60676; FDE=(11925239, 11936142)
      b6062a:	e8 d1 d8 c8 00       	call   17edf00 <_Znwm@plt>
      b6062f:	48 8d 0d 02 3c cf 00 	lea    rcx,[rip+0xcf3c02]        # 1854238 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10920>
      b60636:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60639:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6063e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60641:	48 89 e7             	mov    rdi,rsp
      b60644:	e8 cd d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60649:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6064e:	48 85 ff             	test   rdi,rdi
      b60651:	74 06                	je     b60659 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad5f9>
      b60653:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60656:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60659:	6a 08                	push   0x8
      b6065b:	5f                   	pop    rdi
      b6065c:	e8 9f d8 c8 00       	call   17edf00 <_Znwm@plt>
      b60661:	48 8d 0d 80 39 cf 00 	lea    rcx,[rip+0xcf3980]        # 1853fe8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x106d0>
      b60668:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6066b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60670:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60673:	48 89 e7             	mov    rdi,rsp
      b60676:	e8 9b d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6067b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60680:	48 85 ff             	test   rdi,rdi
      b60683:	74 06                	je     b6068b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad62b>
      b60685:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60688:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6068b:	6a 08                	push   0x8
      b6068d:	5f                   	pop    rdi
      b6068e:	e8 6d d8 c8 00       	call   17edf00 <_Znwm@plt>
      b60693:	48 8d 0d 0e 39 cf 00 	lea    rcx,[rip+0xcf390e]        # 1853fa8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10690>
      b6069a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6069d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b606a2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b606a5:	48 89 e7             	mov    rdi,rsp
      b606a8:	e8 69 d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b606ad:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b606b2:	48 85 ff             	test   rdi,rdi
      b606b5:	74 06                	je     b606bd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad65d>
      b606b7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b606ba:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b606bd:	6a 08                	push   0x8
      b606bf:	5f                   	pop    rdi
      b606c0:	e8 3b d8 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb606a8; FDE=(11925239, 11936142)
      b6065c:	e8 9f d8 c8 00       	call   17edf00 <_Znwm@plt>
      b60661:	48 8d 0d 80 39 cf 00 	lea    rcx,[rip+0xcf3980]        # 1853fe8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x106d0>
      b60668:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6066b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60670:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60673:	48 89 e7             	mov    rdi,rsp
      b60676:	e8 9b d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6067b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60680:	48 85 ff             	test   rdi,rdi
      b60683:	74 06                	je     b6068b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad62b>
      b60685:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60688:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6068b:	6a 08                	push   0x8
      b6068d:	5f                   	pop    rdi
      b6068e:	e8 6d d8 c8 00       	call   17edf00 <_Znwm@plt>
      b60693:	48 8d 0d 0e 39 cf 00 	lea    rcx,[rip+0xcf390e]        # 1853fa8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10690>
      b6069a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6069d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b606a2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b606a5:	48 89 e7             	mov    rdi,rsp
      b606a8:	e8 69 d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b606ad:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b606b2:	48 85 ff             	test   rdi,rdi
      b606b5:	74 06                	je     b606bd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad65d>
      b606b7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b606ba:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b606bd:	6a 08                	push   0x8
      b606bf:	5f                   	pop    rdi
      b606c0:	e8 3b d8 c8 00       	call   17edf00 <_Znwm@plt>
      b606c5:	48 8d 0d 1c 40 cf 00 	lea    rcx,[rip+0xcf401c]        # 18546e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10dd0>
      b606cc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b606cf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b606d4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b606d7:	48 89 e7             	mov    rdi,rsp
      b606da:	e8 37 d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b606df:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b606e4:	48 85 ff             	test   rdi,rdi
      b606e7:	74 06                	je     b606ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad68f>
      b606e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b606ec:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b606ef:	6a 08                	push   0x8
      b606f1:	5f                   	pop    rdi
      b606f2:	e8 09 d8 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb606da; FDE=(11925239, 11936142)
      b6068e:	e8 6d d8 c8 00       	call   17edf00 <_Znwm@plt>
      b60693:	48 8d 0d 0e 39 cf 00 	lea    rcx,[rip+0xcf390e]        # 1853fa8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10690>
      b6069a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6069d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b606a2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b606a5:	48 89 e7             	mov    rdi,rsp
      b606a8:	e8 69 d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b606ad:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b606b2:	48 85 ff             	test   rdi,rdi
      b606b5:	74 06                	je     b606bd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad65d>
      b606b7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b606ba:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b606bd:	6a 08                	push   0x8
      b606bf:	5f                   	pop    rdi
      b606c0:	e8 3b d8 c8 00       	call   17edf00 <_Znwm@plt>
      b606c5:	48 8d 0d 1c 40 cf 00 	lea    rcx,[rip+0xcf401c]        # 18546e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10dd0>
      b606cc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b606cf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b606d4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b606d7:	48 89 e7             	mov    rdi,rsp
      b606da:	e8 37 d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b606df:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b606e4:	48 85 ff             	test   rdi,rdi
      b606e7:	74 06                	je     b606ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad68f>
      b606e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b606ec:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b606ef:	6a 08                	push   0x8
      b606f1:	5f                   	pop    rdi
      b606f2:	e8 09 d8 c8 00       	call   17edf00 <_Znwm@plt>
      b606f7:	48 8d 0d 7a c7 ca 00 	lea    rcx,[rip+0xcac77a]        # 180ce78 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2b38>
      b606fe:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60701:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60706:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60709:	48 89 e7             	mov    rdi,rsp
      b6070c:	e8 05 d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60711:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60716:	48 85 ff             	test   rdi,rdi
      b60719:	74 06                	je     b60721 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad6c1>
      b6071b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6071e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60721:	6a 08                	push   0x8
      b60723:	5f                   	pop    rdi
      b60724:	e8 d7 d7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6070c; FDE=(11925239, 11936142)
      b606c0:	e8 3b d8 c8 00       	call   17edf00 <_Znwm@plt>
      b606c5:	48 8d 0d 1c 40 cf 00 	lea    rcx,[rip+0xcf401c]        # 18546e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10dd0>
      b606cc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b606cf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b606d4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b606d7:	48 89 e7             	mov    rdi,rsp
      b606da:	e8 37 d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b606df:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b606e4:	48 85 ff             	test   rdi,rdi
      b606e7:	74 06                	je     b606ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad68f>
      b606e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b606ec:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b606ef:	6a 08                	push   0x8
      b606f1:	5f                   	pop    rdi
      b606f2:	e8 09 d8 c8 00       	call   17edf00 <_Znwm@plt>
      b606f7:	48 8d 0d 7a c7 ca 00 	lea    rcx,[rip+0xcac77a]        # 180ce78 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2b38>
      b606fe:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60701:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60706:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60709:	48 89 e7             	mov    rdi,rsp
      b6070c:	e8 05 d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60711:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60716:	48 85 ff             	test   rdi,rdi
      b60719:	74 06                	je     b60721 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad6c1>
      b6071b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6071e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60721:	6a 08                	push   0x8
      b60723:	5f                   	pop    rdi
      b60724:	e8 d7 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b60729:	48 8d 0d 08 c7 ca 00 	lea    rcx,[rip+0xcac708]        # 180ce38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2af8>
      b60730:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60733:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60738:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6073b:	48 89 e7             	mov    rdi,rsp
      b6073e:	e8 d3 d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60743:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60748:	48 85 ff             	test   rdi,rdi
      b6074b:	74 06                	je     b60753 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad6f3>
      b6074d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60750:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60753:	6a 08                	push   0x8
      b60755:	5f                   	pop    rdi
      b60756:	e8 a5 d7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6073e; FDE=(11925239, 11936142)
      b606f2:	e8 09 d8 c8 00       	call   17edf00 <_Znwm@plt>
      b606f7:	48 8d 0d 7a c7 ca 00 	lea    rcx,[rip+0xcac77a]        # 180ce78 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2b38>
      b606fe:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60701:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60706:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60709:	48 89 e7             	mov    rdi,rsp
      b6070c:	e8 05 d4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60711:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60716:	48 85 ff             	test   rdi,rdi
      b60719:	74 06                	je     b60721 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad6c1>
      b6071b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6071e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60721:	6a 08                	push   0x8
      b60723:	5f                   	pop    rdi
      b60724:	e8 d7 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b60729:	48 8d 0d 08 c7 ca 00 	lea    rcx,[rip+0xcac708]        # 180ce38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2af8>
      b60730:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60733:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60738:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6073b:	48 89 e7             	mov    rdi,rsp
      b6073e:	e8 d3 d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60743:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60748:	48 85 ff             	test   rdi,rdi
      b6074b:	74 06                	je     b60753 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad6f3>
      b6074d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60750:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60753:	6a 08                	push   0x8
      b60755:	5f                   	pop    rdi
      b60756:	e8 a5 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b6075b:	48 8d 0d be 1a cb 00 	lea    rcx,[rip+0xcb1abe]        # 1812220 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7ee0>
      b60762:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60765:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6076a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6076d:	48 89 e7             	mov    rdi,rsp
      b60770:	e8 a1 d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60775:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6077a:	48 85 ff             	test   rdi,rdi
      b6077d:	74 06                	je     b60785 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad725>
      b6077f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60782:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60785:	6a 08                	push   0x8
      b60787:	5f                   	pop    rdi
      b60788:	e8 73 d7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60770; FDE=(11925239, 11936142)
      b60724:	e8 d7 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b60729:	48 8d 0d 08 c7 ca 00 	lea    rcx,[rip+0xcac708]        # 180ce38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2af8>
      b60730:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60733:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60738:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6073b:	48 89 e7             	mov    rdi,rsp
      b6073e:	e8 d3 d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60743:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60748:	48 85 ff             	test   rdi,rdi
      b6074b:	74 06                	je     b60753 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad6f3>
      b6074d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60750:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60753:	6a 08                	push   0x8
      b60755:	5f                   	pop    rdi
      b60756:	e8 a5 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b6075b:	48 8d 0d be 1a cb 00 	lea    rcx,[rip+0xcb1abe]        # 1812220 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7ee0>
      b60762:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60765:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6076a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6076d:	48 89 e7             	mov    rdi,rsp
      b60770:	e8 a1 d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60775:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6077a:	48 85 ff             	test   rdi,rdi
      b6077d:	74 06                	je     b60785 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad725>
      b6077f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60782:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60785:	6a 08                	push   0x8
      b60787:	5f                   	pop    rdi
      b60788:	e8 73 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b6078d:	48 8d 0d c4 e7 cb 00 	lea    rcx,[rip+0xcbe7c4]        # 181ef58 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14c18>
      b60794:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60797:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6079c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6079f:	48 89 e7             	mov    rdi,rsp
      b607a2:	e8 6f d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b607a7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b607ac:	48 85 ff             	test   rdi,rdi
      b607af:	74 06                	je     b607b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad757>
      b607b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b607b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b607b7:	6a 08                	push   0x8
      b607b9:	5f                   	pop    rdi
      b607ba:	e8 41 d7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb607a2; FDE=(11925239, 11936142)
      b60756:	e8 a5 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b6075b:	48 8d 0d be 1a cb 00 	lea    rcx,[rip+0xcb1abe]        # 1812220 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7ee0>
      b60762:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60765:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6076a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6076d:	48 89 e7             	mov    rdi,rsp
      b60770:	e8 a1 d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60775:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6077a:	48 85 ff             	test   rdi,rdi
      b6077d:	74 06                	je     b60785 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad725>
      b6077f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60782:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60785:	6a 08                	push   0x8
      b60787:	5f                   	pop    rdi
      b60788:	e8 73 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b6078d:	48 8d 0d c4 e7 cb 00 	lea    rcx,[rip+0xcbe7c4]        # 181ef58 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14c18>
      b60794:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60797:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6079c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6079f:	48 89 e7             	mov    rdi,rsp
      b607a2:	e8 6f d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b607a7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b607ac:	48 85 ff             	test   rdi,rdi
      b607af:	74 06                	je     b607b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad757>
      b607b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b607b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b607b7:	6a 08                	push   0x8
      b607b9:	5f                   	pop    rdi
      b607ba:	e8 41 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b607bf:	48 8d 0d 1a 1a cb 00 	lea    rcx,[rip+0xcb1a1a]        # 18121e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7ea0>
      b607c6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b607c9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b607ce:	48 89 06             	mov    QWORD PTR [rsi],rax
      b607d1:	48 89 e7             	mov    rdi,rsp
      b607d4:	e8 3d d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b607d9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b607de:	48 85 ff             	test   rdi,rdi
      b607e1:	74 06                	je     b607e9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad789>
      b607e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b607e6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b607e9:	6a 08                	push   0x8
      b607eb:	5f                   	pop    rdi
      b607ec:	e8 0f d7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb607d4; FDE=(11925239, 11936142)
      b60788:	e8 73 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b6078d:	48 8d 0d c4 e7 cb 00 	lea    rcx,[rip+0xcbe7c4]        # 181ef58 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14c18>
      b60794:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60797:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6079c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6079f:	48 89 e7             	mov    rdi,rsp
      b607a2:	e8 6f d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b607a7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b607ac:	48 85 ff             	test   rdi,rdi
      b607af:	74 06                	je     b607b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad757>
      b607b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b607b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b607b7:	6a 08                	push   0x8
      b607b9:	5f                   	pop    rdi
      b607ba:	e8 41 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b607bf:	48 8d 0d 1a 1a cb 00 	lea    rcx,[rip+0xcb1a1a]        # 18121e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7ea0>
      b607c6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b607c9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b607ce:	48 89 06             	mov    QWORD PTR [rsi],rax
      b607d1:	48 89 e7             	mov    rdi,rsp
      b607d4:	e8 3d d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b607d9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b607de:	48 85 ff             	test   rdi,rdi
      b607e1:	74 06                	je     b607e9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad789>
      b607e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b607e6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b607e9:	6a 08                	push   0x8
      b607eb:	5f                   	pop    rdi
      b607ec:	e8 0f d7 c8 00       	call   17edf00 <_Znwm@plt>
      b607f1:	48 8d 0d c0 34 cf 00 	lea    rcx,[rip+0xcf34c0]        # 1853cb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x103a0>
      b607f8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b607fb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60800:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60803:	48 89 e7             	mov    rdi,rsp
      b60806:	e8 0b d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6080b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60810:	48 85 ff             	test   rdi,rdi
      b60813:	74 06                	je     b6081b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad7bb>
      b60815:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60818:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6081b:	6a 08                	push   0x8
      b6081d:	5f                   	pop    rdi
      b6081e:	e8 dd d6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60806; FDE=(11925239, 11936142)
      b607ba:	e8 41 d7 c8 00       	call   17edf00 <_Znwm@plt>
      b607bf:	48 8d 0d 1a 1a cb 00 	lea    rcx,[rip+0xcb1a1a]        # 18121e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7ea0>
      b607c6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b607c9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b607ce:	48 89 06             	mov    QWORD PTR [rsi],rax
      b607d1:	48 89 e7             	mov    rdi,rsp
      b607d4:	e8 3d d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b607d9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b607de:	48 85 ff             	test   rdi,rdi
      b607e1:	74 06                	je     b607e9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad789>
      b607e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b607e6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b607e9:	6a 08                	push   0x8
      b607eb:	5f                   	pop    rdi
      b607ec:	e8 0f d7 c8 00       	call   17edf00 <_Znwm@plt>
      b607f1:	48 8d 0d c0 34 cf 00 	lea    rcx,[rip+0xcf34c0]        # 1853cb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x103a0>
      b607f8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b607fb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60800:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60803:	48 89 e7             	mov    rdi,rsp
      b60806:	e8 0b d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6080b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60810:	48 85 ff             	test   rdi,rdi
      b60813:	74 06                	je     b6081b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad7bb>
      b60815:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60818:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6081b:	6a 08                	push   0x8
      b6081d:	5f                   	pop    rdi
      b6081e:	e8 dd d6 c8 00       	call   17edf00 <_Znwm@plt>
      b60823:	48 8d 0d 4e 34 cf 00 	lea    rcx,[rip+0xcf344e]        # 1853c78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10360>
      b6082a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6082d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60832:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60835:	48 89 e7             	mov    rdi,rsp
      b60838:	e8 d9 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6083d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60842:	48 85 ff             	test   rdi,rdi
      b60845:	74 06                	je     b6084d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad7ed>
      b60847:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6084a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6084d:	6a 08                	push   0x8
      b6084f:	5f                   	pop    rdi
      b60850:	e8 ab d6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60838; FDE=(11925239, 11936142)
      b607ec:	e8 0f d7 c8 00       	call   17edf00 <_Znwm@plt>
      b607f1:	48 8d 0d c0 34 cf 00 	lea    rcx,[rip+0xcf34c0]        # 1853cb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x103a0>
      b607f8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b607fb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60800:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60803:	48 89 e7             	mov    rdi,rsp
      b60806:	e8 0b d3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6080b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60810:	48 85 ff             	test   rdi,rdi
      b60813:	74 06                	je     b6081b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad7bb>
      b60815:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60818:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6081b:	6a 08                	push   0x8
      b6081d:	5f                   	pop    rdi
      b6081e:	e8 dd d6 c8 00       	call   17edf00 <_Znwm@plt>
      b60823:	48 8d 0d 4e 34 cf 00 	lea    rcx,[rip+0xcf344e]        # 1853c78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10360>
      b6082a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6082d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60832:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60835:	48 89 e7             	mov    rdi,rsp
      b60838:	e8 d9 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6083d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60842:	48 85 ff             	test   rdi,rdi
      b60845:	74 06                	je     b6084d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad7ed>
      b60847:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6084a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6084d:	6a 08                	push   0x8
      b6084f:	5f                   	pop    rdi
      b60850:	e8 ab d6 c8 00       	call   17edf00 <_Znwm@plt>
      b60855:	48 8d 0d 3c db cb 00 	lea    rcx,[rip+0xcbdb3c]        # 181e398 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14058>
      b6085c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6085f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60864:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60867:	48 89 e7             	mov    rdi,rsp
      b6086a:	e8 a7 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6086f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60874:	48 85 ff             	test   rdi,rdi
      b60877:	74 06                	je     b6087f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad81f>
      b60879:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6087c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6087f:	6a 08                	push   0x8
      b60881:	5f                   	pop    rdi
      b60882:	e8 79 d6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6086a; FDE=(11925239, 11936142)
      b6081e:	e8 dd d6 c8 00       	call   17edf00 <_Znwm@plt>
      b60823:	48 8d 0d 4e 34 cf 00 	lea    rcx,[rip+0xcf344e]        # 1853c78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10360>
      b6082a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6082d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60832:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60835:	48 89 e7             	mov    rdi,rsp
      b60838:	e8 d9 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6083d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60842:	48 85 ff             	test   rdi,rdi
      b60845:	74 06                	je     b6084d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad7ed>
      b60847:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6084a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6084d:	6a 08                	push   0x8
      b6084f:	5f                   	pop    rdi
      b60850:	e8 ab d6 c8 00       	call   17edf00 <_Znwm@plt>
      b60855:	48 8d 0d 3c db cb 00 	lea    rcx,[rip+0xcbdb3c]        # 181e398 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14058>
      b6085c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6085f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60864:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60867:	48 89 e7             	mov    rdi,rsp
      b6086a:	e8 a7 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6086f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60874:	48 85 ff             	test   rdi,rdi
      b60877:	74 06                	je     b6087f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad81f>
      b60879:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6087c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6087f:	6a 08                	push   0x8
      b60881:	5f                   	pop    rdi
      b60882:	e8 79 d6 c8 00       	call   17edf00 <_Znwm@plt>
      b60887:	48 8d 0d ca db cb 00 	lea    rcx,[rip+0xcbdbca]        # 181e458 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14118>
      b6088e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60891:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60896:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60899:	48 89 e7             	mov    rdi,rsp
      b6089c:	e8 75 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b608a1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b608a6:	48 85 ff             	test   rdi,rdi
      b608a9:	74 06                	je     b608b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad851>
      b608ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b608ae:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b608b1:	6a 08                	push   0x8
      b608b3:	5f                   	pop    rdi
      b608b4:	e8 47 d6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6089c; FDE=(11925239, 11936142)
      b60850:	e8 ab d6 c8 00       	call   17edf00 <_Znwm@plt>
      b60855:	48 8d 0d 3c db cb 00 	lea    rcx,[rip+0xcbdb3c]        # 181e398 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14058>
      b6085c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6085f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60864:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60867:	48 89 e7             	mov    rdi,rsp
      b6086a:	e8 a7 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6086f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60874:	48 85 ff             	test   rdi,rdi
      b60877:	74 06                	je     b6087f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad81f>
      b60879:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6087c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6087f:	6a 08                	push   0x8
      b60881:	5f                   	pop    rdi
      b60882:	e8 79 d6 c8 00       	call   17edf00 <_Znwm@plt>
      b60887:	48 8d 0d ca db cb 00 	lea    rcx,[rip+0xcbdbca]        # 181e458 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14118>
      b6088e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60891:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60896:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60899:	48 89 e7             	mov    rdi,rsp
      b6089c:	e8 75 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b608a1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b608a6:	48 85 ff             	test   rdi,rdi
      b608a9:	74 06                	je     b608b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad851>
      b608ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b608ae:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b608b1:	6a 08                	push   0x8
      b608b3:	5f                   	pop    rdi
      b608b4:	e8 47 d6 c8 00       	call   17edf00 <_Znwm@plt>
      b608b9:	48 8d 0d 68 67 cb 00 	lea    rcx,[rip+0xcb6768]        # 1817028 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcce8>
      b608c0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b608c3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b608c8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b608cb:	48 89 e7             	mov    rdi,rsp
      b608ce:	e8 43 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b608d3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b608d8:	48 85 ff             	test   rdi,rdi
      b608db:	74 06                	je     b608e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad883>
      b608dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b608e0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b608e3:	6a 08                	push   0x8
      b608e5:	5f                   	pop    rdi
      b608e6:	e8 15 d6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb608ce; FDE=(11925239, 11936142)
      b60882:	e8 79 d6 c8 00       	call   17edf00 <_Znwm@plt>
      b60887:	48 8d 0d ca db cb 00 	lea    rcx,[rip+0xcbdbca]        # 181e458 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14118>
      b6088e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60891:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60896:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60899:	48 89 e7             	mov    rdi,rsp
      b6089c:	e8 75 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b608a1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b608a6:	48 85 ff             	test   rdi,rdi
      b608a9:	74 06                	je     b608b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad851>
      b608ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b608ae:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b608b1:	6a 08                	push   0x8
      b608b3:	5f                   	pop    rdi
      b608b4:	e8 47 d6 c8 00       	call   17edf00 <_Znwm@plt>
      b608b9:	48 8d 0d 68 67 cb 00 	lea    rcx,[rip+0xcb6768]        # 1817028 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcce8>
      b608c0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b608c3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b608c8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b608cb:	48 89 e7             	mov    rdi,rsp
      b608ce:	e8 43 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b608d3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b608d8:	48 85 ff             	test   rdi,rdi
      b608db:	74 06                	je     b608e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad883>
      b608dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b608e0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b608e3:	6a 08                	push   0x8
      b608e5:	5f                   	pop    rdi
      b608e6:	e8 15 d6 c8 00       	call   17edf00 <_Znwm@plt>
      b608eb:	48 8d 0d f6 66 cb 00 	lea    rcx,[rip+0xcb66f6]        # 1816fe8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcca8>
      b608f2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b608f5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b608fa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b608fd:	48 89 e7             	mov    rdi,rsp
      b60900:	e8 11 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60905:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6090a:	48 85 ff             	test   rdi,rdi
      b6090d:	74 06                	je     b60915 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad8b5>
      b6090f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60912:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60915:	6a 08                	push   0x8
      b60917:	5f                   	pop    rdi
      b60918:	e8 e3 d5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60900; FDE=(11925239, 11936142)
      b608b4:	e8 47 d6 c8 00       	call   17edf00 <_Znwm@plt>
      b608b9:	48 8d 0d 68 67 cb 00 	lea    rcx,[rip+0xcb6768]        # 1817028 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcce8>
      b608c0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b608c3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b608c8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b608cb:	48 89 e7             	mov    rdi,rsp
      b608ce:	e8 43 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b608d3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b608d8:	48 85 ff             	test   rdi,rdi
      b608db:	74 06                	je     b608e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad883>
      b608dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b608e0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b608e3:	6a 08                	push   0x8
      b608e5:	5f                   	pop    rdi
      b608e6:	e8 15 d6 c8 00       	call   17edf00 <_Znwm@plt>
      b608eb:	48 8d 0d f6 66 cb 00 	lea    rcx,[rip+0xcb66f6]        # 1816fe8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcca8>
      b608f2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b608f5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b608fa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b608fd:	48 89 e7             	mov    rdi,rsp
      b60900:	e8 11 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60905:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6090a:	48 85 ff             	test   rdi,rdi
      b6090d:	74 06                	je     b60915 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad8b5>
      b6090f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60912:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60915:	6a 08                	push   0x8
      b60917:	5f                   	pop    rdi
      b60918:	e8 e3 d5 c8 00       	call   17edf00 <_Znwm@plt>
      b6091d:	48 8d 0d 8c bf cb 00 	lea    rcx,[rip+0xcbbf8c]        # 181c8b0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12570>
      b60924:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60927:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6092c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6092f:	48 89 e7             	mov    rdi,rsp
      b60932:	e8 df d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60937:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6093c:	48 85 ff             	test   rdi,rdi
      b6093f:	74 06                	je     b60947 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad8e7>
      b60941:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60944:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60947:	6a 08                	push   0x8
      b60949:	5f                   	pop    rdi
      b6094a:	e8 b1 d5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60932; FDE=(11925239, 11936142)
      b608e6:	e8 15 d6 c8 00       	call   17edf00 <_Znwm@plt>
      b608eb:	48 8d 0d f6 66 cb 00 	lea    rcx,[rip+0xcb66f6]        # 1816fe8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcca8>
      b608f2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b608f5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b608fa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b608fd:	48 89 e7             	mov    rdi,rsp
      b60900:	e8 11 d2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60905:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6090a:	48 85 ff             	test   rdi,rdi
      b6090d:	74 06                	je     b60915 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad8b5>
      b6090f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60912:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60915:	6a 08                	push   0x8
      b60917:	5f                   	pop    rdi
      b60918:	e8 e3 d5 c8 00       	call   17edf00 <_Znwm@plt>
      b6091d:	48 8d 0d 8c bf cb 00 	lea    rcx,[rip+0xcbbf8c]        # 181c8b0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12570>
      b60924:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60927:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6092c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6092f:	48 89 e7             	mov    rdi,rsp
      b60932:	e8 df d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60937:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6093c:	48 85 ff             	test   rdi,rdi
      b6093f:	74 06                	je     b60947 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad8e7>
      b60941:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60944:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60947:	6a 08                	push   0x8
      b60949:	5f                   	pop    rdi
      b6094a:	e8 b1 d5 c8 00       	call   17edf00 <_Znwm@plt>
      b6094f:	48 8d 0d 7a 7e ce 00 	lea    rcx,[rip+0xce7e7a]        # 18487d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4eb8>
      b60956:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60959:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6095e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60961:	48 89 e7             	mov    rdi,rsp
      b60964:	e8 ad d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60969:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6096e:	48 85 ff             	test   rdi,rdi
      b60971:	74 06                	je     b60979 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad919>
      b60973:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60976:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60979:	6a 08                	push   0x8
      b6097b:	5f                   	pop    rdi
      b6097c:	e8 7f d5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60964; FDE=(11925239, 11936142)
      b60918:	e8 e3 d5 c8 00       	call   17edf00 <_Znwm@plt>
      b6091d:	48 8d 0d 8c bf cb 00 	lea    rcx,[rip+0xcbbf8c]        # 181c8b0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12570>
      b60924:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60927:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6092c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6092f:	48 89 e7             	mov    rdi,rsp
      b60932:	e8 df d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60937:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6093c:	48 85 ff             	test   rdi,rdi
      b6093f:	74 06                	je     b60947 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad8e7>
      b60941:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60944:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60947:	6a 08                	push   0x8
      b60949:	5f                   	pop    rdi
      b6094a:	e8 b1 d5 c8 00       	call   17edf00 <_Znwm@plt>
      b6094f:	48 8d 0d 7a 7e ce 00 	lea    rcx,[rip+0xce7e7a]        # 18487d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4eb8>
      b60956:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60959:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6095e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60961:	48 89 e7             	mov    rdi,rsp
      b60964:	e8 ad d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60969:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6096e:	48 85 ff             	test   rdi,rdi
      b60971:	74 06                	je     b60979 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad919>
      b60973:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60976:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60979:	6a 08                	push   0x8
      b6097b:	5f                   	pop    rdi
      b6097c:	e8 7f d5 c8 00       	call   17edf00 <_Znwm@plt>
      b60981:	48 8d 0d 70 15 cc 00 	lea    rcx,[rip+0xcc1570]        # 1821ef8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17bb8>
      b60988:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6098b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60990:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60993:	48 89 e7             	mov    rdi,rsp
      b60996:	e8 7b d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6099b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b609a0:	48 85 ff             	test   rdi,rdi
      b609a3:	74 06                	je     b609ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad94b>
      b609a5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b609a8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b609ab:	6a 08                	push   0x8
      b609ad:	5f                   	pop    rdi
      b609ae:	e8 4d d5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60996; FDE=(11925239, 11936142)
      b6094a:	e8 b1 d5 c8 00       	call   17edf00 <_Znwm@plt>
      b6094f:	48 8d 0d 7a 7e ce 00 	lea    rcx,[rip+0xce7e7a]        # 18487d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4eb8>
      b60956:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60959:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6095e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60961:	48 89 e7             	mov    rdi,rsp
      b60964:	e8 ad d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60969:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6096e:	48 85 ff             	test   rdi,rdi
      b60971:	74 06                	je     b60979 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad919>
      b60973:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60976:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60979:	6a 08                	push   0x8
      b6097b:	5f                   	pop    rdi
      b6097c:	e8 7f d5 c8 00       	call   17edf00 <_Znwm@plt>
      b60981:	48 8d 0d 70 15 cc 00 	lea    rcx,[rip+0xcc1570]        # 1821ef8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17bb8>
      b60988:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6098b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60990:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60993:	48 89 e7             	mov    rdi,rsp
      b60996:	e8 7b d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6099b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b609a0:	48 85 ff             	test   rdi,rdi
      b609a3:	74 06                	je     b609ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad94b>
      b609a5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b609a8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b609ab:	6a 08                	push   0x8
      b609ad:	5f                   	pop    rdi
      b609ae:	e8 4d d5 c8 00       	call   17edf00 <_Znwm@plt>
      b609b3:	48 8d 0d ae 7e cb 00 	lea    rcx,[rip+0xcb7eae]        # 1818868 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe528>
      b609ba:	48 89 08             	mov    QWORD PTR [rax],rcx
      b609bd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b609c2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b609c5:	48 89 e7             	mov    rdi,rsp
      b609c8:	e8 49 d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b609cd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b609d2:	48 85 ff             	test   rdi,rdi
      b609d5:	74 06                	je     b609dd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad97d>
      b609d7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b609da:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b609dd:	6a 08                	push   0x8
      b609df:	5f                   	pop    rdi
      b609e0:	e8 1b d5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb609c8; FDE=(11925239, 11936142)
      b6097c:	e8 7f d5 c8 00       	call   17edf00 <_Znwm@plt>
      b60981:	48 8d 0d 70 15 cc 00 	lea    rcx,[rip+0xcc1570]        # 1821ef8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17bb8>
      b60988:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6098b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60990:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60993:	48 89 e7             	mov    rdi,rsp
      b60996:	e8 7b d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6099b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b609a0:	48 85 ff             	test   rdi,rdi
      b609a3:	74 06                	je     b609ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad94b>
      b609a5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b609a8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b609ab:	6a 08                	push   0x8
      b609ad:	5f                   	pop    rdi
      b609ae:	e8 4d d5 c8 00       	call   17edf00 <_Znwm@plt>
      b609b3:	48 8d 0d ae 7e cb 00 	lea    rcx,[rip+0xcb7eae]        # 1818868 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe528>
      b609ba:	48 89 08             	mov    QWORD PTR [rax],rcx
      b609bd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b609c2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b609c5:	48 89 e7             	mov    rdi,rsp
      b609c8:	e8 49 d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b609cd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b609d2:	48 85 ff             	test   rdi,rdi
      b609d5:	74 06                	je     b609dd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad97d>
      b609d7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b609da:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b609dd:	6a 08                	push   0x8
      b609df:	5f                   	pop    rdi
      b609e0:	e8 1b d5 c8 00       	call   17edf00 <_Znwm@plt>
      b609e5:	48 8d 0d 7c 8c ce 00 	lea    rcx,[rip+0xce8c7c]        # 1849668 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5d50>
      b609ec:	48 89 08             	mov    QWORD PTR [rax],rcx
      b609ef:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b609f4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b609f7:	48 89 e7             	mov    rdi,rsp
      b609fa:	e8 17 d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b609ff:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a04:	48 85 ff             	test   rdi,rdi
      b60a07:	74 06                	je     b60a0f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad9af>
      b60a09:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60a0c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60a0f:	6a 08                	push   0x8
      b60a11:	5f                   	pop    rdi
      b60a12:	e8 e9 d4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb609fa; FDE=(11925239, 11936142)
      b609ae:	e8 4d d5 c8 00       	call   17edf00 <_Znwm@plt>
      b609b3:	48 8d 0d ae 7e cb 00 	lea    rcx,[rip+0xcb7eae]        # 1818868 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe528>
      b609ba:	48 89 08             	mov    QWORD PTR [rax],rcx
      b609bd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b609c2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b609c5:	48 89 e7             	mov    rdi,rsp
      b609c8:	e8 49 d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b609cd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b609d2:	48 85 ff             	test   rdi,rdi
      b609d5:	74 06                	je     b609dd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad97d>
      b609d7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b609da:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b609dd:	6a 08                	push   0x8
      b609df:	5f                   	pop    rdi
      b609e0:	e8 1b d5 c8 00       	call   17edf00 <_Znwm@plt>
      b609e5:	48 8d 0d 7c 8c ce 00 	lea    rcx,[rip+0xce8c7c]        # 1849668 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5d50>
      b609ec:	48 89 08             	mov    QWORD PTR [rax],rcx
      b609ef:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b609f4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b609f7:	48 89 e7             	mov    rdi,rsp
      b609fa:	e8 17 d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b609ff:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a04:	48 85 ff             	test   rdi,rdi
      b60a07:	74 06                	je     b60a0f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad9af>
      b60a09:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60a0c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60a0f:	6a 08                	push   0x8
      b60a11:	5f                   	pop    rdi
      b60a12:	e8 e9 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60a17:	48 8d 0d aa 91 ce 00 	lea    rcx,[rip+0xce91aa]        # 1849bc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x62b0>
      b60a1e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60a21:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60a26:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60a29:	48 89 e7             	mov    rdi,rsp
      b60a2c:	e8 e5 d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60a31:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a36:	48 85 ff             	test   rdi,rdi
      b60a39:	74 06                	je     b60a41 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad9e1>
      b60a3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60a3e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60a41:	6a 08                	push   0x8
      b60a43:	5f                   	pop    rdi
      b60a44:	e8 b7 d4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60a2c; FDE=(11925239, 11936142)
      b609e0:	e8 1b d5 c8 00       	call   17edf00 <_Znwm@plt>
      b609e5:	48 8d 0d 7c 8c ce 00 	lea    rcx,[rip+0xce8c7c]        # 1849668 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5d50>
      b609ec:	48 89 08             	mov    QWORD PTR [rax],rcx
      b609ef:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b609f4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b609f7:	48 89 e7             	mov    rdi,rsp
      b609fa:	e8 17 d1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b609ff:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a04:	48 85 ff             	test   rdi,rdi
      b60a07:	74 06                	je     b60a0f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad9af>
      b60a09:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60a0c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60a0f:	6a 08                	push   0x8
      b60a11:	5f                   	pop    rdi
      b60a12:	e8 e9 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60a17:	48 8d 0d aa 91 ce 00 	lea    rcx,[rip+0xce91aa]        # 1849bc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x62b0>
      b60a1e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60a21:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60a26:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60a29:	48 89 e7             	mov    rdi,rsp
      b60a2c:	e8 e5 d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60a31:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a36:	48 85 ff             	test   rdi,rdi
      b60a39:	74 06                	je     b60a41 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad9e1>
      b60a3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60a3e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60a41:	6a 08                	push   0x8
      b60a43:	5f                   	pop    rdi
      b60a44:	e8 b7 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60a49:	48 8d 0d c0 d6 ca 00 	lea    rcx,[rip+0xcad6c0]        # 180e110 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3dd0>
      b60a50:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60a53:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60a58:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60a5b:	48 89 e7             	mov    rdi,rsp
      b60a5e:	e8 b3 d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60a63:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a68:	48 85 ff             	test   rdi,rdi
      b60a6b:	74 06                	je     b60a73 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xada13>
      b60a6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60a70:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60a73:	6a 08                	push   0x8
      b60a75:	5f                   	pop    rdi
      b60a76:	e8 85 d4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60a5e; FDE=(11925239, 11936142)
      b60a12:	e8 e9 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60a17:	48 8d 0d aa 91 ce 00 	lea    rcx,[rip+0xce91aa]        # 1849bc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x62b0>
      b60a1e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60a21:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60a26:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60a29:	48 89 e7             	mov    rdi,rsp
      b60a2c:	e8 e5 d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60a31:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a36:	48 85 ff             	test   rdi,rdi
      b60a39:	74 06                	je     b60a41 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad9e1>
      b60a3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60a3e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60a41:	6a 08                	push   0x8
      b60a43:	5f                   	pop    rdi
      b60a44:	e8 b7 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60a49:	48 8d 0d c0 d6 ca 00 	lea    rcx,[rip+0xcad6c0]        # 180e110 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3dd0>
      b60a50:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60a53:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60a58:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60a5b:	48 89 e7             	mov    rdi,rsp
      b60a5e:	e8 b3 d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60a63:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a68:	48 85 ff             	test   rdi,rdi
      b60a6b:	74 06                	je     b60a73 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xada13>
      b60a6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60a70:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60a73:	6a 08                	push   0x8
      b60a75:	5f                   	pop    rdi
      b60a76:	e8 85 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60a7b:	48 8d 0d 4e 6c cb 00 	lea    rcx,[rip+0xcb6c4e]        # 18176d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd390>
      b60a82:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60a85:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60a8a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60a8d:	48 89 e7             	mov    rdi,rsp
      b60a90:	e8 81 d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60a95:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a9a:	48 85 ff             	test   rdi,rdi
      b60a9d:	74 06                	je     b60aa5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xada45>
      b60a9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60aa2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60aa5:	6a 08                	push   0x8
      b60aa7:	5f                   	pop    rdi
      b60aa8:	e8 53 d4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60a90; FDE=(11925239, 11936142)
      b60a44:	e8 b7 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60a49:	48 8d 0d c0 d6 ca 00 	lea    rcx,[rip+0xcad6c0]        # 180e110 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3dd0>
      b60a50:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60a53:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60a58:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60a5b:	48 89 e7             	mov    rdi,rsp
      b60a5e:	e8 b3 d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60a63:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a68:	48 85 ff             	test   rdi,rdi
      b60a6b:	74 06                	je     b60a73 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xada13>
      b60a6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60a70:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60a73:	6a 08                	push   0x8
      b60a75:	5f                   	pop    rdi
      b60a76:	e8 85 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60a7b:	48 8d 0d 4e 6c cb 00 	lea    rcx,[rip+0xcb6c4e]        # 18176d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd390>
      b60a82:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60a85:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60a8a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60a8d:	48 89 e7             	mov    rdi,rsp
      b60a90:	e8 81 d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60a95:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a9a:	48 85 ff             	test   rdi,rdi
      b60a9d:	74 06                	je     b60aa5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xada45>
      b60a9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60aa2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60aa5:	6a 08                	push   0x8
      b60aa7:	5f                   	pop    rdi
      b60aa8:	e8 53 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60aad:	48 8d 0d dc 6b cb 00 	lea    rcx,[rip+0xcb6bdc]        # 1817690 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd350>
      b60ab4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ab7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60abc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60abf:	48 89 e7             	mov    rdi,rsp
      b60ac2:	e8 4f d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60ac7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60acc:	48 85 ff             	test   rdi,rdi
      b60acf:	74 06                	je     b60ad7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xada77>
      b60ad1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60ad4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ad7:	6a 08                	push   0x8
      b60ad9:	5f                   	pop    rdi
      b60ada:	e8 21 d4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60ac2; FDE=(11925239, 11936142)
      b60a76:	e8 85 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60a7b:	48 8d 0d 4e 6c cb 00 	lea    rcx,[rip+0xcb6c4e]        # 18176d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd390>
      b60a82:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60a85:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60a8a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60a8d:	48 89 e7             	mov    rdi,rsp
      b60a90:	e8 81 d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60a95:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60a9a:	48 85 ff             	test   rdi,rdi
      b60a9d:	74 06                	je     b60aa5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xada45>
      b60a9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60aa2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60aa5:	6a 08                	push   0x8
      b60aa7:	5f                   	pop    rdi
      b60aa8:	e8 53 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60aad:	48 8d 0d dc 6b cb 00 	lea    rcx,[rip+0xcb6bdc]        # 1817690 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd350>
      b60ab4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ab7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60abc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60abf:	48 89 e7             	mov    rdi,rsp
      b60ac2:	e8 4f d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60ac7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60acc:	48 85 ff             	test   rdi,rdi
      b60acf:	74 06                	je     b60ad7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xada77>
      b60ad1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60ad4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ad7:	6a 08                	push   0x8
      b60ad9:	5f                   	pop    rdi
      b60ada:	e8 21 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60adf:	48 8d 0d 4a 74 ce 00 	lea    rcx,[rip+0xce744a]        # 1847f30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4618>
      b60ae6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ae9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60aee:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60af1:	48 89 e7             	mov    rdi,rsp
      b60af4:	e8 1d d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60af9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60afe:	48 85 ff             	test   rdi,rdi
      b60b01:	74 06                	je     b60b09 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadaa9>
      b60b03:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b06:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b09:	6a 08                	push   0x8
      b60b0b:	5f                   	pop    rdi
      b60b0c:	e8 ef d3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60af4; FDE=(11925239, 11936142)
      b60aa8:	e8 53 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60aad:	48 8d 0d dc 6b cb 00 	lea    rcx,[rip+0xcb6bdc]        # 1817690 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd350>
      b60ab4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ab7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60abc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60abf:	48 89 e7             	mov    rdi,rsp
      b60ac2:	e8 4f d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60ac7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60acc:	48 85 ff             	test   rdi,rdi
      b60acf:	74 06                	je     b60ad7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xada77>
      b60ad1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60ad4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ad7:	6a 08                	push   0x8
      b60ad9:	5f                   	pop    rdi
      b60ada:	e8 21 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60adf:	48 8d 0d 4a 74 ce 00 	lea    rcx,[rip+0xce744a]        # 1847f30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4618>
      b60ae6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ae9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60aee:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60af1:	48 89 e7             	mov    rdi,rsp
      b60af4:	e8 1d d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60af9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60afe:	48 85 ff             	test   rdi,rdi
      b60b01:	74 06                	je     b60b09 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadaa9>
      b60b03:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b06:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b09:	6a 08                	push   0x8
      b60b0b:	5f                   	pop    rdi
      b60b0c:	e8 ef d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60b11:	48 8d 0d 10 ad cf 00 	lea    rcx,[rip+0xcfad10]        # 185b828 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f10>
      b60b18:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60b1b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60b20:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60b23:	48 89 e7             	mov    rdi,rsp
      b60b26:	e8 eb cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60b2b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60b30:	48 85 ff             	test   rdi,rdi
      b60b33:	74 06                	je     b60b3b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadadb>
      b60b35:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b38:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b3b:	6a 08                	push   0x8
      b60b3d:	5f                   	pop    rdi
      b60b3e:	e8 bd d3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60b26; FDE=(11925239, 11936142)
      b60ada:	e8 21 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60adf:	48 8d 0d 4a 74 ce 00 	lea    rcx,[rip+0xce744a]        # 1847f30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4618>
      b60ae6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ae9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60aee:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60af1:	48 89 e7             	mov    rdi,rsp
      b60af4:	e8 1d d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60af9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60afe:	48 85 ff             	test   rdi,rdi
      b60b01:	74 06                	je     b60b09 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadaa9>
      b60b03:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b06:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b09:	6a 08                	push   0x8
      b60b0b:	5f                   	pop    rdi
      b60b0c:	e8 ef d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60b11:	48 8d 0d 10 ad cf 00 	lea    rcx,[rip+0xcfad10]        # 185b828 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f10>
      b60b18:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60b1b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60b20:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60b23:	48 89 e7             	mov    rdi,rsp
      b60b26:	e8 eb cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60b2b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60b30:	48 85 ff             	test   rdi,rdi
      b60b33:	74 06                	je     b60b3b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadadb>
      b60b35:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b38:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b3b:	6a 08                	push   0x8
      b60b3d:	5f                   	pop    rdi
      b60b3e:	e8 bd d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60b43:	48 8d 0d 06 bf ce 00 	lea    rcx,[rip+0xcebf06]        # 184ca50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9138>
      b60b4a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60b4d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60b52:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60b55:	48 89 e7             	mov    rdi,rsp
      b60b58:	e8 b9 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60b5d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60b62:	48 85 ff             	test   rdi,rdi
      b60b65:	74 06                	je     b60b6d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadb0d>
      b60b67:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b6a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b6d:	6a 08                	push   0x8
      b60b6f:	5f                   	pop    rdi
      b60b70:	e8 8b d3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60b58; FDE=(11925239, 11936142)
      b60b0c:	e8 ef d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60b11:	48 8d 0d 10 ad cf 00 	lea    rcx,[rip+0xcfad10]        # 185b828 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f10>
      b60b18:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60b1b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60b20:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60b23:	48 89 e7             	mov    rdi,rsp
      b60b26:	e8 eb cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60b2b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60b30:	48 85 ff             	test   rdi,rdi
      b60b33:	74 06                	je     b60b3b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadadb>
      b60b35:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b38:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b3b:	6a 08                	push   0x8
      b60b3d:	5f                   	pop    rdi
      b60b3e:	e8 bd d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60b43:	48 8d 0d 06 bf ce 00 	lea    rcx,[rip+0xcebf06]        # 184ca50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9138>
      b60b4a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60b4d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60b52:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60b55:	48 89 e7             	mov    rdi,rsp
      b60b58:	e8 b9 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60b5d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60b62:	48 85 ff             	test   rdi,rdi
      b60b65:	74 06                	je     b60b6d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadb0d>
      b60b67:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b6a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b6d:	6a 08                	push   0x8
      b60b6f:	5f                   	pop    rdi
      b60b70:	e8 8b d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60b75:	48 8d 0d d4 d0 ca 00 	lea    rcx,[rip+0xcad0d4]        # 180dc50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3910>
      b60b7c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60b7f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60b84:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60b87:	48 89 e7             	mov    rdi,rsp
      b60b8a:	e8 87 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60b8f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60b94:	48 85 ff             	test   rdi,rdi
      b60b97:	74 06                	je     b60b9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadb3f>
      b60b99:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b9c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b9f:	6a 08                	push   0x8
      b60ba1:	5f                   	pop    rdi
      b60ba2:	e8 59 d3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60b8a; FDE=(11925239, 11936142)
      b60b3e:	e8 bd d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60b43:	48 8d 0d 06 bf ce 00 	lea    rcx,[rip+0xcebf06]        # 184ca50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9138>
      b60b4a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60b4d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60b52:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60b55:	48 89 e7             	mov    rdi,rsp
      b60b58:	e8 b9 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60b5d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60b62:	48 85 ff             	test   rdi,rdi
      b60b65:	74 06                	je     b60b6d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadb0d>
      b60b67:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b6a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b6d:	6a 08                	push   0x8
      b60b6f:	5f                   	pop    rdi
      b60b70:	e8 8b d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60b75:	48 8d 0d d4 d0 ca 00 	lea    rcx,[rip+0xcad0d4]        # 180dc50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3910>
      b60b7c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60b7f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60b84:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60b87:	48 89 e7             	mov    rdi,rsp
      b60b8a:	e8 87 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60b8f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60b94:	48 85 ff             	test   rdi,rdi
      b60b97:	74 06                	je     b60b9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadb3f>
      b60b99:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b9c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b9f:	6a 08                	push   0x8
      b60ba1:	5f                   	pop    rdi
      b60ba2:	e8 59 d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60ba7:	48 8d 0d 22 d0 ca 00 	lea    rcx,[rip+0xcad022]        # 180dbd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3890>
      b60bae:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60bb1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60bb6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60bb9:	48 89 e7             	mov    rdi,rsp
      b60bbc:	e8 55 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60bc1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60bc6:	48 85 ff             	test   rdi,rdi
      b60bc9:	74 06                	je     b60bd1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadb71>
      b60bcb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60bce:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60bd1:	6a 08                	push   0x8
      b60bd3:	5f                   	pop    rdi
      b60bd4:	e8 27 d3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60bbc; FDE=(11925239, 11936142)
      b60b70:	e8 8b d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60b75:	48 8d 0d d4 d0 ca 00 	lea    rcx,[rip+0xcad0d4]        # 180dc50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3910>
      b60b7c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60b7f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60b84:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60b87:	48 89 e7             	mov    rdi,rsp
      b60b8a:	e8 87 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60b8f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60b94:	48 85 ff             	test   rdi,rdi
      b60b97:	74 06                	je     b60b9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadb3f>
      b60b99:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b9c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b9f:	6a 08                	push   0x8
      b60ba1:	5f                   	pop    rdi
      b60ba2:	e8 59 d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60ba7:	48 8d 0d 22 d0 ca 00 	lea    rcx,[rip+0xcad022]        # 180dbd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3890>
      b60bae:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60bb1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60bb6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60bb9:	48 89 e7             	mov    rdi,rsp
      b60bbc:	e8 55 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60bc1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60bc6:	48 85 ff             	test   rdi,rdi
      b60bc9:	74 06                	je     b60bd1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadb71>
      b60bcb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60bce:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60bd1:	6a 08                	push   0x8
      b60bd3:	5f                   	pop    rdi
      b60bd4:	e8 27 d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60bd9:	48 8d 0d 08 6f d0 00 	lea    rcx,[rip+0xd06f08]        # 1867ae8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x241d0>
      b60be0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60be3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60be8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60beb:	48 89 e7             	mov    rdi,rsp
      b60bee:	e8 23 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60bf3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60bf8:	48 85 ff             	test   rdi,rdi
      b60bfb:	74 06                	je     b60c03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadba3>
      b60bfd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c00:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c03:	6a 08                	push   0x8
      b60c05:	5f                   	pop    rdi
      b60c06:	e8 f5 d2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60bee; FDE=(11925239, 11936142)
      b60ba2:	e8 59 d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60ba7:	48 8d 0d 22 d0 ca 00 	lea    rcx,[rip+0xcad022]        # 180dbd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3890>
      b60bae:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60bb1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60bb6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60bb9:	48 89 e7             	mov    rdi,rsp
      b60bbc:	e8 55 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60bc1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60bc6:	48 85 ff             	test   rdi,rdi
      b60bc9:	74 06                	je     b60bd1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadb71>
      b60bcb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60bce:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60bd1:	6a 08                	push   0x8
      b60bd3:	5f                   	pop    rdi
      b60bd4:	e8 27 d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60bd9:	48 8d 0d 08 6f d0 00 	lea    rcx,[rip+0xd06f08]        # 1867ae8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x241d0>
      b60be0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60be3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60be8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60beb:	48 89 e7             	mov    rdi,rsp
      b60bee:	e8 23 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60bf3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60bf8:	48 85 ff             	test   rdi,rdi
      b60bfb:	74 06                	je     b60c03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadba3>
      b60bfd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c00:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c03:	6a 08                	push   0x8
      b60c05:	5f                   	pop    rdi
      b60c06:	e8 f5 d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60c0b:	48 8d 0d 7e d5 ca 00 	lea    rcx,[rip+0xcad57e]        # 180e190 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e50>
      b60c12:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60c15:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c1a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c1d:	48 89 e7             	mov    rdi,rsp
      b60c20:	e8 f1 ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60c25:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60c2a:	48 85 ff             	test   rdi,rdi
      b60c2d:	74 06                	je     b60c35 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadbd5>
      b60c2f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c32:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c35:	6a 08                	push   0x8
      b60c37:	5f                   	pop    rdi
      b60c38:	e8 c3 d2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60c20; FDE=(11925239, 11936142)
      b60bd4:	e8 27 d3 c8 00       	call   17edf00 <_Znwm@plt>
      b60bd9:	48 8d 0d 08 6f d0 00 	lea    rcx,[rip+0xd06f08]        # 1867ae8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x241d0>
      b60be0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60be3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60be8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60beb:	48 89 e7             	mov    rdi,rsp
      b60bee:	e8 23 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60bf3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60bf8:	48 85 ff             	test   rdi,rdi
      b60bfb:	74 06                	je     b60c03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadba3>
      b60bfd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c00:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c03:	6a 08                	push   0x8
      b60c05:	5f                   	pop    rdi
      b60c06:	e8 f5 d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60c0b:	48 8d 0d 7e d5 ca 00 	lea    rcx,[rip+0xcad57e]        # 180e190 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e50>
      b60c12:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60c15:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c1a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c1d:	48 89 e7             	mov    rdi,rsp
      b60c20:	e8 f1 ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60c25:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60c2a:	48 85 ff             	test   rdi,rdi
      b60c2d:	74 06                	je     b60c35 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadbd5>
      b60c2f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c32:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c35:	6a 08                	push   0x8
      b60c37:	5f                   	pop    rdi
      b60c38:	e8 c3 d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60c3d:	48 8d 0d 64 ba ce 00 	lea    rcx,[rip+0xceba64]        # 184c6a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d90>
      b60c44:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60c47:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c4c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c4f:	48 89 e7             	mov    rdi,rsp
      b60c52:	e8 bf ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60c57:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60c5c:	48 85 ff             	test   rdi,rdi
      b60c5f:	74 06                	je     b60c67 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc07>
      b60c61:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c64:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c67:	6a 08                	push   0x8
      b60c69:	5f                   	pop    rdi
      b60c6a:	e8 91 d2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60c52; FDE=(11925239, 11936142)
      b60c06:	e8 f5 d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60c0b:	48 8d 0d 7e d5 ca 00 	lea    rcx,[rip+0xcad57e]        # 180e190 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e50>
      b60c12:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60c15:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c1a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c1d:	48 89 e7             	mov    rdi,rsp
      b60c20:	e8 f1 ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60c25:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60c2a:	48 85 ff             	test   rdi,rdi
      b60c2d:	74 06                	je     b60c35 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadbd5>
      b60c2f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c32:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c35:	6a 08                	push   0x8
      b60c37:	5f                   	pop    rdi
      b60c38:	e8 c3 d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60c3d:	48 8d 0d 64 ba ce 00 	lea    rcx,[rip+0xceba64]        # 184c6a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d90>
      b60c44:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60c47:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c4c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c4f:	48 89 e7             	mov    rdi,rsp
      b60c52:	e8 bf ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60c57:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60c5c:	48 85 ff             	test   rdi,rdi
      b60c5f:	74 06                	je     b60c67 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc07>
      b60c61:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c64:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c67:	6a 08                	push   0x8
      b60c69:	5f                   	pop    rdi
      b60c6a:	e8 91 d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60c6f:	48 8d 0d 8a 66 d0 00 	lea    rcx,[rip+0xd0668a]        # 1867300 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x239e8>
      b60c76:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60c79:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c7e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c81:	48 89 e7             	mov    rdi,rsp
      b60c84:	e8 8d ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60c89:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60c8e:	48 85 ff             	test   rdi,rdi
      b60c91:	74 06                	je     b60c99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc39>
      b60c93:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c96:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c99:	6a 08                	push   0x8
      b60c9b:	5f                   	pop    rdi
      b60c9c:	e8 5f d2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60c84; FDE=(11925239, 11936142)
      b60c38:	e8 c3 d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60c3d:	48 8d 0d 64 ba ce 00 	lea    rcx,[rip+0xceba64]        # 184c6a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d90>
      b60c44:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60c47:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c4c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c4f:	48 89 e7             	mov    rdi,rsp
      b60c52:	e8 bf ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60c57:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60c5c:	48 85 ff             	test   rdi,rdi
      b60c5f:	74 06                	je     b60c67 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc07>
      b60c61:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c64:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c67:	6a 08                	push   0x8
      b60c69:	5f                   	pop    rdi
      b60c6a:	e8 91 d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60c6f:	48 8d 0d 8a 66 d0 00 	lea    rcx,[rip+0xd0668a]        # 1867300 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x239e8>
      b60c76:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60c79:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c7e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c81:	48 89 e7             	mov    rdi,rsp
      b60c84:	e8 8d ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60c89:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60c8e:	48 85 ff             	test   rdi,rdi
      b60c91:	74 06                	je     b60c99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc39>
      b60c93:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c96:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c99:	6a 08                	push   0x8
      b60c9b:	5f                   	pop    rdi
      b60c9c:	e8 5f d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60ca1:	48 8d 0d 60 9b cf 00 	lea    rcx,[rip+0xcf9b60]        # 185a808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16ef0>
      b60ca8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60cab:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60cb0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60cb3:	48 89 e7             	mov    rdi,rsp
      b60cb6:	e8 5b ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60cbb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60cc0:	48 85 ff             	test   rdi,rdi
      b60cc3:	74 06                	je     b60ccb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc6b>
      b60cc5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60cc8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ccb:	6a 08                	push   0x8
      b60ccd:	5f                   	pop    rdi
      b60cce:	e8 2d d2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60cb6; FDE=(11925239, 11936142)
      b60c6a:	e8 91 d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60c6f:	48 8d 0d 8a 66 d0 00 	lea    rcx,[rip+0xd0668a]        # 1867300 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x239e8>
      b60c76:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60c79:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c7e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c81:	48 89 e7             	mov    rdi,rsp
      b60c84:	e8 8d ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60c89:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60c8e:	48 85 ff             	test   rdi,rdi
      b60c91:	74 06                	je     b60c99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc39>
      b60c93:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c96:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c99:	6a 08                	push   0x8
      b60c9b:	5f                   	pop    rdi
      b60c9c:	e8 5f d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60ca1:	48 8d 0d 60 9b cf 00 	lea    rcx,[rip+0xcf9b60]        # 185a808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16ef0>
      b60ca8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60cab:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60cb0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60cb3:	48 89 e7             	mov    rdi,rsp
      b60cb6:	e8 5b ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60cbb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60cc0:	48 85 ff             	test   rdi,rdi
      b60cc3:	74 06                	je     b60ccb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc6b>
      b60cc5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60cc8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ccb:	6a 08                	push   0x8
      b60ccd:	5f                   	pop    rdi
      b60cce:	e8 2d d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60cd3:	48 8d 0d 7e 6f d0 00 	lea    rcx,[rip+0xd06f7e]        # 1867c58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24340>
      b60cda:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60cdd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ce2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ce5:	48 89 e7             	mov    rdi,rsp
      b60ce8:	e8 29 ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60ced:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60cf2:	48 85 ff             	test   rdi,rdi
      b60cf5:	74 06                	je     b60cfd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc9d>
      b60cf7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60cfa:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60cfd:	6a 08                	push   0x8
      b60cff:	5f                   	pop    rdi
      b60d00:	e8 fb d1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60ce8; FDE=(11925239, 11936142)
      b60c9c:	e8 5f d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60ca1:	48 8d 0d 60 9b cf 00 	lea    rcx,[rip+0xcf9b60]        # 185a808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16ef0>
      b60ca8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60cab:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60cb0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60cb3:	48 89 e7             	mov    rdi,rsp
      b60cb6:	e8 5b ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60cbb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60cc0:	48 85 ff             	test   rdi,rdi
      b60cc3:	74 06                	je     b60ccb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc6b>
      b60cc5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60cc8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ccb:	6a 08                	push   0x8
      b60ccd:	5f                   	pop    rdi
      b60cce:	e8 2d d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60cd3:	48 8d 0d 7e 6f d0 00 	lea    rcx,[rip+0xd06f7e]        # 1867c58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24340>
      b60cda:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60cdd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ce2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ce5:	48 89 e7             	mov    rdi,rsp
      b60ce8:	e8 29 ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60ced:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60cf2:	48 85 ff             	test   rdi,rdi
      b60cf5:	74 06                	je     b60cfd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc9d>
      b60cf7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60cfa:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60cfd:	6a 08                	push   0x8
      b60cff:	5f                   	pop    rdi
      b60d00:	e8 fb d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d05:	48 8d 0d 8c 0a d1 00 	lea    rcx,[rip+0xd10a8c]        # 1871798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2de80>
      b60d0c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60d0f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60d14:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60d17:	48 89 e7             	mov    rdi,rsp
      b60d1a:	e8 f7 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60d1f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60d24:	48 85 ff             	test   rdi,rdi
      b60d27:	74 06                	je     b60d2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadccf>
      b60d29:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60d2c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60d2f:	6a 08                	push   0x8
      b60d31:	5f                   	pop    rdi
      b60d32:	e8 c9 d1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60d1a; FDE=(11925239, 11936142)
      b60cce:	e8 2d d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60cd3:	48 8d 0d 7e 6f d0 00 	lea    rcx,[rip+0xd06f7e]        # 1867c58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24340>
      b60cda:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60cdd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ce2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ce5:	48 89 e7             	mov    rdi,rsp
      b60ce8:	e8 29 ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60ced:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60cf2:	48 85 ff             	test   rdi,rdi
      b60cf5:	74 06                	je     b60cfd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc9d>
      b60cf7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60cfa:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60cfd:	6a 08                	push   0x8
      b60cff:	5f                   	pop    rdi
      b60d00:	e8 fb d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d05:	48 8d 0d 8c 0a d1 00 	lea    rcx,[rip+0xd10a8c]        # 1871798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2de80>
      b60d0c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60d0f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60d14:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60d17:	48 89 e7             	mov    rdi,rsp
      b60d1a:	e8 f7 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60d1f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60d24:	48 85 ff             	test   rdi,rdi
      b60d27:	74 06                	je     b60d2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadccf>
      b60d29:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60d2c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60d2f:	6a 08                	push   0x8
      b60d31:	5f                   	pop    rdi
      b60d32:	e8 c9 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d37:	48 8d 0d da dc ce 00 	lea    rcx,[rip+0xcedcda]        # 184ea18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb100>
      b60d3e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60d41:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60d46:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60d49:	48 89 e7             	mov    rdi,rsp
      b60d4c:	e8 c5 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60d51:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60d56:	48 85 ff             	test   rdi,rdi
      b60d59:	74 06                	je     b60d61 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd01>
      b60d5b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60d5e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60d61:	6a 08                	push   0x8
      b60d63:	5f                   	pop    rdi
      b60d64:	e8 97 d1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60d4c; FDE=(11925239, 11936142)
      b60d00:	e8 fb d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d05:	48 8d 0d 8c 0a d1 00 	lea    rcx,[rip+0xd10a8c]        # 1871798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2de80>
      b60d0c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60d0f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60d14:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60d17:	48 89 e7             	mov    rdi,rsp
      b60d1a:	e8 f7 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60d1f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60d24:	48 85 ff             	test   rdi,rdi
      b60d27:	74 06                	je     b60d2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadccf>
      b60d29:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60d2c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60d2f:	6a 08                	push   0x8
      b60d31:	5f                   	pop    rdi
      b60d32:	e8 c9 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d37:	48 8d 0d da dc ce 00 	lea    rcx,[rip+0xcedcda]        # 184ea18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb100>
      b60d3e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60d41:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60d46:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60d49:	48 89 e7             	mov    rdi,rsp
      b60d4c:	e8 c5 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60d51:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60d56:	48 85 ff             	test   rdi,rdi
      b60d59:	74 06                	je     b60d61 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd01>
      b60d5b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60d5e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60d61:	6a 08                	push   0x8
      b60d63:	5f                   	pop    rdi
      b60d64:	e8 97 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d69:	48 8d 0d 40 cf ce 00 	lea    rcx,[rip+0xcecf40]        # 184dcb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa398>
      b60d70:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60d73:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60d78:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60d7b:	48 89 e7             	mov    rdi,rsp
      b60d7e:	e8 93 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60d83:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60d88:	48 85 ff             	test   rdi,rdi
      b60d8b:	74 06                	je     b60d93 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd33>
      b60d8d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60d90:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60d93:	6a 08                	push   0x8
      b60d95:	5f                   	pop    rdi
      b60d96:	e8 65 d1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60d7e; FDE=(11925239, 11936142)
      b60d32:	e8 c9 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d37:	48 8d 0d da dc ce 00 	lea    rcx,[rip+0xcedcda]        # 184ea18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb100>
      b60d3e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60d41:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60d46:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60d49:	48 89 e7             	mov    rdi,rsp
      b60d4c:	e8 c5 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60d51:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60d56:	48 85 ff             	test   rdi,rdi
      b60d59:	74 06                	je     b60d61 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd01>
      b60d5b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60d5e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60d61:	6a 08                	push   0x8
      b60d63:	5f                   	pop    rdi
      b60d64:	e8 97 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d69:	48 8d 0d 40 cf ce 00 	lea    rcx,[rip+0xcecf40]        # 184dcb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa398>
      b60d70:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60d73:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60d78:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60d7b:	48 89 e7             	mov    rdi,rsp
      b60d7e:	e8 93 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60d83:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60d88:	48 85 ff             	test   rdi,rdi
      b60d8b:	74 06                	je     b60d93 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd33>
      b60d8d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60d90:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60d93:	6a 08                	push   0x8
      b60d95:	5f                   	pop    rdi
      b60d96:	e8 65 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d9b:	48 8d 0d 86 ce ce 00 	lea    rcx,[rip+0xcece86]        # 184dc28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa310>
      b60da2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60da5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60daa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60dad:	48 89 e7             	mov    rdi,rsp
      b60db0:	e8 61 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60db5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60dba:	48 85 ff             	test   rdi,rdi
      b60dbd:	74 06                	je     b60dc5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd65>
      b60dbf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60dc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60dc5:	6a 08                	push   0x8
      b60dc7:	5f                   	pop    rdi
      b60dc8:	e8 33 d1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60db0; FDE=(11925239, 11936142)
      b60d64:	e8 97 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d69:	48 8d 0d 40 cf ce 00 	lea    rcx,[rip+0xcecf40]        # 184dcb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa398>
      b60d70:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60d73:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60d78:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60d7b:	48 89 e7             	mov    rdi,rsp
      b60d7e:	e8 93 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60d83:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60d88:	48 85 ff             	test   rdi,rdi
      b60d8b:	74 06                	je     b60d93 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd33>
      b60d8d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60d90:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60d93:	6a 08                	push   0x8
      b60d95:	5f                   	pop    rdi
      b60d96:	e8 65 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d9b:	48 8d 0d 86 ce ce 00 	lea    rcx,[rip+0xcece86]        # 184dc28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa310>
      b60da2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60da5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60daa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60dad:	48 89 e7             	mov    rdi,rsp
      b60db0:	e8 61 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60db5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60dba:	48 85 ff             	test   rdi,rdi
      b60dbd:	74 06                	je     b60dc5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd65>
      b60dbf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60dc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60dc5:	6a 08                	push   0x8
      b60dc7:	5f                   	pop    rdi
      b60dc8:	e8 33 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60dcd:	48 8d 0d 04 dc ce 00 	lea    rcx,[rip+0xcedc04]        # 184e9d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb0c0>
      b60dd4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60dd7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ddc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ddf:	48 89 e7             	mov    rdi,rsp
      b60de2:	e8 2f cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60de7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60dec:	48 85 ff             	test   rdi,rdi
      b60def:	74 06                	je     b60df7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd97>
      b60df1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60df4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60df7:	6a 08                	push   0x8
      b60df9:	5f                   	pop    rdi
      b60dfa:	e8 01 d1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60de2; FDE=(11925239, 11936142)
      b60d96:	e8 65 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d9b:	48 8d 0d 86 ce ce 00 	lea    rcx,[rip+0xcece86]        # 184dc28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa310>
      b60da2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60da5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60daa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60dad:	48 89 e7             	mov    rdi,rsp
      b60db0:	e8 61 cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60db5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60dba:	48 85 ff             	test   rdi,rdi
      b60dbd:	74 06                	je     b60dc5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd65>
      b60dbf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60dc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60dc5:	6a 08                	push   0x8
      b60dc7:	5f                   	pop    rdi
      b60dc8:	e8 33 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60dcd:	48 8d 0d 04 dc ce 00 	lea    rcx,[rip+0xcedc04]        # 184e9d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb0c0>
      b60dd4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60dd7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ddc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ddf:	48 89 e7             	mov    rdi,rsp
      b60de2:	e8 2f cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60de7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60dec:	48 85 ff             	test   rdi,rdi
      b60def:	74 06                	je     b60df7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd97>
      b60df1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60df4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60df7:	6a 08                	push   0x8
      b60df9:	5f                   	pop    rdi
      b60dfa:	e8 01 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60dff:	48 8d 0d 2a f6 cc 00 	lea    rcx,[rip+0xccf62a]        # 1830430 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x23c8>
      b60e06:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e09:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60e0e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60e11:	48 89 e7             	mov    rdi,rsp
      b60e14:	e8 fd cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60e19:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60e1e:	48 85 ff             	test   rdi,rdi
      b60e21:	74 06                	je     b60e29 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaddc9>
      b60e23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60e26:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60e29:	6a 08                	push   0x8
      b60e2b:	5f                   	pop    rdi
      b60e2c:	e8 cf d0 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60e14; FDE=(11925239, 11936142)
      b60dc8:	e8 33 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60dcd:	48 8d 0d 04 dc ce 00 	lea    rcx,[rip+0xcedc04]        # 184e9d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb0c0>
      b60dd4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60dd7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ddc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ddf:	48 89 e7             	mov    rdi,rsp
      b60de2:	e8 2f cd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60de7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60dec:	48 85 ff             	test   rdi,rdi
      b60def:	74 06                	je     b60df7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadd97>
      b60df1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60df4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60df7:	6a 08                	push   0x8
      b60df9:	5f                   	pop    rdi
      b60dfa:	e8 01 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60dff:	48 8d 0d 2a f6 cc 00 	lea    rcx,[rip+0xccf62a]        # 1830430 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x23c8>
      b60e06:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e09:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60e0e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60e11:	48 89 e7             	mov    rdi,rsp
      b60e14:	e8 fd cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60e19:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60e1e:	48 85 ff             	test   rdi,rdi
      b60e21:	74 06                	je     b60e29 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaddc9>
      b60e23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60e26:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60e29:	6a 08                	push   0x8
      b60e2b:	5f                   	pop    rdi
      b60e2c:	e8 cf d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60e31:	48 8d 0d c8 2c cf 00 	lea    rcx,[rip+0xcf2cc8]        # 1853b00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x101e8>
      b60e38:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e3b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60e40:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60e43:	48 89 e7             	mov    rdi,rsp
      b60e46:	e8 cb cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60e4b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60e50:	48 85 ff             	test   rdi,rdi
      b60e53:	74 06                	je     b60e5b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaddfb>
      b60e55:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60e58:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60e5b:	6a 08                	push   0x8
      b60e5d:	5f                   	pop    rdi
      b60e5e:	e8 9d d0 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60e46; FDE=(11925239, 11936142)
      b60dfa:	e8 01 d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60dff:	48 8d 0d 2a f6 cc 00 	lea    rcx,[rip+0xccf62a]        # 1830430 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x23c8>
      b60e06:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e09:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60e0e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60e11:	48 89 e7             	mov    rdi,rsp
      b60e14:	e8 fd cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60e19:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60e1e:	48 85 ff             	test   rdi,rdi
      b60e21:	74 06                	je     b60e29 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaddc9>
      b60e23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60e26:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60e29:	6a 08                	push   0x8
      b60e2b:	5f                   	pop    rdi
      b60e2c:	e8 cf d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60e31:	48 8d 0d c8 2c cf 00 	lea    rcx,[rip+0xcf2cc8]        # 1853b00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x101e8>
      b60e38:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e3b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60e40:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60e43:	48 89 e7             	mov    rdi,rsp
      b60e46:	e8 cb cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60e4b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60e50:	48 85 ff             	test   rdi,rdi
      b60e53:	74 06                	je     b60e5b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaddfb>
      b60e55:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60e58:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60e5b:	6a 08                	push   0x8
      b60e5d:	5f                   	pop    rdi
      b60e5e:	e8 9d d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60e63:	48 8d 0d b6 5d ce 00 	lea    rcx,[rip+0xce5db6]        # 1846c20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3308>
      b60e6a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e6d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60e72:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60e75:	48 89 e7             	mov    rdi,rsp
      b60e78:	e8 99 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60e7d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60e82:	48 85 ff             	test   rdi,rdi
      b60e85:	74 06                	je     b60e8d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xade2d>
      b60e87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60e8a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60e8d:	6a 08                	push   0x8
      b60e8f:	5f                   	pop    rdi
      b60e90:	e8 6b d0 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60e78; FDE=(11925239, 11936142)
      b60e2c:	e8 cf d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60e31:	48 8d 0d c8 2c cf 00 	lea    rcx,[rip+0xcf2cc8]        # 1853b00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x101e8>
      b60e38:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e3b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60e40:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60e43:	48 89 e7             	mov    rdi,rsp
      b60e46:	e8 cb cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60e4b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60e50:	48 85 ff             	test   rdi,rdi
      b60e53:	74 06                	je     b60e5b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaddfb>
      b60e55:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60e58:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60e5b:	6a 08                	push   0x8
      b60e5d:	5f                   	pop    rdi
      b60e5e:	e8 9d d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60e63:	48 8d 0d b6 5d ce 00 	lea    rcx,[rip+0xce5db6]        # 1846c20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3308>
      b60e6a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e6d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60e72:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60e75:	48 89 e7             	mov    rdi,rsp
      b60e78:	e8 99 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60e7d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60e82:	48 85 ff             	test   rdi,rdi
      b60e85:	74 06                	je     b60e8d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xade2d>
      b60e87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60e8a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60e8d:	6a 08                	push   0x8
      b60e8f:	5f                   	pop    rdi
      b60e90:	e8 6b d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60e95:	48 8d 0d 54 6b ce 00 	lea    rcx,[rip+0xce6b54]        # 18479f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40d8>
      b60e9c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e9f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ea4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ea7:	48 89 e7             	mov    rdi,rsp
      b60eaa:	e8 67 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60eaf:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60eb4:	48 85 ff             	test   rdi,rdi
      b60eb7:	74 06                	je     b60ebf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xade5f>
      b60eb9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60ebc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ebf:	6a 08                	push   0x8
      b60ec1:	5f                   	pop    rdi
      b60ec2:	e8 39 d0 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60eaa; FDE=(11925239, 11936142)
      b60e5e:	e8 9d d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60e63:	48 8d 0d b6 5d ce 00 	lea    rcx,[rip+0xce5db6]        # 1846c20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3308>
      b60e6a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e6d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60e72:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60e75:	48 89 e7             	mov    rdi,rsp
      b60e78:	e8 99 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60e7d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60e82:	48 85 ff             	test   rdi,rdi
      b60e85:	74 06                	je     b60e8d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xade2d>
      b60e87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60e8a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60e8d:	6a 08                	push   0x8
      b60e8f:	5f                   	pop    rdi
      b60e90:	e8 6b d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60e95:	48 8d 0d 54 6b ce 00 	lea    rcx,[rip+0xce6b54]        # 18479f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40d8>
      b60e9c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e9f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ea4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ea7:	48 89 e7             	mov    rdi,rsp
      b60eaa:	e8 67 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60eaf:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60eb4:	48 85 ff             	test   rdi,rdi
      b60eb7:	74 06                	je     b60ebf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xade5f>
      b60eb9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60ebc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ebf:	6a 08                	push   0x8
      b60ec1:	5f                   	pop    rdi
      b60ec2:	e8 39 d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60ec7:	48 8d 0d 32 b8 cc 00 	lea    rcx,[rip+0xccb832]        # 182c700 <_ZTIN4asio2ip16bad_address_castE@@Base+0x8d30>
      b60ece:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ed1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ed6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ed9:	48 89 e7             	mov    rdi,rsp
      b60edc:	e8 35 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60ee1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60ee6:	48 85 ff             	test   rdi,rdi
      b60ee9:	74 06                	je     b60ef1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xade91>
      b60eeb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60eee:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ef1:	6a 08                	push   0x8
      b60ef3:	5f                   	pop    rdi
      b60ef4:	e8 07 d0 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60edc; FDE=(11925239, 11936142)
      b60e90:	e8 6b d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60e95:	48 8d 0d 54 6b ce 00 	lea    rcx,[rip+0xce6b54]        # 18479f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40d8>
      b60e9c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60e9f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ea4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ea7:	48 89 e7             	mov    rdi,rsp
      b60eaa:	e8 67 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60eaf:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60eb4:	48 85 ff             	test   rdi,rdi
      b60eb7:	74 06                	je     b60ebf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xade5f>
      b60eb9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60ebc:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ebf:	6a 08                	push   0x8
      b60ec1:	5f                   	pop    rdi
      b60ec2:	e8 39 d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60ec7:	48 8d 0d 32 b8 cc 00 	lea    rcx,[rip+0xccb832]        # 182c700 <_ZTIN4asio2ip16bad_address_castE@@Base+0x8d30>
      b60ece:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ed1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ed6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ed9:	48 89 e7             	mov    rdi,rsp
      b60edc:	e8 35 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60ee1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60ee6:	48 85 ff             	test   rdi,rdi
      b60ee9:	74 06                	je     b60ef1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xade91>
      b60eeb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60eee:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ef1:	6a 08                	push   0x8
      b60ef3:	5f                   	pop    rdi
      b60ef4:	e8 07 d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60ef9:	48 8d 0d b8 a8 cc 00 	lea    rcx,[rip+0xcca8b8]        # 182b7b8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7de8>
      b60f00:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f03:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f08:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60f0b:	48 89 e7             	mov    rdi,rsp
      b60f0e:	e8 03 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60f13:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60f18:	48 85 ff             	test   rdi,rdi
      b60f1b:	74 06                	je     b60f23 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadec3>
      b60f1d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60f20:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60f23:	6a 08                	push   0x8
      b60f25:	5f                   	pop    rdi
      b60f26:	e8 d5 cf c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60f0e; FDE=(11925239, 11936142)
      b60ec2:	e8 39 d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60ec7:	48 8d 0d 32 b8 cc 00 	lea    rcx,[rip+0xccb832]        # 182c700 <_ZTIN4asio2ip16bad_address_castE@@Base+0x8d30>
      b60ece:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ed1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ed6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ed9:	48 89 e7             	mov    rdi,rsp
      b60edc:	e8 35 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60ee1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60ee6:	48 85 ff             	test   rdi,rdi
      b60ee9:	74 06                	je     b60ef1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xade91>
      b60eeb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60eee:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ef1:	6a 08                	push   0x8
      b60ef3:	5f                   	pop    rdi
      b60ef4:	e8 07 d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60ef9:	48 8d 0d b8 a8 cc 00 	lea    rcx,[rip+0xcca8b8]        # 182b7b8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7de8>
      b60f00:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f03:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f08:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60f0b:	48 89 e7             	mov    rdi,rsp
      b60f0e:	e8 03 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60f13:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60f18:	48 85 ff             	test   rdi,rdi
      b60f1b:	74 06                	je     b60f23 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadec3>
      b60f1d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60f20:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60f23:	6a 08                	push   0x8
      b60f25:	5f                   	pop    rdi
      b60f26:	e8 d5 cf c8 00       	call   17edf00 <_Znwm@plt>
      b60f2b:	48 8d 0d 46 a8 cc 00 	lea    rcx,[rip+0xcca846]        # 182b778 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7da8>
      b60f32:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f35:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f3a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60f3d:	48 89 e7             	mov    rdi,rsp
      b60f40:	e8 d1 cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60f45:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60f4a:	48 85 ff             	test   rdi,rdi
      b60f4d:	74 06                	je     b60f55 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadef5>
      b60f4f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60f52:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60f55:	6a 08                	push   0x8
      b60f57:	5f                   	pop    rdi
      b60f58:	e8 a3 cf c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60f40; FDE=(11925239, 11936142)
      b60ef4:	e8 07 d0 c8 00       	call   17edf00 <_Znwm@plt>
      b60ef9:	48 8d 0d b8 a8 cc 00 	lea    rcx,[rip+0xcca8b8]        # 182b7b8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7de8>
      b60f00:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f03:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f08:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60f0b:	48 89 e7             	mov    rdi,rsp
      b60f0e:	e8 03 cc f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60f13:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60f18:	48 85 ff             	test   rdi,rdi
      b60f1b:	74 06                	je     b60f23 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadec3>
      b60f1d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60f20:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60f23:	6a 08                	push   0x8
      b60f25:	5f                   	pop    rdi
      b60f26:	e8 d5 cf c8 00       	call   17edf00 <_Znwm@plt>
      b60f2b:	48 8d 0d 46 a8 cc 00 	lea    rcx,[rip+0xcca846]        # 182b778 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7da8>
      b60f32:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f35:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f3a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60f3d:	48 89 e7             	mov    rdi,rsp
      b60f40:	e8 d1 cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60f45:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60f4a:	48 85 ff             	test   rdi,rdi
      b60f4d:	74 06                	je     b60f55 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadef5>
      b60f4f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60f52:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60f55:	6a 08                	push   0x8
      b60f57:	5f                   	pop    rdi
      b60f58:	e8 a3 cf c8 00       	call   17edf00 <_Znwm@plt>
      b60f5d:	48 8d 0d 9c ad cc 00 	lea    rcx,[rip+0xccad9c]        # 182bd00 <_ZTIN4asio2ip16bad_address_castE@@Base+0x8330>
      b60f64:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f67:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f6c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60f6f:	48 89 e7             	mov    rdi,rsp
      b60f72:	e8 9f cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60f77:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60f7c:	48 85 ff             	test   rdi,rdi
      b60f7f:	74 06                	je     b60f87 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadf27>
      b60f81:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60f84:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60f87:	6a 08                	push   0x8
      b60f89:	5f                   	pop    rdi
      b60f8a:	e8 71 cf c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60f72; FDE=(11925239, 11936142)
      b60f26:	e8 d5 cf c8 00       	call   17edf00 <_Znwm@plt>
      b60f2b:	48 8d 0d 46 a8 cc 00 	lea    rcx,[rip+0xcca846]        # 182b778 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7da8>
      b60f32:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f35:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f3a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60f3d:	48 89 e7             	mov    rdi,rsp
      b60f40:	e8 d1 cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60f45:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60f4a:	48 85 ff             	test   rdi,rdi
      b60f4d:	74 06                	je     b60f55 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadef5>
      b60f4f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60f52:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60f55:	6a 08                	push   0x8
      b60f57:	5f                   	pop    rdi
      b60f58:	e8 a3 cf c8 00       	call   17edf00 <_Znwm@plt>
      b60f5d:	48 8d 0d 9c ad cc 00 	lea    rcx,[rip+0xccad9c]        # 182bd00 <_ZTIN4asio2ip16bad_address_castE@@Base+0x8330>
      b60f64:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f67:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f6c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60f6f:	48 89 e7             	mov    rdi,rsp
      b60f72:	e8 9f cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60f77:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60f7c:	48 85 ff             	test   rdi,rdi
      b60f7f:	74 06                	je     b60f87 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadf27>
      b60f81:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60f84:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60f87:	6a 08                	push   0x8
      b60f89:	5f                   	pop    rdi
      b60f8a:	e8 71 cf c8 00       	call   17edf00 <_Znwm@plt>
      b60f8f:	48 8d 0d a2 a7 cc 00 	lea    rcx,[rip+0xcca7a2]        # 182b738 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7d68>
      b60f96:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f99:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f9e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60fa1:	48 89 e7             	mov    rdi,rsp
      b60fa4:	e8 6d cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60fa9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60fae:	48 85 ff             	test   rdi,rdi
      b60fb1:	74 06                	je     b60fb9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadf59>
      b60fb3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60fb6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60fb9:	6a 08                	push   0x8
      b60fbb:	5f                   	pop    rdi
      b60fbc:	e8 3f cf c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60fa4; FDE=(11925239, 11936142)
      b60f58:	e8 a3 cf c8 00       	call   17edf00 <_Znwm@plt>
      b60f5d:	48 8d 0d 9c ad cc 00 	lea    rcx,[rip+0xccad9c]        # 182bd00 <_ZTIN4asio2ip16bad_address_castE@@Base+0x8330>
      b60f64:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f67:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f6c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60f6f:	48 89 e7             	mov    rdi,rsp
      b60f72:	e8 9f cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60f77:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60f7c:	48 85 ff             	test   rdi,rdi
      b60f7f:	74 06                	je     b60f87 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadf27>
      b60f81:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60f84:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60f87:	6a 08                	push   0x8
      b60f89:	5f                   	pop    rdi
      b60f8a:	e8 71 cf c8 00       	call   17edf00 <_Znwm@plt>
      b60f8f:	48 8d 0d a2 a7 cc 00 	lea    rcx,[rip+0xcca7a2]        # 182b738 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7d68>
      b60f96:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f99:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f9e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60fa1:	48 89 e7             	mov    rdi,rsp
      b60fa4:	e8 6d cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60fa9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60fae:	48 85 ff             	test   rdi,rdi
      b60fb1:	74 06                	je     b60fb9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadf59>
      b60fb3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60fb6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60fb9:	6a 08                	push   0x8
      b60fbb:	5f                   	pop    rdi
      b60fbc:	e8 3f cf c8 00       	call   17edf00 <_Znwm@plt>
      b60fc1:	48 8d 0d 30 a7 cc 00 	lea    rcx,[rip+0xcca730]        # 182b6f8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7d28>
      b60fc8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60fcb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60fd0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60fd3:	48 89 e7             	mov    rdi,rsp
      b60fd6:	e8 3b cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60fdb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60fe0:	48 85 ff             	test   rdi,rdi
      b60fe3:	74 06                	je     b60feb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadf8b>
      b60fe5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60fe8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60feb:	6a 08                	push   0x8
      b60fed:	5f                   	pop    rdi
      b60fee:	e8 0d cf c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb60fd6; FDE=(11925239, 11936142)
      b60f8a:	e8 71 cf c8 00       	call   17edf00 <_Znwm@plt>
      b60f8f:	48 8d 0d a2 a7 cc 00 	lea    rcx,[rip+0xcca7a2]        # 182b738 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7d68>
      b60f96:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60f99:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60f9e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60fa1:	48 89 e7             	mov    rdi,rsp
      b60fa4:	e8 6d cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60fa9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60fae:	48 85 ff             	test   rdi,rdi
      b60fb1:	74 06                	je     b60fb9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadf59>
      b60fb3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60fb6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60fb9:	6a 08                	push   0x8
      b60fbb:	5f                   	pop    rdi
      b60fbc:	e8 3f cf c8 00       	call   17edf00 <_Znwm@plt>
      b60fc1:	48 8d 0d 30 a7 cc 00 	lea    rcx,[rip+0xcca730]        # 182b6f8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7d28>
      b60fc8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60fcb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60fd0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60fd3:	48 89 e7             	mov    rdi,rsp
      b60fd6:	e8 3b cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60fdb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60fe0:	48 85 ff             	test   rdi,rdi
      b60fe3:	74 06                	je     b60feb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadf8b>
      b60fe5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60fe8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60feb:	6a 08                	push   0x8
      b60fed:	5f                   	pop    rdi
      b60fee:	e8 0d cf c8 00       	call   17edf00 <_Znwm@plt>
      b60ff3:	48 8d 0d 1e a5 cb 00 	lea    rcx,[rip+0xcba51e]        # 181b518 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x111d8>
      b60ffa:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ffd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61002:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61005:	48 89 e7             	mov    rdi,rsp
      b61008:	e8 09 cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6100d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61012:	48 85 ff             	test   rdi,rdi
      b61015:	74 06                	je     b6101d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadfbd>
      b61017:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6101a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6101d:	6a 08                	push   0x8
      b6101f:	5f                   	pop    rdi
      b61020:	e8 db ce c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61008; FDE=(11925239, 11936142)
      b60fbc:	e8 3f cf c8 00       	call   17edf00 <_Znwm@plt>
      b60fc1:	48 8d 0d 30 a7 cc 00 	lea    rcx,[rip+0xcca730]        # 182b6f8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7d28>
      b60fc8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60fcb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60fd0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60fd3:	48 89 e7             	mov    rdi,rsp
      b60fd6:	e8 3b cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60fdb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60fe0:	48 85 ff             	test   rdi,rdi
      b60fe3:	74 06                	je     b60feb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadf8b>
      b60fe5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60fe8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60feb:	6a 08                	push   0x8
      b60fed:	5f                   	pop    rdi
      b60fee:	e8 0d cf c8 00       	call   17edf00 <_Znwm@plt>
      b60ff3:	48 8d 0d 1e a5 cb 00 	lea    rcx,[rip+0xcba51e]        # 181b518 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x111d8>
      b60ffa:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ffd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61002:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61005:	48 89 e7             	mov    rdi,rsp
      b61008:	e8 09 cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6100d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61012:	48 85 ff             	test   rdi,rdi
      b61015:	74 06                	je     b6101d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadfbd>
      b61017:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6101a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6101d:	6a 08                	push   0x8
      b6101f:	5f                   	pop    rdi
      b61020:	e8 db ce c8 00       	call   17edf00 <_Znwm@plt>
      b61025:	48 8d 0d 64 bc cb 00 	lea    rcx,[rip+0xcbbc64]        # 181cc90 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12950>
      b6102c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6102f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61034:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61037:	48 89 e7             	mov    rdi,rsp
      b6103a:	e8 d7 ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6103f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61044:	48 85 ff             	test   rdi,rdi
      b61047:	74 06                	je     b6104f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadfef>
      b61049:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6104c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6104f:	6a 08                	push   0x8
      b61051:	5f                   	pop    rdi
      b61052:	e8 a9 ce c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6103a; FDE=(11925239, 11936142)
      b60fee:	e8 0d cf c8 00       	call   17edf00 <_Znwm@plt>
      b60ff3:	48 8d 0d 1e a5 cb 00 	lea    rcx,[rip+0xcba51e]        # 181b518 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x111d8>
      b60ffa:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60ffd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61002:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61005:	48 89 e7             	mov    rdi,rsp
      b61008:	e8 09 cb f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6100d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61012:	48 85 ff             	test   rdi,rdi
      b61015:	74 06                	je     b6101d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadfbd>
      b61017:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6101a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6101d:	6a 08                	push   0x8
      b6101f:	5f                   	pop    rdi
      b61020:	e8 db ce c8 00       	call   17edf00 <_Znwm@plt>
      b61025:	48 8d 0d 64 bc cb 00 	lea    rcx,[rip+0xcbbc64]        # 181cc90 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12950>
      b6102c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6102f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61034:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61037:	48 89 e7             	mov    rdi,rsp
      b6103a:	e8 d7 ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6103f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61044:	48 85 ff             	test   rdi,rdi
      b61047:	74 06                	je     b6104f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadfef>
      b61049:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6104c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6104f:	6a 08                	push   0x8
      b61051:	5f                   	pop    rdi
      b61052:	e8 a9 ce c8 00       	call   17edf00 <_Znwm@plt>
      b61057:	48 8d 0d ba e5 cb 00 	lea    rcx,[rip+0xcbe5ba]        # 181f618 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x152d8>
      b6105e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61061:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61066:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61069:	48 89 e7             	mov    rdi,rsp
      b6106c:	e8 a5 ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61071:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61076:	48 85 ff             	test   rdi,rdi
      b61079:	74 06                	je     b61081 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae021>
      b6107b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6107e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61081:	40 84 ed             	test   bpl,bpl
      b61084:	74 24                	je     b610aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae04a>
      b61086:	6a 08                	push   0x8

### call 0xb6106c; FDE=(11925239, 11936142)
      b61020:	e8 db ce c8 00       	call   17edf00 <_Znwm@plt>
      b61025:	48 8d 0d 64 bc cb 00 	lea    rcx,[rip+0xcbbc64]        # 181cc90 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12950>
      b6102c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6102f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61034:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61037:	48 89 e7             	mov    rdi,rsp
      b6103a:	e8 d7 ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6103f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61044:	48 85 ff             	test   rdi,rdi
      b61047:	74 06                	je     b6104f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadfef>
      b61049:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6104c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6104f:	6a 08                	push   0x8
      b61051:	5f                   	pop    rdi
      b61052:	e8 a9 ce c8 00       	call   17edf00 <_Znwm@plt>
      b61057:	48 8d 0d ba e5 cb 00 	lea    rcx,[rip+0xcbe5ba]        # 181f618 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x152d8>
      b6105e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61061:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61066:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61069:	48 89 e7             	mov    rdi,rsp
      b6106c:	e8 a5 ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61071:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61076:	48 85 ff             	test   rdi,rdi
      b61079:	74 06                	je     b61081 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae021>
      b6107b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6107e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61081:	40 84 ed             	test   bpl,bpl
      b61084:	74 24                	je     b610aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae04a>
      b61086:	6a 08                	push   0x8
      b61088:	5f                   	pop    rdi
      b61089:	e8 72 ce c8 00       	call   17edf00 <_Znwm@plt>
      b6108e:	48 8d 0d 83 6b d0 00 	lea    rcx,[rip+0xd06b83]        # 1867c18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24300>
      b61095:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61098:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6109d:	48 89 06             	mov    QWORD PTR [rsi],rax
      b610a0:	48 89 e7             	mov    rdi,rsp
      b610a3:	e8 6e ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b610a8:	eb 22                	jmp    b610cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae06c>
      b610aa:	6a 08                	push   0x8
      b610ac:	5f                   	pop    rdi
      b610ad:	e8 4e ce c8 00       	call   17edf00 <_Znwm@plt>
      b610b2:	48 8d 0d 1f e5 cb 00 	lea    rcx,[rip+0xcbe51f]        # 181f5d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x15298>
      b610b9:	48 89 08             	mov    QWORD PTR [rax],rcx

### call 0xb610a3; FDE=(11925239, 11936142)
      b6105e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61061:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61066:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61069:	48 89 e7             	mov    rdi,rsp
      b6106c:	e8 a5 ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61071:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61076:	48 85 ff             	test   rdi,rdi
      b61079:	74 06                	je     b61081 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae021>
      b6107b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6107e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61081:	40 84 ed             	test   bpl,bpl
      b61084:	74 24                	je     b610aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae04a>
      b61086:	6a 08                	push   0x8
      b61088:	5f                   	pop    rdi
      b61089:	e8 72 ce c8 00       	call   17edf00 <_Znwm@plt>
      b6108e:	48 8d 0d 83 6b d0 00 	lea    rcx,[rip+0xd06b83]        # 1867c18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24300>
      b61095:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61098:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6109d:	48 89 06             	mov    QWORD PTR [rsi],rax
      b610a0:	48 89 e7             	mov    rdi,rsp
      b610a3:	e8 6e ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b610a8:	eb 22                	jmp    b610cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae06c>
      b610aa:	6a 08                	push   0x8
      b610ac:	5f                   	pop    rdi
      b610ad:	e8 4e ce c8 00       	call   17edf00 <_Znwm@plt>
      b610b2:	48 8d 0d 1f e5 cb 00 	lea    rcx,[rip+0xcbe51f]        # 181f5d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x15298>
      b610b9:	48 89 08             	mov    QWORD PTR [rax],rcx
      b610bc:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b610c1:	48 89 06             	mov    QWORD PTR [rsi],rax
      b610c4:	48 89 e7             	mov    rdi,rsp
      b610c7:	e8 4a ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b610cc:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b610d1:	48 85 ff             	test   rdi,rdi
      b610d4:	74 06                	je     b610dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae07c>
      b610d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b610d9:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b610dc:	6a 08                	push   0x8
      b610de:	5f                   	pop    rdi
      b610df:	e8 1c ce c8 00       	call   17edf00 <_Znwm@plt>
      b610e4:	48 8d 0d ed dd cb 00 	lea    rcx,[rip+0xcbdded]        # 181eed8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14b98>
      b610eb:	48 89 08             	mov    QWORD PTR [rax],rcx
      b610ee:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b610f3:	48 89 06             	mov    QWORD PTR [rsi],rax

### call 0xb610c7; FDE=(11925239, 11936142)
      b61081:	40 84 ed             	test   bpl,bpl
      b61084:	74 24                	je     b610aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae04a>
      b61086:	6a 08                	push   0x8
      b61088:	5f                   	pop    rdi
      b61089:	e8 72 ce c8 00       	call   17edf00 <_Znwm@plt>
      b6108e:	48 8d 0d 83 6b d0 00 	lea    rcx,[rip+0xd06b83]        # 1867c18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24300>
      b61095:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61098:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6109d:	48 89 06             	mov    QWORD PTR [rsi],rax
      b610a0:	48 89 e7             	mov    rdi,rsp
      b610a3:	e8 6e ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b610a8:	eb 22                	jmp    b610cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae06c>
      b610aa:	6a 08                	push   0x8
      b610ac:	5f                   	pop    rdi
      b610ad:	e8 4e ce c8 00       	call   17edf00 <_Znwm@plt>
      b610b2:	48 8d 0d 1f e5 cb 00 	lea    rcx,[rip+0xcbe51f]        # 181f5d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x15298>
      b610b9:	48 89 08             	mov    QWORD PTR [rax],rcx
      b610bc:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b610c1:	48 89 06             	mov    QWORD PTR [rsi],rax
      b610c4:	48 89 e7             	mov    rdi,rsp
      b610c7:	e8 4a ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b610cc:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b610d1:	48 85 ff             	test   rdi,rdi
      b610d4:	74 06                	je     b610dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae07c>
      b610d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b610d9:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b610dc:	6a 08                	push   0x8
      b610de:	5f                   	pop    rdi
      b610df:	e8 1c ce c8 00       	call   17edf00 <_Znwm@plt>
      b610e4:	48 8d 0d ed dd cb 00 	lea    rcx,[rip+0xcbdded]        # 181eed8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14b98>
      b610eb:	48 89 08             	mov    QWORD PTR [rax],rcx
      b610ee:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b610f3:	48 89 06             	mov    QWORD PTR [rsi],rax
      b610f6:	48 89 e7             	mov    rdi,rsp
      b610f9:	e8 18 ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b610fe:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61103:	48 85 ff             	test   rdi,rdi
      b61106:	74 06                	je     b6110e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae0ae>
      b61108:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6110b:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6110e:	6a 08                	push   0x8
      b61110:	5f                   	pop    rdi
      b61111:	e8 ea cd c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb610f9; FDE=(11925239, 11936142)
      b610ad:	e8 4e ce c8 00       	call   17edf00 <_Znwm@plt>
      b610b2:	48 8d 0d 1f e5 cb 00 	lea    rcx,[rip+0xcbe51f]        # 181f5d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x15298>
      b610b9:	48 89 08             	mov    QWORD PTR [rax],rcx
      b610bc:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b610c1:	48 89 06             	mov    QWORD PTR [rsi],rax
      b610c4:	48 89 e7             	mov    rdi,rsp
      b610c7:	e8 4a ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b610cc:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b610d1:	48 85 ff             	test   rdi,rdi
      b610d4:	74 06                	je     b610dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae07c>
      b610d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b610d9:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b610dc:	6a 08                	push   0x8
      b610de:	5f                   	pop    rdi
      b610df:	e8 1c ce c8 00       	call   17edf00 <_Znwm@plt>
      b610e4:	48 8d 0d ed dd cb 00 	lea    rcx,[rip+0xcbdded]        # 181eed8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14b98>
      b610eb:	48 89 08             	mov    QWORD PTR [rax],rcx
      b610ee:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b610f3:	48 89 06             	mov    QWORD PTR [rsi],rax
      b610f6:	48 89 e7             	mov    rdi,rsp
      b610f9:	e8 18 ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b610fe:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61103:	48 85 ff             	test   rdi,rdi
      b61106:	74 06                	je     b6110e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae0ae>
      b61108:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6110b:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6110e:	6a 08                	push   0x8
      b61110:	5f                   	pop    rdi
      b61111:	e8 ea cd c8 00       	call   17edf00 <_Znwm@plt>
      b61116:	48 8d 0d ab 85 cb 00 	lea    rcx,[rip+0xcb85ab]        # 18196c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf388>
      b6111d:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61120:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61125:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61128:	48 89 e7             	mov    rdi,rsp
      b6112b:	e8 e6 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61130:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61135:	48 85 ff             	test   rdi,rdi
      b61138:	74 06                	je     b61140 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae0e0>
      b6113a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6113d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61140:	6a 08                	push   0x8
      b61142:	5f                   	pop    rdi
      b61143:	e8 b8 cd c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6112b; FDE=(11925239, 11936142)
      b610df:	e8 1c ce c8 00       	call   17edf00 <_Znwm@plt>
      b610e4:	48 8d 0d ed dd cb 00 	lea    rcx,[rip+0xcbdded]        # 181eed8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14b98>
      b610eb:	48 89 08             	mov    QWORD PTR [rax],rcx
      b610ee:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b610f3:	48 89 06             	mov    QWORD PTR [rsi],rax
      b610f6:	48 89 e7             	mov    rdi,rsp
      b610f9:	e8 18 ca f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b610fe:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61103:	48 85 ff             	test   rdi,rdi
      b61106:	74 06                	je     b6110e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae0ae>
      b61108:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6110b:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6110e:	6a 08                	push   0x8
      b61110:	5f                   	pop    rdi
      b61111:	e8 ea cd c8 00       	call   17edf00 <_Znwm@plt>
      b61116:	48 8d 0d ab 85 cb 00 	lea    rcx,[rip+0xcb85ab]        # 18196c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf388>
      b6111d:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61120:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61125:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61128:	48 89 e7             	mov    rdi,rsp
      b6112b:	e8 e6 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61130:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61135:	48 85 ff             	test   rdi,rdi
      b61138:	74 06                	je     b61140 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae0e0>
      b6113a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6113d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61140:	6a 08                	push   0x8
      b61142:	5f                   	pop    rdi
      b61143:	e8 b8 cd c8 00       	call   17edf00 <_Znwm@plt>
      b61148:	48 8d 0d c9 dc cb 00 	lea    rcx,[rip+0xcbdcc9]        # 181ee18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14ad8>
      b6114f:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61152:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61157:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6115a:	48 89 e7             	mov    rdi,rsp
      b6115d:	e8 b4 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61162:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61167:	48 85 ff             	test   rdi,rdi
      b6116a:	74 06                	je     b61172 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae112>
      b6116c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6116f:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61172:	6a 08                	push   0x8
      b61174:	5f                   	pop    rdi
      b61175:	e8 86 cd c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6115d; FDE=(11925239, 11936142)
      b61111:	e8 ea cd c8 00       	call   17edf00 <_Znwm@plt>
      b61116:	48 8d 0d ab 85 cb 00 	lea    rcx,[rip+0xcb85ab]        # 18196c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf388>
      b6111d:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61120:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61125:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61128:	48 89 e7             	mov    rdi,rsp
      b6112b:	e8 e6 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61130:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61135:	48 85 ff             	test   rdi,rdi
      b61138:	74 06                	je     b61140 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae0e0>
      b6113a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6113d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61140:	6a 08                	push   0x8
      b61142:	5f                   	pop    rdi
      b61143:	e8 b8 cd c8 00       	call   17edf00 <_Znwm@plt>
      b61148:	48 8d 0d c9 dc cb 00 	lea    rcx,[rip+0xcbdcc9]        # 181ee18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14ad8>
      b6114f:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61152:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61157:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6115a:	48 89 e7             	mov    rdi,rsp
      b6115d:	e8 b4 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61162:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61167:	48 85 ff             	test   rdi,rdi
      b6116a:	74 06                	je     b61172 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae112>
      b6116c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6116f:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61172:	6a 08                	push   0x8
      b61174:	5f                   	pop    rdi
      b61175:	e8 86 cd c8 00       	call   17edf00 <_Znwm@plt>
      b6117a:	48 8d 0d 3f 65 ce 00 	lea    rcx,[rip+0xce653f]        # 18476c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3da8>
      b61181:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61184:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61189:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6118c:	48 89 e7             	mov    rdi,rsp
      b6118f:	e8 82 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61194:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61199:	48 85 ff             	test   rdi,rdi
      b6119c:	74 06                	je     b611a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae144>
      b6119e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b611a1:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b611a4:	6a 08                	push   0x8
      b611a6:	5f                   	pop    rdi
      b611a7:	e8 54 cd c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6118f; FDE=(11925239, 11936142)
      b61143:	e8 b8 cd c8 00       	call   17edf00 <_Znwm@plt>
      b61148:	48 8d 0d c9 dc cb 00 	lea    rcx,[rip+0xcbdcc9]        # 181ee18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14ad8>
      b6114f:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61152:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61157:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6115a:	48 89 e7             	mov    rdi,rsp
      b6115d:	e8 b4 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61162:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61167:	48 85 ff             	test   rdi,rdi
      b6116a:	74 06                	je     b61172 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae112>
      b6116c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6116f:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61172:	6a 08                	push   0x8
      b61174:	5f                   	pop    rdi
      b61175:	e8 86 cd c8 00       	call   17edf00 <_Znwm@plt>
      b6117a:	48 8d 0d 3f 65 ce 00 	lea    rcx,[rip+0xce653f]        # 18476c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3da8>
      b61181:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61184:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61189:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6118c:	48 89 e7             	mov    rdi,rsp
      b6118f:	e8 82 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61194:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61199:	48 85 ff             	test   rdi,rdi
      b6119c:	74 06                	je     b611a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae144>
      b6119e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b611a1:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b611a4:	6a 08                	push   0x8
      b611a6:	5f                   	pop    rdi
      b611a7:	e8 54 cd c8 00       	call   17edf00 <_Znwm@plt>
      b611ac:	48 8d 0d 5d b8 ce 00 	lea    rcx,[rip+0xceb85d]        # 184ca10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x90f8>
      b611b3:	48 89 08             	mov    QWORD PTR [rax],rcx
      b611b6:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b611bb:	48 89 06             	mov    QWORD PTR [rsi],rax
      b611be:	48 89 e7             	mov    rdi,rsp
      b611c1:	e8 50 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b611c6:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b611cb:	48 85 ff             	test   rdi,rdi
      b611ce:	74 06                	je     b611d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae176>
      b611d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b611d3:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b611d6:	6a 08                	push   0x8
      b611d8:	5f                   	pop    rdi
      b611d9:	e8 22 cd c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb611c1; FDE=(11925239, 11936142)
      b61175:	e8 86 cd c8 00       	call   17edf00 <_Znwm@plt>
      b6117a:	48 8d 0d 3f 65 ce 00 	lea    rcx,[rip+0xce653f]        # 18476c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3da8>
      b61181:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61184:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61189:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6118c:	48 89 e7             	mov    rdi,rsp
      b6118f:	e8 82 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61194:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61199:	48 85 ff             	test   rdi,rdi
      b6119c:	74 06                	je     b611a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae144>
      b6119e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b611a1:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b611a4:	6a 08                	push   0x8
      b611a6:	5f                   	pop    rdi
      b611a7:	e8 54 cd c8 00       	call   17edf00 <_Znwm@plt>
      b611ac:	48 8d 0d 5d b8 ce 00 	lea    rcx,[rip+0xceb85d]        # 184ca10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x90f8>
      b611b3:	48 89 08             	mov    QWORD PTR [rax],rcx
      b611b6:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b611bb:	48 89 06             	mov    QWORD PTR [rsi],rax
      b611be:	48 89 e7             	mov    rdi,rsp
      b611c1:	e8 50 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b611c6:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b611cb:	48 85 ff             	test   rdi,rdi
      b611ce:	74 06                	je     b611d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae176>
      b611d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b611d3:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b611d6:	6a 08                	push   0x8
      b611d8:	5f                   	pop    rdi
      b611d9:	e8 22 cd c8 00       	call   17edf00 <_Znwm@plt>
      b611de:	48 8d 0d 4b 05 cf 00 	lea    rcx,[rip+0xcf054b]        # 1851730 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xde18>
      b611e5:	48 89 08             	mov    QWORD PTR [rax],rcx
      b611e8:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b611ed:	48 89 06             	mov    QWORD PTR [rsi],rax
      b611f0:	48 89 e7             	mov    rdi,rsp
      b611f3:	e8 1e c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b611f8:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b611fd:	48 85 ff             	test   rdi,rdi
      b61200:	74 06                	je     b61208 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae1a8>
      b61202:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61205:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61208:	6a 08                	push   0x8
      b6120a:	5f                   	pop    rdi
      b6120b:	e8 f0 cc c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb611f3; FDE=(11925239, 11936142)
      b611a7:	e8 54 cd c8 00       	call   17edf00 <_Znwm@plt>
      b611ac:	48 8d 0d 5d b8 ce 00 	lea    rcx,[rip+0xceb85d]        # 184ca10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x90f8>
      b611b3:	48 89 08             	mov    QWORD PTR [rax],rcx
      b611b6:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b611bb:	48 89 06             	mov    QWORD PTR [rsi],rax
      b611be:	48 89 e7             	mov    rdi,rsp
      b611c1:	e8 50 c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b611c6:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b611cb:	48 85 ff             	test   rdi,rdi
      b611ce:	74 06                	je     b611d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae176>
      b611d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b611d3:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b611d6:	6a 08                	push   0x8
      b611d8:	5f                   	pop    rdi
      b611d9:	e8 22 cd c8 00       	call   17edf00 <_Znwm@plt>
      b611de:	48 8d 0d 4b 05 cf 00 	lea    rcx,[rip+0xcf054b]        # 1851730 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xde18>
      b611e5:	48 89 08             	mov    QWORD PTR [rax],rcx
      b611e8:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b611ed:	48 89 06             	mov    QWORD PTR [rsi],rax
      b611f0:	48 89 e7             	mov    rdi,rsp
      b611f3:	e8 1e c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b611f8:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b611fd:	48 85 ff             	test   rdi,rdi
      b61200:	74 06                	je     b61208 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae1a8>
      b61202:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61205:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61208:	6a 08                	push   0x8
      b6120a:	5f                   	pop    rdi
      b6120b:	e8 f0 cc c8 00       	call   17edf00 <_Znwm@plt>
      b61210:	48 8d 0d 61 67 ce 00 	lea    rcx,[rip+0xce6761]        # 1847978 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4060>
      b61217:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6121a:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6121f:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61222:	48 89 e7             	mov    rdi,rsp
      b61225:	e8 ec c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6122a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6122f:	48 85 ff             	test   rdi,rdi
      b61232:	74 06                	je     b6123a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae1da>
      b61234:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61237:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6123a:	6a 08                	push   0x8
      b6123c:	5f                   	pop    rdi
      b6123d:	e8 be cc c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61225; FDE=(11925239, 11936142)
      b611d9:	e8 22 cd c8 00       	call   17edf00 <_Znwm@plt>
      b611de:	48 8d 0d 4b 05 cf 00 	lea    rcx,[rip+0xcf054b]        # 1851730 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xde18>
      b611e5:	48 89 08             	mov    QWORD PTR [rax],rcx
      b611e8:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b611ed:	48 89 06             	mov    QWORD PTR [rsi],rax
      b611f0:	48 89 e7             	mov    rdi,rsp
      b611f3:	e8 1e c9 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b611f8:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b611fd:	48 85 ff             	test   rdi,rdi
      b61200:	74 06                	je     b61208 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae1a8>
      b61202:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61205:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61208:	6a 08                	push   0x8
      b6120a:	5f                   	pop    rdi
      b6120b:	e8 f0 cc c8 00       	call   17edf00 <_Znwm@plt>
      b61210:	48 8d 0d 61 67 ce 00 	lea    rcx,[rip+0xce6761]        # 1847978 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4060>
      b61217:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6121a:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6121f:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61222:	48 89 e7             	mov    rdi,rsp
      b61225:	e8 ec c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6122a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6122f:	48 85 ff             	test   rdi,rdi
      b61232:	74 06                	je     b6123a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae1da>
      b61234:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61237:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6123a:	6a 08                	push   0x8
      b6123c:	5f                   	pop    rdi
      b6123d:	e8 be cc c8 00       	call   17edf00 <_Znwm@plt>
      b61242:	48 8d 0d 0f a3 cc 00 	lea    rcx,[rip+0xcca30f]        # 182b558 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7b88>
      b61249:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6124c:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61251:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61254:	48 89 e7             	mov    rdi,rsp
      b61257:	e8 ba c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6125c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61261:	48 85 ff             	test   rdi,rdi
      b61264:	74 06                	je     b6126c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae20c>
      b61266:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61269:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6126c:	6a 08                	push   0x8
      b6126e:	5f                   	pop    rdi
      b6126f:	e8 8c cc c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61257; FDE=(11925239, 11936142)
      b6120b:	e8 f0 cc c8 00       	call   17edf00 <_Znwm@plt>
      b61210:	48 8d 0d 61 67 ce 00 	lea    rcx,[rip+0xce6761]        # 1847978 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4060>
      b61217:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6121a:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6121f:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61222:	48 89 e7             	mov    rdi,rsp
      b61225:	e8 ec c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6122a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6122f:	48 85 ff             	test   rdi,rdi
      b61232:	74 06                	je     b6123a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae1da>
      b61234:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61237:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6123a:	6a 08                	push   0x8
      b6123c:	5f                   	pop    rdi
      b6123d:	e8 be cc c8 00       	call   17edf00 <_Znwm@plt>
      b61242:	48 8d 0d 0f a3 cc 00 	lea    rcx,[rip+0xcca30f]        # 182b558 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7b88>
      b61249:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6124c:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61251:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61254:	48 89 e7             	mov    rdi,rsp
      b61257:	e8 ba c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6125c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61261:	48 85 ff             	test   rdi,rdi
      b61264:	74 06                	je     b6126c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae20c>
      b61266:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61269:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6126c:	6a 08                	push   0x8
      b6126e:	5f                   	pop    rdi
      b6126f:	e8 8c cc c8 00       	call   17edf00 <_Znwm@plt>
      b61274:	48 8d 0d a5 a3 cc 00 	lea    rcx,[rip+0xcca3a5]        # 182b620 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7c50>
      b6127b:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6127e:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61283:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61286:	48 89 e7             	mov    rdi,rsp
      b61289:	e8 88 c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6128e:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61293:	48 85 ff             	test   rdi,rdi
      b61296:	74 06                	je     b6129e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae23e>
      b61298:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6129b:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6129e:	6a 08                	push   0x8
      b612a0:	5f                   	pop    rdi
      b612a1:	e8 5a cc c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61289; FDE=(11925239, 11936142)
      b6123d:	e8 be cc c8 00       	call   17edf00 <_Znwm@plt>
      b61242:	48 8d 0d 0f a3 cc 00 	lea    rcx,[rip+0xcca30f]        # 182b558 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7b88>
      b61249:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6124c:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61251:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61254:	48 89 e7             	mov    rdi,rsp
      b61257:	e8 ba c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6125c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61261:	48 85 ff             	test   rdi,rdi
      b61264:	74 06                	je     b6126c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae20c>
      b61266:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61269:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6126c:	6a 08                	push   0x8
      b6126e:	5f                   	pop    rdi
      b6126f:	e8 8c cc c8 00       	call   17edf00 <_Znwm@plt>
      b61274:	48 8d 0d a5 a3 cc 00 	lea    rcx,[rip+0xcca3a5]        # 182b620 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7c50>
      b6127b:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6127e:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61283:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61286:	48 89 e7             	mov    rdi,rsp
      b61289:	e8 88 c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6128e:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61293:	48 85 ff             	test   rdi,rdi
      b61296:	74 06                	je     b6129e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae23e>
      b61298:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6129b:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6129e:	6a 08                	push   0x8
      b612a0:	5f                   	pop    rdi
      b612a1:	e8 5a cc c8 00       	call   17edf00 <_Znwm@plt>
      b612a6:	48 8d 0d 7b 69 ce 00 	lea    rcx,[rip+0xce697b]        # 1847c28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4310>
      b612ad:	48 89 08             	mov    QWORD PTR [rax],rcx
      b612b0:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b612b5:	48 89 06             	mov    QWORD PTR [rsi],rax
      b612b8:	48 89 e7             	mov    rdi,rsp
      b612bb:	e8 56 c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b612c0:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b612c5:	48 85 ff             	test   rdi,rdi
      b612c8:	74 06                	je     b612d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae270>
      b612ca:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b612cd:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b612d0:	6a 08                	push   0x8
      b612d2:	5f                   	pop    rdi
      b612d3:	e8 28 cc c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb612bb; FDE=(11925239, 11936142)
      b6126f:	e8 8c cc c8 00       	call   17edf00 <_Znwm@plt>
      b61274:	48 8d 0d a5 a3 cc 00 	lea    rcx,[rip+0xcca3a5]        # 182b620 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7c50>
      b6127b:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6127e:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61283:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61286:	48 89 e7             	mov    rdi,rsp
      b61289:	e8 88 c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6128e:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61293:	48 85 ff             	test   rdi,rdi
      b61296:	74 06                	je     b6129e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae23e>
      b61298:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6129b:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6129e:	6a 08                	push   0x8
      b612a0:	5f                   	pop    rdi
      b612a1:	e8 5a cc c8 00       	call   17edf00 <_Znwm@plt>
      b612a6:	48 8d 0d 7b 69 ce 00 	lea    rcx,[rip+0xce697b]        # 1847c28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4310>
      b612ad:	48 89 08             	mov    QWORD PTR [rax],rcx
      b612b0:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b612b5:	48 89 06             	mov    QWORD PTR [rsi],rax
      b612b8:	48 89 e7             	mov    rdi,rsp
      b612bb:	e8 56 c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b612c0:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b612c5:	48 85 ff             	test   rdi,rdi
      b612c8:	74 06                	je     b612d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae270>
      b612ca:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b612cd:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b612d0:	6a 08                	push   0x8
      b612d2:	5f                   	pop    rdi
      b612d3:	e8 28 cc c8 00       	call   17edf00 <_Znwm@plt>
      b612d8:	48 8d 0d 69 68 ce 00 	lea    rcx,[rip+0xce6869]        # 1847b48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4230>
      b612df:	48 89 08             	mov    QWORD PTR [rax],rcx
      b612e2:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b612e7:	48 89 06             	mov    QWORD PTR [rsi],rax
      b612ea:	48 89 e7             	mov    rdi,rsp
      b612ed:	e8 24 c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b612f2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b612f7:	48 85 ff             	test   rdi,rdi
      b612fa:	74 06                	je     b61302 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae2a2>
      b612fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b612ff:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61302:	6a 08                	push   0x8
      b61304:	5f                   	pop    rdi
      b61305:	e8 f6 cb c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb612ed; FDE=(11925239, 11936142)
      b612a1:	e8 5a cc c8 00       	call   17edf00 <_Znwm@plt>
      b612a6:	48 8d 0d 7b 69 ce 00 	lea    rcx,[rip+0xce697b]        # 1847c28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4310>
      b612ad:	48 89 08             	mov    QWORD PTR [rax],rcx
      b612b0:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b612b5:	48 89 06             	mov    QWORD PTR [rsi],rax
      b612b8:	48 89 e7             	mov    rdi,rsp
      b612bb:	e8 56 c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b612c0:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b612c5:	48 85 ff             	test   rdi,rdi
      b612c8:	74 06                	je     b612d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae270>
      b612ca:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b612cd:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b612d0:	6a 08                	push   0x8
      b612d2:	5f                   	pop    rdi
      b612d3:	e8 28 cc c8 00       	call   17edf00 <_Znwm@plt>
      b612d8:	48 8d 0d 69 68 ce 00 	lea    rcx,[rip+0xce6869]        # 1847b48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4230>
      b612df:	48 89 08             	mov    QWORD PTR [rax],rcx
      b612e2:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b612e7:	48 89 06             	mov    QWORD PTR [rsi],rax
      b612ea:	48 89 e7             	mov    rdi,rsp
      b612ed:	e8 24 c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b612f2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b612f7:	48 85 ff             	test   rdi,rdi
      b612fa:	74 06                	je     b61302 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae2a2>
      b612fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b612ff:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61302:	6a 08                	push   0x8
      b61304:	5f                   	pop    rdi
      b61305:	e8 f6 cb c8 00       	call   17edf00 <_Znwm@plt>
      b6130a:	48 8d 0d 67 f0 cc 00 	lea    rcx,[rip+0xccf067]        # 1830378 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2310>
      b61311:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61314:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61319:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6131c:	48 89 e7             	mov    rdi,rsp
      b6131f:	e8 f2 c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61324:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61329:	48 85 ff             	test   rdi,rdi
      b6132c:	74 06                	je     b61334 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae2d4>
      b6132e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61331:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61334:	6a 08                	push   0x8
      b61336:	5f                   	pop    rdi
      b61337:	e8 c4 cb c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6131f; FDE=(11925239, 11936142)
      b612d3:	e8 28 cc c8 00       	call   17edf00 <_Znwm@plt>
      b612d8:	48 8d 0d 69 68 ce 00 	lea    rcx,[rip+0xce6869]        # 1847b48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4230>
      b612df:	48 89 08             	mov    QWORD PTR [rax],rcx
      b612e2:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b612e7:	48 89 06             	mov    QWORD PTR [rsi],rax
      b612ea:	48 89 e7             	mov    rdi,rsp
      b612ed:	e8 24 c8 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b612f2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b612f7:	48 85 ff             	test   rdi,rdi
      b612fa:	74 06                	je     b61302 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae2a2>
      b612fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b612ff:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61302:	6a 08                	push   0x8
      b61304:	5f                   	pop    rdi
      b61305:	e8 f6 cb c8 00       	call   17edf00 <_Znwm@plt>
      b6130a:	48 8d 0d 67 f0 cc 00 	lea    rcx,[rip+0xccf067]        # 1830378 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2310>
      b61311:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61314:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61319:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6131c:	48 89 e7             	mov    rdi,rsp
      b6131f:	e8 f2 c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61324:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61329:	48 85 ff             	test   rdi,rdi
      b6132c:	74 06                	je     b61334 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae2d4>
      b6132e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61331:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61334:	6a 08                	push   0x8
      b61336:	5f                   	pop    rdi
      b61337:	e8 c4 cb c8 00       	call   17edf00 <_Znwm@plt>
      b6133c:	48 8d 0d 2d 6c ce 00 	lea    rcx,[rip+0xce6c2d]        # 1847f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4658>
      b61343:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61346:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6134b:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6134e:	48 89 e7             	mov    rdi,rsp
      b61351:	e8 c0 c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61356:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6135b:	48 85 ff             	test   rdi,rdi
      b6135e:	74 06                	je     b61366 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae306>
      b61360:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61363:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61366:	6a 08                	push   0x8
      b61368:	5f                   	pop    rdi
      b61369:	e8 92 cb c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61351; FDE=(11925239, 11936142)
      b61305:	e8 f6 cb c8 00       	call   17edf00 <_Znwm@plt>
      b6130a:	48 8d 0d 67 f0 cc 00 	lea    rcx,[rip+0xccf067]        # 1830378 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2310>
      b61311:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61314:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61319:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6131c:	48 89 e7             	mov    rdi,rsp
      b6131f:	e8 f2 c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61324:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61329:	48 85 ff             	test   rdi,rdi
      b6132c:	74 06                	je     b61334 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae2d4>
      b6132e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61331:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61334:	6a 08                	push   0x8
      b61336:	5f                   	pop    rdi
      b61337:	e8 c4 cb c8 00       	call   17edf00 <_Znwm@plt>
      b6133c:	48 8d 0d 2d 6c ce 00 	lea    rcx,[rip+0xce6c2d]        # 1847f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4658>
      b61343:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61346:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6134b:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6134e:	48 89 e7             	mov    rdi,rsp
      b61351:	e8 c0 c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61356:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6135b:	48 85 ff             	test   rdi,rdi
      b6135e:	74 06                	je     b61366 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae306>
      b61360:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61363:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61366:	6a 08                	push   0x8
      b61368:	5f                   	pop    rdi
      b61369:	e8 92 cb c8 00       	call   17edf00 <_Znwm@plt>
      b6136e:	48 8d 0d ab fd cc 00 	lea    rcx,[rip+0xccfdab]        # 1831120 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x30b8>
      b61375:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61378:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6137d:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61380:	48 89 e7             	mov    rdi,rsp
      b61383:	e8 8e c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61388:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6138d:	48 85 ff             	test   rdi,rdi
      b61390:	74 06                	je     b61398 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae338>
      b61392:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61395:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61398:	6a 08                	push   0x8
      b6139a:	5f                   	pop    rdi
      b6139b:	e8 60 cb c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61383; FDE=(11925239, 11936142)
      b61337:	e8 c4 cb c8 00       	call   17edf00 <_Znwm@plt>
      b6133c:	48 8d 0d 2d 6c ce 00 	lea    rcx,[rip+0xce6c2d]        # 1847f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4658>
      b61343:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61346:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6134b:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6134e:	48 89 e7             	mov    rdi,rsp
      b61351:	e8 c0 c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61356:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6135b:	48 85 ff             	test   rdi,rdi
      b6135e:	74 06                	je     b61366 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae306>
      b61360:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61363:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61366:	6a 08                	push   0x8
      b61368:	5f                   	pop    rdi
      b61369:	e8 92 cb c8 00       	call   17edf00 <_Znwm@plt>
      b6136e:	48 8d 0d ab fd cc 00 	lea    rcx,[rip+0xccfdab]        # 1831120 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x30b8>
      b61375:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61378:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6137d:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61380:	48 89 e7             	mov    rdi,rsp
      b61383:	e8 8e c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61388:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6138d:	48 85 ff             	test   rdi,rdi
      b61390:	74 06                	je     b61398 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae338>
      b61392:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61395:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61398:	6a 08                	push   0x8
      b6139a:	5f                   	pop    rdi
      b6139b:	e8 60 cb c8 00       	call   17edf00 <_Znwm@plt>
      b613a0:	48 8d 0d d9 f1 cc 00 	lea    rcx,[rip+0xccf1d9]        # 1830580 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2518>
      b613a7:	48 89 08             	mov    QWORD PTR [rax],rcx
      b613aa:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b613af:	48 89 06             	mov    QWORD PTR [rsi],rax
      b613b2:	48 89 e7             	mov    rdi,rsp
      b613b5:	e8 5c c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b613ba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b613bf:	48 85 ff             	test   rdi,rdi
      b613c2:	74 06                	je     b613ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae36a>
      b613c4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b613c7:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b613ca:	6a 08                	push   0x8
      b613cc:	5f                   	pop    rdi
      b613cd:	e8 2e cb c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb613b5; FDE=(11925239, 11936142)
      b61369:	e8 92 cb c8 00       	call   17edf00 <_Znwm@plt>
      b6136e:	48 8d 0d ab fd cc 00 	lea    rcx,[rip+0xccfdab]        # 1831120 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x30b8>
      b61375:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61378:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6137d:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61380:	48 89 e7             	mov    rdi,rsp
      b61383:	e8 8e c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61388:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6138d:	48 85 ff             	test   rdi,rdi
      b61390:	74 06                	je     b61398 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae338>
      b61392:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61395:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61398:	6a 08                	push   0x8
      b6139a:	5f                   	pop    rdi
      b6139b:	e8 60 cb c8 00       	call   17edf00 <_Znwm@plt>
      b613a0:	48 8d 0d d9 f1 cc 00 	lea    rcx,[rip+0xccf1d9]        # 1830580 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2518>
      b613a7:	48 89 08             	mov    QWORD PTR [rax],rcx
      b613aa:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b613af:	48 89 06             	mov    QWORD PTR [rsi],rax
      b613b2:	48 89 e7             	mov    rdi,rsp
      b613b5:	e8 5c c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b613ba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b613bf:	48 85 ff             	test   rdi,rdi
      b613c2:	74 06                	je     b613ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae36a>
      b613c4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b613c7:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b613ca:	6a 08                	push   0x8
      b613cc:	5f                   	pop    rdi
      b613cd:	e8 2e cb c8 00       	call   17edf00 <_Znwm@plt>
      b613d2:	48 8d 0d 67 f1 cc 00 	lea    rcx,[rip+0xccf167]        # 1830540 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x24d8>
      b613d9:	48 89 08             	mov    QWORD PTR [rax],rcx
      b613dc:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b613e1:	48 89 06             	mov    QWORD PTR [rsi],rax
      b613e4:	48 89 e7             	mov    rdi,rsp
      b613e7:	e8 2a c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b613ec:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b613f1:	48 85 ff             	test   rdi,rdi
      b613f4:	74 06                	je     b613fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae39c>
      b613f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b613f9:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b613fc:	6a 08                	push   0x8
      b613fe:	5f                   	pop    rdi
      b613ff:	e8 fc ca c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb613e7; FDE=(11925239, 11936142)
      b6139b:	e8 60 cb c8 00       	call   17edf00 <_Znwm@plt>
      b613a0:	48 8d 0d d9 f1 cc 00 	lea    rcx,[rip+0xccf1d9]        # 1830580 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2518>
      b613a7:	48 89 08             	mov    QWORD PTR [rax],rcx
      b613aa:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b613af:	48 89 06             	mov    QWORD PTR [rsi],rax
      b613b2:	48 89 e7             	mov    rdi,rsp
      b613b5:	e8 5c c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b613ba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b613bf:	48 85 ff             	test   rdi,rdi
      b613c2:	74 06                	je     b613ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae36a>
      b613c4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b613c7:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b613ca:	6a 08                	push   0x8
      b613cc:	5f                   	pop    rdi
      b613cd:	e8 2e cb c8 00       	call   17edf00 <_Znwm@plt>
      b613d2:	48 8d 0d 67 f1 cc 00 	lea    rcx,[rip+0xccf167]        # 1830540 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x24d8>
      b613d9:	48 89 08             	mov    QWORD PTR [rax],rcx
      b613dc:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b613e1:	48 89 06             	mov    QWORD PTR [rsi],rax
      b613e4:	48 89 e7             	mov    rdi,rsp
      b613e7:	e8 2a c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b613ec:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b613f1:	48 85 ff             	test   rdi,rdi
      b613f4:	74 06                	je     b613fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae39c>
      b613f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b613f9:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b613fc:	6a 08                	push   0x8
      b613fe:	5f                   	pop    rdi
      b613ff:	e8 fc ca c8 00       	call   17edf00 <_Znwm@plt>
      b61404:	48 8d 0d b5 32 cb 00 	lea    rcx,[rip+0xcb32b5]        # 18146c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa380>
      b6140b:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6140e:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61413:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61416:	48 89 e7             	mov    rdi,rsp
      b61419:	e8 f8 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6141e:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61423:	48 85 ff             	test   rdi,rdi
      b61426:	74 06                	je     b6142e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae3ce>
      b61428:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6142b:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6142e:	6a 08                	push   0x8
      b61430:	5f                   	pop    rdi
      b61431:	e8 ca ca c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61419; FDE=(11925239, 11936142)
      b613cd:	e8 2e cb c8 00       	call   17edf00 <_Znwm@plt>
      b613d2:	48 8d 0d 67 f1 cc 00 	lea    rcx,[rip+0xccf167]        # 1830540 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x24d8>
      b613d9:	48 89 08             	mov    QWORD PTR [rax],rcx
      b613dc:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b613e1:	48 89 06             	mov    QWORD PTR [rsi],rax
      b613e4:	48 89 e7             	mov    rdi,rsp
      b613e7:	e8 2a c7 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b613ec:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b613f1:	48 85 ff             	test   rdi,rdi
      b613f4:	74 06                	je     b613fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae39c>
      b613f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b613f9:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b613fc:	6a 08                	push   0x8
      b613fe:	5f                   	pop    rdi
      b613ff:	e8 fc ca c8 00       	call   17edf00 <_Znwm@plt>
      b61404:	48 8d 0d b5 32 cb 00 	lea    rcx,[rip+0xcb32b5]        # 18146c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa380>
      b6140b:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6140e:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61413:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61416:	48 89 e7             	mov    rdi,rsp
      b61419:	e8 f8 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6141e:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61423:	48 85 ff             	test   rdi,rdi
      b61426:	74 06                	je     b6142e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae3ce>
      b61428:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6142b:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6142e:	6a 08                	push   0x8
      b61430:	5f                   	pop    rdi
      b61431:	e8 ca ca c8 00       	call   17edf00 <_Znwm@plt>
      b61436:	48 8d 0d f3 fd cc 00 	lea    rcx,[rip+0xccfdf3]        # 1831230 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x31c8>
      b6143d:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61440:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61445:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61448:	48 89 e7             	mov    rdi,rsp
      b6144b:	e8 c6 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61450:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61455:	48 85 ff             	test   rdi,rdi
      b61458:	74 06                	je     b61460 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae400>
      b6145a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6145d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61460:	6a 08                	push   0x8
      b61462:	5f                   	pop    rdi
      b61463:	e8 98 ca c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6144b; FDE=(11925239, 11936142)
      b613ff:	e8 fc ca c8 00       	call   17edf00 <_Znwm@plt>
      b61404:	48 8d 0d b5 32 cb 00 	lea    rcx,[rip+0xcb32b5]        # 18146c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa380>
      b6140b:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6140e:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61413:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61416:	48 89 e7             	mov    rdi,rsp
      b61419:	e8 f8 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6141e:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61423:	48 85 ff             	test   rdi,rdi
      b61426:	74 06                	je     b6142e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae3ce>
      b61428:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6142b:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6142e:	6a 08                	push   0x8
      b61430:	5f                   	pop    rdi
      b61431:	e8 ca ca c8 00       	call   17edf00 <_Znwm@plt>
      b61436:	48 8d 0d f3 fd cc 00 	lea    rcx,[rip+0xccfdf3]        # 1831230 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x31c8>
      b6143d:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61440:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61445:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61448:	48 89 e7             	mov    rdi,rsp
      b6144b:	e8 c6 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61450:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61455:	48 85 ff             	test   rdi,rdi
      b61458:	74 06                	je     b61460 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae400>
      b6145a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6145d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61460:	6a 08                	push   0x8
      b61462:	5f                   	pop    rdi
      b61463:	e8 98 ca c8 00       	call   17edf00 <_Znwm@plt>
      b61468:	48 8d 0d b9 92 ce 00 	lea    rcx,[rip+0xce92b9]        # 184a728 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6e10>
      b6146f:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61472:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61477:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6147a:	48 89 e7             	mov    rdi,rsp
      b6147d:	e8 94 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61482:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61487:	48 85 ff             	test   rdi,rdi
      b6148a:	74 06                	je     b61492 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae432>
      b6148c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6148f:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61492:	6a 08                	push   0x8
      b61494:	5f                   	pop    rdi
      b61495:	e8 66 ca c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6147d; FDE=(11925239, 11936142)
      b61431:	e8 ca ca c8 00       	call   17edf00 <_Znwm@plt>
      b61436:	48 8d 0d f3 fd cc 00 	lea    rcx,[rip+0xccfdf3]        # 1831230 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x31c8>
      b6143d:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61440:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61445:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61448:	48 89 e7             	mov    rdi,rsp
      b6144b:	e8 c6 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61450:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61455:	48 85 ff             	test   rdi,rdi
      b61458:	74 06                	je     b61460 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae400>
      b6145a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6145d:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61460:	6a 08                	push   0x8
      b61462:	5f                   	pop    rdi
      b61463:	e8 98 ca c8 00       	call   17edf00 <_Znwm@plt>
      b61468:	48 8d 0d b9 92 ce 00 	lea    rcx,[rip+0xce92b9]        # 184a728 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6e10>
      b6146f:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61472:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61477:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6147a:	48 89 e7             	mov    rdi,rsp
      b6147d:	e8 94 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61482:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61487:	48 85 ff             	test   rdi,rdi
      b6148a:	74 06                	je     b61492 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae432>
      b6148c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6148f:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61492:	6a 08                	push   0x8
      b61494:	5f                   	pop    rdi
      b61495:	e8 66 ca c8 00       	call   17edf00 <_Znwm@plt>
      b6149a:	48 8d 0d cf f4 cc 00 	lea    rcx,[rip+0xccf4cf]        # 1830970 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2908>
      b614a1:	48 89 08             	mov    QWORD PTR [rax],rcx
      b614a4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b614a9:	48 89 06             	mov    QWORD PTR [rsi],rax
      b614ac:	48 89 e7             	mov    rdi,rsp
      b614af:	e8 62 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b614b4:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b614b9:	48 85 ff             	test   rdi,rdi
      b614bc:	74 06                	je     b614c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae464>
      b614be:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b614c1:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b614c4:	6a 08                	push   0x8
      b614c6:	5f                   	pop    rdi
      b614c7:	e8 34 ca c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb614af; FDE=(11925239, 11936142)
      b61463:	e8 98 ca c8 00       	call   17edf00 <_Znwm@plt>
      b61468:	48 8d 0d b9 92 ce 00 	lea    rcx,[rip+0xce92b9]        # 184a728 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6e10>
      b6146f:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61472:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61477:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6147a:	48 89 e7             	mov    rdi,rsp
      b6147d:	e8 94 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61482:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61487:	48 85 ff             	test   rdi,rdi
      b6148a:	74 06                	je     b61492 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae432>
      b6148c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6148f:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61492:	6a 08                	push   0x8
      b61494:	5f                   	pop    rdi
      b61495:	e8 66 ca c8 00       	call   17edf00 <_Znwm@plt>
      b6149a:	48 8d 0d cf f4 cc 00 	lea    rcx,[rip+0xccf4cf]        # 1830970 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2908>
      b614a1:	48 89 08             	mov    QWORD PTR [rax],rcx
      b614a4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b614a9:	48 89 06             	mov    QWORD PTR [rsi],rax
      b614ac:	48 89 e7             	mov    rdi,rsp
      b614af:	e8 62 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b614b4:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b614b9:	48 85 ff             	test   rdi,rdi
      b614bc:	74 06                	je     b614c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae464>
      b614be:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b614c1:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b614c4:	6a 08                	push   0x8
      b614c6:	5f                   	pop    rdi
      b614c7:	e8 34 ca c8 00       	call   17edf00 <_Znwm@plt>
      b614cc:	48 8d 0d d5 f6 cc 00 	lea    rcx,[rip+0xccf6d5]        # 1830ba8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2b40>
      b614d3:	48 89 08             	mov    QWORD PTR [rax],rcx
      b614d6:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b614db:	48 89 06             	mov    QWORD PTR [rsi],rax
      b614de:	48 89 e7             	mov    rdi,rsp
      b614e1:	e8 30 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b614e6:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b614eb:	48 85 ff             	test   rdi,rdi
      b614ee:	74 06                	je     b614f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae496>
      b614f0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b614f3:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b614f6:	6a 08                	push   0x8
      b614f8:	5f                   	pop    rdi
      b614f9:	e8 02 ca c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb614e1; FDE=(11925239, 11936142)
      b61495:	e8 66 ca c8 00       	call   17edf00 <_Znwm@plt>
      b6149a:	48 8d 0d cf f4 cc 00 	lea    rcx,[rip+0xccf4cf]        # 1830970 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2908>
      b614a1:	48 89 08             	mov    QWORD PTR [rax],rcx
      b614a4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b614a9:	48 89 06             	mov    QWORD PTR [rsi],rax
      b614ac:	48 89 e7             	mov    rdi,rsp
      b614af:	e8 62 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b614b4:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b614b9:	48 85 ff             	test   rdi,rdi
      b614bc:	74 06                	je     b614c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae464>
      b614be:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b614c1:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b614c4:	6a 08                	push   0x8
      b614c6:	5f                   	pop    rdi
      b614c7:	e8 34 ca c8 00       	call   17edf00 <_Znwm@plt>
      b614cc:	48 8d 0d d5 f6 cc 00 	lea    rcx,[rip+0xccf6d5]        # 1830ba8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2b40>
      b614d3:	48 89 08             	mov    QWORD PTR [rax],rcx
      b614d6:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b614db:	48 89 06             	mov    QWORD PTR [rsi],rax
      b614de:	48 89 e7             	mov    rdi,rsp
      b614e1:	e8 30 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b614e6:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b614eb:	48 85 ff             	test   rdi,rdi
      b614ee:	74 06                	je     b614f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae496>
      b614f0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b614f3:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b614f6:	6a 08                	push   0x8
      b614f8:	5f                   	pop    rdi
      b614f9:	e8 02 ca c8 00       	call   17edf00 <_Znwm@plt>
      b614fe:	48 8d 0d e3 7c ce 00 	lea    rcx,[rip+0xce7ce3]        # 18491e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x58d0>
      b61505:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61508:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6150d:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61510:	48 89 e7             	mov    rdi,rsp
      b61513:	e8 fe c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61518:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6151d:	48 85 ff             	test   rdi,rdi
      b61520:	74 06                	je     b61528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae4c8>
      b61522:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61525:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61528:	6a 08                	push   0x8
      b6152a:	5f                   	pop    rdi
      b6152b:	e8 d0 c9 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61513; FDE=(11925239, 11936142)
      b614c7:	e8 34 ca c8 00       	call   17edf00 <_Znwm@plt>
      b614cc:	48 8d 0d d5 f6 cc 00 	lea    rcx,[rip+0xccf6d5]        # 1830ba8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2b40>
      b614d3:	48 89 08             	mov    QWORD PTR [rax],rcx
      b614d6:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b614db:	48 89 06             	mov    QWORD PTR [rsi],rax
      b614de:	48 89 e7             	mov    rdi,rsp
      b614e1:	e8 30 c6 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b614e6:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b614eb:	48 85 ff             	test   rdi,rdi
      b614ee:	74 06                	je     b614f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae496>
      b614f0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b614f3:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b614f6:	6a 08                	push   0x8
      b614f8:	5f                   	pop    rdi
      b614f9:	e8 02 ca c8 00       	call   17edf00 <_Znwm@plt>
      b614fe:	48 8d 0d e3 7c ce 00 	lea    rcx,[rip+0xce7ce3]        # 18491e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x58d0>
      b61505:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61508:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6150d:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61510:	48 89 e7             	mov    rdi,rsp
      b61513:	e8 fe c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61518:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6151d:	48 85 ff             	test   rdi,rdi
      b61520:	74 06                	je     b61528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae4c8>
      b61522:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61525:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61528:	6a 08                	push   0x8
      b6152a:	5f                   	pop    rdi
      b6152b:	e8 d0 c9 c8 00       	call   17edf00 <_Znwm@plt>
      b61530:	48 8d 0d a1 9f cc 00 	lea    rcx,[rip+0xcc9fa1]        # 182b4d8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7b08>
      b61537:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6153a:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6153f:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61542:	48 89 e7             	mov    rdi,rsp
      b61545:	e8 cc c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6154a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6154f:	48 85 ff             	test   rdi,rdi
      b61552:	74 06                	je     b6155a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae4fa>
      b61554:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61557:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6155a:	6a 08                	push   0x8
      b6155c:	5f                   	pop    rdi
      b6155d:	e8 9e c9 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61545; FDE=(11925239, 11936142)
      b614f9:	e8 02 ca c8 00       	call   17edf00 <_Znwm@plt>
      b614fe:	48 8d 0d e3 7c ce 00 	lea    rcx,[rip+0xce7ce3]        # 18491e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x58d0>
      b61505:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61508:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6150d:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61510:	48 89 e7             	mov    rdi,rsp
      b61513:	e8 fe c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61518:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6151d:	48 85 ff             	test   rdi,rdi
      b61520:	74 06                	je     b61528 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae4c8>
      b61522:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61525:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61528:	6a 08                	push   0x8
      b6152a:	5f                   	pop    rdi
      b6152b:	e8 d0 c9 c8 00       	call   17edf00 <_Znwm@plt>
      b61530:	48 8d 0d a1 9f cc 00 	lea    rcx,[rip+0xcc9fa1]        # 182b4d8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7b08>
      b61537:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6153a:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6153f:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61542:	48 89 e7             	mov    rdi,rsp
      b61545:	e8 cc c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6154a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6154f:	48 85 ff             	test   rdi,rdi
      b61552:	74 06                	je     b6155a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae4fa>
      b61554:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61557:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6155a:	6a 08                	push   0x8
      b6155c:	5f                   	pop    rdi
      b6155d:	e8 9e c9 c8 00       	call   17edf00 <_Znwm@plt>
      b61562:	48 8d 0d d7 f4 cf 00 	lea    rcx,[rip+0xcff4d7]        # 1860a40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d128>
      b61569:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6156c:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61571:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61574:	48 89 e7             	mov    rdi,rsp
      b61577:	e8 9a c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6157c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61581:	48 85 ff             	test   rdi,rdi
      b61584:	74 06                	je     b6158c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae52c>
      b61586:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61589:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6158c:	6a 08                	push   0x8
      b6158e:	5f                   	pop    rdi
      b6158f:	e8 6c c9 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61577; FDE=(11925239, 11936142)
      b6152b:	e8 d0 c9 c8 00       	call   17edf00 <_Znwm@plt>
      b61530:	48 8d 0d a1 9f cc 00 	lea    rcx,[rip+0xcc9fa1]        # 182b4d8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7b08>
      b61537:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6153a:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6153f:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61542:	48 89 e7             	mov    rdi,rsp
      b61545:	e8 cc c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6154a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6154f:	48 85 ff             	test   rdi,rdi
      b61552:	74 06                	je     b6155a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae4fa>
      b61554:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61557:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6155a:	6a 08                	push   0x8
      b6155c:	5f                   	pop    rdi
      b6155d:	e8 9e c9 c8 00       	call   17edf00 <_Znwm@plt>
      b61562:	48 8d 0d d7 f4 cf 00 	lea    rcx,[rip+0xcff4d7]        # 1860a40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d128>
      b61569:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6156c:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61571:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61574:	48 89 e7             	mov    rdi,rsp
      b61577:	e8 9a c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6157c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61581:	48 85 ff             	test   rdi,rdi
      b61584:	74 06                	je     b6158c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae52c>
      b61586:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61589:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6158c:	6a 08                	push   0x8
      b6158e:	5f                   	pop    rdi
      b6158f:	e8 6c c9 c8 00       	call   17edf00 <_Znwm@plt>
      b61594:	48 8d 0d cd fd cf 00 	lea    rcx,[rip+0xcffdcd]        # 1861368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1da50>
      b6159b:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6159e:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b615a3:	48 89 06             	mov    QWORD PTR [rsi],rax
      b615a6:	48 89 e7             	mov    rdi,rsp
      b615a9:	e8 68 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b615ae:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b615b3:	48 85 ff             	test   rdi,rdi
      b615b6:	74 06                	je     b615be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae55e>
      b615b8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b615bb:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b615be:	6a 08                	push   0x8
      b615c0:	5f                   	pop    rdi
      b615c1:	e8 3a c9 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb615a9; FDE=(11925239, 11936142)
      b6155d:	e8 9e c9 c8 00       	call   17edf00 <_Znwm@plt>
      b61562:	48 8d 0d d7 f4 cf 00 	lea    rcx,[rip+0xcff4d7]        # 1860a40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d128>
      b61569:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6156c:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61571:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61574:	48 89 e7             	mov    rdi,rsp
      b61577:	e8 9a c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6157c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61581:	48 85 ff             	test   rdi,rdi
      b61584:	74 06                	je     b6158c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae52c>
      b61586:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61589:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6158c:	6a 08                	push   0x8
      b6158e:	5f                   	pop    rdi
      b6158f:	e8 6c c9 c8 00       	call   17edf00 <_Znwm@plt>
      b61594:	48 8d 0d cd fd cf 00 	lea    rcx,[rip+0xcffdcd]        # 1861368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1da50>
      b6159b:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6159e:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b615a3:	48 89 06             	mov    QWORD PTR [rsi],rax
      b615a6:	48 89 e7             	mov    rdi,rsp
      b615a9:	e8 68 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b615ae:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b615b3:	48 85 ff             	test   rdi,rdi
      b615b6:	74 06                	je     b615be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae55e>
      b615b8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b615bb:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b615be:	6a 08                	push   0x8
      b615c0:	5f                   	pop    rdi
      b615c1:	e8 3a c9 c8 00       	call   17edf00 <_Znwm@plt>
      b615c6:	48 8d 0d f3 ed cf 00 	lea    rcx,[rip+0xcfedf3]        # 18603c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1caa8>
      b615cd:	48 89 08             	mov    QWORD PTR [rax],rcx
      b615d0:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b615d5:	48 89 06             	mov    QWORD PTR [rsi],rax
      b615d8:	48 89 e7             	mov    rdi,rsp
      b615db:	e8 36 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b615e0:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b615e5:	48 85 ff             	test   rdi,rdi
      b615e8:	74 06                	je     b615f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae590>
      b615ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b615ed:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b615f0:	6a 08                	push   0x8
      b615f2:	5f                   	pop    rdi
      b615f3:	e8 08 c9 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb615db; FDE=(11925239, 11936142)
      b6158f:	e8 6c c9 c8 00       	call   17edf00 <_Znwm@plt>
      b61594:	48 8d 0d cd fd cf 00 	lea    rcx,[rip+0xcffdcd]        # 1861368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1da50>
      b6159b:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6159e:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b615a3:	48 89 06             	mov    QWORD PTR [rsi],rax
      b615a6:	48 89 e7             	mov    rdi,rsp
      b615a9:	e8 68 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b615ae:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b615b3:	48 85 ff             	test   rdi,rdi
      b615b6:	74 06                	je     b615be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae55e>
      b615b8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b615bb:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b615be:	6a 08                	push   0x8
      b615c0:	5f                   	pop    rdi
      b615c1:	e8 3a c9 c8 00       	call   17edf00 <_Znwm@plt>
      b615c6:	48 8d 0d f3 ed cf 00 	lea    rcx,[rip+0xcfedf3]        # 18603c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1caa8>
      b615cd:	48 89 08             	mov    QWORD PTR [rax],rcx
      b615d0:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b615d5:	48 89 06             	mov    QWORD PTR [rsi],rax
      b615d8:	48 89 e7             	mov    rdi,rsp
      b615db:	e8 36 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b615e0:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b615e5:	48 85 ff             	test   rdi,rdi
      b615e8:	74 06                	je     b615f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae590>
      b615ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b615ed:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b615f0:	6a 08                	push   0x8
      b615f2:	5f                   	pop    rdi
      b615f3:	e8 08 c9 c8 00       	call   17edf00 <_Znwm@plt>
      b615f8:	48 8d 0d 31 09 d1 00 	lea    rcx,[rip+0xd10931]        # 1871f30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e618>
      b615ff:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61602:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61607:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6160a:	48 89 e7             	mov    rdi,rsp
      b6160d:	e8 04 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61612:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61617:	48 85 ff             	test   rdi,rdi
      b6161a:	74 06                	je     b61622 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae5c2>
      b6161c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6161f:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61622:	40 84 ed             	test   bpl,bpl
      b61625:	74 64                	je     b6168b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae62b>
      b61627:	6a 08                	push   0x8

### call 0xb6160d; FDE=(11925239, 11936142)
      b615c1:	e8 3a c9 c8 00       	call   17edf00 <_Znwm@plt>
      b615c6:	48 8d 0d f3 ed cf 00 	lea    rcx,[rip+0xcfedf3]        # 18603c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1caa8>
      b615cd:	48 89 08             	mov    QWORD PTR [rax],rcx
      b615d0:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b615d5:	48 89 06             	mov    QWORD PTR [rsi],rax
      b615d8:	48 89 e7             	mov    rdi,rsp
      b615db:	e8 36 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b615e0:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b615e5:	48 85 ff             	test   rdi,rdi
      b615e8:	74 06                	je     b615f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae590>
      b615ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b615ed:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b615f0:	6a 08                	push   0x8
      b615f2:	5f                   	pop    rdi
      b615f3:	e8 08 c9 c8 00       	call   17edf00 <_Znwm@plt>
      b615f8:	48 8d 0d 31 09 d1 00 	lea    rcx,[rip+0xd10931]        # 1871f30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e618>
      b615ff:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61602:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61607:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6160a:	48 89 e7             	mov    rdi,rsp
      b6160d:	e8 04 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61612:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61617:	48 85 ff             	test   rdi,rdi
      b6161a:	74 06                	je     b61622 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae5c2>
      b6161c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6161f:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61622:	40 84 ed             	test   bpl,bpl
      b61625:	74 64                	je     b6168b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae62b>
      b61627:	6a 08                	push   0x8
      b61629:	5f                   	pop    rdi
      b6162a:	e8 d1 c8 c8 00       	call   17edf00 <_Znwm@plt>
      b6162f:	48 8d 0d 9a a2 cf 00 	lea    rcx,[rip+0xcfa29a]        # 185b8d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17fb8>
      b61636:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61639:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6163e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61641:	48 89 e7             	mov    rdi,rsp
      b61644:	e8 cd c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61649:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6164e:	48 85 ff             	test   rdi,rdi
      b61651:	74 06                	je     b61659 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae5f9>
      b61653:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61656:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61659:	6a 08                	push   0x8

### call 0xb61644; FDE=(11925239, 11936142)
      b615ff:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61602:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61607:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6160a:	48 89 e7             	mov    rdi,rsp
      b6160d:	e8 04 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61612:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61617:	48 85 ff             	test   rdi,rdi
      b6161a:	74 06                	je     b61622 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae5c2>
      b6161c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6161f:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61622:	40 84 ed             	test   bpl,bpl
      b61625:	74 64                	je     b6168b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae62b>
      b61627:	6a 08                	push   0x8
      b61629:	5f                   	pop    rdi
      b6162a:	e8 d1 c8 c8 00       	call   17edf00 <_Znwm@plt>
      b6162f:	48 8d 0d 9a a2 cf 00 	lea    rcx,[rip+0xcfa29a]        # 185b8d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17fb8>
      b61636:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61639:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6163e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61641:	48 89 e7             	mov    rdi,rsp
      b61644:	e8 cd c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61649:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6164e:	48 85 ff             	test   rdi,rdi
      b61651:	74 06                	je     b61659 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae5f9>
      b61653:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61656:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61659:	6a 08                	push   0x8
      b6165b:	5f                   	pop    rdi
      b6165c:	e8 9f c8 c8 00       	call   17edf00 <_Znwm@plt>
      b61661:	48 8d 0d e0 a0 cb 00 	lea    rcx,[rip+0xcba0e0]        # 181b748 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11408>
      b61668:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6166b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61670:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61673:	48 89 e7             	mov    rdi,rsp
      b61676:	e8 9b c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6167b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61680:	48 85 ff             	test   rdi,rdi
      b61683:	74 06                	je     b6168b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae62b>
      b61685:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61688:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6168b:	6a 08                	push   0x8
      b6168d:	5f                   	pop    rdi
      b6168e:	e8 6d c8 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61676; FDE=(11925239, 11936142)
      b6162a:	e8 d1 c8 c8 00       	call   17edf00 <_Znwm@plt>
      b6162f:	48 8d 0d 9a a2 cf 00 	lea    rcx,[rip+0xcfa29a]        # 185b8d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17fb8>
      b61636:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61639:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6163e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61641:	48 89 e7             	mov    rdi,rsp
      b61644:	e8 cd c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61649:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6164e:	48 85 ff             	test   rdi,rdi
      b61651:	74 06                	je     b61659 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae5f9>
      b61653:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61656:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61659:	6a 08                	push   0x8
      b6165b:	5f                   	pop    rdi
      b6165c:	e8 9f c8 c8 00       	call   17edf00 <_Znwm@plt>
      b61661:	48 8d 0d e0 a0 cb 00 	lea    rcx,[rip+0xcba0e0]        # 181b748 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11408>
      b61668:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6166b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61670:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61673:	48 89 e7             	mov    rdi,rsp
      b61676:	e8 9b c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6167b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61680:	48 85 ff             	test   rdi,rdi
      b61683:	74 06                	je     b6168b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae62b>
      b61685:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61688:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6168b:	6a 08                	push   0x8
      b6168d:	5f                   	pop    rdi
      b6168e:	e8 6d c8 c8 00       	call   17edf00 <_Znwm@plt>
      b61693:	48 8d 0d 46 9f cc 00 	lea    rcx,[rip+0xcc9f46]        # 182b5e0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7c10>
      b6169a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6169d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b616a2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b616a5:	48 89 e7             	mov    rdi,rsp
      b616a8:	e8 69 c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b616ad:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b616b2:	48 85 ff             	test   rdi,rdi
      b616b5:	74 06                	je     b616bd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae65d>
      b616b7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b616ba:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b616bd:	6a 08                	push   0x8
      b616bf:	5f                   	pop    rdi
      b616c0:	e8 3b c8 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb616a8; FDE=(11925239, 11936142)
      b6165c:	e8 9f c8 c8 00       	call   17edf00 <_Znwm@plt>
      b61661:	48 8d 0d e0 a0 cb 00 	lea    rcx,[rip+0xcba0e0]        # 181b748 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11408>
      b61668:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6166b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61670:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61673:	48 89 e7             	mov    rdi,rsp
      b61676:	e8 9b c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6167b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61680:	48 85 ff             	test   rdi,rdi
      b61683:	74 06                	je     b6168b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae62b>
      b61685:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61688:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6168b:	6a 08                	push   0x8
      b6168d:	5f                   	pop    rdi
      b6168e:	e8 6d c8 c8 00       	call   17edf00 <_Znwm@plt>
      b61693:	48 8d 0d 46 9f cc 00 	lea    rcx,[rip+0xcc9f46]        # 182b5e0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7c10>
      b6169a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6169d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b616a2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b616a5:	48 89 e7             	mov    rdi,rsp
      b616a8:	e8 69 c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b616ad:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b616b2:	48 85 ff             	test   rdi,rdi
      b616b5:	74 06                	je     b616bd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae65d>
      b616b7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b616ba:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b616bd:	6a 08                	push   0x8
      b616bf:	5f                   	pop    rdi
      b616c0:	e8 3b c8 c8 00       	call   17edf00 <_Znwm@plt>
      b616c5:	48 8d 0d c4 02 cf 00 	lea    rcx,[rip+0xcf02c4]        # 1851990 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe078>
      b616cc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b616cf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b616d4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b616d7:	48 89 e7             	mov    rdi,rsp
      b616da:	e8 37 c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b616df:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b616e4:	48 85 ff             	test   rdi,rdi
      b616e7:	74 06                	je     b616ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae68f>
      b616e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b616ec:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b616ef:	6a 08                	push   0x8
      b616f1:	5f                   	pop    rdi
      b616f2:	e8 09 c8 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb616da; FDE=(11925239, 11936142)
      b6168e:	e8 6d c8 c8 00       	call   17edf00 <_Znwm@plt>
      b61693:	48 8d 0d 46 9f cc 00 	lea    rcx,[rip+0xcc9f46]        # 182b5e0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7c10>
      b6169a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6169d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b616a2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b616a5:	48 89 e7             	mov    rdi,rsp
      b616a8:	e8 69 c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b616ad:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b616b2:	48 85 ff             	test   rdi,rdi
      b616b5:	74 06                	je     b616bd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae65d>
      b616b7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b616ba:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b616bd:	6a 08                	push   0x8
      b616bf:	5f                   	pop    rdi
      b616c0:	e8 3b c8 c8 00       	call   17edf00 <_Znwm@plt>
      b616c5:	48 8d 0d c4 02 cf 00 	lea    rcx,[rip+0xcf02c4]        # 1851990 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe078>
      b616cc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b616cf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b616d4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b616d7:	48 89 e7             	mov    rdi,rsp
      b616da:	e8 37 c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b616df:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b616e4:	48 85 ff             	test   rdi,rdi
      b616e7:	74 06                	je     b616ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae68f>
      b616e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b616ec:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b616ef:	6a 08                	push   0x8
      b616f1:	5f                   	pop    rdi
      b616f2:	e8 09 c8 c8 00       	call   17edf00 <_Znwm@plt>
      b616f7:	48 8d 0d 9a 03 cf 00 	lea    rcx,[rip+0xcf039a]        # 1851a98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe180>
      b616fe:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61701:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61706:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61709:	48 89 e7             	mov    rdi,rsp
      b6170c:	e8 05 c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61711:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61716:	48 85 ff             	test   rdi,rdi
      b61719:	74 06                	je     b61721 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae6c1>
      b6171b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6171e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61721:	6a 08                	push   0x8
      b61723:	5f                   	pop    rdi
      b61724:	e8 d7 c7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6170c; FDE=(11925239, 11936142)
      b616c0:	e8 3b c8 c8 00       	call   17edf00 <_Znwm@plt>
      b616c5:	48 8d 0d c4 02 cf 00 	lea    rcx,[rip+0xcf02c4]        # 1851990 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe078>
      b616cc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b616cf:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b616d4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b616d7:	48 89 e7             	mov    rdi,rsp
      b616da:	e8 37 c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b616df:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b616e4:	48 85 ff             	test   rdi,rdi
      b616e7:	74 06                	je     b616ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae68f>
      b616e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b616ec:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b616ef:	6a 08                	push   0x8
      b616f1:	5f                   	pop    rdi
      b616f2:	e8 09 c8 c8 00       	call   17edf00 <_Znwm@plt>
      b616f7:	48 8d 0d 9a 03 cf 00 	lea    rcx,[rip+0xcf039a]        # 1851a98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe180>
      b616fe:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61701:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61706:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61709:	48 89 e7             	mov    rdi,rsp
      b6170c:	e8 05 c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61711:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61716:	48 85 ff             	test   rdi,rdi
      b61719:	74 06                	je     b61721 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae6c1>
      b6171b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6171e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61721:	6a 08                	push   0x8
      b61723:	5f                   	pop    rdi
      b61724:	e8 d7 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b61729:	48 8d 0d c0 9e ce 00 	lea    rcx,[rip+0xce9ec0]        # 184b5f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7cd8>
      b61730:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61733:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61738:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6173b:	48 89 e7             	mov    rdi,rsp
      b6173e:	e8 d3 c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61743:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61748:	48 85 ff             	test   rdi,rdi
      b6174b:	74 06                	je     b61753 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae6f3>
      b6174d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61750:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61753:	6a 08                	push   0x8
      b61755:	5f                   	pop    rdi
      b61756:	e8 a5 c7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6173e; FDE=(11925239, 11936142)
      b616f2:	e8 09 c8 c8 00       	call   17edf00 <_Znwm@plt>
      b616f7:	48 8d 0d 9a 03 cf 00 	lea    rcx,[rip+0xcf039a]        # 1851a98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe180>
      b616fe:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61701:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61706:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61709:	48 89 e7             	mov    rdi,rsp
      b6170c:	e8 05 c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61711:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61716:	48 85 ff             	test   rdi,rdi
      b61719:	74 06                	je     b61721 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae6c1>
      b6171b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6171e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61721:	6a 08                	push   0x8
      b61723:	5f                   	pop    rdi
      b61724:	e8 d7 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b61729:	48 8d 0d c0 9e ce 00 	lea    rcx,[rip+0xce9ec0]        # 184b5f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7cd8>
      b61730:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61733:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61738:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6173b:	48 89 e7             	mov    rdi,rsp
      b6173e:	e8 d3 c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61743:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61748:	48 85 ff             	test   rdi,rdi
      b6174b:	74 06                	je     b61753 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae6f3>
      b6174d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61750:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61753:	6a 08                	push   0x8
      b61755:	5f                   	pop    rdi
      b61756:	e8 a5 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b6175b:	48 8d 0d 4e 9e ce 00 	lea    rcx,[rip+0xce9e4e]        # 184b5b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7c98>
      b61762:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61765:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6176a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6176d:	48 89 e7             	mov    rdi,rsp
      b61770:	e8 a1 c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61775:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6177a:	48 85 ff             	test   rdi,rdi
      b6177d:	74 06                	je     b61785 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae725>
      b6177f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61782:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61785:	6a 08                	push   0x8
      b61787:	5f                   	pop    rdi
      b61788:	e8 73 c7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61770; FDE=(11925239, 11936142)
      b61724:	e8 d7 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b61729:	48 8d 0d c0 9e ce 00 	lea    rcx,[rip+0xce9ec0]        # 184b5f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7cd8>
      b61730:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61733:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61738:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6173b:	48 89 e7             	mov    rdi,rsp
      b6173e:	e8 d3 c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61743:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61748:	48 85 ff             	test   rdi,rdi
      b6174b:	74 06                	je     b61753 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae6f3>
      b6174d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61750:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61753:	6a 08                	push   0x8
      b61755:	5f                   	pop    rdi
      b61756:	e8 a5 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b6175b:	48 8d 0d 4e 9e ce 00 	lea    rcx,[rip+0xce9e4e]        # 184b5b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7c98>
      b61762:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61765:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6176a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6176d:	48 89 e7             	mov    rdi,rsp
      b61770:	e8 a1 c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61775:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6177a:	48 85 ff             	test   rdi,rdi
      b6177d:	74 06                	je     b61785 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae725>
      b6177f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61782:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61785:	6a 08                	push   0x8
      b61787:	5f                   	pop    rdi
      b61788:	e8 73 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b6178d:	48 8d 0d 74 75 ce 00 	lea    rcx,[rip+0xce7574]        # 1848d08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x53f0>
      b61794:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61797:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6179c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6179f:	48 89 e7             	mov    rdi,rsp
      b617a2:	e8 6f c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b617a7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b617ac:	48 85 ff             	test   rdi,rdi
      b617af:	74 06                	je     b617b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae757>
      b617b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b617b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b617b7:	6a 08                	push   0x8
      b617b9:	5f                   	pop    rdi
      b617ba:	e8 41 c7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb617a2; FDE=(11925239, 11936142)
      b61756:	e8 a5 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b6175b:	48 8d 0d 4e 9e ce 00 	lea    rcx,[rip+0xce9e4e]        # 184b5b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7c98>
      b61762:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61765:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6176a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6176d:	48 89 e7             	mov    rdi,rsp
      b61770:	e8 a1 c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61775:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6177a:	48 85 ff             	test   rdi,rdi
      b6177d:	74 06                	je     b61785 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae725>
      b6177f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61782:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61785:	6a 08                	push   0x8
      b61787:	5f                   	pop    rdi
      b61788:	e8 73 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b6178d:	48 8d 0d 74 75 ce 00 	lea    rcx,[rip+0xce7574]        # 1848d08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x53f0>
      b61794:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61797:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6179c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6179f:	48 89 e7             	mov    rdi,rsp
      b617a2:	e8 6f c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b617a7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b617ac:	48 85 ff             	test   rdi,rdi
      b617af:	74 06                	je     b617b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae757>
      b617b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b617b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b617b7:	6a 08                	push   0x8
      b617b9:	5f                   	pop    rdi
      b617ba:	e8 41 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b617bf:	48 8d 0d 82 75 ce 00 	lea    rcx,[rip+0xce7582]        # 1848d48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5430>
      b617c6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b617c9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b617ce:	48 89 06             	mov    QWORD PTR [rsi],rax
      b617d1:	48 89 e7             	mov    rdi,rsp
      b617d4:	e8 3d c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b617d9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b617de:	48 85 ff             	test   rdi,rdi
      b617e1:	74 06                	je     b617e9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae789>
      b617e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b617e6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b617e9:	6a 08                	push   0x8
      b617eb:	5f                   	pop    rdi
      b617ec:	e8 0f c7 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb617d4; FDE=(11925239, 11936142)
      b61788:	e8 73 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b6178d:	48 8d 0d 74 75 ce 00 	lea    rcx,[rip+0xce7574]        # 1848d08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x53f0>
      b61794:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61797:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6179c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6179f:	48 89 e7             	mov    rdi,rsp
      b617a2:	e8 6f c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b617a7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b617ac:	48 85 ff             	test   rdi,rdi
      b617af:	74 06                	je     b617b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae757>
      b617b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b617b4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b617b7:	6a 08                	push   0x8
      b617b9:	5f                   	pop    rdi
      b617ba:	e8 41 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b617bf:	48 8d 0d 82 75 ce 00 	lea    rcx,[rip+0xce7582]        # 1848d48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5430>
      b617c6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b617c9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b617ce:	48 89 06             	mov    QWORD PTR [rsi],rax
      b617d1:	48 89 e7             	mov    rdi,rsp
      b617d4:	e8 3d c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b617d9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b617de:	48 85 ff             	test   rdi,rdi
      b617e1:	74 06                	je     b617e9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae789>
      b617e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b617e6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b617e9:	6a 08                	push   0x8
      b617eb:	5f                   	pop    rdi
      b617ec:	e8 0f c7 c8 00       	call   17edf00 <_Znwm@plt>
      b617f1:	48 8d 0d 80 7d ce 00 	lea    rcx,[rip+0xce7d80]        # 1849578 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5c60>
      b617f8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b617fb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61800:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61803:	48 89 e7             	mov    rdi,rsp
      b61806:	e8 0b c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6180b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61810:	48 85 ff             	test   rdi,rdi
      b61813:	74 06                	je     b6181b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae7bb>
      b61815:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61818:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6181b:	6a 08                	push   0x8
      b6181d:	5f                   	pop    rdi
      b6181e:	e8 dd c6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61806; FDE=(11925239, 11936142)
      b617ba:	e8 41 c7 c8 00       	call   17edf00 <_Znwm@plt>
      b617bf:	48 8d 0d 82 75 ce 00 	lea    rcx,[rip+0xce7582]        # 1848d48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5430>
      b617c6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b617c9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b617ce:	48 89 06             	mov    QWORD PTR [rsi],rax
      b617d1:	48 89 e7             	mov    rdi,rsp
      b617d4:	e8 3d c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b617d9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b617de:	48 85 ff             	test   rdi,rdi
      b617e1:	74 06                	je     b617e9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae789>
      b617e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b617e6:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b617e9:	6a 08                	push   0x8
      b617eb:	5f                   	pop    rdi
      b617ec:	e8 0f c7 c8 00       	call   17edf00 <_Znwm@plt>
      b617f1:	48 8d 0d 80 7d ce 00 	lea    rcx,[rip+0xce7d80]        # 1849578 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5c60>
      b617f8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b617fb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61800:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61803:	48 89 e7             	mov    rdi,rsp
      b61806:	e8 0b c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6180b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61810:	48 85 ff             	test   rdi,rdi
      b61813:	74 06                	je     b6181b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae7bb>
      b61815:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61818:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6181b:	6a 08                	push   0x8
      b6181d:	5f                   	pop    rdi
      b6181e:	e8 dd c6 c8 00       	call   17edf00 <_Znwm@plt>
      b61823:	48 8d 0d fe 7d ce 00 	lea    rcx,[rip+0xce7dfe]        # 1849628 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5d10>
      b6182a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6182d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61832:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61835:	48 89 e7             	mov    rdi,rsp
      b61838:	e8 d9 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6183d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61842:	48 85 ff             	test   rdi,rdi
      b61845:	74 06                	je     b6184d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae7ed>
      b61847:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6184a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6184d:	6a 08                	push   0x8
      b6184f:	5f                   	pop    rdi
      b61850:	e8 ab c6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61838; FDE=(11925239, 11936142)
      b617ec:	e8 0f c7 c8 00       	call   17edf00 <_Znwm@plt>
      b617f1:	48 8d 0d 80 7d ce 00 	lea    rcx,[rip+0xce7d80]        # 1849578 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5c60>
      b617f8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b617fb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61800:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61803:	48 89 e7             	mov    rdi,rsp
      b61806:	e8 0b c3 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6180b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61810:	48 85 ff             	test   rdi,rdi
      b61813:	74 06                	je     b6181b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae7bb>
      b61815:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61818:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6181b:	6a 08                	push   0x8
      b6181d:	5f                   	pop    rdi
      b6181e:	e8 dd c6 c8 00       	call   17edf00 <_Znwm@plt>
      b61823:	48 8d 0d fe 7d ce 00 	lea    rcx,[rip+0xce7dfe]        # 1849628 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5d10>
      b6182a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6182d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61832:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61835:	48 89 e7             	mov    rdi,rsp
      b61838:	e8 d9 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6183d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61842:	48 85 ff             	test   rdi,rdi
      b61845:	74 06                	je     b6184d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae7ed>
      b61847:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6184a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6184d:	6a 08                	push   0x8
      b6184f:	5f                   	pop    rdi
      b61850:	e8 ab c6 c8 00       	call   17edf00 <_Znwm@plt>
      b61855:	48 8d 0d 9c 7c ce 00 	lea    rcx,[rip+0xce7c9c]        # 18494f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5be0>
      b6185c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6185f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61864:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61867:	48 89 e7             	mov    rdi,rsp
      b6186a:	e8 a7 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6186f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61874:	48 85 ff             	test   rdi,rdi
      b61877:	74 06                	je     b6187f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae81f>
      b61879:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6187c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6187f:	6a 08                	push   0x8
      b61881:	5f                   	pop    rdi
      b61882:	e8 79 c6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6186a; FDE=(11925239, 11936142)
      b6181e:	e8 dd c6 c8 00       	call   17edf00 <_Znwm@plt>
      b61823:	48 8d 0d fe 7d ce 00 	lea    rcx,[rip+0xce7dfe]        # 1849628 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5d10>
      b6182a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6182d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61832:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61835:	48 89 e7             	mov    rdi,rsp
      b61838:	e8 d9 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6183d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61842:	48 85 ff             	test   rdi,rdi
      b61845:	74 06                	je     b6184d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae7ed>
      b61847:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6184a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6184d:	6a 08                	push   0x8
      b6184f:	5f                   	pop    rdi
      b61850:	e8 ab c6 c8 00       	call   17edf00 <_Znwm@plt>
      b61855:	48 8d 0d 9c 7c ce 00 	lea    rcx,[rip+0xce7c9c]        # 18494f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5be0>
      b6185c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6185f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61864:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61867:	48 89 e7             	mov    rdi,rsp
      b6186a:	e8 a7 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6186f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61874:	48 85 ff             	test   rdi,rdi
      b61877:	74 06                	je     b6187f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae81f>
      b61879:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6187c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6187f:	6a 08                	push   0x8
      b61881:	5f                   	pop    rdi
      b61882:	e8 79 c6 c8 00       	call   17edf00 <_Znwm@plt>
      b61887:	48 8d 0d 2a 7b ce 00 	lea    rcx,[rip+0xce7b2a]        # 18493b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5aa0>
      b6188e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61891:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61896:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61899:	48 89 e7             	mov    rdi,rsp
      b6189c:	e8 75 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b618a1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b618a6:	48 85 ff             	test   rdi,rdi
      b618a9:	74 06                	je     b618b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae851>
      b618ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b618ae:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b618b1:	6a 08                	push   0x8
      b618b3:	5f                   	pop    rdi
      b618b4:	e8 47 c6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb6189c; FDE=(11925239, 11936142)
      b61850:	e8 ab c6 c8 00       	call   17edf00 <_Znwm@plt>
      b61855:	48 8d 0d 9c 7c ce 00 	lea    rcx,[rip+0xce7c9c]        # 18494f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5be0>
      b6185c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6185f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61864:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61867:	48 89 e7             	mov    rdi,rsp
      b6186a:	e8 a7 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6186f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61874:	48 85 ff             	test   rdi,rdi
      b61877:	74 06                	je     b6187f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae81f>
      b61879:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b6187c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6187f:	6a 08                	push   0x8
      b61881:	5f                   	pop    rdi
      b61882:	e8 79 c6 c8 00       	call   17edf00 <_Znwm@plt>
      b61887:	48 8d 0d 2a 7b ce 00 	lea    rcx,[rip+0xce7b2a]        # 18493b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5aa0>
      b6188e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61891:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61896:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61899:	48 89 e7             	mov    rdi,rsp
      b6189c:	e8 75 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b618a1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b618a6:	48 85 ff             	test   rdi,rdi
      b618a9:	74 06                	je     b618b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae851>
      b618ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b618ae:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b618b1:	6a 08                	push   0x8
      b618b3:	5f                   	pop    rdi
      b618b4:	e8 47 c6 c8 00       	call   17edf00 <_Znwm@plt>
      b618b9:	48 8d 0d f8 7b ce 00 	lea    rcx,[rip+0xce7bf8]        # 18494b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5ba0>
      b618c0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b618c3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b618c8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b618cb:	48 89 e7             	mov    rdi,rsp
      b618ce:	e8 43 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b618d3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b618d8:	48 85 ff             	test   rdi,rdi
      b618db:	74 06                	je     b618e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae883>
      b618dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b618e0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b618e3:	6a 08                	push   0x8
      b618e5:	5f                   	pop    rdi
      b618e6:	e8 15 c6 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb618ce; FDE=(11925239, 11936142)
      b61882:	e8 79 c6 c8 00       	call   17edf00 <_Znwm@plt>
      b61887:	48 8d 0d 2a 7b ce 00 	lea    rcx,[rip+0xce7b2a]        # 18493b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5aa0>
      b6188e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61891:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61896:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61899:	48 89 e7             	mov    rdi,rsp
      b6189c:	e8 75 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b618a1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b618a6:	48 85 ff             	test   rdi,rdi
      b618a9:	74 06                	je     b618b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae851>
      b618ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b618ae:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b618b1:	6a 08                	push   0x8
      b618b3:	5f                   	pop    rdi
      b618b4:	e8 47 c6 c8 00       	call   17edf00 <_Znwm@plt>
      b618b9:	48 8d 0d f8 7b ce 00 	lea    rcx,[rip+0xce7bf8]        # 18494b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5ba0>
      b618c0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b618c3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b618c8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b618cb:	48 89 e7             	mov    rdi,rsp
      b618ce:	e8 43 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b618d3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b618d8:	48 85 ff             	test   rdi,rdi
      b618db:	74 06                	je     b618e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae883>
      b618dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b618e0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b618e3:	6a 08                	push   0x8
      b618e5:	5f                   	pop    rdi
      b618e6:	e8 15 c6 c8 00       	call   17edf00 <_Znwm@plt>
      b618eb:	48 8d 0d 46 7c ce 00 	lea    rcx,[rip+0xce7c46]        # 1849538 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5c20>
      b618f2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b618f5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b618fa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b618fd:	48 89 e7             	mov    rdi,rsp
      b61900:	e8 11 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61905:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6190a:	48 85 ff             	test   rdi,rdi
      b6190d:	74 06                	je     b61915 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae8b5>
      b6190f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61912:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61915:	6a 08                	push   0x8
      b61917:	5f                   	pop    rdi
      b61918:	e8 e3 c5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61900; FDE=(11925239, 11936142)
      b618b4:	e8 47 c6 c8 00       	call   17edf00 <_Znwm@plt>
      b618b9:	48 8d 0d f8 7b ce 00 	lea    rcx,[rip+0xce7bf8]        # 18494b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5ba0>
      b618c0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b618c3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b618c8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b618cb:	48 89 e7             	mov    rdi,rsp
      b618ce:	e8 43 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b618d3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b618d8:	48 85 ff             	test   rdi,rdi
      b618db:	74 06                	je     b618e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae883>
      b618dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b618e0:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b618e3:	6a 08                	push   0x8
      b618e5:	5f                   	pop    rdi
      b618e6:	e8 15 c6 c8 00       	call   17edf00 <_Znwm@plt>
      b618eb:	48 8d 0d 46 7c ce 00 	lea    rcx,[rip+0xce7c46]        # 1849538 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5c20>
      b618f2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b618f5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b618fa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b618fd:	48 89 e7             	mov    rdi,rsp
      b61900:	e8 11 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61905:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6190a:	48 85 ff             	test   rdi,rdi
      b6190d:	74 06                	je     b61915 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae8b5>
      b6190f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61912:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61915:	6a 08                	push   0x8
      b61917:	5f                   	pop    rdi
      b61918:	e8 e3 c5 c8 00       	call   17edf00 <_Znwm@plt>
      b6191d:	48 8d 0d 04 53 cf 00 	lea    rcx,[rip+0xcf5304]        # 1856c28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x13310>
      b61924:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61927:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6192c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6192f:	48 89 e7             	mov    rdi,rsp
      b61932:	e8 df c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61937:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6193c:	48 85 ff             	test   rdi,rdi
      b6193f:	74 06                	je     b61947 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae8e7>
      b61941:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61944:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61947:	6a 08                	push   0x8
      b61949:	5f                   	pop    rdi
      b6194a:	e8 b1 c5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61932; FDE=(11925239, 11936142)
      b618e6:	e8 15 c6 c8 00       	call   17edf00 <_Znwm@plt>
      b618eb:	48 8d 0d 46 7c ce 00 	lea    rcx,[rip+0xce7c46]        # 1849538 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5c20>
      b618f2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b618f5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b618fa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b618fd:	48 89 e7             	mov    rdi,rsp
      b61900:	e8 11 c2 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61905:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6190a:	48 85 ff             	test   rdi,rdi
      b6190d:	74 06                	je     b61915 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae8b5>
      b6190f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61912:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61915:	6a 08                	push   0x8
      b61917:	5f                   	pop    rdi
      b61918:	e8 e3 c5 c8 00       	call   17edf00 <_Znwm@plt>
      b6191d:	48 8d 0d 04 53 cf 00 	lea    rcx,[rip+0xcf5304]        # 1856c28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x13310>
      b61924:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61927:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6192c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6192f:	48 89 e7             	mov    rdi,rsp
      b61932:	e8 df c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61937:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6193c:	48 85 ff             	test   rdi,rdi
      b6193f:	74 06                	je     b61947 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae8e7>
      b61941:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61944:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61947:	6a 08                	push   0x8
      b61949:	5f                   	pop    rdi
      b6194a:	e8 b1 c5 c8 00       	call   17edf00 <_Znwm@plt>
      b6194f:	48 8d 0d 92 52 cf 00 	lea    rcx,[rip+0xcf5292]        # 1856be8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x132d0>
      b61956:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61959:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6195e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61961:	48 89 e7             	mov    rdi,rsp
      b61964:	e8 ad c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61969:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6196e:	48 85 ff             	test   rdi,rdi
      b61971:	74 06                	je     b61979 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae919>
      b61973:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61976:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61979:	6a 08                	push   0x8
      b6197b:	5f                   	pop    rdi
      b6197c:	e8 7f c5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61964; FDE=(11925239, 11936142)
      b61918:	e8 e3 c5 c8 00       	call   17edf00 <_Znwm@plt>
      b6191d:	48 8d 0d 04 53 cf 00 	lea    rcx,[rip+0xcf5304]        # 1856c28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x13310>
      b61924:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61927:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6192c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b6192f:	48 89 e7             	mov    rdi,rsp
      b61932:	e8 df c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61937:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6193c:	48 85 ff             	test   rdi,rdi
      b6193f:	74 06                	je     b61947 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae8e7>
      b61941:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61944:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61947:	6a 08                	push   0x8
      b61949:	5f                   	pop    rdi
      b6194a:	e8 b1 c5 c8 00       	call   17edf00 <_Znwm@plt>
      b6194f:	48 8d 0d 92 52 cf 00 	lea    rcx,[rip+0xcf5292]        # 1856be8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x132d0>
      b61956:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61959:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6195e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61961:	48 89 e7             	mov    rdi,rsp
      b61964:	e8 ad c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61969:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6196e:	48 85 ff             	test   rdi,rdi
      b61971:	74 06                	je     b61979 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae919>
      b61973:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61976:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61979:	6a 08                	push   0x8
      b6197b:	5f                   	pop    rdi
      b6197c:	e8 7f c5 c8 00       	call   17edf00 <_Znwm@plt>
      b61981:	48 8d 0d 90 41 cb 00 	lea    rcx,[rip+0xcb4190]        # 1815b18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xb7d8>
      b61988:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6198b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61990:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61993:	48 89 e7             	mov    rdi,rsp
      b61996:	e8 7b c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6199b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b619a0:	48 85 ff             	test   rdi,rdi
      b619a3:	74 06                	je     b619ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae94b>
      b619a5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b619a8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b619ab:	6a 08                	push   0x8
      b619ad:	5f                   	pop    rdi
      b619ae:	e8 4d c5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61996; FDE=(11925239, 11936142)
      b6194a:	e8 b1 c5 c8 00       	call   17edf00 <_Znwm@plt>
      b6194f:	48 8d 0d 92 52 cf 00 	lea    rcx,[rip+0xcf5292]        # 1856be8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x132d0>
      b61956:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61959:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b6195e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61961:	48 89 e7             	mov    rdi,rsp
      b61964:	e8 ad c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61969:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b6196e:	48 85 ff             	test   rdi,rdi
      b61971:	74 06                	je     b61979 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae919>
      b61973:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61976:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61979:	6a 08                	push   0x8
      b6197b:	5f                   	pop    rdi
      b6197c:	e8 7f c5 c8 00       	call   17edf00 <_Znwm@plt>
      b61981:	48 8d 0d 90 41 cb 00 	lea    rcx,[rip+0xcb4190]        # 1815b18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xb7d8>
      b61988:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6198b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61990:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61993:	48 89 e7             	mov    rdi,rsp
      b61996:	e8 7b c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6199b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b619a0:	48 85 ff             	test   rdi,rdi
      b619a3:	74 06                	je     b619ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae94b>
      b619a5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b619a8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b619ab:	6a 08                	push   0x8
      b619ad:	5f                   	pop    rdi
      b619ae:	e8 4d c5 c8 00       	call   17edf00 <_Znwm@plt>
      b619b3:	48 8d 0d 76 42 cb 00 	lea    rcx,[rip+0xcb4276]        # 1815c30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xb8f0>
      b619ba:	48 89 08             	mov    QWORD PTR [rax],rcx
      b619bd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b619c2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b619c5:	48 89 e7             	mov    rdi,rsp
      b619c8:	e8 49 c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b619cd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b619d2:	48 85 ff             	test   rdi,rdi
      b619d5:	74 06                	je     b619dd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae97d>
      b619d7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b619da:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b619dd:	6a 08                	push   0x8
      b619df:	5f                   	pop    rdi
      b619e0:	e8 1b c5 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb619c8; FDE=(11925239, 11936142)
      b6197c:	e8 7f c5 c8 00       	call   17edf00 <_Znwm@plt>
      b61981:	48 8d 0d 90 41 cb 00 	lea    rcx,[rip+0xcb4190]        # 1815b18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xb7d8>
      b61988:	48 89 08             	mov    QWORD PTR [rax],rcx
      b6198b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61990:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61993:	48 89 e7             	mov    rdi,rsp
      b61996:	e8 7b c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b6199b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b619a0:	48 85 ff             	test   rdi,rdi
      b619a3:	74 06                	je     b619ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae94b>
      b619a5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b619a8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b619ab:	6a 08                	push   0x8
      b619ad:	5f                   	pop    rdi
      b619ae:	e8 4d c5 c8 00       	call   17edf00 <_Znwm@plt>
      b619b3:	48 8d 0d 76 42 cb 00 	lea    rcx,[rip+0xcb4276]        # 1815c30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xb8f0>
      b619ba:	48 89 08             	mov    QWORD PTR [rax],rcx
      b619bd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b619c2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b619c5:	48 89 e7             	mov    rdi,rsp
      b619c8:	e8 49 c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b619cd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b619d2:	48 85 ff             	test   rdi,rdi
      b619d5:	74 06                	je     b619dd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae97d>
      b619d7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b619da:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b619dd:	6a 08                	push   0x8
      b619df:	5f                   	pop    rdi
      b619e0:	e8 1b c5 c8 00       	call   17edf00 <_Znwm@plt>
      b619e5:	48 8d 0d 9c 81 ce 00 	lea    rcx,[rip+0xce819c]        # 1849b88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6270>
      b619ec:	48 89 08             	mov    QWORD PTR [rax],rcx
      b619ef:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b619f4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b619f7:	48 89 e7             	mov    rdi,rsp
      b619fa:	e8 17 c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b619ff:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a04:	48 85 ff             	test   rdi,rdi
      b61a07:	74 06                	je     b61a0f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae9af>
      b61a09:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61a0c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61a0f:	6a 08                	push   0x8
      b61a11:	5f                   	pop    rdi
      b61a12:	e8 e9 c4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb619fa; FDE=(11925239, 11936142)
      b619ae:	e8 4d c5 c8 00       	call   17edf00 <_Znwm@plt>
      b619b3:	48 8d 0d 76 42 cb 00 	lea    rcx,[rip+0xcb4276]        # 1815c30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xb8f0>
      b619ba:	48 89 08             	mov    QWORD PTR [rax],rcx
      b619bd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b619c2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b619c5:	48 89 e7             	mov    rdi,rsp
      b619c8:	e8 49 c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b619cd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b619d2:	48 85 ff             	test   rdi,rdi
      b619d5:	74 06                	je     b619dd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae97d>
      b619d7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b619da:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b619dd:	6a 08                	push   0x8
      b619df:	5f                   	pop    rdi
      b619e0:	e8 1b c5 c8 00       	call   17edf00 <_Znwm@plt>
      b619e5:	48 8d 0d 9c 81 ce 00 	lea    rcx,[rip+0xce819c]        # 1849b88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6270>
      b619ec:	48 89 08             	mov    QWORD PTR [rax],rcx
      b619ef:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b619f4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b619f7:	48 89 e7             	mov    rdi,rsp
      b619fa:	e8 17 c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b619ff:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a04:	48 85 ff             	test   rdi,rdi
      b61a07:	74 06                	je     b61a0f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae9af>
      b61a09:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61a0c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61a0f:	6a 08                	push   0x8
      b61a11:	5f                   	pop    rdi
      b61a12:	e8 e9 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61a17:	48 8d 0d da 8e cc 00 	lea    rcx,[rip+0xcc8eda]        # 182a8f8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6f28>
      b61a1e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61a21:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61a26:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61a29:	48 89 e7             	mov    rdi,rsp
      b61a2c:	e8 e5 c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61a31:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a36:	48 85 ff             	test   rdi,rdi
      b61a39:	74 06                	je     b61a41 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae9e1>
      b61a3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61a3e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61a41:	6a 08                	push   0x8
      b61a43:	5f                   	pop    rdi
      b61a44:	e8 b7 c4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61a2c; FDE=(11925239, 11936142)
      b619e0:	e8 1b c5 c8 00       	call   17edf00 <_Znwm@plt>
      b619e5:	48 8d 0d 9c 81 ce 00 	lea    rcx,[rip+0xce819c]        # 1849b88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6270>
      b619ec:	48 89 08             	mov    QWORD PTR [rax],rcx
      b619ef:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b619f4:	48 89 06             	mov    QWORD PTR [rsi],rax
      b619f7:	48 89 e7             	mov    rdi,rsp
      b619fa:	e8 17 c1 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b619ff:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a04:	48 85 ff             	test   rdi,rdi
      b61a07:	74 06                	je     b61a0f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae9af>
      b61a09:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61a0c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61a0f:	6a 08                	push   0x8
      b61a11:	5f                   	pop    rdi
      b61a12:	e8 e9 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61a17:	48 8d 0d da 8e cc 00 	lea    rcx,[rip+0xcc8eda]        # 182a8f8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6f28>
      b61a1e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61a21:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61a26:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61a29:	48 89 e7             	mov    rdi,rsp
      b61a2c:	e8 e5 c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61a31:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a36:	48 85 ff             	test   rdi,rdi
      b61a39:	74 06                	je     b61a41 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae9e1>
      b61a3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61a3e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61a41:	6a 08                	push   0x8
      b61a43:	5f                   	pop    rdi
      b61a44:	e8 b7 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61a49:	48 8d 0d 68 8e cc 00 	lea    rcx,[rip+0xcc8e68]        # 182a8b8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6ee8>
      b61a50:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61a53:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61a58:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61a5b:	48 89 e7             	mov    rdi,rsp
      b61a5e:	e8 b3 c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61a63:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a68:	48 85 ff             	test   rdi,rdi
      b61a6b:	74 06                	je     b61a73 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaea13>
      b61a6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61a70:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61a73:	6a 08                	push   0x8
      b61a75:	5f                   	pop    rdi
      b61a76:	e8 85 c4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61a5e; FDE=(11925239, 11936142)
      b61a12:	e8 e9 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61a17:	48 8d 0d da 8e cc 00 	lea    rcx,[rip+0xcc8eda]        # 182a8f8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6f28>
      b61a1e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61a21:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61a26:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61a29:	48 89 e7             	mov    rdi,rsp
      b61a2c:	e8 e5 c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61a31:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a36:	48 85 ff             	test   rdi,rdi
      b61a39:	74 06                	je     b61a41 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae9e1>
      b61a3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61a3e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61a41:	6a 08                	push   0x8
      b61a43:	5f                   	pop    rdi
      b61a44:	e8 b7 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61a49:	48 8d 0d 68 8e cc 00 	lea    rcx,[rip+0xcc8e68]        # 182a8b8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6ee8>
      b61a50:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61a53:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61a58:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61a5b:	48 89 e7             	mov    rdi,rsp
      b61a5e:	e8 b3 c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61a63:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a68:	48 85 ff             	test   rdi,rdi
      b61a6b:	74 06                	je     b61a73 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaea13>
      b61a6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61a70:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61a73:	6a 08                	push   0x8
      b61a75:	5f                   	pop    rdi
      b61a76:	e8 85 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61a7b:	48 8d 0d 76 89 cc 00 	lea    rcx,[rip+0xcc8976]        # 182a3f8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6a28>
      b61a82:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61a85:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61a8a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61a8d:	48 89 e7             	mov    rdi,rsp
      b61a90:	e8 81 c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61a95:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a9a:	48 85 ff             	test   rdi,rdi
      b61a9d:	74 06                	je     b61aa5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaea45>
      b61a9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61aa2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61aa5:	6a 08                	push   0x8
      b61aa7:	5f                   	pop    rdi
      b61aa8:	e8 53 c4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61a90; FDE=(11925239, 11936142)
      b61a44:	e8 b7 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61a49:	48 8d 0d 68 8e cc 00 	lea    rcx,[rip+0xcc8e68]        # 182a8b8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6ee8>
      b61a50:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61a53:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61a58:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61a5b:	48 89 e7             	mov    rdi,rsp
      b61a5e:	e8 b3 c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61a63:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a68:	48 85 ff             	test   rdi,rdi
      b61a6b:	74 06                	je     b61a73 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaea13>
      b61a6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61a70:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61a73:	6a 08                	push   0x8
      b61a75:	5f                   	pop    rdi
      b61a76:	e8 85 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61a7b:	48 8d 0d 76 89 cc 00 	lea    rcx,[rip+0xcc8976]        # 182a3f8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6a28>
      b61a82:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61a85:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61a8a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61a8d:	48 89 e7             	mov    rdi,rsp
      b61a90:	e8 81 c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61a95:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a9a:	48 85 ff             	test   rdi,rdi
      b61a9d:	74 06                	je     b61aa5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaea45>
      b61a9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61aa2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61aa5:	6a 08                	push   0x8
      b61aa7:	5f                   	pop    rdi
      b61aa8:	e8 53 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61aad:	48 8d 0d 1c f2 ce 00 	lea    rcx,[rip+0xcef21c]        # 1850cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd3b8>
      b61ab4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61ab7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61abc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61abf:	48 89 e7             	mov    rdi,rsp
      b61ac2:	e8 4f c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61ac7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61acc:	48 85 ff             	test   rdi,rdi
      b61acf:	74 06                	je     b61ad7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaea77>
      b61ad1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61ad4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61ad7:	6a 08                	push   0x8
      b61ad9:	5f                   	pop    rdi
      b61ada:	e8 21 c4 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61ac2; FDE=(11925239, 11936142)
      b61a76:	e8 85 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61a7b:	48 8d 0d 76 89 cc 00 	lea    rcx,[rip+0xcc8976]        # 182a3f8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6a28>
      b61a82:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61a85:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61a8a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61a8d:	48 89 e7             	mov    rdi,rsp
      b61a90:	e8 81 c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61a95:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61a9a:	48 85 ff             	test   rdi,rdi
      b61a9d:	74 06                	je     b61aa5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaea45>
      b61a9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61aa2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61aa5:	6a 08                	push   0x8
      b61aa7:	5f                   	pop    rdi
      b61aa8:	e8 53 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61aad:	48 8d 0d 1c f2 ce 00 	lea    rcx,[rip+0xcef21c]        # 1850cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd3b8>
      b61ab4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61ab7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61abc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61abf:	48 89 e7             	mov    rdi,rsp
      b61ac2:	e8 4f c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61ac7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61acc:	48 85 ff             	test   rdi,rdi
      b61acf:	74 06                	je     b61ad7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaea77>
      b61ad1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61ad4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61ad7:	6a 08                	push   0x8
      b61ad9:	5f                   	pop    rdi
      b61ada:	e8 21 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61adf:	48 8d 0d aa f1 ce 00 	lea    rcx,[rip+0xcef1aa]        # 1850c90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd378>
      b61ae6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61ae9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61aee:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61af1:	48 89 e7             	mov    rdi,rsp
      b61af4:	e8 1d c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61af9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61afe:	48 85 ff             	test   rdi,rdi
      b61b01:	74 06                	je     b61b09 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeaa9>
      b61b03:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b06:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b09:	6a 08                	push   0x8
      b61b0b:	5f                   	pop    rdi
      b61b0c:	e8 ef c3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61af4; FDE=(11925239, 11936142)
      b61aa8:	e8 53 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61aad:	48 8d 0d 1c f2 ce 00 	lea    rcx,[rip+0xcef21c]        # 1850cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd3b8>
      b61ab4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61ab7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61abc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61abf:	48 89 e7             	mov    rdi,rsp
      b61ac2:	e8 4f c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61ac7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61acc:	48 85 ff             	test   rdi,rdi
      b61acf:	74 06                	je     b61ad7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaea77>
      b61ad1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61ad4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61ad7:	6a 08                	push   0x8
      b61ad9:	5f                   	pop    rdi
      b61ada:	e8 21 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61adf:	48 8d 0d aa f1 ce 00 	lea    rcx,[rip+0xcef1aa]        # 1850c90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd378>
      b61ae6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61ae9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61aee:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61af1:	48 89 e7             	mov    rdi,rsp
      b61af4:	e8 1d c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61af9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61afe:	48 85 ff             	test   rdi,rdi
      b61b01:	74 06                	je     b61b09 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeaa9>
      b61b03:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b06:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b09:	6a 08                	push   0x8
      b61b0b:	5f                   	pop    rdi
      b61b0c:	e8 ef c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61b11:	48 8d 0d 98 33 cf 00 	lea    rcx,[rip+0xcf3398]        # 1854eb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11598>
      b61b18:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61b1b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61b20:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61b23:	48 89 e7             	mov    rdi,rsp
      b61b26:	e8 eb bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61b2b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61b30:	48 85 ff             	test   rdi,rdi
      b61b33:	74 06                	je     b61b3b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeadb>
      b61b35:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b38:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b3b:	6a 08                	push   0x8
      b61b3d:	5f                   	pop    rdi
      b61b3e:	e8 bd c3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61b26; FDE=(11925239, 11936142)
      b61ada:	e8 21 c4 c8 00       	call   17edf00 <_Znwm@plt>
      b61adf:	48 8d 0d aa f1 ce 00 	lea    rcx,[rip+0xcef1aa]        # 1850c90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd378>
      b61ae6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61ae9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61aee:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61af1:	48 89 e7             	mov    rdi,rsp
      b61af4:	e8 1d c0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61af9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61afe:	48 85 ff             	test   rdi,rdi
      b61b01:	74 06                	je     b61b09 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeaa9>
      b61b03:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b06:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b09:	6a 08                	push   0x8
      b61b0b:	5f                   	pop    rdi
      b61b0c:	e8 ef c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61b11:	48 8d 0d 98 33 cf 00 	lea    rcx,[rip+0xcf3398]        # 1854eb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11598>
      b61b18:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61b1b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61b20:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61b23:	48 89 e7             	mov    rdi,rsp
      b61b26:	e8 eb bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61b2b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61b30:	48 85 ff             	test   rdi,rdi
      b61b33:	74 06                	je     b61b3b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeadb>
      b61b35:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b38:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b3b:	6a 08                	push   0x8
      b61b3d:	5f                   	pop    rdi
      b61b3e:	e8 bd c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61b43:	48 8d 0d 26 33 cf 00 	lea    rcx,[rip+0xcf3326]        # 1854e70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11558>
      b61b4a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61b4d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61b52:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61b55:	48 89 e7             	mov    rdi,rsp
      b61b58:	e8 b9 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61b5d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61b62:	48 85 ff             	test   rdi,rdi
      b61b65:	74 06                	je     b61b6d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeb0d>
      b61b67:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b6a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b6d:	6a 08                	push   0x8
      b61b6f:	5f                   	pop    rdi
      b61b70:	e8 8b c3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61b58; FDE=(11925239, 11936142)
      b61b0c:	e8 ef c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61b11:	48 8d 0d 98 33 cf 00 	lea    rcx,[rip+0xcf3398]        # 1854eb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11598>
      b61b18:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61b1b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61b20:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61b23:	48 89 e7             	mov    rdi,rsp
      b61b26:	e8 eb bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61b2b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61b30:	48 85 ff             	test   rdi,rdi
      b61b33:	74 06                	je     b61b3b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeadb>
      b61b35:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b38:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b3b:	6a 08                	push   0x8
      b61b3d:	5f                   	pop    rdi
      b61b3e:	e8 bd c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61b43:	48 8d 0d 26 33 cf 00 	lea    rcx,[rip+0xcf3326]        # 1854e70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11558>
      b61b4a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61b4d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61b52:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61b55:	48 89 e7             	mov    rdi,rsp
      b61b58:	e8 b9 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61b5d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61b62:	48 85 ff             	test   rdi,rdi
      b61b65:	74 06                	je     b61b6d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeb0d>
      b61b67:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b6a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b6d:	6a 08                	push   0x8
      b61b6f:	5f                   	pop    rdi
      b61b70:	e8 8b c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61b75:	48 8d 0d 84 94 cc 00 	lea    rcx,[rip+0xcc9484]        # 182b000 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7630>
      b61b7c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61b7f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61b84:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61b87:	48 89 e7             	mov    rdi,rsp
      b61b8a:	e8 87 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61b8f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61b94:	48 85 ff             	test   rdi,rdi
      b61b97:	74 06                	je     b61b9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeb3f>
      b61b99:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b9c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b9f:	6a 08                	push   0x8
      b61ba1:	5f                   	pop    rdi
      b61ba2:	e8 59 c3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61b8a; FDE=(11925239, 11936142)
      b61b3e:	e8 bd c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61b43:	48 8d 0d 26 33 cf 00 	lea    rcx,[rip+0xcf3326]        # 1854e70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11558>
      b61b4a:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61b4d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61b52:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61b55:	48 89 e7             	mov    rdi,rsp
      b61b58:	e8 b9 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61b5d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61b62:	48 85 ff             	test   rdi,rdi
      b61b65:	74 06                	je     b61b6d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeb0d>
      b61b67:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b6a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b6d:	6a 08                	push   0x8
      b61b6f:	5f                   	pop    rdi
      b61b70:	e8 8b c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61b75:	48 8d 0d 84 94 cc 00 	lea    rcx,[rip+0xcc9484]        # 182b000 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7630>
      b61b7c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61b7f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61b84:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61b87:	48 89 e7             	mov    rdi,rsp
      b61b8a:	e8 87 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61b8f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61b94:	48 85 ff             	test   rdi,rdi
      b61b97:	74 06                	je     b61b9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeb3f>
      b61b99:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b9c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b9f:	6a 08                	push   0x8
      b61ba1:	5f                   	pop    rdi
      b61ba2:	e8 59 c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61ba7:	48 8d 0d 92 ce cb 00 	lea    rcx,[rip+0xcbce92]        # 181ea40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14700>
      b61bae:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61bb1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61bb6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61bb9:	48 89 e7             	mov    rdi,rsp
      b61bbc:	e8 55 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61bc1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61bc6:	48 85 ff             	test   rdi,rdi
      b61bc9:	74 06                	je     b61bd1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeb71>
      b61bcb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61bce:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61bd1:	6a 08                	push   0x8
      b61bd3:	5f                   	pop    rdi
      b61bd4:	e8 27 c3 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61bbc; FDE=(11925239, 11936142)
      b61b70:	e8 8b c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61b75:	48 8d 0d 84 94 cc 00 	lea    rcx,[rip+0xcc9484]        # 182b000 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7630>
      b61b7c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61b7f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61b84:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61b87:	48 89 e7             	mov    rdi,rsp
      b61b8a:	e8 87 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61b8f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61b94:	48 85 ff             	test   rdi,rdi
      b61b97:	74 06                	je     b61b9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeb3f>
      b61b99:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61b9c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61b9f:	6a 08                	push   0x8
      b61ba1:	5f                   	pop    rdi
      b61ba2:	e8 59 c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61ba7:	48 8d 0d 92 ce cb 00 	lea    rcx,[rip+0xcbce92]        # 181ea40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14700>
      b61bae:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61bb1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61bb6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61bb9:	48 89 e7             	mov    rdi,rsp
      b61bbc:	e8 55 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61bc1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61bc6:	48 85 ff             	test   rdi,rdi
      b61bc9:	74 06                	je     b61bd1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeb71>
      b61bcb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61bce:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61bd1:	6a 08                	push   0x8
      b61bd3:	5f                   	pop    rdi
      b61bd4:	e8 27 c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61bd9:	48 8d 0d 98 96 cc 00 	lea    rcx,[rip+0xcc9698]        # 182b278 <_ZTIN4asio2ip16bad_address_castE@@Base+0x78a8>
      b61be0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61be3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61be8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61beb:	48 89 e7             	mov    rdi,rsp
      b61bee:	e8 23 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61bf3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61bf8:	48 85 ff             	test   rdi,rdi
      b61bfb:	74 06                	je     b61c03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeba3>
      b61bfd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c00:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c03:	6a 08                	push   0x8
      b61c05:	5f                   	pop    rdi
      b61c06:	e8 f5 c2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61bee; FDE=(11925239, 11936142)
      b61ba2:	e8 59 c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61ba7:	48 8d 0d 92 ce cb 00 	lea    rcx,[rip+0xcbce92]        # 181ea40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14700>
      b61bae:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61bb1:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61bb6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61bb9:	48 89 e7             	mov    rdi,rsp
      b61bbc:	e8 55 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61bc1:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61bc6:	48 85 ff             	test   rdi,rdi
      b61bc9:	74 06                	je     b61bd1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeb71>
      b61bcb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61bce:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61bd1:	6a 08                	push   0x8
      b61bd3:	5f                   	pop    rdi
      b61bd4:	e8 27 c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61bd9:	48 8d 0d 98 96 cc 00 	lea    rcx,[rip+0xcc9698]        # 182b278 <_ZTIN4asio2ip16bad_address_castE@@Base+0x78a8>
      b61be0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61be3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61be8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61beb:	48 89 e7             	mov    rdi,rsp
      b61bee:	e8 23 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61bf3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61bf8:	48 85 ff             	test   rdi,rdi
      b61bfb:	74 06                	je     b61c03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeba3>
      b61bfd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c00:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c03:	6a 08                	push   0x8
      b61c05:	5f                   	pop    rdi
      b61c06:	e8 f5 c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61c0b:	48 8d 0d 26 96 cc 00 	lea    rcx,[rip+0xcc9626]        # 182b238 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7868>
      b61c12:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61c15:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61c1a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61c1d:	48 89 e7             	mov    rdi,rsp
      b61c20:	e8 f1 be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61c25:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61c2a:	48 85 ff             	test   rdi,rdi
      b61c2d:	74 06                	je     b61c35 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaebd5>
      b61c2f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c32:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c35:	6a 08                	push   0x8
      b61c37:	5f                   	pop    rdi
      b61c38:	e8 c3 c2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61c20; FDE=(11925239, 11936142)
      b61bd4:	e8 27 c3 c8 00       	call   17edf00 <_Znwm@plt>
      b61bd9:	48 8d 0d 98 96 cc 00 	lea    rcx,[rip+0xcc9698]        # 182b278 <_ZTIN4asio2ip16bad_address_castE@@Base+0x78a8>
      b61be0:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61be3:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61be8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61beb:	48 89 e7             	mov    rdi,rsp
      b61bee:	e8 23 bf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61bf3:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61bf8:	48 85 ff             	test   rdi,rdi
      b61bfb:	74 06                	je     b61c03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeba3>
      b61bfd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c00:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c03:	6a 08                	push   0x8
      b61c05:	5f                   	pop    rdi
      b61c06:	e8 f5 c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61c0b:	48 8d 0d 26 96 cc 00 	lea    rcx,[rip+0xcc9626]        # 182b238 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7868>
      b61c12:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61c15:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61c1a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61c1d:	48 89 e7             	mov    rdi,rsp
      b61c20:	e8 f1 be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61c25:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61c2a:	48 85 ff             	test   rdi,rdi
      b61c2d:	74 06                	je     b61c35 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaebd5>
      b61c2f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c32:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c35:	6a 08                	push   0x8
      b61c37:	5f                   	pop    rdi
      b61c38:	e8 c3 c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61c3d:	48 8d 0d 1c 96 ce 00 	lea    rcx,[rip+0xce961c]        # 184b260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7948>
      b61c44:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61c47:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61c4c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61c4f:	48 89 e7             	mov    rdi,rsp
      b61c52:	e8 bf be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61c57:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61c5c:	48 85 ff             	test   rdi,rdi
      b61c5f:	74 06                	je     b61c67 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec07>
      b61c61:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c64:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c67:	6a 08                	push   0x8
      b61c69:	5f                   	pop    rdi
      b61c6a:	e8 91 c2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61c52; FDE=(11925239, 11936142)
      b61c06:	e8 f5 c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61c0b:	48 8d 0d 26 96 cc 00 	lea    rcx,[rip+0xcc9626]        # 182b238 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7868>
      b61c12:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61c15:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61c1a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61c1d:	48 89 e7             	mov    rdi,rsp
      b61c20:	e8 f1 be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61c25:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61c2a:	48 85 ff             	test   rdi,rdi
      b61c2d:	74 06                	je     b61c35 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaebd5>
      b61c2f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c32:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c35:	6a 08                	push   0x8
      b61c37:	5f                   	pop    rdi
      b61c38:	e8 c3 c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61c3d:	48 8d 0d 1c 96 ce 00 	lea    rcx,[rip+0xce961c]        # 184b260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7948>
      b61c44:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61c47:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61c4c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61c4f:	48 89 e7             	mov    rdi,rsp
      b61c52:	e8 bf be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61c57:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61c5c:	48 85 ff             	test   rdi,rdi
      b61c5f:	74 06                	je     b61c67 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec07>
      b61c61:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c64:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c67:	6a 08                	push   0x8
      b61c69:	5f                   	pop    rdi
      b61c6a:	e8 91 c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61c6f:	48 8d 0d aa 95 ce 00 	lea    rcx,[rip+0xce95aa]        # 184b220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7908>
      b61c76:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61c79:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61c7e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61c81:	48 89 e7             	mov    rdi,rsp
      b61c84:	e8 8d be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61c89:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61c8e:	48 85 ff             	test   rdi,rdi
      b61c91:	74 06                	je     b61c99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec39>
      b61c93:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c96:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c99:	6a 08                	push   0x8
      b61c9b:	5f                   	pop    rdi
      b61c9c:	e8 5f c2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61c84; FDE=(11925239, 11936142)
      b61c38:	e8 c3 c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61c3d:	48 8d 0d 1c 96 ce 00 	lea    rcx,[rip+0xce961c]        # 184b260 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7948>
      b61c44:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61c47:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61c4c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61c4f:	48 89 e7             	mov    rdi,rsp
      b61c52:	e8 bf be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61c57:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61c5c:	48 85 ff             	test   rdi,rdi
      b61c5f:	74 06                	je     b61c67 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec07>
      b61c61:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c64:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c67:	6a 08                	push   0x8
      b61c69:	5f                   	pop    rdi
      b61c6a:	e8 91 c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61c6f:	48 8d 0d aa 95 ce 00 	lea    rcx,[rip+0xce95aa]        # 184b220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7908>
      b61c76:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61c79:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61c7e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61c81:	48 89 e7             	mov    rdi,rsp
      b61c84:	e8 8d be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61c89:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61c8e:	48 85 ff             	test   rdi,rdi
      b61c91:	74 06                	je     b61c99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec39>
      b61c93:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c96:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c99:	6a 08                	push   0x8
      b61c9b:	5f                   	pop    rdi
      b61c9c:	e8 5f c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61ca1:	48 8d 0d 28 c4 ca 00 	lea    rcx,[rip+0xcac428]        # 180e0d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3d90>
      b61ca8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61cab:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61cb0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61cb3:	48 89 e7             	mov    rdi,rsp
      b61cb6:	e8 5b be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61cbb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61cc0:	48 85 ff             	test   rdi,rdi
      b61cc3:	74 06                	je     b61ccb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec6b>
      b61cc5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61cc8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61ccb:	6a 08                	push   0x8
      b61ccd:	5f                   	pop    rdi
      b61cce:	e8 2d c2 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61cb6; FDE=(11925239, 11936142)
      b61c6a:	e8 91 c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61c6f:	48 8d 0d aa 95 ce 00 	lea    rcx,[rip+0xce95aa]        # 184b220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7908>
      b61c76:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61c79:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61c7e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61c81:	48 89 e7             	mov    rdi,rsp
      b61c84:	e8 8d be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61c89:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61c8e:	48 85 ff             	test   rdi,rdi
      b61c91:	74 06                	je     b61c99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec39>
      b61c93:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61c96:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61c99:	6a 08                	push   0x8
      b61c9b:	5f                   	pop    rdi
      b61c9c:	e8 5f c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61ca1:	48 8d 0d 28 c4 ca 00 	lea    rcx,[rip+0xcac428]        # 180e0d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3d90>
      b61ca8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61cab:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61cb0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61cb3:	48 89 e7             	mov    rdi,rsp
      b61cb6:	e8 5b be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61cbb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61cc0:	48 85 ff             	test   rdi,rdi
      b61cc3:	74 06                	je     b61ccb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec6b>
      b61cc5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61cc8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61ccb:	6a 08                	push   0x8
      b61ccd:	5f                   	pop    rdi
      b61cce:	e8 2d c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61cd3:	48 8d 0d ae c6 ca 00 	lea    rcx,[rip+0xcac6ae]        # 180e388 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4048>
      b61cda:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61cdd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61ce2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61ce5:	48 89 e7             	mov    rdi,rsp
      b61ce8:	e8 29 be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61ced:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61cf2:	48 85 ff             	test   rdi,rdi
      b61cf5:	74 06                	je     b61cfd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec9d>
      b61cf7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61cfa:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61cfd:	6a 08                	push   0x8
      b61cff:	5f                   	pop    rdi
      b61d00:	e8 fb c1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61ce8; FDE=(11925239, 11936142)
      b61c9c:	e8 5f c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61ca1:	48 8d 0d 28 c4 ca 00 	lea    rcx,[rip+0xcac428]        # 180e0d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3d90>
      b61ca8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61cab:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61cb0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61cb3:	48 89 e7             	mov    rdi,rsp
      b61cb6:	e8 5b be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61cbb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61cc0:	48 85 ff             	test   rdi,rdi
      b61cc3:	74 06                	je     b61ccb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec6b>
      b61cc5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61cc8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61ccb:	6a 08                	push   0x8
      b61ccd:	5f                   	pop    rdi
      b61cce:	e8 2d c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61cd3:	48 8d 0d ae c6 ca 00 	lea    rcx,[rip+0xcac6ae]        # 180e388 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4048>
      b61cda:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61cdd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61ce2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61ce5:	48 89 e7             	mov    rdi,rsp
      b61ce8:	e8 29 be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61ced:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61cf2:	48 85 ff             	test   rdi,rdi
      b61cf5:	74 06                	je     b61cfd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec9d>
      b61cf7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61cfa:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61cfd:	6a 08                	push   0x8
      b61cff:	5f                   	pop    rdi
      b61d00:	e8 fb c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d05:	48 8d 0d 74 29 cb 00 	lea    rcx,[rip+0xcb2974]        # 1814680 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa340>
      b61d0c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61d0f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61d14:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61d17:	48 89 e7             	mov    rdi,rsp
      b61d1a:	e8 f7 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61d1f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61d24:	48 85 ff             	test   rdi,rdi
      b61d27:	74 06                	je     b61d2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeccf>
      b61d29:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61d2c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61d2f:	6a 08                	push   0x8
      b61d31:	5f                   	pop    rdi
      b61d32:	e8 c9 c1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61d1a; FDE=(11925239, 11936142)
      b61cce:	e8 2d c2 c8 00       	call   17edf00 <_Znwm@plt>
      b61cd3:	48 8d 0d ae c6 ca 00 	lea    rcx,[rip+0xcac6ae]        # 180e388 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4048>
      b61cda:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61cdd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61ce2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61ce5:	48 89 e7             	mov    rdi,rsp
      b61ce8:	e8 29 be f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61ced:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61cf2:	48 85 ff             	test   rdi,rdi
      b61cf5:	74 06                	je     b61cfd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaec9d>
      b61cf7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61cfa:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61cfd:	6a 08                	push   0x8
      b61cff:	5f                   	pop    rdi
      b61d00:	e8 fb c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d05:	48 8d 0d 74 29 cb 00 	lea    rcx,[rip+0xcb2974]        # 1814680 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa340>
      b61d0c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61d0f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61d14:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61d17:	48 89 e7             	mov    rdi,rsp
      b61d1a:	e8 f7 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61d1f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61d24:	48 85 ff             	test   rdi,rdi
      b61d27:	74 06                	je     b61d2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeccf>
      b61d29:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61d2c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61d2f:	6a 08                	push   0x8
      b61d31:	5f                   	pop    rdi
      b61d32:	e8 c9 c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d37:	48 8d 0d 02 29 cb 00 	lea    rcx,[rip+0xcb2902]        # 1814640 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa300>
      b61d3e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61d41:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61d46:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61d49:	48 89 e7             	mov    rdi,rsp
      b61d4c:	e8 c5 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61d51:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61d56:	48 85 ff             	test   rdi,rdi
      b61d59:	74 06                	je     b61d61 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaed01>
      b61d5b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61d5e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61d61:	6a 08                	push   0x8
      b61d63:	5f                   	pop    rdi
      b61d64:	e8 97 c1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61d4c; FDE=(11925239, 11936142)
      b61d00:	e8 fb c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d05:	48 8d 0d 74 29 cb 00 	lea    rcx,[rip+0xcb2974]        # 1814680 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa340>
      b61d0c:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61d0f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61d14:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61d17:	48 89 e7             	mov    rdi,rsp
      b61d1a:	e8 f7 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61d1f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61d24:	48 85 ff             	test   rdi,rdi
      b61d27:	74 06                	je     b61d2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaeccf>
      b61d29:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61d2c:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61d2f:	6a 08                	push   0x8
      b61d31:	5f                   	pop    rdi
      b61d32:	e8 c9 c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d37:	48 8d 0d 02 29 cb 00 	lea    rcx,[rip+0xcb2902]        # 1814640 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa300>
      b61d3e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61d41:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61d46:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61d49:	48 89 e7             	mov    rdi,rsp
      b61d4c:	e8 c5 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61d51:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61d56:	48 85 ff             	test   rdi,rdi
      b61d59:	74 06                	je     b61d61 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaed01>
      b61d5b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61d5e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61d61:	6a 08                	push   0x8
      b61d63:	5f                   	pop    rdi
      b61d64:	e8 97 c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d69:	48 8d 0d 50 99 cb 00 	lea    rcx,[rip+0xcb9950]        # 181b6c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11380>
      b61d70:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61d73:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61d78:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61d7b:	48 89 e7             	mov    rdi,rsp
      b61d7e:	e8 93 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61d83:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61d88:	48 85 ff             	test   rdi,rdi
      b61d8b:	74 06                	je     b61d93 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaed33>
      b61d8d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61d90:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61d93:	6a 08                	push   0x8
      b61d95:	5f                   	pop    rdi
      b61d96:	e8 65 c1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61d7e; FDE=(11925239, 11936142)
      b61d32:	e8 c9 c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d37:	48 8d 0d 02 29 cb 00 	lea    rcx,[rip+0xcb2902]        # 1814640 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa300>
      b61d3e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61d41:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61d46:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61d49:	48 89 e7             	mov    rdi,rsp
      b61d4c:	e8 c5 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61d51:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61d56:	48 85 ff             	test   rdi,rdi
      b61d59:	74 06                	je     b61d61 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaed01>
      b61d5b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61d5e:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61d61:	6a 08                	push   0x8
      b61d63:	5f                   	pop    rdi
      b61d64:	e8 97 c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d69:	48 8d 0d 50 99 cb 00 	lea    rcx,[rip+0xcb9950]        # 181b6c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11380>
      b61d70:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61d73:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61d78:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61d7b:	48 89 e7             	mov    rdi,rsp
      b61d7e:	e8 93 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61d83:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61d88:	48 85 ff             	test   rdi,rdi
      b61d8b:	74 06                	je     b61d93 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaed33>
      b61d8d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61d90:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61d93:	6a 08                	push   0x8
      b61d95:	5f                   	pop    rdi
      b61d96:	e8 65 c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d9b:	48 8d 0d de 98 cb 00 	lea    rcx,[rip+0xcb98de]        # 181b680 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11340>
      b61da2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61da5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61daa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61dad:	48 89 e7             	mov    rdi,rsp
      b61db0:	e8 61 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61db5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61dba:	48 85 ff             	test   rdi,rdi
      b61dbd:	74 06                	je     b61dc5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaed65>
      b61dbf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61dc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61dc5:	6a 08                	push   0x8
      b61dc7:	5f                   	pop    rdi
      b61dc8:	e8 33 c1 c8 00       	call   17edf00 <_Znwm@plt>

### call 0xb61db0; FDE=(11925239, 11936142)
      b61d64:	e8 97 c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d69:	48 8d 0d 50 99 cb 00 	lea    rcx,[rip+0xcb9950]        # 181b6c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11380>
      b61d70:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61d73:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61d78:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61d7b:	48 89 e7             	mov    rdi,rsp
      b61d7e:	e8 93 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61d83:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61d88:	48 85 ff             	test   rdi,rdi
      b61d8b:	74 06                	je     b61d93 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaed33>
      b61d8d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61d90:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61d93:	6a 08                	push   0x8
      b61d95:	5f                   	pop    rdi
      b61d96:	e8 65 c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d9b:	48 8d 0d de 98 cb 00 	lea    rcx,[rip+0xcb98de]        # 181b680 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11340>
      b61da2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61da5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61daa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61dad:	48 89 e7             	mov    rdi,rsp
      b61db0:	e8 61 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61db5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61dba:	48 85 ff             	test   rdi,rdi
      b61dbd:	74 06                	je     b61dc5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaed65>
      b61dbf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61dc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61dc5:	6a 08                	push   0x8
      b61dc7:	5f                   	pop    rdi
      b61dc8:	e8 33 c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61dcd:	48 8d 0d ec 6c ce 00 	lea    rcx,[rip+0xce6cec]        # 1848ac0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x51a8>
      b61dd4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61dd7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61ddc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61ddf:	48 89 e7             	mov    rdi,rsp
      b61de2:	e8 2f bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61de7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61dec:	48 85 ff             	test   rdi,rdi
      b61def:	74 06                	je     b61df7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaed97>
      b61df1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61df4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61df7:	48 89 e7             	mov    rdi,rsp
      b61dfa:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
      b61dfd:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0

### call 0xb61de2; FDE=(11925239, 11936142)
      b61d96:	e8 65 c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61d9b:	48 8d 0d de 98 cb 00 	lea    rcx,[rip+0xcb98de]        # 181b680 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11340>
      b61da2:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61da5:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61daa:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61dad:	48 89 e7             	mov    rdi,rsp
      b61db0:	e8 61 bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61db5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61dba:	48 85 ff             	test   rdi,rdi
      b61dbd:	74 06                	je     b61dc5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaed65>
      b61dbf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61dc2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61dc5:	6a 08                	push   0x8
      b61dc7:	5f                   	pop    rdi
      b61dc8:	e8 33 c1 c8 00       	call   17edf00 <_Znwm@plt>
      b61dcd:	48 8d 0d ec 6c ce 00 	lea    rcx,[rip+0xce6cec]        # 1848ac0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x51a8>
      b61dd4:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61dd7:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61ddc:	48 89 06             	mov    QWORD PTR [rsi],rax
      b61ddf:	48 89 e7             	mov    rdi,rsp
      b61de2:	e8 2f bd f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b61de7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b61dec:	48 85 ff             	test   rdi,rdi
      b61def:	74 06                	je     b61df7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaed97>
      b61df1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61df4:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b61df7:	48 89 e7             	mov    rdi,rsp
      b61dfa:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
      b61dfd:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      b61e00:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      b61e04:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      b61e08:	0f 57 c0             	xorps  xmm0,xmm0
      b61e0b:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      b61e0e:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      b61e13:	e8 9e 27 f5 ff       	call   ab45b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1556>
      b61e18:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b61e1f:	00 00 
      b61e21:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      b61e26:	0f 85 5d 03 00 00    	jne    b62189 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf129>
      b61e2c:	48 83 c4 28          	add    rsp,0x28
      b61e30:	5b                   	pop    rbx
      b61e31:	5d                   	pop    rbp
      b61e32:	c3                   	ret

### call 0x13f7f1b; FDE=(20937520, 20940262)
     13f7ec9:	48 2b 4c 24 58       	sub    rcx,QWORD PTR [rsp+0x58]
     13f7ece:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     13f7ed2:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     13f7ed7:	89 48 10             	mov    DWORD PTR [rax+0x10],ecx
     13f7eda:	48 8d 0d ff 72 47 00 	lea    rcx,[rip+0x4772ff]        # 186f1e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2b8c8>
     13f7ee1:	48 89 08             	mov    QWORD PTR [rax],rcx
     13f7ee4:	4c 89 70 18          	mov    QWORD PTR [rax+0x18],r14
     13f7ee8:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     13f7eed:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     13f7ef1:	48 85 c9             	test   rcx,rcx
     13f7ef4:	74 05                	je     13f7efb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23d47f>
     13f7ef6:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     13f7efb:	4c 29 fd             	sub    rbp,r15
     13f7efe:	4c 89 78 28          	mov    QWORD PTR [rax+0x28],r15
     13f7f02:	48 89 68 30          	mov    QWORD PTR [rax+0x30],rbp
     13f7f06:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     13f7f0d:	00 
     13f7f0e:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     13f7f13:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
     13f7f1a:	00 
     13f7f1b:	e8 f6 5b 6e ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
     13f7f20:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
     13f7f25:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     13f7f2c:	00 
     13f7f2d:	48 85 ff             	test   rdi,rdi
     13f7f30:	48 8b 6c 24 50       	mov    rbp,QWORD PTR [rsp+0x50]
     13f7f35:	74 06                	je     13f7f3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23d4c1>
     13f7f37:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13f7f3a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13f7f3d:	44 03 64 24 08       	add    r12d,DWORD PTR [rsp+0x8]
     13f7f42:	48 ff c3             	inc    rbx
     13f7f45:	48 3b 5c 24 68       	cmp    rbx,QWORD PTR [rsp+0x68]
     13f7f4a:	0f 82 5a ff ff ff    	jb     13f7eaa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23d42e>
     13f7f50:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
     13f7f54:	83 62 58 00          	and    DWORD PTR [rdx+0x58],0x0
     13f7f58:	48 8d 05 69 fb 53 00 	lea    rax,[rip+0x53fb69]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     13f7f5f:	48 89 42 60          	mov    QWORD PTR [rdx+0x60],rax
     13f7f63:	6a 53                	push   0x53
     13f7f65:	41 5c                	pop    r12
     13f7f67:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     13f7f6c:	80 ba 38 01 00 00 00 	cmp    BYTE PTR [rdx+0x138],0x0
     13f7f73:	0f 84 c4 04 00 00    	je     13f843d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23d9c1>
     13f7f79:	41 89 f7             	mov    r15d,esi

### call 0x13f8a73; FDE=(20940262, 20941561)
     13f8a2a:	0f 84 b3 fc ff ff    	je     13f86e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23dc67>
     13f8a30:	4d 8b 6f 08          	mov    r13,QWORD PTR [r15+0x8]
     13f8a34:	49 8b 5f 10          	mov    rbx,QWORD PTR [r15+0x10]
     13f8a38:	49 39 dd             	cmp    r13,rbx
     13f8a3b:	74 54                	je     13f8a91 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23e015>
     13f8a3d:	41 c6 86 39 01 00 00 	mov    BYTE PTR [r14+0x139],0x1
     13f8a44:	01 
     13f8a45:	4d 89 f7             	mov    r15,r14
     13f8a48:	49 83 c7 08          	add    r15,0x8
     13f8a4c:	49 8b 6d 00          	mov    rbp,QWORD PTR [r13+0x0]
     13f8a50:	6a 38                	push   0x38
     13f8a52:	5f                   	pop    rdi
     13f8a53:	e8 a8 54 3f 00       	call   17edf00 <_Znwm@plt>
     13f8a58:	49 89 c4             	mov    r12,rax
     13f8a5b:	48 89 c7             	mov    rdi,rax
     13f8a5e:	48 89 ee             	mov    rsi,rbp
     13f8a61:	e8 46 0a 00 00       	call   13f94ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23ea30>
     13f8a66:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
     13f8a6b:	4c 89 ff             	mov    rdi,r15
     13f8a6e:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     13f8a73:	e8 9e 50 6e ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
     13f8a78:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     13f8a7d:	48 85 ff             	test   rdi,rdi
     13f8a80:	74 06                	je     13f8a88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23e00c>
     13f8a82:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13f8a85:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13f8a88:	49 83 c5 08          	add    r13,0x8
     13f8a8c:	49 39 dd             	cmp    r13,rbx
     13f8a8f:	75 bb                	jne    13f8a4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23dfd0>
     13f8a91:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
     13f8a96:	e9 48 fc ff ff       	jmp    13f86e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23dc67>
     13f8a9b:	eb 1b                	jmp    13f8ab8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23e03c>
     13f8a9d:	eb 19                	jmp    13f8ab8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23e03c>
     13f8a9f:	eb 17                	jmp    13f8ab8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23e03c>
     13f8aa1:	48 89 c3             	mov    rbx,rax
     13f8aa4:	4c 89 e7             	mov    rdi,r12
     13f8aa7:	e8 7c 2c 68 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13f8aac:	4c 89 ef             	mov    rdi,r13
     13f8aaf:	e8 6c 54 3f 00       	call   17edf20 <_ZdlPv@plt>
     13f8ab4:	eb 1a                	jmp    13f8ad0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23e054>
     13f8ab6:	eb 00                	jmp    13f8ab8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23e03c>
     13f8ab8:	48 89 c3             	mov    rbx,rax
     13f8abb:	eb 13                	jmp    13f8ad0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23e054>

## Registrar callees and literals
- call @0xaddba3: call   17edf00 <_Znwm@plt>
- call @0xaddc15: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
- call @0xaddc24: call   17edf20 <_ZdlPv@plt>
- call @0xaddc39: call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
- call @0xaddc3e: call   a7b6df <JNI_OnUnload@@Base+0x2fac>

## Provider construction block around 0xb6162f
  b61581:	48 85 ff             	test   rdi,rdi
  b61584:	74 06                	je     b6158c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae52c>
  b61586:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b61589:	ff 50 08             	call   QWORD PTR [rax+0x8]
  b6158c:	6a 08                	push   0x8
  b6158e:	5f                   	pop    rdi
  b6158f:	e8 6c c9 c8 00       	call   17edf00 <_Znwm@plt>
  b61594:	48 8d 0d cd fd cf 00 	lea    rcx,[rip+0xcffdcd]        # 1861368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1da50>
  b6159b:	48 89 08             	mov    QWORD PTR [rax],rcx
  b6159e:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b615a3:	48 89 06             	mov    QWORD PTR [rsi],rax
  b615a6:	48 89 e7             	mov    rdi,rsp
  b615a9:	e8 68 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b615ae:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b615b3:	48 85 ff             	test   rdi,rdi
  b615b6:	74 06                	je     b615be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae55e>
  b615b8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b615bb:	ff 50 08             	call   QWORD PTR [rax+0x8]
  b615be:	6a 08                	push   0x8
  b615c0:	5f                   	pop    rdi
  b615c1:	e8 3a c9 c8 00       	call   17edf00 <_Znwm@plt>
  b615c6:	48 8d 0d f3 ed cf 00 	lea    rcx,[rip+0xcfedf3]        # 18603c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1caa8>
  b615cd:	48 89 08             	mov    QWORD PTR [rax],rcx
  b615d0:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b615d5:	48 89 06             	mov    QWORD PTR [rsi],rax
  b615d8:	48 89 e7             	mov    rdi,rsp
  b615db:	e8 36 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b615e0:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b615e5:	48 85 ff             	test   rdi,rdi
  b615e8:	74 06                	je     b615f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae590>
  b615ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b615ed:	ff 50 08             	call   QWORD PTR [rax+0x8]
  b615f0:	6a 08                	push   0x8
  b615f2:	5f                   	pop    rdi
  b615f3:	e8 08 c9 c8 00       	call   17edf00 <_Znwm@plt>
  b615f8:	48 8d 0d 31 09 d1 00 	lea    rcx,[rip+0xd10931]        # 1871f30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e618>
  b615ff:	48 89 08             	mov    QWORD PTR [rax],rcx
  b61602:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b61607:	48 89 06             	mov    QWORD PTR [rsi],rax
  b6160a:	48 89 e7             	mov    rdi,rsp
  b6160d:	e8 04 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b61612:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b61617:	48 85 ff             	test   rdi,rdi
  b6161a:	74 06                	je     b61622 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae5c2>
  b6161c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b6161f:	ff 50 08             	call   QWORD PTR [rax+0x8]
  b61622:	40 84 ed             	test   bpl,bpl
  b61625:	74 64                	je     b6168b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae62b>
  b61627:	6a 08                	push   0x8
  b61629:	5f                   	pop    rdi
  b6162a:	e8 d1 c8 c8 00       	call   17edf00 <_Znwm@plt>
  b6162f:	48 8d 0d 9a a2 cf 00 	lea    rcx,[rip+0xcfa29a]        # 185b8d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17fb8>
  b61636:	48 89 08             	mov    QWORD PTR [rax],rcx
  b61639:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b6163e:	48 89 06             	mov    QWORD PTR [rsi],rax
  b61641:	48 89 e7             	mov    rdi,rsp
  b61644:	e8 cd c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b61649:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b6164e:	48 85 ff             	test   rdi,rdi
  b61651:	74 06                	je     b61659 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae5f9>
  b61653:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b61656:	ff 50 08             	call   QWORD PTR [rax+0x8]
  b61659:	6a 08                	push   0x8
  b6165b:	5f                   	pop    rdi
  b6165c:	e8 9f c8 c8 00       	call   17edf00 <_Znwm@plt>
  b61661:	48 8d 0d e0 a0 cb 00 	lea    rcx,[rip+0xcba0e0]        # 181b748 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11408>
  b61668:	48 89 08             	mov    QWORD PTR [rax],rcx
  b6166b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b61670:	48 89 06             	mov    QWORD PTR [rsi],rax
  b61673:	48 89 e7             	mov    rdi,rsp
  b61676:	e8 9b c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b6167b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b61680:	48 85 ff             	test   rdi,rdi
  b61683:	74 06                	je     b6168b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae62b>
  b61685:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b61688:	ff 50 08             	call   QWORD PTR [rax+0x8]
  b6168b:	6a 08                	push   0x8
  b6168d:	5f                   	pop    rdi
  b6168e:	e8 6d c8 c8 00       	call   17edf00 <_Znwm@plt>
  b61693:	48 8d 0d 46 9f cc 00 	lea    rcx,[rip+0xcc9f46]        # 182b5e0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7c10>
  b6169a:	48 89 08             	mov    QWORD PTR [rax],rcx
  b6169d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b616a2:	48 89 06             	mov    QWORD PTR [rsi],rax
  b616a5:	48 89 e7             	mov    rdi,rsp
  b616a8:	e8 69 c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b616ad:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]

## Neighbor provider APs and +0x28 targets
- construct-ref 0xb60021: AP=0x182b128, +0x28=0xde18c0, FDE=(14555328, 14555547)
- construct-ref 0xb60053: AP=0x18197c0, +0x28=0xc53694, FDE=(12924564, 12925001)
- construct-ref 0xb60085: AP=0x1819780, +0x28=0xc53592, FDE=(12924306, 12924462)
- construct-ref 0xb600b7: AP=0x1819740, +0x28=0xc53490, FDE=(12924048, 12924204)
- construct-ref 0xb600e9: AP=0x1821318, +0x28=0xcf7acc, FDE=(13597388, 13598132)
- construct-ref 0xb6011b: AP=0x18212d8, +0x28=0xcf78ec, FDE=(13596908, 13597215)
- construct-ref 0xb6014d: AP=0x18120d0, +0x28=0xbcf44a, FDE=(12383306, 12385437)
- construct-ref 0xb6017f: AP=0x1811900, +0x28=0xbc736c, FDE=(12350316, 12350937)
- construct-ref 0xb601b1: AP=0x1811db0, +0x28=0xbcdc32, FDE=(12377138, 12377464)
- construct-ref 0xb601e3: AP=0x1811d70, +0x28=0xbcdb18, FDE=(12376856, 12377035)
- construct-ref 0xb60215: AP=0x180e568, +0x28=0xb9135a, FDE=(12129114, 12129548)
- construct-ref 0xb60247: AP=0x180e730, +0x28=0xb91e52, FDE=(12131922, 12132217)
- construct-ref 0xb60279: AP=0x181b7c0, +0x28=0xc7d68a, FDE=(13096586, 13096675)
- construct-ref 0xb602ab: AP=0x181b5c0, +0x28=0xc7c8e6, FDE=(13093094, 13093692)
- construct-ref 0xb602dd: AP=0x181bac8, +0x28=0xc7f888, FDE=(13105288, 13105464)
- construct-ref 0xb6030f: AP=0x1859e58, +0x28=0x11ac39c, FDE=(18531228, 18531371)
- construct-ref 0xb60341: AP=0x1813450, +0x28=0xbf5a30, FDE=(12540464, 12540886)
- construct-ref 0xb60373: AP=0x181ebd0, +0x28=0xcb42f4, FDE=(13320948, 13321013)
- construct-ref 0xb603a5: AP=0x1812a40, +0x28=0xbd8d18, FDE=(12422424, 12423755)
- construct-ref 0xb603d7: AP=0x18132d0, +0x28=0xbf4a6a, FDE=(12536426, 12536813)
- construct-ref 0xb60409: AP=0x1811a80, +0x28=0xbc7e9e, FDE=(12353182, 12353477)
- construct-ref 0xb6043b: AP=0x1812800, +0x28=0xbd7146, FDE=(12415302, 12416451)
- construct-ref 0xb6046d: AP=0x1811c28, +0x28=0xbc8848, FDE=(12355656, 12356998)
- construct-ref 0xb6049f: AP=0x186a678, +0x28=0x13a5df2, FDE=(20602354, 20602865)
- construct-ref 0xb604d1: AP=0x1871108, +0x28=0x1438464, FDE=(21202020, 21202398)
- construct-ref 0xb60503: AP=0x18711a8, +0x28=0x1438686, FDE=(21202566, 21202706)
- construct-ref 0xb60535: AP=0x181b878, +0x28=0xc7d936, FDE=(13097270, 13097768)
- construct-ref 0xb60567: AP=0x1854768, +0x28=0x1141d8c, FDE=(18095500, 18100798)
- construct-ref 0xb60599: AP=0x181b838, +0x28=0xc7d75a, FDE=(13096794, 13097075)
- construct-ref 0xb605cb: AP=0x1854728, +0x28=0x1141c8a, FDE=(18095242, 18095398)
- construct-ref 0xb605fd: AP=0x1854278, +0x28=0x113f5bc, FDE=(18085308, 18085519)
- construct-ref 0xb6062f: AP=0x1854238, +0x28=0x113f49c, FDE=(18085020, 18085206)
- construct-ref 0xb60661: AP=0x1853fe8, +0x28=0x113d91a, FDE=(18077978, 18078327)
- construct-ref 0xb60693: AP=0x1853fa8, +0x28=0x113d7fc, FDE=(18077692, 18077876)
- construct-ref 0xb606c5: AP=0x18546e8, +0x28=0x1141ba4, FDE=(18095012, 18095136)
- construct-ref 0xb606f7: AP=0x180ce78, +0x28=0xb623ac, FDE=(11936684, 11940468)
- construct-ref 0xb60729: AP=0x180ce38, +0x28=0xb621a6, FDE=(11936166, 11936478)
- construct-ref 0xb6075b: AP=0x1812220, +0x28=0xbd0ca2, FDE=(12389538, 12390399)
- construct-ref 0xb6078d: AP=0x181ef58, +0x28=0xcb6e5a, FDE=(13332058, 13333660)
- construct-ref 0xb607bf: AP=0x18121e0, +0x28=0xbd0b74, FDE=(12389236, 12389436)
- construct-ref 0xb607f1: AP=0x1853cb8, +0x28=0x113b9b4, FDE=(18069940, 18071154)
- construct-ref 0xb60823: AP=0x1853c78, +0x28=0x113b8be, FDE=(18069694, 18069850)
- construct-ref 0xb60855: AP=0x181e398, +0x28=0xcab824, FDE=(13285412, 13287832)
- construct-ref 0xb60887: AP=0x181e458, +0x28=0xcac24a, FDE=(13288010, 13288298)
- construct-ref 0xb608b9: AP=0x1817028, +0x28=0xc2c520, FDE=(12764448, 12771716)
- construct-ref 0xb608eb: AP=0x1816fe8, +0x28=0xc2c41e, FDE=(12764190, 12764346)
- construct-ref 0xb6091d: AP=0x181c8b0, +0x28=0xc88e08, FDE=(13143560, 13145564)
- construct-ref 0xb6094f: AP=0x18487d0, +0x28=0x1068d40, FDE=(17206592, 17207928)
- construct-ref 0xb60981: AP=0x1821ef8, +0x28=0xd06ea8, FDE=(13659816, 13660532)
- construct-ref 0xb609b3: AP=0x1818868, +0x28=0xc458d2, FDE=(12867794, 12868222)
- construct-ref 0xb609e5: AP=0x1849668, +0x28=0x1077eae, FDE=(17268398, 17273006)
- construct-ref 0xb60a17: AP=0x1849bc8, +0x28=0x1080a18, FDE=(17304088, 17305695)
- construct-ref 0xb60a49: AP=0x180e110, +0x28=0xb8b162, FDE=(12104034, 12104178)
- construct-ref 0xb60a7b: AP=0x18176d0, +0x28=0xc350c6, FDE=(12800198, 12804560)
- construct-ref 0xb60aad: AP=0x1817690, +0x28=0xc34eee, FDE=(12799726, 12799945)
- construct-ref 0xb60adf: AP=0x1847f30, +0x28=0x105752a, FDE=(17134890, 17135033)
- construct-ref 0xb60b11: AP=0x185b828, +0x28=0x11edf72, FDE=(18800498, 18800841)
- construct-ref 0xb60b43: AP=0x184ca50, +0x28=0x10ab7ae, FDE=(17479598, 17480245)
- construct-ref 0xb60b75: AP=0x180dc50, +0x28=0xb86086, FDE=(12083334, 12091202)
- construct-ref 0xb60ba7: AP=0x180dbd0, +0x28=0xb855e4, FDE=(12080612, 12083069)
- construct-ref 0xb60bd9: AP=0x1867ae8, +0x28=0x135a74c, FDE=(20293452, 20300282)
- construct-ref 0xb60c0b: AP=0x180e190, +0x28=0xb8b252, FDE=(12104274, 12104677)
- construct-ref 0xb60c3d: AP=0x184c6a8, +0x28=0x10a578a, FDE=(17454986, 17456429)
- construct-ref 0xb60c6f: AP=0x1867300, +0x28=0x13524a4, FDE=(20260004, 20264020)
- construct-ref 0xb60ca1: AP=0x185a808, +0x28=0x11c70ee, FDE=(18641134, 18644653)
- construct-ref 0xb60cd3: AP=0x1867c58, +0x28=0x135c878, FDE=(20301944, 20303957)
- construct-ref 0xb60d05: AP=0x1871798, +0x28=0x1441ff6, FDE=(21241846, 21243183)
- construct-ref 0xb60d37: AP=0x184ea18, +0x28=0x10d0b1a, FDE=(17632026, 17632856)
- construct-ref 0xb60d69: AP=0x184dcb0, +0x28=0x10c157e, FDE=(17569150, 17572832)
- construct-ref 0xb60d9b: AP=0x184dc28, +0x28=0x10c0d98, FDE=(17567128, 17567640)
- construct-ref 0xb60dcd: AP=0x184e9d8, +0x28=0x10d0826, FDE=(17631270, 17631522)
- construct-ref 0xb60dff: AP=0x1830430, +0x28=0xe7bab0, FDE=(15186608, 15186771)
- construct-ref 0xb60e31: AP=0x1853b00, +0x28=0x113968e, FDE=(18060942, 18061469)
- construct-ref 0xb60e63: AP=0x1846c20, +0x28=0x104577a, FDE=(17061754, 17068268)
- construct-ref 0xb60e95: AP=0x18479f0, +0x28=0x1050f46, FDE=(17108806, 17109712)
- construct-ref 0xb60ec7: AP=0x182c700, +0x28=0xdfcace, FDE=(14666446, 14668187)
- construct-ref 0xb60ef9: AP=0x182b7b8, +0x28=0xde75ee, FDE=(14579182, 14583796)
- construct-ref 0xb60f2b: AP=0x182b778, +0x28=0xde746a, FDE=(14578794, 14579061)
- construct-ref 0xb60f5d: AP=0x182bd00, +0x28=0xdf3140, FDE=(14627136, 14627377)
- construct-ref 0xb60f8f: AP=0x182b738, +0x28=0xde7350, FDE=(14578512, 14578692)
- construct-ref 0xb60fc1: AP=0x182b6f8, +0x28=0xde7224, FDE=(14578212, 14578363)
- construct-ref 0xb60ff3: AP=0x181b518, +0x28=0xc7c15a, FDE=(13091162, 13091611)
- construct-ref 0xb61025: AP=0x181cc90, +0x28=0xc8f300, FDE=(13169408, 13169703)
- construct-ref 0xb61057: AP=0x181f618, +0x28=0xcc09ba, FDE=(13371834, 13372341)
- construct-ref 0xb6108e: AP=0x1867c18, +0x28=0x135c77e, FDE=(20301694, 20301915)
- construct-ref 0xb610b2: AP=0x181f5d8, +0x28=0xcc055a, FDE=(13370714, 13370891)
- construct-ref 0xb610e4: AP=0x181eed8, +0x28=0xcb5f9c, FDE=(13328284, 13331598)
- construct-ref 0xb61116: AP=0x18196c8, +0x28=0xc52de6, FDE=(12922342, 12923808)
- construct-ref 0xb61148: AP=0x181ee18, +0x28=0xcb5ab0, FDE=(13327024, 13327686)
- construct-ref 0xb6117a: AP=0x18476c0, +0x28=0x104de6c, FDE=(17096300, 17097038)
- construct-ref 0xb611ac: AP=0x184ca10, +0x28=0x10ab2de, FDE=(17478366, 17478875)
- construct-ref 0xb611de: AP=0x1851730, +0x28=0x110f0a4, FDE=(17887396, 17888118)
- construct-ref 0xb61210: AP=0x1847978, +0x28=0x1050caa, FDE=(17108138, 17108488)
- construct-ref 0xb61242: AP=0x182b558, +0x28=0xde44ca, FDE=(14566602, 14569143)
- construct-ref 0xb61274: AP=0x182b620, +0x28=0xde53c0, FDE=(14570432, 14576757)
- construct-ref 0xb612a6: AP=0x1847c28, +0x28=0x1053256, FDE=(17117782, 17118066)
- construct-ref 0xb612d8: AP=0x1847b48, +0x28=0x1052c40, FDE=(17116224, 17116724)
- construct-ref 0xb6130a: AP=0x1830378, +0x28=0xe7b560, FDE=(15185248, 15186266)
- construct-ref 0xb6133c: AP=0x1847f70, +0x28=0x10575d6, FDE=(17135062, 17141564)
- construct-ref 0xb6136e: AP=0x1831120, +0x28=0xe8b77a, FDE=(15251322, 15251962)
- construct-ref 0xb613a0: AP=0x1830580, +0x28=0xe7dbb2, FDE=(15195058, 15199106)
- construct-ref 0xb613d2: AP=0x1830540, +0x28=0xe7da86, FDE=(15194758, 15194914)
- construct-ref 0xb61404: AP=0x18146c0, +0x28=0xc05d20, FDE=(12606752, 12612174)
- construct-ref 0xb61436: AP=0x1831230, +0x28=0xe8c65c, FDE=(15255132, 15263896)
- construct-ref 0xb61468: AP=0x184a728, +0x28=0x108853a, FDE=(17335610, 17338257)
- construct-ref 0xb6149a: AP=0x1830970, +0x28=0xe82552, FDE=(15213906, 15215117)
- construct-ref 0xb614cc: AP=0x1830ba8, +0x28=0xe84b9c, FDE=(15223708, 15224054)
- construct-ref 0xb614fe: AP=0x18491e8, +0x28=0x10731f4, FDE=(17248756, 17253227)
- construct-ref 0xb61530: AP=0x182b4d8, +0x28=0xde38ca, FDE=(14563530, 14564647)
- construct-ref 0xb61562: AP=0x1860a40, +0x28=0x128a7ec, FDE=(19441644, 19441779)
- construct-ref 0xb61594: AP=0x1861368, +0x28=0x1294f7a, FDE=(19484538, 19488877)
- construct-ref 0xb615c6: AP=0x18603c0, +0x28=0x127d89c, FDE=(19388572, 19389810)
- construct-ref 0xb615f8: AP=0x1871f30, +0x28=0x144e012, FDE=(21291026, 21291578)
- construct-ref 0xb6162f: AP=0x185b8d0, +0x28=0x11ee608, FDE=(18802184, 18804775)
- construct-ref 0xb61661: AP=0x181b748, +0x28=0xc7d45e, FDE=(13096030, 13096412)
- construct-ref 0xb61693: AP=0x182b5e0, +0x28=0xde5010, FDE=(14569488, 14569929)
- construct-ref 0xb616c5: AP=0x1851990, +0x28=0x111a264, FDE=(17932900, 17936952)
- construct-ref 0xb616f7: AP=0x1851a98, +0x28=0x111b538, FDE=(17937720, 17937901)
- construct-ref 0xb61729: AP=0x184b5f0, +0x28=0x109917a, FDE=(17404282, 17407345)
- construct-ref 0xb6175b: AP=0x184b5b0, +0x28=0x1098c64, FDE=(17402980, 17403914)
- construct-ref 0xb6178d: AP=0x1848d08, +0x28=0x106dd98, FDE=(17227160, 17228351)
- construct-ref 0xb617bf: AP=0x1848d48, +0x28=0x106e2e0, FDE=(17228512, 17230671)
- construct-ref 0xb617f1: AP=0x1849578, +0x28=0x1076606, FDE=(17262086, 17266362)
- construct-ref 0xb61823: AP=0x1849628, +0x28=0x1077cc6, FDE=(17267910, 17268222)
- construct-ref 0xb61855: AP=0x18494f8, +0x28=0x1076276, FDE=(17261174, 17261486)
- construct-ref 0xb61887: AP=0x18493b8, +0x28=0x1074aca, FDE=(17255114, 17258939)
- construct-ref 0xb618b9: AP=0x18494b8, +0x28=0x1076074, FDE=(17260660, 17260997)
- construct-ref 0xb618eb: AP=0x1849538, +0x28=0x107648a, FDE=(17261706, 17261950)
- construct-ref 0xb6191d: AP=0x1856c28, +0x28=0x1173426, FDE=(18297894, 18300772)
- construct-ref 0xb6194f: AP=0x1856be8, +0x28=0x11732bc, FDE=(18297532, 18297764)
- construct-ref 0xb61981: AP=0x1815b18, +0x28=0xc10d28, FDE=(12651816, 12654332)
- construct-ref 0xb619b3: AP=0x1815c30, +0x28=0xc11cd6, FDE=(12655830, 12656009)
- construct-ref 0xb619e5: AP=0x1849b88, +0x28=0x108067e, FDE=(17303166, 17303753)
- construct-ref 0xb61a17: AP=0x182a8f8, +0x28=0xdda4fa, FDE=(14525690, 14532001)
- construct-ref 0xb61a49: AP=0x182a8b8, +0x28=0xdd974a, FDE=(14522186, 14522703)
- construct-ref 0xb61a7b: AP=0x182a3f8, +0x28=0xdcdc4e, FDE=(14474318, 14478530)
- construct-ref 0xb61aad: AP=0x1850cd0, +0x28=0x10ff080, FDE=(17821824, 17822537)
- construct-ref 0xb61adf: AP=0x1850c90, +0x28=0x10fed0c, FDE=(17820940, 17821519)
- construct-ref 0xb61b11: AP=0x1854eb0, +0x28=0x1147c20, FDE=(18119712, 18125356)
- construct-ref 0xb61b43: AP=0x1854e70, +0x28=0x1147474, FDE=(18117748, 18119410)
- construct-ref 0xb61b75: AP=0x182b000, +0x28=0xddfdee, FDE=(14548462, 14549397)
- construct-ref 0xb61ba7: AP=0x181ea40, +0x28=0xcb3b32, FDE=(13318962, 13319304)
- construct-ref 0xb61bd9: AP=0x182b278, +0x28=0xde245a, FDE=(14558298, 14558334)
- construct-ref 0xb61c0b: AP=0x182b238, +0x28=0xde2380, FDE=(14558080, 14558204)
- construct-ref 0xb61c3d: AP=0x184b260, +0x28=0x1095494, FDE=(17388692, 17389258)
- construct-ref 0xb61c6f: AP=0x184b220, +0x28=0x109535e, FDE=(17388382, 17388578)
- construct-ref 0xb61ca1: AP=0x180e0d0, +0x28=0xb8b06c, FDE=(12103788, 12103944)
- construct-ref 0xb61cd3: AP=0x180e388, +0x28=0xb8ec0a, FDE=(12119050, 12120109)
- construct-ref 0xb61d05: AP=0x1814680, +0x28=0xc05b22, FDE=(12606242, 12606573)
- construct-ref 0xb61d37: AP=0x1814640, +0x28=0xc05a06, FDE=(12605958, 12606140)
- construct-ref 0xb61d69: AP=0x181b6c0, +0x28=0xc7d2a6, FDE=(13095590, 13095843)
- construct-ref 0xb61d9b: AP=0x181b680, +0x28=0xc7d198, FDE=(13095320, 13095499)
- construct-ref 0xb61dcd: AP=0x1848ac0, +0x28=0x106ade2, FDE=(17214946, 17216924)
