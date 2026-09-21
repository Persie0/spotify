# d8a5c2 receiver class proof

Question: does carrier[0] really have primary AP 0x1841fc0, making +0x1d8 == fd4a92?
Reason for skepticism: carrier+8 is a real libc++ std::string, so treating carrier+0x18 as a weak pair is structurally impossible.

## Clone/capture constructor FDE (14197896, 14198036)
      d8a488:	41 57                	push   r15
      d8a48a:	41 56                	push   r14
      d8a48c:	53                   	push   rbx
      d8a48d:	48 89 fb             	mov    rbx,rdi
      d8a490:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a494:	49 89 f7             	mov    r15,rsi
      d8a497:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a49c:	6a 60                	push   0x60
      d8a49e:	5f                   	pop    rdi
      d8a49f:	e8 5c 3a a6 00       	call   17edf00 <_Znwm@plt>
      d8a4a4:	49 89 c6             	mov    r14,rax
      d8a4a7:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d8a4aa:	49 89 06             	mov    QWORD PTR [r14],rax
      d8a4ad:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      d8a4b1:	49 8d 77 08          	lea    rsi,[r15+0x8]
      d8a4b5:	e8 86 3a a6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d8a4ba:	41 8a 47 20          	mov    al,BYTE PTR [r15+0x20]
      d8a4be:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
      d8a4c2:	4c 89 f7             	mov    rdi,r14
      d8a4c5:	48 83 c7 30          	add    rdi,0x30
      d8a4c9:	49 83 c7 30          	add    r15,0x30
      d8a4cd:	4c 89 fe             	mov    rsi,r15
      d8a4d0:	e8 e3 dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a4d5:	4c 89 33             	mov    QWORD PTR [rbx],r14
      d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a4e3:	48 8d 05 d8 00 00 00 	lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a4ee:	5b                   	pop    rbx
      d8a4ef:	41 5e                	pop    r14
      d8a4f1:	41 5f                	pop    r15
      d8a4f3:	c3                   	ret
      d8a4f4:	49 89 c7             	mov    r15,rax
      d8a4f7:	4c 89 f7             	mov    rdi,r14
      d8a4fa:	e8 21 3a a6 00       	call   17edf20 <_ZdlPv@plt>
      d8a4ff:	eb 03                	jmp    d8a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5758a>
      d8a501:	49 89 c7             	mov    r15,rax
      d8a504:	48 89 df             	mov    rdi,rbx
      d8a507:	e8 e8 94 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8a50c:	4c 89 ff             	mov    rdi,r15
      d8a50f:	e8 bc 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

## d8a5c2 exact dispatcher
      d8a5aa:	48 89 df             	mov    rdi,rbx
      d8a5ad:	e8 be ff ff ff       	call   d8a570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x575f6>
      d8a5b2:	48 89 df             	mov    rdi,rbx
      d8a5b5:	5b                   	pop    rbx
      d8a5b6:	e9 65 39 a6 00       	jmp    17edf20 <_ZdlPv@plt>
      d8a5bb:	48 8b 02             	mov    rax,QWORD PTR [rdx]
      d8a5be:	48 89 06             	mov    QWORD PTR [rsi],rax
      d8a5c1:	c3                   	ret
      d8a5c2:	53                   	push   rbx
      d8a5c3:	48 89 f1             	mov    rcx,rsi
      d8a5c6:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      d8a5c9:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      d8a5cc:	48 8d 73 08          	lea    rsi,[rbx+0x8]
      d8a5d0:	0f b6 53 20          	movzx  edx,BYTE PTR [rbx+0x20]
      d8a5d4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d8a5d7:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
      d8a5dd:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
      d8a5e1:	6a 01                	push   0x1
      d8a5e3:	5e                   	pop    rsi
      d8a5e4:	5b                   	pop    rbx
      d8a5e5:	e9 76 e3 df ff       	jmp    b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
      d8a5ea:	55                   	push   rbp
      d8a5eb:	41 57                	push   r15
      d8a5ed:	41 56                	push   r14
      d8a5ef:	53                   	push   rbx
      d8a5f0:	50                   	push   rax
      d8a5f1:	48 81 c7 e0 04 00 00 	add    rdi,0x4e0
      d8a5f8:	e8 2f f4 ff ff       	call   d89a2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ab2>
      d8a5fd:	31 db                	xor    ebx,ebx
      d8a5ff:	48 85 c0             	test   rax,rax
      d8a602:	74 2d                	je     d8a631 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x576b7>
      d8a604:	4c 8b 30             	mov    r14,QWORD PTR [rax]
      d8a607:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]

## References/callers to 0xd8a488
### 0xd85619; FDE=(14177572, 14178437): call   d8a488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5750e>
      d855b0:	4c 89 f6             	mov    rsi,r14
      d855b3:	e8 d8 4c cf ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      d855b8:	40 84 ed             	test   bpl,bpl
      d855bb:	0f 84 f7 00 00 00    	je     d856b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5273e>
      d855c1:	41 83 fd 01          	cmp    r13d,0x1
      d855c5:	0f 85 ae 01 00 00    	jne    d85779 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x527ff>
      d855cb:	4d 8b b4 24 58 02 00 	mov    r14,QWORD PTR [r12+0x258]
      d855d2:	00 
      d855d3:	8b 84 24 dc 01 00 00 	mov    eax,DWORD PTR [rsp+0x1dc]
      d855da:	89 84 24 90 00 00 00 	mov    DWORD PTR [rsp+0x90],eax
      d855e1:	0f 10 84 24 cc 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1cc]
      d855e8:	00 
      d855e9:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
      d855f0:	00 
      d855f1:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
      d855f8:	00 00 
      d855fa:	83 a4 24 a0 00 00 00 	and    DWORD PTR [rsp+0xa0],0x0
      d85601:	00 
      d85602:	31 c0                	xor    eax,eax
      d85604:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
      d85608:	88 44 24 78          	mov    BYTE PTR [rsp+0x78],al
      d8560c:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d85611:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
      d85618:	00 
      d85619:	e8 6a 4e 00 00       	call   d8a488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5750e>
      d8561e:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
      d85623:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d85628:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
      d8562f:	00 
      d85630:	e8 df 4e 00 00       	call   d8a514 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5759a>
      d85635:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d85638:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      d8563c:	8a 4c 24 78          	mov    cl,BYTE PTR [rsp+0x78]
      d85640:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl
      d85644:	0f 10 44 24 68       	movups xmm0,XMMWORD PTR [rsp+0x68]
      d85649:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
      d8564d:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
      d85654:	00 
      d85655:	6a 01                	push   0x1
      d85657:	59                   	pop    rcx
      d85658:	4c 8d 44 24 48       	lea    r8,[rsp+0x48]
      d8565d:	4c 8d 4c 24 28       	lea    r9,[rsp+0x28]
      d85662:	48 89 df             	mov    rdi,rbx
      d85665:	4c 89 f6             	mov    rsi,r14
      d85668:	ff d0                	call   rax
      d8566a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      d8566f:	e8 ac e2 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
      d85674:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d85679:	e8 76 e3 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8567e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      d85685:	00 
      d85686:	e9 e7 00 00 00       	jmp    d85772 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x527f8>
      d8568b:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
      d8568f:	31 f6                	xor    esi,esi
      d85691:	e8 ca 32 e0 ff       	call   b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
      d85696:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8569d:	00 00 
      d8569f:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
      d856a6:	00 
      d856a7:	0f 85 d3 01 00 00    	jne    d85880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52906>
      d856ad:	0f 57 c0             	xorps  xmm0,xmm0

### 0xd856f5; FDE=(14177572, 14178437): call   d8a488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5750e>
      d8568f:	31 f6                	xor    esi,esi
      d85691:	e8 ca 32 e0 ff       	call   b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
      d85696:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8569d:	00 00 
      d8569f:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
      d856a6:	00 
      d856a7:	0f 85 d3 01 00 00    	jne    d85880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52906>
      d856ad:	0f 57 c0             	xorps  xmm0,xmm0
      d856b0:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      d856b3:	e9 08 01 00 00       	jmp    d857c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52846>
      d856b8:	4d 8b b4 24 58 02 00 	mov    r14,QWORD PTR [r12+0x258]
      d856bf:	00 
      d856c0:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
      d856c7:	00 
      d856c8:	4c 89 fe             	mov    rsi,r15
      d856cb:	e8 00 ca ed ff       	call   c620d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1af070>
      d856d0:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
      d856d5:	31 c0                	xor    eax,eax
      d856d7:	88 84 24 f0 00 00 00 	mov    BYTE PTR [rsp+0xf0],al
      d856de:	88 84 24 00 01 00 00 	mov    BYTE PTR [rsp+0x100],al
      d856e5:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      d856ec:	00 
      d856ed:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
      d856f4:	00 
      d856f5:	e8 8e 4d 00 00       	call   d8a488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5750e>
      d856fa:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      d85701:	00 
      d85702:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
      d85709:	00 
      d8570a:	e8 05 4e 00 00       	call   d8a514 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5759a>
      d8570f:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d85712:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      d85716:	8a 8c 24 00 01 00 00 	mov    cl,BYTE PTR [rsp+0x100]
      d8571d:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl
      d85721:	0f 10 84 24 f0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xf0]
      d85728:	00 
      d85729:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
      d8572d:	48 8d 94 24 08 01 00 	lea    rdx,[rsp+0x108]
      d85734:	00 
      d85735:	6a 01                	push   0x1
      d85737:	59                   	pop    rcx
      d85738:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
      d8573f:	00 
      d85740:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
      d85747:	00 
      d85748:	48 89 df             	mov    rdi,rbx
      d8574b:	4c 89 f6             	mov    rsi,r14
      d8574e:	ff d0                	call   rax
      d85750:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      d85757:	00 
      d85758:	e8 c3 e1 e0 ff       	call   b93920 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe08c0>
      d8575d:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      d85764:	00 
      d85765:	e8 8a e2 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8576a:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
      d85771:	00 
      d85772:	e8 39 ce ed ff       	call   c625b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1af550>
      d85777:	eb 16                	jmp    d8578f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52815>
      d85779:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
      d8577d:	31 f6                	xor    esi,esi
      d8577f:	e8 dc 31 e0 ff       	call   b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>

## References/callers to 0xd8a598
### 0xd8a4d8; FDE=(14197896, 14198036): lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a488:	41 57                	push   r15
      d8a48a:	41 56                	push   r14
      d8a48c:	53                   	push   rbx
      d8a48d:	48 89 fb             	mov    rbx,rdi
      d8a490:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a494:	49 89 f7             	mov    r15,rsi
      d8a497:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a49c:	6a 60                	push   0x60
      d8a49e:	5f                   	pop    rdi
      d8a49f:	e8 5c 3a a6 00       	call   17edf00 <_Znwm@plt>
      d8a4a4:	49 89 c6             	mov    r14,rax
      d8a4a7:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d8a4aa:	49 89 06             	mov    QWORD PTR [r14],rax
      d8a4ad:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      d8a4b1:	49 8d 77 08          	lea    rsi,[r15+0x8]
      d8a4b5:	e8 86 3a a6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d8a4ba:	41 8a 47 20          	mov    al,BYTE PTR [r15+0x20]
      d8a4be:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
      d8a4c2:	4c 89 f7             	mov    rdi,r14
      d8a4c5:	48 83 c7 30          	add    rdi,0x30
      d8a4c9:	49 83 c7 30          	add    r15,0x30
      d8a4cd:	4c 89 fe             	mov    rsi,r15
      d8a4d0:	e8 e3 dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a4d5:	4c 89 33             	mov    QWORD PTR [rbx],r14
      d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a4e3:	48 8d 05 d8 00 00 00 	lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a4ee:	5b                   	pop    rbx
      d8a4ef:	41 5e                	pop    r14
      d8a4f1:	41 5f                	pop    r15
      d8a4f3:	c3                   	ret
      d8a4f4:	49 89 c7             	mov    r15,rax
      d8a4f7:	4c 89 f7             	mov    rdi,r14
      d8a4fa:	e8 21 3a a6 00       	call   17edf20 <_ZdlPv@plt>
      d8a4ff:	eb 03                	jmp    d8a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5758a>
      d8a501:	49 89 c7             	mov    r15,rax
      d8a504:	48 89 df             	mov    rdi,rbx
      d8a507:	e8 e8 94 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8a50c:	4c 89 ff             	mov    rdi,r15
      d8a50f:	e8 bc 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d8a514:	41 57                	push   r15
      d8a516:	41 56                	push   r14
      d8a518:	53                   	push   rbx
      d8a519:	48 89 fb             	mov    rbx,rdi
      d8a51c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a520:	49 89 f6             	mov    r14,rsi
      d8a523:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a528:	6a 30                	push   0x30
      d8a52a:	5f                   	pop    rdi
      d8a52b:	e8 d0 39 a6 00       	call   17edf00 <_Znwm@plt>
      d8a530:	49 89 c7             	mov    r15,rax
      d8a533:	48 89 c7             	mov    rdi,rax
      d8a536:	4c 89 f6             	mov    rsi,r14
      d8a539:	e8 7a dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a53e:	4c 89 3b             	mov    QWORD PTR [rbx],r15
      d8a541:	48 8d 05 92 94 d3 ff 	lea    rax,[rip+0xffffffffffd39492]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
      d8a548:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a54c:	48 8d 05 37 00 00 00 	lea    rax,[rip+0x37]        # d8a58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57610>
      d8a553:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a557:	5b                   	pop    rbx

## References/callers to 0xd8a5c2
### 0xd8a4e3; FDE=(14197896, 14198036): lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a48c:	53                   	push   rbx
      d8a48d:	48 89 fb             	mov    rbx,rdi
      d8a490:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a494:	49 89 f7             	mov    r15,rsi
      d8a497:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a49c:	6a 60                	push   0x60
      d8a49e:	5f                   	pop    rdi
      d8a49f:	e8 5c 3a a6 00       	call   17edf00 <_Znwm@plt>
      d8a4a4:	49 89 c6             	mov    r14,rax
      d8a4a7:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d8a4aa:	49 89 06             	mov    QWORD PTR [r14],rax
      d8a4ad:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      d8a4b1:	49 8d 77 08          	lea    rsi,[r15+0x8]
      d8a4b5:	e8 86 3a a6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d8a4ba:	41 8a 47 20          	mov    al,BYTE PTR [r15+0x20]
      d8a4be:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
      d8a4c2:	4c 89 f7             	mov    rdi,r14
      d8a4c5:	48 83 c7 30          	add    rdi,0x30
      d8a4c9:	49 83 c7 30          	add    r15,0x30
      d8a4cd:	4c 89 fe             	mov    rsi,r15
      d8a4d0:	e8 e3 dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a4d5:	4c 89 33             	mov    QWORD PTR [rbx],r14
      d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a4e3:	48 8d 05 d8 00 00 00 	lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a4ee:	5b                   	pop    rbx
      d8a4ef:	41 5e                	pop    r14
      d8a4f1:	41 5f                	pop    r15
      d8a4f3:	c3                   	ret
      d8a4f4:	49 89 c7             	mov    r15,rax
      d8a4f7:	4c 89 f7             	mov    rdi,r14
      d8a4fa:	e8 21 3a a6 00       	call   17edf20 <_ZdlPv@plt>
      d8a4ff:	eb 03                	jmp    d8a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5758a>
      d8a501:	49 89 c7             	mov    r15,rax
      d8a504:	48 89 df             	mov    rdi,rbx
      d8a507:	e8 e8 94 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8a50c:	4c 89 ff             	mov    rdi,r15
      d8a50f:	e8 bc 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d8a514:	41 57                	push   r15
      d8a516:	41 56                	push   r14
      d8a518:	53                   	push   rbx
      d8a519:	48 89 fb             	mov    rbx,rdi
      d8a51c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a520:	49 89 f6             	mov    r14,rsi
      d8a523:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a528:	6a 30                	push   0x30
      d8a52a:	5f                   	pop    rdi
      d8a52b:	e8 d0 39 a6 00       	call   17edf00 <_Znwm@plt>
      d8a530:	49 89 c7             	mov    r15,rax
      d8a533:	48 89 c7             	mov    rdi,rax
      d8a536:	4c 89 f6             	mov    rsi,r14
      d8a539:	e8 7a dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a53e:	4c 89 3b             	mov    QWORD PTR [rbx],r15
      d8a541:	48 8d 05 92 94 d3 ff 	lea    rax,[rip+0xffffffffffd39492]        # ac39da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1097a>
      d8a548:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a54c:	48 8d 05 37 00 00 00 	lea    rax,[rip+0x37]        # d8a58a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57610>
      d8a553:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a557:	5b                   	pop    rbx
      d8a558:	41 5e                	pop    r14
      d8a55a:	41 5f                	pop    r15

## r15 provenance in clone constructor
### 0xd8a494: mov    r15,rsi
      d8a488:	41 57                	push   r15
      d8a48a:	41 56                	push   r14
      d8a48c:	53                   	push   rbx
      d8a48d:	48 89 fb             	mov    rbx,rdi
      d8a490:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      d8a494:	49 89 f7             	mov    r15,rsi
      d8a497:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      d8a49c:	6a 60                	push   0x60
      d8a49e:	5f                   	pop    rdi
      d8a49f:	e8 5c 3a a6 00       	call   17edf00 <_Znwm@plt>
      d8a4a4:	49 89 c6             	mov    r14,rax
      d8a4a7:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d8a4aa:	49 89 06             	mov    QWORD PTR [r14],rax
      d8a4ad:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      d8a4b1:	49 8d 77 08          	lea    rsi,[r15+0x8]
      d8a4b5:	e8 86 3a a6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      d8a4ba:	41 8a 47 20          	mov    al,BYTE PTR [r15+0x20]
      d8a4be:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
      d8a4c2:	4c 89 f7             	mov    rdi,r14
      d8a4c5:	48 83 c7 30          	add    rdi,0x30
      d8a4c9:	49 83 c7 30          	add    r15,0x30
      d8a4cd:	4c 89 fe             	mov    rsi,r15
      d8a4d0:	e8 e3 dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a4d5:	4c 89 33             	mov    QWORD PTR [rbx],r14
      d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>

### 0xd8a4f1: pop    r15
      d8a4c2:	4c 89 f7             	mov    rdi,r14
      d8a4c5:	48 83 c7 30          	add    rdi,0x30
      d8a4c9:	49 83 c7 30          	add    r15,0x30
      d8a4cd:	4c 89 fe             	mov    rsi,r15
      d8a4d0:	e8 e3 dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a4d5:	4c 89 33             	mov    QWORD PTR [rbx],r14
      d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a4e3:	48 8d 05 d8 00 00 00 	lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a4ee:	5b                   	pop    rbx
      d8a4ef:	41 5e                	pop    r14
      d8a4f1:	41 5f                	pop    r15
      d8a4f3:	c3                   	ret
      d8a4f4:	49 89 c7             	mov    r15,rax
      d8a4f7:	4c 89 f7             	mov    rdi,r14
      d8a4fa:	e8 21 3a a6 00       	call   17edf20 <_ZdlPv@plt>
      d8a4ff:	eb 03                	jmp    d8a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5758a>
      d8a501:	49 89 c7             	mov    r15,rax
      d8a504:	48 89 df             	mov    rdi,rbx
      d8a507:	e8 e8 94 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8a50c:	4c 89 ff             	mov    rdi,r15
      d8a50f:	e8 bc 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

### 0xd8a4f4: mov    r15,rax
      d8a4c9:	49 83 c7 30          	add    r15,0x30
      d8a4cd:	4c 89 fe             	mov    rsi,r15
      d8a4d0:	e8 e3 dd df ff       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      d8a4d5:	4c 89 33             	mov    QWORD PTR [rbx],r14
      d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a4e3:	48 8d 05 d8 00 00 00 	lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a4ee:	5b                   	pop    rbx
      d8a4ef:	41 5e                	pop    r14
      d8a4f1:	41 5f                	pop    r15
      d8a4f3:	c3                   	ret
      d8a4f4:	49 89 c7             	mov    r15,rax
      d8a4f7:	4c 89 f7             	mov    rdi,r14
      d8a4fa:	e8 21 3a a6 00       	call   17edf20 <_ZdlPv@plt>
      d8a4ff:	eb 03                	jmp    d8a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5758a>
      d8a501:	49 89 c7             	mov    r15,rax
      d8a504:	48 89 df             	mov    rdi,rbx
      d8a507:	e8 e8 94 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8a50c:	4c 89 ff             	mov    rdi,r15
      d8a50f:	e8 bc 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

### 0xd8a501: mov    r15,rax
      d8a4d8:	48 8d 05 b9 00 00 00 	lea    rax,[rip+0xb9]        # d8a598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5761e>
      d8a4df:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d8a4e3:	48 8d 05 d8 00 00 00 	lea    rax,[rip+0xd8]        # d8a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57648>
      d8a4ea:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      d8a4ee:	5b                   	pop    rbx
      d8a4ef:	41 5e                	pop    r14
      d8a4f1:	41 5f                	pop    r15
      d8a4f3:	c3                   	ret
      d8a4f4:	49 89 c7             	mov    r15,rax
      d8a4f7:	4c 89 f7             	mov    rdi,r14
      d8a4fa:	e8 21 3a a6 00       	call   17edf20 <_ZdlPv@plt>
      d8a4ff:	eb 03                	jmp    d8a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5758a>
      d8a501:	49 89 c7             	mov    r15,rax
      d8a504:	48 89 df             	mov    rdi,rbx
      d8a507:	e8 e8 94 e0 ff       	call   b939f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0994>
      d8a50c:	4c 89 ff             	mov    rdi,r15
      d8a50f:	e8 bc 57 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

## Exact source-layout builders outside d8a488
### candidate 0xaae80e; FDE=(11200480, 11200756)
      aae7e0:	41 57                	push   r15
      aae7e2:	41 56                	push   r14
      aae7e4:	41 54                	push   r12
      aae7e6:	53                   	push   rbx
      aae7e7:	48 83 ec 68          	sub    rsp,0x68
      aae7eb:	49 89 cf             	mov    r15,rcx
      aae7ee:	49 89 f4             	mov    r12,rsi
      aae7f1:	48 89 fb             	mov    rbx,rdi
      aae7f4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      aae7fb:	00 00 
      aae7fd:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      aae802:	4c 8b 76 20          	mov    r14,QWORD PTR [rsi+0x20]
      aae806:	48 8b 72 18          	mov    rsi,QWORD PTR [rdx+0x18]
      aae80a:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
      aae80e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      aae813:	e8 28 f7 d3 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      aae818:	49 8b 4c 24 28       	mov    rcx,QWORD PTR [r12+0x28]
      aae81d:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
      aae821:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      aae825:	48 85 c0             	test   rax,rax
      aae828:	74 05                	je     aae82f <JNI_OnUnload@@Base+0x360fc>
      aae82a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      aae82f:	48 8d 05 0a f9 d4 00 	lea    rax,[rip+0xd4f90a]        # 17fe140 <_ZTINSt6__ndk117bad_function_callE@@Base+0x11e0>
      aae836:	4c 8d 44 24 30       	lea    r8,[rsp+0x30]
      aae83b:	49 89 00             	mov    QWORD PTR [r8],rax
      aae83e:	41 0f 11 40 08       	movups XMMWORD PTR [r8+0x8],xmm0
      aae843:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
      aae847:	49 8b 06             	mov    rax,QWORD PTR [r14]
      aae84a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      aae84f:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
      aae854:	4c 89 f6             	mov    rsi,r14
      aae857:	ff 50 30             	call   QWORD PTR [rax+0x30]
      aae85a:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      aae85f:	4c 89 f7             	mov    rdi,r14
      aae862:	e8 03 b7 fc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      aae867:	31 ff                	xor    edi,edi
      aae869:	e8 18 fc fe ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      aae86e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      aae873:	e8 18 f6 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      aae878:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      aae87d:	0f 57 c9             	xorps  xmm1,xmm1
      aae880:	0f 29 4c 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm1
      aae885:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      aae889:	48 8d 05 64 00 00 00 	lea    rax,[rip+0x64]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
      aae890:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      aae894:	48 8d 05 85 00 00 00 	lea    rax,[rip+0x85]        # aae920 <JNI_OnUnload@@Base+0x361ed>
      aae89b:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      aae89f:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      aae8a4:	48 89 df             	mov    rdi,rbx
      aae8a7:	4c 89 f6             	mov    rsi,r14
      aae8aa:	e8 df 2e b3 00       	call   15e178e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426d12>
      aae8af:	4c 89 f7             	mov    rdi,r14
      aae8b2:	e8 e7 89 ff ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      aae8b7:	31 ff                	xor    edi,edi
      aae8b9:	e8 c8 fb fe ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### candidate 0xc27305; FDE=(12743334, 12743468)
      c272d7:	e8 48 1e 9b 00       	call   15d9124 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41e6a8>
      c272dc:	89 c3                	mov    ebx,eax
      c272de:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      c272e3:	e8 a8 6b bc 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c272e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c272ef:	00 00 
      c272f1:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      c272f6:	75 2f                	jne    c27327 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1742c7>
      c272f8:	89 d8                	mov    eax,ebx
      c272fa:	48 83 c4 28          	add    rsp,0x28
      c272fe:	5b                   	pop    rbx
      c272ff:	41 5e                	pop    r14
      c27301:	c3                   	ret
      c27302:	48 89 c3             	mov    rbx,rax
      c27305:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      c2730a:	e8 81 6b bc 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c2730f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c27316:	00 00 
      c27318:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      c2731d:	75 08                	jne    c27327 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1742c7>
      c2731f:	48 89 df             	mov    rdi,rbx
      c27322:	e8 a9 89 e4 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      c27327:	e8 84 87 bc 00       	call   17efab0 <__stack_chk_fail@plt>
      c2732c:	53                   	push   rbx
      c2732d:	48 89 fb             	mov    rbx,rdi
      c27330:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      c27333:	48 89 f7             	mov    rdi,rsi
      c27336:	ff 50 10             	call   QWORD PTR [rax+0x10]
      c27339:	48 89 df             	mov    rdi,rbx
      c2733c:	48 89 c6             	mov    rsi,rax
      c2733f:	e8 fc 6b bc 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      c27344:	5b                   	pop    rbx
      c27345:	c3                   	ret
      c27346:	48 89 c7             	mov    rdi,rax
      c27349:	e8 57 27 e5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      c2734e:	55                   	push   rbp
      c2734f:	41 57                	push   r15
      c27351:	41 56                	push   r14
      c27353:	53                   	push   rbx
      c27354:	48 83 ec 38          	sub    rsp,0x38
      c27358:	48 89 d3             	mov    rbx,rdx
      c2735b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c27362:	00 00 
      c27364:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      c27369:	40 8a 2f             	mov    bpl,BYTE PTR [rdi]
      c2736c:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      c2736f:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
      c27374:	4c 89 f7             	mov    rdi,r14
      c27377:	e8 b0 ff ff ff       	call   c2732c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1742cc>
      c2737c:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
      c2737f:	49 89 e7             	mov    r15,rsp
      c27382:	4c 89 ff             	mov    rdi,r15
      c27385:	e8 a2 ff ff ff       	call   c2732c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1742cc>
      c2738a:	4c 89 f7             	mov    rdi,r14
      c2738d:	4c 89 fe             	mov    rsi,r15

### candidate 0xda9c89; FDE=(14326894, 14327057)
      da9c5d:	00 
      da9c5e:	75 08                	jne    da9c68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76cee>
      da9c60:	48 89 df             	mov    rdi,rbx
      da9c63:	e8 68 60 cc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      da9c68:	e8 43 5e a4 00       	call   17efab0 <__stack_chk_fail@plt>
      da9c6d:	cc                   	int3
      da9c6e:	41 56                	push   r14
      da9c70:	53                   	push   rbx
      da9c71:	48 83 ec 18          	sub    rsp,0x18
      da9c75:	49 89 f6             	mov    r14,rsi
      da9c78:	48 89 fb             	mov    rbx,rdi
      da9c7b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      da9c82:	00 00 
      da9c84:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      da9c89:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
      da9c8d:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
      da9c91:	c6 44 24 08 01       	mov    BYTE PTR [rsp+0x8],0x1
      da9c96:	e8 55 44 a4 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
      da9c9b:	41 8a 46 34          	mov    al,BYTE PTR [r14+0x34]
      da9c9f:	88 43 04             	mov    BYTE PTR [rbx+0x4],al
      da9ca2:	41 8b 46 30          	mov    eax,DWORD PTR [r14+0x30]
      da9ca6:	89 03                	mov    DWORD PTR [rbx],eax
      da9ca8:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      da9cac:	49 8d 76 38          	lea    rsi,[r14+0x38]
      da9cb0:	e8 8b 42 a4 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      da9cb5:	49 8b 46 5d          	mov    rax,QWORD PTR [r14+0x5d]
      da9cb9:	48 89 43 2d          	mov    QWORD PTR [rbx+0x2d],rax
      da9cbd:	41 0f 10 46 50       	movups xmm0,XMMWORD PTR [r14+0x50]
      da9cc2:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
      da9cc6:	48 89 e7             	mov    rdi,rsp
      da9cc9:	e8 62 21 d0 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
      da9cce:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      da9cd5:	00 00 
      da9cd7:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      da9cdc:	75 2e                	jne    da9d0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76d92>
      da9cde:	48 89 d8             	mov    rax,rbx
      da9ce1:	48 83 c4 18          	add    rsp,0x18
      da9ce5:	5b                   	pop    rbx
      da9ce6:	41 5e                	pop    r14
      da9ce8:	c3                   	ret
      da9ce9:	48 89 c3             	mov    rbx,rax
      da9cec:	48 89 e7             	mov    rdi,rsp
      da9cef:	e8 3c 21 d0 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
      da9cf4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      da9cfb:	00 00 
      da9cfd:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      da9d02:	75 08                	jne    da9d0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76d92>
      da9d04:	48 89 df             	mov    rdi,rbx
      da9d07:	e8 c4 5f cc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      da9d0c:	e8 9f 5d a4 00       	call   17efab0 <__stack_chk_fail@plt>
      da9d11:	cc                   	int3
      da9d12:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
      da9d19:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      da9d20:	00 00 
      da9d22:	48 89 8c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rcx

### candidate 0xe32fdc; FDE=(14888596, 14888963)
      e32fb7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e32fbe:	00 00 
      e32fc0:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      e32fc5:	75 37                	jne    e32ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x100084>
      e32fc7:	48 89 d8             	mov    rax,rbx
      e32fca:	48 83 c4 28          	add    rsp,0x28
      e32fce:	5b                   	pop    rbx
      e32fcf:	41 5c                	pop    r12
      e32fd1:	41 5d                	pop    r13
      e32fd3:	41 5e                	pop    r14
      e32fd5:	41 5f                	pop    r15
      e32fd7:	5d                   	pop    rbp
      e32fd8:	c3                   	ret
      e32fd9:	48 89 c3             	mov    rbx,rax
      e32fdc:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      e32fe1:	e8 26 0d 00 00       	call   e33d0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x100d92>
      e32fe6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e32fed:	00 00 
      e32fef:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      e32ff4:	75 08                	jne    e32ffe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x100084>
      e32ff6:	48 89 df             	mov    rdi,rbx
      e32ff9:	e8 d2 cc c3 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      e32ffe:	e8 ad ca 9b 00       	call   17efab0 <__stack_chk_fail@plt>
      e33003:	cc                   	int3
      e33004:	41 57                	push   r15
      e33006:	41 56                	push   r14
      e33008:	53                   	push   rbx
      e33009:	48 83 ec 50          	sub    rsp,0x50
      e3300d:	49 89 cf             	mov    r15,rcx
      e33010:	49 89 f6             	mov    r14,rsi
      e33013:	48 89 fb             	mov    rbx,rdi
      e33016:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e3301d:	00 00 
      e3301f:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      e33024:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      e33029:	48 89 d6             	mov    rsi,rdx
      e3302c:	e8 0f af 9b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e33031:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      e33036:	4c 89 fe             	mov    rsi,r15
      e33039:	e8 02 af 9b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      e3303e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      e33043:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
      e33048:	4c 89 f6             	mov    rsi,r14
      e3304b:	e8 3a 08 00 00       	call   e3388a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x100910>
      e33050:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      e33055:	e8 72 b7 c6 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
      e3305a:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e3305f:	48 89 03             	mov    QWORD PTR [rbx],rax
      e33062:	8a 44 24 10          	mov    al,BYTE PTR [rsp+0x10]
      e33066:	88 43 08             	mov    BYTE PTR [rbx+0x8],al
      e33069:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e33070:	00 00 
      e33072:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      e33077:	75 60                	jne    e330d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10015f>
      e33079:	48 83 c4 50          	add    rsp,0x50

### candidate 0xea2bd2; FDE=(15346574, 15346989)
      ea2b97:	48 81 ec f0 02 00 00 	sub    rsp,0x2f0
      ea2b9e:	49 89 fe             	mov    r14,rdi
      ea2ba1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ea2ba8:	00 00 
      ea2baa:	48 89 84 24 e8 02 00 	mov    QWORD PTR [rsp+0x2e8],rax
      ea2bb1:	00 
      ea2bb2:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
      ea2bb7:	48 89 df             	mov    rdi,rbx
      ea2bba:	4c 89 f6             	mov    rsi,r14
      ea2bbd:	e8 6e 87 c0 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      ea2bc2:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
      ea2bc5:	48 85 db             	test   rbx,rbx
      ea2bc8:	0f 84 24 01 00 00    	je     ea2cf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a108>
      ea2bce:	49 83 c6 10          	add    r14,0x10
      ea2bd2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ea2bd7:	4c 89 f6             	mov    rsi,r14
      ea2bda:	e8 61 b3 94 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      ea2bdf:	48 8d 35 96 f3 5a ff 	lea    rsi,[rip+0xffffffffff5af396]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      ea2be6:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      ea2bed:	00 
      ea2bee:	e8 8b 6e bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ea2bf3:	31 c0                	xor    eax,eax
      ea2bf5:	48 8d 8c 24 ec 01 00 	lea    rcx,[rsp+0x1ec]
      ea2bfc:	00 
      ea2bfd:	88 41 13             	mov    BYTE PTR [rcx+0x13],al
      ea2c00:	83 21 00             	and    DWORD PTR [rcx],0x0
      ea2c03:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      ea2c08:	41 88 06             	mov    BYTE PTR [r14],al
      ea2c0b:	41 88 46 08          	mov    BYTE PTR [r14+0x8],al
      ea2c0f:	41 88 46 10          	mov    BYTE PTR [r14+0x10],al
      ea2c13:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
      ea2c17:	0f 57 c0             	xorps  xmm0,xmm0
      ea2c1a:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0
      ea2c21:	00 
      ea2c22:	41 88 86 98 00 00 00 	mov    BYTE PTR [r14+0x98],al
      ea2c29:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
      ea2c2e:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
      ea2c33:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
      ea2c38:	41 0f 11 46 50       	movups XMMWORD PTR [r14+0x50],xmm0
      ea2c3d:	41 0f 11 46 60       	movups XMMWORD PTR [r14+0x60],xmm0
      ea2c42:	41 0f 11 46 70       	movups XMMWORD PTR [r14+0x70],xmm0
      ea2c47:	66 41 83 a6 80 00 00 	and    WORD PTR [r14+0x80],0x0
      ea2c4e:	00 00 
      ea2c50:	4c 8d bc 24 00 02 00 	lea    r15,[rsp+0x200]
      ea2c57:	00 
      ea2c58:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
      ea2c5d:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
      ea2c64:	00 
      ea2c65:	4c 89 ff             	mov    rdi,r15
      ea2c68:	4c 89 e6             	mov    rsi,r12
      ea2c6b:	4c 89 ea             	mov    rdx,r13
      ea2c6e:	4d 89 f0             	mov    r8,r14
      ea2c71:	e8 5c 4e 7c 00       	call   1667ad2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc3e>
      ea2c76:	4c 89 f7             	mov    rdi,r14
      ea2c79:	e8 5a 93 7c 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>

### candidate 0xedeb84; FDE=(15591940, 15592710)
      edeb4b:	31 c0                	xor    eax,eax
      edeb4d:	41 80 be 98 00 00 00 	cmp    BYTE PTR [r14+0x98],0x0
      edeb54:	00 
      edeb55:	0f 94 c0             	sete   al
      edeb58:	40 8a ac 04 a8 00 00 	mov    bpl,BYTE PTR [rsp+rax*1+0xa8]
      edeb5f:	00 
      edeb60:	80 7c 24 60 00       	cmp    BYTE PTR [rsp+0x60],0x0
      edeb65:	0f 84 8a 00 00 00    	je     edebf5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa600b>
      edeb6b:	40 84 ed             	test   bpl,bpl
      edeb6e:	74 73                	je     edebe3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa5ff9>
      edeb70:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      edeb75:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
      edeb7c:	00 
      edeb7d:	41 ff 96 f8 00 00 00 	call   QWORD PTR [r14+0xf8]
      edeb84:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      edeb89:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
      edeb8e:	e8 ad f3 90 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      edeb93:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      edeb98:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      edeb9d:	4c 89 ff             	mov    rdi,r15
      edeba0:	e8 cd a8 ff ff       	call   ed9472 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa0888>
      edeba5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      edebaa:	e8 e1 f2 90 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      edebaf:	c7 03 02 00 00 00    	mov    DWORD PTR [rbx],0x2
      edebb5:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      edebba:	0f 10 47 f0          	movups xmm0,XMMWORD PTR [rdi-0x10]
      edebbe:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
      edebc2:	0f 10 07             	movups xmm0,XMMWORD PTR [rdi]
      edebc5:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
      edebc9:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      edebcd:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      edebd1:	0f 57 c0             	xorps  xmm0,xmm0
      edebd4:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      edebd7:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      edebdc:	e8 47 cb b9 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      edebe1:	eb 47                	jmp    edec2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa6040>
      edebe3:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
      edebe7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      edebea:	ff 50 10             	call   QWORD PTR [rax+0x10]
      edebed:	85 c0                	test   eax,eax
      edebef:	0f 84 7b ff ff ff    	je     edeb70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa5f86>
      edebf5:	40 84 ed             	test   bpl,bpl
      edebf8:	75 1a                	jne    edec14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa602a>
      edebfa:	80 7c 24 68 04       	cmp    BYTE PTR [rsp+0x68],0x4
      edebff:	74 13                	je     edec14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa602a>
      edec01:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
      edec05:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      edec08:	ff 50 10             	call   QWORD PTR [rax+0x10]
      edec0b:	85 c0                	test   eax,eax
      edec0d:	74 05                	je     edec14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa602a>
      edec0f:	83 23 00             	and    DWORD PTR [rbx],0x0
      edec12:	eb 06                	jmp    edec1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa6030>
      edec14:	c7 03 01 00 00 00    	mov    DWORD PTR [rbx],0x1
      edec1a:	0f 57 c0             	xorps  xmm0,xmm0
      edec1d:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0

### candidate 0xedf158; FDE=(15593348, 15594283)
      edf11a:	41 80 be 98 00 00 00 	cmp    BYTE PTR [r14+0x98],0x0
      edf121:	00 
      edf122:	0f 94 c0             	sete   al
      edf125:	40 8a ac 04 d8 00 00 	mov    bpl,BYTE PTR [rsp+rax*1+0xd8]
      edf12c:	00 
      edf12d:	80 bc 24 90 00 00 00 	cmp    BYTE PTR [rsp+0x90],0x0
      edf134:	00 
      edf135:	0f 84 c8 00 00 00    	je     edf203 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa6619>
      edf13b:	40 84 ed             	test   bpl,bpl
      edf13e:	0f 84 ad 00 00 00    	je     edf1f1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa6607>
      edf144:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      edf149:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
      edf150:	00 
      edf151:	41 ff 96 f8 00 00 00 	call   QWORD PTR [r14+0xf8]
      edf158:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      edf15d:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
      edf162:	e8 d9 ed 90 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      edf167:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      edf16c:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
      edf171:	4c 89 ff             	mov    rdi,r15
      edf174:	e8 e7 8c ff ff       	call   ed7e60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f276>
      edf179:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      edf17e:	e8 0d ed 90 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      edf183:	c7 03 02 00 00 00    	mov    DWORD PTR [rbx],0x2
      edf189:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      edf18e:	f2 0f 10 47 f8       	movsd  xmm0,QWORD PTR [rdi-0x8]
      edf193:	f2 0f 11 43 08       	movsd  QWORD PTR [rbx+0x8],xmm0
      edf198:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      edf19c:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      edf1a0:	0f 10 07             	movups xmm0,XMMWORD PTR [rdi]
      edf1a3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
      edf1a7:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      edf1ac:	0f 57 c0             	xorps  xmm0,xmm0
      edf1af:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      edf1b2:	8b 47 18             	mov    eax,DWORD PTR [rdi+0x18]
      edf1b5:	89 43 28             	mov    DWORD PTR [rbx+0x28],eax
      edf1b8:	48 8b 47 30          	mov    rax,QWORD PTR [rdi+0x30]
      edf1bc:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      edf1c0:	0f 10 4f 20          	movups xmm1,XMMWORD PTR [rdi+0x20]
      edf1c4:	0f 11 4b 30          	movups XMMWORD PTR [rbx+0x30],xmm1
      edf1c8:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
      edf1cc:	48 83 67 30 00       	and    QWORD PTR [rdi+0x30],0x0
      edf1d1:	48 8b 47 48          	mov    rax,QWORD PTR [rdi+0x48]
      edf1d5:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
      edf1d9:	0f 10 4f 38          	movups xmm1,XMMWORD PTR [rdi+0x38]
      edf1dd:	0f 11 4b 48          	movups XMMWORD PTR [rbx+0x48],xmm1
      edf1e1:	0f 11 47 38          	movups XMMWORD PTR [rdi+0x38],xmm0
      edf1e5:	48 83 67 48 00       	and    QWORD PTR [rdi+0x48],0x0
      edf1ea:	e8 ad f6 d2 ff       	call   c0e89c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15b83c>
      edf1ef:	eb 56                	jmp    edf247 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa665d>
      edf1f1:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
      edf1f5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      edf1f8:	ff 50 10             	call   QWORD PTR [rax+0x10]
      edf1fb:	85 c0                	test   eax,eax
      edf1fd:	0f 84 41 ff ff ff    	je     edf144 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa655a>

### candidate 0xf79195; FDE=(16224312, 16225304)
      f79165:	00 
      f79166:	e8 67 3c fc ff       	call   f3cdd2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1041e8>
      f7916b:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
      f7916f:	49 8b 36             	mov    rsi,QWORD PTR [r14]
      f79172:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f79175:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      f7917c:	00 
      f7917d:	ff 10                	call   QWORD PTR [rax]
      f7917f:	49 8b 07             	mov    rax,QWORD PTR [r15]
      f79182:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      f79187:	48 8d 94 24 d0 01 00 	lea    rdx,[rsp+0x1d0]
      f7918e:	00 
      f7918f:	4c 89 fe             	mov    rsi,r15
      f79192:	ff 50 10             	call   QWORD PTR [rax+0x10]
      f79195:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      f7919a:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      f7919f:	e8 9c 4d 87 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f791a4:	48 83 7c 24 20 00    	cmp    QWORD PTR [rsp+0x20],0x0
      f791aa:	74 60                	je     f7920c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140622>
      f791ac:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      f791b1:	e8 98 e6 ff ff       	call   f7784e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ec64>
      f791b6:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      f791bb:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      f791c0:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
      f791c5:	48 85 c9             	test   rcx,rcx
      f791c8:	74 05                	je     f791cf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1405e5>
      f791ca:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f791cf:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      f791d3:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f791d7:	e8 aa 52 b2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f791dc:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      f791e1:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
      f791e6:	4d 85 f6             	test   r14,r14
      f791e9:	74 2c                	je     f79217 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14062d>
      f791eb:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f791f0:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
      f791f5:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
      f791fc:	00 
      f791fd:	4c 89 b4 24 10 01 00 	mov    QWORD PTR [rsp+0x110],r14
      f79204:	00 
      f79205:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f7920a:	eb 21                	jmp    f7922d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140643>
      f7920c:	0f 57 c0             	xorps  xmm0,xmm0
      f7920f:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      f79212:	e9 1d 01 00 00       	jmp    f79334 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14074a>
      f79217:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
      f7921c:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
      f79223:	00 
      f79224:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
      f7922b:	00 00 
      f7922d:	4c 8d a4 24 18 01 00 	lea    r12,[rsp+0x118]
      f79234:	00 
      f79235:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      f7923a:	4c 89 e7             	mov    rdi,r12
      f7923d:	e8 fe 4c 87 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>

### candidate 0xf8ef3e; FDE=(16314068, 16316836)
      f8ef08:	48 89 df             	mov    rdi,rbx
      f8ef0b:	48 89 74 24 38       	mov    QWORD PTR [rsp+0x38],rsi
      f8ef10:	e8 1b c4 b1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      f8ef15:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      f8ef18:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      f8ef1d:	48 85 c0             	test   rax,rax
      f8ef20:	0f 84 e4 09 00 00    	je     f8f90a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x156d20>
      f8ef26:	45 84 e4             	test   r12b,r12b
      f8ef29:	74 28                	je     f8ef53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x156369>
      f8ef2b:	0f 57 c0             	xorps  xmm0,xmm0
      f8ef2e:	48 8d 9c 24 80 01 00 	lea    rbx,[rsp+0x180]
      f8ef35:	00 
      f8ef36:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
      f8ef39:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      f8ef3e:	48 8d 78 08          	lea    rdi,[rax+0x8]
      f8ef42:	48 89 de             	mov    rsi,rbx
      f8ef45:	e8 d2 a8 b2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      f8ef4a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      f8ef4e:	e8 33 f5 b0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f8ef53:	4c 8d 7d 30          	lea    r15,[rbp+0x30]
      f8ef57:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
      f8ef5e:	00 
      f8ef5f:	4c 89 ee             	mov    rsi,r13
      f8ef62:	4c 89 fa             	mov    rdx,r15
      f8ef65:	e8 76 0b 00 00       	call   f8fae0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x156ef6>
      f8ef6a:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      f8ef71:	00 
      f8ef72:	4c 89 ee             	mov    rsi,r13
      f8ef75:	4c 89 fa             	mov    rdx,r15
      f8ef78:	e8 a5 0c 00 00       	call   f8fc22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x157038>
      f8ef7d:	80 7d 48 00          	cmp    BYTE PTR [rbp+0x48],0x0
      f8ef81:	44 89 64 24 0c       	mov    DWORD PTR [rsp+0xc],r12d
      f8ef86:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
      f8ef8b:	0f 84 92 00 00 00    	je     f8f023 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x156439>
      f8ef91:	48 8b 5d 20          	mov    rbx,QWORD PTR [rbp+0x20]
      f8ef95:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      f8ef9c:	00 
      f8ef9d:	4c 89 ee             	mov    rsi,r13
      f8efa0:	e8 97 00 bb ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
      f8efa5:	48 8d bc 24 a8 01 00 	lea    rdi,[rsp+0x1a8]
      f8efac:	00 
      f8efad:	4c 89 fe             	mov    rsi,r15
      f8efb0:	e8 8b ef 85 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f8efb5:	48 83 c3 10          	add    rbx,0x10
      f8efb9:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      f8efbe:	48 89 de             	mov    rsi,rbx
      f8efc1:	e8 94 ce cf ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      f8efc6:	0f 57 c0             	xorps  xmm0,xmm0
      f8efc9:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
      f8efce:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      f8efd1:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      f8efd6:	48 8d 9c 24 d0 00 00 	lea    rbx,[rsp+0xd0]
      f8efdd:	00 
      f8efde:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
      f8efe3:	48 89 df             	mov    rdi,rbx

### candidate 0xf91daf; FDE=(16325968, 16327065)
      f91d7a:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      f91d7e:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
      f91d83:	48 89 df             	mov    rdi,rbx
      f91d86:	4c 89 f6             	mov    rsi,r14
      f91d89:	e8 a2 95 b1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      f91d8e:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
      f91d91:	48 85 db             	test   rbx,rbx
      f91d94:	0f 84 bd 03 00 00    	je     f92157 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15956d>
      f91d9a:	40 84 ed             	test   bpl,bpl
      f91d9d:	74 25                	je     f91dc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1591da>
      f91d9f:	0f 57 c0             	xorps  xmm0,xmm0
      f91da2:	4c 8d ac 24 40 01 00 	lea    r13,[rsp+0x140]
      f91da9:	00 
      f91daa:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      f91daf:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      f91db3:	4c 89 ee             	mov    rsi,r13
      f91db6:	e8 61 7a b2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      f91dbb:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      f91dbf:	e8 c2 c6 b0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f91dc4:	4d 8d 6f 30          	lea    r13,[r15+0x30]
      f91dc8:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      f91dcf:	00 
      f91dd0:	4c 89 e6             	mov    rsi,r12
      f91dd3:	4c 89 ea             	mov    rdx,r13
      f91dd6:	e8 bf 03 00 00       	call   f9219a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1595b0>
      f91ddb:	ba c0 00 00 00       	mov    edx,0xc0
      f91de0:	49 03 57 20          	add    rdx,QWORD PTR [r15+0x20]
      f91de4:	48 8d bc 24 af 01 00 	lea    rdi,[rsp+0x1af]
      f91deb:	00 
      f91dec:	4c 89 e6             	mov    rsi,r12
      f91def:	e8 ec dc ff ff       	call   f8fae0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x156ef6>
      f91df4:	80 bc 24 d8 00 00 00 	cmp    BYTE PTR [rsp+0xd8],0x0
      f91dfb:	00 
      f91dfc:	4d 8b 67 20          	mov    r12,QWORD PTR [r15+0x20]
      f91e00:	0f 84 fe 01 00 00    	je     f92004 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15941a>
      f91e06:	80 bc 24 bf 01 00 00 	cmp    BYTE PTR [rsp+0x1bf],0x0
      f91e0d:	00 
      f91e0e:	0f 84 f0 01 00 00    	je     f92004 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15941a>
      f91e14:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      f91e1b:	00 
      f91e1c:	4c 89 ee             	mov    rsi,r13
      f91e1f:	e8 1c c1 85 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f91e24:	41 0f 10 47 48       	movups xmm0,XMMWORD PTR [r15+0x48]
      f91e29:	0f 11 84 24 58 01 00 	movups XMMWORD PTR [rsp+0x158],xmm0
      f91e30:	00 
      f91e31:	0f 10 84 24 af 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1af]
      f91e38:	00 
      f91e39:	0f 11 84 24 68 01 00 	movups XMMWORD PTR [rsp+0x168],xmm0
      f91e40:	00 
      f91e41:	8a 84 24 bf 01 00 00 	mov    al,BYTE PTR [rsp+0x1bf]
      f91e48:	88 84 24 78 01 00 00 	mov    BYTE PTR [rsp+0x178],al
      f91e4f:	0f 28 84 24 c0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xc0]
      f91e56:	00 
      f91e57:	0f 11 84 24 80 01 00 	movups XMMWORD PTR [rsp+0x180],xmm0
      f91e5e:	00 

### candidate 0xfbc9bd; FDE=(16501082, 16501658)
      fbc985:	e8 b6 17 83 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
      fbc98a:	48 85 c0             	test   rax,rax
      fbc98d:	74 3d                	je     fbc9cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183de2>
      fbc98f:	48 89 c3             	mov    rbx,rax
      fbc992:	4d 8b 77 10          	mov    r14,QWORD PTR [r15+0x10]
      fbc996:	4d 85 f6             	test   r14,r14
      fbc999:	0f 84 af 01 00 00    	je     fbcb4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183f64>
      fbc99f:	41 83 3c 24 00       	cmp    DWORD PTR [r12],0x0
      fbc9a4:	75 2d                	jne    fbc9d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183de9>
      fbc9a6:	49 8b 74 24 08       	mov    rsi,QWORD PTR [r12+0x8]
      fbc9ab:	48 85 f6             	test   rsi,rsi
      fbc9ae:	74 23                	je     fbc9d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183de9>
      fbc9b0:	8a 86 02 01 00 00    	mov    al,BYTE PTR [rsi+0x102]
      fbc9b6:	48 81 c6 e8 00 00 00 	add    rsi,0xe8
      fbc9bd:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      fbc9c2:	88 47 f8             	mov    BYTE PTR [rdi-0x8],al
      fbc9c5:	e8 76 15 83 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      fbc9ca:	eb 5e                	jmp    fbca2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183e40>
      fbc9cc:	31 db                	xor    ebx,ebx
      fbc9ce:	e9 7b 01 00 00       	jmp    fbcb4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183f64>
      fbc9d3:	41 f6 47 20 01       	test   BYTE PTR [r15+0x20],0x1
      fbc9d8:	74 06                	je     fbc9e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183df6>
      fbc9da:	4d 8b 7f 30          	mov    r15,QWORD PTR [r15+0x30]
      fbc9de:	eb 04                	jmp    fbc9e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183dfa>
      fbc9e0:	49 83 c7 21          	add    r15,0x21
      fbc9e4:	48 8d 35 91 55 49 ff 	lea    rsi,[rip+0xffffffffff495591]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      fbc9eb:	48 8d 0d 58 72 3b ff 	lea    rcx,[rip+0xffffffffff3b7258]        # 373c4a <_ZTSSt12bad_any_cast@@Base-0x1c57e>
      fbc9f2:	6a 02                	push   0x2
      fbc9f4:	5f                   	pop    rdi
      fbc9f5:	6a 49                	push   0x49
      fbc9f7:	5a                   	pop    rdx
      fbc9f8:	4d 89 f8             	mov    r8,r15
      fbc9fb:	31 c0                	xor    eax,eax
      fbc9fd:	e8 d0 9e 81 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      fbca02:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      fbca07:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      fbca0c:	0f 57 c0             	xorps  xmm0,xmm0
      fbca0f:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
      fbca12:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      fbca17:	c6 47 f8 00          	mov    BYTE PTR [rdi-0x8],0x0
      fbca1b:	e8 20 15 83 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      fbca20:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      fbca25:	e8 66 14 83 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fbca2a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      fbca2d:	48 85 ff             	test   rdi,rdi
      fbca30:	74 7e                	je     fbcab0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183ec6>
      fbca32:	48 83 ff fc          	cmp    rdi,0xfffffffffffffffc
      fbca36:	0f 87 be 00 00 00    	ja     fbcafa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183f10>
      fbca3c:	40 0f b6 d5          	movzx  edx,bpl
      fbca40:	48 89 e6             	mov    rsi,rsp
      fbca43:	ff 17                	call   QWORD PTR [rdi]
      fbca45:	40 84 ed             	test   bpl,bpl
      fbca48:	0f 84 f6 00 00 00    	je     fbcb44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183f5a>
      fbca4e:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
      fbca51:	49 8d 47 ff          	lea    rax,[r15-0x1]

### candidate 0xfbcbf6; FDE=(16501658, 16502653)
      fbcbc3:	00 
      fbcbc4:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      fbcbc8:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
      fbcbcd:	48 89 df             	mov    rdi,rbx
      fbcbd0:	4c 89 f6             	mov    rsi,r14
      fbcbd3:	e8 58 e7 ae ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      fbcbd8:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
      fbcbdb:	48 85 db             	test   rbx,rbx
      fbcbde:	0f 84 26 03 00 00    	je     fbcf0a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184320>
      fbcbe4:	40 84 ed             	test   bpl,bpl
      fbcbe7:	74 22                	je     fbcc0b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184021>
      fbcbe9:	0f 57 c0             	xorps  xmm0,xmm0
      fbcbec:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
      fbcbf1:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      fbcbf6:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      fbcbfa:	4c 89 ee             	mov    rsi,r13
      fbcbfd:	e8 1a cc af ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fbcc02:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      fbcc06:	e8 7b 18 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fbcc0b:	41 80 3c 24 00       	cmp    BYTE PTR [r12],0x0
      fbcc10:	74 2b                	je     fbcc3d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184053>
      fbcc12:	4d 8b 6f 38          	mov    r13,QWORD PTR [r15+0x38]
      fbcc16:	49 8b 74 24 10       	mov    rsi,QWORD PTR [r12+0x10]
      fbcc1b:	41 8b 7c 24 08       	mov    edi,DWORD PTR [r12+0x8]
      fbcc20:	e8 fb eb ab ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
      fbcc25:	84 c0                	test   al,al
      fbcc27:	74 21                	je     fbcc4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184060>
      fbcc29:	41 f6 47 20 01       	test   BYTE PTR [r15+0x20],0x1
      fbcc2e:	0f 84 99 00 00 00    	je     fbcccd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1840e3>
      fbcc34:	4d 8b 7f 30          	mov    r15,QWORD PTR [r15+0x30]
      fbcc38:	e9 94 00 00 00       	jmp    fbccd1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1840e7>
      fbcc3d:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
      fbcc42:	c6 06 00             	mov    BYTE PTR [rsi],0x0
      fbcc45:	e9 ad 00 00 00       	jmp    fbccf7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18410d>
      fbcc4a:	49 83 c4 08          	add    r12,0x8
      fbcc4e:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
      fbcc52:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fbcc55:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      fbcc5a:	4c 89 e2             	mov    rdx,r12
      fbcc5d:	ff 50 10             	call   QWORD PTR [rax+0x10]
      fbcc60:	49 83 c7 20          	add    r15,0x20
      fbcc64:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      fbcc69:	4c 89 fe             	mov    rsi,r15
      fbcc6c:	e8 cf 12 83 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      fbcc71:	48 83 7c 24 50 00    	cmp    QWORD PTR [rsp+0x50],0x0
      fbcc77:	0f 84 89 00 00 00    	je     fbcd06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18411c>
      fbcc7d:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      fbcc84:	00 
      fbcc85:	e8 2c 0a f7 ff       	call   f2d6b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf4acc>
      fbcc8a:	4c 8b a4 24 90 00 00 	mov    r12,QWORD PTR [rsp+0x90]
      fbcc91:	00 
      fbcc92:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]
      fbcc97:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
      fbcc9c:	e8 95 1e b2 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      fbcca1:	4c 8b bc 24 98 00 00 	mov    r15,QWORD PTR [rsp+0x98]

### candidate 0xfcf4aa; FDE=(16577606, 16579901)
      fcf474:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
      fcf479:	48 89 df             	mov    rdi,rbx
      fcf47c:	48 89 74 24 28       	mov    QWORD PTR [rsp+0x28],rsi
      fcf481:	e8 aa be ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      fcf486:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
      fcf489:	48 85 db             	test   rbx,rbx
      fcf48c:	0f 84 5f 08 00 00    	je     fcfcf1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197107>
      fcf492:	89 6c 24 0c          	mov    DWORD PTR [rsp+0xc],ebp
      fcf496:	40 84 ed             	test   bpl,bpl
      fcf499:	74 24                	je     fcf4bf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1968d5>
      fcf49b:	0f 57 c0             	xorps  xmm0,xmm0
      fcf49e:	4c 8d b4 24 d0 01 00 	lea    r14,[rsp+0x1d0]
      fcf4a5:	00 
      fcf4a6:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      fcf4aa:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      fcf4ae:	4c 89 f6             	mov    rsi,r14
      fcf4b1:	e8 66 a3 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fcf4b6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      fcf4ba:	e8 c7 ef ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fcf4bf:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      fcf4c4:	49 8d 6c 24 30       	lea    rbp,[r12+0x30]
      fcf4c9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      fcf4ce:	48 89 ee             	mov    rsi,rbp
      fcf4d1:	e8 6a ea 81 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      fcf4d6:	41 80 7f 40 00       	cmp    BYTE PTR [r15+0x40],0x0
      fcf4db:	0f 84 9d 02 00 00    	je     fcf77e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x196b94>
      fcf4e1:	4d 8b 74 24 20       	mov    r14,QWORD PTR [r12+0x20]
      fcf4e6:	4c 89 ff             	mov    rdi,r15
      fcf4e9:	e8 7e ab ff ff       	call   fca06c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191482>
      fcf4ee:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      fcf4f5:	00 
      fcf4f6:	4c 89 fe             	mov    rsi,r15
      fcf4f9:	e8 56 d1 ff ff       	call   fcc654 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x193a6a>
      fcf4fe:	48 8d 9c 24 10 02 00 	lea    rbx,[rsp+0x210]
      fcf505:	00 
      fcf506:	48 89 df             	mov    rdi,rbx
      fcf509:	48 89 ee             	mov    rsi,rbp
      fcf50c:	e8 df 7d 69 00       	call   16672f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b45c>
      fcf511:	49 83 c6 10          	add    r14,0x10
      fcf515:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      fcf51c:	00 
      fcf51d:	4c 89 f6             	mov    rsi,r14
      fcf520:	e8 35 c9 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      fcf525:	0f 57 c0             	xorps  xmm0,xmm0
      fcf528:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
      fcf52d:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      fcf532:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
      fcf538:	4c 8d bc 24 c0 00 00 	lea    r15,[rsp+0xc0]
      fcf53f:	00 
      fcf540:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
      fcf547:	00 
      fcf548:	4c 89 ff             	mov    rdi,r15
      fcf54b:	4c 89 e2             	mov    rdx,r12
      fcf54e:	e8 07 5b f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      fcf553:	48 8d ac 24 b0 00 00 	lea    rbp,[rsp+0xb0]

### candidate 0x1072f50; FDE=(17248008, 17248533)
     1072f19:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1072f20:	00 00 
     1072f22:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     1072f29:	00 
     1072f2a:	48 8b 32             	mov    rsi,QWORD PTR [rdx]
     1072f2d:	48 85 f6             	test   rsi,rsi
     1072f30:	0f 84 8e 01 00 00    	je     10730c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a4da>
     1072f36:	49 89 d7             	mov    r15,rdx
     1072f39:	49 89 fe             	mov    r14,rdi
     1072f3c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1072f3f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1072f44:	31 d2                	xor    edx,edx
     1072f46:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1072f49:	49 8d b7 a8 00 00 00 	lea    rsi,[r15+0xa8]
     1072f50:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1072f55:	e8 e6 af 77 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1072f5a:	49 69 87 90 00 00 00 	imul   rax,QWORD PTR [r15+0x90],0x3e8
     1072f61:	e8 03 00 00 
     1072f65:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     1072f69:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]
     1072f6d:	41 8b 7f 20          	mov    edi,DWORD PTR [r15+0x20]
     1072f71:	49 8b 77 58          	mov    rsi,QWORD PTR [r15+0x58]
     1072f75:	e8 5e 27 53 00       	call   15a56d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3eac5c>
     1072f7a:	48 89 c3             	mov    rbx,rax
     1072f7d:	0f 57 c0             	xorps  xmm0,xmm0
     1072f80:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1072f85:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
     1072f89:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     1072f8c:	c7 47 20 00 00 80 3f 	mov    DWORD PTR [rdi+0x20],0x3f800000
     1072f93:	49 63 77 30          	movsxd rsi,DWORD PTR [r15+0x30]
     1072f97:	e8 56 cc bd ff       	call   c4fbf2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cb92>
     1072f9c:	49 8d 47 28          	lea    rax,[r15+0x28]
     1072fa0:	49 8b 4f 28          	mov    rcx,QWORD PTR [r15+0x28]
     1072fa4:	49 89 cc             	mov    r12,rcx
     1072fa7:	49 83 c4 07          	add    r12,0x7
     1072fab:	f6 c1 01             	test   cl,0x1
     1072fae:	4c 0f 44 e0          	cmove  r12,rax
     1072fb2:	4d 63 6f 30          	movsxd r13,DWORD PTR [r15+0x30]
     1072fb6:	4d 85 ed             	test   r13,r13
     1072fb9:	74 30                	je     1072feb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a401>
     1072fbb:	49 c1 e5 03          	shl    r13,0x3
     1072fbf:	31 ed                	xor    ebp,ebp
     1072fc1:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
     1072fc6:	49 8b 04 2c          	mov    rax,QWORD PTR [r12+rbp*1]
     1072fca:	48 8b 70 18          	mov    rsi,QWORD PTR [rax+0x18]
     1072fce:	48 8b 50 20          	mov    rdx,QWORD PTR [rax+0x20]
     1072fd2:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1072fd6:	48 83 e2 fc          	and    rdx,0xfffffffffffffffc
     1072fda:	4c 89 ff             	mov    rdi,r15
     1072fdd:	e8 7c 02 dc ff       	call   e3325e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1002e4>
     1072fe2:	48 83 c5 08          	add    rbp,0x8
     1072fe6:	49 39 ed             	cmp    r13,rbp
     1072fe9:	75 db                	jne    1072fc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a3dc>
     1072feb:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     1072fee:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]

### candidate 0x10affc6; FDE=(17497794, 17498209)
     10aff94:	e8 fd 07 a9 ff       	call   b40796 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d736>
     10aff99:	8a 4c 24 50          	mov    cl,BYTE PTR [rsp+0x50]
     10aff9d:	84 c0                	test   al,al
     10aff9f:	74 19                	je     10affba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2773d0>
     10affa1:	84 c9                	test   cl,cl
     10affa3:	75 15                	jne    10affba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2773d0>
     10affa5:	48 8d 35 7c 83 29 ff 	lea    rsi,[rip+0xffffffffff29837c]        # 348328 <_ZTSSt12bad_any_cast@@Base-0x47ea0>
     10affac:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     10affb1:	e8 5c bd da ff       	call   e5bd12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23128>
     10affb6:	8a 4c 24 50          	mov    cl,BYTE PTR [rsp+0x50]
     10affba:	84 c9                	test   cl,cl
     10affbc:	74 3d                	je     10afffb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277411>
     10affbe:	48 89 df             	mov    rdi,rbx
     10affc1:	e8 e2 04 00 00       	call   10b04a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2778be>
     10affc6:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     10affcb:	4c 89 f6             	mov    rsi,r14
     10affce:	e8 6d df 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     10affd3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     10affd8:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
     10affdd:	e8 5e df 73 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     10affe2:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     10affe6:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     10affeb:	4c 89 f6             	mov    rsi,r14
     10affee:	e8 ef 04 00 00       	call   10b04e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2778f8>
     10afff3:	4c 89 f7             	mov    rdi,r14
     10afff6:	e8 d1 e7 9e ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     10afffb:	c6 83 e8 00 00 00 00 	mov    BYTE PTR [rbx+0xe8],0x0
     10b0002:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     10b0007:	e8 24 6d 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     10b000c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10b0013:	00 00 
     10b0015:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     10b001a:	75 40                	jne    10b005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277472>
     10b001c:	48 83 c4 60          	add    rsp,0x60
     10b0020:	5b                   	pop    rbx
     10b0021:	41 5e                	pop    r14
     10b0023:	41 5f                	pop    r15
     10b0025:	c3                   	ret
     10b0026:	eb 0f                	jmp    10b0037 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27744d>
     10b0028:	48 89 c3             	mov    rbx,rax
     10b002b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     10b0030:	e8 5b de 73 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10b0035:	eb 03                	jmp    10b003a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277450>
     10b0037:	48 89 c3             	mov    rbx,rax
     10b003a:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     10b003f:	e8 ec 6c 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     10b0044:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10b004b:	00 00 
     10b004d:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     10b0052:	75 08                	jne    10b005c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277472>
     10b0054:	48 89 df             	mov    rdi,rbx
     10b0057:	e8 74 fc 9b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     10b005c:	e8 4f fa 73 00       	call   17efab0 <__stack_chk_fail@plt>
     10b0061:	cc                   	int3
     10b0062:	41 57                	push   r15

### candidate 0x113a053; FDE=(18063412, 18063676)
     113a024:	00 
     113a025:	75 08                	jne    113a02f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x301445>
     113a027:	48 89 df             	mov    rdi,rbx
     113a02a:	e8 a1 5c 93 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     113a02f:	e8 7c 5a 6b 00       	call   17efab0 <__stack_chk_fail@plt>
     113a034:	55                   	push   rbp
     113a035:	41 56                	push   r14
     113a037:	53                   	push   rbx
     113a038:	48 81 ec 80 00 00 00 	sub    rsp,0x80
     113a03f:	49 89 f6             	mov    r14,rsi
     113a042:	48 89 fb             	mov    rbx,rdi
     113a045:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     113a04c:	00 00 
     113a04e:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     113a053:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     113a058:	e8 e3 3e 6b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     113a05d:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
     113a061:	41 8b 3e             	mov    edi,DWORD PTR [r14]
     113a064:	e8 b7 17 94 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     113a069:	84 c0                	test   al,al
     113a06b:	74 3e                	je     113a0ab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3014c1>
     113a06d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     113a072:	4c 89 f6             	mov    rsi,r14
     113a075:	e8 28 67 59 00       	call   16d07a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8490e>
     113a07a:	40 8a 6c 24 38       	mov    bpl,BYTE PTR [rsp+0x38]
     113a07f:	40 84 ed             	test   bpl,bpl
     113a082:	74 11                	je     113a095 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3014ab>
     113a084:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     113a089:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     113a08e:	e8 9b 19 94 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     113a093:	eb 07                	jmp    113a09c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3014b2>
     113a095:	31 c0                	xor    eax,eax
     113a097:	88 03                	mov    BYTE PTR [rbx],al
     113a099:	88 43 58             	mov    BYTE PTR [rbx+0x58],al
     113a09c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     113a0a1:	e8 8a cc 96 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     113a0a6:	40 84 ed             	test   bpl,bpl
     113a0a9:	74 41                	je     113a0ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x301502>
     113a0ab:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     113a0b0:	e8 81 17 94 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     113a0b5:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     113a0ba:	4c 89 f7             	mov    rdi,r14
     113a0bd:	48 89 c6             	mov    rsi,rax
     113a0c0:	e8 63 b3 58 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     113a0c5:	41 83 7e 38 3e       	cmp    DWORD PTR [r14+0x38],0x3e
     113a0ca:	75 0f                	jne    113a0db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3014f1>
     113a0cc:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     113a0d1:	48 89 df             	mov    rdi,rbx
     113a0d4:	e8 01 6b bf ff       	call   d30bda <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27db7a>
     113a0d9:	eb 07                	jmp    113a0e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3014f8>
     113a0db:	31 c0                	xor    eax,eax
     113a0dd:	88 03                	mov    BYTE PTR [rbx],al
     113a0df:	88 43 58             	mov    BYTE PTR [rbx+0x58],al
     113a0e2:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     113a0e7:	e8 42 b2 58 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>

### candidate 0x1157541; FDE=(18183394, 18183528)
     1157513:	e8 0c 1c 48 00       	call   15d9124 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41e6a8>
     1157518:	89 c3                	mov    ebx,eax
     115751a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     115751f:	e8 6c 69 69 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1157524:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     115752b:	00 00 
     115752d:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     1157532:	75 2f                	jne    1157563 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31e979>
     1157534:	89 d8                	mov    eax,ebx
     1157536:	48 83 c4 28          	add    rsp,0x28
     115753a:	5b                   	pop    rbx
     115753b:	41 5e                	pop    r14
     115753d:	c3                   	ret
     115753e:	48 89 c3             	mov    rbx,rax
     1157541:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1157546:	e8 45 69 69 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     115754b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1157552:	00 00 
     1157554:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     1157559:	75 08                	jne    1157563 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31e979>
     115755b:	48 89 df             	mov    rdi,rbx
     115755e:	e8 6d 87 91 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1157563:	e8 48 85 69 00       	call   17efab0 <__stack_chk_fail@plt>
     1157568:	55                   	push   rbp
     1157569:	41 57                	push   r15
     115756b:	41 56                	push   r14
     115756d:	53                   	push   rbx
     115756e:	48 83 ec 38          	sub    rsp,0x38
     1157572:	48 89 d3             	mov    rbx,rdx
     1157575:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     115757c:	00 00 
     115757e:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     1157583:	40 8a 2f             	mov    bpl,BYTE PTR [rdi]
     1157586:	48 83 c6 68          	add    rsi,0x68
     115758a:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     115758f:	e8 ac 69 69 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1157594:	48 83 c3 68          	add    rbx,0x68
     1157598:	48 89 e7             	mov    rdi,rsp
     115759b:	48 89 de             	mov    rsi,rbx
     115759e:	e8 9d 69 69 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     11575a3:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
     11575a8:	49 89 e7             	mov    r15,rsp
     11575ab:	4c 89 f7             	mov    rdi,r14
     11575ae:	4c 89 fe             	mov    rsi,r15
     11575b1:	e8 8a 1a 48 00       	call   15d9040 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41e5c4>
     11575b6:	89 c3                	mov    ebx,eax
     11575b8:	f7 db                	neg    ebx
     11575ba:	40 84 ed             	test   bpl,bpl
     11575bd:	0f 45 d8             	cmovne ebx,eax
     11575c0:	4c 89 ff             	mov    rdi,r15
     11575c3:	e8 c8 68 69 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11575c8:	4c 89 f7             	mov    rdi,r14
     11575cb:	e8 c0 68 69 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11575d0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11575d7:	00 00 

### candidate 0x120f7fc; FDE=(18937761, 18938255)
     120f7c0:	80 be 70 04 00 00 00 	cmp    BYTE PTR [rsi+0x470],0x0
     120f7c7:	0f 84 64 01 00 00    	je     120f931 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54eb5>
     120f7cd:	49 89 ce             	mov    r14,rcx
     120f7d0:	49 89 d7             	mov    r15,rdx
     120f7d3:	49 89 f4             	mov    r12,rsi
     120f7d6:	4c 8d 6e 30          	lea    r13,[rsi+0x30]
     120f7da:	48 8d 35 27 72 14 ff 	lea    rsi,[rip+0xffffffffff147227]        # 356a08 <_ZTSSt12bad_any_cast@@Base-0x397c0>
     120f7e1:	48 8d 6c 24 20       	lea    rbp,[rsp+0x20]
     120f7e6:	48 89 ef             	mov    rdi,rbp
     120f7e9:	e8 90 a2 86 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     120f7ee:	4c 89 ef             	mov    rdi,r13
     120f7f1:	48 89 ee             	mov    rsi,rbp
     120f7f4:	4c 89 e2             	mov    rdx,r12
     120f7f7:	e8 e0 9d 9c ff       	call   bd95dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12657c>
     120f7fc:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     120f801:	48 89 c6             	mov    rsi,rax
     120f804:	e8 37 e7 5d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     120f809:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     120f80e:	e8 7d e6 5d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     120f813:	0f 57 c0             	xorps  xmm0,xmm0
     120f816:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     120f819:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     120f81e:	4c 89 f7             	mov    rdi,r14
     120f821:	e8 88 25 54 00       	call   1751dae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105f1a>
     120f826:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     120f82b:	e8 06 c0 86 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     120f830:	49 89 d0             	mov    r8,rdx
     120f833:	4d 8b 17             	mov    r10,QWORD PTR [r15]
     120f836:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     120f83b:	4c 89 fe             	mov    rsi,r15
     120f83e:	ba dc 00 00 00       	mov    edx,0xdc
     120f843:	48 89 c1             	mov    rcx,rax
     120f846:	4d 89 f1             	mov    r9,r14
     120f849:	41 ff 52 38          	call   QWORD PTR [r10+0x38]
     120f84d:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     120f852:	44 8a 67 f0          	mov    r12b,BYTE PTR [rdi-0x10]
     120f856:	40 8a 6f f8          	mov    bpl,BYTE PTR [rdi-0x8]
     120f85a:	e8 31 e6 5d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     120f85f:	45 84 e4             	test   r12b,r12b
     120f862:	74 09                	je     120f86d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54df1>
     120f864:	40 80 fd 01          	cmp    bpl,0x1
     120f868:	75 03                	jne    120f86d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54df1>
     120f86a:	4c 89 33             	mov    QWORD PTR [rbx],r14
     120f86d:	4d 8d 66 20          	lea    r12,[r14+0x20]
     120f871:	4c 89 e7             	mov    rdi,r12
     120f874:	e8 35 25 54 00       	call   1751dae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105f1a>
     120f879:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     120f87e:	e8 b3 bf 86 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     120f883:	49 89 d0             	mov    r8,rdx
     120f886:	4d 8b 17             	mov    r10,QWORD PTR [r15]
     120f889:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     120f88e:	4c 89 fe             	mov    rsi,r15
     120f891:	ba b2 00 00 00       	mov    edx,0xb2
     120f896:	48 89 c1             	mov    rcx,rax
     120f899:	4d 89 e1             	mov    r9,r12

### candidate 0x12171bd; FDE=(18968882, 18969125)
     1217193:	74 21                	je     12171b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c73a>
     1217195:	31 c0                	xor    eax,eax
     1217197:	88 03                	mov    BYTE PTR [rbx],al
     1217199:	88 43 50             	mov    BYTE PTR [rbx+0x50],al
     121719c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12171a3:	00 00 
     12171a5:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     12171aa:	75 74                	jne    1217220 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c7a4>
     12171ac:	48 83 c4 60          	add    rsp,0x60
     12171b0:	5b                   	pop    rbx
     12171b1:	41 5e                	pop    r14
     12171b3:	41 5f                	pop    r15
     12171b5:	c3                   	ret
     12171b6:	49 81 c6 b8 06 00 00 	add    r14,0x6b8
     12171bd:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     12171c2:	4c 89 fe             	mov    rsi,r15
     12171c5:	e8 76 6d 5d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12171ca:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12171cf:	4c 89 f6             	mov    rsi,r14
     12171d2:	e8 69 6d 5d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12171d7:	31 c0                	xor    eax,eax
     12171d9:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     12171de:	41 88 46 30          	mov    BYTE PTR [r14+0x30],al
     12171e2:	41 88 46 48          	mov    BYTE PTR [r14+0x48],al
     12171e6:	48 89 df             	mov    rdi,rbx
     12171e9:	4c 89 f6             	mov    rsi,r14
     12171ec:	e8 e9 e4 ff ff       	call   12156da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ac5e>
     12171f1:	4c 89 f7             	mov    rdi,r14
     12171f4:	e8 cf 51 8b ff       	call   acc3c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19368>
     12171f9:	eb a1                	jmp    121719c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c720>
     12171fb:	48 89 c3             	mov    rbx,rax
     12171fe:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1217203:	e8 88 6c 5d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1217208:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     121720f:	00 00 
     1217211:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     1217216:	75 08                	jne    1217220 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c7a4>
     1217218:	48 89 df             	mov    rdi,rbx
     121721b:	e8 b0 8a 85 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1217220:	e8 8b 88 5d 00       	call   17efab0 <__stack_chk_fail@plt>
     1217225:	cc                   	int3
     1217226:	41 56                	push   r14
     1217228:	53                   	push   rbx
     1217229:	50                   	push   rax
     121722a:	49 89 f6             	mov    r14,rsi
     121722d:	48 89 fb             	mov    rbx,rdi
     1217230:	8a 47 50             	mov    al,BYTE PTR [rdi+0x50]
     1217233:	3a 46 50             	cmp    al,BYTE PTR [rsi+0x50]
     1217236:	75 2e                	jne    1217266 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c7ea>
     1217238:	84 c0                	test   al,al
     121723a:	74 40                	je     121727c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c800>
     121723c:	48 89 df             	mov    rdi,rbx
     121723f:	4c 89 f6             	mov    rsi,r14
     1217242:	e8 e7 47 86 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1217247:	48 8d 7b 18          	lea    rdi,[rbx+0x18]

### candidate 0x1222fa1; FDE=(19017590, 19017756)
     1222f68:	48 89 df             	mov    rdi,rbx
     1222f6b:	e8 35 6b 85 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1222f70:	e9 01 00 00 00       	jmp    1222f76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x684fa>
     1222f75:	cc                   	int3
     1222f76:	53                   	push   rbx
     1222f77:	48 83 ec 60          	sub    rsp,0x60
     1222f7b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1222f82:	00 00 
     1222f84:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     1222f89:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1222f8c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     1222f90:	ff 80 04 11 00 00    	inc    DWORD PTR [rax+0x1104]
     1222f96:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     1222f9a:	48 8d 35 57 70 7c 00 	lea    rsi,[rip+0x7c7057]        # 19e9ff8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xc30>
     1222fa1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1222fa6:	e8 95 af 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1222fab:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
     1222fb0:	48 83 22 00          	and    QWORD PTR [rdx],0x0
     1222fb4:	31 c0                	xor    eax,eax
     1222fb6:	88 42 08             	mov    BYTE PTR [rdx+0x8],al
     1222fb9:	88 42 0c             	mov    BYTE PTR [rdx+0xc],al
     1222fbc:	88 42 10             	mov    BYTE PTR [rdx+0x10],al
     1222fbf:	88 42 14             	mov    BYTE PTR [rdx+0x14],al
     1222fc2:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
     1222fc5:	88 42 30             	mov    BYTE PTR [rdx+0x30],al
     1222fc8:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     1222fcd:	48 89 df             	mov    rdi,rbx
     1222fd0:	e8 7f 7b ff ff       	call   121ab54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600d8>
     1222fd5:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1222fda:	e8 51 3d 88 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1222fdf:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1222fe4:	e8 a7 ae 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1222fe9:	48 89 df             	mov    rdi,rbx
     1222fec:	e8 b3 c9 ff ff       	call   121f9a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64f28>
     1222ff1:	48 89 e7             	mov    rdi,rsp
     1222ff4:	e8 75 57 ff ff       	call   121876e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dcf2>
     1222ff9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1223000:	00 00 
     1223002:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     1223007:	75 06                	jne    122300f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68593>
     1223009:	48 83 c4 60          	add    rsp,0x60
     122300d:	5b                   	pop    rbx
     122300e:	c3                   	ret
     122300f:	e8 9c ca 5c 00       	call   17efab0 <__stack_chk_fail@plt>
     1223014:	48 89 c7             	mov    rdi,rax
     1223017:	e8 89 6a 85 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     122301c:	41 56                	push   r14
     122301e:	53                   	push   rbx
     122301f:	48 83 ec 28          	sub    rsp,0x28
     1223023:	48 89 fb             	mov    rbx,rdi
     1223026:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     122302d:	00 00 
     122302f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1223034:	48 8d 44 24 0c       	lea    rax,[rsp+0xc]
     1223039:	89 30                	mov    DWORD PTR [rax],esi

### candidate 0x1226222; FDE=(19030372, 19030687)
     12261d8:	e8 b3 7c 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12261dd:	48 8d bb 90 14 00 00 	lea    rdi,[rbx+0x1490]
     12261e4:	e8 43 91 8a ff       	call   acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
     12261e9:	48 8d bb 88 13 00 00 	lea    rdi,[rbx+0x1388]
     12261f0:	31 f6                	xor    esi,esi
     12261f2:	e8 ed f8 fe ff       	call   1215ae4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b068>
     12261f7:	48 89 df             	mov    rdi,rbx
     12261fa:	e8 41 27 ff ff       	call   1218940 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dec4>
     12261ff:	48 8d bb 58 0a 00 00 	lea    rdi,[rbx+0xa58]
     1226206:	e8 2d b7 59 00       	call   17c1938 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175aa4>
     122620b:	80 bb 08 11 00 00 00 	cmp    BYTE PTR [rbx+0x1108],0x0
     1226212:	75 56                	jne    122626a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6b7ee>
     1226214:	c6 83 08 11 00 00 01 	mov    BYTE PTR [rbx+0x1108],0x1
     122621b:	48 8d 35 ae 50 1b ff 	lea    rsi,[rip+0xffffffffff1b50ae]        # 3db2d0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0xd1f>
     1226222:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1226227:	e8 14 7d 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     122622c:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
     1226231:	48 83 22 00          	and    QWORD PTR [rdx],0x0
     1226235:	31 c0                	xor    eax,eax
     1226237:	88 42 08             	mov    BYTE PTR [rdx+0x8],al
     122623a:	88 42 0c             	mov    BYTE PTR [rdx+0xc],al
     122623d:	88 42 10             	mov    BYTE PTR [rdx+0x10],al
     1226240:	88 42 14             	mov    BYTE PTR [rdx+0x14],al
     1226243:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
     1226246:	88 42 30             	mov    BYTE PTR [rdx+0x30],al
     1226249:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     122624e:	48 89 df             	mov    rdi,rbx
     1226251:	e8 fe 48 ff ff       	call   121ab54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600d8>
     1226256:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     122625b:	e8 d0 0a 88 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1226260:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1226265:	e8 26 7c 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     122626a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     122626f:	e8 fa 24 ff ff       	call   121876e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dcf2>
     1226274:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     122627b:	00 00 
     122627d:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
     1226284:	00 
     1226285:	75 0b                	jne    1226292 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6b816>
     1226287:	48 81 c4 88 00 00 00 	add    rsp,0x88
     122628e:	5b                   	pop    rbx
     122628f:	41 5e                	pop    r14
     1226291:	c3                   	ret
     1226292:	e8 19 98 5c 00       	call   17efab0 <__stack_chk_fail@plt>
     1226297:	48 89 c7             	mov    rdi,rax
     122629a:	e8 06 38 85 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     122629f:	cc                   	int3
     12262a0:	55                   	push   rbp
     12262a1:	41 57                	push   r15
     12262a3:	41 56                	push   r14
     12262a5:	41 55                	push   r13
     12262a7:	41 54                	push   r12
     12262a9:	53                   	push   rbx
     12262aa:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     12262b1:	48 89 fb             	mov    rbx,rdi

### candidate 0x1229d74; FDE=(19045712, 19046181)
     1229d4e:	5b                   	pop    rbx
     1229d4f:	c3                   	ret
     1229d50:	55                   	push   rbp
     1229d51:	41 57                	push   r15
     1229d53:	41 56                	push   r14
     1229d55:	53                   	push   rbx
     1229d56:	48 83 ec 58          	sub    rsp,0x58
     1229d5a:	89 d5                	mov    ebp,edx
     1229d5c:	49 89 f6             	mov    r14,rsi
     1229d5f:	48 89 fb             	mov    rbx,rdi
     1229d62:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1229d69:	00 00 
     1229d6b:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     1229d70:	4c 8d 7e 18          	lea    r15,[rsi+0x18]
     1229d74:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1229d79:	4c 89 fe             	mov    rsi,r15
     1229d7c:	e8 bf 41 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1229d81:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1229d86:	4c 89 fe             	mov    rsi,r15
     1229d89:	e8 b2 41 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1229d8e:	41 8a 86 be 02 00 00 	mov    al,BYTE PTR [r14+0x2be]
     1229d95:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     1229d9a:	88 46 40             	mov    BYTE PTR [rsi+0x40],al
     1229d9d:	41 0f 10 86 ae 02 00 	movups xmm0,XMMWORD PTR [r14+0x2ae]
     1229da4:	00 
     1229da5:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     1229da9:	48 89 df             	mov    rdi,rbx
     1229dac:	e8 9f 28 e6 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     1229db1:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     1229db5:	4c 89 f6             	mov    rsi,r14
     1229db8:	e8 83 41 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1229dbd:	89 6b 60             	mov    DWORD PTR [rbx+0x60],ebp
     1229dc0:	49 8b 86 78 01 00 00 	mov    rax,QWORD PTR [r14+0x178]
     1229dc7:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     1229dcb:	49 8b 86 80 01 00 00 	mov    rax,QWORD PTR [r14+0x180]
     1229dd2:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     1229dd6:	41 8a 86 88 01 00 00 	mov    al,BYTE PTR [r14+0x188]
     1229ddd:	88 43 78             	mov    BYTE PTR [rbx+0x78],al
     1229de0:	49 8b 86 90 01 00 00 	mov    rax,QWORD PTR [r14+0x190]
     1229de7:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
     1229dee:	41 8a 86 98 01 00 00 	mov    al,BYTE PTR [r14+0x198]
     1229df5:	88 83 88 00 00 00    	mov    BYTE PTR [rbx+0x88],al
     1229dfb:	48 83 a3 a0 00 00 00 	and    QWORD PTR [rbx+0xa0],0x0
     1229e02:	00 
     1229e03:	0f 57 c0             	xorps  xmm0,xmm0
     1229e06:	0f 11 83 90 00 00 00 	movups XMMWORD PTR [rbx+0x90],xmm0
     1229e0d:	41 80 be c6 02 00 00 	cmp    BYTE PTR [r14+0x2c6],0x0
     1229e14:	00 
     1229e15:	74 04                	je     1229e1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f39f>
     1229e17:	31 c0                	xor    eax,eax
     1229e19:	eb 22                	jmp    1229e3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f3c1>
     1229e1b:	66 c7 83 a9 00 00 00 	mov    WORD PTR [rbx+0xa9],0x1
     1229e22:	01 00 
     1229e24:	b0 01                	mov    al,0x1
     1229e26:	88 83 ab 00 00 00    	mov    BYTE PTR [rbx+0xab],al

### candidate 0x124da19; FDE=(19191908, 19192394)
     124d9e8:	48 89 df             	mov    rdi,rbx
     124d9eb:	4c 89 f6             	mov    rsi,r14
     124d9ee:	e8 c7 07 90 ff       	call   b4e1ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b15a>
     124d9f3:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     124d9f7:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     124d9fa:	49 89 0e             	mov    QWORD PTR [r14],rcx
     124d9fd:	48 83 c0 08          	add    rax,0x8
     124da01:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     124da05:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     124da0a:	e9 98 fe ff ff       	jmp    124d8a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92e2b>
     124da0f:	eb 05                	jmp    124da16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92f9a>
     124da11:	48 89 c3             	mov    rbx,rax
     124da14:	eb 0d                	jmp    124da23 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92fa7>
     124da16:	48 89 c3             	mov    rbx,rax
     124da19:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     124da1e:	e8 a7 c8 82 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     124da23:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     124da28:	e8 71 1f 85 ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
     124da2d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124da34:	00 00 
     124da36:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     124da3b:	75 08                	jne    124da45 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92fc9>
     124da3d:	48 89 df             	mov    rdi,rbx
     124da40:	e8 8b 22 82 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     124da45:	e8 66 20 5a 00       	call   17efab0 <__stack_chk_fail@plt>
     124da4a:	41 57                	push   r15
     124da4c:	41 56                	push   r14
     124da4e:	41 54                	push   r12
     124da50:	53                   	push   rbx
     124da51:	50                   	push   rax
     124da52:	49 89 f7             	mov    r15,rsi
     124da55:	48 89 fb             	mov    rbx,rdi
     124da58:	e8 e3 04 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124da5d:	4c 8d 73 18          	lea    r14,[rbx+0x18]
     124da61:	49 8d 77 18          	lea    rsi,[r15+0x18]
     124da65:	4c 89 f7             	mov    rdi,r14
     124da68:	e8 d3 04 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124da6d:	4c 8d 63 30          	lea    r12,[rbx+0x30]
     124da71:	49 8d 77 30          	lea    rsi,[r15+0x30]
     124da75:	4c 89 e7             	mov    rdi,r12
     124da78:	e8 c3 04 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124da7d:	41 0f 10 47 48       	movups xmm0,XMMWORD PTR [r15+0x48]
     124da82:	0f 11 43 48          	movups XMMWORD PTR [rbx+0x48],xmm0
     124da86:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
     124da8a:	49 8d 77 58          	lea    rsi,[r15+0x58]
     124da8e:	e8 d3 ec 87 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     124da93:	41 0f 10 47 78       	movups xmm0,XMMWORD PTR [r15+0x78]
     124da98:	0f 11 43 78          	movups XMMWORD PTR [rbx+0x78],xmm0
     124da9c:	48 83 c4 08          	add    rsp,0x8
     124daa0:	5b                   	pop    rbx
     124daa1:	41 5c                	pop    r12
     124daa3:	41 5e                	pop    r14
     124daa5:	41 5f                	pop    r15
     124daa7:	c3                   	ret
     124daa8:	49 89 c7             	mov    r15,rax

### candidate 0x125f2cd; FDE=(19264172, 19264647)
     125f2a6:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     125f2aa:	c3                   	ret
     125f2ab:	cc                   	int3
     125f2ac:	55                   	push   rbp
     125f2ad:	41 57                	push   r15
     125f2af:	41 56                	push   r14
     125f2b1:	53                   	push   rbx
     125f2b2:	48 83 ec 48          	sub    rsp,0x48
     125f2b6:	49 89 ce             	mov    r14,rcx
     125f2b9:	49 89 d7             	mov    r15,rdx
     125f2bc:	48 89 fb             	mov    rbx,rdi
     125f2bf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     125f2c6:	00 00 
     125f2c8:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     125f2cd:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     125f2d2:	e8 69 ec 58 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     125f2d7:	41 8b 2f             	mov    ebp,DWORD PTR [r15]
     125f2da:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     125f2df:	4c 89 f6             	mov    rsi,r14
     125f2e2:	e8 a1 01 00 00       	call   125f488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4a0c>
     125f2e7:	48 8b 5b 08          	mov    rbx,QWORD PTR [rbx+0x8]
     125f2eb:	48 8d 35 ee a1 1d ff 	lea    rsi,[rip+0xffffffffff1da1ee]        # 4394e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ef2f>
     125f2f2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     125f2f7:	e8 f2 03 84 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     125f2fc:	83 fd 03             	cmp    ebp,0x3
     125f2ff:	75 22                	jne    125f323 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa48a7>
     125f301:	84 c0                	test   al,al
     125f303:	74 1e                	je     125f323 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa48a7>
     125f305:	83 7c 24 3c 04       	cmp    DWORD PTR [rsp+0x3c],0x4
     125f30a:	0f 85 0f 01 00 00    	jne    125f41f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa49a3>
     125f310:	f3 0f 10 44 24 30    	movss  xmm0,DWORD PTR [rsp+0x30]
     125f316:	f3 0f 11 83 c0 00 00 	movss  DWORD PTR [rbx+0xc0],xmm0
     125f31d:	00 
     125f31e:	e9 f4 00 00 00       	jmp    125f417 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa499b>
     125f323:	83 fd 05             	cmp    ebp,0x5
     125f326:	74 79                	je     125f3a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4925>
     125f328:	83 fd 04             	cmp    ebp,0x4
     125f32b:	0f 85 ee 00 00 00    	jne    125f41f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa49a3>
     125f331:	83 7c 24 3c 02       	cmp    DWORD PTR [rsp+0x3c],0x2
     125f336:	0f 85 e3 00 00 00    	jne    125f41f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa49a3>
     125f33c:	4c 8d b3 08 01 00 00 	lea    r14,[rbx+0x108]
     125f343:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     125f348:	4c 89 f6             	mov    rsi,r14
     125f34b:	e8 9e 03 84 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     125f350:	84 c0                	test   al,al
     125f352:	75 2a                	jne    125f37e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4902>
     125f354:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     125f359:	4c 89 f7             	mov    rdi,r14
     125f35c:	e8 1f ed 58 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     125f361:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     125f365:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     125f368:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     125f36d:	ff 50 20             	call   QWORD PTR [rax+0x20]
     125f370:	48 89 83 20 01 00 00 	mov    QWORD PTR [rbx+0x120],rax
     125f377:	66 89 93 28 01 00 00 	mov    WORD PTR [rbx+0x128],dx

### candidate 0x12a0856; FDE=(19531676, 19531901)
     12a082a:	48 89 df             	mov    rdi,rbx
     12a082d:	e8 6c e0 04 00       	call   12ee89e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e22>
     12a0832:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12a0839:	00 00 
     12a083b:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     12a0840:	75 36                	jne    12a0878 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe5dfc>
     12a0842:	48 83 c4 38          	add    rsp,0x38
     12a0846:	5b                   	pop    rbx
     12a0847:	41 5e                	pop    r14
     12a0849:	c3                   	ret
     12a084a:	48 83 e7 fe          	and    rdi,0xfffffffffffffffe
     12a084e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     12a0851:	eb b1                	jmp    12a0804 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe5d88>
     12a0853:	48 89 c3             	mov    rbx,rax
     12a0856:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     12a085b:	e8 3e e0 04 00       	call   12ee89e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e22>
     12a0860:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12a0867:	00 00 
     12a0869:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     12a086e:	75 08                	jne    12a0878 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe5dfc>
     12a0870:	48 89 df             	mov    rdi,rbx
     12a0873:	e8 58 f4 7c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     12a0878:	e8 33 f2 54 00       	call   17efab0 <__stack_chk_fail@plt>
     12a087d:	cc                   	int3
     12a087e:	55                   	push   rbp
     12a087f:	41 56                	push   r14
     12a0881:	53                   	push   rbx
     12a0882:	48 83 ec 50          	sub    rsp,0x50
     12a0886:	89 f5                	mov    ebp,esi
     12a0888:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12a088f:	00 00 
     12a0891:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     12a0896:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     12a089a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     12a089f:	4c 89 f7             	mov    rdi,r14
     12a08a2:	48 89 d6             	mov    rsi,rdx
     12a08a5:	e8 96 d6 54 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12a08aa:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12a08af:	89 ee                	mov    esi,ebp
     12a08b1:	4c 89 f2             	mov    rdx,r14
     12a08b4:	e8 ff f6 ff ff       	call   129ffb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe553c>
     12a08b9:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     12a08be:	48 89 df             	mov    rdi,rbx
     12a08c1:	4c 89 f6             	mov    rsi,r14
     12a08c4:	e8 93 0f 34 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
     12a08c9:	4c 89 f7             	mov    rdi,r14
     12a08cc:	e8 cd df 04 00       	call   12ee89e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e22>
     12a08d1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     12a08d6:	e8 b5 d5 54 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12a08db:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12a08e2:	00 00 
     12a08e4:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     12a08e9:	75 2e                	jne    12a0919 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe5e9d>
     12a08eb:	48 83 c4 50          	add    rsp,0x50
     12a08ef:	5b                   	pop    rbx

### candidate 0x12b5b8c; FDE=(19618658, 19618881)
     12b5b5d:	e8 43 3f 7c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     12b5b62:	41 56                	push   r14
     12b5b64:	53                   	push   rbx
     12b5b65:	48 83 ec 28          	sub    rsp,0x28
     12b5b69:	48 89 fb             	mov    rbx,rdi
     12b5b6c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12b5b73:	00 00 
     12b5b75:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     12b5b7a:	83 fa 07             	cmp    edx,0x7
     12b5b7d:	74 34                	je     12b5bb3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb137>
     12b5b7f:	83 fa 04             	cmp    edx,0x4
     12b5b82:	75 7d                	jne    12b5c01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb185>
     12b5b84:	48 8b 76 18          	mov    rsi,QWORD PTR [rsi+0x18]
     12b5b88:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     12b5b8c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     12b5b91:	e8 aa 83 53 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12b5b96:	6a 04                	push   0x4
     12b5b98:	5e                   	pop    rsi
     12b5b99:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     12b5b9e:	48 89 df             	mov    rdi,rbx
     12b5ba1:	4c 89 f2             	mov    rdx,r14
     12b5ba4:	e8 79 e4 ff ff       	call   12b4022 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf95a6>
     12b5ba9:	4c 89 f7             	mov    rdi,r14
     12b5bac:	e8 df 82 53 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12b5bb1:	eb 69                	jmp    12b5c1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb1a0>
     12b5bb3:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
     12b5bb7:	48 85 c0             	test   rax,rax
     12b5bba:	48 8d 0d 6f e3 71 00 	lea    rcx,[rip+0x71e36f]        # 19d3f30 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x9cb78>
     12b5bc1:	48 0f 45 c8          	cmovne rcx,rax
     12b5bc5:	48 63 51 20          	movsxd rdx,DWORD PTR [rcx+0x20]
     12b5bc9:	48 69 41 18 00 ca 9a 	imul   rax,QWORD PTR [rcx+0x18],0x3b9aca00
     12b5bd0:	3b 
     12b5bd1:	48 01 d0             	add    rax,rdx
     12b5bd4:	b9 40 42 0f 00       	mov    ecx,0xf4240
     12b5bd9:	48 99                	cqo
     12b5bdb:	48 f7 f9             	idiv   rcx
     12b5bde:	c7 03 07 00 00 00    	mov    DWORD PTR [rbx],0x7
     12b5be4:	48 8d 0d bd 2d 66 00 	lea    rcx,[rip+0x662dbd]        # 19189a8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5fdb8>
     12b5beb:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx
     12b5bef:	31 c9                	xor    ecx,ecx
     12b5bf1:	88 4b 10             	mov    BYTE PTR [rbx+0x10],cl
     12b5bf4:	88 4b 28             	mov    BYTE PTR [rbx+0x28],cl
     12b5bf7:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     12b5bfb:	c6 43 38 01          	mov    BYTE PTR [rbx+0x38],0x1
     12b5bff:	eb 1b                	jmp    12b5c1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb1a0>
     12b5c01:	89 13                	mov    DWORD PTR [rbx],edx
     12b5c03:	48 8d 05 9e 2d 66 00 	lea    rax,[rip+0x662d9e]        # 19189a8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5fdb8>
     12b5c0a:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     12b5c0e:	31 c0                	xor    eax,eax
     12b5c10:	88 43 10             	mov    BYTE PTR [rbx+0x10],al
     12b5c13:	88 43 28             	mov    BYTE PTR [rbx+0x28],al
     12b5c16:	88 43 30             	mov    BYTE PTR [rbx+0x30],al
     12b5c19:	88 43 38             	mov    BYTE PTR [rbx+0x38],al
     12b5c1c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12b5c23:	00 00 

### candidate 0x12e5bb8; FDE=(19815338, 19815364)
     12e5b81:	c3                   	ret
     12e5b82:	48 89 c3             	mov    rbx,rax
     12e5b85:	48 89 e7             	mov    rdi,rsp
     12e5b88:	e8 3d 47 79 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     12e5b8d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12e5b94:	00 00 
     12e5b96:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     12e5b9b:	75 08                	jne    12e5ba5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12b129>
     12e5b9d:	48 89 df             	mov    rdi,rbx
     12e5ba0:	e8 2b a1 78 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     12e5ba5:	e8 06 9f 50 00       	call   17efab0 <__stack_chk_fail@plt>
     12e5baa:	48 8d 47 08          	lea    rax,[rdi+0x8]
     12e5bae:	48 8d 0d fb d4 57 00 	lea    rcx,[rip+0x57d4fb]        # 18630b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f798>
     12e5bb5:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     12e5bb8:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
     12e5bbc:	48 89 c6             	mov    rsi,rax
     12e5bbf:	e9 dc 3e 89 ff       	jmp    b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
     12e5bc4:	41 56                	push   r14
     12e5bc6:	53                   	push   rbx
     12e5bc7:	48 83 ec 38          	sub    rsp,0x38
     12e5bcb:	48 89 d3             	mov    rbx,rdx
     12e5bce:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12e5bd5:	00 00 
     12e5bd7:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     12e5bdc:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     12e5be0:	48 83 c7 10          	add    rdi,0x10
     12e5be4:	e8 55 27 88 ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
     12e5be9:	84 c0                	test   al,al
     12e5beb:	0f 85 87 00 00 00    	jne    12e5c78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12b1fc>
     12e5bf1:	8b 1b                	mov    ebx,DWORD PTR [rbx]
     12e5bf3:	81 fb c8 00 00 00    	cmp    ebx,0xc8
     12e5bf9:	75 55                	jne    12e5c50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12b1d4>
     12e5bfb:	49 8b 5e 08          	mov    rbx,QWORD PTR [r14+0x8]
     12e5bff:	49 8d 76 20          	lea    rsi,[r14+0x20]
     12e5c03:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     12e5c08:	e8 33 83 50 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12e5c0d:	48 89 e7             	mov    rdi,rsp
     12e5c10:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     12e5c15:	6a 01                	push   0x1
     12e5c17:	5a                   	pop    rdx
     12e5c18:	e8 3b 18 7c ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
     12e5c1d:	41 0f b6 4e 38       	movzx  ecx,BYTE PTR [r14+0x38]
     12e5c22:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
     12e5c26:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
     12e5c2b:	48 89 df             	mov    rdi,rbx
     12e5c2e:	e8 9d f5 ff ff       	call   12e51d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12a754>
     12e5c33:	48 89 e7             	mov    rdi,rsp
     12e5c36:	e8 ad 59 79 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     12e5c3b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     12e5c40:	e8 4b 82 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12e5c45:	49 8b 7e 60          	mov    rdi,QWORD PTR [r14+0x60]
     12e5c49:	e8 14 48 79 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
     12e5c4e:	eb 28                	jmp    12e5c78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12b1fc>
     12e5c50:	48 8d 35 20 f5 03 ff 	lea    rsi,[rip+0xffffffffff03f520]        # 325177 <_ZTSSt12bad_any_cast@@Base-0x6b051>
     12e5c57:	48 89 e7             	mov    rdi,rsp

### candidate 0x1303876; FDE=(19937174, 19938842)
     130383c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1303841:	e8 fa a6 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1303846:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     130384b:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
     1303850:	48 89 fe             	mov    rsi,rdi
     1303853:	48 89 da             	mov    rdx,rbx
     1303856:	e8 d3 0c 00 00       	call   130452e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x149ab2>
     130385b:	48 89 df             	mov    rdi,rbx
     130385e:	e8 2d a6 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1303863:	41 8b 44 24 48       	mov    eax,DWORD PTR [r12+0x48]
     1303868:	83 f8 01             	cmp    eax,0x1
     130386b:	75 30                	jne    130389d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148e21>
     130386d:	49 8b 74 24 40       	mov    rsi,QWORD PTR [r12+0x40]
     1303872:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1303876:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     130387b:	e8 c0 a6 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1303880:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1303885:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
     130388a:	48 89 fe             	mov    rsi,rdi
     130388d:	48 89 da             	mov    rdx,rbx
     1303890:	e8 b3 0c 00 00       	call   1304548 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x149acc>
     1303895:	48 89 df             	mov    rdi,rbx
     1303898:	e8 f3 a5 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     130389d:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
     13038a2:	41 8b 44 24 10       	mov    eax,DWORD PTR [r12+0x10]
     13038a7:	a8 01                	test   al,0x1
     13038a9:	74 16                	je     13038c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148e45>
     13038ab:	49 8b 74 24 18       	mov    rsi,QWORD PTR [r12+0x18]
     13038b0:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     13038b4:	48 89 df             	mov    rdi,rbx
     13038b7:	e8 7e ea 7f ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     13038bc:	41 8b 44 24 10       	mov    eax,DWORD PTR [r12+0x10]
     13038c1:	a8 02                	test   al,0x2
     13038c3:	74 18                	je     13038dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148e61>
     13038c5:	49 8b 74 24 20       	mov    rsi,QWORD PTR [r12+0x20]
     13038ca:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     13038ce:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     13038d3:	e8 62 ea 7f ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     13038d8:	41 8b 44 24 10       	mov    eax,DWORD PTR [r12+0x10]
     13038dd:	a8 08                	test   al,0x8
     13038df:	74 14                	je     13038f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148e79>
     13038e1:	41 8b 4c 24 30       	mov    ecx,DWORD PTR [r12+0x30]
     13038e6:	89 8c 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],ecx
     13038ed:	c6 84 24 84 00 00 00 	mov    BYTE PTR [rsp+0x84],0x1
     13038f4:	01 
     13038f5:	48 8d ac 24 88 00 00 	lea    rbp,[rsp+0x88]
     13038fc:	00 
     13038fd:	a8 04                	test   al,0x4
     13038ff:	74 16                	je     1303917 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148e9b>
     1303901:	49 8b 74 24 28       	mov    rsi,QWORD PTR [r12+0x28]
     1303906:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     130390a:	48 89 ef             	mov    rdi,rbp
     130390d:	e8 28 ea 7f ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1303912:	41 8b 44 24 10       	mov    eax,DWORD PTR [r12+0x10]
     1303917:	a8 10                	test   al,0x10

### candidate 0x132ab2c; FDE=(20097818, 20097861)
     132ab00:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     132ab03:	48 8d 0d 5a 19 75 ff 	lea    rcx,[rip+0xffffffffff75195a]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     132ab0a:	48 89 4f 10          	mov    QWORD PTR [rdi+0x10],rcx
     132ab0e:	48 8d 0d b5 2b 00 00 	lea    rcx,[rip+0x2bb5]        # 132d6ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x172c4e>
     132ab15:	48 89 4f 18          	mov    QWORD PTR [rdi+0x18],rcx
     132ab19:	c3                   	ret
     132ab1a:	83 ff 01             	cmp    edi,0x1
     132ab1d:	74 1f                	je     132ab3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1700c2>
     132ab1f:	85 ff                	test   edi,edi
     132ab21:	75 21                	jne    132ab44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1700c8>
     132ab23:	53                   	push   rbx
     132ab24:	48 8b 1e             	mov    rbx,QWORD PTR [rsi]
     132ab27:	48 85 db             	test   rbx,rbx
     132ab2a:	74 09                	je     132ab35 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1700b9>
     132ab2c:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
     132ab30:	e8 1f ec 2b 00       	call   15e9754 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ecd8>
     132ab35:	48 89 df             	mov    rdi,rbx
     132ab38:	5b                   	pop    rbx
     132ab39:	e9 e2 33 4c 00       	jmp    17edf20 <_ZdlPv@plt>
     132ab3e:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     132ab41:	48 89 06             	mov    QWORD PTR [rsi],rax
     132ab44:	c3                   	ret
     132ab45:	cc                   	int3
     132ab46:	41 56                	push   r14
     132ab48:	53                   	push   rbx
     132ab49:	48 83 ec 48          	sub    rsp,0x48
     132ab4d:	48 89 fb             	mov    rbx,rdi
     132ab50:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     132ab57:	00 00 
     132ab59:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     132ab5e:	83 7a 30 06          	cmp    DWORD PTR [rdx+0x30],0x6
     132ab62:	75 79                	jne    132abdd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x170161>
     132ab64:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     132ab67:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     132ab6c:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
     132ab70:	48 83 c2 18          	add    rdx,0x18
     132ab74:	4c 89 f7             	mov    rdi,r14
     132ab77:	48 89 d6             	mov    rsi,rdx
     132ab7a:	e8 c1 33 4c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     132ab7f:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     132ab85:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
     132ab8b:	6a 20                	push   0x20
     132ab8d:	5f                   	pop    rdi
     132ab8e:	e8 6d 33 4c 00       	call   17edf00 <_Znwm@plt>
     132ab93:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
     132ab97:	48 89 08             	mov    QWORD PTR [rax],rcx
     132ab9a:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
     132ab9e:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     132aba2:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     132aba6:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     132abaa:	0f 57 c0             	xorps  xmm0,xmm0
     132abad:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     132abb1:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     132abb6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     132abbb:	48 8d 05 4a 5b 81 ff 	lea    rax,[rip+0xffffffffff815b4a]        # b4070c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d6ac>

### candidate 0x132ccf8; FDE=(20106098, 20106907)
     132ccb5:	48 8d 05 44 ad 55 00 	lea    rax,[rip+0x55ad44]        # 1887a00 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x6d8>
     132ccbc:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     132ccc0:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     132ccc4:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0
     132ccc8:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
     132cccc:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     132ccd1:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
     132ccd6:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
     132ccdb:	48 8d 05 f6 c7 57 00 	lea    rax,[rip+0x57c7f6]        # 18a94d8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x16418>
     132cce2:	49 89 07             	mov    QWORD PTR [r15],rax
     132cce5:	48 8d 05 0c 2b 11 ff 	lea    rax,[rip+0xffffffffff112b0c]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     132ccec:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     132ccf0:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     132ccf4:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     132ccf8:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     132ccfd:	e8 34 eb 74 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     132cd02:	49 89 d0             	mov    r8,rdx
     132cd05:	4d 8b 14 24          	mov    r10,QWORD PTR [r12]
     132cd09:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     132cd10:	00 
     132cd11:	4c 89 e6             	mov    rsi,r12
     132cd14:	ba b7 00 00 00       	mov    edx,0xb7
     132cd19:	48 89 c1             	mov    rcx,rax
     132cd1c:	4d 89 f9             	mov    r9,r15
     132cd1f:	41 ff 52 30          	call   QWORD PTR [r10+0x30]
     132cd23:	80 bc 24 88 00 00 00 	cmp    BYTE PTR [rsp+0x88],0x1
     132cd2a:	01 
     132cd2b:	75 7d                	jne    132cdaa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17232e>
     132cd2d:	4c 8d 7b 20          	lea    r15,[rbx+0x20]
     132cd31:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     132cd36:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
     132cd3d:	00 
     132cd3e:	4c 89 fa             	mov    rdx,r15
     132cd41:	e8 10 b8 83 ff       	call   b68556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54f6>
     132cd46:	84 c0                	test   al,al
     132cd48:	74 60                	je     132cdaa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17232e>
     132cd4a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     132cd4f:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     132cd54:	e8 e7 11 4c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     132cd59:	48 89 d8             	mov    rax,rbx
     132cd5c:	48 83 c0 18          	add    rax,0x18
     132cd60:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     132cd65:	66 c7 46 18 b7 00    	mov    WORD PTR [rsi+0x18],0xb7
     132cd6b:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
     132cd70:	48 89 02             	mov    QWORD PTR [rdx],rax
     132cd73:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
     132cd77:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     132cd7e:	00 
     132cd7f:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
     132cd83:	4c 89 f7             	mov    rdi,r14
     132cd86:	e8 a3 dc fe ff       	call   131aa2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ffb2>
     132cd8b:	89 c5                	mov    ebp,eax
     132cd8d:	48 89 df             	mov    rdi,rbx
     132cd90:	e8 f1 16 77 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     132cd95:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]

### candidate 0x143848d; FDE=(21202020, 21202398)
     1438464:	55                   	push   rbp
     1438465:	41 57                	push   r15
     1438467:	41 56                	push   r14
     1438469:	41 55                	push   r13
     143846b:	41 54                	push   r12
     143846d:	53                   	push   rbx
     143846e:	48 83 ec 28          	sub    rsp,0x28
     1438472:	49 89 d4             	mov    r12,rdx
     1438475:	49 89 fe             	mov    r14,rdi
     1438478:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     143847f:	00 00 
     1438481:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1438486:	48 8b 72 58          	mov    rsi,QWORD PTR [rdx+0x58]
     143848a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     143848d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1438492:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1438495:	49 8b 6c 24 30       	mov    rbp,QWORD PTR [r12+0x30]
     143849a:	6a 28                	push   0x28
     143849c:	5f                   	pop    rdi
     143849d:	e8 5e 5a 3b 00       	call   17edf00 <_Znwm@plt>
     14384a2:	48 89 c3             	mov    rbx,rax
     14384a5:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     14384a9:	48 8d 05 98 8c 43 00 	lea    rax,[rip+0x438c98]        # 1871148 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d830>
     14384b0:	48 89 03             	mov    QWORD PTR [rbx],rax
     14384b3:	4c 8d 7b 20          	lea    r15,[rbx+0x20]
     14384b7:	0f 57 c0             	xorps  xmm0,xmm0
     14384ba:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
     14384be:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
     14384c3:	6a 20                	push   0x20
     14384c5:	5f                   	pop    rdi
     14384c6:	e8 35 5a 3b 00       	call   17edf00 <_Znwm@plt>
     14384cb:	49 89 c5             	mov    r13,rax
     14384ce:	48 8d 05 ab 8c 43 00 	lea    rax,[rip+0x438cab]        # 1871180 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d868>
     14384d5:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14384d9:	4c 89 ef             	mov    rdi,r13
     14384dc:	48 83 c7 08          	add    rdi,0x8
     14384e0:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     14384e5:	e8 56 5a 3b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14384ea:	49 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [r12+0xa0]
     14384f1:	00 
     14384f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14384f5:	4c 89 ee             	mov    rsi,r13
     14384f8:	ff 50 30             	call   QWORD PTR [rax+0x30]
     14384fb:	49 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [r12+0xa0]
     1438502:	00 
     1438503:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1438506:	48 89 ee             	mov    rsi,rbp
     1438509:	ff 50 40             	call   QWORD PTR [rax+0x40]
     143850c:	48 89 d8             	mov    rax,rbx
     143850f:	48 83 c0 10          	add    rax,0x10
     1438513:	41 0f 28 84 24 a0 00 	movaps xmm0,XMMWORD PTR [r12+0xa0]
     143851a:	00 00 
     143851c:	49 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [r12+0xa8]
     1438523:	00 
     1438524:	48 85 c9             	test   rcx,rcx

### candidate 0x14389df; FDE=(21203338, 21203617)
     14389a3:	00 00 
     14389a5:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     14389ac:	00 
     14389ad:	48 83 64 24 58 00    	and    QWORD PTR [rsp+0x58],0x0
     14389b3:	48 89 fb             	mov    rbx,rdi
     14389b6:	48 8d 05 93 89 43 00 	lea    rax,[rip+0x438993]        # 1871350 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2da38>
     14389bd:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     14389c2:	0f 57 c0             	xorps  xmm0,xmm0
     14389c5:	0f 11 44 24 60       	movups XMMWORD PTR [rsp+0x60],xmm0
     14389ca:	83 64 24 2c 00       	and    DWORD PTR [rsp+0x2c],0x0
     14389cf:	4c 8b 7e 20          	mov    r15,QWORD PTR [rsi+0x20]
     14389d3:	48 8b 72 18          	mov    rsi,QWORD PTR [rdx+0x18]
     14389d7:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     14389db:	44 8b 62 20          	mov    r12d,DWORD PTR [rdx+0x20]
     14389df:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14389e4:	e8 57 55 3b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14389e9:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     14389ee:	4c 89 66 18          	mov    QWORD PTR [rsi+0x18],r12
     14389f2:	48 8d 4c 24 70       	lea    rcx,[rsp+0x70]
     14389f7:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
     14389fc:	31 c0                	xor    eax,eax
     14389fe:	4c 8d 44 24 30       	lea    r8,[rsp+0x30]
     1438a03:	41 88 00             	mov    BYTE PTR [r8],al
     1438a06:	41 88 40 18          	mov    BYTE PTR [r8+0x18],al
     1438a0a:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1438a0d:	48 8d 54 24 2c       	lea    rdx,[rsp+0x2c]
     1438a12:	4c 89 ff             	mov    rdi,r15
     1438a15:	ff 50 20             	call   QWORD PTR [rax+0x20]
     1438a18:	89 c5                	mov    ebp,eax
     1438a1a:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
     1438a1f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1438a24:	e8 07 e3 66 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1438a29:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1438a2e:	e8 37 15 64 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1438a33:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1438a38:	e8 53 54 3b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1438a3d:	41 88 6f 10          	mov    BYTE PTR [r15+0x10],bpl
     1438a41:	8b 44 24 2c          	mov    eax,DWORD PTR [rsp+0x2c]
     1438a45:	41 89 47 14          	mov    DWORD PTR [r15+0x14],eax
     1438a49:	41 c7 47 08 03 00 00 	mov    DWORD PTR [r15+0x8],0x3
     1438a50:	00 
     1438a51:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     1438a54:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     1438a59:	e8 fe 8d 1a 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
     1438a5e:	48 89 df             	mov    rdi,rbx
     1438a61:	e8 cb 8c 1a 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
     1438a66:	4c 89 ff             	mov    rdi,r15
     1438a69:	e8 9a 1f 67 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     1438a6e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1438a75:	00 00 
     1438a77:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
     1438a7e:	00 
     1438a7f:	75 13                	jne    1438a94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27e018>
     1438a81:	48 89 d8             	mov    rax,rbx
     1438a84:	48 81 c4 b0 00 00 00 	add    rsp,0xb0

### candidate 0x144ee2b; FDE=(21294488, 21294674)
     144ee03:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     144ee0a:	00 00 
     144ee0c:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     144ee11:	75 3a                	jne    144ee4d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2943d1>
     144ee13:	48 83 c4 68          	add    rsp,0x68
     144ee17:	5b                   	pop    rbx
     144ee18:	41 5c                	pop    r12
     144ee1a:	41 5e                	pop    r14
     144ee1c:	41 5f                	pop    r15
     144ee1e:	c3                   	ret
     144ee1f:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     144ee23:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     144ee26:	eb b3                	jmp    144eddb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29435f>
     144ee28:	48 89 c3             	mov    rbx,rax
     144ee2b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     144ee30:	e8 db c4 00 00       	call   145b310 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a0894>
     144ee35:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     144ee3c:	00 00 
     144ee3e:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     144ee43:	75 08                	jne    144ee4d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2943d1>
     144ee45:	48 89 df             	mov    rdi,rbx
     144ee48:	e8 83 0e 62 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     144ee4d:	e8 5e 0c 3a 00       	call   17efab0 <__stack_chk_fail@plt>
     144ee52:	41 56                	push   r14
     144ee54:	53                   	push   rbx
     144ee55:	50                   	push   rax
     144ee56:	49 89 f6             	mov    r14,rsi
     144ee59:	48 89 fb             	mov    rbx,rdi
     144ee5c:	e8 df f0 39 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     144ee61:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     144ee65:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     144ee69:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
     144ee6d:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     144ee71:	48 85 c0             	test   rax,rax
     144ee74:	74 05                	je     144ee7b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2943ff>
     144ee76:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     144ee7b:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
     144ee7f:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     144ee83:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
     144ee87:	49 8d 76 30          	lea    rsi,[r14+0x30]
     144ee8b:	e8 b2 99 6f ff       	call   b48842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x957e2>
     144ee90:	49 8b 46 48          	mov    rax,QWORD PTR [r14+0x48]
     144ee94:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     144ee98:	49 8b 46 50          	mov    rax,QWORD PTR [r14+0x50]
     144ee9c:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
     144eea0:	48 85 c0             	test   rax,rax
     144eea3:	74 05                	je     144eeaa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29442e>
     144eea5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     144eeaa:	48 83 c4 08          	add    rsp,0x8
     144eeae:	5b                   	pop    rbx
     144eeaf:	41 5e                	pop    r14
     144eeb1:	c3                   	ret
     144eeb2:	49 89 c6             	mov    r14,rax
     144eeb5:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     144eeb9:	e8 c8 f5 64 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### candidate 0x1475bfa; FDE=(21453769, 21453994)
     1475bc4:	e8 dc 3e 60 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1475bc9:	41 57                	push   r15
     1475bcb:	41 56                	push   r14
     1475bcd:	53                   	push   rbx
     1475bce:	48 83 ec 40          	sub    rsp,0x40
     1475bd2:	49 89 d7             	mov    r15,rdx
     1475bd5:	49 89 f6             	mov    r14,rsi
     1475bd8:	48 89 fb             	mov    rbx,rdi
     1475bdb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1475be2:	00 00 
     1475be4:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     1475be9:	48 8d 15 b7 55 ee fe 	lea    rdx,[rip+0xfffffffffeee55b7]        # 35b1a7 <_ZTSSt12bad_any_cast@@Base-0x35021>
     1475bf0:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1475bf5:	e8 cb fb 67 ff       	call   af57c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x42765>
     1475bfa:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1475bff:	4c 89 fe             	mov    rsi,r15
     1475c02:	e8 29 8f 37 00       	call   17eeb30 <_ZNSt6__ndk19to_stringEm@plt>
     1475c07:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     1475c0c:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     1475c11:	48 89 df             	mov    rdi,rbx
     1475c14:	e8 77 05 64 ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
     1475c19:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     1475c1d:	49 8d 76 18          	lea    rsi,[r14+0x18]
     1475c21:	e8 1a 83 37 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1475c26:	41 8a 46 40          	mov    al,BYTE PTR [r14+0x40]
     1475c2a:	88 43 40             	mov    BYTE PTR [rbx+0x40],al
     1475c2d:	41 0f 10 46 30       	movups xmm0,XMMWORD PTR [r14+0x30]
     1475c32:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     1475c36:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1475c3b:	e8 50 82 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1475c40:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1475c45:	e8 46 82 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1475c4a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1475c51:	00 00 
     1475c53:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
     1475c58:	75 4b                	jne    1475ca5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb229>
     1475c5a:	48 83 c4 40          	add    rsp,0x40
     1475c5e:	5b                   	pop    rbx
     1475c5f:	41 5e                	pop    r14
     1475c61:	41 5f                	pop    r15
     1475c63:	c3                   	ret
     1475c64:	49 89 c6             	mov    r14,rax
     1475c67:	48 89 df             	mov    rdi,rbx
     1475c6a:	e8 21 82 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1475c6f:	eb 03                	jmp    1475c74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb1f8>
     1475c71:	49 89 c6             	mov    r14,rax
     1475c74:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1475c79:	e8 12 82 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1475c7e:	eb 03                	jmp    1475c83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bb207>
     1475c80:	49 89 c6             	mov    r14,rax
     1475c83:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1475c88:	e8 03 82 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1475c8d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1475c94:	00 00 
     1475c96:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]

### candidate 0x14c85fe; FDE=(21790158, 21792293)
     14c85cf:	eb 17                	jmp    14c85e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30db6c>
     14c85d1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c85d8:	00 00 
     14c85da:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14c85df:	75 3f                	jne    14c8620 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dba4>
     14c85e1:	48 8d 35 38 86 e9 fe 	lea    rsi,[rip+0xfffffffffee98638]        # 360c20 <_ZTSSt12bad_any_cast@@Base-0x2f5a8>
     14c85e8:	48 89 df             	mov    rdi,rbx
     14c85eb:	e8 8e 14 5b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14c85f0:	48 89 d8             	mov    rax,rbx
     14c85f3:	48 83 c4 28          	add    rsp,0x28
     14c85f7:	5b                   	pop    rbx
     14c85f8:	41 5e                	pop    r14
     14c85fa:	c3                   	ret
     14c85fb:	48 89 c3             	mov    rbx,rax
     14c85fe:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14c8603:	e8 88 58 32 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14c8608:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14c860f:	00 00 
     14c8611:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14c8616:	75 08                	jne    14c8620 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dba4>
     14c8618:	48 89 df             	mov    rdi,rbx
     14c861b:	e8 b0 76 5a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14c8620:	e8 8b 74 32 00       	call   17efab0 <__stack_chk_fail@plt>
     14c8625:	cc                   	int3
     14c8626:	55                   	push   rbp
     14c8627:	41 57                	push   r15
     14c8629:	41 56                	push   r14
     14c862b:	41 55                	push   r13
     14c862d:	41 54                	push   r12
     14c862f:	53                   	push   rbx
     14c8630:	50                   	push   rax
     14c8631:	44 89 cd             	mov    ebp,r9d
     14c8634:	4d 89 c4             	mov    r12,r8
     14c8637:	49 89 cd             	mov    r13,rcx
     14c863a:	49 89 d7             	mov    r15,rdx
     14c863d:	48 89 fb             	mov    rbx,rdi
     14c8640:	e8 fb 58 32 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14c8645:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14c8648:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     14c864c:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     14c8650:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     14c8654:	48 85 c0             	test   rax,rax
     14c8657:	74 05                	je     14c865e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dbe2>
     14c8659:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14c865e:	4c 8d 73 28          	lea    r14,[rbx+0x28]
     14c8662:	4c 89 f7             	mov    rdi,r14
     14c8665:	4c 89 ee             	mov    rsi,r13
     14c8668:	e8 d3 58 32 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14c866d:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     14c8672:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
     14c8676:	40 88 6b 48          	mov    BYTE PTR [rbx+0x48],bpl
     14c867a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     14c867d:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
     14c8681:	66 83 63 60 00       	and    WORD PTR [rbx+0x60],0x0
     14c8686:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]

### candidate 0x14f2289; FDE=(21963266, 21963440)
     14f2269:	00 00 
     14f226b:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14f2270:	75 39                	jne    14f22ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33782f>
     14f2272:	89 d8                	mov    eax,ebx
     14f2274:	4c 89 f2             	mov    rdx,r14
     14f2277:	48 83 c4 28          	add    rsp,0x28
     14f227b:	5b                   	pop    rbx
     14f227c:	41 5c                	pop    r12
     14f227e:	41 5d                	pop    r13
     14f2280:	41 5e                	pop    r14
     14f2282:	41 5f                	pop    r15
     14f2284:	5d                   	pop    rbp
     14f2285:	c3                   	ret
     14f2286:	48 89 c3             	mov    rbx,rax
     14f2289:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14f228e:	e8 fd bb 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14f2293:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14f229a:	00 00 
     14f229c:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14f22a1:	75 08                	jne    14f22ab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33782f>
     14f22a3:	48 89 df             	mov    rdi,rbx
     14f22a6:	e8 25 da 57 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14f22ab:	e8 00 d8 2f 00       	call   17efab0 <__stack_chk_fail@plt>
     14f22b0:	55                   	push   rbp
     14f22b1:	41 57                	push   r15
     14f22b3:	41 56                	push   r14
     14f22b5:	41 55                	push   r13
     14f22b7:	41 54                	push   r12
     14f22b9:	53                   	push   rbx
     14f22ba:	48 83 ec 38          	sub    rsp,0x38
     14f22be:	4c 89 cb             	mov    rbx,r9
     14f22c1:	4d 89 c6             	mov    r14,r8
     14f22c4:	49 89 cf             	mov    r15,rcx
     14f22c7:	49 89 d4             	mov    r12,rdx
     14f22ca:	49 89 fd             	mov    r13,rdi
     14f22cd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14f22d4:	00 00 
     14f22d6:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     14f22db:	48 8d 6c 24 18       	lea    rbp,[rsp+0x18]
     14f22e0:	48 89 ef             	mov    rdi,rbp
     14f22e3:	e8 58 bc 2f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14f22e8:	48 89 e7             	mov    rdi,rsp
     14f22eb:	6a 01                	push   0x1
     14f22ed:	5a                   	pop    rdx
     14f22ee:	48 89 ee             	mov    rsi,rbp
     14f22f1:	e8 62 51 5b ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
     14f22f6:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     14f22fa:	48 89 e6             	mov    rsi,rsp
     14f22fd:	4c 89 ef             	mov    rdi,r13
     14f2300:	4c 89 e2             	mov    rdx,r12
     14f2303:	4c 89 f9             	mov    rcx,r15
     14f2306:	4d 89 f0             	mov    r8,r14
     14f2309:	49 89 d9             	mov    r9,rbx
     14f230c:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14f230f:	89 c3                	mov    ebx,eax

### candidate 0x15ec027; FDE=(22986756, 22986872)
     15ebff1:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     15ebff5:	e8 70 df 48 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     15ebffa:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     15ebffe:	5b                   	pop    rbx
     15ebfff:	e9 82 24 4b ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     15ec004:	41 56                	push   r14
     15ec006:	53                   	push   rbx
     15ec007:	48 83 ec 28          	sub    rsp,0x28
     15ec00b:	48 89 fb             	mov    rbx,rdi
     15ec00e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15ec015:	00 00 
     15ec017:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     15ec01c:	4c 8b 77 40          	mov    r14,QWORD PTR [rdi+0x40]
     15ec020:	48 8d b7 a8 00 00 00 	lea    rsi,[rdi+0xa8]
     15ec027:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     15ec02c:	e8 0f 1f 20 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     15ec031:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     15ec035:	48 83 c3 48          	add    rbx,0x48
     15ec039:	48 8d 4c 24 08       	lea    rcx,[rsp+0x8]
     15ec03e:	4c 89 f6             	mov    rsi,r14
     15ec041:	48 89 da             	mov    rdx,rbx
     15ec044:	e8 c1 55 4f ff       	call   ae160a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2e5aa>
     15ec049:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     15ec04e:	e8 3d 1e 20 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15ec053:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15ec05a:	00 00 
     15ec05c:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     15ec061:	75 08                	jne    15ec06b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4315ef>
     15ec063:	48 83 c4 28          	add    rsp,0x28
     15ec067:	5b                   	pop    rbx
     15ec068:	41 5e                	pop    r14
     15ec06a:	c3                   	ret
     15ec06b:	e8 40 3a 20 00       	call   17efab0 <__stack_chk_fail@plt>
     15ec070:	48 89 c7             	mov    rdi,rax
     15ec073:	e8 2d da 48 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     15ec078:	31 d2                	xor    edx,edx
     15ec07a:	e9 b3 e3 ff ff       	jmp    15ea432 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f9b6>
     15ec07f:	cc                   	int3
     15ec080:	c7 07 02 00 00 00    	mov    DWORD PTR [rdi],0x2
     15ec086:	31 c0                	xor    eax,eax
     15ec088:	88 47 08             	mov    BYTE PTR [rdi+0x8],al
     15ec08b:	88 47 58             	mov    BYTE PTR [rdi+0x58],al
     15ec08e:	b9 10 27 00 00       	mov    ecx,0x2710
     15ec093:	48 89 4f 60          	mov    QWORD PTR [rdi+0x60],rcx
     15ec097:	48 89 4f 68          	mov    QWORD PTR [rdi+0x68],rcx
     15ec09b:	88 47 70             	mov    BYTE PTR [rdi+0x70],al
     15ec09e:	88 47 78             	mov    BYTE PTR [rdi+0x78],al
     15ec0a1:	66 c7 87 80 00 00 00 	mov    WORD PTR [rdi+0x80],0x1
     15ec0a8:	01 00 
     15ec0aa:	88 87 82 00 00 00    	mov    BYTE PTR [rdi+0x82],al
     15ec0b0:	48 83 8f 88 00 00 00 	or     QWORD PTR [rdi+0x88],0xffffffffffffffff
     15ec0b7:	ff 
     15ec0b8:	88 87 90 00 00 00    	mov    BYTE PTR [rdi+0x90],al
     15ec0be:	c3                   	ret
     15ec0bf:	cc                   	int3

### candidate 0x161076c; FDE=(23136076, 23136174)
     1610743:	48 89 df             	mov    rdi,rbx
     1610746:	e8 85 f5 45 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     161074b:	cc                   	int3
     161074c:	41 57                	push   r15
     161074e:	41 56                	push   r14
     1610750:	53                   	push   rbx
     1610751:	49 89 d7             	mov    r15,rdx
     1610754:	48 89 fb             	mov    rbx,rdi
     1610757:	6a 58                	push   0x58
     1610759:	5f                   	pop    rdi
     161075a:	e8 a1 d7 1d 00       	call   17edf00 <_Znwm@plt>
     161075f:	49 89 c6             	mov    r14,rax
     1610762:	48 8d 05 5f b9 27 00 	lea    rax,[rip+0x27b95f]        # 188c0c8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4da0>
     1610769:	49 89 06             	mov    QWORD PTR [r14],rax
     161076c:	49 8d 7e 08          	lea    rdi,[r14+0x8]
     1610770:	4c 89 fe             	mov    rsi,r15
     1610773:	e8 c8 d7 1d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1610778:	0f 57 c0             	xorps  xmm0,xmm0
     161077b:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     1610780:	49 83 66 50 00       	and    QWORD PTR [r14+0x50],0x0
     1610785:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
     161078a:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     161078f:	4c 89 33             	mov    QWORD PTR [rbx],r14
     1610792:	48 89 d8             	mov    rax,rbx
     1610795:	5b                   	pop    rbx
     1610796:	41 5e                	pop    r14
     1610798:	41 5f                	pop    r15
     161079a:	c3                   	ret
     161079b:	48 89 c3             	mov    rbx,rax
     161079e:	4c 89 f7             	mov    rdi,r14
     16107a1:	e8 7a d7 1d 00       	call   17edf20 <_ZdlPv@plt>
     16107a6:	48 89 df             	mov    rdi,rbx
     16107a9:	e8 22 f5 45 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     16107ae:	55                   	push   rbp
     16107af:	41 57                	push   r15
     16107b1:	41 56                	push   r14
     16107b3:	41 54                	push   r12
     16107b5:	53                   	push   rbx
     16107b6:	48 83 ec 20          	sub    rsp,0x20
     16107ba:	49 89 d7             	mov    r15,rdx
     16107bd:	49 89 f4             	mov    r12,rsi
     16107c0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     16107c7:	00 00 
     16107c9:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     16107ce:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     16107d2:	49 8d 9e 90 00 00 00 	lea    rbx,[r14+0x90]
     16107d9:	48 89 df             	mov    rdi,rbx
     16107dc:	e8 0f d9 1d 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     16107e1:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     16107e5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     16107ea:	4c 89 e6             	mov    rsi,r12
     16107ed:	ff 50 18             	call   QWORD PTR [rax+0x18]
     16107f0:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     16107f5:	48 89 df             	mov    rdi,rbx
     16107f8:	e8 23 11 00 00       	call   1611920 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xca8e>

### candidate 0x167a112; FDE=(23567859, 23569218)
     167a0d6:	e8 b5 3d 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     167a0db:	83 7d 48 0c          	cmp    DWORD PTR [rbp+0x48],0xc
     167a0df:	75 06                	jne    167a0e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e253>
     167a0e1:	4c 8b 75 40          	mov    r14,QWORD PTR [rbp+0x40]
     167a0e5:	eb 07                	jmp    167a0ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e25a>
     167a0e7:	4c 8d 35 aa 4a 32 00 	lea    r14,[rip+0x324aaa]        # 199eb98 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x677e0>
     167a0ee:	49 8b 76 20          	mov    rsi,QWORD PTR [r14+0x20]
     167a0f2:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     167a0f6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     167a0fb:	e8 40 3e 17 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     167a100:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
     167a104:	48 85 c0             	test   rax,rax
     167a107:	48 8d 35 92 1b 32 00 	lea    rsi,[rip+0x321b92]        # 199bca0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x648e8>
     167a10e:	48 0f 45 f0          	cmovne rsi,rax
     167a112:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     167a117:	e8 a8 5b 10 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
     167a11c:	0f 57 c0             	xorps  xmm0,xmm0
     167a11f:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     167a124:	0f 29 47 50          	movaps XMMWORD PTR [rdi+0x50],xmm0
     167a128:	0f 29 47 40          	movaps XMMWORD PTR [rdi+0x40],xmm0
     167a12c:	0f 29 47 30          	movaps XMMWORD PTR [rdi+0x30],xmm0
     167a130:	0f 29 47 20          	movaps XMMWORD PTR [rdi+0x20],xmm0
     167a134:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
     167a138:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     167a13b:	e8 e4 ad 12 00       	call   17a4f24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x159090>
     167a140:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     167a145:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     167a14a:	e8 f1 3d 17 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     167a14f:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     167a154:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     167a159:	e8 e4 01 00 00       	call   167a342 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4ae>
     167a15e:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     167a163:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     167a168:	e8 d3 3d 17 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     167a16d:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
     167a172:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
     167a177:	4c 89 f7             	mov    rdi,r14
     167a17a:	4c 89 fe             	mov    rsi,r15
     167a17d:	e8 c0 01 00 00       	call   167a342 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4ae>
     167a182:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
     167a189:	00 
     167a18a:	4c 89 f7             	mov    rdi,r14
     167a18d:	4c 89 e6             	mov    rsi,r12
     167a190:	e8 0d c0 12 00       	call   17a61a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a30e>
     167a195:	4c 89 ff             	mov    rdi,r15
     167a198:	e8 f3 3c 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     167a19d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     167a1a2:	e8 e9 3c 17 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     167a1a7:	41 0f 28 04 24       	movaps xmm0,XMMWORD PTR [r12]
     167a1ac:	0f 57 c9             	xorps  xmm1,xmm1
     167a1af:	41 0f 29 0e          	movaps XMMWORD PTR [r14],xmm1
     167a1b3:	41 0f 29 4e 10       	movaps XMMWORD PTR [r14+0x10],xmm1
     167a1b8:	41 0f 29 4e 20       	movaps XMMWORD PTR [r14+0x20],xmm1
     167a1bd:	41 c7 46 38 4f 00 00 	mov    DWORD PTR [r14+0x38],0x4f
     167a1c4:	00 

### candidate 0x168a7a5; FDE=(23635304, 23643831)
     168a75f:	49 8d 86 c0 01 00 00 	lea    rax,[r14+0x1c0]
     168a766:	66 0f ef c0          	pxor   xmm0,xmm0
     168a76a:	f3 41 0f 7f 86 c0 01 	movdqu XMMWORD PTR [r14+0x1c0],xmm0
     168a771:	00 00 
     168a773:	49 89 86 b8 01 00 00 	mov    QWORD PTR [r14+0x1b8],rax
     168a77a:	41 88 ae d0 01 00 00 	mov    BYTE PTR [r14+0x1d0],bpl
     168a781:	49 83 a6 d8 01 00 00 	and    QWORD PTR [r14+0x1d8],0x0
     168a788:	00 
     168a789:	bf 10 02 00 00       	mov    edi,0x210
     168a78e:	e8 6d 37 16 00       	call   17edf00 <_Znwm@plt>
     168a793:	49 89 c5             	mov    r13,rax
     168a796:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     168a79a:	49 8b ae b0 00 00 00 	mov    rbp,QWORD PTR [r14+0xb0]
     168a7a1:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     168a7a5:	49 8d 7d 08          	lea    rdi,[r13+0x8]
     168a7a9:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     168a7ae:	e8 8d 37 16 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     168a7b3:	4d 89 65 20          	mov    QWORD PTR [r13+0x20],r12
     168a7b7:	49 89 6d 28          	mov    QWORD PTR [r13+0x28],rbp
     168a7bb:	48 8d 05 fe f5 20 00 	lea    rax,[rip+0x20f5fe]        # 1899dc0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x6d00>
     168a7c2:	49 89 45 30          	mov    QWORD PTR [r13+0x30],rax
     168a7c6:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
     168a7ca:	49 89 45 38          	mov    QWORD PTR [r13+0x38],rax
     168a7ce:	49 c7 45 40 02 00 00 	mov    QWORD PTR [r13+0x40],0x2
     168a7d5:	00 
     168a7d6:	49 8d 45 78          	lea    rax,[r13+0x78]
     168a7da:	66 0f ef c0          	pxor   xmm0,xmm0
     168a7de:	f3 41 0f 7f 45 48    	movdqu XMMWORD PTR [r13+0x48],xmm0
     168a7e4:	f3 41 0f 7f 45 58    	movdqu XMMWORD PTR [r13+0x58],xmm0
     168a7ea:	f3 41 0f 7f 45 68    	movdqu XMMWORD PTR [r13+0x68],xmm0
     168a7f0:	4d 89 6d 78          	mov    QWORD PTR [r13+0x78],r13
     168a7f4:	49 89 85 80 00 00 00 	mov    QWORD PTR [r13+0x80],rax
     168a7fb:	49 89 85 88 00 00 00 	mov    QWORD PTR [r13+0x88],rax
     168a802:	41 83 a5 90 00 00 00 	and    DWORD PTR [r13+0x90],0x0
     168a809:	00 
     168a80a:	4d 01 ef             	add    r15,r13
     168a80d:	ba b0 00 00 00       	mov    edx,0xb0
     168a812:	4c 89 ff             	mov    rdi,r15
     168a815:	31 f6                	xor    esi,esi
     168a817:	e8 74 43 16 00       	call   17eeb90 <memset@plt>
     168a81c:	41 83 8d 48 01 00 00 	or     DWORD PTR [r13+0x148],0xffffffff
     168a823:	ff 
     168a824:	49 bc 00 00 00 00 00 	movabs r12,0xbff0000000000000
     168a82b:	00 f0 bf 
     168a82e:	4d 89 a5 50 01 00 00 	mov    QWORD PTR [r13+0x150],r12
     168a835:	41 83 8d 58 01 00 00 	or     DWORD PTR [r13+0x158],0xffffffff
     168a83c:	ff 
     168a83d:	49 8d bd 60 01 00 00 	lea    rdi,[r13+0x160]
     168a844:	ba b0 00 00 00       	mov    edx,0xb0
     168a849:	31 f6                	xor    esi,esi
     168a84b:	e8 40 43 16 00       	call   17eeb90 <memset@plt>
     168a850:	bf e8 00 00 00       	mov    edi,0xe8
     168a855:	e8 a6 36 16 00       	call   17edf00 <_Znwm@plt>
     168a85a:	49 89 c7             	mov    r15,rax
     168a85d:	4c 89 28             	mov    QWORD PTR [rax],r13

## Primary AP 0x1841fc0 materializations
### 0xefc6de; FDE=(15700428, 15722027)
      efc6a1:	48 8d 05 30 5b 94 00 	lea    rax,[rip+0x945b30]        # 18421d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14170>
      efc6a8:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efc6ac:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
      efc6b2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efc6b9:	48 85 ff             	test   rdi,rdi
      efc6bc:	74 05                	je     efc6c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3ad9>
      efc6be:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efc6c3:	48 8d 05 36 5b 94 00 	lea    rax,[rip+0x945b36]        # 1842200 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14198>
      efc6ca:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efc6ce:	48 8d 05 13 5d 94 00 	lea    rax,[rip+0x945d13]        # 18423e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14380>
      efc6d5:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efc6d9:	e8 a8 1d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc6de:	48 8d 05 db 58 94 00 	lea    rax,[rip+0x9458db]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
      efc6e5:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efc6e9:	48 8d 05 c0 5a 94 00 	lea    rax,[rip+0x945ac0]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
      efc6f0:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efc6f4:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
      efc6fb:	00 
      efc6fc:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
      efc701:	4d 89 7e 58          	mov    QWORD PTR [r14+0x58],r15
      efc705:	4c 89 f7             	mov    rdi,r14
      efc708:	48 83 c7 60          	add    rdi,0x60
      efc70c:	e8 e5 d2 8d 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      efc711:	31 c0                	xor    eax,eax
      efc713:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al
      efc717:	41 88 86 80 00 00 00 	mov    BYTE PTR [r14+0x80],al
      efc71e:	31 ff                	xor    edi,edi
      efc720:	e8 61 1d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc725:	4c 8d bc 24 10 07 00 	lea    r15,[rsp+0x710]
      efc72c:	00 
      efc72d:	4c 89 ff             	mov    rdi,r15
      efc730:	48 89 de             	mov    rsi,rbx
      efc733:	4c 89 f2             	mov    rdx,r14
      efc736:	e8 c9 20 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efc73b:	31 ff                	xor    edi,edi

### 0xfd47ed; FDE=(16599014, 16599079)
      fd47cb:	00 
      fd47cc:	e8 e1 9c ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      fd47d1:	eb 03                	jmp    fd47d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbec>
      fd47d3:	48 89 c3             	mov    rbx,rax
      fd47d6:	48 89 df             	mov    rdi,rbx
      fd47d9:	e8 c7 52 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fd47de:	48 89 c7             	mov    rdi,rax
      fd47e1:	e8 bf 52 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fd47e6:	41 56                	push   r14
      fd47e8:	53                   	push   rbx
      fd47e9:	50                   	push   rax
      fd47ea:	48 89 fb             	mov    rbx,rdi
      fd47ed:	48 8d 05 cc d7 86 00 	lea    rax,[rip+0x86d7cc]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
      fd47f4:	48 89 07             	mov    QWORD PTR [rdi],rax
      fd47f7:	4c 8d 77 08          	lea    r14,[rdi+0x8]
      fd47fb:	48 8d 05 ae d9 86 00 	lea    rax,[rip+0x86d9ae]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
      fd4802:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      fd4806:	48 8b 7f 50          	mov    rdi,QWORD PTR [rdi+0x50]
      fd480a:	e8 77 9c ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd480f:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      fd4813:	e8 6e 9c ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4818:	4c 89 f7             	mov    rdi,r14
      fd481b:	48 83 c4 08          	add    rsp,0x8
      fd481f:	5b                   	pop    rbx
      fd4820:	41 5e                	pop    r14
      fd4822:	e9 79 05 00 00       	jmp    fd4da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1b6>
      fd4827:	cc                   	int3
      fd4828:	53                   	push   rbx
      fd4829:	48 89 fb             	mov    rbx,rdi
      fd482c:	e8 b5 ff ff ff       	call   fd47e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbfc>
      fd4831:	48 89 df             	mov    rdi,rbx
      fd4834:	5b                   	pop    rbx
      fd4835:	e9 e6 96 81 00       	jmp    17edf20 <_ZdlPv@plt>
      fd483a:	55                   	push   rbp
      fd483b:	41 57                	push   r15

### 0xfd4c74; FDE=(16600068, 16600319)
      fd4c45:	0f 57 c0             	xorps  xmm0,xmm0
      fd4c48:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fd4c4c:	48 8d 0d 6d 5b 86 00 	lea    rcx,[rip+0x865b6d]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fd4c53:	48 89 08             	mov    QWORD PTR [rax],rcx
      fd4c56:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      fd4c5a:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
      fd4c5e:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      fd4c62:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
      fd4c66:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      fd4c6a:	48 85 c9             	test   rcx,rcx
      fd4c6d:	74 05                	je     fd4c74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c08a>
      fd4c6f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fd4c74:	48 8d 0d 45 d3 86 00 	lea    rcx,[rip+0x86d345]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
      fd4c7b:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
      fd4c7f:	48 8d 0d 2a d5 86 00 	lea    rcx,[rip+0x86d52a]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
      fd4c86:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
      fd4c8a:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
      fd4c8e:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
      fd4c92:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
      fd4c96:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
      fd4c9a:	48 85 c9             	test   rcx,rcx
      fd4c9d:	74 05                	je     fd4ca4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c0ba>
      fd4c9f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fd4ca4:	48 83 c0 18          	add    rax,0x18
      fd4ca8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
      fd4cac:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx
      fd4cb0:	49 8b 4e 48          	mov    rcx,QWORD PTR [r14+0x48]
      fd4cb4:	48 89 4a 60          	mov    QWORD PTR [rdx+0x60],rcx
      fd4cb8:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
      fd4cbc:	48 89 4a 68          	mov    QWORD PTR [rdx+0x68],rcx
      fd4cc0:	48 85 c9             	test   rcx,rcx
      fd4cc3:	74 05                	je     fd4cca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c0e0>
      fd4cc5:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fd4cca:	49 8b 4e 68          	mov    rcx,QWORD PTR [r14+0x68]
      fd4cce:	48 89 8a 80 00 00 00 	mov    QWORD PTR [rdx+0x80],rcx

## Relocation slots at +0x1d8 that resolve to fd4a92
- slot 0x1842198 -> fd4a92, implied AP 0x1841fc0

## All +0x1d8 indirect calls and nearby receiver provenance in d8-family
### 0xd8a5d7; FDE=(14198210, 14198250)
      d8a5ad:	e8 be ff ff ff       	call   d8a570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x575f6>
      d8a5b2:	48 89 df             	mov    rdi,rbx
      d8a5b5:	5b                   	pop    rbx
      d8a5b6:	e9 65 39 a6 00       	jmp    17edf20 <_ZdlPv@plt>
      d8a5bb:	48 8b 02             	mov    rax,QWORD PTR [rdx]
      d8a5be:	48 89 06             	mov    QWORD PTR [rsi],rax
      d8a5c1:	c3                   	ret
      d8a5c2:	53                   	push   rbx
      d8a5c3:	48 89 f1             	mov    rcx,rsi
      d8a5c6:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      d8a5c9:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      d8a5cc:	48 8d 73 08          	lea    rsi,[rbx+0x8]
      d8a5d0:	0f b6 53 20          	movzx  edx,BYTE PTR [rbx+0x20]
      d8a5d4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d8a5d7:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
      d8a5dd:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
      d8a5e1:	6a 01                	push   0x1
      d8a5e3:	5e                   	pop    rsi
      d8a5e4:	5b                   	pop    rbx
      d8a5e5:	e9 76 e3 df ff       	jmp    b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
      d8a5ea:	55                   	push   rbp
      d8a5eb:	41 57                	push   r15
      d8a5ed:	41 56                	push   r14
      d8a5ef:	53                   	push   rbx
      d8a5f0:	50                   	push   rax
      d8a5f1:	48 81 c7 e0 04 00 00 	add    rdi,0x4e0
      d8a5f8:	e8 2f f4 ff ff       	call   d89a2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ab2>
      d8a5fd:	31 db                	xor    ebx,ebx
      d8a5ff:	48 85 c0             	test   rax,rax
      d8a602:	74 2d                	je     d8a631 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x576b7>
      d8a604:	4c 8b 30             	mov    r14,QWORD PTR [rax]
      d8a607:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      d8a60b:	4d 39 fe             	cmp    r14,r15
      d8a60e:	74 21                	je     d8a631 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x576b7>
      d8a610:	6a 02                	push   0x2
      d8a612:	5b                   	pop    rbx
      d8a613:	6a 01                	push   0x1

