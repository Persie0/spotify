# Secondary dispatcher constructor: service184 dependency -> this+8

## 0x11ef334 prologue and first argument loads

/tmp/arg9/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000011ef334 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348b8>:
 11ef334:	55                   	push   rbp
 11ef335:	41 57                	push   r15
 11ef337:	41 56                	push   r14
 11ef339:	41 55                	push   r13
 11ef33b:	41 54                	push   r12
 11ef33d:	53                   	push   rbx
 11ef33e:	48 81 ec 08 06 00 00 	sub    rsp,0x608
 11ef345:	4c 89 8c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r9
 11ef34c:	00 
 11ef34d:	4c 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r8
 11ef354:	00 
 11ef355:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
 11ef35a:	48 89 94 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rdx
 11ef361:	00 
 11ef362:	48 89 fb             	mov    rbx,rdi
 11ef365:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11ef36c:	00 00 
 11ef36e:	48 89 84 24 00 06 00 	mov    QWORD PTR [rsp+0x600],rax
 11ef375:	00 
 11ef376:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
 11ef37a:	48 8d 05 c7 c5 66 00 	lea    rax,[rip+0x66c5c7]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030>
 11ef381:	48 89 07             	mov    QWORD PTR [rdi],rax
 11ef384:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 11ef389:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
 11ef390:	00 
 11ef391:	48 8d 05 48 8a 7e ff 	lea    rax,[rip+0xffffffffff7e8a48]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11ef398:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 11ef39c:	48 8d 05 d7 3a 96 ff 	lea    rax,[rip+0xffffffffff963ad7]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
 11ef3a3:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
 11ef3a7:	48 8d 4b 30          	lea    rcx,[rbx+0x30]
 11ef3ab:	48 8d 05 16 c7 66 00 	lea    rax,[rip+0x66c716]        # 185bac8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181b0>
 11ef3b2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 11ef3b6:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
 11ef3bd:	00 
 11ef3be:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
 11ef3c2:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
 11ef3c7:	48 8b 86 fc 00 00 00 	mov    rax,QWORD PTR [rsi+0xfc]
 11ef3ce:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
 11ef3d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11ef3d5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11ef3d8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 11ef3db:	48 89 c7             	mov    rdi,rax
 11ef3de:	ff 51 38             	call   QWORD PTR [rcx+0x38]
 11ef3e1:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 11ef3e6:	48 83 a4 24 c0 04 00 	and    QWORD PTR [rsp+0x4c0],0x0
 11ef3ed:	00 00 
 11ef3ef:	48 8d 05 ea 89 7e ff 	lea    rax,[rip+0xffffffffff7e89ea]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11ef3f6:	48 89 84 24 d0 04 00 	mov    QWORD PTR [rsp+0x4d0],rax
 11ef3fd:	00 
 11ef3fe:	48 8d 05 45 1e a8 ff 	lea    rax,[rip+0xffffffffffa81e45]        # c7124a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be1ea>
 11ef405:	48 89 84 24 d8 04 00 	mov    QWORD PTR [rsp+0x4d8],rax
 11ef40c:	00 
 11ef40d:	48 8d 35 76 e8 17 ff 	lea    rsi,[rip+0xffffffffff17e876]        # 36dc8a <_ZTSSt12bad_any_cast@@Base-0x2253e>
 11ef414:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
 11ef41b:	00 
 11ef41c:	e8 5d a6 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11ef421:	48 8b b4 24 78 06 00 	mov    rsi,QWORD PTR [rsp+0x678]
 11ef428:	00 
 11ef429:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11ef42c:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11ef433:	00 
 11ef434:	48 8d 94 24 a0 05 00 	lea    rdx,[rsp+0x5a0]
 11ef43b:	00 
 11ef43c:	ff 50 20             	call   QWORD PTR [rax+0x20]
 11ef43f:	48 8b ac 24 d0 06 00 	mov    rbp,QWORD PTR [rsp+0x6d0]
 11ef446:	00 
 11ef447:	48 8d 43 68          	lea    rax,[rbx+0x68]
 11ef44b:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 11ef450:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11ef457:	00 
 11ef458:	e8 d9 c3 88 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 11ef45d:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
 11ef462:	48 89 54 24 70       	mov    QWORD PTR [rsp+0x70],rdx
 11ef467:	48 8d 8c 24 a0 04 00 	lea    rcx,[rsp+0x4a0]
 11ef46e:	00 
 11ef46f:	48 83 21 00          	and    QWORD PTR [rcx],0x0
 11ef473:	48 8d 05 66 89 7e ff 	lea    rax,[rip+0xffffffffff7e8966]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11ef47a:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 11ef47e:	48 8d 05 99 a2 07 00 	lea    rax,[rip+0x7a299]        # 126971e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaeca2>
 11ef485:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 11ef489:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef48d:	6a 64                	push   0x64
 11ef48f:	41 5d                	pop    r13
 11ef491:	6a 01                	push   0x1
 11ef493:	41 5c                	pop    r12
 11ef495:	48 8d 35 64 c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec864]        # 3dbd00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x174f>
 11ef49c:	48 8d 0d 7d c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec87d]        # 3dbd20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x176f>
 11ef4a3:	6a 14                	push   0x14
 11ef4a5:	41 5e                	pop    r14
 11ef4a7:	6a 1f                	push   0x1f
 11ef4a9:	41 58                	pop    r8
 11ef4ab:	6a 08                	push   0x8
 11ef4ad:	41 5f                	pop    r15
 11ef4af:	4c 89 f2             	mov    rdx,r14
 11ef4b2:	45 89 f9             	mov    r9d,r15d
 11ef4b5:	41 55                	push   r13
 11ef4b7:	41 54                	push   r12
 11ef4b9:	e8 34 81 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 11ef4be:	48 83 c4 10          	add    rsp,0x10
 11ef4c2:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef4c6:	48 8d 35 73 c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec873]        # 3dbd40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x178f>
 11ef4cd:	48 8d 0d 8c c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec88c]        # 3dbd60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17af>
 11ef4d4:	6a 20                	push   0x20
 11ef4d6:	41 58                	pop    r8
 11ef4d8:	4c 89 f2             	mov    rdx,r14
 11ef4db:	45 89 f9             	mov    r9d,r15d
 11ef4de:	41 55                	push   r13
 11ef4e0:	41 54                	push   r12
 11ef4e2:	e8 0b 81 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 11ef4e7:	48 83 c4 10          	add    rsp,0x10
 11ef4eb:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef4ef:	48 8d 35 9a c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec89a]        # 3dbd90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17df>
 11ef4f6:	48 8d 0d b3 c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec8b3]        # 3dbdb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17ff>
 11ef4fd:	4c 89 f2             	mov    rdx,r14
 11ef500:	6a 1f                	push   0x1f
 11ef502:	41 58                	pop    r8
 11ef504:	4d 89 c7             	mov    r15,r8
 11ef507:	45 89 e1             	mov    r9d,r12d
 11ef50a:	41 55                	push   r13
 11ef50c:	41 54                	push   r12
 11ef50e:	e8 df 80 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 11ef513:	48 83 c4 10          	add    rsp,0x10
 11ef517:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef51b:	48 8d 35 ae c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec8ae]        # 3dbdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x181f>
 11ef522:	48 8d 0d c7 c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec8c7]        # 3dbdf0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x183f>
 11ef529:	6a 17                	push   0x17
 11ef52b:	41 58                	pop    r8
 11ef52d:	4c 89 f2             	mov    rdx,r14
 11ef530:	45 89 e9             	mov    r9d,r13d
 11ef533:	68 f4 01 00 00       	push   0x1f4
 11ef538:	41 54                	push   r12
 11ef53a:	e8 b3 80 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 11ef53f:	48 83 c4 10          	add    rsp,0x10
 11ef543:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef547:	48 8d 35 c2 c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec8c2]        # 3dbe10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x185f>
 11ef54e:	48 8d 0d db c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec8db]        # 3dbe30 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x187f>
 11ef555:	6a 1a                	push   0x1a
 11ef557:	41 58                	pop    r8
 11ef559:	4c 89 f2             	mov    rdx,r14
 11ef55c:	41 b9 c8 00 00 00    	mov    r9d,0xc8
 11ef562:	68 e8 03 00 00       	push   0x3e8
 11ef567:	41 54                	push   r12
 11ef569:	e8 84 80 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 11ef56e:	48 83 c4 10          	add    rsp,0x10
 11ef572:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef576:	48 8d 35 d3 c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec8d3]        # 3dbe50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x189f>
 11ef57d:	48 8d 0d ec c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec8ec]        # 3dbe70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18bf>
 11ef584:	6a 18                	push   0x18
 11ef586:	41 58                	pop    r8
 11ef588:	4c 89 f2             	mov    rdx,r14
 11ef58b:	41 b9 b8 0b 00 00    	mov    r9d,0xbb8
 11ef591:	68 60 ea 00 00       	push   0xea60
 11ef596:	6a 00                	push   0x0
 11ef598:	e8 55 80 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 11ef59d:	48 83 c4 10          	add    rsp,0x10
 11ef5a1:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef5a5:	48 8d 35 e4 c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec8e4]        # 3dbe90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18df>
 11ef5ac:	48 8d 0d fd c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec8fd]        # 3dbeb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18ff>
 11ef5b3:	6a 1c                	push   0x1c
 11ef5b5:	41 58                	pop    r8
 11ef5b7:	4c 89 f2             	mov    rdx,r14
 11ef5ba:	41 b9 58 02 00 00    	mov    r9d,0x258
 11ef5c0:	68 80 51 01 00       	push   0x15180
 11ef5c5:	41 54                	push   r12
 11ef5c7:	e8 26 80 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
 11ef5cc:	48 83 c4 10          	add    rsp,0x10
 11ef5d0:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef5d4:	48 8d 35 25 c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec725]        # 3dbd00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x174f>
 11ef5db:	4c 89 f2             	mov    rdx,r14
 11ef5de:	48 8d 0d 3b c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec73b]        # 3dbd20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x176f>
 11ef5e5:	4d 89 f8             	mov    r8,r15
 11ef5e8:	6a 08                	push   0x8
 11ef5ea:	41 5d                	pop    r13
 11ef5ec:	45 89 e9             	mov    r9d,r13d
 11ef5ef:	e8 36 7e 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 11ef5f4:	89 44 24 08          	mov    DWORD PTR [rsp+0x8],eax
 11ef5f8:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef5fc:	48 8d 35 3d c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec73d]        # 3dbd40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x178f>
 11ef603:	4c 89 f2             	mov    rdx,r14
 11ef606:	48 8d 0d 53 c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec753]        # 3dbd60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17af>
 11ef60d:	6a 20                	push   0x20
 11ef60f:	41 58                	pop    r8
 11ef611:	45 89 e9             	mov    r9d,r13d
 11ef614:	e8 11 7e 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 11ef619:	89 44 24 20          	mov    DWORD PTR [rsp+0x20],eax
 11ef61d:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef621:	48 8d 35 68 c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec768]        # 3dbd90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17df>
 11ef628:	4c 89 f2             	mov    rdx,r14
 11ef62b:	48 8d 0d 7e c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec77e]        # 3dbdb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17ff>
 11ef632:	4d 89 f8             	mov    r8,r15
 11ef635:	45 89 e1             	mov    r9d,r12d
 11ef638:	e8 ed 7d 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 11ef63d:	89 44 24 58          	mov    DWORD PTR [rsp+0x58],eax
 11ef641:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef645:	48 8d 35 84 c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec784]        # 3dbdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x181f>
 11ef64c:	4c 89 f2             	mov    rdx,r14
 11ef64f:	48 8d 0d 9a c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec79a]        # 3dbdf0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x183f>
 11ef656:	6a 17                	push   0x17
 11ef658:	41 58                	pop    r8
 11ef65a:	6a 64                	push   0x64
 11ef65c:	41 59                	pop    r9
 11ef65e:	e8 c7 7d 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 11ef663:	89 44 24 30          	mov    DWORD PTR [rsp+0x30],eax
 11ef667:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef66b:	48 8d 35 9e c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec79e]        # 3dbe10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x185f>
 11ef672:	4c 89 f2             	mov    rdx,r14
 11ef675:	48 8d 0d b4 c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec7b4]        # 3dbe30 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x187f>
 11ef67c:	6a 1a                	push   0x1a
 11ef67e:	41 58                	pop    r8
 11ef680:	41 b9 c8 00 00 00    	mov    r9d,0xc8
 11ef686:	e8 9f 7d 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 11ef68b:	89 84 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],eax
 11ef692:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef696:	48 8d 35 b3 c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec7b3]        # 3dbe50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x189f>
 11ef69d:	4c 89 f2             	mov    rdx,r14
 11ef6a0:	48 8d 0d c9 c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec7c9]        # 3dbe70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18bf>
 11ef6a7:	6a 18                	push   0x18
 11ef6a9:	41 58                	pop    r8
 11ef6ab:	41 b9 b8 0b 00 00    	mov    r9d,0xbb8
 11ef6b1:	e8 74 7d 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 11ef6b6:	4c 63 e0             	movsxd r12,eax
 11ef6b9:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
 11ef6bd:	48 8d 35 cc c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec7cc]        # 3dbe90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18df>
 11ef6c4:	4c 89 f2             	mov    rdx,r14
 11ef6c7:	48 8d 0d e2 c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec7e2]        # 3dbeb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18ff>
 11ef6ce:	6a 1c                	push   0x1c
 11ef6d0:	41 58                	pop    r8
 11ef6d2:	41 b9 58 02 00 00    	mov    r9d,0x258
 11ef6d8:	e8 4d 7d 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 11ef6dd:	4c 63 f8             	movsxd r15,eax
 11ef6e0:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11ef6e7:	00 
 11ef6e8:	48 8d b4 24 c0 04 00 	lea    rsi,[rsp+0x4c0]
 11ef6ef:	00 
 11ef6f0:	4c 89 f7             	mov    rdi,r14
 11ef6f3:	e8 82 4a ab ff       	call   ca417a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f111a>
 11ef6f8:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 11ef6fd:	48 89 8c 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rcx
 11ef704:	00 
 11ef705:	48 8d 05 58 cd 88 ff 	lea    rax,[rip+0xffffffffff88cd58]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 11ef70c:	48 89 84 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rax
 11ef713:	00 
 11ef714:	48 8d 05 87 a0 07 00 	lea    rax,[rip+0x7a087]        # 12697a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaed26>
 11ef71b:	48 89 84 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rax
 11ef722:	00 
 11ef723:	48 89 8c 24 50 05 00 	mov    QWORD PTR [rsp+0x550],rcx
 11ef72a:	00 
 11ef72b:	48 8d 05 32 cd 88 ff 	lea    rax,[rip+0xffffffffff88cd32]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 11ef732:	48 89 84 24 60 05 00 	mov    QWORD PTR [rsp+0x560],rax
 11ef739:	00 
 11ef73a:	48 8d 05 7f a0 07 00 	lea    rax,[rip+0x7a07f]        # 12697c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaed44>
 11ef741:	48 89 84 24 68 05 00 	mov    QWORD PTR [rsp+0x568],rax
 11ef748:	00 
 11ef749:	48 8d ac 24 20 05 00 	lea    rbp,[rsp+0x520]
 11ef750:	00 
 11ef751:	48 89 ef             	mov    rdi,rbp
 11ef754:	48 8d b4 24 a0 04 00 	lea    rsi,[rsp+0x4a0]
 11ef75b:	00 
 11ef75c:	e8                   	.byte 0xe8
 11ef75d:	c9                   	leave
 11ef75e:	1e                   	(bad)
 11ef75f:	e8                   	.byte 0xe8

## Object construction around vptr 0x185ba80 / secondary 0x185bf88

/tmp/arg9/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000011f3e80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39404>:
 11f3e80:	05 00 00 e8 fe       	add    eax,0xfee80000
 11f3e85:	a5                   	movs   DWORD PTR es:[rdi],DWORD PTR ds:[rsi]
 11f3e86:	8a ff                	mov    bh,bh
 11f3e88:	48 83 a3 58 4a 00 00 	and    QWORD PTR [rbx+0x4a58],0x0
 11f3e8f:	00 
 11f3e90:	6a 10                	push   0x10
 11f3e92:	5f                   	pop    rdi
 11f3e93:	e8 68 a0 5f 00       	call   17edf00 <_Znwm@plt>
 11f3e98:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
 11f3e9c:	48 8d 0d 6d 7c 66 00 	lea    rcx,[rip+0x667c6d]        # 185bb10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181f8>
 11f3ea3:	48 89 08             	mov    QWORD PTR [rax],rcx
 11f3ea6:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
 11f3eab:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 11f3eaf:	48 89 83 60 4a 00 00 	mov    QWORD PTR [rbx+0x4a60],rax
 11f3eb6:	4c 8d a3 68 4a 00 00 	lea    r12,[rbx+0x4a68]
 11f3ebd:	4c 8b ab d0 0e 00 00 	mov    r13,QWORD PTR [rbx+0xed0]
 11f3ec4:	48 8b bc 24 a0 06 00 	mov    rdi,QWORD PTR [rsp+0x6a0]
 11f3ecb:	00 
 11f3ecc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f3ecf:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3ed2:	49 89 c6             	mov    r14,rax
 11f3ed5:	48 8b bc 24 a8 06 00 	mov    rdi,QWORD PTR [rsp+0x6a8]
 11f3edc:	00 
 11f3edd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f3ee0:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3ee3:	4c 89 ab 68 4a 00 00 	mov    QWORD PTR [rbx+0x4a68],r13
 11f3eea:	4c 89 bb 70 4a 00 00 	mov    QWORD PTR [rbx+0x4a70],r15
 11f3ef1:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
 11f3ef8:	00 
 11f3ef9:	48 89 8b 78 4a 00 00 	mov    QWORD PTR [rbx+0x4a78],rcx
 11f3f00:	4c 89 b3 80 4a 00 00 	mov    QWORD PTR [rbx+0x4a80],r14
 11f3f07:	48 89 83 88 4a 00 00 	mov    QWORD PTR [rbx+0x4a88],rax
 11f3f0e:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
 11f3f13:	48 89 83 90 4a 00 00 	mov    QWORD PTR [rbx+0x4a90],rax
 11f3f1a:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
 11f3f21:	00 
 11f3f22:	48 89 83 98 4a 00 00 	mov    QWORD PTR [rbx+0x4a98],rax
 11f3f29:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 11f3f2e:	48 89 83 a0 4a 00 00 	mov    QWORD PTR [rbx+0x4aa0],rax
 11f3f35:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
 11f3f3c:	00 
 11f3f3d:	4d 89 20             	mov    QWORD PTR [r8],r12
 11f3f40:	48 8d 35 4a 91 8a ff 	lea    rsi,[rip+0xffffffffff8a914a]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f3f47:	48 8d 0d 1e 1f 02 00 	lea    rcx,[rip+0x21f1e]        # 1215e6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b3f0>
 11f3f4e:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11f3f55:	00 
 11f3f56:	6a 08                	push   0x8
 11f3f58:	41 59                	pop    r9
 11f3f5a:	4c 89 f7             	mov    rdi,r14
 11f3f5d:	31 d2                	xor    edx,edx
 11f3f5f:	e8 30 68 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f3f64:	48 8b 83 a8 05 00 00 	mov    rax,QWORD PTR [rbx+0x5a8]
 11f3f6b:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f3f72:	00 
 11f3f73:	6a 02                	push   0x2
 11f3f75:	5a                   	pop    rdx
 11f3f76:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
 11f3f7b:	4c 89 e6             	mov    rsi,r12
 11f3f7e:	4c 89 f1             	mov    rcx,r14
 11f3f81:	ff 50 18             	call   QWORD PTR [rax+0x18]
 11f3f84:	4c 8b bc 24 40 07 00 	mov    r15,QWORD PTR [rsp+0x740]
 11f3f8b:	00 
 11f3f8c:	48 8d bb a8 4a 00 00 	lea    rdi,[rbx+0x4aa8]
 11f3f93:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 11f3f9a:	00 
 11f3f9b:	4c 89 f6             	mov    rsi,r14
 11f3f9e:	e8 9b 5a 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 11f3fa3:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 11f3fa7:	e8 da a4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3fac:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3fb3:	00 
 11f3fb4:	e8 2f 68 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f3fb9:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
 11f3fbd:	48 89 83 c8 4a 00 00 	mov    QWORD PTR [rbx+0x4ac8],rax
 11f3fc4:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
 11f3fc9:	f3 0f 7f 83 b8 4a 00 	movdqu XMMWORD PTR [rbx+0x4ab8],xmm0
 11f3fd0:	00 
 11f3fd1:	66 0f ef c0          	pxor   xmm0,xmm0
 11f3fd5:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
 11f3fda:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 11f3fdf:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11f3fe6:	00 
 11f3fe7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f3fea:	4c 89 e6             	mov    rsi,r12
 11f3fed:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3ff0:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
 11f3ff7:	00 
 11f3ff8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3ffb:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f4002:	00 
 11f4003:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
 11f4009:	4c 8b b4 24 a0 06 00 	mov    r14,QWORD PTR [rsp+0x6a0]
 11f4010:	00 
 11f4011:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11f4014:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
 11f401b:	00 
 11f401c:	4c 89 f7             	mov    rdi,r14
 11f401f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 11f4024:	ff 50 48             	call   QWORD PTR [rax+0x48]
 11f4027:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f402e:	00 
 11f402f:	e8 08 24 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
 11f4034:	49 8b 06             	mov    rax,QWORD PTR [r14]
 11f4037:	4c 89 f7             	mov    rdi,r14
 11f403a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f403d:	49 89 c6             	mov    r14,rax
 11f4040:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
 11f4045:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f4048:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
 11f404f:	00 
 11f4050:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f4053:	4c 8b ac 24 80 05 00 	mov    r13,QWORD PTR [rsp+0x580]
 11f405a:	00 
 11f405b:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11f4062:	00 
 11f4063:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f4066:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f4069:	49 89 c7             	mov    r15,rax
 11f406c:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
 11f4073:	00 
 11f4074:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f4077:	ff 50 38             	call   QWORD PTR [rax+0x38]
 11f407a:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 11f407f:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
 11f4084:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
 11f408b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 11f4090:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
 11f4097:	00 00 
 11f4099:	48 8d 05 40 3d 7e ff 	lea    rax,[rip+0xffffffffff7e3d40]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11f40a0:	48 89 84 24 30 05 00 	mov    QWORD PTR [rsp+0x530],rax
 11f40a7:	00 
 11f40a8:	48 8d 05 cb ed 95 ff 	lea    rax,[rip+0xffffffffff95edcb]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
 11f40af:	48 89 84 24 38 05 00 	mov    QWORD PTR [rsp+0x538],rax
 11f40b6:	00 
 11f40b7:	48 8b 83 28 1a 00 00 	mov    rax,QWORD PTR [rbx+0x1a28]
 11f40be:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
 11f40c5:	00 
 11f40c6:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
 11f40cb:	41 0f b6 84 24 b1 00 	movzx  eax,BYTE PTR [r12+0xb1]
 11f40d2:	00 00 
 11f40d4:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
 11f40db:	bf 98 20 00 00       	mov    edi,0x2098
 11f40e0:	e8 1b 9e 5f 00       	call   17edf00 <_Znwm@plt>
 11f40e5:	49 89 c7             	mov    r15,rax
 11f40e8:	48 8d ab b8 4a 00 00 	lea    rbp,[rbx+0x4ab8]
 11f40ef:	66 0f ef c0          	pxor   xmm0,xmm0
 11f40f3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 11f40f8:	48 8d 05 81 79 66 00 	lea    rax,[rip+0x667981]        # 185ba80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18168>
 11f40ff:	49 89 07             	mov    QWORD PTR [r15],rax
 11f4102:	41 8a 84 24 88 00 00 	mov    al,BYTE PTR [r12+0x88]
 11f4109:	00 
 11f410a:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
 11f410e:	41 8a 84 24 89 00 00 	mov    al,BYTE PTR [r12+0x89]
 11f4115:	00 
 11f4116:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
 11f411d:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f4124:	00 
 11f4125:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
 11f412c:	00 
 11f412d:	e8 34 1a 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f4132:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11f4139:	00 
 11f413a:	48 89 ee             	mov    rsi,rbp
 11f413d:	e8 fe 9d 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 11f4142:	48 8d 05 3f 7e 66 00 	lea    rax,[rip+0x667e3f]        # 185bf88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18670>
 11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
 11f4154:	00 
 11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
 11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
 11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
 11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
 11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
 11f417d:	00 
 11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
 11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
 11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
 11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
 11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
 11f4198:	00 
 11f4199:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
 11f419d:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
 11f41a1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11f41a6:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
 11f41aa:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 11f41af:	49 89 47 70          	mov    QWORD PTR [r15+0x70],rax
 11f41b3:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
 11f41ba:	00 
 11f41bb:	49 89 47 78          	mov    QWORD PTR [r15+0x78],rax
 11f41bf:	49 8d 6f 18          	lea    rbp,[r15+0x18]
 11f41c3:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 11f41c8:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
 11f41cf:	48 8b 84 24 60 06 00 	mov    rax,QWORD PTR [rsp+0x660]
 11f41d6:	00 
 11f41d7:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
 11f41de:	4d 8d a7 90 00 00 00 	lea    r12,[r15+0x90]
 11f41e5:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
 11f41ec:	00 
 11f41ed:	4c 89 e7             	mov    rdi,r12
 11f41f0:	e8 71 19 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f41f5:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 11f41fa:	49 89 87 b0 00 00 00 	mov    QWORD PTR [r15+0xb0],rax
 11f4201:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
 11f4206:	49 89 87 b8 00 00 00 	mov    QWORD PTR [r15+0xb8],rax
 11f420d:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]
 11f4214:	00 
 11f4215:	49 89 87 d0 00 00 00 	mov    QWORD PTR [r15+0xd0],rax
 11f421c:	66 0f 6f 84 24 b0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1b0]
 11f4223:	00 00 
 11f4225:	f3 41 0f 7f 87 c0 00 	movdqu XMMWORD PTR [r15+0xc0],xmm0
 11f422c:	00 00 
 11f422e:	48                   	rex.W
 11f422f:	83                   	.byte 0x83

## Exact methods around secondary address point use

/tmp/arg9/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001204218 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4979c>:
 1204218:	55                   	push   rbp
 1204219:	41 57                	push   r15
 120421b:	41 56                	push   r14
 120421d:	41 55                	push   r13
 120421f:	41 54                	push   r12
 1204221:	53                   	push   rbx
 1204222:	48 81 ec 78 09 00 00 	sub    rsp,0x978
 1204229:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
 120422e:	49 89 f6             	mov    r14,rsi
 1204231:	49 89 fd             	mov    r13,rdi
 1204234:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 120423b:	00 00 
 120423d:	48 89 84 24 70 09 00 	mov    QWORD PTR [rsp+0x970],rax
 1204244:	00 
 1204245:	48 81 c7 98 05 00 00 	add    rdi,0x598
 120424c:	45 8a bd 08 0a 00 00 	mov    r15b,BYTE PTR [r13+0xa08]
 1204253:	45 84 ff             	test   r15b,r15b
 1204256:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 120425b:	74 24                	je     1204281 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49805>
 120425d:	e8 d4 75 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1204262:	48 89 c3             	mov    rbx,rax
 1204265:	49 89 d4             	mov    r12,rdx
 1204268:	4c 89 ed             	mov    rbp,r13
 120426b:	49 8d bd b0 05 00 00 	lea    rdi,[r13+0x5b0]
 1204272:	e8 bf 75 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1204277:	49 89 c5             	mov    r13,rax
 120427a:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
 120427f:	eb 12                	jmp    1204293 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49817>
 1204281:	4c 89 ed             	mov    rbp,r13
 1204284:	31 db                	xor    ebx,ebx
 1204286:	45 31 e4             	xor    r12d,r12d
 1204289:	31 c0                	xor    eax,eax
 120428b:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 1204290:	45 31 ed             	xor    r13d,r13d
 1204293:	48 8d 35 87 34 18 ff 	lea    rsi,[rip+0xffffffffff183487]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
 120429a:	4c 89 f7             	mov    rdi,r14
 120429d:	e8 ad 75 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12042a2:	84 c0                	test   al,al
 12042a4:	74 67                	je     120430d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49891>
 12042a6:	48 8b 55 60          	mov    rdx,QWORD PTR [rbp+0x60]
 12042aa:	48 89 df             	mov    rdi,rbx
 12042ad:	4c 89 e6             	mov    rsi,r12
 12042b0:	e8 ed 21 00 00       	call   12064a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ba26>
 12042b5:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
 12042b9:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
 12042bc:	0f b6 c0             	movzx  eax,al
 12042bf:	6a 01                	push   0x1
 12042c1:	5e                   	pop    rsi
 12042c2:	4c 89 ea             	mov    rdx,r13
 12042c5:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 12042ca:	41 ff 54 c0 38       	call   QWORD PTR [r8+rax*8+0x38]
 12042cf:	e8 f3 65 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 12042d4:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 12042db:	00 
 12042dc:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 12042e0:	48 8d 0d 69 eb 77 00 	lea    rcx,[rip+0x77eb69]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 12042e7:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 12042eb:	0f 57 c0             	xorps  xmm0,xmm0
 12042ee:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 12042f1:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 12042f5:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 12042fa:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 12042fe:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204305:	00 
 1204306:	e8 85 9a 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 120430b:	eb 7c                	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
 120430d:	48 8d 35 2e 34 18 ff 	lea    rsi,[rip+0xffffffffff18342e]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
 1204314:	4c 89 f7             	mov    rdi,r14
 1204317:	e8 33 75 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 120431c:	84 c0                	test   al,al
 120431e:	0f 84 9b 00 00 00    	je     12043bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49943>
 1204324:	48 8b 55 60          	mov    rdx,QWORD PTR [rbp+0x60]
 1204328:	48 89 df             	mov    rdi,rbx
 120432b:	4c 89 e6             	mov    rsi,r12
 120432e:	e8 6f 21 00 00       	call   12064a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ba26>
 1204333:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
 1204337:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
 120433a:	0f b6 c0             	movzx  eax,al
 120433d:	6a 02                	push   0x2
 120433f:	5e                   	pop    rsi
 1204340:	4c 89 ea             	mov    rdx,r13
 1204343:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
 1204348:	41 ff 54 c0 38       	call   QWORD PTR [r8+rax*8+0x38]
 120434d:	e8 75 65 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 1204352:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204359:	00 
 120435a:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 120435e:	48 8d 0d eb ea 77 00 	lea    rcx,[rip+0x77eaeb]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 1204365:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204369:	0f 57 c0             	xorps  xmm0,xmm0
 120436c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 120436f:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 1204373:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204378:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 120437c:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 1204383:	00 
 1204384:	e8 07 9a 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204389:	48 8b bc 24 f8 04 00 	mov    rdi,QWORD PTR [rsp+0x4f8]
 1204390:	00 
 1204391:	e8 08 a4 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1204396:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 120439d:	00 00 
 120439f:	48 3b 84 24 70 09 00 	cmp    rax,QWORD PTR [rsp+0x970]
 12043a6:	00 
 12043a7:	0f 85 2c 0b 00 00    	jne    1204ed9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4a45d>
 12043ad:	48 81 c4 78 09 00 00 	add    rsp,0x978
 12043b4:	5b                   	pop    rbx
 12043b5:	41 5c                	pop    r12
 12043b7:	41 5d                	pop    r13
 12043b9:	41 5e                	pop    r14
 12043bb:	41 5f                	pop    r15
 12043bd:	5d                   	pop    rbp
 12043be:	c3                   	ret
 12043bf:	48 8d 35 b7 7a 12 ff 	lea    rsi,[rip+0xffffffffff127ab7]        # 32be7d <_ZTSSt12bad_any_cast@@Base-0x6434b>
 12043c6:	4c 89 f7             	mov    rdi,r14
 12043c9:	e8 81 74 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12043ce:	84 c0                	test   al,al
 12043d0:	4c 89 f3             	mov    rbx,r14
 12043d3:	0f 84 ff 00 00 00    	je     12044d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49a5c>
 12043d9:	45 84 ff             	test   r15b,r15b
 12043dc:	0f 84 f6 00 00 00    	je     12044d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49a5c>
 12043e2:	4c 8b ad e8 11 00 00 	mov    r13,QWORD PTR [rbp+0x11e8]
 12043e9:	4c 8d a4 24 e8 04 00 	lea    r12,[rsp+0x4e8]
 12043f0:	00 
 12043f1:	49 89 ee             	mov    r14,rbp
 12043f4:	49 89 6c 24 f8       	mov    QWORD PTR [r12-0x8],rbp
 12043f9:	4c 89 e7             	mov    rdi,r12
 12043fc:	48 89 de             	mov    rsi,rbx
 12043ff:	e8 86 37 46 00       	call   1667b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bcf6>
 1204404:	48 8d 9c 24 d0 05 00 	lea    rbx,[rsp+0x5d0]
 120440b:	00 
 120440c:	48 89 df             	mov    rdi,rbx
 120440f:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
 1204414:	e8 77 5e 87 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 1204419:	48 83 a4 24 50 09 00 	and    QWORD PTR [rsp+0x950],0x0
 1204420:	00 00 
 1204422:	48 83 a4 24 60 09 00 	and    QWORD PTR [rsp+0x960],0x0
 1204429:	00 00 
 120442b:	bf 20 01 00 00       	mov    edi,0x120
 1204430:	e8 cb 9a 5e 00       	call   17edf00 <_Znwm@plt>
 1204435:	49 89 c7             	mov    r15,rax
 1204438:	48 8b 84 24 e0 04 00 	mov    rax,QWORD PTR [rsp+0x4e0]
 120443f:	00 
 1204440:	49 89 07             	mov    QWORD PTR [r15],rax
 1204443:	49 8d 6f 08          	lea    rbp,[r15+0x8]
 1204447:	48 89 ef             	mov    rdi,rbp
 120444a:	4c 89 e6             	mov    rsi,r12
 120444d:	e8 ca 36 46 00       	call   1667b1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc88>
 1204452:	4c 89 ff             	mov    rdi,r15
 1204455:	48 81 c7 f0 00 00 00 	add    rdi,0xf0
 120445c:	48 89 de             	mov    rsi,rbx
 120445f:	e8 2c 5e 87 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 1204464:	48 8d 8c 24 50 09 00 	lea    rcx,[rsp+0x950]
 120446b:	00 
 120446c:	4c 89 39             	mov    QWORD PTR [rcx],r15
 120446f:	48 8d 05 ea 20 00 00 	lea    rax,[rip+0x20ea]        # 1206560 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bae4>
 1204476:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
 120447a:	48 8d 05 09 21 00 00 	lea    rax,[rip+0x2109]        # 120658a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bb0e>
 1204481:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
 1204485:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
 1204489:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 120448e:	4c 89 ee             	mov    rsi,r13
 1204491:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
 1204496:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1204499:	49 81 c6 f0 11 00 00 	add    r14,0x11f0
 12044a0:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
 12044a5:	4c 89 f7             	mov    rdi,r14
 12044a8:	48 89 de             	mov    rsi,rbx
 12044ab:	e8 6c 53 8b ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
 12044b0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 12044b4:	e8 cd 9f 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 12044b9:	48 8d bc 24 50 09 00 	lea    rdi,[rsp+0x950]
 12044c0:	00 
 12044c1:	e8 3a 5e ff ff       	call   11fa300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f884>
 12044c6:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 12044cd:	00 
 12044ce:	e8 75 23 00 00       	call   1206848 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bdcc>
 12044d3:	e9 be fe ff ff       	jmp    1204396 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4991a>
 12044d8:	48 8d 35 ab 2b 14 ff 	lea    rsi,[rip+0xffffffffff142bab]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
 12044df:	48 89 df             	mov    rdi,rbx
 12044e2:	e8 68 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12044e7:	84 c0                	test   al,al
 12044e9:	74 4b                	je     1204536 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49aba>
 12044eb:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
 12044ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12044f2:	ff 50 68             	call   QWORD PTR [rax+0x68]
 12044f5:	e8 cd 63 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 12044fa:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204501:	00 
 1204502:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
 1204506:	48 8d 0d 43 e9 77 00 	lea    rcx,[rip+0x77e943]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 120450d:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
 1204511:	0f 57 c0             	xorps  xmm0,xmm0
 1204514:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 1204517:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 120451b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204520:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 1204524:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 120452b:	00 
 120452c:	e8 5f 98 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204531:	e9 53 fe ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
 1204536:	48 8d 35 01 84 13 ff 	lea    rsi,[rip+0xffffffffff138401]        # 33c93e <_ZTSSt12bad_any_cast@@Base-0x5388a>
 120453d:	48 89 df             	mov    rdi,rbx
 1204540:	e8 0a 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 1204545:	84 c0                	test   al,al
 1204547:	74 7e                	je     12045c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49b4b>
 1204549:	49 89 de             	mov    r14,rbx
 120454c:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 1204550:	e8 e1 72 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1204555:	48 8d 9c 24 c0 04 00 	lea    rbx,[rsp+0x4c0]
 120455c:	00 
 120455d:	48 89 df             	mov    rdi,rbx
 1204560:	48 89 c6             	mov    rsi,rax
 1204563:	e8 fd 22 00 00       	call   1206865 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bde9>
 1204568:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 120456f:	00 
 1204570:	e8 ed f9 cc ff       	call   ed3f62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9b378>
 1204575:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
 1204579:	0f 84 41 03 00 00    	je     12048c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49e44>
 120457f:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
 1204586:	00 
 1204587:	e8 aa 72 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 120458c:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 1204593:	00 
 1204594:	48 89 c6             	mov    rsi,rax
 1204597:	e8 b6 b2 57 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 120459c:	84 c0                	test   al,al
 120459e:	0f 84 1c 03 00 00    	je     12048c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49e44>
 12045a4:	80 bd 08 0a 00 00 00 	cmp    BYTE PTR [rbp+0xa08],0x0
 12045ab:	0f 84 a4 02 00 00    	je     1204855 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49dd9>
 12045b1:	48 8d b5 b0 05 00 00 	lea    rsi,[rbp+0x5b0]
 12045b8:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
 12045bd:	e8 7e 99 5e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 12045c2:	e9 9f 02 00 00       	jmp    1204866 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49dea>
 12045c7:	48 8d 35 c6 63 17 ff 	lea    rsi,[rip+0xffffffffff1763c6]        # 37a994 <_ZTSSt12bad_any_cast@@Base-0x15834>
 12045ce:	48 89 df             	mov    rdi,rbx
 12045d1:	e8 79 72 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12045d6:	84 c0                	test   al,al
 12045d8:	0f 84 88 00 00 00    	je     1204666 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49bea>
 12045de:	49 89 de             	mov    r14,rbx
 12045e1:	48 8b 9d d0 11 00 00 	mov    rbx,QWORD PTR [rbp+0x11d0]
 12045e8:	49 8d 7e 18          	lea    rdi,[r14+0x18]
 12045ec:	48 8d 35 2d d6 24 ff 	lea    rsi,[rip+0xffffffffff24d62d]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
 12045f3:	e8 57 72 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 12045f8:	4c 89 f7             	mov    rdi,r14
 12045fb:	89 c5                	mov    ebp,eax
 12045fd:	48 83 c7 48          	add    rdi,0x48
 1204601:	e8 aa 71 0f 00       	call   12fb7b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140d34>
 1204606:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 120460d:	00 
 120460e:	49 89 06             	mov    QWORD PTR [r14],rax
 1204611:	41 88 56 08          	mov    BYTE PTR [r14+0x8],dl
 1204615:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 1204618:	40 0f b6 f5          	movzx  esi,bpl
 120461c:	48 89 df             	mov    rdi,rbx
 120461f:	4c 89 f2             	mov    rdx,r14
 1204622:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1204625:	e8 9d 62 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
 120462a:	41 83 26 00          	and    DWORD PTR [r14],0x0
 120462e:	48 8d 05 1b e8 77 00 	lea    rax,[rip+0x77e81b]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
 1204635:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 1204639:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
 1204640:	00 
 1204641:	0f 57 c0             	xorps  xmm0,xmm0
 1204644:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 1204647:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
 120464b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1204650:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
 1204654:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
 120465b:	00 
 120465c:	e8 2f 97 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
 1204661:	e9 23 fd ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
 1204666:	48 8d 35 2c 31 18 ff 	lea    rsi,[rip+0xffffffffff18312c]        # 387799 <_ZTSSt12bad_any_cast@@Base-0x8a2f>
 120466d:	48 89 df             	mov    rdi,rbx
 1204670:	e8 da 71 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 1204675:	84 c0                	test   al,al
 1204677:	0f 84 b2 00 00 00    	je     120472f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49cb3>
 120467d:	49 89 de             	mov    r14,rbx
 1204680:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 1204684:	e8 ad 71 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1204689:	48 8d 9c 24 c0 04 00 	lea    rbx,[rsp+0x4c0]
 1204690:	00 
 1204691:	48 89 df             	mov    rdi,rbx
 1204694:	48 89 c6             	mov    rsi,rax
 1204697:	e8 c9 21 00 00       	call   1206865 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bde9>
 120469c:	0f 57 c0             	xorps  xmm0,xmm0
 120469f:	0f                   	.byte 0xf

## All stores to allocated dispatcher +0x8/+0x20 near constructor
00000000011f3c00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39184>:
 11f3c00:	00 00                	add    BYTE PTR [rax],al
 11f3c02:	89 83 18 2a 00 00    	mov    DWORD PTR [rbx+0x2a18],eax
 11f3c08:	8b 81 d8 00 00 00    	mov    eax,DWORD PTR [rcx+0xd8]
 11f3c0e:	89 83 1c 2a 00 00    	mov    DWORD PTR [rbx+0x2a1c],eax
 11f3c14:	48 8d bb 20 2a 00 00 	lea    rdi,[rbx+0x2a20]
 11f3c1b:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
 11f3c20:	e8 d1 5d 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f3c25:	4c 8d ab 30 2a 00 00 	lea    r13,[rbx+0x2a30]
 11f3c2c:	4c 89 ef             	mov    rdi,r13
 11f3c2f:	e8 c2 5d 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f3c34:	48 8d bb 40 2a 00 00 	lea    rdi,[rbx+0x2a40]
 11f3c3b:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
 11f3c40:	e8 b1 5d 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
 11f3c45:	66 0f ef c0          	pxor   xmm0,xmm0
 11f3c49:	66 0f 7f 83 80 2a 00 	movdqa XMMWORD PTR [rbx+0x2a80],xmm0
 11f3c50:	00 
 11f3c51:	66 0f 7f 83 70 2a 00 	movdqa XMMWORD PTR [rbx+0x2a70],xmm0
 11f3c58:	00 
 11f3c59:	66 0f 7f 83 60 2a 00 	movdqa XMMWORD PTR [rbx+0x2a60],xmm0
 11f3c60:	00 
 11f3c61:	66 0f 7f 83 50 2a 00 	movdqa XMMWORD PTR [rbx+0x2a50],xmm0
 11f3c68:	00 
 11f3c69:	48 83 a3 90 2a 00 00 	and    QWORD PTR [rbx+0x2a90],0x0
 11f3c70:	00 
 11f3c71:	48 8d 35 52 c7 13 ff 	lea    rsi,[rip+0xffffffffff13c752]        # 3303ca <_ZTSSt12bad_any_cast@@Base-0x5fdfe>
 11f3c78:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3c7f:	00 
 11f3c80:	4c 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r13
 11f3c87:	00 
 11f3c88:	e8 f1 5d 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
--
 11f3d49:	4d 89 f0             	mov    r8,r14
 11f3d4c:	e8 43 6a 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f3d51:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
 11f3d55:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3d58:	4c 8d a4 24 e0 04 00 	lea    r12,[rsp+0x4e0]
 11f3d5f:	00 
 11f3d60:	4c 89 e7             	mov    rdi,r12
 11f3d63:	48 89 ea             	mov    rdx,rbp
 11f3d66:	ff 50 10             	call   QWORD PTR [rax+0x10]
 11f3d69:	4c 89 ef             	mov    rdi,r13
 11f3d6c:	4c 89 e6             	mov    rsi,r12
 11f3d6f:	e8 7e 5e 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 11f3d74:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 11f3d79:	4d 89 fc             	mov    r12,r15
 11f3d7c:	e8 05 a7 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3d81:	48 89 ef             	mov    rdi,rbp
 11f3d84:	e8 5f 6a 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f3d89:	4d 89 3e             	mov    QWORD PTR [r14],r15
 11f3d8c:	48 8d 0d 39 55 06 00 	lea    rcx,[rip+0x65539]        # 12592cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e850>
 11f3d93:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
 11f3d9a:	00 
 11f3d9b:	4c 8d 84 24 20 05 00 	lea    r8,[rsp+0x520]
 11f3da2:	00 
 11f3da3:	4c 89 ff             	mov    rdi,r15
 11f3da6:	48 8d 35 e4 92 8a ff 	lea    rsi,[rip+0xffffffffff8a92e4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f3dad:	31 d2                	xor    edx,edx
 11f3daf:	6a 08                	push   0x8
 11f3db1:	41 59                	pop    r9
 11f3db3:	e8 dc 69 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f3db8:	48 8b b4 24 c8 06 00 	mov    rsi,QWORD PTR [rsp+0x6c8]
 11f3dbf:	00 
 11f3dc0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3dc3:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f3dca:	00 
 11f3dcb:	4c 89 fa             	mov    rdx,r15
 11f3dce:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3dd1:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 11f3dd8:	00 
 11f3dd9:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 11f3dde:	4c 89 f6             	mov    rsi,r14
 11f3de1:	e8 0c 5e 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 11f3de6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 11f3dea:	e8 97 a6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3def:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3df6:	00 
 11f3df7:	e8 ec 69 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f3dfc:	4c 8d 84 24 20 05 00 	lea    r8,[rsp+0x520]
 11f3e03:	00 
 11f3e04:	4d 89 20             	mov    QWORD PTR [r8],r12
 11f3e07:	48 8d 35 83 92 8a ff 	lea    rsi,[rip+0xffffffffff8a9283]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f3e0e:	48 8d 0d 63 56 06 00 	lea    rcx,[rip+0x65663]        # 1259478 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e9fc>
 11f3e15:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
 11f3e1c:	00 
 11f3e1d:	6a 08                	push   0x8
 11f3e1f:	41 59                	pop    r9
 11f3e21:	4c 89 f7             	mov    rdi,r14
 11f3e24:	31 d2                	xor    edx,edx
 11f3e26:	e8 69 69 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f3e2b:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 11f3e30:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3e33:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
 11f3e3a:	00 
 11f3e3b:	31 d2                	xor    edx,edx
 11f3e3d:	4c 89 f1             	mov    rcx,r14
 11f3e40:	ff 50 18             	call   QWORD PTR [rax+0x18]
 11f3e43:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 11f3e4a:	00 
 11f3e4b:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
 11f3e50:	4c 89 f6             	mov    rsi,r14
 11f3e53:	e8 9a 5d 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
 11f3e58:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 11f3e5c:	e8 25 a6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3e61:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3e68:	00 
 11f3e69:	e8 7a 69 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f3e6e:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
 11f3e75:	00 
 11f3e76:	e8 c1 25 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
 11f3e7b:	48 8b bc 24 58 05 00 	mov    rdi,QWORD PTR [rsp+0x558]
 11f3e82:	00 
 11f3e83:	e8 fe a5 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3e88:	48 83 a3 58 4a 00 00 	and    QWORD PTR [rbx+0x4a58],0x0
 11f3e8f:	00 
 11f3e90:	6a 10                	push   0x10
 11f3e92:	5f                   	pop    rdi
 11f3e93:	e8 68 a0 5f 00       	call   17edf00 <_Znwm@plt>
 11f3e98:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
 11f3e9c:	48 8d 0d 6d 7c 66 00 	lea    rcx,[rip+0x667c6d]        # 185bb10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181f8>
 11f3ea3:	48 89 08             	mov    QWORD PTR [rax],rcx
 11f3ea6:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
 11f3eab:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 11f3eaf:	48 89 83 60 4a 00 00 	mov    QWORD PTR [rbx+0x4a60],rax
 11f3eb6:	4c 8d a3 68 4a 00 00 	lea    r12,[rbx+0x4a68]
 11f3ebd:	4c 8b ab d0 0e 00 00 	mov    r13,QWORD PTR [rbx+0xed0]
 11f3ec4:	48 8b bc 24 a0 06 00 	mov    rdi,QWORD PTR [rsp+0x6a0]
 11f3ecb:	00 
 11f3ecc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f3ecf:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3ed2:	49 89 c6             	mov    r14,rax
 11f3ed5:	48 8b bc 24 a8 06 00 	mov    rdi,QWORD PTR [rsp+0x6a8]
 11f3edc:	00 
 11f3edd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f3ee0:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3ee3:	4c 89 ab 68 4a 00 00 	mov    QWORD PTR [rbx+0x4a68],r13
 11f3eea:	4c 89 bb 70 4a 00 00 	mov    QWORD PTR [rbx+0x4a70],r15
 11f3ef1:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
 11f3ef8:	00 
 11f3ef9:	48 89 8b 78 4a 00 00 	mov    QWORD PTR [rbx+0x4a78],rcx
 11f3f00:	4c 89 b3 80 4a 00 00 	mov    QWORD PTR [rbx+0x4a80],r14
--
 11f3f75:	5a                   	pop    rdx
 11f3f76:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
 11f3f7b:	4c 89 e6             	mov    rsi,r12
 11f3f7e:	4c 89 f1             	mov    rcx,r14
 11f3f81:	ff 50 18             	call   QWORD PTR [rax+0x18]
 11f3f84:	4c 8b bc 24 40 07 00 	mov    r15,QWORD PTR [rsp+0x740]
 11f3f8b:	00 
 11f3f8c:	48 8d bb a8 4a 00 00 	lea    rdi,[rbx+0x4aa8]
 11f3f93:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
 11f3f9a:	00 
 11f3f9b:	4c 89 f6             	mov    rsi,r14
 11f3f9e:	e8 9b 5a 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 11f3fa3:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
 11f3fa7:	e8 da a4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3fac:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3fb3:	00 
 11f3fb4:	e8 2f 68 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f3fb9:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
 11f3fbd:	48 89 83 c8 4a 00 00 	mov    QWORD PTR [rbx+0x4ac8],rax
 11f3fc4:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
 11f3fc9:	f3 0f 7f 83 b8 4a 00 	movdqu XMMWORD PTR [rbx+0x4ab8],xmm0
 11f3fd0:	00 
 11f3fd1:	66 0f ef c0          	pxor   xmm0,xmm0
 11f3fd5:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
 11f3fda:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 11f3fdf:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11f3fe6:	00 
 11f3fe7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f3fea:	4c 89 e6             	mov    rsi,r12
 11f3fed:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3ff0:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
--
 11f4053:	4c 8b ac 24 80 05 00 	mov    r13,QWORD PTR [rsp+0x580]
 11f405a:	00 
 11f405b:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
 11f4062:	00 
 11f4063:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f4066:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11f4069:	49 89 c7             	mov    r15,rax
 11f406c:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
 11f4073:	00 
 11f4074:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11f4077:	ff 50 38             	call   QWORD PTR [rax+0x38]
 11f407a:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 11f407f:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
 11f4084:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
 11f408b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 11f4090:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
 11f4097:	00 00 
 11f4099:	48 8d 05 40 3d 7e ff 	lea    rax,[rip+0xffffffffff7e3d40]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11f40a0:	48 89 84 24 30 05 00 	mov    QWORD PTR [rsp+0x530],rax
 11f40a7:	00 
 11f40a8:	48 8d 05 cb ed 95 ff 	lea    rax,[rip+0xffffffffff95edcb]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
 11f40af:	48 89 84 24 38 05 00 	mov    QWORD PTR [rsp+0x538],rax
 11f40b6:	00 
 11f40b7:	48 8b 83 28 1a 00 00 	mov    rax,QWORD PTR [rbx+0x1a28]
 11f40be:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
 11f40c5:	00 
 11f40c6:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
 11f40cb:	41 0f b6 84 24 b1 00 	movzx  eax,BYTE PTR [r12+0xb1]
 11f40d2:	00 00 
 11f40d4:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
 11f40db:	bf 98 20 00 00       	mov    edi,0x2098
 11f40e0:	e8 1b 9e 5f 00       	call   17edf00 <_Znwm@plt>
 11f40e5:	49 89 c7             	mov    r15,rax
 11f40e8:	48 8d ab b8 4a 00 00 	lea    rbp,[rbx+0x4ab8]
 11f40ef:	66 0f ef c0          	pxor   xmm0,xmm0
 11f40f3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 11f40f8:	48 8d 05 81 79 66 00 	lea    rax,[rip+0x667981]        # 185ba80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18168>
 11f40ff:	49 89 07             	mov    QWORD PTR [r15],rax
 11f4102:	41 8a 84 24 88 00 00 	mov    al,BYTE PTR [r12+0x88]
 11f4109:	00 
 11f410a:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
 11f410e:	41 8a 84 24 89 00 00 	mov    al,BYTE PTR [r12+0x89]
 11f4115:	00 
 11f4116:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
 11f411d:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f4124:	00 
 11f4125:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
 11f412c:	00 
 11f412d:	e8 34 1a 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f4132:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11f4139:	00 
 11f413a:	48 89 ee             	mov    rsi,rbp
 11f413d:	e8 fe 9d 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 11f4142:	48 8d 05 3f 7e 66 00 	lea    rax,[rip+0x667e3f]        # 185bf88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18670>
 11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
 11f4154:	00 
 11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
 11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
 11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
 11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
 11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
 11f417d:	00 
 11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
 11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
 11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
 11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
 11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
 11f4198:	00 
 11f4199:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
 11f419d:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
 11f41a1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11f41a6:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
 11f41aa:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 11f41af:	49 89 47 70          	mov    QWORD PTR [r15+0x70],rax
 11f41b3:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
 11f41ba:	00 
 11f41bb:	49 89 47 78          	mov    QWORD PTR [r15+0x78],rax
 11f41bf:	49 8d 6f 18          	lea    rbp,[r15+0x18]
 11f41c3:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 11f41c8:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
 11f41cf:	48 8b 84 24 60 06 00 	mov    rax,QWORD PTR [rsp+0x660]
 11f41d6:	00 
 11f41d7:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
 11f41de:	4d 8d a7 90 00 00 00 	lea    r12,[r15+0x90]
 11f41e5:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
 11f41ec:	00 
 11f41ed:	4c 89 e7             	mov    rdi,r12
 11f41f0:	e8 71 19 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f41f5:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
--
 11f42b9:	6a 08                	push   0x8
 11f42bb:	41 59                	pop    r9
 11f42bd:	4c 89 f7             	mov    rdi,r14
 11f42c0:	31 d2                	xor    edx,edx
 11f42c2:	e8 cd 64 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f42c7:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
 11f42cc:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f42cf:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
 11f42d6:	00 
 11f42d7:	6a 01                	push   0x1
 11f42d9:	5a                   	pop    rdx
 11f42da:	4c 89 f1             	mov    rcx,r14
 11f42dd:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
 11f42e2:	ff 50 20             	call   QWORD PTR [rax+0x20]
 11f42e5:	49 8d bf c8 10 00 00 	lea    rdi,[r15+0x10c8]
 11f42ec:	4c 8d b4 24 a0 05 00 	lea    r14,[rsp+0x5a0]
 11f42f3:	00 
 11f42f4:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
 11f42f9:	4c 89 f6             	mov    rsi,r14
 11f42fc:	e8                   	.byte 0xe8
 11f42fd:	3d                   	.byte 0x3d
 11f42fe:	57                   	push   rdi
 11f42ff:	5e                   	pop    rsi
