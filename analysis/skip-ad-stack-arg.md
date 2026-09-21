# Skip Ad execution dependency stack-argument provenance

Target constructor instruction: 0x11f4142
Containing FDE: 0x11ef334..0x11f5af4 size=0x67c0

## Function prologue / first 420 instructions
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
     11ef75c:	e8 c9 1e e8 ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
     11ef761:	48 8d 05 38 01 67 00 	lea    rax,[rip+0x670138]        # 185f8a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1bf88>
     11ef768:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     11ef76c:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
     11ef770:	48 8b 84 24 58 06 00 	mov    rax,QWORD PTR [rsp+0x658]
     11ef777:	00 
     11ef778:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     11ef77b:	e8 26 a1 3f 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     11ef780:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11ef785:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
     11ef78c:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
     11ef793:	00 
     11ef794:	48 89 83 88 00 00 00 	mov    QWORD PTR [rbx+0x88],rax
     11ef79b:	4c 8b ac 24 60 06 00 	mov    r13,QWORD PTR [rsp+0x660]
     11ef7a2:	00 
     11ef7a3:	4c 89 ab 90 00 00 00 	mov    QWORD PTR [rbx+0x90],r13
     11ef7aa:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
     11ef7b1:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
     11ef7b6:	4c 89 f6             	mov    rsi,r14
     11ef7b9:	e8 bc 49 ab ff       	call   ca417a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f111a>
     11ef7be:	8b 44 24 08          	mov    eax,DWORD PTR [rsp+0x8]
     11ef7c2:	89 83 b8 00 00 00    	mov    DWORD PTR [rbx+0xb8],eax
     11ef7c8:	8b 44 24 20          	mov    eax,DWORD PTR [rsp+0x20]
     11ef7cc:	89 83 bc 00 00 00    	mov    DWORD PTR [rbx+0xbc],eax
     11ef7d2:	8b 44 24 58          	mov    eax,DWORD PTR [rsp+0x58]
     11ef7d6:	89 83 c0 00 00 00    	mov    DWORD PTR [rbx+0xc0],eax
     11ef7dc:	8b 44 24 30          	mov    eax,DWORD PTR [rsp+0x30]
     11ef7e0:	89 83 c4 00 00 00    	mov    DWORD PTR [rbx+0xc4],eax
     11ef7e6:	8b 84 24 c0 00 00 00 	mov    eax,DWORD PTR [rsp+0xc0]
     11ef7ed:	89 83 c8 00 00 00    	mov    DWORD PTR [rbx+0xc8],eax
     11ef7f3:	4c 89 a3 d0 00 00 00 	mov    QWORD PTR [rbx+0xd0],r12
     11ef7fa:	4c 89 bb d8 00 00 00 	mov    QWORD PTR [rbx+0xd8],r15
     11ef801:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
     11ef808:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     11ef80d:	48 89 ee             	mov    rsi,rbp
     11ef810:	e8 15 1e e8 ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
     11ef815:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
     11ef81c:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
     11ef821:	4c 89 ee             	mov    rsi,r13
     11ef824:	e8 99 1e 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     11ef829:	4c 8d ab 10 01 00 00 	lea    r13,[rbx+0x110]
     11ef830:	4c 89 ef             	mov    rdi,r13
     11ef833:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     11ef838:	48 8b 54 24 70       	mov    rdx,QWORD PTR [rsp+0x70]
     11ef83d:	e8 d8 d1 8a ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
     11ef842:	48 8d ab 28 01 00 00 	lea    rbp,[rbx+0x128]
     11ef849:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     11ef850:	00 
     11ef851:	48 89 ef             	mov    rdi,rbp
     11ef854:	e8 c3 c8 05 00       	call   124c11c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x916a0>
     11ef859:	4c 8d b3 48 01 00 00 	lea    r14,[rbx+0x148]
     11ef860:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
     11ef867:	00 
     11ef868:	4c 89 f7             	mov    rdi,r14
     11ef86b:	e8 f4 c8 05 00       	call   124c164 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x916e8>
     11ef870:	4c 8d bb 68 01 00 00 	lea    r15,[rbx+0x168]
     11ef877:	4c 89 ff             	mov    rdi,r15
     11ef87a:	e8 71 93 07 00       	call   1268bf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae174>
     11ef87f:	4c 8d a3 c0 01 00 00 	lea    r12,[rbx+0x1c0]
     11ef886:	4c 89 e7             	mov    rdi,r12
     11ef889:	e8 00 8a 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11ef88e:	48 8d 83 18 02 00 00 	lea    rax,[rbx+0x218]
     11ef895:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11ef89a:	31 c0                	xor    eax,eax
     11ef89c:	88 83 48 02 00 00    	mov    BYTE PTR [rbx+0x248],al
     11ef8a2:	66 0f ef c0          	pxor   xmm0,xmm0
     11ef8a6:	66 0f 7f 83 50 02 00 	movdqa XMMWORD PTR [rbx+0x250],xmm0
     11ef8ad:	00 
     11ef8ae:	66 0f 7f 83 60 02 00 	movdqa XMMWORD PTR [rbx+0x260],xmm0
     11ef8b5:	00 
     11ef8b6:	f3 0f 7f 83 18 02 00 	movdqu XMMWORD PTR [rbx+0x218],xmm0
     11ef8bd:	00 
     11ef8be:	f3 0f 7f 83 21 02 00 	movdqu XMMWORD PTR [rbx+0x221],xmm0
     11ef8c5:	00 
     11ef8c6:	c7 83 70 02 00 00 00 	mov    DWORD PTR [rbx+0x270],0x3f800000
     11ef8cd:	00 80 3f 
     11ef8d0:	88 83 78 02 00 00    	mov    BYTE PTR [rbx+0x278],al
     11ef8d6:	66 0f 7f 83 80 02 00 	movdqa XMMWORD PTR [rbx+0x280],xmm0
     11ef8dd:	00 
     11ef8de:	f3 0f 7f 83 89 02 00 	movdqu XMMWORD PTR [rbx+0x289],xmm0
     11ef8e5:	00 
     11ef8e6:	83 a3 a0 02 00 00 00 	and    DWORD PTR [rbx+0x2a0],0x0
     11ef8ed:	48 8d bb c0 02 00 00 	lea    rdi,[rbx+0x2c0]
     11ef8f4:	f3 0f 7f 83 a8 02 00 	movdqu XMMWORD PTR [rbx+0x2a8],xmm0
     11ef8fb:	00 
     11ef8fc:	48 83 a3 b8 02 00 00 	and    QWORD PTR [rbx+0x2b8],0x0
     11ef903:	00 
     11ef904:	e8 21 5e 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     11ef909:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11ef910:	00 
     11ef911:	e8 3c 23 bf ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
     11ef916:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11ef91d:	00 
     11ef91e:	e8 2d 98 00 00       	call   11f9150 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6d4>
     11ef923:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11ef92a:	00 
     11ef92b:	e8 46 98 00 00       	call   11f9176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6fa>
     11ef930:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11ef937:	00 
     11ef938:	e8 77 40 8d ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
     11ef93d:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
     11ef944:	00 
     11ef945:	e8 08 23 bf ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
     11ef94a:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11ef951:	00 
     11ef952:	e8 39 e5 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11ef957:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     11ef95e:	00 
     11ef95f:	e8 2c e5 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11ef964:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
     11ef96b:	00 
     11ef96c:	e8 43 40 8d ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
     11ef971:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11ef976:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ef979:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11ef980:	00 
     11ef981:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11ef984:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
     11ef989:	4c 8b bc 24 50 05 00 	mov    r15,QWORD PTR [rsp+0x550]
     11ef990:	00 
     11ef991:	6a 78                	push   0x78
     11ef993:	5f                   	pop    rdi
     11ef994:	e8 67 e5 5f 00       	call   17edf00 <_Znwm@plt>
     11ef999:	49 89 c6             	mov    r14,rax
     11ef99c:	48 8d 05 1d 00 67 00 	lea    rax,[rip+0x67001d]        # 185f9c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1c0a8>
     11ef9a3:	49 89 06             	mov    QWORD PTR [r14],rax
     11ef9a6:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     11ef9aa:	4d 8d 66 10          	lea    r12,[r14+0x10]
     11ef9ae:	4c 89 e7             	mov    rdi,r12
     11ef9b1:	e8 8c be b3 ff       	call   d2b842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2787e2>
     11ef9b6:	4d 8b 6e 08          	mov    r13,QWORD PTR [r14+0x8]
     11ef9ba:	4c 8d 84 24 20 05 00 	lea    r8,[rsp+0x520]
     11ef9c1:	00 
     11ef9c2:	4d 89 30             	mov    QWORD PTR [r8],r14
     11ef9c5:	48 8d 35 c5 d6 8a ff 	lea    rsi,[rip+0xffffffffff8ad6c5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11ef9cc:	48 8d 0d 93 cf 07 00 	lea    rcx,[rip+0x7cf93]        # 126c966 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1eea>
     11ef9d3:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]
     11ef9da:	00 
     11ef9db:	6a 08                	push   0x8
     11ef9dd:	41 59                	pop    r9
     11ef9df:	48 89 ef             	mov    rdi,rbp
     11ef9e2:	31 d2                	xor    edx,edx
     11ef9e4:	e8 ab ad 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     11ef9e9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     11ef9ed:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11ef9f4:	00 
     11ef9f5:	4c 89 ee             	mov    rsi,r13
     11ef9f8:	48 89 ea             	mov    rdx,rbp
     11ef9fb:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11ef9fe:	4c 89 f7             	mov    rdi,r14
     11efa01:	48 83 c7 68          	add    rdi,0x68
     11efa05:	4c 8d a4 24 e0 04 00 	lea    r12,[rsp+0x4e0]
     11efa0c:	00 
     11efa0d:	4c 89 e6             	mov    rsi,r12
     11efa10:	e8 29 a0 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11efa15:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     11efa1a:	e8 67 ea 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11efa1f:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11efa26:	00 
     11efa27:	e8 bc ad 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11efa2c:	48 83 a4 24 a0 05 00 	and    QWORD PTR [rsp+0x5a0],0x0
     11efa33:	00 00 

## All accesses to rsp+0x650 in containing FDE
### 0x11f0397: mov    r15,QWORD PTR [rsp+0x650]
     11f0342:	4c 89 f7             	mov    rdi,r14
     11f0345:	31 f6                	xor    esi,esi
     11f0347:	e8 44 e8 5f 00       	call   17eeb90 <memset@plt>
     11f034c:	4c 89 f7             	mov    rdi,r14
     11f034f:	e8 98 5c eb ff       	call   10a5fec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d402>
     11f0354:	4c 89 b3 38 06 00 00 	mov    QWORD PTR [rbx+0x638],r14
     11f035b:	4c 89 bb 40 06 00 00 	mov    QWORD PTR [rbx+0x640],r15
     11f0362:	31 ff                	xor    edi,edi
     11f0364:	e8 b3 e0 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     11f0369:	66 83 a3 58 06 00 00 	and    WORD PTR [rbx+0x658],0x0
     11f0370:	00 
     11f0371:	66 0f ef c0          	pxor   xmm0,xmm0
     11f0375:	f3 0f 7f 83 48 06 00 	movdqu XMMWORD PTR [rbx+0x648],xmm0
     11f037c:	00 
     11f037d:	48 8d 05 64 c5 66 00 	lea    rax,[rip+0x66c564]        # 185c8e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18fd0>
     11f0384:	48 89 83 60 06 00 00 	mov    QWORD PTR [rbx+0x660],rax
     11f038b:	48 8d bb 68 06 00 00 	lea    rdi,[rbx+0x668]
     11f0392:	e8 6b 9a 5e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     11f0397:	4c 8b bc 24 50 06 00 	mov    r15,QWORD PTR [rsp+0x650]
     11f039e:	00 
     11f039f:	4c 8d 84 24 e0 04 00 	lea    r8,[rsp+0x4e0]
     11f03a6:	00 
     11f03a7:	49 89 18             	mov    QWORD PTR [r8],rbx
     11f03aa:	48 8d 35 e0 cc 8a ff 	lea    rsi,[rip+0xffffffffff8acce0]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f03b1:	48 8d 0d 3c 58 00 00 	lea    rcx,[rip+0x583c]        # 11f5bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b178>
     11f03b8:	4c 8d b4 24 f0 01 00 	lea    r14,[rsp+0x1f0]
     11f03bf:	00 
     11f03c0:	6a 08                	push   0x8
     11f03c2:	41 59                	pop    r9
     11f03c4:	4c 89 f7             	mov    rdi,r14
     11f03c7:	31 d2                	xor    edx,edx
     11f03c9:	e8 c6 a3 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     11f03ce:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11f03d1:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f03d8:	00 
     11f03d9:	4c 89 fe             	mov    rsi,r15
     11f03dc:	4c 89 f2             	mov    rdx,r14
     11f03df:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]

### 0x11f04d7: mov    rsi,QWORD PTR [rsp+0x650]
     11f047b:	00 
     11f047c:	e8 41 12 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     11f0481:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f0484:	4c 89 f7             	mov    rdi,r14
     11f0487:	ff 50 60             	call   QWORD PTR [rax+0x60]
     11f048a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     11f048f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11f0494:	8a 80 aa 00 00 00    	mov    al,BYTE PTR [rax+0xaa]
     11f049a:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
     11f049e:	48 8d 93 f0 06 00 00 	lea    rdx,[rbx+0x6f0]
     11f04a5:	48 8d 05 3c e6 66 00 	lea    rax,[rip+0x66e63c]        # 185eae8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b1d0>
     11f04ac:	48 89 83 e8 06 00 00 	mov    QWORD PTR [rbx+0x6e8],rax
     11f04b3:	48 8d 05 86 e6 66 00 	lea    rax,[rip+0x66e686]        # 185eb40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b228>
     11f04ba:	48 89 83 f0 06 00 00 	mov    QWORD PTR [rbx+0x6f0],rax
     11f04c1:	4c 89 a3 f8 06 00 00 	mov    QWORD PTR [rbx+0x6f8],r12
     11f04c8:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
     11f04cf:	00 
     11f04d0:	48 89 83 00 07 00 00 	mov    QWORD PTR [rbx+0x700],rax
     11f04d7:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
     11f04de:	00 
     11f04df:	48 89 b3 08 07 00 00 	mov    QWORD PTR [rbx+0x708],rsi
     11f04e6:	48 8d bb 10 07 00 00 	lea    rdi,[rbx+0x710]
     11f04ed:	48 8d 84 24 e8 04 00 	lea    rax,[rsp+0x4e8]
     11f04f4:	00 
     11f04f5:	66 0f ef c0          	pxor   xmm0,xmm0
     11f04f9:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     11f04fd:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     11f0501:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f0504:	6a 09                	push   0x9
     11f0506:	59                   	pop    rcx
     11f0507:	4c 8d 84 24 e0 04 00 	lea    r8,[rsp+0x4e0]
     11f050e:	00 
     11f050f:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     11f0515:	48 8d ab a8 05 00 00 	lea    rbp,[rbx+0x5a8]
     11f051c:	4c 8d bb e8 06 00 00 	lea    r15,[rbx+0x6e8]
     11f0523:	48 8b bc 24 e8 04 00 	mov    rdi,QWORD PTR [rsp+0x4e8]
     11f052a:	00 
     11f052b:	e8 90 e0 8e ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>

### 0x11f0cd7: mov    r15,QWORD PTR [rsp+0x650]
     11f0c7f:	48 8d 0d 5a 71 7e ff 	lea    rcx,[rip+0xffffffffff7e715a]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11f0c86:	48 89 8c 24 60 05 00 	mov    QWORD PTR [rsp+0x560],rcx
     11f0c8d:	00 
     11f0c8e:	48 8d 0d 93 66 07 00 	lea    rcx,[rip+0x76693]        # 1267328 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xac8ac>
     11f0c95:	48 89 8c 24 68 05 00 	mov    QWORD PTR [rsp+0x568],rcx
     11f0c9c:	00 
     11f0c9d:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11f0ca2:	40 8a a9 dd 00 00 00 	mov    bpl,BYTE PTR [rcx+0xdd]
     11f0ca9:	48 89 83 68 0f 00 00 	mov    QWORD PTR [rbx+0xf68],rax
     11f0cb0:	48 8d bb 70 0f 00 00 	lea    rdi,[rbx+0xf70]
     11f0cb7:	e8 b0 0d 02 00       	call   1211a6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ff0>
     11f0cbc:	48 83 a3 90 0f 00 00 	and    QWORD PTR [rbx+0xf90],0x0
     11f0cc3:	00 
     11f0cc4:	48 83 a3 a0 0f 00 00 	and    QWORD PTR [rbx+0xfa0],0x0
     11f0ccb:	00 
     11f0ccc:	48 8b 84 24 f0 04 00 	mov    rax,QWORD PTR [rsp+0x4f0]
     11f0cd3:	00 
     11f0cd4:	48 85 c0             	test   rax,rax
     11f0cd7:	4c 8b bc 24 50 06 00 	mov    r15,QWORD PTR [rsp+0x650]
     11f0cde:	00 
     11f0cdf:	74 33                	je     11f0d14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36298>
     11f0ce1:	48 8d b3 90 0f 00 00 	lea    rsi,[rbx+0xf90]
     11f0ce8:	48 89 83 a0 0f 00 00 	mov    QWORD PTR [rbx+0xfa0],rax
     11f0cef:	6a 01                	push   0x1
     11f0cf1:	5f                   	pop    rdi
     11f0cf2:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
     11f0cf9:	00 
     11f0cfa:	ff d0                	call   rax
     11f0cfc:	48 8b 84 24 f8 04 00 	mov    rax,QWORD PTR [rsp+0x4f8]
     11f0d03:	00 
     11f0d04:	48 89 83 a8 0f 00 00 	mov    QWORD PTR [rbx+0xfa8],rax
     11f0d0b:	48 83 a4 24 f0 04 00 	and    QWORD PTR [rsp+0x4f0],0x0
     11f0d12:	00 00 
     11f0d14:	48 8d bb b0 0f 00 00 	lea    rdi,[rbx+0xfb0]
     11f0d1b:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
     11f0d22:	00 
     11f0d23:	4c 89 f6             	mov    rsi,r14
     11f0d26:	e8 13 37 ea ff       	call   109443e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25b854>

### 0x11f10bc: mov    rbp,QWORD PTR [rsp+0x650]
     11f1074:	00 
     11f1075:	48 83 a3 c8 14 00 00 	and    QWORD PTR [rbx+0x14c8],0x0
     11f107c:	00 
     11f107d:	4c 8d a3 d0 14 00 00 	lea    r12,[rbx+0x14d0]
     11f1084:	4c 89 e7             	mov    rdi,r12
     11f1087:	e8 6a 89 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11f108c:	49 89 6d 00          	mov    QWORD PTR [r13+0x0],rbp
     11f1090:	48 8d 35 fa bf 8a ff 	lea    rsi,[rip+0xffffffffff8abffa]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f1097:	48 8d 0d 4c 98 00 00 	lea    rcx,[rip+0x984c]        # 11fa8ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fe6e>
     11f109e:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]
     11f10a5:	00 
     11f10a6:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
     11f10ad:	00 
     11f10ae:	6a 08                	push   0x8
     11f10b0:	41 59                	pop    r9
     11f10b2:	4c 89 ef             	mov    rdi,r13
     11f10b5:	31 d2                	xor    edx,edx
     11f10b7:	e8 d8 96 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     11f10bc:	48 8b ac 24 50 06 00 	mov    rbp,QWORD PTR [rsp+0x650]
     11f10c3:	00 
     11f10c4:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11f10c8:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f10cf:	00 
     11f10d0:	48 89 ee             	mov    rsi,rbp
     11f10d3:	31 d2                	xor    edx,edx
     11f10d5:	4c 89 e9             	mov    rcx,r13
     11f10d8:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     11f10de:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f10e5:	00 
     11f10e6:	4c 89 e7             	mov    rdi,r12
     11f10e9:	4c 89 f6             	mov    rsi,r14
     11f10ec:	e8 01 8b 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11f10f1:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f10f5:	e8 8c d3 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f10fa:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f1101:	00 
     11f1102:	e8 e1 96 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f1107:	48 8d 05 82 cb 66 00 	lea    rax,[rip+0x66cb82]        # 185dc90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a378>

### 0x11f3720: mov    rax,QWORD PTR [rsp+0x650]
     11f36c3:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     11f36c6:	0f 29 84 24 50 05 00 	movaps XMMWORD PTR [rsp+0x550],xmm0
     11f36cd:	00 
     11f36ce:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     11f36d2:	48 89 84 24 60 05 00 	mov    QWORD PTR [rsp+0x560],rax
     11f36d9:	00 
     11f36da:	48 8d 05 67 92 66 00 	lea    rax,[rip+0x669267]        # 185c948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19030>
     11f36e1:	48 89 83 20 1f 00 00 	mov    QWORD PTR [rbx+0x1f20],rax
     11f36e8:	48 89 ab 28 1f 00 00 	mov    QWORD PTR [rbx+0x1f28],rbp
     11f36ef:	4c 89 bb 30 1f 00 00 	mov    QWORD PTR [rbx+0x1f30],r15
     11f36f6:	48 8b 84 24 98 06 00 	mov    rax,QWORD PTR [rsp+0x698]
     11f36fd:	00 
     11f36fe:	48 89 83 38 1f 00 00 	mov    QWORD PTR [rbx+0x1f38],rax
     11f3705:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     11f370a:	48 89 83 40 1f 00 00 	mov    QWORD PTR [rbx+0x1f40],rax
     11f3711:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     11f3718:	00 
     11f3719:	48 89 83 48 1f 00 00 	mov    QWORD PTR [rbx+0x1f48],rax
     11f3720:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
     11f3727:	00 
     11f3728:	48 89 83 50 1f 00 00 	mov    QWORD PTR [rbx+0x1f50],rax
     11f372f:	48 8d bb 58 1f 00 00 	lea    rdi,[rbx+0x1f58]
     11f3736:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     11f373d:	00 
     11f373e:	e8 29 e3 01 00       	call   1211a6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ff0>
     11f3743:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11f3748:	48 89 83 78 1f 00 00 	mov    QWORD PTR [rbx+0x1f78],rax
     11f374f:	48 8b 84 24 f8 00 00 	mov    rax,QWORD PTR [rsp+0xf8]
     11f3756:	00 
     11f3757:	48 89 83 80 1f 00 00 	mov    QWORD PTR [rbx+0x1f80],rax
     11f375e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     11f3763:	48 89 83 88 1f 00 00 	mov    QWORD PTR [rbx+0x1f88],rax
     11f376a:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     11f3771:	00 
     11f3772:	48 89 83 90 1f 00 00 	mov    QWORD PTR [rbx+0x1f90],rax
     11f3779:	48 8b 84 24 60 06 00 	mov    rax,QWORD PTR [rsp+0x660]
     11f3780:	00 
     11f3781:	48 89 83 98 1f 00 00 	mov    QWORD PTR [rbx+0x1f98],rax

### 0x11f3bc8: mov    rsi,QWORD PTR [rsp+0x650]
     11f3b70:	48 8d 93 f0 22 00 00 	lea    rdx,[rbx+0x22f0]
     11f3b77:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     11f3b7e:	00 
     11f3b7f:	48 8d 0d 4a 7e 66 00 	lea    rcx,[rip+0x667e4a]        # 185b9d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x180b8>
     11f3b86:	48 89 8b f0 29 00 00 	mov    QWORD PTR [rbx+0x29f0],rcx
     11f3b8d:	48 89 54 24 38       	mov    QWORD PTR [rsp+0x38],rdx
     11f3b92:	48 89 93 f8 29 00 00 	mov    QWORD PTR [rbx+0x29f8],rdx
     11f3b99:	48 89 83 00 2a 00 00 	mov    QWORD PTR [rbx+0x2a00],rax
     11f3ba0:	48 8b bc 24 c8 05 00 	mov    rdi,QWORD PTR [rsp+0x5c8]
     11f3ba7:	00 
     11f3ba8:	e8 d9 a8 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f3bad:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11f3bb2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f3bb5:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f3bbc:	00 
     11f3bbd:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f3bc0:	4c 8b b4 24 50 05 00 	mov    r14,QWORD PTR [rsp+0x550]
     11f3bc7:	00 
     11f3bc8:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
     11f3bcf:	00 
     11f3bd0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f3bd3:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
     11f3bda:	00 
     11f3bdb:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     11f3be1:	4c 89 b3 08 2a 00 00 	mov    QWORD PTR [rbx+0x2a08],r14
     11f3be8:	4c 8b a4 24 c0 06 00 	mov    r12,QWORD PTR [rsp+0x6c0]
     11f3bef:	00 
     11f3bf0:	4c 89 a3 10 2a 00 00 	mov    QWORD PTR [rbx+0x2a10],r12
     11f3bf7:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11f3bfc:	8b 81 d4 00 00 00    	mov    eax,DWORD PTR [rcx+0xd4]
     11f3c02:	89 83 18 2a 00 00    	mov    DWORD PTR [rbx+0x2a18],eax
     11f3c08:	8b 81 d8 00 00 00    	mov    eax,DWORD PTR [rcx+0xd8]
     11f3c0e:	89 83 1c 2a 00 00    	mov    DWORD PTR [rbx+0x2a1c],eax
     11f3c14:	48 8d bb 20 2a 00 00 	lea    rdi,[rbx+0x2a20]
     11f3c1b:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
     11f3c20:	e8 d1 5d 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11f3c25:	4c 8d ab 30 2a 00 00 	lea    r13,[rbx+0x2a30]
     11f3c2c:	4c 89 ef             	mov    rdi,r13

### 0x11f3ff0: mov    rsi,QWORD PTR [rsp+0x650]
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

### 0x11f414d: mov    rax,QWORD PTR [rsp+0x650]
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

### 0x11f452e: mov    r13,QWORD PTR [rsp+0x650]
     11f44d4:	f3 41 0f 7f 87 08 20 	movdqu XMMWORD PTR [r15+0x2008],xmm0
     11f44db:	00 00 
     11f44dd:	f3 41 0f 7f 87 18 20 	movdqu XMMWORD PTR [r15+0x2018],xmm0
     11f44e4:	00 00 
     11f44e6:	4d 8d b7 28 20 00 00 	lea    r14,[r15+0x2028]
     11f44ed:	f3 41 0f 7f 87 08 12 	movdqu XMMWORD PTR [r15+0x1208],xmm0
     11f44f4:	00 00 
     11f44f6:	41 88 87 18 12 00 00 	mov    BYTE PTR [r15+0x1218],al
     11f44fd:	41 88 87 b8 1f 00 00 	mov    BYTE PTR [r15+0x1fb8],al
     11f4504:	f3 41 0f 7f 87 a8 1f 	movdqu XMMWORD PTR [r15+0x1fa8],xmm0
     11f450b:	00 00 
     11f450d:	f3 41 0f 7f 87 98 1f 	movdqu XMMWORD PTR [r15+0x1f98],xmm0
     11f4514:	00 00 
     11f4516:	f3 41 0f 7f 87 88 1f 	movdqu XMMWORD PTR [r15+0x1f88],xmm0
     11f451d:	00 00 
     11f451f:	4c 89 f7             	mov    rdi,r14
     11f4522:	e8 03 12 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     11f4527:	4d 8d a7 38 20 00 00 	lea    r12,[r15+0x2038]
     11f452e:	4c 8b ac 24 50 06 00 	mov    r13,QWORD PTR [rsp+0x650]
     11f4535:	00 
     11f4536:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     11f453a:	4c 89 e7             	mov    rdi,r12
     11f453d:	4c 89 ee             	mov    rsi,r13
     11f4540:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     11f4546:	49 8d bf 68 20 00 00 	lea    rdi,[r15+0x2068]
     11f454d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     11f4551:	4c 89 ee             	mov    rsi,r13
     11f4554:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     11f455a:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11f4561:	00 
     11f4562:	e8 29 99 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f4567:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f456e:	00 
     11f456f:	e8 3a 16 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
     11f4574:	48 89 ab d0 4a 00 00 	mov    QWORD PTR [rbx+0x4ad0],rbp
     11f457b:	4c 89 bb d8 4a 00 00 	mov    QWORD PTR [rbx+0x4ad8],r15
     11f4582:	31 ff                	xor    edi,edi
     11f4584:	e8 93 9e 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>

## Stack-pointer adjustments in function
     11ef33e:	48 81 ec 08 06 00 00 	sub    rsp,0x608
     11ef4be:	48 83 c4 10          	add    rsp,0x10
     11ef4e7:	48 83 c4 10          	add    rsp,0x10
     11ef513:	48 83 c4 10          	add    rsp,0x10
     11ef53f:	48 83 c4 10          	add    rsp,0x10
     11ef56e:	48 83 c4 10          	add    rsp,0x10
     11ef59d:	48 83 c4 10          	add    rsp,0x10
     11ef5cc:	48 83 c4 10          	add    rsp,0x10
     11f4eb7:	48 81 c4 08 06 00 00 	add    rsp,0x608

## Direct callers to containing FDE start
### caller @0x11eee4c, caller FDE=(18802184, 18804775)
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

## Calls into first 0x200 bytes of containing FDE
### 0x11eee4c -> 0x11ef334; caller FDE=(18802184, 18804775)
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

## ABI stack-argument heuristic
- frame allocation at 0x11ef33e: 0x608
- current rsp+0x650 minus frame allocation = 0x48
- add 8 bytes when reasoning relative to caller RSP because CALL pushed the return address.
- SysV AMD64 integer/pointer args 1..6 arrive in rdi,rsi,rdx,rcx,r8,r9; later args are on the caller stack.

## Prologue spills of incoming argument registers
     11ef345:	4c 89 8c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r9
     11ef34d:	4c 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r8
     11ef355:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     11ef35a:	48 89 94 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rdx
     11ef3b6:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     11ef3c2:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     11ef462:	48 89 54 24 70       	mov    QWORD PTR [rsp+0x70],rdx
     11ef6fd:	48 89 8c 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rcx
     11ef723:	48 89 8c 24 50 05 00 	mov    QWORD PTR [rsp+0x550],rcx
