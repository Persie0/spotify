# Candidate 0x1817068 dependency field trace

Candidate class allocation/materialization: 0xc2c5f6 / vptr 0x1817068.
+0x28 method 0xa7a004 returns [this+0x10].

## Constructor region c2c5e0..c2cdf0

/tmp/c1817068/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000c2c5e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179580>:
  c2c5e0:	00 48 89             	add    BYTE PTR [rax-0x77],cl
  c2c5e3:	df e8                	fucomip st,st(0)
  c2c5e5:	bb 52 fe ff 48       	mov    ebx,0x48fffe52
  c2c5ea:	89 c5                	mov    ebp,eax
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
  c2c686:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
  c2c68d:	00 
  c2c68e:	48 8d 05 2b 00 be 00 	lea    rax,[rip+0xbe002b]        # 180c6c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2380>
  c2c695:	48 89 03             	mov    QWORD PTR [rbx],rax
  c2c698:	6a 20                	push   0x20
  c2c69a:	5f                   	pop    rdi
  c2c69b:	e8 60 18 bc 00       	call   17edf00 <_Znwm@plt>
  c2c6a0:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
  c2c6a5:	49 8d 8f c8 00 00 00 	lea    rcx,[r15+0xc8]
  c2c6ac:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
  c2c6b1:	66 0f ef c0          	pxor   xmm0,xmm0
  c2c6b5:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  c2c6ba:	48 8d 0d a7 0d bd 00 	lea    rcx,[rip+0xbd0da7]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  c2c6c1:	48 89 08             	mov    QWORD PTR [rax],rcx
  c2c6c4:	48 8d 0d 15 af be 00 	lea    rcx,[rip+0xbeaf15]        # 18175e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd2a0>
  c2c6cb:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
  c2c6cf:	66 48 0f 6e c0       	movq   xmm0,rax
  c2c6d4:	48 83 c0 18          	add    rax,0x18
  c2c6d8:	66 48 0f 6e c8       	movq   xmm1,rax
  c2c6dd:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  c2c6e1:	f3 0f 7f 4b 08       	movdqu XMMWORD PTR [rbx+0x8],xmm1
  c2c6e6:	49 89 9f c8 00 00 00 	mov    QWORD PTR [r15+0xc8],rbx
  c2c6ed:	49 8d af d8 00 00 00 	lea    rbp,[r15+0xd8]
  c2c6f4:	48 89 ef             	mov    rdi,rbp
  c2c6f7:	e8 2e 90 f3 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
  c2c6fc:	48 8d 94 24 e0 01 00 	lea    rdx,[rsp+0x1e0]
  c2c703:	00 
  c2c704:	c6 02 00             	mov    BYTE PTR [rdx],0x0
  c2c707:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  c2c70b:	48 8d 35 ce 7f db 00 	lea    rsi,[rip+0xdb7fce]        # 19e46e0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1110>
  c2c712:	e8 47 10 f6 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
  c2c717:	88 44 24 10          	mov    BYTE PTR [rsp+0x10],al
  c2c71b:	f3 41 0f 6f 84 24 d8 	movdqu xmm0,XMMWORD PTR [r12+0xd8]
  c2c722:	00 00 00 
  c2c725:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
  c2c72c:	00 
  c2c72d:	e8 dd 51 fe ff       	call   c1190f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e8af>
  c2c732:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  c2c735:	48 8d 35 c4 d1 79 ff 	lea    rsi,[rip+0xffffffffff79d1c4]        # 3c9900 <_ZTSN5boost9exceptionE@@Base+0x2a2e2>
  c2c73c:	48 8d 0d dd d1 79 ff 	lea    rcx,[rip+0xffffffffff79d1dd]        # 3c9920 <_ZTSN5boost9exceptionE@@Base+0x2a302>
  c2c743:	6a 17                	push   0x17
  c2c745:	5b                   	pop    rbx
  c2c746:	6a 23                	push   0x23
  c2c748:	41 58                	pop    r8
  c2c74a:	48 89 da             	mov    rdx,rbx
  c2c74d:	45 31 c9             	xor    r9d,r9d
  c2c750:	e8 09 ae 9b 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c2c755:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  c2c758:	4c 8d 2d f1 d1 79 ff 	lea    r13,[rip+0xffffffffff79d1f1]        # 3c9950 <_ZTSN5boost9exceptionE@@Base+0x2a332>
  c2c75f:	48 8d 0d 0a d2 79 ff 	lea    rcx,[rip+0xffffffffff79d20a]        # 3c9970 <_ZTSN5boost9exceptionE@@Base+0x2a352>
  c2c766:	6a 36                	push   0x36
  c2c768:	41 5c                	pop    r12
  c2c76a:	4c 89 ee             	mov    rsi,r13
  c2c76d:	48 89 da             	mov    rdx,rbx
  c2c770:	4d 89 e0             	mov    r8,r12
  c2c773:	45 31 c9             	xor    r9d,r9d
  c2c776:	e8 e3 ad 9b 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c2c77b:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  c2c77e:	48 8d 35 7b d1 79 ff 	lea    rsi,[rip+0xffffffffff79d17b]        # 3c9900 <_ZTSN5boost9exceptionE@@Base+0x2a2e2>
  c2c785:	48 89 da             	mov    rdx,rbx
  c2c788:	48 8d 0d 91 d1 79 ff 	lea    rcx,[rip+0xffffffffff79d191]        # 3c9920 <_ZTSN5boost9exceptionE@@Base+0x2a302>
  c2c78f:	6a 23                	push   0x23
  c2c791:	41 58                	pop    r8
  c2c793:	45 31 c9             	xor    r9d,r9d
  c2c796:	e8 ef ab 9b 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  c2c79b:	88 44 24 07          	mov    BYTE PTR [rsp+0x7],al
  c2c79f:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  c2c7a2:	4c 89 ee             	mov    rsi,r13
  c2c7a5:	48 89 da             	mov    rdx,rbx
  c2c7a8:	48 8d 0d c1 d1 79 ff 	lea    rcx,[rip+0xffffffffff79d1c1]        # 3c9970 <_ZTSN5boost9exceptionE@@Base+0x2a352>
  c2c7af:	4d 89 e0             	mov    r8,r12
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
  c2c836:	48 8d 35 8a 03 75 ff 	lea    rsi,[rip+0xffffffffff75038a]        # 37cbc7 <_ZTSSt12bad_any_cast@@Base-0x13601>
  c2c83d:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
  c2c844:	00 
  c2c845:	e8 34 d2 e4 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c2c84a:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
  c2c84f:	49 8b 07             	mov    rax,QWORD PTR [r15]
  c2c852:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
  c2c859:	00 
  c2c85a:	48 8d 94 24 18 01 00 	lea    rdx,[rsp+0x118]
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
  c2c972:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
  c2c979:	00 
  c2c97a:	e8 47 27 98 00       	call   15af0c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f464a>
  c2c97f:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
  c2c986:	00 
  c2c987:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
  c2c98e:	00 
  c2c98f:	e8 ac 15 bc 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  c2c994:	8a 44 24 10          	mov    al,BYTE PTR [rsp+0x10]
  c2c998:	88 84 24 f8 01 00 00 	mov    BYTE PTR [rsp+0x1f8],al
  c2c99f:	31 c0                	xor    eax,eax
  c2c9a1:	88 84 24 00 02 00 00 	mov    BYTE PTR [rsp+0x200],al
  c2c9a8:	88 84 24 18 02 00 00 	mov    BYTE PTR [rsp+0x218],al
  c2c9af:	38 84 24 88 01 00 00 	cmp    BYTE PTR [rsp+0x188],al
  c2c9b6:	0f 84 2c 01 00 00    	je     c2cae8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a88>
  c2c9bc:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
  c2c9c3:	00 
  c2c9c4:	48 8d ac 24 08 02 00 	lea    rbp,[rsp+0x208]
  c2c9cb:	00 
  c2c9cc:	66 0f ef c0          	pxor   xmm0,xmm0
  c2c9d0:	f3 0f 7f 45 00       	movdqu XMMWORD PTR [rbp+0x0],xmm0
  c2c9d5:	48 89 6d f8          	mov    QWORD PTR [rbp-0x8],rbp
  c2c9d9:	48 8d 9c 24 78 01 00 	lea    rbx,[rsp+0x178]
  c2c9e0:	00 
  c2c9e1:	4c 8b 73 f8          	mov    r14,QWORD PTR [rbx-0x8]
  c2c9e5:	49 39 de             	cmp    r14,rbx
  c2c9e8:	0f 84 ea 00 00 00    	je     c2cad8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a78>
  c2c9ee:	48 39 ac 24 00 02 00 	cmp    QWORD PTR [rsp+0x200],rbp
  c2c9f5:	00 
  c2c9f6:	74 4e                	je     c2ca46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1799e6>
  c2c9f8:	48 89 ef             	mov    rdi,rbp
  c2c9fb:	e8 10 31 eb ff       	call   adfb10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cab0>
  c2ca00:	49 89 c5             	mov    r13,rax
  c2ca03:	41 8b 46 1c          	mov    eax,DWORD PTR [r14+0x1c]
  c2ca07:	4c 8b a4 24 08 02 00 	mov    r12,QWORD PTR [rsp+0x208]
  c2ca0e:	00 
  c2ca0f:	41 39 45 1c          	cmp    DWORD PTR [r13+0x1c],eax
  c2ca13:	7c 3c                	jl     c2ca51 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1799f1>
  c2ca15:	4d 85 e4             	test   r12,r12
  c2ca18:	74 49                	je     c2ca63 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a03>
  c2ca1a:	4c 89 e1             	mov    rcx,r12
  c2ca1d:	49 89 cd             	mov    r13,rcx
  c2ca20:	8b 49 1c             	mov    ecx,DWORD PTR [rcx+0x1c]
  c2ca23:	39 c8                	cmp    eax,ecx
  c2ca25:	7d 0e                	jge    c2ca35 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1799d5>
  c2ca27:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
  c2ca2b:	48 85 c9             	test   rcx,rcx
  c2ca2e:	75 ed                	jne    c2ca1d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1799bd>
  c2ca30:	e9 9e 00 00 00       	jmp    c2cad3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a73>
  c2ca35:	0f 8e 82 00 00 00    	jle    c2cabd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a5d>
  c2ca3b:	49 8b 4d 08          	mov    rcx,QWORD PTR [r13+0x8]
  c2ca3f:	48 85 c9             	test   rcx,rcx
  c2ca42:	75 d9                	jne    c2ca1d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1799bd>
  c2ca44:	eb 17                	jmp    c2ca5d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1799fd>
  c2ca46:	4c 8b a4 24 08 02 00 	mov    r12,QWORD PTR [rsp+0x208]
  c2ca4d:	00 
  c2ca4e:	49 89 ed             	mov    r13,rbp
  c2ca51:	4d 85 e4             	test   r12,r12
  c2ca54:	74 0d                	je     c2ca63 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a03>
  c2ca56:	49 83 7d 08 00       	cmp    QWORD PTR [r13+0x8],0x0
  c2ca5b:	75 60                	jne    c2cabd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a5d>
  c2ca5d:	4d 8d 7d 08          	lea    r15,[r13+0x8]
  c2ca61:	eb 09                	jmp    c2ca6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a0c>
  c2ca63:	45 31 e4             	xor    r12d,r12d
  c2ca66:	49 89 ed             	mov    r13,rbp
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
  c2cab0:	e8 69 d5 e7 ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
  c2cab5:	48 ff 84 24 10 02 00 	inc    QWORD PTR [rsp+0x210]
  c2cabc:	00 
  c2cabd:	4c 89 f7             	mov    rdi,r14
  c2cac0:	e8 1d 1d e7 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
  c2cac5:	49 89 c6             	mov    r14,rax
  c2cac8:	48 39 d8             	cmp    rax,rbx
  c2cacb:	0f 85 1d ff ff ff    	jne    c2c9ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17998e>
  c2cad1:	eb 05                	jmp    c2cad8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a78>
  c2cad3:	4d 89 ef             	mov    r15,r13
  c2cad6:	eb 94                	jmp    c2ca6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a0c>
  c2cad8:	c6 84 24 18 02 00 00 	mov    BYTE PTR [rsp+0x218],0x1
  c2cadf:	01 
  c2cae0:	4c 8b a4 24 98 00 00 	mov    r12,QWORD PTR [rsp+0x98]
  c2cae7:	00 
  c2cae8:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  c2caed:	48 8b 18             	mov    rbx,QWORD PTR [rax]
  c2caf0:	bf 20 01 00 00       	mov    edi,0x120
  c2caf5:	e8 06 14 bc 00       	call   17edf00 <_Znwm@plt>
  c2cafa:	49 89 c6             	mov    r14,rax
  c2cafd:	48 8d 05 e4 7c c5 00 	lea    rax,[rip+0xc57ce4]        # 18847e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40ed0>
  c2cb04:	49 89 06             	mov    QWORD PTR [r14],rax
  c2cb07:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  c2cb0c:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  c2cb10:	49 8d 7e 10          	lea    rdi,[r14+0x10]
  c2cb14:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
  c2cb1b:	00 
  c2cb1c:	e8 6f d7 e4 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  c2cb21:	4d 89 66 40          	mov    QWORD PTR [r14+0x40],r12
  c2cb25:	49 83 66 48 00       	and    QWORD PTR [r14+0x48],0x0
  c2cb2a:	49 83 66 58 00       	and    QWORD PTR [r14+0x58],0x0
  c2cb2f:	48 8b 84 24 40 02 00 	mov    rax,QWORD PTR [rsp+0x240]
  c2cb36:	00 
  c2cb37:	48 85 c0             	test   rax,rax
  c2cb3a:	74 2a                	je     c2cb66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179b06>
  c2cb3c:	49 8d 76 48          	lea    rsi,[r14+0x48]
  c2cb40:	49 89 46 58          	mov    QWORD PTR [r14+0x58],rax
  c2cb44:	6a 01                	push   0x1
  c2cb46:	5f                   	pop    rdi
  c2cb47:	48 8d 94 24 30 02 00 	lea    rdx,[rsp+0x230]
  c2cb4e:	00 
  c2cb4f:	ff d0                	call   rax
  c2cb51:	48 8b 84 24 48 02 00 	mov    rax,QWORD PTR [rsp+0x248]
  c2cb58:	00 
  c2cb59:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
  c2cb5d:	48 83 a4 24 40 02 00 	and    QWORD PTR [rsp+0x240],0x0
  c2cb64:	00 00 
  c2cb66:	66 0f ef c0          	pxor   xmm0,xmm0
  c2cb6a:	f3 41 0f 7f 46 78    	movdqu XMMWORD PTR [r14+0x78],xmm0
  c2cb70:	f3 41 0f 7f 46 68    	movdqu XMMWORD PTR [r14+0x68],xmm0
  c2cb76:	b8 00 00 80 3f       	mov    eax,0x3f800000
  c2cb7b:	41 89 86 88 00 00 00 	mov    DWORD PTR [r14+0x88],eax
  c2cb82:	66 41 0f 7f 86 90 00 	movdqa XMMWORD PTR [r14+0x90],xmm0
  c2cb89:	00 00 
  c2cb8b:	66 41 0f 7f 86 a0 00 	movdqa XMMWORD PTR [r14+0xa0],xmm0
  c2cb92:	00 00 
  c2cb94:	41 89 86 b0 00 00 00 	mov    DWORD PTR [r14+0xb0],eax
  c2cb9b:	48 8b 84 24 38 01 00 	mov    rax,QWORD PTR [rsp+0x138]
  c2cba2:	00 
  c2cba3:	0f 28 8c 24 30 01 00 	movaps xmm1,XMMWORD PTR [rsp+0x130]
  c2cbaa:	00 
  c2cbab:	41 0f 11 8e b8 00 00 	movups XMMWORD PTR [r14+0xb8],xmm1
  c2cbb2:	00 
  c2cbb3:	48 85 c0             	test   rax,rax
  c2cbb6:	74 05                	je     c2cbbd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179b5d>
  c2cbb8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  c2cbbd:	48 8b 84 24 f0 01 00 	mov    rax,QWORD PTR [rsp+0x1f0]
  c2cbc4:	00 
  c2cbc5:	49 89 86 d8 00 00 00 	mov    QWORD PTR [r14+0xd8],rax
  c2cbcc:	66 0f 6f 8c 24 e0 01 	movdqa xmm1,XMMWORD PTR [rsp+0x1e0]
  c2cbd3:	00 00 
  c2cbd5:	f3 41 0f 7f 8e c8 00 	movdqu XMMWORD PTR [r14+0xc8],xmm1
  c2cbdc:	00 00 
  c2cbde:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
  c2cbe5:	00 00 
  c2cbe7:	66 0f 7f 84 24 e0 01 	movdqa XMMWORD PTR [rsp+0x1e0],xmm0
  c2cbee:	00 00 
  c2cbf0:	8a 84 24 f8 01 00 00 	mov    al,BYTE PTR [rsp+0x1f8]
  c2cbf7:	41 88 86 e0 00 00 00 	mov    BYTE PTR [r14+0xe0],al
  c2cbfe:	31 c0                	xor    eax,eax
  c2cc00:	41 88 86 e8 00 00 00 	mov    BYTE PTR [r14+0xe8],al
  c2cc07:	41 88 86 00 01 00 00 	mov    BYTE PTR [r14+0x100],al
  c2cc0e:	38 84 24 18 02 00 00 	cmp    BYTE PTR [rsp+0x218],al
  c2cc15:	74 60                	je     c2cc77 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179c17>
  c2cc17:	48 8b 84 24 00 02 00 	mov    rax,QWORD PTR [rsp+0x200]
  c2cc1e:	00 
  c2cc1f:	49 89 86 e8 00 00 00 	mov    QWORD PTR [r14+0xe8],rax
  c2cc26:	4c 89 f0             	mov    rax,r14
  c2cc29:	48 05 f0 00 00 00    	add    rax,0xf0
  c2cc2f:	48 8b 8c 24 08 02 00 	mov    rcx,QWORD PTR [rsp+0x208]
  c2cc36:	00 
  c2cc37:	49 89 8e f0 00 00 00 	mov    QWORD PTR [r14+0xf0],rcx
  c2cc3e:	48 8b 94 24 10 02 00 	mov    rdx,QWORD PTR [rsp+0x210]
  c2cc45:	00 
  c2cc46:	49 89 96 f8 00 00 00 	mov    QWORD PTR [r14+0xf8],rdx
  c2cc4d:	48 85 d2             	test   rdx,rdx
  c2cc50:	74 16                	je     c2cc68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179c08>
  c2cc52:	48 8d 94 24 08 02 00 	lea    rdx,[rsp+0x208]
  c2cc59:	00 
  c2cc5a:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
  c2cc5e:	48 89 52 f8          	mov    QWORD PTR [rdx-0x8],rdx
  c2cc62:	f3 0f 7f 02          	movdqu XMMWORD PTR [rdx],xmm0
  c2cc66:	eb 07                	jmp    c2cc6f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179c0f>
  c2cc68:	49 89 86 e8 00 00 00 	mov    QWORD PTR [r14+0xe8],rax
  c2cc6f:	41 c6 86 00 01 00 00 	mov    BYTE PTR [r14+0x100],0x1
  c2cc76:	01 
  c2cc77:	49 89 9e 08 01 00 00 	mov    QWORD PTR [r14+0x108],rbx
  c2cc7e:	49 83 a6 10 01 00 00 	and    QWORD PTR [r14+0x110],0x0
  c2cc85:	00 
  c2cc86:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
  c2cc8b:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  c2cc8e:	4c 89 30             	mov    QWORD PTR [rax],r14
  c2cc91:	48 85 ff             	test   rdi,rdi
  c2cc94:	74 06                	je     c2cc9c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179c3c>
  c2cc96:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c2cc99:	ff 50 08             	call   QWORD PTR [rax+0x8]
  c2cc9c:	48 8d ac 24 e0 01 00 	lea    rbp,[rsp+0x1e0]
  c2cca3:	00 
  c2cca4:	48 89 ef             	mov    rdi,rbp
  c2cca7:	e8 d8 14 00 00       	call   c2e184 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b124>
  c2ccac:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
  c2ccb3:	00 
  c2ccb4:	e8 ef 14 00 00       	call   c2e1a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b148>
  c2ccb9:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
  c2ccbf:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  c2ccc6:	e8 e7 17 e7 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  c2cccb:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
  c2ccd2:	00 
  c2ccd3:	e8 ae 17 e7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c2ccd8:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
  c2ccdf:	00 
  c2cce0:	e8 a1 17 e7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c2cce5:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
  c2ccec:	00 
  c2cced:	e8 9e 11 bc 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c2ccf2:	8a 44 24 07          	mov    al,BYTE PTR [rsp+0x7]
  c2ccf6:	22 44 24 10          	and    al,BYTE PTR [rsp+0x10]
  c2ccfa:	3c 01                	cmp    al,0x1
  c2ccfc:	75 66                	jne    c2cd64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179d04>
  c2ccfe:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
  c2cd03:	4c 8b 30             	mov    r14,QWORD PTR [rax]
  c2cd06:	bf d0 00 00 00       	mov    edi,0xd0
  c2cd0b:	e8 f0 11 bc 00       	call   17edf00 <_Znwm@plt>
  c2cd10:	48 89 c3             	mov    rbx,rax
  c2cd13:	48 8d 05 f6 a8 be 00 	lea    rax,[rip+0xbea8f6]        # 1817610 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd2d0>
  c2cd1a:	48 89 03             	mov    QWORD PTR [rbx],rax
  c2cd1d:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
  c2cd21:	e8 68 b5 ef ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  c2cd26:	48 8d 05 1b a9 be 00 	lea    rax,[rip+0xbea91b]        # 1817648 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd308>
  c2cd2d:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
  c2cd34:	00 
  c2cd35:	48 89 9c 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rbx
  c2cd3c:	00 
  c2cd3d:	48 89 ac 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rbp
  c2cd44:	00 
  c2cd45:	48 89 df             	mov    rdi,rbx
  c2cd48:	48 83 c7 60          	add    rdi,0x60
  c2cd4c:	6a 0f                	push   0xf
  c2cd4e:	59                   	pop    rcx
  c2cd4f:	4c 89 f6             	mov    rsi,r14
  c2cd52:	48 89 ea             	mov    rdx,rbp
  c2cd55:	e8 54 55 99 00       	call   15c22ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x407832>
  c2cd5a:	48 89 ef             	mov    rdi,rbp
  c2cd5d:	e8 08 d2 e4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  c2cd62:	eb 15                	jmp    c2cd79 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179d19>
  c2cd64:	6a 08                	push   0x8
  c2cd66:	5f                   	pop    rdi
  c2cd67:	e8 94 11 bc 00       	call   17edf00 <_Znwm@plt>
  c2cd6c:	48 89 c3             	mov    rbx,rax
  c2cd6f:	48 8d 05 3a 1b c1 00 	lea    rax,[rip+0xc11b3a]        # 183e8b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10848>
  c2cd76:	48 89 03             	mov    QWORD PTR [rbx],rax
  c2cd79:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
  c2cd7e:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  c2cd81:	48 89 18             	mov    QWORD PTR [rax],rbx
  c2cd84:	48 85 ff             	test   rdi,rdi
  c2cd87:	74 06                	je     c2cd8f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179d2f>
  c2cd89:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c2cd8c:	ff 50 08             	call   QWORD PTR [rax+0x8]
  c2cd8f:	80 bc 24 68 01 00 00 	cmp    BYTE PTR [rsp+0x168],0x0
  c2cd96:	00 
  c2cd97:	0f 84 f4 00 00 00    	je     c2ce91 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179e31>
  c2cd9d:	4c 8d b4 24 50 02 00 	lea    r14,[rsp+0x250]
  c2cda4:	00 
  c2cda5:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  c2cdaa:	49 89 46 e0          	mov    QWORD PTR [r14-0x20],rax
  c2cdae:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  c2cdb3:	49 89 46 e8          	mov    QWORD PTR [r14-0x18],rax
  c2cdb7:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
  c2cdbe:	00 
  c2cdbf:	49 89 46 f0          	mov    QWORD PTR [r14-0x10],rax
  c2cdc3:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
  c2cdc8:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
  c2cdcc:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
  c2cdd3:	00 
  c2cdd4:	4c 89 f7             	mov    rdi,r14
  c2cdd7:	e8 d0 c3 f4 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
  c2cddc:	48 8d 05 35 4e 82 ff 	lea    rax,[rip+0xffffffffff824e35]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
  c2cde3:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
  c2cdea:	00 
  c2cdeb:	48                   	rex.W
  c2cdec:	89                   	.byte 0x89
  c2cded:	84 24 d8             	test   BYTE PTR [rax+rbx*8],ah

## Exact writes/addresses involving candidate +0x10/+0x18 in constructor region
  c2c5e5:	bb 52 fe ff 48       	mov    ebx,0x48fffe52
  c2c5ea:	89 c5                	mov    ebp,eax
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
  c2c686:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
  c2c68d:	00 
  c2c68e:	48 8d 05 2b 00 be 00 	lea    rax,[rip+0xbe002b]        # 180c6c0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2380>
  c2c695:	48 89 03             	mov    QWORD PTR [rbx],rax
  c2c698:	6a 20                	push   0x20
  c2c69a:	5f                   	pop    rdi
  c2c69b:	e8 60 18 bc 00       	call   17edf00 <_Znwm@plt>
  c2c6a0:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
  c2c6a5:	49 8d 8f c8 00 00 00 	lea    rcx,[r15+0xc8]
  c2c6ac:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
  c2c6b1:	66 0f ef c0          	pxor   xmm0,xmm0
  c2c6b5:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  c2c6ba:	48 8d 0d a7 0d bd 00 	lea    rcx,[rip+0xbd0da7]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
  c2c6c1:	48 89 08             	mov    QWORD PTR [rax],rcx
  c2c6c4:	48 8d 0d 15 af be 00 	lea    rcx,[rip+0xbeaf15]        # 18175e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd2a0>
  c2c6cb:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
  c2c6cf:	66 48 0f 6e c0       	movq   xmm0,rax
  c2c6d4:	48 83 c0 18          	add    rax,0x18
  c2c6d8:	66 48 0f 6e c8       	movq   xmm1,rax
  c2c6dd:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  c2c6e1:	f3 0f 7f 4b 08       	movdqu XMMWORD PTR [rbx+0x8],xmm1
  c2c6e6:	49 89 9f c8 00 00 00 	mov    QWORD PTR [r15+0xc8],rbx
  c2c6ed:	49 8d af d8 00 00 00 	lea    rbp,[r15+0xd8]
  c2c6f4:	48 89 ef             	mov    rdi,rbp
  c2c6f7:	e8 2e 90 f3 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
  c2c6fc:	48 8d 94 24 e0 01 00 	lea    rdx,[rsp+0x1e0]
  c2c703:	00 
  c2c704:	c6 02 00             	mov    BYTE PTR [rdx],0x0
  c2c707:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  c2c70b:	48 8d 35 ce 7f db 00 	lea    rsi,[rip+0xdb7fce]        # 19e46e0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1110>
  c2c712:	e8 47 10 f6 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
  c2c717:	88 44 24 10          	mov    BYTE PTR [rsp+0x10],al
  c2c71b:	f3 41 0f 6f 84 24 d8 	movdqu xmm0,XMMWORD PTR [r12+0xd8]
  c2c722:	00 00 00 
  c2c725:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
  c2c72c:	00 
  c2c72d:	e8 dd 51 fe ff       	call   c1190f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e8af>
  c2c732:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  c2c735:	48 8d 35 c4 d1 79 ff 	lea    rsi,[rip+0xffffffffff79d1c4]        # 3c9900 <_ZTSN5boost9exceptionE@@Base+0x2a2e2>
  c2c73c:	48 8d 0d dd d1 79 ff 	lea    rcx,[rip+0xffffffffff79d1dd]        # 3c9920 <_ZTSN5boost9exceptionE@@Base+0x2a302>
  c2c743:	6a 17                	push   0x17
  c2c745:	5b                   	pop    rbx
  c2c746:	6a 23                	push   0x23
  c2c748:	41 58                	pop    r8
  c2c74a:	48 89 da             	mov    rdx,rbx
  c2c74d:	45 31 c9             	xor    r9d,r9d
  c2c750:	e8 09 ae 9b 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  c2c755:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  c2c758:	4c 8d 2d f1 d1 79 ff 	lea    r13,[rip+0xffffffffff79d1f1]        # 3c9950 <_ZTSN5boost9exceptionE@@Base+0x2a332>
  c2c75f:	48 8d 0d 0a d2 79 ff 	lea    rcx,[rip+0xffffffffff79d20a]        # 3c9970 <_ZTSN5boost9exceptionE@@Base+0x2a352>
--
  c2c83d:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
  c2c844:	00 
  c2c845:	e8 34 d2 e4 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  c2c84a:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
  c2c84f:	49 8b 07             	mov    rax,QWORD PTR [r15]
  c2c852:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
  c2c859:	00 
  c2c85a:	48 8d 94 24 18 01 00 	lea    rdx,[rsp+0x118]
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
  c2c972:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
  c2c979:	00 
  c2c97a:	e8 47 27 98 00       	call   15af0c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f464a>
  c2c97f:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
  c2c986:	00 
  c2c987:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
  c2c98e:	00 
  c2c98f:	e8 ac 15 bc 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  c2c994:	8a 44 24 10          	mov    al,BYTE PTR [rsp+0x10]
  c2c998:	88 84 24 f8 01 00 00 	mov    BYTE PTR [rsp+0x1f8],al
  c2c99f:	31 c0                	xor    eax,eax
  c2c9a1:	88 84 24 00 02 00 00 	mov    BYTE PTR [rsp+0x200],al
  c2c9a8:	88 84 24 18 02 00 00 	mov    BYTE PTR [rsp+0x218],al
  c2c9af:	38 84 24 88 01 00 00 	cmp    BYTE PTR [rsp+0x188],al
  c2c9b6:	0f 84 2c 01 00 00    	je     c2cae8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a88>
  c2c9bc:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
  c2c9c3:	00 
  c2c9c4:	48 8d ac 24 08 02 00 	lea    rbp,[rsp+0x208]
  c2c9cb:	00 
  c2c9cc:	66 0f ef c0          	pxor   xmm0,xmm0
  c2c9d0:	f3 0f 7f 45 00       	movdqu XMMWORD PTR [rbp+0x0],xmm0
  c2c9d5:	48 89 6d f8          	mov    QWORD PTR [rbp-0x8],rbp
  c2c9d9:	48 8d 9c 24 78 01 00 	lea    rbx,[rsp+0x178]
  c2c9e0:	00 
  c2c9e1:	4c 8b 73 f8          	mov    r14,QWORD PTR [rbx-0x8]
  c2c9e5:	49 39 de             	cmp    r14,rbx
  c2c9e8:	0f 84 ea 00 00 00    	je     c2cad8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179a78>
--
  c2ca63:	45 31 e4             	xor    r12d,r12d
  c2ca66:	49 89 ed             	mov    r13,rbp
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
  c2cab0:	e8 69 d5 e7 ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
  c2cab5:	48 ff 84 24 10 02 00 	inc    QWORD PTR [rsp+0x210]
  c2cabc:	00 
  c2cabd:	4c 89 f7             	mov    rdi,r14
  c2cac0:	e8 1d 1d e7 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
  c2cac5:	49 89 c6             	mov    r14,rax
--
  c2cae7:	00 
  c2cae8:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  c2caed:	48 8b 18             	mov    rbx,QWORD PTR [rax]
  c2caf0:	bf 20 01 00 00       	mov    edi,0x120
  c2caf5:	e8 06 14 bc 00       	call   17edf00 <_Znwm@plt>
  c2cafa:	49 89 c6             	mov    r14,rax
  c2cafd:	48 8d 05 e4 7c c5 00 	lea    rax,[rip+0xc57ce4]        # 18847e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40ed0>
  c2cb04:	49 89 06             	mov    QWORD PTR [r14],rax
  c2cb07:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  c2cb0c:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  c2cb10:	49 8d 7e 10          	lea    rdi,[r14+0x10]
  c2cb14:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
  c2cb1b:	00 
  c2cb1c:	e8 6f d7 e4 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  c2cb21:	4d 89 66 40          	mov    QWORD PTR [r14+0x40],r12
  c2cb25:	49 83 66 48 00       	and    QWORD PTR [r14+0x48],0x0
  c2cb2a:	49 83 66 58 00       	and    QWORD PTR [r14+0x58],0x0
  c2cb2f:	48 8b 84 24 40 02 00 	mov    rax,QWORD PTR [rsp+0x240]
  c2cb36:	00 
  c2cb37:	48 85 c0             	test   rax,rax
  c2cb3a:	74 2a                	je     c2cb66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179b06>
  c2cb3c:	49 8d 76 48          	lea    rsi,[r14+0x48]
  c2cb40:	49 89 46 58          	mov    QWORD PTR [r14+0x58],rax
  c2cb44:	6a 01                	push   0x1
  c2cb46:	5f                   	pop    rdi
  c2cb47:	48 8d 94 24 30 02 00 	lea    rdx,[rsp+0x230]
  c2cb4e:	00 
  c2cb4f:	ff d0                	call   rax
  c2cb51:	48 8b 84 24 48 02 00 	mov    rax,QWORD PTR [rsp+0x248]
--
  c2cc2f:	48 8b 8c 24 08 02 00 	mov    rcx,QWORD PTR [rsp+0x208]
  c2cc36:	00 
  c2cc37:	49 89 8e f0 00 00 00 	mov    QWORD PTR [r14+0xf0],rcx
  c2cc3e:	48 8b 94 24 10 02 00 	mov    rdx,QWORD PTR [rsp+0x210]
  c2cc45:	00 
  c2cc46:	49 89 96 f8 00 00 00 	mov    QWORD PTR [r14+0xf8],rdx
  c2cc4d:	48 85 d2             	test   rdx,rdx
  c2cc50:	74 16                	je     c2cc68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179c08>
  c2cc52:	48 8d 94 24 08 02 00 	lea    rdx,[rsp+0x208]
  c2cc59:	00 
  c2cc5a:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
  c2cc5e:	48 89 52 f8          	mov    QWORD PTR [rdx-0x8],rdx
  c2cc62:	f3 0f 7f 02          	movdqu XMMWORD PTR [rdx],xmm0
  c2cc66:	eb 07                	jmp    c2cc6f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179c0f>
  c2cc68:	49 89 86 e8 00 00 00 	mov    QWORD PTR [r14+0xe8],rax
  c2cc6f:	41 c6 86 00 01 00 00 	mov    BYTE PTR [r14+0x100],0x1
  c2cc76:	01 
  c2cc77:	49 89 9e 08 01 00 00 	mov    QWORD PTR [r14+0x108],rbx
  c2cc7e:	49 83 a6 10 01 00 00 	and    QWORD PTR [r14+0x110],0x0
  c2cc85:	00 
  c2cc86:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
  c2cc8b:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  c2cc8e:	4c 89 30             	mov    QWORD PTR [rax],r14
  c2cc91:	48 85 ff             	test   rdi,rdi
  c2cc94:	74 06                	je     c2cc9c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179c3c>
  c2cc96:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c2cc99:	ff 50 08             	call   QWORD PTR [rax+0x8]
  c2cc9c:	48 8d ac 24 e0 01 00 	lea    rbp,[rsp+0x1e0]
  c2cca3:	00 
  c2cca4:	48 89 ef             	mov    rdi,rbp
  c2cca7:	e8 d8 14 00 00       	call   c2e184 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b124>
  c2ccac:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
  c2ccb3:	00 
  c2ccb4:	e8 ef 14 00 00       	call   c2e1a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b148>
  c2ccb9:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
  c2ccbf:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  c2ccc6:	e8 e7 17 e7 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  c2cccb:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
  c2ccd2:	00 
  c2ccd3:	e8 ae 17 e7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c2ccd8:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
  c2ccdf:	00 
  c2cce0:	e8 a1 17 e7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c2cce5:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
  c2ccec:	00 
  c2cced:	e8 9e 11 bc 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c2ccf2:	8a 44 24 07          	mov    al,BYTE PTR [rsp+0x7]
  c2ccf6:	22 44 24 10          	and    al,BYTE PTR [rsp+0x10]
  c2ccfa:	3c 01                	cmp    al,0x1
  c2ccfc:	75 66                	jne    c2cd64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x179d04>
  c2ccfe:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
  c2cd03:	4c 8b 30             	mov    r14,QWORD PTR [rax]
  c2cd06:	bf d0 00 00 00       	mov    edi,0xd0
  c2cd0b:	e8 f0 11 bc 00       	call   17edf00 <_Znwm@plt>
  c2cd10:	48 89 c3             	mov    rbx,rax
  c2cd13:	48 8d 05 f6 a8 be 00 	lea    rax,[rip+0xbea8f6]        # 1817610 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd2d0>
  c2cd1a:	48 89 03             	mov    QWORD PTR [rbx],rax
  c2cd1d:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
  c2cd21:	e8 68 b5 ef ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  c2cd26:	48 8d 05 1b a9 be 00 	lea    rax,[rip+0xbea91b]        # 1817648 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xd308>
  c2cd2d:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
  c2cd34:	00 
  c2cd35:	48 89 9c 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rbx
  c2cd3c:	00 
  c2cd3d:	48 89 ac 24 00 02 00 	mov    QWORD PTR [rsp+0x200],rbp
  c2cd44:	00 
  c2cd45:	48 89 df             	mov    rdi,rbx
  c2cd48:	48 83 c7 60          	add    rdi,0x60
  c2cd4c:	6a 0f                	push   0xf

## Candidate methods around +0x28/+0x30/+0x38

/tmp/c1817068/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000a79fc0 <JNI_OnUnload@@Base+0x188d>:
  a79fc0:	e8 00 00 00 00       	call   a79fc5 <JNI_OnUnload@@Base+0x1892>
  a79fc5:	48 8d 05 f9 ff ff ff 	lea    rax,[rip+0xfffffffffffffff9]        # a79fc5 <JNI_OnUnload@@Base+0x1892>
  a79fcc:	48 89 04 25 00 00 00 	mov    QWORD PTR ds:0x0,rax
  a79fd3:	00 
  a79fd4:	48 8d 05 8d 2e d8 00 	lea    rax,[rip+0xd82e8d]        # 17fce68 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2b88>
  a79fdb:	48 89 07             	mov    QWORD PTR [rdi],rax
  a79fde:	48 8d 05 db 2e d8 00 	lea    rax,[rip+0xd82edb]        # 17fcec0 <_ZTVN10__cxxabiv129__pointer_to_member_type_infoE@@Base+0x2be0>
  a79fe5:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
  a79fe9:	48 83 c7 10          	add    rdi,0x10
  a79fed:	e9 36 fe ff ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
  a79ff2:	53                   	push   rbx
  a79ff3:	48 89 fb             	mov    rbx,rdi
  a79ff6:	e8 d9 ff ff ff       	call   a79fd4 <JNI_OnUnload@@Base+0x18a1>
  a79ffb:	48 89 df             	mov    rdi,rbx
  a79ffe:	5b                   	pop    rbx
  a79fff:	e9 1c 3f d7 00       	jmp    17edf20 <_ZdlPv@plt>
  a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  a7a008:	c3                   	ret
  a7a009:	cc                   	int3
  a7a00a:	41 57                	push   r15
  a7a00c:	41 56                	push   r14
  a7a00e:	41 55                	push   r13
  a7a010:	41 54                	push   r12
  a7a012:	53                   	push   rbx
  a7a013:	48 83 ec 60          	sub    rsp,0x60
  a7a017:	49 89 d6             	mov    r14,rdx
  a7a01a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7a021:	00 00 
  a7a023:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
  a7a028:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  a7a02b:	ff 50 10             	call   QWORD PTR [rax+0x10]
  a7a02e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  a7a031:	48 89 c7             	mov    rdi,rax
  a7a034:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  a7a037:	49 89 c7             	mov    r15,rax
  a7a03a:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
  a7a03f:	48                   	rex.W

/tmp/c1817068/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b41170 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e110>:
  b41170:	5f                   	pop    rdi
  b41171:	ff e0                	jmp    rax
  b41173:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b4117a:	00 00 
  b4117c:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  b41181:	75 0a                	jne    b4118d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e12d>
  b41183:	48 83 c4 20          	add    rsp,0x20
  b41187:	5b                   	pop    rbx
  b41188:	41 5e                	pop    r14
  b4118a:	41 5f                	pop    r15
  b4118c:	c3                   	ret
  b4118d:	e8 1e e9 ca 00       	call   17efab0 <__stack_chk_fail@plt>
  b41192:	53                   	push   rbx
  b41193:	48 89 fb             	mov    rbx,rdi
  b41196:	e8 55 ff ff ff       	call   b410f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e090>
  b4119b:	48 89 df             	mov    rdi,rbx
  b4119e:	5b                   	pop    rbx
  b4119f:	e9 7c cd ca 00       	jmp    17edf20 <_ZdlPv@plt>
  b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
  b411a8:	c3                   	ret
  b411a9:	cc                   	int3
  b411aa:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  b411ae:	48 83 c0 20          	add    rax,0x20
  b411b2:	c3                   	ret
  b411b3:	cc                   	int3
  b411b4:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  b411b8:	e9 33 ff ff ff       	jmp    b410f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e090>
  b411bd:	cc                   	int3
  b411be:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  b411c2:	e9 cb ff ff ff       	jmp    b41192 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e132>
  b411c7:	50                   	push   rax
  b411c8:	48 8b 05 81 2c ea 00 	mov    rax,QWORD PTR [rip+0xea2c81]        # 19e3e50 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x880>
  b411cf:	48 85 c0             	test   rax,rax
  b411d2:	74 1d                	je     b411f1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8e191>
  b411d4:	48 89 f2             	mov    rdx,rsi
  b411d7:	48 89 fe             	mov    rsi,rdi
  b411da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  b411dd:	e8                   	.byte 0xe8
  b411de:	8a                   	.byte 0x8a
  b411df:	66                   	data16

/tmp/c1817068/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000c2e900 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b8a0>:
  c2e900:	e8 85 fb ff ff       	call   c2e48a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b42a>
  c2e905:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  c2e909:	e8 32 fc ff ff       	call   c2e540 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b4e0>
  c2e90e:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  c2e912:	e8 41 fc ff ff       	call   c2e558 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b4f8>
  c2e917:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
  c2e91b:	e8 08 b5 e4 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  c2e920:	48 83 c3 10          	add    rbx,0x10
  c2e924:	48 89 df             	mov    rdi,rbx
  c2e927:	5b                   	pop    rbx
  c2e928:	e9 fb b4 e4 ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
  c2e92d:	cc                   	int3
  c2e92e:	53                   	push   rbx
  c2e92f:	48 89 fb             	mov    rbx,rdi
  c2e932:	e8 87 ff ff ff       	call   c2e8be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b85e>
  c2e937:	48 89 df             	mov    rdi,rbx
  c2e93a:	5b                   	pop    rbx
  c2e93b:	e9 e0 f5 bb 00       	jmp    17edf20 <_ZdlPv@plt>
  c2e940:	48 89 f8             	mov    rax,rdi
  c2e943:	48 8b 8e b8 00 00 00 	mov    rcx,QWORD PTR [rsi+0xb8]
  c2e94a:	0f 28 86 b0 00 00 00 	movaps xmm0,XMMWORD PTR [rsi+0xb0]
  c2e951:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  c2e954:	48 85 c9             	test   rcx,rcx
  c2e957:	74 05                	je     c2e95e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b8fe>
  c2e959:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  c2e95e:	c3                   	ret
  c2e95f:	cc                   	int3
  c2e960:	48 8b 87 c8 00 00 00 	mov    rax,QWORD PTR [rdi+0xc8]
  c2e967:	c3                   	ret
  c2e968:	8a 87 d0 00 00 00    	mov    al,BYTE PTR [rdi+0xd0]
  c2e96e:	c3                   	ret
  c2e96f:	cc                   	int3
  c2e970:	41 57                	push   r15
  c2e972:	41 56                	push   r14
  c2e974:	53                   	push   rbx
  c2e975:	48 81 ec 00 01 00 00 	sub    rsp,0x100
  c2e97c:	48 89 f3             	mov    rbx,rsi
  c2e97f:	49 89 fe             	mov    r14,rdi
  c2e982:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c2e989:	00 00 
  c2e98b:	48                   	rex.W
  c2e98c:	89                   	.byte 0x89
  c2e98d:	84 24 f8             	test   BYTE PTR [rax+rdi*8],ah
