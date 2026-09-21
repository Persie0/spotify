# Smart-skip interval field producers

Target object: TimelineConductor dependency, allocated 0xbd0 at 0x135f2b8, pointer r14, AP 0x1868200.
Target fields: +0xb08 and +0xb10, consumed by smartSkipEmbeddedPodcastAd interval lookup.

## Constructor writes/references to r14+0xb08
### 0x135fc03: mov    QWORD PTR [r14+0xb08],r15
     135fbac:	e8 d5 94 e9 ff       	call   11f9086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e60a>
     135fbb1:	48 8d bc 24 40 0f 00 	lea    rdi,[rsp+0xf40]
     135fbb8:	00 
     135fbb9:	e8 bc 71 00 00       	call   1366d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac2fe>
     135fbbe:	31 db                	xor    ebx,ebx
     135fbc0:	41 88 9e e8 0a 00 00 	mov    BYTE PTR [r14+0xae8],bl
     135fbc7:	66 0f ef c0          	pxor   xmm0,xmm0
     135fbcb:	66 41 0f 7f 86 b0 0a 	movdqa XMMWORD PTR [r14+0xab0],xmm0
     135fbd2:	00 00 
     135fbd4:	66 41 0f 7f 86 c0 0a 	movdqa XMMWORD PTR [r14+0xac0],xmm0
     135fbdb:	00 00 
     135fbdd:	66 41 0f 7f 86 d0 0a 	movdqa XMMWORD PTR [r14+0xad0],xmm0
     135fbe4:	00 00 
     135fbe6:	41 88 9e e0 0a 00 00 	mov    BYTE PTR [r14+0xae0],bl
     135fbed:	49 83 a6 f0 0a 00 00 	and    QWORD PTR [r14+0xaf0],0x0
     135fbf4:	00 
     135fbf5:	41 88 9e f8 0a 00 00 	mov    BYTE PTR [r14+0xaf8],bl
     135fbfc:	41 88 9e 00 0b 00 00 	mov    BYTE PTR [r14+0xb00],bl
     135fc03:	4d 89 be 08 0b 00 00 	mov    QWORD PTR [r14+0xb08],r15
     135fc0a:	4d 89 a6 10 0b 00 00 	mov    QWORD PTR [r14+0xb10],r12
     135fc11:	48 8b 84 24 20 11 00 	mov    rax,QWORD PTR [rsp+0x1120]
     135fc18:	00 
     135fc19:	49 89 86 18 0b 00 00 	mov    QWORD PTR [r14+0xb18],rax
     135fc20:	4d 8d be 20 0b 00 00 	lea    r15,[r14+0xb20]
     135fc27:	48 8d b4 24 d0 09 00 	lea    rsi,[rsp+0x9d0]
     135fc2e:	00 
     135fc2f:	4c 89 ff             	mov    rdi,r15
     135fc32:	e8 c1 95 82 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
     135fc37:	4d 8d ae 50 0b 00 00 	lea    r13,[r14+0xb50]
     135fc3e:	4c 89 ef             	mov    rdi,r13
     135fc41:	e8 38 86 7c ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
     135fc46:	66 41 83 a6 a8 0b 00 	and    WORD PTR [r14+0xba8],0x0
     135fc4d:	00 00 
     135fc4f:	41 88 9e aa 0b 00 00 	mov    BYTE PTR [r14+0xbaa],bl
     135fc56:	49 8d ae b0 0b 00 00 	lea    rbp,[r14+0xbb0]
     135fc5d:	48 89 ef             	mov    rdi,rbp
     135fc60:	48 8b b4 24 98 10 00 	mov    rsi,QWORD PTR [rsp+0x1098]
     135fc67:	00 
     135fc68:	e8 55 1a 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     135fc6d:	49 8d 9e c0 0b 00 00 	lea    rbx,[r14+0xbc0]
     135fc74:	48 89 df             	mov    rdi,rbx
     135fc77:	4c 8b 64 24 78       	mov    r12,QWORD PTR [rsp+0x78]
     135fc7c:	e8 a9 5a 80 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     135fc81:	4c 89 f7             	mov    rdi,r14
     135fc84:	31 f6                	xor    esi,esi
     135fc86:	e8 15 71 00 00       	call   1366da0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac324>
     135fc8b:	49 8b be 78 07 00 00 	mov    rdi,QWORD PTR [r14+0x778]
     135fc92:	48 8d b4 24 00 0f 00 	lea    rsi,[rsp+0xf00]
     135fc99:	00 
     135fc9a:	4c 89 36             	mov    QWORD PTR [rsi],r14
     135fc9d:	48 8d 05 c0 c7 71 ff 	lea    rax,[rip+0xffffffffff71c7c0]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135fca4:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     135fca8:	48 8d 05 49 73 00 00 	lea    rax,[rip+0x7349]        # 1366ff8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac57c>

## Constructor writes/references to r14+0xb10
### 0x135fc0a: mov    QWORD PTR [r14+0xb10],r12
     135fbb1:	48 8d bc 24 40 0f 00 	lea    rdi,[rsp+0xf40]
     135fbb8:	00 
     135fbb9:	e8 bc 71 00 00       	call   1366d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac2fe>
     135fbbe:	31 db                	xor    ebx,ebx
     135fbc0:	41 88 9e e8 0a 00 00 	mov    BYTE PTR [r14+0xae8],bl
     135fbc7:	66 0f ef c0          	pxor   xmm0,xmm0
     135fbcb:	66 41 0f 7f 86 b0 0a 	movdqa XMMWORD PTR [r14+0xab0],xmm0
     135fbd2:	00 00 
     135fbd4:	66 41 0f 7f 86 c0 0a 	movdqa XMMWORD PTR [r14+0xac0],xmm0
     135fbdb:	00 00 
     135fbdd:	66 41 0f 7f 86 d0 0a 	movdqa XMMWORD PTR [r14+0xad0],xmm0
     135fbe4:	00 00 
     135fbe6:	41 88 9e e0 0a 00 00 	mov    BYTE PTR [r14+0xae0],bl
     135fbed:	49 83 a6 f0 0a 00 00 	and    QWORD PTR [r14+0xaf0],0x0
     135fbf4:	00 
     135fbf5:	41 88 9e f8 0a 00 00 	mov    BYTE PTR [r14+0xaf8],bl
     135fbfc:	41 88 9e 00 0b 00 00 	mov    BYTE PTR [r14+0xb00],bl
     135fc03:	4d 89 be 08 0b 00 00 	mov    QWORD PTR [r14+0xb08],r15
     135fc0a:	4d 89 a6 10 0b 00 00 	mov    QWORD PTR [r14+0xb10],r12
     135fc11:	48 8b 84 24 20 11 00 	mov    rax,QWORD PTR [rsp+0x1120]
     135fc18:	00 
     135fc19:	49 89 86 18 0b 00 00 	mov    QWORD PTR [r14+0xb18],rax
     135fc20:	4d 8d be 20 0b 00 00 	lea    r15,[r14+0xb20]
     135fc27:	48 8d b4 24 d0 09 00 	lea    rsi,[rsp+0x9d0]
     135fc2e:	00 
     135fc2f:	4c 89 ff             	mov    rdi,r15
     135fc32:	e8 c1 95 82 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
     135fc37:	4d 8d ae 50 0b 00 00 	lea    r13,[r14+0xb50]
     135fc3e:	4c 89 ef             	mov    rdi,r13
     135fc41:	e8 38 86 7c ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
     135fc46:	66 41 83 a6 a8 0b 00 	and    WORD PTR [r14+0xba8],0x0
     135fc4d:	00 00 
     135fc4f:	41 88 9e aa 0b 00 00 	mov    BYTE PTR [r14+0xbaa],bl
     135fc56:	49 8d ae b0 0b 00 00 	lea    rbp,[r14+0xbb0]
     135fc5d:	48 89 ef             	mov    rdi,rbp
     135fc60:	48 8b b4 24 98 10 00 	mov    rsi,QWORD PTR [rsp+0x1098]
     135fc67:	00 
     135fc68:	e8 55 1a 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     135fc6d:	49 8d 9e c0 0b 00 00 	lea    rbx,[r14+0xbc0]
     135fc74:	48 89 df             	mov    rdi,rbx
     135fc77:	4c 8b 64 24 78       	mov    r12,QWORD PTR [rsp+0x78]
     135fc7c:	e8 a9 5a 80 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     135fc81:	4c 89 f7             	mov    rdi,r14
     135fc84:	31 f6                	xor    esi,esi
     135fc86:	e8 15 71 00 00       	call   1366da0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac324>
     135fc8b:	49 8b be 78 07 00 00 	mov    rdi,QWORD PTR [r14+0x778]
     135fc92:	48 8d b4 24 00 0f 00 	lea    rsi,[rsp+0xf00]
     135fc99:	00 
     135fc9a:	4c 89 36             	mov    QWORD PTR [rsi],r14
     135fc9d:	48 8d 05 c0 c7 71 ff 	lea    rax,[rip+0xffffffffff71c7c0]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135fca4:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     135fca8:	48 8d 05 49 73 00 00 	lea    rax,[rip+0x7349]        # 1366ff8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac57c>
     135fcaf:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax

## Non-stack qword stores to +0xb08 across binary
### 0x135fc03 FDE=(20303958, 20319259): mov    QWORD PTR [r14+0xb08],r15
     135fbd2:	00 00 
     135fbd4:	66 41 0f 7f 86 c0 0a 	movdqa XMMWORD PTR [r14+0xac0],xmm0
     135fbdb:	00 00 
     135fbdd:	66 41 0f 7f 86 d0 0a 	movdqa XMMWORD PTR [r14+0xad0],xmm0
     135fbe4:	00 00 
     135fbe6:	41 88 9e e0 0a 00 00 	mov    BYTE PTR [r14+0xae0],bl
     135fbed:	49 83 a6 f0 0a 00 00 	and    QWORD PTR [r14+0xaf0],0x0
     135fbf4:	00 
     135fbf5:	41 88 9e f8 0a 00 00 	mov    BYTE PTR [r14+0xaf8],bl
     135fbfc:	41 88 9e 00 0b 00 00 	mov    BYTE PTR [r14+0xb00],bl
     135fc03:	4d 89 be 08 0b 00 00 	mov    QWORD PTR [r14+0xb08],r15
     135fc0a:	4d 89 a6 10 0b 00 00 	mov    QWORD PTR [r14+0xb10],r12
     135fc11:	48 8b 84 24 20 11 00 	mov    rax,QWORD PTR [rsp+0x1120]
     135fc18:	00 
     135fc19:	49 89 86 18 0b 00 00 	mov    QWORD PTR [r14+0xb18],rax
     135fc20:	4d 8d be 20 0b 00 00 	lea    r15,[r14+0xb20]
     135fc27:	48 8d b4 24 d0 09 00 	lea    rsi,[rsp+0x9d0]
     135fc2e:	00 
     135fc2f:	4c 89 ff             	mov    rdi,r15
     135fc32:	e8 c1 95 82 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
     135fc37:	4d 8d ae 50 0b 00 00 	lea    r13,[r14+0xb50]
     135fc3e:	4c 89 ef             	mov    rdi,r13
     135fc41:	e8 38 86 7c ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
     135fc46:	66 41 83 a6 a8 0b 00 	and    WORD PTR [r14+0xba8],0x0
     135fc4d:	00 00 
     135fc4f:	41 88 9e aa 0b 00 00 	mov    BYTE PTR [r14+0xbaa],bl
     135fc56:	49 8d ae b0 0b 00 00 	lea    rbp,[r14+0xbb0]
     135fc5d:	48 89 ef             	mov    rdi,rbp
     135fc60:	48 8b b4 24 98 10 00 	mov    rsi,QWORD PTR [rsp+0x1098]
     135fc67:	00 

### 0x138e459 FDE=(20504310, 20506126): mov    BYTE PTR [rbx+0xb08],al
     138e428:	e8 9c 05 00 00       	call   138e9c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d3f4d>
     138e42d:	4c 8d a3 e8 0a 00 00 	lea    r12,[rbx+0xae8]
     138e434:	be a0 00 00 00       	mov    esi,0xa0
     138e439:	48 03 75 10          	add    rsi,QWORD PTR [rbp+0x10]
     138e43d:	48 8b 53 40          	mov    rdx,QWORD PTR [rbx+0x40]
     138e441:	4c 89 e7             	mov    rdi,r12
     138e444:	e8 80 05 00 00       	call   138e9c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d3f4d>
     138e449:	83 a3 00 0b 00 00 00 	and    DWORD PTR [rbx+0xb00],0x0
     138e450:	c6 83 04 0b 00 00 01 	mov    BYTE PTR [rbx+0xb04],0x1
     138e457:	31 c0                	xor    eax,eax
     138e459:	88 83 08 0b 00 00    	mov    BYTE PTR [rbx+0xb08],al
     138e45f:	88 83 18 0b 00 00    	mov    BYTE PTR [rbx+0xb18],al
     138e465:	48 8d bb 20 0b 00 00 	lea    rdi,[rbx+0xb20]
     138e46c:	e8 b9 72 7d ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     138e471:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138e478:	00 00 
     138e47a:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
     138e481:	00 
     138e482:	0f 85 7c 01 00 00    	jne    138e604 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d3b88>
     138e488:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
     138e48f:	5b                   	pop    rbx
     138e490:	41 5c                	pop    r12
     138e492:	41 5d                	pop    r13
     138e494:	41 5e                	pop    r14
     138e496:	41 5f                	pop    r15
     138e498:	5d                   	pop    rbp
     138e499:	c3                   	ret
     138e49a:	49 89 c7             	mov    r15,rax
     138e49d:	4c 89 e7             	mov    rdi,r12
     138e4a0:	e8 4d 07 00 00       	call   138ebf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4176>

### 0x139778d FDE=(20543314, 20543487): mov    QWORD PTR [rdi+0xb08],rdx
     139776c:	48 89 c1             	mov    rcx,rax
     139776f:	48 f7 d9             	neg    rcx
     1397772:	31 d2                	xor    edx,edx
     1397774:	48 85 c0             	test   rax,rax
     1397777:	6a 01                	push   0x1
     1397779:	58                   	pop    rax
     139777a:	48 0f 4e 87 a0 04 00 	cmovle rax,QWORD PTR [rdi+0x4a0]
     1397781:	00 
     1397782:	48 0f 4e d1          	cmovle rdx,rcx
     1397786:	80 bf 18 0b 00 00 00 	cmp    BYTE PTR [rdi+0xb18],0x0
     139778d:	48 89 97 08 0b 00 00 	mov    QWORD PTR [rdi+0xb08],rdx
     1397794:	48 89 87 10 0b 00 00 	mov    QWORD PTR [rdi+0xb10],rax
     139779b:	75 07                	jne    13977a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dcd28>
     139779d:	c6 87 18 0b 00 00 01 	mov    BYTE PTR [rdi+0xb18],0x1
     13977a4:	48 81 c7 48 04 00 00 	add    rdi,0x448
     13977ab:	31 c0                	xor    eax,eax
     13977ad:	48 89 e3             	mov    rbx,rsp
     13977b0:	88 43 40             	mov    BYTE PTR [rbx+0x40],al
     13977b3:	88 43 48             	mov    BYTE PTR [rbx+0x48],al
     13977b6:	0f 57 c0             	xorps  xmm0,xmm0
     13977b9:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     13977bc:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
     13977c0:	0f 29 43 20          	movaps XMMWORD PTR [rbx+0x20],xmm0
     13977c4:	88 43 30             	mov    BYTE PTR [rbx+0x30],al
     13977c7:	48 83 63 50 00       	and    QWORD PTR [rbx+0x50],0x0
     13977cc:	48 c7 43 58 01 00 00 	mov    QWORD PTR [rbx+0x58],0x1
     13977d3:	00 
     13977d4:	48 89 de             	mov    rsi,rbx
     13977d7:	e8 24 00 00 00       	call   1397800 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dcd84>
     13977dc:	48 89 df             	mov    rdi,rbx

## Non-stack qword stores to +0xb10 across binary
### 0xaa3ff6 FDE=(11146264, 11168470): mov    QWORD PTR [r15+0xb10],rax
      aa3fcd:	00 
      aa3fce:	49 8d 87 f8 0a 00 00 	lea    rax,[r15+0xaf8]
      aa3fd5:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      aa3fdc:	00 
      aa3fdd:	ba 38 08 00 00       	mov    edx,0x838
      aa3fe2:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
      aa3fe9:	00 
      aa3fea:	31 f6                	xor    esi,esi
      aa3fec:	e8 9f ab d4 00       	call   17eeb90 <memset@plt>
      aa3ff1:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
      aa3ff6:	49 89 87 10 0b 00 00 	mov    QWORD PTR [r15+0xb10],rax
      aa3ffd:	41 c6 87 18 0b 00 00 	mov    BYTE PTR [r15+0xb18],0x0
      aa4004:	00 
      aa4005:	49 89 9f 78 02 00 00 	mov    QWORD PTR [r15+0x278],rbx
      aa400c:	4c 89 64 24 78       	mov    QWORD PTR [rsp+0x78],r12
      aa4011:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      aa4015:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
      aa4019:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
      aa4020:	00 
      aa4021:	e8 97 b6 0b 00       	call   b5f6bd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac65d>
      aa4026:	48 8d bc 24 50 19 00 	lea    rdi,[rsp+0x1950]
      aa402d:	00 
      aa402e:	ba 18 08 00 00       	mov    edx,0x818
      aa4033:	31 f6                	xor    esi,esi
      aa4035:	e8 56 ab d4 00       	call   17eeb90 <memset@plt>
      aa403a:	48 8d 9c 24 30 10 00 	lea    rbx,[rsp+0x1030]
      aa4041:	00 
      aa4042:	ba 19 09 00 00       	mov    edx,0x919
      aa4047:	48 89 df             	mov    rdi,rbx
      aa404a:	31 f6                	xor    esi,esi

### 0x135fc0a FDE=(20303958, 20319259): mov    QWORD PTR [r14+0xb10],r12
     135fbd4:	66 41 0f 7f 86 c0 0a 	movdqa XMMWORD PTR [r14+0xac0],xmm0
     135fbdb:	00 00 
     135fbdd:	66 41 0f 7f 86 d0 0a 	movdqa XMMWORD PTR [r14+0xad0],xmm0
     135fbe4:	00 00 
     135fbe6:	41 88 9e e0 0a 00 00 	mov    BYTE PTR [r14+0xae0],bl
     135fbed:	49 83 a6 f0 0a 00 00 	and    QWORD PTR [r14+0xaf0],0x0
     135fbf4:	00 
     135fbf5:	41 88 9e f8 0a 00 00 	mov    BYTE PTR [r14+0xaf8],bl
     135fbfc:	41 88 9e 00 0b 00 00 	mov    BYTE PTR [r14+0xb00],bl
     135fc03:	4d 89 be 08 0b 00 00 	mov    QWORD PTR [r14+0xb08],r15
     135fc0a:	4d 89 a6 10 0b 00 00 	mov    QWORD PTR [r14+0xb10],r12
     135fc11:	48 8b 84 24 20 11 00 	mov    rax,QWORD PTR [rsp+0x1120]
     135fc18:	00 
     135fc19:	49 89 86 18 0b 00 00 	mov    QWORD PTR [r14+0xb18],rax
     135fc20:	4d 8d be 20 0b 00 00 	lea    r15,[r14+0xb20]
     135fc27:	48 8d b4 24 d0 09 00 	lea    rsi,[rsp+0x9d0]
     135fc2e:	00 
     135fc2f:	4c 89 ff             	mov    rdi,r15
     135fc32:	e8 c1 95 82 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
     135fc37:	4d 8d ae 50 0b 00 00 	lea    r13,[r14+0xb50]
     135fc3e:	4c 89 ef             	mov    rdi,r13
     135fc41:	e8 38 86 7c ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
     135fc46:	66 41 83 a6 a8 0b 00 	and    WORD PTR [r14+0xba8],0x0
     135fc4d:	00 00 
     135fc4f:	41 88 9e aa 0b 00 00 	mov    BYTE PTR [r14+0xbaa],bl
     135fc56:	49 8d ae b0 0b 00 00 	lea    rbp,[r14+0xbb0]
     135fc5d:	48 89 ef             	mov    rdi,rbp
     135fc60:	48 8b b4 24 98 10 00 	mov    rsi,QWORD PTR [rsp+0x1098]
     135fc67:	00 
     135fc68:	e8 55 1a 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>

### 0x1397794 FDE=(20543314, 20543487): mov    QWORD PTR [rdi+0xb10],rax
     139776f:	48 f7 d9             	neg    rcx
     1397772:	31 d2                	xor    edx,edx
     1397774:	48 85 c0             	test   rax,rax
     1397777:	6a 01                	push   0x1
     1397779:	58                   	pop    rax
     139777a:	48 0f 4e 87 a0 04 00 	cmovle rax,QWORD PTR [rdi+0x4a0]
     1397781:	00 
     1397782:	48 0f 4e d1          	cmovle rdx,rcx
     1397786:	80 bf 18 0b 00 00 00 	cmp    BYTE PTR [rdi+0xb18],0x0
     139778d:	48 89 97 08 0b 00 00 	mov    QWORD PTR [rdi+0xb08],rdx
     1397794:	48 89 87 10 0b 00 00 	mov    QWORD PTR [rdi+0xb10],rax
     139779b:	75 07                	jne    13977a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dcd28>
     139779d:	c6 87 18 0b 00 00 01 	mov    BYTE PTR [rdi+0xb18],0x1
     13977a4:	48 81 c7 48 04 00 00 	add    rdi,0x448
     13977ab:	31 c0                	xor    eax,eax
     13977ad:	48 89 e3             	mov    rbx,rsp
     13977b0:	88 43 40             	mov    BYTE PTR [rbx+0x40],al
     13977b3:	88 43 48             	mov    BYTE PTR [rbx+0x48],al
     13977b6:	0f 57 c0             	xorps  xmm0,xmm0
     13977b9:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     13977bc:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
     13977c0:	0f 29 43 20          	movaps XMMWORD PTR [rbx+0x20],xmm0
     13977c4:	88 43 30             	mov    BYTE PTR [rbx+0x30],al
     13977c7:	48 83 63 50 00       	and    QWORD PTR [rbx+0x50],0x0
     13977cc:	48 c7 43 58 01 00 00 	mov    QWORD PTR [rbx+0x58],0x1
     13977d3:	00 
     13977d4:	48 89 de             	mov    rsi,rbx
     13977d7:	e8 24 00 00 00       	call   1397800 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1dcd84>
     13977dc:	48 89 df             	mov    rdi,rbx
     13977df:	e8 e8 6f 70 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>

## High-address/string refs near constructor field setup
## Calls within ±40 instructions of constructor field refs
### field ref 0x135fc03: mov    QWORD PTR [r14+0xb08],r15
-  135fbac:	e8 d5 94 e9 ff       	call   11f9086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e60a>
-  135fbb9:	e8 bc 71 00 00       	call   1366d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac2fe>
-  135fc32:	e8 c1 95 82 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
-  135fc41:	e8 38 86 7c ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
-  135fc68:	e8 55 1a 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
-  135fc7c:	e8 a9 5a 80 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
-  135fc86:	e8 15 71 00 00       	call   1366da0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac324>
-  135fcb6:	ff 50 38             	call   QWORD PTR [rax+0x38]

### field ref 0x135fc0a: mov    QWORD PTR [r14+0xb10],r12
-  135fbac:	e8 d5 94 e9 ff       	call   11f9086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e60a>
-  135fbb9:	e8 bc 71 00 00       	call   1366d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac2fe>
-  135fc32:	e8 c1 95 82 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
-  135fc41:	e8 38 86 7c ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
-  135fc68:	e8 55 1a 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
-  135fc7c:	e8 a9 5a 80 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
-  135fc86:	e8 15 71 00 00       	call   1366da0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac324>
-  135fcb6:	ff 50 38             	call   QWORD PTR [rax+0x38]
-  135fcc1:	e8 5a 74 00 00       	call   1367120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac6a4>

